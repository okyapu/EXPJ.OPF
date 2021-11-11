/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0080/src/com/nec/jp/orteus/metamorBase/AC0080/AC0080010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0080;

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

public class AC0080010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_w_DATE_FROM */
	public String m_w_DATE_FROM = null;
	/** 第 2 変数： m_w_DATE_TO */
	public String m_w_DATE_TO = null;
	/** 第 3 変数： m_w_OD_TYP */
	public String m_w_OD_TYP = null;
	/** 第 4 変数： m_w_OD_TYP_name */
	public String m_w_OD_TYP_name = null;
	/** 第 5 変数： m_w_OD_TYP_val */
	public String m_w_OD_TYP_val = null;
	/** 第 6 変数： m_OD_TYP */
	public String m_OD_TYP = null;
	/** 第 7 変数： m_OUTSIDE_TYP */
	public String m_OUTSIDE_TYP = null;
	/** 第 8 変数： m_h_DEMAND_FLG */
	public String m_h_DEMAND_FLG = null;
	/** 第 9 変数： m_ODR_DM_QTY */
	public String m_ODR_DM_QTY = null;
	/** 第 10 変数： m_h_ODR_DMD_TYP */
	public String m_h_ODR_DMD_TYP = null;
	/** 第 11 変数： m_w_STS_TYP */
	public String m_w_STS_TYP = null;
	/** 第 12 変数： m_c_UN_CONNECT_DEMAND */
	public String m_c_UN_CONNECT_DEMAND = null;
	/** 第 13 変数： m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** 第 14 変数： m_w_TIME_FROM */
	public String m_w_TIME_FROM = null;
	/** 第 15 変数： m_w_TIME_TO */
	public String m_w_TIME_TO = null;
	/** 第 16 変数： m_s_MIN_CAL_DATE */
	public String m_s_MIN_CAL_DATE = null;
	/** 第 17 変数： m_s_MAX_CAL_DATE */
	public String m_s_MAX_CAL_DATE = null;
	/** 第 18 変数： m_s_PLANT_CD */
	public String m_s_PLANT_CD = null;
	/** 第 19 変数： m_s_OD_TYP */
	public String m_s_OD_TYP = null;
	/** 第 20 変数： m_OD_TYP_name */
	public String m_OD_TYP_name = null;
	/** 第 21 変数： m_OD_TYP_val */
	public String m_OD_TYP_val = null;
	/** 第 22 変数： m_s_OUTSIDE_TYP */
	public String m_s_OUTSIDE_TYP = null;
	/** 第 23 変数： m_OUTSIDE_TYP_name */
	public String m_OUTSIDE_TYP_name = null;
	/** 第 24 変数： m_OUTSIDE_TYP_val */
	public String m_OUTSIDE_TYP_val = null;
	/** 第 25 変数： m_s_BUSINESS_DATE */
	public String m_s_BUSINESS_DATE = null;
	/** 第 26 変数： m_s_UN_CONNECT_DEMAND */
	public String m_s_UN_CONNECT_DEMAND = null;
	/** 第 27 変数： m_s_ODR_DMD_TYP1 */
	public String m_s_ODR_DMD_TYP1 = null;
	/** 第 28 変数： m_s_ODR_DMD_TYP2 */
	public String m_s_ODR_DMD_TYP2 = null;
	/** 第 29 変数： m_w_ODR_STS_TYP */
	public String m_w_ODR_STS_TYP = null;
	/** 第 30 変数： m_w_DM_STS_TYP */
	public String m_w_DM_STS_TYP = null;
	/** 第 31 変数： m_ODR_STS_TYP_name */
	public String m_ODR_STS_TYP_name = null;
	/** 第 32 変数： m_ODR_STS_TYP_val */
	public String m_ODR_STS_TYP_val = null;
	/** 第 33 変数： m_DM_STS_TYP_name */
	public String m_DM_STS_TYP_name = null;
	/** 第 34 変数： m_DM_STS_TYP_val */
	public String m_DM_STS_TYP_val = null;
	/** 第 35 変数： m_h_OD_NO */
	public String m_h_OD_NO = null;
	/** 第 36 変数： m_h_PARENT_OD_NO */
	public String m_h_PARENT_OD_NO = null;
	/** 第 37 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 38 変数： m_PRD_DUE_DATE */
	public String m_PRD_DUE_DATE = null;
	/** 第 39 変数： m_ODR_QTY */
	public String m_ODR_QTY = null;
	/** 第 40 変数： m_DM_QTY */
	public String m_DM_QTY = null;
	/** 第 41 変数： m_EXTERNAL_PLAN_CD */
	public String m_EXTERNAL_PLAN_CD = null;
	/** 第 42 変数： m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** 第 43 変数： m_EX_MODIFY_COUNT */
	public String m_EX_MODIFY_COUNT = null;
	/** 第 44 変数： m_OD_MODIFY_COUNT */
	public String m_OD_MODIFY_COUNT = null;
	/** 第 45 変数： m_w_ITEM_CD */
	public String m_w_ITEM_CD = null;
	/** 第 46 変数： m_w_PLANT_CD */
	public String m_w_PLANT_CD = null;
	/** 第 47 変数： m_w_DATE_FROM_ALL */
	public String m_w_DATE_FROM_ALL = null;
	/** 第 48 変数： m_w_DATE_TO_ALL */
	public String m_w_DATE_TO_ALL = null;
	/** 第 49 変数： m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** 第 50 変数： m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** 第 51 変数： m_TIME_CTRL */
	public String m_TIME_CTRL = null;
	/** 第 52 変数： m_l_COUNT */
	public String m_l_COUNT = null;
	/** 第 53 変数： m_ROW_COUNT */
	public String m_ROW_COUNT = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_w_DATE_FROM */
	public List l_w_DATE_FROM = null;

	/** 第 2 List変数： l_w_DATE_TO */
	public List l_w_DATE_TO = null;

	/** 第 3 List変数： l_w_OD_TYP */
	public List l_w_OD_TYP = null;

	/** 第 4 List変数： l_w_OD_TYP_name */
	public List l_w_OD_TYP_name = null;

	/** 第 5 List変数： l_w_OD_TYP_val */
	public List l_w_OD_TYP_val = null;

	/** 第 6 List変数： l_OD_TYP */
	public List l_OD_TYP = null;

	/** 第 7 List変数： l_OUTSIDE_TYP */
	public List l_OUTSIDE_TYP = null;

	/** 第 8 List変数： l_h_DEMAND_FLG */
	public List l_h_DEMAND_FLG = null;

	/** 第 9 List変数： l_ODR_DM_QTY */
	public List l_ODR_DM_QTY = null;

	/** 第 10 List変数： l_h_ODR_DMD_TYP */
	public List l_h_ODR_DMD_TYP = null;

	/** 第 11 List変数： l_w_STS_TYP */
	public List l_w_STS_TYP = null;

	/** 第 12 List変数： l_c_UN_CONNECT_DEMAND */
	public List l_c_UN_CONNECT_DEMAND = null;

	/** 第 13 List変数： l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** 第 14 List変数： l_w_TIME_FROM */
	public List l_w_TIME_FROM = null;

	/** 第 15 List変数： l_w_TIME_TO */
	public List l_w_TIME_TO = null;

	/** 第 16 List変数： l_s_MIN_CAL_DATE */
	public List l_s_MIN_CAL_DATE = null;

	/** 第 17 List変数： l_s_MAX_CAL_DATE */
	public List l_s_MAX_CAL_DATE = null;

	/** 第 18 List変数： l_s_PLANT_CD */
	public List l_s_PLANT_CD = null;

	/** 第 19 List変数： l_s_OD_TYP */
	public List l_s_OD_TYP = null;

	/** 第 20 List変数： l_OD_TYP_name */
	public List l_OD_TYP_name = null;

	/** 第 21 List変数： l_OD_TYP_val */
	public List l_OD_TYP_val = null;

	/** 第 22 List変数： l_s_OUTSIDE_TYP */
	public List l_s_OUTSIDE_TYP = null;

	/** 第 23 List変数： l_OUTSIDE_TYP_name */
	public List l_OUTSIDE_TYP_name = null;

	/** 第 24 List変数： l_OUTSIDE_TYP_val */
	public List l_OUTSIDE_TYP_val = null;

	/** 第 25 List変数： l_s_BUSINESS_DATE */
	public List l_s_BUSINESS_DATE = null;

	/** 第 26 List変数： l_s_UN_CONNECT_DEMAND */
	public List l_s_UN_CONNECT_DEMAND = null;

	/** 第 27 List変数： l_s_ODR_DMD_TYP1 */
	public List l_s_ODR_DMD_TYP1 = null;

	/** 第 28 List変数： l_s_ODR_DMD_TYP2 */
	public List l_s_ODR_DMD_TYP2 = null;

	/** 第 29 List変数： l_w_ODR_STS_TYP */
	public List l_w_ODR_STS_TYP = null;

	/** 第 30 List変数： l_w_DM_STS_TYP */
	public List l_w_DM_STS_TYP = null;

	/** 第 31 List変数： l_ODR_STS_TYP_name */
	public List l_ODR_STS_TYP_name = null;

	/** 第 32 List変数： l_ODR_STS_TYP_val */
	public List l_ODR_STS_TYP_val = null;

	/** 第 33 List変数： l_DM_STS_TYP_name */
	public List l_DM_STS_TYP_name = null;

	/** 第 34 List変数： l_DM_STS_TYP_val */
	public List l_DM_STS_TYP_val = null;

	/** 第 35 List変数： l_h_OD_NO */
	public List l_h_OD_NO = null;

	/** 第 36 List変数： l_h_PARENT_OD_NO */
	public List l_h_PARENT_OD_NO = null;

	/** 第 37 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 38 List変数： l_PRD_DUE_DATE */
	public List l_PRD_DUE_DATE = null;

	/** 第 39 List変数： l_ODR_QTY */
	public List l_ODR_QTY = null;

	/** 第 40 List変数： l_DM_QTY */
	public List l_DM_QTY = null;

	/** 第 41 List変数： l_EXTERNAL_PLAN_CD */
	public List l_EXTERNAL_PLAN_CD = null;

	/** 第 42 List変数： l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** 第 43 List変数： l_EX_MODIFY_COUNT */
	public List l_EX_MODIFY_COUNT = null;

	/** 第 44 List変数： l_OD_MODIFY_COUNT */
	public List l_OD_MODIFY_COUNT = null;

	/** 第 45 List変数： l_w_ITEM_CD */
	public List l_w_ITEM_CD = null;

	/** 第 46 List変数： l_w_PLANT_CD */
	public List l_w_PLANT_CD = null;

	/** 第 47 List変数： l_w_DATE_FROM_ALL */
	public List l_w_DATE_FROM_ALL = null;

	/** 第 48 List変数： l_w_DATE_TO_ALL */
	public List l_w_DATE_TO_ALL = null;

	/** 第 49 List変数： l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** 第 50 List変数： l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** 第 51 List変数： l_TIME_CTRL */
	public List l_TIME_CTRL = null;

	/** 第 52 List変数： l_l_COUNT */
	public List l_l_COUNT = null;

	/** 第 53 List変数： l_ROW_COUNT */
	public List l_ROW_COUNT = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getw_DATE_FROM() { return m_w_DATE_FROM; }
	public String getw_DATE_TO() { return m_w_DATE_TO; }
	public String getw_OD_TYP() { return m_w_OD_TYP; }
	public String getw_OD_TYP_name() { return m_w_OD_TYP_name; }
	public String getw_OD_TYP_val() { return m_w_OD_TYP_val; }
	public String getOD_TYP() { return m_OD_TYP; }
	public String getOUTSIDE_TYP() { return m_OUTSIDE_TYP; }
	public String geth_DEMAND_FLG() { return m_h_DEMAND_FLG; }
	public String getODR_DM_QTY() { return m_ODR_DM_QTY; }
	public String geth_ODR_DMD_TYP() { return m_h_ODR_DMD_TYP; }
	public String getw_STS_TYP() { return m_w_STS_TYP; }
	public String getc_UN_CONNECT_DEMAND() { return m_c_UN_CONNECT_DEMAND; }
	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getw_TIME_FROM() { return m_w_TIME_FROM; }
	public String getw_TIME_TO() { return m_w_TIME_TO; }
	public String gets_MIN_CAL_DATE() { return m_s_MIN_CAL_DATE; }
	public String gets_MAX_CAL_DATE() { return m_s_MAX_CAL_DATE; }
	public String gets_PLANT_CD() { return m_s_PLANT_CD; }
	public String gets_OD_TYP() { return m_s_OD_TYP; }
	public String getOD_TYP_name() { return m_OD_TYP_name; }
	public String getOD_TYP_val() { return m_OD_TYP_val; }
	public String gets_OUTSIDE_TYP() { return m_s_OUTSIDE_TYP; }
	public String getOUTSIDE_TYP_name() { return m_OUTSIDE_TYP_name; }
	public String getOUTSIDE_TYP_val() { return m_OUTSIDE_TYP_val; }
	public String gets_BUSINESS_DATE() { return m_s_BUSINESS_DATE; }
	public String gets_UN_CONNECT_DEMAND() { return m_s_UN_CONNECT_DEMAND; }
	public String gets_ODR_DMD_TYP1() { return m_s_ODR_DMD_TYP1; }
	public String gets_ODR_DMD_TYP2() { return m_s_ODR_DMD_TYP2; }
	public String getw_ODR_STS_TYP() { return m_w_ODR_STS_TYP; }
	public String getw_DM_STS_TYP() { return m_w_DM_STS_TYP; }
	public String getODR_STS_TYP_name() { return m_ODR_STS_TYP_name; }
	public String getODR_STS_TYP_val() { return m_ODR_STS_TYP_val; }
	public String getDM_STS_TYP_name() { return m_DM_STS_TYP_name; }
	public String getDM_STS_TYP_val() { return m_DM_STS_TYP_val; }
	public String geth_OD_NO() { return m_h_OD_NO; }
	public String geth_PARENT_OD_NO() { return m_h_PARENT_OD_NO; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getPRD_DUE_DATE() { return m_PRD_DUE_DATE; }
	public String getODR_QTY() { return m_ODR_QTY; }
	public String getDM_QTY() { return m_DM_QTY; }
	public String getEXTERNAL_PLAN_CD() { return m_EXTERNAL_PLAN_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getEX_MODIFY_COUNT() { return m_EX_MODIFY_COUNT; }
	public String getOD_MODIFY_COUNT() { return m_OD_MODIFY_COUNT; }
	public String getw_ITEM_CD() { return m_w_ITEM_CD; }
	public String getw_PLANT_CD() { return m_w_PLANT_CD; }
	public String getw_DATE_FROM_ALL() { return m_w_DATE_FROM_ALL; }
	public String getw_DATE_TO_ALL() { return m_w_DATE_TO_ALL; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getTIME_CTRL() { return m_TIME_CTRL; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }

	public List getList_w_DATE_FROM() { return l_w_DATE_FROM; }
	public List getList_w_DATE_TO() { return l_w_DATE_TO; }
	public List getList_w_OD_TYP() { return l_w_OD_TYP; }
	public List getList_w_OD_TYP_name() { return l_w_OD_TYP_name; }
	public List getList_w_OD_TYP_val() { return l_w_OD_TYP_val; }
	public List getList_OD_TYP() { return l_OD_TYP; }
	public List getList_OUTSIDE_TYP() { return l_OUTSIDE_TYP; }
	public List getList_h_DEMAND_FLG() { return l_h_DEMAND_FLG; }
	public List getList_ODR_DM_QTY() { return l_ODR_DM_QTY; }
	public List getList_h_ODR_DMD_TYP() { return l_h_ODR_DMD_TYP; }
	public List getList_w_STS_TYP() { return l_w_STS_TYP; }
	public List getList_c_UN_CONNECT_DEMAND() { return l_c_UN_CONNECT_DEMAND; }
	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_w_TIME_FROM() { return l_w_TIME_FROM; }
	public List getList_w_TIME_TO() { return l_w_TIME_TO; }
	public List getList_s_MIN_CAL_DATE() { return l_s_MIN_CAL_DATE; }
	public List getList_s_MAX_CAL_DATE() { return l_s_MAX_CAL_DATE; }
	public List getList_s_PLANT_CD() { return l_s_PLANT_CD; }
	public List getList_s_OD_TYP() { return l_s_OD_TYP; }
	public List getList_OD_TYP_name() { return l_OD_TYP_name; }
	public List getList_OD_TYP_val() { return l_OD_TYP_val; }
	public List getList_s_OUTSIDE_TYP() { return l_s_OUTSIDE_TYP; }
	public List getList_OUTSIDE_TYP_name() { return l_OUTSIDE_TYP_name; }
	public List getList_OUTSIDE_TYP_val() { return l_OUTSIDE_TYP_val; }
	public List getList_s_BUSINESS_DATE() { return l_s_BUSINESS_DATE; }
	public List getList_s_UN_CONNECT_DEMAND() { return l_s_UN_CONNECT_DEMAND; }
	public List getList_s_ODR_DMD_TYP1() { return l_s_ODR_DMD_TYP1; }
	public List getList_s_ODR_DMD_TYP2() { return l_s_ODR_DMD_TYP2; }
	public List getList_w_ODR_STS_TYP() { return l_w_ODR_STS_TYP; }
	public List getList_w_DM_STS_TYP() { return l_w_DM_STS_TYP; }
	public List getList_ODR_STS_TYP_name() { return l_ODR_STS_TYP_name; }
	public List getList_ODR_STS_TYP_val() { return l_ODR_STS_TYP_val; }
	public List getList_DM_STS_TYP_name() { return l_DM_STS_TYP_name; }
	public List getList_DM_STS_TYP_val() { return l_DM_STS_TYP_val; }
	public List getList_h_OD_NO() { return l_h_OD_NO; }
	public List getList_h_PARENT_OD_NO() { return l_h_PARENT_OD_NO; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_PRD_DUE_DATE() { return l_PRD_DUE_DATE; }
	public List getList_ODR_QTY() { return l_ODR_QTY; }
	public List getList_DM_QTY() { return l_DM_QTY; }
	public List getList_EXTERNAL_PLAN_CD() { return l_EXTERNAL_PLAN_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_EX_MODIFY_COUNT() { return l_EX_MODIFY_COUNT; }
	public List getList_OD_MODIFY_COUNT() { return l_OD_MODIFY_COUNT; }
	public List getList_w_ITEM_CD() { return l_w_ITEM_CD; }
	public List getList_w_PLANT_CD() { return l_w_PLANT_CD; }
	public List getList_w_DATE_FROM_ALL() { return l_w_DATE_FROM_ALL; }
	public List getList_w_DATE_TO_ALL() { return l_w_DATE_TO_ALL; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_TIME_CTRL() { return l_TIME_CTRL; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }

	public void setw_DATE_FROM(String val) { m_w_DATE_FROM = val; }
	public void setw_DATE_TO(String val) { m_w_DATE_TO = val; }
	public void setw_OD_TYP(String val) { m_w_OD_TYP = val; }
	public void setw_OD_TYP_name(String val) { m_w_OD_TYP_name = val; }
	public void setw_OD_TYP_val(String val) { m_w_OD_TYP_val = val; }
	public void setOD_TYP(String val) { m_OD_TYP = val; }
	public void setOUTSIDE_TYP(String val) { m_OUTSIDE_TYP = val; }
	public void seth_DEMAND_FLG(String val) { m_h_DEMAND_FLG = val; }
	public void setODR_DM_QTY(String val) { m_ODR_DM_QTY = val; }
	public void seth_ODR_DMD_TYP(String val) { m_h_ODR_DMD_TYP = val; }
	public void setw_STS_TYP(String val) { m_w_STS_TYP = val; }
	public void setc_UN_CONNECT_DEMAND(String val) { m_c_UN_CONNECT_DEMAND = val; }
	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setw_TIME_FROM(String val) { m_w_TIME_FROM = val; }
	public void setw_TIME_TO(String val) { m_w_TIME_TO = val; }
	public void sets_MIN_CAL_DATE(String val) { m_s_MIN_CAL_DATE = val; }
	public void sets_MAX_CAL_DATE(String val) { m_s_MAX_CAL_DATE = val; }
	public void sets_PLANT_CD(String val) { m_s_PLANT_CD = val; }
	public void sets_OD_TYP(String val) { m_s_OD_TYP = val; }
	public void setOD_TYP_name(String val) { m_OD_TYP_name = val; }
	public void setOD_TYP_val(String val) { m_OD_TYP_val = val; }
	public void sets_OUTSIDE_TYP(String val) { m_s_OUTSIDE_TYP = val; }
	public void setOUTSIDE_TYP_name(String val) { m_OUTSIDE_TYP_name = val; }
	public void setOUTSIDE_TYP_val(String val) { m_OUTSIDE_TYP_val = val; }
	public void sets_BUSINESS_DATE(String val) { m_s_BUSINESS_DATE = val; }
	public void sets_UN_CONNECT_DEMAND(String val) { m_s_UN_CONNECT_DEMAND = val; }
	public void sets_ODR_DMD_TYP1(String val) { m_s_ODR_DMD_TYP1 = val; }
	public void sets_ODR_DMD_TYP2(String val) { m_s_ODR_DMD_TYP2 = val; }
	public void setw_ODR_STS_TYP(String val) { m_w_ODR_STS_TYP = val; }
	public void setw_DM_STS_TYP(String val) { m_w_DM_STS_TYP = val; }
	public void setODR_STS_TYP_name(String val) { m_ODR_STS_TYP_name = val; }
	public void setODR_STS_TYP_val(String val) { m_ODR_STS_TYP_val = val; }
	public void setDM_STS_TYP_name(String val) { m_DM_STS_TYP_name = val; }
	public void setDM_STS_TYP_val(String val) { m_DM_STS_TYP_val = val; }
	public void seth_OD_NO(String val) { m_h_OD_NO = val; }
	public void seth_PARENT_OD_NO(String val) { m_h_PARENT_OD_NO = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setPRD_DUE_DATE(String val) { m_PRD_DUE_DATE = val; }
	public void setODR_QTY(String val) { m_ODR_QTY = val; }
	public void setDM_QTY(String val) { m_DM_QTY = val; }
	public void setEXTERNAL_PLAN_CD(String val) { m_EXTERNAL_PLAN_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setEX_MODIFY_COUNT(String val) { m_EX_MODIFY_COUNT = val; }
	public void setOD_MODIFY_COUNT(String val) { m_OD_MODIFY_COUNT = val; }
	public void setw_ITEM_CD(String val) { m_w_ITEM_CD = val; }
	public void setw_PLANT_CD(String val) { m_w_PLANT_CD = val; }
	public void setw_DATE_FROM_ALL(String val) { m_w_DATE_FROM_ALL = val; }
	public void setw_DATE_TO_ALL(String val) { m_w_DATE_TO_ALL = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setTIME_CTRL(String val) { m_TIME_CTRL = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }


	public void setList_w_DATE_FROM(List list) { l_w_DATE_FROM = list; }
	public void setList_w_DATE_TO(List list) { l_w_DATE_TO = list; }
	public void setList_w_OD_TYP(List list) { l_w_OD_TYP = list; }
	public void setList_w_OD_TYP_name(List list) { l_w_OD_TYP_name = list; }
	public void setList_w_OD_TYP_val(List list) { l_w_OD_TYP_val = list; }
	public void setList_OD_TYP(List list) { l_OD_TYP = list; }
	public void setList_OUTSIDE_TYP(List list) { l_OUTSIDE_TYP = list; }
	public void setList_h_DEMAND_FLG(List list) { l_h_DEMAND_FLG = list; }
	public void setList_ODR_DM_QTY(List list) { l_ODR_DM_QTY = list; }
	public void setList_h_ODR_DMD_TYP(List list) { l_h_ODR_DMD_TYP = list; }
	public void setList_w_STS_TYP(List list) { l_w_STS_TYP = list; }
	public void setList_c_UN_CONNECT_DEMAND(List list) { l_c_UN_CONNECT_DEMAND = list; }
	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_w_TIME_FROM(List list) { l_w_TIME_FROM = list; }
	public void setList_w_TIME_TO(List list) { l_w_TIME_TO = list; }
	public void setList_s_MIN_CAL_DATE(List list) { l_s_MIN_CAL_DATE = list; }
	public void setList_s_MAX_CAL_DATE(List list) { l_s_MAX_CAL_DATE = list; }
	public void setList_s_PLANT_CD(List list) { l_s_PLANT_CD = list; }
	public void setList_s_OD_TYP(List list) { l_s_OD_TYP = list; }
	public void setList_OD_TYP_name(List list) { l_OD_TYP_name = list; }
	public void setList_OD_TYP_val(List list) { l_OD_TYP_val = list; }
	public void setList_s_OUTSIDE_TYP(List list) { l_s_OUTSIDE_TYP = list; }
	public void setList_OUTSIDE_TYP_name(List list) { l_OUTSIDE_TYP_name = list; }
	public void setList_OUTSIDE_TYP_val(List list) { l_OUTSIDE_TYP_val = list; }
	public void setList_s_BUSINESS_DATE(List list) { l_s_BUSINESS_DATE = list; }
	public void setList_s_UN_CONNECT_DEMAND(List list) { l_s_UN_CONNECT_DEMAND = list; }
	public void setList_s_ODR_DMD_TYP1(List list) { l_s_ODR_DMD_TYP1 = list; }
	public void setList_s_ODR_DMD_TYP2(List list) { l_s_ODR_DMD_TYP2 = list; }
	public void setList_w_ODR_STS_TYP(List list) { l_w_ODR_STS_TYP = list; }
	public void setList_w_DM_STS_TYP(List list) { l_w_DM_STS_TYP = list; }
	public void setList_ODR_STS_TYP_name(List list) { l_ODR_STS_TYP_name = list; }
	public void setList_ODR_STS_TYP_val(List list) { l_ODR_STS_TYP_val = list; }
	public void setList_DM_STS_TYP_name(List list) { l_DM_STS_TYP_name = list; }
	public void setList_DM_STS_TYP_val(List list) { l_DM_STS_TYP_val = list; }
	public void setList_h_OD_NO(List list) { l_h_OD_NO = list; }
	public void setList_h_PARENT_OD_NO(List list) { l_h_PARENT_OD_NO = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_PRD_DUE_DATE(List list) { l_PRD_DUE_DATE = list; }
	public void setList_ODR_QTY(List list) { l_ODR_QTY = list; }
	public void setList_DM_QTY(List list) { l_DM_QTY = list; }
	public void setList_EXTERNAL_PLAN_CD(List list) { l_EXTERNAL_PLAN_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_EX_MODIFY_COUNT(List list) { l_EX_MODIFY_COUNT = list; }
	public void setList_OD_MODIFY_COUNT(List list) { l_OD_MODIFY_COUNT = list; }
	public void setList_w_ITEM_CD(List list) { l_w_ITEM_CD = list; }
	public void setList_w_PLANT_CD(List list) { l_w_PLANT_CD = list; }
	public void setList_w_DATE_FROM_ALL(List list) { l_w_DATE_FROM_ALL = list; }
	public void setList_w_DATE_TO_ALL(List list) { l_w_DATE_TO_ALL = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
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
			l_w_DATE_FROM.add(((AC0080010Struct) list.get(i)).getw_DATE_FROM());
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
			l_w_DATE_TO.add(((AC0080010Struct) list.get(i)).getw_DATE_TO());
		}
		return size;
	}
	public int setL2L_w_OD_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_OD_TYP == null) {
			l_w_OD_TYP = new ArrayList();
		} else {
			l_w_OD_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_OD_TYP.add(((AC0080010Struct) list.get(i)).getw_OD_TYP());
		}
		return size;
	}
	public int setL2L_w_OD_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_OD_TYP_name == null) {
			l_w_OD_TYP_name = new ArrayList();
		} else {
			l_w_OD_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_OD_TYP_name.add(((AC0080010Struct) list.get(i)).getw_OD_TYP_name());
		}
		return size;
	}
	public int setL2L_w_OD_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_OD_TYP_val == null) {
			l_w_OD_TYP_val = new ArrayList();
		} else {
			l_w_OD_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_OD_TYP_val.add(((AC0080010Struct) list.get(i)).getw_OD_TYP_val());
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
			l_OD_TYP.add(((AC0080010Struct) list.get(i)).getOD_TYP());
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
			l_OUTSIDE_TYP.add(((AC0080010Struct) list.get(i)).getOUTSIDE_TYP());
		}
		return size;
	}
	public int setL2L_h_DEMAND_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_DEMAND_FLG == null) {
			l_h_DEMAND_FLG = new ArrayList();
		} else {
			l_h_DEMAND_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_DEMAND_FLG.add(((AC0080010Struct) list.get(i)).geth_DEMAND_FLG());
		}
		return size;
	}
	public int setL2L_ODR_DM_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_DM_QTY == null) {
			l_ODR_DM_QTY = new ArrayList();
		} else {
			l_ODR_DM_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_DM_QTY.add(((AC0080010Struct) list.get(i)).getODR_DM_QTY());
		}
		return size;
	}
	public int setL2L_h_ODR_DMD_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ODR_DMD_TYP == null) {
			l_h_ODR_DMD_TYP = new ArrayList();
		} else {
			l_h_ODR_DMD_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ODR_DMD_TYP.add(((AC0080010Struct) list.get(i)).geth_ODR_DMD_TYP());
		}
		return size;
	}
	public int setL2L_w_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_STS_TYP == null) {
			l_w_STS_TYP = new ArrayList();
		} else {
			l_w_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_STS_TYP.add(((AC0080010Struct) list.get(i)).getw_STS_TYP());
		}
		return size;
	}
	public int setL2L_c_UN_CONNECT_DEMAND(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_UN_CONNECT_DEMAND == null) {
			l_c_UN_CONNECT_DEMAND = new ArrayList();
		} else {
			l_c_UN_CONNECT_DEMAND.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_UN_CONNECT_DEMAND.add(((AC0080010Struct) list.get(i)).getc_UN_CONNECT_DEMAND());
		}
		return size;
	}
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
			l_DOWNLOAD_FILE.add(((AC0080010Struct) list.get(i)).getDOWNLOAD_FILE());
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
			l_w_TIME_FROM.add(((AC0080010Struct) list.get(i)).getw_TIME_FROM());
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
			l_w_TIME_TO.add(((AC0080010Struct) list.get(i)).getw_TIME_TO());
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
			l_s_MIN_CAL_DATE.add(((AC0080010Struct) list.get(i)).gets_MIN_CAL_DATE());
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
			l_s_MAX_CAL_DATE.add(((AC0080010Struct) list.get(i)).gets_MAX_CAL_DATE());
		}
		return size;
	}
	public int setL2L_s_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_PLANT_CD == null) {
			l_s_PLANT_CD = new ArrayList();
		} else {
			l_s_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_PLANT_CD.add(((AC0080010Struct) list.get(i)).gets_PLANT_CD());
		}
		return size;
	}
	public int setL2L_s_OD_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_OD_TYP == null) {
			l_s_OD_TYP = new ArrayList();
		} else {
			l_s_OD_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_OD_TYP.add(((AC0080010Struct) list.get(i)).gets_OD_TYP());
		}
		return size;
	}
	public int setL2L_OD_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OD_TYP_name == null) {
			l_OD_TYP_name = new ArrayList();
		} else {
			l_OD_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OD_TYP_name.add(((AC0080010Struct) list.get(i)).getOD_TYP_name());
		}
		return size;
	}
	public int setL2L_OD_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OD_TYP_val == null) {
			l_OD_TYP_val = new ArrayList();
		} else {
			l_OD_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OD_TYP_val.add(((AC0080010Struct) list.get(i)).getOD_TYP_val());
		}
		return size;
	}
	public int setL2L_s_OUTSIDE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_OUTSIDE_TYP == null) {
			l_s_OUTSIDE_TYP = new ArrayList();
		} else {
			l_s_OUTSIDE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_OUTSIDE_TYP.add(((AC0080010Struct) list.get(i)).gets_OUTSIDE_TYP());
		}
		return size;
	}
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
			l_OUTSIDE_TYP_name.add(((AC0080010Struct) list.get(i)).getOUTSIDE_TYP_name());
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
			l_OUTSIDE_TYP_val.add(((AC0080010Struct) list.get(i)).getOUTSIDE_TYP_val());
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
			l_s_BUSINESS_DATE.add(((AC0080010Struct) list.get(i)).gets_BUSINESS_DATE());
		}
		return size;
	}
	public int setL2L_s_UN_CONNECT_DEMAND(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_UN_CONNECT_DEMAND == null) {
			l_s_UN_CONNECT_DEMAND = new ArrayList();
		} else {
			l_s_UN_CONNECT_DEMAND.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_UN_CONNECT_DEMAND.add(((AC0080010Struct) list.get(i)).gets_UN_CONNECT_DEMAND());
		}
		return size;
	}
	public int setL2L_s_ODR_DMD_TYP1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_ODR_DMD_TYP1 == null) {
			l_s_ODR_DMD_TYP1 = new ArrayList();
		} else {
			l_s_ODR_DMD_TYP1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_ODR_DMD_TYP1.add(((AC0080010Struct) list.get(i)).gets_ODR_DMD_TYP1());
		}
		return size;
	}
	public int setL2L_s_ODR_DMD_TYP2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_ODR_DMD_TYP2 == null) {
			l_s_ODR_DMD_TYP2 = new ArrayList();
		} else {
			l_s_ODR_DMD_TYP2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_ODR_DMD_TYP2.add(((AC0080010Struct) list.get(i)).gets_ODR_DMD_TYP2());
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
			l_w_ODR_STS_TYP.add(((AC0080010Struct) list.get(i)).getw_ODR_STS_TYP());
		}
		return size;
	}
	public int setL2L_w_DM_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_DM_STS_TYP == null) {
			l_w_DM_STS_TYP = new ArrayList();
		} else {
			l_w_DM_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_DM_STS_TYP.add(((AC0080010Struct) list.get(i)).getw_DM_STS_TYP());
		}
		return size;
	}
	public int setL2L_ODR_STS_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_STS_TYP_name == null) {
			l_ODR_STS_TYP_name = new ArrayList();
		} else {
			l_ODR_STS_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_STS_TYP_name.add(((AC0080010Struct) list.get(i)).getODR_STS_TYP_name());
		}
		return size;
	}
	public int setL2L_ODR_STS_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_STS_TYP_val == null) {
			l_ODR_STS_TYP_val = new ArrayList();
		} else {
			l_ODR_STS_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_STS_TYP_val.add(((AC0080010Struct) list.get(i)).getODR_STS_TYP_val());
		}
		return size;
	}
	public int setL2L_DM_STS_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DM_STS_TYP_name == null) {
			l_DM_STS_TYP_name = new ArrayList();
		} else {
			l_DM_STS_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DM_STS_TYP_name.add(((AC0080010Struct) list.get(i)).getDM_STS_TYP_name());
		}
		return size;
	}
	public int setL2L_DM_STS_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DM_STS_TYP_val == null) {
			l_DM_STS_TYP_val = new ArrayList();
		} else {
			l_DM_STS_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DM_STS_TYP_val.add(((AC0080010Struct) list.get(i)).getDM_STS_TYP_val());
		}
		return size;
	}
	public int setL2L_h_OD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_OD_NO == null) {
			l_h_OD_NO = new ArrayList();
		} else {
			l_h_OD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_OD_NO.add(((AC0080010Struct) list.get(i)).geth_OD_NO());
		}
		return size;
	}
	public int setL2L_h_PARENT_OD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PARENT_OD_NO == null) {
			l_h_PARENT_OD_NO = new ArrayList();
		} else {
			l_h_PARENT_OD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PARENT_OD_NO.add(((AC0080010Struct) list.get(i)).geth_PARENT_OD_NO());
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
			l_ITEM_CD.add(((AC0080010Struct) list.get(i)).getITEM_CD());
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
			l_PRD_DUE_DATE.add(((AC0080010Struct) list.get(i)).getPRD_DUE_DATE());
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
			l_ODR_QTY.add(((AC0080010Struct) list.get(i)).getODR_QTY());
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
			l_DM_QTY.add(((AC0080010Struct) list.get(i)).getDM_QTY());
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
			l_EXTERNAL_PLAN_CD.add(((AC0080010Struct) list.get(i)).getEXTERNAL_PLAN_CD());
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
			l_ITEM_NAME.add(((AC0080010Struct) list.get(i)).getITEM_NAME());
		}
		return size;
	}
	public int setL2L_EX_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EX_MODIFY_COUNT == null) {
			l_EX_MODIFY_COUNT = new ArrayList();
		} else {
			l_EX_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EX_MODIFY_COUNT.add(((AC0080010Struct) list.get(i)).getEX_MODIFY_COUNT());
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
			l_OD_MODIFY_COUNT.add(((AC0080010Struct) list.get(i)).getOD_MODIFY_COUNT());
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
			l_w_ITEM_CD.add(((AC0080010Struct) list.get(i)).getw_ITEM_CD());
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
			l_w_PLANT_CD.add(((AC0080010Struct) list.get(i)).getw_PLANT_CD());
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
			l_w_DATE_FROM_ALL.add(((AC0080010Struct) list.get(i)).getw_DATE_FROM_ALL());
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
			l_w_DATE_TO_ALL.add(((AC0080010Struct) list.get(i)).getw_DATE_TO_ALL());
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
			l_PLANT_NAME.add(((AC0080010Struct) list.get(i)).getPLANT_NAME());
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
			l_MODIFY_COUNT.add(((AC0080010Struct) list.get(i)).getMODIFY_COUNT());
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
			l_TIME_CTRL.add(((AC0080010Struct) list.get(i)).getTIME_CTRL());
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
			l_l_COUNT.add(((AC0080010Struct) list.get(i)).getl_COUNT());
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
			l_ROW_COUNT.add(((AC0080010Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_w_DATE_FROM = null;
		m_w_DATE_TO = null;
		m_w_OD_TYP = null;
		m_w_OD_TYP_name = null;
		m_w_OD_TYP_val = null;
		m_OD_TYP = null;
		m_OUTSIDE_TYP = null;
		m_h_DEMAND_FLG = null;
		m_ODR_DM_QTY = null;
		m_h_ODR_DMD_TYP = null;
		m_w_STS_TYP = null;
		m_c_UN_CONNECT_DEMAND = null;
		m_DOWNLOAD_FILE = null;
		m_w_TIME_FROM = null;
		m_w_TIME_TO = null;
		m_s_MIN_CAL_DATE = null;
		m_s_MAX_CAL_DATE = null;
		m_s_PLANT_CD = null;
		m_s_OD_TYP = null;
		m_OD_TYP_name = null;
		m_OD_TYP_val = null;
		m_s_OUTSIDE_TYP = null;
		m_OUTSIDE_TYP_name = null;
		m_OUTSIDE_TYP_val = null;
		m_s_BUSINESS_DATE = null;
		m_s_UN_CONNECT_DEMAND = null;
		m_s_ODR_DMD_TYP1 = null;
		m_s_ODR_DMD_TYP2 = null;
		m_w_ODR_STS_TYP = null;
		m_w_DM_STS_TYP = null;
		m_ODR_STS_TYP_name = null;
		m_ODR_STS_TYP_val = null;
		m_DM_STS_TYP_name = null;
		m_DM_STS_TYP_val = null;
		m_h_OD_NO = null;
		m_h_PARENT_OD_NO = null;
		m_ITEM_CD = null;
		m_PRD_DUE_DATE = null;
		m_ODR_QTY = null;
		m_DM_QTY = null;
		m_EXTERNAL_PLAN_CD = null;
		m_ITEM_NAME = null;
		m_EX_MODIFY_COUNT = null;
		m_OD_MODIFY_COUNT = null;
		m_w_ITEM_CD = null;
		m_w_PLANT_CD = null;
		m_w_DATE_FROM_ALL = null;
		m_w_DATE_TO_ALL = null;
		m_PLANT_NAME = null;
		m_MODIFY_COUNT = null;
		m_TIME_CTRL = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;

		l_w_DATE_FROM = null;
		l_w_DATE_TO = null;
		l_w_OD_TYP = null;
		l_w_OD_TYP_name = null;
		l_w_OD_TYP_val = null;
		l_OD_TYP = null;
		l_OUTSIDE_TYP = null;
		l_h_DEMAND_FLG = null;
		l_ODR_DM_QTY = null;
		l_h_ODR_DMD_TYP = null;
		l_w_STS_TYP = null;
		l_c_UN_CONNECT_DEMAND = null;
		l_DOWNLOAD_FILE = null;
		l_w_TIME_FROM = null;
		l_w_TIME_TO = null;
		l_s_MIN_CAL_DATE = null;
		l_s_MAX_CAL_DATE = null;
		l_s_PLANT_CD = null;
		l_s_OD_TYP = null;
		l_OD_TYP_name = null;
		l_OD_TYP_val = null;
		l_s_OUTSIDE_TYP = null;
		l_OUTSIDE_TYP_name = null;
		l_OUTSIDE_TYP_val = null;
		l_s_BUSINESS_DATE = null;
		l_s_UN_CONNECT_DEMAND = null;
		l_s_ODR_DMD_TYP1 = null;
		l_s_ODR_DMD_TYP2 = null;
		l_w_ODR_STS_TYP = null;
		l_w_DM_STS_TYP = null;
		l_ODR_STS_TYP_name = null;
		l_ODR_STS_TYP_val = null;
		l_DM_STS_TYP_name = null;
		l_DM_STS_TYP_val = null;
		l_h_OD_NO = null;
		l_h_PARENT_OD_NO = null;
		l_ITEM_CD = null;
		l_PRD_DUE_DATE = null;
		l_ODR_QTY = null;
		l_DM_QTY = null;
		l_EXTERNAL_PLAN_CD = null;
		l_ITEM_NAME = null;
		l_EX_MODIFY_COUNT = null;
		l_OD_MODIFY_COUNT = null;
		l_w_ITEM_CD = null;
		l_w_PLANT_CD = null;
		l_w_DATE_FROM_ALL = null;
		l_w_DATE_TO_ALL = null;
		l_PLANT_NAME = null;
		l_MODIFY_COUNT = null;
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
	 * medAC0080010クラスの標準コンストラクタ
	 */
	public AC0080010Struct()
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
	public void setStruct(AC0080010Struct struct)
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
	public void setStructM(AC0080010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setw_DATE_FROM(struct.getw_DATE_FROM());
			this.setw_DATE_TO(struct.getw_DATE_TO());
			this.setw_OD_TYP(struct.getw_OD_TYP());
			this.setw_OD_TYP_name(struct.getw_OD_TYP_name());
			this.setw_OD_TYP_val(struct.getw_OD_TYP_val());
			this.setOD_TYP(struct.getOD_TYP());
			this.setOUTSIDE_TYP(struct.getOUTSIDE_TYP());
			this.seth_DEMAND_FLG(struct.geth_DEMAND_FLG());
			this.setODR_DM_QTY(struct.getODR_DM_QTY());
			this.seth_ODR_DMD_TYP(struct.geth_ODR_DMD_TYP());
			this.setw_STS_TYP(struct.getw_STS_TYP());
			this.setc_UN_CONNECT_DEMAND(struct.getc_UN_CONNECT_DEMAND());
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setw_TIME_FROM(struct.getw_TIME_FROM());
			this.setw_TIME_TO(struct.getw_TIME_TO());
			this.sets_MIN_CAL_DATE(struct.gets_MIN_CAL_DATE());
			this.sets_MAX_CAL_DATE(struct.gets_MAX_CAL_DATE());
			this.sets_PLANT_CD(struct.gets_PLANT_CD());
			this.sets_OD_TYP(struct.gets_OD_TYP());
			this.setOD_TYP_name(struct.getOD_TYP_name());
			this.setOD_TYP_val(struct.getOD_TYP_val());
			this.sets_OUTSIDE_TYP(struct.gets_OUTSIDE_TYP());
			this.setOUTSIDE_TYP_name(struct.getOUTSIDE_TYP_name());
			this.setOUTSIDE_TYP_val(struct.getOUTSIDE_TYP_val());
			this.sets_BUSINESS_DATE(struct.gets_BUSINESS_DATE());
			this.sets_UN_CONNECT_DEMAND(struct.gets_UN_CONNECT_DEMAND());
			this.sets_ODR_DMD_TYP1(struct.gets_ODR_DMD_TYP1());
			this.sets_ODR_DMD_TYP2(struct.gets_ODR_DMD_TYP2());
			this.setw_ODR_STS_TYP(struct.getw_ODR_STS_TYP());
			this.setw_DM_STS_TYP(struct.getw_DM_STS_TYP());
			this.setODR_STS_TYP_name(struct.getODR_STS_TYP_name());
			this.setODR_STS_TYP_val(struct.getODR_STS_TYP_val());
			this.setDM_STS_TYP_name(struct.getDM_STS_TYP_name());
			this.setDM_STS_TYP_val(struct.getDM_STS_TYP_val());
			this.seth_OD_NO(struct.geth_OD_NO());
			this.seth_PARENT_OD_NO(struct.geth_PARENT_OD_NO());
			this.setITEM_CD(struct.getITEM_CD());
			this.setPRD_DUE_DATE(struct.getPRD_DUE_DATE());
			this.setODR_QTY(struct.getODR_QTY());
			this.setDM_QTY(struct.getDM_QTY());
			this.setEXTERNAL_PLAN_CD(struct.getEXTERNAL_PLAN_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setEX_MODIFY_COUNT(struct.getEX_MODIFY_COUNT());
			this.setOD_MODIFY_COUNT(struct.getOD_MODIFY_COUNT());
			this.setw_ITEM_CD(struct.getw_ITEM_CD());
			this.setw_PLANT_CD(struct.getw_PLANT_CD());
			this.setw_DATE_FROM_ALL(struct.getw_DATE_FROM_ALL());
			this.setw_DATE_TO_ALL(struct.getw_DATE_TO_ALL());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
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
	public void setStructL(AC0080010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_w_DATE_FROM(struct.getList_w_DATE_FROM());
			this.setList_w_DATE_TO(struct.getList_w_DATE_TO());
			this.setList_w_OD_TYP(struct.getList_w_OD_TYP());
			this.setList_w_OD_TYP_name(struct.getList_w_OD_TYP_name());
			this.setList_w_OD_TYP_val(struct.getList_w_OD_TYP_val());
			this.setList_OD_TYP(struct.getList_OD_TYP());
			this.setList_OUTSIDE_TYP(struct.getList_OUTSIDE_TYP());
			this.setList_h_DEMAND_FLG(struct.getList_h_DEMAND_FLG());
			this.setList_ODR_DM_QTY(struct.getList_ODR_DM_QTY());
			this.setList_h_ODR_DMD_TYP(struct.getList_h_ODR_DMD_TYP());
			this.setList_w_STS_TYP(struct.getList_w_STS_TYP());
			this.setList_c_UN_CONNECT_DEMAND(struct.getList_c_UN_CONNECT_DEMAND());
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_w_TIME_FROM(struct.getList_w_TIME_FROM());
			this.setList_w_TIME_TO(struct.getList_w_TIME_TO());
			this.setList_s_MIN_CAL_DATE(struct.getList_s_MIN_CAL_DATE());
			this.setList_s_MAX_CAL_DATE(struct.getList_s_MAX_CAL_DATE());
			this.setList_s_PLANT_CD(struct.getList_s_PLANT_CD());
			this.setList_s_OD_TYP(struct.getList_s_OD_TYP());
			this.setList_OD_TYP_name(struct.getList_OD_TYP_name());
			this.setList_OD_TYP_val(struct.getList_OD_TYP_val());
			this.setList_s_OUTSIDE_TYP(struct.getList_s_OUTSIDE_TYP());
			this.setList_OUTSIDE_TYP_name(struct.getList_OUTSIDE_TYP_name());
			this.setList_OUTSIDE_TYP_val(struct.getList_OUTSIDE_TYP_val());
			this.setList_s_BUSINESS_DATE(struct.getList_s_BUSINESS_DATE());
			this.setList_s_UN_CONNECT_DEMAND(struct.getList_s_UN_CONNECT_DEMAND());
			this.setList_s_ODR_DMD_TYP1(struct.getList_s_ODR_DMD_TYP1());
			this.setList_s_ODR_DMD_TYP2(struct.getList_s_ODR_DMD_TYP2());
			this.setList_w_ODR_STS_TYP(struct.getList_w_ODR_STS_TYP());
			this.setList_w_DM_STS_TYP(struct.getList_w_DM_STS_TYP());
			this.setList_ODR_STS_TYP_name(struct.getList_ODR_STS_TYP_name());
			this.setList_ODR_STS_TYP_val(struct.getList_ODR_STS_TYP_val());
			this.setList_DM_STS_TYP_name(struct.getList_DM_STS_TYP_name());
			this.setList_DM_STS_TYP_val(struct.getList_DM_STS_TYP_val());
			this.setList_h_OD_NO(struct.getList_h_OD_NO());
			this.setList_h_PARENT_OD_NO(struct.getList_h_PARENT_OD_NO());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_PRD_DUE_DATE(struct.getList_PRD_DUE_DATE());
			this.setList_ODR_QTY(struct.getList_ODR_QTY());
			this.setList_DM_QTY(struct.getList_DM_QTY());
			this.setList_EXTERNAL_PLAN_CD(struct.getList_EXTERNAL_PLAN_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_EX_MODIFY_COUNT(struct.getList_EX_MODIFY_COUNT());
			this.setList_OD_MODIFY_COUNT(struct.getList_OD_MODIFY_COUNT());
			this.setList_w_ITEM_CD(struct.getList_w_ITEM_CD());
			this.setList_w_PLANT_CD(struct.getList_w_PLANT_CD());
			this.setList_w_DATE_FROM_ALL(struct.getList_w_DATE_FROM_ALL());
			this.setList_w_DATE_TO_ALL(struct.getList_w_DATE_TO_ALL());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
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

	// 第 3 変数初期値： i_w_OD_TYP


	final static String i_w_OD_TYP = null;

	// 第 4 変数初期値： i_w_OD_TYP_name


	final static String i_w_OD_TYP_name = null;

	// 第 5 変数初期値： i_w_OD_TYP_val


	final static String i_w_OD_TYP_val = null;

	// 第 6 変数初期値： i_OD_TYP


	final static String i_OD_TYP = null;

	// 第 7 変数初期値： i_OUTSIDE_TYP


	final static String i_OUTSIDE_TYP = null;

	// 第 8 変数初期値： i_h_DEMAND_FLG


	final static String i_h_DEMAND_FLG = null;

	// 第 9 変数初期値： i_ODR_DM_QTY


	final static String i_ODR_DM_QTY = null;

	// 第 10 変数初期値： i_h_ODR_DMD_TYP


	final static String i_h_ODR_DMD_TYP = null;

	// 第 11 変数初期値： i_w_STS_TYP


	final static String i_w_STS_TYP = null;

	// 第 12 変数初期値： i_c_UN_CONNECT_DEMAND


	final static String i_c_UN_CONNECT_DEMAND = null;

	// 第 13 変数初期値： i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// 第 14 変数初期値： i_w_TIME_FROM


	final static String i_w_TIME_FROM = null;

	// 第 15 変数初期値： i_w_TIME_TO


	final static String i_w_TIME_TO = null;

	// 第 16 変数初期値： i_s_MIN_CAL_DATE


	final static String i_s_MIN_CAL_DATE = null;

	// 第 17 変数初期値： i_s_MAX_CAL_DATE


	final static String i_s_MAX_CAL_DATE = null;

	// 第 18 変数初期値： i_s_PLANT_CD


	final static String i_s_PLANT_CD = null;

	// 第 19 変数初期値： i_s_OD_TYP


	final static String i_s_OD_TYP = null;

	// 第 20 変数初期値： i_OD_TYP_name


	final static String i_OD_TYP_name = null;

	// 第 21 変数初期値： i_OD_TYP_val


	final static String i_OD_TYP_val = null;

	// 第 22 変数初期値： i_s_OUTSIDE_TYP


	final static String i_s_OUTSIDE_TYP = null;

	// 第 23 変数初期値： i_OUTSIDE_TYP_name


	final static String i_OUTSIDE_TYP_name = null;

	// 第 24 変数初期値： i_OUTSIDE_TYP_val


	final static String i_OUTSIDE_TYP_val = null;

	// 第 25 変数初期値： i_s_BUSINESS_DATE


	final static String i_s_BUSINESS_DATE = null;

	// 第 26 変数初期値： i_s_UN_CONNECT_DEMAND


	final static String i_s_UN_CONNECT_DEMAND = null;

	// 第 27 変数初期値： i_s_ODR_DMD_TYP1


	final static String i_s_ODR_DMD_TYP1 = null;

	// 第 28 変数初期値： i_s_ODR_DMD_TYP2


	final static String i_s_ODR_DMD_TYP2 = null;

	// 第 29 変数初期値： i_w_ODR_STS_TYP


	final static String i_w_ODR_STS_TYP = null;

	// 第 30 変数初期値： i_w_DM_STS_TYP


	final static String i_w_DM_STS_TYP = null;

	// 第 31 変数初期値： i_ODR_STS_TYP_name


	final static String i_ODR_STS_TYP_name = null;

	// 第 32 変数初期値： i_ODR_STS_TYP_val


	final static String i_ODR_STS_TYP_val = null;

	// 第 33 変数初期値： i_DM_STS_TYP_name


	final static String i_DM_STS_TYP_name = null;

	// 第 34 変数初期値： i_DM_STS_TYP_val


	final static String i_DM_STS_TYP_val = null;

	// 第 35 変数初期値： i_h_OD_NO


	final static String i_h_OD_NO = null;

	// 第 36 変数初期値： i_h_PARENT_OD_NO


	final static String i_h_PARENT_OD_NO = null;

	// 第 37 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 38 変数初期値： i_PRD_DUE_DATE


	final static String i_PRD_DUE_DATE = null;

	// 第 39 変数初期値： i_ODR_QTY


	final static String i_ODR_QTY = null;

	// 第 40 変数初期値： i_DM_QTY


	final static String i_DM_QTY = null;

	// 第 41 変数初期値： i_EXTERNAL_PLAN_CD


	final static String i_EXTERNAL_PLAN_CD = null;

	// 第 42 変数初期値： i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// 第 43 変数初期値： i_EX_MODIFY_COUNT


	final static String i_EX_MODIFY_COUNT = null;

	// 第 44 変数初期値： i_OD_MODIFY_COUNT


	final static String i_OD_MODIFY_COUNT = null;

	// 第 45 変数初期値： i_w_ITEM_CD


	final static String i_w_ITEM_CD = null;

	// 第 46 変数初期値： i_w_PLANT_CD


	final static String i_w_PLANT_CD = null;

	// 第 47 変数初期値： i_w_DATE_FROM_ALL


	final static String i_w_DATE_FROM_ALL = null;

	// 第 48 変数初期値： i_w_DATE_TO_ALL


	final static String i_w_DATE_TO_ALL = null;

	// 第 49 変数初期値： i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// 第 50 変数初期値： i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// 第 51 変数初期値： i_TIME_CTRL


	final static String i_TIME_CTRL = null;

	// 第 52 変数初期値： i_l_COUNT


	final static String i_l_COUNT = null;

	// 第 53 変数初期値： i_ROW_COUNT


	final static String i_ROW_COUNT = null;

*/

	//{{user_implement_code
           //---------------------------------------------------------------------
       
        /**
         * 初期化
         */
        public void init()
        {
         m_w_OD_TYP = new String("1");
         m_h_ODR_DMD_TYP = new String("1");
         m_h_DEMAND_FLG = new String("0");
        }
       
        /**	
         * 直持ち変数のコピー	
         * @param s コピー元	
         */	
        public void copy(AC0080010Struct s)	
        {	
         clear();
         if(s.sUser_ID != null) sUser_ID = new String(s.sUser_ID);
         if(s.sSysdate != null) sSysdate = new String(s.sSysdate);
         if(s.m_h_OD_NO != null) m_h_OD_NO = new String(s.m_h_OD_NO);
         if(s.m_h_PARENT_OD_NO != null) m_h_PARENT_OD_NO = new String(s.m_h_PARENT_OD_NO);
         if(s.m_ITEM_CD != null) m_ITEM_CD = new String(s.m_ITEM_CD);
         if(s.m_PRD_DUE_DATE != null) m_PRD_DUE_DATE = new String(s.m_PRD_DUE_DATE);
         if(s.m_ODR_QTY != null) m_ODR_QTY = new String(s.m_ODR_QTY);
         if(s.m_DM_QTY != null) m_DM_QTY = new String(s.m_DM_QTY);
         if(s.m_s_OD_TYP != null) m_s_OD_TYP = new String(s.m_s_OD_TYP);
         if(s.m_s_OUTSIDE_TYP != null) m_s_OUTSIDE_TYP = new String(s.m_s_OUTSIDE_TYP);
         if(s.m_w_ODR_STS_TYP != null) m_w_ODR_STS_TYP = new String(s.m_w_ODR_STS_TYP);
         if(s.m_w_DM_STS_TYP != null) m_w_DM_STS_TYP = new String(s.m_w_DM_STS_TYP);
         if(s.m_EXTERNAL_PLAN_CD != null) m_EXTERNAL_PLAN_CD = new String(s.m_EXTERNAL_PLAN_CD);
         if(s.m_ITEM_NAME != null) m_ITEM_NAME = new String(s.m_ITEM_NAME);
         if(s.m_w_ITEM_CD != null) m_w_ITEM_CD = new String(s.m_w_ITEM_CD);
         if(s.m_w_PLANT_CD != null) m_w_PLANT_CD = new String(s.m_w_PLANT_CD);
         if(s.m_s_ODR_DMD_TYP1 != null) m_s_ODR_DMD_TYP1 = new String(s.m_s_ODR_DMD_TYP1);
         if(s.m_s_ODR_DMD_TYP2 != null) m_s_ODR_DMD_TYP2 = new String(s.m_s_ODR_DMD_TYP2);
         if(s.m_w_DATE_FROM != null) m_w_DATE_FROM = new String(s.m_w_DATE_FROM);
         if(s.m_w_DATE_TO != null) m_w_DATE_TO = new String(s.m_w_DATE_TO);
         if(s.m_s_UN_CONNECT_DEMAND != null) m_s_UN_CONNECT_DEMAND = new String(s.m_s_UN_CONNECT_DEMAND);
         if(s.m_EX_MODIFY_COUNT != null) m_EX_MODIFY_COUNT = new String(s.m_EX_MODIFY_COUNT);
         if(s.m_OD_MODIFY_COUNT != null) m_OD_MODIFY_COUNT = new String(s.m_OD_MODIFY_COUNT);
         if(s.m_s_PLANT_CD != null) m_s_PLANT_CD = new String(s.m_s_PLANT_CD);
         if(s.m_PLANT_NAME != null) m_PLANT_NAME = new String(s.m_PLANT_NAME);
         if(s.m_s_MIN_CAL_DATE != null) m_s_MIN_CAL_DATE = new String(s.m_s_MIN_CAL_DATE);
         if(s.m_s_MAX_CAL_DATE != null) m_s_MAX_CAL_DATE = new String(s.m_s_MAX_CAL_DATE);
         if(s.m_s_BUSINESS_DATE != null) m_s_BUSINESS_DATE = new String(s.m_s_BUSINESS_DATE);
         if(s.m_MODIFY_COUNT != null) m_MODIFY_COUNT = new String(s.m_MODIFY_COUNT);
         if(s.m_w_OD_TYP != null) m_w_OD_TYP = new String(s.m_w_OD_TYP);
         if(s.m_w_OD_TYP_name != null) m_w_OD_TYP_name = new String(s.m_w_OD_TYP_name);
         if(s.m_w_OD_TYP_val != null) m_w_OD_TYP_val = new String(s.m_w_OD_TYP_val);
         if(s.m_OD_TYP != null) m_OD_TYP = new String(s.m_OD_TYP);
         if(s.m_OUTSIDE_TYP != null) m_OUTSIDE_TYP = new String(s.m_OUTSIDE_TYP);
         if(s.m_h_DEMAND_FLG != null) m_h_DEMAND_FLG = new String(s.m_h_DEMAND_FLG);
         if(s.m_ODR_DM_QTY != null) m_ODR_DM_QTY = new String(s.m_ODR_DM_QTY);
         if(s.m_h_ODR_DMD_TYP != null) m_h_ODR_DMD_TYP = new String(s.m_h_ODR_DMD_TYP);
         if(s.m_w_STS_TYP != null) m_w_STS_TYP = new String(s.m_w_STS_TYP);
         if(s.m_c_UN_CONNECT_DEMAND != null) m_c_UN_CONNECT_DEMAND = new String(s.m_c_UN_CONNECT_DEMAND);
         if(s.m_DOWNLOAD_FILE != null) m_DOWNLOAD_FILE = new String(s.m_DOWNLOAD_FILE);
         if(s.m_OD_TYP_name != null) m_OD_TYP_name = new String(s.m_OD_TYP_name);
         if(s.m_OD_TYP_val != null) m_OD_TYP_val = new String(s.m_OD_TYP_val);
         if(s.m_OUTSIDE_TYP_name != null) m_OUTSIDE_TYP_name = new String(s.m_OUTSIDE_TYP_name);
         if(s.m_OUTSIDE_TYP_val != null) m_OUTSIDE_TYP_val = new String(s.m_OUTSIDE_TYP_val);
         if(s.m_ODR_STS_TYP_name != null) m_ODR_STS_TYP_name = new String(s.m_ODR_STS_TYP_name);
         if(s.m_ODR_STS_TYP_val != null) m_ODR_STS_TYP_val = new String(s.m_ODR_STS_TYP_val);
         if(s.m_DM_STS_TYP_name != null) m_DM_STS_TYP_name = new String(s.m_DM_STS_TYP_name);
         if(s.m_DM_STS_TYP_val != null) m_DM_STS_TYP_val = new String(s.m_DM_STS_TYP_val);
        }	
       
        /**	
         * 引数の情報の保持するリストの変数から指定の順のデータを取得	
         * @param in リスト保持の情報	
         * @param index 順番	
         */	
        public void importData(AC0080010Struct in, int index)	
        {	
         clear();
         if(in.l_h_OD_NO != null && in.l_h_OD_NO.size() > index)  m_h_OD_NO = (String)(in.l_h_OD_NO.get(index));
         if(in.l_h_PARENT_OD_NO != null && in.l_h_PARENT_OD_NO.size() > index)  m_h_PARENT_OD_NO = (String)(in.l_h_PARENT_OD_NO.get(index));
         if(in.l_ITEM_CD != null && in.l_ITEM_CD.size() > index)  m_ITEM_CD = (String)(in.l_ITEM_CD.get(index));
         if(in.l_PRD_DUE_DATE != null && in.l_PRD_DUE_DATE.size() > index)  m_PRD_DUE_DATE = (String)(in.l_PRD_DUE_DATE.get(index));
         if(in.l_ODR_QTY != null && in.l_ODR_QTY.size() > index)  m_ODR_QTY = (String)(in.l_ODR_QTY.get(index));
         if(in.l_DM_QTY != null && in.l_DM_QTY.size() > index)  m_DM_QTY = (String)(in.l_DM_QTY.get(index));
         if(in.l_s_OD_TYP != null && in.l_s_OD_TYP.size() > index)  m_s_OD_TYP = (String)(in.l_s_OD_TYP.get(index));
         if(in.l_s_OUTSIDE_TYP != null && in.l_s_OUTSIDE_TYP.size() > index)  m_s_OUTSIDE_TYP = (String)(in.l_s_OUTSIDE_TYP.get(index));
         if(in.l_w_ODR_STS_TYP != null && in.l_w_ODR_STS_TYP.size() > index)  m_w_ODR_STS_TYP = (String)(in.l_w_ODR_STS_TYP.get(index));
         if(in.l_w_DM_STS_TYP != null && in.l_w_DM_STS_TYP.size() > index)  m_w_DM_STS_TYP = (String)(in.l_w_DM_STS_TYP.get(index));
         if(in.l_EXTERNAL_PLAN_CD != null && in.l_EXTERNAL_PLAN_CD.size() > index)  m_EXTERNAL_PLAN_CD = (String)(in.l_EXTERNAL_PLAN_CD.get(index));
         if(in.l_ITEM_NAME != null && in.l_ITEM_NAME.size() > index)  m_ITEM_NAME = (String)(in.l_ITEM_NAME.get(index));
         if(in.l_w_ITEM_CD != null && in.l_w_ITEM_CD.size() > index)  m_w_ITEM_CD = (String)(in.l_w_ITEM_CD.get(index));
         if(in.l_w_PLANT_CD != null && in.l_w_PLANT_CD.size() > index)  m_w_PLANT_CD = (String)(in.l_w_PLANT_CD.get(index));
         if(in.l_s_ODR_DMD_TYP1 != null && in.l_s_ODR_DMD_TYP1.size() > index)  m_s_ODR_DMD_TYP1 = (String)(in.l_s_ODR_DMD_TYP1.get(index));
         if(in.l_s_ODR_DMD_TYP2 != null && in.l_s_ODR_DMD_TYP2.size() > index)  m_s_ODR_DMD_TYP2 = (String)(in.l_s_ODR_DMD_TYP2.get(index));
         if(in.l_w_DATE_FROM != null && in.l_w_DATE_FROM.size() > index)  m_w_DATE_FROM = (String)(in.l_w_DATE_FROM.get(index));
         if(in.l_w_DATE_TO != null && in.l_w_DATE_TO.size() > index)  m_w_DATE_TO = (String)(in.l_w_DATE_TO.get(index));
         if(in.l_s_UN_CONNECT_DEMAND != null && in.l_s_UN_CONNECT_DEMAND.size() > index)  m_s_UN_CONNECT_DEMAND = (String)(in.l_s_UN_CONNECT_DEMAND.get(index));
         if(in.l_EX_MODIFY_COUNT != null && in.l_EX_MODIFY_COUNT.size() > index)  m_EX_MODIFY_COUNT = (String)(in.l_EX_MODIFY_COUNT.get(index));
         if(in.l_OD_MODIFY_COUNT != null && in.l_OD_MODIFY_COUNT.size() > index)  m_OD_MODIFY_COUNT = (String)(in.l_OD_MODIFY_COUNT.get(index));
         if(in.l_s_PLANT_CD != null && in.l_s_PLANT_CD.size() > index)  m_s_PLANT_CD = (String)(in.l_s_PLANT_CD.get(index));
         if(in.l_PLANT_NAME != null && in.l_PLANT_NAME.size() > index)  m_PLANT_NAME = (String)(in.l_PLANT_NAME.get(index));
         if(in.l_s_MIN_CAL_DATE != null && in.l_s_MIN_CAL_DATE.size() > index)  m_s_MIN_CAL_DATE = (String)(in.l_s_MIN_CAL_DATE.get(index));
         if(in.l_s_MAX_CAL_DATE != null && in.l_s_MAX_CAL_DATE.size() > index)  m_s_MAX_CAL_DATE = (String)(in.l_s_MAX_CAL_DATE.get(index));
         if(in.l_s_BUSINESS_DATE != null && in.l_s_BUSINESS_DATE.size() > index)  m_s_BUSINESS_DATE = (String)(in.l_s_BUSINESS_DATE.get(index));
         if(in.l_MODIFY_COUNT != null && in.l_MODIFY_COUNT.size() > index)  m_MODIFY_COUNT = (String)(in.l_MODIFY_COUNT.get(index));
         if(in.l_w_OD_TYP != null && in.l_w_OD_TYP.size() > index)  m_w_OD_TYP = (String)(in.l_w_OD_TYP.get(index));
         if(in.l_w_OD_TYP_name != null && in.l_w_OD_TYP_name.size() > index)  m_w_OD_TYP_name = (String)(in.l_w_OD_TYP_name.get(index));
         if(in.l_w_OD_TYP_val != null && in.l_w_OD_TYP_val.size() > index)  m_w_OD_TYP_val = (String)(in.l_w_OD_TYP_val.get(index));
         if(in.l_OD_TYP != null && in.l_OD_TYP.size() > index)  m_OD_TYP = (String)(in.l_OD_TYP.get(index));
         if(in.l_OUTSIDE_TYP != null && in.l_OUTSIDE_TYP.size() > index)  m_OUTSIDE_TYP = (String)(in.l_OUTSIDE_TYP.get(index));
         if(in.l_h_DEMAND_FLG != null && in.l_h_DEMAND_FLG.size() > index)  m_h_DEMAND_FLG = (String)(in.l_h_DEMAND_FLG.get(index));
         if(in.l_ODR_DM_QTY != null && in.l_ODR_DM_QTY.size() > index)  m_ODR_DM_QTY = (String)(in.l_ODR_DM_QTY.get(index));
         if(in.l_h_ODR_DMD_TYP != null && in.l_h_ODR_DMD_TYP.size() > index)  m_h_ODR_DMD_TYP = (String)(in.l_h_ODR_DMD_TYP.get(index));
         if(in.l_w_STS_TYP != null && in.l_w_STS_TYP.size() > index)  m_w_STS_TYP = (String)(in.l_w_STS_TYP.get(index));
         if(in.l_c_UN_CONNECT_DEMAND != null && in.l_c_UN_CONNECT_DEMAND.size() > index)  m_c_UN_CONNECT_DEMAND = (String)(in.l_c_UN_CONNECT_DEMAND.get(index));
         if(in.l_DOWNLOAD_FILE != null && in.l_DOWNLOAD_FILE.size() > index)  m_DOWNLOAD_FILE = (String)(in.l_DOWNLOAD_FILE.get(index));
         if(in.l_OD_TYP_name != null && in.l_OD_TYP_name.size() > index)  m_OD_TYP_name = (String)(in.l_OD_TYP_name.get(index));
         if(in.l_OD_TYP_val != null && in.l_OD_TYP_val.size() > index)  m_OD_TYP_val = (String)(in.l_OD_TYP_val.get(index));
         if(in.l_OUTSIDE_TYP_name != null && in.l_OUTSIDE_TYP_name.size() > index)  m_OUTSIDE_TYP_name = (String)(in.l_OUTSIDE_TYP_name.get(index));
         if(in.l_OUTSIDE_TYP_val != null && in.l_OUTSIDE_TYP_val.size() > index)  m_OUTSIDE_TYP_val = (String)(in.l_OUTSIDE_TYP_val.get(index));
         if(in.l_ODR_STS_TYP_name != null && in.l_ODR_STS_TYP_name.size() > index)  m_ODR_STS_TYP_name = (String)(in.l_ODR_STS_TYP_name.get(index));
         if(in.l_ODR_STS_TYP_val != null && in.l_ODR_STS_TYP_val.size() > index)  m_ODR_STS_TYP_val = (String)(in.l_ODR_STS_TYP_val.get(index));
         if(in.l_DM_STS_TYP_name != null && in.l_DM_STS_TYP_name.size() > index)  m_DM_STS_TYP_name = (String)(in.l_DM_STS_TYP_name.get(index));
         if(in.l_DM_STS_TYP_val != null && in.l_DM_STS_TYP_val.size() > index)  m_DM_STS_TYP_val = (String)(in.l_DM_STS_TYP_val.get(index));
         return;
        }	
       
         
         /**
          * コピーコンストラクタ
          * @param struct コピー対象
          */
          public AC0080010Struct(AC0080010Struct struct)
          {
            copy(struct);
          }
       
        //---------------------------------------------------------------------
        //}}user_implement_code

	//////////////////////////////

}
