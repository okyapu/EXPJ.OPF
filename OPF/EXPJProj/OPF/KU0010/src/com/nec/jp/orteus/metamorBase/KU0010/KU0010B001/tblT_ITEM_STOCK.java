/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KU0010/src/com/nec/jp/orteus/metamorBase/KU0010/KU0010B001/tblT_ITEM_STOCK.java,v $
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

package com.nec.jp.orteus.metamorBase.KU0010.KU0010B001;

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
 * CLASS     : tblT_ITEM_STOCK クラス
 * ファイル・クラス説明
 * @author $Author: geng-jia $
 * @version $Revision: 1.18 $ $Date: 2015/12/03 08:16:05 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class tblT_ITEM_STOCK extends AbstractBatchAppEntity
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

		public int create() throws BatchAppException
		{
			return BREAK;
		}

		public void setIN6_R(String value) throws FoundationException { getAdapt_R().setString(1, value); }
		public void setIN7_R(String value) throws FoundationException { getAdapt_R().setString(2, value); }
		public void setIN8_R(String value) throws FoundationException { getAdapt_R().setString(3, value); }
		public void setIN9_R(String value) throws FoundationException { getAdapt_R().setString(4, value); }

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

				setIN6_R(m_med.getreadTItemStockIN_ITEMCD());
				setIN7_R(m_med.getreadTItemStockIN_WHTYP());
				setIN8_R(m_med.getreadTItemStockIN_WHTYP());
				setIN9_R(m_med.getreadTItemStockIN_ITEMCD());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("tblT_ITEM_STOCK", "read", "レコード検索条件設定処理失敗");
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

		public String getITEM_CD_R() throws FoundationException { return m_doRs.getString(1); }
		public String getWH_CD_R() throws FoundationException { return m_doRs.getString(2); }
		public String getPLANT_CD_R() throws FoundationException { return m_doRs.getString(3); }
		public String getSTOCK_ON_HAND_QTY_R() throws FoundationException { return m_doRs.getString(4); }
		public String getWH_TYP_R() throws FoundationException { return m_doRs.getString(5); }
		public String getPBL_SHIP_QTY_R() throws FoundationException { return m_doRs.getString(6); }

		public boolean next() throws BatchAppException
		{
			try {
				if(m_doRs.next()==false) return false;

				m_med.setreadTItemStockITEM_CD(getITEM_CD_R());
				m_med.setreadTItemStockWH_CD(getWH_CD_R());
				m_med.setreadTItemStockPLANT_CD(getPLANT_CD_R());
				m_med.setreadTItemStockSTOCK_ON_HAND_QTY(getSTOCK_ON_HAND_QTY_R());
				m_med.setreadTItemStockWH_TYP(getWH_TYP_R());
				m_med.setreadTItemStockYUKOSU(getPBL_SHIP_QTY_R());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("tblT_ITEM_STOCK", "next", "レコード移動失敗");
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
				BatchAppException be=new BatchAppException("tblT_ITEM_STOCK", "hasRecord", "レコード存在チェック失敗");
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

			prepareCreate(sCREATE);
			prepareRead(sREAD);
			prepareUpdate(sUPDATE);
			prepareDelete(sDELETE);
			prepareSp(sSP);

		return;
	}

	//////////////////////////////

	/**
	 * tblT_ITEM_STOCKクラスの標準コンストラクタ
	 *
		 */
	public tblT_ITEM_STOCK(medKU0010B001 med, BatchAppConductor cdr) throws SystemException
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
	public medKU0010B001 m_med=null;

	protected BatchAppConductor m_conductor;

	// interEntityクラスインスタンス
	public interEntity m_entity=new interEntity();

	// 各状態で実行するsql文の定義
	protected static String m_selcmd = "select "
+"  T_ITEM_STOCK.\"ITEM_CD\" as \"ITEM_CD\", "
+"  M_WH.\"WH_CD\" as \"WH_CD\", "
+"  T_ITEM_STOCK.\"PLANT_CD\" as \"PLANT_CD\", "
+"  NVL(T_ITEM_STOCK.\"STOCK_ON_HAND_QTY\", 0) as \"STOCK_ON_HAND_QTY\", "
+"  M_WH.\"WH_TYP\" as \"WH_TYP\", "
+"  DECODE(T_SHIP_ODR_NEW.\"REST_DTY\", null, T_ITEM_STOCK.\"STOCK_ON_HAND_QTY\", T_ITEM_STOCK.\"STOCK_ON_HAND_QTY\" - T_SHIP_ODR_NEW.\"REST_DTY\") as \"PBL_SHIP_QTY\" "
+"from "
+"  M_WH, "
+"  T_ITEM_STOCK, "
+"  ( "
+"    select "
+"      T_SHIP_ODR_REAL.\"ITEM_CD\", "
+"      T_SHIP_ODR_REAL.\"ALLCT_WH_CD\", "
+"      sum(T_SHIP_ODR_REAL.\"SHIP_QTY\" - T_SHIP_ODR_REAL.\"TOTAL_SHIP_QTY\") as REST_DTY "
+"    FROM "
+"      ( "
+"        select distinct "
+"          T_SHIP_ODR.\"SLIP_CD\" as SLIP_CD, "
+"          T_SHIP_ODR.\"ITEM_CD\" as ITEM_CD, "
+"          T_SHIP_ODR.\"SHIP_QTY\" as SHIP_QTY, "
+"          T_SHIP_ODR.\"TOTAL_SHIP_QTY\" as TOTAL_SHIP_QTY, "
+"          T_SHIP_ODR.\"RETURN_QTY\", "
+"          DECODE(T_SHIP.\"ALLCT_WH_CD\", NULL, T_SHIP_ODR.\"ALLCT_WH_CD\", T_SHIP.\"ALLCT_WH_CD\") as ALLCT_WH_CD "
+"        from "
+"          T_SHIP_ODR, "
+"          T_SHIP "
+"        where "
+"          T_SHIP_ODR.\"SLIP_CD\" = T_SHIP.\"SLIP_CD\"(+) "
+"          AND T_SHIP_ODR.JOB_ODR_CD IS NULL "
+"      ) T_SHIP_ODR_REAL "
+"    WHERE "
+"      T_SHIP_ODR_REAL.\"ITEM_CD\" = ? "
+"      and T_SHIP_ODR_REAL.\"ALLCT_WH_CD\" = ? "
+"    group by "
+"      T_SHIP_ODR_REAL.\"ITEM_CD\", "
+"      T_SHIP_ODR_REAL.\"ALLCT_WH_CD\" "
+"  ) T_SHIP_ODR_NEW "
+"where "
+"  M_WH.WH_CD = T_ITEM_STOCK.WH_CD "
+"  AND M_WH.\"WH_CD\" = ? "
+"  and M_WH.\"WH_TYP\" = 10 "
+"  and T_ITEM_STOCK.\"ITEM_CD\" = ? "
+"  and T_ITEM_STOCK.\"ITEM_CD\" = T_SHIP_ODR_NEW.\"ITEM_CD\"(+) "
+"  and T_ITEM_STOCK.\"WH_CD\" = T_SHIP_ODR_NEW.\"ALLCT_WH_CD\"(+)";
	protected static String m_inscmd = null;
	protected static String m_updcmd = null;
	protected static String m_delcmd = null;
	protected String m_spcmd=null;

	// トランザクション利用の可否を設定します
	boolean m_useTransaction=true;

	//////////////////////////////

}
