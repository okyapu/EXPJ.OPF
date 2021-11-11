/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0120/src/com/nec/jp/orteus/metamorBase/AE0120/AE0120010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0120;

import com.nec.jp.orteus.xaf.wa.*;

import com.nec.jp.orteus.util.logging.*;

import java.lang.Number.*;
import java.lang.Float;
import java.util.*;
import java.sql.*;
import java.io.*;

//{{user_implement_code_import
	// TODO: ここにimportパッケージを記述してください
import java.math.BigDecimal;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AE0120010Control クラス
 * ファイル・クラス説明
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.15 $ $Date: 2015/11/16 05:10:39 $
 *
 */
//}}user_implement_code_header

public class AE0120010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_h_PUCH_ODR_CD */
	public String m_h_PUCH_ODR_CD = null;
	/** 第 2 変数： m_UNIT_COST_TYP_name */
	public String m_UNIT_COST_TYP_name = null;
	/** 第 3 変数： m_UNIT_COST_TYP_val */
	public String m_UNIT_COST_TYP_val = null;
	/** 第 4 変数： m_r1_FILTER */
	public String m_r1_FILTER = null;
	/** 第 5 変数： m_r2_FILTER */
	public String m_r2_FILTER = null;
	/** 第 6 変数： m_HOME_CUR_UNIT */
	public String m_HOME_CUR_UNIT = null;
	/** 第 7 変数： m_c_NON_NO_ITEM_FLG */
	public String m_c_NON_NO_ITEM_FLG = null;
	/** 第 8 変数： m_SelectUnitCostFlag */
	public String m_SelectUnitCostFlag = null;
	/** 第 9 変数： m_h_PUCH_RTN_DATE */
	public String m_h_PUCH_RTN_DATE = null;
	/** 第 10 変数： m_PRODUCT_TYP_name */
	public String m_PRODUCT_TYP_name = null;
	/** 第 11 変数： m_PRODUCT_TYP_val */
	public String m_PRODUCT_TYP_val = null;
	/** 第 12 変数： m_h_lotCtrl */
	public String m_h_lotCtrl = null;
	/** 第 13 変数： m_HOME_DECIMAL_FIG */
	public String m_HOME_DECIMAL_FIG = null;
	/** 第 14 変数： m_EFF_PHASE_IN_DATE */
	public String m_EFF_PHASE_IN_DATE = null;
	/** 第 15 変数： m_PUCH_SIZE */
	public String m_PUCH_SIZE = null;
	/** 第 16 変数： m_EXCH_TYP */
	public String m_EXCH_TYP = null;
	/** 第 17 変数： m_CUR_SYMBOL */
	public String m_CUR_SYMBOL = null;
	/** 第 18 変数： m_CUR_UNIT */
	public String m_CUR_UNIT = null;
	/** 第 19 変数： m_DECIMAL_FIG */
	public String m_DECIMAL_FIG = null;
	/** 第 20 変数： m_TAX_APPLY_TYP */
	public String m_TAX_APPLY_TYP = null;
	/** 第 21 変数： m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** 第 22 変数： m_VEND_CD */
	public String m_VEND_CD = null;
	/** 第 23 変数： m_VEND_ANAME */
	public String m_VEND_ANAME = null;
	/** 第 24 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** 第 25 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 26 変数： m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** 第 27 変数： m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** 第 28 変数： m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** 第 29 変数： m_JOB_ODR_DETAIL_NO */
	public String m_JOB_ODR_DETAIL_NO = null;
	/** 第 30 変数： m_INV_CTRL_FLG */
	public String m_INV_CTRL_FLG = null;
	/** 第 31 変数： m_PUCH_ODR_PERSON */
	public String m_PUCH_ODR_PERSON = null;
	/** 第 32 変数： m_PUCH_RTN_DATE */
	public String m_PUCH_RTN_DATE = null;
	/** 第 33 変数： m_PUCH_RTN_QTY */
	public String m_PUCH_RTN_QTY = null;
	/** 第 34 変数： m_WH_CD */
	public String m_WH_CD = null;
	/** 第 35 変数： m_WH_NAME */
	public String m_WH_NAME = null;
	/** 第 36 変数： m_VEND_LOT_NO */
	public String m_VEND_LOT_NO = null;
	/** 第 37 変数： m_LOT_NO */
	public String m_LOT_NO = null;
	/** 第 38 変数： m_CUR_CD */
	public String m_CUR_CD = null;
	/** 第 39 変数： m_CUR_NAME */
	public String m_CUR_NAME = null;
	/** 第 40 変数： m_VEND_CUR_UNIT */
	public String m_VEND_CUR_UNIT = null;
	/** 第 41 変数： m_VEND_DECIMAL_FIG */
	public String m_VEND_DECIMAL_FIG = null;
	/** 第 42 変数： m_USER_NAME */
	public String m_USER_NAME = null;
	/** 第 43 変数： m_UNIT_COST_TYP */
	public String m_UNIT_COST_TYP = null;
	/** 第 44 変数： m_UNIT_COST */
	public String m_UNIT_COST = null;
	/** 第 45 変数： m_PROCESSING_COST */
	public String m_PROCESSING_COST = null;
	/** 第 46 変数： m_MATERIAL_COST */
	public String m_MATERIAL_COST = null;
	/** 第 47 変数： m_OTHER_OVERHEADS */
	public String m_OTHER_OVERHEADS = null;
	/** 第 48 変数： m_PUCH_ODR_AMOUNT */
	public String m_PUCH_ODR_AMOUNT = null;
	/** 第 49 変数： m_DISC_AMOUNT */
	public String m_DISC_AMOUNT = null;
	/** 第 50 変数： m_NET_AMOUNT */
	public String m_NET_AMOUNT = null;
	/** 第 51 変数： m_PUCH_RTN_COMMENT */
	public String m_PUCH_RTN_COMMENT = null;
	/** 第 52 変数： m_RATE_JUDGE_DATE */
	public String m_RATE_JUDGE_DATE = null;
	/** 第 53 変数： m_EXCH_RATE */
	public String m_EXCH_RATE = null;
	/** 第 54 変数： m_TAX_RATE_1 */
	public String m_TAX_RATE_1 = null;
	/** 第 55 変数： m_TAX_RATE_2 */
	public String m_TAX_RATE_2 = null;
	/** 第 56 変数： m_TAX_RATE_3 */
	public String m_TAX_RATE_3 = null;
	/** 第 57 変数： m_TAX_AMOUNT_1 */
	public String m_TAX_AMOUNT_1 = null;
	/** 第 58 変数： m_TAX_AMOUNT_2 */
	public String m_TAX_AMOUNT_2 = null;
	/** 第 59 変数： m_TAX_AMOUNT_3 */
	public String m_TAX_AMOUNT_3 = null;
	/** 第 60 変数： m_AMOUNT_INCLUDE_TAX */
	public String m_AMOUNT_INCLUDE_TAX = null;
	/** 第 61 変数： m_HOME_CUR_AMOUNT */
	public String m_HOME_CUR_AMOUNT = null;
	/** 第 62 変数： m_ROUND_TYP */
	public String m_ROUND_TYP = null;
	/** 第 63 変数： m_TAX_CD */
	public String m_TAX_CD = null;
	/** 第 64 変数： m_TAX_ROUND_TYP */
	public String m_TAX_ROUND_TYP = null;
	/** 第 65 変数： m_RTN_DEL_FLG */
	public String m_RTN_DEL_FLG = null;
	/** 第 66 変数： m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** 第 67 変数： m_NON_NO_ITEM_TYP */
	public String m_NON_NO_ITEM_TYP = null;
	/** 第 68 変数： m_NON_NO_ITEM_NAME */
	public String m_NON_NO_ITEM_NAME = null;
	/** 第 69 変数： m_NON_NO_ITEM_PUCH_ODR_UNIT */
	public String m_NON_NO_ITEM_PUCH_ODR_UNIT = null;
	/** 第 70 変数： m_ITEM_TYP */
	public String m_ITEM_TYP = null;
	/** 第 71 変数： m_PUCH_ODR_CD */
	public String m_PUCH_ODR_CD = null;
	/** 第 72 変数： m_RTN_DEL_DATE */
	public String m_RTN_DEL_DATE = null;
	/** 第 73 変数： m_UNIT_QTY_TYP */
	public String m_UNIT_QTY_TYP = null;
	/** 第 74 変数： m_SPL_ITEM_TYP */
	public String m_SPL_ITEM_TYP = null;
	/** 第 75 変数： m_PRODUCT_TYP */
	public String m_PRODUCT_TYP = null;
	/** 第 76 変数： m_CLASIFICATION_CD */
	public String m_CLASIFICATION_CD = null;
	/** 第 77 変数： m_LOT_CTRL_FLG */
	public String m_LOT_CTRL_FLG = null;
	/** 第 78 変数： m_MRP_ODR_TYP */
	public String m_MRP_ODR_TYP = null;
	/** 第 79 変数： m_PUCH_ODR_CD_2 */
	public String m_PUCH_ODR_CD_2 = null;
	/** 第 80 変数： m_MRP_FLG */
	public String m_MRP_FLG = null;
	/** 第 81 変数： m_WH_TYP */
	public String m_WH_TYP = null;
	/** 第 82 変数： m_THIS_MONTH */
	public String m_THIS_MONTH = null;
	/** 第 83 変数： m_INSTALL_FLG */
	public String m_INSTALL_FLG = null;
	/** 第 84 変数： m_STOCK_ON_HAND_QTY */
	public String m_STOCK_ON_HAND_QTY = null;
	/** 第 85 変数： m_RCV_ISSUE_CTRL_CD */
	public String m_RCV_ISSUE_CTRL_CD = null;
	/** 第 86 変数： m_RCV_ISSUE_TYP */
	public String m_RCV_ISSUE_TYP = null;
	/** 第 87 変数： m_ACPT_NO */
	public String m_ACPT_NO = null;
	/** 第 88 変数： m_ACPT_RSLT_CRCT_NO */
	public String m_ACPT_RSLT_CRCT_NO = null;
	/** 第 89 変数： m_INSPEC_RSLT_CRCT_NO */
	public String m_INSPEC_RSLT_CRCT_NO = null;
	/** 第 90 変数： m_PARTIAL_PRD_NO */
	public String m_PARTIAL_PRD_NO = null;
	/** 第 91 変数： m_OPR_RSLT_CRCT_NO */
	public String m_OPR_RSLT_CRCT_NO = null;
	/** 第 92 変数： m_RCV_ISSUE_BEFORE_QTY */
	public String m_RCV_ISSUE_BEFORE_QTY = null;
	/** 第 93 変数： m_RCV_ISSUE_QTY */
	public String m_RCV_ISSUE_QTY = null;
	/** 第 94 変数： m_RCV_ISSUE_AFTER_QTY */
	public String m_RCV_ISSUE_AFTER_QTY = null;
	/** 第 95 変数： m_RCV_ISSUE_AMOUNT */
	public String m_RCV_ISSUE_AMOUNT = null;
	/** 第 96 変数： m_RCV_ISSUE_DATE */
	public String m_RCV_ISSUE_DATE = null;
	/** 第 97 変数： m_RCV_ISSUE_GNR_TYP */
	public String m_RCV_ISSUE_GNR_TYP = null;
	/** 第 98 変数： m_RCV_ISSUE_ODD_QTY */
	public String m_RCV_ISSUE_ODD_QTY = null;
	/** 第 99 変数： m_STOCK_UPD_TYP */
	public String m_STOCK_UPD_TYP = null;
	/** 第 100 変数： m_RCV_ISSUE_CMPLT_FLG */
	public String m_RCV_ISSUE_CMPLT_FLG = null;
	/** 第 101 変数： m_CONS_TYP */
	public String m_CONS_TYP = null;
	/** 第 102 変数： m_INSPC_ACPT_NO */
	public String m_INSPC_ACPT_NO = null;
	/** 第 103 変数： m_INSPC_ACPT_GNR_TYP */
	public String m_INSPC_ACPT_GNR_TYP = null;
	/** 第 104 変数： m_CRCT_NO */
	public String m_CRCT_NO = null;
	/** 第 105 変数： m_CRCT_TYP */
	public String m_CRCT_TYP = null;
	/** 第 106 変数： m_SLIP_TYP */
	public String m_SLIP_TYP = null;
	/** 第 107 変数： m_ACPT_QTY */
	public String m_ACPT_QTY = null;
	/** 第 108 変数： m_INSPC_ACPT_QTY */
	public String m_INSPC_ACPT_QTY = null;
	/** 第 109 変数： m_INSPC_ACPT_AMOUNT */
	public String m_INSPC_ACPT_AMOUNT = null;
	/** 第 110 変数： m_SAVING_AMOUNT */
	public String m_SAVING_AMOUNT = null;
	/** 第 111 変数： m_ACPT_DATE */
	public String m_ACPT_DATE = null;
	/** 第 112 変数： m_INSPC_ACPT_DATE */
	public String m_INSPC_ACPT_DATE = null;
	/** 第 113 変数： m_SLIP_CD */
	public String m_SLIP_CD = null;
	/** 第 114 変数： m_ORGN_SLIP_CD */
	public String m_ORGN_SLIP_CD = null;
	/** 第 115 変数： m_WORK_IN_PROC_CD */
	public String m_WORK_IN_PROC_CD = null;
	/** 第 116 変数： m_DLV_CD */
	public String m_DLV_CD = null;
	/** 第 117 変数： m_GNR_ORG_CD */
	public String m_GNR_ORG_CD = null;
	/** 第 118 変数： m_SBCNT_PUCH_TYP */
	public String m_SBCNT_PUCH_TYP = null;
	/** 第 119 変数： m_PUCH_RTN_FLG */
	public String m_PUCH_RTN_FLG = null;
	/** 第 120 変数： m_APPR_FLG */
	public String m_APPR_FLG = null;
	/** 第 121 変数： m_APPR_ID */
	public String m_APPR_ID = null;
	/** 第 122 変数： m_APPR_DATE */
	public String m_APPR_DATE = null;
	/** 第 123 変数： m_PAST_RESULT_ENTRY_TYP */
	public String m_PAST_RESULT_ENTRY_TYP = null;
	/** 第 124 変数： m_PROC_EXEC_DATE */
	public BigDecimal m_PROC_EXEC_DATE = null;
	/** 第 125 変数： m_AI_IF */
	public String m_AI_IF = null;
	/** 第 126 変数： m_PVC2BUSINESSNAME */
	public String m_PVC2BUSINESSNAME = null;
	/** 第 127 変数： m_PVC2OUTPUTPATH */
	public String m_PVC2OUTPUTPATH = null;
	/** 第 128 変数： m_PVC2OUTPUTNAME */
	public String m_PVC2OUTPUTNAME = null;
	/** 第 129 変数： m_PVC2LOGMODE */
	public String m_PVC2LOGMODE = null;
	/** 第 130 変数： m_PVC2OUTPUTMODE */
	public String m_PVC2OUTPUTMODE = null;
	/** 第 131 変数： m_PVC2USERID */
	public String m_PVC2USERID = null;
	/** 第 132 変数： m_PVC2PLANTCD */
	public String m_PVC2PLANTCD = null;
	/** 第 133 変数： m_PVC2TAXID */
	public String m_PVC2TAXID = null;
	/** 第 134 変数： m_PNUMTAXOUTAMOUNT */
	public String m_PNUMTAXOUTAMOUNT = null;
	/** 第 135 変数： m_PNUMTAXAMOUNT */
	public String m_PNUMTAXAMOUNT = null;
	/** 第 136 変数： m_PNUMEXTERNALTAXSALESAMOUNT */
	public String m_PNUMEXTERNALTAXSALESAMOUNT = null;
	/** 第 137 変数： m_PNUMINTERNALTAXSALESAMOUNT */
	public String m_PNUMINTERNALTAXSALESAMOUNT = null;
	/** 第 138 変数： m_PNUMTAXFREESALESAMOUNT */
	public String m_PNUMTAXFREESALESAMOUNT = null;
	/** 第 139 変数： m_PNUMEXTERNALTAXAMOUNT */
	public String m_PNUMEXTERNALTAXAMOUNT = null;
	/** 第 140 変数： m_PNUMINTERNALTAXAMOUNT */
	public String m_PNUMINTERNALTAXAMOUNT = null;
	/** 第 141 変数： m_PVC2ERRCD */
	public String m_PVC2ERRCD = null;
	/** 第 142 変数： m_PNUMSTATUS */
	public String m_PNUMSTATUS = null;
	/** 第 143 変数： m_OLD_TAX_RATE_1 */
	public String m_OLD_TAX_RATE_1 = null;
	/** 第 144 変数： m_OLD_TAX_RATE_2 */
	public String m_OLD_TAX_RATE_2 = null;
	/** 第 145 変数： m_OLD_TAX_RATE_3 */
	public String m_OLD_TAX_RATE_3 = null;
	/** 第 146 変数： m_NEW_TAX_RATE_START_DATE */
	public String m_NEW_TAX_RATE_START_DATE = null;
	/** 第 147 変数： m_NEW_TAX_RATE_1 */
	public String m_NEW_TAX_RATE_1 = null;
	/** 第 148 変数： m_NEW_TAX_RATE_2 */
	public String m_NEW_TAX_RATE_2 = null;
	/** 第 149 変数： m_NEW_TAX_RATE_3 */
	public String m_NEW_TAX_RATE_3 = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_h_PUCH_ODR_CD */
	public List l_h_PUCH_ODR_CD = null;

	/** 第 2 List変数： l_UNIT_COST_TYP_name */
	public List l_UNIT_COST_TYP_name = null;

	/** 第 3 List変数： l_UNIT_COST_TYP_val */
	public List l_UNIT_COST_TYP_val = null;

	/** 第 4 List変数： l_r1_FILTER */
	public List l_r1_FILTER = null;

	/** 第 5 List変数： l_r2_FILTER */
	public List l_r2_FILTER = null;

	/** 第 6 List変数： l_HOME_CUR_UNIT */
	public List l_HOME_CUR_UNIT = null;

	/** 第 7 List変数： l_c_NON_NO_ITEM_FLG */
	public List l_c_NON_NO_ITEM_FLG = null;

	/** 第 8 List変数： l_SelectUnitCostFlag */
	public List l_SelectUnitCostFlag = null;

	/** 第 9 List変数： l_h_PUCH_RTN_DATE */
	public List l_h_PUCH_RTN_DATE = null;

	/** 第 10 List変数： l_PRODUCT_TYP_name */
	public List l_PRODUCT_TYP_name = null;

	/** 第 11 List変数： l_PRODUCT_TYP_val */
	public List l_PRODUCT_TYP_val = null;

	/** 第 12 List変数： l_h_lotCtrl */
	public List l_h_lotCtrl = null;

	/** 第 13 List変数： l_HOME_DECIMAL_FIG */
	public List l_HOME_DECIMAL_FIG = null;

	/** 第 14 List変数： l_EFF_PHASE_IN_DATE */
	public List l_EFF_PHASE_IN_DATE = null;

	/** 第 15 List変数： l_PUCH_SIZE */
	public List l_PUCH_SIZE = null;

	/** 第 16 List変数： l_EXCH_TYP */
	public List l_EXCH_TYP = null;

	/** 第 17 List変数： l_CUR_SYMBOL */
	public List l_CUR_SYMBOL = null;

	/** 第 18 List変数： l_CUR_UNIT */
	public List l_CUR_UNIT = null;

	/** 第 19 List変数： l_DECIMAL_FIG */
	public List l_DECIMAL_FIG = null;

	/** 第 20 List変数： l_TAX_APPLY_TYP */
	public List l_TAX_APPLY_TYP = null;

	/** 第 21 List変数： l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** 第 22 List変数： l_VEND_CD */
	public List l_VEND_CD = null;

	/** 第 23 List変数： l_VEND_ANAME */
	public List l_VEND_ANAME = null;

	/** 第 24 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** 第 25 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 26 List変数： l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** 第 27 List変数： l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** 第 28 List変数： l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** 第 29 List変数： l_JOB_ODR_DETAIL_NO */
	public List l_JOB_ODR_DETAIL_NO = null;

	/** 第 30 List変数： l_INV_CTRL_FLG */
	public List l_INV_CTRL_FLG = null;

	/** 第 31 List変数： l_PUCH_ODR_PERSON */
	public List l_PUCH_ODR_PERSON = null;

	/** 第 32 List変数： l_PUCH_RTN_DATE */
	public List l_PUCH_RTN_DATE = null;

	/** 第 33 List変数： l_PUCH_RTN_QTY */
	public List l_PUCH_RTN_QTY = null;

	/** 第 34 List変数： l_WH_CD */
	public List l_WH_CD = null;

	/** 第 35 List変数： l_WH_NAME */
	public List l_WH_NAME = null;

	/** 第 36 List変数： l_VEND_LOT_NO */
	public List l_VEND_LOT_NO = null;

	/** 第 37 List変数： l_LOT_NO */
	public List l_LOT_NO = null;

	/** 第 38 List変数： l_CUR_CD */
	public List l_CUR_CD = null;

	/** 第 39 List変数： l_CUR_NAME */
	public List l_CUR_NAME = null;

	/** 第 40 List変数： l_VEND_CUR_UNIT */
	public List l_VEND_CUR_UNIT = null;

	/** 第 41 List変数： l_VEND_DECIMAL_FIG */
	public List l_VEND_DECIMAL_FIG = null;

	/** 第 42 List変数： l_USER_NAME */
	public List l_USER_NAME = null;

	/** 第 43 List変数： l_UNIT_COST_TYP */
	public List l_UNIT_COST_TYP = null;

	/** 第 44 List変数： l_UNIT_COST */
	public List l_UNIT_COST = null;

	/** 第 45 List変数： l_PROCESSING_COST */
	public List l_PROCESSING_COST = null;

	/** 第 46 List変数： l_MATERIAL_COST */
	public List l_MATERIAL_COST = null;

	/** 第 47 List変数： l_OTHER_OVERHEADS */
	public List l_OTHER_OVERHEADS = null;

	/** 第 48 List変数： l_PUCH_ODR_AMOUNT */
	public List l_PUCH_ODR_AMOUNT = null;

	/** 第 49 List変数： l_DISC_AMOUNT */
	public List l_DISC_AMOUNT = null;

	/** 第 50 List変数： l_NET_AMOUNT */
	public List l_NET_AMOUNT = null;

	/** 第 51 List変数： l_PUCH_RTN_COMMENT */
	public List l_PUCH_RTN_COMMENT = null;

	/** 第 52 List変数： l_RATE_JUDGE_DATE */
	public List l_RATE_JUDGE_DATE = null;

	/** 第 53 List変数： l_EXCH_RATE */
	public List l_EXCH_RATE = null;

	/** 第 54 List変数： l_TAX_RATE_1 */
	public List l_TAX_RATE_1 = null;

	/** 第 55 List変数： l_TAX_RATE_2 */
	public List l_TAX_RATE_2 = null;

	/** 第 56 List変数： l_TAX_RATE_3 */
	public List l_TAX_RATE_3 = null;

	/** 第 57 List変数： l_TAX_AMOUNT_1 */
	public List l_TAX_AMOUNT_1 = null;

	/** 第 58 List変数： l_TAX_AMOUNT_2 */
	public List l_TAX_AMOUNT_2 = null;

	/** 第 59 List変数： l_TAX_AMOUNT_3 */
	public List l_TAX_AMOUNT_3 = null;

	/** 第 60 List変数： l_AMOUNT_INCLUDE_TAX */
	public List l_AMOUNT_INCLUDE_TAX = null;

	/** 第 61 List変数： l_HOME_CUR_AMOUNT */
	public List l_HOME_CUR_AMOUNT = null;

	/** 第 62 List変数： l_ROUND_TYP */
	public List l_ROUND_TYP = null;

	/** 第 63 List変数： l_TAX_CD */
	public List l_TAX_CD = null;

	/** 第 64 List変数： l_TAX_ROUND_TYP */
	public List l_TAX_ROUND_TYP = null;

	/** 第 65 List変数： l_RTN_DEL_FLG */
	public List l_RTN_DEL_FLG = null;

	/** 第 66 List変数： l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** 第 67 List変数： l_NON_NO_ITEM_TYP */
	public List l_NON_NO_ITEM_TYP = null;

	/** 第 68 List変数： l_NON_NO_ITEM_NAME */
	public List l_NON_NO_ITEM_NAME = null;

	/** 第 69 List変数： l_NON_NO_ITEM_PUCH_ODR_UNIT */
	public List l_NON_NO_ITEM_PUCH_ODR_UNIT = null;

	/** 第 70 List変数： l_ITEM_TYP */
	public List l_ITEM_TYP = null;

	/** 第 71 List変数： l_PUCH_ODR_CD */
	public List l_PUCH_ODR_CD = null;

	/** 第 72 List変数： l_RTN_DEL_DATE */
	public List l_RTN_DEL_DATE = null;

	/** 第 73 List変数： l_UNIT_QTY_TYP */
	public List l_UNIT_QTY_TYP = null;

	/** 第 74 List変数： l_SPL_ITEM_TYP */
	public List l_SPL_ITEM_TYP = null;

	/** 第 75 List変数： l_PRODUCT_TYP */
	public List l_PRODUCT_TYP = null;

	/** 第 76 List変数： l_CLASIFICATION_CD */
	public List l_CLASIFICATION_CD = null;

	/** 第 77 List変数： l_LOT_CTRL_FLG */
	public List l_LOT_CTRL_FLG = null;

	/** 第 78 List変数： l_MRP_ODR_TYP */
	public List l_MRP_ODR_TYP = null;

	/** 第 79 List変数： l_PUCH_ODR_CD_2 */
	public List l_PUCH_ODR_CD_2 = null;

	/** 第 80 List変数： l_MRP_FLG */
	public List l_MRP_FLG = null;

	/** 第 81 List変数： l_WH_TYP */
	public List l_WH_TYP = null;

	/** 第 82 List変数： l_THIS_MONTH */
	public List l_THIS_MONTH = null;

	/** 第 83 List変数： l_INSTALL_FLG */
	public List l_INSTALL_FLG = null;

	/** 第 84 List変数： l_STOCK_ON_HAND_QTY */
	public List l_STOCK_ON_HAND_QTY = null;

	/** 第 85 List変数： l_RCV_ISSUE_CTRL_CD */
	public List l_RCV_ISSUE_CTRL_CD = null;

	/** 第 86 List変数： l_RCV_ISSUE_TYP */
	public List l_RCV_ISSUE_TYP = null;

	/** 第 87 List変数： l_ACPT_NO */
	public List l_ACPT_NO = null;

	/** 第 88 List変数： l_ACPT_RSLT_CRCT_NO */
	public List l_ACPT_RSLT_CRCT_NO = null;

	/** 第 89 List変数： l_INSPEC_RSLT_CRCT_NO */
	public List l_INSPEC_RSLT_CRCT_NO = null;

	/** 第 90 List変数： l_PARTIAL_PRD_NO */
	public List l_PARTIAL_PRD_NO = null;

	/** 第 91 List変数： l_OPR_RSLT_CRCT_NO */
	public List l_OPR_RSLT_CRCT_NO = null;

	/** 第 92 List変数： l_RCV_ISSUE_BEFORE_QTY */
	public List l_RCV_ISSUE_BEFORE_QTY = null;

	/** 第 93 List変数： l_RCV_ISSUE_QTY */
	public List l_RCV_ISSUE_QTY = null;

	/** 第 94 List変数： l_RCV_ISSUE_AFTER_QTY */
	public List l_RCV_ISSUE_AFTER_QTY = null;

	/** 第 95 List変数： l_RCV_ISSUE_AMOUNT */
	public List l_RCV_ISSUE_AMOUNT = null;

	/** 第 96 List変数： l_RCV_ISSUE_DATE */
	public List l_RCV_ISSUE_DATE = null;

	/** 第 97 List変数： l_RCV_ISSUE_GNR_TYP */
	public List l_RCV_ISSUE_GNR_TYP = null;

	/** 第 98 List変数： l_RCV_ISSUE_ODD_QTY */
	public List l_RCV_ISSUE_ODD_QTY = null;

	/** 第 99 List変数： l_STOCK_UPD_TYP */
	public List l_STOCK_UPD_TYP = null;

	/** 第 100 List変数： l_RCV_ISSUE_CMPLT_FLG */
	public List l_RCV_ISSUE_CMPLT_FLG = null;

	/** 第 101 List変数： l_CONS_TYP */
	public List l_CONS_TYP = null;

	/** 第 102 List変数： l_INSPC_ACPT_NO */
	public List l_INSPC_ACPT_NO = null;

	/** 第 103 List変数： l_INSPC_ACPT_GNR_TYP */
	public List l_INSPC_ACPT_GNR_TYP = null;

	/** 第 104 List変数： l_CRCT_NO */
	public List l_CRCT_NO = null;

	/** 第 105 List変数： l_CRCT_TYP */
	public List l_CRCT_TYP = null;

	/** 第 106 List変数： l_SLIP_TYP */
	public List l_SLIP_TYP = null;

	/** 第 107 List変数： l_ACPT_QTY */
	public List l_ACPT_QTY = null;

	/** 第 108 List変数： l_INSPC_ACPT_QTY */
	public List l_INSPC_ACPT_QTY = null;

	/** 第 109 List変数： l_INSPC_ACPT_AMOUNT */
	public List l_INSPC_ACPT_AMOUNT = null;

	/** 第 110 List変数： l_SAVING_AMOUNT */
	public List l_SAVING_AMOUNT = null;

	/** 第 111 List変数： l_ACPT_DATE */
	public List l_ACPT_DATE = null;

	/** 第 112 List変数： l_INSPC_ACPT_DATE */
	public List l_INSPC_ACPT_DATE = null;

	/** 第 113 List変数： l_SLIP_CD */
	public List l_SLIP_CD = null;

	/** 第 114 List変数： l_ORGN_SLIP_CD */
	public List l_ORGN_SLIP_CD = null;

	/** 第 115 List変数： l_WORK_IN_PROC_CD */
	public List l_WORK_IN_PROC_CD = null;

	/** 第 116 List変数： l_DLV_CD */
	public List l_DLV_CD = null;

	/** 第 117 List変数： l_GNR_ORG_CD */
	public List l_GNR_ORG_CD = null;

	/** 第 118 List変数： l_SBCNT_PUCH_TYP */
	public List l_SBCNT_PUCH_TYP = null;

	/** 第 119 List変数： l_PUCH_RTN_FLG */
	public List l_PUCH_RTN_FLG = null;

	/** 第 120 List変数： l_APPR_FLG */
	public List l_APPR_FLG = null;

	/** 第 121 List変数： l_APPR_ID */
	public List l_APPR_ID = null;

	/** 第 122 List変数： l_APPR_DATE */
	public List l_APPR_DATE = null;

	/** 第 123 List変数： l_PAST_RESULT_ENTRY_TYP */
	public List l_PAST_RESULT_ENTRY_TYP = null;

	/** 第 124 List変数： l_PROC_EXEC_DATE */
	public List l_PROC_EXEC_DATE = null;

	/** 第 125 List変数： l_AI_IF */
	public List l_AI_IF = null;

	/** 第 126 List変数： l_PVC2BUSINESSNAME */
	public List l_PVC2BUSINESSNAME = null;

	/** 第 127 List変数： l_PVC2OUTPUTPATH */
	public List l_PVC2OUTPUTPATH = null;

	/** 第 128 List変数： l_PVC2OUTPUTNAME */
	public List l_PVC2OUTPUTNAME = null;

	/** 第 129 List変数： l_PVC2LOGMODE */
	public List l_PVC2LOGMODE = null;

	/** 第 130 List変数： l_PVC2OUTPUTMODE */
	public List l_PVC2OUTPUTMODE = null;

	/** 第 131 List変数： l_PVC2USERID */
	public List l_PVC2USERID = null;

	/** 第 132 List変数： l_PVC2PLANTCD */
	public List l_PVC2PLANTCD = null;

	/** 第 133 List変数： l_PVC2TAXID */
	public List l_PVC2TAXID = null;

	/** 第 134 List変数： l_PNUMTAXOUTAMOUNT */
	public List l_PNUMTAXOUTAMOUNT = null;

	/** 第 135 List変数： l_PNUMTAXAMOUNT */
	public List l_PNUMTAXAMOUNT = null;

	/** 第 136 List変数： l_PNUMEXTERNALTAXSALESAMOUNT */
	public List l_PNUMEXTERNALTAXSALESAMOUNT = null;

	/** 第 137 List変数： l_PNUMINTERNALTAXSALESAMOUNT */
	public List l_PNUMINTERNALTAXSALESAMOUNT = null;

	/** 第 138 List変数： l_PNUMTAXFREESALESAMOUNT */
	public List l_PNUMTAXFREESALESAMOUNT = null;

	/** 第 139 List変数： l_PNUMEXTERNALTAXAMOUNT */
	public List l_PNUMEXTERNALTAXAMOUNT = null;

	/** 第 140 List変数： l_PNUMINTERNALTAXAMOUNT */
	public List l_PNUMINTERNALTAXAMOUNT = null;

	/** 第 141 List変数： l_PVC2ERRCD */
	public List l_PVC2ERRCD = null;

	/** 第 142 List変数： l_PNUMSTATUS */
	public List l_PNUMSTATUS = null;

	/** 第 143 List変数： l_OLD_TAX_RATE_1 */
	public List l_OLD_TAX_RATE_1 = null;

	/** 第 144 List変数： l_OLD_TAX_RATE_2 */
	public List l_OLD_TAX_RATE_2 = null;

	/** 第 145 List変数： l_OLD_TAX_RATE_3 */
	public List l_OLD_TAX_RATE_3 = null;

	/** 第 146 List変数： l_NEW_TAX_RATE_START_DATE */
	public List l_NEW_TAX_RATE_START_DATE = null;

	/** 第 147 List変数： l_NEW_TAX_RATE_1 */
	public List l_NEW_TAX_RATE_1 = null;

	/** 第 148 List変数： l_NEW_TAX_RATE_2 */
	public List l_NEW_TAX_RATE_2 = null;

	/** 第 149 List変数： l_NEW_TAX_RATE_3 */
	public List l_NEW_TAX_RATE_3 = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String geth_PUCH_ODR_CD() { return m_h_PUCH_ODR_CD; }
	public String getUNIT_COST_TYP_name() { return m_UNIT_COST_TYP_name; }
	public String getUNIT_COST_TYP_val() { return m_UNIT_COST_TYP_val; }
	public String getr1_FILTER() { return m_r1_FILTER; }
	public String getr2_FILTER() { return m_r2_FILTER; }
	public String getHOME_CUR_UNIT() { return m_HOME_CUR_UNIT; }
	public String getc_NON_NO_ITEM_FLG() { return m_c_NON_NO_ITEM_FLG; }
	public String getSelectUnitCostFlag() { return m_SelectUnitCostFlag; }
	public String geth_PUCH_RTN_DATE() { return m_h_PUCH_RTN_DATE; }
	public String getPRODUCT_TYP_name() { return m_PRODUCT_TYP_name; }
	public String getPRODUCT_TYP_val() { return m_PRODUCT_TYP_val; }
	public String geth_lotCtrl() { return m_h_lotCtrl; }
	public String getHOME_DECIMAL_FIG() { return m_HOME_DECIMAL_FIG; }
	public String getEFF_PHASE_IN_DATE() { return m_EFF_PHASE_IN_DATE; }
	public String getPUCH_SIZE() { return m_PUCH_SIZE; }
	public String getEXCH_TYP() { return m_EXCH_TYP; }
	public String getCUR_SYMBOL() { return m_CUR_SYMBOL; }
	public String getCUR_UNIT() { return m_CUR_UNIT; }
	public String getDECIMAL_FIG() { return m_DECIMAL_FIG; }
	public String getTAX_APPLY_TYP() { return m_TAX_APPLY_TYP; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getVEND_ANAME() { return m_VEND_ANAME; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getJOB_ODR_DETAIL_NO() { return m_JOB_ODR_DETAIL_NO; }
	public String getINV_CTRL_FLG() { return m_INV_CTRL_FLG; }
	public String getPUCH_ODR_PERSON() { return m_PUCH_ODR_PERSON; }
	public String getPUCH_RTN_DATE() { return m_PUCH_RTN_DATE; }
	public String getPUCH_RTN_QTY() { return m_PUCH_RTN_QTY; }
	public String getWH_CD() { return m_WH_CD; }
	public String getWH_NAME() { return m_WH_NAME; }
	public String getVEND_LOT_NO() { return m_VEND_LOT_NO; }
	public String getLOT_NO() { return m_LOT_NO; }
	public String getCUR_CD() { return m_CUR_CD; }
	public String getCUR_NAME() { return m_CUR_NAME; }
	public String getVEND_CUR_UNIT() { return m_VEND_CUR_UNIT; }
	public String getVEND_DECIMAL_FIG() { return m_VEND_DECIMAL_FIG; }
	public String getUSER_NAME() { return m_USER_NAME; }
	public String getUNIT_COST_TYP() { return m_UNIT_COST_TYP; }
	public String getUNIT_COST() { return m_UNIT_COST; }
	public String getPROCESSING_COST() { return m_PROCESSING_COST; }
	public String getMATERIAL_COST() { return m_MATERIAL_COST; }
	public String getOTHER_OVERHEADS() { return m_OTHER_OVERHEADS; }
	public String getPUCH_ODR_AMOUNT() { return m_PUCH_ODR_AMOUNT; }
	public String getDISC_AMOUNT() { return m_DISC_AMOUNT; }
	public String getNET_AMOUNT() { return m_NET_AMOUNT; }
	public String getPUCH_RTN_COMMENT() { return m_PUCH_RTN_COMMENT; }
	public String getRATE_JUDGE_DATE() { return m_RATE_JUDGE_DATE; }
	public String getEXCH_RATE() { return m_EXCH_RATE; }
	public String getTAX_RATE_1() { return m_TAX_RATE_1; }
	public String getTAX_RATE_2() { return m_TAX_RATE_2; }
	public String getTAX_RATE_3() { return m_TAX_RATE_3; }
	public String getTAX_AMOUNT_1() { return m_TAX_AMOUNT_1; }
	public String getTAX_AMOUNT_2() { return m_TAX_AMOUNT_2; }
	public String getTAX_AMOUNT_3() { return m_TAX_AMOUNT_3; }
	public String getAMOUNT_INCLUDE_TAX() { return m_AMOUNT_INCLUDE_TAX; }
	public String getHOME_CUR_AMOUNT() { return m_HOME_CUR_AMOUNT; }
	public String getROUND_TYP() { return m_ROUND_TYP; }
	public String getTAX_CD() { return m_TAX_CD; }
	public String getTAX_ROUND_TYP() { return m_TAX_ROUND_TYP; }
	public String getRTN_DEL_FLG() { return m_RTN_DEL_FLG; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getNON_NO_ITEM_TYP() { return m_NON_NO_ITEM_TYP; }
	public String getNON_NO_ITEM_NAME() { return m_NON_NO_ITEM_NAME; }
	public String getNON_NO_ITEM_PUCH_ODR_UNIT() { return m_NON_NO_ITEM_PUCH_ODR_UNIT; }
	public String getITEM_TYP() { return m_ITEM_TYP; }
	public String getPUCH_ODR_CD() { return m_PUCH_ODR_CD; }
	public String getRTN_DEL_DATE() { return m_RTN_DEL_DATE; }
	public String getUNIT_QTY_TYP() { return m_UNIT_QTY_TYP; }
	public String getSPL_ITEM_TYP() { return m_SPL_ITEM_TYP; }
	public String getPRODUCT_TYP() { return m_PRODUCT_TYP; }
	public String getCLASIFICATION_CD() { return m_CLASIFICATION_CD; }
	public String getLOT_CTRL_FLG() { return m_LOT_CTRL_FLG; }
	public String getMRP_ODR_TYP() { return m_MRP_ODR_TYP; }
	public String getPUCH_ODR_CD_2() { return m_PUCH_ODR_CD_2; }
	public String getMRP_FLG() { return m_MRP_FLG; }
	public String getWH_TYP() { return m_WH_TYP; }
	public String getTHIS_MONTH() { return m_THIS_MONTH; }
	public String getINSTALL_FLG() { return m_INSTALL_FLG; }
	public String getSTOCK_ON_HAND_QTY() { return m_STOCK_ON_HAND_QTY; }
	public String getRCV_ISSUE_CTRL_CD() { return m_RCV_ISSUE_CTRL_CD; }
	public String getRCV_ISSUE_TYP() { return m_RCV_ISSUE_TYP; }
	public String getACPT_NO() { return m_ACPT_NO; }
	public String getACPT_RSLT_CRCT_NO() { return m_ACPT_RSLT_CRCT_NO; }
	public String getINSPEC_RSLT_CRCT_NO() { return m_INSPEC_RSLT_CRCT_NO; }
	public String getPARTIAL_PRD_NO() { return m_PARTIAL_PRD_NO; }
	public String getOPR_RSLT_CRCT_NO() { return m_OPR_RSLT_CRCT_NO; }
	public String getRCV_ISSUE_BEFORE_QTY() { return m_RCV_ISSUE_BEFORE_QTY; }
	public String getRCV_ISSUE_QTY() { return m_RCV_ISSUE_QTY; }
	public String getRCV_ISSUE_AFTER_QTY() { return m_RCV_ISSUE_AFTER_QTY; }
	public String getRCV_ISSUE_AMOUNT() { return m_RCV_ISSUE_AMOUNT; }
	public String getRCV_ISSUE_DATE() { return m_RCV_ISSUE_DATE; }
	public String getRCV_ISSUE_GNR_TYP() { return m_RCV_ISSUE_GNR_TYP; }
	public String getRCV_ISSUE_ODD_QTY() { return m_RCV_ISSUE_ODD_QTY; }
	public String getSTOCK_UPD_TYP() { return m_STOCK_UPD_TYP; }
	public String getRCV_ISSUE_CMPLT_FLG() { return m_RCV_ISSUE_CMPLT_FLG; }
	public String getCONS_TYP() { return m_CONS_TYP; }
	public String getINSPC_ACPT_NO() { return m_INSPC_ACPT_NO; }
	public String getINSPC_ACPT_GNR_TYP() { return m_INSPC_ACPT_GNR_TYP; }
	public String getCRCT_NO() { return m_CRCT_NO; }
	public String getCRCT_TYP() { return m_CRCT_TYP; }
	public String getSLIP_TYP() { return m_SLIP_TYP; }
	public String getACPT_QTY() { return m_ACPT_QTY; }
	public String getINSPC_ACPT_QTY() { return m_INSPC_ACPT_QTY; }
	public String getINSPC_ACPT_AMOUNT() { return m_INSPC_ACPT_AMOUNT; }
	public String getSAVING_AMOUNT() { return m_SAVING_AMOUNT; }
	public String getACPT_DATE() { return m_ACPT_DATE; }
	public String getINSPC_ACPT_DATE() { return m_INSPC_ACPT_DATE; }
	public String getSLIP_CD() { return m_SLIP_CD; }
	public String getORGN_SLIP_CD() { return m_ORGN_SLIP_CD; }
	public String getWORK_IN_PROC_CD() { return m_WORK_IN_PROC_CD; }
	public String getDLV_CD() { return m_DLV_CD; }
	public String getGNR_ORG_CD() { return m_GNR_ORG_CD; }
	public String getSBCNT_PUCH_TYP() { return m_SBCNT_PUCH_TYP; }
	public String getPUCH_RTN_FLG() { return m_PUCH_RTN_FLG; }
	public String getAPPR_FLG() { return m_APPR_FLG; }
	public String getAPPR_ID() { return m_APPR_ID; }
	public String getAPPR_DATE() { return m_APPR_DATE; }
	public String getPAST_RESULT_ENTRY_TYP() { return m_PAST_RESULT_ENTRY_TYP; }
	public BigDecimal getPROC_EXEC_DATE() { return m_PROC_EXEC_DATE; }
	public String getAI_IF() { return m_AI_IF; }
	public String getPVC2BUSINESSNAME() { return m_PVC2BUSINESSNAME; }
	public String getPVC2OUTPUTPATH() { return m_PVC2OUTPUTPATH; }
	public String getPVC2OUTPUTNAME() { return m_PVC2OUTPUTNAME; }
	public String getPVC2LOGMODE() { return m_PVC2LOGMODE; }
	public String getPVC2OUTPUTMODE() { return m_PVC2OUTPUTMODE; }
	public String getPVC2USERID() { return m_PVC2USERID; }
	public String getPVC2PLANTCD() { return m_PVC2PLANTCD; }
	public String getPVC2TAXID() { return m_PVC2TAXID; }
	public String getPNUMTAXOUTAMOUNT() { return m_PNUMTAXOUTAMOUNT; }
	public String getPNUMTAXAMOUNT() { return m_PNUMTAXAMOUNT; }
	public String getPNUMEXTERNALTAXSALESAMOUNT() { return m_PNUMEXTERNALTAXSALESAMOUNT; }
	public String getPNUMINTERNALTAXSALESAMOUNT() { return m_PNUMINTERNALTAXSALESAMOUNT; }
	public String getPNUMTAXFREESALESAMOUNT() { return m_PNUMTAXFREESALESAMOUNT; }
	public String getPNUMEXTERNALTAXAMOUNT() { return m_PNUMEXTERNALTAXAMOUNT; }
	public String getPNUMINTERNALTAXAMOUNT() { return m_PNUMINTERNALTAXAMOUNT; }
	public String getPVC2ERRCD() { return m_PVC2ERRCD; }
	public String getPNUMSTATUS() { return m_PNUMSTATUS; }
	public String getOLD_TAX_RATE_1() { return m_OLD_TAX_RATE_1; }
	public String getOLD_TAX_RATE_2() { return m_OLD_TAX_RATE_2; }
	public String getOLD_TAX_RATE_3() { return m_OLD_TAX_RATE_3; }
	public String getNEW_TAX_RATE_START_DATE() { return m_NEW_TAX_RATE_START_DATE; }
	public String getNEW_TAX_RATE_1() { return m_NEW_TAX_RATE_1; }
	public String getNEW_TAX_RATE_2() { return m_NEW_TAX_RATE_2; }
	public String getNEW_TAX_RATE_3() { return m_NEW_TAX_RATE_3; }

	public List getList_h_PUCH_ODR_CD() { return l_h_PUCH_ODR_CD; }
	public List getList_UNIT_COST_TYP_name() { return l_UNIT_COST_TYP_name; }
	public List getList_UNIT_COST_TYP_val() { return l_UNIT_COST_TYP_val; }
	public List getList_r1_FILTER() { return l_r1_FILTER; }
	public List getList_r2_FILTER() { return l_r2_FILTER; }
	public List getList_HOME_CUR_UNIT() { return l_HOME_CUR_UNIT; }
	public List getList_c_NON_NO_ITEM_FLG() { return l_c_NON_NO_ITEM_FLG; }
	public List getList_SelectUnitCostFlag() { return l_SelectUnitCostFlag; }
	public List getList_h_PUCH_RTN_DATE() { return l_h_PUCH_RTN_DATE; }
	public List getList_PRODUCT_TYP_name() { return l_PRODUCT_TYP_name; }
	public List getList_PRODUCT_TYP_val() { return l_PRODUCT_TYP_val; }
	public List getList_h_lotCtrl() { return l_h_lotCtrl; }
	public List getList_HOME_DECIMAL_FIG() { return l_HOME_DECIMAL_FIG; }
	public List getList_EFF_PHASE_IN_DATE() { return l_EFF_PHASE_IN_DATE; }
	public List getList_PUCH_SIZE() { return l_PUCH_SIZE; }
	public List getList_EXCH_TYP() { return l_EXCH_TYP; }
	public List getList_CUR_SYMBOL() { return l_CUR_SYMBOL; }
	public List getList_CUR_UNIT() { return l_CUR_UNIT; }
	public List getList_DECIMAL_FIG() { return l_DECIMAL_FIG; }
	public List getList_TAX_APPLY_TYP() { return l_TAX_APPLY_TYP; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_VEND_ANAME() { return l_VEND_ANAME; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_JOB_ODR_DETAIL_NO() { return l_JOB_ODR_DETAIL_NO; }
	public List getList_INV_CTRL_FLG() { return l_INV_CTRL_FLG; }
	public List getList_PUCH_ODR_PERSON() { return l_PUCH_ODR_PERSON; }
	public List getList_PUCH_RTN_DATE() { return l_PUCH_RTN_DATE; }
	public List getList_PUCH_RTN_QTY() { return l_PUCH_RTN_QTY; }
	public List getList_WH_CD() { return l_WH_CD; }
	public List getList_WH_NAME() { return l_WH_NAME; }
	public List getList_VEND_LOT_NO() { return l_VEND_LOT_NO; }
	public List getList_LOT_NO() { return l_LOT_NO; }
	public List getList_CUR_CD() { return l_CUR_CD; }
	public List getList_CUR_NAME() { return l_CUR_NAME; }
	public List getList_VEND_CUR_UNIT() { return l_VEND_CUR_UNIT; }
	public List getList_VEND_DECIMAL_FIG() { return l_VEND_DECIMAL_FIG; }
	public List getList_USER_NAME() { return l_USER_NAME; }
	public List getList_UNIT_COST_TYP() { return l_UNIT_COST_TYP; }
	public List getList_UNIT_COST() { return l_UNIT_COST; }
	public List getList_PROCESSING_COST() { return l_PROCESSING_COST; }
	public List getList_MATERIAL_COST() { return l_MATERIAL_COST; }
	public List getList_OTHER_OVERHEADS() { return l_OTHER_OVERHEADS; }
	public List getList_PUCH_ODR_AMOUNT() { return l_PUCH_ODR_AMOUNT; }
	public List getList_DISC_AMOUNT() { return l_DISC_AMOUNT; }
	public List getList_NET_AMOUNT() { return l_NET_AMOUNT; }
	public List getList_PUCH_RTN_COMMENT() { return l_PUCH_RTN_COMMENT; }
	public List getList_RATE_JUDGE_DATE() { return l_RATE_JUDGE_DATE; }
	public List getList_EXCH_RATE() { return l_EXCH_RATE; }
	public List getList_TAX_RATE_1() { return l_TAX_RATE_1; }
	public List getList_TAX_RATE_2() { return l_TAX_RATE_2; }
	public List getList_TAX_RATE_3() { return l_TAX_RATE_3; }
	public List getList_TAX_AMOUNT_1() { return l_TAX_AMOUNT_1; }
	public List getList_TAX_AMOUNT_2() { return l_TAX_AMOUNT_2; }
	public List getList_TAX_AMOUNT_3() { return l_TAX_AMOUNT_3; }
	public List getList_AMOUNT_INCLUDE_TAX() { return l_AMOUNT_INCLUDE_TAX; }
	public List getList_HOME_CUR_AMOUNT() { return l_HOME_CUR_AMOUNT; }
	public List getList_ROUND_TYP() { return l_ROUND_TYP; }
	public List getList_TAX_CD() { return l_TAX_CD; }
	public List getList_TAX_ROUND_TYP() { return l_TAX_ROUND_TYP; }
	public List getList_RTN_DEL_FLG() { return l_RTN_DEL_FLG; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_NON_NO_ITEM_TYP() { return l_NON_NO_ITEM_TYP; }
	public List getList_NON_NO_ITEM_NAME() { return l_NON_NO_ITEM_NAME; }
	public List getList_NON_NO_ITEM_PUCH_ODR_UNIT() { return l_NON_NO_ITEM_PUCH_ODR_UNIT; }
	public List getList_ITEM_TYP() { return l_ITEM_TYP; }
	public List getList_PUCH_ODR_CD() { return l_PUCH_ODR_CD; }
	public List getList_RTN_DEL_DATE() { return l_RTN_DEL_DATE; }
	public List getList_UNIT_QTY_TYP() { return l_UNIT_QTY_TYP; }
	public List getList_SPL_ITEM_TYP() { return l_SPL_ITEM_TYP; }
	public List getList_PRODUCT_TYP() { return l_PRODUCT_TYP; }
	public List getList_CLASIFICATION_CD() { return l_CLASIFICATION_CD; }
	public List getList_LOT_CTRL_FLG() { return l_LOT_CTRL_FLG; }
	public List getList_MRP_ODR_TYP() { return l_MRP_ODR_TYP; }
	public List getList_PUCH_ODR_CD_2() { return l_PUCH_ODR_CD_2; }
	public List getList_MRP_FLG() { return l_MRP_FLG; }
	public List getList_WH_TYP() { return l_WH_TYP; }
	public List getList_THIS_MONTH() { return l_THIS_MONTH; }
	public List getList_INSTALL_FLG() { return l_INSTALL_FLG; }
	public List getList_STOCK_ON_HAND_QTY() { return l_STOCK_ON_HAND_QTY; }
	public List getList_RCV_ISSUE_CTRL_CD() { return l_RCV_ISSUE_CTRL_CD; }
	public List getList_RCV_ISSUE_TYP() { return l_RCV_ISSUE_TYP; }
	public List getList_ACPT_NO() { return l_ACPT_NO; }
	public List getList_ACPT_RSLT_CRCT_NO() { return l_ACPT_RSLT_CRCT_NO; }
	public List getList_INSPEC_RSLT_CRCT_NO() { return l_INSPEC_RSLT_CRCT_NO; }
	public List getList_PARTIAL_PRD_NO() { return l_PARTIAL_PRD_NO; }
	public List getList_OPR_RSLT_CRCT_NO() { return l_OPR_RSLT_CRCT_NO; }
	public List getList_RCV_ISSUE_BEFORE_QTY() { return l_RCV_ISSUE_BEFORE_QTY; }
	public List getList_RCV_ISSUE_QTY() { return l_RCV_ISSUE_QTY; }
	public List getList_RCV_ISSUE_AFTER_QTY() { return l_RCV_ISSUE_AFTER_QTY; }
	public List getList_RCV_ISSUE_AMOUNT() { return l_RCV_ISSUE_AMOUNT; }
	public List getList_RCV_ISSUE_DATE() { return l_RCV_ISSUE_DATE; }
	public List getList_RCV_ISSUE_GNR_TYP() { return l_RCV_ISSUE_GNR_TYP; }
	public List getList_RCV_ISSUE_ODD_QTY() { return l_RCV_ISSUE_ODD_QTY; }
	public List getList_STOCK_UPD_TYP() { return l_STOCK_UPD_TYP; }
	public List getList_RCV_ISSUE_CMPLT_FLG() { return l_RCV_ISSUE_CMPLT_FLG; }
	public List getList_CONS_TYP() { return l_CONS_TYP; }
	public List getList_INSPC_ACPT_NO() { return l_INSPC_ACPT_NO; }
	public List getList_INSPC_ACPT_GNR_TYP() { return l_INSPC_ACPT_GNR_TYP; }
	public List getList_CRCT_NO() { return l_CRCT_NO; }
	public List getList_CRCT_TYP() { return l_CRCT_TYP; }
	public List getList_SLIP_TYP() { return l_SLIP_TYP; }
	public List getList_ACPT_QTY() { return l_ACPT_QTY; }
	public List getList_INSPC_ACPT_QTY() { return l_INSPC_ACPT_QTY; }
	public List getList_INSPC_ACPT_AMOUNT() { return l_INSPC_ACPT_AMOUNT; }
	public List getList_SAVING_AMOUNT() { return l_SAVING_AMOUNT; }
	public List getList_ACPT_DATE() { return l_ACPT_DATE; }
	public List getList_INSPC_ACPT_DATE() { return l_INSPC_ACPT_DATE; }
	public List getList_SLIP_CD() { return l_SLIP_CD; }
	public List getList_ORGN_SLIP_CD() { return l_ORGN_SLIP_CD; }
	public List getList_WORK_IN_PROC_CD() { return l_WORK_IN_PROC_CD; }
	public List getList_DLV_CD() { return l_DLV_CD; }
	public List getList_GNR_ORG_CD() { return l_GNR_ORG_CD; }
	public List getList_SBCNT_PUCH_TYP() { return l_SBCNT_PUCH_TYP; }
	public List getList_PUCH_RTN_FLG() { return l_PUCH_RTN_FLG; }
	public List getList_APPR_FLG() { return l_APPR_FLG; }
	public List getList_APPR_ID() { return l_APPR_ID; }
	public List getList_APPR_DATE() { return l_APPR_DATE; }
	public List getList_PAST_RESULT_ENTRY_TYP() { return l_PAST_RESULT_ENTRY_TYP; }
	public List getList_PROC_EXEC_DATE() { return l_PROC_EXEC_DATE; }
	public List getList_AI_IF() { return l_AI_IF; }
	public List getList_PVC2BUSINESSNAME() { return l_PVC2BUSINESSNAME; }
	public List getList_PVC2OUTPUTPATH() { return l_PVC2OUTPUTPATH; }
	public List getList_PVC2OUTPUTNAME() { return l_PVC2OUTPUTNAME; }
	public List getList_PVC2LOGMODE() { return l_PVC2LOGMODE; }
	public List getList_PVC2OUTPUTMODE() { return l_PVC2OUTPUTMODE; }
	public List getList_PVC2USERID() { return l_PVC2USERID; }
	public List getList_PVC2PLANTCD() { return l_PVC2PLANTCD; }
	public List getList_PVC2TAXID() { return l_PVC2TAXID; }
	public List getList_PNUMTAXOUTAMOUNT() { return l_PNUMTAXOUTAMOUNT; }
	public List getList_PNUMTAXAMOUNT() { return l_PNUMTAXAMOUNT; }
	public List getList_PNUMEXTERNALTAXSALESAMOUNT() { return l_PNUMEXTERNALTAXSALESAMOUNT; }
	public List getList_PNUMINTERNALTAXSALESAMOUNT() { return l_PNUMINTERNALTAXSALESAMOUNT; }
	public List getList_PNUMTAXFREESALESAMOUNT() { return l_PNUMTAXFREESALESAMOUNT; }
	public List getList_PNUMEXTERNALTAXAMOUNT() { return l_PNUMEXTERNALTAXAMOUNT; }
	public List getList_PNUMINTERNALTAXAMOUNT() { return l_PNUMINTERNALTAXAMOUNT; }
	public List getList_PVC2ERRCD() { return l_PVC2ERRCD; }
	public List getList_PNUMSTATUS() { return l_PNUMSTATUS; }
	public List getList_OLD_TAX_RATE_1() { return l_OLD_TAX_RATE_1; }
	public List getList_OLD_TAX_RATE_2() { return l_OLD_TAX_RATE_2; }
	public List getList_OLD_TAX_RATE_3() { return l_OLD_TAX_RATE_3; }
	public List getList_NEW_TAX_RATE_START_DATE() { return l_NEW_TAX_RATE_START_DATE; }
	public List getList_NEW_TAX_RATE_1() { return l_NEW_TAX_RATE_1; }
	public List getList_NEW_TAX_RATE_2() { return l_NEW_TAX_RATE_2; }
	public List getList_NEW_TAX_RATE_3() { return l_NEW_TAX_RATE_3; }

	public void seth_PUCH_ODR_CD(String val) { m_h_PUCH_ODR_CD = val; }
	public void setUNIT_COST_TYP_name(String val) { m_UNIT_COST_TYP_name = val; }
	public void setUNIT_COST_TYP_val(String val) { m_UNIT_COST_TYP_val = val; }
	public void setr1_FILTER(String val) { m_r1_FILTER = val; }
	public void setr2_FILTER(String val) { m_r2_FILTER = val; }
	public void setHOME_CUR_UNIT(String val) { m_HOME_CUR_UNIT = val; }
	public void setc_NON_NO_ITEM_FLG(String val) { m_c_NON_NO_ITEM_FLG = val; }
	public void setSelectUnitCostFlag(String val) { m_SelectUnitCostFlag = val; }
	public void seth_PUCH_RTN_DATE(String val) { m_h_PUCH_RTN_DATE = val; }
	public void setPRODUCT_TYP_name(String val) { m_PRODUCT_TYP_name = val; }
	public void setPRODUCT_TYP_val(String val) { m_PRODUCT_TYP_val = val; }
	public void seth_lotCtrl(String val) { m_h_lotCtrl = val; }
	public void setHOME_DECIMAL_FIG(String val) { m_HOME_DECIMAL_FIG = val; }
	public void setEFF_PHASE_IN_DATE(String val) { m_EFF_PHASE_IN_DATE = val; }
	public void setPUCH_SIZE(String val) { m_PUCH_SIZE = val; }
	public void setEXCH_TYP(String val) { m_EXCH_TYP = val; }
	public void setCUR_SYMBOL(String val) { m_CUR_SYMBOL = val; }
	public void setCUR_UNIT(String val) { m_CUR_UNIT = val; }
	public void setDECIMAL_FIG(String val) { m_DECIMAL_FIG = val; }
	public void setTAX_APPLY_TYP(String val) { m_TAX_APPLY_TYP = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void setVEND_ANAME(String val) { m_VEND_ANAME = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setJOB_ODR_DETAIL_NO(String val) { m_JOB_ODR_DETAIL_NO = val; }
	public void setINV_CTRL_FLG(String val) { m_INV_CTRL_FLG = val; }
	public void setPUCH_ODR_PERSON(String val) { m_PUCH_ODR_PERSON = val; }
	public void setPUCH_RTN_DATE(String val) { m_PUCH_RTN_DATE = val; }
	public void setPUCH_RTN_QTY(String val) { m_PUCH_RTN_QTY = val; }
	public void setWH_CD(String val) { m_WH_CD = val; }
	public void setWH_NAME(String val) { m_WH_NAME = val; }
	public void setVEND_LOT_NO(String val) { m_VEND_LOT_NO = val; }
	public void setLOT_NO(String val) { m_LOT_NO = val; }
	public void setCUR_CD(String val) { m_CUR_CD = val; }
	public void setCUR_NAME(String val) { m_CUR_NAME = val; }
	public void setVEND_CUR_UNIT(String val) { m_VEND_CUR_UNIT = val; }
	public void setVEND_DECIMAL_FIG(String val) { m_VEND_DECIMAL_FIG = val; }
	public void setUSER_NAME(String val) { m_USER_NAME = val; }
	public void setUNIT_COST_TYP(String val) { m_UNIT_COST_TYP = val; }
	public void setUNIT_COST(String val) { m_UNIT_COST = val; }
	public void setPROCESSING_COST(String val) { m_PROCESSING_COST = val; }
	public void setMATERIAL_COST(String val) { m_MATERIAL_COST = val; }
	public void setOTHER_OVERHEADS(String val) { m_OTHER_OVERHEADS = val; }
	public void setPUCH_ODR_AMOUNT(String val) { m_PUCH_ODR_AMOUNT = val; }
	public void setDISC_AMOUNT(String val) { m_DISC_AMOUNT = val; }
	public void setNET_AMOUNT(String val) { m_NET_AMOUNT = val; }
	public void setPUCH_RTN_COMMENT(String val) { m_PUCH_RTN_COMMENT = val; }
	public void setRATE_JUDGE_DATE(String val) { m_RATE_JUDGE_DATE = val; }
	public void setEXCH_RATE(String val) { m_EXCH_RATE = val; }
	public void setTAX_RATE_1(String val) { m_TAX_RATE_1 = val; }
	public void setTAX_RATE_2(String val) { m_TAX_RATE_2 = val; }
	public void setTAX_RATE_3(String val) { m_TAX_RATE_3 = val; }
	public void setTAX_AMOUNT_1(String val) { m_TAX_AMOUNT_1 = val; }
	public void setTAX_AMOUNT_2(String val) { m_TAX_AMOUNT_2 = val; }
	public void setTAX_AMOUNT_3(String val) { m_TAX_AMOUNT_3 = val; }
	public void setAMOUNT_INCLUDE_TAX(String val) { m_AMOUNT_INCLUDE_TAX = val; }
	public void setHOME_CUR_AMOUNT(String val) { m_HOME_CUR_AMOUNT = val; }
	public void setROUND_TYP(String val) { m_ROUND_TYP = val; }
	public void setTAX_CD(String val) { m_TAX_CD = val; }
	public void setTAX_ROUND_TYP(String val) { m_TAX_ROUND_TYP = val; }
	public void setRTN_DEL_FLG(String val) { m_RTN_DEL_FLG = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setNON_NO_ITEM_TYP(String val) { m_NON_NO_ITEM_TYP = val; }
	public void setNON_NO_ITEM_NAME(String val) { m_NON_NO_ITEM_NAME = val; }
	public void setNON_NO_ITEM_PUCH_ODR_UNIT(String val) { m_NON_NO_ITEM_PUCH_ODR_UNIT = val; }
	public void setITEM_TYP(String val) { m_ITEM_TYP = val; }
	public void setPUCH_ODR_CD(String val) { m_PUCH_ODR_CD = val; }
	public void setRTN_DEL_DATE(String val) { m_RTN_DEL_DATE = val; }
	public void setUNIT_QTY_TYP(String val) { m_UNIT_QTY_TYP = val; }
	public void setSPL_ITEM_TYP(String val) { m_SPL_ITEM_TYP = val; }
	public void setPRODUCT_TYP(String val) { m_PRODUCT_TYP = val; }
	public void setCLASIFICATION_CD(String val) { m_CLASIFICATION_CD = val; }
	public void setLOT_CTRL_FLG(String val) { m_LOT_CTRL_FLG = val; }
	public void setMRP_ODR_TYP(String val) { m_MRP_ODR_TYP = val; }
	public void setPUCH_ODR_CD_2(String val) { m_PUCH_ODR_CD_2 = val; }
	public void setMRP_FLG(String val) { m_MRP_FLG = val; }
	public void setWH_TYP(String val) { m_WH_TYP = val; }
	public void setTHIS_MONTH(String val) { m_THIS_MONTH = val; }
	public void setINSTALL_FLG(String val) { m_INSTALL_FLG = val; }
	public void setSTOCK_ON_HAND_QTY(String val) { m_STOCK_ON_HAND_QTY = val; }
	public void setRCV_ISSUE_CTRL_CD(String val) { m_RCV_ISSUE_CTRL_CD = val; }
	public void setRCV_ISSUE_TYP(String val) { m_RCV_ISSUE_TYP = val; }
	public void setACPT_NO(String val) { m_ACPT_NO = val; }
	public void setACPT_RSLT_CRCT_NO(String val) { m_ACPT_RSLT_CRCT_NO = val; }
	public void setINSPEC_RSLT_CRCT_NO(String val) { m_INSPEC_RSLT_CRCT_NO = val; }
	public void setPARTIAL_PRD_NO(String val) { m_PARTIAL_PRD_NO = val; }
	public void setOPR_RSLT_CRCT_NO(String val) { m_OPR_RSLT_CRCT_NO = val; }
	public void setRCV_ISSUE_BEFORE_QTY(String val) { m_RCV_ISSUE_BEFORE_QTY = val; }
	public void setRCV_ISSUE_QTY(String val) { m_RCV_ISSUE_QTY = val; }
	public void setRCV_ISSUE_AFTER_QTY(String val) { m_RCV_ISSUE_AFTER_QTY = val; }
	public void setRCV_ISSUE_AMOUNT(String val) { m_RCV_ISSUE_AMOUNT = val; }
	public void setRCV_ISSUE_DATE(String val) { m_RCV_ISSUE_DATE = val; }
	public void setRCV_ISSUE_GNR_TYP(String val) { m_RCV_ISSUE_GNR_TYP = val; }
	public void setRCV_ISSUE_ODD_QTY(String val) { m_RCV_ISSUE_ODD_QTY = val; }
	public void setSTOCK_UPD_TYP(String val) { m_STOCK_UPD_TYP = val; }
	public void setRCV_ISSUE_CMPLT_FLG(String val) { m_RCV_ISSUE_CMPLT_FLG = val; }
	public void setCONS_TYP(String val) { m_CONS_TYP = val; }
	public void setINSPC_ACPT_NO(String val) { m_INSPC_ACPT_NO = val; }
	public void setINSPC_ACPT_GNR_TYP(String val) { m_INSPC_ACPT_GNR_TYP = val; }
	public void setCRCT_NO(String val) { m_CRCT_NO = val; }
	public void setCRCT_TYP(String val) { m_CRCT_TYP = val; }
	public void setSLIP_TYP(String val) { m_SLIP_TYP = val; }
	public void setACPT_QTY(String val) { m_ACPT_QTY = val; }
	public void setINSPC_ACPT_QTY(String val) { m_INSPC_ACPT_QTY = val; }
	public void setINSPC_ACPT_AMOUNT(String val) { m_INSPC_ACPT_AMOUNT = val; }
	public void setSAVING_AMOUNT(String val) { m_SAVING_AMOUNT = val; }
	public void setACPT_DATE(String val) { m_ACPT_DATE = val; }
	public void setINSPC_ACPT_DATE(String val) { m_INSPC_ACPT_DATE = val; }
	public void setSLIP_CD(String val) { m_SLIP_CD = val; }
	public void setORGN_SLIP_CD(String val) { m_ORGN_SLIP_CD = val; }
	public void setWORK_IN_PROC_CD(String val) { m_WORK_IN_PROC_CD = val; }
	public void setDLV_CD(String val) { m_DLV_CD = val; }
	public void setGNR_ORG_CD(String val) { m_GNR_ORG_CD = val; }
	public void setSBCNT_PUCH_TYP(String val) { m_SBCNT_PUCH_TYP = val; }
	public void setPUCH_RTN_FLG(String val) { m_PUCH_RTN_FLG = val; }
	public void setAPPR_FLG(String val) { m_APPR_FLG = val; }
	public void setAPPR_ID(String val) { m_APPR_ID = val; }
	public void setAPPR_DATE(String val) { m_APPR_DATE = val; }
	public void setPAST_RESULT_ENTRY_TYP(String val) { m_PAST_RESULT_ENTRY_TYP = val; }
	public void setPROC_EXEC_DATE(BigDecimal val) { m_PROC_EXEC_DATE = val; }
	public void setAI_IF(String val) { m_AI_IF = val; }
	public void setPVC2BUSINESSNAME(String val) { m_PVC2BUSINESSNAME = val; }
	public void setPVC2OUTPUTPATH(String val) { m_PVC2OUTPUTPATH = val; }
	public void setPVC2OUTPUTNAME(String val) { m_PVC2OUTPUTNAME = val; }
	public void setPVC2LOGMODE(String val) { m_PVC2LOGMODE = val; }
	public void setPVC2OUTPUTMODE(String val) { m_PVC2OUTPUTMODE = val; }
	public void setPVC2USERID(String val) { m_PVC2USERID = val; }
	public void setPVC2PLANTCD(String val) { m_PVC2PLANTCD = val; }
	public void setPVC2TAXID(String val) { m_PVC2TAXID = val; }
	public void setPNUMTAXOUTAMOUNT(String val) { m_PNUMTAXOUTAMOUNT = val; }
	public void setPNUMTAXAMOUNT(String val) { m_PNUMTAXAMOUNT = val; }
	public void setPNUMEXTERNALTAXSALESAMOUNT(String val) { m_PNUMEXTERNALTAXSALESAMOUNT = val; }
	public void setPNUMINTERNALTAXSALESAMOUNT(String val) { m_PNUMINTERNALTAXSALESAMOUNT = val; }
	public void setPNUMTAXFREESALESAMOUNT(String val) { m_PNUMTAXFREESALESAMOUNT = val; }
	public void setPNUMEXTERNALTAXAMOUNT(String val) { m_PNUMEXTERNALTAXAMOUNT = val; }
	public void setPNUMINTERNALTAXAMOUNT(String val) { m_PNUMINTERNALTAXAMOUNT = val; }
	public void setPVC2ERRCD(String val) { m_PVC2ERRCD = val; }
	public void setPNUMSTATUS(String val) { m_PNUMSTATUS = val; }
	public void setOLD_TAX_RATE_1(String val) { m_OLD_TAX_RATE_1 = val; }
	public void setOLD_TAX_RATE_2(String val) { m_OLD_TAX_RATE_2 = val; }
	public void setOLD_TAX_RATE_3(String val) { m_OLD_TAX_RATE_3 = val; }
	public void setNEW_TAX_RATE_START_DATE(String val) { m_NEW_TAX_RATE_START_DATE = val; }
	public void setNEW_TAX_RATE_1(String val) { m_NEW_TAX_RATE_1 = val; }
	public void setNEW_TAX_RATE_2(String val) { m_NEW_TAX_RATE_2 = val; }
	public void setNEW_TAX_RATE_3(String val) { m_NEW_TAX_RATE_3 = val; }


	public void setList_h_PUCH_ODR_CD(List list) { l_h_PUCH_ODR_CD = list; }
	public void setList_UNIT_COST_TYP_name(List list) { l_UNIT_COST_TYP_name = list; }
	public void setList_UNIT_COST_TYP_val(List list) { l_UNIT_COST_TYP_val = list; }
	public void setList_r1_FILTER(List list) { l_r1_FILTER = list; }
	public void setList_r2_FILTER(List list) { l_r2_FILTER = list; }
	public void setList_HOME_CUR_UNIT(List list) { l_HOME_CUR_UNIT = list; }
	public void setList_c_NON_NO_ITEM_FLG(List list) { l_c_NON_NO_ITEM_FLG = list; }
	public void setList_SelectUnitCostFlag(List list) { l_SelectUnitCostFlag = list; }
	public void setList_h_PUCH_RTN_DATE(List list) { l_h_PUCH_RTN_DATE = list; }
	public void setList_PRODUCT_TYP_name(List list) { l_PRODUCT_TYP_name = list; }
	public void setList_PRODUCT_TYP_val(List list) { l_PRODUCT_TYP_val = list; }
	public void setList_h_lotCtrl(List list) { l_h_lotCtrl = list; }
	public void setList_HOME_DECIMAL_FIG(List list) { l_HOME_DECIMAL_FIG = list; }
	public void setList_EFF_PHASE_IN_DATE(List list) { l_EFF_PHASE_IN_DATE = list; }
	public void setList_PUCH_SIZE(List list) { l_PUCH_SIZE = list; }
	public void setList_EXCH_TYP(List list) { l_EXCH_TYP = list; }
	public void setList_CUR_SYMBOL(List list) { l_CUR_SYMBOL = list; }
	public void setList_CUR_UNIT(List list) { l_CUR_UNIT = list; }
	public void setList_DECIMAL_FIG(List list) { l_DECIMAL_FIG = list; }
	public void setList_TAX_APPLY_TYP(List list) { l_TAX_APPLY_TYP = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_VEND_ANAME(List list) { l_VEND_ANAME = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_JOB_ODR_DETAIL_NO(List list) { l_JOB_ODR_DETAIL_NO = list; }
	public void setList_INV_CTRL_FLG(List list) { l_INV_CTRL_FLG = list; }
	public void setList_PUCH_ODR_PERSON(List list) { l_PUCH_ODR_PERSON = list; }
	public void setList_PUCH_RTN_DATE(List list) { l_PUCH_RTN_DATE = list; }
	public void setList_PUCH_RTN_QTY(List list) { l_PUCH_RTN_QTY = list; }
	public void setList_WH_CD(List list) { l_WH_CD = list; }
	public void setList_WH_NAME(List list) { l_WH_NAME = list; }
	public void setList_VEND_LOT_NO(List list) { l_VEND_LOT_NO = list; }
	public void setList_LOT_NO(List list) { l_LOT_NO = list; }
	public void setList_CUR_CD(List list) { l_CUR_CD = list; }
	public void setList_CUR_NAME(List list) { l_CUR_NAME = list; }
	public void setList_VEND_CUR_UNIT(List list) { l_VEND_CUR_UNIT = list; }
	public void setList_VEND_DECIMAL_FIG(List list) { l_VEND_DECIMAL_FIG = list; }
	public void setList_USER_NAME(List list) { l_USER_NAME = list; }
	public void setList_UNIT_COST_TYP(List list) { l_UNIT_COST_TYP = list; }
	public void setList_UNIT_COST(List list) { l_UNIT_COST = list; }
	public void setList_PROCESSING_COST(List list) { l_PROCESSING_COST = list; }
	public void setList_MATERIAL_COST(List list) { l_MATERIAL_COST = list; }
	public void setList_OTHER_OVERHEADS(List list) { l_OTHER_OVERHEADS = list; }
	public void setList_PUCH_ODR_AMOUNT(List list) { l_PUCH_ODR_AMOUNT = list; }
	public void setList_DISC_AMOUNT(List list) { l_DISC_AMOUNT = list; }
	public void setList_NET_AMOUNT(List list) { l_NET_AMOUNT = list; }
	public void setList_PUCH_RTN_COMMENT(List list) { l_PUCH_RTN_COMMENT = list; }
	public void setList_RATE_JUDGE_DATE(List list) { l_RATE_JUDGE_DATE = list; }
	public void setList_EXCH_RATE(List list) { l_EXCH_RATE = list; }
	public void setList_TAX_RATE_1(List list) { l_TAX_RATE_1 = list; }
	public void setList_TAX_RATE_2(List list) { l_TAX_RATE_2 = list; }
	public void setList_TAX_RATE_3(List list) { l_TAX_RATE_3 = list; }
	public void setList_TAX_AMOUNT_1(List list) { l_TAX_AMOUNT_1 = list; }
	public void setList_TAX_AMOUNT_2(List list) { l_TAX_AMOUNT_2 = list; }
	public void setList_TAX_AMOUNT_3(List list) { l_TAX_AMOUNT_3 = list; }
	public void setList_AMOUNT_INCLUDE_TAX(List list) { l_AMOUNT_INCLUDE_TAX = list; }
	public void setList_HOME_CUR_AMOUNT(List list) { l_HOME_CUR_AMOUNT = list; }
	public void setList_ROUND_TYP(List list) { l_ROUND_TYP = list; }
	public void setList_TAX_CD(List list) { l_TAX_CD = list; }
	public void setList_TAX_ROUND_TYP(List list) { l_TAX_ROUND_TYP = list; }
	public void setList_RTN_DEL_FLG(List list) { l_RTN_DEL_FLG = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_NON_NO_ITEM_TYP(List list) { l_NON_NO_ITEM_TYP = list; }
	public void setList_NON_NO_ITEM_NAME(List list) { l_NON_NO_ITEM_NAME = list; }
	public void setList_NON_NO_ITEM_PUCH_ODR_UNIT(List list) { l_NON_NO_ITEM_PUCH_ODR_UNIT = list; }
	public void setList_ITEM_TYP(List list) { l_ITEM_TYP = list; }
	public void setList_PUCH_ODR_CD(List list) { l_PUCH_ODR_CD = list; }
	public void setList_RTN_DEL_DATE(List list) { l_RTN_DEL_DATE = list; }
	public void setList_UNIT_QTY_TYP(List list) { l_UNIT_QTY_TYP = list; }
	public void setList_SPL_ITEM_TYP(List list) { l_SPL_ITEM_TYP = list; }
	public void setList_PRODUCT_TYP(List list) { l_PRODUCT_TYP = list; }
	public void setList_CLASIFICATION_CD(List list) { l_CLASIFICATION_CD = list; }
	public void setList_LOT_CTRL_FLG(List list) { l_LOT_CTRL_FLG = list; }
	public void setList_MRP_ODR_TYP(List list) { l_MRP_ODR_TYP = list; }
	public void setList_PUCH_ODR_CD_2(List list) { l_PUCH_ODR_CD_2 = list; }
	public void setList_MRP_FLG(List list) { l_MRP_FLG = list; }
	public void setList_WH_TYP(List list) { l_WH_TYP = list; }
	public void setList_THIS_MONTH(List list) { l_THIS_MONTH = list; }
	public void setList_INSTALL_FLG(List list) { l_INSTALL_FLG = list; }
	public void setList_STOCK_ON_HAND_QTY(List list) { l_STOCK_ON_HAND_QTY = list; }
	public void setList_RCV_ISSUE_CTRL_CD(List list) { l_RCV_ISSUE_CTRL_CD = list; }
	public void setList_RCV_ISSUE_TYP(List list) { l_RCV_ISSUE_TYP = list; }
	public void setList_ACPT_NO(List list) { l_ACPT_NO = list; }
	public void setList_ACPT_RSLT_CRCT_NO(List list) { l_ACPT_RSLT_CRCT_NO = list; }
	public void setList_INSPEC_RSLT_CRCT_NO(List list) { l_INSPEC_RSLT_CRCT_NO = list; }
	public void setList_PARTIAL_PRD_NO(List list) { l_PARTIAL_PRD_NO = list; }
	public void setList_OPR_RSLT_CRCT_NO(List list) { l_OPR_RSLT_CRCT_NO = list; }
	public void setList_RCV_ISSUE_BEFORE_QTY(List list) { l_RCV_ISSUE_BEFORE_QTY = list; }
	public void setList_RCV_ISSUE_QTY(List list) { l_RCV_ISSUE_QTY = list; }
	public void setList_RCV_ISSUE_AFTER_QTY(List list) { l_RCV_ISSUE_AFTER_QTY = list; }
	public void setList_RCV_ISSUE_AMOUNT(List list) { l_RCV_ISSUE_AMOUNT = list; }
	public void setList_RCV_ISSUE_DATE(List list) { l_RCV_ISSUE_DATE = list; }
	public void setList_RCV_ISSUE_GNR_TYP(List list) { l_RCV_ISSUE_GNR_TYP = list; }
	public void setList_RCV_ISSUE_ODD_QTY(List list) { l_RCV_ISSUE_ODD_QTY = list; }
	public void setList_STOCK_UPD_TYP(List list) { l_STOCK_UPD_TYP = list; }
	public void setList_RCV_ISSUE_CMPLT_FLG(List list) { l_RCV_ISSUE_CMPLT_FLG = list; }
	public void setList_CONS_TYP(List list) { l_CONS_TYP = list; }
	public void setList_INSPC_ACPT_NO(List list) { l_INSPC_ACPT_NO = list; }
	public void setList_INSPC_ACPT_GNR_TYP(List list) { l_INSPC_ACPT_GNR_TYP = list; }
	public void setList_CRCT_NO(List list) { l_CRCT_NO = list; }
	public void setList_CRCT_TYP(List list) { l_CRCT_TYP = list; }
	public void setList_SLIP_TYP(List list) { l_SLIP_TYP = list; }
	public void setList_ACPT_QTY(List list) { l_ACPT_QTY = list; }
	public void setList_INSPC_ACPT_QTY(List list) { l_INSPC_ACPT_QTY = list; }
	public void setList_INSPC_ACPT_AMOUNT(List list) { l_INSPC_ACPT_AMOUNT = list; }
	public void setList_SAVING_AMOUNT(List list) { l_SAVING_AMOUNT = list; }
	public void setList_ACPT_DATE(List list) { l_ACPT_DATE = list; }
	public void setList_INSPC_ACPT_DATE(List list) { l_INSPC_ACPT_DATE = list; }
	public void setList_SLIP_CD(List list) { l_SLIP_CD = list; }
	public void setList_ORGN_SLIP_CD(List list) { l_ORGN_SLIP_CD = list; }
	public void setList_WORK_IN_PROC_CD(List list) { l_WORK_IN_PROC_CD = list; }
	public void setList_DLV_CD(List list) { l_DLV_CD = list; }
	public void setList_GNR_ORG_CD(List list) { l_GNR_ORG_CD = list; }
	public void setList_SBCNT_PUCH_TYP(List list) { l_SBCNT_PUCH_TYP = list; }
	public void setList_PUCH_RTN_FLG(List list) { l_PUCH_RTN_FLG = list; }
	public void setList_APPR_FLG(List list) { l_APPR_FLG = list; }
	public void setList_APPR_ID(List list) { l_APPR_ID = list; }
	public void setList_APPR_DATE(List list) { l_APPR_DATE = list; }
	public void setList_PAST_RESULT_ENTRY_TYP(List list) { l_PAST_RESULT_ENTRY_TYP = list; }
	public void setList_PROC_EXEC_DATE(List list) { l_PROC_EXEC_DATE = list; }
	public void setList_AI_IF(List list) { l_AI_IF = list; }
	public void setList_PVC2BUSINESSNAME(List list) { l_PVC2BUSINESSNAME = list; }
	public void setList_PVC2OUTPUTPATH(List list) { l_PVC2OUTPUTPATH = list; }
	public void setList_PVC2OUTPUTNAME(List list) { l_PVC2OUTPUTNAME = list; }
	public void setList_PVC2LOGMODE(List list) { l_PVC2LOGMODE = list; }
	public void setList_PVC2OUTPUTMODE(List list) { l_PVC2OUTPUTMODE = list; }
	public void setList_PVC2USERID(List list) { l_PVC2USERID = list; }
	public void setList_PVC2PLANTCD(List list) { l_PVC2PLANTCD = list; }
	public void setList_PVC2TAXID(List list) { l_PVC2TAXID = list; }
	public void setList_PNUMTAXOUTAMOUNT(List list) { l_PNUMTAXOUTAMOUNT = list; }
	public void setList_PNUMTAXAMOUNT(List list) { l_PNUMTAXAMOUNT = list; }
	public void setList_PNUMEXTERNALTAXSALESAMOUNT(List list) { l_PNUMEXTERNALTAXSALESAMOUNT = list; }
	public void setList_PNUMINTERNALTAXSALESAMOUNT(List list) { l_PNUMINTERNALTAXSALESAMOUNT = list; }
	public void setList_PNUMTAXFREESALESAMOUNT(List list) { l_PNUMTAXFREESALESAMOUNT = list; }
	public void setList_PNUMEXTERNALTAXAMOUNT(List list) { l_PNUMEXTERNALTAXAMOUNT = list; }
	public void setList_PNUMINTERNALTAXAMOUNT(List list) { l_PNUMINTERNALTAXAMOUNT = list; }
	public void setList_PVC2ERRCD(List list) { l_PVC2ERRCD = list; }
	public void setList_PNUMSTATUS(List list) { l_PNUMSTATUS = list; }
	public void setList_OLD_TAX_RATE_1(List list) { l_OLD_TAX_RATE_1 = list; }
	public void setList_OLD_TAX_RATE_2(List list) { l_OLD_TAX_RATE_2 = list; }
	public void setList_OLD_TAX_RATE_3(List list) { l_OLD_TAX_RATE_3 = list; }
	public void setList_NEW_TAX_RATE_START_DATE(List list) { l_NEW_TAX_RATE_START_DATE = list; }
	public void setList_NEW_TAX_RATE_1(List list) { l_NEW_TAX_RATE_1 = list; }
	public void setList_NEW_TAX_RATE_2(List list) { l_NEW_TAX_RATE_2 = list; }
	public void setList_NEW_TAX_RATE_3(List list) { l_NEW_TAX_RATE_3 = list; }

	public int setL2L_h_PUCH_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PUCH_ODR_CD == null) {
			l_h_PUCH_ODR_CD = new ArrayList();
		} else {
			l_h_PUCH_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PUCH_ODR_CD.add(((AE0120010Struct) list.get(i)).geth_PUCH_ODR_CD());
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
			l_UNIT_COST_TYP_name.add(((AE0120010Struct) list.get(i)).getUNIT_COST_TYP_name());
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
			l_UNIT_COST_TYP_val.add(((AE0120010Struct) list.get(i)).getUNIT_COST_TYP_val());
		}
		return size;
	}
	public int setL2L_r1_FILTER(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r1_FILTER == null) {
			l_r1_FILTER = new ArrayList();
		} else {
			l_r1_FILTER.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r1_FILTER.add(((AE0120010Struct) list.get(i)).getr1_FILTER());
		}
		return size;
	}
	public int setL2L_r2_FILTER(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r2_FILTER == null) {
			l_r2_FILTER = new ArrayList();
		} else {
			l_r2_FILTER.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r2_FILTER.add(((AE0120010Struct) list.get(i)).getr2_FILTER());
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
			l_HOME_CUR_UNIT.add(((AE0120010Struct) list.get(i)).getHOME_CUR_UNIT());
		}
		return size;
	}
	public int setL2L_c_NON_NO_ITEM_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_NON_NO_ITEM_FLG == null) {
			l_c_NON_NO_ITEM_FLG = new ArrayList();
		} else {
			l_c_NON_NO_ITEM_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_NON_NO_ITEM_FLG.add(((AE0120010Struct) list.get(i)).getc_NON_NO_ITEM_FLG());
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
			l_SelectUnitCostFlag.add(((AE0120010Struct) list.get(i)).getSelectUnitCostFlag());
		}
		return size;
	}
	public int setL2L_h_PUCH_RTN_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PUCH_RTN_DATE == null) {
			l_h_PUCH_RTN_DATE = new ArrayList();
		} else {
			l_h_PUCH_RTN_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PUCH_RTN_DATE.add(((AE0120010Struct) list.get(i)).geth_PUCH_RTN_DATE());
		}
		return size;
	}
	public int setL2L_PRODUCT_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRODUCT_TYP_name == null) {
			l_PRODUCT_TYP_name = new ArrayList();
		} else {
			l_PRODUCT_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRODUCT_TYP_name.add(((AE0120010Struct) list.get(i)).getPRODUCT_TYP_name());
		}
		return size;
	}
	public int setL2L_PRODUCT_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRODUCT_TYP_val == null) {
			l_PRODUCT_TYP_val = new ArrayList();
		} else {
			l_PRODUCT_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRODUCT_TYP_val.add(((AE0120010Struct) list.get(i)).getPRODUCT_TYP_val());
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
			l_h_lotCtrl.add(((AE0120010Struct) list.get(i)).geth_lotCtrl());
		}
		return size;
	}
	public int setL2L_HOME_DECIMAL_FIG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HOME_DECIMAL_FIG == null) {
			l_HOME_DECIMAL_FIG = new ArrayList();
		} else {
			l_HOME_DECIMAL_FIG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HOME_DECIMAL_FIG.add(((AE0120010Struct) list.get(i)).getHOME_DECIMAL_FIG());
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
			l_EFF_PHASE_IN_DATE.add(((AE0120010Struct) list.get(i)).getEFF_PHASE_IN_DATE());
		}
		return size;
	}
	public int setL2L_PUCH_SIZE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_SIZE == null) {
			l_PUCH_SIZE = new ArrayList();
		} else {
			l_PUCH_SIZE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_SIZE.add(((AE0120010Struct) list.get(i)).getPUCH_SIZE());
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
			l_EXCH_TYP.add(((AE0120010Struct) list.get(i)).getEXCH_TYP());
		}
		return size;
	}
	public int setL2L_CUR_SYMBOL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUR_SYMBOL == null) {
			l_CUR_SYMBOL = new ArrayList();
		} else {
			l_CUR_SYMBOL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUR_SYMBOL.add(((AE0120010Struct) list.get(i)).getCUR_SYMBOL());
		}
		return size;
	}
	public int setL2L_CUR_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUR_UNIT == null) {
			l_CUR_UNIT = new ArrayList();
		} else {
			l_CUR_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUR_UNIT.add(((AE0120010Struct) list.get(i)).getCUR_UNIT());
		}
		return size;
	}
	public int setL2L_DECIMAL_FIG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DECIMAL_FIG == null) {
			l_DECIMAL_FIG = new ArrayList();
		} else {
			l_DECIMAL_FIG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DECIMAL_FIG.add(((AE0120010Struct) list.get(i)).getDECIMAL_FIG());
		}
		return size;
	}
	public int setL2L_TAX_APPLY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_APPLY_TYP == null) {
			l_TAX_APPLY_TYP = new ArrayList();
		} else {
			l_TAX_APPLY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_APPLY_TYP.add(((AE0120010Struct) list.get(i)).getTAX_APPLY_TYP());
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
			l_COMPANY_CD.add(((AE0120010Struct) list.get(i)).getCOMPANY_CD());
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
			l_VEND_CD.add(((AE0120010Struct) list.get(i)).getVEND_CD());
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
			l_VEND_ANAME.add(((AE0120010Struct) list.get(i)).getVEND_ANAME());
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
			l_PLANT_CD.add(((AE0120010Struct) list.get(i)).getPLANT_CD());
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
			l_ITEM_CD.add(((AE0120010Struct) list.get(i)).getITEM_CD());
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
			l_ITEM_NAME.add(((AE0120010Struct) list.get(i)).getITEM_NAME());
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
			l_STOCK_UNIT.add(((AE0120010Struct) list.get(i)).getSTOCK_UNIT());
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
			l_JOB_ODR_CD.add(((AE0120010Struct) list.get(i)).getJOB_ODR_CD());
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
			l_JOB_ODR_DETAIL_NO.add(((AE0120010Struct) list.get(i)).getJOB_ODR_DETAIL_NO());
		}
		return size;
	}
	public int setL2L_INV_CTRL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INV_CTRL_FLG == null) {
			l_INV_CTRL_FLG = new ArrayList();
		} else {
			l_INV_CTRL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INV_CTRL_FLG.add(((AE0120010Struct) list.get(i)).getINV_CTRL_FLG());
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
			l_PUCH_ODR_PERSON.add(((AE0120010Struct) list.get(i)).getPUCH_ODR_PERSON());
		}
		return size;
	}
	public int setL2L_PUCH_RTN_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_RTN_DATE == null) {
			l_PUCH_RTN_DATE = new ArrayList();
		} else {
			l_PUCH_RTN_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_RTN_DATE.add(((AE0120010Struct) list.get(i)).getPUCH_RTN_DATE());
		}
		return size;
	}
	public int setL2L_PUCH_RTN_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_RTN_QTY == null) {
			l_PUCH_RTN_QTY = new ArrayList();
		} else {
			l_PUCH_RTN_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_RTN_QTY.add(((AE0120010Struct) list.get(i)).getPUCH_RTN_QTY());
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
			l_WH_CD.add(((AE0120010Struct) list.get(i)).getWH_CD());
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
			l_WH_NAME.add(((AE0120010Struct) list.get(i)).getWH_NAME());
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
			l_VEND_LOT_NO.add(((AE0120010Struct) list.get(i)).getVEND_LOT_NO());
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
			l_LOT_NO.add(((AE0120010Struct) list.get(i)).getLOT_NO());
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
			l_CUR_CD.add(((AE0120010Struct) list.get(i)).getCUR_CD());
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
			l_CUR_NAME.add(((AE0120010Struct) list.get(i)).getCUR_NAME());
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
			l_VEND_CUR_UNIT.add(((AE0120010Struct) list.get(i)).getVEND_CUR_UNIT());
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
			l_VEND_DECIMAL_FIG.add(((AE0120010Struct) list.get(i)).getVEND_DECIMAL_FIG());
		}
		return size;
	}
	public int setL2L_USER_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_USER_NAME == null) {
			l_USER_NAME = new ArrayList();
		} else {
			l_USER_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_USER_NAME.add(((AE0120010Struct) list.get(i)).getUSER_NAME());
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
			l_UNIT_COST_TYP.add(((AE0120010Struct) list.get(i)).getUNIT_COST_TYP());
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
			l_UNIT_COST.add(((AE0120010Struct) list.get(i)).getUNIT_COST());
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
			l_PROCESSING_COST.add(((AE0120010Struct) list.get(i)).getPROCESSING_COST());
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
			l_MATERIAL_COST.add(((AE0120010Struct) list.get(i)).getMATERIAL_COST());
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
			l_OTHER_OVERHEADS.add(((AE0120010Struct) list.get(i)).getOTHER_OVERHEADS());
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
			l_PUCH_ODR_AMOUNT.add(((AE0120010Struct) list.get(i)).getPUCH_ODR_AMOUNT());
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
			l_DISC_AMOUNT.add(((AE0120010Struct) list.get(i)).getDISC_AMOUNT());
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
			l_NET_AMOUNT.add(((AE0120010Struct) list.get(i)).getNET_AMOUNT());
		}
		return size;
	}
	public int setL2L_PUCH_RTN_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_RTN_COMMENT == null) {
			l_PUCH_RTN_COMMENT = new ArrayList();
		} else {
			l_PUCH_RTN_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_RTN_COMMENT.add(((AE0120010Struct) list.get(i)).getPUCH_RTN_COMMENT());
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
			l_RATE_JUDGE_DATE.add(((AE0120010Struct) list.get(i)).getRATE_JUDGE_DATE());
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
			l_EXCH_RATE.add(((AE0120010Struct) list.get(i)).getEXCH_RATE());
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
			l_TAX_RATE_1.add(((AE0120010Struct) list.get(i)).getTAX_RATE_1());
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
			l_TAX_RATE_2.add(((AE0120010Struct) list.get(i)).getTAX_RATE_2());
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
			l_TAX_RATE_3.add(((AE0120010Struct) list.get(i)).getTAX_RATE_3());
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
			l_TAX_AMOUNT_1.add(((AE0120010Struct) list.get(i)).getTAX_AMOUNT_1());
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
			l_TAX_AMOUNT_2.add(((AE0120010Struct) list.get(i)).getTAX_AMOUNT_2());
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
			l_TAX_AMOUNT_3.add(((AE0120010Struct) list.get(i)).getTAX_AMOUNT_3());
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
			l_AMOUNT_INCLUDE_TAX.add(((AE0120010Struct) list.get(i)).getAMOUNT_INCLUDE_TAX());
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
			l_HOME_CUR_AMOUNT.add(((AE0120010Struct) list.get(i)).getHOME_CUR_AMOUNT());
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
			l_ROUND_TYP.add(((AE0120010Struct) list.get(i)).getROUND_TYP());
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
			l_TAX_CD.add(((AE0120010Struct) list.get(i)).getTAX_CD());
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
			l_TAX_ROUND_TYP.add(((AE0120010Struct) list.get(i)).getTAX_ROUND_TYP());
		}
		return size;
	}
	public int setL2L_RTN_DEL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RTN_DEL_FLG == null) {
			l_RTN_DEL_FLG = new ArrayList();
		} else {
			l_RTN_DEL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RTN_DEL_FLG.add(((AE0120010Struct) list.get(i)).getRTN_DEL_FLG());
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
			l_MODIFY_COUNT.add(((AE0120010Struct) list.get(i)).getMODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_NON_NO_ITEM_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NON_NO_ITEM_TYP == null) {
			l_NON_NO_ITEM_TYP = new ArrayList();
		} else {
			l_NON_NO_ITEM_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NON_NO_ITEM_TYP.add(((AE0120010Struct) list.get(i)).getNON_NO_ITEM_TYP());
		}
		return size;
	}
	public int setL2L_NON_NO_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NON_NO_ITEM_NAME == null) {
			l_NON_NO_ITEM_NAME = new ArrayList();
		} else {
			l_NON_NO_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NON_NO_ITEM_NAME.add(((AE0120010Struct) list.get(i)).getNON_NO_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_NON_NO_ITEM_PUCH_ODR_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NON_NO_ITEM_PUCH_ODR_UNIT == null) {
			l_NON_NO_ITEM_PUCH_ODR_UNIT = new ArrayList();
		} else {
			l_NON_NO_ITEM_PUCH_ODR_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NON_NO_ITEM_PUCH_ODR_UNIT.add(((AE0120010Struct) list.get(i)).getNON_NO_ITEM_PUCH_ODR_UNIT());
		}
		return size;
	}
	public int setL2L_ITEM_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_TYP == null) {
			l_ITEM_TYP = new ArrayList();
		} else {
			l_ITEM_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_TYP.add(((AE0120010Struct) list.get(i)).getITEM_TYP());
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
			l_PUCH_ODR_CD.add(((AE0120010Struct) list.get(i)).getPUCH_ODR_CD());
		}
		return size;
	}
	public int setL2L_RTN_DEL_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RTN_DEL_DATE == null) {
			l_RTN_DEL_DATE = new ArrayList();
		} else {
			l_RTN_DEL_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RTN_DEL_DATE.add(((AE0120010Struct) list.get(i)).getRTN_DEL_DATE());
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
			l_UNIT_QTY_TYP.add(((AE0120010Struct) list.get(i)).getUNIT_QTY_TYP());
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
			l_SPL_ITEM_TYP.add(((AE0120010Struct) list.get(i)).getSPL_ITEM_TYP());
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
			l_PRODUCT_TYP.add(((AE0120010Struct) list.get(i)).getPRODUCT_TYP());
		}
		return size;
	}
	public int setL2L_CLASIFICATION_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CLASIFICATION_CD == null) {
			l_CLASIFICATION_CD = new ArrayList();
		} else {
			l_CLASIFICATION_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CLASIFICATION_CD.add(((AE0120010Struct) list.get(i)).getCLASIFICATION_CD());
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
			l_LOT_CTRL_FLG.add(((AE0120010Struct) list.get(i)).getLOT_CTRL_FLG());
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
			l_MRP_ODR_TYP.add(((AE0120010Struct) list.get(i)).getMRP_ODR_TYP());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_CD_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_CD_2 == null) {
			l_PUCH_ODR_CD_2 = new ArrayList();
		} else {
			l_PUCH_ODR_CD_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_CD_2.add(((AE0120010Struct) list.get(i)).getPUCH_ODR_CD_2());
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
			l_MRP_FLG.add(((AE0120010Struct) list.get(i)).getMRP_FLG());
		}
		return size;
	}
	public int setL2L_WH_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WH_TYP == null) {
			l_WH_TYP = new ArrayList();
		} else {
			l_WH_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WH_TYP.add(((AE0120010Struct) list.get(i)).getWH_TYP());
		}
		return size;
	}
	public int setL2L_THIS_MONTH(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_THIS_MONTH == null) {
			l_THIS_MONTH = new ArrayList();
		} else {
			l_THIS_MONTH.clear();
		}
		for (int i = 0; i < size; i++) {
			l_THIS_MONTH.add(((AE0120010Struct) list.get(i)).getTHIS_MONTH());
		}
		return size;
	}
	public int setL2L_INSTALL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INSTALL_FLG == null) {
			l_INSTALL_FLG = new ArrayList();
		} else {
			l_INSTALL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INSTALL_FLG.add(((AE0120010Struct) list.get(i)).getINSTALL_FLG());
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
			l_STOCK_ON_HAND_QTY.add(((AE0120010Struct) list.get(i)).getSTOCK_ON_HAND_QTY());
		}
		return size;
	}
	public int setL2L_RCV_ISSUE_CTRL_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_ISSUE_CTRL_CD == null) {
			l_RCV_ISSUE_CTRL_CD = new ArrayList();
		} else {
			l_RCV_ISSUE_CTRL_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_ISSUE_CTRL_CD.add(((AE0120010Struct) list.get(i)).getRCV_ISSUE_CTRL_CD());
		}
		return size;
	}
	public int setL2L_RCV_ISSUE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_ISSUE_TYP == null) {
			l_RCV_ISSUE_TYP = new ArrayList();
		} else {
			l_RCV_ISSUE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_ISSUE_TYP.add(((AE0120010Struct) list.get(i)).getRCV_ISSUE_TYP());
		}
		return size;
	}
	public int setL2L_ACPT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACPT_NO == null) {
			l_ACPT_NO = new ArrayList();
		} else {
			l_ACPT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACPT_NO.add(((AE0120010Struct) list.get(i)).getACPT_NO());
		}
		return size;
	}
	public int setL2L_ACPT_RSLT_CRCT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACPT_RSLT_CRCT_NO == null) {
			l_ACPT_RSLT_CRCT_NO = new ArrayList();
		} else {
			l_ACPT_RSLT_CRCT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACPT_RSLT_CRCT_NO.add(((AE0120010Struct) list.get(i)).getACPT_RSLT_CRCT_NO());
		}
		return size;
	}
	public int setL2L_INSPEC_RSLT_CRCT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INSPEC_RSLT_CRCT_NO == null) {
			l_INSPEC_RSLT_CRCT_NO = new ArrayList();
		} else {
			l_INSPEC_RSLT_CRCT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INSPEC_RSLT_CRCT_NO.add(((AE0120010Struct) list.get(i)).getINSPEC_RSLT_CRCT_NO());
		}
		return size;
	}
	public int setL2L_PARTIAL_PRD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PARTIAL_PRD_NO == null) {
			l_PARTIAL_PRD_NO = new ArrayList();
		} else {
			l_PARTIAL_PRD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PARTIAL_PRD_NO.add(((AE0120010Struct) list.get(i)).getPARTIAL_PRD_NO());
		}
		return size;
	}
	public int setL2L_OPR_RSLT_CRCT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_RSLT_CRCT_NO == null) {
			l_OPR_RSLT_CRCT_NO = new ArrayList();
		} else {
			l_OPR_RSLT_CRCT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_RSLT_CRCT_NO.add(((AE0120010Struct) list.get(i)).getOPR_RSLT_CRCT_NO());
		}
		return size;
	}
	public int setL2L_RCV_ISSUE_BEFORE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_ISSUE_BEFORE_QTY == null) {
			l_RCV_ISSUE_BEFORE_QTY = new ArrayList();
		} else {
			l_RCV_ISSUE_BEFORE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_ISSUE_BEFORE_QTY.add(((AE0120010Struct) list.get(i)).getRCV_ISSUE_BEFORE_QTY());
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
			l_RCV_ISSUE_QTY.add(((AE0120010Struct) list.get(i)).getRCV_ISSUE_QTY());
		}
		return size;
	}
	public int setL2L_RCV_ISSUE_AFTER_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_ISSUE_AFTER_QTY == null) {
			l_RCV_ISSUE_AFTER_QTY = new ArrayList();
		} else {
			l_RCV_ISSUE_AFTER_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_ISSUE_AFTER_QTY.add(((AE0120010Struct) list.get(i)).getRCV_ISSUE_AFTER_QTY());
		}
		return size;
	}
	public int setL2L_RCV_ISSUE_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_ISSUE_AMOUNT == null) {
			l_RCV_ISSUE_AMOUNT = new ArrayList();
		} else {
			l_RCV_ISSUE_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_ISSUE_AMOUNT.add(((AE0120010Struct) list.get(i)).getRCV_ISSUE_AMOUNT());
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
			l_RCV_ISSUE_DATE.add(((AE0120010Struct) list.get(i)).getRCV_ISSUE_DATE());
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
			l_RCV_ISSUE_GNR_TYP.add(((AE0120010Struct) list.get(i)).getRCV_ISSUE_GNR_TYP());
		}
		return size;
	}
	public int setL2L_RCV_ISSUE_ODD_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_ISSUE_ODD_QTY == null) {
			l_RCV_ISSUE_ODD_QTY = new ArrayList();
		} else {
			l_RCV_ISSUE_ODD_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_ISSUE_ODD_QTY.add(((AE0120010Struct) list.get(i)).getRCV_ISSUE_ODD_QTY());
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
			l_STOCK_UPD_TYP.add(((AE0120010Struct) list.get(i)).getSTOCK_UPD_TYP());
		}
		return size;
	}
	public int setL2L_RCV_ISSUE_CMPLT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_ISSUE_CMPLT_FLG == null) {
			l_RCV_ISSUE_CMPLT_FLG = new ArrayList();
		} else {
			l_RCV_ISSUE_CMPLT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_ISSUE_CMPLT_FLG.add(((AE0120010Struct) list.get(i)).getRCV_ISSUE_CMPLT_FLG());
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
			l_CONS_TYP.add(((AE0120010Struct) list.get(i)).getCONS_TYP());
		}
		return size;
	}
	public int setL2L_INSPC_ACPT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INSPC_ACPT_NO == null) {
			l_INSPC_ACPT_NO = new ArrayList();
		} else {
			l_INSPC_ACPT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INSPC_ACPT_NO.add(((AE0120010Struct) list.get(i)).getINSPC_ACPT_NO());
		}
		return size;
	}
	public int setL2L_INSPC_ACPT_GNR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INSPC_ACPT_GNR_TYP == null) {
			l_INSPC_ACPT_GNR_TYP = new ArrayList();
		} else {
			l_INSPC_ACPT_GNR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INSPC_ACPT_GNR_TYP.add(((AE0120010Struct) list.get(i)).getINSPC_ACPT_GNR_TYP());
		}
		return size;
	}
	public int setL2L_CRCT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CRCT_NO == null) {
			l_CRCT_NO = new ArrayList();
		} else {
			l_CRCT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CRCT_NO.add(((AE0120010Struct) list.get(i)).getCRCT_NO());
		}
		return size;
	}
	public int setL2L_CRCT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CRCT_TYP == null) {
			l_CRCT_TYP = new ArrayList();
		} else {
			l_CRCT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CRCT_TYP.add(((AE0120010Struct) list.get(i)).getCRCT_TYP());
		}
		return size;
	}
	public int setL2L_SLIP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SLIP_TYP == null) {
			l_SLIP_TYP = new ArrayList();
		} else {
			l_SLIP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SLIP_TYP.add(((AE0120010Struct) list.get(i)).getSLIP_TYP());
		}
		return size;
	}
	public int setL2L_ACPT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACPT_QTY == null) {
			l_ACPT_QTY = new ArrayList();
		} else {
			l_ACPT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACPT_QTY.add(((AE0120010Struct) list.get(i)).getACPT_QTY());
		}
		return size;
	}
	public int setL2L_INSPC_ACPT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INSPC_ACPT_QTY == null) {
			l_INSPC_ACPT_QTY = new ArrayList();
		} else {
			l_INSPC_ACPT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INSPC_ACPT_QTY.add(((AE0120010Struct) list.get(i)).getINSPC_ACPT_QTY());
		}
		return size;
	}
	public int setL2L_INSPC_ACPT_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INSPC_ACPT_AMOUNT == null) {
			l_INSPC_ACPT_AMOUNT = new ArrayList();
		} else {
			l_INSPC_ACPT_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INSPC_ACPT_AMOUNT.add(((AE0120010Struct) list.get(i)).getINSPC_ACPT_AMOUNT());
		}
		return size;
	}
	public int setL2L_SAVING_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SAVING_AMOUNT == null) {
			l_SAVING_AMOUNT = new ArrayList();
		} else {
			l_SAVING_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SAVING_AMOUNT.add(((AE0120010Struct) list.get(i)).getSAVING_AMOUNT());
		}
		return size;
	}
	public int setL2L_ACPT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACPT_DATE == null) {
			l_ACPT_DATE = new ArrayList();
		} else {
			l_ACPT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACPT_DATE.add(((AE0120010Struct) list.get(i)).getACPT_DATE());
		}
		return size;
	}
	public int setL2L_INSPC_ACPT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INSPC_ACPT_DATE == null) {
			l_INSPC_ACPT_DATE = new ArrayList();
		} else {
			l_INSPC_ACPT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INSPC_ACPT_DATE.add(((AE0120010Struct) list.get(i)).getINSPC_ACPT_DATE());
		}
		return size;
	}
	public int setL2L_SLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SLIP_CD == null) {
			l_SLIP_CD = new ArrayList();
		} else {
			l_SLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SLIP_CD.add(((AE0120010Struct) list.get(i)).getSLIP_CD());
		}
		return size;
	}
	public int setL2L_ORGN_SLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ORGN_SLIP_CD == null) {
			l_ORGN_SLIP_CD = new ArrayList();
		} else {
			l_ORGN_SLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ORGN_SLIP_CD.add(((AE0120010Struct) list.get(i)).getORGN_SLIP_CD());
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
			l_WORK_IN_PROC_CD.add(((AE0120010Struct) list.get(i)).getWORK_IN_PROC_CD());
		}
		return size;
	}
	public int setL2L_DLV_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_CD == null) {
			l_DLV_CD = new ArrayList();
		} else {
			l_DLV_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_CD.add(((AE0120010Struct) list.get(i)).getDLV_CD());
		}
		return size;
	}
	public int setL2L_GNR_ORG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_GNR_ORG_CD == null) {
			l_GNR_ORG_CD = new ArrayList();
		} else {
			l_GNR_ORG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_GNR_ORG_CD.add(((AE0120010Struct) list.get(i)).getGNR_ORG_CD());
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
			l_SBCNT_PUCH_TYP.add(((AE0120010Struct) list.get(i)).getSBCNT_PUCH_TYP());
		}
		return size;
	}
	public int setL2L_PUCH_RTN_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_RTN_FLG == null) {
			l_PUCH_RTN_FLG = new ArrayList();
		} else {
			l_PUCH_RTN_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_RTN_FLG.add(((AE0120010Struct) list.get(i)).getPUCH_RTN_FLG());
		}
		return size;
	}
	public int setL2L_APPR_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_APPR_FLG == null) {
			l_APPR_FLG = new ArrayList();
		} else {
			l_APPR_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_APPR_FLG.add(((AE0120010Struct) list.get(i)).getAPPR_FLG());
		}
		return size;
	}
	public int setL2L_APPR_ID(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_APPR_ID == null) {
			l_APPR_ID = new ArrayList();
		} else {
			l_APPR_ID.clear();
		}
		for (int i = 0; i < size; i++) {
			l_APPR_ID.add(((AE0120010Struct) list.get(i)).getAPPR_ID());
		}
		return size;
	}
	public int setL2L_APPR_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_APPR_DATE == null) {
			l_APPR_DATE = new ArrayList();
		} else {
			l_APPR_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_APPR_DATE.add(((AE0120010Struct) list.get(i)).getAPPR_DATE());
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
			l_PAST_RESULT_ENTRY_TYP.add(((AE0120010Struct) list.get(i)).getPAST_RESULT_ENTRY_TYP());
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
			l_PROC_EXEC_DATE.add(((AE0120010Struct) list.get(i)).getPROC_EXEC_DATE());
		}
		return size;
	}
	public int setL2L_AI_IF(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_AI_IF == null) {
			l_AI_IF = new ArrayList();
		} else {
			l_AI_IF.clear();
		}
		for (int i = 0; i < size; i++) {
			l_AI_IF.add(((AE0120010Struct) list.get(i)).getAI_IF());
		}
		return size;
	}
	public int setL2L_PVC2BUSINESSNAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PVC2BUSINESSNAME == null) {
			l_PVC2BUSINESSNAME = new ArrayList();
		} else {
			l_PVC2BUSINESSNAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PVC2BUSINESSNAME.add(((AE0120010Struct) list.get(i)).getPVC2BUSINESSNAME());
		}
		return size;
	}
	public int setL2L_PVC2OUTPUTPATH(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PVC2OUTPUTPATH == null) {
			l_PVC2OUTPUTPATH = new ArrayList();
		} else {
			l_PVC2OUTPUTPATH.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PVC2OUTPUTPATH.add(((AE0120010Struct) list.get(i)).getPVC2OUTPUTPATH());
		}
		return size;
	}
	public int setL2L_PVC2OUTPUTNAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PVC2OUTPUTNAME == null) {
			l_PVC2OUTPUTNAME = new ArrayList();
		} else {
			l_PVC2OUTPUTNAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PVC2OUTPUTNAME.add(((AE0120010Struct) list.get(i)).getPVC2OUTPUTNAME());
		}
		return size;
	}
	public int setL2L_PVC2LOGMODE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PVC2LOGMODE == null) {
			l_PVC2LOGMODE = new ArrayList();
		} else {
			l_PVC2LOGMODE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PVC2LOGMODE.add(((AE0120010Struct) list.get(i)).getPVC2LOGMODE());
		}
		return size;
	}
	public int setL2L_PVC2OUTPUTMODE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PVC2OUTPUTMODE == null) {
			l_PVC2OUTPUTMODE = new ArrayList();
		} else {
			l_PVC2OUTPUTMODE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PVC2OUTPUTMODE.add(((AE0120010Struct) list.get(i)).getPVC2OUTPUTMODE());
		}
		return size;
	}
	public int setL2L_PVC2USERID(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PVC2USERID == null) {
			l_PVC2USERID = new ArrayList();
		} else {
			l_PVC2USERID.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PVC2USERID.add(((AE0120010Struct) list.get(i)).getPVC2USERID());
		}
		return size;
	}
	public int setL2L_PVC2PLANTCD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PVC2PLANTCD == null) {
			l_PVC2PLANTCD = new ArrayList();
		} else {
			l_PVC2PLANTCD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PVC2PLANTCD.add(((AE0120010Struct) list.get(i)).getPVC2PLANTCD());
		}
		return size;
	}
	public int setL2L_PVC2TAXID(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PVC2TAXID == null) {
			l_PVC2TAXID = new ArrayList();
		} else {
			l_PVC2TAXID.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PVC2TAXID.add(((AE0120010Struct) list.get(i)).getPVC2TAXID());
		}
		return size;
	}
	public int setL2L_PNUMTAXOUTAMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PNUMTAXOUTAMOUNT == null) {
			l_PNUMTAXOUTAMOUNT = new ArrayList();
		} else {
			l_PNUMTAXOUTAMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PNUMTAXOUTAMOUNT.add(((AE0120010Struct) list.get(i)).getPNUMTAXOUTAMOUNT());
		}
		return size;
	}
	public int setL2L_PNUMTAXAMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PNUMTAXAMOUNT == null) {
			l_PNUMTAXAMOUNT = new ArrayList();
		} else {
			l_PNUMTAXAMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PNUMTAXAMOUNT.add(((AE0120010Struct) list.get(i)).getPNUMTAXAMOUNT());
		}
		return size;
	}
	public int setL2L_PNUMEXTERNALTAXSALESAMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PNUMEXTERNALTAXSALESAMOUNT == null) {
			l_PNUMEXTERNALTAXSALESAMOUNT = new ArrayList();
		} else {
			l_PNUMEXTERNALTAXSALESAMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PNUMEXTERNALTAXSALESAMOUNT.add(((AE0120010Struct) list.get(i)).getPNUMEXTERNALTAXSALESAMOUNT());
		}
		return size;
	}
	public int setL2L_PNUMINTERNALTAXSALESAMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PNUMINTERNALTAXSALESAMOUNT == null) {
			l_PNUMINTERNALTAXSALESAMOUNT = new ArrayList();
		} else {
			l_PNUMINTERNALTAXSALESAMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PNUMINTERNALTAXSALESAMOUNT.add(((AE0120010Struct) list.get(i)).getPNUMINTERNALTAXSALESAMOUNT());
		}
		return size;
	}
	public int setL2L_PNUMTAXFREESALESAMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PNUMTAXFREESALESAMOUNT == null) {
			l_PNUMTAXFREESALESAMOUNT = new ArrayList();
		} else {
			l_PNUMTAXFREESALESAMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PNUMTAXFREESALESAMOUNT.add(((AE0120010Struct) list.get(i)).getPNUMTAXFREESALESAMOUNT());
		}
		return size;
	}
	public int setL2L_PNUMEXTERNALTAXAMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PNUMEXTERNALTAXAMOUNT == null) {
			l_PNUMEXTERNALTAXAMOUNT = new ArrayList();
		} else {
			l_PNUMEXTERNALTAXAMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PNUMEXTERNALTAXAMOUNT.add(((AE0120010Struct) list.get(i)).getPNUMEXTERNALTAXAMOUNT());
		}
		return size;
	}
	public int setL2L_PNUMINTERNALTAXAMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PNUMINTERNALTAXAMOUNT == null) {
			l_PNUMINTERNALTAXAMOUNT = new ArrayList();
		} else {
			l_PNUMINTERNALTAXAMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PNUMINTERNALTAXAMOUNT.add(((AE0120010Struct) list.get(i)).getPNUMINTERNALTAXAMOUNT());
		}
		return size;
	}
	public int setL2L_PVC2ERRCD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PVC2ERRCD == null) {
			l_PVC2ERRCD = new ArrayList();
		} else {
			l_PVC2ERRCD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PVC2ERRCD.add(((AE0120010Struct) list.get(i)).getPVC2ERRCD());
		}
		return size;
	}
	public int setL2L_PNUMSTATUS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PNUMSTATUS == null) {
			l_PNUMSTATUS = new ArrayList();
		} else {
			l_PNUMSTATUS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PNUMSTATUS.add(((AE0120010Struct) list.get(i)).getPNUMSTATUS());
		}
		return size;
	}
	public int setL2L_OLD_TAX_RATE_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OLD_TAX_RATE_1 == null) {
			l_OLD_TAX_RATE_1 = new ArrayList();
		} else {
			l_OLD_TAX_RATE_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OLD_TAX_RATE_1.add(((AE0120010Struct) list.get(i)).getOLD_TAX_RATE_1());
		}
		return size;
	}
	public int setL2L_OLD_TAX_RATE_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OLD_TAX_RATE_2 == null) {
			l_OLD_TAX_RATE_2 = new ArrayList();
		} else {
			l_OLD_TAX_RATE_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OLD_TAX_RATE_2.add(((AE0120010Struct) list.get(i)).getOLD_TAX_RATE_2());
		}
		return size;
	}
	public int setL2L_OLD_TAX_RATE_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OLD_TAX_RATE_3 == null) {
			l_OLD_TAX_RATE_3 = new ArrayList();
		} else {
			l_OLD_TAX_RATE_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OLD_TAX_RATE_3.add(((AE0120010Struct) list.get(i)).getOLD_TAX_RATE_3());
		}
		return size;
	}
	public int setL2L_NEW_TAX_RATE_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NEW_TAX_RATE_START_DATE == null) {
			l_NEW_TAX_RATE_START_DATE = new ArrayList();
		} else {
			l_NEW_TAX_RATE_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NEW_TAX_RATE_START_DATE.add(((AE0120010Struct) list.get(i)).getNEW_TAX_RATE_START_DATE());
		}
		return size;
	}
	public int setL2L_NEW_TAX_RATE_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NEW_TAX_RATE_1 == null) {
			l_NEW_TAX_RATE_1 = new ArrayList();
		} else {
			l_NEW_TAX_RATE_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NEW_TAX_RATE_1.add(((AE0120010Struct) list.get(i)).getNEW_TAX_RATE_1());
		}
		return size;
	}
	public int setL2L_NEW_TAX_RATE_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NEW_TAX_RATE_2 == null) {
			l_NEW_TAX_RATE_2 = new ArrayList();
		} else {
			l_NEW_TAX_RATE_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NEW_TAX_RATE_2.add(((AE0120010Struct) list.get(i)).getNEW_TAX_RATE_2());
		}
		return size;
	}
	public int setL2L_NEW_TAX_RATE_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NEW_TAX_RATE_3 == null) {
			l_NEW_TAX_RATE_3 = new ArrayList();
		} else {
			l_NEW_TAX_RATE_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NEW_TAX_RATE_3.add(((AE0120010Struct) list.get(i)).getNEW_TAX_RATE_3());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_h_PUCH_ODR_CD = null;
		m_UNIT_COST_TYP_name = null;
		m_UNIT_COST_TYP_val = null;
		m_r1_FILTER = null;
		m_r2_FILTER = null;
		m_HOME_CUR_UNIT = null;
		m_c_NON_NO_ITEM_FLG = null;
		m_SelectUnitCostFlag = null;
		m_h_PUCH_RTN_DATE = null;
		m_PRODUCT_TYP_name = null;
		m_PRODUCT_TYP_val = null;
		m_h_lotCtrl = null;
		m_HOME_DECIMAL_FIG = null;
		m_EFF_PHASE_IN_DATE = null;
		m_PUCH_SIZE = null;
		m_EXCH_TYP = null;
		m_CUR_SYMBOL = null;
		m_CUR_UNIT = null;
		m_DECIMAL_FIG = null;
		m_TAX_APPLY_TYP = null;
		m_COMPANY_CD = null;
		m_VEND_CD = null;
		m_VEND_ANAME = null;
		m_PLANT_CD = null;
		m_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_STOCK_UNIT = null;
		m_JOB_ODR_CD = null;
		m_JOB_ODR_DETAIL_NO = null;
		m_INV_CTRL_FLG = null;
		m_PUCH_ODR_PERSON = null;
		m_PUCH_RTN_DATE = null;
		m_PUCH_RTN_QTY = null;
		m_WH_CD = null;
		m_WH_NAME = null;
		m_VEND_LOT_NO = null;
		m_LOT_NO = null;
		m_CUR_CD = null;
		m_CUR_NAME = null;
		m_VEND_CUR_UNIT = null;
		m_VEND_DECIMAL_FIG = null;
		m_USER_NAME = null;
		m_UNIT_COST_TYP = null;
		m_UNIT_COST = null;
		m_PROCESSING_COST = null;
		m_MATERIAL_COST = null;
		m_OTHER_OVERHEADS = null;
		m_PUCH_ODR_AMOUNT = null;
		m_DISC_AMOUNT = null;
		m_NET_AMOUNT = null;
		m_PUCH_RTN_COMMENT = null;
		m_RATE_JUDGE_DATE = null;
		m_EXCH_RATE = null;
		m_TAX_RATE_1 = null;
		m_TAX_RATE_2 = null;
		m_TAX_RATE_3 = null;
		m_TAX_AMOUNT_1 = null;
		m_TAX_AMOUNT_2 = null;
		m_TAX_AMOUNT_3 = null;
		m_AMOUNT_INCLUDE_TAX = null;
		m_HOME_CUR_AMOUNT = null;
		m_ROUND_TYP = null;
		m_TAX_CD = null;
		m_TAX_ROUND_TYP = null;
		m_RTN_DEL_FLG = null;
		m_MODIFY_COUNT = null;
		m_NON_NO_ITEM_TYP = null;
		m_NON_NO_ITEM_NAME = null;
		m_NON_NO_ITEM_PUCH_ODR_UNIT = null;
		m_ITEM_TYP = null;
		m_PUCH_ODR_CD = null;
		m_RTN_DEL_DATE = null;
		m_UNIT_QTY_TYP = null;
		m_SPL_ITEM_TYP = null;
		m_PRODUCT_TYP = null;
		m_CLASIFICATION_CD = null;
		m_LOT_CTRL_FLG = null;
		m_MRP_ODR_TYP = null;
		m_PUCH_ODR_CD_2 = null;
		m_MRP_FLG = null;
		m_WH_TYP = null;
		m_THIS_MONTH = null;
		m_INSTALL_FLG = null;
		m_STOCK_ON_HAND_QTY = null;
		m_RCV_ISSUE_CTRL_CD = null;
		m_RCV_ISSUE_TYP = null;
		m_ACPT_NO = null;
		m_ACPT_RSLT_CRCT_NO = null;
		m_INSPEC_RSLT_CRCT_NO = null;
		m_PARTIAL_PRD_NO = null;
		m_OPR_RSLT_CRCT_NO = null;
		m_RCV_ISSUE_BEFORE_QTY = null;
		m_RCV_ISSUE_QTY = null;
		m_RCV_ISSUE_AFTER_QTY = null;
		m_RCV_ISSUE_AMOUNT = null;
		m_RCV_ISSUE_DATE = null;
		m_RCV_ISSUE_GNR_TYP = null;
		m_RCV_ISSUE_ODD_QTY = null;
		m_STOCK_UPD_TYP = null;
		m_RCV_ISSUE_CMPLT_FLG = null;
		m_CONS_TYP = null;
		m_INSPC_ACPT_NO = null;
		m_INSPC_ACPT_GNR_TYP = null;
		m_CRCT_NO = null;
		m_CRCT_TYP = null;
		m_SLIP_TYP = null;
		m_ACPT_QTY = null;
		m_INSPC_ACPT_QTY = null;
		m_INSPC_ACPT_AMOUNT = null;
		m_SAVING_AMOUNT = null;
		m_ACPT_DATE = null;
		m_INSPC_ACPT_DATE = null;
		m_SLIP_CD = null;
		m_ORGN_SLIP_CD = null;
		m_WORK_IN_PROC_CD = null;
		m_DLV_CD = null;
		m_GNR_ORG_CD = null;
		m_SBCNT_PUCH_TYP = null;
		m_PUCH_RTN_FLG = null;
		m_APPR_FLG = null;
		m_APPR_ID = null;
		m_APPR_DATE = null;
		m_PAST_RESULT_ENTRY_TYP = null;
		m_PROC_EXEC_DATE = null;
		m_AI_IF = null;
		m_PVC2BUSINESSNAME = null;
		m_PVC2OUTPUTPATH = null;
		m_PVC2OUTPUTNAME = null;
		m_PVC2LOGMODE = null;
		m_PVC2OUTPUTMODE = null;
		m_PVC2USERID = null;
		m_PVC2PLANTCD = null;
		m_PVC2TAXID = null;
		m_PNUMTAXOUTAMOUNT = null;
		m_PNUMTAXAMOUNT = null;
		m_PNUMEXTERNALTAXSALESAMOUNT = null;
		m_PNUMINTERNALTAXSALESAMOUNT = null;
		m_PNUMTAXFREESALESAMOUNT = null;
		m_PNUMEXTERNALTAXAMOUNT = null;
		m_PNUMINTERNALTAXAMOUNT = null;
		m_PVC2ERRCD = null;
		m_PNUMSTATUS = null;
		m_OLD_TAX_RATE_1 = null;
		m_OLD_TAX_RATE_2 = null;
		m_OLD_TAX_RATE_3 = null;
		m_NEW_TAX_RATE_START_DATE = null;
		m_NEW_TAX_RATE_1 = null;
		m_NEW_TAX_RATE_2 = null;
		m_NEW_TAX_RATE_3 = null;

		l_h_PUCH_ODR_CD = null;
		l_UNIT_COST_TYP_name = null;
		l_UNIT_COST_TYP_val = null;
		l_r1_FILTER = null;
		l_r2_FILTER = null;
		l_HOME_CUR_UNIT = null;
		l_c_NON_NO_ITEM_FLG = null;
		l_SelectUnitCostFlag = null;
		l_h_PUCH_RTN_DATE = null;
		l_PRODUCT_TYP_name = null;
		l_PRODUCT_TYP_val = null;
		l_h_lotCtrl = null;
		l_HOME_DECIMAL_FIG = null;
		l_EFF_PHASE_IN_DATE = null;
		l_PUCH_SIZE = null;
		l_EXCH_TYP = null;
		l_CUR_SYMBOL = null;
		l_CUR_UNIT = null;
		l_DECIMAL_FIG = null;
		l_TAX_APPLY_TYP = null;
		l_COMPANY_CD = null;
		l_VEND_CD = null;
		l_VEND_ANAME = null;
		l_PLANT_CD = null;
		l_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_STOCK_UNIT = null;
		l_JOB_ODR_CD = null;
		l_JOB_ODR_DETAIL_NO = null;
		l_INV_CTRL_FLG = null;
		l_PUCH_ODR_PERSON = null;
		l_PUCH_RTN_DATE = null;
		l_PUCH_RTN_QTY = null;
		l_WH_CD = null;
		l_WH_NAME = null;
		l_VEND_LOT_NO = null;
		l_LOT_NO = null;
		l_CUR_CD = null;
		l_CUR_NAME = null;
		l_VEND_CUR_UNIT = null;
		l_VEND_DECIMAL_FIG = null;
		l_USER_NAME = null;
		l_UNIT_COST_TYP = null;
		l_UNIT_COST = null;
		l_PROCESSING_COST = null;
		l_MATERIAL_COST = null;
		l_OTHER_OVERHEADS = null;
		l_PUCH_ODR_AMOUNT = null;
		l_DISC_AMOUNT = null;
		l_NET_AMOUNT = null;
		l_PUCH_RTN_COMMENT = null;
		l_RATE_JUDGE_DATE = null;
		l_EXCH_RATE = null;
		l_TAX_RATE_1 = null;
		l_TAX_RATE_2 = null;
		l_TAX_RATE_3 = null;
		l_TAX_AMOUNT_1 = null;
		l_TAX_AMOUNT_2 = null;
		l_TAX_AMOUNT_3 = null;
		l_AMOUNT_INCLUDE_TAX = null;
		l_HOME_CUR_AMOUNT = null;
		l_ROUND_TYP = null;
		l_TAX_CD = null;
		l_TAX_ROUND_TYP = null;
		l_RTN_DEL_FLG = null;
		l_MODIFY_COUNT = null;
		l_NON_NO_ITEM_TYP = null;
		l_NON_NO_ITEM_NAME = null;
		l_NON_NO_ITEM_PUCH_ODR_UNIT = null;
		l_ITEM_TYP = null;
		l_PUCH_ODR_CD = null;
		l_RTN_DEL_DATE = null;
		l_UNIT_QTY_TYP = null;
		l_SPL_ITEM_TYP = null;
		l_PRODUCT_TYP = null;
		l_CLASIFICATION_CD = null;
		l_LOT_CTRL_FLG = null;
		l_MRP_ODR_TYP = null;
		l_PUCH_ODR_CD_2 = null;
		l_MRP_FLG = null;
		l_WH_TYP = null;
		l_THIS_MONTH = null;
		l_INSTALL_FLG = null;
		l_STOCK_ON_HAND_QTY = null;
		l_RCV_ISSUE_CTRL_CD = null;
		l_RCV_ISSUE_TYP = null;
		l_ACPT_NO = null;
		l_ACPT_RSLT_CRCT_NO = null;
		l_INSPEC_RSLT_CRCT_NO = null;
		l_PARTIAL_PRD_NO = null;
		l_OPR_RSLT_CRCT_NO = null;
		l_RCV_ISSUE_BEFORE_QTY = null;
		l_RCV_ISSUE_QTY = null;
		l_RCV_ISSUE_AFTER_QTY = null;
		l_RCV_ISSUE_AMOUNT = null;
		l_RCV_ISSUE_DATE = null;
		l_RCV_ISSUE_GNR_TYP = null;
		l_RCV_ISSUE_ODD_QTY = null;
		l_STOCK_UPD_TYP = null;
		l_RCV_ISSUE_CMPLT_FLG = null;
		l_CONS_TYP = null;
		l_INSPC_ACPT_NO = null;
		l_INSPC_ACPT_GNR_TYP = null;
		l_CRCT_NO = null;
		l_CRCT_TYP = null;
		l_SLIP_TYP = null;
		l_ACPT_QTY = null;
		l_INSPC_ACPT_QTY = null;
		l_INSPC_ACPT_AMOUNT = null;
		l_SAVING_AMOUNT = null;
		l_ACPT_DATE = null;
		l_INSPC_ACPT_DATE = null;
		l_SLIP_CD = null;
		l_ORGN_SLIP_CD = null;
		l_WORK_IN_PROC_CD = null;
		l_DLV_CD = null;
		l_GNR_ORG_CD = null;
		l_SBCNT_PUCH_TYP = null;
		l_PUCH_RTN_FLG = null;
		l_APPR_FLG = null;
		l_APPR_ID = null;
		l_APPR_DATE = null;
		l_PAST_RESULT_ENTRY_TYP = null;
		l_PROC_EXEC_DATE = null;
		l_AI_IF = null;
		l_PVC2BUSINESSNAME = null;
		l_PVC2OUTPUTPATH = null;
		l_PVC2OUTPUTNAME = null;
		l_PVC2LOGMODE = null;
		l_PVC2OUTPUTMODE = null;
		l_PVC2USERID = null;
		l_PVC2PLANTCD = null;
		l_PVC2TAXID = null;
		l_PNUMTAXOUTAMOUNT = null;
		l_PNUMTAXAMOUNT = null;
		l_PNUMEXTERNALTAXSALESAMOUNT = null;
		l_PNUMINTERNALTAXSALESAMOUNT = null;
		l_PNUMTAXFREESALESAMOUNT = null;
		l_PNUMEXTERNALTAXAMOUNT = null;
		l_PNUMINTERNALTAXAMOUNT = null;
		l_PVC2ERRCD = null;
		l_PNUMSTATUS = null;
		l_OLD_TAX_RATE_1 = null;
		l_OLD_TAX_RATE_2 = null;
		l_OLD_TAX_RATE_3 = null;
		l_NEW_TAX_RATE_START_DATE = null;
		l_NEW_TAX_RATE_1 = null;
		l_NEW_TAX_RATE_2 = null;
		l_NEW_TAX_RATE_3 = null;

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
	 * medAE0120010クラスの標準コンストラクタ
	 */
	public AE0120010Struct()
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
	public void setStruct(AE0120010Struct struct)
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
	public void setStructM(AE0120010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.seth_PUCH_ODR_CD(struct.geth_PUCH_ODR_CD());
			this.setUNIT_COST_TYP_name(struct.getUNIT_COST_TYP_name());
			this.setUNIT_COST_TYP_val(struct.getUNIT_COST_TYP_val());
			this.setr1_FILTER(struct.getr1_FILTER());
			this.setr2_FILTER(struct.getr2_FILTER());
			this.setHOME_CUR_UNIT(struct.getHOME_CUR_UNIT());
			this.setc_NON_NO_ITEM_FLG(struct.getc_NON_NO_ITEM_FLG());
			this.setSelectUnitCostFlag(struct.getSelectUnitCostFlag());
			this.seth_PUCH_RTN_DATE(struct.geth_PUCH_RTN_DATE());
			this.setPRODUCT_TYP_name(struct.getPRODUCT_TYP_name());
			this.setPRODUCT_TYP_val(struct.getPRODUCT_TYP_val());
			this.seth_lotCtrl(struct.geth_lotCtrl());
			this.setHOME_DECIMAL_FIG(struct.getHOME_DECIMAL_FIG());
			this.setEFF_PHASE_IN_DATE(struct.getEFF_PHASE_IN_DATE());
			this.setPUCH_SIZE(struct.getPUCH_SIZE());
			this.setEXCH_TYP(struct.getEXCH_TYP());
			this.setCUR_SYMBOL(struct.getCUR_SYMBOL());
			this.setCUR_UNIT(struct.getCUR_UNIT());
			this.setDECIMAL_FIG(struct.getDECIMAL_FIG());
			this.setTAX_APPLY_TYP(struct.getTAX_APPLY_TYP());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setVEND_CD(struct.getVEND_CD());
			this.setVEND_ANAME(struct.getVEND_ANAME());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setITEM_CD(struct.getITEM_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setJOB_ODR_DETAIL_NO(struct.getJOB_ODR_DETAIL_NO());
			this.setINV_CTRL_FLG(struct.getINV_CTRL_FLG());
			this.setPUCH_ODR_PERSON(struct.getPUCH_ODR_PERSON());
			this.setPUCH_RTN_DATE(struct.getPUCH_RTN_DATE());
			this.setPUCH_RTN_QTY(struct.getPUCH_RTN_QTY());
			this.setWH_CD(struct.getWH_CD());
			this.setWH_NAME(struct.getWH_NAME());
			this.setVEND_LOT_NO(struct.getVEND_LOT_NO());
			this.setLOT_NO(struct.getLOT_NO());
			this.setCUR_CD(struct.getCUR_CD());
			this.setCUR_NAME(struct.getCUR_NAME());
			this.setVEND_CUR_UNIT(struct.getVEND_CUR_UNIT());
			this.setVEND_DECIMAL_FIG(struct.getVEND_DECIMAL_FIG());
			this.setUSER_NAME(struct.getUSER_NAME());
			this.setUNIT_COST_TYP(struct.getUNIT_COST_TYP());
			this.setUNIT_COST(struct.getUNIT_COST());
			this.setPROCESSING_COST(struct.getPROCESSING_COST());
			this.setMATERIAL_COST(struct.getMATERIAL_COST());
			this.setOTHER_OVERHEADS(struct.getOTHER_OVERHEADS());
			this.setPUCH_ODR_AMOUNT(struct.getPUCH_ODR_AMOUNT());
			this.setDISC_AMOUNT(struct.getDISC_AMOUNT());
			this.setNET_AMOUNT(struct.getNET_AMOUNT());
			this.setPUCH_RTN_COMMENT(struct.getPUCH_RTN_COMMENT());
			this.setRATE_JUDGE_DATE(struct.getRATE_JUDGE_DATE());
			this.setEXCH_RATE(struct.getEXCH_RATE());
			this.setTAX_RATE_1(struct.getTAX_RATE_1());
			this.setTAX_RATE_2(struct.getTAX_RATE_2());
			this.setTAX_RATE_3(struct.getTAX_RATE_3());
			this.setTAX_AMOUNT_1(struct.getTAX_AMOUNT_1());
			this.setTAX_AMOUNT_2(struct.getTAX_AMOUNT_2());
			this.setTAX_AMOUNT_3(struct.getTAX_AMOUNT_3());
			this.setAMOUNT_INCLUDE_TAX(struct.getAMOUNT_INCLUDE_TAX());
			this.setHOME_CUR_AMOUNT(struct.getHOME_CUR_AMOUNT());
			this.setROUND_TYP(struct.getROUND_TYP());
			this.setTAX_CD(struct.getTAX_CD());
			this.setTAX_ROUND_TYP(struct.getTAX_ROUND_TYP());
			this.setRTN_DEL_FLG(struct.getRTN_DEL_FLG());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setNON_NO_ITEM_TYP(struct.getNON_NO_ITEM_TYP());
			this.setNON_NO_ITEM_NAME(struct.getNON_NO_ITEM_NAME());
			this.setNON_NO_ITEM_PUCH_ODR_UNIT(struct.getNON_NO_ITEM_PUCH_ODR_UNIT());
			this.setITEM_TYP(struct.getITEM_TYP());
			this.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());
			this.setRTN_DEL_DATE(struct.getRTN_DEL_DATE());
			this.setUNIT_QTY_TYP(struct.getUNIT_QTY_TYP());
			this.setSPL_ITEM_TYP(struct.getSPL_ITEM_TYP());
			this.setPRODUCT_TYP(struct.getPRODUCT_TYP());
			this.setCLASIFICATION_CD(struct.getCLASIFICATION_CD());
			this.setLOT_CTRL_FLG(struct.getLOT_CTRL_FLG());
			this.setMRP_ODR_TYP(struct.getMRP_ODR_TYP());
			this.setPUCH_ODR_CD_2(struct.getPUCH_ODR_CD_2());
			this.setMRP_FLG(struct.getMRP_FLG());
			this.setWH_TYP(struct.getWH_TYP());
			this.setTHIS_MONTH(struct.getTHIS_MONTH());
			this.setINSTALL_FLG(struct.getINSTALL_FLG());
			this.setSTOCK_ON_HAND_QTY(struct.getSTOCK_ON_HAND_QTY());
			this.setRCV_ISSUE_CTRL_CD(struct.getRCV_ISSUE_CTRL_CD());
			this.setRCV_ISSUE_TYP(struct.getRCV_ISSUE_TYP());
			this.setACPT_NO(struct.getACPT_NO());
			this.setACPT_RSLT_CRCT_NO(struct.getACPT_RSLT_CRCT_NO());
			this.setINSPEC_RSLT_CRCT_NO(struct.getINSPEC_RSLT_CRCT_NO());
			this.setPARTIAL_PRD_NO(struct.getPARTIAL_PRD_NO());
			this.setOPR_RSLT_CRCT_NO(struct.getOPR_RSLT_CRCT_NO());
			this.setRCV_ISSUE_BEFORE_QTY(struct.getRCV_ISSUE_BEFORE_QTY());
			this.setRCV_ISSUE_QTY(struct.getRCV_ISSUE_QTY());
			this.setRCV_ISSUE_AFTER_QTY(struct.getRCV_ISSUE_AFTER_QTY());
			this.setRCV_ISSUE_AMOUNT(struct.getRCV_ISSUE_AMOUNT());
			this.setRCV_ISSUE_DATE(struct.getRCV_ISSUE_DATE());
			this.setRCV_ISSUE_GNR_TYP(struct.getRCV_ISSUE_GNR_TYP());
			this.setRCV_ISSUE_ODD_QTY(struct.getRCV_ISSUE_ODD_QTY());
			this.setSTOCK_UPD_TYP(struct.getSTOCK_UPD_TYP());
			this.setRCV_ISSUE_CMPLT_FLG(struct.getRCV_ISSUE_CMPLT_FLG());
			this.setCONS_TYP(struct.getCONS_TYP());
			this.setINSPC_ACPT_NO(struct.getINSPC_ACPT_NO());
			this.setINSPC_ACPT_GNR_TYP(struct.getINSPC_ACPT_GNR_TYP());
			this.setCRCT_NO(struct.getCRCT_NO());
			this.setCRCT_TYP(struct.getCRCT_TYP());
			this.setSLIP_TYP(struct.getSLIP_TYP());
			this.setACPT_QTY(struct.getACPT_QTY());
			this.setINSPC_ACPT_QTY(struct.getINSPC_ACPT_QTY());
			this.setINSPC_ACPT_AMOUNT(struct.getINSPC_ACPT_AMOUNT());
			this.setSAVING_AMOUNT(struct.getSAVING_AMOUNT());
			this.setACPT_DATE(struct.getACPT_DATE());
			this.setINSPC_ACPT_DATE(struct.getINSPC_ACPT_DATE());
			this.setSLIP_CD(struct.getSLIP_CD());
			this.setORGN_SLIP_CD(struct.getORGN_SLIP_CD());
			this.setWORK_IN_PROC_CD(struct.getWORK_IN_PROC_CD());
			this.setDLV_CD(struct.getDLV_CD());
			this.setGNR_ORG_CD(struct.getGNR_ORG_CD());
			this.setSBCNT_PUCH_TYP(struct.getSBCNT_PUCH_TYP());
			this.setPUCH_RTN_FLG(struct.getPUCH_RTN_FLG());
			this.setAPPR_FLG(struct.getAPPR_FLG());
			this.setAPPR_ID(struct.getAPPR_ID());
			this.setAPPR_DATE(struct.getAPPR_DATE());
			this.setPAST_RESULT_ENTRY_TYP(struct.getPAST_RESULT_ENTRY_TYP());
			this.setPROC_EXEC_DATE(struct.getPROC_EXEC_DATE());
			this.setAI_IF(struct.getAI_IF());
			this.setPVC2BUSINESSNAME(struct.getPVC2BUSINESSNAME());
			this.setPVC2OUTPUTPATH(struct.getPVC2OUTPUTPATH());
			this.setPVC2OUTPUTNAME(struct.getPVC2OUTPUTNAME());
			this.setPVC2LOGMODE(struct.getPVC2LOGMODE());
			this.setPVC2OUTPUTMODE(struct.getPVC2OUTPUTMODE());
			this.setPVC2USERID(struct.getPVC2USERID());
			this.setPVC2PLANTCD(struct.getPVC2PLANTCD());
			this.setPVC2TAXID(struct.getPVC2TAXID());
			this.setPNUMTAXOUTAMOUNT(struct.getPNUMTAXOUTAMOUNT());
			this.setPNUMTAXAMOUNT(struct.getPNUMTAXAMOUNT());
			this.setPNUMEXTERNALTAXSALESAMOUNT(struct.getPNUMEXTERNALTAXSALESAMOUNT());
			this.setPNUMINTERNALTAXSALESAMOUNT(struct.getPNUMINTERNALTAXSALESAMOUNT());
			this.setPNUMTAXFREESALESAMOUNT(struct.getPNUMTAXFREESALESAMOUNT());
			this.setPNUMEXTERNALTAXAMOUNT(struct.getPNUMEXTERNALTAXAMOUNT());
			this.setPNUMINTERNALTAXAMOUNT(struct.getPNUMINTERNALTAXAMOUNT());
			this.setPVC2ERRCD(struct.getPVC2ERRCD());
			this.setPNUMSTATUS(struct.getPNUMSTATUS());
			this.setOLD_TAX_RATE_1(struct.getOLD_TAX_RATE_1());
			this.setOLD_TAX_RATE_2(struct.getOLD_TAX_RATE_2());
			this.setOLD_TAX_RATE_3(struct.getOLD_TAX_RATE_3());
			this.setNEW_TAX_RATE_START_DATE(struct.getNEW_TAX_RATE_START_DATE());
			this.setNEW_TAX_RATE_1(struct.getNEW_TAX_RATE_1());
			this.setNEW_TAX_RATE_2(struct.getNEW_TAX_RATE_2());
			this.setNEW_TAX_RATE_3(struct.getNEW_TAX_RATE_3());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AE0120010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_h_PUCH_ODR_CD(struct.getList_h_PUCH_ODR_CD());
			this.setList_UNIT_COST_TYP_name(struct.getList_UNIT_COST_TYP_name());
			this.setList_UNIT_COST_TYP_val(struct.getList_UNIT_COST_TYP_val());
			this.setList_r1_FILTER(struct.getList_r1_FILTER());
			this.setList_r2_FILTER(struct.getList_r2_FILTER());
			this.setList_HOME_CUR_UNIT(struct.getList_HOME_CUR_UNIT());
			this.setList_c_NON_NO_ITEM_FLG(struct.getList_c_NON_NO_ITEM_FLG());
			this.setList_SelectUnitCostFlag(struct.getList_SelectUnitCostFlag());
			this.setList_h_PUCH_RTN_DATE(struct.getList_h_PUCH_RTN_DATE());
			this.setList_PRODUCT_TYP_name(struct.getList_PRODUCT_TYP_name());
			this.setList_PRODUCT_TYP_val(struct.getList_PRODUCT_TYP_val());
			this.setList_h_lotCtrl(struct.getList_h_lotCtrl());
			this.setList_HOME_DECIMAL_FIG(struct.getList_HOME_DECIMAL_FIG());
			this.setList_EFF_PHASE_IN_DATE(struct.getList_EFF_PHASE_IN_DATE());
			this.setList_PUCH_SIZE(struct.getList_PUCH_SIZE());
			this.setList_EXCH_TYP(struct.getList_EXCH_TYP());
			this.setList_CUR_SYMBOL(struct.getList_CUR_SYMBOL());
			this.setList_CUR_UNIT(struct.getList_CUR_UNIT());
			this.setList_DECIMAL_FIG(struct.getList_DECIMAL_FIG());
			this.setList_TAX_APPLY_TYP(struct.getList_TAX_APPLY_TYP());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_VEND_ANAME(struct.getList_VEND_ANAME());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_JOB_ODR_DETAIL_NO(struct.getList_JOB_ODR_DETAIL_NO());
			this.setList_INV_CTRL_FLG(struct.getList_INV_CTRL_FLG());
			this.setList_PUCH_ODR_PERSON(struct.getList_PUCH_ODR_PERSON());
			this.setList_PUCH_RTN_DATE(struct.getList_PUCH_RTN_DATE());
			this.setList_PUCH_RTN_QTY(struct.getList_PUCH_RTN_QTY());
			this.setList_WH_CD(struct.getList_WH_CD());
			this.setList_WH_NAME(struct.getList_WH_NAME());
			this.setList_VEND_LOT_NO(struct.getList_VEND_LOT_NO());
			this.setList_LOT_NO(struct.getList_LOT_NO());
			this.setList_CUR_CD(struct.getList_CUR_CD());
			this.setList_CUR_NAME(struct.getList_CUR_NAME());
			this.setList_VEND_CUR_UNIT(struct.getList_VEND_CUR_UNIT());
			this.setList_VEND_DECIMAL_FIG(struct.getList_VEND_DECIMAL_FIG());
			this.setList_USER_NAME(struct.getList_USER_NAME());
			this.setList_UNIT_COST_TYP(struct.getList_UNIT_COST_TYP());
			this.setList_UNIT_COST(struct.getList_UNIT_COST());
			this.setList_PROCESSING_COST(struct.getList_PROCESSING_COST());
			this.setList_MATERIAL_COST(struct.getList_MATERIAL_COST());
			this.setList_OTHER_OVERHEADS(struct.getList_OTHER_OVERHEADS());
			this.setList_PUCH_ODR_AMOUNT(struct.getList_PUCH_ODR_AMOUNT());
			this.setList_DISC_AMOUNT(struct.getList_DISC_AMOUNT());
			this.setList_NET_AMOUNT(struct.getList_NET_AMOUNT());
			this.setList_PUCH_RTN_COMMENT(struct.getList_PUCH_RTN_COMMENT());
			this.setList_RATE_JUDGE_DATE(struct.getList_RATE_JUDGE_DATE());
			this.setList_EXCH_RATE(struct.getList_EXCH_RATE());
			this.setList_TAX_RATE_1(struct.getList_TAX_RATE_1());
			this.setList_TAX_RATE_2(struct.getList_TAX_RATE_2());
			this.setList_TAX_RATE_3(struct.getList_TAX_RATE_3());
			this.setList_TAX_AMOUNT_1(struct.getList_TAX_AMOUNT_1());
			this.setList_TAX_AMOUNT_2(struct.getList_TAX_AMOUNT_2());
			this.setList_TAX_AMOUNT_3(struct.getList_TAX_AMOUNT_3());
			this.setList_AMOUNT_INCLUDE_TAX(struct.getList_AMOUNT_INCLUDE_TAX());
			this.setList_HOME_CUR_AMOUNT(struct.getList_HOME_CUR_AMOUNT());
			this.setList_ROUND_TYP(struct.getList_ROUND_TYP());
			this.setList_TAX_CD(struct.getList_TAX_CD());
			this.setList_TAX_ROUND_TYP(struct.getList_TAX_ROUND_TYP());
			this.setList_RTN_DEL_FLG(struct.getList_RTN_DEL_FLG());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_NON_NO_ITEM_TYP(struct.getList_NON_NO_ITEM_TYP());
			this.setList_NON_NO_ITEM_NAME(struct.getList_NON_NO_ITEM_NAME());
			this.setList_NON_NO_ITEM_PUCH_ODR_UNIT(struct.getList_NON_NO_ITEM_PUCH_ODR_UNIT());
			this.setList_ITEM_TYP(struct.getList_ITEM_TYP());
			this.setList_PUCH_ODR_CD(struct.getList_PUCH_ODR_CD());
			this.setList_RTN_DEL_DATE(struct.getList_RTN_DEL_DATE());
			this.setList_UNIT_QTY_TYP(struct.getList_UNIT_QTY_TYP());
			this.setList_SPL_ITEM_TYP(struct.getList_SPL_ITEM_TYP());
			this.setList_PRODUCT_TYP(struct.getList_PRODUCT_TYP());
			this.setList_CLASIFICATION_CD(struct.getList_CLASIFICATION_CD());
			this.setList_LOT_CTRL_FLG(struct.getList_LOT_CTRL_FLG());
			this.setList_MRP_ODR_TYP(struct.getList_MRP_ODR_TYP());
			this.setList_PUCH_ODR_CD_2(struct.getList_PUCH_ODR_CD_2());
			this.setList_MRP_FLG(struct.getList_MRP_FLG());
			this.setList_WH_TYP(struct.getList_WH_TYP());
			this.setList_THIS_MONTH(struct.getList_THIS_MONTH());
			this.setList_INSTALL_FLG(struct.getList_INSTALL_FLG());
			this.setList_STOCK_ON_HAND_QTY(struct.getList_STOCK_ON_HAND_QTY());
			this.setList_RCV_ISSUE_CTRL_CD(struct.getList_RCV_ISSUE_CTRL_CD());
			this.setList_RCV_ISSUE_TYP(struct.getList_RCV_ISSUE_TYP());
			this.setList_ACPT_NO(struct.getList_ACPT_NO());
			this.setList_ACPT_RSLT_CRCT_NO(struct.getList_ACPT_RSLT_CRCT_NO());
			this.setList_INSPEC_RSLT_CRCT_NO(struct.getList_INSPEC_RSLT_CRCT_NO());
			this.setList_PARTIAL_PRD_NO(struct.getList_PARTIAL_PRD_NO());
			this.setList_OPR_RSLT_CRCT_NO(struct.getList_OPR_RSLT_CRCT_NO());
			this.setList_RCV_ISSUE_BEFORE_QTY(struct.getList_RCV_ISSUE_BEFORE_QTY());
			this.setList_RCV_ISSUE_QTY(struct.getList_RCV_ISSUE_QTY());
			this.setList_RCV_ISSUE_AFTER_QTY(struct.getList_RCV_ISSUE_AFTER_QTY());
			this.setList_RCV_ISSUE_AMOUNT(struct.getList_RCV_ISSUE_AMOUNT());
			this.setList_RCV_ISSUE_DATE(struct.getList_RCV_ISSUE_DATE());
			this.setList_RCV_ISSUE_GNR_TYP(struct.getList_RCV_ISSUE_GNR_TYP());
			this.setList_RCV_ISSUE_ODD_QTY(struct.getList_RCV_ISSUE_ODD_QTY());
			this.setList_STOCK_UPD_TYP(struct.getList_STOCK_UPD_TYP());
			this.setList_RCV_ISSUE_CMPLT_FLG(struct.getList_RCV_ISSUE_CMPLT_FLG());
			this.setList_CONS_TYP(struct.getList_CONS_TYP());
			this.setList_INSPC_ACPT_NO(struct.getList_INSPC_ACPT_NO());
			this.setList_INSPC_ACPT_GNR_TYP(struct.getList_INSPC_ACPT_GNR_TYP());
			this.setList_CRCT_NO(struct.getList_CRCT_NO());
			this.setList_CRCT_TYP(struct.getList_CRCT_TYP());
			this.setList_SLIP_TYP(struct.getList_SLIP_TYP());
			this.setList_ACPT_QTY(struct.getList_ACPT_QTY());
			this.setList_INSPC_ACPT_QTY(struct.getList_INSPC_ACPT_QTY());
			this.setList_INSPC_ACPT_AMOUNT(struct.getList_INSPC_ACPT_AMOUNT());
			this.setList_SAVING_AMOUNT(struct.getList_SAVING_AMOUNT());
			this.setList_ACPT_DATE(struct.getList_ACPT_DATE());
			this.setList_INSPC_ACPT_DATE(struct.getList_INSPC_ACPT_DATE());
			this.setList_SLIP_CD(struct.getList_SLIP_CD());
			this.setList_ORGN_SLIP_CD(struct.getList_ORGN_SLIP_CD());
			this.setList_WORK_IN_PROC_CD(struct.getList_WORK_IN_PROC_CD());
			this.setList_DLV_CD(struct.getList_DLV_CD());
			this.setList_GNR_ORG_CD(struct.getList_GNR_ORG_CD());
			this.setList_SBCNT_PUCH_TYP(struct.getList_SBCNT_PUCH_TYP());
			this.setList_PUCH_RTN_FLG(struct.getList_PUCH_RTN_FLG());
			this.setList_APPR_FLG(struct.getList_APPR_FLG());
			this.setList_APPR_ID(struct.getList_APPR_ID());
			this.setList_APPR_DATE(struct.getList_APPR_DATE());
			this.setList_PAST_RESULT_ENTRY_TYP(struct.getList_PAST_RESULT_ENTRY_TYP());
			this.setList_PROC_EXEC_DATE(struct.getList_PROC_EXEC_DATE());
			this.setList_AI_IF(struct.getList_AI_IF());
			this.setList_PVC2BUSINESSNAME(struct.getList_PVC2BUSINESSNAME());
			this.setList_PVC2OUTPUTPATH(struct.getList_PVC2OUTPUTPATH());
			this.setList_PVC2OUTPUTNAME(struct.getList_PVC2OUTPUTNAME());
			this.setList_PVC2LOGMODE(struct.getList_PVC2LOGMODE());
			this.setList_PVC2OUTPUTMODE(struct.getList_PVC2OUTPUTMODE());
			this.setList_PVC2USERID(struct.getList_PVC2USERID());
			this.setList_PVC2PLANTCD(struct.getList_PVC2PLANTCD());
			this.setList_PVC2TAXID(struct.getList_PVC2TAXID());
			this.setList_PNUMTAXOUTAMOUNT(struct.getList_PNUMTAXOUTAMOUNT());
			this.setList_PNUMTAXAMOUNT(struct.getList_PNUMTAXAMOUNT());
			this.setList_PNUMEXTERNALTAXSALESAMOUNT(struct.getList_PNUMEXTERNALTAXSALESAMOUNT());
			this.setList_PNUMINTERNALTAXSALESAMOUNT(struct.getList_PNUMINTERNALTAXSALESAMOUNT());
			this.setList_PNUMTAXFREESALESAMOUNT(struct.getList_PNUMTAXFREESALESAMOUNT());
			this.setList_PNUMEXTERNALTAXAMOUNT(struct.getList_PNUMEXTERNALTAXAMOUNT());
			this.setList_PNUMINTERNALTAXAMOUNT(struct.getList_PNUMINTERNALTAXAMOUNT());
			this.setList_PVC2ERRCD(struct.getList_PVC2ERRCD());
			this.setList_PNUMSTATUS(struct.getList_PNUMSTATUS());
			this.setList_OLD_TAX_RATE_1(struct.getList_OLD_TAX_RATE_1());
			this.setList_OLD_TAX_RATE_2(struct.getList_OLD_TAX_RATE_2());
			this.setList_OLD_TAX_RATE_3(struct.getList_OLD_TAX_RATE_3());
			this.setList_NEW_TAX_RATE_START_DATE(struct.getList_NEW_TAX_RATE_START_DATE());
			this.setList_NEW_TAX_RATE_1(struct.getList_NEW_TAX_RATE_1());
			this.setList_NEW_TAX_RATE_2(struct.getList_NEW_TAX_RATE_2());
			this.setList_NEW_TAX_RATE_3(struct.getList_NEW_TAX_RATE_3());
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
	// 第 1 変数初期値： i_h_PUCH_ODR_CD


	final static String i_h_PUCH_ODR_CD = null;

	// 第 2 変数初期値： i_UNIT_COST_TYP_name


	final static String i_UNIT_COST_TYP_name = null;

	// 第 3 変数初期値： i_UNIT_COST_TYP_val


	final static String i_UNIT_COST_TYP_val = null;

	// 第 4 変数初期値： i_r1_FILTER


	final static String i_r1_FILTER = null;

	// 第 5 変数初期値： i_r2_FILTER


	final static String i_r2_FILTER = null;

	// 第 6 変数初期値： i_HOME_CUR_UNIT


	final static String i_HOME_CUR_UNIT = null;

	// 第 7 変数初期値： i_c_NON_NO_ITEM_FLG


	final static String i_c_NON_NO_ITEM_FLG = null;

	// 第 8 変数初期値： i_SelectUnitCostFlag


	final static String i_SelectUnitCostFlag = null;

	// 第 9 変数初期値： i_h_PUCH_RTN_DATE


	final static String i_h_PUCH_RTN_DATE = null;

	// 第 10 変数初期値： i_PRODUCT_TYP_name


	final static String i_PRODUCT_TYP_name = null;

	// 第 11 変数初期値： i_PRODUCT_TYP_val


	final static String i_PRODUCT_TYP_val = null;

	// 第 12 変数初期値： i_h_lotCtrl


	final static String i_h_lotCtrl = null;

	// 第 13 変数初期値： i_HOME_DECIMAL_FIG


	final static String i_HOME_DECIMAL_FIG = null;

	// 第 14 変数初期値： i_EFF_PHASE_IN_DATE


	final static String i_EFF_PHASE_IN_DATE = null;

	// 第 15 変数初期値： i_PUCH_SIZE


	final static String i_PUCH_SIZE = null;

	// 第 16 変数初期値： i_EXCH_TYP


	final static String i_EXCH_TYP = null;

	// 第 17 変数初期値： i_CUR_SYMBOL


	final static String i_CUR_SYMBOL = null;

	// 第 18 変数初期値： i_CUR_UNIT


	final static String i_CUR_UNIT = null;

	// 第 19 変数初期値： i_DECIMAL_FIG


	final static String i_DECIMAL_FIG = null;

	// 第 20 変数初期値： i_TAX_APPLY_TYP


	final static String i_TAX_APPLY_TYP = null;

	// 第 21 変数初期値： i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// 第 22 変数初期値： i_VEND_CD


	final static String i_VEND_CD = null;

	// 第 23 変数初期値： i_VEND_ANAME


	final static String i_VEND_ANAME = null;

	// 第 24 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

	// 第 25 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 26 変数初期値： i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// 第 27 変数初期値： i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// 第 28 変数初期値： i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// 第 29 変数初期値： i_JOB_ODR_DETAIL_NO


	final static String i_JOB_ODR_DETAIL_NO = null;

	// 第 30 変数初期値： i_INV_CTRL_FLG


	final static String i_INV_CTRL_FLG = null;

	// 第 31 変数初期値： i_PUCH_ODR_PERSON


	final static String i_PUCH_ODR_PERSON = null;

	// 第 32 変数初期値： i_PUCH_RTN_DATE


	final static String i_PUCH_RTN_DATE = null;

	// 第 33 変数初期値： i_PUCH_RTN_QTY


	final static String i_PUCH_RTN_QTY = null;

	// 第 34 変数初期値： i_WH_CD


	final static String i_WH_CD = null;

	// 第 35 変数初期値： i_WH_NAME


	final static String i_WH_NAME = null;

	// 第 36 変数初期値： i_VEND_LOT_NO


	final static String i_VEND_LOT_NO = null;

	// 第 37 変数初期値： i_LOT_NO


	final static String i_LOT_NO = null;

	// 第 38 変数初期値： i_CUR_CD


	final static String i_CUR_CD = null;

	// 第 39 変数初期値： i_CUR_NAME


	final static String i_CUR_NAME = null;

	// 第 40 変数初期値： i_VEND_CUR_UNIT


	final static String i_VEND_CUR_UNIT = null;

	// 第 41 変数初期値： i_VEND_DECIMAL_FIG


	final static String i_VEND_DECIMAL_FIG = null;

	// 第 42 変数初期値： i_USER_NAME


	final static String i_USER_NAME = null;

	// 第 43 変数初期値： i_UNIT_COST_TYP


	final static String i_UNIT_COST_TYP = null;

	// 第 44 変数初期値： i_UNIT_COST


	final static String i_UNIT_COST = null;

	// 第 45 変数初期値： i_PROCESSING_COST


	final static String i_PROCESSING_COST = null;

	// 第 46 変数初期値： i_MATERIAL_COST


	final static String i_MATERIAL_COST = null;

	// 第 47 変数初期値： i_OTHER_OVERHEADS


	final static String i_OTHER_OVERHEADS = null;

	// 第 48 変数初期値： i_PUCH_ODR_AMOUNT


	final static String i_PUCH_ODR_AMOUNT = null;

	// 第 49 変数初期値： i_DISC_AMOUNT


	final static String i_DISC_AMOUNT = null;

	// 第 50 変数初期値： i_NET_AMOUNT


	final static String i_NET_AMOUNT = null;

	// 第 51 変数初期値： i_PUCH_RTN_COMMENT


	final static String i_PUCH_RTN_COMMENT = null;

	// 第 52 変数初期値： i_RATE_JUDGE_DATE


	final static String i_RATE_JUDGE_DATE = null;

	// 第 53 変数初期値： i_EXCH_RATE


	final static String i_EXCH_RATE = null;

	// 第 54 変数初期値： i_TAX_RATE_1


	final static String i_TAX_RATE_1 = null;

	// 第 55 変数初期値： i_TAX_RATE_2


	final static String i_TAX_RATE_2 = null;

	// 第 56 変数初期値： i_TAX_RATE_3


	final static String i_TAX_RATE_3 = null;

	// 第 57 変数初期値： i_TAX_AMOUNT_1


	final static String i_TAX_AMOUNT_1 = null;

	// 第 58 変数初期値： i_TAX_AMOUNT_2


	final static String i_TAX_AMOUNT_2 = null;

	// 第 59 変数初期値： i_TAX_AMOUNT_3


	final static String i_TAX_AMOUNT_3 = null;

	// 第 60 変数初期値： i_AMOUNT_INCLUDE_TAX


	final static String i_AMOUNT_INCLUDE_TAX = null;

	// 第 61 変数初期値： i_HOME_CUR_AMOUNT


	final static String i_HOME_CUR_AMOUNT = null;

	// 第 62 変数初期値： i_ROUND_TYP


	final static String i_ROUND_TYP = null;

	// 第 63 変数初期値： i_TAX_CD


	final static String i_TAX_CD = null;

	// 第 64 変数初期値： i_TAX_ROUND_TYP


	final static String i_TAX_ROUND_TYP = null;

	// 第 65 変数初期値： i_RTN_DEL_FLG


	final static String i_RTN_DEL_FLG = null;

	// 第 66 変数初期値： i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// 第 67 変数初期値： i_NON_NO_ITEM_TYP


	final static String i_NON_NO_ITEM_TYP = null;

	// 第 68 変数初期値： i_NON_NO_ITEM_NAME


	final static String i_NON_NO_ITEM_NAME = null;

	// 第 69 変数初期値： i_NON_NO_ITEM_PUCH_ODR_UNIT


	final static String i_NON_NO_ITEM_PUCH_ODR_UNIT = null;

	// 第 70 変数初期値： i_ITEM_TYP


	final static String i_ITEM_TYP = null;

	// 第 71 変数初期値： i_PUCH_ODR_CD


	final static String i_PUCH_ODR_CD = null;

	// 第 72 変数初期値： i_RTN_DEL_DATE


	final static String i_RTN_DEL_DATE = null;

	// 第 73 変数初期値： i_UNIT_QTY_TYP


	final static String i_UNIT_QTY_TYP = null;

	// 第 74 変数初期値： i_SPL_ITEM_TYP


	final static String i_SPL_ITEM_TYP = null;

	// 第 75 変数初期値： i_PRODUCT_TYP


	final static String i_PRODUCT_TYP = null;

	// 第 76 変数初期値： i_CLASIFICATION_CD


	final static String i_CLASIFICATION_CD = null;

	// 第 77 変数初期値： i_LOT_CTRL_FLG


	final static String i_LOT_CTRL_FLG = null;

	// 第 78 変数初期値： i_MRP_ODR_TYP


	final static String i_MRP_ODR_TYP = null;

	// 第 79 変数初期値： i_PUCH_ODR_CD_2


	final static String i_PUCH_ODR_CD_2 = null;

	// 第 80 変数初期値： i_MRP_FLG


	final static String i_MRP_FLG = null;

	// 第 81 変数初期値： i_WH_TYP


	final static String i_WH_TYP = null;

	// 第 82 変数初期値： i_THIS_MONTH


	final static String i_THIS_MONTH = null;

	// 第 83 変数初期値： i_INSTALL_FLG


	final static String i_INSTALL_FLG = null;

	// 第 84 変数初期値： i_STOCK_ON_HAND_QTY


	final static String i_STOCK_ON_HAND_QTY = null;

	// 第 85 変数初期値： i_RCV_ISSUE_CTRL_CD


	final static String i_RCV_ISSUE_CTRL_CD = null;

	// 第 86 変数初期値： i_RCV_ISSUE_TYP


	final static String i_RCV_ISSUE_TYP = null;

	// 第 87 変数初期値： i_ACPT_NO


	final static String i_ACPT_NO = null;

	// 第 88 変数初期値： i_ACPT_RSLT_CRCT_NO


	final static String i_ACPT_RSLT_CRCT_NO = null;

	// 第 89 変数初期値： i_INSPEC_RSLT_CRCT_NO


	final static String i_INSPEC_RSLT_CRCT_NO = null;

	// 第 90 変数初期値： i_PARTIAL_PRD_NO


	final static String i_PARTIAL_PRD_NO = null;

	// 第 91 変数初期値： i_OPR_RSLT_CRCT_NO


	final static String i_OPR_RSLT_CRCT_NO = null;

	// 第 92 変数初期値： i_RCV_ISSUE_BEFORE_QTY


	final static String i_RCV_ISSUE_BEFORE_QTY = null;

	// 第 93 変数初期値： i_RCV_ISSUE_QTY


	final static String i_RCV_ISSUE_QTY = null;

	// 第 94 変数初期値： i_RCV_ISSUE_AFTER_QTY


	final static String i_RCV_ISSUE_AFTER_QTY = null;

	// 第 95 変数初期値： i_RCV_ISSUE_AMOUNT


	final static String i_RCV_ISSUE_AMOUNT = null;

	// 第 96 変数初期値： i_RCV_ISSUE_DATE


	final static String i_RCV_ISSUE_DATE = null;

	// 第 97 変数初期値： i_RCV_ISSUE_GNR_TYP


	final static String i_RCV_ISSUE_GNR_TYP = null;

	// 第 98 変数初期値： i_RCV_ISSUE_ODD_QTY


	final static String i_RCV_ISSUE_ODD_QTY = null;

	// 第 99 変数初期値： i_STOCK_UPD_TYP


	final static String i_STOCK_UPD_TYP = null;

	// 第 100 変数初期値： i_RCV_ISSUE_CMPLT_FLG


	final static String i_RCV_ISSUE_CMPLT_FLG = null;

	// 第 101 変数初期値： i_CONS_TYP


	final static String i_CONS_TYP = null;

	// 第 102 変数初期値： i_INSPC_ACPT_NO


	final static String i_INSPC_ACPT_NO = null;

	// 第 103 変数初期値： i_INSPC_ACPT_GNR_TYP


	final static String i_INSPC_ACPT_GNR_TYP = null;

	// 第 104 変数初期値： i_CRCT_NO


	final static String i_CRCT_NO = null;

	// 第 105 変数初期値： i_CRCT_TYP


	final static String i_CRCT_TYP = null;

	// 第 106 変数初期値： i_SLIP_TYP


	final static String i_SLIP_TYP = null;

	// 第 107 変数初期値： i_ACPT_QTY


	final static String i_ACPT_QTY = null;

	// 第 108 変数初期値： i_INSPC_ACPT_QTY


	final static String i_INSPC_ACPT_QTY = null;

	// 第 109 変数初期値： i_INSPC_ACPT_AMOUNT


	final static String i_INSPC_ACPT_AMOUNT = null;

	// 第 110 変数初期値： i_SAVING_AMOUNT


	final static String i_SAVING_AMOUNT = null;

	// 第 111 変数初期値： i_ACPT_DATE


	final static String i_ACPT_DATE = null;

	// 第 112 変数初期値： i_INSPC_ACPT_DATE


	final static String i_INSPC_ACPT_DATE = null;

	// 第 113 変数初期値： i_SLIP_CD


	final static String i_SLIP_CD = null;

	// 第 114 変数初期値： i_ORGN_SLIP_CD


	final static String i_ORGN_SLIP_CD = null;

	// 第 115 変数初期値： i_WORK_IN_PROC_CD


	final static String i_WORK_IN_PROC_CD = null;

	// 第 116 変数初期値： i_DLV_CD


	final static String i_DLV_CD = null;

	// 第 117 変数初期値： i_GNR_ORG_CD


	final static String i_GNR_ORG_CD = null;

	// 第 118 変数初期値： i_SBCNT_PUCH_TYP


	final static String i_SBCNT_PUCH_TYP = null;

	// 第 119 変数初期値： i_PUCH_RTN_FLG


	final static String i_PUCH_RTN_FLG = null;

	// 第 120 変数初期値： i_APPR_FLG


	final static String i_APPR_FLG = null;

	// 第 121 変数初期値： i_APPR_ID


	final static String i_APPR_ID = null;

	// 第 122 変数初期値： i_APPR_DATE


	final static String i_APPR_DATE = null;

	// 第 123 変数初期値： i_PAST_RESULT_ENTRY_TYP


	final static String i_PAST_RESULT_ENTRY_TYP = null;

	// 第 124 変数初期値： i_PROC_EXEC_DATE


	final static BigDecimal i_PROC_EXEC_DATE = null;

	// 第 125 変数初期値： i_AI_IF


	final static String i_AI_IF = null;

	// 第 126 変数初期値： i_PVC2BUSINESSNAME


	final static String i_PVC2BUSINESSNAME = null;

	// 第 127 変数初期値： i_PVC2OUTPUTPATH


	final static String i_PVC2OUTPUTPATH = null;

	// 第 128 変数初期値： i_PVC2OUTPUTNAME


	final static String i_PVC2OUTPUTNAME = null;

	// 第 129 変数初期値： i_PVC2LOGMODE


	final static String i_PVC2LOGMODE = null;

	// 第 130 変数初期値： i_PVC2OUTPUTMODE


	final static String i_PVC2OUTPUTMODE = null;

	// 第 131 変数初期値： i_PVC2USERID


	final static String i_PVC2USERID = null;

	// 第 132 変数初期値： i_PVC2PLANTCD


	final static String i_PVC2PLANTCD = null;

	// 第 133 変数初期値： i_PVC2TAXID


	final static String i_PVC2TAXID = null;

	// 第 134 変数初期値： i_PNUMTAXOUTAMOUNT


	final static String i_PNUMTAXOUTAMOUNT = null;

	// 第 135 変数初期値： i_PNUMTAXAMOUNT


	final static String i_PNUMTAXAMOUNT = null;

	// 第 136 変数初期値： i_PNUMEXTERNALTAXSALESAMOUNT


	final static String i_PNUMEXTERNALTAXSALESAMOUNT = null;

	// 第 137 変数初期値： i_PNUMINTERNALTAXSALESAMOUNT


	final static String i_PNUMINTERNALTAXSALESAMOUNT = null;

	// 第 138 変数初期値： i_PNUMTAXFREESALESAMOUNT


	final static String i_PNUMTAXFREESALESAMOUNT = null;

	// 第 139 変数初期値： i_PNUMEXTERNALTAXAMOUNT


	final static String i_PNUMEXTERNALTAXAMOUNT = null;

	// 第 140 変数初期値： i_PNUMINTERNALTAXAMOUNT


	final static String i_PNUMINTERNALTAXAMOUNT = null;

	// 第 141 変数初期値： i_PVC2ERRCD


	final static String i_PVC2ERRCD = null;

	// 第 142 変数初期値： i_PNUMSTATUS


	final static String i_PNUMSTATUS = null;

	// 第 143 変数初期値： i_OLD_TAX_RATE_1


	final static String i_OLD_TAX_RATE_1 = null;

	// 第 144 変数初期値： i_OLD_TAX_RATE_2


	final static String i_OLD_TAX_RATE_2 = null;

	// 第 145 変数初期値： i_OLD_TAX_RATE_3


	final static String i_OLD_TAX_RATE_3 = null;

	// 第 146 変数初期値： i_NEW_TAX_RATE_START_DATE


	final static String i_NEW_TAX_RATE_START_DATE = null;

	// 第 147 変数初期値： i_NEW_TAX_RATE_1


	final static String i_NEW_TAX_RATE_1 = null;

	// 第 148 変数初期値： i_NEW_TAX_RATE_2


	final static String i_NEW_TAX_RATE_2 = null;

	// 第 149 変数初期値： i_NEW_TAX_RATE_3


	final static String i_NEW_TAX_RATE_3 = null;

*/

	//{{user_implement_code
		// TODO: 初期化で使う定数は、ここに記述してください。
		// 以下に記述した内容は自動的には変更されません。
	// 第 1 変数初期値： i_h_PUCH_ODR_CD

	final static String i_h_PUCH_ODR_CD = null;

	// 第 2 変数初期値： i_STOCK_UNIT

	final static String i_STOCK_UNIT = null;

	// 第 3 変数初期値： i_WH_NAME

	final static String i_WH_NAME = null;

	// 第 4 変数初期値： i_UNIT_COST_TYP_name

	final static String i_UNIT_COST_TYP_name = null;

	// 第 5 変数初期値： i_UNIT_COST_TYP_val

	final static String i_UNIT_COST_TYP_val = null;

	// 第 6 変数初期値： i_USER_NAME

	final static String i_USER_NAME = null;

	// 第 7 変数初期値： i_VEND_CUR_UNIT

	final static String i_VEND_CUR_UNIT = null;

	// 第 8 変数初期値： i_r1_FILTER

	final static String i_r1_FILTER = null;

	// 第 9 変数初期値： i_r2_FILTER

	final static String i_r2_FILTER = null;

	// 第 10 変数初期値： i_HOME_CUR_UNIT

	final static String i_HOME_CUR_UNIT = null;

	// 第 11 変数初期値： i_c_NON_NO_ITEM_FLG

	final static String i_c_NON_NO_ITEM_FLG = null;

	// 第 12 変数初期値： i_HOME_DECIMAL_FIG

	final static String i_HOME_DECIMAL_FIG = null;

	// 第 13 変数初期値： i_TAX_ROUND_TYP

	final static String i_TAX_ROUND_TYP = null;

	// 第 14 変数初期値： i_ROUND_TYP

	final static String i_ROUND_TYP = null;

	// 第 15 変数初期値： i_VEND_DECIMAL_FIG

	final static String i_VEND_DECIMAL_FIG = null;

	// 第 16 変数初期値： i_COMPANY_CD

	final static String i_COMPANY_CD = null;

	// 第 17 変数初期値： i_VEND_CD

	final static String i_VEND_CD = null;

	// 第 18 変数初期値： i_PLANT_CD

	final static String i_PLANT_CD = null;

	// 第 19 変数初期値： i_ITEM_CD

	final static String i_ITEM_CD = null;

	// 第 20 変数初期値： i_JOB_ODR_CD

	final static String i_JOB_ODR_CD = null;

	// 第 21 変数初期値： i_JOB_ODR_DETAIL_NO

	final static String i_JOB_ODR_DETAIL_NO = null;

	// 第 22 変数初期値： i_INV_CTRL_FLG

	final static String i_INV_CTRL_FLG = null;

	// 第 23 変数初期値： i_PUCH_ODR_PERSON

	final static String i_PUCH_ODR_PERSON = null;

	// 第 24 変数初期値： i_PUCH_RTN_DATE

	final static String i_PUCH_RTN_DATE = null;

	// 第 25 変数初期値： i_PUCH_RTN_QTY

	final static String i_PUCH_RTN_QTY = null;

	// 第 26 変数初期値： i_WH_CD

	final static String i_WH_CD = null;

	// 第 27 変数初期値： i_VEND_LOT_NO

	final static String i_VEND_LOT_NO = null;

	// 第 28 変数初期値： i_UNIT_COST_TYP

	final static String i_UNIT_COST_TYP = null;

	// 第 29 変数初期値： i_UNIT_COST

	final static String i_UNIT_COST = null;

	// 第 30 変数初期値： i_PROCESSING_COST

	final static String i_PROCESSING_COST = null;

	// 第 31 変数初期値： i_MATERIAL_COST

	final static String i_MATERIAL_COST = null;

	// 第 32 変数初期値： i_OTHER_OVERHEADS

	final static String i_OTHER_OVERHEADS = null;

	// 第 33 変数初期値： i_PUCH_ODR_AMOUNT

	final static String i_PUCH_ODR_AMOUNT = null;

	// 第 34 変数初期値： i_DISC_AMOUNT

	final static String i_DISC_AMOUNT = null;

	// 第 35 変数初期値： i_NET_AMOUNT

	final static String i_NET_AMOUNT = null;

	// 第 36 変数初期値： i_PUCH_RTN_COMMENT

	final static String i_PUCH_RTN_COMMENT = null;

	// 第 37 変数初期値： i_RATE_JUDGE_DATE

	final static String i_RATE_JUDGE_DATE = null;

	// 第 38 変数初期値： i_EXCH_RATE

	final static String i_EXCH_RATE = null;

	// 第 39 変数初期値： i_TAX_RATE_1

	final static String i_TAX_RATE_1 = null;

	// 第 40 変数初期値： i_TAX_RATE_2

	final static String i_TAX_RATE_2 = null;

	// 第 41 変数初期値： i_TAX_RATE_3

	final static String i_TAX_RATE_3 = null;

	// 第 42 変数初期値： i_TAX_AMOUNT_1

	final static String i_TAX_AMOUNT_1 = null;

	// 第 43 変数初期値： i_TAX_AMOUNT_2

	final static String i_TAX_AMOUNT_2 = null;

	// 第 44 変数初期値： i_TAX_AMOUNT_3

	final static String i_TAX_AMOUNT_3 = null;

	// 第 45 変数初期値： i_AMOUNT_INCLUDE_TAX

	final static String i_AMOUNT_INCLUDE_TAX = null;

	// 第 46 変数初期値： i_HOME_CUR_AMOUNT

	final static String i_HOME_CUR_AMOUNT = null;

	// 第 47 変数初期値： i_TAX_CD

	final static String i_TAX_CD = null;

	// 第 48 変数初期値： i_RTN_DEL_FLG

	final static String i_RTN_DEL_FLG = null;

	// 第 49 変数初期値： i_MODIFY_COUNT

	final static String i_MODIFY_COUNT = null;

	// 第 50 変数初期値： i_PUCH_ODR_CD

	final static String i_PUCH_ODR_CD = null;

	// 第 51 変数初期値： i_VEND_ANAME

	final static String i_VEND_ANAME = null;

	// 第 52 変数初期値： i_ITEM_NAME

	final static String i_ITEM_NAME = null;

	// 第 53 変数初期値： i_UNIT_QTY_TYP

	final static String i_UNIT_QTY_TYP = null;

	// 第 54 変数初期値： i_PUCH_ODR_CD_2

	final static String i_PUCH_ODR_CD_2 = null;


	/**
	 * 初期化
	 *
	 */
	public void initialize()
	{

		clear();

		m_h_PUCH_ODR_CD = i_h_PUCH_ODR_CD;
		m_STOCK_UNIT = i_STOCK_UNIT;
		m_WH_NAME = i_WH_NAME;
		m_UNIT_COST_TYP_name = i_UNIT_COST_TYP_name;
		m_UNIT_COST_TYP_val = i_UNIT_COST_TYP_val;
		m_USER_NAME = i_USER_NAME;
		m_VEND_CUR_UNIT = i_VEND_CUR_UNIT;
		m_r1_FILTER = i_r1_FILTER;
		m_r2_FILTER = i_r2_FILTER;
		m_HOME_CUR_UNIT = i_HOME_CUR_UNIT;
		m_c_NON_NO_ITEM_FLG = i_c_NON_NO_ITEM_FLG;
		m_HOME_DECIMAL_FIG = i_HOME_DECIMAL_FIG;
		m_TAX_ROUND_TYP = i_TAX_ROUND_TYP;
		m_ROUND_TYP = i_ROUND_TYP;
		m_VEND_DECIMAL_FIG = i_VEND_DECIMAL_FIG;
		m_COMPANY_CD = i_COMPANY_CD;
		m_VEND_CD = i_VEND_CD;
		m_PLANT_CD = i_PLANT_CD;
		m_ITEM_CD = i_ITEM_CD;
		m_JOB_ODR_CD = i_JOB_ODR_CD;
		m_JOB_ODR_DETAIL_NO = i_JOB_ODR_DETAIL_NO;
		m_INV_CTRL_FLG = i_INV_CTRL_FLG;
		m_PUCH_ODR_PERSON = i_PUCH_ODR_PERSON;
		m_PUCH_RTN_DATE = i_PUCH_RTN_DATE;
		m_PUCH_RTN_QTY = i_PUCH_RTN_QTY;
		m_WH_CD = i_WH_CD;
		m_VEND_LOT_NO = i_VEND_LOT_NO;
		m_UNIT_COST_TYP = i_UNIT_COST_TYP;
		m_UNIT_COST = i_UNIT_COST;
		m_PROCESSING_COST = i_PROCESSING_COST;
		m_MATERIAL_COST = i_MATERIAL_COST;
		m_OTHER_OVERHEADS = i_OTHER_OVERHEADS;
		m_PUCH_ODR_AMOUNT = i_PUCH_ODR_AMOUNT;
		m_DISC_AMOUNT = i_DISC_AMOUNT;
		m_NET_AMOUNT = i_NET_AMOUNT;
		m_PUCH_RTN_COMMENT = i_PUCH_RTN_COMMENT;
		m_RATE_JUDGE_DATE = i_RATE_JUDGE_DATE;
		m_EXCH_RATE = i_EXCH_RATE;
		m_TAX_RATE_1 = i_TAX_RATE_1;
		m_TAX_RATE_2 = i_TAX_RATE_2;
		m_TAX_RATE_3 = i_TAX_RATE_3;
		m_TAX_AMOUNT_1 = i_TAX_AMOUNT_1;
		m_TAX_AMOUNT_2 = i_TAX_AMOUNT_2;
		m_TAX_AMOUNT_3 = i_TAX_AMOUNT_3;
		m_AMOUNT_INCLUDE_TAX = i_AMOUNT_INCLUDE_TAX;
		m_HOME_CUR_AMOUNT = i_HOME_CUR_AMOUNT;
		m_TAX_CD = i_TAX_CD;
		m_RTN_DEL_FLG = i_RTN_DEL_FLG;
		m_MODIFY_COUNT = i_MODIFY_COUNT;
		m_PUCH_ODR_CD = i_PUCH_ODR_CD;
		m_VEND_ANAME = i_VEND_ANAME;
		m_ITEM_NAME = i_ITEM_NAME;
		m_UNIT_QTY_TYP = i_UNIT_QTY_TYP;
		m_PUCH_ODR_CD_2 = i_PUCH_ODR_CD_2;
	}
		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
