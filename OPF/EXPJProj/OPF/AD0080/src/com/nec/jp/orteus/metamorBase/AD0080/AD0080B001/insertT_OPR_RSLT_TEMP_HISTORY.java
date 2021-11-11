/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0080/src/com/nec/jp/orteus/metamorBase/AD0080/AD0080B001/insertT_OPR_RSLT_TEMP_HISTORY.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0080.AD0080B001;

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
 * CLASS     : insertT_OPR_RSLT_TEMP_HISTORY クラス
 * ファイル・クラス説明
 * @author $Author: geng-jia $
 * @version $Revision: 1.12 $ $Date: 2015/12/22 09:52:53 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class insertT_OPR_RSLT_TEMP_HISTORY extends AbstractBatchAppEntity
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

		public void setEXPR_C(String value) throws FoundationException { getAdapt_C().setString(1, value); }
		public void setIN1_C(String value) throws FoundationException { getAdapt_C().setString(2, value); }
		public void setIN2_C(String value) throws FoundationException { getAdapt_C().setString(3, value); }
		public void setIN3_C(String value) throws FoundationException { getAdapt_C().setString(4, value); }
		public void setIN4_C(String value) throws FoundationException { getAdapt_C().setString(5, value); }
		public void setIN5_C(String value) throws FoundationException { getAdapt_C().setString(6, value); }
		public void setIN6_C(String value) throws FoundationException { getAdapt_C().setString(7, value); }
		public void setIN7_C(String value) throws FoundationException { getAdapt_C().setString(8, value); }
		public void setIN8_C(String value) throws FoundationException { getAdapt_C().setString(9, value); }
		public void setB1_C(String value) throws FoundationException { getAdapt_C().setString(10, value); }
		public void setB2_C(String value) throws FoundationException { getAdapt_C().setString(11, value); }
		public void setIN11_C(String value) throws FoundationException { getAdapt_C().setString(12, value); }
		public void setIN12_C(String value) throws FoundationException { getAdapt_C().setString(13, value); }
		public void setIN13_C(String value) throws FoundationException { getAdapt_C().setString(14, value); }

		public int create() throws BatchAppException
		{
			try {
				setEXPR_C(m_med.getOPR_RSLT_TEMP_CTL_NO());
				setIN1_C(m_med.getOPR_RSLT_TEMP_CTL_NO());
				setIN2_C(m_med.getRSLT_TAKE_ERR_TYP());
				setIN3_C(m_med.getOPR_RSLT_TEMP_CTL_NO());
				setIN4_C(m_med.getRSLT_TAKE_ERR_INFO());
				setIN5_C(m_med.getUSER_CD());
				setIN6_C(m_med.getPRG_NM());
				setIN7_C(m_med.getUSER_CD());
				setIN8_C(m_med.getPRG_NM());
				setB1_C(m_med.getINTAKE_TERM_FROM());
				setB2_C(m_med.getINTAKE_TERM_TO());
				setIN11_C(m_med.getOPR_INST_CD());
				setIN12_C(m_med.getOPR_RSLT_TEMP_CTL_NO());
				setIN13_C(m_med.getOPR_RSLT_TEMP_CTL_NO());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("insertT_OPR_RSLT_TEMP_HISTORY", "create", "レコード新規追加パラメータ設定処理失敗");
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
	 * insertT_OPR_RSLT_TEMP_HISTORYクラスの標準コンストラクタ
	 *
		 */
	public insertT_OPR_RSLT_TEMP_HISTORY(medAD0080B001 med, BatchAppConductor cdr) throws SystemException
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
	public medAD0080B001 m_med=null;

	protected BatchAppConductor m_conductor;

	// interEntityクラスインスタンス
	public interEntity m_entity=new interEntity();

	// 各状態で実行するsql文の定義
	protected static String m_selcmd = null;
	protected static String m_inscmd = "insert into "
+"  T_OPR_RSLT_TEMP_HISTORY(OPR_RSLT_TEMP_CTL_NO, OPR_INST_CD, ITEM_CD, ACPT_QTY, DEFECT_QTY, OPR_DATE, WH_CD, WS_CD, OPR_RSLT_PERSON, OPR_RSLT_COMMENT, OPR_TIME_UNIT_TYP, PRE_ARRANGEMENT_TIME, POST_ARRANGEMENT_TIME, OPR_TIME, CESSATION_TIME, CESSATION_CAUSE, LOT_NO, VEND_LOT_NO, DEFECT_CAUSE_CD1, DEFECT_QTY1, DEFECT_COMMENT1, DEFECT_CAUSE_CD2, DEFECT_QTY2, DEFECT_COMMENT2, DEFECT_CAUSE_CD3, DEFECT_QTY3, DEFECT_COMMENT3, DEFECT_CAUSE_CD4, DEFECT_QTY4, DEFECT_COMMENT4, DEFECT_CAUSE_CD5, DEFECT_QTY5, DEFECT_COMMENT5, OPR_CMPLT_FLG, TAKE_DATE, TAKE_TYP, RSLT_TAKE_ERR_TYP, RSLT_TAKE_ERR_INFO, CREATED_DATE, CREATED_BY, CREATED_PRG_NM, UPDATED_DATE, UPDATED_BY, UPDATED_PRG_NM, MODIFY_COUNT) "
+"select "
+"  OPR_RSLT_TEMP_CTL_NO, "
+"  OPR_INST_CD, "
+"  ITEM_CD, "
+"  ACPT_QTY, "
+"  DEFECT_QTY, "
+"  OPR_DATE, "
+"  WH_CD, "
+"  WS_CD, "
+"  OPR_RSLT_PERSON, "
+"  OPR_RSLT_COMMENT, "
+"  OPR_TIME_UNIT_TYP, "
+"  PRE_ARRANGEMENT_TIME, "
+"  POST_ARRANGEMENT_TIME, "
+"  OPR_TIME, "
+"  CESSATION_TIME, "
+"  CESSATION_CAUSE, "
+"  LOT_NO, "
+"  VEND_LOT_NO, "
+"  DEFECT_CAUSE_CD1, "
+"  DEFECT_QTY1, "
+"  DEFECT_COMMENT1, "
+"  DEFECT_CAUSE_CD2, "
+"  DEFECT_QTY2, "
+"  DEFECT_COMMENT2, "
+"  DEFECT_CAUSE_CD3, "
+"  DEFECT_QTY3, "
+"  DEFECT_COMMENT3, "
+"  DEFECT_CAUSE_CD4, "
+"  DEFECT_QTY4, "
+"  DEFECT_COMMENT4, "
+"  DEFECT_CAUSE_CD5, "
+"  DEFECT_QTY5, "
+"  DEFECT_COMMENT5, "
+"  OPR_CMPLT_FLG, "
+"  TAKE_DATE, "
+"  DECODE(?, NULL, '10', '20'), "
+"  CASE "
+"    WHEN OPR_RSLT_TEMP_CTL_NO = ? THEN ? "
+"    ELSE '' "
+"  END, "
+"  CASE "
+"    WHEN OPR_RSLT_TEMP_CTL_NO = ? THEN ? "
+"    ELSE '' "
+"  END, "
+"  SYSDATE, "
+"  ?, "
+"  ?, "
+"  SYSDATE, "
+"  ?, "
+"  ?, "
+"  0 "
+"FROM "
+"  T_OPR_RSLT_TEMP "
+"WHERE "
+"  TAKE_DATE >= TO_DATE(NVL(?, '0001/01/01'), 'YYYY/MM/DD') "
+"  and TAKE_DATE <= TO_DATE(NVL(?, '9999/12/31'), 'YYYY/MM/DD') "
+"  AND OPR_INST_CD = ? "
+"  AND (? is null or OPR_RSLT_TEMP_CTL_NO = ?)";
	protected static String m_updcmd = null;
	protected static String m_delcmd = null;
	protected static String m_calcmd = null;

	// トランザクション利用の可否を設定します
	boolean m_useTransaction=true;

	//////////////////////////////

}
