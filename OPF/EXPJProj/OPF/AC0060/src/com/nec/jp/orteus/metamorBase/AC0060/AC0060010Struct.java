/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0060/src/com/nec/jp/orteus/metamorBase/AC0060/AC0060010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0060;

import com.nec.jp.orteus.xaf.wa.*;

import com.nec.jp.orteus.util.logging.*;

import java.lang.Number.*;
import java.lang.Float;
import java.util.*;
import java.sql.*;
import java.io.*;

//{{user_implement_code_import
import com.nec.jp.orteus.expj.util.MrpData;
import com.nec.jp.orteus.util.CoreTools;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AC0060010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_MRP_ODR_NAME */
	public String m_MRP_ODR_NAME = null;
	/** 第 2 変数： m_OUTSIDE_NAME */
	public String m_OUTSIDE_NAME = null;
	/** 第 3 変数： m_UNIT_QTY_NAME */
	public String m_UNIT_QTY_NAME = null;
	/** 第 4 変数： m_LOT_SIZING_NAME */
	public String m_LOT_SIZING_NAME = null;
	/** 第 5 変数： m_PlanDemand */
	public String m_PlanDemand = null;
	/** 第 6 変数： m_FixedDemand */
	public String m_FixedDemand = null;
	/** 第 7 変数： m_PlanOrder */
	public String m_PlanOrder = null;
	/** 第 8 変数： m_FixedOrder */
	public String m_FixedOrder = null;
	/** 第 9 変数： m_ValidStock */
	public String m_ValidStock = null;
	/** 第 10 変数： m_LowerDeploy */
	public String m_LowerDeploy = null;
	/** 第 11 変数： m_Expect */
	public String m_Expect = null;
	/** 第 12 変数： m_r_ODR_CHOICE */
	public String m_r_ODR_CHOICE = null;
	/** 第 13 変数： m_r_DM_CHOICE */
	public String m_r_DM_CHOICE = null;
	/** 第 14 変数： m_c_DELETE_FLG */
	public String m_c_DELETE_FLG = null;
	/** 第 15 変数： m_c_LowerDeploy */
	public String m_c_LowerDeploy = null;
	/** 第 16 変数： m_dispDM_QTY */
	public String m_dispDM_QTY = null;
	/** 第 17 変数： m_dispODR_QTY */
	public String m_dispODR_QTY = null;
	/** 第 18 変数： m_PlanTime */
	public String m_PlanTime = null;
	/** 第 19 変数： m_saveDM_QTY */
	public String m_saveDM_QTY = null;
	/** 第 20 変数： m_IsReleased */
	public String m_IsReleased = null;
	/** 第 21 変数： m_MRP_ODR_TYP */
	public String m_MRP_ODR_TYP = null;
	/** 第 22 変数： m_OUTSIDE_TYP */
	public String m_OUTSIDE_TYP = null;
	/** 第 23 変数： m_ISSUE_TYP */
	public String m_ISSUE_TYP = null;
	/** 第 24 変数： m_PROP_LOT_SIZE */
	public String m_PROP_LOT_SIZE = null;
	/** 第 25 変数： m_ODR_LT */
	public String m_ODR_LT = null;
	/** 第 26 変数： m_FIXED_LT */
	public String m_FIXED_LT = null;
	/** 第 27 変数： m_PROP_LT */
	public String m_PROP_LT = null;
	/** 第 28 変数： m_SAFETY_LT */
	public String m_SAFETY_LT = null;
	/** 第 29 変数： m_ISSUE_LT */
	public String m_ISSUE_LT = null;
	/** 第 30 変数： m_ODR_STS_TYP */
	public String m_ODR_STS_TYP = null;
	/** 第 31 変数： m_DM_STS_TYP */
	public String m_DM_STS_TYP = null;
	/** 第 32 変数： m_OD_TYP */
	public String m_OD_TYP = null;
	/** 第 33 変数： m_DUE_DATE */
	public java.util.Date m_DUE_DATE = null;
	/** 第 34 変数： m_ODR_START_DATE */
	public java.util.Date m_ODR_START_DATE = null;
	/** 第 35 変数： m_PRD_DUE_DATE */
	public java.util.Date m_PRD_DUE_DATE = null;
	/** 第 36 変数： m_PRD_START_DATE */
	public java.util.Date m_PRD_START_DATE = null;
	/** 第 37 変数： m_OD_NO */
	public String m_OD_NO = null;
	/** 第 38 変数： m_UNIT_QTY_TYP */
	public String m_UNIT_QTY_TYP = null;
	/** 第 39 変数： m_LOT_SIZING_TYP */
	public String m_LOT_SIZING_TYP = null;
	/** 第 40 変数： m_EXTERNAL_PLAN_CD */
	public String m_EXTERNAL_PLAN_CD = null;
	/** 第 41 変数： m_EXTERNAL_PLAN_EXP_TYP */
	public String m_EXTERNAL_PLAN_EXP_TYP = null;
	/** 第 42 変数： m_EXTERNAL_PLAN_DEL_FLG */
	public String m_EXTERNAL_PLAN_DEL_FLG = null;
	/** 第 43 変数： m_MIN_CAL_DATE */
	public String m_MIN_CAL_DATE = null;
	/** 第 44 変数： m_MAX_CAL_DATE */
	public String m_MAX_CAL_DATE = null;
	/** 第 45 変数： m_HOLIDAY_FLG */
	public Integer m_HOLIDAY_FLG = null;
	/** 第 46 変数： m_OD_MODIFY_COUNT */
	public String m_OD_MODIFY_COUNT = null;
	/** 第 47 変数： m_EXT_MODIFY_COUNT */
	public String m_EXT_MODIFY_COUNT = null;
	/** 第 48 変数： m_ODR_RELEASE_FLG */
	public String m_ODR_RELEASE_FLG = null;
	/** 第 49 変数： m_MRP_TYP */
	public String m_MRP_TYP = null;
	/** 第 50 変数： m_PARENT_OD_NO */
	public String m_PARENT_OD_NO = null;
	/** 第 51 変数： m_EXTERNAL_DM_FLG */
	public String m_EXTERNAL_DM_FLG = null;
	/** 第 52 変数： m_saveMUL_ODR_QTY */
	public String m_saveMUL_ODR_QTY = null;
	/** 第 53 変数： m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** 第 54 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** 第 55 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 56 変数： m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** 第 57 変数： m_DRAW_CD */
	public String m_DRAW_CD = null;
	/** 第 58 変数： m_SPEC */
	public String m_SPEC = null;
	/** 第 59 変数： m_ITEM_SPOIL */
	public String m_ITEM_SPOIL = null;
	/** 第 60 変数： m_MAX_PERIOD */
	public String m_MAX_PERIOD = null;
	/** 第 61 変数： m_MUL_ODR_QTY */
	public String m_MUL_ODR_QTY = null;
	/** 第 62 変数： m_MAX_ODR_QTY */
	public String m_MAX_ODR_QTY = null;
	/** 第 63 変数： m_MIN_ODR_QTY */
	public String m_MIN_ODR_QTY = null;
	/** 第 64 変数： m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** 第 65 変数： m_SAFETY_STOCK */
	public String m_SAFETY_STOCK = null;
	/** 第 66 変数： m_STOCK_ON_HAND_QTY */
	public String m_STOCK_ON_HAND_QTY = null;
	/** 第 67 変数： m_PlanDate */
	public String m_PlanDate = null;
	/** 第 68 変数： m_DM_QTY */
	public String m_DM_QTY = null;
	/** 第 69 変数： m_ODR_QTY */
	public String m_ODR_QTY = null;
	/** 第 70 変数： m_w_DATE_FROM */
	public String m_w_DATE_FROM = null;
	/** 第 71 変数： m_w_DATE_TO */
	public String m_w_DATE_TO = null;
	/** 第 72 変数： m_DUE_DATE_ALL */
	public String m_DUE_DATE_ALL = null;
	/** 第 73 変数： m_ODR_START_DATE_ALL */
	public String m_ODR_START_DATE_ALL = null;
	/** 第 74 変数： m_PRD_DUE_DATE_ALL */
	public String m_PRD_DUE_DATE_ALL = null;
	/** 第 75 変数： m_PRD_START_DATE_ALL */
	public String m_PRD_START_DATE_ALL = null;
	/** 第 76 変数： m_TIME_CTRL */
	public String m_TIME_CTRL = null;
	/** 第 77 変数： m_PRD_DUE_TIME */
	public String m_PRD_DUE_TIME = null;
	/** 第 78 変数： m_TIME_GET_OD_NO */
	public String m_TIME_GET_OD_NO = null;
	/** 第 79 変数： m_ASP_INSTALL_FLG */
	public String m_ASP_INSTALL_FLG = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_MRP_ODR_NAME */
	public List l_MRP_ODR_NAME = null;

	/** 第 2 List変数： l_OUTSIDE_NAME */
	public List l_OUTSIDE_NAME = null;

	/** 第 3 List変数： l_UNIT_QTY_NAME */
	public List l_UNIT_QTY_NAME = null;

	/** 第 4 List変数： l_LOT_SIZING_NAME */
	public List l_LOT_SIZING_NAME = null;

	/** 第 5 List変数： l_PlanDemand */
	public List l_PlanDemand = null;

	/** 第 6 List変数： l_FixedDemand */
	public List l_FixedDemand = null;

	/** 第 7 List変数： l_PlanOrder */
	public List l_PlanOrder = null;

	/** 第 8 List変数： l_FixedOrder */
	public List l_FixedOrder = null;

	/** 第 9 List変数： l_ValidStock */
	public List l_ValidStock = null;

	/** 第 10 List変数： l_LowerDeploy */
	public List l_LowerDeploy = null;

	/** 第 11 List変数： l_Expect */
	public List l_Expect = null;

	/** 第 12 List変数： l_r_ODR_CHOICE */
	public List l_r_ODR_CHOICE = null;

	/** 第 13 List変数： l_r_DM_CHOICE */
	public List l_r_DM_CHOICE = null;

	/** 第 14 List変数： l_c_DELETE_FLG */
	public List l_c_DELETE_FLG = null;

	/** 第 15 List変数： l_c_LowerDeploy */
	public List l_c_LowerDeploy = null;

	/** 第 16 List変数： l_dispDM_QTY */
	public List l_dispDM_QTY = null;

	/** 第 17 List変数： l_dispODR_QTY */
	public List l_dispODR_QTY = null;

	/** 第 18 List変数： l_PlanTime */
	public List l_PlanTime = null;

	/** 第 19 List変数： l_saveDM_QTY */
	public List l_saveDM_QTY = null;

	/** 第 20 List変数： l_IsReleased */
	public List l_IsReleased = null;

	/** 第 21 List変数： l_MRP_ODR_TYP */
	public List l_MRP_ODR_TYP = null;

	/** 第 22 List変数： l_OUTSIDE_TYP */
	public List l_OUTSIDE_TYP = null;

	/** 第 23 List変数： l_ISSUE_TYP */
	public List l_ISSUE_TYP = null;

	/** 第 24 List変数： l_PROP_LOT_SIZE */
	public List l_PROP_LOT_SIZE = null;

	/** 第 25 List変数： l_ODR_LT */
	public List l_ODR_LT = null;

	/** 第 26 List変数： l_FIXED_LT */
	public List l_FIXED_LT = null;

	/** 第 27 List変数： l_PROP_LT */
	public List l_PROP_LT = null;

	/** 第 28 List変数： l_SAFETY_LT */
	public List l_SAFETY_LT = null;

	/** 第 29 List変数： l_ISSUE_LT */
	public List l_ISSUE_LT = null;

	/** 第 30 List変数： l_ODR_STS_TYP */
	public List l_ODR_STS_TYP = null;

	/** 第 31 List変数： l_DM_STS_TYP */
	public List l_DM_STS_TYP = null;

	/** 第 32 List変数： l_OD_TYP */
	public List l_OD_TYP = null;

	/** 第 33 List変数： l_DUE_DATE */
	public List l_DUE_DATE = null;

	/** 第 34 List変数： l_ODR_START_DATE */
	public List l_ODR_START_DATE = null;

	/** 第 35 List変数： l_PRD_DUE_DATE */
	public List l_PRD_DUE_DATE = null;

	/** 第 36 List変数： l_PRD_START_DATE */
	public List l_PRD_START_DATE = null;

	/** 第 37 List変数： l_OD_NO */
	public List l_OD_NO = null;

	/** 第 38 List変数： l_UNIT_QTY_TYP */
	public List l_UNIT_QTY_TYP = null;

	/** 第 39 List変数： l_LOT_SIZING_TYP */
	public List l_LOT_SIZING_TYP = null;

	/** 第 40 List変数： l_EXTERNAL_PLAN_CD */
	public List l_EXTERNAL_PLAN_CD = null;

	/** 第 41 List変数： l_EXTERNAL_PLAN_EXP_TYP */
	public List l_EXTERNAL_PLAN_EXP_TYP = null;

	/** 第 42 List変数： l_EXTERNAL_PLAN_DEL_FLG */
	public List l_EXTERNAL_PLAN_DEL_FLG = null;

	/** 第 43 List変数： l_MIN_CAL_DATE */
	public List l_MIN_CAL_DATE = null;

	/** 第 44 List変数： l_MAX_CAL_DATE */
	public List l_MAX_CAL_DATE = null;

	/** 第 45 List変数： l_HOLIDAY_FLG */
	public List l_HOLIDAY_FLG = null;

	/** 第 46 List変数： l_OD_MODIFY_COUNT */
	public List l_OD_MODIFY_COUNT = null;

	/** 第 47 List変数： l_EXT_MODIFY_COUNT */
	public List l_EXT_MODIFY_COUNT = null;

	/** 第 48 List変数： l_ODR_RELEASE_FLG */
	public List l_ODR_RELEASE_FLG = null;

	/** 第 49 List変数： l_MRP_TYP */
	public List l_MRP_TYP = null;

	/** 第 50 List変数： l_PARENT_OD_NO */
	public List l_PARENT_OD_NO = null;

	/** 第 51 List変数： l_EXTERNAL_DM_FLG */
	public List l_EXTERNAL_DM_FLG = null;

	/** 第 52 List変数： l_saveMUL_ODR_QTY */
	public List l_saveMUL_ODR_QTY = null;

	/** 第 53 List変数： l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** 第 54 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** 第 55 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 56 List変数： l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** 第 57 List変数： l_DRAW_CD */
	public List l_DRAW_CD = null;

	/** 第 58 List変数： l_SPEC */
	public List l_SPEC = null;

	/** 第 59 List変数： l_ITEM_SPOIL */
	public List l_ITEM_SPOIL = null;

	/** 第 60 List変数： l_MAX_PERIOD */
	public List l_MAX_PERIOD = null;

	/** 第 61 List変数： l_MUL_ODR_QTY */
	public List l_MUL_ODR_QTY = null;

	/** 第 62 List変数： l_MAX_ODR_QTY */
	public List l_MAX_ODR_QTY = null;

	/** 第 63 List変数： l_MIN_ODR_QTY */
	public List l_MIN_ODR_QTY = null;

	/** 第 64 List変数： l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** 第 65 List変数： l_SAFETY_STOCK */
	public List l_SAFETY_STOCK = null;

	/** 第 66 List変数： l_STOCK_ON_HAND_QTY */
	public List l_STOCK_ON_HAND_QTY = null;

	/** 第 67 List変数： l_PlanDate */
	public List l_PlanDate = null;

	/** 第 68 List変数： l_DM_QTY */
	public List l_DM_QTY = null;

	/** 第 69 List変数： l_ODR_QTY */
	public List l_ODR_QTY = null;

	/** 第 70 List変数： l_w_DATE_FROM */
	public List l_w_DATE_FROM = null;

	/** 第 71 List変数： l_w_DATE_TO */
	public List l_w_DATE_TO = null;

	/** 第 72 List変数： l_DUE_DATE_ALL */
	public List l_DUE_DATE_ALL = null;

	/** 第 73 List変数： l_ODR_START_DATE_ALL */
	public List l_ODR_START_DATE_ALL = null;

	/** 第 74 List変数： l_PRD_DUE_DATE_ALL */
	public List l_PRD_DUE_DATE_ALL = null;

	/** 第 75 List変数： l_PRD_START_DATE_ALL */
	public List l_PRD_START_DATE_ALL = null;

	/** 第 76 List変数： l_TIME_CTRL */
	public List l_TIME_CTRL = null;

	/** 第 77 List変数： l_PRD_DUE_TIME */
	public List l_PRD_DUE_TIME = null;

	/** 第 78 List変数： l_TIME_GET_OD_NO */
	public List l_TIME_GET_OD_NO = null;

	/** 第 79 List変数： l_ASP_INSTALL_FLG */
	public List l_ASP_INSTALL_FLG = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getMRP_ODR_NAME() { return m_MRP_ODR_NAME; }
	public String getOUTSIDE_NAME() { return m_OUTSIDE_NAME; }
	public String getUNIT_QTY_NAME() { return m_UNIT_QTY_NAME; }
	public String getLOT_SIZING_NAME() { return m_LOT_SIZING_NAME; }
	public String getPlanDemand() { return m_PlanDemand; }
	public String getFixedDemand() { return m_FixedDemand; }
	public String getPlanOrder() { return m_PlanOrder; }
	public String getFixedOrder() { return m_FixedOrder; }
	public String getValidStock() { return m_ValidStock; }
	public String getLowerDeploy() { return m_LowerDeploy; }
	public String getExpect() { return m_Expect; }
	public String getr_ODR_CHOICE() { return m_r_ODR_CHOICE; }
	public String getr_DM_CHOICE() { return m_r_DM_CHOICE; }
	public String getc_DELETE_FLG() { return m_c_DELETE_FLG; }
	public String getc_LowerDeploy() { return m_c_LowerDeploy; }
	public String getdispDM_QTY() { return m_dispDM_QTY; }
	public String getdispODR_QTY() { return m_dispODR_QTY; }
	public String getPlanTime() { return m_PlanTime; }
	public String getsaveDM_QTY() { return m_saveDM_QTY; }
	public String getIsReleased() { return m_IsReleased; }
	public String getMRP_ODR_TYP() { return m_MRP_ODR_TYP; }
	public String getOUTSIDE_TYP() { return m_OUTSIDE_TYP; }
	public String getISSUE_TYP() { return m_ISSUE_TYP; }
	public String getPROP_LOT_SIZE() { return m_PROP_LOT_SIZE; }
	public String getODR_LT() { return m_ODR_LT; }
	public String getFIXED_LT() { return m_FIXED_LT; }
	public String getPROP_LT() { return m_PROP_LT; }
	public String getSAFETY_LT() { return m_SAFETY_LT; }
	public String getISSUE_LT() { return m_ISSUE_LT; }
	public String getODR_STS_TYP() { return m_ODR_STS_TYP; }
	public String getDM_STS_TYP() { return m_DM_STS_TYP; }
	public String getOD_TYP() { return m_OD_TYP; }
	public java.util.Date getDUE_DATE() { return m_DUE_DATE; }
	public java.util.Date getODR_START_DATE() { return m_ODR_START_DATE; }
	public java.util.Date getPRD_DUE_DATE() { return m_PRD_DUE_DATE; }
	public java.util.Date getPRD_START_DATE() { return m_PRD_START_DATE; }
	public String getOD_NO() { return m_OD_NO; }
	public String getUNIT_QTY_TYP() { return m_UNIT_QTY_TYP; }
	public String getLOT_SIZING_TYP() { return m_LOT_SIZING_TYP; }
	public String getEXTERNAL_PLAN_CD() { return m_EXTERNAL_PLAN_CD; }
	public String getEXTERNAL_PLAN_EXP_TYP() { return m_EXTERNAL_PLAN_EXP_TYP; }
	public String getEXTERNAL_PLAN_DEL_FLG() { return m_EXTERNAL_PLAN_DEL_FLG; }
	public String getMIN_CAL_DATE() { return m_MIN_CAL_DATE; }
	public String getMAX_CAL_DATE() { return m_MAX_CAL_DATE; }
	public Integer getHOLIDAY_FLG() { return m_HOLIDAY_FLG; }
	public String getOD_MODIFY_COUNT() { return m_OD_MODIFY_COUNT; }
	public String getEXT_MODIFY_COUNT() { return m_EXT_MODIFY_COUNT; }
	public String getODR_RELEASE_FLG() { return m_ODR_RELEASE_FLG; }
	public String getMRP_TYP() { return m_MRP_TYP; }
	public String getPARENT_OD_NO() { return m_PARENT_OD_NO; }
	public String getEXTERNAL_DM_FLG() { return m_EXTERNAL_DM_FLG; }
	public String getsaveMUL_ODR_QTY() { return m_saveMUL_ODR_QTY; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getDRAW_CD() { return m_DRAW_CD; }
	public String getSPEC() { return m_SPEC; }
	public String getITEM_SPOIL() { return m_ITEM_SPOIL; }
	public String getMAX_PERIOD() { return m_MAX_PERIOD; }
	public String getMUL_ODR_QTY() { return m_MUL_ODR_QTY; }
	public String getMAX_ODR_QTY() { return m_MAX_ODR_QTY; }
	public String getMIN_ODR_QTY() { return m_MIN_ODR_QTY; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getSAFETY_STOCK() { return m_SAFETY_STOCK; }
	public String getSTOCK_ON_HAND_QTY() { return m_STOCK_ON_HAND_QTY; }
	public String getPlanDate() { return m_PlanDate; }
	public String getDM_QTY() { return m_DM_QTY; }
	public String getODR_QTY() { return m_ODR_QTY; }
	public String getw_DATE_FROM() { return m_w_DATE_FROM; }
	public String getw_DATE_TO() { return m_w_DATE_TO; }
	public String getDUE_DATE_ALL() { return m_DUE_DATE_ALL; }
	public String getODR_START_DATE_ALL() { return m_ODR_START_DATE_ALL; }
	public String getPRD_DUE_DATE_ALL() { return m_PRD_DUE_DATE_ALL; }
	public String getPRD_START_DATE_ALL() { return m_PRD_START_DATE_ALL; }
	public String getTIME_CTRL() { return m_TIME_CTRL; }
	public String getPRD_DUE_TIME() { return m_PRD_DUE_TIME; }
	public String getTIME_GET_OD_NO() { return m_TIME_GET_OD_NO; }
	public String getASP_INSTALL_FLG() { return m_ASP_INSTALL_FLG; }

	public List getList_MRP_ODR_NAME() { return l_MRP_ODR_NAME; }
	public List getList_OUTSIDE_NAME() { return l_OUTSIDE_NAME; }
	public List getList_UNIT_QTY_NAME() { return l_UNIT_QTY_NAME; }
	public List getList_LOT_SIZING_NAME() { return l_LOT_SIZING_NAME; }
	public List getList_PlanDemand() { return l_PlanDemand; }
	public List getList_FixedDemand() { return l_FixedDemand; }
	public List getList_PlanOrder() { return l_PlanOrder; }
	public List getList_FixedOrder() { return l_FixedOrder; }
	public List getList_ValidStock() { return l_ValidStock; }
	public List getList_LowerDeploy() { return l_LowerDeploy; }
	public List getList_Expect() { return l_Expect; }
	public List getList_r_ODR_CHOICE() { return l_r_ODR_CHOICE; }
	public List getList_r_DM_CHOICE() { return l_r_DM_CHOICE; }
	public List getList_c_DELETE_FLG() { return l_c_DELETE_FLG; }
	public List getList_c_LowerDeploy() { return l_c_LowerDeploy; }
	public List getList_dispDM_QTY() { return l_dispDM_QTY; }
	public List getList_dispODR_QTY() { return l_dispODR_QTY; }
	public List getList_PlanTime() { return l_PlanTime; }
	public List getList_saveDM_QTY() { return l_saveDM_QTY; }
	public List getList_IsReleased() { return l_IsReleased; }
	public List getList_MRP_ODR_TYP() { return l_MRP_ODR_TYP; }
	public List getList_OUTSIDE_TYP() { return l_OUTSIDE_TYP; }
	public List getList_ISSUE_TYP() { return l_ISSUE_TYP; }
	public List getList_PROP_LOT_SIZE() { return l_PROP_LOT_SIZE; }
	public List getList_ODR_LT() { return l_ODR_LT; }
	public List getList_FIXED_LT() { return l_FIXED_LT; }
	public List getList_PROP_LT() { return l_PROP_LT; }
	public List getList_SAFETY_LT() { return l_SAFETY_LT; }
	public List getList_ISSUE_LT() { return l_ISSUE_LT; }
	public List getList_ODR_STS_TYP() { return l_ODR_STS_TYP; }
	public List getList_DM_STS_TYP() { return l_DM_STS_TYP; }
	public List getList_OD_TYP() { return l_OD_TYP; }
	public List getList_DUE_DATE() { return l_DUE_DATE; }
	public List getList_ODR_START_DATE() { return l_ODR_START_DATE; }
	public List getList_PRD_DUE_DATE() { return l_PRD_DUE_DATE; }
	public List getList_PRD_START_DATE() { return l_PRD_START_DATE; }
	public List getList_OD_NO() { return l_OD_NO; }
	public List getList_UNIT_QTY_TYP() { return l_UNIT_QTY_TYP; }
	public List getList_LOT_SIZING_TYP() { return l_LOT_SIZING_TYP; }
	public List getList_EXTERNAL_PLAN_CD() { return l_EXTERNAL_PLAN_CD; }
	public List getList_EXTERNAL_PLAN_EXP_TYP() { return l_EXTERNAL_PLAN_EXP_TYP; }
	public List getList_EXTERNAL_PLAN_DEL_FLG() { return l_EXTERNAL_PLAN_DEL_FLG; }
	public List getList_MIN_CAL_DATE() { return l_MIN_CAL_DATE; }
	public List getList_MAX_CAL_DATE() { return l_MAX_CAL_DATE; }
	public List getList_HOLIDAY_FLG() { return l_HOLIDAY_FLG; }
	public List getList_OD_MODIFY_COUNT() { return l_OD_MODIFY_COUNT; }
	public List getList_EXT_MODIFY_COUNT() { return l_EXT_MODIFY_COUNT; }
	public List getList_ODR_RELEASE_FLG() { return l_ODR_RELEASE_FLG; }
	public List getList_MRP_TYP() { return l_MRP_TYP; }
	public List getList_PARENT_OD_NO() { return l_PARENT_OD_NO; }
	public List getList_EXTERNAL_DM_FLG() { return l_EXTERNAL_DM_FLG; }
	public List getList_saveMUL_ODR_QTY() { return l_saveMUL_ODR_QTY; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_DRAW_CD() { return l_DRAW_CD; }
	public List getList_SPEC() { return l_SPEC; }
	public List getList_ITEM_SPOIL() { return l_ITEM_SPOIL; }
	public List getList_MAX_PERIOD() { return l_MAX_PERIOD; }
	public List getList_MUL_ODR_QTY() { return l_MUL_ODR_QTY; }
	public List getList_MAX_ODR_QTY() { return l_MAX_ODR_QTY; }
	public List getList_MIN_ODR_QTY() { return l_MIN_ODR_QTY; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_SAFETY_STOCK() { return l_SAFETY_STOCK; }
	public List getList_STOCK_ON_HAND_QTY() { return l_STOCK_ON_HAND_QTY; }
	public List getList_PlanDate() { return l_PlanDate; }
	public List getList_DM_QTY() { return l_DM_QTY; }
	public List getList_ODR_QTY() { return l_ODR_QTY; }
	public List getList_w_DATE_FROM() { return l_w_DATE_FROM; }
	public List getList_w_DATE_TO() { return l_w_DATE_TO; }
	public List getList_DUE_DATE_ALL() { return l_DUE_DATE_ALL; }
	public List getList_ODR_START_DATE_ALL() { return l_ODR_START_DATE_ALL; }
	public List getList_PRD_DUE_DATE_ALL() { return l_PRD_DUE_DATE_ALL; }
	public List getList_PRD_START_DATE_ALL() { return l_PRD_START_DATE_ALL; }
	public List getList_TIME_CTRL() { return l_TIME_CTRL; }
	public List getList_PRD_DUE_TIME() { return l_PRD_DUE_TIME; }
	public List getList_TIME_GET_OD_NO() { return l_TIME_GET_OD_NO; }
	public List getList_ASP_INSTALL_FLG() { return l_ASP_INSTALL_FLG; }

	public void setMRP_ODR_NAME(String val) { m_MRP_ODR_NAME = val; }
	public void setOUTSIDE_NAME(String val) { m_OUTSIDE_NAME = val; }
	public void setUNIT_QTY_NAME(String val) { m_UNIT_QTY_NAME = val; }
	public void setLOT_SIZING_NAME(String val) { m_LOT_SIZING_NAME = val; }
	public void setPlanDemand(String val) { m_PlanDemand = val; }
	public void setFixedDemand(String val) { m_FixedDemand = val; }
	public void setPlanOrder(String val) { m_PlanOrder = val; }
	public void setFixedOrder(String val) { m_FixedOrder = val; }
	public void setValidStock(String val) { m_ValidStock = val; }
	public void setLowerDeploy(String val) { m_LowerDeploy = val; }
	public void setExpect(String val) { m_Expect = val; }
	public void setr_ODR_CHOICE(String val) { m_r_ODR_CHOICE = val; }
	public void setr_DM_CHOICE(String val) { m_r_DM_CHOICE = val; }
	public void setc_DELETE_FLG(String val) { m_c_DELETE_FLG = val; }
	public void setc_LowerDeploy(String val) { m_c_LowerDeploy = val; }
	public void setdispDM_QTY(String val) { m_dispDM_QTY = val; }
	public void setdispODR_QTY(String val) { m_dispODR_QTY = val; }
	public void setPlanTime(String val) { m_PlanTime = val; }
	public void setsaveDM_QTY(String val) { m_saveDM_QTY = val; }
	public void setIsReleased(String val) { m_IsReleased = val; }
	public void setMRP_ODR_TYP(String val) { m_MRP_ODR_TYP = val; }
	public void setOUTSIDE_TYP(String val) { m_OUTSIDE_TYP = val; }
	public void setISSUE_TYP(String val) { m_ISSUE_TYP = val; }
	public void setPROP_LOT_SIZE(String val) { m_PROP_LOT_SIZE = val; }
	public void setODR_LT(String val) { m_ODR_LT = val; }
	public void setFIXED_LT(String val) { m_FIXED_LT = val; }
	public void setPROP_LT(String val) { m_PROP_LT = val; }
	public void setSAFETY_LT(String val) { m_SAFETY_LT = val; }
	public void setISSUE_LT(String val) { m_ISSUE_LT = val; }
	public void setODR_STS_TYP(String val) { m_ODR_STS_TYP = val; }
	public void setDM_STS_TYP(String val) { m_DM_STS_TYP = val; }
	public void setOD_TYP(String val) { m_OD_TYP = val; }
	public void setDUE_DATE(java.util.Date val) { m_DUE_DATE = val; }
	public void setODR_START_DATE(java.util.Date val) { m_ODR_START_DATE = val; }
	public void setPRD_DUE_DATE(java.util.Date val) { m_PRD_DUE_DATE = val; }
	public void setPRD_START_DATE(java.util.Date val) { m_PRD_START_DATE = val; }
	public void setOD_NO(String val) { m_OD_NO = val; }
	public void setUNIT_QTY_TYP(String val) { m_UNIT_QTY_TYP = val; }
	public void setLOT_SIZING_TYP(String val) { m_LOT_SIZING_TYP = val; }
	public void setEXTERNAL_PLAN_CD(String val) { m_EXTERNAL_PLAN_CD = val; }
	public void setEXTERNAL_PLAN_EXP_TYP(String val) { m_EXTERNAL_PLAN_EXP_TYP = val; }
	public void setEXTERNAL_PLAN_DEL_FLG(String val) { m_EXTERNAL_PLAN_DEL_FLG = val; }
	public void setMIN_CAL_DATE(String val) { m_MIN_CAL_DATE = val; }
	public void setMAX_CAL_DATE(String val) { m_MAX_CAL_DATE = val; }
	public void setHOLIDAY_FLG(Integer val) { m_HOLIDAY_FLG = val; }
	public void setOD_MODIFY_COUNT(String val) { m_OD_MODIFY_COUNT = val; }
	public void setEXT_MODIFY_COUNT(String val) { m_EXT_MODIFY_COUNT = val; }
	public void setODR_RELEASE_FLG(String val) { m_ODR_RELEASE_FLG = val; }
	public void setMRP_TYP(String val) { m_MRP_TYP = val; }
	public void setPARENT_OD_NO(String val) { m_PARENT_OD_NO = val; }
	public void setEXTERNAL_DM_FLG(String val) { m_EXTERNAL_DM_FLG = val; }
	public void setsaveMUL_ODR_QTY(String val) { m_saveMUL_ODR_QTY = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setDRAW_CD(String val) { m_DRAW_CD = val; }
	public void setSPEC(String val) { m_SPEC = val; }
	public void setITEM_SPOIL(String val) { m_ITEM_SPOIL = val; }
	public void setMAX_PERIOD(String val) { m_MAX_PERIOD = val; }
	public void setMUL_ODR_QTY(String val) { m_MUL_ODR_QTY = val; }
	public void setMAX_ODR_QTY(String val) { m_MAX_ODR_QTY = val; }
	public void setMIN_ODR_QTY(String val) { m_MIN_ODR_QTY = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setSAFETY_STOCK(String val) { m_SAFETY_STOCK = val; }
	public void setSTOCK_ON_HAND_QTY(String val) { m_STOCK_ON_HAND_QTY = val; }
	public void setPlanDate(String val) { m_PlanDate = val; }
	public void setDM_QTY(String val) { m_DM_QTY = val; }
	public void setODR_QTY(String val) { m_ODR_QTY = val; }
	public void setw_DATE_FROM(String val) { m_w_DATE_FROM = val; }
	public void setw_DATE_TO(String val) { m_w_DATE_TO = val; }
	public void setDUE_DATE_ALL(String val) { m_DUE_DATE_ALL = val; }
	public void setODR_START_DATE_ALL(String val) { m_ODR_START_DATE_ALL = val; }
	public void setPRD_DUE_DATE_ALL(String val) { m_PRD_DUE_DATE_ALL = val; }
	public void setPRD_START_DATE_ALL(String val) { m_PRD_START_DATE_ALL = val; }
	public void setTIME_CTRL(String val) { m_TIME_CTRL = val; }
	public void setPRD_DUE_TIME(String val) { m_PRD_DUE_TIME = val; }
	public void setTIME_GET_OD_NO(String val) { m_TIME_GET_OD_NO = val; }
	public void setASP_INSTALL_FLG(String val) { m_ASP_INSTALL_FLG = val; }

	public void setDUE_DATE(String val) { m_DUE_DATE = getDate(val); }
	public void setODR_START_DATE(String val) { m_ODR_START_DATE = getDate(val); }
	public void setPRD_DUE_DATE(String val) { m_PRD_DUE_DATE = getDate(val); }
	public void setPRD_START_DATE(String val) { m_PRD_START_DATE = getDate(val); }
	public void setHOLIDAY_FLG(String val) { m_HOLIDAY_FLG = getInteger(val); }

	public void setList_MRP_ODR_NAME(List list) { l_MRP_ODR_NAME = list; }
	public void setList_OUTSIDE_NAME(List list) { l_OUTSIDE_NAME = list; }
	public void setList_UNIT_QTY_NAME(List list) { l_UNIT_QTY_NAME = list; }
	public void setList_LOT_SIZING_NAME(List list) { l_LOT_SIZING_NAME = list; }
	public void setList_PlanDemand(List list) { l_PlanDemand = list; }
	public void setList_FixedDemand(List list) { l_FixedDemand = list; }
	public void setList_PlanOrder(List list) { l_PlanOrder = list; }
	public void setList_FixedOrder(List list) { l_FixedOrder = list; }
	public void setList_ValidStock(List list) { l_ValidStock = list; }
	public void setList_LowerDeploy(List list) { l_LowerDeploy = list; }
	public void setList_Expect(List list) { l_Expect = list; }
	public void setList_r_ODR_CHOICE(List list) { l_r_ODR_CHOICE = list; }
	public void setList_r_DM_CHOICE(List list) { l_r_DM_CHOICE = list; }
	public void setList_c_DELETE_FLG(List list) { l_c_DELETE_FLG = list; }
	public void setList_c_LowerDeploy(List list) { l_c_LowerDeploy = list; }
	public void setList_dispDM_QTY(List list) { l_dispDM_QTY = list; }
	public void setList_dispODR_QTY(List list) { l_dispODR_QTY = list; }
	public void setList_PlanTime(List list) { l_PlanTime = list; }
	public void setList_saveDM_QTY(List list) { l_saveDM_QTY = list; }
	public void setList_IsReleased(List list) { l_IsReleased = list; }
	public void setList_MRP_ODR_TYP(List list) { l_MRP_ODR_TYP = list; }
	public void setList_OUTSIDE_TYP(List list) { l_OUTSIDE_TYP = list; }
	public void setList_ISSUE_TYP(List list) { l_ISSUE_TYP = list; }
	public void setList_PROP_LOT_SIZE(List list) { l_PROP_LOT_SIZE = list; }
	public void setList_ODR_LT(List list) { l_ODR_LT = list; }
	public void setList_FIXED_LT(List list) { l_FIXED_LT = list; }
	public void setList_PROP_LT(List list) { l_PROP_LT = list; }
	public void setList_SAFETY_LT(List list) { l_SAFETY_LT = list; }
	public void setList_ISSUE_LT(List list) { l_ISSUE_LT = list; }
	public void setList_ODR_STS_TYP(List list) { l_ODR_STS_TYP = list; }
	public void setList_DM_STS_TYP(List list) { l_DM_STS_TYP = list; }
	public void setList_OD_TYP(List list) { l_OD_TYP = list; }
	public void setList_DUE_DATE(List list) { l_DUE_DATE = list; }
	public void setList_ODR_START_DATE(List list) { l_ODR_START_DATE = list; }
	public void setList_PRD_DUE_DATE(List list) { l_PRD_DUE_DATE = list; }
	public void setList_PRD_START_DATE(List list) { l_PRD_START_DATE = list; }
	public void setList_OD_NO(List list) { l_OD_NO = list; }
	public void setList_UNIT_QTY_TYP(List list) { l_UNIT_QTY_TYP = list; }
	public void setList_LOT_SIZING_TYP(List list) { l_LOT_SIZING_TYP = list; }
	public void setList_EXTERNAL_PLAN_CD(List list) { l_EXTERNAL_PLAN_CD = list; }
	public void setList_EXTERNAL_PLAN_EXP_TYP(List list) { l_EXTERNAL_PLAN_EXP_TYP = list; }
	public void setList_EXTERNAL_PLAN_DEL_FLG(List list) { l_EXTERNAL_PLAN_DEL_FLG = list; }
	public void setList_MIN_CAL_DATE(List list) { l_MIN_CAL_DATE = list; }
	public void setList_MAX_CAL_DATE(List list) { l_MAX_CAL_DATE = list; }
	public void setList_HOLIDAY_FLG(List list) { l_HOLIDAY_FLG = list; }
	public void setList_OD_MODIFY_COUNT(List list) { l_OD_MODIFY_COUNT = list; }
	public void setList_EXT_MODIFY_COUNT(List list) { l_EXT_MODIFY_COUNT = list; }
	public void setList_ODR_RELEASE_FLG(List list) { l_ODR_RELEASE_FLG = list; }
	public void setList_MRP_TYP(List list) { l_MRP_TYP = list; }
	public void setList_PARENT_OD_NO(List list) { l_PARENT_OD_NO = list; }
	public void setList_EXTERNAL_DM_FLG(List list) { l_EXTERNAL_DM_FLG = list; }
	public void setList_saveMUL_ODR_QTY(List list) { l_saveMUL_ODR_QTY = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_DRAW_CD(List list) { l_DRAW_CD = list; }
	public void setList_SPEC(List list) { l_SPEC = list; }
	public void setList_ITEM_SPOIL(List list) { l_ITEM_SPOIL = list; }
	public void setList_MAX_PERIOD(List list) { l_MAX_PERIOD = list; }
	public void setList_MUL_ODR_QTY(List list) { l_MUL_ODR_QTY = list; }
	public void setList_MAX_ODR_QTY(List list) { l_MAX_ODR_QTY = list; }
	public void setList_MIN_ODR_QTY(List list) { l_MIN_ODR_QTY = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_SAFETY_STOCK(List list) { l_SAFETY_STOCK = list; }
	public void setList_STOCK_ON_HAND_QTY(List list) { l_STOCK_ON_HAND_QTY = list; }
	public void setList_PlanDate(List list) { l_PlanDate = list; }
	public void setList_DM_QTY(List list) { l_DM_QTY = list; }
	public void setList_ODR_QTY(List list) { l_ODR_QTY = list; }
	public void setList_w_DATE_FROM(List list) { l_w_DATE_FROM = list; }
	public void setList_w_DATE_TO(List list) { l_w_DATE_TO = list; }
	public void setList_DUE_DATE_ALL(List list) { l_DUE_DATE_ALL = list; }
	public void setList_ODR_START_DATE_ALL(List list) { l_ODR_START_DATE_ALL = list; }
	public void setList_PRD_DUE_DATE_ALL(List list) { l_PRD_DUE_DATE_ALL = list; }
	public void setList_PRD_START_DATE_ALL(List list) { l_PRD_START_DATE_ALL = list; }
	public void setList_TIME_CTRL(List list) { l_TIME_CTRL = list; }
	public void setList_PRD_DUE_TIME(List list) { l_PRD_DUE_TIME = list; }
	public void setList_TIME_GET_OD_NO(List list) { l_TIME_GET_OD_NO = list; }
	public void setList_ASP_INSTALL_FLG(List list) { l_ASP_INSTALL_FLG = list; }

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
			l_MRP_ODR_NAME.add(((AC0060010Struct) list.get(i)).getMRP_ODR_NAME());
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
			l_OUTSIDE_NAME.add(((AC0060010Struct) list.get(i)).getOUTSIDE_NAME());
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
			l_UNIT_QTY_NAME.add(((AC0060010Struct) list.get(i)).getUNIT_QTY_NAME());
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
			l_LOT_SIZING_NAME.add(((AC0060010Struct) list.get(i)).getLOT_SIZING_NAME());
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
			l_PlanDemand.add(((AC0060010Struct) list.get(i)).getPlanDemand());
		}
		return size;
	}
	public int setL2L_FixedDemand(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FixedDemand == null) {
			l_FixedDemand = new ArrayList();
		} else {
			l_FixedDemand.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FixedDemand.add(((AC0060010Struct) list.get(i)).getFixedDemand());
		}
		return size;
	}
	public int setL2L_PlanOrder(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PlanOrder == null) {
			l_PlanOrder = new ArrayList();
		} else {
			l_PlanOrder.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PlanOrder.add(((AC0060010Struct) list.get(i)).getPlanOrder());
		}
		return size;
	}
	public int setL2L_FixedOrder(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FixedOrder == null) {
			l_FixedOrder = new ArrayList();
		} else {
			l_FixedOrder.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FixedOrder.add(((AC0060010Struct) list.get(i)).getFixedOrder());
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
			l_ValidStock.add(((AC0060010Struct) list.get(i)).getValidStock());
		}
		return size;
	}
	public int setL2L_LowerDeploy(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LowerDeploy == null) {
			l_LowerDeploy = new ArrayList();
		} else {
			l_LowerDeploy.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LowerDeploy.add(((AC0060010Struct) list.get(i)).getLowerDeploy());
		}
		return size;
	}
	public int setL2L_Expect(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Expect == null) {
			l_Expect = new ArrayList();
		} else {
			l_Expect.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Expect.add(((AC0060010Struct) list.get(i)).getExpect());
		}
		return size;
	}
	public int setL2L_r_ODR_CHOICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r_ODR_CHOICE == null) {
			l_r_ODR_CHOICE = new ArrayList();
		} else {
			l_r_ODR_CHOICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r_ODR_CHOICE.add(((AC0060010Struct) list.get(i)).getr_ODR_CHOICE());
		}
		return size;
	}
	public int setL2L_r_DM_CHOICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r_DM_CHOICE == null) {
			l_r_DM_CHOICE = new ArrayList();
		} else {
			l_r_DM_CHOICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r_DM_CHOICE.add(((AC0060010Struct) list.get(i)).getr_DM_CHOICE());
		}
		return size;
	}
	public int setL2L_c_DELETE_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_DELETE_FLG == null) {
			l_c_DELETE_FLG = new ArrayList();
		} else {
			l_c_DELETE_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_DELETE_FLG.add(((AC0060010Struct) list.get(i)).getc_DELETE_FLG());
		}
		return size;
	}
	public int setL2L_c_LowerDeploy(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_LowerDeploy == null) {
			l_c_LowerDeploy = new ArrayList();
		} else {
			l_c_LowerDeploy.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_LowerDeploy.add(((AC0060010Struct) list.get(i)).getc_LowerDeploy());
		}
		return size;
	}
	public int setL2L_dispDM_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_dispDM_QTY == null) {
			l_dispDM_QTY = new ArrayList();
		} else {
			l_dispDM_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_dispDM_QTY.add(((AC0060010Struct) list.get(i)).getdispDM_QTY());
		}
		return size;
	}
	public int setL2L_dispODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_dispODR_QTY == null) {
			l_dispODR_QTY = new ArrayList();
		} else {
			l_dispODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_dispODR_QTY.add(((AC0060010Struct) list.get(i)).getdispODR_QTY());
		}
		return size;
	}
	public int setL2L_PlanTime(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PlanTime == null) {
			l_PlanTime = new ArrayList();
		} else {
			l_PlanTime.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PlanTime.add(((AC0060010Struct) list.get(i)).getPlanTime());
		}
		return size;
	}
	public int setL2L_saveDM_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_saveDM_QTY == null) {
			l_saveDM_QTY = new ArrayList();
		} else {
			l_saveDM_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_saveDM_QTY.add(((AC0060010Struct) list.get(i)).getsaveDM_QTY());
		}
		return size;
	}
	public int setL2L_IsReleased(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IsReleased == null) {
			l_IsReleased = new ArrayList();
		} else {
			l_IsReleased.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IsReleased.add(((AC0060010Struct) list.get(i)).getIsReleased());
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
			l_MRP_ODR_TYP.add(((AC0060010Struct) list.get(i)).getMRP_ODR_TYP());
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
			l_OUTSIDE_TYP.add(((AC0060010Struct) list.get(i)).getOUTSIDE_TYP());
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
			l_ISSUE_TYP.add(((AC0060010Struct) list.get(i)).getISSUE_TYP());
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
			l_PROP_LOT_SIZE.add(((AC0060010Struct) list.get(i)).getPROP_LOT_SIZE());
		}
		return size;
	}
	public int setL2L_ODR_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_LT == null) {
			l_ODR_LT = new ArrayList();
		} else {
			l_ODR_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_LT.add(((AC0060010Struct) list.get(i)).getODR_LT());
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
			l_FIXED_LT.add(((AC0060010Struct) list.get(i)).getFIXED_LT());
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
			l_PROP_LT.add(((AC0060010Struct) list.get(i)).getPROP_LT());
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
			l_SAFETY_LT.add(((AC0060010Struct) list.get(i)).getSAFETY_LT());
		}
		return size;
	}
	public int setL2L_ISSUE_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_LT == null) {
			l_ISSUE_LT = new ArrayList();
		} else {
			l_ISSUE_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_LT.add(((AC0060010Struct) list.get(i)).getISSUE_LT());
		}
		return size;
	}
	public int setL2L_ODR_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_STS_TYP == null) {
			l_ODR_STS_TYP = new ArrayList();
		} else {
			l_ODR_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_STS_TYP.add(((AC0060010Struct) list.get(i)).getODR_STS_TYP());
		}
		return size;
	}
	public int setL2L_DM_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DM_STS_TYP == null) {
			l_DM_STS_TYP = new ArrayList();
		} else {
			l_DM_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DM_STS_TYP.add(((AC0060010Struct) list.get(i)).getDM_STS_TYP());
		}
		return size;
	}
	public int setL2L_OD_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OD_TYP == null) {
			l_OD_TYP = new ArrayList();
		} else {
			l_OD_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OD_TYP.add(((AC0060010Struct) list.get(i)).getOD_TYP());
		}
		return size;
	}
	public int setL2L_DUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DUE_DATE == null) {
			l_DUE_DATE = new ArrayList();
		} else {
			l_DUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DUE_DATE.add(((AC0060010Struct) list.get(i)).getDUE_DATE());
		}
		return size;
	}
	public int setL2L_ODR_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_START_DATE == null) {
			l_ODR_START_DATE = new ArrayList();
		} else {
			l_ODR_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_START_DATE.add(((AC0060010Struct) list.get(i)).getODR_START_DATE());
		}
		return size;
	}
	public int setL2L_PRD_DUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRD_DUE_DATE == null) {
			l_PRD_DUE_DATE = new ArrayList();
		} else {
			l_PRD_DUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRD_DUE_DATE.add(((AC0060010Struct) list.get(i)).getPRD_DUE_DATE());
		}
		return size;
	}
	public int setL2L_PRD_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRD_START_DATE == null) {
			l_PRD_START_DATE = new ArrayList();
		} else {
			l_PRD_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRD_START_DATE.add(((AC0060010Struct) list.get(i)).getPRD_START_DATE());
		}
		return size;
	}
	public int setL2L_OD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OD_NO == null) {
			l_OD_NO = new ArrayList();
		} else {
			l_OD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OD_NO.add(((AC0060010Struct) list.get(i)).getOD_NO());
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
			l_UNIT_QTY_TYP.add(((AC0060010Struct) list.get(i)).getUNIT_QTY_TYP());
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
			l_LOT_SIZING_TYP.add(((AC0060010Struct) list.get(i)).getLOT_SIZING_TYP());
		}
		return size;
	}
	public int setL2L_EXTERNAL_PLAN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXTERNAL_PLAN_CD == null) {
			l_EXTERNAL_PLAN_CD = new ArrayList();
		} else {
			l_EXTERNAL_PLAN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXTERNAL_PLAN_CD.add(((AC0060010Struct) list.get(i)).getEXTERNAL_PLAN_CD());
		}
		return size;
	}
	public int setL2L_EXTERNAL_PLAN_EXP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXTERNAL_PLAN_EXP_TYP == null) {
			l_EXTERNAL_PLAN_EXP_TYP = new ArrayList();
		} else {
			l_EXTERNAL_PLAN_EXP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXTERNAL_PLAN_EXP_TYP.add(((AC0060010Struct) list.get(i)).getEXTERNAL_PLAN_EXP_TYP());
		}
		return size;
	}
	public int setL2L_EXTERNAL_PLAN_DEL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXTERNAL_PLAN_DEL_FLG == null) {
			l_EXTERNAL_PLAN_DEL_FLG = new ArrayList();
		} else {
			l_EXTERNAL_PLAN_DEL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXTERNAL_PLAN_DEL_FLG.add(((AC0060010Struct) list.get(i)).getEXTERNAL_PLAN_DEL_FLG());
		}
		return size;
	}
	public int setL2L_MIN_CAL_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MIN_CAL_DATE == null) {
			l_MIN_CAL_DATE = new ArrayList();
		} else {
			l_MIN_CAL_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MIN_CAL_DATE.add(((AC0060010Struct) list.get(i)).getMIN_CAL_DATE());
		}
		return size;
	}
	public int setL2L_MAX_CAL_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MAX_CAL_DATE == null) {
			l_MAX_CAL_DATE = new ArrayList();
		} else {
			l_MAX_CAL_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MAX_CAL_DATE.add(((AC0060010Struct) list.get(i)).getMAX_CAL_DATE());
		}
		return size;
	}
	public int setL2L_HOLIDAY_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HOLIDAY_FLG == null) {
			l_HOLIDAY_FLG = new ArrayList();
		} else {
			l_HOLIDAY_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HOLIDAY_FLG.add(((AC0060010Struct) list.get(i)).getHOLIDAY_FLG());
		}
		return size;
	}
	public int setL2L_OD_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OD_MODIFY_COUNT == null) {
			l_OD_MODIFY_COUNT = new ArrayList();
		} else {
			l_OD_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OD_MODIFY_COUNT.add(((AC0060010Struct) list.get(i)).getOD_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_EXT_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXT_MODIFY_COUNT == null) {
			l_EXT_MODIFY_COUNT = new ArrayList();
		} else {
			l_EXT_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXT_MODIFY_COUNT.add(((AC0060010Struct) list.get(i)).getEXT_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_ODR_RELEASE_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_RELEASE_FLG == null) {
			l_ODR_RELEASE_FLG = new ArrayList();
		} else {
			l_ODR_RELEASE_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_RELEASE_FLG.add(((AC0060010Struct) list.get(i)).getODR_RELEASE_FLG());
		}
		return size;
	}
	public int setL2L_MRP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_TYP == null) {
			l_MRP_TYP = new ArrayList();
		} else {
			l_MRP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_TYP.add(((AC0060010Struct) list.get(i)).getMRP_TYP());
		}
		return size;
	}
	public int setL2L_PARENT_OD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PARENT_OD_NO == null) {
			l_PARENT_OD_NO = new ArrayList();
		} else {
			l_PARENT_OD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PARENT_OD_NO.add(((AC0060010Struct) list.get(i)).getPARENT_OD_NO());
		}
		return size;
	}
	public int setL2L_EXTERNAL_DM_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXTERNAL_DM_FLG == null) {
			l_EXTERNAL_DM_FLG = new ArrayList();
		} else {
			l_EXTERNAL_DM_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXTERNAL_DM_FLG.add(((AC0060010Struct) list.get(i)).getEXTERNAL_DM_FLG());
		}
		return size;
	}
	public int setL2L_saveMUL_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_saveMUL_ODR_QTY == null) {
			l_saveMUL_ODR_QTY = new ArrayList();
		} else {
			l_saveMUL_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_saveMUL_ODR_QTY.add(((AC0060010Struct) list.get(i)).getsaveMUL_ODR_QTY());
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
			l_PLANT_NAME.add(((AC0060010Struct) list.get(i)).getPLANT_NAME());
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
			l_PLANT_CD.add(((AC0060010Struct) list.get(i)).getPLANT_CD());
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
			l_ITEM_CD.add(((AC0060010Struct) list.get(i)).getITEM_CD());
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
			l_ITEM_NAME.add(((AC0060010Struct) list.get(i)).getITEM_NAME());
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
			l_DRAW_CD.add(((AC0060010Struct) list.get(i)).getDRAW_CD());
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
			l_SPEC.add(((AC0060010Struct) list.get(i)).getSPEC());
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
			l_ITEM_SPOIL.add(((AC0060010Struct) list.get(i)).getITEM_SPOIL());
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
			l_MAX_PERIOD.add(((AC0060010Struct) list.get(i)).getMAX_PERIOD());
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
			l_MUL_ODR_QTY.add(((AC0060010Struct) list.get(i)).getMUL_ODR_QTY());
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
			l_MAX_ODR_QTY.add(((AC0060010Struct) list.get(i)).getMAX_ODR_QTY());
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
			l_MIN_ODR_QTY.add(((AC0060010Struct) list.get(i)).getMIN_ODR_QTY());
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
			l_STOCK_UNIT.add(((AC0060010Struct) list.get(i)).getSTOCK_UNIT());
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
			l_SAFETY_STOCK.add(((AC0060010Struct) list.get(i)).getSAFETY_STOCK());
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
			l_STOCK_ON_HAND_QTY.add(((AC0060010Struct) list.get(i)).getSTOCK_ON_HAND_QTY());
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
			l_PlanDate.add(((AC0060010Struct) list.get(i)).getPlanDate());
		}
		return size;
	}
	public int setL2L_DM_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DM_QTY == null) {
			l_DM_QTY = new ArrayList();
		} else {
			l_DM_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DM_QTY.add(((AC0060010Struct) list.get(i)).getDM_QTY());
		}
		return size;
	}
	public int setL2L_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_QTY == null) {
			l_ODR_QTY = new ArrayList();
		} else {
			l_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_QTY.add(((AC0060010Struct) list.get(i)).getODR_QTY());
		}
		return size;
	}
	public int setL2L_w_DATE_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_DATE_FROM == null) {
			l_w_DATE_FROM = new ArrayList();
		} else {
			l_w_DATE_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_DATE_FROM.add(((AC0060010Struct) list.get(i)).getw_DATE_FROM());
		}
		return size;
	}
	public int setL2L_w_DATE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_DATE_TO == null) {
			l_w_DATE_TO = new ArrayList();
		} else {
			l_w_DATE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_DATE_TO.add(((AC0060010Struct) list.get(i)).getw_DATE_TO());
		}
		return size;
	}
	public int setL2L_DUE_DATE_ALL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DUE_DATE_ALL == null) {
			l_DUE_DATE_ALL = new ArrayList();
		} else {
			l_DUE_DATE_ALL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DUE_DATE_ALL.add(((AC0060010Struct) list.get(i)).getDUE_DATE_ALL());
		}
		return size;
	}
	public int setL2L_ODR_START_DATE_ALL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_START_DATE_ALL == null) {
			l_ODR_START_DATE_ALL = new ArrayList();
		} else {
			l_ODR_START_DATE_ALL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_START_DATE_ALL.add(((AC0060010Struct) list.get(i)).getODR_START_DATE_ALL());
		}
		return size;
	}
	public int setL2L_PRD_DUE_DATE_ALL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRD_DUE_DATE_ALL == null) {
			l_PRD_DUE_DATE_ALL = new ArrayList();
		} else {
			l_PRD_DUE_DATE_ALL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRD_DUE_DATE_ALL.add(((AC0060010Struct) list.get(i)).getPRD_DUE_DATE_ALL());
		}
		return size;
	}
	public int setL2L_PRD_START_DATE_ALL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRD_START_DATE_ALL == null) {
			l_PRD_START_DATE_ALL = new ArrayList();
		} else {
			l_PRD_START_DATE_ALL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRD_START_DATE_ALL.add(((AC0060010Struct) list.get(i)).getPRD_START_DATE_ALL());
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
			l_TIME_CTRL.add(((AC0060010Struct) list.get(i)).getTIME_CTRL());
		}
		return size;
	}
	public int setL2L_PRD_DUE_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRD_DUE_TIME == null) {
			l_PRD_DUE_TIME = new ArrayList();
		} else {
			l_PRD_DUE_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRD_DUE_TIME.add(((AC0060010Struct) list.get(i)).getPRD_DUE_TIME());
		}
		return size;
	}
	public int setL2L_TIME_GET_OD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TIME_GET_OD_NO == null) {
			l_TIME_GET_OD_NO = new ArrayList();
		} else {
			l_TIME_GET_OD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TIME_GET_OD_NO.add(((AC0060010Struct) list.get(i)).getTIME_GET_OD_NO());
		}
		return size;
	}
	public int setL2L_ASP_INSTALL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ASP_INSTALL_FLG == null) {
			l_ASP_INSTALL_FLG = new ArrayList();
		} else {
			l_ASP_INSTALL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ASP_INSTALL_FLG.add(((AC0060010Struct) list.get(i)).getASP_INSTALL_FLG());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_MRP_ODR_NAME = null;
		m_OUTSIDE_NAME = null;
		m_UNIT_QTY_NAME = null;
		m_LOT_SIZING_NAME = null;
		m_PlanDemand = null;
		m_FixedDemand = null;
		m_PlanOrder = null;
		m_FixedOrder = null;
		m_ValidStock = null;
		m_LowerDeploy = null;
		m_Expect = null;
		m_r_ODR_CHOICE = null;
		m_r_DM_CHOICE = null;
		m_c_DELETE_FLG = null;
		m_c_LowerDeploy = null;
		m_dispDM_QTY = null;
		m_dispODR_QTY = null;
		m_PlanTime = null;
		m_saveDM_QTY = null;
		m_IsReleased = null;
		m_MRP_ODR_TYP = null;
		m_OUTSIDE_TYP = null;
		m_ISSUE_TYP = null;
		m_PROP_LOT_SIZE = null;
		m_ODR_LT = null;
		m_FIXED_LT = null;
		m_PROP_LT = null;
		m_SAFETY_LT = null;
		m_ISSUE_LT = null;
		m_ODR_STS_TYP = null;
		m_DM_STS_TYP = null;
		m_OD_TYP = null;
		m_DUE_DATE = null;
		m_ODR_START_DATE = null;
		m_PRD_DUE_DATE = null;
		m_PRD_START_DATE = null;
		m_OD_NO = null;
		m_UNIT_QTY_TYP = null;
		m_LOT_SIZING_TYP = null;
		m_EXTERNAL_PLAN_CD = null;
		m_EXTERNAL_PLAN_EXP_TYP = null;
		m_EXTERNAL_PLAN_DEL_FLG = null;
		m_MIN_CAL_DATE = null;
		m_MAX_CAL_DATE = null;
		m_HOLIDAY_FLG = null;
		m_OD_MODIFY_COUNT = null;
		m_EXT_MODIFY_COUNT = null;
		m_ODR_RELEASE_FLG = null;
		m_MRP_TYP = null;
		m_PARENT_OD_NO = null;
		m_EXTERNAL_DM_FLG = null;
		m_saveMUL_ODR_QTY = null;
		m_PLANT_NAME = null;
		m_PLANT_CD = null;
		m_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_DRAW_CD = null;
		m_SPEC = null;
		m_ITEM_SPOIL = null;
		m_MAX_PERIOD = null;
		m_MUL_ODR_QTY = null;
		m_MAX_ODR_QTY = null;
		m_MIN_ODR_QTY = null;
		m_STOCK_UNIT = null;
		m_SAFETY_STOCK = null;
		m_STOCK_ON_HAND_QTY = null;
		m_PlanDate = null;
		m_DM_QTY = null;
		m_ODR_QTY = null;
		m_w_DATE_FROM = null;
		m_w_DATE_TO = null;
		m_DUE_DATE_ALL = null;
		m_ODR_START_DATE_ALL = null;
		m_PRD_DUE_DATE_ALL = null;
		m_PRD_START_DATE_ALL = null;
		m_TIME_CTRL = null;
		m_PRD_DUE_TIME = null;
		m_TIME_GET_OD_NO = null;
		m_ASP_INSTALL_FLG = null;

		l_MRP_ODR_NAME = null;
		l_OUTSIDE_NAME = null;
		l_UNIT_QTY_NAME = null;
		l_LOT_SIZING_NAME = null;
		l_PlanDemand = null;
		l_FixedDemand = null;
		l_PlanOrder = null;
		l_FixedOrder = null;
		l_ValidStock = null;
		l_LowerDeploy = null;
		l_Expect = null;
		l_r_ODR_CHOICE = null;
		l_r_DM_CHOICE = null;
		l_c_DELETE_FLG = null;
		l_c_LowerDeploy = null;
		l_dispDM_QTY = null;
		l_dispODR_QTY = null;
		l_PlanTime = null;
		l_saveDM_QTY = null;
		l_IsReleased = null;
		l_MRP_ODR_TYP = null;
		l_OUTSIDE_TYP = null;
		l_ISSUE_TYP = null;
		l_PROP_LOT_SIZE = null;
		l_ODR_LT = null;
		l_FIXED_LT = null;
		l_PROP_LT = null;
		l_SAFETY_LT = null;
		l_ISSUE_LT = null;
		l_ODR_STS_TYP = null;
		l_DM_STS_TYP = null;
		l_OD_TYP = null;
		l_DUE_DATE = null;
		l_ODR_START_DATE = null;
		l_PRD_DUE_DATE = null;
		l_PRD_START_DATE = null;
		l_OD_NO = null;
		l_UNIT_QTY_TYP = null;
		l_LOT_SIZING_TYP = null;
		l_EXTERNAL_PLAN_CD = null;
		l_EXTERNAL_PLAN_EXP_TYP = null;
		l_EXTERNAL_PLAN_DEL_FLG = null;
		l_MIN_CAL_DATE = null;
		l_MAX_CAL_DATE = null;
		l_HOLIDAY_FLG = null;
		l_OD_MODIFY_COUNT = null;
		l_EXT_MODIFY_COUNT = null;
		l_ODR_RELEASE_FLG = null;
		l_MRP_TYP = null;
		l_PARENT_OD_NO = null;
		l_EXTERNAL_DM_FLG = null;
		l_saveMUL_ODR_QTY = null;
		l_PLANT_NAME = null;
		l_PLANT_CD = null;
		l_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_DRAW_CD = null;
		l_SPEC = null;
		l_ITEM_SPOIL = null;
		l_MAX_PERIOD = null;
		l_MUL_ODR_QTY = null;
		l_MAX_ODR_QTY = null;
		l_MIN_ODR_QTY = null;
		l_STOCK_UNIT = null;
		l_SAFETY_STOCK = null;
		l_STOCK_ON_HAND_QTY = null;
		l_PlanDate = null;
		l_DM_QTY = null;
		l_ODR_QTY = null;
		l_w_DATE_FROM = null;
		l_w_DATE_TO = null;
		l_DUE_DATE_ALL = null;
		l_ODR_START_DATE_ALL = null;
		l_PRD_DUE_DATE_ALL = null;
		l_PRD_START_DATE_ALL = null;
		l_TIME_CTRL = null;
		l_PRD_DUE_TIME = null;
		l_TIME_GET_OD_NO = null;
		l_ASP_INSTALL_FLG = null;

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
	 * medAC0060010クラスの標準コンストラクタ
	 */
	public AC0060010Struct()
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
	public void setStruct(AC0060010Struct struct)
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
	public void setStructM(AC0060010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setMRP_ODR_NAME(struct.getMRP_ODR_NAME());
			this.setOUTSIDE_NAME(struct.getOUTSIDE_NAME());
			this.setUNIT_QTY_NAME(struct.getUNIT_QTY_NAME());
			this.setLOT_SIZING_NAME(struct.getLOT_SIZING_NAME());
			this.setPlanDemand(struct.getPlanDemand());
			this.setFixedDemand(struct.getFixedDemand());
			this.setPlanOrder(struct.getPlanOrder());
			this.setFixedOrder(struct.getFixedOrder());
			this.setValidStock(struct.getValidStock());
			this.setLowerDeploy(struct.getLowerDeploy());
			this.setExpect(struct.getExpect());
			this.setr_ODR_CHOICE(struct.getr_ODR_CHOICE());
			this.setr_DM_CHOICE(struct.getr_DM_CHOICE());
			this.setc_DELETE_FLG(struct.getc_DELETE_FLG());
			this.setc_LowerDeploy(struct.getc_LowerDeploy());
			this.setdispDM_QTY(struct.getdispDM_QTY());
			this.setdispODR_QTY(struct.getdispODR_QTY());
			this.setPlanTime(struct.getPlanTime());
			this.setsaveDM_QTY(struct.getsaveDM_QTY());
			this.setIsReleased(struct.getIsReleased());
			this.setMRP_ODR_TYP(struct.getMRP_ODR_TYP());
			this.setOUTSIDE_TYP(struct.getOUTSIDE_TYP());
			this.setISSUE_TYP(struct.getISSUE_TYP());
			this.setPROP_LOT_SIZE(struct.getPROP_LOT_SIZE());
			this.setODR_LT(struct.getODR_LT());
			this.setFIXED_LT(struct.getFIXED_LT());
			this.setPROP_LT(struct.getPROP_LT());
			this.setSAFETY_LT(struct.getSAFETY_LT());
			this.setISSUE_LT(struct.getISSUE_LT());
			this.setODR_STS_TYP(struct.getODR_STS_TYP());
			this.setDM_STS_TYP(struct.getDM_STS_TYP());
			this.setOD_TYP(struct.getOD_TYP());
			this.setDUE_DATE(struct.getDUE_DATE());
			this.setODR_START_DATE(struct.getODR_START_DATE());
			this.setPRD_DUE_DATE(struct.getPRD_DUE_DATE());
			this.setPRD_START_DATE(struct.getPRD_START_DATE());
			this.setOD_NO(struct.getOD_NO());
			this.setUNIT_QTY_TYP(struct.getUNIT_QTY_TYP());
			this.setLOT_SIZING_TYP(struct.getLOT_SIZING_TYP());
			this.setEXTERNAL_PLAN_CD(struct.getEXTERNAL_PLAN_CD());
			this.setEXTERNAL_PLAN_EXP_TYP(struct.getEXTERNAL_PLAN_EXP_TYP());
			this.setEXTERNAL_PLAN_DEL_FLG(struct.getEXTERNAL_PLAN_DEL_FLG());
			this.setMIN_CAL_DATE(struct.getMIN_CAL_DATE());
			this.setMAX_CAL_DATE(struct.getMAX_CAL_DATE());
			this.setHOLIDAY_FLG(struct.getHOLIDAY_FLG());
			this.setOD_MODIFY_COUNT(struct.getOD_MODIFY_COUNT());
			this.setEXT_MODIFY_COUNT(struct.getEXT_MODIFY_COUNT());
			this.setODR_RELEASE_FLG(struct.getODR_RELEASE_FLG());
			this.setMRP_TYP(struct.getMRP_TYP());
			this.setPARENT_OD_NO(struct.getPARENT_OD_NO());
			this.setEXTERNAL_DM_FLG(struct.getEXTERNAL_DM_FLG());
			this.setsaveMUL_ODR_QTY(struct.getsaveMUL_ODR_QTY());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setITEM_CD(struct.getITEM_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setDRAW_CD(struct.getDRAW_CD());
			this.setSPEC(struct.getSPEC());
			this.setITEM_SPOIL(struct.getITEM_SPOIL());
			this.setMAX_PERIOD(struct.getMAX_PERIOD());
			this.setMUL_ODR_QTY(struct.getMUL_ODR_QTY());
			this.setMAX_ODR_QTY(struct.getMAX_ODR_QTY());
			this.setMIN_ODR_QTY(struct.getMIN_ODR_QTY());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setSAFETY_STOCK(struct.getSAFETY_STOCK());
			this.setSTOCK_ON_HAND_QTY(struct.getSTOCK_ON_HAND_QTY());
			this.setPlanDate(struct.getPlanDate());
			this.setDM_QTY(struct.getDM_QTY());
			this.setODR_QTY(struct.getODR_QTY());
			this.setw_DATE_FROM(struct.getw_DATE_FROM());
			this.setw_DATE_TO(struct.getw_DATE_TO());
			this.setDUE_DATE_ALL(struct.getDUE_DATE_ALL());
			this.setODR_START_DATE_ALL(struct.getODR_START_DATE_ALL());
			this.setPRD_DUE_DATE_ALL(struct.getPRD_DUE_DATE_ALL());
			this.setPRD_START_DATE_ALL(struct.getPRD_START_DATE_ALL());
			this.setTIME_CTRL(struct.getTIME_CTRL());
			this.setPRD_DUE_TIME(struct.getPRD_DUE_TIME());
			this.setTIME_GET_OD_NO(struct.getTIME_GET_OD_NO());
			this.setASP_INSTALL_FLG(struct.getASP_INSTALL_FLG());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AC0060010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_MRP_ODR_NAME(struct.getList_MRP_ODR_NAME());
			this.setList_OUTSIDE_NAME(struct.getList_OUTSIDE_NAME());
			this.setList_UNIT_QTY_NAME(struct.getList_UNIT_QTY_NAME());
			this.setList_LOT_SIZING_NAME(struct.getList_LOT_SIZING_NAME());
			this.setList_PlanDemand(struct.getList_PlanDemand());
			this.setList_FixedDemand(struct.getList_FixedDemand());
			this.setList_PlanOrder(struct.getList_PlanOrder());
			this.setList_FixedOrder(struct.getList_FixedOrder());
			this.setList_ValidStock(struct.getList_ValidStock());
			this.setList_LowerDeploy(struct.getList_LowerDeploy());
			this.setList_Expect(struct.getList_Expect());
			this.setList_r_ODR_CHOICE(struct.getList_r_ODR_CHOICE());
			this.setList_r_DM_CHOICE(struct.getList_r_DM_CHOICE());
			this.setList_c_DELETE_FLG(struct.getList_c_DELETE_FLG());
			this.setList_c_LowerDeploy(struct.getList_c_LowerDeploy());
			this.setList_dispDM_QTY(struct.getList_dispDM_QTY());
			this.setList_dispODR_QTY(struct.getList_dispODR_QTY());
			this.setList_PlanTime(struct.getList_PlanTime());
			this.setList_saveDM_QTY(struct.getList_saveDM_QTY());
			this.setList_IsReleased(struct.getList_IsReleased());
			this.setList_MRP_ODR_TYP(struct.getList_MRP_ODR_TYP());
			this.setList_OUTSIDE_TYP(struct.getList_OUTSIDE_TYP());
			this.setList_ISSUE_TYP(struct.getList_ISSUE_TYP());
			this.setList_PROP_LOT_SIZE(struct.getList_PROP_LOT_SIZE());
			this.setList_ODR_LT(struct.getList_ODR_LT());
			this.setList_FIXED_LT(struct.getList_FIXED_LT());
			this.setList_PROP_LT(struct.getList_PROP_LT());
			this.setList_SAFETY_LT(struct.getList_SAFETY_LT());
			this.setList_ISSUE_LT(struct.getList_ISSUE_LT());
			this.setList_ODR_STS_TYP(struct.getList_ODR_STS_TYP());
			this.setList_DM_STS_TYP(struct.getList_DM_STS_TYP());
			this.setList_OD_TYP(struct.getList_OD_TYP());
			this.setList_DUE_DATE(struct.getList_DUE_DATE());
			this.setList_ODR_START_DATE(struct.getList_ODR_START_DATE());
			this.setList_PRD_DUE_DATE(struct.getList_PRD_DUE_DATE());
			this.setList_PRD_START_DATE(struct.getList_PRD_START_DATE());
			this.setList_OD_NO(struct.getList_OD_NO());
			this.setList_UNIT_QTY_TYP(struct.getList_UNIT_QTY_TYP());
			this.setList_LOT_SIZING_TYP(struct.getList_LOT_SIZING_TYP());
			this.setList_EXTERNAL_PLAN_CD(struct.getList_EXTERNAL_PLAN_CD());
			this.setList_EXTERNAL_PLAN_EXP_TYP(struct.getList_EXTERNAL_PLAN_EXP_TYP());
			this.setList_EXTERNAL_PLAN_DEL_FLG(struct.getList_EXTERNAL_PLAN_DEL_FLG());
			this.setList_MIN_CAL_DATE(struct.getList_MIN_CAL_DATE());
			this.setList_MAX_CAL_DATE(struct.getList_MAX_CAL_DATE());
			this.setList_HOLIDAY_FLG(struct.getList_HOLIDAY_FLG());
			this.setList_OD_MODIFY_COUNT(struct.getList_OD_MODIFY_COUNT());
			this.setList_EXT_MODIFY_COUNT(struct.getList_EXT_MODIFY_COUNT());
			this.setList_ODR_RELEASE_FLG(struct.getList_ODR_RELEASE_FLG());
			this.setList_MRP_TYP(struct.getList_MRP_TYP());
			this.setList_PARENT_OD_NO(struct.getList_PARENT_OD_NO());
			this.setList_EXTERNAL_DM_FLG(struct.getList_EXTERNAL_DM_FLG());
			this.setList_saveMUL_ODR_QTY(struct.getList_saveMUL_ODR_QTY());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_DRAW_CD(struct.getList_DRAW_CD());
			this.setList_SPEC(struct.getList_SPEC());
			this.setList_ITEM_SPOIL(struct.getList_ITEM_SPOIL());
			this.setList_MAX_PERIOD(struct.getList_MAX_PERIOD());
			this.setList_MUL_ODR_QTY(struct.getList_MUL_ODR_QTY());
			this.setList_MAX_ODR_QTY(struct.getList_MAX_ODR_QTY());
			this.setList_MIN_ODR_QTY(struct.getList_MIN_ODR_QTY());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_SAFETY_STOCK(struct.getList_SAFETY_STOCK());
			this.setList_STOCK_ON_HAND_QTY(struct.getList_STOCK_ON_HAND_QTY());
			this.setList_PlanDate(struct.getList_PlanDate());
			this.setList_DM_QTY(struct.getList_DM_QTY());
			this.setList_ODR_QTY(struct.getList_ODR_QTY());
			this.setList_w_DATE_FROM(struct.getList_w_DATE_FROM());
			this.setList_w_DATE_TO(struct.getList_w_DATE_TO());
			this.setList_DUE_DATE_ALL(struct.getList_DUE_DATE_ALL());
			this.setList_ODR_START_DATE_ALL(struct.getList_ODR_START_DATE_ALL());
			this.setList_PRD_DUE_DATE_ALL(struct.getList_PRD_DUE_DATE_ALL());
			this.setList_PRD_START_DATE_ALL(struct.getList_PRD_START_DATE_ALL());
			this.setList_TIME_CTRL(struct.getList_TIME_CTRL());
			this.setList_PRD_DUE_TIME(struct.getList_PRD_DUE_TIME());
			this.setList_TIME_GET_OD_NO(struct.getList_TIME_GET_OD_NO());
			this.setList_ASP_INSTALL_FLG(struct.getList_ASP_INSTALL_FLG());
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
	// 第 1 変数初期値： i_MRP_ODR_NAME


	final static String i_MRP_ODR_NAME = null;

	// 第 2 変数初期値： i_OUTSIDE_NAME


	final static String i_OUTSIDE_NAME = null;

	// 第 3 変数初期値： i_UNIT_QTY_NAME


	final static String i_UNIT_QTY_NAME = null;

	// 第 4 変数初期値： i_LOT_SIZING_NAME


	final static String i_LOT_SIZING_NAME = null;

	// 第 5 変数初期値： i_PlanDemand


	final static String i_PlanDemand = null;

	// 第 6 変数初期値： i_FixedDemand


	final static String i_FixedDemand = null;

	// 第 7 変数初期値： i_PlanOrder


	final static String i_PlanOrder = null;

	// 第 8 変数初期値： i_FixedOrder


	final static String i_FixedOrder = null;

	// 第 9 変数初期値： i_ValidStock


	final static String i_ValidStock = null;

	// 第 10 変数初期値： i_LowerDeploy


	final static String i_LowerDeploy = null;

	// 第 11 変数初期値： i_Expect


	final static String i_Expect = null;

	// 第 12 変数初期値： i_r_ODR_CHOICE


	final static String i_r_ODR_CHOICE = null;

	// 第 13 変数初期値： i_r_DM_CHOICE


	final static String i_r_DM_CHOICE = null;

	// 第 14 変数初期値： i_c_DELETE_FLG


	final static String i_c_DELETE_FLG = null;

	// 第 15 変数初期値： i_c_LowerDeploy


	final static String i_c_LowerDeploy = null;

	// 第 16 変数初期値： i_dispDM_QTY


	final static String i_dispDM_QTY = null;

	// 第 17 変数初期値： i_dispODR_QTY


	final static String i_dispODR_QTY = null;

	// 第 18 変数初期値： i_PlanTime


	final static String i_PlanTime = null;

	// 第 19 変数初期値： i_saveDM_QTY


	final static String i_saveDM_QTY = null;

	// 第 20 変数初期値： i_IsReleased


	final static String i_IsReleased = null;

	// 第 21 変数初期値： i_MRP_ODR_TYP


	final static String i_MRP_ODR_TYP = null;

	// 第 22 変数初期値： i_OUTSIDE_TYP


	final static String i_OUTSIDE_TYP = null;

	// 第 23 変数初期値： i_ISSUE_TYP


	final static String i_ISSUE_TYP = null;

	// 第 24 変数初期値： i_PROP_LOT_SIZE


	final static String i_PROP_LOT_SIZE = null;

	// 第 25 変数初期値： i_ODR_LT


	final static String i_ODR_LT = null;

	// 第 26 変数初期値： i_FIXED_LT


	final static String i_FIXED_LT = null;

	// 第 27 変数初期値： i_PROP_LT


	final static String i_PROP_LT = null;

	// 第 28 変数初期値： i_SAFETY_LT


	final static String i_SAFETY_LT = null;

	// 第 29 変数初期値： i_ISSUE_LT


	final static String i_ISSUE_LT = null;

	// 第 30 変数初期値： i_ODR_STS_TYP


	final static String i_ODR_STS_TYP = null;

	// 第 31 変数初期値： i_DM_STS_TYP


	final static String i_DM_STS_TYP = null;

	// 第 32 変数初期値： i_OD_TYP


	final static String i_OD_TYP = null;

	// 第 33 変数初期値： i_DUE_DATE


	final static java.util.Date i_DUE_DATE = null;

	// 第 34 変数初期値： i_ODR_START_DATE


	final static java.util.Date i_ODR_START_DATE = null;

	// 第 35 変数初期値： i_PRD_DUE_DATE


	final static java.util.Date i_PRD_DUE_DATE = null;

	// 第 36 変数初期値： i_PRD_START_DATE


	final static java.util.Date i_PRD_START_DATE = null;

	// 第 37 変数初期値： i_OD_NO


	final static String i_OD_NO = null;

	// 第 38 変数初期値： i_UNIT_QTY_TYP


	final static String i_UNIT_QTY_TYP = null;

	// 第 39 変数初期値： i_LOT_SIZING_TYP


	final static String i_LOT_SIZING_TYP = null;

	// 第 40 変数初期値： i_EXTERNAL_PLAN_CD


	final static String i_EXTERNAL_PLAN_CD = null;

	// 第 41 変数初期値： i_EXTERNAL_PLAN_EXP_TYP


	final static String i_EXTERNAL_PLAN_EXP_TYP = null;

	// 第 42 変数初期値： i_EXTERNAL_PLAN_DEL_FLG


	final static String i_EXTERNAL_PLAN_DEL_FLG = null;

	// 第 43 変数初期値： i_MIN_CAL_DATE


	final static String i_MIN_CAL_DATE = null;

	// 第 44 変数初期値： i_MAX_CAL_DATE


	final static String i_MAX_CAL_DATE = null;

	// 第 45 変数初期値： i_HOLIDAY_FLG


	final static Integer i_HOLIDAY_FLG = null;

	// 第 46 変数初期値： i_OD_MODIFY_COUNT


	final static String i_OD_MODIFY_COUNT = null;

	// 第 47 変数初期値： i_EXT_MODIFY_COUNT


	final static String i_EXT_MODIFY_COUNT = null;

	// 第 48 変数初期値： i_ODR_RELEASE_FLG


	final static String i_ODR_RELEASE_FLG = null;

	// 第 49 変数初期値： i_MRP_TYP


	final static String i_MRP_TYP = null;

	// 第 50 変数初期値： i_PARENT_OD_NO


	final static String i_PARENT_OD_NO = null;

	// 第 51 変数初期値： i_EXTERNAL_DM_FLG


	final static String i_EXTERNAL_DM_FLG = null;

	// 第 52 変数初期値： i_saveMUL_ODR_QTY


	final static String i_saveMUL_ODR_QTY = null;

	// 第 53 変数初期値： i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// 第 54 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

	// 第 55 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 56 変数初期値： i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// 第 57 変数初期値： i_DRAW_CD


	final static String i_DRAW_CD = null;

	// 第 58 変数初期値： i_SPEC


	final static String i_SPEC = null;

	// 第 59 変数初期値： i_ITEM_SPOIL


	final static String i_ITEM_SPOIL = null;

	// 第 60 変数初期値： i_MAX_PERIOD


	final static String i_MAX_PERIOD = null;

	// 第 61 変数初期値： i_MUL_ODR_QTY


	final static String i_MUL_ODR_QTY = null;

	// 第 62 変数初期値： i_MAX_ODR_QTY


	final static String i_MAX_ODR_QTY = null;

	// 第 63 変数初期値： i_MIN_ODR_QTY


	final static String i_MIN_ODR_QTY = null;

	// 第 64 変数初期値： i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// 第 65 変数初期値： i_SAFETY_STOCK


	final static String i_SAFETY_STOCK = null;

	// 第 66 変数初期値： i_STOCK_ON_HAND_QTY


	final static String i_STOCK_ON_HAND_QTY = null;

	// 第 67 変数初期値： i_PlanDate


	final static String i_PlanDate = null;

	// 第 68 変数初期値： i_DM_QTY


	final static String i_DM_QTY = null;

	// 第 69 変数初期値： i_ODR_QTY


	final static String i_ODR_QTY = null;

	// 第 70 変数初期値： i_w_DATE_FROM


	final static String i_w_DATE_FROM = null;

	// 第 71 変数初期値： i_w_DATE_TO


	final static String i_w_DATE_TO = null;

	// 第 72 変数初期値： i_DUE_DATE_ALL


	final static String i_DUE_DATE_ALL = null;

	// 第 73 変数初期値： i_ODR_START_DATE_ALL


	final static String i_ODR_START_DATE_ALL = null;

	// 第 74 変数初期値： i_PRD_DUE_DATE_ALL


	final static String i_PRD_DUE_DATE_ALL = null;

	// 第 75 変数初期値： i_PRD_START_DATE_ALL


	final static String i_PRD_START_DATE_ALL = null;

	// 第 76 変数初期値： i_TIME_CTRL


	final static String i_TIME_CTRL = null;

	// 第 77 変数初期値： i_PRD_DUE_TIME


	final static String i_PRD_DUE_TIME = null;

	// 第 78 変数初期値： i_TIME_GET_OD_NO


	final static String i_TIME_GET_OD_NO = null;

	// 第 79 変数初期値： i_ASP_INSTALL_FLG


	final static String i_ASP_INSTALL_FLG = null;

*/

	//{{user_implement_code
        /** 工場読み込み部分のクリア */
        public void clearAboutPlant(){ m_PLANT_NAME = null;}
        /**
         * 工場読み込みデータの取り込み
         * @param s 読み込んだデータ
         */
        public void importPlant(AC0060010Struct from)
        {
         clearAboutPlant();
         if(from.m_PLANT_NAME != null) m_PLANT_NAME = new String(from.m_PLANT_NAME);
        }
        /** 品目読み込み部分のクリア */
        public void clearAboutItem()
        {
         m_ITEM_NAME = null;
         m_DRAW_CD = null;
         m_SPEC = null;
         m_ITEM_SPOIL = null;
         m_MAX_PERIOD = null;
         m_MAX_ODR_QTY = null;
         m_MIN_ODR_QTY = null;
         m_MRP_ODR_TYP = null;
         m_OUTSIDE_TYP = null;
         m_UNIT_QTY_TYP = null;
         m_LOT_SIZING_TYP = null;
         m_FIXED_LT = null;
         m_PROP_LT = null;
         m_SAFETY_LT = null;
         m_ISSUE_LT = null;
         m_ISSUE_TYP = null;
         m_PROP_LOT_SIZE = null;
         m_SAFETY_STOCK = null;
         m_MRP_ODR_NAME = null;
         m_OUTSIDE_NAME = null;
         m_UNIT_QTY_NAME = null;
         m_LOT_SIZING_NAME = null;
        }
        /**
         * 品目読み込みデータの取り込み
         * @param s 読み込んだデータ
         */
        public void importItem(AC0060010Struct from)
        {
         clearAboutItem();
       
         if(from.m_ITEM_CD != null) m_ITEM_CD = new String(from.m_ITEM_CD);
         if(from.m_ITEM_NAME != null) m_ITEM_NAME = new String(from.m_ITEM_NAME);
         if(from.m_DRAW_CD != null) m_DRAW_CD = new String(from.m_DRAW_CD);
         if(from.m_SPEC != null) m_SPEC = new String(from.m_SPEC);
         if(from.m_ITEM_SPOIL != null) m_ITEM_SPOIL = new String(from.m_ITEM_SPOIL);
         if(from.m_MAX_PERIOD != null) m_MAX_PERIOD = new String(from.m_MAX_PERIOD);
         if(from.m_MUL_ODR_QTY != null) m_MUL_ODR_QTY = new String(from.m_MUL_ODR_QTY);
         if(from.m_MAX_ODR_QTY != null) m_MAX_ODR_QTY = new String(from.m_MAX_ODR_QTY);
         if(from.m_MIN_ODR_QTY != null) m_MIN_ODR_QTY = new String(from.m_MIN_ODR_QTY);
         if(from.m_MRP_ODR_TYP != null) m_MRP_ODR_TYP = new String(from.m_MRP_ODR_TYP);
         if(from.m_OUTSIDE_TYP != null) m_OUTSIDE_TYP = new String(from.m_OUTSIDE_TYP);
         if(from.m_UNIT_QTY_TYP != null) m_UNIT_QTY_TYP = new String(from.m_UNIT_QTY_TYP);
         if(from.m_LOT_SIZING_TYP != null) m_LOT_SIZING_TYP = new String(from.m_LOT_SIZING_TYP);
         if(from.m_ODR_LT != null) m_ODR_LT = new String(from.m_ODR_LT);
         if(from.m_FIXED_LT != null) m_FIXED_LT = new String(from.m_FIXED_LT);
         if(from.m_PROP_LT != null) m_PROP_LT = new String(from.m_PROP_LT);
         if(from.m_SAFETY_LT != null) m_SAFETY_LT = new String(from.m_SAFETY_LT);
         if(from.m_ISSUE_LT != null) m_ISSUE_LT = new String(from.m_ISSUE_LT);
         if(from.m_ISSUE_TYP != null) m_ISSUE_TYP = new String(from.m_ISSUE_TYP);
         if(from.m_STOCK_UNIT != null) m_STOCK_UNIT = new String(from.m_STOCK_UNIT);
         if(from.m_PROP_LOT_SIZE != null) m_PROP_LOT_SIZE = new String(from.m_PROP_LOT_SIZE);
         if(from.m_SAFETY_STOCK != null) m_SAFETY_STOCK = new String(from.m_SAFETY_STOCK);
         if(from.m_MRP_ODR_NAME != null) m_MRP_ODR_NAME = new String(from.m_MRP_ODR_NAME);
         if(from.m_OUTSIDE_NAME != null) m_OUTSIDE_NAME = new String(from.m_OUTSIDE_NAME);
         if(from.m_UNIT_QTY_NAME != null) m_UNIT_QTY_NAME = new String(from.m_UNIT_QTY_NAME);
        }
        /** 保管区別品目在庫読み込み部分のクリア(0を設定) */
        public void clearAboutItemStockByPlant(){ m_STOCK_ON_HAND_QTY = new String("0.0"); }
        /**
         * 保管区別品目在庫読み込みデータの取り込み
         * 該当する情報以外はクリアしない。
         * @param s 読み込んだデータ
         */
        public void importItemStockByPlant(AC0060010Struct from)
        {
         clearAboutItemStockByPlant();
         if(from.m_STOCK_ON_HAND_QTY != null) m_STOCK_ON_HAND_QTY = new String(from.m_STOCK_ON_HAND_QTY);
        }
        //--------------------------------------------------------------------
        // 在庫情報、計画情報の設定
        // 日付、計画オーダ、確定オーダ、計画デマンド、確定デマンド、有効在庫は
        // Structの直持ち変数に設定
        // 外部オーダ、外部デマンドの情報は Structのlist変数に設定
        // listに設定する値は 各変数で長さがそろっていることを前提とする。
        /*
         * 過去分の在庫情報の取り込み<br>
         * 在庫で使用する情報以外はクリアしない
         * @param mrp 在庫情報
         * @param locale 言語のロケール
         */
        public void importPastStock(MrpData stock, String locale)
        {
         if(stock == null){
          m_PlanDate = "";
          m_FixedDemand = "0.0";
          m_PlanDemand = "0.0";
          m_FixedOrder = "0.0";
          m_PlanOrder = "0.0";
          m_ValidStock = "0.0";
          m_HOLIDAY_FLG = new Integer(AC0060Const.C_WORKDAY);
          return;
         }
         m_ValidStock = stock.getStock();
         m_HOLIDAY_FLG = new Integer(AC0060Const.C_WORKDAY);
         
         // 日付文字列には辞書から「過去」文字列を設定
         m_PlanDate = null;
         if(locale != null){
          ResourceBundle rb = CoreTools.getResourceBundle(AC0060Const.C_DICNAME,locale);
          m_PlanDate = CoreTools.getRBString(AC0060Const.C_KEYWORD_PAST,rb);
         }
         return;
        }
        /**
         * MrpDataからのデータ取り込み
         * @param in 日付/オーダ/デマンド/在庫の情報
         */
        public void importMrpData(MrpData in)
        {
         m_PlanDate = in.getPlanDate();
         boolean isHoliday = in.getHoliday();
         if(isHoliday)
          m_HOLIDAY_FLG = new Integer(AC0060Const.C_HOLIDAY);
         else
          m_HOLIDAY_FLG = new Integer(AC0060Const.C_WORKDAY);
         m_PlanDemand = in.getPlanDemand();
         m_FixedDemand = in.getFixDemand();
         m_PlanOrder = in.getPlanOrder();
         m_FixedOrder = in.getFixOrder();
         m_ValidStock = in.getStock();
        }
        /**
         * 外部オーダ/外部デマンドの情報を自身に追加
         * @param s 外部オーダ/外部デマンドの情報
         */
        public void addExternData(AC0060010Struct s)
        {
         if(l_EXTERNAL_PLAN_CD == null){
          l_OD_NO = new ArrayList(0);
          l_OD_TYP = new ArrayList(0);
          l_PlanDate = new ArrayList(0);
          l_DM_QTY = new ArrayList(0);
          l_ODR_QTY = new ArrayList(0);
          l_Expect = new ArrayList(0);
          l_EXTERNAL_PLAN_CD = new ArrayList(0);
          l_EXTERNAL_DM_FLG = new ArrayList(0);
          l_EXTERNAL_PLAN_EXP_TYP = new ArrayList(0);
          l_EXTERNAL_PLAN_DEL_FLG = new ArrayList(0);
          l_OD_MODIFY_COUNT = new ArrayList(0);
          l_EXT_MODIFY_COUNT = new ArrayList(0);
          l_IsReleased = new ArrayList(0);
          l_MRP_TYP = new ArrayList(0);
          l_LowerDeploy = new ArrayList(0);
         }
         l_OD_NO.add(s.m_OD_NO);
         l_OD_TYP.add(s.m_OD_TYP);
         l_PlanDate.add(s.m_PlanDate);
         l_DM_QTY.add(s.m_DM_QTY);
         l_ODR_QTY.add(s.m_ODR_QTY);
         l_Expect.add(s.m_Expect);
         l_EXTERNAL_PLAN_CD.add(s.m_EXTERNAL_PLAN_CD);
         l_EXTERNAL_DM_FLG.add(s.m_EXTERNAL_DM_FLG);
         l_EXTERNAL_PLAN_EXP_TYP.add(s.m_EXTERNAL_PLAN_EXP_TYP);
         l_EXTERNAL_PLAN_DEL_FLG.add(s.m_EXTERNAL_PLAN_DEL_FLG);
         l_OD_MODIFY_COUNT.add(s.m_OD_MODIFY_COUNT);
         l_EXT_MODIFY_COUNT.add(s.m_EXT_MODIFY_COUNT);
         l_IsReleased.add(s.m_IsReleased);
         l_MRP_TYP.add(s.m_MRP_TYP);
         l_LowerDeploy.add(s.m_LowerDeploy);
        }
        /**
         * 外部オーダ/外部デマンドの設定数返却(オーダ番号の設定数で判定)
         * @return 外部オーダと外部デマンドの数合計
         */
        public int externDataSize()
        {
         if(l_EXTERNAL_PLAN_CD == null)  return 0;
         return l_EXTERNAL_PLAN_CD.size();
        }
        /**
         * 外部オーダ/デマンド情報を直持ち変数に取り込み
         * @param in 外部オーダ/デマンドをリスト形式で持っている情報
         * @param index 取得するインデックス
         * @return true:該当インデックスの情報あり / false:該当インデックスの情報なし
         * @see addExternData
         */
        public boolean importExternData(AC0060010Struct in)
        {
         if(in == null)  return false;
       //		if(in.m_PlanDate != null)  m_PlanDate = new String(in.m_PlanDate);
         if(in.m_OD_NO != null)  m_OD_NO = new String(in.m_OD_NO);
         if(in.m_OD_TYP != null)  m_OD_TYP = new String(in.m_OD_TYP);
         if(in.m_PlanDate != null)  m_PlanDate = new String(in.m_PlanDate);
         if(in.m_DM_QTY != null)  m_DM_QTY = new String(in.m_DM_QTY);
         if(in.m_ODR_QTY != null)  m_ODR_QTY = new String(in.m_ODR_QTY);
         if(in.m_Expect != null)  m_Expect = new String(in.m_Expect);
         m_EXTERNAL_PLAN_CD = new String(in.m_EXTERNAL_PLAN_CD);
         if(in.m_EXTERNAL_DM_FLG != null)  m_EXTERNAL_DM_FLG = new String(in.m_EXTERNAL_DM_FLG);
         if(in.m_EXTERNAL_PLAN_EXP_TYP != null)  m_EXTERNAL_PLAN_EXP_TYP = new String(in.m_EXTERNAL_PLAN_EXP_TYP);
         if(in.m_EXTERNAL_PLAN_DEL_FLG != null)  m_EXTERNAL_PLAN_DEL_FLG = new String(in.m_EXTERNAL_PLAN_DEL_FLG);
         if(in.m_OD_MODIFY_COUNT != null)  m_OD_MODIFY_COUNT = new String(in.m_OD_MODIFY_COUNT);
         if(in.m_EXT_MODIFY_COUNT != null)  m_EXT_MODIFY_COUNT = new String(in.m_EXT_MODIFY_COUNT);
         if(in.m_IsReleased != null)  m_IsReleased = new String(in.m_IsReleased);
         if(in.m_MRP_TYP != null)  m_MRP_TYP = new String(in.m_MRP_TYP);
         if(in.m_LowerDeploy != null)  m_LowerDeploy = new String(in.m_LowerDeploy);
         return true;
        }
         
        /**
         * 初期設定
         */
        public void initialize()
        {
         clear();
         m_DM_QTY = "0";
         m_ODR_QTY = "0";
        }
         
        /**	
         * 直持ち変数のコピー	
         * @param s コピー元	
         */	
        public void copy(AC0060010Struct s)	
        {	
         clear();
         if(s.sUser_ID != null) sUser_ID = new String(s.sUser_ID);
         if(s.sSysdate != null) sSysdate = new String(s.sSysdate);
         if(s.m_PLANT_NAME != null) m_PLANT_NAME = new String(s.m_PLANT_NAME);
         if(s.m_PLANT_CD != null) m_PLANT_CD = new String(s.m_PLANT_CD);
         if(s.m_ITEM_CD != null) m_ITEM_CD = new String(s.m_ITEM_CD);
         if(s.m_ITEM_NAME != null) m_ITEM_NAME = new String(s.m_ITEM_NAME);
         if(s.m_DRAW_CD != null) m_DRAW_CD = new String(s.m_DRAW_CD);
         if(s.m_SPEC != null) m_SPEC = new String(s.m_SPEC);
         if(s.m_ITEM_SPOIL != null) m_ITEM_SPOIL = new String(s.m_ITEM_SPOIL);
         if(s.m_MAX_PERIOD != null) m_MAX_PERIOD = new String(s.m_MAX_PERIOD);
         if(s.m_MUL_ODR_QTY != null) m_MUL_ODR_QTY = new String(s.m_MUL_ODR_QTY);
         if(s.m_MAX_ODR_QTY != null) m_MAX_ODR_QTY = new String(s.m_MAX_ODR_QTY);
         if(s.m_MIN_ODR_QTY != null) m_MIN_ODR_QTY = new String(s.m_MIN_ODR_QTY);
         if(s.m_MRP_ODR_TYP != null) m_MRP_ODR_TYP = new String(s.m_MRP_ODR_TYP);
         if(s.m_OUTSIDE_TYP != null) m_OUTSIDE_TYP = new String(s.m_OUTSIDE_TYP);
         if(s.m_UNIT_QTY_TYP != null) m_UNIT_QTY_TYP = new String(s.m_UNIT_QTY_TYP);
         if(s.m_LOT_SIZING_TYP != null) m_LOT_SIZING_TYP = new String(s.m_LOT_SIZING_TYP);
         if(s.m_ODR_LT != null) m_ODR_LT = new String(s.m_ODR_LT);
         if(s.m_FIXED_LT != null) m_FIXED_LT = new String(s.m_FIXED_LT);
         if(s.m_PROP_LT != null) m_PROP_LT = new String(s.m_PROP_LT);
         if(s.m_SAFETY_LT != null) m_SAFETY_LT = new String(s.m_SAFETY_LT);
         if(s.m_ISSUE_LT != null) m_ISSUE_LT = new String(s.m_ISSUE_LT);
         if(s.m_ISSUE_TYP != null) m_ISSUE_TYP = new String(s.m_ISSUE_TYP);
         if(s.m_PROP_LOT_SIZE != null) m_PROP_LOT_SIZE = new String(s.m_PROP_LOT_SIZE);
         if(s.m_SAFETY_STOCK != null) m_SAFETY_STOCK = new String(s.m_SAFETY_STOCK);
         if(s.m_STOCK_ON_HAND_QTY != null) m_STOCK_ON_HAND_QTY = new String(s.m_STOCK_ON_HAND_QTY);
         if(s.m_OD_NO != null) m_OD_NO = new String(s.m_OD_NO);
         if(s.m_PlanDate != null) m_PlanDate = new String(s.m_PlanDate);
         if(s.m_DM_QTY != null) m_DM_QTY = new String(s.m_DM_QTY);
         if(s.m_ODR_QTY != null) m_ODR_QTY = new String(s.m_ODR_QTY);
         if(s.m_OD_TYP != null) m_OD_TYP = new String(s.m_OD_TYP);
         if(s.m_ODR_STS_TYP != null) m_ODR_STS_TYP = new String(s.m_ODR_STS_TYP);
         if(s.m_DM_STS_TYP != null) m_DM_STS_TYP = new String(s.m_DM_STS_TYP);
         if(s.m_MRP_TYP != null) m_MRP_TYP = new String(s.m_MRP_TYP);
         if(s.m_EXTERNAL_DM_FLG != null) m_EXTERNAL_DM_FLG = new String(s.m_EXTERNAL_DM_FLG);
         if(s.m_ODR_RELEASE_FLG != null) m_ODR_RELEASE_FLG = new String(s.m_ODR_RELEASE_FLG);
         if(s.m_PARENT_OD_NO != null) m_PARENT_OD_NO = new String(s.m_PARENT_OD_NO);
         if(s.m_OD_MODIFY_COUNT != null) m_OD_MODIFY_COUNT = new String(s.m_OD_MODIFY_COUNT);
         if(s.m_EXTERNAL_PLAN_CD != null) m_EXTERNAL_PLAN_CD = new String(s.m_EXTERNAL_PLAN_CD);
         if(s.m_EXTERNAL_PLAN_EXP_TYP != null) m_EXTERNAL_PLAN_EXP_TYP = new String(s.m_EXTERNAL_PLAN_EXP_TYP);
         if(s.m_EXTERNAL_PLAN_DEL_FLG != null) m_EXTERNAL_PLAN_DEL_FLG = new String(s.m_EXTERNAL_PLAN_DEL_FLG);
         if(s.m_EXT_MODIFY_COUNT != null) m_EXT_MODIFY_COUNT = new String(s.m_EXT_MODIFY_COUNT);
         if(s.m_w_DATE_FROM != null) m_w_DATE_FROM = new String(s.m_w_DATE_FROM);
         if(s.m_w_DATE_TO != null) m_w_DATE_TO = new String(s.m_w_DATE_TO);
         if(s.m_DUE_DATE != null) m_DUE_DATE = new java.util.Date(s.m_DUE_DATE.getTime());
         if(s.m_ODR_START_DATE != null) m_ODR_START_DATE = new java.util.Date(s.m_ODR_START_DATE.getTime());
         if(s.m_PRD_DUE_DATE != null) m_PRD_DUE_DATE = new java.util.Date(s.m_PRD_DUE_DATE.getTime());
         if(s.m_PRD_START_DATE != null) m_PRD_START_DATE = new java.util.Date(s.m_PRD_START_DATE.getTime());
         if(s.m_MIN_CAL_DATE != null) m_MIN_CAL_DATE = new String(s.m_MIN_CAL_DATE);
         if(s.m_MAX_CAL_DATE != null) m_MAX_CAL_DATE = new String(s.m_MAX_CAL_DATE);
         if(s.m_MRP_ODR_NAME != null) m_MRP_ODR_NAME = new String(s.m_MRP_ODR_NAME);
         if(s.m_OUTSIDE_NAME != null) m_OUTSIDE_NAME = new String(s.m_OUTSIDE_NAME);
         if(s.m_UNIT_QTY_NAME != null) m_UNIT_QTY_NAME = new String(s.m_UNIT_QTY_NAME);
         if(s.m_LOT_SIZING_NAME != null) m_LOT_SIZING_NAME = new String(s.m_LOT_SIZING_NAME);
         if(s.m_PlanDemand != null) m_PlanDemand = new String(s.m_PlanDemand);
         if(s.m_FixedDemand != null) m_FixedDemand = new String(s.m_FixedDemand);
         if(s.m_PlanOrder != null) m_PlanOrder = new String(s.m_PlanOrder);
         if(s.m_FixedOrder != null) m_FixedOrder = new String(s.m_FixedOrder);
         if(s.m_ValidStock != null) m_ValidStock = new String(s.m_ValidStock);
         if(s.m_LowerDeploy != null) m_LowerDeploy = new String(s.m_LowerDeploy);
         if(s.m_IsReleased != null) m_IsReleased = new String(s.m_IsReleased);
         if(s.m_HOLIDAY_FLG != null) m_HOLIDAY_FLG = new Integer(s.m_HOLIDAY_FLG.intValue());
         if(s.m_Expect != null) m_Expect = new String(s.m_Expect);
         if(s.m_STOCK_UNIT != null) m_STOCK_UNIT = new String(s.m_STOCK_UNIT);
        }	
        /**
         * システム用データのコピー。システム用データ以外は変更しない。
         * @param s コピー元
         */
        public void copySystemData(AC0060010Struct s)	
        {
         if(s.sUser_ID != null) sUser_ID = new String(s.sUser_ID);
         if(s.sSysdate != null) sSysdate = new String(s.sSysdate);
        }
        //}}user_implement_code

	//////////////////////////////

}
