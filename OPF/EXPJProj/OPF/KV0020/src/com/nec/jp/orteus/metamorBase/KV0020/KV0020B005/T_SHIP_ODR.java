/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KV0020/src/com/nec/jp/orteus/metamorBase/KV0020/KV0020B005/T_SHIP_ODR.java,v $
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

package com.nec.jp.orteus.metamorBase.KV0020.KV0020B005;

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
 * CLASS     : T_SHIP_ODR クラス
 * ファイル・クラス説明
 * @author $Author: geng-jia $
 * @version $Revision: 1.9 $ $Date: 2015/12/03 08:55:58 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class T_SHIP_ODR extends AbstractBatchAppEntity
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
	public boolean canRead() { return false; }

	/**
	 * update()メソッドが利用できるかどうかを返す
	 *
	 * @return 利用できる場合にはTRUE、できない場合にはFALSEを返す
	 */
	public boolean canUpdate() { return false; }

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

		public void setSHIP_ODR_NO_C(String value) throws FoundationException { getAdapt_C().setString(7, value); }
		public void setSLIP_CD_C(String value) throws FoundationException { getAdapt_C().setString(8, value); }
		public void setITEM_CD_C(String value) throws FoundationException { getAdapt_C().setString(9, value); }
		public void setCUST_ITEM_CD_C(String value) throws FoundationException { getAdapt_C().setString(10, value); }
		public void setCUST_ODR_NO_C(String value) throws FoundationException { getAdapt_C().setString(11, value); }
		public void setCUST_CD_C(String value) throws FoundationException { getAdapt_C().setString(12, value); }
		public void setCUST_NAME_C(String value) throws FoundationException { getAdapt_C().setString(13, value); }
		public void setCUST_CHRG_PSN_CD_C(String value) throws FoundationException { getAdapt_C().setString(14, value); }
		public void setSHIP_ODR_ISS_PSN_CD_C(String value) throws FoundationException { getAdapt_C().setString(15, value); }
		public void setDLV_LOC_CD_C(String value) throws FoundationException { getAdapt_C().setString(16, value); }
		public void setDESINATED_SHIP_DATE_C(String value) throws FoundationException { getAdapt_C().setString(17, value); }
		public void setSHIP_QTY_C(String value) throws FoundationException { getAdapt_C().setString(18, value); }
		public void setTOTAL_SHIP_QTY_C(String value) throws FoundationException { getAdapt_C().setString(19, value); }
		public void setUNIT_CD_C(String value) throws FoundationException { getAdapt_C().setString(20, value); }
		public void setUNIT_PRICE_C(String value) throws FoundationException { getAdapt_C().setString(21, value); }
		public void setSHIP_ODR_AMOUNT_C(String value) throws FoundationException { getAdapt_C().setString(22, value); }
		public void setSHIP_ODR_AMOUNT_EXCH_RATES_C(String value) throws FoundationException { getAdapt_C().setString(23, value); }
		public void setCURRNCY_CD_C(String value) throws FoundationException { getAdapt_C().setString(24, value); }
		public void setPKG_UNIT_QTY_C(String value) throws FoundationException { getAdapt_C().setString(25, value); }
		public void setDLV_KEY_NO_C(String value) throws FoundationException { getAdapt_C().setString(26, value); }
		public void setTRANSFER_WH_CD_C(String value) throws FoundationException { getAdapt_C().setString(27, value); }

		public int create() throws BatchAppException
		{
			try {
				getAdapt_C().setString(1, m_med.getSysdate());
				getAdapt_C().setString(2, m_med.getUsername());
				getAdapt_C().setString(3, m_med.getProgname());
				getAdapt_C().setString(4, m_med.getSysdate());
				getAdapt_C().setString(5, m_med.getUsername());
				getAdapt_C().setString(6, m_med.getProgname());
				setSHIP_ODR_NO_C(m_med.getSHIP_ODR_NO());
				setSLIP_CD_C(m_med.getSLIP_CD());
				setITEM_CD_C(m_med.getITEM_CD());
				setCUST_ITEM_CD_C(m_med.getCUST_ITEM_CD());
				setCUST_ODR_NO_C(m_med.getCUST_ODR_CD());
				setCUST_CD_C(m_med.getCUST_CD());
				setCUST_NAME_C(m_med.getCUST_NAME());
				setCUST_CHRG_PSN_CD_C(m_med.getCUST_CHRG_PSN_CD());
				setSHIP_ODR_ISS_PSN_CD_C(m_med.getUSER_CD());
				setDLV_LOC_CD_C(m_med.getDLV_LOC_CD());
				setDESINATED_SHIP_DATE_C(m_med.getIN_DATE());
				setSHIP_QTY_C(m_med.getIN_QTY());
				setTOTAL_SHIP_QTY_C(m_med.getIN_QTY());
				setUNIT_CD_C(m_med.getUNIT_CD());
				setUNIT_PRICE_C(m_med.getIN_UNIT_PRICE());
				setSHIP_ODR_AMOUNT_C(m_med.getIN_AMOUNT());
				setSHIP_ODR_AMOUNT_EXCH_RATES_C(m_med.getIN_AMOUNT_EXCH_RATES());
				setCURRNCY_CD_C(m_med.getCUR_CD());
				setPKG_UNIT_QTY_C(m_med.getPKG_UNIT_QTY());
				setDLV_KEY_NO_C(m_med.getDLV_KEY_CD());
				setTRANSFER_WH_CD_C(m_med.getDEPO_WH_CD());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("T_SHIP_ODR", "create", "レコード新規追加パラメータ設定処理失敗");
				be.addMessage(e.getErrmsg());
				throw be;
			}

			executeCreate();

			return SUCCESS;
		}

		public int read() throws BatchAppException
		{
			return BREAK;
		}

		public int update() throws BatchAppException
		{
			return BREAK;
		}

		public int delete() throws BatchAppException
		{
			return BREAK;
		}

		public List call() throws BatchAppException
		{
			return null;
		}

		public boolean next() throws BatchAppException
		{
			return false;
		}

		public boolean hasRecord(boolean moveCursor) throws BatchAppException
		{
			return false;
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
			prepareUpdate(sUPDATE);
			prepareDelete(sDELETE);
			prepareSp(sSP);
		} catch(FoundationException e) {
			BatchAppException be=new BatchAppException("T_SHIP_ODR", "prepareALL(FoundationException)", "SQL文のprepareで失敗しました");
			be.addMessage(e.getErrmsg());
			throw be;
		} catch(SQLException e) {
			BatchAppException be=new BatchAppException("T_SHIP_ODR", "prepareALL(SQLException)", "SQL文のprepareで失敗しました");
			throw be;
		}

		return;
	}

	//////////////////////////////

	/**
	 * T_SHIP_ODRクラスの標準コンストラクタ
	 *
		 */
	public T_SHIP_ODR(medKV0020B005 med, BatchAppConductor cdr) throws SystemException
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
	public medKV0020B005 m_med=null;

	protected BatchAppConductor m_conductor;

	// interEntityクラスインスタンス
	public interEntity m_entity=new interEntity();

	// 各状態で実行するsql文の定義
	protected static String m_selcmd = null;
	protected static String m_inscmd = "insert into "
+"  T_SHIP_ODR(\"SHIP_ODR_NO\", \"SLIP_CD\", \"ITEM_CD\", \"CUST_ITEM_CD\", \"CUST_ODR_NO\", \"CUST_CD\", \"CUST_NAME\", \"CUST_CHRG_PSN_CD\", \"SHIP_ODR_ISS_PSN_CD\", \"DLV_LOC_CD\", \"DESINATED_SHIP_DATE\", \"SHIP_QTY\", \"TOTAL_SHIP_QTY\", \"UNIT_CD\", \"UNIT_PRICE\", \"SHIP_ODR_AMOUNT\", \"SHIP_ODR_AMOUNT_EXCH_RATES\", \"CURRNCY_CD\", \"PKG_UNIT_QTY\", \"DLV_KEY_NO\", \"TRANSFER_WH_CD\", \"DEPO_TYP\", \"RETURN_QTY\", \"PART_DLV_COUNT\", \"DIRECT_DLV_FLG\", \"ENTRY_TYP\", \"PRINT_FLG\", \"SHP_CMPLT_FLG\", \"DEPO_TRANSFER_PROC_FLG\", \"DEL_FLG\") "
+"values "
+"  (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, TO_DATE(?, 'YYYY/MM/DD'), ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 20, 1, 1, 0, 1, 1, 1, 1, 0) "
+"";
	protected static String m_updcmd = null;
	protected static String m_delcmd = null;
	protected String m_spcmd=null;

	// トランザクション利用の可否を設定します
	boolean m_useTransaction=true;

	//////////////////////////////

}
