/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0080/src/com/nec/jp/orteus/metamorBase/AD0080/AD0080B001/T_OPR_RSLT_TEMP.java,v $
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
 * CLASS     : T_OPR_RSLT_TEMP クラス
 * ファイル・クラス説明
 * @author $Author: geng-jia $
 * @version $Revision: 1.12 $ $Date: 2015/12/22 09:52:52 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class T_OPR_RSLT_TEMP extends AbstractBatchAppEntity
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

		public void setIN34_R(String value) throws FoundationException { getAdapt_R().setString(1, value); }
		public void setTAKE_DATE_FROM_R(String value) throws FoundationException { getAdapt_R().setString(2, value); }
		public void setTAKE_DATE_TO_R(String value) throws FoundationException { getAdapt_R().setString(3, value); }

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

				setIN34_R(m_med.getOPR_INST_CD());
				setTAKE_DATE_FROM_R(m_med.getINTAKE_TERM_FROM());
				setTAKE_DATE_TO_R(m_med.getINTAKE_TERM_TO());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("T_OPR_RSLT_TEMP", "read", "レコード検索条件設定処理失敗");
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

		public String getOPR_INST_CD_R() throws FoundationException { return m_doRs.getString(1); }
		public String getOPR_RSLT_TEMP_CTL_NO_R() throws FoundationException { return m_doRs.getString(2); }
		public String getITEM_CD_R() throws FoundationException { return m_doRs.getString(3); }
		public String getACPT_QTY_R() throws FoundationException { return m_doRs.getString(4); }
		public String getDEFECT_QTY_R() throws FoundationException { return m_doRs.getString(5); }
		public String getOPR_DATE_R() throws FoundationException { return m_doRs.getString(6); }
		public String getWH_CD_R() throws FoundationException { return m_doRs.getString(7); }
		public String getWS_CD_R() throws FoundationException { return m_doRs.getString(8); }
		public String getOPR_RSLT_PERSON_R() throws FoundationException { return m_doRs.getString(9); }
		public String getOPR_RSLT_COMMENT_R() throws FoundationException { return m_doRs.getString(10); }
		public String getOPR_TIME_UNIT_TYP_R() throws FoundationException { return m_doRs.getString(11); }
		public String getPRE_ARRANGEMENT_TIME_R() throws FoundationException { return m_doRs.getString(12); }
		public String getPOST_ARRANGEMENT_TIME_R() throws FoundationException { return m_doRs.getString(13); }
		public String getOPR_TIME_R() throws FoundationException { return m_doRs.getString(14); }
		public String getCESSATION_TIME_R() throws FoundationException { return m_doRs.getString(15); }
		public String getCESSATION_CAUSE_R() throws FoundationException { return m_doRs.getString(16); }
		public String getLOT_NO_R() throws FoundationException { return m_doRs.getString(17); }
		public String getVEND_LOT_NO_R() throws FoundationException { return m_doRs.getString(18); }
		public String getDEFECT_CAUSE_CD1_R() throws FoundationException { return m_doRs.getString(19); }
		public String getDEFECT_QTY1_R() throws FoundationException { return m_doRs.getString(20); }
		public String getDEFECT_COMMENT1_R() throws FoundationException { return m_doRs.getString(21); }
		public String getDEFECT_CAUSE_CD2_R() throws FoundationException { return m_doRs.getString(22); }
		public String getDEFECT_QTY2_R() throws FoundationException { return m_doRs.getString(23); }
		public String getDEFECT_COMMENT2_R() throws FoundationException { return m_doRs.getString(24); }
		public String getDEFECT_CAUSE_CD3_R() throws FoundationException { return m_doRs.getString(25); }
		public String getDEFECT_QTY3_R() throws FoundationException { return m_doRs.getString(26); }
		public String getDEFECT_COMMENT3_R() throws FoundationException { return m_doRs.getString(27); }
		public String getDEFECT_CAUSE_CD4_R() throws FoundationException { return m_doRs.getString(28); }
		public String getDEFECT_QTY4_R() throws FoundationException { return m_doRs.getString(29); }
		public String getDEFECT_COMMENT4_R() throws FoundationException { return m_doRs.getString(30); }
		public String getDEFECT_CAUSE_CD5_R() throws FoundationException { return m_doRs.getString(31); }
		public String getDEFECT_QTY5_R() throws FoundationException { return m_doRs.getString(32); }
		public String getDEFECT_COMMENT5_R() throws FoundationException { return m_doRs.getString(33); }
		public String getOPR_CMPLT_FLG_R() throws FoundationException { return m_doRs.getString(34); }
		public String getSUM_DEFECT_QTY_R() throws FoundationException { return m_doRs.getString(35); }
		public String getTAKE_DATE_R() throws FoundationException { return m_doRs.getString(36); }
		public String getCHILD_RSLTUPDATE_FLG_R() throws FoundationException { return m_doRs.getString(37); }

		public boolean next() throws BatchAppException
		{
			try {
				if(m_doRs.next()==false) return false;

				m_med.setOPR_INST_CD(getOPR_INST_CD_R());
				m_med.setOPR_RSLT_TEMP_CTL_NO(getOPR_RSLT_TEMP_CTL_NO_R());
				m_med.setITEM_CD(getITEM_CD_R());
				m_med.setACPT_QTY(getACPT_QTY_R());
				m_med.setDEFECT_QTY(getDEFECT_QTY_R());
				m_med.setOPR_DATE(getOPR_DATE_R());
				m_med.setWH_CD(getWH_CD_R());
				m_med.setWS_CD(getWS_CD_R());
				m_med.setOPR_RSLT_PERSON(getOPR_RSLT_PERSON_R());
				m_med.setOPR_RSLT_COMMENT(getOPR_RSLT_COMMENT_R());
				m_med.setOPR_TIME_UNIT_TYP(getOPR_TIME_UNIT_TYP_R());
				m_med.setPRE_ARRANGEMENT_TIME(getPRE_ARRANGEMENT_TIME_R());
				m_med.setPOST_ARRANGEMENT_TIME(getPOST_ARRANGEMENT_TIME_R());
				m_med.setOPR_TIME(getOPR_TIME_R());
				m_med.setCESSATION_TIME(getCESSATION_TIME_R());
				m_med.setCESSATION_CAUSE(getCESSATION_CAUSE_R());
				m_med.setLOT_NO(getLOT_NO_R());
				m_med.setVEND_LOT_NO(getVEND_LOT_NO_R());
				m_med.setDEFECT_CAUSE_CD1(getDEFECT_CAUSE_CD1_R());
				m_med.setDEFECT_QTY1(getDEFECT_QTY1_R());
				m_med.setDEFECT_COMMENT1(getDEFECT_COMMENT1_R());
				m_med.setDEFECT_CAUSE_CD2(getDEFECT_CAUSE_CD2_R());
				m_med.setDEFECT_QTY2(getDEFECT_QTY2_R());
				m_med.setDEFECT_COMMENT2(getDEFECT_COMMENT2_R());
				m_med.setDEFECT_CAUSE_CD3(getDEFECT_CAUSE_CD3_R());
				m_med.setDEFECT_QTY3(getDEFECT_QTY3_R());
				m_med.setDEFECT_COMMENT3(getDEFECT_COMMENT3_R());
				m_med.setDEFECT_CAUSE_CD4(getDEFECT_CAUSE_CD4_R());
				m_med.setDEFECT_QTY4(getDEFECT_QTY4_R());
				m_med.setDEFECT_COMMENT4(getDEFECT_COMMENT4_R());
				m_med.setDEFECT_CAUSE_CD5(getDEFECT_CAUSE_CD5_R());
				m_med.setDEFECT_QTY5(getDEFECT_QTY5_R());
				m_med.setDEFECT_COMMENT5(getDEFECT_COMMENT5_R());
				m_med.setOPR_CMPLT_FLG(getOPR_CMPLT_FLG_R());
				m_med.setSUM_DEFECT_QTY(getSUM_DEFECT_QTY_R());
				m_med.setTAKE_DATE(getTAKE_DATE_R());
				m_med.setCHILD_RSLTUPDATE_FLG(getCHILD_RSLTUPDATE_FLG_R());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("T_OPR_RSLT_TEMP", "next", "レコード移動失敗");
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
				BatchAppException be=new BatchAppException("T_OPR_RSLT_TEMP", "hasRecord", "レコード存在チェック失敗");
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
	 * T_OPR_RSLT_TEMPクラスの標準コンストラクタ
	 *
		 */
	public T_OPR_RSLT_TEMP(medAD0080B001 med, BatchAppConductor cdr) throws SystemException
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
	protected static String m_selcmd = "select "
+"  OPR_INST_CD, "
+"  OPR_RSLT_TEMP_CTL_NO, "
+"  ITEM_CD, "
+"  ACPT_QTY, "
+"  DEFECT_QTY, "
+"  TO_CHAR(OPR_DATE,'yyyy/mm/dd HH24MI') AS OPR_DATE, "
+"  WH_CD, "
+"  WS_CD, "
+"  OPR_RSLT_PERSON, "
+"  OPR_RSLT_COMMENT, "
+"  NVL(OPR_TIME_UNIT_TYP,1), "
+"  NVL(PRE_ARRANGEMENT_TIME,0), "
+"  NVL(POST_ARRANGEMENT_TIME,0), "
+"  NVL(OPR_TIME,0), "
+"  NVL(CESSATION_TIME,0), "
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
+"  NVL(OPR_CMPLT_FLG,1), "
+"  NVL(DEFECT_QTY1, 0) + nvl(DEFECT_QTY2, 0) + nvl(DEFECT_QTY3, 0) + nvl(DEFECT_QTY4, 0) + nvl(DEFECT_QTY5, 0) AS SUM_DEFECT_QTY, "
+"  TO_CHAR(TAKE_DATE, 'YYYY/MM/DD'), "
+"  NVL(CHILD_RSLTUPDATE_FLG,1) "
+"from "
+"  T_OPR_RSLT_TEMP "
+"where "
+"  OPR_INST_CD = ? "
+"  and TAKE_DATE >= TO_DATE(NVL(?,'0001/01/01'), 'YYYY/MM/DD') "
+"  and TAKE_DATE <= TO_DATE(NVL(?,'9999/12/31'), 'YYYY/MM/DD') "
+"order by "
+"  OPR_RSLT_TEMP_CTL_NO";
	protected static String m_inscmd = null;
	protected static String m_updcmd = null;
	protected static String m_delcmd = null;
	protected static String m_calcmd = null;

	// トランザクション利用の可否を設定します
	boolean m_useTransaction=true;

	//////////////////////////////

}
