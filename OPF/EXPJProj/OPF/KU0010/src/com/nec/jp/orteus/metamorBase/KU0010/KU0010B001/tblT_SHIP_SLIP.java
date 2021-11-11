/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KU0010/src/com/nec/jp/orteus/metamorBase/KU0010/KU0010B001/tblT_SHIP_SLIP.java,v $
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
 * CLASS     : tblT_SHIP_SLIP クラス
 * ファイル・クラス説明
 * @author $Author: geng-jia $
 * @version $Revision: 1.18 $ $Date: 2015/12/03 08:16:07 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class tblT_SHIP_SLIP extends AbstractBatchAppEntity
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

		public void setSLIP_CD_C(String value) throws FoundationException { getAdapt_C().setString(7, value); }
		public void setITEM_CD_C(String value) throws FoundationException { getAdapt_C().setString(8, value); }
		public void setCUST_ITEM_CD_C(String value) throws FoundationException { getAdapt_C().setString(9, value); }
		public void setPART_NAME_C(String value) throws FoundationException { getAdapt_C().setString(10, value); }
		public void setCUST_ODR_NO_C(String value) throws FoundationException { getAdapt_C().setString(11, value); }
		public void setCUST_CD_C(String value) throws FoundationException { getAdapt_C().setString(12, value); }
		public void setCUST_NAME_C(String value) throws FoundationException { getAdapt_C().setString(13, value); }
		public void setDLV_LOC_CD_C(String value) throws FoundationException { getAdapt_C().setString(14, value); }
		public void setDLV_LOC_NAME_KANJI_C(String value) throws FoundationException { getAdapt_C().setString(15, value); }
		public void setCUS_DLV_KEY_CD_C(String value) throws FoundationException { getAdapt_C().setString(16, value); }
		public void setDESINATED_SHIP_DATE_C(String value) throws FoundationException { getAdapt_C().setString(17, value); }
		public void setDESINATED_DLV_DATE_C(String value) throws FoundationException { getAdapt_C().setString(18, value); }
		public void setSCDL_DLV_DATE_C(String value) throws FoundationException { getAdapt_C().setString(19, value); }
		public void setSHIP_ODR_QTY_C(String value) throws FoundationException { getAdapt_C().setString(20, value); }
		public void setUNIT_CD_C(String value) throws FoundationException { getAdapt_C().setString(21, value); }
		public void setUNIT_PRICE_C(String value) throws FoundationException { getAdapt_C().setString(22, value); }
		public void setSHIP_ODR_AMOUNT_C(String value) throws FoundationException { getAdapt_C().setString(23, value); }
		public void setTAX_AMOUNT_C(String value) throws FoundationException { getAdapt_C().setString(24, value); }
		public void setINSPC_TYP_C(String value) throws FoundationException { getAdapt_C().setString(25, value); }
		public void setCLIENT_REMARK_KANJI_C(String value) throws FoundationException { getAdapt_C().setString(26, value); }
		public void setCLIENT_BARCODE_INF_C(String value) throws FoundationException { getAdapt_C().setString(27, value); }
		public void setBUYER_NAME_C(String value) throws FoundationException { getAdapt_C().setString(28, value); }
		public void setPUCH_ODR_QTY_TOTAL_C(String value) throws FoundationException { getAdapt_C().setString(29, value); }
		public void setDLV_ODR_QTY_C(String value) throws FoundationException { getAdapt_C().setString(30, value); }
		public void setSHIP_ODR_AMOUNT_TAX_C(String value) throws FoundationException { getAdapt_C().setString(31, value); }
		public void setTAX_AMOUNT_1_C(String value) throws FoundationException { getAdapt_C().setString(32, value); }
		public void setTAX_AMOUNT_2_C(String value) throws FoundationException { getAdapt_C().setString(33, value); }
		public void setTAX_AMOUNT_3_C(String value) throws FoundationException { getAdapt_C().setString(34, value); }
		public void setOWN_CUR_TAXCREDIT_SALES_AMOUNT_C(String value) throws FoundationException { getAdapt_C().setString(35, value); }
		public void setEXTERNAL_TAX_SALES_AMOUNT_C(String value) throws FoundationException { getAdapt_C().setString(36, value); }
		public void setINTERNAL_TAX_SALES_AMOUNT_C(String value) throws FoundationException { getAdapt_C().setString(37, value); }
		public void setTAXFREE_SALES_AMOUNT_C(String value) throws FoundationException { getAdapt_C().setString(38, value); }
		public void setEXTERNAL_TAX_AMOUNT_C(String value) throws FoundationException { getAdapt_C().setString(39, value); }
		public void setINTERNAL_TAX_AMOUNT_C(String value) throws FoundationException { getAdapt_C().setString(40, value); }
		public void setTAX_CREDIT_SALES_AMOUNT_C(String value) throws FoundationException { getAdapt_C().setString(41, value); }

		public int create() throws BatchAppException
		{
			try {
				getAdapt_C().setString(1, m_med.getSysdate());
				getAdapt_C().setString(2, m_med.getUsername());
				getAdapt_C().setString(3, m_med.getProgname());
				getAdapt_C().setString(4, m_med.getSysdate());
				getAdapt_C().setString(5, m_med.getUsername());
				getAdapt_C().setString(6, m_med.getProgname());
				setSLIP_CD_C(m_med.getcreTShipSlipSLIP_CD());
				setITEM_CD_C(m_med.getcreTShipSlipITEM_CD());
				setCUST_ITEM_CD_C(m_med.getcreTShipSlipCUST_ITEM_CD());
				setPART_NAME_C(m_med.getcreTShipSlipPART_NAME());
				setCUST_ODR_NO_C(m_med.getcreTShipSlipCUST_ODR_NO());
				setCUST_CD_C(m_med.getcreTShipSlipCUST_CD());
				setCUST_NAME_C(m_med.getcreTShipSlipCUST_NAME());
				setDLV_LOC_CD_C(m_med.getcreTShipSlipDLV_LOC_CD());
				setDLV_LOC_NAME_KANJI_C(m_med.getcreTShipSlipDLV_LOC_NAME_KANJI());
				setCUS_DLV_KEY_CD_C(m_med.getcreTShipSlipCUS_DLV_KEY_CD());
				setDESINATED_SHIP_DATE_C(m_med.getcreTShipSlipDESINATED_SHIP_DATE());
				setDESINATED_DLV_DATE_C(m_med.getcreTShipSlipDESINATED_DLV_DATE());
				setSCDL_DLV_DATE_C(m_med.getcreTShipSlipSCDL_DLV_DATE());
				setSHIP_ODR_QTY_C(m_med.getcreTShipSlipSHIP_ODR_QTY());
				setUNIT_CD_C(m_med.getcreTShipSlipUNIT_CD());
				setUNIT_PRICE_C(m_med.getcreTShipSlipUNIT_PRICE());
				setSHIP_ODR_AMOUNT_C(m_med.getcreTShipSlipSHIP_ODR_AMOUNT());
				setTAX_AMOUNT_C(m_med.getcreTShipSlipTAX_AMOUNT());
				setINSPC_TYP_C(m_med.getcreTShipSlipINSPC_TYP());
				setCLIENT_REMARK_KANJI_C(m_med.getcreTShipSlipCLIENT_REMARK_KANJI());
				setCLIENT_BARCODE_INF_C(m_med.getcreTShipSlipCLIENT_BARCODE_INF());
				setBUYER_NAME_C(m_med.getcreTShipSlipBUYER_NAME());
				setPUCH_ODR_QTY_TOTAL_C(m_med.getcreTShipSlipPUCH_ODR_QTY_TOTAL());
				setDLV_ODR_QTY_C(m_med.getcreTShipSlipDLV_ODR_QTY());
				setSHIP_ODR_AMOUNT_TAX_C(m_med.getcreTShipSlipSHIP_ODR_AMOUNT_TAX());
				setTAX_AMOUNT_1_C(m_med.getcreTShipSlipTAX_AMOUNT_1());
				setTAX_AMOUNT_2_C(m_med.getcreTShipSlipTAX_AMOUNT_2());
				setTAX_AMOUNT_3_C(m_med.getcreTShipSlipTAX_AMOUNT_3());
				setOWN_CUR_TAXCREDIT_SALES_AMOUNT_C(m_med.getcreTShipSlipOWN_CUR_TAXCREDIT_SALES_AMOUNT());
				setEXTERNAL_TAX_SALES_AMOUNT_C(m_med.getcreTShipSlipEXTERNAL_TAX_SALES_AMOUNT());
				setINTERNAL_TAX_SALES_AMOUNT_C(m_med.getcreTShipSlipINTERNAL_TAX_SALES_AMOUNT());
				setTAXFREE_SALES_AMOUNT_C(m_med.getcreTShipSlipTAXFREE_SALES_AMOUNT());
				setEXTERNAL_TAX_AMOUNT_C(m_med.getcreTShipSlipEXTERNAL_TAX_AMOUNT());
				setINTERNAL_TAX_AMOUNT_C(m_med.getcreTShipSlipINTERNAL_TAX_AMOUNT());
				setTAX_CREDIT_SALES_AMOUNT_C(m_med.getcreTShipSlipTAX_CREDIT_SALES_AMOUNT());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("tblT_SHIP_SLIP", "create", "レコード新規追加パラメータ設定処理失敗");
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
			BatchAppException be=new BatchAppException("tblT_SHIP_SLIP", "prepareALL(FoundationException)", "SQL文のprepareで失敗しました");
			be.addMessage(e.getErrmsg());
			throw be;
		} catch(SQLException e) {
			BatchAppException be=new BatchAppException("tblT_SHIP_SLIP", "prepareALL(SQLException)", "SQL文のprepareで失敗しました");
			throw be;
		}

		return;
	}

	//////////////////////////////

	/**
	 * tblT_SHIP_SLIPクラスの標準コンストラクタ
	 *
		 */
	public tblT_SHIP_SLIP(medKU0010B001 med, BatchAppConductor cdr) throws SystemException
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
	protected static String m_selcmd = null;
	protected static String m_inscmd = "insert into "
+"  T_SHIP_SLIP(\"SLIP_CD\", \"ITEM_CD\", \"CUST_ITEM_CD\", \"PART_NAME\", \"CUST_ODR_NO\", \"CUST_CD\", \"CUST_NAME\", \"DLV_LOC_CD\", \"DLV_LOC_NAME_KANJI\", \"CUS_DLV_KEY_CD\", \"DESINATED_SHIP_DATE\", \"DESINATED_DLV_DATE\", \"SCDL_DLV_DATE\", \"SHIP_ODR_QTY\", \"UNIT_CD\", \"UNIT_PRICE\", \"SHIP_ODR_AMOUNT\", \"TAX_AMOUNT\", \"INSPC_TYP\", \"CLIENT_REMARK_KANJI\", \"CLIENT_BARCODE_INF\", \"PRINT_FLG\", \"DEL_FLG\", \"BUYER_NAME\", \"PUCH_ODR_QTY_TOTAL\", \"DLV_ODR_QTY\", \"SHIP_ODR_AMOUNT_TAX\", \"TAX_AMOUNT_1\", \"TAX_AMOUNT_2\", \"TAX_AMOUNT_3\", \"OWN_CUR_TAXCREDIT_SALES_AMOUNT\", \"EXTERNAL_TAX_SALES_AMOUNT\", \"INTERNAL_TAX_SALES_AMOUNT\", \"TAXFREE_SALES_AMOUNT\", \"EXTERNAL_TAX_AMOUNT\", \"INTERNAL_TAX_AMOUNT\", \"TAX_CREDIT_SALES_AMOUNT\") "
+"values "
+"  (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, '0', '0', ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	protected static String m_updcmd = null;
	protected static String m_delcmd = null;
	protected String m_spcmd=null;

	// トランザクション利用の可否を設定します
	boolean m_useTransaction=true;

	//////////////////////////////

}
