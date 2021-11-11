/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AG0010/src/com/nec/jp/orteus/metamorBase/AG0010/AG0010010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AG0010;

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

public class AG0010010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_w_ITEM_STOCK_QTY_OUTSIDE_MRP */
	public String m_w_ITEM_STOCK_QTY_OUTSIDE_MRP = null;
	/** 第 2 変数： m_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP */
	public String m_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP = null;
	/** 第 3 変数： m_w_TOTAL_STOCK_QTY */
	public String m_w_TOTAL_STOCK_QTY = null;
	/** 第 4 変数： m_w_TOTAL_STOCK_QTY_LAST_DAY */
	public String m_w_TOTAL_STOCK_QTY_LAST_DAY = null;
	/** 第 5 変数： m_w_TOTAL_STOCK_QTY_LAST_MONTH */
	public String m_w_TOTAL_STOCK_QTY_LAST_MONTH = null;
	/** 第 6 変数： m_MRP_ODR_NAME */
	public String m_MRP_ODR_NAME = null;
	/** 第 7 変数： m_MRP_NAME */
	public String m_MRP_NAME = null;
	/** 第 8 変数： m_h_lotCtrl */
	public String m_h_lotCtrl = null;
	/** 第 9 変数： m_h_lotFlg */
	public String m_h_lotFlg = null;
	/** 第 10 変数： m_h_screenflg */
	public String m_h_screenflg = null;
	/** 第 11 変数： m_w_PLANT_NAME */
	public String m_w_PLANT_NAME = null;
	/** 第 12 変数： m_s_PLANT_CD */
	public String m_s_PLANT_CD = null;
	/** 第 13 変数： m_MRP_ODR_TYP_val */
	public String m_MRP_ODR_TYP_val = null;
	/** 第 14 変数： m_MRP_ODR_TYP_name */
	public String m_MRP_ODR_TYP_name = null;
	/** 第 15 変数： m_MRP_FLG_val */
	public String m_MRP_FLG_val = null;
	/** 第 16 変数： m_MRP_FLG_name */
	public String m_MRP_FLG_name = null;
	/** 第 17 変数： m_w_ITEM_NAME */
	public String m_w_ITEM_NAME = null;
	/** 第 18 変数： m_DRAW_CD */
	public String m_DRAW_CD = null;
	/** 第 19 変数： m_SPEC */
	public String m_SPEC = null;
	/** 第 20 変数： m_MRP_ODR_TYP */
	public String m_MRP_ODR_TYP = null;
	/** 第 21 変数： m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** 第 22 変数： m_LOT_CTRL_FLG */
	public String m_LOT_CTRL_FLG = null;
	/** 第 23 変数： m_w_ITEM_CD */
	public String m_w_ITEM_CD = null;
	/** 第 24 変数： m_w_PLANT_CD */
	public String m_w_PLANT_CD = null;
	/** 第 25 変数： m_w_ITEM_STOCK_QTY */
	public String m_w_ITEM_STOCK_QTY = null;
	/** 第 26 変数： m_w_ITEM_DEFECT_QTY */
	public String m_w_ITEM_DEFECT_QTY = null;
	/** 第 27 変数： m_w_ITEM_STOCK_QTY_LAST_DAY */
	public String m_w_ITEM_STOCK_QTY_LAST_DAY = null;
	/** 第 28 変数： m_w_ITEM_STOCK_QTY_LAST_MONTH */
	public String m_w_ITEM_STOCK_QTY_LAST_MONTH = null;
	/** 第 29 変数： m_w_JOB_ODR_STOCK_QTY */
	public String m_w_JOB_ODR_STOCK_QTY = null;
	/** 第 30 変数： m_w_JOB_ODR_STOCK_QTY_LAST_DAY */
	public String m_w_JOB_ODR_STOCK_QTY_LAST_DAY = null;
	/** 第 31 変数： m_w_JOB_ODR_STOCK_QTY_LAST_MONTH */
	public String m_w_JOB_ODR_STOCK_QTY_LAST_MONTH = null;
	/** 第 32 変数： m_MRP_FLG */
	public Integer m_MRP_FLG = null;
	/** 第 33 変数： m_w_ITEM_STOCK_QTY_FOR_MRP */
	public String m_w_ITEM_STOCK_QTY_FOR_MRP = null;
	/** 第 34 変数： m_w_JOB_ODR_STOCK_QTY_FOR_MRP */
	public String m_w_JOB_ODR_STOCK_QTY_FOR_MRP = null;
	/** 第 35 変数： m_w_WH_CD */
	public String m_w_WH_CD = null;
	/** 第 36 変数： m_w_STOCK_ON_HAND_QTY */
	public String m_w_STOCK_ON_HAND_QTY = null;
	/** 第 37 変数： m_w_DEFECT_QTY */
	public String m_w_DEFECT_QTY = null;
	/** 第 38 変数： m_w_PRVS_DAYEND_STOCK_QTY */
	public String m_w_PRVS_DAYEND_STOCK_QTY = null;
	/** 第 39 変数： m_w_PRVS_MONTHEND_STOCK_QTY */
	public String m_w_PRVS_MONTHEND_STOCK_QTY = null;
	/** 第 40 変数： m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** 第 41 変数： m_WH_NAME */
	public String m_WH_NAME = null;
	/** 第 42 変数： m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** 第 43 変数： m_s2_PLANT_CD */
	public String m_s2_PLANT_CD = null;
	/** 第 44 変数： m_l_PLANT_NAME */
	public String m_l_PLANT_NAME = null;
	/** 第 45 変数： m_l_LOT_NO */
	public String m_l_LOT_NO = null;
	/** 第 46 変数： m_l_STOCK_ON_HAND_QTY */
	public String m_l_STOCK_ON_HAND_QTY = null;
	/** 第 47 変数： m_l_ALCD_QTY */
	public String m_l_ALCD_QTY = null;
	/** 第 48 変数： m_l_EXPIRATION_DATE */
	public String m_l_EXPIRATION_DATE = null;
	/** 第 49 変数： m_l_PRD_CMPLT_DATE */
	public String m_l_PRD_CMPLT_DATE = null;
	/** 第 50 変数： m_l_COUNT */
	public String m_l_COUNT = null;
	/** 第 51 変数： m_ROW_COUNT */
	public String m_ROW_COUNT = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_w_ITEM_STOCK_QTY_OUTSIDE_MRP */
	public List l_w_ITEM_STOCK_QTY_OUTSIDE_MRP = null;

	/** 第 2 List変数： l_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP */
	public List l_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP = null;

	/** 第 3 List変数： l_w_TOTAL_STOCK_QTY */
	public List l_w_TOTAL_STOCK_QTY = null;

	/** 第 4 List変数： l_w_TOTAL_STOCK_QTY_LAST_DAY */
	public List l_w_TOTAL_STOCK_QTY_LAST_DAY = null;

	/** 第 5 List変数： l_w_TOTAL_STOCK_QTY_LAST_MONTH */
	public List l_w_TOTAL_STOCK_QTY_LAST_MONTH = null;

	/** 第 6 List変数： l_MRP_ODR_NAME */
	public List l_MRP_ODR_NAME = null;

	/** 第 7 List変数： l_MRP_NAME */
	public List l_MRP_NAME = null;

	/** 第 8 List変数： l_h_lotCtrl */
	public List l_h_lotCtrl = null;

	/** 第 9 List変数： l_h_lotFlg */
	public List l_h_lotFlg = null;

	/** 第 10 List変数： l_h_screenflg */
	public List l_h_screenflg = null;

	/** 第 11 List変数： l_w_PLANT_NAME */
	public List l_w_PLANT_NAME = null;

	/** 第 12 List変数： l_s_PLANT_CD */
	public List l_s_PLANT_CD = null;

	/** 第 13 List変数： l_MRP_ODR_TYP_val */
	public List l_MRP_ODR_TYP_val = null;

	/** 第 14 List変数： l_MRP_ODR_TYP_name */
	public List l_MRP_ODR_TYP_name = null;

	/** 第 15 List変数： l_MRP_FLG_val */
	public List l_MRP_FLG_val = null;

	/** 第 16 List変数： l_MRP_FLG_name */
	public List l_MRP_FLG_name = null;

	/** 第 17 List変数： l_w_ITEM_NAME */
	public List l_w_ITEM_NAME = null;

	/** 第 18 List変数： l_DRAW_CD */
	public List l_DRAW_CD = null;

	/** 第 19 List変数： l_SPEC */
	public List l_SPEC = null;

	/** 第 20 List変数： l_MRP_ODR_TYP */
	public List l_MRP_ODR_TYP = null;

	/** 第 21 List変数： l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** 第 22 List変数： l_LOT_CTRL_FLG */
	public List l_LOT_CTRL_FLG = null;

	/** 第 23 List変数： l_w_ITEM_CD */
	public List l_w_ITEM_CD = null;

	/** 第 24 List変数： l_w_PLANT_CD */
	public List l_w_PLANT_CD = null;

	/** 第 25 List変数： l_w_ITEM_STOCK_QTY */
	public List l_w_ITEM_STOCK_QTY = null;

	/** 第 26 List変数： l_w_ITEM_DEFECT_QTY */
	public List l_w_ITEM_DEFECT_QTY = null;

	/** 第 27 List変数： l_w_ITEM_STOCK_QTY_LAST_DAY */
	public List l_w_ITEM_STOCK_QTY_LAST_DAY = null;

	/** 第 28 List変数： l_w_ITEM_STOCK_QTY_LAST_MONTH */
	public List l_w_ITEM_STOCK_QTY_LAST_MONTH = null;

	/** 第 29 List変数： l_w_JOB_ODR_STOCK_QTY */
	public List l_w_JOB_ODR_STOCK_QTY = null;

	/** 第 30 List変数： l_w_JOB_ODR_STOCK_QTY_LAST_DAY */
	public List l_w_JOB_ODR_STOCK_QTY_LAST_DAY = null;

	/** 第 31 List変数： l_w_JOB_ODR_STOCK_QTY_LAST_MONTH */
	public List l_w_JOB_ODR_STOCK_QTY_LAST_MONTH = null;

	/** 第 32 List変数： l_MRP_FLG */
	public List l_MRP_FLG = null;

	/** 第 33 List変数： l_w_ITEM_STOCK_QTY_FOR_MRP */
	public List l_w_ITEM_STOCK_QTY_FOR_MRP = null;

	/** 第 34 List変数： l_w_JOB_ODR_STOCK_QTY_FOR_MRP */
	public List l_w_JOB_ODR_STOCK_QTY_FOR_MRP = null;

	/** 第 35 List変数： l_w_WH_CD */
	public List l_w_WH_CD = null;

	/** 第 36 List変数： l_w_STOCK_ON_HAND_QTY */
	public List l_w_STOCK_ON_HAND_QTY = null;

	/** 第 37 List変数： l_w_DEFECT_QTY */
	public List l_w_DEFECT_QTY = null;

	/** 第 38 List変数： l_w_PRVS_DAYEND_STOCK_QTY */
	public List l_w_PRVS_DAYEND_STOCK_QTY = null;

	/** 第 39 List変数： l_w_PRVS_MONTHEND_STOCK_QTY */
	public List l_w_PRVS_MONTHEND_STOCK_QTY = null;

	/** 第 40 List変数： l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** 第 41 List変数： l_WH_NAME */
	public List l_WH_NAME = null;

	/** 第 42 List変数： l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** 第 43 List変数： l_s2_PLANT_CD */
	public List l_s2_PLANT_CD = null;

	/** 第 44 List変数： l_l_PLANT_NAME */
	public List l_l_PLANT_NAME = null;

	/** 第 45 List変数： l_l_LOT_NO */
	public List l_l_LOT_NO = null;

	/** 第 46 List変数： l_l_STOCK_ON_HAND_QTY */
	public List l_l_STOCK_ON_HAND_QTY = null;

	/** 第 47 List変数： l_l_ALCD_QTY */
	public List l_l_ALCD_QTY = null;

	/** 第 48 List変数： l_l_EXPIRATION_DATE */
	public List l_l_EXPIRATION_DATE = null;

	/** 第 49 List変数： l_l_PRD_CMPLT_DATE */
	public List l_l_PRD_CMPLT_DATE = null;

	/** 第 50 List変数： l_l_COUNT */
	public List l_l_COUNT = null;

	/** 第 51 List変数： l_ROW_COUNT */
	public List l_ROW_COUNT = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getw_ITEM_STOCK_QTY_OUTSIDE_MRP() { return m_w_ITEM_STOCK_QTY_OUTSIDE_MRP; }
	public String getw_JOB_ODR_STOCK_QTY_OUTSIDE_MRP() { return m_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP; }
	public String getw_TOTAL_STOCK_QTY() { return m_w_TOTAL_STOCK_QTY; }
	public String getw_TOTAL_STOCK_QTY_LAST_DAY() { return m_w_TOTAL_STOCK_QTY_LAST_DAY; }
	public String getw_TOTAL_STOCK_QTY_LAST_MONTH() { return m_w_TOTAL_STOCK_QTY_LAST_MONTH; }
	public String getMRP_ODR_NAME() { return m_MRP_ODR_NAME; }
	public String getMRP_NAME() { return m_MRP_NAME; }
	public String geth_lotCtrl() { return m_h_lotCtrl; }
	public String geth_lotFlg() { return m_h_lotFlg; }
	public String geth_screenflg() { return m_h_screenflg; }
	public String getw_PLANT_NAME() { return m_w_PLANT_NAME; }
	public String gets_PLANT_CD() { return m_s_PLANT_CD; }
	public String getMRP_ODR_TYP_val() { return m_MRP_ODR_TYP_val; }
	public String getMRP_ODR_TYP_name() { return m_MRP_ODR_TYP_name; }
	public String getMRP_FLG_val() { return m_MRP_FLG_val; }
	public String getMRP_FLG_name() { return m_MRP_FLG_name; }
	public String getw_ITEM_NAME() { return m_w_ITEM_NAME; }
	public String getDRAW_CD() { return m_DRAW_CD; }
	public String getSPEC() { return m_SPEC; }
	public String getMRP_ODR_TYP() { return m_MRP_ODR_TYP; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getLOT_CTRL_FLG() { return m_LOT_CTRL_FLG; }
	public String getw_ITEM_CD() { return m_w_ITEM_CD; }
	public String getw_PLANT_CD() { return m_w_PLANT_CD; }
	public String getw_ITEM_STOCK_QTY() { return m_w_ITEM_STOCK_QTY; }
	public String getw_ITEM_DEFECT_QTY() { return m_w_ITEM_DEFECT_QTY; }
	public String getw_ITEM_STOCK_QTY_LAST_DAY() { return m_w_ITEM_STOCK_QTY_LAST_DAY; }
	public String getw_ITEM_STOCK_QTY_LAST_MONTH() { return m_w_ITEM_STOCK_QTY_LAST_MONTH; }
	public String getw_JOB_ODR_STOCK_QTY() { return m_w_JOB_ODR_STOCK_QTY; }
	public String getw_JOB_ODR_STOCK_QTY_LAST_DAY() { return m_w_JOB_ODR_STOCK_QTY_LAST_DAY; }
	public String getw_JOB_ODR_STOCK_QTY_LAST_MONTH() { return m_w_JOB_ODR_STOCK_QTY_LAST_MONTH; }
	public Integer getMRP_FLG() { return m_MRP_FLG; }
	public String getw_ITEM_STOCK_QTY_FOR_MRP() { return m_w_ITEM_STOCK_QTY_FOR_MRP; }
	public String getw_JOB_ODR_STOCK_QTY_FOR_MRP() { return m_w_JOB_ODR_STOCK_QTY_FOR_MRP; }
	public String getw_WH_CD() { return m_w_WH_CD; }
	public String getw_STOCK_ON_HAND_QTY() { return m_w_STOCK_ON_HAND_QTY; }
	public String getw_DEFECT_QTY() { return m_w_DEFECT_QTY; }
	public String getw_PRVS_DAYEND_STOCK_QTY() { return m_w_PRVS_DAYEND_STOCK_QTY; }
	public String getw_PRVS_MONTHEND_STOCK_QTY() { return m_w_PRVS_MONTHEND_STOCK_QTY; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getWH_NAME() { return m_WH_NAME; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String gets2_PLANT_CD() { return m_s2_PLANT_CD; }
	public String getl_PLANT_NAME() { return m_l_PLANT_NAME; }
	public String getl_LOT_NO() { return m_l_LOT_NO; }
	public String getl_STOCK_ON_HAND_QTY() { return m_l_STOCK_ON_HAND_QTY; }
	public String getl_ALCD_QTY() { return m_l_ALCD_QTY; }
	public String getl_EXPIRATION_DATE() { return m_l_EXPIRATION_DATE; }
	public String getl_PRD_CMPLT_DATE() { return m_l_PRD_CMPLT_DATE; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }

	public List getList_w_ITEM_STOCK_QTY_OUTSIDE_MRP() { return l_w_ITEM_STOCK_QTY_OUTSIDE_MRP; }
	public List getList_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP() { return l_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP; }
	public List getList_w_TOTAL_STOCK_QTY() { return l_w_TOTAL_STOCK_QTY; }
	public List getList_w_TOTAL_STOCK_QTY_LAST_DAY() { return l_w_TOTAL_STOCK_QTY_LAST_DAY; }
	public List getList_w_TOTAL_STOCK_QTY_LAST_MONTH() { return l_w_TOTAL_STOCK_QTY_LAST_MONTH; }
	public List getList_MRP_ODR_NAME() { return l_MRP_ODR_NAME; }
	public List getList_MRP_NAME() { return l_MRP_NAME; }
	public List getList_h_lotCtrl() { return l_h_lotCtrl; }
	public List getList_h_lotFlg() { return l_h_lotFlg; }
	public List getList_h_screenflg() { return l_h_screenflg; }
	public List getList_w_PLANT_NAME() { return l_w_PLANT_NAME; }
	public List getList_s_PLANT_CD() { return l_s_PLANT_CD; }
	public List getList_MRP_ODR_TYP_val() { return l_MRP_ODR_TYP_val; }
	public List getList_MRP_ODR_TYP_name() { return l_MRP_ODR_TYP_name; }
	public List getList_MRP_FLG_val() { return l_MRP_FLG_val; }
	public List getList_MRP_FLG_name() { return l_MRP_FLG_name; }
	public List getList_w_ITEM_NAME() { return l_w_ITEM_NAME; }
	public List getList_DRAW_CD() { return l_DRAW_CD; }
	public List getList_SPEC() { return l_SPEC; }
	public List getList_MRP_ODR_TYP() { return l_MRP_ODR_TYP; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_LOT_CTRL_FLG() { return l_LOT_CTRL_FLG; }
	public List getList_w_ITEM_CD() { return l_w_ITEM_CD; }
	public List getList_w_PLANT_CD() { return l_w_PLANT_CD; }
	public List getList_w_ITEM_STOCK_QTY() { return l_w_ITEM_STOCK_QTY; }
	public List getList_w_ITEM_DEFECT_QTY() { return l_w_ITEM_DEFECT_QTY; }
	public List getList_w_ITEM_STOCK_QTY_LAST_DAY() { return l_w_ITEM_STOCK_QTY_LAST_DAY; }
	public List getList_w_ITEM_STOCK_QTY_LAST_MONTH() { return l_w_ITEM_STOCK_QTY_LAST_MONTH; }
	public List getList_w_JOB_ODR_STOCK_QTY() { return l_w_JOB_ODR_STOCK_QTY; }
	public List getList_w_JOB_ODR_STOCK_QTY_LAST_DAY() { return l_w_JOB_ODR_STOCK_QTY_LAST_DAY; }
	public List getList_w_JOB_ODR_STOCK_QTY_LAST_MONTH() { return l_w_JOB_ODR_STOCK_QTY_LAST_MONTH; }
	public List getList_MRP_FLG() { return l_MRP_FLG; }
	public List getList_w_ITEM_STOCK_QTY_FOR_MRP() { return l_w_ITEM_STOCK_QTY_FOR_MRP; }
	public List getList_w_JOB_ODR_STOCK_QTY_FOR_MRP() { return l_w_JOB_ODR_STOCK_QTY_FOR_MRP; }
	public List getList_w_WH_CD() { return l_w_WH_CD; }
	public List getList_w_STOCK_ON_HAND_QTY() { return l_w_STOCK_ON_HAND_QTY; }
	public List getList_w_DEFECT_QTY() { return l_w_DEFECT_QTY; }
	public List getList_w_PRVS_DAYEND_STOCK_QTY() { return l_w_PRVS_DAYEND_STOCK_QTY; }
	public List getList_w_PRVS_MONTHEND_STOCK_QTY() { return l_w_PRVS_MONTHEND_STOCK_QTY; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_WH_NAME() { return l_WH_NAME; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_s2_PLANT_CD() { return l_s2_PLANT_CD; }
	public List getList_l_PLANT_NAME() { return l_l_PLANT_NAME; }
	public List getList_l_LOT_NO() { return l_l_LOT_NO; }
	public List getList_l_STOCK_ON_HAND_QTY() { return l_l_STOCK_ON_HAND_QTY; }
	public List getList_l_ALCD_QTY() { return l_l_ALCD_QTY; }
	public List getList_l_EXPIRATION_DATE() { return l_l_EXPIRATION_DATE; }
	public List getList_l_PRD_CMPLT_DATE() { return l_l_PRD_CMPLT_DATE; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }

	public void setw_ITEM_STOCK_QTY_OUTSIDE_MRP(String val) { m_w_ITEM_STOCK_QTY_OUTSIDE_MRP = val; }
	public void setw_JOB_ODR_STOCK_QTY_OUTSIDE_MRP(String val) { m_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP = val; }
	public void setw_TOTAL_STOCK_QTY(String val) { m_w_TOTAL_STOCK_QTY = val; }
	public void setw_TOTAL_STOCK_QTY_LAST_DAY(String val) { m_w_TOTAL_STOCK_QTY_LAST_DAY = val; }
	public void setw_TOTAL_STOCK_QTY_LAST_MONTH(String val) { m_w_TOTAL_STOCK_QTY_LAST_MONTH = val; }
	public void setMRP_ODR_NAME(String val) { m_MRP_ODR_NAME = val; }
	public void setMRP_NAME(String val) { m_MRP_NAME = val; }
	public void seth_lotCtrl(String val) { m_h_lotCtrl = val; }
	public void seth_lotFlg(String val) { m_h_lotFlg = val; }
	public void seth_screenflg(String val) { m_h_screenflg = val; }
	public void setw_PLANT_NAME(String val) { m_w_PLANT_NAME = val; }
	public void sets_PLANT_CD(String val) { m_s_PLANT_CD = val; }
	public void setMRP_ODR_TYP_val(String val) { m_MRP_ODR_TYP_val = val; }
	public void setMRP_ODR_TYP_name(String val) { m_MRP_ODR_TYP_name = val; }
	public void setMRP_FLG_val(String val) { m_MRP_FLG_val = val; }
	public void setMRP_FLG_name(String val) { m_MRP_FLG_name = val; }
	public void setw_ITEM_NAME(String val) { m_w_ITEM_NAME = val; }
	public void setDRAW_CD(String val) { m_DRAW_CD = val; }
	public void setSPEC(String val) { m_SPEC = val; }
	public void setMRP_ODR_TYP(String val) { m_MRP_ODR_TYP = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setLOT_CTRL_FLG(String val) { m_LOT_CTRL_FLG = val; }
	public void setw_ITEM_CD(String val) { m_w_ITEM_CD = val; }
	public void setw_PLANT_CD(String val) { m_w_PLANT_CD = val; }
	public void setw_ITEM_STOCK_QTY(String val) { m_w_ITEM_STOCK_QTY = val; }
	public void setw_ITEM_DEFECT_QTY(String val) { m_w_ITEM_DEFECT_QTY = val; }
	public void setw_ITEM_STOCK_QTY_LAST_DAY(String val) { m_w_ITEM_STOCK_QTY_LAST_DAY = val; }
	public void setw_ITEM_STOCK_QTY_LAST_MONTH(String val) { m_w_ITEM_STOCK_QTY_LAST_MONTH = val; }
	public void setw_JOB_ODR_STOCK_QTY(String val) { m_w_JOB_ODR_STOCK_QTY = val; }
	public void setw_JOB_ODR_STOCK_QTY_LAST_DAY(String val) { m_w_JOB_ODR_STOCK_QTY_LAST_DAY = val; }
	public void setw_JOB_ODR_STOCK_QTY_LAST_MONTH(String val) { m_w_JOB_ODR_STOCK_QTY_LAST_MONTH = val; }
	public void setMRP_FLG(Integer val) { m_MRP_FLG = val; }
	public void setw_ITEM_STOCK_QTY_FOR_MRP(String val) { m_w_ITEM_STOCK_QTY_FOR_MRP = val; }
	public void setw_JOB_ODR_STOCK_QTY_FOR_MRP(String val) { m_w_JOB_ODR_STOCK_QTY_FOR_MRP = val; }
	public void setw_WH_CD(String val) { m_w_WH_CD = val; }
	public void setw_STOCK_ON_HAND_QTY(String val) { m_w_STOCK_ON_HAND_QTY = val; }
	public void setw_DEFECT_QTY(String val) { m_w_DEFECT_QTY = val; }
	public void setw_PRVS_DAYEND_STOCK_QTY(String val) { m_w_PRVS_DAYEND_STOCK_QTY = val; }
	public void setw_PRVS_MONTHEND_STOCK_QTY(String val) { m_w_PRVS_MONTHEND_STOCK_QTY = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setWH_NAME(String val) { m_WH_NAME = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void sets2_PLANT_CD(String val) { m_s2_PLANT_CD = val; }
	public void setl_PLANT_NAME(String val) { m_l_PLANT_NAME = val; }
	public void setl_LOT_NO(String val) { m_l_LOT_NO = val; }
	public void setl_STOCK_ON_HAND_QTY(String val) { m_l_STOCK_ON_HAND_QTY = val; }
	public void setl_ALCD_QTY(String val) { m_l_ALCD_QTY = val; }
	public void setl_EXPIRATION_DATE(String val) { m_l_EXPIRATION_DATE = val; }
	public void setl_PRD_CMPLT_DATE(String val) { m_l_PRD_CMPLT_DATE = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }

	public void setMRP_FLG(String val) { m_MRP_FLG = getInteger(val); }

	public void setList_w_ITEM_STOCK_QTY_OUTSIDE_MRP(List list) { l_w_ITEM_STOCK_QTY_OUTSIDE_MRP = list; }
	public void setList_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP(List list) { l_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP = list; }
	public void setList_w_TOTAL_STOCK_QTY(List list) { l_w_TOTAL_STOCK_QTY = list; }
	public void setList_w_TOTAL_STOCK_QTY_LAST_DAY(List list) { l_w_TOTAL_STOCK_QTY_LAST_DAY = list; }
	public void setList_w_TOTAL_STOCK_QTY_LAST_MONTH(List list) { l_w_TOTAL_STOCK_QTY_LAST_MONTH = list; }
	public void setList_MRP_ODR_NAME(List list) { l_MRP_ODR_NAME = list; }
	public void setList_MRP_NAME(List list) { l_MRP_NAME = list; }
	public void setList_h_lotCtrl(List list) { l_h_lotCtrl = list; }
	public void setList_h_lotFlg(List list) { l_h_lotFlg = list; }
	public void setList_h_screenflg(List list) { l_h_screenflg = list; }
	public void setList_w_PLANT_NAME(List list) { l_w_PLANT_NAME = list; }
	public void setList_s_PLANT_CD(List list) { l_s_PLANT_CD = list; }
	public void setList_MRP_ODR_TYP_val(List list) { l_MRP_ODR_TYP_val = list; }
	public void setList_MRP_ODR_TYP_name(List list) { l_MRP_ODR_TYP_name = list; }
	public void setList_MRP_FLG_val(List list) { l_MRP_FLG_val = list; }
	public void setList_MRP_FLG_name(List list) { l_MRP_FLG_name = list; }
	public void setList_w_ITEM_NAME(List list) { l_w_ITEM_NAME = list; }
	public void setList_DRAW_CD(List list) { l_DRAW_CD = list; }
	public void setList_SPEC(List list) { l_SPEC = list; }
	public void setList_MRP_ODR_TYP(List list) { l_MRP_ODR_TYP = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_LOT_CTRL_FLG(List list) { l_LOT_CTRL_FLG = list; }
	public void setList_w_ITEM_CD(List list) { l_w_ITEM_CD = list; }
	public void setList_w_PLANT_CD(List list) { l_w_PLANT_CD = list; }
	public void setList_w_ITEM_STOCK_QTY(List list) { l_w_ITEM_STOCK_QTY = list; }
	public void setList_w_ITEM_DEFECT_QTY(List list) { l_w_ITEM_DEFECT_QTY = list; }
	public void setList_w_ITEM_STOCK_QTY_LAST_DAY(List list) { l_w_ITEM_STOCK_QTY_LAST_DAY = list; }
	public void setList_w_ITEM_STOCK_QTY_LAST_MONTH(List list) { l_w_ITEM_STOCK_QTY_LAST_MONTH = list; }
	public void setList_w_JOB_ODR_STOCK_QTY(List list) { l_w_JOB_ODR_STOCK_QTY = list; }
	public void setList_w_JOB_ODR_STOCK_QTY_LAST_DAY(List list) { l_w_JOB_ODR_STOCK_QTY_LAST_DAY = list; }
	public void setList_w_JOB_ODR_STOCK_QTY_LAST_MONTH(List list) { l_w_JOB_ODR_STOCK_QTY_LAST_MONTH = list; }
	public void setList_MRP_FLG(List list) { l_MRP_FLG = list; }
	public void setList_w_ITEM_STOCK_QTY_FOR_MRP(List list) { l_w_ITEM_STOCK_QTY_FOR_MRP = list; }
	public void setList_w_JOB_ODR_STOCK_QTY_FOR_MRP(List list) { l_w_JOB_ODR_STOCK_QTY_FOR_MRP = list; }
	public void setList_w_WH_CD(List list) { l_w_WH_CD = list; }
	public void setList_w_STOCK_ON_HAND_QTY(List list) { l_w_STOCK_ON_HAND_QTY = list; }
	public void setList_w_DEFECT_QTY(List list) { l_w_DEFECT_QTY = list; }
	public void setList_w_PRVS_DAYEND_STOCK_QTY(List list) { l_w_PRVS_DAYEND_STOCK_QTY = list; }
	public void setList_w_PRVS_MONTHEND_STOCK_QTY(List list) { l_w_PRVS_MONTHEND_STOCK_QTY = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_WH_NAME(List list) { l_WH_NAME = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_s2_PLANT_CD(List list) { l_s2_PLANT_CD = list; }
	public void setList_l_PLANT_NAME(List list) { l_l_PLANT_NAME = list; }
	public void setList_l_LOT_NO(List list) { l_l_LOT_NO = list; }
	public void setList_l_STOCK_ON_HAND_QTY(List list) { l_l_STOCK_ON_HAND_QTY = list; }
	public void setList_l_ALCD_QTY(List list) { l_l_ALCD_QTY = list; }
	public void setList_l_EXPIRATION_DATE(List list) { l_l_EXPIRATION_DATE = list; }
	public void setList_l_PRD_CMPLT_DATE(List list) { l_l_PRD_CMPLT_DATE = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }

	public int setL2L_w_ITEM_STOCK_QTY_OUTSIDE_MRP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_ITEM_STOCK_QTY_OUTSIDE_MRP == null) {
			l_w_ITEM_STOCK_QTY_OUTSIDE_MRP = new ArrayList();
		} else {
			l_w_ITEM_STOCK_QTY_OUTSIDE_MRP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_ITEM_STOCK_QTY_OUTSIDE_MRP.add(((AG0010010Struct) list.get(i)).getw_ITEM_STOCK_QTY_OUTSIDE_MRP());
		}
		return size;
	}
	public int setL2L_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP == null) {
			l_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP = new ArrayList();
		} else {
			l_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP.add(((AG0010010Struct) list.get(i)).getw_JOB_ODR_STOCK_QTY_OUTSIDE_MRP());
		}
		return size;
	}
	public int setL2L_w_TOTAL_STOCK_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_TOTAL_STOCK_QTY == null) {
			l_w_TOTAL_STOCK_QTY = new ArrayList();
		} else {
			l_w_TOTAL_STOCK_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_TOTAL_STOCK_QTY.add(((AG0010010Struct) list.get(i)).getw_TOTAL_STOCK_QTY());
		}
		return size;
	}
	public int setL2L_w_TOTAL_STOCK_QTY_LAST_DAY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_TOTAL_STOCK_QTY_LAST_DAY == null) {
			l_w_TOTAL_STOCK_QTY_LAST_DAY = new ArrayList();
		} else {
			l_w_TOTAL_STOCK_QTY_LAST_DAY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_TOTAL_STOCK_QTY_LAST_DAY.add(((AG0010010Struct) list.get(i)).getw_TOTAL_STOCK_QTY_LAST_DAY());
		}
		return size;
	}
	public int setL2L_w_TOTAL_STOCK_QTY_LAST_MONTH(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_TOTAL_STOCK_QTY_LAST_MONTH == null) {
			l_w_TOTAL_STOCK_QTY_LAST_MONTH = new ArrayList();
		} else {
			l_w_TOTAL_STOCK_QTY_LAST_MONTH.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_TOTAL_STOCK_QTY_LAST_MONTH.add(((AG0010010Struct) list.get(i)).getw_TOTAL_STOCK_QTY_LAST_MONTH());
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
			l_MRP_ODR_NAME.add(((AG0010010Struct) list.get(i)).getMRP_ODR_NAME());
		}
		return size;
	}
	public int setL2L_MRP_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_NAME == null) {
			l_MRP_NAME = new ArrayList();
		} else {
			l_MRP_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_NAME.add(((AG0010010Struct) list.get(i)).getMRP_NAME());
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
			l_h_lotCtrl.add(((AG0010010Struct) list.get(i)).geth_lotCtrl());
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
			l_h_lotFlg.add(((AG0010010Struct) list.get(i)).geth_lotFlg());
		}
		return size;
	}
	public int setL2L_h_screenflg(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_screenflg == null) {
			l_h_screenflg = new ArrayList();
		} else {
			l_h_screenflg.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_screenflg.add(((AG0010010Struct) list.get(i)).geth_screenflg());
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
			l_w_PLANT_NAME.add(((AG0010010Struct) list.get(i)).getw_PLANT_NAME());
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
			l_s_PLANT_CD.add(((AG0010010Struct) list.get(i)).gets_PLANT_CD());
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
			l_MRP_ODR_TYP_val.add(((AG0010010Struct) list.get(i)).getMRP_ODR_TYP_val());
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
			l_MRP_ODR_TYP_name.add(((AG0010010Struct) list.get(i)).getMRP_ODR_TYP_name());
		}
		return size;
	}
	public int setL2L_MRP_FLG_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_FLG_val == null) {
			l_MRP_FLG_val = new ArrayList();
		} else {
			l_MRP_FLG_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_FLG_val.add(((AG0010010Struct) list.get(i)).getMRP_FLG_val());
		}
		return size;
	}
	public int setL2L_MRP_FLG_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_FLG_name == null) {
			l_MRP_FLG_name = new ArrayList();
		} else {
			l_MRP_FLG_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_FLG_name.add(((AG0010010Struct) list.get(i)).getMRP_FLG_name());
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
			l_w_ITEM_NAME.add(((AG0010010Struct) list.get(i)).getw_ITEM_NAME());
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
			l_DRAW_CD.add(((AG0010010Struct) list.get(i)).getDRAW_CD());
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
			l_SPEC.add(((AG0010010Struct) list.get(i)).getSPEC());
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
			l_MRP_ODR_TYP.add(((AG0010010Struct) list.get(i)).getMRP_ODR_TYP());
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
			l_STOCK_UNIT.add(((AG0010010Struct) list.get(i)).getSTOCK_UNIT());
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
			l_LOT_CTRL_FLG.add(((AG0010010Struct) list.get(i)).getLOT_CTRL_FLG());
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
			l_w_ITEM_CD.add(((AG0010010Struct) list.get(i)).getw_ITEM_CD());
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
			l_w_PLANT_CD.add(((AG0010010Struct) list.get(i)).getw_PLANT_CD());
		}
		return size;
	}
	public int setL2L_w_ITEM_STOCK_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_ITEM_STOCK_QTY == null) {
			l_w_ITEM_STOCK_QTY = new ArrayList();
		} else {
			l_w_ITEM_STOCK_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_ITEM_STOCK_QTY.add(((AG0010010Struct) list.get(i)).getw_ITEM_STOCK_QTY());
		}
		return size;
	}
	public int setL2L_w_ITEM_DEFECT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_ITEM_DEFECT_QTY == null) {
			l_w_ITEM_DEFECT_QTY = new ArrayList();
		} else {
			l_w_ITEM_DEFECT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_ITEM_DEFECT_QTY.add(((AG0010010Struct) list.get(i)).getw_ITEM_DEFECT_QTY());
		}
		return size;
	}
	public int setL2L_w_ITEM_STOCK_QTY_LAST_DAY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_ITEM_STOCK_QTY_LAST_DAY == null) {
			l_w_ITEM_STOCK_QTY_LAST_DAY = new ArrayList();
		} else {
			l_w_ITEM_STOCK_QTY_LAST_DAY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_ITEM_STOCK_QTY_LAST_DAY.add(((AG0010010Struct) list.get(i)).getw_ITEM_STOCK_QTY_LAST_DAY());
		}
		return size;
	}
	public int setL2L_w_ITEM_STOCK_QTY_LAST_MONTH(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_ITEM_STOCK_QTY_LAST_MONTH == null) {
			l_w_ITEM_STOCK_QTY_LAST_MONTH = new ArrayList();
		} else {
			l_w_ITEM_STOCK_QTY_LAST_MONTH.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_ITEM_STOCK_QTY_LAST_MONTH.add(((AG0010010Struct) list.get(i)).getw_ITEM_STOCK_QTY_LAST_MONTH());
		}
		return size;
	}
	public int setL2L_w_JOB_ODR_STOCK_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_JOB_ODR_STOCK_QTY == null) {
			l_w_JOB_ODR_STOCK_QTY = new ArrayList();
		} else {
			l_w_JOB_ODR_STOCK_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_JOB_ODR_STOCK_QTY.add(((AG0010010Struct) list.get(i)).getw_JOB_ODR_STOCK_QTY());
		}
		return size;
	}
	public int setL2L_w_JOB_ODR_STOCK_QTY_LAST_DAY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_JOB_ODR_STOCK_QTY_LAST_DAY == null) {
			l_w_JOB_ODR_STOCK_QTY_LAST_DAY = new ArrayList();
		} else {
			l_w_JOB_ODR_STOCK_QTY_LAST_DAY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_JOB_ODR_STOCK_QTY_LAST_DAY.add(((AG0010010Struct) list.get(i)).getw_JOB_ODR_STOCK_QTY_LAST_DAY());
		}
		return size;
	}
	public int setL2L_w_JOB_ODR_STOCK_QTY_LAST_MONTH(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_JOB_ODR_STOCK_QTY_LAST_MONTH == null) {
			l_w_JOB_ODR_STOCK_QTY_LAST_MONTH = new ArrayList();
		} else {
			l_w_JOB_ODR_STOCK_QTY_LAST_MONTH.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_JOB_ODR_STOCK_QTY_LAST_MONTH.add(((AG0010010Struct) list.get(i)).getw_JOB_ODR_STOCK_QTY_LAST_MONTH());
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
			l_MRP_FLG.add(((AG0010010Struct) list.get(i)).getMRP_FLG());
		}
		return size;
	}
	public int setL2L_w_ITEM_STOCK_QTY_FOR_MRP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_ITEM_STOCK_QTY_FOR_MRP == null) {
			l_w_ITEM_STOCK_QTY_FOR_MRP = new ArrayList();
		} else {
			l_w_ITEM_STOCK_QTY_FOR_MRP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_ITEM_STOCK_QTY_FOR_MRP.add(((AG0010010Struct) list.get(i)).getw_ITEM_STOCK_QTY_FOR_MRP());
		}
		return size;
	}
	public int setL2L_w_JOB_ODR_STOCK_QTY_FOR_MRP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_JOB_ODR_STOCK_QTY_FOR_MRP == null) {
			l_w_JOB_ODR_STOCK_QTY_FOR_MRP = new ArrayList();
		} else {
			l_w_JOB_ODR_STOCK_QTY_FOR_MRP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_JOB_ODR_STOCK_QTY_FOR_MRP.add(((AG0010010Struct) list.get(i)).getw_JOB_ODR_STOCK_QTY_FOR_MRP());
		}
		return size;
	}
	public int setL2L_w_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_WH_CD == null) {
			l_w_WH_CD = new ArrayList();
		} else {
			l_w_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_WH_CD.add(((AG0010010Struct) list.get(i)).getw_WH_CD());
		}
		return size;
	}
	public int setL2L_w_STOCK_ON_HAND_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_STOCK_ON_HAND_QTY == null) {
			l_w_STOCK_ON_HAND_QTY = new ArrayList();
		} else {
			l_w_STOCK_ON_HAND_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_STOCK_ON_HAND_QTY.add(((AG0010010Struct) list.get(i)).getw_STOCK_ON_HAND_QTY());
		}
		return size;
	}
	public int setL2L_w_DEFECT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_DEFECT_QTY == null) {
			l_w_DEFECT_QTY = new ArrayList();
		} else {
			l_w_DEFECT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_DEFECT_QTY.add(((AG0010010Struct) list.get(i)).getw_DEFECT_QTY());
		}
		return size;
	}
	public int setL2L_w_PRVS_DAYEND_STOCK_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_PRVS_DAYEND_STOCK_QTY == null) {
			l_w_PRVS_DAYEND_STOCK_QTY = new ArrayList();
		} else {
			l_w_PRVS_DAYEND_STOCK_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_PRVS_DAYEND_STOCK_QTY.add(((AG0010010Struct) list.get(i)).getw_PRVS_DAYEND_STOCK_QTY());
		}
		return size;
	}
	public int setL2L_w_PRVS_MONTHEND_STOCK_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_PRVS_MONTHEND_STOCK_QTY == null) {
			l_w_PRVS_MONTHEND_STOCK_QTY = new ArrayList();
		} else {
			l_w_PRVS_MONTHEND_STOCK_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_PRVS_MONTHEND_STOCK_QTY.add(((AG0010010Struct) list.get(i)).getw_PRVS_MONTHEND_STOCK_QTY());
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
			l_PLANT_NAME.add(((AG0010010Struct) list.get(i)).getPLANT_NAME());
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
			l_WH_NAME.add(((AG0010010Struct) list.get(i)).getWH_NAME());
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
			l_JOB_ODR_CD.add(((AG0010010Struct) list.get(i)).getJOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_s2_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s2_PLANT_CD == null) {
			l_s2_PLANT_CD = new ArrayList();
		} else {
			l_s2_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s2_PLANT_CD.add(((AG0010010Struct) list.get(i)).gets2_PLANT_CD());
		}
		return size;
	}
	public int setL2L_l_PLANT_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PLANT_NAME == null) {
			l_l_PLANT_NAME = new ArrayList();
		} else {
			l_l_PLANT_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PLANT_NAME.add(((AG0010010Struct) list.get(i)).getl_PLANT_NAME());
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
			l_l_LOT_NO.add(((AG0010010Struct) list.get(i)).getl_LOT_NO());
		}
		return size;
	}
	public int setL2L_l_STOCK_ON_HAND_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_STOCK_ON_HAND_QTY == null) {
			l_l_STOCK_ON_HAND_QTY = new ArrayList();
		} else {
			l_l_STOCK_ON_HAND_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_STOCK_ON_HAND_QTY.add(((AG0010010Struct) list.get(i)).getl_STOCK_ON_HAND_QTY());
		}
		return size;
	}
	public int setL2L_l_ALCD_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ALCD_QTY == null) {
			l_l_ALCD_QTY = new ArrayList();
		} else {
			l_l_ALCD_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ALCD_QTY.add(((AG0010010Struct) list.get(i)).getl_ALCD_QTY());
		}
		return size;
	}
	public int setL2L_l_EXPIRATION_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_EXPIRATION_DATE == null) {
			l_l_EXPIRATION_DATE = new ArrayList();
		} else {
			l_l_EXPIRATION_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_EXPIRATION_DATE.add(((AG0010010Struct) list.get(i)).getl_EXPIRATION_DATE());
		}
		return size;
	}
	public int setL2L_l_PRD_CMPLT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PRD_CMPLT_DATE == null) {
			l_l_PRD_CMPLT_DATE = new ArrayList();
		} else {
			l_l_PRD_CMPLT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PRD_CMPLT_DATE.add(((AG0010010Struct) list.get(i)).getl_PRD_CMPLT_DATE());
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
			l_l_COUNT.add(((AG0010010Struct) list.get(i)).getl_COUNT());
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
			l_ROW_COUNT.add(((AG0010010Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_w_ITEM_STOCK_QTY_OUTSIDE_MRP = null;
		m_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP = null;
		m_w_TOTAL_STOCK_QTY = null;
		m_w_TOTAL_STOCK_QTY_LAST_DAY = null;
		m_w_TOTAL_STOCK_QTY_LAST_MONTH = null;
		m_MRP_ODR_NAME = null;
		m_MRP_NAME = null;
		m_h_lotCtrl = null;
		m_h_lotFlg = null;
		m_h_screenflg = null;
		m_w_PLANT_NAME = null;
		m_s_PLANT_CD = null;
		m_MRP_ODR_TYP_val = null;
		m_MRP_ODR_TYP_name = null;
		m_MRP_FLG_val = null;
		m_MRP_FLG_name = null;
		m_w_ITEM_NAME = null;
		m_DRAW_CD = null;
		m_SPEC = null;
		m_MRP_ODR_TYP = null;
		m_STOCK_UNIT = null;
		m_LOT_CTRL_FLG = null;
		m_w_ITEM_CD = null;
		m_w_PLANT_CD = null;
		m_w_ITEM_STOCK_QTY = null;
		m_w_ITEM_DEFECT_QTY = null;
		m_w_ITEM_STOCK_QTY_LAST_DAY = null;
		m_w_ITEM_STOCK_QTY_LAST_MONTH = null;
		m_w_JOB_ODR_STOCK_QTY = null;
		m_w_JOB_ODR_STOCK_QTY_LAST_DAY = null;
		m_w_JOB_ODR_STOCK_QTY_LAST_MONTH = null;
		m_MRP_FLG = null;
		m_w_ITEM_STOCK_QTY_FOR_MRP = null;
		m_w_JOB_ODR_STOCK_QTY_FOR_MRP = null;
		m_w_WH_CD = null;
		m_w_STOCK_ON_HAND_QTY = null;
		m_w_DEFECT_QTY = null;
		m_w_PRVS_DAYEND_STOCK_QTY = null;
		m_w_PRVS_MONTHEND_STOCK_QTY = null;
		m_PLANT_NAME = null;
		m_WH_NAME = null;
		m_JOB_ODR_CD = null;
		m_s2_PLANT_CD = null;
		m_l_PLANT_NAME = null;
		m_l_LOT_NO = null;
		m_l_STOCK_ON_HAND_QTY = null;
		m_l_ALCD_QTY = null;
		m_l_EXPIRATION_DATE = null;
		m_l_PRD_CMPLT_DATE = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;

		l_w_ITEM_STOCK_QTY_OUTSIDE_MRP = null;
		l_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP = null;
		l_w_TOTAL_STOCK_QTY = null;
		l_w_TOTAL_STOCK_QTY_LAST_DAY = null;
		l_w_TOTAL_STOCK_QTY_LAST_MONTH = null;
		l_MRP_ODR_NAME = null;
		l_MRP_NAME = null;
		l_h_lotCtrl = null;
		l_h_lotFlg = null;
		l_h_screenflg = null;
		l_w_PLANT_NAME = null;
		l_s_PLANT_CD = null;
		l_MRP_ODR_TYP_val = null;
		l_MRP_ODR_TYP_name = null;
		l_MRP_FLG_val = null;
		l_MRP_FLG_name = null;
		l_w_ITEM_NAME = null;
		l_DRAW_CD = null;
		l_SPEC = null;
		l_MRP_ODR_TYP = null;
		l_STOCK_UNIT = null;
		l_LOT_CTRL_FLG = null;
		l_w_ITEM_CD = null;
		l_w_PLANT_CD = null;
		l_w_ITEM_STOCK_QTY = null;
		l_w_ITEM_DEFECT_QTY = null;
		l_w_ITEM_STOCK_QTY_LAST_DAY = null;
		l_w_ITEM_STOCK_QTY_LAST_MONTH = null;
		l_w_JOB_ODR_STOCK_QTY = null;
		l_w_JOB_ODR_STOCK_QTY_LAST_DAY = null;
		l_w_JOB_ODR_STOCK_QTY_LAST_MONTH = null;
		l_MRP_FLG = null;
		l_w_ITEM_STOCK_QTY_FOR_MRP = null;
		l_w_JOB_ODR_STOCK_QTY_FOR_MRP = null;
		l_w_WH_CD = null;
		l_w_STOCK_ON_HAND_QTY = null;
		l_w_DEFECT_QTY = null;
		l_w_PRVS_DAYEND_STOCK_QTY = null;
		l_w_PRVS_MONTHEND_STOCK_QTY = null;
		l_PLANT_NAME = null;
		l_WH_NAME = null;
		l_JOB_ODR_CD = null;
		l_s2_PLANT_CD = null;
		l_l_PLANT_NAME = null;
		l_l_LOT_NO = null;
		l_l_STOCK_ON_HAND_QTY = null;
		l_l_ALCD_QTY = null;
		l_l_EXPIRATION_DATE = null;
		l_l_PRD_CMPLT_DATE = null;
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
	 * medAG0010010クラスの標準コンストラクタ
	 */
	public AG0010010Struct()
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
	public void setStruct(AG0010010Struct struct)
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
	public void setStructM(AG0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setw_ITEM_STOCK_QTY_OUTSIDE_MRP(struct.getw_ITEM_STOCK_QTY_OUTSIDE_MRP());
			this.setw_JOB_ODR_STOCK_QTY_OUTSIDE_MRP(struct.getw_JOB_ODR_STOCK_QTY_OUTSIDE_MRP());
			this.setw_TOTAL_STOCK_QTY(struct.getw_TOTAL_STOCK_QTY());
			this.setw_TOTAL_STOCK_QTY_LAST_DAY(struct.getw_TOTAL_STOCK_QTY_LAST_DAY());
			this.setw_TOTAL_STOCK_QTY_LAST_MONTH(struct.getw_TOTAL_STOCK_QTY_LAST_MONTH());
			this.setMRP_ODR_NAME(struct.getMRP_ODR_NAME());
			this.setMRP_NAME(struct.getMRP_NAME());
			this.seth_lotCtrl(struct.geth_lotCtrl());
			this.seth_lotFlg(struct.geth_lotFlg());
			this.seth_screenflg(struct.geth_screenflg());
			this.setw_PLANT_NAME(struct.getw_PLANT_NAME());
			this.sets_PLANT_CD(struct.gets_PLANT_CD());
			this.setMRP_ODR_TYP_val(struct.getMRP_ODR_TYP_val());
			this.setMRP_ODR_TYP_name(struct.getMRP_ODR_TYP_name());
			this.setMRP_FLG_val(struct.getMRP_FLG_val());
			this.setMRP_FLG_name(struct.getMRP_FLG_name());
			this.setw_ITEM_NAME(struct.getw_ITEM_NAME());
			this.setDRAW_CD(struct.getDRAW_CD());
			this.setSPEC(struct.getSPEC());
			this.setMRP_ODR_TYP(struct.getMRP_ODR_TYP());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setLOT_CTRL_FLG(struct.getLOT_CTRL_FLG());
			this.setw_ITEM_CD(struct.getw_ITEM_CD());
			this.setw_PLANT_CD(struct.getw_PLANT_CD());
			this.setw_ITEM_STOCK_QTY(struct.getw_ITEM_STOCK_QTY());
			this.setw_ITEM_DEFECT_QTY(struct.getw_ITEM_DEFECT_QTY());
			this.setw_ITEM_STOCK_QTY_LAST_DAY(struct.getw_ITEM_STOCK_QTY_LAST_DAY());
			this.setw_ITEM_STOCK_QTY_LAST_MONTH(struct.getw_ITEM_STOCK_QTY_LAST_MONTH());
			this.setw_JOB_ODR_STOCK_QTY(struct.getw_JOB_ODR_STOCK_QTY());
			this.setw_JOB_ODR_STOCK_QTY_LAST_DAY(struct.getw_JOB_ODR_STOCK_QTY_LAST_DAY());
			this.setw_JOB_ODR_STOCK_QTY_LAST_MONTH(struct.getw_JOB_ODR_STOCK_QTY_LAST_MONTH());
			this.setMRP_FLG(struct.getMRP_FLG());
			this.setw_ITEM_STOCK_QTY_FOR_MRP(struct.getw_ITEM_STOCK_QTY_FOR_MRP());
			this.setw_JOB_ODR_STOCK_QTY_FOR_MRP(struct.getw_JOB_ODR_STOCK_QTY_FOR_MRP());
			this.setw_WH_CD(struct.getw_WH_CD());
			this.setw_STOCK_ON_HAND_QTY(struct.getw_STOCK_ON_HAND_QTY());
			this.setw_DEFECT_QTY(struct.getw_DEFECT_QTY());
			this.setw_PRVS_DAYEND_STOCK_QTY(struct.getw_PRVS_DAYEND_STOCK_QTY());
			this.setw_PRVS_MONTHEND_STOCK_QTY(struct.getw_PRVS_MONTHEND_STOCK_QTY());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.setWH_NAME(struct.getWH_NAME());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.sets2_PLANT_CD(struct.gets2_PLANT_CD());
			this.setl_PLANT_NAME(struct.getl_PLANT_NAME());
			this.setl_LOT_NO(struct.getl_LOT_NO());
			this.setl_STOCK_ON_HAND_QTY(struct.getl_STOCK_ON_HAND_QTY());
			this.setl_ALCD_QTY(struct.getl_ALCD_QTY());
			this.setl_EXPIRATION_DATE(struct.getl_EXPIRATION_DATE());
			this.setl_PRD_CMPLT_DATE(struct.getl_PRD_CMPLT_DATE());
			this.setl_COUNT(struct.getl_COUNT());
			this.setROW_COUNT(struct.getROW_COUNT());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AG0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_w_ITEM_STOCK_QTY_OUTSIDE_MRP(struct.getList_w_ITEM_STOCK_QTY_OUTSIDE_MRP());
			this.setList_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP(struct.getList_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP());
			this.setList_w_TOTAL_STOCK_QTY(struct.getList_w_TOTAL_STOCK_QTY());
			this.setList_w_TOTAL_STOCK_QTY_LAST_DAY(struct.getList_w_TOTAL_STOCK_QTY_LAST_DAY());
			this.setList_w_TOTAL_STOCK_QTY_LAST_MONTH(struct.getList_w_TOTAL_STOCK_QTY_LAST_MONTH());
			this.setList_MRP_ODR_NAME(struct.getList_MRP_ODR_NAME());
			this.setList_MRP_NAME(struct.getList_MRP_NAME());
			this.setList_h_lotCtrl(struct.getList_h_lotCtrl());
			this.setList_h_lotFlg(struct.getList_h_lotFlg());
			this.setList_h_screenflg(struct.getList_h_screenflg());
			this.setList_w_PLANT_NAME(struct.getList_w_PLANT_NAME());
			this.setList_s_PLANT_CD(struct.getList_s_PLANT_CD());
			this.setList_MRP_ODR_TYP_val(struct.getList_MRP_ODR_TYP_val());
			this.setList_MRP_ODR_TYP_name(struct.getList_MRP_ODR_TYP_name());
			this.setList_MRP_FLG_val(struct.getList_MRP_FLG_val());
			this.setList_MRP_FLG_name(struct.getList_MRP_FLG_name());
			this.setList_w_ITEM_NAME(struct.getList_w_ITEM_NAME());
			this.setList_DRAW_CD(struct.getList_DRAW_CD());
			this.setList_SPEC(struct.getList_SPEC());
			this.setList_MRP_ODR_TYP(struct.getList_MRP_ODR_TYP());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_LOT_CTRL_FLG(struct.getList_LOT_CTRL_FLG());
			this.setList_w_ITEM_CD(struct.getList_w_ITEM_CD());
			this.setList_w_PLANT_CD(struct.getList_w_PLANT_CD());
			this.setList_w_ITEM_STOCK_QTY(struct.getList_w_ITEM_STOCK_QTY());
			this.setList_w_ITEM_DEFECT_QTY(struct.getList_w_ITEM_DEFECT_QTY());
			this.setList_w_ITEM_STOCK_QTY_LAST_DAY(struct.getList_w_ITEM_STOCK_QTY_LAST_DAY());
			this.setList_w_ITEM_STOCK_QTY_LAST_MONTH(struct.getList_w_ITEM_STOCK_QTY_LAST_MONTH());
			this.setList_w_JOB_ODR_STOCK_QTY(struct.getList_w_JOB_ODR_STOCK_QTY());
			this.setList_w_JOB_ODR_STOCK_QTY_LAST_DAY(struct.getList_w_JOB_ODR_STOCK_QTY_LAST_DAY());
			this.setList_w_JOB_ODR_STOCK_QTY_LAST_MONTH(struct.getList_w_JOB_ODR_STOCK_QTY_LAST_MONTH());
			this.setList_MRP_FLG(struct.getList_MRP_FLG());
			this.setList_w_ITEM_STOCK_QTY_FOR_MRP(struct.getList_w_ITEM_STOCK_QTY_FOR_MRP());
			this.setList_w_JOB_ODR_STOCK_QTY_FOR_MRP(struct.getList_w_JOB_ODR_STOCK_QTY_FOR_MRP());
			this.setList_w_WH_CD(struct.getList_w_WH_CD());
			this.setList_w_STOCK_ON_HAND_QTY(struct.getList_w_STOCK_ON_HAND_QTY());
			this.setList_w_DEFECT_QTY(struct.getList_w_DEFECT_QTY());
			this.setList_w_PRVS_DAYEND_STOCK_QTY(struct.getList_w_PRVS_DAYEND_STOCK_QTY());
			this.setList_w_PRVS_MONTHEND_STOCK_QTY(struct.getList_w_PRVS_MONTHEND_STOCK_QTY());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_WH_NAME(struct.getList_WH_NAME());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_s2_PLANT_CD(struct.getList_s2_PLANT_CD());
			this.setList_l_PLANT_NAME(struct.getList_l_PLANT_NAME());
			this.setList_l_LOT_NO(struct.getList_l_LOT_NO());
			this.setList_l_STOCK_ON_HAND_QTY(struct.getList_l_STOCK_ON_HAND_QTY());
			this.setList_l_ALCD_QTY(struct.getList_l_ALCD_QTY());
			this.setList_l_EXPIRATION_DATE(struct.getList_l_EXPIRATION_DATE());
			this.setList_l_PRD_CMPLT_DATE(struct.getList_l_PRD_CMPLT_DATE());
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
	// 第 1 変数初期値： i_w_ITEM_STOCK_QTY_OUTSIDE_MRP


	final static String i_w_ITEM_STOCK_QTY_OUTSIDE_MRP = null;

	// 第 2 変数初期値： i_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP


	final static String i_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP = null;

	// 第 3 変数初期値： i_w_TOTAL_STOCK_QTY


	final static String i_w_TOTAL_STOCK_QTY = null;

	// 第 4 変数初期値： i_w_TOTAL_STOCK_QTY_LAST_DAY


	final static String i_w_TOTAL_STOCK_QTY_LAST_DAY = null;

	// 第 5 変数初期値： i_w_TOTAL_STOCK_QTY_LAST_MONTH


	final static String i_w_TOTAL_STOCK_QTY_LAST_MONTH = null;

	// 第 6 変数初期値： i_MRP_ODR_NAME


	final static String i_MRP_ODR_NAME = null;

	// 第 7 変数初期値： i_MRP_NAME


	final static String i_MRP_NAME = null;

	// 第 8 変数初期値： i_h_lotCtrl


	final static String i_h_lotCtrl = null;

	// 第 9 変数初期値： i_h_lotFlg


	final static String i_h_lotFlg = null;

	// 第 10 変数初期値： i_h_screenflg


	final static String i_h_screenflg = null;

	// 第 11 変数初期値： i_w_PLANT_NAME


	final static String i_w_PLANT_NAME = null;

	// 第 12 変数初期値： i_s_PLANT_CD


	final static String i_s_PLANT_CD = null;

	// 第 13 変数初期値： i_MRP_ODR_TYP_val


	final static String i_MRP_ODR_TYP_val = null;

	// 第 14 変数初期値： i_MRP_ODR_TYP_name


	final static String i_MRP_ODR_TYP_name = null;

	// 第 15 変数初期値： i_MRP_FLG_val


	final static String i_MRP_FLG_val = null;

	// 第 16 変数初期値： i_MRP_FLG_name


	final static String i_MRP_FLG_name = null;

	// 第 17 変数初期値： i_w_ITEM_NAME


	final static String i_w_ITEM_NAME = null;

	// 第 18 変数初期値： i_DRAW_CD


	final static String i_DRAW_CD = null;

	// 第 19 変数初期値： i_SPEC


	final static String i_SPEC = null;

	// 第 20 変数初期値： i_MRP_ODR_TYP


	final static String i_MRP_ODR_TYP = null;

	// 第 21 変数初期値： i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// 第 22 変数初期値： i_LOT_CTRL_FLG


	final static String i_LOT_CTRL_FLG = null;

	// 第 23 変数初期値： i_w_ITEM_CD


	final static String i_w_ITEM_CD = null;

	// 第 24 変数初期値： i_w_PLANT_CD


	final static String i_w_PLANT_CD = null;

	// 第 25 変数初期値： i_w_ITEM_STOCK_QTY


	final static String i_w_ITEM_STOCK_QTY = null;

	// 第 26 変数初期値： i_w_ITEM_DEFECT_QTY


	final static String i_w_ITEM_DEFECT_QTY = null;

	// 第 27 変数初期値： i_w_ITEM_STOCK_QTY_LAST_DAY


	final static String i_w_ITEM_STOCK_QTY_LAST_DAY = null;

	// 第 28 変数初期値： i_w_ITEM_STOCK_QTY_LAST_MONTH


	final static String i_w_ITEM_STOCK_QTY_LAST_MONTH = null;

	// 第 29 変数初期値： i_w_JOB_ODR_STOCK_QTY


	final static String i_w_JOB_ODR_STOCK_QTY = null;

	// 第 30 変数初期値： i_w_JOB_ODR_STOCK_QTY_LAST_DAY


	final static String i_w_JOB_ODR_STOCK_QTY_LAST_DAY = null;

	// 第 31 変数初期値： i_w_JOB_ODR_STOCK_QTY_LAST_MONTH


	final static String i_w_JOB_ODR_STOCK_QTY_LAST_MONTH = null;

	// 第 32 変数初期値： i_MRP_FLG


	final static Integer i_MRP_FLG = null;

	// 第 33 変数初期値： i_w_ITEM_STOCK_QTY_FOR_MRP


	final static String i_w_ITEM_STOCK_QTY_FOR_MRP = null;

	// 第 34 変数初期値： i_w_JOB_ODR_STOCK_QTY_FOR_MRP


	final static String i_w_JOB_ODR_STOCK_QTY_FOR_MRP = null;

	// 第 35 変数初期値： i_w_WH_CD


	final static String i_w_WH_CD = null;

	// 第 36 変数初期値： i_w_STOCK_ON_HAND_QTY


	final static String i_w_STOCK_ON_HAND_QTY = null;

	// 第 37 変数初期値： i_w_DEFECT_QTY


	final static String i_w_DEFECT_QTY = null;

	// 第 38 変数初期値： i_w_PRVS_DAYEND_STOCK_QTY


	final static String i_w_PRVS_DAYEND_STOCK_QTY = null;

	// 第 39 変数初期値： i_w_PRVS_MONTHEND_STOCK_QTY


	final static String i_w_PRVS_MONTHEND_STOCK_QTY = null;

	// 第 40 変数初期値： i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// 第 41 変数初期値： i_WH_NAME


	final static String i_WH_NAME = null;

	// 第 42 変数初期値： i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// 第 43 変数初期値： i_s2_PLANT_CD


	final static String i_s2_PLANT_CD = null;

	// 第 44 変数初期値： i_l_PLANT_NAME


	final static String i_l_PLANT_NAME = null;

	// 第 45 変数初期値： i_l_LOT_NO


	final static String i_l_LOT_NO = null;

	// 第 46 変数初期値： i_l_STOCK_ON_HAND_QTY


	final static String i_l_STOCK_ON_HAND_QTY = null;

	// 第 47 変数初期値： i_l_ALCD_QTY


	final static String i_l_ALCD_QTY = null;

	// 第 48 変数初期値： i_l_EXPIRATION_DATE


	final static String i_l_EXPIRATION_DATE = null;

	// 第 49 変数初期値： i_l_PRD_CMPLT_DATE


	final static String i_l_PRD_CMPLT_DATE = null;

	// 第 50 変数初期値： i_l_COUNT


	final static String i_l_COUNT = null;

	// 第 51 変数初期値： i_ROW_COUNT


	final static String i_ROW_COUNT = null;

*/

	//{{user_implement_code
	//---------------------------------------------------------------------

	/**
	 * 初期化
	 * @param なし
	 */
	public void initialize()
	{
		m_w_ITEM_STOCK_QTY = new String("0.0");
		m_w_ITEM_DEFECT_QTY = new String("0.0");
		m_w_ITEM_STOCK_QTY_LAST_DAY = new String("0.0");
		m_w_ITEM_STOCK_QTY_LAST_MONTH = new String("0.0");
		m_w_JOB_ODR_STOCK_QTY = new String("0.0");
		m_w_JOB_ODR_STOCK_QTY_LAST_DAY = new String("0.0");
		m_w_JOB_ODR_STOCK_QTY_LAST_MONTH = new String("0.0");
		m_w_ITEM_STOCK_QTY_FOR_MRP = new String("0.0");
		m_w_ITEM_STOCK_QTY_OUTSIDE_MRP = new String("0.0");
		m_w_JOB_ODR_STOCK_QTY_FOR_MRP = new String("0.0");
		m_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP = new String("0.0");
		m_w_TOTAL_STOCK_QTY = new String("0.0");
		m_w_TOTAL_STOCK_QTY_LAST_DAY = new String("0.0");
		m_w_TOTAL_STOCK_QTY_LAST_MONTH = new String("0.0");
	}


	/**
	 * コピー
	 * @param struct コピー対象
	 */
	public void copy(AG0010010Struct struct)
	{
		clear();
		if(struct.m_w_ITEM_NAME != null) m_w_ITEM_NAME = new String(struct.m_w_ITEM_NAME);
		if(struct.m_DRAW_CD != null) m_DRAW_CD = new String(struct.m_DRAW_CD);
		if(struct.m_SPEC != null) m_SPEC = new String(struct.m_SPEC);
		if(struct.m_MRP_ODR_TYP != null) m_MRP_ODR_TYP = new String(struct.m_MRP_ODR_TYP);
		if(struct.m_w_ITEM_CD != null) m_w_ITEM_CD = new String(struct.m_w_ITEM_CD);
		if(struct.m_w_PLANT_NAME != null) m_w_PLANT_NAME = new String(struct.m_w_PLANT_NAME);
		if(struct.m_w_PLANT_CD != null) m_w_PLANT_CD = new String(struct.m_w_PLANT_CD);
		if(struct.m_w_ITEM_STOCK_QTY != null) m_w_ITEM_STOCK_QTY = new String(struct.m_w_ITEM_STOCK_QTY);
		if(struct.m_w_ITEM_DEFECT_QTY != null) m_w_ITEM_DEFECT_QTY = new String(struct.m_w_ITEM_DEFECT_QTY);
		if(struct.m_w_ITEM_STOCK_QTY_LAST_DAY != null) m_w_ITEM_STOCK_QTY_LAST_DAY = new String(struct.m_w_ITEM_STOCK_QTY_LAST_DAY);
		if(struct.m_w_ITEM_STOCK_QTY_LAST_MONTH != null) m_w_ITEM_STOCK_QTY_LAST_MONTH = new String(struct.m_w_ITEM_STOCK_QTY_LAST_MONTH);
		if(struct.m_w_JOB_ODR_STOCK_QTY != null) m_w_JOB_ODR_STOCK_QTY = new String(struct.m_w_JOB_ODR_STOCK_QTY);
		if(struct.m_w_JOB_ODR_STOCK_QTY_LAST_DAY != null) m_w_JOB_ODR_STOCK_QTY_LAST_DAY = new String(struct.m_w_JOB_ODR_STOCK_QTY_LAST_DAY);
		if(struct.m_w_JOB_ODR_STOCK_QTY_LAST_MONTH != null) m_w_JOB_ODR_STOCK_QTY_LAST_MONTH = new String(struct.m_w_JOB_ODR_STOCK_QTY_LAST_MONTH);
		if(struct.m_MRP_FLG != null) m_MRP_FLG = new Integer(struct.m_MRP_FLG.intValue());
		if(struct.m_w_ITEM_STOCK_QTY_FOR_MRP != null) m_w_ITEM_STOCK_QTY_FOR_MRP = new String(struct.m_w_ITEM_STOCK_QTY_FOR_MRP);
		if(struct.m_w_JOB_ODR_STOCK_QTY_FOR_MRP != null) m_w_JOB_ODR_STOCK_QTY_FOR_MRP = new String(struct.m_w_JOB_ODR_STOCK_QTY_FOR_MRP);
		if(struct.m_s_PLANT_CD != null) m_s_PLANT_CD = new String(struct.m_s_PLANT_CD);
		if(struct.m_w_WH_CD != null) m_w_WH_CD = new String(struct.m_w_WH_CD);
		if(struct.m_w_STOCK_ON_HAND_QTY != null) m_w_STOCK_ON_HAND_QTY = new String(struct.m_w_STOCK_ON_HAND_QTY);
		if(struct.m_w_DEFECT_QTY != null) m_w_DEFECT_QTY = new String(struct.m_w_DEFECT_QTY);
		if(struct.m_w_PRVS_DAYEND_STOCK_QTY != null) m_w_PRVS_DAYEND_STOCK_QTY = new String(struct.m_w_PRVS_DAYEND_STOCK_QTY);
		if(struct.m_w_PRVS_MONTHEND_STOCK_QTY != null) m_w_PRVS_MONTHEND_STOCK_QTY = new String(struct.m_w_PRVS_MONTHEND_STOCK_QTY);
		if(struct.m_PLANT_NAME != null) m_PLANT_NAME = new String(struct.m_PLANT_NAME);
		if(struct.m_WH_NAME != null) m_WH_NAME = new String(struct.m_WH_NAME);
		if(struct.m_JOB_ODR_CD != null) m_JOB_ODR_CD = new String(struct.m_JOB_ODR_CD);
		if(struct.m_w_ITEM_STOCK_QTY_OUTSIDE_MRP != null) m_w_ITEM_STOCK_QTY_OUTSIDE_MRP = new String(struct.m_w_ITEM_STOCK_QTY_OUTSIDE_MRP);
		if(struct.m_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP != null) m_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP = new String(struct.m_w_JOB_ODR_STOCK_QTY_OUTSIDE_MRP);
		if(struct.m_w_TOTAL_STOCK_QTY != null) m_w_TOTAL_STOCK_QTY = new String(struct.m_w_TOTAL_STOCK_QTY);
		if(struct.m_w_TOTAL_STOCK_QTY_LAST_DAY != null) m_w_TOTAL_STOCK_QTY_LAST_DAY = new String(struct.m_w_TOTAL_STOCK_QTY_LAST_DAY);
		if(struct.m_w_TOTAL_STOCK_QTY_LAST_MONTH != null) m_w_TOTAL_STOCK_QTY_LAST_MONTH = new String(struct.m_w_TOTAL_STOCK_QTY_LAST_MONTH);
		if(struct.m_MRP_ODR_NAME != null) m_MRP_ODR_NAME = new String(struct.m_MRP_ODR_NAME);
		if(struct.m_MRP_NAME != null) m_MRP_NAME = new String(struct.m_MRP_NAME);
		if(struct.m_MRP_ODR_TYP_val != null) m_MRP_ODR_TYP_val = new String(struct.m_MRP_ODR_TYP_val);
		if(struct.m_MRP_ODR_TYP_name != null) m_MRP_ODR_TYP_name = new String(struct.m_MRP_ODR_TYP_name);
		if(struct.m_MRP_FLG_val != null) m_MRP_FLG_val = new String(struct.m_MRP_FLG_val);
		if(struct.m_MRP_FLG_name != null) m_MRP_FLG_name = new String(struct.m_MRP_FLG_name);
		if(struct.m_STOCK_UNIT != null) m_STOCK_UNIT = new String(struct.m_STOCK_UNIT);
	}


	/**
	 * コピーコンストラクタ
	 * @param struct コピー対象
	 */
	 public AG0010010Struct(AG0010010Struct struct)
	 {
	 	copy(struct);
	 }

	//---------------------------------------------------------------------
        //}}user_implement_code

	//////////////////////////////

}
