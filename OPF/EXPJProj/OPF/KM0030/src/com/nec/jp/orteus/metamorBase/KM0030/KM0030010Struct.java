/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KM0030/src/com/nec/jp/orteus/metamorBase/KM0030/KM0030010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.KM0030;

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
 * CLASS     : KM0030010Control クラス
 * ファイル・クラス説明
 * @author $Author: chenjunhua268 $
 * @version $Revision: 1.2 $ $Date: 2014/06/11 03:16:27 $
 *
 */
//}}user_implement_code_header

public class KM0030010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_rdoSHIP_INST */
	public String m_rdoSHIP_INST = null;
	/** 第 2 変数： m_rdoSHIP_UPDATE */
	public String m_rdoSHIP_UPDATE = null;
	/** 第 3 変数： m_l_CUR_UNIT */
	public String m_l_CUR_UNIT = null;
	/** 第 4 変数： m_DETAIL_NO */
	public String m_DETAIL_NO = null;
	/** 第 5 変数： m_ACPT_ODR_CD */
	public String m_ACPT_ODR_CD = null;
	/** 第 6 変数： m_c_DOODR */
	public String m_c_DOODR = null;
	/** 第 7 変数： m_PREPARE_QTY */
	public String m_PREPARE_QTY = null;
	/** 第 8 変数： m_c_INPUTODRCD */
	public String m_c_INPUTODRCD = null;
	/** 第 9 変数： m_QTY */
	public String m_QTY = null;
	/** 第 10 変数： m_QTY_UNIT */
	public String m_QTY_UNIT = null;
	/** 第 11 変数： m_ODR_PRICE_UNIT */
	public String m_ODR_PRICE_UNIT = null;
	/** 第 12 変数： m_ISSUE_INST_COMMENT */
	public String m_ISSUE_INST_COMMENT = null;
	/** 第 13 変数： m_APPROVED_COMMENT */
	public String m_APPROVED_COMMENT = null;
	/** 第 14 変数： m_CUST_CHRG_PSN_NAME */
	public String m_CUST_CHRG_PSN_NAME = null;
	/** 第 15 変数： m_ES_ORG_NAME */
	public String m_ES_ORG_NAME = null;
	/** 第 16 変数： m_l_DLV_LOC_NAME */
	public String m_l_DLV_LOC_NAME = null;
	/** 第 17 変数： m_l_CUST_ITEM_NAME */
	public String m_l_CUST_ITEM_NAME = null;
	/** 第 18 変数： m_l_ITEM_NAME */
	public String m_l_ITEM_NAME = null;
	/** 第 19 変数： m_l_JOB_ODR_DLV_DATE */
	public String m_l_JOB_ODR_DLV_DATE = null;
	/** 第 20 変数： m_l_ALC_GRP_CD */
	public String m_l_ALC_GRP_CD = null;
	/** 第 21 変数： m_l_JOB_ODR_CD */
	public String m_l_JOB_ODR_CD = null;
	/** 第 22 変数： m_l_APPR_REMARKS */
	public String m_l_APPR_REMARKS = null;
	/** 第 23 変数： m_h_UPDATE_FLG */
	public String m_h_UPDATE_FLG = null;
	/** 第 24 変数： m_l_TEST_MODIFY_COUNT */
	public String m_l_TEST_MODIFY_COUNT = null;
	/** 第 25 変数： m_l_TPJ_MODIFY_COUNT */
	public String m_l_TPJ_MODIFY_COUNT = null;
	/** 第 26 変数： m_l_h_ESTIMATE_TYPE */
	public String m_l_h_ESTIMATE_TYPE = null;
	/** 第 27 変数： m_h_ESTIMATE_TYPE */
	public String m_h_ESTIMATE_TYPE = null;
	/** 第 28 変数： m_l_h_PREC_ARRANGE_FLG */
	public String m_l_h_PREC_ARRANGE_FLG = null;
	/** 第 29 変数： m_l_c_DOODR */
	public String m_l_c_DOODR = null;
	/** 第 30 変数： m_l_c_INPUTODRCD */
	public String m_l_c_INPUTODRCD = null;
	/** 第 31 変数： m_h_PREC_ARRANGE_FLG */
	public String m_h_PREC_ARRANGE_FLG = null;
	/** 第 32 変数： m_l_h_ODR_TYP */
	public String m_l_h_ODR_TYP = null;
	/** 第 33 変数： m_h_ODR_TYP */
	public String m_h_ODR_TYP = null;
	/** 第 34 変数： m_h_ODR_TYP3 */
	public String m_h_ODR_TYP3 = null;
	/** 第 35 変数： m_h_APR_ODR */
	public String m_h_APR_ODR = null;
	/** 第 36 変数： m_h_PRD_REQ_JOB_ODR_TYP_1 */
	public String m_h_PRD_REQ_JOB_ODR_TYP_1 = null;
	/** 第 37 変数： m_h_PRD_REQ_JOB_ODR_TYP_2 */
	public String m_h_PRD_REQ_JOB_ODR_TYP_2 = null;
	/** 第 38 変数： m_h_DLV_LOC_CD */
	public String m_h_DLV_LOC_CD = null;
	/** 第 39 変数： m_h_ANS_DLV_DATE_EXIST_FLG */
	public String m_h_ANS_DLV_DATE_EXIST_FLG = null;
	/** 第 40 変数： m_ITEM_NAME_R */
	public String m_ITEM_NAME_R = null;
	/** 第 41 変数： m_l_h_DEPO_TYP */
	public String m_l_h_DEPO_TYP = null;
	/** 第 42 変数： m_PROJECT_CD */
	public String m_PROJECT_CD = null;
	/** 第 43 変数： m_ESTIMATE_NO */
	public String m_ESTIMATE_NO = null;
	/** 第 44 変数： m_l_DETAL_NO */
	public String m_l_DETAL_NO = null;
	/** 第 45 変数： m_CUST_NAME */
	public String m_CUST_NAME = null;
	/** 第 46 変数： m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** 第 47 変数： m_CODE */
	public String m_CODE = null;
	/** 第 48 変数： m_SYS_CLASS */
	public String m_SYS_CLASS = null;
	/** 第 49 変数： m_CLASS_CODE */
	public String m_CLASS_CODE = null;
	/** 第 50 変数： m_BUSINESS_OPR_DATE */
	public String m_BUSINESS_OPR_DATE = null;
	/** 第 51 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** 第 52 変数： m_HOME_CUR_CD */
	public String m_HOME_CUR_CD = null;
	/** 第 53 変数： m_VALUE */
	public String m_VALUE = null;
	/** 第 54 変数： m_NAME */
	public String m_NAME = null;
	/** 第 55 変数： m_PROJECT_NAME */
	public String m_PROJECT_NAME = null;
	/** 第 56 変数： m_CUST_CD */
	public String m_CUST_CD = null;
	/** 第 57 変数： m_PROJECT_STAT */
	public String m_PROJECT_STAT = null;
	/** 第 58 変数： m_DLV_LOC_CD */
	public String m_DLV_LOC_CD = null;
	/** 第 59 変数： m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** 第 60 変数： m_CUR_CD */
	public String m_CUR_CD = null;
	/** 第 61 変数： m_EXCH_TYP */
	public String m_EXCH_TYP = null;
	/** 第 62 変数： m_TAX_APPLY_TYP */
	public String m_TAX_APPLY_TYP = null;
	/** 第 63 変数： m_TAX_CD */
	public String m_TAX_CD = null;
	/** 第 64 変数： m_TAX_CALC_TYP */
	public String m_TAX_CALC_TYP = null;
	/** 第 65 変数： m_PARTIAL_SHIP_INST_FLG */
	public String m_PARTIAL_SHIP_INST_FLG = null;
	/** 第 66 変数： m_CUR_NAME */
	public String m_CUR_NAME = null;
	/** 第 67 変数： m_CUR_UNIT */
	public String m_CUR_UNIT = null;
	/** 第 68 変数： m_DECIMAL_FIG */
	public String m_DECIMAL_FIG = null;
	/** 第 69 変数： m_l_ES_USER_CD */
	public String m_l_ES_USER_CD = null;
	/** 第 70 変数： m_l_ES_ORG_CD */
	public String m_l_ES_ORG_CD = null;
	/** 第 71 変数： m_l_CUST_ITEM_CD */
	public String m_l_CUST_ITEM_CD = null;
	/** 第 72 変数： m_l_ESTIMATE_QTY */
	public String m_l_ESTIMATE_QTY = null;
	/** 第 73 変数： m_l_UNIT_CD */
	public String m_l_UNIT_CD = null;
	/** 第 74 変数： m_l_ESTIMATE_UNIT_PRICE */
	public String m_l_ESTIMATE_UNIT_PRICE = null;
	/** 第 75 変数： m_l_ESTIMATE_AMOUNT */
	public String m_l_ESTIMATE_AMOUNT = null;
	/** 第 76 変数： m_l_ESTIMATE_TYPE */
	public String m_l_ESTIMATE_TYPE = null;
	/** 第 77 変数： m_l_ESTIMATE_ITEM_NAME */
	public String m_l_ESTIMATE_ITEM_NAME = null;
	/** 第 78 変数： m_l_USER_NAME */
	public String m_l_USER_NAME = null;
	/** 第 79 変数： m_l_ORG_NAME */
	public String m_l_ORG_NAME = null;
	/** 第 80 変数： m_DLV_LOC_NAME */
	public String m_DLV_LOC_NAME = null;
	/** 第 81 変数： m_TRANSPORT_LT */
	public String m_TRANSPORT_LT = null;
	/** 第 82 変数： m_TRANSPORT_CD */
	public String m_TRANSPORT_CD = null;
	/** 第 83 変数： m_TRANSPORT_TYP */
	public String m_TRANSPORT_TYP = null;
	/** 第 84 変数： m_DEPO_WH_CD */
	public String m_DEPO_WH_CD = null;
	/** 第 85 変数： m_SHIP_PLANT_CD */
	public String m_SHIP_PLANT_CD = null;
	/** 第 86 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 87 変数： m_DEPO_TYP */
	public String m_DEPO_TYP = null;
	/** 第 88 変数： m_CUST_ITEM_NAME */
	public String m_CUST_ITEM_NAME = null;
	/** 第 89 変数： m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** 第 90 変数： m_CUST_ITEM_CD */
	public String m_CUST_ITEM_CD = null;
	/** 第 91 変数： m_ESTIMATE_TYPE */
	public String m_ESTIMATE_TYPE = null;
	/** 第 92 変数： m_ODR_NO */
	public String m_ODR_NO = null;
	/** 第 93 変数： m_DETAL_NO */
	public String m_DETAL_NO = null;
	/** 第 94 変数： m_l_ODR_NO */
	public String m_l_ODR_NO = null;
	/** 第 95 変数： m_l_ODR_TYP */
	public String m_l_ODR_TYP = null;
	/** 第 96 変数： m_l_CUST_ODR_NO */
	public String m_l_CUST_ODR_NO = null;
	/** 第 97 変数： m_l_ITEM_CD */
	public String m_l_ITEM_CD = null;
	/** 第 98 変数： m_l_DESINATED_DLV_DATE */
	public String m_l_DESINATED_DLV_DATE = null;
	/** 第 99 変数： m_l_ODR_QTY */
	public String m_l_ODR_QTY = null;
	/** 第 100 変数： m_l_ODR_AMOUNT */
	public String m_l_ODR_AMOUNT = null;
	/** 第 101 変数： m_l_ODR_AMOUNT_EXCH_RATES */
	public String m_l_ODR_AMOUNT_EXCH_RATES = null;
	/** 第 102 変数： m_l_DLV_LOC_CD */
	public String m_l_DLV_LOC_CD = null;
	/** 第 103 変数： m_l_DEPO_TYP */
	public String m_l_DEPO_TYP = null;
	/** 第 104 変数： m_l_ODR_ACPT_DATE */
	public String m_l_ODR_ACPT_DATE = null;
	/** 第 105 変数： m_l_REMARKS */
	public String m_l_REMARKS = null;
	/** 第 106 変数： m_l_OWN_PERSON_CD */
	public String m_l_OWN_PERSON_CD = null;
	/** 第 107 変数： m_l_TODR_MODIFY_COUNT */
	public String m_l_TODR_MODIFY_COUNT = null;
	/** 第 108 変数： m_l_CUST_CHRG_PSN_NAME */
	public String m_l_CUST_CHRG_PSN_NAME = null;
	/** 第 109 変数： m_l_OWN_ORG_CD */
	public String m_l_OWN_ORG_CD = null;
	/** 第 110 変数： m_l_CUST_CHRG_ORG_NAME */
	public String m_l_CUST_CHRG_ORG_NAME = null;
	/** 第 111 変数： m_ODR_TYP */
	public String m_ODR_TYP = null;
	/** 第 112 変数： m_ODR_CTL_NO */
	public String m_ODR_CTL_NO = null;
	/** 第 113 変数： m_CUST_ODR_NO */
	public String m_CUST_ODR_NO = null;
	/** 第 114 変数： m_CUST_CHRG_ORG_CD */
	public String m_CUST_CHRG_ORG_CD = null;
	/** 第 115 変数： m_CUST_CHRG_PSN_CD */
	public String m_CUST_CHRG_PSN_CD = null;
	/** 第 116 変数： m_ODR_ACPT_PSN_CD */
	public String m_ODR_ACPT_PSN_CD = null;
	/** 第 117 変数： m_CURRNCY_CD */
	public String m_CURRNCY_CD = null;
	/** 第 118 変数： m_DLV_LOC_NAME_KANJI */
	public String m_DLV_LOC_NAME_KANJI = null;
	/** 第 119 変数： m_ODR_UNIT_PRICE */
	public String m_ODR_UNIT_PRICE = null;
	/** 第 120 変数： m_SPCL_PRICE_TYP */
	public String m_SPCL_PRICE_TYP = null;
	/** 第 121 変数： m_DESINATED_DLV_DATE */
	public String m_DESINATED_DLV_DATE = null;
	/** 第 122 変数： m_STD_DESINATED_RCV_DATE */
	public String m_STD_DESINATED_RCV_DATE = null;
	/** 第 123 変数： m_ODR_QTY */
	public String m_ODR_QTY = null;
	/** 第 124 変数： m_REMAIN_UNCONFIRM_ODR_QTY */
	public String m_REMAIN_UNCONFIRM_ODR_QTY = null;
	/** 第 125 変数： m_CANCELED_UNCONFIRM_ODR_QTY */
	public String m_CANCELED_UNCONFIRM_ODR_QTY = null;
	/** 第 126 変数： m_UNIT_CD */
	public String m_UNIT_CD = null;
	/** 第 127 変数： m_UNCONFIRM_ODR_BALANCE */
	public String m_UNCONFIRM_ODR_BALANCE = null;
	/** 第 128 変数： m_ODR_AMOUNT */
	public String m_ODR_AMOUNT = null;
	/** 第 129 変数： m_ODR_AMOUNT_EXCH_RATES */
	public String m_ODR_AMOUNT_EXCH_RATES = null;
	/** 第 130 変数： m_ODR_CMPLT_FLG */
	public String m_ODR_CMPLT_FLG = null;
	/** 第 131 変数： m_PART_NAME */
	public String m_PART_NAME = null;
	/** 第 132 変数： m_REMARKS */
	public String m_REMARKS = null;
	/** 第 133 変数： m_ODR_ACPT_DATE */
	public String m_ODR_ACPT_DATE = null;
	/** 第 134 変数： m_SHIP_PLAN_REMAIN_QTY */
	public String m_SHIP_PLAN_REMAIN_QTY = null;
	/** 第 135 変数： m_SHIP_PLAN_CMPLT_FLG */
	public String m_SHIP_PLAN_CMPLT_FLG = null;
	/** 第 136 変数： m_UNCONFIRMED_ODR_EFF_OVR_FLG */
	public String m_UNCONFIRMED_ODR_EFF_OVR_FLG = null;
	/** 第 137 変数： m_ENTRY_TYP */
	public String m_ENTRY_TYP = null;
	/** 第 138 変数： m_DEL_FLG */
	public String m_DEL_FLG = null;
	/** 第 139 変数： m_JOB_ODR_SET_FLG */
	public String m_JOB_ODR_SET_FLG = null;
	/** 第 140 変数： m_SLIP_CD */
	public String m_SLIP_CD = null;
	/** 第 141 変数： m_ORGN_ODR_NO */
	public String m_ORGN_ODR_NO = null;
	/** 第 142 変数： m_ADD_ODR_FLG */
	public String m_ADD_ODR_FLG = null;
	/** 第 143 変数： m_ODR_CMPLT_DATE */
	public String m_ODR_CMPLT_DATE = null;
	/** 第 144 変数： m_ODR_ACPT_ORG_CD */
	public String m_ODR_ACPT_ORG_CD = null;
	/** 第 145 変数： m_ESTIMATE_STAT */
	public String m_ESTIMATE_STAT = null;
	/** 第 146 変数： m_ES_ORG_CD */
	public String m_ES_ORG_CD = null;
	/** 第 147 変数： m_ES_USER_CD */
	public String m_ES_USER_CD = null;
	/** 第 148 変数： m_ESTIMATE_QTY */
	public String m_ESTIMATE_QTY = null;
	/** 第 149 変数： m_ESTIMATE_UNIT_PRICE */
	public String m_ESTIMATE_UNIT_PRICE = null;
	/** 第 150 変数： m_ESTIMATE_AMOUNT */
	public String m_ESTIMATE_AMOUNT = null;
	/** 第 151 変数： m_ODR_FLG */
	public String m_ODR_FLG = null;
	/** 第 152 変数： m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** 第 153 変数： m_CAL_NO */
	public String m_CAL_NO = null;
	/** 第 154 変数： m_JOB_ODR_DLV_DATE */
	public String m_JOB_ODR_DLV_DATE = null;
	/** 第 155 変数： m_RSLT_CTL_SEQ_CD */
	public String m_RSLT_CTL_SEQ_CD = null;
	/** 第 156 変数： m_UNIT */
	public String m_UNIT = null;
	/** 第 157 変数： m_DLV_PLACE_CD */
	public String m_DLV_PLACE_CD = null;
	/** 第 158 変数： m_UNIT_PRICE */
	public String m_UNIT_PRICE = null;
	/** 第 159 変数： m_SPCL_PRICE_CO */
	public String m_SPCL_PRICE_CO = null;
	/** 第 160 変数： m_CUST_DLV_CD */
	public String m_CUST_DLV_CD = null;
	/** 第 161 変数： m_CUST_DLV_KEY_CD */
	public String m_CUST_DLV_KEY_CD = null;
	/** 第 162 変数： m_IF_CTL_NO */
	public String m_IF_CTL_NO = null;
	/** 第 163 変数： m_ODR_SEQ */
	public String m_ODR_SEQ = null;
	/** 第 164 変数： m_PART_DLV_SEQ_NO */
	public String m_PART_DLV_SEQ_NO = null;
	/** 第 165 変数： m_LAST_ANS_DLV_DATE_RCD */
	public String m_LAST_ANS_DLV_DATE_RCD = null;
	/** 第 166 変数： m_DESINATED_SHIP_DATE */
	public String m_DESINATED_SHIP_DATE = null;
	/** 第 167 変数： m_DESINATED_SHIP_QTY */
	public String m_DESINATED_SHIP_QTY = null;
	/** 第 168 変数： m_REST_SHIP_ODR_QTY */
	public String m_REST_SHIP_ODR_QTY = null;
	/** 第 169 変数： m_SHIP_ODR_CMPLT_FLG */
	public String m_SHIP_ODR_CMPLT_FLG = null;
	/** 第 170 変数： m_JOB_ODR_CANCEL_NO */
	public String m_JOB_ODR_CANCEL_NO = null;
	/** 第 171 変数： m_JOB_ODR_TYP */
	public String m_JOB_ODR_TYP = null;
	/** 第 172 変数： m_PLAN_TYP */
	public String m_PLAN_TYP = null;
	/** 第 173 変数： m_JOB_ODR_QTY */
	public String m_JOB_ODR_QTY = null;
	/** 第 174 変数： m_ALC_GRP_CD */
	public String m_ALC_GRP_CD = null;
	/** 第 175 変数： m_JOB_ODR_STS_TYP */
	public String m_JOB_ODR_STS_TYP = null;
	/** 第 176 変数： m_JOB_ODR_EXP_TYP */
	public String m_JOB_ODR_EXP_TYP = null;
	/** 第 177 変数： m_JOB_ODR_DEL_FLG */
	public String m_JOB_ODR_DEL_FLG = null;
	/** 第 178 変数： m_ALCD_QTY */
	public String m_ALCD_QTY = null;
	/** 第 179 変数： m_CUS_DLV_CD */
	public String m_CUS_DLV_CD = null;
	/** 第 180 変数： m_CUS_DLV_KEY_CD */
	public String m_CUS_DLV_KEY_CD = null;
	/** 第 181 変数： m_UNOFFICIAL_RECEIPT_FLAG */
	public String m_UNOFFICIAL_RECEIPT_FLAG = null;
	/** 第 182 変数： m_JOB_OD_CD_PREFIX */
	public String m_JOB_OD_CD_PREFIX = null;
	/** 第 183 変数： m_CTL_SEQ_CD */
	public String m_CTL_SEQ_CD = null;
	/** 第 184 変数： m_NEW_OLD_FLG */
	public String m_NEW_OLD_FLG = null;
	/** 第 185 変数： m_TRAN_TYPE */
	public String m_TRAN_TYPE = null;
	/** 第 186 変数： m_EXCH_RATE */
	public String m_EXCH_RATE = null;
	/** 第 187 変数： m_ORG_NAME */
	public String m_ORG_NAME = null;
	/** 第 188 変数： m_ORG_CD */
	public String m_ORG_CD = null;
	/** 第 189 変数： m_USER_NAME */
	public String m_USER_NAME = null;
	/** 第 190 変数： m_USER_CD */
	public String m_USER_CD = null;
	/** 第 191 変数： m_UNIT_QTY_TYP */
	public String m_UNIT_QTY_TYP = null;
	/** 第 192 変数： m_l_h_ANS_DLV_DATE_EXIST_FLG */
	public String m_l_h_ANS_DLV_DATE_EXIST_FLG = null;
	/** 第 193 変数： m_FIELD_VALUE */
	public String m_FIELD_VALUE = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_rdoSHIP_INST */
	public List l_rdoSHIP_INST = null;

	/** 第 2 List変数： l_rdoSHIP_UPDATE */
	public List l_rdoSHIP_UPDATE = null;

	/** 第 3 List変数： l_l_CUR_UNIT */
	public List l_l_CUR_UNIT = null;

	/** 第 4 List変数： l_DETAIL_NO */
	public List l_DETAIL_NO = null;

	/** 第 5 List変数： l_ACPT_ODR_CD */
	public List l_ACPT_ODR_CD = null;

	/** 第 6 List変数： l_c_DOODR */
	public List l_c_DOODR = null;

	/** 第 7 List変数： l_PREPARE_QTY */
	public List l_PREPARE_QTY = null;

	/** 第 8 List変数： l_c_INPUTODRCD */
	public List l_c_INPUTODRCD = null;

	/** 第 9 List変数： l_QTY */
	public List l_QTY = null;

	/** 第 10 List変数： l_QTY_UNIT */
	public List l_QTY_UNIT = null;

	/** 第 11 List変数： l_ODR_PRICE_UNIT */
	public List l_ODR_PRICE_UNIT = null;

	/** 第 12 List変数： l_ISSUE_INST_COMMENT */
	public List l_ISSUE_INST_COMMENT = null;

	/** 第 13 List変数： l_APPROVED_COMMENT */
	public List l_APPROVED_COMMENT = null;

	/** 第 14 List変数： l_CUST_CHRG_PSN_NAME */
	public List l_CUST_CHRG_PSN_NAME = null;

	/** 第 15 List変数： l_ES_ORG_NAME */
	public List l_ES_ORG_NAME = null;

	/** 第 16 List変数： l_l_DLV_LOC_NAME */
	public List l_l_DLV_LOC_NAME = null;

	/** 第 17 List変数： l_l_CUST_ITEM_NAME */
	public List l_l_CUST_ITEM_NAME = null;

	/** 第 18 List変数： l_l_ITEM_NAME */
	public List l_l_ITEM_NAME = null;

	/** 第 19 List変数： l_l_JOB_ODR_DLV_DATE */
	public List l_l_JOB_ODR_DLV_DATE = null;

	/** 第 20 List変数： l_l_ALC_GRP_CD */
	public List l_l_ALC_GRP_CD = null;

	/** 第 21 List変数： l_l_JOB_ODR_CD */
	public List l_l_JOB_ODR_CD = null;

	/** 第 22 List変数： l_l_APPR_REMARKS */
	public List l_l_APPR_REMARKS = null;

	/** 第 23 List変数： l_h_UPDATE_FLG */
	public List l_h_UPDATE_FLG = null;

	/** 第 24 List変数： l_l_TEST_MODIFY_COUNT */
	public List l_l_TEST_MODIFY_COUNT = null;

	/** 第 25 List変数： l_l_TPJ_MODIFY_COUNT */
	public List l_l_TPJ_MODIFY_COUNT = null;

	/** 第 26 List変数： l_l_h_ESTIMATE_TYPE */
	public List l_l_h_ESTIMATE_TYPE = null;

	/** 第 27 List変数： l_h_ESTIMATE_TYPE */
	public List l_h_ESTIMATE_TYPE = null;

	/** 第 28 List変数： l_l_h_PREC_ARRANGE_FLG */
	public List l_l_h_PREC_ARRANGE_FLG = null;

	/** 第 29 List変数： l_l_c_DOODR */
	public List l_l_c_DOODR = null;

	/** 第 30 List変数： l_l_c_INPUTODRCD */
	public List l_l_c_INPUTODRCD = null;

	/** 第 31 List変数： l_h_PREC_ARRANGE_FLG */
	public List l_h_PREC_ARRANGE_FLG = null;

	/** 第 32 List変数： l_l_h_ODR_TYP */
	public List l_l_h_ODR_TYP = null;

	/** 第 33 List変数： l_h_ODR_TYP */
	public List l_h_ODR_TYP = null;

	/** 第 34 List変数： l_h_ODR_TYP3 */
	public List l_h_ODR_TYP3 = null;

	/** 第 35 List変数： l_h_APR_ODR */
	public List l_h_APR_ODR = null;

	/** 第 36 List変数： l_h_PRD_REQ_JOB_ODR_TYP_1 */
	public List l_h_PRD_REQ_JOB_ODR_TYP_1 = null;

	/** 第 37 List変数： l_h_PRD_REQ_JOB_ODR_TYP_2 */
	public List l_h_PRD_REQ_JOB_ODR_TYP_2 = null;

	/** 第 38 List変数： l_h_DLV_LOC_CD */
	public List l_h_DLV_LOC_CD = null;

	/** 第 39 List変数： l_h_ANS_DLV_DATE_EXIST_FLG */
	public List l_h_ANS_DLV_DATE_EXIST_FLG = null;

	/** 第 40 List変数： l_ITEM_NAME_R */
	public List l_ITEM_NAME_R = null;

	/** 第 41 List変数： l_l_h_DEPO_TYP */
	public List l_l_h_DEPO_TYP = null;

	/** 第 42 List変数： l_PROJECT_CD */
	public List l_PROJECT_CD = null;

	/** 第 43 List変数： l_ESTIMATE_NO */
	public List l_ESTIMATE_NO = null;

	/** 第 44 List変数： l_l_DETAL_NO */
	public List l_l_DETAL_NO = null;

	/** 第 45 List変数： l_CUST_NAME */
	public List l_CUST_NAME = null;

	/** 第 46 List変数： l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** 第 47 List変数： l_CODE */
	public List l_CODE = null;

	/** 第 48 List変数： l_SYS_CLASS */
	public List l_SYS_CLASS = null;

	/** 第 49 List変数： l_CLASS_CODE */
	public List l_CLASS_CODE = null;

	/** 第 50 List変数： l_BUSINESS_OPR_DATE */
	public List l_BUSINESS_OPR_DATE = null;

	/** 第 51 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** 第 52 List変数： l_HOME_CUR_CD */
	public List l_HOME_CUR_CD = null;

	/** 第 53 List変数： l_VALUE */
	public List l_VALUE = null;

	/** 第 54 List変数： l_NAME */
	public List l_NAME = null;

	/** 第 55 List変数： l_PROJECT_NAME */
	public List l_PROJECT_NAME = null;

	/** 第 56 List変数： l_CUST_CD */
	public List l_CUST_CD = null;

	/** 第 57 List変数： l_PROJECT_STAT */
	public List l_PROJECT_STAT = null;

	/** 第 58 List変数： l_DLV_LOC_CD */
	public List l_DLV_LOC_CD = null;

	/** 第 59 List変数： l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** 第 60 List変数： l_CUR_CD */
	public List l_CUR_CD = null;

	/** 第 61 List変数： l_EXCH_TYP */
	public List l_EXCH_TYP = null;

	/** 第 62 List変数： l_TAX_APPLY_TYP */
	public List l_TAX_APPLY_TYP = null;

	/** 第 63 List変数： l_TAX_CD */
	public List l_TAX_CD = null;

	/** 第 64 List変数： l_TAX_CALC_TYP */
	public List l_TAX_CALC_TYP = null;

	/** 第 65 List変数： l_PARTIAL_SHIP_INST_FLG */
	public List l_PARTIAL_SHIP_INST_FLG = null;

	/** 第 66 List変数： l_CUR_NAME */
	public List l_CUR_NAME = null;

	/** 第 67 List変数： l_CUR_UNIT */
	public List l_CUR_UNIT = null;

	/** 第 68 List変数： l_DECIMAL_FIG */
	public List l_DECIMAL_FIG = null;

	/** 第 69 List変数： l_l_ES_USER_CD */
	public List l_l_ES_USER_CD = null;

	/** 第 70 List変数： l_l_ES_ORG_CD */
	public List l_l_ES_ORG_CD = null;

	/** 第 71 List変数： l_l_CUST_ITEM_CD */
	public List l_l_CUST_ITEM_CD = null;

	/** 第 72 List変数： l_l_ESTIMATE_QTY */
	public List l_l_ESTIMATE_QTY = null;

	/** 第 73 List変数： l_l_UNIT_CD */
	public List l_l_UNIT_CD = null;

	/** 第 74 List変数： l_l_ESTIMATE_UNIT_PRICE */
	public List l_l_ESTIMATE_UNIT_PRICE = null;

	/** 第 75 List変数： l_l_ESTIMATE_AMOUNT */
	public List l_l_ESTIMATE_AMOUNT = null;

	/** 第 76 List変数： l_l_ESTIMATE_TYPE */
	public List l_l_ESTIMATE_TYPE = null;

	/** 第 77 List変数： l_l_ESTIMATE_ITEM_NAME */
	public List l_l_ESTIMATE_ITEM_NAME = null;

	/** 第 78 List変数： l_l_USER_NAME */
	public List l_l_USER_NAME = null;

	/** 第 79 List変数： l_l_ORG_NAME */
	public List l_l_ORG_NAME = null;

	/** 第 80 List変数： l_DLV_LOC_NAME */
	public List l_DLV_LOC_NAME = null;

	/** 第 81 List変数： l_TRANSPORT_LT */
	public List l_TRANSPORT_LT = null;

	/** 第 82 List変数： l_TRANSPORT_CD */
	public List l_TRANSPORT_CD = null;

	/** 第 83 List変数： l_TRANSPORT_TYP */
	public List l_TRANSPORT_TYP = null;

	/** 第 84 List変数： l_DEPO_WH_CD */
	public List l_DEPO_WH_CD = null;

	/** 第 85 List変数： l_SHIP_PLANT_CD */
	public List l_SHIP_PLANT_CD = null;

	/** 第 86 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 87 List変数： l_DEPO_TYP */
	public List l_DEPO_TYP = null;

	/** 第 88 List変数： l_CUST_ITEM_NAME */
	public List l_CUST_ITEM_NAME = null;

	/** 第 89 List変数： l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** 第 90 List変数： l_CUST_ITEM_CD */
	public List l_CUST_ITEM_CD = null;

	/** 第 91 List変数： l_ESTIMATE_TYPE */
	public List l_ESTIMATE_TYPE = null;

	/** 第 92 List変数： l_ODR_NO */
	public List l_ODR_NO = null;

	/** 第 93 List変数： l_DETAL_NO */
	public List l_DETAL_NO = null;

	/** 第 94 List変数： l_l_ODR_NO */
	public List l_l_ODR_NO = null;

	/** 第 95 List変数： l_l_ODR_TYP */
	public List l_l_ODR_TYP = null;

	/** 第 96 List変数： l_l_CUST_ODR_NO */
	public List l_l_CUST_ODR_NO = null;

	/** 第 97 List変数： l_l_ITEM_CD */
	public List l_l_ITEM_CD = null;

	/** 第 98 List変数： l_l_DESINATED_DLV_DATE */
	public List l_l_DESINATED_DLV_DATE = null;

	/** 第 99 List変数： l_l_ODR_QTY */
	public List l_l_ODR_QTY = null;

	/** 第 100 List変数： l_l_ODR_AMOUNT */
	public List l_l_ODR_AMOUNT = null;

	/** 第 101 List変数： l_l_ODR_AMOUNT_EXCH_RATES */
	public List l_l_ODR_AMOUNT_EXCH_RATES = null;

	/** 第 102 List変数： l_l_DLV_LOC_CD */
	public List l_l_DLV_LOC_CD = null;

	/** 第 103 List変数： l_l_DEPO_TYP */
	public List l_l_DEPO_TYP = null;

	/** 第 104 List変数： l_l_ODR_ACPT_DATE */
	public List l_l_ODR_ACPT_DATE = null;

	/** 第 105 List変数： l_l_REMARKS */
	public List l_l_REMARKS = null;

	/** 第 106 List変数： l_l_OWN_PERSON_CD */
	public List l_l_OWN_PERSON_CD = null;

	/** 第 107 List変数： l_l_TODR_MODIFY_COUNT */
	public List l_l_TODR_MODIFY_COUNT = null;

	/** 第 108 List変数： l_l_CUST_CHRG_PSN_NAME */
	public List l_l_CUST_CHRG_PSN_NAME = null;

	/** 第 109 List変数： l_l_OWN_ORG_CD */
	public List l_l_OWN_ORG_CD = null;

	/** 第 110 List変数： l_l_CUST_CHRG_ORG_NAME */
	public List l_l_CUST_CHRG_ORG_NAME = null;

	/** 第 111 List変数： l_ODR_TYP */
	public List l_ODR_TYP = null;

	/** 第 112 List変数： l_ODR_CTL_NO */
	public List l_ODR_CTL_NO = null;

	/** 第 113 List変数： l_CUST_ODR_NO */
	public List l_CUST_ODR_NO = null;

	/** 第 114 List変数： l_CUST_CHRG_ORG_CD */
	public List l_CUST_CHRG_ORG_CD = null;

	/** 第 115 List変数： l_CUST_CHRG_PSN_CD */
	public List l_CUST_CHRG_PSN_CD = null;

	/** 第 116 List変数： l_ODR_ACPT_PSN_CD */
	public List l_ODR_ACPT_PSN_CD = null;

	/** 第 117 List変数： l_CURRNCY_CD */
	public List l_CURRNCY_CD = null;

	/** 第 118 List変数： l_DLV_LOC_NAME_KANJI */
	public List l_DLV_LOC_NAME_KANJI = null;

	/** 第 119 List変数： l_ODR_UNIT_PRICE */
	public List l_ODR_UNIT_PRICE = null;

	/** 第 120 List変数： l_SPCL_PRICE_TYP */
	public List l_SPCL_PRICE_TYP = null;

	/** 第 121 List変数： l_DESINATED_DLV_DATE */
	public List l_DESINATED_DLV_DATE = null;

	/** 第 122 List変数： l_STD_DESINATED_RCV_DATE */
	public List l_STD_DESINATED_RCV_DATE = null;

	/** 第 123 List変数： l_ODR_QTY */
	public List l_ODR_QTY = null;

	/** 第 124 List変数： l_REMAIN_UNCONFIRM_ODR_QTY */
	public List l_REMAIN_UNCONFIRM_ODR_QTY = null;

	/** 第 125 List変数： l_CANCELED_UNCONFIRM_ODR_QTY */
	public List l_CANCELED_UNCONFIRM_ODR_QTY = null;

	/** 第 126 List変数： l_UNIT_CD */
	public List l_UNIT_CD = null;

	/** 第 127 List変数： l_UNCONFIRM_ODR_BALANCE */
	public List l_UNCONFIRM_ODR_BALANCE = null;

	/** 第 128 List変数： l_ODR_AMOUNT */
	public List l_ODR_AMOUNT = null;

	/** 第 129 List変数： l_ODR_AMOUNT_EXCH_RATES */
	public List l_ODR_AMOUNT_EXCH_RATES = null;

	/** 第 130 List変数： l_ODR_CMPLT_FLG */
	public List l_ODR_CMPLT_FLG = null;

	/** 第 131 List変数： l_PART_NAME */
	public List l_PART_NAME = null;

	/** 第 132 List変数： l_REMARKS */
	public List l_REMARKS = null;

	/** 第 133 List変数： l_ODR_ACPT_DATE */
	public List l_ODR_ACPT_DATE = null;

	/** 第 134 List変数： l_SHIP_PLAN_REMAIN_QTY */
	public List l_SHIP_PLAN_REMAIN_QTY = null;

	/** 第 135 List変数： l_SHIP_PLAN_CMPLT_FLG */
	public List l_SHIP_PLAN_CMPLT_FLG = null;

	/** 第 136 List変数： l_UNCONFIRMED_ODR_EFF_OVR_FLG */
	public List l_UNCONFIRMED_ODR_EFF_OVR_FLG = null;

	/** 第 137 List変数： l_ENTRY_TYP */
	public List l_ENTRY_TYP = null;

	/** 第 138 List変数： l_DEL_FLG */
	public List l_DEL_FLG = null;

	/** 第 139 List変数： l_JOB_ODR_SET_FLG */
	public List l_JOB_ODR_SET_FLG = null;

	/** 第 140 List変数： l_SLIP_CD */
	public List l_SLIP_CD = null;

	/** 第 141 List変数： l_ORGN_ODR_NO */
	public List l_ORGN_ODR_NO = null;

	/** 第 142 List変数： l_ADD_ODR_FLG */
	public List l_ADD_ODR_FLG = null;

	/** 第 143 List変数： l_ODR_CMPLT_DATE */
	public List l_ODR_CMPLT_DATE = null;

	/** 第 144 List変数： l_ODR_ACPT_ORG_CD */
	public List l_ODR_ACPT_ORG_CD = null;

	/** 第 145 List変数： l_ESTIMATE_STAT */
	public List l_ESTIMATE_STAT = null;

	/** 第 146 List変数： l_ES_ORG_CD */
	public List l_ES_ORG_CD = null;

	/** 第 147 List変数： l_ES_USER_CD */
	public List l_ES_USER_CD = null;

	/** 第 148 List変数： l_ESTIMATE_QTY */
	public List l_ESTIMATE_QTY = null;

	/** 第 149 List変数： l_ESTIMATE_UNIT_PRICE */
	public List l_ESTIMATE_UNIT_PRICE = null;

	/** 第 150 List変数： l_ESTIMATE_AMOUNT */
	public List l_ESTIMATE_AMOUNT = null;

	/** 第 151 List変数： l_ODR_FLG */
	public List l_ODR_FLG = null;

	/** 第 152 List変数： l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** 第 153 List変数： l_CAL_NO */
	public List l_CAL_NO = null;

	/** 第 154 List変数： l_JOB_ODR_DLV_DATE */
	public List l_JOB_ODR_DLV_DATE = null;

	/** 第 155 List変数： l_RSLT_CTL_SEQ_CD */
	public List l_RSLT_CTL_SEQ_CD = null;

	/** 第 156 List変数： l_UNIT */
	public List l_UNIT = null;

	/** 第 157 List変数： l_DLV_PLACE_CD */
	public List l_DLV_PLACE_CD = null;

	/** 第 158 List変数： l_UNIT_PRICE */
	public List l_UNIT_PRICE = null;

	/** 第 159 List変数： l_SPCL_PRICE_CO */
	public List l_SPCL_PRICE_CO = null;

	/** 第 160 List変数： l_CUST_DLV_CD */
	public List l_CUST_DLV_CD = null;

	/** 第 161 List変数： l_CUST_DLV_KEY_CD */
	public List l_CUST_DLV_KEY_CD = null;

	/** 第 162 List変数： l_IF_CTL_NO */
	public List l_IF_CTL_NO = null;

	/** 第 163 List変数： l_ODR_SEQ */
	public List l_ODR_SEQ = null;

	/** 第 164 List変数： l_PART_DLV_SEQ_NO */
	public List l_PART_DLV_SEQ_NO = null;

	/** 第 165 List変数： l_LAST_ANS_DLV_DATE_RCD */
	public List l_LAST_ANS_DLV_DATE_RCD = null;

	/** 第 166 List変数： l_DESINATED_SHIP_DATE */
	public List l_DESINATED_SHIP_DATE = null;

	/** 第 167 List変数： l_DESINATED_SHIP_QTY */
	public List l_DESINATED_SHIP_QTY = null;

	/** 第 168 List変数： l_REST_SHIP_ODR_QTY */
	public List l_REST_SHIP_ODR_QTY = null;

	/** 第 169 List変数： l_SHIP_ODR_CMPLT_FLG */
	public List l_SHIP_ODR_CMPLT_FLG = null;

	/** 第 170 List変数： l_JOB_ODR_CANCEL_NO */
	public List l_JOB_ODR_CANCEL_NO = null;

	/** 第 171 List変数： l_JOB_ODR_TYP */
	public List l_JOB_ODR_TYP = null;

	/** 第 172 List変数： l_PLAN_TYP */
	public List l_PLAN_TYP = null;

	/** 第 173 List変数： l_JOB_ODR_QTY */
	public List l_JOB_ODR_QTY = null;

	/** 第 174 List変数： l_ALC_GRP_CD */
	public List l_ALC_GRP_CD = null;

	/** 第 175 List変数： l_JOB_ODR_STS_TYP */
	public List l_JOB_ODR_STS_TYP = null;

	/** 第 176 List変数： l_JOB_ODR_EXP_TYP */
	public List l_JOB_ODR_EXP_TYP = null;

	/** 第 177 List変数： l_JOB_ODR_DEL_FLG */
	public List l_JOB_ODR_DEL_FLG = null;

	/** 第 178 List変数： l_ALCD_QTY */
	public List l_ALCD_QTY = null;

	/** 第 179 List変数： l_CUS_DLV_CD */
	public List l_CUS_DLV_CD = null;

	/** 第 180 List変数： l_CUS_DLV_KEY_CD */
	public List l_CUS_DLV_KEY_CD = null;

	/** 第 181 List変数： l_UNOFFICIAL_RECEIPT_FLAG */
	public List l_UNOFFICIAL_RECEIPT_FLAG = null;

	/** 第 182 List変数： l_JOB_OD_CD_PREFIX */
	public List l_JOB_OD_CD_PREFIX = null;

	/** 第 183 List変数： l_CTL_SEQ_CD */
	public List l_CTL_SEQ_CD = null;

	/** 第 184 List変数： l_NEW_OLD_FLG */
	public List l_NEW_OLD_FLG = null;

	/** 第 185 List変数： l_TRAN_TYPE */
	public List l_TRAN_TYPE = null;

	/** 第 186 List変数： l_EXCH_RATE */
	public List l_EXCH_RATE = null;

	/** 第 187 List変数： l_ORG_NAME */
	public List l_ORG_NAME = null;

	/** 第 188 List変数： l_ORG_CD */
	public List l_ORG_CD = null;

	/** 第 189 List変数： l_USER_NAME */
	public List l_USER_NAME = null;

	/** 第 190 List変数： l_USER_CD */
	public List l_USER_CD = null;

	/** 第 191 List変数： l_UNIT_QTY_TYP */
	public List l_UNIT_QTY_TYP = null;

	/** 第 192 List変数： l_l_h_ANS_DLV_DATE_EXIST_FLG */
	public List l_l_h_ANS_DLV_DATE_EXIST_FLG = null;

	/** 第 193 List変数： l_FIELD_VALUE */
	public List l_FIELD_VALUE = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getrdoSHIP_INST() { return m_rdoSHIP_INST; }
	public String getrdoSHIP_UPDATE() { return m_rdoSHIP_UPDATE; }
	public String getl_CUR_UNIT() { return m_l_CUR_UNIT; }
	public String getDETAIL_NO() { return m_DETAIL_NO; }
	public String getACPT_ODR_CD() { return m_ACPT_ODR_CD; }
	public String getc_DOODR() { return m_c_DOODR; }
	public String getPREPARE_QTY() { return m_PREPARE_QTY; }
	public String getc_INPUTODRCD() { return m_c_INPUTODRCD; }
	public String getQTY() { return m_QTY; }
	public String getQTY_UNIT() { return m_QTY_UNIT; }
	public String getODR_PRICE_UNIT() { return m_ODR_PRICE_UNIT; }
	public String getISSUE_INST_COMMENT() { return m_ISSUE_INST_COMMENT; }
	public String getAPPROVED_COMMENT() { return m_APPROVED_COMMENT; }
	public String getCUST_CHRG_PSN_NAME() { return m_CUST_CHRG_PSN_NAME; }
	public String getES_ORG_NAME() { return m_ES_ORG_NAME; }
	public String getl_DLV_LOC_NAME() { return m_l_DLV_LOC_NAME; }
	public String getl_CUST_ITEM_NAME() { return m_l_CUST_ITEM_NAME; }
	public String getl_ITEM_NAME() { return m_l_ITEM_NAME; }
	public String getl_JOB_ODR_DLV_DATE() { return m_l_JOB_ODR_DLV_DATE; }
	public String getl_ALC_GRP_CD() { return m_l_ALC_GRP_CD; }
	public String getl_JOB_ODR_CD() { return m_l_JOB_ODR_CD; }
	public String getl_APPR_REMARKS() { return m_l_APPR_REMARKS; }
	public String geth_UPDATE_FLG() { return m_h_UPDATE_FLG; }
	public String getl_TEST_MODIFY_COUNT() { return m_l_TEST_MODIFY_COUNT; }
	public String getl_TPJ_MODIFY_COUNT() { return m_l_TPJ_MODIFY_COUNT; }
	public String getl_h_ESTIMATE_TYPE() { return m_l_h_ESTIMATE_TYPE; }
	public String geth_ESTIMATE_TYPE() { return m_h_ESTIMATE_TYPE; }
	public String getl_h_PREC_ARRANGE_FLG() { return m_l_h_PREC_ARRANGE_FLG; }
	public String getl_c_DOODR() { return m_l_c_DOODR; }
	public String getl_c_INPUTODRCD() { return m_l_c_INPUTODRCD; }
	public String geth_PREC_ARRANGE_FLG() { return m_h_PREC_ARRANGE_FLG; }
	public String getl_h_ODR_TYP() { return m_l_h_ODR_TYP; }
	public String geth_ODR_TYP() { return m_h_ODR_TYP; }
	public String geth_ODR_TYP3() { return m_h_ODR_TYP3; }
	public String geth_APR_ODR() { return m_h_APR_ODR; }
	public String geth_PRD_REQ_JOB_ODR_TYP_1() { return m_h_PRD_REQ_JOB_ODR_TYP_1; }
	public String geth_PRD_REQ_JOB_ODR_TYP_2() { return m_h_PRD_REQ_JOB_ODR_TYP_2; }
	public String geth_DLV_LOC_CD() { return m_h_DLV_LOC_CD; }
	public String geth_ANS_DLV_DATE_EXIST_FLG() { return m_h_ANS_DLV_DATE_EXIST_FLG; }
	public String getITEM_NAME_R() { return m_ITEM_NAME_R; }
	public String getl_h_DEPO_TYP() { return m_l_h_DEPO_TYP; }
	public String getPROJECT_CD() { return m_PROJECT_CD; }
	public String getESTIMATE_NO() { return m_ESTIMATE_NO; }
	public String getl_DETAL_NO() { return m_l_DETAL_NO; }
	public String getCUST_NAME() { return m_CUST_NAME; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getCODE() { return m_CODE; }
	public String getSYS_CLASS() { return m_SYS_CLASS; }
	public String getCLASS_CODE() { return m_CLASS_CODE; }
	public String getBUSINESS_OPR_DATE() { return m_BUSINESS_OPR_DATE; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getHOME_CUR_CD() { return m_HOME_CUR_CD; }
	public String getVALUE() { return m_VALUE; }
	public String getNAME() { return m_NAME; }
	public String getPROJECT_NAME() { return m_PROJECT_NAME; }
	public String getCUST_CD() { return m_CUST_CD; }
	public String getPROJECT_STAT() { return m_PROJECT_STAT; }
	public String getDLV_LOC_CD() { return m_DLV_LOC_CD; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getCUR_CD() { return m_CUR_CD; }
	public String getEXCH_TYP() { return m_EXCH_TYP; }
	public String getTAX_APPLY_TYP() { return m_TAX_APPLY_TYP; }
	public String getTAX_CD() { return m_TAX_CD; }
	public String getTAX_CALC_TYP() { return m_TAX_CALC_TYP; }
	public String getPARTIAL_SHIP_INST_FLG() { return m_PARTIAL_SHIP_INST_FLG; }
	public String getCUR_NAME() { return m_CUR_NAME; }
	public String getCUR_UNIT() { return m_CUR_UNIT; }
	public String getDECIMAL_FIG() { return m_DECIMAL_FIG; }
	public String getl_ES_USER_CD() { return m_l_ES_USER_CD; }
	public String getl_ES_ORG_CD() { return m_l_ES_ORG_CD; }
	public String getl_CUST_ITEM_CD() { return m_l_CUST_ITEM_CD; }
	public String getl_ESTIMATE_QTY() { return m_l_ESTIMATE_QTY; }
	public String getl_UNIT_CD() { return m_l_UNIT_CD; }
	public String getl_ESTIMATE_UNIT_PRICE() { return m_l_ESTIMATE_UNIT_PRICE; }
	public String getl_ESTIMATE_AMOUNT() { return m_l_ESTIMATE_AMOUNT; }
	public String getl_ESTIMATE_TYPE() { return m_l_ESTIMATE_TYPE; }
	public String getl_ESTIMATE_ITEM_NAME() { return m_l_ESTIMATE_ITEM_NAME; }
	public String getl_USER_NAME() { return m_l_USER_NAME; }
	public String getl_ORG_NAME() { return m_l_ORG_NAME; }
	public String getDLV_LOC_NAME() { return m_DLV_LOC_NAME; }
	public String getTRANSPORT_LT() { return m_TRANSPORT_LT; }
	public String getTRANSPORT_CD() { return m_TRANSPORT_CD; }
	public String getTRANSPORT_TYP() { return m_TRANSPORT_TYP; }
	public String getDEPO_WH_CD() { return m_DEPO_WH_CD; }
	public String getSHIP_PLANT_CD() { return m_SHIP_PLANT_CD; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getDEPO_TYP() { return m_DEPO_TYP; }
	public String getCUST_ITEM_NAME() { return m_CUST_ITEM_NAME; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getCUST_ITEM_CD() { return m_CUST_ITEM_CD; }
	public String getESTIMATE_TYPE() { return m_ESTIMATE_TYPE; }
	public String getODR_NO() { return m_ODR_NO; }
	public String getDETAL_NO() { return m_DETAL_NO; }
	public String getl_ODR_NO() { return m_l_ODR_NO; }
	public String getl_ODR_TYP() { return m_l_ODR_TYP; }
	public String getl_CUST_ODR_NO() { return m_l_CUST_ODR_NO; }
	public String getl_ITEM_CD() { return m_l_ITEM_CD; }
	public String getl_DESINATED_DLV_DATE() { return m_l_DESINATED_DLV_DATE; }
	public String getl_ODR_QTY() { return m_l_ODR_QTY; }
	public String getl_ODR_AMOUNT() { return m_l_ODR_AMOUNT; }
	public String getl_ODR_AMOUNT_EXCH_RATES() { return m_l_ODR_AMOUNT_EXCH_RATES; }
	public String getl_DLV_LOC_CD() { return m_l_DLV_LOC_CD; }
	public String getl_DEPO_TYP() { return m_l_DEPO_TYP; }
	public String getl_ODR_ACPT_DATE() { return m_l_ODR_ACPT_DATE; }
	public String getl_REMARKS() { return m_l_REMARKS; }
	public String getl_OWN_PERSON_CD() { return m_l_OWN_PERSON_CD; }
	public String getl_TODR_MODIFY_COUNT() { return m_l_TODR_MODIFY_COUNT; }
	public String getl_CUST_CHRG_PSN_NAME() { return m_l_CUST_CHRG_PSN_NAME; }
	public String getl_OWN_ORG_CD() { return m_l_OWN_ORG_CD; }
	public String getl_CUST_CHRG_ORG_NAME() { return m_l_CUST_CHRG_ORG_NAME; }
	public String getODR_TYP() { return m_ODR_TYP; }
	public String getODR_CTL_NO() { return m_ODR_CTL_NO; }
	public String getCUST_ODR_NO() { return m_CUST_ODR_NO; }
	public String getCUST_CHRG_ORG_CD() { return m_CUST_CHRG_ORG_CD; }
	public String getCUST_CHRG_PSN_CD() { return m_CUST_CHRG_PSN_CD; }
	public String getODR_ACPT_PSN_CD() { return m_ODR_ACPT_PSN_CD; }
	public String getCURRNCY_CD() { return m_CURRNCY_CD; }
	public String getDLV_LOC_NAME_KANJI() { return m_DLV_LOC_NAME_KANJI; }
	public String getODR_UNIT_PRICE() { return m_ODR_UNIT_PRICE; }
	public String getSPCL_PRICE_TYP() { return m_SPCL_PRICE_TYP; }
	public String getDESINATED_DLV_DATE() { return m_DESINATED_DLV_DATE; }
	public String getSTD_DESINATED_RCV_DATE() { return m_STD_DESINATED_RCV_DATE; }
	public String getODR_QTY() { return m_ODR_QTY; }
	public String getREMAIN_UNCONFIRM_ODR_QTY() { return m_REMAIN_UNCONFIRM_ODR_QTY; }
	public String getCANCELED_UNCONFIRM_ODR_QTY() { return m_CANCELED_UNCONFIRM_ODR_QTY; }
	public String getUNIT_CD() { return m_UNIT_CD; }
	public String getUNCONFIRM_ODR_BALANCE() { return m_UNCONFIRM_ODR_BALANCE; }
	public String getODR_AMOUNT() { return m_ODR_AMOUNT; }
	public String getODR_AMOUNT_EXCH_RATES() { return m_ODR_AMOUNT_EXCH_RATES; }
	public String getODR_CMPLT_FLG() { return m_ODR_CMPLT_FLG; }
	public String getPART_NAME() { return m_PART_NAME; }
	public String getREMARKS() { return m_REMARKS; }
	public String getODR_ACPT_DATE() { return m_ODR_ACPT_DATE; }
	public String getSHIP_PLAN_REMAIN_QTY() { return m_SHIP_PLAN_REMAIN_QTY; }
	public String getSHIP_PLAN_CMPLT_FLG() { return m_SHIP_PLAN_CMPLT_FLG; }
	public String getUNCONFIRMED_ODR_EFF_OVR_FLG() { return m_UNCONFIRMED_ODR_EFF_OVR_FLG; }
	public String getENTRY_TYP() { return m_ENTRY_TYP; }
	public String getDEL_FLG() { return m_DEL_FLG; }
	public String getJOB_ODR_SET_FLG() { return m_JOB_ODR_SET_FLG; }
	public String getSLIP_CD() { return m_SLIP_CD; }
	public String getORGN_ODR_NO() { return m_ORGN_ODR_NO; }
	public String getADD_ODR_FLG() { return m_ADD_ODR_FLG; }
	public String getODR_CMPLT_DATE() { return m_ODR_CMPLT_DATE; }
	public String getODR_ACPT_ORG_CD() { return m_ODR_ACPT_ORG_CD; }
	public String getESTIMATE_STAT() { return m_ESTIMATE_STAT; }
	public String getES_ORG_CD() { return m_ES_ORG_CD; }
	public String getES_USER_CD() { return m_ES_USER_CD; }
	public String getESTIMATE_QTY() { return m_ESTIMATE_QTY; }
	public String getESTIMATE_UNIT_PRICE() { return m_ESTIMATE_UNIT_PRICE; }
	public String getESTIMATE_AMOUNT() { return m_ESTIMATE_AMOUNT; }
	public String getODR_FLG() { return m_ODR_FLG; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getCAL_NO() { return m_CAL_NO; }
	public String getJOB_ODR_DLV_DATE() { return m_JOB_ODR_DLV_DATE; }
	public String getRSLT_CTL_SEQ_CD() { return m_RSLT_CTL_SEQ_CD; }
	public String getUNIT() { return m_UNIT; }
	public String getDLV_PLACE_CD() { return m_DLV_PLACE_CD; }
	public String getUNIT_PRICE() { return m_UNIT_PRICE; }
	public String getSPCL_PRICE_CO() { return m_SPCL_PRICE_CO; }
	public String getCUST_DLV_CD() { return m_CUST_DLV_CD; }
	public String getCUST_DLV_KEY_CD() { return m_CUST_DLV_KEY_CD; }
	public String getIF_CTL_NO() { return m_IF_CTL_NO; }
	public String getODR_SEQ() { return m_ODR_SEQ; }
	public String getPART_DLV_SEQ_NO() { return m_PART_DLV_SEQ_NO; }
	public String getLAST_ANS_DLV_DATE_RCD() { return m_LAST_ANS_DLV_DATE_RCD; }
	public String getDESINATED_SHIP_DATE() { return m_DESINATED_SHIP_DATE; }
	public String getDESINATED_SHIP_QTY() { return m_DESINATED_SHIP_QTY; }
	public String getREST_SHIP_ODR_QTY() { return m_REST_SHIP_ODR_QTY; }
	public String getSHIP_ODR_CMPLT_FLG() { return m_SHIP_ODR_CMPLT_FLG; }
	public String getJOB_ODR_CANCEL_NO() { return m_JOB_ODR_CANCEL_NO; }
	public String getJOB_ODR_TYP() { return m_JOB_ODR_TYP; }
	public String getPLAN_TYP() { return m_PLAN_TYP; }
	public String getJOB_ODR_QTY() { return m_JOB_ODR_QTY; }
	public String getALC_GRP_CD() { return m_ALC_GRP_CD; }
	public String getJOB_ODR_STS_TYP() { return m_JOB_ODR_STS_TYP; }
	public String getJOB_ODR_EXP_TYP() { return m_JOB_ODR_EXP_TYP; }
	public String getJOB_ODR_DEL_FLG() { return m_JOB_ODR_DEL_FLG; }
	public String getALCD_QTY() { return m_ALCD_QTY; }
	public String getCUS_DLV_CD() { return m_CUS_DLV_CD; }
	public String getCUS_DLV_KEY_CD() { return m_CUS_DLV_KEY_CD; }
	public String getUNOFFICIAL_RECEIPT_FLAG() { return m_UNOFFICIAL_RECEIPT_FLAG; }
	public String getJOB_OD_CD_PREFIX() { return m_JOB_OD_CD_PREFIX; }
	public String getCTL_SEQ_CD() { return m_CTL_SEQ_CD; }
	public String getNEW_OLD_FLG() { return m_NEW_OLD_FLG; }
	public String getTRAN_TYPE() { return m_TRAN_TYPE; }
	public String getEXCH_RATE() { return m_EXCH_RATE; }
	public String getORG_NAME() { return m_ORG_NAME; }
	public String getORG_CD() { return m_ORG_CD; }
	public String getUSER_NAME() { return m_USER_NAME; }
	public String getUSER_CD() { return m_USER_CD; }
	public String getUNIT_QTY_TYP() { return m_UNIT_QTY_TYP; }
	public String getl_h_ANS_DLV_DATE_EXIST_FLG() { return m_l_h_ANS_DLV_DATE_EXIST_FLG; }
	public String getFIELD_VALUE() { return m_FIELD_VALUE; }

	public List getList_rdoSHIP_INST() { return l_rdoSHIP_INST; }
	public List getList_rdoSHIP_UPDATE() { return l_rdoSHIP_UPDATE; }
	public List getList_l_CUR_UNIT() { return l_l_CUR_UNIT; }
	public List getList_DETAIL_NO() { return l_DETAIL_NO; }
	public List getList_ACPT_ODR_CD() { return l_ACPT_ODR_CD; }
	public List getList_c_DOODR() { return l_c_DOODR; }
	public List getList_PREPARE_QTY() { return l_PREPARE_QTY; }
	public List getList_c_INPUTODRCD() { return l_c_INPUTODRCD; }
	public List getList_QTY() { return l_QTY; }
	public List getList_QTY_UNIT() { return l_QTY_UNIT; }
	public List getList_ODR_PRICE_UNIT() { return l_ODR_PRICE_UNIT; }
	public List getList_ISSUE_INST_COMMENT() { return l_ISSUE_INST_COMMENT; }
	public List getList_APPROVED_COMMENT() { return l_APPROVED_COMMENT; }
	public List getList_CUST_CHRG_PSN_NAME() { return l_CUST_CHRG_PSN_NAME; }
	public List getList_ES_ORG_NAME() { return l_ES_ORG_NAME; }
	public List getList_l_DLV_LOC_NAME() { return l_l_DLV_LOC_NAME; }
	public List getList_l_CUST_ITEM_NAME() { return l_l_CUST_ITEM_NAME; }
	public List getList_l_ITEM_NAME() { return l_l_ITEM_NAME; }
	public List getList_l_JOB_ODR_DLV_DATE() { return l_l_JOB_ODR_DLV_DATE; }
	public List getList_l_ALC_GRP_CD() { return l_l_ALC_GRP_CD; }
	public List getList_l_JOB_ODR_CD() { return l_l_JOB_ODR_CD; }
	public List getList_l_APPR_REMARKS() { return l_l_APPR_REMARKS; }
	public List getList_h_UPDATE_FLG() { return l_h_UPDATE_FLG; }
	public List getList_l_TEST_MODIFY_COUNT() { return l_l_TEST_MODIFY_COUNT; }
	public List getList_l_TPJ_MODIFY_COUNT() { return l_l_TPJ_MODIFY_COUNT; }
	public List getList_l_h_ESTIMATE_TYPE() { return l_l_h_ESTIMATE_TYPE; }
	public List getList_h_ESTIMATE_TYPE() { return l_h_ESTIMATE_TYPE; }
	public List getList_l_h_PREC_ARRANGE_FLG() { return l_l_h_PREC_ARRANGE_FLG; }
	public List getList_l_c_DOODR() { return l_l_c_DOODR; }
	public List getList_l_c_INPUTODRCD() { return l_l_c_INPUTODRCD; }
	public List getList_h_PREC_ARRANGE_FLG() { return l_h_PREC_ARRANGE_FLG; }
	public List getList_l_h_ODR_TYP() { return l_l_h_ODR_TYP; }
	public List getList_h_ODR_TYP() { return l_h_ODR_TYP; }
	public List getList_h_ODR_TYP3() { return l_h_ODR_TYP3; }
	public List getList_h_APR_ODR() { return l_h_APR_ODR; }
	public List getList_h_PRD_REQ_JOB_ODR_TYP_1() { return l_h_PRD_REQ_JOB_ODR_TYP_1; }
	public List getList_h_PRD_REQ_JOB_ODR_TYP_2() { return l_h_PRD_REQ_JOB_ODR_TYP_2; }
	public List getList_h_DLV_LOC_CD() { return l_h_DLV_LOC_CD; }
	public List getList_h_ANS_DLV_DATE_EXIST_FLG() { return l_h_ANS_DLV_DATE_EXIST_FLG; }
	public List getList_ITEM_NAME_R() { return l_ITEM_NAME_R; }
	public List getList_l_h_DEPO_TYP() { return l_l_h_DEPO_TYP; }
	public List getList_PROJECT_CD() { return l_PROJECT_CD; }
	public List getList_ESTIMATE_NO() { return l_ESTIMATE_NO; }
	public List getList_l_DETAL_NO() { return l_l_DETAL_NO; }
	public List getList_CUST_NAME() { return l_CUST_NAME; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_CODE() { return l_CODE; }
	public List getList_SYS_CLASS() { return l_SYS_CLASS; }
	public List getList_CLASS_CODE() { return l_CLASS_CODE; }
	public List getList_BUSINESS_OPR_DATE() { return l_BUSINESS_OPR_DATE; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_HOME_CUR_CD() { return l_HOME_CUR_CD; }
	public List getList_VALUE() { return l_VALUE; }
	public List getList_NAME() { return l_NAME; }
	public List getList_PROJECT_NAME() { return l_PROJECT_NAME; }
	public List getList_CUST_CD() { return l_CUST_CD; }
	public List getList_PROJECT_STAT() { return l_PROJECT_STAT; }
	public List getList_DLV_LOC_CD() { return l_DLV_LOC_CD; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_CUR_CD() { return l_CUR_CD; }
	public List getList_EXCH_TYP() { return l_EXCH_TYP; }
	public List getList_TAX_APPLY_TYP() { return l_TAX_APPLY_TYP; }
	public List getList_TAX_CD() { return l_TAX_CD; }
	public List getList_TAX_CALC_TYP() { return l_TAX_CALC_TYP; }
	public List getList_PARTIAL_SHIP_INST_FLG() { return l_PARTIAL_SHIP_INST_FLG; }
	public List getList_CUR_NAME() { return l_CUR_NAME; }
	public List getList_CUR_UNIT() { return l_CUR_UNIT; }
	public List getList_DECIMAL_FIG() { return l_DECIMAL_FIG; }
	public List getList_l_ES_USER_CD() { return l_l_ES_USER_CD; }
	public List getList_l_ES_ORG_CD() { return l_l_ES_ORG_CD; }
	public List getList_l_CUST_ITEM_CD() { return l_l_CUST_ITEM_CD; }
	public List getList_l_ESTIMATE_QTY() { return l_l_ESTIMATE_QTY; }
	public List getList_l_UNIT_CD() { return l_l_UNIT_CD; }
	public List getList_l_ESTIMATE_UNIT_PRICE() { return l_l_ESTIMATE_UNIT_PRICE; }
	public List getList_l_ESTIMATE_AMOUNT() { return l_l_ESTIMATE_AMOUNT; }
	public List getList_l_ESTIMATE_TYPE() { return l_l_ESTIMATE_TYPE; }
	public List getList_l_ESTIMATE_ITEM_NAME() { return l_l_ESTIMATE_ITEM_NAME; }
	public List getList_l_USER_NAME() { return l_l_USER_NAME; }
	public List getList_l_ORG_NAME() { return l_l_ORG_NAME; }
	public List getList_DLV_LOC_NAME() { return l_DLV_LOC_NAME; }
	public List getList_TRANSPORT_LT() { return l_TRANSPORT_LT; }
	public List getList_TRANSPORT_CD() { return l_TRANSPORT_CD; }
	public List getList_TRANSPORT_TYP() { return l_TRANSPORT_TYP; }
	public List getList_DEPO_WH_CD() { return l_DEPO_WH_CD; }
	public List getList_SHIP_PLANT_CD() { return l_SHIP_PLANT_CD; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_DEPO_TYP() { return l_DEPO_TYP; }
	public List getList_CUST_ITEM_NAME() { return l_CUST_ITEM_NAME; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_CUST_ITEM_CD() { return l_CUST_ITEM_CD; }
	public List getList_ESTIMATE_TYPE() { return l_ESTIMATE_TYPE; }
	public List getList_ODR_NO() { return l_ODR_NO; }
	public List getList_DETAL_NO() { return l_DETAL_NO; }
	public List getList_l_ODR_NO() { return l_l_ODR_NO; }
	public List getList_l_ODR_TYP() { return l_l_ODR_TYP; }
	public List getList_l_CUST_ODR_NO() { return l_l_CUST_ODR_NO; }
	public List getList_l_ITEM_CD() { return l_l_ITEM_CD; }
	public List getList_l_DESINATED_DLV_DATE() { return l_l_DESINATED_DLV_DATE; }
	public List getList_l_ODR_QTY() { return l_l_ODR_QTY; }
	public List getList_l_ODR_AMOUNT() { return l_l_ODR_AMOUNT; }
	public List getList_l_ODR_AMOUNT_EXCH_RATES() { return l_l_ODR_AMOUNT_EXCH_RATES; }
	public List getList_l_DLV_LOC_CD() { return l_l_DLV_LOC_CD; }
	public List getList_l_DEPO_TYP() { return l_l_DEPO_TYP; }
	public List getList_l_ODR_ACPT_DATE() { return l_l_ODR_ACPT_DATE; }
	public List getList_l_REMARKS() { return l_l_REMARKS; }
	public List getList_l_OWN_PERSON_CD() { return l_l_OWN_PERSON_CD; }
	public List getList_l_TODR_MODIFY_COUNT() { return l_l_TODR_MODIFY_COUNT; }
	public List getList_l_CUST_CHRG_PSN_NAME() { return l_l_CUST_CHRG_PSN_NAME; }
	public List getList_l_OWN_ORG_CD() { return l_l_OWN_ORG_CD; }
	public List getList_l_CUST_CHRG_ORG_NAME() { return l_l_CUST_CHRG_ORG_NAME; }
	public List getList_ODR_TYP() { return l_ODR_TYP; }
	public List getList_ODR_CTL_NO() { return l_ODR_CTL_NO; }
	public List getList_CUST_ODR_NO() { return l_CUST_ODR_NO; }
	public List getList_CUST_CHRG_ORG_CD() { return l_CUST_CHRG_ORG_CD; }
	public List getList_CUST_CHRG_PSN_CD() { return l_CUST_CHRG_PSN_CD; }
	public List getList_ODR_ACPT_PSN_CD() { return l_ODR_ACPT_PSN_CD; }
	public List getList_CURRNCY_CD() { return l_CURRNCY_CD; }
	public List getList_DLV_LOC_NAME_KANJI() { return l_DLV_LOC_NAME_KANJI; }
	public List getList_ODR_UNIT_PRICE() { return l_ODR_UNIT_PRICE; }
	public List getList_SPCL_PRICE_TYP() { return l_SPCL_PRICE_TYP; }
	public List getList_DESINATED_DLV_DATE() { return l_DESINATED_DLV_DATE; }
	public List getList_STD_DESINATED_RCV_DATE() { return l_STD_DESINATED_RCV_DATE; }
	public List getList_ODR_QTY() { return l_ODR_QTY; }
	public List getList_REMAIN_UNCONFIRM_ODR_QTY() { return l_REMAIN_UNCONFIRM_ODR_QTY; }
	public List getList_CANCELED_UNCONFIRM_ODR_QTY() { return l_CANCELED_UNCONFIRM_ODR_QTY; }
	public List getList_UNIT_CD() { return l_UNIT_CD; }
	public List getList_UNCONFIRM_ODR_BALANCE() { return l_UNCONFIRM_ODR_BALANCE; }
	public List getList_ODR_AMOUNT() { return l_ODR_AMOUNT; }
	public List getList_ODR_AMOUNT_EXCH_RATES() { return l_ODR_AMOUNT_EXCH_RATES; }
	public List getList_ODR_CMPLT_FLG() { return l_ODR_CMPLT_FLG; }
	public List getList_PART_NAME() { return l_PART_NAME; }
	public List getList_REMARKS() { return l_REMARKS; }
	public List getList_ODR_ACPT_DATE() { return l_ODR_ACPT_DATE; }
	public List getList_SHIP_PLAN_REMAIN_QTY() { return l_SHIP_PLAN_REMAIN_QTY; }
	public List getList_SHIP_PLAN_CMPLT_FLG() { return l_SHIP_PLAN_CMPLT_FLG; }
	public List getList_UNCONFIRMED_ODR_EFF_OVR_FLG() { return l_UNCONFIRMED_ODR_EFF_OVR_FLG; }
	public List getList_ENTRY_TYP() { return l_ENTRY_TYP; }
	public List getList_DEL_FLG() { return l_DEL_FLG; }
	public List getList_JOB_ODR_SET_FLG() { return l_JOB_ODR_SET_FLG; }
	public List getList_SLIP_CD() { return l_SLIP_CD; }
	public List getList_ORGN_ODR_NO() { return l_ORGN_ODR_NO; }
	public List getList_ADD_ODR_FLG() { return l_ADD_ODR_FLG; }
	public List getList_ODR_CMPLT_DATE() { return l_ODR_CMPLT_DATE; }
	public List getList_ODR_ACPT_ORG_CD() { return l_ODR_ACPT_ORG_CD; }
	public List getList_ESTIMATE_STAT() { return l_ESTIMATE_STAT; }
	public List getList_ES_ORG_CD() { return l_ES_ORG_CD; }
	public List getList_ES_USER_CD() { return l_ES_USER_CD; }
	public List getList_ESTIMATE_QTY() { return l_ESTIMATE_QTY; }
	public List getList_ESTIMATE_UNIT_PRICE() { return l_ESTIMATE_UNIT_PRICE; }
	public List getList_ESTIMATE_AMOUNT() { return l_ESTIMATE_AMOUNT; }
	public List getList_ODR_FLG() { return l_ODR_FLG; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_CAL_NO() { return l_CAL_NO; }
	public List getList_JOB_ODR_DLV_DATE() { return l_JOB_ODR_DLV_DATE; }
	public List getList_RSLT_CTL_SEQ_CD() { return l_RSLT_CTL_SEQ_CD; }
	public List getList_UNIT() { return l_UNIT; }
	public List getList_DLV_PLACE_CD() { return l_DLV_PLACE_CD; }
	public List getList_UNIT_PRICE() { return l_UNIT_PRICE; }
	public List getList_SPCL_PRICE_CO() { return l_SPCL_PRICE_CO; }
	public List getList_CUST_DLV_CD() { return l_CUST_DLV_CD; }
	public List getList_CUST_DLV_KEY_CD() { return l_CUST_DLV_KEY_CD; }
	public List getList_IF_CTL_NO() { return l_IF_CTL_NO; }
	public List getList_ODR_SEQ() { return l_ODR_SEQ; }
	public List getList_PART_DLV_SEQ_NO() { return l_PART_DLV_SEQ_NO; }
	public List getList_LAST_ANS_DLV_DATE_RCD() { return l_LAST_ANS_DLV_DATE_RCD; }
	public List getList_DESINATED_SHIP_DATE() { return l_DESINATED_SHIP_DATE; }
	public List getList_DESINATED_SHIP_QTY() { return l_DESINATED_SHIP_QTY; }
	public List getList_REST_SHIP_ODR_QTY() { return l_REST_SHIP_ODR_QTY; }
	public List getList_SHIP_ODR_CMPLT_FLG() { return l_SHIP_ODR_CMPLT_FLG; }
	public List getList_JOB_ODR_CANCEL_NO() { return l_JOB_ODR_CANCEL_NO; }
	public List getList_JOB_ODR_TYP() { return l_JOB_ODR_TYP; }
	public List getList_PLAN_TYP() { return l_PLAN_TYP; }
	public List getList_JOB_ODR_QTY() { return l_JOB_ODR_QTY; }
	public List getList_ALC_GRP_CD() { return l_ALC_GRP_CD; }
	public List getList_JOB_ODR_STS_TYP() { return l_JOB_ODR_STS_TYP; }
	public List getList_JOB_ODR_EXP_TYP() { return l_JOB_ODR_EXP_TYP; }
	public List getList_JOB_ODR_DEL_FLG() { return l_JOB_ODR_DEL_FLG; }
	public List getList_ALCD_QTY() { return l_ALCD_QTY; }
	public List getList_CUS_DLV_CD() { return l_CUS_DLV_CD; }
	public List getList_CUS_DLV_KEY_CD() { return l_CUS_DLV_KEY_CD; }
	public List getList_UNOFFICIAL_RECEIPT_FLAG() { return l_UNOFFICIAL_RECEIPT_FLAG; }
	public List getList_JOB_OD_CD_PREFIX() { return l_JOB_OD_CD_PREFIX; }
	public List getList_CTL_SEQ_CD() { return l_CTL_SEQ_CD; }
	public List getList_NEW_OLD_FLG() { return l_NEW_OLD_FLG; }
	public List getList_TRAN_TYPE() { return l_TRAN_TYPE; }
	public List getList_EXCH_RATE() { return l_EXCH_RATE; }
	public List getList_ORG_NAME() { return l_ORG_NAME; }
	public List getList_ORG_CD() { return l_ORG_CD; }
	public List getList_USER_NAME() { return l_USER_NAME; }
	public List getList_USER_CD() { return l_USER_CD; }
	public List getList_UNIT_QTY_TYP() { return l_UNIT_QTY_TYP; }
	public List getList_l_h_ANS_DLV_DATE_EXIST_FLG() { return l_l_h_ANS_DLV_DATE_EXIST_FLG; }
	public List getList_FIELD_VALUE() { return l_FIELD_VALUE; }

	public void setrdoSHIP_INST(String val) { m_rdoSHIP_INST = val; }
	public void setrdoSHIP_UPDATE(String val) { m_rdoSHIP_UPDATE = val; }
	public void setl_CUR_UNIT(String val) { m_l_CUR_UNIT = val; }
	public void setDETAIL_NO(String val) { m_DETAIL_NO = val; }
	public void setACPT_ODR_CD(String val) { m_ACPT_ODR_CD = val; }
	public void setc_DOODR(String val) { m_c_DOODR = val; }
	public void setPREPARE_QTY(String val) { m_PREPARE_QTY = val; }
	public void setc_INPUTODRCD(String val) { m_c_INPUTODRCD = val; }
	public void setQTY(String val) { m_QTY = val; }
	public void setQTY_UNIT(String val) { m_QTY_UNIT = val; }
	public void setODR_PRICE_UNIT(String val) { m_ODR_PRICE_UNIT = val; }
	public void setISSUE_INST_COMMENT(String val) { m_ISSUE_INST_COMMENT = val; }
	public void setAPPROVED_COMMENT(String val) { m_APPROVED_COMMENT = val; }
	public void setCUST_CHRG_PSN_NAME(String val) { m_CUST_CHRG_PSN_NAME = val; }
	public void setES_ORG_NAME(String val) { m_ES_ORG_NAME = val; }
	public void setl_DLV_LOC_NAME(String val) { m_l_DLV_LOC_NAME = val; }
	public void setl_CUST_ITEM_NAME(String val) { m_l_CUST_ITEM_NAME = val; }
	public void setl_ITEM_NAME(String val) { m_l_ITEM_NAME = val; }
	public void setl_JOB_ODR_DLV_DATE(String val) { m_l_JOB_ODR_DLV_DATE = val; }
	public void setl_ALC_GRP_CD(String val) { m_l_ALC_GRP_CD = val; }
	public void setl_JOB_ODR_CD(String val) { m_l_JOB_ODR_CD = val; }
	public void setl_APPR_REMARKS(String val) { m_l_APPR_REMARKS = val; }
	public void seth_UPDATE_FLG(String val) { m_h_UPDATE_FLG = val; }
	public void setl_TEST_MODIFY_COUNT(String val) { m_l_TEST_MODIFY_COUNT = val; }
	public void setl_TPJ_MODIFY_COUNT(String val) { m_l_TPJ_MODIFY_COUNT = val; }
	public void setl_h_ESTIMATE_TYPE(String val) { m_l_h_ESTIMATE_TYPE = val; }
	public void seth_ESTIMATE_TYPE(String val) { m_h_ESTIMATE_TYPE = val; }
	public void setl_h_PREC_ARRANGE_FLG(String val) { m_l_h_PREC_ARRANGE_FLG = val; }
	public void setl_c_DOODR(String val) { m_l_c_DOODR = val; }
	public void setl_c_INPUTODRCD(String val) { m_l_c_INPUTODRCD = val; }
	public void seth_PREC_ARRANGE_FLG(String val) { m_h_PREC_ARRANGE_FLG = val; }
	public void setl_h_ODR_TYP(String val) { m_l_h_ODR_TYP = val; }
	public void seth_ODR_TYP(String val) { m_h_ODR_TYP = val; }
	public void seth_ODR_TYP3(String val) { m_h_ODR_TYP3 = val; }
	public void seth_APR_ODR(String val) { m_h_APR_ODR = val; }
	public void seth_PRD_REQ_JOB_ODR_TYP_1(String val) { m_h_PRD_REQ_JOB_ODR_TYP_1 = val; }
	public void seth_PRD_REQ_JOB_ODR_TYP_2(String val) { m_h_PRD_REQ_JOB_ODR_TYP_2 = val; }
	public void seth_DLV_LOC_CD(String val) { m_h_DLV_LOC_CD = val; }
	public void seth_ANS_DLV_DATE_EXIST_FLG(String val) { m_h_ANS_DLV_DATE_EXIST_FLG = val; }
	public void setITEM_NAME_R(String val) { m_ITEM_NAME_R = val; }
	public void setl_h_DEPO_TYP(String val) { m_l_h_DEPO_TYP = val; }
	public void setPROJECT_CD(String val) { m_PROJECT_CD = val; }
	public void setESTIMATE_NO(String val) { m_ESTIMATE_NO = val; }
	public void setl_DETAL_NO(String val) { m_l_DETAL_NO = val; }
	public void setCUST_NAME(String val) { m_CUST_NAME = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setCODE(String val) { m_CODE = val; }
	public void setSYS_CLASS(String val) { m_SYS_CLASS = val; }
	public void setCLASS_CODE(String val) { m_CLASS_CODE = val; }
	public void setBUSINESS_OPR_DATE(String val) { m_BUSINESS_OPR_DATE = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setHOME_CUR_CD(String val) { m_HOME_CUR_CD = val; }
	public void setVALUE(String val) { m_VALUE = val; }
	public void setNAME(String val) { m_NAME = val; }
	public void setPROJECT_NAME(String val) { m_PROJECT_NAME = val; }
	public void setCUST_CD(String val) { m_CUST_CD = val; }
	public void setPROJECT_STAT(String val) { m_PROJECT_STAT = val; }
	public void setDLV_LOC_CD(String val) { m_DLV_LOC_CD = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setCUR_CD(String val) { m_CUR_CD = val; }
	public void setEXCH_TYP(String val) { m_EXCH_TYP = val; }
	public void setTAX_APPLY_TYP(String val) { m_TAX_APPLY_TYP = val; }
	public void setTAX_CD(String val) { m_TAX_CD = val; }
	public void setTAX_CALC_TYP(String val) { m_TAX_CALC_TYP = val; }
	public void setPARTIAL_SHIP_INST_FLG(String val) { m_PARTIAL_SHIP_INST_FLG = val; }
	public void setCUR_NAME(String val) { m_CUR_NAME = val; }
	public void setCUR_UNIT(String val) { m_CUR_UNIT = val; }
	public void setDECIMAL_FIG(String val) { m_DECIMAL_FIG = val; }
	public void setl_ES_USER_CD(String val) { m_l_ES_USER_CD = val; }
	public void setl_ES_ORG_CD(String val) { m_l_ES_ORG_CD = val; }
	public void setl_CUST_ITEM_CD(String val) { m_l_CUST_ITEM_CD = val; }
	public void setl_ESTIMATE_QTY(String val) { m_l_ESTIMATE_QTY = val; }
	public void setl_UNIT_CD(String val) { m_l_UNIT_CD = val; }
	public void setl_ESTIMATE_UNIT_PRICE(String val) { m_l_ESTIMATE_UNIT_PRICE = val; }
	public void setl_ESTIMATE_AMOUNT(String val) { m_l_ESTIMATE_AMOUNT = val; }
	public void setl_ESTIMATE_TYPE(String val) { m_l_ESTIMATE_TYPE = val; }
	public void setl_ESTIMATE_ITEM_NAME(String val) { m_l_ESTIMATE_ITEM_NAME = val; }
	public void setl_USER_NAME(String val) { m_l_USER_NAME = val; }
	public void setl_ORG_NAME(String val) { m_l_ORG_NAME = val; }
	public void setDLV_LOC_NAME(String val) { m_DLV_LOC_NAME = val; }
	public void setTRANSPORT_LT(String val) { m_TRANSPORT_LT = val; }
	public void setTRANSPORT_CD(String val) { m_TRANSPORT_CD = val; }
	public void setTRANSPORT_TYP(String val) { m_TRANSPORT_TYP = val; }
	public void setDEPO_WH_CD(String val) { m_DEPO_WH_CD = val; }
	public void setSHIP_PLANT_CD(String val) { m_SHIP_PLANT_CD = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setDEPO_TYP(String val) { m_DEPO_TYP = val; }
	public void setCUST_ITEM_NAME(String val) { m_CUST_ITEM_NAME = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setCUST_ITEM_CD(String val) { m_CUST_ITEM_CD = val; }
	public void setESTIMATE_TYPE(String val) { m_ESTIMATE_TYPE = val; }
	public void setODR_NO(String val) { m_ODR_NO = val; }
	public void setDETAL_NO(String val) { m_DETAL_NO = val; }
	public void setl_ODR_NO(String val) { m_l_ODR_NO = val; }
	public void setl_ODR_TYP(String val) { m_l_ODR_TYP = val; }
	public void setl_CUST_ODR_NO(String val) { m_l_CUST_ODR_NO = val; }
	public void setl_ITEM_CD(String val) { m_l_ITEM_CD = val; }
	public void setl_DESINATED_DLV_DATE(String val) { m_l_DESINATED_DLV_DATE = val; }
	public void setl_ODR_QTY(String val) { m_l_ODR_QTY = val; }
	public void setl_ODR_AMOUNT(String val) { m_l_ODR_AMOUNT = val; }
	public void setl_ODR_AMOUNT_EXCH_RATES(String val) { m_l_ODR_AMOUNT_EXCH_RATES = val; }
	public void setl_DLV_LOC_CD(String val) { m_l_DLV_LOC_CD = val; }
	public void setl_DEPO_TYP(String val) { m_l_DEPO_TYP = val; }
	public void setl_ODR_ACPT_DATE(String val) { m_l_ODR_ACPT_DATE = val; }
	public void setl_REMARKS(String val) { m_l_REMARKS = val; }
	public void setl_OWN_PERSON_CD(String val) { m_l_OWN_PERSON_CD = val; }
	public void setl_TODR_MODIFY_COUNT(String val) { m_l_TODR_MODIFY_COUNT = val; }
	public void setl_CUST_CHRG_PSN_NAME(String val) { m_l_CUST_CHRG_PSN_NAME = val; }
	public void setl_OWN_ORG_CD(String val) { m_l_OWN_ORG_CD = val; }
	public void setl_CUST_CHRG_ORG_NAME(String val) { m_l_CUST_CHRG_ORG_NAME = val; }
	public void setODR_TYP(String val) { m_ODR_TYP = val; }
	public void setODR_CTL_NO(String val) { m_ODR_CTL_NO = val; }
	public void setCUST_ODR_NO(String val) { m_CUST_ODR_NO = val; }
	public void setCUST_CHRG_ORG_CD(String val) { m_CUST_CHRG_ORG_CD = val; }
	public void setCUST_CHRG_PSN_CD(String val) { m_CUST_CHRG_PSN_CD = val; }
	public void setODR_ACPT_PSN_CD(String val) { m_ODR_ACPT_PSN_CD = val; }
	public void setCURRNCY_CD(String val) { m_CURRNCY_CD = val; }
	public void setDLV_LOC_NAME_KANJI(String val) { m_DLV_LOC_NAME_KANJI = val; }
	public void setODR_UNIT_PRICE(String val) { m_ODR_UNIT_PRICE = val; }
	public void setSPCL_PRICE_TYP(String val) { m_SPCL_PRICE_TYP = val; }
	public void setDESINATED_DLV_DATE(String val) { m_DESINATED_DLV_DATE = val; }
	public void setSTD_DESINATED_RCV_DATE(String val) { m_STD_DESINATED_RCV_DATE = val; }
	public void setODR_QTY(String val) { m_ODR_QTY = val; }
	public void setREMAIN_UNCONFIRM_ODR_QTY(String val) { m_REMAIN_UNCONFIRM_ODR_QTY = val; }
	public void setCANCELED_UNCONFIRM_ODR_QTY(String val) { m_CANCELED_UNCONFIRM_ODR_QTY = val; }
	public void setUNIT_CD(String val) { m_UNIT_CD = val; }
	public void setUNCONFIRM_ODR_BALANCE(String val) { m_UNCONFIRM_ODR_BALANCE = val; }
	public void setODR_AMOUNT(String val) { m_ODR_AMOUNT = val; }
	public void setODR_AMOUNT_EXCH_RATES(String val) { m_ODR_AMOUNT_EXCH_RATES = val; }
	public void setODR_CMPLT_FLG(String val) { m_ODR_CMPLT_FLG = val; }
	public void setPART_NAME(String val) { m_PART_NAME = val; }
	public void setREMARKS(String val) { m_REMARKS = val; }
	public void setODR_ACPT_DATE(String val) { m_ODR_ACPT_DATE = val; }
	public void setSHIP_PLAN_REMAIN_QTY(String val) { m_SHIP_PLAN_REMAIN_QTY = val; }
	public void setSHIP_PLAN_CMPLT_FLG(String val) { m_SHIP_PLAN_CMPLT_FLG = val; }
	public void setUNCONFIRMED_ODR_EFF_OVR_FLG(String val) { m_UNCONFIRMED_ODR_EFF_OVR_FLG = val; }
	public void setENTRY_TYP(String val) { m_ENTRY_TYP = val; }
	public void setDEL_FLG(String val) { m_DEL_FLG = val; }
	public void setJOB_ODR_SET_FLG(String val) { m_JOB_ODR_SET_FLG = val; }
	public void setSLIP_CD(String val) { m_SLIP_CD = val; }
	public void setORGN_ODR_NO(String val) { m_ORGN_ODR_NO = val; }
	public void setADD_ODR_FLG(String val) { m_ADD_ODR_FLG = val; }
	public void setODR_CMPLT_DATE(String val) { m_ODR_CMPLT_DATE = val; }
	public void setODR_ACPT_ORG_CD(String val) { m_ODR_ACPT_ORG_CD = val; }
	public void setESTIMATE_STAT(String val) { m_ESTIMATE_STAT = val; }
	public void setES_ORG_CD(String val) { m_ES_ORG_CD = val; }
	public void setES_USER_CD(String val) { m_ES_USER_CD = val; }
	public void setESTIMATE_QTY(String val) { m_ESTIMATE_QTY = val; }
	public void setESTIMATE_UNIT_PRICE(String val) { m_ESTIMATE_UNIT_PRICE = val; }
	public void setESTIMATE_AMOUNT(String val) { m_ESTIMATE_AMOUNT = val; }
	public void setODR_FLG(String val) { m_ODR_FLG = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setCAL_NO(String val) { m_CAL_NO = val; }
	public void setJOB_ODR_DLV_DATE(String val) { m_JOB_ODR_DLV_DATE = val; }
	public void setRSLT_CTL_SEQ_CD(String val) { m_RSLT_CTL_SEQ_CD = val; }
	public void setUNIT(String val) { m_UNIT = val; }
	public void setDLV_PLACE_CD(String val) { m_DLV_PLACE_CD = val; }
	public void setUNIT_PRICE(String val) { m_UNIT_PRICE = val; }
	public void setSPCL_PRICE_CO(String val) { m_SPCL_PRICE_CO = val; }
	public void setCUST_DLV_CD(String val) { m_CUST_DLV_CD = val; }
	public void setCUST_DLV_KEY_CD(String val) { m_CUST_DLV_KEY_CD = val; }
	public void setIF_CTL_NO(String val) { m_IF_CTL_NO = val; }
	public void setODR_SEQ(String val) { m_ODR_SEQ = val; }
	public void setPART_DLV_SEQ_NO(String val) { m_PART_DLV_SEQ_NO = val; }
	public void setLAST_ANS_DLV_DATE_RCD(String val) { m_LAST_ANS_DLV_DATE_RCD = val; }
	public void setDESINATED_SHIP_DATE(String val) { m_DESINATED_SHIP_DATE = val; }
	public void setDESINATED_SHIP_QTY(String val) { m_DESINATED_SHIP_QTY = val; }
	public void setREST_SHIP_ODR_QTY(String val) { m_REST_SHIP_ODR_QTY = val; }
	public void setSHIP_ODR_CMPLT_FLG(String val) { m_SHIP_ODR_CMPLT_FLG = val; }
	public void setJOB_ODR_CANCEL_NO(String val) { m_JOB_ODR_CANCEL_NO = val; }
	public void setJOB_ODR_TYP(String val) { m_JOB_ODR_TYP = val; }
	public void setPLAN_TYP(String val) { m_PLAN_TYP = val; }
	public void setJOB_ODR_QTY(String val) { m_JOB_ODR_QTY = val; }
	public void setALC_GRP_CD(String val) { m_ALC_GRP_CD = val; }
	public void setJOB_ODR_STS_TYP(String val) { m_JOB_ODR_STS_TYP = val; }
	public void setJOB_ODR_EXP_TYP(String val) { m_JOB_ODR_EXP_TYP = val; }
	public void setJOB_ODR_DEL_FLG(String val) { m_JOB_ODR_DEL_FLG = val; }
	public void setALCD_QTY(String val) { m_ALCD_QTY = val; }
	public void setCUS_DLV_CD(String val) { m_CUS_DLV_CD = val; }
	public void setCUS_DLV_KEY_CD(String val) { m_CUS_DLV_KEY_CD = val; }
	public void setUNOFFICIAL_RECEIPT_FLAG(String val) { m_UNOFFICIAL_RECEIPT_FLAG = val; }
	public void setJOB_OD_CD_PREFIX(String val) { m_JOB_OD_CD_PREFIX = val; }
	public void setCTL_SEQ_CD(String val) { m_CTL_SEQ_CD = val; }
	public void setNEW_OLD_FLG(String val) { m_NEW_OLD_FLG = val; }
	public void setTRAN_TYPE(String val) { m_TRAN_TYPE = val; }
	public void setEXCH_RATE(String val) { m_EXCH_RATE = val; }
	public void setORG_NAME(String val) { m_ORG_NAME = val; }
	public void setORG_CD(String val) { m_ORG_CD = val; }
	public void setUSER_NAME(String val) { m_USER_NAME = val; }
	public void setUSER_CD(String val) { m_USER_CD = val; }
	public void setUNIT_QTY_TYP(String val) { m_UNIT_QTY_TYP = val; }
	public void setl_h_ANS_DLV_DATE_EXIST_FLG(String val) { m_l_h_ANS_DLV_DATE_EXIST_FLG = val; }
	public void setFIELD_VALUE(String val) { m_FIELD_VALUE = val; }


	public void setList_rdoSHIP_INST(List list) { l_rdoSHIP_INST = list; }
	public void setList_rdoSHIP_UPDATE(List list) { l_rdoSHIP_UPDATE = list; }
	public void setList_l_CUR_UNIT(List list) { l_l_CUR_UNIT = list; }
	public void setList_DETAIL_NO(List list) { l_DETAIL_NO = list; }
	public void setList_ACPT_ODR_CD(List list) { l_ACPT_ODR_CD = list; }
	public void setList_c_DOODR(List list) { l_c_DOODR = list; }
	public void setList_PREPARE_QTY(List list) { l_PREPARE_QTY = list; }
	public void setList_c_INPUTODRCD(List list) { l_c_INPUTODRCD = list; }
	public void setList_QTY(List list) { l_QTY = list; }
	public void setList_QTY_UNIT(List list) { l_QTY_UNIT = list; }
	public void setList_ODR_PRICE_UNIT(List list) { l_ODR_PRICE_UNIT = list; }
	public void setList_ISSUE_INST_COMMENT(List list) { l_ISSUE_INST_COMMENT = list; }
	public void setList_APPROVED_COMMENT(List list) { l_APPROVED_COMMENT = list; }
	public void setList_CUST_CHRG_PSN_NAME(List list) { l_CUST_CHRG_PSN_NAME = list; }
	public void setList_ES_ORG_NAME(List list) { l_ES_ORG_NAME = list; }
	public void setList_l_DLV_LOC_NAME(List list) { l_l_DLV_LOC_NAME = list; }
	public void setList_l_CUST_ITEM_NAME(List list) { l_l_CUST_ITEM_NAME = list; }
	public void setList_l_ITEM_NAME(List list) { l_l_ITEM_NAME = list; }
	public void setList_l_JOB_ODR_DLV_DATE(List list) { l_l_JOB_ODR_DLV_DATE = list; }
	public void setList_l_ALC_GRP_CD(List list) { l_l_ALC_GRP_CD = list; }
	public void setList_l_JOB_ODR_CD(List list) { l_l_JOB_ODR_CD = list; }
	public void setList_l_APPR_REMARKS(List list) { l_l_APPR_REMARKS = list; }
	public void setList_h_UPDATE_FLG(List list) { l_h_UPDATE_FLG = list; }
	public void setList_l_TEST_MODIFY_COUNT(List list) { l_l_TEST_MODIFY_COUNT = list; }
	public void setList_l_TPJ_MODIFY_COUNT(List list) { l_l_TPJ_MODIFY_COUNT = list; }
	public void setList_l_h_ESTIMATE_TYPE(List list) { l_l_h_ESTIMATE_TYPE = list; }
	public void setList_h_ESTIMATE_TYPE(List list) { l_h_ESTIMATE_TYPE = list; }
	public void setList_l_h_PREC_ARRANGE_FLG(List list) { l_l_h_PREC_ARRANGE_FLG = list; }
	public void setList_l_c_DOODR(List list) { l_l_c_DOODR = list; }
	public void setList_l_c_INPUTODRCD(List list) { l_l_c_INPUTODRCD = list; }
	public void setList_h_PREC_ARRANGE_FLG(List list) { l_h_PREC_ARRANGE_FLG = list; }
	public void setList_l_h_ODR_TYP(List list) { l_l_h_ODR_TYP = list; }
	public void setList_h_ODR_TYP(List list) { l_h_ODR_TYP = list; }
	public void setList_h_ODR_TYP3(List list) { l_h_ODR_TYP3 = list; }
	public void setList_h_APR_ODR(List list) { l_h_APR_ODR = list; }
	public void setList_h_PRD_REQ_JOB_ODR_TYP_1(List list) { l_h_PRD_REQ_JOB_ODR_TYP_1 = list; }
	public void setList_h_PRD_REQ_JOB_ODR_TYP_2(List list) { l_h_PRD_REQ_JOB_ODR_TYP_2 = list; }
	public void setList_h_DLV_LOC_CD(List list) { l_h_DLV_LOC_CD = list; }
	public void setList_h_ANS_DLV_DATE_EXIST_FLG(List list) { l_h_ANS_DLV_DATE_EXIST_FLG = list; }
	public void setList_ITEM_NAME_R(List list) { l_ITEM_NAME_R = list; }
	public void setList_l_h_DEPO_TYP(List list) { l_l_h_DEPO_TYP = list; }
	public void setList_PROJECT_CD(List list) { l_PROJECT_CD = list; }
	public void setList_ESTIMATE_NO(List list) { l_ESTIMATE_NO = list; }
	public void setList_l_DETAL_NO(List list) { l_l_DETAL_NO = list; }
	public void setList_CUST_NAME(List list) { l_CUST_NAME = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_CODE(List list) { l_CODE = list; }
	public void setList_SYS_CLASS(List list) { l_SYS_CLASS = list; }
	public void setList_CLASS_CODE(List list) { l_CLASS_CODE = list; }
	public void setList_BUSINESS_OPR_DATE(List list) { l_BUSINESS_OPR_DATE = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_HOME_CUR_CD(List list) { l_HOME_CUR_CD = list; }
	public void setList_VALUE(List list) { l_VALUE = list; }
	public void setList_NAME(List list) { l_NAME = list; }
	public void setList_PROJECT_NAME(List list) { l_PROJECT_NAME = list; }
	public void setList_CUST_CD(List list) { l_CUST_CD = list; }
	public void setList_PROJECT_STAT(List list) { l_PROJECT_STAT = list; }
	public void setList_DLV_LOC_CD(List list) { l_DLV_LOC_CD = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_CUR_CD(List list) { l_CUR_CD = list; }
	public void setList_EXCH_TYP(List list) { l_EXCH_TYP = list; }
	public void setList_TAX_APPLY_TYP(List list) { l_TAX_APPLY_TYP = list; }
	public void setList_TAX_CD(List list) { l_TAX_CD = list; }
	public void setList_TAX_CALC_TYP(List list) { l_TAX_CALC_TYP = list; }
	public void setList_PARTIAL_SHIP_INST_FLG(List list) { l_PARTIAL_SHIP_INST_FLG = list; }
	public void setList_CUR_NAME(List list) { l_CUR_NAME = list; }
	public void setList_CUR_UNIT(List list) { l_CUR_UNIT = list; }
	public void setList_DECIMAL_FIG(List list) { l_DECIMAL_FIG = list; }
	public void setList_l_ES_USER_CD(List list) { l_l_ES_USER_CD = list; }
	public void setList_l_ES_ORG_CD(List list) { l_l_ES_ORG_CD = list; }
	public void setList_l_CUST_ITEM_CD(List list) { l_l_CUST_ITEM_CD = list; }
	public void setList_l_ESTIMATE_QTY(List list) { l_l_ESTIMATE_QTY = list; }
	public void setList_l_UNIT_CD(List list) { l_l_UNIT_CD = list; }
	public void setList_l_ESTIMATE_UNIT_PRICE(List list) { l_l_ESTIMATE_UNIT_PRICE = list; }
	public void setList_l_ESTIMATE_AMOUNT(List list) { l_l_ESTIMATE_AMOUNT = list; }
	public void setList_l_ESTIMATE_TYPE(List list) { l_l_ESTIMATE_TYPE = list; }
	public void setList_l_ESTIMATE_ITEM_NAME(List list) { l_l_ESTIMATE_ITEM_NAME = list; }
	public void setList_l_USER_NAME(List list) { l_l_USER_NAME = list; }
	public void setList_l_ORG_NAME(List list) { l_l_ORG_NAME = list; }
	public void setList_DLV_LOC_NAME(List list) { l_DLV_LOC_NAME = list; }
	public void setList_TRANSPORT_LT(List list) { l_TRANSPORT_LT = list; }
	public void setList_TRANSPORT_CD(List list) { l_TRANSPORT_CD = list; }
	public void setList_TRANSPORT_TYP(List list) { l_TRANSPORT_TYP = list; }
	public void setList_DEPO_WH_CD(List list) { l_DEPO_WH_CD = list; }
	public void setList_SHIP_PLANT_CD(List list) { l_SHIP_PLANT_CD = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_DEPO_TYP(List list) { l_DEPO_TYP = list; }
	public void setList_CUST_ITEM_NAME(List list) { l_CUST_ITEM_NAME = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_CUST_ITEM_CD(List list) { l_CUST_ITEM_CD = list; }
	public void setList_ESTIMATE_TYPE(List list) { l_ESTIMATE_TYPE = list; }
	public void setList_ODR_NO(List list) { l_ODR_NO = list; }
	public void setList_DETAL_NO(List list) { l_DETAL_NO = list; }
	public void setList_l_ODR_NO(List list) { l_l_ODR_NO = list; }
	public void setList_l_ODR_TYP(List list) { l_l_ODR_TYP = list; }
	public void setList_l_CUST_ODR_NO(List list) { l_l_CUST_ODR_NO = list; }
	public void setList_l_ITEM_CD(List list) { l_l_ITEM_CD = list; }
	public void setList_l_DESINATED_DLV_DATE(List list) { l_l_DESINATED_DLV_DATE = list; }
	public void setList_l_ODR_QTY(List list) { l_l_ODR_QTY = list; }
	public void setList_l_ODR_AMOUNT(List list) { l_l_ODR_AMOUNT = list; }
	public void setList_l_ODR_AMOUNT_EXCH_RATES(List list) { l_l_ODR_AMOUNT_EXCH_RATES = list; }
	public void setList_l_DLV_LOC_CD(List list) { l_l_DLV_LOC_CD = list; }
	public void setList_l_DEPO_TYP(List list) { l_l_DEPO_TYP = list; }
	public void setList_l_ODR_ACPT_DATE(List list) { l_l_ODR_ACPT_DATE = list; }
	public void setList_l_REMARKS(List list) { l_l_REMARKS = list; }
	public void setList_l_OWN_PERSON_CD(List list) { l_l_OWN_PERSON_CD = list; }
	public void setList_l_TODR_MODIFY_COUNT(List list) { l_l_TODR_MODIFY_COUNT = list; }
	public void setList_l_CUST_CHRG_PSN_NAME(List list) { l_l_CUST_CHRG_PSN_NAME = list; }
	public void setList_l_OWN_ORG_CD(List list) { l_l_OWN_ORG_CD = list; }
	public void setList_l_CUST_CHRG_ORG_NAME(List list) { l_l_CUST_CHRG_ORG_NAME = list; }
	public void setList_ODR_TYP(List list) { l_ODR_TYP = list; }
	public void setList_ODR_CTL_NO(List list) { l_ODR_CTL_NO = list; }
	public void setList_CUST_ODR_NO(List list) { l_CUST_ODR_NO = list; }
	public void setList_CUST_CHRG_ORG_CD(List list) { l_CUST_CHRG_ORG_CD = list; }
	public void setList_CUST_CHRG_PSN_CD(List list) { l_CUST_CHRG_PSN_CD = list; }
	public void setList_ODR_ACPT_PSN_CD(List list) { l_ODR_ACPT_PSN_CD = list; }
	public void setList_CURRNCY_CD(List list) { l_CURRNCY_CD = list; }
	public void setList_DLV_LOC_NAME_KANJI(List list) { l_DLV_LOC_NAME_KANJI = list; }
	public void setList_ODR_UNIT_PRICE(List list) { l_ODR_UNIT_PRICE = list; }
	public void setList_SPCL_PRICE_TYP(List list) { l_SPCL_PRICE_TYP = list; }
	public void setList_DESINATED_DLV_DATE(List list) { l_DESINATED_DLV_DATE = list; }
	public void setList_STD_DESINATED_RCV_DATE(List list) { l_STD_DESINATED_RCV_DATE = list; }
	public void setList_ODR_QTY(List list) { l_ODR_QTY = list; }
	public void setList_REMAIN_UNCONFIRM_ODR_QTY(List list) { l_REMAIN_UNCONFIRM_ODR_QTY = list; }
	public void setList_CANCELED_UNCONFIRM_ODR_QTY(List list) { l_CANCELED_UNCONFIRM_ODR_QTY = list; }
	public void setList_UNIT_CD(List list) { l_UNIT_CD = list; }
	public void setList_UNCONFIRM_ODR_BALANCE(List list) { l_UNCONFIRM_ODR_BALANCE = list; }
	public void setList_ODR_AMOUNT(List list) { l_ODR_AMOUNT = list; }
	public void setList_ODR_AMOUNT_EXCH_RATES(List list) { l_ODR_AMOUNT_EXCH_RATES = list; }
	public void setList_ODR_CMPLT_FLG(List list) { l_ODR_CMPLT_FLG = list; }
	public void setList_PART_NAME(List list) { l_PART_NAME = list; }
	public void setList_REMARKS(List list) { l_REMARKS = list; }
	public void setList_ODR_ACPT_DATE(List list) { l_ODR_ACPT_DATE = list; }
	public void setList_SHIP_PLAN_REMAIN_QTY(List list) { l_SHIP_PLAN_REMAIN_QTY = list; }
	public void setList_SHIP_PLAN_CMPLT_FLG(List list) { l_SHIP_PLAN_CMPLT_FLG = list; }
	public void setList_UNCONFIRMED_ODR_EFF_OVR_FLG(List list) { l_UNCONFIRMED_ODR_EFF_OVR_FLG = list; }
	public void setList_ENTRY_TYP(List list) { l_ENTRY_TYP = list; }
	public void setList_DEL_FLG(List list) { l_DEL_FLG = list; }
	public void setList_JOB_ODR_SET_FLG(List list) { l_JOB_ODR_SET_FLG = list; }
	public void setList_SLIP_CD(List list) { l_SLIP_CD = list; }
	public void setList_ORGN_ODR_NO(List list) { l_ORGN_ODR_NO = list; }
	public void setList_ADD_ODR_FLG(List list) { l_ADD_ODR_FLG = list; }
	public void setList_ODR_CMPLT_DATE(List list) { l_ODR_CMPLT_DATE = list; }
	public void setList_ODR_ACPT_ORG_CD(List list) { l_ODR_ACPT_ORG_CD = list; }
	public void setList_ESTIMATE_STAT(List list) { l_ESTIMATE_STAT = list; }
	public void setList_ES_ORG_CD(List list) { l_ES_ORG_CD = list; }
	public void setList_ES_USER_CD(List list) { l_ES_USER_CD = list; }
	public void setList_ESTIMATE_QTY(List list) { l_ESTIMATE_QTY = list; }
	public void setList_ESTIMATE_UNIT_PRICE(List list) { l_ESTIMATE_UNIT_PRICE = list; }
	public void setList_ESTIMATE_AMOUNT(List list) { l_ESTIMATE_AMOUNT = list; }
	public void setList_ODR_FLG(List list) { l_ODR_FLG = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_CAL_NO(List list) { l_CAL_NO = list; }
	public void setList_JOB_ODR_DLV_DATE(List list) { l_JOB_ODR_DLV_DATE = list; }
	public void setList_RSLT_CTL_SEQ_CD(List list) { l_RSLT_CTL_SEQ_CD = list; }
	public void setList_UNIT(List list) { l_UNIT = list; }
	public void setList_DLV_PLACE_CD(List list) { l_DLV_PLACE_CD = list; }
	public void setList_UNIT_PRICE(List list) { l_UNIT_PRICE = list; }
	public void setList_SPCL_PRICE_CO(List list) { l_SPCL_PRICE_CO = list; }
	public void setList_CUST_DLV_CD(List list) { l_CUST_DLV_CD = list; }
	public void setList_CUST_DLV_KEY_CD(List list) { l_CUST_DLV_KEY_CD = list; }
	public void setList_IF_CTL_NO(List list) { l_IF_CTL_NO = list; }
	public void setList_ODR_SEQ(List list) { l_ODR_SEQ = list; }
	public void setList_PART_DLV_SEQ_NO(List list) { l_PART_DLV_SEQ_NO = list; }
	public void setList_LAST_ANS_DLV_DATE_RCD(List list) { l_LAST_ANS_DLV_DATE_RCD = list; }
	public void setList_DESINATED_SHIP_DATE(List list) { l_DESINATED_SHIP_DATE = list; }
	public void setList_DESINATED_SHIP_QTY(List list) { l_DESINATED_SHIP_QTY = list; }
	public void setList_REST_SHIP_ODR_QTY(List list) { l_REST_SHIP_ODR_QTY = list; }
	public void setList_SHIP_ODR_CMPLT_FLG(List list) { l_SHIP_ODR_CMPLT_FLG = list; }
	public void setList_JOB_ODR_CANCEL_NO(List list) { l_JOB_ODR_CANCEL_NO = list; }
	public void setList_JOB_ODR_TYP(List list) { l_JOB_ODR_TYP = list; }
	public void setList_PLAN_TYP(List list) { l_PLAN_TYP = list; }
	public void setList_JOB_ODR_QTY(List list) { l_JOB_ODR_QTY = list; }
	public void setList_ALC_GRP_CD(List list) { l_ALC_GRP_CD = list; }
	public void setList_JOB_ODR_STS_TYP(List list) { l_JOB_ODR_STS_TYP = list; }
	public void setList_JOB_ODR_EXP_TYP(List list) { l_JOB_ODR_EXP_TYP = list; }
	public void setList_JOB_ODR_DEL_FLG(List list) { l_JOB_ODR_DEL_FLG = list; }
	public void setList_ALCD_QTY(List list) { l_ALCD_QTY = list; }
	public void setList_CUS_DLV_CD(List list) { l_CUS_DLV_CD = list; }
	public void setList_CUS_DLV_KEY_CD(List list) { l_CUS_DLV_KEY_CD = list; }
	public void setList_UNOFFICIAL_RECEIPT_FLAG(List list) { l_UNOFFICIAL_RECEIPT_FLAG = list; }
	public void setList_JOB_OD_CD_PREFIX(List list) { l_JOB_OD_CD_PREFIX = list; }
	public void setList_CTL_SEQ_CD(List list) { l_CTL_SEQ_CD = list; }
	public void setList_NEW_OLD_FLG(List list) { l_NEW_OLD_FLG = list; }
	public void setList_TRAN_TYPE(List list) { l_TRAN_TYPE = list; }
	public void setList_EXCH_RATE(List list) { l_EXCH_RATE = list; }
	public void setList_ORG_NAME(List list) { l_ORG_NAME = list; }
	public void setList_ORG_CD(List list) { l_ORG_CD = list; }
	public void setList_USER_NAME(List list) { l_USER_NAME = list; }
	public void setList_USER_CD(List list) { l_USER_CD = list; }
	public void setList_UNIT_QTY_TYP(List list) { l_UNIT_QTY_TYP = list; }
	public void setList_l_h_ANS_DLV_DATE_EXIST_FLG(List list) { l_l_h_ANS_DLV_DATE_EXIST_FLG = list; }
	public void setList_FIELD_VALUE(List list) { l_FIELD_VALUE = list; }

	public int setL2L_rdoSHIP_INST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoSHIP_INST == null) {
			l_rdoSHIP_INST = new ArrayList();
		} else {
			l_rdoSHIP_INST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoSHIP_INST.add(((KM0030010Struct) list.get(i)).getrdoSHIP_INST());
		}
		return size;
	}
	public int setL2L_rdoSHIP_UPDATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoSHIP_UPDATE == null) {
			l_rdoSHIP_UPDATE = new ArrayList();
		} else {
			l_rdoSHIP_UPDATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoSHIP_UPDATE.add(((KM0030010Struct) list.get(i)).getrdoSHIP_UPDATE());
		}
		return size;
	}
	public int setL2L_l_CUR_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_CUR_UNIT == null) {
			l_l_CUR_UNIT = new ArrayList();
		} else {
			l_l_CUR_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_CUR_UNIT.add(((KM0030010Struct) list.get(i)).getl_CUR_UNIT());
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
			l_DETAIL_NO.add(((KM0030010Struct) list.get(i)).getDETAIL_NO());
		}
		return size;
	}
	public int setL2L_ACPT_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACPT_ODR_CD == null) {
			l_ACPT_ODR_CD = new ArrayList();
		} else {
			l_ACPT_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACPT_ODR_CD.add(((KM0030010Struct) list.get(i)).getACPT_ODR_CD());
		}
		return size;
	}
	public int setL2L_c_DOODR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_DOODR == null) {
			l_c_DOODR = new ArrayList();
		} else {
			l_c_DOODR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_DOODR.add(((KM0030010Struct) list.get(i)).getc_DOODR());
		}
		return size;
	}
	public int setL2L_PREPARE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PREPARE_QTY == null) {
			l_PREPARE_QTY = new ArrayList();
		} else {
			l_PREPARE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PREPARE_QTY.add(((KM0030010Struct) list.get(i)).getPREPARE_QTY());
		}
		return size;
	}
	public int setL2L_c_INPUTODRCD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_INPUTODRCD == null) {
			l_c_INPUTODRCD = new ArrayList();
		} else {
			l_c_INPUTODRCD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_INPUTODRCD.add(((KM0030010Struct) list.get(i)).getc_INPUTODRCD());
		}
		return size;
	}
	public int setL2L_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_QTY == null) {
			l_QTY = new ArrayList();
		} else {
			l_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_QTY.add(((KM0030010Struct) list.get(i)).getQTY());
		}
		return size;
	}
	public int setL2L_QTY_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_QTY_UNIT == null) {
			l_QTY_UNIT = new ArrayList();
		} else {
			l_QTY_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_QTY_UNIT.add(((KM0030010Struct) list.get(i)).getQTY_UNIT());
		}
		return size;
	}
	public int setL2L_ODR_PRICE_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_PRICE_UNIT == null) {
			l_ODR_PRICE_UNIT = new ArrayList();
		} else {
			l_ODR_PRICE_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_PRICE_UNIT.add(((KM0030010Struct) list.get(i)).getODR_PRICE_UNIT());
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
			l_ISSUE_INST_COMMENT.add(((KM0030010Struct) list.get(i)).getISSUE_INST_COMMENT());
		}
		return size;
	}
	public int setL2L_APPROVED_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_APPROVED_COMMENT == null) {
			l_APPROVED_COMMENT = new ArrayList();
		} else {
			l_APPROVED_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_APPROVED_COMMENT.add(((KM0030010Struct) list.get(i)).getAPPROVED_COMMENT());
		}
		return size;
	}
	public int setL2L_CUST_CHRG_PSN_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_CHRG_PSN_NAME == null) {
			l_CUST_CHRG_PSN_NAME = new ArrayList();
		} else {
			l_CUST_CHRG_PSN_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_CHRG_PSN_NAME.add(((KM0030010Struct) list.get(i)).getCUST_CHRG_PSN_NAME());
		}
		return size;
	}
	public int setL2L_ES_ORG_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ES_ORG_NAME == null) {
			l_ES_ORG_NAME = new ArrayList();
		} else {
			l_ES_ORG_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ES_ORG_NAME.add(((KM0030010Struct) list.get(i)).getES_ORG_NAME());
		}
		return size;
	}
	public int setL2L_l_DLV_LOC_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DLV_LOC_NAME == null) {
			l_l_DLV_LOC_NAME = new ArrayList();
		} else {
			l_l_DLV_LOC_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DLV_LOC_NAME.add(((KM0030010Struct) list.get(i)).getl_DLV_LOC_NAME());
		}
		return size;
	}
	public int setL2L_l_CUST_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_CUST_ITEM_NAME == null) {
			l_l_CUST_ITEM_NAME = new ArrayList();
		} else {
			l_l_CUST_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_CUST_ITEM_NAME.add(((KM0030010Struct) list.get(i)).getl_CUST_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_l_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ITEM_NAME == null) {
			l_l_ITEM_NAME = new ArrayList();
		} else {
			l_l_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ITEM_NAME.add(((KM0030010Struct) list.get(i)).getl_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_l_JOB_ODR_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_JOB_ODR_DLV_DATE == null) {
			l_l_JOB_ODR_DLV_DATE = new ArrayList();
		} else {
			l_l_JOB_ODR_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_JOB_ODR_DLV_DATE.add(((KM0030010Struct) list.get(i)).getl_JOB_ODR_DLV_DATE());
		}
		return size;
	}
	public int setL2L_l_ALC_GRP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ALC_GRP_CD == null) {
			l_l_ALC_GRP_CD = new ArrayList();
		} else {
			l_l_ALC_GRP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ALC_GRP_CD.add(((KM0030010Struct) list.get(i)).getl_ALC_GRP_CD());
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
			l_l_JOB_ODR_CD.add(((KM0030010Struct) list.get(i)).getl_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_l_APPR_REMARKS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_APPR_REMARKS == null) {
			l_l_APPR_REMARKS = new ArrayList();
		} else {
			l_l_APPR_REMARKS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_APPR_REMARKS.add(((KM0030010Struct) list.get(i)).getl_APPR_REMARKS());
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
			l_h_UPDATE_FLG.add(((KM0030010Struct) list.get(i)).geth_UPDATE_FLG());
		}
		return size;
	}
	public int setL2L_l_TEST_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_TEST_MODIFY_COUNT == null) {
			l_l_TEST_MODIFY_COUNT = new ArrayList();
		} else {
			l_l_TEST_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_TEST_MODIFY_COUNT.add(((KM0030010Struct) list.get(i)).getl_TEST_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_l_TPJ_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_TPJ_MODIFY_COUNT == null) {
			l_l_TPJ_MODIFY_COUNT = new ArrayList();
		} else {
			l_l_TPJ_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_TPJ_MODIFY_COUNT.add(((KM0030010Struct) list.get(i)).getl_TPJ_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_l_h_ESTIMATE_TYPE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_h_ESTIMATE_TYPE == null) {
			l_l_h_ESTIMATE_TYPE = new ArrayList();
		} else {
			l_l_h_ESTIMATE_TYPE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_h_ESTIMATE_TYPE.add(((KM0030010Struct) list.get(i)).getl_h_ESTIMATE_TYPE());
		}
		return size;
	}
	public int setL2L_h_ESTIMATE_TYPE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ESTIMATE_TYPE == null) {
			l_h_ESTIMATE_TYPE = new ArrayList();
		} else {
			l_h_ESTIMATE_TYPE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ESTIMATE_TYPE.add(((KM0030010Struct) list.get(i)).geth_ESTIMATE_TYPE());
		}
		return size;
	}
	public int setL2L_l_h_PREC_ARRANGE_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_h_PREC_ARRANGE_FLG == null) {
			l_l_h_PREC_ARRANGE_FLG = new ArrayList();
		} else {
			l_l_h_PREC_ARRANGE_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_h_PREC_ARRANGE_FLG.add(((KM0030010Struct) list.get(i)).getl_h_PREC_ARRANGE_FLG());
		}
		return size;
	}
	public int setL2L_l_c_DOODR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_c_DOODR == null) {
			l_l_c_DOODR = new ArrayList();
		} else {
			l_l_c_DOODR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_c_DOODR.add(((KM0030010Struct) list.get(i)).getl_c_DOODR());
		}
		return size;
	}
	public int setL2L_l_c_INPUTODRCD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_c_INPUTODRCD == null) {
			l_l_c_INPUTODRCD = new ArrayList();
		} else {
			l_l_c_INPUTODRCD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_c_INPUTODRCD.add(((KM0030010Struct) list.get(i)).getl_c_INPUTODRCD());
		}
		return size;
	}
	public int setL2L_h_PREC_ARRANGE_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PREC_ARRANGE_FLG == null) {
			l_h_PREC_ARRANGE_FLG = new ArrayList();
		} else {
			l_h_PREC_ARRANGE_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PREC_ARRANGE_FLG.add(((KM0030010Struct) list.get(i)).geth_PREC_ARRANGE_FLG());
		}
		return size;
	}
	public int setL2L_l_h_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_h_ODR_TYP == null) {
			l_l_h_ODR_TYP = new ArrayList();
		} else {
			l_l_h_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_h_ODR_TYP.add(((KM0030010Struct) list.get(i)).getl_h_ODR_TYP());
		}
		return size;
	}
	public int setL2L_h_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ODR_TYP == null) {
			l_h_ODR_TYP = new ArrayList();
		} else {
			l_h_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ODR_TYP.add(((KM0030010Struct) list.get(i)).geth_ODR_TYP());
		}
		return size;
	}
	public int setL2L_h_ODR_TYP3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ODR_TYP3 == null) {
			l_h_ODR_TYP3 = new ArrayList();
		} else {
			l_h_ODR_TYP3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ODR_TYP3.add(((KM0030010Struct) list.get(i)).geth_ODR_TYP3());
		}
		return size;
	}
	public int setL2L_h_APR_ODR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_APR_ODR == null) {
			l_h_APR_ODR = new ArrayList();
		} else {
			l_h_APR_ODR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_APR_ODR.add(((KM0030010Struct) list.get(i)).geth_APR_ODR());
		}
		return size;
	}
	public int setL2L_h_PRD_REQ_JOB_ODR_TYP_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PRD_REQ_JOB_ODR_TYP_1 == null) {
			l_h_PRD_REQ_JOB_ODR_TYP_1 = new ArrayList();
		} else {
			l_h_PRD_REQ_JOB_ODR_TYP_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PRD_REQ_JOB_ODR_TYP_1.add(((KM0030010Struct) list.get(i)).geth_PRD_REQ_JOB_ODR_TYP_1());
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
			l_h_PRD_REQ_JOB_ODR_TYP_2.add(((KM0030010Struct) list.get(i)).geth_PRD_REQ_JOB_ODR_TYP_2());
		}
		return size;
	}
	public int setL2L_h_DLV_LOC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_DLV_LOC_CD == null) {
			l_h_DLV_LOC_CD = new ArrayList();
		} else {
			l_h_DLV_LOC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_DLV_LOC_CD.add(((KM0030010Struct) list.get(i)).geth_DLV_LOC_CD());
		}
		return size;
	}
	public int setL2L_h_ANS_DLV_DATE_EXIST_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ANS_DLV_DATE_EXIST_FLG == null) {
			l_h_ANS_DLV_DATE_EXIST_FLG = new ArrayList();
		} else {
			l_h_ANS_DLV_DATE_EXIST_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ANS_DLV_DATE_EXIST_FLG.add(((KM0030010Struct) list.get(i)).geth_ANS_DLV_DATE_EXIST_FLG());
		}
		return size;
	}
	public int setL2L_ITEM_NAME_R(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_NAME_R == null) {
			l_ITEM_NAME_R = new ArrayList();
		} else {
			l_ITEM_NAME_R.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_NAME_R.add(((KM0030010Struct) list.get(i)).getITEM_NAME_R());
		}
		return size;
	}
	public int setL2L_l_h_DEPO_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_h_DEPO_TYP == null) {
			l_l_h_DEPO_TYP = new ArrayList();
		} else {
			l_l_h_DEPO_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_h_DEPO_TYP.add(((KM0030010Struct) list.get(i)).getl_h_DEPO_TYP());
		}
		return size;
	}
	public int setL2L_PROJECT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROJECT_CD == null) {
			l_PROJECT_CD = new ArrayList();
		} else {
			l_PROJECT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROJECT_CD.add(((KM0030010Struct) list.get(i)).getPROJECT_CD());
		}
		return size;
	}
	public int setL2L_ESTIMATE_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ESTIMATE_NO == null) {
			l_ESTIMATE_NO = new ArrayList();
		} else {
			l_ESTIMATE_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ESTIMATE_NO.add(((KM0030010Struct) list.get(i)).getESTIMATE_NO());
		}
		return size;
	}
	public int setL2L_l_DETAL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DETAL_NO == null) {
			l_l_DETAL_NO = new ArrayList();
		} else {
			l_l_DETAL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DETAL_NO.add(((KM0030010Struct) list.get(i)).getl_DETAL_NO());
		}
		return size;
	}
	public int setL2L_CUST_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_NAME == null) {
			l_CUST_NAME = new ArrayList();
		} else {
			l_CUST_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_NAME.add(((KM0030010Struct) list.get(i)).getCUST_NAME());
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
			l_COMPANY_CD.add(((KM0030010Struct) list.get(i)).getCOMPANY_CD());
		}
		return size;
	}
	public int setL2L_CODE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CODE == null) {
			l_CODE = new ArrayList();
		} else {
			l_CODE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CODE.add(((KM0030010Struct) list.get(i)).getCODE());
		}
		return size;
	}
	public int setL2L_SYS_CLASS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SYS_CLASS == null) {
			l_SYS_CLASS = new ArrayList();
		} else {
			l_SYS_CLASS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SYS_CLASS.add(((KM0030010Struct) list.get(i)).getSYS_CLASS());
		}
		return size;
	}
	public int setL2L_CLASS_CODE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CLASS_CODE == null) {
			l_CLASS_CODE = new ArrayList();
		} else {
			l_CLASS_CODE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CLASS_CODE.add(((KM0030010Struct) list.get(i)).getCLASS_CODE());
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
			l_BUSINESS_OPR_DATE.add(((KM0030010Struct) list.get(i)).getBUSINESS_OPR_DATE());
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
			l_PLANT_CD.add(((KM0030010Struct) list.get(i)).getPLANT_CD());
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
			l_HOME_CUR_CD.add(((KM0030010Struct) list.get(i)).getHOME_CUR_CD());
		}
		return size;
	}
	public int setL2L_VALUE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VALUE == null) {
			l_VALUE = new ArrayList();
		} else {
			l_VALUE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VALUE.add(((KM0030010Struct) list.get(i)).getVALUE());
		}
		return size;
	}
	public int setL2L_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NAME == null) {
			l_NAME = new ArrayList();
		} else {
			l_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NAME.add(((KM0030010Struct) list.get(i)).getNAME());
		}
		return size;
	}
	public int setL2L_PROJECT_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROJECT_NAME == null) {
			l_PROJECT_NAME = new ArrayList();
		} else {
			l_PROJECT_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROJECT_NAME.add(((KM0030010Struct) list.get(i)).getPROJECT_NAME());
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
			l_CUST_CD.add(((KM0030010Struct) list.get(i)).getCUST_CD());
		}
		return size;
	}
	public int setL2L_PROJECT_STAT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROJECT_STAT == null) {
			l_PROJECT_STAT = new ArrayList();
		} else {
			l_PROJECT_STAT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROJECT_STAT.add(((KM0030010Struct) list.get(i)).getPROJECT_STAT());
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
			l_DLV_LOC_CD.add(((KM0030010Struct) list.get(i)).getDLV_LOC_CD());
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
			l_MODIFY_COUNT.add(((KM0030010Struct) list.get(i)).getMODIFY_COUNT());
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
			l_CUR_CD.add(((KM0030010Struct) list.get(i)).getCUR_CD());
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
			l_EXCH_TYP.add(((KM0030010Struct) list.get(i)).getEXCH_TYP());
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
			l_TAX_APPLY_TYP.add(((KM0030010Struct) list.get(i)).getTAX_APPLY_TYP());
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
			l_TAX_CD.add(((KM0030010Struct) list.get(i)).getTAX_CD());
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
			l_TAX_CALC_TYP.add(((KM0030010Struct) list.get(i)).getTAX_CALC_TYP());
		}
		return size;
	}
	public int setL2L_PARTIAL_SHIP_INST_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PARTIAL_SHIP_INST_FLG == null) {
			l_PARTIAL_SHIP_INST_FLG = new ArrayList();
		} else {
			l_PARTIAL_SHIP_INST_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PARTIAL_SHIP_INST_FLG.add(((KM0030010Struct) list.get(i)).getPARTIAL_SHIP_INST_FLG());
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
			l_CUR_NAME.add(((KM0030010Struct) list.get(i)).getCUR_NAME());
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
			l_CUR_UNIT.add(((KM0030010Struct) list.get(i)).getCUR_UNIT());
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
			l_DECIMAL_FIG.add(((KM0030010Struct) list.get(i)).getDECIMAL_FIG());
		}
		return size;
	}
	public int setL2L_l_ES_USER_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ES_USER_CD == null) {
			l_l_ES_USER_CD = new ArrayList();
		} else {
			l_l_ES_USER_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ES_USER_CD.add(((KM0030010Struct) list.get(i)).getl_ES_USER_CD());
		}
		return size;
	}
	public int setL2L_l_ES_ORG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ES_ORG_CD == null) {
			l_l_ES_ORG_CD = new ArrayList();
		} else {
			l_l_ES_ORG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ES_ORG_CD.add(((KM0030010Struct) list.get(i)).getl_ES_ORG_CD());
		}
		return size;
	}
	public int setL2L_l_CUST_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_CUST_ITEM_CD == null) {
			l_l_CUST_ITEM_CD = new ArrayList();
		} else {
			l_l_CUST_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_CUST_ITEM_CD.add(((KM0030010Struct) list.get(i)).getl_CUST_ITEM_CD());
		}
		return size;
	}
	public int setL2L_l_ESTIMATE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ESTIMATE_QTY == null) {
			l_l_ESTIMATE_QTY = new ArrayList();
		} else {
			l_l_ESTIMATE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ESTIMATE_QTY.add(((KM0030010Struct) list.get(i)).getl_ESTIMATE_QTY());
		}
		return size;
	}
	public int setL2L_l_UNIT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_UNIT_CD == null) {
			l_l_UNIT_CD = new ArrayList();
		} else {
			l_l_UNIT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_UNIT_CD.add(((KM0030010Struct) list.get(i)).getl_UNIT_CD());
		}
		return size;
	}
	public int setL2L_l_ESTIMATE_UNIT_PRICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ESTIMATE_UNIT_PRICE == null) {
			l_l_ESTIMATE_UNIT_PRICE = new ArrayList();
		} else {
			l_l_ESTIMATE_UNIT_PRICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ESTIMATE_UNIT_PRICE.add(((KM0030010Struct) list.get(i)).getl_ESTIMATE_UNIT_PRICE());
		}
		return size;
	}
	public int setL2L_l_ESTIMATE_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ESTIMATE_AMOUNT == null) {
			l_l_ESTIMATE_AMOUNT = new ArrayList();
		} else {
			l_l_ESTIMATE_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ESTIMATE_AMOUNT.add(((KM0030010Struct) list.get(i)).getl_ESTIMATE_AMOUNT());
		}
		return size;
	}
	public int setL2L_l_ESTIMATE_TYPE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ESTIMATE_TYPE == null) {
			l_l_ESTIMATE_TYPE = new ArrayList();
		} else {
			l_l_ESTIMATE_TYPE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ESTIMATE_TYPE.add(((KM0030010Struct) list.get(i)).getl_ESTIMATE_TYPE());
		}
		return size;
	}
	public int setL2L_l_ESTIMATE_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ESTIMATE_ITEM_NAME == null) {
			l_l_ESTIMATE_ITEM_NAME = new ArrayList();
		} else {
			l_l_ESTIMATE_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ESTIMATE_ITEM_NAME.add(((KM0030010Struct) list.get(i)).getl_ESTIMATE_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_l_USER_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_USER_NAME == null) {
			l_l_USER_NAME = new ArrayList();
		} else {
			l_l_USER_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_USER_NAME.add(((KM0030010Struct) list.get(i)).getl_USER_NAME());
		}
		return size;
	}
	public int setL2L_l_ORG_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ORG_NAME == null) {
			l_l_ORG_NAME = new ArrayList();
		} else {
			l_l_ORG_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ORG_NAME.add(((KM0030010Struct) list.get(i)).getl_ORG_NAME());
		}
		return size;
	}
	public int setL2L_DLV_LOC_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_LOC_NAME == null) {
			l_DLV_LOC_NAME = new ArrayList();
		} else {
			l_DLV_LOC_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_LOC_NAME.add(((KM0030010Struct) list.get(i)).getDLV_LOC_NAME());
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
			l_TRANSPORT_LT.add(((KM0030010Struct) list.get(i)).getTRANSPORT_LT());
		}
		return size;
	}
	public int setL2L_TRANSPORT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TRANSPORT_CD == null) {
			l_TRANSPORT_CD = new ArrayList();
		} else {
			l_TRANSPORT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TRANSPORT_CD.add(((KM0030010Struct) list.get(i)).getTRANSPORT_CD());
		}
		return size;
	}
	public int setL2L_TRANSPORT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TRANSPORT_TYP == null) {
			l_TRANSPORT_TYP = new ArrayList();
		} else {
			l_TRANSPORT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TRANSPORT_TYP.add(((KM0030010Struct) list.get(i)).getTRANSPORT_TYP());
		}
		return size;
	}
	public int setL2L_DEPO_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEPO_WH_CD == null) {
			l_DEPO_WH_CD = new ArrayList();
		} else {
			l_DEPO_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEPO_WH_CD.add(((KM0030010Struct) list.get(i)).getDEPO_WH_CD());
		}
		return size;
	}
	public int setL2L_SHIP_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SHIP_PLANT_CD == null) {
			l_SHIP_PLANT_CD = new ArrayList();
		} else {
			l_SHIP_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SHIP_PLANT_CD.add(((KM0030010Struct) list.get(i)).getSHIP_PLANT_CD());
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
			l_ITEM_CD.add(((KM0030010Struct) list.get(i)).getITEM_CD());
		}
		return size;
	}
	public int setL2L_DEPO_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEPO_TYP == null) {
			l_DEPO_TYP = new ArrayList();
		} else {
			l_DEPO_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEPO_TYP.add(((KM0030010Struct) list.get(i)).getDEPO_TYP());
		}
		return size;
	}
	public int setL2L_CUST_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_ITEM_NAME == null) {
			l_CUST_ITEM_NAME = new ArrayList();
		} else {
			l_CUST_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_ITEM_NAME.add(((KM0030010Struct) list.get(i)).getCUST_ITEM_NAME());
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
			l_ITEM_NAME.add(((KM0030010Struct) list.get(i)).getITEM_NAME());
		}
		return size;
	}
	public int setL2L_CUST_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_ITEM_CD == null) {
			l_CUST_ITEM_CD = new ArrayList();
		} else {
			l_CUST_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_ITEM_CD.add(((KM0030010Struct) list.get(i)).getCUST_ITEM_CD());
		}
		return size;
	}
	public int setL2L_ESTIMATE_TYPE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ESTIMATE_TYPE == null) {
			l_ESTIMATE_TYPE = new ArrayList();
		} else {
			l_ESTIMATE_TYPE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ESTIMATE_TYPE.add(((KM0030010Struct) list.get(i)).getESTIMATE_TYPE());
		}
		return size;
	}
	public int setL2L_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_NO == null) {
			l_ODR_NO = new ArrayList();
		} else {
			l_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_NO.add(((KM0030010Struct) list.get(i)).getODR_NO());
		}
		return size;
	}
	public int setL2L_DETAL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DETAL_NO == null) {
			l_DETAL_NO = new ArrayList();
		} else {
			l_DETAL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DETAL_NO.add(((KM0030010Struct) list.get(i)).getDETAL_NO());
		}
		return size;
	}
	public int setL2L_l_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ODR_NO == null) {
			l_l_ODR_NO = new ArrayList();
		} else {
			l_l_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ODR_NO.add(((KM0030010Struct) list.get(i)).getl_ODR_NO());
		}
		return size;
	}
	public int setL2L_l_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ODR_TYP == null) {
			l_l_ODR_TYP = new ArrayList();
		} else {
			l_l_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ODR_TYP.add(((KM0030010Struct) list.get(i)).getl_ODR_TYP());
		}
		return size;
	}
	public int setL2L_l_CUST_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_CUST_ODR_NO == null) {
			l_l_CUST_ODR_NO = new ArrayList();
		} else {
			l_l_CUST_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_CUST_ODR_NO.add(((KM0030010Struct) list.get(i)).getl_CUST_ODR_NO());
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
			l_l_ITEM_CD.add(((KM0030010Struct) list.get(i)).getl_ITEM_CD());
		}
		return size;
	}
	public int setL2L_l_DESINATED_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DESINATED_DLV_DATE == null) {
			l_l_DESINATED_DLV_DATE = new ArrayList();
		} else {
			l_l_DESINATED_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DESINATED_DLV_DATE.add(((KM0030010Struct) list.get(i)).getl_DESINATED_DLV_DATE());
		}
		return size;
	}
	public int setL2L_l_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ODR_QTY == null) {
			l_l_ODR_QTY = new ArrayList();
		} else {
			l_l_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ODR_QTY.add(((KM0030010Struct) list.get(i)).getl_ODR_QTY());
		}
		return size;
	}
	public int setL2L_l_ODR_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ODR_AMOUNT == null) {
			l_l_ODR_AMOUNT = new ArrayList();
		} else {
			l_l_ODR_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ODR_AMOUNT.add(((KM0030010Struct) list.get(i)).getl_ODR_AMOUNT());
		}
		return size;
	}
	public int setL2L_l_ODR_AMOUNT_EXCH_RATES(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ODR_AMOUNT_EXCH_RATES == null) {
			l_l_ODR_AMOUNT_EXCH_RATES = new ArrayList();
		} else {
			l_l_ODR_AMOUNT_EXCH_RATES.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ODR_AMOUNT_EXCH_RATES.add(((KM0030010Struct) list.get(i)).getl_ODR_AMOUNT_EXCH_RATES());
		}
		return size;
	}
	public int setL2L_l_DLV_LOC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DLV_LOC_CD == null) {
			l_l_DLV_LOC_CD = new ArrayList();
		} else {
			l_l_DLV_LOC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DLV_LOC_CD.add(((KM0030010Struct) list.get(i)).getl_DLV_LOC_CD());
		}
		return size;
	}
	public int setL2L_l_DEPO_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DEPO_TYP == null) {
			l_l_DEPO_TYP = new ArrayList();
		} else {
			l_l_DEPO_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DEPO_TYP.add(((KM0030010Struct) list.get(i)).getl_DEPO_TYP());
		}
		return size;
	}
	public int setL2L_l_ODR_ACPT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ODR_ACPT_DATE == null) {
			l_l_ODR_ACPT_DATE = new ArrayList();
		} else {
			l_l_ODR_ACPT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ODR_ACPT_DATE.add(((KM0030010Struct) list.get(i)).getl_ODR_ACPT_DATE());
		}
		return size;
	}
	public int setL2L_l_REMARKS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_REMARKS == null) {
			l_l_REMARKS = new ArrayList();
		} else {
			l_l_REMARKS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_REMARKS.add(((KM0030010Struct) list.get(i)).getl_REMARKS());
		}
		return size;
	}
	public int setL2L_l_OWN_PERSON_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OWN_PERSON_CD == null) {
			l_l_OWN_PERSON_CD = new ArrayList();
		} else {
			l_l_OWN_PERSON_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OWN_PERSON_CD.add(((KM0030010Struct) list.get(i)).getl_OWN_PERSON_CD());
		}
		return size;
	}
	public int setL2L_l_TODR_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_TODR_MODIFY_COUNT == null) {
			l_l_TODR_MODIFY_COUNT = new ArrayList();
		} else {
			l_l_TODR_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_TODR_MODIFY_COUNT.add(((KM0030010Struct) list.get(i)).getl_TODR_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_l_CUST_CHRG_PSN_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_CUST_CHRG_PSN_NAME == null) {
			l_l_CUST_CHRG_PSN_NAME = new ArrayList();
		} else {
			l_l_CUST_CHRG_PSN_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_CUST_CHRG_PSN_NAME.add(((KM0030010Struct) list.get(i)).getl_CUST_CHRG_PSN_NAME());
		}
		return size;
	}
	public int setL2L_l_OWN_ORG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OWN_ORG_CD == null) {
			l_l_OWN_ORG_CD = new ArrayList();
		} else {
			l_l_OWN_ORG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OWN_ORG_CD.add(((KM0030010Struct) list.get(i)).getl_OWN_ORG_CD());
		}
		return size;
	}
	public int setL2L_l_CUST_CHRG_ORG_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_CUST_CHRG_ORG_NAME == null) {
			l_l_CUST_CHRG_ORG_NAME = new ArrayList();
		} else {
			l_l_CUST_CHRG_ORG_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_CUST_CHRG_ORG_NAME.add(((KM0030010Struct) list.get(i)).getl_CUST_CHRG_ORG_NAME());
		}
		return size;
	}
	public int setL2L_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_TYP == null) {
			l_ODR_TYP = new ArrayList();
		} else {
			l_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_TYP.add(((KM0030010Struct) list.get(i)).getODR_TYP());
		}
		return size;
	}
	public int setL2L_ODR_CTL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_CTL_NO == null) {
			l_ODR_CTL_NO = new ArrayList();
		} else {
			l_ODR_CTL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_CTL_NO.add(((KM0030010Struct) list.get(i)).getODR_CTL_NO());
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
			l_CUST_ODR_NO.add(((KM0030010Struct) list.get(i)).getCUST_ODR_NO());
		}
		return size;
	}
	public int setL2L_CUST_CHRG_ORG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_CHRG_ORG_CD == null) {
			l_CUST_CHRG_ORG_CD = new ArrayList();
		} else {
			l_CUST_CHRG_ORG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_CHRG_ORG_CD.add(((KM0030010Struct) list.get(i)).getCUST_CHRG_ORG_CD());
		}
		return size;
	}
	public int setL2L_CUST_CHRG_PSN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_CHRG_PSN_CD == null) {
			l_CUST_CHRG_PSN_CD = new ArrayList();
		} else {
			l_CUST_CHRG_PSN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_CHRG_PSN_CD.add(((KM0030010Struct) list.get(i)).getCUST_CHRG_PSN_CD());
		}
		return size;
	}
	public int setL2L_ODR_ACPT_PSN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_ACPT_PSN_CD == null) {
			l_ODR_ACPT_PSN_CD = new ArrayList();
		} else {
			l_ODR_ACPT_PSN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_ACPT_PSN_CD.add(((KM0030010Struct) list.get(i)).getODR_ACPT_PSN_CD());
		}
		return size;
	}
	public int setL2L_CURRNCY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CURRNCY_CD == null) {
			l_CURRNCY_CD = new ArrayList();
		} else {
			l_CURRNCY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CURRNCY_CD.add(((KM0030010Struct) list.get(i)).getCURRNCY_CD());
		}
		return size;
	}
	public int setL2L_DLV_LOC_NAME_KANJI(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_LOC_NAME_KANJI == null) {
			l_DLV_LOC_NAME_KANJI = new ArrayList();
		} else {
			l_DLV_LOC_NAME_KANJI.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_LOC_NAME_KANJI.add(((KM0030010Struct) list.get(i)).getDLV_LOC_NAME_KANJI());
		}
		return size;
	}
	public int setL2L_ODR_UNIT_PRICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_UNIT_PRICE == null) {
			l_ODR_UNIT_PRICE = new ArrayList();
		} else {
			l_ODR_UNIT_PRICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_UNIT_PRICE.add(((KM0030010Struct) list.get(i)).getODR_UNIT_PRICE());
		}
		return size;
	}
	public int setL2L_SPCL_PRICE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SPCL_PRICE_TYP == null) {
			l_SPCL_PRICE_TYP = new ArrayList();
		} else {
			l_SPCL_PRICE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SPCL_PRICE_TYP.add(((KM0030010Struct) list.get(i)).getSPCL_PRICE_TYP());
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
			l_DESINATED_DLV_DATE.add(((KM0030010Struct) list.get(i)).getDESINATED_DLV_DATE());
		}
		return size;
	}
	public int setL2L_STD_DESINATED_RCV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STD_DESINATED_RCV_DATE == null) {
			l_STD_DESINATED_RCV_DATE = new ArrayList();
		} else {
			l_STD_DESINATED_RCV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STD_DESINATED_RCV_DATE.add(((KM0030010Struct) list.get(i)).getSTD_DESINATED_RCV_DATE());
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
			l_ODR_QTY.add(((KM0030010Struct) list.get(i)).getODR_QTY());
		}
		return size;
	}
	public int setL2L_REMAIN_UNCONFIRM_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_REMAIN_UNCONFIRM_ODR_QTY == null) {
			l_REMAIN_UNCONFIRM_ODR_QTY = new ArrayList();
		} else {
			l_REMAIN_UNCONFIRM_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_REMAIN_UNCONFIRM_ODR_QTY.add(((KM0030010Struct) list.get(i)).getREMAIN_UNCONFIRM_ODR_QTY());
		}
		return size;
	}
	public int setL2L_CANCELED_UNCONFIRM_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CANCELED_UNCONFIRM_ODR_QTY == null) {
			l_CANCELED_UNCONFIRM_ODR_QTY = new ArrayList();
		} else {
			l_CANCELED_UNCONFIRM_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CANCELED_UNCONFIRM_ODR_QTY.add(((KM0030010Struct) list.get(i)).getCANCELED_UNCONFIRM_ODR_QTY());
		}
		return size;
	}
	public int setL2L_UNIT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_CD == null) {
			l_UNIT_CD = new ArrayList();
		} else {
			l_UNIT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_CD.add(((KM0030010Struct) list.get(i)).getUNIT_CD());
		}
		return size;
	}
	public int setL2L_UNCONFIRM_ODR_BALANCE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNCONFIRM_ODR_BALANCE == null) {
			l_UNCONFIRM_ODR_BALANCE = new ArrayList();
		} else {
			l_UNCONFIRM_ODR_BALANCE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNCONFIRM_ODR_BALANCE.add(((KM0030010Struct) list.get(i)).getUNCONFIRM_ODR_BALANCE());
		}
		return size;
	}
	public int setL2L_ODR_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_AMOUNT == null) {
			l_ODR_AMOUNT = new ArrayList();
		} else {
			l_ODR_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_AMOUNT.add(((KM0030010Struct) list.get(i)).getODR_AMOUNT());
		}
		return size;
	}
	public int setL2L_ODR_AMOUNT_EXCH_RATES(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_AMOUNT_EXCH_RATES == null) {
			l_ODR_AMOUNT_EXCH_RATES = new ArrayList();
		} else {
			l_ODR_AMOUNT_EXCH_RATES.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_AMOUNT_EXCH_RATES.add(((KM0030010Struct) list.get(i)).getODR_AMOUNT_EXCH_RATES());
		}
		return size;
	}
	public int setL2L_ODR_CMPLT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_CMPLT_FLG == null) {
			l_ODR_CMPLT_FLG = new ArrayList();
		} else {
			l_ODR_CMPLT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_CMPLT_FLG.add(((KM0030010Struct) list.get(i)).getODR_CMPLT_FLG());
		}
		return size;
	}
	public int setL2L_PART_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PART_NAME == null) {
			l_PART_NAME = new ArrayList();
		} else {
			l_PART_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PART_NAME.add(((KM0030010Struct) list.get(i)).getPART_NAME());
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
			l_REMARKS.add(((KM0030010Struct) list.get(i)).getREMARKS());
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
			l_ODR_ACPT_DATE.add(((KM0030010Struct) list.get(i)).getODR_ACPT_DATE());
		}
		return size;
	}
	public int setL2L_SHIP_PLAN_REMAIN_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SHIP_PLAN_REMAIN_QTY == null) {
			l_SHIP_PLAN_REMAIN_QTY = new ArrayList();
		} else {
			l_SHIP_PLAN_REMAIN_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SHIP_PLAN_REMAIN_QTY.add(((KM0030010Struct) list.get(i)).getSHIP_PLAN_REMAIN_QTY());
		}
		return size;
	}
	public int setL2L_SHIP_PLAN_CMPLT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SHIP_PLAN_CMPLT_FLG == null) {
			l_SHIP_PLAN_CMPLT_FLG = new ArrayList();
		} else {
			l_SHIP_PLAN_CMPLT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SHIP_PLAN_CMPLT_FLG.add(((KM0030010Struct) list.get(i)).getSHIP_PLAN_CMPLT_FLG());
		}
		return size;
	}
	public int setL2L_UNCONFIRMED_ODR_EFF_OVR_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNCONFIRMED_ODR_EFF_OVR_FLG == null) {
			l_UNCONFIRMED_ODR_EFF_OVR_FLG = new ArrayList();
		} else {
			l_UNCONFIRMED_ODR_EFF_OVR_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNCONFIRMED_ODR_EFF_OVR_FLG.add(((KM0030010Struct) list.get(i)).getUNCONFIRMED_ODR_EFF_OVR_FLG());
		}
		return size;
	}
	public int setL2L_ENTRY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ENTRY_TYP == null) {
			l_ENTRY_TYP = new ArrayList();
		} else {
			l_ENTRY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ENTRY_TYP.add(((KM0030010Struct) list.get(i)).getENTRY_TYP());
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
			l_DEL_FLG.add(((KM0030010Struct) list.get(i)).getDEL_FLG());
		}
		return size;
	}
	public int setL2L_JOB_ODR_SET_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_SET_FLG == null) {
			l_JOB_ODR_SET_FLG = new ArrayList();
		} else {
			l_JOB_ODR_SET_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_SET_FLG.add(((KM0030010Struct) list.get(i)).getJOB_ODR_SET_FLG());
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
			l_SLIP_CD.add(((KM0030010Struct) list.get(i)).getSLIP_CD());
		}
		return size;
	}
	public int setL2L_ORGN_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ORGN_ODR_NO == null) {
			l_ORGN_ODR_NO = new ArrayList();
		} else {
			l_ORGN_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ORGN_ODR_NO.add(((KM0030010Struct) list.get(i)).getORGN_ODR_NO());
		}
		return size;
	}
	public int setL2L_ADD_ODR_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ADD_ODR_FLG == null) {
			l_ADD_ODR_FLG = new ArrayList();
		} else {
			l_ADD_ODR_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ADD_ODR_FLG.add(((KM0030010Struct) list.get(i)).getADD_ODR_FLG());
		}
		return size;
	}
	public int setL2L_ODR_CMPLT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_CMPLT_DATE == null) {
			l_ODR_CMPLT_DATE = new ArrayList();
		} else {
			l_ODR_CMPLT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_CMPLT_DATE.add(((KM0030010Struct) list.get(i)).getODR_CMPLT_DATE());
		}
		return size;
	}
	public int setL2L_ODR_ACPT_ORG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_ACPT_ORG_CD == null) {
			l_ODR_ACPT_ORG_CD = new ArrayList();
		} else {
			l_ODR_ACPT_ORG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_ACPT_ORG_CD.add(((KM0030010Struct) list.get(i)).getODR_ACPT_ORG_CD());
		}
		return size;
	}
	public int setL2L_ESTIMATE_STAT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ESTIMATE_STAT == null) {
			l_ESTIMATE_STAT = new ArrayList();
		} else {
			l_ESTIMATE_STAT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ESTIMATE_STAT.add(((KM0030010Struct) list.get(i)).getESTIMATE_STAT());
		}
		return size;
	}
	public int setL2L_ES_ORG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ES_ORG_CD == null) {
			l_ES_ORG_CD = new ArrayList();
		} else {
			l_ES_ORG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ES_ORG_CD.add(((KM0030010Struct) list.get(i)).getES_ORG_CD());
		}
		return size;
	}
	public int setL2L_ES_USER_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ES_USER_CD == null) {
			l_ES_USER_CD = new ArrayList();
		} else {
			l_ES_USER_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ES_USER_CD.add(((KM0030010Struct) list.get(i)).getES_USER_CD());
		}
		return size;
	}
	public int setL2L_ESTIMATE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ESTIMATE_QTY == null) {
			l_ESTIMATE_QTY = new ArrayList();
		} else {
			l_ESTIMATE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ESTIMATE_QTY.add(((KM0030010Struct) list.get(i)).getESTIMATE_QTY());
		}
		return size;
	}
	public int setL2L_ESTIMATE_UNIT_PRICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ESTIMATE_UNIT_PRICE == null) {
			l_ESTIMATE_UNIT_PRICE = new ArrayList();
		} else {
			l_ESTIMATE_UNIT_PRICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ESTIMATE_UNIT_PRICE.add(((KM0030010Struct) list.get(i)).getESTIMATE_UNIT_PRICE());
		}
		return size;
	}
	public int setL2L_ESTIMATE_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ESTIMATE_AMOUNT == null) {
			l_ESTIMATE_AMOUNT = new ArrayList();
		} else {
			l_ESTIMATE_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ESTIMATE_AMOUNT.add(((KM0030010Struct) list.get(i)).getESTIMATE_AMOUNT());
		}
		return size;
	}
	public int setL2L_ODR_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_FLG == null) {
			l_ODR_FLG = new ArrayList();
		} else {
			l_ODR_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_FLG.add(((KM0030010Struct) list.get(i)).getODR_FLG());
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
			l_JOB_ODR_CD.add(((KM0030010Struct) list.get(i)).getJOB_ODR_CD());
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
			l_CAL_NO.add(((KM0030010Struct) list.get(i)).getCAL_NO());
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
			l_JOB_ODR_DLV_DATE.add(((KM0030010Struct) list.get(i)).getJOB_ODR_DLV_DATE());
		}
		return size;
	}
	public int setL2L_RSLT_CTL_SEQ_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RSLT_CTL_SEQ_CD == null) {
			l_RSLT_CTL_SEQ_CD = new ArrayList();
		} else {
			l_RSLT_CTL_SEQ_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RSLT_CTL_SEQ_CD.add(((KM0030010Struct) list.get(i)).getRSLT_CTL_SEQ_CD());
		}
		return size;
	}
	public int setL2L_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT == null) {
			l_UNIT = new ArrayList();
		} else {
			l_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT.add(((KM0030010Struct) list.get(i)).getUNIT());
		}
		return size;
	}
	public int setL2L_DLV_PLACE_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_PLACE_CD == null) {
			l_DLV_PLACE_CD = new ArrayList();
		} else {
			l_DLV_PLACE_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_PLACE_CD.add(((KM0030010Struct) list.get(i)).getDLV_PLACE_CD());
		}
		return size;
	}
	public int setL2L_UNIT_PRICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_PRICE == null) {
			l_UNIT_PRICE = new ArrayList();
		} else {
			l_UNIT_PRICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_PRICE.add(((KM0030010Struct) list.get(i)).getUNIT_PRICE());
		}
		return size;
	}
	public int setL2L_SPCL_PRICE_CO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SPCL_PRICE_CO == null) {
			l_SPCL_PRICE_CO = new ArrayList();
		} else {
			l_SPCL_PRICE_CO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SPCL_PRICE_CO.add(((KM0030010Struct) list.get(i)).getSPCL_PRICE_CO());
		}
		return size;
	}
	public int setL2L_CUST_DLV_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_DLV_CD == null) {
			l_CUST_DLV_CD = new ArrayList();
		} else {
			l_CUST_DLV_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_DLV_CD.add(((KM0030010Struct) list.get(i)).getCUST_DLV_CD());
		}
		return size;
	}
	public int setL2L_CUST_DLV_KEY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_DLV_KEY_CD == null) {
			l_CUST_DLV_KEY_CD = new ArrayList();
		} else {
			l_CUST_DLV_KEY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_DLV_KEY_CD.add(((KM0030010Struct) list.get(i)).getCUST_DLV_KEY_CD());
		}
		return size;
	}
	public int setL2L_IF_CTL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IF_CTL_NO == null) {
			l_IF_CTL_NO = new ArrayList();
		} else {
			l_IF_CTL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IF_CTL_NO.add(((KM0030010Struct) list.get(i)).getIF_CTL_NO());
		}
		return size;
	}
	public int setL2L_ODR_SEQ(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_SEQ == null) {
			l_ODR_SEQ = new ArrayList();
		} else {
			l_ODR_SEQ.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_SEQ.add(((KM0030010Struct) list.get(i)).getODR_SEQ());
		}
		return size;
	}
	public int setL2L_PART_DLV_SEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PART_DLV_SEQ_NO == null) {
			l_PART_DLV_SEQ_NO = new ArrayList();
		} else {
			l_PART_DLV_SEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PART_DLV_SEQ_NO.add(((KM0030010Struct) list.get(i)).getPART_DLV_SEQ_NO());
		}
		return size;
	}
	public int setL2L_LAST_ANS_DLV_DATE_RCD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LAST_ANS_DLV_DATE_RCD == null) {
			l_LAST_ANS_DLV_DATE_RCD = new ArrayList();
		} else {
			l_LAST_ANS_DLV_DATE_RCD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LAST_ANS_DLV_DATE_RCD.add(((KM0030010Struct) list.get(i)).getLAST_ANS_DLV_DATE_RCD());
		}
		return size;
	}
	public int setL2L_DESINATED_SHIP_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DESINATED_SHIP_DATE == null) {
			l_DESINATED_SHIP_DATE = new ArrayList();
		} else {
			l_DESINATED_SHIP_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DESINATED_SHIP_DATE.add(((KM0030010Struct) list.get(i)).getDESINATED_SHIP_DATE());
		}
		return size;
	}
	public int setL2L_DESINATED_SHIP_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DESINATED_SHIP_QTY == null) {
			l_DESINATED_SHIP_QTY = new ArrayList();
		} else {
			l_DESINATED_SHIP_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DESINATED_SHIP_QTY.add(((KM0030010Struct) list.get(i)).getDESINATED_SHIP_QTY());
		}
		return size;
	}
	public int setL2L_REST_SHIP_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_REST_SHIP_ODR_QTY == null) {
			l_REST_SHIP_ODR_QTY = new ArrayList();
		} else {
			l_REST_SHIP_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_REST_SHIP_ODR_QTY.add(((KM0030010Struct) list.get(i)).getREST_SHIP_ODR_QTY());
		}
		return size;
	}
	public int setL2L_SHIP_ODR_CMPLT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SHIP_ODR_CMPLT_FLG == null) {
			l_SHIP_ODR_CMPLT_FLG = new ArrayList();
		} else {
			l_SHIP_ODR_CMPLT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SHIP_ODR_CMPLT_FLG.add(((KM0030010Struct) list.get(i)).getSHIP_ODR_CMPLT_FLG());
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
			l_JOB_ODR_CANCEL_NO.add(((KM0030010Struct) list.get(i)).getJOB_ODR_CANCEL_NO());
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
			l_JOB_ODR_TYP.add(((KM0030010Struct) list.get(i)).getJOB_ODR_TYP());
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
			l_PLAN_TYP.add(((KM0030010Struct) list.get(i)).getPLAN_TYP());
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
			l_JOB_ODR_QTY.add(((KM0030010Struct) list.get(i)).getJOB_ODR_QTY());
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
			l_ALC_GRP_CD.add(((KM0030010Struct) list.get(i)).getALC_GRP_CD());
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
			l_JOB_ODR_STS_TYP.add(((KM0030010Struct) list.get(i)).getJOB_ODR_STS_TYP());
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
			l_JOB_ODR_EXP_TYP.add(((KM0030010Struct) list.get(i)).getJOB_ODR_EXP_TYP());
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
			l_JOB_ODR_DEL_FLG.add(((KM0030010Struct) list.get(i)).getJOB_ODR_DEL_FLG());
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
			l_ALCD_QTY.add(((KM0030010Struct) list.get(i)).getALCD_QTY());
		}
		return size;
	}
	public int setL2L_CUS_DLV_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUS_DLV_CD == null) {
			l_CUS_DLV_CD = new ArrayList();
		} else {
			l_CUS_DLV_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUS_DLV_CD.add(((KM0030010Struct) list.get(i)).getCUS_DLV_CD());
		}
		return size;
	}
	public int setL2L_CUS_DLV_KEY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUS_DLV_KEY_CD == null) {
			l_CUS_DLV_KEY_CD = new ArrayList();
		} else {
			l_CUS_DLV_KEY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUS_DLV_KEY_CD.add(((KM0030010Struct) list.get(i)).getCUS_DLV_KEY_CD());
		}
		return size;
	}
	public int setL2L_UNOFFICIAL_RECEIPT_FLAG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNOFFICIAL_RECEIPT_FLAG == null) {
			l_UNOFFICIAL_RECEIPT_FLAG = new ArrayList();
		} else {
			l_UNOFFICIAL_RECEIPT_FLAG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNOFFICIAL_RECEIPT_FLAG.add(((KM0030010Struct) list.get(i)).getUNOFFICIAL_RECEIPT_FLAG());
		}
		return size;
	}
	public int setL2L_JOB_OD_CD_PREFIX(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_OD_CD_PREFIX == null) {
			l_JOB_OD_CD_PREFIX = new ArrayList();
		} else {
			l_JOB_OD_CD_PREFIX.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_OD_CD_PREFIX.add(((KM0030010Struct) list.get(i)).getJOB_OD_CD_PREFIX());
		}
		return size;
	}
	public int setL2L_CTL_SEQ_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CTL_SEQ_CD == null) {
			l_CTL_SEQ_CD = new ArrayList();
		} else {
			l_CTL_SEQ_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CTL_SEQ_CD.add(((KM0030010Struct) list.get(i)).getCTL_SEQ_CD());
		}
		return size;
	}
	public int setL2L_NEW_OLD_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NEW_OLD_FLG == null) {
			l_NEW_OLD_FLG = new ArrayList();
		} else {
			l_NEW_OLD_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NEW_OLD_FLG.add(((KM0030010Struct) list.get(i)).getNEW_OLD_FLG());
		}
		return size;
	}
	public int setL2L_TRAN_TYPE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TRAN_TYPE == null) {
			l_TRAN_TYPE = new ArrayList();
		} else {
			l_TRAN_TYPE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TRAN_TYPE.add(((KM0030010Struct) list.get(i)).getTRAN_TYPE());
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
			l_EXCH_RATE.add(((KM0030010Struct) list.get(i)).getEXCH_RATE());
		}
		return size;
	}
	public int setL2L_ORG_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ORG_NAME == null) {
			l_ORG_NAME = new ArrayList();
		} else {
			l_ORG_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ORG_NAME.add(((KM0030010Struct) list.get(i)).getORG_NAME());
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
			l_ORG_CD.add(((KM0030010Struct) list.get(i)).getORG_CD());
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
			l_USER_NAME.add(((KM0030010Struct) list.get(i)).getUSER_NAME());
		}
		return size;
	}
	public int setL2L_USER_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_USER_CD == null) {
			l_USER_CD = new ArrayList();
		} else {
			l_USER_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_USER_CD.add(((KM0030010Struct) list.get(i)).getUSER_CD());
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
			l_UNIT_QTY_TYP.add(((KM0030010Struct) list.get(i)).getUNIT_QTY_TYP());
		}
		return size;
	}
	public int setL2L_l_h_ANS_DLV_DATE_EXIST_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_h_ANS_DLV_DATE_EXIST_FLG == null) {
			l_l_h_ANS_DLV_DATE_EXIST_FLG = new ArrayList();
		} else {
			l_l_h_ANS_DLV_DATE_EXIST_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_h_ANS_DLV_DATE_EXIST_FLG.add(((KM0030010Struct) list.get(i)).getl_h_ANS_DLV_DATE_EXIST_FLG());
		}
		return size;
	}
	public int setL2L_FIELD_VALUE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FIELD_VALUE == null) {
			l_FIELD_VALUE = new ArrayList();
		} else {
			l_FIELD_VALUE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FIELD_VALUE.add(((KM0030010Struct) list.get(i)).getFIELD_VALUE());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_rdoSHIP_INST = null;
		m_rdoSHIP_UPDATE = null;
		m_l_CUR_UNIT = null;
		m_DETAIL_NO = null;
		m_ACPT_ODR_CD = null;
		m_c_DOODR = null;
		m_PREPARE_QTY = null;
		m_c_INPUTODRCD = null;
		m_QTY = null;
		m_QTY_UNIT = null;
		m_ODR_PRICE_UNIT = null;
		m_ISSUE_INST_COMMENT = null;
		m_APPROVED_COMMENT = null;
		m_CUST_CHRG_PSN_NAME = null;
		m_ES_ORG_NAME = null;
		m_l_DLV_LOC_NAME = null;
		m_l_CUST_ITEM_NAME = null;
		m_l_ITEM_NAME = null;
		m_l_JOB_ODR_DLV_DATE = null;
		m_l_ALC_GRP_CD = null;
		m_l_JOB_ODR_CD = null;
		m_l_APPR_REMARKS = null;
		m_h_UPDATE_FLG = null;
		m_l_TEST_MODIFY_COUNT = null;
		m_l_TPJ_MODIFY_COUNT = null;
		m_l_h_ESTIMATE_TYPE = null;
		m_h_ESTIMATE_TYPE = null;
		m_l_h_PREC_ARRANGE_FLG = null;
		m_l_c_DOODR = null;
		m_l_c_INPUTODRCD = null;
		m_h_PREC_ARRANGE_FLG = null;
		m_l_h_ODR_TYP = null;
		m_h_ODR_TYP = null;
		m_h_ODR_TYP3 = null;
		m_h_APR_ODR = null;
		m_h_PRD_REQ_JOB_ODR_TYP_1 = null;
		m_h_PRD_REQ_JOB_ODR_TYP_2 = null;
		m_h_DLV_LOC_CD = null;
		m_h_ANS_DLV_DATE_EXIST_FLG = null;
		m_ITEM_NAME_R = null;
		m_l_h_DEPO_TYP = null;
		m_PROJECT_CD = null;
		m_ESTIMATE_NO = null;
		m_l_DETAL_NO = null;
		m_CUST_NAME = null;
		m_COMPANY_CD = null;
		m_CODE = null;
		m_SYS_CLASS = null;
		m_CLASS_CODE = null;
		m_BUSINESS_OPR_DATE = null;
		m_PLANT_CD = null;
		m_HOME_CUR_CD = null;
		m_VALUE = null;
		m_NAME = null;
		m_PROJECT_NAME = null;
		m_CUST_CD = null;
		m_PROJECT_STAT = null;
		m_DLV_LOC_CD = null;
		m_MODIFY_COUNT = null;
		m_CUR_CD = null;
		m_EXCH_TYP = null;
		m_TAX_APPLY_TYP = null;
		m_TAX_CD = null;
		m_TAX_CALC_TYP = null;
		m_PARTIAL_SHIP_INST_FLG = null;
		m_CUR_NAME = null;
		m_CUR_UNIT = null;
		m_DECIMAL_FIG = null;
		m_l_ES_USER_CD = null;
		m_l_ES_ORG_CD = null;
		m_l_CUST_ITEM_CD = null;
		m_l_ESTIMATE_QTY = null;
		m_l_UNIT_CD = null;
		m_l_ESTIMATE_UNIT_PRICE = null;
		m_l_ESTIMATE_AMOUNT = null;
		m_l_ESTIMATE_TYPE = null;
		m_l_ESTIMATE_ITEM_NAME = null;
		m_l_USER_NAME = null;
		m_l_ORG_NAME = null;
		m_DLV_LOC_NAME = null;
		m_TRANSPORT_LT = null;
		m_TRANSPORT_CD = null;
		m_TRANSPORT_TYP = null;
		m_DEPO_WH_CD = null;
		m_SHIP_PLANT_CD = null;
		m_ITEM_CD = null;
		m_DEPO_TYP = null;
		m_CUST_ITEM_NAME = null;
		m_ITEM_NAME = null;
		m_CUST_ITEM_CD = null;
		m_ESTIMATE_TYPE = null;
		m_ODR_NO = null;
		m_DETAL_NO = null;
		m_l_ODR_NO = null;
		m_l_ODR_TYP = null;
		m_l_CUST_ODR_NO = null;
		m_l_ITEM_CD = null;
		m_l_DESINATED_DLV_DATE = null;
		m_l_ODR_QTY = null;
		m_l_ODR_AMOUNT = null;
		m_l_ODR_AMOUNT_EXCH_RATES = null;
		m_l_DLV_LOC_CD = null;
		m_l_DEPO_TYP = null;
		m_l_ODR_ACPT_DATE = null;
		m_l_REMARKS = null;
		m_l_OWN_PERSON_CD = null;
		m_l_TODR_MODIFY_COUNT = null;
		m_l_CUST_CHRG_PSN_NAME = null;
		m_l_OWN_ORG_CD = null;
		m_l_CUST_CHRG_ORG_NAME = null;
		m_ODR_TYP = null;
		m_ODR_CTL_NO = null;
		m_CUST_ODR_NO = null;
		m_CUST_CHRG_ORG_CD = null;
		m_CUST_CHRG_PSN_CD = null;
		m_ODR_ACPT_PSN_CD = null;
		m_CURRNCY_CD = null;
		m_DLV_LOC_NAME_KANJI = null;
		m_ODR_UNIT_PRICE = null;
		m_SPCL_PRICE_TYP = null;
		m_DESINATED_DLV_DATE = null;
		m_STD_DESINATED_RCV_DATE = null;
		m_ODR_QTY = null;
		m_REMAIN_UNCONFIRM_ODR_QTY = null;
		m_CANCELED_UNCONFIRM_ODR_QTY = null;
		m_UNIT_CD = null;
		m_UNCONFIRM_ODR_BALANCE = null;
		m_ODR_AMOUNT = null;
		m_ODR_AMOUNT_EXCH_RATES = null;
		m_ODR_CMPLT_FLG = null;
		m_PART_NAME = null;
		m_REMARKS = null;
		m_ODR_ACPT_DATE = null;
		m_SHIP_PLAN_REMAIN_QTY = null;
		m_SHIP_PLAN_CMPLT_FLG = null;
		m_UNCONFIRMED_ODR_EFF_OVR_FLG = null;
		m_ENTRY_TYP = null;
		m_DEL_FLG = null;
		m_JOB_ODR_SET_FLG = null;
		m_SLIP_CD = null;
		m_ORGN_ODR_NO = null;
		m_ADD_ODR_FLG = null;
		m_ODR_CMPLT_DATE = null;
		m_ODR_ACPT_ORG_CD = null;
		m_ESTIMATE_STAT = null;
		m_ES_ORG_CD = null;
		m_ES_USER_CD = null;
		m_ESTIMATE_QTY = null;
		m_ESTIMATE_UNIT_PRICE = null;
		m_ESTIMATE_AMOUNT = null;
		m_ODR_FLG = null;
		m_JOB_ODR_CD = null;
		m_CAL_NO = null;
		m_JOB_ODR_DLV_DATE = null;
		m_RSLT_CTL_SEQ_CD = null;
		m_UNIT = null;
		m_DLV_PLACE_CD = null;
		m_UNIT_PRICE = null;
		m_SPCL_PRICE_CO = null;
		m_CUST_DLV_CD = null;
		m_CUST_DLV_KEY_CD = null;
		m_IF_CTL_NO = null;
		m_ODR_SEQ = null;
		m_PART_DLV_SEQ_NO = null;
		m_LAST_ANS_DLV_DATE_RCD = null;
		m_DESINATED_SHIP_DATE = null;
		m_DESINATED_SHIP_QTY = null;
		m_REST_SHIP_ODR_QTY = null;
		m_SHIP_ODR_CMPLT_FLG = null;
		m_JOB_ODR_CANCEL_NO = null;
		m_JOB_ODR_TYP = null;
		m_PLAN_TYP = null;
		m_JOB_ODR_QTY = null;
		m_ALC_GRP_CD = null;
		m_JOB_ODR_STS_TYP = null;
		m_JOB_ODR_EXP_TYP = null;
		m_JOB_ODR_DEL_FLG = null;
		m_ALCD_QTY = null;
		m_CUS_DLV_CD = null;
		m_CUS_DLV_KEY_CD = null;
		m_UNOFFICIAL_RECEIPT_FLAG = null;
		m_JOB_OD_CD_PREFIX = null;
		m_CTL_SEQ_CD = null;
		m_NEW_OLD_FLG = null;
		m_TRAN_TYPE = null;
		m_EXCH_RATE = null;
		m_ORG_NAME = null;
		m_ORG_CD = null;
		m_USER_NAME = null;
		m_USER_CD = null;
		m_UNIT_QTY_TYP = null;
		m_l_h_ANS_DLV_DATE_EXIST_FLG = null;
		m_FIELD_VALUE = null;

		l_rdoSHIP_INST = null;
		l_rdoSHIP_UPDATE = null;
		l_l_CUR_UNIT = null;
		l_DETAIL_NO = null;
		l_ACPT_ODR_CD = null;
		l_c_DOODR = null;
		l_PREPARE_QTY = null;
		l_c_INPUTODRCD = null;
		l_QTY = null;
		l_QTY_UNIT = null;
		l_ODR_PRICE_UNIT = null;
		l_ISSUE_INST_COMMENT = null;
		l_APPROVED_COMMENT = null;
		l_CUST_CHRG_PSN_NAME = null;
		l_ES_ORG_NAME = null;
		l_l_DLV_LOC_NAME = null;
		l_l_CUST_ITEM_NAME = null;
		l_l_ITEM_NAME = null;
		l_l_JOB_ODR_DLV_DATE = null;
		l_l_ALC_GRP_CD = null;
		l_l_JOB_ODR_CD = null;
		l_l_APPR_REMARKS = null;
		l_h_UPDATE_FLG = null;
		l_l_TEST_MODIFY_COUNT = null;
		l_l_TPJ_MODIFY_COUNT = null;
		l_l_h_ESTIMATE_TYPE = null;
		l_h_ESTIMATE_TYPE = null;
		l_l_h_PREC_ARRANGE_FLG = null;
		l_l_c_DOODR = null;
		l_l_c_INPUTODRCD = null;
		l_h_PREC_ARRANGE_FLG = null;
		l_l_h_ODR_TYP = null;
		l_h_ODR_TYP = null;
		l_h_ODR_TYP3 = null;
		l_h_APR_ODR = null;
		l_h_PRD_REQ_JOB_ODR_TYP_1 = null;
		l_h_PRD_REQ_JOB_ODR_TYP_2 = null;
		l_h_DLV_LOC_CD = null;
		l_h_ANS_DLV_DATE_EXIST_FLG = null;
		l_ITEM_NAME_R = null;
		l_l_h_DEPO_TYP = null;
		l_PROJECT_CD = null;
		l_ESTIMATE_NO = null;
		l_l_DETAL_NO = null;
		l_CUST_NAME = null;
		l_COMPANY_CD = null;
		l_CODE = null;
		l_SYS_CLASS = null;
		l_CLASS_CODE = null;
		l_BUSINESS_OPR_DATE = null;
		l_PLANT_CD = null;
		l_HOME_CUR_CD = null;
		l_VALUE = null;
		l_NAME = null;
		l_PROJECT_NAME = null;
		l_CUST_CD = null;
		l_PROJECT_STAT = null;
		l_DLV_LOC_CD = null;
		l_MODIFY_COUNT = null;
		l_CUR_CD = null;
		l_EXCH_TYP = null;
		l_TAX_APPLY_TYP = null;
		l_TAX_CD = null;
		l_TAX_CALC_TYP = null;
		l_PARTIAL_SHIP_INST_FLG = null;
		l_CUR_NAME = null;
		l_CUR_UNIT = null;
		l_DECIMAL_FIG = null;
		l_l_ES_USER_CD = null;
		l_l_ES_ORG_CD = null;
		l_l_CUST_ITEM_CD = null;
		l_l_ESTIMATE_QTY = null;
		l_l_UNIT_CD = null;
		l_l_ESTIMATE_UNIT_PRICE = null;
		l_l_ESTIMATE_AMOUNT = null;
		l_l_ESTIMATE_TYPE = null;
		l_l_ESTIMATE_ITEM_NAME = null;
		l_l_USER_NAME = null;
		l_l_ORG_NAME = null;
		l_DLV_LOC_NAME = null;
		l_TRANSPORT_LT = null;
		l_TRANSPORT_CD = null;
		l_TRANSPORT_TYP = null;
		l_DEPO_WH_CD = null;
		l_SHIP_PLANT_CD = null;
		l_ITEM_CD = null;
		l_DEPO_TYP = null;
		l_CUST_ITEM_NAME = null;
		l_ITEM_NAME = null;
		l_CUST_ITEM_CD = null;
		l_ESTIMATE_TYPE = null;
		l_ODR_NO = null;
		l_DETAL_NO = null;
		l_l_ODR_NO = null;
		l_l_ODR_TYP = null;
		l_l_CUST_ODR_NO = null;
		l_l_ITEM_CD = null;
		l_l_DESINATED_DLV_DATE = null;
		l_l_ODR_QTY = null;
		l_l_ODR_AMOUNT = null;
		l_l_ODR_AMOUNT_EXCH_RATES = null;
		l_l_DLV_LOC_CD = null;
		l_l_DEPO_TYP = null;
		l_l_ODR_ACPT_DATE = null;
		l_l_REMARKS = null;
		l_l_OWN_PERSON_CD = null;
		l_l_TODR_MODIFY_COUNT = null;
		l_l_CUST_CHRG_PSN_NAME = null;
		l_l_OWN_ORG_CD = null;
		l_l_CUST_CHRG_ORG_NAME = null;
		l_ODR_TYP = null;
		l_ODR_CTL_NO = null;
		l_CUST_ODR_NO = null;
		l_CUST_CHRG_ORG_CD = null;
		l_CUST_CHRG_PSN_CD = null;
		l_ODR_ACPT_PSN_CD = null;
		l_CURRNCY_CD = null;
		l_DLV_LOC_NAME_KANJI = null;
		l_ODR_UNIT_PRICE = null;
		l_SPCL_PRICE_TYP = null;
		l_DESINATED_DLV_DATE = null;
		l_STD_DESINATED_RCV_DATE = null;
		l_ODR_QTY = null;
		l_REMAIN_UNCONFIRM_ODR_QTY = null;
		l_CANCELED_UNCONFIRM_ODR_QTY = null;
		l_UNIT_CD = null;
		l_UNCONFIRM_ODR_BALANCE = null;
		l_ODR_AMOUNT = null;
		l_ODR_AMOUNT_EXCH_RATES = null;
		l_ODR_CMPLT_FLG = null;
		l_PART_NAME = null;
		l_REMARKS = null;
		l_ODR_ACPT_DATE = null;
		l_SHIP_PLAN_REMAIN_QTY = null;
		l_SHIP_PLAN_CMPLT_FLG = null;
		l_UNCONFIRMED_ODR_EFF_OVR_FLG = null;
		l_ENTRY_TYP = null;
		l_DEL_FLG = null;
		l_JOB_ODR_SET_FLG = null;
		l_SLIP_CD = null;
		l_ORGN_ODR_NO = null;
		l_ADD_ODR_FLG = null;
		l_ODR_CMPLT_DATE = null;
		l_ODR_ACPT_ORG_CD = null;
		l_ESTIMATE_STAT = null;
		l_ES_ORG_CD = null;
		l_ES_USER_CD = null;
		l_ESTIMATE_QTY = null;
		l_ESTIMATE_UNIT_PRICE = null;
		l_ESTIMATE_AMOUNT = null;
		l_ODR_FLG = null;
		l_JOB_ODR_CD = null;
		l_CAL_NO = null;
		l_JOB_ODR_DLV_DATE = null;
		l_RSLT_CTL_SEQ_CD = null;
		l_UNIT = null;
		l_DLV_PLACE_CD = null;
		l_UNIT_PRICE = null;
		l_SPCL_PRICE_CO = null;
		l_CUST_DLV_CD = null;
		l_CUST_DLV_KEY_CD = null;
		l_IF_CTL_NO = null;
		l_ODR_SEQ = null;
		l_PART_DLV_SEQ_NO = null;
		l_LAST_ANS_DLV_DATE_RCD = null;
		l_DESINATED_SHIP_DATE = null;
		l_DESINATED_SHIP_QTY = null;
		l_REST_SHIP_ODR_QTY = null;
		l_SHIP_ODR_CMPLT_FLG = null;
		l_JOB_ODR_CANCEL_NO = null;
		l_JOB_ODR_TYP = null;
		l_PLAN_TYP = null;
		l_JOB_ODR_QTY = null;
		l_ALC_GRP_CD = null;
		l_JOB_ODR_STS_TYP = null;
		l_JOB_ODR_EXP_TYP = null;
		l_JOB_ODR_DEL_FLG = null;
		l_ALCD_QTY = null;
		l_CUS_DLV_CD = null;
		l_CUS_DLV_KEY_CD = null;
		l_UNOFFICIAL_RECEIPT_FLAG = null;
		l_JOB_OD_CD_PREFIX = null;
		l_CTL_SEQ_CD = null;
		l_NEW_OLD_FLG = null;
		l_TRAN_TYPE = null;
		l_EXCH_RATE = null;
		l_ORG_NAME = null;
		l_ORG_CD = null;
		l_USER_NAME = null;
		l_USER_CD = null;
		l_UNIT_QTY_TYP = null;
		l_l_h_ANS_DLV_DATE_EXIST_FLG = null;
		l_FIELD_VALUE = null;

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
	 * medKM0030010クラスの標準コンストラクタ
	 */
	public KM0030010Struct()
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
	public void setStruct(KM0030010Struct struct)
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
	public void setStructM(KM0030010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setrdoSHIP_INST(struct.getrdoSHIP_INST());
			this.setrdoSHIP_UPDATE(struct.getrdoSHIP_UPDATE());
			this.setl_CUR_UNIT(struct.getl_CUR_UNIT());
			this.setDETAIL_NO(struct.getDETAIL_NO());
			this.setACPT_ODR_CD(struct.getACPT_ODR_CD());
			this.setc_DOODR(struct.getc_DOODR());
			this.setPREPARE_QTY(struct.getPREPARE_QTY());
			this.setc_INPUTODRCD(struct.getc_INPUTODRCD());
			this.setQTY(struct.getQTY());
			this.setQTY_UNIT(struct.getQTY_UNIT());
			this.setODR_PRICE_UNIT(struct.getODR_PRICE_UNIT());
			this.setISSUE_INST_COMMENT(struct.getISSUE_INST_COMMENT());
			this.setAPPROVED_COMMENT(struct.getAPPROVED_COMMENT());
			this.setCUST_CHRG_PSN_NAME(struct.getCUST_CHRG_PSN_NAME());
			this.setES_ORG_NAME(struct.getES_ORG_NAME());
			this.setl_DLV_LOC_NAME(struct.getl_DLV_LOC_NAME());
			this.setl_CUST_ITEM_NAME(struct.getl_CUST_ITEM_NAME());
			this.setl_ITEM_NAME(struct.getl_ITEM_NAME());
			this.setl_JOB_ODR_DLV_DATE(struct.getl_JOB_ODR_DLV_DATE());
			this.setl_ALC_GRP_CD(struct.getl_ALC_GRP_CD());
			this.setl_JOB_ODR_CD(struct.getl_JOB_ODR_CD());
			this.setl_APPR_REMARKS(struct.getl_APPR_REMARKS());
			this.seth_UPDATE_FLG(struct.geth_UPDATE_FLG());
			this.setl_TEST_MODIFY_COUNT(struct.getl_TEST_MODIFY_COUNT());
			this.setl_TPJ_MODIFY_COUNT(struct.getl_TPJ_MODIFY_COUNT());
			this.setl_h_ESTIMATE_TYPE(struct.getl_h_ESTIMATE_TYPE());
			this.seth_ESTIMATE_TYPE(struct.geth_ESTIMATE_TYPE());
			this.setl_h_PREC_ARRANGE_FLG(struct.getl_h_PREC_ARRANGE_FLG());
			this.setl_c_DOODR(struct.getl_c_DOODR());
			this.setl_c_INPUTODRCD(struct.getl_c_INPUTODRCD());
			this.seth_PREC_ARRANGE_FLG(struct.geth_PREC_ARRANGE_FLG());
			this.setl_h_ODR_TYP(struct.getl_h_ODR_TYP());
			this.seth_ODR_TYP(struct.geth_ODR_TYP());
			this.seth_ODR_TYP3(struct.geth_ODR_TYP3());
			this.seth_APR_ODR(struct.geth_APR_ODR());
			this.seth_PRD_REQ_JOB_ODR_TYP_1(struct.geth_PRD_REQ_JOB_ODR_TYP_1());
			this.seth_PRD_REQ_JOB_ODR_TYP_2(struct.geth_PRD_REQ_JOB_ODR_TYP_2());
			this.seth_DLV_LOC_CD(struct.geth_DLV_LOC_CD());
			this.seth_ANS_DLV_DATE_EXIST_FLG(struct.geth_ANS_DLV_DATE_EXIST_FLG());
			this.setITEM_NAME_R(struct.getITEM_NAME_R());
			this.setl_h_DEPO_TYP(struct.getl_h_DEPO_TYP());
			this.setPROJECT_CD(struct.getPROJECT_CD());
			this.setESTIMATE_NO(struct.getESTIMATE_NO());
			this.setl_DETAL_NO(struct.getl_DETAL_NO());
			this.setCUST_NAME(struct.getCUST_NAME());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setCODE(struct.getCODE());
			this.setSYS_CLASS(struct.getSYS_CLASS());
			this.setCLASS_CODE(struct.getCLASS_CODE());
			this.setBUSINESS_OPR_DATE(struct.getBUSINESS_OPR_DATE());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setHOME_CUR_CD(struct.getHOME_CUR_CD());
			this.setVALUE(struct.getVALUE());
			this.setNAME(struct.getNAME());
			this.setPROJECT_NAME(struct.getPROJECT_NAME());
			this.setCUST_CD(struct.getCUST_CD());
			this.setPROJECT_STAT(struct.getPROJECT_STAT());
			this.setDLV_LOC_CD(struct.getDLV_LOC_CD());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setCUR_CD(struct.getCUR_CD());
			this.setEXCH_TYP(struct.getEXCH_TYP());
			this.setTAX_APPLY_TYP(struct.getTAX_APPLY_TYP());
			this.setTAX_CD(struct.getTAX_CD());
			this.setTAX_CALC_TYP(struct.getTAX_CALC_TYP());
			this.setPARTIAL_SHIP_INST_FLG(struct.getPARTIAL_SHIP_INST_FLG());
			this.setCUR_NAME(struct.getCUR_NAME());
			this.setCUR_UNIT(struct.getCUR_UNIT());
			this.setDECIMAL_FIG(struct.getDECIMAL_FIG());
			this.setl_ES_USER_CD(struct.getl_ES_USER_CD());
			this.setl_ES_ORG_CD(struct.getl_ES_ORG_CD());
			this.setl_CUST_ITEM_CD(struct.getl_CUST_ITEM_CD());
			this.setl_ESTIMATE_QTY(struct.getl_ESTIMATE_QTY());
			this.setl_UNIT_CD(struct.getl_UNIT_CD());
			this.setl_ESTIMATE_UNIT_PRICE(struct.getl_ESTIMATE_UNIT_PRICE());
			this.setl_ESTIMATE_AMOUNT(struct.getl_ESTIMATE_AMOUNT());
			this.setl_ESTIMATE_TYPE(struct.getl_ESTIMATE_TYPE());
			this.setl_ESTIMATE_ITEM_NAME(struct.getl_ESTIMATE_ITEM_NAME());
			this.setl_USER_NAME(struct.getl_USER_NAME());
			this.setl_ORG_NAME(struct.getl_ORG_NAME());
			this.setDLV_LOC_NAME(struct.getDLV_LOC_NAME());
			this.setTRANSPORT_LT(struct.getTRANSPORT_LT());
			this.setTRANSPORT_CD(struct.getTRANSPORT_CD());
			this.setTRANSPORT_TYP(struct.getTRANSPORT_TYP());
			this.setDEPO_WH_CD(struct.getDEPO_WH_CD());
			this.setSHIP_PLANT_CD(struct.getSHIP_PLANT_CD());
			this.setITEM_CD(struct.getITEM_CD());
			this.setDEPO_TYP(struct.getDEPO_TYP());
			this.setCUST_ITEM_NAME(struct.getCUST_ITEM_NAME());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setCUST_ITEM_CD(struct.getCUST_ITEM_CD());
			this.setESTIMATE_TYPE(struct.getESTIMATE_TYPE());
			this.setODR_NO(struct.getODR_NO());
			this.setDETAL_NO(struct.getDETAL_NO());
			this.setl_ODR_NO(struct.getl_ODR_NO());
			this.setl_ODR_TYP(struct.getl_ODR_TYP());
			this.setl_CUST_ODR_NO(struct.getl_CUST_ODR_NO());
			this.setl_ITEM_CD(struct.getl_ITEM_CD());
			this.setl_DESINATED_DLV_DATE(struct.getl_DESINATED_DLV_DATE());
			this.setl_ODR_QTY(struct.getl_ODR_QTY());
			this.setl_ODR_AMOUNT(struct.getl_ODR_AMOUNT());
			this.setl_ODR_AMOUNT_EXCH_RATES(struct.getl_ODR_AMOUNT_EXCH_RATES());
			this.setl_DLV_LOC_CD(struct.getl_DLV_LOC_CD());
			this.setl_DEPO_TYP(struct.getl_DEPO_TYP());
			this.setl_ODR_ACPT_DATE(struct.getl_ODR_ACPT_DATE());
			this.setl_REMARKS(struct.getl_REMARKS());
			this.setl_OWN_PERSON_CD(struct.getl_OWN_PERSON_CD());
			this.setl_TODR_MODIFY_COUNT(struct.getl_TODR_MODIFY_COUNT());
			this.setl_CUST_CHRG_PSN_NAME(struct.getl_CUST_CHRG_PSN_NAME());
			this.setl_OWN_ORG_CD(struct.getl_OWN_ORG_CD());
			this.setl_CUST_CHRG_ORG_NAME(struct.getl_CUST_CHRG_ORG_NAME());
			this.setODR_TYP(struct.getODR_TYP());
			this.setODR_CTL_NO(struct.getODR_CTL_NO());
			this.setCUST_ODR_NO(struct.getCUST_ODR_NO());
			this.setCUST_CHRG_ORG_CD(struct.getCUST_CHRG_ORG_CD());
			this.setCUST_CHRG_PSN_CD(struct.getCUST_CHRG_PSN_CD());
			this.setODR_ACPT_PSN_CD(struct.getODR_ACPT_PSN_CD());
			this.setCURRNCY_CD(struct.getCURRNCY_CD());
			this.setDLV_LOC_NAME_KANJI(struct.getDLV_LOC_NAME_KANJI());
			this.setODR_UNIT_PRICE(struct.getODR_UNIT_PRICE());
			this.setSPCL_PRICE_TYP(struct.getSPCL_PRICE_TYP());
			this.setDESINATED_DLV_DATE(struct.getDESINATED_DLV_DATE());
			this.setSTD_DESINATED_RCV_DATE(struct.getSTD_DESINATED_RCV_DATE());
			this.setODR_QTY(struct.getODR_QTY());
			this.setREMAIN_UNCONFIRM_ODR_QTY(struct.getREMAIN_UNCONFIRM_ODR_QTY());
			this.setCANCELED_UNCONFIRM_ODR_QTY(struct.getCANCELED_UNCONFIRM_ODR_QTY());
			this.setUNIT_CD(struct.getUNIT_CD());
			this.setUNCONFIRM_ODR_BALANCE(struct.getUNCONFIRM_ODR_BALANCE());
			this.setODR_AMOUNT(struct.getODR_AMOUNT());
			this.setODR_AMOUNT_EXCH_RATES(struct.getODR_AMOUNT_EXCH_RATES());
			this.setODR_CMPLT_FLG(struct.getODR_CMPLT_FLG());
			this.setPART_NAME(struct.getPART_NAME());
			this.setREMARKS(struct.getREMARKS());
			this.setODR_ACPT_DATE(struct.getODR_ACPT_DATE());
			this.setSHIP_PLAN_REMAIN_QTY(struct.getSHIP_PLAN_REMAIN_QTY());
			this.setSHIP_PLAN_CMPLT_FLG(struct.getSHIP_PLAN_CMPLT_FLG());
			this.setUNCONFIRMED_ODR_EFF_OVR_FLG(struct.getUNCONFIRMED_ODR_EFF_OVR_FLG());
			this.setENTRY_TYP(struct.getENTRY_TYP());
			this.setDEL_FLG(struct.getDEL_FLG());
			this.setJOB_ODR_SET_FLG(struct.getJOB_ODR_SET_FLG());
			this.setSLIP_CD(struct.getSLIP_CD());
			this.setORGN_ODR_NO(struct.getORGN_ODR_NO());
			this.setADD_ODR_FLG(struct.getADD_ODR_FLG());
			this.setODR_CMPLT_DATE(struct.getODR_CMPLT_DATE());
			this.setODR_ACPT_ORG_CD(struct.getODR_ACPT_ORG_CD());
			this.setESTIMATE_STAT(struct.getESTIMATE_STAT());
			this.setES_ORG_CD(struct.getES_ORG_CD());
			this.setES_USER_CD(struct.getES_USER_CD());
			this.setESTIMATE_QTY(struct.getESTIMATE_QTY());
			this.setESTIMATE_UNIT_PRICE(struct.getESTIMATE_UNIT_PRICE());
			this.setESTIMATE_AMOUNT(struct.getESTIMATE_AMOUNT());
			this.setODR_FLG(struct.getODR_FLG());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setCAL_NO(struct.getCAL_NO());
			this.setJOB_ODR_DLV_DATE(struct.getJOB_ODR_DLV_DATE());
			this.setRSLT_CTL_SEQ_CD(struct.getRSLT_CTL_SEQ_CD());
			this.setUNIT(struct.getUNIT());
			this.setDLV_PLACE_CD(struct.getDLV_PLACE_CD());
			this.setUNIT_PRICE(struct.getUNIT_PRICE());
			this.setSPCL_PRICE_CO(struct.getSPCL_PRICE_CO());
			this.setCUST_DLV_CD(struct.getCUST_DLV_CD());
			this.setCUST_DLV_KEY_CD(struct.getCUST_DLV_KEY_CD());
			this.setIF_CTL_NO(struct.getIF_CTL_NO());
			this.setODR_SEQ(struct.getODR_SEQ());
			this.setPART_DLV_SEQ_NO(struct.getPART_DLV_SEQ_NO());
			this.setLAST_ANS_DLV_DATE_RCD(struct.getLAST_ANS_DLV_DATE_RCD());
			this.setDESINATED_SHIP_DATE(struct.getDESINATED_SHIP_DATE());
			this.setDESINATED_SHIP_QTY(struct.getDESINATED_SHIP_QTY());
			this.setREST_SHIP_ODR_QTY(struct.getREST_SHIP_ODR_QTY());
			this.setSHIP_ODR_CMPLT_FLG(struct.getSHIP_ODR_CMPLT_FLG());
			this.setJOB_ODR_CANCEL_NO(struct.getJOB_ODR_CANCEL_NO());
			this.setJOB_ODR_TYP(struct.getJOB_ODR_TYP());
			this.setPLAN_TYP(struct.getPLAN_TYP());
			this.setJOB_ODR_QTY(struct.getJOB_ODR_QTY());
			this.setALC_GRP_CD(struct.getALC_GRP_CD());
			this.setJOB_ODR_STS_TYP(struct.getJOB_ODR_STS_TYP());
			this.setJOB_ODR_EXP_TYP(struct.getJOB_ODR_EXP_TYP());
			this.setJOB_ODR_DEL_FLG(struct.getJOB_ODR_DEL_FLG());
			this.setALCD_QTY(struct.getALCD_QTY());
			this.setCUS_DLV_CD(struct.getCUS_DLV_CD());
			this.setCUS_DLV_KEY_CD(struct.getCUS_DLV_KEY_CD());
			this.setUNOFFICIAL_RECEIPT_FLAG(struct.getUNOFFICIAL_RECEIPT_FLAG());
			this.setJOB_OD_CD_PREFIX(struct.getJOB_OD_CD_PREFIX());
			this.setCTL_SEQ_CD(struct.getCTL_SEQ_CD());
			this.setNEW_OLD_FLG(struct.getNEW_OLD_FLG());
			this.setTRAN_TYPE(struct.getTRAN_TYPE());
			this.setEXCH_RATE(struct.getEXCH_RATE());
			this.setORG_NAME(struct.getORG_NAME());
			this.setORG_CD(struct.getORG_CD());
			this.setUSER_NAME(struct.getUSER_NAME());
			this.setUSER_CD(struct.getUSER_CD());
			this.setUNIT_QTY_TYP(struct.getUNIT_QTY_TYP());
			this.setl_h_ANS_DLV_DATE_EXIST_FLG(struct.getl_h_ANS_DLV_DATE_EXIST_FLG());
			this.setFIELD_VALUE(struct.getFIELD_VALUE());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(KM0030010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_rdoSHIP_INST(struct.getList_rdoSHIP_INST());
			this.setList_rdoSHIP_UPDATE(struct.getList_rdoSHIP_UPDATE());
			this.setList_l_CUR_UNIT(struct.getList_l_CUR_UNIT());
			this.setList_DETAIL_NO(struct.getList_DETAIL_NO());
			this.setList_ACPT_ODR_CD(struct.getList_ACPT_ODR_CD());
			this.setList_c_DOODR(struct.getList_c_DOODR());
			this.setList_PREPARE_QTY(struct.getList_PREPARE_QTY());
			this.setList_c_INPUTODRCD(struct.getList_c_INPUTODRCD());
			this.setList_QTY(struct.getList_QTY());
			this.setList_QTY_UNIT(struct.getList_QTY_UNIT());
			this.setList_ODR_PRICE_UNIT(struct.getList_ODR_PRICE_UNIT());
			this.setList_ISSUE_INST_COMMENT(struct.getList_ISSUE_INST_COMMENT());
			this.setList_APPROVED_COMMENT(struct.getList_APPROVED_COMMENT());
			this.setList_CUST_CHRG_PSN_NAME(struct.getList_CUST_CHRG_PSN_NAME());
			this.setList_ES_ORG_NAME(struct.getList_ES_ORG_NAME());
			this.setList_l_DLV_LOC_NAME(struct.getList_l_DLV_LOC_NAME());
			this.setList_l_CUST_ITEM_NAME(struct.getList_l_CUST_ITEM_NAME());
			this.setList_l_ITEM_NAME(struct.getList_l_ITEM_NAME());
			this.setList_l_JOB_ODR_DLV_DATE(struct.getList_l_JOB_ODR_DLV_DATE());
			this.setList_l_ALC_GRP_CD(struct.getList_l_ALC_GRP_CD());
			this.setList_l_JOB_ODR_CD(struct.getList_l_JOB_ODR_CD());
			this.setList_l_APPR_REMARKS(struct.getList_l_APPR_REMARKS());
			this.setList_h_UPDATE_FLG(struct.getList_h_UPDATE_FLG());
			this.setList_l_TEST_MODIFY_COUNT(struct.getList_l_TEST_MODIFY_COUNT());
			this.setList_l_TPJ_MODIFY_COUNT(struct.getList_l_TPJ_MODIFY_COUNT());
			this.setList_l_h_ESTIMATE_TYPE(struct.getList_l_h_ESTIMATE_TYPE());
			this.setList_h_ESTIMATE_TYPE(struct.getList_h_ESTIMATE_TYPE());
			this.setList_l_h_PREC_ARRANGE_FLG(struct.getList_l_h_PREC_ARRANGE_FLG());
			this.setList_l_c_DOODR(struct.getList_l_c_DOODR());
			this.setList_l_c_INPUTODRCD(struct.getList_l_c_INPUTODRCD());
			this.setList_h_PREC_ARRANGE_FLG(struct.getList_h_PREC_ARRANGE_FLG());
			this.setList_l_h_ODR_TYP(struct.getList_l_h_ODR_TYP());
			this.setList_h_ODR_TYP(struct.getList_h_ODR_TYP());
			this.setList_h_ODR_TYP3(struct.getList_h_ODR_TYP3());
			this.setList_h_APR_ODR(struct.getList_h_APR_ODR());
			this.setList_h_PRD_REQ_JOB_ODR_TYP_1(struct.getList_h_PRD_REQ_JOB_ODR_TYP_1());
			this.setList_h_PRD_REQ_JOB_ODR_TYP_2(struct.getList_h_PRD_REQ_JOB_ODR_TYP_2());
			this.setList_h_DLV_LOC_CD(struct.getList_h_DLV_LOC_CD());
			this.setList_h_ANS_DLV_DATE_EXIST_FLG(struct.getList_h_ANS_DLV_DATE_EXIST_FLG());
			this.setList_ITEM_NAME_R(struct.getList_ITEM_NAME_R());
			this.setList_l_h_DEPO_TYP(struct.getList_l_h_DEPO_TYP());
			this.setList_PROJECT_CD(struct.getList_PROJECT_CD());
			this.setList_ESTIMATE_NO(struct.getList_ESTIMATE_NO());
			this.setList_l_DETAL_NO(struct.getList_l_DETAL_NO());
			this.setList_CUST_NAME(struct.getList_CUST_NAME());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_CODE(struct.getList_CODE());
			this.setList_SYS_CLASS(struct.getList_SYS_CLASS());
			this.setList_CLASS_CODE(struct.getList_CLASS_CODE());
			this.setList_BUSINESS_OPR_DATE(struct.getList_BUSINESS_OPR_DATE());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_HOME_CUR_CD(struct.getList_HOME_CUR_CD());
			this.setList_VALUE(struct.getList_VALUE());
			this.setList_NAME(struct.getList_NAME());
			this.setList_PROJECT_NAME(struct.getList_PROJECT_NAME());
			this.setList_CUST_CD(struct.getList_CUST_CD());
			this.setList_PROJECT_STAT(struct.getList_PROJECT_STAT());
			this.setList_DLV_LOC_CD(struct.getList_DLV_LOC_CD());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_CUR_CD(struct.getList_CUR_CD());
			this.setList_EXCH_TYP(struct.getList_EXCH_TYP());
			this.setList_TAX_APPLY_TYP(struct.getList_TAX_APPLY_TYP());
			this.setList_TAX_CD(struct.getList_TAX_CD());
			this.setList_TAX_CALC_TYP(struct.getList_TAX_CALC_TYP());
			this.setList_PARTIAL_SHIP_INST_FLG(struct.getList_PARTIAL_SHIP_INST_FLG());
			this.setList_CUR_NAME(struct.getList_CUR_NAME());
			this.setList_CUR_UNIT(struct.getList_CUR_UNIT());
			this.setList_DECIMAL_FIG(struct.getList_DECIMAL_FIG());
			this.setList_l_ES_USER_CD(struct.getList_l_ES_USER_CD());
			this.setList_l_ES_ORG_CD(struct.getList_l_ES_ORG_CD());
			this.setList_l_CUST_ITEM_CD(struct.getList_l_CUST_ITEM_CD());
			this.setList_l_ESTIMATE_QTY(struct.getList_l_ESTIMATE_QTY());
			this.setList_l_UNIT_CD(struct.getList_l_UNIT_CD());
			this.setList_l_ESTIMATE_UNIT_PRICE(struct.getList_l_ESTIMATE_UNIT_PRICE());
			this.setList_l_ESTIMATE_AMOUNT(struct.getList_l_ESTIMATE_AMOUNT());
			this.setList_l_ESTIMATE_TYPE(struct.getList_l_ESTIMATE_TYPE());
			this.setList_l_ESTIMATE_ITEM_NAME(struct.getList_l_ESTIMATE_ITEM_NAME());
			this.setList_l_USER_NAME(struct.getList_l_USER_NAME());
			this.setList_l_ORG_NAME(struct.getList_l_ORG_NAME());
			this.setList_DLV_LOC_NAME(struct.getList_DLV_LOC_NAME());
			this.setList_TRANSPORT_LT(struct.getList_TRANSPORT_LT());
			this.setList_TRANSPORT_CD(struct.getList_TRANSPORT_CD());
			this.setList_TRANSPORT_TYP(struct.getList_TRANSPORT_TYP());
			this.setList_DEPO_WH_CD(struct.getList_DEPO_WH_CD());
			this.setList_SHIP_PLANT_CD(struct.getList_SHIP_PLANT_CD());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_DEPO_TYP(struct.getList_DEPO_TYP());
			this.setList_CUST_ITEM_NAME(struct.getList_CUST_ITEM_NAME());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_CUST_ITEM_CD(struct.getList_CUST_ITEM_CD());
			this.setList_ESTIMATE_TYPE(struct.getList_ESTIMATE_TYPE());
			this.setList_ODR_NO(struct.getList_ODR_NO());
			this.setList_DETAL_NO(struct.getList_DETAL_NO());
			this.setList_l_ODR_NO(struct.getList_l_ODR_NO());
			this.setList_l_ODR_TYP(struct.getList_l_ODR_TYP());
			this.setList_l_CUST_ODR_NO(struct.getList_l_CUST_ODR_NO());
			this.setList_l_ITEM_CD(struct.getList_l_ITEM_CD());
			this.setList_l_DESINATED_DLV_DATE(struct.getList_l_DESINATED_DLV_DATE());
			this.setList_l_ODR_QTY(struct.getList_l_ODR_QTY());
			this.setList_l_ODR_AMOUNT(struct.getList_l_ODR_AMOUNT());
			this.setList_l_ODR_AMOUNT_EXCH_RATES(struct.getList_l_ODR_AMOUNT_EXCH_RATES());
			this.setList_l_DLV_LOC_CD(struct.getList_l_DLV_LOC_CD());
			this.setList_l_DEPO_TYP(struct.getList_l_DEPO_TYP());
			this.setList_l_ODR_ACPT_DATE(struct.getList_l_ODR_ACPT_DATE());
			this.setList_l_REMARKS(struct.getList_l_REMARKS());
			this.setList_l_OWN_PERSON_CD(struct.getList_l_OWN_PERSON_CD());
			this.setList_l_TODR_MODIFY_COUNT(struct.getList_l_TODR_MODIFY_COUNT());
			this.setList_l_CUST_CHRG_PSN_NAME(struct.getList_l_CUST_CHRG_PSN_NAME());
			this.setList_l_OWN_ORG_CD(struct.getList_l_OWN_ORG_CD());
			this.setList_l_CUST_CHRG_ORG_NAME(struct.getList_l_CUST_CHRG_ORG_NAME());
			this.setList_ODR_TYP(struct.getList_ODR_TYP());
			this.setList_ODR_CTL_NO(struct.getList_ODR_CTL_NO());
			this.setList_CUST_ODR_NO(struct.getList_CUST_ODR_NO());
			this.setList_CUST_CHRG_ORG_CD(struct.getList_CUST_CHRG_ORG_CD());
			this.setList_CUST_CHRG_PSN_CD(struct.getList_CUST_CHRG_PSN_CD());
			this.setList_ODR_ACPT_PSN_CD(struct.getList_ODR_ACPT_PSN_CD());
			this.setList_CURRNCY_CD(struct.getList_CURRNCY_CD());
			this.setList_DLV_LOC_NAME_KANJI(struct.getList_DLV_LOC_NAME_KANJI());
			this.setList_ODR_UNIT_PRICE(struct.getList_ODR_UNIT_PRICE());
			this.setList_SPCL_PRICE_TYP(struct.getList_SPCL_PRICE_TYP());
			this.setList_DESINATED_DLV_DATE(struct.getList_DESINATED_DLV_DATE());
			this.setList_STD_DESINATED_RCV_DATE(struct.getList_STD_DESINATED_RCV_DATE());
			this.setList_ODR_QTY(struct.getList_ODR_QTY());
			this.setList_REMAIN_UNCONFIRM_ODR_QTY(struct.getList_REMAIN_UNCONFIRM_ODR_QTY());
			this.setList_CANCELED_UNCONFIRM_ODR_QTY(struct.getList_CANCELED_UNCONFIRM_ODR_QTY());
			this.setList_UNIT_CD(struct.getList_UNIT_CD());
			this.setList_UNCONFIRM_ODR_BALANCE(struct.getList_UNCONFIRM_ODR_BALANCE());
			this.setList_ODR_AMOUNT(struct.getList_ODR_AMOUNT());
			this.setList_ODR_AMOUNT_EXCH_RATES(struct.getList_ODR_AMOUNT_EXCH_RATES());
			this.setList_ODR_CMPLT_FLG(struct.getList_ODR_CMPLT_FLG());
			this.setList_PART_NAME(struct.getList_PART_NAME());
			this.setList_REMARKS(struct.getList_REMARKS());
			this.setList_ODR_ACPT_DATE(struct.getList_ODR_ACPT_DATE());
			this.setList_SHIP_PLAN_REMAIN_QTY(struct.getList_SHIP_PLAN_REMAIN_QTY());
			this.setList_SHIP_PLAN_CMPLT_FLG(struct.getList_SHIP_PLAN_CMPLT_FLG());
			this.setList_UNCONFIRMED_ODR_EFF_OVR_FLG(struct.getList_UNCONFIRMED_ODR_EFF_OVR_FLG());
			this.setList_ENTRY_TYP(struct.getList_ENTRY_TYP());
			this.setList_DEL_FLG(struct.getList_DEL_FLG());
			this.setList_JOB_ODR_SET_FLG(struct.getList_JOB_ODR_SET_FLG());
			this.setList_SLIP_CD(struct.getList_SLIP_CD());
			this.setList_ORGN_ODR_NO(struct.getList_ORGN_ODR_NO());
			this.setList_ADD_ODR_FLG(struct.getList_ADD_ODR_FLG());
			this.setList_ODR_CMPLT_DATE(struct.getList_ODR_CMPLT_DATE());
			this.setList_ODR_ACPT_ORG_CD(struct.getList_ODR_ACPT_ORG_CD());
			this.setList_ESTIMATE_STAT(struct.getList_ESTIMATE_STAT());
			this.setList_ES_ORG_CD(struct.getList_ES_ORG_CD());
			this.setList_ES_USER_CD(struct.getList_ES_USER_CD());
			this.setList_ESTIMATE_QTY(struct.getList_ESTIMATE_QTY());
			this.setList_ESTIMATE_UNIT_PRICE(struct.getList_ESTIMATE_UNIT_PRICE());
			this.setList_ESTIMATE_AMOUNT(struct.getList_ESTIMATE_AMOUNT());
			this.setList_ODR_FLG(struct.getList_ODR_FLG());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_CAL_NO(struct.getList_CAL_NO());
			this.setList_JOB_ODR_DLV_DATE(struct.getList_JOB_ODR_DLV_DATE());
			this.setList_RSLT_CTL_SEQ_CD(struct.getList_RSLT_CTL_SEQ_CD());
			this.setList_UNIT(struct.getList_UNIT());
			this.setList_DLV_PLACE_CD(struct.getList_DLV_PLACE_CD());
			this.setList_UNIT_PRICE(struct.getList_UNIT_PRICE());
			this.setList_SPCL_PRICE_CO(struct.getList_SPCL_PRICE_CO());
			this.setList_CUST_DLV_CD(struct.getList_CUST_DLV_CD());
			this.setList_CUST_DLV_KEY_CD(struct.getList_CUST_DLV_KEY_CD());
			this.setList_IF_CTL_NO(struct.getList_IF_CTL_NO());
			this.setList_ODR_SEQ(struct.getList_ODR_SEQ());
			this.setList_PART_DLV_SEQ_NO(struct.getList_PART_DLV_SEQ_NO());
			this.setList_LAST_ANS_DLV_DATE_RCD(struct.getList_LAST_ANS_DLV_DATE_RCD());
			this.setList_DESINATED_SHIP_DATE(struct.getList_DESINATED_SHIP_DATE());
			this.setList_DESINATED_SHIP_QTY(struct.getList_DESINATED_SHIP_QTY());
			this.setList_REST_SHIP_ODR_QTY(struct.getList_REST_SHIP_ODR_QTY());
			this.setList_SHIP_ODR_CMPLT_FLG(struct.getList_SHIP_ODR_CMPLT_FLG());
			this.setList_JOB_ODR_CANCEL_NO(struct.getList_JOB_ODR_CANCEL_NO());
			this.setList_JOB_ODR_TYP(struct.getList_JOB_ODR_TYP());
			this.setList_PLAN_TYP(struct.getList_PLAN_TYP());
			this.setList_JOB_ODR_QTY(struct.getList_JOB_ODR_QTY());
			this.setList_ALC_GRP_CD(struct.getList_ALC_GRP_CD());
			this.setList_JOB_ODR_STS_TYP(struct.getList_JOB_ODR_STS_TYP());
			this.setList_JOB_ODR_EXP_TYP(struct.getList_JOB_ODR_EXP_TYP());
			this.setList_JOB_ODR_DEL_FLG(struct.getList_JOB_ODR_DEL_FLG());
			this.setList_ALCD_QTY(struct.getList_ALCD_QTY());
			this.setList_CUS_DLV_CD(struct.getList_CUS_DLV_CD());
			this.setList_CUS_DLV_KEY_CD(struct.getList_CUS_DLV_KEY_CD());
			this.setList_UNOFFICIAL_RECEIPT_FLAG(struct.getList_UNOFFICIAL_RECEIPT_FLAG());
			this.setList_JOB_OD_CD_PREFIX(struct.getList_JOB_OD_CD_PREFIX());
			this.setList_CTL_SEQ_CD(struct.getList_CTL_SEQ_CD());
			this.setList_NEW_OLD_FLG(struct.getList_NEW_OLD_FLG());
			this.setList_TRAN_TYPE(struct.getList_TRAN_TYPE());
			this.setList_EXCH_RATE(struct.getList_EXCH_RATE());
			this.setList_ORG_NAME(struct.getList_ORG_NAME());
			this.setList_ORG_CD(struct.getList_ORG_CD());
			this.setList_USER_NAME(struct.getList_USER_NAME());
			this.setList_USER_CD(struct.getList_USER_CD());
			this.setList_UNIT_QTY_TYP(struct.getList_UNIT_QTY_TYP());
			this.setList_l_h_ANS_DLV_DATE_EXIST_FLG(struct.getList_l_h_ANS_DLV_DATE_EXIST_FLG());
			this.setList_FIELD_VALUE(struct.getList_FIELD_VALUE());
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
	// 第 1 変数初期値： i_rdoSHIP_INST


	final static String i_rdoSHIP_INST = null;

	// 第 2 変数初期値： i_rdoSHIP_UPDATE


	final static String i_rdoSHIP_UPDATE = null;

	// 第 3 変数初期値： i_l_CUR_UNIT


	final static String i_l_CUR_UNIT = null;

	// 第 4 変数初期値： i_DETAIL_NO


	final static String i_DETAIL_NO = null;

	// 第 5 変数初期値： i_ACPT_ODR_CD


	final static String i_ACPT_ODR_CD = null;

	// 第 6 変数初期値： i_c_DOODR


	final static String i_c_DOODR = null;

	// 第 7 変数初期値： i_PREPARE_QTY


	final static String i_PREPARE_QTY = null;

	// 第 8 変数初期値： i_c_INPUTODRCD


	final static String i_c_INPUTODRCD = null;

	// 第 9 変数初期値： i_QTY


	final static String i_QTY = null;

	// 第 10 変数初期値： i_QTY_UNIT


	final static String i_QTY_UNIT = null;

	// 第 11 変数初期値： i_ODR_PRICE_UNIT


	final static String i_ODR_PRICE_UNIT = null;

	// 第 12 変数初期値： i_ISSUE_INST_COMMENT


	final static String i_ISSUE_INST_COMMENT = null;

	// 第 13 変数初期値： i_APPROVED_COMMENT


	final static String i_APPROVED_COMMENT = null;

	// 第 14 変数初期値： i_CUST_CHRG_PSN_NAME


	final static String i_CUST_CHRG_PSN_NAME = null;

	// 第 15 変数初期値： i_ES_ORG_NAME


	final static String i_ES_ORG_NAME = null;

	// 第 16 変数初期値： i_l_DLV_LOC_NAME


	final static String i_l_DLV_LOC_NAME = null;

	// 第 17 変数初期値： i_l_CUST_ITEM_NAME


	final static String i_l_CUST_ITEM_NAME = null;

	// 第 18 変数初期値： i_l_ITEM_NAME


	final static String i_l_ITEM_NAME = null;

	// 第 19 変数初期値： i_l_JOB_ODR_DLV_DATE


	final static String i_l_JOB_ODR_DLV_DATE = null;

	// 第 20 変数初期値： i_l_ALC_GRP_CD


	final static String i_l_ALC_GRP_CD = null;

	// 第 21 変数初期値： i_l_JOB_ODR_CD


	final static String i_l_JOB_ODR_CD = null;

	// 第 22 変数初期値： i_l_APPR_REMARKS


	final static String i_l_APPR_REMARKS = null;

	// 第 23 変数初期値： i_h_UPDATE_FLG


	final static String i_h_UPDATE_FLG = null;

	// 第 24 変数初期値： i_l_TEST_MODIFY_COUNT


	final static String i_l_TEST_MODIFY_COUNT = null;

	// 第 25 変数初期値： i_l_TPJ_MODIFY_COUNT


	final static String i_l_TPJ_MODIFY_COUNT = null;

	// 第 26 変数初期値： i_l_h_ESTIMATE_TYPE


	final static String i_l_h_ESTIMATE_TYPE = null;

	// 第 27 変数初期値： i_h_ESTIMATE_TYPE


	final static String i_h_ESTIMATE_TYPE = null;

	// 第 28 変数初期値： i_l_h_PREC_ARRANGE_FLG


	final static String i_l_h_PREC_ARRANGE_FLG = null;

	// 第 29 変数初期値： i_l_c_DOODR


	final static String i_l_c_DOODR = null;

	// 第 30 変数初期値： i_l_c_INPUTODRCD


	final static String i_l_c_INPUTODRCD = null;

	// 第 31 変数初期値： i_h_PREC_ARRANGE_FLG


	final static String i_h_PREC_ARRANGE_FLG = null;

	// 第 32 変数初期値： i_l_h_ODR_TYP


	final static String i_l_h_ODR_TYP = null;

	// 第 33 変数初期値： i_h_ODR_TYP


	final static String i_h_ODR_TYP = null;

	// 第 34 変数初期値： i_h_ODR_TYP3


	final static String i_h_ODR_TYP3 = null;

	// 第 35 変数初期値： i_h_APR_ODR


	final static String i_h_APR_ODR = null;

	// 第 36 変数初期値： i_h_PRD_REQ_JOB_ODR_TYP_1


	final static String i_h_PRD_REQ_JOB_ODR_TYP_1 = null;

	// 第 37 変数初期値： i_h_PRD_REQ_JOB_ODR_TYP_2


	final static String i_h_PRD_REQ_JOB_ODR_TYP_2 = null;

	// 第 38 変数初期値： i_h_DLV_LOC_CD


	final static String i_h_DLV_LOC_CD = null;

	// 第 39 変数初期値： i_h_ANS_DLV_DATE_EXIST_FLG


	final static String i_h_ANS_DLV_DATE_EXIST_FLG = null;

	// 第 40 変数初期値： i_ITEM_NAME_R


	final static String i_ITEM_NAME_R = null;

	// 第 41 変数初期値： i_l_h_DEPO_TYP


	final static String i_l_h_DEPO_TYP = null;

	// 第 42 変数初期値： i_PROJECT_CD


	final static String i_PROJECT_CD = null;

	// 第 43 変数初期値： i_ESTIMATE_NO


	final static String i_ESTIMATE_NO = null;

	// 第 44 変数初期値： i_l_DETAL_NO


	final static String i_l_DETAL_NO = null;

	// 第 45 変数初期値： i_CUST_NAME


	final static String i_CUST_NAME = null;

	// 第 46 変数初期値： i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// 第 47 変数初期値： i_CODE


	final static String i_CODE = null;

	// 第 48 変数初期値： i_SYS_CLASS


	final static String i_SYS_CLASS = null;

	// 第 49 変数初期値： i_CLASS_CODE


	final static String i_CLASS_CODE = null;

	// 第 50 変数初期値： i_BUSINESS_OPR_DATE


	final static String i_BUSINESS_OPR_DATE = null;

	// 第 51 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

	// 第 52 変数初期値： i_HOME_CUR_CD


	final static String i_HOME_CUR_CD = null;

	// 第 53 変数初期値： i_VALUE


	final static String i_VALUE = null;

	// 第 54 変数初期値： i_NAME


	final static String i_NAME = null;

	// 第 55 変数初期値： i_PROJECT_NAME


	final static String i_PROJECT_NAME = null;

	// 第 56 変数初期値： i_CUST_CD


	final static String i_CUST_CD = null;

	// 第 57 変数初期値： i_PROJECT_STAT


	final static String i_PROJECT_STAT = null;

	// 第 58 変数初期値： i_DLV_LOC_CD


	final static String i_DLV_LOC_CD = null;

	// 第 59 変数初期値： i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// 第 60 変数初期値： i_CUR_CD


	final static String i_CUR_CD = null;

	// 第 61 変数初期値： i_EXCH_TYP


	final static String i_EXCH_TYP = null;

	// 第 62 変数初期値： i_TAX_APPLY_TYP


	final static String i_TAX_APPLY_TYP = null;

	// 第 63 変数初期値： i_TAX_CD


	final static String i_TAX_CD = null;

	// 第 64 変数初期値： i_TAX_CALC_TYP


	final static String i_TAX_CALC_TYP = null;

	// 第 65 変数初期値： i_PARTIAL_SHIP_INST_FLG


	final static String i_PARTIAL_SHIP_INST_FLG = null;

	// 第 66 変数初期値： i_CUR_NAME


	final static String i_CUR_NAME = null;

	// 第 67 変数初期値： i_CUR_UNIT


	final static String i_CUR_UNIT = null;

	// 第 68 変数初期値： i_DECIMAL_FIG


	final static String i_DECIMAL_FIG = null;

	// 第 69 変数初期値： i_l_ES_USER_CD


	final static String i_l_ES_USER_CD = null;

	// 第 70 変数初期値： i_l_ES_ORG_CD


	final static String i_l_ES_ORG_CD = null;

	// 第 71 変数初期値： i_l_CUST_ITEM_CD


	final static String i_l_CUST_ITEM_CD = null;

	// 第 72 変数初期値： i_l_ESTIMATE_QTY


	final static String i_l_ESTIMATE_QTY = null;

	// 第 73 変数初期値： i_l_UNIT_CD


	final static String i_l_UNIT_CD = null;

	// 第 74 変数初期値： i_l_ESTIMATE_UNIT_PRICE


	final static String i_l_ESTIMATE_UNIT_PRICE = null;

	// 第 75 変数初期値： i_l_ESTIMATE_AMOUNT


	final static String i_l_ESTIMATE_AMOUNT = null;

	// 第 76 変数初期値： i_l_ESTIMATE_TYPE


	final static String i_l_ESTIMATE_TYPE = null;

	// 第 77 変数初期値： i_l_ESTIMATE_ITEM_NAME


	final static String i_l_ESTIMATE_ITEM_NAME = null;

	// 第 78 変数初期値： i_l_USER_NAME


	final static String i_l_USER_NAME = null;

	// 第 79 変数初期値： i_l_ORG_NAME


	final static String i_l_ORG_NAME = null;

	// 第 80 変数初期値： i_DLV_LOC_NAME


	final static String i_DLV_LOC_NAME = null;

	// 第 81 変数初期値： i_TRANSPORT_LT


	final static String i_TRANSPORT_LT = null;

	// 第 82 変数初期値： i_TRANSPORT_CD


	final static String i_TRANSPORT_CD = null;

	// 第 83 変数初期値： i_TRANSPORT_TYP


	final static String i_TRANSPORT_TYP = null;

	// 第 84 変数初期値： i_DEPO_WH_CD


	final static String i_DEPO_WH_CD = null;

	// 第 85 変数初期値： i_SHIP_PLANT_CD


	final static String i_SHIP_PLANT_CD = null;

	// 第 86 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 87 変数初期値： i_DEPO_TYP


	final static String i_DEPO_TYP = null;

	// 第 88 変数初期値： i_CUST_ITEM_NAME


	final static String i_CUST_ITEM_NAME = null;

	// 第 89 変数初期値： i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// 第 90 変数初期値： i_CUST_ITEM_CD


	final static String i_CUST_ITEM_CD = null;

	// 第 91 変数初期値： i_ESTIMATE_TYPE


	final static String i_ESTIMATE_TYPE = null;

	// 第 92 変数初期値： i_ODR_NO


	final static String i_ODR_NO = null;

	// 第 93 変数初期値： i_DETAL_NO


	final static String i_DETAL_NO = null;

	// 第 94 変数初期値： i_l_ODR_NO


	final static String i_l_ODR_NO = null;

	// 第 95 変数初期値： i_l_ODR_TYP


	final static String i_l_ODR_TYP = null;

	// 第 96 変数初期値： i_l_CUST_ODR_NO


	final static String i_l_CUST_ODR_NO = null;

	// 第 97 変数初期値： i_l_ITEM_CD


	final static String i_l_ITEM_CD = null;

	// 第 98 変数初期値： i_l_DESINATED_DLV_DATE


	final static String i_l_DESINATED_DLV_DATE = null;

	// 第 99 変数初期値： i_l_ODR_QTY


	final static String i_l_ODR_QTY = null;

	// 第 100 変数初期値： i_l_ODR_AMOUNT


	final static String i_l_ODR_AMOUNT = null;

	// 第 101 変数初期値： i_l_ODR_AMOUNT_EXCH_RATES


	final static String i_l_ODR_AMOUNT_EXCH_RATES = null;

	// 第 102 変数初期値： i_l_DLV_LOC_CD


	final static String i_l_DLV_LOC_CD = null;

	// 第 103 変数初期値： i_l_DEPO_TYP


	final static String i_l_DEPO_TYP = null;

	// 第 104 変数初期値： i_l_ODR_ACPT_DATE


	final static String i_l_ODR_ACPT_DATE = null;

	// 第 105 変数初期値： i_l_REMARKS


	final static String i_l_REMARKS = null;

	// 第 106 変数初期値： i_l_OWN_PERSON_CD


	final static String i_l_OWN_PERSON_CD = null;

	// 第 107 変数初期値： i_l_TODR_MODIFY_COUNT


	final static String i_l_TODR_MODIFY_COUNT = null;

	// 第 108 変数初期値： i_l_CUST_CHRG_PSN_NAME


	final static String i_l_CUST_CHRG_PSN_NAME = null;

	// 第 109 変数初期値： i_l_OWN_ORG_CD


	final static String i_l_OWN_ORG_CD = null;

	// 第 110 変数初期値： i_l_CUST_CHRG_ORG_NAME


	final static String i_l_CUST_CHRG_ORG_NAME = null;

	// 第 111 変数初期値： i_ODR_TYP


	final static String i_ODR_TYP = null;

	// 第 112 変数初期値： i_ODR_CTL_NO


	final static String i_ODR_CTL_NO = null;

	// 第 113 変数初期値： i_CUST_ODR_NO


	final static String i_CUST_ODR_NO = null;

	// 第 114 変数初期値： i_CUST_CHRG_ORG_CD


	final static String i_CUST_CHRG_ORG_CD = null;

	// 第 115 変数初期値： i_CUST_CHRG_PSN_CD


	final static String i_CUST_CHRG_PSN_CD = null;

	// 第 116 変数初期値： i_ODR_ACPT_PSN_CD


	final static String i_ODR_ACPT_PSN_CD = null;

	// 第 117 変数初期値： i_CURRNCY_CD


	final static String i_CURRNCY_CD = null;

	// 第 118 変数初期値： i_DLV_LOC_NAME_KANJI


	final static String i_DLV_LOC_NAME_KANJI = null;

	// 第 119 変数初期値： i_ODR_UNIT_PRICE


	final static String i_ODR_UNIT_PRICE = null;

	// 第 120 変数初期値： i_SPCL_PRICE_TYP


	final static String i_SPCL_PRICE_TYP = null;

	// 第 121 変数初期値： i_DESINATED_DLV_DATE


	final static String i_DESINATED_DLV_DATE = null;

	// 第 122 変数初期値： i_STD_DESINATED_RCV_DATE


	final static String i_STD_DESINATED_RCV_DATE = null;

	// 第 123 変数初期値： i_ODR_QTY


	final static String i_ODR_QTY = null;

	// 第 124 変数初期値： i_REMAIN_UNCONFIRM_ODR_QTY


	final static String i_REMAIN_UNCONFIRM_ODR_QTY = null;

	// 第 125 変数初期値： i_CANCELED_UNCONFIRM_ODR_QTY


	final static String i_CANCELED_UNCONFIRM_ODR_QTY = null;

	// 第 126 変数初期値： i_UNIT_CD


	final static String i_UNIT_CD = null;

	// 第 127 変数初期値： i_UNCONFIRM_ODR_BALANCE


	final static String i_UNCONFIRM_ODR_BALANCE = null;

	// 第 128 変数初期値： i_ODR_AMOUNT


	final static String i_ODR_AMOUNT = null;

	// 第 129 変数初期値： i_ODR_AMOUNT_EXCH_RATES


	final static String i_ODR_AMOUNT_EXCH_RATES = null;

	// 第 130 変数初期値： i_ODR_CMPLT_FLG


	final static String i_ODR_CMPLT_FLG = null;

	// 第 131 変数初期値： i_PART_NAME


	final static String i_PART_NAME = null;

	// 第 132 変数初期値： i_REMARKS


	final static String i_REMARKS = null;

	// 第 133 変数初期値： i_ODR_ACPT_DATE


	final static String i_ODR_ACPT_DATE = null;

	// 第 134 変数初期値： i_SHIP_PLAN_REMAIN_QTY


	final static String i_SHIP_PLAN_REMAIN_QTY = null;

	// 第 135 変数初期値： i_SHIP_PLAN_CMPLT_FLG


	final static String i_SHIP_PLAN_CMPLT_FLG = null;

	// 第 136 変数初期値： i_UNCONFIRMED_ODR_EFF_OVR_FLG


	final static String i_UNCONFIRMED_ODR_EFF_OVR_FLG = null;

	// 第 137 変数初期値： i_ENTRY_TYP


	final static String i_ENTRY_TYP = null;

	// 第 138 変数初期値： i_DEL_FLG


	final static String i_DEL_FLG = null;

	// 第 139 変数初期値： i_JOB_ODR_SET_FLG


	final static String i_JOB_ODR_SET_FLG = null;

	// 第 140 変数初期値： i_SLIP_CD


	final static String i_SLIP_CD = null;

	// 第 141 変数初期値： i_ORGN_ODR_NO


	final static String i_ORGN_ODR_NO = null;

	// 第 142 変数初期値： i_ADD_ODR_FLG


	final static String i_ADD_ODR_FLG = null;

	// 第 143 変数初期値： i_ODR_CMPLT_DATE


	final static String i_ODR_CMPLT_DATE = null;

	// 第 144 変数初期値： i_ODR_ACPT_ORG_CD


	final static String i_ODR_ACPT_ORG_CD = null;

	// 第 145 変数初期値： i_ESTIMATE_STAT


	final static String i_ESTIMATE_STAT = null;

	// 第 146 変数初期値： i_ES_ORG_CD


	final static String i_ES_ORG_CD = null;

	// 第 147 変数初期値： i_ES_USER_CD


	final static String i_ES_USER_CD = null;

	// 第 148 変数初期値： i_ESTIMATE_QTY


	final static String i_ESTIMATE_QTY = null;

	// 第 149 変数初期値： i_ESTIMATE_UNIT_PRICE


	final static String i_ESTIMATE_UNIT_PRICE = null;

	// 第 150 変数初期値： i_ESTIMATE_AMOUNT


	final static String i_ESTIMATE_AMOUNT = null;

	// 第 151 変数初期値： i_ODR_FLG


	final static String i_ODR_FLG = null;

	// 第 152 変数初期値： i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// 第 153 変数初期値： i_CAL_NO


	final static String i_CAL_NO = null;

	// 第 154 変数初期値： i_JOB_ODR_DLV_DATE


	final static String i_JOB_ODR_DLV_DATE = null;

	// 第 155 変数初期値： i_RSLT_CTL_SEQ_CD


	final static String i_RSLT_CTL_SEQ_CD = null;

	// 第 156 変数初期値： i_UNIT


	final static String i_UNIT = null;

	// 第 157 変数初期値： i_DLV_PLACE_CD


	final static String i_DLV_PLACE_CD = null;

	// 第 158 変数初期値： i_UNIT_PRICE


	final static String i_UNIT_PRICE = null;

	// 第 159 変数初期値： i_SPCL_PRICE_CO


	final static String i_SPCL_PRICE_CO = null;

	// 第 160 変数初期値： i_CUST_DLV_CD


	final static String i_CUST_DLV_CD = null;

	// 第 161 変数初期値： i_CUST_DLV_KEY_CD


	final static String i_CUST_DLV_KEY_CD = null;

	// 第 162 変数初期値： i_IF_CTL_NO


	final static String i_IF_CTL_NO = null;

	// 第 163 変数初期値： i_ODR_SEQ


	final static String i_ODR_SEQ = null;

	// 第 164 変数初期値： i_PART_DLV_SEQ_NO


	final static String i_PART_DLV_SEQ_NO = null;

	// 第 165 変数初期値： i_LAST_ANS_DLV_DATE_RCD


	final static String i_LAST_ANS_DLV_DATE_RCD = null;

	// 第 166 変数初期値： i_DESINATED_SHIP_DATE


	final static String i_DESINATED_SHIP_DATE = null;

	// 第 167 変数初期値： i_DESINATED_SHIP_QTY


	final static String i_DESINATED_SHIP_QTY = null;

	// 第 168 変数初期値： i_REST_SHIP_ODR_QTY


	final static String i_REST_SHIP_ODR_QTY = null;

	// 第 169 変数初期値： i_SHIP_ODR_CMPLT_FLG


	final static String i_SHIP_ODR_CMPLT_FLG = null;

	// 第 170 変数初期値： i_JOB_ODR_CANCEL_NO


	final static String i_JOB_ODR_CANCEL_NO = null;

	// 第 171 変数初期値： i_JOB_ODR_TYP


	final static String i_JOB_ODR_TYP = null;

	// 第 172 変数初期値： i_PLAN_TYP


	final static String i_PLAN_TYP = null;

	// 第 173 変数初期値： i_JOB_ODR_QTY


	final static String i_JOB_ODR_QTY = null;

	// 第 174 変数初期値： i_ALC_GRP_CD


	final static String i_ALC_GRP_CD = null;

	// 第 175 変数初期値： i_JOB_ODR_STS_TYP


	final static String i_JOB_ODR_STS_TYP = null;

	// 第 176 変数初期値： i_JOB_ODR_EXP_TYP


	final static String i_JOB_ODR_EXP_TYP = null;

	// 第 177 変数初期値： i_JOB_ODR_DEL_FLG


	final static String i_JOB_ODR_DEL_FLG = null;

	// 第 178 変数初期値： i_ALCD_QTY


	final static String i_ALCD_QTY = null;

	// 第 179 変数初期値： i_CUS_DLV_CD


	final static String i_CUS_DLV_CD = null;

	// 第 180 変数初期値： i_CUS_DLV_KEY_CD


	final static String i_CUS_DLV_KEY_CD = null;

	// 第 181 変数初期値： i_UNOFFICIAL_RECEIPT_FLAG


	final static String i_UNOFFICIAL_RECEIPT_FLAG = null;

	// 第 182 変数初期値： i_JOB_OD_CD_PREFIX


	final static String i_JOB_OD_CD_PREFIX = null;

	// 第 183 変数初期値： i_CTL_SEQ_CD


	final static String i_CTL_SEQ_CD = null;

	// 第 184 変数初期値： i_NEW_OLD_FLG


	final static String i_NEW_OLD_FLG = null;

	// 第 185 変数初期値： i_TRAN_TYPE


	final static String i_TRAN_TYPE = null;

	// 第 186 変数初期値： i_EXCH_RATE


	final static String i_EXCH_RATE = null;

	// 第 187 変数初期値： i_ORG_NAME


	final static String i_ORG_NAME = null;

	// 第 188 変数初期値： i_ORG_CD


	final static String i_ORG_CD = null;

	// 第 189 変数初期値： i_USER_NAME


	final static String i_USER_NAME = null;

	// 第 190 変数初期値： i_USER_CD


	final static String i_USER_CD = null;

	// 第 191 変数初期値： i_UNIT_QTY_TYP


	final static String i_UNIT_QTY_TYP = null;

	// 第 192 変数初期値： i_l_h_ANS_DLV_DATE_EXIST_FLG


	final static String i_l_h_ANS_DLV_DATE_EXIST_FLG = null;

	// 第 193 変数初期値： i_FIELD_VALUE


	final static String i_FIELD_VALUE = null;

*/

	//{{user_implement_code
		// TODO: 初期化で使う定数は、ここに記述してください。
		// 以下に記述した内容は自動的には変更されません。
	// 第 1 変数初期値： i_rdoSHIP_INST

	final static String i_rdoSHIP_INST = null;

	// 第 2 変数初期値： i_rdoSHIP_UPDATE

	final static String i_rdoSHIP_UPDATE = null;

	// 第 3 変数初期値： i_l_CUR_UNIT

	final static String i_l_CUR_UNIT = null;

	// 第 4 変数初期値： i_DETAIL_NO

	final static String i_DETAIL_NO = null;

	// 第 5 変数初期値： i_ACPT_ODR_CD

	final static String i_ACPT_ODR_CD = null;

	// 第 6 変数初期値： i_c_DOODR

	final static String i_c_DOODR = null;

	// 第 7 変数初期値： i_PREPARE_QTY

	final static String i_PREPARE_QTY = null;

	// 第 8 変数初期値： i_c_INPUTODRCD

	final static String i_c_INPUTODRCD = null;

	// 第 9 変数初期値： i_QTY

	final static String i_QTY = null;

	// 第 10 変数初期値： i_QTY_UNIT

	final static String i_QTY_UNIT = null;

	// 第 11 変数初期値： i_ODR_PRICE_UNIT

	final static String i_ODR_PRICE_UNIT = null;

	// 第 12 変数初期値： i_ISSUE_INST_COMMENT

	final static String i_ISSUE_INST_COMMENT = null;

	// 第 13 変数初期値： i_APPROVED_COMMENT

	final static String i_APPROVED_COMMENT = null;

	// 第 14 変数初期値： i_CUST_CHRG_PSN_NAME

	final static String i_CUST_CHRG_PSN_NAME = null;

	// 第 15 変数初期値： i_ES_ORG_NAME

	final static String i_ES_ORG_NAME = null;

	// 第 16 変数初期値： i_l_DLV_LOC_NAME

	final static String i_l_DLV_LOC_NAME = null;

	// 第 17 変数初期値： i_l_CUST_ITEM_NAME

	final static String i_l_CUST_ITEM_NAME = null;

	// 第 18 変数初期値： i_l_ITEM_NAME

	final static String i_l_ITEM_NAME = null;

	// 第 19 変数初期値： i_l_JOB_ODR_DLV_DATE

	final static String i_l_JOB_ODR_DLV_DATE = null;

	// 第 20 変数初期値： i_l_ALC_GRP_CD

	final static String i_l_ALC_GRP_CD = null;

	// 第 21 変数初期値： i_l_JOB_ODR_CD

	final static String i_l_JOB_ODR_CD = null;

	// 第 22 変数初期値： i_l_APPR_REMARKS

	final static String i_l_APPR_REMARKS = null;

	// 第 23 変数初期値： i_h_UPDATE_FLG

	final static String i_h_UPDATE_FLG = null;

	// 第 24 変数初期値： i_l_TEST_MODIFY_COUNT

	final static String i_l_TEST_MODIFY_COUNT = null;

	// 第 25 変数初期値： i_l_TPJ_MODIFY_COUNT

	final static String i_l_TPJ_MODIFY_COUNT = null;

	// 第 26 変数初期値： i_l_h_ESTIMATE_TYPE

	final static String i_l_h_ESTIMATE_TYPE = null;

	// 第 27 変数初期値： i_h_ESTIMATE_TYPE

	final static String i_h_ESTIMATE_TYPE = null;

	// 第 28 変数初期値： i_l_h_PREC_ARRANGE_FLG

	final static String i_l_h_PREC_ARRANGE_FLG = null;

	// 第 29 変数初期値： i_l_c_DOODR

	final static String i_l_c_DOODR = null;

	// 第 30 変数初期値： i_l_c_INPUTODRCD

	final static String i_l_c_INPUTODRCD = null;

	// 第 31 変数初期値： i_h_PREC_ARRANGE_FLG

	final static String i_h_PREC_ARRANGE_FLG = null;

	// 第 32 変数初期値： i_l_h_ODR_TYP

	final static String i_l_h_ODR_TYP = null;

	// 第 33 変数初期値： i_h_ODR_TYP

	final static String i_h_ODR_TYP = null;

	// 第 34 変数初期値： i_h_ODR_TYP3

	final static String i_h_ODR_TYP3 = null;

	// 第 35 変数初期値： i_h_APR_ODR

	final static String i_h_APR_ODR = null;

	// 第 36 変数初期値： i_h_PRD_REQ_JOB_ODR_TYP_1

	final static String i_h_PRD_REQ_JOB_ODR_TYP_1 = null;

	// 第 37 変数初期値： i_h_PRD_REQ_JOB_ODR_TYP_2

	final static String i_h_PRD_REQ_JOB_ODR_TYP_2 = null;

	// 第 38 変数初期値： i_h_DLV_LOC_CD

	final static String i_h_DLV_LOC_CD = null;

	// 第 39 変数初期値： i_h_ANS_DLV_DATE_EXIST_FLG

	final static String i_h_ANS_DLV_DATE_EXIST_FLG = null;

	// 第 40 変数初期値： i_ITEM_NAME_R

	final static String i_ITEM_NAME_R = null;

	// 第 41 変数初期値： i_l_h_DEPO_TYP

	final static String i_l_h_DEPO_TYP = null;

	// 第 42 変数初期値： i_PROJECT_CD

	final static String i_PROJECT_CD = null;

	// 第 43 変数初期値： i_ESTIMATE_NO

	final static String i_ESTIMATE_NO = null;

	// 第 44 変数初期値： i_l_DETAL_NO

	final static String i_l_DETAL_NO = null;

	// 第 45 変数初期値： i_CUST_NAME

	final static String i_CUST_NAME = null;

	// 第 46 変数初期値： i_COMPANY_CD

	final static String i_COMPANY_CD = null;

	// 第 47 変数初期値： i_CODE

	final static String i_CODE = null;

	// 第 48 変数初期値： i_SYS_CLASS

	final static String i_SYS_CLASS = null;

	// 第 49 変数初期値： i_CLASS_CODE

	final static String i_CLASS_CODE = null;

	// 第 50 変数初期値： i_BUSINESS_OPR_DATE

	final static String i_BUSINESS_OPR_DATE = null;

	// 第 51 変数初期値： i_PLANT_CD

	final static String i_PLANT_CD = null;

	// 第 52 変数初期値： i_HOME_CUR_CD

	final static String i_HOME_CUR_CD = null;

	// 第 53 変数初期値： i_VALUE

	final static String i_VALUE = null;

	// 第 54 変数初期値： i_NAME

	final static String i_NAME = null;

	// 第 55 変数初期値： i_PROJECT_NAME

	final static String i_PROJECT_NAME = null;

	// 第 56 変数初期値： i_CUST_CD

	final static String i_CUST_CD = null;

	// 第 57 変数初期値： i_PROJECT_STAT

	final static String i_PROJECT_STAT = null;

	// 第 58 変数初期値： i_DLV_LOC_CD

	final static String i_DLV_LOC_CD = null;

	// 第 59 変数初期値： i_MODIFY_COUNT

	final static String i_MODIFY_COUNT = null;

	// 第 60 変数初期値： i_CUR_CD

	final static String i_CUR_CD = null;

	// 第 61 変数初期値： i_EXCH_TYP

	final static String i_EXCH_TYP = null;

	// 第 62 変数初期値： i_TAX_APPLY_TYP

	final static String i_TAX_APPLY_TYP = null;

	// 第 63 変数初期値： i_TAX_CD

	final static String i_TAX_CD = null;

	// 第 64 変数初期値： i_TAX_CALC_TYP

	final static String i_TAX_CALC_TYP = null;

	// 第 65 変数初期値： i_PARTIAL_SHIP_INST_FLG

	final static String i_PARTIAL_SHIP_INST_FLG = null;

	// 第 66 変数初期値： i_CUR_NAME

	final static String i_CUR_NAME = null;

	// 第 67 変数初期値： i_CUR_UNIT

	final static String i_CUR_UNIT = null;

	// 第 68 変数初期値： i_DECIMAL_FIG

	final static String i_DECIMAL_FIG = null;

	// 第 69 変数初期値： i_l_ES_USER_CD

	final static String i_l_ES_USER_CD = null;

	// 第 70 変数初期値： i_l_ES_ORG_CD

	final static String i_l_ES_ORG_CD = null;

	// 第 71 変数初期値： i_l_CUST_ITEM_CD

	final static String i_l_CUST_ITEM_CD = null;

	// 第 72 変数初期値： i_l_ESTIMATE_QTY

	final static String i_l_ESTIMATE_QTY = null;

	// 第 73 変数初期値： i_l_UNIT_CD

	final static String i_l_UNIT_CD = null;

	// 第 74 変数初期値： i_l_ESTIMATE_UNIT_PRICE

	final static String i_l_ESTIMATE_UNIT_PRICE = null;

	// 第 75 変数初期値： i_l_ESTIMATE_AMOUNT

	final static String i_l_ESTIMATE_AMOUNT = null;

	// 第 76 変数初期値： i_l_ESTIMATE_TYPE

	final static String i_l_ESTIMATE_TYPE = null;

	// 第 77 変数初期値： i_l_ESTIMATE_ITEM_NAME

	final static String i_l_ESTIMATE_ITEM_NAME = null;

	// 第 78 変数初期値： i_l_USER_NAME

	final static String i_l_USER_NAME = null;

	// 第 79 変数初期値： i_l_ORG_NAME

	final static String i_l_ORG_NAME = null;

	// 第 80 変数初期値： i_DLV_LOC_NAME

	final static String i_DLV_LOC_NAME = null;

	// 第 81 変数初期値： i_TRANSPORT_LT

	final static String i_TRANSPORT_LT = null;

	// 第 82 変数初期値： i_TRANSPORT_CD

	final static String i_TRANSPORT_CD = null;

	// 第 83 変数初期値： i_TRANSPORT_TYP

	final static String i_TRANSPORT_TYP = null;

	// 第 84 変数初期値： i_DEPO_WH_CD

	final static String i_DEPO_WH_CD = null;

	// 第 85 変数初期値： i_SHIP_PLANT_CD

	final static String i_SHIP_PLANT_CD = null;

	// 第 86 変数初期値： i_ITEM_CD

	final static String i_ITEM_CD = null;

	// 第 87 変数初期値： i_DEPO_TYP

	final static String i_DEPO_TYP = null;

	// 第 88 変数初期値： i_CUST_ITEM_NAME

	final static String i_CUST_ITEM_NAME = null;

	// 第 89 変数初期値： i_ITEM_NAME

	final static String i_ITEM_NAME = null;

	// 第 90 変数初期値： i_CUST_ITEM_CD

	final static String i_CUST_ITEM_CD = null;

	// 第 91 変数初期値： i_ESTIMATE_TYPE

	final static String i_ESTIMATE_TYPE = null;

	// 第 92 変数初期値： i_ODR_NO

	final static String i_ODR_NO = null;

	// 第 93 変数初期値： i_DETAL_NO

	final static String i_DETAL_NO = null;

	// 第 94 変数初期値： i_l_ODR_NO

	final static String i_l_ODR_NO = null;

	// 第 95 変数初期値： i_l_ODR_TYP

	final static String i_l_ODR_TYP = null;

	// 第 96 変数初期値： i_l_CUST_ODR_NO

	final static String i_l_CUST_ODR_NO = null;

	// 第 97 変数初期値： i_l_ITEM_CD

	final static String i_l_ITEM_CD = null;

	// 第 98 変数初期値： i_l_DESINATED_DLV_DATE

	final static String i_l_DESINATED_DLV_DATE = null;

	// 第 99 変数初期値： i_l_ODR_QTY

	final static String i_l_ODR_QTY = null;

	// 第 100 変数初期値： i_l_ODR_AMOUNT

	final static String i_l_ODR_AMOUNT = null;

	// 第 101 変数初期値： i_l_ODR_AMOUNT_EXCH_RATES

	final static String i_l_ODR_AMOUNT_EXCH_RATES = null;

	// 第 102 変数初期値： i_l_DLV_LOC_CD

	final static String i_l_DLV_LOC_CD = null;

	// 第 103 変数初期値： i_l_DEPO_TYP

	final static String i_l_DEPO_TYP = null;

	// 第 104 変数初期値： i_l_ODR_ACPT_DATE

	final static String i_l_ODR_ACPT_DATE = null;

	// 第 105 変数初期値： i_l_REMARKS

	final static String i_l_REMARKS = null;

	// 第 106 変数初期値： i_l_OWN_PERSON_CD

	final static String i_l_OWN_PERSON_CD = null;

	// 第 107 変数初期値： i_l_TODR_MODIFY_COUNT

	final static String i_l_TODR_MODIFY_COUNT = null;

	// 第 108 変数初期値： i_l_CUST_CHRG_PSN_NAME

	final static String i_l_CUST_CHRG_PSN_NAME = null;

	// 第 109 変数初期値： i_l_OWN_ORG_CD

	final static String i_l_OWN_ORG_CD = null;

	// 第 110 変数初期値： i_l_CUST_CHRG_ORG_NAME

	final static String i_l_CUST_CHRG_ORG_NAME = null;

	// 第 111 変数初期値： i_ODR_TYP

	final static String i_ODR_TYP = null;

	// 第 112 変数初期値： i_ODR_CTL_NO

	final static String i_ODR_CTL_NO = null;

	// 第 113 変数初期値： i_CUST_ODR_NO

	final static String i_CUST_ODR_NO = null;

	// 第 114 変数初期値： i_CUST_CHRG_ORG_CD

	final static String i_CUST_CHRG_ORG_CD = null;

	// 第 115 変数初期値： i_CUST_CHRG_PSN_CD

	final static String i_CUST_CHRG_PSN_CD = null;

	// 第 116 変数初期値： i_ODR_ACPT_PSN_CD

	final static String i_ODR_ACPT_PSN_CD = null;

	// 第 117 変数初期値： i_CURRNCY_CD

	final static String i_CURRNCY_CD = null;

	// 第 118 変数初期値： i_DLV_LOC_NAME_KANJI

	final static String i_DLV_LOC_NAME_KANJI = null;

	// 第 119 変数初期値： i_ODR_UNIT_PRICE

	final static String i_ODR_UNIT_PRICE = null;

	// 第 120 変数初期値： i_SPCL_PRICE_TYP

	final static String i_SPCL_PRICE_TYP = null;

	// 第 121 変数初期値： i_DESINATED_DLV_DATE

	final static String i_DESINATED_DLV_DATE = null;

	// 第 122 変数初期値： i_STD_DESINATED_RCV_DATE

	final static String i_STD_DESINATED_RCV_DATE = null;

	// 第 123 変数初期値： i_ODR_QTY

	final static String i_ODR_QTY = null;

	// 第 124 変数初期値： i_REMAIN_UNCONFIRM_ODR_QTY

	final static String i_REMAIN_UNCONFIRM_ODR_QTY = null;

	// 第 125 変数初期値： i_CANCELED_UNCONFIRM_ODR_QTY

	final static String i_CANCELED_UNCONFIRM_ODR_QTY = null;

	// 第 126 変数初期値： i_UNIT_CD

	final static String i_UNIT_CD = null;

	// 第 127 変数初期値： i_UNCONFIRM_ODR_BALANCE

	final static String i_UNCONFIRM_ODR_BALANCE = null;

	// 第 128 変数初期値： i_ODR_AMOUNT

	final static String i_ODR_AMOUNT = null;

	// 第 129 変数初期値： i_ODR_AMOUNT_EXCH_RATES

	final static String i_ODR_AMOUNT_EXCH_RATES = null;

	// 第 130 変数初期値： i_ODR_CMPLT_FLG

	final static String i_ODR_CMPLT_FLG = null;

	// 第 131 変数初期値： i_PART_NAME

	final static String i_PART_NAME = null;

	// 第 132 変数初期値： i_REMARKS

	final static String i_REMARKS = null;

	// 第 133 変数初期値： i_ODR_ACPT_DATE

	final static String i_ODR_ACPT_DATE = null;

	// 第 134 変数初期値： i_SHIP_PLAN_REMAIN_QTY

	final static String i_SHIP_PLAN_REMAIN_QTY = null;

	// 第 135 変数初期値： i_SHIP_PLAN_CMPLT_FLG

	final static String i_SHIP_PLAN_CMPLT_FLG = null;

	// 第 136 変数初期値： i_UNCONFIRMED_ODR_EFF_OVR_FLG

	final static String i_UNCONFIRMED_ODR_EFF_OVR_FLG = null;

	// 第 137 変数初期値： i_ENTRY_TYP

	final static String i_ENTRY_TYP = null;

	// 第 138 変数初期値： i_DEL_FLG

	final static String i_DEL_FLG = null;

	// 第 139 変数初期値： i_JOB_ODR_SET_FLG

	final static String i_JOB_ODR_SET_FLG = null;

	// 第 140 変数初期値： i_SLIP_CD

	final static String i_SLIP_CD = null;

	// 第 141 変数初期値： i_ORGN_ODR_NO

	final static String i_ORGN_ODR_NO = null;

	// 第 142 変数初期値： i_ADD_ODR_FLG

	final static String i_ADD_ODR_FLG = null;

	// 第 143 変数初期値： i_ODR_CMPLT_DATE

	final static String i_ODR_CMPLT_DATE = null;

	// 第 144 変数初期値： i_ESTIMATE_STAT

	final static String i_ESTIMATE_STAT = null;

	// 第 145 変数初期値： i_ES_ORG_CD

	final static String i_ES_ORG_CD = null;

	// 第 146 変数初期値： i_ES_USER_CD

	final static String i_ES_USER_CD = null;

	// 第 147 変数初期値： i_ESTIMATE_QTY

	final static String i_ESTIMATE_QTY = null;

	// 第 148 変数初期値： i_ESTIMATE_UNIT_PRICE

	final static String i_ESTIMATE_UNIT_PRICE = null;

	// 第 149 変数初期値： i_ESTIMATE_AMOUNT

	final static String i_ESTIMATE_AMOUNT = null;

	// 第 150 変数初期値： i_ODR_FLG

	final static String i_ODR_FLG = null;

	// 第 151 変数初期値： i_JOB_ODR_CD

	final static String i_JOB_ODR_CD = null;

	// 第 152 変数初期値： i_CAL_NO

	final static String i_CAL_NO = null;

	// 第 153 変数初期値： i_JOB_ODR_DLV_DATE

	final static String i_JOB_ODR_DLV_DATE = null;

	// 第 154 変数初期値： i_RSLT_CTL_SEQ_CD

	final static String i_RSLT_CTL_SEQ_CD = null;

	// 第 155 変数初期値： i_UNIT

	final static String i_UNIT = null;

	// 第 156 変数初期値： i_DLV_PLACE_CD

	final static String i_DLV_PLACE_CD = null;

	// 第 157 変数初期値： i_UNIT_PRICE

	final static String i_UNIT_PRICE = null;

	// 第 158 変数初期値： i_SPCL_PRICE_CO

	final static String i_SPCL_PRICE_CO = null;

	// 第 159 変数初期値： i_CUST_DLV_CD

	final static String i_CUST_DLV_CD = null;

	// 第 160 変数初期値： i_CUST_DLV_KEY_CD

	final static String i_CUST_DLV_KEY_CD = null;

	// 第 161 変数初期値： i_IF_CTL_NO

	final static String i_IF_CTL_NO = null;

	// 第 162 変数初期値： i_ODR_SEQ

	final static String i_ODR_SEQ = null;

	// 第 163 変数初期値： i_PART_DLV_SEQ_NO

	final static String i_PART_DLV_SEQ_NO = null;

	// 第 164 変数初期値： i_LAST_ANS_DLV_DATE_RCD

	final static String i_LAST_ANS_DLV_DATE_RCD = null;

	// 第 165 変数初期値： i_DESINATED_SHIP_DATE

	final static String i_DESINATED_SHIP_DATE = null;

	// 第 166 変数初期値： i_DESINATED_SHIP_QTY

	final static String i_DESINATED_SHIP_QTY = null;

	// 第 167 変数初期値： i_REST_SHIP_ODR_QTY

	final static String i_REST_SHIP_ODR_QTY = null;

	// 第 168 変数初期値： i_SHIP_ODR_CMPLT_FLG

	final static String i_SHIP_ODR_CMPLT_FLG = null;

	// 第 169 変数初期値： i_JOB_ODR_CANCEL_NO

	final static String i_JOB_ODR_CANCEL_NO = null;

	// 第 170 変数初期値： i_JOB_ODR_TYP

	final static String i_JOB_ODR_TYP = null;

	// 第 171 変数初期値： i_PLAN_TYP

	final static String i_PLAN_TYP = null;

	// 第 172 変数初期値： i_JOB_ODR_QTY

	final static String i_JOB_ODR_QTY = null;

	// 第 173 変数初期値： i_ALC_GRP_CD

	final static String i_ALC_GRP_CD = null;

	// 第 174 変数初期値： i_JOB_ODR_STS_TYP

	final static String i_JOB_ODR_STS_TYP = null;

	// 第 175 変数初期値： i_JOB_ODR_EXP_TYP

	final static String i_JOB_ODR_EXP_TYP = null;

	// 第 176 変数初期値： i_JOB_ODR_DEL_FLG

	final static String i_JOB_ODR_DEL_FLG = null;

	// 第 177 変数初期値： i_ALCD_QTY

	final static String i_ALCD_QTY = null;

	// 第 178 変数初期値： i_CUS_DLV_CD

	final static String i_CUS_DLV_CD = null;

	// 第 179 変数初期値： i_CUS_DLV_KEY_CD

	final static String i_CUS_DLV_KEY_CD = null;

	// 第 180 変数初期値： i_UNOFFICIAL_RECEIPT_FLAG

	final static String i_UNOFFICIAL_RECEIPT_FLAG = null;

	// 第 181 変数初期値： i_JOB_OD_CD_PREFIX

	final static String i_JOB_OD_CD_PREFIX = null;

	// 第 182 変数初期値： i_CTL_SEQ_CD

	final static String i_CTL_SEQ_CD = null;

	// 第 183 変数初期値： i_NEW_OLD_FLG

	final static String i_NEW_OLD_FLG = null;

	// 第 184 変数初期値： i_TRAN_TYPE

	final static String i_TRAN_TYPE = null;

	// 第 185 変数初期値： i_EXCH_RATE

	final static String i_EXCH_RATE = null;

	// 第 186 変数初期値： i_ORG_NAME

	final static String i_ORG_NAME = null;

	// 第 187 変数初期値： i_ORG_CD

	final static String i_ORG_CD = null;

	// 第 188 変数初期値： i_USER_NAME

	final static String i_USER_NAME = null;

	// 第 189 変数初期値： i_USER_CD

	final static String i_USER_CD = null;

	// 第 190 変数初期値： i_UNIT_QTY_TYP

	final static String i_UNIT_QTY_TYP = null;

	// 第 191 変数初期値： i_l_h_ANS_DLV_DATE_EXIST_FLG

	final static String i_l_h_ANS_DLV_DATE_EXIST_FLG = null;

	// 第 192 変数初期値： i_FIELD_VALUE

	final static String i_FIELD_VALUE = null;


	/**
	 * 初期化
	 *
	 */
	public void initialize()
	{

		clear();

		m_rdoSHIP_INST = i_rdoSHIP_INST;
		m_rdoSHIP_UPDATE = i_rdoSHIP_UPDATE;
		m_l_CUR_UNIT = i_l_CUR_UNIT;
		m_DETAIL_NO = i_DETAIL_NO;
		m_ACPT_ODR_CD = i_ACPT_ODR_CD;
		m_c_DOODR = i_c_DOODR;
		m_PREPARE_QTY = i_PREPARE_QTY;
		m_c_INPUTODRCD = i_c_INPUTODRCD;
		m_QTY = i_QTY;
		m_QTY_UNIT = i_QTY_UNIT;
		m_ODR_PRICE_UNIT = i_ODR_PRICE_UNIT;
		m_ISSUE_INST_COMMENT = i_ISSUE_INST_COMMENT;
		m_APPROVED_COMMENT = i_APPROVED_COMMENT;
		m_CUST_CHRG_PSN_NAME = i_CUST_CHRG_PSN_NAME;
		m_ES_ORG_NAME = i_ES_ORG_NAME;
		m_l_DLV_LOC_NAME = i_l_DLV_LOC_NAME;
		m_l_CUST_ITEM_NAME = i_l_CUST_ITEM_NAME;
		m_l_ITEM_NAME = i_l_ITEM_NAME;
		m_l_JOB_ODR_DLV_DATE = i_l_JOB_ODR_DLV_DATE;
		m_l_ALC_GRP_CD = i_l_ALC_GRP_CD;
		m_l_JOB_ODR_CD = i_l_JOB_ODR_CD;
		m_l_APPR_REMARKS = i_l_APPR_REMARKS;
		m_h_UPDATE_FLG = i_h_UPDATE_FLG;
		m_l_TEST_MODIFY_COUNT = i_l_TEST_MODIFY_COUNT;
		m_l_TPJ_MODIFY_COUNT = i_l_TPJ_MODIFY_COUNT;
		m_l_h_ESTIMATE_TYPE = i_l_h_ESTIMATE_TYPE;
		m_h_ESTIMATE_TYPE = i_h_ESTIMATE_TYPE;
		m_l_h_PREC_ARRANGE_FLG = i_l_h_PREC_ARRANGE_FLG;
		m_l_c_DOODR = i_l_c_DOODR;
		m_l_c_INPUTODRCD = i_l_c_INPUTODRCD;
		m_h_PREC_ARRANGE_FLG = i_h_PREC_ARRANGE_FLG;
		m_l_h_ODR_TYP = i_l_h_ODR_TYP;
		m_h_ODR_TYP = i_h_ODR_TYP;
		m_h_ODR_TYP3 = i_h_ODR_TYP3;
		m_h_APR_ODR = i_h_APR_ODR;
		m_h_PRD_REQ_JOB_ODR_TYP_1 = i_h_PRD_REQ_JOB_ODR_TYP_1;
		m_h_PRD_REQ_JOB_ODR_TYP_2 = i_h_PRD_REQ_JOB_ODR_TYP_2;
		m_h_DLV_LOC_CD = i_h_DLV_LOC_CD;
		m_h_ANS_DLV_DATE_EXIST_FLG = i_h_ANS_DLV_DATE_EXIST_FLG;
		m_ITEM_NAME_R = i_ITEM_NAME_R;
		m_l_h_DEPO_TYP = i_l_h_DEPO_TYP;
		m_PROJECT_CD = i_PROJECT_CD;
		m_ESTIMATE_NO = i_ESTIMATE_NO;
		m_l_DETAL_NO = i_l_DETAL_NO;
		m_CUST_NAME = i_CUST_NAME;
		m_COMPANY_CD = i_COMPANY_CD;
		m_CODE = i_CODE;
		m_SYS_CLASS = i_SYS_CLASS;
		m_CLASS_CODE = i_CLASS_CODE;
		m_BUSINESS_OPR_DATE = i_BUSINESS_OPR_DATE;
		m_PLANT_CD = i_PLANT_CD;
		m_HOME_CUR_CD = i_HOME_CUR_CD;
		m_VALUE = i_VALUE;
		m_NAME = i_NAME;
		m_PROJECT_NAME = i_PROJECT_NAME;
		m_CUST_CD = i_CUST_CD;
		m_PROJECT_STAT = i_PROJECT_STAT;
		m_DLV_LOC_CD = i_DLV_LOC_CD;
		m_MODIFY_COUNT = i_MODIFY_COUNT;
		m_CUR_CD = i_CUR_CD;
		m_EXCH_TYP = i_EXCH_TYP;
		m_TAX_APPLY_TYP = i_TAX_APPLY_TYP;
		m_TAX_CD = i_TAX_CD;
		m_TAX_CALC_TYP = i_TAX_CALC_TYP;
		m_PARTIAL_SHIP_INST_FLG = i_PARTIAL_SHIP_INST_FLG;
		m_CUR_NAME = i_CUR_NAME;
		m_CUR_UNIT = i_CUR_UNIT;
		m_DECIMAL_FIG = i_DECIMAL_FIG;
		m_l_ES_USER_CD = i_l_ES_USER_CD;
		m_l_ES_ORG_CD = i_l_ES_ORG_CD;
		m_l_CUST_ITEM_CD = i_l_CUST_ITEM_CD;
		m_l_ESTIMATE_QTY = i_l_ESTIMATE_QTY;
		m_l_UNIT_CD = i_l_UNIT_CD;
		m_l_ESTIMATE_UNIT_PRICE = i_l_ESTIMATE_UNIT_PRICE;
		m_l_ESTIMATE_AMOUNT = i_l_ESTIMATE_AMOUNT;
		m_l_ESTIMATE_TYPE = i_l_ESTIMATE_TYPE;
		m_l_ESTIMATE_ITEM_NAME = i_l_ESTIMATE_ITEM_NAME;
		m_l_USER_NAME = i_l_USER_NAME;
		m_l_ORG_NAME = i_l_ORG_NAME;
		m_DLV_LOC_NAME = i_DLV_LOC_NAME;
		m_TRANSPORT_LT = i_TRANSPORT_LT;
		m_TRANSPORT_CD = i_TRANSPORT_CD;
		m_TRANSPORT_TYP = i_TRANSPORT_TYP;
		m_DEPO_WH_CD = i_DEPO_WH_CD;
		m_SHIP_PLANT_CD = i_SHIP_PLANT_CD;
		m_ITEM_CD = i_ITEM_CD;
		m_DEPO_TYP = i_DEPO_TYP;
		m_CUST_ITEM_NAME = i_CUST_ITEM_NAME;
		m_ITEM_NAME = i_ITEM_NAME;
		m_CUST_ITEM_CD = i_CUST_ITEM_CD;
		m_ESTIMATE_TYPE = i_ESTIMATE_TYPE;
		m_ODR_NO = i_ODR_NO;
		m_DETAL_NO = i_DETAL_NO;
		m_l_ODR_NO = i_l_ODR_NO;
		m_l_ODR_TYP = i_l_ODR_TYP;
		m_l_CUST_ODR_NO = i_l_CUST_ODR_NO;
		m_l_ITEM_CD = i_l_ITEM_CD;
		m_l_DESINATED_DLV_DATE = i_l_DESINATED_DLV_DATE;
		m_l_ODR_QTY = i_l_ODR_QTY;
		m_l_ODR_AMOUNT = i_l_ODR_AMOUNT;
		m_l_ODR_AMOUNT_EXCH_RATES = i_l_ODR_AMOUNT_EXCH_RATES;
		m_l_DLV_LOC_CD = i_l_DLV_LOC_CD;
		m_l_DEPO_TYP = i_l_DEPO_TYP;
		m_l_ODR_ACPT_DATE = i_l_ODR_ACPT_DATE;
		m_l_REMARKS = i_l_REMARKS;
		m_l_OWN_PERSON_CD = i_l_OWN_PERSON_CD;
		m_l_TODR_MODIFY_COUNT = i_l_TODR_MODIFY_COUNT;
		m_l_CUST_CHRG_PSN_NAME = i_l_CUST_CHRG_PSN_NAME;
		m_l_OWN_ORG_CD = i_l_OWN_ORG_CD;
		m_l_CUST_CHRG_ORG_NAME = i_l_CUST_CHRG_ORG_NAME;
		m_ODR_TYP = i_ODR_TYP;
		m_ODR_CTL_NO = i_ODR_CTL_NO;
		m_CUST_ODR_NO = i_CUST_ODR_NO;
		m_CUST_CHRG_ORG_CD = i_CUST_CHRG_ORG_CD;
		m_CUST_CHRG_PSN_CD = i_CUST_CHRG_PSN_CD;
		m_ODR_ACPT_PSN_CD = i_ODR_ACPT_PSN_CD;
		m_CURRNCY_CD = i_CURRNCY_CD;
		m_DLV_LOC_NAME_KANJI = i_DLV_LOC_NAME_KANJI;
		m_ODR_UNIT_PRICE = i_ODR_UNIT_PRICE;
		m_SPCL_PRICE_TYP = i_SPCL_PRICE_TYP;
		m_DESINATED_DLV_DATE = i_DESINATED_DLV_DATE;
		m_STD_DESINATED_RCV_DATE = i_STD_DESINATED_RCV_DATE;
		m_ODR_QTY = i_ODR_QTY;
		m_REMAIN_UNCONFIRM_ODR_QTY = i_REMAIN_UNCONFIRM_ODR_QTY;
		m_CANCELED_UNCONFIRM_ODR_QTY = i_CANCELED_UNCONFIRM_ODR_QTY;
		m_UNIT_CD = i_UNIT_CD;
		m_UNCONFIRM_ODR_BALANCE = i_UNCONFIRM_ODR_BALANCE;
		m_ODR_AMOUNT = i_ODR_AMOUNT;
		m_ODR_AMOUNT_EXCH_RATES = i_ODR_AMOUNT_EXCH_RATES;
		m_ODR_CMPLT_FLG = i_ODR_CMPLT_FLG;
		m_PART_NAME = i_PART_NAME;
		m_REMARKS = i_REMARKS;
		m_ODR_ACPT_DATE = i_ODR_ACPT_DATE;
		m_SHIP_PLAN_REMAIN_QTY = i_SHIP_PLAN_REMAIN_QTY;
		m_SHIP_PLAN_CMPLT_FLG = i_SHIP_PLAN_CMPLT_FLG;
		m_UNCONFIRMED_ODR_EFF_OVR_FLG = i_UNCONFIRMED_ODR_EFF_OVR_FLG;
		m_ENTRY_TYP = i_ENTRY_TYP;
		m_DEL_FLG = i_DEL_FLG;
		m_JOB_ODR_SET_FLG = i_JOB_ODR_SET_FLG;
		m_SLIP_CD = i_SLIP_CD;
		m_ORGN_ODR_NO = i_ORGN_ODR_NO;
		m_ADD_ODR_FLG = i_ADD_ODR_FLG;
		m_ODR_CMPLT_DATE = i_ODR_CMPLT_DATE;
		m_ESTIMATE_STAT = i_ESTIMATE_STAT;
		m_ES_ORG_CD = i_ES_ORG_CD;
		m_ES_USER_CD = i_ES_USER_CD;
		m_ESTIMATE_QTY = i_ESTIMATE_QTY;
		m_ESTIMATE_UNIT_PRICE = i_ESTIMATE_UNIT_PRICE;
		m_ESTIMATE_AMOUNT = i_ESTIMATE_AMOUNT;
		m_ODR_FLG = i_ODR_FLG;
		m_JOB_ODR_CD = i_JOB_ODR_CD;
		m_CAL_NO = i_CAL_NO;
		m_JOB_ODR_DLV_DATE = i_JOB_ODR_DLV_DATE;
		m_RSLT_CTL_SEQ_CD = i_RSLT_CTL_SEQ_CD;
		m_UNIT = i_UNIT;
		m_DLV_PLACE_CD = i_DLV_PLACE_CD;
		m_UNIT_PRICE = i_UNIT_PRICE;
		m_SPCL_PRICE_CO = i_SPCL_PRICE_CO;
		m_CUST_DLV_CD = i_CUST_DLV_CD;
		m_CUST_DLV_KEY_CD = i_CUST_DLV_KEY_CD;
		m_IF_CTL_NO = i_IF_CTL_NO;
		m_ODR_SEQ = i_ODR_SEQ;
		m_PART_DLV_SEQ_NO = i_PART_DLV_SEQ_NO;
		m_LAST_ANS_DLV_DATE_RCD = i_LAST_ANS_DLV_DATE_RCD;
		m_DESINATED_SHIP_DATE = i_DESINATED_SHIP_DATE;
		m_DESINATED_SHIP_QTY = i_DESINATED_SHIP_QTY;
		m_REST_SHIP_ODR_QTY = i_REST_SHIP_ODR_QTY;
		m_SHIP_ODR_CMPLT_FLG = i_SHIP_ODR_CMPLT_FLG;
		m_JOB_ODR_CANCEL_NO = i_JOB_ODR_CANCEL_NO;
		m_JOB_ODR_TYP = i_JOB_ODR_TYP;
		m_PLAN_TYP = i_PLAN_TYP;
		m_JOB_ODR_QTY = i_JOB_ODR_QTY;
		m_ALC_GRP_CD = i_ALC_GRP_CD;
		m_JOB_ODR_STS_TYP = i_JOB_ODR_STS_TYP;
		m_JOB_ODR_EXP_TYP = i_JOB_ODR_EXP_TYP;
		m_JOB_ODR_DEL_FLG = i_JOB_ODR_DEL_FLG;
		m_ALCD_QTY = i_ALCD_QTY;
		m_CUS_DLV_CD = i_CUS_DLV_CD;
		m_CUS_DLV_KEY_CD = i_CUS_DLV_KEY_CD;
		m_UNOFFICIAL_RECEIPT_FLAG = i_UNOFFICIAL_RECEIPT_FLAG;
		m_JOB_OD_CD_PREFIX = i_JOB_OD_CD_PREFIX;
		m_CTL_SEQ_CD = i_CTL_SEQ_CD;
		m_NEW_OLD_FLG = i_NEW_OLD_FLG;
		m_TRAN_TYPE = i_TRAN_TYPE;
		m_EXCH_RATE = i_EXCH_RATE;
		m_ORG_NAME = i_ORG_NAME;
		m_ORG_CD = i_ORG_CD;
		m_USER_NAME = i_USER_NAME;
		m_USER_CD = i_USER_CD;
		m_UNIT_QTY_TYP = i_UNIT_QTY_TYP;
		m_l_h_ANS_DLV_DATE_EXIST_FLG = i_l_h_ANS_DLV_DATE_EXIST_FLG;
		m_FIELD_VALUE = i_FIELD_VALUE;
	}
		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
