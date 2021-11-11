/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KQ0010/src/com/nec/jp/orteus/metamorBase/KQ0010/KQ0010B001/INDATA.java,v $
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
 * CLASS     : INDATA クラス
 * ファイル・クラス説明
 * @author $Author: geng-jia $
 * @version $Revision: 1.21 $ $Date: 2015/12/03 08:12:34 $
 */

//{{user_implement_dev:header
/**
 * CLASS     : INDATA クラス
 * VERSION   : 1.0.0.0
 * DATE      : <日付>
 * AUTHOR    : <開発者名>
 * HISTORY
 *           : 1.0.0.0　(2004/3/16),新規作成
 *         [ : <バージョン> (<日付>),<内容> ]
 *                        ・ ・ ・
 */
//}}user_implement_dev:header

public class INDATA extends AbstractBatchAppEntity
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
				BatchAppException be=new BatchAppException("INDATA", "read", "レコード検索条件設定処理失敗");
				be.addMessage(e.getErrmsg());
				throw be;
			}

			m_doRs = getRecordset(cache);

			return SUCCESS;
		}

		public void setSYSTEM_PROC_TYP_U(String value) throws FoundationException { getAdapt_U().setString(4, value); }
		public void setODR_INFO_COM_IF_CTRL_NO_U(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_U().setString(5, null);
			} else {
				getAdapt_U().setDouble(5, value);
			}
		}
		public void setODR_SEQ_U(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_U().setString(6, null);
			} else {
				getAdapt_U().setDouble(6, value);
			}
		}

		public int update() throws BatchAppException
		{
			try {
				getAdapt_U().setString(1, m_med.getSysdate());
				getAdapt_U().setString(2, m_med.getUsername());
				getAdapt_U().setString(3, m_med.getProgname());
				setSYSTEM_PROC_TYP_U(m_med.getg_SYSTEM_PROC_TYP());
				setODR_INFO_COM_IF_CTRL_NO_U(m_med.getg_ODR_INFO_COM_IF_CTRL_NO());
				setODR_SEQ_U(m_med.getg_ODR_SEQ());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("INDATA", "update", "レコード更新条件設定処理失敗");
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

		public boolean wasNull_ODR_INFO_COM_IF_CTRL_NO_R() throws FoundationException { return m_doRs.wasNull(1); }
		public Number getODR_INFO_COM_IF_CTRL_NO_R() throws FoundationException { return m_doRs.getDouble(1); }
		public boolean wasNull_ODR_SEQ_R() throws FoundationException { return m_doRs.wasNull(2); }
		public Number getODR_SEQ_R() throws FoundationException { return m_doRs.getDouble(2); }
		public String getODR_TYP_R() throws FoundationException { return m_doRs.getString(3); }
		public String getIF_TYP_R() throws FoundationException { return m_doRs.getString(4); }
		public String getINFO_TYP_CD_R() throws FoundationException { return m_doRs.getString(5); }
		public String getCUST_ODR_NO_R() throws FoundationException { return m_doRs.getString(6); }
		public String getODR_ACPT_DATE_R() throws FoundationException { return m_doRs.getString(7); }
		public String getCUST_CD_R() throws FoundationException { return m_doRs.getString(8); }
		public String getCUST_ITEM_CD_R() throws FoundationException { return m_doRs.getString(9); }
		public String getPART_NAME_R() throws FoundationException { return m_doRs.getString(10); }
		public String getPROC_TYP_R() throws FoundationException { return m_doRs.getString(11); }
		public String getCOCK_TYP_R() throws FoundationException { return m_doRs.getString(12); }
		public String getUNIT_CD_R() throws FoundationException { return m_doRs.getString(13); }
		public boolean wasNull_UNIT_COST_R() throws FoundationException { return m_doRs.wasNull(14); }
		public Number getUNIT_COST_R() throws FoundationException { return m_doRs.getDouble(14); }
		public String getUNIT_COST_TYP_R() throws FoundationException { return m_doRs.getString(15); }
		public String getDESINATED_DLV_DATE_R() throws FoundationException { return m_doRs.getString(16); }
		public boolean wasNull_PUCH_ODR_QTY_R() throws FoundationException { return m_doRs.wasNull(17); }
		public Number getPUCH_ODR_QTY_R() throws FoundationException { return m_doRs.getDouble(17); }
		public String getPKG_UNIT_R() throws FoundationException { return m_doRs.getString(18); }
		public String getINSPC_TYP_R() throws FoundationException { return m_doRs.getString(19); }
		public String getDLV_LOC_CD_R() throws FoundationException { return m_doRs.getString(20); }
		public String getDLV_LOC_CD_EIAJ_R() throws FoundationException { return m_doRs.getString(21); }
		public String getDLV_LOC_NAME_KANJI_R() throws FoundationException { return m_doRs.getString(22); }
		public String getCUS_DLV_CD_R() throws FoundationException { return m_doRs.getString(23); }
		public String getCUS_DLV_KEY_CD_R() throws FoundationException { return m_doRs.getString(24); }
		public String getFREE_REMARK_R() throws FoundationException { return m_doRs.getString(25); }
		public String getREMARK_R() throws FoundationException { return m_doRs.getString(26); }
		public String getCLIENT_BARCODE_INF_R() throws FoundationException { return m_doRs.getString(27); }
		public String getCLIENT_REMARK_R() throws FoundationException { return m_doRs.getString(28); }
		public String getCLIENT_REMARK_KANJI_R() throws FoundationException { return m_doRs.getString(29); }
		public String getSLIP_PRICE_PRINT_TYP_R() throws FoundationException { return m_doRs.getString(30); }
		public String getCUR_CD_R() throws FoundationException { return m_doRs.getString(31); }
		public String getOLD_ITEM_ODR_ACPT_F_R() throws FoundationException { return m_doRs.getString(32); }
		public String getFORCED_ERR_ITEM_ODR_ACPT_F_R() throws FoundationException { return m_doRs.getString(33); }
		public String getBUYER_NAME_R() throws FoundationException { return m_doRs.getString(34); }
		public boolean wasNull_PUCH_ODR_QTY_TOTAL_R() throws FoundationException { return m_doRs.wasNull(35); }
		public Number getPUCH_ODR_QTY_TOTAL_R() throws FoundationException { return m_doRs.getDouble(35); }
		public String getUNIT_CD_ORG_R() throws FoundationException { return m_doRs.getString(36); }
		public String getBUYER_ORG_CD_R() throws FoundationException { return m_doRs.getString(37); }

		public boolean next() throws BatchAppException
		{
			try {
				if(m_doRs.next()==false) return false;

				if(wasNull_ODR_INFO_COM_IF_CTRL_NO_R()==true) {
					m_med.setg_ODR_INFO_COM_IF_CTRL_NO(null);
				} else {
					m_med.setg_ODR_INFO_COM_IF_CTRL_NO(new Double(getODR_INFO_COM_IF_CTRL_NO_R().doubleValue()));
				}
				if(wasNull_ODR_SEQ_R()==true) {
					m_med.setg_ODR_SEQ(null);
				} else {
					m_med.setg_ODR_SEQ(new Double(getODR_SEQ_R().doubleValue()));
				}
				m_med.setg_ODR_TYP(getODR_TYP_R());
				m_med.setg_IF_TYP(getIF_TYP_R());
				m_med.setg_INFO_TYP_CD(getINFO_TYP_CD_R());
				m_med.setg_CUST_ODR_NO(getCUST_ODR_NO_R());
				m_med.setg_ODR_ACPT_DATE(getODR_ACPT_DATE_R());
				m_med.setg_CUST_CD(getCUST_CD_R());
				m_med.setg_CUST_ITEM_CD(getCUST_ITEM_CD_R());
				m_med.setg_PART_NAME(getPART_NAME_R());
				m_med.setg_PROC_TYP(getPROC_TYP_R());
				m_med.setg_COCK_TYP(getCOCK_TYP_R());
				m_med.setg_UNIT_CD(getUNIT_CD_R());
				if(wasNull_UNIT_COST_R()==true) {
					m_med.setg_UNIT_COST(null);
				} else {
					m_med.setg_UNIT_COST(new Double(getUNIT_COST_R().doubleValue()));
				}
				m_med.setg_UNIT_COST_TYP(getUNIT_COST_TYP_R());
				m_med.setg_DESINATED_DLV_DATE(getDESINATED_DLV_DATE_R());
				if(wasNull_PUCH_ODR_QTY_R()==true) {
					m_med.setg_PUCH_ODR_QTY(null);
				} else {
					m_med.setg_PUCH_ODR_QTY(new Double(getPUCH_ODR_QTY_R().doubleValue()));
				}
				m_med.setg_PKG_UNIT(getPKG_UNIT_R());
				m_med.setg_INSPC_TYP(getINSPC_TYP_R());
				m_med.setg_DLV_LOC_CD(getDLV_LOC_CD_R());
				m_med.setg_DLV_LOC_CD_EIAJ(getDLV_LOC_CD_EIAJ_R());
				m_med.setg_DLV_LOC_NAME_KANJI(getDLV_LOC_NAME_KANJI_R());
				m_med.setg_CUS_DLV_CD(getCUS_DLV_CD_R());
				m_med.setg_CUS_DLV_KEY_CD(getCUS_DLV_KEY_CD_R());
				m_med.setg_FREE_REMARK(getFREE_REMARK_R());
				m_med.setg_REMARK(getREMARK_R());
				m_med.setg_CLIENT_BARCODE_INF(getCLIENT_BARCODE_INF_R());
				m_med.setg_CLIENT_REMARK(getCLIENT_REMARK_R());
				m_med.setg_CLIENT_REMARK_KANJI(getCLIENT_REMARK_KANJI_R());
				m_med.setg_SLIP_PRICE_PRINT_TYP(getSLIP_PRICE_PRINT_TYP_R());
				m_med.setg_CUR_CD(getCUR_CD_R());
				m_med.setg_OLD_ITEM_ODR_ACPT_F(getOLD_ITEM_ODR_ACPT_F_R());
				m_med.setg_FORCED_ERR_ITEM_ODR_ACPT_F(getFORCED_ERR_ITEM_ODR_ACPT_F_R());
				m_med.setg_BUYER_NAME(getBUYER_NAME_R());
				if(wasNull_PUCH_ODR_QTY_TOTAL_R()==true) {
					m_med.setg_PUCH_ODR_QTY_TOTAL(null);
				} else {
					m_med.setg_PUCH_ODR_QTY_TOTAL(new Double(getPUCH_ODR_QTY_TOTAL_R().doubleValue()));
				}
				m_med.setg_UNIT_CD_ORG(getUNIT_CD_ORG_R());
				m_med.setg_BUYER_ORG_CD(getBUYER_ORG_CD_R());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("INDATA", "next", "レコード移動失敗");
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
				BatchAppException be=new BatchAppException("INDATA", "hasRecord", "レコード存在チェック失敗");
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
			prepareCreate(sCREATE);
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
			BatchAppException be=new BatchAppException("INDATA", "prepareALL(FoundationException)", "SQL文のprepareで失敗しました");
			be.addMessage(e.getErrmsg());
			throw be;
		} catch(SQLException e) {
			BatchAppException be=new BatchAppException("INDATA", "prepareALL(SQLException)", "SQL文のprepareで失敗しました");
			throw be;
		}

		return;
	}

	//////////////////////////////

	/**
	 * INDATAクラスの標準コンストラクタ
	 *
		 */
	public INDATA(medKQ0010B001 med, BatchAppConductor cdr) throws SystemException
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
+"  T_ODR_INFO_COM_IF.\"ODR_INFO_COM_IF_CTRL_NO\" as \"ODR_INFO_COM_IF_CTRL_NO\", "
+"  T_ODR_INFO_COM_IF.\"ODR_SEQ\" as \"ODR_SEQ\", "
+"  T_ODR_INFO_COM_IF.\"ODR_TYP\" as \"ODR_TYP\", "
+"  T_ODR_INFO_COM_IF.\"IF_TYP\" as \"IF_TYP\", "
+"  T_ODR_INFO_COM_IF.\"INFO_TYP_CD\" as \"INFO_TYP_CD\", "
+"  T_ODR_INFO_COM_IF.\"CUST_ODR_NO\" as \"CUST_ODR_NO\", "
+"  TO_CHAR(T_ODR_INFO_COM_IF.\"ODR_ACPT_DATE\", 'YYYY/MM/DD') as \"ODR_ACPT_DATE\", "
+"  T_ODR_INFO_COM_IF.\"CUST_CD\" as \"CUST_CD\", "
+"  T_ODR_INFO_COM_IF.\"CUST_ITEM_CD\" as \"CUST_ITEM_CD\", "
+"  T_ODR_INFO_COM_IF.\"PART_NAME\" as \"PART_NAME\", "
+"  T_ODR_INFO_COM_IF.\"PROC_TYP\" as \"PROC_TYP\", "
+"  T_ODR_INFO_COM_IF.\"COCK_TYP\" as \"COCK_TYP\", "
+"  T_ODR_INFO_COM_IF.\"UNIT_CD\" as \"UNIT_CD\", "
+"  T_ODR_INFO_COM_IF.\"UNIT_COST\" as \"UNIT_COST\", "
+"  T_ODR_INFO_COM_IF.\"UNIT_COST_TYP\" as \"UNIT_COST_TYP\", "
+"  TO_CHAR(T_ODR_INFO_COM_IF.\"DESINATED_DLV_DATE\", 'YYYY/MM/DD') as \"DESINATED_DLV_DATE\", "
+"  T_ODR_INFO_COM_IF.\"PUCH_ODR_QTY\" as \"PUCH_ODR_QTY\", "
+"  T_ODR_INFO_COM_IF.\"PKG_UNIT\" as \"PKG_UNIT\", "
+"  T_ODR_INFO_COM_IF.\"INSPC_TYP\" as \"INSPC_TYP\", "
+"  T_ODR_INFO_COM_IF.\"DLV_LOC_CD\" as \"DLV_LOC_CD\", "
+"  T_ODR_INFO_COM_IF.\"DLV_LOC_CD_EIAJ\" as \"DLV_LOC_CD_EIAJ\", "
+"  T_ODR_INFO_COM_IF.\"DLV_LOC_NAME_KANJI\" as \"DLV_LOC_NAME_KANJI\", "
+"  T_ODR_INFO_COM_IF.\"CUS_DLV_CD\" as \"CUS_DLV_CD\", "
+"  T_ODR_INFO_COM_IF.\"CUS_DLV_KEY_CD\" as \"CUS_DLV_KEY_CD\", "
+"  T_ODR_INFO_COM_IF.\"FREE_REMARK\" as \"FREE_REMARK\", "
+"  T_ODR_INFO_COM_IF.\"REMARK\" as \"REMARK\", "
+"  T_ODR_INFO_COM_IF.\"CLIENT_BARCODE_INF\" as \"CLIENT_BARCODE_INF\", "
+"  T_ODR_INFO_COM_IF.\"CLIENT_REMARK\" as \"CLIENT_REMARK\", "
+"  T_ODR_INFO_COM_IF.\"CLIENT_REMARK_KANJI\" as \"CLIENT_REMARK_KANJI\", "
+"  T_ODR_INFO_COM_IF.\"SLIP_PRICE_PRINT_TYP\" as \"SLIP_PRICE_PRINT_TYP\", "
+"  T_ODR_INFO_COM_IF.\"CUR_CD\" as \"CUR_CD\", "
+"  T_ODR_INFO_COM_IF.\"OLD_ITEM_ODR_ACPT_F\" as \"OLD_ITEM_ODR_ACPT_F\", "
+"  T_ODR_INFO_COM_IF.\"FORCED_ERR_ITEM_ODR_ACPT_F\" as \"FORCED_ERR_ITEM_ODR_ACPT_F\", "
+"  T_ODR_INFO_COM_IF.\"BUYER_NAME\" as \"BUYER_NAME\", "
+"  T_ODR_INFO_COM_IF.\"PUCH_ODR_QTY_TOTAL\" as \"PUCH_ODR_QTY_TOTAL\", "
+"  T_ODR_INFO_COM_IF.\"UNIT_CD_ORG\" as \"UNIT_CD_ORG\", "
+"  T_ODR_INFO_COM_IF.\"BUYER_ORG_CD\" as \"BUYER_ORG_CD\" "
+"from "
+"  T_ODR_INFO_COM_IF "
+"where "
+"  T_ODR_INFO_COM_IF.\"SYSTEM_PROC_TYP\" = '0' "
+"  and T_ODR_INFO_COM_IF.\"DEL_FLG\" = '0' "
+"  and T_ODR_INFO_COM_IF.\"PROC_TYP\" = '1' "
+"order by "
+"  T_ODR_INFO_COM_IF.\"ODR_ACPT_DATE\", "
+"  T_ODR_INFO_COM_IF.\"CUST_CD\", "
+"  T_ODR_INFO_COM_IF.\"CUST_ITEM_CD\", "
+"  T_ODR_INFO_COM_IF.\"ODR_ACPT_PROC_ODR\", "
+"  T_ODR_INFO_COM_IF.\"ODR_INFO_COM_IF_CTRL_NO\", "
+"  T_ODR_INFO_COM_IF.\"ODR_SEQ\"";
	protected static String m_inscmd = null;
	protected static String m_updcmd = "update "
+"  T_ODR_INFO_COM_IF "
+"set "
+"  \"SYSTEM_PROC_TYP\" = ? "
+"where "
+"  T_ODR_INFO_COM_IF.\"ODR_INFO_COM_IF_CTRL_NO\" = ? "
+"  and T_ODR_INFO_COM_IF.\"ODR_SEQ\" = ?";
	protected static String m_delcmd = null;
	protected String m_spcmd=null;

	// トランザクション利用の可否を設定します
	boolean m_useTransaction=true;

	//////////////////////////////

}
