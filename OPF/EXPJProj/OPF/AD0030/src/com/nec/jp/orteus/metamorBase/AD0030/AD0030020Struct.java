/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0030/src/com/nec/jp/orteus/metamorBase/AD0030/AD0030020Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0030;

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

public class AD0030020Struct extends DataStruct
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
	/** 第 5 変数： m_h_UNIT_COST_TYP */
	public String m_h_UNIT_COST_TYP = null;
	/** 第 6 変数： m_UNIT_COST_TYP_name */
	public String m_UNIT_COST_TYP_name = null;
	/** 第 7 変数： m_UNIT_COST_TYP_val */
	public String m_UNIT_COST_TYP_val = null;
	/** 第 8 変数： m_h_PLANT_CD */
	public String m_h_PLANT_CD = null;
	/** 第 9 変数： m_AFTER_DISC_AMOUNT */
	public String m_AFTER_DISC_AMOUNT = null;
	/** 第 10 変数： m_PROVISIONAL_HOME_CUR_AMOUNT */
	public String m_PROVISIONAL_HOME_CUR_AMOUNT = null;
	/** 第 11 変数： m_HOME_CUR_UNIT */
	public String m_HOME_CUR_UNIT = null;
	/** 第 12 変数： m_EXCH_RATE */
	public String m_EXCH_RATE = null;
	/** 第 13 変数： m_TAX_AMOUNT_1 */
	public String m_TAX_AMOUNT_1 = null;
	/** 第 14 変数： m_TAX_AMOUNT_2 */
	public String m_TAX_AMOUNT_2 = null;
	/** 第 15 変数： m_AMOUNT_INCLUDE_TAX */
	public String m_AMOUNT_INCLUDE_TAX = null;
	/** 第 16 変数： m_h_HOME_DECIMAL_FIG */
	public String m_h_HOME_DECIMAL_FIG = null;
	/** 第 17 変数： m_h_TAX_RATE_1 */
	public String m_h_TAX_RATE_1 = null;
	/** 第 18 変数： m_h_TAX_RATE_2 */
	public String m_h_TAX_RATE_2 = null;
	/** 第 19 変数： m_h_TAX_RATE_3 */
	public String m_h_TAX_RATE_3 = null;
	/** 第 20 変数： m_TAX_AMOUNT_3 */
	public String m_TAX_AMOUNT_3 = null;
	/** 第 21 変数： m_h_WORK_ODR_DLV_DATE_BY_PROC */
	public String m_h_WORK_ODR_DLV_DATE_BY_PROC = null;
	/** 第 22 変数： m_h_OPR_INST_START_DATE_BY_PROC */
	public String m_h_OPR_INST_START_DATE_BY_PROC = null;
	/** 第 23 変数： m_h_OPR_INST_QTY */
	public String m_h_OPR_INST_QTY = null;
	/** 第 24 変数： m_SelectUnitCostFlag */
	public String m_SelectUnitCostFlag = null;
	/** 第 25 変数： m_WORK_ODR_DLV_DATE_BY_ITEM_TIME */
	public String m_WORK_ODR_DLV_DATE_BY_ITEM_TIME = null;
	/** 第 26 変数： m_OPR_INST_START_DATE_BY_ITEM_TIME */
	public String m_OPR_INST_START_DATE_BY_ITEM_TIME = null;
	/** 第 27 変数： m_h_ODR_START_DATE_TIME */
	public String m_h_ODR_START_DATE_TIME = null;
	/** 第 28 変数： m_h_WORK_ODR_DLV_DATE_BY_PROC_TIME */
	public String m_h_WORK_ODR_DLV_DATE_BY_PROC_TIME = null;
	/** 第 29 変数： m_h_OPR_INST_START_DATE_BY_PROC_TIME */
	public String m_h_OPR_INST_START_DATE_BY_PROC_TIME = null;
	/** 第 30 変数： m_WORK_ODR_CD */
	public String m_WORK_ODR_CD = null;
	/** 第 31 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 32 変数： m_WORK_IN_PROC_CD */
	public String m_WORK_IN_PROC_CD = null;
	/** 第 33 変数： m_PROC_NAME */
	public String m_PROC_NAME = null;
	/** 第 34 変数： m_PROC_NO */
	public String m_PROC_NO = null;
	/** 第 35 変数： m_WORK_ODR_DLV_DATE_BY_PROC */
	public String m_WORK_ODR_DLV_DATE_BY_PROC = null;
	/** 第 36 変数： m_OPR_INST_START_DATE_BY_ITEM */
	public String m_OPR_INST_START_DATE_BY_ITEM = null;
	/** 第 37 変数： m_WORK_ODR_DLV_DATE_BY_ITEM */
	public String m_WORK_ODR_DLV_DATE_BY_ITEM = null;
	/** 第 38 変数： m_OPR_INST_START_DATE_BY_PROC */
	public String m_OPR_INST_START_DATE_BY_PROC = null;
	/** 第 39 変数： m_OPR_INST_QTY */
	public String m_OPR_INST_QTY = null;
	/** 第 40 変数： m_OUTSIDE_TYP */
	public String m_OUTSIDE_TYP = null;
	/** 第 41 変数： m_WS_CD */
	public String m_WS_CD = null;
	/** 第 42 変数： m_VEND_CD */
	public String m_VEND_CD = null;
	/** 第 43 変数： m_OPR_INST_CD */
	public String m_OPR_INST_CD = null;
	/** 第 44 変数： m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** 第 45 変数： m_DRAW_CD */
	public String m_DRAW_CD = null;
	/** 第 46 変数： m_SPEC */
	public String m_SPEC = null;
	/** 第 47 変数： m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** 第 48 変数： m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** 第 49 変数： m_h_MODIFY_COUNT_BY_ITEM */
	public String m_h_MODIFY_COUNT_BY_ITEM = null;
	/** 第 50 変数： m_h_MODIFY_COUNT_BY_PROC */
	public String m_h_MODIFY_COUNT_BY_PROC = null;
	/** 第 51 変数： m_WORK_STS_TYP */
	public String m_WORK_STS_TYP = null;
	/** 第 52 変数： m_PROC_EXPLOSION_FLG */
	public String m_PROC_EXPLOSION_FLG = null;
	/** 第 53 変数： m_MRP_ODR_TYP */
	public String m_MRP_ODR_TYP = null;
	/** 第 54 変数： m_UNIT_COST_TYP */
	public String m_UNIT_COST_TYP = null;
	/** 第 55 変数： m_UNIT_COST */
	public String m_UNIT_COST = null;
	/** 第 56 変数： m_PROCESSING_COST */
	public String m_PROCESSING_COST = null;
	/** 第 57 変数： m_MATERIAL_COST */
	public String m_MATERIAL_COST = null;
	/** 第 58 変数： m_OTHER_OVERHEADS */
	public String m_OTHER_OVERHEADS = null;
	/** 第 59 変数： m_PUCH_ODR_AMOUNT */
	public String m_PUCH_ODR_AMOUNT = null;
	/** 第 60 変数： m_DISC_AMOUNT */
	public String m_DISC_AMOUNT = null;
	/** 第 61 変数： m_ACPT_INSPC_TYP */
	public String m_ACPT_INSPC_TYP = null;
	/** 第 62 変数： m_WS_NAME */
	public String m_WS_NAME = null;
	/** 第 63 変数： m_VEND_ANAME */
	public String m_VEND_ANAME = null;
	/** 第 64 変数： m_ROUND_TYP */
	public String m_ROUND_TYP = null;
	/** 第 65 変数： m_CUR_CD */
	public String m_CUR_CD = null;
	/** 第 66 変数： m_CUR_NAME */
	public String m_CUR_NAME = null;
	/** 第 67 変数： m_WORK_IN_PROC_COMMENT */
	public String m_WORK_IN_PROC_COMMENT = null;
	/** 第 68 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** 第 69 変数： m_h_UNIT_QTY_TYP */
	public String m_h_UNIT_QTY_TYP = null;
	/** 第 70 変数： m_h_PARENT_OD_NO */
	public String m_h_PARENT_OD_NO = null;
	/** 第 71 変数： m_h_COMPANY_CD */
	public String m_h_COMPANY_CD = null;
	/** 第 72 変数： m_h_ODR_START_DATE */
	public String m_h_ODR_START_DATE = null;
	/** 第 73 変数： m_OD_NO */
	public String m_OD_NO = null;
	/** 第 74 変数： m_JOB_ODR_DETAIL_NO */
	public String m_JOB_ODR_DETAIL_NO = null;
	/** 第 75 変数： m_h_JOB_ODR_CANCEL_NO */
	public String m_h_JOB_ODR_CANCEL_NO = null;
	/** 第 76 変数： m_DUE_DATE */
	public String m_DUE_DATE = null;
	/** 第 77 変数： m_h_MODIFY_COUNT_OPR_INST */
	public String m_h_MODIFY_COUNT_OPR_INST = null;
	/** 第 78 変数： m_OUTSIDE_TYP_DN */
	public String m_OUTSIDE_TYP_DN = null;
	/** 第 79 変数： m_MRP_ODR_TYP_DN */
	public String m_MRP_ODR_TYP_DN = null;
	/** 第 80 変数： m_EXCH_TYP */
	public String m_EXCH_TYP = null;
	/** 第 81 変数： m_VEND_CUR_UNIT */
	public String m_VEND_CUR_UNIT = null;
	/** 第 82 変数： m_h_VEND_DECIMAL_FIG */
	public String m_h_VEND_DECIMAL_FIG = null;
	/** 第 83 変数： m_OPR_INST_CD_GNR_TYP */
	public String m_OPR_INST_CD_GNR_TYP = null;
	/** 第 84 変数： m_h_OD_NO */
	public String m_h_OD_NO = null;
	/** 第 85 変数： m_WORK_ODR_DLV_DATE_BY_PROC_ALL */
	public String m_WORK_ODR_DLV_DATE_BY_PROC_ALL = null;
	/** 第 86 変数： m_OPR_INST_START_DATE_BY_PROC_ALL */
	public String m_OPR_INST_START_DATE_BY_PROC_ALL = null;
	/** 第 87 変数： m_h_WORK_STS_TYP */
	public String m_h_WORK_STS_TYP = null;
	/** 第 88 変数： m_FINAL_PROC_FLG */
	public String m_FINAL_PROC_FLG = null;
	/** 第 89 変数： m_MODIFY_COUNT_BY_PROC */
	public String m_MODIFY_COUNT_BY_PROC = null;
	/** 第 90 変数： m_h_BUSINESS_OPR_DATE */
	public String m_h_BUSINESS_OPR_DATE = null;
	/** 第 91 変数： m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** 第 92 変数： m_CAL_DATE */
	public String m_CAL_DATE = null;
	/** 第 93 変数： m_CAL_NO */
	public String m_CAL_NO = null;
	/** 第 94 変数： m_CHECK_DATE */
	public String m_CHECK_DATE = null;
	/** 第 95 変数： m_WS_PLANT_CD */
	public String m_WS_PLANT_CD = null;
	/** 第 96 変数： m_MODIFY_COUNT_OPR_INST */
	public String m_MODIFY_COUNT_OPR_INST = null;
	/** 第 97 変数： m_OPR_INST_START_DATE_BY_PROC_TIME */
	public String m_OPR_INST_START_DATE_BY_PROC_TIME = null;
	/** 第 98 変数： m_WORK_ODR_DLV_DATE_BY_PROC_TIME */
	public String m_WORK_ODR_DLV_DATE_BY_PROC_TIME = null;
	/** 第 99 変数： m_OPR_INST_START_DATE_BY_ITEM_ALL */
	public String m_OPR_INST_START_DATE_BY_ITEM_ALL = null;
	/** 第 100 変数： m_WORK_ODR_DLV_DATE_BY_ITEM_ALL */
	public String m_WORK_ODR_DLV_DATE_BY_ITEM_ALL = null;
	/** 第 101 変数： m_LOWER_OD_NO */
	public String m_LOWER_OD_NO = null;
	/** 第 102 変数： m_JOB_ODR_TYP */
	public String m_JOB_ODR_TYP = null;
	/** 第 103 変数： m_JOB_ODR_DLV_DATE */
	public String m_JOB_ODR_DLV_DATE = null;
	/** 第 104 変数： m_JOB_ODR_DLV_DATE_TIME */
	public String m_JOB_ODR_DLV_DATE_TIME = null;
	/** 第 105 変数： m_h_JOB_ODR_CD */
	public String m_h_JOB_ODR_CD = null;
	/** 第 106 変数： m_MODIFY_COUNT_BY_ITEM */
	public String m_MODIFY_COUNT_BY_ITEM = null;
	/** 第 107 変数： m_TAX_NAME_1 */
	public String m_TAX_NAME_1 = null;
	/** 第 108 変数： m_TAX_NAME_2 */
	public String m_TAX_NAME_2 = null;
	/** 第 109 変数： m_TAX_NAME_3 */
	public String m_TAX_NAME_3 = null;
	/** 第 110 変数： m_h_MANHOUR_TYP */
	public String m_h_MANHOUR_TYP = null;
	/** 第 111 変数： m_h_ODR_START_DATE_ALL */
	public String m_h_ODR_START_DATE_ALL = null;
	/** 第 112 変数： m_DUE_DATE_TIME */
	public String m_DUE_DATE_TIME = null;
	/** 第 113 変数： m_TIME_CTRL */
	public String m_TIME_CTRL = null;
	/** 第 114 変数： m_l_COUNT */
	public String m_l_COUNT = null;
	/** 第 115 変数： m_ROW_COUNT */
	public String m_ROW_COUNT = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_OUTSIDE_TYP_name */
	public List l_OUTSIDE_TYP_name = null;

	/** 第 2 List変数： l_OUTSIDE_TYP_val */
	public List l_OUTSIDE_TYP_val = null;

	/** 第 3 List変数： l_ACPT_INSPC_TYP_name */
	public List l_ACPT_INSPC_TYP_name = null;

	/** 第 4 List変数： l_ACPT_INSPC_TYP_val */
	public List l_ACPT_INSPC_TYP_val = null;

	/** 第 5 List変数： l_h_UNIT_COST_TYP */
	public List l_h_UNIT_COST_TYP = null;

	/** 第 6 List変数： l_UNIT_COST_TYP_name */
	public List l_UNIT_COST_TYP_name = null;

	/** 第 7 List変数： l_UNIT_COST_TYP_val */
	public List l_UNIT_COST_TYP_val = null;

	/** 第 8 List変数： l_h_PLANT_CD */
	public List l_h_PLANT_CD = null;

	/** 第 9 List変数： l_AFTER_DISC_AMOUNT */
	public List l_AFTER_DISC_AMOUNT = null;

	/** 第 10 List変数： l_PROVISIONAL_HOME_CUR_AMOUNT */
	public List l_PROVISIONAL_HOME_CUR_AMOUNT = null;

	/** 第 11 List変数： l_HOME_CUR_UNIT */
	public List l_HOME_CUR_UNIT = null;

	/** 第 12 List変数： l_EXCH_RATE */
	public List l_EXCH_RATE = null;

	/** 第 13 List変数： l_TAX_AMOUNT_1 */
	public List l_TAX_AMOUNT_1 = null;

	/** 第 14 List変数： l_TAX_AMOUNT_2 */
	public List l_TAX_AMOUNT_2 = null;

	/** 第 15 List変数： l_AMOUNT_INCLUDE_TAX */
	public List l_AMOUNT_INCLUDE_TAX = null;

	/** 第 16 List変数： l_h_HOME_DECIMAL_FIG */
	public List l_h_HOME_DECIMAL_FIG = null;

	/** 第 17 List変数： l_h_TAX_RATE_1 */
	public List l_h_TAX_RATE_1 = null;

	/** 第 18 List変数： l_h_TAX_RATE_2 */
	public List l_h_TAX_RATE_2 = null;

	/** 第 19 List変数： l_h_TAX_RATE_3 */
	public List l_h_TAX_RATE_3 = null;

	/** 第 20 List変数： l_TAX_AMOUNT_3 */
	public List l_TAX_AMOUNT_3 = null;

	/** 第 21 List変数： l_h_WORK_ODR_DLV_DATE_BY_PROC */
	public List l_h_WORK_ODR_DLV_DATE_BY_PROC = null;

	/** 第 22 List変数： l_h_OPR_INST_START_DATE_BY_PROC */
	public List l_h_OPR_INST_START_DATE_BY_PROC = null;

	/** 第 23 List変数： l_h_OPR_INST_QTY */
	public List l_h_OPR_INST_QTY = null;

	/** 第 24 List変数： l_SelectUnitCostFlag */
	public List l_SelectUnitCostFlag = null;

	/** 第 25 List変数： l_WORK_ODR_DLV_DATE_BY_ITEM_TIME */
	public List l_WORK_ODR_DLV_DATE_BY_ITEM_TIME = null;

	/** 第 26 List変数： l_OPR_INST_START_DATE_BY_ITEM_TIME */
	public List l_OPR_INST_START_DATE_BY_ITEM_TIME = null;

	/** 第 27 List変数： l_h_ODR_START_DATE_TIME */
	public List l_h_ODR_START_DATE_TIME = null;

	/** 第 28 List変数： l_h_WORK_ODR_DLV_DATE_BY_PROC_TIME */
	public List l_h_WORK_ODR_DLV_DATE_BY_PROC_TIME = null;

	/** 第 29 List変数： l_h_OPR_INST_START_DATE_BY_PROC_TIME */
	public List l_h_OPR_INST_START_DATE_BY_PROC_TIME = null;

	/** 第 30 List変数： l_WORK_ODR_CD */
	public List l_WORK_ODR_CD = null;

	/** 第 31 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 32 List変数： l_WORK_IN_PROC_CD */
	public List l_WORK_IN_PROC_CD = null;

	/** 第 33 List変数： l_PROC_NAME */
	public List l_PROC_NAME = null;

	/** 第 34 List変数： l_PROC_NO */
	public List l_PROC_NO = null;

	/** 第 35 List変数： l_WORK_ODR_DLV_DATE_BY_PROC */
	public List l_WORK_ODR_DLV_DATE_BY_PROC = null;

	/** 第 36 List変数： l_OPR_INST_START_DATE_BY_ITEM */
	public List l_OPR_INST_START_DATE_BY_ITEM = null;

	/** 第 37 List変数： l_WORK_ODR_DLV_DATE_BY_ITEM */
	public List l_WORK_ODR_DLV_DATE_BY_ITEM = null;

	/** 第 38 List変数： l_OPR_INST_START_DATE_BY_PROC */
	public List l_OPR_INST_START_DATE_BY_PROC = null;

	/** 第 39 List変数： l_OPR_INST_QTY */
	public List l_OPR_INST_QTY = null;

	/** 第 40 List変数： l_OUTSIDE_TYP */
	public List l_OUTSIDE_TYP = null;

	/** 第 41 List変数： l_WS_CD */
	public List l_WS_CD = null;

	/** 第 42 List変数： l_VEND_CD */
	public List l_VEND_CD = null;

	/** 第 43 List変数： l_OPR_INST_CD */
	public List l_OPR_INST_CD = null;

	/** 第 44 List変数： l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** 第 45 List変数： l_DRAW_CD */
	public List l_DRAW_CD = null;

	/** 第 46 List変数： l_SPEC */
	public List l_SPEC = null;

	/** 第 47 List変数： l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** 第 48 List変数： l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** 第 49 List変数： l_h_MODIFY_COUNT_BY_ITEM */
	public List l_h_MODIFY_COUNT_BY_ITEM = null;

	/** 第 50 List変数： l_h_MODIFY_COUNT_BY_PROC */
	public List l_h_MODIFY_COUNT_BY_PROC = null;

	/** 第 51 List変数： l_WORK_STS_TYP */
	public List l_WORK_STS_TYP = null;

	/** 第 52 List変数： l_PROC_EXPLOSION_FLG */
	public List l_PROC_EXPLOSION_FLG = null;

	/** 第 53 List変数： l_MRP_ODR_TYP */
	public List l_MRP_ODR_TYP = null;

	/** 第 54 List変数： l_UNIT_COST_TYP */
	public List l_UNIT_COST_TYP = null;

	/** 第 55 List変数： l_UNIT_COST */
	public List l_UNIT_COST = null;

	/** 第 56 List変数： l_PROCESSING_COST */
	public List l_PROCESSING_COST = null;

	/** 第 57 List変数： l_MATERIAL_COST */
	public List l_MATERIAL_COST = null;

	/** 第 58 List変数： l_OTHER_OVERHEADS */
	public List l_OTHER_OVERHEADS = null;

	/** 第 59 List変数： l_PUCH_ODR_AMOUNT */
	public List l_PUCH_ODR_AMOUNT = null;

	/** 第 60 List変数： l_DISC_AMOUNT */
	public List l_DISC_AMOUNT = null;

	/** 第 61 List変数： l_ACPT_INSPC_TYP */
	public List l_ACPT_INSPC_TYP = null;

	/** 第 62 List変数： l_WS_NAME */
	public List l_WS_NAME = null;

	/** 第 63 List変数： l_VEND_ANAME */
	public List l_VEND_ANAME = null;

	/** 第 64 List変数： l_ROUND_TYP */
	public List l_ROUND_TYP = null;

	/** 第 65 List変数： l_CUR_CD */
	public List l_CUR_CD = null;

	/** 第 66 List変数： l_CUR_NAME */
	public List l_CUR_NAME = null;

	/** 第 67 List変数： l_WORK_IN_PROC_COMMENT */
	public List l_WORK_IN_PROC_COMMENT = null;

	/** 第 68 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** 第 69 List変数： l_h_UNIT_QTY_TYP */
	public List l_h_UNIT_QTY_TYP = null;

	/** 第 70 List変数： l_h_PARENT_OD_NO */
	public List l_h_PARENT_OD_NO = null;

	/** 第 71 List変数： l_h_COMPANY_CD */
	public List l_h_COMPANY_CD = null;

	/** 第 72 List変数： l_h_ODR_START_DATE */
	public List l_h_ODR_START_DATE = null;

	/** 第 73 List変数： l_OD_NO */
	public List l_OD_NO = null;

	/** 第 74 List変数： l_JOB_ODR_DETAIL_NO */
	public List l_JOB_ODR_DETAIL_NO = null;

	/** 第 75 List変数： l_h_JOB_ODR_CANCEL_NO */
	public List l_h_JOB_ODR_CANCEL_NO = null;

	/** 第 76 List変数： l_DUE_DATE */
	public List l_DUE_DATE = null;

	/** 第 77 List変数： l_h_MODIFY_COUNT_OPR_INST */
	public List l_h_MODIFY_COUNT_OPR_INST = null;

	/** 第 78 List変数： l_OUTSIDE_TYP_DN */
	public List l_OUTSIDE_TYP_DN = null;

	/** 第 79 List変数： l_MRP_ODR_TYP_DN */
	public List l_MRP_ODR_TYP_DN = null;

	/** 第 80 List変数： l_EXCH_TYP */
	public List l_EXCH_TYP = null;

	/** 第 81 List変数： l_VEND_CUR_UNIT */
	public List l_VEND_CUR_UNIT = null;

	/** 第 82 List変数： l_h_VEND_DECIMAL_FIG */
	public List l_h_VEND_DECIMAL_FIG = null;

	/** 第 83 List変数： l_OPR_INST_CD_GNR_TYP */
	public List l_OPR_INST_CD_GNR_TYP = null;

	/** 第 84 List変数： l_h_OD_NO */
	public List l_h_OD_NO = null;

	/** 第 85 List変数： l_WORK_ODR_DLV_DATE_BY_PROC_ALL */
	public List l_WORK_ODR_DLV_DATE_BY_PROC_ALL = null;

	/** 第 86 List変数： l_OPR_INST_START_DATE_BY_PROC_ALL */
	public List l_OPR_INST_START_DATE_BY_PROC_ALL = null;

	/** 第 87 List変数： l_h_WORK_STS_TYP */
	public List l_h_WORK_STS_TYP = null;

	/** 第 88 List変数： l_FINAL_PROC_FLG */
	public List l_FINAL_PROC_FLG = null;

	/** 第 89 List変数： l_MODIFY_COUNT_BY_PROC */
	public List l_MODIFY_COUNT_BY_PROC = null;

	/** 第 90 List変数： l_h_BUSINESS_OPR_DATE */
	public List l_h_BUSINESS_OPR_DATE = null;

	/** 第 91 List変数： l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** 第 92 List変数： l_CAL_DATE */
	public List l_CAL_DATE = null;

	/** 第 93 List変数： l_CAL_NO */
	public List l_CAL_NO = null;

	/** 第 94 List変数： l_CHECK_DATE */
	public List l_CHECK_DATE = null;

	/** 第 95 List変数： l_WS_PLANT_CD */
	public List l_WS_PLANT_CD = null;

	/** 第 96 List変数： l_MODIFY_COUNT_OPR_INST */
	public List l_MODIFY_COUNT_OPR_INST = null;

	/** 第 97 List変数： l_OPR_INST_START_DATE_BY_PROC_TIME */
	public List l_OPR_INST_START_DATE_BY_PROC_TIME = null;

	/** 第 98 List変数： l_WORK_ODR_DLV_DATE_BY_PROC_TIME */
	public List l_WORK_ODR_DLV_DATE_BY_PROC_TIME = null;

	/** 第 99 List変数： l_OPR_INST_START_DATE_BY_ITEM_ALL */
	public List l_OPR_INST_START_DATE_BY_ITEM_ALL = null;

	/** 第 100 List変数： l_WORK_ODR_DLV_DATE_BY_ITEM_ALL */
	public List l_WORK_ODR_DLV_DATE_BY_ITEM_ALL = null;

	/** 第 101 List変数： l_LOWER_OD_NO */
	public List l_LOWER_OD_NO = null;

	/** 第 102 List変数： l_JOB_ODR_TYP */
	public List l_JOB_ODR_TYP = null;

	/** 第 103 List変数： l_JOB_ODR_DLV_DATE */
	public List l_JOB_ODR_DLV_DATE = null;

	/** 第 104 List変数： l_JOB_ODR_DLV_DATE_TIME */
	public List l_JOB_ODR_DLV_DATE_TIME = null;

	/** 第 105 List変数： l_h_JOB_ODR_CD */
	public List l_h_JOB_ODR_CD = null;

	/** 第 106 List変数： l_MODIFY_COUNT_BY_ITEM */
	public List l_MODIFY_COUNT_BY_ITEM = null;

	/** 第 107 List変数： l_TAX_NAME_1 */
	public List l_TAX_NAME_1 = null;

	/** 第 108 List変数： l_TAX_NAME_2 */
	public List l_TAX_NAME_2 = null;

	/** 第 109 List変数： l_TAX_NAME_3 */
	public List l_TAX_NAME_3 = null;

	/** 第 110 List変数： l_h_MANHOUR_TYP */
	public List l_h_MANHOUR_TYP = null;

	/** 第 111 List変数： l_h_ODR_START_DATE_ALL */
	public List l_h_ODR_START_DATE_ALL = null;

	/** 第 112 List変数： l_DUE_DATE_TIME */
	public List l_DUE_DATE_TIME = null;

	/** 第 113 List変数： l_TIME_CTRL */
	public List l_TIME_CTRL = null;

	/** 第 114 List変数： l_l_COUNT */
	public List l_l_COUNT = null;

	/** 第 115 List変数： l_ROW_COUNT */
	public List l_ROW_COUNT = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getOUTSIDE_TYP_name() { return m_OUTSIDE_TYP_name; }
	public String getOUTSIDE_TYP_val() { return m_OUTSIDE_TYP_val; }
	public String getACPT_INSPC_TYP_name() { return m_ACPT_INSPC_TYP_name; }
	public String getACPT_INSPC_TYP_val() { return m_ACPT_INSPC_TYP_val; }
	public String geth_UNIT_COST_TYP() { return m_h_UNIT_COST_TYP; }
	public String getUNIT_COST_TYP_name() { return m_UNIT_COST_TYP_name; }
	public String getUNIT_COST_TYP_val() { return m_UNIT_COST_TYP_val; }
	public String geth_PLANT_CD() { return m_h_PLANT_CD; }
	public String getAFTER_DISC_AMOUNT() { return m_AFTER_DISC_AMOUNT; }
	public String getPROVISIONAL_HOME_CUR_AMOUNT() { return m_PROVISIONAL_HOME_CUR_AMOUNT; }
	public String getHOME_CUR_UNIT() { return m_HOME_CUR_UNIT; }
	public String getEXCH_RATE() { return m_EXCH_RATE; }
	public String getTAX_AMOUNT_1() { return m_TAX_AMOUNT_1; }
	public String getTAX_AMOUNT_2() { return m_TAX_AMOUNT_2; }
	public String getAMOUNT_INCLUDE_TAX() { return m_AMOUNT_INCLUDE_TAX; }
	public String geth_HOME_DECIMAL_FIG() { return m_h_HOME_DECIMAL_FIG; }
	public String geth_TAX_RATE_1() { return m_h_TAX_RATE_1; }
	public String geth_TAX_RATE_2() { return m_h_TAX_RATE_2; }
	public String geth_TAX_RATE_3() { return m_h_TAX_RATE_3; }
	public String getTAX_AMOUNT_3() { return m_TAX_AMOUNT_3; }
	public String geth_WORK_ODR_DLV_DATE_BY_PROC() { return m_h_WORK_ODR_DLV_DATE_BY_PROC; }
	public String geth_OPR_INST_START_DATE_BY_PROC() { return m_h_OPR_INST_START_DATE_BY_PROC; }
	public String geth_OPR_INST_QTY() { return m_h_OPR_INST_QTY; }
	public String getSelectUnitCostFlag() { return m_SelectUnitCostFlag; }
	public String getWORK_ODR_DLV_DATE_BY_ITEM_TIME() { return m_WORK_ODR_DLV_DATE_BY_ITEM_TIME; }
	public String getOPR_INST_START_DATE_BY_ITEM_TIME() { return m_OPR_INST_START_DATE_BY_ITEM_TIME; }
	public String geth_ODR_START_DATE_TIME() { return m_h_ODR_START_DATE_TIME; }
	public String geth_WORK_ODR_DLV_DATE_BY_PROC_TIME() { return m_h_WORK_ODR_DLV_DATE_BY_PROC_TIME; }
	public String geth_OPR_INST_START_DATE_BY_PROC_TIME() { return m_h_OPR_INST_START_DATE_BY_PROC_TIME; }
	public String getWORK_ODR_CD() { return m_WORK_ODR_CD; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getWORK_IN_PROC_CD() { return m_WORK_IN_PROC_CD; }
	public String getPROC_NAME() { return m_PROC_NAME; }
	public String getPROC_NO() { return m_PROC_NO; }
	public String getWORK_ODR_DLV_DATE_BY_PROC() { return m_WORK_ODR_DLV_DATE_BY_PROC; }
	public String getOPR_INST_START_DATE_BY_ITEM() { return m_OPR_INST_START_DATE_BY_ITEM; }
	public String getWORK_ODR_DLV_DATE_BY_ITEM() { return m_WORK_ODR_DLV_DATE_BY_ITEM; }
	public String getOPR_INST_START_DATE_BY_PROC() { return m_OPR_INST_START_DATE_BY_PROC; }
	public String getOPR_INST_QTY() { return m_OPR_INST_QTY; }
	public String getOUTSIDE_TYP() { return m_OUTSIDE_TYP; }
	public String getWS_CD() { return m_WS_CD; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getOPR_INST_CD() { return m_OPR_INST_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getDRAW_CD() { return m_DRAW_CD; }
	public String getSPEC() { return m_SPEC; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String geth_MODIFY_COUNT_BY_ITEM() { return m_h_MODIFY_COUNT_BY_ITEM; }
	public String geth_MODIFY_COUNT_BY_PROC() { return m_h_MODIFY_COUNT_BY_PROC; }
	public String getWORK_STS_TYP() { return m_WORK_STS_TYP; }
	public String getPROC_EXPLOSION_FLG() { return m_PROC_EXPLOSION_FLG; }
	public String getMRP_ODR_TYP() { return m_MRP_ODR_TYP; }
	public String getUNIT_COST_TYP() { return m_UNIT_COST_TYP; }
	public String getUNIT_COST() { return m_UNIT_COST; }
	public String getPROCESSING_COST() { return m_PROCESSING_COST; }
	public String getMATERIAL_COST() { return m_MATERIAL_COST; }
	public String getOTHER_OVERHEADS() { return m_OTHER_OVERHEADS; }
	public String getPUCH_ODR_AMOUNT() { return m_PUCH_ODR_AMOUNT; }
	public String getDISC_AMOUNT() { return m_DISC_AMOUNT; }
	public String getACPT_INSPC_TYP() { return m_ACPT_INSPC_TYP; }
	public String getWS_NAME() { return m_WS_NAME; }
	public String getVEND_ANAME() { return m_VEND_ANAME; }
	public String getROUND_TYP() { return m_ROUND_TYP; }
	public String getCUR_CD() { return m_CUR_CD; }
	public String getCUR_NAME() { return m_CUR_NAME; }
	public String getWORK_IN_PROC_COMMENT() { return m_WORK_IN_PROC_COMMENT; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String geth_UNIT_QTY_TYP() { return m_h_UNIT_QTY_TYP; }
	public String geth_PARENT_OD_NO() { return m_h_PARENT_OD_NO; }
	public String geth_COMPANY_CD() { return m_h_COMPANY_CD; }
	public String geth_ODR_START_DATE() { return m_h_ODR_START_DATE; }
	public String getOD_NO() { return m_OD_NO; }
	public String getJOB_ODR_DETAIL_NO() { return m_JOB_ODR_DETAIL_NO; }
	public String geth_JOB_ODR_CANCEL_NO() { return m_h_JOB_ODR_CANCEL_NO; }
	public String getDUE_DATE() { return m_DUE_DATE; }
	public String geth_MODIFY_COUNT_OPR_INST() { return m_h_MODIFY_COUNT_OPR_INST; }
	public String getOUTSIDE_TYP_DN() { return m_OUTSIDE_TYP_DN; }
	public String getMRP_ODR_TYP_DN() { return m_MRP_ODR_TYP_DN; }
	public String getEXCH_TYP() { return m_EXCH_TYP; }
	public String getVEND_CUR_UNIT() { return m_VEND_CUR_UNIT; }
	public String geth_VEND_DECIMAL_FIG() { return m_h_VEND_DECIMAL_FIG; }
	public String getOPR_INST_CD_GNR_TYP() { return m_OPR_INST_CD_GNR_TYP; }
	public String geth_OD_NO() { return m_h_OD_NO; }
	public String getWORK_ODR_DLV_DATE_BY_PROC_ALL() { return m_WORK_ODR_DLV_DATE_BY_PROC_ALL; }
	public String getOPR_INST_START_DATE_BY_PROC_ALL() { return m_OPR_INST_START_DATE_BY_PROC_ALL; }
	public String geth_WORK_STS_TYP() { return m_h_WORK_STS_TYP; }
	public String getFINAL_PROC_FLG() { return m_FINAL_PROC_FLG; }
	public String getMODIFY_COUNT_BY_PROC() { return m_MODIFY_COUNT_BY_PROC; }
	public String geth_BUSINESS_OPR_DATE() { return m_h_BUSINESS_OPR_DATE; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getCAL_DATE() { return m_CAL_DATE; }
	public String getCAL_NO() { return m_CAL_NO; }
	public String getCHECK_DATE() { return m_CHECK_DATE; }
	public String getWS_PLANT_CD() { return m_WS_PLANT_CD; }
	public String getMODIFY_COUNT_OPR_INST() { return m_MODIFY_COUNT_OPR_INST; }
	public String getOPR_INST_START_DATE_BY_PROC_TIME() { return m_OPR_INST_START_DATE_BY_PROC_TIME; }
	public String getWORK_ODR_DLV_DATE_BY_PROC_TIME() { return m_WORK_ODR_DLV_DATE_BY_PROC_TIME; }
	public String getOPR_INST_START_DATE_BY_ITEM_ALL() { return m_OPR_INST_START_DATE_BY_ITEM_ALL; }
	public String getWORK_ODR_DLV_DATE_BY_ITEM_ALL() { return m_WORK_ODR_DLV_DATE_BY_ITEM_ALL; }
	public String getLOWER_OD_NO() { return m_LOWER_OD_NO; }
	public String getJOB_ODR_TYP() { return m_JOB_ODR_TYP; }
	public String getJOB_ODR_DLV_DATE() { return m_JOB_ODR_DLV_DATE; }
	public String getJOB_ODR_DLV_DATE_TIME() { return m_JOB_ODR_DLV_DATE_TIME; }
	public String geth_JOB_ODR_CD() { return m_h_JOB_ODR_CD; }
	public String getMODIFY_COUNT_BY_ITEM() { return m_MODIFY_COUNT_BY_ITEM; }
	public String getTAX_NAME_1() { return m_TAX_NAME_1; }
	public String getTAX_NAME_2() { return m_TAX_NAME_2; }
	public String getTAX_NAME_3() { return m_TAX_NAME_3; }
	public String geth_MANHOUR_TYP() { return m_h_MANHOUR_TYP; }
	public String geth_ODR_START_DATE_ALL() { return m_h_ODR_START_DATE_ALL; }
	public String getDUE_DATE_TIME() { return m_DUE_DATE_TIME; }
	public String getTIME_CTRL() { return m_TIME_CTRL; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }

	public List getList_OUTSIDE_TYP_name() { return l_OUTSIDE_TYP_name; }
	public List getList_OUTSIDE_TYP_val() { return l_OUTSIDE_TYP_val; }
	public List getList_ACPT_INSPC_TYP_name() { return l_ACPT_INSPC_TYP_name; }
	public List getList_ACPT_INSPC_TYP_val() { return l_ACPT_INSPC_TYP_val; }
	public List getList_h_UNIT_COST_TYP() { return l_h_UNIT_COST_TYP; }
	public List getList_UNIT_COST_TYP_name() { return l_UNIT_COST_TYP_name; }
	public List getList_UNIT_COST_TYP_val() { return l_UNIT_COST_TYP_val; }
	public List getList_h_PLANT_CD() { return l_h_PLANT_CD; }
	public List getList_AFTER_DISC_AMOUNT() { return l_AFTER_DISC_AMOUNT; }
	public List getList_PROVISIONAL_HOME_CUR_AMOUNT() { return l_PROVISIONAL_HOME_CUR_AMOUNT; }
	public List getList_HOME_CUR_UNIT() { return l_HOME_CUR_UNIT; }
	public List getList_EXCH_RATE() { return l_EXCH_RATE; }
	public List getList_TAX_AMOUNT_1() { return l_TAX_AMOUNT_1; }
	public List getList_TAX_AMOUNT_2() { return l_TAX_AMOUNT_2; }
	public List getList_AMOUNT_INCLUDE_TAX() { return l_AMOUNT_INCLUDE_TAX; }
	public List getList_h_HOME_DECIMAL_FIG() { return l_h_HOME_DECIMAL_FIG; }
	public List getList_h_TAX_RATE_1() { return l_h_TAX_RATE_1; }
	public List getList_h_TAX_RATE_2() { return l_h_TAX_RATE_2; }
	public List getList_h_TAX_RATE_3() { return l_h_TAX_RATE_3; }
	public List getList_TAX_AMOUNT_3() { return l_TAX_AMOUNT_3; }
	public List getList_h_WORK_ODR_DLV_DATE_BY_PROC() { return l_h_WORK_ODR_DLV_DATE_BY_PROC; }
	public List getList_h_OPR_INST_START_DATE_BY_PROC() { return l_h_OPR_INST_START_DATE_BY_PROC; }
	public List getList_h_OPR_INST_QTY() { return l_h_OPR_INST_QTY; }
	public List getList_SelectUnitCostFlag() { return l_SelectUnitCostFlag; }
	public List getList_WORK_ODR_DLV_DATE_BY_ITEM_TIME() { return l_WORK_ODR_DLV_DATE_BY_ITEM_TIME; }
	public List getList_OPR_INST_START_DATE_BY_ITEM_TIME() { return l_OPR_INST_START_DATE_BY_ITEM_TIME; }
	public List getList_h_ODR_START_DATE_TIME() { return l_h_ODR_START_DATE_TIME; }
	public List getList_h_WORK_ODR_DLV_DATE_BY_PROC_TIME() { return l_h_WORK_ODR_DLV_DATE_BY_PROC_TIME; }
	public List getList_h_OPR_INST_START_DATE_BY_PROC_TIME() { return l_h_OPR_INST_START_DATE_BY_PROC_TIME; }
	public List getList_WORK_ODR_CD() { return l_WORK_ODR_CD; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_WORK_IN_PROC_CD() { return l_WORK_IN_PROC_CD; }
	public List getList_PROC_NAME() { return l_PROC_NAME; }
	public List getList_PROC_NO() { return l_PROC_NO; }
	public List getList_WORK_ODR_DLV_DATE_BY_PROC() { return l_WORK_ODR_DLV_DATE_BY_PROC; }
	public List getList_OPR_INST_START_DATE_BY_ITEM() { return l_OPR_INST_START_DATE_BY_ITEM; }
	public List getList_WORK_ODR_DLV_DATE_BY_ITEM() { return l_WORK_ODR_DLV_DATE_BY_ITEM; }
	public List getList_OPR_INST_START_DATE_BY_PROC() { return l_OPR_INST_START_DATE_BY_PROC; }
	public List getList_OPR_INST_QTY() { return l_OPR_INST_QTY; }
	public List getList_OUTSIDE_TYP() { return l_OUTSIDE_TYP; }
	public List getList_WS_CD() { return l_WS_CD; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_OPR_INST_CD() { return l_OPR_INST_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_DRAW_CD() { return l_DRAW_CD; }
	public List getList_SPEC() { return l_SPEC; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_h_MODIFY_COUNT_BY_ITEM() { return l_h_MODIFY_COUNT_BY_ITEM; }
	public List getList_h_MODIFY_COUNT_BY_PROC() { return l_h_MODIFY_COUNT_BY_PROC; }
	public List getList_WORK_STS_TYP() { return l_WORK_STS_TYP; }
	public List getList_PROC_EXPLOSION_FLG() { return l_PROC_EXPLOSION_FLG; }
	public List getList_MRP_ODR_TYP() { return l_MRP_ODR_TYP; }
	public List getList_UNIT_COST_TYP() { return l_UNIT_COST_TYP; }
	public List getList_UNIT_COST() { return l_UNIT_COST; }
	public List getList_PROCESSING_COST() { return l_PROCESSING_COST; }
	public List getList_MATERIAL_COST() { return l_MATERIAL_COST; }
	public List getList_OTHER_OVERHEADS() { return l_OTHER_OVERHEADS; }
	public List getList_PUCH_ODR_AMOUNT() { return l_PUCH_ODR_AMOUNT; }
	public List getList_DISC_AMOUNT() { return l_DISC_AMOUNT; }
	public List getList_ACPT_INSPC_TYP() { return l_ACPT_INSPC_TYP; }
	public List getList_WS_NAME() { return l_WS_NAME; }
	public List getList_VEND_ANAME() { return l_VEND_ANAME; }
	public List getList_ROUND_TYP() { return l_ROUND_TYP; }
	public List getList_CUR_CD() { return l_CUR_CD; }
	public List getList_CUR_NAME() { return l_CUR_NAME; }
	public List getList_WORK_IN_PROC_COMMENT() { return l_WORK_IN_PROC_COMMENT; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_h_UNIT_QTY_TYP() { return l_h_UNIT_QTY_TYP; }
	public List getList_h_PARENT_OD_NO() { return l_h_PARENT_OD_NO; }
	public List getList_h_COMPANY_CD() { return l_h_COMPANY_CD; }
	public List getList_h_ODR_START_DATE() { return l_h_ODR_START_DATE; }
	public List getList_OD_NO() { return l_OD_NO; }
	public List getList_JOB_ODR_DETAIL_NO() { return l_JOB_ODR_DETAIL_NO; }
	public List getList_h_JOB_ODR_CANCEL_NO() { return l_h_JOB_ODR_CANCEL_NO; }
	public List getList_DUE_DATE() { return l_DUE_DATE; }
	public List getList_h_MODIFY_COUNT_OPR_INST() { return l_h_MODIFY_COUNT_OPR_INST; }
	public List getList_OUTSIDE_TYP_DN() { return l_OUTSIDE_TYP_DN; }
	public List getList_MRP_ODR_TYP_DN() { return l_MRP_ODR_TYP_DN; }
	public List getList_EXCH_TYP() { return l_EXCH_TYP; }
	public List getList_VEND_CUR_UNIT() { return l_VEND_CUR_UNIT; }
	public List getList_h_VEND_DECIMAL_FIG() { return l_h_VEND_DECIMAL_FIG; }
	public List getList_OPR_INST_CD_GNR_TYP() { return l_OPR_INST_CD_GNR_TYP; }
	public List getList_h_OD_NO() { return l_h_OD_NO; }
	public List getList_WORK_ODR_DLV_DATE_BY_PROC_ALL() { return l_WORK_ODR_DLV_DATE_BY_PROC_ALL; }
	public List getList_OPR_INST_START_DATE_BY_PROC_ALL() { return l_OPR_INST_START_DATE_BY_PROC_ALL; }
	public List getList_h_WORK_STS_TYP() { return l_h_WORK_STS_TYP; }
	public List getList_FINAL_PROC_FLG() { return l_FINAL_PROC_FLG; }
	public List getList_MODIFY_COUNT_BY_PROC() { return l_MODIFY_COUNT_BY_PROC; }
	public List getList_h_BUSINESS_OPR_DATE() { return l_h_BUSINESS_OPR_DATE; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_CAL_DATE() { return l_CAL_DATE; }
	public List getList_CAL_NO() { return l_CAL_NO; }
	public List getList_CHECK_DATE() { return l_CHECK_DATE; }
	public List getList_WS_PLANT_CD() { return l_WS_PLANT_CD; }
	public List getList_MODIFY_COUNT_OPR_INST() { return l_MODIFY_COUNT_OPR_INST; }
	public List getList_OPR_INST_START_DATE_BY_PROC_TIME() { return l_OPR_INST_START_DATE_BY_PROC_TIME; }
	public List getList_WORK_ODR_DLV_DATE_BY_PROC_TIME() { return l_WORK_ODR_DLV_DATE_BY_PROC_TIME; }
	public List getList_OPR_INST_START_DATE_BY_ITEM_ALL() { return l_OPR_INST_START_DATE_BY_ITEM_ALL; }
	public List getList_WORK_ODR_DLV_DATE_BY_ITEM_ALL() { return l_WORK_ODR_DLV_DATE_BY_ITEM_ALL; }
	public List getList_LOWER_OD_NO() { return l_LOWER_OD_NO; }
	public List getList_JOB_ODR_TYP() { return l_JOB_ODR_TYP; }
	public List getList_JOB_ODR_DLV_DATE() { return l_JOB_ODR_DLV_DATE; }
	public List getList_JOB_ODR_DLV_DATE_TIME() { return l_JOB_ODR_DLV_DATE_TIME; }
	public List getList_h_JOB_ODR_CD() { return l_h_JOB_ODR_CD; }
	public List getList_MODIFY_COUNT_BY_ITEM() { return l_MODIFY_COUNT_BY_ITEM; }
	public List getList_TAX_NAME_1() { return l_TAX_NAME_1; }
	public List getList_TAX_NAME_2() { return l_TAX_NAME_2; }
	public List getList_TAX_NAME_3() { return l_TAX_NAME_3; }
	public List getList_h_MANHOUR_TYP() { return l_h_MANHOUR_TYP; }
	public List getList_h_ODR_START_DATE_ALL() { return l_h_ODR_START_DATE_ALL; }
	public List getList_DUE_DATE_TIME() { return l_DUE_DATE_TIME; }
	public List getList_TIME_CTRL() { return l_TIME_CTRL; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }

	public void setOUTSIDE_TYP_name(String val) { m_OUTSIDE_TYP_name = val; }
	public void setOUTSIDE_TYP_val(String val) { m_OUTSIDE_TYP_val = val; }
	public void setACPT_INSPC_TYP_name(String val) { m_ACPT_INSPC_TYP_name = val; }
	public void setACPT_INSPC_TYP_val(String val) { m_ACPT_INSPC_TYP_val = val; }
	public void seth_UNIT_COST_TYP(String val) { m_h_UNIT_COST_TYP = val; }
	public void setUNIT_COST_TYP_name(String val) { m_UNIT_COST_TYP_name = val; }
	public void setUNIT_COST_TYP_val(String val) { m_UNIT_COST_TYP_val = val; }
	public void seth_PLANT_CD(String val) { m_h_PLANT_CD = val; }
	public void setAFTER_DISC_AMOUNT(String val) { m_AFTER_DISC_AMOUNT = val; }
	public void setPROVISIONAL_HOME_CUR_AMOUNT(String val) { m_PROVISIONAL_HOME_CUR_AMOUNT = val; }
	public void setHOME_CUR_UNIT(String val) { m_HOME_CUR_UNIT = val; }
	public void setEXCH_RATE(String val) { m_EXCH_RATE = val; }
	public void setTAX_AMOUNT_1(String val) { m_TAX_AMOUNT_1 = val; }
	public void setTAX_AMOUNT_2(String val) { m_TAX_AMOUNT_2 = val; }
	public void setAMOUNT_INCLUDE_TAX(String val) { m_AMOUNT_INCLUDE_TAX = val; }
	public void seth_HOME_DECIMAL_FIG(String val) { m_h_HOME_DECIMAL_FIG = val; }
	public void seth_TAX_RATE_1(String val) { m_h_TAX_RATE_1 = val; }
	public void seth_TAX_RATE_2(String val) { m_h_TAX_RATE_2 = val; }
	public void seth_TAX_RATE_3(String val) { m_h_TAX_RATE_3 = val; }
	public void setTAX_AMOUNT_3(String val) { m_TAX_AMOUNT_3 = val; }
	public void seth_WORK_ODR_DLV_DATE_BY_PROC(String val) { m_h_WORK_ODR_DLV_DATE_BY_PROC = val; }
	public void seth_OPR_INST_START_DATE_BY_PROC(String val) { m_h_OPR_INST_START_DATE_BY_PROC = val; }
	public void seth_OPR_INST_QTY(String val) { m_h_OPR_INST_QTY = val; }
	public void setSelectUnitCostFlag(String val) { m_SelectUnitCostFlag = val; }
	public void setWORK_ODR_DLV_DATE_BY_ITEM_TIME(String val) { m_WORK_ODR_DLV_DATE_BY_ITEM_TIME = val; }
	public void setOPR_INST_START_DATE_BY_ITEM_TIME(String val) { m_OPR_INST_START_DATE_BY_ITEM_TIME = val; }
	public void seth_ODR_START_DATE_TIME(String val) { m_h_ODR_START_DATE_TIME = val; }
	public void seth_WORK_ODR_DLV_DATE_BY_PROC_TIME(String val) { m_h_WORK_ODR_DLV_DATE_BY_PROC_TIME = val; }
	public void seth_OPR_INST_START_DATE_BY_PROC_TIME(String val) { m_h_OPR_INST_START_DATE_BY_PROC_TIME = val; }
	public void setWORK_ODR_CD(String val) { m_WORK_ODR_CD = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setWORK_IN_PROC_CD(String val) { m_WORK_IN_PROC_CD = val; }
	public void setPROC_NAME(String val) { m_PROC_NAME = val; }
	public void setPROC_NO(String val) { m_PROC_NO = val; }
	public void setWORK_ODR_DLV_DATE_BY_PROC(String val) { m_WORK_ODR_DLV_DATE_BY_PROC = val; }
	public void setOPR_INST_START_DATE_BY_ITEM(String val) { m_OPR_INST_START_DATE_BY_ITEM = val; }
	public void setWORK_ODR_DLV_DATE_BY_ITEM(String val) { m_WORK_ODR_DLV_DATE_BY_ITEM = val; }
	public void setOPR_INST_START_DATE_BY_PROC(String val) { m_OPR_INST_START_DATE_BY_PROC = val; }
	public void setOPR_INST_QTY(String val) { m_OPR_INST_QTY = val; }
	public void setOUTSIDE_TYP(String val) { m_OUTSIDE_TYP = val; }
	public void setWS_CD(String val) { m_WS_CD = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void setOPR_INST_CD(String val) { m_OPR_INST_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setDRAW_CD(String val) { m_DRAW_CD = val; }
	public void setSPEC(String val) { m_SPEC = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void seth_MODIFY_COUNT_BY_ITEM(String val) { m_h_MODIFY_COUNT_BY_ITEM = val; }
	public void seth_MODIFY_COUNT_BY_PROC(String val) { m_h_MODIFY_COUNT_BY_PROC = val; }
	public void setWORK_STS_TYP(String val) { m_WORK_STS_TYP = val; }
	public void setPROC_EXPLOSION_FLG(String val) { m_PROC_EXPLOSION_FLG = val; }
	public void setMRP_ODR_TYP(String val) { m_MRP_ODR_TYP = val; }
	public void setUNIT_COST_TYP(String val) { m_UNIT_COST_TYP = val; }
	public void setUNIT_COST(String val) { m_UNIT_COST = val; }
	public void setPROCESSING_COST(String val) { m_PROCESSING_COST = val; }
	public void setMATERIAL_COST(String val) { m_MATERIAL_COST = val; }
	public void setOTHER_OVERHEADS(String val) { m_OTHER_OVERHEADS = val; }
	public void setPUCH_ODR_AMOUNT(String val) { m_PUCH_ODR_AMOUNT = val; }
	public void setDISC_AMOUNT(String val) { m_DISC_AMOUNT = val; }
	public void setACPT_INSPC_TYP(String val) { m_ACPT_INSPC_TYP = val; }
	public void setWS_NAME(String val) { m_WS_NAME = val; }
	public void setVEND_ANAME(String val) { m_VEND_ANAME = val; }
	public void setROUND_TYP(String val) { m_ROUND_TYP = val; }
	public void setCUR_CD(String val) { m_CUR_CD = val; }
	public void setCUR_NAME(String val) { m_CUR_NAME = val; }
	public void setWORK_IN_PROC_COMMENT(String val) { m_WORK_IN_PROC_COMMENT = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void seth_UNIT_QTY_TYP(String val) { m_h_UNIT_QTY_TYP = val; }
	public void seth_PARENT_OD_NO(String val) { m_h_PARENT_OD_NO = val; }
	public void seth_COMPANY_CD(String val) { m_h_COMPANY_CD = val; }
	public void seth_ODR_START_DATE(String val) { m_h_ODR_START_DATE = val; }
	public void setOD_NO(String val) { m_OD_NO = val; }
	public void setJOB_ODR_DETAIL_NO(String val) { m_JOB_ODR_DETAIL_NO = val; }
	public void seth_JOB_ODR_CANCEL_NO(String val) { m_h_JOB_ODR_CANCEL_NO = val; }
	public void setDUE_DATE(String val) { m_DUE_DATE = val; }
	public void seth_MODIFY_COUNT_OPR_INST(String val) { m_h_MODIFY_COUNT_OPR_INST = val; }
	public void setOUTSIDE_TYP_DN(String val) { m_OUTSIDE_TYP_DN = val; }
	public void setMRP_ODR_TYP_DN(String val) { m_MRP_ODR_TYP_DN = val; }
	public void setEXCH_TYP(String val) { m_EXCH_TYP = val; }
	public void setVEND_CUR_UNIT(String val) { m_VEND_CUR_UNIT = val; }
	public void seth_VEND_DECIMAL_FIG(String val) { m_h_VEND_DECIMAL_FIG = val; }
	public void setOPR_INST_CD_GNR_TYP(String val) { m_OPR_INST_CD_GNR_TYP = val; }
	public void seth_OD_NO(String val) { m_h_OD_NO = val; }
	public void setWORK_ODR_DLV_DATE_BY_PROC_ALL(String val) { m_WORK_ODR_DLV_DATE_BY_PROC_ALL = val; }
	public void setOPR_INST_START_DATE_BY_PROC_ALL(String val) { m_OPR_INST_START_DATE_BY_PROC_ALL = val; }
	public void seth_WORK_STS_TYP(String val) { m_h_WORK_STS_TYP = val; }
	public void setFINAL_PROC_FLG(String val) { m_FINAL_PROC_FLG = val; }
	public void setMODIFY_COUNT_BY_PROC(String val) { m_MODIFY_COUNT_BY_PROC = val; }
	public void seth_BUSINESS_OPR_DATE(String val) { m_h_BUSINESS_OPR_DATE = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setCAL_DATE(String val) { m_CAL_DATE = val; }
	public void setCAL_NO(String val) { m_CAL_NO = val; }
	public void setCHECK_DATE(String val) { m_CHECK_DATE = val; }
	public void setWS_PLANT_CD(String val) { m_WS_PLANT_CD = val; }
	public void setMODIFY_COUNT_OPR_INST(String val) { m_MODIFY_COUNT_OPR_INST = val; }
	public void setOPR_INST_START_DATE_BY_PROC_TIME(String val) { m_OPR_INST_START_DATE_BY_PROC_TIME = val; }
	public void setWORK_ODR_DLV_DATE_BY_PROC_TIME(String val) { m_WORK_ODR_DLV_DATE_BY_PROC_TIME = val; }
	public void setOPR_INST_START_DATE_BY_ITEM_ALL(String val) { m_OPR_INST_START_DATE_BY_ITEM_ALL = val; }
	public void setWORK_ODR_DLV_DATE_BY_ITEM_ALL(String val) { m_WORK_ODR_DLV_DATE_BY_ITEM_ALL = val; }
	public void setLOWER_OD_NO(String val) { m_LOWER_OD_NO = val; }
	public void setJOB_ODR_TYP(String val) { m_JOB_ODR_TYP = val; }
	public void setJOB_ODR_DLV_DATE(String val) { m_JOB_ODR_DLV_DATE = val; }
	public void setJOB_ODR_DLV_DATE_TIME(String val) { m_JOB_ODR_DLV_DATE_TIME = val; }
	public void seth_JOB_ODR_CD(String val) { m_h_JOB_ODR_CD = val; }
	public void setMODIFY_COUNT_BY_ITEM(String val) { m_MODIFY_COUNT_BY_ITEM = val; }
	public void setTAX_NAME_1(String val) { m_TAX_NAME_1 = val; }
	public void setTAX_NAME_2(String val) { m_TAX_NAME_2 = val; }
	public void setTAX_NAME_3(String val) { m_TAX_NAME_3 = val; }
	public void seth_MANHOUR_TYP(String val) { m_h_MANHOUR_TYP = val; }
	public void seth_ODR_START_DATE_ALL(String val) { m_h_ODR_START_DATE_ALL = val; }
	public void setDUE_DATE_TIME(String val) { m_DUE_DATE_TIME = val; }
	public void setTIME_CTRL(String val) { m_TIME_CTRL = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }


	public void setList_OUTSIDE_TYP_name(List list) { l_OUTSIDE_TYP_name = list; }
	public void setList_OUTSIDE_TYP_val(List list) { l_OUTSIDE_TYP_val = list; }
	public void setList_ACPT_INSPC_TYP_name(List list) { l_ACPT_INSPC_TYP_name = list; }
	public void setList_ACPT_INSPC_TYP_val(List list) { l_ACPT_INSPC_TYP_val = list; }
	public void setList_h_UNIT_COST_TYP(List list) { l_h_UNIT_COST_TYP = list; }
	public void setList_UNIT_COST_TYP_name(List list) { l_UNIT_COST_TYP_name = list; }
	public void setList_UNIT_COST_TYP_val(List list) { l_UNIT_COST_TYP_val = list; }
	public void setList_h_PLANT_CD(List list) { l_h_PLANT_CD = list; }
	public void setList_AFTER_DISC_AMOUNT(List list) { l_AFTER_DISC_AMOUNT = list; }
	public void setList_PROVISIONAL_HOME_CUR_AMOUNT(List list) { l_PROVISIONAL_HOME_CUR_AMOUNT = list; }
	public void setList_HOME_CUR_UNIT(List list) { l_HOME_CUR_UNIT = list; }
	public void setList_EXCH_RATE(List list) { l_EXCH_RATE = list; }
	public void setList_TAX_AMOUNT_1(List list) { l_TAX_AMOUNT_1 = list; }
	public void setList_TAX_AMOUNT_2(List list) { l_TAX_AMOUNT_2 = list; }
	public void setList_AMOUNT_INCLUDE_TAX(List list) { l_AMOUNT_INCLUDE_TAX = list; }
	public void setList_h_HOME_DECIMAL_FIG(List list) { l_h_HOME_DECIMAL_FIG = list; }
	public void setList_h_TAX_RATE_1(List list) { l_h_TAX_RATE_1 = list; }
	public void setList_h_TAX_RATE_2(List list) { l_h_TAX_RATE_2 = list; }
	public void setList_h_TAX_RATE_3(List list) { l_h_TAX_RATE_3 = list; }
	public void setList_TAX_AMOUNT_3(List list) { l_TAX_AMOUNT_3 = list; }
	public void setList_h_WORK_ODR_DLV_DATE_BY_PROC(List list) { l_h_WORK_ODR_DLV_DATE_BY_PROC = list; }
	public void setList_h_OPR_INST_START_DATE_BY_PROC(List list) { l_h_OPR_INST_START_DATE_BY_PROC = list; }
	public void setList_h_OPR_INST_QTY(List list) { l_h_OPR_INST_QTY = list; }
	public void setList_SelectUnitCostFlag(List list) { l_SelectUnitCostFlag = list; }
	public void setList_WORK_ODR_DLV_DATE_BY_ITEM_TIME(List list) { l_WORK_ODR_DLV_DATE_BY_ITEM_TIME = list; }
	public void setList_OPR_INST_START_DATE_BY_ITEM_TIME(List list) { l_OPR_INST_START_DATE_BY_ITEM_TIME = list; }
	public void setList_h_ODR_START_DATE_TIME(List list) { l_h_ODR_START_DATE_TIME = list; }
	public void setList_h_WORK_ODR_DLV_DATE_BY_PROC_TIME(List list) { l_h_WORK_ODR_DLV_DATE_BY_PROC_TIME = list; }
	public void setList_h_OPR_INST_START_DATE_BY_PROC_TIME(List list) { l_h_OPR_INST_START_DATE_BY_PROC_TIME = list; }
	public void setList_WORK_ODR_CD(List list) { l_WORK_ODR_CD = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_WORK_IN_PROC_CD(List list) { l_WORK_IN_PROC_CD = list; }
	public void setList_PROC_NAME(List list) { l_PROC_NAME = list; }
	public void setList_PROC_NO(List list) { l_PROC_NO = list; }
	public void setList_WORK_ODR_DLV_DATE_BY_PROC(List list) { l_WORK_ODR_DLV_DATE_BY_PROC = list; }
	public void setList_OPR_INST_START_DATE_BY_ITEM(List list) { l_OPR_INST_START_DATE_BY_ITEM = list; }
	public void setList_WORK_ODR_DLV_DATE_BY_ITEM(List list) { l_WORK_ODR_DLV_DATE_BY_ITEM = list; }
	public void setList_OPR_INST_START_DATE_BY_PROC(List list) { l_OPR_INST_START_DATE_BY_PROC = list; }
	public void setList_OPR_INST_QTY(List list) { l_OPR_INST_QTY = list; }
	public void setList_OUTSIDE_TYP(List list) { l_OUTSIDE_TYP = list; }
	public void setList_WS_CD(List list) { l_WS_CD = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_OPR_INST_CD(List list) { l_OPR_INST_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_DRAW_CD(List list) { l_DRAW_CD = list; }
	public void setList_SPEC(List list) { l_SPEC = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_h_MODIFY_COUNT_BY_ITEM(List list) { l_h_MODIFY_COUNT_BY_ITEM = list; }
	public void setList_h_MODIFY_COUNT_BY_PROC(List list) { l_h_MODIFY_COUNT_BY_PROC = list; }
	public void setList_WORK_STS_TYP(List list) { l_WORK_STS_TYP = list; }
	public void setList_PROC_EXPLOSION_FLG(List list) { l_PROC_EXPLOSION_FLG = list; }
	public void setList_MRP_ODR_TYP(List list) { l_MRP_ODR_TYP = list; }
	public void setList_UNIT_COST_TYP(List list) { l_UNIT_COST_TYP = list; }
	public void setList_UNIT_COST(List list) { l_UNIT_COST = list; }
	public void setList_PROCESSING_COST(List list) { l_PROCESSING_COST = list; }
	public void setList_MATERIAL_COST(List list) { l_MATERIAL_COST = list; }
	public void setList_OTHER_OVERHEADS(List list) { l_OTHER_OVERHEADS = list; }
	public void setList_PUCH_ODR_AMOUNT(List list) { l_PUCH_ODR_AMOUNT = list; }
	public void setList_DISC_AMOUNT(List list) { l_DISC_AMOUNT = list; }
	public void setList_ACPT_INSPC_TYP(List list) { l_ACPT_INSPC_TYP = list; }
	public void setList_WS_NAME(List list) { l_WS_NAME = list; }
	public void setList_VEND_ANAME(List list) { l_VEND_ANAME = list; }
	public void setList_ROUND_TYP(List list) { l_ROUND_TYP = list; }
	public void setList_CUR_CD(List list) { l_CUR_CD = list; }
	public void setList_CUR_NAME(List list) { l_CUR_NAME = list; }
	public void setList_WORK_IN_PROC_COMMENT(List list) { l_WORK_IN_PROC_COMMENT = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_h_UNIT_QTY_TYP(List list) { l_h_UNIT_QTY_TYP = list; }
	public void setList_h_PARENT_OD_NO(List list) { l_h_PARENT_OD_NO = list; }
	public void setList_h_COMPANY_CD(List list) { l_h_COMPANY_CD = list; }
	public void setList_h_ODR_START_DATE(List list) { l_h_ODR_START_DATE = list; }
	public void setList_OD_NO(List list) { l_OD_NO = list; }
	public void setList_JOB_ODR_DETAIL_NO(List list) { l_JOB_ODR_DETAIL_NO = list; }
	public void setList_h_JOB_ODR_CANCEL_NO(List list) { l_h_JOB_ODR_CANCEL_NO = list; }
	public void setList_DUE_DATE(List list) { l_DUE_DATE = list; }
	public void setList_h_MODIFY_COUNT_OPR_INST(List list) { l_h_MODIFY_COUNT_OPR_INST = list; }
	public void setList_OUTSIDE_TYP_DN(List list) { l_OUTSIDE_TYP_DN = list; }
	public void setList_MRP_ODR_TYP_DN(List list) { l_MRP_ODR_TYP_DN = list; }
	public void setList_EXCH_TYP(List list) { l_EXCH_TYP = list; }
	public void setList_VEND_CUR_UNIT(List list) { l_VEND_CUR_UNIT = list; }
	public void setList_h_VEND_DECIMAL_FIG(List list) { l_h_VEND_DECIMAL_FIG = list; }
	public void setList_OPR_INST_CD_GNR_TYP(List list) { l_OPR_INST_CD_GNR_TYP = list; }
	public void setList_h_OD_NO(List list) { l_h_OD_NO = list; }
	public void setList_WORK_ODR_DLV_DATE_BY_PROC_ALL(List list) { l_WORK_ODR_DLV_DATE_BY_PROC_ALL = list; }
	public void setList_OPR_INST_START_DATE_BY_PROC_ALL(List list) { l_OPR_INST_START_DATE_BY_PROC_ALL = list; }
	public void setList_h_WORK_STS_TYP(List list) { l_h_WORK_STS_TYP = list; }
	public void setList_FINAL_PROC_FLG(List list) { l_FINAL_PROC_FLG = list; }
	public void setList_MODIFY_COUNT_BY_PROC(List list) { l_MODIFY_COUNT_BY_PROC = list; }
	public void setList_h_BUSINESS_OPR_DATE(List list) { l_h_BUSINESS_OPR_DATE = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_CAL_DATE(List list) { l_CAL_DATE = list; }
	public void setList_CAL_NO(List list) { l_CAL_NO = list; }
	public void setList_CHECK_DATE(List list) { l_CHECK_DATE = list; }
	public void setList_WS_PLANT_CD(List list) { l_WS_PLANT_CD = list; }
	public void setList_MODIFY_COUNT_OPR_INST(List list) { l_MODIFY_COUNT_OPR_INST = list; }
	public void setList_OPR_INST_START_DATE_BY_PROC_TIME(List list) { l_OPR_INST_START_DATE_BY_PROC_TIME = list; }
	public void setList_WORK_ODR_DLV_DATE_BY_PROC_TIME(List list) { l_WORK_ODR_DLV_DATE_BY_PROC_TIME = list; }
	public void setList_OPR_INST_START_DATE_BY_ITEM_ALL(List list) { l_OPR_INST_START_DATE_BY_ITEM_ALL = list; }
	public void setList_WORK_ODR_DLV_DATE_BY_ITEM_ALL(List list) { l_WORK_ODR_DLV_DATE_BY_ITEM_ALL = list; }
	public void setList_LOWER_OD_NO(List list) { l_LOWER_OD_NO = list; }
	public void setList_JOB_ODR_TYP(List list) { l_JOB_ODR_TYP = list; }
	public void setList_JOB_ODR_DLV_DATE(List list) { l_JOB_ODR_DLV_DATE = list; }
	public void setList_JOB_ODR_DLV_DATE_TIME(List list) { l_JOB_ODR_DLV_DATE_TIME = list; }
	public void setList_h_JOB_ODR_CD(List list) { l_h_JOB_ODR_CD = list; }
	public void setList_MODIFY_COUNT_BY_ITEM(List list) { l_MODIFY_COUNT_BY_ITEM = list; }
	public void setList_TAX_NAME_1(List list) { l_TAX_NAME_1 = list; }
	public void setList_TAX_NAME_2(List list) { l_TAX_NAME_2 = list; }
	public void setList_TAX_NAME_3(List list) { l_TAX_NAME_3 = list; }
	public void setList_h_MANHOUR_TYP(List list) { l_h_MANHOUR_TYP = list; }
	public void setList_h_ODR_START_DATE_ALL(List list) { l_h_ODR_START_DATE_ALL = list; }
	public void setList_DUE_DATE_TIME(List list) { l_DUE_DATE_TIME = list; }
	public void setList_TIME_CTRL(List list) { l_TIME_CTRL = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }

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
			l_OUTSIDE_TYP_name.add(((AD0030020Struct) list.get(i)).getOUTSIDE_TYP_name());
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
			l_OUTSIDE_TYP_val.add(((AD0030020Struct) list.get(i)).getOUTSIDE_TYP_val());
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
			l_ACPT_INSPC_TYP_name.add(((AD0030020Struct) list.get(i)).getACPT_INSPC_TYP_name());
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
			l_ACPT_INSPC_TYP_val.add(((AD0030020Struct) list.get(i)).getACPT_INSPC_TYP_val());
		}
		return size;
	}
	public int setL2L_h_UNIT_COST_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_UNIT_COST_TYP == null) {
			l_h_UNIT_COST_TYP = new ArrayList();
		} else {
			l_h_UNIT_COST_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_UNIT_COST_TYP.add(((AD0030020Struct) list.get(i)).geth_UNIT_COST_TYP());
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
			l_UNIT_COST_TYP_name.add(((AD0030020Struct) list.get(i)).getUNIT_COST_TYP_name());
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
			l_UNIT_COST_TYP_val.add(((AD0030020Struct) list.get(i)).getUNIT_COST_TYP_val());
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
			l_h_PLANT_CD.add(((AD0030020Struct) list.get(i)).geth_PLANT_CD());
		}
		return size;
	}
	public int setL2L_AFTER_DISC_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_AFTER_DISC_AMOUNT == null) {
			l_AFTER_DISC_AMOUNT = new ArrayList();
		} else {
			l_AFTER_DISC_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_AFTER_DISC_AMOUNT.add(((AD0030020Struct) list.get(i)).getAFTER_DISC_AMOUNT());
		}
		return size;
	}
	public int setL2L_PROVISIONAL_HOME_CUR_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROVISIONAL_HOME_CUR_AMOUNT == null) {
			l_PROVISIONAL_HOME_CUR_AMOUNT = new ArrayList();
		} else {
			l_PROVISIONAL_HOME_CUR_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROVISIONAL_HOME_CUR_AMOUNT.add(((AD0030020Struct) list.get(i)).getPROVISIONAL_HOME_CUR_AMOUNT());
		}
		return size;
	}
	public int setL2L_HOME_CUR_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HOME_CUR_UNIT == null) {
			l_HOME_CUR_UNIT = new ArrayList();
		} else {
			l_HOME_CUR_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HOME_CUR_UNIT.add(((AD0030020Struct) list.get(i)).getHOME_CUR_UNIT());
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
			l_EXCH_RATE.add(((AD0030020Struct) list.get(i)).getEXCH_RATE());
		}
		return size;
	}
	public int setL2L_TAX_AMOUNT_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_AMOUNT_1 == null) {
			l_TAX_AMOUNT_1 = new ArrayList();
		} else {
			l_TAX_AMOUNT_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_AMOUNT_1.add(((AD0030020Struct) list.get(i)).getTAX_AMOUNT_1());
		}
		return size;
	}
	public int setL2L_TAX_AMOUNT_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_AMOUNT_2 == null) {
			l_TAX_AMOUNT_2 = new ArrayList();
		} else {
			l_TAX_AMOUNT_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_AMOUNT_2.add(((AD0030020Struct) list.get(i)).getTAX_AMOUNT_2());
		}
		return size;
	}
	public int setL2L_AMOUNT_INCLUDE_TAX(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_AMOUNT_INCLUDE_TAX == null) {
			l_AMOUNT_INCLUDE_TAX = new ArrayList();
		} else {
			l_AMOUNT_INCLUDE_TAX.clear();
		}
		for (int i = 0; i < size; i++) {
			l_AMOUNT_INCLUDE_TAX.add(((AD0030020Struct) list.get(i)).getAMOUNT_INCLUDE_TAX());
		}
		return size;
	}
	public int setL2L_h_HOME_DECIMAL_FIG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_HOME_DECIMAL_FIG == null) {
			l_h_HOME_DECIMAL_FIG = new ArrayList();
		} else {
			l_h_HOME_DECIMAL_FIG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_HOME_DECIMAL_FIG.add(((AD0030020Struct) list.get(i)).geth_HOME_DECIMAL_FIG());
		}
		return size;
	}
	public int setL2L_h_TAX_RATE_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_TAX_RATE_1 == null) {
			l_h_TAX_RATE_1 = new ArrayList();
		} else {
			l_h_TAX_RATE_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_TAX_RATE_1.add(((AD0030020Struct) list.get(i)).geth_TAX_RATE_1());
		}
		return size;
	}
	public int setL2L_h_TAX_RATE_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_TAX_RATE_2 == null) {
			l_h_TAX_RATE_2 = new ArrayList();
		} else {
			l_h_TAX_RATE_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_TAX_RATE_2.add(((AD0030020Struct) list.get(i)).geth_TAX_RATE_2());
		}
		return size;
	}
	public int setL2L_h_TAX_RATE_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_TAX_RATE_3 == null) {
			l_h_TAX_RATE_3 = new ArrayList();
		} else {
			l_h_TAX_RATE_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_TAX_RATE_3.add(((AD0030020Struct) list.get(i)).geth_TAX_RATE_3());
		}
		return size;
	}
	public int setL2L_TAX_AMOUNT_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_AMOUNT_3 == null) {
			l_TAX_AMOUNT_3 = new ArrayList();
		} else {
			l_TAX_AMOUNT_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_AMOUNT_3.add(((AD0030020Struct) list.get(i)).getTAX_AMOUNT_3());
		}
		return size;
	}
	public int setL2L_h_WORK_ODR_DLV_DATE_BY_PROC(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_WORK_ODR_DLV_DATE_BY_PROC == null) {
			l_h_WORK_ODR_DLV_DATE_BY_PROC = new ArrayList();
		} else {
			l_h_WORK_ODR_DLV_DATE_BY_PROC.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_WORK_ODR_DLV_DATE_BY_PROC.add(((AD0030020Struct) list.get(i)).geth_WORK_ODR_DLV_DATE_BY_PROC());
		}
		return size;
	}
	public int setL2L_h_OPR_INST_START_DATE_BY_PROC(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_OPR_INST_START_DATE_BY_PROC == null) {
			l_h_OPR_INST_START_DATE_BY_PROC = new ArrayList();
		} else {
			l_h_OPR_INST_START_DATE_BY_PROC.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_OPR_INST_START_DATE_BY_PROC.add(((AD0030020Struct) list.get(i)).geth_OPR_INST_START_DATE_BY_PROC());
		}
		return size;
	}
	public int setL2L_h_OPR_INST_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_OPR_INST_QTY == null) {
			l_h_OPR_INST_QTY = new ArrayList();
		} else {
			l_h_OPR_INST_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_OPR_INST_QTY.add(((AD0030020Struct) list.get(i)).geth_OPR_INST_QTY());
		}
		return size;
	}
	public int setL2L_SelectUnitCostFlag(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SelectUnitCostFlag == null) {
			l_SelectUnitCostFlag = new ArrayList();
		} else {
			l_SelectUnitCostFlag.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SelectUnitCostFlag.add(((AD0030020Struct) list.get(i)).getSelectUnitCostFlag());
		}
		return size;
	}
	public int setL2L_WORK_ODR_DLV_DATE_BY_ITEM_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WORK_ODR_DLV_DATE_BY_ITEM_TIME == null) {
			l_WORK_ODR_DLV_DATE_BY_ITEM_TIME = new ArrayList();
		} else {
			l_WORK_ODR_DLV_DATE_BY_ITEM_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WORK_ODR_DLV_DATE_BY_ITEM_TIME.add(((AD0030020Struct) list.get(i)).getWORK_ODR_DLV_DATE_BY_ITEM_TIME());
		}
		return size;
	}
	public int setL2L_OPR_INST_START_DATE_BY_ITEM_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_INST_START_DATE_BY_ITEM_TIME == null) {
			l_OPR_INST_START_DATE_BY_ITEM_TIME = new ArrayList();
		} else {
			l_OPR_INST_START_DATE_BY_ITEM_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_INST_START_DATE_BY_ITEM_TIME.add(((AD0030020Struct) list.get(i)).getOPR_INST_START_DATE_BY_ITEM_TIME());
		}
		return size;
	}
	public int setL2L_h_ODR_START_DATE_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ODR_START_DATE_TIME == null) {
			l_h_ODR_START_DATE_TIME = new ArrayList();
		} else {
			l_h_ODR_START_DATE_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ODR_START_DATE_TIME.add(((AD0030020Struct) list.get(i)).geth_ODR_START_DATE_TIME());
		}
		return size;
	}
	public int setL2L_h_WORK_ODR_DLV_DATE_BY_PROC_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_WORK_ODR_DLV_DATE_BY_PROC_TIME == null) {
			l_h_WORK_ODR_DLV_DATE_BY_PROC_TIME = new ArrayList();
		} else {
			l_h_WORK_ODR_DLV_DATE_BY_PROC_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_WORK_ODR_DLV_DATE_BY_PROC_TIME.add(((AD0030020Struct) list.get(i)).geth_WORK_ODR_DLV_DATE_BY_PROC_TIME());
		}
		return size;
	}
	public int setL2L_h_OPR_INST_START_DATE_BY_PROC_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_OPR_INST_START_DATE_BY_PROC_TIME == null) {
			l_h_OPR_INST_START_DATE_BY_PROC_TIME = new ArrayList();
		} else {
			l_h_OPR_INST_START_DATE_BY_PROC_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_OPR_INST_START_DATE_BY_PROC_TIME.add(((AD0030020Struct) list.get(i)).geth_OPR_INST_START_DATE_BY_PROC_TIME());
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
			l_WORK_ODR_CD.add(((AD0030020Struct) list.get(i)).getWORK_ODR_CD());
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
			l_ITEM_CD.add(((AD0030020Struct) list.get(i)).getITEM_CD());
		}
		return size;
	}
	public int setL2L_WORK_IN_PROC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WORK_IN_PROC_CD == null) {
			l_WORK_IN_PROC_CD = new ArrayList();
		} else {
			l_WORK_IN_PROC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WORK_IN_PROC_CD.add(((AD0030020Struct) list.get(i)).getWORK_IN_PROC_CD());
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
			l_PROC_NAME.add(((AD0030020Struct) list.get(i)).getPROC_NAME());
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
			l_PROC_NO.add(((AD0030020Struct) list.get(i)).getPROC_NO());
		}
		return size;
	}
	public int setL2L_WORK_ODR_DLV_DATE_BY_PROC(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WORK_ODR_DLV_DATE_BY_PROC == null) {
			l_WORK_ODR_DLV_DATE_BY_PROC = new ArrayList();
		} else {
			l_WORK_ODR_DLV_DATE_BY_PROC.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WORK_ODR_DLV_DATE_BY_PROC.add(((AD0030020Struct) list.get(i)).getWORK_ODR_DLV_DATE_BY_PROC());
		}
		return size;
	}
	public int setL2L_OPR_INST_START_DATE_BY_ITEM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_INST_START_DATE_BY_ITEM == null) {
			l_OPR_INST_START_DATE_BY_ITEM = new ArrayList();
		} else {
			l_OPR_INST_START_DATE_BY_ITEM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_INST_START_DATE_BY_ITEM.add(((AD0030020Struct) list.get(i)).getOPR_INST_START_DATE_BY_ITEM());
		}
		return size;
	}
	public int setL2L_WORK_ODR_DLV_DATE_BY_ITEM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WORK_ODR_DLV_DATE_BY_ITEM == null) {
			l_WORK_ODR_DLV_DATE_BY_ITEM = new ArrayList();
		} else {
			l_WORK_ODR_DLV_DATE_BY_ITEM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WORK_ODR_DLV_DATE_BY_ITEM.add(((AD0030020Struct) list.get(i)).getWORK_ODR_DLV_DATE_BY_ITEM());
		}
		return size;
	}
	public int setL2L_OPR_INST_START_DATE_BY_PROC(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_INST_START_DATE_BY_PROC == null) {
			l_OPR_INST_START_DATE_BY_PROC = new ArrayList();
		} else {
			l_OPR_INST_START_DATE_BY_PROC.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_INST_START_DATE_BY_PROC.add(((AD0030020Struct) list.get(i)).getOPR_INST_START_DATE_BY_PROC());
		}
		return size;
	}
	public int setL2L_OPR_INST_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_INST_QTY == null) {
			l_OPR_INST_QTY = new ArrayList();
		} else {
			l_OPR_INST_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_INST_QTY.add(((AD0030020Struct) list.get(i)).getOPR_INST_QTY());
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
			l_OUTSIDE_TYP.add(((AD0030020Struct) list.get(i)).getOUTSIDE_TYP());
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
			l_WS_CD.add(((AD0030020Struct) list.get(i)).getWS_CD());
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
			l_VEND_CD.add(((AD0030020Struct) list.get(i)).getVEND_CD());
		}
		return size;
	}
	public int setL2L_OPR_INST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_INST_CD == null) {
			l_OPR_INST_CD = new ArrayList();
		} else {
			l_OPR_INST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_INST_CD.add(((AD0030020Struct) list.get(i)).getOPR_INST_CD());
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
			l_ITEM_NAME.add(((AD0030020Struct) list.get(i)).getITEM_NAME());
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
			l_DRAW_CD.add(((AD0030020Struct) list.get(i)).getDRAW_CD());
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
			l_SPEC.add(((AD0030020Struct) list.get(i)).getSPEC());
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
			l_STOCK_UNIT.add(((AD0030020Struct) list.get(i)).getSTOCK_UNIT());
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
			l_JOB_ODR_CD.add(((AD0030020Struct) list.get(i)).getJOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_h_MODIFY_COUNT_BY_ITEM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_MODIFY_COUNT_BY_ITEM == null) {
			l_h_MODIFY_COUNT_BY_ITEM = new ArrayList();
		} else {
			l_h_MODIFY_COUNT_BY_ITEM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_MODIFY_COUNT_BY_ITEM.add(((AD0030020Struct) list.get(i)).geth_MODIFY_COUNT_BY_ITEM());
		}
		return size;
	}
	public int setL2L_h_MODIFY_COUNT_BY_PROC(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_MODIFY_COUNT_BY_PROC == null) {
			l_h_MODIFY_COUNT_BY_PROC = new ArrayList();
		} else {
			l_h_MODIFY_COUNT_BY_PROC.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_MODIFY_COUNT_BY_PROC.add(((AD0030020Struct) list.get(i)).geth_MODIFY_COUNT_BY_PROC());
		}
		return size;
	}
	public int setL2L_WORK_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WORK_STS_TYP == null) {
			l_WORK_STS_TYP = new ArrayList();
		} else {
			l_WORK_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WORK_STS_TYP.add(((AD0030020Struct) list.get(i)).getWORK_STS_TYP());
		}
		return size;
	}
	public int setL2L_PROC_EXPLOSION_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_EXPLOSION_FLG == null) {
			l_PROC_EXPLOSION_FLG = new ArrayList();
		} else {
			l_PROC_EXPLOSION_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_EXPLOSION_FLG.add(((AD0030020Struct) list.get(i)).getPROC_EXPLOSION_FLG());
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
			l_MRP_ODR_TYP.add(((AD0030020Struct) list.get(i)).getMRP_ODR_TYP());
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
			l_UNIT_COST_TYP.add(((AD0030020Struct) list.get(i)).getUNIT_COST_TYP());
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
			l_UNIT_COST.add(((AD0030020Struct) list.get(i)).getUNIT_COST());
		}
		return size;
	}
	public int setL2L_PROCESSING_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROCESSING_COST == null) {
			l_PROCESSING_COST = new ArrayList();
		} else {
			l_PROCESSING_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROCESSING_COST.add(((AD0030020Struct) list.get(i)).getPROCESSING_COST());
		}
		return size;
	}
	public int setL2L_MATERIAL_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MATERIAL_COST == null) {
			l_MATERIAL_COST = new ArrayList();
		} else {
			l_MATERIAL_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MATERIAL_COST.add(((AD0030020Struct) list.get(i)).getMATERIAL_COST());
		}
		return size;
	}
	public int setL2L_OTHER_OVERHEADS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OTHER_OVERHEADS == null) {
			l_OTHER_OVERHEADS = new ArrayList();
		} else {
			l_OTHER_OVERHEADS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OTHER_OVERHEADS.add(((AD0030020Struct) list.get(i)).getOTHER_OVERHEADS());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_AMOUNT == null) {
			l_PUCH_ODR_AMOUNT = new ArrayList();
		} else {
			l_PUCH_ODR_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_AMOUNT.add(((AD0030020Struct) list.get(i)).getPUCH_ODR_AMOUNT());
		}
		return size;
	}
	public int setL2L_DISC_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DISC_AMOUNT == null) {
			l_DISC_AMOUNT = new ArrayList();
		} else {
			l_DISC_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DISC_AMOUNT.add(((AD0030020Struct) list.get(i)).getDISC_AMOUNT());
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
			l_ACPT_INSPC_TYP.add(((AD0030020Struct) list.get(i)).getACPT_INSPC_TYP());
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
			l_WS_NAME.add(((AD0030020Struct) list.get(i)).getWS_NAME());
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
			l_VEND_ANAME.add(((AD0030020Struct) list.get(i)).getVEND_ANAME());
		}
		return size;
	}
	public int setL2L_ROUND_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ROUND_TYP == null) {
			l_ROUND_TYP = new ArrayList();
		} else {
			l_ROUND_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ROUND_TYP.add(((AD0030020Struct) list.get(i)).getROUND_TYP());
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
			l_CUR_CD.add(((AD0030020Struct) list.get(i)).getCUR_CD());
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
			l_CUR_NAME.add(((AD0030020Struct) list.get(i)).getCUR_NAME());
		}
		return size;
	}
	public int setL2L_WORK_IN_PROC_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WORK_IN_PROC_COMMENT == null) {
			l_WORK_IN_PROC_COMMENT = new ArrayList();
		} else {
			l_WORK_IN_PROC_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WORK_IN_PROC_COMMENT.add(((AD0030020Struct) list.get(i)).getWORK_IN_PROC_COMMENT());
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
			l_PLANT_CD.add(((AD0030020Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_h_UNIT_QTY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_UNIT_QTY_TYP == null) {
			l_h_UNIT_QTY_TYP = new ArrayList();
		} else {
			l_h_UNIT_QTY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_UNIT_QTY_TYP.add(((AD0030020Struct) list.get(i)).geth_UNIT_QTY_TYP());
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
			l_h_PARENT_OD_NO.add(((AD0030020Struct) list.get(i)).geth_PARENT_OD_NO());
		}
		return size;
	}
	public int setL2L_h_COMPANY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_COMPANY_CD == null) {
			l_h_COMPANY_CD = new ArrayList();
		} else {
			l_h_COMPANY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_COMPANY_CD.add(((AD0030020Struct) list.get(i)).geth_COMPANY_CD());
		}
		return size;
	}
	public int setL2L_h_ODR_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ODR_START_DATE == null) {
			l_h_ODR_START_DATE = new ArrayList();
		} else {
			l_h_ODR_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ODR_START_DATE.add(((AD0030020Struct) list.get(i)).geth_ODR_START_DATE());
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
			l_OD_NO.add(((AD0030020Struct) list.get(i)).getOD_NO());
		}
		return size;
	}
	public int setL2L_JOB_ODR_DETAIL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_DETAIL_NO == null) {
			l_JOB_ODR_DETAIL_NO = new ArrayList();
		} else {
			l_JOB_ODR_DETAIL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_DETAIL_NO.add(((AD0030020Struct) list.get(i)).getJOB_ODR_DETAIL_NO());
		}
		return size;
	}
	public int setL2L_h_JOB_ODR_CANCEL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_JOB_ODR_CANCEL_NO == null) {
			l_h_JOB_ODR_CANCEL_NO = new ArrayList();
		} else {
			l_h_JOB_ODR_CANCEL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_JOB_ODR_CANCEL_NO.add(((AD0030020Struct) list.get(i)).geth_JOB_ODR_CANCEL_NO());
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
			l_DUE_DATE.add(((AD0030020Struct) list.get(i)).getDUE_DATE());
		}
		return size;
	}
	public int setL2L_h_MODIFY_COUNT_OPR_INST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_MODIFY_COUNT_OPR_INST == null) {
			l_h_MODIFY_COUNT_OPR_INST = new ArrayList();
		} else {
			l_h_MODIFY_COUNT_OPR_INST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_MODIFY_COUNT_OPR_INST.add(((AD0030020Struct) list.get(i)).geth_MODIFY_COUNT_OPR_INST());
		}
		return size;
	}
	public int setL2L_OUTSIDE_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OUTSIDE_TYP_DN == null) {
			l_OUTSIDE_TYP_DN = new ArrayList();
		} else {
			l_OUTSIDE_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OUTSIDE_TYP_DN.add(((AD0030020Struct) list.get(i)).getOUTSIDE_TYP_DN());
		}
		return size;
	}
	public int setL2L_MRP_ODR_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_ODR_TYP_DN == null) {
			l_MRP_ODR_TYP_DN = new ArrayList();
		} else {
			l_MRP_ODR_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_ODR_TYP_DN.add(((AD0030020Struct) list.get(i)).getMRP_ODR_TYP_DN());
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
			l_EXCH_TYP.add(((AD0030020Struct) list.get(i)).getEXCH_TYP());
		}
		return size;
	}
	public int setL2L_VEND_CUR_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_CUR_UNIT == null) {
			l_VEND_CUR_UNIT = new ArrayList();
		} else {
			l_VEND_CUR_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_CUR_UNIT.add(((AD0030020Struct) list.get(i)).getVEND_CUR_UNIT());
		}
		return size;
	}
	public int setL2L_h_VEND_DECIMAL_FIG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_VEND_DECIMAL_FIG == null) {
			l_h_VEND_DECIMAL_FIG = new ArrayList();
		} else {
			l_h_VEND_DECIMAL_FIG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_VEND_DECIMAL_FIG.add(((AD0030020Struct) list.get(i)).geth_VEND_DECIMAL_FIG());
		}
		return size;
	}
	public int setL2L_OPR_INST_CD_GNR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_INST_CD_GNR_TYP == null) {
			l_OPR_INST_CD_GNR_TYP = new ArrayList();
		} else {
			l_OPR_INST_CD_GNR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_INST_CD_GNR_TYP.add(((AD0030020Struct) list.get(i)).getOPR_INST_CD_GNR_TYP());
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
			l_h_OD_NO.add(((AD0030020Struct) list.get(i)).geth_OD_NO());
		}
		return size;
	}
	public int setL2L_WORK_ODR_DLV_DATE_BY_PROC_ALL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WORK_ODR_DLV_DATE_BY_PROC_ALL == null) {
			l_WORK_ODR_DLV_DATE_BY_PROC_ALL = new ArrayList();
		} else {
			l_WORK_ODR_DLV_DATE_BY_PROC_ALL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WORK_ODR_DLV_DATE_BY_PROC_ALL.add(((AD0030020Struct) list.get(i)).getWORK_ODR_DLV_DATE_BY_PROC_ALL());
		}
		return size;
	}
	public int setL2L_OPR_INST_START_DATE_BY_PROC_ALL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_INST_START_DATE_BY_PROC_ALL == null) {
			l_OPR_INST_START_DATE_BY_PROC_ALL = new ArrayList();
		} else {
			l_OPR_INST_START_DATE_BY_PROC_ALL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_INST_START_DATE_BY_PROC_ALL.add(((AD0030020Struct) list.get(i)).getOPR_INST_START_DATE_BY_PROC_ALL());
		}
		return size;
	}
	public int setL2L_h_WORK_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_WORK_STS_TYP == null) {
			l_h_WORK_STS_TYP = new ArrayList();
		} else {
			l_h_WORK_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_WORK_STS_TYP.add(((AD0030020Struct) list.get(i)).geth_WORK_STS_TYP());
		}
		return size;
	}
	public int setL2L_FINAL_PROC_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FINAL_PROC_FLG == null) {
			l_FINAL_PROC_FLG = new ArrayList();
		} else {
			l_FINAL_PROC_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FINAL_PROC_FLG.add(((AD0030020Struct) list.get(i)).getFINAL_PROC_FLG());
		}
		return size;
	}
	public int setL2L_MODIFY_COUNT_BY_PROC(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MODIFY_COUNT_BY_PROC == null) {
			l_MODIFY_COUNT_BY_PROC = new ArrayList();
		} else {
			l_MODIFY_COUNT_BY_PROC.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MODIFY_COUNT_BY_PROC.add(((AD0030020Struct) list.get(i)).getMODIFY_COUNT_BY_PROC());
		}
		return size;
	}
	public int setL2L_h_BUSINESS_OPR_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_BUSINESS_OPR_DATE == null) {
			l_h_BUSINESS_OPR_DATE = new ArrayList();
		} else {
			l_h_BUSINESS_OPR_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_BUSINESS_OPR_DATE.add(((AD0030020Struct) list.get(i)).geth_BUSINESS_OPR_DATE());
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
			l_COMPANY_CD.add(((AD0030020Struct) list.get(i)).getCOMPANY_CD());
		}
		return size;
	}
	public int setL2L_CAL_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CAL_DATE == null) {
			l_CAL_DATE = new ArrayList();
		} else {
			l_CAL_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CAL_DATE.add(((AD0030020Struct) list.get(i)).getCAL_DATE());
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
			l_CAL_NO.add(((AD0030020Struct) list.get(i)).getCAL_NO());
		}
		return size;
	}
	public int setL2L_CHECK_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CHECK_DATE == null) {
			l_CHECK_DATE = new ArrayList();
		} else {
			l_CHECK_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CHECK_DATE.add(((AD0030020Struct) list.get(i)).getCHECK_DATE());
		}
		return size;
	}
	public int setL2L_WS_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WS_PLANT_CD == null) {
			l_WS_PLANT_CD = new ArrayList();
		} else {
			l_WS_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WS_PLANT_CD.add(((AD0030020Struct) list.get(i)).getWS_PLANT_CD());
		}
		return size;
	}
	public int setL2L_MODIFY_COUNT_OPR_INST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MODIFY_COUNT_OPR_INST == null) {
			l_MODIFY_COUNT_OPR_INST = new ArrayList();
		} else {
			l_MODIFY_COUNT_OPR_INST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MODIFY_COUNT_OPR_INST.add(((AD0030020Struct) list.get(i)).getMODIFY_COUNT_OPR_INST());
		}
		return size;
	}
	public int setL2L_OPR_INST_START_DATE_BY_PROC_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_INST_START_DATE_BY_PROC_TIME == null) {
			l_OPR_INST_START_DATE_BY_PROC_TIME = new ArrayList();
		} else {
			l_OPR_INST_START_DATE_BY_PROC_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_INST_START_DATE_BY_PROC_TIME.add(((AD0030020Struct) list.get(i)).getOPR_INST_START_DATE_BY_PROC_TIME());
		}
		return size;
	}
	public int setL2L_WORK_ODR_DLV_DATE_BY_PROC_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WORK_ODR_DLV_DATE_BY_PROC_TIME == null) {
			l_WORK_ODR_DLV_DATE_BY_PROC_TIME = new ArrayList();
		} else {
			l_WORK_ODR_DLV_DATE_BY_PROC_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WORK_ODR_DLV_DATE_BY_PROC_TIME.add(((AD0030020Struct) list.get(i)).getWORK_ODR_DLV_DATE_BY_PROC_TIME());
		}
		return size;
	}
	public int setL2L_OPR_INST_START_DATE_BY_ITEM_ALL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_INST_START_DATE_BY_ITEM_ALL == null) {
			l_OPR_INST_START_DATE_BY_ITEM_ALL = new ArrayList();
		} else {
			l_OPR_INST_START_DATE_BY_ITEM_ALL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_INST_START_DATE_BY_ITEM_ALL.add(((AD0030020Struct) list.get(i)).getOPR_INST_START_DATE_BY_ITEM_ALL());
		}
		return size;
	}
	public int setL2L_WORK_ODR_DLV_DATE_BY_ITEM_ALL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WORK_ODR_DLV_DATE_BY_ITEM_ALL == null) {
			l_WORK_ODR_DLV_DATE_BY_ITEM_ALL = new ArrayList();
		} else {
			l_WORK_ODR_DLV_DATE_BY_ITEM_ALL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WORK_ODR_DLV_DATE_BY_ITEM_ALL.add(((AD0030020Struct) list.get(i)).getWORK_ODR_DLV_DATE_BY_ITEM_ALL());
		}
		return size;
	}
	public int setL2L_LOWER_OD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOWER_OD_NO == null) {
			l_LOWER_OD_NO = new ArrayList();
		} else {
			l_LOWER_OD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOWER_OD_NO.add(((AD0030020Struct) list.get(i)).getLOWER_OD_NO());
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
			l_JOB_ODR_TYP.add(((AD0030020Struct) list.get(i)).getJOB_ODR_TYP());
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
			l_JOB_ODR_DLV_DATE.add(((AD0030020Struct) list.get(i)).getJOB_ODR_DLV_DATE());
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
			l_JOB_ODR_DLV_DATE_TIME.add(((AD0030020Struct) list.get(i)).getJOB_ODR_DLV_DATE_TIME());
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
			l_h_JOB_ODR_CD.add(((AD0030020Struct) list.get(i)).geth_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_MODIFY_COUNT_BY_ITEM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MODIFY_COUNT_BY_ITEM == null) {
			l_MODIFY_COUNT_BY_ITEM = new ArrayList();
		} else {
			l_MODIFY_COUNT_BY_ITEM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MODIFY_COUNT_BY_ITEM.add(((AD0030020Struct) list.get(i)).getMODIFY_COUNT_BY_ITEM());
		}
		return size;
	}
	public int setL2L_TAX_NAME_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_NAME_1 == null) {
			l_TAX_NAME_1 = new ArrayList();
		} else {
			l_TAX_NAME_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_NAME_1.add(((AD0030020Struct) list.get(i)).getTAX_NAME_1());
		}
		return size;
	}
	public int setL2L_TAX_NAME_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_NAME_2 == null) {
			l_TAX_NAME_2 = new ArrayList();
		} else {
			l_TAX_NAME_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_NAME_2.add(((AD0030020Struct) list.get(i)).getTAX_NAME_2());
		}
		return size;
	}
	public int setL2L_TAX_NAME_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_NAME_3 == null) {
			l_TAX_NAME_3 = new ArrayList();
		} else {
			l_TAX_NAME_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_NAME_3.add(((AD0030020Struct) list.get(i)).getTAX_NAME_3());
		}
		return size;
	}
	public int setL2L_h_MANHOUR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_MANHOUR_TYP == null) {
			l_h_MANHOUR_TYP = new ArrayList();
		} else {
			l_h_MANHOUR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_MANHOUR_TYP.add(((AD0030020Struct) list.get(i)).geth_MANHOUR_TYP());
		}
		return size;
	}
	public int setL2L_h_ODR_START_DATE_ALL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ODR_START_DATE_ALL == null) {
			l_h_ODR_START_DATE_ALL = new ArrayList();
		} else {
			l_h_ODR_START_DATE_ALL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ODR_START_DATE_ALL.add(((AD0030020Struct) list.get(i)).geth_ODR_START_DATE_ALL());
		}
		return size;
	}
	public int setL2L_DUE_DATE_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DUE_DATE_TIME == null) {
			l_DUE_DATE_TIME = new ArrayList();
		} else {
			l_DUE_DATE_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DUE_DATE_TIME.add(((AD0030020Struct) list.get(i)).getDUE_DATE_TIME());
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
			l_TIME_CTRL.add(((AD0030020Struct) list.get(i)).getTIME_CTRL());
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
			l_l_COUNT.add(((AD0030020Struct) list.get(i)).getl_COUNT());
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
			l_ROW_COUNT.add(((AD0030020Struct) list.get(i)).getROW_COUNT());
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
		m_h_UNIT_COST_TYP = null;
		m_UNIT_COST_TYP_name = null;
		m_UNIT_COST_TYP_val = null;
		m_h_PLANT_CD = null;
		m_AFTER_DISC_AMOUNT = null;
		m_PROVISIONAL_HOME_CUR_AMOUNT = null;
		m_HOME_CUR_UNIT = null;
		m_EXCH_RATE = null;
		m_TAX_AMOUNT_1 = null;
		m_TAX_AMOUNT_2 = null;
		m_AMOUNT_INCLUDE_TAX = null;
		m_h_HOME_DECIMAL_FIG = null;
		m_h_TAX_RATE_1 = null;
		m_h_TAX_RATE_2 = null;
		m_h_TAX_RATE_3 = null;
		m_TAX_AMOUNT_3 = null;
		m_h_WORK_ODR_DLV_DATE_BY_PROC = null;
		m_h_OPR_INST_START_DATE_BY_PROC = null;
		m_h_OPR_INST_QTY = null;
		m_SelectUnitCostFlag = null;
		m_WORK_ODR_DLV_DATE_BY_ITEM_TIME = null;
		m_OPR_INST_START_DATE_BY_ITEM_TIME = null;
		m_h_ODR_START_DATE_TIME = null;
		m_h_WORK_ODR_DLV_DATE_BY_PROC_TIME = null;
		m_h_OPR_INST_START_DATE_BY_PROC_TIME = null;
		m_WORK_ODR_CD = null;
		m_ITEM_CD = null;
		m_WORK_IN_PROC_CD = null;
		m_PROC_NAME = null;
		m_PROC_NO = null;
		m_WORK_ODR_DLV_DATE_BY_PROC = null;
		m_OPR_INST_START_DATE_BY_ITEM = null;
		m_WORK_ODR_DLV_DATE_BY_ITEM = null;
		m_OPR_INST_START_DATE_BY_PROC = null;
		m_OPR_INST_QTY = null;
		m_OUTSIDE_TYP = null;
		m_WS_CD = null;
		m_VEND_CD = null;
		m_OPR_INST_CD = null;
		m_ITEM_NAME = null;
		m_DRAW_CD = null;
		m_SPEC = null;
		m_STOCK_UNIT = null;
		m_JOB_ODR_CD = null;
		m_h_MODIFY_COUNT_BY_ITEM = null;
		m_h_MODIFY_COUNT_BY_PROC = null;
		m_WORK_STS_TYP = null;
		m_PROC_EXPLOSION_FLG = null;
		m_MRP_ODR_TYP = null;
		m_UNIT_COST_TYP = null;
		m_UNIT_COST = null;
		m_PROCESSING_COST = null;
		m_MATERIAL_COST = null;
		m_OTHER_OVERHEADS = null;
		m_PUCH_ODR_AMOUNT = null;
		m_DISC_AMOUNT = null;
		m_ACPT_INSPC_TYP = null;
		m_WS_NAME = null;
		m_VEND_ANAME = null;
		m_ROUND_TYP = null;
		m_CUR_CD = null;
		m_CUR_NAME = null;
		m_WORK_IN_PROC_COMMENT = null;
		m_PLANT_CD = null;
		m_h_UNIT_QTY_TYP = null;
		m_h_PARENT_OD_NO = null;
		m_h_COMPANY_CD = null;
		m_h_ODR_START_DATE = null;
		m_OD_NO = null;
		m_JOB_ODR_DETAIL_NO = null;
		m_h_JOB_ODR_CANCEL_NO = null;
		m_DUE_DATE = null;
		m_h_MODIFY_COUNT_OPR_INST = null;
		m_OUTSIDE_TYP_DN = null;
		m_MRP_ODR_TYP_DN = null;
		m_EXCH_TYP = null;
		m_VEND_CUR_UNIT = null;
		m_h_VEND_DECIMAL_FIG = null;
		m_OPR_INST_CD_GNR_TYP = null;
		m_h_OD_NO = null;
		m_WORK_ODR_DLV_DATE_BY_PROC_ALL = null;
		m_OPR_INST_START_DATE_BY_PROC_ALL = null;
		m_h_WORK_STS_TYP = null;
		m_FINAL_PROC_FLG = null;
		m_MODIFY_COUNT_BY_PROC = null;
		m_h_BUSINESS_OPR_DATE = null;
		m_COMPANY_CD = null;
		m_CAL_DATE = null;
		m_CAL_NO = null;
		m_CHECK_DATE = null;
		m_WS_PLANT_CD = null;
		m_MODIFY_COUNT_OPR_INST = null;
		m_OPR_INST_START_DATE_BY_PROC_TIME = null;
		m_WORK_ODR_DLV_DATE_BY_PROC_TIME = null;
		m_OPR_INST_START_DATE_BY_ITEM_ALL = null;
		m_WORK_ODR_DLV_DATE_BY_ITEM_ALL = null;
		m_LOWER_OD_NO = null;
		m_JOB_ODR_TYP = null;
		m_JOB_ODR_DLV_DATE = null;
		m_JOB_ODR_DLV_DATE_TIME = null;
		m_h_JOB_ODR_CD = null;
		m_MODIFY_COUNT_BY_ITEM = null;
		m_TAX_NAME_1 = null;
		m_TAX_NAME_2 = null;
		m_TAX_NAME_3 = null;
		m_h_MANHOUR_TYP = null;
		m_h_ODR_START_DATE_ALL = null;
		m_DUE_DATE_TIME = null;
		m_TIME_CTRL = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;

		l_OUTSIDE_TYP_name = null;
		l_OUTSIDE_TYP_val = null;
		l_ACPT_INSPC_TYP_name = null;
		l_ACPT_INSPC_TYP_val = null;
		l_h_UNIT_COST_TYP = null;
		l_UNIT_COST_TYP_name = null;
		l_UNIT_COST_TYP_val = null;
		l_h_PLANT_CD = null;
		l_AFTER_DISC_AMOUNT = null;
		l_PROVISIONAL_HOME_CUR_AMOUNT = null;
		l_HOME_CUR_UNIT = null;
		l_EXCH_RATE = null;
		l_TAX_AMOUNT_1 = null;
		l_TAX_AMOUNT_2 = null;
		l_AMOUNT_INCLUDE_TAX = null;
		l_h_HOME_DECIMAL_FIG = null;
		l_h_TAX_RATE_1 = null;
		l_h_TAX_RATE_2 = null;
		l_h_TAX_RATE_3 = null;
		l_TAX_AMOUNT_3 = null;
		l_h_WORK_ODR_DLV_DATE_BY_PROC = null;
		l_h_OPR_INST_START_DATE_BY_PROC = null;
		l_h_OPR_INST_QTY = null;
		l_SelectUnitCostFlag = null;
		l_WORK_ODR_DLV_DATE_BY_ITEM_TIME = null;
		l_OPR_INST_START_DATE_BY_ITEM_TIME = null;
		l_h_ODR_START_DATE_TIME = null;
		l_h_WORK_ODR_DLV_DATE_BY_PROC_TIME = null;
		l_h_OPR_INST_START_DATE_BY_PROC_TIME = null;
		l_WORK_ODR_CD = null;
		l_ITEM_CD = null;
		l_WORK_IN_PROC_CD = null;
		l_PROC_NAME = null;
		l_PROC_NO = null;
		l_WORK_ODR_DLV_DATE_BY_PROC = null;
		l_OPR_INST_START_DATE_BY_ITEM = null;
		l_WORK_ODR_DLV_DATE_BY_ITEM = null;
		l_OPR_INST_START_DATE_BY_PROC = null;
		l_OPR_INST_QTY = null;
		l_OUTSIDE_TYP = null;
		l_WS_CD = null;
		l_VEND_CD = null;
		l_OPR_INST_CD = null;
		l_ITEM_NAME = null;
		l_DRAW_CD = null;
		l_SPEC = null;
		l_STOCK_UNIT = null;
		l_JOB_ODR_CD = null;
		l_h_MODIFY_COUNT_BY_ITEM = null;
		l_h_MODIFY_COUNT_BY_PROC = null;
		l_WORK_STS_TYP = null;
		l_PROC_EXPLOSION_FLG = null;
		l_MRP_ODR_TYP = null;
		l_UNIT_COST_TYP = null;
		l_UNIT_COST = null;
		l_PROCESSING_COST = null;
		l_MATERIAL_COST = null;
		l_OTHER_OVERHEADS = null;
		l_PUCH_ODR_AMOUNT = null;
		l_DISC_AMOUNT = null;
		l_ACPT_INSPC_TYP = null;
		l_WS_NAME = null;
		l_VEND_ANAME = null;
		l_ROUND_TYP = null;
		l_CUR_CD = null;
		l_CUR_NAME = null;
		l_WORK_IN_PROC_COMMENT = null;
		l_PLANT_CD = null;
		l_h_UNIT_QTY_TYP = null;
		l_h_PARENT_OD_NO = null;
		l_h_COMPANY_CD = null;
		l_h_ODR_START_DATE = null;
		l_OD_NO = null;
		l_JOB_ODR_DETAIL_NO = null;
		l_h_JOB_ODR_CANCEL_NO = null;
		l_DUE_DATE = null;
		l_h_MODIFY_COUNT_OPR_INST = null;
		l_OUTSIDE_TYP_DN = null;
		l_MRP_ODR_TYP_DN = null;
		l_EXCH_TYP = null;
		l_VEND_CUR_UNIT = null;
		l_h_VEND_DECIMAL_FIG = null;
		l_OPR_INST_CD_GNR_TYP = null;
		l_h_OD_NO = null;
		l_WORK_ODR_DLV_DATE_BY_PROC_ALL = null;
		l_OPR_INST_START_DATE_BY_PROC_ALL = null;
		l_h_WORK_STS_TYP = null;
		l_FINAL_PROC_FLG = null;
		l_MODIFY_COUNT_BY_PROC = null;
		l_h_BUSINESS_OPR_DATE = null;
		l_COMPANY_CD = null;
		l_CAL_DATE = null;
		l_CAL_NO = null;
		l_CHECK_DATE = null;
		l_WS_PLANT_CD = null;
		l_MODIFY_COUNT_OPR_INST = null;
		l_OPR_INST_START_DATE_BY_PROC_TIME = null;
		l_WORK_ODR_DLV_DATE_BY_PROC_TIME = null;
		l_OPR_INST_START_DATE_BY_ITEM_ALL = null;
		l_WORK_ODR_DLV_DATE_BY_ITEM_ALL = null;
		l_LOWER_OD_NO = null;
		l_JOB_ODR_TYP = null;
		l_JOB_ODR_DLV_DATE = null;
		l_JOB_ODR_DLV_DATE_TIME = null;
		l_h_JOB_ODR_CD = null;
		l_MODIFY_COUNT_BY_ITEM = null;
		l_TAX_NAME_1 = null;
		l_TAX_NAME_2 = null;
		l_TAX_NAME_3 = null;
		l_h_MANHOUR_TYP = null;
		l_h_ODR_START_DATE_ALL = null;
		l_DUE_DATE_TIME = null;
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
	 * medAD0030020クラスの標準コンストラクタ
	 */
	public AD0030020Struct()
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
	public void setStruct(AD0030020Struct struct)
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
	public void setStructM(AD0030020Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setOUTSIDE_TYP_name(struct.getOUTSIDE_TYP_name());
			this.setOUTSIDE_TYP_val(struct.getOUTSIDE_TYP_val());
			this.setACPT_INSPC_TYP_name(struct.getACPT_INSPC_TYP_name());
			this.setACPT_INSPC_TYP_val(struct.getACPT_INSPC_TYP_val());
			this.seth_UNIT_COST_TYP(struct.geth_UNIT_COST_TYP());
			this.setUNIT_COST_TYP_name(struct.getUNIT_COST_TYP_name());
			this.setUNIT_COST_TYP_val(struct.getUNIT_COST_TYP_val());
			this.seth_PLANT_CD(struct.geth_PLANT_CD());
			this.setAFTER_DISC_AMOUNT(struct.getAFTER_DISC_AMOUNT());
			this.setPROVISIONAL_HOME_CUR_AMOUNT(struct.getPROVISIONAL_HOME_CUR_AMOUNT());
			this.setHOME_CUR_UNIT(struct.getHOME_CUR_UNIT());
			this.setEXCH_RATE(struct.getEXCH_RATE());
			this.setTAX_AMOUNT_1(struct.getTAX_AMOUNT_1());
			this.setTAX_AMOUNT_2(struct.getTAX_AMOUNT_2());
			this.setAMOUNT_INCLUDE_TAX(struct.getAMOUNT_INCLUDE_TAX());
			this.seth_HOME_DECIMAL_FIG(struct.geth_HOME_DECIMAL_FIG());
			this.seth_TAX_RATE_1(struct.geth_TAX_RATE_1());
			this.seth_TAX_RATE_2(struct.geth_TAX_RATE_2());
			this.seth_TAX_RATE_3(struct.geth_TAX_RATE_3());
			this.setTAX_AMOUNT_3(struct.getTAX_AMOUNT_3());
			this.seth_WORK_ODR_DLV_DATE_BY_PROC(struct.geth_WORK_ODR_DLV_DATE_BY_PROC());
			this.seth_OPR_INST_START_DATE_BY_PROC(struct.geth_OPR_INST_START_DATE_BY_PROC());
			this.seth_OPR_INST_QTY(struct.geth_OPR_INST_QTY());
			this.setSelectUnitCostFlag(struct.getSelectUnitCostFlag());
			this.setWORK_ODR_DLV_DATE_BY_ITEM_TIME(struct.getWORK_ODR_DLV_DATE_BY_ITEM_TIME());
			this.setOPR_INST_START_DATE_BY_ITEM_TIME(struct.getOPR_INST_START_DATE_BY_ITEM_TIME());
			this.seth_ODR_START_DATE_TIME(struct.geth_ODR_START_DATE_TIME());
			this.seth_WORK_ODR_DLV_DATE_BY_PROC_TIME(struct.geth_WORK_ODR_DLV_DATE_BY_PROC_TIME());
			this.seth_OPR_INST_START_DATE_BY_PROC_TIME(struct.geth_OPR_INST_START_DATE_BY_PROC_TIME());
			this.setWORK_ODR_CD(struct.getWORK_ODR_CD());
			this.setITEM_CD(struct.getITEM_CD());
			this.setWORK_IN_PROC_CD(struct.getWORK_IN_PROC_CD());
			this.setPROC_NAME(struct.getPROC_NAME());
			this.setPROC_NO(struct.getPROC_NO());
			this.setWORK_ODR_DLV_DATE_BY_PROC(struct.getWORK_ODR_DLV_DATE_BY_PROC());
			this.setOPR_INST_START_DATE_BY_ITEM(struct.getOPR_INST_START_DATE_BY_ITEM());
			this.setWORK_ODR_DLV_DATE_BY_ITEM(struct.getWORK_ODR_DLV_DATE_BY_ITEM());
			this.setOPR_INST_START_DATE_BY_PROC(struct.getOPR_INST_START_DATE_BY_PROC());
			this.setOPR_INST_QTY(struct.getOPR_INST_QTY());
			this.setOUTSIDE_TYP(struct.getOUTSIDE_TYP());
			this.setWS_CD(struct.getWS_CD());
			this.setVEND_CD(struct.getVEND_CD());
			this.setOPR_INST_CD(struct.getOPR_INST_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setDRAW_CD(struct.getDRAW_CD());
			this.setSPEC(struct.getSPEC());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.seth_MODIFY_COUNT_BY_ITEM(struct.geth_MODIFY_COUNT_BY_ITEM());
			this.seth_MODIFY_COUNT_BY_PROC(struct.geth_MODIFY_COUNT_BY_PROC());
			this.setWORK_STS_TYP(struct.getWORK_STS_TYP());
			this.setPROC_EXPLOSION_FLG(struct.getPROC_EXPLOSION_FLG());
			this.setMRP_ODR_TYP(struct.getMRP_ODR_TYP());
			this.setUNIT_COST_TYP(struct.getUNIT_COST_TYP());
			this.setUNIT_COST(struct.getUNIT_COST());
			this.setPROCESSING_COST(struct.getPROCESSING_COST());
			this.setMATERIAL_COST(struct.getMATERIAL_COST());
			this.setOTHER_OVERHEADS(struct.getOTHER_OVERHEADS());
			this.setPUCH_ODR_AMOUNT(struct.getPUCH_ODR_AMOUNT());
			this.setDISC_AMOUNT(struct.getDISC_AMOUNT());
			this.setACPT_INSPC_TYP(struct.getACPT_INSPC_TYP());
			this.setWS_NAME(struct.getWS_NAME());
			this.setVEND_ANAME(struct.getVEND_ANAME());
			this.setROUND_TYP(struct.getROUND_TYP());
			this.setCUR_CD(struct.getCUR_CD());
			this.setCUR_NAME(struct.getCUR_NAME());
			this.setWORK_IN_PROC_COMMENT(struct.getWORK_IN_PROC_COMMENT());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.seth_UNIT_QTY_TYP(struct.geth_UNIT_QTY_TYP());
			this.seth_PARENT_OD_NO(struct.geth_PARENT_OD_NO());
			this.seth_COMPANY_CD(struct.geth_COMPANY_CD());
			this.seth_ODR_START_DATE(struct.geth_ODR_START_DATE());
			this.setOD_NO(struct.getOD_NO());
			this.setJOB_ODR_DETAIL_NO(struct.getJOB_ODR_DETAIL_NO());
			this.seth_JOB_ODR_CANCEL_NO(struct.geth_JOB_ODR_CANCEL_NO());
			this.setDUE_DATE(struct.getDUE_DATE());
			this.seth_MODIFY_COUNT_OPR_INST(struct.geth_MODIFY_COUNT_OPR_INST());
			this.setOUTSIDE_TYP_DN(struct.getOUTSIDE_TYP_DN());
			this.setMRP_ODR_TYP_DN(struct.getMRP_ODR_TYP_DN());
			this.setEXCH_TYP(struct.getEXCH_TYP());
			this.setVEND_CUR_UNIT(struct.getVEND_CUR_UNIT());
			this.seth_VEND_DECIMAL_FIG(struct.geth_VEND_DECIMAL_FIG());
			this.setOPR_INST_CD_GNR_TYP(struct.getOPR_INST_CD_GNR_TYP());
			this.seth_OD_NO(struct.geth_OD_NO());
			this.setWORK_ODR_DLV_DATE_BY_PROC_ALL(struct.getWORK_ODR_DLV_DATE_BY_PROC_ALL());
			this.setOPR_INST_START_DATE_BY_PROC_ALL(struct.getOPR_INST_START_DATE_BY_PROC_ALL());
			this.seth_WORK_STS_TYP(struct.geth_WORK_STS_TYP());
			this.setFINAL_PROC_FLG(struct.getFINAL_PROC_FLG());
			this.setMODIFY_COUNT_BY_PROC(struct.getMODIFY_COUNT_BY_PROC());
			this.seth_BUSINESS_OPR_DATE(struct.geth_BUSINESS_OPR_DATE());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setCAL_DATE(struct.getCAL_DATE());
			this.setCAL_NO(struct.getCAL_NO());
			this.setCHECK_DATE(struct.getCHECK_DATE());
			this.setWS_PLANT_CD(struct.getWS_PLANT_CD());
			this.setMODIFY_COUNT_OPR_INST(struct.getMODIFY_COUNT_OPR_INST());
			this.setOPR_INST_START_DATE_BY_PROC_TIME(struct.getOPR_INST_START_DATE_BY_PROC_TIME());
			this.setWORK_ODR_DLV_DATE_BY_PROC_TIME(struct.getWORK_ODR_DLV_DATE_BY_PROC_TIME());
			this.setOPR_INST_START_DATE_BY_ITEM_ALL(struct.getOPR_INST_START_DATE_BY_ITEM_ALL());
			this.setWORK_ODR_DLV_DATE_BY_ITEM_ALL(struct.getWORK_ODR_DLV_DATE_BY_ITEM_ALL());
			this.setLOWER_OD_NO(struct.getLOWER_OD_NO());
			this.setJOB_ODR_TYP(struct.getJOB_ODR_TYP());
			this.setJOB_ODR_DLV_DATE(struct.getJOB_ODR_DLV_DATE());
			this.setJOB_ODR_DLV_DATE_TIME(struct.getJOB_ODR_DLV_DATE_TIME());
			this.seth_JOB_ODR_CD(struct.geth_JOB_ODR_CD());
			this.setMODIFY_COUNT_BY_ITEM(struct.getMODIFY_COUNT_BY_ITEM());
			this.setTAX_NAME_1(struct.getTAX_NAME_1());
			this.setTAX_NAME_2(struct.getTAX_NAME_2());
			this.setTAX_NAME_3(struct.getTAX_NAME_3());
			this.seth_MANHOUR_TYP(struct.geth_MANHOUR_TYP());
			this.seth_ODR_START_DATE_ALL(struct.geth_ODR_START_DATE_ALL());
			this.setDUE_DATE_TIME(struct.getDUE_DATE_TIME());
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
	public void setStructL(AD0030020Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_OUTSIDE_TYP_name(struct.getList_OUTSIDE_TYP_name());
			this.setList_OUTSIDE_TYP_val(struct.getList_OUTSIDE_TYP_val());
			this.setList_ACPT_INSPC_TYP_name(struct.getList_ACPT_INSPC_TYP_name());
			this.setList_ACPT_INSPC_TYP_val(struct.getList_ACPT_INSPC_TYP_val());
			this.setList_h_UNIT_COST_TYP(struct.getList_h_UNIT_COST_TYP());
			this.setList_UNIT_COST_TYP_name(struct.getList_UNIT_COST_TYP_name());
			this.setList_UNIT_COST_TYP_val(struct.getList_UNIT_COST_TYP_val());
			this.setList_h_PLANT_CD(struct.getList_h_PLANT_CD());
			this.setList_AFTER_DISC_AMOUNT(struct.getList_AFTER_DISC_AMOUNT());
			this.setList_PROVISIONAL_HOME_CUR_AMOUNT(struct.getList_PROVISIONAL_HOME_CUR_AMOUNT());
			this.setList_HOME_CUR_UNIT(struct.getList_HOME_CUR_UNIT());
			this.setList_EXCH_RATE(struct.getList_EXCH_RATE());
			this.setList_TAX_AMOUNT_1(struct.getList_TAX_AMOUNT_1());
			this.setList_TAX_AMOUNT_2(struct.getList_TAX_AMOUNT_2());
			this.setList_AMOUNT_INCLUDE_TAX(struct.getList_AMOUNT_INCLUDE_TAX());
			this.setList_h_HOME_DECIMAL_FIG(struct.getList_h_HOME_DECIMAL_FIG());
			this.setList_h_TAX_RATE_1(struct.getList_h_TAX_RATE_1());
			this.setList_h_TAX_RATE_2(struct.getList_h_TAX_RATE_2());
			this.setList_h_TAX_RATE_3(struct.getList_h_TAX_RATE_3());
			this.setList_TAX_AMOUNT_3(struct.getList_TAX_AMOUNT_3());
			this.setList_h_WORK_ODR_DLV_DATE_BY_PROC(struct.getList_h_WORK_ODR_DLV_DATE_BY_PROC());
			this.setList_h_OPR_INST_START_DATE_BY_PROC(struct.getList_h_OPR_INST_START_DATE_BY_PROC());
			this.setList_h_OPR_INST_QTY(struct.getList_h_OPR_INST_QTY());
			this.setList_SelectUnitCostFlag(struct.getList_SelectUnitCostFlag());
			this.setList_WORK_ODR_DLV_DATE_BY_ITEM_TIME(struct.getList_WORK_ODR_DLV_DATE_BY_ITEM_TIME());
			this.setList_OPR_INST_START_DATE_BY_ITEM_TIME(struct.getList_OPR_INST_START_DATE_BY_ITEM_TIME());
			this.setList_h_ODR_START_DATE_TIME(struct.getList_h_ODR_START_DATE_TIME());
			this.setList_h_WORK_ODR_DLV_DATE_BY_PROC_TIME(struct.getList_h_WORK_ODR_DLV_DATE_BY_PROC_TIME());
			this.setList_h_OPR_INST_START_DATE_BY_PROC_TIME(struct.getList_h_OPR_INST_START_DATE_BY_PROC_TIME());
			this.setList_WORK_ODR_CD(struct.getList_WORK_ODR_CD());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_WORK_IN_PROC_CD(struct.getList_WORK_IN_PROC_CD());
			this.setList_PROC_NAME(struct.getList_PROC_NAME());
			this.setList_PROC_NO(struct.getList_PROC_NO());
			this.setList_WORK_ODR_DLV_DATE_BY_PROC(struct.getList_WORK_ODR_DLV_DATE_BY_PROC());
			this.setList_OPR_INST_START_DATE_BY_ITEM(struct.getList_OPR_INST_START_DATE_BY_ITEM());
			this.setList_WORK_ODR_DLV_DATE_BY_ITEM(struct.getList_WORK_ODR_DLV_DATE_BY_ITEM());
			this.setList_OPR_INST_START_DATE_BY_PROC(struct.getList_OPR_INST_START_DATE_BY_PROC());
			this.setList_OPR_INST_QTY(struct.getList_OPR_INST_QTY());
			this.setList_OUTSIDE_TYP(struct.getList_OUTSIDE_TYP());
			this.setList_WS_CD(struct.getList_WS_CD());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_OPR_INST_CD(struct.getList_OPR_INST_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_DRAW_CD(struct.getList_DRAW_CD());
			this.setList_SPEC(struct.getList_SPEC());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_h_MODIFY_COUNT_BY_ITEM(struct.getList_h_MODIFY_COUNT_BY_ITEM());
			this.setList_h_MODIFY_COUNT_BY_PROC(struct.getList_h_MODIFY_COUNT_BY_PROC());
			this.setList_WORK_STS_TYP(struct.getList_WORK_STS_TYP());
			this.setList_PROC_EXPLOSION_FLG(struct.getList_PROC_EXPLOSION_FLG());
			this.setList_MRP_ODR_TYP(struct.getList_MRP_ODR_TYP());
			this.setList_UNIT_COST_TYP(struct.getList_UNIT_COST_TYP());
			this.setList_UNIT_COST(struct.getList_UNIT_COST());
			this.setList_PROCESSING_COST(struct.getList_PROCESSING_COST());
			this.setList_MATERIAL_COST(struct.getList_MATERIAL_COST());
			this.setList_OTHER_OVERHEADS(struct.getList_OTHER_OVERHEADS());
			this.setList_PUCH_ODR_AMOUNT(struct.getList_PUCH_ODR_AMOUNT());
			this.setList_DISC_AMOUNT(struct.getList_DISC_AMOUNT());
			this.setList_ACPT_INSPC_TYP(struct.getList_ACPT_INSPC_TYP());
			this.setList_WS_NAME(struct.getList_WS_NAME());
			this.setList_VEND_ANAME(struct.getList_VEND_ANAME());
			this.setList_ROUND_TYP(struct.getList_ROUND_TYP());
			this.setList_CUR_CD(struct.getList_CUR_CD());
			this.setList_CUR_NAME(struct.getList_CUR_NAME());
			this.setList_WORK_IN_PROC_COMMENT(struct.getList_WORK_IN_PROC_COMMENT());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_h_UNIT_QTY_TYP(struct.getList_h_UNIT_QTY_TYP());
			this.setList_h_PARENT_OD_NO(struct.getList_h_PARENT_OD_NO());
			this.setList_h_COMPANY_CD(struct.getList_h_COMPANY_CD());
			this.setList_h_ODR_START_DATE(struct.getList_h_ODR_START_DATE());
			this.setList_OD_NO(struct.getList_OD_NO());
			this.setList_JOB_ODR_DETAIL_NO(struct.getList_JOB_ODR_DETAIL_NO());
			this.setList_h_JOB_ODR_CANCEL_NO(struct.getList_h_JOB_ODR_CANCEL_NO());
			this.setList_DUE_DATE(struct.getList_DUE_DATE());
			this.setList_h_MODIFY_COUNT_OPR_INST(struct.getList_h_MODIFY_COUNT_OPR_INST());
			this.setList_OUTSIDE_TYP_DN(struct.getList_OUTSIDE_TYP_DN());
			this.setList_MRP_ODR_TYP_DN(struct.getList_MRP_ODR_TYP_DN());
			this.setList_EXCH_TYP(struct.getList_EXCH_TYP());
			this.setList_VEND_CUR_UNIT(struct.getList_VEND_CUR_UNIT());
			this.setList_h_VEND_DECIMAL_FIG(struct.getList_h_VEND_DECIMAL_FIG());
			this.setList_OPR_INST_CD_GNR_TYP(struct.getList_OPR_INST_CD_GNR_TYP());
			this.setList_h_OD_NO(struct.getList_h_OD_NO());
			this.setList_WORK_ODR_DLV_DATE_BY_PROC_ALL(struct.getList_WORK_ODR_DLV_DATE_BY_PROC_ALL());
			this.setList_OPR_INST_START_DATE_BY_PROC_ALL(struct.getList_OPR_INST_START_DATE_BY_PROC_ALL());
			this.setList_h_WORK_STS_TYP(struct.getList_h_WORK_STS_TYP());
			this.setList_FINAL_PROC_FLG(struct.getList_FINAL_PROC_FLG());
			this.setList_MODIFY_COUNT_BY_PROC(struct.getList_MODIFY_COUNT_BY_PROC());
			this.setList_h_BUSINESS_OPR_DATE(struct.getList_h_BUSINESS_OPR_DATE());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_CAL_DATE(struct.getList_CAL_DATE());
			this.setList_CAL_NO(struct.getList_CAL_NO());
			this.setList_CHECK_DATE(struct.getList_CHECK_DATE());
			this.setList_WS_PLANT_CD(struct.getList_WS_PLANT_CD());
			this.setList_MODIFY_COUNT_OPR_INST(struct.getList_MODIFY_COUNT_OPR_INST());
			this.setList_OPR_INST_START_DATE_BY_PROC_TIME(struct.getList_OPR_INST_START_DATE_BY_PROC_TIME());
			this.setList_WORK_ODR_DLV_DATE_BY_PROC_TIME(struct.getList_WORK_ODR_DLV_DATE_BY_PROC_TIME());
			this.setList_OPR_INST_START_DATE_BY_ITEM_ALL(struct.getList_OPR_INST_START_DATE_BY_ITEM_ALL());
			this.setList_WORK_ODR_DLV_DATE_BY_ITEM_ALL(struct.getList_WORK_ODR_DLV_DATE_BY_ITEM_ALL());
			this.setList_LOWER_OD_NO(struct.getList_LOWER_OD_NO());
			this.setList_JOB_ODR_TYP(struct.getList_JOB_ODR_TYP());
			this.setList_JOB_ODR_DLV_DATE(struct.getList_JOB_ODR_DLV_DATE());
			this.setList_JOB_ODR_DLV_DATE_TIME(struct.getList_JOB_ODR_DLV_DATE_TIME());
			this.setList_h_JOB_ODR_CD(struct.getList_h_JOB_ODR_CD());
			this.setList_MODIFY_COUNT_BY_ITEM(struct.getList_MODIFY_COUNT_BY_ITEM());
			this.setList_TAX_NAME_1(struct.getList_TAX_NAME_1());
			this.setList_TAX_NAME_2(struct.getList_TAX_NAME_2());
			this.setList_TAX_NAME_3(struct.getList_TAX_NAME_3());
			this.setList_h_MANHOUR_TYP(struct.getList_h_MANHOUR_TYP());
			this.setList_h_ODR_START_DATE_ALL(struct.getList_h_ODR_START_DATE_ALL());
			this.setList_DUE_DATE_TIME(struct.getList_DUE_DATE_TIME());
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
	// 第 1 変数初期値： i_OUTSIDE_TYP_name


	final static String i_OUTSIDE_TYP_name = null;

	// 第 2 変数初期値： i_OUTSIDE_TYP_val


	final static String i_OUTSIDE_TYP_val = null;

	// 第 3 変数初期値： i_ACPT_INSPC_TYP_name


	final static String i_ACPT_INSPC_TYP_name = null;

	// 第 4 変数初期値： i_ACPT_INSPC_TYP_val


	final static String i_ACPT_INSPC_TYP_val = null;

	// 第 5 変数初期値： i_h_UNIT_COST_TYP


	final static String i_h_UNIT_COST_TYP = null;

	// 第 6 変数初期値： i_UNIT_COST_TYP_name


	final static String i_UNIT_COST_TYP_name = null;

	// 第 7 変数初期値： i_UNIT_COST_TYP_val


	final static String i_UNIT_COST_TYP_val = null;

	// 第 8 変数初期値： i_h_PLANT_CD


	final static String i_h_PLANT_CD = null;

	// 第 9 変数初期値： i_AFTER_DISC_AMOUNT


	final static String i_AFTER_DISC_AMOUNT = null;

	// 第 10 変数初期値： i_PROVISIONAL_HOME_CUR_AMOUNT


	final static String i_PROVISIONAL_HOME_CUR_AMOUNT = null;

	// 第 11 変数初期値： i_HOME_CUR_UNIT


	final static String i_HOME_CUR_UNIT = null;

	// 第 12 変数初期値： i_EXCH_RATE


	final static String i_EXCH_RATE = null;

	// 第 13 変数初期値： i_TAX_AMOUNT_1


	final static String i_TAX_AMOUNT_1 = null;

	// 第 14 変数初期値： i_TAX_AMOUNT_2


	final static String i_TAX_AMOUNT_2 = null;

	// 第 15 変数初期値： i_AMOUNT_INCLUDE_TAX


	final static String i_AMOUNT_INCLUDE_TAX = null;

	// 第 16 変数初期値： i_h_HOME_DECIMAL_FIG


	final static String i_h_HOME_DECIMAL_FIG = null;

	// 第 17 変数初期値： i_h_TAX_RATE_1


	final static String i_h_TAX_RATE_1 = null;

	// 第 18 変数初期値： i_h_TAX_RATE_2


	final static String i_h_TAX_RATE_2 = null;

	// 第 19 変数初期値： i_h_TAX_RATE_3


	final static String i_h_TAX_RATE_3 = null;

	// 第 20 変数初期値： i_TAX_AMOUNT_3


	final static String i_TAX_AMOUNT_3 = null;

	// 第 21 変数初期値： i_h_WORK_ODR_DLV_DATE_BY_PROC


	final static String i_h_WORK_ODR_DLV_DATE_BY_PROC = null;

	// 第 22 変数初期値： i_h_OPR_INST_START_DATE_BY_PROC


	final static String i_h_OPR_INST_START_DATE_BY_PROC = null;

	// 第 23 変数初期値： i_h_OPR_INST_QTY


	final static String i_h_OPR_INST_QTY = null;

	// 第 24 変数初期値： i_SelectUnitCostFlag


	final static String i_SelectUnitCostFlag = null;

	// 第 25 変数初期値： i_WORK_ODR_DLV_DATE_BY_ITEM_TIME


	final static String i_WORK_ODR_DLV_DATE_BY_ITEM_TIME = null;

	// 第 26 変数初期値： i_OPR_INST_START_DATE_BY_ITEM_TIME


	final static String i_OPR_INST_START_DATE_BY_ITEM_TIME = null;

	// 第 27 変数初期値： i_h_ODR_START_DATE_TIME


	final static String i_h_ODR_START_DATE_TIME = null;

	// 第 28 変数初期値： i_h_WORK_ODR_DLV_DATE_BY_PROC_TIME


	final static String i_h_WORK_ODR_DLV_DATE_BY_PROC_TIME = null;

	// 第 29 変数初期値： i_h_OPR_INST_START_DATE_BY_PROC_TIME


	final static String i_h_OPR_INST_START_DATE_BY_PROC_TIME = null;

	// 第 30 変数初期値： i_WORK_ODR_CD


	final static String i_WORK_ODR_CD = null;

	// 第 31 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 32 変数初期値： i_WORK_IN_PROC_CD


	final static String i_WORK_IN_PROC_CD = null;

	// 第 33 変数初期値： i_PROC_NAME


	final static String i_PROC_NAME = null;

	// 第 34 変数初期値： i_PROC_NO


	final static String i_PROC_NO = null;

	// 第 35 変数初期値： i_WORK_ODR_DLV_DATE_BY_PROC


	final static String i_WORK_ODR_DLV_DATE_BY_PROC = null;

	// 第 36 変数初期値： i_OPR_INST_START_DATE_BY_ITEM


	final static String i_OPR_INST_START_DATE_BY_ITEM = null;

	// 第 37 変数初期値： i_WORK_ODR_DLV_DATE_BY_ITEM


	final static String i_WORK_ODR_DLV_DATE_BY_ITEM = null;

	// 第 38 変数初期値： i_OPR_INST_START_DATE_BY_PROC


	final static String i_OPR_INST_START_DATE_BY_PROC = null;

	// 第 39 変数初期値： i_OPR_INST_QTY


	final static String i_OPR_INST_QTY = null;

	// 第 40 変数初期値： i_OUTSIDE_TYP


	final static String i_OUTSIDE_TYP = null;

	// 第 41 変数初期値： i_WS_CD


	final static String i_WS_CD = null;

	// 第 42 変数初期値： i_VEND_CD


	final static String i_VEND_CD = null;

	// 第 43 変数初期値： i_OPR_INST_CD


	final static String i_OPR_INST_CD = null;

	// 第 44 変数初期値： i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// 第 45 変数初期値： i_DRAW_CD


	final static String i_DRAW_CD = null;

	// 第 46 変数初期値： i_SPEC


	final static String i_SPEC = null;

	// 第 47 変数初期値： i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// 第 48 変数初期値： i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// 第 49 変数初期値： i_h_MODIFY_COUNT_BY_ITEM


	final static String i_h_MODIFY_COUNT_BY_ITEM = null;

	// 第 50 変数初期値： i_h_MODIFY_COUNT_BY_PROC


	final static String i_h_MODIFY_COUNT_BY_PROC = null;

	// 第 51 変数初期値： i_WORK_STS_TYP


	final static String i_WORK_STS_TYP = null;

	// 第 52 変数初期値： i_PROC_EXPLOSION_FLG


	final static String i_PROC_EXPLOSION_FLG = null;

	// 第 53 変数初期値： i_MRP_ODR_TYP


	final static String i_MRP_ODR_TYP = null;

	// 第 54 変数初期値： i_UNIT_COST_TYP


	final static String i_UNIT_COST_TYP = null;

	// 第 55 変数初期値： i_UNIT_COST


	final static String i_UNIT_COST = null;

	// 第 56 変数初期値： i_PROCESSING_COST


	final static String i_PROCESSING_COST = null;

	// 第 57 変数初期値： i_MATERIAL_COST


	final static String i_MATERIAL_COST = null;

	// 第 58 変数初期値： i_OTHER_OVERHEADS


	final static String i_OTHER_OVERHEADS = null;

	// 第 59 変数初期値： i_PUCH_ODR_AMOUNT


	final static String i_PUCH_ODR_AMOUNT = null;

	// 第 60 変数初期値： i_DISC_AMOUNT


	final static String i_DISC_AMOUNT = null;

	// 第 61 変数初期値： i_ACPT_INSPC_TYP


	final static String i_ACPT_INSPC_TYP = null;

	// 第 62 変数初期値： i_WS_NAME


	final static String i_WS_NAME = null;

	// 第 63 変数初期値： i_VEND_ANAME


	final static String i_VEND_ANAME = null;

	// 第 64 変数初期値： i_ROUND_TYP


	final static String i_ROUND_TYP = null;

	// 第 65 変数初期値： i_CUR_CD


	final static String i_CUR_CD = null;

	// 第 66 変数初期値： i_CUR_NAME


	final static String i_CUR_NAME = null;

	// 第 67 変数初期値： i_WORK_IN_PROC_COMMENT


	final static String i_WORK_IN_PROC_COMMENT = null;

	// 第 68 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

	// 第 69 変数初期値： i_h_UNIT_QTY_TYP


	final static String i_h_UNIT_QTY_TYP = null;

	// 第 70 変数初期値： i_h_PARENT_OD_NO


	final static String i_h_PARENT_OD_NO = null;

	// 第 71 変数初期値： i_h_COMPANY_CD


	final static String i_h_COMPANY_CD = null;

	// 第 72 変数初期値： i_h_ODR_START_DATE


	final static String i_h_ODR_START_DATE = null;

	// 第 73 変数初期値： i_OD_NO


	final static String i_OD_NO = null;

	// 第 74 変数初期値： i_JOB_ODR_DETAIL_NO


	final static String i_JOB_ODR_DETAIL_NO = null;

	// 第 75 変数初期値： i_h_JOB_ODR_CANCEL_NO


	final static String i_h_JOB_ODR_CANCEL_NO = null;

	// 第 76 変数初期値： i_DUE_DATE


	final static String i_DUE_DATE = null;

	// 第 77 変数初期値： i_h_MODIFY_COUNT_OPR_INST


	final static String i_h_MODIFY_COUNT_OPR_INST = null;

	// 第 78 変数初期値： i_OUTSIDE_TYP_DN


	final static String i_OUTSIDE_TYP_DN = null;

	// 第 79 変数初期値： i_MRP_ODR_TYP_DN


	final static String i_MRP_ODR_TYP_DN = null;

	// 第 80 変数初期値： i_EXCH_TYP


	final static String i_EXCH_TYP = null;

	// 第 81 変数初期値： i_VEND_CUR_UNIT


	final static String i_VEND_CUR_UNIT = null;

	// 第 82 変数初期値： i_h_VEND_DECIMAL_FIG


	final static String i_h_VEND_DECIMAL_FIG = null;

	// 第 83 変数初期値： i_OPR_INST_CD_GNR_TYP


	final static String i_OPR_INST_CD_GNR_TYP = null;

	// 第 84 変数初期値： i_h_OD_NO


	final static String i_h_OD_NO = null;

	// 第 85 変数初期値： i_WORK_ODR_DLV_DATE_BY_PROC_ALL


	final static String i_WORK_ODR_DLV_DATE_BY_PROC_ALL = null;

	// 第 86 変数初期値： i_OPR_INST_START_DATE_BY_PROC_ALL


	final static String i_OPR_INST_START_DATE_BY_PROC_ALL = null;

	// 第 87 変数初期値： i_h_WORK_STS_TYP


	final static String i_h_WORK_STS_TYP = null;

	// 第 88 変数初期値： i_FINAL_PROC_FLG


	final static String i_FINAL_PROC_FLG = null;

	// 第 89 変数初期値： i_MODIFY_COUNT_BY_PROC


	final static String i_MODIFY_COUNT_BY_PROC = null;

	// 第 90 変数初期値： i_h_BUSINESS_OPR_DATE


	final static String i_h_BUSINESS_OPR_DATE = null;

	// 第 91 変数初期値： i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// 第 92 変数初期値： i_CAL_DATE


	final static String i_CAL_DATE = null;

	// 第 93 変数初期値： i_CAL_NO


	final static String i_CAL_NO = null;

	// 第 94 変数初期値： i_CHECK_DATE


	final static String i_CHECK_DATE = null;

	// 第 95 変数初期値： i_WS_PLANT_CD


	final static String i_WS_PLANT_CD = null;

	// 第 96 変数初期値： i_MODIFY_COUNT_OPR_INST


	final static String i_MODIFY_COUNT_OPR_INST = null;

	// 第 97 変数初期値： i_OPR_INST_START_DATE_BY_PROC_TIME


	final static String i_OPR_INST_START_DATE_BY_PROC_TIME = null;

	// 第 98 変数初期値： i_WORK_ODR_DLV_DATE_BY_PROC_TIME


	final static String i_WORK_ODR_DLV_DATE_BY_PROC_TIME = null;

	// 第 99 変数初期値： i_OPR_INST_START_DATE_BY_ITEM_ALL


	final static String i_OPR_INST_START_DATE_BY_ITEM_ALL = null;

	// 第 100 変数初期値： i_WORK_ODR_DLV_DATE_BY_ITEM_ALL


	final static String i_WORK_ODR_DLV_DATE_BY_ITEM_ALL = null;

	// 第 101 変数初期値： i_LOWER_OD_NO


	final static String i_LOWER_OD_NO = null;

	// 第 102 変数初期値： i_JOB_ODR_TYP


	final static String i_JOB_ODR_TYP = null;

	// 第 103 変数初期値： i_JOB_ODR_DLV_DATE


	final static String i_JOB_ODR_DLV_DATE = null;

	// 第 104 変数初期値： i_JOB_ODR_DLV_DATE_TIME


	final static String i_JOB_ODR_DLV_DATE_TIME = null;

	// 第 105 変数初期値： i_h_JOB_ODR_CD


	final static String i_h_JOB_ODR_CD = null;

	// 第 106 変数初期値： i_MODIFY_COUNT_BY_ITEM


	final static String i_MODIFY_COUNT_BY_ITEM = null;

	// 第 107 変数初期値： i_TAX_NAME_1


	final static String i_TAX_NAME_1 = null;

	// 第 108 変数初期値： i_TAX_NAME_2


	final static String i_TAX_NAME_2 = null;

	// 第 109 変数初期値： i_TAX_NAME_3


	final static String i_TAX_NAME_3 = null;

	// 第 110 変数初期値： i_h_MANHOUR_TYP


	final static String i_h_MANHOUR_TYP = null;

	// 第 111 変数初期値： i_h_ODR_START_DATE_ALL


	final static String i_h_ODR_START_DATE_ALL = null;

	// 第 112 変数初期値： i_DUE_DATE_TIME


	final static String i_DUE_DATE_TIME = null;

	// 第 113 変数初期値： i_TIME_CTRL


	final static String i_TIME_CTRL = null;

	// 第 114 変数初期値： i_l_COUNT


	final static String i_l_COUNT = null;

	// 第 115 変数初期値： i_ROW_COUNT


	final static String i_ROW_COUNT = null;

*/

	//{{user_implement_code
		// TODO: 初期化で使う定数は、ここに記述してください。
		// 以下に記述した内容は自動的には変更されません。
	// 第 1 変数初期値： i_OUTSIDE_TYP_name
	final static String i_OUTSIDE_TYP_name = null;

	// 第 2 変数初期値： i_OUTSIDE_TYP_val
	final static String i_OUTSIDE_TYP_val = null;

	// 第 3 変数初期値： i_ACPT_INSPC_TYP_name
	final static String i_ACPT_INSPC_TYP_name = null;

	// 第 4 変数初期値： i_ACPT_INSPC_TYP_val
	final static String i_ACPT_INSPC_TYP_val = null;

	// 第 5 変数初期値： i_h_UNIT_COST_TYP
	final static String i_h_UNIT_COST_TYP = null;

	// 第 6 変数初期値： i_UNIT_COST_TYP_name
	final static String i_UNIT_COST_TYP_name = null;

	// 第 7 変数初期値： i_UNIT_COST_TYP_val
	final static String i_UNIT_COST_TYP_val = null;

	// 第 8 変数初期値： i_h_PLANT_CD
	final static String i_h_PLANT_CD = null;

	// 第 9 変数初期値： i_AFTER_DISC_AMOUNT
	final static String i_AFTER_DISC_AMOUNT = null;

	// 第 10 変数初期値： i_PROVISIONAL_HOME_CUR_AMOUNT
	final static String i_PROVISIONAL_HOME_CUR_AMOUNT = null;

	// 第 11 変数初期値： i_HOME_CUR_UNIT
	final static String i_HOME_CUR_UNIT = null;

	// 第 12 変数初期値： i_EXCH_RATE
	final static String i_EXCH_RATE = null;

	// 第 13 変数初期値： i_TAX_AMOUNT_1
	final static String i_TAX_AMOUNT_1 = null;

	// 第 14 変数初期値： i_TAX_AMOUNT_2
	final static String i_TAX_AMOUNT_2 = null;

	// 第 15 変数初期値： i_AMOUNT_INCLUDE_TAX
	final static String i_AMOUNT_INCLUDE_TAX = null;

	// 第 16 変数初期値： i_h_HOME_DECIMAL_FIG
	final static String i_h_HOME_DECIMAL_FIG = null;

	// 第 17 変数初期値： i_h_TAX_RATE_1
	final static String i_h_TAX_RATE_1 = null;

	// 第 18 変数初期値： i_h_TAX_RATE_2
	final static String i_h_TAX_RATE_2 = null;

	// 第 19 変数初期値： i_h_TAX_RATE_3
	final static String i_h_TAX_RATE_3 = null;

	// 第 20 変数初期値： i_TAX_AMOUNT_3
	final static String i_TAX_AMOUNT_3 = null;

	// 第 21 変数初期値： i_h_WORK_ODR_DLV_DATE_BY_PROC
	final static String i_h_WORK_ODR_DLV_DATE_BY_PROC = null;

	// 第 22 変数初期値： i_h_OPR_INST_START_DATE_BY_PROC
	final static String i_h_OPR_INST_START_DATE_BY_PROC = null;

	// 第 23 変数初期値： i_h_OPR_INST_QTY
	final static String i_h_OPR_INST_QTY = null;

	// 第 24 変数初期値： i_SelectUnitCostFlag
	final static String i_SelectUnitCostFlag = null;

	// 第 25 変数初期値： i_WORK_ODR_DLV_DATE_BY_ITEM_TIME
	final static String i_WORK_ODR_DLV_DATE_BY_ITEM_TIME = null;

	// 第 26 変数初期値： i_OPR_INST_START_DATE_BY_ITEM_TIME
	final static String i_OPR_INST_START_DATE_BY_ITEM_TIME = null;

	// 第 27 変数初期値： i_h_WORK_ODR_DLV_DATE_BY_PROC_TIME
	final static String i_h_WORK_ODR_DLV_DATE_BY_PROC_TIME = null;

	// 第 28 変数初期値： i_h_OPR_INST_START_DATE_BY_PROC_TIME
	final static String i_h_OPR_INST_START_DATE_BY_PROC_TIME = null;

	// 第 29 変数初期値： i_WORK_ODR_CD
	final static String i_WORK_ODR_CD = null;

	// 第 30 変数初期値： i_ITEM_CD
	final static String i_ITEM_CD = null;

	// 第 31 変数初期値： i_WORK_IN_PROC_CD
	final static String i_WORK_IN_PROC_CD = null;

	// 第 32 変数初期値： i_PROC_NAME
	final static String i_PROC_NAME = null;

	// 第 33 変数初期値： i_PROC_NO
	final static String i_PROC_NO = null;

	// 第 34 変数初期値： i_WORK_ODR_DLV_DATE_BY_PROC
	final static String i_WORK_ODR_DLV_DATE_BY_PROC = null;

	// 第 35 変数初期値： i_OPR_INST_START_DATE_BY_ITEM
	final static String i_OPR_INST_START_DATE_BY_ITEM = null;

	// 第 36 変数初期値： i_WORK_ODR_DLV_DATE_BY_ITEM
	final static String i_WORK_ODR_DLV_DATE_BY_ITEM = null;

	// 第 37 変数初期値： i_OPR_INST_START_DATE_BY_PROC
	final static String i_OPR_INST_START_DATE_BY_PROC = null;

	// 第 38 変数初期値： i_OPR_INST_QTY
	final static String i_OPR_INST_QTY = null;

	// 第 39 変数初期値： i_OUTSIDE_TYP
	final static String i_OUTSIDE_TYP = null;

	// 第 40 変数初期値： i_WS_CD
	final static String i_WS_CD = null;

	// 第 41 変数初期値： i_VEND_CD
	final static String i_VEND_CD = null;

	// 第 42 変数初期値： i_OPR_INST_CD
	final static String i_OPR_INST_CD = null;

	// 第 43 変数初期値： i_ITEM_NAME
	final static String i_ITEM_NAME = null;

	// 第 44 変数初期値： i_DRAW_CD
	final static String i_DRAW_CD = null;

	// 第 45 変数初期値： i_SPEC
	final static String i_SPEC = null;

	// 第 46 変数初期値： i_STOCK_UNIT
	final static String i_STOCK_UNIT = null;

	// 第 47 変数初期値： i_JOB_ODR_CD
	final static String i_JOB_ODR_CD = null;

	// 第 48 変数初期値： i_h_MODIFY_COUNT_BY_ITEM
	final static String i_h_MODIFY_COUNT_BY_ITEM = null;

	// 第 49 変数初期値： i_h_MODIFY_COUNT_BY_PROC
	final static String i_h_MODIFY_COUNT_BY_PROC = null;

	// 第 50 変数初期値： i_WORK_STS_TYP
	final static String i_WORK_STS_TYP = null;

	// 第 51 変数初期値： i_PROC_EXPLOSION_FLG
	final static String i_PROC_EXPLOSION_FLG = null;

	// 第 52 変数初期値： i_MRP_ODR_TYP
	final static String i_MRP_ODR_TYP = null;

	// 第 53 変数初期値： i_UNIT_COST_TYP
	final static String i_UNIT_COST_TYP = null;

	// 第 54 変数初期値： i_UNIT_COST
	final static String i_UNIT_COST = null;

	// 第 55 変数初期値： i_PROCESSING_COST
	final static String i_PROCESSING_COST = null;

	// 第 56 変数初期値： i_MATERIAL_COST
	final static String i_MATERIAL_COST = null;

	// 第 57 変数初期値： i_OTHER_OVERHEADS
	final static String i_OTHER_OVERHEADS = null;

	// 第 58 変数初期値： i_PUCH_ODR_AMOUNT
	final static String i_PUCH_ODR_AMOUNT = null;

	// 第 59 変数初期値： i_DISC_AMOUNT
	final static String i_DISC_AMOUNT = null;

	// 第 60 変数初期値： i_ACPT_INSPC_TYP
	final static String i_ACPT_INSPC_TYP = null;

	// 第 61 変数初期値： i_WS_NAME
	final static String i_WS_NAME = null;

	// 第 62 変数初期値： i_VEND_ANAME
	final static String i_VEND_ANAME = null;

	// 第 63 変数初期値： i_ROUND_TYP
	final static String i_ROUND_TYP = null;

	// 第 64 変数初期値： i_CUR_CD
	final static String i_CUR_CD = null;

	// 第 65 変数初期値： i_CUR_NAME
	final static String i_CUR_NAME = null;

	// 第 66 変数初期値： i_WORK_IN_PROC_COMMENT
	final static String i_WORK_IN_PROC_COMMENT = null;

	// 第 67 変数初期値： i_PLANT_CD
	final static String i_PLANT_CD = null;

	// 第 68 変数初期値： i_h_UNIT_QTY_TYP
	final static String i_h_UNIT_QTY_TYP = null;

	// 第 69 変数初期値： i_h_PARENT_OD_NO
	final static String i_h_PARENT_OD_NO = null;

	// 第 70 変数初期値： i_h_COMPANY_CD
	final static String i_h_COMPANY_CD = null;

	// 第 71 変数初期値： i_h_ODR_START_DATE
	final static String i_h_ODR_START_DATE = null;

	// 第 72 変数初期値： i_OD_NO
	final static String i_OD_NO = null;

	// 第 73 変数初期値： i_JOB_ODR_DETAIL_NO
	final static String i_JOB_ODR_DETAIL_NO = null;

	// 第 74 変数初期値： i_h_JOB_ODR_CANCEL_NO
	final static String i_h_JOB_ODR_CANCEL_NO = null;

	// 第 75 変数初期値： i_DUE_DATE
	final static String i_DUE_DATE = null;

	// 第 76 変数初期値： i_h_MODIFY_COUNT_OPR_INST
	final static String i_h_MODIFY_COUNT_OPR_INST = null;

	// 第 77 変数初期値： i_OUTSIDE_TYP_DN
	final static String i_OUTSIDE_TYP_DN = null;

	// 第 78 変数初期値： i_MRP_ODR_TYP_DN
	final static String i_MRP_ODR_TYP_DN = null;

	// 第 79 変数初期値： i_EXCH_TYP
	final static String i_EXCH_TYP = null;

	// 第 80 変数初期値： i_VEND_CUR_UNIT
	final static String i_VEND_CUR_UNIT = null;

	// 第 81 変数初期値： i_h_VEND_DECIMAL_FIG
	final static String i_h_VEND_DECIMAL_FIG = null;

	// 第 82 変数初期値： i_OPR_INST_CD_GNR_TYP
	final static String i_OPR_INST_CD_GNR_TYP = null;

	// 第 83 変数初期値： i_h_OD_NO
	final static String i_h_OD_NO = null;

	// 第 84 変数初期値： i_WORK_ODR_DLV_DATE_BY_PROC_ALL
	final static String i_WORK_ODR_DLV_DATE_BY_PROC_ALL = null;

	// 第 85 変数初期値： i_OPR_INST_START_DATE_BY_PROC_ALL
	final static String i_OPR_INST_START_DATE_BY_PROC_ALL = null;

	// 第 86 変数初期値： i_h_WORK_STS_TYP
	final static String i_h_WORK_STS_TYP = null;

	// 第 87 変数初期値： i_FINAL_PROC_FLG
	final static String i_FINAL_PROC_FLG = null;

	// 第 88 変数初期値： i_MODIFY_COUNT_BY_PROC
	final static String i_MODIFY_COUNT_BY_PROC = null;

	// 第 89 変数初期値： i_h_BUSINESS_OPR_DATE
	final static String i_h_BUSINESS_OPR_DATE = null;

	// 第 90 変数初期値： i_COMPANY_CD
	final static String i_COMPANY_CD = null;

	// 第 91 変数初期値： i_CAL_DATE
	final static String i_CAL_DATE = null;

	// 第 92 変数初期値： i_CAL_NO
	final static String i_CAL_NO = null;

	// 第 93 変数初期値： i_CHECK_DATE
	final static String i_CHECK_DATE = null;

	// 第 94 変数初期値： i_WS_PLANT_CD
	final static String i_WS_PLANT_CD = null;

	// 第 95 変数初期値： i_MODIFY_COUNT_OPR_INST
	final static String i_MODIFY_COUNT_OPR_INST = null;

	// 第 96 変数初期値： i_OPR_INST_START_DATE_BY_PROC_TIME
	final static String i_OPR_INST_START_DATE_BY_PROC_TIME = null;

	// 第 97 変数初期値： i_WORK_ODR_DLV_DATE_BY_PROC_TIME
	final static String i_WORK_ODR_DLV_DATE_BY_PROC_TIME = null;

	// 第 98 変数初期値： i_OPR_INST_START_DATE_BY_ITEM_ALL
	final static String i_OPR_INST_START_DATE_BY_ITEM_ALL = null;

	// 第 99 変数初期値： i_WORK_ODR_DLV_DATE_BY_ITEM_ALL
	final static String i_WORK_ODR_DLV_DATE_BY_ITEM_ALL = null;

	// 第 100 変数初期値： i_LOWER_OD_NO
	final static String i_LOWER_OD_NO = null;

	// 第 101 変数初期値： i_JOB_ODR_TYP
	final static String i_JOB_ODR_TYP = null;

	// 第 102 変数初期値： i_JOB_ODR_DLV_DATE
	final static String i_JOB_ODR_DLV_DATE = null;

	// 第 103 変数初期値： i_JOB_ODR_DLV_DATE_TIME
	final static String i_JOB_ODR_DLV_DATE_TIME = null;

	// 第 104 変数初期値： i_h_JOB_ODR_CD
	final static String i_h_JOB_ODR_CD = null;

	// 第 105 変数初期値： i_MODIFY_COUNT_BY_ITEM
	final static String i_MODIFY_COUNT_BY_ITEM = null;

	// 第 106 変数初期値： i_TAX_NAME_1
	final static String i_TAX_NAME_1 = null;

	// 第 107 変数初期値： i_TAX_NAME_2
	final static String i_TAX_NAME_2 = null;

	// 第 108 変数初期値： i_TAX_NAME_3
	final static String i_TAX_NAME_3 = null;

	// 第 109 変数初期値： i_h_ODR_START_DATE_TIME
	final static String i_h_ODR_START_DATE_TIME = null;

	// 第 110 変数初期値： i_DUE_DATE_TIME
	final static String i_DUE_DATE_TIME = null;

	// 第 111 変数初期値： i_TIME_CTRL
	final static String i_TIME_CTRL = null;

	/**
	 * 初期化
	 *
	 */
	public void initialize()
	{

		clear();

		m_WORK_ODR_CD = i_WORK_ODR_CD;
		m_ITEM_CD = i_ITEM_CD;
		m_WORK_IN_PROC_CD = i_WORK_IN_PROC_CD;
		m_PROC_NAME = i_PROC_NAME;
		m_PROC_NO = i_PROC_NO;
		m_WORK_ODR_DLV_DATE_BY_PROC = i_WORK_ODR_DLV_DATE_BY_PROC;
		m_OPR_INST_START_DATE_BY_ITEM = i_OPR_INST_START_DATE_BY_ITEM;
		m_WORK_ODR_DLV_DATE_BY_ITEM = i_WORK_ODR_DLV_DATE_BY_ITEM;
		m_OPR_INST_START_DATE_BY_PROC = i_OPR_INST_START_DATE_BY_PROC;
		m_OPR_INST_QTY = i_OPR_INST_QTY;
		m_OUTSIDE_TYP = i_OUTSIDE_TYP;
		m_WS_CD = i_WS_CD;
		m_VEND_CD = i_VEND_CD;
		m_OPR_INST_CD = i_OPR_INST_CD;
		m_ITEM_NAME = i_ITEM_NAME;
		m_DRAW_CD = i_DRAW_CD;
		m_SPEC = i_SPEC;
		m_STOCK_UNIT = i_STOCK_UNIT;
		m_JOB_ODR_CD = i_JOB_ODR_CD;
		m_h_MODIFY_COUNT_BY_ITEM = i_h_MODIFY_COUNT_BY_ITEM;
		m_h_MODIFY_COUNT_BY_PROC = i_h_MODIFY_COUNT_BY_PROC;
		m_WORK_STS_TYP = i_WORK_STS_TYP;
		m_PROC_EXPLOSION_FLG = i_PROC_EXPLOSION_FLG;
		m_MRP_ODR_TYP = i_MRP_ODR_TYP;
		m_UNIT_COST_TYP = i_UNIT_COST_TYP;
		m_UNIT_COST = i_UNIT_COST;
		m_PROCESSING_COST = i_PROCESSING_COST;
		m_MATERIAL_COST = i_MATERIAL_COST;
		m_OTHER_OVERHEADS = i_OTHER_OVERHEADS;
		m_PUCH_ODR_AMOUNT = i_PUCH_ODR_AMOUNT;
		m_DISC_AMOUNT = i_DISC_AMOUNT;
		m_ACPT_INSPC_TYP = i_ACPT_INSPC_TYP;
		m_WS_NAME = i_WS_NAME;
		m_VEND_ANAME = i_VEND_ANAME;
		m_ROUND_TYP = i_ROUND_TYP;
		m_CUR_CD = i_CUR_CD;
		m_CUR_NAME = i_CUR_NAME;
		m_WORK_IN_PROC_COMMENT = i_WORK_IN_PROC_COMMENT;
		m_PLANT_CD = i_PLANT_CD;
		m_h_UNIT_QTY_TYP = i_h_UNIT_QTY_TYP;
		m_h_PARENT_OD_NO = i_h_PARENT_OD_NO;
		m_h_COMPANY_CD = i_h_COMPANY_CD;
		m_h_ODR_START_DATE = i_h_ODR_START_DATE;
		m_OD_NO = i_OD_NO;
		m_JOB_ODR_DETAIL_NO = i_JOB_ODR_DETAIL_NO;
		m_h_JOB_ODR_CANCEL_NO = i_h_JOB_ODR_CANCEL_NO;
		m_DUE_DATE = i_DUE_DATE;
		m_h_MODIFY_COUNT_OPR_INST = i_h_MODIFY_COUNT_OPR_INST;
		m_OUTSIDE_TYP_DN = i_OUTSIDE_TYP_DN;
		m_MRP_ODR_TYP_DN = i_MRP_ODR_TYP_DN;
		m_EXCH_TYP = i_EXCH_TYP;
		m_VEND_CUR_UNIT = i_VEND_CUR_UNIT;
		m_h_VEND_DECIMAL_FIG = i_h_VEND_DECIMAL_FIG;
		m_OPR_INST_CD_GNR_TYP = i_OPR_INST_CD_GNR_TYP;
		m_h_OD_NO = i_h_OD_NO;
		m_h_WORK_STS_TYP = i_h_WORK_STS_TYP;
		m_FINAL_PROC_FLG = i_FINAL_PROC_FLG;
		m_MODIFY_COUNT_BY_PROC = i_MODIFY_COUNT_BY_PROC;
		m_h_BUSINESS_OPR_DATE = i_h_BUSINESS_OPR_DATE;
		m_COMPANY_CD = i_COMPANY_CD;
		m_CAL_DATE = i_CAL_DATE;
		m_CAL_NO = i_CAL_NO;
		m_CHECK_DATE = i_CHECK_DATE;
		m_WS_PLANT_CD = i_WS_PLANT_CD;
		m_MODIFY_COUNT_OPR_INST = i_MODIFY_COUNT_OPR_INST;
		m_LOWER_OD_NO = i_LOWER_OD_NO;
		m_JOB_ODR_TYP = i_JOB_ODR_TYP;
		m_JOB_ODR_DLV_DATE = i_JOB_ODR_DLV_DATE;
		m_h_JOB_ODR_CD = i_h_JOB_ODR_CD;
		m_MODIFY_COUNT_BY_ITEM = i_MODIFY_COUNT_BY_ITEM;
		m_TAX_NAME_1 = i_TAX_NAME_1;
		m_TAX_NAME_2 = i_TAX_NAME_2;
		m_TAX_NAME_3 = i_TAX_NAME_3;
		m_OUTSIDE_TYP_name = i_OUTSIDE_TYP_name;
		m_OUTSIDE_TYP_val = i_OUTSIDE_TYP_val;
		m_ACPT_INSPC_TYP_name = i_ACPT_INSPC_TYP_name;
		m_ACPT_INSPC_TYP_val = i_ACPT_INSPC_TYP_val;
		m_h_UNIT_COST_TYP = i_h_UNIT_COST_TYP;
		m_UNIT_COST_TYP_name = i_UNIT_COST_TYP_name;
		m_UNIT_COST_TYP_val = i_UNIT_COST_TYP_val;
		m_h_PLANT_CD = i_h_PLANT_CD;
		m_AFTER_DISC_AMOUNT = i_AFTER_DISC_AMOUNT;
		m_PROVISIONAL_HOME_CUR_AMOUNT = i_PROVISIONAL_HOME_CUR_AMOUNT;
		m_HOME_CUR_UNIT = i_HOME_CUR_UNIT;
		m_EXCH_RATE = i_EXCH_RATE;
		m_TAX_AMOUNT_1 = i_TAX_AMOUNT_1;
		m_TAX_AMOUNT_2 = i_TAX_AMOUNT_2;
		m_AMOUNT_INCLUDE_TAX = i_AMOUNT_INCLUDE_TAX;
		m_h_HOME_DECIMAL_FIG = i_h_HOME_DECIMAL_FIG;
		m_h_TAX_RATE_1 = i_h_TAX_RATE_1;
		m_h_TAX_RATE_2 = i_h_TAX_RATE_2;
		m_h_TAX_RATE_3 = i_h_TAX_RATE_3;
		m_TAX_AMOUNT_3 = i_TAX_AMOUNT_3;
		m_h_WORK_ODR_DLV_DATE_BY_PROC = i_h_WORK_ODR_DLV_DATE_BY_PROC;
		m_h_OPR_INST_START_DATE_BY_PROC = i_h_OPR_INST_START_DATE_BY_PROC;
		m_h_OPR_INST_QTY = i_h_OPR_INST_QTY;
		m_SelectUnitCostFlag = i_SelectUnitCostFlag;
		m_WORK_ODR_DLV_DATE_BY_ITEM_TIME = i_WORK_ODR_DLV_DATE_BY_ITEM_TIME;
		m_OPR_INST_START_DATE_BY_ITEM_TIME = i_OPR_INST_START_DATE_BY_ITEM_TIME;
		m_WORK_ODR_DLV_DATE_BY_PROC_TIME = i_WORK_ODR_DLV_DATE_BY_PROC_TIME;
		m_OPR_INST_START_DATE_BY_PROC_TIME = i_OPR_INST_START_DATE_BY_PROC_TIME;
		m_WORK_ODR_DLV_DATE_BY_PROC_ALL = i_WORK_ODR_DLV_DATE_BY_PROC_ALL;
		m_OPR_INST_START_DATE_BY_PROC_ALL = i_OPR_INST_START_DATE_BY_PROC_ALL;
		m_h_WORK_ODR_DLV_DATE_BY_PROC_TIME = i_h_WORK_ODR_DLV_DATE_BY_PROC_TIME;
		m_h_OPR_INST_START_DATE_BY_PROC_TIME = i_h_OPR_INST_START_DATE_BY_PROC_TIME;
		m_JOB_ODR_DLV_DATE_TIME = i_JOB_ODR_DLV_DATE_TIME;
		m_h_ODR_START_DATE_TIME = i_h_ODR_START_DATE_TIME;
		m_DUE_DATE_TIME = i_DUE_DATE_TIME;
		m_TIME_CTRL = i_TIME_CTRL;
	}

		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
