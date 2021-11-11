/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0030/src/com/nec/jp/orteus/metamorBase/AD0030/AD0030030Struct.java,v $
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

public class AD0030030Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_OPR_RSLT_TYP_DN */
	public String m_OPR_RSLT_TYP_DN = null;
	/** 第 2 変数： m_r1_FILTER1 */
	public String m_r1_FILTER1 = null;
	/** 第 3 変数： m_c_OUTPUT_RSLT */
	public String m_c_OUTPUT_RSLT = null;
	/** 第 4 変数： m_r2_FILTER1 */
	public String m_r2_FILTER1 = null;
	/** 第 5 変数： m_c_OUTSIDE_TYP_IN */
	public String m_c_OUTSIDE_TYP_IN = null;
	/** 第 6 変数： m_c_OUTSIDE_TYP_OUT */
	public String m_c_OUTSIDE_TYP_OUT = null;
	/** 第 7 変数： m_OUTSIDE_TYP_DN */
	public String m_OUTSIDE_TYP_DN = null;
	/** 第 8 変数： m_OPR_INST_START_TIME */
	public String m_OPR_INST_START_TIME = null;
	/** 第 9 変数： m_WORK_ODR_DLV_TIME */
	public String m_WORK_ODR_DLV_TIME = null;
	/** 第 10 変数： m_ODINFO_DISGUISE */
	public String m_ODINFO_DISGUISE = null;
	/** 第 11 変数： m_WORK_ODR_DLV_DATE_01 */
	public String m_WORK_ODR_DLV_DATE_01 = null;
	/** 第 12 変数： m_OPR_INST_START_DATE_01 */
	public String m_OPR_INST_START_DATE_01 = null;
	/** 第 13 変数： m_TIME_CTRL */
	public String m_TIME_CTRL = null;
	/** 第 14 変数： m_OPR_INST_CD */
	public String m_OPR_INST_CD = null;
	/** 第 15 変数： m_WORK_ODR_CD */
	public String m_WORK_ODR_CD = null;
	/** 第 16 変数： m_WORK_IN_PROC_CD */
	public String m_WORK_IN_PROC_CD = null;
	/** 第 17 変数： m_PROC_NAME */
	public String m_PROC_NAME = null;
	/** 第 18 変数： m_PROC_NO */
	public String m_PROC_NO = null;
	/** 第 19 変数： m_l_JOB_ODR_CD */
	public String m_l_JOB_ODR_CD = null;
	/** 第 20 変数： m_l_ITEM_CD */
	public String m_l_ITEM_CD = null;
	/** 第 21 変数： m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** 第 22 変数： m_l_WS_CD */
	public String m_l_WS_CD = null;
	/** 第 23 変数： m_WS_NAME */
	public String m_WS_NAME = null;
	/** 第 24 変数： m_l_VEND_CD */
	public String m_l_VEND_CD = null;
	/** 第 25 変数： m_l_VEND_ANAME */
	public String m_l_VEND_ANAME = null;
	/** 第 26 変数： m_l_WORK_ODR_DLV_DATE */
	public String m_l_WORK_ODR_DLV_DATE = null;
	/** 第 27 変数： m_l_OPR_INST_START_DATE */
	public String m_l_OPR_INST_START_DATE = null;
	/** 第 28 変数： m_OPR_INST_QTY */
	public String m_OPR_INST_QTY = null;
	/** 第 29 変数： m_WORK_IN_PROC_COMMENT */
	public String m_WORK_IN_PROC_COMMENT = null;
	/** 第 30 変数： m_OUTSIDE_TYP */
	public String m_OUTSIDE_TYP = null;
	/** 第 31 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** 第 32 変数： m_l_OPR_RSLT_TYP */
	public String m_l_OPR_RSLT_TYP = null;
	/** 第 33 変数： m_h_MODIFY_COUNT */
	public String m_h_MODIFY_COUNT = null;
	/** 第 34 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 35 変数： m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** 第 36 変数： m_HIDDEN_OPR_RSLT_TYP */
	public String m_HIDDEN_OPR_RSLT_TYP = null;
	/** 第 37 変数： m_h1_WS_CD */
	public String m_h1_WS_CD = null;
	/** 第 38 変数： m_HIDDEN_OUTSIDE_TYP */
	public String m_HIDDEN_OUTSIDE_TYP = null;
	/** 第 39 変数： m_HIDDEN_OPR_RSLT_TYP2 */
	public String m_HIDDEN_OPR_RSLT_TYP2 = null;
	/** 第 40 変数： m_h2_WS_CD */
	public String m_h2_WS_CD = null;
	/** 第 41 変数： m_HIDDEN_OUTSIDE_TYP2 */
	public String m_HIDDEN_OUTSIDE_TYP2 = null;
	/** 第 42 変数： m_HIDDEN_OPR_RSLT_TYP3 */
	public String m_HIDDEN_OPR_RSLT_TYP3 = null;
	/** 第 43 変数： m_h_VEND_CD */
	public String m_h_VEND_CD = null;
	/** 第 44 変数： m_WH_CD */
	public String m_WH_CD = null;
	/** 第 45 変数： m_OPR_INST_DATE */
	public String m_OPR_INST_DATE = null;
	/** 第 46 変数： m_BUSINESS_OPR_DATE */
	public String m_BUSINESS_OPR_DATE = null;
	/** 第 47 変数： m_OD_NO */
	public String m_OD_NO = null;
	/** 第 48 変数： m_PS_EDITION */
	public String m_PS_EDITION = null;
	/** 第 49 変数： m_PS_UNIT_QTY */
	public String m_PS_UNIT_QTY = null;
	/** 第 50 変数： m_PARENT_OD_NO */
	public String m_PARENT_OD_NO = null;
	/** 第 51 変数： m_MRP_ODR_TYP */
	public String m_MRP_ODR_TYP = null;
	/** 第 52 変数： m_ISSUE_TYP */
	public String m_ISSUE_TYP = null;
	/** 第 53 変数： m_DUE_DATE */
	public String m_DUE_DATE = null;
	/** 第 54 変数： m_PS_UNIT_DENOMINATOR */
	public String m_PS_UNIT_DENOMINATOR = null;
	/** 第 55 変数： m_PS_UNIT_NUMERATOR */
	public String m_PS_UNIT_NUMERATOR = null;
	/** 第 56 変数： m_PS_SPOIL */
	public String m_PS_SPOIL = null;
	/** 第 57 変数： m_ISSUE_INST_CD */
	public String m_ISSUE_INST_CD = null;
	/** 第 58 変数： m_PUCH_ODR_CD */
	public String m_PUCH_ODR_CD = null;
	/** 第 59 変数： m_ISSUE_INST_UNIT_QTY */
	public String m_ISSUE_INST_UNIT_QTY = null;
	/** 第 60 変数： m_ISSUE_INST_UNIT_DENOMINATOR */
	public String m_ISSUE_INST_UNIT_DENOMINATOR = null;
	/** 第 61 変数： m_ISSUE_INST_UNIT_NUMERATOR */
	public String m_ISSUE_INST_UNIT_NUMERATOR = null;
	/** 第 62 変数： m_ISSUE_INST_QTY */
	public String m_ISSUE_INST_QTY = null;
	/** 第 63 変数： m_TOTAL_ISSUE_QTY */
	public String m_TOTAL_ISSUE_QTY = null;
	/** 第 64 変数： m_SCDL_ISSUE_DATE */
	public String m_SCDL_ISSUE_DATE = null;
	/** 第 65 変数： m_ISSUE_CMPLT_DATE */
	public String m_ISSUE_CMPLT_DATE = null;
	/** 第 66 変数： m_ISSUE_CMPLT_FLG */
	public String m_ISSUE_CMPLT_FLG = null;
	/** 第 67 変数： m_ISSUE_INST_ISS_FLG */
	public String m_ISSUE_INST_ISS_FLG = null;
	/** 第 68 変数： m_ISSUE_INST_ISS_DATE */
	public String m_ISSUE_INST_ISS_DATE = null;
	/** 第 69 変数： m_ISSUE_INST_COMMENT */
	public String m_ISSUE_INST_COMMENT = null;
	/** 第 70 変数： m_WS_CD */
	public String m_WS_CD = null;
	/** 第 71 変数： m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** 第 72 変数： m_VEND_CD */
	public String m_VEND_CD = null;
	/** 第 73 変数： m_CONS_TYP */
	public String m_CONS_TYP = null;
	/** 第 74 変数： m_UNIT_QTY_TYP */
	public String m_UNIT_QTY_TYP = null;
	/** 第 75 変数： m_PUCH_ODR_PERSON */
	public String m_PUCH_ODR_PERSON = null;
	/** 第 76 変数： m_PUCH_ODR_START_DATE */
	public String m_PUCH_ODR_START_DATE = null;
	/** 第 77 変数： m_PUCH_ODR_DLV_DATE */
	public String m_PUCH_ODR_DLV_DATE = null;
	/** 第 78 変数： m_PUCH_ODR_QTY */
	public String m_PUCH_ODR_QTY = null;
	/** 第 79 変数： m_UNIT_COST_TYP */
	public String m_UNIT_COST_TYP = null;
	/** 第 80 変数： m_UNIT_COST */
	public String m_UNIT_COST = null;
	/** 第 81 変数： m_PROCESSING_COST */
	public String m_PROCESSING_COST = null;
	/** 第 82 変数： m_MATERIAL_COST */
	public String m_MATERIAL_COST = null;
	/** 第 83 変数： m_OTHER_OVERHEADS */
	public String m_OTHER_OVERHEADS = null;
	/** 第 84 変数： m_DISC_AMOUNT */
	public String m_DISC_AMOUNT = null;
	/** 第 85 変数： m_PUCH_ODR_AMOUNT */
	public String m_PUCH_ODR_AMOUNT = null;
	/** 第 86 変数： m_PUCH_ODR_INST_DATE */
	public String m_PUCH_ODR_INST_DATE = null;
	/** 第 87 変数： m_SPL_ITEM_TYP */
	public String m_SPL_ITEM_TYP = null;
	/** 第 88 変数： m_ACPT_INSPC_TYP */
	public String m_ACPT_INSPC_TYP = null;
	/** 第 89 変数： m_PUCH_ODR_COMMENT */
	public String m_PUCH_ODR_COMMENT = null;
	/** 第 90 変数： m_RATE_JUDGE_DATE */
	public String m_RATE_JUDGE_DATE = null;
	/** 第 91 変数： m_TAX_RATE_1 */
	public String m_TAX_RATE_1 = null;
	/** 第 92 変数： m_TAX_RATE_2 */
	public String m_TAX_RATE_2 = null;
	/** 第 93 変数： m_TAX_RATE_3 */
	public String m_TAX_RATE_3 = null;
	/** 第 94 変数： m_NET_AMOUNT */
	public String m_NET_AMOUNT = null;
	/** 第 95 変数： m_TAX_AMOUNT_1 */
	public String m_TAX_AMOUNT_1 = null;
	/** 第 96 変数： m_TAX_AMOUNT_2 */
	public String m_TAX_AMOUNT_2 = null;
	/** 第 97 変数： m_TAX_AMOUNT_3 */
	public String m_TAX_AMOUNT_3 = null;
	/** 第 98 変数： m_AMOUNT_INCLUDE_TAX */
	public String m_AMOUNT_INCLUDE_TAX = null;
	/** 第 99 変数： m_HOME_CUR_AMOUNT */
	public String m_HOME_CUR_AMOUNT = null;
	/** 第 100 変数： m_TAX_CD */
	public String m_TAX_CD = null;
	/** 第 101 変数： m_TAX_ROUND_TYP */
	public String m_TAX_ROUND_TYP = null;
	/** 第 102 変数： m_EXCH_RATE */
	public String m_EXCH_RATE = null;
	/** 第 103 変数： m_OPR_INST_START_DATE */
	public String m_OPR_INST_START_DATE = null;
	/** 第 104 変数： m_WORK_ODR_DLV_DATE */
	public String m_WORK_ODR_DLV_DATE = null;
	/** 第 105 変数： m_OWN_PERSON_NAME */
	public String m_OWN_PERSON_NAME = null;
	/** 第 106 変数： m_EXCH_TYP */
	public String m_EXCH_TYP = null;
	/** 第 107 変数： m_CUR_CD */
	public String m_CUR_CD = null;
	/** 第 108 変数： m_VEND_DECIMAL_FIG */
	public String m_VEND_DECIMAL_FIG = null;
	/** 第 109 変数： m_MIN_PROC_NO */
	public String m_MIN_PROC_NO = null;
	/** 第 110 変数： m_EFF_PHASE_IN_DATE */
	public String m_EFF_PHASE_IN_DATE = null;
	/** 第 111 変数： m_WORK_STS_TYP */
	public String m_WORK_STS_TYP = null;
	/** 第 112 変数： m_CHECK_MODIFY_COUNT */
	public String m_CHECK_MODIFY_COUNT = null;
	/** 第 113 変数： m_VEND_ANAME */
	public String m_VEND_ANAME = null;
	/** 第 114 変数： m_MANHOUR_TYP */
	public String m_MANHOUR_TYP = null;
	/** 第 115 変数： m_SPOIL_FLG */
	public String m_SPOIL_FLG = null;
	/** 第 116 変数： m_l_COUNT */
	public String m_l_COUNT = null;
	/** 第 117 変数： m_ROW_COUNT */
	public String m_ROW_COUNT = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_OPR_RSLT_TYP_DN */
	public List l_OPR_RSLT_TYP_DN = null;

	/** 第 2 List変数： l_r1_FILTER1 */
	public List l_r1_FILTER1 = null;

	/** 第 3 List変数： l_c_OUTPUT_RSLT */
	public List l_c_OUTPUT_RSLT = null;

	/** 第 4 List変数： l_r2_FILTER1 */
	public List l_r2_FILTER1 = null;

	/** 第 5 List変数： l_c_OUTSIDE_TYP_IN */
	public List l_c_OUTSIDE_TYP_IN = null;

	/** 第 6 List変数： l_c_OUTSIDE_TYP_OUT */
	public List l_c_OUTSIDE_TYP_OUT = null;

	/** 第 7 List変数： l_OUTSIDE_TYP_DN */
	public List l_OUTSIDE_TYP_DN = null;

	/** 第 8 List変数： l_OPR_INST_START_TIME */
	public List l_OPR_INST_START_TIME = null;

	/** 第 9 List変数： l_WORK_ODR_DLV_TIME */
	public List l_WORK_ODR_DLV_TIME = null;

	/** 第 10 List変数： l_ODINFO_DISGUISE */
	public List l_ODINFO_DISGUISE = null;

	/** 第 11 List変数： l_WORK_ODR_DLV_DATE_01 */
	public List l_WORK_ODR_DLV_DATE_01 = null;

	/** 第 12 List変数： l_OPR_INST_START_DATE_01 */
	public List l_OPR_INST_START_DATE_01 = null;

	/** 第 13 List変数： l_TIME_CTRL */
	public List l_TIME_CTRL = null;

	/** 第 14 List変数： l_OPR_INST_CD */
	public List l_OPR_INST_CD = null;

	/** 第 15 List変数： l_WORK_ODR_CD */
	public List l_WORK_ODR_CD = null;

	/** 第 16 List変数： l_WORK_IN_PROC_CD */
	public List l_WORK_IN_PROC_CD = null;

	/** 第 17 List変数： l_PROC_NAME */
	public List l_PROC_NAME = null;

	/** 第 18 List変数： l_PROC_NO */
	public List l_PROC_NO = null;

	/** 第 19 List変数： l_l_JOB_ODR_CD */
	public List l_l_JOB_ODR_CD = null;

	/** 第 20 List変数： l_l_ITEM_CD */
	public List l_l_ITEM_CD = null;

	/** 第 21 List変数： l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** 第 22 List変数： l_l_WS_CD */
	public List l_l_WS_CD = null;

	/** 第 23 List変数： l_WS_NAME */
	public List l_WS_NAME = null;

	/** 第 24 List変数： l_l_VEND_CD */
	public List l_l_VEND_CD = null;

	/** 第 25 List変数： l_l_VEND_ANAME */
	public List l_l_VEND_ANAME = null;

	/** 第 26 List変数： l_l_WORK_ODR_DLV_DATE */
	public List l_l_WORK_ODR_DLV_DATE = null;

	/** 第 27 List変数： l_l_OPR_INST_START_DATE */
	public List l_l_OPR_INST_START_DATE = null;

	/** 第 28 List変数： l_OPR_INST_QTY */
	public List l_OPR_INST_QTY = null;

	/** 第 29 List変数： l_WORK_IN_PROC_COMMENT */
	public List l_WORK_IN_PROC_COMMENT = null;

	/** 第 30 List変数： l_OUTSIDE_TYP */
	public List l_OUTSIDE_TYP = null;

	/** 第 31 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** 第 32 List変数： l_l_OPR_RSLT_TYP */
	public List l_l_OPR_RSLT_TYP = null;

	/** 第 33 List変数： l_h_MODIFY_COUNT */
	public List l_h_MODIFY_COUNT = null;

	/** 第 34 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 35 List変数： l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** 第 36 List変数： l_HIDDEN_OPR_RSLT_TYP */
	public List l_HIDDEN_OPR_RSLT_TYP = null;

	/** 第 37 List変数： l_h1_WS_CD */
	public List l_h1_WS_CD = null;

	/** 第 38 List変数： l_HIDDEN_OUTSIDE_TYP */
	public List l_HIDDEN_OUTSIDE_TYP = null;

	/** 第 39 List変数： l_HIDDEN_OPR_RSLT_TYP2 */
	public List l_HIDDEN_OPR_RSLT_TYP2 = null;

	/** 第 40 List変数： l_h2_WS_CD */
	public List l_h2_WS_CD = null;

	/** 第 41 List変数： l_HIDDEN_OUTSIDE_TYP2 */
	public List l_HIDDEN_OUTSIDE_TYP2 = null;

	/** 第 42 List変数： l_HIDDEN_OPR_RSLT_TYP3 */
	public List l_HIDDEN_OPR_RSLT_TYP3 = null;

	/** 第 43 List変数： l_h_VEND_CD */
	public List l_h_VEND_CD = null;

	/** 第 44 List変数： l_WH_CD */
	public List l_WH_CD = null;

	/** 第 45 List変数： l_OPR_INST_DATE */
	public List l_OPR_INST_DATE = null;

	/** 第 46 List変数： l_BUSINESS_OPR_DATE */
	public List l_BUSINESS_OPR_DATE = null;

	/** 第 47 List変数： l_OD_NO */
	public List l_OD_NO = null;

	/** 第 48 List変数： l_PS_EDITION */
	public List l_PS_EDITION = null;

	/** 第 49 List変数： l_PS_UNIT_QTY */
	public List l_PS_UNIT_QTY = null;

	/** 第 50 List変数： l_PARENT_OD_NO */
	public List l_PARENT_OD_NO = null;

	/** 第 51 List変数： l_MRP_ODR_TYP */
	public List l_MRP_ODR_TYP = null;

	/** 第 52 List変数： l_ISSUE_TYP */
	public List l_ISSUE_TYP = null;

	/** 第 53 List変数： l_DUE_DATE */
	public List l_DUE_DATE = null;

	/** 第 54 List変数： l_PS_UNIT_DENOMINATOR */
	public List l_PS_UNIT_DENOMINATOR = null;

	/** 第 55 List変数： l_PS_UNIT_NUMERATOR */
	public List l_PS_UNIT_NUMERATOR = null;

	/** 第 56 List変数： l_PS_SPOIL */
	public List l_PS_SPOIL = null;

	/** 第 57 List変数： l_ISSUE_INST_CD */
	public List l_ISSUE_INST_CD = null;

	/** 第 58 List変数： l_PUCH_ODR_CD */
	public List l_PUCH_ODR_CD = null;

	/** 第 59 List変数： l_ISSUE_INST_UNIT_QTY */
	public List l_ISSUE_INST_UNIT_QTY = null;

	/** 第 60 List変数： l_ISSUE_INST_UNIT_DENOMINATOR */
	public List l_ISSUE_INST_UNIT_DENOMINATOR = null;

	/** 第 61 List変数： l_ISSUE_INST_UNIT_NUMERATOR */
	public List l_ISSUE_INST_UNIT_NUMERATOR = null;

	/** 第 62 List変数： l_ISSUE_INST_QTY */
	public List l_ISSUE_INST_QTY = null;

	/** 第 63 List変数： l_TOTAL_ISSUE_QTY */
	public List l_TOTAL_ISSUE_QTY = null;

	/** 第 64 List変数： l_SCDL_ISSUE_DATE */
	public List l_SCDL_ISSUE_DATE = null;

	/** 第 65 List変数： l_ISSUE_CMPLT_DATE */
	public List l_ISSUE_CMPLT_DATE = null;

	/** 第 66 List変数： l_ISSUE_CMPLT_FLG */
	public List l_ISSUE_CMPLT_FLG = null;

	/** 第 67 List変数： l_ISSUE_INST_ISS_FLG */
	public List l_ISSUE_INST_ISS_FLG = null;

	/** 第 68 List変数： l_ISSUE_INST_ISS_DATE */
	public List l_ISSUE_INST_ISS_DATE = null;

	/** 第 69 List変数： l_ISSUE_INST_COMMENT */
	public List l_ISSUE_INST_COMMENT = null;

	/** 第 70 List変数： l_WS_CD */
	public List l_WS_CD = null;

	/** 第 71 List変数： l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** 第 72 List変数： l_VEND_CD */
	public List l_VEND_CD = null;

	/** 第 73 List変数： l_CONS_TYP */
	public List l_CONS_TYP = null;

	/** 第 74 List変数： l_UNIT_QTY_TYP */
	public List l_UNIT_QTY_TYP = null;

	/** 第 75 List変数： l_PUCH_ODR_PERSON */
	public List l_PUCH_ODR_PERSON = null;

	/** 第 76 List変数： l_PUCH_ODR_START_DATE */
	public List l_PUCH_ODR_START_DATE = null;

	/** 第 77 List変数： l_PUCH_ODR_DLV_DATE */
	public List l_PUCH_ODR_DLV_DATE = null;

	/** 第 78 List変数： l_PUCH_ODR_QTY */
	public List l_PUCH_ODR_QTY = null;

	/** 第 79 List変数： l_UNIT_COST_TYP */
	public List l_UNIT_COST_TYP = null;

	/** 第 80 List変数： l_UNIT_COST */
	public List l_UNIT_COST = null;

	/** 第 81 List変数： l_PROCESSING_COST */
	public List l_PROCESSING_COST = null;

	/** 第 82 List変数： l_MATERIAL_COST */
	public List l_MATERIAL_COST = null;

	/** 第 83 List変数： l_OTHER_OVERHEADS */
	public List l_OTHER_OVERHEADS = null;

	/** 第 84 List変数： l_DISC_AMOUNT */
	public List l_DISC_AMOUNT = null;

	/** 第 85 List変数： l_PUCH_ODR_AMOUNT */
	public List l_PUCH_ODR_AMOUNT = null;

	/** 第 86 List変数： l_PUCH_ODR_INST_DATE */
	public List l_PUCH_ODR_INST_DATE = null;

	/** 第 87 List変数： l_SPL_ITEM_TYP */
	public List l_SPL_ITEM_TYP = null;

	/** 第 88 List変数： l_ACPT_INSPC_TYP */
	public List l_ACPT_INSPC_TYP = null;

	/** 第 89 List変数： l_PUCH_ODR_COMMENT */
	public List l_PUCH_ODR_COMMENT = null;

	/** 第 90 List変数： l_RATE_JUDGE_DATE */
	public List l_RATE_JUDGE_DATE = null;

	/** 第 91 List変数： l_TAX_RATE_1 */
	public List l_TAX_RATE_1 = null;

	/** 第 92 List変数： l_TAX_RATE_2 */
	public List l_TAX_RATE_2 = null;

	/** 第 93 List変数： l_TAX_RATE_3 */
	public List l_TAX_RATE_3 = null;

	/** 第 94 List変数： l_NET_AMOUNT */
	public List l_NET_AMOUNT = null;

	/** 第 95 List変数： l_TAX_AMOUNT_1 */
	public List l_TAX_AMOUNT_1 = null;

	/** 第 96 List変数： l_TAX_AMOUNT_2 */
	public List l_TAX_AMOUNT_2 = null;

	/** 第 97 List変数： l_TAX_AMOUNT_3 */
	public List l_TAX_AMOUNT_3 = null;

	/** 第 98 List変数： l_AMOUNT_INCLUDE_TAX */
	public List l_AMOUNT_INCLUDE_TAX = null;

	/** 第 99 List変数： l_HOME_CUR_AMOUNT */
	public List l_HOME_CUR_AMOUNT = null;

	/** 第 100 List変数： l_TAX_CD */
	public List l_TAX_CD = null;

	/** 第 101 List変数： l_TAX_ROUND_TYP */
	public List l_TAX_ROUND_TYP = null;

	/** 第 102 List変数： l_EXCH_RATE */
	public List l_EXCH_RATE = null;

	/** 第 103 List変数： l_OPR_INST_START_DATE */
	public List l_OPR_INST_START_DATE = null;

	/** 第 104 List変数： l_WORK_ODR_DLV_DATE */
	public List l_WORK_ODR_DLV_DATE = null;

	/** 第 105 List変数： l_OWN_PERSON_NAME */
	public List l_OWN_PERSON_NAME = null;

	/** 第 106 List変数： l_EXCH_TYP */
	public List l_EXCH_TYP = null;

	/** 第 107 List変数： l_CUR_CD */
	public List l_CUR_CD = null;

	/** 第 108 List変数： l_VEND_DECIMAL_FIG */
	public List l_VEND_DECIMAL_FIG = null;

	/** 第 109 List変数： l_MIN_PROC_NO */
	public List l_MIN_PROC_NO = null;

	/** 第 110 List変数： l_EFF_PHASE_IN_DATE */
	public List l_EFF_PHASE_IN_DATE = null;

	/** 第 111 List変数： l_WORK_STS_TYP */
	public List l_WORK_STS_TYP = null;

	/** 第 112 List変数： l_CHECK_MODIFY_COUNT */
	public List l_CHECK_MODIFY_COUNT = null;

	/** 第 113 List変数： l_VEND_ANAME */
	public List l_VEND_ANAME = null;

	/** 第 114 List変数： l_MANHOUR_TYP */
	public List l_MANHOUR_TYP = null;

	/** 第 115 List変数： l_SPOIL_FLG */
	public List l_SPOIL_FLG = null;

	/** 第 116 List変数： l_l_COUNT */
	public List l_l_COUNT = null;

	/** 第 117 List変数： l_ROW_COUNT */
	public List l_ROW_COUNT = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getOPR_RSLT_TYP_DN() { return m_OPR_RSLT_TYP_DN; }
	public String getr1_FILTER1() { return m_r1_FILTER1; }
	public String getc_OUTPUT_RSLT() { return m_c_OUTPUT_RSLT; }
	public String getr2_FILTER1() { return m_r2_FILTER1; }
	public String getc_OUTSIDE_TYP_IN() { return m_c_OUTSIDE_TYP_IN; }
	public String getc_OUTSIDE_TYP_OUT() { return m_c_OUTSIDE_TYP_OUT; }
	public String getOUTSIDE_TYP_DN() { return m_OUTSIDE_TYP_DN; }
	public String getOPR_INST_START_TIME() { return m_OPR_INST_START_TIME; }
	public String getWORK_ODR_DLV_TIME() { return m_WORK_ODR_DLV_TIME; }
	public String getODINFO_DISGUISE() { return m_ODINFO_DISGUISE; }
	public String getWORK_ODR_DLV_DATE_01() { return m_WORK_ODR_DLV_DATE_01; }
	public String getOPR_INST_START_DATE_01() { return m_OPR_INST_START_DATE_01; }
	public String getTIME_CTRL() { return m_TIME_CTRL; }
	public String getOPR_INST_CD() { return m_OPR_INST_CD; }
	public String getWORK_ODR_CD() { return m_WORK_ODR_CD; }
	public String getWORK_IN_PROC_CD() { return m_WORK_IN_PROC_CD; }
	public String getPROC_NAME() { return m_PROC_NAME; }
	public String getPROC_NO() { return m_PROC_NO; }
	public String getl_JOB_ODR_CD() { return m_l_JOB_ODR_CD; }
	public String getl_ITEM_CD() { return m_l_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getl_WS_CD() { return m_l_WS_CD; }
	public String getWS_NAME() { return m_WS_NAME; }
	public String getl_VEND_CD() { return m_l_VEND_CD; }
	public String getl_VEND_ANAME() { return m_l_VEND_ANAME; }
	public String getl_WORK_ODR_DLV_DATE() { return m_l_WORK_ODR_DLV_DATE; }
	public String getl_OPR_INST_START_DATE() { return m_l_OPR_INST_START_DATE; }
	public String getOPR_INST_QTY() { return m_OPR_INST_QTY; }
	public String getWORK_IN_PROC_COMMENT() { return m_WORK_IN_PROC_COMMENT; }
	public String getOUTSIDE_TYP() { return m_OUTSIDE_TYP; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getl_OPR_RSLT_TYP() { return m_l_OPR_RSLT_TYP; }
	public String geth_MODIFY_COUNT() { return m_h_MODIFY_COUNT; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getHIDDEN_OPR_RSLT_TYP() { return m_HIDDEN_OPR_RSLT_TYP; }
	public String geth1_WS_CD() { return m_h1_WS_CD; }
	public String getHIDDEN_OUTSIDE_TYP() { return m_HIDDEN_OUTSIDE_TYP; }
	public String getHIDDEN_OPR_RSLT_TYP2() { return m_HIDDEN_OPR_RSLT_TYP2; }
	public String geth2_WS_CD() { return m_h2_WS_CD; }
	public String getHIDDEN_OUTSIDE_TYP2() { return m_HIDDEN_OUTSIDE_TYP2; }
	public String getHIDDEN_OPR_RSLT_TYP3() { return m_HIDDEN_OPR_RSLT_TYP3; }
	public String geth_VEND_CD() { return m_h_VEND_CD; }
	public String getWH_CD() { return m_WH_CD; }
	public String getOPR_INST_DATE() { return m_OPR_INST_DATE; }
	public String getBUSINESS_OPR_DATE() { return m_BUSINESS_OPR_DATE; }
	public String getOD_NO() { return m_OD_NO; }
	public String getPS_EDITION() { return m_PS_EDITION; }
	public String getPS_UNIT_QTY() { return m_PS_UNIT_QTY; }
	public String getPARENT_OD_NO() { return m_PARENT_OD_NO; }
	public String getMRP_ODR_TYP() { return m_MRP_ODR_TYP; }
	public String getISSUE_TYP() { return m_ISSUE_TYP; }
	public String getDUE_DATE() { return m_DUE_DATE; }
	public String getPS_UNIT_DENOMINATOR() { return m_PS_UNIT_DENOMINATOR; }
	public String getPS_UNIT_NUMERATOR() { return m_PS_UNIT_NUMERATOR; }
	public String getPS_SPOIL() { return m_PS_SPOIL; }
	public String getISSUE_INST_CD() { return m_ISSUE_INST_CD; }
	public String getPUCH_ODR_CD() { return m_PUCH_ODR_CD; }
	public String getISSUE_INST_UNIT_QTY() { return m_ISSUE_INST_UNIT_QTY; }
	public String getISSUE_INST_UNIT_DENOMINATOR() { return m_ISSUE_INST_UNIT_DENOMINATOR; }
	public String getISSUE_INST_UNIT_NUMERATOR() { return m_ISSUE_INST_UNIT_NUMERATOR; }
	public String getISSUE_INST_QTY() { return m_ISSUE_INST_QTY; }
	public String getTOTAL_ISSUE_QTY() { return m_TOTAL_ISSUE_QTY; }
	public String getSCDL_ISSUE_DATE() { return m_SCDL_ISSUE_DATE; }
	public String getISSUE_CMPLT_DATE() { return m_ISSUE_CMPLT_DATE; }
	public String getISSUE_CMPLT_FLG() { return m_ISSUE_CMPLT_FLG; }
	public String getISSUE_INST_ISS_FLG() { return m_ISSUE_INST_ISS_FLG; }
	public String getISSUE_INST_ISS_DATE() { return m_ISSUE_INST_ISS_DATE; }
	public String getISSUE_INST_COMMENT() { return m_ISSUE_INST_COMMENT; }
	public String getWS_CD() { return m_WS_CD; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getCONS_TYP() { return m_CONS_TYP; }
	public String getUNIT_QTY_TYP() { return m_UNIT_QTY_TYP; }
	public String getPUCH_ODR_PERSON() { return m_PUCH_ODR_PERSON; }
	public String getPUCH_ODR_START_DATE() { return m_PUCH_ODR_START_DATE; }
	public String getPUCH_ODR_DLV_DATE() { return m_PUCH_ODR_DLV_DATE; }
	public String getPUCH_ODR_QTY() { return m_PUCH_ODR_QTY; }
	public String getUNIT_COST_TYP() { return m_UNIT_COST_TYP; }
	public String getUNIT_COST() { return m_UNIT_COST; }
	public String getPROCESSING_COST() { return m_PROCESSING_COST; }
	public String getMATERIAL_COST() { return m_MATERIAL_COST; }
	public String getOTHER_OVERHEADS() { return m_OTHER_OVERHEADS; }
	public String getDISC_AMOUNT() { return m_DISC_AMOUNT; }
	public String getPUCH_ODR_AMOUNT() { return m_PUCH_ODR_AMOUNT; }
	public String getPUCH_ODR_INST_DATE() { return m_PUCH_ODR_INST_DATE; }
	public String getSPL_ITEM_TYP() { return m_SPL_ITEM_TYP; }
	public String getACPT_INSPC_TYP() { return m_ACPT_INSPC_TYP; }
	public String getPUCH_ODR_COMMENT() { return m_PUCH_ODR_COMMENT; }
	public String getRATE_JUDGE_DATE() { return m_RATE_JUDGE_DATE; }
	public String getTAX_RATE_1() { return m_TAX_RATE_1; }
	public String getTAX_RATE_2() { return m_TAX_RATE_2; }
	public String getTAX_RATE_3() { return m_TAX_RATE_3; }
	public String getNET_AMOUNT() { return m_NET_AMOUNT; }
	public String getTAX_AMOUNT_1() { return m_TAX_AMOUNT_1; }
	public String getTAX_AMOUNT_2() { return m_TAX_AMOUNT_2; }
	public String getTAX_AMOUNT_3() { return m_TAX_AMOUNT_3; }
	public String getAMOUNT_INCLUDE_TAX() { return m_AMOUNT_INCLUDE_TAX; }
	public String getHOME_CUR_AMOUNT() { return m_HOME_CUR_AMOUNT; }
	public String getTAX_CD() { return m_TAX_CD; }
	public String getTAX_ROUND_TYP() { return m_TAX_ROUND_TYP; }
	public String getEXCH_RATE() { return m_EXCH_RATE; }
	public String getOPR_INST_START_DATE() { return m_OPR_INST_START_DATE; }
	public String getWORK_ODR_DLV_DATE() { return m_WORK_ODR_DLV_DATE; }
	public String getOWN_PERSON_NAME() { return m_OWN_PERSON_NAME; }
	public String getEXCH_TYP() { return m_EXCH_TYP; }
	public String getCUR_CD() { return m_CUR_CD; }
	public String getVEND_DECIMAL_FIG() { return m_VEND_DECIMAL_FIG; }
	public String getMIN_PROC_NO() { return m_MIN_PROC_NO; }
	public String getEFF_PHASE_IN_DATE() { return m_EFF_PHASE_IN_DATE; }
	public String getWORK_STS_TYP() { return m_WORK_STS_TYP; }
	public String getCHECK_MODIFY_COUNT() { return m_CHECK_MODIFY_COUNT; }
	public String getVEND_ANAME() { return m_VEND_ANAME; }
	public String getMANHOUR_TYP() { return m_MANHOUR_TYP; }
	public String getSPOIL_FLG() { return m_SPOIL_FLG; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }

	public List getList_OPR_RSLT_TYP_DN() { return l_OPR_RSLT_TYP_DN; }
	public List getList_r1_FILTER1() { return l_r1_FILTER1; }
	public List getList_c_OUTPUT_RSLT() { return l_c_OUTPUT_RSLT; }
	public List getList_r2_FILTER1() { return l_r2_FILTER1; }
	public List getList_c_OUTSIDE_TYP_IN() { return l_c_OUTSIDE_TYP_IN; }
	public List getList_c_OUTSIDE_TYP_OUT() { return l_c_OUTSIDE_TYP_OUT; }
	public List getList_OUTSIDE_TYP_DN() { return l_OUTSIDE_TYP_DN; }
	public List getList_OPR_INST_START_TIME() { return l_OPR_INST_START_TIME; }
	public List getList_WORK_ODR_DLV_TIME() { return l_WORK_ODR_DLV_TIME; }
	public List getList_ODINFO_DISGUISE() { return l_ODINFO_DISGUISE; }
	public List getList_WORK_ODR_DLV_DATE_01() { return l_WORK_ODR_DLV_DATE_01; }
	public List getList_OPR_INST_START_DATE_01() { return l_OPR_INST_START_DATE_01; }
	public List getList_TIME_CTRL() { return l_TIME_CTRL; }
	public List getList_OPR_INST_CD() { return l_OPR_INST_CD; }
	public List getList_WORK_ODR_CD() { return l_WORK_ODR_CD; }
	public List getList_WORK_IN_PROC_CD() { return l_WORK_IN_PROC_CD; }
	public List getList_PROC_NAME() { return l_PROC_NAME; }
	public List getList_PROC_NO() { return l_PROC_NO; }
	public List getList_l_JOB_ODR_CD() { return l_l_JOB_ODR_CD; }
	public List getList_l_ITEM_CD() { return l_l_ITEM_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_l_WS_CD() { return l_l_WS_CD; }
	public List getList_WS_NAME() { return l_WS_NAME; }
	public List getList_l_VEND_CD() { return l_l_VEND_CD; }
	public List getList_l_VEND_ANAME() { return l_l_VEND_ANAME; }
	public List getList_l_WORK_ODR_DLV_DATE() { return l_l_WORK_ODR_DLV_DATE; }
	public List getList_l_OPR_INST_START_DATE() { return l_l_OPR_INST_START_DATE; }
	public List getList_OPR_INST_QTY() { return l_OPR_INST_QTY; }
	public List getList_WORK_IN_PROC_COMMENT() { return l_WORK_IN_PROC_COMMENT; }
	public List getList_OUTSIDE_TYP() { return l_OUTSIDE_TYP; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_l_OPR_RSLT_TYP() { return l_l_OPR_RSLT_TYP; }
	public List getList_h_MODIFY_COUNT() { return l_h_MODIFY_COUNT; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_HIDDEN_OPR_RSLT_TYP() { return l_HIDDEN_OPR_RSLT_TYP; }
	public List getList_h1_WS_CD() { return l_h1_WS_CD; }
	public List getList_HIDDEN_OUTSIDE_TYP() { return l_HIDDEN_OUTSIDE_TYP; }
	public List getList_HIDDEN_OPR_RSLT_TYP2() { return l_HIDDEN_OPR_RSLT_TYP2; }
	public List getList_h2_WS_CD() { return l_h2_WS_CD; }
	public List getList_HIDDEN_OUTSIDE_TYP2() { return l_HIDDEN_OUTSIDE_TYP2; }
	public List getList_HIDDEN_OPR_RSLT_TYP3() { return l_HIDDEN_OPR_RSLT_TYP3; }
	public List getList_h_VEND_CD() { return l_h_VEND_CD; }
	public List getList_WH_CD() { return l_WH_CD; }
	public List getList_OPR_INST_DATE() { return l_OPR_INST_DATE; }
	public List getList_BUSINESS_OPR_DATE() { return l_BUSINESS_OPR_DATE; }
	public List getList_OD_NO() { return l_OD_NO; }
	public List getList_PS_EDITION() { return l_PS_EDITION; }
	public List getList_PS_UNIT_QTY() { return l_PS_UNIT_QTY; }
	public List getList_PARENT_OD_NO() { return l_PARENT_OD_NO; }
	public List getList_MRP_ODR_TYP() { return l_MRP_ODR_TYP; }
	public List getList_ISSUE_TYP() { return l_ISSUE_TYP; }
	public List getList_DUE_DATE() { return l_DUE_DATE; }
	public List getList_PS_UNIT_DENOMINATOR() { return l_PS_UNIT_DENOMINATOR; }
	public List getList_PS_UNIT_NUMERATOR() { return l_PS_UNIT_NUMERATOR; }
	public List getList_PS_SPOIL() { return l_PS_SPOIL; }
	public List getList_ISSUE_INST_CD() { return l_ISSUE_INST_CD; }
	public List getList_PUCH_ODR_CD() { return l_PUCH_ODR_CD; }
	public List getList_ISSUE_INST_UNIT_QTY() { return l_ISSUE_INST_UNIT_QTY; }
	public List getList_ISSUE_INST_UNIT_DENOMINATOR() { return l_ISSUE_INST_UNIT_DENOMINATOR; }
	public List getList_ISSUE_INST_UNIT_NUMERATOR() { return l_ISSUE_INST_UNIT_NUMERATOR; }
	public List getList_ISSUE_INST_QTY() { return l_ISSUE_INST_QTY; }
	public List getList_TOTAL_ISSUE_QTY() { return l_TOTAL_ISSUE_QTY; }
	public List getList_SCDL_ISSUE_DATE() { return l_SCDL_ISSUE_DATE; }
	public List getList_ISSUE_CMPLT_DATE() { return l_ISSUE_CMPLT_DATE; }
	public List getList_ISSUE_CMPLT_FLG() { return l_ISSUE_CMPLT_FLG; }
	public List getList_ISSUE_INST_ISS_FLG() { return l_ISSUE_INST_ISS_FLG; }
	public List getList_ISSUE_INST_ISS_DATE() { return l_ISSUE_INST_ISS_DATE; }
	public List getList_ISSUE_INST_COMMENT() { return l_ISSUE_INST_COMMENT; }
	public List getList_WS_CD() { return l_WS_CD; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_CONS_TYP() { return l_CONS_TYP; }
	public List getList_UNIT_QTY_TYP() { return l_UNIT_QTY_TYP; }
	public List getList_PUCH_ODR_PERSON() { return l_PUCH_ODR_PERSON; }
	public List getList_PUCH_ODR_START_DATE() { return l_PUCH_ODR_START_DATE; }
	public List getList_PUCH_ODR_DLV_DATE() { return l_PUCH_ODR_DLV_DATE; }
	public List getList_PUCH_ODR_QTY() { return l_PUCH_ODR_QTY; }
	public List getList_UNIT_COST_TYP() { return l_UNIT_COST_TYP; }
	public List getList_UNIT_COST() { return l_UNIT_COST; }
	public List getList_PROCESSING_COST() { return l_PROCESSING_COST; }
	public List getList_MATERIAL_COST() { return l_MATERIAL_COST; }
	public List getList_OTHER_OVERHEADS() { return l_OTHER_OVERHEADS; }
	public List getList_DISC_AMOUNT() { return l_DISC_AMOUNT; }
	public List getList_PUCH_ODR_AMOUNT() { return l_PUCH_ODR_AMOUNT; }
	public List getList_PUCH_ODR_INST_DATE() { return l_PUCH_ODR_INST_DATE; }
	public List getList_SPL_ITEM_TYP() { return l_SPL_ITEM_TYP; }
	public List getList_ACPT_INSPC_TYP() { return l_ACPT_INSPC_TYP; }
	public List getList_PUCH_ODR_COMMENT() { return l_PUCH_ODR_COMMENT; }
	public List getList_RATE_JUDGE_DATE() { return l_RATE_JUDGE_DATE; }
	public List getList_TAX_RATE_1() { return l_TAX_RATE_1; }
	public List getList_TAX_RATE_2() { return l_TAX_RATE_2; }
	public List getList_TAX_RATE_3() { return l_TAX_RATE_3; }
	public List getList_NET_AMOUNT() { return l_NET_AMOUNT; }
	public List getList_TAX_AMOUNT_1() { return l_TAX_AMOUNT_1; }
	public List getList_TAX_AMOUNT_2() { return l_TAX_AMOUNT_2; }
	public List getList_TAX_AMOUNT_3() { return l_TAX_AMOUNT_3; }
	public List getList_AMOUNT_INCLUDE_TAX() { return l_AMOUNT_INCLUDE_TAX; }
	public List getList_HOME_CUR_AMOUNT() { return l_HOME_CUR_AMOUNT; }
	public List getList_TAX_CD() { return l_TAX_CD; }
	public List getList_TAX_ROUND_TYP() { return l_TAX_ROUND_TYP; }
	public List getList_EXCH_RATE() { return l_EXCH_RATE; }
	public List getList_OPR_INST_START_DATE() { return l_OPR_INST_START_DATE; }
	public List getList_WORK_ODR_DLV_DATE() { return l_WORK_ODR_DLV_DATE; }
	public List getList_OWN_PERSON_NAME() { return l_OWN_PERSON_NAME; }
	public List getList_EXCH_TYP() { return l_EXCH_TYP; }
	public List getList_CUR_CD() { return l_CUR_CD; }
	public List getList_VEND_DECIMAL_FIG() { return l_VEND_DECIMAL_FIG; }
	public List getList_MIN_PROC_NO() { return l_MIN_PROC_NO; }
	public List getList_EFF_PHASE_IN_DATE() { return l_EFF_PHASE_IN_DATE; }
	public List getList_WORK_STS_TYP() { return l_WORK_STS_TYP; }
	public List getList_CHECK_MODIFY_COUNT() { return l_CHECK_MODIFY_COUNT; }
	public List getList_VEND_ANAME() { return l_VEND_ANAME; }
	public List getList_MANHOUR_TYP() { return l_MANHOUR_TYP; }
	public List getList_SPOIL_FLG() { return l_SPOIL_FLG; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }

	public void setOPR_RSLT_TYP_DN(String val) { m_OPR_RSLT_TYP_DN = val; }
	public void setr1_FILTER1(String val) { m_r1_FILTER1 = val; }
	public void setc_OUTPUT_RSLT(String val) { m_c_OUTPUT_RSLT = val; }
	public void setr2_FILTER1(String val) { m_r2_FILTER1 = val; }
	public void setc_OUTSIDE_TYP_IN(String val) { m_c_OUTSIDE_TYP_IN = val; }
	public void setc_OUTSIDE_TYP_OUT(String val) { m_c_OUTSIDE_TYP_OUT = val; }
	public void setOUTSIDE_TYP_DN(String val) { m_OUTSIDE_TYP_DN = val; }
	public void setOPR_INST_START_TIME(String val) { m_OPR_INST_START_TIME = val; }
	public void setWORK_ODR_DLV_TIME(String val) { m_WORK_ODR_DLV_TIME = val; }
	public void setODINFO_DISGUISE(String val) { m_ODINFO_DISGUISE = val; }
	public void setWORK_ODR_DLV_DATE_01(String val) { m_WORK_ODR_DLV_DATE_01 = val; }
	public void setOPR_INST_START_DATE_01(String val) { m_OPR_INST_START_DATE_01 = val; }
	public void setTIME_CTRL(String val) { m_TIME_CTRL = val; }
	public void setOPR_INST_CD(String val) { m_OPR_INST_CD = val; }
	public void setWORK_ODR_CD(String val) { m_WORK_ODR_CD = val; }
	public void setWORK_IN_PROC_CD(String val) { m_WORK_IN_PROC_CD = val; }
	public void setPROC_NAME(String val) { m_PROC_NAME = val; }
	public void setPROC_NO(String val) { m_PROC_NO = val; }
	public void setl_JOB_ODR_CD(String val) { m_l_JOB_ODR_CD = val; }
	public void setl_ITEM_CD(String val) { m_l_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setl_WS_CD(String val) { m_l_WS_CD = val; }
	public void setWS_NAME(String val) { m_WS_NAME = val; }
	public void setl_VEND_CD(String val) { m_l_VEND_CD = val; }
	public void setl_VEND_ANAME(String val) { m_l_VEND_ANAME = val; }
	public void setl_WORK_ODR_DLV_DATE(String val) { m_l_WORK_ODR_DLV_DATE = val; }
	public void setl_OPR_INST_START_DATE(String val) { m_l_OPR_INST_START_DATE = val; }
	public void setOPR_INST_QTY(String val) { m_OPR_INST_QTY = val; }
	public void setWORK_IN_PROC_COMMENT(String val) { m_WORK_IN_PROC_COMMENT = val; }
	public void setOUTSIDE_TYP(String val) { m_OUTSIDE_TYP = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setl_OPR_RSLT_TYP(String val) { m_l_OPR_RSLT_TYP = val; }
	public void seth_MODIFY_COUNT(String val) { m_h_MODIFY_COUNT = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setHIDDEN_OPR_RSLT_TYP(String val) { m_HIDDEN_OPR_RSLT_TYP = val; }
	public void seth1_WS_CD(String val) { m_h1_WS_CD = val; }
	public void setHIDDEN_OUTSIDE_TYP(String val) { m_HIDDEN_OUTSIDE_TYP = val; }
	public void setHIDDEN_OPR_RSLT_TYP2(String val) { m_HIDDEN_OPR_RSLT_TYP2 = val; }
	public void seth2_WS_CD(String val) { m_h2_WS_CD = val; }
	public void setHIDDEN_OUTSIDE_TYP2(String val) { m_HIDDEN_OUTSIDE_TYP2 = val; }
	public void setHIDDEN_OPR_RSLT_TYP3(String val) { m_HIDDEN_OPR_RSLT_TYP3 = val; }
	public void seth_VEND_CD(String val) { m_h_VEND_CD = val; }
	public void setWH_CD(String val) { m_WH_CD = val; }
	public void setOPR_INST_DATE(String val) { m_OPR_INST_DATE = val; }
	public void setBUSINESS_OPR_DATE(String val) { m_BUSINESS_OPR_DATE = val; }
	public void setOD_NO(String val) { m_OD_NO = val; }
	public void setPS_EDITION(String val) { m_PS_EDITION = val; }
	public void setPS_UNIT_QTY(String val) { m_PS_UNIT_QTY = val; }
	public void setPARENT_OD_NO(String val) { m_PARENT_OD_NO = val; }
	public void setMRP_ODR_TYP(String val) { m_MRP_ODR_TYP = val; }
	public void setISSUE_TYP(String val) { m_ISSUE_TYP = val; }
	public void setDUE_DATE(String val) { m_DUE_DATE = val; }
	public void setPS_UNIT_DENOMINATOR(String val) { m_PS_UNIT_DENOMINATOR = val; }
	public void setPS_UNIT_NUMERATOR(String val) { m_PS_UNIT_NUMERATOR = val; }
	public void setPS_SPOIL(String val) { m_PS_SPOIL = val; }
	public void setISSUE_INST_CD(String val) { m_ISSUE_INST_CD = val; }
	public void setPUCH_ODR_CD(String val) { m_PUCH_ODR_CD = val; }
	public void setISSUE_INST_UNIT_QTY(String val) { m_ISSUE_INST_UNIT_QTY = val; }
	public void setISSUE_INST_UNIT_DENOMINATOR(String val) { m_ISSUE_INST_UNIT_DENOMINATOR = val; }
	public void setISSUE_INST_UNIT_NUMERATOR(String val) { m_ISSUE_INST_UNIT_NUMERATOR = val; }
	public void setISSUE_INST_QTY(String val) { m_ISSUE_INST_QTY = val; }
	public void setTOTAL_ISSUE_QTY(String val) { m_TOTAL_ISSUE_QTY = val; }
	public void setSCDL_ISSUE_DATE(String val) { m_SCDL_ISSUE_DATE = val; }
	public void setISSUE_CMPLT_DATE(String val) { m_ISSUE_CMPLT_DATE = val; }
	public void setISSUE_CMPLT_FLG(String val) { m_ISSUE_CMPLT_FLG = val; }
	public void setISSUE_INST_ISS_FLG(String val) { m_ISSUE_INST_ISS_FLG = val; }
	public void setISSUE_INST_ISS_DATE(String val) { m_ISSUE_INST_ISS_DATE = val; }
	public void setISSUE_INST_COMMENT(String val) { m_ISSUE_INST_COMMENT = val; }
	public void setWS_CD(String val) { m_WS_CD = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void setCONS_TYP(String val) { m_CONS_TYP = val; }
	public void setUNIT_QTY_TYP(String val) { m_UNIT_QTY_TYP = val; }
	public void setPUCH_ODR_PERSON(String val) { m_PUCH_ODR_PERSON = val; }
	public void setPUCH_ODR_START_DATE(String val) { m_PUCH_ODR_START_DATE = val; }
	public void setPUCH_ODR_DLV_DATE(String val) { m_PUCH_ODR_DLV_DATE = val; }
	public void setPUCH_ODR_QTY(String val) { m_PUCH_ODR_QTY = val; }
	public void setUNIT_COST_TYP(String val) { m_UNIT_COST_TYP = val; }
	public void setUNIT_COST(String val) { m_UNIT_COST = val; }
	public void setPROCESSING_COST(String val) { m_PROCESSING_COST = val; }
	public void setMATERIAL_COST(String val) { m_MATERIAL_COST = val; }
	public void setOTHER_OVERHEADS(String val) { m_OTHER_OVERHEADS = val; }
	public void setDISC_AMOUNT(String val) { m_DISC_AMOUNT = val; }
	public void setPUCH_ODR_AMOUNT(String val) { m_PUCH_ODR_AMOUNT = val; }
	public void setPUCH_ODR_INST_DATE(String val) { m_PUCH_ODR_INST_DATE = val; }
	public void setSPL_ITEM_TYP(String val) { m_SPL_ITEM_TYP = val; }
	public void setACPT_INSPC_TYP(String val) { m_ACPT_INSPC_TYP = val; }
	public void setPUCH_ODR_COMMENT(String val) { m_PUCH_ODR_COMMENT = val; }
	public void setRATE_JUDGE_DATE(String val) { m_RATE_JUDGE_DATE = val; }
	public void setTAX_RATE_1(String val) { m_TAX_RATE_1 = val; }
	public void setTAX_RATE_2(String val) { m_TAX_RATE_2 = val; }
	public void setTAX_RATE_3(String val) { m_TAX_RATE_3 = val; }
	public void setNET_AMOUNT(String val) { m_NET_AMOUNT = val; }
	public void setTAX_AMOUNT_1(String val) { m_TAX_AMOUNT_1 = val; }
	public void setTAX_AMOUNT_2(String val) { m_TAX_AMOUNT_2 = val; }
	public void setTAX_AMOUNT_3(String val) { m_TAX_AMOUNT_3 = val; }
	public void setAMOUNT_INCLUDE_TAX(String val) { m_AMOUNT_INCLUDE_TAX = val; }
	public void setHOME_CUR_AMOUNT(String val) { m_HOME_CUR_AMOUNT = val; }
	public void setTAX_CD(String val) { m_TAX_CD = val; }
	public void setTAX_ROUND_TYP(String val) { m_TAX_ROUND_TYP = val; }
	public void setEXCH_RATE(String val) { m_EXCH_RATE = val; }
	public void setOPR_INST_START_DATE(String val) { m_OPR_INST_START_DATE = val; }
	public void setWORK_ODR_DLV_DATE(String val) { m_WORK_ODR_DLV_DATE = val; }
	public void setOWN_PERSON_NAME(String val) { m_OWN_PERSON_NAME = val; }
	public void setEXCH_TYP(String val) { m_EXCH_TYP = val; }
	public void setCUR_CD(String val) { m_CUR_CD = val; }
	public void setVEND_DECIMAL_FIG(String val) { m_VEND_DECIMAL_FIG = val; }
	public void setMIN_PROC_NO(String val) { m_MIN_PROC_NO = val; }
	public void setEFF_PHASE_IN_DATE(String val) { m_EFF_PHASE_IN_DATE = val; }
	public void setWORK_STS_TYP(String val) { m_WORK_STS_TYP = val; }
	public void setCHECK_MODIFY_COUNT(String val) { m_CHECK_MODIFY_COUNT = val; }
	public void setVEND_ANAME(String val) { m_VEND_ANAME = val; }
	public void setMANHOUR_TYP(String val) { m_MANHOUR_TYP = val; }
	public void setSPOIL_FLG(String val) { m_SPOIL_FLG = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }


	public void setList_OPR_RSLT_TYP_DN(List list) { l_OPR_RSLT_TYP_DN = list; }
	public void setList_r1_FILTER1(List list) { l_r1_FILTER1 = list; }
	public void setList_c_OUTPUT_RSLT(List list) { l_c_OUTPUT_RSLT = list; }
	public void setList_r2_FILTER1(List list) { l_r2_FILTER1 = list; }
	public void setList_c_OUTSIDE_TYP_IN(List list) { l_c_OUTSIDE_TYP_IN = list; }
	public void setList_c_OUTSIDE_TYP_OUT(List list) { l_c_OUTSIDE_TYP_OUT = list; }
	public void setList_OUTSIDE_TYP_DN(List list) { l_OUTSIDE_TYP_DN = list; }
	public void setList_OPR_INST_START_TIME(List list) { l_OPR_INST_START_TIME = list; }
	public void setList_WORK_ODR_DLV_TIME(List list) { l_WORK_ODR_DLV_TIME = list; }
	public void setList_ODINFO_DISGUISE(List list) { l_ODINFO_DISGUISE = list; }
	public void setList_WORK_ODR_DLV_DATE_01(List list) { l_WORK_ODR_DLV_DATE_01 = list; }
	public void setList_OPR_INST_START_DATE_01(List list) { l_OPR_INST_START_DATE_01 = list; }
	public void setList_TIME_CTRL(List list) { l_TIME_CTRL = list; }
	public void setList_OPR_INST_CD(List list) { l_OPR_INST_CD = list; }
	public void setList_WORK_ODR_CD(List list) { l_WORK_ODR_CD = list; }
	public void setList_WORK_IN_PROC_CD(List list) { l_WORK_IN_PROC_CD = list; }
	public void setList_PROC_NAME(List list) { l_PROC_NAME = list; }
	public void setList_PROC_NO(List list) { l_PROC_NO = list; }
	public void setList_l_JOB_ODR_CD(List list) { l_l_JOB_ODR_CD = list; }
	public void setList_l_ITEM_CD(List list) { l_l_ITEM_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_l_WS_CD(List list) { l_l_WS_CD = list; }
	public void setList_WS_NAME(List list) { l_WS_NAME = list; }
	public void setList_l_VEND_CD(List list) { l_l_VEND_CD = list; }
	public void setList_l_VEND_ANAME(List list) { l_l_VEND_ANAME = list; }
	public void setList_l_WORK_ODR_DLV_DATE(List list) { l_l_WORK_ODR_DLV_DATE = list; }
	public void setList_l_OPR_INST_START_DATE(List list) { l_l_OPR_INST_START_DATE = list; }
	public void setList_OPR_INST_QTY(List list) { l_OPR_INST_QTY = list; }
	public void setList_WORK_IN_PROC_COMMENT(List list) { l_WORK_IN_PROC_COMMENT = list; }
	public void setList_OUTSIDE_TYP(List list) { l_OUTSIDE_TYP = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_l_OPR_RSLT_TYP(List list) { l_l_OPR_RSLT_TYP = list; }
	public void setList_h_MODIFY_COUNT(List list) { l_h_MODIFY_COUNT = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_HIDDEN_OPR_RSLT_TYP(List list) { l_HIDDEN_OPR_RSLT_TYP = list; }
	public void setList_h1_WS_CD(List list) { l_h1_WS_CD = list; }
	public void setList_HIDDEN_OUTSIDE_TYP(List list) { l_HIDDEN_OUTSIDE_TYP = list; }
	public void setList_HIDDEN_OPR_RSLT_TYP2(List list) { l_HIDDEN_OPR_RSLT_TYP2 = list; }
	public void setList_h2_WS_CD(List list) { l_h2_WS_CD = list; }
	public void setList_HIDDEN_OUTSIDE_TYP2(List list) { l_HIDDEN_OUTSIDE_TYP2 = list; }
	public void setList_HIDDEN_OPR_RSLT_TYP3(List list) { l_HIDDEN_OPR_RSLT_TYP3 = list; }
	public void setList_h_VEND_CD(List list) { l_h_VEND_CD = list; }
	public void setList_WH_CD(List list) { l_WH_CD = list; }
	public void setList_OPR_INST_DATE(List list) { l_OPR_INST_DATE = list; }
	public void setList_BUSINESS_OPR_DATE(List list) { l_BUSINESS_OPR_DATE = list; }
	public void setList_OD_NO(List list) { l_OD_NO = list; }
	public void setList_PS_EDITION(List list) { l_PS_EDITION = list; }
	public void setList_PS_UNIT_QTY(List list) { l_PS_UNIT_QTY = list; }
	public void setList_PARENT_OD_NO(List list) { l_PARENT_OD_NO = list; }
	public void setList_MRP_ODR_TYP(List list) { l_MRP_ODR_TYP = list; }
	public void setList_ISSUE_TYP(List list) { l_ISSUE_TYP = list; }
	public void setList_DUE_DATE(List list) { l_DUE_DATE = list; }
	public void setList_PS_UNIT_DENOMINATOR(List list) { l_PS_UNIT_DENOMINATOR = list; }
	public void setList_PS_UNIT_NUMERATOR(List list) { l_PS_UNIT_NUMERATOR = list; }
	public void setList_PS_SPOIL(List list) { l_PS_SPOIL = list; }
	public void setList_ISSUE_INST_CD(List list) { l_ISSUE_INST_CD = list; }
	public void setList_PUCH_ODR_CD(List list) { l_PUCH_ODR_CD = list; }
	public void setList_ISSUE_INST_UNIT_QTY(List list) { l_ISSUE_INST_UNIT_QTY = list; }
	public void setList_ISSUE_INST_UNIT_DENOMINATOR(List list) { l_ISSUE_INST_UNIT_DENOMINATOR = list; }
	public void setList_ISSUE_INST_UNIT_NUMERATOR(List list) { l_ISSUE_INST_UNIT_NUMERATOR = list; }
	public void setList_ISSUE_INST_QTY(List list) { l_ISSUE_INST_QTY = list; }
	public void setList_TOTAL_ISSUE_QTY(List list) { l_TOTAL_ISSUE_QTY = list; }
	public void setList_SCDL_ISSUE_DATE(List list) { l_SCDL_ISSUE_DATE = list; }
	public void setList_ISSUE_CMPLT_DATE(List list) { l_ISSUE_CMPLT_DATE = list; }
	public void setList_ISSUE_CMPLT_FLG(List list) { l_ISSUE_CMPLT_FLG = list; }
	public void setList_ISSUE_INST_ISS_FLG(List list) { l_ISSUE_INST_ISS_FLG = list; }
	public void setList_ISSUE_INST_ISS_DATE(List list) { l_ISSUE_INST_ISS_DATE = list; }
	public void setList_ISSUE_INST_COMMENT(List list) { l_ISSUE_INST_COMMENT = list; }
	public void setList_WS_CD(List list) { l_WS_CD = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_CONS_TYP(List list) { l_CONS_TYP = list; }
	public void setList_UNIT_QTY_TYP(List list) { l_UNIT_QTY_TYP = list; }
	public void setList_PUCH_ODR_PERSON(List list) { l_PUCH_ODR_PERSON = list; }
	public void setList_PUCH_ODR_START_DATE(List list) { l_PUCH_ODR_START_DATE = list; }
	public void setList_PUCH_ODR_DLV_DATE(List list) { l_PUCH_ODR_DLV_DATE = list; }
	public void setList_PUCH_ODR_QTY(List list) { l_PUCH_ODR_QTY = list; }
	public void setList_UNIT_COST_TYP(List list) { l_UNIT_COST_TYP = list; }
	public void setList_UNIT_COST(List list) { l_UNIT_COST = list; }
	public void setList_PROCESSING_COST(List list) { l_PROCESSING_COST = list; }
	public void setList_MATERIAL_COST(List list) { l_MATERIAL_COST = list; }
	public void setList_OTHER_OVERHEADS(List list) { l_OTHER_OVERHEADS = list; }
	public void setList_DISC_AMOUNT(List list) { l_DISC_AMOUNT = list; }
	public void setList_PUCH_ODR_AMOUNT(List list) { l_PUCH_ODR_AMOUNT = list; }
	public void setList_PUCH_ODR_INST_DATE(List list) { l_PUCH_ODR_INST_DATE = list; }
	public void setList_SPL_ITEM_TYP(List list) { l_SPL_ITEM_TYP = list; }
	public void setList_ACPT_INSPC_TYP(List list) { l_ACPT_INSPC_TYP = list; }
	public void setList_PUCH_ODR_COMMENT(List list) { l_PUCH_ODR_COMMENT = list; }
	public void setList_RATE_JUDGE_DATE(List list) { l_RATE_JUDGE_DATE = list; }
	public void setList_TAX_RATE_1(List list) { l_TAX_RATE_1 = list; }
	public void setList_TAX_RATE_2(List list) { l_TAX_RATE_2 = list; }
	public void setList_TAX_RATE_3(List list) { l_TAX_RATE_3 = list; }
	public void setList_NET_AMOUNT(List list) { l_NET_AMOUNT = list; }
	public void setList_TAX_AMOUNT_1(List list) { l_TAX_AMOUNT_1 = list; }
	public void setList_TAX_AMOUNT_2(List list) { l_TAX_AMOUNT_2 = list; }
	public void setList_TAX_AMOUNT_3(List list) { l_TAX_AMOUNT_3 = list; }
	public void setList_AMOUNT_INCLUDE_TAX(List list) { l_AMOUNT_INCLUDE_TAX = list; }
	public void setList_HOME_CUR_AMOUNT(List list) { l_HOME_CUR_AMOUNT = list; }
	public void setList_TAX_CD(List list) { l_TAX_CD = list; }
	public void setList_TAX_ROUND_TYP(List list) { l_TAX_ROUND_TYP = list; }
	public void setList_EXCH_RATE(List list) { l_EXCH_RATE = list; }
	public void setList_OPR_INST_START_DATE(List list) { l_OPR_INST_START_DATE = list; }
	public void setList_WORK_ODR_DLV_DATE(List list) { l_WORK_ODR_DLV_DATE = list; }
	public void setList_OWN_PERSON_NAME(List list) { l_OWN_PERSON_NAME = list; }
	public void setList_EXCH_TYP(List list) { l_EXCH_TYP = list; }
	public void setList_CUR_CD(List list) { l_CUR_CD = list; }
	public void setList_VEND_DECIMAL_FIG(List list) { l_VEND_DECIMAL_FIG = list; }
	public void setList_MIN_PROC_NO(List list) { l_MIN_PROC_NO = list; }
	public void setList_EFF_PHASE_IN_DATE(List list) { l_EFF_PHASE_IN_DATE = list; }
	public void setList_WORK_STS_TYP(List list) { l_WORK_STS_TYP = list; }
	public void setList_CHECK_MODIFY_COUNT(List list) { l_CHECK_MODIFY_COUNT = list; }
	public void setList_VEND_ANAME(List list) { l_VEND_ANAME = list; }
	public void setList_MANHOUR_TYP(List list) { l_MANHOUR_TYP = list; }
	public void setList_SPOIL_FLG(List list) { l_SPOIL_FLG = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }

	public int setL2L_OPR_RSLT_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_RSLT_TYP_DN == null) {
			l_OPR_RSLT_TYP_DN = new ArrayList();
		} else {
			l_OPR_RSLT_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_RSLT_TYP_DN.add(((AD0030030Struct) list.get(i)).getOPR_RSLT_TYP_DN());
		}
		return size;
	}
	public int setL2L_r1_FILTER1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r1_FILTER1 == null) {
			l_r1_FILTER1 = new ArrayList();
		} else {
			l_r1_FILTER1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r1_FILTER1.add(((AD0030030Struct) list.get(i)).getr1_FILTER1());
		}
		return size;
	}
	public int setL2L_c_OUTPUT_RSLT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_OUTPUT_RSLT == null) {
			l_c_OUTPUT_RSLT = new ArrayList();
		} else {
			l_c_OUTPUT_RSLT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_OUTPUT_RSLT.add(((AD0030030Struct) list.get(i)).getc_OUTPUT_RSLT());
		}
		return size;
	}
	public int setL2L_r2_FILTER1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r2_FILTER1 == null) {
			l_r2_FILTER1 = new ArrayList();
		} else {
			l_r2_FILTER1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r2_FILTER1.add(((AD0030030Struct) list.get(i)).getr2_FILTER1());
		}
		return size;
	}
	public int setL2L_c_OUTSIDE_TYP_IN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_OUTSIDE_TYP_IN == null) {
			l_c_OUTSIDE_TYP_IN = new ArrayList();
		} else {
			l_c_OUTSIDE_TYP_IN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_OUTSIDE_TYP_IN.add(((AD0030030Struct) list.get(i)).getc_OUTSIDE_TYP_IN());
		}
		return size;
	}
	public int setL2L_c_OUTSIDE_TYP_OUT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_OUTSIDE_TYP_OUT == null) {
			l_c_OUTSIDE_TYP_OUT = new ArrayList();
		} else {
			l_c_OUTSIDE_TYP_OUT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_OUTSIDE_TYP_OUT.add(((AD0030030Struct) list.get(i)).getc_OUTSIDE_TYP_OUT());
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
			l_OUTSIDE_TYP_DN.add(((AD0030030Struct) list.get(i)).getOUTSIDE_TYP_DN());
		}
		return size;
	}
	public int setL2L_OPR_INST_START_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_INST_START_TIME == null) {
			l_OPR_INST_START_TIME = new ArrayList();
		} else {
			l_OPR_INST_START_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_INST_START_TIME.add(((AD0030030Struct) list.get(i)).getOPR_INST_START_TIME());
		}
		return size;
	}
	public int setL2L_WORK_ODR_DLV_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WORK_ODR_DLV_TIME == null) {
			l_WORK_ODR_DLV_TIME = new ArrayList();
		} else {
			l_WORK_ODR_DLV_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WORK_ODR_DLV_TIME.add(((AD0030030Struct) list.get(i)).getWORK_ODR_DLV_TIME());
		}
		return size;
	}
	public int setL2L_ODINFO_DISGUISE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODINFO_DISGUISE == null) {
			l_ODINFO_DISGUISE = new ArrayList();
		} else {
			l_ODINFO_DISGUISE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODINFO_DISGUISE.add(((AD0030030Struct) list.get(i)).getODINFO_DISGUISE());
		}
		return size;
	}
	public int setL2L_WORK_ODR_DLV_DATE_01(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WORK_ODR_DLV_DATE_01 == null) {
			l_WORK_ODR_DLV_DATE_01 = new ArrayList();
		} else {
			l_WORK_ODR_DLV_DATE_01.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WORK_ODR_DLV_DATE_01.add(((AD0030030Struct) list.get(i)).getWORK_ODR_DLV_DATE_01());
		}
		return size;
	}
	public int setL2L_OPR_INST_START_DATE_01(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_INST_START_DATE_01 == null) {
			l_OPR_INST_START_DATE_01 = new ArrayList();
		} else {
			l_OPR_INST_START_DATE_01.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_INST_START_DATE_01.add(((AD0030030Struct) list.get(i)).getOPR_INST_START_DATE_01());
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
			l_TIME_CTRL.add(((AD0030030Struct) list.get(i)).getTIME_CTRL());
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
			l_OPR_INST_CD.add(((AD0030030Struct) list.get(i)).getOPR_INST_CD());
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
			l_WORK_ODR_CD.add(((AD0030030Struct) list.get(i)).getWORK_ODR_CD());
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
			l_WORK_IN_PROC_CD.add(((AD0030030Struct) list.get(i)).getWORK_IN_PROC_CD());
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
			l_PROC_NAME.add(((AD0030030Struct) list.get(i)).getPROC_NAME());
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
			l_PROC_NO.add(((AD0030030Struct) list.get(i)).getPROC_NO());
		}
		return size;
	}
	public int setL2L_l_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_JOB_ODR_CD == null) {
			l_l_JOB_ODR_CD = new ArrayList();
		} else {
			l_l_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_JOB_ODR_CD.add(((AD0030030Struct) list.get(i)).getl_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_l_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ITEM_CD == null) {
			l_l_ITEM_CD = new ArrayList();
		} else {
			l_l_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ITEM_CD.add(((AD0030030Struct) list.get(i)).getl_ITEM_CD());
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
			l_ITEM_NAME.add(((AD0030030Struct) list.get(i)).getITEM_NAME());
		}
		return size;
	}
	public int setL2L_l_WS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_WS_CD == null) {
			l_l_WS_CD = new ArrayList();
		} else {
			l_l_WS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_WS_CD.add(((AD0030030Struct) list.get(i)).getl_WS_CD());
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
			l_WS_NAME.add(((AD0030030Struct) list.get(i)).getWS_NAME());
		}
		return size;
	}
	public int setL2L_l_VEND_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_VEND_CD == null) {
			l_l_VEND_CD = new ArrayList();
		} else {
			l_l_VEND_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_VEND_CD.add(((AD0030030Struct) list.get(i)).getl_VEND_CD());
		}
		return size;
	}
	public int setL2L_l_VEND_ANAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_VEND_ANAME == null) {
			l_l_VEND_ANAME = new ArrayList();
		} else {
			l_l_VEND_ANAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_VEND_ANAME.add(((AD0030030Struct) list.get(i)).getl_VEND_ANAME());
		}
		return size;
	}
	public int setL2L_l_WORK_ODR_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_WORK_ODR_DLV_DATE == null) {
			l_l_WORK_ODR_DLV_DATE = new ArrayList();
		} else {
			l_l_WORK_ODR_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_WORK_ODR_DLV_DATE.add(((AD0030030Struct) list.get(i)).getl_WORK_ODR_DLV_DATE());
		}
		return size;
	}
	public int setL2L_l_OPR_INST_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OPR_INST_START_DATE == null) {
			l_l_OPR_INST_START_DATE = new ArrayList();
		} else {
			l_l_OPR_INST_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OPR_INST_START_DATE.add(((AD0030030Struct) list.get(i)).getl_OPR_INST_START_DATE());
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
			l_OPR_INST_QTY.add(((AD0030030Struct) list.get(i)).getOPR_INST_QTY());
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
			l_WORK_IN_PROC_COMMENT.add(((AD0030030Struct) list.get(i)).getWORK_IN_PROC_COMMENT());
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
			l_OUTSIDE_TYP.add(((AD0030030Struct) list.get(i)).getOUTSIDE_TYP());
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
			l_PLANT_CD.add(((AD0030030Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_l_OPR_RSLT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OPR_RSLT_TYP == null) {
			l_l_OPR_RSLT_TYP = new ArrayList();
		} else {
			l_l_OPR_RSLT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OPR_RSLT_TYP.add(((AD0030030Struct) list.get(i)).getl_OPR_RSLT_TYP());
		}
		return size;
	}
	public int setL2L_h_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_MODIFY_COUNT == null) {
			l_h_MODIFY_COUNT = new ArrayList();
		} else {
			l_h_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_MODIFY_COUNT.add(((AD0030030Struct) list.get(i)).geth_MODIFY_COUNT());
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
			l_ITEM_CD.add(((AD0030030Struct) list.get(i)).getITEM_CD());
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
			l_JOB_ODR_CD.add(((AD0030030Struct) list.get(i)).getJOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_HIDDEN_OPR_RSLT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HIDDEN_OPR_RSLT_TYP == null) {
			l_HIDDEN_OPR_RSLT_TYP = new ArrayList();
		} else {
			l_HIDDEN_OPR_RSLT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HIDDEN_OPR_RSLT_TYP.add(((AD0030030Struct) list.get(i)).getHIDDEN_OPR_RSLT_TYP());
		}
		return size;
	}
	public int setL2L_h1_WS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h1_WS_CD == null) {
			l_h1_WS_CD = new ArrayList();
		} else {
			l_h1_WS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h1_WS_CD.add(((AD0030030Struct) list.get(i)).geth1_WS_CD());
		}
		return size;
	}
	public int setL2L_HIDDEN_OUTSIDE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HIDDEN_OUTSIDE_TYP == null) {
			l_HIDDEN_OUTSIDE_TYP = new ArrayList();
		} else {
			l_HIDDEN_OUTSIDE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HIDDEN_OUTSIDE_TYP.add(((AD0030030Struct) list.get(i)).getHIDDEN_OUTSIDE_TYP());
		}
		return size;
	}
	public int setL2L_HIDDEN_OPR_RSLT_TYP2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HIDDEN_OPR_RSLT_TYP2 == null) {
			l_HIDDEN_OPR_RSLT_TYP2 = new ArrayList();
		} else {
			l_HIDDEN_OPR_RSLT_TYP2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HIDDEN_OPR_RSLT_TYP2.add(((AD0030030Struct) list.get(i)).getHIDDEN_OPR_RSLT_TYP2());
		}
		return size;
	}
	public int setL2L_h2_WS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h2_WS_CD == null) {
			l_h2_WS_CD = new ArrayList();
		} else {
			l_h2_WS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h2_WS_CD.add(((AD0030030Struct) list.get(i)).geth2_WS_CD());
		}
		return size;
	}
	public int setL2L_HIDDEN_OUTSIDE_TYP2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HIDDEN_OUTSIDE_TYP2 == null) {
			l_HIDDEN_OUTSIDE_TYP2 = new ArrayList();
		} else {
			l_HIDDEN_OUTSIDE_TYP2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HIDDEN_OUTSIDE_TYP2.add(((AD0030030Struct) list.get(i)).getHIDDEN_OUTSIDE_TYP2());
		}
		return size;
	}
	public int setL2L_HIDDEN_OPR_RSLT_TYP3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HIDDEN_OPR_RSLT_TYP3 == null) {
			l_HIDDEN_OPR_RSLT_TYP3 = new ArrayList();
		} else {
			l_HIDDEN_OPR_RSLT_TYP3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HIDDEN_OPR_RSLT_TYP3.add(((AD0030030Struct) list.get(i)).getHIDDEN_OPR_RSLT_TYP3());
		}
		return size;
	}
	public int setL2L_h_VEND_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_VEND_CD == null) {
			l_h_VEND_CD = new ArrayList();
		} else {
			l_h_VEND_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_VEND_CD.add(((AD0030030Struct) list.get(i)).geth_VEND_CD());
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
			l_WH_CD.add(((AD0030030Struct) list.get(i)).getWH_CD());
		}
		return size;
	}
	public int setL2L_OPR_INST_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_INST_DATE == null) {
			l_OPR_INST_DATE = new ArrayList();
		} else {
			l_OPR_INST_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_INST_DATE.add(((AD0030030Struct) list.get(i)).getOPR_INST_DATE());
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
			l_BUSINESS_OPR_DATE.add(((AD0030030Struct) list.get(i)).getBUSINESS_OPR_DATE());
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
			l_OD_NO.add(((AD0030030Struct) list.get(i)).getOD_NO());
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
			l_PS_EDITION.add(((AD0030030Struct) list.get(i)).getPS_EDITION());
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
			l_PS_UNIT_QTY.add(((AD0030030Struct) list.get(i)).getPS_UNIT_QTY());
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
			l_PARENT_OD_NO.add(((AD0030030Struct) list.get(i)).getPARENT_OD_NO());
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
			l_MRP_ODR_TYP.add(((AD0030030Struct) list.get(i)).getMRP_ODR_TYP());
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
			l_ISSUE_TYP.add(((AD0030030Struct) list.get(i)).getISSUE_TYP());
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
			l_DUE_DATE.add(((AD0030030Struct) list.get(i)).getDUE_DATE());
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
			l_PS_UNIT_DENOMINATOR.add(((AD0030030Struct) list.get(i)).getPS_UNIT_DENOMINATOR());
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
			l_PS_UNIT_NUMERATOR.add(((AD0030030Struct) list.get(i)).getPS_UNIT_NUMERATOR());
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
			l_PS_SPOIL.add(((AD0030030Struct) list.get(i)).getPS_SPOIL());
		}
		return size;
	}
	public int setL2L_ISSUE_INST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_INST_CD == null) {
			l_ISSUE_INST_CD = new ArrayList();
		} else {
			l_ISSUE_INST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_INST_CD.add(((AD0030030Struct) list.get(i)).getISSUE_INST_CD());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_CD == null) {
			l_PUCH_ODR_CD = new ArrayList();
		} else {
			l_PUCH_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_CD.add(((AD0030030Struct) list.get(i)).getPUCH_ODR_CD());
		}
		return size;
	}
	public int setL2L_ISSUE_INST_UNIT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_INST_UNIT_QTY == null) {
			l_ISSUE_INST_UNIT_QTY = new ArrayList();
		} else {
			l_ISSUE_INST_UNIT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_INST_UNIT_QTY.add(((AD0030030Struct) list.get(i)).getISSUE_INST_UNIT_QTY());
		}
		return size;
	}
	public int setL2L_ISSUE_INST_UNIT_DENOMINATOR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_INST_UNIT_DENOMINATOR == null) {
			l_ISSUE_INST_UNIT_DENOMINATOR = new ArrayList();
		} else {
			l_ISSUE_INST_UNIT_DENOMINATOR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_INST_UNIT_DENOMINATOR.add(((AD0030030Struct) list.get(i)).getISSUE_INST_UNIT_DENOMINATOR());
		}
		return size;
	}
	public int setL2L_ISSUE_INST_UNIT_NUMERATOR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_INST_UNIT_NUMERATOR == null) {
			l_ISSUE_INST_UNIT_NUMERATOR = new ArrayList();
		} else {
			l_ISSUE_INST_UNIT_NUMERATOR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_INST_UNIT_NUMERATOR.add(((AD0030030Struct) list.get(i)).getISSUE_INST_UNIT_NUMERATOR());
		}
		return size;
	}
	public int setL2L_ISSUE_INST_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_INST_QTY == null) {
			l_ISSUE_INST_QTY = new ArrayList();
		} else {
			l_ISSUE_INST_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_INST_QTY.add(((AD0030030Struct) list.get(i)).getISSUE_INST_QTY());
		}
		return size;
	}
	public int setL2L_TOTAL_ISSUE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TOTAL_ISSUE_QTY == null) {
			l_TOTAL_ISSUE_QTY = new ArrayList();
		} else {
			l_TOTAL_ISSUE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TOTAL_ISSUE_QTY.add(((AD0030030Struct) list.get(i)).getTOTAL_ISSUE_QTY());
		}
		return size;
	}
	public int setL2L_SCDL_ISSUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SCDL_ISSUE_DATE == null) {
			l_SCDL_ISSUE_DATE = new ArrayList();
		} else {
			l_SCDL_ISSUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SCDL_ISSUE_DATE.add(((AD0030030Struct) list.get(i)).getSCDL_ISSUE_DATE());
		}
		return size;
	}
	public int setL2L_ISSUE_CMPLT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_CMPLT_DATE == null) {
			l_ISSUE_CMPLT_DATE = new ArrayList();
		} else {
			l_ISSUE_CMPLT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_CMPLT_DATE.add(((AD0030030Struct) list.get(i)).getISSUE_CMPLT_DATE());
		}
		return size;
	}
	public int setL2L_ISSUE_CMPLT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_CMPLT_FLG == null) {
			l_ISSUE_CMPLT_FLG = new ArrayList();
		} else {
			l_ISSUE_CMPLT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_CMPLT_FLG.add(((AD0030030Struct) list.get(i)).getISSUE_CMPLT_FLG());
		}
		return size;
	}
	public int setL2L_ISSUE_INST_ISS_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_INST_ISS_FLG == null) {
			l_ISSUE_INST_ISS_FLG = new ArrayList();
		} else {
			l_ISSUE_INST_ISS_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_INST_ISS_FLG.add(((AD0030030Struct) list.get(i)).getISSUE_INST_ISS_FLG());
		}
		return size;
	}
	public int setL2L_ISSUE_INST_ISS_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_INST_ISS_DATE == null) {
			l_ISSUE_INST_ISS_DATE = new ArrayList();
		} else {
			l_ISSUE_INST_ISS_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_INST_ISS_DATE.add(((AD0030030Struct) list.get(i)).getISSUE_INST_ISS_DATE());
		}
		return size;
	}
	public int setL2L_ISSUE_INST_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_INST_COMMENT == null) {
			l_ISSUE_INST_COMMENT = new ArrayList();
		} else {
			l_ISSUE_INST_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_INST_COMMENT.add(((AD0030030Struct) list.get(i)).getISSUE_INST_COMMENT());
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
			l_WS_CD.add(((AD0030030Struct) list.get(i)).getWS_CD());
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
			l_COMPANY_CD.add(((AD0030030Struct) list.get(i)).getCOMPANY_CD());
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
			l_VEND_CD.add(((AD0030030Struct) list.get(i)).getVEND_CD());
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
			l_CONS_TYP.add(((AD0030030Struct) list.get(i)).getCONS_TYP());
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
			l_UNIT_QTY_TYP.add(((AD0030030Struct) list.get(i)).getUNIT_QTY_TYP());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_PERSON(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_PERSON == null) {
			l_PUCH_ODR_PERSON = new ArrayList();
		} else {
			l_PUCH_ODR_PERSON.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_PERSON.add(((AD0030030Struct) list.get(i)).getPUCH_ODR_PERSON());
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
			l_PUCH_ODR_START_DATE.add(((AD0030030Struct) list.get(i)).getPUCH_ODR_START_DATE());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_DLV_DATE == null) {
			l_PUCH_ODR_DLV_DATE = new ArrayList();
		} else {
			l_PUCH_ODR_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_DLV_DATE.add(((AD0030030Struct) list.get(i)).getPUCH_ODR_DLV_DATE());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_QTY == null) {
			l_PUCH_ODR_QTY = new ArrayList();
		} else {
			l_PUCH_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_QTY.add(((AD0030030Struct) list.get(i)).getPUCH_ODR_QTY());
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
			l_UNIT_COST_TYP.add(((AD0030030Struct) list.get(i)).getUNIT_COST_TYP());
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
			l_UNIT_COST.add(((AD0030030Struct) list.get(i)).getUNIT_COST());
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
			l_PROCESSING_COST.add(((AD0030030Struct) list.get(i)).getPROCESSING_COST());
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
			l_MATERIAL_COST.add(((AD0030030Struct) list.get(i)).getMATERIAL_COST());
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
			l_OTHER_OVERHEADS.add(((AD0030030Struct) list.get(i)).getOTHER_OVERHEADS());
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
			l_DISC_AMOUNT.add(((AD0030030Struct) list.get(i)).getDISC_AMOUNT());
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
			l_PUCH_ODR_AMOUNT.add(((AD0030030Struct) list.get(i)).getPUCH_ODR_AMOUNT());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_INST_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_INST_DATE == null) {
			l_PUCH_ODR_INST_DATE = new ArrayList();
		} else {
			l_PUCH_ODR_INST_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_INST_DATE.add(((AD0030030Struct) list.get(i)).getPUCH_ODR_INST_DATE());
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
			l_SPL_ITEM_TYP.add(((AD0030030Struct) list.get(i)).getSPL_ITEM_TYP());
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
			l_ACPT_INSPC_TYP.add(((AD0030030Struct) list.get(i)).getACPT_INSPC_TYP());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_COMMENT == null) {
			l_PUCH_ODR_COMMENT = new ArrayList();
		} else {
			l_PUCH_ODR_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_COMMENT.add(((AD0030030Struct) list.get(i)).getPUCH_ODR_COMMENT());
		}
		return size;
	}
	public int setL2L_RATE_JUDGE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RATE_JUDGE_DATE == null) {
			l_RATE_JUDGE_DATE = new ArrayList();
		} else {
			l_RATE_JUDGE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RATE_JUDGE_DATE.add(((AD0030030Struct) list.get(i)).getRATE_JUDGE_DATE());
		}
		return size;
	}
	public int setL2L_TAX_RATE_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_RATE_1 == null) {
			l_TAX_RATE_1 = new ArrayList();
		} else {
			l_TAX_RATE_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_RATE_1.add(((AD0030030Struct) list.get(i)).getTAX_RATE_1());
		}
		return size;
	}
	public int setL2L_TAX_RATE_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_RATE_2 == null) {
			l_TAX_RATE_2 = new ArrayList();
		} else {
			l_TAX_RATE_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_RATE_2.add(((AD0030030Struct) list.get(i)).getTAX_RATE_2());
		}
		return size;
	}
	public int setL2L_TAX_RATE_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_RATE_3 == null) {
			l_TAX_RATE_3 = new ArrayList();
		} else {
			l_TAX_RATE_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_RATE_3.add(((AD0030030Struct) list.get(i)).getTAX_RATE_3());
		}
		return size;
	}
	public int setL2L_NET_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NET_AMOUNT == null) {
			l_NET_AMOUNT = new ArrayList();
		} else {
			l_NET_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NET_AMOUNT.add(((AD0030030Struct) list.get(i)).getNET_AMOUNT());
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
			l_TAX_AMOUNT_1.add(((AD0030030Struct) list.get(i)).getTAX_AMOUNT_1());
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
			l_TAX_AMOUNT_2.add(((AD0030030Struct) list.get(i)).getTAX_AMOUNT_2());
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
			l_TAX_AMOUNT_3.add(((AD0030030Struct) list.get(i)).getTAX_AMOUNT_3());
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
			l_AMOUNT_INCLUDE_TAX.add(((AD0030030Struct) list.get(i)).getAMOUNT_INCLUDE_TAX());
		}
		return size;
	}
	public int setL2L_HOME_CUR_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HOME_CUR_AMOUNT == null) {
			l_HOME_CUR_AMOUNT = new ArrayList();
		} else {
			l_HOME_CUR_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HOME_CUR_AMOUNT.add(((AD0030030Struct) list.get(i)).getHOME_CUR_AMOUNT());
		}
		return size;
	}
	public int setL2L_TAX_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_CD == null) {
			l_TAX_CD = new ArrayList();
		} else {
			l_TAX_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_CD.add(((AD0030030Struct) list.get(i)).getTAX_CD());
		}
		return size;
	}
	public int setL2L_TAX_ROUND_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_ROUND_TYP == null) {
			l_TAX_ROUND_TYP = new ArrayList();
		} else {
			l_TAX_ROUND_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_ROUND_TYP.add(((AD0030030Struct) list.get(i)).getTAX_ROUND_TYP());
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
			l_EXCH_RATE.add(((AD0030030Struct) list.get(i)).getEXCH_RATE());
		}
		return size;
	}
	public int setL2L_OPR_INST_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_INST_START_DATE == null) {
			l_OPR_INST_START_DATE = new ArrayList();
		} else {
			l_OPR_INST_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_INST_START_DATE.add(((AD0030030Struct) list.get(i)).getOPR_INST_START_DATE());
		}
		return size;
	}
	public int setL2L_WORK_ODR_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WORK_ODR_DLV_DATE == null) {
			l_WORK_ODR_DLV_DATE = new ArrayList();
		} else {
			l_WORK_ODR_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WORK_ODR_DLV_DATE.add(((AD0030030Struct) list.get(i)).getWORK_ODR_DLV_DATE());
		}
		return size;
	}
	public int setL2L_OWN_PERSON_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OWN_PERSON_NAME == null) {
			l_OWN_PERSON_NAME = new ArrayList();
		} else {
			l_OWN_PERSON_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OWN_PERSON_NAME.add(((AD0030030Struct) list.get(i)).getOWN_PERSON_NAME());
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
			l_EXCH_TYP.add(((AD0030030Struct) list.get(i)).getEXCH_TYP());
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
			l_CUR_CD.add(((AD0030030Struct) list.get(i)).getCUR_CD());
		}
		return size;
	}
	public int setL2L_VEND_DECIMAL_FIG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_DECIMAL_FIG == null) {
			l_VEND_DECIMAL_FIG = new ArrayList();
		} else {
			l_VEND_DECIMAL_FIG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_DECIMAL_FIG.add(((AD0030030Struct) list.get(i)).getVEND_DECIMAL_FIG());
		}
		return size;
	}
	public int setL2L_MIN_PROC_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MIN_PROC_NO == null) {
			l_MIN_PROC_NO = new ArrayList();
		} else {
			l_MIN_PROC_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MIN_PROC_NO.add(((AD0030030Struct) list.get(i)).getMIN_PROC_NO());
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
			l_EFF_PHASE_IN_DATE.add(((AD0030030Struct) list.get(i)).getEFF_PHASE_IN_DATE());
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
			l_WORK_STS_TYP.add(((AD0030030Struct) list.get(i)).getWORK_STS_TYP());
		}
		return size;
	}
	public int setL2L_CHECK_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CHECK_MODIFY_COUNT == null) {
			l_CHECK_MODIFY_COUNT = new ArrayList();
		} else {
			l_CHECK_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CHECK_MODIFY_COUNT.add(((AD0030030Struct) list.get(i)).getCHECK_MODIFY_COUNT());
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
			l_VEND_ANAME.add(((AD0030030Struct) list.get(i)).getVEND_ANAME());
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
			l_MANHOUR_TYP.add(((AD0030030Struct) list.get(i)).getMANHOUR_TYP());
		}
		return size;
	}
	public int setL2L_SPOIL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SPOIL_FLG == null) {
			l_SPOIL_FLG = new ArrayList();
		} else {
			l_SPOIL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SPOIL_FLG.add(((AD0030030Struct) list.get(i)).getSPOIL_FLG());
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
			l_l_COUNT.add(((AD0030030Struct) list.get(i)).getl_COUNT());
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
			l_ROW_COUNT.add(((AD0030030Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_OPR_RSLT_TYP_DN = null;
		m_r1_FILTER1 = null;
		m_c_OUTPUT_RSLT = null;
		m_r2_FILTER1 = null;
		m_c_OUTSIDE_TYP_IN = null;
		m_c_OUTSIDE_TYP_OUT = null;
		m_OUTSIDE_TYP_DN = null;
		m_OPR_INST_START_TIME = null;
		m_WORK_ODR_DLV_TIME = null;
		m_ODINFO_DISGUISE = null;
		m_WORK_ODR_DLV_DATE_01 = null;
		m_OPR_INST_START_DATE_01 = null;
		m_TIME_CTRL = null;
		m_OPR_INST_CD = null;
		m_WORK_ODR_CD = null;
		m_WORK_IN_PROC_CD = null;
		m_PROC_NAME = null;
		m_PROC_NO = null;
		m_l_JOB_ODR_CD = null;
		m_l_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_l_WS_CD = null;
		m_WS_NAME = null;
		m_l_VEND_CD = null;
		m_l_VEND_ANAME = null;
		m_l_WORK_ODR_DLV_DATE = null;
		m_l_OPR_INST_START_DATE = null;
		m_OPR_INST_QTY = null;
		m_WORK_IN_PROC_COMMENT = null;
		m_OUTSIDE_TYP = null;
		m_PLANT_CD = null;
		m_l_OPR_RSLT_TYP = null;
		m_h_MODIFY_COUNT = null;
		m_ITEM_CD = null;
		m_JOB_ODR_CD = null;
		m_HIDDEN_OPR_RSLT_TYP = null;
		m_h1_WS_CD = null;
		m_HIDDEN_OUTSIDE_TYP = null;
		m_HIDDEN_OPR_RSLT_TYP2 = null;
		m_h2_WS_CD = null;
		m_HIDDEN_OUTSIDE_TYP2 = null;
		m_HIDDEN_OPR_RSLT_TYP3 = null;
		m_h_VEND_CD = null;
		m_WH_CD = null;
		m_OPR_INST_DATE = null;
		m_BUSINESS_OPR_DATE = null;
		m_OD_NO = null;
		m_PS_EDITION = null;
		m_PS_UNIT_QTY = null;
		m_PARENT_OD_NO = null;
		m_MRP_ODR_TYP = null;
		m_ISSUE_TYP = null;
		m_DUE_DATE = null;
		m_PS_UNIT_DENOMINATOR = null;
		m_PS_UNIT_NUMERATOR = null;
		m_PS_SPOIL = null;
		m_ISSUE_INST_CD = null;
		m_PUCH_ODR_CD = null;
		m_ISSUE_INST_UNIT_QTY = null;
		m_ISSUE_INST_UNIT_DENOMINATOR = null;
		m_ISSUE_INST_UNIT_NUMERATOR = null;
		m_ISSUE_INST_QTY = null;
		m_TOTAL_ISSUE_QTY = null;
		m_SCDL_ISSUE_DATE = null;
		m_ISSUE_CMPLT_DATE = null;
		m_ISSUE_CMPLT_FLG = null;
		m_ISSUE_INST_ISS_FLG = null;
		m_ISSUE_INST_ISS_DATE = null;
		m_ISSUE_INST_COMMENT = null;
		m_WS_CD = null;
		m_COMPANY_CD = null;
		m_VEND_CD = null;
		m_CONS_TYP = null;
		m_UNIT_QTY_TYP = null;
		m_PUCH_ODR_PERSON = null;
		m_PUCH_ODR_START_DATE = null;
		m_PUCH_ODR_DLV_DATE = null;
		m_PUCH_ODR_QTY = null;
		m_UNIT_COST_TYP = null;
		m_UNIT_COST = null;
		m_PROCESSING_COST = null;
		m_MATERIAL_COST = null;
		m_OTHER_OVERHEADS = null;
		m_DISC_AMOUNT = null;
		m_PUCH_ODR_AMOUNT = null;
		m_PUCH_ODR_INST_DATE = null;
		m_SPL_ITEM_TYP = null;
		m_ACPT_INSPC_TYP = null;
		m_PUCH_ODR_COMMENT = null;
		m_RATE_JUDGE_DATE = null;
		m_TAX_RATE_1 = null;
		m_TAX_RATE_2 = null;
		m_TAX_RATE_3 = null;
		m_NET_AMOUNT = null;
		m_TAX_AMOUNT_1 = null;
		m_TAX_AMOUNT_2 = null;
		m_TAX_AMOUNT_3 = null;
		m_AMOUNT_INCLUDE_TAX = null;
		m_HOME_CUR_AMOUNT = null;
		m_TAX_CD = null;
		m_TAX_ROUND_TYP = null;
		m_EXCH_RATE = null;
		m_OPR_INST_START_DATE = null;
		m_WORK_ODR_DLV_DATE = null;
		m_OWN_PERSON_NAME = null;
		m_EXCH_TYP = null;
		m_CUR_CD = null;
		m_VEND_DECIMAL_FIG = null;
		m_MIN_PROC_NO = null;
		m_EFF_PHASE_IN_DATE = null;
		m_WORK_STS_TYP = null;
		m_CHECK_MODIFY_COUNT = null;
		m_VEND_ANAME = null;
		m_MANHOUR_TYP = null;
		m_SPOIL_FLG = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;

		l_OPR_RSLT_TYP_DN = null;
		l_r1_FILTER1 = null;
		l_c_OUTPUT_RSLT = null;
		l_r2_FILTER1 = null;
		l_c_OUTSIDE_TYP_IN = null;
		l_c_OUTSIDE_TYP_OUT = null;
		l_OUTSIDE_TYP_DN = null;
		l_OPR_INST_START_TIME = null;
		l_WORK_ODR_DLV_TIME = null;
		l_ODINFO_DISGUISE = null;
		l_WORK_ODR_DLV_DATE_01 = null;
		l_OPR_INST_START_DATE_01 = null;
		l_TIME_CTRL = null;
		l_OPR_INST_CD = null;
		l_WORK_ODR_CD = null;
		l_WORK_IN_PROC_CD = null;
		l_PROC_NAME = null;
		l_PROC_NO = null;
		l_l_JOB_ODR_CD = null;
		l_l_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_l_WS_CD = null;
		l_WS_NAME = null;
		l_l_VEND_CD = null;
		l_l_VEND_ANAME = null;
		l_l_WORK_ODR_DLV_DATE = null;
		l_l_OPR_INST_START_DATE = null;
		l_OPR_INST_QTY = null;
		l_WORK_IN_PROC_COMMENT = null;
		l_OUTSIDE_TYP = null;
		l_PLANT_CD = null;
		l_l_OPR_RSLT_TYP = null;
		l_h_MODIFY_COUNT = null;
		l_ITEM_CD = null;
		l_JOB_ODR_CD = null;
		l_HIDDEN_OPR_RSLT_TYP = null;
		l_h1_WS_CD = null;
		l_HIDDEN_OUTSIDE_TYP = null;
		l_HIDDEN_OPR_RSLT_TYP2 = null;
		l_h2_WS_CD = null;
		l_HIDDEN_OUTSIDE_TYP2 = null;
		l_HIDDEN_OPR_RSLT_TYP3 = null;
		l_h_VEND_CD = null;
		l_WH_CD = null;
		l_OPR_INST_DATE = null;
		l_BUSINESS_OPR_DATE = null;
		l_OD_NO = null;
		l_PS_EDITION = null;
		l_PS_UNIT_QTY = null;
		l_PARENT_OD_NO = null;
		l_MRP_ODR_TYP = null;
		l_ISSUE_TYP = null;
		l_DUE_DATE = null;
		l_PS_UNIT_DENOMINATOR = null;
		l_PS_UNIT_NUMERATOR = null;
		l_PS_SPOIL = null;
		l_ISSUE_INST_CD = null;
		l_PUCH_ODR_CD = null;
		l_ISSUE_INST_UNIT_QTY = null;
		l_ISSUE_INST_UNIT_DENOMINATOR = null;
		l_ISSUE_INST_UNIT_NUMERATOR = null;
		l_ISSUE_INST_QTY = null;
		l_TOTAL_ISSUE_QTY = null;
		l_SCDL_ISSUE_DATE = null;
		l_ISSUE_CMPLT_DATE = null;
		l_ISSUE_CMPLT_FLG = null;
		l_ISSUE_INST_ISS_FLG = null;
		l_ISSUE_INST_ISS_DATE = null;
		l_ISSUE_INST_COMMENT = null;
		l_WS_CD = null;
		l_COMPANY_CD = null;
		l_VEND_CD = null;
		l_CONS_TYP = null;
		l_UNIT_QTY_TYP = null;
		l_PUCH_ODR_PERSON = null;
		l_PUCH_ODR_START_DATE = null;
		l_PUCH_ODR_DLV_DATE = null;
		l_PUCH_ODR_QTY = null;
		l_UNIT_COST_TYP = null;
		l_UNIT_COST = null;
		l_PROCESSING_COST = null;
		l_MATERIAL_COST = null;
		l_OTHER_OVERHEADS = null;
		l_DISC_AMOUNT = null;
		l_PUCH_ODR_AMOUNT = null;
		l_PUCH_ODR_INST_DATE = null;
		l_SPL_ITEM_TYP = null;
		l_ACPT_INSPC_TYP = null;
		l_PUCH_ODR_COMMENT = null;
		l_RATE_JUDGE_DATE = null;
		l_TAX_RATE_1 = null;
		l_TAX_RATE_2 = null;
		l_TAX_RATE_3 = null;
		l_NET_AMOUNT = null;
		l_TAX_AMOUNT_1 = null;
		l_TAX_AMOUNT_2 = null;
		l_TAX_AMOUNT_3 = null;
		l_AMOUNT_INCLUDE_TAX = null;
		l_HOME_CUR_AMOUNT = null;
		l_TAX_CD = null;
		l_TAX_ROUND_TYP = null;
		l_EXCH_RATE = null;
		l_OPR_INST_START_DATE = null;
		l_WORK_ODR_DLV_DATE = null;
		l_OWN_PERSON_NAME = null;
		l_EXCH_TYP = null;
		l_CUR_CD = null;
		l_VEND_DECIMAL_FIG = null;
		l_MIN_PROC_NO = null;
		l_EFF_PHASE_IN_DATE = null;
		l_WORK_STS_TYP = null;
		l_CHECK_MODIFY_COUNT = null;
		l_VEND_ANAME = null;
		l_MANHOUR_TYP = null;
		l_SPOIL_FLG = null;
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
	 * medAD0030030クラスの標準コンストラクタ
	 */
	public AD0030030Struct()
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
	public void setStruct(AD0030030Struct struct)
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
	public void setStructM(AD0030030Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setOPR_RSLT_TYP_DN(struct.getOPR_RSLT_TYP_DN());
			this.setr1_FILTER1(struct.getr1_FILTER1());
			this.setc_OUTPUT_RSLT(struct.getc_OUTPUT_RSLT());
			this.setr2_FILTER1(struct.getr2_FILTER1());
			this.setc_OUTSIDE_TYP_IN(struct.getc_OUTSIDE_TYP_IN());
			this.setc_OUTSIDE_TYP_OUT(struct.getc_OUTSIDE_TYP_OUT());
			this.setOUTSIDE_TYP_DN(struct.getOUTSIDE_TYP_DN());
			this.setOPR_INST_START_TIME(struct.getOPR_INST_START_TIME());
			this.setWORK_ODR_DLV_TIME(struct.getWORK_ODR_DLV_TIME());
			this.setODINFO_DISGUISE(struct.getODINFO_DISGUISE());
			this.setWORK_ODR_DLV_DATE_01(struct.getWORK_ODR_DLV_DATE_01());
			this.setOPR_INST_START_DATE_01(struct.getOPR_INST_START_DATE_01());
			this.setTIME_CTRL(struct.getTIME_CTRL());
			this.setOPR_INST_CD(struct.getOPR_INST_CD());
			this.setWORK_ODR_CD(struct.getWORK_ODR_CD());
			this.setWORK_IN_PROC_CD(struct.getWORK_IN_PROC_CD());
			this.setPROC_NAME(struct.getPROC_NAME());
			this.setPROC_NO(struct.getPROC_NO());
			this.setl_JOB_ODR_CD(struct.getl_JOB_ODR_CD());
			this.setl_ITEM_CD(struct.getl_ITEM_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setl_WS_CD(struct.getl_WS_CD());
			this.setWS_NAME(struct.getWS_NAME());
			this.setl_VEND_CD(struct.getl_VEND_CD());
			this.setl_VEND_ANAME(struct.getl_VEND_ANAME());
			this.setl_WORK_ODR_DLV_DATE(struct.getl_WORK_ODR_DLV_DATE());
			this.setl_OPR_INST_START_DATE(struct.getl_OPR_INST_START_DATE());
			this.setOPR_INST_QTY(struct.getOPR_INST_QTY());
			this.setWORK_IN_PROC_COMMENT(struct.getWORK_IN_PROC_COMMENT());
			this.setOUTSIDE_TYP(struct.getOUTSIDE_TYP());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setl_OPR_RSLT_TYP(struct.getl_OPR_RSLT_TYP());
			this.seth_MODIFY_COUNT(struct.geth_MODIFY_COUNT());
			this.setITEM_CD(struct.getITEM_CD());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setHIDDEN_OPR_RSLT_TYP(struct.getHIDDEN_OPR_RSLT_TYP());
			this.seth1_WS_CD(struct.geth1_WS_CD());
			this.setHIDDEN_OUTSIDE_TYP(struct.getHIDDEN_OUTSIDE_TYP());
			this.setHIDDEN_OPR_RSLT_TYP2(struct.getHIDDEN_OPR_RSLT_TYP2());
			this.seth2_WS_CD(struct.geth2_WS_CD());
			this.setHIDDEN_OUTSIDE_TYP2(struct.getHIDDEN_OUTSIDE_TYP2());
			this.setHIDDEN_OPR_RSLT_TYP3(struct.getHIDDEN_OPR_RSLT_TYP3());
			this.seth_VEND_CD(struct.geth_VEND_CD());
			this.setWH_CD(struct.getWH_CD());
			this.setOPR_INST_DATE(struct.getOPR_INST_DATE());
			this.setBUSINESS_OPR_DATE(struct.getBUSINESS_OPR_DATE());
			this.setOD_NO(struct.getOD_NO());
			this.setPS_EDITION(struct.getPS_EDITION());
			this.setPS_UNIT_QTY(struct.getPS_UNIT_QTY());
			this.setPARENT_OD_NO(struct.getPARENT_OD_NO());
			this.setMRP_ODR_TYP(struct.getMRP_ODR_TYP());
			this.setISSUE_TYP(struct.getISSUE_TYP());
			this.setDUE_DATE(struct.getDUE_DATE());
			this.setPS_UNIT_DENOMINATOR(struct.getPS_UNIT_DENOMINATOR());
			this.setPS_UNIT_NUMERATOR(struct.getPS_UNIT_NUMERATOR());
			this.setPS_SPOIL(struct.getPS_SPOIL());
			this.setISSUE_INST_CD(struct.getISSUE_INST_CD());
			this.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());
			this.setISSUE_INST_UNIT_QTY(struct.getISSUE_INST_UNIT_QTY());
			this.setISSUE_INST_UNIT_DENOMINATOR(struct.getISSUE_INST_UNIT_DENOMINATOR());
			this.setISSUE_INST_UNIT_NUMERATOR(struct.getISSUE_INST_UNIT_NUMERATOR());
			this.setISSUE_INST_QTY(struct.getISSUE_INST_QTY());
			this.setTOTAL_ISSUE_QTY(struct.getTOTAL_ISSUE_QTY());
			this.setSCDL_ISSUE_DATE(struct.getSCDL_ISSUE_DATE());
			this.setISSUE_CMPLT_DATE(struct.getISSUE_CMPLT_DATE());
			this.setISSUE_CMPLT_FLG(struct.getISSUE_CMPLT_FLG());
			this.setISSUE_INST_ISS_FLG(struct.getISSUE_INST_ISS_FLG());
			this.setISSUE_INST_ISS_DATE(struct.getISSUE_INST_ISS_DATE());
			this.setISSUE_INST_COMMENT(struct.getISSUE_INST_COMMENT());
			this.setWS_CD(struct.getWS_CD());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setVEND_CD(struct.getVEND_CD());
			this.setCONS_TYP(struct.getCONS_TYP());
			this.setUNIT_QTY_TYP(struct.getUNIT_QTY_TYP());
			this.setPUCH_ODR_PERSON(struct.getPUCH_ODR_PERSON());
			this.setPUCH_ODR_START_DATE(struct.getPUCH_ODR_START_DATE());
			this.setPUCH_ODR_DLV_DATE(struct.getPUCH_ODR_DLV_DATE());
			this.setPUCH_ODR_QTY(struct.getPUCH_ODR_QTY());
			this.setUNIT_COST_TYP(struct.getUNIT_COST_TYP());
			this.setUNIT_COST(struct.getUNIT_COST());
			this.setPROCESSING_COST(struct.getPROCESSING_COST());
			this.setMATERIAL_COST(struct.getMATERIAL_COST());
			this.setOTHER_OVERHEADS(struct.getOTHER_OVERHEADS());
			this.setDISC_AMOUNT(struct.getDISC_AMOUNT());
			this.setPUCH_ODR_AMOUNT(struct.getPUCH_ODR_AMOUNT());
			this.setPUCH_ODR_INST_DATE(struct.getPUCH_ODR_INST_DATE());
			this.setSPL_ITEM_TYP(struct.getSPL_ITEM_TYP());
			this.setACPT_INSPC_TYP(struct.getACPT_INSPC_TYP());
			this.setPUCH_ODR_COMMENT(struct.getPUCH_ODR_COMMENT());
			this.setRATE_JUDGE_DATE(struct.getRATE_JUDGE_DATE());
			this.setTAX_RATE_1(struct.getTAX_RATE_1());
			this.setTAX_RATE_2(struct.getTAX_RATE_2());
			this.setTAX_RATE_3(struct.getTAX_RATE_3());
			this.setNET_AMOUNT(struct.getNET_AMOUNT());
			this.setTAX_AMOUNT_1(struct.getTAX_AMOUNT_1());
			this.setTAX_AMOUNT_2(struct.getTAX_AMOUNT_2());
			this.setTAX_AMOUNT_3(struct.getTAX_AMOUNT_3());
			this.setAMOUNT_INCLUDE_TAX(struct.getAMOUNT_INCLUDE_TAX());
			this.setHOME_CUR_AMOUNT(struct.getHOME_CUR_AMOUNT());
			this.setTAX_CD(struct.getTAX_CD());
			this.setTAX_ROUND_TYP(struct.getTAX_ROUND_TYP());
			this.setEXCH_RATE(struct.getEXCH_RATE());
			this.setOPR_INST_START_DATE(struct.getOPR_INST_START_DATE());
			this.setWORK_ODR_DLV_DATE(struct.getWORK_ODR_DLV_DATE());
			this.setOWN_PERSON_NAME(struct.getOWN_PERSON_NAME());
			this.setEXCH_TYP(struct.getEXCH_TYP());
			this.setCUR_CD(struct.getCUR_CD());
			this.setVEND_DECIMAL_FIG(struct.getVEND_DECIMAL_FIG());
			this.setMIN_PROC_NO(struct.getMIN_PROC_NO());
			this.setEFF_PHASE_IN_DATE(struct.getEFF_PHASE_IN_DATE());
			this.setWORK_STS_TYP(struct.getWORK_STS_TYP());
			this.setCHECK_MODIFY_COUNT(struct.getCHECK_MODIFY_COUNT());
			this.setVEND_ANAME(struct.getVEND_ANAME());
			this.setMANHOUR_TYP(struct.getMANHOUR_TYP());
			this.setSPOIL_FLG(struct.getSPOIL_FLG());
			this.setl_COUNT(struct.getl_COUNT());
			this.setROW_COUNT(struct.getROW_COUNT());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AD0030030Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_OPR_RSLT_TYP_DN(struct.getList_OPR_RSLT_TYP_DN());
			this.setList_r1_FILTER1(struct.getList_r1_FILTER1());
			this.setList_c_OUTPUT_RSLT(struct.getList_c_OUTPUT_RSLT());
			this.setList_r2_FILTER1(struct.getList_r2_FILTER1());
			this.setList_c_OUTSIDE_TYP_IN(struct.getList_c_OUTSIDE_TYP_IN());
			this.setList_c_OUTSIDE_TYP_OUT(struct.getList_c_OUTSIDE_TYP_OUT());
			this.setList_OUTSIDE_TYP_DN(struct.getList_OUTSIDE_TYP_DN());
			this.setList_OPR_INST_START_TIME(struct.getList_OPR_INST_START_TIME());
			this.setList_WORK_ODR_DLV_TIME(struct.getList_WORK_ODR_DLV_TIME());
			this.setList_ODINFO_DISGUISE(struct.getList_ODINFO_DISGUISE());
			this.setList_WORK_ODR_DLV_DATE_01(struct.getList_WORK_ODR_DLV_DATE_01());
			this.setList_OPR_INST_START_DATE_01(struct.getList_OPR_INST_START_DATE_01());
			this.setList_TIME_CTRL(struct.getList_TIME_CTRL());
			this.setList_OPR_INST_CD(struct.getList_OPR_INST_CD());
			this.setList_WORK_ODR_CD(struct.getList_WORK_ODR_CD());
			this.setList_WORK_IN_PROC_CD(struct.getList_WORK_IN_PROC_CD());
			this.setList_PROC_NAME(struct.getList_PROC_NAME());
			this.setList_PROC_NO(struct.getList_PROC_NO());
			this.setList_l_JOB_ODR_CD(struct.getList_l_JOB_ODR_CD());
			this.setList_l_ITEM_CD(struct.getList_l_ITEM_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_l_WS_CD(struct.getList_l_WS_CD());
			this.setList_WS_NAME(struct.getList_WS_NAME());
			this.setList_l_VEND_CD(struct.getList_l_VEND_CD());
			this.setList_l_VEND_ANAME(struct.getList_l_VEND_ANAME());
			this.setList_l_WORK_ODR_DLV_DATE(struct.getList_l_WORK_ODR_DLV_DATE());
			this.setList_l_OPR_INST_START_DATE(struct.getList_l_OPR_INST_START_DATE());
			this.setList_OPR_INST_QTY(struct.getList_OPR_INST_QTY());
			this.setList_WORK_IN_PROC_COMMENT(struct.getList_WORK_IN_PROC_COMMENT());
			this.setList_OUTSIDE_TYP(struct.getList_OUTSIDE_TYP());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_l_OPR_RSLT_TYP(struct.getList_l_OPR_RSLT_TYP());
			this.setList_h_MODIFY_COUNT(struct.getList_h_MODIFY_COUNT());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_HIDDEN_OPR_RSLT_TYP(struct.getList_HIDDEN_OPR_RSLT_TYP());
			this.setList_h1_WS_CD(struct.getList_h1_WS_CD());
			this.setList_HIDDEN_OUTSIDE_TYP(struct.getList_HIDDEN_OUTSIDE_TYP());
			this.setList_HIDDEN_OPR_RSLT_TYP2(struct.getList_HIDDEN_OPR_RSLT_TYP2());
			this.setList_h2_WS_CD(struct.getList_h2_WS_CD());
			this.setList_HIDDEN_OUTSIDE_TYP2(struct.getList_HIDDEN_OUTSIDE_TYP2());
			this.setList_HIDDEN_OPR_RSLT_TYP3(struct.getList_HIDDEN_OPR_RSLT_TYP3());
			this.setList_h_VEND_CD(struct.getList_h_VEND_CD());
			this.setList_WH_CD(struct.getList_WH_CD());
			this.setList_OPR_INST_DATE(struct.getList_OPR_INST_DATE());
			this.setList_BUSINESS_OPR_DATE(struct.getList_BUSINESS_OPR_DATE());
			this.setList_OD_NO(struct.getList_OD_NO());
			this.setList_PS_EDITION(struct.getList_PS_EDITION());
			this.setList_PS_UNIT_QTY(struct.getList_PS_UNIT_QTY());
			this.setList_PARENT_OD_NO(struct.getList_PARENT_OD_NO());
			this.setList_MRP_ODR_TYP(struct.getList_MRP_ODR_TYP());
			this.setList_ISSUE_TYP(struct.getList_ISSUE_TYP());
			this.setList_DUE_DATE(struct.getList_DUE_DATE());
			this.setList_PS_UNIT_DENOMINATOR(struct.getList_PS_UNIT_DENOMINATOR());
			this.setList_PS_UNIT_NUMERATOR(struct.getList_PS_UNIT_NUMERATOR());
			this.setList_PS_SPOIL(struct.getList_PS_SPOIL());
			this.setList_ISSUE_INST_CD(struct.getList_ISSUE_INST_CD());
			this.setList_PUCH_ODR_CD(struct.getList_PUCH_ODR_CD());
			this.setList_ISSUE_INST_UNIT_QTY(struct.getList_ISSUE_INST_UNIT_QTY());
			this.setList_ISSUE_INST_UNIT_DENOMINATOR(struct.getList_ISSUE_INST_UNIT_DENOMINATOR());
			this.setList_ISSUE_INST_UNIT_NUMERATOR(struct.getList_ISSUE_INST_UNIT_NUMERATOR());
			this.setList_ISSUE_INST_QTY(struct.getList_ISSUE_INST_QTY());
			this.setList_TOTAL_ISSUE_QTY(struct.getList_TOTAL_ISSUE_QTY());
			this.setList_SCDL_ISSUE_DATE(struct.getList_SCDL_ISSUE_DATE());
			this.setList_ISSUE_CMPLT_DATE(struct.getList_ISSUE_CMPLT_DATE());
			this.setList_ISSUE_CMPLT_FLG(struct.getList_ISSUE_CMPLT_FLG());
			this.setList_ISSUE_INST_ISS_FLG(struct.getList_ISSUE_INST_ISS_FLG());
			this.setList_ISSUE_INST_ISS_DATE(struct.getList_ISSUE_INST_ISS_DATE());
			this.setList_ISSUE_INST_COMMENT(struct.getList_ISSUE_INST_COMMENT());
			this.setList_WS_CD(struct.getList_WS_CD());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_CONS_TYP(struct.getList_CONS_TYP());
			this.setList_UNIT_QTY_TYP(struct.getList_UNIT_QTY_TYP());
			this.setList_PUCH_ODR_PERSON(struct.getList_PUCH_ODR_PERSON());
			this.setList_PUCH_ODR_START_DATE(struct.getList_PUCH_ODR_START_DATE());
			this.setList_PUCH_ODR_DLV_DATE(struct.getList_PUCH_ODR_DLV_DATE());
			this.setList_PUCH_ODR_QTY(struct.getList_PUCH_ODR_QTY());
			this.setList_UNIT_COST_TYP(struct.getList_UNIT_COST_TYP());
			this.setList_UNIT_COST(struct.getList_UNIT_COST());
			this.setList_PROCESSING_COST(struct.getList_PROCESSING_COST());
			this.setList_MATERIAL_COST(struct.getList_MATERIAL_COST());
			this.setList_OTHER_OVERHEADS(struct.getList_OTHER_OVERHEADS());
			this.setList_DISC_AMOUNT(struct.getList_DISC_AMOUNT());
			this.setList_PUCH_ODR_AMOUNT(struct.getList_PUCH_ODR_AMOUNT());
			this.setList_PUCH_ODR_INST_DATE(struct.getList_PUCH_ODR_INST_DATE());
			this.setList_SPL_ITEM_TYP(struct.getList_SPL_ITEM_TYP());
			this.setList_ACPT_INSPC_TYP(struct.getList_ACPT_INSPC_TYP());
			this.setList_PUCH_ODR_COMMENT(struct.getList_PUCH_ODR_COMMENT());
			this.setList_RATE_JUDGE_DATE(struct.getList_RATE_JUDGE_DATE());
			this.setList_TAX_RATE_1(struct.getList_TAX_RATE_1());
			this.setList_TAX_RATE_2(struct.getList_TAX_RATE_2());
			this.setList_TAX_RATE_3(struct.getList_TAX_RATE_3());
			this.setList_NET_AMOUNT(struct.getList_NET_AMOUNT());
			this.setList_TAX_AMOUNT_1(struct.getList_TAX_AMOUNT_1());
			this.setList_TAX_AMOUNT_2(struct.getList_TAX_AMOUNT_2());
			this.setList_TAX_AMOUNT_3(struct.getList_TAX_AMOUNT_3());
			this.setList_AMOUNT_INCLUDE_TAX(struct.getList_AMOUNT_INCLUDE_TAX());
			this.setList_HOME_CUR_AMOUNT(struct.getList_HOME_CUR_AMOUNT());
			this.setList_TAX_CD(struct.getList_TAX_CD());
			this.setList_TAX_ROUND_TYP(struct.getList_TAX_ROUND_TYP());
			this.setList_EXCH_RATE(struct.getList_EXCH_RATE());
			this.setList_OPR_INST_START_DATE(struct.getList_OPR_INST_START_DATE());
			this.setList_WORK_ODR_DLV_DATE(struct.getList_WORK_ODR_DLV_DATE());
			this.setList_OWN_PERSON_NAME(struct.getList_OWN_PERSON_NAME());
			this.setList_EXCH_TYP(struct.getList_EXCH_TYP());
			this.setList_CUR_CD(struct.getList_CUR_CD());
			this.setList_VEND_DECIMAL_FIG(struct.getList_VEND_DECIMAL_FIG());
			this.setList_MIN_PROC_NO(struct.getList_MIN_PROC_NO());
			this.setList_EFF_PHASE_IN_DATE(struct.getList_EFF_PHASE_IN_DATE());
			this.setList_WORK_STS_TYP(struct.getList_WORK_STS_TYP());
			this.setList_CHECK_MODIFY_COUNT(struct.getList_CHECK_MODIFY_COUNT());
			this.setList_VEND_ANAME(struct.getList_VEND_ANAME());
			this.setList_MANHOUR_TYP(struct.getList_MANHOUR_TYP());
			this.setList_SPOIL_FLG(struct.getList_SPOIL_FLG());
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
	// 第 1 変数初期値： i_OPR_RSLT_TYP_DN


	final static String i_OPR_RSLT_TYP_DN = null;

	// 第 2 変数初期値： i_r1_FILTER1


	final static String i_r1_FILTER1 = null;

	// 第 3 変数初期値： i_c_OUTPUT_RSLT


	final static String i_c_OUTPUT_RSLT = null;

	// 第 4 変数初期値： i_r2_FILTER1


	final static String i_r2_FILTER1 = null;

	// 第 5 変数初期値： i_c_OUTSIDE_TYP_IN


	final static String i_c_OUTSIDE_TYP_IN = null;

	// 第 6 変数初期値： i_c_OUTSIDE_TYP_OUT


	final static String i_c_OUTSIDE_TYP_OUT = null;

	// 第 7 変数初期値： i_OUTSIDE_TYP_DN


	final static String i_OUTSIDE_TYP_DN = null;

	// 第 8 変数初期値： i_OPR_INST_START_TIME


	final static String i_OPR_INST_START_TIME = null;

	// 第 9 変数初期値： i_WORK_ODR_DLV_TIME


	final static String i_WORK_ODR_DLV_TIME = null;

	// 第 10 変数初期値： i_ODINFO_DISGUISE


	final static String i_ODINFO_DISGUISE = null;

	// 第 11 変数初期値： i_WORK_ODR_DLV_DATE_01


	final static String i_WORK_ODR_DLV_DATE_01 = null;

	// 第 12 変数初期値： i_OPR_INST_START_DATE_01


	final static String i_OPR_INST_START_DATE_01 = null;

	// 第 13 変数初期値： i_TIME_CTRL


	final static String i_TIME_CTRL = null;

	// 第 14 変数初期値： i_OPR_INST_CD


	final static String i_OPR_INST_CD = null;

	// 第 15 変数初期値： i_WORK_ODR_CD


	final static String i_WORK_ODR_CD = null;

	// 第 16 変数初期値： i_WORK_IN_PROC_CD


	final static String i_WORK_IN_PROC_CD = null;

	// 第 17 変数初期値： i_PROC_NAME


	final static String i_PROC_NAME = null;

	// 第 18 変数初期値： i_PROC_NO


	final static String i_PROC_NO = null;

	// 第 19 変数初期値： i_l_JOB_ODR_CD


	final static String i_l_JOB_ODR_CD = null;

	// 第 20 変数初期値： i_l_ITEM_CD


	final static String i_l_ITEM_CD = null;

	// 第 21 変数初期値： i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// 第 22 変数初期値： i_l_WS_CD


	final static String i_l_WS_CD = null;

	// 第 23 変数初期値： i_WS_NAME


	final static String i_WS_NAME = null;

	// 第 24 変数初期値： i_l_VEND_CD


	final static String i_l_VEND_CD = null;

	// 第 25 変数初期値： i_l_VEND_ANAME


	final static String i_l_VEND_ANAME = null;

	// 第 26 変数初期値： i_l_WORK_ODR_DLV_DATE


	final static String i_l_WORK_ODR_DLV_DATE = null;

	// 第 27 変数初期値： i_l_OPR_INST_START_DATE


	final static String i_l_OPR_INST_START_DATE = null;

	// 第 28 変数初期値： i_OPR_INST_QTY


	final static String i_OPR_INST_QTY = null;

	// 第 29 変数初期値： i_WORK_IN_PROC_COMMENT


	final static String i_WORK_IN_PROC_COMMENT = null;

	// 第 30 変数初期値： i_OUTSIDE_TYP


	final static String i_OUTSIDE_TYP = null;

	// 第 31 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

	// 第 32 変数初期値： i_l_OPR_RSLT_TYP


	final static String i_l_OPR_RSLT_TYP = null;

	// 第 33 変数初期値： i_h_MODIFY_COUNT


	final static String i_h_MODIFY_COUNT = null;

	// 第 34 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 35 変数初期値： i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// 第 36 変数初期値： i_HIDDEN_OPR_RSLT_TYP


	final static String i_HIDDEN_OPR_RSLT_TYP = null;

	// 第 37 変数初期値： i_h1_WS_CD


	final static String i_h1_WS_CD = null;

	// 第 38 変数初期値： i_HIDDEN_OUTSIDE_TYP


	final static String i_HIDDEN_OUTSIDE_TYP = null;

	// 第 39 変数初期値： i_HIDDEN_OPR_RSLT_TYP2


	final static String i_HIDDEN_OPR_RSLT_TYP2 = null;

	// 第 40 変数初期値： i_h2_WS_CD


	final static String i_h2_WS_CD = null;

	// 第 41 変数初期値： i_HIDDEN_OUTSIDE_TYP2


	final static String i_HIDDEN_OUTSIDE_TYP2 = null;

	// 第 42 変数初期値： i_HIDDEN_OPR_RSLT_TYP3


	final static String i_HIDDEN_OPR_RSLT_TYP3 = null;

	// 第 43 変数初期値： i_h_VEND_CD


	final static String i_h_VEND_CD = null;

	// 第 44 変数初期値： i_WH_CD


	final static String i_WH_CD = null;

	// 第 45 変数初期値： i_OPR_INST_DATE


	final static String i_OPR_INST_DATE = null;

	// 第 46 変数初期値： i_BUSINESS_OPR_DATE


	final static String i_BUSINESS_OPR_DATE = null;

	// 第 47 変数初期値： i_OD_NO


	final static String i_OD_NO = null;

	// 第 48 変数初期値： i_PS_EDITION


	final static String i_PS_EDITION = null;

	// 第 49 変数初期値： i_PS_UNIT_QTY


	final static String i_PS_UNIT_QTY = null;

	// 第 50 変数初期値： i_PARENT_OD_NO


	final static String i_PARENT_OD_NO = null;

	// 第 51 変数初期値： i_MRP_ODR_TYP


	final static String i_MRP_ODR_TYP = null;

	// 第 52 変数初期値： i_ISSUE_TYP


	final static String i_ISSUE_TYP = null;

	// 第 53 変数初期値： i_DUE_DATE


	final static String i_DUE_DATE = null;

	// 第 54 変数初期値： i_PS_UNIT_DENOMINATOR


	final static String i_PS_UNIT_DENOMINATOR = null;

	// 第 55 変数初期値： i_PS_UNIT_NUMERATOR


	final static String i_PS_UNIT_NUMERATOR = null;

	// 第 56 変数初期値： i_PS_SPOIL


	final static String i_PS_SPOIL = null;

	// 第 57 変数初期値： i_ISSUE_INST_CD


	final static String i_ISSUE_INST_CD = null;

	// 第 58 変数初期値： i_PUCH_ODR_CD


	final static String i_PUCH_ODR_CD = null;

	// 第 59 変数初期値： i_ISSUE_INST_UNIT_QTY


	final static String i_ISSUE_INST_UNIT_QTY = null;

	// 第 60 変数初期値： i_ISSUE_INST_UNIT_DENOMINATOR


	final static String i_ISSUE_INST_UNIT_DENOMINATOR = null;

	// 第 61 変数初期値： i_ISSUE_INST_UNIT_NUMERATOR


	final static String i_ISSUE_INST_UNIT_NUMERATOR = null;

	// 第 62 変数初期値： i_ISSUE_INST_QTY


	final static String i_ISSUE_INST_QTY = null;

	// 第 63 変数初期値： i_TOTAL_ISSUE_QTY


	final static String i_TOTAL_ISSUE_QTY = null;

	// 第 64 変数初期値： i_SCDL_ISSUE_DATE


	final static String i_SCDL_ISSUE_DATE = null;

	// 第 65 変数初期値： i_ISSUE_CMPLT_DATE


	final static String i_ISSUE_CMPLT_DATE = null;

	// 第 66 変数初期値： i_ISSUE_CMPLT_FLG


	final static String i_ISSUE_CMPLT_FLG = null;

	// 第 67 変数初期値： i_ISSUE_INST_ISS_FLG


	final static String i_ISSUE_INST_ISS_FLG = null;

	// 第 68 変数初期値： i_ISSUE_INST_ISS_DATE


	final static String i_ISSUE_INST_ISS_DATE = null;

	// 第 69 変数初期値： i_ISSUE_INST_COMMENT


	final static String i_ISSUE_INST_COMMENT = null;

	// 第 70 変数初期値： i_WS_CD


	final static String i_WS_CD = null;

	// 第 71 変数初期値： i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// 第 72 変数初期値： i_VEND_CD


	final static String i_VEND_CD = null;

	// 第 73 変数初期値： i_CONS_TYP


	final static String i_CONS_TYP = null;

	// 第 74 変数初期値： i_UNIT_QTY_TYP


	final static String i_UNIT_QTY_TYP = null;

	// 第 75 変数初期値： i_PUCH_ODR_PERSON


	final static String i_PUCH_ODR_PERSON = null;

	// 第 76 変数初期値： i_PUCH_ODR_START_DATE


	final static String i_PUCH_ODR_START_DATE = null;

	// 第 77 変数初期値： i_PUCH_ODR_DLV_DATE


	final static String i_PUCH_ODR_DLV_DATE = null;

	// 第 78 変数初期値： i_PUCH_ODR_QTY


	final static String i_PUCH_ODR_QTY = null;

	// 第 79 変数初期値： i_UNIT_COST_TYP


	final static String i_UNIT_COST_TYP = null;

	// 第 80 変数初期値： i_UNIT_COST


	final static String i_UNIT_COST = null;

	// 第 81 変数初期値： i_PROCESSING_COST


	final static String i_PROCESSING_COST = null;

	// 第 82 変数初期値： i_MATERIAL_COST


	final static String i_MATERIAL_COST = null;

	// 第 83 変数初期値： i_OTHER_OVERHEADS


	final static String i_OTHER_OVERHEADS = null;

	// 第 84 変数初期値： i_DISC_AMOUNT


	final static String i_DISC_AMOUNT = null;

	// 第 85 変数初期値： i_PUCH_ODR_AMOUNT


	final static String i_PUCH_ODR_AMOUNT = null;

	// 第 86 変数初期値： i_PUCH_ODR_INST_DATE


	final static String i_PUCH_ODR_INST_DATE = null;

	// 第 87 変数初期値： i_SPL_ITEM_TYP


	final static String i_SPL_ITEM_TYP = null;

	// 第 88 変数初期値： i_ACPT_INSPC_TYP


	final static String i_ACPT_INSPC_TYP = null;

	// 第 89 変数初期値： i_PUCH_ODR_COMMENT


	final static String i_PUCH_ODR_COMMENT = null;

	// 第 90 変数初期値： i_RATE_JUDGE_DATE


	final static String i_RATE_JUDGE_DATE = null;

	// 第 91 変数初期値： i_TAX_RATE_1


	final static String i_TAX_RATE_1 = null;

	// 第 92 変数初期値： i_TAX_RATE_2


	final static String i_TAX_RATE_2 = null;

	// 第 93 変数初期値： i_TAX_RATE_3


	final static String i_TAX_RATE_3 = null;

	// 第 94 変数初期値： i_NET_AMOUNT


	final static String i_NET_AMOUNT = null;

	// 第 95 変数初期値： i_TAX_AMOUNT_1


	final static String i_TAX_AMOUNT_1 = null;

	// 第 96 変数初期値： i_TAX_AMOUNT_2


	final static String i_TAX_AMOUNT_2 = null;

	// 第 97 変数初期値： i_TAX_AMOUNT_3


	final static String i_TAX_AMOUNT_3 = null;

	// 第 98 変数初期値： i_AMOUNT_INCLUDE_TAX


	final static String i_AMOUNT_INCLUDE_TAX = null;

	// 第 99 変数初期値： i_HOME_CUR_AMOUNT


	final static String i_HOME_CUR_AMOUNT = null;

	// 第 100 変数初期値： i_TAX_CD


	final static String i_TAX_CD = null;

	// 第 101 変数初期値： i_TAX_ROUND_TYP


	final static String i_TAX_ROUND_TYP = null;

	// 第 102 変数初期値： i_EXCH_RATE


	final static String i_EXCH_RATE = null;

	// 第 103 変数初期値： i_OPR_INST_START_DATE


	final static String i_OPR_INST_START_DATE = null;

	// 第 104 変数初期値： i_WORK_ODR_DLV_DATE


	final static String i_WORK_ODR_DLV_DATE = null;

	// 第 105 変数初期値： i_OWN_PERSON_NAME


	final static String i_OWN_PERSON_NAME = null;

	// 第 106 変数初期値： i_EXCH_TYP


	final static String i_EXCH_TYP = null;

	// 第 107 変数初期値： i_CUR_CD


	final static String i_CUR_CD = null;

	// 第 108 変数初期値： i_VEND_DECIMAL_FIG


	final static String i_VEND_DECIMAL_FIG = null;

	// 第 109 変数初期値： i_MIN_PROC_NO


	final static String i_MIN_PROC_NO = null;

	// 第 110 変数初期値： i_EFF_PHASE_IN_DATE


	final static String i_EFF_PHASE_IN_DATE = null;

	// 第 111 変数初期値： i_WORK_STS_TYP


	final static String i_WORK_STS_TYP = null;

	// 第 112 変数初期値： i_CHECK_MODIFY_COUNT


	final static String i_CHECK_MODIFY_COUNT = null;

	// 第 113 変数初期値： i_VEND_ANAME


	final static String i_VEND_ANAME = null;

	// 第 114 変数初期値： i_MANHOUR_TYP


	final static String i_MANHOUR_TYP = null;

	// 第 115 変数初期値： i_SPOIL_FLG


	final static String i_SPOIL_FLG = null;

	// 第 116 変数初期値： i_l_COUNT


	final static String i_l_COUNT = null;

	// 第 117 変数初期値： i_ROW_COUNT


	final static String i_ROW_COUNT = null;

*/

	//{{user_implement_code
		// TODO: 初期化で使う定数は、ここに記述してください。
		// 以下に記述した内容は自動的には変更されません。
	// 第 1 変数初期値： i_OPR_INST_CD
	final static String i_OPR_INST_CD = null;
	// 第 2 変数初期値： i_WORK_ODR_CD
	final static String i_WORK_ODR_CD = null;
	// 第 3 変数初期値： i_WORK_IN_PROC_CD
	final static String i_WORK_IN_PROC_CD = null;
	// 第 4 変数初期値： i_PROC_NAME
	final static String i_PROC_NAME = null;
	// 第 5 変数初期値： i_PROC_NO
	final static String i_PROC_NO = null;
	// 第 6 変数初期値： i_l_JOB_ODR_CD
	final static String i_l_JOB_ODR_CD = null;
	// 第 7 変数初期値： i_l_ITEM_CD
	final static String i_l_ITEM_CD = null;
	// 第 8 変数初期値： i_ITEM_NAME
	final static String i_ITEM_NAME = null;
	// 第 9 変数初期値： i_l_WS_CD
	final static String i_l_WS_CD = null;
	// 第 10 変数初期値： i_WS_NAME
	final static String i_WS_NAME = null;
	// 第 11 変数初期値： i_l_VEND_CD
	final static String i_l_VEND_CD = null;
	// 第 12 変数初期値： i_l_VEND_ANAME
	final static String i_l_VEND_ANAME = null;
	// 第 13 変数初期値： i_l_WORK_ODR_DLV_DATE
	final static String i_l_WORK_ODR_DLV_DATE = null;
	// 第 14 変数初期値： i_l_OPR_INST_START_DATE
	final static String i_l_OPR_INST_START_DATE = null;
	// 第 15 変数初期値： i_OPR_INST_QTY
	final static String i_OPR_INST_QTY = null;
	// 第 16 変数初期値： i_WORK_IN_PROC_COMMENT
	final static String i_WORK_IN_PROC_COMMENT = null;
	// 第 17 変数初期値： i_OUTSIDE_TYP
	final static String i_OUTSIDE_TYP = null;
	// 第 18 変数初期値： i_PLANT_CD
	final static String i_PLANT_CD = null;
	// 第 19 変数初期値： i_l_OPR_RSLT_TYP
	final static String i_l_OPR_RSLT_TYP = null;
	// 第 20 変数初期値： i_h_MODIFY_COUNT
	final static String i_h_MODIFY_COUNT = null;
	// 第 21 変数初期値： i_OPR_RSLT_TYP_DN
	final static String i_OPR_RSLT_TYP_DN = null;
	// 第 22 変数初期値： i_OUTSIDE_TYP_DN
	final static String i_OUTSIDE_TYP_DN = null;
	// 第 23 変数初期値： i_WORK_ODR_DLV_DATE
	final static String i_WORK_ODR_DLV_DATE = null;
	// 第 24 変数初期値： i_OPR_INST_START_DATE
	final static String i_OPR_INST_START_DATE = null;
	// 第 25 変数初期値： i_ITEM_CD
	final static String i_ITEM_CD = null;
	// 第 26 変数初期値： i_JOB_ODR_CD
	final static String i_JOB_ODR_CD = null;
	// 第 27 変数初期値： i_HIDDEN_OPR_RSLT_TYP
	final static String i_HIDDEN_OPR_RSLT_TYP = null;
	// 第 28 変数初期値： i_h1_WS_CD
	final static String i_h1_WS_CD = null;
	// 第 29 変数初期値： i_HIDDEN_OUTSIDE_TYP
	final static String i_HIDDEN_OUTSIDE_TYP = null;
	// 第 30 変数初期値： i_HIDDEN_OPR_RSLT_TYP2
	final static String i_HIDDEN_OPR_RSLT_TYP2 = null;
	// 第 31 変数初期値： i_h2_WS_CD
	final static String i_h2_WS_CD = null;
	// 第 32 変数初期値： i_HIDDEN_OUTSIDE_TYP2
	final static String i_HIDDEN_OUTSIDE_TYP2 = null;
	// 第 33 変数初期値： i_HIDDEN_OPR_RSLT_TYP3
	final static String i_HIDDEN_OPR_RSLT_TYP3 = null;
	// 第 34 変数初期値： i_h_VEND_CD
	final static String i_h_VEND_CD = null;
	// 第 35 変数初期値： i_WH_CD
	final static String i_WH_CD = null;
	// 第 36 変数初期値： i_OPR_INST_DATE
	final static String i_OPR_INST_DATE = null;
	// 第 37 変数初期値： i_BUSINESS_OPR_DATE
	final static String i_BUSINESS_OPR_DATE = null;
	// 第 38 変数初期値： i_OD_NO
	final static String i_OD_NO = null;
	// 第 39 変数初期値： i_PS_EDITION
	final static String i_PS_EDITION = null;
	// 第 40 変数初期値： i_PS_UNIT_QTY
	final static String i_PS_UNIT_QTY = null;
	// 第 41 変数初期値： i_PARENT_OD_NO
	final static String i_PARENT_OD_NO = null;
	// 第 42 変数初期値： i_MRP_ODR_TYP
	final static String i_MRP_ODR_TYP = null;
	// 第 43 変数初期値： i_ISSUE_TYP
	final static String i_ISSUE_TYP = null;
	// 第 44 変数初期値： i_PS_UNIT_DENOMINATOR
	final static String i_PS_UNIT_DENOMINATOR = null;
	// 第 45 変数初期値： i_PS_UNIT_NUMERATOR
	final static String i_PS_UNIT_NUMERATOR = null;
	// 第 46 変数初期値： i_ISSUE_INST_CD
	final static String i_ISSUE_INST_CD = null;
	// 第 47 変数初期値： i_PUCH_ODR_CD
	final static String i_PUCH_ODR_CD = null;
	// 第 48 変数初期値： i_ISSUE_INST_UNIT_QTY
	final static String i_ISSUE_INST_UNIT_QTY = null;
	// 第 49 変数初期値： i_ISSUE_INST_UNIT_DENOMINATOR
	final static String i_ISSUE_INST_UNIT_DENOMINATOR = null;
	// 第 50 変数初期値： i_ISSUE_INST_UNIT_NUMERATOR
	final static String i_ISSUE_INST_UNIT_NUMERATOR = null;
	// 第 51 変数初期値： i_ISSUE_INST_QTY
	final static String i_ISSUE_INST_QTY = null;
	// 第 52 変数初期値： i_TOTAL_ISSUE_QTY
	final static String i_TOTAL_ISSUE_QTY = null;
	// 第 53 変数初期値： i_SCDL_ISSUE_DATE
	final static String i_SCDL_ISSUE_DATE = null;
	// 第 54 変数初期値： i_ISSUE_CMPLT_DATE
	final static String i_ISSUE_CMPLT_DATE = null;
	// 第 55 変数初期値： i_ISSUE_CMPLT_FLG
	final static String i_ISSUE_CMPLT_FLG = null;
	// 第 56 変数初期値： i_ISSUE_INST_ISS_FLG
	final static String i_ISSUE_INST_ISS_FLG = null;
	// 第 57 変数初期値： i_ISSUE_INST_ISS_DATE
	final static String i_ISSUE_INST_ISS_DATE = null;
	// 第 58 変数初期値： i_ISSUE_INST_COMMENT
	final static String i_ISSUE_INST_COMMENT = null;
	// 第 59 変数初期値： i_WS_CD
	final static String i_WS_CD = null;
	// 第 60 変数初期値： i_COMPANY_CD
	final static String i_COMPANY_CD = null;
	// 第 61 変数初期値： i_VEND_CD
	final static String i_VEND_CD = null;
	// 第 62 変数初期値： i_CONS_TYP
	final static String i_CONS_TYP = null;
	// 第 63 変数初期値： i_UNIT_QTY_TYP
	final static String i_UNIT_QTY_TYP = null;
	// 第 64 変数初期値： i_PUCH_ODR_PERSON
	final static String i_PUCH_ODR_PERSON = null;
	// 第 65 変数初期値： i_PUCH_ODR_START_DATE
	final static String i_PUCH_ODR_START_DATE = null;
	// 第 66 変数初期値： i_PUCH_ODR_DLV_DATE
	final static String i_PUCH_ODR_DLV_DATE = null;
	// 第 67 変数初期値： i_PUCH_ODR_QTY
	final static String i_PUCH_ODR_QTY = null;
	// 第 68 変数初期値： i_UNIT_COST_TYP
	final static String i_UNIT_COST_TYP = null;
	// 第 69 変数初期値： i_UNIT_COST
	final static String i_UNIT_COST = null;
	// 第 70 変数初期値： i_PROCESSING_COST
	final static String i_PROCESSING_COST = null;
	// 第 71 変数初期値： i_MATERIAL_COST
	final static String i_MATERIAL_COST = null;
	// 第 72 変数初期値： i_OTHER_OVERHEADS
	final static String i_OTHER_OVERHEADS = null;
	// 第 73 変数初期値： i_DISC_AMOUNT
	final static String i_DISC_AMOUNT = null;
	// 第 74 変数初期値： i_PUCH_ODR_AMOUNT
	final static String i_PUCH_ODR_AMOUNT = null;
	// 第 75 変数初期値： i_PUCH_ODR_INST_DATE
	final static String i_PUCH_ODR_INST_DATE = null;
	// 第 76 変数初期値： i_SPL_ITEM_TYP
	final static String i_SPL_ITEM_TYP = null;
	// 第 77 変数初期値： i_ACPT_INSPC_TYP
	final static String i_ACPT_INSPC_TYP = null;
	// 第 78 変数初期値： i_PUCH_ODR_COMMENT
	final static String i_PUCH_ODR_COMMENT = null;
	// 第 79 変数初期値： i_RATE_JUDGE_DATE
	final static String i_RATE_JUDGE_DATE = null;
	// 第 80 変数初期値： i_TAX_RATE_1
	final static String i_TAX_RATE_1 = null;
	// 第 81 変数初期値： i_TAX_RATE_2
	final static String i_TAX_RATE_2 = null;
	// 第 82 変数初期値： i_TAX_RATE_3
	final static String i_TAX_RATE_3 = null;
	// 第 83 変数初期値： i_NET_AMOUNT
	final static String i_NET_AMOUNT = null;
	// 第 84 変数初期値： i_TAX_AMOUNT_1
	final static String i_TAX_AMOUNT_1 = null;
	// 第 85 変数初期値： i_TAX_AMOUNT_2
	final static String i_TAX_AMOUNT_2 = null;
	// 第 86 変数初期値： i_TAX_AMOUNT_3
	final static String i_TAX_AMOUNT_3 = null;
	// 第 87 変数初期値： i_AMOUNT_INCLUDE_TAX
	final static String i_AMOUNT_INCLUDE_TAX = null;
	// 第 88 変数初期値： i_HOME_CUR_AMOUNT
	final static String i_HOME_CUR_AMOUNT = null;
	// 第 89 変数初期値： i_TAX_CD
	final static String i_TAX_CD = null;
	// 第 90 変数初期値： i_TAX_ROUND_TYP
	final static String i_TAX_ROUND_TYP = null;
	// 第 91 変数初期値： i_EXCH_RATE
	final static String i_EXCH_RATE = null;
	// 第 92 変数初期値： i_OWN_PERSON_NAME
	final static String i_OWN_PERSON_NAME = null;
	// 第 93 変数初期値： i_EXCH_TYP
	final static String i_EXCH_TYP = null;
	// 第 94 変数初期値： i_CUR_CD
	final static String i_CUR_CD = null;
	// 第 95 変数初期値： i_VEND_DECIMAL_FIG
	final static String i_VEND_DECIMAL_FIG = null;
	// 第 96 変数初期値： i_MIN_PROC_NO
	final static String i_MIN_PROC_NO = null;
	// 第 97 変数初期値： i_EFF_PHASE_IN_DATE
	final static String i_EFF_PHASE_IN_DATE = null;
	// 第 98 変数初期値： i_WORK_STS_TYP
	final static String i_WORK_STS_TYP = null;
	// 第 99 変数初期値： i_CHECK_MODIFY_COUNT
	final static String i_CHECK_MODIFY_COUNT = null;
	// 第 100 変数初期値： i_VEND_ANAME
	final static String i_VEND_ANAME = null;
	// 第 101 変数初期値： i_r1_FILTER1
	final static String i_r1_FILTER1 = null;
	// 第 102 変数初期値： i_c_OUTPUT_RSLT
	final static String i_c_OUTPUT_RSLT = null;
	// 第 103 変数初期値： i_r2_FILTER1
	final static String i_r2_FILTER1 = null;
	// 第 104 変数初期値： i_c_OUTSIDE_TYP_IN
	final static String i_c_OUTSIDE_TYP_IN = null;
	// 第 105 変数初期値： i_c_OUTSIDE_TYP_OUT
	final static String i_c_OUTSIDE_TYP_OUT = null;
	// 第 106 変数初期値： i_ODINFO_DISGUISE
	final static String i_ODINFO_DISGUISE = null;

	/**
	 * 初期化
	 *
	 */
	public void initialize()
	{

		clear();

		m_OPR_INST_CD = i_OPR_INST_CD;
		m_WORK_ODR_CD = i_WORK_ODR_CD;
		m_WORK_IN_PROC_CD = i_WORK_IN_PROC_CD;
		m_PROC_NAME = i_PROC_NAME;
		m_PROC_NO = i_PROC_NO;
		m_l_JOB_ODR_CD = i_l_JOB_ODR_CD;
		m_l_ITEM_CD = i_l_ITEM_CD;
		m_ITEM_NAME = i_ITEM_NAME;
		m_l_WS_CD = i_l_WS_CD;
		m_WS_NAME = i_WS_NAME;
		m_l_VEND_CD = i_l_VEND_CD;
		m_l_VEND_ANAME = i_l_VEND_ANAME;
		m_l_WORK_ODR_DLV_DATE = i_l_WORK_ODR_DLV_DATE;
		m_l_OPR_INST_START_DATE = i_l_OPR_INST_START_DATE;
		m_OPR_INST_QTY = i_OPR_INST_QTY;
		m_WORK_IN_PROC_COMMENT = i_WORK_IN_PROC_COMMENT;
		m_OUTSIDE_TYP = i_OUTSIDE_TYP;
		m_PLANT_CD = i_PLANT_CD;
		m_l_OPR_RSLT_TYP = i_l_OPR_RSLT_TYP;
		m_h_MODIFY_COUNT = i_h_MODIFY_COUNT;
		m_OPR_RSLT_TYP_DN = i_OPR_RSLT_TYP_DN;
		m_OUTSIDE_TYP_DN = i_OUTSIDE_TYP_DN;
		m_WORK_ODR_DLV_DATE = i_WORK_ODR_DLV_DATE;
		m_OPR_INST_START_DATE = i_OPR_INST_START_DATE;
		m_ITEM_CD = i_ITEM_CD;
		m_JOB_ODR_CD = i_JOB_ODR_CD;
		m_HIDDEN_OPR_RSLT_TYP = i_HIDDEN_OPR_RSLT_TYP;
		m_h1_WS_CD = i_h1_WS_CD;
		m_HIDDEN_OUTSIDE_TYP = i_HIDDEN_OUTSIDE_TYP;
		m_HIDDEN_OPR_RSLT_TYP2 = i_HIDDEN_OPR_RSLT_TYP2;
		m_h2_WS_CD = i_h2_WS_CD;
		m_HIDDEN_OUTSIDE_TYP2 = i_HIDDEN_OUTSIDE_TYP2;
		m_HIDDEN_OPR_RSLT_TYP3 = i_HIDDEN_OPR_RSLT_TYP3;
		m_h_VEND_CD = i_h_VEND_CD;
		m_WH_CD = i_WH_CD;
		m_OPR_INST_DATE = i_OPR_INST_DATE;
		m_BUSINESS_OPR_DATE = i_BUSINESS_OPR_DATE;
		m_OD_NO = i_OD_NO;
		m_PS_EDITION = i_PS_EDITION;
		m_PS_UNIT_QTY = i_PS_UNIT_QTY;
		m_PARENT_OD_NO = i_PARENT_OD_NO;
		m_MRP_ODR_TYP = i_MRP_ODR_TYP;
		m_ISSUE_TYP = i_ISSUE_TYP;
		m_PS_UNIT_DENOMINATOR = i_PS_UNIT_DENOMINATOR;
		m_PS_UNIT_NUMERATOR = i_PS_UNIT_NUMERATOR;
		m_ISSUE_INST_CD = i_ISSUE_INST_CD;
		m_PUCH_ODR_CD = i_PUCH_ODR_CD;
		m_ISSUE_INST_UNIT_QTY = i_ISSUE_INST_UNIT_QTY;
		m_ISSUE_INST_UNIT_DENOMINATOR = i_ISSUE_INST_UNIT_DENOMINATOR;
		m_ISSUE_INST_UNIT_NUMERATOR = i_ISSUE_INST_UNIT_NUMERATOR;
		m_ISSUE_INST_QTY = i_ISSUE_INST_QTY;
		m_TOTAL_ISSUE_QTY = i_TOTAL_ISSUE_QTY;
		m_SCDL_ISSUE_DATE = i_SCDL_ISSUE_DATE;
		m_ISSUE_CMPLT_DATE = i_ISSUE_CMPLT_DATE;
		m_ISSUE_CMPLT_FLG = i_ISSUE_CMPLT_FLG;
		m_ISSUE_INST_ISS_FLG = i_ISSUE_INST_ISS_FLG;
		m_ISSUE_INST_ISS_DATE = i_ISSUE_INST_ISS_DATE;
		m_ISSUE_INST_COMMENT = i_ISSUE_INST_COMMENT;
		m_WS_CD = i_WS_CD;
		m_COMPANY_CD = i_COMPANY_CD;
		m_VEND_CD = i_VEND_CD;
		m_CONS_TYP = i_CONS_TYP;
		m_UNIT_QTY_TYP = i_UNIT_QTY_TYP;
		m_PUCH_ODR_PERSON = i_PUCH_ODR_PERSON;
		m_PUCH_ODR_START_DATE = i_PUCH_ODR_START_DATE;
		m_PUCH_ODR_DLV_DATE = i_PUCH_ODR_DLV_DATE;
		m_PUCH_ODR_QTY = i_PUCH_ODR_QTY;
		m_UNIT_COST_TYP = i_UNIT_COST_TYP;
		m_UNIT_COST = i_UNIT_COST;
		m_PROCESSING_COST = i_PROCESSING_COST;
		m_MATERIAL_COST = i_MATERIAL_COST;
		m_OTHER_OVERHEADS = i_OTHER_OVERHEADS;
		m_DISC_AMOUNT = i_DISC_AMOUNT;
		m_PUCH_ODR_AMOUNT = i_PUCH_ODR_AMOUNT;
		m_PUCH_ODR_INST_DATE = i_PUCH_ODR_INST_DATE;
		m_SPL_ITEM_TYP = i_SPL_ITEM_TYP;
		m_ACPT_INSPC_TYP = i_ACPT_INSPC_TYP;
		m_PUCH_ODR_COMMENT = i_PUCH_ODR_COMMENT;
		m_RATE_JUDGE_DATE = i_RATE_JUDGE_DATE;
		m_TAX_RATE_1 = i_TAX_RATE_1;
		m_TAX_RATE_2 = i_TAX_RATE_2;
		m_TAX_RATE_3 = i_TAX_RATE_3;
		m_NET_AMOUNT = i_NET_AMOUNT;
		m_TAX_AMOUNT_1 = i_TAX_AMOUNT_1;
		m_TAX_AMOUNT_2 = i_TAX_AMOUNT_2;
		m_TAX_AMOUNT_3 = i_TAX_AMOUNT_3;
		m_AMOUNT_INCLUDE_TAX = i_AMOUNT_INCLUDE_TAX;
		m_HOME_CUR_AMOUNT = i_HOME_CUR_AMOUNT;
		m_TAX_CD = i_TAX_CD;
		m_TAX_ROUND_TYP = i_TAX_ROUND_TYP;
		m_EXCH_RATE = i_EXCH_RATE;
		m_OWN_PERSON_NAME = i_OWN_PERSON_NAME;
		m_EXCH_TYP = i_EXCH_TYP;
		m_CUR_CD = i_CUR_CD;
		m_VEND_DECIMAL_FIG = i_VEND_DECIMAL_FIG;
		m_MIN_PROC_NO = i_MIN_PROC_NO;
		m_EFF_PHASE_IN_DATE = i_EFF_PHASE_IN_DATE;
		m_WORK_STS_TYP = i_WORK_STS_TYP;
		m_CHECK_MODIFY_COUNT = i_CHECK_MODIFY_COUNT;
		m_VEND_ANAME = i_VEND_ANAME;
		m_r1_FILTER1 = i_r1_FILTER1;
		m_c_OUTPUT_RSLT = i_c_OUTPUT_RSLT;
		m_r2_FILTER1 = i_r2_FILTER1;
		m_c_OUTSIDE_TYP_IN = i_c_OUTSIDE_TYP_IN;
		m_c_OUTSIDE_TYP_OUT = i_c_OUTSIDE_TYP_OUT;
		m_ODINFO_DISGUISE = i_ODINFO_DISGUISE;
	}

		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
