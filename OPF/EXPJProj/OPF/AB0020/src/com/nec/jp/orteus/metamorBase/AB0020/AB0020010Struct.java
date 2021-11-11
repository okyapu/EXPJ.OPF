/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AB0020/src/com/nec/jp/orteus/metamorBase/AB0020/AB0020010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AB0020;

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

public class AB0020010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_JOB_ODR_TYP_name */
	public String m_JOB_ODR_TYP_name = null;
	/** 第 2 変数： m_JOB_ODR_TYP_val */
	public String m_JOB_ODR_TYP_val = null;
	/** 第 3 変数： m_PLAN_TYP_name */
	public String m_PLAN_TYP_name = null;
	/** 第 4 変数： m_PLAN_TYP_val */
	public String m_PLAN_TYP_val = null;
	/** 第 5 変数： m_ALCD_ENABLE_QTY */
	public String m_ALCD_ENABLE_QTY = null;
	/** 第 6 変数： m_HAND_STOCK */
	public String m_HAND_STOCK = null;
	/** 第 7 変数： m_h_AUTO_NUM */
	public Integer m_h_AUTO_NUM = null;
	/** 第 8 変数： m_JobOdrExpect */
	public String m_JobOdrExpect = null;
	/** 第 9 変数： m_JOB_ODR_NAME */
	public String m_JOB_ODR_NAME = null;
	/** 第 10 変数： m_PLAN_NAME */
	public String m_PLAN_NAME = null;
	/** 第 11 変数： m_JOB_ODR_STS_NAME */
	public String m_JOB_ODR_STS_NAME = null;
	/** 第 12 変数： m_MRP_ODR_NAME */
	public String m_MRP_ODR_NAME = null;
	/** 第 13 変数： m_OUTSIDE_NAME */
	public String m_OUTSIDE_NAME = null;
	/** 第 14 変数： m_UNIT_QTY_NAME */
	public String m_UNIT_QTY_NAME = null;
	/** 第 15 変数： m_c_AUTO_NUM */
	public String m_c_AUTO_NUM = null;
	/** 第 16 変数： m_c_JOB_ODR_DEL_FLG */
	public String m_c_JOB_ODR_DEL_FLG = null;
	/** 第 17 変数： m_c_JOB_ODR_STS_TYP */
	public String m_c_JOB_ODR_STS_TYP = null;
	/** 第 18 変数： m_c_JOB_ODR_EXP_TYP */
	public String m_c_JOB_ODR_EXP_TYP = null;
	/** 第 19 変数： m_JOB_ODR_DLV_DATE_TIME */
	public String m_JOB_ODR_DLV_DATE_TIME = null;
	/** 第 20 変数： m_UPDATE_FLG */
	public String m_UPDATE_FLG = null;
	/** 第 21 変数： m_DEL_FLG */
	public String m_DEL_FLG = null;
	/** 第 22 変数： m_STS_FLG */
	public String m_STS_FLG = null;
	/** 第 23 変数： m_EXP_FLG */
	public String m_EXP_FLG = null;
	/** 第 24 変数： m_d_DATE_TO */
	public java.util.Date m_d_DATE_TO = null;
	/** 第 25 変数： m_d_DATE_FROM */
	public java.util.Date m_d_DATE_FROM = null;
	/** 第 26 変数： m_d_JOB_ODR_DLV_DATE */
	public String m_d_JOB_ODR_DLV_DATE = null;
	/** 第 27 変数： m_s_MAX_DISPLAY_MONTH_SERIAL */
	public String m_s_MAX_DISPLAY_MONTH_SERIAL = null;
	/** 第 28 変数： m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** 第 29 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** 第 30 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 31 変数： m_JOB_ODR_TYP */
	public Integer m_JOB_ODR_TYP = null;
	/** 第 32 変数： m_PLAN_TYP */
	public Integer m_PLAN_TYP = null;
	/** 第 33 変数： m_JOB_ODR_DLV_DATE */
	public String m_JOB_ODR_DLV_DATE = null;
	/** 第 34 変数： m_JOB_ODR_QTY */
	public String m_JOB_ODR_QTY = null;
	/** 第 35 変数： m_ALC_GRP_CD */
	public String m_ALC_GRP_CD = null;
	/** 第 36 変数： m_JOB_ODR_STS_TYP */
	public Integer m_JOB_ODR_STS_TYP = null;
	/** 第 37 変数： m_JOB_ODR_EXP_TYP */
	public Integer m_JOB_ODR_EXP_TYP = null;
	/** 第 38 変数： m_JOB_ODR_DEL_FLG */
	public Integer m_JOB_ODR_DEL_FLG = null;
	/** 第 39 変数： m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** 第 40 変数： m_MAX_DLV_DATE */
	public String m_MAX_DLV_DATE = null;
	/** 第 41 変数： m_MIN_DLV_DATE */
	public String m_MIN_DLV_DATE = null;
	/** 第 42 変数： m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** 第 43 変数： m_DRAW_CD */
	public String m_DRAW_CD = null;
	/** 第 44 変数： m_SPEC */
	public String m_SPEC = null;
	/** 第 45 変数： m_MRP_ODR_TYP */
	public Integer m_MRP_ODR_TYP = null;
	/** 第 46 変数： m_OUTSIDE_TYP */
	public Integer m_OUTSIDE_TYP = null;
	/** 第 47 変数： m_ITEM_SPOIL */
	public String m_ITEM_SPOIL = null;
	/** 第 48 変数： m_MUL_ODR_QTY */
	public String m_MUL_ODR_QTY = null;
	/** 第 49 変数： m_UNIT_QTY_TYP */
	public Integer m_UNIT_QTY_TYP = null;
	/** 第 50 変数： m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** 第 51 変数： m_PKG_UNIT */
	public String m_PKG_UNIT = null;
	/** 第 52 変数： m_w_MANHOUR_TYP */
	public Double m_w_MANHOUR_TYP = null;
	/** 第 53 変数： m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** 第 54 変数： m_STOCK_ON_HAND_QTY */
	public String m_STOCK_ON_HAND_QTY = null;
	/** 第 55 変数： m_JOB_ODR_DLV_DATE_ALL */
	public String m_JOB_ODR_DLV_DATE_ALL = null;
	/** 第 56 変数： m_HOLIDAY_FLG */
	public Integer m_HOLIDAY_FLG = null;
	/** 第 57 変数： m_w_DATE_TO */
	public String m_w_DATE_TO = null;
	/** 第 58 変数： m_w_DATE_FROM */
	public String m_w_DATE_FROM = null;
	/** 第 59 変数： m_BUSINESS_OPR_DATE */
	public java.util.Date m_BUSINESS_OPR_DATE = null;
	/** 第 60 変数： m_CAL_NO */
	public Integer m_CAL_NO = null;
	/** 第 61 変数： m_SYS_JOB_ODR_DEL_FLG */
	public String m_SYS_JOB_ODR_DEL_FLG = null;
	/** 第 62 変数： m_TIME_CTRL */
	public String m_TIME_CTRL = null;
	/** 第 63 変数： m_h_PRD_REQ_JOB_ODR_TYP_2 */
	public String m_h_PRD_REQ_JOB_ODR_TYP_2 = null;
	/** 第 64 変数： m_ALCD_QTY */
	public String m_ALCD_QTY = null;
	/** 第 65 変数： m_h_JOB_ODR_CD */
	public String m_h_JOB_ODR_CD = null;
	/** 第 66 変数： m_SYS_INSTALL_OPTIONS */
	public String m_SYS_INSTALL_OPTIONS = null;
	/** 第 67 変数： m_OD_CALC_FLG */
	public String m_OD_CALC_FLG = null;
	/** 第 68 変数： m_OPTION_ID */
	public String m_OPTION_ID = null;
	/** 第 69 変数： m_DM_STS_TYP */
	public String m_DM_STS_TYP = null;
	/** 第 70 変数： m_JOB_ODR_CD_ALC */
	public String m_JOB_ODR_CD_ALC = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_JOB_ODR_TYP_name */
	public List l_JOB_ODR_TYP_name = null;

	/** 第 2 List変数： l_JOB_ODR_TYP_val */
	public List l_JOB_ODR_TYP_val = null;

	/** 第 3 List変数： l_PLAN_TYP_name */
	public List l_PLAN_TYP_name = null;

	/** 第 4 List変数： l_PLAN_TYP_val */
	public List l_PLAN_TYP_val = null;

	/** 第 5 List変数： l_ALCD_ENABLE_QTY */
	public List l_ALCD_ENABLE_QTY = null;

	/** 第 6 List変数： l_HAND_STOCK */
	public List l_HAND_STOCK = null;

	/** 第 7 List変数： l_h_AUTO_NUM */
	public List l_h_AUTO_NUM = null;

	/** 第 8 List変数： l_JobOdrExpect */
	public List l_JobOdrExpect = null;

	/** 第 9 List変数： l_JOB_ODR_NAME */
	public List l_JOB_ODR_NAME = null;

	/** 第 10 List変数： l_PLAN_NAME */
	public List l_PLAN_NAME = null;

	/** 第 11 List変数： l_JOB_ODR_STS_NAME */
	public List l_JOB_ODR_STS_NAME = null;

	/** 第 12 List変数： l_MRP_ODR_NAME */
	public List l_MRP_ODR_NAME = null;

	/** 第 13 List変数： l_OUTSIDE_NAME */
	public List l_OUTSIDE_NAME = null;

	/** 第 14 List変数： l_UNIT_QTY_NAME */
	public List l_UNIT_QTY_NAME = null;

	/** 第 15 List変数： l_c_AUTO_NUM */
	public List l_c_AUTO_NUM = null;

	/** 第 16 List変数： l_c_JOB_ODR_DEL_FLG */
	public List l_c_JOB_ODR_DEL_FLG = null;

	/** 第 17 List変数： l_c_JOB_ODR_STS_TYP */
	public List l_c_JOB_ODR_STS_TYP = null;

	/** 第 18 List変数： l_c_JOB_ODR_EXP_TYP */
	public List l_c_JOB_ODR_EXP_TYP = null;

	/** 第 19 List変数： l_JOB_ODR_DLV_DATE_TIME */
	public List l_JOB_ODR_DLV_DATE_TIME = null;

	/** 第 20 List変数： l_UPDATE_FLG */
	public List l_UPDATE_FLG = null;

	/** 第 21 List変数： l_DEL_FLG */
	public List l_DEL_FLG = null;

	/** 第 22 List変数： l_STS_FLG */
	public List l_STS_FLG = null;

	/** 第 23 List変数： l_EXP_FLG */
	public List l_EXP_FLG = null;

	/** 第 24 List変数： l_d_DATE_TO */
	public List l_d_DATE_TO = null;

	/** 第 25 List変数： l_d_DATE_FROM */
	public List l_d_DATE_FROM = null;

	/** 第 26 List変数： l_d_JOB_ODR_DLV_DATE */
	public List l_d_JOB_ODR_DLV_DATE = null;

	/** 第 27 List変数： l_s_MAX_DISPLAY_MONTH_SERIAL */
	public List l_s_MAX_DISPLAY_MONTH_SERIAL = null;

	/** 第 28 List変数： l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** 第 29 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** 第 30 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 31 List変数： l_JOB_ODR_TYP */
	public List l_JOB_ODR_TYP = null;

	/** 第 32 List変数： l_PLAN_TYP */
	public List l_PLAN_TYP = null;

	/** 第 33 List変数： l_JOB_ODR_DLV_DATE */
	public List l_JOB_ODR_DLV_DATE = null;

	/** 第 34 List変数： l_JOB_ODR_QTY */
	public List l_JOB_ODR_QTY = null;

	/** 第 35 List変数： l_ALC_GRP_CD */
	public List l_ALC_GRP_CD = null;

	/** 第 36 List変数： l_JOB_ODR_STS_TYP */
	public List l_JOB_ODR_STS_TYP = null;

	/** 第 37 List変数： l_JOB_ODR_EXP_TYP */
	public List l_JOB_ODR_EXP_TYP = null;

	/** 第 38 List変数： l_JOB_ODR_DEL_FLG */
	public List l_JOB_ODR_DEL_FLG = null;

	/** 第 39 List変数： l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** 第 40 List変数： l_MAX_DLV_DATE */
	public List l_MAX_DLV_DATE = null;

	/** 第 41 List変数： l_MIN_DLV_DATE */
	public List l_MIN_DLV_DATE = null;

	/** 第 42 List変数： l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** 第 43 List変数： l_DRAW_CD */
	public List l_DRAW_CD = null;

	/** 第 44 List変数： l_SPEC */
	public List l_SPEC = null;

	/** 第 45 List変数： l_MRP_ODR_TYP */
	public List l_MRP_ODR_TYP = null;

	/** 第 46 List変数： l_OUTSIDE_TYP */
	public List l_OUTSIDE_TYP = null;

	/** 第 47 List変数： l_ITEM_SPOIL */
	public List l_ITEM_SPOIL = null;

	/** 第 48 List変数： l_MUL_ODR_QTY */
	public List l_MUL_ODR_QTY = null;

	/** 第 49 List変数： l_UNIT_QTY_TYP */
	public List l_UNIT_QTY_TYP = null;

	/** 第 50 List変数： l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** 第 51 List変数： l_PKG_UNIT */
	public List l_PKG_UNIT = null;

	/** 第 52 List変数： l_w_MANHOUR_TYP */
	public List l_w_MANHOUR_TYP = null;

	/** 第 53 List変数： l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** 第 54 List変数： l_STOCK_ON_HAND_QTY */
	public List l_STOCK_ON_HAND_QTY = null;

	/** 第 55 List変数： l_JOB_ODR_DLV_DATE_ALL */
	public List l_JOB_ODR_DLV_DATE_ALL = null;

	/** 第 56 List変数： l_HOLIDAY_FLG */
	public List l_HOLIDAY_FLG = null;

	/** 第 57 List変数： l_w_DATE_TO */
	public List l_w_DATE_TO = null;

	/** 第 58 List変数： l_w_DATE_FROM */
	public List l_w_DATE_FROM = null;

	/** 第 59 List変数： l_BUSINESS_OPR_DATE */
	public List l_BUSINESS_OPR_DATE = null;

	/** 第 60 List変数： l_CAL_NO */
	public List l_CAL_NO = null;

	/** 第 61 List変数： l_SYS_JOB_ODR_DEL_FLG */
	public List l_SYS_JOB_ODR_DEL_FLG = null;

	/** 第 62 List変数： l_TIME_CTRL */
	public List l_TIME_CTRL = null;

	/** 第 63 List変数： l_h_PRD_REQ_JOB_ODR_TYP_2 */
	public List l_h_PRD_REQ_JOB_ODR_TYP_2 = null;

	/** 第 64 List変数： l_ALCD_QTY */
	public List l_ALCD_QTY = null;

	/** 第 65 List変数： l_h_JOB_ODR_CD */
	public List l_h_JOB_ODR_CD = null;

	/** 第 66 List変数： l_SYS_INSTALL_OPTIONS */
	public List l_SYS_INSTALL_OPTIONS = null;

	/** 第 67 List変数： l_OD_CALC_FLG */
	public List l_OD_CALC_FLG = null;

	/** 第 68 List変数： l_OPTION_ID */
	public List l_OPTION_ID = null;

	/** 第 69 List変数： l_DM_STS_TYP */
	public List l_DM_STS_TYP = null;

	/** 第 70 List変数： l_JOB_ODR_CD_ALC */
	public List l_JOB_ODR_CD_ALC = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getJOB_ODR_TYP_name() { return m_JOB_ODR_TYP_name; }
	public String getJOB_ODR_TYP_val() { return m_JOB_ODR_TYP_val; }
	public String getPLAN_TYP_name() { return m_PLAN_TYP_name; }
	public String getPLAN_TYP_val() { return m_PLAN_TYP_val; }
	public String getALCD_ENABLE_QTY() { return m_ALCD_ENABLE_QTY; }
	public String getHAND_STOCK() { return m_HAND_STOCK; }
	public Integer geth_AUTO_NUM() { return m_h_AUTO_NUM; }
	public String getJobOdrExpect() { return m_JobOdrExpect; }
	public String getJOB_ODR_NAME() { return m_JOB_ODR_NAME; }
	public String getPLAN_NAME() { return m_PLAN_NAME; }
	public String getJOB_ODR_STS_NAME() { return m_JOB_ODR_STS_NAME; }
	public String getMRP_ODR_NAME() { return m_MRP_ODR_NAME; }
	public String getOUTSIDE_NAME() { return m_OUTSIDE_NAME; }
	public String getUNIT_QTY_NAME() { return m_UNIT_QTY_NAME; }
	public String getc_AUTO_NUM() { return m_c_AUTO_NUM; }
	public String getc_JOB_ODR_DEL_FLG() { return m_c_JOB_ODR_DEL_FLG; }
	public String getc_JOB_ODR_STS_TYP() { return m_c_JOB_ODR_STS_TYP; }
	public String getc_JOB_ODR_EXP_TYP() { return m_c_JOB_ODR_EXP_TYP; }
	public String getJOB_ODR_DLV_DATE_TIME() { return m_JOB_ODR_DLV_DATE_TIME; }
	public String getUPDATE_FLG() { return m_UPDATE_FLG; }
	public String getDEL_FLG() { return m_DEL_FLG; }
	public String getSTS_FLG() { return m_STS_FLG; }
	public String getEXP_FLG() { return m_EXP_FLG; }
	public java.util.Date getd_DATE_TO() { return m_d_DATE_TO; }
	public java.util.Date getd_DATE_FROM() { return m_d_DATE_FROM; }
	public String getd_JOB_ODR_DLV_DATE() { return m_d_JOB_ODR_DLV_DATE; }
	public String gets_MAX_DISPLAY_MONTH_SERIAL() { return m_s_MAX_DISPLAY_MONTH_SERIAL; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public Integer getJOB_ODR_TYP() { return m_JOB_ODR_TYP; }
	public Integer getPLAN_TYP() { return m_PLAN_TYP; }
	public String getJOB_ODR_DLV_DATE() { return m_JOB_ODR_DLV_DATE; }
	public String getJOB_ODR_QTY() { return m_JOB_ODR_QTY; }
	public String getALC_GRP_CD() { return m_ALC_GRP_CD; }
	public Integer getJOB_ODR_STS_TYP() { return m_JOB_ODR_STS_TYP; }
	public Integer getJOB_ODR_EXP_TYP() { return m_JOB_ODR_EXP_TYP; }
	public Integer getJOB_ODR_DEL_FLG() { return m_JOB_ODR_DEL_FLG; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getMAX_DLV_DATE() { return m_MAX_DLV_DATE; }
	public String getMIN_DLV_DATE() { return m_MIN_DLV_DATE; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getDRAW_CD() { return m_DRAW_CD; }
	public String getSPEC() { return m_SPEC; }
	public Integer getMRP_ODR_TYP() { return m_MRP_ODR_TYP; }
	public Integer getOUTSIDE_TYP() { return m_OUTSIDE_TYP; }
	public String getITEM_SPOIL() { return m_ITEM_SPOIL; }
	public String getMUL_ODR_QTY() { return m_MUL_ODR_QTY; }
	public Integer getUNIT_QTY_TYP() { return m_UNIT_QTY_TYP; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getPKG_UNIT() { return m_PKG_UNIT; }
	public Double getw_MANHOUR_TYP() { return m_w_MANHOUR_TYP; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getSTOCK_ON_HAND_QTY() { return m_STOCK_ON_HAND_QTY; }
	public String getJOB_ODR_DLV_DATE_ALL() { return m_JOB_ODR_DLV_DATE_ALL; }
	public Integer getHOLIDAY_FLG() { return m_HOLIDAY_FLG; }
	public String getw_DATE_TO() { return m_w_DATE_TO; }
	public String getw_DATE_FROM() { return m_w_DATE_FROM; }
	public java.util.Date getBUSINESS_OPR_DATE() { return m_BUSINESS_OPR_DATE; }
	public Integer getCAL_NO() { return m_CAL_NO; }
	public String getSYS_JOB_ODR_DEL_FLG() { return m_SYS_JOB_ODR_DEL_FLG; }
	public String getTIME_CTRL() { return m_TIME_CTRL; }
	public String geth_PRD_REQ_JOB_ODR_TYP_2() { return m_h_PRD_REQ_JOB_ODR_TYP_2; }
	public String getALCD_QTY() { return m_ALCD_QTY; }
	public String geth_JOB_ODR_CD() { return m_h_JOB_ODR_CD; }
	public String getSYS_INSTALL_OPTIONS() { return m_SYS_INSTALL_OPTIONS; }
	public String getOD_CALC_FLG() { return m_OD_CALC_FLG; }
	public String getOPTION_ID() { return m_OPTION_ID; }
	public String getDM_STS_TYP() { return m_DM_STS_TYP; }
	public String getJOB_ODR_CD_ALC() { return m_JOB_ODR_CD_ALC; }

	public List getList_JOB_ODR_TYP_name() { return l_JOB_ODR_TYP_name; }
	public List getList_JOB_ODR_TYP_val() { return l_JOB_ODR_TYP_val; }
	public List getList_PLAN_TYP_name() { return l_PLAN_TYP_name; }
	public List getList_PLAN_TYP_val() { return l_PLAN_TYP_val; }
	public List getList_ALCD_ENABLE_QTY() { return l_ALCD_ENABLE_QTY; }
	public List getList_HAND_STOCK() { return l_HAND_STOCK; }
	public List getList_h_AUTO_NUM() { return l_h_AUTO_NUM; }
	public List getList_JobOdrExpect() { return l_JobOdrExpect; }
	public List getList_JOB_ODR_NAME() { return l_JOB_ODR_NAME; }
	public List getList_PLAN_NAME() { return l_PLAN_NAME; }
	public List getList_JOB_ODR_STS_NAME() { return l_JOB_ODR_STS_NAME; }
	public List getList_MRP_ODR_NAME() { return l_MRP_ODR_NAME; }
	public List getList_OUTSIDE_NAME() { return l_OUTSIDE_NAME; }
	public List getList_UNIT_QTY_NAME() { return l_UNIT_QTY_NAME; }
	public List getList_c_AUTO_NUM() { return l_c_AUTO_NUM; }
	public List getList_c_JOB_ODR_DEL_FLG() { return l_c_JOB_ODR_DEL_FLG; }
	public List getList_c_JOB_ODR_STS_TYP() { return l_c_JOB_ODR_STS_TYP; }
	public List getList_c_JOB_ODR_EXP_TYP() { return l_c_JOB_ODR_EXP_TYP; }
	public List getList_JOB_ODR_DLV_DATE_TIME() { return l_JOB_ODR_DLV_DATE_TIME; }
	public List getList_UPDATE_FLG() { return l_UPDATE_FLG; }
	public List getList_DEL_FLG() { return l_DEL_FLG; }
	public List getList_STS_FLG() { return l_STS_FLG; }
	public List getList_EXP_FLG() { return l_EXP_FLG; }
	public List getList_d_DATE_TO() { return l_d_DATE_TO; }
	public List getList_d_DATE_FROM() { return l_d_DATE_FROM; }
	public List getList_d_JOB_ODR_DLV_DATE() { return l_d_JOB_ODR_DLV_DATE; }
	public List getList_s_MAX_DISPLAY_MONTH_SERIAL() { return l_s_MAX_DISPLAY_MONTH_SERIAL; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_JOB_ODR_TYP() { return l_JOB_ODR_TYP; }
	public List getList_PLAN_TYP() { return l_PLAN_TYP; }
	public List getList_JOB_ODR_DLV_DATE() { return l_JOB_ODR_DLV_DATE; }
	public List getList_JOB_ODR_QTY() { return l_JOB_ODR_QTY; }
	public List getList_ALC_GRP_CD() { return l_ALC_GRP_CD; }
	public List getList_JOB_ODR_STS_TYP() { return l_JOB_ODR_STS_TYP; }
	public List getList_JOB_ODR_EXP_TYP() { return l_JOB_ODR_EXP_TYP; }
	public List getList_JOB_ODR_DEL_FLG() { return l_JOB_ODR_DEL_FLG; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_MAX_DLV_DATE() { return l_MAX_DLV_DATE; }
	public List getList_MIN_DLV_DATE() { return l_MIN_DLV_DATE; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_DRAW_CD() { return l_DRAW_CD; }
	public List getList_SPEC() { return l_SPEC; }
	public List getList_MRP_ODR_TYP() { return l_MRP_ODR_TYP; }
	public List getList_OUTSIDE_TYP() { return l_OUTSIDE_TYP; }
	public List getList_ITEM_SPOIL() { return l_ITEM_SPOIL; }
	public List getList_MUL_ODR_QTY() { return l_MUL_ODR_QTY; }
	public List getList_UNIT_QTY_TYP() { return l_UNIT_QTY_TYP; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_PKG_UNIT() { return l_PKG_UNIT; }
	public List getList_w_MANHOUR_TYP() { return l_w_MANHOUR_TYP; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_STOCK_ON_HAND_QTY() { return l_STOCK_ON_HAND_QTY; }
	public List getList_JOB_ODR_DLV_DATE_ALL() { return l_JOB_ODR_DLV_DATE_ALL; }
	public List getList_HOLIDAY_FLG() { return l_HOLIDAY_FLG; }
	public List getList_w_DATE_TO() { return l_w_DATE_TO; }
	public List getList_w_DATE_FROM() { return l_w_DATE_FROM; }
	public List getList_BUSINESS_OPR_DATE() { return l_BUSINESS_OPR_DATE; }
	public List getList_CAL_NO() { return l_CAL_NO; }
	public List getList_SYS_JOB_ODR_DEL_FLG() { return l_SYS_JOB_ODR_DEL_FLG; }
	public List getList_TIME_CTRL() { return l_TIME_CTRL; }
	public List getList_h_PRD_REQ_JOB_ODR_TYP_2() { return l_h_PRD_REQ_JOB_ODR_TYP_2; }
	public List getList_ALCD_QTY() { return l_ALCD_QTY; }
	public List getList_h_JOB_ODR_CD() { return l_h_JOB_ODR_CD; }
	public List getList_SYS_INSTALL_OPTIONS() { return l_SYS_INSTALL_OPTIONS; }
	public List getList_OD_CALC_FLG() { return l_OD_CALC_FLG; }
	public List getList_OPTION_ID() { return l_OPTION_ID; }
	public List getList_DM_STS_TYP() { return l_DM_STS_TYP; }
	public List getList_JOB_ODR_CD_ALC() { return l_JOB_ODR_CD_ALC; }

	public void setJOB_ODR_TYP_name(String val) { m_JOB_ODR_TYP_name = val; }
	public void setJOB_ODR_TYP_val(String val) { m_JOB_ODR_TYP_val = val; }
	public void setPLAN_TYP_name(String val) { m_PLAN_TYP_name = val; }
	public void setPLAN_TYP_val(String val) { m_PLAN_TYP_val = val; }
	public void setALCD_ENABLE_QTY(String val) { m_ALCD_ENABLE_QTY = val; }
	public void setHAND_STOCK(String val) { m_HAND_STOCK = val; }
	public void seth_AUTO_NUM(Integer val) { m_h_AUTO_NUM = val; }
	public void setJobOdrExpect(String val) { m_JobOdrExpect = val; }
	public void setJOB_ODR_NAME(String val) { m_JOB_ODR_NAME = val; }
	public void setPLAN_NAME(String val) { m_PLAN_NAME = val; }
	public void setJOB_ODR_STS_NAME(String val) { m_JOB_ODR_STS_NAME = val; }
	public void setMRP_ODR_NAME(String val) { m_MRP_ODR_NAME = val; }
	public void setOUTSIDE_NAME(String val) { m_OUTSIDE_NAME = val; }
	public void setUNIT_QTY_NAME(String val) { m_UNIT_QTY_NAME = val; }
	public void setc_AUTO_NUM(String val) { m_c_AUTO_NUM = val; }
	public void setc_JOB_ODR_DEL_FLG(String val) { m_c_JOB_ODR_DEL_FLG = val; }
	public void setc_JOB_ODR_STS_TYP(String val) { m_c_JOB_ODR_STS_TYP = val; }
	public void setc_JOB_ODR_EXP_TYP(String val) { m_c_JOB_ODR_EXP_TYP = val; }
	public void setJOB_ODR_DLV_DATE_TIME(String val) { m_JOB_ODR_DLV_DATE_TIME = val; }
	public void setUPDATE_FLG(String val) { m_UPDATE_FLG = val; }
	public void setDEL_FLG(String val) { m_DEL_FLG = val; }
	public void setSTS_FLG(String val) { m_STS_FLG = val; }
	public void setEXP_FLG(String val) { m_EXP_FLG = val; }
	public void setd_DATE_TO(java.util.Date val) { m_d_DATE_TO = val; }
	public void setd_DATE_FROM(java.util.Date val) { m_d_DATE_FROM = val; }
	public void setd_JOB_ODR_DLV_DATE(String val) { m_d_JOB_ODR_DLV_DATE = val; }
	public void sets_MAX_DISPLAY_MONTH_SERIAL(String val) { m_s_MAX_DISPLAY_MONTH_SERIAL = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setJOB_ODR_TYP(Integer val) { m_JOB_ODR_TYP = val; }
	public void setPLAN_TYP(Integer val) { m_PLAN_TYP = val; }
	public void setJOB_ODR_DLV_DATE(String val) { m_JOB_ODR_DLV_DATE = val; }
	public void setJOB_ODR_QTY(String val) { m_JOB_ODR_QTY = val; }
	public void setALC_GRP_CD(String val) { m_ALC_GRP_CD = val; }
	public void setJOB_ODR_STS_TYP(Integer val) { m_JOB_ODR_STS_TYP = val; }
	public void setJOB_ODR_EXP_TYP(Integer val) { m_JOB_ODR_EXP_TYP = val; }
	public void setJOB_ODR_DEL_FLG(Integer val) { m_JOB_ODR_DEL_FLG = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setMAX_DLV_DATE(String val) { m_MAX_DLV_DATE = val; }
	public void setMIN_DLV_DATE(String val) { m_MIN_DLV_DATE = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setDRAW_CD(String val) { m_DRAW_CD = val; }
	public void setSPEC(String val) { m_SPEC = val; }
	public void setMRP_ODR_TYP(Integer val) { m_MRP_ODR_TYP = val; }
	public void setOUTSIDE_TYP(Integer val) { m_OUTSIDE_TYP = val; }
	public void setITEM_SPOIL(String val) { m_ITEM_SPOIL = val; }
	public void setMUL_ODR_QTY(String val) { m_MUL_ODR_QTY = val; }
	public void setUNIT_QTY_TYP(Integer val) { m_UNIT_QTY_TYP = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setPKG_UNIT(String val) { m_PKG_UNIT = val; }
	public void setw_MANHOUR_TYP(Double val) { m_w_MANHOUR_TYP = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setSTOCK_ON_HAND_QTY(String val) { m_STOCK_ON_HAND_QTY = val; }
	public void setJOB_ODR_DLV_DATE_ALL(String val) { m_JOB_ODR_DLV_DATE_ALL = val; }
	public void setHOLIDAY_FLG(Integer val) { m_HOLIDAY_FLG = val; }
	public void setw_DATE_TO(String val) { m_w_DATE_TO = val; }
	public void setw_DATE_FROM(String val) { m_w_DATE_FROM = val; }
	public void setBUSINESS_OPR_DATE(java.util.Date val) { m_BUSINESS_OPR_DATE = val; }
	public void setCAL_NO(Integer val) { m_CAL_NO = val; }
	public void setSYS_JOB_ODR_DEL_FLG(String val) { m_SYS_JOB_ODR_DEL_FLG = val; }
	public void setTIME_CTRL(String val) { m_TIME_CTRL = val; }
	public void seth_PRD_REQ_JOB_ODR_TYP_2(String val) { m_h_PRD_REQ_JOB_ODR_TYP_2 = val; }
	public void setALCD_QTY(String val) { m_ALCD_QTY = val; }
	public void seth_JOB_ODR_CD(String val) { m_h_JOB_ODR_CD = val; }
	public void setSYS_INSTALL_OPTIONS(String val) { m_SYS_INSTALL_OPTIONS = val; }
	public void setOD_CALC_FLG(String val) { m_OD_CALC_FLG = val; }
	public void setOPTION_ID(String val) { m_OPTION_ID = val; }
	public void setDM_STS_TYP(String val) { m_DM_STS_TYP = val; }
	public void setJOB_ODR_CD_ALC(String val) { m_JOB_ODR_CD_ALC = val; }

	public void seth_AUTO_NUM(String val) { m_h_AUTO_NUM = getInteger(val); }
	public void setd_DATE_TO(String val) { m_d_DATE_TO = getDate(val); }
	public void setd_DATE_FROM(String val) { m_d_DATE_FROM = getDate(val); }
	public void setJOB_ODR_TYP(String val) { m_JOB_ODR_TYP = getInteger(val); }
	public void setPLAN_TYP(String val) { m_PLAN_TYP = getInteger(val); }
	public void setJOB_ODR_STS_TYP(String val) { m_JOB_ODR_STS_TYP = getInteger(val); }
	public void setJOB_ODR_EXP_TYP(String val) { m_JOB_ODR_EXP_TYP = getInteger(val); }
	public void setJOB_ODR_DEL_FLG(String val) { m_JOB_ODR_DEL_FLG = getInteger(val); }
	public void setMRP_ODR_TYP(String val) { m_MRP_ODR_TYP = getInteger(val); }
	public void setOUTSIDE_TYP(String val) { m_OUTSIDE_TYP = getInteger(val); }
	public void setUNIT_QTY_TYP(String val) { m_UNIT_QTY_TYP = getInteger(val); }
	public void setHOLIDAY_FLG(String val) { m_HOLIDAY_FLG = getInteger(val); }
	public void setBUSINESS_OPR_DATE(String val) { m_BUSINESS_OPR_DATE = getDate(val); }
	public void setCAL_NO(String val) { m_CAL_NO = getInteger(val); }

	public void setList_JOB_ODR_TYP_name(List list) { l_JOB_ODR_TYP_name = list; }
	public void setList_JOB_ODR_TYP_val(List list) { l_JOB_ODR_TYP_val = list; }
	public void setList_PLAN_TYP_name(List list) { l_PLAN_TYP_name = list; }
	public void setList_PLAN_TYP_val(List list) { l_PLAN_TYP_val = list; }
	public void setList_ALCD_ENABLE_QTY(List list) { l_ALCD_ENABLE_QTY = list; }
	public void setList_HAND_STOCK(List list) { l_HAND_STOCK = list; }
	public void setList_h_AUTO_NUM(List list) { l_h_AUTO_NUM = list; }
	public void setList_JobOdrExpect(List list) { l_JobOdrExpect = list; }
	public void setList_JOB_ODR_NAME(List list) { l_JOB_ODR_NAME = list; }
	public void setList_PLAN_NAME(List list) { l_PLAN_NAME = list; }
	public void setList_JOB_ODR_STS_NAME(List list) { l_JOB_ODR_STS_NAME = list; }
	public void setList_MRP_ODR_NAME(List list) { l_MRP_ODR_NAME = list; }
	public void setList_OUTSIDE_NAME(List list) { l_OUTSIDE_NAME = list; }
	public void setList_UNIT_QTY_NAME(List list) { l_UNIT_QTY_NAME = list; }
	public void setList_c_AUTO_NUM(List list) { l_c_AUTO_NUM = list; }
	public void setList_c_JOB_ODR_DEL_FLG(List list) { l_c_JOB_ODR_DEL_FLG = list; }
	public void setList_c_JOB_ODR_STS_TYP(List list) { l_c_JOB_ODR_STS_TYP = list; }
	public void setList_c_JOB_ODR_EXP_TYP(List list) { l_c_JOB_ODR_EXP_TYP = list; }
	public void setList_JOB_ODR_DLV_DATE_TIME(List list) { l_JOB_ODR_DLV_DATE_TIME = list; }
	public void setList_UPDATE_FLG(List list) { l_UPDATE_FLG = list; }
	public void setList_DEL_FLG(List list) { l_DEL_FLG = list; }
	public void setList_STS_FLG(List list) { l_STS_FLG = list; }
	public void setList_EXP_FLG(List list) { l_EXP_FLG = list; }
	public void setList_d_DATE_TO(List list) { l_d_DATE_TO = list; }
	public void setList_d_DATE_FROM(List list) { l_d_DATE_FROM = list; }
	public void setList_d_JOB_ODR_DLV_DATE(List list) { l_d_JOB_ODR_DLV_DATE = list; }
	public void setList_s_MAX_DISPLAY_MONTH_SERIAL(List list) { l_s_MAX_DISPLAY_MONTH_SERIAL = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_JOB_ODR_TYP(List list) { l_JOB_ODR_TYP = list; }
	public void setList_PLAN_TYP(List list) { l_PLAN_TYP = list; }
	public void setList_JOB_ODR_DLV_DATE(List list) { l_JOB_ODR_DLV_DATE = list; }
	public void setList_JOB_ODR_QTY(List list) { l_JOB_ODR_QTY = list; }
	public void setList_ALC_GRP_CD(List list) { l_ALC_GRP_CD = list; }
	public void setList_JOB_ODR_STS_TYP(List list) { l_JOB_ODR_STS_TYP = list; }
	public void setList_JOB_ODR_EXP_TYP(List list) { l_JOB_ODR_EXP_TYP = list; }
	public void setList_JOB_ODR_DEL_FLG(List list) { l_JOB_ODR_DEL_FLG = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_MAX_DLV_DATE(List list) { l_MAX_DLV_DATE = list; }
	public void setList_MIN_DLV_DATE(List list) { l_MIN_DLV_DATE = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_DRAW_CD(List list) { l_DRAW_CD = list; }
	public void setList_SPEC(List list) { l_SPEC = list; }
	public void setList_MRP_ODR_TYP(List list) { l_MRP_ODR_TYP = list; }
	public void setList_OUTSIDE_TYP(List list) { l_OUTSIDE_TYP = list; }
	public void setList_ITEM_SPOIL(List list) { l_ITEM_SPOIL = list; }
	public void setList_MUL_ODR_QTY(List list) { l_MUL_ODR_QTY = list; }
	public void setList_UNIT_QTY_TYP(List list) { l_UNIT_QTY_TYP = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_PKG_UNIT(List list) { l_PKG_UNIT = list; }
	public void setList_w_MANHOUR_TYP(List list) { l_w_MANHOUR_TYP = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_STOCK_ON_HAND_QTY(List list) { l_STOCK_ON_HAND_QTY = list; }
	public void setList_JOB_ODR_DLV_DATE_ALL(List list) { l_JOB_ODR_DLV_DATE_ALL = list; }
	public void setList_HOLIDAY_FLG(List list) { l_HOLIDAY_FLG = list; }
	public void setList_w_DATE_TO(List list) { l_w_DATE_TO = list; }
	public void setList_w_DATE_FROM(List list) { l_w_DATE_FROM = list; }
	public void setList_BUSINESS_OPR_DATE(List list) { l_BUSINESS_OPR_DATE = list; }
	public void setList_CAL_NO(List list) { l_CAL_NO = list; }
	public void setList_SYS_JOB_ODR_DEL_FLG(List list) { l_SYS_JOB_ODR_DEL_FLG = list; }
	public void setList_TIME_CTRL(List list) { l_TIME_CTRL = list; }
	public void setList_h_PRD_REQ_JOB_ODR_TYP_2(List list) { l_h_PRD_REQ_JOB_ODR_TYP_2 = list; }
	public void setList_ALCD_QTY(List list) { l_ALCD_QTY = list; }
	public void setList_h_JOB_ODR_CD(List list) { l_h_JOB_ODR_CD = list; }
	public void setList_SYS_INSTALL_OPTIONS(List list) { l_SYS_INSTALL_OPTIONS = list; }
	public void setList_OD_CALC_FLG(List list) { l_OD_CALC_FLG = list; }
	public void setList_OPTION_ID(List list) { l_OPTION_ID = list; }
	public void setList_DM_STS_TYP(List list) { l_DM_STS_TYP = list; }
	public void setList_JOB_ODR_CD_ALC(List list) { l_JOB_ODR_CD_ALC = list; }

	public int setL2L_JOB_ODR_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_TYP_name == null) {
			l_JOB_ODR_TYP_name = new ArrayList();
		} else {
			l_JOB_ODR_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_TYP_name.add(((AB0020010Struct) list.get(i)).getJOB_ODR_TYP_name());
		}
		return size;
	}
	public int setL2L_JOB_ODR_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_TYP_val == null) {
			l_JOB_ODR_TYP_val = new ArrayList();
		} else {
			l_JOB_ODR_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_TYP_val.add(((AB0020010Struct) list.get(i)).getJOB_ODR_TYP_val());
		}
		return size;
	}
	public int setL2L_PLAN_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PLAN_TYP_name == null) {
			l_PLAN_TYP_name = new ArrayList();
		} else {
			l_PLAN_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PLAN_TYP_name.add(((AB0020010Struct) list.get(i)).getPLAN_TYP_name());
		}
		return size;
	}
	public int setL2L_PLAN_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PLAN_TYP_val == null) {
			l_PLAN_TYP_val = new ArrayList();
		} else {
			l_PLAN_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PLAN_TYP_val.add(((AB0020010Struct) list.get(i)).getPLAN_TYP_val());
		}
		return size;
	}
	public int setL2L_ALCD_ENABLE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ALCD_ENABLE_QTY == null) {
			l_ALCD_ENABLE_QTY = new ArrayList();
		} else {
			l_ALCD_ENABLE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ALCD_ENABLE_QTY.add(((AB0020010Struct) list.get(i)).getALCD_ENABLE_QTY());
		}
		return size;
	}
	public int setL2L_HAND_STOCK(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HAND_STOCK == null) {
			l_HAND_STOCK = new ArrayList();
		} else {
			l_HAND_STOCK.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HAND_STOCK.add(((AB0020010Struct) list.get(i)).getHAND_STOCK());
		}
		return size;
	}
	public int setL2L_h_AUTO_NUM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_AUTO_NUM == null) {
			l_h_AUTO_NUM = new ArrayList();
		} else {
			l_h_AUTO_NUM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_AUTO_NUM.add(((AB0020010Struct) list.get(i)).geth_AUTO_NUM());
		}
		return size;
	}
	public int setL2L_JobOdrExpect(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JobOdrExpect == null) {
			l_JobOdrExpect = new ArrayList();
		} else {
			l_JobOdrExpect.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JobOdrExpect.add(((AB0020010Struct) list.get(i)).getJobOdrExpect());
		}
		return size;
	}
	public int setL2L_JOB_ODR_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_NAME == null) {
			l_JOB_ODR_NAME = new ArrayList();
		} else {
			l_JOB_ODR_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_NAME.add(((AB0020010Struct) list.get(i)).getJOB_ODR_NAME());
		}
		return size;
	}
	public int setL2L_PLAN_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PLAN_NAME == null) {
			l_PLAN_NAME = new ArrayList();
		} else {
			l_PLAN_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PLAN_NAME.add(((AB0020010Struct) list.get(i)).getPLAN_NAME());
		}
		return size;
	}
	public int setL2L_JOB_ODR_STS_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_STS_NAME == null) {
			l_JOB_ODR_STS_NAME = new ArrayList();
		} else {
			l_JOB_ODR_STS_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_STS_NAME.add(((AB0020010Struct) list.get(i)).getJOB_ODR_STS_NAME());
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
			l_MRP_ODR_NAME.add(((AB0020010Struct) list.get(i)).getMRP_ODR_NAME());
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
			l_OUTSIDE_NAME.add(((AB0020010Struct) list.get(i)).getOUTSIDE_NAME());
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
			l_UNIT_QTY_NAME.add(((AB0020010Struct) list.get(i)).getUNIT_QTY_NAME());
		}
		return size;
	}
	public int setL2L_c_AUTO_NUM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_AUTO_NUM == null) {
			l_c_AUTO_NUM = new ArrayList();
		} else {
			l_c_AUTO_NUM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_AUTO_NUM.add(((AB0020010Struct) list.get(i)).getc_AUTO_NUM());
		}
		return size;
	}
	public int setL2L_c_JOB_ODR_DEL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_JOB_ODR_DEL_FLG == null) {
			l_c_JOB_ODR_DEL_FLG = new ArrayList();
		} else {
			l_c_JOB_ODR_DEL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_JOB_ODR_DEL_FLG.add(((AB0020010Struct) list.get(i)).getc_JOB_ODR_DEL_FLG());
		}
		return size;
	}
	public int setL2L_c_JOB_ODR_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_JOB_ODR_STS_TYP == null) {
			l_c_JOB_ODR_STS_TYP = new ArrayList();
		} else {
			l_c_JOB_ODR_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_JOB_ODR_STS_TYP.add(((AB0020010Struct) list.get(i)).getc_JOB_ODR_STS_TYP());
		}
		return size;
	}
	public int setL2L_c_JOB_ODR_EXP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_JOB_ODR_EXP_TYP == null) {
			l_c_JOB_ODR_EXP_TYP = new ArrayList();
		} else {
			l_c_JOB_ODR_EXP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_JOB_ODR_EXP_TYP.add(((AB0020010Struct) list.get(i)).getc_JOB_ODR_EXP_TYP());
		}
		return size;
	}
	public int setL2L_JOB_ODR_DLV_DATE_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_DLV_DATE_TIME == null) {
			l_JOB_ODR_DLV_DATE_TIME = new ArrayList();
		} else {
			l_JOB_ODR_DLV_DATE_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_DLV_DATE_TIME.add(((AB0020010Struct) list.get(i)).getJOB_ODR_DLV_DATE_TIME());
		}
		return size;
	}
	public int setL2L_UPDATE_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UPDATE_FLG == null) {
			l_UPDATE_FLG = new ArrayList();
		} else {
			l_UPDATE_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UPDATE_FLG.add(((AB0020010Struct) list.get(i)).getUPDATE_FLG());
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
			l_DEL_FLG.add(((AB0020010Struct) list.get(i)).getDEL_FLG());
		}
		return size;
	}
	public int setL2L_STS_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STS_FLG == null) {
			l_STS_FLG = new ArrayList();
		} else {
			l_STS_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STS_FLG.add(((AB0020010Struct) list.get(i)).getSTS_FLG());
		}
		return size;
	}
	public int setL2L_EXP_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXP_FLG == null) {
			l_EXP_FLG = new ArrayList();
		} else {
			l_EXP_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXP_FLG.add(((AB0020010Struct) list.get(i)).getEXP_FLG());
		}
		return size;
	}
	public int setL2L_d_DATE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_d_DATE_TO == null) {
			l_d_DATE_TO = new ArrayList();
		} else {
			l_d_DATE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_d_DATE_TO.add(((AB0020010Struct) list.get(i)).getd_DATE_TO());
		}
		return size;
	}
	public int setL2L_d_DATE_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_d_DATE_FROM == null) {
			l_d_DATE_FROM = new ArrayList();
		} else {
			l_d_DATE_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_d_DATE_FROM.add(((AB0020010Struct) list.get(i)).getd_DATE_FROM());
		}
		return size;
	}
	public int setL2L_d_JOB_ODR_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_d_JOB_ODR_DLV_DATE == null) {
			l_d_JOB_ODR_DLV_DATE = new ArrayList();
		} else {
			l_d_JOB_ODR_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_d_JOB_ODR_DLV_DATE.add(((AB0020010Struct) list.get(i)).getd_JOB_ODR_DLV_DATE());
		}
		return size;
	}
	public int setL2L_s_MAX_DISPLAY_MONTH_SERIAL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_MAX_DISPLAY_MONTH_SERIAL == null) {
			l_s_MAX_DISPLAY_MONTH_SERIAL = new ArrayList();
		} else {
			l_s_MAX_DISPLAY_MONTH_SERIAL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_MAX_DISPLAY_MONTH_SERIAL.add(((AB0020010Struct) list.get(i)).gets_MAX_DISPLAY_MONTH_SERIAL());
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
			l_JOB_ODR_CD.add(((AB0020010Struct) list.get(i)).getJOB_ODR_CD());
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
			l_PLANT_CD.add(((AB0020010Struct) list.get(i)).getPLANT_CD());
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
			l_ITEM_CD.add(((AB0020010Struct) list.get(i)).getITEM_CD());
		}
		return size;
	}
	public int setL2L_JOB_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_TYP == null) {
			l_JOB_ODR_TYP = new ArrayList();
		} else {
			l_JOB_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_TYP.add(((AB0020010Struct) list.get(i)).getJOB_ODR_TYP());
		}
		return size;
	}
	public int setL2L_PLAN_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PLAN_TYP == null) {
			l_PLAN_TYP = new ArrayList();
		} else {
			l_PLAN_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PLAN_TYP.add(((AB0020010Struct) list.get(i)).getPLAN_TYP());
		}
		return size;
	}
	public int setL2L_JOB_ODR_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_DLV_DATE == null) {
			l_JOB_ODR_DLV_DATE = new ArrayList();
		} else {
			l_JOB_ODR_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_DLV_DATE.add(((AB0020010Struct) list.get(i)).getJOB_ODR_DLV_DATE());
		}
		return size;
	}
	public int setL2L_JOB_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_QTY == null) {
			l_JOB_ODR_QTY = new ArrayList();
		} else {
			l_JOB_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_QTY.add(((AB0020010Struct) list.get(i)).getJOB_ODR_QTY());
		}
		return size;
	}
	public int setL2L_ALC_GRP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ALC_GRP_CD == null) {
			l_ALC_GRP_CD = new ArrayList();
		} else {
			l_ALC_GRP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ALC_GRP_CD.add(((AB0020010Struct) list.get(i)).getALC_GRP_CD());
		}
		return size;
	}
	public int setL2L_JOB_ODR_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_STS_TYP == null) {
			l_JOB_ODR_STS_TYP = new ArrayList();
		} else {
			l_JOB_ODR_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_STS_TYP.add(((AB0020010Struct) list.get(i)).getJOB_ODR_STS_TYP());
		}
		return size;
	}
	public int setL2L_JOB_ODR_EXP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_EXP_TYP == null) {
			l_JOB_ODR_EXP_TYP = new ArrayList();
		} else {
			l_JOB_ODR_EXP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_EXP_TYP.add(((AB0020010Struct) list.get(i)).getJOB_ODR_EXP_TYP());
		}
		return size;
	}
	public int setL2L_JOB_ODR_DEL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_DEL_FLG == null) {
			l_JOB_ODR_DEL_FLG = new ArrayList();
		} else {
			l_JOB_ODR_DEL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_DEL_FLG.add(((AB0020010Struct) list.get(i)).getJOB_ODR_DEL_FLG());
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
			l_MODIFY_COUNT.add(((AB0020010Struct) list.get(i)).getMODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_MAX_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MAX_DLV_DATE == null) {
			l_MAX_DLV_DATE = new ArrayList();
		} else {
			l_MAX_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MAX_DLV_DATE.add(((AB0020010Struct) list.get(i)).getMAX_DLV_DATE());
		}
		return size;
	}
	public int setL2L_MIN_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MIN_DLV_DATE == null) {
			l_MIN_DLV_DATE = new ArrayList();
		} else {
			l_MIN_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MIN_DLV_DATE.add(((AB0020010Struct) list.get(i)).getMIN_DLV_DATE());
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
			l_ITEM_NAME.add(((AB0020010Struct) list.get(i)).getITEM_NAME());
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
			l_DRAW_CD.add(((AB0020010Struct) list.get(i)).getDRAW_CD());
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
			l_SPEC.add(((AB0020010Struct) list.get(i)).getSPEC());
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
			l_MRP_ODR_TYP.add(((AB0020010Struct) list.get(i)).getMRP_ODR_TYP());
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
			l_OUTSIDE_TYP.add(((AB0020010Struct) list.get(i)).getOUTSIDE_TYP());
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
			l_ITEM_SPOIL.add(((AB0020010Struct) list.get(i)).getITEM_SPOIL());
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
			l_MUL_ODR_QTY.add(((AB0020010Struct) list.get(i)).getMUL_ODR_QTY());
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
			l_UNIT_QTY_TYP.add(((AB0020010Struct) list.get(i)).getUNIT_QTY_TYP());
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
			l_STOCK_UNIT.add(((AB0020010Struct) list.get(i)).getSTOCK_UNIT());
		}
		return size;
	}
	public int setL2L_PKG_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PKG_UNIT == null) {
			l_PKG_UNIT = new ArrayList();
		} else {
			l_PKG_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PKG_UNIT.add(((AB0020010Struct) list.get(i)).getPKG_UNIT());
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
			l_w_MANHOUR_TYP.add(((AB0020010Struct) list.get(i)).getw_MANHOUR_TYP());
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
			l_PLANT_NAME.add(((AB0020010Struct) list.get(i)).getPLANT_NAME());
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
			l_STOCK_ON_HAND_QTY.add(((AB0020010Struct) list.get(i)).getSTOCK_ON_HAND_QTY());
		}
		return size;
	}
	public int setL2L_JOB_ODR_DLV_DATE_ALL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_DLV_DATE_ALL == null) {
			l_JOB_ODR_DLV_DATE_ALL = new ArrayList();
		} else {
			l_JOB_ODR_DLV_DATE_ALL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_DLV_DATE_ALL.add(((AB0020010Struct) list.get(i)).getJOB_ODR_DLV_DATE_ALL());
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
			l_HOLIDAY_FLG.add(((AB0020010Struct) list.get(i)).getHOLIDAY_FLG());
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
			l_w_DATE_TO.add(((AB0020010Struct) list.get(i)).getw_DATE_TO());
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
			l_w_DATE_FROM.add(((AB0020010Struct) list.get(i)).getw_DATE_FROM());
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
			l_BUSINESS_OPR_DATE.add(((AB0020010Struct) list.get(i)).getBUSINESS_OPR_DATE());
		}
		return size;
	}
	public int setL2L_CAL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CAL_NO == null) {
			l_CAL_NO = new ArrayList();
		} else {
			l_CAL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CAL_NO.add(((AB0020010Struct) list.get(i)).getCAL_NO());
		}
		return size;
	}
	public int setL2L_SYS_JOB_ODR_DEL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SYS_JOB_ODR_DEL_FLG == null) {
			l_SYS_JOB_ODR_DEL_FLG = new ArrayList();
		} else {
			l_SYS_JOB_ODR_DEL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SYS_JOB_ODR_DEL_FLG.add(((AB0020010Struct) list.get(i)).getSYS_JOB_ODR_DEL_FLG());
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
			l_TIME_CTRL.add(((AB0020010Struct) list.get(i)).getTIME_CTRL());
		}
		return size;
	}
	public int setL2L_h_PRD_REQ_JOB_ODR_TYP_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PRD_REQ_JOB_ODR_TYP_2 == null) {
			l_h_PRD_REQ_JOB_ODR_TYP_2 = new ArrayList();
		} else {
			l_h_PRD_REQ_JOB_ODR_TYP_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PRD_REQ_JOB_ODR_TYP_2.add(((AB0020010Struct) list.get(i)).geth_PRD_REQ_JOB_ODR_TYP_2());
		}
		return size;
	}
	public int setL2L_ALCD_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ALCD_QTY == null) {
			l_ALCD_QTY = new ArrayList();
		} else {
			l_ALCD_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ALCD_QTY.add(((AB0020010Struct) list.get(i)).getALCD_QTY());
		}
		return size;
	}
	public int setL2L_h_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_JOB_ODR_CD == null) {
			l_h_JOB_ODR_CD = new ArrayList();
		} else {
			l_h_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_JOB_ODR_CD.add(((AB0020010Struct) list.get(i)).geth_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_SYS_INSTALL_OPTIONS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SYS_INSTALL_OPTIONS == null) {
			l_SYS_INSTALL_OPTIONS = new ArrayList();
		} else {
			l_SYS_INSTALL_OPTIONS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SYS_INSTALL_OPTIONS.add(((AB0020010Struct) list.get(i)).getSYS_INSTALL_OPTIONS());
		}
		return size;
	}
	public int setL2L_OD_CALC_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OD_CALC_FLG == null) {
			l_OD_CALC_FLG = new ArrayList();
		} else {
			l_OD_CALC_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OD_CALC_FLG.add(((AB0020010Struct) list.get(i)).getOD_CALC_FLG());
		}
		return size;
	}
	public int setL2L_OPTION_ID(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPTION_ID == null) {
			l_OPTION_ID = new ArrayList();
		} else {
			l_OPTION_ID.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPTION_ID.add(((AB0020010Struct) list.get(i)).getOPTION_ID());
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
			l_DM_STS_TYP.add(((AB0020010Struct) list.get(i)).getDM_STS_TYP());
		}
		return size;
	}
	public int setL2L_JOB_ODR_CD_ALC(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_CD_ALC == null) {
			l_JOB_ODR_CD_ALC = new ArrayList();
		} else {
			l_JOB_ODR_CD_ALC.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_CD_ALC.add(((AB0020010Struct) list.get(i)).getJOB_ODR_CD_ALC());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_JOB_ODR_TYP_name = null;
		m_JOB_ODR_TYP_val = null;
		m_PLAN_TYP_name = null;
		m_PLAN_TYP_val = null;
		m_ALCD_ENABLE_QTY = null;
		m_HAND_STOCK = null;
		m_h_AUTO_NUM = null;
		m_JobOdrExpect = null;
		m_JOB_ODR_NAME = null;
		m_PLAN_NAME = null;
		m_JOB_ODR_STS_NAME = null;
		m_MRP_ODR_NAME = null;
		m_OUTSIDE_NAME = null;
		m_UNIT_QTY_NAME = null;
		m_c_AUTO_NUM = null;
		m_c_JOB_ODR_DEL_FLG = null;
		m_c_JOB_ODR_STS_TYP = null;
		m_c_JOB_ODR_EXP_TYP = null;
		m_JOB_ODR_DLV_DATE_TIME = null;
		m_UPDATE_FLG = null;
		m_DEL_FLG = null;
		m_STS_FLG = null;
		m_EXP_FLG = null;
		m_d_DATE_TO = null;
		m_d_DATE_FROM = null;
		m_d_JOB_ODR_DLV_DATE = null;
		m_s_MAX_DISPLAY_MONTH_SERIAL = null;
		m_JOB_ODR_CD = null;
		m_PLANT_CD = null;
		m_ITEM_CD = null;
		m_JOB_ODR_TYP = null;
		m_PLAN_TYP = null;
		m_JOB_ODR_DLV_DATE = null;
		m_JOB_ODR_QTY = null;
		m_ALC_GRP_CD = null;
		m_JOB_ODR_STS_TYP = null;
		m_JOB_ODR_EXP_TYP = null;
		m_JOB_ODR_DEL_FLG = null;
		m_MODIFY_COUNT = null;
		m_MAX_DLV_DATE = null;
		m_MIN_DLV_DATE = null;
		m_ITEM_NAME = null;
		m_DRAW_CD = null;
		m_SPEC = null;
		m_MRP_ODR_TYP = null;
		m_OUTSIDE_TYP = null;
		m_ITEM_SPOIL = null;
		m_MUL_ODR_QTY = null;
		m_UNIT_QTY_TYP = null;
		m_STOCK_UNIT = null;
		m_PKG_UNIT = null;
		m_w_MANHOUR_TYP = null;
		m_PLANT_NAME = null;
		m_STOCK_ON_HAND_QTY = null;
		m_JOB_ODR_DLV_DATE_ALL = null;
		m_HOLIDAY_FLG = null;
		m_w_DATE_TO = null;
		m_w_DATE_FROM = null;
		m_BUSINESS_OPR_DATE = null;
		m_CAL_NO = null;
		m_SYS_JOB_ODR_DEL_FLG = null;
		m_TIME_CTRL = null;
		m_h_PRD_REQ_JOB_ODR_TYP_2 = null;
		m_ALCD_QTY = null;
		m_h_JOB_ODR_CD = null;
		m_SYS_INSTALL_OPTIONS = null;
		m_OD_CALC_FLG = null;
		m_OPTION_ID = null;
		m_DM_STS_TYP = null;
		m_JOB_ODR_CD_ALC = null;

		l_JOB_ODR_TYP_name = null;
		l_JOB_ODR_TYP_val = null;
		l_PLAN_TYP_name = null;
		l_PLAN_TYP_val = null;
		l_ALCD_ENABLE_QTY = null;
		l_HAND_STOCK = null;
		l_h_AUTO_NUM = null;
		l_JobOdrExpect = null;
		l_JOB_ODR_NAME = null;
		l_PLAN_NAME = null;
		l_JOB_ODR_STS_NAME = null;
		l_MRP_ODR_NAME = null;
		l_OUTSIDE_NAME = null;
		l_UNIT_QTY_NAME = null;
		l_c_AUTO_NUM = null;
		l_c_JOB_ODR_DEL_FLG = null;
		l_c_JOB_ODR_STS_TYP = null;
		l_c_JOB_ODR_EXP_TYP = null;
		l_JOB_ODR_DLV_DATE_TIME = null;
		l_UPDATE_FLG = null;
		l_DEL_FLG = null;
		l_STS_FLG = null;
		l_EXP_FLG = null;
		l_d_DATE_TO = null;
		l_d_DATE_FROM = null;
		l_d_JOB_ODR_DLV_DATE = null;
		l_s_MAX_DISPLAY_MONTH_SERIAL = null;
		l_JOB_ODR_CD = null;
		l_PLANT_CD = null;
		l_ITEM_CD = null;
		l_JOB_ODR_TYP = null;
		l_PLAN_TYP = null;
		l_JOB_ODR_DLV_DATE = null;
		l_JOB_ODR_QTY = null;
		l_ALC_GRP_CD = null;
		l_JOB_ODR_STS_TYP = null;
		l_JOB_ODR_EXP_TYP = null;
		l_JOB_ODR_DEL_FLG = null;
		l_MODIFY_COUNT = null;
		l_MAX_DLV_DATE = null;
		l_MIN_DLV_DATE = null;
		l_ITEM_NAME = null;
		l_DRAW_CD = null;
		l_SPEC = null;
		l_MRP_ODR_TYP = null;
		l_OUTSIDE_TYP = null;
		l_ITEM_SPOIL = null;
		l_MUL_ODR_QTY = null;
		l_UNIT_QTY_TYP = null;
		l_STOCK_UNIT = null;
		l_PKG_UNIT = null;
		l_w_MANHOUR_TYP = null;
		l_PLANT_NAME = null;
		l_STOCK_ON_HAND_QTY = null;
		l_JOB_ODR_DLV_DATE_ALL = null;
		l_HOLIDAY_FLG = null;
		l_w_DATE_TO = null;
		l_w_DATE_FROM = null;
		l_BUSINESS_OPR_DATE = null;
		l_CAL_NO = null;
		l_SYS_JOB_ODR_DEL_FLG = null;
		l_TIME_CTRL = null;
		l_h_PRD_REQ_JOB_ODR_TYP_2 = null;
		l_ALCD_QTY = null;
		l_h_JOB_ODR_CD = null;
		l_SYS_INSTALL_OPTIONS = null;
		l_OD_CALC_FLG = null;
		l_OPTION_ID = null;
		l_DM_STS_TYP = null;
		l_JOB_ODR_CD_ALC = null;

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
	 * medAB0020010クラスの標準コンストラクタ
	 */
	public AB0020010Struct()
	{
		//{{user_implement_code_constractor
                //---------------------------------------------------------------------
              
                m_JOB_ODR_TYP = AB0020Common._JOB_ODR_TYP;
                m_PLAN_TYP = AB0020Common._PLAN_TYP;
                m_JOB_ODR_QTY = AB0020Common._JOB_ODR_QTY;
                m_h_AUTO_NUM = AB0020Common._AUTO_NUM;
              
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
	public void setStruct(AB0020010Struct struct)
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
	public void setStructM(AB0020010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setJOB_ODR_TYP_name(struct.getJOB_ODR_TYP_name());
			this.setJOB_ODR_TYP_val(struct.getJOB_ODR_TYP_val());
			this.setPLAN_TYP_name(struct.getPLAN_TYP_name());
			this.setPLAN_TYP_val(struct.getPLAN_TYP_val());
			this.setALCD_ENABLE_QTY(struct.getALCD_ENABLE_QTY());
			this.setHAND_STOCK(struct.getHAND_STOCK());
			this.seth_AUTO_NUM(struct.geth_AUTO_NUM());
			this.setJobOdrExpect(struct.getJobOdrExpect());
			this.setJOB_ODR_NAME(struct.getJOB_ODR_NAME());
			this.setPLAN_NAME(struct.getPLAN_NAME());
			this.setJOB_ODR_STS_NAME(struct.getJOB_ODR_STS_NAME());
			this.setMRP_ODR_NAME(struct.getMRP_ODR_NAME());
			this.setOUTSIDE_NAME(struct.getOUTSIDE_NAME());
			this.setUNIT_QTY_NAME(struct.getUNIT_QTY_NAME());
			this.setc_AUTO_NUM(struct.getc_AUTO_NUM());
			this.setc_JOB_ODR_DEL_FLG(struct.getc_JOB_ODR_DEL_FLG());
			this.setc_JOB_ODR_STS_TYP(struct.getc_JOB_ODR_STS_TYP());
			this.setc_JOB_ODR_EXP_TYP(struct.getc_JOB_ODR_EXP_TYP());
			this.setJOB_ODR_DLV_DATE_TIME(struct.getJOB_ODR_DLV_DATE_TIME());
			this.setUPDATE_FLG(struct.getUPDATE_FLG());
			this.setDEL_FLG(struct.getDEL_FLG());
			this.setSTS_FLG(struct.getSTS_FLG());
			this.setEXP_FLG(struct.getEXP_FLG());
			this.setd_DATE_TO(struct.getd_DATE_TO());
			this.setd_DATE_FROM(struct.getd_DATE_FROM());
			this.setd_JOB_ODR_DLV_DATE(struct.getd_JOB_ODR_DLV_DATE());
			this.sets_MAX_DISPLAY_MONTH_SERIAL(struct.gets_MAX_DISPLAY_MONTH_SERIAL());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setITEM_CD(struct.getITEM_CD());
			this.setJOB_ODR_TYP(struct.getJOB_ODR_TYP());
			this.setPLAN_TYP(struct.getPLAN_TYP());
			this.setJOB_ODR_DLV_DATE(struct.getJOB_ODR_DLV_DATE());
			this.setJOB_ODR_QTY(struct.getJOB_ODR_QTY());
			this.setALC_GRP_CD(struct.getALC_GRP_CD());
			this.setJOB_ODR_STS_TYP(struct.getJOB_ODR_STS_TYP());
			this.setJOB_ODR_EXP_TYP(struct.getJOB_ODR_EXP_TYP());
			this.setJOB_ODR_DEL_FLG(struct.getJOB_ODR_DEL_FLG());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setMAX_DLV_DATE(struct.getMAX_DLV_DATE());
			this.setMIN_DLV_DATE(struct.getMIN_DLV_DATE());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setDRAW_CD(struct.getDRAW_CD());
			this.setSPEC(struct.getSPEC());
			this.setMRP_ODR_TYP(struct.getMRP_ODR_TYP());
			this.setOUTSIDE_TYP(struct.getOUTSIDE_TYP());
			this.setITEM_SPOIL(struct.getITEM_SPOIL());
			this.setMUL_ODR_QTY(struct.getMUL_ODR_QTY());
			this.setUNIT_QTY_TYP(struct.getUNIT_QTY_TYP());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setPKG_UNIT(struct.getPKG_UNIT());
			this.setw_MANHOUR_TYP(struct.getw_MANHOUR_TYP());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.setSTOCK_ON_HAND_QTY(struct.getSTOCK_ON_HAND_QTY());
			this.setJOB_ODR_DLV_DATE_ALL(struct.getJOB_ODR_DLV_DATE_ALL());
			this.setHOLIDAY_FLG(struct.getHOLIDAY_FLG());
			this.setw_DATE_TO(struct.getw_DATE_TO());
			this.setw_DATE_FROM(struct.getw_DATE_FROM());
			this.setBUSINESS_OPR_DATE(struct.getBUSINESS_OPR_DATE());
			this.setCAL_NO(struct.getCAL_NO());
			this.setSYS_JOB_ODR_DEL_FLG(struct.getSYS_JOB_ODR_DEL_FLG());
			this.setTIME_CTRL(struct.getTIME_CTRL());
			this.seth_PRD_REQ_JOB_ODR_TYP_2(struct.geth_PRD_REQ_JOB_ODR_TYP_2());
			this.setALCD_QTY(struct.getALCD_QTY());
			this.seth_JOB_ODR_CD(struct.geth_JOB_ODR_CD());
			this.setSYS_INSTALL_OPTIONS(struct.getSYS_INSTALL_OPTIONS());
			this.setOD_CALC_FLG(struct.getOD_CALC_FLG());
			this.setOPTION_ID(struct.getOPTION_ID());
			this.setDM_STS_TYP(struct.getDM_STS_TYP());
			this.setJOB_ODR_CD_ALC(struct.getJOB_ODR_CD_ALC());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AB0020010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_JOB_ODR_TYP_name(struct.getList_JOB_ODR_TYP_name());
			this.setList_JOB_ODR_TYP_val(struct.getList_JOB_ODR_TYP_val());
			this.setList_PLAN_TYP_name(struct.getList_PLAN_TYP_name());
			this.setList_PLAN_TYP_val(struct.getList_PLAN_TYP_val());
			this.setList_ALCD_ENABLE_QTY(struct.getList_ALCD_ENABLE_QTY());
			this.setList_HAND_STOCK(struct.getList_HAND_STOCK());
			this.setList_h_AUTO_NUM(struct.getList_h_AUTO_NUM());
			this.setList_JobOdrExpect(struct.getList_JobOdrExpect());
			this.setList_JOB_ODR_NAME(struct.getList_JOB_ODR_NAME());
			this.setList_PLAN_NAME(struct.getList_PLAN_NAME());
			this.setList_JOB_ODR_STS_NAME(struct.getList_JOB_ODR_STS_NAME());
			this.setList_MRP_ODR_NAME(struct.getList_MRP_ODR_NAME());
			this.setList_OUTSIDE_NAME(struct.getList_OUTSIDE_NAME());
			this.setList_UNIT_QTY_NAME(struct.getList_UNIT_QTY_NAME());
			this.setList_c_AUTO_NUM(struct.getList_c_AUTO_NUM());
			this.setList_c_JOB_ODR_DEL_FLG(struct.getList_c_JOB_ODR_DEL_FLG());
			this.setList_c_JOB_ODR_STS_TYP(struct.getList_c_JOB_ODR_STS_TYP());
			this.setList_c_JOB_ODR_EXP_TYP(struct.getList_c_JOB_ODR_EXP_TYP());
			this.setList_JOB_ODR_DLV_DATE_TIME(struct.getList_JOB_ODR_DLV_DATE_TIME());
			this.setList_UPDATE_FLG(struct.getList_UPDATE_FLG());
			this.setList_DEL_FLG(struct.getList_DEL_FLG());
			this.setList_STS_FLG(struct.getList_STS_FLG());
			this.setList_EXP_FLG(struct.getList_EXP_FLG());
			this.setList_d_DATE_TO(struct.getList_d_DATE_TO());
			this.setList_d_DATE_FROM(struct.getList_d_DATE_FROM());
			this.setList_d_JOB_ODR_DLV_DATE(struct.getList_d_JOB_ODR_DLV_DATE());
			this.setList_s_MAX_DISPLAY_MONTH_SERIAL(struct.getList_s_MAX_DISPLAY_MONTH_SERIAL());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_JOB_ODR_TYP(struct.getList_JOB_ODR_TYP());
			this.setList_PLAN_TYP(struct.getList_PLAN_TYP());
			this.setList_JOB_ODR_DLV_DATE(struct.getList_JOB_ODR_DLV_DATE());
			this.setList_JOB_ODR_QTY(struct.getList_JOB_ODR_QTY());
			this.setList_ALC_GRP_CD(struct.getList_ALC_GRP_CD());
			this.setList_JOB_ODR_STS_TYP(struct.getList_JOB_ODR_STS_TYP());
			this.setList_JOB_ODR_EXP_TYP(struct.getList_JOB_ODR_EXP_TYP());
			this.setList_JOB_ODR_DEL_FLG(struct.getList_JOB_ODR_DEL_FLG());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_MAX_DLV_DATE(struct.getList_MAX_DLV_DATE());
			this.setList_MIN_DLV_DATE(struct.getList_MIN_DLV_DATE());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_DRAW_CD(struct.getList_DRAW_CD());
			this.setList_SPEC(struct.getList_SPEC());
			this.setList_MRP_ODR_TYP(struct.getList_MRP_ODR_TYP());
			this.setList_OUTSIDE_TYP(struct.getList_OUTSIDE_TYP());
			this.setList_ITEM_SPOIL(struct.getList_ITEM_SPOIL());
			this.setList_MUL_ODR_QTY(struct.getList_MUL_ODR_QTY());
			this.setList_UNIT_QTY_TYP(struct.getList_UNIT_QTY_TYP());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_PKG_UNIT(struct.getList_PKG_UNIT());
			this.setList_w_MANHOUR_TYP(struct.getList_w_MANHOUR_TYP());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_STOCK_ON_HAND_QTY(struct.getList_STOCK_ON_HAND_QTY());
			this.setList_JOB_ODR_DLV_DATE_ALL(struct.getList_JOB_ODR_DLV_DATE_ALL());
			this.setList_HOLIDAY_FLG(struct.getList_HOLIDAY_FLG());
			this.setList_w_DATE_TO(struct.getList_w_DATE_TO());
			this.setList_w_DATE_FROM(struct.getList_w_DATE_FROM());
			this.setList_BUSINESS_OPR_DATE(struct.getList_BUSINESS_OPR_DATE());
			this.setList_CAL_NO(struct.getList_CAL_NO());
			this.setList_SYS_JOB_ODR_DEL_FLG(struct.getList_SYS_JOB_ODR_DEL_FLG());
			this.setList_TIME_CTRL(struct.getList_TIME_CTRL());
			this.setList_h_PRD_REQ_JOB_ODR_TYP_2(struct.getList_h_PRD_REQ_JOB_ODR_TYP_2());
			this.setList_ALCD_QTY(struct.getList_ALCD_QTY());
			this.setList_h_JOB_ODR_CD(struct.getList_h_JOB_ODR_CD());
			this.setList_SYS_INSTALL_OPTIONS(struct.getList_SYS_INSTALL_OPTIONS());
			this.setList_OD_CALC_FLG(struct.getList_OD_CALC_FLG());
			this.setList_OPTION_ID(struct.getList_OPTION_ID());
			this.setList_DM_STS_TYP(struct.getList_DM_STS_TYP());
			this.setList_JOB_ODR_CD_ALC(struct.getList_JOB_ODR_CD_ALC());
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
	// 第 1 変数初期値： i_JOB_ODR_TYP_name


	final static String i_JOB_ODR_TYP_name = null;

	// 第 2 変数初期値： i_JOB_ODR_TYP_val


	final static String i_JOB_ODR_TYP_val = null;

	// 第 3 変数初期値： i_PLAN_TYP_name


	final static String i_PLAN_TYP_name = null;

	// 第 4 変数初期値： i_PLAN_TYP_val


	final static String i_PLAN_TYP_val = null;

	// 第 5 変数初期値： i_ALCD_ENABLE_QTY


	final static String i_ALCD_ENABLE_QTY = null;

	// 第 6 変数初期値： i_HAND_STOCK


	final static String i_HAND_STOCK = null;

	// 第 7 変数初期値： i_h_AUTO_NUM


	final static Integer i_h_AUTO_NUM = null;

	// 第 8 変数初期値： i_JobOdrExpect


	final static String i_JobOdrExpect = null;

	// 第 9 変数初期値： i_JOB_ODR_NAME


	final static String i_JOB_ODR_NAME = null;

	// 第 10 変数初期値： i_PLAN_NAME


	final static String i_PLAN_NAME = null;

	// 第 11 変数初期値： i_JOB_ODR_STS_NAME


	final static String i_JOB_ODR_STS_NAME = null;

	// 第 12 変数初期値： i_MRP_ODR_NAME


	final static String i_MRP_ODR_NAME = null;

	// 第 13 変数初期値： i_OUTSIDE_NAME


	final static String i_OUTSIDE_NAME = null;

	// 第 14 変数初期値： i_UNIT_QTY_NAME


	final static String i_UNIT_QTY_NAME = null;

	// 第 15 変数初期値： i_c_AUTO_NUM


	final static String i_c_AUTO_NUM = null;

	// 第 16 変数初期値： i_c_JOB_ODR_DEL_FLG


	final static String i_c_JOB_ODR_DEL_FLG = null;

	// 第 17 変数初期値： i_c_JOB_ODR_STS_TYP


	final static String i_c_JOB_ODR_STS_TYP = null;

	// 第 18 変数初期値： i_c_JOB_ODR_EXP_TYP


	final static String i_c_JOB_ODR_EXP_TYP = null;

	// 第 19 変数初期値： i_JOB_ODR_DLV_DATE_TIME


	final static String i_JOB_ODR_DLV_DATE_TIME = null;

	// 第 20 変数初期値： i_UPDATE_FLG


	final static String i_UPDATE_FLG = null;

	// 第 21 変数初期値： i_DEL_FLG


	final static String i_DEL_FLG = null;

	// 第 22 変数初期値： i_STS_FLG


	final static String i_STS_FLG = null;

	// 第 23 変数初期値： i_EXP_FLG


	final static String i_EXP_FLG = null;

	// 第 24 変数初期値： i_d_DATE_TO


	final static java.util.Date i_d_DATE_TO = null;

	// 第 25 変数初期値： i_d_DATE_FROM


	final static java.util.Date i_d_DATE_FROM = null;

	// 第 26 変数初期値： i_d_JOB_ODR_DLV_DATE


	final static String i_d_JOB_ODR_DLV_DATE = null;

	// 第 27 変数初期値： i_s_MAX_DISPLAY_MONTH_SERIAL


	final static String i_s_MAX_DISPLAY_MONTH_SERIAL = null;

	// 第 28 変数初期値： i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// 第 29 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

	// 第 30 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 31 変数初期値： i_JOB_ODR_TYP


	final static Integer i_JOB_ODR_TYP = null;

	// 第 32 変数初期値： i_PLAN_TYP


	final static Integer i_PLAN_TYP = null;

	// 第 33 変数初期値： i_JOB_ODR_DLV_DATE


	final static String i_JOB_ODR_DLV_DATE = null;

	// 第 34 変数初期値： i_JOB_ODR_QTY


	final static String i_JOB_ODR_QTY = null;

	// 第 35 変数初期値： i_ALC_GRP_CD


	final static String i_ALC_GRP_CD = null;

	// 第 36 変数初期値： i_JOB_ODR_STS_TYP


	final static Integer i_JOB_ODR_STS_TYP = null;

	// 第 37 変数初期値： i_JOB_ODR_EXP_TYP


	final static Integer i_JOB_ODR_EXP_TYP = null;

	// 第 38 変数初期値： i_JOB_ODR_DEL_FLG


	final static Integer i_JOB_ODR_DEL_FLG = null;

	// 第 39 変数初期値： i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// 第 40 変数初期値： i_MAX_DLV_DATE


	final static String i_MAX_DLV_DATE = null;

	// 第 41 変数初期値： i_MIN_DLV_DATE


	final static String i_MIN_DLV_DATE = null;

	// 第 42 変数初期値： i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// 第 43 変数初期値： i_DRAW_CD


	final static String i_DRAW_CD = null;

	// 第 44 変数初期値： i_SPEC


	final static String i_SPEC = null;

	// 第 45 変数初期値： i_MRP_ODR_TYP


	final static Integer i_MRP_ODR_TYP = null;

	// 第 46 変数初期値： i_OUTSIDE_TYP


	final static Integer i_OUTSIDE_TYP = null;

	// 第 47 変数初期値： i_ITEM_SPOIL


	final static String i_ITEM_SPOIL = null;

	// 第 48 変数初期値： i_MUL_ODR_QTY


	final static String i_MUL_ODR_QTY = null;

	// 第 49 変数初期値： i_UNIT_QTY_TYP


	final static Integer i_UNIT_QTY_TYP = null;

	// 第 50 変数初期値： i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// 第 51 変数初期値： i_PKG_UNIT


	final static String i_PKG_UNIT = null;

	// 第 52 変数初期値： i_w_MANHOUR_TYP


	final static Double i_w_MANHOUR_TYP = null;

	// 第 53 変数初期値： i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// 第 54 変数初期値： i_STOCK_ON_HAND_QTY


	final static String i_STOCK_ON_HAND_QTY = null;

	// 第 55 変数初期値： i_JOB_ODR_DLV_DATE_ALL


	final static String i_JOB_ODR_DLV_DATE_ALL = null;

	// 第 56 変数初期値： i_HOLIDAY_FLG


	final static Integer i_HOLIDAY_FLG = null;

	// 第 57 変数初期値： i_w_DATE_TO


	final static String i_w_DATE_TO = null;

	// 第 58 変数初期値： i_w_DATE_FROM


	final static String i_w_DATE_FROM = null;

	// 第 59 変数初期値： i_BUSINESS_OPR_DATE


	final static java.util.Date i_BUSINESS_OPR_DATE = null;

	// 第 60 変数初期値： i_CAL_NO


	final static Integer i_CAL_NO = null;

	// 第 61 変数初期値： i_SYS_JOB_ODR_DEL_FLG


	final static String i_SYS_JOB_ODR_DEL_FLG = null;

	// 第 62 変数初期値： i_TIME_CTRL


	final static String i_TIME_CTRL = null;

	// 第 63 変数初期値： i_h_PRD_REQ_JOB_ODR_TYP_2


	final static String i_h_PRD_REQ_JOB_ODR_TYP_2 = null;

	// 第 64 変数初期値： i_ALCD_QTY


	final static String i_ALCD_QTY = null;

	// 第 65 変数初期値： i_h_JOB_ODR_CD


	final static String i_h_JOB_ODR_CD = null;

	// 第 66 変数初期値： i_SYS_INSTALL_OPTIONS


	final static String i_SYS_INSTALL_OPTIONS = null;

	// 第 67 変数初期値： i_OD_CALC_FLG


	final static String i_OD_CALC_FLG = null;

	// 第 68 変数初期値： i_OPTION_ID


	final static String i_OPTION_ID = null;

	// 第 69 変数初期値： i_DM_STS_TYP


	final static String i_DM_STS_TYP = null;

	// 第 70 変数初期値： i_JOB_ODR_CD_ALC


	final static String i_JOB_ODR_CD_ALC = null;

*/

	//{{user_implement_code
       
        /**
         * 品目情報のクリアを行う
         */
        public void clearItem(AB0020010Struct s)
        {
         s.setITEM_NAME("");
         s.setDRAW_CD("");
         s.setSPEC("");
         s.setMRP_ODR_TYP("");
         s.setOUTSIDE_TYP("");
         s.setITEM_SPOIL("");
         s.setUNIT_QTY_TYP("");
         s.setMUL_ODR_QTY("");
         s.setHAND_STOCK("");
         s.setSTOCK_UNIT("");
        }
       
        /**
         * 直持ち変数のコピー
         * @param s コピー元
         */
        public void copy(AB0020010Struct s)	
        {
         clear();
         if(s.m_JOB_ODR_CD != null) m_JOB_ODR_CD = new String(s.m_JOB_ODR_CD);
         if(s.m_PLANT_CD != null) m_PLANT_CD = new String(s.m_PLANT_CD);
         if(s.m_ITEM_CD != null) m_ITEM_CD = new String(s.m_ITEM_CD);
         if(s.m_JOB_ODR_TYP != null) m_JOB_ODR_TYP = new Integer(s.m_JOB_ODR_TYP.intValue());
         if(s.m_PLAN_TYP != null) m_PLAN_TYP = new Integer(s.m_PLAN_TYP.intValue());
         if(s.m_JOB_ODR_DLV_DATE != null) m_JOB_ODR_DLV_DATE = new String(s.m_JOB_ODR_DLV_DATE);
         if(s.m_JOB_ODR_QTY != null) m_JOB_ODR_QTY = new String(s.m_JOB_ODR_QTY);
         if(s.m_ALC_GRP_CD != null) m_ALC_GRP_CD = new String(s.m_ALC_GRP_CD);
         if(s.m_JOB_ODR_STS_TYP != null) m_JOB_ODR_STS_TYP = new Integer(s.m_JOB_ODR_STS_TYP.intValue());
         if(s.m_JOB_ODR_EXP_TYP != null) m_JOB_ODR_EXP_TYP = new Integer(s.m_JOB_ODR_EXP_TYP.intValue());
         if(s.m_JOB_ODR_DEL_FLG != null) m_JOB_ODR_DEL_FLG = new Integer(s.m_JOB_ODR_DEL_FLG.intValue());
         if(s.m_MODIFY_COUNT != null) m_MODIFY_COUNT = new String(s.m_MODIFY_COUNT);
         if(s.m_MAX_DLV_DATE != null) m_MAX_DLV_DATE = new String(s.m_MAX_DLV_DATE);
         if(s.m_MIN_DLV_DATE != null) m_MIN_DLV_DATE = new String(s.m_MIN_DLV_DATE);
         if(s.m_ALCD_QTY != null) m_ALCD_QTY = new String(s.m_ALCD_QTY);
         if(s.m_ITEM_NAME != null) m_ITEM_NAME = new String(s.m_ITEM_NAME);
         if(s.m_DRAW_CD != null) m_DRAW_CD = new String(s.m_DRAW_CD);
         if(s.m_SPEC != null) m_SPEC = new String(s.m_SPEC);
         if(s.m_MRP_ODR_TYP != null) m_MRP_ODR_TYP = new Integer(s.m_MRP_ODR_TYP.intValue());
         if(s.m_OUTSIDE_TYP != null) m_OUTSIDE_TYP = new Integer(s.m_OUTSIDE_TYP.intValue());
         if(s.m_ITEM_SPOIL != null) m_ITEM_SPOIL = new String(s.m_ITEM_SPOIL);
         if(s.m_MUL_ODR_QTY != null) m_MUL_ODR_QTY = new String(s.m_MUL_ODR_QTY);
         if(s.m_UNIT_QTY_TYP != null) m_UNIT_QTY_TYP = new Integer(s.m_UNIT_QTY_TYP.intValue());
         if(s.m_STOCK_UNIT != null) m_STOCK_UNIT = new String(s.m_STOCK_UNIT);
         if(s.m_PKG_UNIT != null) m_PKG_UNIT = new String(s.m_PKG_UNIT);
         if(s.m_PLANT_NAME != null) m_PLANT_NAME = new String(s.m_PLANT_NAME);
         if(s.m_STOCK_ON_HAND_QTY != null) m_STOCK_ON_HAND_QTY = new String(s.m_STOCK_ON_HAND_QTY);
         if(s.m_HOLIDAY_FLG != null) m_HOLIDAY_FLG = new Integer(s.m_HOLIDAY_FLG.intValue());
         if(s.m_w_DATE_TO != null) m_w_DATE_TO = new String(s.m_w_DATE_TO);
         if(s.m_w_DATE_FROM != null) m_w_DATE_FROM = new String(s.m_w_DATE_FROM);
         if(s.m_BUSINESS_OPR_DATE != null) m_BUSINESS_OPR_DATE = new java.util.Date(s.m_BUSINESS_OPR_DATE.getTime());
         if(s.m_JOB_ODR_TYP_name != null) m_JOB_ODR_TYP_name = new String(s.m_JOB_ODR_TYP_name);
         if(s.m_JOB_ODR_TYP_val != null) m_JOB_ODR_TYP_val = new String(s.m_JOB_ODR_TYP_val);
         if(s.m_PLAN_TYP_name != null) m_PLAN_TYP_name = new String(s.m_PLAN_TYP_name);
         if(s.m_PLAN_TYP_val != null) m_PLAN_TYP_val = new String(s.m_PLAN_TYP_val);
         if(s.m_ALCD_ENABLE_QTY != null) m_ALCD_ENABLE_QTY = new String(s.m_ALCD_ENABLE_QTY);
         if(s.m_HAND_STOCK != null) m_HAND_STOCK = new String(s.m_HAND_STOCK);
         if(s.m_h_AUTO_NUM != null) m_h_AUTO_NUM = new Integer(s.m_h_AUTO_NUM.intValue());
         if(s.m_JobOdrExpect != null) m_JobOdrExpect = new String(s.m_JobOdrExpect);
         if(s.m_d_DATE_TO != null) m_d_DATE_TO = new java.util.Date(s.m_d_DATE_TO.getTime());
         if(s.m_d_DATE_FROM != null) m_d_DATE_FROM = new java.util.Date(s.m_d_DATE_FROM.getTime());
         if(s.m_d_JOB_ODR_DLV_DATE != null) m_d_JOB_ODR_DLV_DATE = new String(s.m_d_JOB_ODR_DLV_DATE);
         if(s.m_JOB_ODR_DLV_DATE_TIME != null) m_JOB_ODR_DLV_DATE_TIME = new String(s.m_JOB_ODR_DLV_DATE_TIME);
        }
       
        /**
         * コピーコンストラクタ
         * @param struct コピー対象
         */
         public AB0020010Struct(AB0020010Struct struct)
         {
          copy(struct);
         }
       
        //}}user_implement_code

	//////////////////////////////

}
