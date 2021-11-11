/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KV0020/src/com/nec/jp/orteus/metamorBase/KV0020/KV0020B001/T_ODR_INFO_EDI_IF.java,v $
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

package com.nec.jp.orteus.metamorBase.KV0020.KV0020B001;

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
 * @version $Revision: 1.8 $ $Date: 2015/12/03 08:55:47 $
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

		public void setODR_INFO_IF_CTRL_NO_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(7, null);
			} else {
				getAdapt_C().setDouble(7, value);
			}
		}
		public void setDATA_PROC_CD_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(8, null);
			} else {
				getAdapt_C().setDouble(8, value);
			}
		}
		public void setINFO_TYP_CD_C(String value) throws FoundationException { getAdapt_C().setString(9, value); }
		public void setDATA_CREATED_DATE_C(String value) throws FoundationException { getAdapt_C().setString(10, value); }
		public void setCLIENT_CD_C(String value) throws FoundationException { getAdapt_C().setString(11, value); }
		public void setTRUSTEE_CD_C(String value) throws FoundationException { getAdapt_C().setString(12, value); }
		public void setBUYER_ORG_CD_C(String value) throws FoundationException { getAdapt_C().setString(13, value); }
		public void setPUCH_ODR_CD_C(String value) throws FoundationException { getAdapt_C().setString(14, value); }
		public void setPRDCT_ODR_CD_C(String value) throws FoundationException { getAdapt_C().setString(15, value); }
		public void setMODIFICATION_CODE_C(String value) throws FoundationException { getAdapt_C().setString(16, value); }
		public void setCOCK_TYP_C(String value) throws FoundationException { getAdapt_C().setString(17, value); }
		public void setPUCH_ODR_DATE_C(String value) throws FoundationException { getAdapt_C().setString(18, value); }
		public void setUNIT_C(String value) throws FoundationException { getAdapt_C().setString(19, value); }
		public void setUNIT_PRICE_C(String value) throws FoundationException { getAdapt_C().setString(20, value); }
		public void setPRICE_TYP_C(String value) throws FoundationException { getAdapt_C().setString(21, value); }
		public void setPUCH_ODR_QTY_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(22, null);
			} else {
				getAdapt_C().setDouble(22, value);
			}
		}
		public void setPUCH_ODR_AMOUNT_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(23, null);
			} else {
				getAdapt_C().setDouble(23, value);
			}
		}
		public void setCONS_TYP_C(String value) throws FoundationException { getAdapt_C().setString(24, value); }
		public void setBUYER_NAME_C(String value) throws FoundationException { getAdapt_C().setString(25, value); }
		public void setMATR_SPEC_SIZE_C(String value) throws FoundationException { getAdapt_C().setString(26, value); }
		public void setSPECTP_C(String value) throws FoundationException { getAdapt_C().setString(27, value); }
		public void setDROWING_EDITION_C(String value) throws FoundationException { getAdapt_C().setString(28, value); }
		public void setPART_NAME_C(String value) throws FoundationException { getAdapt_C().setString(29, value); }
		public void setOWN_ITEM_CD_C(String value) throws FoundationException { getAdapt_C().setString(30, value); }
		public void setCUST_ITEM_CD_C(String value) throws FoundationException { getAdapt_C().setString(31, value); }
		public void setDROW_SPEC_QTY_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(32, null);
			} else {
				getAdapt_C().setDouble(32, value);
			}
		}
		public void setPKG_UNIT_C(String value) throws FoundationException { getAdapt_C().setString(33, value); }
		public void setDIRECT_DLV_TYP_C(String value) throws FoundationException { getAdapt_C().setString(34, value); }
		public void setDLV_LOC_CD_C(String value) throws FoundationException { getAdapt_C().setString(35, value); }
		public void setINSPC_TYP_C(String value) throws FoundationException { getAdapt_C().setString(36, value); }
		public void setDLV_INST_TYP_C(String value) throws FoundationException { getAdapt_C().setString(37, value); }
		public void setSCDL_DLV_DATE_1_C(String value) throws FoundationException { getAdapt_C().setString(38, value); }
		public void setSCDL_DLV_QTY_1_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(39, null);
			} else {
				getAdapt_C().setDouble(39, value);
			}
		}
		public void setDLV_CD_1_C(String value) throws FoundationException { getAdapt_C().setString(40, value); }
		public void setSCDL_DLV_DATE_2_C(String value) throws FoundationException { getAdapt_C().setString(41, value); }
		public void setSCDL_DLV_QTY_2_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(42, null);
			} else {
				getAdapt_C().setDouble(42, value);
			}
		}
		public void setDLV_CD_2_C(String value) throws FoundationException { getAdapt_C().setString(43, value); }
		public void setSCDL_DLV_DATE_3_C(String value) throws FoundationException { getAdapt_C().setString(44, value); }
		public void setSCDL_DLV_QTY_3_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(45, null);
			} else {
				getAdapt_C().setDouble(45, value);
			}
		}
		public void setDLV_CD_3_C(String value) throws FoundationException { getAdapt_C().setString(46, value); }
		public void setSCDL_DLV_DATE_4_C(String value) throws FoundationException { getAdapt_C().setString(47, value); }
		public void setSCDL_DLV_QTY_4_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(48, null);
			} else {
				getAdapt_C().setDouble(48, value);
			}
		}
		public void setDLV_CD_4_C(String value) throws FoundationException { getAdapt_C().setString(49, value); }
		public void setSCDL_DLV_DATE_5_C(String value) throws FoundationException { getAdapt_C().setString(50, value); }
		public void setSCDL_DLV_QTY_5_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(51, null);
			} else {
				getAdapt_C().setDouble(51, value);
			}
		}
		public void setDLV_CD_5_C(String value) throws FoundationException { getAdapt_C().setString(52, value); }
		public void setSCDL_DLV_DATE_6_C(String value) throws FoundationException { getAdapt_C().setString(53, value); }
		public void setSCDL_DLV_QTY_6_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(54, null);
			} else {
				getAdapt_C().setDouble(54, value);
			}
		}
		public void setDLV_CD_6_C(String value) throws FoundationException { getAdapt_C().setString(55, value); }
		public void setSCDL_DLV_DATE_7_C(String value) throws FoundationException { getAdapt_C().setString(56, value); }
		public void setSCDL_DLV_QTY_7_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(57, null);
			} else {
				getAdapt_C().setDouble(57, value);
			}
		}
		public void setDLV_CD_7_C(String value) throws FoundationException { getAdapt_C().setString(58, value); }
		public void setSCDL_DLV_DATE_8_C(String value) throws FoundationException { getAdapt_C().setString(59, value); }
		public void setSCDL_DLV_QTY_8_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(60, null);
			} else {
				getAdapt_C().setDouble(60, value);
			}
		}
		public void setDLV_CD_8_C(String value) throws FoundationException { getAdapt_C().setString(61, value); }
		public void setSCDL_DLV_DATE_9_C(String value) throws FoundationException { getAdapt_C().setString(62, value); }
		public void setSCDL_DLV_QTY_9_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(63, null);
			} else {
				getAdapt_C().setDouble(63, value);
			}
		}
		public void setDLV_CD_9_C(String value) throws FoundationException { getAdapt_C().setString(64, value); }
		public void setSCDL_DLV_DATE_10_C(String value) throws FoundationException { getAdapt_C().setString(65, value); }
		public void setSCDL_DLV_QTY_10_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(66, null);
			} else {
				getAdapt_C().setDouble(66, value);
			}
		}
		public void setDLV_CD_10_C(String value) throws FoundationException { getAdapt_C().setString(67, value); }
		public void setSCDL_DLV_DATE_11_C(String value) throws FoundationException { getAdapt_C().setString(68, value); }
		public void setSCDL_DLV_QTY_11_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(69, null);
			} else {
				getAdapt_C().setDouble(69, value);
			}
		}
		public void setDLV_CD_11_C(String value) throws FoundationException { getAdapt_C().setString(70, value); }
		public void setSCDL_DLV_DATE_12_C(String value) throws FoundationException { getAdapt_C().setString(71, value); }
		public void setSCDL_DLV_QTY_12_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(72, null);
			} else {
				getAdapt_C().setDouble(72, value);
			}
		}
		public void setDLV_CD_12_C(String value) throws FoundationException { getAdapt_C().setString(73, value); }
		public void setSCDL_DLV_DATE_13_C(String value) throws FoundationException { getAdapt_C().setString(74, value); }
		public void setSCDL_DLV_QTY_13_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(75, null);
			} else {
				getAdapt_C().setDouble(75, value);
			}
		}
		public void setDLV_CD_13_C(String value) throws FoundationException { getAdapt_C().setString(76, value); }
		public void setSCDL_DLV_DATE_14_C(String value) throws FoundationException { getAdapt_C().setString(77, value); }
		public void setSCDL_DLV_QTY_14_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(78, null);
			} else {
				getAdapt_C().setDouble(78, value);
			}
		}
		public void setDLV_CD_14_C(String value) throws FoundationException { getAdapt_C().setString(79, value); }
		public void setSCDL_DLV_DATE_15_C(String value) throws FoundationException { getAdapt_C().setString(80, value); }
		public void setSCDL_DLV_QTY_15_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(81, null);
			} else {
				getAdapt_C().setDouble(81, value);
			}
		}
		public void setDLV_CD_15_C(String value) throws FoundationException { getAdapt_C().setString(82, value); }
		public void setSCDL_DLV_DATE_16_C(String value) throws FoundationException { getAdapt_C().setString(83, value); }
		public void setSCDL_DLV_QTY_16_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(84, null);
			} else {
				getAdapt_C().setDouble(84, value);
			}
		}
		public void setDLV_CD_16_C(String value) throws FoundationException { getAdapt_C().setString(85, value); }
		public void setSCDL_DLV_DATE_17_C(String value) throws FoundationException { getAdapt_C().setString(86, value); }
		public void setSCDL_DLV_QTY_17_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(87, null);
			} else {
				getAdapt_C().setDouble(87, value);
			}
		}
		public void setDLV_CD_17_C(String value) throws FoundationException { getAdapt_C().setString(88, value); }
		public void setSCDL_DLV_DATE_18_C(String value) throws FoundationException { getAdapt_C().setString(89, value); }
		public void setSCDL_DLV_QTY_18_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(90, null);
			} else {
				getAdapt_C().setDouble(90, value);
			}
		}
		public void setDLV_CD_18_C(String value) throws FoundationException { getAdapt_C().setString(91, value); }
		public void setSCDL_DLV_DATE_19_C(String value) throws FoundationException { getAdapt_C().setString(92, value); }
		public void setSCDL_DLV_QTY_19_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(93, null);
			} else {
				getAdapt_C().setDouble(93, value);
			}
		}
		public void setDLV_CD_19_C(String value) throws FoundationException { getAdapt_C().setString(94, value); }
		public void setSCDL_DLV_DATE_20_C(String value) throws FoundationException { getAdapt_C().setString(95, value); }
		public void setSCDL_DLV_QTY_20_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(96, null);
			} else {
				getAdapt_C().setDouble(96, value);
			}
		}
		public void setDLV_CD_20_C(String value) throws FoundationException { getAdapt_C().setString(97, value); }
		public void setSCDL_DLV_DATE_21_C(String value) throws FoundationException { getAdapt_C().setString(98, value); }
		public void setSCDL_DLV_QTY_21_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(99, null);
			} else {
				getAdapt_C().setDouble(99, value);
			}
		}
		public void setDLV_CD_21_C(String value) throws FoundationException { getAdapt_C().setString(100, value); }
		public void setSCDL_DLV_DATE_22_C(String value) throws FoundationException { getAdapt_C().setString(101, value); }
		public void setSCDL_DLV_QTY_22_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(102, null);
			} else {
				getAdapt_C().setDouble(102, value);
			}
		}
		public void setDLV_CD_22_C(String value) throws FoundationException { getAdapt_C().setString(103, value); }
		public void setSCDL_DLV_DATE_23_C(String value) throws FoundationException { getAdapt_C().setString(104, value); }
		public void setSCDL_DLV_QTY_23_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(105, null);
			} else {
				getAdapt_C().setDouble(105, value);
			}
		}
		public void setDLV_CD_23_C(String value) throws FoundationException { getAdapt_C().setString(106, value); }
		public void setSCDL_DLV_DATE_24_C(String value) throws FoundationException { getAdapt_C().setString(107, value); }
		public void setSCDL_DLV_QTY_24_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(108, null);
			} else {
				getAdapt_C().setDouble(108, value);
			}
		}
		public void setDLV_CD_24_C(String value) throws FoundationException { getAdapt_C().setString(109, value); }
		public void setSCDL_DLV_DATE_25_C(String value) throws FoundationException { getAdapt_C().setString(110, value); }
		public void setSCDL_DLV_QTY_25_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(111, null);
			} else {
				getAdapt_C().setDouble(111, value);
			}
		}
		public void setDLV_CD_25_C(String value) throws FoundationException { getAdapt_C().setString(112, value); }
		public void setSCDL_DLV_DATE_26_C(String value) throws FoundationException { getAdapt_C().setString(113, value); }
		public void setSCDL_DLV_QTY_26_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(114, null);
			} else {
				getAdapt_C().setDouble(114, value);
			}
		}
		public void setDLV_CD_26_C(String value) throws FoundationException { getAdapt_C().setString(115, value); }
		public void setSCDL_DLV_DATE_27_C(String value) throws FoundationException { getAdapt_C().setString(116, value); }
		public void setSCDL_DLV_QTY_27_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(117, null);
			} else {
				getAdapt_C().setDouble(117, value);
			}
		}
		public void setDLV_CD_27_C(String value) throws FoundationException { getAdapt_C().setString(118, value); }
		public void setSCDL_DLV_DATE_28_C(String value) throws FoundationException { getAdapt_C().setString(119, value); }
		public void setSCDL_DLV_QTY_28_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(120, null);
			} else {
				getAdapt_C().setDouble(120, value);
			}
		}
		public void setDLV_CD_28_C(String value) throws FoundationException { getAdapt_C().setString(121, value); }
		public void setSCDL_DLV_DATE_29_C(String value) throws FoundationException { getAdapt_C().setString(122, value); }
		public void setSCDL_DLV_QTY_29_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(123, null);
			} else {
				getAdapt_C().setDouble(123, value);
			}
		}
		public void setDLV_CD_29_C(String value) throws FoundationException { getAdapt_C().setString(124, value); }
		public void setSCDL_DLV_DATE_30_C(String value) throws FoundationException { getAdapt_C().setString(125, value); }
		public void setSCDL_DLV_QTY_30_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(126, null);
			} else {
				getAdapt_C().setDouble(126, value);
			}
		}
		public void setDLV_CD_30_C(String value) throws FoundationException { getAdapt_C().setString(127, value); }
		public void setSCDL_DLV_DATE_31_C(String value) throws FoundationException { getAdapt_C().setString(128, value); }
		public void setSCDL_DLV_QTY_31_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(129, null);
			} else {
				getAdapt_C().setDouble(129, value);
			}
		}
		public void setDLV_CD_31_C(String value) throws FoundationException { getAdapt_C().setString(130, value); }
		public void setFREE_TEXT_C(String value) throws FoundationException { getAdapt_C().setString(131, value); }
		public void setREMARKS_C(String value) throws FoundationException { getAdapt_C().setString(132, value); }
		public void setTAX_TYP_C(String value) throws FoundationException { getAdapt_C().setString(133, value); }
		public void setCUST_TAXATION_TYP_C(String value) throws FoundationException { getAdapt_C().setString(134, value); }
		public void setTAX_AMOUNT_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(135, null);
			} else {
				getAdapt_C().setDouble(135, value);
			}
		}
		public void setCUST_TOTAL_AMOUNT_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(136, null);
			} else {
				getAdapt_C().setDouble(136, value);
			}
		}
		public void setUNCONFIRM_ODR_CD_C(String value) throws FoundationException { getAdapt_C().setString(137, value); }
		public void setUNCONFIRM_ODR_DATE_C(String value) throws FoundationException { getAdapt_C().setString(138, value); }
		public void setUNCONFIRM_ODR_QTY_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(139, null);
			} else {
				getAdapt_C().setDouble(139, value);
			}
		}
		public void setUNCONFIRM_ODR_AMOUNT_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(140, null);
			} else {
				getAdapt_C().setDouble(140, value);
			}
		}
		public void setESTIMATE_REQST_CD_C(String value) throws FoundationException { getAdapt_C().setString(141, value); }
		public void setSTL_COND_CD_C(String value) throws FoundationException { getAdapt_C().setString(142, value); }
		public void setEND_USER_NAME_C(String value) throws FoundationException { getAdapt_C().setString(143, value); }
		public void setDLV_ZIP_CD_C(String value) throws FoundationException { getAdapt_C().setString(144, value); }
		public void setDLV_ADDRESS_C(String value) throws FoundationException { getAdapt_C().setString(145, value); }
		public void setDLV_ADDRESSEE_C(String value) throws FoundationException { getAdapt_C().setString(146, value); }
		public void setCUST_COMM_SUBNAME_C(String value) throws FoundationException { getAdapt_C().setString(147, value); }
		public void setCUST_COMM_SUBCD_C(String value) throws FoundationException { getAdapt_C().setString(148, value); }
		public void setEND_USER_ODR_CD_C(String value) throws FoundationException { getAdapt_C().setString(149, value); }
		public void setCUST_DESINATED_MAKER_C(String value) throws FoundationException { getAdapt_C().setString(150, value); }
		public void setDLV_KEY_NO_1_C(String value) throws FoundationException { getAdapt_C().setString(151, value); }
		public void setDLV_KEY_NO_2_C(String value) throws FoundationException { getAdapt_C().setString(152, value); }
		public void setDLV_KEY_NO_3_C(String value) throws FoundationException { getAdapt_C().setString(153, value); }
		public void setDLV_KEY_NO_4_C(String value) throws FoundationException { getAdapt_C().setString(154, value); }
		public void setDLV_KEY_NO_5_C(String value) throws FoundationException { getAdapt_C().setString(155, value); }
		public void setDLV_KEY_NO_6_C(String value) throws FoundationException { getAdapt_C().setString(156, value); }
		public void setDLV_KEY_NO_7_C(String value) throws FoundationException { getAdapt_C().setString(157, value); }
		public void setDLV_KEY_NO_8_C(String value) throws FoundationException { getAdapt_C().setString(158, value); }
		public void setDLV_KEY_NO_9_C(String value) throws FoundationException { getAdapt_C().setString(159, value); }
		public void setDLV_KEY_NO_10_C(String value) throws FoundationException { getAdapt_C().setString(160, value); }
		public void setDLV_KEY_NO_11_C(String value) throws FoundationException { getAdapt_C().setString(161, value); }
		public void setDLV_KEY_NO_12_C(String value) throws FoundationException { getAdapt_C().setString(162, value); }
		public void setDLV_KEY_NO_13_C(String value) throws FoundationException { getAdapt_C().setString(163, value); }
		public void setDLV_KEY_NO_14_C(String value) throws FoundationException { getAdapt_C().setString(164, value); }
		public void setDLV_KEY_NO_15_C(String value) throws FoundationException { getAdapt_C().setString(165, value); }
		public void setDLV_KEY_NO_16_C(String value) throws FoundationException { getAdapt_C().setString(166, value); }
		public void setDLV_KEY_NO_17_C(String value) throws FoundationException { getAdapt_C().setString(167, value); }
		public void setDLV_KEY_NO_18_C(String value) throws FoundationException { getAdapt_C().setString(168, value); }
		public void setDLV_KEY_NO_19_C(String value) throws FoundationException { getAdapt_C().setString(169, value); }
		public void setDLV_KEY_NO_20_C(String value) throws FoundationException { getAdapt_C().setString(170, value); }
		public void setDLV_KEY_NO_21_C(String value) throws FoundationException { getAdapt_C().setString(171, value); }
		public void setDLV_KEY_NO_22_C(String value) throws FoundationException { getAdapt_C().setString(172, value); }
		public void setDLV_KEY_NO_23_C(String value) throws FoundationException { getAdapt_C().setString(173, value); }
		public void setDLV_KEY_NO_24_C(String value) throws FoundationException { getAdapt_C().setString(174, value); }
		public void setDLV_KEY_NO_25_C(String value) throws FoundationException { getAdapt_C().setString(175, value); }
		public void setDLV_KEY_NO_26_C(String value) throws FoundationException { getAdapt_C().setString(176, value); }
		public void setDLV_KEY_NO_27_C(String value) throws FoundationException { getAdapt_C().setString(177, value); }
		public void setDLV_KEY_NO_28_C(String value) throws FoundationException { getAdapt_C().setString(178, value); }
		public void setDLV_KEY_NO_29_C(String value) throws FoundationException { getAdapt_C().setString(179, value); }
		public void setDLV_KEY_NO_30_C(String value) throws FoundationException { getAdapt_C().setString(180, value); }
		public void setDLV_KEY_NO_31_C(String value) throws FoundationException { getAdapt_C().setString(181, value); }
		public void setDLV_LOC_NAME_C(String value) throws FoundationException { getAdapt_C().setString(182, value); }
		public void setCLIENT_BARCODE_INF_C(String value) throws FoundationException { getAdapt_C().setString(183, value); }
		public void setCLIENT_REMARK_C(String value) throws FoundationException { getAdapt_C().setString(184, value); }
		public void setCONTRACT_COND_TYP_C(String value) throws FoundationException { getAdapt_C().setString(185, value); }
		public void setPUCH_ODR_SHAP_TYP_C(String value) throws FoundationException { getAdapt_C().setString(186, value); }
		public void setMASTER_PUCH_ODR_CD_C(String value) throws FoundationException { getAdapt_C().setString(187, value); }
		public void setQTY_CONTRACT_TYP_C(String value) throws FoundationException { getAdapt_C().setString(188, value); }
		public void setODR_MODIFICATION_TYP_1_C(String value) throws FoundationException { getAdapt_C().setString(189, value); }
		public void setODR_MODIFICATION_TYP_2_C(String value) throws FoundationException { getAdapt_C().setString(190, value); }
		public void setODR_MODIFICATION_TYP_3_C(String value) throws FoundationException { getAdapt_C().setString(191, value); }
		public void setMACHINE_TYP_CD_C(String value) throws FoundationException { getAdapt_C().setString(192, value); }
		public void setENGINNERING_CHG_CD_C(String value) throws FoundationException { getAdapt_C().setString(193, value); }
		public void setDROW_SPEC_CD_C(String value) throws FoundationException { getAdapt_C().setString(194, value); }
		public void setDLV_DOC_FORM_1_C(String value) throws FoundationException { getAdapt_C().setString(195, value); }
		public void setDLV_DOC_COPY_NUM_1_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(196, null);
			} else {
				getAdapt_C().setDouble(196, value);
			}
		}
		public void setDLV_DOC_LANG_1_C(String value) throws FoundationException { getAdapt_C().setString(197, value); }
		public void setDLV_DOC_FORM_2_C(String value) throws FoundationException { getAdapt_C().setString(198, value); }
		public void setDLV_DOC_COPY_NUM_2_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(199, null);
			} else {
				getAdapt_C().setDouble(199, value);
			}
		}
		public void setDLV_DOC_LANG_2_C(String value) throws FoundationException { getAdapt_C().setString(200, value); }
		public void setDLV_DOC_FORM_3_C(String value) throws FoundationException { getAdapt_C().setString(201, value); }
		public void setDLV_DOC_COPY_NUM_3_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(202, null);
			} else {
				getAdapt_C().setDouble(202, value);
			}
		}
		public void setDLV_DOC_LANG_3_C(String value) throws FoundationException { getAdapt_C().setString(203, value); }
		public void setDLV_DOC_FORM_4_C(String value) throws FoundationException { getAdapt_C().setString(204, value); }
		public void setDLV_DOC_COPY_NUM_4_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(205, null);
			} else {
				getAdapt_C().setDouble(205, value);
			}
		}
		public void setDLV_DOC_LANG_4_C(String value) throws FoundationException { getAdapt_C().setString(206, value); }
		public void setSTRATEGIC_GOODS_TYP_C(String value) throws FoundationException { getAdapt_C().setString(207, value); }
		public void setORGN_PLACE_CD_1_C(String value) throws FoundationException { getAdapt_C().setString(208, value); }
		public void setORGN_PLACE_CD_2_C(String value) throws FoundationException { getAdapt_C().setString(209, value); }
		public void setORGN_PLACE_CD_3_C(String value) throws FoundationException { getAdapt_C().setString(210, value); }
		public void setORGN_PLACE_CD_4_C(String value) throws FoundationException { getAdapt_C().setString(211, value); }
		public void setORGN_PLACE_CD_5_C(String value) throws FoundationException { getAdapt_C().setString(212, value); }
		public void setDLV_TIME_1_C(String value) throws FoundationException { getAdapt_C().setString(213, value); }
		public void setDLV_TIME_2_C(String value) throws FoundationException { getAdapt_C().setString(214, value); }
		public void setDLV_TIME_3_C(String value) throws FoundationException { getAdapt_C().setString(215, value); }
		public void setDLV_TIME_4_C(String value) throws FoundationException { getAdapt_C().setString(216, value); }
		public void setDLV_TIME_5_C(String value) throws FoundationException { getAdapt_C().setString(217, value); }
		public void setDLV_TIME_6_C(String value) throws FoundationException { getAdapt_C().setString(218, value); }
		public void setDLV_TIME_7_C(String value) throws FoundationException { getAdapt_C().setString(219, value); }
		public void setDLV_TIME_8_C(String value) throws FoundationException { getAdapt_C().setString(220, value); }
		public void setDLV_TIME_9_C(String value) throws FoundationException { getAdapt_C().setString(221, value); }
		public void setDLV_TIME_10_C(String value) throws FoundationException { getAdapt_C().setString(222, value); }
		public void setDLV_TIME_11_C(String value) throws FoundationException { getAdapt_C().setString(223, value); }
		public void setDLV_TIME_12_C(String value) throws FoundationException { getAdapt_C().setString(224, value); }
		public void setDLV_TIME_13_C(String value) throws FoundationException { getAdapt_C().setString(225, value); }
		public void setDLV_TIME_14_C(String value) throws FoundationException { getAdapt_C().setString(226, value); }
		public void setDLV_TIME_15_C(String value) throws FoundationException { getAdapt_C().setString(227, value); }
		public void setDLV_TIME_16_C(String value) throws FoundationException { getAdapt_C().setString(228, value); }
		public void setDLV_TIME_17_C(String value) throws FoundationException { getAdapt_C().setString(229, value); }
		public void setDLV_TIME_18_C(String value) throws FoundationException { getAdapt_C().setString(230, value); }
		public void setDLV_TIME_19_C(String value) throws FoundationException { getAdapt_C().setString(231, value); }
		public void setDLV_TIME_20_C(String value) throws FoundationException { getAdapt_C().setString(232, value); }
		public void setDLV_TIME_21_C(String value) throws FoundationException { getAdapt_C().setString(233, value); }
		public void setDLV_TIME_22_C(String value) throws FoundationException { getAdapt_C().setString(234, value); }
		public void setDLV_TIME_23_C(String value) throws FoundationException { getAdapt_C().setString(235, value); }
		public void setDLV_TIME_24_C(String value) throws FoundationException { getAdapt_C().setString(236, value); }
		public void setDLV_TIME_25_C(String value) throws FoundationException { getAdapt_C().setString(237, value); }
		public void setDLV_TIME_26_C(String value) throws FoundationException { getAdapt_C().setString(238, value); }
		public void setDLV_TIME_27_C(String value) throws FoundationException { getAdapt_C().setString(239, value); }
		public void setDLV_TIME_28_C(String value) throws FoundationException { getAdapt_C().setString(240, value); }
		public void setDLV_TIME_29_C(String value) throws FoundationException { getAdapt_C().setString(241, value); }
		public void setDLV_TIME_30_C(String value) throws FoundationException { getAdapt_C().setString(242, value); }
		public void setDLV_TIME_31_C(String value) throws FoundationException { getAdapt_C().setString(243, value); }
		public void setPACKAGE_DLV_CD_C(String value) throws FoundationException { getAdapt_C().setString(244, value); }
		public void setSPEC_C(String value) throws FoundationException { getAdapt_C().setString(245, value); }
		public void setBUYER_ORG_NAME_C(String value) throws FoundationException { getAdapt_C().setString(246, value); }
		public void setDLV_PART_LEN_1_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(247, null);
			} else {
				getAdapt_C().setDouble(247, value);
			}
		}
		public void setDLV_PART_QTY_1_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(248, null);
			} else {
				getAdapt_C().setDouble(248, value);
			}
		}
		public void setDLV_PART_LEN_2_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(249, null);
			} else {
				getAdapt_C().setDouble(249, value);
			}
		}
		public void setDLV_PART_QTY_2_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(250, null);
			} else {
				getAdapt_C().setDouble(250, value);
			}
		}
		public void setDLV_PART_LEN_3_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(251, null);
			} else {
				getAdapt_C().setDouble(251, value);
			}
		}
		public void setDLV_PART_QTY_3_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(252, null);
			} else {
				getAdapt_C().setDouble(252, value);
			}
		}
		public void setDLV_PART_LEN_4_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(253, null);
			} else {
				getAdapt_C().setDouble(253, value);
			}
		}
		public void setDLV_PART_QTY_4_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(254, null);
			} else {
				getAdapt_C().setDouble(254, value);
			}
		}
		public void setDLV_PART_LEN_5_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(255, null);
			} else {
				getAdapt_C().setDouble(255, value);
			}
		}
		public void setDLV_PART_QTY_5_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(256, null);
			} else {
				getAdapt_C().setDouble(256, value);
			}
		}
		public void setDLV_PART_LEN_6_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(257, null);
			} else {
				getAdapt_C().setDouble(257, value);
			}
		}
		public void setDLV_PART_QTY_6_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(258, null);
			} else {
				getAdapt_C().setDouble(258, value);
			}
		}
		public void setDLV_PART_LEN_7_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(259, null);
			} else {
				getAdapt_C().setDouble(259, value);
			}
		}
		public void setDLV_PART_QTY_7_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(260, null);
			} else {
				getAdapt_C().setDouble(260, value);
			}
		}
		public void setDLV_PART_LEN_8_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(261, null);
			} else {
				getAdapt_C().setDouble(261, value);
			}
		}
		public void setDLV_PART_QTY_8_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(262, null);
			} else {
				getAdapt_C().setDouble(262, value);
			}
		}
		public void setDLV_PART_LEN_9_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(263, null);
			} else {
				getAdapt_C().setDouble(263, value);
			}
		}
		public void setDLV_PART_QTY_9_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(264, null);
			} else {
				getAdapt_C().setDouble(264, value);
			}
		}
		public void setDLV_PART_LEN_10_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(265, null);
			} else {
				getAdapt_C().setDouble(265, value);
			}
		}
		public void setDLV_PART_QTY_10_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(266, null);
			} else {
				getAdapt_C().setDouble(266, value);
			}
		}
		public void setDLV_PART_UNIT_C(String value) throws FoundationException { getAdapt_C().setString(267, value); }
		public void setCUST_CONSTRUCT_NAME_C(String value) throws FoundationException { getAdapt_C().setString(268, value); }
		public void setMATERIAL_CD_C(String value) throws FoundationException { getAdapt_C().setString(269, value); }
		public void setMATERIAL_UNIT_PRICE_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(270, null);
			} else {
				getAdapt_C().setDouble(270, value);
			}
		}
		public void setMATERIAL_UNIT_C(String value) throws FoundationException { getAdapt_C().setString(271, value); }
		public void setTEST_REPORT_NEED_TYP_C(String value) throws FoundationException { getAdapt_C().setString(272, value); }
		public void setTEST_REPORT_CHK_TYP_C(String value) throws FoundationException { getAdapt_C().setString(273, value); }
		public void setTEST_REPORT_PRESENT_TYP_C(String value) throws FoundationException { getAdapt_C().setString(274, value); }
		public void setMUNICIPAL_CD_C(String value) throws FoundationException { getAdapt_C().setString(275, value); }
		public void setDLV_CONTACT_TEL_C(String value) throws FoundationException { getAdapt_C().setString(276, value); }
		public void setSLIP_PRICE_PRINT_TYP_C(String value) throws FoundationException { getAdapt_C().setString(277, value); }
		public void setBUYER_NAME_KANJI_C(String value) throws FoundationException { getAdapt_C().setString(278, value); }
		public void setSPEC_KANJI_C(String value) throws FoundationException { getAdapt_C().setString(279, value); }
		public void setITEM_NAME_KANJI_C(String value) throws FoundationException { getAdapt_C().setString(280, value); }
		public void setREMARKS_KANJI_C(String value) throws FoundationException { getAdapt_C().setString(281, value); }
		public void setEND_USER_NAME_KANJI_C(String value) throws FoundationException { getAdapt_C().setString(282, value); }
		public void setDLV_ADDRESS_KANJI_C(String value) throws FoundationException { getAdapt_C().setString(283, value); }
		public void setDLV_ADDRESSEE_KANJI_C(String value) throws FoundationException { getAdapt_C().setString(284, value); }
		public void setEND_USER_ITEM_NAME_KANJI_C(String value) throws FoundationException { getAdapt_C().setString(285, value); }
		public void setCUST_DESINATED_MAKER_KANJI_C(String value) throws FoundationException { getAdapt_C().setString(286, value); }
		public void setDLV_LOC_NAME_KANJI_C(String value) throws FoundationException { getAdapt_C().setString(287, value); }
		public void setCLIENT_REMARK_KANJI_C(String value) throws FoundationException { getAdapt_C().setString(288, value); }
		public void setMACHINE_TYPE_NAME_KANJI_C(String value) throws FoundationException { getAdapt_C().setString(289, value); }
		public void setCUST_SPC_KANJI_C(String value) throws FoundationException { getAdapt_C().setString(290, value); }
		public void setBUYER_ORG_NAME_KANJI_C(String value) throws FoundationException { getAdapt_C().setString(291, value); }
		public void setCUST_CONSTRUCT_NAME_KANJI_C(String value) throws FoundationException { getAdapt_C().setString(292, value); }
		public void setCUR_CD_C(String value) throws FoundationException { getAdapt_C().setString(293, value); }
		public void setUNIT_PRICE_EXCH_RATES_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(294, null);
			} else {
				getAdapt_C().setDouble(294, value);
			}
		}
		public void setODR_AMOUNT_EXCH_RATES_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(295, null);
			} else {
				getAdapt_C().setDouble(295, value);
			}
		}
		public void setTAX_AMOUNT_EXCH_RATES_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(296, null);
			} else {
				getAdapt_C().setDouble(296, value);
			}
		}
		public void setTOTAL_AMOUNT_EXCH_RATES_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(297, null);
			} else {
				getAdapt_C().setDouble(297, value);
			}
		}
		public void setUNCONFIRM_AMOUNT_EXCH_RATES_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(298, null);
			} else {
				getAdapt_C().setDouble(298, value);
			}
		}
		public void setMATERIAL_CD_EXCH_RATES_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(299, null);
			} else {
				getAdapt_C().setDouble(299, value);
			}
		}
		public void setPLANNING_ODR_CD_C(String value) throws FoundationException { getAdapt_C().setString(300, value); }
		public void setPLANNING_ODR_DATE_C(String value) throws FoundationException { getAdapt_C().setString(301, value); }
		public void setSTANDARD_DLV_TERM_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(302, null);
			} else {
				getAdapt_C().setDouble(302, value);
			}
		}
		public void setREQUIRED_TERM_C(Double value) throws FoundationException {
			if (value == null) {
				getAdapt_C().setString(303, null);
			} else {
				getAdapt_C().setDouble(303, value);
			}
		}

		public int create() throws BatchAppException
		{
			try {
				getAdapt_C().setString(1, m_med.getSysdate());
				getAdapt_C().setString(2, m_med.getUsername());
				getAdapt_C().setString(3, m_med.getProgname());
				getAdapt_C().setString(4, m_med.getSysdate());
				getAdapt_C().setString(5, m_med.getUsername());
				getAdapt_C().setString(6, m_med.getProgname());
				setODR_INFO_IF_CTRL_NO_C(m_med.getODR_INFO_IF_CTRL_NO());
				setDATA_PROC_CD_C(m_med.getDATA_PROC_CD());
				setINFO_TYP_CD_C(m_med.getINFO_TYP_CD());
				setDATA_CREATED_DATE_C(m_med.getDATA_CREATED_DATE());
				setCLIENT_CD_C(m_med.getCLIENT_CD());
				setTRUSTEE_CD_C(m_med.getTRUSTEE_CD());
				setBUYER_ORG_CD_C(m_med.getBUYER_ORG_CD());
				setPUCH_ODR_CD_C(m_med.getPUCH_ODR_CD());
				setPRDCT_ODR_CD_C(m_med.getPRDCT_ODR_CD());
				setMODIFICATION_CODE_C(m_med.getMODIFICATION_CODE());
				setCOCK_TYP_C(m_med.getCOCK_TYP());
				setPUCH_ODR_DATE_C(m_med.getPUCH_ODR_DATE());
				setUNIT_C(m_med.getUNIT());
				setUNIT_PRICE_C(m_med.getUNIT_PRICE());
				setPRICE_TYP_C(m_med.getPRICE_TYP());
				setPUCH_ODR_QTY_C(m_med.getPUCH_ODR_QTY());
				setPUCH_ODR_AMOUNT_C(m_med.getPUCH_ODR_AMOUNT());
				setCONS_TYP_C(m_med.getCONS_TYP());
				setBUYER_NAME_C(m_med.getBUYER_NAME());
				setMATR_SPEC_SIZE_C(m_med.getMATR_SPEC_SIZE());
				setSPECTP_C(m_med.getSPECTP());
				setDROWING_EDITION_C(m_med.getDROWING_EDITION());
				setPART_NAME_C(m_med.getPART_NAME());
				setOWN_ITEM_CD_C(m_med.getOWN_ITEM_CD());
				setCUST_ITEM_CD_C(m_med.getCUST_ITEM_CD());
				setDROW_SPEC_QTY_C(m_med.getDROW_SPEC_QTY());
				setPKG_UNIT_C(m_med.getPKG_UNIT());
				setDIRECT_DLV_TYP_C(m_med.getDIRECT_DLV_TYP());
				setDLV_LOC_CD_C(m_med.getDLV_LOC_CD());
				setINSPC_TYP_C(m_med.getINSPC_TYP());
				setDLV_INST_TYP_C(m_med.getDLV_INST_TYP());
				setSCDL_DLV_DATE_1_C(m_med.getSCDL_DLV_DATE_1());
				setSCDL_DLV_QTY_1_C(m_med.getSCDL_DLV_QTY_1());
				setDLV_CD_1_C(m_med.getDLV_CD_1());
				setSCDL_DLV_DATE_2_C(m_med.getSCDL_DLV_DATE_2());
				setSCDL_DLV_QTY_2_C(m_med.getSCDL_DLV_QTY_2());
				setDLV_CD_2_C(m_med.getDLV_CD_2());
				setSCDL_DLV_DATE_3_C(m_med.getSCDL_DLV_DATE_3());
				setSCDL_DLV_QTY_3_C(m_med.getSCDL_DLV_QTY_3());
				setDLV_CD_3_C(m_med.getDLV_CD_3());
				setSCDL_DLV_DATE_4_C(m_med.getSCDL_DLV_DATE_4());
				setSCDL_DLV_QTY_4_C(m_med.getSCDL_DLV_QTY_4());
				setDLV_CD_4_C(m_med.getDLV_CD_4());
				setSCDL_DLV_DATE_5_C(m_med.getSCDL_DLV_DATE_5());
				setSCDL_DLV_QTY_5_C(m_med.getSCDL_DLV_QTY_5());
				setDLV_CD_5_C(m_med.getDLV_CD_5());
				setSCDL_DLV_DATE_6_C(m_med.getSCDL_DLV_DATE_6());
				setSCDL_DLV_QTY_6_C(m_med.getSCDL_DLV_QTY_6());
				setDLV_CD_6_C(m_med.getDLV_CD_6());
				setSCDL_DLV_DATE_7_C(m_med.getSCDL_DLV_DATE_7());
				setSCDL_DLV_QTY_7_C(m_med.getSCDL_DLV_QTY_7());
				setDLV_CD_7_C(m_med.getDLV_CD_7());
				setSCDL_DLV_DATE_8_C(m_med.getSCDL_DLV_DATE_8());
				setSCDL_DLV_QTY_8_C(m_med.getSCDL_DLV_QTY_8());
				setDLV_CD_8_C(m_med.getDLV_CD_8());
				setSCDL_DLV_DATE_9_C(m_med.getSCDL_DLV_DATE_9());
				setSCDL_DLV_QTY_9_C(m_med.getSCDL_DLV_QTY_9());
				setDLV_CD_9_C(m_med.getDLV_CD_9());
				setSCDL_DLV_DATE_10_C(m_med.getSCDL_DLV_DATE_10());
				setSCDL_DLV_QTY_10_C(m_med.getSCDL_DLV_QTY_10());
				setDLV_CD_10_C(m_med.getDLV_CD_10());
				setSCDL_DLV_DATE_11_C(m_med.getSCDL_DLV_DATE_11());
				setSCDL_DLV_QTY_11_C(m_med.getSCDL_DLV_QTY_11());
				setDLV_CD_11_C(m_med.getDLV_CD_11());
				setSCDL_DLV_DATE_12_C(m_med.getSCDL_DLV_DATE_12());
				setSCDL_DLV_QTY_12_C(m_med.getSCDL_DLV_QTY_12());
				setDLV_CD_12_C(m_med.getDLV_CD_12());
				setSCDL_DLV_DATE_13_C(m_med.getSCDL_DLV_DATE_13());
				setSCDL_DLV_QTY_13_C(m_med.getSCDL_DLV_QTY_13());
				setDLV_CD_13_C(m_med.getDLV_CD_13());
				setSCDL_DLV_DATE_14_C(m_med.getSCDL_DLV_DATE_14());
				setSCDL_DLV_QTY_14_C(m_med.getSCDL_DLV_QTY_14());
				setDLV_CD_14_C(m_med.getDLV_CD_14());
				setSCDL_DLV_DATE_15_C(m_med.getSCDL_DLV_DATE_15());
				setSCDL_DLV_QTY_15_C(m_med.getSCDL_DLV_QTY_15());
				setDLV_CD_15_C(m_med.getDLV_CD_15());
				setSCDL_DLV_DATE_16_C(m_med.getSCDL_DLV_DATE_16());
				setSCDL_DLV_QTY_16_C(m_med.getSCDL_DLV_QTY_16());
				setDLV_CD_16_C(m_med.getDLV_CD_16());
				setSCDL_DLV_DATE_17_C(m_med.getSCDL_DLV_DATE_17());
				setSCDL_DLV_QTY_17_C(m_med.getSCDL_DLV_QTY_17());
				setDLV_CD_17_C(m_med.getDLV_CD_17());
				setSCDL_DLV_DATE_18_C(m_med.getSCDL_DLV_DATE_18());
				setSCDL_DLV_QTY_18_C(m_med.getSCDL_DLV_QTY_18());
				setDLV_CD_18_C(m_med.getDLV_CD_18());
				setSCDL_DLV_DATE_19_C(m_med.getSCDL_DLV_DATE_19());
				setSCDL_DLV_QTY_19_C(m_med.getSCDL_DLV_QTY_19());
				setDLV_CD_19_C(m_med.getDLV_CD_19());
				setSCDL_DLV_DATE_20_C(m_med.getSCDL_DLV_DATE_20());
				setSCDL_DLV_QTY_20_C(m_med.getSCDL_DLV_QTY_20());
				setDLV_CD_20_C(m_med.getDLV_CD_20());
				setSCDL_DLV_DATE_21_C(m_med.getSCDL_DLV_DATE_21());
				setSCDL_DLV_QTY_21_C(m_med.getSCDL_DLV_QTY_21());
				setDLV_CD_21_C(m_med.getDLV_CD_21());
				setSCDL_DLV_DATE_22_C(m_med.getSCDL_DLV_DATE_22());
				setSCDL_DLV_QTY_22_C(m_med.getSCDL_DLV_QTY_22());
				setDLV_CD_22_C(m_med.getDLV_CD_22());
				setSCDL_DLV_DATE_23_C(m_med.getSCDL_DLV_DATE_23());
				setSCDL_DLV_QTY_23_C(m_med.getSCDL_DLV_QTY_23());
				setDLV_CD_23_C(m_med.getDLV_CD_23());
				setSCDL_DLV_DATE_24_C(m_med.getSCDL_DLV_DATE_24());
				setSCDL_DLV_QTY_24_C(m_med.getSCDL_DLV_QTY_24());
				setDLV_CD_24_C(m_med.getDLV_CD_24());
				setSCDL_DLV_DATE_25_C(m_med.getSCDL_DLV_DATE_25());
				setSCDL_DLV_QTY_25_C(m_med.getSCDL_DLV_QTY_25());
				setDLV_CD_25_C(m_med.getDLV_CD_25());
				setSCDL_DLV_DATE_26_C(m_med.getSCDL_DLV_DATE_26());
				setSCDL_DLV_QTY_26_C(m_med.getSCDL_DLV_QTY_26());
				setDLV_CD_26_C(m_med.getDLV_CD_26());
				setSCDL_DLV_DATE_27_C(m_med.getSCDL_DLV_DATE_27());
				setSCDL_DLV_QTY_27_C(m_med.getSCDL_DLV_QTY_27());
				setDLV_CD_27_C(m_med.getDLV_CD_27());
				setSCDL_DLV_DATE_28_C(m_med.getSCDL_DLV_DATE_28());
				setSCDL_DLV_QTY_28_C(m_med.getSCDL_DLV_QTY_28());
				setDLV_CD_28_C(m_med.getDLV_CD_28());
				setSCDL_DLV_DATE_29_C(m_med.getSCDL_DLV_DATE_29());
				setSCDL_DLV_QTY_29_C(m_med.getSCDL_DLV_QTY_29());
				setDLV_CD_29_C(m_med.getDLV_CD_29());
				setSCDL_DLV_DATE_30_C(m_med.getSCDL_DLV_DATE_30());
				setSCDL_DLV_QTY_30_C(m_med.getSCDL_DLV_QTY_30());
				setDLV_CD_30_C(m_med.getDLV_CD_30());
				setSCDL_DLV_DATE_31_C(m_med.getSCDL_DLV_DATE_31());
				setSCDL_DLV_QTY_31_C(m_med.getSCDL_DLV_QTY_31());
				setDLV_CD_31_C(m_med.getDLV_CD_31());
				setFREE_TEXT_C(m_med.getFREE_TEXT());
				setREMARKS_C(m_med.getREMARKS());
				setTAX_TYP_C(m_med.getTAX_TYP());
				setCUST_TAXATION_TYP_C(m_med.getCUST_TAXATION_TYP());
				setTAX_AMOUNT_C(m_med.getTAX_AMOUNT());
				setCUST_TOTAL_AMOUNT_C(m_med.getCUST_TOTAL_AMOUNT());
				setUNCONFIRM_ODR_CD_C(m_med.getUNCONFIRM_ODR_CD());
				setUNCONFIRM_ODR_DATE_C(m_med.getUNCONFIRM_ODR_DATE());
				setUNCONFIRM_ODR_QTY_C(m_med.getUNCONFIRM_ODR_QTY());
				setUNCONFIRM_ODR_AMOUNT_C(m_med.getUNCONFIRM_ODR_AMOUNT());
				setESTIMATE_REQST_CD_C(m_med.getESTIMATE_REQST_CD());
				setSTL_COND_CD_C(m_med.getSTL_COND_CD());
				setEND_USER_NAME_C(m_med.getEND_USER_NAME());
				setDLV_ZIP_CD_C(m_med.getDLV_ZIP_CD());
				setDLV_ADDRESS_C(m_med.getDLV_ADDRESS());
				setDLV_ADDRESSEE_C(m_med.getDLV_ADDRESSEE());
				setCUST_COMM_SUBNAME_C(m_med.getCUST_COMM_SUBNAME());
				setCUST_COMM_SUBCD_C(m_med.getCUST_COMM_SUBCD());
				setEND_USER_ODR_CD_C(m_med.getEND_USER_ODR_CD());
				setCUST_DESINATED_MAKER_C(m_med.getCUST_DESINATED_MAKER());
				setDLV_KEY_NO_1_C(m_med.getDLV_KEY_NO_1());
				setDLV_KEY_NO_2_C(m_med.getDLV_KEY_NO_2());
				setDLV_KEY_NO_3_C(m_med.getDLV_KEY_NO_3());
				setDLV_KEY_NO_4_C(m_med.getDLV_KEY_NO_4());
				setDLV_KEY_NO_5_C(m_med.getDLV_KEY_NO_5());
				setDLV_KEY_NO_6_C(m_med.getDLV_KEY_NO_6());
				setDLV_KEY_NO_7_C(m_med.getDLV_KEY_NO_7());
				setDLV_KEY_NO_8_C(m_med.getDLV_KEY_NO_8());
				setDLV_KEY_NO_9_C(m_med.getDLV_KEY_NO_9());
				setDLV_KEY_NO_10_C(m_med.getDLV_KEY_NO_10());
				setDLV_KEY_NO_11_C(m_med.getDLV_KEY_NO_11());
				setDLV_KEY_NO_12_C(m_med.getDLV_KEY_NO_12());
				setDLV_KEY_NO_13_C(m_med.getDLV_KEY_NO_13());
				setDLV_KEY_NO_14_C(m_med.getDLV_KEY_NO_14());
				setDLV_KEY_NO_15_C(m_med.getDLV_KEY_NO_15());
				setDLV_KEY_NO_16_C(m_med.getDLV_KEY_NO_16());
				setDLV_KEY_NO_17_C(m_med.getDLV_KEY_NO_17());
				setDLV_KEY_NO_18_C(m_med.getDLV_KEY_NO_18());
				setDLV_KEY_NO_19_C(m_med.getDLV_KEY_NO_19());
				setDLV_KEY_NO_20_C(m_med.getDLV_KEY_NO_20());
				setDLV_KEY_NO_21_C(m_med.getDLV_KEY_NO_21());
				setDLV_KEY_NO_22_C(m_med.getDLV_KEY_NO_22());
				setDLV_KEY_NO_23_C(m_med.getDLV_KEY_NO_23());
				setDLV_KEY_NO_24_C(m_med.getDLV_KEY_NO_24());
				setDLV_KEY_NO_25_C(m_med.getDLV_KEY_NO_25());
				setDLV_KEY_NO_26_C(m_med.getDLV_KEY_NO_26());
				setDLV_KEY_NO_27_C(m_med.getDLV_KEY_NO_27());
				setDLV_KEY_NO_28_C(m_med.getDLV_KEY_NO_28());
				setDLV_KEY_NO_29_C(m_med.getDLV_KEY_NO_29());
				setDLV_KEY_NO_30_C(m_med.getDLV_KEY_NO_30());
				setDLV_KEY_NO_31_C(m_med.getDLV_KEY_NO_31());
				setDLV_LOC_NAME_C(m_med.getDLV_LOC_NAME());
				setCLIENT_BARCODE_INF_C(m_med.getCLIENT_BARCODE_INF());
				setCLIENT_REMARK_C(m_med.getCLIENT_REMARK());
				setCONTRACT_COND_TYP_C(m_med.getCONTRACT_COND_TYP());
				setPUCH_ODR_SHAP_TYP_C(m_med.getPUCH_ODR_SHAP_TYP());
				setMASTER_PUCH_ODR_CD_C(m_med.getMASTER_PUCH_ODR_CD());
				setQTY_CONTRACT_TYP_C(m_med.getQTY_CONTRACT_TYP());
				setODR_MODIFICATION_TYP_1_C(m_med.getODR_MODIFICATION_TYP_1());
				setODR_MODIFICATION_TYP_2_C(m_med.getODR_MODIFICATION_TYP_2());
				setODR_MODIFICATION_TYP_3_C(m_med.getODR_MODIFICATION_TYP_3());
				setMACHINE_TYP_CD_C(m_med.getMACHINE_TYP_CD());
				setENGINNERING_CHG_CD_C(m_med.getENGINNERING_CHG_CD());
				setDROW_SPEC_CD_C(m_med.getDROW_SPEC_CD());
				setDLV_DOC_FORM_1_C(m_med.getDLV_DOC_FORM_1());
				setDLV_DOC_COPY_NUM_1_C(m_med.getDLV_DOC_COPY_NUM_1());
				setDLV_DOC_LANG_1_C(m_med.getDLV_DOC_LANG_1());
				setDLV_DOC_FORM_2_C(m_med.getDLV_DOC_FORM_2());
				setDLV_DOC_COPY_NUM_2_C(m_med.getDLV_DOC_COPY_NUM_2());
				setDLV_DOC_LANG_2_C(m_med.getDLV_DOC_LANG_2());
				setDLV_DOC_FORM_3_C(m_med.getDLV_DOC_FORM_3());
				setDLV_DOC_COPY_NUM_3_C(m_med.getDLV_DOC_COPY_NUM_3());
				setDLV_DOC_LANG_3_C(m_med.getDLV_DOC_LANG_3());
				setDLV_DOC_FORM_4_C(m_med.getDLV_DOC_FORM_4());
				setDLV_DOC_COPY_NUM_4_C(m_med.getDLV_DOC_COPY_NUM_4());
				setDLV_DOC_LANG_4_C(m_med.getDLV_DOC_LANG_4());
				setSTRATEGIC_GOODS_TYP_C(m_med.getSTRATEGIC_GOODS_TYP());
				setORGN_PLACE_CD_1_C(m_med.getORGN_PLACE_CD_1());
				setORGN_PLACE_CD_2_C(m_med.getORGN_PLACE_CD_2());
				setORGN_PLACE_CD_3_C(m_med.getORGN_PLACE_CD_3());
				setORGN_PLACE_CD_4_C(m_med.getORGN_PLACE_CD_4());
				setORGN_PLACE_CD_5_C(m_med.getORGN_PLACE_CD_5());
				setDLV_TIME_1_C(m_med.getDLV_TIME_1());
				setDLV_TIME_2_C(m_med.getDLV_TIME_2());
				setDLV_TIME_3_C(m_med.getDLV_TIME_3());
				setDLV_TIME_4_C(m_med.getDLV_TIME_4());
				setDLV_TIME_5_C(m_med.getDLV_TIME_5());
				setDLV_TIME_6_C(m_med.getDLV_TIME_6());
				setDLV_TIME_7_C(m_med.getDLV_TIME_7());
				setDLV_TIME_8_C(m_med.getDLV_TIME_8());
				setDLV_TIME_9_C(m_med.getDLV_TIME_9());
				setDLV_TIME_10_C(m_med.getDLV_TIME_10());
				setDLV_TIME_11_C(m_med.getDLV_TIME_11());
				setDLV_TIME_12_C(m_med.getDLV_TIME_12());
				setDLV_TIME_13_C(m_med.getDLV_TIME_13());
				setDLV_TIME_14_C(m_med.getDLV_TIME_14());
				setDLV_TIME_15_C(m_med.getDLV_TIME_15());
				setDLV_TIME_16_C(m_med.getDLV_TIME_16());
				setDLV_TIME_17_C(m_med.getDLV_TIME_17());
				setDLV_TIME_18_C(m_med.getDLV_TIME_18());
				setDLV_TIME_19_C(m_med.getDLV_TIME_19());
				setDLV_TIME_20_C(m_med.getDLV_TIME_20());
				setDLV_TIME_21_C(m_med.getDLV_TIME_21());
				setDLV_TIME_22_C(m_med.getDLV_TIME_22());
				setDLV_TIME_23_C(m_med.getDLV_TIME_23());
				setDLV_TIME_24_C(m_med.getDLV_TIME_24());
				setDLV_TIME_25_C(m_med.getDLV_TIME_25());
				setDLV_TIME_26_C(m_med.getDLV_TIME_26());
				setDLV_TIME_27_C(m_med.getDLV_TIME_27());
				setDLV_TIME_28_C(m_med.getDLV_TIME_28());
				setDLV_TIME_29_C(m_med.getDLV_TIME_29());
				setDLV_TIME_30_C(m_med.getDLV_TIME_30());
				setDLV_TIME_31_C(m_med.getDLV_TIME_31());
				setPACKAGE_DLV_CD_C(m_med.getPACKAGE_DLV_CD());
				setSPEC_C(m_med.getSPEC());
				setBUYER_ORG_NAME_C(m_med.getBUYER_ORG_NAME());
				setDLV_PART_LEN_1_C(m_med.getDLV_PART_LEN_1());
				setDLV_PART_QTY_1_C(m_med.getDLV_PART_QTY_1());
				setDLV_PART_LEN_2_C(m_med.getDLV_PART_LEN_2());
				setDLV_PART_QTY_2_C(m_med.getDLV_PART_QTY_2());
				setDLV_PART_LEN_3_C(m_med.getDLV_PART_LEN_3());
				setDLV_PART_QTY_3_C(m_med.getDLV_PART_QTY_3());
				setDLV_PART_LEN_4_C(m_med.getDLV_PART_LEN_4());
				setDLV_PART_QTY_4_C(m_med.getDLV_PART_QTY_4());
				setDLV_PART_LEN_5_C(m_med.getDLV_PART_LEN_5());
				setDLV_PART_QTY_5_C(m_med.getDLV_PART_QTY_5());
				setDLV_PART_LEN_6_C(m_med.getDLV_PART_LEN_6());
				setDLV_PART_QTY_6_C(m_med.getDLV_PART_QTY_6());
				setDLV_PART_LEN_7_C(m_med.getDLV_PART_LEN_7());
				setDLV_PART_QTY_7_C(m_med.getDLV_PART_QTY_7());
				setDLV_PART_LEN_8_C(m_med.getDLV_PART_LEN_8());
				setDLV_PART_QTY_8_C(m_med.getDLV_PART_QTY_8());
				setDLV_PART_LEN_9_C(m_med.getDLV_PART_LEN_9());
				setDLV_PART_QTY_9_C(m_med.getDLV_PART_QTY_9());
				setDLV_PART_LEN_10_C(m_med.getDLV_PART_LEN_10());
				setDLV_PART_QTY_10_C(m_med.getDLV_PART_QTY_10());
				setDLV_PART_UNIT_C(m_med.getDLV_PART_UNIT());
				setCUST_CONSTRUCT_NAME_C(m_med.getCUST_CONSTRUCT_NAME());
				setMATERIAL_CD_C(m_med.getMATERIAL_CD());
				setMATERIAL_UNIT_PRICE_C(m_med.getMATERIAL_UNIT_PRICE());
				setMATERIAL_UNIT_C(m_med.getMATERIAL_UNIT());
				setTEST_REPORT_NEED_TYP_C(m_med.getTEST_REPORT_NEED_TYP());
				setTEST_REPORT_CHK_TYP_C(m_med.getTEST_REPORT_CHK_TYP());
				setTEST_REPORT_PRESENT_TYP_C(m_med.getTEST_REPORT_PRESENT_TYP());
				setMUNICIPAL_CD_C(m_med.getMUNICIPAL_CD());
				setDLV_CONTACT_TEL_C(m_med.getDLV_CONTACT_TEL());
				setSLIP_PRICE_PRINT_TYP_C(m_med.getSLIP_PRICE_PRINT_TYP());
				setBUYER_NAME_KANJI_C(m_med.getBUYER_NAME_KANJI());
				setSPEC_KANJI_C(m_med.getSPEC_KANJI());
				setITEM_NAME_KANJI_C(m_med.getITEM_NAME_KANJI());
				setREMARKS_KANJI_C(m_med.getREMARKS_KANJI());
				setEND_USER_NAME_KANJI_C(m_med.getEND_USER_NAME_KANJI());
				setDLV_ADDRESS_KANJI_C(m_med.getDLV_ADDRESS_KANJI());
				setDLV_ADDRESSEE_KANJI_C(m_med.getDLV_ADDRESSEE_KANJI());
				setEND_USER_ITEM_NAME_KANJI_C(m_med.getEND_USER_ITEM_NAME_KANJI());
				setCUST_DESINATED_MAKER_KANJI_C(m_med.getCUST_DESINATED_MAKER_KANJI());
				setDLV_LOC_NAME_KANJI_C(m_med.getDLV_LOC_NAME_KANJI());
				setCLIENT_REMARK_KANJI_C(m_med.getCLIENT_REMARK_KANJI());
				setMACHINE_TYPE_NAME_KANJI_C(m_med.getMACHINE_TYPE_NAME_KANJI());
				setCUST_SPC_KANJI_C(m_med.getCUST_SPC_KANJI());
				setBUYER_ORG_NAME_KANJI_C(m_med.getBUYER_ORG_NAME_KANJI());
				setCUST_CONSTRUCT_NAME_KANJI_C(m_med.getCUST_CONSTRUCT_NAME_KANJI());
				setCUR_CD_C(m_med.getCUR_CD());
				setUNIT_PRICE_EXCH_RATES_C(m_med.getUNIT_PRICE_EXCH_RATES());
				setODR_AMOUNT_EXCH_RATES_C(m_med.getODR_AMOUNT_EXCH_RATES());
				setTAX_AMOUNT_EXCH_RATES_C(m_med.getTAX_AMOUNT_EXCH_RATES());
				setTOTAL_AMOUNT_EXCH_RATES_C(m_med.getTOTAL_AMOUNT_EXCH_RATES());
				setUNCONFIRM_AMOUNT_EXCH_RATES_C(m_med.getUNCONFIRM_AMOUNT_EXCH_RATES());
				setMATERIAL_CD_EXCH_RATES_C(m_med.getMATERIAL_CD_EXCH_RATES());
				setPLANNING_ODR_CD_C(m_med.getPLANNING_ODR_CD());
				setPLANNING_ODR_DATE_C(m_med.getPLANNING_ODR_DATE());
				setSTANDARD_DLV_TERM_C(m_med.getSTANDARD_DLV_TERM());
				setREQUIRED_TERM_C(m_med.getREQUIRED_TERM());
			} catch(FoundationException e) {
				BatchAppException be=new BatchAppException("T_ODR_INFO_EDI_IF", "create", "レコード新規追加パラメータ設定処理失敗");
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
	public T_ODR_INFO_EDI_IF(medKV0020B001 med, BatchAppConductor cdr) throws SystemException
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
	public medKV0020B001 m_med=null;

	protected BatchAppConductor m_conductor;

	// interEntityクラスインスタンス
	public interEntity m_entity=new interEntity();

	// 各状態で実行するsql文の定義
	protected static String m_selcmd = null;
	protected static String m_inscmd = "insert into "
+"  T_ODR_INFO_EDI_IF(\"ODR_INFO_IF_CTRL_NO\", \"DATA_PROC_CD\", \"INFO_TYP_CD\", \"DATA_CREATED_DATE\", \"CLIENT_CD\", \"TRUSTEE_CD\", \"BUYER_ORG_CD\", \"PUCH_ODR_CD\", \"PRDCT_ODR_CD\", \"MODIFICATION_CODE\", \"COCK_TYP\", \"PUCH_ODR_DATE\", \"UNIT\", \"UNIT_PRICE\", \"PRICE_TYP\", \"PUCH_ODR_QTY\", \"PUCH_ODR_AMOUNT\", \"CONS_TYP\", \"BUYER_NAME\", \"MATR_SPEC_SIZE\", \"SPECTP\", \"DROWING_EDITION\", \"PART_NAME\", \"OWN_ITEM_CD\", \"CUST_ITEM_CD\", \"DROW_SPEC_QTY\", \"PKG_UNIT\", \"DIRECT_DLV_TYP\", \"DLV_LOC_CD\", \"INSPC_TYP\", \"DLV_INST_TYP\", \"SCDL_DLV_DATE_1\", \"SCDL_DLV_QTY_1\", \"DLV_CD_1\", \"SCDL_DLV_DATE_2\", \"SCDL_DLV_QTY_2\", \"DLV_CD_2\", \"SCDL_DLV_DATE_3\", \"SCDL_DLV_QTY_3\", \"DLV_CD_3\", \"SCDL_DLV_DATE_4\", \"SCDL_DLV_QTY_4\", \"DLV_CD_4\", \"SCDL_DLV_DATE_5\", \"SCDL_DLV_QTY_5\", \"DLV_CD_5\", \"SCDL_DLV_DATE_6\", \"SCDL_DLV_QTY_6\", \"DLV_CD_6\", \"SCDL_DLV_DATE_7\", \"SCDL_DLV_QTY_7\", \"DLV_CD_7\", \"SCDL_DLV_DATE_8\", \"SCDL_DLV_QTY_8\", \"DLV_CD_8\", \"SCDL_DLV_DATE_9\", \"SCDL_DLV_QTY_9\", \"DLV_CD_9\", \"SCDL_DLV_DATE_10\", \"SCDL_DLV_QTY_10\", \"DLV_CD_10\", \"SCDL_DLV_DATE_11\", \"SCDL_DLV_QTY_11\", \"DLV_CD_11\", \"SCDL_DLV_DATE_12\", \"SCDL_DLV_QTY_12\", \"DLV_CD_12\", \"SCDL_DLV_DATE_13\", \"SCDL_DLV_QTY_13\", \"DLV_CD_13\", \"SCDL_DLV_DATE_14\", \"SCDL_DLV_QTY_14\", \"DLV_CD_14\", \"SCDL_DLV_DATE_15\", \"SCDL_DLV_QTY_15\", \"DLV_CD_15\", \"SCDL_DLV_DATE_16\", \"SCDL_DLV_QTY_16\", \"DLV_CD_16\", \"SCDL_DLV_DATE_17\", \"SCDL_DLV_QTY_17\", \"DLV_CD_17\", \"SCDL_DLV_DATE_18\", \"SCDL_DLV_QTY_18\", \"DLV_CD_18\", \"SCDL_DLV_DATE_19\", \"SCDL_DLV_QTY_19\", \"DLV_CD_19\", \"SCDL_DLV_DATE_20\", \"SCDL_DLV_QTY_20\", \"DLV_CD_20\", \"SCDL_DLV_DATE_21\", \"SCDL_DLV_QTY_21\", \"DLV_CD_21\", \"SCDL_DLV_DATE_22\", \"SCDL_DLV_QTY_22\", \"DLV_CD_22\", \"SCDL_DLV_DATE_23\", \"SCDL_DLV_QTY_23\", \"DLV_CD_23\", \"SCDL_DLV_DATE_24\", \"SCDL_DLV_QTY_24\", \"DLV_CD_24\", \"SCDL_DLV_DATE_25\", \"SCDL_DLV_QTY_25\", \"DLV_CD_25\", \"SCDL_DLV_DATE_26\", \"SCDL_DLV_QTY_26\", \"DLV_CD_26\", \"SCDL_DLV_DATE_27\", \"SCDL_DLV_QTY_27\", \"DLV_CD_27\", \"SCDL_DLV_DATE_28\", \"SCDL_DLV_QTY_28\", \"DLV_CD_28\", \"SCDL_DLV_DATE_29\", \"SCDL_DLV_QTY_29\", \"DLV_CD_29\", \"SCDL_DLV_DATE_30\", \"SCDL_DLV_QTY_30\", \"DLV_CD_30\", \"SCDL_DLV_DATE_31\", \"SCDL_DLV_QTY_31\", \"DLV_CD_31\", \"FREE_TEXT\", \"REMARKS\", \"TAX_TYP\", \"CUST_TAXATION_TYP\", \"TAX_AMOUNT\", \"CUST_TOTAL_AMOUNT\", \"UNCONFIRM_ODR_CD\", \"UNCONFIRM_ODR_DATE\", \"UNCONFIRM_ODR_QTY\", \"UNCONFIRM_ODR_AMOUNT\", \"ESTIMATE_REQST_CD\", \"STL_COND_CD\", \"END_USER_NAME\", \"DLV_ZIP_CD\", \"DLV_ADDRESS\", \"DLV_ADDRESSEE\", \"CUST_COMM_SUBNAME\", \"CUST_COMM_SUBCD\", \"END_USER_ODR_CD\", \"CUST_DESINATED_MAKER\", \"DLV_KEY_NO_1\", \"DLV_KEY_NO_2\", \"DLV_KEY_NO_3\", \"DLV_KEY_NO_4\", \"DLV_KEY_NO_5\", \"DLV_KEY_NO_6\", \"DLV_KEY_NO_7\", \"DLV_KEY_NO_8\", \"DLV_KEY_NO_9\", \"DLV_KEY_NO_10\", \"DLV_KEY_NO_11\", \"DLV_KEY_NO_12\", \"DLV_KEY_NO_13\", \"DLV_KEY_NO_14\", \"DLV_KEY_NO_15\", \"DLV_KEY_NO_16\", \"DLV_KEY_NO_17\", \"DLV_KEY_NO_18\", \"DLV_KEY_NO_19\", \"DLV_KEY_NO_20\", \"DLV_KEY_NO_21\", \"DLV_KEY_NO_22\", \"DLV_KEY_NO_23\", \"DLV_KEY_NO_24\", \"DLV_KEY_NO_25\", \"DLV_KEY_NO_26\", \"DLV_KEY_NO_27\", \"DLV_KEY_NO_28\", \"DLV_KEY_NO_29\", \"DLV_KEY_NO_30\", \"DLV_KEY_NO_31\", \"DLV_LOC_NAME\", \"CLIENT_BARCODE_INF\", \"CLIENT_REMARK\", \"CONTRACT_COND_TYP\", \"PUCH_ODR_SHAP_TYP\", \"MASTER_PUCH_ODR_CD\", \"QTY_CONTRACT_TYP\", \"ODR_MODIFICATION_TYP_1\", \"ODR_MODIFICATION_TYP_2\", \"ODR_MODIFICATION_TYP_3\", \"MACHINE_TYP_CD\", \"ENGINNERING_CHG_CD\", \"DROW_SPEC_CD\", \"DLV_DOC_FORM_1\", \"DLV_DOC_COPY_NUM_1\", \"DLV_DOC_LANG_1\", \"DLV_DOC_FORM_2\", \"DLV_DOC_COPY_NUM_2\", \"DLV_DOC_LANG_2\", \"DLV_DOC_FORM_3\", \"DLV_DOC_COPY_NUM_3\", \"DLV_DOC_LANG_3\", \"DLV_DOC_FORM_4\", \"DLV_DOC_COPY_NUM_4\", \"DLV_DOC_LANG_4\", \"STRATEGIC_GOODS_TYP\", \"ORGN_PLACE_CD_1\", \"ORGN_PLACE_CD_2\", \"ORGN_PLACE_CD_3\", \"ORGN_PLACE_CD_4\", \"ORGN_PLACE_CD_5\", \"DLV_TIME_1\", \"DLV_TIME_2\", \"DLV_TIME_3\", \"DLV_TIME_4\", \"DLV_TIME_5\", \"DLV_TIME_6\", \"DLV_TIME_7\", \"DLV_TIME_8\", \"DLV_TIME_9\", \"DLV_TIME_10\", \"DLV_TIME_11\", \"DLV_TIME_12\", \"DLV_TIME_13\", \"DLV_TIME_14\", \"DLV_TIME_15\", \"DLV_TIME_16\", \"DLV_TIME_17\", \"DLV_TIME_18\", \"DLV_TIME_19\", \"DLV_TIME_20\", \"DLV_TIME_21\", \"DLV_TIME_22\", \"DLV_TIME_23\", \"DLV_TIME_24\", \"DLV_TIME_25\", \"DLV_TIME_26\", \"DLV_TIME_27\", \"DLV_TIME_28\", \"DLV_TIME_29\", \"DLV_TIME_30\", \"DLV_TIME_31\", \"PACKAGE_DLV_CD\", \"SPEC\", \"BUYER_ORG_NAME\", \"DLV_PART_LEN_1\", \"DLV_PART_QTY_1\", \"DLV_PART_LEN_2\", \"DLV_PART_QTY_2\", \"DLV_PART_LEN_3\", \"DLV_PART_QTY_3\", \"DLV_PART_LEN_4\", \"DLV_PART_QTY_4\", \"DLV_PART_LEN_5\", \"DLV_PART_QTY_5\", \"DLV_PART_LEN_6\", \"DLV_PART_QTY_6\", \"DLV_PART_LEN_7\", \"DLV_PART_QTY_7\", \"DLV_PART_LEN_8\", \"DLV_PART_QTY_8\", \"DLV_PART_LEN_9\", \"DLV_PART_QTY_9\", \"DLV_PART_LEN_10\", \"DLV_PART_QTY_10\", \"DLV_PART_UNIT\", \"CUST_CONSTRUCT_NAME\", \"MATERIAL_CD\", \"MATERIAL_UNIT_PRICE\", \"MATERIAL_UNIT\", \"TEST_REPORT_NEED_TYP\", \"TEST_REPORT_CHK_TYP\", \"TEST_REPORT_PRESENT_TYP\", \"MUNICIPAL_CD\", \"DLV_CONTACT_TEL\", \"SLIP_PRICE_PRINT_TYP\", \"BUYER_NAME_KANJI\", \"SPEC_KANJI\", \"ITEM_NAME_KANJI\", \"REMARKS_KANJI\", \"END_USER_NAME_KANJI\", \"DLV_ADDRESS_KANJI\", \"DLV_ADDRESSEE_KANJI\", \"END_USER_ITEM_NAME_KANJI\", \"CUST_DESINATED_MAKER_KANJI\", \"DLV_LOC_NAME_KANJI\", \"CLIENT_REMARK_KANJI\", \"MACHINE_TYPE_NAME_KANJI\", \"CUST_SPC_KANJI\", \"BUYER_ORG_NAME_KANJI\", \"CUST_CONSTRUCT_NAME_KANJI\", \"CUR_CD\", \"UNIT_PRICE_EXCH_RATES\", \"ODR_AMOUNT_EXCH_RATES\", \"TAX_AMOUNT_EXCH_RATES\", \"TOTAL_AMOUNT_EXCH_RATES\", \"UNCONFIRM_AMOUNT_EXCH_RATES\", \"MATERIAL_CD_EXCH_RATES\", \"SYSTEM_PROC_TYP\", \"DEL_FLG\", \"PLANNING_ODR_CD\", \"PLANNING_ODR_DATE\", \"STANDARD_DLV_TERM\", \"REQUIRED_TERM\") "
+"values "
+"  (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, '0', '0', ?, ?, ?, ?)";
	protected static String m_updcmd = null;
	protected static String m_delcmd = null;
	protected String m_spcmd=null;

	// トランザクション利用の可否を設定します
	boolean m_useTransaction=true;

	//////////////////////////////

}
