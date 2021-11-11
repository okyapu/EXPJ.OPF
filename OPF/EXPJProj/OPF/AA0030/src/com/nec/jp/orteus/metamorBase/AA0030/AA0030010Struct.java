/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0030/src/com/nec/jp/orteus/metamorBase/AA0030/AA0030010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0030;

import com.nec.jp.orteus.xaf.wa.*;

import com.nec.jp.orteus.util.logging.*;

import java.lang.Number.*;
import java.lang.Float;
import java.util.*;
import java.sql.*;
import java.io.*;

//{{user_implement_code_import
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AA0030010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_OUTSIDE_TYP_name */
	public String m_OUTSIDE_TYP_name = null;
	/** 第 2 変数： m_OUTSIDE_TYP_val */
	public String m_OUTSIDE_TYP_val = null;
	/** 第 3 変数： m_ACPT_INSPC_TYP_name */
	public String m_ACPT_INSPC_TYP_name = null;
	/** 第 4 変数： m_ACPT_INSPC_TYP_val */
	public String m_ACPT_INSPC_TYP_val = null;
	/** 第 5 変数： m_OUTSIDE_NAME */
	public String m_OUTSIDE_NAME = null;
	/** 第 6 変数： m_ITEM_MRP_ODR_NAME */
	public String m_ITEM_MRP_ODR_NAME = null;
	/** 第 7 変数： m_ITEM_OUTSIDE_NAME */
	public String m_ITEM_OUTSIDE_NAME = null;
	/** 第 8 変数： m_ITEM_OPR_RSLT_NAME */
	public String m_ITEM_OPR_RSLT_NAME = null;
	/** 第 9 変数： m_ACPT_INSPC_NAME */
	public String m_ACPT_INSPC_NAME = null;
	/** 第 10 変数： m_h_ITEM_CD */
	public String m_h_ITEM_CD = null;
	/** 第 11 変数： m_LT_UNIT_1 */
	public String m_LT_UNIT_1 = null;
	/** 第 12 変数： m_LT_UNIT_2 */
	public String m_LT_UNIT_2 = null;
	/** 第 13 変数： m_LT_UNIT_3 */
	public String m_LT_UNIT_3 = null;
	/** 第 14 変数： m_ITEM_MANHOUR_NAME */
	public String m_ITEM_MANHOUR_NAME = null;
	/** 第 15 変数： m_MRP_ODR_TYP_name */
	public String m_MRP_ODR_TYP_name = null;
	/** 第 16 変数： m_MRP_ODR_TYP_val */
	public String m_MRP_ODR_TYP_val = null;
	/** 第 17 変数： m_OPR_RSLT_TYP_name */
	public String m_OPR_RSLT_TYP_name = null;
	/** 第 18 変数： m_OPR_RSLT_TYP_val */
	public String m_OPR_RSLT_TYP_val = null;
	/** 第 19 変数： m_MANHOUR_TYP_name */
	public String m_MANHOUR_TYP_name = null;
	/** 第 20 変数： m_MANHOUR_TYP_val */
	public String m_MANHOUR_TYP_val = null;
	/** 第 21 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** 第 22 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 23 変数： m_PROC_CD */
	public String m_PROC_CD = null;
	/** 第 24 変数： m_PROC_NO */
	public String m_PROC_NO = null;
	/** 第 25 変数： m_PROC_NAME */
	public String m_PROC_NAME = null;
	/** 第 26 変数： m_WS_CD */
	public String m_WS_CD = null;
	/** 第 27 変数： m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** 第 28 変数： m_VEND_CD */
	public String m_VEND_CD = null;
	/** 第 29 変数： m_FIXED_LT */
	public String m_FIXED_LT = null;
	/** 第 30 変数： m_PROP_LT */
	public String m_PROP_LT = null;
	/** 第 31 変数： m_SAFETY_LT */
	public String m_SAFETY_LT = null;
	/** 第 32 変数： m_PROP_LOT_SIZE */
	public String m_PROP_LOT_SIZE = null;
	/** 第 33 変数： m_SPOIL */
	public String m_SPOIL = null;
	/** 第 34 変数： m_OUTSIDE_TYP */
	public Integer m_OUTSIDE_TYP = null;
	/** 第 35 変数： m_ACPT_INSPC_TYP */
	public Integer m_ACPT_INSPC_TYP = null;
	/** 第 36 変数： m_STANDARD_COST */
	public String m_STANDARD_COST = null;
	/** 第 37 変数： m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** 第 38 変数： m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** 第 39 変数： m_WS_NAME */
	public String m_WS_NAME = null;
	/** 第 40 変数： m_VEND_NAME */
	public String m_VEND_NAME = null;
	/** 第 41 変数： m_DRAW_CD */
	public String m_DRAW_CD = null;
	/** 第 42 変数： m_SPEC */
	public String m_SPEC = null;
	/** 第 43 変数： m_MRP_ODR_TYP */
	public Integer m_MRP_ODR_TYP = null;
	/** 第 44 変数： m_ITEM_OUTSIDE_TYP */
	public Integer m_ITEM_OUTSIDE_TYP = null;
	/** 第 45 変数： m_OPR_RSLT_TYP */
	public Integer m_OPR_RSLT_TYP = null;
	/** 第 46 変数： m_ITEM_FIXED_LT */
	public Long m_ITEM_FIXED_LT = null;
	/** 第 47 変数： m_ITEM_PROP_LT */
	public Long m_ITEM_PROP_LT = null;
	/** 第 48 変数： m_ITEM_PROP_LOT_SIZE */
	public String m_ITEM_PROP_LOT_SIZE = null;
	/** 第 49 変数： m_ITEM_ISSUE_LT */
	public Long m_ITEM_ISSUE_LT = null;
	/** 第 50 変数： m_ITEM_SAFETY_LT */
	public Long m_ITEM_SAFETY_LT = null;
	/** 第 51 変数： m_UNIT_QTY_TYP */
	public Integer m_UNIT_QTY_TYP = null;
	/** 第 52 変数： m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** 第 53 変数： m_MANHOUR_TYP */
	public Integer m_MANHOUR_TYP = null;
	/** 第 54 変数： m_TIME_CTRL */
	public String m_TIME_CTRL = null;
	/** 第 55 変数： m_LT_UNIT */
	public String m_LT_UNIT = null;
	/** 第 56 変数： m_BOM_ITEM_CD */
	public String m_BOM_ITEM_CD = null;
	/** 第 57 変数： m_BOM_FIXED_LT */
	public Long m_BOM_FIXED_LT = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_OUTSIDE_TYP_name */
	public List l_OUTSIDE_TYP_name = null;

	/** 第 2 List変数： l_OUTSIDE_TYP_val */
	public List l_OUTSIDE_TYP_val = null;

	/** 第 3 List変数： l_ACPT_INSPC_TYP_name */
	public List l_ACPT_INSPC_TYP_name = null;

	/** 第 4 List変数： l_ACPT_INSPC_TYP_val */
	public List l_ACPT_INSPC_TYP_val = null;

	/** 第 5 List変数： l_OUTSIDE_NAME */
	public List l_OUTSIDE_NAME = null;

	/** 第 6 List変数： l_ITEM_MRP_ODR_NAME */
	public List l_ITEM_MRP_ODR_NAME = null;

	/** 第 7 List変数： l_ITEM_OUTSIDE_NAME */
	public List l_ITEM_OUTSIDE_NAME = null;

	/** 第 8 List変数： l_ITEM_OPR_RSLT_NAME */
	public List l_ITEM_OPR_RSLT_NAME = null;

	/** 第 9 List変数： l_ACPT_INSPC_NAME */
	public List l_ACPT_INSPC_NAME = null;

	/** 第 10 List変数： l_h_ITEM_CD */
	public List l_h_ITEM_CD = null;

	/** 第 11 List変数： l_LT_UNIT_1 */
	public List l_LT_UNIT_1 = null;

	/** 第 12 List変数： l_LT_UNIT_2 */
	public List l_LT_UNIT_2 = null;

	/** 第 13 List変数： l_LT_UNIT_3 */
	public List l_LT_UNIT_3 = null;

	/** 第 14 List変数： l_ITEM_MANHOUR_NAME */
	public List l_ITEM_MANHOUR_NAME = null;

	/** 第 15 List変数： l_MRP_ODR_TYP_name */
	public List l_MRP_ODR_TYP_name = null;

	/** 第 16 List変数： l_MRP_ODR_TYP_val */
	public List l_MRP_ODR_TYP_val = null;

	/** 第 17 List変数： l_OPR_RSLT_TYP_name */
	public List l_OPR_RSLT_TYP_name = null;

	/** 第 18 List変数： l_OPR_RSLT_TYP_val */
	public List l_OPR_RSLT_TYP_val = null;

	/** 第 19 List変数： l_MANHOUR_TYP_name */
	public List l_MANHOUR_TYP_name = null;

	/** 第 20 List変数： l_MANHOUR_TYP_val */
	public List l_MANHOUR_TYP_val = null;

	/** 第 21 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** 第 22 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 23 List変数： l_PROC_CD */
	public List l_PROC_CD = null;

	/** 第 24 List変数： l_PROC_NO */
	public List l_PROC_NO = null;

	/** 第 25 List変数： l_PROC_NAME */
	public List l_PROC_NAME = null;

	/** 第 26 List変数： l_WS_CD */
	public List l_WS_CD = null;

	/** 第 27 List変数： l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** 第 28 List変数： l_VEND_CD */
	public List l_VEND_CD = null;

	/** 第 29 List変数： l_FIXED_LT */
	public List l_FIXED_LT = null;

	/** 第 30 List変数： l_PROP_LT */
	public List l_PROP_LT = null;

	/** 第 31 List変数： l_SAFETY_LT */
	public List l_SAFETY_LT = null;

	/** 第 32 List変数： l_PROP_LOT_SIZE */
	public List l_PROP_LOT_SIZE = null;

	/** 第 33 List変数： l_SPOIL */
	public List l_SPOIL = null;

	/** 第 34 List変数： l_OUTSIDE_TYP */
	public List l_OUTSIDE_TYP = null;

	/** 第 35 List変数： l_ACPT_INSPC_TYP */
	public List l_ACPT_INSPC_TYP = null;

	/** 第 36 List変数： l_STANDARD_COST */
	public List l_STANDARD_COST = null;

	/** 第 37 List変数： l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** 第 38 List変数： l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** 第 39 List変数： l_WS_NAME */
	public List l_WS_NAME = null;

	/** 第 40 List変数： l_VEND_NAME */
	public List l_VEND_NAME = null;

	/** 第 41 List変数： l_DRAW_CD */
	public List l_DRAW_CD = null;

	/** 第 42 List変数： l_SPEC */
	public List l_SPEC = null;

	/** 第 43 List変数： l_MRP_ODR_TYP */
	public List l_MRP_ODR_TYP = null;

	/** 第 44 List変数： l_ITEM_OUTSIDE_TYP */
	public List l_ITEM_OUTSIDE_TYP = null;

	/** 第 45 List変数： l_OPR_RSLT_TYP */
	public List l_OPR_RSLT_TYP = null;

	/** 第 46 List変数： l_ITEM_FIXED_LT */
	public List l_ITEM_FIXED_LT = null;

	/** 第 47 List変数： l_ITEM_PROP_LT */
	public List l_ITEM_PROP_LT = null;

	/** 第 48 List変数： l_ITEM_PROP_LOT_SIZE */
	public List l_ITEM_PROP_LOT_SIZE = null;

	/** 第 49 List変数： l_ITEM_ISSUE_LT */
	public List l_ITEM_ISSUE_LT = null;

	/** 第 50 List変数： l_ITEM_SAFETY_LT */
	public List l_ITEM_SAFETY_LT = null;

	/** 第 51 List変数： l_UNIT_QTY_TYP */
	public List l_UNIT_QTY_TYP = null;

	/** 第 52 List変数： l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** 第 53 List変数： l_MANHOUR_TYP */
	public List l_MANHOUR_TYP = null;

	/** 第 54 List変数： l_TIME_CTRL */
	public List l_TIME_CTRL = null;

	/** 第 55 List変数： l_LT_UNIT */
	public List l_LT_UNIT = null;

	/** 第 56 List変数： l_BOM_ITEM_CD */
	public List l_BOM_ITEM_CD = null;

	/** 第 57 List変数： l_BOM_FIXED_LT */
	public List l_BOM_FIXED_LT = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getOUTSIDE_TYP_name() { return m_OUTSIDE_TYP_name; }
	public String getOUTSIDE_TYP_val() { return m_OUTSIDE_TYP_val; }
	public String getACPT_INSPC_TYP_name() { return m_ACPT_INSPC_TYP_name; }
	public String getACPT_INSPC_TYP_val() { return m_ACPT_INSPC_TYP_val; }
	public String getOUTSIDE_NAME() { return m_OUTSIDE_NAME; }
	public String getITEM_MRP_ODR_NAME() { return m_ITEM_MRP_ODR_NAME; }
	public String getITEM_OUTSIDE_NAME() { return m_ITEM_OUTSIDE_NAME; }
	public String getITEM_OPR_RSLT_NAME() { return m_ITEM_OPR_RSLT_NAME; }
	public String getACPT_INSPC_NAME() { return m_ACPT_INSPC_NAME; }
	public String geth_ITEM_CD() { return m_h_ITEM_CD; }
	public String getLT_UNIT_1() { return m_LT_UNIT_1; }
	public String getLT_UNIT_2() { return m_LT_UNIT_2; }
	public String getLT_UNIT_3() { return m_LT_UNIT_3; }
	public String getITEM_MANHOUR_NAME() { return m_ITEM_MANHOUR_NAME; }
	public String getMRP_ODR_TYP_name() { return m_MRP_ODR_TYP_name; }
	public String getMRP_ODR_TYP_val() { return m_MRP_ODR_TYP_val; }
	public String getOPR_RSLT_TYP_name() { return m_OPR_RSLT_TYP_name; }
	public String getOPR_RSLT_TYP_val() { return m_OPR_RSLT_TYP_val; }
	public String getMANHOUR_TYP_name() { return m_MANHOUR_TYP_name; }
	public String getMANHOUR_TYP_val() { return m_MANHOUR_TYP_val; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getPROC_CD() { return m_PROC_CD; }
	public String getPROC_NO() { return m_PROC_NO; }
	public String getPROC_NAME() { return m_PROC_NAME; }
	public String getWS_CD() { return m_WS_CD; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getFIXED_LT() { return m_FIXED_LT; }
	public String getPROP_LT() { return m_PROP_LT; }
	public String getSAFETY_LT() { return m_SAFETY_LT; }
	public String getPROP_LOT_SIZE() { return m_PROP_LOT_SIZE; }
	public String getSPOIL() { return m_SPOIL; }
	public Integer getOUTSIDE_TYP() { return m_OUTSIDE_TYP; }
	public Integer getACPT_INSPC_TYP() { return m_ACPT_INSPC_TYP; }
	public String getSTANDARD_COST() { return m_STANDARD_COST; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getWS_NAME() { return m_WS_NAME; }
	public String getVEND_NAME() { return m_VEND_NAME; }
	public String getDRAW_CD() { return m_DRAW_CD; }
	public String getSPEC() { return m_SPEC; }
	public Integer getMRP_ODR_TYP() { return m_MRP_ODR_TYP; }
	public Integer getITEM_OUTSIDE_TYP() { return m_ITEM_OUTSIDE_TYP; }
	public Integer getOPR_RSLT_TYP() { return m_OPR_RSLT_TYP; }
	public Long getITEM_FIXED_LT() { return m_ITEM_FIXED_LT; }
	public Long getITEM_PROP_LT() { return m_ITEM_PROP_LT; }
	public String getITEM_PROP_LOT_SIZE() { return m_ITEM_PROP_LOT_SIZE; }
	public Long getITEM_ISSUE_LT() { return m_ITEM_ISSUE_LT; }
	public Long getITEM_SAFETY_LT() { return m_ITEM_SAFETY_LT; }
	public Integer getUNIT_QTY_TYP() { return m_UNIT_QTY_TYP; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public Integer getMANHOUR_TYP() { return m_MANHOUR_TYP; }
	public String getTIME_CTRL() { return m_TIME_CTRL; }
	public String getLT_UNIT() { return m_LT_UNIT; }
	public String getBOM_ITEM_CD() { return m_BOM_ITEM_CD; }
	public Long getBOM_FIXED_LT() { return m_BOM_FIXED_LT; }

	public List getList_OUTSIDE_TYP_name() { return l_OUTSIDE_TYP_name; }
	public List getList_OUTSIDE_TYP_val() { return l_OUTSIDE_TYP_val; }
	public List getList_ACPT_INSPC_TYP_name() { return l_ACPT_INSPC_TYP_name; }
	public List getList_ACPT_INSPC_TYP_val() { return l_ACPT_INSPC_TYP_val; }
	public List getList_OUTSIDE_NAME() { return l_OUTSIDE_NAME; }
	public List getList_ITEM_MRP_ODR_NAME() { return l_ITEM_MRP_ODR_NAME; }
	public List getList_ITEM_OUTSIDE_NAME() { return l_ITEM_OUTSIDE_NAME; }
	public List getList_ITEM_OPR_RSLT_NAME() { return l_ITEM_OPR_RSLT_NAME; }
	public List getList_ACPT_INSPC_NAME() { return l_ACPT_INSPC_NAME; }
	public List getList_h_ITEM_CD() { return l_h_ITEM_CD; }
	public List getList_LT_UNIT_1() { return l_LT_UNIT_1; }
	public List getList_LT_UNIT_2() { return l_LT_UNIT_2; }
	public List getList_LT_UNIT_3() { return l_LT_UNIT_3; }
	public List getList_ITEM_MANHOUR_NAME() { return l_ITEM_MANHOUR_NAME; }
	public List getList_MRP_ODR_TYP_name() { return l_MRP_ODR_TYP_name; }
	public List getList_MRP_ODR_TYP_val() { return l_MRP_ODR_TYP_val; }
	public List getList_OPR_RSLT_TYP_name() { return l_OPR_RSLT_TYP_name; }
	public List getList_OPR_RSLT_TYP_val() { return l_OPR_RSLT_TYP_val; }
	public List getList_MANHOUR_TYP_name() { return l_MANHOUR_TYP_name; }
	public List getList_MANHOUR_TYP_val() { return l_MANHOUR_TYP_val; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_PROC_CD() { return l_PROC_CD; }
	public List getList_PROC_NO() { return l_PROC_NO; }
	public List getList_PROC_NAME() { return l_PROC_NAME; }
	public List getList_WS_CD() { return l_WS_CD; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_FIXED_LT() { return l_FIXED_LT; }
	public List getList_PROP_LT() { return l_PROP_LT; }
	public List getList_SAFETY_LT() { return l_SAFETY_LT; }
	public List getList_PROP_LOT_SIZE() { return l_PROP_LOT_SIZE; }
	public List getList_SPOIL() { return l_SPOIL; }
	public List getList_OUTSIDE_TYP() { return l_OUTSIDE_TYP; }
	public List getList_ACPT_INSPC_TYP() { return l_ACPT_INSPC_TYP; }
	public List getList_STANDARD_COST() { return l_STANDARD_COST; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_WS_NAME() { return l_WS_NAME; }
	public List getList_VEND_NAME() { return l_VEND_NAME; }
	public List getList_DRAW_CD() { return l_DRAW_CD; }
	public List getList_SPEC() { return l_SPEC; }
	public List getList_MRP_ODR_TYP() { return l_MRP_ODR_TYP; }
	public List getList_ITEM_OUTSIDE_TYP() { return l_ITEM_OUTSIDE_TYP; }
	public List getList_OPR_RSLT_TYP() { return l_OPR_RSLT_TYP; }
	public List getList_ITEM_FIXED_LT() { return l_ITEM_FIXED_LT; }
	public List getList_ITEM_PROP_LT() { return l_ITEM_PROP_LT; }
	public List getList_ITEM_PROP_LOT_SIZE() { return l_ITEM_PROP_LOT_SIZE; }
	public List getList_ITEM_ISSUE_LT() { return l_ITEM_ISSUE_LT; }
	public List getList_ITEM_SAFETY_LT() { return l_ITEM_SAFETY_LT; }
	public List getList_UNIT_QTY_TYP() { return l_UNIT_QTY_TYP; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_MANHOUR_TYP() { return l_MANHOUR_TYP; }
	public List getList_TIME_CTRL() { return l_TIME_CTRL; }
	public List getList_LT_UNIT() { return l_LT_UNIT; }
	public List getList_BOM_ITEM_CD() { return l_BOM_ITEM_CD; }
	public List getList_BOM_FIXED_LT() { return l_BOM_FIXED_LT; }

	public void setOUTSIDE_TYP_name(String val) { m_OUTSIDE_TYP_name = val; }
	public void setOUTSIDE_TYP_val(String val) { m_OUTSIDE_TYP_val = val; }
	public void setACPT_INSPC_TYP_name(String val) { m_ACPT_INSPC_TYP_name = val; }
	public void setACPT_INSPC_TYP_val(String val) { m_ACPT_INSPC_TYP_val = val; }
	public void setOUTSIDE_NAME(String val) { m_OUTSIDE_NAME = val; }
	public void setITEM_MRP_ODR_NAME(String val) { m_ITEM_MRP_ODR_NAME = val; }
	public void setITEM_OUTSIDE_NAME(String val) { m_ITEM_OUTSIDE_NAME = val; }
	public void setITEM_OPR_RSLT_NAME(String val) { m_ITEM_OPR_RSLT_NAME = val; }
	public void setACPT_INSPC_NAME(String val) { m_ACPT_INSPC_NAME = val; }
	public void seth_ITEM_CD(String val) { m_h_ITEM_CD = val; }
	public void setLT_UNIT_1(String val) { m_LT_UNIT_1 = val; }
	public void setLT_UNIT_2(String val) { m_LT_UNIT_2 = val; }
	public void setLT_UNIT_3(String val) { m_LT_UNIT_3 = val; }
	public void setITEM_MANHOUR_NAME(String val) { m_ITEM_MANHOUR_NAME = val; }
	public void setMRP_ODR_TYP_name(String val) { m_MRP_ODR_TYP_name = val; }
	public void setMRP_ODR_TYP_val(String val) { m_MRP_ODR_TYP_val = val; }
	public void setOPR_RSLT_TYP_name(String val) { m_OPR_RSLT_TYP_name = val; }
	public void setOPR_RSLT_TYP_val(String val) { m_OPR_RSLT_TYP_val = val; }
	public void setMANHOUR_TYP_name(String val) { m_MANHOUR_TYP_name = val; }
	public void setMANHOUR_TYP_val(String val) { m_MANHOUR_TYP_val = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setPROC_CD(String val) { m_PROC_CD = val; }
	public void setPROC_NO(String val) { m_PROC_NO = val; }
	public void setPROC_NAME(String val) { m_PROC_NAME = val; }
	public void setWS_CD(String val) { m_WS_CD = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void setFIXED_LT(String val) { m_FIXED_LT = val; }
	public void setPROP_LT(String val) { m_PROP_LT = val; }
	public void setSAFETY_LT(String val) { m_SAFETY_LT = val; }
	public void setPROP_LOT_SIZE(String val) { m_PROP_LOT_SIZE = val; }
	public void setSPOIL(String val) { m_SPOIL = val; }
	public void setOUTSIDE_TYP(Integer val) { m_OUTSIDE_TYP = val; }
	public void setACPT_INSPC_TYP(Integer val) { m_ACPT_INSPC_TYP = val; }
	public void setSTANDARD_COST(String val) { m_STANDARD_COST = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setWS_NAME(String val) { m_WS_NAME = val; }
	public void setVEND_NAME(String val) { m_VEND_NAME = val; }
	public void setDRAW_CD(String val) { m_DRAW_CD = val; }
	public void setSPEC(String val) { m_SPEC = val; }
	public void setMRP_ODR_TYP(Integer val) { m_MRP_ODR_TYP = val; }
	public void setITEM_OUTSIDE_TYP(Integer val) { m_ITEM_OUTSIDE_TYP = val; }
	public void setOPR_RSLT_TYP(Integer val) { m_OPR_RSLT_TYP = val; }
	public void setITEM_FIXED_LT(Long val) { m_ITEM_FIXED_LT = val; }
	public void setITEM_PROP_LT(Long val) { m_ITEM_PROP_LT = val; }
	public void setITEM_PROP_LOT_SIZE(String val) { m_ITEM_PROP_LOT_SIZE = val; }
	public void setITEM_ISSUE_LT(Long val) { m_ITEM_ISSUE_LT = val; }
	public void setITEM_SAFETY_LT(Long val) { m_ITEM_SAFETY_LT = val; }
	public void setUNIT_QTY_TYP(Integer val) { m_UNIT_QTY_TYP = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setMANHOUR_TYP(Integer val) { m_MANHOUR_TYP = val; }
	public void setTIME_CTRL(String val) { m_TIME_CTRL = val; }
	public void setLT_UNIT(String val) { m_LT_UNIT = val; }
	public void setBOM_ITEM_CD(String val) { m_BOM_ITEM_CD = val; }
	public void setBOM_FIXED_LT(Long val) { m_BOM_FIXED_LT = val; }

	public void setOUTSIDE_TYP(String val) { m_OUTSIDE_TYP = getInteger(val); }
	public void setACPT_INSPC_TYP(String val) { m_ACPT_INSPC_TYP = getInteger(val); }
	public void setMRP_ODR_TYP(String val) { m_MRP_ODR_TYP = getInteger(val); }
	public void setITEM_OUTSIDE_TYP(String val) { m_ITEM_OUTSIDE_TYP = getInteger(val); }
	public void setOPR_RSLT_TYP(String val) { m_OPR_RSLT_TYP = getInteger(val); }
	public void setUNIT_QTY_TYP(String val) { m_UNIT_QTY_TYP = getInteger(val); }
	public void setMANHOUR_TYP(String val) { m_MANHOUR_TYP = getInteger(val); }

	public void setList_OUTSIDE_TYP_name(List list) { l_OUTSIDE_TYP_name = list; }
	public void setList_OUTSIDE_TYP_val(List list) { l_OUTSIDE_TYP_val = list; }
	public void setList_ACPT_INSPC_TYP_name(List list) { l_ACPT_INSPC_TYP_name = list; }
	public void setList_ACPT_INSPC_TYP_val(List list) { l_ACPT_INSPC_TYP_val = list; }
	public void setList_OUTSIDE_NAME(List list) { l_OUTSIDE_NAME = list; }
	public void setList_ITEM_MRP_ODR_NAME(List list) { l_ITEM_MRP_ODR_NAME = list; }
	public void setList_ITEM_OUTSIDE_NAME(List list) { l_ITEM_OUTSIDE_NAME = list; }
	public void setList_ITEM_OPR_RSLT_NAME(List list) { l_ITEM_OPR_RSLT_NAME = list; }
	public void setList_ACPT_INSPC_NAME(List list) { l_ACPT_INSPC_NAME = list; }
	public void setList_h_ITEM_CD(List list) { l_h_ITEM_CD = list; }
	public void setList_LT_UNIT_1(List list) { l_LT_UNIT_1 = list; }
	public void setList_LT_UNIT_2(List list) { l_LT_UNIT_2 = list; }
	public void setList_LT_UNIT_3(List list) { l_LT_UNIT_3 = list; }
	public void setList_ITEM_MANHOUR_NAME(List list) { l_ITEM_MANHOUR_NAME = list; }
	public void setList_MRP_ODR_TYP_name(List list) { l_MRP_ODR_TYP_name = list; }
	public void setList_MRP_ODR_TYP_val(List list) { l_MRP_ODR_TYP_val = list; }
	public void setList_OPR_RSLT_TYP_name(List list) { l_OPR_RSLT_TYP_name = list; }
	public void setList_OPR_RSLT_TYP_val(List list) { l_OPR_RSLT_TYP_val = list; }
	public void setList_MANHOUR_TYP_name(List list) { l_MANHOUR_TYP_name = list; }
	public void setList_MANHOUR_TYP_val(List list) { l_MANHOUR_TYP_val = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_PROC_CD(List list) { l_PROC_CD = list; }
	public void setList_PROC_NO(List list) { l_PROC_NO = list; }
	public void setList_PROC_NAME(List list) { l_PROC_NAME = list; }
	public void setList_WS_CD(List list) { l_WS_CD = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_FIXED_LT(List list) { l_FIXED_LT = list; }
	public void setList_PROP_LT(List list) { l_PROP_LT = list; }
	public void setList_SAFETY_LT(List list) { l_SAFETY_LT = list; }
	public void setList_PROP_LOT_SIZE(List list) { l_PROP_LOT_SIZE = list; }
	public void setList_SPOIL(List list) { l_SPOIL = list; }
	public void setList_OUTSIDE_TYP(List list) { l_OUTSIDE_TYP = list; }
	public void setList_ACPT_INSPC_TYP(List list) { l_ACPT_INSPC_TYP = list; }
	public void setList_STANDARD_COST(List list) { l_STANDARD_COST = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_WS_NAME(List list) { l_WS_NAME = list; }
	public void setList_VEND_NAME(List list) { l_VEND_NAME = list; }
	public void setList_DRAW_CD(List list) { l_DRAW_CD = list; }
	public void setList_SPEC(List list) { l_SPEC = list; }
	public void setList_MRP_ODR_TYP(List list) { l_MRP_ODR_TYP = list; }
	public void setList_ITEM_OUTSIDE_TYP(List list) { l_ITEM_OUTSIDE_TYP = list; }
	public void setList_OPR_RSLT_TYP(List list) { l_OPR_RSLT_TYP = list; }
	public void setList_ITEM_FIXED_LT(List list) { l_ITEM_FIXED_LT = list; }
	public void setList_ITEM_PROP_LT(List list) { l_ITEM_PROP_LT = list; }
	public void setList_ITEM_PROP_LOT_SIZE(List list) { l_ITEM_PROP_LOT_SIZE = list; }
	public void setList_ITEM_ISSUE_LT(List list) { l_ITEM_ISSUE_LT = list; }
	public void setList_ITEM_SAFETY_LT(List list) { l_ITEM_SAFETY_LT = list; }
	public void setList_UNIT_QTY_TYP(List list) { l_UNIT_QTY_TYP = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_MANHOUR_TYP(List list) { l_MANHOUR_TYP = list; }
	public void setList_TIME_CTRL(List list) { l_TIME_CTRL = list; }
	public void setList_LT_UNIT(List list) { l_LT_UNIT = list; }
	public void setList_BOM_ITEM_CD(List list) { l_BOM_ITEM_CD = list; }
	public void setList_BOM_FIXED_LT(List list) { l_BOM_FIXED_LT = list; }

	public int setL2L_OUTSIDE_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OUTSIDE_TYP_name == null) {
			l_OUTSIDE_TYP_name = new ArrayList();
		} else {
			l_OUTSIDE_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OUTSIDE_TYP_name.add(((AA0030010Struct) list.get(i)).getOUTSIDE_TYP_name());
		}
		return size;
	}
	public int setL2L_OUTSIDE_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OUTSIDE_TYP_val == null) {
			l_OUTSIDE_TYP_val = new ArrayList();
		} else {
			l_OUTSIDE_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OUTSIDE_TYP_val.add(((AA0030010Struct) list.get(i)).getOUTSIDE_TYP_val());
		}
		return size;
	}
	public int setL2L_ACPT_INSPC_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACPT_INSPC_TYP_name == null) {
			l_ACPT_INSPC_TYP_name = new ArrayList();
		} else {
			l_ACPT_INSPC_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACPT_INSPC_TYP_name.add(((AA0030010Struct) list.get(i)).getACPT_INSPC_TYP_name());
		}
		return size;
	}
	public int setL2L_ACPT_INSPC_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACPT_INSPC_TYP_val == null) {
			l_ACPT_INSPC_TYP_val = new ArrayList();
		} else {
			l_ACPT_INSPC_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACPT_INSPC_TYP_val.add(((AA0030010Struct) list.get(i)).getACPT_INSPC_TYP_val());
		}
		return size;
	}
	public int setL2L_OUTSIDE_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OUTSIDE_NAME == null) {
			l_OUTSIDE_NAME = new ArrayList();
		} else {
			l_OUTSIDE_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OUTSIDE_NAME.add(((AA0030010Struct) list.get(i)).getOUTSIDE_NAME());
		}
		return size;
	}
	public int setL2L_ITEM_MRP_ODR_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_MRP_ODR_NAME == null) {
			l_ITEM_MRP_ODR_NAME = new ArrayList();
		} else {
			l_ITEM_MRP_ODR_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_MRP_ODR_NAME.add(((AA0030010Struct) list.get(i)).getITEM_MRP_ODR_NAME());
		}
		return size;
	}
	public int setL2L_ITEM_OUTSIDE_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_OUTSIDE_NAME == null) {
			l_ITEM_OUTSIDE_NAME = new ArrayList();
		} else {
			l_ITEM_OUTSIDE_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_OUTSIDE_NAME.add(((AA0030010Struct) list.get(i)).getITEM_OUTSIDE_NAME());
		}
		return size;
	}
	public int setL2L_ITEM_OPR_RSLT_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_OPR_RSLT_NAME == null) {
			l_ITEM_OPR_RSLT_NAME = new ArrayList();
		} else {
			l_ITEM_OPR_RSLT_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_OPR_RSLT_NAME.add(((AA0030010Struct) list.get(i)).getITEM_OPR_RSLT_NAME());
		}
		return size;
	}
	public int setL2L_ACPT_INSPC_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACPT_INSPC_NAME == null) {
			l_ACPT_INSPC_NAME = new ArrayList();
		} else {
			l_ACPT_INSPC_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACPT_INSPC_NAME.add(((AA0030010Struct) list.get(i)).getACPT_INSPC_NAME());
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
			l_h_ITEM_CD.add(((AA0030010Struct) list.get(i)).geth_ITEM_CD());
		}
		return size;
	}
	public int setL2L_LT_UNIT_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LT_UNIT_1 == null) {
			l_LT_UNIT_1 = new ArrayList();
		} else {
			l_LT_UNIT_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LT_UNIT_1.add(((AA0030010Struct) list.get(i)).getLT_UNIT_1());
		}
		return size;
	}
	public int setL2L_LT_UNIT_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LT_UNIT_2 == null) {
			l_LT_UNIT_2 = new ArrayList();
		} else {
			l_LT_UNIT_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LT_UNIT_2.add(((AA0030010Struct) list.get(i)).getLT_UNIT_2());
		}
		return size;
	}
	public int setL2L_LT_UNIT_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LT_UNIT_3 == null) {
			l_LT_UNIT_3 = new ArrayList();
		} else {
			l_LT_UNIT_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LT_UNIT_3.add(((AA0030010Struct) list.get(i)).getLT_UNIT_3());
		}
		return size;
	}
	public int setL2L_ITEM_MANHOUR_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_MANHOUR_NAME == null) {
			l_ITEM_MANHOUR_NAME = new ArrayList();
		} else {
			l_ITEM_MANHOUR_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_MANHOUR_NAME.add(((AA0030010Struct) list.get(i)).getITEM_MANHOUR_NAME());
		}
		return size;
	}
	public int setL2L_MRP_ODR_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_ODR_TYP_name == null) {
			l_MRP_ODR_TYP_name = new ArrayList();
		} else {
			l_MRP_ODR_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_ODR_TYP_name.add(((AA0030010Struct) list.get(i)).getMRP_ODR_TYP_name());
		}
		return size;
	}
	public int setL2L_MRP_ODR_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_ODR_TYP_val == null) {
			l_MRP_ODR_TYP_val = new ArrayList();
		} else {
			l_MRP_ODR_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_ODR_TYP_val.add(((AA0030010Struct) list.get(i)).getMRP_ODR_TYP_val());
		}
		return size;
	}
	public int setL2L_OPR_RSLT_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_RSLT_TYP_name == null) {
			l_OPR_RSLT_TYP_name = new ArrayList();
		} else {
			l_OPR_RSLT_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_RSLT_TYP_name.add(((AA0030010Struct) list.get(i)).getOPR_RSLT_TYP_name());
		}
		return size;
	}
	public int setL2L_OPR_RSLT_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_RSLT_TYP_val == null) {
			l_OPR_RSLT_TYP_val = new ArrayList();
		} else {
			l_OPR_RSLT_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_RSLT_TYP_val.add(((AA0030010Struct) list.get(i)).getOPR_RSLT_TYP_val());
		}
		return size;
	}
	public int setL2L_MANHOUR_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MANHOUR_TYP_name == null) {
			l_MANHOUR_TYP_name = new ArrayList();
		} else {
			l_MANHOUR_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MANHOUR_TYP_name.add(((AA0030010Struct) list.get(i)).getMANHOUR_TYP_name());
		}
		return size;
	}
	public int setL2L_MANHOUR_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MANHOUR_TYP_val == null) {
			l_MANHOUR_TYP_val = new ArrayList();
		} else {
			l_MANHOUR_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MANHOUR_TYP_val.add(((AA0030010Struct) list.get(i)).getMANHOUR_TYP_val());
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
			l_PLANT_CD.add(((AA0030010Struct) list.get(i)).getPLANT_CD());
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
			l_ITEM_CD.add(((AA0030010Struct) list.get(i)).getITEM_CD());
		}
		return size;
	}
	public int setL2L_PROC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_CD == null) {
			l_PROC_CD = new ArrayList();
		} else {
			l_PROC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_CD.add(((AA0030010Struct) list.get(i)).getPROC_CD());
		}
		return size;
	}
	public int setL2L_PROC_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_NO == null) {
			l_PROC_NO = new ArrayList();
		} else {
			l_PROC_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_NO.add(((AA0030010Struct) list.get(i)).getPROC_NO());
		}
		return size;
	}
	public int setL2L_PROC_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_NAME == null) {
			l_PROC_NAME = new ArrayList();
		} else {
			l_PROC_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_NAME.add(((AA0030010Struct) list.get(i)).getPROC_NAME());
		}
		return size;
	}
	public int setL2L_WS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WS_CD == null) {
			l_WS_CD = new ArrayList();
		} else {
			l_WS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WS_CD.add(((AA0030010Struct) list.get(i)).getWS_CD());
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
			l_COMPANY_CD.add(((AA0030010Struct) list.get(i)).getCOMPANY_CD());
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
			l_VEND_CD.add(((AA0030010Struct) list.get(i)).getVEND_CD());
		}
		return size;
	}
	public int setL2L_FIXED_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FIXED_LT == null) {
			l_FIXED_LT = new ArrayList();
		} else {
			l_FIXED_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FIXED_LT.add(((AA0030010Struct) list.get(i)).getFIXED_LT());
		}
		return size;
	}
	public int setL2L_PROP_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROP_LT == null) {
			l_PROP_LT = new ArrayList();
		} else {
			l_PROP_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROP_LT.add(((AA0030010Struct) list.get(i)).getPROP_LT());
		}
		return size;
	}
	public int setL2L_SAFETY_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SAFETY_LT == null) {
			l_SAFETY_LT = new ArrayList();
		} else {
			l_SAFETY_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SAFETY_LT.add(((AA0030010Struct) list.get(i)).getSAFETY_LT());
		}
		return size;
	}
	public int setL2L_PROP_LOT_SIZE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROP_LOT_SIZE == null) {
			l_PROP_LOT_SIZE = new ArrayList();
		} else {
			l_PROP_LOT_SIZE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROP_LOT_SIZE.add(((AA0030010Struct) list.get(i)).getPROP_LOT_SIZE());
		}
		return size;
	}
	public int setL2L_SPOIL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SPOIL == null) {
			l_SPOIL = new ArrayList();
		} else {
			l_SPOIL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SPOIL.add(((AA0030010Struct) list.get(i)).getSPOIL());
		}
		return size;
	}
	public int setL2L_OUTSIDE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OUTSIDE_TYP == null) {
			l_OUTSIDE_TYP = new ArrayList();
		} else {
			l_OUTSIDE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OUTSIDE_TYP.add(((AA0030010Struct) list.get(i)).getOUTSIDE_TYP());
		}
		return size;
	}
	public int setL2L_ACPT_INSPC_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACPT_INSPC_TYP == null) {
			l_ACPT_INSPC_TYP = new ArrayList();
		} else {
			l_ACPT_INSPC_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACPT_INSPC_TYP.add(((AA0030010Struct) list.get(i)).getACPT_INSPC_TYP());
		}
		return size;
	}
	public int setL2L_STANDARD_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STANDARD_COST == null) {
			l_STANDARD_COST = new ArrayList();
		} else {
			l_STANDARD_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STANDARD_COST.add(((AA0030010Struct) list.get(i)).getSTANDARD_COST());
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
			l_MODIFY_COUNT.add(((AA0030010Struct) list.get(i)).getMODIFY_COUNT());
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
			l_ITEM_NAME.add(((AA0030010Struct) list.get(i)).getITEM_NAME());
		}
		return size;
	}
	public int setL2L_WS_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WS_NAME == null) {
			l_WS_NAME = new ArrayList();
		} else {
			l_WS_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WS_NAME.add(((AA0030010Struct) list.get(i)).getWS_NAME());
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
			l_VEND_NAME.add(((AA0030010Struct) list.get(i)).getVEND_NAME());
		}
		return size;
	}
	public int setL2L_DRAW_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DRAW_CD == null) {
			l_DRAW_CD = new ArrayList();
		} else {
			l_DRAW_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DRAW_CD.add(((AA0030010Struct) list.get(i)).getDRAW_CD());
		}
		return size;
	}
	public int setL2L_SPEC(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SPEC == null) {
			l_SPEC = new ArrayList();
		} else {
			l_SPEC.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SPEC.add(((AA0030010Struct) list.get(i)).getSPEC());
		}
		return size;
	}
	public int setL2L_MRP_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_ODR_TYP == null) {
			l_MRP_ODR_TYP = new ArrayList();
		} else {
			l_MRP_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_ODR_TYP.add(((AA0030010Struct) list.get(i)).getMRP_ODR_TYP());
		}
		return size;
	}
	public int setL2L_ITEM_OUTSIDE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_OUTSIDE_TYP == null) {
			l_ITEM_OUTSIDE_TYP = new ArrayList();
		} else {
			l_ITEM_OUTSIDE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_OUTSIDE_TYP.add(((AA0030010Struct) list.get(i)).getITEM_OUTSIDE_TYP());
		}
		return size;
	}
	public int setL2L_OPR_RSLT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_RSLT_TYP == null) {
			l_OPR_RSLT_TYP = new ArrayList();
		} else {
			l_OPR_RSLT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_RSLT_TYP.add(((AA0030010Struct) list.get(i)).getOPR_RSLT_TYP());
		}
		return size;
	}
	public int setL2L_ITEM_FIXED_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_FIXED_LT == null) {
			l_ITEM_FIXED_LT = new ArrayList();
		} else {
			l_ITEM_FIXED_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_FIXED_LT.add(((AA0030010Struct) list.get(i)).getITEM_FIXED_LT());
		}
		return size;
	}
	public int setL2L_ITEM_PROP_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_PROP_LT == null) {
			l_ITEM_PROP_LT = new ArrayList();
		} else {
			l_ITEM_PROP_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_PROP_LT.add(((AA0030010Struct) list.get(i)).getITEM_PROP_LT());
		}
		return size;
	}
	public int setL2L_ITEM_PROP_LOT_SIZE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_PROP_LOT_SIZE == null) {
			l_ITEM_PROP_LOT_SIZE = new ArrayList();
		} else {
			l_ITEM_PROP_LOT_SIZE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_PROP_LOT_SIZE.add(((AA0030010Struct) list.get(i)).getITEM_PROP_LOT_SIZE());
		}
		return size;
	}
	public int setL2L_ITEM_ISSUE_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_ISSUE_LT == null) {
			l_ITEM_ISSUE_LT = new ArrayList();
		} else {
			l_ITEM_ISSUE_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_ISSUE_LT.add(((AA0030010Struct) list.get(i)).getITEM_ISSUE_LT());
		}
		return size;
	}
	public int setL2L_ITEM_SAFETY_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_SAFETY_LT == null) {
			l_ITEM_SAFETY_LT = new ArrayList();
		} else {
			l_ITEM_SAFETY_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_SAFETY_LT.add(((AA0030010Struct) list.get(i)).getITEM_SAFETY_LT());
		}
		return size;
	}
	public int setL2L_UNIT_QTY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_QTY_TYP == null) {
			l_UNIT_QTY_TYP = new ArrayList();
		} else {
			l_UNIT_QTY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_QTY_TYP.add(((AA0030010Struct) list.get(i)).getUNIT_QTY_TYP());
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
			l_STOCK_UNIT.add(((AA0030010Struct) list.get(i)).getSTOCK_UNIT());
		}
		return size;
	}
	public int setL2L_MANHOUR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MANHOUR_TYP == null) {
			l_MANHOUR_TYP = new ArrayList();
		} else {
			l_MANHOUR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MANHOUR_TYP.add(((AA0030010Struct) list.get(i)).getMANHOUR_TYP());
		}
		return size;
	}
	public int setL2L_TIME_CTRL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TIME_CTRL == null) {
			l_TIME_CTRL = new ArrayList();
		} else {
			l_TIME_CTRL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TIME_CTRL.add(((AA0030010Struct) list.get(i)).getTIME_CTRL());
		}
		return size;
	}
	public int setL2L_LT_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LT_UNIT == null) {
			l_LT_UNIT = new ArrayList();
		} else {
			l_LT_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LT_UNIT.add(((AA0030010Struct) list.get(i)).getLT_UNIT());
		}
		return size;
	}
	public int setL2L_BOM_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BOM_ITEM_CD == null) {
			l_BOM_ITEM_CD = new ArrayList();
		} else {
			l_BOM_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BOM_ITEM_CD.add(((AA0030010Struct) list.get(i)).getBOM_ITEM_CD());
		}
		return size;
	}
	public int setL2L_BOM_FIXED_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BOM_FIXED_LT == null) {
			l_BOM_FIXED_LT = new ArrayList();
		} else {
			l_BOM_FIXED_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BOM_FIXED_LT.add(((AA0030010Struct) list.get(i)).getBOM_FIXED_LT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_OUTSIDE_TYP_name = null;
		m_OUTSIDE_TYP_val = null;
		m_ACPT_INSPC_TYP_name = null;
		m_ACPT_INSPC_TYP_val = null;
		m_OUTSIDE_NAME = null;
		m_ITEM_MRP_ODR_NAME = null;
		m_ITEM_OUTSIDE_NAME = null;
		m_ITEM_OPR_RSLT_NAME = null;
		m_ACPT_INSPC_NAME = null;
		m_h_ITEM_CD = null;
		m_LT_UNIT_1 = null;
		m_LT_UNIT_2 = null;
		m_LT_UNIT_3 = null;
		m_ITEM_MANHOUR_NAME = null;
		m_MRP_ODR_TYP_name = null;
		m_MRP_ODR_TYP_val = null;
		m_OPR_RSLT_TYP_name = null;
		m_OPR_RSLT_TYP_val = null;
		m_MANHOUR_TYP_name = null;
		m_MANHOUR_TYP_val = null;
		m_PLANT_CD = null;
		m_ITEM_CD = null;
		m_PROC_CD = null;
		m_PROC_NO = null;
		m_PROC_NAME = null;
		m_WS_CD = null;
		m_COMPANY_CD = null;
		m_VEND_CD = null;
		m_FIXED_LT = null;
		m_PROP_LT = null;
		m_SAFETY_LT = null;
		m_PROP_LOT_SIZE = null;
		m_SPOIL = null;
		m_OUTSIDE_TYP = null;
		m_ACPT_INSPC_TYP = null;
		m_STANDARD_COST = null;
		m_MODIFY_COUNT = null;
		m_ITEM_NAME = null;
		m_WS_NAME = null;
		m_VEND_NAME = null;
		m_DRAW_CD = null;
		m_SPEC = null;
		m_MRP_ODR_TYP = null;
		m_ITEM_OUTSIDE_TYP = null;
		m_OPR_RSLT_TYP = null;
		m_ITEM_FIXED_LT = null;
		m_ITEM_PROP_LT = null;
		m_ITEM_PROP_LOT_SIZE = null;
		m_ITEM_ISSUE_LT = null;
		m_ITEM_SAFETY_LT = null;
		m_UNIT_QTY_TYP = null;
		m_STOCK_UNIT = null;
		m_MANHOUR_TYP = null;
		m_TIME_CTRL = null;
		m_LT_UNIT = null;
		m_BOM_ITEM_CD = null;
		m_BOM_FIXED_LT = null;

		l_OUTSIDE_TYP_name = null;
		l_OUTSIDE_TYP_val = null;
		l_ACPT_INSPC_TYP_name = null;
		l_ACPT_INSPC_TYP_val = null;
		l_OUTSIDE_NAME = null;
		l_ITEM_MRP_ODR_NAME = null;
		l_ITEM_OUTSIDE_NAME = null;
		l_ITEM_OPR_RSLT_NAME = null;
		l_ACPT_INSPC_NAME = null;
		l_h_ITEM_CD = null;
		l_LT_UNIT_1 = null;
		l_LT_UNIT_2 = null;
		l_LT_UNIT_3 = null;
		l_ITEM_MANHOUR_NAME = null;
		l_MRP_ODR_TYP_name = null;
		l_MRP_ODR_TYP_val = null;
		l_OPR_RSLT_TYP_name = null;
		l_OPR_RSLT_TYP_val = null;
		l_MANHOUR_TYP_name = null;
		l_MANHOUR_TYP_val = null;
		l_PLANT_CD = null;
		l_ITEM_CD = null;
		l_PROC_CD = null;
		l_PROC_NO = null;
		l_PROC_NAME = null;
		l_WS_CD = null;
		l_COMPANY_CD = null;
		l_VEND_CD = null;
		l_FIXED_LT = null;
		l_PROP_LT = null;
		l_SAFETY_LT = null;
		l_PROP_LOT_SIZE = null;
		l_SPOIL = null;
		l_OUTSIDE_TYP = null;
		l_ACPT_INSPC_TYP = null;
		l_STANDARD_COST = null;
		l_MODIFY_COUNT = null;
		l_ITEM_NAME = null;
		l_WS_NAME = null;
		l_VEND_NAME = null;
		l_DRAW_CD = null;
		l_SPEC = null;
		l_MRP_ODR_TYP = null;
		l_ITEM_OUTSIDE_TYP = null;
		l_OPR_RSLT_TYP = null;
		l_ITEM_FIXED_LT = null;
		l_ITEM_PROP_LT = null;
		l_ITEM_PROP_LOT_SIZE = null;
		l_ITEM_ISSUE_LT = null;
		l_ITEM_SAFETY_LT = null;
		l_UNIT_QTY_TYP = null;
		l_STOCK_UNIT = null;
		l_MANHOUR_TYP = null;
		l_TIME_CTRL = null;
		l_LT_UNIT = null;
		l_BOM_ITEM_CD = null;
		l_BOM_FIXED_LT = null;

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
	 * medAA0030010クラスの標準コンストラクタ
	 */
	public AA0030010Struct()
	{
		//{{user_implement_code_constractor
                //---------------------------------------------------------------------
              
                initialize();
              
                //---------------------------------------------------------------------
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
	public void setStruct(AA0030010Struct struct)
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
	public void setStructM(AA0030010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setOUTSIDE_TYP_name(struct.getOUTSIDE_TYP_name());
			this.setOUTSIDE_TYP_val(struct.getOUTSIDE_TYP_val());
			this.setACPT_INSPC_TYP_name(struct.getACPT_INSPC_TYP_name());
			this.setACPT_INSPC_TYP_val(struct.getACPT_INSPC_TYP_val());
			this.setOUTSIDE_NAME(struct.getOUTSIDE_NAME());
			this.setITEM_MRP_ODR_NAME(struct.getITEM_MRP_ODR_NAME());
			this.setITEM_OUTSIDE_NAME(struct.getITEM_OUTSIDE_NAME());
			this.setITEM_OPR_RSLT_NAME(struct.getITEM_OPR_RSLT_NAME());
			this.setACPT_INSPC_NAME(struct.getACPT_INSPC_NAME());
			this.seth_ITEM_CD(struct.geth_ITEM_CD());
			this.setLT_UNIT_1(struct.getLT_UNIT_1());
			this.setLT_UNIT_2(struct.getLT_UNIT_2());
			this.setLT_UNIT_3(struct.getLT_UNIT_3());
			this.setITEM_MANHOUR_NAME(struct.getITEM_MANHOUR_NAME());
			this.setMRP_ODR_TYP_name(struct.getMRP_ODR_TYP_name());
			this.setMRP_ODR_TYP_val(struct.getMRP_ODR_TYP_val());
			this.setOPR_RSLT_TYP_name(struct.getOPR_RSLT_TYP_name());
			this.setOPR_RSLT_TYP_val(struct.getOPR_RSLT_TYP_val());
			this.setMANHOUR_TYP_name(struct.getMANHOUR_TYP_name());
			this.setMANHOUR_TYP_val(struct.getMANHOUR_TYP_val());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setITEM_CD(struct.getITEM_CD());
			this.setPROC_CD(struct.getPROC_CD());
			this.setPROC_NO(struct.getPROC_NO());
			this.setPROC_NAME(struct.getPROC_NAME());
			this.setWS_CD(struct.getWS_CD());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setVEND_CD(struct.getVEND_CD());
			this.setFIXED_LT(struct.getFIXED_LT());
			this.setPROP_LT(struct.getPROP_LT());
			this.setSAFETY_LT(struct.getSAFETY_LT());
			this.setPROP_LOT_SIZE(struct.getPROP_LOT_SIZE());
			this.setSPOIL(struct.getSPOIL());
			this.setOUTSIDE_TYP(struct.getOUTSIDE_TYP());
			this.setACPT_INSPC_TYP(struct.getACPT_INSPC_TYP());
			this.setSTANDARD_COST(struct.getSTANDARD_COST());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setWS_NAME(struct.getWS_NAME());
			this.setVEND_NAME(struct.getVEND_NAME());
			this.setDRAW_CD(struct.getDRAW_CD());
			this.setSPEC(struct.getSPEC());
			this.setMRP_ODR_TYP(struct.getMRP_ODR_TYP());
			this.setITEM_OUTSIDE_TYP(struct.getITEM_OUTSIDE_TYP());
			this.setOPR_RSLT_TYP(struct.getOPR_RSLT_TYP());
			this.setITEM_FIXED_LT(struct.getITEM_FIXED_LT());
			this.setITEM_PROP_LT(struct.getITEM_PROP_LT());
			this.setITEM_PROP_LOT_SIZE(struct.getITEM_PROP_LOT_SIZE());
			this.setITEM_ISSUE_LT(struct.getITEM_ISSUE_LT());
			this.setITEM_SAFETY_LT(struct.getITEM_SAFETY_LT());
			this.setUNIT_QTY_TYP(struct.getUNIT_QTY_TYP());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setMANHOUR_TYP(struct.getMANHOUR_TYP());
			this.setTIME_CTRL(struct.getTIME_CTRL());
			this.setLT_UNIT(struct.getLT_UNIT());
			this.setBOM_ITEM_CD(struct.getBOM_ITEM_CD());
			this.setBOM_FIXED_LT(struct.getBOM_FIXED_LT());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AA0030010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_OUTSIDE_TYP_name(struct.getList_OUTSIDE_TYP_name());
			this.setList_OUTSIDE_TYP_val(struct.getList_OUTSIDE_TYP_val());
			this.setList_ACPT_INSPC_TYP_name(struct.getList_ACPT_INSPC_TYP_name());
			this.setList_ACPT_INSPC_TYP_val(struct.getList_ACPT_INSPC_TYP_val());
			this.setList_OUTSIDE_NAME(struct.getList_OUTSIDE_NAME());
			this.setList_ITEM_MRP_ODR_NAME(struct.getList_ITEM_MRP_ODR_NAME());
			this.setList_ITEM_OUTSIDE_NAME(struct.getList_ITEM_OUTSIDE_NAME());
			this.setList_ITEM_OPR_RSLT_NAME(struct.getList_ITEM_OPR_RSLT_NAME());
			this.setList_ACPT_INSPC_NAME(struct.getList_ACPT_INSPC_NAME());
			this.setList_h_ITEM_CD(struct.getList_h_ITEM_CD());
			this.setList_LT_UNIT_1(struct.getList_LT_UNIT_1());
			this.setList_LT_UNIT_2(struct.getList_LT_UNIT_2());
			this.setList_LT_UNIT_3(struct.getList_LT_UNIT_3());
			this.setList_ITEM_MANHOUR_NAME(struct.getList_ITEM_MANHOUR_NAME());
			this.setList_MRP_ODR_TYP_name(struct.getList_MRP_ODR_TYP_name());
			this.setList_MRP_ODR_TYP_val(struct.getList_MRP_ODR_TYP_val());
			this.setList_OPR_RSLT_TYP_name(struct.getList_OPR_RSLT_TYP_name());
			this.setList_OPR_RSLT_TYP_val(struct.getList_OPR_RSLT_TYP_val());
			this.setList_MANHOUR_TYP_name(struct.getList_MANHOUR_TYP_name());
			this.setList_MANHOUR_TYP_val(struct.getList_MANHOUR_TYP_val());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_PROC_CD(struct.getList_PROC_CD());
			this.setList_PROC_NO(struct.getList_PROC_NO());
			this.setList_PROC_NAME(struct.getList_PROC_NAME());
			this.setList_WS_CD(struct.getList_WS_CD());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_FIXED_LT(struct.getList_FIXED_LT());
			this.setList_PROP_LT(struct.getList_PROP_LT());
			this.setList_SAFETY_LT(struct.getList_SAFETY_LT());
			this.setList_PROP_LOT_SIZE(struct.getList_PROP_LOT_SIZE());
			this.setList_SPOIL(struct.getList_SPOIL());
			this.setList_OUTSIDE_TYP(struct.getList_OUTSIDE_TYP());
			this.setList_ACPT_INSPC_TYP(struct.getList_ACPT_INSPC_TYP());
			this.setList_STANDARD_COST(struct.getList_STANDARD_COST());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_WS_NAME(struct.getList_WS_NAME());
			this.setList_VEND_NAME(struct.getList_VEND_NAME());
			this.setList_DRAW_CD(struct.getList_DRAW_CD());
			this.setList_SPEC(struct.getList_SPEC());
			this.setList_MRP_ODR_TYP(struct.getList_MRP_ODR_TYP());
			this.setList_ITEM_OUTSIDE_TYP(struct.getList_ITEM_OUTSIDE_TYP());
			this.setList_OPR_RSLT_TYP(struct.getList_OPR_RSLT_TYP());
			this.setList_ITEM_FIXED_LT(struct.getList_ITEM_FIXED_LT());
			this.setList_ITEM_PROP_LT(struct.getList_ITEM_PROP_LT());
			this.setList_ITEM_PROP_LOT_SIZE(struct.getList_ITEM_PROP_LOT_SIZE());
			this.setList_ITEM_ISSUE_LT(struct.getList_ITEM_ISSUE_LT());
			this.setList_ITEM_SAFETY_LT(struct.getList_ITEM_SAFETY_LT());
			this.setList_UNIT_QTY_TYP(struct.getList_UNIT_QTY_TYP());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_MANHOUR_TYP(struct.getList_MANHOUR_TYP());
			this.setList_TIME_CTRL(struct.getList_TIME_CTRL());
			this.setList_LT_UNIT(struct.getList_LT_UNIT());
			this.setList_BOM_ITEM_CD(struct.getList_BOM_ITEM_CD());
			this.setList_BOM_FIXED_LT(struct.getList_BOM_FIXED_LT());
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
	// 第 1 変数初期値： i_OUTSIDE_TYP_name


	final static String i_OUTSIDE_TYP_name = null;

	// 第 2 変数初期値： i_OUTSIDE_TYP_val


	final static String i_OUTSIDE_TYP_val = null;

	// 第 3 変数初期値： i_ACPT_INSPC_TYP_name


	final static String i_ACPT_INSPC_TYP_name = null;

	// 第 4 変数初期値： i_ACPT_INSPC_TYP_val


	final static String i_ACPT_INSPC_TYP_val = null;

	// 第 5 変数初期値： i_OUTSIDE_NAME


	final static String i_OUTSIDE_NAME = null;

	// 第 6 変数初期値： i_ITEM_MRP_ODR_NAME


	final static String i_ITEM_MRP_ODR_NAME = null;

	// 第 7 変数初期値： i_ITEM_OUTSIDE_NAME


	final static String i_ITEM_OUTSIDE_NAME = null;

	// 第 8 変数初期値： i_ITEM_OPR_RSLT_NAME


	final static String i_ITEM_OPR_RSLT_NAME = null;

	// 第 9 変数初期値： i_ACPT_INSPC_NAME


	final static String i_ACPT_INSPC_NAME = null;

	// 第 10 変数初期値： i_h_ITEM_CD


	final static String i_h_ITEM_CD = null;

	// 第 11 変数初期値： i_LT_UNIT_1


	final static String i_LT_UNIT_1 = null;

	// 第 12 変数初期値： i_LT_UNIT_2


	final static String i_LT_UNIT_2 = null;

	// 第 13 変数初期値： i_LT_UNIT_3


	final static String i_LT_UNIT_3 = null;

	// 第 14 変数初期値： i_ITEM_MANHOUR_NAME


	final static String i_ITEM_MANHOUR_NAME = null;

	// 第 15 変数初期値： i_MRP_ODR_TYP_name


	final static String i_MRP_ODR_TYP_name = null;

	// 第 16 変数初期値： i_MRP_ODR_TYP_val


	final static String i_MRP_ODR_TYP_val = null;

	// 第 17 変数初期値： i_OPR_RSLT_TYP_name


	final static String i_OPR_RSLT_TYP_name = null;

	// 第 18 変数初期値： i_OPR_RSLT_TYP_val


	final static String i_OPR_RSLT_TYP_val = null;

	// 第 19 変数初期値： i_MANHOUR_TYP_name


	final static String i_MANHOUR_TYP_name = null;

	// 第 20 変数初期値： i_MANHOUR_TYP_val


	final static String i_MANHOUR_TYP_val = null;

	// 第 21 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

	// 第 22 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 23 変数初期値： i_PROC_CD


	final static String i_PROC_CD = null;

	// 第 24 変数初期値： i_PROC_NO


	final static String i_PROC_NO = null;

	// 第 25 変数初期値： i_PROC_NAME


	final static String i_PROC_NAME = null;

	// 第 26 変数初期値： i_WS_CD


	final static String i_WS_CD = null;

	// 第 27 変数初期値： i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// 第 28 変数初期値： i_VEND_CD


	final static String i_VEND_CD = null;

	// 第 29 変数初期値： i_FIXED_LT


	final static String i_FIXED_LT = null;

	// 第 30 変数初期値： i_PROP_LT


	final static String i_PROP_LT = null;

	// 第 31 変数初期値： i_SAFETY_LT


	final static String i_SAFETY_LT = null;

	// 第 32 変数初期値： i_PROP_LOT_SIZE


	final static String i_PROP_LOT_SIZE = null;

	// 第 33 変数初期値： i_SPOIL


	final static String i_SPOIL = null;

	// 第 34 変数初期値： i_OUTSIDE_TYP


	final static Integer i_OUTSIDE_TYP = null;

	// 第 35 変数初期値： i_ACPT_INSPC_TYP


	final static Integer i_ACPT_INSPC_TYP = null;

	// 第 36 変数初期値： i_STANDARD_COST


	final static String i_STANDARD_COST = null;

	// 第 37 変数初期値： i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// 第 38 変数初期値： i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// 第 39 変数初期値： i_WS_NAME


	final static String i_WS_NAME = null;

	// 第 40 変数初期値： i_VEND_NAME


	final static String i_VEND_NAME = null;

	// 第 41 変数初期値： i_DRAW_CD


	final static String i_DRAW_CD = null;

	// 第 42 変数初期値： i_SPEC


	final static String i_SPEC = null;

	// 第 43 変数初期値： i_MRP_ODR_TYP


	final static Integer i_MRP_ODR_TYP = null;

	// 第 44 変数初期値： i_ITEM_OUTSIDE_TYP


	final static Integer i_ITEM_OUTSIDE_TYP = null;

	// 第 45 変数初期値： i_OPR_RSLT_TYP


	final static Integer i_OPR_RSLT_TYP = null;

	// 第 46 変数初期値： i_ITEM_FIXED_LT


	final static Long i_ITEM_FIXED_LT = null;

	// 第 47 変数初期値： i_ITEM_PROP_LT


	final static Long i_ITEM_PROP_LT = null;

	// 第 48 変数初期値： i_ITEM_PROP_LOT_SIZE


	final static String i_ITEM_PROP_LOT_SIZE = null;

	// 第 49 変数初期値： i_ITEM_ISSUE_LT


	final static Long i_ITEM_ISSUE_LT = null;

	// 第 50 変数初期値： i_ITEM_SAFETY_LT


	final static Long i_ITEM_SAFETY_LT = null;

	// 第 51 変数初期値： i_UNIT_QTY_TYP


	final static Integer i_UNIT_QTY_TYP = null;

	// 第 52 変数初期値： i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// 第 53 変数初期値： i_MANHOUR_TYP


	final static Integer i_MANHOUR_TYP = null;

	// 第 54 変数初期値： i_TIME_CTRL


	final static String i_TIME_CTRL = null;

	// 第 55 変数初期値： i_LT_UNIT


	final static String i_LT_UNIT = null;

	// 第 56 変数初期値： i_BOM_ITEM_CD


	final static String i_BOM_ITEM_CD = null;

	// 第 57 変数初期値： i_BOM_FIXED_LT


	final static Long i_BOM_FIXED_LT = null;

*/

	//{{user_implement_code
         
        /**
         * 初期設定
         */
        public void initialize()
        {
         clear();
         m_PROC_NO = AA0030Common._PROC_NO;
         m_FIXED_LT = AA0030Common._FIXED_LT;
         m_PROP_LT = AA0030Common._PROP_LT;
         m_SAFETY_LT = AA0030Common._SAFETY_LT;
         m_PROP_LOT_SIZE = AA0030Common._PROP_LOT_SIZE;
         m_SPOIL = AA0030Common._SPOIL;
         m_OUTSIDE_TYP = AA0030Common._OUTSIDE_TYP;
         m_ACPT_INSPC_TYP = AA0030Common._ACPT_INSPC_TYP;
         m_STANDARD_COST = AA0030Common._STANDARD_COST;
        }
       
        /**
         * コピー
         * @param struct コピー対象
         */
        public void copy(AA0030010Struct struct)
        {
         if(struct.m_PLANT_CD != null) m_PLANT_CD = new String(struct.m_PLANT_CD);
         else m_PLANT_CD = null;
       
         if(struct.m_ITEM_CD != null) m_ITEM_CD = new String(struct.m_ITEM_CD);
         else m_ITEM_CD = null;
       
         if(struct.m_h_ITEM_CD != null) m_h_ITEM_CD = new String(struct.m_h_ITEM_CD);
         else m_h_ITEM_CD = null;
       
         if(struct.m_PROC_CD != null) m_PROC_CD = new String(struct.m_PROC_CD);
         else m_PROC_CD = null;
       
         if(struct.m_PROC_NO != null) m_PROC_NO = new String(struct.m_PROC_NO);
         else m_PROC_NO = null;
       
         if(struct.m_PROC_NAME != null) m_PROC_NAME = new String(struct.m_PROC_NAME);
         else m_PROC_NAME = null;
       
         if(struct.m_WS_CD != null) m_WS_CD = new String(struct.m_WS_CD);
         else m_WS_CD = null;
       
         if(struct.m_COMPANY_CD != null) m_COMPANY_CD = new String(struct.m_COMPANY_CD);
         else m_COMPANY_CD = null;
       
         if(struct.m_VEND_CD != null) m_VEND_CD = new String(struct.m_VEND_CD);
         else m_VEND_CD = null;
       
         if(struct.m_FIXED_LT != null) m_FIXED_LT = new String(struct.m_FIXED_LT);
         else m_FIXED_LT = null;
       
         if(struct.m_PROP_LT != null) m_PROP_LT = new String(struct.m_PROP_LT);
         else m_PROP_LT = null;
       
         if(struct.m_SAFETY_LT != null) m_SAFETY_LT = new String(struct.m_SAFETY_LT);
         else m_SAFETY_LT = null;
       
         if(struct.m_PROP_LOT_SIZE != null) m_PROP_LOT_SIZE = new String(struct.m_PROP_LOT_SIZE);
         else m_PROP_LOT_SIZE = null;
       
         if(struct.m_SPOIL != null) m_SPOIL = new String(struct.m_SPOIL);
         else m_SPOIL = null;
       
         if(struct.m_OUTSIDE_TYP != null) m_OUTSIDE_TYP = new Integer((struct.m_OUTSIDE_TYP).intValue());
         else m_OUTSIDE_TYP = null;
       
         if(struct.m_ACPT_INSPC_TYP != null) m_ACPT_INSPC_TYP = new Integer((struct.m_ACPT_INSPC_TYP).intValue());
         else m_ACPT_INSPC_TYP = null;
       
         if(struct.m_STANDARD_COST != null) m_STANDARD_COST = new String(struct.m_STANDARD_COST);
         else m_STANDARD_COST = null;
       
         if(struct.m_MODIFY_COUNT != null) m_MODIFY_COUNT = new String(struct.m_MODIFY_COUNT);
         else m_MODIFY_COUNT = null;
       
         if(struct.m_ITEM_NAME != null) m_ITEM_NAME = new String(struct.m_ITEM_NAME);
         else m_ITEM_NAME = null;
       
         if(struct.m_WS_NAME != null) m_WS_NAME = new String(struct.m_WS_NAME);
         else m_WS_NAME = null;
       
         if(struct.m_VEND_NAME != null) m_VEND_NAME = new String(struct.m_VEND_NAME);
         else m_VEND_NAME = null;
       
         if(struct.m_DRAW_CD != null) m_DRAW_CD = new String(struct.m_DRAW_CD);
         else m_DRAW_CD = null;
       
         if(struct.m_SPEC != null) m_SPEC = new String(struct.m_SPEC);
         else m_SPEC = null;
       
         if(struct.m_MRP_ODR_TYP != null) m_MRP_ODR_TYP = new Integer((struct.m_MRP_ODR_TYP).intValue());
         else m_MRP_ODR_TYP = null;
       
         if(struct.m_ITEM_OUTSIDE_TYP != null) m_ITEM_OUTSIDE_TYP = new Integer((struct.m_ITEM_OUTSIDE_TYP).intValue());
         else m_ITEM_OUTSIDE_TYP = null;
       
         if(struct.m_OPR_RSLT_TYP != null) m_OPR_RSLT_TYP = new Integer((struct.m_OPR_RSLT_TYP).intValue());
         else m_OPR_RSLT_TYP = null;
       
         if(struct.m_ITEM_FIXED_LT != null) m_ITEM_FIXED_LT = new Long((struct.m_ITEM_FIXED_LT).longValue());
         else m_ITEM_FIXED_LT = null;
       
         if(struct.m_ITEM_PROP_LT != null) m_ITEM_PROP_LT = new Long((struct.m_ITEM_PROP_LT).longValue());
         else m_ITEM_PROP_LT = null;
       
         if(struct.m_ITEM_PROP_LOT_SIZE != null) m_ITEM_PROP_LOT_SIZE = new String(struct.m_ITEM_PROP_LOT_SIZE);
         else m_ITEM_PROP_LOT_SIZE = null;
       
         if(struct.m_ITEM_ISSUE_LT != null) m_ITEM_ISSUE_LT = new Long((struct.m_ITEM_ISSUE_LT).longValue());
         else m_ITEM_ISSUE_LT = null;
       
         if(struct.m_ITEM_SAFETY_LT != null) m_ITEM_SAFETY_LT = new Long((struct.m_ITEM_SAFETY_LT).longValue());
         else m_ITEM_SAFETY_LT = null;
       
         if(struct.m_UNIT_QTY_TYP != null) m_UNIT_QTY_TYP = new Integer((struct.m_UNIT_QTY_TYP).intValue());
         else m_UNIT_QTY_TYP = null;
       
         if(struct.m_OUTSIDE_TYP_name != null) m_OUTSIDE_TYP_name = new String(struct.m_OUTSIDE_TYP_name);
         else m_OUTSIDE_TYP_name = null;
       
         if(struct.m_OUTSIDE_TYP_val != null) m_OUTSIDE_TYP_val = new String(struct.m_OUTSIDE_TYP_val);
         else m_OUTSIDE_TYP_val = null;
       
         if(struct.m_VEND_NAME != null) m_VEND_NAME = new String(struct.m_VEND_NAME);
         else m_VEND_NAME = null;
       
         if(struct.m_ACPT_INSPC_TYP_name != null) m_ACPT_INSPC_TYP_name = new String(struct.m_ACPT_INSPC_TYP_name);
         else m_ACPT_INSPC_TYP_name = null;
       
         if(struct.m_ACPT_INSPC_TYP_val != null) m_ACPT_INSPC_TYP_val = new String(struct.m_ACPT_INSPC_TYP_val);
         else m_ACPT_INSPC_TYP_val = null;
       
         if(struct.m_OUTSIDE_NAME != null) m_OUTSIDE_NAME = new String(struct.m_OUTSIDE_NAME);
         else m_OUTSIDE_NAME = null;
       
         if(struct.m_ITEM_MRP_ODR_NAME != null) m_ITEM_MRP_ODR_NAME = new String(struct.m_ITEM_MRP_ODR_NAME);
         else m_ITEM_MRP_ODR_NAME = null;
       
         if(struct.m_ITEM_OUTSIDE_NAME != null) m_ITEM_OUTSIDE_NAME = new String(struct.m_ITEM_OUTSIDE_NAME);
         else m_ITEM_OUTSIDE_NAME = null;
       
         if(struct.m_ITEM_OPR_RSLT_NAME != null) m_ITEM_OPR_RSLT_NAME = new String(struct.m_ITEM_OPR_RSLT_NAME);
         else m_ITEM_OPR_RSLT_NAME = null;
       
         if(struct.m_ACPT_INSPC_NAME != null) m_ACPT_INSPC_NAME = new String(struct.m_ACPT_INSPC_NAME);
         else m_ACPT_INSPC_NAME = null;
       
         if(struct.m_MRP_ODR_TYP_name != null) m_MRP_ODR_TYP_name = new String(struct.m_MRP_ODR_TYP_name);
         else m_MRP_ODR_TYP_name = null;
       
         if(struct.m_MRP_ODR_TYP_val != null) m_MRP_ODR_TYP_val = new String(struct.m_MRP_ODR_TYP_val);
         else m_ACPT_INSPC_TYP_val = null;
       
         if(struct.m_OPR_RSLT_TYP_name != null) m_OPR_RSLT_TYP_name = new String(struct.m_OPR_RSLT_TYP_name);
         else m_OPR_RSLT_TYP_name = null;
       
         if(struct.m_OPR_RSLT_TYP_val != null) m_OPR_RSLT_TYP_val = new String(struct.m_OPR_RSLT_TYP_val);
         else m_OPR_RSLT_TYP_val = null;
       
         if(struct.m_STOCK_UNIT != null) m_STOCK_UNIT = new String(struct.m_STOCK_UNIT);
         else m_STOCK_UNIT = null;
       
// 2008/07/15 SYSCOM 小林 ADD START
         if(struct.m_MANHOUR_TYP != null) m_MANHOUR_TYP = new Integer((struct.m_MANHOUR_TYP).intValue());
         else m_MANHOUR_TYP = null;
       
         if(struct.m_ITEM_MANHOUR_NAME != null) m_ITEM_MANHOUR_NAME = new String(struct.m_ITEM_MANHOUR_NAME);
         else m_ITEM_MANHOUR_NAME = null;
       
         if(struct.m_MANHOUR_TYP_name != null) m_MANHOUR_TYP_name = new String(struct.m_MANHOUR_TYP_name);
         else m_MANHOUR_TYP_name = null;
       
         if(struct.m_MANHOUR_TYP_val != null) m_MANHOUR_TYP_val = new String(struct.m_MANHOUR_TYP_val);
         else m_MANHOUR_TYP_val = null;
// 2008/07/15 SYSCOM 小林 ADD END
        }
       
       
        /**
         * コピーコンストラクタ
         * @param struct コピー対象
         */
         public AA0030010Struct(AA0030010Struct struct)
         {
          copy(struct);
         }
       
        //}}user_implement_code

	//////////////////////////////

}
