/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0130/src/com/nec/jp/orteus/metamorBase/AE0130/AE0130010Struct.java,v $
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
 * EXPJ    (2005/01/19),SRCGEN対応
 * EXPJ    (2004/04/05),メソッドコメントの「* @param なし」をすべて削除
 * EXPJ    (2004/04/01),setStructメソッドの個別メンバのみ版setStructMと、リストメンバのみ版setStructLを追加。
 *                      initializeでのデータセットは、clearを呼んでから行うように修正。
 * EXPJ    (2004/03/31),初期値のコメントアウトのバグを修正。
 * EXPJ    (2004/03/20),レビュー結果を反映。
 * EXPJ    (2004/03/02),EXPLANNER/J用に改造（ソースヘッダ・クラスヘッダ変更）
 *                      初期生成時に初期値をnullで作成。
 *                      初期化メソッドinitialize、データセットメソッドsetStruct追加。
 *                      コンストラクタのユーザ記述部にinitializeメソッド呼出追加。
 *                      initialize()メソッド、setStruct()メソッド追加。
 * 4.1.0.0 (2003/07/16),setL2L_xxxメソッド追加
 * 4.0.0.1 (2003/06/05),javadocコメントエラー修正
 * 4.0.0.0 (2003/04/23),クラス名標準化対応
 * 3.0.0.0 (2003/03/19),Time,Timestamp型対応
 * 2.1.0.0 (2002/12/17),Logging package修正
 * 2.0.0.0 (2002/05/27),new foundation対応
 *
 */

package com.nec.jp.orteus.metamorBase.AE0130;

import com.nec.jp.orteus.xaf.wa.*;

import com.nec.jp.orteus.util.logging.*;

import java.lang.Number.*;
import java.lang.Float;
import java.util.*;
import java.sql.*;
import java.io.*;

//{{user_implement_code_import
	// TODO: ここにimportパッケージを記述してください
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AE0130010Control クラス
 * ファイル・クラス説明
 * @author $Author: zhou-kehong $
 * @version $Revision: 1.12 $ $Date: 2014/12/22 02:45:00 $
 *
 */
//}}user_implement_code_header

public class AE0130010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** 第 2 変数： m_r1_RTN_DEL_FLG */
	public String m_r1_RTN_DEL_FLG = null;
	/** 第 3 変数： m_r2_RTN_DEL_FLG */
	public String m_r2_RTN_DEL_FLG = null;
	/** 第 4 変数： m_r3_RTN_DEL_FLG */
	public String m_r3_RTN_DEL_FLG = null;
	/** 第 5 変数： m_h_lotCtrl */
	public String m_h_lotCtrl = null;
	/** 第 6 変数： m_l_PLANT_CD */
	public String m_l_PLANT_CD = null;
	/** 第 7 変数： m_l_PUCH_ODR_CD */
	public String m_l_PUCH_ODR_CD = null;
	/** 第 8 変数： m_l_VEND_CD */
	public String m_l_VEND_CD = null;
	/** 第 9 変数： m_l_VEND_ANAME */
	public String m_l_VEND_ANAME = null;
	/** 第 10 変数： m_l_ITEM_CD */
	public String m_l_ITEM_CD = null;
	/** 第 11 変数： m_l_ITEM_NAME */
	public String m_l_ITEM_NAME = null;
	/** 第 12 変数： m_l_LOT_NO */
	public String m_l_LOT_NO = null;
	/** 第 13 変数： m_l_JOB_ODR_CD */
	public String m_l_JOB_ODR_CD = null;
	/** 第 14 変数： m_l_INV_CTRL_FLG_DN */
	public String m_l_INV_CTRL_FLG_DN = null;
	/** 第 15 変数： m_l_PUCH_ODR_PERSON */
	public String m_l_PUCH_ODR_PERSON = null;
	/** 第 16 変数： m_l_USER_NAME */
	public String m_l_USER_NAME = null;
	/** 第 17 変数： m_l_PUCH_RTN_DATE */
	public String m_l_PUCH_RTN_DATE = null;
	/** 第 18 変数： m_l_PUCH_RTN_QTY */
	public String m_l_PUCH_RTN_QTY = null;
	/** 第 19 変数： m_l_WH_CD */
	public String m_l_WH_CD = null;
	/** 第 20 変数： m_l_WH_NAME */
	public String m_l_WH_NAME = null;
	/** 第 21 変数： m_l_VEND_LOT_NO */
	public String m_l_VEND_LOT_NO = null;
	/** 第 22 変数： m_l_UNIT_COST_TYP_DN */
	public String m_l_UNIT_COST_TYP_DN = null;
	/** 第 23 変数： m_l_UNIT_COST */
	public String m_l_UNIT_COST = null;
	/** 第 24 変数： m_l_PROCESSING_COST */
	public String m_l_PROCESSING_COST = null;
	/** 第 25 変数： m_l_MATERIAL_COST */
	public String m_l_MATERIAL_COST = null;
	/** 第 26 変数： m_l_OTHER_OVERHEADS */
	public String m_l_OTHER_OVERHEADS = null;
	/** 第 27 変数： m_l_PUCH_ODR_AMOUNT */
	public String m_l_PUCH_ODR_AMOUNT = null;
	/** 第 28 変数： m_l_DISC_AMOUNT */
	public String m_l_DISC_AMOUNT = null;
	/** 第 29 変数： m_l_NET_AMOUNT */
	public String m_l_NET_AMOUNT = null;
	/** 第 30 変数： m_l_PUCH_RTN_COMMENT */
	public String m_l_PUCH_RTN_COMMENT = null;
	/** 第 31 変数： m_l_RATE_JUDGE_DATE */
	public String m_l_RATE_JUDGE_DATE = null;
	/** 第 32 変数： m_l_EXCH_RATE */
	public String m_l_EXCH_RATE = null;
	/** 第 33 変数： m_l_TAX_RATE_1 */
	public String m_l_TAX_RATE_1 = null;
	/** 第 34 変数： m_l_TAX_RATE_2 */
	public String m_l_TAX_RATE_2 = null;
	/** 第 35 変数： m_l_TAX_RATE_3 */
	public String m_l_TAX_RATE_3 = null;
	/** 第 36 変数： m_l_TAX_AMOUNT_1 */
	public String m_l_TAX_AMOUNT_1 = null;
	/** 第 37 変数： m_l_TAX_AMOUNT_2 */
	public String m_l_TAX_AMOUNT_2 = null;
	/** 第 38 変数： m_l_TAX_AMOUNT_3 */
	public String m_l_TAX_AMOUNT_3 = null;
	/** 第 39 変数： m_l_AMOUNT_INCLUDE_TAX */
	public String m_l_AMOUNT_INCLUDE_TAX = null;
	/** 第 40 変数： m_l_HOME_CUR_AMOUNT */
	public String m_l_HOME_CUR_AMOUNT = null;
	/** 第 41 変数： m_l_TAX_CD */
	public String m_l_TAX_CD = null;
	/** 第 42 変数： m_l_TAX_ROUND_TYP_DN */
	public String m_l_TAX_ROUND_TYP_DN = null;
	/** 第 43 変数： m_l_RTN_DEL_FLG_DN */
	public String m_l_RTN_DEL_FLG_DN = null;
	/** 第 44 変数： m_l_RTN_DEL_DATE */
	public String m_l_RTN_DEL_DATE = null;
	/** 第 45 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** 第 46 変数： m_PUCH_RTN_DATE_FROM */
	public String m_PUCH_RTN_DATE_FROM = null;
	/** 第 47 変数： m_PUCH_RTN_DATE_TO */
	public String m_PUCH_RTN_DATE_TO = null;
	/** 第 48 変数： m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** 第 49 変数： m_VEND_CD */
	public String m_VEND_CD = null;
	/** 第 50 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 51 変数： m_PUCH_ODR_PERSON */
	public String m_PUCH_ODR_PERSON = null;
	/** 第 52 変数： m_WH_CD */
	public String m_WH_CD = null;
	/** 第 53 変数： m_PUCH_ODR_CD */
	public String m_PUCH_ODR_CD = null;
	/** 第 54 変数： m_RTN_DEL_FLG */
	public String m_RTN_DEL_FLG = null;
	/** 第 55 変数： m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** 第 56 変数： m_VEND_NAME */
	public String m_VEND_NAME = null;
	/** 第 57 変数： m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** 第 58 変数： m_USER_NAME */
	public String m_USER_NAME = null;
	/** 第 59 変数： m_WH_NAME */
	public String m_WH_NAME = null;
	/** 第 60 変数： m_l_COUNT */
	public String m_l_COUNT = null;
	/** 第 61 変数： m_ROW_COUNT */
	public String m_ROW_COUNT = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** 第 2 List変数： l_r1_RTN_DEL_FLG */
	public List l_r1_RTN_DEL_FLG = null;

	/** 第 3 List変数： l_r2_RTN_DEL_FLG */
	public List l_r2_RTN_DEL_FLG = null;

	/** 第 4 List変数： l_r3_RTN_DEL_FLG */
	public List l_r3_RTN_DEL_FLG = null;

	/** 第 5 List変数： l_h_lotCtrl */
	public List l_h_lotCtrl = null;

	/** 第 6 List変数： l_l_PLANT_CD */
	public List l_l_PLANT_CD = null;

	/** 第 7 List変数： l_l_PUCH_ODR_CD */
	public List l_l_PUCH_ODR_CD = null;

	/** 第 8 List変数： l_l_VEND_CD */
	public List l_l_VEND_CD = null;

	/** 第 9 List変数： l_l_VEND_ANAME */
	public List l_l_VEND_ANAME = null;

	/** 第 10 List変数： l_l_ITEM_CD */
	public List l_l_ITEM_CD = null;

	/** 第 11 List変数： l_l_ITEM_NAME */
	public List l_l_ITEM_NAME = null;

	/** 第 12 List変数： l_l_LOT_NO */
	public List l_l_LOT_NO = null;

	/** 第 13 List変数： l_l_JOB_ODR_CD */
	public List l_l_JOB_ODR_CD = null;

	/** 第 14 List変数： l_l_INV_CTRL_FLG_DN */
	public List l_l_INV_CTRL_FLG_DN = null;

	/** 第 15 List変数： l_l_PUCH_ODR_PERSON */
	public List l_l_PUCH_ODR_PERSON = null;

	/** 第 16 List変数： l_l_USER_NAME */
	public List l_l_USER_NAME = null;

	/** 第 17 List変数： l_l_PUCH_RTN_DATE */
	public List l_l_PUCH_RTN_DATE = null;

	/** 第 18 List変数： l_l_PUCH_RTN_QTY */
	public List l_l_PUCH_RTN_QTY = null;

	/** 第 19 List変数： l_l_WH_CD */
	public List l_l_WH_CD = null;

	/** 第 20 List変数： l_l_WH_NAME */
	public List l_l_WH_NAME = null;

	/** 第 21 List変数： l_l_VEND_LOT_NO */
	public List l_l_VEND_LOT_NO = null;

	/** 第 22 List変数： l_l_UNIT_COST_TYP_DN */
	public List l_l_UNIT_COST_TYP_DN = null;

	/** 第 23 List変数： l_l_UNIT_COST */
	public List l_l_UNIT_COST = null;

	/** 第 24 List変数： l_l_PROCESSING_COST */
	public List l_l_PROCESSING_COST = null;

	/** 第 25 List変数： l_l_MATERIAL_COST */
	public List l_l_MATERIAL_COST = null;

	/** 第 26 List変数： l_l_OTHER_OVERHEADS */
	public List l_l_OTHER_OVERHEADS = null;

	/** 第 27 List変数： l_l_PUCH_ODR_AMOUNT */
	public List l_l_PUCH_ODR_AMOUNT = null;

	/** 第 28 List変数： l_l_DISC_AMOUNT */
	public List l_l_DISC_AMOUNT = null;

	/** 第 29 List変数： l_l_NET_AMOUNT */
	public List l_l_NET_AMOUNT = null;

	/** 第 30 List変数： l_l_PUCH_RTN_COMMENT */
	public List l_l_PUCH_RTN_COMMENT = null;

	/** 第 31 List変数： l_l_RATE_JUDGE_DATE */
	public List l_l_RATE_JUDGE_DATE = null;

	/** 第 32 List変数： l_l_EXCH_RATE */
	public List l_l_EXCH_RATE = null;

	/** 第 33 List変数： l_l_TAX_RATE_1 */
	public List l_l_TAX_RATE_1 = null;

	/** 第 34 List変数： l_l_TAX_RATE_2 */
	public List l_l_TAX_RATE_2 = null;

	/** 第 35 List変数： l_l_TAX_RATE_3 */
	public List l_l_TAX_RATE_3 = null;

	/** 第 36 List変数： l_l_TAX_AMOUNT_1 */
	public List l_l_TAX_AMOUNT_1 = null;

	/** 第 37 List変数： l_l_TAX_AMOUNT_2 */
	public List l_l_TAX_AMOUNT_2 = null;

	/** 第 38 List変数： l_l_TAX_AMOUNT_3 */
	public List l_l_TAX_AMOUNT_3 = null;

	/** 第 39 List変数： l_l_AMOUNT_INCLUDE_TAX */
	public List l_l_AMOUNT_INCLUDE_TAX = null;

	/** 第 40 List変数： l_l_HOME_CUR_AMOUNT */
	public List l_l_HOME_CUR_AMOUNT = null;

	/** 第 41 List変数： l_l_TAX_CD */
	public List l_l_TAX_CD = null;

	/** 第 42 List変数： l_l_TAX_ROUND_TYP_DN */
	public List l_l_TAX_ROUND_TYP_DN = null;

	/** 第 43 List変数： l_l_RTN_DEL_FLG_DN */
	public List l_l_RTN_DEL_FLG_DN = null;

	/** 第 44 List変数： l_l_RTN_DEL_DATE */
	public List l_l_RTN_DEL_DATE = null;

	/** 第 45 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** 第 46 List変数： l_PUCH_RTN_DATE_FROM */
	public List l_PUCH_RTN_DATE_FROM = null;

	/** 第 47 List変数： l_PUCH_RTN_DATE_TO */
	public List l_PUCH_RTN_DATE_TO = null;

	/** 第 48 List変数： l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** 第 49 List変数： l_VEND_CD */
	public List l_VEND_CD = null;

	/** 第 50 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 51 List変数： l_PUCH_ODR_PERSON */
	public List l_PUCH_ODR_PERSON = null;

	/** 第 52 List変数： l_WH_CD */
	public List l_WH_CD = null;

	/** 第 53 List変数： l_PUCH_ODR_CD */
	public List l_PUCH_ODR_CD = null;

	/** 第 54 List変数： l_RTN_DEL_FLG */
	public List l_RTN_DEL_FLG = null;

	/** 第 55 List変数： l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** 第 56 List変数： l_VEND_NAME */
	public List l_VEND_NAME = null;

	/** 第 57 List変数： l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** 第 58 List変数： l_USER_NAME */
	public List l_USER_NAME = null;

	/** 第 59 List変数： l_WH_NAME */
	public List l_WH_NAME = null;

	/** 第 60 List変数： l_l_COUNT */
	public List l_l_COUNT = null;

	/** 第 61 List変数： l_ROW_COUNT */
	public List l_ROW_COUNT = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getr1_RTN_DEL_FLG() { return m_r1_RTN_DEL_FLG; }
	public String getr2_RTN_DEL_FLG() { return m_r2_RTN_DEL_FLG; }
	public String getr3_RTN_DEL_FLG() { return m_r3_RTN_DEL_FLG; }
	public String geth_lotCtrl() { return m_h_lotCtrl; }
	public String getl_PLANT_CD() { return m_l_PLANT_CD; }
	public String getl_PUCH_ODR_CD() { return m_l_PUCH_ODR_CD; }
	public String getl_VEND_CD() { return m_l_VEND_CD; }
	public String getl_VEND_ANAME() { return m_l_VEND_ANAME; }
	public String getl_ITEM_CD() { return m_l_ITEM_CD; }
	public String getl_ITEM_NAME() { return m_l_ITEM_NAME; }
	public String getl_LOT_NO() { return m_l_LOT_NO; }
	public String getl_JOB_ODR_CD() { return m_l_JOB_ODR_CD; }
	public String getl_INV_CTRL_FLG_DN() { return m_l_INV_CTRL_FLG_DN; }
	public String getl_PUCH_ODR_PERSON() { return m_l_PUCH_ODR_PERSON; }
	public String getl_USER_NAME() { return m_l_USER_NAME; }
	public String getl_PUCH_RTN_DATE() { return m_l_PUCH_RTN_DATE; }
	public String getl_PUCH_RTN_QTY() { return m_l_PUCH_RTN_QTY; }
	public String getl_WH_CD() { return m_l_WH_CD; }
	public String getl_WH_NAME() { return m_l_WH_NAME; }
	public String getl_VEND_LOT_NO() { return m_l_VEND_LOT_NO; }
	public String getl_UNIT_COST_TYP_DN() { return m_l_UNIT_COST_TYP_DN; }
	public String getl_UNIT_COST() { return m_l_UNIT_COST; }
	public String getl_PROCESSING_COST() { return m_l_PROCESSING_COST; }
	public String getl_MATERIAL_COST() { return m_l_MATERIAL_COST; }
	public String getl_OTHER_OVERHEADS() { return m_l_OTHER_OVERHEADS; }
	public String getl_PUCH_ODR_AMOUNT() { return m_l_PUCH_ODR_AMOUNT; }
	public String getl_DISC_AMOUNT() { return m_l_DISC_AMOUNT; }
	public String getl_NET_AMOUNT() { return m_l_NET_AMOUNT; }
	public String getl_PUCH_RTN_COMMENT() { return m_l_PUCH_RTN_COMMENT; }
	public String getl_RATE_JUDGE_DATE() { return m_l_RATE_JUDGE_DATE; }
	public String getl_EXCH_RATE() { return m_l_EXCH_RATE; }
	public String getl_TAX_RATE_1() { return m_l_TAX_RATE_1; }
	public String getl_TAX_RATE_2() { return m_l_TAX_RATE_2; }
	public String getl_TAX_RATE_3() { return m_l_TAX_RATE_3; }
	public String getl_TAX_AMOUNT_1() { return m_l_TAX_AMOUNT_1; }
	public String getl_TAX_AMOUNT_2() { return m_l_TAX_AMOUNT_2; }
	public String getl_TAX_AMOUNT_3() { return m_l_TAX_AMOUNT_3; }
	public String getl_AMOUNT_INCLUDE_TAX() { return m_l_AMOUNT_INCLUDE_TAX; }
	public String getl_HOME_CUR_AMOUNT() { return m_l_HOME_CUR_AMOUNT; }
	public String getl_TAX_CD() { return m_l_TAX_CD; }
	public String getl_TAX_ROUND_TYP_DN() { return m_l_TAX_ROUND_TYP_DN; }
	public String getl_RTN_DEL_FLG_DN() { return m_l_RTN_DEL_FLG_DN; }
	public String getl_RTN_DEL_DATE() { return m_l_RTN_DEL_DATE; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getPUCH_RTN_DATE_FROM() { return m_PUCH_RTN_DATE_FROM; }
	public String getPUCH_RTN_DATE_TO() { return m_PUCH_RTN_DATE_TO; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getPUCH_ODR_PERSON() { return m_PUCH_ODR_PERSON; }
	public String getWH_CD() { return m_WH_CD; }
	public String getPUCH_ODR_CD() { return m_PUCH_ODR_CD; }
	public String getRTN_DEL_FLG() { return m_RTN_DEL_FLG; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getVEND_NAME() { return m_VEND_NAME; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getUSER_NAME() { return m_USER_NAME; }
	public String getWH_NAME() { return m_WH_NAME; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }

	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_r1_RTN_DEL_FLG() { return l_r1_RTN_DEL_FLG; }
	public List getList_r2_RTN_DEL_FLG() { return l_r2_RTN_DEL_FLG; }
	public List getList_r3_RTN_DEL_FLG() { return l_r3_RTN_DEL_FLG; }
	public List getList_h_lotCtrl() { return l_h_lotCtrl; }
	public List getList_l_PLANT_CD() { return l_l_PLANT_CD; }
	public List getList_l_PUCH_ODR_CD() { return l_l_PUCH_ODR_CD; }
	public List getList_l_VEND_CD() { return l_l_VEND_CD; }
	public List getList_l_VEND_ANAME() { return l_l_VEND_ANAME; }
	public List getList_l_ITEM_CD() { return l_l_ITEM_CD; }
	public List getList_l_ITEM_NAME() { return l_l_ITEM_NAME; }
	public List getList_l_LOT_NO() { return l_l_LOT_NO; }
	public List getList_l_JOB_ODR_CD() { return l_l_JOB_ODR_CD; }
	public List getList_l_INV_CTRL_FLG_DN() { return l_l_INV_CTRL_FLG_DN; }
	public List getList_l_PUCH_ODR_PERSON() { return l_l_PUCH_ODR_PERSON; }
	public List getList_l_USER_NAME() { return l_l_USER_NAME; }
	public List getList_l_PUCH_RTN_DATE() { return l_l_PUCH_RTN_DATE; }
	public List getList_l_PUCH_RTN_QTY() { return l_l_PUCH_RTN_QTY; }
	public List getList_l_WH_CD() { return l_l_WH_CD; }
	public List getList_l_WH_NAME() { return l_l_WH_NAME; }
	public List getList_l_VEND_LOT_NO() { return l_l_VEND_LOT_NO; }
	public List getList_l_UNIT_COST_TYP_DN() { return l_l_UNIT_COST_TYP_DN; }
	public List getList_l_UNIT_COST() { return l_l_UNIT_COST; }
	public List getList_l_PROCESSING_COST() { return l_l_PROCESSING_COST; }
	public List getList_l_MATERIAL_COST() { return l_l_MATERIAL_COST; }
	public List getList_l_OTHER_OVERHEADS() { return l_l_OTHER_OVERHEADS; }
	public List getList_l_PUCH_ODR_AMOUNT() { return l_l_PUCH_ODR_AMOUNT; }
	public List getList_l_DISC_AMOUNT() { return l_l_DISC_AMOUNT; }
	public List getList_l_NET_AMOUNT() { return l_l_NET_AMOUNT; }
	public List getList_l_PUCH_RTN_COMMENT() { return l_l_PUCH_RTN_COMMENT; }
	public List getList_l_RATE_JUDGE_DATE() { return l_l_RATE_JUDGE_DATE; }
	public List getList_l_EXCH_RATE() { return l_l_EXCH_RATE; }
	public List getList_l_TAX_RATE_1() { return l_l_TAX_RATE_1; }
	public List getList_l_TAX_RATE_2() { return l_l_TAX_RATE_2; }
	public List getList_l_TAX_RATE_3() { return l_l_TAX_RATE_3; }
	public List getList_l_TAX_AMOUNT_1() { return l_l_TAX_AMOUNT_1; }
	public List getList_l_TAX_AMOUNT_2() { return l_l_TAX_AMOUNT_2; }
	public List getList_l_TAX_AMOUNT_3() { return l_l_TAX_AMOUNT_3; }
	public List getList_l_AMOUNT_INCLUDE_TAX() { return l_l_AMOUNT_INCLUDE_TAX; }
	public List getList_l_HOME_CUR_AMOUNT() { return l_l_HOME_CUR_AMOUNT; }
	public List getList_l_TAX_CD() { return l_l_TAX_CD; }
	public List getList_l_TAX_ROUND_TYP_DN() { return l_l_TAX_ROUND_TYP_DN; }
	public List getList_l_RTN_DEL_FLG_DN() { return l_l_RTN_DEL_FLG_DN; }
	public List getList_l_RTN_DEL_DATE() { return l_l_RTN_DEL_DATE; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_PUCH_RTN_DATE_FROM() { return l_PUCH_RTN_DATE_FROM; }
	public List getList_PUCH_RTN_DATE_TO() { return l_PUCH_RTN_DATE_TO; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_PUCH_ODR_PERSON() { return l_PUCH_ODR_PERSON; }
	public List getList_WH_CD() { return l_WH_CD; }
	public List getList_PUCH_ODR_CD() { return l_PUCH_ODR_CD; }
	public List getList_RTN_DEL_FLG() { return l_RTN_DEL_FLG; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_VEND_NAME() { return l_VEND_NAME; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_USER_NAME() { return l_USER_NAME; }
	public List getList_WH_NAME() { return l_WH_NAME; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }

	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setr1_RTN_DEL_FLG(String val) { m_r1_RTN_DEL_FLG = val; }
	public void setr2_RTN_DEL_FLG(String val) { m_r2_RTN_DEL_FLG = val; }
	public void setr3_RTN_DEL_FLG(String val) { m_r3_RTN_DEL_FLG = val; }
	public void seth_lotCtrl(String val) { m_h_lotCtrl = val; }
	public void setl_PLANT_CD(String val) { m_l_PLANT_CD = val; }
	public void setl_PUCH_ODR_CD(String val) { m_l_PUCH_ODR_CD = val; }
	public void setl_VEND_CD(String val) { m_l_VEND_CD = val; }
	public void setl_VEND_ANAME(String val) { m_l_VEND_ANAME = val; }
	public void setl_ITEM_CD(String val) { m_l_ITEM_CD = val; }
	public void setl_ITEM_NAME(String val) { m_l_ITEM_NAME = val; }
	public void setl_LOT_NO(String val) { m_l_LOT_NO = val; }
	public void setl_JOB_ODR_CD(String val) { m_l_JOB_ODR_CD = val; }
	public void setl_INV_CTRL_FLG_DN(String val) { m_l_INV_CTRL_FLG_DN = val; }
	public void setl_PUCH_ODR_PERSON(String val) { m_l_PUCH_ODR_PERSON = val; }
	public void setl_USER_NAME(String val) { m_l_USER_NAME = val; }
	public void setl_PUCH_RTN_DATE(String val) { m_l_PUCH_RTN_DATE = val; }
	public void setl_PUCH_RTN_QTY(String val) { m_l_PUCH_RTN_QTY = val; }
	public void setl_WH_CD(String val) { m_l_WH_CD = val; }
	public void setl_WH_NAME(String val) { m_l_WH_NAME = val; }
	public void setl_VEND_LOT_NO(String val) { m_l_VEND_LOT_NO = val; }
	public void setl_UNIT_COST_TYP_DN(String val) { m_l_UNIT_COST_TYP_DN = val; }
	public void setl_UNIT_COST(String val) { m_l_UNIT_COST = val; }
	public void setl_PROCESSING_COST(String val) { m_l_PROCESSING_COST = val; }
	public void setl_MATERIAL_COST(String val) { m_l_MATERIAL_COST = val; }
	public void setl_OTHER_OVERHEADS(String val) { m_l_OTHER_OVERHEADS = val; }
	public void setl_PUCH_ODR_AMOUNT(String val) { m_l_PUCH_ODR_AMOUNT = val; }
	public void setl_DISC_AMOUNT(String val) { m_l_DISC_AMOUNT = val; }
	public void setl_NET_AMOUNT(String val) { m_l_NET_AMOUNT = val; }
	public void setl_PUCH_RTN_COMMENT(String val) { m_l_PUCH_RTN_COMMENT = val; }
	public void setl_RATE_JUDGE_DATE(String val) { m_l_RATE_JUDGE_DATE = val; }
	public void setl_EXCH_RATE(String val) { m_l_EXCH_RATE = val; }
	public void setl_TAX_RATE_1(String val) { m_l_TAX_RATE_1 = val; }
	public void setl_TAX_RATE_2(String val) { m_l_TAX_RATE_2 = val; }
	public void setl_TAX_RATE_3(String val) { m_l_TAX_RATE_3 = val; }
	public void setl_TAX_AMOUNT_1(String val) { m_l_TAX_AMOUNT_1 = val; }
	public void setl_TAX_AMOUNT_2(String val) { m_l_TAX_AMOUNT_2 = val; }
	public void setl_TAX_AMOUNT_3(String val) { m_l_TAX_AMOUNT_3 = val; }
	public void setl_AMOUNT_INCLUDE_TAX(String val) { m_l_AMOUNT_INCLUDE_TAX = val; }
	public void setl_HOME_CUR_AMOUNT(String val) { m_l_HOME_CUR_AMOUNT = val; }
	public void setl_TAX_CD(String val) { m_l_TAX_CD = val; }
	public void setl_TAX_ROUND_TYP_DN(String val) { m_l_TAX_ROUND_TYP_DN = val; }
	public void setl_RTN_DEL_FLG_DN(String val) { m_l_RTN_DEL_FLG_DN = val; }
	public void setl_RTN_DEL_DATE(String val) { m_l_RTN_DEL_DATE = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setPUCH_RTN_DATE_FROM(String val) { m_PUCH_RTN_DATE_FROM = val; }
	public void setPUCH_RTN_DATE_TO(String val) { m_PUCH_RTN_DATE_TO = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setPUCH_ODR_PERSON(String val) { m_PUCH_ODR_PERSON = val; }
	public void setWH_CD(String val) { m_WH_CD = val; }
	public void setPUCH_ODR_CD(String val) { m_PUCH_ODR_CD = val; }
	public void setRTN_DEL_FLG(String val) { m_RTN_DEL_FLG = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setVEND_NAME(String val) { m_VEND_NAME = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setUSER_NAME(String val) { m_USER_NAME = val; }
	public void setWH_NAME(String val) { m_WH_NAME = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }


	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_r1_RTN_DEL_FLG(List list) { l_r1_RTN_DEL_FLG = list; }
	public void setList_r2_RTN_DEL_FLG(List list) { l_r2_RTN_DEL_FLG = list; }
	public void setList_r3_RTN_DEL_FLG(List list) { l_r3_RTN_DEL_FLG = list; }
	public void setList_h_lotCtrl(List list) { l_h_lotCtrl = list; }
	public void setList_l_PLANT_CD(List list) { l_l_PLANT_CD = list; }
	public void setList_l_PUCH_ODR_CD(List list) { l_l_PUCH_ODR_CD = list; }
	public void setList_l_VEND_CD(List list) { l_l_VEND_CD = list; }
	public void setList_l_VEND_ANAME(List list) { l_l_VEND_ANAME = list; }
	public void setList_l_ITEM_CD(List list) { l_l_ITEM_CD = list; }
	public void setList_l_ITEM_NAME(List list) { l_l_ITEM_NAME = list; }
	public void setList_l_LOT_NO(List list) { l_l_LOT_NO = list; }
	public void setList_l_JOB_ODR_CD(List list) { l_l_JOB_ODR_CD = list; }
	public void setList_l_INV_CTRL_FLG_DN(List list) { l_l_INV_CTRL_FLG_DN = list; }
	public void setList_l_PUCH_ODR_PERSON(List list) { l_l_PUCH_ODR_PERSON = list; }
	public void setList_l_USER_NAME(List list) { l_l_USER_NAME = list; }
	public void setList_l_PUCH_RTN_DATE(List list) { l_l_PUCH_RTN_DATE = list; }
	public void setList_l_PUCH_RTN_QTY(List list) { l_l_PUCH_RTN_QTY = list; }
	public void setList_l_WH_CD(List list) { l_l_WH_CD = list; }
	public void setList_l_WH_NAME(List list) { l_l_WH_NAME = list; }
	public void setList_l_VEND_LOT_NO(List list) { l_l_VEND_LOT_NO = list; }
	public void setList_l_UNIT_COST_TYP_DN(List list) { l_l_UNIT_COST_TYP_DN = list; }
	public void setList_l_UNIT_COST(List list) { l_l_UNIT_COST = list; }
	public void setList_l_PROCESSING_COST(List list) { l_l_PROCESSING_COST = list; }
	public void setList_l_MATERIAL_COST(List list) { l_l_MATERIAL_COST = list; }
	public void setList_l_OTHER_OVERHEADS(List list) { l_l_OTHER_OVERHEADS = list; }
	public void setList_l_PUCH_ODR_AMOUNT(List list) { l_l_PUCH_ODR_AMOUNT = list; }
	public void setList_l_DISC_AMOUNT(List list) { l_l_DISC_AMOUNT = list; }
	public void setList_l_NET_AMOUNT(List list) { l_l_NET_AMOUNT = list; }
	public void setList_l_PUCH_RTN_COMMENT(List list) { l_l_PUCH_RTN_COMMENT = list; }
	public void setList_l_RATE_JUDGE_DATE(List list) { l_l_RATE_JUDGE_DATE = list; }
	public void setList_l_EXCH_RATE(List list) { l_l_EXCH_RATE = list; }
	public void setList_l_TAX_RATE_1(List list) { l_l_TAX_RATE_1 = list; }
	public void setList_l_TAX_RATE_2(List list) { l_l_TAX_RATE_2 = list; }
	public void setList_l_TAX_RATE_3(List list) { l_l_TAX_RATE_3 = list; }
	public void setList_l_TAX_AMOUNT_1(List list) { l_l_TAX_AMOUNT_1 = list; }
	public void setList_l_TAX_AMOUNT_2(List list) { l_l_TAX_AMOUNT_2 = list; }
	public void setList_l_TAX_AMOUNT_3(List list) { l_l_TAX_AMOUNT_3 = list; }
	public void setList_l_AMOUNT_INCLUDE_TAX(List list) { l_l_AMOUNT_INCLUDE_TAX = list; }
	public void setList_l_HOME_CUR_AMOUNT(List list) { l_l_HOME_CUR_AMOUNT = list; }
	public void setList_l_TAX_CD(List list) { l_l_TAX_CD = list; }
	public void setList_l_TAX_ROUND_TYP_DN(List list) { l_l_TAX_ROUND_TYP_DN = list; }
	public void setList_l_RTN_DEL_FLG_DN(List list) { l_l_RTN_DEL_FLG_DN = list; }
	public void setList_l_RTN_DEL_DATE(List list) { l_l_RTN_DEL_DATE = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_PUCH_RTN_DATE_FROM(List list) { l_PUCH_RTN_DATE_FROM = list; }
	public void setList_PUCH_RTN_DATE_TO(List list) { l_PUCH_RTN_DATE_TO = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_PUCH_ODR_PERSON(List list) { l_PUCH_ODR_PERSON = list; }
	public void setList_WH_CD(List list) { l_WH_CD = list; }
	public void setList_PUCH_ODR_CD(List list) { l_PUCH_ODR_CD = list; }
	public void setList_RTN_DEL_FLG(List list) { l_RTN_DEL_FLG = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_VEND_NAME(List list) { l_VEND_NAME = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_USER_NAME(List list) { l_USER_NAME = list; }
	public void setList_WH_NAME(List list) { l_WH_NAME = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }

	public int setL2L_DOWNLOAD_FILE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DOWNLOAD_FILE == null) {
			l_DOWNLOAD_FILE = new ArrayList();
		} else {
			l_DOWNLOAD_FILE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DOWNLOAD_FILE.add(((AE0130010Struct) list.get(i)).getDOWNLOAD_FILE());
		}
		return size;
	}
	public int setL2L_r1_RTN_DEL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r1_RTN_DEL_FLG == null) {
			l_r1_RTN_DEL_FLG = new ArrayList();
		} else {
			l_r1_RTN_DEL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r1_RTN_DEL_FLG.add(((AE0130010Struct) list.get(i)).getr1_RTN_DEL_FLG());
		}
		return size;
	}
	public int setL2L_r2_RTN_DEL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r2_RTN_DEL_FLG == null) {
			l_r2_RTN_DEL_FLG = new ArrayList();
		} else {
			l_r2_RTN_DEL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r2_RTN_DEL_FLG.add(((AE0130010Struct) list.get(i)).getr2_RTN_DEL_FLG());
		}
		return size;
	}
	public int setL2L_r3_RTN_DEL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r3_RTN_DEL_FLG == null) {
			l_r3_RTN_DEL_FLG = new ArrayList();
		} else {
			l_r3_RTN_DEL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r3_RTN_DEL_FLG.add(((AE0130010Struct) list.get(i)).getr3_RTN_DEL_FLG());
		}
		return size;
	}
	public int setL2L_h_lotCtrl(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_lotCtrl == null) {
			l_h_lotCtrl = new ArrayList();
		} else {
			l_h_lotCtrl.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_lotCtrl.add(((AE0130010Struct) list.get(i)).geth_lotCtrl());
		}
		return size;
	}
	public int setL2L_l_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PLANT_CD == null) {
			l_l_PLANT_CD = new ArrayList();
		} else {
			l_l_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PLANT_CD.add(((AE0130010Struct) list.get(i)).getl_PLANT_CD());
		}
		return size;
	}
	public int setL2L_l_PUCH_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PUCH_ODR_CD == null) {
			l_l_PUCH_ODR_CD = new ArrayList();
		} else {
			l_l_PUCH_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PUCH_ODR_CD.add(((AE0130010Struct) list.get(i)).getl_PUCH_ODR_CD());
		}
		return size;
	}
	public int setL2L_l_VEND_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_VEND_CD == null) {
			l_l_VEND_CD = new ArrayList();
		} else {
			l_l_VEND_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_VEND_CD.add(((AE0130010Struct) list.get(i)).getl_VEND_CD());
		}
		return size;
	}
	public int setL2L_l_VEND_ANAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_VEND_ANAME == null) {
			l_l_VEND_ANAME = new ArrayList();
		} else {
			l_l_VEND_ANAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_VEND_ANAME.add(((AE0130010Struct) list.get(i)).getl_VEND_ANAME());
		}
		return size;
	}
	public int setL2L_l_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ITEM_CD == null) {
			l_l_ITEM_CD = new ArrayList();
		} else {
			l_l_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ITEM_CD.add(((AE0130010Struct) list.get(i)).getl_ITEM_CD());
		}
		return size;
	}
	public int setL2L_l_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ITEM_NAME == null) {
			l_l_ITEM_NAME = new ArrayList();
		} else {
			l_l_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ITEM_NAME.add(((AE0130010Struct) list.get(i)).getl_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_l_LOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_LOT_NO == null) {
			l_l_LOT_NO = new ArrayList();
		} else {
			l_l_LOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_LOT_NO.add(((AE0130010Struct) list.get(i)).getl_LOT_NO());
		}
		return size;
	}
	public int setL2L_l_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_JOB_ODR_CD == null) {
			l_l_JOB_ODR_CD = new ArrayList();
		} else {
			l_l_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_JOB_ODR_CD.add(((AE0130010Struct) list.get(i)).getl_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_l_INV_CTRL_FLG_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_INV_CTRL_FLG_DN == null) {
			l_l_INV_CTRL_FLG_DN = new ArrayList();
		} else {
			l_l_INV_CTRL_FLG_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_INV_CTRL_FLG_DN.add(((AE0130010Struct) list.get(i)).getl_INV_CTRL_FLG_DN());
		}
		return size;
	}
	public int setL2L_l_PUCH_ODR_PERSON(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PUCH_ODR_PERSON == null) {
			l_l_PUCH_ODR_PERSON = new ArrayList();
		} else {
			l_l_PUCH_ODR_PERSON.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PUCH_ODR_PERSON.add(((AE0130010Struct) list.get(i)).getl_PUCH_ODR_PERSON());
		}
		return size;
	}
	public int setL2L_l_USER_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_USER_NAME == null) {
			l_l_USER_NAME = new ArrayList();
		} else {
			l_l_USER_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_USER_NAME.add(((AE0130010Struct) list.get(i)).getl_USER_NAME());
		}
		return size;
	}
	public int setL2L_l_PUCH_RTN_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PUCH_RTN_DATE == null) {
			l_l_PUCH_RTN_DATE = new ArrayList();
		} else {
			l_l_PUCH_RTN_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PUCH_RTN_DATE.add(((AE0130010Struct) list.get(i)).getl_PUCH_RTN_DATE());
		}
		return size;
	}
	public int setL2L_l_PUCH_RTN_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PUCH_RTN_QTY == null) {
			l_l_PUCH_RTN_QTY = new ArrayList();
		} else {
			l_l_PUCH_RTN_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PUCH_RTN_QTY.add(((AE0130010Struct) list.get(i)).getl_PUCH_RTN_QTY());
		}
		return size;
	}
	public int setL2L_l_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_WH_CD == null) {
			l_l_WH_CD = new ArrayList();
		} else {
			l_l_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_WH_CD.add(((AE0130010Struct) list.get(i)).getl_WH_CD());
		}
		return size;
	}
	public int setL2L_l_WH_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_WH_NAME == null) {
			l_l_WH_NAME = new ArrayList();
		} else {
			l_l_WH_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_WH_NAME.add(((AE0130010Struct) list.get(i)).getl_WH_NAME());
		}
		return size;
	}
	public int setL2L_l_VEND_LOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_VEND_LOT_NO == null) {
			l_l_VEND_LOT_NO = new ArrayList();
		} else {
			l_l_VEND_LOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_VEND_LOT_NO.add(((AE0130010Struct) list.get(i)).getl_VEND_LOT_NO());
		}
		return size;
	}
	public int setL2L_l_UNIT_COST_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_UNIT_COST_TYP_DN == null) {
			l_l_UNIT_COST_TYP_DN = new ArrayList();
		} else {
			l_l_UNIT_COST_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_UNIT_COST_TYP_DN.add(((AE0130010Struct) list.get(i)).getl_UNIT_COST_TYP_DN());
		}
		return size;
	}
	public int setL2L_l_UNIT_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_UNIT_COST == null) {
			l_l_UNIT_COST = new ArrayList();
		} else {
			l_l_UNIT_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_UNIT_COST.add(((AE0130010Struct) list.get(i)).getl_UNIT_COST());
		}
		return size;
	}
	public int setL2L_l_PROCESSING_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PROCESSING_COST == null) {
			l_l_PROCESSING_COST = new ArrayList();
		} else {
			l_l_PROCESSING_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PROCESSING_COST.add(((AE0130010Struct) list.get(i)).getl_PROCESSING_COST());
		}
		return size;
	}
	public int setL2L_l_MATERIAL_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_MATERIAL_COST == null) {
			l_l_MATERIAL_COST = new ArrayList();
		} else {
			l_l_MATERIAL_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_MATERIAL_COST.add(((AE0130010Struct) list.get(i)).getl_MATERIAL_COST());
		}
		return size;
	}
	public int setL2L_l_OTHER_OVERHEADS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OTHER_OVERHEADS == null) {
			l_l_OTHER_OVERHEADS = new ArrayList();
		} else {
			l_l_OTHER_OVERHEADS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OTHER_OVERHEADS.add(((AE0130010Struct) list.get(i)).getl_OTHER_OVERHEADS());
		}
		return size;
	}
	public int setL2L_l_PUCH_ODR_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PUCH_ODR_AMOUNT == null) {
			l_l_PUCH_ODR_AMOUNT = new ArrayList();
		} else {
			l_l_PUCH_ODR_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PUCH_ODR_AMOUNT.add(((AE0130010Struct) list.get(i)).getl_PUCH_ODR_AMOUNT());
		}
		return size;
	}
	public int setL2L_l_DISC_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DISC_AMOUNT == null) {
			l_l_DISC_AMOUNT = new ArrayList();
		} else {
			l_l_DISC_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DISC_AMOUNT.add(((AE0130010Struct) list.get(i)).getl_DISC_AMOUNT());
		}
		return size;
	}
	public int setL2L_l_NET_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_NET_AMOUNT == null) {
			l_l_NET_AMOUNT = new ArrayList();
		} else {
			l_l_NET_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_NET_AMOUNT.add(((AE0130010Struct) list.get(i)).getl_NET_AMOUNT());
		}
		return size;
	}
	public int setL2L_l_PUCH_RTN_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PUCH_RTN_COMMENT == null) {
			l_l_PUCH_RTN_COMMENT = new ArrayList();
		} else {
			l_l_PUCH_RTN_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PUCH_RTN_COMMENT.add(((AE0130010Struct) list.get(i)).getl_PUCH_RTN_COMMENT());
		}
		return size;
	}
	public int setL2L_l_RATE_JUDGE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_RATE_JUDGE_DATE == null) {
			l_l_RATE_JUDGE_DATE = new ArrayList();
		} else {
			l_l_RATE_JUDGE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_RATE_JUDGE_DATE.add(((AE0130010Struct) list.get(i)).getl_RATE_JUDGE_DATE());
		}
		return size;
	}
	public int setL2L_l_EXCH_RATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_EXCH_RATE == null) {
			l_l_EXCH_RATE = new ArrayList();
		} else {
			l_l_EXCH_RATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_EXCH_RATE.add(((AE0130010Struct) list.get(i)).getl_EXCH_RATE());
		}
		return size;
	}
	public int setL2L_l_TAX_RATE_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_TAX_RATE_1 == null) {
			l_l_TAX_RATE_1 = new ArrayList();
		} else {
			l_l_TAX_RATE_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_TAX_RATE_1.add(((AE0130010Struct) list.get(i)).getl_TAX_RATE_1());
		}
		return size;
	}
	public int setL2L_l_TAX_RATE_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_TAX_RATE_2 == null) {
			l_l_TAX_RATE_2 = new ArrayList();
		} else {
			l_l_TAX_RATE_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_TAX_RATE_2.add(((AE0130010Struct) list.get(i)).getl_TAX_RATE_2());
		}
		return size;
	}
	public int setL2L_l_TAX_RATE_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_TAX_RATE_3 == null) {
			l_l_TAX_RATE_3 = new ArrayList();
		} else {
			l_l_TAX_RATE_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_TAX_RATE_3.add(((AE0130010Struct) list.get(i)).getl_TAX_RATE_3());
		}
		return size;
	}
	public int setL2L_l_TAX_AMOUNT_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_TAX_AMOUNT_1 == null) {
			l_l_TAX_AMOUNT_1 = new ArrayList();
		} else {
			l_l_TAX_AMOUNT_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_TAX_AMOUNT_1.add(((AE0130010Struct) list.get(i)).getl_TAX_AMOUNT_1());
		}
		return size;
	}
	public int setL2L_l_TAX_AMOUNT_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_TAX_AMOUNT_2 == null) {
			l_l_TAX_AMOUNT_2 = new ArrayList();
		} else {
			l_l_TAX_AMOUNT_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_TAX_AMOUNT_2.add(((AE0130010Struct) list.get(i)).getl_TAX_AMOUNT_2());
		}
		return size;
	}
	public int setL2L_l_TAX_AMOUNT_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_TAX_AMOUNT_3 == null) {
			l_l_TAX_AMOUNT_3 = new ArrayList();
		} else {
			l_l_TAX_AMOUNT_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_TAX_AMOUNT_3.add(((AE0130010Struct) list.get(i)).getl_TAX_AMOUNT_3());
		}
		return size;
	}
	public int setL2L_l_AMOUNT_INCLUDE_TAX(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_AMOUNT_INCLUDE_TAX == null) {
			l_l_AMOUNT_INCLUDE_TAX = new ArrayList();
		} else {
			l_l_AMOUNT_INCLUDE_TAX.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_AMOUNT_INCLUDE_TAX.add(((AE0130010Struct) list.get(i)).getl_AMOUNT_INCLUDE_TAX());
		}
		return size;
	}
	public int setL2L_l_HOME_CUR_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_HOME_CUR_AMOUNT == null) {
			l_l_HOME_CUR_AMOUNT = new ArrayList();
		} else {
			l_l_HOME_CUR_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_HOME_CUR_AMOUNT.add(((AE0130010Struct) list.get(i)).getl_HOME_CUR_AMOUNT());
		}
		return size;
	}
	public int setL2L_l_TAX_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_TAX_CD == null) {
			l_l_TAX_CD = new ArrayList();
		} else {
			l_l_TAX_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_TAX_CD.add(((AE0130010Struct) list.get(i)).getl_TAX_CD());
		}
		return size;
	}
	public int setL2L_l_TAX_ROUND_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_TAX_ROUND_TYP_DN == null) {
			l_l_TAX_ROUND_TYP_DN = new ArrayList();
		} else {
			l_l_TAX_ROUND_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_TAX_ROUND_TYP_DN.add(((AE0130010Struct) list.get(i)).getl_TAX_ROUND_TYP_DN());
		}
		return size;
	}
	public int setL2L_l_RTN_DEL_FLG_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_RTN_DEL_FLG_DN == null) {
			l_l_RTN_DEL_FLG_DN = new ArrayList();
		} else {
			l_l_RTN_DEL_FLG_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_RTN_DEL_FLG_DN.add(((AE0130010Struct) list.get(i)).getl_RTN_DEL_FLG_DN());
		}
		return size;
	}
	public int setL2L_l_RTN_DEL_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_RTN_DEL_DATE == null) {
			l_l_RTN_DEL_DATE = new ArrayList();
		} else {
			l_l_RTN_DEL_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_RTN_DEL_DATE.add(((AE0130010Struct) list.get(i)).getl_RTN_DEL_DATE());
		}
		return size;
	}
	public int setL2L_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PLANT_CD == null) {
			l_PLANT_CD = new ArrayList();
		} else {
			l_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PLANT_CD.add(((AE0130010Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_PUCH_RTN_DATE_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_RTN_DATE_FROM == null) {
			l_PUCH_RTN_DATE_FROM = new ArrayList();
		} else {
			l_PUCH_RTN_DATE_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_RTN_DATE_FROM.add(((AE0130010Struct) list.get(i)).getPUCH_RTN_DATE_FROM());
		}
		return size;
	}
	public int setL2L_PUCH_RTN_DATE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_RTN_DATE_TO == null) {
			l_PUCH_RTN_DATE_TO = new ArrayList();
		} else {
			l_PUCH_RTN_DATE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_RTN_DATE_TO.add(((AE0130010Struct) list.get(i)).getPUCH_RTN_DATE_TO());
		}
		return size;
	}
	public int setL2L_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_CD == null) {
			l_JOB_ODR_CD = new ArrayList();
		} else {
			l_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_CD.add(((AE0130010Struct) list.get(i)).getJOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_VEND_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_CD == null) {
			l_VEND_CD = new ArrayList();
		} else {
			l_VEND_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_CD.add(((AE0130010Struct) list.get(i)).getVEND_CD());
		}
		return size;
	}
	public int setL2L_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CD == null) {
			l_ITEM_CD = new ArrayList();
		} else {
			l_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CD.add(((AE0130010Struct) list.get(i)).getITEM_CD());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_PERSON(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_PERSON == null) {
			l_PUCH_ODR_PERSON = new ArrayList();
		} else {
			l_PUCH_ODR_PERSON.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_PERSON.add(((AE0130010Struct) list.get(i)).getPUCH_ODR_PERSON());
		}
		return size;
	}
	public int setL2L_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WH_CD == null) {
			l_WH_CD = new ArrayList();
		} else {
			l_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WH_CD.add(((AE0130010Struct) list.get(i)).getWH_CD());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_CD == null) {
			l_PUCH_ODR_CD = new ArrayList();
		} else {
			l_PUCH_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_CD.add(((AE0130010Struct) list.get(i)).getPUCH_ODR_CD());
		}
		return size;
	}
	public int setL2L_RTN_DEL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RTN_DEL_FLG == null) {
			l_RTN_DEL_FLG = new ArrayList();
		} else {
			l_RTN_DEL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RTN_DEL_FLG.add(((AE0130010Struct) list.get(i)).getRTN_DEL_FLG());
		}
		return size;
	}
	public int setL2L_PLANT_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PLANT_NAME == null) {
			l_PLANT_NAME = new ArrayList();
		} else {
			l_PLANT_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PLANT_NAME.add(((AE0130010Struct) list.get(i)).getPLANT_NAME());
		}
		return size;
	}
	public int setL2L_VEND_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_NAME == null) {
			l_VEND_NAME = new ArrayList();
		} else {
			l_VEND_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_NAME.add(((AE0130010Struct) list.get(i)).getVEND_NAME());
		}
		return size;
	}
	public int setL2L_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_NAME == null) {
			l_ITEM_NAME = new ArrayList();
		} else {
			l_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_NAME.add(((AE0130010Struct) list.get(i)).getITEM_NAME());
		}
		return size;
	}
	public int setL2L_USER_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_USER_NAME == null) {
			l_USER_NAME = new ArrayList();
		} else {
			l_USER_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_USER_NAME.add(((AE0130010Struct) list.get(i)).getUSER_NAME());
		}
		return size;
	}
	public int setL2L_WH_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WH_NAME == null) {
			l_WH_NAME = new ArrayList();
		} else {
			l_WH_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WH_NAME.add(((AE0130010Struct) list.get(i)).getWH_NAME());
		}
		return size;
	}
	public int setL2L_l_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_COUNT == null) {
			l_l_COUNT = new ArrayList();
		} else {
			l_l_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_COUNT.add(((AE0130010Struct) list.get(i)).getl_COUNT());
		}
		return size;
	}
	public int setL2L_ROW_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ROW_COUNT == null) {
			l_ROW_COUNT = new ArrayList();
		} else {
			l_ROW_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ROW_COUNT.add(((AE0130010Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_DOWNLOAD_FILE = null;
		m_r1_RTN_DEL_FLG = null;
		m_r2_RTN_DEL_FLG = null;
		m_r3_RTN_DEL_FLG = null;
		m_h_lotCtrl = null;
		m_l_PLANT_CD = null;
		m_l_PUCH_ODR_CD = null;
		m_l_VEND_CD = null;
		m_l_VEND_ANAME = null;
		m_l_ITEM_CD = null;
		m_l_ITEM_NAME = null;
		m_l_LOT_NO = null;
		m_l_JOB_ODR_CD = null;
		m_l_INV_CTRL_FLG_DN = null;
		m_l_PUCH_ODR_PERSON = null;
		m_l_USER_NAME = null;
		m_l_PUCH_RTN_DATE = null;
		m_l_PUCH_RTN_QTY = null;
		m_l_WH_CD = null;
		m_l_WH_NAME = null;
		m_l_VEND_LOT_NO = null;
		m_l_UNIT_COST_TYP_DN = null;
		m_l_UNIT_COST = null;
		m_l_PROCESSING_COST = null;
		m_l_MATERIAL_COST = null;
		m_l_OTHER_OVERHEADS = null;
		m_l_PUCH_ODR_AMOUNT = null;
		m_l_DISC_AMOUNT = null;
		m_l_NET_AMOUNT = null;
		m_l_PUCH_RTN_COMMENT = null;
		m_l_RATE_JUDGE_DATE = null;
		m_l_EXCH_RATE = null;
		m_l_TAX_RATE_1 = null;
		m_l_TAX_RATE_2 = null;
		m_l_TAX_RATE_3 = null;
		m_l_TAX_AMOUNT_1 = null;
		m_l_TAX_AMOUNT_2 = null;
		m_l_TAX_AMOUNT_3 = null;
		m_l_AMOUNT_INCLUDE_TAX = null;
		m_l_HOME_CUR_AMOUNT = null;
		m_l_TAX_CD = null;
		m_l_TAX_ROUND_TYP_DN = null;
		m_l_RTN_DEL_FLG_DN = null;
		m_l_RTN_DEL_DATE = null;
		m_PLANT_CD = null;
		m_PUCH_RTN_DATE_FROM = null;
		m_PUCH_RTN_DATE_TO = null;
		m_JOB_ODR_CD = null;
		m_VEND_CD = null;
		m_ITEM_CD = null;
		m_PUCH_ODR_PERSON = null;
		m_WH_CD = null;
		m_PUCH_ODR_CD = null;
		m_RTN_DEL_FLG = null;
		m_PLANT_NAME = null;
		m_VEND_NAME = null;
		m_ITEM_NAME = null;
		m_USER_NAME = null;
		m_WH_NAME = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;

		l_DOWNLOAD_FILE = null;
		l_r1_RTN_DEL_FLG = null;
		l_r2_RTN_DEL_FLG = null;
		l_r3_RTN_DEL_FLG = null;
		l_h_lotCtrl = null;
		l_l_PLANT_CD = null;
		l_l_PUCH_ODR_CD = null;
		l_l_VEND_CD = null;
		l_l_VEND_ANAME = null;
		l_l_ITEM_CD = null;
		l_l_ITEM_NAME = null;
		l_l_LOT_NO = null;
		l_l_JOB_ODR_CD = null;
		l_l_INV_CTRL_FLG_DN = null;
		l_l_PUCH_ODR_PERSON = null;
		l_l_USER_NAME = null;
		l_l_PUCH_RTN_DATE = null;
		l_l_PUCH_RTN_QTY = null;
		l_l_WH_CD = null;
		l_l_WH_NAME = null;
		l_l_VEND_LOT_NO = null;
		l_l_UNIT_COST_TYP_DN = null;
		l_l_UNIT_COST = null;
		l_l_PROCESSING_COST = null;
		l_l_MATERIAL_COST = null;
		l_l_OTHER_OVERHEADS = null;
		l_l_PUCH_ODR_AMOUNT = null;
		l_l_DISC_AMOUNT = null;
		l_l_NET_AMOUNT = null;
		l_l_PUCH_RTN_COMMENT = null;
		l_l_RATE_JUDGE_DATE = null;
		l_l_EXCH_RATE = null;
		l_l_TAX_RATE_1 = null;
		l_l_TAX_RATE_2 = null;
		l_l_TAX_RATE_3 = null;
		l_l_TAX_AMOUNT_1 = null;
		l_l_TAX_AMOUNT_2 = null;
		l_l_TAX_AMOUNT_3 = null;
		l_l_AMOUNT_INCLUDE_TAX = null;
		l_l_HOME_CUR_AMOUNT = null;
		l_l_TAX_CD = null;
		l_l_TAX_ROUND_TYP_DN = null;
		l_l_RTN_DEL_FLG_DN = null;
		l_l_RTN_DEL_DATE = null;
		l_PLANT_CD = null;
		l_PUCH_RTN_DATE_FROM = null;
		l_PUCH_RTN_DATE_TO = null;
		l_JOB_ODR_CD = null;
		l_VEND_CD = null;
		l_ITEM_CD = null;
		l_PUCH_ODR_PERSON = null;
		l_WH_CD = null;
		l_PUCH_ODR_CD = null;
		l_RTN_DEL_FLG = null;
		l_PLANT_NAME = null;
		l_VEND_NAME = null;
		l_ITEM_NAME = null;
		l_USER_NAME = null;
		l_WH_NAME = null;
		l_l_COUNT = null;
		l_ROW_COUNT = null;

		return;
	}

	//////////////////////////////
	// Orteus標準Struct
	// ユーザコード
	public String sUser_ID = null;
	// set/getメソッド
	public String getsUser_ID() { return sUser_ID; }
	public void setsUser_ID(String val) { sUser_ID = val; }

	// 組織コード
	public String sOrganization_CD = null;
	// set/getメソッド
	public String getsOrganization_CD() { return sOrganization_CD; }
	public void setsOraganization_CD(String val) { sOrganization_CD = val; }

	// 処理日付
	public String sSysdate = null;
	// set/getメソッド
	public String getsSysdate() { return sSysdate; }
	public void setsSysdate(String val) { sSysdate = val; }
	//////////////////////////////

	/**
	 * medAE0130010クラスの標準コンストラクタ
	 */
	public AE0130010Struct()
	{
		//{{user_implement_code_constractor
			initialize();
			// TODO: ここに初期処理を記述してください
                //}}user_implement_code_constractor

		return;
	}

	/**
	 * インスタンス破壊時に行う処理
	 *
	 */
	protected void finalize()
	{
		clear();
		return;
	}

	/**
	 * データのセット(個別メンバ・リストメンバ両方)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStruct(AE0130010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setStructM(struct);
			this.setStructL(struct);
		}
	}

	/**
	 * データのセット(個別メンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructM(AE0130010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setr1_RTN_DEL_FLG(struct.getr1_RTN_DEL_FLG());
			this.setr2_RTN_DEL_FLG(struct.getr2_RTN_DEL_FLG());
			this.setr3_RTN_DEL_FLG(struct.getr3_RTN_DEL_FLG());
			this.seth_lotCtrl(struct.geth_lotCtrl());
			this.setl_PLANT_CD(struct.getl_PLANT_CD());
			this.setl_PUCH_ODR_CD(struct.getl_PUCH_ODR_CD());
			this.setl_VEND_CD(struct.getl_VEND_CD());
			this.setl_VEND_ANAME(struct.getl_VEND_ANAME());
			this.setl_ITEM_CD(struct.getl_ITEM_CD());
			this.setl_ITEM_NAME(struct.getl_ITEM_NAME());
			this.setl_LOT_NO(struct.getl_LOT_NO());
			this.setl_JOB_ODR_CD(struct.getl_JOB_ODR_CD());
			this.setl_INV_CTRL_FLG_DN(struct.getl_INV_CTRL_FLG_DN());
			this.setl_PUCH_ODR_PERSON(struct.getl_PUCH_ODR_PERSON());
			this.setl_USER_NAME(struct.getl_USER_NAME());
			this.setl_PUCH_RTN_DATE(struct.getl_PUCH_RTN_DATE());
			this.setl_PUCH_RTN_QTY(struct.getl_PUCH_RTN_QTY());
			this.setl_WH_CD(struct.getl_WH_CD());
			this.setl_WH_NAME(struct.getl_WH_NAME());
			this.setl_VEND_LOT_NO(struct.getl_VEND_LOT_NO());
			this.setl_UNIT_COST_TYP_DN(struct.getl_UNIT_COST_TYP_DN());
			this.setl_UNIT_COST(struct.getl_UNIT_COST());
			this.setl_PROCESSING_COST(struct.getl_PROCESSING_COST());
			this.setl_MATERIAL_COST(struct.getl_MATERIAL_COST());
			this.setl_OTHER_OVERHEADS(struct.getl_OTHER_OVERHEADS());
			this.setl_PUCH_ODR_AMOUNT(struct.getl_PUCH_ODR_AMOUNT());
			this.setl_DISC_AMOUNT(struct.getl_DISC_AMOUNT());
			this.setl_NET_AMOUNT(struct.getl_NET_AMOUNT());
			this.setl_PUCH_RTN_COMMENT(struct.getl_PUCH_RTN_COMMENT());
			this.setl_RATE_JUDGE_DATE(struct.getl_RATE_JUDGE_DATE());
			this.setl_EXCH_RATE(struct.getl_EXCH_RATE());
			this.setl_TAX_RATE_1(struct.getl_TAX_RATE_1());
			this.setl_TAX_RATE_2(struct.getl_TAX_RATE_2());
			this.setl_TAX_RATE_3(struct.getl_TAX_RATE_3());
			this.setl_TAX_AMOUNT_1(struct.getl_TAX_AMOUNT_1());
			this.setl_TAX_AMOUNT_2(struct.getl_TAX_AMOUNT_2());
			this.setl_TAX_AMOUNT_3(struct.getl_TAX_AMOUNT_3());
			this.setl_AMOUNT_INCLUDE_TAX(struct.getl_AMOUNT_INCLUDE_TAX());
			this.setl_HOME_CUR_AMOUNT(struct.getl_HOME_CUR_AMOUNT());
			this.setl_TAX_CD(struct.getl_TAX_CD());
			this.setl_TAX_ROUND_TYP_DN(struct.getl_TAX_ROUND_TYP_DN());
			this.setl_RTN_DEL_FLG_DN(struct.getl_RTN_DEL_FLG_DN());
			this.setl_RTN_DEL_DATE(struct.getl_RTN_DEL_DATE());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setPUCH_RTN_DATE_FROM(struct.getPUCH_RTN_DATE_FROM());
			this.setPUCH_RTN_DATE_TO(struct.getPUCH_RTN_DATE_TO());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setVEND_CD(struct.getVEND_CD());
			this.setITEM_CD(struct.getITEM_CD());
			this.setPUCH_ODR_PERSON(struct.getPUCH_ODR_PERSON());
			this.setWH_CD(struct.getWH_CD());
			this.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());
			this.setRTN_DEL_FLG(struct.getRTN_DEL_FLG());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.setVEND_NAME(struct.getVEND_NAME());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setUSER_NAME(struct.getUSER_NAME());
			this.setWH_NAME(struct.getWH_NAME());
			this.setl_COUNT(struct.getl_COUNT());
			this.setROW_COUNT(struct.getROW_COUNT());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AE0130010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_r1_RTN_DEL_FLG(struct.getList_r1_RTN_DEL_FLG());
			this.setList_r2_RTN_DEL_FLG(struct.getList_r2_RTN_DEL_FLG());
			this.setList_r3_RTN_DEL_FLG(struct.getList_r3_RTN_DEL_FLG());
			this.setList_h_lotCtrl(struct.getList_h_lotCtrl());
			this.setList_l_PLANT_CD(struct.getList_l_PLANT_CD());
			this.setList_l_PUCH_ODR_CD(struct.getList_l_PUCH_ODR_CD());
			this.setList_l_VEND_CD(struct.getList_l_VEND_CD());
			this.setList_l_VEND_ANAME(struct.getList_l_VEND_ANAME());
			this.setList_l_ITEM_CD(struct.getList_l_ITEM_CD());
			this.setList_l_ITEM_NAME(struct.getList_l_ITEM_NAME());
			this.setList_l_LOT_NO(struct.getList_l_LOT_NO());
			this.setList_l_JOB_ODR_CD(struct.getList_l_JOB_ODR_CD());
			this.setList_l_INV_CTRL_FLG_DN(struct.getList_l_INV_CTRL_FLG_DN());
			this.setList_l_PUCH_ODR_PERSON(struct.getList_l_PUCH_ODR_PERSON());
			this.setList_l_USER_NAME(struct.getList_l_USER_NAME());
			this.setList_l_PUCH_RTN_DATE(struct.getList_l_PUCH_RTN_DATE());
			this.setList_l_PUCH_RTN_QTY(struct.getList_l_PUCH_RTN_QTY());
			this.setList_l_WH_CD(struct.getList_l_WH_CD());
			this.setList_l_WH_NAME(struct.getList_l_WH_NAME());
			this.setList_l_VEND_LOT_NO(struct.getList_l_VEND_LOT_NO());
			this.setList_l_UNIT_COST_TYP_DN(struct.getList_l_UNIT_COST_TYP_DN());
			this.setList_l_UNIT_COST(struct.getList_l_UNIT_COST());
			this.setList_l_PROCESSING_COST(struct.getList_l_PROCESSING_COST());
			this.setList_l_MATERIAL_COST(struct.getList_l_MATERIAL_COST());
			this.setList_l_OTHER_OVERHEADS(struct.getList_l_OTHER_OVERHEADS());
			this.setList_l_PUCH_ODR_AMOUNT(struct.getList_l_PUCH_ODR_AMOUNT());
			this.setList_l_DISC_AMOUNT(struct.getList_l_DISC_AMOUNT());
			this.setList_l_NET_AMOUNT(struct.getList_l_NET_AMOUNT());
			this.setList_l_PUCH_RTN_COMMENT(struct.getList_l_PUCH_RTN_COMMENT());
			this.setList_l_RATE_JUDGE_DATE(struct.getList_l_RATE_JUDGE_DATE());
			this.setList_l_EXCH_RATE(struct.getList_l_EXCH_RATE());
			this.setList_l_TAX_RATE_1(struct.getList_l_TAX_RATE_1());
			this.setList_l_TAX_RATE_2(struct.getList_l_TAX_RATE_2());
			this.setList_l_TAX_RATE_3(struct.getList_l_TAX_RATE_3());
			this.setList_l_TAX_AMOUNT_1(struct.getList_l_TAX_AMOUNT_1());
			this.setList_l_TAX_AMOUNT_2(struct.getList_l_TAX_AMOUNT_2());
			this.setList_l_TAX_AMOUNT_3(struct.getList_l_TAX_AMOUNT_3());
			this.setList_l_AMOUNT_INCLUDE_TAX(struct.getList_l_AMOUNT_INCLUDE_TAX());
			this.setList_l_HOME_CUR_AMOUNT(struct.getList_l_HOME_CUR_AMOUNT());
			this.setList_l_TAX_CD(struct.getList_l_TAX_CD());
			this.setList_l_TAX_ROUND_TYP_DN(struct.getList_l_TAX_ROUND_TYP_DN());
			this.setList_l_RTN_DEL_FLG_DN(struct.getList_l_RTN_DEL_FLG_DN());
			this.setList_l_RTN_DEL_DATE(struct.getList_l_RTN_DEL_DATE());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_PUCH_RTN_DATE_FROM(struct.getList_PUCH_RTN_DATE_FROM());
			this.setList_PUCH_RTN_DATE_TO(struct.getList_PUCH_RTN_DATE_TO());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_PUCH_ODR_PERSON(struct.getList_PUCH_ODR_PERSON());
			this.setList_WH_CD(struct.getList_WH_CD());
			this.setList_PUCH_ODR_CD(struct.getList_PUCH_ODR_CD());
			this.setList_RTN_DEL_FLG(struct.getList_RTN_DEL_FLG());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_VEND_NAME(struct.getList_VEND_NAME());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_USER_NAME(struct.getList_USER_NAME());
			this.setList_WH_NAME(struct.getList_WH_NAME());
			this.setList_l_COUNT(struct.getList_l_COUNT());
			this.setList_ROW_COUNT(struct.getList_ROW_COUNT());
		}
	}

	/**
	 * オブジェクトの文字列表現を返します。
	 * ここでは、getXXXXで取得できるこのクラスの属性値（リストは除く）を返します。
	 * @return オブジェクトの文字列表現
	 */
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		java.lang.reflect.Method[] method = getClass().getDeclaredMethods();
		for (int i = 0; i < method.length; i++) {
			String name = method[i].getName();
			if (name.startsWith("get") && !name.startsWith("getList")) {
				try {
					buffer.append(name.substring(3));
					buffer.append("=[");
					buffer.append(method[i].invoke(this, new Object[]{}));
					buffer.append("], ");
				} catch (IllegalAccessException e) {
					buffer.append(name);
					buffer.append("is IllegalAccessException!! , ");
				} catch (java.lang.reflect.InvocationTargetException e) {
					buffer.append(name);
					buffer.append("is InvocationTargetException!! , ");
				}
			}
		}
		if (buffer.length() < 2) {
			return super.toString();
		}
		return buffer.substring(0, buffer.length() - 2);
	}

	//////////////////////////////
	// 初期値定義
	// 以下に初期化に使う定数の参考として再生成のたびに自動的に全メンバーのサンプルをコメントアウトして出力しています。
/*
	// 第 1 変数初期値： i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// 第 2 変数初期値： i_r1_RTN_DEL_FLG


	final static String i_r1_RTN_DEL_FLG = null;

	// 第 3 変数初期値： i_r2_RTN_DEL_FLG


	final static String i_r2_RTN_DEL_FLG = null;

	// 第 4 変数初期値： i_r3_RTN_DEL_FLG


	final static String i_r3_RTN_DEL_FLG = null;

	// 第 5 変数初期値： i_h_lotCtrl


	final static String i_h_lotCtrl = null;

	// 第 6 変数初期値： i_l_PLANT_CD


	final static String i_l_PLANT_CD = null;

	// 第 7 変数初期値： i_l_PUCH_ODR_CD


	final static String i_l_PUCH_ODR_CD = null;

	// 第 8 変数初期値： i_l_VEND_CD


	final static String i_l_VEND_CD = null;

	// 第 9 変数初期値： i_l_VEND_ANAME


	final static String i_l_VEND_ANAME = null;

	// 第 10 変数初期値： i_l_ITEM_CD


	final static String i_l_ITEM_CD = null;

	// 第 11 変数初期値： i_l_ITEM_NAME


	final static String i_l_ITEM_NAME = null;

	// 第 12 変数初期値： i_l_LOT_NO


	final static String i_l_LOT_NO = null;

	// 第 13 変数初期値： i_l_JOB_ODR_CD


	final static String i_l_JOB_ODR_CD = null;

	// 第 14 変数初期値： i_l_INV_CTRL_FLG_DN


	final static String i_l_INV_CTRL_FLG_DN = null;

	// 第 15 変数初期値： i_l_PUCH_ODR_PERSON


	final static String i_l_PUCH_ODR_PERSON = null;

	// 第 16 変数初期値： i_l_USER_NAME


	final static String i_l_USER_NAME = null;

	// 第 17 変数初期値： i_l_PUCH_RTN_DATE


	final static String i_l_PUCH_RTN_DATE = null;

	// 第 18 変数初期値： i_l_PUCH_RTN_QTY


	final static String i_l_PUCH_RTN_QTY = null;

	// 第 19 変数初期値： i_l_WH_CD


	final static String i_l_WH_CD = null;

	// 第 20 変数初期値： i_l_WH_NAME


	final static String i_l_WH_NAME = null;

	// 第 21 変数初期値： i_l_VEND_LOT_NO


	final static String i_l_VEND_LOT_NO = null;

	// 第 22 変数初期値： i_l_UNIT_COST_TYP_DN


	final static String i_l_UNIT_COST_TYP_DN = null;

	// 第 23 変数初期値： i_l_UNIT_COST


	final static String i_l_UNIT_COST = null;

	// 第 24 変数初期値： i_l_PROCESSING_COST


	final static String i_l_PROCESSING_COST = null;

	// 第 25 変数初期値： i_l_MATERIAL_COST


	final static String i_l_MATERIAL_COST = null;

	// 第 26 変数初期値： i_l_OTHER_OVERHEADS


	final static String i_l_OTHER_OVERHEADS = null;

	// 第 27 変数初期値： i_l_PUCH_ODR_AMOUNT


	final static String i_l_PUCH_ODR_AMOUNT = null;

	// 第 28 変数初期値： i_l_DISC_AMOUNT


	final static String i_l_DISC_AMOUNT = null;

	// 第 29 変数初期値： i_l_NET_AMOUNT


	final static String i_l_NET_AMOUNT = null;

	// 第 30 変数初期値： i_l_PUCH_RTN_COMMENT


	final static String i_l_PUCH_RTN_COMMENT = null;

	// 第 31 変数初期値： i_l_RATE_JUDGE_DATE


	final static String i_l_RATE_JUDGE_DATE = null;

	// 第 32 変数初期値： i_l_EXCH_RATE


	final static String i_l_EXCH_RATE = null;

	// 第 33 変数初期値： i_l_TAX_RATE_1


	final static String i_l_TAX_RATE_1 = null;

	// 第 34 変数初期値： i_l_TAX_RATE_2


	final static String i_l_TAX_RATE_2 = null;

	// 第 35 変数初期値： i_l_TAX_RATE_3


	final static String i_l_TAX_RATE_3 = null;

	// 第 36 変数初期値： i_l_TAX_AMOUNT_1


	final static String i_l_TAX_AMOUNT_1 = null;

	// 第 37 変数初期値： i_l_TAX_AMOUNT_2


	final static String i_l_TAX_AMOUNT_2 = null;

	// 第 38 変数初期値： i_l_TAX_AMOUNT_3


	final static String i_l_TAX_AMOUNT_3 = null;

	// 第 39 変数初期値： i_l_AMOUNT_INCLUDE_TAX


	final static String i_l_AMOUNT_INCLUDE_TAX = null;

	// 第 40 変数初期値： i_l_HOME_CUR_AMOUNT


	final static String i_l_HOME_CUR_AMOUNT = null;

	// 第 41 変数初期値： i_l_TAX_CD


	final static String i_l_TAX_CD = null;

	// 第 42 変数初期値： i_l_TAX_ROUND_TYP_DN


	final static String i_l_TAX_ROUND_TYP_DN = null;

	// 第 43 変数初期値： i_l_RTN_DEL_FLG_DN


	final static String i_l_RTN_DEL_FLG_DN = null;

	// 第 44 変数初期値： i_l_RTN_DEL_DATE


	final static String i_l_RTN_DEL_DATE = null;

	// 第 45 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

	// 第 46 変数初期値： i_PUCH_RTN_DATE_FROM


	final static String i_PUCH_RTN_DATE_FROM = null;

	// 第 47 変数初期値： i_PUCH_RTN_DATE_TO


	final static String i_PUCH_RTN_DATE_TO = null;

	// 第 48 変数初期値： i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// 第 49 変数初期値： i_VEND_CD


	final static String i_VEND_CD = null;

	// 第 50 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 51 変数初期値： i_PUCH_ODR_PERSON


	final static String i_PUCH_ODR_PERSON = null;

	// 第 52 変数初期値： i_WH_CD


	final static String i_WH_CD = null;

	// 第 53 変数初期値： i_PUCH_ODR_CD


	final static String i_PUCH_ODR_CD = null;

	// 第 54 変数初期値： i_RTN_DEL_FLG


	final static String i_RTN_DEL_FLG = null;

	// 第 55 変数初期値： i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// 第 56 変数初期値： i_VEND_NAME


	final static String i_VEND_NAME = null;

	// 第 57 変数初期値： i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// 第 58 変数初期値： i_USER_NAME


	final static String i_USER_NAME = null;

	// 第 59 変数初期値： i_WH_NAME


	final static String i_WH_NAME = null;

	// 第 60 変数初期値： i_l_COUNT


	final static String i_l_COUNT = null;

	// 第 61 変数初期値： i_ROW_COUNT


	final static String i_ROW_COUNT = null;

*/

	//{{user_implement_code
		// TODO: 初期化で使う定数は、ここに記述してください。
		// 以下に記述した内容は自動的には変更されません。
	// 第 1 変数初期値： i_DOWNLOAD_FILE

	final static String i_DOWNLOAD_FILE = null;

	// 第 2 変数初期値： i_r1_RTN_DEL_FLG

	final static String i_r1_RTN_DEL_FLG = null;

	// 第 3 変数初期値： i_r2_RTN_DEL_FLG

	final static String i_r2_RTN_DEL_FLG = null;

	// 第 4 変数初期値： i_r3_RTN_DEL_FLG

	final static String i_r3_RTN_DEL_FLG = null;

	// 第 5 変数初期値： i_l_PLANT_CD

	final static String i_l_PLANT_CD = null;

	// 第 6 変数初期値： i_l_PUCH_ODR_CD

	final static String i_l_PUCH_ODR_CD = null;

	// 第 7 変数初期値： i_l_VEND_CD

	final static String i_l_VEND_CD = null;

	// 第 8 変数初期値： i_l_VEND_ANAME

	final static String i_l_VEND_ANAME = null;

	// 第 9 変数初期値： i_l_ITEM_CD

	final static String i_l_ITEM_CD = null;

	// 第 10 変数初期値： i_l_ITEM_NAME

	final static String i_l_ITEM_NAME = null;

	// 第 11 変数初期値： i_l_JOB_ODR_CD

	final static String i_l_JOB_ODR_CD = null;

	// 第 12 変数初期値： i_l_INV_CTRL_FLG_DN

	final static String i_l_INV_CTRL_FLG_DN = null;

	// 第 13 変数初期値： i_l_PUCH_ODR_PERSON

	final static String i_l_PUCH_ODR_PERSON = null;

	// 第 14 変数初期値： i_l_USER_NAME

	final static String i_l_USER_NAME = null;

	// 第 15 変数初期値： i_l_PUCH_RTN_DATE

	final static String i_l_PUCH_RTN_DATE = null;

	// 第 16 変数初期値： i_l_PUCH_RTN_QTY

	final static String i_l_PUCH_RTN_QTY = null;

	// 第 17 変数初期値： i_l_WH_CD

	final static String i_l_WH_CD = null;

	// 第 18 変数初期値： i_l_WH_NAME

	final static String i_l_WH_NAME = null;

	// 第 19 変数初期値： i_l_VEND_LOT_NO

	final static String i_l_VEND_LOT_NO = null;

	// 第 20 変数初期値： i_l_UNIT_COST_TYP_DN

	final static String i_l_UNIT_COST_TYP_DN = null;

	// 第 21 変数初期値： i_l_UNIT_COST

	final static String i_l_UNIT_COST = null;

	// 第 22 変数初期値： i_l_PROCESSING_COST

	final static String i_l_PROCESSING_COST = null;

	// 第 23 変数初期値： i_l_MATERIAL_COST

	final static String i_l_MATERIAL_COST = null;

	// 第 24 変数初期値： i_l_OTHER_OVERHEADS

	final static String i_l_OTHER_OVERHEADS = null;

	// 第 25 変数初期値： i_l_PUCH_ODR_AMOUNT

	final static String i_l_PUCH_ODR_AMOUNT = null;

	// 第 26 変数初期値： i_l_DISC_AMOUNT

	final static String i_l_DISC_AMOUNT = null;

	// 第 27 変数初期値： i_l_NET_AMOUNT

	final static String i_l_NET_AMOUNT = null;

	// 第 28 変数初期値： i_l_PUCH_RTN_COMMENT

	final static String i_l_PUCH_RTN_COMMENT = null;

	// 第 29 変数初期値： i_l_RATE_JUDGE_DATE

	final static String i_l_RATE_JUDGE_DATE = null;

	// 第 30 変数初期値： i_l_EXCH_RATE

	final static String i_l_EXCH_RATE = null;

	// 第 31 変数初期値： i_l_TAX_RATE_1

	final static String i_l_TAX_RATE_1 = null;

	// 第 32 変数初期値： i_l_TAX_RATE_2

	final static String i_l_TAX_RATE_2 = null;

	// 第 33 変数初期値： i_l_TAX_RATE_3

	final static String i_l_TAX_RATE_3 = null;

	// 第 34 変数初期値： i_l_TAX_AMOUNT_1

	final static String i_l_TAX_AMOUNT_1 = null;

	// 第 35 変数初期値： i_l_TAX_AMOUNT_2

	final static String i_l_TAX_AMOUNT_2 = null;

	// 第 36 変数初期値： i_l_TAX_AMOUNT_3

	final static String i_l_TAX_AMOUNT_3 = null;

	// 第 37 変数初期値： i_l_AMOUNT_INCLUDE_TAX

	final static String i_l_AMOUNT_INCLUDE_TAX = null;

	// 第 38 変数初期値： i_l_HOME_CUR_AMOUNT

	final static String i_l_HOME_CUR_AMOUNT = null;

	// 第 39 変数初期値： i_l_TAX_CD

	final static String i_l_TAX_CD = null;

	// 第 40 変数初期値： i_l_TAX_ROUND_TYP

	final static String i_l_TAX_ROUND_TYP = null;

	// 第 41 変数初期値： i_l_RTN_DEL_FLG

	final static String i_l_RTN_DEL_FLG = null;

	// 第 42 変数初期値： i_PLANT_CD

	final static String i_PLANT_CD = null;

	// 第 43 変数初期値： i_PUCH_RTN_DATE_FROM

	final static String i_PUCH_RTN_DATE_FROM = null;

	// 第 44 変数初期値： i_PUCH_RTN_DATE_TO

	final static String i_PUCH_RTN_DATE_TO = null;

	// 第 45 変数初期値： i_JOB_ODR_CD

	final static String i_JOB_ODR_CD = null;

	// 第 46 変数初期値： i_VEND_CD

	final static String i_VEND_CD = null;

	// 第 47 変数初期値： i_ITEM_CD

	final static String i_ITEM_CD = null;

	// 第 48 変数初期値： i_PUCH_ODR_PERSON

	final static String i_PUCH_ODR_PERSON = null;

	// 第 49 変数初期値： i_WH_CD

	final static String i_WH_CD = null;

	// 第 50 変数初期値： i_PUCH_ODR_CD

	final static String i_PUCH_ODR_CD = null;

	// 第 51 変数初期値： i_RTN_DEL_FLG

	final static String i_RTN_DEL_FLG = null;

	// 第 52 変数初期値： i_PLANT_NAME

	final static String i_PLANT_NAME = null;

	// 第 53 変数初期値： i_VEND_NAME

	final static String i_VEND_NAME = null;

	// 第 54 変数初期値： i_ITEM_NAME

	final static String i_ITEM_NAME = null;

	// 第 55 変数初期値： i_USER_NAME

	final static String i_USER_NAME = null;

	// 第 56 変数初期値： i_WH_NAME

	final static String i_WH_NAME = null;


	/**
	 * 初期化
	 *
	 */
	public void initialize()
	{

		clear();

		m_DOWNLOAD_FILE = i_DOWNLOAD_FILE;
		m_r1_RTN_DEL_FLG = i_r1_RTN_DEL_FLG;
		m_r2_RTN_DEL_FLG = i_r2_RTN_DEL_FLG;
		m_r3_RTN_DEL_FLG = i_r3_RTN_DEL_FLG;
		m_l_PLANT_CD = i_l_PLANT_CD;
		m_l_PUCH_ODR_CD = i_l_PUCH_ODR_CD;
		m_l_VEND_CD = i_l_VEND_CD;
		m_l_VEND_ANAME = i_l_VEND_ANAME;
		m_l_ITEM_CD = i_l_ITEM_CD;
		m_l_ITEM_NAME = i_l_ITEM_NAME;
		m_l_JOB_ODR_CD = i_l_JOB_ODR_CD;
		m_l_INV_CTRL_FLG_DN = i_l_INV_CTRL_FLG_DN;
		m_l_PUCH_ODR_PERSON = i_l_PUCH_ODR_PERSON;
		m_l_USER_NAME = i_l_USER_NAME;
		m_l_PUCH_RTN_DATE = i_l_PUCH_RTN_DATE;
		m_l_PUCH_RTN_QTY = i_l_PUCH_RTN_QTY;
		m_l_WH_CD = i_l_WH_CD;
		m_l_WH_NAME = i_l_WH_NAME;
		m_l_VEND_LOT_NO = i_l_VEND_LOT_NO;
		m_l_UNIT_COST_TYP_DN = i_l_UNIT_COST_TYP_DN;
		m_l_UNIT_COST = i_l_UNIT_COST;
		m_l_PROCESSING_COST = i_l_PROCESSING_COST;
		m_l_MATERIAL_COST = i_l_MATERIAL_COST;
		m_l_OTHER_OVERHEADS = i_l_OTHER_OVERHEADS;
		m_l_PUCH_ODR_AMOUNT = i_l_PUCH_ODR_AMOUNT;
		m_l_DISC_AMOUNT = i_l_DISC_AMOUNT;
		m_l_NET_AMOUNT = i_l_NET_AMOUNT;
		m_l_PUCH_RTN_COMMENT = i_l_PUCH_RTN_COMMENT;
		m_l_RATE_JUDGE_DATE = i_l_RATE_JUDGE_DATE;
		m_l_EXCH_RATE = i_l_EXCH_RATE;
		m_l_TAX_RATE_1 = i_l_TAX_RATE_1;
		m_l_TAX_RATE_2 = i_l_TAX_RATE_2;
		m_l_TAX_RATE_3 = i_l_TAX_RATE_3;
		m_l_TAX_AMOUNT_1 = i_l_TAX_AMOUNT_1;
		m_l_TAX_AMOUNT_2 = i_l_TAX_AMOUNT_2;
		m_l_TAX_AMOUNT_3 = i_l_TAX_AMOUNT_3;
		m_l_AMOUNT_INCLUDE_TAX = i_l_AMOUNT_INCLUDE_TAX;
		m_l_HOME_CUR_AMOUNT = i_l_HOME_CUR_AMOUNT;
		m_l_TAX_CD = i_l_TAX_CD;
//		m_l_TAX_ROUND_TYP = i_l_TAX_ROUND_TYP;
//		m_l_RTN_DEL_FLG = i_l_RTN_DEL_FLG;
		m_PLANT_CD = i_PLANT_CD;
		m_PUCH_RTN_DATE_FROM = i_PUCH_RTN_DATE_FROM;
		m_PUCH_RTN_DATE_TO = i_PUCH_RTN_DATE_TO;
		m_JOB_ODR_CD = i_JOB_ODR_CD;
		m_VEND_CD = i_VEND_CD;
		m_ITEM_CD = i_ITEM_CD;
		m_PUCH_ODR_PERSON = i_PUCH_ODR_PERSON;
		m_WH_CD = i_WH_CD;
		m_PUCH_ODR_CD = i_PUCH_ODR_CD;
		m_RTN_DEL_FLG = i_RTN_DEL_FLG;
		m_PLANT_NAME = i_PLANT_NAME;
		m_VEND_NAME = i_VEND_NAME;
		m_ITEM_NAME = i_ITEM_NAME;
		m_USER_NAME = i_USER_NAME;
		m_WH_NAME = i_WH_NAME;
	}
		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
