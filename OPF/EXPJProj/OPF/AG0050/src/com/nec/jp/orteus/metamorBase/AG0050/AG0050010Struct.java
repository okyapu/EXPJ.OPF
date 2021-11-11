/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AG0050/src/com/nec/jp/orteus/metamorBase/AG0050/AG0050010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AG0050;

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

public class AG0050010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_STOCK_UNIT_3 */
	public String m_STOCK_UNIT_3 = null;
	/** 第 2 変数： m_STOCK_UNIT_1 */
	public String m_STOCK_UNIT_1 = null;
	/** 第 3 変数： m_STOCK_UNIT_4 */
	public String m_STOCK_UNIT_4 = null;
	/** 第 4 変数： m_SCDL_ISSUE_TOTAL */
	public String m_SCDL_ISSUE_TOTAL = null;
	/** 第 5 変数： m_STOCK_UNIT_2 */
	public String m_STOCK_UNIT_2 = null;
	/** 第 6 変数： m_SCDL_RCV_TOTAL */
	public String m_SCDL_RCV_TOTAL = null;
	/** 第 7 変数： m_STOCK_UNIT_5 */
	public String m_STOCK_UNIT_5 = null;
	/** 第 8 変数： m_rdoItemCd */
	public String m_rdoItemCd = null;
	/** 第 9 変数： m_rdoParentItemCd */
	public String m_rdoParentItemCd = null;
	/** 第 10 変数： m_rdoCompItemCd */
	public String m_rdoCompItemCd = null;
	/** 第 11 変数： m_w_PARENT_ITEM_NAME */
	public String m_w_PARENT_ITEM_NAME = null;
	/** 第 12 変数： m_w_COMP_ITEM_NAME */
	public String m_w_COMP_ITEM_NAME = null;
	/** 第 13 変数： m_checkMrpFlg */
	public String m_checkMrpFlg = null;
	/** 第 14 変数： m_checkProdPlan */
	public String m_checkProdPlan = null;
	/** 第 15 変数： m_checkUncnfm */
	public String m_checkUncnfm = null;
	/** 第 16 変数： m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** 第 17 変数： m_checkQty */
	public String m_checkQty = null;
	/** 第 18 変数： m_h_DM_CREATE_BASE_TBL */
	public String m_h_DM_CREATE_BASE_TBL = null;
	/** 第 19 変数： m_u_OPTION_ID */
	public String m_u_OPTION_ID = null;
	/** 第 20 変数： m_w_ITEM_NAME */
	public String m_w_ITEM_NAME = null;
	/** 第 21 変数： m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** 第 22 変数： m_w_ITEM_CD */
	public String m_w_ITEM_CD = null;
	/** 第 23 変数： m_w_PLANT_NAME */
	public String m_w_PLANT_NAME = null;
	/** 第 24 変数： m_w_PLANT_CD */
	public String m_w_PLANT_CD = null;
	/** 第 25 変数： m_SCDL_ISSUE_TOTAL_FIX */
	public String m_SCDL_ISSUE_TOTAL_FIX = null;
	/** 第 26 変数： m_SCDL_ISSUE_TOTAL_NOFIX */
	public String m_SCDL_ISSUE_TOTAL_NOFIX = null;
	/** 第 27 変数： m_SCDL_RCV_TOTAL_FIX */
	public String m_SCDL_RCV_TOTAL_FIX = null;
	/** 第 28 変数： m_SCDL_RCV_TOTAL_NOFIX */
	public String m_SCDL_RCV_TOTAL_NOFIX = null;
	/** 第 29 変数： m_SORT_NO */
	public String m_SORT_NO = null;
	/** 第 30 変数： m_DELIVERY_DATE */
	public String m_DELIVERY_DATE = null;
	/** 第 31 変数： m_INSIDE_ODR_QTY */
	public String m_INSIDE_ODR_QTY = null;
	/** 第 32 変数： m_INTEGRATE_ODR_QTY */
	public String m_INTEGRATE_ODR_QTY = null;
	/** 第 33 変数： m_DEMAND_QTY */
	public String m_DEMAND_QTY = null;
	/** 第 34 変数： m_STOCK_ODR_QTY */
	public String m_STOCK_ODR_QTY = null;
	/** 第 35 変数： m_ADD_SUBTRACT */
	public String m_ADD_SUBTRACT = null;
	/** 第 36 変数： m_EFFECT_STOCK_QTY */
	public String m_EFFECT_STOCK_QTY = null;
	/** 第 37 変数： m_PURCHASE_UNIT */
	public String m_PURCHASE_UNIT = null;
	/** 第 38 変数： m_NUMBER_STATUS */
	public String m_NUMBER_STATUS = null;
	/** 第 39 変数： m_STATUS */
	public String m_STATUS = null;
	/** 第 40 変数： m_WORK_ODR_CD */
	public String m_WORK_ODR_CD = null;
	/** 第 41 変数： m_PARENT_ORDER_NO */
	public String m_PARENT_ORDER_NO = null;
	/** 第 42 変数： m_PARENT_ORDER_ITEM_NO */
	public String m_PARENT_ORDER_ITEM_NO = null;
	/** 第 43 変数： m_PARENT_ORDER_ITEM_NAME */
	public String m_PARENT_ORDER_ITEM_NAME = null;
	/** 第 44 変数： m_DEMAND_NO */
	public String m_DEMAND_NO = null;
	/** 第 45 変数： m_ORDER_NO */
	public String m_ORDER_NO = null;
	/** 第 46 変数： m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** 第 47 変数： m_WH_CD */
	public String m_WH_CD = null;
	/** 第 48 変数： m_WH_NAME */
	public String m_WH_NAME = null;
	/** 第 49 変数： m_GNR */
	public String m_GNR = null;
	/** 第 50 変数： m_NUMBER_GNR_TYP */
	public String m_NUMBER_GNR_TYP = null;
	/** 第 51 変数： m_GNR_TYP */
	public String m_GNR_TYP = null;
	/** 第 52 変数： m_JOB_ODR_CANCEL_NO */
	public String m_JOB_ODR_CANCEL_NO = null;
	/** 第 53 変数： m_w_PKG_UNIT_QTY */
	public String m_w_PKG_UNIT_QTY = null;
	/** 第 54 変数： m_w_UNIT_QTY_TYP */
	public String m_w_UNIT_QTY_TYP = null;
	/** 第 55 変数： m_CUST_CD */
	public String m_CUST_CD = null;
	/** 第 56 変数： m_DLV_LOC_CD */
	public String m_DLV_LOC_CD = null;
	/** 第 57 変数： m_DESINATED_DLV_DATE */
	public String m_DESINATED_DLV_DATE = null;
	/** 第 58 変数： m_ODR_ACPT_DATE */
	public String m_ODR_ACPT_DATE = null;
	/** 第 59 変数： m_VEND_CD */
	public String m_VEND_CD = null;
	/** 第 60 変数： m_ODR_START_DATE */
	public String m_ODR_START_DATE = null;
	/** 第 61 変数： m_PUCH_ODR_START_DATE */
	public String m_PUCH_ODR_START_DATE = null;
	/** 第 62 変数： m_M_WH_PLANT_CD */
	public String m_M_WH_PLANT_CD = null;
	/** 第 63 変数： m_TRANSPORT_LT */
	public String m_TRANSPORT_LT = null;
	/** 第 64 変数： m_FIX_ODR_QTY */
	public String m_FIX_ODR_QTY = null;
	/** 第 65 変数： m_UNOFFICIAL_ODR_QTY */
	public String m_UNOFFICIAL_ODR_QTY = null;
	/** 第 66 変数： m_DEPOT_QTY */
	public String m_DEPOT_QTY = null;
	/** 第 67 変数： m_CUST_ANAME */
	public String m_CUST_ANAME = null;
	/** 第 68 変数： m_VEND_ANAME */
	public String m_VEND_ANAME = null;
	/** 第 69 変数： m_ODR_DEPOT_CTL_NO */
	public String m_ODR_DEPOT_CTL_NO = null;
	/** 第 70 変数： m_CUST_ODR_NO */
	public String m_CUST_ODR_NO = null;
	/** 第 71 変数： m_ODR_CHARACTERISTIC */
	public String m_ODR_CHARACTERISTIC = null;
	/** 第 72 変数： m_w_MRP_FLG */
	public String m_w_MRP_FLG = null;
	/** 第 73 変数： m_w_ENV_FLG */
	public String m_w_ENV_FLG = null;
	/** 第 74 変数： m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** 第 75 変数： m_w_CHECK_FLG */
	public String m_w_CHECK_FLG = null;
	/** 第 76 変数： m_w_QTY_FLG */
	public String m_w_QTY_FLG = null;
	/** 第 77 変数： m_w_LOG_MODE_TYP */
	public String m_w_LOG_MODE_TYP = null;
	/** 第 78 変数： m_w_OUTPUT_MODE_TYP */
	public String m_w_OUTPUT_MODE_TYP = null;
	/** 第 79 変数： m_w_PROGRAM_CD */
	public String m_w_PROGRAM_CD = null;
	/** 第 80 変数： m_w_FUNCTION_NAME */
	public String m_w_FUNCTION_NAME = null;
	/** 第 81 変数： m_w_SHIP_LT */
	public String m_w_SHIP_LT = null;
	/** 第 82 変数： m_w_CLASS_CODE */
	public String m_w_CLASS_CODE = null;
	/** 第 83 変数： m_w_PARENT_ITEM_CD */
	public String m_w_PARENT_ITEM_CD = null;
	/** 第 84 変数： m_w_COMP_ITEM_CD */
	public String m_w_COMP_ITEM_CD = null;
	/** 第 85 変数： m_ODR_CD */
	public String m_ODR_CD = null;
	/** 第 86 変数： m_h_INSTALL_FLG */
	public String m_h_INSTALL_FLG = null;
	/** 第 87 変数： m_OD_NO */
	public String m_OD_NO = null;
	/** 第 88 変数： m_INTEGRATE_ODR_QTY_ZH */
	public String m_INTEGRATE_ODR_QTY_ZH = null;
	/** 第 89 変数： m_DEPOT_CTL_NO */
	public String m_DEPOT_CTL_NO = null;
	/** 第 90 変数： m_w_UNCONFIRM_FLG */
	public String m_w_UNCONFIRM_FLG = null;
	/** 第 91 変数： m_l_COUNT */
	public String m_l_COUNT = null;
	/** 第 92 変数： m_ROW_COUNT */
	public String m_ROW_COUNT = null;
	/** 第 93 変数： m_w_DM_CREATE_BASE_TBL */
	public String m_w_DM_CREATE_BASE_TBL = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_STOCK_UNIT_3 */
	public List l_STOCK_UNIT_3 = null;

	/** 第 2 List変数： l_STOCK_UNIT_1 */
	public List l_STOCK_UNIT_1 = null;

	/** 第 3 List変数： l_STOCK_UNIT_4 */
	public List l_STOCK_UNIT_4 = null;

	/** 第 4 List変数： l_SCDL_ISSUE_TOTAL */
	public List l_SCDL_ISSUE_TOTAL = null;

	/** 第 5 List変数： l_STOCK_UNIT_2 */
	public List l_STOCK_UNIT_2 = null;

	/** 第 6 List変数： l_SCDL_RCV_TOTAL */
	public List l_SCDL_RCV_TOTAL = null;

	/** 第 7 List変数： l_STOCK_UNIT_5 */
	public List l_STOCK_UNIT_5 = null;

	/** 第 8 List変数： l_rdoItemCd */
	public List l_rdoItemCd = null;

	/** 第 9 List変数： l_rdoParentItemCd */
	public List l_rdoParentItemCd = null;

	/** 第 10 List変数： l_rdoCompItemCd */
	public List l_rdoCompItemCd = null;

	/** 第 11 List変数： l_w_PARENT_ITEM_NAME */
	public List l_w_PARENT_ITEM_NAME = null;

	/** 第 12 List変数： l_w_COMP_ITEM_NAME */
	public List l_w_COMP_ITEM_NAME = null;

	/** 第 13 List変数： l_checkMrpFlg */
	public List l_checkMrpFlg = null;

	/** 第 14 List変数： l_checkProdPlan */
	public List l_checkProdPlan = null;

	/** 第 15 List変数： l_checkUncnfm */
	public List l_checkUncnfm = null;

	/** 第 16 List変数： l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** 第 17 List変数： l_checkQty */
	public List l_checkQty = null;

	/** 第 18 List変数： l_h_DM_CREATE_BASE_TBL */
	public List l_h_DM_CREATE_BASE_TBL = null;

	/** 第 19 List変数： l_u_OPTION_ID */
	public List l_u_OPTION_ID = null;

	/** 第 20 List変数： l_w_ITEM_NAME */
	public List l_w_ITEM_NAME = null;

	/** 第 21 List変数： l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** 第 22 List変数： l_w_ITEM_CD */
	public List l_w_ITEM_CD = null;

	/** 第 23 List変数： l_w_PLANT_NAME */
	public List l_w_PLANT_NAME = null;

	/** 第 24 List変数： l_w_PLANT_CD */
	public List l_w_PLANT_CD = null;

	/** 第 25 List変数： l_SCDL_ISSUE_TOTAL_FIX */
	public List l_SCDL_ISSUE_TOTAL_FIX = null;

	/** 第 26 List変数： l_SCDL_ISSUE_TOTAL_NOFIX */
	public List l_SCDL_ISSUE_TOTAL_NOFIX = null;

	/** 第 27 List変数： l_SCDL_RCV_TOTAL_FIX */
	public List l_SCDL_RCV_TOTAL_FIX = null;

	/** 第 28 List変数： l_SCDL_RCV_TOTAL_NOFIX */
	public List l_SCDL_RCV_TOTAL_NOFIX = null;

	/** 第 29 List変数： l_SORT_NO */
	public List l_SORT_NO = null;

	/** 第 30 List変数： l_DELIVERY_DATE */
	public List l_DELIVERY_DATE = null;

	/** 第 31 List変数： l_INSIDE_ODR_QTY */
	public List l_INSIDE_ODR_QTY = null;

	/** 第 32 List変数： l_INTEGRATE_ODR_QTY */
	public List l_INTEGRATE_ODR_QTY = null;

	/** 第 33 List変数： l_DEMAND_QTY */
	public List l_DEMAND_QTY = null;

	/** 第 34 List変数： l_STOCK_ODR_QTY */
	public List l_STOCK_ODR_QTY = null;

	/** 第 35 List変数： l_ADD_SUBTRACT */
	public List l_ADD_SUBTRACT = null;

	/** 第 36 List変数： l_EFFECT_STOCK_QTY */
	public List l_EFFECT_STOCK_QTY = null;

	/** 第 37 List変数： l_PURCHASE_UNIT */
	public List l_PURCHASE_UNIT = null;

	/** 第 38 List変数： l_NUMBER_STATUS */
	public List l_NUMBER_STATUS = null;

	/** 第 39 List変数： l_STATUS */
	public List l_STATUS = null;

	/** 第 40 List変数： l_WORK_ODR_CD */
	public List l_WORK_ODR_CD = null;

	/** 第 41 List変数： l_PARENT_ORDER_NO */
	public List l_PARENT_ORDER_NO = null;

	/** 第 42 List変数： l_PARENT_ORDER_ITEM_NO */
	public List l_PARENT_ORDER_ITEM_NO = null;

	/** 第 43 List変数： l_PARENT_ORDER_ITEM_NAME */
	public List l_PARENT_ORDER_ITEM_NAME = null;

	/** 第 44 List変数： l_DEMAND_NO */
	public List l_DEMAND_NO = null;

	/** 第 45 List変数： l_ORDER_NO */
	public List l_ORDER_NO = null;

	/** 第 46 List変数： l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** 第 47 List変数： l_WH_CD */
	public List l_WH_CD = null;

	/** 第 48 List変数： l_WH_NAME */
	public List l_WH_NAME = null;

	/** 第 49 List変数： l_GNR */
	public List l_GNR = null;

	/** 第 50 List変数： l_NUMBER_GNR_TYP */
	public List l_NUMBER_GNR_TYP = null;

	/** 第 51 List変数： l_GNR_TYP */
	public List l_GNR_TYP = null;

	/** 第 52 List変数： l_JOB_ODR_CANCEL_NO */
	public List l_JOB_ODR_CANCEL_NO = null;

	/** 第 53 List変数： l_w_PKG_UNIT_QTY */
	public List l_w_PKG_UNIT_QTY = null;

	/** 第 54 List変数： l_w_UNIT_QTY_TYP */
	public List l_w_UNIT_QTY_TYP = null;

	/** 第 55 List変数： l_CUST_CD */
	public List l_CUST_CD = null;

	/** 第 56 List変数： l_DLV_LOC_CD */
	public List l_DLV_LOC_CD = null;

	/** 第 57 List変数： l_DESINATED_DLV_DATE */
	public List l_DESINATED_DLV_DATE = null;

	/** 第 58 List変数： l_ODR_ACPT_DATE */
	public List l_ODR_ACPT_DATE = null;

	/** 第 59 List変数： l_VEND_CD */
	public List l_VEND_CD = null;

	/** 第 60 List変数： l_ODR_START_DATE */
	public List l_ODR_START_DATE = null;

	/** 第 61 List変数： l_PUCH_ODR_START_DATE */
	public List l_PUCH_ODR_START_DATE = null;

	/** 第 62 List変数： l_M_WH_PLANT_CD */
	public List l_M_WH_PLANT_CD = null;

	/** 第 63 List変数： l_TRANSPORT_LT */
	public List l_TRANSPORT_LT = null;

	/** 第 64 List変数： l_FIX_ODR_QTY */
	public List l_FIX_ODR_QTY = null;

	/** 第 65 List変数： l_UNOFFICIAL_ODR_QTY */
	public List l_UNOFFICIAL_ODR_QTY = null;

	/** 第 66 List変数： l_DEPOT_QTY */
	public List l_DEPOT_QTY = null;

	/** 第 67 List変数： l_CUST_ANAME */
	public List l_CUST_ANAME = null;

	/** 第 68 List変数： l_VEND_ANAME */
	public List l_VEND_ANAME = null;

	/** 第 69 List変数： l_ODR_DEPOT_CTL_NO */
	public List l_ODR_DEPOT_CTL_NO = null;

	/** 第 70 List変数： l_CUST_ODR_NO */
	public List l_CUST_ODR_NO = null;

	/** 第 71 List変数： l_ODR_CHARACTERISTIC */
	public List l_ODR_CHARACTERISTIC = null;

	/** 第 72 List変数： l_w_MRP_FLG */
	public List l_w_MRP_FLG = null;

	/** 第 73 List変数： l_w_ENV_FLG */
	public List l_w_ENV_FLG = null;

	/** 第 74 List変数： l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** 第 75 List変数： l_w_CHECK_FLG */
	public List l_w_CHECK_FLG = null;

	/** 第 76 List変数： l_w_QTY_FLG */
	public List l_w_QTY_FLG = null;

	/** 第 77 List変数： l_w_LOG_MODE_TYP */
	public List l_w_LOG_MODE_TYP = null;

	/** 第 78 List変数： l_w_OUTPUT_MODE_TYP */
	public List l_w_OUTPUT_MODE_TYP = null;

	/** 第 79 List変数： l_w_PROGRAM_CD */
	public List l_w_PROGRAM_CD = null;

	/** 第 80 List変数： l_w_FUNCTION_NAME */
	public List l_w_FUNCTION_NAME = null;

	/** 第 81 List変数： l_w_SHIP_LT */
	public List l_w_SHIP_LT = null;

	/** 第 82 List変数： l_w_CLASS_CODE */
	public List l_w_CLASS_CODE = null;

	/** 第 83 List変数： l_w_PARENT_ITEM_CD */
	public List l_w_PARENT_ITEM_CD = null;

	/** 第 84 List変数： l_w_COMP_ITEM_CD */
	public List l_w_COMP_ITEM_CD = null;

	/** 第 85 List変数： l_ODR_CD */
	public List l_ODR_CD = null;

	/** 第 86 List変数： l_h_INSTALL_FLG */
	public List l_h_INSTALL_FLG = null;

	/** 第 87 List変数： l_OD_NO */
	public List l_OD_NO = null;

	/** 第 88 List変数： l_INTEGRATE_ODR_QTY_ZH */
	public List l_INTEGRATE_ODR_QTY_ZH = null;

	/** 第 89 List変数： l_DEPOT_CTL_NO */
	public List l_DEPOT_CTL_NO = null;

	/** 第 90 List変数： l_w_UNCONFIRM_FLG */
	public List l_w_UNCONFIRM_FLG = null;

	/** 第 91 List変数： l_l_COUNT */
	public List l_l_COUNT = null;

	/** 第 92 List変数： l_ROW_COUNT */
	public List l_ROW_COUNT = null;

	/** 第 93 List変数： l_w_DM_CREATE_BASE_TBL */
	public List l_w_DM_CREATE_BASE_TBL = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getSTOCK_UNIT_3() { return m_STOCK_UNIT_3; }
	public String getSTOCK_UNIT_1() { return m_STOCK_UNIT_1; }
	public String getSTOCK_UNIT_4() { return m_STOCK_UNIT_4; }
	public String getSCDL_ISSUE_TOTAL() { return m_SCDL_ISSUE_TOTAL; }
	public String getSTOCK_UNIT_2() { return m_STOCK_UNIT_2; }
	public String getSCDL_RCV_TOTAL() { return m_SCDL_RCV_TOTAL; }
	public String getSTOCK_UNIT_5() { return m_STOCK_UNIT_5; }
	public String getrdoItemCd() { return m_rdoItemCd; }
	public String getrdoParentItemCd() { return m_rdoParentItemCd; }
	public String getrdoCompItemCd() { return m_rdoCompItemCd; }
	public String getw_PARENT_ITEM_NAME() { return m_w_PARENT_ITEM_NAME; }
	public String getw_COMP_ITEM_NAME() { return m_w_COMP_ITEM_NAME; }
	public String getcheckMrpFlg() { return m_checkMrpFlg; }
	public String getcheckProdPlan() { return m_checkProdPlan; }
	public String getcheckUncnfm() { return m_checkUncnfm; }
	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getcheckQty() { return m_checkQty; }
	public String geth_DM_CREATE_BASE_TBL() { return m_h_DM_CREATE_BASE_TBL; }
	public String getu_OPTION_ID() { return m_u_OPTION_ID; }
	public String getw_ITEM_NAME() { return m_w_ITEM_NAME; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getw_ITEM_CD() { return m_w_ITEM_CD; }
	public String getw_PLANT_NAME() { return m_w_PLANT_NAME; }
	public String getw_PLANT_CD() { return m_w_PLANT_CD; }
	public String getSCDL_ISSUE_TOTAL_FIX() { return m_SCDL_ISSUE_TOTAL_FIX; }
	public String getSCDL_ISSUE_TOTAL_NOFIX() { return m_SCDL_ISSUE_TOTAL_NOFIX; }
	public String getSCDL_RCV_TOTAL_FIX() { return m_SCDL_RCV_TOTAL_FIX; }
	public String getSCDL_RCV_TOTAL_NOFIX() { return m_SCDL_RCV_TOTAL_NOFIX; }
	public String getSORT_NO() { return m_SORT_NO; }
	public String getDELIVERY_DATE() { return m_DELIVERY_DATE; }
	public String getINSIDE_ODR_QTY() { return m_INSIDE_ODR_QTY; }
	public String getINTEGRATE_ODR_QTY() { return m_INTEGRATE_ODR_QTY; }
	public String getDEMAND_QTY() { return m_DEMAND_QTY; }
	public String getSTOCK_ODR_QTY() { return m_STOCK_ODR_QTY; }
	public String getADD_SUBTRACT() { return m_ADD_SUBTRACT; }
	public String getEFFECT_STOCK_QTY() { return m_EFFECT_STOCK_QTY; }
	public String getPURCHASE_UNIT() { return m_PURCHASE_UNIT; }
	public String getNUMBER_STATUS() { return m_NUMBER_STATUS; }
	public String getSTATUS() { return m_STATUS; }
	public String getWORK_ODR_CD() { return m_WORK_ODR_CD; }
	public String getPARENT_ORDER_NO() { return m_PARENT_ORDER_NO; }
	public String getPARENT_ORDER_ITEM_NO() { return m_PARENT_ORDER_ITEM_NO; }
	public String getPARENT_ORDER_ITEM_NAME() { return m_PARENT_ORDER_ITEM_NAME; }
	public String getDEMAND_NO() { return m_DEMAND_NO; }
	public String getORDER_NO() { return m_ORDER_NO; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getWH_CD() { return m_WH_CD; }
	public String getWH_NAME() { return m_WH_NAME; }
	public String getGNR() { return m_GNR; }
	public String getNUMBER_GNR_TYP() { return m_NUMBER_GNR_TYP; }
	public String getGNR_TYP() { return m_GNR_TYP; }
	public String getJOB_ODR_CANCEL_NO() { return m_JOB_ODR_CANCEL_NO; }
	public String getw_PKG_UNIT_QTY() { return m_w_PKG_UNIT_QTY; }
	public String getw_UNIT_QTY_TYP() { return m_w_UNIT_QTY_TYP; }
	public String getCUST_CD() { return m_CUST_CD; }
	public String getDLV_LOC_CD() { return m_DLV_LOC_CD; }
	public String getDESINATED_DLV_DATE() { return m_DESINATED_DLV_DATE; }
	public String getODR_ACPT_DATE() { return m_ODR_ACPT_DATE; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getODR_START_DATE() { return m_ODR_START_DATE; }
	public String getPUCH_ODR_START_DATE() { return m_PUCH_ODR_START_DATE; }
	public String getM_WH_PLANT_CD() { return m_M_WH_PLANT_CD; }
	public String getTRANSPORT_LT() { return m_TRANSPORT_LT; }
	public String getFIX_ODR_QTY() { return m_FIX_ODR_QTY; }
	public String getUNOFFICIAL_ODR_QTY() { return m_UNOFFICIAL_ODR_QTY; }
	public String getDEPOT_QTY() { return m_DEPOT_QTY; }
	public String getCUST_ANAME() { return m_CUST_ANAME; }
	public String getVEND_ANAME() { return m_VEND_ANAME; }
	public String getODR_DEPOT_CTL_NO() { return m_ODR_DEPOT_CTL_NO; }
	public String getCUST_ODR_NO() { return m_CUST_ODR_NO; }
	public String getODR_CHARACTERISTIC() { return m_ODR_CHARACTERISTIC; }
	public String getw_MRP_FLG() { return m_w_MRP_FLG; }
	public String getw_ENV_FLG() { return m_w_ENV_FLG; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getw_CHECK_FLG() { return m_w_CHECK_FLG; }
	public String getw_QTY_FLG() { return m_w_QTY_FLG; }
	public String getw_LOG_MODE_TYP() { return m_w_LOG_MODE_TYP; }
	public String getw_OUTPUT_MODE_TYP() { return m_w_OUTPUT_MODE_TYP; }
	public String getw_PROGRAM_CD() { return m_w_PROGRAM_CD; }
	public String getw_FUNCTION_NAME() { return m_w_FUNCTION_NAME; }
	public String getw_SHIP_LT() { return m_w_SHIP_LT; }
	public String getw_CLASS_CODE() { return m_w_CLASS_CODE; }
	public String getw_PARENT_ITEM_CD() { return m_w_PARENT_ITEM_CD; }
	public String getw_COMP_ITEM_CD() { return m_w_COMP_ITEM_CD; }
	public String getODR_CD() { return m_ODR_CD; }
	public String geth_INSTALL_FLG() { return m_h_INSTALL_FLG; }
	public String getOD_NO() { return m_OD_NO; }
	public String getINTEGRATE_ODR_QTY_ZH() { return m_INTEGRATE_ODR_QTY_ZH; }
	public String getDEPOT_CTL_NO() { return m_DEPOT_CTL_NO; }
	public String getw_UNCONFIRM_FLG() { return m_w_UNCONFIRM_FLG; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }
	public String getw_DM_CREATE_BASE_TBL() { return m_w_DM_CREATE_BASE_TBL; }

	public List getList_STOCK_UNIT_3() { return l_STOCK_UNIT_3; }
	public List getList_STOCK_UNIT_1() { return l_STOCK_UNIT_1; }
	public List getList_STOCK_UNIT_4() { return l_STOCK_UNIT_4; }
	public List getList_SCDL_ISSUE_TOTAL() { return l_SCDL_ISSUE_TOTAL; }
	public List getList_STOCK_UNIT_2() { return l_STOCK_UNIT_2; }
	public List getList_SCDL_RCV_TOTAL() { return l_SCDL_RCV_TOTAL; }
	public List getList_STOCK_UNIT_5() { return l_STOCK_UNIT_5; }
	public List getList_rdoItemCd() { return l_rdoItemCd; }
	public List getList_rdoParentItemCd() { return l_rdoParentItemCd; }
	public List getList_rdoCompItemCd() { return l_rdoCompItemCd; }
	public List getList_w_PARENT_ITEM_NAME() { return l_w_PARENT_ITEM_NAME; }
	public List getList_w_COMP_ITEM_NAME() { return l_w_COMP_ITEM_NAME; }
	public List getList_checkMrpFlg() { return l_checkMrpFlg; }
	public List getList_checkProdPlan() { return l_checkProdPlan; }
	public List getList_checkUncnfm() { return l_checkUncnfm; }
	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_checkQty() { return l_checkQty; }
	public List getList_h_DM_CREATE_BASE_TBL() { return l_h_DM_CREATE_BASE_TBL; }
	public List getList_u_OPTION_ID() { return l_u_OPTION_ID; }
	public List getList_w_ITEM_NAME() { return l_w_ITEM_NAME; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_w_ITEM_CD() { return l_w_ITEM_CD; }
	public List getList_w_PLANT_NAME() { return l_w_PLANT_NAME; }
	public List getList_w_PLANT_CD() { return l_w_PLANT_CD; }
	public List getList_SCDL_ISSUE_TOTAL_FIX() { return l_SCDL_ISSUE_TOTAL_FIX; }
	public List getList_SCDL_ISSUE_TOTAL_NOFIX() { return l_SCDL_ISSUE_TOTAL_NOFIX; }
	public List getList_SCDL_RCV_TOTAL_FIX() { return l_SCDL_RCV_TOTAL_FIX; }
	public List getList_SCDL_RCV_TOTAL_NOFIX() { return l_SCDL_RCV_TOTAL_NOFIX; }
	public List getList_SORT_NO() { return l_SORT_NO; }
	public List getList_DELIVERY_DATE() { return l_DELIVERY_DATE; }
	public List getList_INSIDE_ODR_QTY() { return l_INSIDE_ODR_QTY; }
	public List getList_INTEGRATE_ODR_QTY() { return l_INTEGRATE_ODR_QTY; }
	public List getList_DEMAND_QTY() { return l_DEMAND_QTY; }
	public List getList_STOCK_ODR_QTY() { return l_STOCK_ODR_QTY; }
	public List getList_ADD_SUBTRACT() { return l_ADD_SUBTRACT; }
	public List getList_EFFECT_STOCK_QTY() { return l_EFFECT_STOCK_QTY; }
	public List getList_PURCHASE_UNIT() { return l_PURCHASE_UNIT; }
	public List getList_NUMBER_STATUS() { return l_NUMBER_STATUS; }
	public List getList_STATUS() { return l_STATUS; }
	public List getList_WORK_ODR_CD() { return l_WORK_ODR_CD; }
	public List getList_PARENT_ORDER_NO() { return l_PARENT_ORDER_NO; }
	public List getList_PARENT_ORDER_ITEM_NO() { return l_PARENT_ORDER_ITEM_NO; }
	public List getList_PARENT_ORDER_ITEM_NAME() { return l_PARENT_ORDER_ITEM_NAME; }
	public List getList_DEMAND_NO() { return l_DEMAND_NO; }
	public List getList_ORDER_NO() { return l_ORDER_NO; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_WH_CD() { return l_WH_CD; }
	public List getList_WH_NAME() { return l_WH_NAME; }
	public List getList_GNR() { return l_GNR; }
	public List getList_NUMBER_GNR_TYP() { return l_NUMBER_GNR_TYP; }
	public List getList_GNR_TYP() { return l_GNR_TYP; }
	public List getList_JOB_ODR_CANCEL_NO() { return l_JOB_ODR_CANCEL_NO; }
	public List getList_w_PKG_UNIT_QTY() { return l_w_PKG_UNIT_QTY; }
	public List getList_w_UNIT_QTY_TYP() { return l_w_UNIT_QTY_TYP; }
	public List getList_CUST_CD() { return l_CUST_CD; }
	public List getList_DLV_LOC_CD() { return l_DLV_LOC_CD; }
	public List getList_DESINATED_DLV_DATE() { return l_DESINATED_DLV_DATE; }
	public List getList_ODR_ACPT_DATE() { return l_ODR_ACPT_DATE; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_ODR_START_DATE() { return l_ODR_START_DATE; }
	public List getList_PUCH_ODR_START_DATE() { return l_PUCH_ODR_START_DATE; }
	public List getList_M_WH_PLANT_CD() { return l_M_WH_PLANT_CD; }
	public List getList_TRANSPORT_LT() { return l_TRANSPORT_LT; }
	public List getList_FIX_ODR_QTY() { return l_FIX_ODR_QTY; }
	public List getList_UNOFFICIAL_ODR_QTY() { return l_UNOFFICIAL_ODR_QTY; }
	public List getList_DEPOT_QTY() { return l_DEPOT_QTY; }
	public List getList_CUST_ANAME() { return l_CUST_ANAME; }
	public List getList_VEND_ANAME() { return l_VEND_ANAME; }
	public List getList_ODR_DEPOT_CTL_NO() { return l_ODR_DEPOT_CTL_NO; }
	public List getList_CUST_ODR_NO() { return l_CUST_ODR_NO; }
	public List getList_ODR_CHARACTERISTIC() { return l_ODR_CHARACTERISTIC; }
	public List getList_w_MRP_FLG() { return l_w_MRP_FLG; }
	public List getList_w_ENV_FLG() { return l_w_ENV_FLG; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_w_CHECK_FLG() { return l_w_CHECK_FLG; }
	public List getList_w_QTY_FLG() { return l_w_QTY_FLG; }
	public List getList_w_LOG_MODE_TYP() { return l_w_LOG_MODE_TYP; }
	public List getList_w_OUTPUT_MODE_TYP() { return l_w_OUTPUT_MODE_TYP; }
	public List getList_w_PROGRAM_CD() { return l_w_PROGRAM_CD; }
	public List getList_w_FUNCTION_NAME() { return l_w_FUNCTION_NAME; }
	public List getList_w_SHIP_LT() { return l_w_SHIP_LT; }
	public List getList_w_CLASS_CODE() { return l_w_CLASS_CODE; }
	public List getList_w_PARENT_ITEM_CD() { return l_w_PARENT_ITEM_CD; }
	public List getList_w_COMP_ITEM_CD() { return l_w_COMP_ITEM_CD; }
	public List getList_ODR_CD() { return l_ODR_CD; }
	public List getList_h_INSTALL_FLG() { return l_h_INSTALL_FLG; }
	public List getList_OD_NO() { return l_OD_NO; }
	public List getList_INTEGRATE_ODR_QTY_ZH() { return l_INTEGRATE_ODR_QTY_ZH; }
	public List getList_DEPOT_CTL_NO() { return l_DEPOT_CTL_NO; }
	public List getList_w_UNCONFIRM_FLG() { return l_w_UNCONFIRM_FLG; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }
	public List getList_w_DM_CREATE_BASE_TBL() { return l_w_DM_CREATE_BASE_TBL; }

	public void setSTOCK_UNIT_3(String val) { m_STOCK_UNIT_3 = val; }
	public void setSTOCK_UNIT_1(String val) { m_STOCK_UNIT_1 = val; }
	public void setSTOCK_UNIT_4(String val) { m_STOCK_UNIT_4 = val; }
	public void setSCDL_ISSUE_TOTAL(String val) { m_SCDL_ISSUE_TOTAL = val; }
	public void setSTOCK_UNIT_2(String val) { m_STOCK_UNIT_2 = val; }
	public void setSCDL_RCV_TOTAL(String val) { m_SCDL_RCV_TOTAL = val; }
	public void setSTOCK_UNIT_5(String val) { m_STOCK_UNIT_5 = val; }
	public void setrdoItemCd(String val) { m_rdoItemCd = val; }
	public void setrdoParentItemCd(String val) { m_rdoParentItemCd = val; }
	public void setrdoCompItemCd(String val) { m_rdoCompItemCd = val; }
	public void setw_PARENT_ITEM_NAME(String val) { m_w_PARENT_ITEM_NAME = val; }
	public void setw_COMP_ITEM_NAME(String val) { m_w_COMP_ITEM_NAME = val; }
	public void setcheckMrpFlg(String val) { m_checkMrpFlg = val; }
	public void setcheckProdPlan(String val) { m_checkProdPlan = val; }
	public void setcheckUncnfm(String val) { m_checkUncnfm = val; }
	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setcheckQty(String val) { m_checkQty = val; }
	public void seth_DM_CREATE_BASE_TBL(String val) { m_h_DM_CREATE_BASE_TBL = val; }
	public void setu_OPTION_ID(String val) { m_u_OPTION_ID = val; }
	public void setw_ITEM_NAME(String val) { m_w_ITEM_NAME = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setw_ITEM_CD(String val) { m_w_ITEM_CD = val; }
	public void setw_PLANT_NAME(String val) { m_w_PLANT_NAME = val; }
	public void setw_PLANT_CD(String val) { m_w_PLANT_CD = val; }
	public void setSCDL_ISSUE_TOTAL_FIX(String val) { m_SCDL_ISSUE_TOTAL_FIX = val; }
	public void setSCDL_ISSUE_TOTAL_NOFIX(String val) { m_SCDL_ISSUE_TOTAL_NOFIX = val; }
	public void setSCDL_RCV_TOTAL_FIX(String val) { m_SCDL_RCV_TOTAL_FIX = val; }
	public void setSCDL_RCV_TOTAL_NOFIX(String val) { m_SCDL_RCV_TOTAL_NOFIX = val; }
	public void setSORT_NO(String val) { m_SORT_NO = val; }
	public void setDELIVERY_DATE(String val) { m_DELIVERY_DATE = val; }
	public void setINSIDE_ODR_QTY(String val) { m_INSIDE_ODR_QTY = val; }
	public void setINTEGRATE_ODR_QTY(String val) { m_INTEGRATE_ODR_QTY = val; }
	public void setDEMAND_QTY(String val) { m_DEMAND_QTY = val; }
	public void setSTOCK_ODR_QTY(String val) { m_STOCK_ODR_QTY = val; }
	public void setADD_SUBTRACT(String val) { m_ADD_SUBTRACT = val; }
	public void setEFFECT_STOCK_QTY(String val) { m_EFFECT_STOCK_QTY = val; }
	public void setPURCHASE_UNIT(String val) { m_PURCHASE_UNIT = val; }
	public void setNUMBER_STATUS(String val) { m_NUMBER_STATUS = val; }
	public void setSTATUS(String val) { m_STATUS = val; }
	public void setWORK_ODR_CD(String val) { m_WORK_ODR_CD = val; }
	public void setPARENT_ORDER_NO(String val) { m_PARENT_ORDER_NO = val; }
	public void setPARENT_ORDER_ITEM_NO(String val) { m_PARENT_ORDER_ITEM_NO = val; }
	public void setPARENT_ORDER_ITEM_NAME(String val) { m_PARENT_ORDER_ITEM_NAME = val; }
	public void setDEMAND_NO(String val) { m_DEMAND_NO = val; }
	public void setORDER_NO(String val) { m_ORDER_NO = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setWH_CD(String val) { m_WH_CD = val; }
	public void setWH_NAME(String val) { m_WH_NAME = val; }
	public void setGNR(String val) { m_GNR = val; }
	public void setNUMBER_GNR_TYP(String val) { m_NUMBER_GNR_TYP = val; }
	public void setGNR_TYP(String val) { m_GNR_TYP = val; }
	public void setJOB_ODR_CANCEL_NO(String val) { m_JOB_ODR_CANCEL_NO = val; }
	public void setw_PKG_UNIT_QTY(String val) { m_w_PKG_UNIT_QTY = val; }
	public void setw_UNIT_QTY_TYP(String val) { m_w_UNIT_QTY_TYP = val; }
	public void setCUST_CD(String val) { m_CUST_CD = val; }
	public void setDLV_LOC_CD(String val) { m_DLV_LOC_CD = val; }
	public void setDESINATED_DLV_DATE(String val) { m_DESINATED_DLV_DATE = val; }
	public void setODR_ACPT_DATE(String val) { m_ODR_ACPT_DATE = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void setODR_START_DATE(String val) { m_ODR_START_DATE = val; }
	public void setPUCH_ODR_START_DATE(String val) { m_PUCH_ODR_START_DATE = val; }
	public void setM_WH_PLANT_CD(String val) { m_M_WH_PLANT_CD = val; }
	public void setTRANSPORT_LT(String val) { m_TRANSPORT_LT = val; }
	public void setFIX_ODR_QTY(String val) { m_FIX_ODR_QTY = val; }
	public void setUNOFFICIAL_ODR_QTY(String val) { m_UNOFFICIAL_ODR_QTY = val; }
	public void setDEPOT_QTY(String val) { m_DEPOT_QTY = val; }
	public void setCUST_ANAME(String val) { m_CUST_ANAME = val; }
	public void setVEND_ANAME(String val) { m_VEND_ANAME = val; }
	public void setODR_DEPOT_CTL_NO(String val) { m_ODR_DEPOT_CTL_NO = val; }
	public void setCUST_ODR_NO(String val) { m_CUST_ODR_NO = val; }
	public void setODR_CHARACTERISTIC(String val) { m_ODR_CHARACTERISTIC = val; }
	public void setw_MRP_FLG(String val) { m_w_MRP_FLG = val; }
	public void setw_ENV_FLG(String val) { m_w_ENV_FLG = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setw_CHECK_FLG(String val) { m_w_CHECK_FLG = val; }
	public void setw_QTY_FLG(String val) { m_w_QTY_FLG = val; }
	public void setw_LOG_MODE_TYP(String val) { m_w_LOG_MODE_TYP = val; }
	public void setw_OUTPUT_MODE_TYP(String val) { m_w_OUTPUT_MODE_TYP = val; }
	public void setw_PROGRAM_CD(String val) { m_w_PROGRAM_CD = val; }
	public void setw_FUNCTION_NAME(String val) { m_w_FUNCTION_NAME = val; }
	public void setw_SHIP_LT(String val) { m_w_SHIP_LT = val; }
	public void setw_CLASS_CODE(String val) { m_w_CLASS_CODE = val; }
	public void setw_PARENT_ITEM_CD(String val) { m_w_PARENT_ITEM_CD = val; }
	public void setw_COMP_ITEM_CD(String val) { m_w_COMP_ITEM_CD = val; }
	public void setODR_CD(String val) { m_ODR_CD = val; }
	public void seth_INSTALL_FLG(String val) { m_h_INSTALL_FLG = val; }
	public void setOD_NO(String val) { m_OD_NO = val; }
	public void setINTEGRATE_ODR_QTY_ZH(String val) { m_INTEGRATE_ODR_QTY_ZH = val; }
	public void setDEPOT_CTL_NO(String val) { m_DEPOT_CTL_NO = val; }
	public void setw_UNCONFIRM_FLG(String val) { m_w_UNCONFIRM_FLG = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }
	public void setw_DM_CREATE_BASE_TBL(String val) { m_w_DM_CREATE_BASE_TBL = val; }


	public void setList_STOCK_UNIT_3(List list) { l_STOCK_UNIT_3 = list; }
	public void setList_STOCK_UNIT_1(List list) { l_STOCK_UNIT_1 = list; }
	public void setList_STOCK_UNIT_4(List list) { l_STOCK_UNIT_4 = list; }
	public void setList_SCDL_ISSUE_TOTAL(List list) { l_SCDL_ISSUE_TOTAL = list; }
	public void setList_STOCK_UNIT_2(List list) { l_STOCK_UNIT_2 = list; }
	public void setList_SCDL_RCV_TOTAL(List list) { l_SCDL_RCV_TOTAL = list; }
	public void setList_STOCK_UNIT_5(List list) { l_STOCK_UNIT_5 = list; }
	public void setList_rdoItemCd(List list) { l_rdoItemCd = list; }
	public void setList_rdoParentItemCd(List list) { l_rdoParentItemCd = list; }
	public void setList_rdoCompItemCd(List list) { l_rdoCompItemCd = list; }
	public void setList_w_PARENT_ITEM_NAME(List list) { l_w_PARENT_ITEM_NAME = list; }
	public void setList_w_COMP_ITEM_NAME(List list) { l_w_COMP_ITEM_NAME = list; }
	public void setList_checkMrpFlg(List list) { l_checkMrpFlg = list; }
	public void setList_checkProdPlan(List list) { l_checkProdPlan = list; }
	public void setList_checkUncnfm(List list) { l_checkUncnfm = list; }
	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_checkQty(List list) { l_checkQty = list; }
	public void setList_h_DM_CREATE_BASE_TBL(List list) { l_h_DM_CREATE_BASE_TBL = list; }
	public void setList_u_OPTION_ID(List list) { l_u_OPTION_ID = list; }
	public void setList_w_ITEM_NAME(List list) { l_w_ITEM_NAME = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_w_ITEM_CD(List list) { l_w_ITEM_CD = list; }
	public void setList_w_PLANT_NAME(List list) { l_w_PLANT_NAME = list; }
	public void setList_w_PLANT_CD(List list) { l_w_PLANT_CD = list; }
	public void setList_SCDL_ISSUE_TOTAL_FIX(List list) { l_SCDL_ISSUE_TOTAL_FIX = list; }
	public void setList_SCDL_ISSUE_TOTAL_NOFIX(List list) { l_SCDL_ISSUE_TOTAL_NOFIX = list; }
	public void setList_SCDL_RCV_TOTAL_FIX(List list) { l_SCDL_RCV_TOTAL_FIX = list; }
	public void setList_SCDL_RCV_TOTAL_NOFIX(List list) { l_SCDL_RCV_TOTAL_NOFIX = list; }
	public void setList_SORT_NO(List list) { l_SORT_NO = list; }
	public void setList_DELIVERY_DATE(List list) { l_DELIVERY_DATE = list; }
	public void setList_INSIDE_ODR_QTY(List list) { l_INSIDE_ODR_QTY = list; }
	public void setList_INTEGRATE_ODR_QTY(List list) { l_INTEGRATE_ODR_QTY = list; }
	public void setList_DEMAND_QTY(List list) { l_DEMAND_QTY = list; }
	public void setList_STOCK_ODR_QTY(List list) { l_STOCK_ODR_QTY = list; }
	public void setList_ADD_SUBTRACT(List list) { l_ADD_SUBTRACT = list; }
	public void setList_EFFECT_STOCK_QTY(List list) { l_EFFECT_STOCK_QTY = list; }
	public void setList_PURCHASE_UNIT(List list) { l_PURCHASE_UNIT = list; }
	public void setList_NUMBER_STATUS(List list) { l_NUMBER_STATUS = list; }
	public void setList_STATUS(List list) { l_STATUS = list; }
	public void setList_WORK_ODR_CD(List list) { l_WORK_ODR_CD = list; }
	public void setList_PARENT_ORDER_NO(List list) { l_PARENT_ORDER_NO = list; }
	public void setList_PARENT_ORDER_ITEM_NO(List list) { l_PARENT_ORDER_ITEM_NO = list; }
	public void setList_PARENT_ORDER_ITEM_NAME(List list) { l_PARENT_ORDER_ITEM_NAME = list; }
	public void setList_DEMAND_NO(List list) { l_DEMAND_NO = list; }
	public void setList_ORDER_NO(List list) { l_ORDER_NO = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_WH_CD(List list) { l_WH_CD = list; }
	public void setList_WH_NAME(List list) { l_WH_NAME = list; }
	public void setList_GNR(List list) { l_GNR = list; }
	public void setList_NUMBER_GNR_TYP(List list) { l_NUMBER_GNR_TYP = list; }
	public void setList_GNR_TYP(List list) { l_GNR_TYP = list; }
	public void setList_JOB_ODR_CANCEL_NO(List list) { l_JOB_ODR_CANCEL_NO = list; }
	public void setList_w_PKG_UNIT_QTY(List list) { l_w_PKG_UNIT_QTY = list; }
	public void setList_w_UNIT_QTY_TYP(List list) { l_w_UNIT_QTY_TYP = list; }
	public void setList_CUST_CD(List list) { l_CUST_CD = list; }
	public void setList_DLV_LOC_CD(List list) { l_DLV_LOC_CD = list; }
	public void setList_DESINATED_DLV_DATE(List list) { l_DESINATED_DLV_DATE = list; }
	public void setList_ODR_ACPT_DATE(List list) { l_ODR_ACPT_DATE = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_ODR_START_DATE(List list) { l_ODR_START_DATE = list; }
	public void setList_PUCH_ODR_START_DATE(List list) { l_PUCH_ODR_START_DATE = list; }
	public void setList_M_WH_PLANT_CD(List list) { l_M_WH_PLANT_CD = list; }
	public void setList_TRANSPORT_LT(List list) { l_TRANSPORT_LT = list; }
	public void setList_FIX_ODR_QTY(List list) { l_FIX_ODR_QTY = list; }
	public void setList_UNOFFICIAL_ODR_QTY(List list) { l_UNOFFICIAL_ODR_QTY = list; }
	public void setList_DEPOT_QTY(List list) { l_DEPOT_QTY = list; }
	public void setList_CUST_ANAME(List list) { l_CUST_ANAME = list; }
	public void setList_VEND_ANAME(List list) { l_VEND_ANAME = list; }
	public void setList_ODR_DEPOT_CTL_NO(List list) { l_ODR_DEPOT_CTL_NO = list; }
	public void setList_CUST_ODR_NO(List list) { l_CUST_ODR_NO = list; }
	public void setList_ODR_CHARACTERISTIC(List list) { l_ODR_CHARACTERISTIC = list; }
	public void setList_w_MRP_FLG(List list) { l_w_MRP_FLG = list; }
	public void setList_w_ENV_FLG(List list) { l_w_ENV_FLG = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_w_CHECK_FLG(List list) { l_w_CHECK_FLG = list; }
	public void setList_w_QTY_FLG(List list) { l_w_QTY_FLG = list; }
	public void setList_w_LOG_MODE_TYP(List list) { l_w_LOG_MODE_TYP = list; }
	public void setList_w_OUTPUT_MODE_TYP(List list) { l_w_OUTPUT_MODE_TYP = list; }
	public void setList_w_PROGRAM_CD(List list) { l_w_PROGRAM_CD = list; }
	public void setList_w_FUNCTION_NAME(List list) { l_w_FUNCTION_NAME = list; }
	public void setList_w_SHIP_LT(List list) { l_w_SHIP_LT = list; }
	public void setList_w_CLASS_CODE(List list) { l_w_CLASS_CODE = list; }
	public void setList_w_PARENT_ITEM_CD(List list) { l_w_PARENT_ITEM_CD = list; }
	public void setList_w_COMP_ITEM_CD(List list) { l_w_COMP_ITEM_CD = list; }
	public void setList_ODR_CD(List list) { l_ODR_CD = list; }
	public void setList_h_INSTALL_FLG(List list) { l_h_INSTALL_FLG = list; }
	public void setList_OD_NO(List list) { l_OD_NO = list; }
	public void setList_INTEGRATE_ODR_QTY_ZH(List list) { l_INTEGRATE_ODR_QTY_ZH = list; }
	public void setList_DEPOT_CTL_NO(List list) { l_DEPOT_CTL_NO = list; }
	public void setList_w_UNCONFIRM_FLG(List list) { l_w_UNCONFIRM_FLG = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }
	public void setList_w_DM_CREATE_BASE_TBL(List list) { l_w_DM_CREATE_BASE_TBL = list; }

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
			l_STOCK_UNIT_3.add(((AG0050010Struct) list.get(i)).getSTOCK_UNIT_3());
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
			l_STOCK_UNIT_1.add(((AG0050010Struct) list.get(i)).getSTOCK_UNIT_1());
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
			l_STOCK_UNIT_4.add(((AG0050010Struct) list.get(i)).getSTOCK_UNIT_4());
		}
		return size;
	}
	public int setL2L_SCDL_ISSUE_TOTAL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SCDL_ISSUE_TOTAL == null) {
			l_SCDL_ISSUE_TOTAL = new ArrayList();
		} else {
			l_SCDL_ISSUE_TOTAL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SCDL_ISSUE_TOTAL.add(((AG0050010Struct) list.get(i)).getSCDL_ISSUE_TOTAL());
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
			l_STOCK_UNIT_2.add(((AG0050010Struct) list.get(i)).getSTOCK_UNIT_2());
		}
		return size;
	}
	public int setL2L_SCDL_RCV_TOTAL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SCDL_RCV_TOTAL == null) {
			l_SCDL_RCV_TOTAL = new ArrayList();
		} else {
			l_SCDL_RCV_TOTAL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SCDL_RCV_TOTAL.add(((AG0050010Struct) list.get(i)).getSCDL_RCV_TOTAL());
		}
		return size;
	}
	public int setL2L_STOCK_UNIT_5(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_UNIT_5 == null) {
			l_STOCK_UNIT_5 = new ArrayList();
		} else {
			l_STOCK_UNIT_5.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_UNIT_5.add(((AG0050010Struct) list.get(i)).getSTOCK_UNIT_5());
		}
		return size;
	}
	public int setL2L_rdoItemCd(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoItemCd == null) {
			l_rdoItemCd = new ArrayList();
		} else {
			l_rdoItemCd.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoItemCd.add(((AG0050010Struct) list.get(i)).getrdoItemCd());
		}
		return size;
	}
	public int setL2L_rdoParentItemCd(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoParentItemCd == null) {
			l_rdoParentItemCd = new ArrayList();
		} else {
			l_rdoParentItemCd.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoParentItemCd.add(((AG0050010Struct) list.get(i)).getrdoParentItemCd());
		}
		return size;
	}
	public int setL2L_rdoCompItemCd(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoCompItemCd == null) {
			l_rdoCompItemCd = new ArrayList();
		} else {
			l_rdoCompItemCd.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoCompItemCd.add(((AG0050010Struct) list.get(i)).getrdoCompItemCd());
		}
		return size;
	}
	public int setL2L_w_PARENT_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_PARENT_ITEM_NAME == null) {
			l_w_PARENT_ITEM_NAME = new ArrayList();
		} else {
			l_w_PARENT_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_PARENT_ITEM_NAME.add(((AG0050010Struct) list.get(i)).getw_PARENT_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_w_COMP_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_COMP_ITEM_NAME == null) {
			l_w_COMP_ITEM_NAME = new ArrayList();
		} else {
			l_w_COMP_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_COMP_ITEM_NAME.add(((AG0050010Struct) list.get(i)).getw_COMP_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_checkMrpFlg(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_checkMrpFlg == null) {
			l_checkMrpFlg = new ArrayList();
		} else {
			l_checkMrpFlg.clear();
		}
		for (int i = 0; i < size; i++) {
			l_checkMrpFlg.add(((AG0050010Struct) list.get(i)).getcheckMrpFlg());
		}
		return size;
	}
	public int setL2L_checkProdPlan(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_checkProdPlan == null) {
			l_checkProdPlan = new ArrayList();
		} else {
			l_checkProdPlan.clear();
		}
		for (int i = 0; i < size; i++) {
			l_checkProdPlan.add(((AG0050010Struct) list.get(i)).getcheckProdPlan());
		}
		return size;
	}
	public int setL2L_checkUncnfm(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_checkUncnfm == null) {
			l_checkUncnfm = new ArrayList();
		} else {
			l_checkUncnfm.clear();
		}
		for (int i = 0; i < size; i++) {
			l_checkUncnfm.add(((AG0050010Struct) list.get(i)).getcheckUncnfm());
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
			l_DOWNLOAD_FILE.add(((AG0050010Struct) list.get(i)).getDOWNLOAD_FILE());
		}
		return size;
	}
	public int setL2L_checkQty(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_checkQty == null) {
			l_checkQty = new ArrayList();
		} else {
			l_checkQty.clear();
		}
		for (int i = 0; i < size; i++) {
			l_checkQty.add(((AG0050010Struct) list.get(i)).getcheckQty());
		}
		return size;
	}
	public int setL2L_h_DM_CREATE_BASE_TBL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_DM_CREATE_BASE_TBL == null) {
			l_h_DM_CREATE_BASE_TBL = new ArrayList();
		} else {
			l_h_DM_CREATE_BASE_TBL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_DM_CREATE_BASE_TBL.add(((AG0050010Struct) list.get(i)).geth_DM_CREATE_BASE_TBL());
		}
		return size;
	}
	public int setL2L_u_OPTION_ID(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_u_OPTION_ID == null) {
			l_u_OPTION_ID = new ArrayList();
		} else {
			l_u_OPTION_ID.clear();
		}
		for (int i = 0; i < size; i++) {
			l_u_OPTION_ID.add(((AG0050010Struct) list.get(i)).getu_OPTION_ID());
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
			l_w_ITEM_NAME.add(((AG0050010Struct) list.get(i)).getw_ITEM_NAME());
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
			l_STOCK_UNIT.add(((AG0050010Struct) list.get(i)).getSTOCK_UNIT());
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
			l_w_ITEM_CD.add(((AG0050010Struct) list.get(i)).getw_ITEM_CD());
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
			l_w_PLANT_NAME.add(((AG0050010Struct) list.get(i)).getw_PLANT_NAME());
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
			l_w_PLANT_CD.add(((AG0050010Struct) list.get(i)).getw_PLANT_CD());
		}
		return size;
	}
	public int setL2L_SCDL_ISSUE_TOTAL_FIX(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SCDL_ISSUE_TOTAL_FIX == null) {
			l_SCDL_ISSUE_TOTAL_FIX = new ArrayList();
		} else {
			l_SCDL_ISSUE_TOTAL_FIX.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SCDL_ISSUE_TOTAL_FIX.add(((AG0050010Struct) list.get(i)).getSCDL_ISSUE_TOTAL_FIX());
		}
		return size;
	}
	public int setL2L_SCDL_ISSUE_TOTAL_NOFIX(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SCDL_ISSUE_TOTAL_NOFIX == null) {
			l_SCDL_ISSUE_TOTAL_NOFIX = new ArrayList();
		} else {
			l_SCDL_ISSUE_TOTAL_NOFIX.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SCDL_ISSUE_TOTAL_NOFIX.add(((AG0050010Struct) list.get(i)).getSCDL_ISSUE_TOTAL_NOFIX());
		}
		return size;
	}
	public int setL2L_SCDL_RCV_TOTAL_FIX(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SCDL_RCV_TOTAL_FIX == null) {
			l_SCDL_RCV_TOTAL_FIX = new ArrayList();
		} else {
			l_SCDL_RCV_TOTAL_FIX.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SCDL_RCV_TOTAL_FIX.add(((AG0050010Struct) list.get(i)).getSCDL_RCV_TOTAL_FIX());
		}
		return size;
	}
	public int setL2L_SCDL_RCV_TOTAL_NOFIX(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SCDL_RCV_TOTAL_NOFIX == null) {
			l_SCDL_RCV_TOTAL_NOFIX = new ArrayList();
		} else {
			l_SCDL_RCV_TOTAL_NOFIX.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SCDL_RCV_TOTAL_NOFIX.add(((AG0050010Struct) list.get(i)).getSCDL_RCV_TOTAL_NOFIX());
		}
		return size;
	}
	public int setL2L_SORT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SORT_NO == null) {
			l_SORT_NO = new ArrayList();
		} else {
			l_SORT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SORT_NO.add(((AG0050010Struct) list.get(i)).getSORT_NO());
		}
		return size;
	}
	public int setL2L_DELIVERY_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DELIVERY_DATE == null) {
			l_DELIVERY_DATE = new ArrayList();
		} else {
			l_DELIVERY_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DELIVERY_DATE.add(((AG0050010Struct) list.get(i)).getDELIVERY_DATE());
		}
		return size;
	}
	public int setL2L_INSIDE_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INSIDE_ODR_QTY == null) {
			l_INSIDE_ODR_QTY = new ArrayList();
		} else {
			l_INSIDE_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INSIDE_ODR_QTY.add(((AG0050010Struct) list.get(i)).getINSIDE_ODR_QTY());
		}
		return size;
	}
	public int setL2L_INTEGRATE_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INTEGRATE_ODR_QTY == null) {
			l_INTEGRATE_ODR_QTY = new ArrayList();
		} else {
			l_INTEGRATE_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INTEGRATE_ODR_QTY.add(((AG0050010Struct) list.get(i)).getINTEGRATE_ODR_QTY());
		}
		return size;
	}
	public int setL2L_DEMAND_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEMAND_QTY == null) {
			l_DEMAND_QTY = new ArrayList();
		} else {
			l_DEMAND_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEMAND_QTY.add(((AG0050010Struct) list.get(i)).getDEMAND_QTY());
		}
		return size;
	}
	public int setL2L_STOCK_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_ODR_QTY == null) {
			l_STOCK_ODR_QTY = new ArrayList();
		} else {
			l_STOCK_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_ODR_QTY.add(((AG0050010Struct) list.get(i)).getSTOCK_ODR_QTY());
		}
		return size;
	}
	public int setL2L_ADD_SUBTRACT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ADD_SUBTRACT == null) {
			l_ADD_SUBTRACT = new ArrayList();
		} else {
			l_ADD_SUBTRACT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ADD_SUBTRACT.add(((AG0050010Struct) list.get(i)).getADD_SUBTRACT());
		}
		return size;
	}
	public int setL2L_EFFECT_STOCK_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EFFECT_STOCK_QTY == null) {
			l_EFFECT_STOCK_QTY = new ArrayList();
		} else {
			l_EFFECT_STOCK_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EFFECT_STOCK_QTY.add(((AG0050010Struct) list.get(i)).getEFFECT_STOCK_QTY());
		}
		return size;
	}
	public int setL2L_PURCHASE_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PURCHASE_UNIT == null) {
			l_PURCHASE_UNIT = new ArrayList();
		} else {
			l_PURCHASE_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PURCHASE_UNIT.add(((AG0050010Struct) list.get(i)).getPURCHASE_UNIT());
		}
		return size;
	}
	public int setL2L_NUMBER_STATUS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NUMBER_STATUS == null) {
			l_NUMBER_STATUS = new ArrayList();
		} else {
			l_NUMBER_STATUS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NUMBER_STATUS.add(((AG0050010Struct) list.get(i)).getNUMBER_STATUS());
		}
		return size;
	}
	public int setL2L_STATUS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STATUS == null) {
			l_STATUS = new ArrayList();
		} else {
			l_STATUS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STATUS.add(((AG0050010Struct) list.get(i)).getSTATUS());
		}
		return size;
	}
	public int setL2L_WORK_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WORK_ODR_CD == null) {
			l_WORK_ODR_CD = new ArrayList();
		} else {
			l_WORK_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WORK_ODR_CD.add(((AG0050010Struct) list.get(i)).getWORK_ODR_CD());
		}
		return size;
	}
	public int setL2L_PARENT_ORDER_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PARENT_ORDER_NO == null) {
			l_PARENT_ORDER_NO = new ArrayList();
		} else {
			l_PARENT_ORDER_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PARENT_ORDER_NO.add(((AG0050010Struct) list.get(i)).getPARENT_ORDER_NO());
		}
		return size;
	}
	public int setL2L_PARENT_ORDER_ITEM_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PARENT_ORDER_ITEM_NO == null) {
			l_PARENT_ORDER_ITEM_NO = new ArrayList();
		} else {
			l_PARENT_ORDER_ITEM_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PARENT_ORDER_ITEM_NO.add(((AG0050010Struct) list.get(i)).getPARENT_ORDER_ITEM_NO());
		}
		return size;
	}
	public int setL2L_PARENT_ORDER_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PARENT_ORDER_ITEM_NAME == null) {
			l_PARENT_ORDER_ITEM_NAME = new ArrayList();
		} else {
			l_PARENT_ORDER_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PARENT_ORDER_ITEM_NAME.add(((AG0050010Struct) list.get(i)).getPARENT_ORDER_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_DEMAND_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEMAND_NO == null) {
			l_DEMAND_NO = new ArrayList();
		} else {
			l_DEMAND_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEMAND_NO.add(((AG0050010Struct) list.get(i)).getDEMAND_NO());
		}
		return size;
	}
	public int setL2L_ORDER_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ORDER_NO == null) {
			l_ORDER_NO = new ArrayList();
		} else {
			l_ORDER_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ORDER_NO.add(((AG0050010Struct) list.get(i)).getORDER_NO());
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
			l_JOB_ODR_CD.add(((AG0050010Struct) list.get(i)).getJOB_ODR_CD());
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
			l_WH_CD.add(((AG0050010Struct) list.get(i)).getWH_CD());
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
			l_WH_NAME.add(((AG0050010Struct) list.get(i)).getWH_NAME());
		}
		return size;
	}
	public int setL2L_GNR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_GNR == null) {
			l_GNR = new ArrayList();
		} else {
			l_GNR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_GNR.add(((AG0050010Struct) list.get(i)).getGNR());
		}
		return size;
	}
	public int setL2L_NUMBER_GNR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NUMBER_GNR_TYP == null) {
			l_NUMBER_GNR_TYP = new ArrayList();
		} else {
			l_NUMBER_GNR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NUMBER_GNR_TYP.add(((AG0050010Struct) list.get(i)).getNUMBER_GNR_TYP());
		}
		return size;
	}
	public int setL2L_GNR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_GNR_TYP == null) {
			l_GNR_TYP = new ArrayList();
		} else {
			l_GNR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_GNR_TYP.add(((AG0050010Struct) list.get(i)).getGNR_TYP());
		}
		return size;
	}
	public int setL2L_JOB_ODR_CANCEL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_CANCEL_NO == null) {
			l_JOB_ODR_CANCEL_NO = new ArrayList();
		} else {
			l_JOB_ODR_CANCEL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_CANCEL_NO.add(((AG0050010Struct) list.get(i)).getJOB_ODR_CANCEL_NO());
		}
		return size;
	}
	public int setL2L_w_PKG_UNIT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_PKG_UNIT_QTY == null) {
			l_w_PKG_UNIT_QTY = new ArrayList();
		} else {
			l_w_PKG_UNIT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_PKG_UNIT_QTY.add(((AG0050010Struct) list.get(i)).getw_PKG_UNIT_QTY());
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
			l_w_UNIT_QTY_TYP.add(((AG0050010Struct) list.get(i)).getw_UNIT_QTY_TYP());
		}
		return size;
	}
	public int setL2L_CUST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_CD == null) {
			l_CUST_CD = new ArrayList();
		} else {
			l_CUST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_CD.add(((AG0050010Struct) list.get(i)).getCUST_CD());
		}
		return size;
	}
	public int setL2L_DLV_LOC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_LOC_CD == null) {
			l_DLV_LOC_CD = new ArrayList();
		} else {
			l_DLV_LOC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_LOC_CD.add(((AG0050010Struct) list.get(i)).getDLV_LOC_CD());
		}
		return size;
	}
	public int setL2L_DESINATED_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DESINATED_DLV_DATE == null) {
			l_DESINATED_DLV_DATE = new ArrayList();
		} else {
			l_DESINATED_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DESINATED_DLV_DATE.add(((AG0050010Struct) list.get(i)).getDESINATED_DLV_DATE());
		}
		return size;
	}
	public int setL2L_ODR_ACPT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_ACPT_DATE == null) {
			l_ODR_ACPT_DATE = new ArrayList();
		} else {
			l_ODR_ACPT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_ACPT_DATE.add(((AG0050010Struct) list.get(i)).getODR_ACPT_DATE());
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
			l_VEND_CD.add(((AG0050010Struct) list.get(i)).getVEND_CD());
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
			l_ODR_START_DATE.add(((AG0050010Struct) list.get(i)).getODR_START_DATE());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_START_DATE == null) {
			l_PUCH_ODR_START_DATE = new ArrayList();
		} else {
			l_PUCH_ODR_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_START_DATE.add(((AG0050010Struct) list.get(i)).getPUCH_ODR_START_DATE());
		}
		return size;
	}
	public int setL2L_M_WH_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_M_WH_PLANT_CD == null) {
			l_M_WH_PLANT_CD = new ArrayList();
		} else {
			l_M_WH_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_M_WH_PLANT_CD.add(((AG0050010Struct) list.get(i)).getM_WH_PLANT_CD());
		}
		return size;
	}
	public int setL2L_TRANSPORT_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TRANSPORT_LT == null) {
			l_TRANSPORT_LT = new ArrayList();
		} else {
			l_TRANSPORT_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TRANSPORT_LT.add(((AG0050010Struct) list.get(i)).getTRANSPORT_LT());
		}
		return size;
	}
	public int setL2L_FIX_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FIX_ODR_QTY == null) {
			l_FIX_ODR_QTY = new ArrayList();
		} else {
			l_FIX_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FIX_ODR_QTY.add(((AG0050010Struct) list.get(i)).getFIX_ODR_QTY());
		}
		return size;
	}
	public int setL2L_UNOFFICIAL_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNOFFICIAL_ODR_QTY == null) {
			l_UNOFFICIAL_ODR_QTY = new ArrayList();
		} else {
			l_UNOFFICIAL_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNOFFICIAL_ODR_QTY.add(((AG0050010Struct) list.get(i)).getUNOFFICIAL_ODR_QTY());
		}
		return size;
	}
	public int setL2L_DEPOT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEPOT_QTY == null) {
			l_DEPOT_QTY = new ArrayList();
		} else {
			l_DEPOT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEPOT_QTY.add(((AG0050010Struct) list.get(i)).getDEPOT_QTY());
		}
		return size;
	}
	public int setL2L_CUST_ANAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_ANAME == null) {
			l_CUST_ANAME = new ArrayList();
		} else {
			l_CUST_ANAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_ANAME.add(((AG0050010Struct) list.get(i)).getCUST_ANAME());
		}
		return size;
	}
	public int setL2L_VEND_ANAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_ANAME == null) {
			l_VEND_ANAME = new ArrayList();
		} else {
			l_VEND_ANAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_ANAME.add(((AG0050010Struct) list.get(i)).getVEND_ANAME());
		}
		return size;
	}
	public int setL2L_ODR_DEPOT_CTL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_DEPOT_CTL_NO == null) {
			l_ODR_DEPOT_CTL_NO = new ArrayList();
		} else {
			l_ODR_DEPOT_CTL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_DEPOT_CTL_NO.add(((AG0050010Struct) list.get(i)).getODR_DEPOT_CTL_NO());
		}
		return size;
	}
	public int setL2L_CUST_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_ODR_NO == null) {
			l_CUST_ODR_NO = new ArrayList();
		} else {
			l_CUST_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_ODR_NO.add(((AG0050010Struct) list.get(i)).getCUST_ODR_NO());
		}
		return size;
	}
	public int setL2L_ODR_CHARACTERISTIC(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_CHARACTERISTIC == null) {
			l_ODR_CHARACTERISTIC = new ArrayList();
		} else {
			l_ODR_CHARACTERISTIC.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_CHARACTERISTIC.add(((AG0050010Struct) list.get(i)).getODR_CHARACTERISTIC());
		}
		return size;
	}
	public int setL2L_w_MRP_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_MRP_FLG == null) {
			l_w_MRP_FLG = new ArrayList();
		} else {
			l_w_MRP_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_MRP_FLG.add(((AG0050010Struct) list.get(i)).getw_MRP_FLG());
		}
		return size;
	}
	public int setL2L_w_ENV_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_ENV_FLG == null) {
			l_w_ENV_FLG = new ArrayList();
		} else {
			l_w_ENV_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_ENV_FLG.add(((AG0050010Struct) list.get(i)).getw_ENV_FLG());
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
			l_COMPANY_CD.add(((AG0050010Struct) list.get(i)).getCOMPANY_CD());
		}
		return size;
	}
	public int setL2L_w_CHECK_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_CHECK_FLG == null) {
			l_w_CHECK_FLG = new ArrayList();
		} else {
			l_w_CHECK_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_CHECK_FLG.add(((AG0050010Struct) list.get(i)).getw_CHECK_FLG());
		}
		return size;
	}
	public int setL2L_w_QTY_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_QTY_FLG == null) {
			l_w_QTY_FLG = new ArrayList();
		} else {
			l_w_QTY_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_QTY_FLG.add(((AG0050010Struct) list.get(i)).getw_QTY_FLG());
		}
		return size;
	}
	public int setL2L_w_LOG_MODE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_LOG_MODE_TYP == null) {
			l_w_LOG_MODE_TYP = new ArrayList();
		} else {
			l_w_LOG_MODE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_LOG_MODE_TYP.add(((AG0050010Struct) list.get(i)).getw_LOG_MODE_TYP());
		}
		return size;
	}
	public int setL2L_w_OUTPUT_MODE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_OUTPUT_MODE_TYP == null) {
			l_w_OUTPUT_MODE_TYP = new ArrayList();
		} else {
			l_w_OUTPUT_MODE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_OUTPUT_MODE_TYP.add(((AG0050010Struct) list.get(i)).getw_OUTPUT_MODE_TYP());
		}
		return size;
	}
	public int setL2L_w_PROGRAM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_PROGRAM_CD == null) {
			l_w_PROGRAM_CD = new ArrayList();
		} else {
			l_w_PROGRAM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_PROGRAM_CD.add(((AG0050010Struct) list.get(i)).getw_PROGRAM_CD());
		}
		return size;
	}
	public int setL2L_w_FUNCTION_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_FUNCTION_NAME == null) {
			l_w_FUNCTION_NAME = new ArrayList();
		} else {
			l_w_FUNCTION_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_FUNCTION_NAME.add(((AG0050010Struct) list.get(i)).getw_FUNCTION_NAME());
		}
		return size;
	}
	public int setL2L_w_SHIP_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_SHIP_LT == null) {
			l_w_SHIP_LT = new ArrayList();
		} else {
			l_w_SHIP_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_SHIP_LT.add(((AG0050010Struct) list.get(i)).getw_SHIP_LT());
		}
		return size;
	}
	public int setL2L_w_CLASS_CODE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_CLASS_CODE == null) {
			l_w_CLASS_CODE = new ArrayList();
		} else {
			l_w_CLASS_CODE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_CLASS_CODE.add(((AG0050010Struct) list.get(i)).getw_CLASS_CODE());
		}
		return size;
	}
	public int setL2L_w_PARENT_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_PARENT_ITEM_CD == null) {
			l_w_PARENT_ITEM_CD = new ArrayList();
		} else {
			l_w_PARENT_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_PARENT_ITEM_CD.add(((AG0050010Struct) list.get(i)).getw_PARENT_ITEM_CD());
		}
		return size;
	}
	public int setL2L_w_COMP_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_COMP_ITEM_CD == null) {
			l_w_COMP_ITEM_CD = new ArrayList();
		} else {
			l_w_COMP_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_COMP_ITEM_CD.add(((AG0050010Struct) list.get(i)).getw_COMP_ITEM_CD());
		}
		return size;
	}
	public int setL2L_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_CD == null) {
			l_ODR_CD = new ArrayList();
		} else {
			l_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_CD.add(((AG0050010Struct) list.get(i)).getODR_CD());
		}
		return size;
	}
	public int setL2L_h_INSTALL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_INSTALL_FLG == null) {
			l_h_INSTALL_FLG = new ArrayList();
		} else {
			l_h_INSTALL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_INSTALL_FLG.add(((AG0050010Struct) list.get(i)).geth_INSTALL_FLG());
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
			l_OD_NO.add(((AG0050010Struct) list.get(i)).getOD_NO());
		}
		return size;
	}
	public int setL2L_INTEGRATE_ODR_QTY_ZH(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INTEGRATE_ODR_QTY_ZH == null) {
			l_INTEGRATE_ODR_QTY_ZH = new ArrayList();
		} else {
			l_INTEGRATE_ODR_QTY_ZH.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INTEGRATE_ODR_QTY_ZH.add(((AG0050010Struct) list.get(i)).getINTEGRATE_ODR_QTY_ZH());
		}
		return size;
	}
	public int setL2L_DEPOT_CTL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEPOT_CTL_NO == null) {
			l_DEPOT_CTL_NO = new ArrayList();
		} else {
			l_DEPOT_CTL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEPOT_CTL_NO.add(((AG0050010Struct) list.get(i)).getDEPOT_CTL_NO());
		}
		return size;
	}
	public int setL2L_w_UNCONFIRM_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_UNCONFIRM_FLG == null) {
			l_w_UNCONFIRM_FLG = new ArrayList();
		} else {
			l_w_UNCONFIRM_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_UNCONFIRM_FLG.add(((AG0050010Struct) list.get(i)).getw_UNCONFIRM_FLG());
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
			l_l_COUNT.add(((AG0050010Struct) list.get(i)).getl_COUNT());
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
			l_ROW_COUNT.add(((AG0050010Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}
	public int setL2L_w_DM_CREATE_BASE_TBL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_DM_CREATE_BASE_TBL == null) {
			l_w_DM_CREATE_BASE_TBL = new ArrayList();
		} else {
			l_w_DM_CREATE_BASE_TBL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_DM_CREATE_BASE_TBL.add(((AG0050010Struct) list.get(i)).getw_DM_CREATE_BASE_TBL());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_STOCK_UNIT_3 = null;
		m_STOCK_UNIT_1 = null;
		m_STOCK_UNIT_4 = null;
		m_SCDL_ISSUE_TOTAL = null;
		m_STOCK_UNIT_2 = null;
		m_SCDL_RCV_TOTAL = null;
		m_STOCK_UNIT_5 = null;
		m_rdoItemCd = null;
		m_rdoParentItemCd = null;
		m_rdoCompItemCd = null;
		m_w_PARENT_ITEM_NAME = null;
		m_w_COMP_ITEM_NAME = null;
		m_checkMrpFlg = null;
		m_checkProdPlan = null;
		m_checkUncnfm = null;
		m_DOWNLOAD_FILE = null;
		m_checkQty = null;
		m_h_DM_CREATE_BASE_TBL = null;
		m_u_OPTION_ID = null;
		m_w_ITEM_NAME = null;
		m_STOCK_UNIT = null;
		m_w_ITEM_CD = null;
		m_w_PLANT_NAME = null;
		m_w_PLANT_CD = null;
		m_SCDL_ISSUE_TOTAL_FIX = null;
		m_SCDL_ISSUE_TOTAL_NOFIX = null;
		m_SCDL_RCV_TOTAL_FIX = null;
		m_SCDL_RCV_TOTAL_NOFIX = null;
		m_SORT_NO = null;
		m_DELIVERY_DATE = null;
		m_INSIDE_ODR_QTY = null;
		m_INTEGRATE_ODR_QTY = null;
		m_DEMAND_QTY = null;
		m_STOCK_ODR_QTY = null;
		m_ADD_SUBTRACT = null;
		m_EFFECT_STOCK_QTY = null;
		m_PURCHASE_UNIT = null;
		m_NUMBER_STATUS = null;
		m_STATUS = null;
		m_WORK_ODR_CD = null;
		m_PARENT_ORDER_NO = null;
		m_PARENT_ORDER_ITEM_NO = null;
		m_PARENT_ORDER_ITEM_NAME = null;
		m_DEMAND_NO = null;
		m_ORDER_NO = null;
		m_JOB_ODR_CD = null;
		m_WH_CD = null;
		m_WH_NAME = null;
		m_GNR = null;
		m_NUMBER_GNR_TYP = null;
		m_GNR_TYP = null;
		m_JOB_ODR_CANCEL_NO = null;
		m_w_PKG_UNIT_QTY = null;
		m_w_UNIT_QTY_TYP = null;
		m_CUST_CD = null;
		m_DLV_LOC_CD = null;
		m_DESINATED_DLV_DATE = null;
		m_ODR_ACPT_DATE = null;
		m_VEND_CD = null;
		m_ODR_START_DATE = null;
		m_PUCH_ODR_START_DATE = null;
		m_M_WH_PLANT_CD = null;
		m_TRANSPORT_LT = null;
		m_FIX_ODR_QTY = null;
		m_UNOFFICIAL_ODR_QTY = null;
		m_DEPOT_QTY = null;
		m_CUST_ANAME = null;
		m_VEND_ANAME = null;
		m_ODR_DEPOT_CTL_NO = null;
		m_CUST_ODR_NO = null;
		m_ODR_CHARACTERISTIC = null;
		m_w_MRP_FLG = null;
		m_w_ENV_FLG = null;
		m_COMPANY_CD = null;
		m_w_CHECK_FLG = null;
		m_w_QTY_FLG = null;
		m_w_LOG_MODE_TYP = null;
		m_w_OUTPUT_MODE_TYP = null;
		m_w_PROGRAM_CD = null;
		m_w_FUNCTION_NAME = null;
		m_w_SHIP_LT = null;
		m_w_CLASS_CODE = null;
		m_w_PARENT_ITEM_CD = null;
		m_w_COMP_ITEM_CD = null;
		m_ODR_CD = null;
		m_h_INSTALL_FLG = null;
		m_OD_NO = null;
		m_INTEGRATE_ODR_QTY_ZH = null;
		m_DEPOT_CTL_NO = null;
		m_w_UNCONFIRM_FLG = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;
		m_w_DM_CREATE_BASE_TBL = null;

		l_STOCK_UNIT_3 = null;
		l_STOCK_UNIT_1 = null;
		l_STOCK_UNIT_4 = null;
		l_SCDL_ISSUE_TOTAL = null;
		l_STOCK_UNIT_2 = null;
		l_SCDL_RCV_TOTAL = null;
		l_STOCK_UNIT_5 = null;
		l_rdoItemCd = null;
		l_rdoParentItemCd = null;
		l_rdoCompItemCd = null;
		l_w_PARENT_ITEM_NAME = null;
		l_w_COMP_ITEM_NAME = null;
		l_checkMrpFlg = null;
		l_checkProdPlan = null;
		l_checkUncnfm = null;
		l_DOWNLOAD_FILE = null;
		l_checkQty = null;
		l_h_DM_CREATE_BASE_TBL = null;
		l_u_OPTION_ID = null;
		l_w_ITEM_NAME = null;
		l_STOCK_UNIT = null;
		l_w_ITEM_CD = null;
		l_w_PLANT_NAME = null;
		l_w_PLANT_CD = null;
		l_SCDL_ISSUE_TOTAL_FIX = null;
		l_SCDL_ISSUE_TOTAL_NOFIX = null;
		l_SCDL_RCV_TOTAL_FIX = null;
		l_SCDL_RCV_TOTAL_NOFIX = null;
		l_SORT_NO = null;
		l_DELIVERY_DATE = null;
		l_INSIDE_ODR_QTY = null;
		l_INTEGRATE_ODR_QTY = null;
		l_DEMAND_QTY = null;
		l_STOCK_ODR_QTY = null;
		l_ADD_SUBTRACT = null;
		l_EFFECT_STOCK_QTY = null;
		l_PURCHASE_UNIT = null;
		l_NUMBER_STATUS = null;
		l_STATUS = null;
		l_WORK_ODR_CD = null;
		l_PARENT_ORDER_NO = null;
		l_PARENT_ORDER_ITEM_NO = null;
		l_PARENT_ORDER_ITEM_NAME = null;
		l_DEMAND_NO = null;
		l_ORDER_NO = null;
		l_JOB_ODR_CD = null;
		l_WH_CD = null;
		l_WH_NAME = null;
		l_GNR = null;
		l_NUMBER_GNR_TYP = null;
		l_GNR_TYP = null;
		l_JOB_ODR_CANCEL_NO = null;
		l_w_PKG_UNIT_QTY = null;
		l_w_UNIT_QTY_TYP = null;
		l_CUST_CD = null;
		l_DLV_LOC_CD = null;
		l_DESINATED_DLV_DATE = null;
		l_ODR_ACPT_DATE = null;
		l_VEND_CD = null;
		l_ODR_START_DATE = null;
		l_PUCH_ODR_START_DATE = null;
		l_M_WH_PLANT_CD = null;
		l_TRANSPORT_LT = null;
		l_FIX_ODR_QTY = null;
		l_UNOFFICIAL_ODR_QTY = null;
		l_DEPOT_QTY = null;
		l_CUST_ANAME = null;
		l_VEND_ANAME = null;
		l_ODR_DEPOT_CTL_NO = null;
		l_CUST_ODR_NO = null;
		l_ODR_CHARACTERISTIC = null;
		l_w_MRP_FLG = null;
		l_w_ENV_FLG = null;
		l_COMPANY_CD = null;
		l_w_CHECK_FLG = null;
		l_w_QTY_FLG = null;
		l_w_LOG_MODE_TYP = null;
		l_w_OUTPUT_MODE_TYP = null;
		l_w_PROGRAM_CD = null;
		l_w_FUNCTION_NAME = null;
		l_w_SHIP_LT = null;
		l_w_CLASS_CODE = null;
		l_w_PARENT_ITEM_CD = null;
		l_w_COMP_ITEM_CD = null;
		l_ODR_CD = null;
		l_h_INSTALL_FLG = null;
		l_OD_NO = null;
		l_INTEGRATE_ODR_QTY_ZH = null;
		l_DEPOT_CTL_NO = null;
		l_w_UNCONFIRM_FLG = null;
		l_l_COUNT = null;
		l_ROW_COUNT = null;
		l_w_DM_CREATE_BASE_TBL = null;

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
	 * medAG0050010クラスの標準コンストラクタ
	 */
	public AG0050010Struct()
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
	public void setStruct(AG0050010Struct struct)
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
	public void setStructM(AG0050010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setSTOCK_UNIT_3(struct.getSTOCK_UNIT_3());
			this.setSTOCK_UNIT_1(struct.getSTOCK_UNIT_1());
			this.setSTOCK_UNIT_4(struct.getSTOCK_UNIT_4());
			this.setSCDL_ISSUE_TOTAL(struct.getSCDL_ISSUE_TOTAL());
			this.setSTOCK_UNIT_2(struct.getSTOCK_UNIT_2());
			this.setSCDL_RCV_TOTAL(struct.getSCDL_RCV_TOTAL());
			this.setSTOCK_UNIT_5(struct.getSTOCK_UNIT_5());
			this.setrdoItemCd(struct.getrdoItemCd());
			this.setrdoParentItemCd(struct.getrdoParentItemCd());
			this.setrdoCompItemCd(struct.getrdoCompItemCd());
			this.setw_PARENT_ITEM_NAME(struct.getw_PARENT_ITEM_NAME());
			this.setw_COMP_ITEM_NAME(struct.getw_COMP_ITEM_NAME());
			this.setcheckMrpFlg(struct.getcheckMrpFlg());
			this.setcheckProdPlan(struct.getcheckProdPlan());
			this.setcheckUncnfm(struct.getcheckUncnfm());
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setcheckQty(struct.getcheckQty());
			this.seth_DM_CREATE_BASE_TBL(struct.geth_DM_CREATE_BASE_TBL());
			this.setu_OPTION_ID(struct.getu_OPTION_ID());
			this.setw_ITEM_NAME(struct.getw_ITEM_NAME());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setw_ITEM_CD(struct.getw_ITEM_CD());
			this.setw_PLANT_NAME(struct.getw_PLANT_NAME());
			this.setw_PLANT_CD(struct.getw_PLANT_CD());
			this.setSCDL_ISSUE_TOTAL_FIX(struct.getSCDL_ISSUE_TOTAL_FIX());
			this.setSCDL_ISSUE_TOTAL_NOFIX(struct.getSCDL_ISSUE_TOTAL_NOFIX());
			this.setSCDL_RCV_TOTAL_FIX(struct.getSCDL_RCV_TOTAL_FIX());
			this.setSCDL_RCV_TOTAL_NOFIX(struct.getSCDL_RCV_TOTAL_NOFIX());
			this.setSORT_NO(struct.getSORT_NO());
			this.setDELIVERY_DATE(struct.getDELIVERY_DATE());
			this.setINSIDE_ODR_QTY(struct.getINSIDE_ODR_QTY());
			this.setINTEGRATE_ODR_QTY(struct.getINTEGRATE_ODR_QTY());
			this.setDEMAND_QTY(struct.getDEMAND_QTY());
			this.setSTOCK_ODR_QTY(struct.getSTOCK_ODR_QTY());
			this.setADD_SUBTRACT(struct.getADD_SUBTRACT());
			this.setEFFECT_STOCK_QTY(struct.getEFFECT_STOCK_QTY());
			this.setPURCHASE_UNIT(struct.getPURCHASE_UNIT());
			this.setNUMBER_STATUS(struct.getNUMBER_STATUS());
			this.setSTATUS(struct.getSTATUS());
			this.setWORK_ODR_CD(struct.getWORK_ODR_CD());
			this.setPARENT_ORDER_NO(struct.getPARENT_ORDER_NO());
			this.setPARENT_ORDER_ITEM_NO(struct.getPARENT_ORDER_ITEM_NO());
			this.setPARENT_ORDER_ITEM_NAME(struct.getPARENT_ORDER_ITEM_NAME());
			this.setDEMAND_NO(struct.getDEMAND_NO());
			this.setORDER_NO(struct.getORDER_NO());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setWH_CD(struct.getWH_CD());
			this.setWH_NAME(struct.getWH_NAME());
			this.setGNR(struct.getGNR());
			this.setNUMBER_GNR_TYP(struct.getNUMBER_GNR_TYP());
			this.setGNR_TYP(struct.getGNR_TYP());
			this.setJOB_ODR_CANCEL_NO(struct.getJOB_ODR_CANCEL_NO());
			this.setw_PKG_UNIT_QTY(struct.getw_PKG_UNIT_QTY());
			this.setw_UNIT_QTY_TYP(struct.getw_UNIT_QTY_TYP());
			this.setCUST_CD(struct.getCUST_CD());
			this.setDLV_LOC_CD(struct.getDLV_LOC_CD());
			this.setDESINATED_DLV_DATE(struct.getDESINATED_DLV_DATE());
			this.setODR_ACPT_DATE(struct.getODR_ACPT_DATE());
			this.setVEND_CD(struct.getVEND_CD());
			this.setODR_START_DATE(struct.getODR_START_DATE());
			this.setPUCH_ODR_START_DATE(struct.getPUCH_ODR_START_DATE());
			this.setM_WH_PLANT_CD(struct.getM_WH_PLANT_CD());
			this.setTRANSPORT_LT(struct.getTRANSPORT_LT());
			this.setFIX_ODR_QTY(struct.getFIX_ODR_QTY());
			this.setUNOFFICIAL_ODR_QTY(struct.getUNOFFICIAL_ODR_QTY());
			this.setDEPOT_QTY(struct.getDEPOT_QTY());
			this.setCUST_ANAME(struct.getCUST_ANAME());
			this.setVEND_ANAME(struct.getVEND_ANAME());
			this.setODR_DEPOT_CTL_NO(struct.getODR_DEPOT_CTL_NO());
			this.setCUST_ODR_NO(struct.getCUST_ODR_NO());
			this.setODR_CHARACTERISTIC(struct.getODR_CHARACTERISTIC());
			this.setw_MRP_FLG(struct.getw_MRP_FLG());
			this.setw_ENV_FLG(struct.getw_ENV_FLG());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setw_CHECK_FLG(struct.getw_CHECK_FLG());
			this.setw_QTY_FLG(struct.getw_QTY_FLG());
			this.setw_LOG_MODE_TYP(struct.getw_LOG_MODE_TYP());
			this.setw_OUTPUT_MODE_TYP(struct.getw_OUTPUT_MODE_TYP());
			this.setw_PROGRAM_CD(struct.getw_PROGRAM_CD());
			this.setw_FUNCTION_NAME(struct.getw_FUNCTION_NAME());
			this.setw_SHIP_LT(struct.getw_SHIP_LT());
			this.setw_CLASS_CODE(struct.getw_CLASS_CODE());
			this.setw_PARENT_ITEM_CD(struct.getw_PARENT_ITEM_CD());
			this.setw_COMP_ITEM_CD(struct.getw_COMP_ITEM_CD());
			this.setODR_CD(struct.getODR_CD());
			this.seth_INSTALL_FLG(struct.geth_INSTALL_FLG());
			this.setOD_NO(struct.getOD_NO());
			this.setINTEGRATE_ODR_QTY_ZH(struct.getINTEGRATE_ODR_QTY_ZH());
			this.setDEPOT_CTL_NO(struct.getDEPOT_CTL_NO());
			this.setw_UNCONFIRM_FLG(struct.getw_UNCONFIRM_FLG());
			this.setl_COUNT(struct.getl_COUNT());
			this.setROW_COUNT(struct.getROW_COUNT());
			this.setw_DM_CREATE_BASE_TBL(struct.getw_DM_CREATE_BASE_TBL());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AG0050010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_STOCK_UNIT_3(struct.getList_STOCK_UNIT_3());
			this.setList_STOCK_UNIT_1(struct.getList_STOCK_UNIT_1());
			this.setList_STOCK_UNIT_4(struct.getList_STOCK_UNIT_4());
			this.setList_SCDL_ISSUE_TOTAL(struct.getList_SCDL_ISSUE_TOTAL());
			this.setList_STOCK_UNIT_2(struct.getList_STOCK_UNIT_2());
			this.setList_SCDL_RCV_TOTAL(struct.getList_SCDL_RCV_TOTAL());
			this.setList_STOCK_UNIT_5(struct.getList_STOCK_UNIT_5());
			this.setList_rdoItemCd(struct.getList_rdoItemCd());
			this.setList_rdoParentItemCd(struct.getList_rdoParentItemCd());
			this.setList_rdoCompItemCd(struct.getList_rdoCompItemCd());
			this.setList_w_PARENT_ITEM_NAME(struct.getList_w_PARENT_ITEM_NAME());
			this.setList_w_COMP_ITEM_NAME(struct.getList_w_COMP_ITEM_NAME());
			this.setList_checkMrpFlg(struct.getList_checkMrpFlg());
			this.setList_checkProdPlan(struct.getList_checkProdPlan());
			this.setList_checkUncnfm(struct.getList_checkUncnfm());
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_checkQty(struct.getList_checkQty());
			this.setList_h_DM_CREATE_BASE_TBL(struct.getList_h_DM_CREATE_BASE_TBL());
			this.setList_u_OPTION_ID(struct.getList_u_OPTION_ID());
			this.setList_w_ITEM_NAME(struct.getList_w_ITEM_NAME());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_w_ITEM_CD(struct.getList_w_ITEM_CD());
			this.setList_w_PLANT_NAME(struct.getList_w_PLANT_NAME());
			this.setList_w_PLANT_CD(struct.getList_w_PLANT_CD());
			this.setList_SCDL_ISSUE_TOTAL_FIX(struct.getList_SCDL_ISSUE_TOTAL_FIX());
			this.setList_SCDL_ISSUE_TOTAL_NOFIX(struct.getList_SCDL_ISSUE_TOTAL_NOFIX());
			this.setList_SCDL_RCV_TOTAL_FIX(struct.getList_SCDL_RCV_TOTAL_FIX());
			this.setList_SCDL_RCV_TOTAL_NOFIX(struct.getList_SCDL_RCV_TOTAL_NOFIX());
			this.setList_SORT_NO(struct.getList_SORT_NO());
			this.setList_DELIVERY_DATE(struct.getList_DELIVERY_DATE());
			this.setList_INSIDE_ODR_QTY(struct.getList_INSIDE_ODR_QTY());
			this.setList_INTEGRATE_ODR_QTY(struct.getList_INTEGRATE_ODR_QTY());
			this.setList_DEMAND_QTY(struct.getList_DEMAND_QTY());
			this.setList_STOCK_ODR_QTY(struct.getList_STOCK_ODR_QTY());
			this.setList_ADD_SUBTRACT(struct.getList_ADD_SUBTRACT());
			this.setList_EFFECT_STOCK_QTY(struct.getList_EFFECT_STOCK_QTY());
			this.setList_PURCHASE_UNIT(struct.getList_PURCHASE_UNIT());
			this.setList_NUMBER_STATUS(struct.getList_NUMBER_STATUS());
			this.setList_STATUS(struct.getList_STATUS());
			this.setList_WORK_ODR_CD(struct.getList_WORK_ODR_CD());
			this.setList_PARENT_ORDER_NO(struct.getList_PARENT_ORDER_NO());
			this.setList_PARENT_ORDER_ITEM_NO(struct.getList_PARENT_ORDER_ITEM_NO());
			this.setList_PARENT_ORDER_ITEM_NAME(struct.getList_PARENT_ORDER_ITEM_NAME());
			this.setList_DEMAND_NO(struct.getList_DEMAND_NO());
			this.setList_ORDER_NO(struct.getList_ORDER_NO());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_WH_CD(struct.getList_WH_CD());
			this.setList_WH_NAME(struct.getList_WH_NAME());
			this.setList_GNR(struct.getList_GNR());
			this.setList_NUMBER_GNR_TYP(struct.getList_NUMBER_GNR_TYP());
			this.setList_GNR_TYP(struct.getList_GNR_TYP());
			this.setList_JOB_ODR_CANCEL_NO(struct.getList_JOB_ODR_CANCEL_NO());
			this.setList_w_PKG_UNIT_QTY(struct.getList_w_PKG_UNIT_QTY());
			this.setList_w_UNIT_QTY_TYP(struct.getList_w_UNIT_QTY_TYP());
			this.setList_CUST_CD(struct.getList_CUST_CD());
			this.setList_DLV_LOC_CD(struct.getList_DLV_LOC_CD());
			this.setList_DESINATED_DLV_DATE(struct.getList_DESINATED_DLV_DATE());
			this.setList_ODR_ACPT_DATE(struct.getList_ODR_ACPT_DATE());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_ODR_START_DATE(struct.getList_ODR_START_DATE());
			this.setList_PUCH_ODR_START_DATE(struct.getList_PUCH_ODR_START_DATE());
			this.setList_M_WH_PLANT_CD(struct.getList_M_WH_PLANT_CD());
			this.setList_TRANSPORT_LT(struct.getList_TRANSPORT_LT());
			this.setList_FIX_ODR_QTY(struct.getList_FIX_ODR_QTY());
			this.setList_UNOFFICIAL_ODR_QTY(struct.getList_UNOFFICIAL_ODR_QTY());
			this.setList_DEPOT_QTY(struct.getList_DEPOT_QTY());
			this.setList_CUST_ANAME(struct.getList_CUST_ANAME());
			this.setList_VEND_ANAME(struct.getList_VEND_ANAME());
			this.setList_ODR_DEPOT_CTL_NO(struct.getList_ODR_DEPOT_CTL_NO());
			this.setList_CUST_ODR_NO(struct.getList_CUST_ODR_NO());
			this.setList_ODR_CHARACTERISTIC(struct.getList_ODR_CHARACTERISTIC());
			this.setList_w_MRP_FLG(struct.getList_w_MRP_FLG());
			this.setList_w_ENV_FLG(struct.getList_w_ENV_FLG());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_w_CHECK_FLG(struct.getList_w_CHECK_FLG());
			this.setList_w_QTY_FLG(struct.getList_w_QTY_FLG());
			this.setList_w_LOG_MODE_TYP(struct.getList_w_LOG_MODE_TYP());
			this.setList_w_OUTPUT_MODE_TYP(struct.getList_w_OUTPUT_MODE_TYP());
			this.setList_w_PROGRAM_CD(struct.getList_w_PROGRAM_CD());
			this.setList_w_FUNCTION_NAME(struct.getList_w_FUNCTION_NAME());
			this.setList_w_SHIP_LT(struct.getList_w_SHIP_LT());
			this.setList_w_CLASS_CODE(struct.getList_w_CLASS_CODE());
			this.setList_w_PARENT_ITEM_CD(struct.getList_w_PARENT_ITEM_CD());
			this.setList_w_COMP_ITEM_CD(struct.getList_w_COMP_ITEM_CD());
			this.setList_ODR_CD(struct.getList_ODR_CD());
			this.setList_h_INSTALL_FLG(struct.getList_h_INSTALL_FLG());
			this.setList_OD_NO(struct.getList_OD_NO());
			this.setList_INTEGRATE_ODR_QTY_ZH(struct.getList_INTEGRATE_ODR_QTY_ZH());
			this.setList_DEPOT_CTL_NO(struct.getList_DEPOT_CTL_NO());
			this.setList_w_UNCONFIRM_FLG(struct.getList_w_UNCONFIRM_FLG());
			this.setList_l_COUNT(struct.getList_l_COUNT());
			this.setList_ROW_COUNT(struct.getList_ROW_COUNT());
			this.setList_w_DM_CREATE_BASE_TBL(struct.getList_w_DM_CREATE_BASE_TBL());
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
	// 第 1 変数初期値： i_STOCK_UNIT_3


	final static String i_STOCK_UNIT_3 = null;

	// 第 2 変数初期値： i_STOCK_UNIT_1


	final static String i_STOCK_UNIT_1 = null;

	// 第 3 変数初期値： i_STOCK_UNIT_4


	final static String i_STOCK_UNIT_4 = null;

	// 第 4 変数初期値： i_SCDL_ISSUE_TOTAL


	final static String i_SCDL_ISSUE_TOTAL = null;

	// 第 5 変数初期値： i_STOCK_UNIT_2


	final static String i_STOCK_UNIT_2 = null;

	// 第 6 変数初期値： i_SCDL_RCV_TOTAL


	final static String i_SCDL_RCV_TOTAL = null;

	// 第 7 変数初期値： i_STOCK_UNIT_5


	final static String i_STOCK_UNIT_5 = null;

	// 第 8 変数初期値： i_rdoItemCd


	final static String i_rdoItemCd = null;

	// 第 9 変数初期値： i_rdoParentItemCd


	final static String i_rdoParentItemCd = null;

	// 第 10 変数初期値： i_rdoCompItemCd


	final static String i_rdoCompItemCd = null;

	// 第 11 変数初期値： i_w_PARENT_ITEM_NAME


	final static String i_w_PARENT_ITEM_NAME = null;

	// 第 12 変数初期値： i_w_COMP_ITEM_NAME


	final static String i_w_COMP_ITEM_NAME = null;

	// 第 13 変数初期値： i_checkMrpFlg


	final static String i_checkMrpFlg = null;

	// 第 14 変数初期値： i_checkProdPlan


	final static String i_checkProdPlan = null;

	// 第 15 変数初期値： i_checkUncnfm


	final static String i_checkUncnfm = null;

	// 第 16 変数初期値： i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// 第 17 変数初期値： i_checkQty


	final static String i_checkQty = null;

	// 第 18 変数初期値： i_h_DM_CREATE_BASE_TBL


	final static String i_h_DM_CREATE_BASE_TBL = null;

	// 第 19 変数初期値： i_u_OPTION_ID


	final static String i_u_OPTION_ID = null;

	// 第 20 変数初期値： i_w_ITEM_NAME


	final static String i_w_ITEM_NAME = null;

	// 第 21 変数初期値： i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// 第 22 変数初期値： i_w_ITEM_CD


	final static String i_w_ITEM_CD = null;

	// 第 23 変数初期値： i_w_PLANT_NAME


	final static String i_w_PLANT_NAME = null;

	// 第 24 変数初期値： i_w_PLANT_CD


	final static String i_w_PLANT_CD = null;

	// 第 25 変数初期値： i_SCDL_ISSUE_TOTAL_FIX


	final static String i_SCDL_ISSUE_TOTAL_FIX = null;

	// 第 26 変数初期値： i_SCDL_ISSUE_TOTAL_NOFIX


	final static String i_SCDL_ISSUE_TOTAL_NOFIX = null;

	// 第 27 変数初期値： i_SCDL_RCV_TOTAL_FIX


	final static String i_SCDL_RCV_TOTAL_FIX = null;

	// 第 28 変数初期値： i_SCDL_RCV_TOTAL_NOFIX


	final static String i_SCDL_RCV_TOTAL_NOFIX = null;

	// 第 29 変数初期値： i_SORT_NO


	final static String i_SORT_NO = null;

	// 第 30 変数初期値： i_DELIVERY_DATE


	final static String i_DELIVERY_DATE = null;

	// 第 31 変数初期値： i_INSIDE_ODR_QTY


	final static String i_INSIDE_ODR_QTY = null;

	// 第 32 変数初期値： i_INTEGRATE_ODR_QTY


	final static String i_INTEGRATE_ODR_QTY = null;

	// 第 33 変数初期値： i_DEMAND_QTY


	final static String i_DEMAND_QTY = null;

	// 第 34 変数初期値： i_STOCK_ODR_QTY


	final static String i_STOCK_ODR_QTY = null;

	// 第 35 変数初期値： i_ADD_SUBTRACT


	final static String i_ADD_SUBTRACT = null;

	// 第 36 変数初期値： i_EFFECT_STOCK_QTY


	final static String i_EFFECT_STOCK_QTY = null;

	// 第 37 変数初期値： i_PURCHASE_UNIT


	final static String i_PURCHASE_UNIT = null;

	// 第 38 変数初期値： i_NUMBER_STATUS


	final static String i_NUMBER_STATUS = null;

	// 第 39 変数初期値： i_STATUS


	final static String i_STATUS = null;

	// 第 40 変数初期値： i_WORK_ODR_CD


	final static String i_WORK_ODR_CD = null;

	// 第 41 変数初期値： i_PARENT_ORDER_NO


	final static String i_PARENT_ORDER_NO = null;

	// 第 42 変数初期値： i_PARENT_ORDER_ITEM_NO


	final static String i_PARENT_ORDER_ITEM_NO = null;

	// 第 43 変数初期値： i_PARENT_ORDER_ITEM_NAME


	final static String i_PARENT_ORDER_ITEM_NAME = null;

	// 第 44 変数初期値： i_DEMAND_NO


	final static String i_DEMAND_NO = null;

	// 第 45 変数初期値： i_ORDER_NO


	final static String i_ORDER_NO = null;

	// 第 46 変数初期値： i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// 第 47 変数初期値： i_WH_CD


	final static String i_WH_CD = null;

	// 第 48 変数初期値： i_WH_NAME


	final static String i_WH_NAME = null;

	// 第 49 変数初期値： i_GNR


	final static String i_GNR = null;

	// 第 50 変数初期値： i_NUMBER_GNR_TYP


	final static String i_NUMBER_GNR_TYP = null;

	// 第 51 変数初期値： i_GNR_TYP


	final static String i_GNR_TYP = null;

	// 第 52 変数初期値： i_JOB_ODR_CANCEL_NO


	final static String i_JOB_ODR_CANCEL_NO = null;

	// 第 53 変数初期値： i_w_PKG_UNIT_QTY


	final static String i_w_PKG_UNIT_QTY = null;

	// 第 54 変数初期値： i_w_UNIT_QTY_TYP


	final static String i_w_UNIT_QTY_TYP = null;

	// 第 55 変数初期値： i_CUST_CD


	final static String i_CUST_CD = null;

	// 第 56 変数初期値： i_DLV_LOC_CD


	final static String i_DLV_LOC_CD = null;

	// 第 57 変数初期値： i_DESINATED_DLV_DATE


	final static String i_DESINATED_DLV_DATE = null;

	// 第 58 変数初期値： i_ODR_ACPT_DATE


	final static String i_ODR_ACPT_DATE = null;

	// 第 59 変数初期値： i_VEND_CD


	final static String i_VEND_CD = null;

	// 第 60 変数初期値： i_ODR_START_DATE


	final static String i_ODR_START_DATE = null;

	// 第 61 変数初期値： i_PUCH_ODR_START_DATE


	final static String i_PUCH_ODR_START_DATE = null;

	// 第 62 変数初期値： i_M_WH_PLANT_CD


	final static String i_M_WH_PLANT_CD = null;

	// 第 63 変数初期値： i_TRANSPORT_LT


	final static String i_TRANSPORT_LT = null;

	// 第 64 変数初期値： i_FIX_ODR_QTY


	final static String i_FIX_ODR_QTY = null;

	// 第 65 変数初期値： i_UNOFFICIAL_ODR_QTY


	final static String i_UNOFFICIAL_ODR_QTY = null;

	// 第 66 変数初期値： i_DEPOT_QTY


	final static String i_DEPOT_QTY = null;

	// 第 67 変数初期値： i_CUST_ANAME


	final static String i_CUST_ANAME = null;

	// 第 68 変数初期値： i_VEND_ANAME


	final static String i_VEND_ANAME = null;

	// 第 69 変数初期値： i_ODR_DEPOT_CTL_NO


	final static String i_ODR_DEPOT_CTL_NO = null;

	// 第 70 変数初期値： i_CUST_ODR_NO


	final static String i_CUST_ODR_NO = null;

	// 第 71 変数初期値： i_ODR_CHARACTERISTIC


	final static String i_ODR_CHARACTERISTIC = null;

	// 第 72 変数初期値： i_w_MRP_FLG


	final static String i_w_MRP_FLG = null;

	// 第 73 変数初期値： i_w_ENV_FLG


	final static String i_w_ENV_FLG = null;

	// 第 74 変数初期値： i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// 第 75 変数初期値： i_w_CHECK_FLG


	final static String i_w_CHECK_FLG = null;

	// 第 76 変数初期値： i_w_QTY_FLG


	final static String i_w_QTY_FLG = null;

	// 第 77 変数初期値： i_w_LOG_MODE_TYP


	final static String i_w_LOG_MODE_TYP = null;

	// 第 78 変数初期値： i_w_OUTPUT_MODE_TYP


	final static String i_w_OUTPUT_MODE_TYP = null;

	// 第 79 変数初期値： i_w_PROGRAM_CD


	final static String i_w_PROGRAM_CD = null;

	// 第 80 変数初期値： i_w_FUNCTION_NAME


	final static String i_w_FUNCTION_NAME = null;

	// 第 81 変数初期値： i_w_SHIP_LT


	final static String i_w_SHIP_LT = null;

	// 第 82 変数初期値： i_w_CLASS_CODE


	final static String i_w_CLASS_CODE = null;

	// 第 83 変数初期値： i_w_PARENT_ITEM_CD


	final static String i_w_PARENT_ITEM_CD = null;

	// 第 84 変数初期値： i_w_COMP_ITEM_CD


	final static String i_w_COMP_ITEM_CD = null;

	// 第 85 変数初期値： i_ODR_CD


	final static String i_ODR_CD = null;

	// 第 86 変数初期値： i_h_INSTALL_FLG


	final static String i_h_INSTALL_FLG = null;

	// 第 87 変数初期値： i_OD_NO


	final static String i_OD_NO = null;

	// 第 88 変数初期値： i_INTEGRATE_ODR_QTY_ZH


	final static String i_INTEGRATE_ODR_QTY_ZH = null;

	// 第 89 変数初期値： i_DEPOT_CTL_NO


	final static String i_DEPOT_CTL_NO = null;

	// 第 90 変数初期値： i_w_UNCONFIRM_FLG


	final static String i_w_UNCONFIRM_FLG = null;

	// 第 91 変数初期値： i_l_COUNT


	final static String i_l_COUNT = null;

	// 第 92 変数初期値： i_ROW_COUNT


	final static String i_ROW_COUNT = null;

	// 第 93 変数初期値： i_w_DM_CREATE_BASE_TBL


	final static String i_w_DM_CREATE_BASE_TBL = null;

*/

	//{{user_implement_code
	//---------------------------------------------------------------------

	/**
	 * 初期化
	 * @param なし
	 */
	public void initialize()
	{
		m_SCDL_ISSUE_TOTAL_FIX = new String("0.0");
		m_SCDL_ISSUE_TOTAL_NOFIX = new String("0.0");
		m_SCDL_ISSUE_TOTAL = new String("0.0");
		m_SCDL_RCV_TOTAL_FIX = new String("0.0");
		m_SCDL_RCV_TOTAL_NOFIX = new String("0.0");
		m_SCDL_RCV_TOTAL = new String("0.0");
		m_INSIDE_ODR_QTY = new String("0.0");
		m_DEMAND_QTY = new String("0.0");
		m_STOCK_ODR_QTY = new String("0.0");
		m_EFFECT_STOCK_QTY = new String("0.0");
	}


	/**
	 * コピー
	 * @param struct コピー対象
	 */
	public void copy(AG0050010Struct struct)
	{
		//clear();
		if(struct.m_rdoItemCd != null) m_rdoItemCd = new String(struct.m_rdoItemCd);
		if(struct.m_rdoParentItemCd != null) m_rdoParentItemCd = new String(struct.m_rdoParentItemCd);
		if(struct.m_rdoCompItemCd != null) m_rdoCompItemCd = new String(struct.m_rdoCompItemCd);
		if(struct.m_w_ITEM_CD != null) m_w_ITEM_CD = new String(struct.m_w_ITEM_CD);
		if(struct.m_w_COMP_ITEM_CD != null) m_w_COMP_ITEM_CD = new String(struct.m_w_COMP_ITEM_CD);
		if(struct.m_w_PARENT_ITEM_CD != null) m_w_PARENT_ITEM_CD = new String(struct.m_w_PARENT_ITEM_CD);
		//if(struct.m_w_ITEM_NAME != null) m_w_ITEM_NAME = new String(struct.m_w_ITEM_NAME);
		//if(struct.m_w_PARENT_ITEM_NAME != null) m_w_PARENT_ITEM_NAME = new String(struct.m_w_PARENT_ITEM_NAME);
		//if(struct.m_w_COMP_ITEM_NAME != null) m_w_COMP_ITEM_NAME = new String(struct.m_w_COMP_ITEM_NAME);
		if(struct.m_w_PLANT_CD != null) m_w_PLANT_CD = new String(struct.m_w_PLANT_CD);
		//if(struct.m_w_PLANT_NAME != null) m_w_PLANT_NAME = new String(struct.m_w_PLANT_NAME);
		if(struct.m_SCDL_ISSUE_TOTAL_FIX != null) m_SCDL_ISSUE_TOTAL_FIX = new String(struct.m_SCDL_ISSUE_TOTAL_FIX);
		if(struct.m_STOCK_UNIT != null) m_STOCK_UNIT = new String(struct.m_STOCK_UNIT);
		if(struct.m_SCDL_ISSUE_TOTAL_NOFIX != null) m_SCDL_ISSUE_TOTAL_NOFIX = new String(struct.m_SCDL_ISSUE_TOTAL_NOFIX);
		if(struct.m_STOCK_UNIT_1 != null) m_STOCK_UNIT_1 = new String(struct.m_STOCK_UNIT_1);
		if(struct.m_SCDL_ISSUE_TOTAL != null) m_SCDL_ISSUE_TOTAL = new String(struct.m_SCDL_ISSUE_TOTAL);
		if(struct.m_STOCK_UNIT_2 != null) m_STOCK_UNIT_2 = new String(struct.m_STOCK_UNIT_2);
		if(struct.m_SCDL_RCV_TOTAL_FIX != null) m_SCDL_RCV_TOTAL_FIX = new String(struct.m_SCDL_RCV_TOTAL_FIX);
		if(struct.m_STOCK_UNIT_3 != null) m_STOCK_UNIT_3 = new String(struct.m_STOCK_UNIT_3);
		if(struct.m_SCDL_RCV_TOTAL_NOFIX != null) m_SCDL_RCV_TOTAL_NOFIX = new String(struct.m_SCDL_RCV_TOTAL_NOFIX);
		if(struct.m_STOCK_UNIT_4 != null) m_STOCK_UNIT_4 = new String(struct.m_STOCK_UNIT_4);
		if(struct.m_SCDL_RCV_TOTAL != null) m_SCDL_RCV_TOTAL = new String(struct.m_SCDL_RCV_TOTAL);
		if(struct.m_STOCK_UNIT_5 != null) m_STOCK_UNIT_5 = new String(struct.m_STOCK_UNIT_5);
		if(struct.m_SORT_NO != null) m_SORT_NO = new String(struct.m_SORT_NO);
		if(struct.m_DELIVERY_DATE != null) m_DELIVERY_DATE = new String(struct.m_DELIVERY_DATE);
		if(struct.m_INSIDE_ODR_QTY != null) m_INSIDE_ODR_QTY = new String(struct.m_INSIDE_ODR_QTY);
		if(struct.m_DEMAND_QTY != null) m_DEMAND_QTY = new String(struct.m_DEMAND_QTY);
		if(struct.m_STOCK_ODR_QTY != null) m_STOCK_ODR_QTY = new String(struct.m_STOCK_ODR_QTY);
		if(struct.m_ADD_SUBTRACT != null) m_ADD_SUBTRACT = new String(struct.m_ADD_SUBTRACT);
		if(struct.m_EFFECT_STOCK_QTY != null) m_EFFECT_STOCK_QTY = new String(struct.m_EFFECT_STOCK_QTY);
		if(struct.m_PURCHASE_UNIT != null) m_PURCHASE_UNIT = new String(struct.m_PURCHASE_UNIT);
		if(struct.m_STATUS != null) m_STATUS = new String(struct.m_STATUS);
		if(struct.m_PARENT_ORDER_NO != null) m_PARENT_ORDER_NO = new String(struct.m_PARENT_ORDER_NO);
		if(struct.m_DEMAND_NO != null) m_DEMAND_NO = new String(struct.m_DEMAND_NO);
		if(struct.m_ORDER_NO != null) m_ORDER_NO = new String(struct.m_ORDER_NO);
		if(struct.m_JOB_ODR_CD != null) m_JOB_ODR_CD = new String(struct.m_JOB_ODR_CD);
		if(struct.m_WH_CD != null) m_WH_CD = new String(struct.m_WH_CD);
		if(struct.m_WH_NAME != null) m_WH_NAME = new String(struct.m_WH_NAME);
		if(struct.m_GNR_TYP != null) m_GNR_TYP = new String(struct.m_GNR_TYP);
		if(struct.m_checkMrpFlg != null) m_checkMrpFlg = new String(struct.m_checkMrpFlg);
		if(struct.m_checkProdPlan != null) m_checkProdPlan = new String(struct.m_checkProdPlan);
		if(struct.m_checkUncnfm != null) m_checkUncnfm = new String(struct.m_checkUncnfm);

	}


	/**
	 * コピーコンストラクタ
	 * @param struct コピー対象
	 */
	 public AG0050010Struct(AG0050010Struct struct)
	 {
	 	copy(struct);
	 }

	//---------------------------------------------------------------------
        //}}user_implement_code

	//////////////////////////////

}
