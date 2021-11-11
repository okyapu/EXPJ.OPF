/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AF0090/src/com/nec/jp/orteus/metamorBase/AF0090/AF0090010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AF0090;

import com.nec.jp.orteus.xaf.wa.*;

import com.nec.jp.orteus.util.logging.*;

import java.lang.Number.*;
import java.lang.Float;
import java.util.*;
import java.sql.*;
import java.io.*;

//{{user_implement_code_import
import java.math.BigDecimal;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AF0090010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_w_JOB_ODR */
	public Integer m_w_JOB_ODR = null;
	/** 第 2 変数： m_w_INFERIOR */
	public Integer m_w_INFERIOR = null;
	/** 第 3 変数： m_c_JOB_ODR_CD */
	public String m_c_JOB_ODR_CD = null;
	/** 第 4 変数： m_c_RCV_ISSUE_QTY */
	public String m_c_RCV_ISSUE_QTY = null;
	/** 第 5 変数： m_ALC_POS_QTY */
	public String m_ALC_POS_QTY = null;
	/** 第 6 変数： m_THIS_TIME_POS_QTY */
	public String m_THIS_TIME_POS_QTY = null;
	/** 第 7 変数： m_c_ISSUE_FLG */
	public String m_c_ISSUE_FLG = null;
	/** 第 8 変数： m_h_LotCtrl */
	public String m_h_LotCtrl = null;
	/** 第 9 変数： m_h_lotFlg */
	public String m_h_lotFlg = null;
	/** 第 10 変数： m_ACCT_CD_name */
	public String m_ACCT_CD_name = null;
	/** 第 11 変数： m_ACCT_CD_val */
	public String m_ACCT_CD_val = null;
	/** 第 12 変数： m_PJ_CD_name */
	public String m_PJ_CD_name = null;
	/** 第 13 変数： m_PJ_CD_val */
	public String m_PJ_CD_val = null;
	/** 第 14 変数： m_SEG_CONTENTS1_name */
	public String m_SEG_CONTENTS1_name = null;
	/** 第 15 変数： m_SEG_CONTENTS1_val */
	public String m_SEG_CONTENTS1_val = null;
	/** 第 16 変数： m_SEG_CONTENTS2_name */
	public String m_SEG_CONTENTS2_name = null;
	/** 第 17 変数： m_SEG_CONTENTS2_val */
	public String m_SEG_CONTENTS2_val = null;
	/** 第 18 変数： m_SEG_CONTENTS3_name */
	public String m_SEG_CONTENTS3_name = null;
	/** 第 19 変数： m_SEG_CONTENTS3_val */
	public String m_SEG_CONTENTS3_val = null;
	/** 第 20 変数： m_SEG_CONTENTS4_name */
	public String m_SEG_CONTENTS4_name = null;
	/** 第 21 変数： m_SEG_CONTENTS4_val */
	public String m_SEG_CONTENTS4_val = null;
	/** 第 22 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 23 変数： m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** 第 24 変数： m_DRAW_CD */
	public String m_DRAW_CD = null;
	/** 第 25 変数： m_SPEC */
	public String m_SPEC = null;
	/** 第 26 変数： m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** 第 27 変数： m_MRP_ODR_TYP */
	public Integer m_MRP_ODR_TYP = null;
	/** 第 28 変数： m_OUTSIDE_TYP */
	public Integer m_OUTSIDE_TYP = null;
	/** 第 29 変数： m_UNIT_QTY_TYP */
	public Integer m_UNIT_QTY_TYP = null;
	/** 第 30 変数： m_PRODUCT_TYP */
	public Integer m_PRODUCT_TYP = null;
	/** 第 31 変数： m_SPL_ITEM_TYP */
	public Integer m_SPL_ITEM_TYP = null;
	/** 第 32 変数： m_LOT_CTRL_FLG */
	public String m_LOT_CTRL_FLG = null;
	/** 第 33 変数： m_w_MANHOUR_TYP */
	public String m_w_MANHOUR_TYP = null;
	/** 第 34 変数： m_w_TOTAL_STOCK_ON_HAND_QTY */
	public String m_w_TOTAL_STOCK_ON_HAND_QTY = null;
	/** 第 35 変数： m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** 第 36 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** 第 37 変数： m_w_WH_STOCK_ON_HAND_QTY */
	public String m_w_WH_STOCK_ON_HAND_QTY = null;
	/** 第 38 変数： m_WH_CD */
	public String m_WH_CD = null;
	/** 第 39 変数： m_DEFECT_QTY */
	public String m_DEFECT_QTY = null;
	/** 第 40 変数： m_w_TOTAL_DEFECT_QTY */
	public String m_w_TOTAL_DEFECT_QTY = null;
	/** 第 41 変数： m_BUSINESS_OPR_DATE */
	public String m_BUSINESS_OPR_DATE = null;
	/** 第 42 変数： m_WH_NAME */
	public String m_WH_NAME = null;
	/** 第 43 変数： m_VEND_CD */
	public String m_VEND_CD = null;
	/** 第 44 変数： m_MRP_FLG */
	public String m_MRP_FLG = null;
	/** 第 45 変数： m_w_WH_TYP */
	public String m_w_WH_TYP = null;
	/** 第 46 変数： m_ISSUE_CTRL_CD */
	public String m_ISSUE_CTRL_CD = null;
	/** 第 47 変数： m_ISSUE_TYP */
	public Integer m_ISSUE_TYP = null;
	/** 第 48 変数： m_RCV_ISSUE_QTY */
	public String m_RCV_ISSUE_QTY = null;
	/** 第 49 変数： m_RCV_ISSUE_DATE */
	public String m_RCV_ISSUE_DATE = null;
	/** 第 50 変数： m_RCV_ISSUE_GNR_TYP */
	public Integer m_RCV_ISSUE_GNR_TYP = null;
	/** 第 51 変数： m_STOCK_UPD_TYP */
	public Integer m_STOCK_UPD_TYP = null;
	/** 第 52 変数： m_VEND_LOT_NO */
	public String m_VEND_LOT_NO = null;
	/** 第 53 変数： m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** 第 54 変数： m_CONS_TYP */
	public Integer m_CONS_TYP = null;
	/** 第 55 変数： m_LOT_NO */
	public String m_LOT_NO = null;
	/** 第 56 変数： m_ONEROUS_FLG */
	public Integer m_ONEROUS_FLG = null;
	/** 第 57 変数： m_SBCNT_PUCH_TYP */
	public Integer m_SBCNT_PUCH_TYP = null;
	/** 第 58 変数： m_NON_PLANNED_CAUSE_CD */
	public String m_NON_PLANNED_CAUSE_CD = null;
	/** 第 59 変数： m_w_MODIFY_COUNT */
	public String m_w_MODIFY_COUNT = null;
	/** 第 60 変数： m_ISSUE_JOB_ODR_CD */
	public String m_ISSUE_JOB_ODR_CD = null;
	/** 第 61 変数： m_w_ODR_STS_TYP */
	public String m_w_ODR_STS_TYP = null;
	/** 第 62 変数： m_ISSUE_ITEM_CD */
	public String m_ISSUE_ITEM_CD = null;
	/** 第 63 変数： m_ISSUE_PROC_CD */
	public String m_ISSUE_PROC_CD = null;
	/** 第 64 変数： m_w_SUM_RCV_ISSUE_QTY */
	public String m_w_SUM_RCV_ISSUE_QTY = null;
	/** 第 65 変数： m_PAST_RESULT_ENTRY_TYP */
	public String m_PAST_RESULT_ENTRY_TYP = null;
	/** 第 66 変数： m_PROC_EXEC_DATE */
	public BigDecimal m_PROC_EXEC_DATE = null;
	/** 第 67 変数： m_LOT_STOCK_ON_HAND_QTY */
	public String m_LOT_STOCK_ON_HAND_QTY = null;
	/** 第 68 変数： m_LOT_DEFECT_QTY */
	public String m_LOT_DEFECT_QTY = null;
	/** 第 69 変数： m_ALLOCABLE_QTY */
	public String m_ALLOCABLE_QTY = null;
	/** 第 70 変数： m_ACCT_CD */
	public String m_ACCT_CD = null;
	/** 第 71 変数： m_DEPT_CD */
	public String m_DEPT_CD = null;
	/** 第 72 変数： m_PJ_CD */
	public String m_PJ_CD = null;
	/** 第 73 変数： m_SEG_CONTENTS1 */
	public String m_SEG_CONTENTS1 = null;
	/** 第 74 変数： m_SEG_CONTENTS2 */
	public String m_SEG_CONTENTS2 = null;
	/** 第 75 変数： m_SEG_CONTENTS3 */
	public String m_SEG_CONTENTS3 = null;
	/** 第 76 変数： m_SEG_CONTENTS4 */
	public String m_SEG_CONTENTS4 = null;
	/** 第 77 変数： m_DEPT_NAME */
	public String m_DEPT_NAME = null;
	/** 第 78 変数： m_VALUE */
	public String m_VALUE = null;
	/** 第 79 変数： m_DISPLAY_NAME */
	public String m_DISPLAY_NAME = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_w_JOB_ODR */
	public List l_w_JOB_ODR = null;

	/** 第 2 List変数： l_w_INFERIOR */
	public List l_w_INFERIOR = null;

	/** 第 3 List変数： l_c_JOB_ODR_CD */
	public List l_c_JOB_ODR_CD = null;

	/** 第 4 List変数： l_c_RCV_ISSUE_QTY */
	public List l_c_RCV_ISSUE_QTY = null;

	/** 第 5 List変数： l_ALC_POS_QTY */
	public List l_ALC_POS_QTY = null;

	/** 第 6 List変数： l_THIS_TIME_POS_QTY */
	public List l_THIS_TIME_POS_QTY = null;

	/** 第 7 List変数： l_c_ISSUE_FLG */
	public List l_c_ISSUE_FLG = null;

	/** 第 8 List変数： l_h_LotCtrl */
	public List l_h_LotCtrl = null;

	/** 第 9 List変数： l_h_lotFlg */
	public List l_h_lotFlg = null;

	/** 第 10 List変数： l_ACCT_CD_name */
	public List l_ACCT_CD_name = null;

	/** 第 11 List変数： l_ACCT_CD_val */
	public List l_ACCT_CD_val = null;

	/** 第 12 List変数： l_PJ_CD_name */
	public List l_PJ_CD_name = null;

	/** 第 13 List変数： l_PJ_CD_val */
	public List l_PJ_CD_val = null;

	/** 第 14 List変数： l_SEG_CONTENTS1_name */
	public List l_SEG_CONTENTS1_name = null;

	/** 第 15 List変数： l_SEG_CONTENTS1_val */
	public List l_SEG_CONTENTS1_val = null;

	/** 第 16 List変数： l_SEG_CONTENTS2_name */
	public List l_SEG_CONTENTS2_name = null;

	/** 第 17 List変数： l_SEG_CONTENTS2_val */
	public List l_SEG_CONTENTS2_val = null;

	/** 第 18 List変数： l_SEG_CONTENTS3_name */
	public List l_SEG_CONTENTS3_name = null;

	/** 第 19 List変数： l_SEG_CONTENTS3_val */
	public List l_SEG_CONTENTS3_val = null;

	/** 第 20 List変数： l_SEG_CONTENTS4_name */
	public List l_SEG_CONTENTS4_name = null;

	/** 第 21 List変数： l_SEG_CONTENTS4_val */
	public List l_SEG_CONTENTS4_val = null;

	/** 第 22 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 23 List変数： l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** 第 24 List変数： l_DRAW_CD */
	public List l_DRAW_CD = null;

	/** 第 25 List変数： l_SPEC */
	public List l_SPEC = null;

	/** 第 26 List変数： l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** 第 27 List変数： l_MRP_ODR_TYP */
	public List l_MRP_ODR_TYP = null;

	/** 第 28 List変数： l_OUTSIDE_TYP */
	public List l_OUTSIDE_TYP = null;

	/** 第 29 List変数： l_UNIT_QTY_TYP */
	public List l_UNIT_QTY_TYP = null;

	/** 第 30 List変数： l_PRODUCT_TYP */
	public List l_PRODUCT_TYP = null;

	/** 第 31 List変数： l_SPL_ITEM_TYP */
	public List l_SPL_ITEM_TYP = null;

	/** 第 32 List変数： l_LOT_CTRL_FLG */
	public List l_LOT_CTRL_FLG = null;

	/** 第 33 List変数： l_w_MANHOUR_TYP */
	public List l_w_MANHOUR_TYP = null;

	/** 第 34 List変数： l_w_TOTAL_STOCK_ON_HAND_QTY */
	public List l_w_TOTAL_STOCK_ON_HAND_QTY = null;

	/** 第 35 List変数： l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** 第 36 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** 第 37 List変数： l_w_WH_STOCK_ON_HAND_QTY */
	public List l_w_WH_STOCK_ON_HAND_QTY = null;

	/** 第 38 List変数： l_WH_CD */
	public List l_WH_CD = null;

	/** 第 39 List変数： l_DEFECT_QTY */
	public List l_DEFECT_QTY = null;

	/** 第 40 List変数： l_w_TOTAL_DEFECT_QTY */
	public List l_w_TOTAL_DEFECT_QTY = null;

	/** 第 41 List変数： l_BUSINESS_OPR_DATE */
	public List l_BUSINESS_OPR_DATE = null;

	/** 第 42 List変数： l_WH_NAME */
	public List l_WH_NAME = null;

	/** 第 43 List変数： l_VEND_CD */
	public List l_VEND_CD = null;

	/** 第 44 List変数： l_MRP_FLG */
	public List l_MRP_FLG = null;

	/** 第 45 List変数： l_w_WH_TYP */
	public List l_w_WH_TYP = null;

	/** 第 46 List変数： l_ISSUE_CTRL_CD */
	public List l_ISSUE_CTRL_CD = null;

	/** 第 47 List変数： l_ISSUE_TYP */
	public List l_ISSUE_TYP = null;

	/** 第 48 List変数： l_RCV_ISSUE_QTY */
	public List l_RCV_ISSUE_QTY = null;

	/** 第 49 List変数： l_RCV_ISSUE_DATE */
	public List l_RCV_ISSUE_DATE = null;

	/** 第 50 List変数： l_RCV_ISSUE_GNR_TYP */
	public List l_RCV_ISSUE_GNR_TYP = null;

	/** 第 51 List変数： l_STOCK_UPD_TYP */
	public List l_STOCK_UPD_TYP = null;

	/** 第 52 List変数： l_VEND_LOT_NO */
	public List l_VEND_LOT_NO = null;

	/** 第 53 List変数： l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** 第 54 List変数： l_CONS_TYP */
	public List l_CONS_TYP = null;

	/** 第 55 List変数： l_LOT_NO */
	public List l_LOT_NO = null;

	/** 第 56 List変数： l_ONEROUS_FLG */
	public List l_ONEROUS_FLG = null;

	/** 第 57 List変数： l_SBCNT_PUCH_TYP */
	public List l_SBCNT_PUCH_TYP = null;

	/** 第 58 List変数： l_NON_PLANNED_CAUSE_CD */
	public List l_NON_PLANNED_CAUSE_CD = null;

	/** 第 59 List変数： l_w_MODIFY_COUNT */
	public List l_w_MODIFY_COUNT = null;

	/** 第 60 List変数： l_ISSUE_JOB_ODR_CD */
	public List l_ISSUE_JOB_ODR_CD = null;

	/** 第 61 List変数： l_w_ODR_STS_TYP */
	public List l_w_ODR_STS_TYP = null;

	/** 第 62 List変数： l_ISSUE_ITEM_CD */
	public List l_ISSUE_ITEM_CD = null;

	/** 第 63 List変数： l_ISSUE_PROC_CD */
	public List l_ISSUE_PROC_CD = null;

	/** 第 64 List変数： l_w_SUM_RCV_ISSUE_QTY */
	public List l_w_SUM_RCV_ISSUE_QTY = null;

	/** 第 65 List変数： l_PAST_RESULT_ENTRY_TYP */
	public List l_PAST_RESULT_ENTRY_TYP = null;

	/** 第 66 List変数： l_PROC_EXEC_DATE */
	public List l_PROC_EXEC_DATE = null;

	/** 第 67 List変数： l_LOT_STOCK_ON_HAND_QTY */
	public List l_LOT_STOCK_ON_HAND_QTY = null;

	/** 第 68 List変数： l_LOT_DEFECT_QTY */
	public List l_LOT_DEFECT_QTY = null;

	/** 第 69 List変数： l_ALLOCABLE_QTY */
	public List l_ALLOCABLE_QTY = null;

	/** 第 70 List変数： l_ACCT_CD */
	public List l_ACCT_CD = null;

	/** 第 71 List変数： l_DEPT_CD */
	public List l_DEPT_CD = null;

	/** 第 72 List変数： l_PJ_CD */
	public List l_PJ_CD = null;

	/** 第 73 List変数： l_SEG_CONTENTS1 */
	public List l_SEG_CONTENTS1 = null;

	/** 第 74 List変数： l_SEG_CONTENTS2 */
	public List l_SEG_CONTENTS2 = null;

	/** 第 75 List変数： l_SEG_CONTENTS3 */
	public List l_SEG_CONTENTS3 = null;

	/** 第 76 List変数： l_SEG_CONTENTS4 */
	public List l_SEG_CONTENTS4 = null;

	/** 第 77 List変数： l_DEPT_NAME */
	public List l_DEPT_NAME = null;

	/** 第 78 List変数： l_VALUE */
	public List l_VALUE = null;

	/** 第 79 List変数： l_DISPLAY_NAME */
	public List l_DISPLAY_NAME = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public Integer getw_JOB_ODR() { return m_w_JOB_ODR; }
	public Integer getw_INFERIOR() { return m_w_INFERIOR; }
	public String getc_JOB_ODR_CD() { return m_c_JOB_ODR_CD; }
	public String getc_RCV_ISSUE_QTY() { return m_c_RCV_ISSUE_QTY; }
	public String getALC_POS_QTY() { return m_ALC_POS_QTY; }
	public String getTHIS_TIME_POS_QTY() { return m_THIS_TIME_POS_QTY; }
	public String getc_ISSUE_FLG() { return m_c_ISSUE_FLG; }
	public String geth_LotCtrl() { return m_h_LotCtrl; }
	public String geth_lotFlg() { return m_h_lotFlg; }
	public String getACCT_CD_name() { return m_ACCT_CD_name; }
	public String getACCT_CD_val() { return m_ACCT_CD_val; }
	public String getPJ_CD_name() { return m_PJ_CD_name; }
	public String getPJ_CD_val() { return m_PJ_CD_val; }
	public String getSEG_CONTENTS1_name() { return m_SEG_CONTENTS1_name; }
	public String getSEG_CONTENTS1_val() { return m_SEG_CONTENTS1_val; }
	public String getSEG_CONTENTS2_name() { return m_SEG_CONTENTS2_name; }
	public String getSEG_CONTENTS2_val() { return m_SEG_CONTENTS2_val; }
	public String getSEG_CONTENTS3_name() { return m_SEG_CONTENTS3_name; }
	public String getSEG_CONTENTS3_val() { return m_SEG_CONTENTS3_val; }
	public String getSEG_CONTENTS4_name() { return m_SEG_CONTENTS4_name; }
	public String getSEG_CONTENTS4_val() { return m_SEG_CONTENTS4_val; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getDRAW_CD() { return m_DRAW_CD; }
	public String getSPEC() { return m_SPEC; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public Integer getMRP_ODR_TYP() { return m_MRP_ODR_TYP; }
	public Integer getOUTSIDE_TYP() { return m_OUTSIDE_TYP; }
	public Integer getUNIT_QTY_TYP() { return m_UNIT_QTY_TYP; }
	public Integer getPRODUCT_TYP() { return m_PRODUCT_TYP; }
	public Integer getSPL_ITEM_TYP() { return m_SPL_ITEM_TYP; }
	public String getLOT_CTRL_FLG() { return m_LOT_CTRL_FLG; }
	public String getw_MANHOUR_TYP() { return m_w_MANHOUR_TYP; }
	public String getw_TOTAL_STOCK_ON_HAND_QTY() { return m_w_TOTAL_STOCK_ON_HAND_QTY; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getw_WH_STOCK_ON_HAND_QTY() { return m_w_WH_STOCK_ON_HAND_QTY; }
	public String getWH_CD() { return m_WH_CD; }
	public String getDEFECT_QTY() { return m_DEFECT_QTY; }
	public String getw_TOTAL_DEFECT_QTY() { return m_w_TOTAL_DEFECT_QTY; }
	public String getBUSINESS_OPR_DATE() { return m_BUSINESS_OPR_DATE; }
	public String getWH_NAME() { return m_WH_NAME; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getMRP_FLG() { return m_MRP_FLG; }
	public String getw_WH_TYP() { return m_w_WH_TYP; }
	public String getISSUE_CTRL_CD() { return m_ISSUE_CTRL_CD; }
	public Integer getISSUE_TYP() { return m_ISSUE_TYP; }
	public String getRCV_ISSUE_QTY() { return m_RCV_ISSUE_QTY; }
	public String getRCV_ISSUE_DATE() { return m_RCV_ISSUE_DATE; }
	public Integer getRCV_ISSUE_GNR_TYP() { return m_RCV_ISSUE_GNR_TYP; }
	public Integer getSTOCK_UPD_TYP() { return m_STOCK_UPD_TYP; }
	public String getVEND_LOT_NO() { return m_VEND_LOT_NO; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public Integer getCONS_TYP() { return m_CONS_TYP; }
	public String getLOT_NO() { return m_LOT_NO; }
	public Integer getONEROUS_FLG() { return m_ONEROUS_FLG; }
	public Integer getSBCNT_PUCH_TYP() { return m_SBCNT_PUCH_TYP; }
	public String getNON_PLANNED_CAUSE_CD() { return m_NON_PLANNED_CAUSE_CD; }
	public String getw_MODIFY_COUNT() { return m_w_MODIFY_COUNT; }
	public String getISSUE_JOB_ODR_CD() { return m_ISSUE_JOB_ODR_CD; }
	public String getw_ODR_STS_TYP() { return m_w_ODR_STS_TYP; }
	public String getISSUE_ITEM_CD() { return m_ISSUE_ITEM_CD; }
	public String getISSUE_PROC_CD() { return m_ISSUE_PROC_CD; }
	public String getw_SUM_RCV_ISSUE_QTY() { return m_w_SUM_RCV_ISSUE_QTY; }
	public String getPAST_RESULT_ENTRY_TYP() { return m_PAST_RESULT_ENTRY_TYP; }
	public BigDecimal getPROC_EXEC_DATE() { return m_PROC_EXEC_DATE; }
	public String getLOT_STOCK_ON_HAND_QTY() { return m_LOT_STOCK_ON_HAND_QTY; }
	public String getLOT_DEFECT_QTY() { return m_LOT_DEFECT_QTY; }
	public String getALLOCABLE_QTY() { return m_ALLOCABLE_QTY; }
	public String getACCT_CD() { return m_ACCT_CD; }
	public String getDEPT_CD() { return m_DEPT_CD; }
	public String getPJ_CD() { return m_PJ_CD; }
	public String getSEG_CONTENTS1() { return m_SEG_CONTENTS1; }
	public String getSEG_CONTENTS2() { return m_SEG_CONTENTS2; }
	public String getSEG_CONTENTS3() { return m_SEG_CONTENTS3; }
	public String getSEG_CONTENTS4() { return m_SEG_CONTENTS4; }
	public String getDEPT_NAME() { return m_DEPT_NAME; }
	public String getVALUE() { return m_VALUE; }
	public String getDISPLAY_NAME() { return m_DISPLAY_NAME; }

	public List getList_w_JOB_ODR() { return l_w_JOB_ODR; }
	public List getList_w_INFERIOR() { return l_w_INFERIOR; }
	public List getList_c_JOB_ODR_CD() { return l_c_JOB_ODR_CD; }
	public List getList_c_RCV_ISSUE_QTY() { return l_c_RCV_ISSUE_QTY; }
	public List getList_ALC_POS_QTY() { return l_ALC_POS_QTY; }
	public List getList_THIS_TIME_POS_QTY() { return l_THIS_TIME_POS_QTY; }
	public List getList_c_ISSUE_FLG() { return l_c_ISSUE_FLG; }
	public List getList_h_LotCtrl() { return l_h_LotCtrl; }
	public List getList_h_lotFlg() { return l_h_lotFlg; }
	public List getList_ACCT_CD_name() { return l_ACCT_CD_name; }
	public List getList_ACCT_CD_val() { return l_ACCT_CD_val; }
	public List getList_PJ_CD_name() { return l_PJ_CD_name; }
	public List getList_PJ_CD_val() { return l_PJ_CD_val; }
	public List getList_SEG_CONTENTS1_name() { return l_SEG_CONTENTS1_name; }
	public List getList_SEG_CONTENTS1_val() { return l_SEG_CONTENTS1_val; }
	public List getList_SEG_CONTENTS2_name() { return l_SEG_CONTENTS2_name; }
	public List getList_SEG_CONTENTS2_val() { return l_SEG_CONTENTS2_val; }
	public List getList_SEG_CONTENTS3_name() { return l_SEG_CONTENTS3_name; }
	public List getList_SEG_CONTENTS3_val() { return l_SEG_CONTENTS3_val; }
	public List getList_SEG_CONTENTS4_name() { return l_SEG_CONTENTS4_name; }
	public List getList_SEG_CONTENTS4_val() { return l_SEG_CONTENTS4_val; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_DRAW_CD() { return l_DRAW_CD; }
	public List getList_SPEC() { return l_SPEC; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_MRP_ODR_TYP() { return l_MRP_ODR_TYP; }
	public List getList_OUTSIDE_TYP() { return l_OUTSIDE_TYP; }
	public List getList_UNIT_QTY_TYP() { return l_UNIT_QTY_TYP; }
	public List getList_PRODUCT_TYP() { return l_PRODUCT_TYP; }
	public List getList_SPL_ITEM_TYP() { return l_SPL_ITEM_TYP; }
	public List getList_LOT_CTRL_FLG() { return l_LOT_CTRL_FLG; }
	public List getList_w_MANHOUR_TYP() { return l_w_MANHOUR_TYP; }
	public List getList_w_TOTAL_STOCK_ON_HAND_QTY() { return l_w_TOTAL_STOCK_ON_HAND_QTY; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_w_WH_STOCK_ON_HAND_QTY() { return l_w_WH_STOCK_ON_HAND_QTY; }
	public List getList_WH_CD() { return l_WH_CD; }
	public List getList_DEFECT_QTY() { return l_DEFECT_QTY; }
	public List getList_w_TOTAL_DEFECT_QTY() { return l_w_TOTAL_DEFECT_QTY; }
	public List getList_BUSINESS_OPR_DATE() { return l_BUSINESS_OPR_DATE; }
	public List getList_WH_NAME() { return l_WH_NAME; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_MRP_FLG() { return l_MRP_FLG; }
	public List getList_w_WH_TYP() { return l_w_WH_TYP; }
	public List getList_ISSUE_CTRL_CD() { return l_ISSUE_CTRL_CD; }
	public List getList_ISSUE_TYP() { return l_ISSUE_TYP; }
	public List getList_RCV_ISSUE_QTY() { return l_RCV_ISSUE_QTY; }
	public List getList_RCV_ISSUE_DATE() { return l_RCV_ISSUE_DATE; }
	public List getList_RCV_ISSUE_GNR_TYP() { return l_RCV_ISSUE_GNR_TYP; }
	public List getList_STOCK_UPD_TYP() { return l_STOCK_UPD_TYP; }
	public List getList_VEND_LOT_NO() { return l_VEND_LOT_NO; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_CONS_TYP() { return l_CONS_TYP; }
	public List getList_LOT_NO() { return l_LOT_NO; }
	public List getList_ONEROUS_FLG() { return l_ONEROUS_FLG; }
	public List getList_SBCNT_PUCH_TYP() { return l_SBCNT_PUCH_TYP; }
	public List getList_NON_PLANNED_CAUSE_CD() { return l_NON_PLANNED_CAUSE_CD; }
	public List getList_w_MODIFY_COUNT() { return l_w_MODIFY_COUNT; }
	public List getList_ISSUE_JOB_ODR_CD() { return l_ISSUE_JOB_ODR_CD; }
	public List getList_w_ODR_STS_TYP() { return l_w_ODR_STS_TYP; }
	public List getList_ISSUE_ITEM_CD() { return l_ISSUE_ITEM_CD; }
	public List getList_ISSUE_PROC_CD() { return l_ISSUE_PROC_CD; }
	public List getList_w_SUM_RCV_ISSUE_QTY() { return l_w_SUM_RCV_ISSUE_QTY; }
	public List getList_PAST_RESULT_ENTRY_TYP() { return l_PAST_RESULT_ENTRY_TYP; }
	public List getList_PROC_EXEC_DATE() { return l_PROC_EXEC_DATE; }
	public List getList_LOT_STOCK_ON_HAND_QTY() { return l_LOT_STOCK_ON_HAND_QTY; }
	public List getList_LOT_DEFECT_QTY() { return l_LOT_DEFECT_QTY; }
	public List getList_ALLOCABLE_QTY() { return l_ALLOCABLE_QTY; }
	public List getList_ACCT_CD() { return l_ACCT_CD; }
	public List getList_DEPT_CD() { return l_DEPT_CD; }
	public List getList_PJ_CD() { return l_PJ_CD; }
	public List getList_SEG_CONTENTS1() { return l_SEG_CONTENTS1; }
	public List getList_SEG_CONTENTS2() { return l_SEG_CONTENTS2; }
	public List getList_SEG_CONTENTS3() { return l_SEG_CONTENTS3; }
	public List getList_SEG_CONTENTS4() { return l_SEG_CONTENTS4; }
	public List getList_DEPT_NAME() { return l_DEPT_NAME; }
	public List getList_VALUE() { return l_VALUE; }
	public List getList_DISPLAY_NAME() { return l_DISPLAY_NAME; }

	public void setw_JOB_ODR(Integer val) { m_w_JOB_ODR = val; }
	public void setw_INFERIOR(Integer val) { m_w_INFERIOR = val; }
	public void setc_JOB_ODR_CD(String val) { m_c_JOB_ODR_CD = val; }
	public void setc_RCV_ISSUE_QTY(String val) { m_c_RCV_ISSUE_QTY = val; }
	public void setALC_POS_QTY(String val) { m_ALC_POS_QTY = val; }
	public void setTHIS_TIME_POS_QTY(String val) { m_THIS_TIME_POS_QTY = val; }
	public void setc_ISSUE_FLG(String val) { m_c_ISSUE_FLG = val; }
	public void seth_LotCtrl(String val) { m_h_LotCtrl = val; }
	public void seth_lotFlg(String val) { m_h_lotFlg = val; }
	public void setACCT_CD_name(String val) { m_ACCT_CD_name = val; }
	public void setACCT_CD_val(String val) { m_ACCT_CD_val = val; }
	public void setPJ_CD_name(String val) { m_PJ_CD_name = val; }
	public void setPJ_CD_val(String val) { m_PJ_CD_val = val; }
	public void setSEG_CONTENTS1_name(String val) { m_SEG_CONTENTS1_name = val; }
	public void setSEG_CONTENTS1_val(String val) { m_SEG_CONTENTS1_val = val; }
	public void setSEG_CONTENTS2_name(String val) { m_SEG_CONTENTS2_name = val; }
	public void setSEG_CONTENTS2_val(String val) { m_SEG_CONTENTS2_val = val; }
	public void setSEG_CONTENTS3_name(String val) { m_SEG_CONTENTS3_name = val; }
	public void setSEG_CONTENTS3_val(String val) { m_SEG_CONTENTS3_val = val; }
	public void setSEG_CONTENTS4_name(String val) { m_SEG_CONTENTS4_name = val; }
	public void setSEG_CONTENTS4_val(String val) { m_SEG_CONTENTS4_val = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setDRAW_CD(String val) { m_DRAW_CD = val; }
	public void setSPEC(String val) { m_SPEC = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setMRP_ODR_TYP(Integer val) { m_MRP_ODR_TYP = val; }
	public void setOUTSIDE_TYP(Integer val) { m_OUTSIDE_TYP = val; }
	public void setUNIT_QTY_TYP(Integer val) { m_UNIT_QTY_TYP = val; }
	public void setPRODUCT_TYP(Integer val) { m_PRODUCT_TYP = val; }
	public void setSPL_ITEM_TYP(Integer val) { m_SPL_ITEM_TYP = val; }
	public void setLOT_CTRL_FLG(String val) { m_LOT_CTRL_FLG = val; }
	public void setw_MANHOUR_TYP(String val) { m_w_MANHOUR_TYP = val; }
	public void setw_TOTAL_STOCK_ON_HAND_QTY(String val) { m_w_TOTAL_STOCK_ON_HAND_QTY = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setw_WH_STOCK_ON_HAND_QTY(String val) { m_w_WH_STOCK_ON_HAND_QTY = val; }
	public void setWH_CD(String val) { m_WH_CD = val; }
	public void setDEFECT_QTY(String val) { m_DEFECT_QTY = val; }
	public void setw_TOTAL_DEFECT_QTY(String val) { m_w_TOTAL_DEFECT_QTY = val; }
	public void setBUSINESS_OPR_DATE(String val) { m_BUSINESS_OPR_DATE = val; }
	public void setWH_NAME(String val) { m_WH_NAME = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void setMRP_FLG(String val) { m_MRP_FLG = val; }
	public void setw_WH_TYP(String val) { m_w_WH_TYP = val; }
	public void setISSUE_CTRL_CD(String val) { m_ISSUE_CTRL_CD = val; }
	public void setISSUE_TYP(Integer val) { m_ISSUE_TYP = val; }
	public void setRCV_ISSUE_QTY(String val) { m_RCV_ISSUE_QTY = val; }
	public void setRCV_ISSUE_DATE(String val) { m_RCV_ISSUE_DATE = val; }
	public void setRCV_ISSUE_GNR_TYP(Integer val) { m_RCV_ISSUE_GNR_TYP = val; }
	public void setSTOCK_UPD_TYP(Integer val) { m_STOCK_UPD_TYP = val; }
	public void setVEND_LOT_NO(String val) { m_VEND_LOT_NO = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setCONS_TYP(Integer val) { m_CONS_TYP = val; }
	public void setLOT_NO(String val) { m_LOT_NO = val; }
	public void setONEROUS_FLG(Integer val) { m_ONEROUS_FLG = val; }
	public void setSBCNT_PUCH_TYP(Integer val) { m_SBCNT_PUCH_TYP = val; }
	public void setNON_PLANNED_CAUSE_CD(String val) { m_NON_PLANNED_CAUSE_CD = val; }
	public void setw_MODIFY_COUNT(String val) { m_w_MODIFY_COUNT = val; }
	public void setISSUE_JOB_ODR_CD(String val) { m_ISSUE_JOB_ODR_CD = val; }
	public void setw_ODR_STS_TYP(String val) { m_w_ODR_STS_TYP = val; }
	public void setISSUE_ITEM_CD(String val) { m_ISSUE_ITEM_CD = val; }
	public void setISSUE_PROC_CD(String val) { m_ISSUE_PROC_CD = val; }
	public void setw_SUM_RCV_ISSUE_QTY(String val) { m_w_SUM_RCV_ISSUE_QTY = val; }
	public void setPAST_RESULT_ENTRY_TYP(String val) { m_PAST_RESULT_ENTRY_TYP = val; }
	public void setPROC_EXEC_DATE(BigDecimal val) { m_PROC_EXEC_DATE = val; }
	public void setLOT_STOCK_ON_HAND_QTY(String val) { m_LOT_STOCK_ON_HAND_QTY = val; }
	public void setLOT_DEFECT_QTY(String val) { m_LOT_DEFECT_QTY = val; }
	public void setALLOCABLE_QTY(String val) { m_ALLOCABLE_QTY = val; }
	public void setACCT_CD(String val) { m_ACCT_CD = val; }
	public void setDEPT_CD(String val) { m_DEPT_CD = val; }
	public void setPJ_CD(String val) { m_PJ_CD = val; }
	public void setSEG_CONTENTS1(String val) { m_SEG_CONTENTS1 = val; }
	public void setSEG_CONTENTS2(String val) { m_SEG_CONTENTS2 = val; }
	public void setSEG_CONTENTS3(String val) { m_SEG_CONTENTS3 = val; }
	public void setSEG_CONTENTS4(String val) { m_SEG_CONTENTS4 = val; }
	public void setDEPT_NAME(String val) { m_DEPT_NAME = val; }
	public void setVALUE(String val) { m_VALUE = val; }
	public void setDISPLAY_NAME(String val) { m_DISPLAY_NAME = val; }

	public void setw_JOB_ODR(String val) { m_w_JOB_ODR = getInteger(val); }
	public void setw_INFERIOR(String val) { m_w_INFERIOR = getInteger(val); }
	public void setMRP_ODR_TYP(String val) { m_MRP_ODR_TYP = getInteger(val); }
	public void setOUTSIDE_TYP(String val) { m_OUTSIDE_TYP = getInteger(val); }
	public void setUNIT_QTY_TYP(String val) { m_UNIT_QTY_TYP = getInteger(val); }
	public void setPRODUCT_TYP(String val) { m_PRODUCT_TYP = getInteger(val); }
	public void setSPL_ITEM_TYP(String val) { m_SPL_ITEM_TYP = getInteger(val); }
	public void setISSUE_TYP(String val) { m_ISSUE_TYP = getInteger(val); }
	public void setRCV_ISSUE_GNR_TYP(String val) { m_RCV_ISSUE_GNR_TYP = getInteger(val); }
	public void setSTOCK_UPD_TYP(String val) { m_STOCK_UPD_TYP = getInteger(val); }
	public void setCONS_TYP(String val) { m_CONS_TYP = getInteger(val); }
	public void setONEROUS_FLG(String val) { m_ONEROUS_FLG = getInteger(val); }
	public void setSBCNT_PUCH_TYP(String val) { m_SBCNT_PUCH_TYP = getInteger(val); }

	public void setList_w_JOB_ODR(List list) { l_w_JOB_ODR = list; }
	public void setList_w_INFERIOR(List list) { l_w_INFERIOR = list; }
	public void setList_c_JOB_ODR_CD(List list) { l_c_JOB_ODR_CD = list; }
	public void setList_c_RCV_ISSUE_QTY(List list) { l_c_RCV_ISSUE_QTY = list; }
	public void setList_ALC_POS_QTY(List list) { l_ALC_POS_QTY = list; }
	public void setList_THIS_TIME_POS_QTY(List list) { l_THIS_TIME_POS_QTY = list; }
	public void setList_c_ISSUE_FLG(List list) { l_c_ISSUE_FLG = list; }
	public void setList_h_LotCtrl(List list) { l_h_LotCtrl = list; }
	public void setList_h_lotFlg(List list) { l_h_lotFlg = list; }
	public void setList_ACCT_CD_name(List list) { l_ACCT_CD_name = list; }
	public void setList_ACCT_CD_val(List list) { l_ACCT_CD_val = list; }
	public void setList_PJ_CD_name(List list) { l_PJ_CD_name = list; }
	public void setList_PJ_CD_val(List list) { l_PJ_CD_val = list; }
	public void setList_SEG_CONTENTS1_name(List list) { l_SEG_CONTENTS1_name = list; }
	public void setList_SEG_CONTENTS1_val(List list) { l_SEG_CONTENTS1_val = list; }
	public void setList_SEG_CONTENTS2_name(List list) { l_SEG_CONTENTS2_name = list; }
	public void setList_SEG_CONTENTS2_val(List list) { l_SEG_CONTENTS2_val = list; }
	public void setList_SEG_CONTENTS3_name(List list) { l_SEG_CONTENTS3_name = list; }
	public void setList_SEG_CONTENTS3_val(List list) { l_SEG_CONTENTS3_val = list; }
	public void setList_SEG_CONTENTS4_name(List list) { l_SEG_CONTENTS4_name = list; }
	public void setList_SEG_CONTENTS4_val(List list) { l_SEG_CONTENTS4_val = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_DRAW_CD(List list) { l_DRAW_CD = list; }
	public void setList_SPEC(List list) { l_SPEC = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_MRP_ODR_TYP(List list) { l_MRP_ODR_TYP = list; }
	public void setList_OUTSIDE_TYP(List list) { l_OUTSIDE_TYP = list; }
	public void setList_UNIT_QTY_TYP(List list) { l_UNIT_QTY_TYP = list; }
	public void setList_PRODUCT_TYP(List list) { l_PRODUCT_TYP = list; }
	public void setList_SPL_ITEM_TYP(List list) { l_SPL_ITEM_TYP = list; }
	public void setList_LOT_CTRL_FLG(List list) { l_LOT_CTRL_FLG = list; }
	public void setList_w_MANHOUR_TYP(List list) { l_w_MANHOUR_TYP = list; }
	public void setList_w_TOTAL_STOCK_ON_HAND_QTY(List list) { l_w_TOTAL_STOCK_ON_HAND_QTY = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_w_WH_STOCK_ON_HAND_QTY(List list) { l_w_WH_STOCK_ON_HAND_QTY = list; }
	public void setList_WH_CD(List list) { l_WH_CD = list; }
	public void setList_DEFECT_QTY(List list) { l_DEFECT_QTY = list; }
	public void setList_w_TOTAL_DEFECT_QTY(List list) { l_w_TOTAL_DEFECT_QTY = list; }
	public void setList_BUSINESS_OPR_DATE(List list) { l_BUSINESS_OPR_DATE = list; }
	public void setList_WH_NAME(List list) { l_WH_NAME = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_MRP_FLG(List list) { l_MRP_FLG = list; }
	public void setList_w_WH_TYP(List list) { l_w_WH_TYP = list; }
	public void setList_ISSUE_CTRL_CD(List list) { l_ISSUE_CTRL_CD = list; }
	public void setList_ISSUE_TYP(List list) { l_ISSUE_TYP = list; }
	public void setList_RCV_ISSUE_QTY(List list) { l_RCV_ISSUE_QTY = list; }
	public void setList_RCV_ISSUE_DATE(List list) { l_RCV_ISSUE_DATE = list; }
	public void setList_RCV_ISSUE_GNR_TYP(List list) { l_RCV_ISSUE_GNR_TYP = list; }
	public void setList_STOCK_UPD_TYP(List list) { l_STOCK_UPD_TYP = list; }
	public void setList_VEND_LOT_NO(List list) { l_VEND_LOT_NO = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_CONS_TYP(List list) { l_CONS_TYP = list; }
	public void setList_LOT_NO(List list) { l_LOT_NO = list; }
	public void setList_ONEROUS_FLG(List list) { l_ONEROUS_FLG = list; }
	public void setList_SBCNT_PUCH_TYP(List list) { l_SBCNT_PUCH_TYP = list; }
	public void setList_NON_PLANNED_CAUSE_CD(List list) { l_NON_PLANNED_CAUSE_CD = list; }
	public void setList_w_MODIFY_COUNT(List list) { l_w_MODIFY_COUNT = list; }
	public void setList_ISSUE_JOB_ODR_CD(List list) { l_ISSUE_JOB_ODR_CD = list; }
	public void setList_w_ODR_STS_TYP(List list) { l_w_ODR_STS_TYP = list; }
	public void setList_ISSUE_ITEM_CD(List list) { l_ISSUE_ITEM_CD = list; }
	public void setList_ISSUE_PROC_CD(List list) { l_ISSUE_PROC_CD = list; }
	public void setList_w_SUM_RCV_ISSUE_QTY(List list) { l_w_SUM_RCV_ISSUE_QTY = list; }
	public void setList_PAST_RESULT_ENTRY_TYP(List list) { l_PAST_RESULT_ENTRY_TYP = list; }
	public void setList_PROC_EXEC_DATE(List list) { l_PROC_EXEC_DATE = list; }
	public void setList_LOT_STOCK_ON_HAND_QTY(List list) { l_LOT_STOCK_ON_HAND_QTY = list; }
	public void setList_LOT_DEFECT_QTY(List list) { l_LOT_DEFECT_QTY = list; }
	public void setList_ALLOCABLE_QTY(List list) { l_ALLOCABLE_QTY = list; }
	public void setList_ACCT_CD(List list) { l_ACCT_CD = list; }
	public void setList_DEPT_CD(List list) { l_DEPT_CD = list; }
	public void setList_PJ_CD(List list) { l_PJ_CD = list; }
	public void setList_SEG_CONTENTS1(List list) { l_SEG_CONTENTS1 = list; }
	public void setList_SEG_CONTENTS2(List list) { l_SEG_CONTENTS2 = list; }
	public void setList_SEG_CONTENTS3(List list) { l_SEG_CONTENTS3 = list; }
	public void setList_SEG_CONTENTS4(List list) { l_SEG_CONTENTS4 = list; }
	public void setList_DEPT_NAME(List list) { l_DEPT_NAME = list; }
	public void setList_VALUE(List list) { l_VALUE = list; }
	public void setList_DISPLAY_NAME(List list) { l_DISPLAY_NAME = list; }

	public int setL2L_w_JOB_ODR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_JOB_ODR == null) {
			l_w_JOB_ODR = new ArrayList();
		} else {
			l_w_JOB_ODR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_JOB_ODR.add(((AF0090010Struct) list.get(i)).getw_JOB_ODR());
		}
		return size;
	}
	public int setL2L_w_INFERIOR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_INFERIOR == null) {
			l_w_INFERIOR = new ArrayList();
		} else {
			l_w_INFERIOR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_INFERIOR.add(((AF0090010Struct) list.get(i)).getw_INFERIOR());
		}
		return size;
	}
	public int setL2L_c_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_JOB_ODR_CD == null) {
			l_c_JOB_ODR_CD = new ArrayList();
		} else {
			l_c_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_JOB_ODR_CD.add(((AF0090010Struct) list.get(i)).getc_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_c_RCV_ISSUE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_RCV_ISSUE_QTY == null) {
			l_c_RCV_ISSUE_QTY = new ArrayList();
		} else {
			l_c_RCV_ISSUE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_RCV_ISSUE_QTY.add(((AF0090010Struct) list.get(i)).getc_RCV_ISSUE_QTY());
		}
		return size;
	}
	public int setL2L_ALC_POS_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ALC_POS_QTY == null) {
			l_ALC_POS_QTY = new ArrayList();
		} else {
			l_ALC_POS_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ALC_POS_QTY.add(((AF0090010Struct) list.get(i)).getALC_POS_QTY());
		}
		return size;
	}
	public int setL2L_THIS_TIME_POS_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_THIS_TIME_POS_QTY == null) {
			l_THIS_TIME_POS_QTY = new ArrayList();
		} else {
			l_THIS_TIME_POS_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_THIS_TIME_POS_QTY.add(((AF0090010Struct) list.get(i)).getTHIS_TIME_POS_QTY());
		}
		return size;
	}
	public int setL2L_c_ISSUE_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_ISSUE_FLG == null) {
			l_c_ISSUE_FLG = new ArrayList();
		} else {
			l_c_ISSUE_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_ISSUE_FLG.add(((AF0090010Struct) list.get(i)).getc_ISSUE_FLG());
		}
		return size;
	}
	public int setL2L_h_LotCtrl(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_LotCtrl == null) {
			l_h_LotCtrl = new ArrayList();
		} else {
			l_h_LotCtrl.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_LotCtrl.add(((AF0090010Struct) list.get(i)).geth_LotCtrl());
		}
		return size;
	}
	public int setL2L_h_lotFlg(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_lotFlg == null) {
			l_h_lotFlg = new ArrayList();
		} else {
			l_h_lotFlg.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_lotFlg.add(((AF0090010Struct) list.get(i)).geth_lotFlg());
		}
		return size;
	}
	public int setL2L_ACCT_CD_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACCT_CD_name == null) {
			l_ACCT_CD_name = new ArrayList();
		} else {
			l_ACCT_CD_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACCT_CD_name.add(((AF0090010Struct) list.get(i)).getACCT_CD_name());
		}
		return size;
	}
	public int setL2L_ACCT_CD_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACCT_CD_val == null) {
			l_ACCT_CD_val = new ArrayList();
		} else {
			l_ACCT_CD_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACCT_CD_val.add(((AF0090010Struct) list.get(i)).getACCT_CD_val());
		}
		return size;
	}
	public int setL2L_PJ_CD_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PJ_CD_name == null) {
			l_PJ_CD_name = new ArrayList();
		} else {
			l_PJ_CD_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PJ_CD_name.add(((AF0090010Struct) list.get(i)).getPJ_CD_name());
		}
		return size;
	}
	public int setL2L_PJ_CD_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PJ_CD_val == null) {
			l_PJ_CD_val = new ArrayList();
		} else {
			l_PJ_CD_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PJ_CD_val.add(((AF0090010Struct) list.get(i)).getPJ_CD_val());
		}
		return size;
	}
	public int setL2L_SEG_CONTENTS1_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEG_CONTENTS1_name == null) {
			l_SEG_CONTENTS1_name = new ArrayList();
		} else {
			l_SEG_CONTENTS1_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEG_CONTENTS1_name.add(((AF0090010Struct) list.get(i)).getSEG_CONTENTS1_name());
		}
		return size;
	}
	public int setL2L_SEG_CONTENTS1_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEG_CONTENTS1_val == null) {
			l_SEG_CONTENTS1_val = new ArrayList();
		} else {
			l_SEG_CONTENTS1_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEG_CONTENTS1_val.add(((AF0090010Struct) list.get(i)).getSEG_CONTENTS1_val());
		}
		return size;
	}
	public int setL2L_SEG_CONTENTS2_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEG_CONTENTS2_name == null) {
			l_SEG_CONTENTS2_name = new ArrayList();
		} else {
			l_SEG_CONTENTS2_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEG_CONTENTS2_name.add(((AF0090010Struct) list.get(i)).getSEG_CONTENTS2_name());
		}
		return size;
	}
	public int setL2L_SEG_CONTENTS2_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEG_CONTENTS2_val == null) {
			l_SEG_CONTENTS2_val = new ArrayList();
		} else {
			l_SEG_CONTENTS2_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEG_CONTENTS2_val.add(((AF0090010Struct) list.get(i)).getSEG_CONTENTS2_val());
		}
		return size;
	}
	public int setL2L_SEG_CONTENTS3_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEG_CONTENTS3_name == null) {
			l_SEG_CONTENTS3_name = new ArrayList();
		} else {
			l_SEG_CONTENTS3_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEG_CONTENTS3_name.add(((AF0090010Struct) list.get(i)).getSEG_CONTENTS3_name());
		}
		return size;
	}
	public int setL2L_SEG_CONTENTS3_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEG_CONTENTS3_val == null) {
			l_SEG_CONTENTS3_val = new ArrayList();
		} else {
			l_SEG_CONTENTS3_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEG_CONTENTS3_val.add(((AF0090010Struct) list.get(i)).getSEG_CONTENTS3_val());
		}
		return size;
	}
	public int setL2L_SEG_CONTENTS4_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEG_CONTENTS4_name == null) {
			l_SEG_CONTENTS4_name = new ArrayList();
		} else {
			l_SEG_CONTENTS4_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEG_CONTENTS4_name.add(((AF0090010Struct) list.get(i)).getSEG_CONTENTS4_name());
		}
		return size;
	}
	public int setL2L_SEG_CONTENTS4_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEG_CONTENTS4_val == null) {
			l_SEG_CONTENTS4_val = new ArrayList();
		} else {
			l_SEG_CONTENTS4_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEG_CONTENTS4_val.add(((AF0090010Struct) list.get(i)).getSEG_CONTENTS4_val());
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
			l_ITEM_CD.add(((AF0090010Struct) list.get(i)).getITEM_CD());
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
			l_ITEM_NAME.add(((AF0090010Struct) list.get(i)).getITEM_NAME());
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
			l_DRAW_CD.add(((AF0090010Struct) list.get(i)).getDRAW_CD());
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
			l_SPEC.add(((AF0090010Struct) list.get(i)).getSPEC());
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
			l_STOCK_UNIT.add(((AF0090010Struct) list.get(i)).getSTOCK_UNIT());
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
			l_MRP_ODR_TYP.add(((AF0090010Struct) list.get(i)).getMRP_ODR_TYP());
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
			l_OUTSIDE_TYP.add(((AF0090010Struct) list.get(i)).getOUTSIDE_TYP());
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
			l_UNIT_QTY_TYP.add(((AF0090010Struct) list.get(i)).getUNIT_QTY_TYP());
		}
		return size;
	}
	public int setL2L_PRODUCT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRODUCT_TYP == null) {
			l_PRODUCT_TYP = new ArrayList();
		} else {
			l_PRODUCT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRODUCT_TYP.add(((AF0090010Struct) list.get(i)).getPRODUCT_TYP());
		}
		return size;
	}
	public int setL2L_SPL_ITEM_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SPL_ITEM_TYP == null) {
			l_SPL_ITEM_TYP = new ArrayList();
		} else {
			l_SPL_ITEM_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SPL_ITEM_TYP.add(((AF0090010Struct) list.get(i)).getSPL_ITEM_TYP());
		}
		return size;
	}
	public int setL2L_LOT_CTRL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOT_CTRL_FLG == null) {
			l_LOT_CTRL_FLG = new ArrayList();
		} else {
			l_LOT_CTRL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOT_CTRL_FLG.add(((AF0090010Struct) list.get(i)).getLOT_CTRL_FLG());
		}
		return size;
	}
	public int setL2L_w_MANHOUR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_MANHOUR_TYP == null) {
			l_w_MANHOUR_TYP = new ArrayList();
		} else {
			l_w_MANHOUR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_MANHOUR_TYP.add(((AF0090010Struct) list.get(i)).getw_MANHOUR_TYP());
		}
		return size;
	}
	public int setL2L_w_TOTAL_STOCK_ON_HAND_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_TOTAL_STOCK_ON_HAND_QTY == null) {
			l_w_TOTAL_STOCK_ON_HAND_QTY = new ArrayList();
		} else {
			l_w_TOTAL_STOCK_ON_HAND_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_TOTAL_STOCK_ON_HAND_QTY.add(((AF0090010Struct) list.get(i)).getw_TOTAL_STOCK_ON_HAND_QTY());
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
			l_JOB_ODR_CD.add(((AF0090010Struct) list.get(i)).getJOB_ODR_CD());
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
			l_PLANT_CD.add(((AF0090010Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_w_WH_STOCK_ON_HAND_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_WH_STOCK_ON_HAND_QTY == null) {
			l_w_WH_STOCK_ON_HAND_QTY = new ArrayList();
		} else {
			l_w_WH_STOCK_ON_HAND_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_WH_STOCK_ON_HAND_QTY.add(((AF0090010Struct) list.get(i)).getw_WH_STOCK_ON_HAND_QTY());
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
			l_WH_CD.add(((AF0090010Struct) list.get(i)).getWH_CD());
		}
		return size;
	}
	public int setL2L_DEFECT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEFECT_QTY == null) {
			l_DEFECT_QTY = new ArrayList();
		} else {
			l_DEFECT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEFECT_QTY.add(((AF0090010Struct) list.get(i)).getDEFECT_QTY());
		}
		return size;
	}
	public int setL2L_w_TOTAL_DEFECT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_TOTAL_DEFECT_QTY == null) {
			l_w_TOTAL_DEFECT_QTY = new ArrayList();
		} else {
			l_w_TOTAL_DEFECT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_TOTAL_DEFECT_QTY.add(((AF0090010Struct) list.get(i)).getw_TOTAL_DEFECT_QTY());
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
			l_BUSINESS_OPR_DATE.add(((AF0090010Struct) list.get(i)).getBUSINESS_OPR_DATE());
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
			l_WH_NAME.add(((AF0090010Struct) list.get(i)).getWH_NAME());
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
			l_VEND_CD.add(((AF0090010Struct) list.get(i)).getVEND_CD());
		}
		return size;
	}
	public int setL2L_MRP_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_FLG == null) {
			l_MRP_FLG = new ArrayList();
		} else {
			l_MRP_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_FLG.add(((AF0090010Struct) list.get(i)).getMRP_FLG());
		}
		return size;
	}
	public int setL2L_w_WH_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_WH_TYP == null) {
			l_w_WH_TYP = new ArrayList();
		} else {
			l_w_WH_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_WH_TYP.add(((AF0090010Struct) list.get(i)).getw_WH_TYP());
		}
		return size;
	}
	public int setL2L_ISSUE_CTRL_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_CTRL_CD == null) {
			l_ISSUE_CTRL_CD = new ArrayList();
		} else {
			l_ISSUE_CTRL_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_CTRL_CD.add(((AF0090010Struct) list.get(i)).getISSUE_CTRL_CD());
		}
		return size;
	}
	public int setL2L_ISSUE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_TYP == null) {
			l_ISSUE_TYP = new ArrayList();
		} else {
			l_ISSUE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_TYP.add(((AF0090010Struct) list.get(i)).getISSUE_TYP());
		}
		return size;
	}
	public int setL2L_RCV_ISSUE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_ISSUE_QTY == null) {
			l_RCV_ISSUE_QTY = new ArrayList();
		} else {
			l_RCV_ISSUE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_ISSUE_QTY.add(((AF0090010Struct) list.get(i)).getRCV_ISSUE_QTY());
		}
		return size;
	}
	public int setL2L_RCV_ISSUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_ISSUE_DATE == null) {
			l_RCV_ISSUE_DATE = new ArrayList();
		} else {
			l_RCV_ISSUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_ISSUE_DATE.add(((AF0090010Struct) list.get(i)).getRCV_ISSUE_DATE());
		}
		return size;
	}
	public int setL2L_RCV_ISSUE_GNR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_ISSUE_GNR_TYP == null) {
			l_RCV_ISSUE_GNR_TYP = new ArrayList();
		} else {
			l_RCV_ISSUE_GNR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_ISSUE_GNR_TYP.add(((AF0090010Struct) list.get(i)).getRCV_ISSUE_GNR_TYP());
		}
		return size;
	}
	public int setL2L_STOCK_UPD_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_UPD_TYP == null) {
			l_STOCK_UPD_TYP = new ArrayList();
		} else {
			l_STOCK_UPD_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_UPD_TYP.add(((AF0090010Struct) list.get(i)).getSTOCK_UPD_TYP());
		}
		return size;
	}
	public int setL2L_VEND_LOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_LOT_NO == null) {
			l_VEND_LOT_NO = new ArrayList();
		} else {
			l_VEND_LOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_LOT_NO.add(((AF0090010Struct) list.get(i)).getVEND_LOT_NO());
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
			l_COMPANY_CD.add(((AF0090010Struct) list.get(i)).getCOMPANY_CD());
		}
		return size;
	}
	public int setL2L_CONS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CONS_TYP == null) {
			l_CONS_TYP = new ArrayList();
		} else {
			l_CONS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CONS_TYP.add(((AF0090010Struct) list.get(i)).getCONS_TYP());
		}
		return size;
	}
	public int setL2L_LOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOT_NO == null) {
			l_LOT_NO = new ArrayList();
		} else {
			l_LOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOT_NO.add(((AF0090010Struct) list.get(i)).getLOT_NO());
		}
		return size;
	}
	public int setL2L_ONEROUS_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ONEROUS_FLG == null) {
			l_ONEROUS_FLG = new ArrayList();
		} else {
			l_ONEROUS_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ONEROUS_FLG.add(((AF0090010Struct) list.get(i)).getONEROUS_FLG());
		}
		return size;
	}
	public int setL2L_SBCNT_PUCH_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SBCNT_PUCH_TYP == null) {
			l_SBCNT_PUCH_TYP = new ArrayList();
		} else {
			l_SBCNT_PUCH_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SBCNT_PUCH_TYP.add(((AF0090010Struct) list.get(i)).getSBCNT_PUCH_TYP());
		}
		return size;
	}
	public int setL2L_NON_PLANNED_CAUSE_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NON_PLANNED_CAUSE_CD == null) {
			l_NON_PLANNED_CAUSE_CD = new ArrayList();
		} else {
			l_NON_PLANNED_CAUSE_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NON_PLANNED_CAUSE_CD.add(((AF0090010Struct) list.get(i)).getNON_PLANNED_CAUSE_CD());
		}
		return size;
	}
	public int setL2L_w_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_MODIFY_COUNT == null) {
			l_w_MODIFY_COUNT = new ArrayList();
		} else {
			l_w_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_MODIFY_COUNT.add(((AF0090010Struct) list.get(i)).getw_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_ISSUE_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_JOB_ODR_CD == null) {
			l_ISSUE_JOB_ODR_CD = new ArrayList();
		} else {
			l_ISSUE_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_JOB_ODR_CD.add(((AF0090010Struct) list.get(i)).getISSUE_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_w_ODR_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_ODR_STS_TYP == null) {
			l_w_ODR_STS_TYP = new ArrayList();
		} else {
			l_w_ODR_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_ODR_STS_TYP.add(((AF0090010Struct) list.get(i)).getw_ODR_STS_TYP());
		}
		return size;
	}
	public int setL2L_ISSUE_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_ITEM_CD == null) {
			l_ISSUE_ITEM_CD = new ArrayList();
		} else {
			l_ISSUE_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_ITEM_CD.add(((AF0090010Struct) list.get(i)).getISSUE_ITEM_CD());
		}
		return size;
	}
	public int setL2L_ISSUE_PROC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_PROC_CD == null) {
			l_ISSUE_PROC_CD = new ArrayList();
		} else {
			l_ISSUE_PROC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_PROC_CD.add(((AF0090010Struct) list.get(i)).getISSUE_PROC_CD());
		}
		return size;
	}
	public int setL2L_w_SUM_RCV_ISSUE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_SUM_RCV_ISSUE_QTY == null) {
			l_w_SUM_RCV_ISSUE_QTY = new ArrayList();
		} else {
			l_w_SUM_RCV_ISSUE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_SUM_RCV_ISSUE_QTY.add(((AF0090010Struct) list.get(i)).getw_SUM_RCV_ISSUE_QTY());
		}
		return size;
	}
	public int setL2L_PAST_RESULT_ENTRY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PAST_RESULT_ENTRY_TYP == null) {
			l_PAST_RESULT_ENTRY_TYP = new ArrayList();
		} else {
			l_PAST_RESULT_ENTRY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PAST_RESULT_ENTRY_TYP.add(((AF0090010Struct) list.get(i)).getPAST_RESULT_ENTRY_TYP());
		}
		return size;
	}
	public int setL2L_PROC_EXEC_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_EXEC_DATE == null) {
			l_PROC_EXEC_DATE = new ArrayList();
		} else {
			l_PROC_EXEC_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_EXEC_DATE.add(((AF0090010Struct) list.get(i)).getPROC_EXEC_DATE());
		}
		return size;
	}
	public int setL2L_LOT_STOCK_ON_HAND_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOT_STOCK_ON_HAND_QTY == null) {
			l_LOT_STOCK_ON_HAND_QTY = new ArrayList();
		} else {
			l_LOT_STOCK_ON_HAND_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOT_STOCK_ON_HAND_QTY.add(((AF0090010Struct) list.get(i)).getLOT_STOCK_ON_HAND_QTY());
		}
		return size;
	}
	public int setL2L_LOT_DEFECT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOT_DEFECT_QTY == null) {
			l_LOT_DEFECT_QTY = new ArrayList();
		} else {
			l_LOT_DEFECT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOT_DEFECT_QTY.add(((AF0090010Struct) list.get(i)).getLOT_DEFECT_QTY());
		}
		return size;
	}
	public int setL2L_ALLOCABLE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ALLOCABLE_QTY == null) {
			l_ALLOCABLE_QTY = new ArrayList();
		} else {
			l_ALLOCABLE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ALLOCABLE_QTY.add(((AF0090010Struct) list.get(i)).getALLOCABLE_QTY());
		}
		return size;
	}
	public int setL2L_ACCT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACCT_CD == null) {
			l_ACCT_CD = new ArrayList();
		} else {
			l_ACCT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACCT_CD.add(((AF0090010Struct) list.get(i)).getACCT_CD());
		}
		return size;
	}
	public int setL2L_DEPT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEPT_CD == null) {
			l_DEPT_CD = new ArrayList();
		} else {
			l_DEPT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEPT_CD.add(((AF0090010Struct) list.get(i)).getDEPT_CD());
		}
		return size;
	}
	public int setL2L_PJ_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PJ_CD == null) {
			l_PJ_CD = new ArrayList();
		} else {
			l_PJ_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PJ_CD.add(((AF0090010Struct) list.get(i)).getPJ_CD());
		}
		return size;
	}
	public int setL2L_SEG_CONTENTS1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEG_CONTENTS1 == null) {
			l_SEG_CONTENTS1 = new ArrayList();
		} else {
			l_SEG_CONTENTS1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEG_CONTENTS1.add(((AF0090010Struct) list.get(i)).getSEG_CONTENTS1());
		}
		return size;
	}
	public int setL2L_SEG_CONTENTS2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEG_CONTENTS2 == null) {
			l_SEG_CONTENTS2 = new ArrayList();
		} else {
			l_SEG_CONTENTS2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEG_CONTENTS2.add(((AF0090010Struct) list.get(i)).getSEG_CONTENTS2());
		}
		return size;
	}
	public int setL2L_SEG_CONTENTS3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEG_CONTENTS3 == null) {
			l_SEG_CONTENTS3 = new ArrayList();
		} else {
			l_SEG_CONTENTS3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEG_CONTENTS3.add(((AF0090010Struct) list.get(i)).getSEG_CONTENTS3());
		}
		return size;
	}
	public int setL2L_SEG_CONTENTS4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEG_CONTENTS4 == null) {
			l_SEG_CONTENTS4 = new ArrayList();
		} else {
			l_SEG_CONTENTS4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEG_CONTENTS4.add(((AF0090010Struct) list.get(i)).getSEG_CONTENTS4());
		}
		return size;
	}
	public int setL2L_DEPT_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEPT_NAME == null) {
			l_DEPT_NAME = new ArrayList();
		} else {
			l_DEPT_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEPT_NAME.add(((AF0090010Struct) list.get(i)).getDEPT_NAME());
		}
		return size;
	}
	public int setL2L_VALUE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VALUE == null) {
			l_VALUE = new ArrayList();
		} else {
			l_VALUE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VALUE.add(((AF0090010Struct) list.get(i)).getVALUE());
		}
		return size;
	}
	public int setL2L_DISPLAY_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DISPLAY_NAME == null) {
			l_DISPLAY_NAME = new ArrayList();
		} else {
			l_DISPLAY_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DISPLAY_NAME.add(((AF0090010Struct) list.get(i)).getDISPLAY_NAME());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_w_JOB_ODR = null;
		m_w_INFERIOR = null;
		m_c_JOB_ODR_CD = null;
		m_c_RCV_ISSUE_QTY = null;
		m_ALC_POS_QTY = null;
		m_THIS_TIME_POS_QTY = null;
		m_c_ISSUE_FLG = null;
		m_h_LotCtrl = null;
		m_h_lotFlg = null;
		m_ACCT_CD_name = null;
		m_ACCT_CD_val = null;
		m_PJ_CD_name = null;
		m_PJ_CD_val = null;
		m_SEG_CONTENTS1_name = null;
		m_SEG_CONTENTS1_val = null;
		m_SEG_CONTENTS2_name = null;
		m_SEG_CONTENTS2_val = null;
		m_SEG_CONTENTS3_name = null;
		m_SEG_CONTENTS3_val = null;
		m_SEG_CONTENTS4_name = null;
		m_SEG_CONTENTS4_val = null;
		m_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_DRAW_CD = null;
		m_SPEC = null;
		m_STOCK_UNIT = null;
		m_MRP_ODR_TYP = null;
		m_OUTSIDE_TYP = null;
		m_UNIT_QTY_TYP = null;
		m_PRODUCT_TYP = null;
		m_SPL_ITEM_TYP = null;
		m_LOT_CTRL_FLG = null;
		m_w_MANHOUR_TYP = null;
		m_w_TOTAL_STOCK_ON_HAND_QTY = null;
		m_JOB_ODR_CD = null;
		m_PLANT_CD = null;
		m_w_WH_STOCK_ON_HAND_QTY = null;
		m_WH_CD = null;
		m_DEFECT_QTY = null;
		m_w_TOTAL_DEFECT_QTY = null;
		m_BUSINESS_OPR_DATE = null;
		m_WH_NAME = null;
		m_VEND_CD = null;
		m_MRP_FLG = null;
		m_w_WH_TYP = null;
		m_ISSUE_CTRL_CD = null;
		m_ISSUE_TYP = null;
		m_RCV_ISSUE_QTY = null;
		m_RCV_ISSUE_DATE = null;
		m_RCV_ISSUE_GNR_TYP = null;
		m_STOCK_UPD_TYP = null;
		m_VEND_LOT_NO = null;
		m_COMPANY_CD = null;
		m_CONS_TYP = null;
		m_LOT_NO = null;
		m_ONEROUS_FLG = null;
		m_SBCNT_PUCH_TYP = null;
		m_NON_PLANNED_CAUSE_CD = null;
		m_w_MODIFY_COUNT = null;
		m_ISSUE_JOB_ODR_CD = null;
		m_w_ODR_STS_TYP = null;
		m_ISSUE_ITEM_CD = null;
		m_ISSUE_PROC_CD = null;
		m_w_SUM_RCV_ISSUE_QTY = null;
		m_PAST_RESULT_ENTRY_TYP = null;
		m_PROC_EXEC_DATE = null;
		m_LOT_STOCK_ON_HAND_QTY = null;
		m_LOT_DEFECT_QTY = null;
		m_ALLOCABLE_QTY = null;
		m_ACCT_CD = null;
		m_DEPT_CD = null;
		m_PJ_CD = null;
		m_SEG_CONTENTS1 = null;
		m_SEG_CONTENTS2 = null;
		m_SEG_CONTENTS3 = null;
		m_SEG_CONTENTS4 = null;
		m_DEPT_NAME = null;
		m_VALUE = null;
		m_DISPLAY_NAME = null;

		l_w_JOB_ODR = null;
		l_w_INFERIOR = null;
		l_c_JOB_ODR_CD = null;
		l_c_RCV_ISSUE_QTY = null;
		l_ALC_POS_QTY = null;
		l_THIS_TIME_POS_QTY = null;
		l_c_ISSUE_FLG = null;
		l_h_LotCtrl = null;
		l_h_lotFlg = null;
		l_ACCT_CD_name = null;
		l_ACCT_CD_val = null;
		l_PJ_CD_name = null;
		l_PJ_CD_val = null;
		l_SEG_CONTENTS1_name = null;
		l_SEG_CONTENTS1_val = null;
		l_SEG_CONTENTS2_name = null;
		l_SEG_CONTENTS2_val = null;
		l_SEG_CONTENTS3_name = null;
		l_SEG_CONTENTS3_val = null;
		l_SEG_CONTENTS4_name = null;
		l_SEG_CONTENTS4_val = null;
		l_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_DRAW_CD = null;
		l_SPEC = null;
		l_STOCK_UNIT = null;
		l_MRP_ODR_TYP = null;
		l_OUTSIDE_TYP = null;
		l_UNIT_QTY_TYP = null;
		l_PRODUCT_TYP = null;
		l_SPL_ITEM_TYP = null;
		l_LOT_CTRL_FLG = null;
		l_w_MANHOUR_TYP = null;
		l_w_TOTAL_STOCK_ON_HAND_QTY = null;
		l_JOB_ODR_CD = null;
		l_PLANT_CD = null;
		l_w_WH_STOCK_ON_HAND_QTY = null;
		l_WH_CD = null;
		l_DEFECT_QTY = null;
		l_w_TOTAL_DEFECT_QTY = null;
		l_BUSINESS_OPR_DATE = null;
		l_WH_NAME = null;
		l_VEND_CD = null;
		l_MRP_FLG = null;
		l_w_WH_TYP = null;
		l_ISSUE_CTRL_CD = null;
		l_ISSUE_TYP = null;
		l_RCV_ISSUE_QTY = null;
		l_RCV_ISSUE_DATE = null;
		l_RCV_ISSUE_GNR_TYP = null;
		l_STOCK_UPD_TYP = null;
		l_VEND_LOT_NO = null;
		l_COMPANY_CD = null;
		l_CONS_TYP = null;
		l_LOT_NO = null;
		l_ONEROUS_FLG = null;
		l_SBCNT_PUCH_TYP = null;
		l_NON_PLANNED_CAUSE_CD = null;
		l_w_MODIFY_COUNT = null;
		l_ISSUE_JOB_ODR_CD = null;
		l_w_ODR_STS_TYP = null;
		l_ISSUE_ITEM_CD = null;
		l_ISSUE_PROC_CD = null;
		l_w_SUM_RCV_ISSUE_QTY = null;
		l_PAST_RESULT_ENTRY_TYP = null;
		l_PROC_EXEC_DATE = null;
		l_LOT_STOCK_ON_HAND_QTY = null;
		l_LOT_DEFECT_QTY = null;
		l_ALLOCABLE_QTY = null;
		l_ACCT_CD = null;
		l_DEPT_CD = null;
		l_PJ_CD = null;
		l_SEG_CONTENTS1 = null;
		l_SEG_CONTENTS2 = null;
		l_SEG_CONTENTS3 = null;
		l_SEG_CONTENTS4 = null;
		l_DEPT_NAME = null;
		l_VALUE = null;
		l_DISPLAY_NAME = null;

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
	 * medAF0090010クラスの標準コンストラクタ
	 */
	public AF0090010Struct()
	{
		//{{user_implement_code_constractor
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
	public void setStruct(AF0090010Struct struct)
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
	public void setStructM(AF0090010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setw_JOB_ODR(struct.getw_JOB_ODR());
			this.setw_INFERIOR(struct.getw_INFERIOR());
			this.setc_JOB_ODR_CD(struct.getc_JOB_ODR_CD());
			this.setc_RCV_ISSUE_QTY(struct.getc_RCV_ISSUE_QTY());
			this.setALC_POS_QTY(struct.getALC_POS_QTY());
			this.setTHIS_TIME_POS_QTY(struct.getTHIS_TIME_POS_QTY());
			this.setc_ISSUE_FLG(struct.getc_ISSUE_FLG());
			this.seth_LotCtrl(struct.geth_LotCtrl());
			this.seth_lotFlg(struct.geth_lotFlg());
			this.setACCT_CD_name(struct.getACCT_CD_name());
			this.setACCT_CD_val(struct.getACCT_CD_val());
			this.setPJ_CD_name(struct.getPJ_CD_name());
			this.setPJ_CD_val(struct.getPJ_CD_val());
			this.setSEG_CONTENTS1_name(struct.getSEG_CONTENTS1_name());
			this.setSEG_CONTENTS1_val(struct.getSEG_CONTENTS1_val());
			this.setSEG_CONTENTS2_name(struct.getSEG_CONTENTS2_name());
			this.setSEG_CONTENTS2_val(struct.getSEG_CONTENTS2_val());
			this.setSEG_CONTENTS3_name(struct.getSEG_CONTENTS3_name());
			this.setSEG_CONTENTS3_val(struct.getSEG_CONTENTS3_val());
			this.setSEG_CONTENTS4_name(struct.getSEG_CONTENTS4_name());
			this.setSEG_CONTENTS4_val(struct.getSEG_CONTENTS4_val());
			this.setITEM_CD(struct.getITEM_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setDRAW_CD(struct.getDRAW_CD());
			this.setSPEC(struct.getSPEC());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setMRP_ODR_TYP(struct.getMRP_ODR_TYP());
			this.setOUTSIDE_TYP(struct.getOUTSIDE_TYP());
			this.setUNIT_QTY_TYP(struct.getUNIT_QTY_TYP());
			this.setPRODUCT_TYP(struct.getPRODUCT_TYP());
			this.setSPL_ITEM_TYP(struct.getSPL_ITEM_TYP());
			this.setLOT_CTRL_FLG(struct.getLOT_CTRL_FLG());
			this.setw_MANHOUR_TYP(struct.getw_MANHOUR_TYP());
			this.setw_TOTAL_STOCK_ON_HAND_QTY(struct.getw_TOTAL_STOCK_ON_HAND_QTY());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setw_WH_STOCK_ON_HAND_QTY(struct.getw_WH_STOCK_ON_HAND_QTY());
			this.setWH_CD(struct.getWH_CD());
			this.setDEFECT_QTY(struct.getDEFECT_QTY());
			this.setw_TOTAL_DEFECT_QTY(struct.getw_TOTAL_DEFECT_QTY());
			this.setBUSINESS_OPR_DATE(struct.getBUSINESS_OPR_DATE());
			this.setWH_NAME(struct.getWH_NAME());
			this.setVEND_CD(struct.getVEND_CD());
			this.setMRP_FLG(struct.getMRP_FLG());
			this.setw_WH_TYP(struct.getw_WH_TYP());
			this.setISSUE_CTRL_CD(struct.getISSUE_CTRL_CD());
			this.setISSUE_TYP(struct.getISSUE_TYP());
			this.setRCV_ISSUE_QTY(struct.getRCV_ISSUE_QTY());
			this.setRCV_ISSUE_DATE(struct.getRCV_ISSUE_DATE());
			this.setRCV_ISSUE_GNR_TYP(struct.getRCV_ISSUE_GNR_TYP());
			this.setSTOCK_UPD_TYP(struct.getSTOCK_UPD_TYP());
			this.setVEND_LOT_NO(struct.getVEND_LOT_NO());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setCONS_TYP(struct.getCONS_TYP());
			this.setLOT_NO(struct.getLOT_NO());
			this.setONEROUS_FLG(struct.getONEROUS_FLG());
			this.setSBCNT_PUCH_TYP(struct.getSBCNT_PUCH_TYP());
			this.setNON_PLANNED_CAUSE_CD(struct.getNON_PLANNED_CAUSE_CD());
			this.setw_MODIFY_COUNT(struct.getw_MODIFY_COUNT());
			this.setISSUE_JOB_ODR_CD(struct.getISSUE_JOB_ODR_CD());
			this.setw_ODR_STS_TYP(struct.getw_ODR_STS_TYP());
			this.setISSUE_ITEM_CD(struct.getISSUE_ITEM_CD());
			this.setISSUE_PROC_CD(struct.getISSUE_PROC_CD());
			this.setw_SUM_RCV_ISSUE_QTY(struct.getw_SUM_RCV_ISSUE_QTY());
			this.setPAST_RESULT_ENTRY_TYP(struct.getPAST_RESULT_ENTRY_TYP());
			this.setPROC_EXEC_DATE(struct.getPROC_EXEC_DATE());
			this.setLOT_STOCK_ON_HAND_QTY(struct.getLOT_STOCK_ON_HAND_QTY());
			this.setLOT_DEFECT_QTY(struct.getLOT_DEFECT_QTY());
			this.setALLOCABLE_QTY(struct.getALLOCABLE_QTY());
			this.setACCT_CD(struct.getACCT_CD());
			this.setDEPT_CD(struct.getDEPT_CD());
			this.setPJ_CD(struct.getPJ_CD());
			this.setSEG_CONTENTS1(struct.getSEG_CONTENTS1());
			this.setSEG_CONTENTS2(struct.getSEG_CONTENTS2());
			this.setSEG_CONTENTS3(struct.getSEG_CONTENTS3());
			this.setSEG_CONTENTS4(struct.getSEG_CONTENTS4());
			this.setDEPT_NAME(struct.getDEPT_NAME());
			this.setVALUE(struct.getVALUE());
			this.setDISPLAY_NAME(struct.getDISPLAY_NAME());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AF0090010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_w_JOB_ODR(struct.getList_w_JOB_ODR());
			this.setList_w_INFERIOR(struct.getList_w_INFERIOR());
			this.setList_c_JOB_ODR_CD(struct.getList_c_JOB_ODR_CD());
			this.setList_c_RCV_ISSUE_QTY(struct.getList_c_RCV_ISSUE_QTY());
			this.setList_ALC_POS_QTY(struct.getList_ALC_POS_QTY());
			this.setList_THIS_TIME_POS_QTY(struct.getList_THIS_TIME_POS_QTY());
			this.setList_c_ISSUE_FLG(struct.getList_c_ISSUE_FLG());
			this.setList_h_LotCtrl(struct.getList_h_LotCtrl());
			this.setList_h_lotFlg(struct.getList_h_lotFlg());
			this.setList_ACCT_CD_name(struct.getList_ACCT_CD_name());
			this.setList_ACCT_CD_val(struct.getList_ACCT_CD_val());
			this.setList_PJ_CD_name(struct.getList_PJ_CD_name());
			this.setList_PJ_CD_val(struct.getList_PJ_CD_val());
			this.setList_SEG_CONTENTS1_name(struct.getList_SEG_CONTENTS1_name());
			this.setList_SEG_CONTENTS1_val(struct.getList_SEG_CONTENTS1_val());
			this.setList_SEG_CONTENTS2_name(struct.getList_SEG_CONTENTS2_name());
			this.setList_SEG_CONTENTS2_val(struct.getList_SEG_CONTENTS2_val());
			this.setList_SEG_CONTENTS3_name(struct.getList_SEG_CONTENTS3_name());
			this.setList_SEG_CONTENTS3_val(struct.getList_SEG_CONTENTS3_val());
			this.setList_SEG_CONTENTS4_name(struct.getList_SEG_CONTENTS4_name());
			this.setList_SEG_CONTENTS4_val(struct.getList_SEG_CONTENTS4_val());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_DRAW_CD(struct.getList_DRAW_CD());
			this.setList_SPEC(struct.getList_SPEC());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_MRP_ODR_TYP(struct.getList_MRP_ODR_TYP());
			this.setList_OUTSIDE_TYP(struct.getList_OUTSIDE_TYP());
			this.setList_UNIT_QTY_TYP(struct.getList_UNIT_QTY_TYP());
			this.setList_PRODUCT_TYP(struct.getList_PRODUCT_TYP());
			this.setList_SPL_ITEM_TYP(struct.getList_SPL_ITEM_TYP());
			this.setList_LOT_CTRL_FLG(struct.getList_LOT_CTRL_FLG());
			this.setList_w_MANHOUR_TYP(struct.getList_w_MANHOUR_TYP());
			this.setList_w_TOTAL_STOCK_ON_HAND_QTY(struct.getList_w_TOTAL_STOCK_ON_HAND_QTY());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_w_WH_STOCK_ON_HAND_QTY(struct.getList_w_WH_STOCK_ON_HAND_QTY());
			this.setList_WH_CD(struct.getList_WH_CD());
			this.setList_DEFECT_QTY(struct.getList_DEFECT_QTY());
			this.setList_w_TOTAL_DEFECT_QTY(struct.getList_w_TOTAL_DEFECT_QTY());
			this.setList_BUSINESS_OPR_DATE(struct.getList_BUSINESS_OPR_DATE());
			this.setList_WH_NAME(struct.getList_WH_NAME());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_MRP_FLG(struct.getList_MRP_FLG());
			this.setList_w_WH_TYP(struct.getList_w_WH_TYP());
			this.setList_ISSUE_CTRL_CD(struct.getList_ISSUE_CTRL_CD());
			this.setList_ISSUE_TYP(struct.getList_ISSUE_TYP());
			this.setList_RCV_ISSUE_QTY(struct.getList_RCV_ISSUE_QTY());
			this.setList_RCV_ISSUE_DATE(struct.getList_RCV_ISSUE_DATE());
			this.setList_RCV_ISSUE_GNR_TYP(struct.getList_RCV_ISSUE_GNR_TYP());
			this.setList_STOCK_UPD_TYP(struct.getList_STOCK_UPD_TYP());
			this.setList_VEND_LOT_NO(struct.getList_VEND_LOT_NO());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_CONS_TYP(struct.getList_CONS_TYP());
			this.setList_LOT_NO(struct.getList_LOT_NO());
			this.setList_ONEROUS_FLG(struct.getList_ONEROUS_FLG());
			this.setList_SBCNT_PUCH_TYP(struct.getList_SBCNT_PUCH_TYP());
			this.setList_NON_PLANNED_CAUSE_CD(struct.getList_NON_PLANNED_CAUSE_CD());
			this.setList_w_MODIFY_COUNT(struct.getList_w_MODIFY_COUNT());
			this.setList_ISSUE_JOB_ODR_CD(struct.getList_ISSUE_JOB_ODR_CD());
			this.setList_w_ODR_STS_TYP(struct.getList_w_ODR_STS_TYP());
			this.setList_ISSUE_ITEM_CD(struct.getList_ISSUE_ITEM_CD());
			this.setList_ISSUE_PROC_CD(struct.getList_ISSUE_PROC_CD());
			this.setList_w_SUM_RCV_ISSUE_QTY(struct.getList_w_SUM_RCV_ISSUE_QTY());
			this.setList_PAST_RESULT_ENTRY_TYP(struct.getList_PAST_RESULT_ENTRY_TYP());
			this.setList_PROC_EXEC_DATE(struct.getList_PROC_EXEC_DATE());
			this.setList_LOT_STOCK_ON_HAND_QTY(struct.getList_LOT_STOCK_ON_HAND_QTY());
			this.setList_LOT_DEFECT_QTY(struct.getList_LOT_DEFECT_QTY());
			this.setList_ALLOCABLE_QTY(struct.getList_ALLOCABLE_QTY());
			this.setList_ACCT_CD(struct.getList_ACCT_CD());
			this.setList_DEPT_CD(struct.getList_DEPT_CD());
			this.setList_PJ_CD(struct.getList_PJ_CD());
			this.setList_SEG_CONTENTS1(struct.getList_SEG_CONTENTS1());
			this.setList_SEG_CONTENTS2(struct.getList_SEG_CONTENTS2());
			this.setList_SEG_CONTENTS3(struct.getList_SEG_CONTENTS3());
			this.setList_SEG_CONTENTS4(struct.getList_SEG_CONTENTS4());
			this.setList_DEPT_NAME(struct.getList_DEPT_NAME());
			this.setList_VALUE(struct.getList_VALUE());
			this.setList_DISPLAY_NAME(struct.getList_DISPLAY_NAME());
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
	// 第 1 変数初期値： i_w_JOB_ODR


	final static Integer i_w_JOB_ODR = null;

	// 第 2 変数初期値： i_w_INFERIOR


	final static Integer i_w_INFERIOR = null;

	// 第 3 変数初期値： i_c_JOB_ODR_CD


	final static String i_c_JOB_ODR_CD = null;

	// 第 4 変数初期値： i_c_RCV_ISSUE_QTY


	final static String i_c_RCV_ISSUE_QTY = null;

	// 第 5 変数初期値： i_ALC_POS_QTY


	final static String i_ALC_POS_QTY = null;

	// 第 6 変数初期値： i_THIS_TIME_POS_QTY


	final static String i_THIS_TIME_POS_QTY = null;

	// 第 7 変数初期値： i_c_ISSUE_FLG


	final static String i_c_ISSUE_FLG = null;

	// 第 8 変数初期値： i_h_LotCtrl


	final static String i_h_LotCtrl = null;

	// 第 9 変数初期値： i_h_lotFlg


	final static String i_h_lotFlg = null;

	// 第 10 変数初期値： i_ACCT_CD_name


	final static String i_ACCT_CD_name = null;

	// 第 11 変数初期値： i_ACCT_CD_val


	final static String i_ACCT_CD_val = null;

	// 第 12 変数初期値： i_PJ_CD_name


	final static String i_PJ_CD_name = null;

	// 第 13 変数初期値： i_PJ_CD_val


	final static String i_PJ_CD_val = null;

	// 第 14 変数初期値： i_SEG_CONTENTS1_name


	final static String i_SEG_CONTENTS1_name = null;

	// 第 15 変数初期値： i_SEG_CONTENTS1_val


	final static String i_SEG_CONTENTS1_val = null;

	// 第 16 変数初期値： i_SEG_CONTENTS2_name


	final static String i_SEG_CONTENTS2_name = null;

	// 第 17 変数初期値： i_SEG_CONTENTS2_val


	final static String i_SEG_CONTENTS2_val = null;

	// 第 18 変数初期値： i_SEG_CONTENTS3_name


	final static String i_SEG_CONTENTS3_name = null;

	// 第 19 変数初期値： i_SEG_CONTENTS3_val


	final static String i_SEG_CONTENTS3_val = null;

	// 第 20 変数初期値： i_SEG_CONTENTS4_name


	final static String i_SEG_CONTENTS4_name = null;

	// 第 21 変数初期値： i_SEG_CONTENTS4_val


	final static String i_SEG_CONTENTS4_val = null;

	// 第 22 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 23 変数初期値： i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// 第 24 変数初期値： i_DRAW_CD


	final static String i_DRAW_CD = null;

	// 第 25 変数初期値： i_SPEC


	final static String i_SPEC = null;

	// 第 26 変数初期値： i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// 第 27 変数初期値： i_MRP_ODR_TYP


	final static Integer i_MRP_ODR_TYP = null;

	// 第 28 変数初期値： i_OUTSIDE_TYP


	final static Integer i_OUTSIDE_TYP = null;

	// 第 29 変数初期値： i_UNIT_QTY_TYP


	final static Integer i_UNIT_QTY_TYP = null;

	// 第 30 変数初期値： i_PRODUCT_TYP


	final static Integer i_PRODUCT_TYP = null;

	// 第 31 変数初期値： i_SPL_ITEM_TYP


	final static Integer i_SPL_ITEM_TYP = null;

	// 第 32 変数初期値： i_LOT_CTRL_FLG


	final static String i_LOT_CTRL_FLG = null;

	// 第 33 変数初期値： i_w_MANHOUR_TYP


	final static String i_w_MANHOUR_TYP = null;

	// 第 34 変数初期値： i_w_TOTAL_STOCK_ON_HAND_QTY


	final static String i_w_TOTAL_STOCK_ON_HAND_QTY = null;

	// 第 35 変数初期値： i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// 第 36 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

	// 第 37 変数初期値： i_w_WH_STOCK_ON_HAND_QTY


	final static String i_w_WH_STOCK_ON_HAND_QTY = null;

	// 第 38 変数初期値： i_WH_CD


	final static String i_WH_CD = null;

	// 第 39 変数初期値： i_DEFECT_QTY


	final static String i_DEFECT_QTY = null;

	// 第 40 変数初期値： i_w_TOTAL_DEFECT_QTY


	final static String i_w_TOTAL_DEFECT_QTY = null;

	// 第 41 変数初期値： i_BUSINESS_OPR_DATE


	final static String i_BUSINESS_OPR_DATE = null;

	// 第 42 変数初期値： i_WH_NAME


	final static String i_WH_NAME = null;

	// 第 43 変数初期値： i_VEND_CD


	final static String i_VEND_CD = null;

	// 第 44 変数初期値： i_MRP_FLG


	final static String i_MRP_FLG = null;

	// 第 45 変数初期値： i_w_WH_TYP


	final static String i_w_WH_TYP = null;

	// 第 46 変数初期値： i_ISSUE_CTRL_CD


	final static String i_ISSUE_CTRL_CD = null;

	// 第 47 変数初期値： i_ISSUE_TYP


	final static Integer i_ISSUE_TYP = null;

	// 第 48 変数初期値： i_RCV_ISSUE_QTY


	final static String i_RCV_ISSUE_QTY = null;

	// 第 49 変数初期値： i_RCV_ISSUE_DATE


	final static String i_RCV_ISSUE_DATE = null;

	// 第 50 変数初期値： i_RCV_ISSUE_GNR_TYP


	final static Integer i_RCV_ISSUE_GNR_TYP = null;

	// 第 51 変数初期値： i_STOCK_UPD_TYP


	final static Integer i_STOCK_UPD_TYP = null;

	// 第 52 変数初期値： i_VEND_LOT_NO


	final static String i_VEND_LOT_NO = null;

	// 第 53 変数初期値： i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// 第 54 変数初期値： i_CONS_TYP


	final static Integer i_CONS_TYP = null;

	// 第 55 変数初期値： i_LOT_NO


	final static String i_LOT_NO = null;

	// 第 56 変数初期値： i_ONEROUS_FLG


	final static Integer i_ONEROUS_FLG = null;

	// 第 57 変数初期値： i_SBCNT_PUCH_TYP


	final static Integer i_SBCNT_PUCH_TYP = null;

	// 第 58 変数初期値： i_NON_PLANNED_CAUSE_CD


	final static String i_NON_PLANNED_CAUSE_CD = null;

	// 第 59 変数初期値： i_w_MODIFY_COUNT


	final static String i_w_MODIFY_COUNT = null;

	// 第 60 変数初期値： i_ISSUE_JOB_ODR_CD


	final static String i_ISSUE_JOB_ODR_CD = null;

	// 第 61 変数初期値： i_w_ODR_STS_TYP


	final static String i_w_ODR_STS_TYP = null;

	// 第 62 変数初期値： i_ISSUE_ITEM_CD


	final static String i_ISSUE_ITEM_CD = null;

	// 第 63 変数初期値： i_ISSUE_PROC_CD


	final static String i_ISSUE_PROC_CD = null;

	// 第 64 変数初期値： i_w_SUM_RCV_ISSUE_QTY


	final static String i_w_SUM_RCV_ISSUE_QTY = null;

	// 第 65 変数初期値： i_PAST_RESULT_ENTRY_TYP


	final static String i_PAST_RESULT_ENTRY_TYP = null;

	// 第 66 変数初期値： i_PROC_EXEC_DATE


	final static BigDecimal i_PROC_EXEC_DATE = null;

	// 第 67 変数初期値： i_LOT_STOCK_ON_HAND_QTY


	final static String i_LOT_STOCK_ON_HAND_QTY = null;

	// 第 68 変数初期値： i_LOT_DEFECT_QTY


	final static String i_LOT_DEFECT_QTY = null;

	// 第 69 変数初期値： i_ALLOCABLE_QTY


	final static String i_ALLOCABLE_QTY = null;

	// 第 70 変数初期値： i_ACCT_CD


	final static String i_ACCT_CD = null;

	// 第 71 変数初期値： i_DEPT_CD


	final static String i_DEPT_CD = null;

	// 第 72 変数初期値： i_PJ_CD


	final static String i_PJ_CD = null;

	// 第 73 変数初期値： i_SEG_CONTENTS1


	final static String i_SEG_CONTENTS1 = null;

	// 第 74 変数初期値： i_SEG_CONTENTS2


	final static String i_SEG_CONTENTS2 = null;

	// 第 75 変数初期値： i_SEG_CONTENTS3


	final static String i_SEG_CONTENTS3 = null;

	// 第 76 変数初期値： i_SEG_CONTENTS4


	final static String i_SEG_CONTENTS4 = null;

	// 第 77 変数初期値： i_DEPT_NAME


	final static String i_DEPT_NAME = null;

	// 第 78 変数初期値： i_VALUE


	final static String i_VALUE = null;

	// 第 79 変数初期値： i_DISPLAY_NAME


	final static String i_DISPLAY_NAME = null;

*/

	//{{user_implement_code
        //}}user_implement_code

	//////////////////////////////

}
