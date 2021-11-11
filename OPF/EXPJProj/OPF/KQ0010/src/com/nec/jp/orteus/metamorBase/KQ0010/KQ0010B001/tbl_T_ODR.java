/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KQ0010/src/com/nec/jp/orteus/metamorBase/KQ0010/KQ0010B001/tbl_T_ODR.java,v $
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
 * CLASS     : tbl_T_ODR クラス
 * ファイル・クラス説明
 * @author $Author: geng-jia $
 * @version $Revision: 1.21 $ $Date: 2015/12/03 08:12:40 $
 */

//{{user_implement_dev:header
/**
 * CLASS     : tbl_T_ODR クラス
 * VERSION   : 1.0.0.0
 * DATE      : <日付>
 * AUTHOR    : <開発者名>
 * HISTORY
 *           : 1.0.0.0　(2004/3/16),新規作成
 *         [ : <バージョン> (<日付>),<内容> ]
 *                        ・ ・ ・
 */
//}}user_implement_dev:header

public class tbl_T_ODR extends AbstractBatchAppEntity
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

		public void setODR_NO_C(String value) throws FoundationException { getAdapt_C().setString(7, value); }
		public void setODR_TYP_C(String value) throws FoundationException { getAdapt_C().setString(8, value); }
		public void setODR_CTL_NO_C(String value) throws FoundationException { getAdapt_C().setString(9, value); }
		public void setCUST_ODR_NO_C(String value) throws FoundationException { getAdapt_C().setString(10, value); }
		public void setCUST_CHRG_ORG_CD_C(String value) throws FoundationException { getAdapt_C().setString(11, value); }
		public void setCUST_CHRG_PSN_CD_C(String value) throws FoundationException { getAdapt_C().setString(12, value); }
		public void setODR_ACPT_ORG_CD_C(String value) throws FoundationException { getAdapt_C().setString(13, value); }
		public void setODR_ACPT_PSN_CD_C(String value) throws FoundationException { getAdapt_C().setString(14, value); }
		public void setCURRNCY_CD_C(String value) throws FoundationException { getAdapt_C().setString(15, value); }
		public void setDLV_LOC_CD_C(String value) throws FoundationException { getAdapt_C().setString(16, value); }
		public void setDLV_LOC_CD_EIAJ_C(String value) throws FoundationException { getAdapt_C().setString(17, value); }
		public void setDLV_LOC_NAME_KANJI_C(String value) throws FoundationException { getAdapt_C().setString(18, value); }
		public void setODR_UNIT_PRICE_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(19, null);
			} else {
				getAdapt_C().setDouble(19, value);
			}
		}
		public void setSPCL_PRICE_TYP_C(String value) throws FoundationException { getAdapt_C().setString(20, value); }
		public void setDESINATED_DLV_DATE_C(String value) throws FoundationException { getAdapt_C().setString(21, value); }
		public void setSTD_DESINATED_RCV_DATE_C(String value) throws FoundationException { getAdapt_C().setString(22, value); }
		public void setODR_QTY_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(23, null);
			} else {
				getAdapt_C().setDouble(23, value);
			}
		}
		public void setREMAIN_UNCONFIRM_ODR_QTY_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(24, null);
			} else {
				getAdapt_C().setDouble(24, value);
			}
		}
		public void setCANCELED_UNCONFIRM_ODR_QTY_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(25, null);
			} else {
				getAdapt_C().setDouble(25, value);
			}
		}
		public void setUNIT_CD_C(String value) throws FoundationException { getAdapt_C().setString(26, value); }
		public void setUNCONFIRM_ODR_BALANCE_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(27, null);
			} else {
				getAdapt_C().setDouble(27, value);
			}
		}
		public void setODR_AMOUNT_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(28, null);
			} else {
				getAdapt_C().setDouble(28, value);
			}
		}
		public void setODR_AMOUNT_EXCH_RATES_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(29, null);
			} else {
				getAdapt_C().setDouble(29, value);
			}
		}
		public void setCUS_DLV_CD_C(String value) throws FoundationException { getAdapt_C().setString(30, value); }
		public void setCUS_DLV_KEY_CD_C(String value) throws FoundationException { getAdapt_C().setString(31, value); }
		public void setPART_NAME_C(String value) throws FoundationException { getAdapt_C().setString(32, value); }
		public void setTRANSPORT_CD_C(String value) throws FoundationException { getAdapt_C().setString(33, value); }
		public void setTAX_APPLY_TYP_C(String value) throws FoundationException { getAdapt_C().setString(34, value); }
		public void setTAX_CD_C(String value) throws FoundationException { getAdapt_C().setString(35, value); }
		public void setTAX_CALC_TYP_C(String value) throws FoundationException { getAdapt_C().setString(36, value); }
		public void setREMARKS_C(String value) throws FoundationException { getAdapt_C().setString(37, value); }
		public void setODR_ACPT_DATE_C(String value) throws FoundationException { getAdapt_C().setString(38, value); }
		public void setPARTIAL_SHIP_INST_FLG_C(String value) throws FoundationException { getAdapt_C().setString(39, value); }
		public void setDEPO_TYP_C(String value) throws FoundationException { getAdapt_C().setString(40, value); }
		public void setEXCH_TYP_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(41, null);
			} else {
				getAdapt_C().setDouble(41, value);
			}
		}
		public void setSHIP_PLAN_REMAIN_QTY_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(42, null);
			} else {
				getAdapt_C().setDouble(42, value);
			}
		}
		public void setIF_CTL_NO_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(43, null);
			} else {
				getAdapt_C().setDouble(43, value);
			}
		}
		public void setTRANSPORT_TYP_C(String value) throws FoundationException { getAdapt_C().setString(44, value); }
		public void setPKG_UNIT_C(String value) throws FoundationException { getAdapt_C().setString(45, value); }
		public void setSLIP_PRICE_PRINT_TYP_C(String value) throws FoundationException { getAdapt_C().setString(46, value); }
		public void setINSPC_TYP_C(String value) throws FoundationException { getAdapt_C().setString(47, value); }
		public void setCLIENT_REMARK_C(String value) throws FoundationException { getAdapt_C().setString(48, value); }
		public void setCLIENT_REMARK_KANJI_C(String value) throws FoundationException { getAdapt_C().setString(49, value); }
		public void setCLIENT_BARCODE_INF_C(String value) throws FoundationException { getAdapt_C().setString(50, value); }
		public void setODR_SEQ_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(51, null);
			} else {
				getAdapt_C().setDouble(51, value);
			}
		}
		public void setUNIT_CD_ORG_C(String value) throws FoundationException { getAdapt_C().setString(52, value); }
		public void setPUCH_ODR_QTY_TOTAL_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(53, null);
			} else {
				getAdapt_C().setDouble(53, value);
			}
		}
		public void setBUYER_NAME_C(String value) throws FoundationException { getAdapt_C().setString(54, value); }
		public void setBUYER_ORG_CD_C(String value) throws FoundationException { getAdapt_C().setString(55, value); }
		public void setCOCK_TYP_C(String value) throws FoundationException { getAdapt_C().setString(56, value); }

		public int create() throws BatchAppException
		{
			try {
				getAdapt_C().setString(1, m_med.getSysdate());
				getAdapt_C().setString(2, m_med.getUsername());
				getAdapt_C().setString(3, m_med.getProgname());
				getAdapt_C().setString(4, m_med.getSysdate());
				getAdapt_C().setString(5, m_med.getUsername());
				getAdapt_C().setString(6, m_med.getProgname());
				setODR_NO_C(m_med.getstrODR_NO());
				setODR_TYP_C(m_med.getstrODR_TYP());
				setODR_CTL_NO_C(m_med.getstrODR_CTL_NO());
				setCUST_ODR_NO_C(m_med.getstrCUST_ODR_NO());
				setCUST_CHRG_ORG_CD_C(m_med.getstrCUST_CHRG_ORG_CD());
				setCUST_CHRG_PSN_CD_C(m_med.getstrCUST_CHRG_PSN_CD());
				setODR_ACPT_ORG_CD_C(m_med.getstrODR_ACPT_ORG_CD());
				setODR_ACPT_PSN_CD_C(m_med.getstrODR_ACPT_PSN_CD());
				setCURRNCY_CD_C(m_med.getstrCURRNCY_CD());
				setDLV_LOC_CD_C(m_med.getstrDLV_LOC_CD());
				setDLV_LOC_CD_EIAJ_C(m_med.getstrDLV_LOC_CD_EIAJ());
				setDLV_LOC_NAME_KANJI_C(m_med.getstrDLV_LOC_NAME_KANJI());
				setODR_UNIT_PRICE_C(m_med.getstrODR_UNIT_PRICE());
				setSPCL_PRICE_TYP_C(m_med.getstrSPCL_PRICE_TYP());
				setDESINATED_DLV_DATE_C(m_med.getstrDESINATED_DLV_DATE());
				setSTD_DESINATED_RCV_DATE_C(m_med.getstrSTD_DESINATED_RCV_DATE());
				setODR_QTY_C(m_med.getstrODR_QTY());
				setREMAIN_UNCONFIRM_ODR_QTY_C(m_med.getstrREMAIN_UNCONFIRM_ODR_QTY());
				setCANCELED_UNCONFIRM_ODR_QTY_C(m_med.getstrCANCELED_UNCONFIRM_ODR_QTY());
				setUNIT_CD_C(m_med.getstrUNIT_CD());
				setUNCONFIRM_ODR_BALANCE_C(m_med.getstrUNCONFIRM_ODR_BALANCE());
				setODR_AMOUNT_C(m_med.getstrODR_AMOUNT());
				setODR_AMOUNT_EXCH_RATES_C(m_med.getstrODR_AMOUNT_EXCH_RATES());
				setCUS_DLV_CD_C(m_med.getstrCUS_DLV_CD());
				setCUS_DLV_KEY_CD_C(m_med.getstrCUS_DLV_KEY_CD());
				setPART_NAME_C(m_med.getstrPART_NAME());
				setTRANSPORT_CD_C(m_med.getstrTRANSPORT_CD());
				setTAX_APPLY_TYP_C(m_med.getstrTAX_APPLY_TYP());
				setTAX_CD_C(m_med.getstrTAX_CD());
				setTAX_CALC_TYP_C(m_med.getstrTAX_CALC_TYP());
				setREMARKS_C(m_med.getstrREMARKS());
				setODR_ACPT_DATE_C(m_med.getstrODR_ACPT_DATE());
				setPARTIAL_SHIP_INST_FLG_C(m_med.getstrPARTIAL_SHIP_INST_FLG());
				setDEPO_TYP_C(m_med.getstrDEPO_TYP());
				setEXCH_TYP_C(m_med.getstrEXCH_TYP());
				setSHIP_PLAN_REMAIN_QTY_C(m_med.getstrSHIP_PLAN_REMAIN_QTY());
				setIF_CTL_NO_C(m_med.getstrIF_CTL_NO());
				setTRANSPORT_TYP_C(m_med.getstrTRANSPORT_TYP());
				setPKG_UNIT_C(m_med.getstrPKG_UNIT());
				setSLIP_PRICE_PRINT_TYP_C(m_med.getstrSLIP_PRICE_PRINT_TYP());
				setINSPC_TYP_C(m_med.getstrINSPC_TYP());
				setCLIENT_REMARK_C(m_med.getstrCLIENT_REMARK());
				setCLIENT_REMARK_KANJI_C(m_med.getstrCLIENT_REMARK_KANJI());
				setCLIENT_BARCODE_INF_C(m_med.getstrCLIENT_BARCODE_INF());
				setODR_SEQ_C(m_med.getstrODR_SEQ());
				setUNIT_CD_ORG_C(m_med.getstrUNIT_CD_ORG());
				setPUCH_ODR_QTY_TOTAL_C(m_med.getstrPUCH_ODR_QTY_TOTAL());
				setBUYER_NAME_C(m_med.getstrBUYER_NAME());
				setBUYER_ORG_CD_C(m_med.getstrBUYER_ORG_CD());
				setCOCK_TYP_C(m_med.getstrCOCK_TYP());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("tbl_T_ODR", "create", "レコード新規追加パラメータ設定処理失敗");
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
			BatchAppException be=new BatchAppException("tbl_T_ODR", "prepareALL(FoundationException)", "SQL文のprepareで失敗しました");
			be.addMessage(e.getErrmsg());
			throw be;
		} catch(SQLException e) {
			BatchAppException be=new BatchAppException("tbl_T_ODR", "prepareALL(SQLException)", "SQL文のprepareで失敗しました");
			throw be;
		}

		return;
	}

	//////////////////////////////

	/**
	 * tbl_T_ODRクラスの標準コンストラクタ
	 *
		 */
	public tbl_T_ODR(medKQ0010B001 med, BatchAppConductor cdr) throws SystemException
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
	protected static String m_selcmd = null;
	protected static String m_inscmd = "insert into "
+"  T_ODR(\"ODR_NO\", \"ODR_TYP\", \"ODR_CTL_NO\", \"CUST_ODR_NO\", \"CUST_CHRG_ORG_CD\", \"CUST_CHRG_PSN_CD\", \"ODR_ACPT_ORG_CD\", \"ODR_ACPT_PSN_CD\", \"CURRNCY_CD\", \"DLV_LOC_CD\", \"DLV_LOC_CD_EIAJ\", \"DLV_LOC_NAME_KANJI\", \"ODR_UNIT_PRICE\", \"SPCL_PRICE_TYP\", \"DESINATED_DLV_DATE\", \"STD_DESINATED_RCV_DATE\", \"ODR_QTY\", \"REMAIN_UNCONFIRM_ODR_QTY\", \"CANCELED_UNCONFIRM_ODR_QTY\", \"UNIT_CD\", \"UNCONFIRM_ODR_BALANCE\", \"ODR_AMOUNT\", \"ODR_AMOUNT_EXCH_RATES\", \"ODR_CMPLT_FLG\", \"CUS_DLV_CD\", \"CUS_DLV_KEY_CD\", \"PART_NAME\", \"TRANSPORT_CD\", \"TAX_APPLY_TYP\", \"TAX_CD\", \"TAX_CALC_TYP\", \"REMARKS\", \"ODR_ACPT_DATE\", \"SHIP_PLAN_CMPLT_FLG\", \"UNCONFIRMED_ODR_EFF_OVR_FLG\", \"PARTIAL_SHIP_INST_FLG\", \"ENTRY_TYP\", \"DEL_FLG\", \"DEPO_TYP\", \"EXCH_TYP\", \"SHIP_PLAN_REMAIN_QTY\", \"IF_CTL_NO\", \"TRANSPORT_TYP\", \"PKG_UNIT\", \"SLIP_PRICE_PRINT_TYP\", \"INSPC_TYP\", \"CLIENT_REMARK\", \"CLIENT_REMARK_KANJI\", \"CLIENT_BARCODE_INF\", \"ODR_SEQ\", \"UNIT_CD_ORG\", \"PUCH_ODR_QTY_TOTAL\", \"BUYER_NAME\", \"BUYER_ORG_CD\", \"COCK_TYP\") "
+"values "
+"  (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, '0', ?, ?, ?, ?, ?, ?, ?, ?, ?, '0', '0', ?, '1', '0', ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	protected static String m_updcmd = null;
	protected static String m_delcmd = null;
	protected String m_spcmd=null;

	// トランザクション利用の可否を設定します
	boolean m_useTransaction=true;

	//////////////////////////////

}
