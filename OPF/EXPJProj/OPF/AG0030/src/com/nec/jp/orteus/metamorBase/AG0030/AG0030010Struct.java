/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AG0030/src/com/nec/jp/orteus/metamorBase/AG0030/AG0030010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AG0030;

import com.nec.jp.orteus.xaf.wa.*;

import com.nec.jp.orteus.util.logging.*;

import java.lang.Number.*;
import java.lang.Float;
import java.util.*;
import java.sql.*;
import java.io.*;

//{{user_implement_code_import

//------------------------------------------------------------------------------
import com.nec.jp.orteus.util.CoreTools;
import com.nec.jp.orteus.expj.util.MrpData;
import com.nec.jp.orteus.expj.util.MrpManager;
//------------------------------------------------------------------------------

//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AG0030010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_w_date_from */
	public String m_w_date_from = null;
	/** 第 2 変数： m_w_date_to */
	public String m_w_date_to = null;
	/** 第 3 変数： m_MRP_ODR_NAME */
	public String m_MRP_ODR_NAME = null;
	/** 第 4 変数： m_OUTSIDE_NAME */
	public String m_OUTSIDE_NAME = null;
	/** 第 5 変数： m_UNIT_QTY_NAME */
	public String m_UNIT_QTY_NAME = null;
	/** 第 6 変数： m_LOT_SIZING_NAME */
	public String m_LOT_SIZING_NAME = null;
	/** 第 7 変数： m_PlanDate */
	public String m_PlanDate = null;
	/** 第 8 変数： m_FixDemand */
	public String m_FixDemand = null;
	/** 第 9 変数： m_PlanDemand */
	public String m_PlanDemand = null;
	/** 第 10 変数： m_FixOrder */
	public String m_FixOrder = null;
	/** 第 11 変数： m_OldPlanOrder */
	public String m_OldPlanOrder = null;
	/** 第 12 変数： m_ValidStock */
	public String m_ValidStock = null;
	/** 第 13 変数： m_STOCK_UNIT_1 */
	public String m_STOCK_UNIT_1 = null;
	/** 第 14 変数： m_STOCK_UNIT_2 */
	public String m_STOCK_UNIT_2 = null;
	/** 第 15 変数： m_STOCK_UNIT_3 */
	public String m_STOCK_UNIT_3 = null;
	/** 第 16 変数： m_STOCK_UNIT_4 */
	public String m_STOCK_UNIT_4 = null;
	/** 第 17 変数： m_s_BUSINESS_OPR_DATE */
	public String m_s_BUSINESS_OPR_DATE = null;
	/** 第 18 変数： m_s_MIN_CAL_DATE */
	public String m_s_MIN_CAL_DATE = null;
	/** 第 19 変数： m_s_MAX_CAL_DATE */
	public String m_s_MAX_CAL_DATE = null;
	/** 第 20 変数： m_s_OD_NO */
	public String m_s_OD_NO = null;
	/** 第 21 変数： m_s_PLAN_SPAN */
	public String m_s_PLAN_SPAN = null;
	/** 第 22 変数： m_s_PRD_PLAN_PERIOD_TYP */
	public String m_s_PRD_PLAN_PERIOD_TYP = null;
	/** 第 23 変数： m_s_PRD_PLAN_FINAL_DAY_TYP */
	public String m_s_PRD_PLAN_FINAL_DAY_TYP = null;
	/** 第 24 変数： m_s_ODR_LT */
	public String m_s_ODR_LT = null;
	/** 第 25 変数： m_s_FIXED_LT */
	public String m_s_FIXED_LT = null;
	/** 第 26 変数： m_s_PROP_LT */
	public String m_s_PROP_LT = null;
	/** 第 27 変数： m_s_SAFETY_LT */
	public String m_s_SAFETY_LT = null;
	/** 第 28 変数： m_s_ISSUE_LT */
	public String m_s_ISSUE_LT = null;
	/** 第 29 変数： m_s_PROP_LOT_SIZE */
	public String m_s_PROP_LOT_SIZE = null;
	/** 第 30 変数： m_s_DUE_DATE */
	public String m_s_DUE_DATE = null;
	/** 第 31 変数： m_s_PRD_DUE_DATE */
	public String m_s_PRD_DUE_DATE = null;
	/** 第 32 変数： m_s_PRD_START_DATE */
	public String m_s_PRD_START_DATE = null;
	/** 第 33 変数： m_s_ODR_START_DATE */
	public String m_s_ODR_START_DATE = null;
	/** 第 34 変数： m_s_ODR_QTY */
	public String m_s_ODR_QTY = null;
	/** 第 35 変数： m_s_ISSUE_TYP */
	public String m_s_ISSUE_TYP = null;
	/** 第 36 変数： m_s_MAX_DISPLAY_MONTH_STOCK */
	public String m_s_MAX_DISPLAY_MONTH_STOCK = null;
	/** 第 37 変数： m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** 第 38 変数： m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** 第 39 変数： m_DRAW_CD */
	public String m_DRAW_CD = null;
	/** 第 40 変数： m_SPEC */
	public String m_SPEC = null;
	/** 第 41 変数： m_MRP_ODR_TYP */
	public String m_MRP_ODR_TYP = null;
	/** 第 42 変数： m_OUTSIDE_TYP */
	public String m_OUTSIDE_TYP = null;
	/** 第 43 変数： m_ITEM_SPOIL */
	public String m_ITEM_SPOIL = null;
	/** 第 44 変数： m_UNIT_QTY_TYP */
	public String m_UNIT_QTY_TYP = null;
	/** 第 45 変数： m_LOT_SIZING_TYP */
	public String m_LOT_SIZING_TYP = null;
	/** 第 46 変数： m_MAX_PERIOD */
	public String m_MAX_PERIOD = null;
	/** 第 47 変数： m_MUL_ODR_QTY */
	public String m_MUL_ODR_QTY = null;
	/** 第 48 変数： m_MAX_ODR_QTY */
	public String m_MAX_ODR_QTY = null;
	/** 第 49 変数： m_MIN_ODR_QTY */
	public String m_MIN_ODR_QTY = null;
	/** 第 50 変数： m_SAFETY_STOCK */
	public String m_SAFETY_STOCK = null;
	/** 第 51 変数： m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** 第 52 変数： m_w_PLANT_CD */
	public String m_w_PLANT_CD = null;
	/** 第 53 変数： m_w_ITEM_CD */
	public String m_w_ITEM_CD = null;
	/** 第 54 変数： m_STOCK_ON_HAND_QTY */
	public String m_STOCK_ON_HAND_QTY = null;
	/** 第 55 変数： m_dummy */
	public String m_dummy = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_w_date_from */
	public List l_w_date_from = null;

	/** 第 2 List変数： l_w_date_to */
	public List l_w_date_to = null;

	/** 第 3 List変数： l_MRP_ODR_NAME */
	public List l_MRP_ODR_NAME = null;

	/** 第 4 List変数： l_OUTSIDE_NAME */
	public List l_OUTSIDE_NAME = null;

	/** 第 5 List変数： l_UNIT_QTY_NAME */
	public List l_UNIT_QTY_NAME = null;

	/** 第 6 List変数： l_LOT_SIZING_NAME */
	public List l_LOT_SIZING_NAME = null;

	/** 第 7 List変数： l_PlanDate */
	public List l_PlanDate = null;

	/** 第 8 List変数： l_FixDemand */
	public List l_FixDemand = null;

	/** 第 9 List変数： l_PlanDemand */
	public List l_PlanDemand = null;

	/** 第 10 List変数： l_FixOrder */
	public List l_FixOrder = null;

	/** 第 11 List変数： l_OldPlanOrder */
	public List l_OldPlanOrder = null;

	/** 第 12 List変数： l_ValidStock */
	public List l_ValidStock = null;

	/** 第 13 List変数： l_STOCK_UNIT_1 */
	public List l_STOCK_UNIT_1 = null;

	/** 第 14 List変数： l_STOCK_UNIT_2 */
	public List l_STOCK_UNIT_2 = null;

	/** 第 15 List変数： l_STOCK_UNIT_3 */
	public List l_STOCK_UNIT_3 = null;

	/** 第 16 List変数： l_STOCK_UNIT_4 */
	public List l_STOCK_UNIT_4 = null;

	/** 第 17 List変数： l_s_BUSINESS_OPR_DATE */
	public List l_s_BUSINESS_OPR_DATE = null;

	/** 第 18 List変数： l_s_MIN_CAL_DATE */
	public List l_s_MIN_CAL_DATE = null;

	/** 第 19 List変数： l_s_MAX_CAL_DATE */
	public List l_s_MAX_CAL_DATE = null;

	/** 第 20 List変数： l_s_OD_NO */
	public List l_s_OD_NO = null;

	/** 第 21 List変数： l_s_PLAN_SPAN */
	public List l_s_PLAN_SPAN = null;

	/** 第 22 List変数： l_s_PRD_PLAN_PERIOD_TYP */
	public List l_s_PRD_PLAN_PERIOD_TYP = null;

	/** 第 23 List変数： l_s_PRD_PLAN_FINAL_DAY_TYP */
	public List l_s_PRD_PLAN_FINAL_DAY_TYP = null;

	/** 第 24 List変数： l_s_ODR_LT */
	public List l_s_ODR_LT = null;

	/** 第 25 List変数： l_s_FIXED_LT */
	public List l_s_FIXED_LT = null;

	/** 第 26 List変数： l_s_PROP_LT */
	public List l_s_PROP_LT = null;

	/** 第 27 List変数： l_s_SAFETY_LT */
	public List l_s_SAFETY_LT = null;

	/** 第 28 List変数： l_s_ISSUE_LT */
	public List l_s_ISSUE_LT = null;

	/** 第 29 List変数： l_s_PROP_LOT_SIZE */
	public List l_s_PROP_LOT_SIZE = null;

	/** 第 30 List変数： l_s_DUE_DATE */
	public List l_s_DUE_DATE = null;

	/** 第 31 List変数： l_s_PRD_DUE_DATE */
	public List l_s_PRD_DUE_DATE = null;

	/** 第 32 List変数： l_s_PRD_START_DATE */
	public List l_s_PRD_START_DATE = null;

	/** 第 33 List変数： l_s_ODR_START_DATE */
	public List l_s_ODR_START_DATE = null;

	/** 第 34 List変数： l_s_ODR_QTY */
	public List l_s_ODR_QTY = null;

	/** 第 35 List変数： l_s_ISSUE_TYP */
	public List l_s_ISSUE_TYP = null;

	/** 第 36 List変数： l_s_MAX_DISPLAY_MONTH_STOCK */
	public List l_s_MAX_DISPLAY_MONTH_STOCK = null;

	/** 第 37 List変数： l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** 第 38 List変数： l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** 第 39 List変数： l_DRAW_CD */
	public List l_DRAW_CD = null;

	/** 第 40 List変数： l_SPEC */
	public List l_SPEC = null;

	/** 第 41 List変数： l_MRP_ODR_TYP */
	public List l_MRP_ODR_TYP = null;

	/** 第 42 List変数： l_OUTSIDE_TYP */
	public List l_OUTSIDE_TYP = null;

	/** 第 43 List変数： l_ITEM_SPOIL */
	public List l_ITEM_SPOIL = null;

	/** 第 44 List変数： l_UNIT_QTY_TYP */
	public List l_UNIT_QTY_TYP = null;

	/** 第 45 List変数： l_LOT_SIZING_TYP */
	public List l_LOT_SIZING_TYP = null;

	/** 第 46 List変数： l_MAX_PERIOD */
	public List l_MAX_PERIOD = null;

	/** 第 47 List変数： l_MUL_ODR_QTY */
	public List l_MUL_ODR_QTY = null;

	/** 第 48 List変数： l_MAX_ODR_QTY */
	public List l_MAX_ODR_QTY = null;

	/** 第 49 List変数： l_MIN_ODR_QTY */
	public List l_MIN_ODR_QTY = null;

	/** 第 50 List変数： l_SAFETY_STOCK */
	public List l_SAFETY_STOCK = null;

	/** 第 51 List変数： l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** 第 52 List変数： l_w_PLANT_CD */
	public List l_w_PLANT_CD = null;

	/** 第 53 List変数： l_w_ITEM_CD */
	public List l_w_ITEM_CD = null;

	/** 第 54 List変数： l_STOCK_ON_HAND_QTY */
	public List l_STOCK_ON_HAND_QTY = null;

	/** 第 55 List変数： l_dummy */
	public List l_dummy = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getw_date_from() { return m_w_date_from; }
	public String getw_date_to() { return m_w_date_to; }
	public String getMRP_ODR_NAME() { return m_MRP_ODR_NAME; }
	public String getOUTSIDE_NAME() { return m_OUTSIDE_NAME; }
	public String getUNIT_QTY_NAME() { return m_UNIT_QTY_NAME; }
	public String getLOT_SIZING_NAME() { return m_LOT_SIZING_NAME; }
	public String getPlanDate() { return m_PlanDate; }
	public String getFixDemand() { return m_FixDemand; }
	public String getPlanDemand() { return m_PlanDemand; }
	public String getFixOrder() { return m_FixOrder; }
	public String getOldPlanOrder() { return m_OldPlanOrder; }
	public String getValidStock() { return m_ValidStock; }
	public String getSTOCK_UNIT_1() { return m_STOCK_UNIT_1; }
	public String getSTOCK_UNIT_2() { return m_STOCK_UNIT_2; }
	public String getSTOCK_UNIT_3() { return m_STOCK_UNIT_3; }
	public String getSTOCK_UNIT_4() { return m_STOCK_UNIT_4; }
	public String gets_BUSINESS_OPR_DATE() { return m_s_BUSINESS_OPR_DATE; }
	public String gets_MIN_CAL_DATE() { return m_s_MIN_CAL_DATE; }
	public String gets_MAX_CAL_DATE() { return m_s_MAX_CAL_DATE; }
	public String gets_OD_NO() { return m_s_OD_NO; }
	public String gets_PLAN_SPAN() { return m_s_PLAN_SPAN; }
	public String gets_PRD_PLAN_PERIOD_TYP() { return m_s_PRD_PLAN_PERIOD_TYP; }
	public String gets_PRD_PLAN_FINAL_DAY_TYP() { return m_s_PRD_PLAN_FINAL_DAY_TYP; }
	public String gets_ODR_LT() { return m_s_ODR_LT; }
	public String gets_FIXED_LT() { return m_s_FIXED_LT; }
	public String gets_PROP_LT() { return m_s_PROP_LT; }
	public String gets_SAFETY_LT() { return m_s_SAFETY_LT; }
	public String gets_ISSUE_LT() { return m_s_ISSUE_LT; }
	public String gets_PROP_LOT_SIZE() { return m_s_PROP_LOT_SIZE; }
	public String gets_DUE_DATE() { return m_s_DUE_DATE; }
	public String gets_PRD_DUE_DATE() { return m_s_PRD_DUE_DATE; }
	public String gets_PRD_START_DATE() { return m_s_PRD_START_DATE; }
	public String gets_ODR_START_DATE() { return m_s_ODR_START_DATE; }
	public String gets_ODR_QTY() { return m_s_ODR_QTY; }
	public String gets_ISSUE_TYP() { return m_s_ISSUE_TYP; }
	public String gets_MAX_DISPLAY_MONTH_STOCK() { return m_s_MAX_DISPLAY_MONTH_STOCK; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getDRAW_CD() { return m_DRAW_CD; }
	public String getSPEC() { return m_SPEC; }
	public String getMRP_ODR_TYP() { return m_MRP_ODR_TYP; }
	public String getOUTSIDE_TYP() { return m_OUTSIDE_TYP; }
	public String getITEM_SPOIL() { return m_ITEM_SPOIL; }
	public String getUNIT_QTY_TYP() { return m_UNIT_QTY_TYP; }
	public String getLOT_SIZING_TYP() { return m_LOT_SIZING_TYP; }
	public String getMAX_PERIOD() { return m_MAX_PERIOD; }
	public String getMUL_ODR_QTY() { return m_MUL_ODR_QTY; }
	public String getMAX_ODR_QTY() { return m_MAX_ODR_QTY; }
	public String getMIN_ODR_QTY() { return m_MIN_ODR_QTY; }
	public String getSAFETY_STOCK() { return m_SAFETY_STOCK; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getw_PLANT_CD() { return m_w_PLANT_CD; }
	public String getw_ITEM_CD() { return m_w_ITEM_CD; }
	public String getSTOCK_ON_HAND_QTY() { return m_STOCK_ON_HAND_QTY; }
	public String getdummy() { return m_dummy; }

	public List getList_w_date_from() { return l_w_date_from; }
	public List getList_w_date_to() { return l_w_date_to; }
	public List getList_MRP_ODR_NAME() { return l_MRP_ODR_NAME; }
	public List getList_OUTSIDE_NAME() { return l_OUTSIDE_NAME; }
	public List getList_UNIT_QTY_NAME() { return l_UNIT_QTY_NAME; }
	public List getList_LOT_SIZING_NAME() { return l_LOT_SIZING_NAME; }
	public List getList_PlanDate() { return l_PlanDate; }
	public List getList_FixDemand() { return l_FixDemand; }
	public List getList_PlanDemand() { return l_PlanDemand; }
	public List getList_FixOrder() { return l_FixOrder; }
	public List getList_OldPlanOrder() { return l_OldPlanOrder; }
	public List getList_ValidStock() { return l_ValidStock; }
	public List getList_STOCK_UNIT_1() { return l_STOCK_UNIT_1; }
	public List getList_STOCK_UNIT_2() { return l_STOCK_UNIT_2; }
	public List getList_STOCK_UNIT_3() { return l_STOCK_UNIT_3; }
	public List getList_STOCK_UNIT_4() { return l_STOCK_UNIT_4; }
	public List getList_s_BUSINESS_OPR_DATE() { return l_s_BUSINESS_OPR_DATE; }
	public List getList_s_MIN_CAL_DATE() { return l_s_MIN_CAL_DATE; }
	public List getList_s_MAX_CAL_DATE() { return l_s_MAX_CAL_DATE; }
	public List getList_s_OD_NO() { return l_s_OD_NO; }
	public List getList_s_PLAN_SPAN() { return l_s_PLAN_SPAN; }
	public List getList_s_PRD_PLAN_PERIOD_TYP() { return l_s_PRD_PLAN_PERIOD_TYP; }
	public List getList_s_PRD_PLAN_FINAL_DAY_TYP() { return l_s_PRD_PLAN_FINAL_DAY_TYP; }
	public List getList_s_ODR_LT() { return l_s_ODR_LT; }
	public List getList_s_FIXED_LT() { return l_s_FIXED_LT; }
	public List getList_s_PROP_LT() { return l_s_PROP_LT; }
	public List getList_s_SAFETY_LT() { return l_s_SAFETY_LT; }
	public List getList_s_ISSUE_LT() { return l_s_ISSUE_LT; }
	public List getList_s_PROP_LOT_SIZE() { return l_s_PROP_LOT_SIZE; }
	public List getList_s_DUE_DATE() { return l_s_DUE_DATE; }
	public List getList_s_PRD_DUE_DATE() { return l_s_PRD_DUE_DATE; }
	public List getList_s_PRD_START_DATE() { return l_s_PRD_START_DATE; }
	public List getList_s_ODR_START_DATE() { return l_s_ODR_START_DATE; }
	public List getList_s_ODR_QTY() { return l_s_ODR_QTY; }
	public List getList_s_ISSUE_TYP() { return l_s_ISSUE_TYP; }
	public List getList_s_MAX_DISPLAY_MONTH_STOCK() { return l_s_MAX_DISPLAY_MONTH_STOCK; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_DRAW_CD() { return l_DRAW_CD; }
	public List getList_SPEC() { return l_SPEC; }
	public List getList_MRP_ODR_TYP() { return l_MRP_ODR_TYP; }
	public List getList_OUTSIDE_TYP() { return l_OUTSIDE_TYP; }
	public List getList_ITEM_SPOIL() { return l_ITEM_SPOIL; }
	public List getList_UNIT_QTY_TYP() { return l_UNIT_QTY_TYP; }
	public List getList_LOT_SIZING_TYP() { return l_LOT_SIZING_TYP; }
	public List getList_MAX_PERIOD() { return l_MAX_PERIOD; }
	public List getList_MUL_ODR_QTY() { return l_MUL_ODR_QTY; }
	public List getList_MAX_ODR_QTY() { return l_MAX_ODR_QTY; }
	public List getList_MIN_ODR_QTY() { return l_MIN_ODR_QTY; }
	public List getList_SAFETY_STOCK() { return l_SAFETY_STOCK; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_w_PLANT_CD() { return l_w_PLANT_CD; }
	public List getList_w_ITEM_CD() { return l_w_ITEM_CD; }
	public List getList_STOCK_ON_HAND_QTY() { return l_STOCK_ON_HAND_QTY; }
	public List getList_dummy() { return l_dummy; }

	public void setw_date_from(String val) { m_w_date_from = val; }
	public void setw_date_to(String val) { m_w_date_to = val; }
	public void setMRP_ODR_NAME(String val) { m_MRP_ODR_NAME = val; }
	public void setOUTSIDE_NAME(String val) { m_OUTSIDE_NAME = val; }
	public void setUNIT_QTY_NAME(String val) { m_UNIT_QTY_NAME = val; }
	public void setLOT_SIZING_NAME(String val) { m_LOT_SIZING_NAME = val; }
	public void setPlanDate(String val) { m_PlanDate = val; }
	public void setFixDemand(String val) { m_FixDemand = val; }
	public void setPlanDemand(String val) { m_PlanDemand = val; }
	public void setFixOrder(String val) { m_FixOrder = val; }
	public void setOldPlanOrder(String val) { m_OldPlanOrder = val; }
	public void setValidStock(String val) { m_ValidStock = val; }
	public void setSTOCK_UNIT_1(String val) { m_STOCK_UNIT_1 = val; }
	public void setSTOCK_UNIT_2(String val) { m_STOCK_UNIT_2 = val; }
	public void setSTOCK_UNIT_3(String val) { m_STOCK_UNIT_3 = val; }
	public void setSTOCK_UNIT_4(String val) { m_STOCK_UNIT_4 = val; }
	public void sets_BUSINESS_OPR_DATE(String val) { m_s_BUSINESS_OPR_DATE = val; }
	public void sets_MIN_CAL_DATE(String val) { m_s_MIN_CAL_DATE = val; }
	public void sets_MAX_CAL_DATE(String val) { m_s_MAX_CAL_DATE = val; }
	public void sets_OD_NO(String val) { m_s_OD_NO = val; }
	public void sets_PLAN_SPAN(String val) { m_s_PLAN_SPAN = val; }
	public void sets_PRD_PLAN_PERIOD_TYP(String val) { m_s_PRD_PLAN_PERIOD_TYP = val; }
	public void sets_PRD_PLAN_FINAL_DAY_TYP(String val) { m_s_PRD_PLAN_FINAL_DAY_TYP = val; }
	public void sets_ODR_LT(String val) { m_s_ODR_LT = val; }
	public void sets_FIXED_LT(String val) { m_s_FIXED_LT = val; }
	public void sets_PROP_LT(String val) { m_s_PROP_LT = val; }
	public void sets_SAFETY_LT(String val) { m_s_SAFETY_LT = val; }
	public void sets_ISSUE_LT(String val) { m_s_ISSUE_LT = val; }
	public void sets_PROP_LOT_SIZE(String val) { m_s_PROP_LOT_SIZE = val; }
	public void sets_DUE_DATE(String val) { m_s_DUE_DATE = val; }
	public void sets_PRD_DUE_DATE(String val) { m_s_PRD_DUE_DATE = val; }
	public void sets_PRD_START_DATE(String val) { m_s_PRD_START_DATE = val; }
	public void sets_ODR_START_DATE(String val) { m_s_ODR_START_DATE = val; }
	public void sets_ODR_QTY(String val) { m_s_ODR_QTY = val; }
	public void sets_ISSUE_TYP(String val) { m_s_ISSUE_TYP = val; }
	public void sets_MAX_DISPLAY_MONTH_STOCK(String val) { m_s_MAX_DISPLAY_MONTH_STOCK = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setDRAW_CD(String val) { m_DRAW_CD = val; }
	public void setSPEC(String val) { m_SPEC = val; }
	public void setMRP_ODR_TYP(String val) { m_MRP_ODR_TYP = val; }
	public void setOUTSIDE_TYP(String val) { m_OUTSIDE_TYP = val; }
	public void setITEM_SPOIL(String val) { m_ITEM_SPOIL = val; }
	public void setUNIT_QTY_TYP(String val) { m_UNIT_QTY_TYP = val; }
	public void setLOT_SIZING_TYP(String val) { m_LOT_SIZING_TYP = val; }
	public void setMAX_PERIOD(String val) { m_MAX_PERIOD = val; }
	public void setMUL_ODR_QTY(String val) { m_MUL_ODR_QTY = val; }
	public void setMAX_ODR_QTY(String val) { m_MAX_ODR_QTY = val; }
	public void setMIN_ODR_QTY(String val) { m_MIN_ODR_QTY = val; }
	public void setSAFETY_STOCK(String val) { m_SAFETY_STOCK = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setw_PLANT_CD(String val) { m_w_PLANT_CD = val; }
	public void setw_ITEM_CD(String val) { m_w_ITEM_CD = val; }
	public void setSTOCK_ON_HAND_QTY(String val) { m_STOCK_ON_HAND_QTY = val; }
	public void setdummy(String val) { m_dummy = val; }


	public void setList_w_date_from(List list) { l_w_date_from = list; }
	public void setList_w_date_to(List list) { l_w_date_to = list; }
	public void setList_MRP_ODR_NAME(List list) { l_MRP_ODR_NAME = list; }
	public void setList_OUTSIDE_NAME(List list) { l_OUTSIDE_NAME = list; }
	public void setList_UNIT_QTY_NAME(List list) { l_UNIT_QTY_NAME = list; }
	public void setList_LOT_SIZING_NAME(List list) { l_LOT_SIZING_NAME = list; }
	public void setList_PlanDate(List list) { l_PlanDate = list; }
	public void setList_FixDemand(List list) { l_FixDemand = list; }
	public void setList_PlanDemand(List list) { l_PlanDemand = list; }
	public void setList_FixOrder(List list) { l_FixOrder = list; }
	public void setList_OldPlanOrder(List list) { l_OldPlanOrder = list; }
	public void setList_ValidStock(List list) { l_ValidStock = list; }
	public void setList_STOCK_UNIT_1(List list) { l_STOCK_UNIT_1 = list; }
	public void setList_STOCK_UNIT_2(List list) { l_STOCK_UNIT_2 = list; }
	public void setList_STOCK_UNIT_3(List list) { l_STOCK_UNIT_3 = list; }
	public void setList_STOCK_UNIT_4(List list) { l_STOCK_UNIT_4 = list; }
	public void setList_s_BUSINESS_OPR_DATE(List list) { l_s_BUSINESS_OPR_DATE = list; }
	public void setList_s_MIN_CAL_DATE(List list) { l_s_MIN_CAL_DATE = list; }
	public void setList_s_MAX_CAL_DATE(List list) { l_s_MAX_CAL_DATE = list; }
	public void setList_s_OD_NO(List list) { l_s_OD_NO = list; }
	public void setList_s_PLAN_SPAN(List list) { l_s_PLAN_SPAN = list; }
	public void setList_s_PRD_PLAN_PERIOD_TYP(List list) { l_s_PRD_PLAN_PERIOD_TYP = list; }
	public void setList_s_PRD_PLAN_FINAL_DAY_TYP(List list) { l_s_PRD_PLAN_FINAL_DAY_TYP = list; }
	public void setList_s_ODR_LT(List list) { l_s_ODR_LT = list; }
	public void setList_s_FIXED_LT(List list) { l_s_FIXED_LT = list; }
	public void setList_s_PROP_LT(List list) { l_s_PROP_LT = list; }
	public void setList_s_SAFETY_LT(List list) { l_s_SAFETY_LT = list; }
	public void setList_s_ISSUE_LT(List list) { l_s_ISSUE_LT = list; }
	public void setList_s_PROP_LOT_SIZE(List list) { l_s_PROP_LOT_SIZE = list; }
	public void setList_s_DUE_DATE(List list) { l_s_DUE_DATE = list; }
	public void setList_s_PRD_DUE_DATE(List list) { l_s_PRD_DUE_DATE = list; }
	public void setList_s_PRD_START_DATE(List list) { l_s_PRD_START_DATE = list; }
	public void setList_s_ODR_START_DATE(List list) { l_s_ODR_START_DATE = list; }
	public void setList_s_ODR_QTY(List list) { l_s_ODR_QTY = list; }
	public void setList_s_ISSUE_TYP(List list) { l_s_ISSUE_TYP = list; }
	public void setList_s_MAX_DISPLAY_MONTH_STOCK(List list) { l_s_MAX_DISPLAY_MONTH_STOCK = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_DRAW_CD(List list) { l_DRAW_CD = list; }
	public void setList_SPEC(List list) { l_SPEC = list; }
	public void setList_MRP_ODR_TYP(List list) { l_MRP_ODR_TYP = list; }
	public void setList_OUTSIDE_TYP(List list) { l_OUTSIDE_TYP = list; }
	public void setList_ITEM_SPOIL(List list) { l_ITEM_SPOIL = list; }
	public void setList_UNIT_QTY_TYP(List list) { l_UNIT_QTY_TYP = list; }
	public void setList_LOT_SIZING_TYP(List list) { l_LOT_SIZING_TYP = list; }
	public void setList_MAX_PERIOD(List list) { l_MAX_PERIOD = list; }
	public void setList_MUL_ODR_QTY(List list) { l_MUL_ODR_QTY = list; }
	public void setList_MAX_ODR_QTY(List list) { l_MAX_ODR_QTY = list; }
	public void setList_MIN_ODR_QTY(List list) { l_MIN_ODR_QTY = list; }
	public void setList_SAFETY_STOCK(List list) { l_SAFETY_STOCK = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_w_PLANT_CD(List list) { l_w_PLANT_CD = list; }
	public void setList_w_ITEM_CD(List list) { l_w_ITEM_CD = list; }
	public void setList_STOCK_ON_HAND_QTY(List list) { l_STOCK_ON_HAND_QTY = list; }
	public void setList_dummy(List list) { l_dummy = list; }

	public int setL2L_w_date_from(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_date_from == null) {
			l_w_date_from = new ArrayList();
		} else {
			l_w_date_from.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_date_from.add(((AG0030010Struct) list.get(i)).getw_date_from());
		}
		return size;
	}
	public int setL2L_w_date_to(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_date_to == null) {
			l_w_date_to = new ArrayList();
		} else {
			l_w_date_to.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_date_to.add(((AG0030010Struct) list.get(i)).getw_date_to());
		}
		return size;
	}
	public int setL2L_MRP_ODR_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_ODR_NAME == null) {
			l_MRP_ODR_NAME = new ArrayList();
		} else {
			l_MRP_ODR_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_ODR_NAME.add(((AG0030010Struct) list.get(i)).getMRP_ODR_NAME());
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
			l_OUTSIDE_NAME.add(((AG0030010Struct) list.get(i)).getOUTSIDE_NAME());
		}
		return size;
	}
	public int setL2L_UNIT_QTY_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_QTY_NAME == null) {
			l_UNIT_QTY_NAME = new ArrayList();
		} else {
			l_UNIT_QTY_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_QTY_NAME.add(((AG0030010Struct) list.get(i)).getUNIT_QTY_NAME());
		}
		return size;
	}
	public int setL2L_LOT_SIZING_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOT_SIZING_NAME == null) {
			l_LOT_SIZING_NAME = new ArrayList();
		} else {
			l_LOT_SIZING_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOT_SIZING_NAME.add(((AG0030010Struct) list.get(i)).getLOT_SIZING_NAME());
		}
		return size;
	}
	public int setL2L_PlanDate(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PlanDate == null) {
			l_PlanDate = new ArrayList();
		} else {
			l_PlanDate.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PlanDate.add(((AG0030010Struct) list.get(i)).getPlanDate());
		}
		return size;
	}
	public int setL2L_FixDemand(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FixDemand == null) {
			l_FixDemand = new ArrayList();
		} else {
			l_FixDemand.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FixDemand.add(((AG0030010Struct) list.get(i)).getFixDemand());
		}
		return size;
	}
	public int setL2L_PlanDemand(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PlanDemand == null) {
			l_PlanDemand = new ArrayList();
		} else {
			l_PlanDemand.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PlanDemand.add(((AG0030010Struct) list.get(i)).getPlanDemand());
		}
		return size;
	}
	public int setL2L_FixOrder(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FixOrder == null) {
			l_FixOrder = new ArrayList();
		} else {
			l_FixOrder.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FixOrder.add(((AG0030010Struct) list.get(i)).getFixOrder());
		}
		return size;
	}
	public int setL2L_OldPlanOrder(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OldPlanOrder == null) {
			l_OldPlanOrder = new ArrayList();
		} else {
			l_OldPlanOrder.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OldPlanOrder.add(((AG0030010Struct) list.get(i)).getOldPlanOrder());
		}
		return size;
	}
	public int setL2L_ValidStock(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ValidStock == null) {
			l_ValidStock = new ArrayList();
		} else {
			l_ValidStock.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ValidStock.add(((AG0030010Struct) list.get(i)).getValidStock());
		}
		return size;
	}
	public int setL2L_STOCK_UNIT_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_UNIT_1 == null) {
			l_STOCK_UNIT_1 = new ArrayList();
		} else {
			l_STOCK_UNIT_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_UNIT_1.add(((AG0030010Struct) list.get(i)).getSTOCK_UNIT_1());
		}
		return size;
	}
	public int setL2L_STOCK_UNIT_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_UNIT_2 == null) {
			l_STOCK_UNIT_2 = new ArrayList();
		} else {
			l_STOCK_UNIT_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_UNIT_2.add(((AG0030010Struct) list.get(i)).getSTOCK_UNIT_2());
		}
		return size;
	}
	public int setL2L_STOCK_UNIT_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_UNIT_3 == null) {
			l_STOCK_UNIT_3 = new ArrayList();
		} else {
			l_STOCK_UNIT_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_UNIT_3.add(((AG0030010Struct) list.get(i)).getSTOCK_UNIT_3());
		}
		return size;
	}
	public int setL2L_STOCK_UNIT_4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_UNIT_4 == null) {
			l_STOCK_UNIT_4 = new ArrayList();
		} else {
			l_STOCK_UNIT_4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_UNIT_4.add(((AG0030010Struct) list.get(i)).getSTOCK_UNIT_4());
		}
		return size;
	}
	public int setL2L_s_BUSINESS_OPR_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_BUSINESS_OPR_DATE == null) {
			l_s_BUSINESS_OPR_DATE = new ArrayList();
		} else {
			l_s_BUSINESS_OPR_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_BUSINESS_OPR_DATE.add(((AG0030010Struct) list.get(i)).gets_BUSINESS_OPR_DATE());
		}
		return size;
	}
	public int setL2L_s_MIN_CAL_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_MIN_CAL_DATE == null) {
			l_s_MIN_CAL_DATE = new ArrayList();
		} else {
			l_s_MIN_CAL_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_MIN_CAL_DATE.add(((AG0030010Struct) list.get(i)).gets_MIN_CAL_DATE());
		}
		return size;
	}
	public int setL2L_s_MAX_CAL_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_MAX_CAL_DATE == null) {
			l_s_MAX_CAL_DATE = new ArrayList();
		} else {
			l_s_MAX_CAL_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_MAX_CAL_DATE.add(((AG0030010Struct) list.get(i)).gets_MAX_CAL_DATE());
		}
		return size;
	}
	public int setL2L_s_OD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_OD_NO == null) {
			l_s_OD_NO = new ArrayList();
		} else {
			l_s_OD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_OD_NO.add(((AG0030010Struct) list.get(i)).gets_OD_NO());
		}
		return size;
	}
	public int setL2L_s_PLAN_SPAN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_PLAN_SPAN == null) {
			l_s_PLAN_SPAN = new ArrayList();
		} else {
			l_s_PLAN_SPAN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_PLAN_SPAN.add(((AG0030010Struct) list.get(i)).gets_PLAN_SPAN());
		}
		return size;
	}
	public int setL2L_s_PRD_PLAN_PERIOD_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_PRD_PLAN_PERIOD_TYP == null) {
			l_s_PRD_PLAN_PERIOD_TYP = new ArrayList();
		} else {
			l_s_PRD_PLAN_PERIOD_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_PRD_PLAN_PERIOD_TYP.add(((AG0030010Struct) list.get(i)).gets_PRD_PLAN_PERIOD_TYP());
		}
		return size;
	}
	public int setL2L_s_PRD_PLAN_FINAL_DAY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_PRD_PLAN_FINAL_DAY_TYP == null) {
			l_s_PRD_PLAN_FINAL_DAY_TYP = new ArrayList();
		} else {
			l_s_PRD_PLAN_FINAL_DAY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_PRD_PLAN_FINAL_DAY_TYP.add(((AG0030010Struct) list.get(i)).gets_PRD_PLAN_FINAL_DAY_TYP());
		}
		return size;
	}
	public int setL2L_s_ODR_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_ODR_LT == null) {
			l_s_ODR_LT = new ArrayList();
		} else {
			l_s_ODR_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_ODR_LT.add(((AG0030010Struct) list.get(i)).gets_ODR_LT());
		}
		return size;
	}
	public int setL2L_s_FIXED_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_FIXED_LT == null) {
			l_s_FIXED_LT = new ArrayList();
		} else {
			l_s_FIXED_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_FIXED_LT.add(((AG0030010Struct) list.get(i)).gets_FIXED_LT());
		}
		return size;
	}
	public int setL2L_s_PROP_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_PROP_LT == null) {
			l_s_PROP_LT = new ArrayList();
		} else {
			l_s_PROP_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_PROP_LT.add(((AG0030010Struct) list.get(i)).gets_PROP_LT());
		}
		return size;
	}
	public int setL2L_s_SAFETY_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_SAFETY_LT == null) {
			l_s_SAFETY_LT = new ArrayList();
		} else {
			l_s_SAFETY_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_SAFETY_LT.add(((AG0030010Struct) list.get(i)).gets_SAFETY_LT());
		}
		return size;
	}
	public int setL2L_s_ISSUE_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_ISSUE_LT == null) {
			l_s_ISSUE_LT = new ArrayList();
		} else {
			l_s_ISSUE_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_ISSUE_LT.add(((AG0030010Struct) list.get(i)).gets_ISSUE_LT());
		}
		return size;
	}
	public int setL2L_s_PROP_LOT_SIZE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_PROP_LOT_SIZE == null) {
			l_s_PROP_LOT_SIZE = new ArrayList();
		} else {
			l_s_PROP_LOT_SIZE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_PROP_LOT_SIZE.add(((AG0030010Struct) list.get(i)).gets_PROP_LOT_SIZE());
		}
		return size;
	}
	public int setL2L_s_DUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_DUE_DATE == null) {
			l_s_DUE_DATE = new ArrayList();
		} else {
			l_s_DUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_DUE_DATE.add(((AG0030010Struct) list.get(i)).gets_DUE_DATE());
		}
		return size;
	}
	public int setL2L_s_PRD_DUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_PRD_DUE_DATE == null) {
			l_s_PRD_DUE_DATE = new ArrayList();
		} else {
			l_s_PRD_DUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_PRD_DUE_DATE.add(((AG0030010Struct) list.get(i)).gets_PRD_DUE_DATE());
		}
		return size;
	}
	public int setL2L_s_PRD_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_PRD_START_DATE == null) {
			l_s_PRD_START_DATE = new ArrayList();
		} else {
			l_s_PRD_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_PRD_START_DATE.add(((AG0030010Struct) list.get(i)).gets_PRD_START_DATE());
		}
		return size;
	}
	public int setL2L_s_ODR_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_ODR_START_DATE == null) {
			l_s_ODR_START_DATE = new ArrayList();
		} else {
			l_s_ODR_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_ODR_START_DATE.add(((AG0030010Struct) list.get(i)).gets_ODR_START_DATE());
		}
		return size;
	}
	public int setL2L_s_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_ODR_QTY == null) {
			l_s_ODR_QTY = new ArrayList();
		} else {
			l_s_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_ODR_QTY.add(((AG0030010Struct) list.get(i)).gets_ODR_QTY());
		}
		return size;
	}
	public int setL2L_s_ISSUE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_ISSUE_TYP == null) {
			l_s_ISSUE_TYP = new ArrayList();
		} else {
			l_s_ISSUE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_ISSUE_TYP.add(((AG0030010Struct) list.get(i)).gets_ISSUE_TYP());
		}
		return size;
	}
	public int setL2L_s_MAX_DISPLAY_MONTH_STOCK(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_MAX_DISPLAY_MONTH_STOCK == null) {
			l_s_MAX_DISPLAY_MONTH_STOCK = new ArrayList();
		} else {
			l_s_MAX_DISPLAY_MONTH_STOCK.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_MAX_DISPLAY_MONTH_STOCK.add(((AG0030010Struct) list.get(i)).gets_MAX_DISPLAY_MONTH_STOCK());
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
			l_PLANT_NAME.add(((AG0030010Struct) list.get(i)).getPLANT_NAME());
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
			l_ITEM_NAME.add(((AG0030010Struct) list.get(i)).getITEM_NAME());
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
			l_DRAW_CD.add(((AG0030010Struct) list.get(i)).getDRAW_CD());
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
			l_SPEC.add(((AG0030010Struct) list.get(i)).getSPEC());
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
			l_MRP_ODR_TYP.add(((AG0030010Struct) list.get(i)).getMRP_ODR_TYP());
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
			l_OUTSIDE_TYP.add(((AG0030010Struct) list.get(i)).getOUTSIDE_TYP());
		}
		return size;
	}
	public int setL2L_ITEM_SPOIL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_SPOIL == null) {
			l_ITEM_SPOIL = new ArrayList();
		} else {
			l_ITEM_SPOIL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_SPOIL.add(((AG0030010Struct) list.get(i)).getITEM_SPOIL());
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
			l_UNIT_QTY_TYP.add(((AG0030010Struct) list.get(i)).getUNIT_QTY_TYP());
		}
		return size;
	}
	public int setL2L_LOT_SIZING_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOT_SIZING_TYP == null) {
			l_LOT_SIZING_TYP = new ArrayList();
		} else {
			l_LOT_SIZING_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOT_SIZING_TYP.add(((AG0030010Struct) list.get(i)).getLOT_SIZING_TYP());
		}
		return size;
	}
	public int setL2L_MAX_PERIOD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MAX_PERIOD == null) {
			l_MAX_PERIOD = new ArrayList();
		} else {
			l_MAX_PERIOD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MAX_PERIOD.add(((AG0030010Struct) list.get(i)).getMAX_PERIOD());
		}
		return size;
	}
	public int setL2L_MUL_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MUL_ODR_QTY == null) {
			l_MUL_ODR_QTY = new ArrayList();
		} else {
			l_MUL_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MUL_ODR_QTY.add(((AG0030010Struct) list.get(i)).getMUL_ODR_QTY());
		}
		return size;
	}
	public int setL2L_MAX_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MAX_ODR_QTY == null) {
			l_MAX_ODR_QTY = new ArrayList();
		} else {
			l_MAX_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MAX_ODR_QTY.add(((AG0030010Struct) list.get(i)).getMAX_ODR_QTY());
		}
		return size;
	}
	public int setL2L_MIN_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MIN_ODR_QTY == null) {
			l_MIN_ODR_QTY = new ArrayList();
		} else {
			l_MIN_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MIN_ODR_QTY.add(((AG0030010Struct) list.get(i)).getMIN_ODR_QTY());
		}
		return size;
	}
	public int setL2L_SAFETY_STOCK(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SAFETY_STOCK == null) {
			l_SAFETY_STOCK = new ArrayList();
		} else {
			l_SAFETY_STOCK.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SAFETY_STOCK.add(((AG0030010Struct) list.get(i)).getSAFETY_STOCK());
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
			l_STOCK_UNIT.add(((AG0030010Struct) list.get(i)).getSTOCK_UNIT());
		}
		return size;
	}
	public int setL2L_w_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_PLANT_CD == null) {
			l_w_PLANT_CD = new ArrayList();
		} else {
			l_w_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_PLANT_CD.add(((AG0030010Struct) list.get(i)).getw_PLANT_CD());
		}
		return size;
	}
	public int setL2L_w_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_ITEM_CD == null) {
			l_w_ITEM_CD = new ArrayList();
		} else {
			l_w_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_ITEM_CD.add(((AG0030010Struct) list.get(i)).getw_ITEM_CD());
		}
		return size;
	}
	public int setL2L_STOCK_ON_HAND_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_ON_HAND_QTY == null) {
			l_STOCK_ON_HAND_QTY = new ArrayList();
		} else {
			l_STOCK_ON_HAND_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_ON_HAND_QTY.add(((AG0030010Struct) list.get(i)).getSTOCK_ON_HAND_QTY());
		}
		return size;
	}
	public int setL2L_dummy(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_dummy == null) {
			l_dummy = new ArrayList();
		} else {
			l_dummy.clear();
		}
		for (int i = 0; i < size; i++) {
			l_dummy.add(((AG0030010Struct) list.get(i)).getdummy());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_w_date_from = null;
		m_w_date_to = null;
		m_MRP_ODR_NAME = null;
		m_OUTSIDE_NAME = null;
		m_UNIT_QTY_NAME = null;
		m_LOT_SIZING_NAME = null;
		m_PlanDate = null;
		m_FixDemand = null;
		m_PlanDemand = null;
		m_FixOrder = null;
		m_OldPlanOrder = null;
		m_ValidStock = null;
		m_STOCK_UNIT_1 = null;
		m_STOCK_UNIT_2 = null;
		m_STOCK_UNIT_3 = null;
		m_STOCK_UNIT_4 = null;
		m_s_BUSINESS_OPR_DATE = null;
		m_s_MIN_CAL_DATE = null;
		m_s_MAX_CAL_DATE = null;
		m_s_OD_NO = null;
		m_s_PLAN_SPAN = null;
		m_s_PRD_PLAN_PERIOD_TYP = null;
		m_s_PRD_PLAN_FINAL_DAY_TYP = null;
		m_s_ODR_LT = null;
		m_s_FIXED_LT = null;
		m_s_PROP_LT = null;
		m_s_SAFETY_LT = null;
		m_s_ISSUE_LT = null;
		m_s_PROP_LOT_SIZE = null;
		m_s_DUE_DATE = null;
		m_s_PRD_DUE_DATE = null;
		m_s_PRD_START_DATE = null;
		m_s_ODR_START_DATE = null;
		m_s_ODR_QTY = null;
		m_s_ISSUE_TYP = null;
		m_s_MAX_DISPLAY_MONTH_STOCK = null;
		m_PLANT_NAME = null;
		m_ITEM_NAME = null;
		m_DRAW_CD = null;
		m_SPEC = null;
		m_MRP_ODR_TYP = null;
		m_OUTSIDE_TYP = null;
		m_ITEM_SPOIL = null;
		m_UNIT_QTY_TYP = null;
		m_LOT_SIZING_TYP = null;
		m_MAX_PERIOD = null;
		m_MUL_ODR_QTY = null;
		m_MAX_ODR_QTY = null;
		m_MIN_ODR_QTY = null;
		m_SAFETY_STOCK = null;
		m_STOCK_UNIT = null;
		m_w_PLANT_CD = null;
		m_w_ITEM_CD = null;
		m_STOCK_ON_HAND_QTY = null;
		m_dummy = null;

		l_w_date_from = null;
		l_w_date_to = null;
		l_MRP_ODR_NAME = null;
		l_OUTSIDE_NAME = null;
		l_UNIT_QTY_NAME = null;
		l_LOT_SIZING_NAME = null;
		l_PlanDate = null;
		l_FixDemand = null;
		l_PlanDemand = null;
		l_FixOrder = null;
		l_OldPlanOrder = null;
		l_ValidStock = null;
		l_STOCK_UNIT_1 = null;
		l_STOCK_UNIT_2 = null;
		l_STOCK_UNIT_3 = null;
		l_STOCK_UNIT_4 = null;
		l_s_BUSINESS_OPR_DATE = null;
		l_s_MIN_CAL_DATE = null;
		l_s_MAX_CAL_DATE = null;
		l_s_OD_NO = null;
		l_s_PLAN_SPAN = null;
		l_s_PRD_PLAN_PERIOD_TYP = null;
		l_s_PRD_PLAN_FINAL_DAY_TYP = null;
		l_s_ODR_LT = null;
		l_s_FIXED_LT = null;
		l_s_PROP_LT = null;
		l_s_SAFETY_LT = null;
		l_s_ISSUE_LT = null;
		l_s_PROP_LOT_SIZE = null;
		l_s_DUE_DATE = null;
		l_s_PRD_DUE_DATE = null;
		l_s_PRD_START_DATE = null;
		l_s_ODR_START_DATE = null;
		l_s_ODR_QTY = null;
		l_s_ISSUE_TYP = null;
		l_s_MAX_DISPLAY_MONTH_STOCK = null;
		l_PLANT_NAME = null;
		l_ITEM_NAME = null;
		l_DRAW_CD = null;
		l_SPEC = null;
		l_MRP_ODR_TYP = null;
		l_OUTSIDE_TYP = null;
		l_ITEM_SPOIL = null;
		l_UNIT_QTY_TYP = null;
		l_LOT_SIZING_TYP = null;
		l_MAX_PERIOD = null;
		l_MUL_ODR_QTY = null;
		l_MAX_ODR_QTY = null;
		l_MIN_ODR_QTY = null;
		l_SAFETY_STOCK = null;
		l_STOCK_UNIT = null;
		l_w_PLANT_CD = null;
		l_w_ITEM_CD = null;
		l_STOCK_ON_HAND_QTY = null;
		l_dummy = null;

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
	 * medAG0030010クラスの標準コンストラクタ
	 */
	public AG0030010Struct()
	{
		//{{user_implement_code_constractor
                //------------------------------------------------------------------------------
                clear();
                //------------------------------------------------------------------------------
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
	public void setStruct(AG0030010Struct struct)
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
	public void setStructM(AG0030010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setw_date_from(struct.getw_date_from());
			this.setw_date_to(struct.getw_date_to());
			this.setMRP_ODR_NAME(struct.getMRP_ODR_NAME());
			this.setOUTSIDE_NAME(struct.getOUTSIDE_NAME());
			this.setUNIT_QTY_NAME(struct.getUNIT_QTY_NAME());
			this.setLOT_SIZING_NAME(struct.getLOT_SIZING_NAME());
			this.setPlanDate(struct.getPlanDate());
			this.setFixDemand(struct.getFixDemand());
			this.setPlanDemand(struct.getPlanDemand());
			this.setFixOrder(struct.getFixOrder());
			this.setOldPlanOrder(struct.getOldPlanOrder());
			this.setValidStock(struct.getValidStock());
			this.setSTOCK_UNIT_1(struct.getSTOCK_UNIT_1());
			this.setSTOCK_UNIT_2(struct.getSTOCK_UNIT_2());
			this.setSTOCK_UNIT_3(struct.getSTOCK_UNIT_3());
			this.setSTOCK_UNIT_4(struct.getSTOCK_UNIT_4());
			this.sets_BUSINESS_OPR_DATE(struct.gets_BUSINESS_OPR_DATE());
			this.sets_MIN_CAL_DATE(struct.gets_MIN_CAL_DATE());
			this.sets_MAX_CAL_DATE(struct.gets_MAX_CAL_DATE());
			this.sets_OD_NO(struct.gets_OD_NO());
			this.sets_PLAN_SPAN(struct.gets_PLAN_SPAN());
			this.sets_PRD_PLAN_PERIOD_TYP(struct.gets_PRD_PLAN_PERIOD_TYP());
			this.sets_PRD_PLAN_FINAL_DAY_TYP(struct.gets_PRD_PLAN_FINAL_DAY_TYP());
			this.sets_ODR_LT(struct.gets_ODR_LT());
			this.sets_FIXED_LT(struct.gets_FIXED_LT());
			this.sets_PROP_LT(struct.gets_PROP_LT());
			this.sets_SAFETY_LT(struct.gets_SAFETY_LT());
			this.sets_ISSUE_LT(struct.gets_ISSUE_LT());
			this.sets_PROP_LOT_SIZE(struct.gets_PROP_LOT_SIZE());
			this.sets_DUE_DATE(struct.gets_DUE_DATE());
			this.sets_PRD_DUE_DATE(struct.gets_PRD_DUE_DATE());
			this.sets_PRD_START_DATE(struct.gets_PRD_START_DATE());
			this.sets_ODR_START_DATE(struct.gets_ODR_START_DATE());
			this.sets_ODR_QTY(struct.gets_ODR_QTY());
			this.sets_ISSUE_TYP(struct.gets_ISSUE_TYP());
			this.sets_MAX_DISPLAY_MONTH_STOCK(struct.gets_MAX_DISPLAY_MONTH_STOCK());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setDRAW_CD(struct.getDRAW_CD());
			this.setSPEC(struct.getSPEC());
			this.setMRP_ODR_TYP(struct.getMRP_ODR_TYP());
			this.setOUTSIDE_TYP(struct.getOUTSIDE_TYP());
			this.setITEM_SPOIL(struct.getITEM_SPOIL());
			this.setUNIT_QTY_TYP(struct.getUNIT_QTY_TYP());
			this.setLOT_SIZING_TYP(struct.getLOT_SIZING_TYP());
			this.setMAX_PERIOD(struct.getMAX_PERIOD());
			this.setMUL_ODR_QTY(struct.getMUL_ODR_QTY());
			this.setMAX_ODR_QTY(struct.getMAX_ODR_QTY());
			this.setMIN_ODR_QTY(struct.getMIN_ODR_QTY());
			this.setSAFETY_STOCK(struct.getSAFETY_STOCK());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setw_PLANT_CD(struct.getw_PLANT_CD());
			this.setw_ITEM_CD(struct.getw_ITEM_CD());
			this.setSTOCK_ON_HAND_QTY(struct.getSTOCK_ON_HAND_QTY());
			this.setdummy(struct.getdummy());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AG0030010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_w_date_from(struct.getList_w_date_from());
			this.setList_w_date_to(struct.getList_w_date_to());
			this.setList_MRP_ODR_NAME(struct.getList_MRP_ODR_NAME());
			this.setList_OUTSIDE_NAME(struct.getList_OUTSIDE_NAME());
			this.setList_UNIT_QTY_NAME(struct.getList_UNIT_QTY_NAME());
			this.setList_LOT_SIZING_NAME(struct.getList_LOT_SIZING_NAME());
			this.setList_PlanDate(struct.getList_PlanDate());
			this.setList_FixDemand(struct.getList_FixDemand());
			this.setList_PlanDemand(struct.getList_PlanDemand());
			this.setList_FixOrder(struct.getList_FixOrder());
			this.setList_OldPlanOrder(struct.getList_OldPlanOrder());
			this.setList_ValidStock(struct.getList_ValidStock());
			this.setList_STOCK_UNIT_1(struct.getList_STOCK_UNIT_1());
			this.setList_STOCK_UNIT_2(struct.getList_STOCK_UNIT_2());
			this.setList_STOCK_UNIT_3(struct.getList_STOCK_UNIT_3());
			this.setList_STOCK_UNIT_4(struct.getList_STOCK_UNIT_4());
			this.setList_s_BUSINESS_OPR_DATE(struct.getList_s_BUSINESS_OPR_DATE());
			this.setList_s_MIN_CAL_DATE(struct.getList_s_MIN_CAL_DATE());
			this.setList_s_MAX_CAL_DATE(struct.getList_s_MAX_CAL_DATE());
			this.setList_s_OD_NO(struct.getList_s_OD_NO());
			this.setList_s_PLAN_SPAN(struct.getList_s_PLAN_SPAN());
			this.setList_s_PRD_PLAN_PERIOD_TYP(struct.getList_s_PRD_PLAN_PERIOD_TYP());
			this.setList_s_PRD_PLAN_FINAL_DAY_TYP(struct.getList_s_PRD_PLAN_FINAL_DAY_TYP());
			this.setList_s_ODR_LT(struct.getList_s_ODR_LT());
			this.setList_s_FIXED_LT(struct.getList_s_FIXED_LT());
			this.setList_s_PROP_LT(struct.getList_s_PROP_LT());
			this.setList_s_SAFETY_LT(struct.getList_s_SAFETY_LT());
			this.setList_s_ISSUE_LT(struct.getList_s_ISSUE_LT());
			this.setList_s_PROP_LOT_SIZE(struct.getList_s_PROP_LOT_SIZE());
			this.setList_s_DUE_DATE(struct.getList_s_DUE_DATE());
			this.setList_s_PRD_DUE_DATE(struct.getList_s_PRD_DUE_DATE());
			this.setList_s_PRD_START_DATE(struct.getList_s_PRD_START_DATE());
			this.setList_s_ODR_START_DATE(struct.getList_s_ODR_START_DATE());
			this.setList_s_ODR_QTY(struct.getList_s_ODR_QTY());
			this.setList_s_ISSUE_TYP(struct.getList_s_ISSUE_TYP());
			this.setList_s_MAX_DISPLAY_MONTH_STOCK(struct.getList_s_MAX_DISPLAY_MONTH_STOCK());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_DRAW_CD(struct.getList_DRAW_CD());
			this.setList_SPEC(struct.getList_SPEC());
			this.setList_MRP_ODR_TYP(struct.getList_MRP_ODR_TYP());
			this.setList_OUTSIDE_TYP(struct.getList_OUTSIDE_TYP());
			this.setList_ITEM_SPOIL(struct.getList_ITEM_SPOIL());
			this.setList_UNIT_QTY_TYP(struct.getList_UNIT_QTY_TYP());
			this.setList_LOT_SIZING_TYP(struct.getList_LOT_SIZING_TYP());
			this.setList_MAX_PERIOD(struct.getList_MAX_PERIOD());
			this.setList_MUL_ODR_QTY(struct.getList_MUL_ODR_QTY());
			this.setList_MAX_ODR_QTY(struct.getList_MAX_ODR_QTY());
			this.setList_MIN_ODR_QTY(struct.getList_MIN_ODR_QTY());
			this.setList_SAFETY_STOCK(struct.getList_SAFETY_STOCK());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_w_PLANT_CD(struct.getList_w_PLANT_CD());
			this.setList_w_ITEM_CD(struct.getList_w_ITEM_CD());
			this.setList_STOCK_ON_HAND_QTY(struct.getList_STOCK_ON_HAND_QTY());
			this.setList_dummy(struct.getList_dummy());
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
	// 第 1 変数初期値： i_w_date_from


	final static String i_w_date_from = null;

	// 第 2 変数初期値： i_w_date_to


	final static String i_w_date_to = null;

	// 第 3 変数初期値： i_MRP_ODR_NAME


	final static String i_MRP_ODR_NAME = null;

	// 第 4 変数初期値： i_OUTSIDE_NAME


	final static String i_OUTSIDE_NAME = null;

	// 第 5 変数初期値： i_UNIT_QTY_NAME


	final static String i_UNIT_QTY_NAME = null;

	// 第 6 変数初期値： i_LOT_SIZING_NAME


	final static String i_LOT_SIZING_NAME = null;

	// 第 7 変数初期値： i_PlanDate


	final static String i_PlanDate = null;

	// 第 8 変数初期値： i_FixDemand


	final static String i_FixDemand = null;

	// 第 9 変数初期値： i_PlanDemand


	final static String i_PlanDemand = null;

	// 第 10 変数初期値： i_FixOrder


	final static String i_FixOrder = null;

	// 第 11 変数初期値： i_OldPlanOrder


	final static String i_OldPlanOrder = null;

	// 第 12 変数初期値： i_ValidStock


	final static String i_ValidStock = null;

	// 第 13 変数初期値： i_STOCK_UNIT_1


	final static String i_STOCK_UNIT_1 = null;

	// 第 14 変数初期値： i_STOCK_UNIT_2


	final static String i_STOCK_UNIT_2 = null;

	// 第 15 変数初期値： i_STOCK_UNIT_3


	final static String i_STOCK_UNIT_3 = null;

	// 第 16 変数初期値： i_STOCK_UNIT_4


	final static String i_STOCK_UNIT_4 = null;

	// 第 17 変数初期値： i_s_BUSINESS_OPR_DATE


	final static String i_s_BUSINESS_OPR_DATE = null;

	// 第 18 変数初期値： i_s_MIN_CAL_DATE


	final static String i_s_MIN_CAL_DATE = null;

	// 第 19 変数初期値： i_s_MAX_CAL_DATE


	final static String i_s_MAX_CAL_DATE = null;

	// 第 20 変数初期値： i_s_OD_NO


	final static String i_s_OD_NO = null;

	// 第 21 変数初期値： i_s_PLAN_SPAN


	final static String i_s_PLAN_SPAN = null;

	// 第 22 変数初期値： i_s_PRD_PLAN_PERIOD_TYP


	final static String i_s_PRD_PLAN_PERIOD_TYP = null;

	// 第 23 変数初期値： i_s_PRD_PLAN_FINAL_DAY_TYP


	final static String i_s_PRD_PLAN_FINAL_DAY_TYP = null;

	// 第 24 変数初期値： i_s_ODR_LT


	final static String i_s_ODR_LT = null;

	// 第 25 変数初期値： i_s_FIXED_LT


	final static String i_s_FIXED_LT = null;

	// 第 26 変数初期値： i_s_PROP_LT


	final static String i_s_PROP_LT = null;

	// 第 27 変数初期値： i_s_SAFETY_LT


	final static String i_s_SAFETY_LT = null;

	// 第 28 変数初期値： i_s_ISSUE_LT


	final static String i_s_ISSUE_LT = null;

	// 第 29 変数初期値： i_s_PROP_LOT_SIZE


	final static String i_s_PROP_LOT_SIZE = null;

	// 第 30 変数初期値： i_s_DUE_DATE


	final static String i_s_DUE_DATE = null;

	// 第 31 変数初期値： i_s_PRD_DUE_DATE


	final static String i_s_PRD_DUE_DATE = null;

	// 第 32 変数初期値： i_s_PRD_START_DATE


	final static String i_s_PRD_START_DATE = null;

	// 第 33 変数初期値： i_s_ODR_START_DATE


	final static String i_s_ODR_START_DATE = null;

	// 第 34 変数初期値： i_s_ODR_QTY


	final static String i_s_ODR_QTY = null;

	// 第 35 変数初期値： i_s_ISSUE_TYP


	final static String i_s_ISSUE_TYP = null;

	// 第 36 変数初期値： i_s_MAX_DISPLAY_MONTH_STOCK


	final static String i_s_MAX_DISPLAY_MONTH_STOCK = null;

	// 第 37 変数初期値： i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// 第 38 変数初期値： i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// 第 39 変数初期値： i_DRAW_CD


	final static String i_DRAW_CD = null;

	// 第 40 変数初期値： i_SPEC


	final static String i_SPEC = null;

	// 第 41 変数初期値： i_MRP_ODR_TYP


	final static String i_MRP_ODR_TYP = null;

	// 第 42 変数初期値： i_OUTSIDE_TYP


	final static String i_OUTSIDE_TYP = null;

	// 第 43 変数初期値： i_ITEM_SPOIL


	final static String i_ITEM_SPOIL = null;

	// 第 44 変数初期値： i_UNIT_QTY_TYP


	final static String i_UNIT_QTY_TYP = null;

	// 第 45 変数初期値： i_LOT_SIZING_TYP


	final static String i_LOT_SIZING_TYP = null;

	// 第 46 変数初期値： i_MAX_PERIOD


	final static String i_MAX_PERIOD = null;

	// 第 47 変数初期値： i_MUL_ODR_QTY


	final static String i_MUL_ODR_QTY = null;

	// 第 48 変数初期値： i_MAX_ODR_QTY


	final static String i_MAX_ODR_QTY = null;

	// 第 49 変数初期値： i_MIN_ODR_QTY


	final static String i_MIN_ODR_QTY = null;

	// 第 50 変数初期値： i_SAFETY_STOCK


	final static String i_SAFETY_STOCK = null;

	// 第 51 変数初期値： i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// 第 52 変数初期値： i_w_PLANT_CD


	final static String i_w_PLANT_CD = null;

	// 第 53 変数初期値： i_w_ITEM_CD


	final static String i_w_ITEM_CD = null;

	// 第 54 変数初期値： i_STOCK_ON_HAND_QTY


	final static String i_STOCK_ON_HAND_QTY = null;

	// 第 55 変数初期値： i_dummy


	final static String i_dummy = null;

*/

	//{{user_implement_code
       //------------------------------------------------------------------------------
        // 休日フラグ
        private boolean _isHoliday = false;
        public boolean isHoliday(){ return _isHoliday; }
       
        /*
         * 過去分の在庫情報の取り込み<br>
         * 在庫で使用する情報以外はクリアしない
         * @param mrp 在庫情報
         */
        public void importPastStock(MrpData stock, String locale)
        {
         if(stock == null){
          m_PlanDate = "";
          m_FixDemand = "0.0";
          m_PlanDemand = "0.0";
          m_FixOrder = "0.0";
          m_OldPlanOrder = "0.0";
          m_ValidStock = "0.0";
          _isHoliday = false;
          return;
         }
         m_ValidStock = stock.getStock();
         _isHoliday = false;
       
         // 日付文字列には辞書から「過去」文字列を設定
         m_PlanDate = null;
         if(locale != null){
          ResourceBundle rb = CoreTools.getResourceBundle(AG0030Const.C_DICNAME,locale);
          m_PlanDate = CoreTools.getRBString(AG0030Const.C_KEYWORD_PAST,rb);
         }
         return;
        }
        /*
         * 在庫情報の取り込み<br>
         * 在庫で使用する情報以外はクリアしない
         * @param mrp 在庫情報
         */
        public void importStock(MrpData stock)
        {
         if(stock == null){
          m_PlanDate = "";
          m_FixDemand = "0.0";
          m_PlanDemand = "0.0";
          m_FixOrder = "0.0";
          m_OldPlanOrder = "0.0";
          m_ValidStock = "0.0";
          _isHoliday = false;
          return;
         }
         m_PlanDate = stock.getPlanDate();
         m_FixDemand = stock.getFixDemand();
         m_PlanDemand = stock.getPlanDemand();
         m_FixOrder = stock.getFixOrder();
         m_OldPlanOrder = stock.getPlanOrder();
         m_ValidStock = stock.getStock();
         _isHoliday = stock.getHoliday();
         return;
        }
       
        /*
         * コピー
        */
        public void copy(AG0030010Struct struct)
        {
         if(struct.m_PLANT_NAME != null)					{m_PLANT_NAME					=	new String(struct.m_PLANT_NAME);				}
         else											{m_PLANT_NAME					=	null;											}
         if(struct.m_ITEM_NAME != null)					{m_ITEM_NAME					=	new String(struct.m_ITEM_NAME);					}
         else											{m_ITEM_NAME					=	null;											}
         if(struct.m_DRAW_CD != null)					{m_DRAW_CD						=	new String(struct.m_DRAW_CD);					}
         else											{m_DRAW_CD						=	null;											}
         if(struct.m_SPEC != null)						{m_SPEC							=	new String(struct.m_SPEC);						}
         else											{m_SPEC							=	null;											}
         if(struct.m_MRP_ODR_TYP != null)				{m_MRP_ODR_TYP					=	new String(struct.m_MRP_ODR_TYP);				}
         else											{m_MRP_ODR_TYP					=	null;											}
         if(struct.m_OUTSIDE_TYP != null)				{m_OUTSIDE_TYP					=	new String(struct.m_OUTSIDE_TYP);				}
         else											{m_OUTSIDE_TYP					=	null;											}
         if(struct.m_ITEM_SPOIL != null)					{m_ITEM_SPOIL					=	new String(struct.m_ITEM_SPOIL);				}
         else											{m_ITEM_SPOIL					=	null;											}
         if(struct.m_UNIT_QTY_TYP != null)				{m_UNIT_QTY_TYP					=	new String(struct.m_UNIT_QTY_TYP);				}
         else											{m_UNIT_QTY_TYP					=	null;											}
         if(struct.m_LOT_SIZING_TYP != null)				{m_LOT_SIZING_TYP				=	new String(struct.m_LOT_SIZING_TYP);			}
         else											{m_LOT_SIZING_TYP				=	null;											}
         if(struct.m_MAX_PERIOD != null)					{m_MAX_PERIOD					=	new String(struct.m_MAX_PERIOD);				}
         else											{m_MAX_PERIOD					=	null;											}
         if(struct.m_MUL_ODR_QTY != null)				{m_MUL_ODR_QTY					=	new String(struct.m_MUL_ODR_QTY);				}
         else											{m_MUL_ODR_QTY					=	null;											}
         if(struct.m_MAX_ODR_QTY != null)				{m_MAX_ODR_QTY					=	new String(struct.m_MAX_ODR_QTY);				}
         else											{m_MAX_ODR_QTY					=	null;											}
         if(struct.m_MIN_ODR_QTY != null)				{m_MIN_ODR_QTY					=	new String(struct.m_MIN_ODR_QTY);				}
         else											{m_MIN_ODR_QTY					=	null;											}
         if(struct.m_SAFETY_STOCK != null)				{m_SAFETY_STOCK					=	new String(struct.m_SAFETY_STOCK);				}
         else											{m_SAFETY_STOCK					=	null;											}
         if(struct.m_s_ODR_LT != null)					{m_s_ODR_LT						=	new String(struct.m_s_ODR_LT);					}
         else											{m_s_ODR_LT						=	null;											}
         if(struct.m_s_FIXED_LT != null)					{m_s_FIXED_LT					=	new String(struct.m_s_FIXED_LT);				}
         else											{m_s_FIXED_LT					=	null;											}
         if(struct.m_s_PROP_LT != null)					{m_s_PROP_LT					=	new String(struct.m_s_PROP_LT);					}
         else											{m_s_PROP_LT					=	null;											}
         if(struct.m_s_SAFETY_LT != null)				{m_s_SAFETY_LT					=	new String(struct.m_s_SAFETY_LT);				}
         else											{m_s_SAFETY_LT					=	null;											}
         if(struct.m_s_PROP_LOT_SIZE != null)			{m_s_PROP_LOT_SIZE				=	new String(struct.m_s_PROP_LOT_SIZE);			}
         else											{m_s_PROP_LOT_SIZE				=	null;											}
         if(struct.m_s_ISSUE_TYP != null)				{m_s_ISSUE_TYP					=	new String(struct.m_s_ISSUE_TYP);				}
         else											{m_s_ISSUE_TYP					=	null;											}
         if(struct.m_s_ISSUE_LT != null)					{m_s_ISSUE_LT					=	new String(struct.m_s_ISSUE_LT);				}
         else											{m_s_ISSUE_LT					=	null;											}
         if(struct.m_w_PLANT_CD != null)					{m_w_PLANT_CD					=	new String(struct.m_w_PLANT_CD);				}
         else											{m_w_PLANT_CD					=	null;											}
         if(struct.m_w_ITEM_CD != null)					{m_w_ITEM_CD					=	new String(struct.m_w_ITEM_CD);					}
         else											{m_w_ITEM_CD					=	null;											}
         if(struct.m_STOCK_ON_HAND_QTY != null)			{m_STOCK_ON_HAND_QTY			=	new String(struct.m_STOCK_ON_HAND_QTY);			}
         else											{m_STOCK_ON_HAND_QTY			=	null;											}
         if(struct.m_dummy != null)						{m_dummy						=	new String(struct.m_dummy);						}
         else											{m_dummy						=	null;											}
         if(struct.m_s_BUSINESS_OPR_DATE != null)		{m_s_BUSINESS_OPR_DATE			=	new String(struct.m_s_BUSINESS_OPR_DATE);		}
         else											{m_s_BUSINESS_OPR_DATE			=	null;											}
         if(struct.m_s_MIN_CAL_DATE != null)				{m_s_MIN_CAL_DATE				=	new String(struct.m_s_MIN_CAL_DATE);			}
         else											{m_s_MIN_CAL_DATE				=	null;											}
         if(struct.m_s_MAX_CAL_DATE != null)				{m_s_MAX_CAL_DATE				=	new String(struct.m_s_MAX_CAL_DATE);			}
         else											{m_s_MAX_CAL_DATE				=	null;											}
         if(struct.m_s_DUE_DATE != null)					{m_s_DUE_DATE					=	new String(struct.m_s_DUE_DATE);				}
         else											{m_s_DUE_DATE					=	null;											}
         if(struct.m_s_OD_NO != null)					{m_s_OD_NO						=	new String(struct.m_s_OD_NO);					}
         else											{m_s_OD_NO						=	null;											}
         if(struct.m_s_PRD_DUE_DATE != null)				{m_s_PRD_DUE_DATE				=	new String(struct.m_s_PRD_DUE_DATE);			}
         else											{m_s_PRD_DUE_DATE				=	null;											}
         if(struct.m_s_PRD_START_DATE != null)			{m_s_PRD_START_DATE				=	new String(struct.m_s_PRD_START_DATE);			}
         else											{m_s_PRD_START_DATE				=	null;											}
         if(struct.m_s_ODR_START_DATE != null)			{m_s_ODR_START_DATE				=	new String(struct.m_s_ODR_START_DATE);			}
         else											{m_s_ODR_START_DATE				=	null;											}
         if(struct.m_s_ODR_QTY != null)					{m_s_ODR_QTY					=	new String(struct.m_s_ODR_QTY);					}
         else											{m_s_ODR_QTY					=	null;											}
         if(struct.m_s_PLAN_SPAN != null)				{m_s_PLAN_SPAN					=	new String(struct.m_s_PLAN_SPAN);				}
         else											{m_s_PLAN_SPAN					=	null;											}
         if(struct.m_s_PRD_PLAN_PERIOD_TYP != null)		{m_s_PRD_PLAN_PERIOD_TYP		=	new String(struct.m_s_PRD_PLAN_PERIOD_TYP);		}
         else											{m_s_PRD_PLAN_PERIOD_TYP		=	null;											}
         if(struct.m_s_PRD_PLAN_FINAL_DAY_TYP != null)	{m_s_PRD_PLAN_FINAL_DAY_TYP		=	new String(struct.m_s_PRD_PLAN_FINAL_DAY_TYP);	}
         else											{m_s_PRD_PLAN_FINAL_DAY_TYP		=	null;											}
         if(struct.m_w_date_from != null)				{m_w_date_from					=	new String(struct.m_w_date_from);				}
         else											{m_w_date_from					=	null;											}
         if(struct.m_w_date_to != null)					{m_w_date_to					=	new String(struct.m_w_date_to);					}
         else											{m_w_date_to					=	null;											}
         if(struct.m_MRP_ODR_NAME != null) m_MRP_ODR_NAME = new String(struct.m_MRP_ODR_NAME);
         if(struct.m_OUTSIDE_NAME != null) m_OUTSIDE_NAME = new String(struct.m_OUTSIDE_NAME);
         if(struct.m_UNIT_QTY_NAME != null) m_UNIT_QTY_NAME = new String(struct.m_UNIT_QTY_NAME);
         if(struct.m_LOT_SIZING_NAME != null) m_LOT_SIZING_NAME = new String(struct.m_LOT_SIZING_NAME);
         if(struct.m_STOCK_UNIT != null)					{m_STOCK_UNIT					=	new String(struct.m_STOCK_UNIT);					}
         else											{m_STOCK_UNIT					=	null;											}
         if(struct.m_STOCK_UNIT_1 != null)				{m_STOCK_UNIT_1					=	new String(struct.m_STOCK_UNIT_1);					}
         else											{m_STOCK_UNIT_1					=	null;											}
         if(struct.m_STOCK_UNIT_2 != null)				{m_STOCK_UNIT_2					=	new String(struct.m_STOCK_UNIT_2);					}
         else											{m_STOCK_UNIT_2					=	null;											}
         if(struct.m_STOCK_UNIT_3 != null)				{m_STOCK_UNIT_3					=	new String(struct.m_STOCK_UNIT_3);					}
         else											{m_STOCK_UNIT_3					=	null;											}
         if(struct.m_STOCK_UNIT_4 != null)				{m_STOCK_UNIT_4					=	new String(struct.m_STOCK_UNIT_4);					}
         else											{m_STOCK_UNIT_4					=	null;											}
       
        }
       //------------------------------------------------------------------------------
        //}}user_implement_code

	//////////////////////////////

}
