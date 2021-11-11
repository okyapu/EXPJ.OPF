/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0060/src/com/nec/jp/orteus/metamorBase/AE0060/AE0060010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0060;

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
//}}user_implement_code_header

public class AE0060010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_h_PUCH_ODR_CD */
	public String m_h_PUCH_ODR_CD = null;
	/** 第 2 変数： m_c_COMPLETE */
	public String m_c_COMPLETE = null;
	/** 第 3 変数： m_UNIT_COST_TYP_name */
	public String m_UNIT_COST_TYP_name = null;
	/** 第 4 変数： m_UNIT_COST_TYP_val */
	public String m_UNIT_COST_TYP_val = null;
	/** 第 5 変数： m_HOME_CUR_UNIT */
	public String m_HOME_CUR_UNIT = null;
	/** 第 6 変数： m_ACPT_INSPC_TYP_DN */
	public String m_ACPT_INSPC_TYP_DN = null;
	/** 第 7 変数： m_SPL_ITEM_TYP_DN */
	public String m_SPL_ITEM_TYP_DN = null;
	/** 第 8 変数： m_PRODUCT_TYP_DN */
	public String m_PRODUCT_TYP_DN = null;
	/** 第 9 変数： m_PUCH_ODR_STS_TYP_DN */
	public String m_PUCH_ODR_STS_TYP_DN = null;
	/** 第 10 変数： m_NON_NO_ITEM_FLG_DN */
	public String m_NON_NO_ITEM_FLG_DN = null;
	/** 第 11 変数： m_INSPC_CMPLT_FLG_DN */
	public String m_INSPC_CMPLT_FLG_DN = null;
	/** 第 12 変数： m_SelectUnitCostFlag */
	public String m_SelectUnitCostFlag = null;
	/** 第 13 変数： m_UNIT_QTY_TYP_DN */
	public String m_UNIT_QTY_TYP_DN = null;
	/** 第 14 変数： m_c_CANCEL */
	public String m_c_CANCEL = null;
	/** 第 15 変数： m_h_ACPT_QTY */
	public String m_h_ACPT_QTY = null;
	/** 第 16 変数： m_h_ODR_CANCEL_SLIP_ISS_FLG */
	public String m_h_ODR_CANCEL_SLIP_ISS_FLG = null;
	/** 第 17 変数： m_ITEM_CD_DW */
	public String m_ITEM_CD_DW = null;
	/** 第 18 変数： m_ITEM_NAME_DW */
	public String m_ITEM_NAME_DW = null;
	/** 第 19 変数： m_h_LOTCTRL */
	public String m_h_LOTCTRL = null;
	/** 第 20 変数： m_param1 */
	public String m_param1 = null;
	/** 第 21 変数： m_param2 */
	public String m_param2 = null;
	/** 第 22 変数： m_param3 */
	public String m_param3 = null;
	/** 第 23 変数： m_h_LOT_NO */
	public String m_h_LOT_NO = null;
	/** 第 24 変数： m_h_PUCH_ODR_CD_1 */
	public String m_h_PUCH_ODR_CD_1 = null;
	/** 第 25 変数： m_HOME_DECIMAL_FIG */
	public String m_HOME_DECIMAL_FIG = null;
	/** 第 26 変数： m_PUCH_ODR_CD */
	public String m_PUCH_ODR_CD = null;
	/** 第 27 変数： m_ACPT_NO */
	public String m_ACPT_NO = null;
	/** 第 28 変数： m_ACPT_QTY */
	public String m_ACPT_QTY = null;
	/** 第 29 変数： m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** 第 30 変数： m_NON_NO_ITEM_NAME */
	public String m_NON_NO_ITEM_NAME = null;
	/** 第 31 変数： m_ACPT_DATE */
	public String m_ACPT_DATE = null;
	/** 第 32 変数： m_VEND_LOT_NO */
	public String m_VEND_LOT_NO = null;
	/** 第 33 変数： m_WH_CD */
	public String m_WH_CD = null;
	/** 第 34 変数： m_WH_NAME */
	public String m_WH_NAME = null;
	/** 第 35 変数： m_CUR_CD */
	public String m_CUR_CD = null;
	/** 第 36 変数： m_CUR_NAME */
	public String m_CUR_NAME = null;
	/** 第 37 変数： m_VEND_CUR_UNIT */
	public String m_VEND_CUR_UNIT = null;
	/** 第 38 変数： m_VEND_DECIMAL_FIG */
	public String m_VEND_DECIMAL_FIG = null;
	/** 第 39 変数： m_UNIT_COST_TYP */
	public String m_UNIT_COST_TYP = null;
	/** 第 40 変数： m_UNIT_COST */
	public String m_UNIT_COST = null;
	/** 第 41 変数： m_PROCESSING_COST */
	public String m_PROCESSING_COST = null;
	/** 第 42 変数： m_MATERIAL_COST */
	public String m_MATERIAL_COST = null;
	/** 第 43 変数： m_OTHER_OVERHEADS */
	public String m_OTHER_OVERHEADS = null;
	/** 第 44 変数： m_PUCH_ODR_AMOUNT */
	public String m_PUCH_ODR_AMOUNT = null;
	/** 第 45 変数： m_DISC_AMOUNT */
	public String m_DISC_AMOUNT = null;
	/** 第 46 変数： m_NET_AMOUNT */
	public String m_NET_AMOUNT = null;
	/** 第 47 変数： m_TAX_AMOUNT_1 */
	public String m_TAX_AMOUNT_1 = null;
	/** 第 48 変数： m_TAX_AMOUNT_2 */
	public String m_TAX_AMOUNT_2 = null;
	/** 第 49 変数： m_TAX_AMOUNT_3 */
	public String m_TAX_AMOUNT_3 = null;
	/** 第 50 変数： m_TAX_RATE_1 */
	public String m_TAX_RATE_1 = null;
	/** 第 51 変数： m_TAX_RATE_2 */
	public String m_TAX_RATE_2 = null;
	/** 第 52 変数： m_TAX_RATE_3 */
	public String m_TAX_RATE_3 = null;
	/** 第 53 変数： m_AMOUNT_INCLUDE_TAX */
	public String m_AMOUNT_INCLUDE_TAX = null;
	/** 第 54 変数： m_HOME_CUR_AMOUNT */
	public String m_HOME_CUR_AMOUNT = null;
	/** 第 55 変数： m_EXCH_RATE */
	public String m_EXCH_RATE = null;
	/** 第 56 変数： m_DLV_CD */
	public String m_DLV_CD = null;
	/** 第 57 変数： m_ACPT_RSLT_COMMENT */
	public String m_ACPT_RSLT_COMMENT = null;
	/** 第 58 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 59 変数： m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** 第 60 変数： m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** 第 61 変数： m_DRAW_CD */
	public String m_DRAW_CD = null;
	/** 第 62 変数： m_SPEC */
	public String m_SPEC = null;
	/** 第 63 変数： m_UNIT_QTY_TYP */
	public String m_UNIT_QTY_TYP = null;
	/** 第 64 変数： m_VEND_CD */
	public String m_VEND_CD = null;
	/** 第 65 変数： m_VEND_NAME */
	public String m_VEND_NAME = null;
	/** 第 66 変数： m_PUCH_ODR_QTY */
	public String m_PUCH_ODR_QTY = null;
	/** 第 67 変数： m_SUM_ACPT_QTY */
	public String m_SUM_ACPT_QTY = null;
	/** 第 68 変数： m_ACPT_INSPC_TYP */
	public String m_ACPT_INSPC_TYP = null;
	/** 第 69 変数： m_PUCH_ODR_SLIP_ISS_DATE */
	public String m_PUCH_ODR_SLIP_ISS_DATE = null;
	/** 第 70 変数： m_PUCH_ODR_DLV_DATE */
	public String m_PUCH_ODR_DLV_DATE = null;
	/** 第 71 変数： m_CONFIRM_DLV_DATE */
	public String m_CONFIRM_DLV_DATE = null;
	/** 第 72 変数： m_WORK_IN_PROC_CD */
	public String m_WORK_IN_PROC_CD = null;
	/** 第 73 変数： m_PROC_NAME */
	public String m_PROC_NAME = null;
	/** 第 74 変数： m_PUCH_ODR_PERSON */
	public String m_PUCH_ODR_PERSON = null;
	/** 第 75 変数： m_USER_NAME */
	public String m_USER_NAME = null;
	/** 第 76 変数： m_PUCH_ODR_STS_TYP */
	public String m_PUCH_ODR_STS_TYP = null;
	/** 第 77 変数： m_INSPC_CMPLT_FLG */
	public String m_INSPC_CMPLT_FLG = null;
	/** 第 78 変数： m_SPL_ITEM_TYP */
	public String m_SPL_ITEM_TYP = null;
	/** 第 79 変数： m_PRODUCT_TYP */
	public String m_PRODUCT_TYP = null;
	/** 第 80 変数： m_NON_NO_ITEM_FLG */
	public String m_NON_NO_ITEM_FLG = null;
	/** 第 81 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** 第 82 変数： m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** 第 83 変数： m_TAX_CD */
	public String m_TAX_CD = null;
	/** 第 84 変数： m_ROUND_TYP */
	public String m_ROUND_TYP = null;
	/** 第 85 変数： m_TAX_ROUND_TYP */
	public String m_TAX_ROUND_TYP = null;
	/** 第 86 変数： m_PUCH_ODR_START_DATE */
	public String m_PUCH_ODR_START_DATE = null;
	/** 第 87 変数： m_BUSINESS_OPR_DATE */
	public String m_BUSINESS_OPR_DATE = null;
	/** 第 88 変数： m_PUCH_ODR_MODIFY_COUNT */
	public String m_PUCH_ODR_MODIFY_COUNT = null;
	/** 第 89 変数： m_ODR_CANCEL_CAUSE_CD */
	public String m_ODR_CANCEL_CAUSE_CD = null;
	/** 第 90 変数： m_ODR_CANCEL_SLIP_ISS_FLG */
	public String m_ODR_CANCEL_SLIP_ISS_FLG = null;
	/** 第 91 変数： m_PUCH_ODR_COMMENT */
	public String m_PUCH_ODR_COMMENT = null;
	/** 第 92 変数： m_h_LOT_CTRL_FLG */
	public String m_h_LOT_CTRL_FLG = null;
	/** 第 93 変数： m_h_LOT_NUMBERING_TYP */
	public String m_h_LOT_NUMBERING_TYP = null;
	/** 第 94 変数： m_h_WORK_ODR_CD */
	public String m_h_WORK_ODR_CD = null;
	/** 第 95 変数： m_h_FINAL_PROC_CD */
	public String m_h_FINAL_PROC_CD = null;
	/** 第 96 変数： m_h_DATE_FLG */
	public String m_h_DATE_FLG = null;
	/** 第 97 変数： m_ACPT_STS_TYP */
	public String m_ACPT_STS_TYP = null;
	/** 第 98 変数： m_INSPC_WH_CD */
	public String m_INSPC_WH_CD = null;
	/** 第 99 変数： m_LOT_NO */
	public String m_LOT_NO = null;
	/** 第 100 変数： m_INSPC_CMPLT_DATE */
	public String m_INSPC_CMPLT_DATE = null;
	/** 第 101 変数： m_readISSUE_INST_CD */
	public String m_readISSUE_INST_CD = null;
	/** 第 102 変数： m_readPLANT_CD */
	public String m_readPLANT_CD = null;
	/** 第 103 変数： m_readOD_NO */
	public String m_readOD_NO = null;
	/** 第 104 変数： m_readITEM_CD */
	public String m_readITEM_CD = null;
	/** 第 105 変数： m_readPUCH_ODR_CD */
	public String m_readPUCH_ODR_CD = null;
	/** 第 106 変数： m_readCOMPANY_CD */
	public String m_readCOMPANY_CD = null;
	/** 第 107 変数： m_readVEND_CD */
	public String m_readVEND_CD = null;
	/** 第 108 変数： m_readCONS_TYP */
	public String m_readCONS_TYP = null;
	/** 第 109 変数： m_readISSUE_INST_UNIT_DENOMINATOR */
	public String m_readISSUE_INST_UNIT_DENOMINATOR = null;
	/** 第 110 変数： m_readISSUE_INST_UNIT_NUMERATOR */
	public String m_readISSUE_INST_UNIT_NUMERATOR = null;
	/** 第 111 変数： m_readJOB_ODR_CD */
	public String m_readJOB_ODR_CD = null;
	/** 第 112 変数： m_readJOB_ODR_DETAIL_NO */
	public String m_readJOB_ODR_DETAIL_NO = null;
	/** 第 113 変数： m_readMRP_ODR_TYP */
	public String m_readMRP_ODR_TYP = null;
	/** 第 114 変数： m_readUNIT_QTY_TYP */
	public String m_readUNIT_QTY_TYP = null;
	/** 第 115 変数： m_readLOT_CONTROL_FLG */
	public String m_readLOT_CONTROL_FLG = null;
	/** 第 116 変数： m_setPUCH_ODR_CD */
	public String m_setPUCH_ODR_CD = null;
	/** 第 117 変数： m_setACPT_NO */
	public String m_setACPT_NO = null;
	/** 第 118 変数： m_setITEM_CD */
	public String m_setITEM_CD = null;
	/** 第 119 変数： m_setACPT_QTY */
	public String m_setACPT_QTY = null;
	/** 第 120 変数： m_setCOMPANY_CD */
	public String m_setCOMPANY_CD = null;
	/** 第 121 変数： m_setVEND_CD */
	public String m_setVEND_CD = null;
	/** 第 122 変数： m_setJOB_ODR_CD */
	public String m_setJOB_ODR_CD = null;
	/** 第 123 変数： m_setJOB_ODR_DETAIL_NO */
	public String m_setJOB_ODR_DETAIL_NO = null;
	/** 第 124 変数： m_setPLANT_CD */
	public String m_setPLANT_CD = null;
	/** 第 125 変数： m_setISSUE_INST_CD */
	public String m_setISSUE_INST_CD = null;
	/** 第 126 変数： m_setMRP_ODR_TYP */
	public String m_setMRP_ODR_TYP = null;
	/** 第 127 変数： m_setSUPPLIED_ISSUE_GNR_TYP */
	public String m_setSUPPLIED_ISSUE_GNR_TYP = null;
	/** 第 128 変数： m_setSUPPLIED_ISSUE_QTY */
	public String m_setSUPPLIED_ISSUE_QTY = null;
	/** 第 129 変数： m_setTOTAL_ISSUE_QTY */
	public String m_setTOTAL_ISSUE_QTY = null;
	/** 第 130 変数： m_setSUPPLIED_UNIT_DENOMINATOR */
	public String m_setSUPPLIED_UNIT_DENOMINATOR = null;
	/** 第 131 変数： m_setSUPPLIED_UNIT_NUMERATOR */
	public String m_setSUPPLIED_UNIT_NUMERATOR = null;
	/** 第 132 変数： m_setSUPPLIED_DATE */
	public String m_setSUPPLIED_DATE = null;
	/** 第 133 変数： m_setPART_SUPPLIED_COMMENT */
	public String m_setPART_SUPPLIED_COMMENT = null;
	/** 第 134 変数： m_readSTOCK_ON_HAND_QTY */
	public String m_readSTOCK_ON_HAND_QTY = null;
	/** 第 135 変数： m_setWH_CD */
	public String m_setWH_CD = null;
	/** 第 136 変数： m_readWH_CD */
	public String m_readWH_CD = null;
	/** 第 137 変数： m_setSTOCK_ON_HAND_QTY */
	public String m_setSTOCK_ON_HAND_QTY = null;
	/** 第 138 変数： m_setRCV_ISSUE_CTRL_CD */
	public String m_setRCV_ISSUE_CTRL_CD = null;
	/** 第 139 変数： m_setRCV_ISSUE_TYP */
	public String m_setRCV_ISSUE_TYP = null;
	/** 第 140 変数： m_setACPT_RSLT_CRCT_NO */
	public String m_setACPT_RSLT_CRCT_NO = null;
	/** 第 141 変数： m_setINSPEC_RSLT_CRCT_NO */
	public String m_setINSPEC_RSLT_CRCT_NO = null;
	/** 第 142 変数： m_setWORK_ODR_CD */
	public String m_setWORK_ODR_CD = null;
	/** 第 143 変数： m_setWORK_IN_PROC_CD */
	public String m_setWORK_IN_PROC_CD = null;
	/** 第 144 変数： m_setPARTIAL_PRD_NO */
	public String m_setPARTIAL_PRD_NO = null;
	/** 第 145 変数： m_setOPR_RSLT_CRCT_NO */
	public String m_setOPR_RSLT_CRCT_NO = null;
	/** 第 146 変数： m_setRCV_ISSUE_BEFORE_QTY */
	public String m_setRCV_ISSUE_BEFORE_QTY = null;
	/** 第 147 変数： m_setRCV_ISSUE_QTY */
	public String m_setRCV_ISSUE_QTY = null;
	/** 第 148 変数： m_setRCV_ISSUE_AFTER_QTY */
	public String m_setRCV_ISSUE_AFTER_QTY = null;
	/** 第 149 変数： m_setRCV_ISSUE_AMOUNT */
	public String m_setRCV_ISSUE_AMOUNT = null;
	/** 第 150 変数： m_setRCV_ISSUE_DATE */
	public String m_setRCV_ISSUE_DATE = null;
	/** 第 151 変数： m_setRCV_ISSUE_GNR_TYP */
	public String m_setRCV_ISSUE_GNR_TYP = null;
	/** 第 152 変数： m_setRCV_ISSUE_ODD_QTY */
	public String m_setRCV_ISSUE_ODD_QTY = null;
	/** 第 153 変数： m_setDEFECT_CAUSE_CD */
	public String m_setDEFECT_CAUSE_CD = null;
	/** 第 154 変数： m_setSTOCK_UPD_TYP */
	public String m_setSTOCK_UPD_TYP = null;
	/** 第 155 変数： m_setRCV_ISSUE_CMPLT_FLG */
	public String m_setRCV_ISSUE_CMPLT_FLG = null;
	/** 第 156 変数： m_setOD_NO */
	public String m_setOD_NO = null;
	/** 第 157 変数： m_setLOT_NO */
	public String m_setLOT_NO = null;
	/** 第 158 変数： m_setVEND_LOT_NO */
	public String m_setVEND_LOT_NO = null;
	/** 第 159 変数： m_setRCV_ISSUE_COMMENT */
	public String m_setRCV_ISSUE_COMMENT = null;
	/** 第 160 変数： m_setCONS_TYP */
	public String m_setCONS_TYP = null;
	/** 第 161 変数： m_setCONS_EXEC_DATE */
	public String m_setCONS_EXEC_DATE = null;
	/** 第 162 変数： m_THIS_MONTH */
	public String m_THIS_MONTH = null;
	/** 第 163 変数： m_INSTALL_FLG */
	public String m_INSTALL_FLG = null;
	/** 第 164 変数： m_readSUPPLIED_ISSUE_QTY */
	public String m_readSUPPLIED_ISSUE_QTY = null;
	/** 第 165 変数： m_readTOTAL_ISSUE_QTY */
	public String m_readTOTAL_ISSUE_QTY = null;
	/** 第 166 変数： m_readSUPPLIED_UNIT_DENOMINATOR */
	public String m_readSUPPLIED_UNIT_DENOMINATOR = null;
	/** 第 167 変数： m_readSUPPLIED_UNIT_NUMERATOR */
	public String m_readSUPPLIED_UNIT_NUMERATOR = null;
	/** 第 168 変数： m_PROC_EXEC_DATE */
	public BigDecimal m_PROC_EXEC_DATE = null;
	/** 第 169 変数： m_PAST_RESULT_ENTRY_TYP */
	public String m_PAST_RESULT_ENTRY_TYP = null;
	/** 第 170 変数： m_INSPC_WH_NAME */
	public String m_INSPC_WH_NAME = null;
	/** 第 171 変数： m_ISSUE_INST_CD */
	public String m_ISSUE_INST_CD = null;
	/** 第 172 変数： m_readLOT_NO */
	public String m_readLOT_NO = null;
	/** 第 173 変数： m_readQTY */
	public String m_readQTY = null;
	/** 第 174 変数： m_BEST_BEFORE_DATE */
	public String m_BEST_BEFORE_DATE = null;
	/** 第 175 変数： m_setSEQ_NO */
	public String m_setSEQ_NO = null;
	/** 第 176 変数： m_readSUPPLIED_DATE */
	public String m_readSUPPLIED_DATE = null;
	/** 第 177 変数： m_setSPENT_QTY */
	public String m_setSPENT_QTY = null;
	/** 第 178 変数： m_NEXTVAL */
	public String m_NEXTVAL = null;
	/** 第 179 変数： m_OD_NO */
	public String m_OD_NO = null;
	/** 第 180 変数： m_ODR_QTY */
	public String m_ODR_QTY = null;
	/** 第 181 変数： m_PVC2BUSINESSNAME */
	public String m_PVC2BUSINESSNAME = null;
	/** 第 182 変数： m_PVC2OUTPUTPATH */
	public String m_PVC2OUTPUTPATH = null;
	/** 第 183 変数： m_PVC2OUTPUTNAME */
	public String m_PVC2OUTPUTNAME = null;
	/** 第 184 変数： m_PVC2LOGMODE */
	public String m_PVC2LOGMODE = null;
	/** 第 185 変数： m_PVC2OUTPUTMODE */
	public String m_PVC2OUTPUTMODE = null;
	/** 第 186 変数： m_PVC2USERID */
	public String m_PVC2USERID = null;
	/** 第 187 変数： m_PVC2PLANTCD */
	public String m_PVC2PLANTCD = null;
	/** 第 188 変数： m_PVC2TAXID */
	public String m_PVC2TAXID = null;
	/** 第 189 変数： m_PNUMTAXOUTAMOUNT */
	public String m_PNUMTAXOUTAMOUNT = null;
	/** 第 190 変数： m_PNUMTAXAMOUNT */
	public String m_PNUMTAXAMOUNT = null;
	/** 第 191 変数： m_PNUMEXTERNALTAXSALESAMOUNT */
	public String m_PNUMEXTERNALTAXSALESAMOUNT = null;
	/** 第 192 変数： m_PNUMINTERNALTAXSALESAMOUNT */
	public String m_PNUMINTERNALTAXSALESAMOUNT = null;
	/** 第 193 変数： m_PNUMTAXFREESALESAMOUNT */
	public String m_PNUMTAXFREESALESAMOUNT = null;
	/** 第 194 変数： m_PNUMEXTERNALTAXAMOUNT */
	public String m_PNUMEXTERNALTAXAMOUNT = null;
	/** 第 195 変数： m_PNUMINTERNALTAXAMOUNT */
	public String m_PNUMINTERNALTAXAMOUNT = null;
	/** 第 196 変数： m_PVC2ERRCD */
	public String m_PVC2ERRCD = null;
	/** 第 197 変数： m_PNUMSTATUS */
	public String m_PNUMSTATUS = null;
	/** 第 198 変数： m_FROM_PUCH_ODR_CD */
	public String m_FROM_PUCH_ODR_CD = null;
	/** 第 199 変数： m_TO_PUCH_ODR_CD */
	public String m_TO_PUCH_ODR_CD = null;
	/** 第 200 変数： m_FROM_ITEM_CD */
	public String m_FROM_ITEM_CD = null;
	/** 第 201 変数： m_FROM_LOT_NO */
	public String m_FROM_LOT_NO = null;
	/** 第 202 変数： m_TO_ITEM_CD */
	public String m_TO_ITEM_CD = null;
	/** 第 203 変数： m_TO_LOT_NO */
	public String m_TO_LOT_NO = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_h_PUCH_ODR_CD */
	public List l_h_PUCH_ODR_CD = null;

	/** 第 2 List変数： l_c_COMPLETE */
	public List l_c_COMPLETE = null;

	/** 第 3 List変数： l_UNIT_COST_TYP_name */
	public List l_UNIT_COST_TYP_name = null;

	/** 第 4 List変数： l_UNIT_COST_TYP_val */
	public List l_UNIT_COST_TYP_val = null;

	/** 第 5 List変数： l_HOME_CUR_UNIT */
	public List l_HOME_CUR_UNIT = null;

	/** 第 6 List変数： l_ACPT_INSPC_TYP_DN */
	public List l_ACPT_INSPC_TYP_DN = null;

	/** 第 7 List変数： l_SPL_ITEM_TYP_DN */
	public List l_SPL_ITEM_TYP_DN = null;

	/** 第 8 List変数： l_PRODUCT_TYP_DN */
	public List l_PRODUCT_TYP_DN = null;

	/** 第 9 List変数： l_PUCH_ODR_STS_TYP_DN */
	public List l_PUCH_ODR_STS_TYP_DN = null;

	/** 第 10 List変数： l_NON_NO_ITEM_FLG_DN */
	public List l_NON_NO_ITEM_FLG_DN = null;

	/** 第 11 List変数： l_INSPC_CMPLT_FLG_DN */
	public List l_INSPC_CMPLT_FLG_DN = null;

	/** 第 12 List変数： l_SelectUnitCostFlag */
	public List l_SelectUnitCostFlag = null;

	/** 第 13 List変数： l_UNIT_QTY_TYP_DN */
	public List l_UNIT_QTY_TYP_DN = null;

	/** 第 14 List変数： l_c_CANCEL */
	public List l_c_CANCEL = null;

	/** 第 15 List変数： l_h_ACPT_QTY */
	public List l_h_ACPT_QTY = null;

	/** 第 16 List変数： l_h_ODR_CANCEL_SLIP_ISS_FLG */
	public List l_h_ODR_CANCEL_SLIP_ISS_FLG = null;

	/** 第 17 List変数： l_ITEM_CD_DW */
	public List l_ITEM_CD_DW = null;

	/** 第 18 List変数： l_ITEM_NAME_DW */
	public List l_ITEM_NAME_DW = null;

	/** 第 19 List変数： l_h_LOTCTRL */
	public List l_h_LOTCTRL = null;

	/** 第 20 List変数： l_param1 */
	public List l_param1 = null;

	/** 第 21 List変数： l_param2 */
	public List l_param2 = null;

	/** 第 22 List変数： l_param3 */
	public List l_param3 = null;

	/** 第 23 List変数： l_h_LOT_NO */
	public List l_h_LOT_NO = null;

	/** 第 24 List変数： l_h_PUCH_ODR_CD_1 */
	public List l_h_PUCH_ODR_CD_1 = null;

	/** 第 25 List変数： l_HOME_DECIMAL_FIG */
	public List l_HOME_DECIMAL_FIG = null;

	/** 第 26 List変数： l_PUCH_ODR_CD */
	public List l_PUCH_ODR_CD = null;

	/** 第 27 List変数： l_ACPT_NO */
	public List l_ACPT_NO = null;

	/** 第 28 List変数： l_ACPT_QTY */
	public List l_ACPT_QTY = null;

	/** 第 29 List変数： l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** 第 30 List変数： l_NON_NO_ITEM_NAME */
	public List l_NON_NO_ITEM_NAME = null;

	/** 第 31 List変数： l_ACPT_DATE */
	public List l_ACPT_DATE = null;

	/** 第 32 List変数： l_VEND_LOT_NO */
	public List l_VEND_LOT_NO = null;

	/** 第 33 List変数： l_WH_CD */
	public List l_WH_CD = null;

	/** 第 34 List変数： l_WH_NAME */
	public List l_WH_NAME = null;

	/** 第 35 List変数： l_CUR_CD */
	public List l_CUR_CD = null;

	/** 第 36 List変数： l_CUR_NAME */
	public List l_CUR_NAME = null;

	/** 第 37 List変数： l_VEND_CUR_UNIT */
	public List l_VEND_CUR_UNIT = null;

	/** 第 38 List変数： l_VEND_DECIMAL_FIG */
	public List l_VEND_DECIMAL_FIG = null;

	/** 第 39 List変数： l_UNIT_COST_TYP */
	public List l_UNIT_COST_TYP = null;

	/** 第 40 List変数： l_UNIT_COST */
	public List l_UNIT_COST = null;

	/** 第 41 List変数： l_PROCESSING_COST */
	public List l_PROCESSING_COST = null;

	/** 第 42 List変数： l_MATERIAL_COST */
	public List l_MATERIAL_COST = null;

	/** 第 43 List変数： l_OTHER_OVERHEADS */
	public List l_OTHER_OVERHEADS = null;

	/** 第 44 List変数： l_PUCH_ODR_AMOUNT */
	public List l_PUCH_ODR_AMOUNT = null;

	/** 第 45 List変数： l_DISC_AMOUNT */
	public List l_DISC_AMOUNT = null;

	/** 第 46 List変数： l_NET_AMOUNT */
	public List l_NET_AMOUNT = null;

	/** 第 47 List変数： l_TAX_AMOUNT_1 */
	public List l_TAX_AMOUNT_1 = null;

	/** 第 48 List変数： l_TAX_AMOUNT_2 */
	public List l_TAX_AMOUNT_2 = null;

	/** 第 49 List変数： l_TAX_AMOUNT_3 */
	public List l_TAX_AMOUNT_3 = null;

	/** 第 50 List変数： l_TAX_RATE_1 */
	public List l_TAX_RATE_1 = null;

	/** 第 51 List変数： l_TAX_RATE_2 */
	public List l_TAX_RATE_2 = null;

	/** 第 52 List変数： l_TAX_RATE_3 */
	public List l_TAX_RATE_3 = null;

	/** 第 53 List変数： l_AMOUNT_INCLUDE_TAX */
	public List l_AMOUNT_INCLUDE_TAX = null;

	/** 第 54 List変数： l_HOME_CUR_AMOUNT */
	public List l_HOME_CUR_AMOUNT = null;

	/** 第 55 List変数： l_EXCH_RATE */
	public List l_EXCH_RATE = null;

	/** 第 56 List変数： l_DLV_CD */
	public List l_DLV_CD = null;

	/** 第 57 List変数： l_ACPT_RSLT_COMMENT */
	public List l_ACPT_RSLT_COMMENT = null;

	/** 第 58 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 59 List変数： l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** 第 60 List変数： l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** 第 61 List変数： l_DRAW_CD */
	public List l_DRAW_CD = null;

	/** 第 62 List変数： l_SPEC */
	public List l_SPEC = null;

	/** 第 63 List変数： l_UNIT_QTY_TYP */
	public List l_UNIT_QTY_TYP = null;

	/** 第 64 List変数： l_VEND_CD */
	public List l_VEND_CD = null;

	/** 第 65 List変数： l_VEND_NAME */
	public List l_VEND_NAME = null;

	/** 第 66 List変数： l_PUCH_ODR_QTY */
	public List l_PUCH_ODR_QTY = null;

	/** 第 67 List変数： l_SUM_ACPT_QTY */
	public List l_SUM_ACPT_QTY = null;

	/** 第 68 List変数： l_ACPT_INSPC_TYP */
	public List l_ACPT_INSPC_TYP = null;

	/** 第 69 List変数： l_PUCH_ODR_SLIP_ISS_DATE */
	public List l_PUCH_ODR_SLIP_ISS_DATE = null;

	/** 第 70 List変数： l_PUCH_ODR_DLV_DATE */
	public List l_PUCH_ODR_DLV_DATE = null;

	/** 第 71 List変数： l_CONFIRM_DLV_DATE */
	public List l_CONFIRM_DLV_DATE = null;

	/** 第 72 List変数： l_WORK_IN_PROC_CD */
	public List l_WORK_IN_PROC_CD = null;

	/** 第 73 List変数： l_PROC_NAME */
	public List l_PROC_NAME = null;

	/** 第 74 List変数： l_PUCH_ODR_PERSON */
	public List l_PUCH_ODR_PERSON = null;

	/** 第 75 List変数： l_USER_NAME */
	public List l_USER_NAME = null;

	/** 第 76 List変数： l_PUCH_ODR_STS_TYP */
	public List l_PUCH_ODR_STS_TYP = null;

	/** 第 77 List変数： l_INSPC_CMPLT_FLG */
	public List l_INSPC_CMPLT_FLG = null;

	/** 第 78 List変数： l_SPL_ITEM_TYP */
	public List l_SPL_ITEM_TYP = null;

	/** 第 79 List変数： l_PRODUCT_TYP */
	public List l_PRODUCT_TYP = null;

	/** 第 80 List変数： l_NON_NO_ITEM_FLG */
	public List l_NON_NO_ITEM_FLG = null;

	/** 第 81 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** 第 82 List変数： l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** 第 83 List変数： l_TAX_CD */
	public List l_TAX_CD = null;

	/** 第 84 List変数： l_ROUND_TYP */
	public List l_ROUND_TYP = null;

	/** 第 85 List変数： l_TAX_ROUND_TYP */
	public List l_TAX_ROUND_TYP = null;

	/** 第 86 List変数： l_PUCH_ODR_START_DATE */
	public List l_PUCH_ODR_START_DATE = null;

	/** 第 87 List変数： l_BUSINESS_OPR_DATE */
	public List l_BUSINESS_OPR_DATE = null;

	/** 第 88 List変数： l_PUCH_ODR_MODIFY_COUNT */
	public List l_PUCH_ODR_MODIFY_COUNT = null;

	/** 第 89 List変数： l_ODR_CANCEL_CAUSE_CD */
	public List l_ODR_CANCEL_CAUSE_CD = null;

	/** 第 90 List変数： l_ODR_CANCEL_SLIP_ISS_FLG */
	public List l_ODR_CANCEL_SLIP_ISS_FLG = null;

	/** 第 91 List変数： l_PUCH_ODR_COMMENT */
	public List l_PUCH_ODR_COMMENT = null;

	/** 第 92 List変数： l_h_LOT_CTRL_FLG */
	public List l_h_LOT_CTRL_FLG = null;

	/** 第 93 List変数： l_h_LOT_NUMBERING_TYP */
	public List l_h_LOT_NUMBERING_TYP = null;

	/** 第 94 List変数： l_h_WORK_ODR_CD */
	public List l_h_WORK_ODR_CD = null;

	/** 第 95 List変数： l_h_FINAL_PROC_CD */
	public List l_h_FINAL_PROC_CD = null;

	/** 第 96 List変数： l_h_DATE_FLG */
	public List l_h_DATE_FLG = null;

	/** 第 97 List変数： l_ACPT_STS_TYP */
	public List l_ACPT_STS_TYP = null;

	/** 第 98 List変数： l_INSPC_WH_CD */
	public List l_INSPC_WH_CD = null;

	/** 第 99 List変数： l_LOT_NO */
	public List l_LOT_NO = null;

	/** 第 100 List変数： l_INSPC_CMPLT_DATE */
	public List l_INSPC_CMPLT_DATE = null;

	/** 第 101 List変数： l_readISSUE_INST_CD */
	public List l_readISSUE_INST_CD = null;

	/** 第 102 List変数： l_readPLANT_CD */
	public List l_readPLANT_CD = null;

	/** 第 103 List変数： l_readOD_NO */
	public List l_readOD_NO = null;

	/** 第 104 List変数： l_readITEM_CD */
	public List l_readITEM_CD = null;

	/** 第 105 List変数： l_readPUCH_ODR_CD */
	public List l_readPUCH_ODR_CD = null;

	/** 第 106 List変数： l_readCOMPANY_CD */
	public List l_readCOMPANY_CD = null;

	/** 第 107 List変数： l_readVEND_CD */
	public List l_readVEND_CD = null;

	/** 第 108 List変数： l_readCONS_TYP */
	public List l_readCONS_TYP = null;

	/** 第 109 List変数： l_readISSUE_INST_UNIT_DENOMINATOR */
	public List l_readISSUE_INST_UNIT_DENOMINATOR = null;

	/** 第 110 List変数： l_readISSUE_INST_UNIT_NUMERATOR */
	public List l_readISSUE_INST_UNIT_NUMERATOR = null;

	/** 第 111 List変数： l_readJOB_ODR_CD */
	public List l_readJOB_ODR_CD = null;

	/** 第 112 List変数： l_readJOB_ODR_DETAIL_NO */
	public List l_readJOB_ODR_DETAIL_NO = null;

	/** 第 113 List変数： l_readMRP_ODR_TYP */
	public List l_readMRP_ODR_TYP = null;

	/** 第 114 List変数： l_readUNIT_QTY_TYP */
	public List l_readUNIT_QTY_TYP = null;

	/** 第 115 List変数： l_readLOT_CONTROL_FLG */
	public List l_readLOT_CONTROL_FLG = null;

	/** 第 116 List変数： l_setPUCH_ODR_CD */
	public List l_setPUCH_ODR_CD = null;

	/** 第 117 List変数： l_setACPT_NO */
	public List l_setACPT_NO = null;

	/** 第 118 List変数： l_setITEM_CD */
	public List l_setITEM_CD = null;

	/** 第 119 List変数： l_setACPT_QTY */
	public List l_setACPT_QTY = null;

	/** 第 120 List変数： l_setCOMPANY_CD */
	public List l_setCOMPANY_CD = null;

	/** 第 121 List変数： l_setVEND_CD */
	public List l_setVEND_CD = null;

	/** 第 122 List変数： l_setJOB_ODR_CD */
	public List l_setJOB_ODR_CD = null;

	/** 第 123 List変数： l_setJOB_ODR_DETAIL_NO */
	public List l_setJOB_ODR_DETAIL_NO = null;

	/** 第 124 List変数： l_setPLANT_CD */
	public List l_setPLANT_CD = null;

	/** 第 125 List変数： l_setISSUE_INST_CD */
	public List l_setISSUE_INST_CD = null;

	/** 第 126 List変数： l_setMRP_ODR_TYP */
	public List l_setMRP_ODR_TYP = null;

	/** 第 127 List変数： l_setSUPPLIED_ISSUE_GNR_TYP */
	public List l_setSUPPLIED_ISSUE_GNR_TYP = null;

	/** 第 128 List変数： l_setSUPPLIED_ISSUE_QTY */
	public List l_setSUPPLIED_ISSUE_QTY = null;

	/** 第 129 List変数： l_setTOTAL_ISSUE_QTY */
	public List l_setTOTAL_ISSUE_QTY = null;

	/** 第 130 List変数： l_setSUPPLIED_UNIT_DENOMINATOR */
	public List l_setSUPPLIED_UNIT_DENOMINATOR = null;

	/** 第 131 List変数： l_setSUPPLIED_UNIT_NUMERATOR */
	public List l_setSUPPLIED_UNIT_NUMERATOR = null;

	/** 第 132 List変数： l_setSUPPLIED_DATE */
	public List l_setSUPPLIED_DATE = null;

	/** 第 133 List変数： l_setPART_SUPPLIED_COMMENT */
	public List l_setPART_SUPPLIED_COMMENT = null;

	/** 第 134 List変数： l_readSTOCK_ON_HAND_QTY */
	public List l_readSTOCK_ON_HAND_QTY = null;

	/** 第 135 List変数： l_setWH_CD */
	public List l_setWH_CD = null;

	/** 第 136 List変数： l_readWH_CD */
	public List l_readWH_CD = null;

	/** 第 137 List変数： l_setSTOCK_ON_HAND_QTY */
	public List l_setSTOCK_ON_HAND_QTY = null;

	/** 第 138 List変数： l_setRCV_ISSUE_CTRL_CD */
	public List l_setRCV_ISSUE_CTRL_CD = null;

	/** 第 139 List変数： l_setRCV_ISSUE_TYP */
	public List l_setRCV_ISSUE_TYP = null;

	/** 第 140 List変数： l_setACPT_RSLT_CRCT_NO */
	public List l_setACPT_RSLT_CRCT_NO = null;

	/** 第 141 List変数： l_setINSPEC_RSLT_CRCT_NO */
	public List l_setINSPEC_RSLT_CRCT_NO = null;

	/** 第 142 List変数： l_setWORK_ODR_CD */
	public List l_setWORK_ODR_CD = null;

	/** 第 143 List変数： l_setWORK_IN_PROC_CD */
	public List l_setWORK_IN_PROC_CD = null;

	/** 第 144 List変数： l_setPARTIAL_PRD_NO */
	public List l_setPARTIAL_PRD_NO = null;

	/** 第 145 List変数： l_setOPR_RSLT_CRCT_NO */
	public List l_setOPR_RSLT_CRCT_NO = null;

	/** 第 146 List変数： l_setRCV_ISSUE_BEFORE_QTY */
	public List l_setRCV_ISSUE_BEFORE_QTY = null;

	/** 第 147 List変数： l_setRCV_ISSUE_QTY */
	public List l_setRCV_ISSUE_QTY = null;

	/** 第 148 List変数： l_setRCV_ISSUE_AFTER_QTY */
	public List l_setRCV_ISSUE_AFTER_QTY = null;

	/** 第 149 List変数： l_setRCV_ISSUE_AMOUNT */
	public List l_setRCV_ISSUE_AMOUNT = null;

	/** 第 150 List変数： l_setRCV_ISSUE_DATE */
	public List l_setRCV_ISSUE_DATE = null;

	/** 第 151 List変数： l_setRCV_ISSUE_GNR_TYP */
	public List l_setRCV_ISSUE_GNR_TYP = null;

	/** 第 152 List変数： l_setRCV_ISSUE_ODD_QTY */
	public List l_setRCV_ISSUE_ODD_QTY = null;

	/** 第 153 List変数： l_setDEFECT_CAUSE_CD */
	public List l_setDEFECT_CAUSE_CD = null;

	/** 第 154 List変数： l_setSTOCK_UPD_TYP */
	public List l_setSTOCK_UPD_TYP = null;

	/** 第 155 List変数： l_setRCV_ISSUE_CMPLT_FLG */
	public List l_setRCV_ISSUE_CMPLT_FLG = null;

	/** 第 156 List変数： l_setOD_NO */
	public List l_setOD_NO = null;

	/** 第 157 List変数： l_setLOT_NO */
	public List l_setLOT_NO = null;

	/** 第 158 List変数： l_setVEND_LOT_NO */
	public List l_setVEND_LOT_NO = null;

	/** 第 159 List変数： l_setRCV_ISSUE_COMMENT */
	public List l_setRCV_ISSUE_COMMENT = null;

	/** 第 160 List変数： l_setCONS_TYP */
	public List l_setCONS_TYP = null;

	/** 第 161 List変数： l_setCONS_EXEC_DATE */
	public List l_setCONS_EXEC_DATE = null;

	/** 第 162 List変数： l_THIS_MONTH */
	public List l_THIS_MONTH = null;

	/** 第 163 List変数： l_INSTALL_FLG */
	public List l_INSTALL_FLG = null;

	/** 第 164 List変数： l_readSUPPLIED_ISSUE_QTY */
	public List l_readSUPPLIED_ISSUE_QTY = null;

	/** 第 165 List変数： l_readTOTAL_ISSUE_QTY */
	public List l_readTOTAL_ISSUE_QTY = null;

	/** 第 166 List変数： l_readSUPPLIED_UNIT_DENOMINATOR */
	public List l_readSUPPLIED_UNIT_DENOMINATOR = null;

	/** 第 167 List変数： l_readSUPPLIED_UNIT_NUMERATOR */
	public List l_readSUPPLIED_UNIT_NUMERATOR = null;

	/** 第 168 List変数： l_PROC_EXEC_DATE */
	public List l_PROC_EXEC_DATE = null;

	/** 第 169 List変数： l_PAST_RESULT_ENTRY_TYP */
	public List l_PAST_RESULT_ENTRY_TYP = null;

	/** 第 170 List変数： l_INSPC_WH_NAME */
	public List l_INSPC_WH_NAME = null;

	/** 第 171 List変数： l_ISSUE_INST_CD */
	public List l_ISSUE_INST_CD = null;

	/** 第 172 List変数： l_readLOT_NO */
	public List l_readLOT_NO = null;

	/** 第 173 List変数： l_readQTY */
	public List l_readQTY = null;

	/** 第 174 List変数： l_BEST_BEFORE_DATE */
	public List l_BEST_BEFORE_DATE = null;

	/** 第 175 List変数： l_setSEQ_NO */
	public List l_setSEQ_NO = null;

	/** 第 176 List変数： l_readSUPPLIED_DATE */
	public List l_readSUPPLIED_DATE = null;

	/** 第 177 List変数： l_setSPENT_QTY */
	public List l_setSPENT_QTY = null;

	/** 第 178 List変数： l_NEXTVAL */
	public List l_NEXTVAL = null;

	/** 第 179 List変数： l_OD_NO */
	public List l_OD_NO = null;

	/** 第 180 List変数： l_ODR_QTY */
	public List l_ODR_QTY = null;

	/** 第 181 List変数： l_PVC2BUSINESSNAME */
	public List l_PVC2BUSINESSNAME = null;

	/** 第 182 List変数： l_PVC2OUTPUTPATH */
	public List l_PVC2OUTPUTPATH = null;

	/** 第 183 List変数： l_PVC2OUTPUTNAME */
	public List l_PVC2OUTPUTNAME = null;

	/** 第 184 List変数： l_PVC2LOGMODE */
	public List l_PVC2LOGMODE = null;

	/** 第 185 List変数： l_PVC2OUTPUTMODE */
	public List l_PVC2OUTPUTMODE = null;

	/** 第 186 List変数： l_PVC2USERID */
	public List l_PVC2USERID = null;

	/** 第 187 List変数： l_PVC2PLANTCD */
	public List l_PVC2PLANTCD = null;

	/** 第 188 List変数： l_PVC2TAXID */
	public List l_PVC2TAXID = null;

	/** 第 189 List変数： l_PNUMTAXOUTAMOUNT */
	public List l_PNUMTAXOUTAMOUNT = null;

	/** 第 190 List変数： l_PNUMTAXAMOUNT */
	public List l_PNUMTAXAMOUNT = null;

	/** 第 191 List変数： l_PNUMEXTERNALTAXSALESAMOUNT */
	public List l_PNUMEXTERNALTAXSALESAMOUNT = null;

	/** 第 192 List変数： l_PNUMINTERNALTAXSALESAMOUNT */
	public List l_PNUMINTERNALTAXSALESAMOUNT = null;

	/** 第 193 List変数： l_PNUMTAXFREESALESAMOUNT */
	public List l_PNUMTAXFREESALESAMOUNT = null;

	/** 第 194 List変数： l_PNUMEXTERNALTAXAMOUNT */
	public List l_PNUMEXTERNALTAXAMOUNT = null;

	/** 第 195 List変数： l_PNUMINTERNALTAXAMOUNT */
	public List l_PNUMINTERNALTAXAMOUNT = null;

	/** 第 196 List変数： l_PVC2ERRCD */
	public List l_PVC2ERRCD = null;

	/** 第 197 List変数： l_PNUMSTATUS */
	public List l_PNUMSTATUS = null;

	/** 第 198 List変数： l_FROM_PUCH_ODR_CD */
	public List l_FROM_PUCH_ODR_CD = null;

	/** 第 199 List変数： l_TO_PUCH_ODR_CD */
	public List l_TO_PUCH_ODR_CD = null;

	/** 第 200 List変数： l_FROM_ITEM_CD */
	public List l_FROM_ITEM_CD = null;

	/** 第 201 List変数： l_FROM_LOT_NO */
	public List l_FROM_LOT_NO = null;

	/** 第 202 List変数： l_TO_ITEM_CD */
	public List l_TO_ITEM_CD = null;

	/** 第 203 List変数： l_TO_LOT_NO */
	public List l_TO_LOT_NO = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String geth_PUCH_ODR_CD() { return m_h_PUCH_ODR_CD; }
	public String getc_COMPLETE() { return m_c_COMPLETE; }
	public String getUNIT_COST_TYP_name() { return m_UNIT_COST_TYP_name; }
	public String getUNIT_COST_TYP_val() { return m_UNIT_COST_TYP_val; }
	public String getHOME_CUR_UNIT() { return m_HOME_CUR_UNIT; }
	public String getACPT_INSPC_TYP_DN() { return m_ACPT_INSPC_TYP_DN; }
	public String getSPL_ITEM_TYP_DN() { return m_SPL_ITEM_TYP_DN; }
	public String getPRODUCT_TYP_DN() { return m_PRODUCT_TYP_DN; }
	public String getPUCH_ODR_STS_TYP_DN() { return m_PUCH_ODR_STS_TYP_DN; }
	public String getNON_NO_ITEM_FLG_DN() { return m_NON_NO_ITEM_FLG_DN; }
	public String getINSPC_CMPLT_FLG_DN() { return m_INSPC_CMPLT_FLG_DN; }
	public String getSelectUnitCostFlag() { return m_SelectUnitCostFlag; }
	public String getUNIT_QTY_TYP_DN() { return m_UNIT_QTY_TYP_DN; }
	public String getc_CANCEL() { return m_c_CANCEL; }
	public String geth_ACPT_QTY() { return m_h_ACPT_QTY; }
	public String geth_ODR_CANCEL_SLIP_ISS_FLG() { return m_h_ODR_CANCEL_SLIP_ISS_FLG; }
	public String getITEM_CD_DW() { return m_ITEM_CD_DW; }
	public String getITEM_NAME_DW() { return m_ITEM_NAME_DW; }
	public String geth_LOTCTRL() { return m_h_LOTCTRL; }
	public String getparam1() { return m_param1; }
	public String getparam2() { return m_param2; }
	public String getparam3() { return m_param3; }
	public String geth_LOT_NO() { return m_h_LOT_NO; }
	public String geth_PUCH_ODR_CD_1() { return m_h_PUCH_ODR_CD_1; }
	public String getHOME_DECIMAL_FIG() { return m_HOME_DECIMAL_FIG; }
	public String getPUCH_ODR_CD() { return m_PUCH_ODR_CD; }
	public String getACPT_NO() { return m_ACPT_NO; }
	public String getACPT_QTY() { return m_ACPT_QTY; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getNON_NO_ITEM_NAME() { return m_NON_NO_ITEM_NAME; }
	public String getACPT_DATE() { return m_ACPT_DATE; }
	public String getVEND_LOT_NO() { return m_VEND_LOT_NO; }
	public String getWH_CD() { return m_WH_CD; }
	public String getWH_NAME() { return m_WH_NAME; }
	public String getCUR_CD() { return m_CUR_CD; }
	public String getCUR_NAME() { return m_CUR_NAME; }
	public String getVEND_CUR_UNIT() { return m_VEND_CUR_UNIT; }
	public String getVEND_DECIMAL_FIG() { return m_VEND_DECIMAL_FIG; }
	public String getUNIT_COST_TYP() { return m_UNIT_COST_TYP; }
	public String getUNIT_COST() { return m_UNIT_COST; }
	public String getPROCESSING_COST() { return m_PROCESSING_COST; }
	public String getMATERIAL_COST() { return m_MATERIAL_COST; }
	public String getOTHER_OVERHEADS() { return m_OTHER_OVERHEADS; }
	public String getPUCH_ODR_AMOUNT() { return m_PUCH_ODR_AMOUNT; }
	public String getDISC_AMOUNT() { return m_DISC_AMOUNT; }
	public String getNET_AMOUNT() { return m_NET_AMOUNT; }
	public String getTAX_AMOUNT_1() { return m_TAX_AMOUNT_1; }
	public String getTAX_AMOUNT_2() { return m_TAX_AMOUNT_2; }
	public String getTAX_AMOUNT_3() { return m_TAX_AMOUNT_3; }
	public String getTAX_RATE_1() { return m_TAX_RATE_1; }
	public String getTAX_RATE_2() { return m_TAX_RATE_2; }
	public String getTAX_RATE_3() { return m_TAX_RATE_3; }
	public String getAMOUNT_INCLUDE_TAX() { return m_AMOUNT_INCLUDE_TAX; }
	public String getHOME_CUR_AMOUNT() { return m_HOME_CUR_AMOUNT; }
	public String getEXCH_RATE() { return m_EXCH_RATE; }
	public String getDLV_CD() { return m_DLV_CD; }
	public String getACPT_RSLT_COMMENT() { return m_ACPT_RSLT_COMMENT; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getDRAW_CD() { return m_DRAW_CD; }
	public String getSPEC() { return m_SPEC; }
	public String getUNIT_QTY_TYP() { return m_UNIT_QTY_TYP; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getVEND_NAME() { return m_VEND_NAME; }
	public String getPUCH_ODR_QTY() { return m_PUCH_ODR_QTY; }
	public String getSUM_ACPT_QTY() { return m_SUM_ACPT_QTY; }
	public String getACPT_INSPC_TYP() { return m_ACPT_INSPC_TYP; }
	public String getPUCH_ODR_SLIP_ISS_DATE() { return m_PUCH_ODR_SLIP_ISS_DATE; }
	public String getPUCH_ODR_DLV_DATE() { return m_PUCH_ODR_DLV_DATE; }
	public String getCONFIRM_DLV_DATE() { return m_CONFIRM_DLV_DATE; }
	public String getWORK_IN_PROC_CD() { return m_WORK_IN_PROC_CD; }
	public String getPROC_NAME() { return m_PROC_NAME; }
	public String getPUCH_ODR_PERSON() { return m_PUCH_ODR_PERSON; }
	public String getUSER_NAME() { return m_USER_NAME; }
	public String getPUCH_ODR_STS_TYP() { return m_PUCH_ODR_STS_TYP; }
	public String getINSPC_CMPLT_FLG() { return m_INSPC_CMPLT_FLG; }
	public String getSPL_ITEM_TYP() { return m_SPL_ITEM_TYP; }
	public String getPRODUCT_TYP() { return m_PRODUCT_TYP; }
	public String getNON_NO_ITEM_FLG() { return m_NON_NO_ITEM_FLG; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getTAX_CD() { return m_TAX_CD; }
	public String getROUND_TYP() { return m_ROUND_TYP; }
	public String getTAX_ROUND_TYP() { return m_TAX_ROUND_TYP; }
	public String getPUCH_ODR_START_DATE() { return m_PUCH_ODR_START_DATE; }
	public String getBUSINESS_OPR_DATE() { return m_BUSINESS_OPR_DATE; }
	public String getPUCH_ODR_MODIFY_COUNT() { return m_PUCH_ODR_MODIFY_COUNT; }
	public String getODR_CANCEL_CAUSE_CD() { return m_ODR_CANCEL_CAUSE_CD; }
	public String getODR_CANCEL_SLIP_ISS_FLG() { return m_ODR_CANCEL_SLIP_ISS_FLG; }
	public String getPUCH_ODR_COMMENT() { return m_PUCH_ODR_COMMENT; }
	public String geth_LOT_CTRL_FLG() { return m_h_LOT_CTRL_FLG; }
	public String geth_LOT_NUMBERING_TYP() { return m_h_LOT_NUMBERING_TYP; }
	public String geth_WORK_ODR_CD() { return m_h_WORK_ODR_CD; }
	public String geth_FINAL_PROC_CD() { return m_h_FINAL_PROC_CD; }
	public String geth_DATE_FLG() { return m_h_DATE_FLG; }
	public String getACPT_STS_TYP() { return m_ACPT_STS_TYP; }
	public String getINSPC_WH_CD() { return m_INSPC_WH_CD; }
	public String getLOT_NO() { return m_LOT_NO; }
	public String getINSPC_CMPLT_DATE() { return m_INSPC_CMPLT_DATE; }
	public String getreadISSUE_INST_CD() { return m_readISSUE_INST_CD; }
	public String getreadPLANT_CD() { return m_readPLANT_CD; }
	public String getreadOD_NO() { return m_readOD_NO; }
	public String getreadITEM_CD() { return m_readITEM_CD; }
	public String getreadPUCH_ODR_CD() { return m_readPUCH_ODR_CD; }
	public String getreadCOMPANY_CD() { return m_readCOMPANY_CD; }
	public String getreadVEND_CD() { return m_readVEND_CD; }
	public String getreadCONS_TYP() { return m_readCONS_TYP; }
	public String getreadISSUE_INST_UNIT_DENOMINATOR() { return m_readISSUE_INST_UNIT_DENOMINATOR; }
	public String getreadISSUE_INST_UNIT_NUMERATOR() { return m_readISSUE_INST_UNIT_NUMERATOR; }
	public String getreadJOB_ODR_CD() { return m_readJOB_ODR_CD; }
	public String getreadJOB_ODR_DETAIL_NO() { return m_readJOB_ODR_DETAIL_NO; }
	public String getreadMRP_ODR_TYP() { return m_readMRP_ODR_TYP; }
	public String getreadUNIT_QTY_TYP() { return m_readUNIT_QTY_TYP; }
	public String getreadLOT_CONTROL_FLG() { return m_readLOT_CONTROL_FLG; }
	public String getsetPUCH_ODR_CD() { return m_setPUCH_ODR_CD; }
	public String getsetACPT_NO() { return m_setACPT_NO; }
	public String getsetITEM_CD() { return m_setITEM_CD; }
	public String getsetACPT_QTY() { return m_setACPT_QTY; }
	public String getsetCOMPANY_CD() { return m_setCOMPANY_CD; }
	public String getsetVEND_CD() { return m_setVEND_CD; }
	public String getsetJOB_ODR_CD() { return m_setJOB_ODR_CD; }
	public String getsetJOB_ODR_DETAIL_NO() { return m_setJOB_ODR_DETAIL_NO; }
	public String getsetPLANT_CD() { return m_setPLANT_CD; }
	public String getsetISSUE_INST_CD() { return m_setISSUE_INST_CD; }
	public String getsetMRP_ODR_TYP() { return m_setMRP_ODR_TYP; }
	public String getsetSUPPLIED_ISSUE_GNR_TYP() { return m_setSUPPLIED_ISSUE_GNR_TYP; }
	public String getsetSUPPLIED_ISSUE_QTY() { return m_setSUPPLIED_ISSUE_QTY; }
	public String getsetTOTAL_ISSUE_QTY() { return m_setTOTAL_ISSUE_QTY; }
	public String getsetSUPPLIED_UNIT_DENOMINATOR() { return m_setSUPPLIED_UNIT_DENOMINATOR; }
	public String getsetSUPPLIED_UNIT_NUMERATOR() { return m_setSUPPLIED_UNIT_NUMERATOR; }
	public String getsetSUPPLIED_DATE() { return m_setSUPPLIED_DATE; }
	public String getsetPART_SUPPLIED_COMMENT() { return m_setPART_SUPPLIED_COMMENT; }
	public String getreadSTOCK_ON_HAND_QTY() { return m_readSTOCK_ON_HAND_QTY; }
	public String getsetWH_CD() { return m_setWH_CD; }
	public String getreadWH_CD() { return m_readWH_CD; }
	public String getsetSTOCK_ON_HAND_QTY() { return m_setSTOCK_ON_HAND_QTY; }
	public String getsetRCV_ISSUE_CTRL_CD() { return m_setRCV_ISSUE_CTRL_CD; }
	public String getsetRCV_ISSUE_TYP() { return m_setRCV_ISSUE_TYP; }
	public String getsetACPT_RSLT_CRCT_NO() { return m_setACPT_RSLT_CRCT_NO; }
	public String getsetINSPEC_RSLT_CRCT_NO() { return m_setINSPEC_RSLT_CRCT_NO; }
	public String getsetWORK_ODR_CD() { return m_setWORK_ODR_CD; }
	public String getsetWORK_IN_PROC_CD() { return m_setWORK_IN_PROC_CD; }
	public String getsetPARTIAL_PRD_NO() { return m_setPARTIAL_PRD_NO; }
	public String getsetOPR_RSLT_CRCT_NO() { return m_setOPR_RSLT_CRCT_NO; }
	public String getsetRCV_ISSUE_BEFORE_QTY() { return m_setRCV_ISSUE_BEFORE_QTY; }
	public String getsetRCV_ISSUE_QTY() { return m_setRCV_ISSUE_QTY; }
	public String getsetRCV_ISSUE_AFTER_QTY() { return m_setRCV_ISSUE_AFTER_QTY; }
	public String getsetRCV_ISSUE_AMOUNT() { return m_setRCV_ISSUE_AMOUNT; }
	public String getsetRCV_ISSUE_DATE() { return m_setRCV_ISSUE_DATE; }
	public String getsetRCV_ISSUE_GNR_TYP() { return m_setRCV_ISSUE_GNR_TYP; }
	public String getsetRCV_ISSUE_ODD_QTY() { return m_setRCV_ISSUE_ODD_QTY; }
	public String getsetDEFECT_CAUSE_CD() { return m_setDEFECT_CAUSE_CD; }
	public String getsetSTOCK_UPD_TYP() { return m_setSTOCK_UPD_TYP; }
	public String getsetRCV_ISSUE_CMPLT_FLG() { return m_setRCV_ISSUE_CMPLT_FLG; }
	public String getsetOD_NO() { return m_setOD_NO; }
	public String getsetLOT_NO() { return m_setLOT_NO; }
	public String getsetVEND_LOT_NO() { return m_setVEND_LOT_NO; }
	public String getsetRCV_ISSUE_COMMENT() { return m_setRCV_ISSUE_COMMENT; }
	public String getsetCONS_TYP() { return m_setCONS_TYP; }
	public String getsetCONS_EXEC_DATE() { return m_setCONS_EXEC_DATE; }
	public String getTHIS_MONTH() { return m_THIS_MONTH; }
	public String getINSTALL_FLG() { return m_INSTALL_FLG; }
	public String getreadSUPPLIED_ISSUE_QTY() { return m_readSUPPLIED_ISSUE_QTY; }
	public String getreadTOTAL_ISSUE_QTY() { return m_readTOTAL_ISSUE_QTY; }
	public String getreadSUPPLIED_UNIT_DENOMINATOR() { return m_readSUPPLIED_UNIT_DENOMINATOR; }
	public String getreadSUPPLIED_UNIT_NUMERATOR() { return m_readSUPPLIED_UNIT_NUMERATOR; }
	public BigDecimal getPROC_EXEC_DATE() { return m_PROC_EXEC_DATE; }
	public String getPAST_RESULT_ENTRY_TYP() { return m_PAST_RESULT_ENTRY_TYP; }
	public String getINSPC_WH_NAME() { return m_INSPC_WH_NAME; }
	public String getISSUE_INST_CD() { return m_ISSUE_INST_CD; }
	public String getreadLOT_NO() { return m_readLOT_NO; }
	public String getreadQTY() { return m_readQTY; }
	public String getBEST_BEFORE_DATE() { return m_BEST_BEFORE_DATE; }
	public String getsetSEQ_NO() { return m_setSEQ_NO; }
	public String getreadSUPPLIED_DATE() { return m_readSUPPLIED_DATE; }
	public String getsetSPENT_QTY() { return m_setSPENT_QTY; }
	public String getNEXTVAL() { return m_NEXTVAL; }
	public String getOD_NO() { return m_OD_NO; }
	public String getODR_QTY() { return m_ODR_QTY; }
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
	public String getFROM_PUCH_ODR_CD() { return m_FROM_PUCH_ODR_CD; }
	public String getTO_PUCH_ODR_CD() { return m_TO_PUCH_ODR_CD; }
	public String getFROM_ITEM_CD() { return m_FROM_ITEM_CD; }
	public String getFROM_LOT_NO() { return m_FROM_LOT_NO; }
	public String getTO_ITEM_CD() { return m_TO_ITEM_CD; }
	public String getTO_LOT_NO() { return m_TO_LOT_NO; }

	public List getList_h_PUCH_ODR_CD() { return l_h_PUCH_ODR_CD; }
	public List getList_c_COMPLETE() { return l_c_COMPLETE; }
	public List getList_UNIT_COST_TYP_name() { return l_UNIT_COST_TYP_name; }
	public List getList_UNIT_COST_TYP_val() { return l_UNIT_COST_TYP_val; }
	public List getList_HOME_CUR_UNIT() { return l_HOME_CUR_UNIT; }
	public List getList_ACPT_INSPC_TYP_DN() { return l_ACPT_INSPC_TYP_DN; }
	public List getList_SPL_ITEM_TYP_DN() { return l_SPL_ITEM_TYP_DN; }
	public List getList_PRODUCT_TYP_DN() { return l_PRODUCT_TYP_DN; }
	public List getList_PUCH_ODR_STS_TYP_DN() { return l_PUCH_ODR_STS_TYP_DN; }
	public List getList_NON_NO_ITEM_FLG_DN() { return l_NON_NO_ITEM_FLG_DN; }
	public List getList_INSPC_CMPLT_FLG_DN() { return l_INSPC_CMPLT_FLG_DN; }
	public List getList_SelectUnitCostFlag() { return l_SelectUnitCostFlag; }
	public List getList_UNIT_QTY_TYP_DN() { return l_UNIT_QTY_TYP_DN; }
	public List getList_c_CANCEL() { return l_c_CANCEL; }
	public List getList_h_ACPT_QTY() { return l_h_ACPT_QTY; }
	public List getList_h_ODR_CANCEL_SLIP_ISS_FLG() { return l_h_ODR_CANCEL_SLIP_ISS_FLG; }
	public List getList_ITEM_CD_DW() { return l_ITEM_CD_DW; }
	public List getList_ITEM_NAME_DW() { return l_ITEM_NAME_DW; }
	public List getList_h_LOTCTRL() { return l_h_LOTCTRL; }
	public List getList_param1() { return l_param1; }
	public List getList_param2() { return l_param2; }
	public List getList_param3() { return l_param3; }
	public List getList_h_LOT_NO() { return l_h_LOT_NO; }
	public List getList_h_PUCH_ODR_CD_1() { return l_h_PUCH_ODR_CD_1; }
	public List getList_HOME_DECIMAL_FIG() { return l_HOME_DECIMAL_FIG; }
	public List getList_PUCH_ODR_CD() { return l_PUCH_ODR_CD; }
	public List getList_ACPT_NO() { return l_ACPT_NO; }
	public List getList_ACPT_QTY() { return l_ACPT_QTY; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_NON_NO_ITEM_NAME() { return l_NON_NO_ITEM_NAME; }
	public List getList_ACPT_DATE() { return l_ACPT_DATE; }
	public List getList_VEND_LOT_NO() { return l_VEND_LOT_NO; }
	public List getList_WH_CD() { return l_WH_CD; }
	public List getList_WH_NAME() { return l_WH_NAME; }
	public List getList_CUR_CD() { return l_CUR_CD; }
	public List getList_CUR_NAME() { return l_CUR_NAME; }
	public List getList_VEND_CUR_UNIT() { return l_VEND_CUR_UNIT; }
	public List getList_VEND_DECIMAL_FIG() { return l_VEND_DECIMAL_FIG; }
	public List getList_UNIT_COST_TYP() { return l_UNIT_COST_TYP; }
	public List getList_UNIT_COST() { return l_UNIT_COST; }
	public List getList_PROCESSING_COST() { return l_PROCESSING_COST; }
	public List getList_MATERIAL_COST() { return l_MATERIAL_COST; }
	public List getList_OTHER_OVERHEADS() { return l_OTHER_OVERHEADS; }
	public List getList_PUCH_ODR_AMOUNT() { return l_PUCH_ODR_AMOUNT; }
	public List getList_DISC_AMOUNT() { return l_DISC_AMOUNT; }
	public List getList_NET_AMOUNT() { return l_NET_AMOUNT; }
	public List getList_TAX_AMOUNT_1() { return l_TAX_AMOUNT_1; }
	public List getList_TAX_AMOUNT_2() { return l_TAX_AMOUNT_2; }
	public List getList_TAX_AMOUNT_3() { return l_TAX_AMOUNT_3; }
	public List getList_TAX_RATE_1() { return l_TAX_RATE_1; }
	public List getList_TAX_RATE_2() { return l_TAX_RATE_2; }
	public List getList_TAX_RATE_3() { return l_TAX_RATE_3; }
	public List getList_AMOUNT_INCLUDE_TAX() { return l_AMOUNT_INCLUDE_TAX; }
	public List getList_HOME_CUR_AMOUNT() { return l_HOME_CUR_AMOUNT; }
	public List getList_EXCH_RATE() { return l_EXCH_RATE; }
	public List getList_DLV_CD() { return l_DLV_CD; }
	public List getList_ACPT_RSLT_COMMENT() { return l_ACPT_RSLT_COMMENT; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_DRAW_CD() { return l_DRAW_CD; }
	public List getList_SPEC() { return l_SPEC; }
	public List getList_UNIT_QTY_TYP() { return l_UNIT_QTY_TYP; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_VEND_NAME() { return l_VEND_NAME; }
	public List getList_PUCH_ODR_QTY() { return l_PUCH_ODR_QTY; }
	public List getList_SUM_ACPT_QTY() { return l_SUM_ACPT_QTY; }
	public List getList_ACPT_INSPC_TYP() { return l_ACPT_INSPC_TYP; }
	public List getList_PUCH_ODR_SLIP_ISS_DATE() { return l_PUCH_ODR_SLIP_ISS_DATE; }
	public List getList_PUCH_ODR_DLV_DATE() { return l_PUCH_ODR_DLV_DATE; }
	public List getList_CONFIRM_DLV_DATE() { return l_CONFIRM_DLV_DATE; }
	public List getList_WORK_IN_PROC_CD() { return l_WORK_IN_PROC_CD; }
	public List getList_PROC_NAME() { return l_PROC_NAME; }
	public List getList_PUCH_ODR_PERSON() { return l_PUCH_ODR_PERSON; }
	public List getList_USER_NAME() { return l_USER_NAME; }
	public List getList_PUCH_ODR_STS_TYP() { return l_PUCH_ODR_STS_TYP; }
	public List getList_INSPC_CMPLT_FLG() { return l_INSPC_CMPLT_FLG; }
	public List getList_SPL_ITEM_TYP() { return l_SPL_ITEM_TYP; }
	public List getList_PRODUCT_TYP() { return l_PRODUCT_TYP; }
	public List getList_NON_NO_ITEM_FLG() { return l_NON_NO_ITEM_FLG; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_TAX_CD() { return l_TAX_CD; }
	public List getList_ROUND_TYP() { return l_ROUND_TYP; }
	public List getList_TAX_ROUND_TYP() { return l_TAX_ROUND_TYP; }
	public List getList_PUCH_ODR_START_DATE() { return l_PUCH_ODR_START_DATE; }
	public List getList_BUSINESS_OPR_DATE() { return l_BUSINESS_OPR_DATE; }
	public List getList_PUCH_ODR_MODIFY_COUNT() { return l_PUCH_ODR_MODIFY_COUNT; }
	public List getList_ODR_CANCEL_CAUSE_CD() { return l_ODR_CANCEL_CAUSE_CD; }
	public List getList_ODR_CANCEL_SLIP_ISS_FLG() { return l_ODR_CANCEL_SLIP_ISS_FLG; }
	public List getList_PUCH_ODR_COMMENT() { return l_PUCH_ODR_COMMENT; }
	public List getList_h_LOT_CTRL_FLG() { return l_h_LOT_CTRL_FLG; }
	public List getList_h_LOT_NUMBERING_TYP() { return l_h_LOT_NUMBERING_TYP; }
	public List getList_h_WORK_ODR_CD() { return l_h_WORK_ODR_CD; }
	public List getList_h_FINAL_PROC_CD() { return l_h_FINAL_PROC_CD; }
	public List getList_h_DATE_FLG() { return l_h_DATE_FLG; }
	public List getList_ACPT_STS_TYP() { return l_ACPT_STS_TYP; }
	public List getList_INSPC_WH_CD() { return l_INSPC_WH_CD; }
	public List getList_LOT_NO() { return l_LOT_NO; }
	public List getList_INSPC_CMPLT_DATE() { return l_INSPC_CMPLT_DATE; }
	public List getList_readISSUE_INST_CD() { return l_readISSUE_INST_CD; }
	public List getList_readPLANT_CD() { return l_readPLANT_CD; }
	public List getList_readOD_NO() { return l_readOD_NO; }
	public List getList_readITEM_CD() { return l_readITEM_CD; }
	public List getList_readPUCH_ODR_CD() { return l_readPUCH_ODR_CD; }
	public List getList_readCOMPANY_CD() { return l_readCOMPANY_CD; }
	public List getList_readVEND_CD() { return l_readVEND_CD; }
	public List getList_readCONS_TYP() { return l_readCONS_TYP; }
	public List getList_readISSUE_INST_UNIT_DENOMINATOR() { return l_readISSUE_INST_UNIT_DENOMINATOR; }
	public List getList_readISSUE_INST_UNIT_NUMERATOR() { return l_readISSUE_INST_UNIT_NUMERATOR; }
	public List getList_readJOB_ODR_CD() { return l_readJOB_ODR_CD; }
	public List getList_readJOB_ODR_DETAIL_NO() { return l_readJOB_ODR_DETAIL_NO; }
	public List getList_readMRP_ODR_TYP() { return l_readMRP_ODR_TYP; }
	public List getList_readUNIT_QTY_TYP() { return l_readUNIT_QTY_TYP; }
	public List getList_readLOT_CONTROL_FLG() { return l_readLOT_CONTROL_FLG; }
	public List getList_setPUCH_ODR_CD() { return l_setPUCH_ODR_CD; }
	public List getList_setACPT_NO() { return l_setACPT_NO; }
	public List getList_setITEM_CD() { return l_setITEM_CD; }
	public List getList_setACPT_QTY() { return l_setACPT_QTY; }
	public List getList_setCOMPANY_CD() { return l_setCOMPANY_CD; }
	public List getList_setVEND_CD() { return l_setVEND_CD; }
	public List getList_setJOB_ODR_CD() { return l_setJOB_ODR_CD; }
	public List getList_setJOB_ODR_DETAIL_NO() { return l_setJOB_ODR_DETAIL_NO; }
	public List getList_setPLANT_CD() { return l_setPLANT_CD; }
	public List getList_setISSUE_INST_CD() { return l_setISSUE_INST_CD; }
	public List getList_setMRP_ODR_TYP() { return l_setMRP_ODR_TYP; }
	public List getList_setSUPPLIED_ISSUE_GNR_TYP() { return l_setSUPPLIED_ISSUE_GNR_TYP; }
	public List getList_setSUPPLIED_ISSUE_QTY() { return l_setSUPPLIED_ISSUE_QTY; }
	public List getList_setTOTAL_ISSUE_QTY() { return l_setTOTAL_ISSUE_QTY; }
	public List getList_setSUPPLIED_UNIT_DENOMINATOR() { return l_setSUPPLIED_UNIT_DENOMINATOR; }
	public List getList_setSUPPLIED_UNIT_NUMERATOR() { return l_setSUPPLIED_UNIT_NUMERATOR; }
	public List getList_setSUPPLIED_DATE() { return l_setSUPPLIED_DATE; }
	public List getList_setPART_SUPPLIED_COMMENT() { return l_setPART_SUPPLIED_COMMENT; }
	public List getList_readSTOCK_ON_HAND_QTY() { return l_readSTOCK_ON_HAND_QTY; }
	public List getList_setWH_CD() { return l_setWH_CD; }
	public List getList_readWH_CD() { return l_readWH_CD; }
	public List getList_setSTOCK_ON_HAND_QTY() { return l_setSTOCK_ON_HAND_QTY; }
	public List getList_setRCV_ISSUE_CTRL_CD() { return l_setRCV_ISSUE_CTRL_CD; }
	public List getList_setRCV_ISSUE_TYP() { return l_setRCV_ISSUE_TYP; }
	public List getList_setACPT_RSLT_CRCT_NO() { return l_setACPT_RSLT_CRCT_NO; }
	public List getList_setINSPEC_RSLT_CRCT_NO() { return l_setINSPEC_RSLT_CRCT_NO; }
	public List getList_setWORK_ODR_CD() { return l_setWORK_ODR_CD; }
	public List getList_setWORK_IN_PROC_CD() { return l_setWORK_IN_PROC_CD; }
	public List getList_setPARTIAL_PRD_NO() { return l_setPARTIAL_PRD_NO; }
	public List getList_setOPR_RSLT_CRCT_NO() { return l_setOPR_RSLT_CRCT_NO; }
	public List getList_setRCV_ISSUE_BEFORE_QTY() { return l_setRCV_ISSUE_BEFORE_QTY; }
	public List getList_setRCV_ISSUE_QTY() { return l_setRCV_ISSUE_QTY; }
	public List getList_setRCV_ISSUE_AFTER_QTY() { return l_setRCV_ISSUE_AFTER_QTY; }
	public List getList_setRCV_ISSUE_AMOUNT() { return l_setRCV_ISSUE_AMOUNT; }
	public List getList_setRCV_ISSUE_DATE() { return l_setRCV_ISSUE_DATE; }
	public List getList_setRCV_ISSUE_GNR_TYP() { return l_setRCV_ISSUE_GNR_TYP; }
	public List getList_setRCV_ISSUE_ODD_QTY() { return l_setRCV_ISSUE_ODD_QTY; }
	public List getList_setDEFECT_CAUSE_CD() { return l_setDEFECT_CAUSE_CD; }
	public List getList_setSTOCK_UPD_TYP() { return l_setSTOCK_UPD_TYP; }
	public List getList_setRCV_ISSUE_CMPLT_FLG() { return l_setRCV_ISSUE_CMPLT_FLG; }
	public List getList_setOD_NO() { return l_setOD_NO; }
	public List getList_setLOT_NO() { return l_setLOT_NO; }
	public List getList_setVEND_LOT_NO() { return l_setVEND_LOT_NO; }
	public List getList_setRCV_ISSUE_COMMENT() { return l_setRCV_ISSUE_COMMENT; }
	public List getList_setCONS_TYP() { return l_setCONS_TYP; }
	public List getList_setCONS_EXEC_DATE() { return l_setCONS_EXEC_DATE; }
	public List getList_THIS_MONTH() { return l_THIS_MONTH; }
	public List getList_INSTALL_FLG() { return l_INSTALL_FLG; }
	public List getList_readSUPPLIED_ISSUE_QTY() { return l_readSUPPLIED_ISSUE_QTY; }
	public List getList_readTOTAL_ISSUE_QTY() { return l_readTOTAL_ISSUE_QTY; }
	public List getList_readSUPPLIED_UNIT_DENOMINATOR() { return l_readSUPPLIED_UNIT_DENOMINATOR; }
	public List getList_readSUPPLIED_UNIT_NUMERATOR() { return l_readSUPPLIED_UNIT_NUMERATOR; }
	public List getList_PROC_EXEC_DATE() { return l_PROC_EXEC_DATE; }
	public List getList_PAST_RESULT_ENTRY_TYP() { return l_PAST_RESULT_ENTRY_TYP; }
	public List getList_INSPC_WH_NAME() { return l_INSPC_WH_NAME; }
	public List getList_ISSUE_INST_CD() { return l_ISSUE_INST_CD; }
	public List getList_readLOT_NO() { return l_readLOT_NO; }
	public List getList_readQTY() { return l_readQTY; }
	public List getList_BEST_BEFORE_DATE() { return l_BEST_BEFORE_DATE; }
	public List getList_setSEQ_NO() { return l_setSEQ_NO; }
	public List getList_readSUPPLIED_DATE() { return l_readSUPPLIED_DATE; }
	public List getList_setSPENT_QTY() { return l_setSPENT_QTY; }
	public List getList_NEXTVAL() { return l_NEXTVAL; }
	public List getList_OD_NO() { return l_OD_NO; }
	public List getList_ODR_QTY() { return l_ODR_QTY; }
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
	public List getList_FROM_PUCH_ODR_CD() { return l_FROM_PUCH_ODR_CD; }
	public List getList_TO_PUCH_ODR_CD() { return l_TO_PUCH_ODR_CD; }
	public List getList_FROM_ITEM_CD() { return l_FROM_ITEM_CD; }
	public List getList_FROM_LOT_NO() { return l_FROM_LOT_NO; }
	public List getList_TO_ITEM_CD() { return l_TO_ITEM_CD; }
	public List getList_TO_LOT_NO() { return l_TO_LOT_NO; }

	public void seth_PUCH_ODR_CD(String val) { m_h_PUCH_ODR_CD = val; }
	public void setc_COMPLETE(String val) { m_c_COMPLETE = val; }
	public void setUNIT_COST_TYP_name(String val) { m_UNIT_COST_TYP_name = val; }
	public void setUNIT_COST_TYP_val(String val) { m_UNIT_COST_TYP_val = val; }
	public void setHOME_CUR_UNIT(String val) { m_HOME_CUR_UNIT = val; }
	public void setACPT_INSPC_TYP_DN(String val) { m_ACPT_INSPC_TYP_DN = val; }
	public void setSPL_ITEM_TYP_DN(String val) { m_SPL_ITEM_TYP_DN = val; }
	public void setPRODUCT_TYP_DN(String val) { m_PRODUCT_TYP_DN = val; }
	public void setPUCH_ODR_STS_TYP_DN(String val) { m_PUCH_ODR_STS_TYP_DN = val; }
	public void setNON_NO_ITEM_FLG_DN(String val) { m_NON_NO_ITEM_FLG_DN = val; }
	public void setINSPC_CMPLT_FLG_DN(String val) { m_INSPC_CMPLT_FLG_DN = val; }
	public void setSelectUnitCostFlag(String val) { m_SelectUnitCostFlag = val; }
	public void setUNIT_QTY_TYP_DN(String val) { m_UNIT_QTY_TYP_DN = val; }
	public void setc_CANCEL(String val) { m_c_CANCEL = val; }
	public void seth_ACPT_QTY(String val) { m_h_ACPT_QTY = val; }
	public void seth_ODR_CANCEL_SLIP_ISS_FLG(String val) { m_h_ODR_CANCEL_SLIP_ISS_FLG = val; }
	public void setITEM_CD_DW(String val) { m_ITEM_CD_DW = val; }
	public void setITEM_NAME_DW(String val) { m_ITEM_NAME_DW = val; }
	public void seth_LOTCTRL(String val) { m_h_LOTCTRL = val; }
	public void setparam1(String val) { m_param1 = val; }
	public void setparam2(String val) { m_param2 = val; }
	public void setparam3(String val) { m_param3 = val; }
	public void seth_LOT_NO(String val) { m_h_LOT_NO = val; }
	public void seth_PUCH_ODR_CD_1(String val) { m_h_PUCH_ODR_CD_1 = val; }
	public void setHOME_DECIMAL_FIG(String val) { m_HOME_DECIMAL_FIG = val; }
	public void setPUCH_ODR_CD(String val) { m_PUCH_ODR_CD = val; }
	public void setACPT_NO(String val) { m_ACPT_NO = val; }
	public void setACPT_QTY(String val) { m_ACPT_QTY = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setNON_NO_ITEM_NAME(String val) { m_NON_NO_ITEM_NAME = val; }
	public void setACPT_DATE(String val) { m_ACPT_DATE = val; }
	public void setVEND_LOT_NO(String val) { m_VEND_LOT_NO = val; }
	public void setWH_CD(String val) { m_WH_CD = val; }
	public void setWH_NAME(String val) { m_WH_NAME = val; }
	public void setCUR_CD(String val) { m_CUR_CD = val; }
	public void setCUR_NAME(String val) { m_CUR_NAME = val; }
	public void setVEND_CUR_UNIT(String val) { m_VEND_CUR_UNIT = val; }
	public void setVEND_DECIMAL_FIG(String val) { m_VEND_DECIMAL_FIG = val; }
	public void setUNIT_COST_TYP(String val) { m_UNIT_COST_TYP = val; }
	public void setUNIT_COST(String val) { m_UNIT_COST = val; }
	public void setPROCESSING_COST(String val) { m_PROCESSING_COST = val; }
	public void setMATERIAL_COST(String val) { m_MATERIAL_COST = val; }
	public void setOTHER_OVERHEADS(String val) { m_OTHER_OVERHEADS = val; }
	public void setPUCH_ODR_AMOUNT(String val) { m_PUCH_ODR_AMOUNT = val; }
	public void setDISC_AMOUNT(String val) { m_DISC_AMOUNT = val; }
	public void setNET_AMOUNT(String val) { m_NET_AMOUNT = val; }
	public void setTAX_AMOUNT_1(String val) { m_TAX_AMOUNT_1 = val; }
	public void setTAX_AMOUNT_2(String val) { m_TAX_AMOUNT_2 = val; }
	public void setTAX_AMOUNT_3(String val) { m_TAX_AMOUNT_3 = val; }
	public void setTAX_RATE_1(String val) { m_TAX_RATE_1 = val; }
	public void setTAX_RATE_2(String val) { m_TAX_RATE_2 = val; }
	public void setTAX_RATE_3(String val) { m_TAX_RATE_3 = val; }
	public void setAMOUNT_INCLUDE_TAX(String val) { m_AMOUNT_INCLUDE_TAX = val; }
	public void setHOME_CUR_AMOUNT(String val) { m_HOME_CUR_AMOUNT = val; }
	public void setEXCH_RATE(String val) { m_EXCH_RATE = val; }
	public void setDLV_CD(String val) { m_DLV_CD = val; }
	public void setACPT_RSLT_COMMENT(String val) { m_ACPT_RSLT_COMMENT = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setDRAW_CD(String val) { m_DRAW_CD = val; }
	public void setSPEC(String val) { m_SPEC = val; }
	public void setUNIT_QTY_TYP(String val) { m_UNIT_QTY_TYP = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void setVEND_NAME(String val) { m_VEND_NAME = val; }
	public void setPUCH_ODR_QTY(String val) { m_PUCH_ODR_QTY = val; }
	public void setSUM_ACPT_QTY(String val) { m_SUM_ACPT_QTY = val; }
	public void setACPT_INSPC_TYP(String val) { m_ACPT_INSPC_TYP = val; }
	public void setPUCH_ODR_SLIP_ISS_DATE(String val) { m_PUCH_ODR_SLIP_ISS_DATE = val; }
	public void setPUCH_ODR_DLV_DATE(String val) { m_PUCH_ODR_DLV_DATE = val; }
	public void setCONFIRM_DLV_DATE(String val) { m_CONFIRM_DLV_DATE = val; }
	public void setWORK_IN_PROC_CD(String val) { m_WORK_IN_PROC_CD = val; }
	public void setPROC_NAME(String val) { m_PROC_NAME = val; }
	public void setPUCH_ODR_PERSON(String val) { m_PUCH_ODR_PERSON = val; }
	public void setUSER_NAME(String val) { m_USER_NAME = val; }
	public void setPUCH_ODR_STS_TYP(String val) { m_PUCH_ODR_STS_TYP = val; }
	public void setINSPC_CMPLT_FLG(String val) { m_INSPC_CMPLT_FLG = val; }
	public void setSPL_ITEM_TYP(String val) { m_SPL_ITEM_TYP = val; }
	public void setPRODUCT_TYP(String val) { m_PRODUCT_TYP = val; }
	public void setNON_NO_ITEM_FLG(String val) { m_NON_NO_ITEM_FLG = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setTAX_CD(String val) { m_TAX_CD = val; }
	public void setROUND_TYP(String val) { m_ROUND_TYP = val; }
	public void setTAX_ROUND_TYP(String val) { m_TAX_ROUND_TYP = val; }
	public void setPUCH_ODR_START_DATE(String val) { m_PUCH_ODR_START_DATE = val; }
	public void setBUSINESS_OPR_DATE(String val) { m_BUSINESS_OPR_DATE = val; }
	public void setPUCH_ODR_MODIFY_COUNT(String val) { m_PUCH_ODR_MODIFY_COUNT = val; }
	public void setODR_CANCEL_CAUSE_CD(String val) { m_ODR_CANCEL_CAUSE_CD = val; }
	public void setODR_CANCEL_SLIP_ISS_FLG(String val) { m_ODR_CANCEL_SLIP_ISS_FLG = val; }
	public void setPUCH_ODR_COMMENT(String val) { m_PUCH_ODR_COMMENT = val; }
	public void seth_LOT_CTRL_FLG(String val) { m_h_LOT_CTRL_FLG = val; }
	public void seth_LOT_NUMBERING_TYP(String val) { m_h_LOT_NUMBERING_TYP = val; }
	public void seth_WORK_ODR_CD(String val) { m_h_WORK_ODR_CD = val; }
	public void seth_FINAL_PROC_CD(String val) { m_h_FINAL_PROC_CD = val; }
	public void seth_DATE_FLG(String val) { m_h_DATE_FLG = val; }
	public void setACPT_STS_TYP(String val) { m_ACPT_STS_TYP = val; }
	public void setINSPC_WH_CD(String val) { m_INSPC_WH_CD = val; }
	public void setLOT_NO(String val) { m_LOT_NO = val; }
	public void setINSPC_CMPLT_DATE(String val) { m_INSPC_CMPLT_DATE = val; }
	public void setreadISSUE_INST_CD(String val) { m_readISSUE_INST_CD = val; }
	public void setreadPLANT_CD(String val) { m_readPLANT_CD = val; }
	public void setreadOD_NO(String val) { m_readOD_NO = val; }
	public void setreadITEM_CD(String val) { m_readITEM_CD = val; }
	public void setreadPUCH_ODR_CD(String val) { m_readPUCH_ODR_CD = val; }
	public void setreadCOMPANY_CD(String val) { m_readCOMPANY_CD = val; }
	public void setreadVEND_CD(String val) { m_readVEND_CD = val; }
	public void setreadCONS_TYP(String val) { m_readCONS_TYP = val; }
	public void setreadISSUE_INST_UNIT_DENOMINATOR(String val) { m_readISSUE_INST_UNIT_DENOMINATOR = val; }
	public void setreadISSUE_INST_UNIT_NUMERATOR(String val) { m_readISSUE_INST_UNIT_NUMERATOR = val; }
	public void setreadJOB_ODR_CD(String val) { m_readJOB_ODR_CD = val; }
	public void setreadJOB_ODR_DETAIL_NO(String val) { m_readJOB_ODR_DETAIL_NO = val; }
	public void setreadMRP_ODR_TYP(String val) { m_readMRP_ODR_TYP = val; }
	public void setreadUNIT_QTY_TYP(String val) { m_readUNIT_QTY_TYP = val; }
	public void setreadLOT_CONTROL_FLG(String val) { m_readLOT_CONTROL_FLG = val; }
	public void setsetPUCH_ODR_CD(String val) { m_setPUCH_ODR_CD = val; }
	public void setsetACPT_NO(String val) { m_setACPT_NO = val; }
	public void setsetITEM_CD(String val) { m_setITEM_CD = val; }
	public void setsetACPT_QTY(String val) { m_setACPT_QTY = val; }
	public void setsetCOMPANY_CD(String val) { m_setCOMPANY_CD = val; }
	public void setsetVEND_CD(String val) { m_setVEND_CD = val; }
	public void setsetJOB_ODR_CD(String val) { m_setJOB_ODR_CD = val; }
	public void setsetJOB_ODR_DETAIL_NO(String val) { m_setJOB_ODR_DETAIL_NO = val; }
	public void setsetPLANT_CD(String val) { m_setPLANT_CD = val; }
	public void setsetISSUE_INST_CD(String val) { m_setISSUE_INST_CD = val; }
	public void setsetMRP_ODR_TYP(String val) { m_setMRP_ODR_TYP = val; }
	public void setsetSUPPLIED_ISSUE_GNR_TYP(String val) { m_setSUPPLIED_ISSUE_GNR_TYP = val; }
	public void setsetSUPPLIED_ISSUE_QTY(String val) { m_setSUPPLIED_ISSUE_QTY = val; }
	public void setsetTOTAL_ISSUE_QTY(String val) { m_setTOTAL_ISSUE_QTY = val; }
	public void setsetSUPPLIED_UNIT_DENOMINATOR(String val) { m_setSUPPLIED_UNIT_DENOMINATOR = val; }
	public void setsetSUPPLIED_UNIT_NUMERATOR(String val) { m_setSUPPLIED_UNIT_NUMERATOR = val; }
	public void setsetSUPPLIED_DATE(String val) { m_setSUPPLIED_DATE = val; }
	public void setsetPART_SUPPLIED_COMMENT(String val) { m_setPART_SUPPLIED_COMMENT = val; }
	public void setreadSTOCK_ON_HAND_QTY(String val) { m_readSTOCK_ON_HAND_QTY = val; }
	public void setsetWH_CD(String val) { m_setWH_CD = val; }
	public void setreadWH_CD(String val) { m_readWH_CD = val; }
	public void setsetSTOCK_ON_HAND_QTY(String val) { m_setSTOCK_ON_HAND_QTY = val; }
	public void setsetRCV_ISSUE_CTRL_CD(String val) { m_setRCV_ISSUE_CTRL_CD = val; }
	public void setsetRCV_ISSUE_TYP(String val) { m_setRCV_ISSUE_TYP = val; }
	public void setsetACPT_RSLT_CRCT_NO(String val) { m_setACPT_RSLT_CRCT_NO = val; }
	public void setsetINSPEC_RSLT_CRCT_NO(String val) { m_setINSPEC_RSLT_CRCT_NO = val; }
	public void setsetWORK_ODR_CD(String val) { m_setWORK_ODR_CD = val; }
	public void setsetWORK_IN_PROC_CD(String val) { m_setWORK_IN_PROC_CD = val; }
	public void setsetPARTIAL_PRD_NO(String val) { m_setPARTIAL_PRD_NO = val; }
	public void setsetOPR_RSLT_CRCT_NO(String val) { m_setOPR_RSLT_CRCT_NO = val; }
	public void setsetRCV_ISSUE_BEFORE_QTY(String val) { m_setRCV_ISSUE_BEFORE_QTY = val; }
	public void setsetRCV_ISSUE_QTY(String val) { m_setRCV_ISSUE_QTY = val; }
	public void setsetRCV_ISSUE_AFTER_QTY(String val) { m_setRCV_ISSUE_AFTER_QTY = val; }
	public void setsetRCV_ISSUE_AMOUNT(String val) { m_setRCV_ISSUE_AMOUNT = val; }
	public void setsetRCV_ISSUE_DATE(String val) { m_setRCV_ISSUE_DATE = val; }
	public void setsetRCV_ISSUE_GNR_TYP(String val) { m_setRCV_ISSUE_GNR_TYP = val; }
	public void setsetRCV_ISSUE_ODD_QTY(String val) { m_setRCV_ISSUE_ODD_QTY = val; }
	public void setsetDEFECT_CAUSE_CD(String val) { m_setDEFECT_CAUSE_CD = val; }
	public void setsetSTOCK_UPD_TYP(String val) { m_setSTOCK_UPD_TYP = val; }
	public void setsetRCV_ISSUE_CMPLT_FLG(String val) { m_setRCV_ISSUE_CMPLT_FLG = val; }
	public void setsetOD_NO(String val) { m_setOD_NO = val; }
	public void setsetLOT_NO(String val) { m_setLOT_NO = val; }
	public void setsetVEND_LOT_NO(String val) { m_setVEND_LOT_NO = val; }
	public void setsetRCV_ISSUE_COMMENT(String val) { m_setRCV_ISSUE_COMMENT = val; }
	public void setsetCONS_TYP(String val) { m_setCONS_TYP = val; }
	public void setsetCONS_EXEC_DATE(String val) { m_setCONS_EXEC_DATE = val; }
	public void setTHIS_MONTH(String val) { m_THIS_MONTH = val; }
	public void setINSTALL_FLG(String val) { m_INSTALL_FLG = val; }
	public void setreadSUPPLIED_ISSUE_QTY(String val) { m_readSUPPLIED_ISSUE_QTY = val; }
	public void setreadTOTAL_ISSUE_QTY(String val) { m_readTOTAL_ISSUE_QTY = val; }
	public void setreadSUPPLIED_UNIT_DENOMINATOR(String val) { m_readSUPPLIED_UNIT_DENOMINATOR = val; }
	public void setreadSUPPLIED_UNIT_NUMERATOR(String val) { m_readSUPPLIED_UNIT_NUMERATOR = val; }
	public void setPROC_EXEC_DATE(BigDecimal val) { m_PROC_EXEC_DATE = val; }
	public void setPAST_RESULT_ENTRY_TYP(String val) { m_PAST_RESULT_ENTRY_TYP = val; }
	public void setINSPC_WH_NAME(String val) { m_INSPC_WH_NAME = val; }
	public void setISSUE_INST_CD(String val) { m_ISSUE_INST_CD = val; }
	public void setreadLOT_NO(String val) { m_readLOT_NO = val; }
	public void setreadQTY(String val) { m_readQTY = val; }
	public void setBEST_BEFORE_DATE(String val) { m_BEST_BEFORE_DATE = val; }
	public void setsetSEQ_NO(String val) { m_setSEQ_NO = val; }
	public void setreadSUPPLIED_DATE(String val) { m_readSUPPLIED_DATE = val; }
	public void setsetSPENT_QTY(String val) { m_setSPENT_QTY = val; }
	public void setNEXTVAL(String val) { m_NEXTVAL = val; }
	public void setOD_NO(String val) { m_OD_NO = val; }
	public void setODR_QTY(String val) { m_ODR_QTY = val; }
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
	public void setFROM_PUCH_ODR_CD(String val) { m_FROM_PUCH_ODR_CD = val; }
	public void setTO_PUCH_ODR_CD(String val) { m_TO_PUCH_ODR_CD = val; }
	public void setFROM_ITEM_CD(String val) { m_FROM_ITEM_CD = val; }
	public void setFROM_LOT_NO(String val) { m_FROM_LOT_NO = val; }
	public void setTO_ITEM_CD(String val) { m_TO_ITEM_CD = val; }
	public void setTO_LOT_NO(String val) { m_TO_LOT_NO = val; }


	public void setList_h_PUCH_ODR_CD(List list) { l_h_PUCH_ODR_CD = list; }
	public void setList_c_COMPLETE(List list) { l_c_COMPLETE = list; }
	public void setList_UNIT_COST_TYP_name(List list) { l_UNIT_COST_TYP_name = list; }
	public void setList_UNIT_COST_TYP_val(List list) { l_UNIT_COST_TYP_val = list; }
	public void setList_HOME_CUR_UNIT(List list) { l_HOME_CUR_UNIT = list; }
	public void setList_ACPT_INSPC_TYP_DN(List list) { l_ACPT_INSPC_TYP_DN = list; }
	public void setList_SPL_ITEM_TYP_DN(List list) { l_SPL_ITEM_TYP_DN = list; }
	public void setList_PRODUCT_TYP_DN(List list) { l_PRODUCT_TYP_DN = list; }
	public void setList_PUCH_ODR_STS_TYP_DN(List list) { l_PUCH_ODR_STS_TYP_DN = list; }
	public void setList_NON_NO_ITEM_FLG_DN(List list) { l_NON_NO_ITEM_FLG_DN = list; }
	public void setList_INSPC_CMPLT_FLG_DN(List list) { l_INSPC_CMPLT_FLG_DN = list; }
	public void setList_SelectUnitCostFlag(List list) { l_SelectUnitCostFlag = list; }
	public void setList_UNIT_QTY_TYP_DN(List list) { l_UNIT_QTY_TYP_DN = list; }
	public void setList_c_CANCEL(List list) { l_c_CANCEL = list; }
	public void setList_h_ACPT_QTY(List list) { l_h_ACPT_QTY = list; }
	public void setList_h_ODR_CANCEL_SLIP_ISS_FLG(List list) { l_h_ODR_CANCEL_SLIP_ISS_FLG = list; }
	public void setList_ITEM_CD_DW(List list) { l_ITEM_CD_DW = list; }
	public void setList_ITEM_NAME_DW(List list) { l_ITEM_NAME_DW = list; }
	public void setList_h_LOTCTRL(List list) { l_h_LOTCTRL = list; }
	public void setList_param1(List list) { l_param1 = list; }
	public void setList_param2(List list) { l_param2 = list; }
	public void setList_param3(List list) { l_param3 = list; }
	public void setList_h_LOT_NO(List list) { l_h_LOT_NO = list; }
	public void setList_h_PUCH_ODR_CD_1(List list) { l_h_PUCH_ODR_CD_1 = list; }
	public void setList_HOME_DECIMAL_FIG(List list) { l_HOME_DECIMAL_FIG = list; }
	public void setList_PUCH_ODR_CD(List list) { l_PUCH_ODR_CD = list; }
	public void setList_ACPT_NO(List list) { l_ACPT_NO = list; }
	public void setList_ACPT_QTY(List list) { l_ACPT_QTY = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_NON_NO_ITEM_NAME(List list) { l_NON_NO_ITEM_NAME = list; }
	public void setList_ACPT_DATE(List list) { l_ACPT_DATE = list; }
	public void setList_VEND_LOT_NO(List list) { l_VEND_LOT_NO = list; }
	public void setList_WH_CD(List list) { l_WH_CD = list; }
	public void setList_WH_NAME(List list) { l_WH_NAME = list; }
	public void setList_CUR_CD(List list) { l_CUR_CD = list; }
	public void setList_CUR_NAME(List list) { l_CUR_NAME = list; }
	public void setList_VEND_CUR_UNIT(List list) { l_VEND_CUR_UNIT = list; }
	public void setList_VEND_DECIMAL_FIG(List list) { l_VEND_DECIMAL_FIG = list; }
	public void setList_UNIT_COST_TYP(List list) { l_UNIT_COST_TYP = list; }
	public void setList_UNIT_COST(List list) { l_UNIT_COST = list; }
	public void setList_PROCESSING_COST(List list) { l_PROCESSING_COST = list; }
	public void setList_MATERIAL_COST(List list) { l_MATERIAL_COST = list; }
	public void setList_OTHER_OVERHEADS(List list) { l_OTHER_OVERHEADS = list; }
	public void setList_PUCH_ODR_AMOUNT(List list) { l_PUCH_ODR_AMOUNT = list; }
	public void setList_DISC_AMOUNT(List list) { l_DISC_AMOUNT = list; }
	public void setList_NET_AMOUNT(List list) { l_NET_AMOUNT = list; }
	public void setList_TAX_AMOUNT_1(List list) { l_TAX_AMOUNT_1 = list; }
	public void setList_TAX_AMOUNT_2(List list) { l_TAX_AMOUNT_2 = list; }
	public void setList_TAX_AMOUNT_3(List list) { l_TAX_AMOUNT_3 = list; }
	public void setList_TAX_RATE_1(List list) { l_TAX_RATE_1 = list; }
	public void setList_TAX_RATE_2(List list) { l_TAX_RATE_2 = list; }
	public void setList_TAX_RATE_3(List list) { l_TAX_RATE_3 = list; }
	public void setList_AMOUNT_INCLUDE_TAX(List list) { l_AMOUNT_INCLUDE_TAX = list; }
	public void setList_HOME_CUR_AMOUNT(List list) { l_HOME_CUR_AMOUNT = list; }
	public void setList_EXCH_RATE(List list) { l_EXCH_RATE = list; }
	public void setList_DLV_CD(List list) { l_DLV_CD = list; }
	public void setList_ACPT_RSLT_COMMENT(List list) { l_ACPT_RSLT_COMMENT = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_DRAW_CD(List list) { l_DRAW_CD = list; }
	public void setList_SPEC(List list) { l_SPEC = list; }
	public void setList_UNIT_QTY_TYP(List list) { l_UNIT_QTY_TYP = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_VEND_NAME(List list) { l_VEND_NAME = list; }
	public void setList_PUCH_ODR_QTY(List list) { l_PUCH_ODR_QTY = list; }
	public void setList_SUM_ACPT_QTY(List list) { l_SUM_ACPT_QTY = list; }
	public void setList_ACPT_INSPC_TYP(List list) { l_ACPT_INSPC_TYP = list; }
	public void setList_PUCH_ODR_SLIP_ISS_DATE(List list) { l_PUCH_ODR_SLIP_ISS_DATE = list; }
	public void setList_PUCH_ODR_DLV_DATE(List list) { l_PUCH_ODR_DLV_DATE = list; }
	public void setList_CONFIRM_DLV_DATE(List list) { l_CONFIRM_DLV_DATE = list; }
	public void setList_WORK_IN_PROC_CD(List list) { l_WORK_IN_PROC_CD = list; }
	public void setList_PROC_NAME(List list) { l_PROC_NAME = list; }
	public void setList_PUCH_ODR_PERSON(List list) { l_PUCH_ODR_PERSON = list; }
	public void setList_USER_NAME(List list) { l_USER_NAME = list; }
	public void setList_PUCH_ODR_STS_TYP(List list) { l_PUCH_ODR_STS_TYP = list; }
	public void setList_INSPC_CMPLT_FLG(List list) { l_INSPC_CMPLT_FLG = list; }
	public void setList_SPL_ITEM_TYP(List list) { l_SPL_ITEM_TYP = list; }
	public void setList_PRODUCT_TYP(List list) { l_PRODUCT_TYP = list; }
	public void setList_NON_NO_ITEM_FLG(List list) { l_NON_NO_ITEM_FLG = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_TAX_CD(List list) { l_TAX_CD = list; }
	public void setList_ROUND_TYP(List list) { l_ROUND_TYP = list; }
	public void setList_TAX_ROUND_TYP(List list) { l_TAX_ROUND_TYP = list; }
	public void setList_PUCH_ODR_START_DATE(List list) { l_PUCH_ODR_START_DATE = list; }
	public void setList_BUSINESS_OPR_DATE(List list) { l_BUSINESS_OPR_DATE = list; }
	public void setList_PUCH_ODR_MODIFY_COUNT(List list) { l_PUCH_ODR_MODIFY_COUNT = list; }
	public void setList_ODR_CANCEL_CAUSE_CD(List list) { l_ODR_CANCEL_CAUSE_CD = list; }
	public void setList_ODR_CANCEL_SLIP_ISS_FLG(List list) { l_ODR_CANCEL_SLIP_ISS_FLG = list; }
	public void setList_PUCH_ODR_COMMENT(List list) { l_PUCH_ODR_COMMENT = list; }
	public void setList_h_LOT_CTRL_FLG(List list) { l_h_LOT_CTRL_FLG = list; }
	public void setList_h_LOT_NUMBERING_TYP(List list) { l_h_LOT_NUMBERING_TYP = list; }
	public void setList_h_WORK_ODR_CD(List list) { l_h_WORK_ODR_CD = list; }
	public void setList_h_FINAL_PROC_CD(List list) { l_h_FINAL_PROC_CD = list; }
	public void setList_h_DATE_FLG(List list) { l_h_DATE_FLG = list; }
	public void setList_ACPT_STS_TYP(List list) { l_ACPT_STS_TYP = list; }
	public void setList_INSPC_WH_CD(List list) { l_INSPC_WH_CD = list; }
	public void setList_LOT_NO(List list) { l_LOT_NO = list; }
	public void setList_INSPC_CMPLT_DATE(List list) { l_INSPC_CMPLT_DATE = list; }
	public void setList_readISSUE_INST_CD(List list) { l_readISSUE_INST_CD = list; }
	public void setList_readPLANT_CD(List list) { l_readPLANT_CD = list; }
	public void setList_readOD_NO(List list) { l_readOD_NO = list; }
	public void setList_readITEM_CD(List list) { l_readITEM_CD = list; }
	public void setList_readPUCH_ODR_CD(List list) { l_readPUCH_ODR_CD = list; }
	public void setList_readCOMPANY_CD(List list) { l_readCOMPANY_CD = list; }
	public void setList_readVEND_CD(List list) { l_readVEND_CD = list; }
	public void setList_readCONS_TYP(List list) { l_readCONS_TYP = list; }
	public void setList_readISSUE_INST_UNIT_DENOMINATOR(List list) { l_readISSUE_INST_UNIT_DENOMINATOR = list; }
	public void setList_readISSUE_INST_UNIT_NUMERATOR(List list) { l_readISSUE_INST_UNIT_NUMERATOR = list; }
	public void setList_readJOB_ODR_CD(List list) { l_readJOB_ODR_CD = list; }
	public void setList_readJOB_ODR_DETAIL_NO(List list) { l_readJOB_ODR_DETAIL_NO = list; }
	public void setList_readMRP_ODR_TYP(List list) { l_readMRP_ODR_TYP = list; }
	public void setList_readUNIT_QTY_TYP(List list) { l_readUNIT_QTY_TYP = list; }
	public void setList_readLOT_CONTROL_FLG(List list) { l_readLOT_CONTROL_FLG = list; }
	public void setList_setPUCH_ODR_CD(List list) { l_setPUCH_ODR_CD = list; }
	public void setList_setACPT_NO(List list) { l_setACPT_NO = list; }
	public void setList_setITEM_CD(List list) { l_setITEM_CD = list; }
	public void setList_setACPT_QTY(List list) { l_setACPT_QTY = list; }
	public void setList_setCOMPANY_CD(List list) { l_setCOMPANY_CD = list; }
	public void setList_setVEND_CD(List list) { l_setVEND_CD = list; }
	public void setList_setJOB_ODR_CD(List list) { l_setJOB_ODR_CD = list; }
	public void setList_setJOB_ODR_DETAIL_NO(List list) { l_setJOB_ODR_DETAIL_NO = list; }
	public void setList_setPLANT_CD(List list) { l_setPLANT_CD = list; }
	public void setList_setISSUE_INST_CD(List list) { l_setISSUE_INST_CD = list; }
	public void setList_setMRP_ODR_TYP(List list) { l_setMRP_ODR_TYP = list; }
	public void setList_setSUPPLIED_ISSUE_GNR_TYP(List list) { l_setSUPPLIED_ISSUE_GNR_TYP = list; }
	public void setList_setSUPPLIED_ISSUE_QTY(List list) { l_setSUPPLIED_ISSUE_QTY = list; }
	public void setList_setTOTAL_ISSUE_QTY(List list) { l_setTOTAL_ISSUE_QTY = list; }
	public void setList_setSUPPLIED_UNIT_DENOMINATOR(List list) { l_setSUPPLIED_UNIT_DENOMINATOR = list; }
	public void setList_setSUPPLIED_UNIT_NUMERATOR(List list) { l_setSUPPLIED_UNIT_NUMERATOR = list; }
	public void setList_setSUPPLIED_DATE(List list) { l_setSUPPLIED_DATE = list; }
	public void setList_setPART_SUPPLIED_COMMENT(List list) { l_setPART_SUPPLIED_COMMENT = list; }
	public void setList_readSTOCK_ON_HAND_QTY(List list) { l_readSTOCK_ON_HAND_QTY = list; }
	public void setList_setWH_CD(List list) { l_setWH_CD = list; }
	public void setList_readWH_CD(List list) { l_readWH_CD = list; }
	public void setList_setSTOCK_ON_HAND_QTY(List list) { l_setSTOCK_ON_HAND_QTY = list; }
	public void setList_setRCV_ISSUE_CTRL_CD(List list) { l_setRCV_ISSUE_CTRL_CD = list; }
	public void setList_setRCV_ISSUE_TYP(List list) { l_setRCV_ISSUE_TYP = list; }
	public void setList_setACPT_RSLT_CRCT_NO(List list) { l_setACPT_RSLT_CRCT_NO = list; }
	public void setList_setINSPEC_RSLT_CRCT_NO(List list) { l_setINSPEC_RSLT_CRCT_NO = list; }
	public void setList_setWORK_ODR_CD(List list) { l_setWORK_ODR_CD = list; }
	public void setList_setWORK_IN_PROC_CD(List list) { l_setWORK_IN_PROC_CD = list; }
	public void setList_setPARTIAL_PRD_NO(List list) { l_setPARTIAL_PRD_NO = list; }
	public void setList_setOPR_RSLT_CRCT_NO(List list) { l_setOPR_RSLT_CRCT_NO = list; }
	public void setList_setRCV_ISSUE_BEFORE_QTY(List list) { l_setRCV_ISSUE_BEFORE_QTY = list; }
	public void setList_setRCV_ISSUE_QTY(List list) { l_setRCV_ISSUE_QTY = list; }
	public void setList_setRCV_ISSUE_AFTER_QTY(List list) { l_setRCV_ISSUE_AFTER_QTY = list; }
	public void setList_setRCV_ISSUE_AMOUNT(List list) { l_setRCV_ISSUE_AMOUNT = list; }
	public void setList_setRCV_ISSUE_DATE(List list) { l_setRCV_ISSUE_DATE = list; }
	public void setList_setRCV_ISSUE_GNR_TYP(List list) { l_setRCV_ISSUE_GNR_TYP = list; }
	public void setList_setRCV_ISSUE_ODD_QTY(List list) { l_setRCV_ISSUE_ODD_QTY = list; }
	public void setList_setDEFECT_CAUSE_CD(List list) { l_setDEFECT_CAUSE_CD = list; }
	public void setList_setSTOCK_UPD_TYP(List list) { l_setSTOCK_UPD_TYP = list; }
	public void setList_setRCV_ISSUE_CMPLT_FLG(List list) { l_setRCV_ISSUE_CMPLT_FLG = list; }
	public void setList_setOD_NO(List list) { l_setOD_NO = list; }
	public void setList_setLOT_NO(List list) { l_setLOT_NO = list; }
	public void setList_setVEND_LOT_NO(List list) { l_setVEND_LOT_NO = list; }
	public void setList_setRCV_ISSUE_COMMENT(List list) { l_setRCV_ISSUE_COMMENT = list; }
	public void setList_setCONS_TYP(List list) { l_setCONS_TYP = list; }
	public void setList_setCONS_EXEC_DATE(List list) { l_setCONS_EXEC_DATE = list; }
	public void setList_THIS_MONTH(List list) { l_THIS_MONTH = list; }
	public void setList_INSTALL_FLG(List list) { l_INSTALL_FLG = list; }
	public void setList_readSUPPLIED_ISSUE_QTY(List list) { l_readSUPPLIED_ISSUE_QTY = list; }
	public void setList_readTOTAL_ISSUE_QTY(List list) { l_readTOTAL_ISSUE_QTY = list; }
	public void setList_readSUPPLIED_UNIT_DENOMINATOR(List list) { l_readSUPPLIED_UNIT_DENOMINATOR = list; }
	public void setList_readSUPPLIED_UNIT_NUMERATOR(List list) { l_readSUPPLIED_UNIT_NUMERATOR = list; }
	public void setList_PROC_EXEC_DATE(List list) { l_PROC_EXEC_DATE = list; }
	public void setList_PAST_RESULT_ENTRY_TYP(List list) { l_PAST_RESULT_ENTRY_TYP = list; }
	public void setList_INSPC_WH_NAME(List list) { l_INSPC_WH_NAME = list; }
	public void setList_ISSUE_INST_CD(List list) { l_ISSUE_INST_CD = list; }
	public void setList_readLOT_NO(List list) { l_readLOT_NO = list; }
	public void setList_readQTY(List list) { l_readQTY = list; }
	public void setList_BEST_BEFORE_DATE(List list) { l_BEST_BEFORE_DATE = list; }
	public void setList_setSEQ_NO(List list) { l_setSEQ_NO = list; }
	public void setList_readSUPPLIED_DATE(List list) { l_readSUPPLIED_DATE = list; }
	public void setList_setSPENT_QTY(List list) { l_setSPENT_QTY = list; }
	public void setList_NEXTVAL(List list) { l_NEXTVAL = list; }
	public void setList_OD_NO(List list) { l_OD_NO = list; }
	public void setList_ODR_QTY(List list) { l_ODR_QTY = list; }
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
	public void setList_FROM_PUCH_ODR_CD(List list) { l_FROM_PUCH_ODR_CD = list; }
	public void setList_TO_PUCH_ODR_CD(List list) { l_TO_PUCH_ODR_CD = list; }
	public void setList_FROM_ITEM_CD(List list) { l_FROM_ITEM_CD = list; }
	public void setList_FROM_LOT_NO(List list) { l_FROM_LOT_NO = list; }
	public void setList_TO_ITEM_CD(List list) { l_TO_ITEM_CD = list; }
	public void setList_TO_LOT_NO(List list) { l_TO_LOT_NO = list; }

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
			l_h_PUCH_ODR_CD.add(((AE0060010Struct) list.get(i)).geth_PUCH_ODR_CD());
		}
		return size;
	}
	public int setL2L_c_COMPLETE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_COMPLETE == null) {
			l_c_COMPLETE = new ArrayList();
		} else {
			l_c_COMPLETE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_COMPLETE.add(((AE0060010Struct) list.get(i)).getc_COMPLETE());
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
			l_UNIT_COST_TYP_name.add(((AE0060010Struct) list.get(i)).getUNIT_COST_TYP_name());
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
			l_UNIT_COST_TYP_val.add(((AE0060010Struct) list.get(i)).getUNIT_COST_TYP_val());
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
			l_HOME_CUR_UNIT.add(((AE0060010Struct) list.get(i)).getHOME_CUR_UNIT());
		}
		return size;
	}
	public int setL2L_ACPT_INSPC_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACPT_INSPC_TYP_DN == null) {
			l_ACPT_INSPC_TYP_DN = new ArrayList();
		} else {
			l_ACPT_INSPC_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACPT_INSPC_TYP_DN.add(((AE0060010Struct) list.get(i)).getACPT_INSPC_TYP_DN());
		}
		return size;
	}
	public int setL2L_SPL_ITEM_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SPL_ITEM_TYP_DN == null) {
			l_SPL_ITEM_TYP_DN = new ArrayList();
		} else {
			l_SPL_ITEM_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SPL_ITEM_TYP_DN.add(((AE0060010Struct) list.get(i)).getSPL_ITEM_TYP_DN());
		}
		return size;
	}
	public int setL2L_PRODUCT_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRODUCT_TYP_DN == null) {
			l_PRODUCT_TYP_DN = new ArrayList();
		} else {
			l_PRODUCT_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRODUCT_TYP_DN.add(((AE0060010Struct) list.get(i)).getPRODUCT_TYP_DN());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_STS_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_STS_TYP_DN == null) {
			l_PUCH_ODR_STS_TYP_DN = new ArrayList();
		} else {
			l_PUCH_ODR_STS_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_STS_TYP_DN.add(((AE0060010Struct) list.get(i)).getPUCH_ODR_STS_TYP_DN());
		}
		return size;
	}
	public int setL2L_NON_NO_ITEM_FLG_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NON_NO_ITEM_FLG_DN == null) {
			l_NON_NO_ITEM_FLG_DN = new ArrayList();
		} else {
			l_NON_NO_ITEM_FLG_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NON_NO_ITEM_FLG_DN.add(((AE0060010Struct) list.get(i)).getNON_NO_ITEM_FLG_DN());
		}
		return size;
	}
	public int setL2L_INSPC_CMPLT_FLG_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INSPC_CMPLT_FLG_DN == null) {
			l_INSPC_CMPLT_FLG_DN = new ArrayList();
		} else {
			l_INSPC_CMPLT_FLG_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INSPC_CMPLT_FLG_DN.add(((AE0060010Struct) list.get(i)).getINSPC_CMPLT_FLG_DN());
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
			l_SelectUnitCostFlag.add(((AE0060010Struct) list.get(i)).getSelectUnitCostFlag());
		}
		return size;
	}
	public int setL2L_UNIT_QTY_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_QTY_TYP_DN == null) {
			l_UNIT_QTY_TYP_DN = new ArrayList();
		} else {
			l_UNIT_QTY_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_QTY_TYP_DN.add(((AE0060010Struct) list.get(i)).getUNIT_QTY_TYP_DN());
		}
		return size;
	}
	public int setL2L_c_CANCEL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_CANCEL == null) {
			l_c_CANCEL = new ArrayList();
		} else {
			l_c_CANCEL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_CANCEL.add(((AE0060010Struct) list.get(i)).getc_CANCEL());
		}
		return size;
	}
	public int setL2L_h_ACPT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ACPT_QTY == null) {
			l_h_ACPT_QTY = new ArrayList();
		} else {
			l_h_ACPT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ACPT_QTY.add(((AE0060010Struct) list.get(i)).geth_ACPT_QTY());
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
			l_h_ODR_CANCEL_SLIP_ISS_FLG.add(((AE0060010Struct) list.get(i)).geth_ODR_CANCEL_SLIP_ISS_FLG());
		}
		return size;
	}
	public int setL2L_ITEM_CD_DW(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CD_DW == null) {
			l_ITEM_CD_DW = new ArrayList();
		} else {
			l_ITEM_CD_DW.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CD_DW.add(((AE0060010Struct) list.get(i)).getITEM_CD_DW());
		}
		return size;
	}
	public int setL2L_ITEM_NAME_DW(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_NAME_DW == null) {
			l_ITEM_NAME_DW = new ArrayList();
		} else {
			l_ITEM_NAME_DW.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_NAME_DW.add(((AE0060010Struct) list.get(i)).getITEM_NAME_DW());
		}
		return size;
	}
	public int setL2L_h_LOTCTRL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_LOTCTRL == null) {
			l_h_LOTCTRL = new ArrayList();
		} else {
			l_h_LOTCTRL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_LOTCTRL.add(((AE0060010Struct) list.get(i)).geth_LOTCTRL());
		}
		return size;
	}
	public int setL2L_param1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_param1 == null) {
			l_param1 = new ArrayList();
		} else {
			l_param1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_param1.add(((AE0060010Struct) list.get(i)).getparam1());
		}
		return size;
	}
	public int setL2L_param2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_param2 == null) {
			l_param2 = new ArrayList();
		} else {
			l_param2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_param2.add(((AE0060010Struct) list.get(i)).getparam2());
		}
		return size;
	}
	public int setL2L_param3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_param3 == null) {
			l_param3 = new ArrayList();
		} else {
			l_param3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_param3.add(((AE0060010Struct) list.get(i)).getparam3());
		}
		return size;
	}
	public int setL2L_h_LOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_LOT_NO == null) {
			l_h_LOT_NO = new ArrayList();
		} else {
			l_h_LOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_LOT_NO.add(((AE0060010Struct) list.get(i)).geth_LOT_NO());
		}
		return size;
	}
	public int setL2L_h_PUCH_ODR_CD_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PUCH_ODR_CD_1 == null) {
			l_h_PUCH_ODR_CD_1 = new ArrayList();
		} else {
			l_h_PUCH_ODR_CD_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PUCH_ODR_CD_1.add(((AE0060010Struct) list.get(i)).geth_PUCH_ODR_CD_1());
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
			l_HOME_DECIMAL_FIG.add(((AE0060010Struct) list.get(i)).getHOME_DECIMAL_FIG());
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
			l_PUCH_ODR_CD.add(((AE0060010Struct) list.get(i)).getPUCH_ODR_CD());
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
			l_ACPT_NO.add(((AE0060010Struct) list.get(i)).getACPT_NO());
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
			l_ACPT_QTY.add(((AE0060010Struct) list.get(i)).getACPT_QTY());
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
			l_STOCK_UNIT.add(((AE0060010Struct) list.get(i)).getSTOCK_UNIT());
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
			l_NON_NO_ITEM_NAME.add(((AE0060010Struct) list.get(i)).getNON_NO_ITEM_NAME());
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
			l_ACPT_DATE.add(((AE0060010Struct) list.get(i)).getACPT_DATE());
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
			l_VEND_LOT_NO.add(((AE0060010Struct) list.get(i)).getVEND_LOT_NO());
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
			l_WH_CD.add(((AE0060010Struct) list.get(i)).getWH_CD());
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
			l_WH_NAME.add(((AE0060010Struct) list.get(i)).getWH_NAME());
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
			l_CUR_CD.add(((AE0060010Struct) list.get(i)).getCUR_CD());
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
			l_CUR_NAME.add(((AE0060010Struct) list.get(i)).getCUR_NAME());
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
			l_VEND_CUR_UNIT.add(((AE0060010Struct) list.get(i)).getVEND_CUR_UNIT());
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
			l_VEND_DECIMAL_FIG.add(((AE0060010Struct) list.get(i)).getVEND_DECIMAL_FIG());
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
			l_UNIT_COST_TYP.add(((AE0060010Struct) list.get(i)).getUNIT_COST_TYP());
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
			l_UNIT_COST.add(((AE0060010Struct) list.get(i)).getUNIT_COST());
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
			l_PROCESSING_COST.add(((AE0060010Struct) list.get(i)).getPROCESSING_COST());
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
			l_MATERIAL_COST.add(((AE0060010Struct) list.get(i)).getMATERIAL_COST());
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
			l_OTHER_OVERHEADS.add(((AE0060010Struct) list.get(i)).getOTHER_OVERHEADS());
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
			l_PUCH_ODR_AMOUNT.add(((AE0060010Struct) list.get(i)).getPUCH_ODR_AMOUNT());
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
			l_DISC_AMOUNT.add(((AE0060010Struct) list.get(i)).getDISC_AMOUNT());
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
			l_NET_AMOUNT.add(((AE0060010Struct) list.get(i)).getNET_AMOUNT());
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
			l_TAX_AMOUNT_1.add(((AE0060010Struct) list.get(i)).getTAX_AMOUNT_1());
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
			l_TAX_AMOUNT_2.add(((AE0060010Struct) list.get(i)).getTAX_AMOUNT_2());
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
			l_TAX_AMOUNT_3.add(((AE0060010Struct) list.get(i)).getTAX_AMOUNT_3());
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
			l_TAX_RATE_1.add(((AE0060010Struct) list.get(i)).getTAX_RATE_1());
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
			l_TAX_RATE_2.add(((AE0060010Struct) list.get(i)).getTAX_RATE_2());
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
			l_TAX_RATE_3.add(((AE0060010Struct) list.get(i)).getTAX_RATE_3());
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
			l_AMOUNT_INCLUDE_TAX.add(((AE0060010Struct) list.get(i)).getAMOUNT_INCLUDE_TAX());
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
			l_HOME_CUR_AMOUNT.add(((AE0060010Struct) list.get(i)).getHOME_CUR_AMOUNT());
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
			l_EXCH_RATE.add(((AE0060010Struct) list.get(i)).getEXCH_RATE());
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
			l_DLV_CD.add(((AE0060010Struct) list.get(i)).getDLV_CD());
		}
		return size;
	}
	public int setL2L_ACPT_RSLT_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACPT_RSLT_COMMENT == null) {
			l_ACPT_RSLT_COMMENT = new ArrayList();
		} else {
			l_ACPT_RSLT_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACPT_RSLT_COMMENT.add(((AE0060010Struct) list.get(i)).getACPT_RSLT_COMMENT());
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
			l_ITEM_CD.add(((AE0060010Struct) list.get(i)).getITEM_CD());
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
			l_ITEM_NAME.add(((AE0060010Struct) list.get(i)).getITEM_NAME());
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
			l_JOB_ODR_CD.add(((AE0060010Struct) list.get(i)).getJOB_ODR_CD());
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
			l_DRAW_CD.add(((AE0060010Struct) list.get(i)).getDRAW_CD());
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
			l_SPEC.add(((AE0060010Struct) list.get(i)).getSPEC());
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
			l_UNIT_QTY_TYP.add(((AE0060010Struct) list.get(i)).getUNIT_QTY_TYP());
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
			l_VEND_CD.add(((AE0060010Struct) list.get(i)).getVEND_CD());
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
			l_VEND_NAME.add(((AE0060010Struct) list.get(i)).getVEND_NAME());
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
			l_PUCH_ODR_QTY.add(((AE0060010Struct) list.get(i)).getPUCH_ODR_QTY());
		}
		return size;
	}
	public int setL2L_SUM_ACPT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUM_ACPT_QTY == null) {
			l_SUM_ACPT_QTY = new ArrayList();
		} else {
			l_SUM_ACPT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUM_ACPT_QTY.add(((AE0060010Struct) list.get(i)).getSUM_ACPT_QTY());
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
			l_ACPT_INSPC_TYP.add(((AE0060010Struct) list.get(i)).getACPT_INSPC_TYP());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_SLIP_ISS_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_SLIP_ISS_DATE == null) {
			l_PUCH_ODR_SLIP_ISS_DATE = new ArrayList();
		} else {
			l_PUCH_ODR_SLIP_ISS_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_SLIP_ISS_DATE.add(((AE0060010Struct) list.get(i)).getPUCH_ODR_SLIP_ISS_DATE());
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
			l_PUCH_ODR_DLV_DATE.add(((AE0060010Struct) list.get(i)).getPUCH_ODR_DLV_DATE());
		}
		return size;
	}
	public int setL2L_CONFIRM_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CONFIRM_DLV_DATE == null) {
			l_CONFIRM_DLV_DATE = new ArrayList();
		} else {
			l_CONFIRM_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CONFIRM_DLV_DATE.add(((AE0060010Struct) list.get(i)).getCONFIRM_DLV_DATE());
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
			l_WORK_IN_PROC_CD.add(((AE0060010Struct) list.get(i)).getWORK_IN_PROC_CD());
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
			l_PROC_NAME.add(((AE0060010Struct) list.get(i)).getPROC_NAME());
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
			l_PUCH_ODR_PERSON.add(((AE0060010Struct) list.get(i)).getPUCH_ODR_PERSON());
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
			l_USER_NAME.add(((AE0060010Struct) list.get(i)).getUSER_NAME());
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
			l_PUCH_ODR_STS_TYP.add(((AE0060010Struct) list.get(i)).getPUCH_ODR_STS_TYP());
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
			l_INSPC_CMPLT_FLG.add(((AE0060010Struct) list.get(i)).getINSPC_CMPLT_FLG());
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
			l_SPL_ITEM_TYP.add(((AE0060010Struct) list.get(i)).getSPL_ITEM_TYP());
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
			l_PRODUCT_TYP.add(((AE0060010Struct) list.get(i)).getPRODUCT_TYP());
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
			l_NON_NO_ITEM_FLG.add(((AE0060010Struct) list.get(i)).getNON_NO_ITEM_FLG());
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
			l_PLANT_CD.add(((AE0060010Struct) list.get(i)).getPLANT_CD());
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
			l_COMPANY_CD.add(((AE0060010Struct) list.get(i)).getCOMPANY_CD());
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
			l_TAX_CD.add(((AE0060010Struct) list.get(i)).getTAX_CD());
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
			l_ROUND_TYP.add(((AE0060010Struct) list.get(i)).getROUND_TYP());
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
			l_TAX_ROUND_TYP.add(((AE0060010Struct) list.get(i)).getTAX_ROUND_TYP());
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
			l_PUCH_ODR_START_DATE.add(((AE0060010Struct) list.get(i)).getPUCH_ODR_START_DATE());
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
			l_BUSINESS_OPR_DATE.add(((AE0060010Struct) list.get(i)).getBUSINESS_OPR_DATE());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_MODIFY_COUNT == null) {
			l_PUCH_ODR_MODIFY_COUNT = new ArrayList();
		} else {
			l_PUCH_ODR_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_MODIFY_COUNT.add(((AE0060010Struct) list.get(i)).getPUCH_ODR_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_ODR_CANCEL_CAUSE_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_CANCEL_CAUSE_CD == null) {
			l_ODR_CANCEL_CAUSE_CD = new ArrayList();
		} else {
			l_ODR_CANCEL_CAUSE_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_CANCEL_CAUSE_CD.add(((AE0060010Struct) list.get(i)).getODR_CANCEL_CAUSE_CD());
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
			l_ODR_CANCEL_SLIP_ISS_FLG.add(((AE0060010Struct) list.get(i)).getODR_CANCEL_SLIP_ISS_FLG());
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
			l_PUCH_ODR_COMMENT.add(((AE0060010Struct) list.get(i)).getPUCH_ODR_COMMENT());
		}
		return size;
	}
	public int setL2L_h_LOT_CTRL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_LOT_CTRL_FLG == null) {
			l_h_LOT_CTRL_FLG = new ArrayList();
		} else {
			l_h_LOT_CTRL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_LOT_CTRL_FLG.add(((AE0060010Struct) list.get(i)).geth_LOT_CTRL_FLG());
		}
		return size;
	}
	public int setL2L_h_LOT_NUMBERING_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_LOT_NUMBERING_TYP == null) {
			l_h_LOT_NUMBERING_TYP = new ArrayList();
		} else {
			l_h_LOT_NUMBERING_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_LOT_NUMBERING_TYP.add(((AE0060010Struct) list.get(i)).geth_LOT_NUMBERING_TYP());
		}
		return size;
	}
	public int setL2L_h_WORK_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_WORK_ODR_CD == null) {
			l_h_WORK_ODR_CD = new ArrayList();
		} else {
			l_h_WORK_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_WORK_ODR_CD.add(((AE0060010Struct) list.get(i)).geth_WORK_ODR_CD());
		}
		return size;
	}
	public int setL2L_h_FINAL_PROC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_FINAL_PROC_CD == null) {
			l_h_FINAL_PROC_CD = new ArrayList();
		} else {
			l_h_FINAL_PROC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_FINAL_PROC_CD.add(((AE0060010Struct) list.get(i)).geth_FINAL_PROC_CD());
		}
		return size;
	}
	public int setL2L_h_DATE_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_DATE_FLG == null) {
			l_h_DATE_FLG = new ArrayList();
		} else {
			l_h_DATE_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_DATE_FLG.add(((AE0060010Struct) list.get(i)).geth_DATE_FLG());
		}
		return size;
	}
	public int setL2L_ACPT_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACPT_STS_TYP == null) {
			l_ACPT_STS_TYP = new ArrayList();
		} else {
			l_ACPT_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACPT_STS_TYP.add(((AE0060010Struct) list.get(i)).getACPT_STS_TYP());
		}
		return size;
	}
	public int setL2L_INSPC_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INSPC_WH_CD == null) {
			l_INSPC_WH_CD = new ArrayList();
		} else {
			l_INSPC_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INSPC_WH_CD.add(((AE0060010Struct) list.get(i)).getINSPC_WH_CD());
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
			l_LOT_NO.add(((AE0060010Struct) list.get(i)).getLOT_NO());
		}
		return size;
	}
	public int setL2L_INSPC_CMPLT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INSPC_CMPLT_DATE == null) {
			l_INSPC_CMPLT_DATE = new ArrayList();
		} else {
			l_INSPC_CMPLT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INSPC_CMPLT_DATE.add(((AE0060010Struct) list.get(i)).getINSPC_CMPLT_DATE());
		}
		return size;
	}
	public int setL2L_readISSUE_INST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readISSUE_INST_CD == null) {
			l_readISSUE_INST_CD = new ArrayList();
		} else {
			l_readISSUE_INST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readISSUE_INST_CD.add(((AE0060010Struct) list.get(i)).getreadISSUE_INST_CD());
		}
		return size;
	}
	public int setL2L_readPLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readPLANT_CD == null) {
			l_readPLANT_CD = new ArrayList();
		} else {
			l_readPLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readPLANT_CD.add(((AE0060010Struct) list.get(i)).getreadPLANT_CD());
		}
		return size;
	}
	public int setL2L_readOD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readOD_NO == null) {
			l_readOD_NO = new ArrayList();
		} else {
			l_readOD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readOD_NO.add(((AE0060010Struct) list.get(i)).getreadOD_NO());
		}
		return size;
	}
	public int setL2L_readITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readITEM_CD == null) {
			l_readITEM_CD = new ArrayList();
		} else {
			l_readITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readITEM_CD.add(((AE0060010Struct) list.get(i)).getreadITEM_CD());
		}
		return size;
	}
	public int setL2L_readPUCH_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readPUCH_ODR_CD == null) {
			l_readPUCH_ODR_CD = new ArrayList();
		} else {
			l_readPUCH_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readPUCH_ODR_CD.add(((AE0060010Struct) list.get(i)).getreadPUCH_ODR_CD());
		}
		return size;
	}
	public int setL2L_readCOMPANY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readCOMPANY_CD == null) {
			l_readCOMPANY_CD = new ArrayList();
		} else {
			l_readCOMPANY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readCOMPANY_CD.add(((AE0060010Struct) list.get(i)).getreadCOMPANY_CD());
		}
		return size;
	}
	public int setL2L_readVEND_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readVEND_CD == null) {
			l_readVEND_CD = new ArrayList();
		} else {
			l_readVEND_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readVEND_CD.add(((AE0060010Struct) list.get(i)).getreadVEND_CD());
		}
		return size;
	}
	public int setL2L_readCONS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readCONS_TYP == null) {
			l_readCONS_TYP = new ArrayList();
		} else {
			l_readCONS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readCONS_TYP.add(((AE0060010Struct) list.get(i)).getreadCONS_TYP());
		}
		return size;
	}
	public int setL2L_readISSUE_INST_UNIT_DENOMINATOR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readISSUE_INST_UNIT_DENOMINATOR == null) {
			l_readISSUE_INST_UNIT_DENOMINATOR = new ArrayList();
		} else {
			l_readISSUE_INST_UNIT_DENOMINATOR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readISSUE_INST_UNIT_DENOMINATOR.add(((AE0060010Struct) list.get(i)).getreadISSUE_INST_UNIT_DENOMINATOR());
		}
		return size;
	}
	public int setL2L_readISSUE_INST_UNIT_NUMERATOR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readISSUE_INST_UNIT_NUMERATOR == null) {
			l_readISSUE_INST_UNIT_NUMERATOR = new ArrayList();
		} else {
			l_readISSUE_INST_UNIT_NUMERATOR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readISSUE_INST_UNIT_NUMERATOR.add(((AE0060010Struct) list.get(i)).getreadISSUE_INST_UNIT_NUMERATOR());
		}
		return size;
	}
	public int setL2L_readJOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readJOB_ODR_CD == null) {
			l_readJOB_ODR_CD = new ArrayList();
		} else {
			l_readJOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readJOB_ODR_CD.add(((AE0060010Struct) list.get(i)).getreadJOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_readJOB_ODR_DETAIL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readJOB_ODR_DETAIL_NO == null) {
			l_readJOB_ODR_DETAIL_NO = new ArrayList();
		} else {
			l_readJOB_ODR_DETAIL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readJOB_ODR_DETAIL_NO.add(((AE0060010Struct) list.get(i)).getreadJOB_ODR_DETAIL_NO());
		}
		return size;
	}
	public int setL2L_readMRP_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readMRP_ODR_TYP == null) {
			l_readMRP_ODR_TYP = new ArrayList();
		} else {
			l_readMRP_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readMRP_ODR_TYP.add(((AE0060010Struct) list.get(i)).getreadMRP_ODR_TYP());
		}
		return size;
	}
	public int setL2L_readUNIT_QTY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readUNIT_QTY_TYP == null) {
			l_readUNIT_QTY_TYP = new ArrayList();
		} else {
			l_readUNIT_QTY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readUNIT_QTY_TYP.add(((AE0060010Struct) list.get(i)).getreadUNIT_QTY_TYP());
		}
		return size;
	}
	public int setL2L_readLOT_CONTROL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readLOT_CONTROL_FLG == null) {
			l_readLOT_CONTROL_FLG = new ArrayList();
		} else {
			l_readLOT_CONTROL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readLOT_CONTROL_FLG.add(((AE0060010Struct) list.get(i)).getreadLOT_CONTROL_FLG());
		}
		return size;
	}
	public int setL2L_setPUCH_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setPUCH_ODR_CD == null) {
			l_setPUCH_ODR_CD = new ArrayList();
		} else {
			l_setPUCH_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setPUCH_ODR_CD.add(((AE0060010Struct) list.get(i)).getsetPUCH_ODR_CD());
		}
		return size;
	}
	public int setL2L_setACPT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setACPT_NO == null) {
			l_setACPT_NO = new ArrayList();
		} else {
			l_setACPT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setACPT_NO.add(((AE0060010Struct) list.get(i)).getsetACPT_NO());
		}
		return size;
	}
	public int setL2L_setITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setITEM_CD == null) {
			l_setITEM_CD = new ArrayList();
		} else {
			l_setITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setITEM_CD.add(((AE0060010Struct) list.get(i)).getsetITEM_CD());
		}
		return size;
	}
	public int setL2L_setACPT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setACPT_QTY == null) {
			l_setACPT_QTY = new ArrayList();
		} else {
			l_setACPT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setACPT_QTY.add(((AE0060010Struct) list.get(i)).getsetACPT_QTY());
		}
		return size;
	}
	public int setL2L_setCOMPANY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setCOMPANY_CD == null) {
			l_setCOMPANY_CD = new ArrayList();
		} else {
			l_setCOMPANY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setCOMPANY_CD.add(((AE0060010Struct) list.get(i)).getsetCOMPANY_CD());
		}
		return size;
	}
	public int setL2L_setVEND_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setVEND_CD == null) {
			l_setVEND_CD = new ArrayList();
		} else {
			l_setVEND_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setVEND_CD.add(((AE0060010Struct) list.get(i)).getsetVEND_CD());
		}
		return size;
	}
	public int setL2L_setJOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setJOB_ODR_CD == null) {
			l_setJOB_ODR_CD = new ArrayList();
		} else {
			l_setJOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setJOB_ODR_CD.add(((AE0060010Struct) list.get(i)).getsetJOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_setJOB_ODR_DETAIL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setJOB_ODR_DETAIL_NO == null) {
			l_setJOB_ODR_DETAIL_NO = new ArrayList();
		} else {
			l_setJOB_ODR_DETAIL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setJOB_ODR_DETAIL_NO.add(((AE0060010Struct) list.get(i)).getsetJOB_ODR_DETAIL_NO());
		}
		return size;
	}
	public int setL2L_setPLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setPLANT_CD == null) {
			l_setPLANT_CD = new ArrayList();
		} else {
			l_setPLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setPLANT_CD.add(((AE0060010Struct) list.get(i)).getsetPLANT_CD());
		}
		return size;
	}
	public int setL2L_setISSUE_INST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setISSUE_INST_CD == null) {
			l_setISSUE_INST_CD = new ArrayList();
		} else {
			l_setISSUE_INST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setISSUE_INST_CD.add(((AE0060010Struct) list.get(i)).getsetISSUE_INST_CD());
		}
		return size;
	}
	public int setL2L_setMRP_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setMRP_ODR_TYP == null) {
			l_setMRP_ODR_TYP = new ArrayList();
		} else {
			l_setMRP_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setMRP_ODR_TYP.add(((AE0060010Struct) list.get(i)).getsetMRP_ODR_TYP());
		}
		return size;
	}
	public int setL2L_setSUPPLIED_ISSUE_GNR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setSUPPLIED_ISSUE_GNR_TYP == null) {
			l_setSUPPLIED_ISSUE_GNR_TYP = new ArrayList();
		} else {
			l_setSUPPLIED_ISSUE_GNR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setSUPPLIED_ISSUE_GNR_TYP.add(((AE0060010Struct) list.get(i)).getsetSUPPLIED_ISSUE_GNR_TYP());
		}
		return size;
	}
	public int setL2L_setSUPPLIED_ISSUE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setSUPPLIED_ISSUE_QTY == null) {
			l_setSUPPLIED_ISSUE_QTY = new ArrayList();
		} else {
			l_setSUPPLIED_ISSUE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setSUPPLIED_ISSUE_QTY.add(((AE0060010Struct) list.get(i)).getsetSUPPLIED_ISSUE_QTY());
		}
		return size;
	}
	public int setL2L_setTOTAL_ISSUE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setTOTAL_ISSUE_QTY == null) {
			l_setTOTAL_ISSUE_QTY = new ArrayList();
		} else {
			l_setTOTAL_ISSUE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setTOTAL_ISSUE_QTY.add(((AE0060010Struct) list.get(i)).getsetTOTAL_ISSUE_QTY());
		}
		return size;
	}
	public int setL2L_setSUPPLIED_UNIT_DENOMINATOR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setSUPPLIED_UNIT_DENOMINATOR == null) {
			l_setSUPPLIED_UNIT_DENOMINATOR = new ArrayList();
		} else {
			l_setSUPPLIED_UNIT_DENOMINATOR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setSUPPLIED_UNIT_DENOMINATOR.add(((AE0060010Struct) list.get(i)).getsetSUPPLIED_UNIT_DENOMINATOR());
		}
		return size;
	}
	public int setL2L_setSUPPLIED_UNIT_NUMERATOR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setSUPPLIED_UNIT_NUMERATOR == null) {
			l_setSUPPLIED_UNIT_NUMERATOR = new ArrayList();
		} else {
			l_setSUPPLIED_UNIT_NUMERATOR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setSUPPLIED_UNIT_NUMERATOR.add(((AE0060010Struct) list.get(i)).getsetSUPPLIED_UNIT_NUMERATOR());
		}
		return size;
	}
	public int setL2L_setSUPPLIED_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setSUPPLIED_DATE == null) {
			l_setSUPPLIED_DATE = new ArrayList();
		} else {
			l_setSUPPLIED_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setSUPPLIED_DATE.add(((AE0060010Struct) list.get(i)).getsetSUPPLIED_DATE());
		}
		return size;
	}
	public int setL2L_setPART_SUPPLIED_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setPART_SUPPLIED_COMMENT == null) {
			l_setPART_SUPPLIED_COMMENT = new ArrayList();
		} else {
			l_setPART_SUPPLIED_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setPART_SUPPLIED_COMMENT.add(((AE0060010Struct) list.get(i)).getsetPART_SUPPLIED_COMMENT());
		}
		return size;
	}
	public int setL2L_readSTOCK_ON_HAND_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readSTOCK_ON_HAND_QTY == null) {
			l_readSTOCK_ON_HAND_QTY = new ArrayList();
		} else {
			l_readSTOCK_ON_HAND_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readSTOCK_ON_HAND_QTY.add(((AE0060010Struct) list.get(i)).getreadSTOCK_ON_HAND_QTY());
		}
		return size;
	}
	public int setL2L_setWH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setWH_CD == null) {
			l_setWH_CD = new ArrayList();
		} else {
			l_setWH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setWH_CD.add(((AE0060010Struct) list.get(i)).getsetWH_CD());
		}
		return size;
	}
	public int setL2L_readWH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readWH_CD == null) {
			l_readWH_CD = new ArrayList();
		} else {
			l_readWH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readWH_CD.add(((AE0060010Struct) list.get(i)).getreadWH_CD());
		}
		return size;
	}
	public int setL2L_setSTOCK_ON_HAND_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setSTOCK_ON_HAND_QTY == null) {
			l_setSTOCK_ON_HAND_QTY = new ArrayList();
		} else {
			l_setSTOCK_ON_HAND_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setSTOCK_ON_HAND_QTY.add(((AE0060010Struct) list.get(i)).getsetSTOCK_ON_HAND_QTY());
		}
		return size;
	}
	public int setL2L_setRCV_ISSUE_CTRL_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setRCV_ISSUE_CTRL_CD == null) {
			l_setRCV_ISSUE_CTRL_CD = new ArrayList();
		} else {
			l_setRCV_ISSUE_CTRL_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setRCV_ISSUE_CTRL_CD.add(((AE0060010Struct) list.get(i)).getsetRCV_ISSUE_CTRL_CD());
		}
		return size;
	}
	public int setL2L_setRCV_ISSUE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setRCV_ISSUE_TYP == null) {
			l_setRCV_ISSUE_TYP = new ArrayList();
		} else {
			l_setRCV_ISSUE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setRCV_ISSUE_TYP.add(((AE0060010Struct) list.get(i)).getsetRCV_ISSUE_TYP());
		}
		return size;
	}
	public int setL2L_setACPT_RSLT_CRCT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setACPT_RSLT_CRCT_NO == null) {
			l_setACPT_RSLT_CRCT_NO = new ArrayList();
		} else {
			l_setACPT_RSLT_CRCT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setACPT_RSLT_CRCT_NO.add(((AE0060010Struct) list.get(i)).getsetACPT_RSLT_CRCT_NO());
		}
		return size;
	}
	public int setL2L_setINSPEC_RSLT_CRCT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setINSPEC_RSLT_CRCT_NO == null) {
			l_setINSPEC_RSLT_CRCT_NO = new ArrayList();
		} else {
			l_setINSPEC_RSLT_CRCT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setINSPEC_RSLT_CRCT_NO.add(((AE0060010Struct) list.get(i)).getsetINSPEC_RSLT_CRCT_NO());
		}
		return size;
	}
	public int setL2L_setWORK_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setWORK_ODR_CD == null) {
			l_setWORK_ODR_CD = new ArrayList();
		} else {
			l_setWORK_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setWORK_ODR_CD.add(((AE0060010Struct) list.get(i)).getsetWORK_ODR_CD());
		}
		return size;
	}
	public int setL2L_setWORK_IN_PROC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setWORK_IN_PROC_CD == null) {
			l_setWORK_IN_PROC_CD = new ArrayList();
		} else {
			l_setWORK_IN_PROC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setWORK_IN_PROC_CD.add(((AE0060010Struct) list.get(i)).getsetWORK_IN_PROC_CD());
		}
		return size;
	}
	public int setL2L_setPARTIAL_PRD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setPARTIAL_PRD_NO == null) {
			l_setPARTIAL_PRD_NO = new ArrayList();
		} else {
			l_setPARTIAL_PRD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setPARTIAL_PRD_NO.add(((AE0060010Struct) list.get(i)).getsetPARTIAL_PRD_NO());
		}
		return size;
	}
	public int setL2L_setOPR_RSLT_CRCT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setOPR_RSLT_CRCT_NO == null) {
			l_setOPR_RSLT_CRCT_NO = new ArrayList();
		} else {
			l_setOPR_RSLT_CRCT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setOPR_RSLT_CRCT_NO.add(((AE0060010Struct) list.get(i)).getsetOPR_RSLT_CRCT_NO());
		}
		return size;
	}
	public int setL2L_setRCV_ISSUE_BEFORE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setRCV_ISSUE_BEFORE_QTY == null) {
			l_setRCV_ISSUE_BEFORE_QTY = new ArrayList();
		} else {
			l_setRCV_ISSUE_BEFORE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setRCV_ISSUE_BEFORE_QTY.add(((AE0060010Struct) list.get(i)).getsetRCV_ISSUE_BEFORE_QTY());
		}
		return size;
	}
	public int setL2L_setRCV_ISSUE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setRCV_ISSUE_QTY == null) {
			l_setRCV_ISSUE_QTY = new ArrayList();
		} else {
			l_setRCV_ISSUE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setRCV_ISSUE_QTY.add(((AE0060010Struct) list.get(i)).getsetRCV_ISSUE_QTY());
		}
		return size;
	}
	public int setL2L_setRCV_ISSUE_AFTER_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setRCV_ISSUE_AFTER_QTY == null) {
			l_setRCV_ISSUE_AFTER_QTY = new ArrayList();
		} else {
			l_setRCV_ISSUE_AFTER_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setRCV_ISSUE_AFTER_QTY.add(((AE0060010Struct) list.get(i)).getsetRCV_ISSUE_AFTER_QTY());
		}
		return size;
	}
	public int setL2L_setRCV_ISSUE_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setRCV_ISSUE_AMOUNT == null) {
			l_setRCV_ISSUE_AMOUNT = new ArrayList();
		} else {
			l_setRCV_ISSUE_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setRCV_ISSUE_AMOUNT.add(((AE0060010Struct) list.get(i)).getsetRCV_ISSUE_AMOUNT());
		}
		return size;
	}
	public int setL2L_setRCV_ISSUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setRCV_ISSUE_DATE == null) {
			l_setRCV_ISSUE_DATE = new ArrayList();
		} else {
			l_setRCV_ISSUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setRCV_ISSUE_DATE.add(((AE0060010Struct) list.get(i)).getsetRCV_ISSUE_DATE());
		}
		return size;
	}
	public int setL2L_setRCV_ISSUE_GNR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setRCV_ISSUE_GNR_TYP == null) {
			l_setRCV_ISSUE_GNR_TYP = new ArrayList();
		} else {
			l_setRCV_ISSUE_GNR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setRCV_ISSUE_GNR_TYP.add(((AE0060010Struct) list.get(i)).getsetRCV_ISSUE_GNR_TYP());
		}
		return size;
	}
	public int setL2L_setRCV_ISSUE_ODD_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setRCV_ISSUE_ODD_QTY == null) {
			l_setRCV_ISSUE_ODD_QTY = new ArrayList();
		} else {
			l_setRCV_ISSUE_ODD_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setRCV_ISSUE_ODD_QTY.add(((AE0060010Struct) list.get(i)).getsetRCV_ISSUE_ODD_QTY());
		}
		return size;
	}
	public int setL2L_setDEFECT_CAUSE_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setDEFECT_CAUSE_CD == null) {
			l_setDEFECT_CAUSE_CD = new ArrayList();
		} else {
			l_setDEFECT_CAUSE_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setDEFECT_CAUSE_CD.add(((AE0060010Struct) list.get(i)).getsetDEFECT_CAUSE_CD());
		}
		return size;
	}
	public int setL2L_setSTOCK_UPD_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setSTOCK_UPD_TYP == null) {
			l_setSTOCK_UPD_TYP = new ArrayList();
		} else {
			l_setSTOCK_UPD_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setSTOCK_UPD_TYP.add(((AE0060010Struct) list.get(i)).getsetSTOCK_UPD_TYP());
		}
		return size;
	}
	public int setL2L_setRCV_ISSUE_CMPLT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setRCV_ISSUE_CMPLT_FLG == null) {
			l_setRCV_ISSUE_CMPLT_FLG = new ArrayList();
		} else {
			l_setRCV_ISSUE_CMPLT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setRCV_ISSUE_CMPLT_FLG.add(((AE0060010Struct) list.get(i)).getsetRCV_ISSUE_CMPLT_FLG());
		}
		return size;
	}
	public int setL2L_setOD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setOD_NO == null) {
			l_setOD_NO = new ArrayList();
		} else {
			l_setOD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setOD_NO.add(((AE0060010Struct) list.get(i)).getsetOD_NO());
		}
		return size;
	}
	public int setL2L_setLOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setLOT_NO == null) {
			l_setLOT_NO = new ArrayList();
		} else {
			l_setLOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setLOT_NO.add(((AE0060010Struct) list.get(i)).getsetLOT_NO());
		}
		return size;
	}
	public int setL2L_setVEND_LOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setVEND_LOT_NO == null) {
			l_setVEND_LOT_NO = new ArrayList();
		} else {
			l_setVEND_LOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setVEND_LOT_NO.add(((AE0060010Struct) list.get(i)).getsetVEND_LOT_NO());
		}
		return size;
	}
	public int setL2L_setRCV_ISSUE_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setRCV_ISSUE_COMMENT == null) {
			l_setRCV_ISSUE_COMMENT = new ArrayList();
		} else {
			l_setRCV_ISSUE_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setRCV_ISSUE_COMMENT.add(((AE0060010Struct) list.get(i)).getsetRCV_ISSUE_COMMENT());
		}
		return size;
	}
	public int setL2L_setCONS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setCONS_TYP == null) {
			l_setCONS_TYP = new ArrayList();
		} else {
			l_setCONS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setCONS_TYP.add(((AE0060010Struct) list.get(i)).getsetCONS_TYP());
		}
		return size;
	}
	public int setL2L_setCONS_EXEC_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setCONS_EXEC_DATE == null) {
			l_setCONS_EXEC_DATE = new ArrayList();
		} else {
			l_setCONS_EXEC_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setCONS_EXEC_DATE.add(((AE0060010Struct) list.get(i)).getsetCONS_EXEC_DATE());
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
			l_THIS_MONTH.add(((AE0060010Struct) list.get(i)).getTHIS_MONTH());
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
			l_INSTALL_FLG.add(((AE0060010Struct) list.get(i)).getINSTALL_FLG());
		}
		return size;
	}
	public int setL2L_readSUPPLIED_ISSUE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readSUPPLIED_ISSUE_QTY == null) {
			l_readSUPPLIED_ISSUE_QTY = new ArrayList();
		} else {
			l_readSUPPLIED_ISSUE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readSUPPLIED_ISSUE_QTY.add(((AE0060010Struct) list.get(i)).getreadSUPPLIED_ISSUE_QTY());
		}
		return size;
	}
	public int setL2L_readTOTAL_ISSUE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readTOTAL_ISSUE_QTY == null) {
			l_readTOTAL_ISSUE_QTY = new ArrayList();
		} else {
			l_readTOTAL_ISSUE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readTOTAL_ISSUE_QTY.add(((AE0060010Struct) list.get(i)).getreadTOTAL_ISSUE_QTY());
		}
		return size;
	}
	public int setL2L_readSUPPLIED_UNIT_DENOMINATOR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readSUPPLIED_UNIT_DENOMINATOR == null) {
			l_readSUPPLIED_UNIT_DENOMINATOR = new ArrayList();
		} else {
			l_readSUPPLIED_UNIT_DENOMINATOR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readSUPPLIED_UNIT_DENOMINATOR.add(((AE0060010Struct) list.get(i)).getreadSUPPLIED_UNIT_DENOMINATOR());
		}
		return size;
	}
	public int setL2L_readSUPPLIED_UNIT_NUMERATOR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readSUPPLIED_UNIT_NUMERATOR == null) {
			l_readSUPPLIED_UNIT_NUMERATOR = new ArrayList();
		} else {
			l_readSUPPLIED_UNIT_NUMERATOR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readSUPPLIED_UNIT_NUMERATOR.add(((AE0060010Struct) list.get(i)).getreadSUPPLIED_UNIT_NUMERATOR());
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
			l_PROC_EXEC_DATE.add(((AE0060010Struct) list.get(i)).getPROC_EXEC_DATE());
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
			l_PAST_RESULT_ENTRY_TYP.add(((AE0060010Struct) list.get(i)).getPAST_RESULT_ENTRY_TYP());
		}
		return size;
	}
	public int setL2L_INSPC_WH_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INSPC_WH_NAME == null) {
			l_INSPC_WH_NAME = new ArrayList();
		} else {
			l_INSPC_WH_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INSPC_WH_NAME.add(((AE0060010Struct) list.get(i)).getINSPC_WH_NAME());
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
			l_ISSUE_INST_CD.add(((AE0060010Struct) list.get(i)).getISSUE_INST_CD());
		}
		return size;
	}
	public int setL2L_readLOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readLOT_NO == null) {
			l_readLOT_NO = new ArrayList();
		} else {
			l_readLOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readLOT_NO.add(((AE0060010Struct) list.get(i)).getreadLOT_NO());
		}
		return size;
	}
	public int setL2L_readQTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readQTY == null) {
			l_readQTY = new ArrayList();
		} else {
			l_readQTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readQTY.add(((AE0060010Struct) list.get(i)).getreadQTY());
		}
		return size;
	}
	public int setL2L_BEST_BEFORE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BEST_BEFORE_DATE == null) {
			l_BEST_BEFORE_DATE = new ArrayList();
		} else {
			l_BEST_BEFORE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BEST_BEFORE_DATE.add(((AE0060010Struct) list.get(i)).getBEST_BEFORE_DATE());
		}
		return size;
	}
	public int setL2L_setSEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setSEQ_NO == null) {
			l_setSEQ_NO = new ArrayList();
		} else {
			l_setSEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setSEQ_NO.add(((AE0060010Struct) list.get(i)).getsetSEQ_NO());
		}
		return size;
	}
	public int setL2L_readSUPPLIED_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readSUPPLIED_DATE == null) {
			l_readSUPPLIED_DATE = new ArrayList();
		} else {
			l_readSUPPLIED_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readSUPPLIED_DATE.add(((AE0060010Struct) list.get(i)).getreadSUPPLIED_DATE());
		}
		return size;
	}
	public int setL2L_setSPENT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setSPENT_QTY == null) {
			l_setSPENT_QTY = new ArrayList();
		} else {
			l_setSPENT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setSPENT_QTY.add(((AE0060010Struct) list.get(i)).getsetSPENT_QTY());
		}
		return size;
	}
	public int setL2L_NEXTVAL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NEXTVAL == null) {
			l_NEXTVAL = new ArrayList();
		} else {
			l_NEXTVAL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NEXTVAL.add(((AE0060010Struct) list.get(i)).getNEXTVAL());
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
			l_OD_NO.add(((AE0060010Struct) list.get(i)).getOD_NO());
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
			l_ODR_QTY.add(((AE0060010Struct) list.get(i)).getODR_QTY());
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
			l_PVC2BUSINESSNAME.add(((AE0060010Struct) list.get(i)).getPVC2BUSINESSNAME());
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
			l_PVC2OUTPUTPATH.add(((AE0060010Struct) list.get(i)).getPVC2OUTPUTPATH());
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
			l_PVC2OUTPUTNAME.add(((AE0060010Struct) list.get(i)).getPVC2OUTPUTNAME());
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
			l_PVC2LOGMODE.add(((AE0060010Struct) list.get(i)).getPVC2LOGMODE());
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
			l_PVC2OUTPUTMODE.add(((AE0060010Struct) list.get(i)).getPVC2OUTPUTMODE());
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
			l_PVC2USERID.add(((AE0060010Struct) list.get(i)).getPVC2USERID());
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
			l_PVC2PLANTCD.add(((AE0060010Struct) list.get(i)).getPVC2PLANTCD());
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
			l_PVC2TAXID.add(((AE0060010Struct) list.get(i)).getPVC2TAXID());
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
			l_PNUMTAXOUTAMOUNT.add(((AE0060010Struct) list.get(i)).getPNUMTAXOUTAMOUNT());
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
			l_PNUMTAXAMOUNT.add(((AE0060010Struct) list.get(i)).getPNUMTAXAMOUNT());
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
			l_PNUMEXTERNALTAXSALESAMOUNT.add(((AE0060010Struct) list.get(i)).getPNUMEXTERNALTAXSALESAMOUNT());
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
			l_PNUMINTERNALTAXSALESAMOUNT.add(((AE0060010Struct) list.get(i)).getPNUMINTERNALTAXSALESAMOUNT());
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
			l_PNUMTAXFREESALESAMOUNT.add(((AE0060010Struct) list.get(i)).getPNUMTAXFREESALESAMOUNT());
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
			l_PNUMEXTERNALTAXAMOUNT.add(((AE0060010Struct) list.get(i)).getPNUMEXTERNALTAXAMOUNT());
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
			l_PNUMINTERNALTAXAMOUNT.add(((AE0060010Struct) list.get(i)).getPNUMINTERNALTAXAMOUNT());
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
			l_PVC2ERRCD.add(((AE0060010Struct) list.get(i)).getPVC2ERRCD());
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
			l_PNUMSTATUS.add(((AE0060010Struct) list.get(i)).getPNUMSTATUS());
		}
		return size;
	}
	public int setL2L_FROM_PUCH_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FROM_PUCH_ODR_CD == null) {
			l_FROM_PUCH_ODR_CD = new ArrayList();
		} else {
			l_FROM_PUCH_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FROM_PUCH_ODR_CD.add(((AE0060010Struct) list.get(i)).getFROM_PUCH_ODR_CD());
		}
		return size;
	}
	public int setL2L_TO_PUCH_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TO_PUCH_ODR_CD == null) {
			l_TO_PUCH_ODR_CD = new ArrayList();
		} else {
			l_TO_PUCH_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TO_PUCH_ODR_CD.add(((AE0060010Struct) list.get(i)).getTO_PUCH_ODR_CD());
		}
		return size;
	}
	public int setL2L_FROM_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FROM_ITEM_CD == null) {
			l_FROM_ITEM_CD = new ArrayList();
		} else {
			l_FROM_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FROM_ITEM_CD.add(((AE0060010Struct) list.get(i)).getFROM_ITEM_CD());
		}
		return size;
	}
	public int setL2L_FROM_LOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FROM_LOT_NO == null) {
			l_FROM_LOT_NO = new ArrayList();
		} else {
			l_FROM_LOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FROM_LOT_NO.add(((AE0060010Struct) list.get(i)).getFROM_LOT_NO());
		}
		return size;
	}
	public int setL2L_TO_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TO_ITEM_CD == null) {
			l_TO_ITEM_CD = new ArrayList();
		} else {
			l_TO_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TO_ITEM_CD.add(((AE0060010Struct) list.get(i)).getTO_ITEM_CD());
		}
		return size;
	}
	public int setL2L_TO_LOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TO_LOT_NO == null) {
			l_TO_LOT_NO = new ArrayList();
		} else {
			l_TO_LOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TO_LOT_NO.add(((AE0060010Struct) list.get(i)).getTO_LOT_NO());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_h_PUCH_ODR_CD = null;
		m_c_COMPLETE = null;
		m_UNIT_COST_TYP_name = null;
		m_UNIT_COST_TYP_val = null;
		m_HOME_CUR_UNIT = null;
		m_ACPT_INSPC_TYP_DN = null;
		m_SPL_ITEM_TYP_DN = null;
		m_PRODUCT_TYP_DN = null;
		m_PUCH_ODR_STS_TYP_DN = null;
		m_NON_NO_ITEM_FLG_DN = null;
		m_INSPC_CMPLT_FLG_DN = null;
		m_SelectUnitCostFlag = null;
		m_UNIT_QTY_TYP_DN = null;
		m_c_CANCEL = null;
		m_h_ACPT_QTY = null;
		m_h_ODR_CANCEL_SLIP_ISS_FLG = null;
		m_ITEM_CD_DW = null;
		m_ITEM_NAME_DW = null;
		m_h_LOTCTRL = null;
		m_param1 = null;
		m_param2 = null;
		m_param3 = null;
		m_h_LOT_NO = null;
		m_h_PUCH_ODR_CD_1 = null;
		m_HOME_DECIMAL_FIG = null;
		m_PUCH_ODR_CD = null;
		m_ACPT_NO = null;
		m_ACPT_QTY = null;
		m_STOCK_UNIT = null;
		m_NON_NO_ITEM_NAME = null;
		m_ACPT_DATE = null;
		m_VEND_LOT_NO = null;
		m_WH_CD = null;
		m_WH_NAME = null;
		m_CUR_CD = null;
		m_CUR_NAME = null;
		m_VEND_CUR_UNIT = null;
		m_VEND_DECIMAL_FIG = null;
		m_UNIT_COST_TYP = null;
		m_UNIT_COST = null;
		m_PROCESSING_COST = null;
		m_MATERIAL_COST = null;
		m_OTHER_OVERHEADS = null;
		m_PUCH_ODR_AMOUNT = null;
		m_DISC_AMOUNT = null;
		m_NET_AMOUNT = null;
		m_TAX_AMOUNT_1 = null;
		m_TAX_AMOUNT_2 = null;
		m_TAX_AMOUNT_3 = null;
		m_TAX_RATE_1 = null;
		m_TAX_RATE_2 = null;
		m_TAX_RATE_3 = null;
		m_AMOUNT_INCLUDE_TAX = null;
		m_HOME_CUR_AMOUNT = null;
		m_EXCH_RATE = null;
		m_DLV_CD = null;
		m_ACPT_RSLT_COMMENT = null;
		m_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_JOB_ODR_CD = null;
		m_DRAW_CD = null;
		m_SPEC = null;
		m_UNIT_QTY_TYP = null;
		m_VEND_CD = null;
		m_VEND_NAME = null;
		m_PUCH_ODR_QTY = null;
		m_SUM_ACPT_QTY = null;
		m_ACPT_INSPC_TYP = null;
		m_PUCH_ODR_SLIP_ISS_DATE = null;
		m_PUCH_ODR_DLV_DATE = null;
		m_CONFIRM_DLV_DATE = null;
		m_WORK_IN_PROC_CD = null;
		m_PROC_NAME = null;
		m_PUCH_ODR_PERSON = null;
		m_USER_NAME = null;
		m_PUCH_ODR_STS_TYP = null;
		m_INSPC_CMPLT_FLG = null;
		m_SPL_ITEM_TYP = null;
		m_PRODUCT_TYP = null;
		m_NON_NO_ITEM_FLG = null;
		m_PLANT_CD = null;
		m_COMPANY_CD = null;
		m_TAX_CD = null;
		m_ROUND_TYP = null;
		m_TAX_ROUND_TYP = null;
		m_PUCH_ODR_START_DATE = null;
		m_BUSINESS_OPR_DATE = null;
		m_PUCH_ODR_MODIFY_COUNT = null;
		m_ODR_CANCEL_CAUSE_CD = null;
		m_ODR_CANCEL_SLIP_ISS_FLG = null;
		m_PUCH_ODR_COMMENT = null;
		m_h_LOT_CTRL_FLG = null;
		m_h_LOT_NUMBERING_TYP = null;
		m_h_WORK_ODR_CD = null;
		m_h_FINAL_PROC_CD = null;
		m_h_DATE_FLG = null;
		m_ACPT_STS_TYP = null;
		m_INSPC_WH_CD = null;
		m_LOT_NO = null;
		m_INSPC_CMPLT_DATE = null;
		m_readISSUE_INST_CD = null;
		m_readPLANT_CD = null;
		m_readOD_NO = null;
		m_readITEM_CD = null;
		m_readPUCH_ODR_CD = null;
		m_readCOMPANY_CD = null;
		m_readVEND_CD = null;
		m_readCONS_TYP = null;
		m_readISSUE_INST_UNIT_DENOMINATOR = null;
		m_readISSUE_INST_UNIT_NUMERATOR = null;
		m_readJOB_ODR_CD = null;
		m_readJOB_ODR_DETAIL_NO = null;
		m_readMRP_ODR_TYP = null;
		m_readUNIT_QTY_TYP = null;
		m_readLOT_CONTROL_FLG = null;
		m_setPUCH_ODR_CD = null;
		m_setACPT_NO = null;
		m_setITEM_CD = null;
		m_setACPT_QTY = null;
		m_setCOMPANY_CD = null;
		m_setVEND_CD = null;
		m_setJOB_ODR_CD = null;
		m_setJOB_ODR_DETAIL_NO = null;
		m_setPLANT_CD = null;
		m_setISSUE_INST_CD = null;
		m_setMRP_ODR_TYP = null;
		m_setSUPPLIED_ISSUE_GNR_TYP = null;
		m_setSUPPLIED_ISSUE_QTY = null;
		m_setTOTAL_ISSUE_QTY = null;
		m_setSUPPLIED_UNIT_DENOMINATOR = null;
		m_setSUPPLIED_UNIT_NUMERATOR = null;
		m_setSUPPLIED_DATE = null;
		m_setPART_SUPPLIED_COMMENT = null;
		m_readSTOCK_ON_HAND_QTY = null;
		m_setWH_CD = null;
		m_readWH_CD = null;
		m_setSTOCK_ON_HAND_QTY = null;
		m_setRCV_ISSUE_CTRL_CD = null;
		m_setRCV_ISSUE_TYP = null;
		m_setACPT_RSLT_CRCT_NO = null;
		m_setINSPEC_RSLT_CRCT_NO = null;
		m_setWORK_ODR_CD = null;
		m_setWORK_IN_PROC_CD = null;
		m_setPARTIAL_PRD_NO = null;
		m_setOPR_RSLT_CRCT_NO = null;
		m_setRCV_ISSUE_BEFORE_QTY = null;
		m_setRCV_ISSUE_QTY = null;
		m_setRCV_ISSUE_AFTER_QTY = null;
		m_setRCV_ISSUE_AMOUNT = null;
		m_setRCV_ISSUE_DATE = null;
		m_setRCV_ISSUE_GNR_TYP = null;
		m_setRCV_ISSUE_ODD_QTY = null;
		m_setDEFECT_CAUSE_CD = null;
		m_setSTOCK_UPD_TYP = null;
		m_setRCV_ISSUE_CMPLT_FLG = null;
		m_setOD_NO = null;
		m_setLOT_NO = null;
		m_setVEND_LOT_NO = null;
		m_setRCV_ISSUE_COMMENT = null;
		m_setCONS_TYP = null;
		m_setCONS_EXEC_DATE = null;
		m_THIS_MONTH = null;
		m_INSTALL_FLG = null;
		m_readSUPPLIED_ISSUE_QTY = null;
		m_readTOTAL_ISSUE_QTY = null;
		m_readSUPPLIED_UNIT_DENOMINATOR = null;
		m_readSUPPLIED_UNIT_NUMERATOR = null;
		m_PROC_EXEC_DATE = null;
		m_PAST_RESULT_ENTRY_TYP = null;
		m_INSPC_WH_NAME = null;
		m_ISSUE_INST_CD = null;
		m_readLOT_NO = null;
		m_readQTY = null;
		m_BEST_BEFORE_DATE = null;
		m_setSEQ_NO = null;
		m_readSUPPLIED_DATE = null;
		m_setSPENT_QTY = null;
		m_NEXTVAL = null;
		m_OD_NO = null;
		m_ODR_QTY = null;
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
		m_FROM_PUCH_ODR_CD = null;
		m_TO_PUCH_ODR_CD = null;
		m_FROM_ITEM_CD = null;
		m_FROM_LOT_NO = null;
		m_TO_ITEM_CD = null;
		m_TO_LOT_NO = null;

		l_h_PUCH_ODR_CD = null;
		l_c_COMPLETE = null;
		l_UNIT_COST_TYP_name = null;
		l_UNIT_COST_TYP_val = null;
		l_HOME_CUR_UNIT = null;
		l_ACPT_INSPC_TYP_DN = null;
		l_SPL_ITEM_TYP_DN = null;
		l_PRODUCT_TYP_DN = null;
		l_PUCH_ODR_STS_TYP_DN = null;
		l_NON_NO_ITEM_FLG_DN = null;
		l_INSPC_CMPLT_FLG_DN = null;
		l_SelectUnitCostFlag = null;
		l_UNIT_QTY_TYP_DN = null;
		l_c_CANCEL = null;
		l_h_ACPT_QTY = null;
		l_h_ODR_CANCEL_SLIP_ISS_FLG = null;
		l_ITEM_CD_DW = null;
		l_ITEM_NAME_DW = null;
		l_h_LOTCTRL = null;
		l_param1 = null;
		l_param2 = null;
		l_param3 = null;
		l_h_LOT_NO = null;
		l_h_PUCH_ODR_CD_1 = null;
		l_HOME_DECIMAL_FIG = null;
		l_PUCH_ODR_CD = null;
		l_ACPT_NO = null;
		l_ACPT_QTY = null;
		l_STOCK_UNIT = null;
		l_NON_NO_ITEM_NAME = null;
		l_ACPT_DATE = null;
		l_VEND_LOT_NO = null;
		l_WH_CD = null;
		l_WH_NAME = null;
		l_CUR_CD = null;
		l_CUR_NAME = null;
		l_VEND_CUR_UNIT = null;
		l_VEND_DECIMAL_FIG = null;
		l_UNIT_COST_TYP = null;
		l_UNIT_COST = null;
		l_PROCESSING_COST = null;
		l_MATERIAL_COST = null;
		l_OTHER_OVERHEADS = null;
		l_PUCH_ODR_AMOUNT = null;
		l_DISC_AMOUNT = null;
		l_NET_AMOUNT = null;
		l_TAX_AMOUNT_1 = null;
		l_TAX_AMOUNT_2 = null;
		l_TAX_AMOUNT_3 = null;
		l_TAX_RATE_1 = null;
		l_TAX_RATE_2 = null;
		l_TAX_RATE_3 = null;
		l_AMOUNT_INCLUDE_TAX = null;
		l_HOME_CUR_AMOUNT = null;
		l_EXCH_RATE = null;
		l_DLV_CD = null;
		l_ACPT_RSLT_COMMENT = null;
		l_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_JOB_ODR_CD = null;
		l_DRAW_CD = null;
		l_SPEC = null;
		l_UNIT_QTY_TYP = null;
		l_VEND_CD = null;
		l_VEND_NAME = null;
		l_PUCH_ODR_QTY = null;
		l_SUM_ACPT_QTY = null;
		l_ACPT_INSPC_TYP = null;
		l_PUCH_ODR_SLIP_ISS_DATE = null;
		l_PUCH_ODR_DLV_DATE = null;
		l_CONFIRM_DLV_DATE = null;
		l_WORK_IN_PROC_CD = null;
		l_PROC_NAME = null;
		l_PUCH_ODR_PERSON = null;
		l_USER_NAME = null;
		l_PUCH_ODR_STS_TYP = null;
		l_INSPC_CMPLT_FLG = null;
		l_SPL_ITEM_TYP = null;
		l_PRODUCT_TYP = null;
		l_NON_NO_ITEM_FLG = null;
		l_PLANT_CD = null;
		l_COMPANY_CD = null;
		l_TAX_CD = null;
		l_ROUND_TYP = null;
		l_TAX_ROUND_TYP = null;
		l_PUCH_ODR_START_DATE = null;
		l_BUSINESS_OPR_DATE = null;
		l_PUCH_ODR_MODIFY_COUNT = null;
		l_ODR_CANCEL_CAUSE_CD = null;
		l_ODR_CANCEL_SLIP_ISS_FLG = null;
		l_PUCH_ODR_COMMENT = null;
		l_h_LOT_CTRL_FLG = null;
		l_h_LOT_NUMBERING_TYP = null;
		l_h_WORK_ODR_CD = null;
		l_h_FINAL_PROC_CD = null;
		l_h_DATE_FLG = null;
		l_ACPT_STS_TYP = null;
		l_INSPC_WH_CD = null;
		l_LOT_NO = null;
		l_INSPC_CMPLT_DATE = null;
		l_readISSUE_INST_CD = null;
		l_readPLANT_CD = null;
		l_readOD_NO = null;
		l_readITEM_CD = null;
		l_readPUCH_ODR_CD = null;
		l_readCOMPANY_CD = null;
		l_readVEND_CD = null;
		l_readCONS_TYP = null;
		l_readISSUE_INST_UNIT_DENOMINATOR = null;
		l_readISSUE_INST_UNIT_NUMERATOR = null;
		l_readJOB_ODR_CD = null;
		l_readJOB_ODR_DETAIL_NO = null;
		l_readMRP_ODR_TYP = null;
		l_readUNIT_QTY_TYP = null;
		l_readLOT_CONTROL_FLG = null;
		l_setPUCH_ODR_CD = null;
		l_setACPT_NO = null;
		l_setITEM_CD = null;
		l_setACPT_QTY = null;
		l_setCOMPANY_CD = null;
		l_setVEND_CD = null;
		l_setJOB_ODR_CD = null;
		l_setJOB_ODR_DETAIL_NO = null;
		l_setPLANT_CD = null;
		l_setISSUE_INST_CD = null;
		l_setMRP_ODR_TYP = null;
		l_setSUPPLIED_ISSUE_GNR_TYP = null;
		l_setSUPPLIED_ISSUE_QTY = null;
		l_setTOTAL_ISSUE_QTY = null;
		l_setSUPPLIED_UNIT_DENOMINATOR = null;
		l_setSUPPLIED_UNIT_NUMERATOR = null;
		l_setSUPPLIED_DATE = null;
		l_setPART_SUPPLIED_COMMENT = null;
		l_readSTOCK_ON_HAND_QTY = null;
		l_setWH_CD = null;
		l_readWH_CD = null;
		l_setSTOCK_ON_HAND_QTY = null;
		l_setRCV_ISSUE_CTRL_CD = null;
		l_setRCV_ISSUE_TYP = null;
		l_setACPT_RSLT_CRCT_NO = null;
		l_setINSPEC_RSLT_CRCT_NO = null;
		l_setWORK_ODR_CD = null;
		l_setWORK_IN_PROC_CD = null;
		l_setPARTIAL_PRD_NO = null;
		l_setOPR_RSLT_CRCT_NO = null;
		l_setRCV_ISSUE_BEFORE_QTY = null;
		l_setRCV_ISSUE_QTY = null;
		l_setRCV_ISSUE_AFTER_QTY = null;
		l_setRCV_ISSUE_AMOUNT = null;
		l_setRCV_ISSUE_DATE = null;
		l_setRCV_ISSUE_GNR_TYP = null;
		l_setRCV_ISSUE_ODD_QTY = null;
		l_setDEFECT_CAUSE_CD = null;
		l_setSTOCK_UPD_TYP = null;
		l_setRCV_ISSUE_CMPLT_FLG = null;
		l_setOD_NO = null;
		l_setLOT_NO = null;
		l_setVEND_LOT_NO = null;
		l_setRCV_ISSUE_COMMENT = null;
		l_setCONS_TYP = null;
		l_setCONS_EXEC_DATE = null;
		l_THIS_MONTH = null;
		l_INSTALL_FLG = null;
		l_readSUPPLIED_ISSUE_QTY = null;
		l_readTOTAL_ISSUE_QTY = null;
		l_readSUPPLIED_UNIT_DENOMINATOR = null;
		l_readSUPPLIED_UNIT_NUMERATOR = null;
		l_PROC_EXEC_DATE = null;
		l_PAST_RESULT_ENTRY_TYP = null;
		l_INSPC_WH_NAME = null;
		l_ISSUE_INST_CD = null;
		l_readLOT_NO = null;
		l_readQTY = null;
		l_BEST_BEFORE_DATE = null;
		l_setSEQ_NO = null;
		l_readSUPPLIED_DATE = null;
		l_setSPENT_QTY = null;
		l_NEXTVAL = null;
		l_OD_NO = null;
		l_ODR_QTY = null;
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
		l_FROM_PUCH_ODR_CD = null;
		l_TO_PUCH_ODR_CD = null;
		l_FROM_ITEM_CD = null;
		l_FROM_LOT_NO = null;
		l_TO_ITEM_CD = null;
		l_TO_LOT_NO = null;

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
	 * medAE0060010クラスの標準コンストラクタ
	 */
	public AE0060010Struct()
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
	public void setStruct(AE0060010Struct struct)
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
	public void setStructM(AE0060010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.seth_PUCH_ODR_CD(struct.geth_PUCH_ODR_CD());
			this.setc_COMPLETE(struct.getc_COMPLETE());
			this.setUNIT_COST_TYP_name(struct.getUNIT_COST_TYP_name());
			this.setUNIT_COST_TYP_val(struct.getUNIT_COST_TYP_val());
			this.setHOME_CUR_UNIT(struct.getHOME_CUR_UNIT());
			this.setACPT_INSPC_TYP_DN(struct.getACPT_INSPC_TYP_DN());
			this.setSPL_ITEM_TYP_DN(struct.getSPL_ITEM_TYP_DN());
			this.setPRODUCT_TYP_DN(struct.getPRODUCT_TYP_DN());
			this.setPUCH_ODR_STS_TYP_DN(struct.getPUCH_ODR_STS_TYP_DN());
			this.setNON_NO_ITEM_FLG_DN(struct.getNON_NO_ITEM_FLG_DN());
			this.setINSPC_CMPLT_FLG_DN(struct.getINSPC_CMPLT_FLG_DN());
			this.setSelectUnitCostFlag(struct.getSelectUnitCostFlag());
			this.setUNIT_QTY_TYP_DN(struct.getUNIT_QTY_TYP_DN());
			this.setc_CANCEL(struct.getc_CANCEL());
			this.seth_ACPT_QTY(struct.geth_ACPT_QTY());
			this.seth_ODR_CANCEL_SLIP_ISS_FLG(struct.geth_ODR_CANCEL_SLIP_ISS_FLG());
			this.setITEM_CD_DW(struct.getITEM_CD_DW());
			this.setITEM_NAME_DW(struct.getITEM_NAME_DW());
			this.seth_LOTCTRL(struct.geth_LOTCTRL());
			this.setparam1(struct.getparam1());
			this.setparam2(struct.getparam2());
			this.setparam3(struct.getparam3());
			this.seth_LOT_NO(struct.geth_LOT_NO());
			this.seth_PUCH_ODR_CD_1(struct.geth_PUCH_ODR_CD_1());
			this.setHOME_DECIMAL_FIG(struct.getHOME_DECIMAL_FIG());
			this.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());
			this.setACPT_NO(struct.getACPT_NO());
			this.setACPT_QTY(struct.getACPT_QTY());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setNON_NO_ITEM_NAME(struct.getNON_NO_ITEM_NAME());
			this.setACPT_DATE(struct.getACPT_DATE());
			this.setVEND_LOT_NO(struct.getVEND_LOT_NO());
			this.setWH_CD(struct.getWH_CD());
			this.setWH_NAME(struct.getWH_NAME());
			this.setCUR_CD(struct.getCUR_CD());
			this.setCUR_NAME(struct.getCUR_NAME());
			this.setVEND_CUR_UNIT(struct.getVEND_CUR_UNIT());
			this.setVEND_DECIMAL_FIG(struct.getVEND_DECIMAL_FIG());
			this.setUNIT_COST_TYP(struct.getUNIT_COST_TYP());
			this.setUNIT_COST(struct.getUNIT_COST());
			this.setPROCESSING_COST(struct.getPROCESSING_COST());
			this.setMATERIAL_COST(struct.getMATERIAL_COST());
			this.setOTHER_OVERHEADS(struct.getOTHER_OVERHEADS());
			this.setPUCH_ODR_AMOUNT(struct.getPUCH_ODR_AMOUNT());
			this.setDISC_AMOUNT(struct.getDISC_AMOUNT());
			this.setNET_AMOUNT(struct.getNET_AMOUNT());
			this.setTAX_AMOUNT_1(struct.getTAX_AMOUNT_1());
			this.setTAX_AMOUNT_2(struct.getTAX_AMOUNT_2());
			this.setTAX_AMOUNT_3(struct.getTAX_AMOUNT_3());
			this.setTAX_RATE_1(struct.getTAX_RATE_1());
			this.setTAX_RATE_2(struct.getTAX_RATE_2());
			this.setTAX_RATE_3(struct.getTAX_RATE_3());
			this.setAMOUNT_INCLUDE_TAX(struct.getAMOUNT_INCLUDE_TAX());
			this.setHOME_CUR_AMOUNT(struct.getHOME_CUR_AMOUNT());
			this.setEXCH_RATE(struct.getEXCH_RATE());
			this.setDLV_CD(struct.getDLV_CD());
			this.setACPT_RSLT_COMMENT(struct.getACPT_RSLT_COMMENT());
			this.setITEM_CD(struct.getITEM_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setDRAW_CD(struct.getDRAW_CD());
			this.setSPEC(struct.getSPEC());
			this.setUNIT_QTY_TYP(struct.getUNIT_QTY_TYP());
			this.setVEND_CD(struct.getVEND_CD());
			this.setVEND_NAME(struct.getVEND_NAME());
			this.setPUCH_ODR_QTY(struct.getPUCH_ODR_QTY());
			this.setSUM_ACPT_QTY(struct.getSUM_ACPT_QTY());
			this.setACPT_INSPC_TYP(struct.getACPT_INSPC_TYP());
			this.setPUCH_ODR_SLIP_ISS_DATE(struct.getPUCH_ODR_SLIP_ISS_DATE());
			this.setPUCH_ODR_DLV_DATE(struct.getPUCH_ODR_DLV_DATE());
			this.setCONFIRM_DLV_DATE(struct.getCONFIRM_DLV_DATE());
			this.setWORK_IN_PROC_CD(struct.getWORK_IN_PROC_CD());
			this.setPROC_NAME(struct.getPROC_NAME());
			this.setPUCH_ODR_PERSON(struct.getPUCH_ODR_PERSON());
			this.setUSER_NAME(struct.getUSER_NAME());
			this.setPUCH_ODR_STS_TYP(struct.getPUCH_ODR_STS_TYP());
			this.setINSPC_CMPLT_FLG(struct.getINSPC_CMPLT_FLG());
			this.setSPL_ITEM_TYP(struct.getSPL_ITEM_TYP());
			this.setPRODUCT_TYP(struct.getPRODUCT_TYP());
			this.setNON_NO_ITEM_FLG(struct.getNON_NO_ITEM_FLG());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setTAX_CD(struct.getTAX_CD());
			this.setROUND_TYP(struct.getROUND_TYP());
			this.setTAX_ROUND_TYP(struct.getTAX_ROUND_TYP());
			this.setPUCH_ODR_START_DATE(struct.getPUCH_ODR_START_DATE());
			this.setBUSINESS_OPR_DATE(struct.getBUSINESS_OPR_DATE());
			this.setPUCH_ODR_MODIFY_COUNT(struct.getPUCH_ODR_MODIFY_COUNT());
			this.setODR_CANCEL_CAUSE_CD(struct.getODR_CANCEL_CAUSE_CD());
			this.setODR_CANCEL_SLIP_ISS_FLG(struct.getODR_CANCEL_SLIP_ISS_FLG());
			this.setPUCH_ODR_COMMENT(struct.getPUCH_ODR_COMMENT());
			this.seth_LOT_CTRL_FLG(struct.geth_LOT_CTRL_FLG());
			this.seth_LOT_NUMBERING_TYP(struct.geth_LOT_NUMBERING_TYP());
			this.seth_WORK_ODR_CD(struct.geth_WORK_ODR_CD());
			this.seth_FINAL_PROC_CD(struct.geth_FINAL_PROC_CD());
			this.seth_DATE_FLG(struct.geth_DATE_FLG());
			this.setACPT_STS_TYP(struct.getACPT_STS_TYP());
			this.setINSPC_WH_CD(struct.getINSPC_WH_CD());
			this.setLOT_NO(struct.getLOT_NO());
			this.setINSPC_CMPLT_DATE(struct.getINSPC_CMPLT_DATE());
			this.setreadISSUE_INST_CD(struct.getreadISSUE_INST_CD());
			this.setreadPLANT_CD(struct.getreadPLANT_CD());
			this.setreadOD_NO(struct.getreadOD_NO());
			this.setreadITEM_CD(struct.getreadITEM_CD());
			this.setreadPUCH_ODR_CD(struct.getreadPUCH_ODR_CD());
			this.setreadCOMPANY_CD(struct.getreadCOMPANY_CD());
			this.setreadVEND_CD(struct.getreadVEND_CD());
			this.setreadCONS_TYP(struct.getreadCONS_TYP());
			this.setreadISSUE_INST_UNIT_DENOMINATOR(struct.getreadISSUE_INST_UNIT_DENOMINATOR());
			this.setreadISSUE_INST_UNIT_NUMERATOR(struct.getreadISSUE_INST_UNIT_NUMERATOR());
			this.setreadJOB_ODR_CD(struct.getreadJOB_ODR_CD());
			this.setreadJOB_ODR_DETAIL_NO(struct.getreadJOB_ODR_DETAIL_NO());
			this.setreadMRP_ODR_TYP(struct.getreadMRP_ODR_TYP());
			this.setreadUNIT_QTY_TYP(struct.getreadUNIT_QTY_TYP());
			this.setreadLOT_CONTROL_FLG(struct.getreadLOT_CONTROL_FLG());
			this.setsetPUCH_ODR_CD(struct.getsetPUCH_ODR_CD());
			this.setsetACPT_NO(struct.getsetACPT_NO());
			this.setsetITEM_CD(struct.getsetITEM_CD());
			this.setsetACPT_QTY(struct.getsetACPT_QTY());
			this.setsetCOMPANY_CD(struct.getsetCOMPANY_CD());
			this.setsetVEND_CD(struct.getsetVEND_CD());
			this.setsetJOB_ODR_CD(struct.getsetJOB_ODR_CD());
			this.setsetJOB_ODR_DETAIL_NO(struct.getsetJOB_ODR_DETAIL_NO());
			this.setsetPLANT_CD(struct.getsetPLANT_CD());
			this.setsetISSUE_INST_CD(struct.getsetISSUE_INST_CD());
			this.setsetMRP_ODR_TYP(struct.getsetMRP_ODR_TYP());
			this.setsetSUPPLIED_ISSUE_GNR_TYP(struct.getsetSUPPLIED_ISSUE_GNR_TYP());
			this.setsetSUPPLIED_ISSUE_QTY(struct.getsetSUPPLIED_ISSUE_QTY());
			this.setsetTOTAL_ISSUE_QTY(struct.getsetTOTAL_ISSUE_QTY());
			this.setsetSUPPLIED_UNIT_DENOMINATOR(struct.getsetSUPPLIED_UNIT_DENOMINATOR());
			this.setsetSUPPLIED_UNIT_NUMERATOR(struct.getsetSUPPLIED_UNIT_NUMERATOR());
			this.setsetSUPPLIED_DATE(struct.getsetSUPPLIED_DATE());
			this.setsetPART_SUPPLIED_COMMENT(struct.getsetPART_SUPPLIED_COMMENT());
			this.setreadSTOCK_ON_HAND_QTY(struct.getreadSTOCK_ON_HAND_QTY());
			this.setsetWH_CD(struct.getsetWH_CD());
			this.setreadWH_CD(struct.getreadWH_CD());
			this.setsetSTOCK_ON_HAND_QTY(struct.getsetSTOCK_ON_HAND_QTY());
			this.setsetRCV_ISSUE_CTRL_CD(struct.getsetRCV_ISSUE_CTRL_CD());
			this.setsetRCV_ISSUE_TYP(struct.getsetRCV_ISSUE_TYP());
			this.setsetACPT_RSLT_CRCT_NO(struct.getsetACPT_RSLT_CRCT_NO());
			this.setsetINSPEC_RSLT_CRCT_NO(struct.getsetINSPEC_RSLT_CRCT_NO());
			this.setsetWORK_ODR_CD(struct.getsetWORK_ODR_CD());
			this.setsetWORK_IN_PROC_CD(struct.getsetWORK_IN_PROC_CD());
			this.setsetPARTIAL_PRD_NO(struct.getsetPARTIAL_PRD_NO());
			this.setsetOPR_RSLT_CRCT_NO(struct.getsetOPR_RSLT_CRCT_NO());
			this.setsetRCV_ISSUE_BEFORE_QTY(struct.getsetRCV_ISSUE_BEFORE_QTY());
			this.setsetRCV_ISSUE_QTY(struct.getsetRCV_ISSUE_QTY());
			this.setsetRCV_ISSUE_AFTER_QTY(struct.getsetRCV_ISSUE_AFTER_QTY());
			this.setsetRCV_ISSUE_AMOUNT(struct.getsetRCV_ISSUE_AMOUNT());
			this.setsetRCV_ISSUE_DATE(struct.getsetRCV_ISSUE_DATE());
			this.setsetRCV_ISSUE_GNR_TYP(struct.getsetRCV_ISSUE_GNR_TYP());
			this.setsetRCV_ISSUE_ODD_QTY(struct.getsetRCV_ISSUE_ODD_QTY());
			this.setsetDEFECT_CAUSE_CD(struct.getsetDEFECT_CAUSE_CD());
			this.setsetSTOCK_UPD_TYP(struct.getsetSTOCK_UPD_TYP());
			this.setsetRCV_ISSUE_CMPLT_FLG(struct.getsetRCV_ISSUE_CMPLT_FLG());
			this.setsetOD_NO(struct.getsetOD_NO());
			this.setsetLOT_NO(struct.getsetLOT_NO());
			this.setsetVEND_LOT_NO(struct.getsetVEND_LOT_NO());
			this.setsetRCV_ISSUE_COMMENT(struct.getsetRCV_ISSUE_COMMENT());
			this.setsetCONS_TYP(struct.getsetCONS_TYP());
			this.setsetCONS_EXEC_DATE(struct.getsetCONS_EXEC_DATE());
			this.setTHIS_MONTH(struct.getTHIS_MONTH());
			this.setINSTALL_FLG(struct.getINSTALL_FLG());
			this.setreadSUPPLIED_ISSUE_QTY(struct.getreadSUPPLIED_ISSUE_QTY());
			this.setreadTOTAL_ISSUE_QTY(struct.getreadTOTAL_ISSUE_QTY());
			this.setreadSUPPLIED_UNIT_DENOMINATOR(struct.getreadSUPPLIED_UNIT_DENOMINATOR());
			this.setreadSUPPLIED_UNIT_NUMERATOR(struct.getreadSUPPLIED_UNIT_NUMERATOR());
			this.setPROC_EXEC_DATE(struct.getPROC_EXEC_DATE());
			this.setPAST_RESULT_ENTRY_TYP(struct.getPAST_RESULT_ENTRY_TYP());
			this.setINSPC_WH_NAME(struct.getINSPC_WH_NAME());
			this.setISSUE_INST_CD(struct.getISSUE_INST_CD());
			this.setreadLOT_NO(struct.getreadLOT_NO());
			this.setreadQTY(struct.getreadQTY());
			this.setBEST_BEFORE_DATE(struct.getBEST_BEFORE_DATE());
			this.setsetSEQ_NO(struct.getsetSEQ_NO());
			this.setreadSUPPLIED_DATE(struct.getreadSUPPLIED_DATE());
			this.setsetSPENT_QTY(struct.getsetSPENT_QTY());
			this.setNEXTVAL(struct.getNEXTVAL());
			this.setOD_NO(struct.getOD_NO());
			this.setODR_QTY(struct.getODR_QTY());
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
			this.setFROM_PUCH_ODR_CD(struct.getFROM_PUCH_ODR_CD());
			this.setTO_PUCH_ODR_CD(struct.getTO_PUCH_ODR_CD());
			this.setFROM_ITEM_CD(struct.getFROM_ITEM_CD());
			this.setFROM_LOT_NO(struct.getFROM_LOT_NO());
			this.setTO_ITEM_CD(struct.getTO_ITEM_CD());
			this.setTO_LOT_NO(struct.getTO_LOT_NO());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AE0060010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_h_PUCH_ODR_CD(struct.getList_h_PUCH_ODR_CD());
			this.setList_c_COMPLETE(struct.getList_c_COMPLETE());
			this.setList_UNIT_COST_TYP_name(struct.getList_UNIT_COST_TYP_name());
			this.setList_UNIT_COST_TYP_val(struct.getList_UNIT_COST_TYP_val());
			this.setList_HOME_CUR_UNIT(struct.getList_HOME_CUR_UNIT());
			this.setList_ACPT_INSPC_TYP_DN(struct.getList_ACPT_INSPC_TYP_DN());
			this.setList_SPL_ITEM_TYP_DN(struct.getList_SPL_ITEM_TYP_DN());
			this.setList_PRODUCT_TYP_DN(struct.getList_PRODUCT_TYP_DN());
			this.setList_PUCH_ODR_STS_TYP_DN(struct.getList_PUCH_ODR_STS_TYP_DN());
			this.setList_NON_NO_ITEM_FLG_DN(struct.getList_NON_NO_ITEM_FLG_DN());
			this.setList_INSPC_CMPLT_FLG_DN(struct.getList_INSPC_CMPLT_FLG_DN());
			this.setList_SelectUnitCostFlag(struct.getList_SelectUnitCostFlag());
			this.setList_UNIT_QTY_TYP_DN(struct.getList_UNIT_QTY_TYP_DN());
			this.setList_c_CANCEL(struct.getList_c_CANCEL());
			this.setList_h_ACPT_QTY(struct.getList_h_ACPT_QTY());
			this.setList_h_ODR_CANCEL_SLIP_ISS_FLG(struct.getList_h_ODR_CANCEL_SLIP_ISS_FLG());
			this.setList_ITEM_CD_DW(struct.getList_ITEM_CD_DW());
			this.setList_ITEM_NAME_DW(struct.getList_ITEM_NAME_DW());
			this.setList_h_LOTCTRL(struct.getList_h_LOTCTRL());
			this.setList_param1(struct.getList_param1());
			this.setList_param2(struct.getList_param2());
			this.setList_param3(struct.getList_param3());
			this.setList_h_LOT_NO(struct.getList_h_LOT_NO());
			this.setList_h_PUCH_ODR_CD_1(struct.getList_h_PUCH_ODR_CD_1());
			this.setList_HOME_DECIMAL_FIG(struct.getList_HOME_DECIMAL_FIG());
			this.setList_PUCH_ODR_CD(struct.getList_PUCH_ODR_CD());
			this.setList_ACPT_NO(struct.getList_ACPT_NO());
			this.setList_ACPT_QTY(struct.getList_ACPT_QTY());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_NON_NO_ITEM_NAME(struct.getList_NON_NO_ITEM_NAME());
			this.setList_ACPT_DATE(struct.getList_ACPT_DATE());
			this.setList_VEND_LOT_NO(struct.getList_VEND_LOT_NO());
			this.setList_WH_CD(struct.getList_WH_CD());
			this.setList_WH_NAME(struct.getList_WH_NAME());
			this.setList_CUR_CD(struct.getList_CUR_CD());
			this.setList_CUR_NAME(struct.getList_CUR_NAME());
			this.setList_VEND_CUR_UNIT(struct.getList_VEND_CUR_UNIT());
			this.setList_VEND_DECIMAL_FIG(struct.getList_VEND_DECIMAL_FIG());
			this.setList_UNIT_COST_TYP(struct.getList_UNIT_COST_TYP());
			this.setList_UNIT_COST(struct.getList_UNIT_COST());
			this.setList_PROCESSING_COST(struct.getList_PROCESSING_COST());
			this.setList_MATERIAL_COST(struct.getList_MATERIAL_COST());
			this.setList_OTHER_OVERHEADS(struct.getList_OTHER_OVERHEADS());
			this.setList_PUCH_ODR_AMOUNT(struct.getList_PUCH_ODR_AMOUNT());
			this.setList_DISC_AMOUNT(struct.getList_DISC_AMOUNT());
			this.setList_NET_AMOUNT(struct.getList_NET_AMOUNT());
			this.setList_TAX_AMOUNT_1(struct.getList_TAX_AMOUNT_1());
			this.setList_TAX_AMOUNT_2(struct.getList_TAX_AMOUNT_2());
			this.setList_TAX_AMOUNT_3(struct.getList_TAX_AMOUNT_3());
			this.setList_TAX_RATE_1(struct.getList_TAX_RATE_1());
			this.setList_TAX_RATE_2(struct.getList_TAX_RATE_2());
			this.setList_TAX_RATE_3(struct.getList_TAX_RATE_3());
			this.setList_AMOUNT_INCLUDE_TAX(struct.getList_AMOUNT_INCLUDE_TAX());
			this.setList_HOME_CUR_AMOUNT(struct.getList_HOME_CUR_AMOUNT());
			this.setList_EXCH_RATE(struct.getList_EXCH_RATE());
			this.setList_DLV_CD(struct.getList_DLV_CD());
			this.setList_ACPT_RSLT_COMMENT(struct.getList_ACPT_RSLT_COMMENT());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_DRAW_CD(struct.getList_DRAW_CD());
			this.setList_SPEC(struct.getList_SPEC());
			this.setList_UNIT_QTY_TYP(struct.getList_UNIT_QTY_TYP());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_VEND_NAME(struct.getList_VEND_NAME());
			this.setList_PUCH_ODR_QTY(struct.getList_PUCH_ODR_QTY());
			this.setList_SUM_ACPT_QTY(struct.getList_SUM_ACPT_QTY());
			this.setList_ACPT_INSPC_TYP(struct.getList_ACPT_INSPC_TYP());
			this.setList_PUCH_ODR_SLIP_ISS_DATE(struct.getList_PUCH_ODR_SLIP_ISS_DATE());
			this.setList_PUCH_ODR_DLV_DATE(struct.getList_PUCH_ODR_DLV_DATE());
			this.setList_CONFIRM_DLV_DATE(struct.getList_CONFIRM_DLV_DATE());
			this.setList_WORK_IN_PROC_CD(struct.getList_WORK_IN_PROC_CD());
			this.setList_PROC_NAME(struct.getList_PROC_NAME());
			this.setList_PUCH_ODR_PERSON(struct.getList_PUCH_ODR_PERSON());
			this.setList_USER_NAME(struct.getList_USER_NAME());
			this.setList_PUCH_ODR_STS_TYP(struct.getList_PUCH_ODR_STS_TYP());
			this.setList_INSPC_CMPLT_FLG(struct.getList_INSPC_CMPLT_FLG());
			this.setList_SPL_ITEM_TYP(struct.getList_SPL_ITEM_TYP());
			this.setList_PRODUCT_TYP(struct.getList_PRODUCT_TYP());
			this.setList_NON_NO_ITEM_FLG(struct.getList_NON_NO_ITEM_FLG());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_TAX_CD(struct.getList_TAX_CD());
			this.setList_ROUND_TYP(struct.getList_ROUND_TYP());
			this.setList_TAX_ROUND_TYP(struct.getList_TAX_ROUND_TYP());
			this.setList_PUCH_ODR_START_DATE(struct.getList_PUCH_ODR_START_DATE());
			this.setList_BUSINESS_OPR_DATE(struct.getList_BUSINESS_OPR_DATE());
			this.setList_PUCH_ODR_MODIFY_COUNT(struct.getList_PUCH_ODR_MODIFY_COUNT());
			this.setList_ODR_CANCEL_CAUSE_CD(struct.getList_ODR_CANCEL_CAUSE_CD());
			this.setList_ODR_CANCEL_SLIP_ISS_FLG(struct.getList_ODR_CANCEL_SLIP_ISS_FLG());
			this.setList_PUCH_ODR_COMMENT(struct.getList_PUCH_ODR_COMMENT());
			this.setList_h_LOT_CTRL_FLG(struct.getList_h_LOT_CTRL_FLG());
			this.setList_h_LOT_NUMBERING_TYP(struct.getList_h_LOT_NUMBERING_TYP());
			this.setList_h_WORK_ODR_CD(struct.getList_h_WORK_ODR_CD());
			this.setList_h_FINAL_PROC_CD(struct.getList_h_FINAL_PROC_CD());
			this.setList_h_DATE_FLG(struct.getList_h_DATE_FLG());
			this.setList_ACPT_STS_TYP(struct.getList_ACPT_STS_TYP());
			this.setList_INSPC_WH_CD(struct.getList_INSPC_WH_CD());
			this.setList_LOT_NO(struct.getList_LOT_NO());
			this.setList_INSPC_CMPLT_DATE(struct.getList_INSPC_CMPLT_DATE());
			this.setList_readISSUE_INST_CD(struct.getList_readISSUE_INST_CD());
			this.setList_readPLANT_CD(struct.getList_readPLANT_CD());
			this.setList_readOD_NO(struct.getList_readOD_NO());
			this.setList_readITEM_CD(struct.getList_readITEM_CD());
			this.setList_readPUCH_ODR_CD(struct.getList_readPUCH_ODR_CD());
			this.setList_readCOMPANY_CD(struct.getList_readCOMPANY_CD());
			this.setList_readVEND_CD(struct.getList_readVEND_CD());
			this.setList_readCONS_TYP(struct.getList_readCONS_TYP());
			this.setList_readISSUE_INST_UNIT_DENOMINATOR(struct.getList_readISSUE_INST_UNIT_DENOMINATOR());
			this.setList_readISSUE_INST_UNIT_NUMERATOR(struct.getList_readISSUE_INST_UNIT_NUMERATOR());
			this.setList_readJOB_ODR_CD(struct.getList_readJOB_ODR_CD());
			this.setList_readJOB_ODR_DETAIL_NO(struct.getList_readJOB_ODR_DETAIL_NO());
			this.setList_readMRP_ODR_TYP(struct.getList_readMRP_ODR_TYP());
			this.setList_readUNIT_QTY_TYP(struct.getList_readUNIT_QTY_TYP());
			this.setList_readLOT_CONTROL_FLG(struct.getList_readLOT_CONTROL_FLG());
			this.setList_setPUCH_ODR_CD(struct.getList_setPUCH_ODR_CD());
			this.setList_setACPT_NO(struct.getList_setACPT_NO());
			this.setList_setITEM_CD(struct.getList_setITEM_CD());
			this.setList_setACPT_QTY(struct.getList_setACPT_QTY());
			this.setList_setCOMPANY_CD(struct.getList_setCOMPANY_CD());
			this.setList_setVEND_CD(struct.getList_setVEND_CD());
			this.setList_setJOB_ODR_CD(struct.getList_setJOB_ODR_CD());
			this.setList_setJOB_ODR_DETAIL_NO(struct.getList_setJOB_ODR_DETAIL_NO());
			this.setList_setPLANT_CD(struct.getList_setPLANT_CD());
			this.setList_setISSUE_INST_CD(struct.getList_setISSUE_INST_CD());
			this.setList_setMRP_ODR_TYP(struct.getList_setMRP_ODR_TYP());
			this.setList_setSUPPLIED_ISSUE_GNR_TYP(struct.getList_setSUPPLIED_ISSUE_GNR_TYP());
			this.setList_setSUPPLIED_ISSUE_QTY(struct.getList_setSUPPLIED_ISSUE_QTY());
			this.setList_setTOTAL_ISSUE_QTY(struct.getList_setTOTAL_ISSUE_QTY());
			this.setList_setSUPPLIED_UNIT_DENOMINATOR(struct.getList_setSUPPLIED_UNIT_DENOMINATOR());
			this.setList_setSUPPLIED_UNIT_NUMERATOR(struct.getList_setSUPPLIED_UNIT_NUMERATOR());
			this.setList_setSUPPLIED_DATE(struct.getList_setSUPPLIED_DATE());
			this.setList_setPART_SUPPLIED_COMMENT(struct.getList_setPART_SUPPLIED_COMMENT());
			this.setList_readSTOCK_ON_HAND_QTY(struct.getList_readSTOCK_ON_HAND_QTY());
			this.setList_setWH_CD(struct.getList_setWH_CD());
			this.setList_readWH_CD(struct.getList_readWH_CD());
			this.setList_setSTOCK_ON_HAND_QTY(struct.getList_setSTOCK_ON_HAND_QTY());
			this.setList_setRCV_ISSUE_CTRL_CD(struct.getList_setRCV_ISSUE_CTRL_CD());
			this.setList_setRCV_ISSUE_TYP(struct.getList_setRCV_ISSUE_TYP());
			this.setList_setACPT_RSLT_CRCT_NO(struct.getList_setACPT_RSLT_CRCT_NO());
			this.setList_setINSPEC_RSLT_CRCT_NO(struct.getList_setINSPEC_RSLT_CRCT_NO());
			this.setList_setWORK_ODR_CD(struct.getList_setWORK_ODR_CD());
			this.setList_setWORK_IN_PROC_CD(struct.getList_setWORK_IN_PROC_CD());
			this.setList_setPARTIAL_PRD_NO(struct.getList_setPARTIAL_PRD_NO());
			this.setList_setOPR_RSLT_CRCT_NO(struct.getList_setOPR_RSLT_CRCT_NO());
			this.setList_setRCV_ISSUE_BEFORE_QTY(struct.getList_setRCV_ISSUE_BEFORE_QTY());
			this.setList_setRCV_ISSUE_QTY(struct.getList_setRCV_ISSUE_QTY());
			this.setList_setRCV_ISSUE_AFTER_QTY(struct.getList_setRCV_ISSUE_AFTER_QTY());
			this.setList_setRCV_ISSUE_AMOUNT(struct.getList_setRCV_ISSUE_AMOUNT());
			this.setList_setRCV_ISSUE_DATE(struct.getList_setRCV_ISSUE_DATE());
			this.setList_setRCV_ISSUE_GNR_TYP(struct.getList_setRCV_ISSUE_GNR_TYP());
			this.setList_setRCV_ISSUE_ODD_QTY(struct.getList_setRCV_ISSUE_ODD_QTY());
			this.setList_setDEFECT_CAUSE_CD(struct.getList_setDEFECT_CAUSE_CD());
			this.setList_setSTOCK_UPD_TYP(struct.getList_setSTOCK_UPD_TYP());
			this.setList_setRCV_ISSUE_CMPLT_FLG(struct.getList_setRCV_ISSUE_CMPLT_FLG());
			this.setList_setOD_NO(struct.getList_setOD_NO());
			this.setList_setLOT_NO(struct.getList_setLOT_NO());
			this.setList_setVEND_LOT_NO(struct.getList_setVEND_LOT_NO());
			this.setList_setRCV_ISSUE_COMMENT(struct.getList_setRCV_ISSUE_COMMENT());
			this.setList_setCONS_TYP(struct.getList_setCONS_TYP());
			this.setList_setCONS_EXEC_DATE(struct.getList_setCONS_EXEC_DATE());
			this.setList_THIS_MONTH(struct.getList_THIS_MONTH());
			this.setList_INSTALL_FLG(struct.getList_INSTALL_FLG());
			this.setList_readSUPPLIED_ISSUE_QTY(struct.getList_readSUPPLIED_ISSUE_QTY());
			this.setList_readTOTAL_ISSUE_QTY(struct.getList_readTOTAL_ISSUE_QTY());
			this.setList_readSUPPLIED_UNIT_DENOMINATOR(struct.getList_readSUPPLIED_UNIT_DENOMINATOR());
			this.setList_readSUPPLIED_UNIT_NUMERATOR(struct.getList_readSUPPLIED_UNIT_NUMERATOR());
			this.setList_PROC_EXEC_DATE(struct.getList_PROC_EXEC_DATE());
			this.setList_PAST_RESULT_ENTRY_TYP(struct.getList_PAST_RESULT_ENTRY_TYP());
			this.setList_INSPC_WH_NAME(struct.getList_INSPC_WH_NAME());
			this.setList_ISSUE_INST_CD(struct.getList_ISSUE_INST_CD());
			this.setList_readLOT_NO(struct.getList_readLOT_NO());
			this.setList_readQTY(struct.getList_readQTY());
			this.setList_BEST_BEFORE_DATE(struct.getList_BEST_BEFORE_DATE());
			this.setList_setSEQ_NO(struct.getList_setSEQ_NO());
			this.setList_readSUPPLIED_DATE(struct.getList_readSUPPLIED_DATE());
			this.setList_setSPENT_QTY(struct.getList_setSPENT_QTY());
			this.setList_NEXTVAL(struct.getList_NEXTVAL());
			this.setList_OD_NO(struct.getList_OD_NO());
			this.setList_ODR_QTY(struct.getList_ODR_QTY());
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
			this.setList_FROM_PUCH_ODR_CD(struct.getList_FROM_PUCH_ODR_CD());
			this.setList_TO_PUCH_ODR_CD(struct.getList_TO_PUCH_ODR_CD());
			this.setList_FROM_ITEM_CD(struct.getList_FROM_ITEM_CD());
			this.setList_FROM_LOT_NO(struct.getList_FROM_LOT_NO());
			this.setList_TO_ITEM_CD(struct.getList_TO_ITEM_CD());
			this.setList_TO_LOT_NO(struct.getList_TO_LOT_NO());
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

	// 第 2 変数初期値： i_c_COMPLETE


	final static String i_c_COMPLETE = null;

	// 第 3 変数初期値： i_UNIT_COST_TYP_name


	final static String i_UNIT_COST_TYP_name = null;

	// 第 4 変数初期値： i_UNIT_COST_TYP_val


	final static String i_UNIT_COST_TYP_val = null;

	// 第 5 変数初期値： i_HOME_CUR_UNIT


	final static String i_HOME_CUR_UNIT = null;

	// 第 6 変数初期値： i_ACPT_INSPC_TYP_DN


	final static String i_ACPT_INSPC_TYP_DN = null;

	// 第 7 変数初期値： i_SPL_ITEM_TYP_DN


	final static String i_SPL_ITEM_TYP_DN = null;

	// 第 8 変数初期値： i_PRODUCT_TYP_DN


	final static String i_PRODUCT_TYP_DN = null;

	// 第 9 変数初期値： i_PUCH_ODR_STS_TYP_DN


	final static String i_PUCH_ODR_STS_TYP_DN = null;

	// 第 10 変数初期値： i_NON_NO_ITEM_FLG_DN


	final static String i_NON_NO_ITEM_FLG_DN = null;

	// 第 11 変数初期値： i_INSPC_CMPLT_FLG_DN


	final static String i_INSPC_CMPLT_FLG_DN = null;

	// 第 12 変数初期値： i_SelectUnitCostFlag


	final static String i_SelectUnitCostFlag = null;

	// 第 13 変数初期値： i_UNIT_QTY_TYP_DN


	final static String i_UNIT_QTY_TYP_DN = null;

	// 第 14 変数初期値： i_c_CANCEL


	final static String i_c_CANCEL = null;

	// 第 15 変数初期値： i_h_ACPT_QTY


	final static String i_h_ACPT_QTY = null;

	// 第 16 変数初期値： i_h_ODR_CANCEL_SLIP_ISS_FLG


	final static String i_h_ODR_CANCEL_SLIP_ISS_FLG = null;

	// 第 17 変数初期値： i_ITEM_CD_DW


	final static String i_ITEM_CD_DW = null;

	// 第 18 変数初期値： i_ITEM_NAME_DW


	final static String i_ITEM_NAME_DW = null;

	// 第 19 変数初期値： i_h_LOTCTRL


	final static String i_h_LOTCTRL = null;

	// 第 20 変数初期値： i_param1


	final static String i_param1 = null;

	// 第 21 変数初期値： i_param2


	final static String i_param2 = null;

	// 第 22 変数初期値： i_param3


	final static String i_param3 = null;

	// 第 23 変数初期値： i_h_LOT_NO


	final static String i_h_LOT_NO = null;

	// 第 24 変数初期値： i_h_PUCH_ODR_CD_1


	final static String i_h_PUCH_ODR_CD_1 = null;

	// 第 25 変数初期値： i_HOME_DECIMAL_FIG


	final static String i_HOME_DECIMAL_FIG = null;

	// 第 26 変数初期値： i_PUCH_ODR_CD


	final static String i_PUCH_ODR_CD = null;

	// 第 27 変数初期値： i_ACPT_NO


	final static String i_ACPT_NO = null;

	// 第 28 変数初期値： i_ACPT_QTY


	final static String i_ACPT_QTY = null;

	// 第 29 変数初期値： i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// 第 30 変数初期値： i_NON_NO_ITEM_NAME


	final static String i_NON_NO_ITEM_NAME = null;

	// 第 31 変数初期値： i_ACPT_DATE


	final static String i_ACPT_DATE = null;

	// 第 32 変数初期値： i_VEND_LOT_NO


	final static String i_VEND_LOT_NO = null;

	// 第 33 変数初期値： i_WH_CD


	final static String i_WH_CD = null;

	// 第 34 変数初期値： i_WH_NAME


	final static String i_WH_NAME = null;

	// 第 35 変数初期値： i_CUR_CD


	final static String i_CUR_CD = null;

	// 第 36 変数初期値： i_CUR_NAME


	final static String i_CUR_NAME = null;

	// 第 37 変数初期値： i_VEND_CUR_UNIT


	final static String i_VEND_CUR_UNIT = null;

	// 第 38 変数初期値： i_VEND_DECIMAL_FIG


	final static String i_VEND_DECIMAL_FIG = null;

	// 第 39 変数初期値： i_UNIT_COST_TYP


	final static String i_UNIT_COST_TYP = null;

	// 第 40 変数初期値： i_UNIT_COST


	final static String i_UNIT_COST = null;

	// 第 41 変数初期値： i_PROCESSING_COST


	final static String i_PROCESSING_COST = null;

	// 第 42 変数初期値： i_MATERIAL_COST


	final static String i_MATERIAL_COST = null;

	// 第 43 変数初期値： i_OTHER_OVERHEADS


	final static String i_OTHER_OVERHEADS = null;

	// 第 44 変数初期値： i_PUCH_ODR_AMOUNT


	final static String i_PUCH_ODR_AMOUNT = null;

	// 第 45 変数初期値： i_DISC_AMOUNT


	final static String i_DISC_AMOUNT = null;

	// 第 46 変数初期値： i_NET_AMOUNT


	final static String i_NET_AMOUNT = null;

	// 第 47 変数初期値： i_TAX_AMOUNT_1


	final static String i_TAX_AMOUNT_1 = null;

	// 第 48 変数初期値： i_TAX_AMOUNT_2


	final static String i_TAX_AMOUNT_2 = null;

	// 第 49 変数初期値： i_TAX_AMOUNT_3


	final static String i_TAX_AMOUNT_3 = null;

	// 第 50 変数初期値： i_TAX_RATE_1


	final static String i_TAX_RATE_1 = null;

	// 第 51 変数初期値： i_TAX_RATE_2


	final static String i_TAX_RATE_2 = null;

	// 第 52 変数初期値： i_TAX_RATE_3


	final static String i_TAX_RATE_3 = null;

	// 第 53 変数初期値： i_AMOUNT_INCLUDE_TAX


	final static String i_AMOUNT_INCLUDE_TAX = null;

	// 第 54 変数初期値： i_HOME_CUR_AMOUNT


	final static String i_HOME_CUR_AMOUNT = null;

	// 第 55 変数初期値： i_EXCH_RATE


	final static String i_EXCH_RATE = null;

	// 第 56 変数初期値： i_DLV_CD


	final static String i_DLV_CD = null;

	// 第 57 変数初期値： i_ACPT_RSLT_COMMENT


	final static String i_ACPT_RSLT_COMMENT = null;

	// 第 58 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 59 変数初期値： i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// 第 60 変数初期値： i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// 第 61 変数初期値： i_DRAW_CD


	final static String i_DRAW_CD = null;

	// 第 62 変数初期値： i_SPEC


	final static String i_SPEC = null;

	// 第 63 変数初期値： i_UNIT_QTY_TYP


	final static String i_UNIT_QTY_TYP = null;

	// 第 64 変数初期値： i_VEND_CD


	final static String i_VEND_CD = null;

	// 第 65 変数初期値： i_VEND_NAME


	final static String i_VEND_NAME = null;

	// 第 66 変数初期値： i_PUCH_ODR_QTY


	final static String i_PUCH_ODR_QTY = null;

	// 第 67 変数初期値： i_SUM_ACPT_QTY


	final static String i_SUM_ACPT_QTY = null;

	// 第 68 変数初期値： i_ACPT_INSPC_TYP


	final static String i_ACPT_INSPC_TYP = null;

	// 第 69 変数初期値： i_PUCH_ODR_SLIP_ISS_DATE


	final static String i_PUCH_ODR_SLIP_ISS_DATE = null;

	// 第 70 変数初期値： i_PUCH_ODR_DLV_DATE


	final static String i_PUCH_ODR_DLV_DATE = null;

	// 第 71 変数初期値： i_CONFIRM_DLV_DATE


	final static String i_CONFIRM_DLV_DATE = null;

	// 第 72 変数初期値： i_WORK_IN_PROC_CD


	final static String i_WORK_IN_PROC_CD = null;

	// 第 73 変数初期値： i_PROC_NAME


	final static String i_PROC_NAME = null;

	// 第 74 変数初期値： i_PUCH_ODR_PERSON


	final static String i_PUCH_ODR_PERSON = null;

	// 第 75 変数初期値： i_USER_NAME


	final static String i_USER_NAME = null;

	// 第 76 変数初期値： i_PUCH_ODR_STS_TYP


	final static String i_PUCH_ODR_STS_TYP = null;

	// 第 77 変数初期値： i_INSPC_CMPLT_FLG


	final static String i_INSPC_CMPLT_FLG = null;

	// 第 78 変数初期値： i_SPL_ITEM_TYP


	final static String i_SPL_ITEM_TYP = null;

	// 第 79 変数初期値： i_PRODUCT_TYP


	final static String i_PRODUCT_TYP = null;

	// 第 80 変数初期値： i_NON_NO_ITEM_FLG


	final static String i_NON_NO_ITEM_FLG = null;

	// 第 81 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

	// 第 82 変数初期値： i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// 第 83 変数初期値： i_TAX_CD


	final static String i_TAX_CD = null;

	// 第 84 変数初期値： i_ROUND_TYP


	final static String i_ROUND_TYP = null;

	// 第 85 変数初期値： i_TAX_ROUND_TYP


	final static String i_TAX_ROUND_TYP = null;

	// 第 86 変数初期値： i_PUCH_ODR_START_DATE


	final static String i_PUCH_ODR_START_DATE = null;

	// 第 87 変数初期値： i_BUSINESS_OPR_DATE


	final static String i_BUSINESS_OPR_DATE = null;

	// 第 88 変数初期値： i_PUCH_ODR_MODIFY_COUNT


	final static String i_PUCH_ODR_MODIFY_COUNT = null;

	// 第 89 変数初期値： i_ODR_CANCEL_CAUSE_CD


	final static String i_ODR_CANCEL_CAUSE_CD = null;

	// 第 90 変数初期値： i_ODR_CANCEL_SLIP_ISS_FLG


	final static String i_ODR_CANCEL_SLIP_ISS_FLG = null;

	// 第 91 変数初期値： i_PUCH_ODR_COMMENT


	final static String i_PUCH_ODR_COMMENT = null;

	// 第 92 変数初期値： i_h_LOT_CTRL_FLG


	final static String i_h_LOT_CTRL_FLG = null;

	// 第 93 変数初期値： i_h_LOT_NUMBERING_TYP


	final static String i_h_LOT_NUMBERING_TYP = null;

	// 第 94 変数初期値： i_h_WORK_ODR_CD


	final static String i_h_WORK_ODR_CD = null;

	// 第 95 変数初期値： i_h_FINAL_PROC_CD


	final static String i_h_FINAL_PROC_CD = null;

	// 第 96 変数初期値： i_h_DATE_FLG


	final static String i_h_DATE_FLG = null;

	// 第 97 変数初期値： i_ACPT_STS_TYP


	final static String i_ACPT_STS_TYP = null;

	// 第 98 変数初期値： i_INSPC_WH_CD


	final static String i_INSPC_WH_CD = null;

	// 第 99 変数初期値： i_LOT_NO


	final static String i_LOT_NO = null;

	// 第 100 変数初期値： i_INSPC_CMPLT_DATE


	final static String i_INSPC_CMPLT_DATE = null;

	// 第 101 変数初期値： i_readISSUE_INST_CD


	final static String i_readISSUE_INST_CD = null;

	// 第 102 変数初期値： i_readPLANT_CD


	final static String i_readPLANT_CD = null;

	// 第 103 変数初期値： i_readOD_NO


	final static String i_readOD_NO = null;

	// 第 104 変数初期値： i_readITEM_CD


	final static String i_readITEM_CD = null;

	// 第 105 変数初期値： i_readPUCH_ODR_CD


	final static String i_readPUCH_ODR_CD = null;

	// 第 106 変数初期値： i_readCOMPANY_CD


	final static String i_readCOMPANY_CD = null;

	// 第 107 変数初期値： i_readVEND_CD


	final static String i_readVEND_CD = null;

	// 第 108 変数初期値： i_readCONS_TYP


	final static String i_readCONS_TYP = null;

	// 第 109 変数初期値： i_readISSUE_INST_UNIT_DENOMINATOR


	final static String i_readISSUE_INST_UNIT_DENOMINATOR = null;

	// 第 110 変数初期値： i_readISSUE_INST_UNIT_NUMERATOR


	final static String i_readISSUE_INST_UNIT_NUMERATOR = null;

	// 第 111 変数初期値： i_readJOB_ODR_CD


	final static String i_readJOB_ODR_CD = null;

	// 第 112 変数初期値： i_readJOB_ODR_DETAIL_NO


	final static String i_readJOB_ODR_DETAIL_NO = null;

	// 第 113 変数初期値： i_readMRP_ODR_TYP


	final static String i_readMRP_ODR_TYP = null;

	// 第 114 変数初期値： i_readUNIT_QTY_TYP


	final static String i_readUNIT_QTY_TYP = null;

	// 第 115 変数初期値： i_readLOT_CONTROL_FLG


	final static String i_readLOT_CONTROL_FLG = null;

	// 第 116 変数初期値： i_setPUCH_ODR_CD


	final static String i_setPUCH_ODR_CD = null;

	// 第 117 変数初期値： i_setACPT_NO


	final static String i_setACPT_NO = null;

	// 第 118 変数初期値： i_setITEM_CD


	final static String i_setITEM_CD = null;

	// 第 119 変数初期値： i_setACPT_QTY


	final static String i_setACPT_QTY = null;

	// 第 120 変数初期値： i_setCOMPANY_CD


	final static String i_setCOMPANY_CD = null;

	// 第 121 変数初期値： i_setVEND_CD


	final static String i_setVEND_CD = null;

	// 第 122 変数初期値： i_setJOB_ODR_CD


	final static String i_setJOB_ODR_CD = null;

	// 第 123 変数初期値： i_setJOB_ODR_DETAIL_NO


	final static String i_setJOB_ODR_DETAIL_NO = null;

	// 第 124 変数初期値： i_setPLANT_CD


	final static String i_setPLANT_CD = null;

	// 第 125 変数初期値： i_setISSUE_INST_CD


	final static String i_setISSUE_INST_CD = null;

	// 第 126 変数初期値： i_setMRP_ODR_TYP


	final static String i_setMRP_ODR_TYP = null;

	// 第 127 変数初期値： i_setSUPPLIED_ISSUE_GNR_TYP


	final static String i_setSUPPLIED_ISSUE_GNR_TYP = null;

	// 第 128 変数初期値： i_setSUPPLIED_ISSUE_QTY


	final static String i_setSUPPLIED_ISSUE_QTY = null;

	// 第 129 変数初期値： i_setTOTAL_ISSUE_QTY


	final static String i_setTOTAL_ISSUE_QTY = null;

	// 第 130 変数初期値： i_setSUPPLIED_UNIT_DENOMINATOR


	final static String i_setSUPPLIED_UNIT_DENOMINATOR = null;

	// 第 131 変数初期値： i_setSUPPLIED_UNIT_NUMERATOR


	final static String i_setSUPPLIED_UNIT_NUMERATOR = null;

	// 第 132 変数初期値： i_setSUPPLIED_DATE


	final static String i_setSUPPLIED_DATE = null;

	// 第 133 変数初期値： i_setPART_SUPPLIED_COMMENT


	final static String i_setPART_SUPPLIED_COMMENT = null;

	// 第 134 変数初期値： i_readSTOCK_ON_HAND_QTY


	final static String i_readSTOCK_ON_HAND_QTY = null;

	// 第 135 変数初期値： i_setWH_CD


	final static String i_setWH_CD = null;

	// 第 136 変数初期値： i_readWH_CD


	final static String i_readWH_CD = null;

	// 第 137 変数初期値： i_setSTOCK_ON_HAND_QTY


	final static String i_setSTOCK_ON_HAND_QTY = null;

	// 第 138 変数初期値： i_setRCV_ISSUE_CTRL_CD


	final static String i_setRCV_ISSUE_CTRL_CD = null;

	// 第 139 変数初期値： i_setRCV_ISSUE_TYP


	final static String i_setRCV_ISSUE_TYP = null;

	// 第 140 変数初期値： i_setACPT_RSLT_CRCT_NO


	final static String i_setACPT_RSLT_CRCT_NO = null;

	// 第 141 変数初期値： i_setINSPEC_RSLT_CRCT_NO


	final static String i_setINSPEC_RSLT_CRCT_NO = null;

	// 第 142 変数初期値： i_setWORK_ODR_CD


	final static String i_setWORK_ODR_CD = null;

	// 第 143 変数初期値： i_setWORK_IN_PROC_CD


	final static String i_setWORK_IN_PROC_CD = null;

	// 第 144 変数初期値： i_setPARTIAL_PRD_NO


	final static String i_setPARTIAL_PRD_NO = null;

	// 第 145 変数初期値： i_setOPR_RSLT_CRCT_NO


	final static String i_setOPR_RSLT_CRCT_NO = null;

	// 第 146 変数初期値： i_setRCV_ISSUE_BEFORE_QTY


	final static String i_setRCV_ISSUE_BEFORE_QTY = null;

	// 第 147 変数初期値： i_setRCV_ISSUE_QTY


	final static String i_setRCV_ISSUE_QTY = null;

	// 第 148 変数初期値： i_setRCV_ISSUE_AFTER_QTY


	final static String i_setRCV_ISSUE_AFTER_QTY = null;

	// 第 149 変数初期値： i_setRCV_ISSUE_AMOUNT


	final static String i_setRCV_ISSUE_AMOUNT = null;

	// 第 150 変数初期値： i_setRCV_ISSUE_DATE


	final static String i_setRCV_ISSUE_DATE = null;

	// 第 151 変数初期値： i_setRCV_ISSUE_GNR_TYP


	final static String i_setRCV_ISSUE_GNR_TYP = null;

	// 第 152 変数初期値： i_setRCV_ISSUE_ODD_QTY


	final static String i_setRCV_ISSUE_ODD_QTY = null;

	// 第 153 変数初期値： i_setDEFECT_CAUSE_CD


	final static String i_setDEFECT_CAUSE_CD = null;

	// 第 154 変数初期値： i_setSTOCK_UPD_TYP


	final static String i_setSTOCK_UPD_TYP = null;

	// 第 155 変数初期値： i_setRCV_ISSUE_CMPLT_FLG


	final static String i_setRCV_ISSUE_CMPLT_FLG = null;

	// 第 156 変数初期値： i_setOD_NO


	final static String i_setOD_NO = null;

	// 第 157 変数初期値： i_setLOT_NO


	final static String i_setLOT_NO = null;

	// 第 158 変数初期値： i_setVEND_LOT_NO


	final static String i_setVEND_LOT_NO = null;

	// 第 159 変数初期値： i_setRCV_ISSUE_COMMENT


	final static String i_setRCV_ISSUE_COMMENT = null;

	// 第 160 変数初期値： i_setCONS_TYP


	final static String i_setCONS_TYP = null;

	// 第 161 変数初期値： i_setCONS_EXEC_DATE


	final static String i_setCONS_EXEC_DATE = null;

	// 第 162 変数初期値： i_THIS_MONTH


	final static String i_THIS_MONTH = null;

	// 第 163 変数初期値： i_INSTALL_FLG


	final static String i_INSTALL_FLG = null;

	// 第 164 変数初期値： i_readSUPPLIED_ISSUE_QTY


	final static String i_readSUPPLIED_ISSUE_QTY = null;

	// 第 165 変数初期値： i_readTOTAL_ISSUE_QTY


	final static String i_readTOTAL_ISSUE_QTY = null;

	// 第 166 変数初期値： i_readSUPPLIED_UNIT_DENOMINATOR


	final static String i_readSUPPLIED_UNIT_DENOMINATOR = null;

	// 第 167 変数初期値： i_readSUPPLIED_UNIT_NUMERATOR


	final static String i_readSUPPLIED_UNIT_NUMERATOR = null;

	// 第 168 変数初期値： i_PROC_EXEC_DATE


	final static BigDecimal i_PROC_EXEC_DATE = null;

	// 第 169 変数初期値： i_PAST_RESULT_ENTRY_TYP


	final static String i_PAST_RESULT_ENTRY_TYP = null;

	// 第 170 変数初期値： i_INSPC_WH_NAME


	final static String i_INSPC_WH_NAME = null;

	// 第 171 変数初期値： i_ISSUE_INST_CD


	final static String i_ISSUE_INST_CD = null;

	// 第 172 変数初期値： i_readLOT_NO


	final static String i_readLOT_NO = null;

	// 第 173 変数初期値： i_readQTY


	final static String i_readQTY = null;

	// 第 174 変数初期値： i_BEST_BEFORE_DATE


	final static String i_BEST_BEFORE_DATE = null;

	// 第 175 変数初期値： i_setSEQ_NO


	final static String i_setSEQ_NO = null;

	// 第 176 変数初期値： i_readSUPPLIED_DATE


	final static String i_readSUPPLIED_DATE = null;

	// 第 177 変数初期値： i_setSPENT_QTY


	final static String i_setSPENT_QTY = null;

	// 第 178 変数初期値： i_NEXTVAL


	final static String i_NEXTVAL = null;

	// 第 179 変数初期値： i_OD_NO


	final static String i_OD_NO = null;

	// 第 180 変数初期値： i_ODR_QTY


	final static String i_ODR_QTY = null;

	// 第 181 変数初期値： i_PVC2BUSINESSNAME


	final static String i_PVC2BUSINESSNAME = null;

	// 第 182 変数初期値： i_PVC2OUTPUTPATH


	final static String i_PVC2OUTPUTPATH = null;

	// 第 183 変数初期値： i_PVC2OUTPUTNAME


	final static String i_PVC2OUTPUTNAME = null;

	// 第 184 変数初期値： i_PVC2LOGMODE


	final static String i_PVC2LOGMODE = null;

	// 第 185 変数初期値： i_PVC2OUTPUTMODE


	final static String i_PVC2OUTPUTMODE = null;

	// 第 186 変数初期値： i_PVC2USERID


	final static String i_PVC2USERID = null;

	// 第 187 変数初期値： i_PVC2PLANTCD


	final static String i_PVC2PLANTCD = null;

	// 第 188 変数初期値： i_PVC2TAXID


	final static String i_PVC2TAXID = null;

	// 第 189 変数初期値： i_PNUMTAXOUTAMOUNT


	final static String i_PNUMTAXOUTAMOUNT = null;

	// 第 190 変数初期値： i_PNUMTAXAMOUNT


	final static String i_PNUMTAXAMOUNT = null;

	// 第 191 変数初期値： i_PNUMEXTERNALTAXSALESAMOUNT


	final static String i_PNUMEXTERNALTAXSALESAMOUNT = null;

	// 第 192 変数初期値： i_PNUMINTERNALTAXSALESAMOUNT


	final static String i_PNUMINTERNALTAXSALESAMOUNT = null;

	// 第 193 変数初期値： i_PNUMTAXFREESALESAMOUNT


	final static String i_PNUMTAXFREESALESAMOUNT = null;

	// 第 194 変数初期値： i_PNUMEXTERNALTAXAMOUNT


	final static String i_PNUMEXTERNALTAXAMOUNT = null;

	// 第 195 変数初期値： i_PNUMINTERNALTAXAMOUNT


	final static String i_PNUMINTERNALTAXAMOUNT = null;

	// 第 196 変数初期値： i_PVC2ERRCD


	final static String i_PVC2ERRCD = null;

	// 第 197 変数初期値： i_PNUMSTATUS


	final static String i_PNUMSTATUS = null;

	// 第 198 変数初期値： i_FROM_PUCH_ODR_CD


	final static String i_FROM_PUCH_ODR_CD = null;

	// 第 199 変数初期値： i_TO_PUCH_ODR_CD


	final static String i_TO_PUCH_ODR_CD = null;

	// 第 200 変数初期値： i_FROM_ITEM_CD


	final static String i_FROM_ITEM_CD = null;

	// 第 201 変数初期値： i_FROM_LOT_NO


	final static String i_FROM_LOT_NO = null;

	// 第 202 変数初期値： i_TO_ITEM_CD


	final static String i_TO_ITEM_CD = null;

	// 第 203 変数初期値： i_TO_LOT_NO


	final static String i_TO_LOT_NO = null;

*/

	//{{user_implement_code
	// TODO: 初期化で使う定数は、ここに記述してください。
	// 以下に記述した内容は自動的には変更されません。
	// 第 1 変数初期値： i_PUCH_ODR_CD
	final static String i_PUCH_ODR_CD = null;
	// 第 2 変数初期値： i_ACPT_NO
	final static String i_ACPT_NO = null;
	// 第 3 変数初期値： i_ACPT_QTY
	final static String i_ACPT_QTY = null;
	// 第 4 変数初期値： i_STOCK_UNIT
	final static String i_STOCK_UNIT = null;
	// 第 5 変数初期値： i_ACPT_DATE
	final static String i_ACPT_DATE = null;
	// 第 6 変数初期値： i_VEND_LOT_NO
	final static String i_VEND_LOT_NO = null;
	// 第 7 変数初期値： i_WH_CD
	final static String i_WH_CD = null;
	// 第 8 変数初期値： i_WH_NAME
	final static String i_WH_NAME = null;
	// 第 9 変数初期値： i_CUR_CD
	final static String i_CUR_CD = null;
	// 第 10 変数初期値： i_CUR_NAME
	final static String i_CUR_NAME = null;
	// 第 11 変数初期値： i_VEND_CUR_UNIT
	final static String i_VEND_CUR_UNIT = null;
	// 第 12 変数初期値： i_VEND_DECIMAL_FIG
	final static String i_VEND_DECIMAL_FIG = null;
	// 第 13 変数初期値： i_UNIT_COST_TYP
	final static String i_UNIT_COST_TYP = null;
	// 第 14 変数初期値： i_UNIT_COST
	final static String i_UNIT_COST = null;
	// 第 15 変数初期値： i_PROCESSING_COST
	final static String i_PROCESSING_COST = null;
	// 第 16 変数初期値： i_MATERIAL_COST
	final static String i_MATERIAL_COST = null;
	// 第 17 変数初期値： i_OTHER_OVERHEADS
	final static String i_OTHER_OVERHEADS = null;
	// 第 18 変数初期値： i_PUCH_ODR_AMOUNT
	final static String i_PUCH_ODR_AMOUNT = null;
	// 第 19 変数初期値： i_DISC_AMOUNT
	final static String i_DISC_AMOUNT = null;
	// 第 20 変数初期値： i_NET_AMOUNT
	final static String i_NET_AMOUNT = null;
	// 第 21 変数初期値： i_TAX_AMOUNT_1
	final static String i_TAX_AMOUNT_1 = null;
	// 第 22 変数初期値： i_TAX_AMOUNT_2
	final static String i_TAX_AMOUNT_2 = null;
	// 第 23 変数初期値： i_TAX_AMOUNT_3
	final static String i_TAX_AMOUNT_3 = null;
	// 第 24 変数初期値： i_TAX_RATE_1
	final static String i_TAX_RATE_1 = null;
	// 第 25 変数初期値： i_TAX_RATE_2
	final static String i_TAX_RATE_2 = null;
	// 第 26 変数初期値： i_TAX_RATE_3
	final static String i_TAX_RATE_3 = null;
	// 第 27 変数初期値： i_AMOUNT_INCLUDE_TAX
	final static String i_AMOUNT_INCLUDE_TAX = null;
	// 第 28 変数初期値： i_HOME_CUR_AMOUNT
	final static String i_HOME_CUR_AMOUNT = null;
	// 第 29 変数初期値： i_EXCH_RATE
	final static String i_EXCH_RATE = null;
	// 第 30 変数初期値： i_DLV_CD
	final static String i_DLV_CD = null;
	// 第 31 変数初期値： i_ACPT_RSLT_COMMENT
	final static String i_ACPT_RSLT_COMMENT = null;
	// 第 32 変数初期値： i_ITEM_CD
	final static String i_ITEM_CD = null;
	// 第 33 変数初期値： i_ITEM_NAME
	final static String i_ITEM_NAME = null;
	// 第 34 変数初期値： i_JOB_ODR_CD
	final static String i_JOB_ODR_CD = null;
	// 第 35 変数初期値： i_DRAW_CD
	final static String i_DRAW_CD = null;
	// 第 36 変数初期値： i_SPEC
	final static String i_SPEC = null;
	// 第 37 変数初期値： i_UNIT_QTY_TYP_DN
	final static String i_UNIT_QTY_TYP_DN = null;
	// 第 38 変数初期値： i_UNIT_QTY_TYP
	final static String i_UNIT_QTY_TYP = null;
	// 第 39 変数初期値： i_VEND_CD
	final static String i_VEND_CD = null;
	// 第 40 変数初期値： i_VEND_NAME
	final static String i_VEND_NAME = null;
	// 第 41 変数初期値： i_PUCH_ODR_QTY
	final static String i_PUCH_ODR_QTY = null;
	// 第 42 変数初期値： i_SUM_ACPT_QTY
	final static String i_SUM_ACPT_QTY = null;
	// 第 43 変数初期値： i_ACPT_INSPC_TYP_DN
	final static String i_ACPT_INSPC_TYP_DN = null;
	// 第 44 変数初期値： i_ACPT_INSPC_TYP
	final static String i_ACPT_INSPC_TYP = null;
	// 第 45 変数初期値： i_PUCH_ODR_SLIP_ISS_DATE
	final static String i_PUCH_ODR_SLIP_ISS_DATE = null;
	// 第 46 変数初期値： i_PUCH_ODR_DLV_DATE
	final static String i_PUCH_ODR_DLV_DATE = null;
	// 第 47 変数初期値： i_CONFIRM_DLV_DATE
	final static String i_CONFIRM_DLV_DATE = null;
	// 第 48 変数初期値： i_WORK_IN_PROC_CD
	final static String i_WORK_IN_PROC_CD = null;
	// 第 49 変数初期値： i_PROC_NAME
	final static String i_PROC_NAME = null;
	// 第 50 変数初期値： i_PUCH_ODR_PERSON
	final static String i_PUCH_ODR_PERSON = null;
	// 第 51 変数初期値： i_USER_NAME
	final static String i_USER_NAME = null;
	// 第 52 変数初期値： i_PUCH_ODR_STS_TYP_DN
	final static String i_PUCH_ODR_STS_TYP_DN = null;
	// 第 53 変数初期値： i_PUCH_ODR_STS_TYP
	final static String i_PUCH_ODR_STS_TYP = null;
	// 第 54 変数初期値： i_INSPC_CMPLT_FLG_DN
	final static String i_INSPC_CMPLT_FLG_DN = null;
	// 第 55 変数初期値： i_INSPC_CMPLT_FLG
	final static String i_INSPC_CMPLT_FLG = null;
	// 第 56 変数初期値： i_SPL_ITEM_TYP_DN
	final static String i_SPL_ITEM_TYP_DN = null;
	// 第 57 変数初期値： i_SPL_ITEM_TYP
	final static String i_SPL_ITEM_TYP = null;
	// 第 58 変数初期値： i_PRODUCT_TYP_DN
	final static String i_PRODUCT_TYP_DN = null;
	// 第 59 変数初期値： i_PRODUCT_TYP
	final static String i_PRODUCT_TYP = null;
	// 第 60 変数初期値： i_NON_NO_ITEM_FLG_DN
	final static String i_NON_NO_ITEM_FLG_DN = null;
	// 第 61 変数初期値： i_NON_NO_ITEM_FLG
	final static String i_NON_NO_ITEM_FLG = null;
	// 第 62 変数初期値： i_PLANT_CD
	final static String i_PLANT_CD = null;
	// 第 63 変数初期値： i_COMPANY_CD
	final static String i_COMPANY_CD = null;
	// 第 64 変数初期値： i_TAX_CD
	final static String i_TAX_CD = null;
	// 第 65 変数初期値： i_ROUND_TYP
	final static String i_ROUND_TYP = null;
	// 第 66 変数初期値： i_TAX_ROUND_TYP
	final static String i_TAX_ROUND_TYP = null;
	// 第 67 変数初期値： i_PUCH_ODR_START_DATE
	final static String i_PUCH_ODR_START_DATE = null;
	// 第 68 変数初期値： i_BUSINESS_OPR_DATE
	final static String i_BUSINESS_OPR_DATE = null;
	// 第 69 変数初期値： i_PUCH_ODR_MODIFY_COUNT
	final static String i_PUCH_ODR_MODIFY_COUNT = null;
	// 第 70 変数初期値： i_ACPT_STS_TYP
	final static String i_ACPT_STS_TYP = null;
	// 第 71 変数初期値： i_INSPC_CMPLT_DATE
	final static String i_INSPC_CMPLT_DATE = null;
	// 第 72 変数初期値： i_readISSUE_INST_CD
	final static String i_readISSUE_INST_CD = null;
	// 第 73 変数初期値： i_readPLANT_CD
	final static String i_readPLANT_CD = null;
	// 第 74 変数初期値： i_readOD_NO
	final static String i_readOD_NO = null;
	// 第 75 変数初期値： i_readITEM_CD
	final static String i_readITEM_CD = null;
	// 第 76 変数初期値： i_readPUCH_ODR_CD
	final static String i_readPUCH_ODR_CD = null;
	// 第 77 変数初期値： i_readCOMPANY_CD
	final static String i_readCOMPANY_CD = null;
	// 第 78 変数初期値： i_readVEND_CD
	final static String i_readVEND_CD = null;
	// 第 79 変数初期値： i_readCONS_TYP
	final static String i_readCONS_TYP = null;
	// 第 80 変数初期値： i_readISSUE_INST_UNIT_DENOMINATOR
	final static String i_readISSUE_INST_UNIT_DENOMINATOR = null;
	// 第 81 変数初期値： i_readISSUE_INST_UNIT_NUMERATOR
	final static String i_readISSUE_INST_UNIT_NUMERATOR = null;
	// 第 82 変数初期値： i_readJOB_ODR_CD
	final static String i_readJOB_ODR_CD = null;
	// 第 83 変数初期値： i_readJOB_ODR_DETAIL_NO
	final static String i_readJOB_ODR_DETAIL_NO = null;
	// 第 84 変数初期値： i_readMRP_ODR_TYP
	final static String i_readMRP_ODR_TYP = null;
	// 第 85 変数初期値： i_setPUCH_ODR_CD
	final static String i_setPUCH_ODR_CD = null;
	// 第 86 変数初期値： i_setACPT_NO
	final static String i_setACPT_NO = null;
	// 第 87 変数初期値： i_setITEM_CD
	final static String i_setITEM_CD = null;
	// 第 88 変数初期値： i_setACPT_QTY
	final static String i_setACPT_QTY = null;
	// 第 89 変数初期値： i_setCOMPANY_CD
	final static String i_setCOMPANY_CD = null;
	// 第 90 変数初期値： i_setVEND_CD
	final static String i_setVEND_CD = null;
	// 第 91 変数初期値： i_setJOB_ODR_CD
	final static String i_setJOB_ODR_CD = null;
	// 第 92 変数初期値： i_setJOB_ODR_DETAIL_NO
	final static String i_setJOB_ODR_DETAIL_NO = null;
	// 第 93 変数初期値： i_setPLANT_CD
	final static String i_setPLANT_CD = null;
	// 第 94 変数初期値： i_setISSUE_INST_CD
	final static String i_setISSUE_INST_CD = null;
	// 第 95 変数初期値： i_setMRP_ODR_TYP
	final static String i_setMRP_ODR_TYP = null;
	// 第 96 変数初期値： i_setSUPPLIED_ISSUE_GNR_TYP
	final static String i_setSUPPLIED_ISSUE_GNR_TYP = null;
	// 第 97 変数初期値： i_setSUPPLIED_ISSUE_QTY
	final static String i_setSUPPLIED_ISSUE_QTY = null;
	// 第 98 変数初期値： i_setTOTAL_ISSUE_QTY
	final static String i_setTOTAL_ISSUE_QTY = null;
	// 第 99 変数初期値： i_setSUPPLIED_UNIT_DENOMINATOR
	final static String i_setSUPPLIED_UNIT_DENOMINATOR = null;
	// 第 100 変数初期値： i_setSUPPLIED_UNIT_NUMERATOR
	final static String i_setSUPPLIED_UNIT_NUMERATOR = null;
	// 第 101 変数初期値： i_setSUPPLIED_DATE
	final static String i_setSUPPLIED_DATE = null;
	// 第 102 変数初期値： i_setPART_SUPPLIED_COMMENT
	final static String i_setPART_SUPPLIED_COMMENT = null;
	// 第 103 変数初期値： i_readSTOCK_ON_HAND_QTY
	final static String i_readSTOCK_ON_HAND_QTY = null;
	// 第 104 変数初期値： i_setWH_CD
	final static String i_setWH_CD = null;
	// 第 105 変数初期値： i_readWH_CD
	final static String i_readWH_CD = null;
	// 第 106 変数初期値： i_setSTOCK_ON_HAND_QTY
	final static String i_setSTOCK_ON_HAND_QTY = null;
	// 第 107 変数初期値： i_setRCV_ISSUE_CTRL_CD
	final static String i_setRCV_ISSUE_CTRL_CD = null;
	// 第 108 変数初期値： i_setRCV_ISSUE_TYP
	final static String i_setRCV_ISSUE_TYP = null;
	// 第 109 変数初期値： i_setACPT_RSLT_CRCT_NO
	final static String i_setACPT_RSLT_CRCT_NO = null;
	// 第 110 変数初期値： i_setINSPEC_RSLT_CRCT_NO
	final static String i_setINSPEC_RSLT_CRCT_NO = null;
	// 第 111 変数初期値： i_setWORK_ODR_CD
	final static String i_setWORK_ODR_CD = null;
	// 第 112 変数初期値： i_setWORK_IN_PROC_CD
	final static String i_setWORK_IN_PROC_CD = null;
	// 第 113 変数初期値： i_setPARTIAL_PRD_NO
	final static String i_setPARTIAL_PRD_NO = null;
	// 第 114 変数初期値： i_setOPR_RSLT_CRCT_NO
	final static String i_setOPR_RSLT_CRCT_NO = null;
	// 第 115 変数初期値： i_setRCV_ISSUE_BEFORE_QTY
	final static String i_setRCV_ISSUE_BEFORE_QTY = null;
	// 第 116 変数初期値： i_setRCV_ISSUE_QTY
	final static String i_setRCV_ISSUE_QTY = null;
	// 第 117 変数初期値： i_setRCV_ISSUE_AFTER_QTY
	final static String i_setRCV_ISSUE_AFTER_QTY = null;
	// 第 118 変数初期値： i_setRCV_ISSUE_AMOUNT
	final static String i_setRCV_ISSUE_AMOUNT = null;
	// 第 119 変数初期値： i_setRCV_ISSUE_DATE
	final static String i_setRCV_ISSUE_DATE = null;
	// 第 120 変数初期値： i_setRCV_ISSUE_GNR_TYP
	final static String i_setRCV_ISSUE_GNR_TYP = null;
	// 第 121 変数初期値： i_setRCV_ISSUE_ODD_QTY
	final static String i_setRCV_ISSUE_ODD_QTY = null;
	// 第 122 変数初期値： i_setDEFECT_CAUSE_CD
	final static String i_setDEFECT_CAUSE_CD = null;
	// 第 123 変数初期値： i_setSTOCK_UPD_TYP
	final static String i_setSTOCK_UPD_TYP = null;
	// 第 124 変数初期値： i_setRCV_ISSUE_CMPLT_FLG
	final static String i_setRCV_ISSUE_CMPLT_FLG = null;
	// 第 125 変数初期値： i_setOD_NO
	final static String i_setOD_NO = null;
	// 第 126 変数初期値： i_setVEND_LOT_NO
	final static String i_setVEND_LOT_NO = null;
	// 第 127 変数初期値： i_setRCV_ISSUE_COMMENT
	final static String i_setRCV_ISSUE_COMMENT = null;
	// 第 128 変数初期値： i_setCONS_TYP
	final static String i_setCONS_TYP = null;
	// 第 129 変数初期値： i_setCONS_EXEC_DATE
	final static String i_setCONS_EXEC_DATE = null;
	// 第 130 変数初期値： i_h_PUCH_ODR_CD
	final static String i_h_PUCH_ODR_CD = null;
	// 第 131 変数初期値： i_c_COMPLETE
	final static String i_c_COMPLETE = null;
	// 第 132 変数初期値： i_UNIT_COST_TYP_name
	final static String i_UNIT_COST_TYP_name = null;
	// 第 133 変数初期値： i_UNIT_COST_TYP_val
	final static String i_UNIT_COST_TYP_val = null;
	// 第 134 変数初期値： i_TAX_NAME_1
	final static String i_TAX_NAME_1 = null;
	// 第 135 変数初期値： i_TAX_NAME_2
	final static String i_TAX_NAME_2 = null;
	// 第 136 変数初期値： i_TAX_NAME_3
	final static String i_TAX_NAME_3 = null;
	// 第 137 変数初期値： i_HOME_CUR_UNIT
	final static String i_HOME_CUR_UNIT = null;
	// 第 138 変数初期値： i_SelectUnitCostFlag
	final static String i_SelectUnitCostFlag = null;
	// 第 139 変数初期値： i_HOME_DECIMAL_FIG
	final static String i_HOME_DECIMAL_FIG = null;

	/**
	 * 初期化
	 *
	 */
	public void initialize() {

		clear();
		m_PUCH_ODR_CD = i_PUCH_ODR_CD;
		m_ACPT_NO = i_ACPT_NO;
		m_ACPT_QTY = i_ACPT_QTY;
		m_STOCK_UNIT = i_STOCK_UNIT;
		m_ACPT_DATE = i_ACPT_DATE;
		m_VEND_LOT_NO = i_VEND_LOT_NO;
		m_WH_CD = i_WH_CD;
		m_WH_NAME = i_WH_NAME;
		m_CUR_CD = i_CUR_CD;
		m_CUR_NAME = i_CUR_NAME;
		m_VEND_CUR_UNIT = i_VEND_CUR_UNIT;
		m_VEND_DECIMAL_FIG = i_VEND_DECIMAL_FIG;
		m_UNIT_COST_TYP = i_UNIT_COST_TYP;
		m_UNIT_COST = i_UNIT_COST;
		m_PROCESSING_COST = i_PROCESSING_COST;
		m_MATERIAL_COST = i_MATERIAL_COST;
		m_OTHER_OVERHEADS = i_OTHER_OVERHEADS;
		m_PUCH_ODR_AMOUNT = i_PUCH_ODR_AMOUNT;
		m_DISC_AMOUNT = i_DISC_AMOUNT;
		m_NET_AMOUNT = i_NET_AMOUNT;
		m_TAX_AMOUNT_1 = i_TAX_AMOUNT_1;
		m_TAX_AMOUNT_2 = i_TAX_AMOUNT_2;
		m_TAX_AMOUNT_3 = i_TAX_AMOUNT_3;
		m_TAX_RATE_1 = i_TAX_RATE_1;
		m_TAX_RATE_2 = i_TAX_RATE_2;
		m_TAX_RATE_3 = i_TAX_RATE_3;
		m_AMOUNT_INCLUDE_TAX = i_AMOUNT_INCLUDE_TAX;
		m_HOME_CUR_AMOUNT = i_HOME_CUR_AMOUNT;
		m_EXCH_RATE = i_EXCH_RATE;
		m_DLV_CD = i_DLV_CD;
		m_ACPT_RSLT_COMMENT = i_ACPT_RSLT_COMMENT;
		m_ITEM_CD = i_ITEM_CD;
		m_ITEM_NAME = i_ITEM_NAME;
		m_JOB_ODR_CD = i_JOB_ODR_CD;
		m_DRAW_CD = i_DRAW_CD;
		m_SPEC = i_SPEC;
		m_UNIT_QTY_TYP_DN = i_UNIT_QTY_TYP_DN;
		m_UNIT_QTY_TYP = i_UNIT_QTY_TYP;
		m_VEND_CD = i_VEND_CD;
		m_VEND_NAME = i_VEND_NAME;
		m_PUCH_ODR_QTY = i_PUCH_ODR_QTY;
		m_SUM_ACPT_QTY = i_SUM_ACPT_QTY;
		m_ACPT_INSPC_TYP_DN = i_ACPT_INSPC_TYP_DN;
		m_ACPT_INSPC_TYP = i_ACPT_INSPC_TYP;
		m_PUCH_ODR_SLIP_ISS_DATE = i_PUCH_ODR_SLIP_ISS_DATE;
		m_PUCH_ODR_DLV_DATE = i_PUCH_ODR_DLV_DATE;
		m_CONFIRM_DLV_DATE = i_CONFIRM_DLV_DATE;
		m_WORK_IN_PROC_CD = i_WORK_IN_PROC_CD;
		m_PROC_NAME = i_PROC_NAME;
		m_PUCH_ODR_PERSON = i_PUCH_ODR_PERSON;
		m_USER_NAME = i_USER_NAME;
		m_PUCH_ODR_STS_TYP_DN = i_PUCH_ODR_STS_TYP_DN;
		m_PUCH_ODR_STS_TYP = i_PUCH_ODR_STS_TYP;
		m_INSPC_CMPLT_FLG_DN = i_INSPC_CMPLT_FLG_DN;
		m_INSPC_CMPLT_FLG = i_INSPC_CMPLT_FLG;
		m_SPL_ITEM_TYP_DN = i_SPL_ITEM_TYP_DN;
		m_SPL_ITEM_TYP = i_SPL_ITEM_TYP;
		m_PRODUCT_TYP_DN = i_PRODUCT_TYP_DN;
		m_PRODUCT_TYP = i_PRODUCT_TYP;
		m_NON_NO_ITEM_FLG_DN = i_NON_NO_ITEM_FLG_DN;
		m_NON_NO_ITEM_FLG = i_NON_NO_ITEM_FLG;
		m_PLANT_CD = i_PLANT_CD;
		m_COMPANY_CD = i_COMPANY_CD;
		m_TAX_CD = i_TAX_CD;
		m_ROUND_TYP = i_ROUND_TYP;
		m_TAX_ROUND_TYP = i_TAX_ROUND_TYP;
		m_PUCH_ODR_START_DATE = i_PUCH_ODR_START_DATE;
		m_BUSINESS_OPR_DATE = i_BUSINESS_OPR_DATE;
		m_PUCH_ODR_MODIFY_COUNT = i_PUCH_ODR_MODIFY_COUNT;
		m_ACPT_STS_TYP = i_ACPT_STS_TYP;
		m_INSPC_CMPLT_DATE = i_INSPC_CMPLT_DATE;
		m_readISSUE_INST_CD = i_readISSUE_INST_CD;
		m_readPLANT_CD = i_readPLANT_CD;
		m_readOD_NO = i_readOD_NO;
		m_readITEM_CD = i_readITEM_CD;
		m_readPUCH_ODR_CD = i_readPUCH_ODR_CD;
		m_readCOMPANY_CD = i_readCOMPANY_CD;
		m_readVEND_CD = i_readVEND_CD;
		m_readCONS_TYP = i_readCONS_TYP;
		m_readISSUE_INST_UNIT_DENOMINATOR = i_readISSUE_INST_UNIT_DENOMINATOR;
		m_readISSUE_INST_UNIT_NUMERATOR = i_readISSUE_INST_UNIT_NUMERATOR;
		m_setPUCH_ODR_CD = i_setPUCH_ODR_CD;
		m_setACPT_NO = i_setACPT_NO;
		m_setITEM_CD = i_setITEM_CD;
		m_setACPT_QTY = i_setACPT_QTY;
		m_setCOMPANY_CD = i_setCOMPANY_CD;
		m_setVEND_CD = i_setVEND_CD;
		m_setJOB_ODR_CD = i_setJOB_ODR_CD;
		m_setJOB_ODR_DETAIL_NO = i_setJOB_ODR_DETAIL_NO;
		m_setPLANT_CD = i_setPLANT_CD;
		m_setISSUE_INST_CD = i_setISSUE_INST_CD;
		m_setMRP_ODR_TYP = i_setMRP_ODR_TYP;
		m_setSUPPLIED_ISSUE_GNR_TYP = i_setSUPPLIED_ISSUE_GNR_TYP;
		m_setSUPPLIED_ISSUE_QTY = i_setSUPPLIED_ISSUE_QTY;
		m_setTOTAL_ISSUE_QTY = i_setTOTAL_ISSUE_QTY;
		m_setSUPPLIED_UNIT_DENOMINATOR = i_setSUPPLIED_UNIT_DENOMINATOR;
		m_setSUPPLIED_UNIT_NUMERATOR = i_setSUPPLIED_UNIT_NUMERATOR;
		m_setSUPPLIED_DATE = i_setSUPPLIED_DATE;
		m_setPART_SUPPLIED_COMMENT = i_setPART_SUPPLIED_COMMENT;
		m_readSTOCK_ON_HAND_QTY = i_readSTOCK_ON_HAND_QTY;
		m_setWH_CD = i_setWH_CD;
		m_readWH_CD = i_readWH_CD;
		m_setSTOCK_ON_HAND_QTY = i_setSTOCK_ON_HAND_QTY;
		m_setRCV_ISSUE_CTRL_CD = i_setRCV_ISSUE_CTRL_CD;
		m_setRCV_ISSUE_TYP = i_setRCV_ISSUE_TYP;
		m_setACPT_RSLT_CRCT_NO = i_setACPT_RSLT_CRCT_NO;
		m_setINSPEC_RSLT_CRCT_NO = i_setINSPEC_RSLT_CRCT_NO;
		m_setWORK_ODR_CD = i_setWORK_ODR_CD;
		m_setWORK_IN_PROC_CD = i_setWORK_IN_PROC_CD;
		m_setPARTIAL_PRD_NO = i_setPARTIAL_PRD_NO;
		m_setOPR_RSLT_CRCT_NO = i_setOPR_RSLT_CRCT_NO;
		m_setRCV_ISSUE_BEFORE_QTY = i_setRCV_ISSUE_BEFORE_QTY;
		m_setRCV_ISSUE_QTY = i_setRCV_ISSUE_QTY;
		m_setRCV_ISSUE_AFTER_QTY = i_setRCV_ISSUE_AFTER_QTY;
		m_setRCV_ISSUE_AMOUNT = i_setRCV_ISSUE_AMOUNT;
		m_setRCV_ISSUE_DATE = i_setRCV_ISSUE_DATE;
		m_setRCV_ISSUE_GNR_TYP = i_setRCV_ISSUE_GNR_TYP;
		m_setRCV_ISSUE_ODD_QTY = i_setRCV_ISSUE_ODD_QTY;
		m_setDEFECT_CAUSE_CD = i_setDEFECT_CAUSE_CD;
		m_setSTOCK_UPD_TYP = i_setSTOCK_UPD_TYP;
		m_setRCV_ISSUE_CMPLT_FLG = i_setRCV_ISSUE_CMPLT_FLG;
		m_setOD_NO = i_setOD_NO;
		m_setVEND_LOT_NO = i_setVEND_LOT_NO;
		m_setRCV_ISSUE_COMMENT = i_setRCV_ISSUE_COMMENT;
		m_setCONS_TYP = i_setCONS_TYP;
		m_setCONS_EXEC_DATE = i_setCONS_EXEC_DATE;
		m_h_PUCH_ODR_CD = i_h_PUCH_ODR_CD;
		m_c_COMPLETE = i_c_COMPLETE;
		m_UNIT_COST_TYP_name = i_UNIT_COST_TYP_name;
		m_UNIT_COST_TYP_val = i_UNIT_COST_TYP_val;
		m_HOME_CUR_UNIT = i_HOME_CUR_UNIT;
		m_SelectUnitCostFlag = i_SelectUnitCostFlag;
		m_HOME_DECIMAL_FIG = i_HOME_DECIMAL_FIG;
		m_readMRP_ODR_TYP = i_readMRP_ODR_TYP;
		m_readJOB_ODR_CD = i_readJOB_ODR_CD;
		m_readJOB_ODR_DETAIL_NO = i_readJOB_ODR_DETAIL_NO;
	}

	// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
