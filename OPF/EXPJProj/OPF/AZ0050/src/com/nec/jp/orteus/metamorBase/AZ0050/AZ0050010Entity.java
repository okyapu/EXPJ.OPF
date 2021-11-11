/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AZ0050/src/com/nec/jp/orteus/metamorBase/AZ0050/AZ0050010Entity.java,v $
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

package com.nec.jp.orteus.metamorBase.AZ0050;

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

public class AZ0050010Entity extends DataObject
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

	// T_QUERY_INFOクラス インスタンス
	public T_QUERY_INFO mT_QUERY_INFO = new T_QUERY_INFO();

	// T_QUERY_INFO4Updateクラス インスタンス
	public T_QUERY_INFO4Update mT_QUERY_INFO4Update = new T_QUERY_INFO4Update();

	// BUSINESS_GROUP_MSTクラス インスタンス
	public BUSINESS_GROUP_MST mBUSINESS_GROUP_MST = new BUSINESS_GROUP_MST();

	// T_BUSINESS_GROUP_QUERYクラス インスタンス
	public T_BUSINESS_GROUP_QUERY mT_BUSINESS_GROUP_QUERY = new T_BUSINESS_GROUP_QUERY();


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
		String m_write_fname="AZ0050010.csv";

		protected WriteCsv m_writer=null;		// csv書込み用

		String m_ProjName="AZ0050010";

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
	public class T_QUERY_INFO extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_QUERY_INFO.\"EDIT_TYP\" As \"EDIT_TYP\", "
+"  T_QUERY_INFO.\"QUERY_NAME\" As \"QUERY_NAME\", "
+"  T_QUERY_INFO.\"QUERY_GROUP\" As \"QUERY_GROUP\", "
+"  T_QUERY_INFO.\"MEMO\" As \"MEMO\", "
+"  TO_CHAR(T_QUERY_INFO.\"CREATED_DATE\", 'YYYY/MM/DD') As \"CREATED_DATE\", "
+"  T_QUERY_INFO.\"CREATED_BY\" As \"CREATED_BY\", "
+"  TO_CHAR(T_QUERY_INFO.\"UPDATED_DATE\", 'YYYY/MM/DD') As \"UPDATED_DATE\", "
+"  T_QUERY_INFO.\"UPDATED_BY\" As \"UPDATED_BY\", "
+"  TO_CHAR(T_QUERY_INFO.\"MODIFY_COUNT\") As \"MODIFY_COUNT\", "
+"  T_QUERY_INFO.\"QUERY_CD\" As \"QUERY_CD\", "
+"  T_QUERY_INFO.\"SQL_INFO\" As \"SQL_INFO\", "
+"  T_QUERY_INFO.\"CREATED_PRG_NM\" As \"CREATED_PRG_NM\", "
+"  T_QUERY_INFO.\"UPDATED_PRG_NM\" As \"UPDATED_PRG_NM\" "
+"FROM "
+"  T_QUERY_INFO "
+"WHERE "
+"  QUERY_NAME LIKE ? "
+"  and QUERY_GROUP LIKE ? "
+"  and MEMO LIKE ? "
+"  and CREATED_BY = ? "
+"  and CREATED_DATE >= ? "
+"  and TO_DATE(CREATED_DATE) <= ? "
+"ORDER BY "
+"  QUERY_GROUP, "
+"  QUERY_NAME, "
+"  MEMO, "
+"  CREATED_BY, "
+"  CREATED_DATE";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = "UPDATE "
+"  T_QUERY_INFO "
+"SET "
+"  \"UPDATED_DATE\" = TO_DATE(?, 'yyyy/mm/dd hh24:mi:ss'), "
+"  \"UPDATED_BY\" = ?, "
+"  \"UPDATED_PRG_NM\" = ?, "
+"  \"MODIFY_COUNT\" = ? "
+"WHERE "
+"  T_QUERY_INFO.\"QUERY_CD\" = ?";
		protected String m_delcmd = "delete from "
+"  T_QUERY_INFO "
+"where "
+"  T_QUERY_INFO.\"QUERY_CD\" = ?";
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AZ0050010";
		protected String m_sUpdateProgramName="AZ0050010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:T_QUERY_INFO_def
                            
                              private final static String m_programName = "AZ0050010";
                            
                              /**
                               * レコード登録
                               * @param conn DBのコネクション
                               * @param data 登録する情報を設定済の情報
                               * @return 挿入したレコード数
                               */
                              public int create2(IDbConnection conn, AZ0050010Struct data) throws SQLException
                              {
                            	  PreparedStatement st = null;
                            	  try{                            		  
                                      String sql
                                       = "insert into T_QUERY_INFO("
                                       +  " \"QUERY_CD\","
                                       +  " \"QUERY_NAME\","
                                       +  " \"QUERY_GROUP\","
                                       +  " \"MEMO\","
                                       +  " \"SQL_INFO\","
                                       +  " \"EDIT_TYP\","
                                       +  " \"CREATED_DATE\","
                                       +  " \"CREATED_BY\","
                                       +  " \"CREATED_PRG_NM\","
                                       +  " \"UPDATED_DATE\","
                                       +  " \"UPDATED_BY\","
                                       +  " \"UPDATED_PRG_NM\") "
                                       + "values("
                                       +   "?,"
                                       +   "?,"
                                       +   "?,"
                                       +   "?,"
                                       +   "?,"
                                       +   "?,"
                                       +   "sysdate,"
                                       +   "?,"
                                       +   "?,"
                                       +   "sysdate,"
                                       +   "?,"
                                       +   "?"
                                       +   ")";
                                      
                                      st = conn.getConn().prepareStatement(sql);
                                      st.setString(1, data.getQUERY_CD());
                                      st.setString(2, AZ0050Common.toSqlString(data.getQUERY_NAME()));
                                      st.setString(3, AZ0050Common.toSqlString(data.getQUERY_GROUP()));
                                      st.setString(4, AZ0050Common.toSqlString(data.getQUERY_MEMO()));
                                      st.setString(5, data.getSQL_INFO());
                                      st.setString(6, data.getEDIT_TYP());
                                      st.setString(7, AZ0050Common.toSqlString(data.getsUser_ID()));
                                      st.setString(8, m_programName);
                                      st.setString(9, AZ0050Common.toSqlString(data.getsUser_ID()));
                                      st.setString(10, m_programName);
                                      return st.executeUpdate();
                            	  }catch (SQLException e){
                            		  throw e;
                            	  }finally{
                            		  if (st != null ) {
                            		        try {
                            		        	st.close();
                            		        } catch (Exception e ) {
                            		        	e.printStackTrace();
                            		        }
                            		        st = null;
                            		  }
                            	}
                            	  
                               
                              }
                              /**
                               * レコード更新
                               * 更新カウントの取得とレコード更新を行う。このため
                               * 本関数実行時 対象となるレコードが更新されないことを上位APで保障する必要がある。
                               * @param conn DBのコネクション
                               * @param data 更新する情報を設定済の情報
                               * @return 更新した行数
                               */
                              public int update2(IDbConnection conn, AZ0050010Struct data) throws SQLException
                              {
                            	  PreparedStatement st = null;
                                  ResultSet rslt = null;
                                  
                            	  try{
                            		  String selectSql
                                      = "select MODIFY_COUNT from T_QUERY_INFO "
                                      + "where QUERY_CD = ?";
                            		  
                            		  st = conn.getConn().prepareStatement(selectSql);
                            		  st.setString(1, data.getQUERY_CD());
                                  
                                     if(st.execute() == false)  return -1;
                                     if((rslt = st.getResultSet()) == null)  return -1;
                                     if(rslt.next() == false)  return -1;
                                     int modifyCount = rslt.getInt("MODIFY_COUNT") + 1;
                                     rslt.close();
                                     st.close();
                                     st = null;
                                  
                                     String updateSql
                                      = "update T_QUERY_INFO "
                                      + "set "
                                      +  "\"QUERY_NAME\" = ?,"
                                      +  "\"QUERY_GROUP\" = ?,"
                                      +  "\"MEMO\" = ?,"
                                      +  "\"SQL_INFO\" = ?,"
                                      +  "\"EDIT_TYP\" = ?,"
                                      +  "\"UPDATED_DATE\" = sysdate,"
                                      +  "\"UPDATED_BY\" = ?,"
                                      +  "\"UPDATED_PRG_NM\" = ?,"
                                      +  "\"MODIFY_COUNT\" = ? "
                                      +"where "
                                      +  "T_QUERY_INFO.\"QUERY_CD\" = ?";
                                     st = conn.getConn().prepareStatement(updateSql);
                                     st.setString(1, AZ0050Common.toSqlString(data.getQUERY_NAME()));
                                     st.setString(2, AZ0050Common.toSqlString(data.getQUERY_GROUP()));
                                     st.setString(3, AZ0050Common.toSqlString(data.getQUERY_MEMO()));
                                     st.setString(4, data.getSQL_INFO());
                                     st.setString(5, data.getEDIT_TYP());
                                     st.setString(6, AZ0050Common.toSqlString(data.getsUser_ID()));
                                     st.setString(7, m_programName);
                                     st.setInt(8, modifyCount);
                                     st.setString(9, data.getQUERY_CD());
                                     return st.executeUpdate();
                            	  }catch (SQLException e){
                            		  throw e;
                            	  }finally{
                            		  if (st != null ) {
                          		        try {
                          		        	st.close();
                          		        } catch (Exception e ) {
                          		        	e.printStackTrace();
                          		        }
                          		        st = null;
                            		  }
                            		  if (rslt != null ) {
                            		        try {
                            		        	rslt.close();
                            		        } catch (Exception e ) {
                            		        	e.printStackTrace();
                            		        }
                            		        rslt = null;
                              		  }
                            	  }                                                              
                              }
                               
                //}}user_implement_dev:T_QUERY_INFO_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AZ0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AZ0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AZ0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_QUERY_INFO_read
                                             if(m_selcmd==null) throw new FoundationException("T_QUERY_INFO", "read", "クエリー未登録");
                                          
                                             PreparedStatement stmt=prepare(conn, m_selcmd, data);
                                          
                                             try {
                                              return read(stmt, data);
                                             } finally {
                                              stmt.close();
                                              stmt = null;
                                             }
                        //}}user_implement_dev:T_QUERY_INFO_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_QUERY_INFO_read2
                        if(m_selcmd==null) throw new FoundationException("T_QUERY_INFO", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_QUERY_INFO_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_QUERY_INFO_read3
                        if(m_selcmd==null) throw new FoundationException("T_QUERY_INFO", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_QUERY_INFO_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AZ0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getw_QUERY_NAME());
				if(isNull(data.getw_QUERY_NAME())) isNull = true;
				ary.addElement(data.getw_QUERY_GROUP());
				if(isNull(data.getw_QUERY_GROUP())) isNull = true;
				ary.addElement(data.getw_MEMO());
				if(isNull(data.getw_MEMO())) isNull = true;
				ary.addElement(data.getw_CREATED_BY());
				if(isNull(data.getw_CREATED_BY())) isNull = true;
				ary.addElement(data.getw_CREATED_DATE_FROM());
				if(isNull(data.getw_CREATED_DATE_FROM())) isNull = true;
				ary.addElement(data.getw_CREATED_DATE_TO());
				if(isNull(data.getw_CREATED_DATE_TO())) isNull = true;

				//動的SQL生成ロジック
				dyn_query = (isNull ? SqlFormat.formatDyncond(query, ary) : query);
				stmt = conn.prepareStatement(dyn_query);

			} catch(ParseException e){
				throw new FoundationException("T_QUERY_INFO", "prepare", "Parse失敗:"+e.toString());
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
		public ResultSet executeQuery(PreparedStatement stmt, AZ0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			//動的SQL生成ロジック
			if(!isNull(data.getw_QUERY_NAME())) setString(no ++, data.getw_QUERY_NAME(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getw_QUERY_GROUP())) setString(no ++, data.getw_QUERY_GROUP(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getw_MEMO())) setString(no ++, data.getw_MEMO(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getw_CREATED_BY())) setString(no ++, data.getw_CREATED_BY(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getw_CREATED_DATE_FROM())) setString(no ++, data.getw_CREATED_DATE_FROM(), stmt);
			//動的SQL生成ロジック
			if(!isNull(data.getw_CREATED_DATE_TO())) setString(no ++, data.getw_CREATED_DATE_TO(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AZ0050010Struct data = new AZ0050010Struct();

			data.setEDIT_TYP( getString(1, rs) );
			data.setQUERY_NAME( getString(2, rs) );
			data.setQUERY_GROUP( getString(3, rs) );
			data.setQUERY_MEMO( getString(4, rs) );
			data.setCREATED_DATE( getString(5, rs) );
			data.setCREATED_BY( getString(6, rs) );
			data.setUPDATED_DATE( getString(7, rs) );
			data.setUPDATED_BY( getString(8, rs) );
			data.setMODIFY_COUNT( getString(9, rs) );
			data.setQUERY_CD( getString(10, rs) );
			data.setSQL_INFO( getString(11, rs) );
			data.setCREATED_PRG_NM( getString(12, rs) );
			data.setUPDATED_PRG_NM( getString(13, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AZ0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AZ0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_QUERY_INFO", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AZ0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AZ0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_QUERY_INFO_check
                                             PreparedStatement stmt;
                                          
                                             if(m_chkcmd!=null) {
                                              stmt = prepare(conn, m_chkcmd, data);
                                             } else if(m_selcmd!=null) {
                                              stmt = prepare(conn, m_selcmd, data);
                                             } else {
                                              throw new FoundationException("T_QUERY_INFO", "check", "クエリー未登録");
                                             }
                                          
                                             try {
                                              return check(stmt, data);
                                             } finally {
                                              stmt.close();
                                              stmt = null;
                                             }
                        //}}user_implement_dev:T_QUERY_INFO_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AZ0050010Struct data) throws FoundationException, SQLException
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
		public int update(IDbConnection conn, AZ0050010Struct data) throws FoundationException, SQLException
		{
			return update(conn.getConn(), data);
		}

		/**
		 * データ更新処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int update(Connection conn, AZ0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;
			int modifyCount;

			try {
				stmt = conn.prepareStatement(m_updcmd);

				setString(1, data.getUPDATED_DATE(), stmt);
				setString(2, data.getUPDATED_BY(), stmt);
				setString(3, data.getUPDATED_PRG_NM(), stmt);
				setString(4, data.getMODIFY_COUNT(), stmt);
				setString(5, data.getQUERY_CD(), stmt);

				return stmt.executeUpdate();
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
			}
		}
		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(IDbConnection conn, AZ0050010Struct data) throws FoundationException, SQLException
		{
			return delete(conn.getConn(), data);
		}

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(Connection conn, AZ0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				stmt = conn.prepareStatement(m_delcmd);

				setString(1, data.getQUERY_CD(), stmt);

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
			//{{user_implement_dev:T_QUERY_INFO_clear
                                              
                        //}}user_implement_dev:T_QUERY_INFO_clear

			return;
		}

		/**
		 * T_QUERY_INFOクラスの標準コンストラクタ
		 */
		public T_QUERY_INFO()
		{
			//{{user_implement_dev:T_QUERY_INFO_constractor
                                              
                        //}}user_implement_dev:T_QUERY_INFO_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_QUERY_INFO4Update extends DataObject
	{
		protected String m_selcmd = "select "
+"  T_QUERY_INFO.\"MODIFY_COUNT\" as \"MODIFY_COUNT\" "
+"from "
+"  T_QUERY_INFO "
+"where "
+"  T_QUERY_INFO.\"QUERY_CD\" = ? "
+"for update nowait";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:T_QUERY_INFO4Update_def
                               
                //}}user_implement_dev:T_QUERY_INFO4Update_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AZ0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AZ0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AZ0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_QUERY_INFO4Update_read
                                             if(m_selcmd==null) throw new FoundationException("T_QUERY_INFO4Update", "read", "クエリー未登録");
                                          
                                             PreparedStatement stmt=prepare(conn, m_selcmd, data);
                                          
                                             try {
                                              return read(stmt, data);
                                             } finally {
                                              stmt.close();
                                              stmt = null;
                                             }
                        //}}user_implement_dev:T_QUERY_INFO4Update_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_QUERY_INFO4Update_read2
                        if(m_selcmd==null) throw new FoundationException("T_QUERY_INFO4Update", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_QUERY_INFO4Update_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_QUERY_INFO4Update_read3
                        if(m_selcmd==null) throw new FoundationException("T_QUERY_INFO4Update", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_QUERY_INFO4Update_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AZ0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getQUERY_CD());
				if(isNull(data.getQUERY_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AZ0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getQUERY_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AZ0050010Struct data = new AZ0050010Struct();

			data.setMODIFY_COUNT( getString(1, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AZ0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AZ0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_QUERY_INFO4Update", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AZ0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AZ0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_QUERY_INFO4Update_check
                                             PreparedStatement stmt;
                                          
                                             if(m_chkcmd!=null) {
                                              stmt = prepare(conn, m_chkcmd, data);
                                             } else if(m_selcmd!=null) {
                                              stmt = prepare(conn, m_selcmd, data);
                                             } else {
                                              throw new FoundationException("T_QUERY_INFO4Update", "check", "クエリー未登録");
                                             }
                                          
                                             try {
                                              return check(stmt, data);
                                             } finally {
                                              stmt.close();
                                              stmt = null;
                                             }
                        //}}user_implement_dev:T_QUERY_INFO4Update_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AZ0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:T_QUERY_INFO4Update_clear
                                              
                        //}}user_implement_dev:T_QUERY_INFO4Update_clear

			return;
		}

		/**
		 * T_QUERY_INFO4Updateクラスの標準コンストラクタ
		 */
		public T_QUERY_INFO4Update()
		{
			//{{user_implement_dev:T_QUERY_INFO4Update_constractor
                                              
                        //}}user_implement_dev:T_QUERY_INFO4Update_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class BUSINESS_GROUP_MST extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  BUSINESS_GROUP_MST.\"BUSINESS_GROUP_CD\" AS \"BUSINESS_GROUP_CD\", "
+"  BUSINESS_GROUP_MST.\"BUSINESS_GROUP_NAME\" AS \"BUSINESS_GROUP_NAME\" "
+"FROM "
+"  BUSINESS_GROUP_MST "
+"ORDER BY "
+"  BUSINESS_GROUP_MST.\"BUSINESS_GROUP_CD\"";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:BUSINESS_GROUP_MST_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:BUSINESS_GROUP_MST_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AZ0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AZ0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AZ0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:BUSINESS_GROUP_MST_read
			if(m_selcmd==null) throw new FoundationException("BUSINESS_GROUP_MST", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:BUSINESS_GROUP_MST_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:BUSINESS_GROUP_MST_read2
			if(m_selcmd==null) throw new FoundationException("BUSINESS_GROUP_MST", "read", "クエリー未登録");
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
                        //}}user_implement_dev:BUSINESS_GROUP_MST_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:BUSINESS_GROUP_MST_read3
			if(m_selcmd==null) throw new FoundationException("BUSINESS_GROUP_MST", "read", "クエリー未登録");
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
                        //}}user_implement_dev:BUSINESS_GROUP_MST_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AZ0050010Struct data) throws FoundationException, SQLException
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
		public ResultSet executeQuery(PreparedStatement stmt, AZ0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;


			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AZ0050010Struct data = new AZ0050010Struct();

			data.setBUSINESS_GROUP_CD( getString(1, rs) );
			data.setBUSINESS_GROUP_NAME( getString(2, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AZ0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AZ0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("BUSINESS_GROUP_MST", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AZ0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AZ0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:BUSINESS_GROUP_MST_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:BUSINESS_GROUP_MST_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AZ0050010Struct data) throws FoundationException, SQLException
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
			//{{user_implement_dev:BUSINESS_GROUP_MST_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:BUSINESS_GROUP_MST_clear

			return;
		}

		/**
		 * BUSINESS_GROUP_MSTクラスの標準コンストラクタ
		 */
		public BUSINESS_GROUP_MST()
		{
			//{{user_implement_dev:BUSINESS_GROUP_MST_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:BUSINESS_GROUP_MST_constractor

			return;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class T_BUSINESS_GROUP_QUERY extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  T_BUSINESS_GROUP_QUERY.\"BUSINESS_GROUP_CD\" AS \"BUSINESS_GROUP_CD\", "
+"  BUSINESS_GROUP_MST.\"BUSINESS_GROUP_NAME\" AS \"BUSINESS_GROUP_NAME\" "
+"FROM "
+"  T_BUSINESS_GROUP_QUERY, "
+"  BUSINESS_GROUP_MST "
+"WHERE "
+"  T_BUSINESS_GROUP_QUERY.\"BUSINESS_GROUP_CD\" = BUSINESS_GROUP_MST.\"BUSINESS_GROUP_CD\" "
+"  AND T_BUSINESS_GROUP_QUERY.\"QUERY_CD\" = ? "
+"ORDER BY "
+"  T_BUSINESS_GROUP_QUERY.\"BUSINESS_GROUP_CD\"";
		protected String m_chkcmd = null;
		protected String m_inscmd = "INSERT INTO "
+"  T_BUSINESS_GROUP_QUERY(\"QUERY_CD\", \"BUSINESS_GROUP_CD\", \"CREATED_DATE\", \"CREATED_BY\", \"CREATED_PRG_NM\", \"UPDATED_DATE\", \"UPDATED_BY\", \"UPDATED_PRG_NM\", \"MODIFY_COUNT\") "
+"VALUES "
+"  (?, ?, TO_DATE(?, 'yyyy/mm/dd hh24:mi:ss'), ?, ?, TO_DATE(?, 'yyyy/mm/dd hh24:mi:ss'), ?, ?, ?)";
		protected String m_updcmd = null;
		protected String m_delcmd = "DELETE FROM "
+"  T_BUSINESS_GROUP_QUERY "
+"WHERE "
+"  T_BUSINESS_GROUP_QUERY.\"QUERY_CD\" = ?";
		protected String m_spcmd = null;

		protected String m_sCreateProgramName="AZ0050010";
		protected String m_sUpdateProgramName="AZ0050010";
		protected int m_intMODIFY_COUNT=0;


		//////////////////////////////

		//{{user_implement_dev:T_BUSINESS_GROUP_QUERY_def
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:T_BUSINESS_GROUP_QUERY_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0050010Struct data) throws FoundationException, SQLException
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
		public List read(IDbConnection conn, AZ0050010Struct data, String replaceStr)
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
		public List read(IDbConnection conn, AZ0050010Struct data, String[] replaceStrs)
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
		public List read(Connection conn, AZ0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_BUSINESS_GROUP_QUERY_read
			if(m_selcmd==null) throw new FoundationException("T_BUSINESS_GROUP_QUERY", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_BUSINESS_GROUP_QUERY_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0050010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_BUSINESS_GROUP_QUERY_read2
			if(m_selcmd==null) throw new FoundationException("T_BUSINESS_GROUP_QUERY", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_BUSINESS_GROUP_QUERY_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0050010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_BUSINESS_GROUP_QUERY_read3
			if(m_selcmd==null) throw new FoundationException("T_BUSINESS_GROUP_QUERY", "read", "クエリー未登録");
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
                        //}}user_implement_dev:T_BUSINESS_GROUP_QUERY_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0050010Struct data) throws FoundationException, SQLException
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
		public PreparedStatement prepare(Connection conn, String query, AZ0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.getQUERY_CD());
				if(isNull(data.getQUERY_CD())) isNull = true;

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
		public ResultSet executeQuery(PreparedStatement stmt, AZ0050010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.getQUERY_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0050010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AZ0050010Struct data = new AZ0050010Struct();

			data.setSELECTED_GROUP_CD( getString(1, rs) );
			data.setSELECTED_GROUP_NAME( getString(2, rs) );

			return data;
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(IDbConnection conn, AZ0050010Struct data) throws FoundationException, SQLException
		{
			return hasRecord(conn.getConn(), data);
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean hasRecord(Connection conn, AZ0050010Struct data) throws FoundationException, SQLException
		{
			if(m_selcmd==null) throw new FoundationException("T_BUSINESS_GROUP_QUERY", "hasRecord", "クエリー未登録");

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
		public boolean check(IDbConnection conn, AZ0050010Struct data) throws FoundationException, SQLException
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
		public boolean check(Connection conn, AZ0050010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:T_BUSINESS_GROUP_QUERY_check
			PreparedStatement stmt = prepare(conn, m_selcmd, data);
			try {
				return check(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
                        //}}user_implement_dev:T_BUSINESS_GROUP_QUERY_check
		}

		/**
		 * entityには１つ以上のレコードを持っているか
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public boolean check(PreparedStatement stmt, AZ0050010Struct data) throws FoundationException, SQLException
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
		public int create(IDbConnection conn, AZ0050010Struct data) throws FoundationException, SQLException
		{
			return create(conn.getConn(), data);
		}

		/**
		 * レコード新規追加処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int create(Connection conn, AZ0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				stmt = conn.prepareStatement(m_inscmd);

				setString(1, data.getQUERY_CD(), stmt);
				setString(2, data.getBUSINESS_GROUP_CD(), stmt);
				setString(3, data.getCREATED_DATE(), stmt);
				setString(4, data.getCREATED_BY(), stmt);
				setString(5, data.getCREATED_PRG_NM(), stmt);
				setString(6, data.getUPDATED_DATE(), stmt);
				setString(7, data.getUPDATED_BY(), stmt);
				setString(8, data.getUPDATED_PRG_NM(), stmt);
				setString(9, data.getMODIFY_COUNT(), stmt);

				return stmt.executeUpdate();
			} finally {
				if(stmt!=null) {
					stmt.close();
					stmt = null;
				}
			}
		}
		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(IDbConnection conn, AZ0050010Struct data) throws FoundationException, SQLException
		{
			return delete(conn.getConn(), data);
		}

		/**
		 * データ削除処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public int delete(Connection conn, AZ0050010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt=null;

			try {
				stmt = conn.prepareStatement(m_delcmd);

				setString(1, data.getQUERY_CD(), stmt);

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
			//{{user_implement_dev:T_BUSINESS_GROUP_QUERY_clear
				// todo: インスタンス消滅時に実行する処理を記述してください
                        //}}user_implement_dev:T_BUSINESS_GROUP_QUERY_clear

			return;
		}

		/**
		 * T_BUSINESS_GROUP_QUERYクラスの標準コンストラクタ
		 */
		public T_BUSINESS_GROUP_QUERY()
		{
			//{{user_implement_dev:T_BUSINESS_GROUP_QUERY_constractor
				// TODO: ここに初期処理を記述してください
                        //}}user_implement_dev:T_BUSINESS_GROUP_QUERY_constractor

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
		mT_QUERY_INFO.clear();
		mT_QUERY_INFO = null;
		mT_QUERY_INFO4Update.clear();
		mT_QUERY_INFO4Update = null;
		mBUSINESS_GROUP_MST.clear();
		mBUSINESS_GROUP_MST = null;
		mT_BUSINESS_GROUP_QUERY.clear();
		mT_BUSINESS_GROUP_QUERY = null;
		return;
	}

	/**
	 * ログ部品インスタンス
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();
	public void setUsrId(String username) {objMessage.m_writer.setUserID(username);}	// ユーザIDをセットします。

	/**
	 * AZ0050010クラスの標準コンストラクタ
	 */
	public AZ0050010Entity() throws FoundationException
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
