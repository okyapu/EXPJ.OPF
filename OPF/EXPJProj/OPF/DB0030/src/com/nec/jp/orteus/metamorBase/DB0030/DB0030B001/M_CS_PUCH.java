/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DB0030/src/com/nec/jp/orteus/metamorBase/DB0030/DB0030B001/M_CS_PUCH.java,v $
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

package com.nec.jp.orteus.metamorBase.DB0030.DB0030B001;

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
 * CLASS     : M_CS_PUCH クラス
 * ファイル・クラス説明
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.7 $ $Date: 2014/11/05 07:21:38 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class M_CS_PUCH extends AbstractBatchAppEntity
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

		public void setYEAR_C(String value) throws FoundationException { getAdapt_C().setString(7, value); }
		public void setHALF_TERM_TYP_C(String value) throws FoundationException { getAdapt_C().setString(8, value); }
		public void setCOST_TYP_C(String value) throws FoundationException { getAdapt_C().setString(9, value); }
		public void setPLANT_CD_C(String value) throws FoundationException { getAdapt_C().setString(10, value); }
		public void setITEM_CD_C(String value) throws FoundationException { getAdapt_C().setString(11, value); }
		public void setCS_PROC_CD_C(String value) throws FoundationException { getAdapt_C().setString(12, value); }
		public void setVEND_CD_C(String value) throws FoundationException { getAdapt_C().setString(13, value); }
		public void setUNIT_COST_C(String value) throws FoundationException { getAdapt_C().setString(14, value); }
		public void setUNIT_COST_TYP_C(String value) throws FoundationException { getAdapt_C().setString(15, value); }
		public void setCUR_CD_C(String value) throws FoundationException { getAdapt_C().setString(16, value); }
		public void setEXCH_RATE_C(String value) throws FoundationException { getAdapt_C().setString(17, value); }
		public void setPUCH_UNIT_QTY_C(String value) throws FoundationException { getAdapt_C().setString(18, value); }
		public void setRCY_VAL_UNIT_COST_C(String value) throws FoundationException { getAdapt_C().setString(19, value); }
		public void setRCY_RECOUP_RATE_C(String value) throws FoundationException { getAdapt_C().setString(20, value); }
		public void setCLASIFICATION_CD_C(String value) throws FoundationException { getAdapt_C().setString(21, value); }
		public void setSTOCK_UNIT_C(String value) throws FoundationException { getAdapt_C().setString(22, value); }
		public void setONEROUS_CONS_FLG_C(String value) throws FoundationException { getAdapt_C().setString(23, value); }
		public void setCOMPANY_CD_C(String value) throws FoundationException { getAdapt_C().setString(24, value); }
		public void setORG_CD_C(String value) throws FoundationException { getAdapt_C().setString(25, value); }

		public int create() throws BatchAppException
		{
			try {
				getAdapt_C().setString(1, m_med.getSysdate());
				getAdapt_C().setString(2, m_med.getUsername());
				getAdapt_C().setString(3, m_med.getProgname());
				getAdapt_C().setString(4, m_med.getSysdate());
				getAdapt_C().setString(5, m_med.getUsername());
				getAdapt_C().setString(6, m_med.getProgname());
				setYEAR_C(m_med.getYEAR());
				setHALF_TERM_TYP_C(m_med.getHALF_TERM_TYP());
				setCOST_TYP_C(m_med.getCOST_TYP());
				setPLANT_CD_C(m_med.getPLANT_CD());
				setITEM_CD_C(m_med.getITEM_CD());
				setCS_PROC_CD_C(m_med.getPROC_CD());
				setVEND_CD_C(m_med.getVEND_CD());
				setUNIT_COST_C(m_med.getUNIT_COST());
				setUNIT_COST_TYP_C(m_med.getUNIT_COST_TYP());
				setCUR_CD_C(m_med.getCUR_CD());
				setEXCH_RATE_C(m_med.getEXCH_RATE());
				setPUCH_UNIT_QTY_C(m_med.getPUCH_UNIT_QTY());
				setRCY_VAL_UNIT_COST_C(m_med.getRCY_VAL_UNIT_COST());
				setRCY_RECOUP_RATE_C(m_med.getRCY_RECOUP_RATE());
				setCLASIFICATION_CD_C(m_med.getCLASIFICATION_CD());
				setSTOCK_UNIT_C(m_med.getSTOCK_UNIT());
				setONEROUS_CONS_FLG_C(m_med.getONEROUS_FLG());
				setCOMPANY_CD_C(m_med.getCOMPANY_CD());
				setORG_CD_C(m_med.getORG_CD());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("M_CS_PUCH", "create", "レコード新規追加パラメータ設定処理失敗");
				be.addMessage(e.getErrmsg());
				throw be;
			}

			executeCreate();

			return SUCCESS;
		}

		public void setIN2_R(String value) throws FoundationException { getAdapt_R().setString(1, value); }
		public void setIN3_R(String value) throws FoundationException { getAdapt_R().setString(2, value); }
		public void setIN4_R(String value) throws FoundationException { getAdapt_R().setString(3, value); }
		public void setIN5_R(String value) throws FoundationException { getAdapt_R().setString(4, value); }
		public void setIN6_R(String value) throws FoundationException { getAdapt_R().setString(5, value); }

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

				setIN2_R(m_med.getYEAR());
				setIN3_R(m_med.getHALF_TERM_TYP());
				setIN4_R(m_med.getCOST_TYP());
				setIN5_R(m_med.getPLANT_CD());
				setIN6_R(m_med.getITEM_CD());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("M_CS_PUCH", "read", "レコード検索条件設定処理失敗");
				be.addMessage(e.getErrmsg());
				throw be;
			}

			m_doRs = getRecordset(cache);

			return SUCCESS;
		}

		public void setVEND_CD_U(String value) throws FoundationException { getAdapt_U().setString(4, value); }
		public void setUNIT_COST_U(String value) throws FoundationException { getAdapt_U().setString(5, value); }
		public void setUNIT_COST_TYP_U(String value) throws FoundationException { getAdapt_U().setString(6, value); }
		public void setCUR_CD_U(String value) throws FoundationException { getAdapt_U().setString(7, value); }
		public void setEXCH_RATE_U(String value) throws FoundationException { getAdapt_U().setString(8, value); }
		public void setPUCH_UNIT_QTY_U(String value) throws FoundationException { getAdapt_U().setString(9, value); }
		public void setRCY_VAL_UNIT_COST_U(String value) throws FoundationException { getAdapt_U().setString(10, value); }
		public void setRCY_RECOUP_RATE_U(String value) throws FoundationException { getAdapt_U().setString(11, value); }
		public void setCLASIFICATION_CD_U(String value) throws FoundationException { getAdapt_U().setString(12, value); }
		public void setSTOCK_UNIT_U(String value) throws FoundationException { getAdapt_U().setString(13, value); }
		public void setONEROUS_CONS_FLG_U(String value) throws FoundationException { getAdapt_U().setString(14, value); }
		public void setCOMPANY_CD_U(String value) throws FoundationException { getAdapt_U().setString(15, value); }
		public void setORG_CD_U(String value) throws FoundationException { getAdapt_U().setString(16, value); }
		public void setIN13_U(String value) throws FoundationException { getAdapt_U().setString(17, value); }
		public void setIN14_U(String value) throws FoundationException { getAdapt_U().setString(18, value); }
		public void setIN15_U(String value) throws FoundationException { getAdapt_U().setString(19, value); }
		public void setIN16_U(String value) throws FoundationException { getAdapt_U().setString(20, value); }
		public void setIN17_U(String value) throws FoundationException { getAdapt_U().setString(21, value); }
		public void setIN18_U(String value) throws FoundationException { getAdapt_U().setString(22, value); }

		public int update() throws BatchAppException
		{
			try {
				getAdapt_U().setString(1, m_med.getSysdate());
				getAdapt_U().setString(2, m_med.getUsername());
				getAdapt_U().setString(3, m_med.getProgname());
				setVEND_CD_U(m_med.getVEND_CD());
				setUNIT_COST_U(m_med.getUNIT_COST());
				setUNIT_COST_TYP_U(m_med.getUNIT_COST_TYP());
				setCUR_CD_U(m_med.getCUR_CD());
				setEXCH_RATE_U(m_med.getEXCH_RATE());
				setPUCH_UNIT_QTY_U(m_med.getPUCH_UNIT_QTY());
				setRCY_VAL_UNIT_COST_U(m_med.getRCY_VAL_UNIT_COST());
				setRCY_RECOUP_RATE_U(m_med.getRCY_RECOUP_RATE());
				setCLASIFICATION_CD_U(m_med.getCLASIFICATION_CD());
				setSTOCK_UNIT_U(m_med.getSTOCK_UNIT());
				setONEROUS_CONS_FLG_U(m_med.getONEROUS_FLG());
				setCOMPANY_CD_U(m_med.getCOMPANY_CD());
				setORG_CD_U(m_med.getORG_CD());
				setIN13_U(m_med.getYEAR());
				setIN14_U(m_med.getHALF_TERM_TYP());
				setIN15_U(m_med.getCOST_TYP());
				setIN16_U(m_med.getPLANT_CD());
				setIN17_U(m_med.getITEM_CD());
				setIN18_U(m_med.getPROC_CD());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("M_CS_PUCH", "update", "レコード更新条件設定処理失敗");
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
		public String getCS_PROC_CD_R() throws FoundationException { return m_doRs.getString(2); }

		public boolean next() throws BatchAppException
		{
			try {
				if(m_doRs.next()==false) return false;

				m_med.setUPDATE_TYP(getUPDATE_TYP_R());
				m_med.setCS_PROC_CD(getCS_PROC_CD_R());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("M_CS_PUCH", "next", "レコード移動失敗");
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
				BatchAppException be=new BatchAppException("M_CS_PUCH", "hasRecord", "レコード存在チェック失敗");
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
			BatchAppException be=new BatchAppException("M_CS_PUCH", "prepareALL(FoundationException)", "SQL文のprepareで失敗しました");
			be.addMessage(e.getErrmsg());
			throw be;
		} catch(SQLException e) {
			BatchAppException be=new BatchAppException("M_CS_PUCH", "prepareALL(SQLException)", "SQL文のprepareで失敗しました");
			throw be;
		}

		return;
	}

	//////////////////////////////

	/**
	 * M_CS_PUCHクラスの標準コンストラクタ
	 *
		 */
	public M_CS_PUCH(medDB0030B001 med, BatchAppConductor cdr) throws SystemException
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
	public medDB0030B001 m_med=null;

	protected BatchAppConductor m_conductor;

	// interEntityクラスインスタンス
	public interEntity m_entity=new interEntity();

	// 各状態で実行するsql文の定義
	protected static String m_selcmd = "select "
+"  to_char(M_CS_PUCH.\"UPDATE_TYP\") as \"UPDATE_TYP\", "
+"  M_CS_PUCH.\"CS_PROC_CD\" as \"CS_PROC_CD\" "
+"from "
+"  M_CS_PUCH "
+"where "
+"  M_CS_PUCH.\"YEAR\" = to_number(?) "
+"  and M_CS_PUCH.\"HALF_TERM_TYP\" = to_number(?) "
+"  and M_CS_PUCH.\"COST_TYP\" = to_number(?) "
+"  and M_CS_PUCH.\"PLANT_CD\" = ? "
+"  and M_CS_PUCH.\"ITEM_CD\" = ?";
	protected static String m_inscmd = "insert into "
+"  M_CS_PUCH(\"YEAR\", \"HALF_TERM_TYP\", \"COST_TYP\", \"PLANT_CD\", \"ITEM_CD\", \"CS_PROC_CD\", \"VEND_CD\", \"UNIT_COST\", \"UNIT_COST_TYP\", \"CUR_CD\", \"EXCH_RATE\", \"PUCH_UNIT_QTY\", \"RCY_VAL_UNIT_COST\", \"RCY_RECOUP_RATE\", \"SUB_VEND_CD\", \"SUB_UNIT_COST\", \"SUB_UNIT_COST_TYP\", \"SUB_CUR_CD\", \"SUB_EXCH_RATE\", \"SUB_PUCH_UNIT_QTY\", \"SUB_RCY_VAL_UNIT_COST\", \"SUB_RCY_RECOUP_RATE\", \"CLASIFICATION_CD\", \"STOCK_UNIT\", \"UNIT_COST_ACCEPT_TYP\", \"CS_PUCH_TYP\", \"ONEROUS_CONS_FLG\", \"UPDATE_TYP\", \"DEL_FLG\", \"COMPANY_CD\", \"ORG_CD\") "
+"values "
+"  (to_number(?), to_number(?), to_number(?), ?, ?, ?, ?, to_number(?), to_number(?), ?, to_number(?), to_number(?), to_number(?), to_number(?), null, 0, 1, null, 0, 1, 0, 0, ?, ?, 1, 2, to_number(?), 1, 0, ?, ?)";
	protected static String m_updcmd = "update "
+"  M_CS_PUCH "
+"set "
+"  \"VEND_CD\" = ?, "
+"  \"UNIT_COST\" = to_number(?), "
+"  \"UNIT_COST_TYP\" = to_number(?), "
+"  \"CUR_CD\" = ?, "
+"  \"EXCH_RATE\" = to_number(?), "
+"  \"PUCH_UNIT_QTY\" = to_number(?), "
+"  \"RCY_VAL_UNIT_COST\" = to_number(?), "
+"  \"RCY_RECOUP_RATE\" = to_number(?), "
+"  \"CLASIFICATION_CD\" = ?, "
+"  \"STOCK_UNIT\" = ?, "
+"  \"UNIT_COST_ACCEPT_TYP\" = 1, "
+"  \"CS_PUCH_TYP\" = 2, "
+"  \"ONEROUS_CONS_FLG\" = to_number(?), "
+"  \"UPDATE_TYP\" = 1, "
+"  \"DEL_FLG\" = 0, "
+"  \"COMPANY_CD\" = ?, "
+"  \"ORG_CD\" = ? "
+"where "
+"  M_CS_PUCH.\"YEAR\" = to_number(?) "
+"  and M_CS_PUCH.\"HALF_TERM_TYP\" = to_number(?) "
+"  and M_CS_PUCH.\"COST_TYP\" = to_number(?) "
+"  and M_CS_PUCH.\"PLANT_CD\" = ? "
+"  and M_CS_PUCH.\"ITEM_CD\" = ? "
+"  and M_CS_PUCH.\"CS_PROC_CD\" = ?";
	protected static String m_delcmd = null;
	protected String m_spcmd=null;

	// トランザクション利用の可否を設定します
	boolean m_useTransaction=true;

	//////////////////////////////

}
