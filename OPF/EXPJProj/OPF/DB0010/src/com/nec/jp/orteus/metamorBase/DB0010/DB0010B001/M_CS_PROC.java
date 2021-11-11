/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DB0010/src/com/nec/jp/orteus/metamorBase/DB0010/DB0010B001/M_CS_PROC.java,v $
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
 * EXPJ    (2004/04/05),メソッドコメントの「* @param なし」をすべて削除
 *                     ,メソッドコメントの「* @return なし」をすべて削除
 *                     ,EXPLANNER/J用に改造
 * 3.1.1.0 (2004/12/21),MySQLとPostgresqlの対応
 * 3.1.0.0 (2003/07/04),StoredProcedure対応
 * 3.0.0.0 (2003/03/19),mediatorリポジトリ情報修正
 * 2.1.0.0 (2002/11/05),検索EntityのCacheモード対応
 * 2.0.2.0 (2002/10/15),DB2対応
 * 2.0.1.0 (2002/08/05),MS SQLServer2000対応
 * 2.0.0.0 (2002/05/27),new foundation対応
 *
 */

package com.nec.jp.orteus.metamorBase.DB0010.DB0010B001;

import com.nec.jp.orteus.util.*;
import com.nec.jp.orteus.xaf.foundation.*;
import com.nec.jp.orteus.xaf.util.*;
import com.nec.jp.orteus.xaf.ba.*;
import com.nec.jp.orteus.xaf.wa.*;

import java.lang.Number.*;
import java.sql.*;
import java.util.*;
import java.util.Date;
import java.io.*;

//{{user_implement_dev:import
 // TODO: ここにimportパッケージを記述してください
//}}user_implement_dev:import

/**
 * CLASS     : M_CS_PROC クラス
 * ファイル・クラス説明
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.6 $ $Date: 2014/11/05 07:20:41 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class M_CS_PROC extends AbstractBatchAppEntity
{

	//////////////////////////////

	/**
	 * create()メソッドが利用できるかどうかを返す
	 *
	 * @return 利用できる場合にはTRUE、できない場合にはFALSEを返す
	 */
	public boolean canCreate() { return true; }

	/**
	 * read()メソッドが利用できるかどうかを返す
	 *
	 * @return 利用できる場合にはTRUE、できない場合にはFALSEを返す
	 */
	public boolean canRead() { return true; }

	/**
	 * update()メソッドが利用できるかどうかを返す
	 *
	 * @return 利用できる場合にはTRUE、できない場合にはFALSEを返す
	 */
	public boolean canUpdate() { return true; }

	/**
	 * delete()メソッドが利用できるかどうかを返す
	 *
	 * @return 利用できる場合にはTRUE、できない場合にはFALSEを返す
	 */
	public boolean canDelete() { return false; }

	/**
	 * call()メソッドが利用できるかどうかを返す
	 *
	 * @return 利用できる場合にはTRUE、できない場合にはFALSEを返す
	 */
	public boolean canCall() { return false; }

	/**
	 * ログ部品インスタンス
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();

	//////////////////////////////

        //{{user_implement_dev:stddb_main
       
        /**
         * 初期処理
         *
         * @return <<コメントを記述してください>>
         * @exception <<コメントを記述してください>>
         */
        public int beginProc() throws BatchAppException
        {
         return m_entity.beginProc();
        }
       
        /**
         * 終了処理
         *
         * @exception <<コメントを記述してください>>
         */
        public int endProc() throws BatchAppException
        {
         return m_entity.endProc();
        }
       
        /**
         * ＤＢアクセス処理を実行します
         *
         * @exception <<コメントを記述してください>>
         */
        public int execute() throws BatchAppException
        {
         return m_entity.execute();
        }
       
        /**
         * レコード新規追加処理
         *
         * @exception <<コメントを記述してください>>
         */
        public int create() throws BatchAppException
        {
         return m_entity.create();
        }
       
        /**
         * データ読出し処理
         *
         * @exception <<コメントを記述してください>>
         */
        public int read() throws BatchAppException
        {
         return m_entity.read();
        }
       
        /**
         * データ更新処理
         *
         * @exception <<コメントを記述してください>>
         */
        public int update() throws BatchAppException
        {
         return m_entity.update();
        }
       
        /**
         * データ削除処理
         *
         * @exception <<コメントを記述してください>>
         */
        public int delete() throws BatchAppException
        {
         return m_entity.delete();
        }
       
        /**
         * Stored Procedure処理
         *
         * @exception <<コメントを記述してください>>
         */
        public List call() throws BatchAppException
        {
         return m_entity.call();
        }
       
        /**
         * カレントレコードに対してアクセスする
         *
         * @exception <<コメントを記述してください>>
         */
        public boolean next() throws BatchAppException
        {
         return m_entity.next();
        }
       
        /**
         * entityには１つ以上のレコードを持っているか
         *
         * @exception <<コメントを記述してください>>
         */
        public boolean hasRecord(boolean moveCursor) throws BatchAppException
        {
         return m_entity.hasRecord(moveCursor);
        }
       
        //}}user_implement_dev:stddb_main

	//{{entity_class(wizard code)

	//////////////////////////////

	class interEntity
	{

		//////////////////////////////

		// Cacheモード
		private boolean bCachemode = true;
		public boolean getCacheMode() { return bCachemode; }
		public void setCacheMode( boolean bFlag ) { bCachemode = bFlag; }

		// DBレコードコレクションクラス インスタンス
		protected IDbRecordset m_doRs=null;

		// 日付クラスインスタンス
		public java.sql.Date m_dat=null;

		//////////////////////////////

		public int beginProc() throws BatchAppException
		{
			// SQL文をprepareします
			prepareAll();

			return SUCCESS;
		}

		public int endProc() throws BatchAppException
		{

			clearAll();

			return SUCCESS;
		}

		public int execute() throws BatchAppException
		{
			int ret = SUCCESS;


			return ret;
		}

		public void setPLANT_CD_C(String value) throws FoundationException { getAdapt_C().setString(7, value); }
		public void setCS_PROC_CD_C(String value) throws FoundationException { getAdapt_C().setString(8, value); }
		public void setRCY_TYP_CD_C(String value) throws FoundationException { getAdapt_C().setString(9, value); }
		public void setCS_PROC_NAME_C(String value) throws FoundationException { getAdapt_C().setString(10, value); }
		public void setWS_CD_C(String value) throws FoundationException { getAdapt_C().setString(11, value); }
		public void setOUTSIDE_TYP_C(String value) throws FoundationException { getAdapt_C().setString(12, value); }
		public void setVEND_CD_C(String value) throws FoundationException { getAdapt_C().setString(13, value); }
		public void setSTD_COST_OF_MONTH_C(String value) throws FoundationException { getAdapt_C().setString(14, value); }
		public void setSTD_COST_UNIT_TYP_C(String value) throws FoundationException { getAdapt_C().setString(15, value); }
		public void setCOMPANY_CD_C(String value) throws FoundationException { getAdapt_C().setString(16, value); }
		public void setORG_CD_C(String value) throws FoundationException { getAdapt_C().setString(17, value); }

		public int create() throws BatchAppException
		{
			try {
				getAdapt_C().setString(1, m_med.getSysdate());
				getAdapt_C().setString(2, m_med.getUsername());
				getAdapt_C().setString(3, m_med.getProgname());
				getAdapt_C().setString(4, m_med.getSysdate());
				getAdapt_C().setString(5, m_med.getUsername());
				getAdapt_C().setString(6, m_med.getProgname());
				setPLANT_CD_C(m_med.getPLANT_CD());
				setCS_PROC_CD_C(m_med.getPROC_CD());
				setRCY_TYP_CD_C(m_med.getRCY_TYP_CD());
				setCS_PROC_NAME_C(m_med.getPROC_NAME());
				setWS_CD_C(m_med.getWS_CD());
				setOUTSIDE_TYP_C(m_med.getOUTSIDE_TYP());
				setVEND_CD_C(m_med.getVEND_CD());
				setSTD_COST_OF_MONTH_C(m_med.getSTD_COST_OF_MONTH());
				setSTD_COST_UNIT_TYP_C(m_med.getSTD_COST_UNIT_TYP());
				setCOMPANY_CD_C(m_med.getCOMPANY_CD());
				setORG_CD_C(m_med.getORG_CD());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("M_CS_PROC", "create", "レコード新規追加パラメータ設定処理失敗");
				be.addMessage(e.getErrmsg());
				throw be;
			}

			executeCreate();

			return SUCCESS;
		}

		public void setIN1_R(String value) throws FoundationException { getAdapt_R().setString(1, value); }
		public void setIN2_R(String value) throws FoundationException { getAdapt_R().setString(2, value); }

		public int read() throws BatchAppException
		{
			return read(bCachemode);
		}

		public int read(boolean cache) throws BatchAppException
		{
			try {
				if(m_doRs!=null) {
					m_doRs.close();
					m_doRs = null;
				}

				setIN1_R(m_med.getPLANT_CD());
				setIN2_R(m_med.getPROC_CD());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("M_CS_PROC", "read", "レコード検索条件設定処理失敗");
				be.addMessage(e.getErrmsg());
				throw be;
			}

			m_doRs = getRecordset(cache);

			return SUCCESS;
		}

		public void setCS_PROC_NAME_U(String value) throws FoundationException { getAdapt_U().setString(4, value); }
		public void setWS_CD_U(String value) throws FoundationException { getAdapt_U().setString(5, value); }
		public void setOUTSIDE_TYP_U(String value) throws FoundationException { getAdapt_U().setString(6, value); }
		public void setVEND_CD_U(String value) throws FoundationException { getAdapt_U().setString(7, value); }
		public void setSTD_COST_OF_MONTH_U(String value) throws FoundationException { getAdapt_U().setString(8, value); }
		public void setSTD_COST_UNIT_TYP_U(String value) throws FoundationException { getAdapt_U().setString(9, value); }
		public void setCOMPANY_CD_U(String value) throws FoundationException { getAdapt_U().setString(10, value); }
		public void setORG_CD_U(String value) throws FoundationException { getAdapt_U().setString(11, value); }
		public void setIN8_U(String value) throws FoundationException { getAdapt_U().setString(12, value); }
		public void setIN9_U(String value) throws FoundationException { getAdapt_U().setString(13, value); }

		public int update() throws BatchAppException
		{
			try {
				getAdapt_U().setString(1, m_med.getSysdate());
				getAdapt_U().setString(2, m_med.getUsername());
				getAdapt_U().setString(3, m_med.getProgname());
				setCS_PROC_NAME_U(m_med.getPROC_NAME());
				setWS_CD_U(m_med.getWS_CD());
				setOUTSIDE_TYP_U(m_med.getOUTSIDE_TYP());
				setVEND_CD_U(m_med.getVEND_CD());
				setSTD_COST_OF_MONTH_U(m_med.getSTD_COST_OF_MONTH());
				setSTD_COST_UNIT_TYP_U(m_med.getSTD_COST_UNIT_TYP());
				setCOMPANY_CD_U(m_med.getCOMPANY_CD());
				setORG_CD_U(m_med.getORG_CD());
				setIN8_U(m_med.getPLANT_CD());
				setIN9_U(m_med.getPROC_CD());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("M_CS_PROC", "update", "レコード更新条件設定処理失敗");
				be.addMessage(e.getErrmsg());
				throw be;
			}

			executeUpdate();

			return SUCCESS;
		}

		public int delete() throws BatchAppException
		{
			return BREAK;
		}

		public List call() throws BatchAppException
		{
			return null;
		}

		public String getUPDATE_TYP_R() throws FoundationException { return m_doRs.getString(1); }

		public boolean next() throws BatchAppException
		{
			try {
				if(m_doRs.next()==false) return false;

				m_med.setUPDATE_TYP(getUPDATE_TYP_R());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("M_CS_PROC", "next", "レコード移動失敗");
				be.addMessage(e.getErrmsg());
				throw be;
			}

			return true;
		}

		public boolean hasRecord(boolean moveCursor) throws BatchAppException
		{
			if(read(false)!=SUCCESS) return false;

			try {
				boolean ret;

				if(moveCursor) {
					ret = next();
				} else {
					ret = m_doRs.next();
				}

				m_doRs.close();
				m_doRs = null;

				return ret;
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("M_CS_PROC", "hasRecord", "レコード存在チェック失敗");
				be.addMessage(e.getErrmsg());
				throw be;
			}
		}

		//////////////////////////////

	}

	//}}entity_class(wizard code)

	//////////////////////////////

	/**
	 * DBに対して接続します
	 */
	void open() throws SystemException
	{
		try {
			setConnection( m_conductor.m_transactionConn );
		} catch(BatchAppException e) {
			throw new SystemException("SYSERR", "コネクションの設定に失敗しました", null, null, e);
		}

		return;
	}

	/**
	 * SQL文をprepareします
	 *
		 */
	void prepareAll() throws BatchAppException
	{
		String sCREATE=m_inscmd,
			   sREAD=m_selcmd,
			   sUPDATE=m_updcmd,
			   sDELETE=m_delcmd,
			   sSP=m_spcmd;

                //{{user_implement_dev:prepare
                 // TODO: ここに準備処理を記述してください
                //}}user_implement_dev:prepare

		try {
			if("Oracle".equals(m_conductor.m_transactionConn.getConn().getMetaData().getDatabaseProductName())) {
				prepareCreate(objMessage.replaceSQL_I(sCREATE));
			} else if("Microsoft SQL Server".equals(m_conductor.m_transactionConn.getConn().getMetaData().getDatabaseProductName())) {
				prepareCreate(objMessage.replaceSQL_I_MSSQL(sCREATE));
			} else if("PostgreSQL".equals(m_conductor.m_transactionConn.getConn().getMetaData().getDatabaseProductName())) {
				prepareCreate(objMessage.replaceSQL_I_PGSQL(sCREATE));
			} else if("MySQL".equals(m_conductor.m_transactionConn.getConn().getMetaData().getDatabaseProductName())) {
				prepareCreate(objMessage.replaceSQL_I_MYSQL(sCREATE));
			} else {
				prepareCreate(objMessage.replaceSQL_I_DB2(sCREATE));
			}
			prepareRead(sREAD);
			if("Oracle".equals(m_conductor.m_transactionConn.getConn().getMetaData().getDatabaseProductName())) {
				prepareUpdate(objMessage.replaceSQL_U(sUPDATE));
			} else if("Microsoft SQL Server".equals(m_conductor.m_transactionConn.getConn().getMetaData().getDatabaseProductName())) {
				prepareUpdate(objMessage.replaceSQL_U_MSSQL(sUPDATE));
			} else if("PostgreSQL".equals(m_conductor.m_transactionConn.getConn().getMetaData().getDatabaseProductName())) {
				prepareUpdate(objMessage.replaceSQL_U_PGSQL(sUPDATE));
			} else if("MySQL".equals(m_conductor.m_transactionConn.getConn().getMetaData().getDatabaseProductName())) {
				prepareUpdate(objMessage.replaceSQL_U_MYSQL(sUPDATE));
			} else {
				prepareUpdate(objMessage.replaceSQL_U_DB2(sUPDATE));
			}
			prepareDelete(sDELETE);
			prepareSp(sSP);
		} catch(FoundationException e) {
			BatchAppException be=new BatchAppException("M_CS_PROC", "prepareALL(FoundationException)", "SQL文のprepareで失敗しました");
			be.addMessage(e.getErrmsg());
			throw be;
		} catch(SQLException e) {
			BatchAppException be=new BatchAppException("M_CS_PROC", "prepareALL(SQLException)", "SQL文のprepareで失敗しました");
			throw be;
		}

		return;
	}

	//////////////////////////////

	/**
	 * M_CS_PROCクラスの標準コンストラクタ
	 *
		 */
	public M_CS_PROC(medDB0010B001 med, BatchAppConductor cdr) throws SystemException
	{
                //{{user_implement_dev:constractor
                 // TODO: ここに初期処理を記述してください
                //}}user_implement_dev:constractor

		try {
			m_container = new ManageContainer();
		} catch(FoundationException e) {
			throw new SystemException("SYSERR", "コンテナ接続に失敗しました", null, null, e);
		}

		m_med = med;
		m_conductor = cdr;

		// DBに接続します
		open();

		return;
	}

	/**
	 * インスタンス破壊時に行う処理
	 *
		 */
	protected void finalize()
	{
		try {
			// DB接続を切断します
			close();
		} catch(BatchAppException e) {
			System.out.println(e.getErrmsg());
		}

		// 各メンバ変数の初期化
		m_med = null;
		objMessage = null;

		// todo: インスタンス消滅時に実行する処理を記述してください

		return;
	}

	//////////////////////////////

	ManageContainer m_container;

	// mediatorクラス インスタンス
	public medDB0010B001 m_med=null;

	protected BatchAppConductor m_conductor;

	// interEntityクラスインスタンス
	public interEntity m_entity=new interEntity();

	// 各状態で実行するsql文の定義
	protected static String m_selcmd = "select "
+"  to_char(M_CS_PROC.\"UPDATE_TYP\") as \"UPDATE_TYP\" "
+"from "
+"  M_CS_PROC "
+"where "
+"  M_CS_PROC.\"PLANT_CD\" = ? "
+"  and M_CS_PROC.\"CS_PROC_CD\" = ?";
	protected static String m_inscmd = "insert into "
+"  M_CS_PROC(\"PLANT_CD\", \"CS_PROC_CD\", \"RCY_TYP_CD\", \"CS_PROC_NAME\", \"WS_CD\", \"OUTSIDE_TYP\", \"VEND_CD\", \"STD_COST_OF_MONTH\", \"STD_COST_UNIT_TYP\", \"UPDATE_TYP\", \"DEL_FLG\", \"COMPANY_CD\", \"ORG_CD\") "
+"values "
+"  (?, ?, ?, ?, ?, to_number(?), ?, to_number(?), to_number(?), 1, 0, ?, ?)";
	protected static String m_updcmd = "update "
+"  M_CS_PROC "
+"set "
+"  \"CS_PROC_NAME\" = ?, "
+"  \"WS_CD\" = ?, "
+"  \"OUTSIDE_TYP\" = to_number(?), "
+"  \"VEND_CD\" = ?, "
+"  \"STD_COST_OF_MONTH\" = to_number(?), "
+"  \"STD_COST_UNIT_TYP\" = to_number(?), "
+"  \"UPDATE_TYP\" = 1, "
+"  \"DEL_FLG\" = 0, "
+"  \"COMPANY_CD\" = ?, "
+"  \"ORG_CD\" = ? "
+"where "
+"  M_CS_PROC.\"PLANT_CD\" = ? "
+"  and M_CS_PROC.\"CS_PROC_CD\" = ?";
	protected static String m_delcmd = null;
	protected String m_spcmd=null;

	// トランザクション利用の可否を設定します
	boolean m_useTransaction=true;

	//////////////////////////////

}
