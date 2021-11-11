/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KV0020/src/com/nec/jp/orteus/metamorBase/KV0020/KV0020B005/T_INSPC_ACPT_INFO_IF.java,v $
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

package com.nec.jp.orteus.metamorBase.KV0020.KV0020B005;

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
 * CLASS     : T_INSPC_ACPT_INFO_IF クラス
 * ファイル・クラス説明
 * @author $Author: geng-jia $
 * @version $Revision: 1.9 $ $Date: 2015/12/03 08:55:57 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class T_INSPC_ACPT_INFO_IF extends AbstractBatchAppEntity
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

		public void setINSPC_ACPT_INFO_IF_CTRL_NO_C(String value) throws FoundationException { getAdapt_C().setString(7, value); }
		public void setDATA_PROC_CD_C(String value) throws FoundationException { getAdapt_C().setString(8, value); }
		public void setINFO_TYP_CD_C(String value) throws FoundationException { getAdapt_C().setString(9, value); }
		public void setDATA_CREATED_DATE_C(String value) throws FoundationException { getAdapt_C().setString(10, value); }
		public void setCLIENT_CD_C(String value) throws FoundationException { getAdapt_C().setString(11, value); }
		public void setTRUSTEE_CD_C(String value) throws FoundationException { getAdapt_C().setString(12, value); }
		public void setBUYER_ORG_CD_C(String value) throws FoundationException { getAdapt_C().setString(13, value); }
		public void setCUST_ODR_CD_C(String value) throws FoundationException { getAdapt_C().setString(14, value); }
		public void setPRDCT_ODR_CD_C(String value) throws FoundationException { getAdapt_C().setString(15, value); }
		public void setMODIFICATION_CODE_C(String value) throws FoundationException { getAdapt_C().setString(16, value); }
		public void setCOCK_TYP_C(String value) throws FoundationException { getAdapt_C().setString(17, value); }
		public void setUNIT_CD_C(String value) throws FoundationException { getAdapt_C().setString(18, value); }
		public void setUNIT_PRICE_EXCH_RATES_C(String value) throws FoundationException { getAdapt_C().setString(19, value); }
		public void setUNIT_PRICE_TYP_C(String value) throws FoundationException { getAdapt_C().setString(20, value); }
		public void setODR_QTY_C(String value) throws FoundationException { getAdapt_C().setString(21, value); }
		public void setBUYER_CD_C(String value) throws FoundationException { getAdapt_C().setString(22, value); }
		public void setDROWING_EDITION_C(String value) throws FoundationException { getAdapt_C().setString(23, value); }
		public void setITEM_NAME_C(String value) throws FoundationException { getAdapt_C().setString(24, value); }
		public void setOWN_ITEM_CD_C(String value) throws FoundationException { getAdapt_C().setString(25, value); }
		public void setCUST_ITEM_CD_C(String value) throws FoundationException { getAdapt_C().setString(26, value); }
		public void setDLV_LOC_CD_C(String value) throws FoundationException { getAdapt_C().setString(27, value); }
		public void setDLV_CD_C(String value) throws FoundationException { getAdapt_C().setString(28, value); }
		public void setDLV_QTY_C(String value) throws FoundationException { getAdapt_C().setString(29, value); }
		public void setSHIP_DATE_C(String value) throws FoundationException { getAdapt_C().setString(30, value); }
		public void setDLV_DATE_C(String value) throws FoundationException { getAdapt_C().setString(31, value); }
		public void setPART_DLV_COUNT_C(String value) throws FoundationException { getAdapt_C().setString(32, value); }
		public void setSHORT_QTY_C(String value) throws FoundationException { getAdapt_C().setString(33, value); }
		public void setREJECT_QTY_C(String value) throws FoundationException { getAdapt_C().setString(34, value); }
		public void setINSPC_ACPT_UNIT_PRICE_EXCH_RAT_C(String value) throws FoundationException { getAdapt_C().setString(35, value); }
		public void setINSPC_ACPT_AMOUNT_EXCH_RATES_C(String value) throws FoundationException { getAdapt_C().setString(36, value); }
		public void setINSPC_ACPT_QTY_C(String value) throws FoundationException { getAdapt_C().setString(37, value); }
		public void setINSPC_ACPT_DATE_C(String value) throws FoundationException { getAdapt_C().setString(38, value); }
		public void setINSPC_ACPT_TYP_C(String value) throws FoundationException { getAdapt_C().setString(39, value); }
		public void setSLIP_CD_C(String value) throws FoundationException { getAdapt_C().setString(40, value); }
		public void setSHIP_PACKING_CD_C(String value) throws FoundationException { getAdapt_C().setString(41, value); }
		public void setREMARKS_C(String value) throws FoundationException { getAdapt_C().setString(42, value); }
		public void setTAX_TYP_C(String value) throws FoundationException { getAdapt_C().setString(43, value); }
		public void setTRADE_TYP_C(String value) throws FoundationException { getAdapt_C().setString(44, value); }
		public void setTAXATION_TYP_C(String value) throws FoundationException { getAdapt_C().setString(45, value); }
		public void setTAX_AMOUNT_EXCH_RATES_C(String value) throws FoundationException { getAdapt_C().setString(46, value); }
		public void setTOTAL_AMOUNT_EXCH_RATES_C(String value) throws FoundationException { getAdapt_C().setString(47, value); }
		public void setINSPC_ACPT_MONTH_C(String value) throws FoundationException { getAdapt_C().setString(48, value); }
		public void setDLV_KEY_CD_C(String value) throws FoundationException { getAdapt_C().setString(49, value); }
		public void setDLV_LOC_NAME_C(String value) throws FoundationException { getAdapt_C().setString(50, value); }
		public void setOWN_BARCODE_INF_C(String value) throws FoundationException { getAdapt_C().setString(51, value); }
		public void setOWN_REMARKS_C(String value) throws FoundationException { getAdapt_C().setString(52, value); }
		public void setCONTRACT_COND_TYP_C(String value) throws FoundationException { getAdapt_C().setString(53, value); }
		public void setQTY_CONTRACT_TYP_C(String value) throws FoundationException { getAdapt_C().setString(54, value); }
		public void setBUYER_ORG_NAME_C(String value) throws FoundationException { getAdapt_C().setString(55, value); }
		public void setBUYER_NAME_KANJI_C(String value) throws FoundationException { getAdapt_C().setString(56, value); }
		public void setITEM_NAME_KANJI_C(String value) throws FoundationException { getAdapt_C().setString(57, value); }
		public void setREMARKS_KANJI_C(String value) throws FoundationException { getAdapt_C().setString(58, value); }
		public void setDLV_LOC_NAME_KANJI_C(String value) throws FoundationException { getAdapt_C().setString(59, value); }
		public void setOWN_REMARKS_KANJI_C(String value) throws FoundationException { getAdapt_C().setString(60, value); }
		public void setBUYER_ORG_CD_KANJI_C(String value) throws FoundationException { getAdapt_C().setString(61, value); }
		public void setCUR_CD_C(String value) throws FoundationException { getAdapt_C().setString(62, value); }
		public void setUNIT_PRICE_C(String value) throws FoundationException { getAdapt_C().setString(63, value); }
		public void setINSPC_ACPT_UNIT_PRICE_C(String value) throws FoundationException { getAdapt_C().setString(64, value); }
		public void setINSPC_ACPT_AMOUNT_C(String value) throws FoundationException { getAdapt_C().setString(65, value); }
		public void setTAX_AMOUNT_C(String value) throws FoundationException { getAdapt_C().setString(66, value); }
		public void setTOTAL_AMOUNT_C(String value) throws FoundationException { getAdapt_C().setString(67, value); }
		public void setSTEEL_SHIP_LIST_C(String value) throws FoundationException { getAdapt_C().setString(68, value); }
		public void setSTEEL_SLIP_CD_C(String value) throws FoundationException { getAdapt_C().setString(69, value); }
		public void setSTEEL_POC_INDUSTRY_C(String value) throws FoundationException { getAdapt_C().setString(70, value); }
		public void setSTEEL_DLV_LOC_C(String value) throws FoundationException { getAdapt_C().setString(71, value); }
		public void setSTEEL_DEM_FACTRY_CD_C(String value) throws FoundationException { getAdapt_C().setString(72, value); }
		public void setSTEEL_TR_COMP_ORG_CD_C(String value) throws FoundationException { getAdapt_C().setString(73, value); }
		public void setSTEEL_TR_COMP_ORG_INQUIRY_CD_C(String value) throws FoundationException { getAdapt_C().setString(74, value); }
		public void setSTEEL_DSP_SPEC_C(String value) throws FoundationException { getAdapt_C().setString(75, value); }
		public void setSTEEL_SIZE_C(String value) throws FoundationException { getAdapt_C().setString(76, value); }
		public void setSTEEL_POC_COST_C(String value) throws FoundationException { getAdapt_C().setString(77, value); }
		public void setSYSTEM_PROC_TYP_C(String value) throws FoundationException { getAdapt_C().setString(78, value); }
		public void setDEL_FLG_C(String value) throws FoundationException { getAdapt_C().setString(79, value); }

		public int create() throws BatchAppException
		{
			try {
				getAdapt_C().setString(1, m_med.getSysdate());
				getAdapt_C().setString(2, m_med.getUsername());
				getAdapt_C().setString(3, m_med.getProgname());
				getAdapt_C().setString(4, m_med.getSysdate());
				getAdapt_C().setString(5, m_med.getUsername());
				getAdapt_C().setString(6, m_med.getProgname());
				setINSPC_ACPT_INFO_IF_CTRL_NO_C(m_med.getINSPC_ACPT_INFO_IF_CTRL_NO());
				setDATA_PROC_CD_C(m_med.getDATA_PROC_CD());
				setINFO_TYP_CD_C(m_med.getINFO_TYP_CD());
				setDATA_CREATED_DATE_C(m_med.getDATA_CREATED_DATE());
				setCLIENT_CD_C(m_med.getCLIENT_CD());
				setTRUSTEE_CD_C(m_med.getTRUSTEE_CD());
				setBUYER_ORG_CD_C(m_med.getBUYER_ORG_CD());
				setCUST_ODR_CD_C(m_med.getCUST_ODR_CD());
				setPRDCT_ODR_CD_C(m_med.getPRDCT_ODR_CD());
				setMODIFICATION_CODE_C(m_med.getMODIFICATION_CODE());
				setCOCK_TYP_C(m_med.getCOCK_TYP());
				setUNIT_CD_C(m_med.getUNIT_CD());
				setUNIT_PRICE_EXCH_RATES_C(m_med.getUNIT_PRICE_EXCH_RATES());
				setUNIT_PRICE_TYP_C(m_med.getUNIT_PRICE_TYP());
				setODR_QTY_C(m_med.getODR_QTY());
				setBUYER_CD_C(m_med.getBUYER_CD());
				setDROWING_EDITION_C(m_med.getDROWING_EDITION());
				setITEM_NAME_C(m_med.getITEM_NAME());
				setOWN_ITEM_CD_C(m_med.getOWN_ITEM_CD());
				setCUST_ITEM_CD_C(m_med.getCUST_ITEM_CD());
				setDLV_LOC_CD_C(m_med.getDLV_LOC_CD());
				setDLV_CD_C(m_med.getDLV_CD());
				setDLV_QTY_C(m_med.getDLV_QTY());
				setSHIP_DATE_C(m_med.getSHIP_DATE());
				setDLV_DATE_C(m_med.getDLV_DATE());
				setPART_DLV_COUNT_C(m_med.getPART_DLV_COUNT());
				setSHORT_QTY_C(m_med.getSHORT_QTY());
				setREJECT_QTY_C(m_med.getREJECT_QTY());
				setINSPC_ACPT_UNIT_PRICE_EXCH_RAT_C(m_med.getINSPC_ACPT_UNIT_PRICE_EXCH_RAT());
				setINSPC_ACPT_AMOUNT_EXCH_RATES_C(m_med.getINSPC_ACPT_AMOUNT_EXCH_RATES());
				setINSPC_ACPT_QTY_C(m_med.getINSPC_ACPT_QTY());
				setINSPC_ACPT_DATE_C(m_med.getINSPC_ACPT_DATE());
				setINSPC_ACPT_TYP_C(m_med.getINSPC_ACPT_TYP());
				setSLIP_CD_C(m_med.getINSPC_ACPT_SLIP_CD());
				setSHIP_PACKING_CD_C(m_med.getSHIP_PACKING_CD());
				setREMARKS_C(m_med.getREMARKS());
				setTAX_TYP_C(m_med.getTAX_TYP());
				setTRADE_TYP_C(m_med.getTRADE_TYP());
				setTAXATION_TYP_C(m_med.getTAXATION_TYP());
				setTAX_AMOUNT_EXCH_RATES_C(m_med.getTAX_AMOUNT_EXCH_RATES());
				setTOTAL_AMOUNT_EXCH_RATES_C(m_med.getTOTAL_AMOUNT_EXCH_RATES());
				setINSPC_ACPT_MONTH_C(m_med.getINSPC_ACPT_MONTH());
				setDLV_KEY_CD_C(m_med.getDLV_KEY_CD());
				setDLV_LOC_NAME_C(m_med.getDLV_LOC_NAME());
				setOWN_BARCODE_INF_C(m_med.getOWN_BARCODE_INF());
				setOWN_REMARKS_C(m_med.getOWN_REMARKS());
				setCONTRACT_COND_TYP_C(m_med.getCONTRACT_COND_TYP());
				setQTY_CONTRACT_TYP_C(m_med.getQTY_CONTRACT_TYP());
				setBUYER_ORG_NAME_C(m_med.getBUYER_ORG_NAME());
				setBUYER_NAME_KANJI_C(m_med.getBUYER_NAME_KANJI());
				setITEM_NAME_KANJI_C(m_med.getITEM_NAME_KANJI());
				setREMARKS_KANJI_C(m_med.getREMARKS_KANJI());
				setDLV_LOC_NAME_KANJI_C(m_med.getDLV_LOC_NAME_KANJI());
				setOWN_REMARKS_KANJI_C(m_med.getOWN_REMARKS_KANJI());
				setBUYER_ORG_CD_KANJI_C(m_med.getBUYER_ORG_CD_KANJI());
				setCUR_CD_C(m_med.getCUR_CD());
				setUNIT_PRICE_C(m_med.getUNIT_PRICE());
				setINSPC_ACPT_UNIT_PRICE_C(m_med.getINSPC_ACPT_UNIT_PRICE());
				setINSPC_ACPT_AMOUNT_C(m_med.getINSPC_ACPT_AMOUNT());
				setTAX_AMOUNT_C(m_med.getTAX_AMOUNT());
				setTOTAL_AMOUNT_C(m_med.getTOTAL_AMOUNT());
				setSTEEL_SHIP_LIST_C(m_med.getSTEEL_SHIP_LIST());
				setSTEEL_SLIP_CD_C(m_med.getSTEEL_SLIP_CD());
				setSTEEL_POC_INDUSTRY_C(m_med.getSTEEL_POC_INDUSTRY());
				setSTEEL_DLV_LOC_C(m_med.getSTEEL_DLV_LOC());
				setSTEEL_DEM_FACTRY_CD_C(m_med.getSTEEL_DEM_FACTRY_CD());
				setSTEEL_TR_COMP_ORG_CD_C(m_med.getSTEEL_TR_COMP_ORG_CD());
				setSTEEL_TR_COMP_ORG_INQUIRY_CD_C(m_med.getSTEEL_TR_COMP_ORG_INQUIRY_CD());
				setSTEEL_DSP_SPEC_C(m_med.getSTEEL_DSP_SPEC());
				setSTEEL_SIZE_C(m_med.getSTEEL_SIZE());
				setSTEEL_POC_COST_C(m_med.getSTEEL_POC_COST());
				setSYSTEM_PROC_TYP_C(m_med.getSYSTEM_PROC_TYP());
				setDEL_FLG_C(m_med.getDEL_FLG());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("T_INSPC_ACPT_INFO_IF", "create", "レコード新規追加パラメータ設定処理失敗");
				be.addMessage(e.getErrmsg());
				throw be;
			}

			executeCreate();

			return SUCCESS;
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
				BatchAppException be=new BatchAppException("T_INSPC_ACPT_INFO_IF", "read", "レコード検索条件設定処理失敗");
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

		public String getINSPC_ACPT_INFO_IF_CTRL_NO_R() throws FoundationException { return m_doRs.getString(1); }

		public boolean next() throws BatchAppException
		{
			try {
				if(m_doRs.next()==false) return false;

				m_med.setINSPC_ACPT_INFO_IF_CTRL_NO(getINSPC_ACPT_INFO_IF_CTRL_NO_R());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("T_INSPC_ACPT_INFO_IF", "next", "レコード移動失敗");
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
				BatchAppException be=new BatchAppException("T_INSPC_ACPT_INFO_IF", "hasRecord", "レコード存在チェック失敗");
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
			prepareUpdate(sUPDATE);
			prepareDelete(sDELETE);
			prepareSp(sSP);
		} catch(FoundationException e) {
			BatchAppException be=new BatchAppException("T_INSPC_ACPT_INFO_IF", "prepareALL(FoundationException)", "SQL文のprepareで失敗しました");
			be.addMessage(e.getErrmsg());
			throw be;
		} catch(SQLException e) {
			BatchAppException be=new BatchAppException("T_INSPC_ACPT_INFO_IF", "prepareALL(SQLException)", "SQL文のprepareで失敗しました");
			throw be;
		}

		return;
	}

	//////////////////////////////

	/**
	 * T_INSPC_ACPT_INFO_IFクラスの標準コンストラクタ
	 *
		 */
	public T_INSPC_ACPT_INFO_IF(medKV0020B005 med, BatchAppConductor cdr) throws SystemException
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
	public medKV0020B005 m_med=null;

	protected BatchAppConductor m_conductor;

	// interEntityクラスインスタンス
	public interEntity m_entity=new interEntity();

	// 各状態で実行するsql文の定義
	protected static String m_selcmd = "SELECT "
+"  TO_CHAR(SEQ_ODR_INFO_IF_CTRL_NO.NEXTVAL) as INSPC_ACPT_INFO_IF_CTRL_NO "
+"FROM "
+"  DUAL "
+"";
	protected static String m_inscmd = "insert into  T_INSPC_ACPT_INFO_IF "
+"  (\"INSPC_ACPT_INFO_IF_CTRL_NO\" "
+"  ,\"DATA_PROC_CD\" "
+"  ,\"INFO_TYP_CD\" "
+"  ,\"DATA_CREATED_DATE\" "
+"  ,\"CLIENT_CD\" "
+"  ,\"TRUSTEE_CD\" "
+"  ,\"BUYER_ORG_CD\" "
+"  ,\"CUST_ODR_CD\" "
+"  ,\"PRDCT_ODR_CD\" "
+"  ,\"MODIFICATION_CODE\" "
+"  ,\"COCK_TYP\" "
+"  ,\"UNIT_CD\" "
+"  ,\"UNIT_PRICE_EXCH_RATES\" "
+"  ,\"UNIT_PRICE_TYP\" "
+"  ,\"ODR_QTY\" "
+"  ,\"BUYER_CD\" "
+"  ,\"DROWING_EDITION\" "
+"  ,\"ITEM_NAME\" "
+"  ,\"OWN_ITEM_CD\" "
+"  ,\"CUST_ITEM_CD\" "
+"  ,\"DLV_LOC_CD\" "
+"  ,\"DLV_CD\" "
+"  ,\"DLV_QTY\" "
+"  ,\"SHIP_DATE\" "
+"  ,\"DLV_DATE\" "
+"  ,\"PART_DLV_COUNT\" "
+"  ,\"SHORT_QTY\" "
+"  ,\"REJECT_QTY\" "
+"  ,\"INSPC_ACPT_UNIT_PRICE_EXCH_RAT\" "
+"  ,\"INSPC_ACPT_AMOUNT_EXCH_RATES\" "
+"  ,\"INSPC_ACPT_QTY\" "
+"  ,\"INSPC_ACPT_DATE\" "
+"  ,\"INSPC_ACPT_TYP\" "
+"  ,\"SLIP_CD\" "
+"  ,\"SHIP_PACKING_CD\" "
+"  ,\"REMARKS\" "
+"  ,\"TAX_TYP\" "
+"  ,\"TRADE_TYP\" "
+"  ,\"TAXATION_TYP\" "
+"  ,\"TAX_AMOUNT_EXCH_RATES\" "
+"  ,\"TOTAL_AMOUNT_EXCH_RATES\" "
+"  ,\"INSPC_ACPT_MONTH\" "
+"  ,\"DLV_KEY_CD\" "
+"  ,\"DLV_LOC_NAME\" "
+"  ,\"OWN_BARCODE_INF\" "
+"  ,\"OWN_REMARKS\" "
+"  ,\"CONTRACT_COND_TYP\" "
+"  ,\"QTY_CONTRACT_TYP\" "
+"  ,\"BUYER_ORG_NAME\" "
+"  ,\"BUYER_NAME_KANJI\" "
+"  ,\"ITEM_NAME_KANJI\" "
+"  ,\"REMARKS_KANJI\" "
+"  ,\"DLV_LOC_NAME_KANJI\" "
+"  ,\"OWN_REMARKS_KANJI\" "
+"  ,\"BUYER_ORG_CD_KANJI\" "
+"  ,\"CUR_CD\" "
+"  ,\"UNIT_PRICE\" "
+"  ,\"INSPC_ACPT_UNIT_PRICE\" "
+"  ,\"INSPC_ACPT_AMOUNT\" "
+"  ,\"TAX_AMOUNT\" "
+"  ,\"TOTAL_AMOUNT\" "
+"  ,\"STEEL_SHIP_LIST\" "
+"  ,\"STEEL_SLIP_CD\" "
+"  ,\"STEEL_POC_INDUSTRY\" "
+"  ,\"STEEL_DLV_LOC\" "
+"  ,\"STEEL_DEM_FACTRY_CD\" "
+"  ,\"STEEL_TR_COMP_ORG_CD\" "
+"  ,\"STEEL_TR_COMP_ORG_INQUIRY_CD\" "
+"  ,\"STEEL_DSP_SPEC\" "
+"  ,\"STEEL_SIZE\" "
+"  ,\"STEEL_POC_COST\" "
+"  ,\"SYSTEM_PROC_TYP\" "
+"  ,\"DEL_FLG\" "
+"  ) "
+"values "
+"  (TO_NUMBER(?) "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ,? "
+"  ) "
+"";
	protected static String m_updcmd = null;
	protected static String m_delcmd = null;
	protected String m_spcmd=null;

	// トランザクション利用の可否を設定します
	boolean m_useTransaction=true;

	//////////////////////////////

}
