/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KV0020/src/com/nec/jp/orteus/metamorBase/KV0020/KV0020B002/T_ODR_INFO_EDI_IF.java,v $
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

package com.nec.jp.orteus.metamorBase.KV0020.KV0020B002;

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
 * CLASS     : T_ODR_INFO_EDI_IF クラス
 * ファイル・クラス説明
 * @author $Author: geng-jia $
 * @version $Revision: 1.8 $ $Date: 2015/12/03 08:55:51 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class T_ODR_INFO_EDI_IF extends AbstractBatchAppEntity
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
				BatchAppException be=new BatchAppException("T_ODR_INFO_EDI_IF", "read", "レコード検索条件設定処理失敗");
				be.addMessage(e.getErrmsg());
				throw be;
			}

			m_doRs = getRecordset(cache);

			return SUCCESS;
		}

		public void setSYSTEM_PROC_TYP_U(String value) throws FoundationException { getAdapt_U().setString(4, value); }
		public void setODR_INFO_IF_CTRL_NO_U(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_U().setString(5, null);
			} else {
				getAdapt_U().setDouble(5, value);
			}
		}

		public int update() throws BatchAppException
		{
			try {
				getAdapt_U().setString(1, m_med.getSysdate());
				getAdapt_U().setString(2, m_med.getUsername());
				getAdapt_U().setString(3, m_med.getProgname());
				setSYSTEM_PROC_TYP_U(m_med.getEdiSYSTEM_PROC_TYP());
				setODR_INFO_IF_CTRL_NO_U(m_med.getEdiODR_INFO_IF_CTRL_NO());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("T_ODR_INFO_EDI_IF", "update", "レコード更新条件設定処理失敗");
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

		public boolean wasNull_ODR_INFO_IF_CTRL_NO_R() throws FoundationException { return m_doRs.wasNull(1); }
		public Number getODR_INFO_IF_CTRL_NO_R() throws FoundationException { return m_doRs.getDouble(1); }
		public boolean wasNull_DATA_PROC_CD_R() throws FoundationException { return m_doRs.wasNull(2); }
		public Number getDATA_PROC_CD_R() throws FoundationException { return m_doRs.getDouble(2); }
		public String getINFO_TYP_CD_R() throws FoundationException { return m_doRs.getString(3); }
		public String getDATA_CREATED_DATE_R() throws FoundationException { return m_doRs.getString(4); }
		public String getCLIENT_CD_R() throws FoundationException { return m_doRs.getString(5); }
		public String getTRUSTEE_CD_R() throws FoundationException { return m_doRs.getString(6); }
		public String getBUYER_ORG_CD_R() throws FoundationException { return m_doRs.getString(7); }
		public String getPUCH_ODR_CD_R() throws FoundationException { return m_doRs.getString(8); }
		public String getPRDCT_ODR_CD_R() throws FoundationException { return m_doRs.getString(9); }
		public String getMODIFICATION_CODE_R() throws FoundationException { return m_doRs.getString(10); }
		public String getCOCK_TYP_R() throws FoundationException { return m_doRs.getString(11); }
		public String getPUCH_ODR_DATE_R() throws FoundationException { return m_doRs.getString(12); }
		public String getUNIT_R() throws FoundationException { return m_doRs.getString(13); }
		public boolean wasNull_UNIT_PRICE_R() throws FoundationException { return m_doRs.wasNull(14); }
		public Number getUNIT_PRICE_R() throws FoundationException { return m_doRs.getDouble(14); }
		public String getPRICE_TYP_R() throws FoundationException { return m_doRs.getString(15); }
		public boolean wasNull_PUCH_ODR_QTY_R() throws FoundationException { return m_doRs.wasNull(16); }
		public Number getPUCH_ODR_QTY_R() throws FoundationException { return m_doRs.getDouble(16); }
		public boolean wasNull_PUCH_ODR_AMOUNT_R() throws FoundationException { return m_doRs.wasNull(17); }
		public Number getPUCH_ODR_AMOUNT_R() throws FoundationException { return m_doRs.getDouble(17); }
		public String getCONS_TYP_R() throws FoundationException { return m_doRs.getString(18); }
		public String getBUYER_NAME_R() throws FoundationException { return m_doRs.getString(19); }
		public String getMATR_SPEC_SIZE_R() throws FoundationException { return m_doRs.getString(20); }
		public String getSPECTP_R() throws FoundationException { return m_doRs.getString(21); }
		public String getDROWING_EDITION_R() throws FoundationException { return m_doRs.getString(22); }
		public String getPART_NAME_R() throws FoundationException { return m_doRs.getString(23); }
		public String getOWN_ITEM_CD_R() throws FoundationException { return m_doRs.getString(24); }
		public String getCUST_ITEM_CD_R() throws FoundationException { return m_doRs.getString(25); }
		public boolean wasNull_DROW_SPEC_QTY_R() throws FoundationException { return m_doRs.wasNull(26); }
		public Number getDROW_SPEC_QTY_R() throws FoundationException { return m_doRs.getDouble(26); }
		public String getPKG_UNIT_R() throws FoundationException { return m_doRs.getString(27); }
		public String getDIRECT_DLV_TYP_R() throws FoundationException { return m_doRs.getString(28); }
		public String getDLV_LOC_CD_R() throws FoundationException { return m_doRs.getString(29); }
		public String getINSPC_TYP_R() throws FoundationException { return m_doRs.getString(30); }
		public String getDLV_INST_TYP_R() throws FoundationException { return m_doRs.getString(31); }
		public String getSCDL_DLV_DATE_1_R() throws FoundationException { return m_doRs.getString(32); }
		public boolean wasNull_SCDL_DLV_QTY_1_R() throws FoundationException { return m_doRs.wasNull(33); }
		public Number getSCDL_DLV_QTY_1_R() throws FoundationException { return m_doRs.getDouble(33); }
		public String getDLV_CD_1_R() throws FoundationException { return m_doRs.getString(34); }
		public String getSCDL_DLV_DATE_2_R() throws FoundationException { return m_doRs.getString(35); }
		public boolean wasNull_SCDL_DLV_QTY_2_R() throws FoundationException { return m_doRs.wasNull(36); }
		public Number getSCDL_DLV_QTY_2_R() throws FoundationException { return m_doRs.getDouble(36); }
		public String getDLV_CD_2_R() throws FoundationException { return m_doRs.getString(37); }
		public String getSCDL_DLV_DATE_3_R() throws FoundationException { return m_doRs.getString(38); }
		public boolean wasNull_SCDL_DLV_QTY_3_R() throws FoundationException { return m_doRs.wasNull(39); }
		public Number getSCDL_DLV_QTY_3_R() throws FoundationException { return m_doRs.getDouble(39); }
		public String getDLV_CD_3_R() throws FoundationException { return m_doRs.getString(40); }
		public String getSCDL_DLV_DATE_4_R() throws FoundationException { return m_doRs.getString(41); }
		public boolean wasNull_SCDL_DLV_QTY_4_R() throws FoundationException { return m_doRs.wasNull(42); }
		public Number getSCDL_DLV_QTY_4_R() throws FoundationException { return m_doRs.getDouble(42); }
		public String getDLV_CD_4_R() throws FoundationException { return m_doRs.getString(43); }
		public String getSCDL_DLV_DATE_5_R() throws FoundationException { return m_doRs.getString(44); }
		public boolean wasNull_SCDL_DLV_QTY_5_R() throws FoundationException { return m_doRs.wasNull(45); }
		public Number getSCDL_DLV_QTY_5_R() throws FoundationException { return m_doRs.getDouble(45); }
		public String getDLV_CD_5_R() throws FoundationException { return m_doRs.getString(46); }
		public String getSCDL_DLV_DATE_6_R() throws FoundationException { return m_doRs.getString(47); }
		public boolean wasNull_SCDL_DLV_QTY_6_R() throws FoundationException { return m_doRs.wasNull(48); }
		public Number getSCDL_DLV_QTY_6_R() throws FoundationException { return m_doRs.getDouble(48); }
		public String getDLV_CD_6_R() throws FoundationException { return m_doRs.getString(49); }
		public String getSCDL_DLV_DATE_7_R() throws FoundationException { return m_doRs.getString(50); }
		public boolean wasNull_SCDL_DLV_QTY_7_R() throws FoundationException { return m_doRs.wasNull(51); }
		public Number getSCDL_DLV_QTY_7_R() throws FoundationException { return m_doRs.getDouble(51); }
		public String getDLV_CD_7_R() throws FoundationException { return m_doRs.getString(52); }
		public String getSCDL_DLV_DATE_8_R() throws FoundationException { return m_doRs.getString(53); }
		public boolean wasNull_SCDL_DLV_QTY_8_R() throws FoundationException { return m_doRs.wasNull(54); }
		public Number getSCDL_DLV_QTY_8_R() throws FoundationException { return m_doRs.getDouble(54); }
		public String getDLV_CD_8_R() throws FoundationException { return m_doRs.getString(55); }
		public String getSCDL_DLV_DATE_9_R() throws FoundationException { return m_doRs.getString(56); }
		public boolean wasNull_SCDL_DLV_QTY_9_R() throws FoundationException { return m_doRs.wasNull(57); }
		public Number getSCDL_DLV_QTY_9_R() throws FoundationException { return m_doRs.getDouble(57); }
		public String getDLV_CD_9_R() throws FoundationException { return m_doRs.getString(58); }
		public String getSCDL_DLV_DATE_10_R() throws FoundationException { return m_doRs.getString(59); }
		public boolean wasNull_SCDL_DLV_QTY_10_R() throws FoundationException { return m_doRs.wasNull(60); }
		public Number getSCDL_DLV_QTY_10_R() throws FoundationException { return m_doRs.getDouble(60); }
		public String getDLV_CD_10_R() throws FoundationException { return m_doRs.getString(61); }
		public String getSCDL_DLV_DATE_11_R() throws FoundationException { return m_doRs.getString(62); }
		public boolean wasNull_SCDL_DLV_QTY_11_R() throws FoundationException { return m_doRs.wasNull(63); }
		public Number getSCDL_DLV_QTY_11_R() throws FoundationException { return m_doRs.getDouble(63); }
		public String getDLV_CD_11_R() throws FoundationException { return m_doRs.getString(64); }
		public String getSCDL_DLV_DATE_12_R() throws FoundationException { return m_doRs.getString(65); }
		public boolean wasNull_SCDL_DLV_QTY_12_R() throws FoundationException { return m_doRs.wasNull(66); }
		public Number getSCDL_DLV_QTY_12_R() throws FoundationException { return m_doRs.getDouble(66); }
		public String getDLV_CD_12_R() throws FoundationException { return m_doRs.getString(67); }
		public String getSCDL_DLV_DATE_13_R() throws FoundationException { return m_doRs.getString(68); }
		public boolean wasNull_SCDL_DLV_QTY_13_R() throws FoundationException { return m_doRs.wasNull(69); }
		public Number getSCDL_DLV_QTY_13_R() throws FoundationException { return m_doRs.getDouble(69); }
		public String getDLV_CD_13_R() throws FoundationException { return m_doRs.getString(70); }
		public String getSCDL_DLV_DATE_14_R() throws FoundationException { return m_doRs.getString(71); }
		public boolean wasNull_SCDL_DLV_QTY_14_R() throws FoundationException { return m_doRs.wasNull(72); }
		public Number getSCDL_DLV_QTY_14_R() throws FoundationException { return m_doRs.getDouble(72); }
		public String getDLV_CD_14_R() throws FoundationException { return m_doRs.getString(73); }
		public String getSCDL_DLV_DATE_15_R() throws FoundationException { return m_doRs.getString(74); }
		public boolean wasNull_SCDL_DLV_QTY_15_R() throws FoundationException { return m_doRs.wasNull(75); }
		public Number getSCDL_DLV_QTY_15_R() throws FoundationException { return m_doRs.getDouble(75); }
		public String getDLV_CD_15_R() throws FoundationException { return m_doRs.getString(76); }
		public String getSCDL_DLV_DATE_16_R() throws FoundationException { return m_doRs.getString(77); }
		public boolean wasNull_SCDL_DLV_QTY_16_R() throws FoundationException { return m_doRs.wasNull(78); }
		public Number getSCDL_DLV_QTY_16_R() throws FoundationException { return m_doRs.getDouble(78); }
		public String getDLV_CD_16_R() throws FoundationException { return m_doRs.getString(79); }
		public String getSCDL_DLV_DATE_17_R() throws FoundationException { return m_doRs.getString(80); }
		public boolean wasNull_SCDL_DLV_QTY_17_R() throws FoundationException { return m_doRs.wasNull(81); }
		public Number getSCDL_DLV_QTY_17_R() throws FoundationException { return m_doRs.getDouble(81); }
		public String getDLV_CD_17_R() throws FoundationException { return m_doRs.getString(82); }
		public String getSCDL_DLV_DATE_18_R() throws FoundationException { return m_doRs.getString(83); }
		public boolean wasNull_SCDL_DLV_QTY_18_R() throws FoundationException { return m_doRs.wasNull(84); }
		public Number getSCDL_DLV_QTY_18_R() throws FoundationException { return m_doRs.getDouble(84); }
		public String getDLV_CD_18_R() throws FoundationException { return m_doRs.getString(85); }
		public String getSCDL_DLV_DATE_19_R() throws FoundationException { return m_doRs.getString(86); }
		public boolean wasNull_SCDL_DLV_QTY_19_R() throws FoundationException { return m_doRs.wasNull(87); }
		public Number getSCDL_DLV_QTY_19_R() throws FoundationException { return m_doRs.getDouble(87); }
		public String getDLV_CD_19_R() throws FoundationException { return m_doRs.getString(88); }
		public String getSCDL_DLV_DATE_20_R() throws FoundationException { return m_doRs.getString(89); }
		public boolean wasNull_SCDL_DLV_QTY_20_R() throws FoundationException { return m_doRs.wasNull(90); }
		public Number getSCDL_DLV_QTY_20_R() throws FoundationException { return m_doRs.getDouble(90); }
		public String getDLV_CD_20_R() throws FoundationException { return m_doRs.getString(91); }
		public String getSCDL_DLV_DATE_21_R() throws FoundationException { return m_doRs.getString(92); }
		public boolean wasNull_SCDL_DLV_QTY_21_R() throws FoundationException { return m_doRs.wasNull(93); }
		public Number getSCDL_DLV_QTY_21_R() throws FoundationException { return m_doRs.getDouble(93); }
		public String getDLV_CD_21_R() throws FoundationException { return m_doRs.getString(94); }
		public String getSCDL_DLV_DATE_22_R() throws FoundationException { return m_doRs.getString(95); }
		public boolean wasNull_SCDL_DLV_QTY_22_R() throws FoundationException { return m_doRs.wasNull(96); }
		public Number getSCDL_DLV_QTY_22_R() throws FoundationException { return m_doRs.getDouble(96); }
		public String getDLV_CD_22_R() throws FoundationException { return m_doRs.getString(97); }
		public String getSCDL_DLV_DATE_23_R() throws FoundationException { return m_doRs.getString(98); }
		public boolean wasNull_SCDL_DLV_QTY_23_R() throws FoundationException { return m_doRs.wasNull(99); }
		public Number getSCDL_DLV_QTY_23_R() throws FoundationException { return m_doRs.getDouble(99); }
		public String getDLV_CD_23_R() throws FoundationException { return m_doRs.getString(100); }
		public String getSCDL_DLV_DATE_24_R() throws FoundationException { return m_doRs.getString(101); }
		public boolean wasNull_SCDL_DLV_QTY_24_R() throws FoundationException { return m_doRs.wasNull(102); }
		public Number getSCDL_DLV_QTY_24_R() throws FoundationException { return m_doRs.getDouble(102); }
		public String getDLV_CD_24_R() throws FoundationException { return m_doRs.getString(103); }
		public String getSCDL_DLV_DATE_25_R() throws FoundationException { return m_doRs.getString(104); }
		public boolean wasNull_SCDL_DLV_QTY_25_R() throws FoundationException { return m_doRs.wasNull(105); }
		public Number getSCDL_DLV_QTY_25_R() throws FoundationException { return m_doRs.getDouble(105); }
		public String getDLV_CD_25_R() throws FoundationException { return m_doRs.getString(106); }
		public String getSCDL_DLV_DATE_26_R() throws FoundationException { return m_doRs.getString(107); }
		public boolean wasNull_SCDL_DLV_QTY_26_R() throws FoundationException { return m_doRs.wasNull(108); }
		public Number getSCDL_DLV_QTY_26_R() throws FoundationException { return m_doRs.getDouble(108); }
		public String getDLV_CD_26_R() throws FoundationException { return m_doRs.getString(109); }
		public String getSCDL_DLV_DATE_27_R() throws FoundationException { return m_doRs.getString(110); }
		public boolean wasNull_SCDL_DLV_QTY_27_R() throws FoundationException { return m_doRs.wasNull(111); }
		public Number getSCDL_DLV_QTY_27_R() throws FoundationException { return m_doRs.getDouble(111); }
		public String getDLV_CD_27_R() throws FoundationException { return m_doRs.getString(112); }
		public String getSCDL_DLV_DATE_28_R() throws FoundationException { return m_doRs.getString(113); }
		public boolean wasNull_SCDL_DLV_QTY_28_R() throws FoundationException { return m_doRs.wasNull(114); }
		public Number getSCDL_DLV_QTY_28_R() throws FoundationException { return m_doRs.getDouble(114); }
		public String getDLV_CD_28_R() throws FoundationException { return m_doRs.getString(115); }
		public String getSCDL_DLV_DATE_29_R() throws FoundationException { return m_doRs.getString(116); }
		public boolean wasNull_SCDL_DLV_QTY_29_R() throws FoundationException { return m_doRs.wasNull(117); }
		public Number getSCDL_DLV_QTY_29_R() throws FoundationException { return m_doRs.getDouble(117); }
		public String getDLV_CD_29_R() throws FoundationException { return m_doRs.getString(118); }
		public String getSCDL_DLV_DATE_30_R() throws FoundationException { return m_doRs.getString(119); }
		public boolean wasNull_SCDL_DLV_QTY_30_R() throws FoundationException { return m_doRs.wasNull(120); }
		public Number getSCDL_DLV_QTY_30_R() throws FoundationException { return m_doRs.getDouble(120); }
		public String getDLV_CD_30_R() throws FoundationException { return m_doRs.getString(121); }
		public String getSCDL_DLV_DATE_31_R() throws FoundationException { return m_doRs.getString(122); }
		public boolean wasNull_SCDL_DLV_QTY_31_R() throws FoundationException { return m_doRs.wasNull(123); }
		public Number getSCDL_DLV_QTY_31_R() throws FoundationException { return m_doRs.getDouble(123); }
		public String getDLV_CD_31_R() throws FoundationException { return m_doRs.getString(124); }
		public String getFREE_TEXT_R() throws FoundationException { return m_doRs.getString(125); }
		public String getREMARKS_R() throws FoundationException { return m_doRs.getString(126); }
		public String getTAX_TYP_R() throws FoundationException { return m_doRs.getString(127); }
		public String getCUST_TAXATION_TYP_R() throws FoundationException { return m_doRs.getString(128); }
		public boolean wasNull_TAX_AMOUNT_R() throws FoundationException { return m_doRs.wasNull(129); }
		public Number getTAX_AMOUNT_R() throws FoundationException { return m_doRs.getDouble(129); }
		public boolean wasNull_CUST_TOTAL_AMOUNT_R() throws FoundationException { return m_doRs.wasNull(130); }
		public Number getCUST_TOTAL_AMOUNT_R() throws FoundationException { return m_doRs.getDouble(130); }
		public String getUNCONFIRM_ODR_CD_R() throws FoundationException { return m_doRs.getString(131); }
		public String getUNCONFIRM_ODR_DATE_R() throws FoundationException { return m_doRs.getString(132); }
		public boolean wasNull_UNCONFIRM_ODR_QTY_R() throws FoundationException { return m_doRs.wasNull(133); }
		public Number getUNCONFIRM_ODR_QTY_R() throws FoundationException { return m_doRs.getDouble(133); }
		public boolean wasNull_UNCONFIRM_ODR_AMOUNT_R() throws FoundationException { return m_doRs.wasNull(134); }
		public Number getUNCONFIRM_ODR_AMOUNT_R() throws FoundationException { return m_doRs.getDouble(134); }
		public String getESTIMATE_REQST_CD_R() throws FoundationException { return m_doRs.getString(135); }
		public String getSTL_COND_CD_R() throws FoundationException { return m_doRs.getString(136); }
		public String getEND_USER_NAME_R() throws FoundationException { return m_doRs.getString(137); }
		public String getDLV_ZIP_CD_R() throws FoundationException { return m_doRs.getString(138); }
		public String getDLV_ADDRESS_R() throws FoundationException { return m_doRs.getString(139); }
		public String getDLV_ADDRESSEE_R() throws FoundationException { return m_doRs.getString(140); }
		public String getCUST_COMM_SUBNAME_R() throws FoundationException { return m_doRs.getString(141); }
		public String getCUST_COMM_SUBCD_R() throws FoundationException { return m_doRs.getString(142); }
		public String getEND_USER_ODR_CD_R() throws FoundationException { return m_doRs.getString(143); }
		public String getCUST_DESINATED_MAKER_R() throws FoundationException { return m_doRs.getString(144); }
		public String getDLV_KEY_NO_1_R() throws FoundationException { return m_doRs.getString(145); }
		public String getDLV_KEY_NO_2_R() throws FoundationException { return m_doRs.getString(146); }
		public String getDLV_KEY_NO_3_R() throws FoundationException { return m_doRs.getString(147); }
		public String getDLV_KEY_NO_4_R() throws FoundationException { return m_doRs.getString(148); }
		public String getDLV_KEY_NO_5_R() throws FoundationException { return m_doRs.getString(149); }
		public String getDLV_KEY_NO_6_R() throws FoundationException { return m_doRs.getString(150); }
		public String getDLV_KEY_NO_7_R() throws FoundationException { return m_doRs.getString(151); }
		public String getDLV_KEY_NO_8_R() throws FoundationException { return m_doRs.getString(152); }
		public String getDLV_KEY_NO_9_R() throws FoundationException { return m_doRs.getString(153); }
		public String getDLV_KEY_NO_10_R() throws FoundationException { return m_doRs.getString(154); }
		public String getDLV_KEY_NO_11_R() throws FoundationException { return m_doRs.getString(155); }
		public String getDLV_KEY_NO_12_R() throws FoundationException { return m_doRs.getString(156); }
		public String getDLV_KEY_NO_13_R() throws FoundationException { return m_doRs.getString(157); }
		public String getDLV_KEY_NO_14_R() throws FoundationException { return m_doRs.getString(158); }
		public String getDLV_KEY_NO_15_R() throws FoundationException { return m_doRs.getString(159); }
		public String getDLV_KEY_NO_16_R() throws FoundationException { return m_doRs.getString(160); }
		public String getDLV_KEY_NO_17_R() throws FoundationException { return m_doRs.getString(161); }
		public String getDLV_KEY_NO_18_R() throws FoundationException { return m_doRs.getString(162); }
		public String getDLV_KEY_NO_19_R() throws FoundationException { return m_doRs.getString(163); }
		public String getDLV_KEY_NO_20_R() throws FoundationException { return m_doRs.getString(164); }
		public String getDLV_KEY_NO_21_R() throws FoundationException { return m_doRs.getString(165); }
		public String getDLV_KEY_NO_22_R() throws FoundationException { return m_doRs.getString(166); }
		public String getDLV_KEY_NO_23_R() throws FoundationException { return m_doRs.getString(167); }
		public String getDLV_KEY_NO_24_R() throws FoundationException { return m_doRs.getString(168); }
		public String getDLV_KEY_NO_25_R() throws FoundationException { return m_doRs.getString(169); }
		public String getDLV_KEY_NO_26_R() throws FoundationException { return m_doRs.getString(170); }
		public String getDLV_KEY_NO_27_R() throws FoundationException { return m_doRs.getString(171); }
		public String getDLV_KEY_NO_28_R() throws FoundationException { return m_doRs.getString(172); }
		public String getDLV_KEY_NO_29_R() throws FoundationException { return m_doRs.getString(173); }
		public String getDLV_KEY_NO_30_R() throws FoundationException { return m_doRs.getString(174); }
		public String getDLV_KEY_NO_31_R() throws FoundationException { return m_doRs.getString(175); }
		public String getDLV_LOC_NAME_R() throws FoundationException { return m_doRs.getString(176); }
		public String getCLIENT_BARCODE_INF_R() throws FoundationException { return m_doRs.getString(177); }
		public String getCLIENT_REMARK_R() throws FoundationException { return m_doRs.getString(178); }
		public String getCONTRACT_COND_TYP_R() throws FoundationException { return m_doRs.getString(179); }
		public String getPUCH_ODR_SHAP_TYP_R() throws FoundationException { return m_doRs.getString(180); }
		public String getMASTER_PUCH_ODR_CD_R() throws FoundationException { return m_doRs.getString(181); }
		public String getQTY_CONTRACT_TYP_R() throws FoundationException { return m_doRs.getString(182); }
		public String getODR_MODIFICATION_TYP_1_R() throws FoundationException { return m_doRs.getString(183); }
		public String getODR_MODIFICATION_TYP_2_R() throws FoundationException { return m_doRs.getString(184); }
		public String getODR_MODIFICATION_TYP_3_R() throws FoundationException { return m_doRs.getString(185); }
		public String getMACHINE_TYP_CD_R() throws FoundationException { return m_doRs.getString(186); }
		public String getENGINNERING_CHG_CD_R() throws FoundationException { return m_doRs.getString(187); }
		public String getDROW_SPEC_CD_R() throws FoundationException { return m_doRs.getString(188); }
		public String getDLV_DOC_FORM_1_R() throws FoundationException { return m_doRs.getString(189); }
		public boolean wasNull_DLV_DOC_COPY_NUM_1_R() throws FoundationException { return m_doRs.wasNull(190); }
		public Number getDLV_DOC_COPY_NUM_1_R() throws FoundationException { return m_doRs.getDouble(190); }
		public String getDLV_DOC_LANG_1_R() throws FoundationException { return m_doRs.getString(191); }
		public String getDLV_DOC_FORM_2_R() throws FoundationException { return m_doRs.getString(192); }
		public boolean wasNull_DLV_DOC_COPY_NUM_2_R() throws FoundationException { return m_doRs.wasNull(193); }
		public Number getDLV_DOC_COPY_NUM_2_R() throws FoundationException { return m_doRs.getDouble(193); }
		public String getDLV_DOC_LANG_2_R() throws FoundationException { return m_doRs.getString(194); }
		public String getDLV_DOC_FORM_3_R() throws FoundationException { return m_doRs.getString(195); }
		public boolean wasNull_DLV_DOC_COPY_NUM_3_R() throws FoundationException { return m_doRs.wasNull(196); }
		public Number getDLV_DOC_COPY_NUM_3_R() throws FoundationException { return m_doRs.getDouble(196); }
		public String getDLV_DOC_LANG_3_R() throws FoundationException { return m_doRs.getString(197); }
		public String getDLV_DOC_FORM_4_R() throws FoundationException { return m_doRs.getString(198); }
		public boolean wasNull_DLV_DOC_COPY_NUM_4_R() throws FoundationException { return m_doRs.wasNull(199); }
		public Number getDLV_DOC_COPY_NUM_4_R() throws FoundationException { return m_doRs.getDouble(199); }
		public String getDLV_DOC_LANG_4_R() throws FoundationException { return m_doRs.getString(200); }
		public String getSTRATEGIC_GOODS_TYP_R() throws FoundationException { return m_doRs.getString(201); }
		public String getORGN_PLACE_CD_1_R() throws FoundationException { return m_doRs.getString(202); }
		public String getORGN_PLACE_CD_2_R() throws FoundationException { return m_doRs.getString(203); }
		public String getORGN_PLACE_CD_3_R() throws FoundationException { return m_doRs.getString(204); }
		public String getORGN_PLACE_CD_4_R() throws FoundationException { return m_doRs.getString(205); }
		public String getORGN_PLACE_CD_5_R() throws FoundationException { return m_doRs.getString(206); }
		public String getDLV_TIME_1_R() throws FoundationException { return m_doRs.getString(207); }
		public String getDLV_TIME_2_R() throws FoundationException { return m_doRs.getString(208); }
		public String getDLV_TIME_3_R() throws FoundationException { return m_doRs.getString(209); }
		public String getDLV_TIME_4_R() throws FoundationException { return m_doRs.getString(210); }
		public String getDLV_TIME_5_R() throws FoundationException { return m_doRs.getString(211); }
		public String getDLV_TIME_6_R() throws FoundationException { return m_doRs.getString(212); }
		public String getDLV_TIME_7_R() throws FoundationException { return m_doRs.getString(213); }
		public String getDLV_TIME_8_R() throws FoundationException { return m_doRs.getString(214); }
		public String getDLV_TIME_9_R() throws FoundationException { return m_doRs.getString(215); }
		public String getDLV_TIME_10_R() throws FoundationException { return m_doRs.getString(216); }
		public String getDLV_TIME_11_R() throws FoundationException { return m_doRs.getString(217); }
		public String getDLV_TIME_12_R() throws FoundationException { return m_doRs.getString(218); }
		public String getDLV_TIME_13_R() throws FoundationException { return m_doRs.getString(219); }
		public String getDLV_TIME_14_R() throws FoundationException { return m_doRs.getString(220); }
		public String getDLV_TIME_15_R() throws FoundationException { return m_doRs.getString(221); }
		public String getDLV_TIME_16_R() throws FoundationException { return m_doRs.getString(222); }
		public String getDLV_TIME_17_R() throws FoundationException { return m_doRs.getString(223); }
		public String getDLV_TIME_18_R() throws FoundationException { return m_doRs.getString(224); }
		public String getDLV_TIME_19_R() throws FoundationException { return m_doRs.getString(225); }
		public String getDLV_TIME_20_R() throws FoundationException { return m_doRs.getString(226); }
		public String getDLV_TIME_21_R() throws FoundationException { return m_doRs.getString(227); }
		public String getDLV_TIME_22_R() throws FoundationException { return m_doRs.getString(228); }
		public String getDLV_TIME_23_R() throws FoundationException { return m_doRs.getString(229); }
		public String getDLV_TIME_24_R() throws FoundationException { return m_doRs.getString(230); }
		public String getDLV_TIME_25_R() throws FoundationException { return m_doRs.getString(231); }
		public String getDLV_TIME_26_R() throws FoundationException { return m_doRs.getString(232); }
		public String getDLV_TIME_27_R() throws FoundationException { return m_doRs.getString(233); }
		public String getDLV_TIME_28_R() throws FoundationException { return m_doRs.getString(234); }
		public String getDLV_TIME_29_R() throws FoundationException { return m_doRs.getString(235); }
		public String getDLV_TIME_30_R() throws FoundationException { return m_doRs.getString(236); }
		public String getDLV_TIME_31_R() throws FoundationException { return m_doRs.getString(237); }
		public String getPACKAGE_DLV_CD_R() throws FoundationException { return m_doRs.getString(238); }
		public String getSPEC_R() throws FoundationException { return m_doRs.getString(239); }
		public String getBUYER_ORG_NAME_R() throws FoundationException { return m_doRs.getString(240); }
		public boolean wasNull_DLV_PART_LEN_1_R() throws FoundationException { return m_doRs.wasNull(241); }
		public Number getDLV_PART_LEN_1_R() throws FoundationException { return m_doRs.getDouble(241); }
		public boolean wasNull_DLV_PART_QTY_1_R() throws FoundationException { return m_doRs.wasNull(242); }
		public Number getDLV_PART_QTY_1_R() throws FoundationException { return m_doRs.getDouble(242); }
		public boolean wasNull_DLV_PART_LEN_2_R() throws FoundationException { return m_doRs.wasNull(243); }
		public Number getDLV_PART_LEN_2_R() throws FoundationException { return m_doRs.getDouble(243); }
		public boolean wasNull_DLV_PART_QTY_2_R() throws FoundationException { return m_doRs.wasNull(244); }
		public Number getDLV_PART_QTY_2_R() throws FoundationException { return m_doRs.getDouble(244); }
		public boolean wasNull_DLV_PART_LEN_3_R() throws FoundationException { return m_doRs.wasNull(245); }
		public Number getDLV_PART_LEN_3_R() throws FoundationException { return m_doRs.getDouble(245); }
		public boolean wasNull_DLV_PART_QTY_3_R() throws FoundationException { return m_doRs.wasNull(246); }
		public Number getDLV_PART_QTY_3_R() throws FoundationException { return m_doRs.getDouble(246); }
		public boolean wasNull_DLV_PART_LEN_4_R() throws FoundationException { return m_doRs.wasNull(247); }
		public Number getDLV_PART_LEN_4_R() throws FoundationException { return m_doRs.getDouble(247); }
		public boolean wasNull_DLV_PART_QTY_4_R() throws FoundationException { return m_doRs.wasNull(248); }
		public Number getDLV_PART_QTY_4_R() throws FoundationException { return m_doRs.getDouble(248); }
		public boolean wasNull_DLV_PART_LEN_5_R() throws FoundationException { return m_doRs.wasNull(249); }
		public Number getDLV_PART_LEN_5_R() throws FoundationException { return m_doRs.getDouble(249); }
		public boolean wasNull_DLV_PART_QTY_5_R() throws FoundationException { return m_doRs.wasNull(250); }
		public Number getDLV_PART_QTY_5_R() throws FoundationException { return m_doRs.getDouble(250); }
		public boolean wasNull_DLV_PART_LEN_6_R() throws FoundationException { return m_doRs.wasNull(251); }
		public Number getDLV_PART_LEN_6_R() throws FoundationException { return m_doRs.getDouble(251); }
		public boolean wasNull_DLV_PART_QTY_6_R() throws FoundationException { return m_doRs.wasNull(252); }
		public Number getDLV_PART_QTY_6_R() throws FoundationException { return m_doRs.getDouble(252); }
		public boolean wasNull_DLV_PART_LEN_7_R() throws FoundationException { return m_doRs.wasNull(253); }
		public Number getDLV_PART_LEN_7_R() throws FoundationException { return m_doRs.getDouble(253); }
		public boolean wasNull_DLV_PART_QTY_7_R() throws FoundationException { return m_doRs.wasNull(254); }
		public Number getDLV_PART_QTY_7_R() throws FoundationException { return m_doRs.getDouble(254); }
		public boolean wasNull_DLV_PART_LEN_8_R() throws FoundationException { return m_doRs.wasNull(255); }
		public Number getDLV_PART_LEN_8_R() throws FoundationException { return m_doRs.getDouble(255); }
		public boolean wasNull_DLV_PART_QTY_8_R() throws FoundationException { return m_doRs.wasNull(256); }
		public Number getDLV_PART_QTY_8_R() throws FoundationException { return m_doRs.getDouble(256); }
		public boolean wasNull_DLV_PART_LEN_9_R() throws FoundationException { return m_doRs.wasNull(257); }
		public Number getDLV_PART_LEN_9_R() throws FoundationException { return m_doRs.getDouble(257); }
		public boolean wasNull_DLV_PART_QTY_9_R() throws FoundationException { return m_doRs.wasNull(258); }
		public Number getDLV_PART_QTY_9_R() throws FoundationException { return m_doRs.getDouble(258); }
		public boolean wasNull_DLV_PART_LEN_10_R() throws FoundationException { return m_doRs.wasNull(259); }
		public Number getDLV_PART_LEN_10_R() throws FoundationException { return m_doRs.getDouble(259); }
		public boolean wasNull_DLV_PART_QTY_10_R() throws FoundationException { return m_doRs.wasNull(260); }
		public Number getDLV_PART_QTY_10_R() throws FoundationException { return m_doRs.getDouble(260); }
		public String getDLV_PART_UNIT_R() throws FoundationException { return m_doRs.getString(261); }
		public String getCUST_CONSTRUCT_NAME_R() throws FoundationException { return m_doRs.getString(262); }
		public String getMATERIAL_CD_R() throws FoundationException { return m_doRs.getString(263); }
		public boolean wasNull_MATERIAL_UNIT_PRICE_R() throws FoundationException { return m_doRs.wasNull(264); }
		public Number getMATERIAL_UNIT_PRICE_R() throws FoundationException { return m_doRs.getDouble(264); }
		public String getMATERIAL_UNIT_R() throws FoundationException { return m_doRs.getString(265); }
		public String getTEST_REPORT_NEED_TYP_R() throws FoundationException { return m_doRs.getString(266); }
		public String getTEST_REPORT_CHK_TYP_R() throws FoundationException { return m_doRs.getString(267); }
		public String getTEST_REPORT_PRESENT_TYP_R() throws FoundationException { return m_doRs.getString(268); }
		public String getMUNICIPAL_CD_R() throws FoundationException { return m_doRs.getString(269); }
		public String getDLV_CONTACT_TEL_R() throws FoundationException { return m_doRs.getString(270); }
		public String getSLIP_PRICE_PRINT_TYP_R() throws FoundationException { return m_doRs.getString(271); }
		public String getBUYER_NAME_KANJI_R() throws FoundationException { return m_doRs.getString(272); }
		public String getSPEC_KANJI_R() throws FoundationException { return m_doRs.getString(273); }
		public String getITEM_NAME_KANJI_R() throws FoundationException { return m_doRs.getString(274); }
		public String getREMARKS_KANJI_R() throws FoundationException { return m_doRs.getString(275); }
		public String getEND_USER_NAME_KANJI_R() throws FoundationException { return m_doRs.getString(276); }
		public String getDLV_ADDRESS_KANJI_R() throws FoundationException { return m_doRs.getString(277); }
		public String getDLV_ADDRESSEE_KANJI_R() throws FoundationException { return m_doRs.getString(278); }
		public String getEND_USER_ITEM_NAME_KANJI_R() throws FoundationException { return m_doRs.getString(279); }
		public String getCUST_DESINATED_MAKER_KANJI_R() throws FoundationException { return m_doRs.getString(280); }
		public String getDLV_LOC_NAME_KANJI_R() throws FoundationException { return m_doRs.getString(281); }
		public String getCLIENT_REMARK_KANJI_R() throws FoundationException { return m_doRs.getString(282); }
		public String getMACHINE_TYPE_NAME_KANJI_R() throws FoundationException { return m_doRs.getString(283); }
		public String getCUST_SPC_KANJI_R() throws FoundationException { return m_doRs.getString(284); }
		public String getBUYER_ORG_NAME_KANJI_R() throws FoundationException { return m_doRs.getString(285); }
		public String getCUST_CONSTRUCT_NAME_KANJI_R() throws FoundationException { return m_doRs.getString(286); }
		public String getCUR_CD_R() throws FoundationException { return m_doRs.getString(287); }
		public boolean wasNull_UNIT_PRICE_EXCH_RATES_R() throws FoundationException { return m_doRs.wasNull(288); }
		public Number getUNIT_PRICE_EXCH_RATES_R() throws FoundationException { return m_doRs.getDouble(288); }
		public boolean wasNull_ODR_AMOUNT_EXCH_RATES_R() throws FoundationException { return m_doRs.wasNull(289); }
		public Number getODR_AMOUNT_EXCH_RATES_R() throws FoundationException { return m_doRs.getDouble(289); }
		public boolean wasNull_TAX_AMOUNT_EXCH_RATES_R() throws FoundationException { return m_doRs.wasNull(290); }
		public Number getTAX_AMOUNT_EXCH_RATES_R() throws FoundationException { return m_doRs.getDouble(290); }
		public boolean wasNull_TOTAL_AMOUNT_EXCH_RATES_R() throws FoundationException { return m_doRs.wasNull(291); }
		public Number getTOTAL_AMOUNT_EXCH_RATES_R() throws FoundationException { return m_doRs.getDouble(291); }
		public boolean wasNull_UNCONFIRM_AMOUNT_EXCH_RATES_R() throws FoundationException { return m_doRs.wasNull(292); }
		public Number getUNCONFIRM_AMOUNT_EXCH_RATES_R() throws FoundationException { return m_doRs.getDouble(292); }
		public boolean wasNull_MATERIAL_CD_EXCH_RATES_R() throws FoundationException { return m_doRs.wasNull(293); }
		public Number getMATERIAL_CD_EXCH_RATES_R() throws FoundationException { return m_doRs.getDouble(293); }
		public String getPLANNING_ODR_CD_R() throws FoundationException { return m_doRs.getString(294); }
		public String getPLANNING_ODR_DATE_R() throws FoundationException { return m_doRs.getString(295); }
		public boolean wasNull_STANDARD_DLV_TERM_R() throws FoundationException { return m_doRs.wasNull(296); }
		public Number getSTANDARD_DLV_TERM_R() throws FoundationException { return m_doRs.getDouble(296); }
		public boolean wasNull_REQUIRED_TERM_R() throws FoundationException { return m_doRs.wasNull(297); }
		public Number getREQUIRED_TERM_R() throws FoundationException { return m_doRs.getDouble(297); }

		public boolean next() throws BatchAppException
		{
			try {
				if(m_doRs.next()==false) return false;

				if(wasNull_ODR_INFO_IF_CTRL_NO_R()==true) {
					m_med.setEdiODR_INFO_IF_CTRL_NO(null);
				} else {
					m_med.setEdiODR_INFO_IF_CTRL_NO(new Double(getODR_INFO_IF_CTRL_NO_R().doubleValue()));
				}
				if(wasNull_DATA_PROC_CD_R()==true) {
					m_med.setEdiDATA_PROC_CD(null);
				} else {
					m_med.setEdiDATA_PROC_CD(new Double(getDATA_PROC_CD_R().doubleValue()));
				}
				m_med.setEdiINFO_TYP_CD(getINFO_TYP_CD_R());
				m_med.setEdiDATA_CREATED_DATE(getDATA_CREATED_DATE_R());
				m_med.setEdiCLIENT_CD(getCLIENT_CD_R());
				m_med.setEdiTRUSTEE_CD(getTRUSTEE_CD_R());
				m_med.setEdiBUYER_ORG_CD(getBUYER_ORG_CD_R());
				m_med.setEdiPUCH_ODR_CD(getPUCH_ODR_CD_R());
				m_med.setEdiPRDCT_ODR_CD(getPRDCT_ODR_CD_R());
				m_med.setEdiMODIFICATION_CODE(getMODIFICATION_CODE_R());
				m_med.setEdiCOCK_TYP(getCOCK_TYP_R());
				m_med.setEdiPUCH_ODR_DATE(getPUCH_ODR_DATE_R());
				m_med.setEdiUNIT(getUNIT_R());
				if(wasNull_UNIT_PRICE_R()==true) {
					m_med.setEdiUNIT_PRICE(null);
				} else {
					m_med.setEdiUNIT_PRICE(new Double(getUNIT_PRICE_R().doubleValue()));
				}
				m_med.setEdiPRICE_TYP(getPRICE_TYP_R());
				if(wasNull_PUCH_ODR_QTY_R()==true) {
					m_med.setEdiPUCH_ODR_QTY(null);
				} else {
					m_med.setEdiPUCH_ODR_QTY(new Double(getPUCH_ODR_QTY_R().doubleValue()));
				}
				if(wasNull_PUCH_ODR_AMOUNT_R()==true) {
					m_med.setEdiPUCH_ODR_AMOUNT(null);
				} else {
					m_med.setEdiPUCH_ODR_AMOUNT(new Double(getPUCH_ODR_AMOUNT_R().doubleValue()));
				}
				m_med.setEdiCONS_TYP(getCONS_TYP_R());
				m_med.setEdiBUYER_NAME(getBUYER_NAME_R());
				m_med.setEdiMATR_SPEC_SIZE(getMATR_SPEC_SIZE_R());
				m_med.setEdiSPECTP(getSPECTP_R());
				m_med.setEdiDROWING_EDITION(getDROWING_EDITION_R());
				m_med.setEdiPART_NAME(getPART_NAME_R());
				m_med.setEdiOWN_ITEM_CD(getOWN_ITEM_CD_R());
				m_med.setEdiCUST_ITEM_CD(getCUST_ITEM_CD_R());
				if(wasNull_DROW_SPEC_QTY_R()==true) {
					m_med.setEdiDROW_SPEC_QTY(null);
				} else {
					m_med.setEdiDROW_SPEC_QTY(new Double(getDROW_SPEC_QTY_R().doubleValue()));
				}
				m_med.setEdiPKG_UNIT(getPKG_UNIT_R());
				m_med.setEdiDIRECT_DLV_TYP(getDIRECT_DLV_TYP_R());
				m_med.setEdiDLV_LOC_CD(getDLV_LOC_CD_R());
				m_med.setEdiINSPC_TYP(getINSPC_TYP_R());
				m_med.setEdiDLV_INST_TYP(getDLV_INST_TYP_R());
				m_med.setEdiSCDL_DLV_DATE_1(getSCDL_DLV_DATE_1_R());
				if(wasNull_SCDL_DLV_QTY_1_R()==true) {
					m_med.setEdiSCDL_DLV_QTY_1(null);
				} else {
					m_med.setEdiSCDL_DLV_QTY_1(new Double(getSCDL_DLV_QTY_1_R().doubleValue()));
				}
				m_med.setEdiDLV_CD_1(getDLV_CD_1_R());
				m_med.setEdiSCDL_DLV_DATE_2(getSCDL_DLV_DATE_2_R());
				if(wasNull_SCDL_DLV_QTY_2_R()==true) {
					m_med.setEdiSCDL_DLV_QTY_2(null);
				} else {
					m_med.setEdiSCDL_DLV_QTY_2(new Double(getSCDL_DLV_QTY_2_R().doubleValue()));
				}
				m_med.setEdiDLV_CD_2(getDLV_CD_2_R());
				m_med.setEdiSCDL_DLV_DATE_3(getSCDL_DLV_DATE_3_R());
				if(wasNull_SCDL_DLV_QTY_3_R()==true) {
					m_med.setEdiSCDL_DLV_QTY_3(null);
				} else {
					m_med.setEdiSCDL_DLV_QTY_3(new Double(getSCDL_DLV_QTY_3_R().doubleValue()));
				}
				m_med.setEdiDLV_CD_3(getDLV_CD_3_R());
				m_med.setEdiSCDL_DLV_DATE_4(getSCDL_DLV_DATE_4_R());
				if(wasNull_SCDL_DLV_QTY_4_R()==true) {
					m_med.setEdiSCDL_DLV_QTY_4(null);
				} else {
					m_med.setEdiSCDL_DLV_QTY_4(new Double(getSCDL_DLV_QTY_4_R().doubleValue()));
				}
				m_med.setEdiDLV_CD_4(getDLV_CD_4_R());
				m_med.setEdiSCDL_DLV_DATE_5(getSCDL_DLV_DATE_5_R());
				if(wasNull_SCDL_DLV_QTY_5_R()==true) {
					m_med.setEdiSCDL_DLV_QTY_5(null);
				} else {
					m_med.setEdiSCDL_DLV_QTY_5(new Double(getSCDL_DLV_QTY_5_R().doubleValue()));
				}
				m_med.setEdiDLV_CD_5(getDLV_CD_5_R());
				m_med.setEdiSCDL_DLV_DATE_6(getSCDL_DLV_DATE_6_R());
				if(wasNull_SCDL_DLV_QTY_6_R()==true) {
					m_med.setEdiSCDL_DLV_QTY_6(null);
				} else {
					m_med.setEdiSCDL_DLV_QTY_6(new Double(getSCDL_DLV_QTY_6_R().doubleValue()));
				}
				m_med.setEdiDLV_CD_6(getDLV_CD_6_R());
				m_med.setEdiSCDL_DLV_DATE_7(getSCDL_DLV_DATE_7_R());
				if(wasNull_SCDL_DLV_QTY_7_R()==true) {
					m_med.setEdiSCDL_DLV_QTY_7(null);
				} else {
					m_med.setEdiSCDL_DLV_QTY_7(new Double(getSCDL_DLV_QTY_7_R().doubleValue()));
				}
				m_med.setEdiDLV_CD_7(getDLV_CD_7_R());
				m_med.setEdiSCDL_DLV_DATE_8(getSCDL_DLV_DATE_8_R());
				if(wasNull_SCDL_DLV_QTY_8_R()==true) {
					m_med.setEdiSCDL_DLV_QTY_8(null);
				} else {
					m_med.setEdiSCDL_DLV_QTY_8(new Double(getSCDL_DLV_QTY_8_R().doubleValue()));
				}
				m_med.setEdiDLV_CD_8(getDLV_CD_8_R());
				m_med.setEdiSCDL_DLV_DATE_9(getSCDL_DLV_DATE_9_R());
				if(wasNull_SCDL_DLV_QTY_9_R()==true) {
					m_med.setEdiSCDL_DLV_QTY_9(null);
				} else {
					m_med.setEdiSCDL_DLV_QTY_9(new Double(getSCDL_DLV_QTY_9_R().doubleValue()));
				}
				m_med.setEdiDLV_CD_9(getDLV_CD_9_R());
				m_med.setEdiSCDL_DLV_DATE_10(getSCDL_DLV_DATE_10_R());
				if(wasNull_SCDL_DLV_QTY_10_R()==true) {
					m_med.setEdiSCDL_DLV_QTY_10(null);
				} else {
					m_med.setEdiSCDL_DLV_QTY_10(new Double(getSCDL_DLV_QTY_10_R().doubleValue()));
				}
				m_med.setEdiDLV_CD_10(getDLV_CD_10_R());
				m_med.setEdiSCDL_DLV_DATE_11(getSCDL_DLV_DATE_11_R());
				if(wasNull_SCDL_DLV_QTY_11_R()==true) {
					m_med.setEdiSCDL_DLV_QTY_11(null);
				} else {
					m_med.setEdiSCDL_DLV_QTY_11(new Double(getSCDL_DLV_QTY_11_R().doubleValue()));
				}
				m_med.setEdiDLV_CD_11(getDLV_CD_11_R());
				m_med.setEdiSCDL_DLV_DATE_12(getSCDL_DLV_DATE_12_R());
				if(wasNull_SCDL_DLV_QTY_12_R()==true) {
					m_med.setEdiSCDL_DLV_QTY_12(null);
				} else {
					m_med.setEdiSCDL_DLV_QTY_12(new Double(getSCDL_DLV_QTY_12_R().doubleValue()));
				}
				m_med.setEdiDLV_CD_12(getDLV_CD_12_R());
				m_med.setEdiSCDL_DLV_DATE_13(getSCDL_DLV_DATE_13_R());
				if(wasNull_SCDL_DLV_QTY_13_R()==true) {
					m_med.setEdiSCDL_DLV_QTY_13(null);
				} else {
					m_med.setEdiSCDL_DLV_QTY_13(new Double(getSCDL_DLV_QTY_13_R().doubleValue()));
				}
				m_med.setEdiDLV_CD_13(getDLV_CD_13_R());
				m_med.setEdiSCDL_DLV_DATE_14(getSCDL_DLV_DATE_14_R());
				if(wasNull_SCDL_DLV_QTY_14_R()==true) {
					m_med.setEdiSCDL_DLV_QTY_14(null);
				} else {
					m_med.setEdiSCDL_DLV_QTY_14(new Double(getSCDL_DLV_QTY_14_R().doubleValue()));
				}
				m_med.setEdiDLV_CD_14(getDLV_CD_14_R());
				m_med.setEdiSCDL_DLV_DATE_15(getSCDL_DLV_DATE_15_R());
				if(wasNull_SCDL_DLV_QTY_15_R()==true) {
					m_med.setEdiSCDL_DLV_QTY_15(null);
				} else {
					m_med.setEdiSCDL_DLV_QTY_15(new Double(getSCDL_DLV_QTY_15_R().doubleValue()));
				}
				m_med.setEdiDLV_CD_15(getDLV_CD_15_R());
				m_med.setEdiSCDL_DLV_DATE_16(getSCDL_DLV_DATE_16_R());
				if(wasNull_SCDL_DLV_QTY_16_R()==true) {
					m_med.setEdiSCDL_DLV_QTY_16(null);
				} else {
					m_med.setEdiSCDL_DLV_QTY_16(new Double(getSCDL_DLV_QTY_16_R().doubleValue()));
				}
				m_med.setEdiDLV_CD_16(getDLV_CD_16_R());
				m_med.setEdiSCDL_DLV_DATE_17(getSCDL_DLV_DATE_17_R());
				if(wasNull_SCDL_DLV_QTY_17_R()==true) {
					m_med.setEdiSCDL_DLV_QTY_17(null);
				} else {
					m_med.setEdiSCDL_DLV_QTY_17(new Double(getSCDL_DLV_QTY_17_R().doubleValue()));
				}
				m_med.setEdiDLV_CD_17(getDLV_CD_17_R());
				m_med.setEdiSCDL_DLV_DATE_18(getSCDL_DLV_DATE_18_R());
				if(wasNull_SCDL_DLV_QTY_18_R()==true) {
					m_med.setEdiSCDL_DLV_QTY_18(null);
				} else {
					m_med.setEdiSCDL_DLV_QTY_18(new Double(getSCDL_DLV_QTY_18_R().doubleValue()));
				}
				m_med.setEdiDLV_CD_18(getDLV_CD_18_R());
				m_med.setEdiSCDL_DLV_DATE_19(getSCDL_DLV_DATE_19_R());
				if(wasNull_SCDL_DLV_QTY_19_R()==true) {
					m_med.setEdiSCDL_DLV_QTY_19(null);
				} else {
					m_med.setEdiSCDL_DLV_QTY_19(new Double(getSCDL_DLV_QTY_19_R().doubleValue()));
				}
				m_med.setEdiDLV_CD_19(getDLV_CD_19_R());
				m_med.setEdiSCDL_DLV_DATE_20(getSCDL_DLV_DATE_20_R());
				if(wasNull_SCDL_DLV_QTY_20_R()==true) {
					m_med.setEdiSCDL_DLV_QTY_20(null);
				} else {
					m_med.setEdiSCDL_DLV_QTY_20(new Double(getSCDL_DLV_QTY_20_R().doubleValue()));
				}
				m_med.setEdiDLV_CD_20(getDLV_CD_20_R());
				m_med.setEdiSCDL_DLV_DATE_21(getSCDL_DLV_DATE_21_R());
				if(wasNull_SCDL_DLV_QTY_21_R()==true) {
					m_med.setEdiSCDL_DLV_QTY_21(null);
				} else {
					m_med.setEdiSCDL_DLV_QTY_21(new Double(getSCDL_DLV_QTY_21_R().doubleValue()));
				}
				m_med.setEdiDLV_CD_21(getDLV_CD_21_R());
				m_med.setEdiSCDL_DLV_DATE_22(getSCDL_DLV_DATE_22_R());
				if(wasNull_SCDL_DLV_QTY_22_R()==true) {
					m_med.setEdiSCDL_DLV_QTY_22(null);
				} else {
					m_med.setEdiSCDL_DLV_QTY_22(new Double(getSCDL_DLV_QTY_22_R().doubleValue()));
				}
				m_med.setEdiDLV_CD_22(getDLV_CD_22_R());
				m_med.setEdiSCDL_DLV_DATE_23(getSCDL_DLV_DATE_23_R());
				if(wasNull_SCDL_DLV_QTY_23_R()==true) {
					m_med.setEdiSCDL_DLV_QTY_23(null);
				} else {
					m_med.setEdiSCDL_DLV_QTY_23(new Double(getSCDL_DLV_QTY_23_R().doubleValue()));
				}
				m_med.setEdiDLV_CD_23(getDLV_CD_23_R());
				m_med.setEdiSCDL_DLV_DATE_24(getSCDL_DLV_DATE_24_R());
				if(wasNull_SCDL_DLV_QTY_24_R()==true) {
					m_med.setEdiSCDL_DLV_QTY_24(null);
				} else {
					m_med.setEdiSCDL_DLV_QTY_24(new Double(getSCDL_DLV_QTY_24_R().doubleValue()));
				}
				m_med.setEdiDLV_CD_24(getDLV_CD_24_R());
				m_med.setEdiSCDL_DLV_DATE_25(getSCDL_DLV_DATE_25_R());
				if(wasNull_SCDL_DLV_QTY_25_R()==true) {
					m_med.setEdiSCDL_DLV_QTY_25(null);
				} else {
					m_med.setEdiSCDL_DLV_QTY_25(new Double(getSCDL_DLV_QTY_25_R().doubleValue()));
				}
				m_med.setEdiDLV_CD_25(getDLV_CD_25_R());
				m_med.setEdiSCDL_DLV_DATE_26(getSCDL_DLV_DATE_26_R());
				if(wasNull_SCDL_DLV_QTY_26_R()==true) {
					m_med.setEdiSCDL_DLV_QTY_26(null);
				} else {
					m_med.setEdiSCDL_DLV_QTY_26(new Double(getSCDL_DLV_QTY_26_R().doubleValue()));
				}
				m_med.setEdiDLV_CD_26(getDLV_CD_26_R());
				m_med.setEdiSCDL_DLV_DATE_27(getSCDL_DLV_DATE_27_R());
				if(wasNull_SCDL_DLV_QTY_27_R()==true) {
					m_med.setEdiSCDL_DLV_QTY_27(null);
				} else {
					m_med.setEdiSCDL_DLV_QTY_27(new Double(getSCDL_DLV_QTY_27_R().doubleValue()));
				}
				m_med.setEdiDLV_CD_27(getDLV_CD_27_R());
				m_med.setEdiSCDL_DLV_DATE_28(getSCDL_DLV_DATE_28_R());
				if(wasNull_SCDL_DLV_QTY_28_R()==true) {
					m_med.setEdiSCDL_DLV_QTY_28(null);
				} else {
					m_med.setEdiSCDL_DLV_QTY_28(new Double(getSCDL_DLV_QTY_28_R().doubleValue()));
				}
				m_med.setEdiDLV_CD_28(getDLV_CD_28_R());
				m_med.setEdiSCDL_DLV_DATE_29(getSCDL_DLV_DATE_29_R());
				if(wasNull_SCDL_DLV_QTY_29_R()==true) {
					m_med.setEdiSCDL_DLV_QTY_29(null);
				} else {
					m_med.setEdiSCDL_DLV_QTY_29(new Double(getSCDL_DLV_QTY_29_R().doubleValue()));
				}
				m_med.setEdiDLV_CD_29(getDLV_CD_29_R());
				m_med.setEdiSCDL_DLV_DATE_30(getSCDL_DLV_DATE_30_R());
				if(wasNull_SCDL_DLV_QTY_30_R()==true) {
					m_med.setEdiSCDL_DLV_QTY_30(null);
				} else {
					m_med.setEdiSCDL_DLV_QTY_30(new Double(getSCDL_DLV_QTY_30_R().doubleValue()));
				}
				m_med.setEdiDLV_CD_30(getDLV_CD_30_R());
				m_med.setEdiSCDL_DLV_DATE_31(getSCDL_DLV_DATE_31_R());
				if(wasNull_SCDL_DLV_QTY_31_R()==true) {
					m_med.setEdiSCDL_DLV_QTY_31(null);
				} else {
					m_med.setEdiSCDL_DLV_QTY_31(new Double(getSCDL_DLV_QTY_31_R().doubleValue()));
				}
				m_med.setEdiDLV_CD_31(getDLV_CD_31_R());
				m_med.setEdiFREE_TEXT(getFREE_TEXT_R());
				m_med.setEdiREMARKS(getREMARKS_R());
				m_med.setEdiTAX_TYP(getTAX_TYP_R());
				m_med.setEdiCUST_TAXATION_TYP(getCUST_TAXATION_TYP_R());
				if(wasNull_TAX_AMOUNT_R()==true) {
					m_med.setEdiTAX_AMOUNT(null);
				} else {
					m_med.setEdiTAX_AMOUNT(new Double(getTAX_AMOUNT_R().doubleValue()));
				}
				if(wasNull_CUST_TOTAL_AMOUNT_R()==true) {
					m_med.setEdiCUST_TOTAL_AMOUNT(null);
				} else {
					m_med.setEdiCUST_TOTAL_AMOUNT(new Double(getCUST_TOTAL_AMOUNT_R().doubleValue()));
				}
				m_med.setEdiUNCONFIRM_ODR_CD(getUNCONFIRM_ODR_CD_R());
				m_med.setEdiUNCONFIRM_ODR_DATE(getUNCONFIRM_ODR_DATE_R());
				if(wasNull_UNCONFIRM_ODR_QTY_R()==true) {
					m_med.setEdiUNCONFIRM_ODR_QTY(null);
				} else {
					m_med.setEdiUNCONFIRM_ODR_QTY(new Double(getUNCONFIRM_ODR_QTY_R().doubleValue()));
				}
				if(wasNull_UNCONFIRM_ODR_AMOUNT_R()==true) {
					m_med.setEdiUNCONFIRM_ODR_AMOUNT(null);
				} else {
					m_med.setEdiUNCONFIRM_ODR_AMOUNT(new Double(getUNCONFIRM_ODR_AMOUNT_R().doubleValue()));
				}
				m_med.setEdiESTIMATE_REQST_CD(getESTIMATE_REQST_CD_R());
				m_med.setEdiSTL_COND_CD(getSTL_COND_CD_R());
				m_med.setEdiEND_USER_NAME(getEND_USER_NAME_R());
				m_med.setEdiDLV_ZIP_CD(getDLV_ZIP_CD_R());
				m_med.setEdiDLV_ADDRESS(getDLV_ADDRESS_R());
				m_med.setEdiDLV_ADDRESSEE(getDLV_ADDRESSEE_R());
				m_med.setEdiCUST_COMM_SUBNAME(getCUST_COMM_SUBNAME_R());
				m_med.setEdiCUST_COMM_SUBCD(getCUST_COMM_SUBCD_R());
				m_med.setEdiEND_USER_ODR_CD(getEND_USER_ODR_CD_R());
				m_med.setEdiCUST_DESINATED_MAKER(getCUST_DESINATED_MAKER_R());
				m_med.setEdiDLV_KEY_NO_1(getDLV_KEY_NO_1_R());
				m_med.setEdiDLV_KEY_NO_2(getDLV_KEY_NO_2_R());
				m_med.setEdiDLV_KEY_NO_3(getDLV_KEY_NO_3_R());
				m_med.setEdiDLV_KEY_NO_4(getDLV_KEY_NO_4_R());
				m_med.setEdiDLV_KEY_NO_5(getDLV_KEY_NO_5_R());
				m_med.setEdiDLV_KEY_NO_6(getDLV_KEY_NO_6_R());
				m_med.setEdiDLV_KEY_NO_7(getDLV_KEY_NO_7_R());
				m_med.setEdiDLV_KEY_NO_8(getDLV_KEY_NO_8_R());
				m_med.setEdiDLV_KEY_NO_9(getDLV_KEY_NO_9_R());
				m_med.setEdiDLV_KEY_NO_10(getDLV_KEY_NO_10_R());
				m_med.setEdiDLV_KEY_NO_11(getDLV_KEY_NO_11_R());
				m_med.setEdiDLV_KEY_NO_12(getDLV_KEY_NO_12_R());
				m_med.setEdiDLV_KEY_NO_13(getDLV_KEY_NO_13_R());
				m_med.setEdiDLV_KEY_NO_14(getDLV_KEY_NO_14_R());
				m_med.setEdiDLV_KEY_NO_15(getDLV_KEY_NO_15_R());
				m_med.setEdiDLV_KEY_NO_16(getDLV_KEY_NO_16_R());
				m_med.setEdiDLV_KEY_NO_17(getDLV_KEY_NO_17_R());
				m_med.setEdiDLV_KEY_NO_18(getDLV_KEY_NO_18_R());
				m_med.setEdiDLV_KEY_NO_19(getDLV_KEY_NO_19_R());
				m_med.setEdiDLV_KEY_NO_20(getDLV_KEY_NO_20_R());
				m_med.setEdiDLV_KEY_NO_21(getDLV_KEY_NO_21_R());
				m_med.setEdiDLV_KEY_NO_22(getDLV_KEY_NO_22_R());
				m_med.setEdiDLV_KEY_NO_23(getDLV_KEY_NO_23_R());
				m_med.setEdiDLV_KEY_NO_24(getDLV_KEY_NO_24_R());
				m_med.setEdiDLV_KEY_NO_25(getDLV_KEY_NO_25_R());
				m_med.setEdiDLV_KEY_NO_26(getDLV_KEY_NO_26_R());
				m_med.setEdiDLV_KEY_NO_27(getDLV_KEY_NO_27_R());
				m_med.setEdiDLV_KEY_NO_28(getDLV_KEY_NO_28_R());
				m_med.setEdiDLV_KEY_NO_29(getDLV_KEY_NO_29_R());
				m_med.setEdiDLV_KEY_NO_30(getDLV_KEY_NO_30_R());
				m_med.setEdiDLV_KEY_NO_31(getDLV_KEY_NO_31_R());
				m_med.setEdiDLV_LOC_NAME(getDLV_LOC_NAME_R());
				m_med.setEdiCLIENT_BARCODE_INF(getCLIENT_BARCODE_INF_R());
				m_med.setEdiCLIENT_REMARK(getCLIENT_REMARK_R());
				m_med.setEdiCONTRACT_COND_TYP(getCONTRACT_COND_TYP_R());
				m_med.setEdiPUCH_ODR_SHAP_TYP(getPUCH_ODR_SHAP_TYP_R());
				m_med.setEdiMASTER_PUCH_ODR_CD(getMASTER_PUCH_ODR_CD_R());
				m_med.setEdiQTY_CONTRACT_TYP(getQTY_CONTRACT_TYP_R());
				m_med.setEdiODR_MODIFICATION_TYP_1(getODR_MODIFICATION_TYP_1_R());
				m_med.setEdiODR_MODIFICATION_TYP_2(getODR_MODIFICATION_TYP_2_R());
				m_med.setEdiODR_MODIFICATION_TYP_3(getODR_MODIFICATION_TYP_3_R());
				m_med.setEdiMACHINE_TYP_CD(getMACHINE_TYP_CD_R());
				m_med.setEdiENGINNERING_CHG_CD(getENGINNERING_CHG_CD_R());
				m_med.setEdiDROW_SPEC_CD(getDROW_SPEC_CD_R());
				m_med.setEdiDLV_DOC_FORM_1(getDLV_DOC_FORM_1_R());
				if(wasNull_DLV_DOC_COPY_NUM_1_R()==true) {
					m_med.setEdiDLV_DOC_COPY_NUM_1(null);
				} else {
					m_med.setEdiDLV_DOC_COPY_NUM_1(new Double(getDLV_DOC_COPY_NUM_1_R().doubleValue()));
				}
				m_med.setEdiDLV_DOC_LANG_1(getDLV_DOC_LANG_1_R());
				m_med.setEdiDLV_DOC_FORM_2(getDLV_DOC_FORM_2_R());
				if(wasNull_DLV_DOC_COPY_NUM_2_R()==true) {
					m_med.setEdiDLV_DOC_COPY_NUM_2(null);
				} else {
					m_med.setEdiDLV_DOC_COPY_NUM_2(new Double(getDLV_DOC_COPY_NUM_2_R().doubleValue()));
				}
				m_med.setEdiDLV_DOC_LANG_2(getDLV_DOC_LANG_2_R());
				m_med.setEdiDLV_DOC_FORM_3(getDLV_DOC_FORM_3_R());
				if(wasNull_DLV_DOC_COPY_NUM_3_R()==true) {
					m_med.setEdiDLV_DOC_COPY_NUM_3(null);
				} else {
					m_med.setEdiDLV_DOC_COPY_NUM_3(new Double(getDLV_DOC_COPY_NUM_3_R().doubleValue()));
				}
				m_med.setEdiDLV_DOC_LANG_3(getDLV_DOC_LANG_3_R());
				m_med.setEdiDLV_DOC_FORM_4(getDLV_DOC_FORM_4_R());
				if(wasNull_DLV_DOC_COPY_NUM_4_R()==true) {
					m_med.setEdiDLV_DOC_COPY_NUM_4(null);
				} else {
					m_med.setEdiDLV_DOC_COPY_NUM_4(new Double(getDLV_DOC_COPY_NUM_4_R().doubleValue()));
				}
				m_med.setEdiDLV_DOC_LANG_4(getDLV_DOC_LANG_4_R());
				m_med.setEdiSTRATEGIC_GOODS_TYP(getSTRATEGIC_GOODS_TYP_R());
				m_med.setEdiORGN_PLACE_CD_1(getORGN_PLACE_CD_1_R());
				m_med.setEdiORGN_PLACE_CD_2(getORGN_PLACE_CD_2_R());
				m_med.setEdiORGN_PLACE_CD_3(getORGN_PLACE_CD_3_R());
				m_med.setEdiORGN_PLACE_CD_4(getORGN_PLACE_CD_4_R());
				m_med.setEdiORGN_PLACE_CD_5(getORGN_PLACE_CD_5_R());
				m_med.setEdiDLV_TIME_1(getDLV_TIME_1_R());
				m_med.setEdiDLV_TIME_2(getDLV_TIME_2_R());
				m_med.setEdiDLV_TIME_3(getDLV_TIME_3_R());
				m_med.setEdiDLV_TIME_4(getDLV_TIME_4_R());
				m_med.setEdiDLV_TIME_5(getDLV_TIME_5_R());
				m_med.setEdiDLV_TIME_6(getDLV_TIME_6_R());
				m_med.setEdiDLV_TIME_7(getDLV_TIME_7_R());
				m_med.setEdiDLV_TIME_8(getDLV_TIME_8_R());
				m_med.setEdiDLV_TIME_9(getDLV_TIME_9_R());
				m_med.setEdiDLV_TIME_10(getDLV_TIME_10_R());
				m_med.setEdiDLV_TIME_11(getDLV_TIME_11_R());
				m_med.setEdiDLV_TIME_12(getDLV_TIME_12_R());
				m_med.setEdiDLV_TIME_13(getDLV_TIME_13_R());
				m_med.setEdiDLV_TIME_14(getDLV_TIME_14_R());
				m_med.setEdiDLV_TIME_15(getDLV_TIME_15_R());
				m_med.setEdiDLV_TIME_16(getDLV_TIME_16_R());
				m_med.setEdiDLV_TIME_17(getDLV_TIME_17_R());
				m_med.setEdiDLV_TIME_18(getDLV_TIME_18_R());
				m_med.setEdiDLV_TIME_19(getDLV_TIME_19_R());
				m_med.setEdiDLV_TIME_20(getDLV_TIME_20_R());
				m_med.setEdiDLV_TIME_21(getDLV_TIME_21_R());
				m_med.setEdiDLV_TIME_22(getDLV_TIME_22_R());
				m_med.setEdiDLV_TIME_23(getDLV_TIME_23_R());
				m_med.setEdiDLV_TIME_24(getDLV_TIME_24_R());
				m_med.setEdiDLV_TIME_25(getDLV_TIME_25_R());
				m_med.setEdiDLV_TIME_26(getDLV_TIME_26_R());
				m_med.setEdiDLV_TIME_27(getDLV_TIME_27_R());
				m_med.setEdiDLV_TIME_28(getDLV_TIME_28_R());
				m_med.setEdiDLV_TIME_29(getDLV_TIME_29_R());
				m_med.setEdiDLV_TIME_30(getDLV_TIME_30_R());
				m_med.setEdiDLV_TIME_31(getDLV_TIME_31_R());
				m_med.setEdiPACKAGE_DLV_CD(getPACKAGE_DLV_CD_R());
				m_med.setEdiSPEC(getSPEC_R());
				m_med.setEdiBUYER_ORG_NAME(getBUYER_ORG_NAME_R());
				if(wasNull_DLV_PART_LEN_1_R()==true) {
					m_med.setEdiDLV_PART_LEN_1(null);
				} else {
					m_med.setEdiDLV_PART_LEN_1(new Double(getDLV_PART_LEN_1_R().doubleValue()));
				}
				if(wasNull_DLV_PART_QTY_1_R()==true) {
					m_med.setEdiDLV_PART_QTY_1(null);
				} else {
					m_med.setEdiDLV_PART_QTY_1(new Double(getDLV_PART_QTY_1_R().doubleValue()));
				}
				if(wasNull_DLV_PART_LEN_2_R()==true) {
					m_med.setEdiDLV_PART_LEN_2(null);
				} else {
					m_med.setEdiDLV_PART_LEN_2(new Double(getDLV_PART_LEN_2_R().doubleValue()));
				}
				if(wasNull_DLV_PART_QTY_2_R()==true) {
					m_med.setEdiDLV_PART_QTY_2(null);
				} else {
					m_med.setEdiDLV_PART_QTY_2(new Double(getDLV_PART_QTY_2_R().doubleValue()));
				}
				if(wasNull_DLV_PART_LEN_3_R()==true) {
					m_med.setEdiDLV_PART_LEN_3(null);
				} else {
					m_med.setEdiDLV_PART_LEN_3(new Double(getDLV_PART_LEN_3_R().doubleValue()));
				}
				if(wasNull_DLV_PART_QTY_3_R()==true) {
					m_med.setEdiDLV_PART_QTY_3(null);
				} else {
					m_med.setEdiDLV_PART_QTY_3(new Double(getDLV_PART_QTY_3_R().doubleValue()));
				}
				if(wasNull_DLV_PART_LEN_4_R()==true) {
					m_med.setEdiDLV_PART_LEN_4(null);
				} else {
					m_med.setEdiDLV_PART_LEN_4(new Double(getDLV_PART_LEN_4_R().doubleValue()));
				}
				if(wasNull_DLV_PART_QTY_4_R()==true) {
					m_med.setEdiDLV_PART_QTY_4(null);
				} else {
					m_med.setEdiDLV_PART_QTY_4(new Double(getDLV_PART_QTY_4_R().doubleValue()));
				}
				if(wasNull_DLV_PART_LEN_5_R()==true) {
					m_med.setEdiDLV_PART_LEN_5(null);
				} else {
					m_med.setEdiDLV_PART_LEN_5(new Double(getDLV_PART_LEN_5_R().doubleValue()));
				}
				if(wasNull_DLV_PART_QTY_5_R()==true) {
					m_med.setEdiDLV_PART_QTY_5(null);
				} else {
					m_med.setEdiDLV_PART_QTY_5(new Double(getDLV_PART_QTY_5_R().doubleValue()));
				}
				if(wasNull_DLV_PART_LEN_6_R()==true) {
					m_med.setEdiDLV_PART_LEN_6(null);
				} else {
					m_med.setEdiDLV_PART_LEN_6(new Double(getDLV_PART_LEN_6_R().doubleValue()));
				}
				if(wasNull_DLV_PART_QTY_6_R()==true) {
					m_med.setEdiDLV_PART_QTY_6(null);
				} else {
					m_med.setEdiDLV_PART_QTY_6(new Double(getDLV_PART_QTY_6_R().doubleValue()));
				}
				if(wasNull_DLV_PART_LEN_7_R()==true) {
					m_med.setEdiDLV_PART_LEN_7(null);
				} else {
					m_med.setEdiDLV_PART_LEN_7(new Double(getDLV_PART_LEN_7_R().doubleValue()));
				}
				if(wasNull_DLV_PART_QTY_7_R()==true) {
					m_med.setEdiDLV_PART_QTY_7(null);
				} else {
					m_med.setEdiDLV_PART_QTY_7(new Double(getDLV_PART_QTY_7_R().doubleValue()));
				}
				if(wasNull_DLV_PART_LEN_8_R()==true) {
					m_med.setEdiDLV_PART_LEN_8(null);
				} else {
					m_med.setEdiDLV_PART_LEN_8(new Double(getDLV_PART_LEN_8_R().doubleValue()));
				}
				if(wasNull_DLV_PART_QTY_8_R()==true) {
					m_med.setEdiDLV_PART_QTY_8(null);
				} else {
					m_med.setEdiDLV_PART_QTY_8(new Double(getDLV_PART_QTY_8_R().doubleValue()));
				}
				if(wasNull_DLV_PART_LEN_9_R()==true) {
					m_med.setEdiDLV_PART_LEN_9(null);
				} else {
					m_med.setEdiDLV_PART_LEN_9(new Double(getDLV_PART_LEN_9_R().doubleValue()));
				}
				if(wasNull_DLV_PART_QTY_9_R()==true) {
					m_med.setEdiDLV_PART_QTY_9(null);
				} else {
					m_med.setEdiDLV_PART_QTY_9(new Double(getDLV_PART_QTY_9_R().doubleValue()));
				}
				if(wasNull_DLV_PART_LEN_10_R()==true) {
					m_med.setEdiDLV_PART_LEN_10(null);
				} else {
					m_med.setEdiDLV_PART_LEN_10(new Double(getDLV_PART_LEN_10_R().doubleValue()));
				}
				if(wasNull_DLV_PART_QTY_10_R()==true) {
					m_med.setEdiDLV_PART_QTY_10(null);
				} else {
					m_med.setEdiDLV_PART_QTY_10(new Double(getDLV_PART_QTY_10_R().doubleValue()));
				}
				m_med.setEdiDLV_PART_UNIT(getDLV_PART_UNIT_R());
				m_med.setEdiCUST_CONSTRUCT_NAME(getCUST_CONSTRUCT_NAME_R());
				m_med.setEdiMATERIAL_CD(getMATERIAL_CD_R());
				if(wasNull_MATERIAL_UNIT_PRICE_R()==true) {
					m_med.setEdiMATERIAL_UNIT_PRICE(null);
				} else {
					m_med.setEdiMATERIAL_UNIT_PRICE(new Double(getMATERIAL_UNIT_PRICE_R().doubleValue()));
				}
				m_med.setEdiMATERIAL_UNIT(getMATERIAL_UNIT_R());
				m_med.setEdiTEST_REPORT_NEED_TYP(getTEST_REPORT_NEED_TYP_R());
				m_med.setEdiTEST_REPORT_CHK_TYP(getTEST_REPORT_CHK_TYP_R());
				m_med.setEdiTEST_REPORT_PRESENT_TYP(getTEST_REPORT_PRESENT_TYP_R());
				m_med.setEdiMUNICIPAL_CD(getMUNICIPAL_CD_R());
				m_med.setEdiDLV_CONTACT_TEL(getDLV_CONTACT_TEL_R());
				m_med.setEdiSLIP_PRICE_PRINT_TYP(getSLIP_PRICE_PRINT_TYP_R());
				m_med.setEdiBUYER_NAME_KANJI(getBUYER_NAME_KANJI_R());
				m_med.setEdiSPEC_KANJI(getSPEC_KANJI_R());
				m_med.setEdiITEM_NAME_KANJI(getITEM_NAME_KANJI_R());
				m_med.setEdiREMARKS_KANJI(getREMARKS_KANJI_R());
				m_med.setEdiEND_USER_NAME_KANJI(getEND_USER_NAME_KANJI_R());
				m_med.setEdiDLV_ADDRESS_KANJI(getDLV_ADDRESS_KANJI_R());
				m_med.setEdiDLV_ADDRESSEE_KANJI(getDLV_ADDRESSEE_KANJI_R());
				m_med.setEdiEND_USER_ITEM_NAME_KANJI(getEND_USER_ITEM_NAME_KANJI_R());
				m_med.setEdiCUST_DESINATED_MAKER_KANJI(getCUST_DESINATED_MAKER_KANJI_R());
				m_med.setEdiDLV_LOC_NAME_KANJI(getDLV_LOC_NAME_KANJI_R());
				m_med.setEdiCLIENT_REMARK_KANJI(getCLIENT_REMARK_KANJI_R());
				m_med.setEdiMACHINE_TYPE_NAME_KANJI(getMACHINE_TYPE_NAME_KANJI_R());
				m_med.setEdiCUST_SPC_KANJI(getCUST_SPC_KANJI_R());
				m_med.setEdiBUYER_ORG_NAME_KANJI(getBUYER_ORG_NAME_KANJI_R());
				m_med.setEdiCUST_CONSTRUCT_NAME_KANJI(getCUST_CONSTRUCT_NAME_KANJI_R());
				m_med.setEdiCUR_CD(getCUR_CD_R());
				if(wasNull_UNIT_PRICE_EXCH_RATES_R()==true) {
					m_med.setEdiUNIT_PRICE_EXCH_RATES(null);
				} else {
					m_med.setEdiUNIT_PRICE_EXCH_RATES(new Double(getUNIT_PRICE_EXCH_RATES_R().doubleValue()));
				}
				if(wasNull_ODR_AMOUNT_EXCH_RATES_R()==true) {
					m_med.setEdiODR_AMOUNT_EXCH_RATES(null);
				} else {
					m_med.setEdiODR_AMOUNT_EXCH_RATES(new Double(getODR_AMOUNT_EXCH_RATES_R().doubleValue()));
				}
				if(wasNull_TAX_AMOUNT_EXCH_RATES_R()==true) {
					m_med.setEdiTAX_AMOUNT_EXCH_RATES(null);
				} else {
					m_med.setEdiTAX_AMOUNT_EXCH_RATES(new Double(getTAX_AMOUNT_EXCH_RATES_R().doubleValue()));
				}
				if(wasNull_TOTAL_AMOUNT_EXCH_RATES_R()==true) {
					m_med.setEdiTOTAL_AMOUNT_EXCH_RATES(null);
				} else {
					m_med.setEdiTOTAL_AMOUNT_EXCH_RATES(new Double(getTOTAL_AMOUNT_EXCH_RATES_R().doubleValue()));
				}
				if(wasNull_UNCONFIRM_AMOUNT_EXCH_RATES_R()==true) {
					m_med.setEdiUNCONFIRM_AMOUNT_EXCH_RATES(null);
				} else {
					m_med.setEdiUNCONFIRM_AMOUNT_EXCH_RATES(new Double(getUNCONFIRM_AMOUNT_EXCH_RATES_R().doubleValue()));
				}
				if(wasNull_MATERIAL_CD_EXCH_RATES_R()==true) {
					m_med.setEdiMATERIAL_CD_EXCH_RATES(null);
				} else {
					m_med.setEdiMATERIAL_CD_EXCH_RATES(new Double(getMATERIAL_CD_EXCH_RATES_R().doubleValue()));
				}
				m_med.setEdiPLANNING_ODR_CD(getPLANNING_ODR_CD_R());
				m_med.setEdiPLANNING_ODR_DATE(getPLANNING_ODR_DATE_R());
				if(wasNull_STANDARD_DLV_TERM_R()==true) {
					m_med.setEdiSTANDARD_DLV_TERM(null);
				} else {
					m_med.setEdiSTANDARD_DLV_TERM(new Double(getSTANDARD_DLV_TERM_R().doubleValue()));
				}
				if(wasNull_REQUIRED_TERM_R()==true) {
					m_med.setEdiREQUIRED_TERM(null);
				} else {
					m_med.setEdiREQUIRED_TERM(new Double(getREQUIRED_TERM_R().doubleValue()));
				}
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("T_ODR_INFO_EDI_IF", "next", "レコード移動失敗");
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
				BatchAppException be=new BatchAppException("T_ODR_INFO_EDI_IF", "hasRecord", "レコード存在チェック失敗");
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
			BatchAppException be=new BatchAppException("T_ODR_INFO_EDI_IF", "prepareALL(FoundationException)", "SQL文のprepareで失敗しました");
			be.addMessage(e.getErrmsg());
			throw be;
		} catch(SQLException e) {
			BatchAppException be=new BatchAppException("T_ODR_INFO_EDI_IF", "prepareALL(SQLException)", "SQL文のprepareで失敗しました");
			throw be;
		}

		return;
	}

	//////////////////////////////

	/**
	 * T_ODR_INFO_EDI_IFクラスの標準コンストラクタ
	 *
		 */
	public T_ODR_INFO_EDI_IF(medKV0020B002 med, BatchAppConductor cdr) throws SystemException
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
	public medKV0020B002 m_med=null;

	protected BatchAppConductor m_conductor;

	// interEntityクラスインスタンス
	public interEntity m_entity=new interEntity();

	// 各状態で実行するsql文の定義
	protected static String m_selcmd = "select "
+"  T_ODR_INFO_EDI_IF.\"ODR_INFO_IF_CTRL_NO\" as \"ODR_INFO_IF_CTRL_NO\", "
+"  T_ODR_INFO_EDI_IF.\"DATA_PROC_CD\" as \"DATA_PROC_CD\", "
+"  T_ODR_INFO_EDI_IF.\"INFO_TYP_CD\" as \"INFO_TYP_CD\", "
+"  T_ODR_INFO_EDI_IF.\"DATA_CREATED_DATE\" as \"DATA_CREATED_DATE\", "
+"  T_ODR_INFO_EDI_IF.\"CLIENT_CD\" as \"CLIENT_CD\", "
+"  T_ODR_INFO_EDI_IF.\"TRUSTEE_CD\" as \"TRUSTEE_CD\", "
+"  T_ODR_INFO_EDI_IF.\"BUYER_ORG_CD\" as \"BUYER_ORG_CD\", "
+"  T_ODR_INFO_EDI_IF.\"PUCH_ODR_CD\" as \"PUCH_ODR_CD\", "
+"  T_ODR_INFO_EDI_IF.\"PRDCT_ODR_CD\" as \"PRDCT_ODR_CD\", "
+"  T_ODR_INFO_EDI_IF.\"MODIFICATION_CODE\" as \"MODIFICATION_CODE\", "
+"  T_ODR_INFO_EDI_IF.\"COCK_TYP\" as \"COCK_TYP\", "
+"  T_ODR_INFO_EDI_IF.\"PUCH_ODR_DATE\" as \"PUCH_ODR_DATE\", "
+"  T_ODR_INFO_EDI_IF.\"UNIT\" as \"UNIT\", "
+"  T_ODR_INFO_EDI_IF.\"UNIT_PRICE\" as \"UNIT_PRICE\", "
+"  T_ODR_INFO_EDI_IF.\"PRICE_TYP\" as \"PRICE_TYP\", "
+"  T_ODR_INFO_EDI_IF.\"PUCH_ODR_QTY\" as \"PUCH_ODR_QTY\", "
+"  T_ODR_INFO_EDI_IF.\"PUCH_ODR_AMOUNT\" as \"PUCH_ODR_AMOUNT\", "
+"  T_ODR_INFO_EDI_IF.\"CONS_TYP\" as \"CONS_TYP\", "
+"  T_ODR_INFO_EDI_IF.\"BUYER_NAME\" as \"BUYER_NAME\", "
+"  T_ODR_INFO_EDI_IF.\"MATR_SPEC_SIZE\" as \"MATR_SPEC_SIZE\", "
+"  T_ODR_INFO_EDI_IF.\"SPECTP\" as \"SPECTP\", "
+"  T_ODR_INFO_EDI_IF.\"DROWING_EDITION\" as \"DROWING_EDITION\", "
+"  T_ODR_INFO_EDI_IF.\"PART_NAME\" as \"PART_NAME\", "
+"  T_ODR_INFO_EDI_IF.\"OWN_ITEM_CD\" as \"OWN_ITEM_CD\", "
+"  T_ODR_INFO_EDI_IF.\"CUST_ITEM_CD\" as \"CUST_ITEM_CD\", "
+"  T_ODR_INFO_EDI_IF.\"DROW_SPEC_QTY\" as \"DROW_SPEC_QTY\", "
+"  T_ODR_INFO_EDI_IF.\"PKG_UNIT\" as \"PKG_UNIT\", "
+"  T_ODR_INFO_EDI_IF.\"DIRECT_DLV_TYP\" as \"DIRECT_DLV_TYP\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_LOC_CD\" as \"DLV_LOC_CD\", "
+"  T_ODR_INFO_EDI_IF.\"INSPC_TYP\" as \"INSPC_TYP\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_INST_TYP\" as \"DLV_INST_TYP\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_DATE_1\" as \"SCDL_DLV_DATE_1\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_QTY_1\" as \"SCDL_DLV_QTY_1\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_CD_1\" as \"DLV_CD_1\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_DATE_2\" as \"SCDL_DLV_DATE_2\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_QTY_2\" as \"SCDL_DLV_QTY_2\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_CD_2\" as \"DLV_CD_2\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_DATE_3\" as \"SCDL_DLV_DATE_3\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_QTY_3\" as \"SCDL_DLV_QTY_3\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_CD_3\" as \"DLV_CD_3\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_DATE_4\" as \"SCDL_DLV_DATE_4\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_QTY_4\" as \"SCDL_DLV_QTY_4\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_CD_4\" as \"DLV_CD_4\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_DATE_5\" as \"SCDL_DLV_DATE_5\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_QTY_5\" as \"SCDL_DLV_QTY_5\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_CD_5\" as \"DLV_CD_5\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_DATE_6\" as \"SCDL_DLV_DATE_6\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_QTY_6\" as \"SCDL_DLV_QTY_6\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_CD_6\" as \"DLV_CD_6\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_DATE_7\" as \"SCDL_DLV_DATE_7\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_QTY_7\" as \"SCDL_DLV_QTY_7\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_CD_7\" as \"DLV_CD_7\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_DATE_8\" as \"SCDL_DLV_DATE_8\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_QTY_8\" as \"SCDL_DLV_QTY_8\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_CD_8\" as \"DLV_CD_8\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_DATE_9\" as \"SCDL_DLV_DATE_9\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_QTY_9\" as \"SCDL_DLV_QTY_9\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_CD_9\" as \"DLV_CD_9\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_DATE_10\" as \"SCDL_DLV_DATE_10\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_QTY_10\" as \"SCDL_DLV_QTY_10\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_CD_10\" as \"DLV_CD_10\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_DATE_11\" as \"SCDL_DLV_DATE_11\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_QTY_11\" as \"SCDL_DLV_QTY_11\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_CD_11\" as \"DLV_CD_11\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_DATE_12\" as \"SCDL_DLV_DATE_12\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_QTY_12\" as \"SCDL_DLV_QTY_12\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_CD_12\" as \"DLV_CD_12\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_DATE_13\" as \"SCDL_DLV_DATE_13\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_QTY_13\" as \"SCDL_DLV_QTY_13\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_CD_13\" as \"DLV_CD_13\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_DATE_14\" as \"SCDL_DLV_DATE_14\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_QTY_14\" as \"SCDL_DLV_QTY_14\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_CD_14\" as \"DLV_CD_14\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_DATE_15\" as \"SCDL_DLV_DATE_15\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_QTY_15\" as \"SCDL_DLV_QTY_15\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_CD_15\" as \"DLV_CD_15\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_DATE_16\" as \"SCDL_DLV_DATE_16\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_QTY_16\" as \"SCDL_DLV_QTY_16\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_CD_16\" as \"DLV_CD_16\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_DATE_17\" as \"SCDL_DLV_DATE_17\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_QTY_17\" as \"SCDL_DLV_QTY_17\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_CD_17\" as \"DLV_CD_17\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_DATE_18\" as \"SCDL_DLV_DATE_18\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_QTY_18\" as \"SCDL_DLV_QTY_18\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_CD_18\" as \"DLV_CD_18\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_DATE_19\" as \"SCDL_DLV_DATE_19\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_QTY_19\" as \"SCDL_DLV_QTY_19\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_CD_19\" as \"DLV_CD_19\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_DATE_20\" as \"SCDL_DLV_DATE_20\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_QTY_20\" as \"SCDL_DLV_QTY_20\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_CD_20\" as \"DLV_CD_20\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_DATE_21\" as \"SCDL_DLV_DATE_21\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_QTY_21\" as \"SCDL_DLV_QTY_21\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_CD_21\" as \"DLV_CD_21\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_DATE_22\" as \"SCDL_DLV_DATE_22\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_QTY_22\" as \"SCDL_DLV_QTY_22\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_CD_22\" as \"DLV_CD_22\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_DATE_23\" as \"SCDL_DLV_DATE_23\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_QTY_23\" as \"SCDL_DLV_QTY_23\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_CD_23\" as \"DLV_CD_23\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_DATE_24\" as \"SCDL_DLV_DATE_24\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_QTY_24\" as \"SCDL_DLV_QTY_24\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_CD_24\" as \"DLV_CD_24\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_DATE_25\" as \"SCDL_DLV_DATE_25\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_QTY_25\" as \"SCDL_DLV_QTY_25\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_CD_25\" as \"DLV_CD_25\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_DATE_26\" as \"SCDL_DLV_DATE_26\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_QTY_26\" as \"SCDL_DLV_QTY_26\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_CD_26\" as \"DLV_CD_26\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_DATE_27\" as \"SCDL_DLV_DATE_27\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_QTY_27\" as \"SCDL_DLV_QTY_27\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_CD_27\" as \"DLV_CD_27\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_DATE_28\" as \"SCDL_DLV_DATE_28\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_QTY_28\" as \"SCDL_DLV_QTY_28\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_CD_28\" as \"DLV_CD_28\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_DATE_29\" as \"SCDL_DLV_DATE_29\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_QTY_29\" as \"SCDL_DLV_QTY_29\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_CD_29\" as \"DLV_CD_29\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_DATE_30\" as \"SCDL_DLV_DATE_30\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_QTY_30\" as \"SCDL_DLV_QTY_30\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_CD_30\" as \"DLV_CD_30\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_DATE_31\" as \"SCDL_DLV_DATE_31\", "
+"  T_ODR_INFO_EDI_IF.\"SCDL_DLV_QTY_31\" as \"SCDL_DLV_QTY_31\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_CD_31\" as \"DLV_CD_31\", "
+"  T_ODR_INFO_EDI_IF.\"FREE_TEXT\" as \"FREE_TEXT\", "
+"  T_ODR_INFO_EDI_IF.\"REMARKS\" as \"REMARKS\", "
+"  T_ODR_INFO_EDI_IF.\"TAX_TYP\" as \"TAX_TYP\", "
+"  T_ODR_INFO_EDI_IF.\"CUST_TAXATION_TYP\" as \"CUST_TAXATION_TYP\", "
+"  T_ODR_INFO_EDI_IF.\"TAX_AMOUNT\" as \"TAX_AMOUNT\", "
+"  T_ODR_INFO_EDI_IF.\"CUST_TOTAL_AMOUNT\" as \"CUST_TOTAL_AMOUNT\", "
+"  T_ODR_INFO_EDI_IF.\"UNCONFIRM_ODR_CD\" as \"UNCONFIRM_ODR_CD\", "
+"  T_ODR_INFO_EDI_IF.\"UNCONFIRM_ODR_DATE\" as \"UNCONFIRM_ODR_DATE\", "
+"  T_ODR_INFO_EDI_IF.\"UNCONFIRM_ODR_QTY\" as \"UNCONFIRM_ODR_QTY\", "
+"  T_ODR_INFO_EDI_IF.\"UNCONFIRM_ODR_AMOUNT\" as \"UNCONFIRM_ODR_AMOUNT\", "
+"  T_ODR_INFO_EDI_IF.\"ESTIMATE_REQST_CD\" as \"ESTIMATE_REQST_CD\", "
+"  T_ODR_INFO_EDI_IF.\"STL_COND_CD\" as \"STL_COND_CD\", "
+"  T_ODR_INFO_EDI_IF.\"END_USER_NAME\" as \"END_USER_NAME\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_ZIP_CD\" as \"DLV_ZIP_CD\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_ADDRESS\" as \"DLV_ADDRESS\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_ADDRESSEE\" as \"DLV_ADDRESSEE\", "
+"  T_ODR_INFO_EDI_IF.\"CUST_COMM_SUBNAME\" as \"CUST_COMM_SUBNAME\", "
+"  T_ODR_INFO_EDI_IF.\"CUST_COMM_SUBCD\" as \"CUST_COMM_SUBCD\", "
+"  T_ODR_INFO_EDI_IF.\"END_USER_ODR_CD\" as \"END_USER_ODR_CD\", "
+"  T_ODR_INFO_EDI_IF.\"CUST_DESINATED_MAKER\" as \"CUST_DESINATED_MAKER\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_KEY_NO_1\" as \"DLV_KEY_NO_1\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_KEY_NO_2\" as \"DLV_KEY_NO_2\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_KEY_NO_3\" as \"DLV_KEY_NO_3\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_KEY_NO_4\" as \"DLV_KEY_NO_4\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_KEY_NO_5\" as \"DLV_KEY_NO_5\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_KEY_NO_6\" as \"DLV_KEY_NO_6\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_KEY_NO_7\" as \"DLV_KEY_NO_7\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_KEY_NO_8\" as \"DLV_KEY_NO_8\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_KEY_NO_9\" as \"DLV_KEY_NO_9\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_KEY_NO_10\" as \"DLV_KEY_NO_10\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_KEY_NO_11\" as \"DLV_KEY_NO_11\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_KEY_NO_12\" as \"DLV_KEY_NO_12\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_KEY_NO_13\" as \"DLV_KEY_NO_13\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_KEY_NO_14\" as \"DLV_KEY_NO_14\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_KEY_NO_15\" as \"DLV_KEY_NO_15\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_KEY_NO_16\" as \"DLV_KEY_NO_16\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_KEY_NO_17\" as \"DLV_KEY_NO_17\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_KEY_NO_18\" as \"DLV_KEY_NO_18\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_KEY_NO_19\" as \"DLV_KEY_NO_19\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_KEY_NO_20\" as \"DLV_KEY_NO_20\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_KEY_NO_21\" as \"DLV_KEY_NO_21\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_KEY_NO_22\" as \"DLV_KEY_NO_22\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_KEY_NO_23\" as \"DLV_KEY_NO_23\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_KEY_NO_24\" as \"DLV_KEY_NO_24\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_KEY_NO_25\" as \"DLV_KEY_NO_25\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_KEY_NO_26\" as \"DLV_KEY_NO_26\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_KEY_NO_27\" as \"DLV_KEY_NO_27\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_KEY_NO_28\" as \"DLV_KEY_NO_28\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_KEY_NO_29\" as \"DLV_KEY_NO_29\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_KEY_NO_30\" as \"DLV_KEY_NO_30\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_KEY_NO_31\" as \"DLV_KEY_NO_31\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_LOC_NAME\" as \"DLV_LOC_NAME\", "
+"  T_ODR_INFO_EDI_IF.\"CLIENT_BARCODE_INF\" as \"CLIENT_BARCODE_INF\", "
+"  T_ODR_INFO_EDI_IF.\"CLIENT_REMARK\" as \"CLIENT_REMARK\", "
+"  T_ODR_INFO_EDI_IF.\"CONTRACT_COND_TYP\" as \"CONTRACT_COND_TYP\", "
+"  T_ODR_INFO_EDI_IF.\"PUCH_ODR_SHAP_TYP\" as \"PUCH_ODR_SHAP_TYP\", "
+"  T_ODR_INFO_EDI_IF.\"MASTER_PUCH_ODR_CD\" as \"MASTER_PUCH_ODR_CD\", "
+"  T_ODR_INFO_EDI_IF.\"QTY_CONTRACT_TYP\" as \"QTY_CONTRACT_TYP\", "
+"  T_ODR_INFO_EDI_IF.\"ODR_MODIFICATION_TYP_1\" as \"ODR_MODIFICATION_TYP_1\", "
+"  T_ODR_INFO_EDI_IF.\"ODR_MODIFICATION_TYP_2\" as \"ODR_MODIFICATION_TYP_2\", "
+"  T_ODR_INFO_EDI_IF.\"ODR_MODIFICATION_TYP_3\" as \"ODR_MODIFICATION_TYP_3\", "
+"  T_ODR_INFO_EDI_IF.\"MACHINE_TYP_CD\" as \"MACHINE_TYP_CD\", "
+"  T_ODR_INFO_EDI_IF.\"ENGINNERING_CHG_CD\" as \"ENGINNERING_CHG_CD\", "
+"  T_ODR_INFO_EDI_IF.\"DROW_SPEC_CD\" as \"DROW_SPEC_CD\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_DOC_FORM_1\" as \"DLV_DOC_FORM_1\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_DOC_COPY_NUM_1\" as \"DLV_DOC_COPY_NUM_1\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_DOC_LANG_1\" as \"DLV_DOC_LANG_1\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_DOC_FORM_2\" as \"DLV_DOC_FORM_2\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_DOC_COPY_NUM_2\" as \"DLV_DOC_COPY_NUM_2\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_DOC_LANG_2\" as \"DLV_DOC_LANG_2\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_DOC_FORM_3\" as \"DLV_DOC_FORM_3\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_DOC_COPY_NUM_3\" as \"DLV_DOC_COPY_NUM_3\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_DOC_LANG_3\" as \"DLV_DOC_LANG_3\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_DOC_FORM_4\" as \"DLV_DOC_FORM_4\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_DOC_COPY_NUM_4\" as \"DLV_DOC_COPY_NUM_4\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_DOC_LANG_4\" as \"DLV_DOC_LANG_4\", "
+"  T_ODR_INFO_EDI_IF.\"STRATEGIC_GOODS_TYP\" as \"STRATEGIC_GOODS_TYP\", "
+"  T_ODR_INFO_EDI_IF.\"ORGN_PLACE_CD_1\" as \"ORGN_PLACE_CD_1\", "
+"  T_ODR_INFO_EDI_IF.\"ORGN_PLACE_CD_2\" as \"ORGN_PLACE_CD_2\", "
+"  T_ODR_INFO_EDI_IF.\"ORGN_PLACE_CD_3\" as \"ORGN_PLACE_CD_3\", "
+"  T_ODR_INFO_EDI_IF.\"ORGN_PLACE_CD_4\" as \"ORGN_PLACE_CD_4\", "
+"  T_ODR_INFO_EDI_IF.\"ORGN_PLACE_CD_5\" as \"ORGN_PLACE_CD_5\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_TIME_1\" as \"DLV_TIME_1\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_TIME_2\" as \"DLV_TIME_2\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_TIME_3\" as \"DLV_TIME_3\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_TIME_4\" as \"DLV_TIME_4\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_TIME_5\" as \"DLV_TIME_5\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_TIME_6\" as \"DLV_TIME_6\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_TIME_7\" as \"DLV_TIME_7\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_TIME_8\" as \"DLV_TIME_8\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_TIME_9\" as \"DLV_TIME_9\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_TIME_10\" as \"DLV_TIME_10\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_TIME_11\" as \"DLV_TIME_11\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_TIME_12\" as \"DLV_TIME_12\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_TIME_13\" as \"DLV_TIME_13\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_TIME_14\" as \"DLV_TIME_14\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_TIME_15\" as \"DLV_TIME_15\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_TIME_16\" as \"DLV_TIME_16\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_TIME_17\" as \"DLV_TIME_17\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_TIME_18\" as \"DLV_TIME_18\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_TIME_19\" as \"DLV_TIME_19\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_TIME_20\" as \"DLV_TIME_20\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_TIME_21\" as \"DLV_TIME_21\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_TIME_22\" as \"DLV_TIME_22\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_TIME_23\" as \"DLV_TIME_23\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_TIME_24\" as \"DLV_TIME_24\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_TIME_25\" as \"DLV_TIME_25\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_TIME_26\" as \"DLV_TIME_26\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_TIME_27\" as \"DLV_TIME_27\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_TIME_28\" as \"DLV_TIME_28\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_TIME_29\" as \"DLV_TIME_29\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_TIME_30\" as \"DLV_TIME_30\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_TIME_31\" as \"DLV_TIME_31\", "
+"  T_ODR_INFO_EDI_IF.\"PACKAGE_DLV_CD\" as \"PACKAGE_DLV_CD\", "
+"  T_ODR_INFO_EDI_IF.\"SPEC\" as \"SPEC\", "
+"  T_ODR_INFO_EDI_IF.\"BUYER_ORG_NAME\" as \"BUYER_ORG_NAME\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_PART_LEN_1\" as \"DLV_PART_LEN_1\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_PART_QTY_1\" as \"DLV_PART_QTY_1\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_PART_LEN_2\" as \"DLV_PART_LEN_2\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_PART_QTY_2\" as \"DLV_PART_QTY_2\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_PART_LEN_3\" as \"DLV_PART_LEN_3\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_PART_QTY_3\" as \"DLV_PART_QTY_3\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_PART_LEN_4\" as \"DLV_PART_LEN_4\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_PART_QTY_4\" as \"DLV_PART_QTY_4\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_PART_LEN_5\" as \"DLV_PART_LEN_5\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_PART_QTY_5\" as \"DLV_PART_QTY_5\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_PART_LEN_6\" as \"DLV_PART_LEN_6\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_PART_QTY_6\" as \"DLV_PART_QTY_6\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_PART_LEN_7\" as \"DLV_PART_LEN_7\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_PART_QTY_7\" as \"DLV_PART_QTY_7\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_PART_LEN_8\" as \"DLV_PART_LEN_8\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_PART_QTY_8\" as \"DLV_PART_QTY_8\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_PART_LEN_9\" as \"DLV_PART_LEN_9\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_PART_QTY_9\" as \"DLV_PART_QTY_9\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_PART_LEN_10\" as \"DLV_PART_LEN_10\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_PART_QTY_10\" as \"DLV_PART_QTY_10\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_PART_UNIT\" as \"DLV_PART_UNIT\", "
+"  T_ODR_INFO_EDI_IF.\"CUST_CONSTRUCT_NAME\" as \"CUST_CONSTRUCT_NAME\", "
+"  T_ODR_INFO_EDI_IF.\"MATERIAL_CD\" as \"MATERIAL_CD\", "
+"  T_ODR_INFO_EDI_IF.\"MATERIAL_UNIT_PRICE\" as \"MATERIAL_UNIT_PRICE\", "
+"  T_ODR_INFO_EDI_IF.\"MATERIAL_UNIT\" as \"MATERIAL_UNIT\", "
+"  T_ODR_INFO_EDI_IF.\"TEST_REPORT_NEED_TYP\" as \"TEST_REPORT_NEED_TYP\", "
+"  T_ODR_INFO_EDI_IF.\"TEST_REPORT_CHK_TYP\" as \"TEST_REPORT_CHK_TYP\", "
+"  T_ODR_INFO_EDI_IF.\"TEST_REPORT_PRESENT_TYP\" as \"TEST_REPORT_PRESENT_TYP\", "
+"  T_ODR_INFO_EDI_IF.\"MUNICIPAL_CD\" as \"MUNICIPAL_CD\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_CONTACT_TEL\" as \"DLV_CONTACT_TEL\", "
+"  T_ODR_INFO_EDI_IF.\"SLIP_PRICE_PRINT_TYP\" as \"SLIP_PRICE_PRINT_TYP\", "
+"  T_ODR_INFO_EDI_IF.\"BUYER_NAME_KANJI\" as \"BUYER_NAME_KANJI\", "
+"  T_ODR_INFO_EDI_IF.\"SPEC_KANJI\" as \"SPEC_KANJI\", "
+"  T_ODR_INFO_EDI_IF.\"ITEM_NAME_KANJI\" as \"ITEM_NAME_KANJI\", "
+"  T_ODR_INFO_EDI_IF.\"REMARKS_KANJI\" as \"REMARKS_KANJI\", "
+"  T_ODR_INFO_EDI_IF.\"END_USER_NAME_KANJI\" as \"END_USER_NAME_KANJI\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_ADDRESS_KANJI\" as \"DLV_ADDRESS_KANJI\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_ADDRESSEE_KANJI\" as \"DLV_ADDRESSEE_KANJI\", "
+"  T_ODR_INFO_EDI_IF.\"END_USER_ITEM_NAME_KANJI\" as \"END_USER_ITEM_NAME_KANJI\", "
+"  T_ODR_INFO_EDI_IF.\"CUST_DESINATED_MAKER_KANJI\" as \"CUST_DESINATED_MAKER_KANJI\", "
+"  T_ODR_INFO_EDI_IF.\"DLV_LOC_NAME_KANJI\" as \"DLV_LOC_NAME_KANJI\", "
+"  T_ODR_INFO_EDI_IF.\"CLIENT_REMARK_KANJI\" as \"CLIENT_REMARK_KANJI\", "
+"  T_ODR_INFO_EDI_IF.\"MACHINE_TYPE_NAME_KANJI\" as \"MACHINE_TYPE_NAME_KANJI\", "
+"  T_ODR_INFO_EDI_IF.\"CUST_SPC_KANJI\" as \"CUST_SPC_KANJI\", "
+"  T_ODR_INFO_EDI_IF.\"BUYER_ORG_NAME_KANJI\" as \"BUYER_ORG_NAME_KANJI\", "
+"  T_ODR_INFO_EDI_IF.\"CUST_CONSTRUCT_NAME_KANJI\" as \"CUST_CONSTRUCT_NAME_KANJI\", "
+"  T_ODR_INFO_EDI_IF.\"CUR_CD\" as \"CUR_CD\", "
+"  T_ODR_INFO_EDI_IF.\"UNIT_PRICE_EXCH_RATES\" as \"UNIT_PRICE_EXCH_RATES\", "
+"  T_ODR_INFO_EDI_IF.\"ODR_AMOUNT_EXCH_RATES\" as \"ODR_AMOUNT_EXCH_RATES\", "
+"  T_ODR_INFO_EDI_IF.\"TAX_AMOUNT_EXCH_RATES\" as \"TAX_AMOUNT_EXCH_RATES\", "
+"  T_ODR_INFO_EDI_IF.\"TOTAL_AMOUNT_EXCH_RATES\" as \"TOTAL_AMOUNT_EXCH_RATES\", "
+"  T_ODR_INFO_EDI_IF.\"UNCONFIRM_AMOUNT_EXCH_RATES\" as \"UNCONFIRM_AMOUNT_EXCH_RATES\", "
+"  T_ODR_INFO_EDI_IF.\"MATERIAL_CD_EXCH_RATES\" as \"MATERIAL_CD_EXCH_RATES\", "
+"  T_ODR_INFO_EDI_IF.\"PLANNING_ODR_CD\" as \"PLANNING_ODR_CD\", "
+"  T_ODR_INFO_EDI_IF.\"PLANNING_ODR_DATE\" as \"PLANNING_ODR_DATE\", "
+"  T_ODR_INFO_EDI_IF.\"STANDARD_DLV_TERM\" as \"STANDARD_DLV_TERM\", "
+"  T_ODR_INFO_EDI_IF.\"REQUIRED_TERM\" as \"REQUIRED_TERM\" "
+"from "
+"  T_ODR_INFO_EDI_IF "
+"where "
+"  T_ODR_INFO_EDI_IF.\"SYSTEM_PROC_TYP\" = '0' "
+"  and T_ODR_INFO_EDI_IF.\"DEL_FLG\" = '0' "
+"  and T_ODR_INFO_EDI_IF.INFO_TYP_CD in ('0201','0203','0501','0502','0503','0504') "
+"order by "
+"  T_ODR_INFO_EDI_IF.\"INFO_TYP_CD\", "
+"  T_ODR_INFO_EDI_IF.\"ODR_INFO_IF_CTRL_NO\"";
	protected static String m_inscmd = null;
	protected static String m_updcmd = "update "
+"  T_ODR_INFO_EDI_IF "
+"set "
+"  \"SYSTEM_PROC_TYP\" = ? "
+"where "
+"  T_ODR_INFO_EDI_IF.\"ODR_INFO_IF_CTRL_NO\" = ?";
	protected static String m_delcmd = null;
	protected String m_spcmd=null;

	// トランザクション利用の可否を設定します
	boolean m_useTransaction=true;

	//////////////////////////////

}
