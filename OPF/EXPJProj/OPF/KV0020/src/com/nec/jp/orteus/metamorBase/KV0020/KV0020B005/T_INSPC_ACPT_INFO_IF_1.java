/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KV0020/src/com/nec/jp/orteus/metamorBase/KV0020/KV0020B005/T_INSPC_ACPT_INFO_IF_1.java,v $
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
 * 3.1.0.1 (2003/10/30),Stored Procedure障害対応
 * 3.1.0.0 (2003/06/24),Stored Procedure対応
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
 * CLASS     : T_INSPC_ACPT_INFO_IF_1 クラス
 * ファイル・クラス説明
 * @author $Author: geng-jia $
 * @version $Revision: 1.9 $ $Date: 2015/12/03 08:55:57 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class T_INSPC_ACPT_INFO_IF_1 extends AbstractBatchAppEntity
{

	//////////////////////////////

	/**
	 * create()メソッドが利用できるかどうかを返す
	 *
	 * @return 利用できる場合にはTRUE、できない場合にはFALSEを返す
	 */
	public boolean canCreate() { return false; }

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

	//{{user_implement_dev:db_main
       
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
       
        //}}user_implement_dev:db_main

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

		public int create() throws BatchAppException
		{
			return BREAK;
		}


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

			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("T_INSPC_ACPT_INFO_IF_1", "read", "レコード検索条件設定処理失敗");
				be.addMessage(e.getErrmsg());
				throw be;
			}

			m_doRs = getRecordset(cache);

			return SUCCESS;
		}

		public void setSYSTEM_PROC_TYP_U(String value) throws FoundationException { getAdapt_U().setString(1, value); }
		public void setIN1_U(String value) throws FoundationException { getAdapt_U().setString(2, value); }

		public int update() throws BatchAppException
		{
			try {
				setSYSTEM_PROC_TYP_U(m_med.getSYSTEM_PROC_TYP());
				setIN1_U(m_med.getINSPC_ACPT_INFO_IF_CTRL_NO());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("T_INSPC_ACPT_INFO_IF_1", "update", "レコード更新条件設定処理失敗");
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

		public String getINSPC_ACPT_INFO_IF_CTRL_NO_R() throws FoundationException { return m_doRs.getString(1); }
		public String getINSPC_ACPT_AMOUNT_R() throws FoundationException { return m_doRs.getString(2); }
		public String getINSPC_ACPT_AMOUNT_EXCH_RATES_R() throws FoundationException { return m_doRs.getString(3); }
		public String getINSPC_ACPT_UNIT_PRICE_R() throws FoundationException { return m_doRs.getString(4); }
		public String getINSPC_ACPT_QTY_R() throws FoundationException { return m_doRs.getString(5); }
		public String getINSPC_ACPT_DATE_R() throws FoundationException { return m_doRs.getString(6); }
		public String getCUST_ODR_CD_R() throws FoundationException { return m_doRs.getString(7); }
		public String getUNIT_CD_R() throws FoundationException { return m_doRs.getString(8); }
		public String getDLV_CD_R() throws FoundationException { return m_doRs.getString(9); }
		public String getDLV_KEY_CD_R() throws FoundationException { return m_doRs.getString(10); }
		public String getDLV_LOC_CD_R() throws FoundationException { return m_doRs.getString(11); }
		public String getCLIENT_CD_R() throws FoundationException { return m_doRs.getString(12); }
		public String getCUST_ITEM_CD_R() throws FoundationException { return m_doRs.getString(13); }
		public String getSLIP_CD_R() throws FoundationException { return m_doRs.getString(14); }

		public boolean next() throws BatchAppException
		{
			try {
				if(m_doRs.next()==false) return false;

				m_med.setINSPC_ACPT_INFO_IF_CTRL_NO(getINSPC_ACPT_INFO_IF_CTRL_NO_R());
				m_med.setINSPC_ACPT_AMOUNT(getINSPC_ACPT_AMOUNT_R());
				m_med.setINSPC_ACPT_AMOUNT_EXCH_RATES(getINSPC_ACPT_AMOUNT_EXCH_RATES_R());
				m_med.setINSPC_ACPT_UNIT_PRICE(getINSPC_ACPT_UNIT_PRICE_R());
				m_med.setINSPC_ACPT_QTY(getINSPC_ACPT_QTY_R());
				m_med.setINSPC_ACPT_DATE(getINSPC_ACPT_DATE_R());
				m_med.setCUST_ODR_CD(getCUST_ODR_CD_R());
				m_med.setUNIT_CD(getUNIT_CD_R());
				m_med.setDLV_CD(getDLV_CD_R());
				m_med.setDLV_KEY_CD(getDLV_KEY_CD_R());
				m_med.setDLV_LOC_CD(getDLV_LOC_CD_R());
				m_med.setCLIENT_CD(getCLIENT_CD_R());
				m_med.setCUST_ITEM_CD(getCUST_ITEM_CD_R());
				m_med.setINSPC_ACPT_SLIP_CD(getSLIP_CD_R());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("T_INSPC_ACPT_INFO_IF_1", "next", "レコード移動失敗");
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
				BatchAppException be=new BatchAppException("T_INSPC_ACPT_INFO_IF_1", "hasRecord", "レコード存在チェック失敗");
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
			   sSP=m_calcmd;

		//{{user_implement_dev:prepare
                 // TODO: ここに準備処理を記述してください
                //}}user_implement_dev:prepare

		prepareCreate(sCREATE);
		prepareRead(sREAD);
		prepareUpdate(sUPDATE);
		prepareDelete(sDELETE);
		prepareSp(sSP);
		return;
	}

	//////////////////////////////

	/**
	 * T_INSPC_ACPT_INFO_IF_1クラスの標準コンストラクタ
	 *
		 */
	public T_INSPC_ACPT_INFO_IF_1(medKV0020B005 med, BatchAppConductor cdr) throws SystemException
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
	protected static String m_selcmd = "select INSPC_ACPT_INFO_IF_CTRL_NO "
+"     , INSPC_ACPT_AMOUNT "
+"     , INSPC_ACPT_AMOUNT_EXCH_RATES "
+"     , INSPC_ACPT_UNIT_PRICE "
+"     , INSPC_ACPT_QTY "
+"     , INSPC_ACPT_DATE "
+"     , rtrim(CUST_ODR_CD) "
+"     , rtrim(UNIT_CD) "
+"     , rtrim(DLV_CD) "
+"     , rtrim(DLV_KEY_CD) "
+"     , rtrim(DLV_LOC_CD) "
+"     , rtrim(CLIENT_CD) "
+"     , rtrim(CUST_ITEM_CD) "
+"     , rtrim(SLIP_CD) "
+"from   T_INSPC_ACPT_INFO_IF "
+"where  SYSTEM_PROC_TYP      = '0' "
+"   and DEL_FLG              = '0' "
+"";
	protected static String m_inscmd = null;
	protected static String m_updcmd = "update "
+"  T_INSPC_ACPT_INFO_IF "
+"set "
+"  \"SYSTEM_PROC_TYP\" = ?, "
+"  \"MODIFY_COUNT\" = MODIFY_COUNT + 1 "
+"where "
+"  T_INSPC_ACPT_INFO_IF.\"INSPC_ACPT_INFO_IF_CTRL_NO\" = ?";
	protected static String m_delcmd = null;
	protected static String m_calcmd = null;

	// トランザクション利用の可否を設定します
	boolean m_useTransaction=true;

	//////////////////////////////

}
