/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0090/src/com/nec/jp/orteus/metamorBase/AC0090/AC0090010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0090;

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

public class AC0090010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_w_DATE_FROM */
	public String m_w_DATE_FROM = null;
	/** 第 2 変数： m_w_DATE_TO */
	public String m_w_DATE_TO = null;
	/** 第 3 変数： m_w_subDM_QTY */
	public String m_w_subDM_QTY = null;
	/** 第 4 変数： m_w_subITEM_NAME */
	public String m_w_subITEM_NAME = null;
	/** 第 5 変数： m_w_subEXTERNAL_PLAN_CD */
	public String m_w_subEXTERNAL_PLAN_CD = null;
	/** 第 6 変数： m_w_subPLANT_CD */
	public String m_w_subPLANT_CD = null;
	/** 第 7 変数： m_w_subPLANT_NAME */
	public String m_w_subPLANT_NAME = null;
	/** 第 8 変数： m_w_subDATE_FROM */
	public String m_w_subDATE_FROM = null;
	/** 第 9 変数： m_w_subDATE_TO */
	public String m_w_subDATE_TO = null;
	/** 第 10 変数： m_subSU_DM_QTY */
	public String m_subSU_DM_QTY = null;
	/** 第 11 変数： m_subRE_ODR_QTY */
	public String m_subRE_ODR_QTY = null;
	/** 第 12 変数： m_CP_UNIT */
	public String m_CP_UNIT = null;
	/** 第 13 変数： m_w_TIME_FROM */
	public String m_w_TIME_FROM = null;
	/** 第 14 変数： m_w_TIME_TO */
	public String m_w_TIME_TO = null;
	/** 第 15 変数： m_w_subTIME_FROM */
	public String m_w_subTIME_FROM = null;
	/** 第 16 変数： m_w_subTIME_TO */
	public String m_w_subTIME_TO = null;
	/** 第 17 変数： m_w_subDUE_TIME */
	public String m_w_subDUE_TIME = null;
	/** 第 18 変数： m_s_MIN_CAL_DATE */
	public String m_s_MIN_CAL_DATE = null;
	/** 第 19 変数： m_s_MAX_CAL_DATE */
	public String m_s_MAX_CAL_DATE = null;
	/** 第 20 変数： m_s_BUSINESS_DATE */
	public String m_s_BUSINESS_DATE = null;
	/** 第 21 変数： m_s_PLANT_NAME */
	public String m_s_PLANT_NAME = null;
	/** 第 22 変数： m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** 第 23 変数： m_OD_NO */
	public String m_OD_NO = null;
	/** 第 24 変数： m_w_PLANT_CD */
	public String m_w_PLANT_CD = null;
	/** 第 25 変数： m_w_PLANT_NAME */
	public String m_w_PLANT_NAME = null;
	/** 第 26 変数： m_w_ITEM_CD */
	public String m_w_ITEM_CD = null;
	/** 第 27 変数： m_w_ITEM_NAME */
	public String m_w_ITEM_NAME = null;
	/** 第 28 変数： m_w_DRAW_CD */
	public String m_w_DRAW_CD = null;
	/** 第 29 変数： m_w_SPEC */
	public String m_w_SPEC = null;
	/** 第 30 変数： m_w_MRP_ODR_TYP */
	public String m_w_MRP_ODR_TYP = null;
	/** 第 31 変数： m_w_OUTSIDE_TYP */
	public String m_w_OUTSIDE_TYP = null;
	/** 第 32 変数： m_w_ITEM_SPOIL */
	public String m_w_ITEM_SPOIL = null;
	/** 第 33 変数： m_w_UNIT_QTY_TYP */
	public String m_w_UNIT_QTY_TYP = null;
	/** 第 34 変数： m_w_LOT_SIZING_TYP */
	public String m_w_LOT_SIZING_TYP = null;
	/** 第 35 変数： m_w_MAX_PERIOD */
	public String m_w_MAX_PERIOD = null;
	/** 第 36 変数： m_w_MUL_ODR_QTY */
	public String m_w_MUL_ODR_QTY = null;
	/** 第 37 変数： m_w_SAFETY_STOCK */
	public String m_w_SAFETY_STOCK = null;
	/** 第 38 変数： m_w_MAX_ODR_QTY */
	public String m_w_MAX_ODR_QTY = null;
	/** 第 39 変数： m_w_MIN_ODR_QTY */
	public String m_w_MIN_ODR_QTY = null;
	/** 第 40 変数： m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** 第 41 変数： m_EXTERNAL_PLAN_CD */
	public String m_EXTERNAL_PLAN_CD = null;
	/** 第 42 変数： m_DUE_DATE */
	public String m_DUE_DATE = null;
	/** 第 43 変数： m_DM_QTY */
	public String m_DM_QTY = null;
	/** 第 44 変数： m_ODR_START_DATE */
	public String m_ODR_START_DATE = null;
	/** 第 45 変数： m_w_DATE_FROM_ALL */
	public String m_w_DATE_FROM_ALL = null;
	/** 第 46 変数： m_w_DATE_TO_ALL */
	public String m_w_DATE_TO_ALL = null;
	/** 第 47 変数： m_subJOB_ODR_CD */
	public String m_subJOB_ODR_CD = null;
	/** 第 48 変数： m_subITEM_CD */
	public String m_subITEM_CD = null;
	/** 第 49 変数： m_subITEM_NAME */
	public String m_subITEM_NAME = null;
	/** 第 50 変数： m_subODR_START_DATE */
	public String m_subODR_START_DATE = null;
	/** 第 51 変数： m_subPRD_START_DATE */
	public String m_subPRD_START_DATE = null;
	/** 第 52 変数： m_subPRD_DUE_DATE */
	public String m_subPRD_DUE_DATE = null;
	/** 第 53 変数： m_subODR_QTY */
	public String m_subODR_QTY = null;
	/** 第 54 変数： m_subPS_UNIT_DENOMINATOR */
	public String m_subPS_UNIT_DENOMINATOR = null;
	/** 第 55 変数： m_subPS_UNIT_NUMERATOR */
	public String m_subPS_UNIT_NUMERATOR = null;
	/** 第 56 変数： m_subOD_NO */
	public String m_subOD_NO = null;
	/** 第 57 変数： m_subMODIFY_COUNT */
	public String m_subMODIFY_COUNT = null;
	/** 第 58 変数： m_w_subITEM_CD */
	public String m_w_subITEM_CD = null;
	/** 第 59 変数： m_w_subDATE_FROM_ALL */
	public String m_w_subDATE_FROM_ALL = null;
	/** 第 60 変数： m_w_subDATE_TO_ALL */
	public String m_w_subDATE_TO_ALL = null;
	/** 第 61 変数： m_w_subDUE_DATE */
	public String m_w_subDUE_DATE = null;
	/** 第 62 変数： m_subDM_QTY */
	public String m_subDM_QTY = null;
	/** 第 63 変数： m_PS_EDITION */
	public String m_PS_EDITION = null;
	/** 第 64 変数： m_PS_LT_FLG */
	public String m_PS_LT_FLG = null;
	/** 第 65 変数： m_PS_FIXED_LT */
	public String m_PS_FIXED_LT = null;
	/** 第 66 変数： m_PS_PROP_LT */
	public String m_PS_PROP_LT = null;
	/** 第 67 変数： m_PS_PROP_LOT_SIZE */
	public String m_PS_PROP_LOT_SIZE = null;
	/** 第 68 変数： m_PS_UNIT_DENOMINATOR */
	public String m_PS_UNIT_DENOMINATOR = null;
	/** 第 69 変数： m_PS_UNIT_NUMERATOR */
	public String m_PS_UNIT_NUMERATOR = null;
	/** 第 70 変数： m_PS_SPOIL */
	public String m_PS_SPOIL = null;
	/** 第 71 変数： m_CONS_TYP */
	public String m_CONS_TYP = null;
	/** 第 72 変数： m_EFF_PHASE_IN_DATE */
	public String m_EFF_PHASE_IN_DATE = null;
	/** 第 73 変数： m_EFF_PHASE_OUT_DATE */
	public String m_EFF_PHASE_OUT_DATE = null;
	/** 第 74 変数： m_PS_UNIT_QTY */
	public String m_PS_UNIT_QTY = null;
	/** 第 75 変数： m_TIME_CTRL */
	public String m_TIME_CTRL = null;
	/** 第 76 変数： m_l_COUNT */
	public String m_l_COUNT = null;
	/** 第 77 変数： m_ROW_COUNT */
	public String m_ROW_COUNT = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_w_DATE_FROM */
	public List l_w_DATE_FROM = null;

	/** 第 2 List変数： l_w_DATE_TO */
	public List l_w_DATE_TO = null;

	/** 第 3 List変数： l_w_subDM_QTY */
	public List l_w_subDM_QTY = null;

	/** 第 4 List変数： l_w_subITEM_NAME */
	public List l_w_subITEM_NAME = null;

	/** 第 5 List変数： l_w_subEXTERNAL_PLAN_CD */
	public List l_w_subEXTERNAL_PLAN_CD = null;

	/** 第 6 List変数： l_w_subPLANT_CD */
	public List l_w_subPLANT_CD = null;

	/** 第 7 List変数： l_w_subPLANT_NAME */
	public List l_w_subPLANT_NAME = null;

	/** 第 8 List変数： l_w_subDATE_FROM */
	public List l_w_subDATE_FROM = null;

	/** 第 9 List変数： l_w_subDATE_TO */
	public List l_w_subDATE_TO = null;

	/** 第 10 List変数： l_subSU_DM_QTY */
	public List l_subSU_DM_QTY = null;

	/** 第 11 List変数： l_subRE_ODR_QTY */
	public List l_subRE_ODR_QTY = null;

	/** 第 12 List変数： l_CP_UNIT */
	public List l_CP_UNIT = null;

	/** 第 13 List変数： l_w_TIME_FROM */
	public List l_w_TIME_FROM = null;

	/** 第 14 List変数： l_w_TIME_TO */
	public List l_w_TIME_TO = null;

	/** 第 15 List変数： l_w_subTIME_FROM */
	public List l_w_subTIME_FROM = null;

	/** 第 16 List変数： l_w_subTIME_TO */
	public List l_w_subTIME_TO = null;

	/** 第 17 List変数： l_w_subDUE_TIME */
	public List l_w_subDUE_TIME = null;

	/** 第 18 List変数： l_s_MIN_CAL_DATE */
	public List l_s_MIN_CAL_DATE = null;

	/** 第 19 List変数： l_s_MAX_CAL_DATE */
	public List l_s_MAX_CAL_DATE = null;

	/** 第 20 List変数： l_s_BUSINESS_DATE */
	public List l_s_BUSINESS_DATE = null;

	/** 第 21 List変数： l_s_PLANT_NAME */
	public List l_s_PLANT_NAME = null;

	/** 第 22 List変数： l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** 第 23 List変数： l_OD_NO */
	public List l_OD_NO = null;

	/** 第 24 List変数： l_w_PLANT_CD */
	public List l_w_PLANT_CD = null;

	/** 第 25 List変数： l_w_PLANT_NAME */
	public List l_w_PLANT_NAME = null;

	/** 第 26 List変数： l_w_ITEM_CD */
	public List l_w_ITEM_CD = null;

	/** 第 27 List変数： l_w_ITEM_NAME */
	public List l_w_ITEM_NAME = null;

	/** 第 28 List変数： l_w_DRAW_CD */
	public List l_w_DRAW_CD = null;

	/** 第 29 List変数： l_w_SPEC */
	public List l_w_SPEC = null;

	/** 第 30 List変数： l_w_MRP_ODR_TYP */
	public List l_w_MRP_ODR_TYP = null;

	/** 第 31 List変数： l_w_OUTSIDE_TYP */
	public List l_w_OUTSIDE_TYP = null;

	/** 第 32 List変数： l_w_ITEM_SPOIL */
	public List l_w_ITEM_SPOIL = null;

	/** 第 33 List変数： l_w_UNIT_QTY_TYP */
	public List l_w_UNIT_QTY_TYP = null;

	/** 第 34 List変数： l_w_LOT_SIZING_TYP */
	public List l_w_LOT_SIZING_TYP = null;

	/** 第 35 List変数： l_w_MAX_PERIOD */
	public List l_w_MAX_PERIOD = null;

	/** 第 36 List変数： l_w_MUL_ODR_QTY */
	public List l_w_MUL_ODR_QTY = null;

	/** 第 37 List変数： l_w_SAFETY_STOCK */
	public List l_w_SAFETY_STOCK = null;

	/** 第 38 List変数： l_w_MAX_ODR_QTY */
	public List l_w_MAX_ODR_QTY = null;

	/** 第 39 List変数： l_w_MIN_ODR_QTY */
	public List l_w_MIN_ODR_QTY = null;

	/** 第 40 List変数： l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** 第 41 List変数： l_EXTERNAL_PLAN_CD */
	public List l_EXTERNAL_PLAN_CD = null;

	/** 第 42 List変数： l_DUE_DATE */
	public List l_DUE_DATE = null;

	/** 第 43 List変数： l_DM_QTY */
	public List l_DM_QTY = null;

	/** 第 44 List変数： l_ODR_START_DATE */
	public List l_ODR_START_DATE = null;

	/** 第 45 List変数： l_w_DATE_FROM_ALL */
	public List l_w_DATE_FROM_ALL = null;

	/** 第 46 List変数： l_w_DATE_TO_ALL */
	public List l_w_DATE_TO_ALL = null;

	/** 第 47 List変数： l_subJOB_ODR_CD */
	public List l_subJOB_ODR_CD = null;

	/** 第 48 List変数： l_subITEM_CD */
	public List l_subITEM_CD = null;

	/** 第 49 List変数： l_subITEM_NAME */
	public List l_subITEM_NAME = null;

	/** 第 50 List変数： l_subODR_START_DATE */
	public List l_subODR_START_DATE = null;

	/** 第 51 List変数： l_subPRD_START_DATE */
	public List l_subPRD_START_DATE = null;

	/** 第 52 List変数： l_subPRD_DUE_DATE */
	public List l_subPRD_DUE_DATE = null;

	/** 第 53 List変数： l_subODR_QTY */
	public List l_subODR_QTY = null;

	/** 第 54 List変数： l_subPS_UNIT_DENOMINATOR */
	public List l_subPS_UNIT_DENOMINATOR = null;

	/** 第 55 List変数： l_subPS_UNIT_NUMERATOR */
	public List l_subPS_UNIT_NUMERATOR = null;

	/** 第 56 List変数： l_subOD_NO */
	public List l_subOD_NO = null;

	/** 第 57 List変数： l_subMODIFY_COUNT */
	public List l_subMODIFY_COUNT = null;

	/** 第 58 List変数： l_w_subITEM_CD */
	public List l_w_subITEM_CD = null;

	/** 第 59 List変数： l_w_subDATE_FROM_ALL */
	public List l_w_subDATE_FROM_ALL = null;

	/** 第 60 List変数： l_w_subDATE_TO_ALL */
	public List l_w_subDATE_TO_ALL = null;

	/** 第 61 List変数： l_w_subDUE_DATE */
	public List l_w_subDUE_DATE = null;

	/** 第 62 List変数： l_subDM_QTY */
	public List l_subDM_QTY = null;

	/** 第 63 List変数： l_PS_EDITION */
	public List l_PS_EDITION = null;

	/** 第 64 List変数： l_PS_LT_FLG */
	public List l_PS_LT_FLG = null;

	/** 第 65 List変数： l_PS_FIXED_LT */
	public List l_PS_FIXED_LT = null;

	/** 第 66 List変数： l_PS_PROP_LT */
	public List l_PS_PROP_LT = null;

	/** 第 67 List変数： l_PS_PROP_LOT_SIZE */
	public List l_PS_PROP_LOT_SIZE = null;

	/** 第 68 List変数： l_PS_UNIT_DENOMINATOR */
	public List l_PS_UNIT_DENOMINATOR = null;

	/** 第 69 List変数： l_PS_UNIT_NUMERATOR */
	public List l_PS_UNIT_NUMERATOR = null;

	/** 第 70 List変数： l_PS_SPOIL */
	public List l_PS_SPOIL = null;

	/** 第 71 List変数： l_CONS_TYP */
	public List l_CONS_TYP = null;

	/** 第 72 List変数： l_EFF_PHASE_IN_DATE */
	public List l_EFF_PHASE_IN_DATE = null;

	/** 第 73 List変数： l_EFF_PHASE_OUT_DATE */
	public List l_EFF_PHASE_OUT_DATE = null;

	/** 第 74 List変数： l_PS_UNIT_QTY */
	public List l_PS_UNIT_QTY = null;

	/** 第 75 List変数： l_TIME_CTRL */
	public List l_TIME_CTRL = null;

	/** 第 76 List変数： l_l_COUNT */
	public List l_l_COUNT = null;

	/** 第 77 List変数： l_ROW_COUNT */
	public List l_ROW_COUNT = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getw_DATE_FROM() { return m_w_DATE_FROM; }
	public String getw_DATE_TO() { return m_w_DATE_TO; }
	public String getw_subDM_QTY() { return m_w_subDM_QTY; }
	public String getw_subITEM_NAME() { return m_w_subITEM_NAME; }
	public String getw_subEXTERNAL_PLAN_CD() { return m_w_subEXTERNAL_PLAN_CD; }
	public String getw_subPLANT_CD() { return m_w_subPLANT_CD; }
	public String getw_subPLANT_NAME() { return m_w_subPLANT_NAME; }
	public String getw_subDATE_FROM() { return m_w_subDATE_FROM; }
	public String getw_subDATE_TO() { return m_w_subDATE_TO; }
	public String getsubSU_DM_QTY() { return m_subSU_DM_QTY; }
	public String getsubRE_ODR_QTY() { return m_subRE_ODR_QTY; }
	public String getCP_UNIT() { return m_CP_UNIT; }
	public String getw_TIME_FROM() { return m_w_TIME_FROM; }
	public String getw_TIME_TO() { return m_w_TIME_TO; }
	public String getw_subTIME_FROM() { return m_w_subTIME_FROM; }
	public String getw_subTIME_TO() { return m_w_subTIME_TO; }
	public String getw_subDUE_TIME() { return m_w_subDUE_TIME; }
	public String gets_MIN_CAL_DATE() { return m_s_MIN_CAL_DATE; }
	public String gets_MAX_CAL_DATE() { return m_s_MAX_CAL_DATE; }
	public String gets_BUSINESS_DATE() { return m_s_BUSINESS_DATE; }
	public String gets_PLANT_NAME() { return m_s_PLANT_NAME; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getOD_NO() { return m_OD_NO; }
	public String getw_PLANT_CD() { return m_w_PLANT_CD; }
	public String getw_PLANT_NAME() { return m_w_PLANT_NAME; }
	public String getw_ITEM_CD() { return m_w_ITEM_CD; }
	public String getw_ITEM_NAME() { return m_w_ITEM_NAME; }
	public String getw_DRAW_CD() { return m_w_DRAW_CD; }
	public String getw_SPEC() { return m_w_SPEC; }
	public String getw_MRP_ODR_TYP() { return m_w_MRP_ODR_TYP; }
	public String getw_OUTSIDE_TYP() { return m_w_OUTSIDE_TYP; }
	public String getw_ITEM_SPOIL() { return m_w_ITEM_SPOIL; }
	public String getw_UNIT_QTY_TYP() { return m_w_UNIT_QTY_TYP; }
	public String getw_LOT_SIZING_TYP() { return m_w_LOT_SIZING_TYP; }
	public String getw_MAX_PERIOD() { return m_w_MAX_PERIOD; }
	public String getw_MUL_ODR_QTY() { return m_w_MUL_ODR_QTY; }
	public String getw_SAFETY_STOCK() { return m_w_SAFETY_STOCK; }
	public String getw_MAX_ODR_QTY() { return m_w_MAX_ODR_QTY; }
	public String getw_MIN_ODR_QTY() { return m_w_MIN_ODR_QTY; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getEXTERNAL_PLAN_CD() { return m_EXTERNAL_PLAN_CD; }
	public String getDUE_DATE() { return m_DUE_DATE; }
	public String getDM_QTY() { return m_DM_QTY; }
	public String getODR_START_DATE() { return m_ODR_START_DATE; }
	public String getw_DATE_FROM_ALL() { return m_w_DATE_FROM_ALL; }
	public String getw_DATE_TO_ALL() { return m_w_DATE_TO_ALL; }
	public String getsubJOB_ODR_CD() { return m_subJOB_ODR_CD; }
	public String getsubITEM_CD() { return m_subITEM_CD; }
	public String getsubITEM_NAME() { return m_subITEM_NAME; }
	public String getsubODR_START_DATE() { return m_subODR_START_DATE; }
	public String getsubPRD_START_DATE() { return m_subPRD_START_DATE; }
	public String getsubPRD_DUE_DATE() { return m_subPRD_DUE_DATE; }
	public String getsubODR_QTY() { return m_subODR_QTY; }
	public String getsubPS_UNIT_DENOMINATOR() { return m_subPS_UNIT_DENOMINATOR; }
	public String getsubPS_UNIT_NUMERATOR() { return m_subPS_UNIT_NUMERATOR; }
	public String getsubOD_NO() { return m_subOD_NO; }
	public String getsubMODIFY_COUNT() { return m_subMODIFY_COUNT; }
	public String getw_subITEM_CD() { return m_w_subITEM_CD; }
	public String getw_subDATE_FROM_ALL() { return m_w_subDATE_FROM_ALL; }
	public String getw_subDATE_TO_ALL() { return m_w_subDATE_TO_ALL; }
	public String getw_subDUE_DATE() { return m_w_subDUE_DATE; }
	public String getsubDM_QTY() { return m_subDM_QTY; }
	public String getPS_EDITION() { return m_PS_EDITION; }
	public String getPS_LT_FLG() { return m_PS_LT_FLG; }
	public String getPS_FIXED_LT() { return m_PS_FIXED_LT; }
	public String getPS_PROP_LT() { return m_PS_PROP_LT; }
	public String getPS_PROP_LOT_SIZE() { return m_PS_PROP_LOT_SIZE; }
	public String getPS_UNIT_DENOMINATOR() { return m_PS_UNIT_DENOMINATOR; }
	public String getPS_UNIT_NUMERATOR() { return m_PS_UNIT_NUMERATOR; }
	public String getPS_SPOIL() { return m_PS_SPOIL; }
	public String getCONS_TYP() { return m_CONS_TYP; }
	public String getEFF_PHASE_IN_DATE() { return m_EFF_PHASE_IN_DATE; }
	public String getEFF_PHASE_OUT_DATE() { return m_EFF_PHASE_OUT_DATE; }
	public String getPS_UNIT_QTY() { return m_PS_UNIT_QTY; }
	public String getTIME_CTRL() { return m_TIME_CTRL; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }

	public List getList_w_DATE_FROM() { return l_w_DATE_FROM; }
	public List getList_w_DATE_TO() { return l_w_DATE_TO; }
	public List getList_w_subDM_QTY() { return l_w_subDM_QTY; }
	public List getList_w_subITEM_NAME() { return l_w_subITEM_NAME; }
	public List getList_w_subEXTERNAL_PLAN_CD() { return l_w_subEXTERNAL_PLAN_CD; }
	public List getList_w_subPLANT_CD() { return l_w_subPLANT_CD; }
	public List getList_w_subPLANT_NAME() { return l_w_subPLANT_NAME; }
	public List getList_w_subDATE_FROM() { return l_w_subDATE_FROM; }
	public List getList_w_subDATE_TO() { return l_w_subDATE_TO; }
	public List getList_subSU_DM_QTY() { return l_subSU_DM_QTY; }
	public List getList_subRE_ODR_QTY() { return l_subRE_ODR_QTY; }
	public List getList_CP_UNIT() { return l_CP_UNIT; }
	public List getList_w_TIME_FROM() { return l_w_TIME_FROM; }
	public List getList_w_TIME_TO() { return l_w_TIME_TO; }
	public List getList_w_subTIME_FROM() { return l_w_subTIME_FROM; }
	public List getList_w_subTIME_TO() { return l_w_subTIME_TO; }
	public List getList_w_subDUE_TIME() { return l_w_subDUE_TIME; }
	public List getList_s_MIN_CAL_DATE() { return l_s_MIN_CAL_DATE; }
	public List getList_s_MAX_CAL_DATE() { return l_s_MAX_CAL_DATE; }
	public List getList_s_BUSINESS_DATE() { return l_s_BUSINESS_DATE; }
	public List getList_s_PLANT_NAME() { return l_s_PLANT_NAME; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_OD_NO() { return l_OD_NO; }
	public List getList_w_PLANT_CD() { return l_w_PLANT_CD; }
	public List getList_w_PLANT_NAME() { return l_w_PLANT_NAME; }
	public List getList_w_ITEM_CD() { return l_w_ITEM_CD; }
	public List getList_w_ITEM_NAME() { return l_w_ITEM_NAME; }
	public List getList_w_DRAW_CD() { return l_w_DRAW_CD; }
	public List getList_w_SPEC() { return l_w_SPEC; }
	public List getList_w_MRP_ODR_TYP() { return l_w_MRP_ODR_TYP; }
	public List getList_w_OUTSIDE_TYP() { return l_w_OUTSIDE_TYP; }
	public List getList_w_ITEM_SPOIL() { return l_w_ITEM_SPOIL; }
	public List getList_w_UNIT_QTY_TYP() { return l_w_UNIT_QTY_TYP; }
	public List getList_w_LOT_SIZING_TYP() { return l_w_LOT_SIZING_TYP; }
	public List getList_w_MAX_PERIOD() { return l_w_MAX_PERIOD; }
	public List getList_w_MUL_ODR_QTY() { return l_w_MUL_ODR_QTY; }
	public List getList_w_SAFETY_STOCK() { return l_w_SAFETY_STOCK; }
	public List getList_w_MAX_ODR_QTY() { return l_w_MAX_ODR_QTY; }
	public List getList_w_MIN_ODR_QTY() { return l_w_MIN_ODR_QTY; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_EXTERNAL_PLAN_CD() { return l_EXTERNAL_PLAN_CD; }
	public List getList_DUE_DATE() { return l_DUE_DATE; }
	public List getList_DM_QTY() { return l_DM_QTY; }
	public List getList_ODR_START_DATE() { return l_ODR_START_DATE; }
	public List getList_w_DATE_FROM_ALL() { return l_w_DATE_FROM_ALL; }
	public List getList_w_DATE_TO_ALL() { return l_w_DATE_TO_ALL; }
	public List getList_subJOB_ODR_CD() { return l_subJOB_ODR_CD; }
	public List getList_subITEM_CD() { return l_subITEM_CD; }
	public List getList_subITEM_NAME() { return l_subITEM_NAME; }
	public List getList_subODR_START_DATE() { return l_subODR_START_DATE; }
	public List getList_subPRD_START_DATE() { return l_subPRD_START_DATE; }
	public List getList_subPRD_DUE_DATE() { return l_subPRD_DUE_DATE; }
	public List getList_subODR_QTY() { return l_subODR_QTY; }
	public List getList_subPS_UNIT_DENOMINATOR() { return l_subPS_UNIT_DENOMINATOR; }
	public List getList_subPS_UNIT_NUMERATOR() { return l_subPS_UNIT_NUMERATOR; }
	public List getList_subOD_NO() { return l_subOD_NO; }
	public List getList_subMODIFY_COUNT() { return l_subMODIFY_COUNT; }
	public List getList_w_subITEM_CD() { return l_w_subITEM_CD; }
	public List getList_w_subDATE_FROM_ALL() { return l_w_subDATE_FROM_ALL; }
	public List getList_w_subDATE_TO_ALL() { return l_w_subDATE_TO_ALL; }
	public List getList_w_subDUE_DATE() { return l_w_subDUE_DATE; }
	public List getList_subDM_QTY() { return l_subDM_QTY; }
	public List getList_PS_EDITION() { return l_PS_EDITION; }
	public List getList_PS_LT_FLG() { return l_PS_LT_FLG; }
	public List getList_PS_FIXED_LT() { return l_PS_FIXED_LT; }
	public List getList_PS_PROP_LT() { return l_PS_PROP_LT; }
	public List getList_PS_PROP_LOT_SIZE() { return l_PS_PROP_LOT_SIZE; }
	public List getList_PS_UNIT_DENOMINATOR() { return l_PS_UNIT_DENOMINATOR; }
	public List getList_PS_UNIT_NUMERATOR() { return l_PS_UNIT_NUMERATOR; }
	public List getList_PS_SPOIL() { return l_PS_SPOIL; }
	public List getList_CONS_TYP() { return l_CONS_TYP; }
	public List getList_EFF_PHASE_IN_DATE() { return l_EFF_PHASE_IN_DATE; }
	public List getList_EFF_PHASE_OUT_DATE() { return l_EFF_PHASE_OUT_DATE; }
	public List getList_PS_UNIT_QTY() { return l_PS_UNIT_QTY; }
	public List getList_TIME_CTRL() { return l_TIME_CTRL; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }

	public void setw_DATE_FROM(String val) { m_w_DATE_FROM = val; }
	public void setw_DATE_TO(String val) { m_w_DATE_TO = val; }
	public void setw_subDM_QTY(String val) { m_w_subDM_QTY = val; }
	public void setw_subITEM_NAME(String val) { m_w_subITEM_NAME = val; }
	public void setw_subEXTERNAL_PLAN_CD(String val) { m_w_subEXTERNAL_PLAN_CD = val; }
	public void setw_subPLANT_CD(String val) { m_w_subPLANT_CD = val; }
	public void setw_subPLANT_NAME(String val) { m_w_subPLANT_NAME = val; }
	public void setw_subDATE_FROM(String val) { m_w_subDATE_FROM = val; }
	public void setw_subDATE_TO(String val) { m_w_subDATE_TO = val; }
	public void setsubSU_DM_QTY(String val) { m_subSU_DM_QTY = val; }
	public void setsubRE_ODR_QTY(String val) { m_subRE_ODR_QTY = val; }
	public void setCP_UNIT(String val) { m_CP_UNIT = val; }
	public void setw_TIME_FROM(String val) { m_w_TIME_FROM = val; }
	public void setw_TIME_TO(String val) { m_w_TIME_TO = val; }
	public void setw_subTIME_FROM(String val) { m_w_subTIME_FROM = val; }
	public void setw_subTIME_TO(String val) { m_w_subTIME_TO = val; }
	public void setw_subDUE_TIME(String val) { m_w_subDUE_TIME = val; }
	public void sets_MIN_CAL_DATE(String val) { m_s_MIN_CAL_DATE = val; }
	public void sets_MAX_CAL_DATE(String val) { m_s_MAX_CAL_DATE = val; }
	public void sets_BUSINESS_DATE(String val) { m_s_BUSINESS_DATE = val; }
	public void sets_PLANT_NAME(String val) { m_s_PLANT_NAME = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setOD_NO(String val) { m_OD_NO = val; }
	public void setw_PLANT_CD(String val) { m_w_PLANT_CD = val; }
	public void setw_PLANT_NAME(String val) { m_w_PLANT_NAME = val; }
	public void setw_ITEM_CD(String val) { m_w_ITEM_CD = val; }
	public void setw_ITEM_NAME(String val) { m_w_ITEM_NAME = val; }
	public void setw_DRAW_CD(String val) { m_w_DRAW_CD = val; }
	public void setw_SPEC(String val) { m_w_SPEC = val; }
	public void setw_MRP_ODR_TYP(String val) { m_w_MRP_ODR_TYP = val; }
	public void setw_OUTSIDE_TYP(String val) { m_w_OUTSIDE_TYP = val; }
	public void setw_ITEM_SPOIL(String val) { m_w_ITEM_SPOIL = val; }
	public void setw_UNIT_QTY_TYP(String val) { m_w_UNIT_QTY_TYP = val; }
	public void setw_LOT_SIZING_TYP(String val) { m_w_LOT_SIZING_TYP = val; }
	public void setw_MAX_PERIOD(String val) { m_w_MAX_PERIOD = val; }
	public void setw_MUL_ODR_QTY(String val) { m_w_MUL_ODR_QTY = val; }
	public void setw_SAFETY_STOCK(String val) { m_w_SAFETY_STOCK = val; }
	public void setw_MAX_ODR_QTY(String val) { m_w_MAX_ODR_QTY = val; }
	public void setw_MIN_ODR_QTY(String val) { m_w_MIN_ODR_QTY = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setEXTERNAL_PLAN_CD(String val) { m_EXTERNAL_PLAN_CD = val; }
	public void setDUE_DATE(String val) { m_DUE_DATE = val; }
	public void setDM_QTY(String val) { m_DM_QTY = val; }
	public void setODR_START_DATE(String val) { m_ODR_START_DATE = val; }
	public void setw_DATE_FROM_ALL(String val) { m_w_DATE_FROM_ALL = val; }
	public void setw_DATE_TO_ALL(String val) { m_w_DATE_TO_ALL = val; }
	public void setsubJOB_ODR_CD(String val) { m_subJOB_ODR_CD = val; }
	public void setsubITEM_CD(String val) { m_subITEM_CD = val; }
	public void setsubITEM_NAME(String val) { m_subITEM_NAME = val; }
	public void setsubODR_START_DATE(String val) { m_subODR_START_DATE = val; }
	public void setsubPRD_START_DATE(String val) { m_subPRD_START_DATE = val; }
	public void setsubPRD_DUE_DATE(String val) { m_subPRD_DUE_DATE = val; }
	public void setsubODR_QTY(String val) { m_subODR_QTY = val; }
	public void setsubPS_UNIT_DENOMINATOR(String val) { m_subPS_UNIT_DENOMINATOR = val; }
	public void setsubPS_UNIT_NUMERATOR(String val) { m_subPS_UNIT_NUMERATOR = val; }
	public void setsubOD_NO(String val) { m_subOD_NO = val; }
	public void setsubMODIFY_COUNT(String val) { m_subMODIFY_COUNT = val; }
	public void setw_subITEM_CD(String val) { m_w_subITEM_CD = val; }
	public void setw_subDATE_FROM_ALL(String val) { m_w_subDATE_FROM_ALL = val; }
	public void setw_subDATE_TO_ALL(String val) { m_w_subDATE_TO_ALL = val; }
	public void setw_subDUE_DATE(String val) { m_w_subDUE_DATE = val; }
	public void setsubDM_QTY(String val) { m_subDM_QTY = val; }
	public void setPS_EDITION(String val) { m_PS_EDITION = val; }
	public void setPS_LT_FLG(String val) { m_PS_LT_FLG = val; }
	public void setPS_FIXED_LT(String val) { m_PS_FIXED_LT = val; }
	public void setPS_PROP_LT(String val) { m_PS_PROP_LT = val; }
	public void setPS_PROP_LOT_SIZE(String val) { m_PS_PROP_LOT_SIZE = val; }
	public void setPS_UNIT_DENOMINATOR(String val) { m_PS_UNIT_DENOMINATOR = val; }
	public void setPS_UNIT_NUMERATOR(String val) { m_PS_UNIT_NUMERATOR = val; }
	public void setPS_SPOIL(String val) { m_PS_SPOIL = val; }
	public void setCONS_TYP(String val) { m_CONS_TYP = val; }
	public void setEFF_PHASE_IN_DATE(String val) { m_EFF_PHASE_IN_DATE = val; }
	public void setEFF_PHASE_OUT_DATE(String val) { m_EFF_PHASE_OUT_DATE = val; }
	public void setPS_UNIT_QTY(String val) { m_PS_UNIT_QTY = val; }
	public void setTIME_CTRL(String val) { m_TIME_CTRL = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }


	public void setList_w_DATE_FROM(List list) { l_w_DATE_FROM = list; }
	public void setList_w_DATE_TO(List list) { l_w_DATE_TO = list; }
	public void setList_w_subDM_QTY(List list) { l_w_subDM_QTY = list; }
	public void setList_w_subITEM_NAME(List list) { l_w_subITEM_NAME = list; }
	public void setList_w_subEXTERNAL_PLAN_CD(List list) { l_w_subEXTERNAL_PLAN_CD = list; }
	public void setList_w_subPLANT_CD(List list) { l_w_subPLANT_CD = list; }
	public void setList_w_subPLANT_NAME(List list) { l_w_subPLANT_NAME = list; }
	public void setList_w_subDATE_FROM(List list) { l_w_subDATE_FROM = list; }
	public void setList_w_subDATE_TO(List list) { l_w_subDATE_TO = list; }
	public void setList_subSU_DM_QTY(List list) { l_subSU_DM_QTY = list; }
	public void setList_subRE_ODR_QTY(List list) { l_subRE_ODR_QTY = list; }
	public void setList_CP_UNIT(List list) { l_CP_UNIT = list; }
	public void setList_w_TIME_FROM(List list) { l_w_TIME_FROM = list; }
	public void setList_w_TIME_TO(List list) { l_w_TIME_TO = list; }
	public void setList_w_subTIME_FROM(List list) { l_w_subTIME_FROM = list; }
	public void setList_w_subTIME_TO(List list) { l_w_subTIME_TO = list; }
	public void setList_w_subDUE_TIME(List list) { l_w_subDUE_TIME = list; }
	public void setList_s_MIN_CAL_DATE(List list) { l_s_MIN_CAL_DATE = list; }
	public void setList_s_MAX_CAL_DATE(List list) { l_s_MAX_CAL_DATE = list; }
	public void setList_s_BUSINESS_DATE(List list) { l_s_BUSINESS_DATE = list; }
	public void setList_s_PLANT_NAME(List list) { l_s_PLANT_NAME = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_OD_NO(List list) { l_OD_NO = list; }
	public void setList_w_PLANT_CD(List list) { l_w_PLANT_CD = list; }
	public void setList_w_PLANT_NAME(List list) { l_w_PLANT_NAME = list; }
	public void setList_w_ITEM_CD(List list) { l_w_ITEM_CD = list; }
	public void setList_w_ITEM_NAME(List list) { l_w_ITEM_NAME = list; }
	public void setList_w_DRAW_CD(List list) { l_w_DRAW_CD = list; }
	public void setList_w_SPEC(List list) { l_w_SPEC = list; }
	public void setList_w_MRP_ODR_TYP(List list) { l_w_MRP_ODR_TYP = list; }
	public void setList_w_OUTSIDE_TYP(List list) { l_w_OUTSIDE_TYP = list; }
	public void setList_w_ITEM_SPOIL(List list) { l_w_ITEM_SPOIL = list; }
	public void setList_w_UNIT_QTY_TYP(List list) { l_w_UNIT_QTY_TYP = list; }
	public void setList_w_LOT_SIZING_TYP(List list) { l_w_LOT_SIZING_TYP = list; }
	public void setList_w_MAX_PERIOD(List list) { l_w_MAX_PERIOD = list; }
	public void setList_w_MUL_ODR_QTY(List list) { l_w_MUL_ODR_QTY = list; }
	public void setList_w_SAFETY_STOCK(List list) { l_w_SAFETY_STOCK = list; }
	public void setList_w_MAX_ODR_QTY(List list) { l_w_MAX_ODR_QTY = list; }
	public void setList_w_MIN_ODR_QTY(List list) { l_w_MIN_ODR_QTY = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_EXTERNAL_PLAN_CD(List list) { l_EXTERNAL_PLAN_CD = list; }
	public void setList_DUE_DATE(List list) { l_DUE_DATE = list; }
	public void setList_DM_QTY(List list) { l_DM_QTY = list; }
	public void setList_ODR_START_DATE(List list) { l_ODR_START_DATE = list; }
	public void setList_w_DATE_FROM_ALL(List list) { l_w_DATE_FROM_ALL = list; }
	public void setList_w_DATE_TO_ALL(List list) { l_w_DATE_TO_ALL = list; }
	public void setList_subJOB_ODR_CD(List list) { l_subJOB_ODR_CD = list; }
	public void setList_subITEM_CD(List list) { l_subITEM_CD = list; }
	public void setList_subITEM_NAME(List list) { l_subITEM_NAME = list; }
	public void setList_subODR_START_DATE(List list) { l_subODR_START_DATE = list; }
	public void setList_subPRD_START_DATE(List list) { l_subPRD_START_DATE = list; }
	public void setList_subPRD_DUE_DATE(List list) { l_subPRD_DUE_DATE = list; }
	public void setList_subODR_QTY(List list) { l_subODR_QTY = list; }
	public void setList_subPS_UNIT_DENOMINATOR(List list) { l_subPS_UNIT_DENOMINATOR = list; }
	public void setList_subPS_UNIT_NUMERATOR(List list) { l_subPS_UNIT_NUMERATOR = list; }
	public void setList_subOD_NO(List list) { l_subOD_NO = list; }
	public void setList_subMODIFY_COUNT(List list) { l_subMODIFY_COUNT = list; }
	public void setList_w_subITEM_CD(List list) { l_w_subITEM_CD = list; }
	public void setList_w_subDATE_FROM_ALL(List list) { l_w_subDATE_FROM_ALL = list; }
	public void setList_w_subDATE_TO_ALL(List list) { l_w_subDATE_TO_ALL = list; }
	public void setList_w_subDUE_DATE(List list) { l_w_subDUE_DATE = list; }
	public void setList_subDM_QTY(List list) { l_subDM_QTY = list; }
	public void setList_PS_EDITION(List list) { l_PS_EDITION = list; }
	public void setList_PS_LT_FLG(List list) { l_PS_LT_FLG = list; }
	public void setList_PS_FIXED_LT(List list) { l_PS_FIXED_LT = list; }
	public void setList_PS_PROP_LT(List list) { l_PS_PROP_LT = list; }
	public void setList_PS_PROP_LOT_SIZE(List list) { l_PS_PROP_LOT_SIZE = list; }
	public void setList_PS_UNIT_DENOMINATOR(List list) { l_PS_UNIT_DENOMINATOR = list; }
	public void setList_PS_UNIT_NUMERATOR(List list) { l_PS_UNIT_NUMERATOR = list; }
	public void setList_PS_SPOIL(List list) { l_PS_SPOIL = list; }
	public void setList_CONS_TYP(List list) { l_CONS_TYP = list; }
	public void setList_EFF_PHASE_IN_DATE(List list) { l_EFF_PHASE_IN_DATE = list; }
	public void setList_EFF_PHASE_OUT_DATE(List list) { l_EFF_PHASE_OUT_DATE = list; }
	public void setList_PS_UNIT_QTY(List list) { l_PS_UNIT_QTY = list; }
	public void setList_TIME_CTRL(List list) { l_TIME_CTRL = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }

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
			l_w_DATE_FROM.add(((AC0090010Struct) list.get(i)).getw_DATE_FROM());
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
			l_w_DATE_TO.add(((AC0090010Struct) list.get(i)).getw_DATE_TO());
		}
		return size;
	}
	public int setL2L_w_subDM_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_subDM_QTY == null) {
			l_w_subDM_QTY = new ArrayList();
		} else {
			l_w_subDM_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_subDM_QTY.add(((AC0090010Struct) list.get(i)).getw_subDM_QTY());
		}
		return size;
	}
	public int setL2L_w_subITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_subITEM_NAME == null) {
			l_w_subITEM_NAME = new ArrayList();
		} else {
			l_w_subITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_subITEM_NAME.add(((AC0090010Struct) list.get(i)).getw_subITEM_NAME());
		}
		return size;
	}
	public int setL2L_w_subEXTERNAL_PLAN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_subEXTERNAL_PLAN_CD == null) {
			l_w_subEXTERNAL_PLAN_CD = new ArrayList();
		} else {
			l_w_subEXTERNAL_PLAN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_subEXTERNAL_PLAN_CD.add(((AC0090010Struct) list.get(i)).getw_subEXTERNAL_PLAN_CD());
		}
		return size;
	}
	public int setL2L_w_subPLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_subPLANT_CD == null) {
			l_w_subPLANT_CD = new ArrayList();
		} else {
			l_w_subPLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_subPLANT_CD.add(((AC0090010Struct) list.get(i)).getw_subPLANT_CD());
		}
		return size;
	}
	public int setL2L_w_subPLANT_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_subPLANT_NAME == null) {
			l_w_subPLANT_NAME = new ArrayList();
		} else {
			l_w_subPLANT_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_subPLANT_NAME.add(((AC0090010Struct) list.get(i)).getw_subPLANT_NAME());
		}
		return size;
	}
	public int setL2L_w_subDATE_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_subDATE_FROM == null) {
			l_w_subDATE_FROM = new ArrayList();
		} else {
			l_w_subDATE_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_subDATE_FROM.add(((AC0090010Struct) list.get(i)).getw_subDATE_FROM());
		}
		return size;
	}
	public int setL2L_w_subDATE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_subDATE_TO == null) {
			l_w_subDATE_TO = new ArrayList();
		} else {
			l_w_subDATE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_subDATE_TO.add(((AC0090010Struct) list.get(i)).getw_subDATE_TO());
		}
		return size;
	}
	public int setL2L_subSU_DM_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_subSU_DM_QTY == null) {
			l_subSU_DM_QTY = new ArrayList();
		} else {
			l_subSU_DM_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_subSU_DM_QTY.add(((AC0090010Struct) list.get(i)).getsubSU_DM_QTY());
		}
		return size;
	}
	public int setL2L_subRE_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_subRE_ODR_QTY == null) {
			l_subRE_ODR_QTY = new ArrayList();
		} else {
			l_subRE_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_subRE_ODR_QTY.add(((AC0090010Struct) list.get(i)).getsubRE_ODR_QTY());
		}
		return size;
	}
	public int setL2L_CP_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CP_UNIT == null) {
			l_CP_UNIT = new ArrayList();
		} else {
			l_CP_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CP_UNIT.add(((AC0090010Struct) list.get(i)).getCP_UNIT());
		}
		return size;
	}
	public int setL2L_w_TIME_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_TIME_FROM == null) {
			l_w_TIME_FROM = new ArrayList();
		} else {
			l_w_TIME_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_TIME_FROM.add(((AC0090010Struct) list.get(i)).getw_TIME_FROM());
		}
		return size;
	}
	public int setL2L_w_TIME_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_TIME_TO == null) {
			l_w_TIME_TO = new ArrayList();
		} else {
			l_w_TIME_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_TIME_TO.add(((AC0090010Struct) list.get(i)).getw_TIME_TO());
		}
		return size;
	}
	public int setL2L_w_subTIME_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_subTIME_FROM == null) {
			l_w_subTIME_FROM = new ArrayList();
		} else {
			l_w_subTIME_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_subTIME_FROM.add(((AC0090010Struct) list.get(i)).getw_subTIME_FROM());
		}
		return size;
	}
	public int setL2L_w_subTIME_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_subTIME_TO == null) {
			l_w_subTIME_TO = new ArrayList();
		} else {
			l_w_subTIME_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_subTIME_TO.add(((AC0090010Struct) list.get(i)).getw_subTIME_TO());
		}
		return size;
	}
	public int setL2L_w_subDUE_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_subDUE_TIME == null) {
			l_w_subDUE_TIME = new ArrayList();
		} else {
			l_w_subDUE_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_subDUE_TIME.add(((AC0090010Struct) list.get(i)).getw_subDUE_TIME());
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
			l_s_MIN_CAL_DATE.add(((AC0090010Struct) list.get(i)).gets_MIN_CAL_DATE());
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
			l_s_MAX_CAL_DATE.add(((AC0090010Struct) list.get(i)).gets_MAX_CAL_DATE());
		}
		return size;
	}
	public int setL2L_s_BUSINESS_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_BUSINESS_DATE == null) {
			l_s_BUSINESS_DATE = new ArrayList();
		} else {
			l_s_BUSINESS_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_BUSINESS_DATE.add(((AC0090010Struct) list.get(i)).gets_BUSINESS_DATE());
		}
		return size;
	}
	public int setL2L_s_PLANT_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_PLANT_NAME == null) {
			l_s_PLANT_NAME = new ArrayList();
		} else {
			l_s_PLANT_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_PLANT_NAME.add(((AC0090010Struct) list.get(i)).gets_PLANT_NAME());
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
			l_MODIFY_COUNT.add(((AC0090010Struct) list.get(i)).getMODIFY_COUNT());
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
			l_OD_NO.add(((AC0090010Struct) list.get(i)).getOD_NO());
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
			l_w_PLANT_CD.add(((AC0090010Struct) list.get(i)).getw_PLANT_CD());
		}
		return size;
	}
	public int setL2L_w_PLANT_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_PLANT_NAME == null) {
			l_w_PLANT_NAME = new ArrayList();
		} else {
			l_w_PLANT_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_PLANT_NAME.add(((AC0090010Struct) list.get(i)).getw_PLANT_NAME());
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
			l_w_ITEM_CD.add(((AC0090010Struct) list.get(i)).getw_ITEM_CD());
		}
		return size;
	}
	public int setL2L_w_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_ITEM_NAME == null) {
			l_w_ITEM_NAME = new ArrayList();
		} else {
			l_w_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_ITEM_NAME.add(((AC0090010Struct) list.get(i)).getw_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_w_DRAW_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_DRAW_CD == null) {
			l_w_DRAW_CD = new ArrayList();
		} else {
			l_w_DRAW_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_DRAW_CD.add(((AC0090010Struct) list.get(i)).getw_DRAW_CD());
		}
		return size;
	}
	public int setL2L_w_SPEC(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_SPEC == null) {
			l_w_SPEC = new ArrayList();
		} else {
			l_w_SPEC.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_SPEC.add(((AC0090010Struct) list.get(i)).getw_SPEC());
		}
		return size;
	}
	public int setL2L_w_MRP_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_MRP_ODR_TYP == null) {
			l_w_MRP_ODR_TYP = new ArrayList();
		} else {
			l_w_MRP_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_MRP_ODR_TYP.add(((AC0090010Struct) list.get(i)).getw_MRP_ODR_TYP());
		}
		return size;
	}
	public int setL2L_w_OUTSIDE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_OUTSIDE_TYP == null) {
			l_w_OUTSIDE_TYP = new ArrayList();
		} else {
			l_w_OUTSIDE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_OUTSIDE_TYP.add(((AC0090010Struct) list.get(i)).getw_OUTSIDE_TYP());
		}
		return size;
	}
	public int setL2L_w_ITEM_SPOIL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_ITEM_SPOIL == null) {
			l_w_ITEM_SPOIL = new ArrayList();
		} else {
			l_w_ITEM_SPOIL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_ITEM_SPOIL.add(((AC0090010Struct) list.get(i)).getw_ITEM_SPOIL());
		}
		return size;
	}
	public int setL2L_w_UNIT_QTY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_UNIT_QTY_TYP == null) {
			l_w_UNIT_QTY_TYP = new ArrayList();
		} else {
			l_w_UNIT_QTY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_UNIT_QTY_TYP.add(((AC0090010Struct) list.get(i)).getw_UNIT_QTY_TYP());
		}
		return size;
	}
	public int setL2L_w_LOT_SIZING_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_LOT_SIZING_TYP == null) {
			l_w_LOT_SIZING_TYP = new ArrayList();
		} else {
			l_w_LOT_SIZING_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_LOT_SIZING_TYP.add(((AC0090010Struct) list.get(i)).getw_LOT_SIZING_TYP());
		}
		return size;
	}
	public int setL2L_w_MAX_PERIOD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_MAX_PERIOD == null) {
			l_w_MAX_PERIOD = new ArrayList();
		} else {
			l_w_MAX_PERIOD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_MAX_PERIOD.add(((AC0090010Struct) list.get(i)).getw_MAX_PERIOD());
		}
		return size;
	}
	public int setL2L_w_MUL_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_MUL_ODR_QTY == null) {
			l_w_MUL_ODR_QTY = new ArrayList();
		} else {
			l_w_MUL_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_MUL_ODR_QTY.add(((AC0090010Struct) list.get(i)).getw_MUL_ODR_QTY());
		}
		return size;
	}
	public int setL2L_w_SAFETY_STOCK(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_SAFETY_STOCK == null) {
			l_w_SAFETY_STOCK = new ArrayList();
		} else {
			l_w_SAFETY_STOCK.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_SAFETY_STOCK.add(((AC0090010Struct) list.get(i)).getw_SAFETY_STOCK());
		}
		return size;
	}
	public int setL2L_w_MAX_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_MAX_ODR_QTY == null) {
			l_w_MAX_ODR_QTY = new ArrayList();
		} else {
			l_w_MAX_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_MAX_ODR_QTY.add(((AC0090010Struct) list.get(i)).getw_MAX_ODR_QTY());
		}
		return size;
	}
	public int setL2L_w_MIN_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_MIN_ODR_QTY == null) {
			l_w_MIN_ODR_QTY = new ArrayList();
		} else {
			l_w_MIN_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_MIN_ODR_QTY.add(((AC0090010Struct) list.get(i)).getw_MIN_ODR_QTY());
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
			l_STOCK_UNIT.add(((AC0090010Struct) list.get(i)).getSTOCK_UNIT());
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
			l_EXTERNAL_PLAN_CD.add(((AC0090010Struct) list.get(i)).getEXTERNAL_PLAN_CD());
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
			l_DUE_DATE.add(((AC0090010Struct) list.get(i)).getDUE_DATE());
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
			l_DM_QTY.add(((AC0090010Struct) list.get(i)).getDM_QTY());
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
			l_ODR_START_DATE.add(((AC0090010Struct) list.get(i)).getODR_START_DATE());
		}
		return size;
	}
	public int setL2L_w_DATE_FROM_ALL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_DATE_FROM_ALL == null) {
			l_w_DATE_FROM_ALL = new ArrayList();
		} else {
			l_w_DATE_FROM_ALL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_DATE_FROM_ALL.add(((AC0090010Struct) list.get(i)).getw_DATE_FROM_ALL());
		}
		return size;
	}
	public int setL2L_w_DATE_TO_ALL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_DATE_TO_ALL == null) {
			l_w_DATE_TO_ALL = new ArrayList();
		} else {
			l_w_DATE_TO_ALL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_DATE_TO_ALL.add(((AC0090010Struct) list.get(i)).getw_DATE_TO_ALL());
		}
		return size;
	}
	public int setL2L_subJOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_subJOB_ODR_CD == null) {
			l_subJOB_ODR_CD = new ArrayList();
		} else {
			l_subJOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_subJOB_ODR_CD.add(((AC0090010Struct) list.get(i)).getsubJOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_subITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_subITEM_CD == null) {
			l_subITEM_CD = new ArrayList();
		} else {
			l_subITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_subITEM_CD.add(((AC0090010Struct) list.get(i)).getsubITEM_CD());
		}
		return size;
	}
	public int setL2L_subITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_subITEM_NAME == null) {
			l_subITEM_NAME = new ArrayList();
		} else {
			l_subITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_subITEM_NAME.add(((AC0090010Struct) list.get(i)).getsubITEM_NAME());
		}
		return size;
	}
	public int setL2L_subODR_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_subODR_START_DATE == null) {
			l_subODR_START_DATE = new ArrayList();
		} else {
			l_subODR_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_subODR_START_DATE.add(((AC0090010Struct) list.get(i)).getsubODR_START_DATE());
		}
		return size;
	}
	public int setL2L_subPRD_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_subPRD_START_DATE == null) {
			l_subPRD_START_DATE = new ArrayList();
		} else {
			l_subPRD_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_subPRD_START_DATE.add(((AC0090010Struct) list.get(i)).getsubPRD_START_DATE());
		}
		return size;
	}
	public int setL2L_subPRD_DUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_subPRD_DUE_DATE == null) {
			l_subPRD_DUE_DATE = new ArrayList();
		} else {
			l_subPRD_DUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_subPRD_DUE_DATE.add(((AC0090010Struct) list.get(i)).getsubPRD_DUE_DATE());
		}
		return size;
	}
	public int setL2L_subODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_subODR_QTY == null) {
			l_subODR_QTY = new ArrayList();
		} else {
			l_subODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_subODR_QTY.add(((AC0090010Struct) list.get(i)).getsubODR_QTY());
		}
		return size;
	}
	public int setL2L_subPS_UNIT_DENOMINATOR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_subPS_UNIT_DENOMINATOR == null) {
			l_subPS_UNIT_DENOMINATOR = new ArrayList();
		} else {
			l_subPS_UNIT_DENOMINATOR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_subPS_UNIT_DENOMINATOR.add(((AC0090010Struct) list.get(i)).getsubPS_UNIT_DENOMINATOR());
		}
		return size;
	}
	public int setL2L_subPS_UNIT_NUMERATOR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_subPS_UNIT_NUMERATOR == null) {
			l_subPS_UNIT_NUMERATOR = new ArrayList();
		} else {
			l_subPS_UNIT_NUMERATOR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_subPS_UNIT_NUMERATOR.add(((AC0090010Struct) list.get(i)).getsubPS_UNIT_NUMERATOR());
		}
		return size;
	}
	public int setL2L_subOD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_subOD_NO == null) {
			l_subOD_NO = new ArrayList();
		} else {
			l_subOD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_subOD_NO.add(((AC0090010Struct) list.get(i)).getsubOD_NO());
		}
		return size;
	}
	public int setL2L_subMODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_subMODIFY_COUNT == null) {
			l_subMODIFY_COUNT = new ArrayList();
		} else {
			l_subMODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_subMODIFY_COUNT.add(((AC0090010Struct) list.get(i)).getsubMODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_w_subITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_subITEM_CD == null) {
			l_w_subITEM_CD = new ArrayList();
		} else {
			l_w_subITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_subITEM_CD.add(((AC0090010Struct) list.get(i)).getw_subITEM_CD());
		}
		return size;
	}
	public int setL2L_w_subDATE_FROM_ALL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_subDATE_FROM_ALL == null) {
			l_w_subDATE_FROM_ALL = new ArrayList();
		} else {
			l_w_subDATE_FROM_ALL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_subDATE_FROM_ALL.add(((AC0090010Struct) list.get(i)).getw_subDATE_FROM_ALL());
		}
		return size;
	}
	public int setL2L_w_subDATE_TO_ALL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_subDATE_TO_ALL == null) {
			l_w_subDATE_TO_ALL = new ArrayList();
		} else {
			l_w_subDATE_TO_ALL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_subDATE_TO_ALL.add(((AC0090010Struct) list.get(i)).getw_subDATE_TO_ALL());
		}
		return size;
	}
	public int setL2L_w_subDUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_subDUE_DATE == null) {
			l_w_subDUE_DATE = new ArrayList();
		} else {
			l_w_subDUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_subDUE_DATE.add(((AC0090010Struct) list.get(i)).getw_subDUE_DATE());
		}
		return size;
	}
	public int setL2L_subDM_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_subDM_QTY == null) {
			l_subDM_QTY = new ArrayList();
		} else {
			l_subDM_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_subDM_QTY.add(((AC0090010Struct) list.get(i)).getsubDM_QTY());
		}
		return size;
	}
	public int setL2L_PS_EDITION(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PS_EDITION == null) {
			l_PS_EDITION = new ArrayList();
		} else {
			l_PS_EDITION.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PS_EDITION.add(((AC0090010Struct) list.get(i)).getPS_EDITION());
		}
		return size;
	}
	public int setL2L_PS_LT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PS_LT_FLG == null) {
			l_PS_LT_FLG = new ArrayList();
		} else {
			l_PS_LT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PS_LT_FLG.add(((AC0090010Struct) list.get(i)).getPS_LT_FLG());
		}
		return size;
	}
	public int setL2L_PS_FIXED_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PS_FIXED_LT == null) {
			l_PS_FIXED_LT = new ArrayList();
		} else {
			l_PS_FIXED_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PS_FIXED_LT.add(((AC0090010Struct) list.get(i)).getPS_FIXED_LT());
		}
		return size;
	}
	public int setL2L_PS_PROP_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PS_PROP_LT == null) {
			l_PS_PROP_LT = new ArrayList();
		} else {
			l_PS_PROP_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PS_PROP_LT.add(((AC0090010Struct) list.get(i)).getPS_PROP_LT());
		}
		return size;
	}
	public int setL2L_PS_PROP_LOT_SIZE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PS_PROP_LOT_SIZE == null) {
			l_PS_PROP_LOT_SIZE = new ArrayList();
		} else {
			l_PS_PROP_LOT_SIZE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PS_PROP_LOT_SIZE.add(((AC0090010Struct) list.get(i)).getPS_PROP_LOT_SIZE());
		}
		return size;
	}
	public int setL2L_PS_UNIT_DENOMINATOR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PS_UNIT_DENOMINATOR == null) {
			l_PS_UNIT_DENOMINATOR = new ArrayList();
		} else {
			l_PS_UNIT_DENOMINATOR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PS_UNIT_DENOMINATOR.add(((AC0090010Struct) list.get(i)).getPS_UNIT_DENOMINATOR());
		}
		return size;
	}
	public int setL2L_PS_UNIT_NUMERATOR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PS_UNIT_NUMERATOR == null) {
			l_PS_UNIT_NUMERATOR = new ArrayList();
		} else {
			l_PS_UNIT_NUMERATOR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PS_UNIT_NUMERATOR.add(((AC0090010Struct) list.get(i)).getPS_UNIT_NUMERATOR());
		}
		return size;
	}
	public int setL2L_PS_SPOIL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PS_SPOIL == null) {
			l_PS_SPOIL = new ArrayList();
		} else {
			l_PS_SPOIL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PS_SPOIL.add(((AC0090010Struct) list.get(i)).getPS_SPOIL());
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
			l_CONS_TYP.add(((AC0090010Struct) list.get(i)).getCONS_TYP());
		}
		return size;
	}
	public int setL2L_EFF_PHASE_IN_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EFF_PHASE_IN_DATE == null) {
			l_EFF_PHASE_IN_DATE = new ArrayList();
		} else {
			l_EFF_PHASE_IN_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EFF_PHASE_IN_DATE.add(((AC0090010Struct) list.get(i)).getEFF_PHASE_IN_DATE());
		}
		return size;
	}
	public int setL2L_EFF_PHASE_OUT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EFF_PHASE_OUT_DATE == null) {
			l_EFF_PHASE_OUT_DATE = new ArrayList();
		} else {
			l_EFF_PHASE_OUT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EFF_PHASE_OUT_DATE.add(((AC0090010Struct) list.get(i)).getEFF_PHASE_OUT_DATE());
		}
		return size;
	}
	public int setL2L_PS_UNIT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PS_UNIT_QTY == null) {
			l_PS_UNIT_QTY = new ArrayList();
		} else {
			l_PS_UNIT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PS_UNIT_QTY.add(((AC0090010Struct) list.get(i)).getPS_UNIT_QTY());
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
			l_TIME_CTRL.add(((AC0090010Struct) list.get(i)).getTIME_CTRL());
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
			l_l_COUNT.add(((AC0090010Struct) list.get(i)).getl_COUNT());
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
			l_ROW_COUNT.add(((AC0090010Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_w_DATE_FROM = null;
		m_w_DATE_TO = null;
		m_w_subDM_QTY = null;
		m_w_subITEM_NAME = null;
		m_w_subEXTERNAL_PLAN_CD = null;
		m_w_subPLANT_CD = null;
		m_w_subPLANT_NAME = null;
		m_w_subDATE_FROM = null;
		m_w_subDATE_TO = null;
		m_subSU_DM_QTY = null;
		m_subRE_ODR_QTY = null;
		m_CP_UNIT = null;
		m_w_TIME_FROM = null;
		m_w_TIME_TO = null;
		m_w_subTIME_FROM = null;
		m_w_subTIME_TO = null;
		m_w_subDUE_TIME = null;
		m_s_MIN_CAL_DATE = null;
		m_s_MAX_CAL_DATE = null;
		m_s_BUSINESS_DATE = null;
		m_s_PLANT_NAME = null;
		m_MODIFY_COUNT = null;
		m_OD_NO = null;
		m_w_PLANT_CD = null;
		m_w_PLANT_NAME = null;
		m_w_ITEM_CD = null;
		m_w_ITEM_NAME = null;
		m_w_DRAW_CD = null;
		m_w_SPEC = null;
		m_w_MRP_ODR_TYP = null;
		m_w_OUTSIDE_TYP = null;
		m_w_ITEM_SPOIL = null;
		m_w_UNIT_QTY_TYP = null;
		m_w_LOT_SIZING_TYP = null;
		m_w_MAX_PERIOD = null;
		m_w_MUL_ODR_QTY = null;
		m_w_SAFETY_STOCK = null;
		m_w_MAX_ODR_QTY = null;
		m_w_MIN_ODR_QTY = null;
		m_STOCK_UNIT = null;
		m_EXTERNAL_PLAN_CD = null;
		m_DUE_DATE = null;
		m_DM_QTY = null;
		m_ODR_START_DATE = null;
		m_w_DATE_FROM_ALL = null;
		m_w_DATE_TO_ALL = null;
		m_subJOB_ODR_CD = null;
		m_subITEM_CD = null;
		m_subITEM_NAME = null;
		m_subODR_START_DATE = null;
		m_subPRD_START_DATE = null;
		m_subPRD_DUE_DATE = null;
		m_subODR_QTY = null;
		m_subPS_UNIT_DENOMINATOR = null;
		m_subPS_UNIT_NUMERATOR = null;
		m_subOD_NO = null;
		m_subMODIFY_COUNT = null;
		m_w_subITEM_CD = null;
		m_w_subDATE_FROM_ALL = null;
		m_w_subDATE_TO_ALL = null;
		m_w_subDUE_DATE = null;
		m_subDM_QTY = null;
		m_PS_EDITION = null;
		m_PS_LT_FLG = null;
		m_PS_FIXED_LT = null;
		m_PS_PROP_LT = null;
		m_PS_PROP_LOT_SIZE = null;
		m_PS_UNIT_DENOMINATOR = null;
		m_PS_UNIT_NUMERATOR = null;
		m_PS_SPOIL = null;
		m_CONS_TYP = null;
		m_EFF_PHASE_IN_DATE = null;
		m_EFF_PHASE_OUT_DATE = null;
		m_PS_UNIT_QTY = null;
		m_TIME_CTRL = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;

		l_w_DATE_FROM = null;
		l_w_DATE_TO = null;
		l_w_subDM_QTY = null;
		l_w_subITEM_NAME = null;
		l_w_subEXTERNAL_PLAN_CD = null;
		l_w_subPLANT_CD = null;
		l_w_subPLANT_NAME = null;
		l_w_subDATE_FROM = null;
		l_w_subDATE_TO = null;
		l_subSU_DM_QTY = null;
		l_subRE_ODR_QTY = null;
		l_CP_UNIT = null;
		l_w_TIME_FROM = null;
		l_w_TIME_TO = null;
		l_w_subTIME_FROM = null;
		l_w_subTIME_TO = null;
		l_w_subDUE_TIME = null;
		l_s_MIN_CAL_DATE = null;
		l_s_MAX_CAL_DATE = null;
		l_s_BUSINESS_DATE = null;
		l_s_PLANT_NAME = null;
		l_MODIFY_COUNT = null;
		l_OD_NO = null;
		l_w_PLANT_CD = null;
		l_w_PLANT_NAME = null;
		l_w_ITEM_CD = null;
		l_w_ITEM_NAME = null;
		l_w_DRAW_CD = null;
		l_w_SPEC = null;
		l_w_MRP_ODR_TYP = null;
		l_w_OUTSIDE_TYP = null;
		l_w_ITEM_SPOIL = null;
		l_w_UNIT_QTY_TYP = null;
		l_w_LOT_SIZING_TYP = null;
		l_w_MAX_PERIOD = null;
		l_w_MUL_ODR_QTY = null;
		l_w_SAFETY_STOCK = null;
		l_w_MAX_ODR_QTY = null;
		l_w_MIN_ODR_QTY = null;
		l_STOCK_UNIT = null;
		l_EXTERNAL_PLAN_CD = null;
		l_DUE_DATE = null;
		l_DM_QTY = null;
		l_ODR_START_DATE = null;
		l_w_DATE_FROM_ALL = null;
		l_w_DATE_TO_ALL = null;
		l_subJOB_ODR_CD = null;
		l_subITEM_CD = null;
		l_subITEM_NAME = null;
		l_subODR_START_DATE = null;
		l_subPRD_START_DATE = null;
		l_subPRD_DUE_DATE = null;
		l_subODR_QTY = null;
		l_subPS_UNIT_DENOMINATOR = null;
		l_subPS_UNIT_NUMERATOR = null;
		l_subOD_NO = null;
		l_subMODIFY_COUNT = null;
		l_w_subITEM_CD = null;
		l_w_subDATE_FROM_ALL = null;
		l_w_subDATE_TO_ALL = null;
		l_w_subDUE_DATE = null;
		l_subDM_QTY = null;
		l_PS_EDITION = null;
		l_PS_LT_FLG = null;
		l_PS_FIXED_LT = null;
		l_PS_PROP_LT = null;
		l_PS_PROP_LOT_SIZE = null;
		l_PS_UNIT_DENOMINATOR = null;
		l_PS_UNIT_NUMERATOR = null;
		l_PS_SPOIL = null;
		l_CONS_TYP = null;
		l_EFF_PHASE_IN_DATE = null;
		l_EFF_PHASE_OUT_DATE = null;
		l_PS_UNIT_QTY = null;
		l_TIME_CTRL = null;
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
	 * medAC0090010クラスの標準コンストラクタ
	 */
	public AC0090010Struct()
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
	public void setStruct(AC0090010Struct struct)
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
	public void setStructM(AC0090010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setw_DATE_FROM(struct.getw_DATE_FROM());
			this.setw_DATE_TO(struct.getw_DATE_TO());
			this.setw_subDM_QTY(struct.getw_subDM_QTY());
			this.setw_subITEM_NAME(struct.getw_subITEM_NAME());
			this.setw_subEXTERNAL_PLAN_CD(struct.getw_subEXTERNAL_PLAN_CD());
			this.setw_subPLANT_CD(struct.getw_subPLANT_CD());
			this.setw_subPLANT_NAME(struct.getw_subPLANT_NAME());
			this.setw_subDATE_FROM(struct.getw_subDATE_FROM());
			this.setw_subDATE_TO(struct.getw_subDATE_TO());
			this.setsubSU_DM_QTY(struct.getsubSU_DM_QTY());
			this.setsubRE_ODR_QTY(struct.getsubRE_ODR_QTY());
			this.setCP_UNIT(struct.getCP_UNIT());
			this.setw_TIME_FROM(struct.getw_TIME_FROM());
			this.setw_TIME_TO(struct.getw_TIME_TO());
			this.setw_subTIME_FROM(struct.getw_subTIME_FROM());
			this.setw_subTIME_TO(struct.getw_subTIME_TO());
			this.setw_subDUE_TIME(struct.getw_subDUE_TIME());
			this.sets_MIN_CAL_DATE(struct.gets_MIN_CAL_DATE());
			this.sets_MAX_CAL_DATE(struct.gets_MAX_CAL_DATE());
			this.sets_BUSINESS_DATE(struct.gets_BUSINESS_DATE());
			this.sets_PLANT_NAME(struct.gets_PLANT_NAME());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setOD_NO(struct.getOD_NO());
			this.setw_PLANT_CD(struct.getw_PLANT_CD());
			this.setw_PLANT_NAME(struct.getw_PLANT_NAME());
			this.setw_ITEM_CD(struct.getw_ITEM_CD());
			this.setw_ITEM_NAME(struct.getw_ITEM_NAME());
			this.setw_DRAW_CD(struct.getw_DRAW_CD());
			this.setw_SPEC(struct.getw_SPEC());
			this.setw_MRP_ODR_TYP(struct.getw_MRP_ODR_TYP());
			this.setw_OUTSIDE_TYP(struct.getw_OUTSIDE_TYP());
			this.setw_ITEM_SPOIL(struct.getw_ITEM_SPOIL());
			this.setw_UNIT_QTY_TYP(struct.getw_UNIT_QTY_TYP());
			this.setw_LOT_SIZING_TYP(struct.getw_LOT_SIZING_TYP());
			this.setw_MAX_PERIOD(struct.getw_MAX_PERIOD());
			this.setw_MUL_ODR_QTY(struct.getw_MUL_ODR_QTY());
			this.setw_SAFETY_STOCK(struct.getw_SAFETY_STOCK());
			this.setw_MAX_ODR_QTY(struct.getw_MAX_ODR_QTY());
			this.setw_MIN_ODR_QTY(struct.getw_MIN_ODR_QTY());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setEXTERNAL_PLAN_CD(struct.getEXTERNAL_PLAN_CD());
			this.setDUE_DATE(struct.getDUE_DATE());
			this.setDM_QTY(struct.getDM_QTY());
			this.setODR_START_DATE(struct.getODR_START_DATE());
			this.setw_DATE_FROM_ALL(struct.getw_DATE_FROM_ALL());
			this.setw_DATE_TO_ALL(struct.getw_DATE_TO_ALL());
			this.setsubJOB_ODR_CD(struct.getsubJOB_ODR_CD());
			this.setsubITEM_CD(struct.getsubITEM_CD());
			this.setsubITEM_NAME(struct.getsubITEM_NAME());
			this.setsubODR_START_DATE(struct.getsubODR_START_DATE());
			this.setsubPRD_START_DATE(struct.getsubPRD_START_DATE());
			this.setsubPRD_DUE_DATE(struct.getsubPRD_DUE_DATE());
			this.setsubODR_QTY(struct.getsubODR_QTY());
			this.setsubPS_UNIT_DENOMINATOR(struct.getsubPS_UNIT_DENOMINATOR());
			this.setsubPS_UNIT_NUMERATOR(struct.getsubPS_UNIT_NUMERATOR());
			this.setsubOD_NO(struct.getsubOD_NO());
			this.setsubMODIFY_COUNT(struct.getsubMODIFY_COUNT());
			this.setw_subITEM_CD(struct.getw_subITEM_CD());
			this.setw_subDATE_FROM_ALL(struct.getw_subDATE_FROM_ALL());
			this.setw_subDATE_TO_ALL(struct.getw_subDATE_TO_ALL());
			this.setw_subDUE_DATE(struct.getw_subDUE_DATE());
			this.setsubDM_QTY(struct.getsubDM_QTY());
			this.setPS_EDITION(struct.getPS_EDITION());
			this.setPS_LT_FLG(struct.getPS_LT_FLG());
			this.setPS_FIXED_LT(struct.getPS_FIXED_LT());
			this.setPS_PROP_LT(struct.getPS_PROP_LT());
			this.setPS_PROP_LOT_SIZE(struct.getPS_PROP_LOT_SIZE());
			this.setPS_UNIT_DENOMINATOR(struct.getPS_UNIT_DENOMINATOR());
			this.setPS_UNIT_NUMERATOR(struct.getPS_UNIT_NUMERATOR());
			this.setPS_SPOIL(struct.getPS_SPOIL());
			this.setCONS_TYP(struct.getCONS_TYP());
			this.setEFF_PHASE_IN_DATE(struct.getEFF_PHASE_IN_DATE());
			this.setEFF_PHASE_OUT_DATE(struct.getEFF_PHASE_OUT_DATE());
			this.setPS_UNIT_QTY(struct.getPS_UNIT_QTY());
			this.setTIME_CTRL(struct.getTIME_CTRL());
			this.setl_COUNT(struct.getl_COUNT());
			this.setROW_COUNT(struct.getROW_COUNT());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AC0090010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_w_DATE_FROM(struct.getList_w_DATE_FROM());
			this.setList_w_DATE_TO(struct.getList_w_DATE_TO());
			this.setList_w_subDM_QTY(struct.getList_w_subDM_QTY());
			this.setList_w_subITEM_NAME(struct.getList_w_subITEM_NAME());
			this.setList_w_subEXTERNAL_PLAN_CD(struct.getList_w_subEXTERNAL_PLAN_CD());
			this.setList_w_subPLANT_CD(struct.getList_w_subPLANT_CD());
			this.setList_w_subPLANT_NAME(struct.getList_w_subPLANT_NAME());
			this.setList_w_subDATE_FROM(struct.getList_w_subDATE_FROM());
			this.setList_w_subDATE_TO(struct.getList_w_subDATE_TO());
			this.setList_subSU_DM_QTY(struct.getList_subSU_DM_QTY());
			this.setList_subRE_ODR_QTY(struct.getList_subRE_ODR_QTY());
			this.setList_CP_UNIT(struct.getList_CP_UNIT());
			this.setList_w_TIME_FROM(struct.getList_w_TIME_FROM());
			this.setList_w_TIME_TO(struct.getList_w_TIME_TO());
			this.setList_w_subTIME_FROM(struct.getList_w_subTIME_FROM());
			this.setList_w_subTIME_TO(struct.getList_w_subTIME_TO());
			this.setList_w_subDUE_TIME(struct.getList_w_subDUE_TIME());
			this.setList_s_MIN_CAL_DATE(struct.getList_s_MIN_CAL_DATE());
			this.setList_s_MAX_CAL_DATE(struct.getList_s_MAX_CAL_DATE());
			this.setList_s_BUSINESS_DATE(struct.getList_s_BUSINESS_DATE());
			this.setList_s_PLANT_NAME(struct.getList_s_PLANT_NAME());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_OD_NO(struct.getList_OD_NO());
			this.setList_w_PLANT_CD(struct.getList_w_PLANT_CD());
			this.setList_w_PLANT_NAME(struct.getList_w_PLANT_NAME());
			this.setList_w_ITEM_CD(struct.getList_w_ITEM_CD());
			this.setList_w_ITEM_NAME(struct.getList_w_ITEM_NAME());
			this.setList_w_DRAW_CD(struct.getList_w_DRAW_CD());
			this.setList_w_SPEC(struct.getList_w_SPEC());
			this.setList_w_MRP_ODR_TYP(struct.getList_w_MRP_ODR_TYP());
			this.setList_w_OUTSIDE_TYP(struct.getList_w_OUTSIDE_TYP());
			this.setList_w_ITEM_SPOIL(struct.getList_w_ITEM_SPOIL());
			this.setList_w_UNIT_QTY_TYP(struct.getList_w_UNIT_QTY_TYP());
			this.setList_w_LOT_SIZING_TYP(struct.getList_w_LOT_SIZING_TYP());
			this.setList_w_MAX_PERIOD(struct.getList_w_MAX_PERIOD());
			this.setList_w_MUL_ODR_QTY(struct.getList_w_MUL_ODR_QTY());
			this.setList_w_SAFETY_STOCK(struct.getList_w_SAFETY_STOCK());
			this.setList_w_MAX_ODR_QTY(struct.getList_w_MAX_ODR_QTY());
			this.setList_w_MIN_ODR_QTY(struct.getList_w_MIN_ODR_QTY());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_EXTERNAL_PLAN_CD(struct.getList_EXTERNAL_PLAN_CD());
			this.setList_DUE_DATE(struct.getList_DUE_DATE());
			this.setList_DM_QTY(struct.getList_DM_QTY());
			this.setList_ODR_START_DATE(struct.getList_ODR_START_DATE());
			this.setList_w_DATE_FROM_ALL(struct.getList_w_DATE_FROM_ALL());
			this.setList_w_DATE_TO_ALL(struct.getList_w_DATE_TO_ALL());
			this.setList_subJOB_ODR_CD(struct.getList_subJOB_ODR_CD());
			this.setList_subITEM_CD(struct.getList_subITEM_CD());
			this.setList_subITEM_NAME(struct.getList_subITEM_NAME());
			this.setList_subODR_START_DATE(struct.getList_subODR_START_DATE());
			this.setList_subPRD_START_DATE(struct.getList_subPRD_START_DATE());
			this.setList_subPRD_DUE_DATE(struct.getList_subPRD_DUE_DATE());
			this.setList_subODR_QTY(struct.getList_subODR_QTY());
			this.setList_subPS_UNIT_DENOMINATOR(struct.getList_subPS_UNIT_DENOMINATOR());
			this.setList_subPS_UNIT_NUMERATOR(struct.getList_subPS_UNIT_NUMERATOR());
			this.setList_subOD_NO(struct.getList_subOD_NO());
			this.setList_subMODIFY_COUNT(struct.getList_subMODIFY_COUNT());
			this.setList_w_subITEM_CD(struct.getList_w_subITEM_CD());
			this.setList_w_subDATE_FROM_ALL(struct.getList_w_subDATE_FROM_ALL());
			this.setList_w_subDATE_TO_ALL(struct.getList_w_subDATE_TO_ALL());
			this.setList_w_subDUE_DATE(struct.getList_w_subDUE_DATE());
			this.setList_subDM_QTY(struct.getList_subDM_QTY());
			this.setList_PS_EDITION(struct.getList_PS_EDITION());
			this.setList_PS_LT_FLG(struct.getList_PS_LT_FLG());
			this.setList_PS_FIXED_LT(struct.getList_PS_FIXED_LT());
			this.setList_PS_PROP_LT(struct.getList_PS_PROP_LT());
			this.setList_PS_PROP_LOT_SIZE(struct.getList_PS_PROP_LOT_SIZE());
			this.setList_PS_UNIT_DENOMINATOR(struct.getList_PS_UNIT_DENOMINATOR());
			this.setList_PS_UNIT_NUMERATOR(struct.getList_PS_UNIT_NUMERATOR());
			this.setList_PS_SPOIL(struct.getList_PS_SPOIL());
			this.setList_CONS_TYP(struct.getList_CONS_TYP());
			this.setList_EFF_PHASE_IN_DATE(struct.getList_EFF_PHASE_IN_DATE());
			this.setList_EFF_PHASE_OUT_DATE(struct.getList_EFF_PHASE_OUT_DATE());
			this.setList_PS_UNIT_QTY(struct.getList_PS_UNIT_QTY());
			this.setList_TIME_CTRL(struct.getList_TIME_CTRL());
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
	// 第 1 変数初期値： i_w_DATE_FROM


	final static String i_w_DATE_FROM = null;

	// 第 2 変数初期値： i_w_DATE_TO


	final static String i_w_DATE_TO = null;

	// 第 3 変数初期値： i_w_subDM_QTY


	final static String i_w_subDM_QTY = null;

	// 第 4 変数初期値： i_w_subITEM_NAME


	final static String i_w_subITEM_NAME = null;

	// 第 5 変数初期値： i_w_subEXTERNAL_PLAN_CD


	final static String i_w_subEXTERNAL_PLAN_CD = null;

	// 第 6 変数初期値： i_w_subPLANT_CD


	final static String i_w_subPLANT_CD = null;

	// 第 7 変数初期値： i_w_subPLANT_NAME


	final static String i_w_subPLANT_NAME = null;

	// 第 8 変数初期値： i_w_subDATE_FROM


	final static String i_w_subDATE_FROM = null;

	// 第 9 変数初期値： i_w_subDATE_TO


	final static String i_w_subDATE_TO = null;

	// 第 10 変数初期値： i_subSU_DM_QTY


	final static String i_subSU_DM_QTY = null;

	// 第 11 変数初期値： i_subRE_ODR_QTY


	final static String i_subRE_ODR_QTY = null;

	// 第 12 変数初期値： i_CP_UNIT


	final static String i_CP_UNIT = null;

	// 第 13 変数初期値： i_w_TIME_FROM


	final static String i_w_TIME_FROM = null;

	// 第 14 変数初期値： i_w_TIME_TO


	final static String i_w_TIME_TO = null;

	// 第 15 変数初期値： i_w_subTIME_FROM


	final static String i_w_subTIME_FROM = null;

	// 第 16 変数初期値： i_w_subTIME_TO


	final static String i_w_subTIME_TO = null;

	// 第 17 変数初期値： i_w_subDUE_TIME


	final static String i_w_subDUE_TIME = null;

	// 第 18 変数初期値： i_s_MIN_CAL_DATE


	final static String i_s_MIN_CAL_DATE = null;

	// 第 19 変数初期値： i_s_MAX_CAL_DATE


	final static String i_s_MAX_CAL_DATE = null;

	// 第 20 変数初期値： i_s_BUSINESS_DATE


	final static String i_s_BUSINESS_DATE = null;

	// 第 21 変数初期値： i_s_PLANT_NAME


	final static String i_s_PLANT_NAME = null;

	// 第 22 変数初期値： i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// 第 23 変数初期値： i_OD_NO


	final static String i_OD_NO = null;

	// 第 24 変数初期値： i_w_PLANT_CD


	final static String i_w_PLANT_CD = null;

	// 第 25 変数初期値： i_w_PLANT_NAME


	final static String i_w_PLANT_NAME = null;

	// 第 26 変数初期値： i_w_ITEM_CD


	final static String i_w_ITEM_CD = null;

	// 第 27 変数初期値： i_w_ITEM_NAME


	final static String i_w_ITEM_NAME = null;

	// 第 28 変数初期値： i_w_DRAW_CD


	final static String i_w_DRAW_CD = null;

	// 第 29 変数初期値： i_w_SPEC


	final static String i_w_SPEC = null;

	// 第 30 変数初期値： i_w_MRP_ODR_TYP


	final static String i_w_MRP_ODR_TYP = null;

	// 第 31 変数初期値： i_w_OUTSIDE_TYP


	final static String i_w_OUTSIDE_TYP = null;

	// 第 32 変数初期値： i_w_ITEM_SPOIL


	final static String i_w_ITEM_SPOIL = null;

	// 第 33 変数初期値： i_w_UNIT_QTY_TYP


	final static String i_w_UNIT_QTY_TYP = null;

	// 第 34 変数初期値： i_w_LOT_SIZING_TYP


	final static String i_w_LOT_SIZING_TYP = null;

	// 第 35 変数初期値： i_w_MAX_PERIOD


	final static String i_w_MAX_PERIOD = null;

	// 第 36 変数初期値： i_w_MUL_ODR_QTY


	final static String i_w_MUL_ODR_QTY = null;

	// 第 37 変数初期値： i_w_SAFETY_STOCK


	final static String i_w_SAFETY_STOCK = null;

	// 第 38 変数初期値： i_w_MAX_ODR_QTY


	final static String i_w_MAX_ODR_QTY = null;

	// 第 39 変数初期値： i_w_MIN_ODR_QTY


	final static String i_w_MIN_ODR_QTY = null;

	// 第 40 変数初期値： i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// 第 41 変数初期値： i_EXTERNAL_PLAN_CD


	final static String i_EXTERNAL_PLAN_CD = null;

	// 第 42 変数初期値： i_DUE_DATE


	final static String i_DUE_DATE = null;

	// 第 43 変数初期値： i_DM_QTY


	final static String i_DM_QTY = null;

	// 第 44 変数初期値： i_ODR_START_DATE


	final static String i_ODR_START_DATE = null;

	// 第 45 変数初期値： i_w_DATE_FROM_ALL


	final static String i_w_DATE_FROM_ALL = null;

	// 第 46 変数初期値： i_w_DATE_TO_ALL


	final static String i_w_DATE_TO_ALL = null;

	// 第 47 変数初期値： i_subJOB_ODR_CD


	final static String i_subJOB_ODR_CD = null;

	// 第 48 変数初期値： i_subITEM_CD


	final static String i_subITEM_CD = null;

	// 第 49 変数初期値： i_subITEM_NAME


	final static String i_subITEM_NAME = null;

	// 第 50 変数初期値： i_subODR_START_DATE


	final static String i_subODR_START_DATE = null;

	// 第 51 変数初期値： i_subPRD_START_DATE


	final static String i_subPRD_START_DATE = null;

	// 第 52 変数初期値： i_subPRD_DUE_DATE


	final static String i_subPRD_DUE_DATE = null;

	// 第 53 変数初期値： i_subODR_QTY


	final static String i_subODR_QTY = null;

	// 第 54 変数初期値： i_subPS_UNIT_DENOMINATOR


	final static String i_subPS_UNIT_DENOMINATOR = null;

	// 第 55 変数初期値： i_subPS_UNIT_NUMERATOR


	final static String i_subPS_UNIT_NUMERATOR = null;

	// 第 56 変数初期値： i_subOD_NO


	final static String i_subOD_NO = null;

	// 第 57 変数初期値： i_subMODIFY_COUNT


	final static String i_subMODIFY_COUNT = null;

	// 第 58 変数初期値： i_w_subITEM_CD


	final static String i_w_subITEM_CD = null;

	// 第 59 変数初期値： i_w_subDATE_FROM_ALL


	final static String i_w_subDATE_FROM_ALL = null;

	// 第 60 変数初期値： i_w_subDATE_TO_ALL


	final static String i_w_subDATE_TO_ALL = null;

	// 第 61 変数初期値： i_w_subDUE_DATE


	final static String i_w_subDUE_DATE = null;

	// 第 62 変数初期値： i_subDM_QTY


	final static String i_subDM_QTY = null;

	// 第 63 変数初期値： i_PS_EDITION


	final static String i_PS_EDITION = null;

	// 第 64 変数初期値： i_PS_LT_FLG


	final static String i_PS_LT_FLG = null;

	// 第 65 変数初期値： i_PS_FIXED_LT


	final static String i_PS_FIXED_LT = null;

	// 第 66 変数初期値： i_PS_PROP_LT


	final static String i_PS_PROP_LT = null;

	// 第 67 変数初期値： i_PS_PROP_LOT_SIZE


	final static String i_PS_PROP_LOT_SIZE = null;

	// 第 68 変数初期値： i_PS_UNIT_DENOMINATOR


	final static String i_PS_UNIT_DENOMINATOR = null;

	// 第 69 変数初期値： i_PS_UNIT_NUMERATOR


	final static String i_PS_UNIT_NUMERATOR = null;

	// 第 70 変数初期値： i_PS_SPOIL


	final static String i_PS_SPOIL = null;

	// 第 71 変数初期値： i_CONS_TYP


	final static String i_CONS_TYP = null;

	// 第 72 変数初期値： i_EFF_PHASE_IN_DATE


	final static String i_EFF_PHASE_IN_DATE = null;

	// 第 73 変数初期値： i_EFF_PHASE_OUT_DATE


	final static String i_EFF_PHASE_OUT_DATE = null;

	// 第 74 変数初期値： i_PS_UNIT_QTY


	final static String i_PS_UNIT_QTY = null;

	// 第 75 変数初期値： i_TIME_CTRL


	final static String i_TIME_CTRL = null;

	// 第 76 変数初期値： i_l_COUNT


	final static String i_l_COUNT = null;

	// 第 77 変数初期値： i_ROW_COUNT


	final static String i_ROW_COUNT = null;

*/

	//{{user_implement_code
        //------------------------------------------------------------------
        public void copy(AC0090010Struct s)
        {
         clear();
         if(s.m_w_PLANT_CD != null) m_w_PLANT_CD = new String(s.m_w_PLANT_CD);
         if(s.m_w_PLANT_NAME != null) m_w_PLANT_NAME = new String(s.m_w_PLANT_NAME);
         if(s.m_w_ITEM_CD != null) m_w_ITEM_CD = new String(s.m_w_ITEM_CD);
         if(s.m_w_ITEM_NAME != null) m_w_ITEM_NAME = new String(s.m_w_ITEM_NAME);
         if(s.m_w_DRAW_CD != null) m_w_DRAW_CD = new String(s.m_w_DRAW_CD);
         if(s.m_w_SPEC != null) m_w_SPEC = new String(s.m_w_SPEC);
         if(s.m_w_MRP_ODR_TYP != null) m_w_MRP_ODR_TYP = new String(s.m_w_MRP_ODR_TYP);
         if(s.m_w_OUTSIDE_TYP != null) m_w_OUTSIDE_TYP = new String(s.m_w_OUTSIDE_TYP);
         if(s.m_w_ITEM_SPOIL != null) m_w_ITEM_SPOIL = new String(s.m_w_ITEM_SPOIL);
         if(s.m_w_UNIT_QTY_TYP != null) m_w_UNIT_QTY_TYP = new String(s.m_w_UNIT_QTY_TYP);
         if(s.m_w_LOT_SIZING_TYP != null) m_w_LOT_SIZING_TYP = new String(s.m_w_LOT_SIZING_TYP);
         if(s.m_w_MAX_PERIOD != null) m_w_MAX_PERIOD = new String(s.m_w_MAX_PERIOD);
         if(s.m_w_MUL_ODR_QTY != null) m_w_MUL_ODR_QTY = new String(s.m_w_MUL_ODR_QTY);
         if(s.m_w_SAFETY_STOCK != null) m_w_SAFETY_STOCK = new String(s.m_w_SAFETY_STOCK);
         if(s.m_w_MAX_ODR_QTY != null) m_w_MAX_ODR_QTY = new String(s.m_w_MAX_ODR_QTY);
         if(s.m_w_MIN_ODR_QTY != null) m_w_MIN_ODR_QTY = new String(s.m_w_MIN_ODR_QTY);
         if(s.m_s_MIN_CAL_DATE != null) m_s_MIN_CAL_DATE = new String(s.m_s_MIN_CAL_DATE);
         if(s.m_s_MAX_CAL_DATE != null) m_s_MAX_CAL_DATE = new String(s.m_s_MAX_CAL_DATE);
         if(s.m_s_BUSINESS_DATE != null) m_s_BUSINESS_DATE = new String(s.m_s_BUSINESS_DATE);
         if(s.m_EXTERNAL_PLAN_CD != null) m_EXTERNAL_PLAN_CD = new String(s.m_EXTERNAL_PLAN_CD);
         if(s.m_DUE_DATE != null) m_DUE_DATE = new String(s.m_DUE_DATE);
         if(s.m_DM_QTY != null) m_DM_QTY = new String(s.m_DM_QTY);
         if(s.m_ODR_START_DATE != null) m_ODR_START_DATE = new String(s.m_ODR_START_DATE);
         if(s.m_OD_NO != null) m_OD_NO = new String(s.m_OD_NO);
         if(s.m_MODIFY_COUNT != null) m_MODIFY_COUNT = new String(s.m_MODIFY_COUNT);
         if(s.m_w_DATE_FROM != null) m_w_DATE_FROM = new String(s.m_w_DATE_FROM);
         if(s.m_w_TIME_FROM != null) m_w_TIME_FROM = new String(s.m_w_TIME_FROM);
         if(s.m_w_DATE_TO != null) m_w_DATE_TO = new String(s.m_w_DATE_TO);
         if(s.m_w_TIME_TO != null) m_w_TIME_TO = new String(s.m_w_TIME_TO);
         if(s.m_subITEM_CD != null) m_subITEM_CD = new String(s.m_subITEM_CD);
         if(s.m_subITEM_NAME != null) m_subITEM_NAME = new String(s.m_subITEM_NAME);
         if(s.m_subODR_START_DATE != null) m_subODR_START_DATE = new String(s.m_subODR_START_DATE);
         if(s.m_subPRD_START_DATE != null) m_subPRD_START_DATE = new String(s.m_subPRD_START_DATE);
         if(s.m_subPRD_DUE_DATE != null) m_subPRD_DUE_DATE = new String(s.m_subPRD_DUE_DATE);
         if(s.m_subODR_QTY != null) m_subODR_QTY = new String(s.m_subODR_QTY);
         if(s.m_subPS_UNIT_DENOMINATOR != null) m_subPS_UNIT_DENOMINATOR = new String(s.m_subPS_UNIT_DENOMINATOR);
         if(s.m_subPS_UNIT_NUMERATOR != null) m_subPS_UNIT_NUMERATOR = new String(s.m_subPS_UNIT_NUMERATOR);
         if(s.m_subOD_NO != null) m_subOD_NO = new String(s.m_subOD_NO);
         if(s.m_subMODIFY_COUNT != null) m_subMODIFY_COUNT = new String(s.m_subMODIFY_COUNT);
         if(s.m_w_subITEM_CD != null) m_w_subITEM_CD = new String(s.m_w_subITEM_CD);
         if(s.m_w_subDATE_FROM != null) m_w_subDATE_FROM = new String(s.m_w_subDATE_FROM);
         if(s.m_w_subTIME_FROM != null) m_w_subTIME_FROM = new String(s.m_w_subTIME_FROM);
         if(s.m_w_subDATE_TO != null) m_w_subDATE_TO = new String(s.m_w_subDATE_TO);
         if(s.m_w_subTIME_TO != null) m_w_subTIME_TO = new String(s.m_w_subTIME_TO);
         if(s.m_w_subDUE_DATE != null) m_w_subDUE_DATE = new String(s.m_w_subDUE_DATE);
         if(s.m_subDM_QTY != null) m_subDM_QTY = new String(s.m_subDM_QTY);
         if(s.m_PS_EDITION != null) m_PS_EDITION = new String(s.m_PS_EDITION);
         if(s.m_PS_LT_FLG != null) m_PS_LT_FLG = new String(s.m_PS_LT_FLG);
         if(s.m_PS_FIXED_LT != null) m_PS_FIXED_LT = new String(s.m_PS_FIXED_LT);
         if(s.m_PS_PROP_LT != null) m_PS_PROP_LT = new String(s.m_PS_PROP_LT);
         if(s.m_PS_PROP_LOT_SIZE != null) m_PS_PROP_LOT_SIZE = new String(s.m_PS_PROP_LOT_SIZE);
         if(s.m_PS_UNIT_DENOMINATOR != null) m_PS_UNIT_DENOMINATOR = new String(s.m_PS_UNIT_DENOMINATOR);
         if(s.m_PS_UNIT_NUMERATOR != null) m_PS_UNIT_NUMERATOR = new String(s.m_PS_UNIT_NUMERATOR);
         if(s.m_PS_SPOIL != null) m_PS_SPOIL = new String(s.m_PS_SPOIL);
         if(s.m_CONS_TYP != null) m_CONS_TYP = new String(s.m_CONS_TYP);
         if(s.m_EFF_PHASE_IN_DATE != null) m_EFF_PHASE_IN_DATE = new String(s.m_EFF_PHASE_IN_DATE);
         if(s.m_EFF_PHASE_OUT_DATE != null) m_EFF_PHASE_OUT_DATE = new String(s.m_EFF_PHASE_OUT_DATE);
         if(s.m_PS_UNIT_QTY != null) m_PS_UNIT_QTY = new String(s.m_PS_UNIT_QTY);
         if(s.m_w_subDM_QTY != null) m_w_subDM_QTY = new String(s.m_w_subDM_QTY);
         if(s.m_w_subITEM_NAME != null) m_w_subITEM_NAME = new String(s.m_w_subITEM_NAME);
         if(s.m_w_subEXTERNAL_PLAN_CD != null) m_w_subEXTERNAL_PLAN_CD = new String(s.m_w_subEXTERNAL_PLAN_CD);
         if(s.m_w_subPLANT_CD != null) m_w_subPLANT_CD = new String(s.m_w_subPLANT_CD);
         if(s.m_w_subPLANT_NAME != null) m_w_subPLANT_NAME = new String(s.m_w_subPLANT_NAME);
         if(s.m_subSU_DM_QTY != null) m_subSU_DM_QTY = new String(s.m_subSU_DM_QTY);
         if(s.m_subRE_ODR_QTY != null) m_subRE_ODR_QTY = new String(s.m_subRE_ODR_QTY);
         if(s.m_s_PLANT_NAME != null) m_s_PLANT_NAME = new String(s.m_s_PLANT_NAME);
         if(s.m_STOCK_UNIT != null) m_STOCK_UNIT = new String(s.m_STOCK_UNIT);
         //20070517 takahashi↓
         if(s.m_TIME_CTRL != null) m_TIME_CTRL = new String(s.m_TIME_CTRL);
         //20070517 takahashi↑
        }
         
        //------------------------------------------------------------------
        //}}user_implement_code

	//////////////////////////////

}
