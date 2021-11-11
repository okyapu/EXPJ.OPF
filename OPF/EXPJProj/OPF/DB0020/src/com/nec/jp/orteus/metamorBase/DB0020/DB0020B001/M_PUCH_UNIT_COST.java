/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DB0020/src/com/nec/jp/orteus/metamorBase/DB0020/DB0020B001/M_PUCH_UNIT_COST.java,v $
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

package com.nec.jp.orteus.metamorBase.DB0020.DB0020B001;

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
 * CLASS     : M_PUCH_UNIT_COST クラス
 * ファイル・クラス説明
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.9 $ $Date: 2014/11/05 07:21:09 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class M_PUCH_UNIT_COST extends AbstractBatchAppEntity
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

		public void setIN18_R(String value) throws FoundationException { getAdapt_R().setString(1, value); }
		public void setIN19_R(String value) throws FoundationException { getAdapt_R().setString(2, value); }
		public void setIN20_R(String value) throws FoundationException { getAdapt_R().setString(3, value); }
		public void setIN21_R(String value) throws FoundationException { getAdapt_R().setString(4, value); }
		public void setIN22_R(String value) throws FoundationException { getAdapt_R().setString(5, value); }
		public void setIN23_R(String value) throws FoundationException { getAdapt_R().setString(6, value); }
		public void setIN24_R(String value) throws FoundationException { getAdapt_R().setString(7, value); }
		public void setIN25_R(String value) throws FoundationException { getAdapt_R().setString(8, value); }

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

				setIN18_R(m_med.getYEAR());
				setIN19_R(m_med.getHALF_TERM_TYP());
				setIN20_R(m_med.getCOST_TYP());
				setIN21_R(m_med.getPLANT_CD());
				setIN22_R(m_med.getYYYYMM());
				setIN23_R(m_med.getYYYYMM());
				setIN24_R(m_med.getPLANT_CD());
				setIN25_R(m_med.getYYYYMM());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("M_PUCH_UNIT_COST", "read", "レコード検索条件設定処理失敗");
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

		public String getPLANT_CD_R() throws FoundationException { return m_doRs.getString(1); }
		public String getITEM_CD_R() throws FoundationException { return m_doRs.getString(2); }
		public String getPUCH_PRIORITY_REF_NO_R() throws FoundationException { return m_doRs.getString(3); }
		public String getEFF_PHASE_IN_DATE_R() throws FoundationException { return m_doRs.getString(4); }
		public String getVEND_CD_R() throws FoundationException { return m_doRs.getString(5); }
		public String getUNIT_COST_R() throws FoundationException { return m_doRs.getString(6); }
		public String getUNIT_COST_TYP_R() throws FoundationException { return m_doRs.getString(7); }
		public String getCUR_CD_R() throws FoundationException { return m_doRs.getString(8); }
		public String getEXCH_RATE_R() throws FoundationException { return m_doRs.getString(9); }
		public String getPUCH_SIZE_R() throws FoundationException { return m_doRs.getString(10); }
		public String getCLASIFICATION_CD_R() throws FoundationException { return m_doRs.getString(11); }
		public String getCOMPANY_CD_R() throws FoundationException { return m_doRs.getString(12); }
		public String getORG_CD_R() throws FoundationException { return m_doRs.getString(13); }
		public String getSTOCK_UNIT_R() throws FoundationException { return m_doRs.getString(14); }
		public String getONEROUS_FLG_R() throws FoundationException { return m_doRs.getString(15); }
		public String getUPDATED_DATE_R() throws FoundationException { return m_doRs.getString(16); }
		public String getTRANSACTION_TYP_R() throws FoundationException { return m_doRs.getString(17); }
		public String getSAVE_UPDATED_DATE_R() throws FoundationException { return m_doRs.getString(18); }

		public boolean next() throws BatchAppException
		{
			try {
				if(m_doRs.next()==false) return false;

				m_med.setPLANT_CD(getPLANT_CD_R());
				m_med.setITEM_CD(getITEM_CD_R());
				m_med.setPUCH_PRIORITY_REF_NO(getPUCH_PRIORITY_REF_NO_R());
				m_med.setEFF_PHASE_IN_DATE(getEFF_PHASE_IN_DATE_R());
				m_med.setVEND_CD(getVEND_CD_R());
				m_med.setUNIT_COST(getUNIT_COST_R());
				m_med.setUNIT_COST_TYP(getUNIT_COST_TYP_R());
				m_med.setCUR_CD(getCUR_CD_R());
				m_med.setEXCH_RATE(getEXCH_RATE_R());
				m_med.setPUCH_UNIT_QTY(getPUCH_SIZE_R());
				m_med.setCLASIFICATION_CD(getCLASIFICATION_CD_R());
				m_med.setCOMPANY_CD(getCOMPANY_CD_R());
				m_med.setORG_CD(getORG_CD_R());
				m_med.setSTOCK_UNIT(getSTOCK_UNIT_R());
				m_med.setONEROUS_FLG(getONEROUS_FLG_R());
				m_med.setUPDATED_DATE(getUPDATED_DATE_R());
				m_med.setTRANSACTION_TYP(getTRANSACTION_TYP_R());
				m_med.setSAVE_UPDATED_DATE(getSAVE_UPDATED_DATE_R());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("M_PUCH_UNIT_COST", "next", "レコード移動失敗");
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
				BatchAppException be=new BatchAppException("M_PUCH_UNIT_COST", "hasRecord", "レコード存在チェック失敗");
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
	 * M_PUCH_UNIT_COSTクラスの標準コンストラクタ
	 *
		 */
	public M_PUCH_UNIT_COST(medDB0020B001 med, BatchAppConductor cdr) throws SystemException
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
	public medDB0020B001 m_med=null;

	protected BatchAppConductor m_conductor;

	// interEntityクラスインスタンス
	public interEntity m_entity=new interEntity();

	// 各状態で実行するsql文の定義
	protected static String m_selcmd = "select "
+"  UNIT_COST.PLANT_CD as PLANT_CD, "
+"  UNIT_COST.ITEM_CD as ITEM_CD, "
+"  to_char(UNIT_COST_H.PUCH_PRIORITY_REF_NO) as PUCH_PRIORITY_REF_NO, "
+"  to_char(UNIT_COST.EFF_PHASE_IN_DATE, 'YYYY/MM/DD HH24:MI:SS') as EFF_PHASE_IN_DATE, "
+"  UNIT_COST.VEND_CD as VEND_CD, "
+"  to_char(trunc(decode(UNIT_COST.PUCH_SIZE, 0, M_PUCH_UNIT_COST.UNIT_COST, M_PUCH_UNIT_COST.UNIT_COST * UNIT_COST.PUCH_SIZE) + 0.00009, 4)) as UNIT_COST, "
+"  to_char(M_PUCH_UNIT_COST.UNIT_COST_TYP) as UNIT_COST_TYP, "
+"  M_VEND_CTRL.CUR_CD as CUR_CD, "
+"  to_char(decode(EXCH_RATE.EXCH_RATE, null, 1, EXCH_RATE.EXCH_RATE)) as EXCH_RATE, "
+"  decode(UNIT_COST.PUCH_SIZE, 0, 1, UNIT_COST.PUCH_SIZE) as PUCH_SIZE, "
+"  M_ITEM.CLASIFICATION_CD as CLASIFICATION_CD, "
+"  M_PUCH_UNIT_COST.COMPANY_CD as COMPANY_CD, "
+"  SYS_COST_CTRL.ORG_CD as ORG_CD, "
+"  M_ITEM.STOCK_UNIT as STOCK_UNIT, "
+"  to_char(decode(CONS.ONEROUS_FLG, null, 0, CONS.ONEROUS_FLG)) as ONEROUS_FLG, "
+"  to_char(M_PUCH_UNIT_COST.UPDATED_DATE, 'YYYY/MM/DD HH24:MI:SS') as UPDATED_DATE, "
+"  decode(CS_PUCH_IF.PLANT_CD, null, 1, 2) as TRANSACTION_TYP, "
+"  to_char(CS_PUCH_IF.SAVE_UPDATED_DATE, 'YYYY/MM/DD HH24:MI:SS') as SAVE_UPDATED_DATE "
+"from "
+"  M_PUCH_UNIT_COST, "
+"  M_VEND_CTRL, "
+"  M_ITEM, "
+"  ( "
+"    select "
+"      T_CS_PUCH_IF.PLANT_CD as PLANT_CD, "
+"      T_CS_PUCH_IF.ITEM_CD as ITEM_CD, "
+"      T_CS_PUCH_IF.CS_PROC_CD as CS_PROC_CD, "
+"      T_CS_PUCH_IF.VEND_CD as VEND_CD, "
+"      T_CS_PUCH_IF.EFF_PHASE_IN_DATE as EFF_PHASE_IN_DATE, "
+"      T_CS_PUCH_IF.SAVE_UPDATED_DATE as SAVE_UPDATED_DATE "
+"    from "
+"      T_CS_PUCH_IF "
+"    where "
+"      T_CS_PUCH_IF.\"YEAR\" = to_number(?) "
+"      and T_CS_PUCH_IF.HALF_TERM_TYP = to_number(?) "
+"      and T_CS_PUCH_IF.COST_TYP = to_number(?) "
+"  ) CS_PUCH_IF, "
+"  ( "
+"    select "
+"      M_PUCH_UNIT_COST_H.COMPANY_CD, "
+"      M_PUCH_UNIT_COST_H.VEND_CD, "
+"      M_PUCH_UNIT_COST_H.PLANT_CD as PLANT_CD, "
+"      M_PUCH_UNIT_COST_H.ITEM_CD as ITEM_CD, "
+"      min(M_PUCH_UNIT_COST_H.PUCH_PRIORITY_REF_NO) as PUCH_PRIORITY_REF_NO "
+"    from "
+"      M_PUCH_UNIT_COST_H "
+"    group by "
+"      M_PUCH_UNIT_COST_H.COMPANY_CD, "
+"      M_PUCH_UNIT_COST_H.VEND_CD, "
+"      M_PUCH_UNIT_COST_H.ITEM_CD, "
+"      M_PUCH_UNIT_COST_H.PLANT_CD "
+"  ) UNIT_COST_H, "
+"  ( "
+"    select "
+"      UNIT_COST.COMPANY_CD as COMPANY_CD, "
+"      UNIT_COST.VEND_CD as VEND_CD, "
+"      UNIT_COST.PLANT_CD as PLANT_CD, "
+"      UNIT_COST.ITEM_CD as ITEM_CD, "
+"      UNIT_COST.EFF_PHASE_IN_DATE as EFF_PHASE_IN_DATE, "
+"      min(UNIT_COST.PUCH_SIZE) as PUCH_SIZE "
+"    from "
+"      M_PUCH_UNIT_COST UNIT_COST, "
+"      ( "
+"        select "
+"          UNIT_COST.COMPANY_CD as COMPANY_CD, "
+"          UNIT_COST.VEND_CD as VEND_CD, "
+"          UNIT_COST.PLANT_CD as PLANT_CD, "
+"          UNIT_COST.ITEM_CD as ITEM_CD, "
+"          max(UNIT_COST.EFF_PHASE_IN_DATE) as EFF_PHASE_IN_DATE "
+"        from "
+"          M_PUCH_UNIT_COST UNIT_COST "
+"        where "
+"          UNIT_COST.PLANT_CD = ? "
+"          and to_date(to_char(UNIT_COST.EFF_PHASE_IN_DATE, 'YYYYMM'), 'YYYYMM') < to_date(?, 'YYYYMM') "
+"        group by "
+"          UNIT_COST.COMPANY_CD, "
+"          UNIT_COST.VEND_CD, "
+"          UNIT_COST.PLANT_CD, "
+"          UNIT_COST.ITEM_CD "
+"      ) UNIT_COST_2 "
+"    where "
+"      UNIT_COST.COMPANY_CD = UNIT_COST_2.COMPANY_CD "
+"      and UNIT_COST.VEND_CD = UNIT_COST_2.VEND_CD "
+"      and UNIT_COST.PLANT_CD = UNIT_COST_2.PLANT_CD "
+"      and UNIT_COST.ITEM_CD = UNIT_COST_2.ITEM_CD "
+"      and UNIT_COST.EFF_PHASE_IN_DATE = UNIT_COST_2.EFF_PHASE_IN_DATE "
+"    group by "
+"      UNIT_COST.COMPANY_CD, "
+"      UNIT_COST.VEND_CD, "
+"      UNIT_COST.PLANT_CD, "
+"      UNIT_COST.ITEM_CD, "
+"      UNIT_COST.EFF_PHASE_IN_DATE "
+"  ) UNIT_COST, "
+"  ( "
+"    select "
+"      M_EXCH_RATE.COMPANY_CD as COMPANY_CD, "
+"      M_EXCH_RATE.CUR_CD as CUR_CD, "
+"      M_EXCH_RATE.EXCH_TYP as EXCH_TYP, "
+"      M_EXCH_RATE.EXCH_RATE as EXCH_RATE "
+"    from "
+"      M_EXCH_RATE, "
+"      ( "
+"        select "
+"          M_EXCH_RATE.COMPANY_CD as COMPANY_CD, "
+"          M_EXCH_RATE.CUR_CD as CUR_CD, "
+"          M_EXCH_RATE.EXCH_TYP as EXCH_TYP, "
+"          max(M_EXCH_RATE.EXCH_START_DATE) as EXCH_START_DATE "
+"        from "
+"          M_EXCH_RATE "
+"        where "
+"          to_date(to_char(M_EXCH_RATE.EXCH_START_DATE, 'YYYYMM'), 'YYYYMM') < to_date(?, 'YYYYMM') "
+"        group by "
+"          M_EXCH_RATE.COMPANY_CD, "
+"          M_EXCH_RATE.CUR_CD, "
+"          M_EXCH_RATE.EXCH_TYP "
+"      ) EXCH_RATE "
+"    where "
+"      M_EXCH_RATE.COMPANY_CD = EXCH_RATE.COMPANY_CD "
+"      and M_EXCH_RATE.CUR_CD = EXCH_RATE.CUR_CD "
+"      and M_EXCH_RATE.EXCH_TYP = EXCH_RATE.EXCH_TYP "
+"      and M_EXCH_RATE.EXCH_START_DATE = EXCH_RATE.EXCH_START_DATE "
+"  ) EXCH_RATE, "
+"  ( "
+"    select "
+"      M_CONS_UNIT_COST.COMPANY_CD as COMPANY_CD, "
+"      M_CONS_UNIT_COST.PLANT_CD as PLANT_CD, "
+"      M_CONS_UNIT_COST.ITEM_CD as ITEM_CD, "
+"      min(M_CONS_UNIT_COST.ONEROUS_FLG) as ONEROUS_FLG "
+"    from "
+"      M_CONS_UNIT_COST, "
+"      ( "
+"        select "
+"          M_CONS_UNIT_COST.COMPANY_CD as COMPANY_CD, "
+"          M_CONS_UNIT_COST.PLANT_CD as PLANT_CD, "
+"          M_CONS_UNIT_COST.ITEM_CD as ITEM_CD, "
+"          max(M_CONS_UNIT_COST.EFF_PHASE_IN_DATE) as EFF_PHASE_IN_DATE "
+"        from "
+"          M_CONS_UNIT_COST "
+"        where "
+"          M_CONS_UNIT_COST.PLANT_CD = ? "
+"          and to_date(to_char(M_CONS_UNIT_COST.EFF_PHASE_IN_DATE, 'YYYYMM'), 'YYYYMM') < to_date(?, 'YYYYMM') "
+"        group by "
+"          M_CONS_UNIT_COST.COMPANY_CD, "
+"          M_CONS_UNIT_COST.PLANT_CD, "
+"          M_CONS_UNIT_COST.ITEM_CD "
+"      ) CONS "
+"    WHERE "
+"      M_CONS_UNIT_COST.COMPANY_CD = CONS.COMPANY_CD "
+"      and M_CONS_UNIT_COST.PLANT_CD = CONS.PLANT_CD "
+"      and M_CONS_UNIT_COST.ITEM_CD = CONS.ITEM_CD "
+"      and M_CONS_UNIT_COST.EFF_PHASE_IN_DATE = CONS.EFF_PHASE_IN_DATE "
+"    group by "
+"      M_CONS_UNIT_COST.COMPANY_CD, "
+"      M_CONS_UNIT_COST.PLANT_CD, "
+"      M_CONS_UNIT_COST.ITEM_CD "
+"  ) CONS, "
+"  SYS_COST_CTRL, "
+"  SYS_MY_COMPANY "
+"where "
+"  UNIT_COST.COMPANY_CD = M_PUCH_UNIT_COST.COMPANY_CD "
+"  and UNIT_COST.VEND_CD = M_PUCH_UNIT_COST.VEND_CD "
+"  and UNIT_COST.PLANT_CD = M_PUCH_UNIT_COST.PLANT_CD "
+"  and UNIT_COST.ITEM_CD = M_PUCH_UNIT_COST.ITEM_CD "
+"  and UNIT_COST.EFF_PHASE_IN_DATE = M_PUCH_UNIT_COST.EFF_PHASE_IN_DATE "
+"  and UNIT_COST.PUCH_SIZE = M_PUCH_UNIT_COST.PUCH_SIZE "
+"  and UNIT_COST.COMPANY_CD = UNIT_COST_H.COMPANY_CD "
+"  and UNIT_COST.VEND_CD = UNIT_COST_H.VEND_CD "
+"  and UNIT_COST.PLANT_CD = UNIT_COST_H.PLANT_CD "
+"  and UNIT_COST.ITEM_CD = UNIT_COST_H.ITEM_CD "
+"  and UNIT_COST.COMPANY_CD = M_VEND_CTRL.COMPANY_CD "
+"  and UNIT_COST.VEND_CD = M_VEND_CTRL.VEND_CD "
+"  and UNIT_COST.ITEM_CD = M_ITEM.ITEM_CD "
+"  and UNIT_COST.COMPANY_CD = CONS.COMPANY_CD(+) "
+"  and UNIT_COST.PLANT_CD = CONS.PLANT_CD(+) "
+"  and UNIT_COST.ITEM_CD = CONS.ITEM_CD(+) "
+"  and M_VEND_CTRL.COMPANY_CD = EXCH_RATE.COMPANY_CD(+) "
+"  and M_VEND_CTRL.CUR_CD = EXCH_RATE.CUR_CD(+) "
+"  and M_VEND_CTRL.EXCH_TYP = EXCH_RATE.EXCH_TYP(+) "
+"  and UNIT_COST.PLANT_CD = CS_PUCH_IF.PLANT_CD(+) "
+"  and UNIT_COST.ITEM_CD = CS_PUCH_IF.ITEM_CD(+) "
+"  and '*' = CS_PUCH_IF.CS_PROC_CD(+) "
+"  and UNIT_COST.VEND_CD = CS_PUCH_IF.VEND_CD(+) "
+"  and UNIT_COST.EFF_PHASE_IN_DATE = CS_PUCH_IF.EFF_PHASE_IN_DATE(+) "
+"  and UNIT_COST.PLANT_CD = SYS_COST_CTRL.PLANT_CD(+) "
+"  and UNIT_COST.COMPANY_CD = SYS_MY_COMPANY.COMPANY_CD "
+"  and SYS_MY_COMPANY.CTRL_CD = 'SYSTEM' "
+"order by "
+"  UNIT_COST.PLANT_CD, "
+"  UNIT_COST.ITEM_CD, "
+"  UNIT_COST_H.PUCH_PRIORITY_REF_NO, "
+"  UNIT_COST.EFF_PHASE_IN_DATE desc, "
+"  UNIT_COST.VEND_CD";
	protected static String m_inscmd = null;
	protected static String m_updcmd = null;
	protected static String m_delcmd = null;
	protected static String m_calcmd = null;

	// トランザクション利用の可否を設定します
	boolean m_useTransaction=true;

	//////////////////////////////

}
