/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KQ0010/src/com/nec/jp/orteus/metamorBase/KQ0010/KQ0010B001/naiji_T_ODR_hinban.java,v $
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

package com.nec.jp.orteus.metamorBase.KQ0010.KQ0010B001;

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
 * CLASS     : naiji_T_ODR_hinban クラス
 * ファイル・クラス説明
 * @author $Author: geng-jia $
 * @version $Revision: 1.21 $ $Date: 2015/12/03 08:12:38 $
 */

//{{user_implement_dev:header
/**
 * CLASS     : naiji_T_ODR_hinban クラス
 * VERSION   : 1.0.0.0
 * DATE      : <日付>
 * AUTHOR    : <開発者名>
 * HISTORY
 *           : 1.0.0.0　(2004/3/16),新規作成
 *         [ : <バージョン> (<日付>),<内容> ]
 *                        ・ ・ ・
 */
//}}user_implement_dev:header

public class naiji_T_ODR_hinban extends AbstractBatchAppEntity
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

		public void setCUST_CD_R(String value) throws FoundationException { getAdapt_R().setString(1, value); }
		public void setCUST_ITEM_CD_R(String value) throws FoundationException { getAdapt_R().setString(2, value); }

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

				setCUST_CD_R(m_med.getnijCUST_CD());
				setCUST_ITEM_CD_R(m_med.getnijCUST_ITEM_CD());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("naiji_T_ODR_hinban", "read", "レコード検索条件設定処理失敗");
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

		public String getODR_NO_R() throws FoundationException { return m_doRs.getString(1); }
		public boolean wasNull_REMAIN_UNCONFIRM_ODR_QTY_R() throws FoundationException { return m_doRs.wasNull(2); }
		public Number getREMAIN_UNCONFIRM_ODR_QTY_R() throws FoundationException { return m_doRs.getDouble(2); }
		public String getCUST_CD_R() throws FoundationException { return m_doRs.getString(3); }
		public String getODR_CTL_NO_R() throws FoundationException { return m_doRs.getString(4); }
		public String getDESINATED_DLV_DATE_R() throws FoundationException { return m_doRs.getString(5); }
		public String getCURRNCY_CD_R() throws FoundationException { return m_doRs.getString(6); }
		public boolean wasNull_ODR_UNIT_PRICE_R() throws FoundationException { return m_doRs.wasNull(7); }
		public Number getODR_UNIT_PRICE_R() throws FoundationException { return m_doRs.getDouble(7); }
		public String getODR_TYP_R() throws FoundationException { return m_doRs.getString(8); }
		public boolean wasNull_UNCONFIRM_ODR_BALANCE_R() throws FoundationException { return m_doRs.wasNull(9); }
		public Number getUNCONFIRM_ODR_BALANCE_R() throws FoundationException { return m_doRs.getDouble(9); }

		public boolean next() throws BatchAppException
		{
			try {
				if(m_doRs.next()==false) return false;

				m_med.setnijODR_NO(getODR_NO_R());
				if(wasNull_REMAIN_UNCONFIRM_ODR_QTY_R()==true) {
					m_med.setnijREMAIN_UNCONFIRM_ODR_QTY(null);
				} else {
					m_med.setnijREMAIN_UNCONFIRM_ODR_QTY(new Double(getREMAIN_UNCONFIRM_ODR_QTY_R().doubleValue()));
				}
				m_med.setnijCUST_CD(getCUST_CD_R());
				m_med.setnijODR_CTL_NO(getODR_CTL_NO_R());
				m_med.setnijDESINATED_DLV_DATE(getDESINATED_DLV_DATE_R());
				m_med.setnijCURRNCY_CD(getCURRNCY_CD_R());
				if(wasNull_ODR_UNIT_PRICE_R()==true) {
					m_med.setnijODR_UNIT_PRICE(null);
				} else {
					m_med.setnijODR_UNIT_PRICE(new Double(getODR_UNIT_PRICE_R().doubleValue()));
				}
				m_med.setnijODR_TYP(getODR_TYP_R());
				if(wasNull_UNCONFIRM_ODR_BALANCE_R()==true) {
					m_med.setnijUNCONFIRM_ODR_BALANCE(null);
				} else {
					m_med.setnijUNCONFIRM_ODR_BALANCE(new Double(getUNCONFIRM_ODR_BALANCE_R().doubleValue()));
				}
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("naiji_T_ODR_hinban", "next", "レコード移動失敗");
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
				BatchAppException be=new BatchAppException("naiji_T_ODR_hinban", "hasRecord", "レコード存在チェック失敗");
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
	 * naiji_T_ODR_hinbanクラスの標準コンストラクタ
	 *
		 */
	public naiji_T_ODR_hinban(medKQ0010B001 med, BatchAppConductor cdr) throws SystemException
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
	public medKQ0010B001 m_med=null;

	protected BatchAppConductor m_conductor;

	// interEntityクラスインスタンス
	public interEntity m_entity=new interEntity();

	// 各状態で実行するsql文の定義
	protected static String m_selcmd = "select "
+"  T_ODR.\"ODR_NO\" as \"ODR_NO\", "
+"  T_ODR.\"REMAIN_UNCONFIRM_ODR_QTY\" as \"REMAIN_UNCONFIRM_ODR_QTY\", "
+"  T_ODR_CTL.\"CUST_CD\" as \"CUST_CD\", "
+"  T_ODR_CTL.\"ODR_CTL_NO\" as \"ODR_CTL_NO\", "
+"  TO_CHAR(T_ODR.\"DESINATED_DLV_DATE\", 'YYYY/MM/DD') as \"DESINATED_DLV_DATE\", "
+"  T_ODR.\"CURRNCY_CD\" as \"CURRNCY_CD\", "
+"  T_ODR.\"ODR_UNIT_PRICE\" as \"ODR_UNIT_PRICE\", "
+"  T_ODR.\"ODR_TYP\" as \"ODR_TYP\", "
+"  T_ODR.\"UNCONFIRM_ODR_BALANCE\" as \"UNCONFIRM_ODR_BALANCE\" "
+"from "
+"  T_ODR, "
+"  T_ODR_CTL "
+"where "
+"  T_ODR.ODR_CTL_NO = T_ODR_CTL.ODR_CTL_NO "
+"  and T_ODR.\"ODR_TYP\" = '2' "
+"  and T_ODR.\"REMAIN_UNCONFIRM_ODR_QTY\" > 0 "
+"  and T_ODR_CTL.\"CUST_CD\" = ? "
+"  and T_ODR_CTL.\"CUST_ITEM_CD\" = ? "
+"  and T_ODR.\"DEL_FLG\" = '0' "
+"order by "
+"  T_ODR.\"DESINATED_DLV_DATE\", "
+"  T_ODR.\"ODR_NO\", "
+"  T_ODR.\"REMAIN_UNCONFIRM_ODR_QTY\" "
+"  ";
	protected static String m_inscmd = null;
	protected static String m_updcmd = null;
	protected static String m_delcmd = null;
	protected static String m_calcmd = null;

	// トランザクション利用の可否を設定します
	boolean m_useTransaction=true;

	//////////////////////////////

}
