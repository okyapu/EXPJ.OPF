/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0180/src/com/nec/jp/orteus/metamorBase/AA0180/AA0180010Entity.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0180;

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

public class AA0180010Entity extends DataObject
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

	// FlashTreeクラス インスタンス
	public FlashTree mFlashTree = new FlashTree();

	// SelectDetailクラス インスタンス
	public SelectDetail mSelectDetail = new SelectDetail();

	// SelectDetailTopクラス インスタンス
	public SelectDetailTop mSelectDetailTop = new SelectDetailTop();

	// SelectSub1クラス インスタンス
	public SelectSub1 mSelectSub1 = new SelectSub1();

	// GetCompクラス インスタンス
	public GetComp mGetComp = new GetComp();

	// SelectDetail2クラス インスタンス
	public SelectDetail2 mSelectDetail2 = new SelectDetail2();

	// AppendM_PROC_GRPクラス インスタンス
	public AppendM_PROC_GRP mAppendM_PROC_GRP = new AppendM_PROC_GRP();

	// ModifyM_PROC_GRPクラス インスタンス
	public ModifyM_PROC_GRP mModifyM_PROC_GRP = new ModifyM_PROC_GRP();

	// SelectM_ITEMクラス インスタンス
	public SelectM_ITEM mSelectM_ITEM = new SelectM_ITEM();

	// checkM_PROC_GRPクラス インスタンス
	public checkM_PROC_GRP mcheckM_PROC_GRP = new checkM_PROC_GRP();

	// selectSYS_MY_COMPANYクラス インスタンス
	public selectSYS_MY_COMPANY mselectSYS_MY_COMPANY = new selectSYS_MY_COMPANY();

	// checkM_WSクラス インスタンス
	public checkM_WS mcheckM_WS = new checkM_WS();

	// checkM_VEND_CTRLクラス インスタンス
	public checkM_VEND_CTRL mcheckM_VEND_CTRL = new checkM_VEND_CTRL();

	// EraceM_PROC_GRPクラス インスタンス
	public EraceM_PROC_GRP mEraceM_PROC_GRP = new EraceM_PROC_GRP();

	// EraceM_SBCNT_UNIT_COSTクラス インスタンス
	public EraceM_SBCNT_UNIT_COST mEraceM_SBCNT_UNIT_COST = new EraceM_SBCNT_UNIT_COST();

	// EraceM_SBCNT_UNIT_COST_Hクラス インスタンス
	public EraceM_SBCNT_UNIT_COST_H mEraceM_SBCNT_UNIT_COST_H = new EraceM_SBCNT_UNIT_COST_H();

	// checkM_WS_plant_cdクラス インスタンス
	public checkM_WS_plant_cd mcheckM_WS_plant_cd = new checkM_WS_plant_cd();

	// checkM_PROC_GRP_proc_noクラス インスタンス
	public checkM_PROC_GRP_proc_no mcheckM_PROC_GRP_proc_no = new checkM_PROC_GRP_proc_no();

	// selectM_PROC_GRP_modify_countクラス インスタンス
	public selectM_PROC_GRP_modify_count mselectM_PROC_GRP_modify_count = new selectM_PROC_GRP_modify_count();

	// SelectOne_for_update_nowaitクラス インスタンス
	public SelectOne_for_update_nowait mSelectOne_for_update_nowait = new SelectOne_for_update_nowait();

	// SelectSub2クラス インスタンス
	public SelectSub2 mSelectSub2 = new SelectSub2();

	// GetParentクラス インスタンス
	public GetParent mGetParent = new GetParent();

	// selectM_PS_psUnitNumeratorクラス インスタンス
	public selectM_PS_psUnitNumerator mselectM_PS_psUnitNumerator = new selectM_PS_psUnitNumerator();

	// checkM_PS_ps_editionクラス インスタンス
	public checkM_PS_ps_edition mcheckM_PS_ps_edition = new checkM_PS_ps_edition();

	// selectSumM_PROC_GRPクラス インスタンス
	public selectSumM_PROC_GRP mselectSumM_PROC_GRP = new selectSumM_PROC_GRP();

	// checkM_BY_PRODUCTクラス インスタンス
	public checkM_BY_PRODUCT mcheckM_BY_PRODUCT = new checkM_BY_PRODUCT();

	// Select_SYS_DATE_CTRLクラス インスタンス
	public Select_SYS_DATE_CTRL mSelect_SYS_DATE_CTRL = new Select_SYS_DATE_CTRL();

	// SELECT_SYS_PARAMETERクラス インスタンス
	public SELECT_SYS_PARAMETER mSELECT_SYS_PARAMETER = new SELECT_SYS_PARAMETER();

	// SelectMANHOUR_TYPクラス インスタンス
	public SelectMANHOUR_TYP mSelectMANHOUR_TYP = new SelectMANHOUR_TYP();


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
		String m_write_fname="AA0180010.csv";

		protected WriteCsv m_writer=null;		// csv書込み用

		String m_ProjName="AA0180010";

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
		protected String m_selcmd = "SELECT "
+"  M_ITEM.\"ITEM_NAME\" AS \"ITEM_NAME\", "
+"  M_ITEM.\"STOCK_UNIT\" AS \"STOCK_UNIT\", "
+"  M_ITEM.\"MANHOUR_TYP\" AS \"MANHOUR_TYP\" "
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
		public List read(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AA0180010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AA0180010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public List read(Connection conn, AA0180010Struct data, String replaceStr)
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
		public List read(Connection conn, AA0180010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0180010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getLower_ITEM_CD());
				if(isNull(data.getLower_ITEM_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getLower_ITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AA0180010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AA0180010Struct data = new AA0180010Struct();

			data.setLower_ITEM_NAME( getString(1, rs) );
			data.setLower_STOCK_UNIT( getString(2, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
	public class FlashTree extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_ITEM.\"ITEM_NAME\" as \"ITEM_NAME\" "
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

		//{{user_implement_dev:FlashTree_def
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:FlashTree_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AA0180010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AA0180010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:FlashTree_read
                        if(m_selcmd==null) throw new FoundationException("FlashTree", "read", "クエリー未登録");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:FlashTree_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0180010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:FlashTree_read2
			if(m_selcmd==null) throw new FoundationException("FlashTree", "read", "クエリー未登録");
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
                        //}}user_implement_dev:FlashTree_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0180010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:FlashTree_read3
			if(m_selcmd==null) throw new FoundationException("FlashTree", "read", "クエリー未登録");
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
                        //}}user_implement_dev:FlashTree_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0180010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getUpper_ITEM_CD());
				if(isNull(data.getUpper_ITEM_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getUpper_ITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AA0180010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AA0180010Struct data = new AA0180010Struct();

			data.setUpper_ITEM_NAME( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("FlashTree", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:FlashTree_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("FlashTree", "check", "クエリー未登録");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:FlashTree_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:FlashTree_clear
                         // todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:FlashTree_clear

			return;
		}

		/**
		 * FlashTreeクラスの標準コンストラクタ
		 */
		public FlashTree()
		{
			//{{user_implement_dev:FlashTree_constractor
                         // TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:FlashTree_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectDetail extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_PS.\"PARENT_ITEM_CD\" as \"DetParent_ITEM_CD\", "
+"  M_ITEM_Parent.\"ITEM_NAME\" as \"DetParent_ITEM_NAME\", "
+"  M_ITEM_Parent.\"MRP_ODR_TYP\" as \"DetParent_MRP_ODR_TYP\", "
+"  M_ITEM_Parent.\"OUTSIDE_TYP\" as \"DetParent_OUTSIDE_TYP\", "
+"  M_PS.\"COMP_ITEM_CD\" as \"DetComp_ITEM_CD\", "
+"  M_ITEM_Comp.\"ITEM_NAME\" as \"DetComp_ITEM_NAME\", "
+"  M_ITEM_Comp.\"MRP_ODR_TYP\" as \"DetComp_MRP_ODR_TYP\", "
+"  M_ITEM_Comp.\"OUTSIDE_TYP\" as \"DetComp_OUTSIDE_TYP\", "
+"  M_ITEM_Comp.\"MANHOUR_TYP\" as \"Det_MANHOUR_TYP\", "
+"  M_PS.\"PS_EDITION\" as \"Det_PS_EDITION\", "
+"  to_char(M_PS.\"PS_UNIT_NUMERATOR\", 'FM99,999,999,999,990.0999') || '/' || to_char(M_PS.\"PS_UNIT_DENOMINATOR\", 'FM99,999,999,999,990.0999') as \"Det_PS_UNIT_QTY\", "
+"  M_ITEM_Comp.\"STOCK_UNIT\" as \"Det_STOCK_UNIT\", "
+"  to_char(M_PS.\"EFF_PHASE_IN_DATE\", 'YYYY/MM/DD') as \"Det_EFF_PHASE_IN_DATE\", "
+"  to_char(M_PS.\"EFF_PHASE_OUT_DATE\", 'YYYY/MM/DD') as \"Det_EFF_PHASE_OUT_DATE\", "
+"  to_char(M_PS.\"PS_SPOIL\", 'FM99990.0999') as \"Det_PS_SPOIL\", "
+"  M_PS.\"CONS_TYP\" as \"Det_CONS_TYP\", "
+"  M_PS.\"PS_LT_FLG\" as \"Det_PS_LT_FLG\", "
+"  to_char(M_PS.\"PS_FIXED_LT\") as \"Det_PS_FIXED_LT\", "
+"  to_char(M_PS.\"PS_PROP_LT\") as \"Det_PS_PROP_LT\", "
+"  to_char(M_PS.\"PS_PROP_LOT_SIZE\", 'FM99999999999990.0999') as \"Det_PS_PROP_LOT_SIZE\", "
+"  to_char(M_PS.\"PS_REF_NO\") as \"Det_PS_REF_NO\", "
+"  M_PS.\"COST_UP_TYP\" as \"Det_COST_UP_TYP\", "
+"  M_PS.\"MRP_EXP_TYP\" as \"Det_MRP_EXP_TYP\" "
+"from "
+"  M_ITEM M_ITEM_Parent, "
+"  M_ITEM M_ITEM_Comp, "
+"  M_PS M_PS "
+"where "
+"  M_ITEM_Parent.\"ITEM_CD\" = M_PS.\"PARENT_ITEM_CD\" "
+"  and M_ITEM_Comp.\"ITEM_CD\" = M_PS.\"COMP_ITEM_CD\" "
+"  and M_PS.\"PARENT_ITEM_CD\" = ? "
+"  and M_PS.\"COMP_ITEM_CD\" = ? "
+"  and M_PS.\"PS_EDITION\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectDetail_def
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectDetail_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AA0180010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AA0180010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectDetail_read
                        if(m_selcmd==null) throw new FoundationException("SelectDetail", "read", "クエリー未登録");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:SelectDetail_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0180010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectDetail_read2
			if(m_selcmd==null) throw new FoundationException("SelectDetail", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectDetail_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0180010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectDetail_read3
			if(m_selcmd==null) throw new FoundationException("SelectDetail", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectDetail_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0180010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getDetParent_ITEM_CD());
				if(isNull(data.getDetParent_ITEM_CD())) isNull = true;
				ary.addElement(data.getDetComp_ITEM_CD());
				if(isNull(data.getDetComp_ITEM_CD())) isNull = true;
				ary.addElement(data.getPS_EDITION());
				if(isNull(data.getPS_EDITION())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("SelectDetail", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getDetParent_ITEM_CD())) setString(no ++, data.getDetParent_ITEM_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getDetComp_ITEM_CD())) setString(no ++, data.getDetComp_ITEM_CD(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getPS_EDITION())) setString(no ++, data.getPS_EDITION(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AA0180010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AA0180010Struct data = new AA0180010Struct();

			data.setDetParent_ITEM_CD( getString(1, rs) );
			data.setDetParent_ITEM_NAME( getString(2, rs) );
			data.setDetParent_MRP_ODR_TYP( getString(3, rs) );
			data.setDetParent_OUTSIDE_TYP( getString(4, rs) );
			data.setDetComp_ITEM_CD( getString(5, rs) );
			data.setDetComp_ITEM_NAME( getString(6, rs) );
			data.setDetComp_MRP_ODR_TYP( getString(7, rs) );
			data.setDetComp_OUTSIDE_TYP( getString(8, rs) );
			data.setDet_MANHOUR_TYP( getString(9, rs) );
			data.setDet_PS_EDITION( getString(10, rs) );
			data.setDet_PS_UNIT_QTY( getString(11, rs) );
			data.setDet_STOCK_UNIT( getString(12, rs) );
			data.setDet_EFF_PHASE_IN_DATE( getString(13, rs) );
			data.setDet_EFF_PHASE_OUT_DATE( getString(14, rs) );
			data.setDet_PS_SPOIL( getString(15, rs) );
			data.setDet_CONS_TYP( getString(16, rs) );
			data.setDet_PS_LT_FLG( getString(17, rs) );
			data.setDet_PS_FIXED_LT( getString(18, rs) );
			data.setDet_PS_PROP_LT( getString(19, rs) );
			data.setDet_PS_PROP_LOT_SIZE( getString(20, rs) );
			data.setDet_PS_REF_NO( getString(21, rs) );
			data.setDet_COST_UP_TYP( getString(22, rs) );
			data.setDet_MRP_EXP_TYP( getString(23, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectDetail", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectDetail_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("SelectDetail", "check", "クエリー未登録");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:SelectDetail_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectDetail_clear
                         // todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectDetail_clear

			return;
		}

		/**
		 * SelectDetailクラスの標準コンストラクタ
		 */
		public SelectDetail()
		{
			//{{user_implement_dev:SelectDetail_constractor
                         // TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectDetail_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectDetailTop extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_ITEM.\"ITEM_CD\" as \"DetComp_ITEM_CD\", "
+"  M_ITEM.\"ITEM_NAME\" as \"DetComp_ITEM_NAME\", "
+"  M_ITEM.\"MRP_ODR_TYP\" as \"DetComp_MRP_ODR_TYP\", "
+"  M_ITEM.\"OUTSIDE_TYP\" as \"DetComp_OUTSIDE_TYP\", "
+"  M_ITEM.\"MANHOUR_TYP\" as \"Det_MANHOUR_TYP\", "
+"  M_ITEM.\"STOCK_UNIT\" as \"DETCOMP_STOCK_UNIT\" "
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

		//{{user_implement_dev:SelectDetailTop_def
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectDetailTop_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AA0180010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AA0180010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectDetailTop_read
                        if(m_selcmd==null) throw new FoundationException("SelectDetailTop", "read", "クエリー未登録");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:SelectDetailTop_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0180010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectDetailTop_read2
			if(m_selcmd==null) throw new FoundationException("SelectDetailTop", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectDetailTop_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0180010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectDetailTop_read3
			if(m_selcmd==null) throw new FoundationException("SelectDetailTop", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectDetailTop_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0180010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getLower_ITEM_CD());
				if(isNull(data.getLower_ITEM_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getLower_ITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AA0180010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AA0180010Struct data = new AA0180010Struct();

			data.setDetParent_ITEM_CD( getString(1, rs) );
			data.setDetParent_ITEM_NAME( getString(2, rs) );
			data.setDetParent_MRP_ODR_TYP( getString(3, rs) );
			data.setDetParent_OUTSIDE_TYP( getString(4, rs) );
			data.setDet_MANHOUR_TYP( getString(5, rs) );
			data.setDet_STOCK_UNIT( getString(6, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectDetailTop", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectDetailTop_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("SelectDetailTop", "check", "クエリー未登録");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:SelectDetailTop_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectDetailTop_clear
                         // todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectDetailTop_clear

			return;
		}

		/**
		 * SelectDetailTopクラスの標準コンストラクタ
		 */
		public SelectDetailTop()
		{
			//{{user_implement_dev:SelectDetailTop_constractor
                         // TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectDetailTop_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectSub1 extends DataObject
	{
		protected String m_selcmd = "select "
+"  M_ITEM_Parent.\"ITEM_NAME\" as \"Sub1Parent_ITEM_NAME\", "
+"  M_ITEM_Comp.\"ITEM_NAME\" as \"Sub1Comp_ITEM_NAME\", "
+"  to_char(M_PS.\"PS_UNIT_NUMERATOR\", 'FM99999999999990.0999') as \"Sub1_PS_UNIT_NUMERATOR\", "
+"  to_char(M_PS.\"PS_UNIT_DENOMINATOR\", 'FM99999999999990.0999') as \"Sub1_PS_UNIT_DENOMINATOR\", "
+"  M_ITEM_Parent.\"STOCK_UNIT\" as \"Sub1_STOCK_UNIT\", "
+"  M_ITEM_Comp.\"STOCK_UNIT\" as \"Sub1Comp_STOCK_UNIT\", "
+"  to_char(M_PS.\"EFF_PHASE_IN_DATE\", 'YYYY/MM/DD') as \"Sub1_EFF_PHASE_IN_DATE\", "
+"  to_char(M_PS.\"EFF_PHASE_OUT_DATE\", 'YYYY/MM/DD') as \"Sub1_EFF_PHASE_OUT_DATE\", "
+"  to_char(M_PS.\"PS_SPOIL\", 'FM99990.0999') as \"Sub1_PS_SPOIL\", "
+"  M_PS.\"CONS_TYP\" as \"Sub1_CONS_TYP\", "
+"  M_PS.\"PS_LT_FLG\" as \"Sub1_PS_LT_FLG\", "
+"  to_char(M_PS.\"PS_FIXED_LT\") as \"Sub1_PS_FIXED_LT\", "
+"  to_char(M_PS.\"PS_PROP_LT\") as \"Sub1_PS_PROP_LT\", "
+"  to_char(M_PS.\"PS_PROP_LOT_SIZE\", 'FM99999999999990.0999') as \"Sub1_PS_PROP_LOT_SIZE\", "
+"  to_char(M_PS.\"PS_REF_NO\") as \"Sub1_PS_REF_NO\", "
+"  M_PS.\"COST_UP_TYP\" as \"Sub1_COST_UP_TYP\", "
+"  M_PS.\"MRP_EXP_TYP\" as \"Sub1_MRP_EXP_TYP\", "
+"  M_PS.\"MODIFY_COUNT\" as \"h_Sub1_MODIFY_COUNT\" "
+"from "
+"  M_ITEM M_ITEM_Parent, "
+"  M_ITEM M_ITEM_Comp, "
+"  M_PS M_PS "
+"where "
+"  M_ITEM_Parent.\"ITEM_CD\" = M_PS.\"PARENT_ITEM_CD\" "
+"  and M_ITEM_Comp.\"ITEM_CD\" = M_PS.\"COMP_ITEM_CD\" "
+"  and M_PS.\"PARENT_ITEM_CD\" = ? "
+"  and M_PS.\"COMP_ITEM_CD\" = ? "
+"  and M_PS.\"PS_EDITION\" = ?";
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
		public List read(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AA0180010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AA0180010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSub1_read
                        if(m_selcmd==null) throw new FoundationException("SelectSub1", "read", "クエリー未登録");
                     
                        PreparedStatement stmt=prepare(conn, m_selcmd, data);
                     
                        try {
                         return read(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
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
		public List read(Connection conn, AA0180010Struct data, String replaceStr)
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
		public List read(Connection conn, AA0180010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0180010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getSub1Parent_ITEM_CD());
				if(isNull(data.getSub1Parent_ITEM_CD())) isNull = true;
				ary.addElement(data.getSub1Comp_ITEM_CD());
				if(isNull(data.getSub1Comp_ITEM_CD())) isNull = true;
				ary.addElement(data.getSub1_PS_EDITION());
				if(isNull(data.getSub1_PS_EDITION())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getSub1Parent_ITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSub1Comp_ITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSub1_PS_EDITION(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AA0180010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AA0180010Struct data = new AA0180010Struct();

			data.setSub1Parent_ITEM_NAME( getString(1, rs) );
			data.setSub1Comp_ITEM_NAME( getString(2, rs) );
			data.setSub1_PS_UNIT_NUMERATOR( getString(3, rs) );
			data.setSub1_PS_UNIT_DENOMINATOR( getString(4, rs) );
			data.setSub1_STOCK_UNIT( getString(5, rs) );
			data.setSub1Comp_STOCK_UNIT( getString(6, rs) );
			data.setSub1_EFF_PHASE_IN_DATE( getString(7, rs) );
			data.setSub1_EFF_PHASE_OUT_DATE( getString(8, rs) );
			data.setSub1_PS_SPOIL( getString(9, rs) );
			data.setSub1_CONS_TYP( getString(10, rs) );
			data.seth_Sub1_PS_LT_FLG( getString(11, rs) );
			data.setSub1_PS_FIXED_LT( getString(12, rs) );
			data.setSub1_PS_PROP_LT( getString(13, rs) );
			data.setSub1_PS_PROP_LOT_SIZE( getString(14, rs) );
			data.setSub1_PS_REF_NO( getString(15, rs) );
			data.setSub1_COST_UP_TYP( getString(16, rs) );
			data.setSub1_MRP_EXP_TYP( getString(17, rs) );
			data.seth_Sub1_MODIFY_COUNT( getString(18, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSub1_check
                        PreparedStatement stmt;
                     
                        if(m_chkcmd!=null) {
                         stmt = prepare(conn, m_chkcmd, data);
                        } else if(m_selcmd!=null) {
                         stmt = prepare(conn, m_selcmd, data);
                        } else {
                         throw new FoundationException("SelectSub1", "check", "クエリー未登録");
                        }
                     
                        try {
                         return check(stmt, data);
                        } finally {
                         stmt.close();
                         stmt = null;
                        }
                        //}}user_implement_dev:SelectSub1_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
	public class GetComp extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  '1' as kbn1, "
+"  '1' as kbn2, "
+"  PLANT_CD, "
+"  ITEM_CD, "
+"  PROC_CD, "
+"  PROC_NO, "
+"  PROC_NAME, "
+"  WS_CD, "
+"  MODIFY_COUNT as \"MODIFY_CNT_PROC\", "
+"  null as \"ISSUE_ITEM_CD\", "
+"  null as \"PS_EDITION\", "
+"  null as \"EFF_PHASE_IN_DATE\", "
+"  null as \"EFF_PHASE_OUT_DATE\", "
+"  0 as \"MODIFY_CNT_ISSUE\", "
+"  0 as \"MODIFY_CNT_PS\", "
+"  0 as \"PS_REF_NO\", "
+"  ( "
+"    select "
+"      min(PROC_NO) "
+"    from "
+"      M_PROC_GRP "
+"    where "
+"      PLANT_CD = ? "
+"      and ITEM_CD = ? "
+"  ) as \"FIRST_PROC_NO\" "
+"from "
+"  ( "
+"    select "
+"      PLANT_CD, "
+"      ITEM_CD, "
+"      PROC_CD, "
+"      PROC_NO, "
+"      PROC_NAME, "
+"      WS_CD, "
+"      MODIFY_COUNT "
+"    from "
+"      M_PROC_GRP "
+"    where "
+"      PLANT_CD = ? "
+"      and ITEM_CD = ? "
+"  ) t1, "
+"  ( "
+"    select "
+"      min(PARENT_ITEM_CD) as PARENT_ITEM_CD "
+"    from "
+"      M_PS "
+"    where "
+"      PARENT_ITEM_CD = ? "
+"      and TO_CHAR(EFF_PHASE_IN_DATE, 'YYYY/MM/DD') <= ? "
+"      and TO_CHAR(EFF_PHASE_OUT_DATE, 'YYYY/MM/DD') >= ? "
+"  ) t2 "
+"where "
+"  t1.ITEM_CD = t2.PARENT_ITEM_CD(+) "
+"union all "
+"SELECT "
+"  '2' as kbn1, "
+"  '1' as kbn2, "
+"  null, "
+"  M_PS.PARENT_ITEM_CD, "
+"  null, "
+"  null, "
+"  null, "
+"  null, "
+"  0 as \"MODIFY_CNT_PROC\", "
+"  M_PS.COMP_ITEM_CD, "
+"  M_PS.PS_EDITION, "
+"  to_char(M_PS.EFF_PHASE_IN_DATE, 'YYYY/MM/DD'), "
+"  to_char(M_PS.EFF_PHASE_OUT_DATE, 'YYYY/MM/DD'), "
+"  0 as \"MODIFY_CNT_ISSUE\", "
+"  M_PS.MODIFY_COUNT as \"MODIFY_CNT_PS\", "
+"  M_PS.PS_REF_NO as \"PS_REF_NO\", "
+"  0 as \"FIRST_PROC_NO\" "
+"from "
+"  M_PS "
+"where "
+"  TO_CHAR(M_PS.EFF_PHASE_IN_DATE, 'YYYY/MM/DD') <= ? "
+"  and TO_CHAR(M_PS.EFF_PHASE_OUT_DATE, 'YYYY/MM/DD') >= ? "
+"  and M_PS.PARENT_ITEM_CD = ? "
+"order by "
+"  kbn1, "
+"  PROC_NO, "
+"  PS_REF_NO, "
+"  ISSUE_ITEM_CD";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:GetComp_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:GetComp_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AA0180010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AA0180010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:GetComp_read
			if(m_selcmd==null) throw new FoundationException("GetComp", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:GetComp_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0180010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:GetComp_read2
			if(m_selcmd==null) throw new FoundationException("GetComp", "read", "クエリー未登録");
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
                        //}}user_implement_dev:GetComp_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0180010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:GetComp_read3
			if(m_selcmd==null) throw new FoundationException("GetComp", "read", "クエリー未登録");
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
                        //}}user_implement_dev:GetComp_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0180010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getUpper_ITEM_CD());
				if(isNull(data.getUpper_ITEM_CD())) isNull = true;
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getUpper_ITEM_CD());
				if(isNull(data.getUpper_ITEM_CD())) isNull = true;
				ary.addElement(data.getUpper_ITEM_CD());
				if(isNull(data.getUpper_ITEM_CD())) isNull = true;
				ary.addElement(data.getTargetDate_IN());
				if(isNull(data.getTargetDate_IN())) isNull = true;
				ary.addElement(data.getTargetDate_OUT());
				if(isNull(data.getTargetDate_OUT())) isNull = true;
				ary.addElement(data.getTargetDate_IN());
				if(isNull(data.getTargetDate_IN())) isNull = true;
				ary.addElement(data.getTargetDate_OUT());
				if(isNull(data.getTargetDate_OUT())) isNull = true;
				ary.addElement(data.getUpper_ITEM_CD());
				if(isNull(data.getUpper_ITEM_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPLANT_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getUpper_ITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getPLANT_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getUpper_ITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getUpper_ITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getTargetDate_IN(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getTargetDate_OUT(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getTargetDate_IN(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getTargetDate_OUT(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getUpper_ITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AA0180010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AA0180010Struct data = new AA0180010Struct();

			data.setKBN1( getString(1, rs) );
			data.setKBN2( getString(2, rs) );
			data.setPLANT_CD( getString(3, rs) );
			data.setUpper_ITEM_CD( getString(4, rs) );
			data.setPROC_CD( getString(5, rs) );
			data.setPROC_NO( getString(6, rs) );
			data.setPROC_NAME( getString(7, rs) );
			data.setWS_CD( getString(8, rs) );
			data.setMODIFY_CNT_PROC( getString(9, rs) );
			data.setLower_ITEM_CD( getString(10, rs) );
			data.setPS_EDITION( getString(11, rs) );
			data.setEFF_PHASE_IN_DATE( getString(12, rs) );
			data.setEFF_PHASE_OUT_DATE( getString(13, rs) );
			data.setMODIFY_CNT_ISSUE( getString(14, rs) );
			data.setMODIFY_COUNT( getString(15, rs) );
			data.setPS_REF_NO( getString(16, rs) );
			data.setFIRST_PROC_NO( getString(17, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("GetComp", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:GetComp_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:GetComp_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:GetComp_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:GetComp_clear

			return;
		}

		/**
		 * GetCompクラスの標準コンストラクタ
		 */
		public GetComp()
		{
			//{{user_implement_dev:GetComp_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:GetComp_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectDetail2 extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M_PROC_GRP.\"ITEM_CD\" AS \"ITEM_CD\", "
+"  M_PROC_GRP.\"PROC_CD\" AS \"PROC_CD\", "
+"  M_PROC_GRP.\"PROC_NO\" AS \"PROC_NO\", "
+"  M_PROC_GRP.\"PROC_NAME\" AS \"PROC_NAME\", "
+"  M_PROC_GRP.\"WS_CD\" AS \"WS_CD\", "
+"  M_PROC_GRP.\"COMPANY_CD\" AS \"COMPANY_CD\", "
+"  M_PROC_GRP.\"VEND_CD\" AS \"VEND_CD\", "
+"  M_PROC_GRP.\"FIXED_LT\" AS \"FIXED_LT\", "
+"  M_PROC_GRP.\"PROP_LT\" AS \"PROP_LT\", "
+"  M_PROC_GRP.\"SAFETY_LT\" AS \"SAFETY_LT\", "
+"  M_PROC_GRP.\"PROP_LOT_SIZE\" AS \"PROP_LOT_SIZE\", "
+"  M_PROC_GRP.\"SPOIL\" AS \"SPOIL\", "
+"  M_PROC_GRP.\"OUTSIDE_TYP\" AS \"OUTSIDE_TYP\", "
+"  M_PROC_GRP.\"ACPT_INSPC_TYP\" AS \"ACPT_INSPC_TYP\", "
+"  M_PROC_GRP.\"STANDARD_COST\" AS \"STANDARD_COST\", "
+"  M_ITEM.\"ITEM_NAME\" AS \"ITEM_NAME\", "
+"  M_WS.\"WS_NAME\" AS \"WS_NAME\", "
+"  M_VEND_CTRL.\"VEND_ANAME\" AS \"VEND_ANAME\", "
+"  M_PROC_GRP.\"PLANT_CD\" AS \"PLANT_CD\" "
+"FROM "
+"  M_PROC_GRP, "
+"  M_ITEM, "
+"  M_WS, "
+"  M_VEND_CTRL "
+"WHERE "
+"  M_PROC_GRP.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  AND M_PROC_GRP.WS_CD = M_WS.WS_CD(+) "
+"  AND M_PROC_GRP.COMPANY_CD = M_VEND_CTRL.COMPANY_CD(+) "
+"  AND M_PROC_GRP.VEND_CD = M_VEND_CTRL.VEND_CD(+) "
+"  AND M_PROC_GRP.\"PLANT_CD\" = ? "
+"  AND M_PROC_GRP.\"ITEM_CD\" = ? "
+"  AND M_PROC_GRP.\"PROC_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectDetail2_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectDetail2_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AA0180010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AA0180010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectDetail2_read
			if(m_selcmd==null) throw new FoundationException("SelectDetail2", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectDetail2_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0180010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectDetail2_read2
			if(m_selcmd==null) throw new FoundationException("SelectDetail2", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectDetail2_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0180010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectDetail2_read3
			if(m_selcmd==null) throw new FoundationException("SelectDetail2", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectDetail2_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0180010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getDet2ITEM_CD());
				if(isNull(data.getDet2ITEM_CD())) isNull = true;
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
		public ResultSet executeQuery(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPLANT_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getDet2ITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getPROC_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AA0180010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AA0180010Struct data = new AA0180010Struct();

			data.setDet2ITEM_CD( getString(1, rs) );
			data.setDet2PROC_CD( getString(2, rs) );
			data.setDet2PROC_NO( getString(3, rs) );
			data.setDet2PROC_NAME( getString(4, rs) );
			data.setDet2WS_CD( getString(5, rs) );
			data.setDet2COMPANY_CD( getString(6, rs) );
			data.setDet2VEND_CD( getString(7, rs) );
			data.setDet2FIXED_LT( getString(8, rs) );
			data.setDet2PROP_LT( getString(9, rs) );
			data.setDet2SAFETY_LT( getString(10, rs) );
			data.setDet2PROP_LOT_SIZE( getString(11, rs) );
			data.setDet2SPOIL( getString(12, rs) );
			data.setDet2OUTSIDE_TYP( getString(13, rs) );
			data.setDet2ACPT_INSPC_TYP( getString(14, rs) );
			data.setDet2STANDARD_COST( getString(15, rs) );
			data.setDet2ITEM_NAME( getString(16, rs) );
			data.setDet2WS_NAME( getString(17, rs) );
			data.setDet2VEND_NAME( getString(18, rs) );
			data.setPLANT_CD( getString(19, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectDetail2", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectDetail2_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectDetail2_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectDetail2_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectDetail2_clear

			return;
		}

		/**
		 * SelectDetail2クラスの標準コンストラクタ
		 */
		public SelectDetail2()
		{
			//{{user_implement_dev:SelectDetail2_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectDetail2_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class AppendM_PROC_GRP extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = "INSERT INTO "
+"  M_PROC_GRP(\"PLANT_CD\", \"ITEM_CD\", \"PROC_CD\", \"PROC_NO\", \"PROC_NAME\", \"WS_CD\", \"COMPANY_CD\", \"VEND_CD\", \"FIXED_LT\", \"PROP_LT\", \"SAFETY_LT\", \"PROP_LOT_SIZE\", \"SPOIL\", \"OUTSIDE_TYP\", \"ACPT_INSPC_TYP\", \"STANDARD_COST\") "
+"VALUES "
+"  (?, ?, ?, TO_NUMBER(?), ?, ?, ?, ?, TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), ?, ?, TO_NUMBER(?))";
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AA0180010";
		protected String m_sUpdateProgramName="AA0180010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:AppendM_PROC_GRP_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:AppendM_PROC_GRP_def

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
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
				setString(7, data.getPLANT_CD(), stmt);
				setString(8, data.getSub2_ITEM_CD(), stmt);
				setString(9, data.getSub2_PROC_CD(), stmt);
				setString(10, data.getSub2_PROC_NO(), stmt);
				setString(11, data.getSub2_PROC_NAME(), stmt);
				setString(12, data.getSub2_WS_CD(), stmt);
				setString(13, data.getCOMPANY_CD(), stmt);
				setString(14, data.getSub2_VEND_CD(), stmt);
				setString(15, data.getSub2_FIXED_LT(), stmt);
				setString(16, data.getSub2_PROP_LT(), stmt);
				setString(17, data.getSub2_SAFETY_LT(), stmt);
				setString(18, data.getSub2_PROP_LOT_SIZE(), stmt);
				setString(19, data.getSub2_SPOIL(), stmt);
				setString(20, data.getSub2_OUTSIDE_TYP(), stmt);
				setString(21, data.getSub2_ACPT_INSPC_TYP(), stmt);
				setString(22, data.getSub2_STANDARD_COST(), stmt);

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
			//{{user_implement_dev:AppendM_PROC_GRP_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:AppendM_PROC_GRP_clear

			return;
		}

		/**
		 * AppendM_PROC_GRPクラスの標準コンストラクタ
		 */
		public AppendM_PROC_GRP()
		{
			//{{user_implement_dev:AppendM_PROC_GRP_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:AppendM_PROC_GRP_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class ModifyM_PROC_GRP extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  M_PROC_GRP "
+"SET "
+"  \"PROC_NO\" = TO_NUMBER(?), "
+"  \"PROC_NAME\" = ?, "
+"  \"WS_CD\" = ?, "
+"  \"COMPANY_CD\" = ?, "
+"  \"VEND_CD\" = ?, "
+"  \"FIXED_LT\" = TO_NUMBER(?), "
+"  \"PROP_LT\" = TO_NUMBER(?), "
+"  \"SAFETY_LT\" = TO_NUMBER(?), "
+"  \"PROP_LOT_SIZE\" = TO_NUMBER(?), "
+"  \"SPOIL\" = TO_NUMBER(?), "
+"  \"OUTSIDE_TYP\" = ?, "
+"  \"ACPT_INSPC_TYP\" = ?, "
+"  \"STANDARD_COST\" = TO_NUMBER(?) "
+"WHERE "
+"  M_PROC_GRP.\"PLANT_CD\" = ? "
+"  AND M_PROC_GRP.\"ITEM_CD\" = ? "
+"  AND M_PROC_GRP.\"PROC_CD\" = ?";
		protected String m_delcmd = null;
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AA0180010";
		protected String m_sUpdateProgramName="AA0180010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:ModifyM_PROC_GRP_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:ModifyM_PROC_GRP_def

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
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
				setString(4, data.getSub2_PROC_NO(), stmt);
				setString(5, data.getSub2_PROC_NAME(), stmt);
				setString(6, data.getSub2_WS_CD(), stmt);
				setString(7, data.getCOMPANY_CD(), stmt);
				setString(8, data.getSub2_VEND_CD(), stmt);
				setString(9, data.getSub2_FIXED_LT(), stmt);
				setString(10, data.getSub2_PROP_LT(), stmt);
				setString(11, data.getSub2_SAFETY_LT(), stmt);
				setString(12, data.getSub2_PROP_LOT_SIZE(), stmt);
				setString(13, data.getSub2_SPOIL(), stmt);
				setString(14, data.getSub2_OUTSIDE_TYP(), stmt);
				setString(15, data.getSub2_ACPT_INSPC_TYP(), stmt);
				setString(16, data.getSub2_STANDARD_COST(), stmt);
				setString(17, data.getPLANT_CD(), stmt);
				setString(18, data.getSub2_ITEM_CD(), stmt);
				setString(19, data.getSub2_PROC_CD(), stmt);

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
			//{{user_implement_dev:ModifyM_PROC_GRP_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:ModifyM_PROC_GRP_clear

			return;
		}

		/**
		 * ModifyM_PROC_GRPクラスの標準コンストラクタ
		 */
		public ModifyM_PROC_GRP()
		{
			//{{user_implement_dev:ModifyM_PROC_GRP_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:ModifyM_PROC_GRP_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectM_ITEM extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M_ITEM.\"ITEM_CD\" AS \"ITEM_CD\", "
+"  M_ITEM.\"ITEM_NAME\" AS \"ITEM_NAME\", "
+"  M_ITEM.\"DRAW_CD\" AS \"DRAW_CD\", "
+"  M_ITEM.\"SPEC\" AS \"SPEC\", "
+"  M_ITEM.\"MRP_ODR_TYP\" AS \"MRP_ODR_TYP\", "
+"  M_ITEM.\"OUTSIDE_TYP\" AS \"OUTSIDE_TYP\", "
+"  M_ITEM.\"OPR_RSLT_TYP\" AS \"OPR_RSLT_TYP\", "
+"  M_ITEM.\"FIXED_LT\" AS \"FIXED_LT\", "
+"  M_ITEM.\"PROP_LT\" AS \"PROP_LT\", "
+"  TO_CHAR(M_ITEM.\"PROP_LOT_SIZE\", 'FM99999999999990.0999') AS \"PROP_LOT_SIZE\", "
+"  M_ITEM.\"ISSUE_LT\" AS \"ISSUE_LT\", "
+"  M_ITEM.\"SAFETY_LT\" AS \"SAFETY_LT\", "
+"  M_ITEM.\"UNIT_QTY_TYP\" AS \"UNIT_QTY_TYP\", "
+"  M_ITEM.\"STOCK_UNIT\" AS \"STOCK_UNIT\" "
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

		//{{user_implement_dev:SelectM_ITEM_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectM_ITEM_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AA0180010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AA0180010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_ITEM_read
			if(m_selcmd==null) throw new FoundationException("SelectM_ITEM", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectM_ITEM_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0180010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_ITEM_read2
			if(m_selcmd==null) throw new FoundationException("SelectM_ITEM", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectM_ITEM_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0180010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_ITEM_read3
			if(m_selcmd==null) throw new FoundationException("SelectM_ITEM", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectM_ITEM_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0180010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AA0180010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AA0180010Struct data = new AA0180010Struct();

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

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectM_ITEM", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectM_ITEM_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectM_ITEM_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectM_ITEM_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectM_ITEM_clear

			return;
		}

		/**
		 * SelectM_ITEMクラスの標準コンストラクタ
		 */
		public SelectM_ITEM()
		{
			//{{user_implement_dev:SelectM_ITEM_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectM_ITEM_constractor

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
+"  M_PROC_GRP.\"PLANT_CD\" AS \"PLANT_CD\", "
+"  M_PROC_GRP.\"ITEM_CD\" AS \"ITEM_CD\", "
+"  M_PROC_GRP.\"PROC_CD\" AS \"PROC_CD\" "
+"FROM "
+"  M_PROC_GRP "
+"WHERE "
+"  M_PROC_GRP.\"PLANT_CD\" = ? "
+"  AND M_PROC_GRP.\"ITEM_CD\" = ? "
+"  AND M_PROC_GRP.\"PROC_CD\" = ?";
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
		public boolean check(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0180010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
	public class selectSYS_MY_COMPANY extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  SYS_MY_COMPANY.\"COMPANY_CD\" AS \"COMPANY_CD\" "
+"FROM "
+"  SYS_MY_COMPANY";
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
		public List read(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AA0180010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AA0180010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public List read(Connection conn, AA0180010Struct data, String replaceStr)
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
		public List read(Connection conn, AA0180010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0180010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AA0180010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AA0180010Struct data = new AA0180010Struct();

			data.setCOMPANY_CD( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
	public class checkM_WS extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "SELECT "
+"  M_WS.\"WS_CD\" AS \"WS_CD\" "
+"FROM "
+"  M_WS "
+"WHERE "
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
		public boolean check(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0180010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getWS_CD());
				if(isNull(data.getWS_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getWS_CD(), stmt);

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
	public class checkM_VEND_CTRL extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "SELECT "
+"  M_VEND_CTRL.\"VEND_CD\" AS \"VEND_CD\" "
+"FROM "
+"  M_VEND_CTRL "
+"WHERE "
+"  M_VEND_CTRL.\"VEND_CD\" = ?";
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
		public boolean check(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0180010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
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
		public ResultSet executeQuery(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
		{
			int no=1;

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
	public class EraceM_PROC_GRP extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = "DELETE FROM "
+"  M_PROC_GRP "
+"WHERE "
+"  M_PROC_GRP.\"PLANT_CD\" = ? "
+"  AND M_PROC_GRP.\"ITEM_CD\" = ? "
+"  AND M_PROC_GRP.\"PROC_CD\" = ?";
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AA0180010";
		protected String m_sUpdateProgramName="AA0180010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:EraceM_PROC_GRP_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:EraceM_PROC_GRP_def

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			return delete(conn.getConn(), data);
		}

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				stmt = conn.prepareStatement(m_delcmd);

				setString(1, data.getPLANT_CD(), stmt);
				setString(2, data.getITEM_CD(), stmt);
				setString(3, data.getPROC_CD(), stmt);

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
			//{{user_implement_dev:EraceM_PROC_GRP_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:EraceM_PROC_GRP_clear

			return;
		}

		/**
		 * EraceM_PROC_GRPクラスの標準コンストラクタ
		 */
		public EraceM_PROC_GRP()
		{
			//{{user_implement_dev:EraceM_PROC_GRP_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:EraceM_PROC_GRP_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class EraceM_SBCNT_UNIT_COST extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = "DELETE FROM "
+"  M_SBCNT_UNIT_COST "
+"WHERE "
+"  M_SBCNT_UNIT_COST.\"PLANT_CD\" = ? "
+"  AND M_SBCNT_UNIT_COST.\"ITEM_CD\" = ? "
+"  AND M_SBCNT_UNIT_COST.\"PROC_CD\" = ?";
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AA0180010";
		protected String m_sUpdateProgramName="AA0180010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:EraceM_SBCNT_UNIT_COST_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:EraceM_SBCNT_UNIT_COST_def

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			return delete(conn.getConn(), data);
		}

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				stmt = conn.prepareStatement(m_delcmd);

				setString(1, data.getPLANT_CD(), stmt);
				setString(2, data.getITEM_CD(), stmt);
				setString(3, data.getPROC_CD(), stmt);

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
			//{{user_implement_dev:EraceM_SBCNT_UNIT_COST_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:EraceM_SBCNT_UNIT_COST_clear

			return;
		}

		/**
		 * EraceM_SBCNT_UNIT_COSTクラスの標準コンストラクタ
		 */
		public EraceM_SBCNT_UNIT_COST()
		{
			//{{user_implement_dev:EraceM_SBCNT_UNIT_COST_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:EraceM_SBCNT_UNIT_COST_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class EraceM_SBCNT_UNIT_COST_H extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = "DELETE FROM "
+"  M_SBCNT_UNIT_COST_H "
+"WHERE "
+"  M_SBCNT_UNIT_COST_H.\"PLANT_CD\" = ? "
+"  AND M_SBCNT_UNIT_COST_H.\"ITEM_CD\" = ? "
+"  AND M_SBCNT_UNIT_COST_H.\"PROC_CD\" = ?";
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AA0180010";
		protected String m_sUpdateProgramName="AA0180010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:EraceM_SBCNT_UNIT_COST_H_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:EraceM_SBCNT_UNIT_COST_H_def

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			return delete(conn.getConn(), data);
		}

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				stmt = conn.prepareStatement(m_delcmd);

				setString(1, data.getPLANT_CD(), stmt);
				setString(2, data.getITEM_CD(), stmt);
				setString(3, data.getPROC_CD(), stmt);

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
			//{{user_implement_dev:EraceM_SBCNT_UNIT_COST_H_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:EraceM_SBCNT_UNIT_COST_H_clear

			return;
		}

		/**
		 * EraceM_SBCNT_UNIT_COST_Hクラスの標準コンストラクタ
		 */
		public EraceM_SBCNT_UNIT_COST_H()
		{
			//{{user_implement_dev:EraceM_SBCNT_UNIT_COST_H_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:EraceM_SBCNT_UNIT_COST_H_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class checkM_WS_plant_cd extends DataObject
	{
		protected String m_selcmd = null;
		protected String m_chkcmd = "SELECT "
+"  M_WS.\"WS_CD\" AS \"WS_CD\" "
+"FROM "
+"  M_WS "
+"WHERE "
+"  M_WS.\"WS_CD\" = ? "
+"  AND M_WS.\"PLANT_CD\" = ?";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkM_WS_plant_cd_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:checkM_WS_plant_cd_def

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkM_WS_plant_cd_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkM_WS_plant_cd_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0180010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getWS_CD());
				if(isNull(data.getWS_CD())) isNull = true;
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
		public ResultSet executeQuery(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getWS_CD(), stmt);
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
			//{{user_implement_dev:checkM_WS_plant_cd_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:checkM_WS_plant_cd_clear

			return;
		}

		/**
		 * checkM_WS_plant_cdクラスの標準コンストラクタ
		 */
		public checkM_WS_plant_cd()
		{
			//{{user_implement_dev:checkM_WS_plant_cd_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:checkM_WS_plant_cd_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class checkM_PROC_GRP_proc_no extends DataObject
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
+"  AND M_PROC_GRP.\"PROC_NO\" = ?";
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkM_PROC_GRP_proc_no_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:checkM_PROC_GRP_proc_no_def

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkM_PROC_GRP_proc_no_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkM_PROC_GRP_proc_no_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0180010Struct data) throws FoundationException, SQLException
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
				ary.addElement(data.getPROC_NO());
				if(isNull(data.getPROC_NO())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPLANT_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getPROC_NO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * インスタンスクリア処理
		 *
		 */
		public void clear()
		{
			//{{user_implement_dev:checkM_PROC_GRP_proc_no_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:checkM_PROC_GRP_proc_no_clear

			return;
		}

		/**
		 * checkM_PROC_GRP_proc_noクラスの標準コンストラクタ
		 */
		public checkM_PROC_GRP_proc_no()
		{
			//{{user_implement_dev:checkM_PROC_GRP_proc_no_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:checkM_PROC_GRP_proc_no_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_PROC_GRP_modify_count extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M_PROC_GRP.\"MODIFY_COUNT\" AS \"MODIFY_COUNT\" "
+"FROM "
+"  M_PROC_GRP "
+"WHERE "
+"  M_PROC_GRP.\"PLANT_CD\" = ? "
+"  AND M_PROC_GRP.\"ITEM_CD\" = ? "
+"  AND M_PROC_GRP.\"PROC_CD\" = ?";
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
		public List read(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AA0180010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AA0180010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public List read(Connection conn, AA0180010Struct data, String replaceStr)
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
		public List read(Connection conn, AA0180010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0180010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
		public AA0180010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AA0180010Struct data = new AA0180010Struct();

			data.setMODIFY_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
	public class SelectOne_for_update_nowait extends DataObject
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
+"  M_VEND_CTRL.\"VEND_NAME\" AS \"VEND_NAME\" "
+"FROM "
+"  M_PROC_GRP, "
+"  M_ITEM, "
+"  M_WS, "
+"  M_VEND_CTRL "
+"WHERE "
+"  M_PROC_GRP.ITEM_CD = M_ITEM.ITEM_CD "
+"  AND M_PROC_GRP.WS_CD = M_WS.WS_CD "
+"  AND M_PROC_GRP.VEND_CD = M_VEND_CTRL.VEND_CD "
+"  AND M_PROC_GRP.\"PLANT_CD\" = ? "
+"  AND M_PROC_GRP.\"ITEM_CD\" = ? "
+"  AND M_PROC_GRP.\"PROC_CD\" = ? "
+"FOR UPDATE NOWAIT";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectOne_for_update_nowait_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectOne_for_update_nowait_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AA0180010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AA0180010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectOne_for_update_nowait_read
			if(m_selcmd==null) throw new FoundationException("SelectOne_for_update_nowait", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectOne_for_update_nowait_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0180010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectOne_for_update_nowait_read2
			if(m_selcmd==null) throw new FoundationException("SelectOne_for_update_nowait", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectOne_for_update_nowait_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0180010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectOne_for_update_nowait_read3
			if(m_selcmd==null) throw new FoundationException("SelectOne_for_update_nowait", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectOne_for_update_nowait_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0180010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
		public AA0180010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AA0180010Struct data = new AA0180010Struct();

			data.setPLANT_CD( getString(1, rs) );
			data.setITEM_CD( getString(2, rs) );
			data.setPROC_CD( getString(3, rs) );
			data.setPROC_NO( getString(4, rs) );
			data.setPROC_NAME( getString(5, rs) );
			data.setWS_CD( getString(6, rs) );
			data.setCOMPANY_CD( getString(7, rs) );
			data.setVEND_CD( getString(8, rs) );
			data.setFIXED_LT( getString(9, rs) );
			data.setPROP_LT( getString(10, rs) );
			data.setSAFETY_LT( getString(11, rs) );
			data.setPROP_LOT_SIZE( getString(12, rs) );
			data.setSPOIL( getString(13, rs) );
			data.setOUTSIDE_TYP( getInteger(14, rs) );
			data.setACPT_INSPC_TYP( getInteger(15, rs) );
			data.setSTANDARD_COST( getString(16, rs) );
			data.setUNIT_QTY( getString(17, rs) );
			data.setWORK_TIME( getString(18, rs) );
			data.setMODIFY_COUNT( getString(19, rs) );
			data.setITEM_NAME( getString(20, rs) );
			data.setWS_NAME( getString(21, rs) );
			data.setVEND_NAME( getString(22, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectOne_for_update_nowait", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectOne_for_update_nowait_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectOne_for_update_nowait_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectOne_for_update_nowait_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectOne_for_update_nowait_clear

			return;
		}

		/**
		 * SelectOne_for_update_nowaitクラスの標準コンストラクタ
		 */
		public SelectOne_for_update_nowait()
		{
			//{{user_implement_dev:SelectOne_for_update_nowait_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectOne_for_update_nowait_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class SelectSub2 extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M_PROC_GRP.\"PROC_NO\" AS \"PROC_NO\", "
+"  M_PROC_GRP.\"PROC_NAME\" AS \"PROC_NAME\", "
+"  M_PROC_GRP.\"WS_CD\" AS \"WS_CD\", "
+"  M_PROC_GRP.\"VEND_CD\" AS \"VEND_CD\", "
+"  M_PROC_GRP.\"FIXED_LT\" AS \"FIXED_LT\", "
+"  M_PROC_GRP.\"PROP_LT\" AS \"PROP_LT\", "
+"  M_PROC_GRP.\"SAFETY_LT\" AS \"SAFETY_LT\", "
+"  M_PROC_GRP.\"PROP_LOT_SIZE\" AS \"PROP_LOT_SIZE\", "
+"  M_PROC_GRP.\"SPOIL\" AS \"SPOIL\", "
+"  M_PROC_GRP.\"OUTSIDE_TYP\" AS \"OUTSIDE_TYP\", "
+"  M_PROC_GRP.\"ACPT_INSPC_TYP\" AS \"ACPT_INSPC_TYP\", "
+"  M_PROC_GRP.\"STANDARD_COST\" AS \"STANDARD_COST\", "
+"  M_PROC_GRP.\"MODIFY_COUNT\" AS \"MODIFY_COUNT\", "
+"  M_ITEM.\"ITEM_NAME\" AS \"ITEM_NAME\", "
+"  M_ITEM.\"STOCK_UNIT\" AS \"STOCK_UNIT\", "
+"  M_WS.\"WS_NAME\" AS \"WS_NAME\", "
+"  M_VEND_CTRL.\"VEND_NAME\" AS \"VEND_NAME\" "
+"FROM "
+"  M_PROC_GRP, "
+"  M_ITEM, "
+"  M_WS, "
+"  M_VEND_CTRL "
+"WHERE "
+"  M_PROC_GRP.ITEM_CD = M_ITEM.ITEM_CD(+) "
+"  AND M_PROC_GRP.WS_CD = M_WS.WS_CD(+) "
+"  AND M_PROC_GRP.VEND_CD = M_VEND_CTRL.VEND_CD(+) "
+"  AND M_PROC_GRP.\"PLANT_CD\" = ? "
+"  AND M_PROC_GRP.\"ITEM_CD\" = ? "
+"  AND M_PROC_GRP.\"PROC_CD\" = ?";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:SelectSub2_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectSub2_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AA0180010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AA0180010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSub2_read
			if(m_selcmd==null) throw new FoundationException("SelectSub2", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectSub2_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0180010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSub2_read2
			if(m_selcmd==null) throw new FoundationException("SelectSub2", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectSub2_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0180010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSub2_read3
			if(m_selcmd==null) throw new FoundationException("SelectSub2", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectSub2_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0180010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getPLANT_CD());
				if(isNull(data.getPLANT_CD())) isNull = true;
				ary.addElement(data.getSub2_ITEM_CD());
				if(isNull(data.getSub2_ITEM_CD())) isNull = true;
				ary.addElement(data.getSub2_PROC_CD());
				if(isNull(data.getSub2_PROC_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPLANT_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSub2_ITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getSub2_PROC_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AA0180010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AA0180010Struct data = new AA0180010Struct();

			data.setSub2_PROC_NO( getString(1, rs) );
			data.setSub2_PROC_NAME( getString(2, rs) );
			data.setSub2_WS_CD( getString(3, rs) );
			data.setSub2_VEND_CD( getString(4, rs) );
			data.setSub2_FIXED_LT( getString(5, rs) );
			data.setSub2_PROP_LT( getString(6, rs) );
			data.setSub2_SAFETY_LT( getString(7, rs) );
			data.setSub2_PROP_LOT_SIZE( getString(8, rs) );
			data.setSub2_SPOIL( getString(9, rs) );
			data.setSub2_OUTSIDE_TYP( getString(10, rs) );
			data.setSub2_ACPT_INSPC_TYP( getString(11, rs) );
			data.setSub2_STANDARD_COST( getString(12, rs) );
			data.seth_Sub2_MODIFY_COUNT( getString(13, rs) );
			data.setSub2_ITEM_NAME( getString(14, rs) );
			data.setSub2_STOCK_UNIT( getString(15, rs) );
			data.setSub2_WS_NAME( getString(16, rs) );
			data.setSub2_VEND_NAME( getString(17, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectSub2", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectSub2_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectSub2_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectSub2_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectSub2_clear

			return;
		}

		/**
		 * SelectSub2クラスの標準コンストラクタ
		 */
		public SelectSub2()
		{
			//{{user_implement_dev:SelectSub2_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectSub2_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class GetParent extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  '2' as \"kbn1\", "
+"  '1' as \"kbn2\", "
+"  null as \"PLANT_CD\", "
+"  COMP_ITEM_CD as \"Upper_ITEM_CD\", "
+"  null as \"PROC_CD\", "
+"  null as \"PROC_NO\", "
+"  null as \"PROC_NAME\", "
+"  null as \"WS_CD\", "
+"  0 as \"MODIFY_CNT_PROC\", "
+"  PARENT_ITEM_CD as \"Lower_ITEM_CD\", "
+"  PS_EDITION as \"PS_EDITION\", "
+"  to_char(EFF_PHASE_IN_DATE, 'YYYY/MM/DD') as \"EFF_PHASE_IN_DATE\", "
+"  to_char(EFF_PHASE_OUT_DATE, 'YYYY/MM/DD') as \"EFF_PHASE_OUT_DATE\", "
+"  0 as \"MODIFY_CNT_ISSUE\", "
+"  MODIFY_COUNT as \"MODIFY_CNT_PS\", "
+"  PS_REF_NO as \"PS_REF_NO\" "
+"from "
+"  M_PS "
+"where "
+"  COMP_ITEM_CD = ? "
+"  and TO_CHAR(EFF_PHASE_IN_DATE, 'YYYY/MM/DD') <= ? "
+"  and TO_CHAR(EFF_PHASE_OUT_DATE, 'YYYY/MM/DD') >= ? "
+"union all "
+"SELECT "
+"  '1' as \"kbn1\", "
+"  '1' as \"kbn2\", "
+"  t2.PLANT_CD, "
+"  t2.ITEM_CD as \"Upper_ITEM_CD\", "
+"  t2.PROC_CD, "
+"  t2.PROC_NO, "
+"  t2.PROC_NAME, "
+"  t2.WS_CD, "
+"  t2.MODIFY_COUNT as \"MODIFY_CNT_PROC\", "
+"  t2.ITEM_CD as \"Lower_ITEM_CD\", "
+"  null as \"PS_EDITION\", "
+"  null as \"EFF_PHASE_IN_DATE\", "
+"  null as \"EFF_PHASE_OUT_DATE\", "
+"  0 as \"MODIFY_CNT_ISSUE\", "
+"  0 as \"MODIFY_CNT_PS\", "
+"  null as \"PS_REF_NO\" "
+"from "
+"  M_PROC_GRP t2 "
+"where "
+"  t2.ITEM_CD = ? "
+"  and t2.PLANT_CD = ? "
+"order by "
+"  \"kbn1\", "
+"  \"Lower_ITEM_CD\", "
+"  \"PROC_NO\"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:GetParent_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:GetParent_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AA0180010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AA0180010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:GetParent_read
			if(m_selcmd==null) throw new FoundationException("GetParent", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:GetParent_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0180010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:GetParent_read2
			if(m_selcmd==null) throw new FoundationException("GetParent", "read", "クエリー未登録");
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
                        //}}user_implement_dev:GetParent_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0180010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:GetParent_read3
			if(m_selcmd==null) throw new FoundationException("GetParent", "read", "クエリー未登録");
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
                        //}}user_implement_dev:GetParent_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0180010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getUpper_ITEM_CD());
				if(isNull(data.getUpper_ITEM_CD())) isNull = true;
				ary.addElement(data.getTargetDate_IN());
				if(isNull(data.getTargetDate_IN())) isNull = true;
				ary.addElement(data.getTargetDate_OUT());
				if(isNull(data.getTargetDate_OUT())) isNull = true;
				ary.addElement(data.getUpper_ITEM_CD());
				if(isNull(data.getUpper_ITEM_CD())) isNull = true;
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
		public ResultSet executeQuery(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getUpper_ITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getTargetDate_IN(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getTargetDate_OUT(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getUpper_ITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.getPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AA0180010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AA0180010Struct data = new AA0180010Struct();

			data.setKBN1( getString(1, rs) );
			data.setKBN2( getString(2, rs) );
			data.setPLANT_CD( getString(3, rs) );
			data.setUpper_ITEM_CD( getString(4, rs) );
			data.setPROC_CD( getString(5, rs) );
			data.setPROC_NO( getString(6, rs) );
			data.setPROC_NAME( getString(7, rs) );
			data.setWS_CD( getString(8, rs) );
			data.setMODIFY_CNT_PROC( getString(9, rs) );
			data.setLower_ITEM_CD( getString(10, rs) );
			data.setPS_EDITION( getString(11, rs) );
			data.setEFF_PHASE_IN_DATE( getString(12, rs) );
			data.setEFF_PHASE_OUT_DATE( getString(13, rs) );
			data.setMODIFY_CNT_ISSUE( getString(14, rs) );
			data.setMODIFY_COUNT( getString(15, rs) );
			data.setPS_REF_NO( getString(16, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("GetParent", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:GetParent_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:GetParent_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:GetParent_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:GetParent_clear

			return;
		}

		/**
		 * GetParentクラスの標準コンストラクタ
		 */
		public GetParent()
		{
			//{{user_implement_dev:GetParent_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:GetParent_constractor

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
		public List read(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AA0180010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AA0180010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public List read(Connection conn, AA0180010Struct data, String replaceStr)
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
		public List read(Connection conn, AA0180010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0180010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
		public AA0180010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AA0180010Struct data = new AA0180010Struct();

			data.setPS_UNIT_DENOMINATOR( getString(1, rs) );
			data.setPS_UNIT_NUMERATOR( getString(2, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:checkM_PS_ps_edition_def

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkM_PS_ps_edition_check
			PreparedStatement stmt = prepare(conn, m_chkcmd, data);

			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:checkM_PS_ps_edition_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0180010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:checkM_PS_ps_edition_clear

			return;
		}

		/**
		 * checkM_PS_ps_editionクラスの標準コンストラクタ
		 */
		public checkM_PS_ps_edition()
		{
			//{{user_implement_dev:checkM_PS_ps_edition_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:checkM_PS_ps_edition_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectSumM_PROC_GRP extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  SUM(M_PROC_GRP.\"FIXED_LT\") AS \"SUM_FIXED_LT\", "
+"  SUM(M_PROC_GRP.\"PROP_LT\") AS \"SUM_PROP_LT\" "
+"FROM "
+"  M_PROC_GRP "
+"WHERE "
+"  M_PROC_GRP.\"PLANT_CD\" = ? "
+"  AND M_PROC_GRP.\"ITEM_CD\" = ? "
+"GROUP BY "
+"  M_PROC_GRP.\"PLANT_CD\", "
+"  M_PROC_GRP.\"ITEM_CD\"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:selectSumM_PROC_GRP_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:selectSumM_PROC_GRP_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AA0180010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AA0180010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSumM_PROC_GRP_read
			if(m_selcmd==null) throw new FoundationException("selectSumM_PROC_GRP", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectSumM_PROC_GRP_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0180010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSumM_PROC_GRP_read2
			if(m_selcmd==null) throw new FoundationException("selectSumM_PROC_GRP", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectSumM_PROC_GRP_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0180010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSumM_PROC_GRP_read3
			if(m_selcmd==null) throw new FoundationException("selectSumM_PROC_GRP", "read", "クエリー未登録");
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
                        //}}user_implement_dev:selectSumM_PROC_GRP_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0180010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
		public AA0180010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AA0180010Struct data = new AA0180010Struct();

			data.setSUM_FIXED_LT( getString(1, rs) );
			data.setSUM_PROP_LT( getString(2, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("selectSumM_PROC_GRP", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:selectSumM_PROC_GRP_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:selectSumM_PROC_GRP_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:selectSumM_PROC_GRP_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:selectSumM_PROC_GRP_clear

			return;
		}

		/**
		 * selectSumM_PROC_GRPクラスの標準コンストラクタ
		 */
		public selectSumM_PROC_GRP()
		{
			//{{user_implement_dev:selectSumM_PROC_GRP_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:selectSumM_PROC_GRP_constractor

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
		public boolean check(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0180010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getSub1Comp_ITEM_CD());
				if(isNull(data.getSub1Comp_ITEM_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getSub1Comp_ITEM_CD(), stmt);

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
		public List read(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AA0180010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AA0180010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public List read(Connection conn, AA0180010Struct data, String replaceStr)
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
		public List read(Connection conn, AA0180010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0180010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPLANT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AA0180010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AA0180010Struct data = new AA0180010Struct();

			data.setBUSINESS_OPR_DATE( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AA0180010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AA0180010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public List read(Connection conn, AA0180010Struct data, String replaceStr)
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
		public List read(Connection conn, AA0180010Struct data, String[] replaceStrs)
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
		public List read(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0180010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getPARAM_INPUT_DATA(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AA0180010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AA0180010Struct data = new AA0180010Struct();

			data.setPARAM_RESULT_DATA( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public boolean check(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public boolean check(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
	public class SelectMANHOUR_TYP extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M_ITEM.\"MANHOUR_TYP\" as \"M_ITEM\" "
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

		//{{user_implement_dev:SelectMANHOUR_TYP_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:SelectMANHOUR_TYP_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AA0180010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AA0180010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectMANHOUR_TYP_read
			if(m_selcmd==null) throw new FoundationException("SelectMANHOUR_TYP", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectMANHOUR_TYP_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0180010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectMANHOUR_TYP_read2
			if(m_selcmd==null) throw new FoundationException("SelectMANHOUR_TYP", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectMANHOUR_TYP_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AA0180010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectMANHOUR_TYP_read3
			if(m_selcmd==null) throw new FoundationException("SelectMANHOUR_TYP", "read", "クエリー未登録");
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
                        //}}user_implement_dev:SelectMANHOUR_TYP_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AA0180010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getLower_ITEM_CD());
				if(isNull(data.getLower_ITEM_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getLower_ITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AA0180010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AA0180010Struct data = new AA0180010Struct();

			data.setLower_MANHOUR_TYP( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("SelectMANHOUR_TYP", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AA0180010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AA0180010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:SelectMANHOUR_TYP_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:SelectMANHOUR_TYP_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AA0180010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:SelectMANHOUR_TYP_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:SelectMANHOUR_TYP_clear

			return;
		}

		/**
		 * SelectMANHOUR_TYPクラスの標準コンストラクタ
		 */
		public SelectMANHOUR_TYP()
		{
			//{{user_implement_dev:SelectMANHOUR_TYP_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:SelectMANHOUR_TYP_constractor

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
		mFlashTree.clear();
		mFlashTree = null;
		mSelectDetail.clear();
		mSelectDetail = null;
		mSelectDetailTop.clear();
		mSelectDetailTop = null;
		mSelectSub1.clear();
		mSelectSub1 = null;
		mGetComp.clear();
		mGetComp = null;
		mSelectDetail2.clear();
		mSelectDetail2 = null;
		mAppendM_PROC_GRP.clear();
		mAppendM_PROC_GRP = null;
		mModifyM_PROC_GRP.clear();
		mModifyM_PROC_GRP = null;
		mSelectM_ITEM.clear();
		mSelectM_ITEM = null;
		mcheckM_PROC_GRP.clear();
		mcheckM_PROC_GRP = null;
		mselectSYS_MY_COMPANY.clear();
		mselectSYS_MY_COMPANY = null;
		mcheckM_WS.clear();
		mcheckM_WS = null;
		mcheckM_VEND_CTRL.clear();
		mcheckM_VEND_CTRL = null;
		mEraceM_PROC_GRP.clear();
		mEraceM_PROC_GRP = null;
		mEraceM_SBCNT_UNIT_COST.clear();
		mEraceM_SBCNT_UNIT_COST = null;
		mEraceM_SBCNT_UNIT_COST_H.clear();
		mEraceM_SBCNT_UNIT_COST_H = null;
		mcheckM_WS_plant_cd.clear();
		mcheckM_WS_plant_cd = null;
		mcheckM_PROC_GRP_proc_no.clear();
		mcheckM_PROC_GRP_proc_no = null;
		mselectM_PROC_GRP_modify_count.clear();
		mselectM_PROC_GRP_modify_count = null;
		mSelectOne_for_update_nowait.clear();
		mSelectOne_for_update_nowait = null;
		mSelectSub2.clear();
		mSelectSub2 = null;
		mGetParent.clear();
		mGetParent = null;
		mselectM_PS_psUnitNumerator.clear();
		mselectM_PS_psUnitNumerator = null;
		mcheckM_PS_ps_edition.clear();
		mcheckM_PS_ps_edition = null;
		mselectSumM_PROC_GRP.clear();
		mselectSumM_PROC_GRP = null;
		mcheckM_BY_PRODUCT.clear();
		mcheckM_BY_PRODUCT = null;
		mSelect_SYS_DATE_CTRL.clear();
		mSelect_SYS_DATE_CTRL = null;
		mSELECT_SYS_PARAMETER.clear();
		mSELECT_SYS_PARAMETER = null;
		mSelectMANHOUR_TYP.clear();
		mSelectMANHOUR_TYP = null;
		return;
	}

	/**
	 * ログ部品インスタンス
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();
	public void setUsrId(String username) {objMessage.m_writer.setUserID(username);}	// ユーザIDをセットします。

	/**
	 * AA0180010クラスの標準コンストラクタ
	 */
	public AA0180010Entity() throws FoundationException
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
