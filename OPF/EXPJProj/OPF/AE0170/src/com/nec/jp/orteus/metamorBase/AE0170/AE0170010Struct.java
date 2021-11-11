/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0170/src/com/nec/jp/orteus/metamorBase/AE0170/AE0170010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0170;

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
/**
 * CLASS     : AE0170010Control クラス
 * ファイル・クラス説明
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.3 $ $Date: 2014/02/26 01:26:51 $
 *
 */
//}}user_implement_code_header

public class AE0170010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_c_NON_NO_ITEM_FLG */
	public String m_c_NON_NO_ITEM_FLG = null;
	/** 第 2 変数： m_PUCH_ODR_DLV_TIME */
	public String m_PUCH_ODR_DLV_TIME = null;
	/** 第 3 変数： m_PUCH_ODR_START_TIME */
	public String m_PUCH_ODR_START_TIME = null;
	/** 第 4 変数： m_l_STATUS */
	public String m_l_STATUS = null;
	/** 第 5 変数： m_l_ACPT_NO */
	public String m_l_ACPT_NO = null;
	/** 第 6 変数： m_l_ACPT_QTY */
	public String m_l_ACPT_QTY = null;
	/** 第 7 変数： m_l_ACPT_DATE */
	public String m_l_ACPT_DATE = null;
	/** 第 8 変数： m_l_UNIT_COST */
	public String m_l_UNIT_COST = null;
	/** 第 9 変数： m_l_UNIT_COST_TYP */
	public String m_l_UNIT_COST_TYP = null;
	/** 第 10 変数： m_l_PUCH_ODR_AMOUNT */
	public String m_l_PUCH_ODR_AMOUNT = null;
	/** 第 11 変数： m_l_INSPECTED_QTY */
	public String m_l_INSPECTED_QTY = null;
	/** 第 12 変数： m_l_ACCEPTED_QTY */
	public String m_l_ACCEPTED_QTY = null;
	/** 第 13 変数： m_l_INSPEC_DATE */
	public String m_l_INSPEC_DATE = null;
	/** 第 14 変数： m_h_NET_AMOUNT */
	public String m_h_NET_AMOUNT = null;
	/** 第 15 変数： m_h_TAX_AMOUNT_1 */
	public String m_h_TAX_AMOUNT_1 = null;
	/** 第 16 変数： m_h_TAX_AMOUNT_2 */
	public String m_h_TAX_AMOUNT_2 = null;
	/** 第 17 変数： m_h_TAX_AMOUNT_3 */
	public String m_h_TAX_AMOUNT_3 = null;
	/** 第 18 変数： m_h_DECIMAL_FIG */
	public String m_h_DECIMAL_FIG = null;
	/** 第 19 変数： m_h_ROUND_TYP */
	public String m_h_ROUND_TYP = null;
	/** 第 20 変数： m_h_PUCH_ODR_STS_TYP */
	public String m_h_PUCH_ODR_STS_TYP = null;
	/** 第 21 変数： m_h_PUCH_ODR_INST_SLIP_ISS_FLG */
	public String m_h_PUCH_ODR_INST_SLIP_ISS_FLG = null;
	/** 第 22 変数： m_h_ODR_CANCEL_SLIP_ISS_FLG */
	public String m_h_ODR_CANCEL_SLIP_ISS_FLG = null;
	/** 第 23 変数： m_h_INSPC_CMPLT_FLG */
	public String m_h_INSPC_CMPLT_FLG = null;
	/** 第 24 変数： m_h_ACPT_INSPC_TYP */
	public String m_h_ACPT_INSPC_TYP = null;
	/** 第 25 変数： m_h_NET_AMOUNT_LIST */
	public String m_h_NET_AMOUNT_LIST = null;
	/** 第 26 変数： m_h_TAX_AMOUNT_1_LIST */
	public String m_h_TAX_AMOUNT_1_LIST = null;
	/** 第 27 変数： m_h_TAX_AMOUNT_2_LIST */
	public String m_h_TAX_AMOUNT_2_LIST = null;
	/** 第 28 変数： m_h_TAX_AMOUNT_3_LIST */
	public String m_h_TAX_AMOUNT_3_LIST = null;
	/** 第 29 変数： m_h_UPDATE_FLG */
	public String m_h_UPDATE_FLG = null;
	/** 第 30 変数： m_h_MODIFY_COUNT */
	public String m_h_MODIFY_COUNT = null;
	/** 第 31 変数： m_h_MODIFY_COUNT_LIST */
	public String m_h_MODIFY_COUNT_LIST = null;
	/** 第 32 変数： m_h_EXCH_RATE */
	public String m_h_EXCH_RATE = null;
	/** 第 33 変数： m_h_EXCH_RATE_LIST */
	public String m_h_EXCH_RATE_LIST = null;
	/** 第 34 変数： m_h_TAX_CD */
	public String m_h_TAX_CD = null;
	/** 第 35 変数： m_h_PUCH_ODR_CD */
	public String m_h_PUCH_ODR_CD = null;
	/** 第 36 変数： m_NON_NO_ITEM_FLG */
	public String m_NON_NO_ITEM_FLG = null;
	/** 第 37 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 38 変数： m_VEND_CD */
	public String m_VEND_CD = null;
	/** 第 39 変数： m_PUCH_ODR_DLV_DATE */
	public String m_PUCH_ODR_DLV_DATE = null;
	/** 第 40 変数： m_TAX_CD */
	public String m_TAX_CD = null;
	/** 第 41 変数： m_PUCH_ODR_START_DATE */
	public String m_PUCH_ODR_START_DATE = null;
	/** 第 42 変数： m_PUCH_ODR_QTY */
	public String m_PUCH_ODR_QTY = null;
	/** 第 43 変数： m_UNIT_COST_TYP */
	public String m_UNIT_COST_TYP = null;
	/** 第 44 変数： m_UNIT_COST */
	public String m_UNIT_COST = null;
	/** 第 45 変数： m_ACPT_INSPC_TYP */
	public String m_ACPT_INSPC_TYP = null;
	/** 第 46 変数： m_PUCH_ODR_AMOUNT */
	public String m_PUCH_ODR_AMOUNT = null;
	/** 第 47 変数： m_RATE_JUDGE_DATE */
	public String m_RATE_JUDGE_DATE = null;
	/** 第 48 変数： m_NET_AMOUNT */
	public String m_NET_AMOUNT = null;
	/** 第 49 変数： m_TAX_AMOUNT_1 */
	public String m_TAX_AMOUNT_1 = null;
	/** 第 50 変数： m_TAX_AMOUNT_2 */
	public String m_TAX_AMOUNT_2 = null;
	/** 第 51 変数： m_TAX_AMOUNT_3 */
	public String m_TAX_AMOUNT_3 = null;
	/** 第 52 変数： m_PUCH_ODR_STS_TYP */
	public String m_PUCH_ODR_STS_TYP = null;
	/** 第 53 変数： m_PUCH_ODR_INST_SLIP_ISS_FLG */
	public String m_PUCH_ODR_INST_SLIP_ISS_FLG = null;
	/** 第 54 変数： m_ODR_CANCEL_SLIP_ISS_FLG */
	public String m_ODR_CANCEL_SLIP_ISS_FLG = null;
	/** 第 55 変数： m_INSPC_CMPLT_FLG */
	public String m_INSPC_CMPLT_FLG = null;
	/** 第 56 変数： m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** 第 57 変数： m_EXCH_RATE */
	public String m_EXCH_RATE = null;
	/** 第 58 変数： m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** 第 59 変数： m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** 第 60 変数： m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** 第 61 変数： m_VEND_NAME */
	public String m_VEND_NAME = null;
	/** 第 62 変数： m_INSPC_ACPT_APP_TYP */
	public String m_INSPC_ACPT_APP_TYP = null;
	/** 第 63 変数： m_CUR_CD */
	public String m_CUR_CD = null;
	/** 第 64 変数： m_EXCH_TYP */
	public String m_EXCH_TYP = null;
	/** 第 65 変数： m_ROUND_TYP */
	public String m_ROUND_TYP = null;
	/** 第 66 変数： m_CUR_NAME */
	public String m_CUR_NAME = null;
	/** 第 67 変数： m_CUR_UNIT */
	public String m_CUR_UNIT = null;
	/** 第 68 変数： m_DECIMAL_FIG */
	public String m_DECIMAL_FIG = null;
	/** 第 69 変数： m_PUCH_ODR_CD */
	public String m_PUCH_ODR_CD = null;
	/** 第 70 変数： m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** 第 71 変数： m_ACPT_NO */
	public String m_ACPT_NO = null;
	/** 第 72 変数： m_ACPT_QTY */
	public String m_ACPT_QTY = null;
	/** 第 73 変数： m_ACPT_DATE */
	public String m_ACPT_DATE = null;
	/** 第 74 変数： m_INSPECTED_QTY */
	public String m_INSPECTED_QTY = null;
	/** 第 75 変数： m_ACCEPTED_QTY */
	public String m_ACCEPTED_QTY = null;
	/** 第 76 変数： m_INSPEC_DATE */
	public String m_INSPEC_DATE = null;
	/** 第 77 変数： m_OLD_TAX_RATE_1 */
	public String m_OLD_TAX_RATE_1 = null;
	/** 第 78 変数： m_OLD_TAX_RATE_2 */
	public String m_OLD_TAX_RATE_2 = null;
	/** 第 79 変数： m_OLD_TAX_RATE_3 */
	public String m_OLD_TAX_RATE_3 = null;
	/** 第 80 変数： m_NEW_TAX_RATE_START_DATE */
	public String m_NEW_TAX_RATE_START_DATE = null;
	/** 第 81 変数： m_NEW_TAX_RATE_1 */
	public String m_NEW_TAX_RATE_1 = null;
	/** 第 82 変数： m_NEW_TAX_RATE_2 */
	public String m_NEW_TAX_RATE_2 = null;
	/** 第 83 変数： m_NEW_TAX_RATE_3 */
	public String m_NEW_TAX_RATE_3 = null;
	/** 第 84 変数： m_TAX_RATE_1 */
	public String m_TAX_RATE_1 = null;
	/** 第 85 変数： m_TAX_RATE_2 */
	public String m_TAX_RATE_2 = null;
	/** 第 86 変数： m_TAX_RATE_3 */
	public String m_TAX_RATE_3 = null;
	/** 第 87 変数： m_AMOUNT_INCLUDE_TAX */
	public String m_AMOUNT_INCLUDE_TAX = null;
	/** 第 88 変数： m_HOME_CUR_AMOUNT */
	public String m_HOME_CUR_AMOUNT = null;
	/** 第 89 変数： m_TAX_ROUND_TYP */
	public String m_TAX_ROUND_TYP = null;
	/** 第 90 変数： m_INSPC_ACPT_NO */
	public String m_INSPC_ACPT_NO = null;
	/** 第 91 変数： m_INSPC_ACPT_GNR_TYP */
	public String m_INSPC_ACPT_GNR_TYP = null;
	/** 第 92 変数： m_CRCT_NO */
	public String m_CRCT_NO = null;
	/** 第 93 変数： m_CRCT_TYP */
	public String m_CRCT_TYP = null;
	/** 第 94 変数： m_SLIP_TYP */
	public String m_SLIP_TYP = null;
	/** 第 95 変数： m_WORK_IN_PROC_CD */
	public String m_WORK_IN_PROC_CD = null;
	/** 第 96 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** 第 97 変数： m_PROCESSING_COST */
	public String m_PROCESSING_COST = null;
	/** 第 98 変数： m_MATERIAL_COST */
	public String m_MATERIAL_COST = null;
	/** 第 99 変数： m_OTHER_OVERHEADS */
	public String m_OTHER_OVERHEADS = null;
	/** 第 100 変数： m_INSPC_ACPT_QTY */
	public String m_INSPC_ACPT_QTY = null;
	/** 第 101 変数： m_INSPC_ACPT_AMOUNT */
	public String m_INSPC_ACPT_AMOUNT = null;
	/** 第 102 変数： m_SAVING_AMOUNT */
	public String m_SAVING_AMOUNT = null;
	/** 第 103 変数： m_INSPC_ACPT_DATE */
	public String m_INSPC_ACPT_DATE = null;
	/** 第 104 変数： m_PRODUCT_TYP */
	public String m_PRODUCT_TYP = null;
	/** 第 105 変数： m_DLV_CD */
	public String m_DLV_CD = null;
	/** 第 106 変数： m_DISC_AMOUNT */
	public String m_DISC_AMOUNT = null;
	/** 第 107 変数： m_GNR_ORG_CD */
	public String m_GNR_ORG_CD = null;
	/** 第 108 変数： m_SBCNT_PUCH_TYP */
	public String m_SBCNT_PUCH_TYP = null;
	/** 第 109 変数： m_JOB_ODR_DETAIL_NO */
	public String m_JOB_ODR_DETAIL_NO = null;
	/** 第 110 変数： m_CLASIFICATION_CD */
	public String m_CLASIFICATION_CD = null;
	/** 第 111 変数： m_INV_CTRL_FLG */
	public String m_INV_CTRL_FLG = null;
	/** 第 112 変数： m_PUCH_RTN_FLG */
	public String m_PUCH_RTN_FLG = null;
	/** 第 113 変数： m_APPR_FLG */
	public String m_APPR_FLG = null;
	/** 第 114 変数： m_APPR_ID */
	public String m_APPR_ID = null;
	/** 第 115 変数： m_APPR_DATE */
	public String m_APPR_DATE = null;
	/** 第 116 変数： m_RESERVE_CAUSE */
	public String m_RESERVE_CAUSE = null;
	/** 第 117 変数： m_SLIP_CTRL_GRP */
	public String m_SLIP_CTRL_GRP = null;
	/** 第 118 変数： m_SLIP_DATE */
	public String m_SLIP_DATE = null;
	/** 第 119 変数： m_SLIP_CD */
	public String m_SLIP_CD = null;
	/** 第 120 変数： m_SEQ_NO */
	public String m_SEQ_NO = null;
	/** 第 121 変数： m_NET_AMOUNT_YEN */
	public String m_NET_AMOUNT_YEN = null;
	/** 第 122 変数： m_AMOUNT */
	public String m_AMOUNT = null;
	/** 第 123 変数： m_TAX_TYP */
	public String m_TAX_TYP = null;
	/** 第 124 変数： m_TAX_AMOUNT */
	public String m_TAX_AMOUNT = null;
	/** 第 125 変数： m_GROSS_AMOUNT */
	public String m_GROSS_AMOUNT = null;
	/** 第 126 変数： m_TAX_AMOUNT_YEN */
	public String m_TAX_AMOUNT_YEN = null;
	/** 第 127 変数： m_GROSS_AMOUNT_YEN */
	public String m_GROSS_AMOUNT_YEN = null;
	/** 第 128 変数： m_SUM_TAX_AMOUNT */
	public String m_SUM_TAX_AMOUNT = null;
	/** 第 129 変数： m_SUM_GROSS_AMOUNT */
	public String m_SUM_GROSS_AMOUNT = null;
	/** 第 130 変数： m_SUM_NET_AMOUNT */
	public String m_SUM_NET_AMOUNT = null;
	/** 第 131 変数： m_TAX_TOTAL */
	public String m_TAX_TOTAL = null;
	/** 第 132 変数： m_GROSS_TOTAL */
	public String m_GROSS_TOTAL = null;
	/** 第 133 変数： m_NET_TOTAL */
	public String m_NET_TOTAL = null;
	/** 第 134 変数： m_LINE_NO */
	public String m_LINE_NO = null;
	/** 第 135 変数： m_LINE_TYP */
	public String m_LINE_TYP = null;
	/** 第 136 変数： m_TAX_AMOUNT_CTRL_FLG */
	public String m_TAX_AMOUNT_CTRL_FLG = null;
	/** 第 137 変数： m_UNIT_COST_YEN */
	public String m_UNIT_COST_YEN = null;
	/** 第 138 変数： m_PROCESSING_COST_YEN */
	public String m_PROCESSING_COST_YEN = null;
	/** 第 139 変数： m_MATERIAL_COST_YEN */
	public String m_MATERIAL_COST_YEN = null;
	/** 第 140 変数： m_OTHER_OVERHEADS_YEN */
	public String m_OTHER_OVERHEADS_YEN = null;
	/** 第 141 変数： m_DR_ACCT_CD */
	public String m_DR_ACCT_CD = null;
	/** 第 142 変数： m_DR_SUB_ACCT_CD */
	public String m_DR_SUB_ACCT_CD = null;
	/** 第 143 変数： m_DR_ORG_CD */
	public String m_DR_ORG_CD = null;
	/** 第 144 変数： m_CR_ACCT_CD */
	public String m_CR_ACCT_CD = null;
	/** 第 145 変数： m_CR_SUB_ACCT_CD */
	public String m_CR_SUB_ACCT_CD = null;
	/** 第 146 変数： m_CR_ORG_CD */
	public String m_CR_ORG_CD = null;
	/** 第 147 変数： m_FIXED_ASSETS_CD */
	public String m_FIXED_ASSETS_CD = null;
	/** 第 148 変数： m_SUB_FIXED_ASSETS_CD */
	public String m_SUB_FIXED_ASSETS_CD = null;
	/** 第 149 変数： m_DETAIL_NO */
	public String m_DETAIL_NO = null;
	/** 第 150 変数： m_COMM_PUCH_ODR_LINE_NO */
	public String m_COMM_PUCH_ODR_LINE_NO = null;
	/** 第 151 変数： m_ARV_RSLT_LINE_NO */
	public String m_ARV_RSLT_LINE_NO = null;
	/** 第 152 変数： m_STOCK_CTRL_FLG */
	public String m_STOCK_CTRL_FLG = null;
	/** 第 153 変数： m_REMARKS */
	public String m_REMARKS = null;
	/** 第 154 変数： m_INSPC_ACPT_CRCT_TYP */
	public String m_INSPC_ACPT_CRCT_TYP = null;
	/** 第 155 変数： m_ORGN_SLIP_CTRL_GRP */
	public String m_ORGN_SLIP_CTRL_GRP = null;
	/** 第 156 変数： m_ORGN_SLIP_CD */
	public String m_ORGN_SLIP_CD = null;
	/** 第 157 変数： m_ORGN_SLIP_DATE */
	public String m_ORGN_SLIP_DATE = null;
	/** 第 158 変数： m_SLIP_TRN_CD */
	public String m_SLIP_TRN_CD = null;
	/** 第 159 変数： m_STOCK_CLASS_CD */
	public String m_STOCK_CLASS_CD = null;
	/** 第 160 変数： m_BALANCE_CLASS_CD */
	public String m_BALANCE_CLASS_CD = null;
	/** 第 161 変数： m_PUCH_ODR_ORG_CD */
	public String m_PUCH_ODR_ORG_CD = null;
	/** 第 162 変数： m_PUCH_ODR_PERSON_CD */
	public String m_PUCH_ODR_PERSON_CD = null;
	/** 第 163 変数： m_WH_CD */
	public String m_WH_CD = null;
	/** 第 164 変数： m_SHIP_WH_CD */
	public String m_SHIP_WH_CD = null;
	/** 第 165 変数： m_PAYEE_CD */
	public String m_PAYEE_CD = null;
	/** 第 166 変数： m_SLIP_CTRL_ORG_CD */
	public String m_SLIP_CTRL_ORG_CD = null;
	/** 第 167 変数： m_CLOSING_CTRL_ORG_CD */
	public String m_CLOSING_CTRL_ORG_CD = null;
	/** 第 168 変数： m_PAY_CALC_CTRL_ORG_CD */
	public String m_PAY_CALC_CTRL_ORG_CD = null;
	/** 第 169 変数： m_PAY_FIX_CTRL_ORG_CD */
	public String m_PAY_FIX_CTRL_ORG_CD = null;
	/** 第 170 変数： m_EXPL_TYP */
	public String m_EXPL_TYP = null;
	/** 第 171 変数： m_EXPL_CD */
	public String m_EXPL_CD = null;
	/** 第 172 変数： m_EXPL_NAME */
	public String m_EXPL_NAME = null;
	/** 第 173 変数： m_ODR_CD */
	public String m_ODR_CD = null;
	/** 第 174 変数： m_COMM_PUCH_ODR_SLIP_TYP */
	public String m_COMM_PUCH_ODR_SLIP_TYP = null;
	/** 第 175 変数： m_COMM_PUCH_ODR_SLIP_CTRL_GRP */
	public String m_COMM_PUCH_ODR_SLIP_CTRL_GRP = null;
	/** 第 176 変数： m_COMM_PUCH_ODR_SLIP_CD */
	public String m_COMM_PUCH_ODR_SLIP_CD = null;
	/** 第 177 変数： m_COMM_PUCH_ODR_SLIP_DATE */
	public String m_COMM_PUCH_ODR_SLIP_DATE = null;
	/** 第 178 変数： m_ARV_RSLT_SLIP_TYP */
	public String m_ARV_RSLT_SLIP_TYP = null;
	/** 第 179 変数： m_ARV_RSLT_SLIP_CTRL_GRP */
	public String m_ARV_RSLT_SLIP_CTRL_GRP = null;
	/** 第 180 変数： m_ARV_RSLT_SLIP_CD */
	public String m_ARV_RSLT_SLIP_CD = null;
	/** 第 181 変数： m_ARV_RSLT_SLIP_DATE */
	public String m_ARV_RSLT_SLIP_DATE = null;
	/** 第 182 変数： m_PUCH_RSLT_SLIP_ID */
	public String m_PUCH_RSLT_SLIP_ID = null;
	/** 第 183 変数： m_TAX_CALC_TYP */
	public String m_TAX_CALC_TYP = null;
	/** 第 184 変数： m_TAX_APPLY_TYP */
	public String m_TAX_APPLY_TYP = null;
	/** 第 185 変数： m_TEMP_UNIT_COST_PUCH_RSLT_FLG */
	public String m_TEMP_UNIT_COST_PUCH_RSLT_FLG = null;
	/** 第 186 変数： m_UNIT_COST_ZERO_INSPC_ACPT_FLG */
	public String m_UNIT_COST_ZERO_INSPC_ACPT_FLG = null;
	/** 第 187 変数： m_IMPORT_TRN_TYP */
	public String m_IMPORT_TRN_TYP = null;
	/** 第 188 変数： m_PAY_CYCLE_TYP */
	public String m_PAY_CYCLE_TYP = null;
	/** 第 189 変数： m_DEADLINE_DATE */
	public String m_DEADLINE_DATE = null;
	/** 第 190 変数： m_PAY_SCH_DATE */
	public String m_PAY_SCH_DATE = null;
	/** 第 191 変数： m_PAY_PATTERN_CD */
	public String m_PAY_PATTERN_CD = null;
	/** 第 192 変数： m_EXCH_RSRV_CD */
	public String m_EXCH_RSRV_CD = null;
	/** 第 193 変数： m_EXCH_DATE */
	public String m_EXCH_DATE = null;
	/** 第 194 変数： m_PUR_RSLT_SLIP_ISSUE_FLG */
	public String m_PUR_RSLT_SLIP_ISSUE_FLG = null;
	/** 第 195 変数： m_PUR_RSLT_REP_ISSUE_FLG */
	public String m_PUR_RSLT_REP_ISSUE_FLG = null;
	/** 第 196 変数： m_ACPT_ARV_MODIFICATION_FLG */
	public String m_ACPT_ARV_MODIFICATION_FLG = null;
	/** 第 197 変数： m_INSPC_ACPT_MODIFICATION_FLG */
	public String m_INSPC_ACPT_MODIFICATION_FLG = null;
	/** 第 198 変数： m_STATUS */
	public String m_STATUS = null;
	/** 第 199 変数： m_CRCT_FLG */
	public String m_CRCT_FLG = null;
	/** 第 200 変数： m_APPROVAL_DATE */
	public String m_APPROVAL_DATE = null;
	/** 第 201 変数： m_APPROVAL_CD */
	public String m_APPROVAL_CD = null;
	/** 第 202 変数： m_APPROVAL_RSRV_DATE */
	public String m_APPROVAL_RSRV_DATE = null;
	/** 第 203 変数： m_APPROVAL_RSRV_CD */
	public String m_APPROVAL_RSRV_CD = null;
	/** 第 204 変数： m_RSN_CD */
	public String m_RSN_CD = null;
	/** 第 205 変数： m_RECORDING_DATE */
	public String m_RECORDING_DATE = null;
	/** 第 206 変数： m_RECORDING_MONTH */
	public String m_RECORDING_MONTH = null;
	/** 第 207 変数： m_ORGN_RECORDING_DATE */
	public String m_ORGN_RECORDING_DATE = null;
	/** 第 208 変数： m_ORGN_RECORDING_MONTH */
	public String m_ORGN_RECORDING_MONTH = null;
	/** 第 209 変数： m_RECORDING_PROC_DATE */
	public String m_RECORDING_PROC_DATE = null;
	/** 第 210 変数： m_RECORDING_PROC_CD */
	public String m_RECORDING_PROC_CD = null;
	/** 第 211 変数： m_CLOSING_RSRV_DATE */
	public String m_CLOSING_RSRV_DATE = null;
	/** 第 212 変数： m_CLOSING_RSRV_CD */
	public String m_CLOSING_RSRV_CD = null;
	/** 第 213 変数： m_CLOSING_DATE */
	public String m_CLOSING_DATE = null;
	/** 第 214 変数： m_CLOSING_CD */
	public String m_CLOSING_CD = null;
	/** 第 215 変数： m_PAY_FIX_DATE */
	public String m_PAY_FIX_DATE = null;
	/** 第 216 変数： m_PAY_FIX_CD */
	public String m_PAY_FIX_CD = null;
	/** 第 217 変数： m_DEBT_BALANCE_OUT_FLG */
	public String m_DEBT_BALANCE_OUT_FLG = null;
	/** 第 218 変数： m_DEBT_BALANCE_OUT_DATE */
	public String m_DEBT_BALANCE_OUT_DATE = null;
	/** 第 219 変数： m_MONTH */
	public String m_MONTH = null;
	/** 第 220 変数： m_ACCT_CD */
	public String m_ACCT_CD = null;
	/** 第 221 変数： m_SUB_ACCT_CD */
	public String m_SUB_ACCT_CD = null;
	/** 第 222 変数： m_ORG_CD */
	public String m_ORG_CD = null;
	/** 第 223 変数： m_DATA_TYP */
	public String m_DATA_TYP = null;
	/** 第 224 変数： m_GL_IF_OUT_FLG */
	public String m_GL_IF_OUT_FLG = null;
	/** 第 225 変数： m_BALANCE_UPD_FLG */
	public String m_BALANCE_UPD_FLG = null;
	/** 第 226 変数： m_BALANCE_UPD_DATE */
	public String m_BALANCE_UPD_DATE = null;
	/** 第 227 変数： m_RECORDING_AMOUNT */
	public String m_RECORDING_AMOUNT = null;
	/** 第 228 変数： m_DEBT_AMOUNT */
	public String m_DEBT_AMOUNT = null;
	/** 第 229 変数： m_REBATE_AMOUNT */
	public String m_REBATE_AMOUNT = null;
	/** 第 230 変数： m_RETURNED_GOODS_AMOUNT */
	public String m_RETURNED_GOODS_AMOUNT = null;
	/** 第 231 変数： m_RECORDING_AMOUNT_YEN */
	public String m_RECORDING_AMOUNT_YEN = null;
	/** 第 232 変数： m_DEBT_AMOUNT_YEN */
	public String m_DEBT_AMOUNT_YEN = null;
	/** 第 233 変数： m_SAVING_AMOUNT_YEN */
	public String m_SAVING_AMOUNT_YEN = null;
	/** 第 234 変数： m_REBATE_AMOUNT_YEN */
	public String m_REBATE_AMOUNT_YEN = null;
	/** 第 235 変数： m_RETURNED_GOODS_AMOUNT_YEN */
	public String m_RETURNED_GOODS_AMOUNT_YEN = null;
	/** 第 236 変数： m_INSPC_ACPT_AMOUNT_YEN */
	public String m_INSPC_ACPT_AMOUNT_YEN = null;
	/** 第 237 変数： m_EXCH_DIFF_AMOUNT_YEN */
	public String m_EXCH_DIFF_AMOUNT_YEN = null;
	/** 第 238 変数： m_OPTION_ID */
	public String m_OPTION_ID = null;
	/** 第 239 変数： m_OWN_CUR_CD */
	public String m_OWN_CUR_CD = null;
	/** 第 240 変数： m_THIS_MONTH */
	public String m_THIS_MONTH = null;
	/** 第 241 変数： m_HOME_DECIMAL_FIG */
	public String m_HOME_DECIMAL_FIG = null;
	/** 第 242 変数： m_HOME_CUR_CD */
	public String m_HOME_CUR_CD = null;
	/** 第 243 変数： m_TIME_CTRL */
	public String m_TIME_CTRL = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_c_NON_NO_ITEM_FLG */
	public List l_c_NON_NO_ITEM_FLG = null;

	/** 第 2 List変数： l_PUCH_ODR_DLV_TIME */
	public List l_PUCH_ODR_DLV_TIME = null;

	/** 第 3 List変数： l_PUCH_ODR_START_TIME */
	public List l_PUCH_ODR_START_TIME = null;

	/** 第 4 List変数： l_l_STATUS */
	public List l_l_STATUS = null;

	/** 第 5 List変数： l_l_ACPT_NO */
	public List l_l_ACPT_NO = null;

	/** 第 6 List変数： l_l_ACPT_QTY */
	public List l_l_ACPT_QTY = null;

	/** 第 7 List変数： l_l_ACPT_DATE */
	public List l_l_ACPT_DATE = null;

	/** 第 8 List変数： l_l_UNIT_COST */
	public List l_l_UNIT_COST = null;

	/** 第 9 List変数： l_l_UNIT_COST_TYP */
	public List l_l_UNIT_COST_TYP = null;

	/** 第 10 List変数： l_l_PUCH_ODR_AMOUNT */
	public List l_l_PUCH_ODR_AMOUNT = null;

	/** 第 11 List変数： l_l_INSPECTED_QTY */
	public List l_l_INSPECTED_QTY = null;

	/** 第 12 List変数： l_l_ACCEPTED_QTY */
	public List l_l_ACCEPTED_QTY = null;

	/** 第 13 List変数： l_l_INSPEC_DATE */
	public List l_l_INSPEC_DATE = null;

	/** 第 14 List変数： l_h_NET_AMOUNT */
	public List l_h_NET_AMOUNT = null;

	/** 第 15 List変数： l_h_TAX_AMOUNT_1 */
	public List l_h_TAX_AMOUNT_1 = null;

	/** 第 16 List変数： l_h_TAX_AMOUNT_2 */
	public List l_h_TAX_AMOUNT_2 = null;

	/** 第 17 List変数： l_h_TAX_AMOUNT_3 */
	public List l_h_TAX_AMOUNT_3 = null;

	/** 第 18 List変数： l_h_DECIMAL_FIG */
	public List l_h_DECIMAL_FIG = null;

	/** 第 19 List変数： l_h_ROUND_TYP */
	public List l_h_ROUND_TYP = null;

	/** 第 20 List変数： l_h_PUCH_ODR_STS_TYP */
	public List l_h_PUCH_ODR_STS_TYP = null;

	/** 第 21 List変数： l_h_PUCH_ODR_INST_SLIP_ISS_FLG */
	public List l_h_PUCH_ODR_INST_SLIP_ISS_FLG = null;

	/** 第 22 List変数： l_h_ODR_CANCEL_SLIP_ISS_FLG */
	public List l_h_ODR_CANCEL_SLIP_ISS_FLG = null;

	/** 第 23 List変数： l_h_INSPC_CMPLT_FLG */
	public List l_h_INSPC_CMPLT_FLG = null;

	/** 第 24 List変数： l_h_ACPT_INSPC_TYP */
	public List l_h_ACPT_INSPC_TYP = null;

	/** 第 25 List変数： l_h_NET_AMOUNT_LIST */
	public List l_h_NET_AMOUNT_LIST = null;

	/** 第 26 List変数： l_h_TAX_AMOUNT_1_LIST */
	public List l_h_TAX_AMOUNT_1_LIST = null;

	/** 第 27 List変数： l_h_TAX_AMOUNT_2_LIST */
	public List l_h_TAX_AMOUNT_2_LIST = null;

	/** 第 28 List変数： l_h_TAX_AMOUNT_3_LIST */
	public List l_h_TAX_AMOUNT_3_LIST = null;

	/** 第 29 List変数： l_h_UPDATE_FLG */
	public List l_h_UPDATE_FLG = null;

	/** 第 30 List変数： l_h_MODIFY_COUNT */
	public List l_h_MODIFY_COUNT = null;

	/** 第 31 List変数： l_h_MODIFY_COUNT_LIST */
	public List l_h_MODIFY_COUNT_LIST = null;

	/** 第 32 List変数： l_h_EXCH_RATE */
	public List l_h_EXCH_RATE = null;

	/** 第 33 List変数： l_h_EXCH_RATE_LIST */
	public List l_h_EXCH_RATE_LIST = null;

	/** 第 34 List変数： l_h_TAX_CD */
	public List l_h_TAX_CD = null;

	/** 第 35 List変数： l_h_PUCH_ODR_CD */
	public List l_h_PUCH_ODR_CD = null;

	/** 第 36 List変数： l_NON_NO_ITEM_FLG */
	public List l_NON_NO_ITEM_FLG = null;

	/** 第 37 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 38 List変数： l_VEND_CD */
	public List l_VEND_CD = null;

	/** 第 39 List変数： l_PUCH_ODR_DLV_DATE */
	public List l_PUCH_ODR_DLV_DATE = null;

	/** 第 40 List変数： l_TAX_CD */
	public List l_TAX_CD = null;

	/** 第 41 List変数： l_PUCH_ODR_START_DATE */
	public List l_PUCH_ODR_START_DATE = null;

	/** 第 42 List変数： l_PUCH_ODR_QTY */
	public List l_PUCH_ODR_QTY = null;

	/** 第 43 List変数： l_UNIT_COST_TYP */
	public List l_UNIT_COST_TYP = null;

	/** 第 44 List変数： l_UNIT_COST */
	public List l_UNIT_COST = null;

	/** 第 45 List変数： l_ACPT_INSPC_TYP */
	public List l_ACPT_INSPC_TYP = null;

	/** 第 46 List変数： l_PUCH_ODR_AMOUNT */
	public List l_PUCH_ODR_AMOUNT = null;

	/** 第 47 List変数： l_RATE_JUDGE_DATE */
	public List l_RATE_JUDGE_DATE = null;

	/** 第 48 List変数： l_NET_AMOUNT */
	public List l_NET_AMOUNT = null;

	/** 第 49 List変数： l_TAX_AMOUNT_1 */
	public List l_TAX_AMOUNT_1 = null;

	/** 第 50 List変数： l_TAX_AMOUNT_2 */
	public List l_TAX_AMOUNT_2 = null;

	/** 第 51 List変数： l_TAX_AMOUNT_3 */
	public List l_TAX_AMOUNT_3 = null;

	/** 第 52 List変数： l_PUCH_ODR_STS_TYP */
	public List l_PUCH_ODR_STS_TYP = null;

	/** 第 53 List変数： l_PUCH_ODR_INST_SLIP_ISS_FLG */
	public List l_PUCH_ODR_INST_SLIP_ISS_FLG = null;

	/** 第 54 List変数： l_ODR_CANCEL_SLIP_ISS_FLG */
	public List l_ODR_CANCEL_SLIP_ISS_FLG = null;

	/** 第 55 List変数： l_INSPC_CMPLT_FLG */
	public List l_INSPC_CMPLT_FLG = null;

	/** 第 56 List変数： l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** 第 57 List変数： l_EXCH_RATE */
	public List l_EXCH_RATE = null;

	/** 第 58 List変数： l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** 第 59 List変数： l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** 第 60 List変数： l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** 第 61 List変数： l_VEND_NAME */
	public List l_VEND_NAME = null;

	/** 第 62 List変数： l_INSPC_ACPT_APP_TYP */
	public List l_INSPC_ACPT_APP_TYP = null;

	/** 第 63 List変数： l_CUR_CD */
	public List l_CUR_CD = null;

	/** 第 64 List変数： l_EXCH_TYP */
	public List l_EXCH_TYP = null;

	/** 第 65 List変数： l_ROUND_TYP */
	public List l_ROUND_TYP = null;

	/** 第 66 List変数： l_CUR_NAME */
	public List l_CUR_NAME = null;

	/** 第 67 List変数： l_CUR_UNIT */
	public List l_CUR_UNIT = null;

	/** 第 68 List変数： l_DECIMAL_FIG */
	public List l_DECIMAL_FIG = null;

	/** 第 69 List変数： l_PUCH_ODR_CD */
	public List l_PUCH_ODR_CD = null;

	/** 第 70 List変数： l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** 第 71 List変数： l_ACPT_NO */
	public List l_ACPT_NO = null;

	/** 第 72 List変数： l_ACPT_QTY */
	public List l_ACPT_QTY = null;

	/** 第 73 List変数： l_ACPT_DATE */
	public List l_ACPT_DATE = null;

	/** 第 74 List変数： l_INSPECTED_QTY */
	public List l_INSPECTED_QTY = null;

	/** 第 75 List変数： l_ACCEPTED_QTY */
	public List l_ACCEPTED_QTY = null;

	/** 第 76 List変数： l_INSPEC_DATE */
	public List l_INSPEC_DATE = null;

	/** 第 77 List変数： l_OLD_TAX_RATE_1 */
	public List l_OLD_TAX_RATE_1 = null;

	/** 第 78 List変数： l_OLD_TAX_RATE_2 */
	public List l_OLD_TAX_RATE_2 = null;

	/** 第 79 List変数： l_OLD_TAX_RATE_3 */
	public List l_OLD_TAX_RATE_3 = null;

	/** 第 80 List変数： l_NEW_TAX_RATE_START_DATE */
	public List l_NEW_TAX_RATE_START_DATE = null;

	/** 第 81 List変数： l_NEW_TAX_RATE_1 */
	public List l_NEW_TAX_RATE_1 = null;

	/** 第 82 List変数： l_NEW_TAX_RATE_2 */
	public List l_NEW_TAX_RATE_2 = null;

	/** 第 83 List変数： l_NEW_TAX_RATE_3 */
	public List l_NEW_TAX_RATE_3 = null;

	/** 第 84 List変数： l_TAX_RATE_1 */
	public List l_TAX_RATE_1 = null;

	/** 第 85 List変数： l_TAX_RATE_2 */
	public List l_TAX_RATE_2 = null;

	/** 第 86 List変数： l_TAX_RATE_3 */
	public List l_TAX_RATE_3 = null;

	/** 第 87 List変数： l_AMOUNT_INCLUDE_TAX */
	public List l_AMOUNT_INCLUDE_TAX = null;

	/** 第 88 List変数： l_HOME_CUR_AMOUNT */
	public List l_HOME_CUR_AMOUNT = null;

	/** 第 89 List変数： l_TAX_ROUND_TYP */
	public List l_TAX_ROUND_TYP = null;

	/** 第 90 List変数： l_INSPC_ACPT_NO */
	public List l_INSPC_ACPT_NO = null;

	/** 第 91 List変数： l_INSPC_ACPT_GNR_TYP */
	public List l_INSPC_ACPT_GNR_TYP = null;

	/** 第 92 List変数： l_CRCT_NO */
	public List l_CRCT_NO = null;

	/** 第 93 List変数： l_CRCT_TYP */
	public List l_CRCT_TYP = null;

	/** 第 94 List変数： l_SLIP_TYP */
	public List l_SLIP_TYP = null;

	/** 第 95 List変数： l_WORK_IN_PROC_CD */
	public List l_WORK_IN_PROC_CD = null;

	/** 第 96 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** 第 97 List変数： l_PROCESSING_COST */
	public List l_PROCESSING_COST = null;

	/** 第 98 List変数： l_MATERIAL_COST */
	public List l_MATERIAL_COST = null;

	/** 第 99 List変数： l_OTHER_OVERHEADS */
	public List l_OTHER_OVERHEADS = null;

	/** 第 100 List変数： l_INSPC_ACPT_QTY */
	public List l_INSPC_ACPT_QTY = null;

	/** 第 101 List変数： l_INSPC_ACPT_AMOUNT */
	public List l_INSPC_ACPT_AMOUNT = null;

	/** 第 102 List変数： l_SAVING_AMOUNT */
	public List l_SAVING_AMOUNT = null;

	/** 第 103 List変数： l_INSPC_ACPT_DATE */
	public List l_INSPC_ACPT_DATE = null;

	/** 第 104 List変数： l_PRODUCT_TYP */
	public List l_PRODUCT_TYP = null;

	/** 第 105 List変数： l_DLV_CD */
	public List l_DLV_CD = null;

	/** 第 106 List変数： l_DISC_AMOUNT */
	public List l_DISC_AMOUNT = null;

	/** 第 107 List変数： l_GNR_ORG_CD */
	public List l_GNR_ORG_CD = null;

	/** 第 108 List変数： l_SBCNT_PUCH_TYP */
	public List l_SBCNT_PUCH_TYP = null;

	/** 第 109 List変数： l_JOB_ODR_DETAIL_NO */
	public List l_JOB_ODR_DETAIL_NO = null;

	/** 第 110 List変数： l_CLASIFICATION_CD */
	public List l_CLASIFICATION_CD = null;

	/** 第 111 List変数： l_INV_CTRL_FLG */
	public List l_INV_CTRL_FLG = null;

	/** 第 112 List変数： l_PUCH_RTN_FLG */
	public List l_PUCH_RTN_FLG = null;

	/** 第 113 List変数： l_APPR_FLG */
	public List l_APPR_FLG = null;

	/** 第 114 List変数： l_APPR_ID */
	public List l_APPR_ID = null;

	/** 第 115 List変数： l_APPR_DATE */
	public List l_APPR_DATE = null;

	/** 第 116 List変数： l_RESERVE_CAUSE */
	public List l_RESERVE_CAUSE = null;

	/** 第 117 List変数： l_SLIP_CTRL_GRP */
	public List l_SLIP_CTRL_GRP = null;

	/** 第 118 List変数： l_SLIP_DATE */
	public List l_SLIP_DATE = null;

	/** 第 119 List変数： l_SLIP_CD */
	public List l_SLIP_CD = null;

	/** 第 120 List変数： l_SEQ_NO */
	public List l_SEQ_NO = null;

	/** 第 121 List変数： l_NET_AMOUNT_YEN */
	public List l_NET_AMOUNT_YEN = null;

	/** 第 122 List変数： l_AMOUNT */
	public List l_AMOUNT = null;

	/** 第 123 List変数： l_TAX_TYP */
	public List l_TAX_TYP = null;

	/** 第 124 List変数： l_TAX_AMOUNT */
	public List l_TAX_AMOUNT = null;

	/** 第 125 List変数： l_GROSS_AMOUNT */
	public List l_GROSS_AMOUNT = null;

	/** 第 126 List変数： l_TAX_AMOUNT_YEN */
	public List l_TAX_AMOUNT_YEN = null;

	/** 第 127 List変数： l_GROSS_AMOUNT_YEN */
	public List l_GROSS_AMOUNT_YEN = null;

	/** 第 128 List変数： l_SUM_TAX_AMOUNT */
	public List l_SUM_TAX_AMOUNT = null;

	/** 第 129 List変数： l_SUM_GROSS_AMOUNT */
	public List l_SUM_GROSS_AMOUNT = null;

	/** 第 130 List変数： l_SUM_NET_AMOUNT */
	public List l_SUM_NET_AMOUNT = null;

	/** 第 131 List変数： l_TAX_TOTAL */
	public List l_TAX_TOTAL = null;

	/** 第 132 List変数： l_GROSS_TOTAL */
	public List l_GROSS_TOTAL = null;

	/** 第 133 List変数： l_NET_TOTAL */
	public List l_NET_TOTAL = null;

	/** 第 134 List変数： l_LINE_NO */
	public List l_LINE_NO = null;

	/** 第 135 List変数： l_LINE_TYP */
	public List l_LINE_TYP = null;

	/** 第 136 List変数： l_TAX_AMOUNT_CTRL_FLG */
	public List l_TAX_AMOUNT_CTRL_FLG = null;

	/** 第 137 List変数： l_UNIT_COST_YEN */
	public List l_UNIT_COST_YEN = null;

	/** 第 138 List変数： l_PROCESSING_COST_YEN */
	public List l_PROCESSING_COST_YEN = null;

	/** 第 139 List変数： l_MATERIAL_COST_YEN */
	public List l_MATERIAL_COST_YEN = null;

	/** 第 140 List変数： l_OTHER_OVERHEADS_YEN */
	public List l_OTHER_OVERHEADS_YEN = null;

	/** 第 141 List変数： l_DR_ACCT_CD */
	public List l_DR_ACCT_CD = null;

	/** 第 142 List変数： l_DR_SUB_ACCT_CD */
	public List l_DR_SUB_ACCT_CD = null;

	/** 第 143 List変数： l_DR_ORG_CD */
	public List l_DR_ORG_CD = null;

	/** 第 144 List変数： l_CR_ACCT_CD */
	public List l_CR_ACCT_CD = null;

	/** 第 145 List変数： l_CR_SUB_ACCT_CD */
	public List l_CR_SUB_ACCT_CD = null;

	/** 第 146 List変数： l_CR_ORG_CD */
	public List l_CR_ORG_CD = null;

	/** 第 147 List変数： l_FIXED_ASSETS_CD */
	public List l_FIXED_ASSETS_CD = null;

	/** 第 148 List変数： l_SUB_FIXED_ASSETS_CD */
	public List l_SUB_FIXED_ASSETS_CD = null;

	/** 第 149 List変数： l_DETAIL_NO */
	public List l_DETAIL_NO = null;

	/** 第 150 List変数： l_COMM_PUCH_ODR_LINE_NO */
	public List l_COMM_PUCH_ODR_LINE_NO = null;

	/** 第 151 List変数： l_ARV_RSLT_LINE_NO */
	public List l_ARV_RSLT_LINE_NO = null;

	/** 第 152 List変数： l_STOCK_CTRL_FLG */
	public List l_STOCK_CTRL_FLG = null;

	/** 第 153 List変数： l_REMARKS */
	public List l_REMARKS = null;

	/** 第 154 List変数： l_INSPC_ACPT_CRCT_TYP */
	public List l_INSPC_ACPT_CRCT_TYP = null;

	/** 第 155 List変数： l_ORGN_SLIP_CTRL_GRP */
	public List l_ORGN_SLIP_CTRL_GRP = null;

	/** 第 156 List変数： l_ORGN_SLIP_CD */
	public List l_ORGN_SLIP_CD = null;

	/** 第 157 List変数： l_ORGN_SLIP_DATE */
	public List l_ORGN_SLIP_DATE = null;

	/** 第 158 List変数： l_SLIP_TRN_CD */
	public List l_SLIP_TRN_CD = null;

	/** 第 159 List変数： l_STOCK_CLASS_CD */
	public List l_STOCK_CLASS_CD = null;

	/** 第 160 List変数： l_BALANCE_CLASS_CD */
	public List l_BALANCE_CLASS_CD = null;

	/** 第 161 List変数： l_PUCH_ODR_ORG_CD */
	public List l_PUCH_ODR_ORG_CD = null;

	/** 第 162 List変数： l_PUCH_ODR_PERSON_CD */
	public List l_PUCH_ODR_PERSON_CD = null;

	/** 第 163 List変数： l_WH_CD */
	public List l_WH_CD = null;

	/** 第 164 List変数： l_SHIP_WH_CD */
	public List l_SHIP_WH_CD = null;

	/** 第 165 List変数： l_PAYEE_CD */
	public List l_PAYEE_CD = null;

	/** 第 166 List変数： l_SLIP_CTRL_ORG_CD */
	public List l_SLIP_CTRL_ORG_CD = null;

	/** 第 167 List変数： l_CLOSING_CTRL_ORG_CD */
	public List l_CLOSING_CTRL_ORG_CD = null;

	/** 第 168 List変数： l_PAY_CALC_CTRL_ORG_CD */
	public List l_PAY_CALC_CTRL_ORG_CD = null;

	/** 第 169 List変数： l_PAY_FIX_CTRL_ORG_CD */
	public List l_PAY_FIX_CTRL_ORG_CD = null;

	/** 第 170 List変数： l_EXPL_TYP */
	public List l_EXPL_TYP = null;

	/** 第 171 List変数： l_EXPL_CD */
	public List l_EXPL_CD = null;

	/** 第 172 List変数： l_EXPL_NAME */
	public List l_EXPL_NAME = null;

	/** 第 173 List変数： l_ODR_CD */
	public List l_ODR_CD = null;

	/** 第 174 List変数： l_COMM_PUCH_ODR_SLIP_TYP */
	public List l_COMM_PUCH_ODR_SLIP_TYP = null;

	/** 第 175 List変数： l_COMM_PUCH_ODR_SLIP_CTRL_GRP */
	public List l_COMM_PUCH_ODR_SLIP_CTRL_GRP = null;

	/** 第 176 List変数： l_COMM_PUCH_ODR_SLIP_CD */
	public List l_COMM_PUCH_ODR_SLIP_CD = null;

	/** 第 177 List変数： l_COMM_PUCH_ODR_SLIP_DATE */
	public List l_COMM_PUCH_ODR_SLIP_DATE = null;

	/** 第 178 List変数： l_ARV_RSLT_SLIP_TYP */
	public List l_ARV_RSLT_SLIP_TYP = null;

	/** 第 179 List変数： l_ARV_RSLT_SLIP_CTRL_GRP */
	public List l_ARV_RSLT_SLIP_CTRL_GRP = null;

	/** 第 180 List変数： l_ARV_RSLT_SLIP_CD */
	public List l_ARV_RSLT_SLIP_CD = null;

	/** 第 181 List変数： l_ARV_RSLT_SLIP_DATE */
	public List l_ARV_RSLT_SLIP_DATE = null;

	/** 第 182 List変数： l_PUCH_RSLT_SLIP_ID */
	public List l_PUCH_RSLT_SLIP_ID = null;

	/** 第 183 List変数： l_TAX_CALC_TYP */
	public List l_TAX_CALC_TYP = null;

	/** 第 184 List変数： l_TAX_APPLY_TYP */
	public List l_TAX_APPLY_TYP = null;

	/** 第 185 List変数： l_TEMP_UNIT_COST_PUCH_RSLT_FLG */
	public List l_TEMP_UNIT_COST_PUCH_RSLT_FLG = null;

	/** 第 186 List変数： l_UNIT_COST_ZERO_INSPC_ACPT_FLG */
	public List l_UNIT_COST_ZERO_INSPC_ACPT_FLG = null;

	/** 第 187 List変数： l_IMPORT_TRN_TYP */
	public List l_IMPORT_TRN_TYP = null;

	/** 第 188 List変数： l_PAY_CYCLE_TYP */
	public List l_PAY_CYCLE_TYP = null;

	/** 第 189 List変数： l_DEADLINE_DATE */
	public List l_DEADLINE_DATE = null;

	/** 第 190 List変数： l_PAY_SCH_DATE */
	public List l_PAY_SCH_DATE = null;

	/** 第 191 List変数： l_PAY_PATTERN_CD */
	public List l_PAY_PATTERN_CD = null;

	/** 第 192 List変数： l_EXCH_RSRV_CD */
	public List l_EXCH_RSRV_CD = null;

	/** 第 193 List変数： l_EXCH_DATE */
	public List l_EXCH_DATE = null;

	/** 第 194 List変数： l_PUR_RSLT_SLIP_ISSUE_FLG */
	public List l_PUR_RSLT_SLIP_ISSUE_FLG = null;

	/** 第 195 List変数： l_PUR_RSLT_REP_ISSUE_FLG */
	public List l_PUR_RSLT_REP_ISSUE_FLG = null;

	/** 第 196 List変数： l_ACPT_ARV_MODIFICATION_FLG */
	public List l_ACPT_ARV_MODIFICATION_FLG = null;

	/** 第 197 List変数： l_INSPC_ACPT_MODIFICATION_FLG */
	public List l_INSPC_ACPT_MODIFICATION_FLG = null;

	/** 第 198 List変数： l_STATUS */
	public List l_STATUS = null;

	/** 第 199 List変数： l_CRCT_FLG */
	public List l_CRCT_FLG = null;

	/** 第 200 List変数： l_APPROVAL_DATE */
	public List l_APPROVAL_DATE = null;

	/** 第 201 List変数： l_APPROVAL_CD */
	public List l_APPROVAL_CD = null;

	/** 第 202 List変数： l_APPROVAL_RSRV_DATE */
	public List l_APPROVAL_RSRV_DATE = null;

	/** 第 203 List変数： l_APPROVAL_RSRV_CD */
	public List l_APPROVAL_RSRV_CD = null;

	/** 第 204 List変数： l_RSN_CD */
	public List l_RSN_CD = null;

	/** 第 205 List変数： l_RECORDING_DATE */
	public List l_RECORDING_DATE = null;

	/** 第 206 List変数： l_RECORDING_MONTH */
	public List l_RECORDING_MONTH = null;

	/** 第 207 List変数： l_ORGN_RECORDING_DATE */
	public List l_ORGN_RECORDING_DATE = null;

	/** 第 208 List変数： l_ORGN_RECORDING_MONTH */
	public List l_ORGN_RECORDING_MONTH = null;

	/** 第 209 List変数： l_RECORDING_PROC_DATE */
	public List l_RECORDING_PROC_DATE = null;

	/** 第 210 List変数： l_RECORDING_PROC_CD */
	public List l_RECORDING_PROC_CD = null;

	/** 第 211 List変数： l_CLOSING_RSRV_DATE */
	public List l_CLOSING_RSRV_DATE = null;

	/** 第 212 List変数： l_CLOSING_RSRV_CD */
	public List l_CLOSING_RSRV_CD = null;

	/** 第 213 List変数： l_CLOSING_DATE */
	public List l_CLOSING_DATE = null;

	/** 第 214 List変数： l_CLOSING_CD */
	public List l_CLOSING_CD = null;

	/** 第 215 List変数： l_PAY_FIX_DATE */
	public List l_PAY_FIX_DATE = null;

	/** 第 216 List変数： l_PAY_FIX_CD */
	public List l_PAY_FIX_CD = null;

	/** 第 217 List変数： l_DEBT_BALANCE_OUT_FLG */
	public List l_DEBT_BALANCE_OUT_FLG = null;

	/** 第 218 List変数： l_DEBT_BALANCE_OUT_DATE */
	public List l_DEBT_BALANCE_OUT_DATE = null;

	/** 第 219 List変数： l_MONTH */
	public List l_MONTH = null;

	/** 第 220 List変数： l_ACCT_CD */
	public List l_ACCT_CD = null;

	/** 第 221 List変数： l_SUB_ACCT_CD */
	public List l_SUB_ACCT_CD = null;

	/** 第 222 List変数： l_ORG_CD */
	public List l_ORG_CD = null;

	/** 第 223 List変数： l_DATA_TYP */
	public List l_DATA_TYP = null;

	/** 第 224 List変数： l_GL_IF_OUT_FLG */
	public List l_GL_IF_OUT_FLG = null;

	/** 第 225 List変数： l_BALANCE_UPD_FLG */
	public List l_BALANCE_UPD_FLG = null;

	/** 第 226 List変数： l_BALANCE_UPD_DATE */
	public List l_BALANCE_UPD_DATE = null;

	/** 第 227 List変数： l_RECORDING_AMOUNT */
	public List l_RECORDING_AMOUNT = null;

	/** 第 228 List変数： l_DEBT_AMOUNT */
	public List l_DEBT_AMOUNT = null;

	/** 第 229 List変数： l_REBATE_AMOUNT */
	public List l_REBATE_AMOUNT = null;

	/** 第 230 List変数： l_RETURNED_GOODS_AMOUNT */
	public List l_RETURNED_GOODS_AMOUNT = null;

	/** 第 231 List変数： l_RECORDING_AMOUNT_YEN */
	public List l_RECORDING_AMOUNT_YEN = null;

	/** 第 232 List変数： l_DEBT_AMOUNT_YEN */
	public List l_DEBT_AMOUNT_YEN = null;

	/** 第 233 List変数： l_SAVING_AMOUNT_YEN */
	public List l_SAVING_AMOUNT_YEN = null;

	/** 第 234 List変数： l_REBATE_AMOUNT_YEN */
	public List l_REBATE_AMOUNT_YEN = null;

	/** 第 235 List変数： l_RETURNED_GOODS_AMOUNT_YEN */
	public List l_RETURNED_GOODS_AMOUNT_YEN = null;

	/** 第 236 List変数： l_INSPC_ACPT_AMOUNT_YEN */
	public List l_INSPC_ACPT_AMOUNT_YEN = null;

	/** 第 237 List変数： l_EXCH_DIFF_AMOUNT_YEN */
	public List l_EXCH_DIFF_AMOUNT_YEN = null;

	/** 第 238 List変数： l_OPTION_ID */
	public List l_OPTION_ID = null;

	/** 第 239 List変数： l_OWN_CUR_CD */
	public List l_OWN_CUR_CD = null;

	/** 第 240 List変数： l_THIS_MONTH */
	public List l_THIS_MONTH = null;

	/** 第 241 List変数： l_HOME_DECIMAL_FIG */
	public List l_HOME_DECIMAL_FIG = null;

	/** 第 242 List変数： l_HOME_CUR_CD */
	public List l_HOME_CUR_CD = null;

	/** 第 243 List変数： l_TIME_CTRL */
	public List l_TIME_CTRL = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getc_NON_NO_ITEM_FLG() { return m_c_NON_NO_ITEM_FLG; }
	public String getPUCH_ODR_DLV_TIME() { return m_PUCH_ODR_DLV_TIME; }
	public String getPUCH_ODR_START_TIME() { return m_PUCH_ODR_START_TIME; }
	public String getl_STATUS() { return m_l_STATUS; }
	public String getl_ACPT_NO() { return m_l_ACPT_NO; }
	public String getl_ACPT_QTY() { return m_l_ACPT_QTY; }
	public String getl_ACPT_DATE() { return m_l_ACPT_DATE; }
	public String getl_UNIT_COST() { return m_l_UNIT_COST; }
	public String getl_UNIT_COST_TYP() { return m_l_UNIT_COST_TYP; }
	public String getl_PUCH_ODR_AMOUNT() { return m_l_PUCH_ODR_AMOUNT; }
	public String getl_INSPECTED_QTY() { return m_l_INSPECTED_QTY; }
	public String getl_ACCEPTED_QTY() { return m_l_ACCEPTED_QTY; }
	public String getl_INSPEC_DATE() { return m_l_INSPEC_DATE; }
	public String geth_NET_AMOUNT() { return m_h_NET_AMOUNT; }
	public String geth_TAX_AMOUNT_1() { return m_h_TAX_AMOUNT_1; }
	public String geth_TAX_AMOUNT_2() { return m_h_TAX_AMOUNT_2; }
	public String geth_TAX_AMOUNT_3() { return m_h_TAX_AMOUNT_3; }
	public String geth_DECIMAL_FIG() { return m_h_DECIMAL_FIG; }
	public String geth_ROUND_TYP() { return m_h_ROUND_TYP; }
	public String geth_PUCH_ODR_STS_TYP() { return m_h_PUCH_ODR_STS_TYP; }
	public String geth_PUCH_ODR_INST_SLIP_ISS_FLG() { return m_h_PUCH_ODR_INST_SLIP_ISS_FLG; }
	public String geth_ODR_CANCEL_SLIP_ISS_FLG() { return m_h_ODR_CANCEL_SLIP_ISS_FLG; }
	public String geth_INSPC_CMPLT_FLG() { return m_h_INSPC_CMPLT_FLG; }
	public String geth_ACPT_INSPC_TYP() { return m_h_ACPT_INSPC_TYP; }
	public String geth_NET_AMOUNT_LIST() { return m_h_NET_AMOUNT_LIST; }
	public String geth_TAX_AMOUNT_1_LIST() { return m_h_TAX_AMOUNT_1_LIST; }
	public String geth_TAX_AMOUNT_2_LIST() { return m_h_TAX_AMOUNT_2_LIST; }
	public String geth_TAX_AMOUNT_3_LIST() { return m_h_TAX_AMOUNT_3_LIST; }
	public String geth_UPDATE_FLG() { return m_h_UPDATE_FLG; }
	public String geth_MODIFY_COUNT() { return m_h_MODIFY_COUNT; }
	public String geth_MODIFY_COUNT_LIST() { return m_h_MODIFY_COUNT_LIST; }
	public String geth_EXCH_RATE() { return m_h_EXCH_RATE; }
	public String geth_EXCH_RATE_LIST() { return m_h_EXCH_RATE_LIST; }
	public String geth_TAX_CD() { return m_h_TAX_CD; }
	public String geth_PUCH_ODR_CD() { return m_h_PUCH_ODR_CD; }
	public String getNON_NO_ITEM_FLG() { return m_NON_NO_ITEM_FLG; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getPUCH_ODR_DLV_DATE() { return m_PUCH_ODR_DLV_DATE; }
	public String getTAX_CD() { return m_TAX_CD; }
	public String getPUCH_ODR_START_DATE() { return m_PUCH_ODR_START_DATE; }
	public String getPUCH_ODR_QTY() { return m_PUCH_ODR_QTY; }
	public String getUNIT_COST_TYP() { return m_UNIT_COST_TYP; }
	public String getUNIT_COST() { return m_UNIT_COST; }
	public String getACPT_INSPC_TYP() { return m_ACPT_INSPC_TYP; }
	public String getPUCH_ODR_AMOUNT() { return m_PUCH_ODR_AMOUNT; }
	public String getRATE_JUDGE_DATE() { return m_RATE_JUDGE_DATE; }
	public String getNET_AMOUNT() { return m_NET_AMOUNT; }
	public String getTAX_AMOUNT_1() { return m_TAX_AMOUNT_1; }
	public String getTAX_AMOUNT_2() { return m_TAX_AMOUNT_2; }
	public String getTAX_AMOUNT_3() { return m_TAX_AMOUNT_3; }
	public String getPUCH_ODR_STS_TYP() { return m_PUCH_ODR_STS_TYP; }
	public String getPUCH_ODR_INST_SLIP_ISS_FLG() { return m_PUCH_ODR_INST_SLIP_ISS_FLG; }
	public String getODR_CANCEL_SLIP_ISS_FLG() { return m_ODR_CANCEL_SLIP_ISS_FLG; }
	public String getINSPC_CMPLT_FLG() { return m_INSPC_CMPLT_FLG; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getEXCH_RATE() { return m_EXCH_RATE; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getVEND_NAME() { return m_VEND_NAME; }
	public String getINSPC_ACPT_APP_TYP() { return m_INSPC_ACPT_APP_TYP; }
	public String getCUR_CD() { return m_CUR_CD; }
	public String getEXCH_TYP() { return m_EXCH_TYP; }
	public String getROUND_TYP() { return m_ROUND_TYP; }
	public String getCUR_NAME() { return m_CUR_NAME; }
	public String getCUR_UNIT() { return m_CUR_UNIT; }
	public String getDECIMAL_FIG() { return m_DECIMAL_FIG; }
	public String getPUCH_ODR_CD() { return m_PUCH_ODR_CD; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getACPT_NO() { return m_ACPT_NO; }
	public String getACPT_QTY() { return m_ACPT_QTY; }
	public String getACPT_DATE() { return m_ACPT_DATE; }
	public String getINSPECTED_QTY() { return m_INSPECTED_QTY; }
	public String getACCEPTED_QTY() { return m_ACCEPTED_QTY; }
	public String getINSPEC_DATE() { return m_INSPEC_DATE; }
	public String getOLD_TAX_RATE_1() { return m_OLD_TAX_RATE_1; }
	public String getOLD_TAX_RATE_2() { return m_OLD_TAX_RATE_2; }
	public String getOLD_TAX_RATE_3() { return m_OLD_TAX_RATE_3; }
	public String getNEW_TAX_RATE_START_DATE() { return m_NEW_TAX_RATE_START_DATE; }
	public String getNEW_TAX_RATE_1() { return m_NEW_TAX_RATE_1; }
	public String getNEW_TAX_RATE_2() { return m_NEW_TAX_RATE_2; }
	public String getNEW_TAX_RATE_3() { return m_NEW_TAX_RATE_3; }
	public String getTAX_RATE_1() { return m_TAX_RATE_1; }
	public String getTAX_RATE_2() { return m_TAX_RATE_2; }
	public String getTAX_RATE_3() { return m_TAX_RATE_3; }
	public String getAMOUNT_INCLUDE_TAX() { return m_AMOUNT_INCLUDE_TAX; }
	public String getHOME_CUR_AMOUNT() { return m_HOME_CUR_AMOUNT; }
	public String getTAX_ROUND_TYP() { return m_TAX_ROUND_TYP; }
	public String getINSPC_ACPT_NO() { return m_INSPC_ACPT_NO; }
	public String getINSPC_ACPT_GNR_TYP() { return m_INSPC_ACPT_GNR_TYP; }
	public String getCRCT_NO() { return m_CRCT_NO; }
	public String getCRCT_TYP() { return m_CRCT_TYP; }
	public String getSLIP_TYP() { return m_SLIP_TYP; }
	public String getWORK_IN_PROC_CD() { return m_WORK_IN_PROC_CD; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getPROCESSING_COST() { return m_PROCESSING_COST; }
	public String getMATERIAL_COST() { return m_MATERIAL_COST; }
	public String getOTHER_OVERHEADS() { return m_OTHER_OVERHEADS; }
	public String getINSPC_ACPT_QTY() { return m_INSPC_ACPT_QTY; }
	public String getINSPC_ACPT_AMOUNT() { return m_INSPC_ACPT_AMOUNT; }
	public String getSAVING_AMOUNT() { return m_SAVING_AMOUNT; }
	public String getINSPC_ACPT_DATE() { return m_INSPC_ACPT_DATE; }
	public String getPRODUCT_TYP() { return m_PRODUCT_TYP; }
	public String getDLV_CD() { return m_DLV_CD; }
	public String getDISC_AMOUNT() { return m_DISC_AMOUNT; }
	public String getGNR_ORG_CD() { return m_GNR_ORG_CD; }
	public String getSBCNT_PUCH_TYP() { return m_SBCNT_PUCH_TYP; }
	public String getJOB_ODR_DETAIL_NO() { return m_JOB_ODR_DETAIL_NO; }
	public String getCLASIFICATION_CD() { return m_CLASIFICATION_CD; }
	public String getINV_CTRL_FLG() { return m_INV_CTRL_FLG; }
	public String getPUCH_RTN_FLG() { return m_PUCH_RTN_FLG; }
	public String getAPPR_FLG() { return m_APPR_FLG; }
	public String getAPPR_ID() { return m_APPR_ID; }
	public String getAPPR_DATE() { return m_APPR_DATE; }
	public String getRESERVE_CAUSE() { return m_RESERVE_CAUSE; }
	public String getSLIP_CTRL_GRP() { return m_SLIP_CTRL_GRP; }
	public String getSLIP_DATE() { return m_SLIP_DATE; }
	public String getSLIP_CD() { return m_SLIP_CD; }
	public String getSEQ_NO() { return m_SEQ_NO; }
	public String getNET_AMOUNT_YEN() { return m_NET_AMOUNT_YEN; }
	public String getAMOUNT() { return m_AMOUNT; }
	public String getTAX_TYP() { return m_TAX_TYP; }
	public String getTAX_AMOUNT() { return m_TAX_AMOUNT; }
	public String getGROSS_AMOUNT() { return m_GROSS_AMOUNT; }
	public String getTAX_AMOUNT_YEN() { return m_TAX_AMOUNT_YEN; }
	public String getGROSS_AMOUNT_YEN() { return m_GROSS_AMOUNT_YEN; }
	public String getSUM_TAX_AMOUNT() { return m_SUM_TAX_AMOUNT; }
	public String getSUM_GROSS_AMOUNT() { return m_SUM_GROSS_AMOUNT; }
	public String getSUM_NET_AMOUNT() { return m_SUM_NET_AMOUNT; }
	public String getTAX_TOTAL() { return m_TAX_TOTAL; }
	public String getGROSS_TOTAL() { return m_GROSS_TOTAL; }
	public String getNET_TOTAL() { return m_NET_TOTAL; }
	public String getLINE_NO() { return m_LINE_NO; }
	public String getLINE_TYP() { return m_LINE_TYP; }
	public String getTAX_AMOUNT_CTRL_FLG() { return m_TAX_AMOUNT_CTRL_FLG; }
	public String getUNIT_COST_YEN() { return m_UNIT_COST_YEN; }
	public String getPROCESSING_COST_YEN() { return m_PROCESSING_COST_YEN; }
	public String getMATERIAL_COST_YEN() { return m_MATERIAL_COST_YEN; }
	public String getOTHER_OVERHEADS_YEN() { return m_OTHER_OVERHEADS_YEN; }
	public String getDR_ACCT_CD() { return m_DR_ACCT_CD; }
	public String getDR_SUB_ACCT_CD() { return m_DR_SUB_ACCT_CD; }
	public String getDR_ORG_CD() { return m_DR_ORG_CD; }
	public String getCR_ACCT_CD() { return m_CR_ACCT_CD; }
	public String getCR_SUB_ACCT_CD() { return m_CR_SUB_ACCT_CD; }
	public String getCR_ORG_CD() { return m_CR_ORG_CD; }
	public String getFIXED_ASSETS_CD() { return m_FIXED_ASSETS_CD; }
	public String getSUB_FIXED_ASSETS_CD() { return m_SUB_FIXED_ASSETS_CD; }
	public String getDETAIL_NO() { return m_DETAIL_NO; }
	public String getCOMM_PUCH_ODR_LINE_NO() { return m_COMM_PUCH_ODR_LINE_NO; }
	public String getARV_RSLT_LINE_NO() { return m_ARV_RSLT_LINE_NO; }
	public String getSTOCK_CTRL_FLG() { return m_STOCK_CTRL_FLG; }
	public String getREMARKS() { return m_REMARKS; }
	public String getINSPC_ACPT_CRCT_TYP() { return m_INSPC_ACPT_CRCT_TYP; }
	public String getORGN_SLIP_CTRL_GRP() { return m_ORGN_SLIP_CTRL_GRP; }
	public String getORGN_SLIP_CD() { return m_ORGN_SLIP_CD; }
	public String getORGN_SLIP_DATE() { return m_ORGN_SLIP_DATE; }
	public String getSLIP_TRN_CD() { return m_SLIP_TRN_CD; }
	public String getSTOCK_CLASS_CD() { return m_STOCK_CLASS_CD; }
	public String getBALANCE_CLASS_CD() { return m_BALANCE_CLASS_CD; }
	public String getPUCH_ODR_ORG_CD() { return m_PUCH_ODR_ORG_CD; }
	public String getPUCH_ODR_PERSON_CD() { return m_PUCH_ODR_PERSON_CD; }
	public String getWH_CD() { return m_WH_CD; }
	public String getSHIP_WH_CD() { return m_SHIP_WH_CD; }
	public String getPAYEE_CD() { return m_PAYEE_CD; }
	public String getSLIP_CTRL_ORG_CD() { return m_SLIP_CTRL_ORG_CD; }
	public String getCLOSING_CTRL_ORG_CD() { return m_CLOSING_CTRL_ORG_CD; }
	public String getPAY_CALC_CTRL_ORG_CD() { return m_PAY_CALC_CTRL_ORG_CD; }
	public String getPAY_FIX_CTRL_ORG_CD() { return m_PAY_FIX_CTRL_ORG_CD; }
	public String getEXPL_TYP() { return m_EXPL_TYP; }
	public String getEXPL_CD() { return m_EXPL_CD; }
	public String getEXPL_NAME() { return m_EXPL_NAME; }
	public String getODR_CD() { return m_ODR_CD; }
	public String getCOMM_PUCH_ODR_SLIP_TYP() { return m_COMM_PUCH_ODR_SLIP_TYP; }
	public String getCOMM_PUCH_ODR_SLIP_CTRL_GRP() { return m_COMM_PUCH_ODR_SLIP_CTRL_GRP; }
	public String getCOMM_PUCH_ODR_SLIP_CD() { return m_COMM_PUCH_ODR_SLIP_CD; }
	public String getCOMM_PUCH_ODR_SLIP_DATE() { return m_COMM_PUCH_ODR_SLIP_DATE; }
	public String getARV_RSLT_SLIP_TYP() { return m_ARV_RSLT_SLIP_TYP; }
	public String getARV_RSLT_SLIP_CTRL_GRP() { return m_ARV_RSLT_SLIP_CTRL_GRP; }
	public String getARV_RSLT_SLIP_CD() { return m_ARV_RSLT_SLIP_CD; }
	public String getARV_RSLT_SLIP_DATE() { return m_ARV_RSLT_SLIP_DATE; }
	public String getPUCH_RSLT_SLIP_ID() { return m_PUCH_RSLT_SLIP_ID; }
	public String getTAX_CALC_TYP() { return m_TAX_CALC_TYP; }
	public String getTAX_APPLY_TYP() { return m_TAX_APPLY_TYP; }
	public String getTEMP_UNIT_COST_PUCH_RSLT_FLG() { return m_TEMP_UNIT_COST_PUCH_RSLT_FLG; }
	public String getUNIT_COST_ZERO_INSPC_ACPT_FLG() { return m_UNIT_COST_ZERO_INSPC_ACPT_FLG; }
	public String getIMPORT_TRN_TYP() { return m_IMPORT_TRN_TYP; }
	public String getPAY_CYCLE_TYP() { return m_PAY_CYCLE_TYP; }
	public String getDEADLINE_DATE() { return m_DEADLINE_DATE; }
	public String getPAY_SCH_DATE() { return m_PAY_SCH_DATE; }
	public String getPAY_PATTERN_CD() { return m_PAY_PATTERN_CD; }
	public String getEXCH_RSRV_CD() { return m_EXCH_RSRV_CD; }
	public String getEXCH_DATE() { return m_EXCH_DATE; }
	public String getPUR_RSLT_SLIP_ISSUE_FLG() { return m_PUR_RSLT_SLIP_ISSUE_FLG; }
	public String getPUR_RSLT_REP_ISSUE_FLG() { return m_PUR_RSLT_REP_ISSUE_FLG; }
	public String getACPT_ARV_MODIFICATION_FLG() { return m_ACPT_ARV_MODIFICATION_FLG; }
	public String getINSPC_ACPT_MODIFICATION_FLG() { return m_INSPC_ACPT_MODIFICATION_FLG; }
	public String getSTATUS() { return m_STATUS; }
	public String getCRCT_FLG() { return m_CRCT_FLG; }
	public String getAPPROVAL_DATE() { return m_APPROVAL_DATE; }
	public String getAPPROVAL_CD() { return m_APPROVAL_CD; }
	public String getAPPROVAL_RSRV_DATE() { return m_APPROVAL_RSRV_DATE; }
	public String getAPPROVAL_RSRV_CD() { return m_APPROVAL_RSRV_CD; }
	public String getRSN_CD() { return m_RSN_CD; }
	public String getRECORDING_DATE() { return m_RECORDING_DATE; }
	public String getRECORDING_MONTH() { return m_RECORDING_MONTH; }
	public String getORGN_RECORDING_DATE() { return m_ORGN_RECORDING_DATE; }
	public String getORGN_RECORDING_MONTH() { return m_ORGN_RECORDING_MONTH; }
	public String getRECORDING_PROC_DATE() { return m_RECORDING_PROC_DATE; }
	public String getRECORDING_PROC_CD() { return m_RECORDING_PROC_CD; }
	public String getCLOSING_RSRV_DATE() { return m_CLOSING_RSRV_DATE; }
	public String getCLOSING_RSRV_CD() { return m_CLOSING_RSRV_CD; }
	public String getCLOSING_DATE() { return m_CLOSING_DATE; }
	public String getCLOSING_CD() { return m_CLOSING_CD; }
	public String getPAY_FIX_DATE() { return m_PAY_FIX_DATE; }
	public String getPAY_FIX_CD() { return m_PAY_FIX_CD; }
	public String getDEBT_BALANCE_OUT_FLG() { return m_DEBT_BALANCE_OUT_FLG; }
	public String getDEBT_BALANCE_OUT_DATE() { return m_DEBT_BALANCE_OUT_DATE; }
	public String getMONTH() { return m_MONTH; }
	public String getACCT_CD() { return m_ACCT_CD; }
	public String getSUB_ACCT_CD() { return m_SUB_ACCT_CD; }
	public String getORG_CD() { return m_ORG_CD; }
	public String getDATA_TYP() { return m_DATA_TYP; }
	public String getGL_IF_OUT_FLG() { return m_GL_IF_OUT_FLG; }
	public String getBALANCE_UPD_FLG() { return m_BALANCE_UPD_FLG; }
	public String getBALANCE_UPD_DATE() { return m_BALANCE_UPD_DATE; }
	public String getRECORDING_AMOUNT() { return m_RECORDING_AMOUNT; }
	public String getDEBT_AMOUNT() { return m_DEBT_AMOUNT; }
	public String getREBATE_AMOUNT() { return m_REBATE_AMOUNT; }
	public String getRETURNED_GOODS_AMOUNT() { return m_RETURNED_GOODS_AMOUNT; }
	public String getRECORDING_AMOUNT_YEN() { return m_RECORDING_AMOUNT_YEN; }
	public String getDEBT_AMOUNT_YEN() { return m_DEBT_AMOUNT_YEN; }
	public String getSAVING_AMOUNT_YEN() { return m_SAVING_AMOUNT_YEN; }
	public String getREBATE_AMOUNT_YEN() { return m_REBATE_AMOUNT_YEN; }
	public String getRETURNED_GOODS_AMOUNT_YEN() { return m_RETURNED_GOODS_AMOUNT_YEN; }
	public String getINSPC_ACPT_AMOUNT_YEN() { return m_INSPC_ACPT_AMOUNT_YEN; }
	public String getEXCH_DIFF_AMOUNT_YEN() { return m_EXCH_DIFF_AMOUNT_YEN; }
	public String getOPTION_ID() { return m_OPTION_ID; }
	public String getOWN_CUR_CD() { return m_OWN_CUR_CD; }
	public String getTHIS_MONTH() { return m_THIS_MONTH; }
	public String getHOME_DECIMAL_FIG() { return m_HOME_DECIMAL_FIG; }
	public String getHOME_CUR_CD() { return m_HOME_CUR_CD; }
	public String getTIME_CTRL() { return m_TIME_CTRL; }

	public List getList_c_NON_NO_ITEM_FLG() { return l_c_NON_NO_ITEM_FLG; }
	public List getList_PUCH_ODR_DLV_TIME() { return l_PUCH_ODR_DLV_TIME; }
	public List getList_PUCH_ODR_START_TIME() { return l_PUCH_ODR_START_TIME; }
	public List getList_l_STATUS() { return l_l_STATUS; }
	public List getList_l_ACPT_NO() { return l_l_ACPT_NO; }
	public List getList_l_ACPT_QTY() { return l_l_ACPT_QTY; }
	public List getList_l_ACPT_DATE() { return l_l_ACPT_DATE; }
	public List getList_l_UNIT_COST() { return l_l_UNIT_COST; }
	public List getList_l_UNIT_COST_TYP() { return l_l_UNIT_COST_TYP; }
	public List getList_l_PUCH_ODR_AMOUNT() { return l_l_PUCH_ODR_AMOUNT; }
	public List getList_l_INSPECTED_QTY() { return l_l_INSPECTED_QTY; }
	public List getList_l_ACCEPTED_QTY() { return l_l_ACCEPTED_QTY; }
	public List getList_l_INSPEC_DATE() { return l_l_INSPEC_DATE; }
	public List getList_h_NET_AMOUNT() { return l_h_NET_AMOUNT; }
	public List getList_h_TAX_AMOUNT_1() { return l_h_TAX_AMOUNT_1; }
	public List getList_h_TAX_AMOUNT_2() { return l_h_TAX_AMOUNT_2; }
	public List getList_h_TAX_AMOUNT_3() { return l_h_TAX_AMOUNT_3; }
	public List getList_h_DECIMAL_FIG() { return l_h_DECIMAL_FIG; }
	public List getList_h_ROUND_TYP() { return l_h_ROUND_TYP; }
	public List getList_h_PUCH_ODR_STS_TYP() { return l_h_PUCH_ODR_STS_TYP; }
	public List getList_h_PUCH_ODR_INST_SLIP_ISS_FLG() { return l_h_PUCH_ODR_INST_SLIP_ISS_FLG; }
	public List getList_h_ODR_CANCEL_SLIP_ISS_FLG() { return l_h_ODR_CANCEL_SLIP_ISS_FLG; }
	public List getList_h_INSPC_CMPLT_FLG() { return l_h_INSPC_CMPLT_FLG; }
	public List getList_h_ACPT_INSPC_TYP() { return l_h_ACPT_INSPC_TYP; }
	public List getList_h_NET_AMOUNT_LIST() { return l_h_NET_AMOUNT_LIST; }
	public List getList_h_TAX_AMOUNT_1_LIST() { return l_h_TAX_AMOUNT_1_LIST; }
	public List getList_h_TAX_AMOUNT_2_LIST() { return l_h_TAX_AMOUNT_2_LIST; }
	public List getList_h_TAX_AMOUNT_3_LIST() { return l_h_TAX_AMOUNT_3_LIST; }
	public List getList_h_UPDATE_FLG() { return l_h_UPDATE_FLG; }
	public List getList_h_MODIFY_COUNT() { return l_h_MODIFY_COUNT; }
	public List getList_h_MODIFY_COUNT_LIST() { return l_h_MODIFY_COUNT_LIST; }
	public List getList_h_EXCH_RATE() { return l_h_EXCH_RATE; }
	public List getList_h_EXCH_RATE_LIST() { return l_h_EXCH_RATE_LIST; }
	public List getList_h_TAX_CD() { return l_h_TAX_CD; }
	public List getList_h_PUCH_ODR_CD() { return l_h_PUCH_ODR_CD; }
	public List getList_NON_NO_ITEM_FLG() { return l_NON_NO_ITEM_FLG; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_PUCH_ODR_DLV_DATE() { return l_PUCH_ODR_DLV_DATE; }
	public List getList_TAX_CD() { return l_TAX_CD; }
	public List getList_PUCH_ODR_START_DATE() { return l_PUCH_ODR_START_DATE; }
	public List getList_PUCH_ODR_QTY() { return l_PUCH_ODR_QTY; }
	public List getList_UNIT_COST_TYP() { return l_UNIT_COST_TYP; }
	public List getList_UNIT_COST() { return l_UNIT_COST; }
	public List getList_ACPT_INSPC_TYP() { return l_ACPT_INSPC_TYP; }
	public List getList_PUCH_ODR_AMOUNT() { return l_PUCH_ODR_AMOUNT; }
	public List getList_RATE_JUDGE_DATE() { return l_RATE_JUDGE_DATE; }
	public List getList_NET_AMOUNT() { return l_NET_AMOUNT; }
	public List getList_TAX_AMOUNT_1() { return l_TAX_AMOUNT_1; }
	public List getList_TAX_AMOUNT_2() { return l_TAX_AMOUNT_2; }
	public List getList_TAX_AMOUNT_3() { return l_TAX_AMOUNT_3; }
	public List getList_PUCH_ODR_STS_TYP() { return l_PUCH_ODR_STS_TYP; }
	public List getList_PUCH_ODR_INST_SLIP_ISS_FLG() { return l_PUCH_ODR_INST_SLIP_ISS_FLG; }
	public List getList_ODR_CANCEL_SLIP_ISS_FLG() { return l_ODR_CANCEL_SLIP_ISS_FLG; }
	public List getList_INSPC_CMPLT_FLG() { return l_INSPC_CMPLT_FLG; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_EXCH_RATE() { return l_EXCH_RATE; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_VEND_NAME() { return l_VEND_NAME; }
	public List getList_INSPC_ACPT_APP_TYP() { return l_INSPC_ACPT_APP_TYP; }
	public List getList_CUR_CD() { return l_CUR_CD; }
	public List getList_EXCH_TYP() { return l_EXCH_TYP; }
	public List getList_ROUND_TYP() { return l_ROUND_TYP; }
	public List getList_CUR_NAME() { return l_CUR_NAME; }
	public List getList_CUR_UNIT() { return l_CUR_UNIT; }
	public List getList_DECIMAL_FIG() { return l_DECIMAL_FIG; }
	public List getList_PUCH_ODR_CD() { return l_PUCH_ODR_CD; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_ACPT_NO() { return l_ACPT_NO; }
	public List getList_ACPT_QTY() { return l_ACPT_QTY; }
	public List getList_ACPT_DATE() { return l_ACPT_DATE; }
	public List getList_INSPECTED_QTY() { return l_INSPECTED_QTY; }
	public List getList_ACCEPTED_QTY() { return l_ACCEPTED_QTY; }
	public List getList_INSPEC_DATE() { return l_INSPEC_DATE; }
	public List getList_OLD_TAX_RATE_1() { return l_OLD_TAX_RATE_1; }
	public List getList_OLD_TAX_RATE_2() { return l_OLD_TAX_RATE_2; }
	public List getList_OLD_TAX_RATE_3() { return l_OLD_TAX_RATE_3; }
	public List getList_NEW_TAX_RATE_START_DATE() { return l_NEW_TAX_RATE_START_DATE; }
	public List getList_NEW_TAX_RATE_1() { return l_NEW_TAX_RATE_1; }
	public List getList_NEW_TAX_RATE_2() { return l_NEW_TAX_RATE_2; }
	public List getList_NEW_TAX_RATE_3() { return l_NEW_TAX_RATE_3; }
	public List getList_TAX_RATE_1() { return l_TAX_RATE_1; }
	public List getList_TAX_RATE_2() { return l_TAX_RATE_2; }
	public List getList_TAX_RATE_3() { return l_TAX_RATE_3; }
	public List getList_AMOUNT_INCLUDE_TAX() { return l_AMOUNT_INCLUDE_TAX; }
	public List getList_HOME_CUR_AMOUNT() { return l_HOME_CUR_AMOUNT; }
	public List getList_TAX_ROUND_TYP() { return l_TAX_ROUND_TYP; }
	public List getList_INSPC_ACPT_NO() { return l_INSPC_ACPT_NO; }
	public List getList_INSPC_ACPT_GNR_TYP() { return l_INSPC_ACPT_GNR_TYP; }
	public List getList_CRCT_NO() { return l_CRCT_NO; }
	public List getList_CRCT_TYP() { return l_CRCT_TYP; }
	public List getList_SLIP_TYP() { return l_SLIP_TYP; }
	public List getList_WORK_IN_PROC_CD() { return l_WORK_IN_PROC_CD; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_PROCESSING_COST() { return l_PROCESSING_COST; }
	public List getList_MATERIAL_COST() { return l_MATERIAL_COST; }
	public List getList_OTHER_OVERHEADS() { return l_OTHER_OVERHEADS; }
	public List getList_INSPC_ACPT_QTY() { return l_INSPC_ACPT_QTY; }
	public List getList_INSPC_ACPT_AMOUNT() { return l_INSPC_ACPT_AMOUNT; }
	public List getList_SAVING_AMOUNT() { return l_SAVING_AMOUNT; }
	public List getList_INSPC_ACPT_DATE() { return l_INSPC_ACPT_DATE; }
	public List getList_PRODUCT_TYP() { return l_PRODUCT_TYP; }
	public List getList_DLV_CD() { return l_DLV_CD; }
	public List getList_DISC_AMOUNT() { return l_DISC_AMOUNT; }
	public List getList_GNR_ORG_CD() { return l_GNR_ORG_CD; }
	public List getList_SBCNT_PUCH_TYP() { return l_SBCNT_PUCH_TYP; }
	public List getList_JOB_ODR_DETAIL_NO() { return l_JOB_ODR_DETAIL_NO; }
	public List getList_CLASIFICATION_CD() { return l_CLASIFICATION_CD; }
	public List getList_INV_CTRL_FLG() { return l_INV_CTRL_FLG; }
	public List getList_PUCH_RTN_FLG() { return l_PUCH_RTN_FLG; }
	public List getList_APPR_FLG() { return l_APPR_FLG; }
	public List getList_APPR_ID() { return l_APPR_ID; }
	public List getList_APPR_DATE() { return l_APPR_DATE; }
	public List getList_RESERVE_CAUSE() { return l_RESERVE_CAUSE; }
	public List getList_SLIP_CTRL_GRP() { return l_SLIP_CTRL_GRP; }
	public List getList_SLIP_DATE() { return l_SLIP_DATE; }
	public List getList_SLIP_CD() { return l_SLIP_CD; }
	public List getList_SEQ_NO() { return l_SEQ_NO; }
	public List getList_NET_AMOUNT_YEN() { return l_NET_AMOUNT_YEN; }
	public List getList_AMOUNT() { return l_AMOUNT; }
	public List getList_TAX_TYP() { return l_TAX_TYP; }
	public List getList_TAX_AMOUNT() { return l_TAX_AMOUNT; }
	public List getList_GROSS_AMOUNT() { return l_GROSS_AMOUNT; }
	public List getList_TAX_AMOUNT_YEN() { return l_TAX_AMOUNT_YEN; }
	public List getList_GROSS_AMOUNT_YEN() { return l_GROSS_AMOUNT_YEN; }
	public List getList_SUM_TAX_AMOUNT() { return l_SUM_TAX_AMOUNT; }
	public List getList_SUM_GROSS_AMOUNT() { return l_SUM_GROSS_AMOUNT; }
	public List getList_SUM_NET_AMOUNT() { return l_SUM_NET_AMOUNT; }
	public List getList_TAX_TOTAL() { return l_TAX_TOTAL; }
	public List getList_GROSS_TOTAL() { return l_GROSS_TOTAL; }
	public List getList_NET_TOTAL() { return l_NET_TOTAL; }
	public List getList_LINE_NO() { return l_LINE_NO; }
	public List getList_LINE_TYP() { return l_LINE_TYP; }
	public List getList_TAX_AMOUNT_CTRL_FLG() { return l_TAX_AMOUNT_CTRL_FLG; }
	public List getList_UNIT_COST_YEN() { return l_UNIT_COST_YEN; }
	public List getList_PROCESSING_COST_YEN() { return l_PROCESSING_COST_YEN; }
	public List getList_MATERIAL_COST_YEN() { return l_MATERIAL_COST_YEN; }
	public List getList_OTHER_OVERHEADS_YEN() { return l_OTHER_OVERHEADS_YEN; }
	public List getList_DR_ACCT_CD() { return l_DR_ACCT_CD; }
	public List getList_DR_SUB_ACCT_CD() { return l_DR_SUB_ACCT_CD; }
	public List getList_DR_ORG_CD() { return l_DR_ORG_CD; }
	public List getList_CR_ACCT_CD() { return l_CR_ACCT_CD; }
	public List getList_CR_SUB_ACCT_CD() { return l_CR_SUB_ACCT_CD; }
	public List getList_CR_ORG_CD() { return l_CR_ORG_CD; }
	public List getList_FIXED_ASSETS_CD() { return l_FIXED_ASSETS_CD; }
	public List getList_SUB_FIXED_ASSETS_CD() { return l_SUB_FIXED_ASSETS_CD; }
	public List getList_DETAIL_NO() { return l_DETAIL_NO; }
	public List getList_COMM_PUCH_ODR_LINE_NO() { return l_COMM_PUCH_ODR_LINE_NO; }
	public List getList_ARV_RSLT_LINE_NO() { return l_ARV_RSLT_LINE_NO; }
	public List getList_STOCK_CTRL_FLG() { return l_STOCK_CTRL_FLG; }
	public List getList_REMARKS() { return l_REMARKS; }
	public List getList_INSPC_ACPT_CRCT_TYP() { return l_INSPC_ACPT_CRCT_TYP; }
	public List getList_ORGN_SLIP_CTRL_GRP() { return l_ORGN_SLIP_CTRL_GRP; }
	public List getList_ORGN_SLIP_CD() { return l_ORGN_SLIP_CD; }
	public List getList_ORGN_SLIP_DATE() { return l_ORGN_SLIP_DATE; }
	public List getList_SLIP_TRN_CD() { return l_SLIP_TRN_CD; }
	public List getList_STOCK_CLASS_CD() { return l_STOCK_CLASS_CD; }
	public List getList_BALANCE_CLASS_CD() { return l_BALANCE_CLASS_CD; }
	public List getList_PUCH_ODR_ORG_CD() { return l_PUCH_ODR_ORG_CD; }
	public List getList_PUCH_ODR_PERSON_CD() { return l_PUCH_ODR_PERSON_CD; }
	public List getList_WH_CD() { return l_WH_CD; }
	public List getList_SHIP_WH_CD() { return l_SHIP_WH_CD; }
	public List getList_PAYEE_CD() { return l_PAYEE_CD; }
	public List getList_SLIP_CTRL_ORG_CD() { return l_SLIP_CTRL_ORG_CD; }
	public List getList_CLOSING_CTRL_ORG_CD() { return l_CLOSING_CTRL_ORG_CD; }
	public List getList_PAY_CALC_CTRL_ORG_CD() { return l_PAY_CALC_CTRL_ORG_CD; }
	public List getList_PAY_FIX_CTRL_ORG_CD() { return l_PAY_FIX_CTRL_ORG_CD; }
	public List getList_EXPL_TYP() { return l_EXPL_TYP; }
	public List getList_EXPL_CD() { return l_EXPL_CD; }
	public List getList_EXPL_NAME() { return l_EXPL_NAME; }
	public List getList_ODR_CD() { return l_ODR_CD; }
	public List getList_COMM_PUCH_ODR_SLIP_TYP() { return l_COMM_PUCH_ODR_SLIP_TYP; }
	public List getList_COMM_PUCH_ODR_SLIP_CTRL_GRP() { return l_COMM_PUCH_ODR_SLIP_CTRL_GRP; }
	public List getList_COMM_PUCH_ODR_SLIP_CD() { return l_COMM_PUCH_ODR_SLIP_CD; }
	public List getList_COMM_PUCH_ODR_SLIP_DATE() { return l_COMM_PUCH_ODR_SLIP_DATE; }
	public List getList_ARV_RSLT_SLIP_TYP() { return l_ARV_RSLT_SLIP_TYP; }
	public List getList_ARV_RSLT_SLIP_CTRL_GRP() { return l_ARV_RSLT_SLIP_CTRL_GRP; }
	public List getList_ARV_RSLT_SLIP_CD() { return l_ARV_RSLT_SLIP_CD; }
	public List getList_ARV_RSLT_SLIP_DATE() { return l_ARV_RSLT_SLIP_DATE; }
	public List getList_PUCH_RSLT_SLIP_ID() { return l_PUCH_RSLT_SLIP_ID; }
	public List getList_TAX_CALC_TYP() { return l_TAX_CALC_TYP; }
	public List getList_TAX_APPLY_TYP() { return l_TAX_APPLY_TYP; }
	public List getList_TEMP_UNIT_COST_PUCH_RSLT_FLG() { return l_TEMP_UNIT_COST_PUCH_RSLT_FLG; }
	public List getList_UNIT_COST_ZERO_INSPC_ACPT_FLG() { return l_UNIT_COST_ZERO_INSPC_ACPT_FLG; }
	public List getList_IMPORT_TRN_TYP() { return l_IMPORT_TRN_TYP; }
	public List getList_PAY_CYCLE_TYP() { return l_PAY_CYCLE_TYP; }
	public List getList_DEADLINE_DATE() { return l_DEADLINE_DATE; }
	public List getList_PAY_SCH_DATE() { return l_PAY_SCH_DATE; }
	public List getList_PAY_PATTERN_CD() { return l_PAY_PATTERN_CD; }
	public List getList_EXCH_RSRV_CD() { return l_EXCH_RSRV_CD; }
	public List getList_EXCH_DATE() { return l_EXCH_DATE; }
	public List getList_PUR_RSLT_SLIP_ISSUE_FLG() { return l_PUR_RSLT_SLIP_ISSUE_FLG; }
	public List getList_PUR_RSLT_REP_ISSUE_FLG() { return l_PUR_RSLT_REP_ISSUE_FLG; }
	public List getList_ACPT_ARV_MODIFICATION_FLG() { return l_ACPT_ARV_MODIFICATION_FLG; }
	public List getList_INSPC_ACPT_MODIFICATION_FLG() { return l_INSPC_ACPT_MODIFICATION_FLG; }
	public List getList_STATUS() { return l_STATUS; }
	public List getList_CRCT_FLG() { return l_CRCT_FLG; }
	public List getList_APPROVAL_DATE() { return l_APPROVAL_DATE; }
	public List getList_APPROVAL_CD() { return l_APPROVAL_CD; }
	public List getList_APPROVAL_RSRV_DATE() { return l_APPROVAL_RSRV_DATE; }
	public List getList_APPROVAL_RSRV_CD() { return l_APPROVAL_RSRV_CD; }
	public List getList_RSN_CD() { return l_RSN_CD; }
	public List getList_RECORDING_DATE() { return l_RECORDING_DATE; }
	public List getList_RECORDING_MONTH() { return l_RECORDING_MONTH; }
	public List getList_ORGN_RECORDING_DATE() { return l_ORGN_RECORDING_DATE; }
	public List getList_ORGN_RECORDING_MONTH() { return l_ORGN_RECORDING_MONTH; }
	public List getList_RECORDING_PROC_DATE() { return l_RECORDING_PROC_DATE; }
	public List getList_RECORDING_PROC_CD() { return l_RECORDING_PROC_CD; }
	public List getList_CLOSING_RSRV_DATE() { return l_CLOSING_RSRV_DATE; }
	public List getList_CLOSING_RSRV_CD() { return l_CLOSING_RSRV_CD; }
	public List getList_CLOSING_DATE() { return l_CLOSING_DATE; }
	public List getList_CLOSING_CD() { return l_CLOSING_CD; }
	public List getList_PAY_FIX_DATE() { return l_PAY_FIX_DATE; }
	public List getList_PAY_FIX_CD() { return l_PAY_FIX_CD; }
	public List getList_DEBT_BALANCE_OUT_FLG() { return l_DEBT_BALANCE_OUT_FLG; }
	public List getList_DEBT_BALANCE_OUT_DATE() { return l_DEBT_BALANCE_OUT_DATE; }
	public List getList_MONTH() { return l_MONTH; }
	public List getList_ACCT_CD() { return l_ACCT_CD; }
	public List getList_SUB_ACCT_CD() { return l_SUB_ACCT_CD; }
	public List getList_ORG_CD() { return l_ORG_CD; }
	public List getList_DATA_TYP() { return l_DATA_TYP; }
	public List getList_GL_IF_OUT_FLG() { return l_GL_IF_OUT_FLG; }
	public List getList_BALANCE_UPD_FLG() { return l_BALANCE_UPD_FLG; }
	public List getList_BALANCE_UPD_DATE() { return l_BALANCE_UPD_DATE; }
	public List getList_RECORDING_AMOUNT() { return l_RECORDING_AMOUNT; }
	public List getList_DEBT_AMOUNT() { return l_DEBT_AMOUNT; }
	public List getList_REBATE_AMOUNT() { return l_REBATE_AMOUNT; }
	public List getList_RETURNED_GOODS_AMOUNT() { return l_RETURNED_GOODS_AMOUNT; }
	public List getList_RECORDING_AMOUNT_YEN() { return l_RECORDING_AMOUNT_YEN; }
	public List getList_DEBT_AMOUNT_YEN() { return l_DEBT_AMOUNT_YEN; }
	public List getList_SAVING_AMOUNT_YEN() { return l_SAVING_AMOUNT_YEN; }
	public List getList_REBATE_AMOUNT_YEN() { return l_REBATE_AMOUNT_YEN; }
	public List getList_RETURNED_GOODS_AMOUNT_YEN() { return l_RETURNED_GOODS_AMOUNT_YEN; }
	public List getList_INSPC_ACPT_AMOUNT_YEN() { return l_INSPC_ACPT_AMOUNT_YEN; }
	public List getList_EXCH_DIFF_AMOUNT_YEN() { return l_EXCH_DIFF_AMOUNT_YEN; }
	public List getList_OPTION_ID() { return l_OPTION_ID; }
	public List getList_OWN_CUR_CD() { return l_OWN_CUR_CD; }
	public List getList_THIS_MONTH() { return l_THIS_MONTH; }
	public List getList_HOME_DECIMAL_FIG() { return l_HOME_DECIMAL_FIG; }
	public List getList_HOME_CUR_CD() { return l_HOME_CUR_CD; }
	public List getList_TIME_CTRL() { return l_TIME_CTRL; }

	public void setc_NON_NO_ITEM_FLG(String val) { m_c_NON_NO_ITEM_FLG = val; }
	public void setPUCH_ODR_DLV_TIME(String val) { m_PUCH_ODR_DLV_TIME = val; }
	public void setPUCH_ODR_START_TIME(String val) { m_PUCH_ODR_START_TIME = val; }
	public void setl_STATUS(String val) { m_l_STATUS = val; }
	public void setl_ACPT_NO(String val) { m_l_ACPT_NO = val; }
	public void setl_ACPT_QTY(String val) { m_l_ACPT_QTY = val; }
	public void setl_ACPT_DATE(String val) { m_l_ACPT_DATE = val; }
	public void setl_UNIT_COST(String val) { m_l_UNIT_COST = val; }
	public void setl_UNIT_COST_TYP(String val) { m_l_UNIT_COST_TYP = val; }
	public void setl_PUCH_ODR_AMOUNT(String val) { m_l_PUCH_ODR_AMOUNT = val; }
	public void setl_INSPECTED_QTY(String val) { m_l_INSPECTED_QTY = val; }
	public void setl_ACCEPTED_QTY(String val) { m_l_ACCEPTED_QTY = val; }
	public void setl_INSPEC_DATE(String val) { m_l_INSPEC_DATE = val; }
	public void seth_NET_AMOUNT(String val) { m_h_NET_AMOUNT = val; }
	public void seth_TAX_AMOUNT_1(String val) { m_h_TAX_AMOUNT_1 = val; }
	public void seth_TAX_AMOUNT_2(String val) { m_h_TAX_AMOUNT_2 = val; }
	public void seth_TAX_AMOUNT_3(String val) { m_h_TAX_AMOUNT_3 = val; }
	public void seth_DECIMAL_FIG(String val) { m_h_DECIMAL_FIG = val; }
	public void seth_ROUND_TYP(String val) { m_h_ROUND_TYP = val; }
	public void seth_PUCH_ODR_STS_TYP(String val) { m_h_PUCH_ODR_STS_TYP = val; }
	public void seth_PUCH_ODR_INST_SLIP_ISS_FLG(String val) { m_h_PUCH_ODR_INST_SLIP_ISS_FLG = val; }
	public void seth_ODR_CANCEL_SLIP_ISS_FLG(String val) { m_h_ODR_CANCEL_SLIP_ISS_FLG = val; }
	public void seth_INSPC_CMPLT_FLG(String val) { m_h_INSPC_CMPLT_FLG = val; }
	public void seth_ACPT_INSPC_TYP(String val) { m_h_ACPT_INSPC_TYP = val; }
	public void seth_NET_AMOUNT_LIST(String val) { m_h_NET_AMOUNT_LIST = val; }
	public void seth_TAX_AMOUNT_1_LIST(String val) { m_h_TAX_AMOUNT_1_LIST = val; }
	public void seth_TAX_AMOUNT_2_LIST(String val) { m_h_TAX_AMOUNT_2_LIST = val; }
	public void seth_TAX_AMOUNT_3_LIST(String val) { m_h_TAX_AMOUNT_3_LIST = val; }
	public void seth_UPDATE_FLG(String val) { m_h_UPDATE_FLG = val; }
	public void seth_MODIFY_COUNT(String val) { m_h_MODIFY_COUNT = val; }
	public void seth_MODIFY_COUNT_LIST(String val) { m_h_MODIFY_COUNT_LIST = val; }
	public void seth_EXCH_RATE(String val) { m_h_EXCH_RATE = val; }
	public void seth_EXCH_RATE_LIST(String val) { m_h_EXCH_RATE_LIST = val; }
	public void seth_TAX_CD(String val) { m_h_TAX_CD = val; }
	public void seth_PUCH_ODR_CD(String val) { m_h_PUCH_ODR_CD = val; }
	public void setNON_NO_ITEM_FLG(String val) { m_NON_NO_ITEM_FLG = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void setPUCH_ODR_DLV_DATE(String val) { m_PUCH_ODR_DLV_DATE = val; }
	public void setTAX_CD(String val) { m_TAX_CD = val; }
	public void setPUCH_ODR_START_DATE(String val) { m_PUCH_ODR_START_DATE = val; }
	public void setPUCH_ODR_QTY(String val) { m_PUCH_ODR_QTY = val; }
	public void setUNIT_COST_TYP(String val) { m_UNIT_COST_TYP = val; }
	public void setUNIT_COST(String val) { m_UNIT_COST = val; }
	public void setACPT_INSPC_TYP(String val) { m_ACPT_INSPC_TYP = val; }
	public void setPUCH_ODR_AMOUNT(String val) { m_PUCH_ODR_AMOUNT = val; }
	public void setRATE_JUDGE_DATE(String val) { m_RATE_JUDGE_DATE = val; }
	public void setNET_AMOUNT(String val) { m_NET_AMOUNT = val; }
	public void setTAX_AMOUNT_1(String val) { m_TAX_AMOUNT_1 = val; }
	public void setTAX_AMOUNT_2(String val) { m_TAX_AMOUNT_2 = val; }
	public void setTAX_AMOUNT_3(String val) { m_TAX_AMOUNT_3 = val; }
	public void setPUCH_ODR_STS_TYP(String val) { m_PUCH_ODR_STS_TYP = val; }
	public void setPUCH_ODR_INST_SLIP_ISS_FLG(String val) { m_PUCH_ODR_INST_SLIP_ISS_FLG = val; }
	public void setODR_CANCEL_SLIP_ISS_FLG(String val) { m_ODR_CANCEL_SLIP_ISS_FLG = val; }
	public void setINSPC_CMPLT_FLG(String val) { m_INSPC_CMPLT_FLG = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setEXCH_RATE(String val) { m_EXCH_RATE = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setVEND_NAME(String val) { m_VEND_NAME = val; }
	public void setINSPC_ACPT_APP_TYP(String val) { m_INSPC_ACPT_APP_TYP = val; }
	public void setCUR_CD(String val) { m_CUR_CD = val; }
	public void setEXCH_TYP(String val) { m_EXCH_TYP = val; }
	public void setROUND_TYP(String val) { m_ROUND_TYP = val; }
	public void setCUR_NAME(String val) { m_CUR_NAME = val; }
	public void setCUR_UNIT(String val) { m_CUR_UNIT = val; }
	public void setDECIMAL_FIG(String val) { m_DECIMAL_FIG = val; }
	public void setPUCH_ODR_CD(String val) { m_PUCH_ODR_CD = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setACPT_NO(String val) { m_ACPT_NO = val; }
	public void setACPT_QTY(String val) { m_ACPT_QTY = val; }
	public void setACPT_DATE(String val) { m_ACPT_DATE = val; }
	public void setINSPECTED_QTY(String val) { m_INSPECTED_QTY = val; }
	public void setACCEPTED_QTY(String val) { m_ACCEPTED_QTY = val; }
	public void setINSPEC_DATE(String val) { m_INSPEC_DATE = val; }
	public void setOLD_TAX_RATE_1(String val) { m_OLD_TAX_RATE_1 = val; }
	public void setOLD_TAX_RATE_2(String val) { m_OLD_TAX_RATE_2 = val; }
	public void setOLD_TAX_RATE_3(String val) { m_OLD_TAX_RATE_3 = val; }
	public void setNEW_TAX_RATE_START_DATE(String val) { m_NEW_TAX_RATE_START_DATE = val; }
	public void setNEW_TAX_RATE_1(String val) { m_NEW_TAX_RATE_1 = val; }
	public void setNEW_TAX_RATE_2(String val) { m_NEW_TAX_RATE_2 = val; }
	public void setNEW_TAX_RATE_3(String val) { m_NEW_TAX_RATE_3 = val; }
	public void setTAX_RATE_1(String val) { m_TAX_RATE_1 = val; }
	public void setTAX_RATE_2(String val) { m_TAX_RATE_2 = val; }
	public void setTAX_RATE_3(String val) { m_TAX_RATE_3 = val; }
	public void setAMOUNT_INCLUDE_TAX(String val) { m_AMOUNT_INCLUDE_TAX = val; }
	public void setHOME_CUR_AMOUNT(String val) { m_HOME_CUR_AMOUNT = val; }
	public void setTAX_ROUND_TYP(String val) { m_TAX_ROUND_TYP = val; }
	public void setINSPC_ACPT_NO(String val) { m_INSPC_ACPT_NO = val; }
	public void setINSPC_ACPT_GNR_TYP(String val) { m_INSPC_ACPT_GNR_TYP = val; }
	public void setCRCT_NO(String val) { m_CRCT_NO = val; }
	public void setCRCT_TYP(String val) { m_CRCT_TYP = val; }
	public void setSLIP_TYP(String val) { m_SLIP_TYP = val; }
	public void setWORK_IN_PROC_CD(String val) { m_WORK_IN_PROC_CD = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setPROCESSING_COST(String val) { m_PROCESSING_COST = val; }
	public void setMATERIAL_COST(String val) { m_MATERIAL_COST = val; }
	public void setOTHER_OVERHEADS(String val) { m_OTHER_OVERHEADS = val; }
	public void setINSPC_ACPT_QTY(String val) { m_INSPC_ACPT_QTY = val; }
	public void setINSPC_ACPT_AMOUNT(String val) { m_INSPC_ACPT_AMOUNT = val; }
	public void setSAVING_AMOUNT(String val) { m_SAVING_AMOUNT = val; }
	public void setINSPC_ACPT_DATE(String val) { m_INSPC_ACPT_DATE = val; }
	public void setPRODUCT_TYP(String val) { m_PRODUCT_TYP = val; }
	public void setDLV_CD(String val) { m_DLV_CD = val; }
	public void setDISC_AMOUNT(String val) { m_DISC_AMOUNT = val; }
	public void setGNR_ORG_CD(String val) { m_GNR_ORG_CD = val; }
	public void setSBCNT_PUCH_TYP(String val) { m_SBCNT_PUCH_TYP = val; }
	public void setJOB_ODR_DETAIL_NO(String val) { m_JOB_ODR_DETAIL_NO = val; }
	public void setCLASIFICATION_CD(String val) { m_CLASIFICATION_CD = val; }
	public void setINV_CTRL_FLG(String val) { m_INV_CTRL_FLG = val; }
	public void setPUCH_RTN_FLG(String val) { m_PUCH_RTN_FLG = val; }
	public void setAPPR_FLG(String val) { m_APPR_FLG = val; }
	public void setAPPR_ID(String val) { m_APPR_ID = val; }
	public void setAPPR_DATE(String val) { m_APPR_DATE = val; }
	public void setRESERVE_CAUSE(String val) { m_RESERVE_CAUSE = val; }
	public void setSLIP_CTRL_GRP(String val) { m_SLIP_CTRL_GRP = val; }
	public void setSLIP_DATE(String val) { m_SLIP_DATE = val; }
	public void setSLIP_CD(String val) { m_SLIP_CD = val; }
	public void setSEQ_NO(String val) { m_SEQ_NO = val; }
	public void setNET_AMOUNT_YEN(String val) { m_NET_AMOUNT_YEN = val; }
	public void setAMOUNT(String val) { m_AMOUNT = val; }
	public void setTAX_TYP(String val) { m_TAX_TYP = val; }
	public void setTAX_AMOUNT(String val) { m_TAX_AMOUNT = val; }
	public void setGROSS_AMOUNT(String val) { m_GROSS_AMOUNT = val; }
	public void setTAX_AMOUNT_YEN(String val) { m_TAX_AMOUNT_YEN = val; }
	public void setGROSS_AMOUNT_YEN(String val) { m_GROSS_AMOUNT_YEN = val; }
	public void setSUM_TAX_AMOUNT(String val) { m_SUM_TAX_AMOUNT = val; }
	public void setSUM_GROSS_AMOUNT(String val) { m_SUM_GROSS_AMOUNT = val; }
	public void setSUM_NET_AMOUNT(String val) { m_SUM_NET_AMOUNT = val; }
	public void setTAX_TOTAL(String val) { m_TAX_TOTAL = val; }
	public void setGROSS_TOTAL(String val) { m_GROSS_TOTAL = val; }
	public void setNET_TOTAL(String val) { m_NET_TOTAL = val; }
	public void setLINE_NO(String val) { m_LINE_NO = val; }
	public void setLINE_TYP(String val) { m_LINE_TYP = val; }
	public void setTAX_AMOUNT_CTRL_FLG(String val) { m_TAX_AMOUNT_CTRL_FLG = val; }
	public void setUNIT_COST_YEN(String val) { m_UNIT_COST_YEN = val; }
	public void setPROCESSING_COST_YEN(String val) { m_PROCESSING_COST_YEN = val; }
	public void setMATERIAL_COST_YEN(String val) { m_MATERIAL_COST_YEN = val; }
	public void setOTHER_OVERHEADS_YEN(String val) { m_OTHER_OVERHEADS_YEN = val; }
	public void setDR_ACCT_CD(String val) { m_DR_ACCT_CD = val; }
	public void setDR_SUB_ACCT_CD(String val) { m_DR_SUB_ACCT_CD = val; }
	public void setDR_ORG_CD(String val) { m_DR_ORG_CD = val; }
	public void setCR_ACCT_CD(String val) { m_CR_ACCT_CD = val; }
	public void setCR_SUB_ACCT_CD(String val) { m_CR_SUB_ACCT_CD = val; }
	public void setCR_ORG_CD(String val) { m_CR_ORG_CD = val; }
	public void setFIXED_ASSETS_CD(String val) { m_FIXED_ASSETS_CD = val; }
	public void setSUB_FIXED_ASSETS_CD(String val) { m_SUB_FIXED_ASSETS_CD = val; }
	public void setDETAIL_NO(String val) { m_DETAIL_NO = val; }
	public void setCOMM_PUCH_ODR_LINE_NO(String val) { m_COMM_PUCH_ODR_LINE_NO = val; }
	public void setARV_RSLT_LINE_NO(String val) { m_ARV_RSLT_LINE_NO = val; }
	public void setSTOCK_CTRL_FLG(String val) { m_STOCK_CTRL_FLG = val; }
	public void setREMARKS(String val) { m_REMARKS = val; }
	public void setINSPC_ACPT_CRCT_TYP(String val) { m_INSPC_ACPT_CRCT_TYP = val; }
	public void setORGN_SLIP_CTRL_GRP(String val) { m_ORGN_SLIP_CTRL_GRP = val; }
	public void setORGN_SLIP_CD(String val) { m_ORGN_SLIP_CD = val; }
	public void setORGN_SLIP_DATE(String val) { m_ORGN_SLIP_DATE = val; }
	public void setSLIP_TRN_CD(String val) { m_SLIP_TRN_CD = val; }
	public void setSTOCK_CLASS_CD(String val) { m_STOCK_CLASS_CD = val; }
	public void setBALANCE_CLASS_CD(String val) { m_BALANCE_CLASS_CD = val; }
	public void setPUCH_ODR_ORG_CD(String val) { m_PUCH_ODR_ORG_CD = val; }
	public void setPUCH_ODR_PERSON_CD(String val) { m_PUCH_ODR_PERSON_CD = val; }
	public void setWH_CD(String val) { m_WH_CD = val; }
	public void setSHIP_WH_CD(String val) { m_SHIP_WH_CD = val; }
	public void setPAYEE_CD(String val) { m_PAYEE_CD = val; }
	public void setSLIP_CTRL_ORG_CD(String val) { m_SLIP_CTRL_ORG_CD = val; }
	public void setCLOSING_CTRL_ORG_CD(String val) { m_CLOSING_CTRL_ORG_CD = val; }
	public void setPAY_CALC_CTRL_ORG_CD(String val) { m_PAY_CALC_CTRL_ORG_CD = val; }
	public void setPAY_FIX_CTRL_ORG_CD(String val) { m_PAY_FIX_CTRL_ORG_CD = val; }
	public void setEXPL_TYP(String val) { m_EXPL_TYP = val; }
	public void setEXPL_CD(String val) { m_EXPL_CD = val; }
	public void setEXPL_NAME(String val) { m_EXPL_NAME = val; }
	public void setODR_CD(String val) { m_ODR_CD = val; }
	public void setCOMM_PUCH_ODR_SLIP_TYP(String val) { m_COMM_PUCH_ODR_SLIP_TYP = val; }
	public void setCOMM_PUCH_ODR_SLIP_CTRL_GRP(String val) { m_COMM_PUCH_ODR_SLIP_CTRL_GRP = val; }
	public void setCOMM_PUCH_ODR_SLIP_CD(String val) { m_COMM_PUCH_ODR_SLIP_CD = val; }
	public void setCOMM_PUCH_ODR_SLIP_DATE(String val) { m_COMM_PUCH_ODR_SLIP_DATE = val; }
	public void setARV_RSLT_SLIP_TYP(String val) { m_ARV_RSLT_SLIP_TYP = val; }
	public void setARV_RSLT_SLIP_CTRL_GRP(String val) { m_ARV_RSLT_SLIP_CTRL_GRP = val; }
	public void setARV_RSLT_SLIP_CD(String val) { m_ARV_RSLT_SLIP_CD = val; }
	public void setARV_RSLT_SLIP_DATE(String val) { m_ARV_RSLT_SLIP_DATE = val; }
	public void setPUCH_RSLT_SLIP_ID(String val) { m_PUCH_RSLT_SLIP_ID = val; }
	public void setTAX_CALC_TYP(String val) { m_TAX_CALC_TYP = val; }
	public void setTAX_APPLY_TYP(String val) { m_TAX_APPLY_TYP = val; }
	public void setTEMP_UNIT_COST_PUCH_RSLT_FLG(String val) { m_TEMP_UNIT_COST_PUCH_RSLT_FLG = val; }
	public void setUNIT_COST_ZERO_INSPC_ACPT_FLG(String val) { m_UNIT_COST_ZERO_INSPC_ACPT_FLG = val; }
	public void setIMPORT_TRN_TYP(String val) { m_IMPORT_TRN_TYP = val; }
	public void setPAY_CYCLE_TYP(String val) { m_PAY_CYCLE_TYP = val; }
	public void setDEADLINE_DATE(String val) { m_DEADLINE_DATE = val; }
	public void setPAY_SCH_DATE(String val) { m_PAY_SCH_DATE = val; }
	public void setPAY_PATTERN_CD(String val) { m_PAY_PATTERN_CD = val; }
	public void setEXCH_RSRV_CD(String val) { m_EXCH_RSRV_CD = val; }
	public void setEXCH_DATE(String val) { m_EXCH_DATE = val; }
	public void setPUR_RSLT_SLIP_ISSUE_FLG(String val) { m_PUR_RSLT_SLIP_ISSUE_FLG = val; }
	public void setPUR_RSLT_REP_ISSUE_FLG(String val) { m_PUR_RSLT_REP_ISSUE_FLG = val; }
	public void setACPT_ARV_MODIFICATION_FLG(String val) { m_ACPT_ARV_MODIFICATION_FLG = val; }
	public void setINSPC_ACPT_MODIFICATION_FLG(String val) { m_INSPC_ACPT_MODIFICATION_FLG = val; }
	public void setSTATUS(String val) { m_STATUS = val; }
	public void setCRCT_FLG(String val) { m_CRCT_FLG = val; }
	public void setAPPROVAL_DATE(String val) { m_APPROVAL_DATE = val; }
	public void setAPPROVAL_CD(String val) { m_APPROVAL_CD = val; }
	public void setAPPROVAL_RSRV_DATE(String val) { m_APPROVAL_RSRV_DATE = val; }
	public void setAPPROVAL_RSRV_CD(String val) { m_APPROVAL_RSRV_CD = val; }
	public void setRSN_CD(String val) { m_RSN_CD = val; }
	public void setRECORDING_DATE(String val) { m_RECORDING_DATE = val; }
	public void setRECORDING_MONTH(String val) { m_RECORDING_MONTH = val; }
	public void setORGN_RECORDING_DATE(String val) { m_ORGN_RECORDING_DATE = val; }
	public void setORGN_RECORDING_MONTH(String val) { m_ORGN_RECORDING_MONTH = val; }
	public void setRECORDING_PROC_DATE(String val) { m_RECORDING_PROC_DATE = val; }
	public void setRECORDING_PROC_CD(String val) { m_RECORDING_PROC_CD = val; }
	public void setCLOSING_RSRV_DATE(String val) { m_CLOSING_RSRV_DATE = val; }
	public void setCLOSING_RSRV_CD(String val) { m_CLOSING_RSRV_CD = val; }
	public void setCLOSING_DATE(String val) { m_CLOSING_DATE = val; }
	public void setCLOSING_CD(String val) { m_CLOSING_CD = val; }
	public void setPAY_FIX_DATE(String val) { m_PAY_FIX_DATE = val; }
	public void setPAY_FIX_CD(String val) { m_PAY_FIX_CD = val; }
	public void setDEBT_BALANCE_OUT_FLG(String val) { m_DEBT_BALANCE_OUT_FLG = val; }
	public void setDEBT_BALANCE_OUT_DATE(String val) { m_DEBT_BALANCE_OUT_DATE = val; }
	public void setMONTH(String val) { m_MONTH = val; }
	public void setACCT_CD(String val) { m_ACCT_CD = val; }
	public void setSUB_ACCT_CD(String val) { m_SUB_ACCT_CD = val; }
	public void setORG_CD(String val) { m_ORG_CD = val; }
	public void setDATA_TYP(String val) { m_DATA_TYP = val; }
	public void setGL_IF_OUT_FLG(String val) { m_GL_IF_OUT_FLG = val; }
	public void setBALANCE_UPD_FLG(String val) { m_BALANCE_UPD_FLG = val; }
	public void setBALANCE_UPD_DATE(String val) { m_BALANCE_UPD_DATE = val; }
	public void setRECORDING_AMOUNT(String val) { m_RECORDING_AMOUNT = val; }
	public void setDEBT_AMOUNT(String val) { m_DEBT_AMOUNT = val; }
	public void setREBATE_AMOUNT(String val) { m_REBATE_AMOUNT = val; }
	public void setRETURNED_GOODS_AMOUNT(String val) { m_RETURNED_GOODS_AMOUNT = val; }
	public void setRECORDING_AMOUNT_YEN(String val) { m_RECORDING_AMOUNT_YEN = val; }
	public void setDEBT_AMOUNT_YEN(String val) { m_DEBT_AMOUNT_YEN = val; }
	public void setSAVING_AMOUNT_YEN(String val) { m_SAVING_AMOUNT_YEN = val; }
	public void setREBATE_AMOUNT_YEN(String val) { m_REBATE_AMOUNT_YEN = val; }
	public void setRETURNED_GOODS_AMOUNT_YEN(String val) { m_RETURNED_GOODS_AMOUNT_YEN = val; }
	public void setINSPC_ACPT_AMOUNT_YEN(String val) { m_INSPC_ACPT_AMOUNT_YEN = val; }
	public void setEXCH_DIFF_AMOUNT_YEN(String val) { m_EXCH_DIFF_AMOUNT_YEN = val; }
	public void setOPTION_ID(String val) { m_OPTION_ID = val; }
	public void setOWN_CUR_CD(String val) { m_OWN_CUR_CD = val; }
	public void setTHIS_MONTH(String val) { m_THIS_MONTH = val; }
	public void setHOME_DECIMAL_FIG(String val) { m_HOME_DECIMAL_FIG = val; }
	public void setHOME_CUR_CD(String val) { m_HOME_CUR_CD = val; }
	public void setTIME_CTRL(String val) { m_TIME_CTRL = val; }


	public void setList_c_NON_NO_ITEM_FLG(List list) { l_c_NON_NO_ITEM_FLG = list; }
	public void setList_PUCH_ODR_DLV_TIME(List list) { l_PUCH_ODR_DLV_TIME = list; }
	public void setList_PUCH_ODR_START_TIME(List list) { l_PUCH_ODR_START_TIME = list; }
	public void setList_l_STATUS(List list) { l_l_STATUS = list; }
	public void setList_l_ACPT_NO(List list) { l_l_ACPT_NO = list; }
	public void setList_l_ACPT_QTY(List list) { l_l_ACPT_QTY = list; }
	public void setList_l_ACPT_DATE(List list) { l_l_ACPT_DATE = list; }
	public void setList_l_UNIT_COST(List list) { l_l_UNIT_COST = list; }
	public void setList_l_UNIT_COST_TYP(List list) { l_l_UNIT_COST_TYP = list; }
	public void setList_l_PUCH_ODR_AMOUNT(List list) { l_l_PUCH_ODR_AMOUNT = list; }
	public void setList_l_INSPECTED_QTY(List list) { l_l_INSPECTED_QTY = list; }
	public void setList_l_ACCEPTED_QTY(List list) { l_l_ACCEPTED_QTY = list; }
	public void setList_l_INSPEC_DATE(List list) { l_l_INSPEC_DATE = list; }
	public void setList_h_NET_AMOUNT(List list) { l_h_NET_AMOUNT = list; }
	public void setList_h_TAX_AMOUNT_1(List list) { l_h_TAX_AMOUNT_1 = list; }
	public void setList_h_TAX_AMOUNT_2(List list) { l_h_TAX_AMOUNT_2 = list; }
	public void setList_h_TAX_AMOUNT_3(List list) { l_h_TAX_AMOUNT_3 = list; }
	public void setList_h_DECIMAL_FIG(List list) { l_h_DECIMAL_FIG = list; }
	public void setList_h_ROUND_TYP(List list) { l_h_ROUND_TYP = list; }
	public void setList_h_PUCH_ODR_STS_TYP(List list) { l_h_PUCH_ODR_STS_TYP = list; }
	public void setList_h_PUCH_ODR_INST_SLIP_ISS_FLG(List list) { l_h_PUCH_ODR_INST_SLIP_ISS_FLG = list; }
	public void setList_h_ODR_CANCEL_SLIP_ISS_FLG(List list) { l_h_ODR_CANCEL_SLIP_ISS_FLG = list; }
	public void setList_h_INSPC_CMPLT_FLG(List list) { l_h_INSPC_CMPLT_FLG = list; }
	public void setList_h_ACPT_INSPC_TYP(List list) { l_h_ACPT_INSPC_TYP = list; }
	public void setList_h_NET_AMOUNT_LIST(List list) { l_h_NET_AMOUNT_LIST = list; }
	public void setList_h_TAX_AMOUNT_1_LIST(List list) { l_h_TAX_AMOUNT_1_LIST = list; }
	public void setList_h_TAX_AMOUNT_2_LIST(List list) { l_h_TAX_AMOUNT_2_LIST = list; }
	public void setList_h_TAX_AMOUNT_3_LIST(List list) { l_h_TAX_AMOUNT_3_LIST = list; }
	public void setList_h_UPDATE_FLG(List list) { l_h_UPDATE_FLG = list; }
	public void setList_h_MODIFY_COUNT(List list) { l_h_MODIFY_COUNT = list; }
	public void setList_h_MODIFY_COUNT_LIST(List list) { l_h_MODIFY_COUNT_LIST = list; }
	public void setList_h_EXCH_RATE(List list) { l_h_EXCH_RATE = list; }
	public void setList_h_EXCH_RATE_LIST(List list) { l_h_EXCH_RATE_LIST = list; }
	public void setList_h_TAX_CD(List list) { l_h_TAX_CD = list; }
	public void setList_h_PUCH_ODR_CD(List list) { l_h_PUCH_ODR_CD = list; }
	public void setList_NON_NO_ITEM_FLG(List list) { l_NON_NO_ITEM_FLG = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_PUCH_ODR_DLV_DATE(List list) { l_PUCH_ODR_DLV_DATE = list; }
	public void setList_TAX_CD(List list) { l_TAX_CD = list; }
	public void setList_PUCH_ODR_START_DATE(List list) { l_PUCH_ODR_START_DATE = list; }
	public void setList_PUCH_ODR_QTY(List list) { l_PUCH_ODR_QTY = list; }
	public void setList_UNIT_COST_TYP(List list) { l_UNIT_COST_TYP = list; }
	public void setList_UNIT_COST(List list) { l_UNIT_COST = list; }
	public void setList_ACPT_INSPC_TYP(List list) { l_ACPT_INSPC_TYP = list; }
	public void setList_PUCH_ODR_AMOUNT(List list) { l_PUCH_ODR_AMOUNT = list; }
	public void setList_RATE_JUDGE_DATE(List list) { l_RATE_JUDGE_DATE = list; }
	public void setList_NET_AMOUNT(List list) { l_NET_AMOUNT = list; }
	public void setList_TAX_AMOUNT_1(List list) { l_TAX_AMOUNT_1 = list; }
	public void setList_TAX_AMOUNT_2(List list) { l_TAX_AMOUNT_2 = list; }
	public void setList_TAX_AMOUNT_3(List list) { l_TAX_AMOUNT_3 = list; }
	public void setList_PUCH_ODR_STS_TYP(List list) { l_PUCH_ODR_STS_TYP = list; }
	public void setList_PUCH_ODR_INST_SLIP_ISS_FLG(List list) { l_PUCH_ODR_INST_SLIP_ISS_FLG = list; }
	public void setList_ODR_CANCEL_SLIP_ISS_FLG(List list) { l_ODR_CANCEL_SLIP_ISS_FLG = list; }
	public void setList_INSPC_CMPLT_FLG(List list) { l_INSPC_CMPLT_FLG = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_EXCH_RATE(List list) { l_EXCH_RATE = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_VEND_NAME(List list) { l_VEND_NAME = list; }
	public void setList_INSPC_ACPT_APP_TYP(List list) { l_INSPC_ACPT_APP_TYP = list; }
	public void setList_CUR_CD(List list) { l_CUR_CD = list; }
	public void setList_EXCH_TYP(List list) { l_EXCH_TYP = list; }
	public void setList_ROUND_TYP(List list) { l_ROUND_TYP = list; }
	public void setList_CUR_NAME(List list) { l_CUR_NAME = list; }
	public void setList_CUR_UNIT(List list) { l_CUR_UNIT = list; }
	public void setList_DECIMAL_FIG(List list) { l_DECIMAL_FIG = list; }
	public void setList_PUCH_ODR_CD(List list) { l_PUCH_ODR_CD = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_ACPT_NO(List list) { l_ACPT_NO = list; }
	public void setList_ACPT_QTY(List list) { l_ACPT_QTY = list; }
	public void setList_ACPT_DATE(List list) { l_ACPT_DATE = list; }
	public void setList_INSPECTED_QTY(List list) { l_INSPECTED_QTY = list; }
	public void setList_ACCEPTED_QTY(List list) { l_ACCEPTED_QTY = list; }
	public void setList_INSPEC_DATE(List list) { l_INSPEC_DATE = list; }
	public void setList_OLD_TAX_RATE_1(List list) { l_OLD_TAX_RATE_1 = list; }
	public void setList_OLD_TAX_RATE_2(List list) { l_OLD_TAX_RATE_2 = list; }
	public void setList_OLD_TAX_RATE_3(List list) { l_OLD_TAX_RATE_3 = list; }
	public void setList_NEW_TAX_RATE_START_DATE(List list) { l_NEW_TAX_RATE_START_DATE = list; }
	public void setList_NEW_TAX_RATE_1(List list) { l_NEW_TAX_RATE_1 = list; }
	public void setList_NEW_TAX_RATE_2(List list) { l_NEW_TAX_RATE_2 = list; }
	public void setList_NEW_TAX_RATE_3(List list) { l_NEW_TAX_RATE_3 = list; }
	public void setList_TAX_RATE_1(List list) { l_TAX_RATE_1 = list; }
	public void setList_TAX_RATE_2(List list) { l_TAX_RATE_2 = list; }
	public void setList_TAX_RATE_3(List list) { l_TAX_RATE_3 = list; }
	public void setList_AMOUNT_INCLUDE_TAX(List list) { l_AMOUNT_INCLUDE_TAX = list; }
	public void setList_HOME_CUR_AMOUNT(List list) { l_HOME_CUR_AMOUNT = list; }
	public void setList_TAX_ROUND_TYP(List list) { l_TAX_ROUND_TYP = list; }
	public void setList_INSPC_ACPT_NO(List list) { l_INSPC_ACPT_NO = list; }
	public void setList_INSPC_ACPT_GNR_TYP(List list) { l_INSPC_ACPT_GNR_TYP = list; }
	public void setList_CRCT_NO(List list) { l_CRCT_NO = list; }
	public void setList_CRCT_TYP(List list) { l_CRCT_TYP = list; }
	public void setList_SLIP_TYP(List list) { l_SLIP_TYP = list; }
	public void setList_WORK_IN_PROC_CD(List list) { l_WORK_IN_PROC_CD = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_PROCESSING_COST(List list) { l_PROCESSING_COST = list; }
	public void setList_MATERIAL_COST(List list) { l_MATERIAL_COST = list; }
	public void setList_OTHER_OVERHEADS(List list) { l_OTHER_OVERHEADS = list; }
	public void setList_INSPC_ACPT_QTY(List list) { l_INSPC_ACPT_QTY = list; }
	public void setList_INSPC_ACPT_AMOUNT(List list) { l_INSPC_ACPT_AMOUNT = list; }
	public void setList_SAVING_AMOUNT(List list) { l_SAVING_AMOUNT = list; }
	public void setList_INSPC_ACPT_DATE(List list) { l_INSPC_ACPT_DATE = list; }
	public void setList_PRODUCT_TYP(List list) { l_PRODUCT_TYP = list; }
	public void setList_DLV_CD(List list) { l_DLV_CD = list; }
	public void setList_DISC_AMOUNT(List list) { l_DISC_AMOUNT = list; }
	public void setList_GNR_ORG_CD(List list) { l_GNR_ORG_CD = list; }
	public void setList_SBCNT_PUCH_TYP(List list) { l_SBCNT_PUCH_TYP = list; }
	public void setList_JOB_ODR_DETAIL_NO(List list) { l_JOB_ODR_DETAIL_NO = list; }
	public void setList_CLASIFICATION_CD(List list) { l_CLASIFICATION_CD = list; }
	public void setList_INV_CTRL_FLG(List list) { l_INV_CTRL_FLG = list; }
	public void setList_PUCH_RTN_FLG(List list) { l_PUCH_RTN_FLG = list; }
	public void setList_APPR_FLG(List list) { l_APPR_FLG = list; }
	public void setList_APPR_ID(List list) { l_APPR_ID = list; }
	public void setList_APPR_DATE(List list) { l_APPR_DATE = list; }
	public void setList_RESERVE_CAUSE(List list) { l_RESERVE_CAUSE = list; }
	public void setList_SLIP_CTRL_GRP(List list) { l_SLIP_CTRL_GRP = list; }
	public void setList_SLIP_DATE(List list) { l_SLIP_DATE = list; }
	public void setList_SLIP_CD(List list) { l_SLIP_CD = list; }
	public void setList_SEQ_NO(List list) { l_SEQ_NO = list; }
	public void setList_NET_AMOUNT_YEN(List list) { l_NET_AMOUNT_YEN = list; }
	public void setList_AMOUNT(List list) { l_AMOUNT = list; }
	public void setList_TAX_TYP(List list) { l_TAX_TYP = list; }
	public void setList_TAX_AMOUNT(List list) { l_TAX_AMOUNT = list; }
	public void setList_GROSS_AMOUNT(List list) { l_GROSS_AMOUNT = list; }
	public void setList_TAX_AMOUNT_YEN(List list) { l_TAX_AMOUNT_YEN = list; }
	public void setList_GROSS_AMOUNT_YEN(List list) { l_GROSS_AMOUNT_YEN = list; }
	public void setList_SUM_TAX_AMOUNT(List list) { l_SUM_TAX_AMOUNT = list; }
	public void setList_SUM_GROSS_AMOUNT(List list) { l_SUM_GROSS_AMOUNT = list; }
	public void setList_SUM_NET_AMOUNT(List list) { l_SUM_NET_AMOUNT = list; }
	public void setList_TAX_TOTAL(List list) { l_TAX_TOTAL = list; }
	public void setList_GROSS_TOTAL(List list) { l_GROSS_TOTAL = list; }
	public void setList_NET_TOTAL(List list) { l_NET_TOTAL = list; }
	public void setList_LINE_NO(List list) { l_LINE_NO = list; }
	public void setList_LINE_TYP(List list) { l_LINE_TYP = list; }
	public void setList_TAX_AMOUNT_CTRL_FLG(List list) { l_TAX_AMOUNT_CTRL_FLG = list; }
	public void setList_UNIT_COST_YEN(List list) { l_UNIT_COST_YEN = list; }
	public void setList_PROCESSING_COST_YEN(List list) { l_PROCESSING_COST_YEN = list; }
	public void setList_MATERIAL_COST_YEN(List list) { l_MATERIAL_COST_YEN = list; }
	public void setList_OTHER_OVERHEADS_YEN(List list) { l_OTHER_OVERHEADS_YEN = list; }
	public void setList_DR_ACCT_CD(List list) { l_DR_ACCT_CD = list; }
	public void setList_DR_SUB_ACCT_CD(List list) { l_DR_SUB_ACCT_CD = list; }
	public void setList_DR_ORG_CD(List list) { l_DR_ORG_CD = list; }
	public void setList_CR_ACCT_CD(List list) { l_CR_ACCT_CD = list; }
	public void setList_CR_SUB_ACCT_CD(List list) { l_CR_SUB_ACCT_CD = list; }
	public void setList_CR_ORG_CD(List list) { l_CR_ORG_CD = list; }
	public void setList_FIXED_ASSETS_CD(List list) { l_FIXED_ASSETS_CD = list; }
	public void setList_SUB_FIXED_ASSETS_CD(List list) { l_SUB_FIXED_ASSETS_CD = list; }
	public void setList_DETAIL_NO(List list) { l_DETAIL_NO = list; }
	public void setList_COMM_PUCH_ODR_LINE_NO(List list) { l_COMM_PUCH_ODR_LINE_NO = list; }
	public void setList_ARV_RSLT_LINE_NO(List list) { l_ARV_RSLT_LINE_NO = list; }
	public void setList_STOCK_CTRL_FLG(List list) { l_STOCK_CTRL_FLG = list; }
	public void setList_REMARKS(List list) { l_REMARKS = list; }
	public void setList_INSPC_ACPT_CRCT_TYP(List list) { l_INSPC_ACPT_CRCT_TYP = list; }
	public void setList_ORGN_SLIP_CTRL_GRP(List list) { l_ORGN_SLIP_CTRL_GRP = list; }
	public void setList_ORGN_SLIP_CD(List list) { l_ORGN_SLIP_CD = list; }
	public void setList_ORGN_SLIP_DATE(List list) { l_ORGN_SLIP_DATE = list; }
	public void setList_SLIP_TRN_CD(List list) { l_SLIP_TRN_CD = list; }
	public void setList_STOCK_CLASS_CD(List list) { l_STOCK_CLASS_CD = list; }
	public void setList_BALANCE_CLASS_CD(List list) { l_BALANCE_CLASS_CD = list; }
	public void setList_PUCH_ODR_ORG_CD(List list) { l_PUCH_ODR_ORG_CD = list; }
	public void setList_PUCH_ODR_PERSON_CD(List list) { l_PUCH_ODR_PERSON_CD = list; }
	public void setList_WH_CD(List list) { l_WH_CD = list; }
	public void setList_SHIP_WH_CD(List list) { l_SHIP_WH_CD = list; }
	public void setList_PAYEE_CD(List list) { l_PAYEE_CD = list; }
	public void setList_SLIP_CTRL_ORG_CD(List list) { l_SLIP_CTRL_ORG_CD = list; }
	public void setList_CLOSING_CTRL_ORG_CD(List list) { l_CLOSING_CTRL_ORG_CD = list; }
	public void setList_PAY_CALC_CTRL_ORG_CD(List list) { l_PAY_CALC_CTRL_ORG_CD = list; }
	public void setList_PAY_FIX_CTRL_ORG_CD(List list) { l_PAY_FIX_CTRL_ORG_CD = list; }
	public void setList_EXPL_TYP(List list) { l_EXPL_TYP = list; }
	public void setList_EXPL_CD(List list) { l_EXPL_CD = list; }
	public void setList_EXPL_NAME(List list) { l_EXPL_NAME = list; }
	public void setList_ODR_CD(List list) { l_ODR_CD = list; }
	public void setList_COMM_PUCH_ODR_SLIP_TYP(List list) { l_COMM_PUCH_ODR_SLIP_TYP = list; }
	public void setList_COMM_PUCH_ODR_SLIP_CTRL_GRP(List list) { l_COMM_PUCH_ODR_SLIP_CTRL_GRP = list; }
	public void setList_COMM_PUCH_ODR_SLIP_CD(List list) { l_COMM_PUCH_ODR_SLIP_CD = list; }
	public void setList_COMM_PUCH_ODR_SLIP_DATE(List list) { l_COMM_PUCH_ODR_SLIP_DATE = list; }
	public void setList_ARV_RSLT_SLIP_TYP(List list) { l_ARV_RSLT_SLIP_TYP = list; }
	public void setList_ARV_RSLT_SLIP_CTRL_GRP(List list) { l_ARV_RSLT_SLIP_CTRL_GRP = list; }
	public void setList_ARV_RSLT_SLIP_CD(List list) { l_ARV_RSLT_SLIP_CD = list; }
	public void setList_ARV_RSLT_SLIP_DATE(List list) { l_ARV_RSLT_SLIP_DATE = list; }
	public void setList_PUCH_RSLT_SLIP_ID(List list) { l_PUCH_RSLT_SLIP_ID = list; }
	public void setList_TAX_CALC_TYP(List list) { l_TAX_CALC_TYP = list; }
	public void setList_TAX_APPLY_TYP(List list) { l_TAX_APPLY_TYP = list; }
	public void setList_TEMP_UNIT_COST_PUCH_RSLT_FLG(List list) { l_TEMP_UNIT_COST_PUCH_RSLT_FLG = list; }
	public void setList_UNIT_COST_ZERO_INSPC_ACPT_FLG(List list) { l_UNIT_COST_ZERO_INSPC_ACPT_FLG = list; }
	public void setList_IMPORT_TRN_TYP(List list) { l_IMPORT_TRN_TYP = list; }
	public void setList_PAY_CYCLE_TYP(List list) { l_PAY_CYCLE_TYP = list; }
	public void setList_DEADLINE_DATE(List list) { l_DEADLINE_DATE = list; }
	public void setList_PAY_SCH_DATE(List list) { l_PAY_SCH_DATE = list; }
	public void setList_PAY_PATTERN_CD(List list) { l_PAY_PATTERN_CD = list; }
	public void setList_EXCH_RSRV_CD(List list) { l_EXCH_RSRV_CD = list; }
	public void setList_EXCH_DATE(List list) { l_EXCH_DATE = list; }
	public void setList_PUR_RSLT_SLIP_ISSUE_FLG(List list) { l_PUR_RSLT_SLIP_ISSUE_FLG = list; }
	public void setList_PUR_RSLT_REP_ISSUE_FLG(List list) { l_PUR_RSLT_REP_ISSUE_FLG = list; }
	public void setList_ACPT_ARV_MODIFICATION_FLG(List list) { l_ACPT_ARV_MODIFICATION_FLG = list; }
	public void setList_INSPC_ACPT_MODIFICATION_FLG(List list) { l_INSPC_ACPT_MODIFICATION_FLG = list; }
	public void setList_STATUS(List list) { l_STATUS = list; }
	public void setList_CRCT_FLG(List list) { l_CRCT_FLG = list; }
	public void setList_APPROVAL_DATE(List list) { l_APPROVAL_DATE = list; }
	public void setList_APPROVAL_CD(List list) { l_APPROVAL_CD = list; }
	public void setList_APPROVAL_RSRV_DATE(List list) { l_APPROVAL_RSRV_DATE = list; }
	public void setList_APPROVAL_RSRV_CD(List list) { l_APPROVAL_RSRV_CD = list; }
	public void setList_RSN_CD(List list) { l_RSN_CD = list; }
	public void setList_RECORDING_DATE(List list) { l_RECORDING_DATE = list; }
	public void setList_RECORDING_MONTH(List list) { l_RECORDING_MONTH = list; }
	public void setList_ORGN_RECORDING_DATE(List list) { l_ORGN_RECORDING_DATE = list; }
	public void setList_ORGN_RECORDING_MONTH(List list) { l_ORGN_RECORDING_MONTH = list; }
	public void setList_RECORDING_PROC_DATE(List list) { l_RECORDING_PROC_DATE = list; }
	public void setList_RECORDING_PROC_CD(List list) { l_RECORDING_PROC_CD = list; }
	public void setList_CLOSING_RSRV_DATE(List list) { l_CLOSING_RSRV_DATE = list; }
	public void setList_CLOSING_RSRV_CD(List list) { l_CLOSING_RSRV_CD = list; }
	public void setList_CLOSING_DATE(List list) { l_CLOSING_DATE = list; }
	public void setList_CLOSING_CD(List list) { l_CLOSING_CD = list; }
	public void setList_PAY_FIX_DATE(List list) { l_PAY_FIX_DATE = list; }
	public void setList_PAY_FIX_CD(List list) { l_PAY_FIX_CD = list; }
	public void setList_DEBT_BALANCE_OUT_FLG(List list) { l_DEBT_BALANCE_OUT_FLG = list; }
	public void setList_DEBT_BALANCE_OUT_DATE(List list) { l_DEBT_BALANCE_OUT_DATE = list; }
	public void setList_MONTH(List list) { l_MONTH = list; }
	public void setList_ACCT_CD(List list) { l_ACCT_CD = list; }
	public void setList_SUB_ACCT_CD(List list) { l_SUB_ACCT_CD = list; }
	public void setList_ORG_CD(List list) { l_ORG_CD = list; }
	public void setList_DATA_TYP(List list) { l_DATA_TYP = list; }
	public void setList_GL_IF_OUT_FLG(List list) { l_GL_IF_OUT_FLG = list; }
	public void setList_BALANCE_UPD_FLG(List list) { l_BALANCE_UPD_FLG = list; }
	public void setList_BALANCE_UPD_DATE(List list) { l_BALANCE_UPD_DATE = list; }
	public void setList_RECORDING_AMOUNT(List list) { l_RECORDING_AMOUNT = list; }
	public void setList_DEBT_AMOUNT(List list) { l_DEBT_AMOUNT = list; }
	public void setList_REBATE_AMOUNT(List list) { l_REBATE_AMOUNT = list; }
	public void setList_RETURNED_GOODS_AMOUNT(List list) { l_RETURNED_GOODS_AMOUNT = list; }
	public void setList_RECORDING_AMOUNT_YEN(List list) { l_RECORDING_AMOUNT_YEN = list; }
	public void setList_DEBT_AMOUNT_YEN(List list) { l_DEBT_AMOUNT_YEN = list; }
	public void setList_SAVING_AMOUNT_YEN(List list) { l_SAVING_AMOUNT_YEN = list; }
	public void setList_REBATE_AMOUNT_YEN(List list) { l_REBATE_AMOUNT_YEN = list; }
	public void setList_RETURNED_GOODS_AMOUNT_YEN(List list) { l_RETURNED_GOODS_AMOUNT_YEN = list; }
	public void setList_INSPC_ACPT_AMOUNT_YEN(List list) { l_INSPC_ACPT_AMOUNT_YEN = list; }
	public void setList_EXCH_DIFF_AMOUNT_YEN(List list) { l_EXCH_DIFF_AMOUNT_YEN = list; }
	public void setList_OPTION_ID(List list) { l_OPTION_ID = list; }
	public void setList_OWN_CUR_CD(List list) { l_OWN_CUR_CD = list; }
	public void setList_THIS_MONTH(List list) { l_THIS_MONTH = list; }
	public void setList_HOME_DECIMAL_FIG(List list) { l_HOME_DECIMAL_FIG = list; }
	public void setList_HOME_CUR_CD(List list) { l_HOME_CUR_CD = list; }
	public void setList_TIME_CTRL(List list) { l_TIME_CTRL = list; }

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
			l_c_NON_NO_ITEM_FLG.add(((AE0170010Struct) list.get(i)).getc_NON_NO_ITEM_FLG());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_DLV_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_DLV_TIME == null) {
			l_PUCH_ODR_DLV_TIME = new ArrayList();
		} else {
			l_PUCH_ODR_DLV_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_DLV_TIME.add(((AE0170010Struct) list.get(i)).getPUCH_ODR_DLV_TIME());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_START_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_START_TIME == null) {
			l_PUCH_ODR_START_TIME = new ArrayList();
		} else {
			l_PUCH_ODR_START_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_START_TIME.add(((AE0170010Struct) list.get(i)).getPUCH_ODR_START_TIME());
		}
		return size;
	}
	public int setL2L_l_STATUS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_STATUS == null) {
			l_l_STATUS = new ArrayList();
		} else {
			l_l_STATUS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_STATUS.add(((AE0170010Struct) list.get(i)).getl_STATUS());
		}
		return size;
	}
	public int setL2L_l_ACPT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ACPT_NO == null) {
			l_l_ACPT_NO = new ArrayList();
		} else {
			l_l_ACPT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ACPT_NO.add(((AE0170010Struct) list.get(i)).getl_ACPT_NO());
		}
		return size;
	}
	public int setL2L_l_ACPT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ACPT_QTY == null) {
			l_l_ACPT_QTY = new ArrayList();
		} else {
			l_l_ACPT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ACPT_QTY.add(((AE0170010Struct) list.get(i)).getl_ACPT_QTY());
		}
		return size;
	}
	public int setL2L_l_ACPT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ACPT_DATE == null) {
			l_l_ACPT_DATE = new ArrayList();
		} else {
			l_l_ACPT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ACPT_DATE.add(((AE0170010Struct) list.get(i)).getl_ACPT_DATE());
		}
		return size;
	}
	public int setL2L_l_UNIT_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_UNIT_COST == null) {
			l_l_UNIT_COST = new ArrayList();
		} else {
			l_l_UNIT_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_UNIT_COST.add(((AE0170010Struct) list.get(i)).getl_UNIT_COST());
		}
		return size;
	}
	public int setL2L_l_UNIT_COST_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_UNIT_COST_TYP == null) {
			l_l_UNIT_COST_TYP = new ArrayList();
		} else {
			l_l_UNIT_COST_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_UNIT_COST_TYP.add(((AE0170010Struct) list.get(i)).getl_UNIT_COST_TYP());
		}
		return size;
	}
	public int setL2L_l_PUCH_ODR_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PUCH_ODR_AMOUNT == null) {
			l_l_PUCH_ODR_AMOUNT = new ArrayList();
		} else {
			l_l_PUCH_ODR_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PUCH_ODR_AMOUNT.add(((AE0170010Struct) list.get(i)).getl_PUCH_ODR_AMOUNT());
		}
		return size;
	}
	public int setL2L_l_INSPECTED_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_INSPECTED_QTY == null) {
			l_l_INSPECTED_QTY = new ArrayList();
		} else {
			l_l_INSPECTED_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_INSPECTED_QTY.add(((AE0170010Struct) list.get(i)).getl_INSPECTED_QTY());
		}
		return size;
	}
	public int setL2L_l_ACCEPTED_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ACCEPTED_QTY == null) {
			l_l_ACCEPTED_QTY = new ArrayList();
		} else {
			l_l_ACCEPTED_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ACCEPTED_QTY.add(((AE0170010Struct) list.get(i)).getl_ACCEPTED_QTY());
		}
		return size;
	}
	public int setL2L_l_INSPEC_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_INSPEC_DATE == null) {
			l_l_INSPEC_DATE = new ArrayList();
		} else {
			l_l_INSPEC_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_INSPEC_DATE.add(((AE0170010Struct) list.get(i)).getl_INSPEC_DATE());
		}
		return size;
	}
	public int setL2L_h_NET_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_NET_AMOUNT == null) {
			l_h_NET_AMOUNT = new ArrayList();
		} else {
			l_h_NET_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_NET_AMOUNT.add(((AE0170010Struct) list.get(i)).geth_NET_AMOUNT());
		}
		return size;
	}
	public int setL2L_h_TAX_AMOUNT_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_TAX_AMOUNT_1 == null) {
			l_h_TAX_AMOUNT_1 = new ArrayList();
		} else {
			l_h_TAX_AMOUNT_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_TAX_AMOUNT_1.add(((AE0170010Struct) list.get(i)).geth_TAX_AMOUNT_1());
		}
		return size;
	}
	public int setL2L_h_TAX_AMOUNT_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_TAX_AMOUNT_2 == null) {
			l_h_TAX_AMOUNT_2 = new ArrayList();
		} else {
			l_h_TAX_AMOUNT_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_TAX_AMOUNT_2.add(((AE0170010Struct) list.get(i)).geth_TAX_AMOUNT_2());
		}
		return size;
	}
	public int setL2L_h_TAX_AMOUNT_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_TAX_AMOUNT_3 == null) {
			l_h_TAX_AMOUNT_3 = new ArrayList();
		} else {
			l_h_TAX_AMOUNT_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_TAX_AMOUNT_3.add(((AE0170010Struct) list.get(i)).geth_TAX_AMOUNT_3());
		}
		return size;
	}
	public int setL2L_h_DECIMAL_FIG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_DECIMAL_FIG == null) {
			l_h_DECIMAL_FIG = new ArrayList();
		} else {
			l_h_DECIMAL_FIG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_DECIMAL_FIG.add(((AE0170010Struct) list.get(i)).geth_DECIMAL_FIG());
		}
		return size;
	}
	public int setL2L_h_ROUND_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ROUND_TYP == null) {
			l_h_ROUND_TYP = new ArrayList();
		} else {
			l_h_ROUND_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ROUND_TYP.add(((AE0170010Struct) list.get(i)).geth_ROUND_TYP());
		}
		return size;
	}
	public int setL2L_h_PUCH_ODR_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PUCH_ODR_STS_TYP == null) {
			l_h_PUCH_ODR_STS_TYP = new ArrayList();
		} else {
			l_h_PUCH_ODR_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PUCH_ODR_STS_TYP.add(((AE0170010Struct) list.get(i)).geth_PUCH_ODR_STS_TYP());
		}
		return size;
	}
	public int setL2L_h_PUCH_ODR_INST_SLIP_ISS_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PUCH_ODR_INST_SLIP_ISS_FLG == null) {
			l_h_PUCH_ODR_INST_SLIP_ISS_FLG = new ArrayList();
		} else {
			l_h_PUCH_ODR_INST_SLIP_ISS_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PUCH_ODR_INST_SLIP_ISS_FLG.add(((AE0170010Struct) list.get(i)).geth_PUCH_ODR_INST_SLIP_ISS_FLG());
		}
		return size;
	}
	public int setL2L_h_ODR_CANCEL_SLIP_ISS_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ODR_CANCEL_SLIP_ISS_FLG == null) {
			l_h_ODR_CANCEL_SLIP_ISS_FLG = new ArrayList();
		} else {
			l_h_ODR_CANCEL_SLIP_ISS_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ODR_CANCEL_SLIP_ISS_FLG.add(((AE0170010Struct) list.get(i)).geth_ODR_CANCEL_SLIP_ISS_FLG());
		}
		return size;
	}
	public int setL2L_h_INSPC_CMPLT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_INSPC_CMPLT_FLG == null) {
			l_h_INSPC_CMPLT_FLG = new ArrayList();
		} else {
			l_h_INSPC_CMPLT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_INSPC_CMPLT_FLG.add(((AE0170010Struct) list.get(i)).geth_INSPC_CMPLT_FLG());
		}
		return size;
	}
	public int setL2L_h_ACPT_INSPC_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ACPT_INSPC_TYP == null) {
			l_h_ACPT_INSPC_TYP = new ArrayList();
		} else {
			l_h_ACPT_INSPC_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ACPT_INSPC_TYP.add(((AE0170010Struct) list.get(i)).geth_ACPT_INSPC_TYP());
		}
		return size;
	}
	public int setL2L_h_NET_AMOUNT_LIST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_NET_AMOUNT_LIST == null) {
			l_h_NET_AMOUNT_LIST = new ArrayList();
		} else {
			l_h_NET_AMOUNT_LIST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_NET_AMOUNT_LIST.add(((AE0170010Struct) list.get(i)).geth_NET_AMOUNT_LIST());
		}
		return size;
	}
	public int setL2L_h_TAX_AMOUNT_1_LIST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_TAX_AMOUNT_1_LIST == null) {
			l_h_TAX_AMOUNT_1_LIST = new ArrayList();
		} else {
			l_h_TAX_AMOUNT_1_LIST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_TAX_AMOUNT_1_LIST.add(((AE0170010Struct) list.get(i)).geth_TAX_AMOUNT_1_LIST());
		}
		return size;
	}
	public int setL2L_h_TAX_AMOUNT_2_LIST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_TAX_AMOUNT_2_LIST == null) {
			l_h_TAX_AMOUNT_2_LIST = new ArrayList();
		} else {
			l_h_TAX_AMOUNT_2_LIST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_TAX_AMOUNT_2_LIST.add(((AE0170010Struct) list.get(i)).geth_TAX_AMOUNT_2_LIST());
		}
		return size;
	}
	public int setL2L_h_TAX_AMOUNT_3_LIST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_TAX_AMOUNT_3_LIST == null) {
			l_h_TAX_AMOUNT_3_LIST = new ArrayList();
		} else {
			l_h_TAX_AMOUNT_3_LIST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_TAX_AMOUNT_3_LIST.add(((AE0170010Struct) list.get(i)).geth_TAX_AMOUNT_3_LIST());
		}
		return size;
	}
	public int setL2L_h_UPDATE_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_UPDATE_FLG == null) {
			l_h_UPDATE_FLG = new ArrayList();
		} else {
			l_h_UPDATE_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_UPDATE_FLG.add(((AE0170010Struct) list.get(i)).geth_UPDATE_FLG());
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
			l_h_MODIFY_COUNT.add(((AE0170010Struct) list.get(i)).geth_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_h_MODIFY_COUNT_LIST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_MODIFY_COUNT_LIST == null) {
			l_h_MODIFY_COUNT_LIST = new ArrayList();
		} else {
			l_h_MODIFY_COUNT_LIST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_MODIFY_COUNT_LIST.add(((AE0170010Struct) list.get(i)).geth_MODIFY_COUNT_LIST());
		}
		return size;
	}
	public int setL2L_h_EXCH_RATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_EXCH_RATE == null) {
			l_h_EXCH_RATE = new ArrayList();
		} else {
			l_h_EXCH_RATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_EXCH_RATE.add(((AE0170010Struct) list.get(i)).geth_EXCH_RATE());
		}
		return size;
	}
	public int setL2L_h_EXCH_RATE_LIST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_EXCH_RATE_LIST == null) {
			l_h_EXCH_RATE_LIST = new ArrayList();
		} else {
			l_h_EXCH_RATE_LIST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_EXCH_RATE_LIST.add(((AE0170010Struct) list.get(i)).geth_EXCH_RATE_LIST());
		}
		return size;
	}
	public int setL2L_h_TAX_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_TAX_CD == null) {
			l_h_TAX_CD = new ArrayList();
		} else {
			l_h_TAX_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_TAX_CD.add(((AE0170010Struct) list.get(i)).geth_TAX_CD());
		}
		return size;
	}
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
			l_h_PUCH_ODR_CD.add(((AE0170010Struct) list.get(i)).geth_PUCH_ODR_CD());
		}
		return size;
	}
	public int setL2L_NON_NO_ITEM_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NON_NO_ITEM_FLG == null) {
			l_NON_NO_ITEM_FLG = new ArrayList();
		} else {
			l_NON_NO_ITEM_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NON_NO_ITEM_FLG.add(((AE0170010Struct) list.get(i)).getNON_NO_ITEM_FLG());
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
			l_ITEM_CD.add(((AE0170010Struct) list.get(i)).getITEM_CD());
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
			l_VEND_CD.add(((AE0170010Struct) list.get(i)).getVEND_CD());
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
			l_PUCH_ODR_DLV_DATE.add(((AE0170010Struct) list.get(i)).getPUCH_ODR_DLV_DATE());
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
			l_TAX_CD.add(((AE0170010Struct) list.get(i)).getTAX_CD());
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
			l_PUCH_ODR_START_DATE.add(((AE0170010Struct) list.get(i)).getPUCH_ODR_START_DATE());
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
			l_PUCH_ODR_QTY.add(((AE0170010Struct) list.get(i)).getPUCH_ODR_QTY());
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
			l_UNIT_COST_TYP.add(((AE0170010Struct) list.get(i)).getUNIT_COST_TYP());
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
			l_UNIT_COST.add(((AE0170010Struct) list.get(i)).getUNIT_COST());
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
			l_ACPT_INSPC_TYP.add(((AE0170010Struct) list.get(i)).getACPT_INSPC_TYP());
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
			l_PUCH_ODR_AMOUNT.add(((AE0170010Struct) list.get(i)).getPUCH_ODR_AMOUNT());
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
			l_RATE_JUDGE_DATE.add(((AE0170010Struct) list.get(i)).getRATE_JUDGE_DATE());
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
			l_NET_AMOUNT.add(((AE0170010Struct) list.get(i)).getNET_AMOUNT());
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
			l_TAX_AMOUNT_1.add(((AE0170010Struct) list.get(i)).getTAX_AMOUNT_1());
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
			l_TAX_AMOUNT_2.add(((AE0170010Struct) list.get(i)).getTAX_AMOUNT_2());
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
			l_TAX_AMOUNT_3.add(((AE0170010Struct) list.get(i)).getTAX_AMOUNT_3());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_STS_TYP == null) {
			l_PUCH_ODR_STS_TYP = new ArrayList();
		} else {
			l_PUCH_ODR_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_STS_TYP.add(((AE0170010Struct) list.get(i)).getPUCH_ODR_STS_TYP());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_INST_SLIP_ISS_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_INST_SLIP_ISS_FLG == null) {
			l_PUCH_ODR_INST_SLIP_ISS_FLG = new ArrayList();
		} else {
			l_PUCH_ODR_INST_SLIP_ISS_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_INST_SLIP_ISS_FLG.add(((AE0170010Struct) list.get(i)).getPUCH_ODR_INST_SLIP_ISS_FLG());
		}
		return size;
	}
	public int setL2L_ODR_CANCEL_SLIP_ISS_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_CANCEL_SLIP_ISS_FLG == null) {
			l_ODR_CANCEL_SLIP_ISS_FLG = new ArrayList();
		} else {
			l_ODR_CANCEL_SLIP_ISS_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_CANCEL_SLIP_ISS_FLG.add(((AE0170010Struct) list.get(i)).getODR_CANCEL_SLIP_ISS_FLG());
		}
		return size;
	}
	public int setL2L_INSPC_CMPLT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INSPC_CMPLT_FLG == null) {
			l_INSPC_CMPLT_FLG = new ArrayList();
		} else {
			l_INSPC_CMPLT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INSPC_CMPLT_FLG.add(((AE0170010Struct) list.get(i)).getINSPC_CMPLT_FLG());
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
			l_MODIFY_COUNT.add(((AE0170010Struct) list.get(i)).getMODIFY_COUNT());
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
			l_EXCH_RATE.add(((AE0170010Struct) list.get(i)).getEXCH_RATE());
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
			l_ITEM_NAME.add(((AE0170010Struct) list.get(i)).getITEM_NAME());
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
			l_STOCK_UNIT.add(((AE0170010Struct) list.get(i)).getSTOCK_UNIT());
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
			l_JOB_ODR_CD.add(((AE0170010Struct) list.get(i)).getJOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_VEND_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_NAME == null) {
			l_VEND_NAME = new ArrayList();
		} else {
			l_VEND_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_NAME.add(((AE0170010Struct) list.get(i)).getVEND_NAME());
		}
		return size;
	}
	public int setL2L_INSPC_ACPT_APP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INSPC_ACPT_APP_TYP == null) {
			l_INSPC_ACPT_APP_TYP = new ArrayList();
		} else {
			l_INSPC_ACPT_APP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INSPC_ACPT_APP_TYP.add(((AE0170010Struct) list.get(i)).getINSPC_ACPT_APP_TYP());
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
			l_CUR_CD.add(((AE0170010Struct) list.get(i)).getCUR_CD());
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
			l_EXCH_TYP.add(((AE0170010Struct) list.get(i)).getEXCH_TYP());
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
			l_ROUND_TYP.add(((AE0170010Struct) list.get(i)).getROUND_TYP());
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
			l_CUR_NAME.add(((AE0170010Struct) list.get(i)).getCUR_NAME());
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
			l_CUR_UNIT.add(((AE0170010Struct) list.get(i)).getCUR_UNIT());
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
			l_DECIMAL_FIG.add(((AE0170010Struct) list.get(i)).getDECIMAL_FIG());
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
			l_PUCH_ODR_CD.add(((AE0170010Struct) list.get(i)).getPUCH_ODR_CD());
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
			l_COMPANY_CD.add(((AE0170010Struct) list.get(i)).getCOMPANY_CD());
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
			l_ACPT_NO.add(((AE0170010Struct) list.get(i)).getACPT_NO());
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
			l_ACPT_QTY.add(((AE0170010Struct) list.get(i)).getACPT_QTY());
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
			l_ACPT_DATE.add(((AE0170010Struct) list.get(i)).getACPT_DATE());
		}
		return size;
	}
	public int setL2L_INSPECTED_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INSPECTED_QTY == null) {
			l_INSPECTED_QTY = new ArrayList();
		} else {
			l_INSPECTED_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INSPECTED_QTY.add(((AE0170010Struct) list.get(i)).getINSPECTED_QTY());
		}
		return size;
	}
	public int setL2L_ACCEPTED_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACCEPTED_QTY == null) {
			l_ACCEPTED_QTY = new ArrayList();
		} else {
			l_ACCEPTED_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACCEPTED_QTY.add(((AE0170010Struct) list.get(i)).getACCEPTED_QTY());
		}
		return size;
	}
	public int setL2L_INSPEC_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INSPEC_DATE == null) {
			l_INSPEC_DATE = new ArrayList();
		} else {
			l_INSPEC_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INSPEC_DATE.add(((AE0170010Struct) list.get(i)).getINSPEC_DATE());
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
			l_OLD_TAX_RATE_1.add(((AE0170010Struct) list.get(i)).getOLD_TAX_RATE_1());
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
			l_OLD_TAX_RATE_2.add(((AE0170010Struct) list.get(i)).getOLD_TAX_RATE_2());
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
			l_OLD_TAX_RATE_3.add(((AE0170010Struct) list.get(i)).getOLD_TAX_RATE_3());
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
			l_NEW_TAX_RATE_START_DATE.add(((AE0170010Struct) list.get(i)).getNEW_TAX_RATE_START_DATE());
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
			l_NEW_TAX_RATE_1.add(((AE0170010Struct) list.get(i)).getNEW_TAX_RATE_1());
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
			l_NEW_TAX_RATE_2.add(((AE0170010Struct) list.get(i)).getNEW_TAX_RATE_2());
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
			l_NEW_TAX_RATE_3.add(((AE0170010Struct) list.get(i)).getNEW_TAX_RATE_3());
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
			l_TAX_RATE_1.add(((AE0170010Struct) list.get(i)).getTAX_RATE_1());
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
			l_TAX_RATE_2.add(((AE0170010Struct) list.get(i)).getTAX_RATE_2());
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
			l_TAX_RATE_3.add(((AE0170010Struct) list.get(i)).getTAX_RATE_3());
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
			l_AMOUNT_INCLUDE_TAX.add(((AE0170010Struct) list.get(i)).getAMOUNT_INCLUDE_TAX());
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
			l_HOME_CUR_AMOUNT.add(((AE0170010Struct) list.get(i)).getHOME_CUR_AMOUNT());
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
			l_TAX_ROUND_TYP.add(((AE0170010Struct) list.get(i)).getTAX_ROUND_TYP());
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
			l_INSPC_ACPT_NO.add(((AE0170010Struct) list.get(i)).getINSPC_ACPT_NO());
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
			l_INSPC_ACPT_GNR_TYP.add(((AE0170010Struct) list.get(i)).getINSPC_ACPT_GNR_TYP());
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
			l_CRCT_NO.add(((AE0170010Struct) list.get(i)).getCRCT_NO());
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
			l_CRCT_TYP.add(((AE0170010Struct) list.get(i)).getCRCT_TYP());
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
			l_SLIP_TYP.add(((AE0170010Struct) list.get(i)).getSLIP_TYP());
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
			l_WORK_IN_PROC_CD.add(((AE0170010Struct) list.get(i)).getWORK_IN_PROC_CD());
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
			l_PLANT_CD.add(((AE0170010Struct) list.get(i)).getPLANT_CD());
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
			l_PROCESSING_COST.add(((AE0170010Struct) list.get(i)).getPROCESSING_COST());
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
			l_MATERIAL_COST.add(((AE0170010Struct) list.get(i)).getMATERIAL_COST());
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
			l_OTHER_OVERHEADS.add(((AE0170010Struct) list.get(i)).getOTHER_OVERHEADS());
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
			l_INSPC_ACPT_QTY.add(((AE0170010Struct) list.get(i)).getINSPC_ACPT_QTY());
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
			l_INSPC_ACPT_AMOUNT.add(((AE0170010Struct) list.get(i)).getINSPC_ACPT_AMOUNT());
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
			l_SAVING_AMOUNT.add(((AE0170010Struct) list.get(i)).getSAVING_AMOUNT());
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
			l_INSPC_ACPT_DATE.add(((AE0170010Struct) list.get(i)).getINSPC_ACPT_DATE());
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
			l_PRODUCT_TYP.add(((AE0170010Struct) list.get(i)).getPRODUCT_TYP());
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
			l_DLV_CD.add(((AE0170010Struct) list.get(i)).getDLV_CD());
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
			l_DISC_AMOUNT.add(((AE0170010Struct) list.get(i)).getDISC_AMOUNT());
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
			l_GNR_ORG_CD.add(((AE0170010Struct) list.get(i)).getGNR_ORG_CD());
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
			l_SBCNT_PUCH_TYP.add(((AE0170010Struct) list.get(i)).getSBCNT_PUCH_TYP());
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
			l_JOB_ODR_DETAIL_NO.add(((AE0170010Struct) list.get(i)).getJOB_ODR_DETAIL_NO());
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
			l_CLASIFICATION_CD.add(((AE0170010Struct) list.get(i)).getCLASIFICATION_CD());
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
			l_INV_CTRL_FLG.add(((AE0170010Struct) list.get(i)).getINV_CTRL_FLG());
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
			l_PUCH_RTN_FLG.add(((AE0170010Struct) list.get(i)).getPUCH_RTN_FLG());
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
			l_APPR_FLG.add(((AE0170010Struct) list.get(i)).getAPPR_FLG());
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
			l_APPR_ID.add(((AE0170010Struct) list.get(i)).getAPPR_ID());
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
			l_APPR_DATE.add(((AE0170010Struct) list.get(i)).getAPPR_DATE());
		}
		return size;
	}
	public int setL2L_RESERVE_CAUSE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RESERVE_CAUSE == null) {
			l_RESERVE_CAUSE = new ArrayList();
		} else {
			l_RESERVE_CAUSE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RESERVE_CAUSE.add(((AE0170010Struct) list.get(i)).getRESERVE_CAUSE());
		}
		return size;
	}
	public int setL2L_SLIP_CTRL_GRP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SLIP_CTRL_GRP == null) {
			l_SLIP_CTRL_GRP = new ArrayList();
		} else {
			l_SLIP_CTRL_GRP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SLIP_CTRL_GRP.add(((AE0170010Struct) list.get(i)).getSLIP_CTRL_GRP());
		}
		return size;
	}
	public int setL2L_SLIP_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SLIP_DATE == null) {
			l_SLIP_DATE = new ArrayList();
		} else {
			l_SLIP_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SLIP_DATE.add(((AE0170010Struct) list.get(i)).getSLIP_DATE());
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
			l_SLIP_CD.add(((AE0170010Struct) list.get(i)).getSLIP_CD());
		}
		return size;
	}
	public int setL2L_SEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEQ_NO == null) {
			l_SEQ_NO = new ArrayList();
		} else {
			l_SEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEQ_NO.add(((AE0170010Struct) list.get(i)).getSEQ_NO());
		}
		return size;
	}
	public int setL2L_NET_AMOUNT_YEN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NET_AMOUNT_YEN == null) {
			l_NET_AMOUNT_YEN = new ArrayList();
		} else {
			l_NET_AMOUNT_YEN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NET_AMOUNT_YEN.add(((AE0170010Struct) list.get(i)).getNET_AMOUNT_YEN());
		}
		return size;
	}
	public int setL2L_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_AMOUNT == null) {
			l_AMOUNT = new ArrayList();
		} else {
			l_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_AMOUNT.add(((AE0170010Struct) list.get(i)).getAMOUNT());
		}
		return size;
	}
	public int setL2L_TAX_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_TYP == null) {
			l_TAX_TYP = new ArrayList();
		} else {
			l_TAX_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_TYP.add(((AE0170010Struct) list.get(i)).getTAX_TYP());
		}
		return size;
	}
	public int setL2L_TAX_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_AMOUNT == null) {
			l_TAX_AMOUNT = new ArrayList();
		} else {
			l_TAX_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_AMOUNT.add(((AE0170010Struct) list.get(i)).getTAX_AMOUNT());
		}
		return size;
	}
	public int setL2L_GROSS_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_GROSS_AMOUNT == null) {
			l_GROSS_AMOUNT = new ArrayList();
		} else {
			l_GROSS_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_GROSS_AMOUNT.add(((AE0170010Struct) list.get(i)).getGROSS_AMOUNT());
		}
		return size;
	}
	public int setL2L_TAX_AMOUNT_YEN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_AMOUNT_YEN == null) {
			l_TAX_AMOUNT_YEN = new ArrayList();
		} else {
			l_TAX_AMOUNT_YEN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_AMOUNT_YEN.add(((AE0170010Struct) list.get(i)).getTAX_AMOUNT_YEN());
		}
		return size;
	}
	public int setL2L_GROSS_AMOUNT_YEN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_GROSS_AMOUNT_YEN == null) {
			l_GROSS_AMOUNT_YEN = new ArrayList();
		} else {
			l_GROSS_AMOUNT_YEN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_GROSS_AMOUNT_YEN.add(((AE0170010Struct) list.get(i)).getGROSS_AMOUNT_YEN());
		}
		return size;
	}
	public int setL2L_SUM_TAX_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUM_TAX_AMOUNT == null) {
			l_SUM_TAX_AMOUNT = new ArrayList();
		} else {
			l_SUM_TAX_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUM_TAX_AMOUNT.add(((AE0170010Struct) list.get(i)).getSUM_TAX_AMOUNT());
		}
		return size;
	}
	public int setL2L_SUM_GROSS_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUM_GROSS_AMOUNT == null) {
			l_SUM_GROSS_AMOUNT = new ArrayList();
		} else {
			l_SUM_GROSS_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUM_GROSS_AMOUNT.add(((AE0170010Struct) list.get(i)).getSUM_GROSS_AMOUNT());
		}
		return size;
	}
	public int setL2L_SUM_NET_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUM_NET_AMOUNT == null) {
			l_SUM_NET_AMOUNT = new ArrayList();
		} else {
			l_SUM_NET_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUM_NET_AMOUNT.add(((AE0170010Struct) list.get(i)).getSUM_NET_AMOUNT());
		}
		return size;
	}
	public int setL2L_TAX_TOTAL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_TOTAL == null) {
			l_TAX_TOTAL = new ArrayList();
		} else {
			l_TAX_TOTAL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_TOTAL.add(((AE0170010Struct) list.get(i)).getTAX_TOTAL());
		}
		return size;
	}
	public int setL2L_GROSS_TOTAL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_GROSS_TOTAL == null) {
			l_GROSS_TOTAL = new ArrayList();
		} else {
			l_GROSS_TOTAL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_GROSS_TOTAL.add(((AE0170010Struct) list.get(i)).getGROSS_TOTAL());
		}
		return size;
	}
	public int setL2L_NET_TOTAL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NET_TOTAL == null) {
			l_NET_TOTAL = new ArrayList();
		} else {
			l_NET_TOTAL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NET_TOTAL.add(((AE0170010Struct) list.get(i)).getNET_TOTAL());
		}
		return size;
	}
	public int setL2L_LINE_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LINE_NO == null) {
			l_LINE_NO = new ArrayList();
		} else {
			l_LINE_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LINE_NO.add(((AE0170010Struct) list.get(i)).getLINE_NO());
		}
		return size;
	}
	public int setL2L_LINE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LINE_TYP == null) {
			l_LINE_TYP = new ArrayList();
		} else {
			l_LINE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LINE_TYP.add(((AE0170010Struct) list.get(i)).getLINE_TYP());
		}
		return size;
	}
	public int setL2L_TAX_AMOUNT_CTRL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_AMOUNT_CTRL_FLG == null) {
			l_TAX_AMOUNT_CTRL_FLG = new ArrayList();
		} else {
			l_TAX_AMOUNT_CTRL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_AMOUNT_CTRL_FLG.add(((AE0170010Struct) list.get(i)).getTAX_AMOUNT_CTRL_FLG());
		}
		return size;
	}
	public int setL2L_UNIT_COST_YEN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_COST_YEN == null) {
			l_UNIT_COST_YEN = new ArrayList();
		} else {
			l_UNIT_COST_YEN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_COST_YEN.add(((AE0170010Struct) list.get(i)).getUNIT_COST_YEN());
		}
		return size;
	}
	public int setL2L_PROCESSING_COST_YEN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROCESSING_COST_YEN == null) {
			l_PROCESSING_COST_YEN = new ArrayList();
		} else {
			l_PROCESSING_COST_YEN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROCESSING_COST_YEN.add(((AE0170010Struct) list.get(i)).getPROCESSING_COST_YEN());
		}
		return size;
	}
	public int setL2L_MATERIAL_COST_YEN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MATERIAL_COST_YEN == null) {
			l_MATERIAL_COST_YEN = new ArrayList();
		} else {
			l_MATERIAL_COST_YEN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MATERIAL_COST_YEN.add(((AE0170010Struct) list.get(i)).getMATERIAL_COST_YEN());
		}
		return size;
	}
	public int setL2L_OTHER_OVERHEADS_YEN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OTHER_OVERHEADS_YEN == null) {
			l_OTHER_OVERHEADS_YEN = new ArrayList();
		} else {
			l_OTHER_OVERHEADS_YEN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OTHER_OVERHEADS_YEN.add(((AE0170010Struct) list.get(i)).getOTHER_OVERHEADS_YEN());
		}
		return size;
	}
	public int setL2L_DR_ACCT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DR_ACCT_CD == null) {
			l_DR_ACCT_CD = new ArrayList();
		} else {
			l_DR_ACCT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DR_ACCT_CD.add(((AE0170010Struct) list.get(i)).getDR_ACCT_CD());
		}
		return size;
	}
	public int setL2L_DR_SUB_ACCT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DR_SUB_ACCT_CD == null) {
			l_DR_SUB_ACCT_CD = new ArrayList();
		} else {
			l_DR_SUB_ACCT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DR_SUB_ACCT_CD.add(((AE0170010Struct) list.get(i)).getDR_SUB_ACCT_CD());
		}
		return size;
	}
	public int setL2L_DR_ORG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DR_ORG_CD == null) {
			l_DR_ORG_CD = new ArrayList();
		} else {
			l_DR_ORG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DR_ORG_CD.add(((AE0170010Struct) list.get(i)).getDR_ORG_CD());
		}
		return size;
	}
	public int setL2L_CR_ACCT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CR_ACCT_CD == null) {
			l_CR_ACCT_CD = new ArrayList();
		} else {
			l_CR_ACCT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CR_ACCT_CD.add(((AE0170010Struct) list.get(i)).getCR_ACCT_CD());
		}
		return size;
	}
	public int setL2L_CR_SUB_ACCT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CR_SUB_ACCT_CD == null) {
			l_CR_SUB_ACCT_CD = new ArrayList();
		} else {
			l_CR_SUB_ACCT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CR_SUB_ACCT_CD.add(((AE0170010Struct) list.get(i)).getCR_SUB_ACCT_CD());
		}
		return size;
	}
	public int setL2L_CR_ORG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CR_ORG_CD == null) {
			l_CR_ORG_CD = new ArrayList();
		} else {
			l_CR_ORG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CR_ORG_CD.add(((AE0170010Struct) list.get(i)).getCR_ORG_CD());
		}
		return size;
	}
	public int setL2L_FIXED_ASSETS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FIXED_ASSETS_CD == null) {
			l_FIXED_ASSETS_CD = new ArrayList();
		} else {
			l_FIXED_ASSETS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FIXED_ASSETS_CD.add(((AE0170010Struct) list.get(i)).getFIXED_ASSETS_CD());
		}
		return size;
	}
	public int setL2L_SUB_FIXED_ASSETS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUB_FIXED_ASSETS_CD == null) {
			l_SUB_FIXED_ASSETS_CD = new ArrayList();
		} else {
			l_SUB_FIXED_ASSETS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUB_FIXED_ASSETS_CD.add(((AE0170010Struct) list.get(i)).getSUB_FIXED_ASSETS_CD());
		}
		return size;
	}
	public int setL2L_DETAIL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DETAIL_NO == null) {
			l_DETAIL_NO = new ArrayList();
		} else {
			l_DETAIL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DETAIL_NO.add(((AE0170010Struct) list.get(i)).getDETAIL_NO());
		}
		return size;
	}
	public int setL2L_COMM_PUCH_ODR_LINE_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COMM_PUCH_ODR_LINE_NO == null) {
			l_COMM_PUCH_ODR_LINE_NO = new ArrayList();
		} else {
			l_COMM_PUCH_ODR_LINE_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COMM_PUCH_ODR_LINE_NO.add(((AE0170010Struct) list.get(i)).getCOMM_PUCH_ODR_LINE_NO());
		}
		return size;
	}
	public int setL2L_ARV_RSLT_LINE_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ARV_RSLT_LINE_NO == null) {
			l_ARV_RSLT_LINE_NO = new ArrayList();
		} else {
			l_ARV_RSLT_LINE_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ARV_RSLT_LINE_NO.add(((AE0170010Struct) list.get(i)).getARV_RSLT_LINE_NO());
		}
		return size;
	}
	public int setL2L_STOCK_CTRL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_CTRL_FLG == null) {
			l_STOCK_CTRL_FLG = new ArrayList();
		} else {
			l_STOCK_CTRL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_CTRL_FLG.add(((AE0170010Struct) list.get(i)).getSTOCK_CTRL_FLG());
		}
		return size;
	}
	public int setL2L_REMARKS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_REMARKS == null) {
			l_REMARKS = new ArrayList();
		} else {
			l_REMARKS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_REMARKS.add(((AE0170010Struct) list.get(i)).getREMARKS());
		}
		return size;
	}
	public int setL2L_INSPC_ACPT_CRCT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INSPC_ACPT_CRCT_TYP == null) {
			l_INSPC_ACPT_CRCT_TYP = new ArrayList();
		} else {
			l_INSPC_ACPT_CRCT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INSPC_ACPT_CRCT_TYP.add(((AE0170010Struct) list.get(i)).getINSPC_ACPT_CRCT_TYP());
		}
		return size;
	}
	public int setL2L_ORGN_SLIP_CTRL_GRP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ORGN_SLIP_CTRL_GRP == null) {
			l_ORGN_SLIP_CTRL_GRP = new ArrayList();
		} else {
			l_ORGN_SLIP_CTRL_GRP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ORGN_SLIP_CTRL_GRP.add(((AE0170010Struct) list.get(i)).getORGN_SLIP_CTRL_GRP());
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
			l_ORGN_SLIP_CD.add(((AE0170010Struct) list.get(i)).getORGN_SLIP_CD());
		}
		return size;
	}
	public int setL2L_ORGN_SLIP_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ORGN_SLIP_DATE == null) {
			l_ORGN_SLIP_DATE = new ArrayList();
		} else {
			l_ORGN_SLIP_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ORGN_SLIP_DATE.add(((AE0170010Struct) list.get(i)).getORGN_SLIP_DATE());
		}
		return size;
	}
	public int setL2L_SLIP_TRN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SLIP_TRN_CD == null) {
			l_SLIP_TRN_CD = new ArrayList();
		} else {
			l_SLIP_TRN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SLIP_TRN_CD.add(((AE0170010Struct) list.get(i)).getSLIP_TRN_CD());
		}
		return size;
	}
	public int setL2L_STOCK_CLASS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_CLASS_CD == null) {
			l_STOCK_CLASS_CD = new ArrayList();
		} else {
			l_STOCK_CLASS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_CLASS_CD.add(((AE0170010Struct) list.get(i)).getSTOCK_CLASS_CD());
		}
		return size;
	}
	public int setL2L_BALANCE_CLASS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BALANCE_CLASS_CD == null) {
			l_BALANCE_CLASS_CD = new ArrayList();
		} else {
			l_BALANCE_CLASS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BALANCE_CLASS_CD.add(((AE0170010Struct) list.get(i)).getBALANCE_CLASS_CD());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_ORG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_ORG_CD == null) {
			l_PUCH_ODR_ORG_CD = new ArrayList();
		} else {
			l_PUCH_ODR_ORG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_ORG_CD.add(((AE0170010Struct) list.get(i)).getPUCH_ODR_ORG_CD());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_PERSON_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_PERSON_CD == null) {
			l_PUCH_ODR_PERSON_CD = new ArrayList();
		} else {
			l_PUCH_ODR_PERSON_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_PERSON_CD.add(((AE0170010Struct) list.get(i)).getPUCH_ODR_PERSON_CD());
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
			l_WH_CD.add(((AE0170010Struct) list.get(i)).getWH_CD());
		}
		return size;
	}
	public int setL2L_SHIP_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SHIP_WH_CD == null) {
			l_SHIP_WH_CD = new ArrayList();
		} else {
			l_SHIP_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SHIP_WH_CD.add(((AE0170010Struct) list.get(i)).getSHIP_WH_CD());
		}
		return size;
	}
	public int setL2L_PAYEE_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PAYEE_CD == null) {
			l_PAYEE_CD = new ArrayList();
		} else {
			l_PAYEE_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PAYEE_CD.add(((AE0170010Struct) list.get(i)).getPAYEE_CD());
		}
		return size;
	}
	public int setL2L_SLIP_CTRL_ORG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SLIP_CTRL_ORG_CD == null) {
			l_SLIP_CTRL_ORG_CD = new ArrayList();
		} else {
			l_SLIP_CTRL_ORG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SLIP_CTRL_ORG_CD.add(((AE0170010Struct) list.get(i)).getSLIP_CTRL_ORG_CD());
		}
		return size;
	}
	public int setL2L_CLOSING_CTRL_ORG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CLOSING_CTRL_ORG_CD == null) {
			l_CLOSING_CTRL_ORG_CD = new ArrayList();
		} else {
			l_CLOSING_CTRL_ORG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CLOSING_CTRL_ORG_CD.add(((AE0170010Struct) list.get(i)).getCLOSING_CTRL_ORG_CD());
		}
		return size;
	}
	public int setL2L_PAY_CALC_CTRL_ORG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PAY_CALC_CTRL_ORG_CD == null) {
			l_PAY_CALC_CTRL_ORG_CD = new ArrayList();
		} else {
			l_PAY_CALC_CTRL_ORG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PAY_CALC_CTRL_ORG_CD.add(((AE0170010Struct) list.get(i)).getPAY_CALC_CTRL_ORG_CD());
		}
		return size;
	}
	public int setL2L_PAY_FIX_CTRL_ORG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PAY_FIX_CTRL_ORG_CD == null) {
			l_PAY_FIX_CTRL_ORG_CD = new ArrayList();
		} else {
			l_PAY_FIX_CTRL_ORG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PAY_FIX_CTRL_ORG_CD.add(((AE0170010Struct) list.get(i)).getPAY_FIX_CTRL_ORG_CD());
		}
		return size;
	}
	public int setL2L_EXPL_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXPL_TYP == null) {
			l_EXPL_TYP = new ArrayList();
		} else {
			l_EXPL_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXPL_TYP.add(((AE0170010Struct) list.get(i)).getEXPL_TYP());
		}
		return size;
	}
	public int setL2L_EXPL_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXPL_CD == null) {
			l_EXPL_CD = new ArrayList();
		} else {
			l_EXPL_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXPL_CD.add(((AE0170010Struct) list.get(i)).getEXPL_CD());
		}
		return size;
	}
	public int setL2L_EXPL_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXPL_NAME == null) {
			l_EXPL_NAME = new ArrayList();
		} else {
			l_EXPL_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXPL_NAME.add(((AE0170010Struct) list.get(i)).getEXPL_NAME());
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
			l_ODR_CD.add(((AE0170010Struct) list.get(i)).getODR_CD());
		}
		return size;
	}
	public int setL2L_COMM_PUCH_ODR_SLIP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COMM_PUCH_ODR_SLIP_TYP == null) {
			l_COMM_PUCH_ODR_SLIP_TYP = new ArrayList();
		} else {
			l_COMM_PUCH_ODR_SLIP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COMM_PUCH_ODR_SLIP_TYP.add(((AE0170010Struct) list.get(i)).getCOMM_PUCH_ODR_SLIP_TYP());
		}
		return size;
	}
	public int setL2L_COMM_PUCH_ODR_SLIP_CTRL_GRP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COMM_PUCH_ODR_SLIP_CTRL_GRP == null) {
			l_COMM_PUCH_ODR_SLIP_CTRL_GRP = new ArrayList();
		} else {
			l_COMM_PUCH_ODR_SLIP_CTRL_GRP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COMM_PUCH_ODR_SLIP_CTRL_GRP.add(((AE0170010Struct) list.get(i)).getCOMM_PUCH_ODR_SLIP_CTRL_GRP());
		}
		return size;
	}
	public int setL2L_COMM_PUCH_ODR_SLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COMM_PUCH_ODR_SLIP_CD == null) {
			l_COMM_PUCH_ODR_SLIP_CD = new ArrayList();
		} else {
			l_COMM_PUCH_ODR_SLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COMM_PUCH_ODR_SLIP_CD.add(((AE0170010Struct) list.get(i)).getCOMM_PUCH_ODR_SLIP_CD());
		}
		return size;
	}
	public int setL2L_COMM_PUCH_ODR_SLIP_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COMM_PUCH_ODR_SLIP_DATE == null) {
			l_COMM_PUCH_ODR_SLIP_DATE = new ArrayList();
		} else {
			l_COMM_PUCH_ODR_SLIP_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COMM_PUCH_ODR_SLIP_DATE.add(((AE0170010Struct) list.get(i)).getCOMM_PUCH_ODR_SLIP_DATE());
		}
		return size;
	}
	public int setL2L_ARV_RSLT_SLIP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ARV_RSLT_SLIP_TYP == null) {
			l_ARV_RSLT_SLIP_TYP = new ArrayList();
		} else {
			l_ARV_RSLT_SLIP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ARV_RSLT_SLIP_TYP.add(((AE0170010Struct) list.get(i)).getARV_RSLT_SLIP_TYP());
		}
		return size;
	}
	public int setL2L_ARV_RSLT_SLIP_CTRL_GRP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ARV_RSLT_SLIP_CTRL_GRP == null) {
			l_ARV_RSLT_SLIP_CTRL_GRP = new ArrayList();
		} else {
			l_ARV_RSLT_SLIP_CTRL_GRP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ARV_RSLT_SLIP_CTRL_GRP.add(((AE0170010Struct) list.get(i)).getARV_RSLT_SLIP_CTRL_GRP());
		}
		return size;
	}
	public int setL2L_ARV_RSLT_SLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ARV_RSLT_SLIP_CD == null) {
			l_ARV_RSLT_SLIP_CD = new ArrayList();
		} else {
			l_ARV_RSLT_SLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ARV_RSLT_SLIP_CD.add(((AE0170010Struct) list.get(i)).getARV_RSLT_SLIP_CD());
		}
		return size;
	}
	public int setL2L_ARV_RSLT_SLIP_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ARV_RSLT_SLIP_DATE == null) {
			l_ARV_RSLT_SLIP_DATE = new ArrayList();
		} else {
			l_ARV_RSLT_SLIP_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ARV_RSLT_SLIP_DATE.add(((AE0170010Struct) list.get(i)).getARV_RSLT_SLIP_DATE());
		}
		return size;
	}
	public int setL2L_PUCH_RSLT_SLIP_ID(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_RSLT_SLIP_ID == null) {
			l_PUCH_RSLT_SLIP_ID = new ArrayList();
		} else {
			l_PUCH_RSLT_SLIP_ID.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_RSLT_SLIP_ID.add(((AE0170010Struct) list.get(i)).getPUCH_RSLT_SLIP_ID());
		}
		return size;
	}
	public int setL2L_TAX_CALC_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_CALC_TYP == null) {
			l_TAX_CALC_TYP = new ArrayList();
		} else {
			l_TAX_CALC_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_CALC_TYP.add(((AE0170010Struct) list.get(i)).getTAX_CALC_TYP());
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
			l_TAX_APPLY_TYP.add(((AE0170010Struct) list.get(i)).getTAX_APPLY_TYP());
		}
		return size;
	}
	public int setL2L_TEMP_UNIT_COST_PUCH_RSLT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TEMP_UNIT_COST_PUCH_RSLT_FLG == null) {
			l_TEMP_UNIT_COST_PUCH_RSLT_FLG = new ArrayList();
		} else {
			l_TEMP_UNIT_COST_PUCH_RSLT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TEMP_UNIT_COST_PUCH_RSLT_FLG.add(((AE0170010Struct) list.get(i)).getTEMP_UNIT_COST_PUCH_RSLT_FLG());
		}
		return size;
	}
	public int setL2L_UNIT_COST_ZERO_INSPC_ACPT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_COST_ZERO_INSPC_ACPT_FLG == null) {
			l_UNIT_COST_ZERO_INSPC_ACPT_FLG = new ArrayList();
		} else {
			l_UNIT_COST_ZERO_INSPC_ACPT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_COST_ZERO_INSPC_ACPT_FLG.add(((AE0170010Struct) list.get(i)).getUNIT_COST_ZERO_INSPC_ACPT_FLG());
		}
		return size;
	}
	public int setL2L_IMPORT_TRN_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IMPORT_TRN_TYP == null) {
			l_IMPORT_TRN_TYP = new ArrayList();
		} else {
			l_IMPORT_TRN_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IMPORT_TRN_TYP.add(((AE0170010Struct) list.get(i)).getIMPORT_TRN_TYP());
		}
		return size;
	}
	public int setL2L_PAY_CYCLE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PAY_CYCLE_TYP == null) {
			l_PAY_CYCLE_TYP = new ArrayList();
		} else {
			l_PAY_CYCLE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PAY_CYCLE_TYP.add(((AE0170010Struct) list.get(i)).getPAY_CYCLE_TYP());
		}
		return size;
	}
	public int setL2L_DEADLINE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEADLINE_DATE == null) {
			l_DEADLINE_DATE = new ArrayList();
		} else {
			l_DEADLINE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEADLINE_DATE.add(((AE0170010Struct) list.get(i)).getDEADLINE_DATE());
		}
		return size;
	}
	public int setL2L_PAY_SCH_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PAY_SCH_DATE == null) {
			l_PAY_SCH_DATE = new ArrayList();
		} else {
			l_PAY_SCH_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PAY_SCH_DATE.add(((AE0170010Struct) list.get(i)).getPAY_SCH_DATE());
		}
		return size;
	}
	public int setL2L_PAY_PATTERN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PAY_PATTERN_CD == null) {
			l_PAY_PATTERN_CD = new ArrayList();
		} else {
			l_PAY_PATTERN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PAY_PATTERN_CD.add(((AE0170010Struct) list.get(i)).getPAY_PATTERN_CD());
		}
		return size;
	}
	public int setL2L_EXCH_RSRV_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXCH_RSRV_CD == null) {
			l_EXCH_RSRV_CD = new ArrayList();
		} else {
			l_EXCH_RSRV_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXCH_RSRV_CD.add(((AE0170010Struct) list.get(i)).getEXCH_RSRV_CD());
		}
		return size;
	}
	public int setL2L_EXCH_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXCH_DATE == null) {
			l_EXCH_DATE = new ArrayList();
		} else {
			l_EXCH_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXCH_DATE.add(((AE0170010Struct) list.get(i)).getEXCH_DATE());
		}
		return size;
	}
	public int setL2L_PUR_RSLT_SLIP_ISSUE_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUR_RSLT_SLIP_ISSUE_FLG == null) {
			l_PUR_RSLT_SLIP_ISSUE_FLG = new ArrayList();
		} else {
			l_PUR_RSLT_SLIP_ISSUE_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUR_RSLT_SLIP_ISSUE_FLG.add(((AE0170010Struct) list.get(i)).getPUR_RSLT_SLIP_ISSUE_FLG());
		}
		return size;
	}
	public int setL2L_PUR_RSLT_REP_ISSUE_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUR_RSLT_REP_ISSUE_FLG == null) {
			l_PUR_RSLT_REP_ISSUE_FLG = new ArrayList();
		} else {
			l_PUR_RSLT_REP_ISSUE_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUR_RSLT_REP_ISSUE_FLG.add(((AE0170010Struct) list.get(i)).getPUR_RSLT_REP_ISSUE_FLG());
		}
		return size;
	}
	public int setL2L_ACPT_ARV_MODIFICATION_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACPT_ARV_MODIFICATION_FLG == null) {
			l_ACPT_ARV_MODIFICATION_FLG = new ArrayList();
		} else {
			l_ACPT_ARV_MODIFICATION_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACPT_ARV_MODIFICATION_FLG.add(((AE0170010Struct) list.get(i)).getACPT_ARV_MODIFICATION_FLG());
		}
		return size;
	}
	public int setL2L_INSPC_ACPT_MODIFICATION_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INSPC_ACPT_MODIFICATION_FLG == null) {
			l_INSPC_ACPT_MODIFICATION_FLG = new ArrayList();
		} else {
			l_INSPC_ACPT_MODIFICATION_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INSPC_ACPT_MODIFICATION_FLG.add(((AE0170010Struct) list.get(i)).getINSPC_ACPT_MODIFICATION_FLG());
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
			l_STATUS.add(((AE0170010Struct) list.get(i)).getSTATUS());
		}
		return size;
	}
	public int setL2L_CRCT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CRCT_FLG == null) {
			l_CRCT_FLG = new ArrayList();
		} else {
			l_CRCT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CRCT_FLG.add(((AE0170010Struct) list.get(i)).getCRCT_FLG());
		}
		return size;
	}
	public int setL2L_APPROVAL_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_APPROVAL_DATE == null) {
			l_APPROVAL_DATE = new ArrayList();
		} else {
			l_APPROVAL_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_APPROVAL_DATE.add(((AE0170010Struct) list.get(i)).getAPPROVAL_DATE());
		}
		return size;
	}
	public int setL2L_APPROVAL_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_APPROVAL_CD == null) {
			l_APPROVAL_CD = new ArrayList();
		} else {
			l_APPROVAL_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_APPROVAL_CD.add(((AE0170010Struct) list.get(i)).getAPPROVAL_CD());
		}
		return size;
	}
	public int setL2L_APPROVAL_RSRV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_APPROVAL_RSRV_DATE == null) {
			l_APPROVAL_RSRV_DATE = new ArrayList();
		} else {
			l_APPROVAL_RSRV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_APPROVAL_RSRV_DATE.add(((AE0170010Struct) list.get(i)).getAPPROVAL_RSRV_DATE());
		}
		return size;
	}
	public int setL2L_APPROVAL_RSRV_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_APPROVAL_RSRV_CD == null) {
			l_APPROVAL_RSRV_CD = new ArrayList();
		} else {
			l_APPROVAL_RSRV_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_APPROVAL_RSRV_CD.add(((AE0170010Struct) list.get(i)).getAPPROVAL_RSRV_CD());
		}
		return size;
	}
	public int setL2L_RSN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RSN_CD == null) {
			l_RSN_CD = new ArrayList();
		} else {
			l_RSN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RSN_CD.add(((AE0170010Struct) list.get(i)).getRSN_CD());
		}
		return size;
	}
	public int setL2L_RECORDING_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RECORDING_DATE == null) {
			l_RECORDING_DATE = new ArrayList();
		} else {
			l_RECORDING_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RECORDING_DATE.add(((AE0170010Struct) list.get(i)).getRECORDING_DATE());
		}
		return size;
	}
	public int setL2L_RECORDING_MONTH(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RECORDING_MONTH == null) {
			l_RECORDING_MONTH = new ArrayList();
		} else {
			l_RECORDING_MONTH.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RECORDING_MONTH.add(((AE0170010Struct) list.get(i)).getRECORDING_MONTH());
		}
		return size;
	}
	public int setL2L_ORGN_RECORDING_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ORGN_RECORDING_DATE == null) {
			l_ORGN_RECORDING_DATE = new ArrayList();
		} else {
			l_ORGN_RECORDING_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ORGN_RECORDING_DATE.add(((AE0170010Struct) list.get(i)).getORGN_RECORDING_DATE());
		}
		return size;
	}
	public int setL2L_ORGN_RECORDING_MONTH(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ORGN_RECORDING_MONTH == null) {
			l_ORGN_RECORDING_MONTH = new ArrayList();
		} else {
			l_ORGN_RECORDING_MONTH.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ORGN_RECORDING_MONTH.add(((AE0170010Struct) list.get(i)).getORGN_RECORDING_MONTH());
		}
		return size;
	}
	public int setL2L_RECORDING_PROC_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RECORDING_PROC_DATE == null) {
			l_RECORDING_PROC_DATE = new ArrayList();
		} else {
			l_RECORDING_PROC_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RECORDING_PROC_DATE.add(((AE0170010Struct) list.get(i)).getRECORDING_PROC_DATE());
		}
		return size;
	}
	public int setL2L_RECORDING_PROC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RECORDING_PROC_CD == null) {
			l_RECORDING_PROC_CD = new ArrayList();
		} else {
			l_RECORDING_PROC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RECORDING_PROC_CD.add(((AE0170010Struct) list.get(i)).getRECORDING_PROC_CD());
		}
		return size;
	}
	public int setL2L_CLOSING_RSRV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CLOSING_RSRV_DATE == null) {
			l_CLOSING_RSRV_DATE = new ArrayList();
		} else {
			l_CLOSING_RSRV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CLOSING_RSRV_DATE.add(((AE0170010Struct) list.get(i)).getCLOSING_RSRV_DATE());
		}
		return size;
	}
	public int setL2L_CLOSING_RSRV_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CLOSING_RSRV_CD == null) {
			l_CLOSING_RSRV_CD = new ArrayList();
		} else {
			l_CLOSING_RSRV_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CLOSING_RSRV_CD.add(((AE0170010Struct) list.get(i)).getCLOSING_RSRV_CD());
		}
		return size;
	}
	public int setL2L_CLOSING_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CLOSING_DATE == null) {
			l_CLOSING_DATE = new ArrayList();
		} else {
			l_CLOSING_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CLOSING_DATE.add(((AE0170010Struct) list.get(i)).getCLOSING_DATE());
		}
		return size;
	}
	public int setL2L_CLOSING_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CLOSING_CD == null) {
			l_CLOSING_CD = new ArrayList();
		} else {
			l_CLOSING_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CLOSING_CD.add(((AE0170010Struct) list.get(i)).getCLOSING_CD());
		}
		return size;
	}
	public int setL2L_PAY_FIX_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PAY_FIX_DATE == null) {
			l_PAY_FIX_DATE = new ArrayList();
		} else {
			l_PAY_FIX_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PAY_FIX_DATE.add(((AE0170010Struct) list.get(i)).getPAY_FIX_DATE());
		}
		return size;
	}
	public int setL2L_PAY_FIX_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PAY_FIX_CD == null) {
			l_PAY_FIX_CD = new ArrayList();
		} else {
			l_PAY_FIX_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PAY_FIX_CD.add(((AE0170010Struct) list.get(i)).getPAY_FIX_CD());
		}
		return size;
	}
	public int setL2L_DEBT_BALANCE_OUT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEBT_BALANCE_OUT_FLG == null) {
			l_DEBT_BALANCE_OUT_FLG = new ArrayList();
		} else {
			l_DEBT_BALANCE_OUT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEBT_BALANCE_OUT_FLG.add(((AE0170010Struct) list.get(i)).getDEBT_BALANCE_OUT_FLG());
		}
		return size;
	}
	public int setL2L_DEBT_BALANCE_OUT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEBT_BALANCE_OUT_DATE == null) {
			l_DEBT_BALANCE_OUT_DATE = new ArrayList();
		} else {
			l_DEBT_BALANCE_OUT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEBT_BALANCE_OUT_DATE.add(((AE0170010Struct) list.get(i)).getDEBT_BALANCE_OUT_DATE());
		}
		return size;
	}
	public int setL2L_MONTH(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MONTH == null) {
			l_MONTH = new ArrayList();
		} else {
			l_MONTH.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MONTH.add(((AE0170010Struct) list.get(i)).getMONTH());
		}
		return size;
	}
	public int setL2L_ACCT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACCT_CD == null) {
			l_ACCT_CD = new ArrayList();
		} else {
			l_ACCT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACCT_CD.add(((AE0170010Struct) list.get(i)).getACCT_CD());
		}
		return size;
	}
	public int setL2L_SUB_ACCT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUB_ACCT_CD == null) {
			l_SUB_ACCT_CD = new ArrayList();
		} else {
			l_SUB_ACCT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUB_ACCT_CD.add(((AE0170010Struct) list.get(i)).getSUB_ACCT_CD());
		}
		return size;
	}
	public int setL2L_ORG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ORG_CD == null) {
			l_ORG_CD = new ArrayList();
		} else {
			l_ORG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ORG_CD.add(((AE0170010Struct) list.get(i)).getORG_CD());
		}
		return size;
	}
	public int setL2L_DATA_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DATA_TYP == null) {
			l_DATA_TYP = new ArrayList();
		} else {
			l_DATA_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DATA_TYP.add(((AE0170010Struct) list.get(i)).getDATA_TYP());
		}
		return size;
	}
	public int setL2L_GL_IF_OUT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_GL_IF_OUT_FLG == null) {
			l_GL_IF_OUT_FLG = new ArrayList();
		} else {
			l_GL_IF_OUT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_GL_IF_OUT_FLG.add(((AE0170010Struct) list.get(i)).getGL_IF_OUT_FLG());
		}
		return size;
	}
	public int setL2L_BALANCE_UPD_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BALANCE_UPD_FLG == null) {
			l_BALANCE_UPD_FLG = new ArrayList();
		} else {
			l_BALANCE_UPD_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BALANCE_UPD_FLG.add(((AE0170010Struct) list.get(i)).getBALANCE_UPD_FLG());
		}
		return size;
	}
	public int setL2L_BALANCE_UPD_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BALANCE_UPD_DATE == null) {
			l_BALANCE_UPD_DATE = new ArrayList();
		} else {
			l_BALANCE_UPD_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BALANCE_UPD_DATE.add(((AE0170010Struct) list.get(i)).getBALANCE_UPD_DATE());
		}
		return size;
	}
	public int setL2L_RECORDING_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RECORDING_AMOUNT == null) {
			l_RECORDING_AMOUNT = new ArrayList();
		} else {
			l_RECORDING_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RECORDING_AMOUNT.add(((AE0170010Struct) list.get(i)).getRECORDING_AMOUNT());
		}
		return size;
	}
	public int setL2L_DEBT_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEBT_AMOUNT == null) {
			l_DEBT_AMOUNT = new ArrayList();
		} else {
			l_DEBT_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEBT_AMOUNT.add(((AE0170010Struct) list.get(i)).getDEBT_AMOUNT());
		}
		return size;
	}
	public int setL2L_REBATE_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_REBATE_AMOUNT == null) {
			l_REBATE_AMOUNT = new ArrayList();
		} else {
			l_REBATE_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_REBATE_AMOUNT.add(((AE0170010Struct) list.get(i)).getREBATE_AMOUNT());
		}
		return size;
	}
	public int setL2L_RETURNED_GOODS_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RETURNED_GOODS_AMOUNT == null) {
			l_RETURNED_GOODS_AMOUNT = new ArrayList();
		} else {
			l_RETURNED_GOODS_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RETURNED_GOODS_AMOUNT.add(((AE0170010Struct) list.get(i)).getRETURNED_GOODS_AMOUNT());
		}
		return size;
	}
	public int setL2L_RECORDING_AMOUNT_YEN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RECORDING_AMOUNT_YEN == null) {
			l_RECORDING_AMOUNT_YEN = new ArrayList();
		} else {
			l_RECORDING_AMOUNT_YEN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RECORDING_AMOUNT_YEN.add(((AE0170010Struct) list.get(i)).getRECORDING_AMOUNT_YEN());
		}
		return size;
	}
	public int setL2L_DEBT_AMOUNT_YEN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEBT_AMOUNT_YEN == null) {
			l_DEBT_AMOUNT_YEN = new ArrayList();
		} else {
			l_DEBT_AMOUNT_YEN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEBT_AMOUNT_YEN.add(((AE0170010Struct) list.get(i)).getDEBT_AMOUNT_YEN());
		}
		return size;
	}
	public int setL2L_SAVING_AMOUNT_YEN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SAVING_AMOUNT_YEN == null) {
			l_SAVING_AMOUNT_YEN = new ArrayList();
		} else {
			l_SAVING_AMOUNT_YEN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SAVING_AMOUNT_YEN.add(((AE0170010Struct) list.get(i)).getSAVING_AMOUNT_YEN());
		}
		return size;
	}
	public int setL2L_REBATE_AMOUNT_YEN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_REBATE_AMOUNT_YEN == null) {
			l_REBATE_AMOUNT_YEN = new ArrayList();
		} else {
			l_REBATE_AMOUNT_YEN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_REBATE_AMOUNT_YEN.add(((AE0170010Struct) list.get(i)).getREBATE_AMOUNT_YEN());
		}
		return size;
	}
	public int setL2L_RETURNED_GOODS_AMOUNT_YEN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RETURNED_GOODS_AMOUNT_YEN == null) {
			l_RETURNED_GOODS_AMOUNT_YEN = new ArrayList();
		} else {
			l_RETURNED_GOODS_AMOUNT_YEN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RETURNED_GOODS_AMOUNT_YEN.add(((AE0170010Struct) list.get(i)).getRETURNED_GOODS_AMOUNT_YEN());
		}
		return size;
	}
	public int setL2L_INSPC_ACPT_AMOUNT_YEN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INSPC_ACPT_AMOUNT_YEN == null) {
			l_INSPC_ACPT_AMOUNT_YEN = new ArrayList();
		} else {
			l_INSPC_ACPT_AMOUNT_YEN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INSPC_ACPT_AMOUNT_YEN.add(((AE0170010Struct) list.get(i)).getINSPC_ACPT_AMOUNT_YEN());
		}
		return size;
	}
	public int setL2L_EXCH_DIFF_AMOUNT_YEN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXCH_DIFF_AMOUNT_YEN == null) {
			l_EXCH_DIFF_AMOUNT_YEN = new ArrayList();
		} else {
			l_EXCH_DIFF_AMOUNT_YEN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXCH_DIFF_AMOUNT_YEN.add(((AE0170010Struct) list.get(i)).getEXCH_DIFF_AMOUNT_YEN());
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
			l_OPTION_ID.add(((AE0170010Struct) list.get(i)).getOPTION_ID());
		}
		return size;
	}
	public int setL2L_OWN_CUR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OWN_CUR_CD == null) {
			l_OWN_CUR_CD = new ArrayList();
		} else {
			l_OWN_CUR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OWN_CUR_CD.add(((AE0170010Struct) list.get(i)).getOWN_CUR_CD());
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
			l_THIS_MONTH.add(((AE0170010Struct) list.get(i)).getTHIS_MONTH());
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
			l_HOME_DECIMAL_FIG.add(((AE0170010Struct) list.get(i)).getHOME_DECIMAL_FIG());
		}
		return size;
	}
	public int setL2L_HOME_CUR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HOME_CUR_CD == null) {
			l_HOME_CUR_CD = new ArrayList();
		} else {
			l_HOME_CUR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HOME_CUR_CD.add(((AE0170010Struct) list.get(i)).getHOME_CUR_CD());
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
			l_TIME_CTRL.add(((AE0170010Struct) list.get(i)).getTIME_CTRL());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_c_NON_NO_ITEM_FLG = null;
		m_PUCH_ODR_DLV_TIME = null;
		m_PUCH_ODR_START_TIME = null;
		m_l_STATUS = null;
		m_l_ACPT_NO = null;
		m_l_ACPT_QTY = null;
		m_l_ACPT_DATE = null;
		m_l_UNIT_COST = null;
		m_l_UNIT_COST_TYP = null;
		m_l_PUCH_ODR_AMOUNT = null;
		m_l_INSPECTED_QTY = null;
		m_l_ACCEPTED_QTY = null;
		m_l_INSPEC_DATE = null;
		m_h_NET_AMOUNT = null;
		m_h_TAX_AMOUNT_1 = null;
		m_h_TAX_AMOUNT_2 = null;
		m_h_TAX_AMOUNT_3 = null;
		m_h_DECIMAL_FIG = null;
		m_h_ROUND_TYP = null;
		m_h_PUCH_ODR_STS_TYP = null;
		m_h_PUCH_ODR_INST_SLIP_ISS_FLG = null;
		m_h_ODR_CANCEL_SLIP_ISS_FLG = null;
		m_h_INSPC_CMPLT_FLG = null;
		m_h_ACPT_INSPC_TYP = null;
		m_h_NET_AMOUNT_LIST = null;
		m_h_TAX_AMOUNT_1_LIST = null;
		m_h_TAX_AMOUNT_2_LIST = null;
		m_h_TAX_AMOUNT_3_LIST = null;
		m_h_UPDATE_FLG = null;
		m_h_MODIFY_COUNT = null;
		m_h_MODIFY_COUNT_LIST = null;
		m_h_EXCH_RATE = null;
		m_h_EXCH_RATE_LIST = null;
		m_h_TAX_CD = null;
		m_h_PUCH_ODR_CD = null;
		m_NON_NO_ITEM_FLG = null;
		m_ITEM_CD = null;
		m_VEND_CD = null;
		m_PUCH_ODR_DLV_DATE = null;
		m_TAX_CD = null;
		m_PUCH_ODR_START_DATE = null;
		m_PUCH_ODR_QTY = null;
		m_UNIT_COST_TYP = null;
		m_UNIT_COST = null;
		m_ACPT_INSPC_TYP = null;
		m_PUCH_ODR_AMOUNT = null;
		m_RATE_JUDGE_DATE = null;
		m_NET_AMOUNT = null;
		m_TAX_AMOUNT_1 = null;
		m_TAX_AMOUNT_2 = null;
		m_TAX_AMOUNT_3 = null;
		m_PUCH_ODR_STS_TYP = null;
		m_PUCH_ODR_INST_SLIP_ISS_FLG = null;
		m_ODR_CANCEL_SLIP_ISS_FLG = null;
		m_INSPC_CMPLT_FLG = null;
		m_MODIFY_COUNT = null;
		m_EXCH_RATE = null;
		m_ITEM_NAME = null;
		m_STOCK_UNIT = null;
		m_JOB_ODR_CD = null;
		m_VEND_NAME = null;
		m_INSPC_ACPT_APP_TYP = null;
		m_CUR_CD = null;
		m_EXCH_TYP = null;
		m_ROUND_TYP = null;
		m_CUR_NAME = null;
		m_CUR_UNIT = null;
		m_DECIMAL_FIG = null;
		m_PUCH_ODR_CD = null;
		m_COMPANY_CD = null;
		m_ACPT_NO = null;
		m_ACPT_QTY = null;
		m_ACPT_DATE = null;
		m_INSPECTED_QTY = null;
		m_ACCEPTED_QTY = null;
		m_INSPEC_DATE = null;
		m_OLD_TAX_RATE_1 = null;
		m_OLD_TAX_RATE_2 = null;
		m_OLD_TAX_RATE_3 = null;
		m_NEW_TAX_RATE_START_DATE = null;
		m_NEW_TAX_RATE_1 = null;
		m_NEW_TAX_RATE_2 = null;
		m_NEW_TAX_RATE_3 = null;
		m_TAX_RATE_1 = null;
		m_TAX_RATE_2 = null;
		m_TAX_RATE_3 = null;
		m_AMOUNT_INCLUDE_TAX = null;
		m_HOME_CUR_AMOUNT = null;
		m_TAX_ROUND_TYP = null;
		m_INSPC_ACPT_NO = null;
		m_INSPC_ACPT_GNR_TYP = null;
		m_CRCT_NO = null;
		m_CRCT_TYP = null;
		m_SLIP_TYP = null;
		m_WORK_IN_PROC_CD = null;
		m_PLANT_CD = null;
		m_PROCESSING_COST = null;
		m_MATERIAL_COST = null;
		m_OTHER_OVERHEADS = null;
		m_INSPC_ACPT_QTY = null;
		m_INSPC_ACPT_AMOUNT = null;
		m_SAVING_AMOUNT = null;
		m_INSPC_ACPT_DATE = null;
		m_PRODUCT_TYP = null;
		m_DLV_CD = null;
		m_DISC_AMOUNT = null;
		m_GNR_ORG_CD = null;
		m_SBCNT_PUCH_TYP = null;
		m_JOB_ODR_DETAIL_NO = null;
		m_CLASIFICATION_CD = null;
		m_INV_CTRL_FLG = null;
		m_PUCH_RTN_FLG = null;
		m_APPR_FLG = null;
		m_APPR_ID = null;
		m_APPR_DATE = null;
		m_RESERVE_CAUSE = null;
		m_SLIP_CTRL_GRP = null;
		m_SLIP_DATE = null;
		m_SLIP_CD = null;
		m_SEQ_NO = null;
		m_NET_AMOUNT_YEN = null;
		m_AMOUNT = null;
		m_TAX_TYP = null;
		m_TAX_AMOUNT = null;
		m_GROSS_AMOUNT = null;
		m_TAX_AMOUNT_YEN = null;
		m_GROSS_AMOUNT_YEN = null;
		m_SUM_TAX_AMOUNT = null;
		m_SUM_GROSS_AMOUNT = null;
		m_SUM_NET_AMOUNT = null;
		m_TAX_TOTAL = null;
		m_GROSS_TOTAL = null;
		m_NET_TOTAL = null;
		m_LINE_NO = null;
		m_LINE_TYP = null;
		m_TAX_AMOUNT_CTRL_FLG = null;
		m_UNIT_COST_YEN = null;
		m_PROCESSING_COST_YEN = null;
		m_MATERIAL_COST_YEN = null;
		m_OTHER_OVERHEADS_YEN = null;
		m_DR_ACCT_CD = null;
		m_DR_SUB_ACCT_CD = null;
		m_DR_ORG_CD = null;
		m_CR_ACCT_CD = null;
		m_CR_SUB_ACCT_CD = null;
		m_CR_ORG_CD = null;
		m_FIXED_ASSETS_CD = null;
		m_SUB_FIXED_ASSETS_CD = null;
		m_DETAIL_NO = null;
		m_COMM_PUCH_ODR_LINE_NO = null;
		m_ARV_RSLT_LINE_NO = null;
		m_STOCK_CTRL_FLG = null;
		m_REMARKS = null;
		m_INSPC_ACPT_CRCT_TYP = null;
		m_ORGN_SLIP_CTRL_GRP = null;
		m_ORGN_SLIP_CD = null;
		m_ORGN_SLIP_DATE = null;
		m_SLIP_TRN_CD = null;
		m_STOCK_CLASS_CD = null;
		m_BALANCE_CLASS_CD = null;
		m_PUCH_ODR_ORG_CD = null;
		m_PUCH_ODR_PERSON_CD = null;
		m_WH_CD = null;
		m_SHIP_WH_CD = null;
		m_PAYEE_CD = null;
		m_SLIP_CTRL_ORG_CD = null;
		m_CLOSING_CTRL_ORG_CD = null;
		m_PAY_CALC_CTRL_ORG_CD = null;
		m_PAY_FIX_CTRL_ORG_CD = null;
		m_EXPL_TYP = null;
		m_EXPL_CD = null;
		m_EXPL_NAME = null;
		m_ODR_CD = null;
		m_COMM_PUCH_ODR_SLIP_TYP = null;
		m_COMM_PUCH_ODR_SLIP_CTRL_GRP = null;
		m_COMM_PUCH_ODR_SLIP_CD = null;
		m_COMM_PUCH_ODR_SLIP_DATE = null;
		m_ARV_RSLT_SLIP_TYP = null;
		m_ARV_RSLT_SLIP_CTRL_GRP = null;
		m_ARV_RSLT_SLIP_CD = null;
		m_ARV_RSLT_SLIP_DATE = null;
		m_PUCH_RSLT_SLIP_ID = null;
		m_TAX_CALC_TYP = null;
		m_TAX_APPLY_TYP = null;
		m_TEMP_UNIT_COST_PUCH_RSLT_FLG = null;
		m_UNIT_COST_ZERO_INSPC_ACPT_FLG = null;
		m_IMPORT_TRN_TYP = null;
		m_PAY_CYCLE_TYP = null;
		m_DEADLINE_DATE = null;
		m_PAY_SCH_DATE = null;
		m_PAY_PATTERN_CD = null;
		m_EXCH_RSRV_CD = null;
		m_EXCH_DATE = null;
		m_PUR_RSLT_SLIP_ISSUE_FLG = null;
		m_PUR_RSLT_REP_ISSUE_FLG = null;
		m_ACPT_ARV_MODIFICATION_FLG = null;
		m_INSPC_ACPT_MODIFICATION_FLG = null;
		m_STATUS = null;
		m_CRCT_FLG = null;
		m_APPROVAL_DATE = null;
		m_APPROVAL_CD = null;
		m_APPROVAL_RSRV_DATE = null;
		m_APPROVAL_RSRV_CD = null;
		m_RSN_CD = null;
		m_RECORDING_DATE = null;
		m_RECORDING_MONTH = null;
		m_ORGN_RECORDING_DATE = null;
		m_ORGN_RECORDING_MONTH = null;
		m_RECORDING_PROC_DATE = null;
		m_RECORDING_PROC_CD = null;
		m_CLOSING_RSRV_DATE = null;
		m_CLOSING_RSRV_CD = null;
		m_CLOSING_DATE = null;
		m_CLOSING_CD = null;
		m_PAY_FIX_DATE = null;
		m_PAY_FIX_CD = null;
		m_DEBT_BALANCE_OUT_FLG = null;
		m_DEBT_BALANCE_OUT_DATE = null;
		m_MONTH = null;
		m_ACCT_CD = null;
		m_SUB_ACCT_CD = null;
		m_ORG_CD = null;
		m_DATA_TYP = null;
		m_GL_IF_OUT_FLG = null;
		m_BALANCE_UPD_FLG = null;
		m_BALANCE_UPD_DATE = null;
		m_RECORDING_AMOUNT = null;
		m_DEBT_AMOUNT = null;
		m_REBATE_AMOUNT = null;
		m_RETURNED_GOODS_AMOUNT = null;
		m_RECORDING_AMOUNT_YEN = null;
		m_DEBT_AMOUNT_YEN = null;
		m_SAVING_AMOUNT_YEN = null;
		m_REBATE_AMOUNT_YEN = null;
		m_RETURNED_GOODS_AMOUNT_YEN = null;
		m_INSPC_ACPT_AMOUNT_YEN = null;
		m_EXCH_DIFF_AMOUNT_YEN = null;
		m_OPTION_ID = null;
		m_OWN_CUR_CD = null;
		m_THIS_MONTH = null;
		m_HOME_DECIMAL_FIG = null;
		m_HOME_CUR_CD = null;
		m_TIME_CTRL = null;

		l_c_NON_NO_ITEM_FLG = null;
		l_PUCH_ODR_DLV_TIME = null;
		l_PUCH_ODR_START_TIME = null;
		l_l_STATUS = null;
		l_l_ACPT_NO = null;
		l_l_ACPT_QTY = null;
		l_l_ACPT_DATE = null;
		l_l_UNIT_COST = null;
		l_l_UNIT_COST_TYP = null;
		l_l_PUCH_ODR_AMOUNT = null;
		l_l_INSPECTED_QTY = null;
		l_l_ACCEPTED_QTY = null;
		l_l_INSPEC_DATE = null;
		l_h_NET_AMOUNT = null;
		l_h_TAX_AMOUNT_1 = null;
		l_h_TAX_AMOUNT_2 = null;
		l_h_TAX_AMOUNT_3 = null;
		l_h_DECIMAL_FIG = null;
		l_h_ROUND_TYP = null;
		l_h_PUCH_ODR_STS_TYP = null;
		l_h_PUCH_ODR_INST_SLIP_ISS_FLG = null;
		l_h_ODR_CANCEL_SLIP_ISS_FLG = null;
		l_h_INSPC_CMPLT_FLG = null;
		l_h_ACPT_INSPC_TYP = null;
		l_h_NET_AMOUNT_LIST = null;
		l_h_TAX_AMOUNT_1_LIST = null;
		l_h_TAX_AMOUNT_2_LIST = null;
		l_h_TAX_AMOUNT_3_LIST = null;
		l_h_UPDATE_FLG = null;
		l_h_MODIFY_COUNT = null;
		l_h_MODIFY_COUNT_LIST = null;
		l_h_EXCH_RATE = null;
		l_h_EXCH_RATE_LIST = null;
		l_h_TAX_CD = null;
		l_h_PUCH_ODR_CD = null;
		l_NON_NO_ITEM_FLG = null;
		l_ITEM_CD = null;
		l_VEND_CD = null;
		l_PUCH_ODR_DLV_DATE = null;
		l_TAX_CD = null;
		l_PUCH_ODR_START_DATE = null;
		l_PUCH_ODR_QTY = null;
		l_UNIT_COST_TYP = null;
		l_UNIT_COST = null;
		l_ACPT_INSPC_TYP = null;
		l_PUCH_ODR_AMOUNT = null;
		l_RATE_JUDGE_DATE = null;
		l_NET_AMOUNT = null;
		l_TAX_AMOUNT_1 = null;
		l_TAX_AMOUNT_2 = null;
		l_TAX_AMOUNT_3 = null;
		l_PUCH_ODR_STS_TYP = null;
		l_PUCH_ODR_INST_SLIP_ISS_FLG = null;
		l_ODR_CANCEL_SLIP_ISS_FLG = null;
		l_INSPC_CMPLT_FLG = null;
		l_MODIFY_COUNT = null;
		l_EXCH_RATE = null;
		l_ITEM_NAME = null;
		l_STOCK_UNIT = null;
		l_JOB_ODR_CD = null;
		l_VEND_NAME = null;
		l_INSPC_ACPT_APP_TYP = null;
		l_CUR_CD = null;
		l_EXCH_TYP = null;
		l_ROUND_TYP = null;
		l_CUR_NAME = null;
		l_CUR_UNIT = null;
		l_DECIMAL_FIG = null;
		l_PUCH_ODR_CD = null;
		l_COMPANY_CD = null;
		l_ACPT_NO = null;
		l_ACPT_QTY = null;
		l_ACPT_DATE = null;
		l_INSPECTED_QTY = null;
		l_ACCEPTED_QTY = null;
		l_INSPEC_DATE = null;
		l_OLD_TAX_RATE_1 = null;
		l_OLD_TAX_RATE_2 = null;
		l_OLD_TAX_RATE_3 = null;
		l_NEW_TAX_RATE_START_DATE = null;
		l_NEW_TAX_RATE_1 = null;
		l_NEW_TAX_RATE_2 = null;
		l_NEW_TAX_RATE_3 = null;
		l_TAX_RATE_1 = null;
		l_TAX_RATE_2 = null;
		l_TAX_RATE_3 = null;
		l_AMOUNT_INCLUDE_TAX = null;
		l_HOME_CUR_AMOUNT = null;
		l_TAX_ROUND_TYP = null;
		l_INSPC_ACPT_NO = null;
		l_INSPC_ACPT_GNR_TYP = null;
		l_CRCT_NO = null;
		l_CRCT_TYP = null;
		l_SLIP_TYP = null;
		l_WORK_IN_PROC_CD = null;
		l_PLANT_CD = null;
		l_PROCESSING_COST = null;
		l_MATERIAL_COST = null;
		l_OTHER_OVERHEADS = null;
		l_INSPC_ACPT_QTY = null;
		l_INSPC_ACPT_AMOUNT = null;
		l_SAVING_AMOUNT = null;
		l_INSPC_ACPT_DATE = null;
		l_PRODUCT_TYP = null;
		l_DLV_CD = null;
		l_DISC_AMOUNT = null;
		l_GNR_ORG_CD = null;
		l_SBCNT_PUCH_TYP = null;
		l_JOB_ODR_DETAIL_NO = null;
		l_CLASIFICATION_CD = null;
		l_INV_CTRL_FLG = null;
		l_PUCH_RTN_FLG = null;
		l_APPR_FLG = null;
		l_APPR_ID = null;
		l_APPR_DATE = null;
		l_RESERVE_CAUSE = null;
		l_SLIP_CTRL_GRP = null;
		l_SLIP_DATE = null;
		l_SLIP_CD = null;
		l_SEQ_NO = null;
		l_NET_AMOUNT_YEN = null;
		l_AMOUNT = null;
		l_TAX_TYP = null;
		l_TAX_AMOUNT = null;
		l_GROSS_AMOUNT = null;
		l_TAX_AMOUNT_YEN = null;
		l_GROSS_AMOUNT_YEN = null;
		l_SUM_TAX_AMOUNT = null;
		l_SUM_GROSS_AMOUNT = null;
		l_SUM_NET_AMOUNT = null;
		l_TAX_TOTAL = null;
		l_GROSS_TOTAL = null;
		l_NET_TOTAL = null;
		l_LINE_NO = null;
		l_LINE_TYP = null;
		l_TAX_AMOUNT_CTRL_FLG = null;
		l_UNIT_COST_YEN = null;
		l_PROCESSING_COST_YEN = null;
		l_MATERIAL_COST_YEN = null;
		l_OTHER_OVERHEADS_YEN = null;
		l_DR_ACCT_CD = null;
		l_DR_SUB_ACCT_CD = null;
		l_DR_ORG_CD = null;
		l_CR_ACCT_CD = null;
		l_CR_SUB_ACCT_CD = null;
		l_CR_ORG_CD = null;
		l_FIXED_ASSETS_CD = null;
		l_SUB_FIXED_ASSETS_CD = null;
		l_DETAIL_NO = null;
		l_COMM_PUCH_ODR_LINE_NO = null;
		l_ARV_RSLT_LINE_NO = null;
		l_STOCK_CTRL_FLG = null;
		l_REMARKS = null;
		l_INSPC_ACPT_CRCT_TYP = null;
		l_ORGN_SLIP_CTRL_GRP = null;
		l_ORGN_SLIP_CD = null;
		l_ORGN_SLIP_DATE = null;
		l_SLIP_TRN_CD = null;
		l_STOCK_CLASS_CD = null;
		l_BALANCE_CLASS_CD = null;
		l_PUCH_ODR_ORG_CD = null;
		l_PUCH_ODR_PERSON_CD = null;
		l_WH_CD = null;
		l_SHIP_WH_CD = null;
		l_PAYEE_CD = null;
		l_SLIP_CTRL_ORG_CD = null;
		l_CLOSING_CTRL_ORG_CD = null;
		l_PAY_CALC_CTRL_ORG_CD = null;
		l_PAY_FIX_CTRL_ORG_CD = null;
		l_EXPL_TYP = null;
		l_EXPL_CD = null;
		l_EXPL_NAME = null;
		l_ODR_CD = null;
		l_COMM_PUCH_ODR_SLIP_TYP = null;
		l_COMM_PUCH_ODR_SLIP_CTRL_GRP = null;
		l_COMM_PUCH_ODR_SLIP_CD = null;
		l_COMM_PUCH_ODR_SLIP_DATE = null;
		l_ARV_RSLT_SLIP_TYP = null;
		l_ARV_RSLT_SLIP_CTRL_GRP = null;
		l_ARV_RSLT_SLIP_CD = null;
		l_ARV_RSLT_SLIP_DATE = null;
		l_PUCH_RSLT_SLIP_ID = null;
		l_TAX_CALC_TYP = null;
		l_TAX_APPLY_TYP = null;
		l_TEMP_UNIT_COST_PUCH_RSLT_FLG = null;
		l_UNIT_COST_ZERO_INSPC_ACPT_FLG = null;
		l_IMPORT_TRN_TYP = null;
		l_PAY_CYCLE_TYP = null;
		l_DEADLINE_DATE = null;
		l_PAY_SCH_DATE = null;
		l_PAY_PATTERN_CD = null;
		l_EXCH_RSRV_CD = null;
		l_EXCH_DATE = null;
		l_PUR_RSLT_SLIP_ISSUE_FLG = null;
		l_PUR_RSLT_REP_ISSUE_FLG = null;
		l_ACPT_ARV_MODIFICATION_FLG = null;
		l_INSPC_ACPT_MODIFICATION_FLG = null;
		l_STATUS = null;
		l_CRCT_FLG = null;
		l_APPROVAL_DATE = null;
		l_APPROVAL_CD = null;
		l_APPROVAL_RSRV_DATE = null;
		l_APPROVAL_RSRV_CD = null;
		l_RSN_CD = null;
		l_RECORDING_DATE = null;
		l_RECORDING_MONTH = null;
		l_ORGN_RECORDING_DATE = null;
		l_ORGN_RECORDING_MONTH = null;
		l_RECORDING_PROC_DATE = null;
		l_RECORDING_PROC_CD = null;
		l_CLOSING_RSRV_DATE = null;
		l_CLOSING_RSRV_CD = null;
		l_CLOSING_DATE = null;
		l_CLOSING_CD = null;
		l_PAY_FIX_DATE = null;
		l_PAY_FIX_CD = null;
		l_DEBT_BALANCE_OUT_FLG = null;
		l_DEBT_BALANCE_OUT_DATE = null;
		l_MONTH = null;
		l_ACCT_CD = null;
		l_SUB_ACCT_CD = null;
		l_ORG_CD = null;
		l_DATA_TYP = null;
		l_GL_IF_OUT_FLG = null;
		l_BALANCE_UPD_FLG = null;
		l_BALANCE_UPD_DATE = null;
		l_RECORDING_AMOUNT = null;
		l_DEBT_AMOUNT = null;
		l_REBATE_AMOUNT = null;
		l_RETURNED_GOODS_AMOUNT = null;
		l_RECORDING_AMOUNT_YEN = null;
		l_DEBT_AMOUNT_YEN = null;
		l_SAVING_AMOUNT_YEN = null;
		l_REBATE_AMOUNT_YEN = null;
		l_RETURNED_GOODS_AMOUNT_YEN = null;
		l_INSPC_ACPT_AMOUNT_YEN = null;
		l_EXCH_DIFF_AMOUNT_YEN = null;
		l_OPTION_ID = null;
		l_OWN_CUR_CD = null;
		l_THIS_MONTH = null;
		l_HOME_DECIMAL_FIG = null;
		l_HOME_CUR_CD = null;
		l_TIME_CTRL = null;

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
	 * medAE0170010クラスの標準コンストラクタ
	 */
	public AE0170010Struct()
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
	public void setStruct(AE0170010Struct struct)
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
	public void setStructM(AE0170010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setc_NON_NO_ITEM_FLG(struct.getc_NON_NO_ITEM_FLG());
			this.setPUCH_ODR_DLV_TIME(struct.getPUCH_ODR_DLV_TIME());
			this.setPUCH_ODR_START_TIME(struct.getPUCH_ODR_START_TIME());
			this.setl_STATUS(struct.getl_STATUS());
			this.setl_ACPT_NO(struct.getl_ACPT_NO());
			this.setl_ACPT_QTY(struct.getl_ACPT_QTY());
			this.setl_ACPT_DATE(struct.getl_ACPT_DATE());
			this.setl_UNIT_COST(struct.getl_UNIT_COST());
			this.setl_UNIT_COST_TYP(struct.getl_UNIT_COST_TYP());
			this.setl_PUCH_ODR_AMOUNT(struct.getl_PUCH_ODR_AMOUNT());
			this.setl_INSPECTED_QTY(struct.getl_INSPECTED_QTY());
			this.setl_ACCEPTED_QTY(struct.getl_ACCEPTED_QTY());
			this.setl_INSPEC_DATE(struct.getl_INSPEC_DATE());
			this.seth_NET_AMOUNT(struct.geth_NET_AMOUNT());
			this.seth_TAX_AMOUNT_1(struct.geth_TAX_AMOUNT_1());
			this.seth_TAX_AMOUNT_2(struct.geth_TAX_AMOUNT_2());
			this.seth_TAX_AMOUNT_3(struct.geth_TAX_AMOUNT_3());
			this.seth_DECIMAL_FIG(struct.geth_DECIMAL_FIG());
			this.seth_ROUND_TYP(struct.geth_ROUND_TYP());
			this.seth_PUCH_ODR_STS_TYP(struct.geth_PUCH_ODR_STS_TYP());
			this.seth_PUCH_ODR_INST_SLIP_ISS_FLG(struct.geth_PUCH_ODR_INST_SLIP_ISS_FLG());
			this.seth_ODR_CANCEL_SLIP_ISS_FLG(struct.geth_ODR_CANCEL_SLIP_ISS_FLG());
			this.seth_INSPC_CMPLT_FLG(struct.geth_INSPC_CMPLT_FLG());
			this.seth_ACPT_INSPC_TYP(struct.geth_ACPT_INSPC_TYP());
			this.seth_NET_AMOUNT_LIST(struct.geth_NET_AMOUNT_LIST());
			this.seth_TAX_AMOUNT_1_LIST(struct.geth_TAX_AMOUNT_1_LIST());
			this.seth_TAX_AMOUNT_2_LIST(struct.geth_TAX_AMOUNT_2_LIST());
			this.seth_TAX_AMOUNT_3_LIST(struct.geth_TAX_AMOUNT_3_LIST());
			this.seth_UPDATE_FLG(struct.geth_UPDATE_FLG());
			this.seth_MODIFY_COUNT(struct.geth_MODIFY_COUNT());
			this.seth_MODIFY_COUNT_LIST(struct.geth_MODIFY_COUNT_LIST());
			this.seth_EXCH_RATE(struct.geth_EXCH_RATE());
			this.seth_EXCH_RATE_LIST(struct.geth_EXCH_RATE_LIST());
			this.seth_TAX_CD(struct.geth_TAX_CD());
			this.seth_PUCH_ODR_CD(struct.geth_PUCH_ODR_CD());
			this.setNON_NO_ITEM_FLG(struct.getNON_NO_ITEM_FLG());
			this.setITEM_CD(struct.getITEM_CD());
			this.setVEND_CD(struct.getVEND_CD());
			this.setPUCH_ODR_DLV_DATE(struct.getPUCH_ODR_DLV_DATE());
			this.setTAX_CD(struct.getTAX_CD());
			this.setPUCH_ODR_START_DATE(struct.getPUCH_ODR_START_DATE());
			this.setPUCH_ODR_QTY(struct.getPUCH_ODR_QTY());
			this.setUNIT_COST_TYP(struct.getUNIT_COST_TYP());
			this.setUNIT_COST(struct.getUNIT_COST());
			this.setACPT_INSPC_TYP(struct.getACPT_INSPC_TYP());
			this.setPUCH_ODR_AMOUNT(struct.getPUCH_ODR_AMOUNT());
			this.setRATE_JUDGE_DATE(struct.getRATE_JUDGE_DATE());
			this.setNET_AMOUNT(struct.getNET_AMOUNT());
			this.setTAX_AMOUNT_1(struct.getTAX_AMOUNT_1());
			this.setTAX_AMOUNT_2(struct.getTAX_AMOUNT_2());
			this.setTAX_AMOUNT_3(struct.getTAX_AMOUNT_3());
			this.setPUCH_ODR_STS_TYP(struct.getPUCH_ODR_STS_TYP());
			this.setPUCH_ODR_INST_SLIP_ISS_FLG(struct.getPUCH_ODR_INST_SLIP_ISS_FLG());
			this.setODR_CANCEL_SLIP_ISS_FLG(struct.getODR_CANCEL_SLIP_ISS_FLG());
			this.setINSPC_CMPLT_FLG(struct.getINSPC_CMPLT_FLG());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setEXCH_RATE(struct.getEXCH_RATE());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setVEND_NAME(struct.getVEND_NAME());
			this.setINSPC_ACPT_APP_TYP(struct.getINSPC_ACPT_APP_TYP());
			this.setCUR_CD(struct.getCUR_CD());
			this.setEXCH_TYP(struct.getEXCH_TYP());
			this.setROUND_TYP(struct.getROUND_TYP());
			this.setCUR_NAME(struct.getCUR_NAME());
			this.setCUR_UNIT(struct.getCUR_UNIT());
			this.setDECIMAL_FIG(struct.getDECIMAL_FIG());
			this.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setACPT_NO(struct.getACPT_NO());
			this.setACPT_QTY(struct.getACPT_QTY());
			this.setACPT_DATE(struct.getACPT_DATE());
			this.setINSPECTED_QTY(struct.getINSPECTED_QTY());
			this.setACCEPTED_QTY(struct.getACCEPTED_QTY());
			this.setINSPEC_DATE(struct.getINSPEC_DATE());
			this.setOLD_TAX_RATE_1(struct.getOLD_TAX_RATE_1());
			this.setOLD_TAX_RATE_2(struct.getOLD_TAX_RATE_2());
			this.setOLD_TAX_RATE_3(struct.getOLD_TAX_RATE_3());
			this.setNEW_TAX_RATE_START_DATE(struct.getNEW_TAX_RATE_START_DATE());
			this.setNEW_TAX_RATE_1(struct.getNEW_TAX_RATE_1());
			this.setNEW_TAX_RATE_2(struct.getNEW_TAX_RATE_2());
			this.setNEW_TAX_RATE_3(struct.getNEW_TAX_RATE_3());
			this.setTAX_RATE_1(struct.getTAX_RATE_1());
			this.setTAX_RATE_2(struct.getTAX_RATE_2());
			this.setTAX_RATE_3(struct.getTAX_RATE_3());
			this.setAMOUNT_INCLUDE_TAX(struct.getAMOUNT_INCLUDE_TAX());
			this.setHOME_CUR_AMOUNT(struct.getHOME_CUR_AMOUNT());
			this.setTAX_ROUND_TYP(struct.getTAX_ROUND_TYP());
			this.setINSPC_ACPT_NO(struct.getINSPC_ACPT_NO());
			this.setINSPC_ACPT_GNR_TYP(struct.getINSPC_ACPT_GNR_TYP());
			this.setCRCT_NO(struct.getCRCT_NO());
			this.setCRCT_TYP(struct.getCRCT_TYP());
			this.setSLIP_TYP(struct.getSLIP_TYP());
			this.setWORK_IN_PROC_CD(struct.getWORK_IN_PROC_CD());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setPROCESSING_COST(struct.getPROCESSING_COST());
			this.setMATERIAL_COST(struct.getMATERIAL_COST());
			this.setOTHER_OVERHEADS(struct.getOTHER_OVERHEADS());
			this.setINSPC_ACPT_QTY(struct.getINSPC_ACPT_QTY());
			this.setINSPC_ACPT_AMOUNT(struct.getINSPC_ACPT_AMOUNT());
			this.setSAVING_AMOUNT(struct.getSAVING_AMOUNT());
			this.setINSPC_ACPT_DATE(struct.getINSPC_ACPT_DATE());
			this.setPRODUCT_TYP(struct.getPRODUCT_TYP());
			this.setDLV_CD(struct.getDLV_CD());
			this.setDISC_AMOUNT(struct.getDISC_AMOUNT());
			this.setGNR_ORG_CD(struct.getGNR_ORG_CD());
			this.setSBCNT_PUCH_TYP(struct.getSBCNT_PUCH_TYP());
			this.setJOB_ODR_DETAIL_NO(struct.getJOB_ODR_DETAIL_NO());
			this.setCLASIFICATION_CD(struct.getCLASIFICATION_CD());
			this.setINV_CTRL_FLG(struct.getINV_CTRL_FLG());
			this.setPUCH_RTN_FLG(struct.getPUCH_RTN_FLG());
			this.setAPPR_FLG(struct.getAPPR_FLG());
			this.setAPPR_ID(struct.getAPPR_ID());
			this.setAPPR_DATE(struct.getAPPR_DATE());
			this.setRESERVE_CAUSE(struct.getRESERVE_CAUSE());
			this.setSLIP_CTRL_GRP(struct.getSLIP_CTRL_GRP());
			this.setSLIP_DATE(struct.getSLIP_DATE());
			this.setSLIP_CD(struct.getSLIP_CD());
			this.setSEQ_NO(struct.getSEQ_NO());
			this.setNET_AMOUNT_YEN(struct.getNET_AMOUNT_YEN());
			this.setAMOUNT(struct.getAMOUNT());
			this.setTAX_TYP(struct.getTAX_TYP());
			this.setTAX_AMOUNT(struct.getTAX_AMOUNT());
			this.setGROSS_AMOUNT(struct.getGROSS_AMOUNT());
			this.setTAX_AMOUNT_YEN(struct.getTAX_AMOUNT_YEN());
			this.setGROSS_AMOUNT_YEN(struct.getGROSS_AMOUNT_YEN());
			this.setSUM_TAX_AMOUNT(struct.getSUM_TAX_AMOUNT());
			this.setSUM_GROSS_AMOUNT(struct.getSUM_GROSS_AMOUNT());
			this.setSUM_NET_AMOUNT(struct.getSUM_NET_AMOUNT());
			this.setTAX_TOTAL(struct.getTAX_TOTAL());
			this.setGROSS_TOTAL(struct.getGROSS_TOTAL());
			this.setNET_TOTAL(struct.getNET_TOTAL());
			this.setLINE_NO(struct.getLINE_NO());
			this.setLINE_TYP(struct.getLINE_TYP());
			this.setTAX_AMOUNT_CTRL_FLG(struct.getTAX_AMOUNT_CTRL_FLG());
			this.setUNIT_COST_YEN(struct.getUNIT_COST_YEN());
			this.setPROCESSING_COST_YEN(struct.getPROCESSING_COST_YEN());
			this.setMATERIAL_COST_YEN(struct.getMATERIAL_COST_YEN());
			this.setOTHER_OVERHEADS_YEN(struct.getOTHER_OVERHEADS_YEN());
			this.setDR_ACCT_CD(struct.getDR_ACCT_CD());
			this.setDR_SUB_ACCT_CD(struct.getDR_SUB_ACCT_CD());
			this.setDR_ORG_CD(struct.getDR_ORG_CD());
			this.setCR_ACCT_CD(struct.getCR_ACCT_CD());
			this.setCR_SUB_ACCT_CD(struct.getCR_SUB_ACCT_CD());
			this.setCR_ORG_CD(struct.getCR_ORG_CD());
			this.setFIXED_ASSETS_CD(struct.getFIXED_ASSETS_CD());
			this.setSUB_FIXED_ASSETS_CD(struct.getSUB_FIXED_ASSETS_CD());
			this.setDETAIL_NO(struct.getDETAIL_NO());
			this.setCOMM_PUCH_ODR_LINE_NO(struct.getCOMM_PUCH_ODR_LINE_NO());
			this.setARV_RSLT_LINE_NO(struct.getARV_RSLT_LINE_NO());
			this.setSTOCK_CTRL_FLG(struct.getSTOCK_CTRL_FLG());
			this.setREMARKS(struct.getREMARKS());
			this.setINSPC_ACPT_CRCT_TYP(struct.getINSPC_ACPT_CRCT_TYP());
			this.setORGN_SLIP_CTRL_GRP(struct.getORGN_SLIP_CTRL_GRP());
			this.setORGN_SLIP_CD(struct.getORGN_SLIP_CD());
			this.setORGN_SLIP_DATE(struct.getORGN_SLIP_DATE());
			this.setSLIP_TRN_CD(struct.getSLIP_TRN_CD());
			this.setSTOCK_CLASS_CD(struct.getSTOCK_CLASS_CD());
			this.setBALANCE_CLASS_CD(struct.getBALANCE_CLASS_CD());
			this.setPUCH_ODR_ORG_CD(struct.getPUCH_ODR_ORG_CD());
			this.setPUCH_ODR_PERSON_CD(struct.getPUCH_ODR_PERSON_CD());
			this.setWH_CD(struct.getWH_CD());
			this.setSHIP_WH_CD(struct.getSHIP_WH_CD());
			this.setPAYEE_CD(struct.getPAYEE_CD());
			this.setSLIP_CTRL_ORG_CD(struct.getSLIP_CTRL_ORG_CD());
			this.setCLOSING_CTRL_ORG_CD(struct.getCLOSING_CTRL_ORG_CD());
			this.setPAY_CALC_CTRL_ORG_CD(struct.getPAY_CALC_CTRL_ORG_CD());
			this.setPAY_FIX_CTRL_ORG_CD(struct.getPAY_FIX_CTRL_ORG_CD());
			this.setEXPL_TYP(struct.getEXPL_TYP());
			this.setEXPL_CD(struct.getEXPL_CD());
			this.setEXPL_NAME(struct.getEXPL_NAME());
			this.setODR_CD(struct.getODR_CD());
			this.setCOMM_PUCH_ODR_SLIP_TYP(struct.getCOMM_PUCH_ODR_SLIP_TYP());
			this.setCOMM_PUCH_ODR_SLIP_CTRL_GRP(struct.getCOMM_PUCH_ODR_SLIP_CTRL_GRP());
			this.setCOMM_PUCH_ODR_SLIP_CD(struct.getCOMM_PUCH_ODR_SLIP_CD());
			this.setCOMM_PUCH_ODR_SLIP_DATE(struct.getCOMM_PUCH_ODR_SLIP_DATE());
			this.setARV_RSLT_SLIP_TYP(struct.getARV_RSLT_SLIP_TYP());
			this.setARV_RSLT_SLIP_CTRL_GRP(struct.getARV_RSLT_SLIP_CTRL_GRP());
			this.setARV_RSLT_SLIP_CD(struct.getARV_RSLT_SLIP_CD());
			this.setARV_RSLT_SLIP_DATE(struct.getARV_RSLT_SLIP_DATE());
			this.setPUCH_RSLT_SLIP_ID(struct.getPUCH_RSLT_SLIP_ID());
			this.setTAX_CALC_TYP(struct.getTAX_CALC_TYP());
			this.setTAX_APPLY_TYP(struct.getTAX_APPLY_TYP());
			this.setTEMP_UNIT_COST_PUCH_RSLT_FLG(struct.getTEMP_UNIT_COST_PUCH_RSLT_FLG());
			this.setUNIT_COST_ZERO_INSPC_ACPT_FLG(struct.getUNIT_COST_ZERO_INSPC_ACPT_FLG());
			this.setIMPORT_TRN_TYP(struct.getIMPORT_TRN_TYP());
			this.setPAY_CYCLE_TYP(struct.getPAY_CYCLE_TYP());
			this.setDEADLINE_DATE(struct.getDEADLINE_DATE());
			this.setPAY_SCH_DATE(struct.getPAY_SCH_DATE());
			this.setPAY_PATTERN_CD(struct.getPAY_PATTERN_CD());
			this.setEXCH_RSRV_CD(struct.getEXCH_RSRV_CD());
			this.setEXCH_DATE(struct.getEXCH_DATE());
			this.setPUR_RSLT_SLIP_ISSUE_FLG(struct.getPUR_RSLT_SLIP_ISSUE_FLG());
			this.setPUR_RSLT_REP_ISSUE_FLG(struct.getPUR_RSLT_REP_ISSUE_FLG());
			this.setACPT_ARV_MODIFICATION_FLG(struct.getACPT_ARV_MODIFICATION_FLG());
			this.setINSPC_ACPT_MODIFICATION_FLG(struct.getINSPC_ACPT_MODIFICATION_FLG());
			this.setSTATUS(struct.getSTATUS());
			this.setCRCT_FLG(struct.getCRCT_FLG());
			this.setAPPROVAL_DATE(struct.getAPPROVAL_DATE());
			this.setAPPROVAL_CD(struct.getAPPROVAL_CD());
			this.setAPPROVAL_RSRV_DATE(struct.getAPPROVAL_RSRV_DATE());
			this.setAPPROVAL_RSRV_CD(struct.getAPPROVAL_RSRV_CD());
			this.setRSN_CD(struct.getRSN_CD());
			this.setRECORDING_DATE(struct.getRECORDING_DATE());
			this.setRECORDING_MONTH(struct.getRECORDING_MONTH());
			this.setORGN_RECORDING_DATE(struct.getORGN_RECORDING_DATE());
			this.setORGN_RECORDING_MONTH(struct.getORGN_RECORDING_MONTH());
			this.setRECORDING_PROC_DATE(struct.getRECORDING_PROC_DATE());
			this.setRECORDING_PROC_CD(struct.getRECORDING_PROC_CD());
			this.setCLOSING_RSRV_DATE(struct.getCLOSING_RSRV_DATE());
			this.setCLOSING_RSRV_CD(struct.getCLOSING_RSRV_CD());
			this.setCLOSING_DATE(struct.getCLOSING_DATE());
			this.setCLOSING_CD(struct.getCLOSING_CD());
			this.setPAY_FIX_DATE(struct.getPAY_FIX_DATE());
			this.setPAY_FIX_CD(struct.getPAY_FIX_CD());
			this.setDEBT_BALANCE_OUT_FLG(struct.getDEBT_BALANCE_OUT_FLG());
			this.setDEBT_BALANCE_OUT_DATE(struct.getDEBT_BALANCE_OUT_DATE());
			this.setMONTH(struct.getMONTH());
			this.setACCT_CD(struct.getACCT_CD());
			this.setSUB_ACCT_CD(struct.getSUB_ACCT_CD());
			this.setORG_CD(struct.getORG_CD());
			this.setDATA_TYP(struct.getDATA_TYP());
			this.setGL_IF_OUT_FLG(struct.getGL_IF_OUT_FLG());
			this.setBALANCE_UPD_FLG(struct.getBALANCE_UPD_FLG());
			this.setBALANCE_UPD_DATE(struct.getBALANCE_UPD_DATE());
			this.setRECORDING_AMOUNT(struct.getRECORDING_AMOUNT());
			this.setDEBT_AMOUNT(struct.getDEBT_AMOUNT());
			this.setREBATE_AMOUNT(struct.getREBATE_AMOUNT());
			this.setRETURNED_GOODS_AMOUNT(struct.getRETURNED_GOODS_AMOUNT());
			this.setRECORDING_AMOUNT_YEN(struct.getRECORDING_AMOUNT_YEN());
			this.setDEBT_AMOUNT_YEN(struct.getDEBT_AMOUNT_YEN());
			this.setSAVING_AMOUNT_YEN(struct.getSAVING_AMOUNT_YEN());
			this.setREBATE_AMOUNT_YEN(struct.getREBATE_AMOUNT_YEN());
			this.setRETURNED_GOODS_AMOUNT_YEN(struct.getRETURNED_GOODS_AMOUNT_YEN());
			this.setINSPC_ACPT_AMOUNT_YEN(struct.getINSPC_ACPT_AMOUNT_YEN());
			this.setEXCH_DIFF_AMOUNT_YEN(struct.getEXCH_DIFF_AMOUNT_YEN());
			this.setOPTION_ID(struct.getOPTION_ID());
			this.setOWN_CUR_CD(struct.getOWN_CUR_CD());
			this.setTHIS_MONTH(struct.getTHIS_MONTH());
			this.setHOME_DECIMAL_FIG(struct.getHOME_DECIMAL_FIG());
			this.setHOME_CUR_CD(struct.getHOME_CUR_CD());
			this.setTIME_CTRL(struct.getTIME_CTRL());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AE0170010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_c_NON_NO_ITEM_FLG(struct.getList_c_NON_NO_ITEM_FLG());
			this.setList_PUCH_ODR_DLV_TIME(struct.getList_PUCH_ODR_DLV_TIME());
			this.setList_PUCH_ODR_START_TIME(struct.getList_PUCH_ODR_START_TIME());
			this.setList_l_STATUS(struct.getList_l_STATUS());
			this.setList_l_ACPT_NO(struct.getList_l_ACPT_NO());
			this.setList_l_ACPT_QTY(struct.getList_l_ACPT_QTY());
			this.setList_l_ACPT_DATE(struct.getList_l_ACPT_DATE());
			this.setList_l_UNIT_COST(struct.getList_l_UNIT_COST());
			this.setList_l_UNIT_COST_TYP(struct.getList_l_UNIT_COST_TYP());
			this.setList_l_PUCH_ODR_AMOUNT(struct.getList_l_PUCH_ODR_AMOUNT());
			this.setList_l_INSPECTED_QTY(struct.getList_l_INSPECTED_QTY());
			this.setList_l_ACCEPTED_QTY(struct.getList_l_ACCEPTED_QTY());
			this.setList_l_INSPEC_DATE(struct.getList_l_INSPEC_DATE());
			this.setList_h_NET_AMOUNT(struct.getList_h_NET_AMOUNT());
			this.setList_h_TAX_AMOUNT_1(struct.getList_h_TAX_AMOUNT_1());
			this.setList_h_TAX_AMOUNT_2(struct.getList_h_TAX_AMOUNT_2());
			this.setList_h_TAX_AMOUNT_3(struct.getList_h_TAX_AMOUNT_3());
			this.setList_h_DECIMAL_FIG(struct.getList_h_DECIMAL_FIG());
			this.setList_h_ROUND_TYP(struct.getList_h_ROUND_TYP());
			this.setList_h_PUCH_ODR_STS_TYP(struct.getList_h_PUCH_ODR_STS_TYP());
			this.setList_h_PUCH_ODR_INST_SLIP_ISS_FLG(struct.getList_h_PUCH_ODR_INST_SLIP_ISS_FLG());
			this.setList_h_ODR_CANCEL_SLIP_ISS_FLG(struct.getList_h_ODR_CANCEL_SLIP_ISS_FLG());
			this.setList_h_INSPC_CMPLT_FLG(struct.getList_h_INSPC_CMPLT_FLG());
			this.setList_h_ACPT_INSPC_TYP(struct.getList_h_ACPT_INSPC_TYP());
			this.setList_h_NET_AMOUNT_LIST(struct.getList_h_NET_AMOUNT_LIST());
			this.setList_h_TAX_AMOUNT_1_LIST(struct.getList_h_TAX_AMOUNT_1_LIST());
			this.setList_h_TAX_AMOUNT_2_LIST(struct.getList_h_TAX_AMOUNT_2_LIST());
			this.setList_h_TAX_AMOUNT_3_LIST(struct.getList_h_TAX_AMOUNT_3_LIST());
			this.setList_h_UPDATE_FLG(struct.getList_h_UPDATE_FLG());
			this.setList_h_MODIFY_COUNT(struct.getList_h_MODIFY_COUNT());
			this.setList_h_MODIFY_COUNT_LIST(struct.getList_h_MODIFY_COUNT_LIST());
			this.setList_h_EXCH_RATE(struct.getList_h_EXCH_RATE());
			this.setList_h_EXCH_RATE_LIST(struct.getList_h_EXCH_RATE_LIST());
			this.setList_h_TAX_CD(struct.getList_h_TAX_CD());
			this.setList_h_PUCH_ODR_CD(struct.getList_h_PUCH_ODR_CD());
			this.setList_NON_NO_ITEM_FLG(struct.getList_NON_NO_ITEM_FLG());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_PUCH_ODR_DLV_DATE(struct.getList_PUCH_ODR_DLV_DATE());
			this.setList_TAX_CD(struct.getList_TAX_CD());
			this.setList_PUCH_ODR_START_DATE(struct.getList_PUCH_ODR_START_DATE());
			this.setList_PUCH_ODR_QTY(struct.getList_PUCH_ODR_QTY());
			this.setList_UNIT_COST_TYP(struct.getList_UNIT_COST_TYP());
			this.setList_UNIT_COST(struct.getList_UNIT_COST());
			this.setList_ACPT_INSPC_TYP(struct.getList_ACPT_INSPC_TYP());
			this.setList_PUCH_ODR_AMOUNT(struct.getList_PUCH_ODR_AMOUNT());
			this.setList_RATE_JUDGE_DATE(struct.getList_RATE_JUDGE_DATE());
			this.setList_NET_AMOUNT(struct.getList_NET_AMOUNT());
			this.setList_TAX_AMOUNT_1(struct.getList_TAX_AMOUNT_1());
			this.setList_TAX_AMOUNT_2(struct.getList_TAX_AMOUNT_2());
			this.setList_TAX_AMOUNT_3(struct.getList_TAX_AMOUNT_3());
			this.setList_PUCH_ODR_STS_TYP(struct.getList_PUCH_ODR_STS_TYP());
			this.setList_PUCH_ODR_INST_SLIP_ISS_FLG(struct.getList_PUCH_ODR_INST_SLIP_ISS_FLG());
			this.setList_ODR_CANCEL_SLIP_ISS_FLG(struct.getList_ODR_CANCEL_SLIP_ISS_FLG());
			this.setList_INSPC_CMPLT_FLG(struct.getList_INSPC_CMPLT_FLG());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_EXCH_RATE(struct.getList_EXCH_RATE());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_VEND_NAME(struct.getList_VEND_NAME());
			this.setList_INSPC_ACPT_APP_TYP(struct.getList_INSPC_ACPT_APP_TYP());
			this.setList_CUR_CD(struct.getList_CUR_CD());
			this.setList_EXCH_TYP(struct.getList_EXCH_TYP());
			this.setList_ROUND_TYP(struct.getList_ROUND_TYP());
			this.setList_CUR_NAME(struct.getList_CUR_NAME());
			this.setList_CUR_UNIT(struct.getList_CUR_UNIT());
			this.setList_DECIMAL_FIG(struct.getList_DECIMAL_FIG());
			this.setList_PUCH_ODR_CD(struct.getList_PUCH_ODR_CD());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_ACPT_NO(struct.getList_ACPT_NO());
			this.setList_ACPT_QTY(struct.getList_ACPT_QTY());
			this.setList_ACPT_DATE(struct.getList_ACPT_DATE());
			this.setList_INSPECTED_QTY(struct.getList_INSPECTED_QTY());
			this.setList_ACCEPTED_QTY(struct.getList_ACCEPTED_QTY());
			this.setList_INSPEC_DATE(struct.getList_INSPEC_DATE());
			this.setList_OLD_TAX_RATE_1(struct.getList_OLD_TAX_RATE_1());
			this.setList_OLD_TAX_RATE_2(struct.getList_OLD_TAX_RATE_2());
			this.setList_OLD_TAX_RATE_3(struct.getList_OLD_TAX_RATE_3());
			this.setList_NEW_TAX_RATE_START_DATE(struct.getList_NEW_TAX_RATE_START_DATE());
			this.setList_NEW_TAX_RATE_1(struct.getList_NEW_TAX_RATE_1());
			this.setList_NEW_TAX_RATE_2(struct.getList_NEW_TAX_RATE_2());
			this.setList_NEW_TAX_RATE_3(struct.getList_NEW_TAX_RATE_3());
			this.setList_TAX_RATE_1(struct.getList_TAX_RATE_1());
			this.setList_TAX_RATE_2(struct.getList_TAX_RATE_2());
			this.setList_TAX_RATE_3(struct.getList_TAX_RATE_3());
			this.setList_AMOUNT_INCLUDE_TAX(struct.getList_AMOUNT_INCLUDE_TAX());
			this.setList_HOME_CUR_AMOUNT(struct.getList_HOME_CUR_AMOUNT());
			this.setList_TAX_ROUND_TYP(struct.getList_TAX_ROUND_TYP());
			this.setList_INSPC_ACPT_NO(struct.getList_INSPC_ACPT_NO());
			this.setList_INSPC_ACPT_GNR_TYP(struct.getList_INSPC_ACPT_GNR_TYP());
			this.setList_CRCT_NO(struct.getList_CRCT_NO());
			this.setList_CRCT_TYP(struct.getList_CRCT_TYP());
			this.setList_SLIP_TYP(struct.getList_SLIP_TYP());
			this.setList_WORK_IN_PROC_CD(struct.getList_WORK_IN_PROC_CD());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_PROCESSING_COST(struct.getList_PROCESSING_COST());
			this.setList_MATERIAL_COST(struct.getList_MATERIAL_COST());
			this.setList_OTHER_OVERHEADS(struct.getList_OTHER_OVERHEADS());
			this.setList_INSPC_ACPT_QTY(struct.getList_INSPC_ACPT_QTY());
			this.setList_INSPC_ACPT_AMOUNT(struct.getList_INSPC_ACPT_AMOUNT());
			this.setList_SAVING_AMOUNT(struct.getList_SAVING_AMOUNT());
			this.setList_INSPC_ACPT_DATE(struct.getList_INSPC_ACPT_DATE());
			this.setList_PRODUCT_TYP(struct.getList_PRODUCT_TYP());
			this.setList_DLV_CD(struct.getList_DLV_CD());
			this.setList_DISC_AMOUNT(struct.getList_DISC_AMOUNT());
			this.setList_GNR_ORG_CD(struct.getList_GNR_ORG_CD());
			this.setList_SBCNT_PUCH_TYP(struct.getList_SBCNT_PUCH_TYP());
			this.setList_JOB_ODR_DETAIL_NO(struct.getList_JOB_ODR_DETAIL_NO());
			this.setList_CLASIFICATION_CD(struct.getList_CLASIFICATION_CD());
			this.setList_INV_CTRL_FLG(struct.getList_INV_CTRL_FLG());
			this.setList_PUCH_RTN_FLG(struct.getList_PUCH_RTN_FLG());
			this.setList_APPR_FLG(struct.getList_APPR_FLG());
			this.setList_APPR_ID(struct.getList_APPR_ID());
			this.setList_APPR_DATE(struct.getList_APPR_DATE());
			this.setList_RESERVE_CAUSE(struct.getList_RESERVE_CAUSE());
			this.setList_SLIP_CTRL_GRP(struct.getList_SLIP_CTRL_GRP());
			this.setList_SLIP_DATE(struct.getList_SLIP_DATE());
			this.setList_SLIP_CD(struct.getList_SLIP_CD());
			this.setList_SEQ_NO(struct.getList_SEQ_NO());
			this.setList_NET_AMOUNT_YEN(struct.getList_NET_AMOUNT_YEN());
			this.setList_AMOUNT(struct.getList_AMOUNT());
			this.setList_TAX_TYP(struct.getList_TAX_TYP());
			this.setList_TAX_AMOUNT(struct.getList_TAX_AMOUNT());
			this.setList_GROSS_AMOUNT(struct.getList_GROSS_AMOUNT());
			this.setList_TAX_AMOUNT_YEN(struct.getList_TAX_AMOUNT_YEN());
			this.setList_GROSS_AMOUNT_YEN(struct.getList_GROSS_AMOUNT_YEN());
			this.setList_SUM_TAX_AMOUNT(struct.getList_SUM_TAX_AMOUNT());
			this.setList_SUM_GROSS_AMOUNT(struct.getList_SUM_GROSS_AMOUNT());
			this.setList_SUM_NET_AMOUNT(struct.getList_SUM_NET_AMOUNT());
			this.setList_TAX_TOTAL(struct.getList_TAX_TOTAL());
			this.setList_GROSS_TOTAL(struct.getList_GROSS_TOTAL());
			this.setList_NET_TOTAL(struct.getList_NET_TOTAL());
			this.setList_LINE_NO(struct.getList_LINE_NO());
			this.setList_LINE_TYP(struct.getList_LINE_TYP());
			this.setList_TAX_AMOUNT_CTRL_FLG(struct.getList_TAX_AMOUNT_CTRL_FLG());
			this.setList_UNIT_COST_YEN(struct.getList_UNIT_COST_YEN());
			this.setList_PROCESSING_COST_YEN(struct.getList_PROCESSING_COST_YEN());
			this.setList_MATERIAL_COST_YEN(struct.getList_MATERIAL_COST_YEN());
			this.setList_OTHER_OVERHEADS_YEN(struct.getList_OTHER_OVERHEADS_YEN());
			this.setList_DR_ACCT_CD(struct.getList_DR_ACCT_CD());
			this.setList_DR_SUB_ACCT_CD(struct.getList_DR_SUB_ACCT_CD());
			this.setList_DR_ORG_CD(struct.getList_DR_ORG_CD());
			this.setList_CR_ACCT_CD(struct.getList_CR_ACCT_CD());
			this.setList_CR_SUB_ACCT_CD(struct.getList_CR_SUB_ACCT_CD());
			this.setList_CR_ORG_CD(struct.getList_CR_ORG_CD());
			this.setList_FIXED_ASSETS_CD(struct.getList_FIXED_ASSETS_CD());
			this.setList_SUB_FIXED_ASSETS_CD(struct.getList_SUB_FIXED_ASSETS_CD());
			this.setList_DETAIL_NO(struct.getList_DETAIL_NO());
			this.setList_COMM_PUCH_ODR_LINE_NO(struct.getList_COMM_PUCH_ODR_LINE_NO());
			this.setList_ARV_RSLT_LINE_NO(struct.getList_ARV_RSLT_LINE_NO());
			this.setList_STOCK_CTRL_FLG(struct.getList_STOCK_CTRL_FLG());
			this.setList_REMARKS(struct.getList_REMARKS());
			this.setList_INSPC_ACPT_CRCT_TYP(struct.getList_INSPC_ACPT_CRCT_TYP());
			this.setList_ORGN_SLIP_CTRL_GRP(struct.getList_ORGN_SLIP_CTRL_GRP());
			this.setList_ORGN_SLIP_CD(struct.getList_ORGN_SLIP_CD());
			this.setList_ORGN_SLIP_DATE(struct.getList_ORGN_SLIP_DATE());
			this.setList_SLIP_TRN_CD(struct.getList_SLIP_TRN_CD());
			this.setList_STOCK_CLASS_CD(struct.getList_STOCK_CLASS_CD());
			this.setList_BALANCE_CLASS_CD(struct.getList_BALANCE_CLASS_CD());
			this.setList_PUCH_ODR_ORG_CD(struct.getList_PUCH_ODR_ORG_CD());
			this.setList_PUCH_ODR_PERSON_CD(struct.getList_PUCH_ODR_PERSON_CD());
			this.setList_WH_CD(struct.getList_WH_CD());
			this.setList_SHIP_WH_CD(struct.getList_SHIP_WH_CD());
			this.setList_PAYEE_CD(struct.getList_PAYEE_CD());
			this.setList_SLIP_CTRL_ORG_CD(struct.getList_SLIP_CTRL_ORG_CD());
			this.setList_CLOSING_CTRL_ORG_CD(struct.getList_CLOSING_CTRL_ORG_CD());
			this.setList_PAY_CALC_CTRL_ORG_CD(struct.getList_PAY_CALC_CTRL_ORG_CD());
			this.setList_PAY_FIX_CTRL_ORG_CD(struct.getList_PAY_FIX_CTRL_ORG_CD());
			this.setList_EXPL_TYP(struct.getList_EXPL_TYP());
			this.setList_EXPL_CD(struct.getList_EXPL_CD());
			this.setList_EXPL_NAME(struct.getList_EXPL_NAME());
			this.setList_ODR_CD(struct.getList_ODR_CD());
			this.setList_COMM_PUCH_ODR_SLIP_TYP(struct.getList_COMM_PUCH_ODR_SLIP_TYP());
			this.setList_COMM_PUCH_ODR_SLIP_CTRL_GRP(struct.getList_COMM_PUCH_ODR_SLIP_CTRL_GRP());
			this.setList_COMM_PUCH_ODR_SLIP_CD(struct.getList_COMM_PUCH_ODR_SLIP_CD());
			this.setList_COMM_PUCH_ODR_SLIP_DATE(struct.getList_COMM_PUCH_ODR_SLIP_DATE());
			this.setList_ARV_RSLT_SLIP_TYP(struct.getList_ARV_RSLT_SLIP_TYP());
			this.setList_ARV_RSLT_SLIP_CTRL_GRP(struct.getList_ARV_RSLT_SLIP_CTRL_GRP());
			this.setList_ARV_RSLT_SLIP_CD(struct.getList_ARV_RSLT_SLIP_CD());
			this.setList_ARV_RSLT_SLIP_DATE(struct.getList_ARV_RSLT_SLIP_DATE());
			this.setList_PUCH_RSLT_SLIP_ID(struct.getList_PUCH_RSLT_SLIP_ID());
			this.setList_TAX_CALC_TYP(struct.getList_TAX_CALC_TYP());
			this.setList_TAX_APPLY_TYP(struct.getList_TAX_APPLY_TYP());
			this.setList_TEMP_UNIT_COST_PUCH_RSLT_FLG(struct.getList_TEMP_UNIT_COST_PUCH_RSLT_FLG());
			this.setList_UNIT_COST_ZERO_INSPC_ACPT_FLG(struct.getList_UNIT_COST_ZERO_INSPC_ACPT_FLG());
			this.setList_IMPORT_TRN_TYP(struct.getList_IMPORT_TRN_TYP());
			this.setList_PAY_CYCLE_TYP(struct.getList_PAY_CYCLE_TYP());
			this.setList_DEADLINE_DATE(struct.getList_DEADLINE_DATE());
			this.setList_PAY_SCH_DATE(struct.getList_PAY_SCH_DATE());
			this.setList_PAY_PATTERN_CD(struct.getList_PAY_PATTERN_CD());
			this.setList_EXCH_RSRV_CD(struct.getList_EXCH_RSRV_CD());
			this.setList_EXCH_DATE(struct.getList_EXCH_DATE());
			this.setList_PUR_RSLT_SLIP_ISSUE_FLG(struct.getList_PUR_RSLT_SLIP_ISSUE_FLG());
			this.setList_PUR_RSLT_REP_ISSUE_FLG(struct.getList_PUR_RSLT_REP_ISSUE_FLG());
			this.setList_ACPT_ARV_MODIFICATION_FLG(struct.getList_ACPT_ARV_MODIFICATION_FLG());
			this.setList_INSPC_ACPT_MODIFICATION_FLG(struct.getList_INSPC_ACPT_MODIFICATION_FLG());
			this.setList_STATUS(struct.getList_STATUS());
			this.setList_CRCT_FLG(struct.getList_CRCT_FLG());
			this.setList_APPROVAL_DATE(struct.getList_APPROVAL_DATE());
			this.setList_APPROVAL_CD(struct.getList_APPROVAL_CD());
			this.setList_APPROVAL_RSRV_DATE(struct.getList_APPROVAL_RSRV_DATE());
			this.setList_APPROVAL_RSRV_CD(struct.getList_APPROVAL_RSRV_CD());
			this.setList_RSN_CD(struct.getList_RSN_CD());
			this.setList_RECORDING_DATE(struct.getList_RECORDING_DATE());
			this.setList_RECORDING_MONTH(struct.getList_RECORDING_MONTH());
			this.setList_ORGN_RECORDING_DATE(struct.getList_ORGN_RECORDING_DATE());
			this.setList_ORGN_RECORDING_MONTH(struct.getList_ORGN_RECORDING_MONTH());
			this.setList_RECORDING_PROC_DATE(struct.getList_RECORDING_PROC_DATE());
			this.setList_RECORDING_PROC_CD(struct.getList_RECORDING_PROC_CD());
			this.setList_CLOSING_RSRV_DATE(struct.getList_CLOSING_RSRV_DATE());
			this.setList_CLOSING_RSRV_CD(struct.getList_CLOSING_RSRV_CD());
			this.setList_CLOSING_DATE(struct.getList_CLOSING_DATE());
			this.setList_CLOSING_CD(struct.getList_CLOSING_CD());
			this.setList_PAY_FIX_DATE(struct.getList_PAY_FIX_DATE());
			this.setList_PAY_FIX_CD(struct.getList_PAY_FIX_CD());
			this.setList_DEBT_BALANCE_OUT_FLG(struct.getList_DEBT_BALANCE_OUT_FLG());
			this.setList_DEBT_BALANCE_OUT_DATE(struct.getList_DEBT_BALANCE_OUT_DATE());
			this.setList_MONTH(struct.getList_MONTH());
			this.setList_ACCT_CD(struct.getList_ACCT_CD());
			this.setList_SUB_ACCT_CD(struct.getList_SUB_ACCT_CD());
			this.setList_ORG_CD(struct.getList_ORG_CD());
			this.setList_DATA_TYP(struct.getList_DATA_TYP());
			this.setList_GL_IF_OUT_FLG(struct.getList_GL_IF_OUT_FLG());
			this.setList_BALANCE_UPD_FLG(struct.getList_BALANCE_UPD_FLG());
			this.setList_BALANCE_UPD_DATE(struct.getList_BALANCE_UPD_DATE());
			this.setList_RECORDING_AMOUNT(struct.getList_RECORDING_AMOUNT());
			this.setList_DEBT_AMOUNT(struct.getList_DEBT_AMOUNT());
			this.setList_REBATE_AMOUNT(struct.getList_REBATE_AMOUNT());
			this.setList_RETURNED_GOODS_AMOUNT(struct.getList_RETURNED_GOODS_AMOUNT());
			this.setList_RECORDING_AMOUNT_YEN(struct.getList_RECORDING_AMOUNT_YEN());
			this.setList_DEBT_AMOUNT_YEN(struct.getList_DEBT_AMOUNT_YEN());
			this.setList_SAVING_AMOUNT_YEN(struct.getList_SAVING_AMOUNT_YEN());
			this.setList_REBATE_AMOUNT_YEN(struct.getList_REBATE_AMOUNT_YEN());
			this.setList_RETURNED_GOODS_AMOUNT_YEN(struct.getList_RETURNED_GOODS_AMOUNT_YEN());
			this.setList_INSPC_ACPT_AMOUNT_YEN(struct.getList_INSPC_ACPT_AMOUNT_YEN());
			this.setList_EXCH_DIFF_AMOUNT_YEN(struct.getList_EXCH_DIFF_AMOUNT_YEN());
			this.setList_OPTION_ID(struct.getList_OPTION_ID());
			this.setList_OWN_CUR_CD(struct.getList_OWN_CUR_CD());
			this.setList_THIS_MONTH(struct.getList_THIS_MONTH());
			this.setList_HOME_DECIMAL_FIG(struct.getList_HOME_DECIMAL_FIG());
			this.setList_HOME_CUR_CD(struct.getList_HOME_CUR_CD());
			this.setList_TIME_CTRL(struct.getList_TIME_CTRL());
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
	// 第 1 変数初期値： i_c_NON_NO_ITEM_FLG


	final static String i_c_NON_NO_ITEM_FLG = null;

	// 第 2 変数初期値： i_PUCH_ODR_DLV_TIME


	final static String i_PUCH_ODR_DLV_TIME = null;

	// 第 3 変数初期値： i_PUCH_ODR_START_TIME


	final static String i_PUCH_ODR_START_TIME = null;

	// 第 4 変数初期値： i_l_STATUS


	final static String i_l_STATUS = null;

	// 第 5 変数初期値： i_l_ACPT_NO


	final static String i_l_ACPT_NO = null;

	// 第 6 変数初期値： i_l_ACPT_QTY


	final static String i_l_ACPT_QTY = null;

	// 第 7 変数初期値： i_l_ACPT_DATE


	final static String i_l_ACPT_DATE = null;

	// 第 8 変数初期値： i_l_UNIT_COST


	final static String i_l_UNIT_COST = null;

	// 第 9 変数初期値： i_l_UNIT_COST_TYP


	final static String i_l_UNIT_COST_TYP = null;

	// 第 10 変数初期値： i_l_PUCH_ODR_AMOUNT


	final static String i_l_PUCH_ODR_AMOUNT = null;

	// 第 11 変数初期値： i_l_INSPECTED_QTY


	final static String i_l_INSPECTED_QTY = null;

	// 第 12 変数初期値： i_l_ACCEPTED_QTY


	final static String i_l_ACCEPTED_QTY = null;

	// 第 13 変数初期値： i_l_INSPEC_DATE


	final static String i_l_INSPEC_DATE = null;

	// 第 14 変数初期値： i_h_NET_AMOUNT


	final static String i_h_NET_AMOUNT = null;

	// 第 15 変数初期値： i_h_TAX_AMOUNT_1


	final static String i_h_TAX_AMOUNT_1 = null;

	// 第 16 変数初期値： i_h_TAX_AMOUNT_2


	final static String i_h_TAX_AMOUNT_2 = null;

	// 第 17 変数初期値： i_h_TAX_AMOUNT_3


	final static String i_h_TAX_AMOUNT_3 = null;

	// 第 18 変数初期値： i_h_DECIMAL_FIG


	final static String i_h_DECIMAL_FIG = null;

	// 第 19 変数初期値： i_h_ROUND_TYP


	final static String i_h_ROUND_TYP = null;

	// 第 20 変数初期値： i_h_PUCH_ODR_STS_TYP


	final static String i_h_PUCH_ODR_STS_TYP = null;

	// 第 21 変数初期値： i_h_PUCH_ODR_INST_SLIP_ISS_FLG


	final static String i_h_PUCH_ODR_INST_SLIP_ISS_FLG = null;

	// 第 22 変数初期値： i_h_ODR_CANCEL_SLIP_ISS_FLG


	final static String i_h_ODR_CANCEL_SLIP_ISS_FLG = null;

	// 第 23 変数初期値： i_h_INSPC_CMPLT_FLG


	final static String i_h_INSPC_CMPLT_FLG = null;

	// 第 24 変数初期値： i_h_ACPT_INSPC_TYP


	final static String i_h_ACPT_INSPC_TYP = null;

	// 第 25 変数初期値： i_h_NET_AMOUNT_LIST


	final static String i_h_NET_AMOUNT_LIST = null;

	// 第 26 変数初期値： i_h_TAX_AMOUNT_1_LIST


	final static String i_h_TAX_AMOUNT_1_LIST = null;

	// 第 27 変数初期値： i_h_TAX_AMOUNT_2_LIST


	final static String i_h_TAX_AMOUNT_2_LIST = null;

	// 第 28 変数初期値： i_h_TAX_AMOUNT_3_LIST


	final static String i_h_TAX_AMOUNT_3_LIST = null;

	// 第 29 変数初期値： i_h_UPDATE_FLG


	final static String i_h_UPDATE_FLG = null;

	// 第 30 変数初期値： i_h_MODIFY_COUNT


	final static String i_h_MODIFY_COUNT = null;

	// 第 31 変数初期値： i_h_MODIFY_COUNT_LIST


	final static String i_h_MODIFY_COUNT_LIST = null;

	// 第 32 変数初期値： i_h_EXCH_RATE


	final static String i_h_EXCH_RATE = null;

	// 第 33 変数初期値： i_h_EXCH_RATE_LIST


	final static String i_h_EXCH_RATE_LIST = null;

	// 第 34 変数初期値： i_h_TAX_CD


	final static String i_h_TAX_CD = null;

	// 第 35 変数初期値： i_h_PUCH_ODR_CD


	final static String i_h_PUCH_ODR_CD = null;

	// 第 36 変数初期値： i_NON_NO_ITEM_FLG


	final static String i_NON_NO_ITEM_FLG = null;

	// 第 37 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 38 変数初期値： i_VEND_CD


	final static String i_VEND_CD = null;

	// 第 39 変数初期値： i_PUCH_ODR_DLV_DATE


	final static String i_PUCH_ODR_DLV_DATE = null;

	// 第 40 変数初期値： i_TAX_CD


	final static String i_TAX_CD = null;

	// 第 41 変数初期値： i_PUCH_ODR_START_DATE


	final static String i_PUCH_ODR_START_DATE = null;

	// 第 42 変数初期値： i_PUCH_ODR_QTY


	final static String i_PUCH_ODR_QTY = null;

	// 第 43 変数初期値： i_UNIT_COST_TYP


	final static String i_UNIT_COST_TYP = null;

	// 第 44 変数初期値： i_UNIT_COST


	final static String i_UNIT_COST = null;

	// 第 45 変数初期値： i_ACPT_INSPC_TYP


	final static String i_ACPT_INSPC_TYP = null;

	// 第 46 変数初期値： i_PUCH_ODR_AMOUNT


	final static String i_PUCH_ODR_AMOUNT = null;

	// 第 47 変数初期値： i_RATE_JUDGE_DATE


	final static String i_RATE_JUDGE_DATE = null;

	// 第 48 変数初期値： i_NET_AMOUNT


	final static String i_NET_AMOUNT = null;

	// 第 49 変数初期値： i_TAX_AMOUNT_1


	final static String i_TAX_AMOUNT_1 = null;

	// 第 50 変数初期値： i_TAX_AMOUNT_2


	final static String i_TAX_AMOUNT_2 = null;

	// 第 51 変数初期値： i_TAX_AMOUNT_3


	final static String i_TAX_AMOUNT_3 = null;

	// 第 52 変数初期値： i_PUCH_ODR_STS_TYP


	final static String i_PUCH_ODR_STS_TYP = null;

	// 第 53 変数初期値： i_PUCH_ODR_INST_SLIP_ISS_FLG


	final static String i_PUCH_ODR_INST_SLIP_ISS_FLG = null;

	// 第 54 変数初期値： i_ODR_CANCEL_SLIP_ISS_FLG


	final static String i_ODR_CANCEL_SLIP_ISS_FLG = null;

	// 第 55 変数初期値： i_INSPC_CMPLT_FLG


	final static String i_INSPC_CMPLT_FLG = null;

	// 第 56 変数初期値： i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// 第 57 変数初期値： i_EXCH_RATE


	final static String i_EXCH_RATE = null;

	// 第 58 変数初期値： i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// 第 59 変数初期値： i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// 第 60 変数初期値： i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// 第 61 変数初期値： i_VEND_NAME


	final static String i_VEND_NAME = null;

	// 第 62 変数初期値： i_INSPC_ACPT_APP_TYP


	final static String i_INSPC_ACPT_APP_TYP = null;

	// 第 63 変数初期値： i_CUR_CD


	final static String i_CUR_CD = null;

	// 第 64 変数初期値： i_EXCH_TYP


	final static String i_EXCH_TYP = null;

	// 第 65 変数初期値： i_ROUND_TYP


	final static String i_ROUND_TYP = null;

	// 第 66 変数初期値： i_CUR_NAME


	final static String i_CUR_NAME = null;

	// 第 67 変数初期値： i_CUR_UNIT


	final static String i_CUR_UNIT = null;

	// 第 68 変数初期値： i_DECIMAL_FIG


	final static String i_DECIMAL_FIG = null;

	// 第 69 変数初期値： i_PUCH_ODR_CD


	final static String i_PUCH_ODR_CD = null;

	// 第 70 変数初期値： i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// 第 71 変数初期値： i_ACPT_NO


	final static String i_ACPT_NO = null;

	// 第 72 変数初期値： i_ACPT_QTY


	final static String i_ACPT_QTY = null;

	// 第 73 変数初期値： i_ACPT_DATE


	final static String i_ACPT_DATE = null;

	// 第 74 変数初期値： i_INSPECTED_QTY


	final static String i_INSPECTED_QTY = null;

	// 第 75 変数初期値： i_ACCEPTED_QTY


	final static String i_ACCEPTED_QTY = null;

	// 第 76 変数初期値： i_INSPEC_DATE


	final static String i_INSPEC_DATE = null;

	// 第 77 変数初期値： i_OLD_TAX_RATE_1


	final static String i_OLD_TAX_RATE_1 = null;

	// 第 78 変数初期値： i_OLD_TAX_RATE_2


	final static String i_OLD_TAX_RATE_2 = null;

	// 第 79 変数初期値： i_OLD_TAX_RATE_3


	final static String i_OLD_TAX_RATE_3 = null;

	// 第 80 変数初期値： i_NEW_TAX_RATE_START_DATE


	final static String i_NEW_TAX_RATE_START_DATE = null;

	// 第 81 変数初期値： i_NEW_TAX_RATE_1


	final static String i_NEW_TAX_RATE_1 = null;

	// 第 82 変数初期値： i_NEW_TAX_RATE_2


	final static String i_NEW_TAX_RATE_2 = null;

	// 第 83 変数初期値： i_NEW_TAX_RATE_3


	final static String i_NEW_TAX_RATE_3 = null;

	// 第 84 変数初期値： i_TAX_RATE_1


	final static String i_TAX_RATE_1 = null;

	// 第 85 変数初期値： i_TAX_RATE_2


	final static String i_TAX_RATE_2 = null;

	// 第 86 変数初期値： i_TAX_RATE_3


	final static String i_TAX_RATE_3 = null;

	// 第 87 変数初期値： i_AMOUNT_INCLUDE_TAX


	final static String i_AMOUNT_INCLUDE_TAX = null;

	// 第 88 変数初期値： i_HOME_CUR_AMOUNT


	final static String i_HOME_CUR_AMOUNT = null;

	// 第 89 変数初期値： i_TAX_ROUND_TYP


	final static String i_TAX_ROUND_TYP = null;

	// 第 90 変数初期値： i_INSPC_ACPT_NO


	final static String i_INSPC_ACPT_NO = null;

	// 第 91 変数初期値： i_INSPC_ACPT_GNR_TYP


	final static String i_INSPC_ACPT_GNR_TYP = null;

	// 第 92 変数初期値： i_CRCT_NO


	final static String i_CRCT_NO = null;

	// 第 93 変数初期値： i_CRCT_TYP


	final static String i_CRCT_TYP = null;

	// 第 94 変数初期値： i_SLIP_TYP


	final static String i_SLIP_TYP = null;

	// 第 95 変数初期値： i_WORK_IN_PROC_CD


	final static String i_WORK_IN_PROC_CD = null;

	// 第 96 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

	// 第 97 変数初期値： i_PROCESSING_COST


	final static String i_PROCESSING_COST = null;

	// 第 98 変数初期値： i_MATERIAL_COST


	final static String i_MATERIAL_COST = null;

	// 第 99 変数初期値： i_OTHER_OVERHEADS


	final static String i_OTHER_OVERHEADS = null;

	// 第 100 変数初期値： i_INSPC_ACPT_QTY


	final static String i_INSPC_ACPT_QTY = null;

	// 第 101 変数初期値： i_INSPC_ACPT_AMOUNT


	final static String i_INSPC_ACPT_AMOUNT = null;

	// 第 102 変数初期値： i_SAVING_AMOUNT


	final static String i_SAVING_AMOUNT = null;

	// 第 103 変数初期値： i_INSPC_ACPT_DATE


	final static String i_INSPC_ACPT_DATE = null;

	// 第 104 変数初期値： i_PRODUCT_TYP


	final static String i_PRODUCT_TYP = null;

	// 第 105 変数初期値： i_DLV_CD


	final static String i_DLV_CD = null;

	// 第 106 変数初期値： i_DISC_AMOUNT


	final static String i_DISC_AMOUNT = null;

	// 第 107 変数初期値： i_GNR_ORG_CD


	final static String i_GNR_ORG_CD = null;

	// 第 108 変数初期値： i_SBCNT_PUCH_TYP


	final static String i_SBCNT_PUCH_TYP = null;

	// 第 109 変数初期値： i_JOB_ODR_DETAIL_NO


	final static String i_JOB_ODR_DETAIL_NO = null;

	// 第 110 変数初期値： i_CLASIFICATION_CD


	final static String i_CLASIFICATION_CD = null;

	// 第 111 変数初期値： i_INV_CTRL_FLG


	final static String i_INV_CTRL_FLG = null;

	// 第 112 変数初期値： i_PUCH_RTN_FLG


	final static String i_PUCH_RTN_FLG = null;

	// 第 113 変数初期値： i_APPR_FLG


	final static String i_APPR_FLG = null;

	// 第 114 変数初期値： i_APPR_ID


	final static String i_APPR_ID = null;

	// 第 115 変数初期値： i_APPR_DATE


	final static String i_APPR_DATE = null;

	// 第 116 変数初期値： i_RESERVE_CAUSE


	final static String i_RESERVE_CAUSE = null;

	// 第 117 変数初期値： i_SLIP_CTRL_GRP


	final static String i_SLIP_CTRL_GRP = null;

	// 第 118 変数初期値： i_SLIP_DATE


	final static String i_SLIP_DATE = null;

	// 第 119 変数初期値： i_SLIP_CD


	final static String i_SLIP_CD = null;

	// 第 120 変数初期値： i_SEQ_NO


	final static String i_SEQ_NO = null;

	// 第 121 変数初期値： i_NET_AMOUNT_YEN


	final static String i_NET_AMOUNT_YEN = null;

	// 第 122 変数初期値： i_AMOUNT


	final static String i_AMOUNT = null;

	// 第 123 変数初期値： i_TAX_TYP


	final static String i_TAX_TYP = null;

	// 第 124 変数初期値： i_TAX_AMOUNT


	final static String i_TAX_AMOUNT = null;

	// 第 125 変数初期値： i_GROSS_AMOUNT


	final static String i_GROSS_AMOUNT = null;

	// 第 126 変数初期値： i_TAX_AMOUNT_YEN


	final static String i_TAX_AMOUNT_YEN = null;

	// 第 127 変数初期値： i_GROSS_AMOUNT_YEN


	final static String i_GROSS_AMOUNT_YEN = null;

	// 第 128 変数初期値： i_SUM_TAX_AMOUNT


	final static String i_SUM_TAX_AMOUNT = null;

	// 第 129 変数初期値： i_SUM_GROSS_AMOUNT


	final static String i_SUM_GROSS_AMOUNT = null;

	// 第 130 変数初期値： i_SUM_NET_AMOUNT


	final static String i_SUM_NET_AMOUNT = null;

	// 第 131 変数初期値： i_TAX_TOTAL


	final static String i_TAX_TOTAL = null;

	// 第 132 変数初期値： i_GROSS_TOTAL


	final static String i_GROSS_TOTAL = null;

	// 第 133 変数初期値： i_NET_TOTAL


	final static String i_NET_TOTAL = null;

	// 第 134 変数初期値： i_LINE_NO


	final static String i_LINE_NO = null;

	// 第 135 変数初期値： i_LINE_TYP


	final static String i_LINE_TYP = null;

	// 第 136 変数初期値： i_TAX_AMOUNT_CTRL_FLG


	final static String i_TAX_AMOUNT_CTRL_FLG = null;

	// 第 137 変数初期値： i_UNIT_COST_YEN


	final static String i_UNIT_COST_YEN = null;

	// 第 138 変数初期値： i_PROCESSING_COST_YEN


	final static String i_PROCESSING_COST_YEN = null;

	// 第 139 変数初期値： i_MATERIAL_COST_YEN


	final static String i_MATERIAL_COST_YEN = null;

	// 第 140 変数初期値： i_OTHER_OVERHEADS_YEN


	final static String i_OTHER_OVERHEADS_YEN = null;

	// 第 141 変数初期値： i_DR_ACCT_CD


	final static String i_DR_ACCT_CD = null;

	// 第 142 変数初期値： i_DR_SUB_ACCT_CD


	final static String i_DR_SUB_ACCT_CD = null;

	// 第 143 変数初期値： i_DR_ORG_CD


	final static String i_DR_ORG_CD = null;

	// 第 144 変数初期値： i_CR_ACCT_CD


	final static String i_CR_ACCT_CD = null;

	// 第 145 変数初期値： i_CR_SUB_ACCT_CD


	final static String i_CR_SUB_ACCT_CD = null;

	// 第 146 変数初期値： i_CR_ORG_CD


	final static String i_CR_ORG_CD = null;

	// 第 147 変数初期値： i_FIXED_ASSETS_CD


	final static String i_FIXED_ASSETS_CD = null;

	// 第 148 変数初期値： i_SUB_FIXED_ASSETS_CD


	final static String i_SUB_FIXED_ASSETS_CD = null;

	// 第 149 変数初期値： i_DETAIL_NO


	final static String i_DETAIL_NO = null;

	// 第 150 変数初期値： i_COMM_PUCH_ODR_LINE_NO


	final static String i_COMM_PUCH_ODR_LINE_NO = null;

	// 第 151 変数初期値： i_ARV_RSLT_LINE_NO


	final static String i_ARV_RSLT_LINE_NO = null;

	// 第 152 変数初期値： i_STOCK_CTRL_FLG


	final static String i_STOCK_CTRL_FLG = null;

	// 第 153 変数初期値： i_REMARKS


	final static String i_REMARKS = null;

	// 第 154 変数初期値： i_INSPC_ACPT_CRCT_TYP


	final static String i_INSPC_ACPT_CRCT_TYP = null;

	// 第 155 変数初期値： i_ORGN_SLIP_CTRL_GRP


	final static String i_ORGN_SLIP_CTRL_GRP = null;

	// 第 156 変数初期値： i_ORGN_SLIP_CD


	final static String i_ORGN_SLIP_CD = null;

	// 第 157 変数初期値： i_ORGN_SLIP_DATE


	final static String i_ORGN_SLIP_DATE = null;

	// 第 158 変数初期値： i_SLIP_TRN_CD


	final static String i_SLIP_TRN_CD = null;

	// 第 159 変数初期値： i_STOCK_CLASS_CD


	final static String i_STOCK_CLASS_CD = null;

	// 第 160 変数初期値： i_BALANCE_CLASS_CD


	final static String i_BALANCE_CLASS_CD = null;

	// 第 161 変数初期値： i_PUCH_ODR_ORG_CD


	final static String i_PUCH_ODR_ORG_CD = null;

	// 第 162 変数初期値： i_PUCH_ODR_PERSON_CD


	final static String i_PUCH_ODR_PERSON_CD = null;

	// 第 163 変数初期値： i_WH_CD


	final static String i_WH_CD = null;

	// 第 164 変数初期値： i_SHIP_WH_CD


	final static String i_SHIP_WH_CD = null;

	// 第 165 変数初期値： i_PAYEE_CD


	final static String i_PAYEE_CD = null;

	// 第 166 変数初期値： i_SLIP_CTRL_ORG_CD


	final static String i_SLIP_CTRL_ORG_CD = null;

	// 第 167 変数初期値： i_CLOSING_CTRL_ORG_CD


	final static String i_CLOSING_CTRL_ORG_CD = null;

	// 第 168 変数初期値： i_PAY_CALC_CTRL_ORG_CD


	final static String i_PAY_CALC_CTRL_ORG_CD = null;

	// 第 169 変数初期値： i_PAY_FIX_CTRL_ORG_CD


	final static String i_PAY_FIX_CTRL_ORG_CD = null;

	// 第 170 変数初期値： i_EXPL_TYP


	final static String i_EXPL_TYP = null;

	// 第 171 変数初期値： i_EXPL_CD


	final static String i_EXPL_CD = null;

	// 第 172 変数初期値： i_EXPL_NAME


	final static String i_EXPL_NAME = null;

	// 第 173 変数初期値： i_ODR_CD


	final static String i_ODR_CD = null;

	// 第 174 変数初期値： i_COMM_PUCH_ODR_SLIP_TYP


	final static String i_COMM_PUCH_ODR_SLIP_TYP = null;

	// 第 175 変数初期値： i_COMM_PUCH_ODR_SLIP_CTRL_GRP


	final static String i_COMM_PUCH_ODR_SLIP_CTRL_GRP = null;

	// 第 176 変数初期値： i_COMM_PUCH_ODR_SLIP_CD


	final static String i_COMM_PUCH_ODR_SLIP_CD = null;

	// 第 177 変数初期値： i_COMM_PUCH_ODR_SLIP_DATE


	final static String i_COMM_PUCH_ODR_SLIP_DATE = null;

	// 第 178 変数初期値： i_ARV_RSLT_SLIP_TYP


	final static String i_ARV_RSLT_SLIP_TYP = null;

	// 第 179 変数初期値： i_ARV_RSLT_SLIP_CTRL_GRP


	final static String i_ARV_RSLT_SLIP_CTRL_GRP = null;

	// 第 180 変数初期値： i_ARV_RSLT_SLIP_CD


	final static String i_ARV_RSLT_SLIP_CD = null;

	// 第 181 変数初期値： i_ARV_RSLT_SLIP_DATE


	final static String i_ARV_RSLT_SLIP_DATE = null;

	// 第 182 変数初期値： i_PUCH_RSLT_SLIP_ID


	final static String i_PUCH_RSLT_SLIP_ID = null;

	// 第 183 変数初期値： i_TAX_CALC_TYP


	final static String i_TAX_CALC_TYP = null;

	// 第 184 変数初期値： i_TAX_APPLY_TYP


	final static String i_TAX_APPLY_TYP = null;

	// 第 185 変数初期値： i_TEMP_UNIT_COST_PUCH_RSLT_FLG


	final static String i_TEMP_UNIT_COST_PUCH_RSLT_FLG = null;

	// 第 186 変数初期値： i_UNIT_COST_ZERO_INSPC_ACPT_FLG


	final static String i_UNIT_COST_ZERO_INSPC_ACPT_FLG = null;

	// 第 187 変数初期値： i_IMPORT_TRN_TYP


	final static String i_IMPORT_TRN_TYP = null;

	// 第 188 変数初期値： i_PAY_CYCLE_TYP


	final static String i_PAY_CYCLE_TYP = null;

	// 第 189 変数初期値： i_DEADLINE_DATE


	final static String i_DEADLINE_DATE = null;

	// 第 190 変数初期値： i_PAY_SCH_DATE


	final static String i_PAY_SCH_DATE = null;

	// 第 191 変数初期値： i_PAY_PATTERN_CD


	final static String i_PAY_PATTERN_CD = null;

	// 第 192 変数初期値： i_EXCH_RSRV_CD


	final static String i_EXCH_RSRV_CD = null;

	// 第 193 変数初期値： i_EXCH_DATE


	final static String i_EXCH_DATE = null;

	// 第 194 変数初期値： i_PUR_RSLT_SLIP_ISSUE_FLG


	final static String i_PUR_RSLT_SLIP_ISSUE_FLG = null;

	// 第 195 変数初期値： i_PUR_RSLT_REP_ISSUE_FLG


	final static String i_PUR_RSLT_REP_ISSUE_FLG = null;

	// 第 196 変数初期値： i_ACPT_ARV_MODIFICATION_FLG


	final static String i_ACPT_ARV_MODIFICATION_FLG = null;

	// 第 197 変数初期値： i_INSPC_ACPT_MODIFICATION_FLG


	final static String i_INSPC_ACPT_MODIFICATION_FLG = null;

	// 第 198 変数初期値： i_STATUS


	final static String i_STATUS = null;

	// 第 199 変数初期値： i_CRCT_FLG


	final static String i_CRCT_FLG = null;

	// 第 200 変数初期値： i_APPROVAL_DATE


	final static String i_APPROVAL_DATE = null;

	// 第 201 変数初期値： i_APPROVAL_CD


	final static String i_APPROVAL_CD = null;

	// 第 202 変数初期値： i_APPROVAL_RSRV_DATE


	final static String i_APPROVAL_RSRV_DATE = null;

	// 第 203 変数初期値： i_APPROVAL_RSRV_CD


	final static String i_APPROVAL_RSRV_CD = null;

	// 第 204 変数初期値： i_RSN_CD


	final static String i_RSN_CD = null;

	// 第 205 変数初期値： i_RECORDING_DATE


	final static String i_RECORDING_DATE = null;

	// 第 206 変数初期値： i_RECORDING_MONTH


	final static String i_RECORDING_MONTH = null;

	// 第 207 変数初期値： i_ORGN_RECORDING_DATE


	final static String i_ORGN_RECORDING_DATE = null;

	// 第 208 変数初期値： i_ORGN_RECORDING_MONTH


	final static String i_ORGN_RECORDING_MONTH = null;

	// 第 209 変数初期値： i_RECORDING_PROC_DATE


	final static String i_RECORDING_PROC_DATE = null;

	// 第 210 変数初期値： i_RECORDING_PROC_CD


	final static String i_RECORDING_PROC_CD = null;

	// 第 211 変数初期値： i_CLOSING_RSRV_DATE


	final static String i_CLOSING_RSRV_DATE = null;

	// 第 212 変数初期値： i_CLOSING_RSRV_CD


	final static String i_CLOSING_RSRV_CD = null;

	// 第 213 変数初期値： i_CLOSING_DATE


	final static String i_CLOSING_DATE = null;

	// 第 214 変数初期値： i_CLOSING_CD


	final static String i_CLOSING_CD = null;

	// 第 215 変数初期値： i_PAY_FIX_DATE


	final static String i_PAY_FIX_DATE = null;

	// 第 216 変数初期値： i_PAY_FIX_CD


	final static String i_PAY_FIX_CD = null;

	// 第 217 変数初期値： i_DEBT_BALANCE_OUT_FLG


	final static String i_DEBT_BALANCE_OUT_FLG = null;

	// 第 218 変数初期値： i_DEBT_BALANCE_OUT_DATE


	final static String i_DEBT_BALANCE_OUT_DATE = null;

	// 第 219 変数初期値： i_MONTH


	final static String i_MONTH = null;

	// 第 220 変数初期値： i_ACCT_CD


	final static String i_ACCT_CD = null;

	// 第 221 変数初期値： i_SUB_ACCT_CD


	final static String i_SUB_ACCT_CD = null;

	// 第 222 変数初期値： i_ORG_CD


	final static String i_ORG_CD = null;

	// 第 223 変数初期値： i_DATA_TYP


	final static String i_DATA_TYP = null;

	// 第 224 変数初期値： i_GL_IF_OUT_FLG


	final static String i_GL_IF_OUT_FLG = null;

	// 第 225 変数初期値： i_BALANCE_UPD_FLG


	final static String i_BALANCE_UPD_FLG = null;

	// 第 226 変数初期値： i_BALANCE_UPD_DATE


	final static String i_BALANCE_UPD_DATE = null;

	// 第 227 変数初期値： i_RECORDING_AMOUNT


	final static String i_RECORDING_AMOUNT = null;

	// 第 228 変数初期値： i_DEBT_AMOUNT


	final static String i_DEBT_AMOUNT = null;

	// 第 229 変数初期値： i_REBATE_AMOUNT


	final static String i_REBATE_AMOUNT = null;

	// 第 230 変数初期値： i_RETURNED_GOODS_AMOUNT


	final static String i_RETURNED_GOODS_AMOUNT = null;

	// 第 231 変数初期値： i_RECORDING_AMOUNT_YEN


	final static String i_RECORDING_AMOUNT_YEN = null;

	// 第 232 変数初期値： i_DEBT_AMOUNT_YEN


	final static String i_DEBT_AMOUNT_YEN = null;

	// 第 233 変数初期値： i_SAVING_AMOUNT_YEN


	final static String i_SAVING_AMOUNT_YEN = null;

	// 第 234 変数初期値： i_REBATE_AMOUNT_YEN


	final static String i_REBATE_AMOUNT_YEN = null;

	// 第 235 変数初期値： i_RETURNED_GOODS_AMOUNT_YEN


	final static String i_RETURNED_GOODS_AMOUNT_YEN = null;

	// 第 236 変数初期値： i_INSPC_ACPT_AMOUNT_YEN


	final static String i_INSPC_ACPT_AMOUNT_YEN = null;

	// 第 237 変数初期値： i_EXCH_DIFF_AMOUNT_YEN


	final static String i_EXCH_DIFF_AMOUNT_YEN = null;

	// 第 238 変数初期値： i_OPTION_ID


	final static String i_OPTION_ID = null;

	// 第 239 変数初期値： i_OWN_CUR_CD


	final static String i_OWN_CUR_CD = null;

	// 第 240 変数初期値： i_THIS_MONTH


	final static String i_THIS_MONTH = null;

	// 第 241 変数初期値： i_HOME_DECIMAL_FIG


	final static String i_HOME_DECIMAL_FIG = null;

	// 第 242 変数初期値： i_HOME_CUR_CD


	final static String i_HOME_CUR_CD = null;

	// 第 243 変数初期値： i_TIME_CTRL


	final static String i_TIME_CTRL = null;

*/

	//{{user_implement_code
		// TODO: 初期化で使う定数は、ここに記述してください。
		// 以下に記述した内容は自動的には変更されません。
	// 第 1 変数初期値： i_c_NON_NO_ITEM_FLG

	final static String i_c_NON_NO_ITEM_FLG = null;

	// 第 2 変数初期値： i_PUCH_ODR_DLV_TIME

	final static String i_PUCH_ODR_DLV_TIME = null;

	// 第 3 変数初期値： i_PUCH_ODR_START_TIME

	final static String i_PUCH_ODR_START_TIME = null;

	// 第 4 変数初期値： i_l_STATUS

	final static String i_l_STATUS = null;

	// 第 5 変数初期値： i_l_ACPT_NO

	final static String i_l_ACPT_NO = null;

	// 第 6 変数初期値： i_l_ACPT_QTY

	final static String i_l_ACPT_QTY = null;

	// 第 7 変数初期値： i_l_ACPT_DATE

	final static String i_l_ACPT_DATE = null;

	// 第 8 変数初期値： i_l_UNIT_COST

	final static String i_l_UNIT_COST = null;

	// 第 9 変数初期値： i_l_UNIT_COST_TYP

	final static String i_l_UNIT_COST_TYP = null;

	// 第 10 変数初期値： i_l_PUCH_ODR_AMOUNT

	final static String i_l_PUCH_ODR_AMOUNT = null;

	// 第 11 変数初期値： i_l_INSPECTED_QTY

	final static String i_l_INSPECTED_QTY = null;

	// 第 12 変数初期値： i_l_ACCEPTED_QTY

	final static String i_l_ACCEPTED_QTY = null;

	// 第 13 変数初期値： i_l_INSPEC_DATE

	final static String i_l_INSPEC_DATE = null;

	// 第 14 変数初期値： i_h_NET_AMOUNT

	final static String i_h_NET_AMOUNT = null;

	// 第 15 変数初期値： i_h_TAX_AMOUNT_1

	final static String i_h_TAX_AMOUNT_1 = null;

	// 第 16 変数初期値： i_h_TAX_AMOUNT_2

	final static String i_h_TAX_AMOUNT_2 = null;

	// 第 17 変数初期値： i_h_TAX_AMOUNT_3

	final static String i_h_TAX_AMOUNT_3 = null;

	// 第 18 変数初期値： i_h_DECIMAL_FIG

	final static String i_h_DECIMAL_FIG = null;

	// 第 19 変数初期値： i_h_ROUND_TYP

	final static String i_h_ROUND_TYP = null;

	// 第 20 変数初期値： i_h_PUCH_ODR_STS_TYP

	final static String i_h_PUCH_ODR_STS_TYP = null;

	// 第 21 変数初期値： i_h_PUCH_ODR_INST_SLIP_ISS_FLG

	final static String i_h_PUCH_ODR_INST_SLIP_ISS_FLG = null;

	// 第 22 変数初期値： i_h_ODR_CANCEL_SLIP_ISS_FLG

	final static String i_h_ODR_CANCEL_SLIP_ISS_FLG = null;

	// 第 23 変数初期値： i_h_INSPC_CMPLT_FLG

	final static String i_h_INSPC_CMPLT_FLG = null;

	// 第 24 変数初期値： i_h_ACPT_INSPC_TYP

	final static String i_h_ACPT_INSPC_TYP = null;

	// 第 25 変数初期値： i_h_NET_AMOUNT_LIST

	final static String i_h_NET_AMOUNT_LIST = null;

	// 第 26 変数初期値： i_h_TAX_AMOUNT_1_LIST

	final static String i_h_TAX_AMOUNT_1_LIST = null;

	// 第 27 変数初期値： i_h_TAX_AMOUNT_2_LIST

	final static String i_h_TAX_AMOUNT_2_LIST = null;

	// 第 28 変数初期値： i_h_TAX_AMOUNT_3_LIST

	final static String i_h_TAX_AMOUNT_3_LIST = null;

	// 第 29 変数初期値： i_h_UPDATE_FLG

	final static String i_h_UPDATE_FLG = null;

	// 第 30 変数初期値： i_h_MODIFY_COUNT

	final static String i_h_MODIFY_COUNT = null;

	// 第 31 変数初期値： i_h_MODIFY_COUNT_LIST

	final static String i_h_MODIFY_COUNT_LIST = null;

	// 第 32 変数初期値： i_h_EXCH_RATE

	final static String i_h_EXCH_RATE = null;

	// 第 33 変数初期値： i_h_EXCH_RATE_LIST

	final static String i_h_EXCH_RATE_LIST = null;

	// 第 34 変数初期値： i_h_TAX_CD

	final static String i_h_TAX_CD = null;

	// 第 35 変数初期値： i_h_PUCH_ODR_CD

	final static String i_h_PUCH_ODR_CD = null;

	// 第 36 変数初期値： i_NON_NO_ITEM_FLG

	final static String i_NON_NO_ITEM_FLG = null;

	// 第 37 変数初期値： i_ITEM_CD

	final static String i_ITEM_CD = null;

	// 第 38 変数初期値： i_VEND_CD

	final static String i_VEND_CD = null;

	// 第 39 変数初期値： i_PUCH_ODR_DLV_DATE

	final static String i_PUCH_ODR_DLV_DATE = null;

	// 第 40 変数初期値： i_TAX_CD

	final static String i_TAX_CD = null;

	// 第 41 変数初期値： i_PUCH_ODR_START_DATE

	final static String i_PUCH_ODR_START_DATE = null;

	// 第 42 変数初期値： i_PUCH_ODR_QTY

	final static String i_PUCH_ODR_QTY = null;

	// 第 43 変数初期値： i_UNIT_COST_TYP

	final static String i_UNIT_COST_TYP = null;

	// 第 44 変数初期値： i_UNIT_COST

	final static String i_UNIT_COST = null;

	// 第 45 変数初期値： i_ACPT_INSPC_TYP

	final static String i_ACPT_INSPC_TYP = null;

	// 第 46 変数初期値： i_PUCH_ODR_AMOUNT

	final static String i_PUCH_ODR_AMOUNT = null;

	// 第 47 変数初期値： i_RATE_JUDGE_DATE

	final static String i_RATE_JUDGE_DATE = null;

	// 第 48 変数初期値： i_NET_AMOUNT

	final static String i_NET_AMOUNT = null;

	// 第 49 変数初期値： i_TAX_AMOUNT_1

	final static String i_TAX_AMOUNT_1 = null;

	// 第 50 変数初期値： i_TAX_AMOUNT_2

	final static String i_TAX_AMOUNT_2 = null;

	// 第 51 変数初期値： i_TAX_AMOUNT_3

	final static String i_TAX_AMOUNT_3 = null;

	// 第 52 変数初期値： i_PUCH_ODR_STS_TYP

	final static String i_PUCH_ODR_STS_TYP = null;

	// 第 53 変数初期値： i_PUCH_ODR_INST_SLIP_ISS_FLG

	final static String i_PUCH_ODR_INST_SLIP_ISS_FLG = null;

	// 第 54 変数初期値： i_ODR_CANCEL_SLIP_ISS_FLG

	final static String i_ODR_CANCEL_SLIP_ISS_FLG = null;

	// 第 55 変数初期値： i_INSPC_CMPLT_FLG

	final static String i_INSPC_CMPLT_FLG = null;

	// 第 56 変数初期値： i_MODIFY_COUNT

	final static String i_MODIFY_COUNT = null;

	// 第 57 変数初期値： i_EXCH_RATE

	final static String i_EXCH_RATE = null;

	// 第 58 変数初期値： i_ITEM_NAME

	final static String i_ITEM_NAME = null;

	// 第 59 変数初期値： i_STOCK_UNIT

	final static String i_STOCK_UNIT = null;

	// 第 60 変数初期値： i_JOB_ODR_CD

	final static String i_JOB_ODR_CD = null;

	// 第 61 変数初期値： i_VEND_NAME

	final static String i_VEND_NAME = null;

	// 第 62 変数初期値： i_INSPC_ACPT_APP_TYP

	final static String i_INSPC_ACPT_APP_TYP = null;

	// 第 63 変数初期値： i_CUR_CD

	final static String i_CUR_CD = null;

	// 第 64 変数初期値： i_EXCH_TYP

	final static String i_EXCH_TYP = null;

	// 第 65 変数初期値： i_ROUND_TYP

	final static String i_ROUND_TYP = null;

	// 第 66 変数初期値： i_CUR_NAME

	final static String i_CUR_NAME = null;

	// 第 67 変数初期値： i_CUR_UNIT

	final static String i_CUR_UNIT = null;

	// 第 68 変数初期値： i_DECIMAL_FIG

	final static String i_DECIMAL_FIG = null;

	// 第 69 変数初期値： i_PUCH_ODR_CD

	final static String i_PUCH_ODR_CD = null;

	// 第 70 変数初期値： i_COMPANY_CD

	final static String i_COMPANY_CD = null;

	// 第 71 変数初期値： i_ACPT_NO

	final static String i_ACPT_NO = null;

	// 第 72 変数初期値： i_ACPT_QTY

	final static String i_ACPT_QTY = null;

	// 第 73 変数初期値： i_ACPT_DATE

	final static String i_ACPT_DATE = null;

	// 第 74 変数初期値： i_INSPECTED_QTY

	final static String i_INSPECTED_QTY = null;

	// 第 75 変数初期値： i_ACCEPTED_QTY

	final static String i_ACCEPTED_QTY = null;

	// 第 76 変数初期値： i_INSPEC_DATE

	final static String i_INSPEC_DATE = null;

	// 第 77 変数初期値： i_OLD_TAX_RATE_1

	final static String i_OLD_TAX_RATE_1 = null;

	// 第 78 変数初期値： i_OLD_TAX_RATE_2

	final static String i_OLD_TAX_RATE_2 = null;

	// 第 79 変数初期値： i_OLD_TAX_RATE_3

	final static String i_OLD_TAX_RATE_3 = null;

	// 第 80 変数初期値： i_NEW_TAX_RATE_START_DATE

	final static String i_NEW_TAX_RATE_START_DATE = null;

	// 第 81 変数初期値： i_NEW_TAX_RATE_1

	final static String i_NEW_TAX_RATE_1 = null;

	// 第 82 変数初期値： i_NEW_TAX_RATE_2

	final static String i_NEW_TAX_RATE_2 = null;

	// 第 83 変数初期値： i_NEW_TAX_RATE_3

	final static String i_NEW_TAX_RATE_3 = null;

	// 第 84 変数初期値： i_TAX_RATE_1

	final static String i_TAX_RATE_1 = null;

	// 第 85 変数初期値： i_TAX_RATE_2

	final static String i_TAX_RATE_2 = null;

	// 第 86 変数初期値： i_TAX_RATE_3

	final static String i_TAX_RATE_3 = null;

	// 第 87 変数初期値： i_AMOUNT_INCLUDE_TAX

	final static String i_AMOUNT_INCLUDE_TAX = null;

	// 第 88 変数初期値： i_HOME_CUR_AMOUNT

	final static String i_HOME_CUR_AMOUNT = null;

	// 第 89 変数初期値： i_TAX_ROUND_TYP

	final static String i_TAX_ROUND_TYP = null;

	// 第 90 変数初期値： i_INSPC_ACPT_NO

	final static String i_INSPC_ACPT_NO = null;

	// 第 91 変数初期値： i_INSPC_ACPT_GNR_TYP

	final static String i_INSPC_ACPT_GNR_TYP = null;

	// 第 92 変数初期値： i_CRCT_NO

	final static String i_CRCT_NO = null;

	// 第 93 変数初期値： i_CRCT_TYP

	final static String i_CRCT_TYP = null;

	// 第 94 変数初期値： i_SLIP_TYP

	final static String i_SLIP_TYP = null;

	// 第 95 変数初期値： i_WORK_IN_PROC_CD

	final static String i_WORK_IN_PROC_CD = null;

	// 第 96 変数初期値： i_PLANT_CD

	final static String i_PLANT_CD = null;

	// 第 97 変数初期値： i_PROCESSING_COST

	final static String i_PROCESSING_COST = null;

	// 第 98 変数初期値： i_MATERIAL_COST

	final static String i_MATERIAL_COST = null;

	// 第 99 変数初期値： i_OTHER_OVERHEADS

	final static String i_OTHER_OVERHEADS = null;

	// 第 100 変数初期値： i_INSPC_ACPT_QTY

	final static String i_INSPC_ACPT_QTY = null;

	// 第 101 変数初期値： i_INSPC_ACPT_AMOUNT

	final static String i_INSPC_ACPT_AMOUNT = null;

	// 第 102 変数初期値： i_SAVING_AMOUNT

	final static String i_SAVING_AMOUNT = null;

	// 第 103 変数初期値： i_INSPC_ACPT_DATE

	final static String i_INSPC_ACPT_DATE = null;

	// 第 104 変数初期値： i_PRODUCT_TYP

	final static String i_PRODUCT_TYP = null;

	// 第 105 変数初期値： i_DLV_CD

	final static String i_DLV_CD = null;

	// 第 106 変数初期値： i_DISC_AMOUNT

	final static String i_DISC_AMOUNT = null;

	// 第 107 変数初期値： i_GNR_ORG_CD

	final static String i_GNR_ORG_CD = null;

	// 第 108 変数初期値： i_SBCNT_PUCH_TYP

	final static String i_SBCNT_PUCH_TYP = null;

	// 第 109 変数初期値： i_JOB_ODR_DETAIL_NO

	final static String i_JOB_ODR_DETAIL_NO = null;

	// 第 110 変数初期値： i_CLASIFICATION_CD

	final static String i_CLASIFICATION_CD = null;

	// 第 111 変数初期値： i_INV_CTRL_FLG

	final static String i_INV_CTRL_FLG = null;

	// 第 112 変数初期値： i_PUCH_RTN_FLG

	final static String i_PUCH_RTN_FLG = null;

	// 第 113 変数初期値： i_APPR_FLG

	final static String i_APPR_FLG = null;

	// 第 114 変数初期値： i_APPR_ID

	final static String i_APPR_ID = null;

	// 第 115 変数初期値： i_APPR_DATE

	final static String i_APPR_DATE = null;

	// 第 116 変数初期値： i_RESERVE_CAUSE

	final static String i_RESERVE_CAUSE = null;

	// 第 117 変数初期値： i_SLIP_CTRL_GRP

	final static String i_SLIP_CTRL_GRP = null;

	// 第 118 変数初期値： i_SLIP_DATE

	final static String i_SLIP_DATE = null;

	// 第 119 変数初期値： i_SLIP_CD

	final static String i_SLIP_CD = null;

	// 第 120 変数初期値： i_SEQ_NO

	final static String i_SEQ_NO = null;

	// 第 121 変数初期値： i_NET_AMOUNT_YEN

	final static String i_NET_AMOUNT_YEN = null;

	// 第 122 変数初期値： i_AMOUNT

	final static String i_AMOUNT = null;

	// 第 123 変数初期値： i_TAX_TYP

	final static String i_TAX_TYP = null;

	// 第 124 変数初期値： i_TAX_AMOUNT

	final static String i_TAX_AMOUNT = null;

	// 第 125 変数初期値： i_GROSS_AMOUNT

	final static String i_GROSS_AMOUNT = null;

	// 第 126 変数初期値： i_TAX_AMOUNT_YEN

	final static String i_TAX_AMOUNT_YEN = null;

	// 第 127 変数初期値： i_GROSS_AMOUNT_YEN

	final static String i_GROSS_AMOUNT_YEN = null;

	// 第 128 変数初期値： i_SUM_TAX_AMOUNT

	final static String i_SUM_TAX_AMOUNT = null;

	// 第 129 変数初期値： i_SUM_GROSS_AMOUNT

	final static String i_SUM_GROSS_AMOUNT = null;

	// 第 130 変数初期値： i_SUM_NET_AMOUNT

	final static String i_SUM_NET_AMOUNT = null;

	// 第 131 変数初期値： i_TAX_TOTAL

	final static String i_TAX_TOTAL = null;

	// 第 132 変数初期値： i_GROSS_TOTAL

	final static String i_GROSS_TOTAL = null;

	// 第 133 変数初期値： i_NET_TOTAL

	final static String i_NET_TOTAL = null;

	// 第 134 変数初期値： i_LINE_NO

	final static String i_LINE_NO = null;

	// 第 135 変数初期値： i_LINE_TYP

	final static String i_LINE_TYP = null;

	// 第 136 変数初期値： i_TAX_AMOUNT_CTRL_FLG

	final static String i_TAX_AMOUNT_CTRL_FLG = null;

	// 第 137 変数初期値： i_UNIT_COST_YEN

	final static String i_UNIT_COST_YEN = null;

	// 第 138 変数初期値： i_PROCESSING_COST_YEN

	final static String i_PROCESSING_COST_YEN = null;

	// 第 139 変数初期値： i_MATERIAL_COST_YEN

	final static String i_MATERIAL_COST_YEN = null;

	// 第 140 変数初期値： i_OTHER_OVERHEADS_YEN

	final static String i_OTHER_OVERHEADS_YEN = null;

	// 第 141 変数初期値： i_DR_ACCT_CD

	final static String i_DR_ACCT_CD = null;

	// 第 142 変数初期値： i_DR_SUB_ACCT_CD

	final static String i_DR_SUB_ACCT_CD = null;

	// 第 143 変数初期値： i_DR_ORG_CD

	final static String i_DR_ORG_CD = null;

	// 第 144 変数初期値： i_CR_ACCT_CD

	final static String i_CR_ACCT_CD = null;

	// 第 145 変数初期値： i_CR_SUB_ACCT_CD

	final static String i_CR_SUB_ACCT_CD = null;

	// 第 146 変数初期値： i_CR_ORG_CD

	final static String i_CR_ORG_CD = null;

	// 第 147 変数初期値： i_FIXED_ASSETS_CD

	final static String i_FIXED_ASSETS_CD = null;

	// 第 148 変数初期値： i_SUB_FIXED_ASSETS_CD

	final static String i_SUB_FIXED_ASSETS_CD = null;

	// 第 149 変数初期値： i_DETAIL_NO

	final static String i_DETAIL_NO = null;

	// 第 150 変数初期値： i_COMM_PUCH_ODR_LINE_NO

	final static String i_COMM_PUCH_ODR_LINE_NO = null;

	// 第 151 変数初期値： i_ARV_RSLT_LINE_NO

	final static String i_ARV_RSLT_LINE_NO = null;

	// 第 152 変数初期値： i_STOCK_CTRL_FLG

	final static String i_STOCK_CTRL_FLG = null;

	// 第 153 変数初期値： i_REMARKS

	final static String i_REMARKS = null;

	// 第 154 変数初期値： i_INSPC_ACPT_CRCT_TYP

	final static String i_INSPC_ACPT_CRCT_TYP = null;

	// 第 155 変数初期値： i_ORGN_SLIP_CTRL_GRP

	final static String i_ORGN_SLIP_CTRL_GRP = null;

	// 第 156 変数初期値： i_ORGN_SLIP_CD

	final static String i_ORGN_SLIP_CD = null;

	// 第 157 変数初期値： i_ORGN_SLIP_DATE

	final static String i_ORGN_SLIP_DATE = null;

	// 第 158 変数初期値： i_SLIP_TRN_CD

	final static String i_SLIP_TRN_CD = null;

	// 第 159 変数初期値： i_STOCK_CLASS_CD

	final static String i_STOCK_CLASS_CD = null;

	// 第 160 変数初期値： i_BALANCE_CLASS_CD

	final static String i_BALANCE_CLASS_CD = null;

	// 第 161 変数初期値： i_PUCH_ODR_ORG_CD

	final static String i_PUCH_ODR_ORG_CD = null;

	// 第 162 変数初期値： i_PUCH_ODR_PERSON_CD

	final static String i_PUCH_ODR_PERSON_CD = null;

	// 第 163 変数初期値： i_WH_CD

	final static String i_WH_CD = null;

	// 第 164 変数初期値： i_SHIP_WH_CD

	final static String i_SHIP_WH_CD = null;

	// 第 165 変数初期値： i_PAYEE_CD

	final static String i_PAYEE_CD = null;

	// 第 166 変数初期値： i_SLIP_CTRL_ORG_CD

	final static String i_SLIP_CTRL_ORG_CD = null;

	// 第 167 変数初期値： i_CLOSING_CTRL_ORG_CD

	final static String i_CLOSING_CTRL_ORG_CD = null;

	// 第 168 変数初期値： i_PAY_CALC_CTRL_ORG_CD

	final static String i_PAY_CALC_CTRL_ORG_CD = null;

	// 第 169 変数初期値： i_PAY_FIX_CTRL_ORG_CD

	final static String i_PAY_FIX_CTRL_ORG_CD = null;

	// 第 170 変数初期値： i_EXPL_TYP

	final static String i_EXPL_TYP = null;

	// 第 171 変数初期値： i_EXPL_CD

	final static String i_EXPL_CD = null;

	// 第 172 変数初期値： i_EXPL_NAME

	final static String i_EXPL_NAME = null;

	// 第 173 変数初期値： i_ODR_CD

	final static String i_ODR_CD = null;

	// 第 174 変数初期値： i_COMM_PUCH_ODR_SLIP_TYP

	final static String i_COMM_PUCH_ODR_SLIP_TYP = null;

	// 第 175 変数初期値： i_COMM_PUCH_ODR_SLIP_CTRL_GRP

	final static String i_COMM_PUCH_ODR_SLIP_CTRL_GRP = null;

	// 第 176 変数初期値： i_COMM_PUCH_ODR_SLIP_CD

	final static String i_COMM_PUCH_ODR_SLIP_CD = null;

	// 第 177 変数初期値： i_COMM_PUCH_ODR_SLIP_DATE

	final static String i_COMM_PUCH_ODR_SLIP_DATE = null;

	// 第 178 変数初期値： i_ARV_RSLT_SLIP_TYP

	final static String i_ARV_RSLT_SLIP_TYP = null;

	// 第 179 変数初期値： i_ARV_RSLT_SLIP_CTRL_GRP

	final static String i_ARV_RSLT_SLIP_CTRL_GRP = null;

	// 第 180 変数初期値： i_ARV_RSLT_SLIP_CD

	final static String i_ARV_RSLT_SLIP_CD = null;

	// 第 181 変数初期値： i_ARV_RSLT_SLIP_DATE

	final static String i_ARV_RSLT_SLIP_DATE = null;

	// 第 182 変数初期値： i_PUCH_RSLT_SLIP_ID

	final static String i_PUCH_RSLT_SLIP_ID = null;

	// 第 183 変数初期値： i_TAX_CALC_TYP

	final static String i_TAX_CALC_TYP = null;

	// 第 184 変数初期値： i_TAX_APPLY_TYP

	final static String i_TAX_APPLY_TYP = null;

	// 第 185 変数初期値： i_TEMP_UNIT_COST_PUCH_RSLT_FLG

	final static String i_TEMP_UNIT_COST_PUCH_RSLT_FLG = null;

	// 第 186 変数初期値： i_UNIT_COST_ZERO_INSPC_ACPT_FLG

	final static String i_UNIT_COST_ZERO_INSPC_ACPT_FLG = null;

	// 第 187 変数初期値： i_IMPORT_TRN_TYP

	final static String i_IMPORT_TRN_TYP = null;

	// 第 188 変数初期値： i_PAY_CYCLE_TYP

	final static String i_PAY_CYCLE_TYP = null;

	// 第 189 変数初期値： i_DEADLINE_DATE

	final static String i_DEADLINE_DATE = null;

	// 第 190 変数初期値： i_PAY_SCH_DATE

	final static String i_PAY_SCH_DATE = null;

	// 第 191 変数初期値： i_PAY_PATTERN_CD

	final static String i_PAY_PATTERN_CD = null;

	// 第 192 変数初期値： i_EXCH_RSRV_CD

	final static String i_EXCH_RSRV_CD = null;

	// 第 193 変数初期値： i_EXCH_DATE

	final static String i_EXCH_DATE = null;

	// 第 194 変数初期値： i_PUR_RSLT_SLIP_ISSUE_FLG

	final static String i_PUR_RSLT_SLIP_ISSUE_FLG = null;

	// 第 195 変数初期値： i_PUR_RSLT_REP_ISSUE_FLG

	final static String i_PUR_RSLT_REP_ISSUE_FLG = null;

	// 第 196 変数初期値： i_ACPT_ARV_MODIFICATION_FLG

	final static String i_ACPT_ARV_MODIFICATION_FLG = null;

	// 第 197 変数初期値： i_INSPC_ACPT_MODIFICATION_FLG

	final static String i_INSPC_ACPT_MODIFICATION_FLG = null;

	// 第 198 変数初期値： i_STATUS

	final static String i_STATUS = null;

	// 第 199 変数初期値： i_CRCT_FLG

	final static String i_CRCT_FLG = null;

	// 第 200 変数初期値： i_APPROVAL_DATE

	final static String i_APPROVAL_DATE = null;

	// 第 201 変数初期値： i_APPROVAL_CD

	final static String i_APPROVAL_CD = null;

	// 第 202 変数初期値： i_APPROVAL_RSRV_DATE

	final static String i_APPROVAL_RSRV_DATE = null;

	// 第 203 変数初期値： i_APPROVAL_RSRV_CD

	final static String i_APPROVAL_RSRV_CD = null;

	// 第 204 変数初期値： i_RSN_CD

	final static String i_RSN_CD = null;

	// 第 205 変数初期値： i_RECORDING_DATE

	final static String i_RECORDING_DATE = null;

	// 第 206 変数初期値： i_RECORDING_MONTH

	final static String i_RECORDING_MONTH = null;

	// 第 207 変数初期値： i_ORGN_RECORDING_DATE

	final static String i_ORGN_RECORDING_DATE = null;

	// 第 208 変数初期値： i_ORGN_RECORDING_MONTH

	final static String i_ORGN_RECORDING_MONTH = null;

	// 第 209 変数初期値： i_RECORDING_PROC_DATE

	final static String i_RECORDING_PROC_DATE = null;

	// 第 210 変数初期値： i_RECORDING_PROC_CD

	final static String i_RECORDING_PROC_CD = null;

	// 第 211 変数初期値： i_CLOSING_RSRV_DATE

	final static String i_CLOSING_RSRV_DATE = null;

	// 第 212 変数初期値： i_CLOSING_RSRV_CD

	final static String i_CLOSING_RSRV_CD = null;

	// 第 213 変数初期値： i_CLOSING_DATE

	final static String i_CLOSING_DATE = null;

	// 第 214 変数初期値： i_CLOSING_CD

	final static String i_CLOSING_CD = null;

	// 第 215 変数初期値： i_PAY_FIX_DATE

	final static String i_PAY_FIX_DATE = null;

	// 第 216 変数初期値： i_PAY_FIX_CD

	final static String i_PAY_FIX_CD = null;

	// 第 217 変数初期値： i_DEBT_BALANCE_OUT_FLG

	final static String i_DEBT_BALANCE_OUT_FLG = null;

	// 第 218 変数初期値： i_DEBT_BALANCE_OUT_DATE

	final static String i_DEBT_BALANCE_OUT_DATE = null;

	// 第 219 変数初期値： i_MONTH

	final static String i_MONTH = null;

	// 第 220 変数初期値： i_ACCT_CD

	final static String i_ACCT_CD = null;

	// 第 221 変数初期値： i_SUB_ACCT_CD

	final static String i_SUB_ACCT_CD = null;

	// 第 222 変数初期値： i_ORG_CD

	final static String i_ORG_CD = null;

	// 第 223 変数初期値： i_DATA_TYP

	final static String i_DATA_TYP = null;

	// 第 224 変数初期値： i_GL_IF_OUT_FLG

	final static String i_GL_IF_OUT_FLG = null;

	// 第 225 変数初期値： i_BALANCE_UPD_FLG

	final static String i_BALANCE_UPD_FLG = null;

	// 第 226 変数初期値： i_BALANCE_UPD_DATE

	final static String i_BALANCE_UPD_DATE = null;

	// 第 227 変数初期値： i_RECORDING_AMOUNT

	final static String i_RECORDING_AMOUNT = null;

	// 第 228 変数初期値： i_DEBT_AMOUNT

	final static String i_DEBT_AMOUNT = null;

	// 第 229 変数初期値： i_REBATE_AMOUNT

	final static String i_REBATE_AMOUNT = null;

	// 第 230 変数初期値： i_RETURNED_GOODS_AMOUNT

	final static String i_RETURNED_GOODS_AMOUNT = null;

	// 第 231 変数初期値： i_RECORDING_AMOUNT_YEN

	final static String i_RECORDING_AMOUNT_YEN = null;

	// 第 232 変数初期値： i_DEBT_AMOUNT_YEN

	final static String i_DEBT_AMOUNT_YEN = null;

	// 第 233 変数初期値： i_SAVING_AMOUNT_YEN

	final static String i_SAVING_AMOUNT_YEN = null;

	// 第 234 変数初期値： i_REBATE_AMOUNT_YEN

	final static String i_REBATE_AMOUNT_YEN = null;

	// 第 235 変数初期値： i_RETURNED_GOODS_AMOUNT_YEN

	final static String i_RETURNED_GOODS_AMOUNT_YEN = null;

	// 第 236 変数初期値： i_INSPC_ACPT_AMOUNT_YEN

	final static String i_INSPC_ACPT_AMOUNT_YEN = null;

	// 第 237 変数初期値： i_EXCH_DIFF_AMOUNT_YEN

	final static String i_EXCH_DIFF_AMOUNT_YEN = null;

	// 第 238 変数初期値： i_OPTION_ID

	final static String i_OPTION_ID = null;

	// 第 239 変数初期値： i_OWN_CUR_CD

	final static String i_OWN_CUR_CD = null;

	// 第 240 変数初期値： i_THIS_MONTH

	final static String i_THIS_MONTH = null;

	// 第 241 変数初期値： i_HOME_DECIMAL_FIG

	final static String i_HOME_DECIMAL_FIG = null;

	// 第 242 変数初期値： i_HOME_CUR_CD

	final static String i_HOME_CUR_CD = null;

	// 第 243 変数初期値： i_TIME_CTRL

	final static String i_TIME_CTRL = null;


	/**
	 * 初期化
	 *
	 */
	public void initialize()
	{

		clear();

		m_c_NON_NO_ITEM_FLG = i_c_NON_NO_ITEM_FLG;
		m_PUCH_ODR_DLV_TIME = i_PUCH_ODR_DLV_TIME;
		m_PUCH_ODR_START_TIME = i_PUCH_ODR_START_TIME;
		m_l_STATUS = i_l_STATUS;
		m_l_ACPT_NO = i_l_ACPT_NO;
		m_l_ACPT_QTY = i_l_ACPT_QTY;
		m_l_ACPT_DATE = i_l_ACPT_DATE;
		m_l_UNIT_COST = i_l_UNIT_COST;
		m_l_UNIT_COST_TYP = i_l_UNIT_COST_TYP;
		m_l_PUCH_ODR_AMOUNT = i_l_PUCH_ODR_AMOUNT;
		m_l_INSPECTED_QTY = i_l_INSPECTED_QTY;
		m_l_ACCEPTED_QTY = i_l_ACCEPTED_QTY;
		m_l_INSPEC_DATE = i_l_INSPEC_DATE;
		m_h_NET_AMOUNT = i_h_NET_AMOUNT;
		m_h_TAX_AMOUNT_1 = i_h_TAX_AMOUNT_1;
		m_h_TAX_AMOUNT_2 = i_h_TAX_AMOUNT_2;
		m_h_TAX_AMOUNT_3 = i_h_TAX_AMOUNT_3;
		m_h_DECIMAL_FIG = i_h_DECIMAL_FIG;
		m_h_ROUND_TYP = i_h_ROUND_TYP;
		m_h_PUCH_ODR_STS_TYP = i_h_PUCH_ODR_STS_TYP;
		m_h_PUCH_ODR_INST_SLIP_ISS_FLG = i_h_PUCH_ODR_INST_SLIP_ISS_FLG;
		m_h_ODR_CANCEL_SLIP_ISS_FLG = i_h_ODR_CANCEL_SLIP_ISS_FLG;
		m_h_INSPC_CMPLT_FLG = i_h_INSPC_CMPLT_FLG;
		m_h_ACPT_INSPC_TYP = i_h_ACPT_INSPC_TYP;
		m_h_NET_AMOUNT_LIST = i_h_NET_AMOUNT_LIST;
		m_h_TAX_AMOUNT_1_LIST = i_h_TAX_AMOUNT_1_LIST;
		m_h_TAX_AMOUNT_2_LIST = i_h_TAX_AMOUNT_2_LIST;
		m_h_TAX_AMOUNT_3_LIST = i_h_TAX_AMOUNT_3_LIST;
		m_h_UPDATE_FLG = i_h_UPDATE_FLG;
		m_h_MODIFY_COUNT = i_h_MODIFY_COUNT;
		m_h_MODIFY_COUNT_LIST = i_h_MODIFY_COUNT_LIST;
		m_h_EXCH_RATE = i_h_EXCH_RATE;
		m_h_EXCH_RATE_LIST = i_h_EXCH_RATE_LIST;
		m_h_TAX_CD = i_h_TAX_CD;
		m_h_PUCH_ODR_CD = i_h_PUCH_ODR_CD;
		m_NON_NO_ITEM_FLG = i_NON_NO_ITEM_FLG;
		m_ITEM_CD = i_ITEM_CD;
		m_VEND_CD = i_VEND_CD;
		m_PUCH_ODR_DLV_DATE = i_PUCH_ODR_DLV_DATE;
		m_TAX_CD = i_TAX_CD;
		m_PUCH_ODR_START_DATE = i_PUCH_ODR_START_DATE;
		m_PUCH_ODR_QTY = i_PUCH_ODR_QTY;
		m_UNIT_COST_TYP = i_UNIT_COST_TYP;
		m_UNIT_COST = i_UNIT_COST;
		m_ACPT_INSPC_TYP = i_ACPT_INSPC_TYP;
		m_PUCH_ODR_AMOUNT = i_PUCH_ODR_AMOUNT;
		m_RATE_JUDGE_DATE = i_RATE_JUDGE_DATE;
		m_NET_AMOUNT = i_NET_AMOUNT;
		m_TAX_AMOUNT_1 = i_TAX_AMOUNT_1;
		m_TAX_AMOUNT_2 = i_TAX_AMOUNT_2;
		m_TAX_AMOUNT_3 = i_TAX_AMOUNT_3;
		m_PUCH_ODR_STS_TYP = i_PUCH_ODR_STS_TYP;
		m_PUCH_ODR_INST_SLIP_ISS_FLG = i_PUCH_ODR_INST_SLIP_ISS_FLG;
		m_ODR_CANCEL_SLIP_ISS_FLG = i_ODR_CANCEL_SLIP_ISS_FLG;
		m_INSPC_CMPLT_FLG = i_INSPC_CMPLT_FLG;
		m_MODIFY_COUNT = i_MODIFY_COUNT;
		m_EXCH_RATE = i_EXCH_RATE;
		m_ITEM_NAME = i_ITEM_NAME;
		m_STOCK_UNIT = i_STOCK_UNIT;
		m_JOB_ODR_CD = i_JOB_ODR_CD;
		m_VEND_NAME = i_VEND_NAME;
		m_INSPC_ACPT_APP_TYP = i_INSPC_ACPT_APP_TYP;
		m_CUR_CD = i_CUR_CD;
		m_EXCH_TYP = i_EXCH_TYP;
		m_ROUND_TYP = i_ROUND_TYP;
		m_CUR_NAME = i_CUR_NAME;
		m_CUR_UNIT = i_CUR_UNIT;
		m_DECIMAL_FIG = i_DECIMAL_FIG;
		m_PUCH_ODR_CD = i_PUCH_ODR_CD;
		m_COMPANY_CD = i_COMPANY_CD;
		m_ACPT_NO = i_ACPT_NO;
		m_ACPT_QTY = i_ACPT_QTY;
		m_ACPT_DATE = i_ACPT_DATE;
		m_INSPECTED_QTY = i_INSPECTED_QTY;
		m_ACCEPTED_QTY = i_ACCEPTED_QTY;
		m_INSPEC_DATE = i_INSPEC_DATE;
		m_OLD_TAX_RATE_1 = i_OLD_TAX_RATE_1;
		m_OLD_TAX_RATE_2 = i_OLD_TAX_RATE_2;
		m_OLD_TAX_RATE_3 = i_OLD_TAX_RATE_3;
		m_NEW_TAX_RATE_START_DATE = i_NEW_TAX_RATE_START_DATE;
		m_NEW_TAX_RATE_1 = i_NEW_TAX_RATE_1;
		m_NEW_TAX_RATE_2 = i_NEW_TAX_RATE_2;
		m_NEW_TAX_RATE_3 = i_NEW_TAX_RATE_3;
		m_TAX_RATE_1 = i_TAX_RATE_1;
		m_TAX_RATE_2 = i_TAX_RATE_2;
		m_TAX_RATE_3 = i_TAX_RATE_3;
		m_AMOUNT_INCLUDE_TAX = i_AMOUNT_INCLUDE_TAX;
		m_HOME_CUR_AMOUNT = i_HOME_CUR_AMOUNT;
		m_TAX_ROUND_TYP = i_TAX_ROUND_TYP;
		m_INSPC_ACPT_NO = i_INSPC_ACPT_NO;
		m_INSPC_ACPT_GNR_TYP = i_INSPC_ACPT_GNR_TYP;
		m_CRCT_NO = i_CRCT_NO;
		m_CRCT_TYP = i_CRCT_TYP;
		m_SLIP_TYP = i_SLIP_TYP;
		m_WORK_IN_PROC_CD = i_WORK_IN_PROC_CD;
		m_PLANT_CD = i_PLANT_CD;
		m_PROCESSING_COST = i_PROCESSING_COST;
		m_MATERIAL_COST = i_MATERIAL_COST;
		m_OTHER_OVERHEADS = i_OTHER_OVERHEADS;
		m_INSPC_ACPT_QTY = i_INSPC_ACPT_QTY;
		m_INSPC_ACPT_AMOUNT = i_INSPC_ACPT_AMOUNT;
		m_SAVING_AMOUNT = i_SAVING_AMOUNT;
		m_INSPC_ACPT_DATE = i_INSPC_ACPT_DATE;
		m_PRODUCT_TYP = i_PRODUCT_TYP;
		m_DLV_CD = i_DLV_CD;
		m_DISC_AMOUNT = i_DISC_AMOUNT;
		m_GNR_ORG_CD = i_GNR_ORG_CD;
		m_SBCNT_PUCH_TYP = i_SBCNT_PUCH_TYP;
		m_JOB_ODR_DETAIL_NO = i_JOB_ODR_DETAIL_NO;
		m_CLASIFICATION_CD = i_CLASIFICATION_CD;
		m_INV_CTRL_FLG = i_INV_CTRL_FLG;
		m_PUCH_RTN_FLG = i_PUCH_RTN_FLG;
		m_APPR_FLG = i_APPR_FLG;
		m_APPR_ID = i_APPR_ID;
		m_APPR_DATE = i_APPR_DATE;
		m_RESERVE_CAUSE = i_RESERVE_CAUSE;
		m_SLIP_CTRL_GRP = i_SLIP_CTRL_GRP;
		m_SLIP_DATE = i_SLIP_DATE;
		m_SLIP_CD = i_SLIP_CD;
		m_SEQ_NO = i_SEQ_NO;
		m_NET_AMOUNT_YEN = i_NET_AMOUNT_YEN;
		m_AMOUNT = i_AMOUNT;
		m_TAX_TYP = i_TAX_TYP;
		m_TAX_AMOUNT = i_TAX_AMOUNT;
		m_GROSS_AMOUNT = i_GROSS_AMOUNT;
		m_TAX_AMOUNT_YEN = i_TAX_AMOUNT_YEN;
		m_GROSS_AMOUNT_YEN = i_GROSS_AMOUNT_YEN;
		m_SUM_TAX_AMOUNT = i_SUM_TAX_AMOUNT;
		m_SUM_GROSS_AMOUNT = i_SUM_GROSS_AMOUNT;
		m_SUM_NET_AMOUNT = i_SUM_NET_AMOUNT;
		m_TAX_TOTAL = i_TAX_TOTAL;
		m_GROSS_TOTAL = i_GROSS_TOTAL;
		m_NET_TOTAL = i_NET_TOTAL;
		m_LINE_NO = i_LINE_NO;
		m_LINE_TYP = i_LINE_TYP;
		m_TAX_AMOUNT_CTRL_FLG = i_TAX_AMOUNT_CTRL_FLG;
		m_UNIT_COST_YEN = i_UNIT_COST_YEN;
		m_PROCESSING_COST_YEN = i_PROCESSING_COST_YEN;
		m_MATERIAL_COST_YEN = i_MATERIAL_COST_YEN;
		m_OTHER_OVERHEADS_YEN = i_OTHER_OVERHEADS_YEN;
		m_DR_ACCT_CD = i_DR_ACCT_CD;
		m_DR_SUB_ACCT_CD = i_DR_SUB_ACCT_CD;
		m_DR_ORG_CD = i_DR_ORG_CD;
		m_CR_ACCT_CD = i_CR_ACCT_CD;
		m_CR_SUB_ACCT_CD = i_CR_SUB_ACCT_CD;
		m_CR_ORG_CD = i_CR_ORG_CD;
		m_FIXED_ASSETS_CD = i_FIXED_ASSETS_CD;
		m_SUB_FIXED_ASSETS_CD = i_SUB_FIXED_ASSETS_CD;
		m_DETAIL_NO = i_DETAIL_NO;
		m_COMM_PUCH_ODR_LINE_NO = i_COMM_PUCH_ODR_LINE_NO;
		m_ARV_RSLT_LINE_NO = i_ARV_RSLT_LINE_NO;
		m_STOCK_CTRL_FLG = i_STOCK_CTRL_FLG;
		m_REMARKS = i_REMARKS;
		m_INSPC_ACPT_CRCT_TYP = i_INSPC_ACPT_CRCT_TYP;
		m_ORGN_SLIP_CTRL_GRP = i_ORGN_SLIP_CTRL_GRP;
		m_ORGN_SLIP_CD = i_ORGN_SLIP_CD;
		m_ORGN_SLIP_DATE = i_ORGN_SLIP_DATE;
		m_SLIP_TRN_CD = i_SLIP_TRN_CD;
		m_STOCK_CLASS_CD = i_STOCK_CLASS_CD;
		m_BALANCE_CLASS_CD = i_BALANCE_CLASS_CD;
		m_PUCH_ODR_ORG_CD = i_PUCH_ODR_ORG_CD;
		m_PUCH_ODR_PERSON_CD = i_PUCH_ODR_PERSON_CD;
		m_WH_CD = i_WH_CD;
		m_SHIP_WH_CD = i_SHIP_WH_CD;
		m_PAYEE_CD = i_PAYEE_CD;
		m_SLIP_CTRL_ORG_CD = i_SLIP_CTRL_ORG_CD;
		m_CLOSING_CTRL_ORG_CD = i_CLOSING_CTRL_ORG_CD;
		m_PAY_CALC_CTRL_ORG_CD = i_PAY_CALC_CTRL_ORG_CD;
		m_PAY_FIX_CTRL_ORG_CD = i_PAY_FIX_CTRL_ORG_CD;
		m_EXPL_TYP = i_EXPL_TYP;
		m_EXPL_CD = i_EXPL_CD;
		m_EXPL_NAME = i_EXPL_NAME;
		m_ODR_CD = i_ODR_CD;
		m_COMM_PUCH_ODR_SLIP_TYP = i_COMM_PUCH_ODR_SLIP_TYP;
		m_COMM_PUCH_ODR_SLIP_CTRL_GRP = i_COMM_PUCH_ODR_SLIP_CTRL_GRP;
		m_COMM_PUCH_ODR_SLIP_CD = i_COMM_PUCH_ODR_SLIP_CD;
		m_COMM_PUCH_ODR_SLIP_DATE = i_COMM_PUCH_ODR_SLIP_DATE;
		m_ARV_RSLT_SLIP_TYP = i_ARV_RSLT_SLIP_TYP;
		m_ARV_RSLT_SLIP_CTRL_GRP = i_ARV_RSLT_SLIP_CTRL_GRP;
		m_ARV_RSLT_SLIP_CD = i_ARV_RSLT_SLIP_CD;
		m_ARV_RSLT_SLIP_DATE = i_ARV_RSLT_SLIP_DATE;
		m_PUCH_RSLT_SLIP_ID = i_PUCH_RSLT_SLIP_ID;
		m_TAX_CALC_TYP = i_TAX_CALC_TYP;
		m_TAX_APPLY_TYP = i_TAX_APPLY_TYP;
		m_TEMP_UNIT_COST_PUCH_RSLT_FLG = i_TEMP_UNIT_COST_PUCH_RSLT_FLG;
		m_UNIT_COST_ZERO_INSPC_ACPT_FLG = i_UNIT_COST_ZERO_INSPC_ACPT_FLG;
		m_IMPORT_TRN_TYP = i_IMPORT_TRN_TYP;
		m_PAY_CYCLE_TYP = i_PAY_CYCLE_TYP;
		m_DEADLINE_DATE = i_DEADLINE_DATE;
		m_PAY_SCH_DATE = i_PAY_SCH_DATE;
		m_PAY_PATTERN_CD = i_PAY_PATTERN_CD;
		m_EXCH_RSRV_CD = i_EXCH_RSRV_CD;
		m_EXCH_DATE = i_EXCH_DATE;
		m_PUR_RSLT_SLIP_ISSUE_FLG = i_PUR_RSLT_SLIP_ISSUE_FLG;
		m_PUR_RSLT_REP_ISSUE_FLG = i_PUR_RSLT_REP_ISSUE_FLG;
		m_ACPT_ARV_MODIFICATION_FLG = i_ACPT_ARV_MODIFICATION_FLG;
		m_INSPC_ACPT_MODIFICATION_FLG = i_INSPC_ACPT_MODIFICATION_FLG;
		m_STATUS = i_STATUS;
		m_CRCT_FLG = i_CRCT_FLG;
		m_APPROVAL_DATE = i_APPROVAL_DATE;
		m_APPROVAL_CD = i_APPROVAL_CD;
		m_APPROVAL_RSRV_DATE = i_APPROVAL_RSRV_DATE;
		m_APPROVAL_RSRV_CD = i_APPROVAL_RSRV_CD;
		m_RSN_CD = i_RSN_CD;
		m_RECORDING_DATE = i_RECORDING_DATE;
		m_RECORDING_MONTH = i_RECORDING_MONTH;
		m_ORGN_RECORDING_DATE = i_ORGN_RECORDING_DATE;
		m_ORGN_RECORDING_MONTH = i_ORGN_RECORDING_MONTH;
		m_RECORDING_PROC_DATE = i_RECORDING_PROC_DATE;
		m_RECORDING_PROC_CD = i_RECORDING_PROC_CD;
		m_CLOSING_RSRV_DATE = i_CLOSING_RSRV_DATE;
		m_CLOSING_RSRV_CD = i_CLOSING_RSRV_CD;
		m_CLOSING_DATE = i_CLOSING_DATE;
		m_CLOSING_CD = i_CLOSING_CD;
		m_PAY_FIX_DATE = i_PAY_FIX_DATE;
		m_PAY_FIX_CD = i_PAY_FIX_CD;
		m_DEBT_BALANCE_OUT_FLG = i_DEBT_BALANCE_OUT_FLG;
		m_DEBT_BALANCE_OUT_DATE = i_DEBT_BALANCE_OUT_DATE;
		m_MONTH = i_MONTH;
		m_ACCT_CD = i_ACCT_CD;
		m_SUB_ACCT_CD = i_SUB_ACCT_CD;
		m_ORG_CD = i_ORG_CD;
		m_DATA_TYP = i_DATA_TYP;
		m_GL_IF_OUT_FLG = i_GL_IF_OUT_FLG;
		m_BALANCE_UPD_FLG = i_BALANCE_UPD_FLG;
		m_BALANCE_UPD_DATE = i_BALANCE_UPD_DATE;
		m_RECORDING_AMOUNT = i_RECORDING_AMOUNT;
		m_DEBT_AMOUNT = i_DEBT_AMOUNT;
		m_REBATE_AMOUNT = i_REBATE_AMOUNT;
		m_RETURNED_GOODS_AMOUNT = i_RETURNED_GOODS_AMOUNT;
		m_RECORDING_AMOUNT_YEN = i_RECORDING_AMOUNT_YEN;
		m_DEBT_AMOUNT_YEN = i_DEBT_AMOUNT_YEN;
		m_SAVING_AMOUNT_YEN = i_SAVING_AMOUNT_YEN;
		m_REBATE_AMOUNT_YEN = i_REBATE_AMOUNT_YEN;
		m_RETURNED_GOODS_AMOUNT_YEN = i_RETURNED_GOODS_AMOUNT_YEN;
		m_INSPC_ACPT_AMOUNT_YEN = i_INSPC_ACPT_AMOUNT_YEN;
		m_EXCH_DIFF_AMOUNT_YEN = i_EXCH_DIFF_AMOUNT_YEN;
		m_OPTION_ID = i_OPTION_ID;
		m_OWN_CUR_CD = i_OWN_CUR_CD;
		m_THIS_MONTH = i_THIS_MONTH;
		m_HOME_DECIMAL_FIG = i_HOME_DECIMAL_FIG;
		m_HOME_CUR_CD = i_HOME_CUR_CD;
		m_TIME_CTRL = i_TIME_CTRL;
	}
		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
