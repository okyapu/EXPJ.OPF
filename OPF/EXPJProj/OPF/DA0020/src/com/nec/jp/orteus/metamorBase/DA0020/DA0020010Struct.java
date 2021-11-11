/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DA0020/src/com/nec/jp/orteus/metamorBase/DA0020/DA0020010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.DA0020;

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
//}}user_implement_code_header

public class DA0020010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_CS_PUCH_TYP */
	public String m_CS_PUCH_TYP = null;
	/** 第 2 変数： m_CS_PROC_CD */
	public String m_CS_PROC_CD = null;
	/** 第 3 変数： m_CS_PROC_NAME */
	public String m_CS_PROC_NAME = null;
	/** 第 4 変数： m_UNIT_COST_ACCEPT_TYP */
	public String m_UNIT_COST_ACCEPT_TYP = null;
	/** 第 5 変数： m_CLASIFICATION_CD */
	public String m_CLASIFICATION_CD = null;
	/** 第 6 変数： m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** 第 7 変数： m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** 第 8 変数： m_ORG_CD */
	public String m_ORG_CD = null;
	/** 第 9 変数： m_ORG_NAME */
	public String m_ORG_NAME = null;
	/** 第 10 変数： m_ONEROUS_CONS_FLG */
	public String m_ONEROUS_CONS_FLG = null;
	/** 第 11 変数： m_VEND_CD */
	public String m_VEND_CD = null;
	/** 第 12 変数： m_VEND_NAME */
	public String m_VEND_NAME = null;
	/** 第 13 変数： m_UNIT_COST */
	public String m_UNIT_COST = null;
	/** 第 14 変数： m_CUR_UNIT */
	public String m_CUR_UNIT = null;
	/** 第 15 変数： m_UNIT_COST_TYP */
	public String m_UNIT_COST_TYP = null;
	/** 第 16 変数： m_PUCH_UNIT_QTY */
	public String m_PUCH_UNIT_QTY = null;
	/** 第 17 変数： m_CUR_CD */
	public String m_CUR_CD = null;
	/** 第 18 変数： m_CUR_NAME */
	public String m_CUR_NAME = null;
	/** 第 19 変数： m_EXCH_RATE */
	public String m_EXCH_RATE = null;
	/** 第 20 変数： m_SUB_VEND_CD */
	public String m_SUB_VEND_CD = null;
	/** 第 21 変数： m_SUB_VEND_NAME */
	public String m_SUB_VEND_NAME = null;
	/** 第 22 変数： m_SUB_UNIT_COST */
	public String m_SUB_UNIT_COST = null;
	/** 第 23 変数： m_SUB_CUR_UNIT */
	public String m_SUB_CUR_UNIT = null;
	/** 第 24 変数： m_SUB_UNIT_COST_TYP */
	public String m_SUB_UNIT_COST_TYP = null;
	/** 第 25 変数： m_SUB_PUCH_UNIT_QTY */
	public String m_SUB_PUCH_UNIT_QTY = null;
	/** 第 26 変数： m_SUB_CUR_CD */
	public String m_SUB_CUR_CD = null;
	/** 第 27 変数： m_SUB_CUR_NAME */
	public String m_SUB_CUR_NAME = null;
	/** 第 28 変数： m_SUB_EXCH_RATE */
	public String m_SUB_EXCH_RATE = null;
	/** 第 29 変数： m_DEL_FLG */
	public String m_DEL_FLG = null;
	/** 第 30 変数： m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** 第 31 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** 第 32 変数： m_YEAR */
	public String m_YEAR = null;
	/** 第 33 変数： m_HALF_TERM_TYP */
	public String m_HALF_TERM_TYP = null;
	/** 第 34 変数： m_COST_TYP */
	public String m_COST_TYP = null;
	/** 第 35 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 36 変数： m_CURRENT_YEAR */
	public String m_CURRENT_YEAR = null;
	/** 第 37 変数： m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** 第 38 変数： m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** 第 39 変数： m_EXCH_TYP */
	public String m_EXCH_TYP = null;
	/** 第 40 変数： m_BUSINESS_OPR_DATE */
	public String m_BUSINESS_OPR_DATE = null;
	/** 第 41 変数： m_SUB_EXCH_TYP */
	public String m_SUB_EXCH_TYP = null;
	/** 第 42 変数： m_h_PLANT_CD */
	public String m_h_PLANT_CD = null;
	/** 第 43 変数： m_h_YEAR */
	public String m_h_YEAR = null;
	/** 第 44 変数： m_HALF_TERM_TYP_name */
	public String m_HALF_TERM_TYP_name = null;
	/** 第 45 変数： m_HALF_TERM_TYP_val */
	public String m_HALF_TERM_TYP_val = null;
	/** 第 46 変数： m_h_HALF_TERM_TYP */
	public String m_h_HALF_TERM_TYP = null;
	/** 第 47 変数： m_COST_TYP_name */
	public String m_COST_TYP_name = null;
	/** 第 48 変数： m_COST_TYP_val */
	public String m_COST_TYP_val = null;
	/** 第 49 変数： m_h_COST_TYP */
	public String m_h_COST_TYP = null;
	/** 第 50 変数： m_h_ITEM_CD */
	public String m_h_ITEM_CD = null;
	/** 第 51 変数： m_CS_PUCH_TYP_name */
	public String m_CS_PUCH_TYP_name = null;
	/** 第 52 変数： m_CS_PUCH_TYP_val */
	public String m_CS_PUCH_TYP_val = null;
	/** 第 53 変数： m_h_CS_PUCH_TYP */
	public String m_h_CS_PUCH_TYP = null;
	/** 第 54 変数： m_UNIT_COST_ACCEPT_TYP_name */
	public String m_UNIT_COST_ACCEPT_TYP_name = null;
	/** 第 55 変数： m_UNIT_COST_ACCEPT_TYP_val */
	public String m_UNIT_COST_ACCEPT_TYP_val = null;
	/** 第 56 変数： m_ONEROUS_CONS_FLG_name */
	public String m_ONEROUS_CONS_FLG_name = null;
	/** 第 57 変数： m_ONEROUS_CONS_FLG_val */
	public String m_ONEROUS_CONS_FLG_val = null;
	/** 第 58 変数： m_UNIT_COST_TYP_name */
	public String m_UNIT_COST_TYP_name = null;
	/** 第 59 変数： m_UNIT_COST_TYP_val */
	public String m_UNIT_COST_TYP_val = null;
	/** 第 60 変数： m_SUB_UNIT_COST_TYP_name */
	public String m_SUB_UNIT_COST_TYP_name = null;
	/** 第 61 変数： m_SUB_UNIT_COST_TYP_val */
	public String m_SUB_UNIT_COST_TYP_val = null;
	/** 第 62 変数： m_c_NoCheckClasificationCd */
	public String m_c_NoCheckClasificationCd = null;
	/** 第 63 変数： m_c_NoCheckStockUnit */
	public String m_c_NoCheckStockUnit = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_CS_PUCH_TYP */
	public List l_CS_PUCH_TYP = null;

	/** 第 2 List変数： l_CS_PROC_CD */
	public List l_CS_PROC_CD = null;

	/** 第 3 List変数： l_CS_PROC_NAME */
	public List l_CS_PROC_NAME = null;

	/** 第 4 List変数： l_UNIT_COST_ACCEPT_TYP */
	public List l_UNIT_COST_ACCEPT_TYP = null;

	/** 第 5 List変数： l_CLASIFICATION_CD */
	public List l_CLASIFICATION_CD = null;

	/** 第 6 List変数： l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** 第 7 List変数： l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** 第 8 List変数： l_ORG_CD */
	public List l_ORG_CD = null;

	/** 第 9 List変数： l_ORG_NAME */
	public List l_ORG_NAME = null;

	/** 第 10 List変数： l_ONEROUS_CONS_FLG */
	public List l_ONEROUS_CONS_FLG = null;

	/** 第 11 List変数： l_VEND_CD */
	public List l_VEND_CD = null;

	/** 第 12 List変数： l_VEND_NAME */
	public List l_VEND_NAME = null;

	/** 第 13 List変数： l_UNIT_COST */
	public List l_UNIT_COST = null;

	/** 第 14 List変数： l_CUR_UNIT */
	public List l_CUR_UNIT = null;

	/** 第 15 List変数： l_UNIT_COST_TYP */
	public List l_UNIT_COST_TYP = null;

	/** 第 16 List変数： l_PUCH_UNIT_QTY */
	public List l_PUCH_UNIT_QTY = null;

	/** 第 17 List変数： l_CUR_CD */
	public List l_CUR_CD = null;

	/** 第 18 List変数： l_CUR_NAME */
	public List l_CUR_NAME = null;

	/** 第 19 List変数： l_EXCH_RATE */
	public List l_EXCH_RATE = null;

	/** 第 20 List変数： l_SUB_VEND_CD */
	public List l_SUB_VEND_CD = null;

	/** 第 21 List変数： l_SUB_VEND_NAME */
	public List l_SUB_VEND_NAME = null;

	/** 第 22 List変数： l_SUB_UNIT_COST */
	public List l_SUB_UNIT_COST = null;

	/** 第 23 List変数： l_SUB_CUR_UNIT */
	public List l_SUB_CUR_UNIT = null;

	/** 第 24 List変数： l_SUB_UNIT_COST_TYP */
	public List l_SUB_UNIT_COST_TYP = null;

	/** 第 25 List変数： l_SUB_PUCH_UNIT_QTY */
	public List l_SUB_PUCH_UNIT_QTY = null;

	/** 第 26 List変数： l_SUB_CUR_CD */
	public List l_SUB_CUR_CD = null;

	/** 第 27 List変数： l_SUB_CUR_NAME */
	public List l_SUB_CUR_NAME = null;

	/** 第 28 List変数： l_SUB_EXCH_RATE */
	public List l_SUB_EXCH_RATE = null;

	/** 第 29 List変数： l_DEL_FLG */
	public List l_DEL_FLG = null;

	/** 第 30 List変数： l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** 第 31 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** 第 32 List変数： l_YEAR */
	public List l_YEAR = null;

	/** 第 33 List変数： l_HALF_TERM_TYP */
	public List l_HALF_TERM_TYP = null;

	/** 第 34 List変数： l_COST_TYP */
	public List l_COST_TYP = null;

	/** 第 35 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 36 List変数： l_CURRENT_YEAR */
	public List l_CURRENT_YEAR = null;

	/** 第 37 List変数： l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** 第 38 List変数： l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** 第 39 List変数： l_EXCH_TYP */
	public List l_EXCH_TYP = null;

	/** 第 40 List変数： l_BUSINESS_OPR_DATE */
	public List l_BUSINESS_OPR_DATE = null;

	/** 第 41 List変数： l_SUB_EXCH_TYP */
	public List l_SUB_EXCH_TYP = null;

	/** 第 42 List変数： l_h_PLANT_CD */
	public List l_h_PLANT_CD = null;

	/** 第 43 List変数： l_h_YEAR */
	public List l_h_YEAR = null;

	/** 第 44 List変数： l_HALF_TERM_TYP_name */
	public List l_HALF_TERM_TYP_name = null;

	/** 第 45 List変数： l_HALF_TERM_TYP_val */
	public List l_HALF_TERM_TYP_val = null;

	/** 第 46 List変数： l_h_HALF_TERM_TYP */
	public List l_h_HALF_TERM_TYP = null;

	/** 第 47 List変数： l_COST_TYP_name */
	public List l_COST_TYP_name = null;

	/** 第 48 List変数： l_COST_TYP_val */
	public List l_COST_TYP_val = null;

	/** 第 49 List変数： l_h_COST_TYP */
	public List l_h_COST_TYP = null;

	/** 第 50 List変数： l_h_ITEM_CD */
	public List l_h_ITEM_CD = null;

	/** 第 51 List変数： l_CS_PUCH_TYP_name */
	public List l_CS_PUCH_TYP_name = null;

	/** 第 52 List変数： l_CS_PUCH_TYP_val */
	public List l_CS_PUCH_TYP_val = null;

	/** 第 53 List変数： l_h_CS_PUCH_TYP */
	public List l_h_CS_PUCH_TYP = null;

	/** 第 54 List変数： l_UNIT_COST_ACCEPT_TYP_name */
	public List l_UNIT_COST_ACCEPT_TYP_name = null;

	/** 第 55 List変数： l_UNIT_COST_ACCEPT_TYP_val */
	public List l_UNIT_COST_ACCEPT_TYP_val = null;

	/** 第 56 List変数： l_ONEROUS_CONS_FLG_name */
	public List l_ONEROUS_CONS_FLG_name = null;

	/** 第 57 List変数： l_ONEROUS_CONS_FLG_val */
	public List l_ONEROUS_CONS_FLG_val = null;

	/** 第 58 List変数： l_UNIT_COST_TYP_name */
	public List l_UNIT_COST_TYP_name = null;

	/** 第 59 List変数： l_UNIT_COST_TYP_val */
	public List l_UNIT_COST_TYP_val = null;

	/** 第 60 List変数： l_SUB_UNIT_COST_TYP_name */
	public List l_SUB_UNIT_COST_TYP_name = null;

	/** 第 61 List変数： l_SUB_UNIT_COST_TYP_val */
	public List l_SUB_UNIT_COST_TYP_val = null;

	/** 第 62 List変数： l_c_NoCheckClasificationCd */
	public List l_c_NoCheckClasificationCd = null;

	/** 第 63 List変数： l_c_NoCheckStockUnit */
	public List l_c_NoCheckStockUnit = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getCS_PUCH_TYP() { return m_CS_PUCH_TYP; }
	public String getCS_PROC_CD() { return m_CS_PROC_CD; }
	public String getCS_PROC_NAME() { return m_CS_PROC_NAME; }
	public String getUNIT_COST_ACCEPT_TYP() { return m_UNIT_COST_ACCEPT_TYP; }
	public String getCLASIFICATION_CD() { return m_CLASIFICATION_CD; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getORG_CD() { return m_ORG_CD; }
	public String getORG_NAME() { return m_ORG_NAME; }
	public String getONEROUS_CONS_FLG() { return m_ONEROUS_CONS_FLG; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getVEND_NAME() { return m_VEND_NAME; }
	public String getUNIT_COST() { return m_UNIT_COST; }
	public String getCUR_UNIT() { return m_CUR_UNIT; }
	public String getUNIT_COST_TYP() { return m_UNIT_COST_TYP; }
	public String getPUCH_UNIT_QTY() { return m_PUCH_UNIT_QTY; }
	public String getCUR_CD() { return m_CUR_CD; }
	public String getCUR_NAME() { return m_CUR_NAME; }
	public String getEXCH_RATE() { return m_EXCH_RATE; }
	public String getSUB_VEND_CD() { return m_SUB_VEND_CD; }
	public String getSUB_VEND_NAME() { return m_SUB_VEND_NAME; }
	public String getSUB_UNIT_COST() { return m_SUB_UNIT_COST; }
	public String getSUB_CUR_UNIT() { return m_SUB_CUR_UNIT; }
	public String getSUB_UNIT_COST_TYP() { return m_SUB_UNIT_COST_TYP; }
	public String getSUB_PUCH_UNIT_QTY() { return m_SUB_PUCH_UNIT_QTY; }
	public String getSUB_CUR_CD() { return m_SUB_CUR_CD; }
	public String getSUB_CUR_NAME() { return m_SUB_CUR_NAME; }
	public String getSUB_EXCH_RATE() { return m_SUB_EXCH_RATE; }
	public String getDEL_FLG() { return m_DEL_FLG; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getYEAR() { return m_YEAR; }
	public String getHALF_TERM_TYP() { return m_HALF_TERM_TYP; }
	public String getCOST_TYP() { return m_COST_TYP; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getCURRENT_YEAR() { return m_CURRENT_YEAR; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getEXCH_TYP() { return m_EXCH_TYP; }
	public String getBUSINESS_OPR_DATE() { return m_BUSINESS_OPR_DATE; }
	public String getSUB_EXCH_TYP() { return m_SUB_EXCH_TYP; }
	public String geth_PLANT_CD() { return m_h_PLANT_CD; }
	public String geth_YEAR() { return m_h_YEAR; }
	public String getHALF_TERM_TYP_name() { return m_HALF_TERM_TYP_name; }
	public String getHALF_TERM_TYP_val() { return m_HALF_TERM_TYP_val; }
	public String geth_HALF_TERM_TYP() { return m_h_HALF_TERM_TYP; }
	public String getCOST_TYP_name() { return m_COST_TYP_name; }
	public String getCOST_TYP_val() { return m_COST_TYP_val; }
	public String geth_COST_TYP() { return m_h_COST_TYP; }
	public String geth_ITEM_CD() { return m_h_ITEM_CD; }
	public String getCS_PUCH_TYP_name() { return m_CS_PUCH_TYP_name; }
	public String getCS_PUCH_TYP_val() { return m_CS_PUCH_TYP_val; }
	public String geth_CS_PUCH_TYP() { return m_h_CS_PUCH_TYP; }
	public String getUNIT_COST_ACCEPT_TYP_name() { return m_UNIT_COST_ACCEPT_TYP_name; }
	public String getUNIT_COST_ACCEPT_TYP_val() { return m_UNIT_COST_ACCEPT_TYP_val; }
	public String getONEROUS_CONS_FLG_name() { return m_ONEROUS_CONS_FLG_name; }
	public String getONEROUS_CONS_FLG_val() { return m_ONEROUS_CONS_FLG_val; }
	public String getUNIT_COST_TYP_name() { return m_UNIT_COST_TYP_name; }
	public String getUNIT_COST_TYP_val() { return m_UNIT_COST_TYP_val; }
	public String getSUB_UNIT_COST_TYP_name() { return m_SUB_UNIT_COST_TYP_name; }
	public String getSUB_UNIT_COST_TYP_val() { return m_SUB_UNIT_COST_TYP_val; }
	public String getc_NoCheckClasificationCd() { return m_c_NoCheckClasificationCd; }
	public String getc_NoCheckStockUnit() { return m_c_NoCheckStockUnit; }

	public List getList_CS_PUCH_TYP() { return l_CS_PUCH_TYP; }
	public List getList_CS_PROC_CD() { return l_CS_PROC_CD; }
	public List getList_CS_PROC_NAME() { return l_CS_PROC_NAME; }
	public List getList_UNIT_COST_ACCEPT_TYP() { return l_UNIT_COST_ACCEPT_TYP; }
	public List getList_CLASIFICATION_CD() { return l_CLASIFICATION_CD; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_ORG_CD() { return l_ORG_CD; }
	public List getList_ORG_NAME() { return l_ORG_NAME; }
	public List getList_ONEROUS_CONS_FLG() { return l_ONEROUS_CONS_FLG; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_VEND_NAME() { return l_VEND_NAME; }
	public List getList_UNIT_COST() { return l_UNIT_COST; }
	public List getList_CUR_UNIT() { return l_CUR_UNIT; }
	public List getList_UNIT_COST_TYP() { return l_UNIT_COST_TYP; }
	public List getList_PUCH_UNIT_QTY() { return l_PUCH_UNIT_QTY; }
	public List getList_CUR_CD() { return l_CUR_CD; }
	public List getList_CUR_NAME() { return l_CUR_NAME; }
	public List getList_EXCH_RATE() { return l_EXCH_RATE; }
	public List getList_SUB_VEND_CD() { return l_SUB_VEND_CD; }
	public List getList_SUB_VEND_NAME() { return l_SUB_VEND_NAME; }
	public List getList_SUB_UNIT_COST() { return l_SUB_UNIT_COST; }
	public List getList_SUB_CUR_UNIT() { return l_SUB_CUR_UNIT; }
	public List getList_SUB_UNIT_COST_TYP() { return l_SUB_UNIT_COST_TYP; }
	public List getList_SUB_PUCH_UNIT_QTY() { return l_SUB_PUCH_UNIT_QTY; }
	public List getList_SUB_CUR_CD() { return l_SUB_CUR_CD; }
	public List getList_SUB_CUR_NAME() { return l_SUB_CUR_NAME; }
	public List getList_SUB_EXCH_RATE() { return l_SUB_EXCH_RATE; }
	public List getList_DEL_FLG() { return l_DEL_FLG; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_YEAR() { return l_YEAR; }
	public List getList_HALF_TERM_TYP() { return l_HALF_TERM_TYP; }
	public List getList_COST_TYP() { return l_COST_TYP; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_CURRENT_YEAR() { return l_CURRENT_YEAR; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_EXCH_TYP() { return l_EXCH_TYP; }
	public List getList_BUSINESS_OPR_DATE() { return l_BUSINESS_OPR_DATE; }
	public List getList_SUB_EXCH_TYP() { return l_SUB_EXCH_TYP; }
	public List getList_h_PLANT_CD() { return l_h_PLANT_CD; }
	public List getList_h_YEAR() { return l_h_YEAR; }
	public List getList_HALF_TERM_TYP_name() { return l_HALF_TERM_TYP_name; }
	public List getList_HALF_TERM_TYP_val() { return l_HALF_TERM_TYP_val; }
	public List getList_h_HALF_TERM_TYP() { return l_h_HALF_TERM_TYP; }
	public List getList_COST_TYP_name() { return l_COST_TYP_name; }
	public List getList_COST_TYP_val() { return l_COST_TYP_val; }
	public List getList_h_COST_TYP() { return l_h_COST_TYP; }
	public List getList_h_ITEM_CD() { return l_h_ITEM_CD; }
	public List getList_CS_PUCH_TYP_name() { return l_CS_PUCH_TYP_name; }
	public List getList_CS_PUCH_TYP_val() { return l_CS_PUCH_TYP_val; }
	public List getList_h_CS_PUCH_TYP() { return l_h_CS_PUCH_TYP; }
	public List getList_UNIT_COST_ACCEPT_TYP_name() { return l_UNIT_COST_ACCEPT_TYP_name; }
	public List getList_UNIT_COST_ACCEPT_TYP_val() { return l_UNIT_COST_ACCEPT_TYP_val; }
	public List getList_ONEROUS_CONS_FLG_name() { return l_ONEROUS_CONS_FLG_name; }
	public List getList_ONEROUS_CONS_FLG_val() { return l_ONEROUS_CONS_FLG_val; }
	public List getList_UNIT_COST_TYP_name() { return l_UNIT_COST_TYP_name; }
	public List getList_UNIT_COST_TYP_val() { return l_UNIT_COST_TYP_val; }
	public List getList_SUB_UNIT_COST_TYP_name() { return l_SUB_UNIT_COST_TYP_name; }
	public List getList_SUB_UNIT_COST_TYP_val() { return l_SUB_UNIT_COST_TYP_val; }
	public List getList_c_NoCheckClasificationCd() { return l_c_NoCheckClasificationCd; }
	public List getList_c_NoCheckStockUnit() { return l_c_NoCheckStockUnit; }

	public void setCS_PUCH_TYP(String val) { m_CS_PUCH_TYP = val; }
	public void setCS_PROC_CD(String val) { m_CS_PROC_CD = val; }
	public void setCS_PROC_NAME(String val) { m_CS_PROC_NAME = val; }
	public void setUNIT_COST_ACCEPT_TYP(String val) { m_UNIT_COST_ACCEPT_TYP = val; }
	public void setCLASIFICATION_CD(String val) { m_CLASIFICATION_CD = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setORG_CD(String val) { m_ORG_CD = val; }
	public void setORG_NAME(String val) { m_ORG_NAME = val; }
	public void setONEROUS_CONS_FLG(String val) { m_ONEROUS_CONS_FLG = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void setVEND_NAME(String val) { m_VEND_NAME = val; }
	public void setUNIT_COST(String val) { m_UNIT_COST = val; }
	public void setCUR_UNIT(String val) { m_CUR_UNIT = val; }
	public void setUNIT_COST_TYP(String val) { m_UNIT_COST_TYP = val; }
	public void setPUCH_UNIT_QTY(String val) { m_PUCH_UNIT_QTY = val; }
	public void setCUR_CD(String val) { m_CUR_CD = val; }
	public void setCUR_NAME(String val) { m_CUR_NAME = val; }
	public void setEXCH_RATE(String val) { m_EXCH_RATE = val; }
	public void setSUB_VEND_CD(String val) { m_SUB_VEND_CD = val; }
	public void setSUB_VEND_NAME(String val) { m_SUB_VEND_NAME = val; }
	public void setSUB_UNIT_COST(String val) { m_SUB_UNIT_COST = val; }
	public void setSUB_CUR_UNIT(String val) { m_SUB_CUR_UNIT = val; }
	public void setSUB_UNIT_COST_TYP(String val) { m_SUB_UNIT_COST_TYP = val; }
	public void setSUB_PUCH_UNIT_QTY(String val) { m_SUB_PUCH_UNIT_QTY = val; }
	public void setSUB_CUR_CD(String val) { m_SUB_CUR_CD = val; }
	public void setSUB_CUR_NAME(String val) { m_SUB_CUR_NAME = val; }
	public void setSUB_EXCH_RATE(String val) { m_SUB_EXCH_RATE = val; }
	public void setDEL_FLG(String val) { m_DEL_FLG = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setYEAR(String val) { m_YEAR = val; }
	public void setHALF_TERM_TYP(String val) { m_HALF_TERM_TYP = val; }
	public void setCOST_TYP(String val) { m_COST_TYP = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setCURRENT_YEAR(String val) { m_CURRENT_YEAR = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setEXCH_TYP(String val) { m_EXCH_TYP = val; }
	public void setBUSINESS_OPR_DATE(String val) { m_BUSINESS_OPR_DATE = val; }
	public void setSUB_EXCH_TYP(String val) { m_SUB_EXCH_TYP = val; }
	public void seth_PLANT_CD(String val) { m_h_PLANT_CD = val; }
	public void seth_YEAR(String val) { m_h_YEAR = val; }
	public void setHALF_TERM_TYP_name(String val) { m_HALF_TERM_TYP_name = val; }
	public void setHALF_TERM_TYP_val(String val) { m_HALF_TERM_TYP_val = val; }
	public void seth_HALF_TERM_TYP(String val) { m_h_HALF_TERM_TYP = val; }
	public void setCOST_TYP_name(String val) { m_COST_TYP_name = val; }
	public void setCOST_TYP_val(String val) { m_COST_TYP_val = val; }
	public void seth_COST_TYP(String val) { m_h_COST_TYP = val; }
	public void seth_ITEM_CD(String val) { m_h_ITEM_CD = val; }
	public void setCS_PUCH_TYP_name(String val) { m_CS_PUCH_TYP_name = val; }
	public void setCS_PUCH_TYP_val(String val) { m_CS_PUCH_TYP_val = val; }
	public void seth_CS_PUCH_TYP(String val) { m_h_CS_PUCH_TYP = val; }
	public void setUNIT_COST_ACCEPT_TYP_name(String val) { m_UNIT_COST_ACCEPT_TYP_name = val; }
	public void setUNIT_COST_ACCEPT_TYP_val(String val) { m_UNIT_COST_ACCEPT_TYP_val = val; }
	public void setONEROUS_CONS_FLG_name(String val) { m_ONEROUS_CONS_FLG_name = val; }
	public void setONEROUS_CONS_FLG_val(String val) { m_ONEROUS_CONS_FLG_val = val; }
	public void setUNIT_COST_TYP_name(String val) { m_UNIT_COST_TYP_name = val; }
	public void setUNIT_COST_TYP_val(String val) { m_UNIT_COST_TYP_val = val; }
	public void setSUB_UNIT_COST_TYP_name(String val) { m_SUB_UNIT_COST_TYP_name = val; }
	public void setSUB_UNIT_COST_TYP_val(String val) { m_SUB_UNIT_COST_TYP_val = val; }
	public void setc_NoCheckClasificationCd(String val) { m_c_NoCheckClasificationCd = val; }
	public void setc_NoCheckStockUnit(String val) { m_c_NoCheckStockUnit = val; }


	public void setList_CS_PUCH_TYP(List list) { l_CS_PUCH_TYP = list; }
	public void setList_CS_PROC_CD(List list) { l_CS_PROC_CD = list; }
	public void setList_CS_PROC_NAME(List list) { l_CS_PROC_NAME = list; }
	public void setList_UNIT_COST_ACCEPT_TYP(List list) { l_UNIT_COST_ACCEPT_TYP = list; }
	public void setList_CLASIFICATION_CD(List list) { l_CLASIFICATION_CD = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_ORG_CD(List list) { l_ORG_CD = list; }
	public void setList_ORG_NAME(List list) { l_ORG_NAME = list; }
	public void setList_ONEROUS_CONS_FLG(List list) { l_ONEROUS_CONS_FLG = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_VEND_NAME(List list) { l_VEND_NAME = list; }
	public void setList_UNIT_COST(List list) { l_UNIT_COST = list; }
	public void setList_CUR_UNIT(List list) { l_CUR_UNIT = list; }
	public void setList_UNIT_COST_TYP(List list) { l_UNIT_COST_TYP = list; }
	public void setList_PUCH_UNIT_QTY(List list) { l_PUCH_UNIT_QTY = list; }
	public void setList_CUR_CD(List list) { l_CUR_CD = list; }
	public void setList_CUR_NAME(List list) { l_CUR_NAME = list; }
	public void setList_EXCH_RATE(List list) { l_EXCH_RATE = list; }
	public void setList_SUB_VEND_CD(List list) { l_SUB_VEND_CD = list; }
	public void setList_SUB_VEND_NAME(List list) { l_SUB_VEND_NAME = list; }
	public void setList_SUB_UNIT_COST(List list) { l_SUB_UNIT_COST = list; }
	public void setList_SUB_CUR_UNIT(List list) { l_SUB_CUR_UNIT = list; }
	public void setList_SUB_UNIT_COST_TYP(List list) { l_SUB_UNIT_COST_TYP = list; }
	public void setList_SUB_PUCH_UNIT_QTY(List list) { l_SUB_PUCH_UNIT_QTY = list; }
	public void setList_SUB_CUR_CD(List list) { l_SUB_CUR_CD = list; }
	public void setList_SUB_CUR_NAME(List list) { l_SUB_CUR_NAME = list; }
	public void setList_SUB_EXCH_RATE(List list) { l_SUB_EXCH_RATE = list; }
	public void setList_DEL_FLG(List list) { l_DEL_FLG = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_YEAR(List list) { l_YEAR = list; }
	public void setList_HALF_TERM_TYP(List list) { l_HALF_TERM_TYP = list; }
	public void setList_COST_TYP(List list) { l_COST_TYP = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_CURRENT_YEAR(List list) { l_CURRENT_YEAR = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_EXCH_TYP(List list) { l_EXCH_TYP = list; }
	public void setList_BUSINESS_OPR_DATE(List list) { l_BUSINESS_OPR_DATE = list; }
	public void setList_SUB_EXCH_TYP(List list) { l_SUB_EXCH_TYP = list; }
	public void setList_h_PLANT_CD(List list) { l_h_PLANT_CD = list; }
	public void setList_h_YEAR(List list) { l_h_YEAR = list; }
	public void setList_HALF_TERM_TYP_name(List list) { l_HALF_TERM_TYP_name = list; }
	public void setList_HALF_TERM_TYP_val(List list) { l_HALF_TERM_TYP_val = list; }
	public void setList_h_HALF_TERM_TYP(List list) { l_h_HALF_TERM_TYP = list; }
	public void setList_COST_TYP_name(List list) { l_COST_TYP_name = list; }
	public void setList_COST_TYP_val(List list) { l_COST_TYP_val = list; }
	public void setList_h_COST_TYP(List list) { l_h_COST_TYP = list; }
	public void setList_h_ITEM_CD(List list) { l_h_ITEM_CD = list; }
	public void setList_CS_PUCH_TYP_name(List list) { l_CS_PUCH_TYP_name = list; }
	public void setList_CS_PUCH_TYP_val(List list) { l_CS_PUCH_TYP_val = list; }
	public void setList_h_CS_PUCH_TYP(List list) { l_h_CS_PUCH_TYP = list; }
	public void setList_UNIT_COST_ACCEPT_TYP_name(List list) { l_UNIT_COST_ACCEPT_TYP_name = list; }
	public void setList_UNIT_COST_ACCEPT_TYP_val(List list) { l_UNIT_COST_ACCEPT_TYP_val = list; }
	public void setList_ONEROUS_CONS_FLG_name(List list) { l_ONEROUS_CONS_FLG_name = list; }
	public void setList_ONEROUS_CONS_FLG_val(List list) { l_ONEROUS_CONS_FLG_val = list; }
	public void setList_UNIT_COST_TYP_name(List list) { l_UNIT_COST_TYP_name = list; }
	public void setList_UNIT_COST_TYP_val(List list) { l_UNIT_COST_TYP_val = list; }
	public void setList_SUB_UNIT_COST_TYP_name(List list) { l_SUB_UNIT_COST_TYP_name = list; }
	public void setList_SUB_UNIT_COST_TYP_val(List list) { l_SUB_UNIT_COST_TYP_val = list; }
	public void setList_c_NoCheckClasificationCd(List list) { l_c_NoCheckClasificationCd = list; }
	public void setList_c_NoCheckStockUnit(List list) { l_c_NoCheckStockUnit = list; }

	public int setL2L_CS_PUCH_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CS_PUCH_TYP == null) {
			l_CS_PUCH_TYP = new ArrayList();
		} else {
			l_CS_PUCH_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CS_PUCH_TYP.add(((DA0020010Struct) list.get(i)).getCS_PUCH_TYP());
		}
		return size;
	}
	public int setL2L_CS_PROC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CS_PROC_CD == null) {
			l_CS_PROC_CD = new ArrayList();
		} else {
			l_CS_PROC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CS_PROC_CD.add(((DA0020010Struct) list.get(i)).getCS_PROC_CD());
		}
		return size;
	}
	public int setL2L_CS_PROC_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CS_PROC_NAME == null) {
			l_CS_PROC_NAME = new ArrayList();
		} else {
			l_CS_PROC_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CS_PROC_NAME.add(((DA0020010Struct) list.get(i)).getCS_PROC_NAME());
		}
		return size;
	}
	public int setL2L_UNIT_COST_ACCEPT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_COST_ACCEPT_TYP == null) {
			l_UNIT_COST_ACCEPT_TYP = new ArrayList();
		} else {
			l_UNIT_COST_ACCEPT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_COST_ACCEPT_TYP.add(((DA0020010Struct) list.get(i)).getUNIT_COST_ACCEPT_TYP());
		}
		return size;
	}
	public int setL2L_CLASIFICATION_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CLASIFICATION_CD == null) {
			l_CLASIFICATION_CD = new ArrayList();
		} else {
			l_CLASIFICATION_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CLASIFICATION_CD.add(((DA0020010Struct) list.get(i)).getCLASIFICATION_CD());
		}
		return size;
	}
	public int setL2L_STOCK_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_UNIT == null) {
			l_STOCK_UNIT = new ArrayList();
		} else {
			l_STOCK_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_UNIT.add(((DA0020010Struct) list.get(i)).getSTOCK_UNIT());
		}
		return size;
	}
	public int setL2L_COMPANY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COMPANY_CD == null) {
			l_COMPANY_CD = new ArrayList();
		} else {
			l_COMPANY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COMPANY_CD.add(((DA0020010Struct) list.get(i)).getCOMPANY_CD());
		}
		return size;
	}
	public int setL2L_ORG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ORG_CD == null) {
			l_ORG_CD = new ArrayList();
		} else {
			l_ORG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ORG_CD.add(((DA0020010Struct) list.get(i)).getORG_CD());
		}
		return size;
	}
	public int setL2L_ORG_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ORG_NAME == null) {
			l_ORG_NAME = new ArrayList();
		} else {
			l_ORG_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ORG_NAME.add(((DA0020010Struct) list.get(i)).getORG_NAME());
		}
		return size;
	}
	public int setL2L_ONEROUS_CONS_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ONEROUS_CONS_FLG == null) {
			l_ONEROUS_CONS_FLG = new ArrayList();
		} else {
			l_ONEROUS_CONS_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ONEROUS_CONS_FLG.add(((DA0020010Struct) list.get(i)).getONEROUS_CONS_FLG());
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
			l_VEND_CD.add(((DA0020010Struct) list.get(i)).getVEND_CD());
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
			l_VEND_NAME.add(((DA0020010Struct) list.get(i)).getVEND_NAME());
		}
		return size;
	}
	public int setL2L_UNIT_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_COST == null) {
			l_UNIT_COST = new ArrayList();
		} else {
			l_UNIT_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_COST.add(((DA0020010Struct) list.get(i)).getUNIT_COST());
		}
		return size;
	}
	public int setL2L_CUR_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUR_UNIT == null) {
			l_CUR_UNIT = new ArrayList();
		} else {
			l_CUR_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUR_UNIT.add(((DA0020010Struct) list.get(i)).getCUR_UNIT());
		}
		return size;
	}
	public int setL2L_UNIT_COST_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_COST_TYP == null) {
			l_UNIT_COST_TYP = new ArrayList();
		} else {
			l_UNIT_COST_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_COST_TYP.add(((DA0020010Struct) list.get(i)).getUNIT_COST_TYP());
		}
		return size;
	}
	public int setL2L_PUCH_UNIT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_UNIT_QTY == null) {
			l_PUCH_UNIT_QTY = new ArrayList();
		} else {
			l_PUCH_UNIT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_UNIT_QTY.add(((DA0020010Struct) list.get(i)).getPUCH_UNIT_QTY());
		}
		return size;
	}
	public int setL2L_CUR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUR_CD == null) {
			l_CUR_CD = new ArrayList();
		} else {
			l_CUR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUR_CD.add(((DA0020010Struct) list.get(i)).getCUR_CD());
		}
		return size;
	}
	public int setL2L_CUR_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUR_NAME == null) {
			l_CUR_NAME = new ArrayList();
		} else {
			l_CUR_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUR_NAME.add(((DA0020010Struct) list.get(i)).getCUR_NAME());
		}
		return size;
	}
	public int setL2L_EXCH_RATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXCH_RATE == null) {
			l_EXCH_RATE = new ArrayList();
		} else {
			l_EXCH_RATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXCH_RATE.add(((DA0020010Struct) list.get(i)).getEXCH_RATE());
		}
		return size;
	}
	public int setL2L_SUB_VEND_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUB_VEND_CD == null) {
			l_SUB_VEND_CD = new ArrayList();
		} else {
			l_SUB_VEND_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUB_VEND_CD.add(((DA0020010Struct) list.get(i)).getSUB_VEND_CD());
		}
		return size;
	}
	public int setL2L_SUB_VEND_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUB_VEND_NAME == null) {
			l_SUB_VEND_NAME = new ArrayList();
		} else {
			l_SUB_VEND_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUB_VEND_NAME.add(((DA0020010Struct) list.get(i)).getSUB_VEND_NAME());
		}
		return size;
	}
	public int setL2L_SUB_UNIT_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUB_UNIT_COST == null) {
			l_SUB_UNIT_COST = new ArrayList();
		} else {
			l_SUB_UNIT_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUB_UNIT_COST.add(((DA0020010Struct) list.get(i)).getSUB_UNIT_COST());
		}
		return size;
	}
	public int setL2L_SUB_CUR_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUB_CUR_UNIT == null) {
			l_SUB_CUR_UNIT = new ArrayList();
		} else {
			l_SUB_CUR_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUB_CUR_UNIT.add(((DA0020010Struct) list.get(i)).getSUB_CUR_UNIT());
		}
		return size;
	}
	public int setL2L_SUB_UNIT_COST_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUB_UNIT_COST_TYP == null) {
			l_SUB_UNIT_COST_TYP = new ArrayList();
		} else {
			l_SUB_UNIT_COST_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUB_UNIT_COST_TYP.add(((DA0020010Struct) list.get(i)).getSUB_UNIT_COST_TYP());
		}
		return size;
	}
	public int setL2L_SUB_PUCH_UNIT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUB_PUCH_UNIT_QTY == null) {
			l_SUB_PUCH_UNIT_QTY = new ArrayList();
		} else {
			l_SUB_PUCH_UNIT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUB_PUCH_UNIT_QTY.add(((DA0020010Struct) list.get(i)).getSUB_PUCH_UNIT_QTY());
		}
		return size;
	}
	public int setL2L_SUB_CUR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUB_CUR_CD == null) {
			l_SUB_CUR_CD = new ArrayList();
		} else {
			l_SUB_CUR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUB_CUR_CD.add(((DA0020010Struct) list.get(i)).getSUB_CUR_CD());
		}
		return size;
	}
	public int setL2L_SUB_CUR_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUB_CUR_NAME == null) {
			l_SUB_CUR_NAME = new ArrayList();
		} else {
			l_SUB_CUR_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUB_CUR_NAME.add(((DA0020010Struct) list.get(i)).getSUB_CUR_NAME());
		}
		return size;
	}
	public int setL2L_SUB_EXCH_RATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUB_EXCH_RATE == null) {
			l_SUB_EXCH_RATE = new ArrayList();
		} else {
			l_SUB_EXCH_RATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUB_EXCH_RATE.add(((DA0020010Struct) list.get(i)).getSUB_EXCH_RATE());
		}
		return size;
	}
	public int setL2L_DEL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEL_FLG == null) {
			l_DEL_FLG = new ArrayList();
		} else {
			l_DEL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEL_FLG.add(((DA0020010Struct) list.get(i)).getDEL_FLG());
		}
		return size;
	}
	public int setL2L_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MODIFY_COUNT == null) {
			l_MODIFY_COUNT = new ArrayList();
		} else {
			l_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MODIFY_COUNT.add(((DA0020010Struct) list.get(i)).getMODIFY_COUNT());
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
			l_PLANT_CD.add(((DA0020010Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_YEAR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_YEAR == null) {
			l_YEAR = new ArrayList();
		} else {
			l_YEAR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_YEAR.add(((DA0020010Struct) list.get(i)).getYEAR());
		}
		return size;
	}
	public int setL2L_HALF_TERM_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HALF_TERM_TYP == null) {
			l_HALF_TERM_TYP = new ArrayList();
		} else {
			l_HALF_TERM_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HALF_TERM_TYP.add(((DA0020010Struct) list.get(i)).getHALF_TERM_TYP());
		}
		return size;
	}
	public int setL2L_COST_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COST_TYP == null) {
			l_COST_TYP = new ArrayList();
		} else {
			l_COST_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COST_TYP.add(((DA0020010Struct) list.get(i)).getCOST_TYP());
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
			l_ITEM_CD.add(((DA0020010Struct) list.get(i)).getITEM_CD());
		}
		return size;
	}
	public int setL2L_CURRENT_YEAR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CURRENT_YEAR == null) {
			l_CURRENT_YEAR = new ArrayList();
		} else {
			l_CURRENT_YEAR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CURRENT_YEAR.add(((DA0020010Struct) list.get(i)).getCURRENT_YEAR());
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
			l_PLANT_NAME.add(((DA0020010Struct) list.get(i)).getPLANT_NAME());
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
			l_ITEM_NAME.add(((DA0020010Struct) list.get(i)).getITEM_NAME());
		}
		return size;
	}
	public int setL2L_EXCH_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXCH_TYP == null) {
			l_EXCH_TYP = new ArrayList();
		} else {
			l_EXCH_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXCH_TYP.add(((DA0020010Struct) list.get(i)).getEXCH_TYP());
		}
		return size;
	}
	public int setL2L_BUSINESS_OPR_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BUSINESS_OPR_DATE == null) {
			l_BUSINESS_OPR_DATE = new ArrayList();
		} else {
			l_BUSINESS_OPR_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BUSINESS_OPR_DATE.add(((DA0020010Struct) list.get(i)).getBUSINESS_OPR_DATE());
		}
		return size;
	}
	public int setL2L_SUB_EXCH_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUB_EXCH_TYP == null) {
			l_SUB_EXCH_TYP = new ArrayList();
		} else {
			l_SUB_EXCH_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUB_EXCH_TYP.add(((DA0020010Struct) list.get(i)).getSUB_EXCH_TYP());
		}
		return size;
	}
	public int setL2L_h_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PLANT_CD == null) {
			l_h_PLANT_CD = new ArrayList();
		} else {
			l_h_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PLANT_CD.add(((DA0020010Struct) list.get(i)).geth_PLANT_CD());
		}
		return size;
	}
	public int setL2L_h_YEAR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_YEAR == null) {
			l_h_YEAR = new ArrayList();
		} else {
			l_h_YEAR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_YEAR.add(((DA0020010Struct) list.get(i)).geth_YEAR());
		}
		return size;
	}
	public int setL2L_HALF_TERM_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HALF_TERM_TYP_name == null) {
			l_HALF_TERM_TYP_name = new ArrayList();
		} else {
			l_HALF_TERM_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HALF_TERM_TYP_name.add(((DA0020010Struct) list.get(i)).getHALF_TERM_TYP_name());
		}
		return size;
	}
	public int setL2L_HALF_TERM_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HALF_TERM_TYP_val == null) {
			l_HALF_TERM_TYP_val = new ArrayList();
		} else {
			l_HALF_TERM_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HALF_TERM_TYP_val.add(((DA0020010Struct) list.get(i)).getHALF_TERM_TYP_val());
		}
		return size;
	}
	public int setL2L_h_HALF_TERM_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_HALF_TERM_TYP == null) {
			l_h_HALF_TERM_TYP = new ArrayList();
		} else {
			l_h_HALF_TERM_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_HALF_TERM_TYP.add(((DA0020010Struct) list.get(i)).geth_HALF_TERM_TYP());
		}
		return size;
	}
	public int setL2L_COST_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COST_TYP_name == null) {
			l_COST_TYP_name = new ArrayList();
		} else {
			l_COST_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COST_TYP_name.add(((DA0020010Struct) list.get(i)).getCOST_TYP_name());
		}
		return size;
	}
	public int setL2L_COST_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COST_TYP_val == null) {
			l_COST_TYP_val = new ArrayList();
		} else {
			l_COST_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COST_TYP_val.add(((DA0020010Struct) list.get(i)).getCOST_TYP_val());
		}
		return size;
	}
	public int setL2L_h_COST_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_COST_TYP == null) {
			l_h_COST_TYP = new ArrayList();
		} else {
			l_h_COST_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_COST_TYP.add(((DA0020010Struct) list.get(i)).geth_COST_TYP());
		}
		return size;
	}
	public int setL2L_h_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ITEM_CD == null) {
			l_h_ITEM_CD = new ArrayList();
		} else {
			l_h_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ITEM_CD.add(((DA0020010Struct) list.get(i)).geth_ITEM_CD());
		}
		return size;
	}
	public int setL2L_CS_PUCH_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CS_PUCH_TYP_name == null) {
			l_CS_PUCH_TYP_name = new ArrayList();
		} else {
			l_CS_PUCH_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CS_PUCH_TYP_name.add(((DA0020010Struct) list.get(i)).getCS_PUCH_TYP_name());
		}
		return size;
	}
	public int setL2L_CS_PUCH_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CS_PUCH_TYP_val == null) {
			l_CS_PUCH_TYP_val = new ArrayList();
		} else {
			l_CS_PUCH_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CS_PUCH_TYP_val.add(((DA0020010Struct) list.get(i)).getCS_PUCH_TYP_val());
		}
		return size;
	}
	public int setL2L_h_CS_PUCH_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_CS_PUCH_TYP == null) {
			l_h_CS_PUCH_TYP = new ArrayList();
		} else {
			l_h_CS_PUCH_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_CS_PUCH_TYP.add(((DA0020010Struct) list.get(i)).geth_CS_PUCH_TYP());
		}
		return size;
	}
	public int setL2L_UNIT_COST_ACCEPT_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_COST_ACCEPT_TYP_name == null) {
			l_UNIT_COST_ACCEPT_TYP_name = new ArrayList();
		} else {
			l_UNIT_COST_ACCEPT_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_COST_ACCEPT_TYP_name.add(((DA0020010Struct) list.get(i)).getUNIT_COST_ACCEPT_TYP_name());
		}
		return size;
	}
	public int setL2L_UNIT_COST_ACCEPT_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_COST_ACCEPT_TYP_val == null) {
			l_UNIT_COST_ACCEPT_TYP_val = new ArrayList();
		} else {
			l_UNIT_COST_ACCEPT_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_COST_ACCEPT_TYP_val.add(((DA0020010Struct) list.get(i)).getUNIT_COST_ACCEPT_TYP_val());
		}
		return size;
	}
	public int setL2L_ONEROUS_CONS_FLG_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ONEROUS_CONS_FLG_name == null) {
			l_ONEROUS_CONS_FLG_name = new ArrayList();
		} else {
			l_ONEROUS_CONS_FLG_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ONEROUS_CONS_FLG_name.add(((DA0020010Struct) list.get(i)).getONEROUS_CONS_FLG_name());
		}
		return size;
	}
	public int setL2L_ONEROUS_CONS_FLG_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ONEROUS_CONS_FLG_val == null) {
			l_ONEROUS_CONS_FLG_val = new ArrayList();
		} else {
			l_ONEROUS_CONS_FLG_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ONEROUS_CONS_FLG_val.add(((DA0020010Struct) list.get(i)).getONEROUS_CONS_FLG_val());
		}
		return size;
	}
	public int setL2L_UNIT_COST_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_COST_TYP_name == null) {
			l_UNIT_COST_TYP_name = new ArrayList();
		} else {
			l_UNIT_COST_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_COST_TYP_name.add(((DA0020010Struct) list.get(i)).getUNIT_COST_TYP_name());
		}
		return size;
	}
	public int setL2L_UNIT_COST_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_COST_TYP_val == null) {
			l_UNIT_COST_TYP_val = new ArrayList();
		} else {
			l_UNIT_COST_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_COST_TYP_val.add(((DA0020010Struct) list.get(i)).getUNIT_COST_TYP_val());
		}
		return size;
	}
	public int setL2L_SUB_UNIT_COST_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUB_UNIT_COST_TYP_name == null) {
			l_SUB_UNIT_COST_TYP_name = new ArrayList();
		} else {
			l_SUB_UNIT_COST_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUB_UNIT_COST_TYP_name.add(((DA0020010Struct) list.get(i)).getSUB_UNIT_COST_TYP_name());
		}
		return size;
	}
	public int setL2L_SUB_UNIT_COST_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUB_UNIT_COST_TYP_val == null) {
			l_SUB_UNIT_COST_TYP_val = new ArrayList();
		} else {
			l_SUB_UNIT_COST_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUB_UNIT_COST_TYP_val.add(((DA0020010Struct) list.get(i)).getSUB_UNIT_COST_TYP_val());
		}
		return size;
	}
	public int setL2L_c_NoCheckClasificationCd(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_NoCheckClasificationCd == null) {
			l_c_NoCheckClasificationCd = new ArrayList();
		} else {
			l_c_NoCheckClasificationCd.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_NoCheckClasificationCd.add(((DA0020010Struct) list.get(i)).getc_NoCheckClasificationCd());
		}
		return size;
	}
	public int setL2L_c_NoCheckStockUnit(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_NoCheckStockUnit == null) {
			l_c_NoCheckStockUnit = new ArrayList();
		} else {
			l_c_NoCheckStockUnit.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_NoCheckStockUnit.add(((DA0020010Struct) list.get(i)).getc_NoCheckStockUnit());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_CS_PUCH_TYP = null;
		m_CS_PROC_CD = null;
		m_CS_PROC_NAME = null;
		m_UNIT_COST_ACCEPT_TYP = null;
		m_CLASIFICATION_CD = null;
		m_STOCK_UNIT = null;
		m_COMPANY_CD = null;
		m_ORG_CD = null;
		m_ORG_NAME = null;
		m_ONEROUS_CONS_FLG = null;
		m_VEND_CD = null;
		m_VEND_NAME = null;
		m_UNIT_COST = null;
		m_CUR_UNIT = null;
		m_UNIT_COST_TYP = null;
		m_PUCH_UNIT_QTY = null;
		m_CUR_CD = null;
		m_CUR_NAME = null;
		m_EXCH_RATE = null;
		m_SUB_VEND_CD = null;
		m_SUB_VEND_NAME = null;
		m_SUB_UNIT_COST = null;
		m_SUB_CUR_UNIT = null;
		m_SUB_UNIT_COST_TYP = null;
		m_SUB_PUCH_UNIT_QTY = null;
		m_SUB_CUR_CD = null;
		m_SUB_CUR_NAME = null;
		m_SUB_EXCH_RATE = null;
		m_DEL_FLG = null;
		m_MODIFY_COUNT = null;
		m_PLANT_CD = null;
		m_YEAR = null;
		m_HALF_TERM_TYP = null;
		m_COST_TYP = null;
		m_ITEM_CD = null;
		m_CURRENT_YEAR = null;
		m_PLANT_NAME = null;
		m_ITEM_NAME = null;
		m_EXCH_TYP = null;
		m_BUSINESS_OPR_DATE = null;
		m_SUB_EXCH_TYP = null;
		m_h_PLANT_CD = null;
		m_h_YEAR = null;
		m_HALF_TERM_TYP_name = null;
		m_HALF_TERM_TYP_val = null;
		m_h_HALF_TERM_TYP = null;
		m_COST_TYP_name = null;
		m_COST_TYP_val = null;
		m_h_COST_TYP = null;
		m_h_ITEM_CD = null;
		m_CS_PUCH_TYP_name = null;
		m_CS_PUCH_TYP_val = null;
		m_h_CS_PUCH_TYP = null;
		m_UNIT_COST_ACCEPT_TYP_name = null;
		m_UNIT_COST_ACCEPT_TYP_val = null;
		m_ONEROUS_CONS_FLG_name = null;
		m_ONEROUS_CONS_FLG_val = null;
		m_UNIT_COST_TYP_name = null;
		m_UNIT_COST_TYP_val = null;
		m_SUB_UNIT_COST_TYP_name = null;
		m_SUB_UNIT_COST_TYP_val = null;
		m_c_NoCheckClasificationCd = null;
		m_c_NoCheckStockUnit = null;

		l_CS_PUCH_TYP = null;
		l_CS_PROC_CD = null;
		l_CS_PROC_NAME = null;
		l_UNIT_COST_ACCEPT_TYP = null;
		l_CLASIFICATION_CD = null;
		l_STOCK_UNIT = null;
		l_COMPANY_CD = null;
		l_ORG_CD = null;
		l_ORG_NAME = null;
		l_ONEROUS_CONS_FLG = null;
		l_VEND_CD = null;
		l_VEND_NAME = null;
		l_UNIT_COST = null;
		l_CUR_UNIT = null;
		l_UNIT_COST_TYP = null;
		l_PUCH_UNIT_QTY = null;
		l_CUR_CD = null;
		l_CUR_NAME = null;
		l_EXCH_RATE = null;
		l_SUB_VEND_CD = null;
		l_SUB_VEND_NAME = null;
		l_SUB_UNIT_COST = null;
		l_SUB_CUR_UNIT = null;
		l_SUB_UNIT_COST_TYP = null;
		l_SUB_PUCH_UNIT_QTY = null;
		l_SUB_CUR_CD = null;
		l_SUB_CUR_NAME = null;
		l_SUB_EXCH_RATE = null;
		l_DEL_FLG = null;
		l_MODIFY_COUNT = null;
		l_PLANT_CD = null;
		l_YEAR = null;
		l_HALF_TERM_TYP = null;
		l_COST_TYP = null;
		l_ITEM_CD = null;
		l_CURRENT_YEAR = null;
		l_PLANT_NAME = null;
		l_ITEM_NAME = null;
		l_EXCH_TYP = null;
		l_BUSINESS_OPR_DATE = null;
		l_SUB_EXCH_TYP = null;
		l_h_PLANT_CD = null;
		l_h_YEAR = null;
		l_HALF_TERM_TYP_name = null;
		l_HALF_TERM_TYP_val = null;
		l_h_HALF_TERM_TYP = null;
		l_COST_TYP_name = null;
		l_COST_TYP_val = null;
		l_h_COST_TYP = null;
		l_h_ITEM_CD = null;
		l_CS_PUCH_TYP_name = null;
		l_CS_PUCH_TYP_val = null;
		l_h_CS_PUCH_TYP = null;
		l_UNIT_COST_ACCEPT_TYP_name = null;
		l_UNIT_COST_ACCEPT_TYP_val = null;
		l_ONEROUS_CONS_FLG_name = null;
		l_ONEROUS_CONS_FLG_val = null;
		l_UNIT_COST_TYP_name = null;
		l_UNIT_COST_TYP_val = null;
		l_SUB_UNIT_COST_TYP_name = null;
		l_SUB_UNIT_COST_TYP_val = null;
		l_c_NoCheckClasificationCd = null;
		l_c_NoCheckStockUnit = null;

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
	 * medDA0020010クラスの標準コンストラクタ
	 */
	public DA0020010Struct()
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
	public void setStruct(DA0020010Struct struct)
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
	public void setStructM(DA0020010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setCS_PUCH_TYP(struct.getCS_PUCH_TYP());
			this.setCS_PROC_CD(struct.getCS_PROC_CD());
			this.setCS_PROC_NAME(struct.getCS_PROC_NAME());
			this.setUNIT_COST_ACCEPT_TYP(struct.getUNIT_COST_ACCEPT_TYP());
			this.setCLASIFICATION_CD(struct.getCLASIFICATION_CD());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setORG_CD(struct.getORG_CD());
			this.setORG_NAME(struct.getORG_NAME());
			this.setONEROUS_CONS_FLG(struct.getONEROUS_CONS_FLG());
			this.setVEND_CD(struct.getVEND_CD());
			this.setVEND_NAME(struct.getVEND_NAME());
			this.setUNIT_COST(struct.getUNIT_COST());
			this.setCUR_UNIT(struct.getCUR_UNIT());
			this.setUNIT_COST_TYP(struct.getUNIT_COST_TYP());
			this.setPUCH_UNIT_QTY(struct.getPUCH_UNIT_QTY());
			this.setCUR_CD(struct.getCUR_CD());
			this.setCUR_NAME(struct.getCUR_NAME());
			this.setEXCH_RATE(struct.getEXCH_RATE());
			this.setSUB_VEND_CD(struct.getSUB_VEND_CD());
			this.setSUB_VEND_NAME(struct.getSUB_VEND_NAME());
			this.setSUB_UNIT_COST(struct.getSUB_UNIT_COST());
			this.setSUB_CUR_UNIT(struct.getSUB_CUR_UNIT());
			this.setSUB_UNIT_COST_TYP(struct.getSUB_UNIT_COST_TYP());
			this.setSUB_PUCH_UNIT_QTY(struct.getSUB_PUCH_UNIT_QTY());
			this.setSUB_CUR_CD(struct.getSUB_CUR_CD());
			this.setSUB_CUR_NAME(struct.getSUB_CUR_NAME());
			this.setSUB_EXCH_RATE(struct.getSUB_EXCH_RATE());
			this.setDEL_FLG(struct.getDEL_FLG());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setYEAR(struct.getYEAR());
			this.setHALF_TERM_TYP(struct.getHALF_TERM_TYP());
			this.setCOST_TYP(struct.getCOST_TYP());
			this.setITEM_CD(struct.getITEM_CD());
			this.setCURRENT_YEAR(struct.getCURRENT_YEAR());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setEXCH_TYP(struct.getEXCH_TYP());
			this.setBUSINESS_OPR_DATE(struct.getBUSINESS_OPR_DATE());
			this.setSUB_EXCH_TYP(struct.getSUB_EXCH_TYP());
			this.seth_PLANT_CD(struct.geth_PLANT_CD());
			this.seth_YEAR(struct.geth_YEAR());
			this.setHALF_TERM_TYP_name(struct.getHALF_TERM_TYP_name());
			this.setHALF_TERM_TYP_val(struct.getHALF_TERM_TYP_val());
			this.seth_HALF_TERM_TYP(struct.geth_HALF_TERM_TYP());
			this.setCOST_TYP_name(struct.getCOST_TYP_name());
			this.setCOST_TYP_val(struct.getCOST_TYP_val());
			this.seth_COST_TYP(struct.geth_COST_TYP());
			this.seth_ITEM_CD(struct.geth_ITEM_CD());
			this.setCS_PUCH_TYP_name(struct.getCS_PUCH_TYP_name());
			this.setCS_PUCH_TYP_val(struct.getCS_PUCH_TYP_val());
			this.seth_CS_PUCH_TYP(struct.geth_CS_PUCH_TYP());
			this.setUNIT_COST_ACCEPT_TYP_name(struct.getUNIT_COST_ACCEPT_TYP_name());
			this.setUNIT_COST_ACCEPT_TYP_val(struct.getUNIT_COST_ACCEPT_TYP_val());
			this.setONEROUS_CONS_FLG_name(struct.getONEROUS_CONS_FLG_name());
			this.setONEROUS_CONS_FLG_val(struct.getONEROUS_CONS_FLG_val());
			this.setUNIT_COST_TYP_name(struct.getUNIT_COST_TYP_name());
			this.setUNIT_COST_TYP_val(struct.getUNIT_COST_TYP_val());
			this.setSUB_UNIT_COST_TYP_name(struct.getSUB_UNIT_COST_TYP_name());
			this.setSUB_UNIT_COST_TYP_val(struct.getSUB_UNIT_COST_TYP_val());
			this.setc_NoCheckClasificationCd(struct.getc_NoCheckClasificationCd());
			this.setc_NoCheckStockUnit(struct.getc_NoCheckStockUnit());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(DA0020010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_CS_PUCH_TYP(struct.getList_CS_PUCH_TYP());
			this.setList_CS_PROC_CD(struct.getList_CS_PROC_CD());
			this.setList_CS_PROC_NAME(struct.getList_CS_PROC_NAME());
			this.setList_UNIT_COST_ACCEPT_TYP(struct.getList_UNIT_COST_ACCEPT_TYP());
			this.setList_CLASIFICATION_CD(struct.getList_CLASIFICATION_CD());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_ORG_CD(struct.getList_ORG_CD());
			this.setList_ORG_NAME(struct.getList_ORG_NAME());
			this.setList_ONEROUS_CONS_FLG(struct.getList_ONEROUS_CONS_FLG());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_VEND_NAME(struct.getList_VEND_NAME());
			this.setList_UNIT_COST(struct.getList_UNIT_COST());
			this.setList_CUR_UNIT(struct.getList_CUR_UNIT());
			this.setList_UNIT_COST_TYP(struct.getList_UNIT_COST_TYP());
			this.setList_PUCH_UNIT_QTY(struct.getList_PUCH_UNIT_QTY());
			this.setList_CUR_CD(struct.getList_CUR_CD());
			this.setList_CUR_NAME(struct.getList_CUR_NAME());
			this.setList_EXCH_RATE(struct.getList_EXCH_RATE());
			this.setList_SUB_VEND_CD(struct.getList_SUB_VEND_CD());
			this.setList_SUB_VEND_NAME(struct.getList_SUB_VEND_NAME());
			this.setList_SUB_UNIT_COST(struct.getList_SUB_UNIT_COST());
			this.setList_SUB_CUR_UNIT(struct.getList_SUB_CUR_UNIT());
			this.setList_SUB_UNIT_COST_TYP(struct.getList_SUB_UNIT_COST_TYP());
			this.setList_SUB_PUCH_UNIT_QTY(struct.getList_SUB_PUCH_UNIT_QTY());
			this.setList_SUB_CUR_CD(struct.getList_SUB_CUR_CD());
			this.setList_SUB_CUR_NAME(struct.getList_SUB_CUR_NAME());
			this.setList_SUB_EXCH_RATE(struct.getList_SUB_EXCH_RATE());
			this.setList_DEL_FLG(struct.getList_DEL_FLG());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_YEAR(struct.getList_YEAR());
			this.setList_HALF_TERM_TYP(struct.getList_HALF_TERM_TYP());
			this.setList_COST_TYP(struct.getList_COST_TYP());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_CURRENT_YEAR(struct.getList_CURRENT_YEAR());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_EXCH_TYP(struct.getList_EXCH_TYP());
			this.setList_BUSINESS_OPR_DATE(struct.getList_BUSINESS_OPR_DATE());
			this.setList_SUB_EXCH_TYP(struct.getList_SUB_EXCH_TYP());
			this.setList_h_PLANT_CD(struct.getList_h_PLANT_CD());
			this.setList_h_YEAR(struct.getList_h_YEAR());
			this.setList_HALF_TERM_TYP_name(struct.getList_HALF_TERM_TYP_name());
			this.setList_HALF_TERM_TYP_val(struct.getList_HALF_TERM_TYP_val());
			this.setList_h_HALF_TERM_TYP(struct.getList_h_HALF_TERM_TYP());
			this.setList_COST_TYP_name(struct.getList_COST_TYP_name());
			this.setList_COST_TYP_val(struct.getList_COST_TYP_val());
			this.setList_h_COST_TYP(struct.getList_h_COST_TYP());
			this.setList_h_ITEM_CD(struct.getList_h_ITEM_CD());
			this.setList_CS_PUCH_TYP_name(struct.getList_CS_PUCH_TYP_name());
			this.setList_CS_PUCH_TYP_val(struct.getList_CS_PUCH_TYP_val());
			this.setList_h_CS_PUCH_TYP(struct.getList_h_CS_PUCH_TYP());
			this.setList_UNIT_COST_ACCEPT_TYP_name(struct.getList_UNIT_COST_ACCEPT_TYP_name());
			this.setList_UNIT_COST_ACCEPT_TYP_val(struct.getList_UNIT_COST_ACCEPT_TYP_val());
			this.setList_ONEROUS_CONS_FLG_name(struct.getList_ONEROUS_CONS_FLG_name());
			this.setList_ONEROUS_CONS_FLG_val(struct.getList_ONEROUS_CONS_FLG_val());
			this.setList_UNIT_COST_TYP_name(struct.getList_UNIT_COST_TYP_name());
			this.setList_UNIT_COST_TYP_val(struct.getList_UNIT_COST_TYP_val());
			this.setList_SUB_UNIT_COST_TYP_name(struct.getList_SUB_UNIT_COST_TYP_name());
			this.setList_SUB_UNIT_COST_TYP_val(struct.getList_SUB_UNIT_COST_TYP_val());
			this.setList_c_NoCheckClasificationCd(struct.getList_c_NoCheckClasificationCd());
			this.setList_c_NoCheckStockUnit(struct.getList_c_NoCheckStockUnit());
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
	// 第 1 変数初期値： i_CS_PUCH_TYP


	final static String i_CS_PUCH_TYP = null;

	// 第 2 変数初期値： i_CS_PROC_CD


	final static String i_CS_PROC_CD = null;

	// 第 3 変数初期値： i_CS_PROC_NAME


	final static String i_CS_PROC_NAME = null;

	// 第 4 変数初期値： i_UNIT_COST_ACCEPT_TYP


	final static String i_UNIT_COST_ACCEPT_TYP = null;

	// 第 5 変数初期値： i_CLASIFICATION_CD


	final static String i_CLASIFICATION_CD = null;

	// 第 6 変数初期値： i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// 第 7 変数初期値： i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// 第 8 変数初期値： i_ORG_CD


	final static String i_ORG_CD = null;

	// 第 9 変数初期値： i_ORG_NAME


	final static String i_ORG_NAME = null;

	// 第 10 変数初期値： i_ONEROUS_CONS_FLG


	final static String i_ONEROUS_CONS_FLG = null;

	// 第 11 変数初期値： i_VEND_CD


	final static String i_VEND_CD = null;

	// 第 12 変数初期値： i_VEND_NAME


	final static String i_VEND_NAME = null;

	// 第 13 変数初期値： i_UNIT_COST


	final static String i_UNIT_COST = null;

	// 第 14 変数初期値： i_CUR_UNIT


	final static String i_CUR_UNIT = null;

	// 第 15 変数初期値： i_UNIT_COST_TYP


	final static String i_UNIT_COST_TYP = null;

	// 第 16 変数初期値： i_PUCH_UNIT_QTY


	final static String i_PUCH_UNIT_QTY = null;

	// 第 17 変数初期値： i_CUR_CD


	final static String i_CUR_CD = null;

	// 第 18 変数初期値： i_CUR_NAME


	final static String i_CUR_NAME = null;

	// 第 19 変数初期値： i_EXCH_RATE


	final static String i_EXCH_RATE = null;

	// 第 20 変数初期値： i_SUB_VEND_CD


	final static String i_SUB_VEND_CD = null;

	// 第 21 変数初期値： i_SUB_VEND_NAME


	final static String i_SUB_VEND_NAME = null;

	// 第 22 変数初期値： i_SUB_UNIT_COST


	final static String i_SUB_UNIT_COST = null;

	// 第 23 変数初期値： i_SUB_CUR_UNIT


	final static String i_SUB_CUR_UNIT = null;

	// 第 24 変数初期値： i_SUB_UNIT_COST_TYP


	final static String i_SUB_UNIT_COST_TYP = null;

	// 第 25 変数初期値： i_SUB_PUCH_UNIT_QTY


	final static String i_SUB_PUCH_UNIT_QTY = null;

	// 第 26 変数初期値： i_SUB_CUR_CD


	final static String i_SUB_CUR_CD = null;

	// 第 27 変数初期値： i_SUB_CUR_NAME


	final static String i_SUB_CUR_NAME = null;

	// 第 28 変数初期値： i_SUB_EXCH_RATE


	final static String i_SUB_EXCH_RATE = null;

	// 第 29 変数初期値： i_DEL_FLG


	final static String i_DEL_FLG = null;

	// 第 30 変数初期値： i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// 第 31 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

	// 第 32 変数初期値： i_YEAR


	final static String i_YEAR = null;

	// 第 33 変数初期値： i_HALF_TERM_TYP


	final static String i_HALF_TERM_TYP = null;

	// 第 34 変数初期値： i_COST_TYP


	final static String i_COST_TYP = null;

	// 第 35 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 36 変数初期値： i_CURRENT_YEAR


	final static String i_CURRENT_YEAR = null;

	// 第 37 変数初期値： i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// 第 38 変数初期値： i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// 第 39 変数初期値： i_EXCH_TYP


	final static String i_EXCH_TYP = null;

	// 第 40 変数初期値： i_BUSINESS_OPR_DATE


	final static String i_BUSINESS_OPR_DATE = null;

	// 第 41 変数初期値： i_SUB_EXCH_TYP


	final static String i_SUB_EXCH_TYP = null;

	// 第 42 変数初期値： i_h_PLANT_CD


	final static String i_h_PLANT_CD = null;

	// 第 43 変数初期値： i_h_YEAR


	final static String i_h_YEAR = null;

	// 第 44 変数初期値： i_HALF_TERM_TYP_name


	final static String i_HALF_TERM_TYP_name = null;

	// 第 45 変数初期値： i_HALF_TERM_TYP_val


	final static String i_HALF_TERM_TYP_val = null;

	// 第 46 変数初期値： i_h_HALF_TERM_TYP


	final static String i_h_HALF_TERM_TYP = null;

	// 第 47 変数初期値： i_COST_TYP_name


	final static String i_COST_TYP_name = null;

	// 第 48 変数初期値： i_COST_TYP_val


	final static String i_COST_TYP_val = null;

	// 第 49 変数初期値： i_h_COST_TYP


	final static String i_h_COST_TYP = null;

	// 第 50 変数初期値： i_h_ITEM_CD


	final static String i_h_ITEM_CD = null;

	// 第 51 変数初期値： i_CS_PUCH_TYP_name


	final static String i_CS_PUCH_TYP_name = null;

	// 第 52 変数初期値： i_CS_PUCH_TYP_val


	final static String i_CS_PUCH_TYP_val = null;

	// 第 53 変数初期値： i_h_CS_PUCH_TYP


	final static String i_h_CS_PUCH_TYP = null;

	// 第 54 変数初期値： i_UNIT_COST_ACCEPT_TYP_name


	final static String i_UNIT_COST_ACCEPT_TYP_name = null;

	// 第 55 変数初期値： i_UNIT_COST_ACCEPT_TYP_val


	final static String i_UNIT_COST_ACCEPT_TYP_val = null;

	// 第 56 変数初期値： i_ONEROUS_CONS_FLG_name


	final static String i_ONEROUS_CONS_FLG_name = null;

	// 第 57 変数初期値： i_ONEROUS_CONS_FLG_val


	final static String i_ONEROUS_CONS_FLG_val = null;

	// 第 58 変数初期値： i_UNIT_COST_TYP_name


	final static String i_UNIT_COST_TYP_name = null;

	// 第 59 変数初期値： i_UNIT_COST_TYP_val


	final static String i_UNIT_COST_TYP_val = null;

	// 第 60 変数初期値： i_SUB_UNIT_COST_TYP_name


	final static String i_SUB_UNIT_COST_TYP_name = null;

	// 第 61 変数初期値： i_SUB_UNIT_COST_TYP_val


	final static String i_SUB_UNIT_COST_TYP_val = null;

	// 第 62 変数初期値： i_c_NoCheckClasificationCd


	final static String i_c_NoCheckClasificationCd = null;

	// 第 63 変数初期値： i_c_NoCheckStockUnit


	final static String i_c_NoCheckStockUnit = null;

*/

	//{{user_implement_code
         // TODO: 初期化で使う定数は、ここに記述してください。
         // 以下に記述した内容は自動的には変更されません。
        // 第 1 変数初期値： i_CS_PUCH_TYP
        final static String i_CS_PUCH_TYP = null;
        // 第 2 変数初期値： i_CS_PROC_CD
        final static String i_CS_PROC_CD = null;
        // 第 3 変数初期値： i_CS_PROC_NAME
        final static String i_CS_PROC_NAME = null;
        // 第 4 変数初期値： i_UNIT_COST_ACCEPT_TYP
        final static String i_UNIT_COST_ACCEPT_TYP = null;
        // 第 5 変数初期値： i_CLASIFICATION_CD
        final static String i_CLASIFICATION_CD = null;
        // 第 6 変数初期値： i_STOCK_UNIT
        final static String i_STOCK_UNIT = null;
        // 第 7 変数初期値： i_COMPANY_CD
        final static String i_COMPANY_CD = null;
        // 第 8 変数初期値： i_ORG_CD
        final static String i_ORG_CD = null;
        // 第 9 変数初期値： i_ORG_NAME
        final static String i_ORG_NAME = null;
        // 第 10 変数初期値： i_ONEROUS_CONS_FLG
        final static String i_ONEROUS_CONS_FLG = null;
        // 第 11 変数初期値： i_VEND_CD
        final static String i_VEND_CD = null;
        // 第 12 変数初期値： i_VEND_NAME
        final static String i_VEND_NAME = null;
        // 第 13 変数初期値： i_UNIT_COST
        final static String i_UNIT_COST = null;
        // 第 14 変数初期値： i_CUR_UNIT
        final static String i_CUR_UNIT = null;
        // 第 15 変数初期値： i_UNIT_COST_TYP
        final static String i_UNIT_COST_TYP = null;
        // 第 16 変数初期値： i_PUCH_UNIT_QTY
        final static String i_PUCH_UNIT_QTY = null;
        // 第 17 変数初期値： i_CUR_CD
        final static String i_CUR_CD = null;
        // 第 18 変数初期値： i_CUR_NAME
        final static String i_CUR_NAME = null;
        // 第 19 変数初期値： i_EXCH_RATE
        final static String i_EXCH_RATE = null;
        // 第 20 変数初期値： i_SUB_VEND_CD
        final static String i_SUB_VEND_CD = null;
        // 第 21 変数初期値： i_SUB_VEND_NAME
        final static String i_SUB_VEND_NAME = null;
        // 第 22 変数初期値： i_SUB_UNIT_COST
        final static String i_SUB_UNIT_COST = null;
        // 第 23 変数初期値： i_SUB_CUR_UNIT
        final static String i_SUB_CUR_UNIT = null;
        // 第 24 変数初期値： i_SUB_UNIT_COST_TYP
        final static String i_SUB_UNIT_COST_TYP = null;
        // 第 25 変数初期値： i_SUB_PUCH_UNIT_QTY
        final static String i_SUB_PUCH_UNIT_QTY = null;
        // 第 26 変数初期値： i_SUB_CUR_CD
        final static String i_SUB_CUR_CD = null;
        // 第 27 変数初期値： i_SUB_CUR_NAME
        final static String i_SUB_CUR_NAME = null;
        // 第 28 変数初期値： i_SUB_EXCH_RATE
        final static String i_SUB_EXCH_RATE = null;
        // 第 29 変数初期値： i_DEL_FLG
        final static String i_DEL_FLG = null;
        // 第 30 変数初期値： i_MODIFY_COUNT
        final static String i_MODIFY_COUNT = null;
        // 第 31 変数初期値： i_PLANT_CD
        final static String i_PLANT_CD = null;
        // 第 32 変数初期値： i_YEAR
        final static String i_YEAR = null;
        // 第 33 変数初期値： i_HALF_TERM_TYP
        final static String i_HALF_TERM_TYP = null;
        // 第 34 変数初期値： i_COST_TYP
        final static String i_COST_TYP = null;
        // 第 35 変数初期値： i_ITEM_CD
        final static String i_ITEM_CD = null;
        // 第 36 変数初期値： i_CURRENT_YEAR
        final static String i_CURRENT_YEAR = null;
        // 第 37 変数初期値： i_PLANT_NAME
        final static String i_PLANT_NAME = null;
        // 第 38 変数初期値： i_ITEM_NAME
        final static String i_ITEM_NAME = null;
        // 第 39 変数初期値： i_EXCH_TYP
        final static String i_EXCH_TYP = null;
        // 第 40 変数初期値： i_BUSINESS_OPR_DATE
        final static String i_BUSINESS_OPR_DATE = null;
        // 第 41 変数初期値： i_SUB_EXCH_TYP
        final static String i_SUB_EXCH_TYP = null;
        // 第 42 変数初期値： i_h_PLANT_CD
        final static String i_h_PLANT_CD = null;
        // 第 43 変数初期値： i_h_YEAR
        final static String i_h_YEAR = null;
        // 第 44 変数初期値： i_HALF_TERM_TYP_name
        final static String i_HALF_TERM_TYP_name = null;
        // 第 45 変数初期値： i_HALF_TERM_TYP_val
        final static String i_HALF_TERM_TYP_val = null;
        // 第 46 変数初期値： i_h_HALF_TERM_TYP
        final static String i_h_HALF_TERM_TYP = null;
        // 第 47 変数初期値： i_COST_TYP_name
        final static String i_COST_TYP_name = null;
        // 第 48 変数初期値： i_COST_TYP_val
        final static String i_COST_TYP_val = null;
        // 第 49 変数初期値： i_h_COST_TYP
        final static String i_h_COST_TYP = null;
        // 第 50 変数初期値： i_h_ITEM_CD
        final static String i_h_ITEM_CD = null;
        // 第 51 変数初期値： i_CS_PUCH_TYP_name
        final static String i_CS_PUCH_TYP_name = null;
        // 第 52 変数初期値： i_CS_PUCH_TYP_val
        final static String i_CS_PUCH_TYP_val = null;
        // 第 53 変数初期値： i_h_CS_PUCH_TYP
        final static String i_h_CS_PUCH_TYP = null;
        // 第 54 変数初期値： i_UNIT_COST_ACCEPT_TYP_name
        final static String i_UNIT_COST_ACCEPT_TYP_name = null;
        // 第 55 変数初期値： i_UNIT_COST_ACCEPT_TYP_val
        final static String i_UNIT_COST_ACCEPT_TYP_val = null;
        // 第 56 変数初期値： i_ONEROUS_CONS_FLG_name
        final static String i_ONEROUS_CONS_FLG_name = null;
        // 第 57 変数初期値： i_ONEROUS_CONS_FLG_val
        final static String i_ONEROUS_CONS_FLG_val = null;
        // 第 58 変数初期値： i_UNIT_COST_TYP_name
        final static String i_UNIT_COST_TYP_name = null;
        // 第 59 変数初期値： i_UNIT_COST_TYP_val
        final static String i_UNIT_COST_TYP_val = null;
        // 第 60 変数初期値： i_SUB_UNIT_COST_TYP_name
        final static String i_SUB_UNIT_COST_TYP_name = null;
        // 第 61 変数初期値： i_SUB_UNIT_COST_TYP_val
        final static String i_SUB_UNIT_COST_TYP_val = null;
        // 第 62 変数初期値： i_c_NoCheckClasificationCd
        final static String i_c_NoCheckClasificationCd = null;
        // 第 63 変数初期値： i_c_NoCheckStockUnit
        final static String i_c_NoCheckStockUnit = null;
       
        /**
         * 初期化
         *
         */
        public void initialize()
        {
       
         clear();
       
         m_CS_PUCH_TYP = i_CS_PUCH_TYP;
         m_CS_PROC_CD = i_CS_PROC_CD;
         m_CS_PROC_NAME = i_CS_PROC_NAME;
         m_UNIT_COST_ACCEPT_TYP = i_UNIT_COST_ACCEPT_TYP;
         m_CLASIFICATION_CD = i_CLASIFICATION_CD;
         m_STOCK_UNIT = i_STOCK_UNIT;
         m_COMPANY_CD = i_COMPANY_CD;
         m_ORG_CD = i_ORG_CD;
         m_ORG_NAME = i_ORG_NAME;
         m_ONEROUS_CONS_FLG = i_ONEROUS_CONS_FLG;
         m_VEND_CD = i_VEND_CD;
         m_VEND_NAME = i_VEND_NAME;
         m_UNIT_COST = i_UNIT_COST;
         m_CUR_UNIT = i_CUR_UNIT;
         m_UNIT_COST_TYP = i_UNIT_COST_TYP;
         m_PUCH_UNIT_QTY = i_PUCH_UNIT_QTY;
         m_CUR_CD = i_CUR_CD;
         m_CUR_NAME = i_CUR_NAME;
         m_EXCH_RATE = i_EXCH_RATE;
         m_SUB_VEND_CD = i_SUB_VEND_CD;
         m_SUB_VEND_NAME = i_SUB_VEND_NAME;
         m_SUB_UNIT_COST = i_SUB_UNIT_COST;
         m_SUB_CUR_UNIT = i_SUB_CUR_UNIT;
         m_SUB_UNIT_COST_TYP = i_SUB_UNIT_COST_TYP;
         m_SUB_PUCH_UNIT_QTY = i_SUB_PUCH_UNIT_QTY;
         m_SUB_CUR_CD = i_SUB_CUR_CD;
         m_SUB_CUR_NAME = i_SUB_CUR_NAME;
         m_SUB_EXCH_RATE = i_SUB_EXCH_RATE;
         m_DEL_FLG = i_DEL_FLG;
         m_MODIFY_COUNT = i_MODIFY_COUNT;
         m_PLANT_CD = i_PLANT_CD;
         m_YEAR = i_YEAR;
         m_HALF_TERM_TYP = i_HALF_TERM_TYP;
         m_COST_TYP = i_COST_TYP;
         m_ITEM_CD = i_ITEM_CD;
         m_CURRENT_YEAR = i_CURRENT_YEAR;
         m_PLANT_NAME = i_PLANT_NAME;
         m_ITEM_NAME = i_ITEM_NAME;
         m_EXCH_TYP = i_EXCH_TYP;
         m_BUSINESS_OPR_DATE = i_BUSINESS_OPR_DATE;
         m_SUB_EXCH_TYP = i_SUB_EXCH_TYP;
         m_h_PLANT_CD = i_h_PLANT_CD;
         m_h_YEAR = i_h_YEAR;
         m_HALF_TERM_TYP_name = i_HALF_TERM_TYP_name;
         m_HALF_TERM_TYP_val = i_HALF_TERM_TYP_val;
         m_h_HALF_TERM_TYP = i_h_HALF_TERM_TYP;
         m_COST_TYP_name = i_COST_TYP_name;
         m_COST_TYP_val = i_COST_TYP_val;
         m_h_COST_TYP = i_h_COST_TYP;
         m_h_ITEM_CD = i_h_ITEM_CD;
         m_CS_PUCH_TYP_name = i_CS_PUCH_TYP_name;
         m_CS_PUCH_TYP_val = i_CS_PUCH_TYP_val;
         m_h_CS_PUCH_TYP = i_h_CS_PUCH_TYP;
         m_UNIT_COST_ACCEPT_TYP_name = i_UNIT_COST_ACCEPT_TYP_name;
         m_UNIT_COST_ACCEPT_TYP_val = i_UNIT_COST_ACCEPT_TYP_val;
         m_ONEROUS_CONS_FLG_name = i_ONEROUS_CONS_FLG_name;
         m_ONEROUS_CONS_FLG_val = i_ONEROUS_CONS_FLG_val;
         m_UNIT_COST_TYP_name = i_UNIT_COST_TYP_name;
         m_UNIT_COST_TYP_val = i_UNIT_COST_TYP_val;
         m_SUB_UNIT_COST_TYP_name = i_SUB_UNIT_COST_TYP_name;
         m_SUB_UNIT_COST_TYP_val = i_SUB_UNIT_COST_TYP_val;
         m_c_NoCheckClasificationCd = i_c_NoCheckClasificationCd;
         m_c_NoCheckStockUnit = i_c_NoCheckStockUnit;
        }
       
         // TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
