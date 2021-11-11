/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0180/src/com/nec/jp/orteus/metamorBase/AE0180/AE0180B001/T_PUCH_ODR_TEMP.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0180.AE0180B001;

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
 * CLASS     : T_PUCH_ODR_TEMP クラス
 * ファイル・クラス説明
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.5 $ $Date: 2016/05/23 08:15:54 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class T_PUCH_ODR_TEMP extends AbstractBatchAppEntity
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
				BatchAppException be=new BatchAppException("T_PUCH_ODR_TEMP", "read", "レコード検索条件設定処理失敗");
				be.addMessage(e.getErrmsg());
				throw be;
			}

			m_doRs = getRecordset(cache);

			return SUCCESS;
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

		public String getPUCH_ODR_TEMP_CTL_NO_R() throws FoundationException { return m_doRs.getString(1); }
		public String getITEM_CD_R() throws FoundationException { return m_doRs.getString(2); }
		public String getPUCH_ODR_DLV_DATE_R() throws FoundationException { return m_doRs.getString(3); }
		public String getPUCH_ODR_START_DATE_R() throws FoundationException { return m_doRs.getString(4); }
		public String getPUCH_ODR_QTY_R() throws FoundationException { return m_doRs.getString(5); }
		public String getVEND_CD_R() throws FoundationException { return m_doRs.getString(6); }
		public String getJOB_ODR_CD_R() throws FoundationException { return m_doRs.getString(7); }
		public String getCONFIRM_DLV_DATE_R() throws FoundationException { return m_doRs.getString(8); }
		public String getWH_CD_R() throws FoundationException { return m_doRs.getString(9); }
		public String getPUCH_ODR_COMMENT_R() throws FoundationException { return m_doRs.getString(10); }
		public String getNON_NO_ITEM_FLG_R() throws FoundationException { return m_doRs.getString(11); }
		public String getNON_NO_ITEM_NAME_R() throws FoundationException { return m_doRs.getString(12); }
		public String getNON_NO_ITEM_TYP_R() throws FoundationException { return m_doRs.getString(13); }
		public String getNON_NO_ITEM_PUCH_ODR_UNIT_R() throws FoundationException { return m_doRs.getString(14); }
		public String getUNIT_COST_TYP_R() throws FoundationException { return m_doRs.getString(15); }
		public String getUNIT_COST_R() throws FoundationException { return m_doRs.getString(16); }
		public String getPROCESSING_COST_R() throws FoundationException { return m_doRs.getString(17); }
		public String getMATERIAL_COST_R() throws FoundationException { return m_doRs.getString(18); }
		public String getOTHER_OVERHEADS_R() throws FoundationException { return m_doRs.getString(19); }
		public String getNET_AMOUNT_R() throws FoundationException { return m_doRs.getString(20); }
		public String getEXCH_RATE_R() throws FoundationException { return m_doRs.getString(21); }
		public String getACCT_CD_R() throws FoundationException { return m_doRs.getString(22); }
		public String getDEPT_CD_R() throws FoundationException { return m_doRs.getString(23); }
		public String getPJ_CD_R() throws FoundationException { return m_doRs.getString(24); }
		public String getSEG_CONTENTS1_R() throws FoundationException { return m_doRs.getString(25); }
		public String getSEG_CONTENTS2_R() throws FoundationException { return m_doRs.getString(26); }
		public String getSEG_CONTENTS3_R() throws FoundationException { return m_doRs.getString(27); }
		public String getSEG_CONTENTS4_R() throws FoundationException { return m_doRs.getString(28); }

		public boolean next() throws BatchAppException
		{
			try {
				if(m_doRs.next()==false) return false;

				m_med.setPUCH_ODR_TEMP_CTL_NO(getPUCH_ODR_TEMP_CTL_NO_R());
				m_med.setITEM_CD(getITEM_CD_R());
				m_med.setPUCH_ODR_DLV_DATE(getPUCH_ODR_DLV_DATE_R());
				m_med.setPUCH_ODR_START_DATE(getPUCH_ODR_START_DATE_R());
				m_med.setPUCH_ODR_QTY(getPUCH_ODR_QTY_R());
				m_med.setVEND_CD(getVEND_CD_R());
				m_med.setJOB_ODR_CD(getJOB_ODR_CD_R());
				m_med.setCONFIRM_DLV_DATE(getCONFIRM_DLV_DATE_R());
				m_med.setWH_CD(getWH_CD_R());
				m_med.setPUCH_ODR_COMMENT(getPUCH_ODR_COMMENT_R());
				m_med.setNON_NO_ITEM_FLG(getNON_NO_ITEM_FLG_R());
				m_med.setNON_NO_ITEM_NAME(getNON_NO_ITEM_NAME_R());
				m_med.setNON_NO_ITEM_TYP(getNON_NO_ITEM_TYP_R());
				m_med.setNON_NO_ITEM_PUCH_ODR_UNIT(getNON_NO_ITEM_PUCH_ODR_UNIT_R());
				m_med.setUNIT_COST_TYP(getUNIT_COST_TYP_R());
				m_med.setUNIT_COST(getUNIT_COST_R());
				m_med.setPROCESSING_COST(getPROCESSING_COST_R());
				m_med.setMATERIAL_COST(getMATERIAL_COST_R());
				m_med.setOTHER_OVERHEADS(getOTHER_OVERHEADS_R());
				m_med.setNET_AMOUNT(getNET_AMOUNT_R());
				m_med.setEXCH_RATE(getEXCH_RATE_R());
				m_med.setACCT_CD(getACCT_CD_R());
				m_med.setDEPT_CD(getDEPT_CD_R());
				m_med.setPJ_CD(getPJ_CD_R());
				m_med.setSEG_CONTENTS1(getSEG_CONTENTS1_R());
				m_med.setSEG_CONTENTS2(getSEG_CONTENTS2_R());
				m_med.setSEG_CONTENTS3(getSEG_CONTENTS3_R());
				m_med.setSEG_CONTENTS4(getSEG_CONTENTS4_R());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("T_PUCH_ODR_TEMP", "next", "レコード移動失敗");
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
				BatchAppException be=new BatchAppException("T_PUCH_ODR_TEMP", "hasRecord", "レコード存在チェック失敗");
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
	 * T_PUCH_ODR_TEMPクラスの標準コンストラクタ
	 *
		 */
	public T_PUCH_ODR_TEMP(medAE0180B001 med, BatchAppConductor cdr) throws SystemException
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
	public medAE0180B001 m_med=null;

	protected BatchAppConductor m_conductor;

	// interEntityクラスインスタンス
	public interEntity m_entity=new interEntity();

	// 各状態で実行するsql文の定義
	protected static String m_selcmd = "SELECT "
+"  T_PUCH_ODR_TEMP.\"PUCH_ODR_TEMP_CTL_NO\" AS \"PUCH_ODR_TEMP_CTL_NO\", "
+"  T_PUCH_ODR_TEMP.\"ITEM_CD\" AS \"ITEM_CD\", "
+"  TO_CHAR(T_PUCH_ODR_TEMP.\"PUCH_ODR_DLV_DATE\", 'YYYY/MM/DD') AS \"PUCH_ODR_DLV_DATE\", "
+"  TO_CHAR(T_PUCH_ODR_TEMP.\"PUCH_ODR_START_DATE\", 'YYYY/MM/DD') AS \"PUCH_ODR_START_DATE\", "
+"  T_PUCH_ODR_TEMP.\"PUCH_ODR_QTY\" AS \"PUCH_ODR_QTY\", "
+"  T_PUCH_ODR_TEMP.\"VEND_CD\" AS \"VEND_CD\", "
+"  T_PUCH_ODR_TEMP.\"JOB_ODR_CD\" AS \"JOB_ODR_CD\", "
+"  TO_CHAR(T_PUCH_ODR_TEMP.\"CONFIRM_DLV_DATE\", 'YYYY/MM/DD') AS \"CONFIRM_DLV_DATE\", "
+"  T_PUCH_ODR_TEMP.\"WH_CD\" AS \"WH_CD\", "
+"  T_PUCH_ODR_TEMP.\"PUCH_ODR_COMMENT\" AS \"PUCH_ODR_COMMENT\", "
+"  T_PUCH_ODR_TEMP.\"NON_NO_ITEM_FLG\" AS \"NON_NO_ITEM_FLG\", "
+"  T_PUCH_ODR_TEMP.\"NON_NO_ITEM_NAME\" AS \"NON_NO_ITEM_NAME\", "
+"  T_PUCH_ODR_TEMP.\"NON_NO_ITEM_TYP\" AS \"NON_NO_ITEM_TYP\", "
+"  T_PUCH_ODR_TEMP.\"NON_NO_ITEM_PUCH_ODR_UNIT\" AS \"NON_NO_ITEM_PUCH_ODR_UNIT\", "
+"  T_PUCH_ODR_TEMP.\"UNIT_COST_TYP\" AS \"UNIT_COST_TYP\", "
+"  T_PUCH_ODR_TEMP.\"UNIT_COST\" AS \"UNIT_COST\", "
+"  T_PUCH_ODR_TEMP.\"PROCESSING_COST\" AS \"PROCESSING_COST\", "
+"  T_PUCH_ODR_TEMP.\"MATERIAL_COST\" AS \"MATERIAL_COST\", "
+"  T_PUCH_ODR_TEMP.\"OTHER_OVERHEADS\" AS \"OTHER_OVERHEADS\", "
+"  T_PUCH_ODR_TEMP.\"NET_AMOUNT\" AS \"NET_AMOUNT\", "
+"  T_PUCH_ODR_TEMP.\"EXCH_RATE\" AS \"EXCH_RATE\", "
+"  T_PUCH_ODR_TEMP.\"ACCT_CD\" AS \"ACCT_CD\", "
+"  T_PUCH_ODR_TEMP.\"DEPT_CD\" AS \"DEPT_CD\", "
+"  T_PUCH_ODR_TEMP.\"PJ_CD\" AS \"PJ_CD\", "
+"  T_PUCH_ODR_TEMP.\"SEG_CONTENTS1\" AS \"SEG_CONTENTS1\", "
+"  T_PUCH_ODR_TEMP.\"SEG_CONTENTS2\" AS \"SEG_CONTENTS2\", "
+"  T_PUCH_ODR_TEMP.\"SEG_CONTENTS3\" AS \"SEG_CONTENTS3\", "
+"  T_PUCH_ODR_TEMP.\"SEG_CONTENTS4\" AS \"SEG_CONTENTS4\" "
+"FROM "
+"  T_PUCH_ODR_TEMP";
	protected static String m_inscmd = null;
	protected static String m_updcmd = null;
	protected static String m_delcmd = null;
	protected static String m_calcmd = null;

	// トランザクション利用の可否を設定します
	boolean m_useTransaction=true;

	//////////////////////////////

}
