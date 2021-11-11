/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0080/src/com/nec/jp/orteus/metamorBase/AE0080/AE0080010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0080;

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
 * CLASS     : AE0080010Control クラス
 * ファイル・クラス説明
 * @author $Author: chenjunhua268 $
 * @version $Revision: 1.4 $ $Date: 2012/10/26 02:23:53 $
 *
 */
//}}user_implement_code_header

public class AE0080010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_ReOutputFlg */
	public String m_ReOutputFlg = null;
	/** 第 2 変数： m_INFO_TYP_CD */
	public String m_INFO_TYP_CD = null;
	/** 第 3 変数： m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** 第 4 変数： m_PUCH_ODR_CD */
	public String m_PUCH_ODR_CD = null;
	/** 第 5 変数： m_DATA_PROC_CD */
	public String m_DATA_PROC_CD = null;
	/** 第 6 変数： m_DATA_CREATE_DATE */
	public String m_DATA_CREATE_DATE = null;
	/** 第 7 変数： m_VEND_CD */
	public String m_VEND_CD = null;
	/** 第 8 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** 第 9 変数： m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** 第 10 変数： m_CRCT_TYP */
	public String m_CRCT_TYP = null;
	/** 第 11 変数： m_COCK_TYP */
	public String m_COCK_TYP = null;
	/** 第 12 変数： m_PUCH_ODR_DATE */
	public String m_PUCH_ODR_DATE = null;
	/** 第 13 変数： m_PUCH_ODR_UNIT */
	public String m_PUCH_ODR_UNIT = null;
	/** 第 14 変数： m_UNIT_COST */
	public String m_UNIT_COST = null;
	/** 第 15 変数： m_UNIT_COST_TYP */
	public String m_UNIT_COST_TYP = null;
	/** 第 16 変数： m_PUCH_ODR_QTY */
	public String m_PUCH_ODR_QTY = null;
	/** 第 17 変数： m_PUCH_ODR_AMOUNT */
	public String m_PUCH_ODR_AMOUNT = null;
	/** 第 18 変数： m_EDI_CONS_TYP */
	public String m_EDI_CONS_TYP = null;
	/** 第 19 変数： m_PUCH_ODR_PERSON */
	public String m_PUCH_ODR_PERSON = null;
	/** 第 20 変数： m_ITEM_SPEC */
	public String m_ITEM_SPEC = null;
	/** 第 21 変数： m_ITEM_DRAW_TYP */
	public String m_ITEM_DRAW_TYP = null;
	/** 第 22 変数： m_ITEM_VERSION */
	public String m_ITEM_VERSION = null;
	/** 第 23 変数： m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** 第 24 変数： m_VEND_ITEM_CD */
	public String m_VEND_ITEM_CD = null;
	/** 第 25 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 26 変数： m_ITEM_DRAW_QTY */
	public String m_ITEM_DRAW_QTY = null;
	/** 第 27 変数： m_ITEM_PKG_UNIT */
	public String m_ITEM_PKG_UNIT = null;
	/** 第 28 変数： m_DIRECT_DLV_TYP */
	public String m_DIRECT_DLV_TYP = null;
	/** 第 29 変数： m_WH_CD */
	public String m_WH_CD = null;
	/** 第 30 変数： m_ACPT_INSPC_TYP */
	public String m_ACPT_INSPC_TYP = null;
	/** 第 31 変数： m_DLV_INST_TYP */
	public String m_DLV_INST_TYP = null;
	/** 第 32 変数： m_DLV_DATE_1 */
	public String m_DLV_DATE_1 = null;
	/** 第 33 変数： m_DLV_INST_QTY_1 */
	public String m_DLV_INST_QTY_1 = null;
	/** 第 34 変数： m_DLV_INST_CD_1 */
	public String m_DLV_INST_CD_1 = null;
	/** 第 35 変数： m_DLV_DATE_2 */
	public String m_DLV_DATE_2 = null;
	/** 第 36 変数： m_DLV_INST_QTY_2 */
	public String m_DLV_INST_QTY_2 = null;
	/** 第 37 変数： m_DLV_INST_CD_2 */
	public String m_DLV_INST_CD_2 = null;
	/** 第 38 変数： m_DLV_DATE_3 */
	public String m_DLV_DATE_3 = null;
	/** 第 39 変数： m_DLV_INST_QTY_3 */
	public String m_DLV_INST_QTY_3 = null;
	/** 第 40 変数： m_DLV_INST_CD_3 */
	public String m_DLV_INST_CD_3 = null;
	/** 第 41 変数： m_DLV_DATE_4 */
	public String m_DLV_DATE_4 = null;
	/** 第 42 変数： m_DLV_INST_QTY_4 */
	public String m_DLV_INST_QTY_4 = null;
	/** 第 43 変数： m_DLV_INST_CD_4 */
	public String m_DLV_INST_CD_4 = null;
	/** 第 44 変数： m_DLV_DATE_5 */
	public String m_DLV_DATE_5 = null;
	/** 第 45 変数： m_DLV_INST_QTY_5 */
	public String m_DLV_INST_QTY_5 = null;
	/** 第 46 変数： m_DLV_INST_CD_5 */
	public String m_DLV_INST_CD_5 = null;
	/** 第 47 変数： m_FREE_COLUMN */
	public String m_FREE_COLUMN = null;
	/** 第 48 変数： m_PUCH_ODR_COMMENT */
	public String m_PUCH_ODR_COMMENT = null;
	/** 第 49 変数： m_INCLUDING_TAX_TYP */
	public String m_INCLUDING_TAX_TYP = null;
	/** 第 50 変数： m_TAX_RELATION_TYP */
	public String m_TAX_RELATION_TYP = null;
	/** 第 51 変数： m_TAX_AMOUNT */
	public String m_TAX_AMOUNT = null;
	/** 第 52 変数： m_NET_AMOUNT */
	public String m_NET_AMOUNT = null;
	/** 第 53 変数： m_RESERVE_CD */
	public String m_RESERVE_CD = null;
	/** 第 54 変数： m_COST_PLAN_CD */
	public String m_COST_PLAN_CD = null;
	/** 第 55 変数： m_STL_COND_TYP */
	public String m_STL_COND_TYP = null;
	/** 第 56 変数： m_END_USER_NAME */
	public String m_END_USER_NAME = null;
	/** 第 57 変数： m_DLV_ADDRESS_CD */
	public String m_DLV_ADDRESS_CD = null;
	/** 第 58 変数： m_DLV_ADDRESS */
	public String m_DLV_ADDRESS = null;
	/** 第 59 変数： m_DLV_NAME */
	public String m_DLV_NAME = null;
	/** 第 60 変数： m_END_USER_ITEM_NAME */
	public String m_END_USER_ITEM_NAME = null;
	/** 第 61 変数： m_END_USER_ITEM_CD */
	public String m_END_USER_ITEM_CD = null;
	/** 第 62 変数： m_END_USER_ODR_CD */
	public String m_END_USER_ODR_CD = null;
	/** 第 63 変数： m_MAKER_NAME */
	public String m_MAKER_NAME = null;
	/** 第 64 変数： m_DLV_KEY_CD_1 */
	public String m_DLV_KEY_CD_1 = null;
	/** 第 65 変数： m_DLV_KEY_CD_2 */
	public String m_DLV_KEY_CD_2 = null;
	/** 第 66 変数： m_DLV_KEY_CD_3 */
	public String m_DLV_KEY_CD_3 = null;
	/** 第 67 変数： m_DLV_KEY_CD_4 */
	public String m_DLV_KEY_CD_4 = null;
	/** 第 68 変数： m_DLV_KEY_CD_5 */
	public String m_DLV_KEY_CD_5 = null;
	/** 第 69 変数： m_WH_NAME */
	public String m_WH_NAME = null;
	/** 第 70 変数： m_PUCH_BCODE_INF */
	public String m_PUCH_BCODE_INF = null;
	/** 第 71 変数： m_PUCH_COMMENT */
	public String m_PUCH_COMMENT = null;
	/** 第 72 変数： m_CONTRACT_COND_TYP */
	public String m_CONTRACT_COND_TYP = null;
	/** 第 73 変数： m_PUCH_ODR_SHAP_TYP */
	public String m_PUCH_ODR_SHAP_TYP = null;
	/** 第 74 変数： m_OWNER_ODR_CD */
	public String m_OWNER_ODR_CD = null;
	/** 第 75 変数： m_QTY_CONTRACT_TYP */
	public String m_QTY_CONTRACT_TYP = null;
	/** 第 76 変数： m_ODR_MODIFY_TYP_1 */
	public String m_ODR_MODIFY_TYP_1 = null;
	/** 第 77 変数： m_ODR_MODIFY_TYP_2 */
	public String m_ODR_MODIFY_TYP_2 = null;
	/** 第 78 変数： m_ODR_MODIFY_TYP_3 */
	public String m_ODR_MODIFY_TYP_3 = null;
	/** 第 79 変数： m_MACHINE_CD */
	public String m_MACHINE_CD = null;
	/** 第 80 変数： m_ENGINNERING_CHG_CD */
	public String m_ENGINNERING_CHG_CD = null;
	/** 第 81 変数： m_ITEM_DRAW_CD */
	public String m_ITEM_DRAW_CD = null;
	/** 第 82 変数： m_DLV_DOC_FORM_1 */
	public String m_DLV_DOC_FORM_1 = null;
	/** 第 83 変数： m_DLV_DOC_COPY_NUM_1 */
	public String m_DLV_DOC_COPY_NUM_1 = null;
	/** 第 84 変数： m_DLV_DOC_LANG_1 */
	public String m_DLV_DOC_LANG_1 = null;
	/** 第 85 変数： m_DLV_DOC_FORM_2 */
	public String m_DLV_DOC_FORM_2 = null;
	/** 第 86 変数： m_DLV_DOC_COPY_NUM_2 */
	public String m_DLV_DOC_COPY_NUM_2 = null;
	/** 第 87 変数： m_DLV_DOC_LANG_2 */
	public String m_DLV_DOC_LANG_2 = null;
	/** 第 88 変数： m_DLV_DOC_FORM_3 */
	public String m_DLV_DOC_FORM_3 = null;
	/** 第 89 変数： m_DLV_DOC_COPY_NUM_3 */
	public String m_DLV_DOC_COPY_NUM_3 = null;
	/** 第 90 変数： m_DLV_DOC_LANG_3 */
	public String m_DLV_DOC_LANG_3 = null;
	/** 第 91 変数： m_DLV_DOC_FORM_4 */
	public String m_DLV_DOC_FORM_4 = null;
	/** 第 92 変数： m_DLV_DOC_COPY_NUM_4 */
	public String m_DLV_DOC_COPY_NUM_4 = null;
	/** 第 93 変数： m_DLV_DOC_LANG_4 */
	public String m_DLV_DOC_LANG_4 = null;
	/** 第 94 変数： m_STRATEGIC_GOODS_TYP */
	public String m_STRATEGIC_GOODS_TYP = null;
	/** 第 95 変数： m_ORGN_PLACE_CD_1 */
	public String m_ORGN_PLACE_CD_1 = null;
	/** 第 96 変数： m_ORGN_PLACE_CD_2 */
	public String m_ORGN_PLACE_CD_2 = null;
	/** 第 97 変数： m_ORGN_PLACE_CD_3 */
	public String m_ORGN_PLACE_CD_3 = null;
	/** 第 98 変数： m_ORGN_PLACE_CD_4 */
	public String m_ORGN_PLACE_CD_4 = null;
	/** 第 99 変数： m_ORGN_PLACE_CD_5 */
	public String m_ORGN_PLACE_CD_5 = null;
	/** 第 100 変数： m_DLV_TIME_1 */
	public String m_DLV_TIME_1 = null;
	/** 第 101 変数： m_DLV_TIME_2 */
	public String m_DLV_TIME_2 = null;
	/** 第 102 変数： m_DLV_TIME_3 */
	public String m_DLV_TIME_3 = null;
	/** 第 103 変数： m_DLV_TIME_4 */
	public String m_DLV_TIME_4 = null;
	/** 第 104 変数： m_DLV_TIME_5 */
	public String m_DLV_TIME_5 = null;
	/** 第 105 変数： m_PACKAGE_DLV_CD */
	public String m_PACKAGE_DLV_CD = null;
	/** 第 106 変数： m_ODR_ITEM_SPEC */
	public String m_ODR_ITEM_SPEC = null;
	/** 第 107 変数： m_ODR_ORG_NAME */
	public String m_ODR_ORG_NAME = null;
	/** 第 108 変数： m_DLV_PART_LEN_1 */
	public String m_DLV_PART_LEN_1 = null;
	/** 第 109 変数： m_DLV_PART_QTY_1 */
	public String m_DLV_PART_QTY_1 = null;
	/** 第 110 変数： m_DLV_PART_LEN_2 */
	public String m_DLV_PART_LEN_2 = null;
	/** 第 111 変数： m_DLV_PART_QTY_2 */
	public String m_DLV_PART_QTY_2 = null;
	/** 第 112 変数： m_DLV_PART_LEN_3 */
	public String m_DLV_PART_LEN_3 = null;
	/** 第 113 変数： m_DLV_PART_QTY_3 */
	public String m_DLV_PART_QTY_3 = null;
	/** 第 114 変数： m_DLV_PART_LEN_4 */
	public String m_DLV_PART_LEN_4 = null;
	/** 第 115 変数： m_DLV_PART_QTY_4 */
	public String m_DLV_PART_QTY_4 = null;
	/** 第 116 変数： m_DLV_PART_LEN_5 */
	public String m_DLV_PART_LEN_5 = null;
	/** 第 117 変数： m_DLV_PART_QTY_5 */
	public String m_DLV_PART_QTY_5 = null;
	/** 第 118 変数： m_DLV_PART_UNIT */
	public String m_DLV_PART_UNIT = null;
	/** 第 119 変数： m_CUST_CONSTRUCT_NAME */
	public String m_CUST_CONSTRUCT_NAME = null;
	/** 第 120 変数： m_MATERIAL_CD */
	public String m_MATERIAL_CD = null;
	/** 第 121 変数： m_MATERIAL_UNIT_PRICE */
	public String m_MATERIAL_UNIT_PRICE = null;
	/** 第 122 変数： m_MATRRIAL_UNIT */
	public String m_MATRRIAL_UNIT = null;
	/** 第 123 変数： m_TEST_REPORT_NEED_TYP */
	public String m_TEST_REPORT_NEED_TYP = null;
	/** 第 124 変数： m_TEST_REPORT_CHK_TYP */
	public String m_TEST_REPORT_CHK_TYP = null;
	/** 第 125 変数： m_TEST_REPORT_PRESENT_TYP */
	public String m_TEST_REPORT_PRESENT_TYP = null;
	/** 第 126 変数： m_MUNICIPAL_CD */
	public String m_MUNICIPAL_CD = null;
	/** 第 127 変数： m_DLV_CONTACT_TEL */
	public String m_DLV_CONTACT_TEL = null;
	/** 第 128 変数： m_DLV_PRICE_OPEN_TYP */
	public String m_DLV_PRICE_OPEN_TYP = null;
	/** 第 129 変数： m_ODR_STAFF_NAME_J */
	public String m_ODR_STAFF_NAME_J = null;
	/** 第 130 変数： m_ITEM_SPEC_NAME_J */
	public String m_ITEM_SPEC_NAME_J = null;
	/** 第 131 変数： m_ITEM_NAME_J */
	public String m_ITEM_NAME_J = null;
	/** 第 132 変数： m_COMMENT_J */
	public String m_COMMENT_J = null;
	/** 第 133 変数： m_END_USER_NAME_J */
	public String m_END_USER_NAME_J = null;
	/** 第 134 変数： m_DLV_ADDRESS_J */
	public String m_DLV_ADDRESS_J = null;
	/** 第 135 変数： m_DLV_NAME_J */
	public String m_DLV_NAME_J = null;
	/** 第 136 変数： m_END_USER_ITEM_NAME_J */
	public String m_END_USER_ITEM_NAME_J = null;
	/** 第 137 変数： m_MAKER_NAME_J */
	public String m_MAKER_NAME_J = null;
	/** 第 138 変数： m_WH_NAME_J */
	public String m_WH_NAME_J = null;
	/** 第 139 変数： m_PUCH_ODR_COMMENT_J */
	public String m_PUCH_ODR_COMMENT_J = null;
	/** 第 140 変数： m_MACHINE_NAME_J */
	public String m_MACHINE_NAME_J = null;
	/** 第 141 変数： m_ODR_SPEC_J */
	public String m_ODR_SPEC_J = null;
	/** 第 142 変数： m_ODR_ORG_NAME_J */
	public String m_ODR_ORG_NAME_J = null;
	/** 第 143 変数： m_CUST_CONSTRUCT_NAME_J */
	public String m_CUST_CONSTRUCT_NAME_J = null;
	/** 第 144 変数： m_CUR_CD */
	public String m_CUR_CD = null;
	/** 第 145 変数： m_UNIT_COST_FOREIGN */
	public String m_UNIT_COST_FOREIGN = null;
	/** 第 146 変数： m_ODR_AMOUNT_FOREIGN */
	public String m_ODR_AMOUNT_FOREIGN = null;
	/** 第 147 変数： m_TAX_AMOUNT_FOREIGN */
	public String m_TAX_AMOUNT_FOREIGN = null;
	/** 第 148 変数： m_NET_AMOUNT_FOREIGN */
	public String m_NET_AMOUNT_FOREIGN = null;
	/** 第 149 変数： m_MATERIAL_UNIT_PRICE_FOREIGN */
	public String m_MATERIAL_UNIT_PRICE_FOREIGN = null;
	/** 第 150 変数： m_BEFORE_ODR_QTY */
	public String m_BEFORE_ODR_QTY = null;
	/** 第 151 変数： m_BEFORE_UNIT_COST */
	public String m_BEFORE_UNIT_COST = null;
	/** 第 152 変数： m_BEFORE_UNIT_COST_FOREIGN */
	public String m_BEFORE_UNIT_COST_FOREIGN = null;
	/** 第 153 変数： m_BEFORE_DLV_DATE_1 */
	public String m_BEFORE_DLV_DATE_1 = null;
	/** 第 154 変数： m_BEFORE_DLV_QTY_1 */
	public String m_BEFORE_DLV_QTY_1 = null;
	/** 第 155 変数： m_BEFORE_DLV_DATE_2 */
	public String m_BEFORE_DLV_DATE_2 = null;
	/** 第 156 変数： m_BEFORE_DLV_QTY_2 */
	public String m_BEFORE_DLV_QTY_2 = null;
	/** 第 157 変数： m_BEFORE_DLV_DATE_3 */
	public String m_BEFORE_DLV_DATE_3 = null;
	/** 第 158 変数： m_BEFORE_DLV_QTY_3 */
	public String m_BEFORE_DLV_QTY_3 = null;
	/** 第 159 変数： m_BEFORE_DLV_DATE_4 */
	public String m_BEFORE_DLV_DATE_4 = null;
	/** 第 160 変数： m_BEFORE_DLV_QTY_4 */
	public String m_BEFORE_DLV_QTY_4 = null;
	/** 第 161 変数： m_BEFORE_DLV_DATE_5 */
	public String m_BEFORE_DLV_DATE_5 = null;
	/** 第 162 変数： m_BEFORE_DLV_QTY_5 */
	public String m_BEFORE_DLV_QTY_5 = null;
	/** 第 163 変数： m_ODR_RETURN_DATE */
	public String m_ODR_RETURN_DATE = null;
	/** 第 164 変数： m_REJECT_RETURN_TYP */
	public String m_REJECT_RETURN_TYP = null;
	/** 第 165 変数： m_EDI_ODR_ISS_FLG */
	public String m_EDI_ODR_ISS_FLG = null;
	/** 第 166 変数： m_EDI_ODR_ISS_DATE */
	public String m_EDI_ODR_ISS_DATE = null;
	/** 第 167 変数： m_l_PUCH_ODR_START_DATE */
	public String m_l_PUCH_ODR_START_DATE = null;
	/** 第 168 変数： m_l_PUCH_ODR_DLV_DATE */
	public String m_l_PUCH_ODR_DLV_DATE = null;
	/** 第 169 変数： m_l_VEND_CD */
	public String m_l_VEND_CD = null;
	/** 第 170 変数： m_l_VEND_ANAME */
	public String m_l_VEND_ANAME = null;
	/** 第 171 変数： m_l_ITEM_CD */
	public String m_l_ITEM_CD = null;
	/** 第 172 変数： m_l_ITEM_NAME */
	public String m_l_ITEM_NAME = null;
	/** 第 173 変数： m_l_PUCH_ODR_QTY */
	public String m_l_PUCH_ODR_QTY = null;
	/** 第 174 変数： m_l_STOCK_UNIT */
	public String m_l_STOCK_UNIT = null;
	/** 第 175 変数： m_l_PUCH_ODR_CD */
	public String m_l_PUCH_ODR_CD = null;
	/** 第 176 変数： m_l_JOB_ODR_CD */
	public String m_l_JOB_ODR_CD = null;
	/** 第 177 変数： m_l_PUCH_ODR_EDI_ISS_DATE */
	public String m_l_PUCH_ODR_EDI_ISS_DATE = null;
	/** 第 178 変数： m_l_BUSINESS_OPR_DATE */
	public String m_l_BUSINESS_OPR_DATE = null;
	/** 第 179 変数： m_l_MODIFY_COUNT */
	public String m_l_MODIFY_COUNT = null;
	/** 第 180 変数： m_PUCH_ODR_START_DATE */
	public String m_PUCH_ODR_START_DATE = null;
	/** 第 181 変数： m_PUCH_ODR_DLV_DATE */
	public String m_PUCH_ODR_DLV_DATE = null;
	/** 第 182 変数： m_PUCH_ODR_STS_TYP */
	public String m_PUCH_ODR_STS_TYP = null;
	/** 第 183 変数： m_PUCH_ODR_EDI_ISS_FLG */
	public String m_PUCH_ODR_EDI_ISS_FLG = null;
	/** 第 184 変数： m_Not_PUCH_ODR_EDI_ISS_FLG */
	public String m_Not_PUCH_ODR_EDI_ISS_FLG = null;
	/** 第 185 変数： m_EXCH_RATE */
	public String m_EXCH_RATE = null;
	/** 第 186 変数： m_ODR_CANCEL_EDI_ISS_DATE */
	public String m_ODR_CANCEL_EDI_ISS_DATE = null;
	/** 第 187 変数： m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** 第 188 変数： m_VEND_NAME */
	public String m_VEND_NAME = null;
	/** 第 189 変数： m_USER_NAME */
	public String m_USER_NAME = null;
	/** 第 190 変数： m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** 第 191 変数： m_BUSINESS_OPR_DATE */
	public String m_BUSINESS_OPR_DATE = null;
	/** 第 192 変数： m_l_PLANT_CD */
	public String m_l_PLANT_CD = null;
	/** 第 193 変数： m_l_PUCH_ODR_SLIP_ISS_DATE */
	public String m_l_PUCH_ODR_SLIP_ISS_DATE = null;
	/** 第 194 変数： m_l_ACPT_DATE */
	public String m_l_ACPT_DATE = null;
	/** 第 195 変数： m_l_ODR_CANCEL_SLIP_ISS_DATE */
	public String m_l_ODR_CANCEL_SLIP_ISS_DATE = null;
	/** 第 196 変数： m_l_PUCH_ODR_PERSON */
	public String m_l_PUCH_ODR_PERSON = null;
	/** 第 197 変数： m_l_USER_NAME */
	public String m_l_USER_NAME = null;
	/** 第 198 変数： m_l_ODR_CANCEL_CAUSE_CD */
	public String m_l_ODR_CANCEL_CAUSE_CD = null;
	/** 第 199 変数： m_l_ACPT_RSLT_COMMENT */
	public String m_l_ACPT_RSLT_COMMENT = null;
	/** 第 200 変数： m_PUCH_ODR_START_DATE_FROM */
	public String m_PUCH_ODR_START_DATE_FROM = null;
	/** 第 201 変数： m_PUCH_ODR_START_DATE_TO */
	public String m_PUCH_ODR_START_DATE_TO = null;
	/** 第 202 変数： m_PUCH_ODR_DLV_DATE_FROM */
	public String m_PUCH_ODR_DLV_DATE_FROM = null;
	/** 第 203 変数： m_PUCH_ODR_DLV_DATE_TO */
	public String m_PUCH_ODR_DLV_DATE_TO = null;
	/** 第 204 変数： m_ACPT_DATE_FROM */
	public String m_ACPT_DATE_FROM = null;
	/** 第 205 変数： m_ACPT_DATE_TO */
	public String m_ACPT_DATE_TO = null;
	/** 第 206 変数： m_l_COUNT */
	public String m_l_COUNT = null;
	/** 第 207 変数： m_ROW_COUNT */
	public String m_ROW_COUNT = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_ReOutputFlg */
	public List l_ReOutputFlg = null;

	/** 第 2 List変数： l_INFO_TYP_CD */
	public List l_INFO_TYP_CD = null;

	/** 第 3 List変数： l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** 第 4 List変数： l_PUCH_ODR_CD */
	public List l_PUCH_ODR_CD = null;

	/** 第 5 List変数： l_DATA_PROC_CD */
	public List l_DATA_PROC_CD = null;

	/** 第 6 List変数： l_DATA_CREATE_DATE */
	public List l_DATA_CREATE_DATE = null;

	/** 第 7 List変数： l_VEND_CD */
	public List l_VEND_CD = null;

	/** 第 8 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** 第 9 List変数： l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** 第 10 List変数： l_CRCT_TYP */
	public List l_CRCT_TYP = null;

	/** 第 11 List変数： l_COCK_TYP */
	public List l_COCK_TYP = null;

	/** 第 12 List変数： l_PUCH_ODR_DATE */
	public List l_PUCH_ODR_DATE = null;

	/** 第 13 List変数： l_PUCH_ODR_UNIT */
	public List l_PUCH_ODR_UNIT = null;

	/** 第 14 List変数： l_UNIT_COST */
	public List l_UNIT_COST = null;

	/** 第 15 List変数： l_UNIT_COST_TYP */
	public List l_UNIT_COST_TYP = null;

	/** 第 16 List変数： l_PUCH_ODR_QTY */
	public List l_PUCH_ODR_QTY = null;

	/** 第 17 List変数： l_PUCH_ODR_AMOUNT */
	public List l_PUCH_ODR_AMOUNT = null;

	/** 第 18 List変数： l_EDI_CONS_TYP */
	public List l_EDI_CONS_TYP = null;

	/** 第 19 List変数： l_PUCH_ODR_PERSON */
	public List l_PUCH_ODR_PERSON = null;

	/** 第 20 List変数： l_ITEM_SPEC */
	public List l_ITEM_SPEC = null;

	/** 第 21 List変数： l_ITEM_DRAW_TYP */
	public List l_ITEM_DRAW_TYP = null;

	/** 第 22 List変数： l_ITEM_VERSION */
	public List l_ITEM_VERSION = null;

	/** 第 23 List変数： l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** 第 24 List変数： l_VEND_ITEM_CD */
	public List l_VEND_ITEM_CD = null;

	/** 第 25 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 26 List変数： l_ITEM_DRAW_QTY */
	public List l_ITEM_DRAW_QTY = null;

	/** 第 27 List変数： l_ITEM_PKG_UNIT */
	public List l_ITEM_PKG_UNIT = null;

	/** 第 28 List変数： l_DIRECT_DLV_TYP */
	public List l_DIRECT_DLV_TYP = null;

	/** 第 29 List変数： l_WH_CD */
	public List l_WH_CD = null;

	/** 第 30 List変数： l_ACPT_INSPC_TYP */
	public List l_ACPT_INSPC_TYP = null;

	/** 第 31 List変数： l_DLV_INST_TYP */
	public List l_DLV_INST_TYP = null;

	/** 第 32 List変数： l_DLV_DATE_1 */
	public List l_DLV_DATE_1 = null;

	/** 第 33 List変数： l_DLV_INST_QTY_1 */
	public List l_DLV_INST_QTY_1 = null;

	/** 第 34 List変数： l_DLV_INST_CD_1 */
	public List l_DLV_INST_CD_1 = null;

	/** 第 35 List変数： l_DLV_DATE_2 */
	public List l_DLV_DATE_2 = null;

	/** 第 36 List変数： l_DLV_INST_QTY_2 */
	public List l_DLV_INST_QTY_2 = null;

	/** 第 37 List変数： l_DLV_INST_CD_2 */
	public List l_DLV_INST_CD_2 = null;

	/** 第 38 List変数： l_DLV_DATE_3 */
	public List l_DLV_DATE_3 = null;

	/** 第 39 List変数： l_DLV_INST_QTY_3 */
	public List l_DLV_INST_QTY_3 = null;

	/** 第 40 List変数： l_DLV_INST_CD_3 */
	public List l_DLV_INST_CD_3 = null;

	/** 第 41 List変数： l_DLV_DATE_4 */
	public List l_DLV_DATE_4 = null;

	/** 第 42 List変数： l_DLV_INST_QTY_4 */
	public List l_DLV_INST_QTY_4 = null;

	/** 第 43 List変数： l_DLV_INST_CD_4 */
	public List l_DLV_INST_CD_4 = null;

	/** 第 44 List変数： l_DLV_DATE_5 */
	public List l_DLV_DATE_5 = null;

	/** 第 45 List変数： l_DLV_INST_QTY_5 */
	public List l_DLV_INST_QTY_5 = null;

	/** 第 46 List変数： l_DLV_INST_CD_5 */
	public List l_DLV_INST_CD_5 = null;

	/** 第 47 List変数： l_FREE_COLUMN */
	public List l_FREE_COLUMN = null;

	/** 第 48 List変数： l_PUCH_ODR_COMMENT */
	public List l_PUCH_ODR_COMMENT = null;

	/** 第 49 List変数： l_INCLUDING_TAX_TYP */
	public List l_INCLUDING_TAX_TYP = null;

	/** 第 50 List変数： l_TAX_RELATION_TYP */
	public List l_TAX_RELATION_TYP = null;

	/** 第 51 List変数： l_TAX_AMOUNT */
	public List l_TAX_AMOUNT = null;

	/** 第 52 List変数： l_NET_AMOUNT */
	public List l_NET_AMOUNT = null;

	/** 第 53 List変数： l_RESERVE_CD */
	public List l_RESERVE_CD = null;

	/** 第 54 List変数： l_COST_PLAN_CD */
	public List l_COST_PLAN_CD = null;

	/** 第 55 List変数： l_STL_COND_TYP */
	public List l_STL_COND_TYP = null;

	/** 第 56 List変数： l_END_USER_NAME */
	public List l_END_USER_NAME = null;

	/** 第 57 List変数： l_DLV_ADDRESS_CD */
	public List l_DLV_ADDRESS_CD = null;

	/** 第 58 List変数： l_DLV_ADDRESS */
	public List l_DLV_ADDRESS = null;

	/** 第 59 List変数： l_DLV_NAME */
	public List l_DLV_NAME = null;

	/** 第 60 List変数： l_END_USER_ITEM_NAME */
	public List l_END_USER_ITEM_NAME = null;

	/** 第 61 List変数： l_END_USER_ITEM_CD */
	public List l_END_USER_ITEM_CD = null;

	/** 第 62 List変数： l_END_USER_ODR_CD */
	public List l_END_USER_ODR_CD = null;

	/** 第 63 List変数： l_MAKER_NAME */
	public List l_MAKER_NAME = null;

	/** 第 64 List変数： l_DLV_KEY_CD_1 */
	public List l_DLV_KEY_CD_1 = null;

	/** 第 65 List変数： l_DLV_KEY_CD_2 */
	public List l_DLV_KEY_CD_2 = null;

	/** 第 66 List変数： l_DLV_KEY_CD_3 */
	public List l_DLV_KEY_CD_3 = null;

	/** 第 67 List変数： l_DLV_KEY_CD_4 */
	public List l_DLV_KEY_CD_4 = null;

	/** 第 68 List変数： l_DLV_KEY_CD_5 */
	public List l_DLV_KEY_CD_5 = null;

	/** 第 69 List変数： l_WH_NAME */
	public List l_WH_NAME = null;

	/** 第 70 List変数： l_PUCH_BCODE_INF */
	public List l_PUCH_BCODE_INF = null;

	/** 第 71 List変数： l_PUCH_COMMENT */
	public List l_PUCH_COMMENT = null;

	/** 第 72 List変数： l_CONTRACT_COND_TYP */
	public List l_CONTRACT_COND_TYP = null;

	/** 第 73 List変数： l_PUCH_ODR_SHAP_TYP */
	public List l_PUCH_ODR_SHAP_TYP = null;

	/** 第 74 List変数： l_OWNER_ODR_CD */
	public List l_OWNER_ODR_CD = null;

	/** 第 75 List変数： l_QTY_CONTRACT_TYP */
	public List l_QTY_CONTRACT_TYP = null;

	/** 第 76 List変数： l_ODR_MODIFY_TYP_1 */
	public List l_ODR_MODIFY_TYP_1 = null;

	/** 第 77 List変数： l_ODR_MODIFY_TYP_2 */
	public List l_ODR_MODIFY_TYP_2 = null;

	/** 第 78 List変数： l_ODR_MODIFY_TYP_3 */
	public List l_ODR_MODIFY_TYP_3 = null;

	/** 第 79 List変数： l_MACHINE_CD */
	public List l_MACHINE_CD = null;

	/** 第 80 List変数： l_ENGINNERING_CHG_CD */
	public List l_ENGINNERING_CHG_CD = null;

	/** 第 81 List変数： l_ITEM_DRAW_CD */
	public List l_ITEM_DRAW_CD = null;

	/** 第 82 List変数： l_DLV_DOC_FORM_1 */
	public List l_DLV_DOC_FORM_1 = null;

	/** 第 83 List変数： l_DLV_DOC_COPY_NUM_1 */
	public List l_DLV_DOC_COPY_NUM_1 = null;

	/** 第 84 List変数： l_DLV_DOC_LANG_1 */
	public List l_DLV_DOC_LANG_1 = null;

	/** 第 85 List変数： l_DLV_DOC_FORM_2 */
	public List l_DLV_DOC_FORM_2 = null;

	/** 第 86 List変数： l_DLV_DOC_COPY_NUM_2 */
	public List l_DLV_DOC_COPY_NUM_2 = null;

	/** 第 87 List変数： l_DLV_DOC_LANG_2 */
	public List l_DLV_DOC_LANG_2 = null;

	/** 第 88 List変数： l_DLV_DOC_FORM_3 */
	public List l_DLV_DOC_FORM_3 = null;

	/** 第 89 List変数： l_DLV_DOC_COPY_NUM_3 */
	public List l_DLV_DOC_COPY_NUM_3 = null;

	/** 第 90 List変数： l_DLV_DOC_LANG_3 */
	public List l_DLV_DOC_LANG_3 = null;

	/** 第 91 List変数： l_DLV_DOC_FORM_4 */
	public List l_DLV_DOC_FORM_4 = null;

	/** 第 92 List変数： l_DLV_DOC_COPY_NUM_4 */
	public List l_DLV_DOC_COPY_NUM_4 = null;

	/** 第 93 List変数： l_DLV_DOC_LANG_4 */
	public List l_DLV_DOC_LANG_4 = null;

	/** 第 94 List変数： l_STRATEGIC_GOODS_TYP */
	public List l_STRATEGIC_GOODS_TYP = null;

	/** 第 95 List変数： l_ORGN_PLACE_CD_1 */
	public List l_ORGN_PLACE_CD_1 = null;

	/** 第 96 List変数： l_ORGN_PLACE_CD_2 */
	public List l_ORGN_PLACE_CD_2 = null;

	/** 第 97 List変数： l_ORGN_PLACE_CD_3 */
	public List l_ORGN_PLACE_CD_3 = null;

	/** 第 98 List変数： l_ORGN_PLACE_CD_4 */
	public List l_ORGN_PLACE_CD_4 = null;

	/** 第 99 List変数： l_ORGN_PLACE_CD_5 */
	public List l_ORGN_PLACE_CD_5 = null;

	/** 第 100 List変数： l_DLV_TIME_1 */
	public List l_DLV_TIME_1 = null;

	/** 第 101 List変数： l_DLV_TIME_2 */
	public List l_DLV_TIME_2 = null;

	/** 第 102 List変数： l_DLV_TIME_3 */
	public List l_DLV_TIME_3 = null;

	/** 第 103 List変数： l_DLV_TIME_4 */
	public List l_DLV_TIME_4 = null;

	/** 第 104 List変数： l_DLV_TIME_5 */
	public List l_DLV_TIME_5 = null;

	/** 第 105 List変数： l_PACKAGE_DLV_CD */
	public List l_PACKAGE_DLV_CD = null;

	/** 第 106 List変数： l_ODR_ITEM_SPEC */
	public List l_ODR_ITEM_SPEC = null;

	/** 第 107 List変数： l_ODR_ORG_NAME */
	public List l_ODR_ORG_NAME = null;

	/** 第 108 List変数： l_DLV_PART_LEN_1 */
	public List l_DLV_PART_LEN_1 = null;

	/** 第 109 List変数： l_DLV_PART_QTY_1 */
	public List l_DLV_PART_QTY_1 = null;

	/** 第 110 List変数： l_DLV_PART_LEN_2 */
	public List l_DLV_PART_LEN_2 = null;

	/** 第 111 List変数： l_DLV_PART_QTY_2 */
	public List l_DLV_PART_QTY_2 = null;

	/** 第 112 List変数： l_DLV_PART_LEN_3 */
	public List l_DLV_PART_LEN_3 = null;

	/** 第 113 List変数： l_DLV_PART_QTY_3 */
	public List l_DLV_PART_QTY_3 = null;

	/** 第 114 List変数： l_DLV_PART_LEN_4 */
	public List l_DLV_PART_LEN_4 = null;

	/** 第 115 List変数： l_DLV_PART_QTY_4 */
	public List l_DLV_PART_QTY_4 = null;

	/** 第 116 List変数： l_DLV_PART_LEN_5 */
	public List l_DLV_PART_LEN_5 = null;

	/** 第 117 List変数： l_DLV_PART_QTY_5 */
	public List l_DLV_PART_QTY_5 = null;

	/** 第 118 List変数： l_DLV_PART_UNIT */
	public List l_DLV_PART_UNIT = null;

	/** 第 119 List変数： l_CUST_CONSTRUCT_NAME */
	public List l_CUST_CONSTRUCT_NAME = null;

	/** 第 120 List変数： l_MATERIAL_CD */
	public List l_MATERIAL_CD = null;

	/** 第 121 List変数： l_MATERIAL_UNIT_PRICE */
	public List l_MATERIAL_UNIT_PRICE = null;

	/** 第 122 List変数： l_MATRRIAL_UNIT */
	public List l_MATRRIAL_UNIT = null;

	/** 第 123 List変数： l_TEST_REPORT_NEED_TYP */
	public List l_TEST_REPORT_NEED_TYP = null;

	/** 第 124 List変数： l_TEST_REPORT_CHK_TYP */
	public List l_TEST_REPORT_CHK_TYP = null;

	/** 第 125 List変数： l_TEST_REPORT_PRESENT_TYP */
	public List l_TEST_REPORT_PRESENT_TYP = null;

	/** 第 126 List変数： l_MUNICIPAL_CD */
	public List l_MUNICIPAL_CD = null;

	/** 第 127 List変数： l_DLV_CONTACT_TEL */
	public List l_DLV_CONTACT_TEL = null;

	/** 第 128 List変数： l_DLV_PRICE_OPEN_TYP */
	public List l_DLV_PRICE_OPEN_TYP = null;

	/** 第 129 List変数： l_ODR_STAFF_NAME_J */
	public List l_ODR_STAFF_NAME_J = null;

	/** 第 130 List変数： l_ITEM_SPEC_NAME_J */
	public List l_ITEM_SPEC_NAME_J = null;

	/** 第 131 List変数： l_ITEM_NAME_J */
	public List l_ITEM_NAME_J = null;

	/** 第 132 List変数： l_COMMENT_J */
	public List l_COMMENT_J = null;

	/** 第 133 List変数： l_END_USER_NAME_J */
	public List l_END_USER_NAME_J = null;

	/** 第 134 List変数： l_DLV_ADDRESS_J */
	public List l_DLV_ADDRESS_J = null;

	/** 第 135 List変数： l_DLV_NAME_J */
	public List l_DLV_NAME_J = null;

	/** 第 136 List変数： l_END_USER_ITEM_NAME_J */
	public List l_END_USER_ITEM_NAME_J = null;

	/** 第 137 List変数： l_MAKER_NAME_J */
	public List l_MAKER_NAME_J = null;

	/** 第 138 List変数： l_WH_NAME_J */
	public List l_WH_NAME_J = null;

	/** 第 139 List変数： l_PUCH_ODR_COMMENT_J */
	public List l_PUCH_ODR_COMMENT_J = null;

	/** 第 140 List変数： l_MACHINE_NAME_J */
	public List l_MACHINE_NAME_J = null;

	/** 第 141 List変数： l_ODR_SPEC_J */
	public List l_ODR_SPEC_J = null;

	/** 第 142 List変数： l_ODR_ORG_NAME_J */
	public List l_ODR_ORG_NAME_J = null;

	/** 第 143 List変数： l_CUST_CONSTRUCT_NAME_J */
	public List l_CUST_CONSTRUCT_NAME_J = null;

	/** 第 144 List変数： l_CUR_CD */
	public List l_CUR_CD = null;

	/** 第 145 List変数： l_UNIT_COST_FOREIGN */
	public List l_UNIT_COST_FOREIGN = null;

	/** 第 146 List変数： l_ODR_AMOUNT_FOREIGN */
	public List l_ODR_AMOUNT_FOREIGN = null;

	/** 第 147 List変数： l_TAX_AMOUNT_FOREIGN */
	public List l_TAX_AMOUNT_FOREIGN = null;

	/** 第 148 List変数： l_NET_AMOUNT_FOREIGN */
	public List l_NET_AMOUNT_FOREIGN = null;

	/** 第 149 List変数： l_MATERIAL_UNIT_PRICE_FOREIGN */
	public List l_MATERIAL_UNIT_PRICE_FOREIGN = null;

	/** 第 150 List変数： l_BEFORE_ODR_QTY */
	public List l_BEFORE_ODR_QTY = null;

	/** 第 151 List変数： l_BEFORE_UNIT_COST */
	public List l_BEFORE_UNIT_COST = null;

	/** 第 152 List変数： l_BEFORE_UNIT_COST_FOREIGN */
	public List l_BEFORE_UNIT_COST_FOREIGN = null;

	/** 第 153 List変数： l_BEFORE_DLV_DATE_1 */
	public List l_BEFORE_DLV_DATE_1 = null;

	/** 第 154 List変数： l_BEFORE_DLV_QTY_1 */
	public List l_BEFORE_DLV_QTY_1 = null;

	/** 第 155 List変数： l_BEFORE_DLV_DATE_2 */
	public List l_BEFORE_DLV_DATE_2 = null;

	/** 第 156 List変数： l_BEFORE_DLV_QTY_2 */
	public List l_BEFORE_DLV_QTY_2 = null;

	/** 第 157 List変数： l_BEFORE_DLV_DATE_3 */
	public List l_BEFORE_DLV_DATE_3 = null;

	/** 第 158 List変数： l_BEFORE_DLV_QTY_3 */
	public List l_BEFORE_DLV_QTY_3 = null;

	/** 第 159 List変数： l_BEFORE_DLV_DATE_4 */
	public List l_BEFORE_DLV_DATE_4 = null;

	/** 第 160 List変数： l_BEFORE_DLV_QTY_4 */
	public List l_BEFORE_DLV_QTY_4 = null;

	/** 第 161 List変数： l_BEFORE_DLV_DATE_5 */
	public List l_BEFORE_DLV_DATE_5 = null;

	/** 第 162 List変数： l_BEFORE_DLV_QTY_5 */
	public List l_BEFORE_DLV_QTY_5 = null;

	/** 第 163 List変数： l_ODR_RETURN_DATE */
	public List l_ODR_RETURN_DATE = null;

	/** 第 164 List変数： l_REJECT_RETURN_TYP */
	public List l_REJECT_RETURN_TYP = null;

	/** 第 165 List変数： l_EDI_ODR_ISS_FLG */
	public List l_EDI_ODR_ISS_FLG = null;

	/** 第 166 List変数： l_EDI_ODR_ISS_DATE */
	public List l_EDI_ODR_ISS_DATE = null;

	/** 第 167 List変数： l_l_PUCH_ODR_START_DATE */
	public List l_l_PUCH_ODR_START_DATE = null;

	/** 第 168 List変数： l_l_PUCH_ODR_DLV_DATE */
	public List l_l_PUCH_ODR_DLV_DATE = null;

	/** 第 169 List変数： l_l_VEND_CD */
	public List l_l_VEND_CD = null;

	/** 第 170 List変数： l_l_VEND_ANAME */
	public List l_l_VEND_ANAME = null;

	/** 第 171 List変数： l_l_ITEM_CD */
	public List l_l_ITEM_CD = null;

	/** 第 172 List変数： l_l_ITEM_NAME */
	public List l_l_ITEM_NAME = null;

	/** 第 173 List変数： l_l_PUCH_ODR_QTY */
	public List l_l_PUCH_ODR_QTY = null;

	/** 第 174 List変数： l_l_STOCK_UNIT */
	public List l_l_STOCK_UNIT = null;

	/** 第 175 List変数： l_l_PUCH_ODR_CD */
	public List l_l_PUCH_ODR_CD = null;

	/** 第 176 List変数： l_l_JOB_ODR_CD */
	public List l_l_JOB_ODR_CD = null;

	/** 第 177 List変数： l_l_PUCH_ODR_EDI_ISS_DATE */
	public List l_l_PUCH_ODR_EDI_ISS_DATE = null;

	/** 第 178 List変数： l_l_BUSINESS_OPR_DATE */
	public List l_l_BUSINESS_OPR_DATE = null;

	/** 第 179 List変数： l_l_MODIFY_COUNT */
	public List l_l_MODIFY_COUNT = null;

	/** 第 180 List変数： l_PUCH_ODR_START_DATE */
	public List l_PUCH_ODR_START_DATE = null;

	/** 第 181 List変数： l_PUCH_ODR_DLV_DATE */
	public List l_PUCH_ODR_DLV_DATE = null;

	/** 第 182 List変数： l_PUCH_ODR_STS_TYP */
	public List l_PUCH_ODR_STS_TYP = null;

	/** 第 183 List変数： l_PUCH_ODR_EDI_ISS_FLG */
	public List l_PUCH_ODR_EDI_ISS_FLG = null;

	/** 第 184 List変数： l_Not_PUCH_ODR_EDI_ISS_FLG */
	public List l_Not_PUCH_ODR_EDI_ISS_FLG = null;

	/** 第 185 List変数： l_EXCH_RATE */
	public List l_EXCH_RATE = null;

	/** 第 186 List変数： l_ODR_CANCEL_EDI_ISS_DATE */
	public List l_ODR_CANCEL_EDI_ISS_DATE = null;

	/** 第 187 List変数： l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** 第 188 List変数： l_VEND_NAME */
	public List l_VEND_NAME = null;

	/** 第 189 List変数： l_USER_NAME */
	public List l_USER_NAME = null;

	/** 第 190 List変数： l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** 第 191 List変数： l_BUSINESS_OPR_DATE */
	public List l_BUSINESS_OPR_DATE = null;

	/** 第 192 List変数： l_l_PLANT_CD */
	public List l_l_PLANT_CD = null;

	/** 第 193 List変数： l_l_PUCH_ODR_SLIP_ISS_DATE */
	public List l_l_PUCH_ODR_SLIP_ISS_DATE = null;

	/** 第 194 List変数： l_l_ACPT_DATE */
	public List l_l_ACPT_DATE = null;

	/** 第 195 List変数： l_l_ODR_CANCEL_SLIP_ISS_DATE */
	public List l_l_ODR_CANCEL_SLIP_ISS_DATE = null;

	/** 第 196 List変数： l_l_PUCH_ODR_PERSON */
	public List l_l_PUCH_ODR_PERSON = null;

	/** 第 197 List変数： l_l_USER_NAME */
	public List l_l_USER_NAME = null;

	/** 第 198 List変数： l_l_ODR_CANCEL_CAUSE_CD */
	public List l_l_ODR_CANCEL_CAUSE_CD = null;

	/** 第 199 List変数： l_l_ACPT_RSLT_COMMENT */
	public List l_l_ACPT_RSLT_COMMENT = null;

	/** 第 200 List変数： l_PUCH_ODR_START_DATE_FROM */
	public List l_PUCH_ODR_START_DATE_FROM = null;

	/** 第 201 List変数： l_PUCH_ODR_START_DATE_TO */
	public List l_PUCH_ODR_START_DATE_TO = null;

	/** 第 202 List変数： l_PUCH_ODR_DLV_DATE_FROM */
	public List l_PUCH_ODR_DLV_DATE_FROM = null;

	/** 第 203 List変数： l_PUCH_ODR_DLV_DATE_TO */
	public List l_PUCH_ODR_DLV_DATE_TO = null;

	/** 第 204 List変数： l_ACPT_DATE_FROM */
	public List l_ACPT_DATE_FROM = null;

	/** 第 205 List変数： l_ACPT_DATE_TO */
	public List l_ACPT_DATE_TO = null;

	/** 第 206 List変数： l_l_COUNT */
	public List l_l_COUNT = null;

	/** 第 207 List変数： l_ROW_COUNT */
	public List l_ROW_COUNT = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getReOutputFlg() { return m_ReOutputFlg; }
	public String getINFO_TYP_CD() { return m_INFO_TYP_CD; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getPUCH_ODR_CD() { return m_PUCH_ODR_CD; }
	public String getDATA_PROC_CD() { return m_DATA_PROC_CD; }
	public String getDATA_CREATE_DATE() { return m_DATA_CREATE_DATE; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getCRCT_TYP() { return m_CRCT_TYP; }
	public String getCOCK_TYP() { return m_COCK_TYP; }
	public String getPUCH_ODR_DATE() { return m_PUCH_ODR_DATE; }
	public String getPUCH_ODR_UNIT() { return m_PUCH_ODR_UNIT; }
	public String getUNIT_COST() { return m_UNIT_COST; }
	public String getUNIT_COST_TYP() { return m_UNIT_COST_TYP; }
	public String getPUCH_ODR_QTY() { return m_PUCH_ODR_QTY; }
	public String getPUCH_ODR_AMOUNT() { return m_PUCH_ODR_AMOUNT; }
	public String getEDI_CONS_TYP() { return m_EDI_CONS_TYP; }
	public String getPUCH_ODR_PERSON() { return m_PUCH_ODR_PERSON; }
	public String getITEM_SPEC() { return m_ITEM_SPEC; }
	public String getITEM_DRAW_TYP() { return m_ITEM_DRAW_TYP; }
	public String getITEM_VERSION() { return m_ITEM_VERSION; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getVEND_ITEM_CD() { return m_VEND_ITEM_CD; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getITEM_DRAW_QTY() { return m_ITEM_DRAW_QTY; }
	public String getITEM_PKG_UNIT() { return m_ITEM_PKG_UNIT; }
	public String getDIRECT_DLV_TYP() { return m_DIRECT_DLV_TYP; }
	public String getWH_CD() { return m_WH_CD; }
	public String getACPT_INSPC_TYP() { return m_ACPT_INSPC_TYP; }
	public String getDLV_INST_TYP() { return m_DLV_INST_TYP; }
	public String getDLV_DATE_1() { return m_DLV_DATE_1; }
	public String getDLV_INST_QTY_1() { return m_DLV_INST_QTY_1; }
	public String getDLV_INST_CD_1() { return m_DLV_INST_CD_1; }
	public String getDLV_DATE_2() { return m_DLV_DATE_2; }
	public String getDLV_INST_QTY_2() { return m_DLV_INST_QTY_2; }
	public String getDLV_INST_CD_2() { return m_DLV_INST_CD_2; }
	public String getDLV_DATE_3() { return m_DLV_DATE_3; }
	public String getDLV_INST_QTY_3() { return m_DLV_INST_QTY_3; }
	public String getDLV_INST_CD_3() { return m_DLV_INST_CD_3; }
	public String getDLV_DATE_4() { return m_DLV_DATE_4; }
	public String getDLV_INST_QTY_4() { return m_DLV_INST_QTY_4; }
	public String getDLV_INST_CD_4() { return m_DLV_INST_CD_4; }
	public String getDLV_DATE_5() { return m_DLV_DATE_5; }
	public String getDLV_INST_QTY_5() { return m_DLV_INST_QTY_5; }
	public String getDLV_INST_CD_5() { return m_DLV_INST_CD_5; }
	public String getFREE_COLUMN() { return m_FREE_COLUMN; }
	public String getPUCH_ODR_COMMENT() { return m_PUCH_ODR_COMMENT; }
	public String getINCLUDING_TAX_TYP() { return m_INCLUDING_TAX_TYP; }
	public String getTAX_RELATION_TYP() { return m_TAX_RELATION_TYP; }
	public String getTAX_AMOUNT() { return m_TAX_AMOUNT; }
	public String getNET_AMOUNT() { return m_NET_AMOUNT; }
	public String getRESERVE_CD() { return m_RESERVE_CD; }
	public String getCOST_PLAN_CD() { return m_COST_PLAN_CD; }
	public String getSTL_COND_TYP() { return m_STL_COND_TYP; }
	public String getEND_USER_NAME() { return m_END_USER_NAME; }
	public String getDLV_ADDRESS_CD() { return m_DLV_ADDRESS_CD; }
	public String getDLV_ADDRESS() { return m_DLV_ADDRESS; }
	public String getDLV_NAME() { return m_DLV_NAME; }
	public String getEND_USER_ITEM_NAME() { return m_END_USER_ITEM_NAME; }
	public String getEND_USER_ITEM_CD() { return m_END_USER_ITEM_CD; }
	public String getEND_USER_ODR_CD() { return m_END_USER_ODR_CD; }
	public String getMAKER_NAME() { return m_MAKER_NAME; }
	public String getDLV_KEY_CD_1() { return m_DLV_KEY_CD_1; }
	public String getDLV_KEY_CD_2() { return m_DLV_KEY_CD_2; }
	public String getDLV_KEY_CD_3() { return m_DLV_KEY_CD_3; }
	public String getDLV_KEY_CD_4() { return m_DLV_KEY_CD_4; }
	public String getDLV_KEY_CD_5() { return m_DLV_KEY_CD_5; }
	public String getWH_NAME() { return m_WH_NAME; }
	public String getPUCH_BCODE_INF() { return m_PUCH_BCODE_INF; }
	public String getPUCH_COMMENT() { return m_PUCH_COMMENT; }
	public String getCONTRACT_COND_TYP() { return m_CONTRACT_COND_TYP; }
	public String getPUCH_ODR_SHAP_TYP() { return m_PUCH_ODR_SHAP_TYP; }
	public String getOWNER_ODR_CD() { return m_OWNER_ODR_CD; }
	public String getQTY_CONTRACT_TYP() { return m_QTY_CONTRACT_TYP; }
	public String getODR_MODIFY_TYP_1() { return m_ODR_MODIFY_TYP_1; }
	public String getODR_MODIFY_TYP_2() { return m_ODR_MODIFY_TYP_2; }
	public String getODR_MODIFY_TYP_3() { return m_ODR_MODIFY_TYP_3; }
	public String getMACHINE_CD() { return m_MACHINE_CD; }
	public String getENGINNERING_CHG_CD() { return m_ENGINNERING_CHG_CD; }
	public String getITEM_DRAW_CD() { return m_ITEM_DRAW_CD; }
	public String getDLV_DOC_FORM_1() { return m_DLV_DOC_FORM_1; }
	public String getDLV_DOC_COPY_NUM_1() { return m_DLV_DOC_COPY_NUM_1; }
	public String getDLV_DOC_LANG_1() { return m_DLV_DOC_LANG_1; }
	public String getDLV_DOC_FORM_2() { return m_DLV_DOC_FORM_2; }
	public String getDLV_DOC_COPY_NUM_2() { return m_DLV_DOC_COPY_NUM_2; }
	public String getDLV_DOC_LANG_2() { return m_DLV_DOC_LANG_2; }
	public String getDLV_DOC_FORM_3() { return m_DLV_DOC_FORM_3; }
	public String getDLV_DOC_COPY_NUM_3() { return m_DLV_DOC_COPY_NUM_3; }
	public String getDLV_DOC_LANG_3() { return m_DLV_DOC_LANG_3; }
	public String getDLV_DOC_FORM_4() { return m_DLV_DOC_FORM_4; }
	public String getDLV_DOC_COPY_NUM_4() { return m_DLV_DOC_COPY_NUM_4; }
	public String getDLV_DOC_LANG_4() { return m_DLV_DOC_LANG_4; }
	public String getSTRATEGIC_GOODS_TYP() { return m_STRATEGIC_GOODS_TYP; }
	public String getORGN_PLACE_CD_1() { return m_ORGN_PLACE_CD_1; }
	public String getORGN_PLACE_CD_2() { return m_ORGN_PLACE_CD_2; }
	public String getORGN_PLACE_CD_3() { return m_ORGN_PLACE_CD_3; }
	public String getORGN_PLACE_CD_4() { return m_ORGN_PLACE_CD_4; }
	public String getORGN_PLACE_CD_5() { return m_ORGN_PLACE_CD_5; }
	public String getDLV_TIME_1() { return m_DLV_TIME_1; }
	public String getDLV_TIME_2() { return m_DLV_TIME_2; }
	public String getDLV_TIME_3() { return m_DLV_TIME_3; }
	public String getDLV_TIME_4() { return m_DLV_TIME_4; }
	public String getDLV_TIME_5() { return m_DLV_TIME_5; }
	public String getPACKAGE_DLV_CD() { return m_PACKAGE_DLV_CD; }
	public String getODR_ITEM_SPEC() { return m_ODR_ITEM_SPEC; }
	public String getODR_ORG_NAME() { return m_ODR_ORG_NAME; }
	public String getDLV_PART_LEN_1() { return m_DLV_PART_LEN_1; }
	public String getDLV_PART_QTY_1() { return m_DLV_PART_QTY_1; }
	public String getDLV_PART_LEN_2() { return m_DLV_PART_LEN_2; }
	public String getDLV_PART_QTY_2() { return m_DLV_PART_QTY_2; }
	public String getDLV_PART_LEN_3() { return m_DLV_PART_LEN_3; }
	public String getDLV_PART_QTY_3() { return m_DLV_PART_QTY_3; }
	public String getDLV_PART_LEN_4() { return m_DLV_PART_LEN_4; }
	public String getDLV_PART_QTY_4() { return m_DLV_PART_QTY_4; }
	public String getDLV_PART_LEN_5() { return m_DLV_PART_LEN_5; }
	public String getDLV_PART_QTY_5() { return m_DLV_PART_QTY_5; }
	public String getDLV_PART_UNIT() { return m_DLV_PART_UNIT; }
	public String getCUST_CONSTRUCT_NAME() { return m_CUST_CONSTRUCT_NAME; }
	public String getMATERIAL_CD() { return m_MATERIAL_CD; }
	public String getMATERIAL_UNIT_PRICE() { return m_MATERIAL_UNIT_PRICE; }
	public String getMATRRIAL_UNIT() { return m_MATRRIAL_UNIT; }
	public String getTEST_REPORT_NEED_TYP() { return m_TEST_REPORT_NEED_TYP; }
	public String getTEST_REPORT_CHK_TYP() { return m_TEST_REPORT_CHK_TYP; }
	public String getTEST_REPORT_PRESENT_TYP() { return m_TEST_REPORT_PRESENT_TYP; }
	public String getMUNICIPAL_CD() { return m_MUNICIPAL_CD; }
	public String getDLV_CONTACT_TEL() { return m_DLV_CONTACT_TEL; }
	public String getDLV_PRICE_OPEN_TYP() { return m_DLV_PRICE_OPEN_TYP; }
	public String getODR_STAFF_NAME_J() { return m_ODR_STAFF_NAME_J; }
	public String getITEM_SPEC_NAME_J() { return m_ITEM_SPEC_NAME_J; }
	public String getITEM_NAME_J() { return m_ITEM_NAME_J; }
	public String getCOMMENT_J() { return m_COMMENT_J; }
	public String getEND_USER_NAME_J() { return m_END_USER_NAME_J; }
	public String getDLV_ADDRESS_J() { return m_DLV_ADDRESS_J; }
	public String getDLV_NAME_J() { return m_DLV_NAME_J; }
	public String getEND_USER_ITEM_NAME_J() { return m_END_USER_ITEM_NAME_J; }
	public String getMAKER_NAME_J() { return m_MAKER_NAME_J; }
	public String getWH_NAME_J() { return m_WH_NAME_J; }
	public String getPUCH_ODR_COMMENT_J() { return m_PUCH_ODR_COMMENT_J; }
	public String getMACHINE_NAME_J() { return m_MACHINE_NAME_J; }
	public String getODR_SPEC_J() { return m_ODR_SPEC_J; }
	public String getODR_ORG_NAME_J() { return m_ODR_ORG_NAME_J; }
	public String getCUST_CONSTRUCT_NAME_J() { return m_CUST_CONSTRUCT_NAME_J; }
	public String getCUR_CD() { return m_CUR_CD; }
	public String getUNIT_COST_FOREIGN() { return m_UNIT_COST_FOREIGN; }
	public String getODR_AMOUNT_FOREIGN() { return m_ODR_AMOUNT_FOREIGN; }
	public String getTAX_AMOUNT_FOREIGN() { return m_TAX_AMOUNT_FOREIGN; }
	public String getNET_AMOUNT_FOREIGN() { return m_NET_AMOUNT_FOREIGN; }
	public String getMATERIAL_UNIT_PRICE_FOREIGN() { return m_MATERIAL_UNIT_PRICE_FOREIGN; }
	public String getBEFORE_ODR_QTY() { return m_BEFORE_ODR_QTY; }
	public String getBEFORE_UNIT_COST() { return m_BEFORE_UNIT_COST; }
	public String getBEFORE_UNIT_COST_FOREIGN() { return m_BEFORE_UNIT_COST_FOREIGN; }
	public String getBEFORE_DLV_DATE_1() { return m_BEFORE_DLV_DATE_1; }
	public String getBEFORE_DLV_QTY_1() { return m_BEFORE_DLV_QTY_1; }
	public String getBEFORE_DLV_DATE_2() { return m_BEFORE_DLV_DATE_2; }
	public String getBEFORE_DLV_QTY_2() { return m_BEFORE_DLV_QTY_2; }
	public String getBEFORE_DLV_DATE_3() { return m_BEFORE_DLV_DATE_3; }
	public String getBEFORE_DLV_QTY_3() { return m_BEFORE_DLV_QTY_3; }
	public String getBEFORE_DLV_DATE_4() { return m_BEFORE_DLV_DATE_4; }
	public String getBEFORE_DLV_QTY_4() { return m_BEFORE_DLV_QTY_4; }
	public String getBEFORE_DLV_DATE_5() { return m_BEFORE_DLV_DATE_5; }
	public String getBEFORE_DLV_QTY_5() { return m_BEFORE_DLV_QTY_5; }
	public String getODR_RETURN_DATE() { return m_ODR_RETURN_DATE; }
	public String getREJECT_RETURN_TYP() { return m_REJECT_RETURN_TYP; }
	public String getEDI_ODR_ISS_FLG() { return m_EDI_ODR_ISS_FLG; }
	public String getEDI_ODR_ISS_DATE() { return m_EDI_ODR_ISS_DATE; }
	public String getl_PUCH_ODR_START_DATE() { return m_l_PUCH_ODR_START_DATE; }
	public String getl_PUCH_ODR_DLV_DATE() { return m_l_PUCH_ODR_DLV_DATE; }
	public String getl_VEND_CD() { return m_l_VEND_CD; }
	public String getl_VEND_ANAME() { return m_l_VEND_ANAME; }
	public String getl_ITEM_CD() { return m_l_ITEM_CD; }
	public String getl_ITEM_NAME() { return m_l_ITEM_NAME; }
	public String getl_PUCH_ODR_QTY() { return m_l_PUCH_ODR_QTY; }
	public String getl_STOCK_UNIT() { return m_l_STOCK_UNIT; }
	public String getl_PUCH_ODR_CD() { return m_l_PUCH_ODR_CD; }
	public String getl_JOB_ODR_CD() { return m_l_JOB_ODR_CD; }
	public String getl_PUCH_ODR_EDI_ISS_DATE() { return m_l_PUCH_ODR_EDI_ISS_DATE; }
	public String getl_BUSINESS_OPR_DATE() { return m_l_BUSINESS_OPR_DATE; }
	public String getl_MODIFY_COUNT() { return m_l_MODIFY_COUNT; }
	public String getPUCH_ODR_START_DATE() { return m_PUCH_ODR_START_DATE; }
	public String getPUCH_ODR_DLV_DATE() { return m_PUCH_ODR_DLV_DATE; }
	public String getPUCH_ODR_STS_TYP() { return m_PUCH_ODR_STS_TYP; }
	public String getPUCH_ODR_EDI_ISS_FLG() { return m_PUCH_ODR_EDI_ISS_FLG; }
	public String getNot_PUCH_ODR_EDI_ISS_FLG() { return m_Not_PUCH_ODR_EDI_ISS_FLG; }
	public String getEXCH_RATE() { return m_EXCH_RATE; }
	public String getODR_CANCEL_EDI_ISS_DATE() { return m_ODR_CANCEL_EDI_ISS_DATE; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getVEND_NAME() { return m_VEND_NAME; }
	public String getUSER_NAME() { return m_USER_NAME; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getBUSINESS_OPR_DATE() { return m_BUSINESS_OPR_DATE; }
	public String getl_PLANT_CD() { return m_l_PLANT_CD; }
	public String getl_PUCH_ODR_SLIP_ISS_DATE() { return m_l_PUCH_ODR_SLIP_ISS_DATE; }
	public String getl_ACPT_DATE() { return m_l_ACPT_DATE; }
	public String getl_ODR_CANCEL_SLIP_ISS_DATE() { return m_l_ODR_CANCEL_SLIP_ISS_DATE; }
	public String getl_PUCH_ODR_PERSON() { return m_l_PUCH_ODR_PERSON; }
	public String getl_USER_NAME() { return m_l_USER_NAME; }
	public String getl_ODR_CANCEL_CAUSE_CD() { return m_l_ODR_CANCEL_CAUSE_CD; }
	public String getl_ACPT_RSLT_COMMENT() { return m_l_ACPT_RSLT_COMMENT; }
	public String getPUCH_ODR_START_DATE_FROM() { return m_PUCH_ODR_START_DATE_FROM; }
	public String getPUCH_ODR_START_DATE_TO() { return m_PUCH_ODR_START_DATE_TO; }
	public String getPUCH_ODR_DLV_DATE_FROM() { return m_PUCH_ODR_DLV_DATE_FROM; }
	public String getPUCH_ODR_DLV_DATE_TO() { return m_PUCH_ODR_DLV_DATE_TO; }
	public String getACPT_DATE_FROM() { return m_ACPT_DATE_FROM; }
	public String getACPT_DATE_TO() { return m_ACPT_DATE_TO; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }

	public List getList_ReOutputFlg() { return l_ReOutputFlg; }
	public List getList_INFO_TYP_CD() { return l_INFO_TYP_CD; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_PUCH_ODR_CD() { return l_PUCH_ODR_CD; }
	public List getList_DATA_PROC_CD() { return l_DATA_PROC_CD; }
	public List getList_DATA_CREATE_DATE() { return l_DATA_CREATE_DATE; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_CRCT_TYP() { return l_CRCT_TYP; }
	public List getList_COCK_TYP() { return l_COCK_TYP; }
	public List getList_PUCH_ODR_DATE() { return l_PUCH_ODR_DATE; }
	public List getList_PUCH_ODR_UNIT() { return l_PUCH_ODR_UNIT; }
	public List getList_UNIT_COST() { return l_UNIT_COST; }
	public List getList_UNIT_COST_TYP() { return l_UNIT_COST_TYP; }
	public List getList_PUCH_ODR_QTY() { return l_PUCH_ODR_QTY; }
	public List getList_PUCH_ODR_AMOUNT() { return l_PUCH_ODR_AMOUNT; }
	public List getList_EDI_CONS_TYP() { return l_EDI_CONS_TYP; }
	public List getList_PUCH_ODR_PERSON() { return l_PUCH_ODR_PERSON; }
	public List getList_ITEM_SPEC() { return l_ITEM_SPEC; }
	public List getList_ITEM_DRAW_TYP() { return l_ITEM_DRAW_TYP; }
	public List getList_ITEM_VERSION() { return l_ITEM_VERSION; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_VEND_ITEM_CD() { return l_VEND_ITEM_CD; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_ITEM_DRAW_QTY() { return l_ITEM_DRAW_QTY; }
	public List getList_ITEM_PKG_UNIT() { return l_ITEM_PKG_UNIT; }
	public List getList_DIRECT_DLV_TYP() { return l_DIRECT_DLV_TYP; }
	public List getList_WH_CD() { return l_WH_CD; }
	public List getList_ACPT_INSPC_TYP() { return l_ACPT_INSPC_TYP; }
	public List getList_DLV_INST_TYP() { return l_DLV_INST_TYP; }
	public List getList_DLV_DATE_1() { return l_DLV_DATE_1; }
	public List getList_DLV_INST_QTY_1() { return l_DLV_INST_QTY_1; }
	public List getList_DLV_INST_CD_1() { return l_DLV_INST_CD_1; }
	public List getList_DLV_DATE_2() { return l_DLV_DATE_2; }
	public List getList_DLV_INST_QTY_2() { return l_DLV_INST_QTY_2; }
	public List getList_DLV_INST_CD_2() { return l_DLV_INST_CD_2; }
	public List getList_DLV_DATE_3() { return l_DLV_DATE_3; }
	public List getList_DLV_INST_QTY_3() { return l_DLV_INST_QTY_3; }
	public List getList_DLV_INST_CD_3() { return l_DLV_INST_CD_3; }
	public List getList_DLV_DATE_4() { return l_DLV_DATE_4; }
	public List getList_DLV_INST_QTY_4() { return l_DLV_INST_QTY_4; }
	public List getList_DLV_INST_CD_4() { return l_DLV_INST_CD_4; }
	public List getList_DLV_DATE_5() { return l_DLV_DATE_5; }
	public List getList_DLV_INST_QTY_5() { return l_DLV_INST_QTY_5; }
	public List getList_DLV_INST_CD_5() { return l_DLV_INST_CD_5; }
	public List getList_FREE_COLUMN() { return l_FREE_COLUMN; }
	public List getList_PUCH_ODR_COMMENT() { return l_PUCH_ODR_COMMENT; }
	public List getList_INCLUDING_TAX_TYP() { return l_INCLUDING_TAX_TYP; }
	public List getList_TAX_RELATION_TYP() { return l_TAX_RELATION_TYP; }
	public List getList_TAX_AMOUNT() { return l_TAX_AMOUNT; }
	public List getList_NET_AMOUNT() { return l_NET_AMOUNT; }
	public List getList_RESERVE_CD() { return l_RESERVE_CD; }
	public List getList_COST_PLAN_CD() { return l_COST_PLAN_CD; }
	public List getList_STL_COND_TYP() { return l_STL_COND_TYP; }
	public List getList_END_USER_NAME() { return l_END_USER_NAME; }
	public List getList_DLV_ADDRESS_CD() { return l_DLV_ADDRESS_CD; }
	public List getList_DLV_ADDRESS() { return l_DLV_ADDRESS; }
	public List getList_DLV_NAME() { return l_DLV_NAME; }
	public List getList_END_USER_ITEM_NAME() { return l_END_USER_ITEM_NAME; }
	public List getList_END_USER_ITEM_CD() { return l_END_USER_ITEM_CD; }
	public List getList_END_USER_ODR_CD() { return l_END_USER_ODR_CD; }
	public List getList_MAKER_NAME() { return l_MAKER_NAME; }
	public List getList_DLV_KEY_CD_1() { return l_DLV_KEY_CD_1; }
	public List getList_DLV_KEY_CD_2() { return l_DLV_KEY_CD_2; }
	public List getList_DLV_KEY_CD_3() { return l_DLV_KEY_CD_3; }
	public List getList_DLV_KEY_CD_4() { return l_DLV_KEY_CD_4; }
	public List getList_DLV_KEY_CD_5() { return l_DLV_KEY_CD_5; }
	public List getList_WH_NAME() { return l_WH_NAME; }
	public List getList_PUCH_BCODE_INF() { return l_PUCH_BCODE_INF; }
	public List getList_PUCH_COMMENT() { return l_PUCH_COMMENT; }
	public List getList_CONTRACT_COND_TYP() { return l_CONTRACT_COND_TYP; }
	public List getList_PUCH_ODR_SHAP_TYP() { return l_PUCH_ODR_SHAP_TYP; }
	public List getList_OWNER_ODR_CD() { return l_OWNER_ODR_CD; }
	public List getList_QTY_CONTRACT_TYP() { return l_QTY_CONTRACT_TYP; }
	public List getList_ODR_MODIFY_TYP_1() { return l_ODR_MODIFY_TYP_1; }
	public List getList_ODR_MODIFY_TYP_2() { return l_ODR_MODIFY_TYP_2; }
	public List getList_ODR_MODIFY_TYP_3() { return l_ODR_MODIFY_TYP_3; }
	public List getList_MACHINE_CD() { return l_MACHINE_CD; }
	public List getList_ENGINNERING_CHG_CD() { return l_ENGINNERING_CHG_CD; }
	public List getList_ITEM_DRAW_CD() { return l_ITEM_DRAW_CD; }
	public List getList_DLV_DOC_FORM_1() { return l_DLV_DOC_FORM_1; }
	public List getList_DLV_DOC_COPY_NUM_1() { return l_DLV_DOC_COPY_NUM_1; }
	public List getList_DLV_DOC_LANG_1() { return l_DLV_DOC_LANG_1; }
	public List getList_DLV_DOC_FORM_2() { return l_DLV_DOC_FORM_2; }
	public List getList_DLV_DOC_COPY_NUM_2() { return l_DLV_DOC_COPY_NUM_2; }
	public List getList_DLV_DOC_LANG_2() { return l_DLV_DOC_LANG_2; }
	public List getList_DLV_DOC_FORM_3() { return l_DLV_DOC_FORM_3; }
	public List getList_DLV_DOC_COPY_NUM_3() { return l_DLV_DOC_COPY_NUM_3; }
	public List getList_DLV_DOC_LANG_3() { return l_DLV_DOC_LANG_3; }
	public List getList_DLV_DOC_FORM_4() { return l_DLV_DOC_FORM_4; }
	public List getList_DLV_DOC_COPY_NUM_4() { return l_DLV_DOC_COPY_NUM_4; }
	public List getList_DLV_DOC_LANG_4() { return l_DLV_DOC_LANG_4; }
	public List getList_STRATEGIC_GOODS_TYP() { return l_STRATEGIC_GOODS_TYP; }
	public List getList_ORGN_PLACE_CD_1() { return l_ORGN_PLACE_CD_1; }
	public List getList_ORGN_PLACE_CD_2() { return l_ORGN_PLACE_CD_2; }
	public List getList_ORGN_PLACE_CD_3() { return l_ORGN_PLACE_CD_3; }
	public List getList_ORGN_PLACE_CD_4() { return l_ORGN_PLACE_CD_4; }
	public List getList_ORGN_PLACE_CD_5() { return l_ORGN_PLACE_CD_5; }
	public List getList_DLV_TIME_1() { return l_DLV_TIME_1; }
	public List getList_DLV_TIME_2() { return l_DLV_TIME_2; }
	public List getList_DLV_TIME_3() { return l_DLV_TIME_3; }
	public List getList_DLV_TIME_4() { return l_DLV_TIME_4; }
	public List getList_DLV_TIME_5() { return l_DLV_TIME_5; }
	public List getList_PACKAGE_DLV_CD() { return l_PACKAGE_DLV_CD; }
	public List getList_ODR_ITEM_SPEC() { return l_ODR_ITEM_SPEC; }
	public List getList_ODR_ORG_NAME() { return l_ODR_ORG_NAME; }
	public List getList_DLV_PART_LEN_1() { return l_DLV_PART_LEN_1; }
	public List getList_DLV_PART_QTY_1() { return l_DLV_PART_QTY_1; }
	public List getList_DLV_PART_LEN_2() { return l_DLV_PART_LEN_2; }
	public List getList_DLV_PART_QTY_2() { return l_DLV_PART_QTY_2; }
	public List getList_DLV_PART_LEN_3() { return l_DLV_PART_LEN_3; }
	public List getList_DLV_PART_QTY_3() { return l_DLV_PART_QTY_3; }
	public List getList_DLV_PART_LEN_4() { return l_DLV_PART_LEN_4; }
	public List getList_DLV_PART_QTY_4() { return l_DLV_PART_QTY_4; }
	public List getList_DLV_PART_LEN_5() { return l_DLV_PART_LEN_5; }
	public List getList_DLV_PART_QTY_5() { return l_DLV_PART_QTY_5; }
	public List getList_DLV_PART_UNIT() { return l_DLV_PART_UNIT; }
	public List getList_CUST_CONSTRUCT_NAME() { return l_CUST_CONSTRUCT_NAME; }
	public List getList_MATERIAL_CD() { return l_MATERIAL_CD; }
	public List getList_MATERIAL_UNIT_PRICE() { return l_MATERIAL_UNIT_PRICE; }
	public List getList_MATRRIAL_UNIT() { return l_MATRRIAL_UNIT; }
	public List getList_TEST_REPORT_NEED_TYP() { return l_TEST_REPORT_NEED_TYP; }
	public List getList_TEST_REPORT_CHK_TYP() { return l_TEST_REPORT_CHK_TYP; }
	public List getList_TEST_REPORT_PRESENT_TYP() { return l_TEST_REPORT_PRESENT_TYP; }
	public List getList_MUNICIPAL_CD() { return l_MUNICIPAL_CD; }
	public List getList_DLV_CONTACT_TEL() { return l_DLV_CONTACT_TEL; }
	public List getList_DLV_PRICE_OPEN_TYP() { return l_DLV_PRICE_OPEN_TYP; }
	public List getList_ODR_STAFF_NAME_J() { return l_ODR_STAFF_NAME_J; }
	public List getList_ITEM_SPEC_NAME_J() { return l_ITEM_SPEC_NAME_J; }
	public List getList_ITEM_NAME_J() { return l_ITEM_NAME_J; }
	public List getList_COMMENT_J() { return l_COMMENT_J; }
	public List getList_END_USER_NAME_J() { return l_END_USER_NAME_J; }
	public List getList_DLV_ADDRESS_J() { return l_DLV_ADDRESS_J; }
	public List getList_DLV_NAME_J() { return l_DLV_NAME_J; }
	public List getList_END_USER_ITEM_NAME_J() { return l_END_USER_ITEM_NAME_J; }
	public List getList_MAKER_NAME_J() { return l_MAKER_NAME_J; }
	public List getList_WH_NAME_J() { return l_WH_NAME_J; }
	public List getList_PUCH_ODR_COMMENT_J() { return l_PUCH_ODR_COMMENT_J; }
	public List getList_MACHINE_NAME_J() { return l_MACHINE_NAME_J; }
	public List getList_ODR_SPEC_J() { return l_ODR_SPEC_J; }
	public List getList_ODR_ORG_NAME_J() { return l_ODR_ORG_NAME_J; }
	public List getList_CUST_CONSTRUCT_NAME_J() { return l_CUST_CONSTRUCT_NAME_J; }
	public List getList_CUR_CD() { return l_CUR_CD; }
	public List getList_UNIT_COST_FOREIGN() { return l_UNIT_COST_FOREIGN; }
	public List getList_ODR_AMOUNT_FOREIGN() { return l_ODR_AMOUNT_FOREIGN; }
	public List getList_TAX_AMOUNT_FOREIGN() { return l_TAX_AMOUNT_FOREIGN; }
	public List getList_NET_AMOUNT_FOREIGN() { return l_NET_AMOUNT_FOREIGN; }
	public List getList_MATERIAL_UNIT_PRICE_FOREIGN() { return l_MATERIAL_UNIT_PRICE_FOREIGN; }
	public List getList_BEFORE_ODR_QTY() { return l_BEFORE_ODR_QTY; }
	public List getList_BEFORE_UNIT_COST() { return l_BEFORE_UNIT_COST; }
	public List getList_BEFORE_UNIT_COST_FOREIGN() { return l_BEFORE_UNIT_COST_FOREIGN; }
	public List getList_BEFORE_DLV_DATE_1() { return l_BEFORE_DLV_DATE_1; }
	public List getList_BEFORE_DLV_QTY_1() { return l_BEFORE_DLV_QTY_1; }
	public List getList_BEFORE_DLV_DATE_2() { return l_BEFORE_DLV_DATE_2; }
	public List getList_BEFORE_DLV_QTY_2() { return l_BEFORE_DLV_QTY_2; }
	public List getList_BEFORE_DLV_DATE_3() { return l_BEFORE_DLV_DATE_3; }
	public List getList_BEFORE_DLV_QTY_3() { return l_BEFORE_DLV_QTY_3; }
	public List getList_BEFORE_DLV_DATE_4() { return l_BEFORE_DLV_DATE_4; }
	public List getList_BEFORE_DLV_QTY_4() { return l_BEFORE_DLV_QTY_4; }
	public List getList_BEFORE_DLV_DATE_5() { return l_BEFORE_DLV_DATE_5; }
	public List getList_BEFORE_DLV_QTY_5() { return l_BEFORE_DLV_QTY_5; }
	public List getList_ODR_RETURN_DATE() { return l_ODR_RETURN_DATE; }
	public List getList_REJECT_RETURN_TYP() { return l_REJECT_RETURN_TYP; }
	public List getList_EDI_ODR_ISS_FLG() { return l_EDI_ODR_ISS_FLG; }
	public List getList_EDI_ODR_ISS_DATE() { return l_EDI_ODR_ISS_DATE; }
	public List getList_l_PUCH_ODR_START_DATE() { return l_l_PUCH_ODR_START_DATE; }
	public List getList_l_PUCH_ODR_DLV_DATE() { return l_l_PUCH_ODR_DLV_DATE; }
	public List getList_l_VEND_CD() { return l_l_VEND_CD; }
	public List getList_l_VEND_ANAME() { return l_l_VEND_ANAME; }
	public List getList_l_ITEM_CD() { return l_l_ITEM_CD; }
	public List getList_l_ITEM_NAME() { return l_l_ITEM_NAME; }
	public List getList_l_PUCH_ODR_QTY() { return l_l_PUCH_ODR_QTY; }
	public List getList_l_STOCK_UNIT() { return l_l_STOCK_UNIT; }
	public List getList_l_PUCH_ODR_CD() { return l_l_PUCH_ODR_CD; }
	public List getList_l_JOB_ODR_CD() { return l_l_JOB_ODR_CD; }
	public List getList_l_PUCH_ODR_EDI_ISS_DATE() { return l_l_PUCH_ODR_EDI_ISS_DATE; }
	public List getList_l_BUSINESS_OPR_DATE() { return l_l_BUSINESS_OPR_DATE; }
	public List getList_l_MODIFY_COUNT() { return l_l_MODIFY_COUNT; }
	public List getList_PUCH_ODR_START_DATE() { return l_PUCH_ODR_START_DATE; }
	public List getList_PUCH_ODR_DLV_DATE() { return l_PUCH_ODR_DLV_DATE; }
	public List getList_PUCH_ODR_STS_TYP() { return l_PUCH_ODR_STS_TYP; }
	public List getList_PUCH_ODR_EDI_ISS_FLG() { return l_PUCH_ODR_EDI_ISS_FLG; }
	public List getList_Not_PUCH_ODR_EDI_ISS_FLG() { return l_Not_PUCH_ODR_EDI_ISS_FLG; }
	public List getList_EXCH_RATE() { return l_EXCH_RATE; }
	public List getList_ODR_CANCEL_EDI_ISS_DATE() { return l_ODR_CANCEL_EDI_ISS_DATE; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_VEND_NAME() { return l_VEND_NAME; }
	public List getList_USER_NAME() { return l_USER_NAME; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_BUSINESS_OPR_DATE() { return l_BUSINESS_OPR_DATE; }
	public List getList_l_PLANT_CD() { return l_l_PLANT_CD; }
	public List getList_l_PUCH_ODR_SLIP_ISS_DATE() { return l_l_PUCH_ODR_SLIP_ISS_DATE; }
	public List getList_l_ACPT_DATE() { return l_l_ACPT_DATE; }
	public List getList_l_ODR_CANCEL_SLIP_ISS_DATE() { return l_l_ODR_CANCEL_SLIP_ISS_DATE; }
	public List getList_l_PUCH_ODR_PERSON() { return l_l_PUCH_ODR_PERSON; }
	public List getList_l_USER_NAME() { return l_l_USER_NAME; }
	public List getList_l_ODR_CANCEL_CAUSE_CD() { return l_l_ODR_CANCEL_CAUSE_CD; }
	public List getList_l_ACPT_RSLT_COMMENT() { return l_l_ACPT_RSLT_COMMENT; }
	public List getList_PUCH_ODR_START_DATE_FROM() { return l_PUCH_ODR_START_DATE_FROM; }
	public List getList_PUCH_ODR_START_DATE_TO() { return l_PUCH_ODR_START_DATE_TO; }
	public List getList_PUCH_ODR_DLV_DATE_FROM() { return l_PUCH_ODR_DLV_DATE_FROM; }
	public List getList_PUCH_ODR_DLV_DATE_TO() { return l_PUCH_ODR_DLV_DATE_TO; }
	public List getList_ACPT_DATE_FROM() { return l_ACPT_DATE_FROM; }
	public List getList_ACPT_DATE_TO() { return l_ACPT_DATE_TO; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }

	public void setReOutputFlg(String val) { m_ReOutputFlg = val; }
	public void setINFO_TYP_CD(String val) { m_INFO_TYP_CD = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setPUCH_ODR_CD(String val) { m_PUCH_ODR_CD = val; }
	public void setDATA_PROC_CD(String val) { m_DATA_PROC_CD = val; }
	public void setDATA_CREATE_DATE(String val) { m_DATA_CREATE_DATE = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setCRCT_TYP(String val) { m_CRCT_TYP = val; }
	public void setCOCK_TYP(String val) { m_COCK_TYP = val; }
	public void setPUCH_ODR_DATE(String val) { m_PUCH_ODR_DATE = val; }
	public void setPUCH_ODR_UNIT(String val) { m_PUCH_ODR_UNIT = val; }
	public void setUNIT_COST(String val) { m_UNIT_COST = val; }
	public void setUNIT_COST_TYP(String val) { m_UNIT_COST_TYP = val; }
	public void setPUCH_ODR_QTY(String val) { m_PUCH_ODR_QTY = val; }
	public void setPUCH_ODR_AMOUNT(String val) { m_PUCH_ODR_AMOUNT = val; }
	public void setEDI_CONS_TYP(String val) { m_EDI_CONS_TYP = val; }
	public void setPUCH_ODR_PERSON(String val) { m_PUCH_ODR_PERSON = val; }
	public void setITEM_SPEC(String val) { m_ITEM_SPEC = val; }
	public void setITEM_DRAW_TYP(String val) { m_ITEM_DRAW_TYP = val; }
	public void setITEM_VERSION(String val) { m_ITEM_VERSION = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setVEND_ITEM_CD(String val) { m_VEND_ITEM_CD = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setITEM_DRAW_QTY(String val) { m_ITEM_DRAW_QTY = val; }
	public void setITEM_PKG_UNIT(String val) { m_ITEM_PKG_UNIT = val; }
	public void setDIRECT_DLV_TYP(String val) { m_DIRECT_DLV_TYP = val; }
	public void setWH_CD(String val) { m_WH_CD = val; }
	public void setACPT_INSPC_TYP(String val) { m_ACPT_INSPC_TYP = val; }
	public void setDLV_INST_TYP(String val) { m_DLV_INST_TYP = val; }
	public void setDLV_DATE_1(String val) { m_DLV_DATE_1 = val; }
	public void setDLV_INST_QTY_1(String val) { m_DLV_INST_QTY_1 = val; }
	public void setDLV_INST_CD_1(String val) { m_DLV_INST_CD_1 = val; }
	public void setDLV_DATE_2(String val) { m_DLV_DATE_2 = val; }
	public void setDLV_INST_QTY_2(String val) { m_DLV_INST_QTY_2 = val; }
	public void setDLV_INST_CD_2(String val) { m_DLV_INST_CD_2 = val; }
	public void setDLV_DATE_3(String val) { m_DLV_DATE_3 = val; }
	public void setDLV_INST_QTY_3(String val) { m_DLV_INST_QTY_3 = val; }
	public void setDLV_INST_CD_3(String val) { m_DLV_INST_CD_3 = val; }
	public void setDLV_DATE_4(String val) { m_DLV_DATE_4 = val; }
	public void setDLV_INST_QTY_4(String val) { m_DLV_INST_QTY_4 = val; }
	public void setDLV_INST_CD_4(String val) { m_DLV_INST_CD_4 = val; }
	public void setDLV_DATE_5(String val) { m_DLV_DATE_5 = val; }
	public void setDLV_INST_QTY_5(String val) { m_DLV_INST_QTY_5 = val; }
	public void setDLV_INST_CD_5(String val) { m_DLV_INST_CD_5 = val; }
	public void setFREE_COLUMN(String val) { m_FREE_COLUMN = val; }
	public void setPUCH_ODR_COMMENT(String val) { m_PUCH_ODR_COMMENT = val; }
	public void setINCLUDING_TAX_TYP(String val) { m_INCLUDING_TAX_TYP = val; }
	public void setTAX_RELATION_TYP(String val) { m_TAX_RELATION_TYP = val; }
	public void setTAX_AMOUNT(String val) { m_TAX_AMOUNT = val; }
	public void setNET_AMOUNT(String val) { m_NET_AMOUNT = val; }
	public void setRESERVE_CD(String val) { m_RESERVE_CD = val; }
	public void setCOST_PLAN_CD(String val) { m_COST_PLAN_CD = val; }
	public void setSTL_COND_TYP(String val) { m_STL_COND_TYP = val; }
	public void setEND_USER_NAME(String val) { m_END_USER_NAME = val; }
	public void setDLV_ADDRESS_CD(String val) { m_DLV_ADDRESS_CD = val; }
	public void setDLV_ADDRESS(String val) { m_DLV_ADDRESS = val; }
	public void setDLV_NAME(String val) { m_DLV_NAME = val; }
	public void setEND_USER_ITEM_NAME(String val) { m_END_USER_ITEM_NAME = val; }
	public void setEND_USER_ITEM_CD(String val) { m_END_USER_ITEM_CD = val; }
	public void setEND_USER_ODR_CD(String val) { m_END_USER_ODR_CD = val; }
	public void setMAKER_NAME(String val) { m_MAKER_NAME = val; }
	public void setDLV_KEY_CD_1(String val) { m_DLV_KEY_CD_1 = val; }
	public void setDLV_KEY_CD_2(String val) { m_DLV_KEY_CD_2 = val; }
	public void setDLV_KEY_CD_3(String val) { m_DLV_KEY_CD_3 = val; }
	public void setDLV_KEY_CD_4(String val) { m_DLV_KEY_CD_4 = val; }
	public void setDLV_KEY_CD_5(String val) { m_DLV_KEY_CD_5 = val; }
	public void setWH_NAME(String val) { m_WH_NAME = val; }
	public void setPUCH_BCODE_INF(String val) { m_PUCH_BCODE_INF = val; }
	public void setPUCH_COMMENT(String val) { m_PUCH_COMMENT = val; }
	public void setCONTRACT_COND_TYP(String val) { m_CONTRACT_COND_TYP = val; }
	public void setPUCH_ODR_SHAP_TYP(String val) { m_PUCH_ODR_SHAP_TYP = val; }
	public void setOWNER_ODR_CD(String val) { m_OWNER_ODR_CD = val; }
	public void setQTY_CONTRACT_TYP(String val) { m_QTY_CONTRACT_TYP = val; }
	public void setODR_MODIFY_TYP_1(String val) { m_ODR_MODIFY_TYP_1 = val; }
	public void setODR_MODIFY_TYP_2(String val) { m_ODR_MODIFY_TYP_2 = val; }
	public void setODR_MODIFY_TYP_3(String val) { m_ODR_MODIFY_TYP_3 = val; }
	public void setMACHINE_CD(String val) { m_MACHINE_CD = val; }
	public void setENGINNERING_CHG_CD(String val) { m_ENGINNERING_CHG_CD = val; }
	public void setITEM_DRAW_CD(String val) { m_ITEM_DRAW_CD = val; }
	public void setDLV_DOC_FORM_1(String val) { m_DLV_DOC_FORM_1 = val; }
	public void setDLV_DOC_COPY_NUM_1(String val) { m_DLV_DOC_COPY_NUM_1 = val; }
	public void setDLV_DOC_LANG_1(String val) { m_DLV_DOC_LANG_1 = val; }
	public void setDLV_DOC_FORM_2(String val) { m_DLV_DOC_FORM_2 = val; }
	public void setDLV_DOC_COPY_NUM_2(String val) { m_DLV_DOC_COPY_NUM_2 = val; }
	public void setDLV_DOC_LANG_2(String val) { m_DLV_DOC_LANG_2 = val; }
	public void setDLV_DOC_FORM_3(String val) { m_DLV_DOC_FORM_3 = val; }
	public void setDLV_DOC_COPY_NUM_3(String val) { m_DLV_DOC_COPY_NUM_3 = val; }
	public void setDLV_DOC_LANG_3(String val) { m_DLV_DOC_LANG_3 = val; }
	public void setDLV_DOC_FORM_4(String val) { m_DLV_DOC_FORM_4 = val; }
	public void setDLV_DOC_COPY_NUM_4(String val) { m_DLV_DOC_COPY_NUM_4 = val; }
	public void setDLV_DOC_LANG_4(String val) { m_DLV_DOC_LANG_4 = val; }
	public void setSTRATEGIC_GOODS_TYP(String val) { m_STRATEGIC_GOODS_TYP = val; }
	public void setORGN_PLACE_CD_1(String val) { m_ORGN_PLACE_CD_1 = val; }
	public void setORGN_PLACE_CD_2(String val) { m_ORGN_PLACE_CD_2 = val; }
	public void setORGN_PLACE_CD_3(String val) { m_ORGN_PLACE_CD_3 = val; }
	public void setORGN_PLACE_CD_4(String val) { m_ORGN_PLACE_CD_4 = val; }
	public void setORGN_PLACE_CD_5(String val) { m_ORGN_PLACE_CD_5 = val; }
	public void setDLV_TIME_1(String val) { m_DLV_TIME_1 = val; }
	public void setDLV_TIME_2(String val) { m_DLV_TIME_2 = val; }
	public void setDLV_TIME_3(String val) { m_DLV_TIME_3 = val; }
	public void setDLV_TIME_4(String val) { m_DLV_TIME_4 = val; }
	public void setDLV_TIME_5(String val) { m_DLV_TIME_5 = val; }
	public void setPACKAGE_DLV_CD(String val) { m_PACKAGE_DLV_CD = val; }
	public void setODR_ITEM_SPEC(String val) { m_ODR_ITEM_SPEC = val; }
	public void setODR_ORG_NAME(String val) { m_ODR_ORG_NAME = val; }
	public void setDLV_PART_LEN_1(String val) { m_DLV_PART_LEN_1 = val; }
	public void setDLV_PART_QTY_1(String val) { m_DLV_PART_QTY_1 = val; }
	public void setDLV_PART_LEN_2(String val) { m_DLV_PART_LEN_2 = val; }
	public void setDLV_PART_QTY_2(String val) { m_DLV_PART_QTY_2 = val; }
	public void setDLV_PART_LEN_3(String val) { m_DLV_PART_LEN_3 = val; }
	public void setDLV_PART_QTY_3(String val) { m_DLV_PART_QTY_3 = val; }
	public void setDLV_PART_LEN_4(String val) { m_DLV_PART_LEN_4 = val; }
	public void setDLV_PART_QTY_4(String val) { m_DLV_PART_QTY_4 = val; }
	public void setDLV_PART_LEN_5(String val) { m_DLV_PART_LEN_5 = val; }
	public void setDLV_PART_QTY_5(String val) { m_DLV_PART_QTY_5 = val; }
	public void setDLV_PART_UNIT(String val) { m_DLV_PART_UNIT = val; }
	public void setCUST_CONSTRUCT_NAME(String val) { m_CUST_CONSTRUCT_NAME = val; }
	public void setMATERIAL_CD(String val) { m_MATERIAL_CD = val; }
	public void setMATERIAL_UNIT_PRICE(String val) { m_MATERIAL_UNIT_PRICE = val; }
	public void setMATRRIAL_UNIT(String val) { m_MATRRIAL_UNIT = val; }
	public void setTEST_REPORT_NEED_TYP(String val) { m_TEST_REPORT_NEED_TYP = val; }
	public void setTEST_REPORT_CHK_TYP(String val) { m_TEST_REPORT_CHK_TYP = val; }
	public void setTEST_REPORT_PRESENT_TYP(String val) { m_TEST_REPORT_PRESENT_TYP = val; }
	public void setMUNICIPAL_CD(String val) { m_MUNICIPAL_CD = val; }
	public void setDLV_CONTACT_TEL(String val) { m_DLV_CONTACT_TEL = val; }
	public void setDLV_PRICE_OPEN_TYP(String val) { m_DLV_PRICE_OPEN_TYP = val; }
	public void setODR_STAFF_NAME_J(String val) { m_ODR_STAFF_NAME_J = val; }
	public void setITEM_SPEC_NAME_J(String val) { m_ITEM_SPEC_NAME_J = val; }
	public void setITEM_NAME_J(String val) { m_ITEM_NAME_J = val; }
	public void setCOMMENT_J(String val) { m_COMMENT_J = val; }
	public void setEND_USER_NAME_J(String val) { m_END_USER_NAME_J = val; }
	public void setDLV_ADDRESS_J(String val) { m_DLV_ADDRESS_J = val; }
	public void setDLV_NAME_J(String val) { m_DLV_NAME_J = val; }
	public void setEND_USER_ITEM_NAME_J(String val) { m_END_USER_ITEM_NAME_J = val; }
	public void setMAKER_NAME_J(String val) { m_MAKER_NAME_J = val; }
	public void setWH_NAME_J(String val) { m_WH_NAME_J = val; }
	public void setPUCH_ODR_COMMENT_J(String val) { m_PUCH_ODR_COMMENT_J = val; }
	public void setMACHINE_NAME_J(String val) { m_MACHINE_NAME_J = val; }
	public void setODR_SPEC_J(String val) { m_ODR_SPEC_J = val; }
	public void setODR_ORG_NAME_J(String val) { m_ODR_ORG_NAME_J = val; }
	public void setCUST_CONSTRUCT_NAME_J(String val) { m_CUST_CONSTRUCT_NAME_J = val; }
	public void setCUR_CD(String val) { m_CUR_CD = val; }
	public void setUNIT_COST_FOREIGN(String val) { m_UNIT_COST_FOREIGN = val; }
	public void setODR_AMOUNT_FOREIGN(String val) { m_ODR_AMOUNT_FOREIGN = val; }
	public void setTAX_AMOUNT_FOREIGN(String val) { m_TAX_AMOUNT_FOREIGN = val; }
	public void setNET_AMOUNT_FOREIGN(String val) { m_NET_AMOUNT_FOREIGN = val; }
	public void setMATERIAL_UNIT_PRICE_FOREIGN(String val) { m_MATERIAL_UNIT_PRICE_FOREIGN = val; }
	public void setBEFORE_ODR_QTY(String val) { m_BEFORE_ODR_QTY = val; }
	public void setBEFORE_UNIT_COST(String val) { m_BEFORE_UNIT_COST = val; }
	public void setBEFORE_UNIT_COST_FOREIGN(String val) { m_BEFORE_UNIT_COST_FOREIGN = val; }
	public void setBEFORE_DLV_DATE_1(String val) { m_BEFORE_DLV_DATE_1 = val; }
	public void setBEFORE_DLV_QTY_1(String val) { m_BEFORE_DLV_QTY_1 = val; }
	public void setBEFORE_DLV_DATE_2(String val) { m_BEFORE_DLV_DATE_2 = val; }
	public void setBEFORE_DLV_QTY_2(String val) { m_BEFORE_DLV_QTY_2 = val; }
	public void setBEFORE_DLV_DATE_3(String val) { m_BEFORE_DLV_DATE_3 = val; }
	public void setBEFORE_DLV_QTY_3(String val) { m_BEFORE_DLV_QTY_3 = val; }
	public void setBEFORE_DLV_DATE_4(String val) { m_BEFORE_DLV_DATE_4 = val; }
	public void setBEFORE_DLV_QTY_4(String val) { m_BEFORE_DLV_QTY_4 = val; }
	public void setBEFORE_DLV_DATE_5(String val) { m_BEFORE_DLV_DATE_5 = val; }
	public void setBEFORE_DLV_QTY_5(String val) { m_BEFORE_DLV_QTY_5 = val; }
	public void setODR_RETURN_DATE(String val) { m_ODR_RETURN_DATE = val; }
	public void setREJECT_RETURN_TYP(String val) { m_REJECT_RETURN_TYP = val; }
	public void setEDI_ODR_ISS_FLG(String val) { m_EDI_ODR_ISS_FLG = val; }
	public void setEDI_ODR_ISS_DATE(String val) { m_EDI_ODR_ISS_DATE = val; }
	public void setl_PUCH_ODR_START_DATE(String val) { m_l_PUCH_ODR_START_DATE = val; }
	public void setl_PUCH_ODR_DLV_DATE(String val) { m_l_PUCH_ODR_DLV_DATE = val; }
	public void setl_VEND_CD(String val) { m_l_VEND_CD = val; }
	public void setl_VEND_ANAME(String val) { m_l_VEND_ANAME = val; }
	public void setl_ITEM_CD(String val) { m_l_ITEM_CD = val; }
	public void setl_ITEM_NAME(String val) { m_l_ITEM_NAME = val; }
	public void setl_PUCH_ODR_QTY(String val) { m_l_PUCH_ODR_QTY = val; }
	public void setl_STOCK_UNIT(String val) { m_l_STOCK_UNIT = val; }
	public void setl_PUCH_ODR_CD(String val) { m_l_PUCH_ODR_CD = val; }
	public void setl_JOB_ODR_CD(String val) { m_l_JOB_ODR_CD = val; }
	public void setl_PUCH_ODR_EDI_ISS_DATE(String val) { m_l_PUCH_ODR_EDI_ISS_DATE = val; }
	public void setl_BUSINESS_OPR_DATE(String val) { m_l_BUSINESS_OPR_DATE = val; }
	public void setl_MODIFY_COUNT(String val) { m_l_MODIFY_COUNT = val; }
	public void setPUCH_ODR_START_DATE(String val) { m_PUCH_ODR_START_DATE = val; }
	public void setPUCH_ODR_DLV_DATE(String val) { m_PUCH_ODR_DLV_DATE = val; }
	public void setPUCH_ODR_STS_TYP(String val) { m_PUCH_ODR_STS_TYP = val; }
	public void setPUCH_ODR_EDI_ISS_FLG(String val) { m_PUCH_ODR_EDI_ISS_FLG = val; }
	public void setNot_PUCH_ODR_EDI_ISS_FLG(String val) { m_Not_PUCH_ODR_EDI_ISS_FLG = val; }
	public void setEXCH_RATE(String val) { m_EXCH_RATE = val; }
	public void setODR_CANCEL_EDI_ISS_DATE(String val) { m_ODR_CANCEL_EDI_ISS_DATE = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setVEND_NAME(String val) { m_VEND_NAME = val; }
	public void setUSER_NAME(String val) { m_USER_NAME = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setBUSINESS_OPR_DATE(String val) { m_BUSINESS_OPR_DATE = val; }
	public void setl_PLANT_CD(String val) { m_l_PLANT_CD = val; }
	public void setl_PUCH_ODR_SLIP_ISS_DATE(String val) { m_l_PUCH_ODR_SLIP_ISS_DATE = val; }
	public void setl_ACPT_DATE(String val) { m_l_ACPT_DATE = val; }
	public void setl_ODR_CANCEL_SLIP_ISS_DATE(String val) { m_l_ODR_CANCEL_SLIP_ISS_DATE = val; }
	public void setl_PUCH_ODR_PERSON(String val) { m_l_PUCH_ODR_PERSON = val; }
	public void setl_USER_NAME(String val) { m_l_USER_NAME = val; }
	public void setl_ODR_CANCEL_CAUSE_CD(String val) { m_l_ODR_CANCEL_CAUSE_CD = val; }
	public void setl_ACPT_RSLT_COMMENT(String val) { m_l_ACPT_RSLT_COMMENT = val; }
	public void setPUCH_ODR_START_DATE_FROM(String val) { m_PUCH_ODR_START_DATE_FROM = val; }
	public void setPUCH_ODR_START_DATE_TO(String val) { m_PUCH_ODR_START_DATE_TO = val; }
	public void setPUCH_ODR_DLV_DATE_FROM(String val) { m_PUCH_ODR_DLV_DATE_FROM = val; }
	public void setPUCH_ODR_DLV_DATE_TO(String val) { m_PUCH_ODR_DLV_DATE_TO = val; }
	public void setACPT_DATE_FROM(String val) { m_ACPT_DATE_FROM = val; }
	public void setACPT_DATE_TO(String val) { m_ACPT_DATE_TO = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }


	public void setList_ReOutputFlg(List list) { l_ReOutputFlg = list; }
	public void setList_INFO_TYP_CD(List list) { l_INFO_TYP_CD = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_PUCH_ODR_CD(List list) { l_PUCH_ODR_CD = list; }
	public void setList_DATA_PROC_CD(List list) { l_DATA_PROC_CD = list; }
	public void setList_DATA_CREATE_DATE(List list) { l_DATA_CREATE_DATE = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_CRCT_TYP(List list) { l_CRCT_TYP = list; }
	public void setList_COCK_TYP(List list) { l_COCK_TYP = list; }
	public void setList_PUCH_ODR_DATE(List list) { l_PUCH_ODR_DATE = list; }
	public void setList_PUCH_ODR_UNIT(List list) { l_PUCH_ODR_UNIT = list; }
	public void setList_UNIT_COST(List list) { l_UNIT_COST = list; }
	public void setList_UNIT_COST_TYP(List list) { l_UNIT_COST_TYP = list; }
	public void setList_PUCH_ODR_QTY(List list) { l_PUCH_ODR_QTY = list; }
	public void setList_PUCH_ODR_AMOUNT(List list) { l_PUCH_ODR_AMOUNT = list; }
	public void setList_EDI_CONS_TYP(List list) { l_EDI_CONS_TYP = list; }
	public void setList_PUCH_ODR_PERSON(List list) { l_PUCH_ODR_PERSON = list; }
	public void setList_ITEM_SPEC(List list) { l_ITEM_SPEC = list; }
	public void setList_ITEM_DRAW_TYP(List list) { l_ITEM_DRAW_TYP = list; }
	public void setList_ITEM_VERSION(List list) { l_ITEM_VERSION = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_VEND_ITEM_CD(List list) { l_VEND_ITEM_CD = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_ITEM_DRAW_QTY(List list) { l_ITEM_DRAW_QTY = list; }
	public void setList_ITEM_PKG_UNIT(List list) { l_ITEM_PKG_UNIT = list; }
	public void setList_DIRECT_DLV_TYP(List list) { l_DIRECT_DLV_TYP = list; }
	public void setList_WH_CD(List list) { l_WH_CD = list; }
	public void setList_ACPT_INSPC_TYP(List list) { l_ACPT_INSPC_TYP = list; }
	public void setList_DLV_INST_TYP(List list) { l_DLV_INST_TYP = list; }
	public void setList_DLV_DATE_1(List list) { l_DLV_DATE_1 = list; }
	public void setList_DLV_INST_QTY_1(List list) { l_DLV_INST_QTY_1 = list; }
	public void setList_DLV_INST_CD_1(List list) { l_DLV_INST_CD_1 = list; }
	public void setList_DLV_DATE_2(List list) { l_DLV_DATE_2 = list; }
	public void setList_DLV_INST_QTY_2(List list) { l_DLV_INST_QTY_2 = list; }
	public void setList_DLV_INST_CD_2(List list) { l_DLV_INST_CD_2 = list; }
	public void setList_DLV_DATE_3(List list) { l_DLV_DATE_3 = list; }
	public void setList_DLV_INST_QTY_3(List list) { l_DLV_INST_QTY_3 = list; }
	public void setList_DLV_INST_CD_3(List list) { l_DLV_INST_CD_3 = list; }
	public void setList_DLV_DATE_4(List list) { l_DLV_DATE_4 = list; }
	public void setList_DLV_INST_QTY_4(List list) { l_DLV_INST_QTY_4 = list; }
	public void setList_DLV_INST_CD_4(List list) { l_DLV_INST_CD_4 = list; }
	public void setList_DLV_DATE_5(List list) { l_DLV_DATE_5 = list; }
	public void setList_DLV_INST_QTY_5(List list) { l_DLV_INST_QTY_5 = list; }
	public void setList_DLV_INST_CD_5(List list) { l_DLV_INST_CD_5 = list; }
	public void setList_FREE_COLUMN(List list) { l_FREE_COLUMN = list; }
	public void setList_PUCH_ODR_COMMENT(List list) { l_PUCH_ODR_COMMENT = list; }
	public void setList_INCLUDING_TAX_TYP(List list) { l_INCLUDING_TAX_TYP = list; }
	public void setList_TAX_RELATION_TYP(List list) { l_TAX_RELATION_TYP = list; }
	public void setList_TAX_AMOUNT(List list) { l_TAX_AMOUNT = list; }
	public void setList_NET_AMOUNT(List list) { l_NET_AMOUNT = list; }
	public void setList_RESERVE_CD(List list) { l_RESERVE_CD = list; }
	public void setList_COST_PLAN_CD(List list) { l_COST_PLAN_CD = list; }
	public void setList_STL_COND_TYP(List list) { l_STL_COND_TYP = list; }
	public void setList_END_USER_NAME(List list) { l_END_USER_NAME = list; }
	public void setList_DLV_ADDRESS_CD(List list) { l_DLV_ADDRESS_CD = list; }
	public void setList_DLV_ADDRESS(List list) { l_DLV_ADDRESS = list; }
	public void setList_DLV_NAME(List list) { l_DLV_NAME = list; }
	public void setList_END_USER_ITEM_NAME(List list) { l_END_USER_ITEM_NAME = list; }
	public void setList_END_USER_ITEM_CD(List list) { l_END_USER_ITEM_CD = list; }
	public void setList_END_USER_ODR_CD(List list) { l_END_USER_ODR_CD = list; }
	public void setList_MAKER_NAME(List list) { l_MAKER_NAME = list; }
	public void setList_DLV_KEY_CD_1(List list) { l_DLV_KEY_CD_1 = list; }
	public void setList_DLV_KEY_CD_2(List list) { l_DLV_KEY_CD_2 = list; }
	public void setList_DLV_KEY_CD_3(List list) { l_DLV_KEY_CD_3 = list; }
	public void setList_DLV_KEY_CD_4(List list) { l_DLV_KEY_CD_4 = list; }
	public void setList_DLV_KEY_CD_5(List list) { l_DLV_KEY_CD_5 = list; }
	public void setList_WH_NAME(List list) { l_WH_NAME = list; }
	public void setList_PUCH_BCODE_INF(List list) { l_PUCH_BCODE_INF = list; }
	public void setList_PUCH_COMMENT(List list) { l_PUCH_COMMENT = list; }
	public void setList_CONTRACT_COND_TYP(List list) { l_CONTRACT_COND_TYP = list; }
	public void setList_PUCH_ODR_SHAP_TYP(List list) { l_PUCH_ODR_SHAP_TYP = list; }
	public void setList_OWNER_ODR_CD(List list) { l_OWNER_ODR_CD = list; }
	public void setList_QTY_CONTRACT_TYP(List list) { l_QTY_CONTRACT_TYP = list; }
	public void setList_ODR_MODIFY_TYP_1(List list) { l_ODR_MODIFY_TYP_1 = list; }
	public void setList_ODR_MODIFY_TYP_2(List list) { l_ODR_MODIFY_TYP_2 = list; }
	public void setList_ODR_MODIFY_TYP_3(List list) { l_ODR_MODIFY_TYP_3 = list; }
	public void setList_MACHINE_CD(List list) { l_MACHINE_CD = list; }
	public void setList_ENGINNERING_CHG_CD(List list) { l_ENGINNERING_CHG_CD = list; }
	public void setList_ITEM_DRAW_CD(List list) { l_ITEM_DRAW_CD = list; }
	public void setList_DLV_DOC_FORM_1(List list) { l_DLV_DOC_FORM_1 = list; }
	public void setList_DLV_DOC_COPY_NUM_1(List list) { l_DLV_DOC_COPY_NUM_1 = list; }
	public void setList_DLV_DOC_LANG_1(List list) { l_DLV_DOC_LANG_1 = list; }
	public void setList_DLV_DOC_FORM_2(List list) { l_DLV_DOC_FORM_2 = list; }
	public void setList_DLV_DOC_COPY_NUM_2(List list) { l_DLV_DOC_COPY_NUM_2 = list; }
	public void setList_DLV_DOC_LANG_2(List list) { l_DLV_DOC_LANG_2 = list; }
	public void setList_DLV_DOC_FORM_3(List list) { l_DLV_DOC_FORM_3 = list; }
	public void setList_DLV_DOC_COPY_NUM_3(List list) { l_DLV_DOC_COPY_NUM_3 = list; }
	public void setList_DLV_DOC_LANG_3(List list) { l_DLV_DOC_LANG_3 = list; }
	public void setList_DLV_DOC_FORM_4(List list) { l_DLV_DOC_FORM_4 = list; }
	public void setList_DLV_DOC_COPY_NUM_4(List list) { l_DLV_DOC_COPY_NUM_4 = list; }
	public void setList_DLV_DOC_LANG_4(List list) { l_DLV_DOC_LANG_4 = list; }
	public void setList_STRATEGIC_GOODS_TYP(List list) { l_STRATEGIC_GOODS_TYP = list; }
	public void setList_ORGN_PLACE_CD_1(List list) { l_ORGN_PLACE_CD_1 = list; }
	public void setList_ORGN_PLACE_CD_2(List list) { l_ORGN_PLACE_CD_2 = list; }
	public void setList_ORGN_PLACE_CD_3(List list) { l_ORGN_PLACE_CD_3 = list; }
	public void setList_ORGN_PLACE_CD_4(List list) { l_ORGN_PLACE_CD_4 = list; }
	public void setList_ORGN_PLACE_CD_5(List list) { l_ORGN_PLACE_CD_5 = list; }
	public void setList_DLV_TIME_1(List list) { l_DLV_TIME_1 = list; }
	public void setList_DLV_TIME_2(List list) { l_DLV_TIME_2 = list; }
	public void setList_DLV_TIME_3(List list) { l_DLV_TIME_3 = list; }
	public void setList_DLV_TIME_4(List list) { l_DLV_TIME_4 = list; }
	public void setList_DLV_TIME_5(List list) { l_DLV_TIME_5 = list; }
	public void setList_PACKAGE_DLV_CD(List list) { l_PACKAGE_DLV_CD = list; }
	public void setList_ODR_ITEM_SPEC(List list) { l_ODR_ITEM_SPEC = list; }
	public void setList_ODR_ORG_NAME(List list) { l_ODR_ORG_NAME = list; }
	public void setList_DLV_PART_LEN_1(List list) { l_DLV_PART_LEN_1 = list; }
	public void setList_DLV_PART_QTY_1(List list) { l_DLV_PART_QTY_1 = list; }
	public void setList_DLV_PART_LEN_2(List list) { l_DLV_PART_LEN_2 = list; }
	public void setList_DLV_PART_QTY_2(List list) { l_DLV_PART_QTY_2 = list; }
	public void setList_DLV_PART_LEN_3(List list) { l_DLV_PART_LEN_3 = list; }
	public void setList_DLV_PART_QTY_3(List list) { l_DLV_PART_QTY_3 = list; }
	public void setList_DLV_PART_LEN_4(List list) { l_DLV_PART_LEN_4 = list; }
	public void setList_DLV_PART_QTY_4(List list) { l_DLV_PART_QTY_4 = list; }
	public void setList_DLV_PART_LEN_5(List list) { l_DLV_PART_LEN_5 = list; }
	public void setList_DLV_PART_QTY_5(List list) { l_DLV_PART_QTY_5 = list; }
	public void setList_DLV_PART_UNIT(List list) { l_DLV_PART_UNIT = list; }
	public void setList_CUST_CONSTRUCT_NAME(List list) { l_CUST_CONSTRUCT_NAME = list; }
	public void setList_MATERIAL_CD(List list) { l_MATERIAL_CD = list; }
	public void setList_MATERIAL_UNIT_PRICE(List list) { l_MATERIAL_UNIT_PRICE = list; }
	public void setList_MATRRIAL_UNIT(List list) { l_MATRRIAL_UNIT = list; }
	public void setList_TEST_REPORT_NEED_TYP(List list) { l_TEST_REPORT_NEED_TYP = list; }
	public void setList_TEST_REPORT_CHK_TYP(List list) { l_TEST_REPORT_CHK_TYP = list; }
	public void setList_TEST_REPORT_PRESENT_TYP(List list) { l_TEST_REPORT_PRESENT_TYP = list; }
	public void setList_MUNICIPAL_CD(List list) { l_MUNICIPAL_CD = list; }
	public void setList_DLV_CONTACT_TEL(List list) { l_DLV_CONTACT_TEL = list; }
	public void setList_DLV_PRICE_OPEN_TYP(List list) { l_DLV_PRICE_OPEN_TYP = list; }
	public void setList_ODR_STAFF_NAME_J(List list) { l_ODR_STAFF_NAME_J = list; }
	public void setList_ITEM_SPEC_NAME_J(List list) { l_ITEM_SPEC_NAME_J = list; }
	public void setList_ITEM_NAME_J(List list) { l_ITEM_NAME_J = list; }
	public void setList_COMMENT_J(List list) { l_COMMENT_J = list; }
	public void setList_END_USER_NAME_J(List list) { l_END_USER_NAME_J = list; }
	public void setList_DLV_ADDRESS_J(List list) { l_DLV_ADDRESS_J = list; }
	public void setList_DLV_NAME_J(List list) { l_DLV_NAME_J = list; }
	public void setList_END_USER_ITEM_NAME_J(List list) { l_END_USER_ITEM_NAME_J = list; }
	public void setList_MAKER_NAME_J(List list) { l_MAKER_NAME_J = list; }
	public void setList_WH_NAME_J(List list) { l_WH_NAME_J = list; }
	public void setList_PUCH_ODR_COMMENT_J(List list) { l_PUCH_ODR_COMMENT_J = list; }
	public void setList_MACHINE_NAME_J(List list) { l_MACHINE_NAME_J = list; }
	public void setList_ODR_SPEC_J(List list) { l_ODR_SPEC_J = list; }
	public void setList_ODR_ORG_NAME_J(List list) { l_ODR_ORG_NAME_J = list; }
	public void setList_CUST_CONSTRUCT_NAME_J(List list) { l_CUST_CONSTRUCT_NAME_J = list; }
	public void setList_CUR_CD(List list) { l_CUR_CD = list; }
	public void setList_UNIT_COST_FOREIGN(List list) { l_UNIT_COST_FOREIGN = list; }
	public void setList_ODR_AMOUNT_FOREIGN(List list) { l_ODR_AMOUNT_FOREIGN = list; }
	public void setList_TAX_AMOUNT_FOREIGN(List list) { l_TAX_AMOUNT_FOREIGN = list; }
	public void setList_NET_AMOUNT_FOREIGN(List list) { l_NET_AMOUNT_FOREIGN = list; }
	public void setList_MATERIAL_UNIT_PRICE_FOREIGN(List list) { l_MATERIAL_UNIT_PRICE_FOREIGN = list; }
	public void setList_BEFORE_ODR_QTY(List list) { l_BEFORE_ODR_QTY = list; }
	public void setList_BEFORE_UNIT_COST(List list) { l_BEFORE_UNIT_COST = list; }
	public void setList_BEFORE_UNIT_COST_FOREIGN(List list) { l_BEFORE_UNIT_COST_FOREIGN = list; }
	public void setList_BEFORE_DLV_DATE_1(List list) { l_BEFORE_DLV_DATE_1 = list; }
	public void setList_BEFORE_DLV_QTY_1(List list) { l_BEFORE_DLV_QTY_1 = list; }
	public void setList_BEFORE_DLV_DATE_2(List list) { l_BEFORE_DLV_DATE_2 = list; }
	public void setList_BEFORE_DLV_QTY_2(List list) { l_BEFORE_DLV_QTY_2 = list; }
	public void setList_BEFORE_DLV_DATE_3(List list) { l_BEFORE_DLV_DATE_3 = list; }
	public void setList_BEFORE_DLV_QTY_3(List list) { l_BEFORE_DLV_QTY_3 = list; }
	public void setList_BEFORE_DLV_DATE_4(List list) { l_BEFORE_DLV_DATE_4 = list; }
	public void setList_BEFORE_DLV_QTY_4(List list) { l_BEFORE_DLV_QTY_4 = list; }
	public void setList_BEFORE_DLV_DATE_5(List list) { l_BEFORE_DLV_DATE_5 = list; }
	public void setList_BEFORE_DLV_QTY_5(List list) { l_BEFORE_DLV_QTY_5 = list; }
	public void setList_ODR_RETURN_DATE(List list) { l_ODR_RETURN_DATE = list; }
	public void setList_REJECT_RETURN_TYP(List list) { l_REJECT_RETURN_TYP = list; }
	public void setList_EDI_ODR_ISS_FLG(List list) { l_EDI_ODR_ISS_FLG = list; }
	public void setList_EDI_ODR_ISS_DATE(List list) { l_EDI_ODR_ISS_DATE = list; }
	public void setList_l_PUCH_ODR_START_DATE(List list) { l_l_PUCH_ODR_START_DATE = list; }
	public void setList_l_PUCH_ODR_DLV_DATE(List list) { l_l_PUCH_ODR_DLV_DATE = list; }
	public void setList_l_VEND_CD(List list) { l_l_VEND_CD = list; }
	public void setList_l_VEND_ANAME(List list) { l_l_VEND_ANAME = list; }
	public void setList_l_ITEM_CD(List list) { l_l_ITEM_CD = list; }
	public void setList_l_ITEM_NAME(List list) { l_l_ITEM_NAME = list; }
	public void setList_l_PUCH_ODR_QTY(List list) { l_l_PUCH_ODR_QTY = list; }
	public void setList_l_STOCK_UNIT(List list) { l_l_STOCK_UNIT = list; }
	public void setList_l_PUCH_ODR_CD(List list) { l_l_PUCH_ODR_CD = list; }
	public void setList_l_JOB_ODR_CD(List list) { l_l_JOB_ODR_CD = list; }
	public void setList_l_PUCH_ODR_EDI_ISS_DATE(List list) { l_l_PUCH_ODR_EDI_ISS_DATE = list; }
	public void setList_l_BUSINESS_OPR_DATE(List list) { l_l_BUSINESS_OPR_DATE = list; }
	public void setList_l_MODIFY_COUNT(List list) { l_l_MODIFY_COUNT = list; }
	public void setList_PUCH_ODR_START_DATE(List list) { l_PUCH_ODR_START_DATE = list; }
	public void setList_PUCH_ODR_DLV_DATE(List list) { l_PUCH_ODR_DLV_DATE = list; }
	public void setList_PUCH_ODR_STS_TYP(List list) { l_PUCH_ODR_STS_TYP = list; }
	public void setList_PUCH_ODR_EDI_ISS_FLG(List list) { l_PUCH_ODR_EDI_ISS_FLG = list; }
	public void setList_Not_PUCH_ODR_EDI_ISS_FLG(List list) { l_Not_PUCH_ODR_EDI_ISS_FLG = list; }
	public void setList_EXCH_RATE(List list) { l_EXCH_RATE = list; }
	public void setList_ODR_CANCEL_EDI_ISS_DATE(List list) { l_ODR_CANCEL_EDI_ISS_DATE = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_VEND_NAME(List list) { l_VEND_NAME = list; }
	public void setList_USER_NAME(List list) { l_USER_NAME = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_BUSINESS_OPR_DATE(List list) { l_BUSINESS_OPR_DATE = list; }
	public void setList_l_PLANT_CD(List list) { l_l_PLANT_CD = list; }
	public void setList_l_PUCH_ODR_SLIP_ISS_DATE(List list) { l_l_PUCH_ODR_SLIP_ISS_DATE = list; }
	public void setList_l_ACPT_DATE(List list) { l_l_ACPT_DATE = list; }
	public void setList_l_ODR_CANCEL_SLIP_ISS_DATE(List list) { l_l_ODR_CANCEL_SLIP_ISS_DATE = list; }
	public void setList_l_PUCH_ODR_PERSON(List list) { l_l_PUCH_ODR_PERSON = list; }
	public void setList_l_USER_NAME(List list) { l_l_USER_NAME = list; }
	public void setList_l_ODR_CANCEL_CAUSE_CD(List list) { l_l_ODR_CANCEL_CAUSE_CD = list; }
	public void setList_l_ACPT_RSLT_COMMENT(List list) { l_l_ACPT_RSLT_COMMENT = list; }
	public void setList_PUCH_ODR_START_DATE_FROM(List list) { l_PUCH_ODR_START_DATE_FROM = list; }
	public void setList_PUCH_ODR_START_DATE_TO(List list) { l_PUCH_ODR_START_DATE_TO = list; }
	public void setList_PUCH_ODR_DLV_DATE_FROM(List list) { l_PUCH_ODR_DLV_DATE_FROM = list; }
	public void setList_PUCH_ODR_DLV_DATE_TO(List list) { l_PUCH_ODR_DLV_DATE_TO = list; }
	public void setList_ACPT_DATE_FROM(List list) { l_ACPT_DATE_FROM = list; }
	public void setList_ACPT_DATE_TO(List list) { l_ACPT_DATE_TO = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }

	public int setL2L_ReOutputFlg(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ReOutputFlg == null) {
			l_ReOutputFlg = new ArrayList();
		} else {
			l_ReOutputFlg.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ReOutputFlg.add(((AE0080010Struct) list.get(i)).getReOutputFlg());
		}
		return size;
	}
	public int setL2L_INFO_TYP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INFO_TYP_CD == null) {
			l_INFO_TYP_CD = new ArrayList();
		} else {
			l_INFO_TYP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INFO_TYP_CD.add(((AE0080010Struct) list.get(i)).getINFO_TYP_CD());
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
			l_COMPANY_CD.add(((AE0080010Struct) list.get(i)).getCOMPANY_CD());
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
			l_PUCH_ODR_CD.add(((AE0080010Struct) list.get(i)).getPUCH_ODR_CD());
		}
		return size;
	}
	public int setL2L_DATA_PROC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DATA_PROC_CD == null) {
			l_DATA_PROC_CD = new ArrayList();
		} else {
			l_DATA_PROC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DATA_PROC_CD.add(((AE0080010Struct) list.get(i)).getDATA_PROC_CD());
		}
		return size;
	}
	public int setL2L_DATA_CREATE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DATA_CREATE_DATE == null) {
			l_DATA_CREATE_DATE = new ArrayList();
		} else {
			l_DATA_CREATE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DATA_CREATE_DATE.add(((AE0080010Struct) list.get(i)).getDATA_CREATE_DATE());
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
			l_VEND_CD.add(((AE0080010Struct) list.get(i)).getVEND_CD());
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
			l_PLANT_CD.add(((AE0080010Struct) list.get(i)).getPLANT_CD());
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
			l_JOB_ODR_CD.add(((AE0080010Struct) list.get(i)).getJOB_ODR_CD());
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
			l_CRCT_TYP.add(((AE0080010Struct) list.get(i)).getCRCT_TYP());
		}
		return size;
	}
	public int setL2L_COCK_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COCK_TYP == null) {
			l_COCK_TYP = new ArrayList();
		} else {
			l_COCK_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COCK_TYP.add(((AE0080010Struct) list.get(i)).getCOCK_TYP());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_DATE == null) {
			l_PUCH_ODR_DATE = new ArrayList();
		} else {
			l_PUCH_ODR_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_DATE.add(((AE0080010Struct) list.get(i)).getPUCH_ODR_DATE());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_UNIT == null) {
			l_PUCH_ODR_UNIT = new ArrayList();
		} else {
			l_PUCH_ODR_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_UNIT.add(((AE0080010Struct) list.get(i)).getPUCH_ODR_UNIT());
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
			l_UNIT_COST.add(((AE0080010Struct) list.get(i)).getUNIT_COST());
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
			l_UNIT_COST_TYP.add(((AE0080010Struct) list.get(i)).getUNIT_COST_TYP());
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
			l_PUCH_ODR_QTY.add(((AE0080010Struct) list.get(i)).getPUCH_ODR_QTY());
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
			l_PUCH_ODR_AMOUNT.add(((AE0080010Struct) list.get(i)).getPUCH_ODR_AMOUNT());
		}
		return size;
	}
	public int setL2L_EDI_CONS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EDI_CONS_TYP == null) {
			l_EDI_CONS_TYP = new ArrayList();
		} else {
			l_EDI_CONS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EDI_CONS_TYP.add(((AE0080010Struct) list.get(i)).getEDI_CONS_TYP());
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
			l_PUCH_ODR_PERSON.add(((AE0080010Struct) list.get(i)).getPUCH_ODR_PERSON());
		}
		return size;
	}
	public int setL2L_ITEM_SPEC(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_SPEC == null) {
			l_ITEM_SPEC = new ArrayList();
		} else {
			l_ITEM_SPEC.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_SPEC.add(((AE0080010Struct) list.get(i)).getITEM_SPEC());
		}
		return size;
	}
	public int setL2L_ITEM_DRAW_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_DRAW_TYP == null) {
			l_ITEM_DRAW_TYP = new ArrayList();
		} else {
			l_ITEM_DRAW_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_DRAW_TYP.add(((AE0080010Struct) list.get(i)).getITEM_DRAW_TYP());
		}
		return size;
	}
	public int setL2L_ITEM_VERSION(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_VERSION == null) {
			l_ITEM_VERSION = new ArrayList();
		} else {
			l_ITEM_VERSION.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_VERSION.add(((AE0080010Struct) list.get(i)).getITEM_VERSION());
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
			l_ITEM_NAME.add(((AE0080010Struct) list.get(i)).getITEM_NAME());
		}
		return size;
	}
	public int setL2L_VEND_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_ITEM_CD == null) {
			l_VEND_ITEM_CD = new ArrayList();
		} else {
			l_VEND_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_ITEM_CD.add(((AE0080010Struct) list.get(i)).getVEND_ITEM_CD());
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
			l_ITEM_CD.add(((AE0080010Struct) list.get(i)).getITEM_CD());
		}
		return size;
	}
	public int setL2L_ITEM_DRAW_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_DRAW_QTY == null) {
			l_ITEM_DRAW_QTY = new ArrayList();
		} else {
			l_ITEM_DRAW_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_DRAW_QTY.add(((AE0080010Struct) list.get(i)).getITEM_DRAW_QTY());
		}
		return size;
	}
	public int setL2L_ITEM_PKG_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_PKG_UNIT == null) {
			l_ITEM_PKG_UNIT = new ArrayList();
		} else {
			l_ITEM_PKG_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_PKG_UNIT.add(((AE0080010Struct) list.get(i)).getITEM_PKG_UNIT());
		}
		return size;
	}
	public int setL2L_DIRECT_DLV_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DIRECT_DLV_TYP == null) {
			l_DIRECT_DLV_TYP = new ArrayList();
		} else {
			l_DIRECT_DLV_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DIRECT_DLV_TYP.add(((AE0080010Struct) list.get(i)).getDIRECT_DLV_TYP());
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
			l_WH_CD.add(((AE0080010Struct) list.get(i)).getWH_CD());
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
			l_ACPT_INSPC_TYP.add(((AE0080010Struct) list.get(i)).getACPT_INSPC_TYP());
		}
		return size;
	}
	public int setL2L_DLV_INST_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_INST_TYP == null) {
			l_DLV_INST_TYP = new ArrayList();
		} else {
			l_DLV_INST_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_INST_TYP.add(((AE0080010Struct) list.get(i)).getDLV_INST_TYP());
		}
		return size;
	}
	public int setL2L_DLV_DATE_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_DATE_1 == null) {
			l_DLV_DATE_1 = new ArrayList();
		} else {
			l_DLV_DATE_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_DATE_1.add(((AE0080010Struct) list.get(i)).getDLV_DATE_1());
		}
		return size;
	}
	public int setL2L_DLV_INST_QTY_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_INST_QTY_1 == null) {
			l_DLV_INST_QTY_1 = new ArrayList();
		} else {
			l_DLV_INST_QTY_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_INST_QTY_1.add(((AE0080010Struct) list.get(i)).getDLV_INST_QTY_1());
		}
		return size;
	}
	public int setL2L_DLV_INST_CD_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_INST_CD_1 == null) {
			l_DLV_INST_CD_1 = new ArrayList();
		} else {
			l_DLV_INST_CD_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_INST_CD_1.add(((AE0080010Struct) list.get(i)).getDLV_INST_CD_1());
		}
		return size;
	}
	public int setL2L_DLV_DATE_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_DATE_2 == null) {
			l_DLV_DATE_2 = new ArrayList();
		} else {
			l_DLV_DATE_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_DATE_2.add(((AE0080010Struct) list.get(i)).getDLV_DATE_2());
		}
		return size;
	}
	public int setL2L_DLV_INST_QTY_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_INST_QTY_2 == null) {
			l_DLV_INST_QTY_2 = new ArrayList();
		} else {
			l_DLV_INST_QTY_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_INST_QTY_2.add(((AE0080010Struct) list.get(i)).getDLV_INST_QTY_2());
		}
		return size;
	}
	public int setL2L_DLV_INST_CD_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_INST_CD_2 == null) {
			l_DLV_INST_CD_2 = new ArrayList();
		} else {
			l_DLV_INST_CD_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_INST_CD_2.add(((AE0080010Struct) list.get(i)).getDLV_INST_CD_2());
		}
		return size;
	}
	public int setL2L_DLV_DATE_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_DATE_3 == null) {
			l_DLV_DATE_3 = new ArrayList();
		} else {
			l_DLV_DATE_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_DATE_3.add(((AE0080010Struct) list.get(i)).getDLV_DATE_3());
		}
		return size;
	}
	public int setL2L_DLV_INST_QTY_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_INST_QTY_3 == null) {
			l_DLV_INST_QTY_3 = new ArrayList();
		} else {
			l_DLV_INST_QTY_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_INST_QTY_3.add(((AE0080010Struct) list.get(i)).getDLV_INST_QTY_3());
		}
		return size;
	}
	public int setL2L_DLV_INST_CD_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_INST_CD_3 == null) {
			l_DLV_INST_CD_3 = new ArrayList();
		} else {
			l_DLV_INST_CD_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_INST_CD_3.add(((AE0080010Struct) list.get(i)).getDLV_INST_CD_3());
		}
		return size;
	}
	public int setL2L_DLV_DATE_4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_DATE_4 == null) {
			l_DLV_DATE_4 = new ArrayList();
		} else {
			l_DLV_DATE_4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_DATE_4.add(((AE0080010Struct) list.get(i)).getDLV_DATE_4());
		}
		return size;
	}
	public int setL2L_DLV_INST_QTY_4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_INST_QTY_4 == null) {
			l_DLV_INST_QTY_4 = new ArrayList();
		} else {
			l_DLV_INST_QTY_4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_INST_QTY_4.add(((AE0080010Struct) list.get(i)).getDLV_INST_QTY_4());
		}
		return size;
	}
	public int setL2L_DLV_INST_CD_4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_INST_CD_4 == null) {
			l_DLV_INST_CD_4 = new ArrayList();
		} else {
			l_DLV_INST_CD_4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_INST_CD_4.add(((AE0080010Struct) list.get(i)).getDLV_INST_CD_4());
		}
		return size;
	}
	public int setL2L_DLV_DATE_5(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_DATE_5 == null) {
			l_DLV_DATE_5 = new ArrayList();
		} else {
			l_DLV_DATE_5.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_DATE_5.add(((AE0080010Struct) list.get(i)).getDLV_DATE_5());
		}
		return size;
	}
	public int setL2L_DLV_INST_QTY_5(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_INST_QTY_5 == null) {
			l_DLV_INST_QTY_5 = new ArrayList();
		} else {
			l_DLV_INST_QTY_5.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_INST_QTY_5.add(((AE0080010Struct) list.get(i)).getDLV_INST_QTY_5());
		}
		return size;
	}
	public int setL2L_DLV_INST_CD_5(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_INST_CD_5 == null) {
			l_DLV_INST_CD_5 = new ArrayList();
		} else {
			l_DLV_INST_CD_5.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_INST_CD_5.add(((AE0080010Struct) list.get(i)).getDLV_INST_CD_5());
		}
		return size;
	}
	public int setL2L_FREE_COLUMN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FREE_COLUMN == null) {
			l_FREE_COLUMN = new ArrayList();
		} else {
			l_FREE_COLUMN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FREE_COLUMN.add(((AE0080010Struct) list.get(i)).getFREE_COLUMN());
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
			l_PUCH_ODR_COMMENT.add(((AE0080010Struct) list.get(i)).getPUCH_ODR_COMMENT());
		}
		return size;
	}
	public int setL2L_INCLUDING_TAX_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INCLUDING_TAX_TYP == null) {
			l_INCLUDING_TAX_TYP = new ArrayList();
		} else {
			l_INCLUDING_TAX_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INCLUDING_TAX_TYP.add(((AE0080010Struct) list.get(i)).getINCLUDING_TAX_TYP());
		}
		return size;
	}
	public int setL2L_TAX_RELATION_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_RELATION_TYP == null) {
			l_TAX_RELATION_TYP = new ArrayList();
		} else {
			l_TAX_RELATION_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_RELATION_TYP.add(((AE0080010Struct) list.get(i)).getTAX_RELATION_TYP());
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
			l_TAX_AMOUNT.add(((AE0080010Struct) list.get(i)).getTAX_AMOUNT());
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
			l_NET_AMOUNT.add(((AE0080010Struct) list.get(i)).getNET_AMOUNT());
		}
		return size;
	}
	public int setL2L_RESERVE_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RESERVE_CD == null) {
			l_RESERVE_CD = new ArrayList();
		} else {
			l_RESERVE_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RESERVE_CD.add(((AE0080010Struct) list.get(i)).getRESERVE_CD());
		}
		return size;
	}
	public int setL2L_COST_PLAN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COST_PLAN_CD == null) {
			l_COST_PLAN_CD = new ArrayList();
		} else {
			l_COST_PLAN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COST_PLAN_CD.add(((AE0080010Struct) list.get(i)).getCOST_PLAN_CD());
		}
		return size;
	}
	public int setL2L_STL_COND_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STL_COND_TYP == null) {
			l_STL_COND_TYP = new ArrayList();
		} else {
			l_STL_COND_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STL_COND_TYP.add(((AE0080010Struct) list.get(i)).getSTL_COND_TYP());
		}
		return size;
	}
	public int setL2L_END_USER_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_END_USER_NAME == null) {
			l_END_USER_NAME = new ArrayList();
		} else {
			l_END_USER_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_END_USER_NAME.add(((AE0080010Struct) list.get(i)).getEND_USER_NAME());
		}
		return size;
	}
	public int setL2L_DLV_ADDRESS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_ADDRESS_CD == null) {
			l_DLV_ADDRESS_CD = new ArrayList();
		} else {
			l_DLV_ADDRESS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_ADDRESS_CD.add(((AE0080010Struct) list.get(i)).getDLV_ADDRESS_CD());
		}
		return size;
	}
	public int setL2L_DLV_ADDRESS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_ADDRESS == null) {
			l_DLV_ADDRESS = new ArrayList();
		} else {
			l_DLV_ADDRESS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_ADDRESS.add(((AE0080010Struct) list.get(i)).getDLV_ADDRESS());
		}
		return size;
	}
	public int setL2L_DLV_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_NAME == null) {
			l_DLV_NAME = new ArrayList();
		} else {
			l_DLV_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_NAME.add(((AE0080010Struct) list.get(i)).getDLV_NAME());
		}
		return size;
	}
	public int setL2L_END_USER_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_END_USER_ITEM_NAME == null) {
			l_END_USER_ITEM_NAME = new ArrayList();
		} else {
			l_END_USER_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_END_USER_ITEM_NAME.add(((AE0080010Struct) list.get(i)).getEND_USER_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_END_USER_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_END_USER_ITEM_CD == null) {
			l_END_USER_ITEM_CD = new ArrayList();
		} else {
			l_END_USER_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_END_USER_ITEM_CD.add(((AE0080010Struct) list.get(i)).getEND_USER_ITEM_CD());
		}
		return size;
	}
	public int setL2L_END_USER_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_END_USER_ODR_CD == null) {
			l_END_USER_ODR_CD = new ArrayList();
		} else {
			l_END_USER_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_END_USER_ODR_CD.add(((AE0080010Struct) list.get(i)).getEND_USER_ODR_CD());
		}
		return size;
	}
	public int setL2L_MAKER_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MAKER_NAME == null) {
			l_MAKER_NAME = new ArrayList();
		} else {
			l_MAKER_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MAKER_NAME.add(((AE0080010Struct) list.get(i)).getMAKER_NAME());
		}
		return size;
	}
	public int setL2L_DLV_KEY_CD_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_KEY_CD_1 == null) {
			l_DLV_KEY_CD_1 = new ArrayList();
		} else {
			l_DLV_KEY_CD_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_KEY_CD_1.add(((AE0080010Struct) list.get(i)).getDLV_KEY_CD_1());
		}
		return size;
	}
	public int setL2L_DLV_KEY_CD_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_KEY_CD_2 == null) {
			l_DLV_KEY_CD_2 = new ArrayList();
		} else {
			l_DLV_KEY_CD_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_KEY_CD_2.add(((AE0080010Struct) list.get(i)).getDLV_KEY_CD_2());
		}
		return size;
	}
	public int setL2L_DLV_KEY_CD_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_KEY_CD_3 == null) {
			l_DLV_KEY_CD_3 = new ArrayList();
		} else {
			l_DLV_KEY_CD_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_KEY_CD_3.add(((AE0080010Struct) list.get(i)).getDLV_KEY_CD_3());
		}
		return size;
	}
	public int setL2L_DLV_KEY_CD_4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_KEY_CD_4 == null) {
			l_DLV_KEY_CD_4 = new ArrayList();
		} else {
			l_DLV_KEY_CD_4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_KEY_CD_4.add(((AE0080010Struct) list.get(i)).getDLV_KEY_CD_4());
		}
		return size;
	}
	public int setL2L_DLV_KEY_CD_5(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_KEY_CD_5 == null) {
			l_DLV_KEY_CD_5 = new ArrayList();
		} else {
			l_DLV_KEY_CD_5.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_KEY_CD_5.add(((AE0080010Struct) list.get(i)).getDLV_KEY_CD_5());
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
			l_WH_NAME.add(((AE0080010Struct) list.get(i)).getWH_NAME());
		}
		return size;
	}
	public int setL2L_PUCH_BCODE_INF(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_BCODE_INF == null) {
			l_PUCH_BCODE_INF = new ArrayList();
		} else {
			l_PUCH_BCODE_INF.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_BCODE_INF.add(((AE0080010Struct) list.get(i)).getPUCH_BCODE_INF());
		}
		return size;
	}
	public int setL2L_PUCH_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_COMMENT == null) {
			l_PUCH_COMMENT = new ArrayList();
		} else {
			l_PUCH_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_COMMENT.add(((AE0080010Struct) list.get(i)).getPUCH_COMMENT());
		}
		return size;
	}
	public int setL2L_CONTRACT_COND_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CONTRACT_COND_TYP == null) {
			l_CONTRACT_COND_TYP = new ArrayList();
		} else {
			l_CONTRACT_COND_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CONTRACT_COND_TYP.add(((AE0080010Struct) list.get(i)).getCONTRACT_COND_TYP());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_SHAP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_SHAP_TYP == null) {
			l_PUCH_ODR_SHAP_TYP = new ArrayList();
		} else {
			l_PUCH_ODR_SHAP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_SHAP_TYP.add(((AE0080010Struct) list.get(i)).getPUCH_ODR_SHAP_TYP());
		}
		return size;
	}
	public int setL2L_OWNER_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OWNER_ODR_CD == null) {
			l_OWNER_ODR_CD = new ArrayList();
		} else {
			l_OWNER_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OWNER_ODR_CD.add(((AE0080010Struct) list.get(i)).getOWNER_ODR_CD());
		}
		return size;
	}
	public int setL2L_QTY_CONTRACT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_QTY_CONTRACT_TYP == null) {
			l_QTY_CONTRACT_TYP = new ArrayList();
		} else {
			l_QTY_CONTRACT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_QTY_CONTRACT_TYP.add(((AE0080010Struct) list.get(i)).getQTY_CONTRACT_TYP());
		}
		return size;
	}
	public int setL2L_ODR_MODIFY_TYP_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_MODIFY_TYP_1 == null) {
			l_ODR_MODIFY_TYP_1 = new ArrayList();
		} else {
			l_ODR_MODIFY_TYP_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_MODIFY_TYP_1.add(((AE0080010Struct) list.get(i)).getODR_MODIFY_TYP_1());
		}
		return size;
	}
	public int setL2L_ODR_MODIFY_TYP_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_MODIFY_TYP_2 == null) {
			l_ODR_MODIFY_TYP_2 = new ArrayList();
		} else {
			l_ODR_MODIFY_TYP_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_MODIFY_TYP_2.add(((AE0080010Struct) list.get(i)).getODR_MODIFY_TYP_2());
		}
		return size;
	}
	public int setL2L_ODR_MODIFY_TYP_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_MODIFY_TYP_3 == null) {
			l_ODR_MODIFY_TYP_3 = new ArrayList();
		} else {
			l_ODR_MODIFY_TYP_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_MODIFY_TYP_3.add(((AE0080010Struct) list.get(i)).getODR_MODIFY_TYP_3());
		}
		return size;
	}
	public int setL2L_MACHINE_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MACHINE_CD == null) {
			l_MACHINE_CD = new ArrayList();
		} else {
			l_MACHINE_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MACHINE_CD.add(((AE0080010Struct) list.get(i)).getMACHINE_CD());
		}
		return size;
	}
	public int setL2L_ENGINNERING_CHG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ENGINNERING_CHG_CD == null) {
			l_ENGINNERING_CHG_CD = new ArrayList();
		} else {
			l_ENGINNERING_CHG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ENGINNERING_CHG_CD.add(((AE0080010Struct) list.get(i)).getENGINNERING_CHG_CD());
		}
		return size;
	}
	public int setL2L_ITEM_DRAW_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_DRAW_CD == null) {
			l_ITEM_DRAW_CD = new ArrayList();
		} else {
			l_ITEM_DRAW_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_DRAW_CD.add(((AE0080010Struct) list.get(i)).getITEM_DRAW_CD());
		}
		return size;
	}
	public int setL2L_DLV_DOC_FORM_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_DOC_FORM_1 == null) {
			l_DLV_DOC_FORM_1 = new ArrayList();
		} else {
			l_DLV_DOC_FORM_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_DOC_FORM_1.add(((AE0080010Struct) list.get(i)).getDLV_DOC_FORM_1());
		}
		return size;
	}
	public int setL2L_DLV_DOC_COPY_NUM_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_DOC_COPY_NUM_1 == null) {
			l_DLV_DOC_COPY_NUM_1 = new ArrayList();
		} else {
			l_DLV_DOC_COPY_NUM_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_DOC_COPY_NUM_1.add(((AE0080010Struct) list.get(i)).getDLV_DOC_COPY_NUM_1());
		}
		return size;
	}
	public int setL2L_DLV_DOC_LANG_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_DOC_LANG_1 == null) {
			l_DLV_DOC_LANG_1 = new ArrayList();
		} else {
			l_DLV_DOC_LANG_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_DOC_LANG_1.add(((AE0080010Struct) list.get(i)).getDLV_DOC_LANG_1());
		}
		return size;
	}
	public int setL2L_DLV_DOC_FORM_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_DOC_FORM_2 == null) {
			l_DLV_DOC_FORM_2 = new ArrayList();
		} else {
			l_DLV_DOC_FORM_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_DOC_FORM_2.add(((AE0080010Struct) list.get(i)).getDLV_DOC_FORM_2());
		}
		return size;
	}
	public int setL2L_DLV_DOC_COPY_NUM_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_DOC_COPY_NUM_2 == null) {
			l_DLV_DOC_COPY_NUM_2 = new ArrayList();
		} else {
			l_DLV_DOC_COPY_NUM_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_DOC_COPY_NUM_2.add(((AE0080010Struct) list.get(i)).getDLV_DOC_COPY_NUM_2());
		}
		return size;
	}
	public int setL2L_DLV_DOC_LANG_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_DOC_LANG_2 == null) {
			l_DLV_DOC_LANG_2 = new ArrayList();
		} else {
			l_DLV_DOC_LANG_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_DOC_LANG_2.add(((AE0080010Struct) list.get(i)).getDLV_DOC_LANG_2());
		}
		return size;
	}
	public int setL2L_DLV_DOC_FORM_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_DOC_FORM_3 == null) {
			l_DLV_DOC_FORM_3 = new ArrayList();
		} else {
			l_DLV_DOC_FORM_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_DOC_FORM_3.add(((AE0080010Struct) list.get(i)).getDLV_DOC_FORM_3());
		}
		return size;
	}
	public int setL2L_DLV_DOC_COPY_NUM_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_DOC_COPY_NUM_3 == null) {
			l_DLV_DOC_COPY_NUM_3 = new ArrayList();
		} else {
			l_DLV_DOC_COPY_NUM_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_DOC_COPY_NUM_3.add(((AE0080010Struct) list.get(i)).getDLV_DOC_COPY_NUM_3());
		}
		return size;
	}
	public int setL2L_DLV_DOC_LANG_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_DOC_LANG_3 == null) {
			l_DLV_DOC_LANG_3 = new ArrayList();
		} else {
			l_DLV_DOC_LANG_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_DOC_LANG_3.add(((AE0080010Struct) list.get(i)).getDLV_DOC_LANG_3());
		}
		return size;
	}
	public int setL2L_DLV_DOC_FORM_4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_DOC_FORM_4 == null) {
			l_DLV_DOC_FORM_4 = new ArrayList();
		} else {
			l_DLV_DOC_FORM_4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_DOC_FORM_4.add(((AE0080010Struct) list.get(i)).getDLV_DOC_FORM_4());
		}
		return size;
	}
	public int setL2L_DLV_DOC_COPY_NUM_4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_DOC_COPY_NUM_4 == null) {
			l_DLV_DOC_COPY_NUM_4 = new ArrayList();
		} else {
			l_DLV_DOC_COPY_NUM_4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_DOC_COPY_NUM_4.add(((AE0080010Struct) list.get(i)).getDLV_DOC_COPY_NUM_4());
		}
		return size;
	}
	public int setL2L_DLV_DOC_LANG_4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_DOC_LANG_4 == null) {
			l_DLV_DOC_LANG_4 = new ArrayList();
		} else {
			l_DLV_DOC_LANG_4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_DOC_LANG_4.add(((AE0080010Struct) list.get(i)).getDLV_DOC_LANG_4());
		}
		return size;
	}
	public int setL2L_STRATEGIC_GOODS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STRATEGIC_GOODS_TYP == null) {
			l_STRATEGIC_GOODS_TYP = new ArrayList();
		} else {
			l_STRATEGIC_GOODS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STRATEGIC_GOODS_TYP.add(((AE0080010Struct) list.get(i)).getSTRATEGIC_GOODS_TYP());
		}
		return size;
	}
	public int setL2L_ORGN_PLACE_CD_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ORGN_PLACE_CD_1 == null) {
			l_ORGN_PLACE_CD_1 = new ArrayList();
		} else {
			l_ORGN_PLACE_CD_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ORGN_PLACE_CD_1.add(((AE0080010Struct) list.get(i)).getORGN_PLACE_CD_1());
		}
		return size;
	}
	public int setL2L_ORGN_PLACE_CD_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ORGN_PLACE_CD_2 == null) {
			l_ORGN_PLACE_CD_2 = new ArrayList();
		} else {
			l_ORGN_PLACE_CD_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ORGN_PLACE_CD_2.add(((AE0080010Struct) list.get(i)).getORGN_PLACE_CD_2());
		}
		return size;
	}
	public int setL2L_ORGN_PLACE_CD_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ORGN_PLACE_CD_3 == null) {
			l_ORGN_PLACE_CD_3 = new ArrayList();
		} else {
			l_ORGN_PLACE_CD_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ORGN_PLACE_CD_3.add(((AE0080010Struct) list.get(i)).getORGN_PLACE_CD_3());
		}
		return size;
	}
	public int setL2L_ORGN_PLACE_CD_4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ORGN_PLACE_CD_4 == null) {
			l_ORGN_PLACE_CD_4 = new ArrayList();
		} else {
			l_ORGN_PLACE_CD_4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ORGN_PLACE_CD_4.add(((AE0080010Struct) list.get(i)).getORGN_PLACE_CD_4());
		}
		return size;
	}
	public int setL2L_ORGN_PLACE_CD_5(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ORGN_PLACE_CD_5 == null) {
			l_ORGN_PLACE_CD_5 = new ArrayList();
		} else {
			l_ORGN_PLACE_CD_5.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ORGN_PLACE_CD_5.add(((AE0080010Struct) list.get(i)).getORGN_PLACE_CD_5());
		}
		return size;
	}
	public int setL2L_DLV_TIME_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_TIME_1 == null) {
			l_DLV_TIME_1 = new ArrayList();
		} else {
			l_DLV_TIME_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_TIME_1.add(((AE0080010Struct) list.get(i)).getDLV_TIME_1());
		}
		return size;
	}
	public int setL2L_DLV_TIME_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_TIME_2 == null) {
			l_DLV_TIME_2 = new ArrayList();
		} else {
			l_DLV_TIME_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_TIME_2.add(((AE0080010Struct) list.get(i)).getDLV_TIME_2());
		}
		return size;
	}
	public int setL2L_DLV_TIME_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_TIME_3 == null) {
			l_DLV_TIME_3 = new ArrayList();
		} else {
			l_DLV_TIME_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_TIME_3.add(((AE0080010Struct) list.get(i)).getDLV_TIME_3());
		}
		return size;
	}
	public int setL2L_DLV_TIME_4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_TIME_4 == null) {
			l_DLV_TIME_4 = new ArrayList();
		} else {
			l_DLV_TIME_4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_TIME_4.add(((AE0080010Struct) list.get(i)).getDLV_TIME_4());
		}
		return size;
	}
	public int setL2L_DLV_TIME_5(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_TIME_5 == null) {
			l_DLV_TIME_5 = new ArrayList();
		} else {
			l_DLV_TIME_5.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_TIME_5.add(((AE0080010Struct) list.get(i)).getDLV_TIME_5());
		}
		return size;
	}
	public int setL2L_PACKAGE_DLV_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PACKAGE_DLV_CD == null) {
			l_PACKAGE_DLV_CD = new ArrayList();
		} else {
			l_PACKAGE_DLV_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PACKAGE_DLV_CD.add(((AE0080010Struct) list.get(i)).getPACKAGE_DLV_CD());
		}
		return size;
	}
	public int setL2L_ODR_ITEM_SPEC(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_ITEM_SPEC == null) {
			l_ODR_ITEM_SPEC = new ArrayList();
		} else {
			l_ODR_ITEM_SPEC.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_ITEM_SPEC.add(((AE0080010Struct) list.get(i)).getODR_ITEM_SPEC());
		}
		return size;
	}
	public int setL2L_ODR_ORG_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_ORG_NAME == null) {
			l_ODR_ORG_NAME = new ArrayList();
		} else {
			l_ODR_ORG_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_ORG_NAME.add(((AE0080010Struct) list.get(i)).getODR_ORG_NAME());
		}
		return size;
	}
	public int setL2L_DLV_PART_LEN_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_PART_LEN_1 == null) {
			l_DLV_PART_LEN_1 = new ArrayList();
		} else {
			l_DLV_PART_LEN_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_PART_LEN_1.add(((AE0080010Struct) list.get(i)).getDLV_PART_LEN_1());
		}
		return size;
	}
	public int setL2L_DLV_PART_QTY_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_PART_QTY_1 == null) {
			l_DLV_PART_QTY_1 = new ArrayList();
		} else {
			l_DLV_PART_QTY_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_PART_QTY_1.add(((AE0080010Struct) list.get(i)).getDLV_PART_QTY_1());
		}
		return size;
	}
	public int setL2L_DLV_PART_LEN_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_PART_LEN_2 == null) {
			l_DLV_PART_LEN_2 = new ArrayList();
		} else {
			l_DLV_PART_LEN_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_PART_LEN_2.add(((AE0080010Struct) list.get(i)).getDLV_PART_LEN_2());
		}
		return size;
	}
	public int setL2L_DLV_PART_QTY_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_PART_QTY_2 == null) {
			l_DLV_PART_QTY_2 = new ArrayList();
		} else {
			l_DLV_PART_QTY_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_PART_QTY_2.add(((AE0080010Struct) list.get(i)).getDLV_PART_QTY_2());
		}
		return size;
	}
	public int setL2L_DLV_PART_LEN_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_PART_LEN_3 == null) {
			l_DLV_PART_LEN_3 = new ArrayList();
		} else {
			l_DLV_PART_LEN_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_PART_LEN_3.add(((AE0080010Struct) list.get(i)).getDLV_PART_LEN_3());
		}
		return size;
	}
	public int setL2L_DLV_PART_QTY_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_PART_QTY_3 == null) {
			l_DLV_PART_QTY_3 = new ArrayList();
		} else {
			l_DLV_PART_QTY_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_PART_QTY_3.add(((AE0080010Struct) list.get(i)).getDLV_PART_QTY_3());
		}
		return size;
	}
	public int setL2L_DLV_PART_LEN_4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_PART_LEN_4 == null) {
			l_DLV_PART_LEN_4 = new ArrayList();
		} else {
			l_DLV_PART_LEN_4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_PART_LEN_4.add(((AE0080010Struct) list.get(i)).getDLV_PART_LEN_4());
		}
		return size;
	}
	public int setL2L_DLV_PART_QTY_4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_PART_QTY_4 == null) {
			l_DLV_PART_QTY_4 = new ArrayList();
		} else {
			l_DLV_PART_QTY_4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_PART_QTY_4.add(((AE0080010Struct) list.get(i)).getDLV_PART_QTY_4());
		}
		return size;
	}
	public int setL2L_DLV_PART_LEN_5(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_PART_LEN_5 == null) {
			l_DLV_PART_LEN_5 = new ArrayList();
		} else {
			l_DLV_PART_LEN_5.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_PART_LEN_5.add(((AE0080010Struct) list.get(i)).getDLV_PART_LEN_5());
		}
		return size;
	}
	public int setL2L_DLV_PART_QTY_5(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_PART_QTY_5 == null) {
			l_DLV_PART_QTY_5 = new ArrayList();
		} else {
			l_DLV_PART_QTY_5.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_PART_QTY_5.add(((AE0080010Struct) list.get(i)).getDLV_PART_QTY_5());
		}
		return size;
	}
	public int setL2L_DLV_PART_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_PART_UNIT == null) {
			l_DLV_PART_UNIT = new ArrayList();
		} else {
			l_DLV_PART_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_PART_UNIT.add(((AE0080010Struct) list.get(i)).getDLV_PART_UNIT());
		}
		return size;
	}
	public int setL2L_CUST_CONSTRUCT_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_CONSTRUCT_NAME == null) {
			l_CUST_CONSTRUCT_NAME = new ArrayList();
		} else {
			l_CUST_CONSTRUCT_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_CONSTRUCT_NAME.add(((AE0080010Struct) list.get(i)).getCUST_CONSTRUCT_NAME());
		}
		return size;
	}
	public int setL2L_MATERIAL_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MATERIAL_CD == null) {
			l_MATERIAL_CD = new ArrayList();
		} else {
			l_MATERIAL_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MATERIAL_CD.add(((AE0080010Struct) list.get(i)).getMATERIAL_CD());
		}
		return size;
	}
	public int setL2L_MATERIAL_UNIT_PRICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MATERIAL_UNIT_PRICE == null) {
			l_MATERIAL_UNIT_PRICE = new ArrayList();
		} else {
			l_MATERIAL_UNIT_PRICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MATERIAL_UNIT_PRICE.add(((AE0080010Struct) list.get(i)).getMATERIAL_UNIT_PRICE());
		}
		return size;
	}
	public int setL2L_MATRRIAL_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MATRRIAL_UNIT == null) {
			l_MATRRIAL_UNIT = new ArrayList();
		} else {
			l_MATRRIAL_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MATRRIAL_UNIT.add(((AE0080010Struct) list.get(i)).getMATRRIAL_UNIT());
		}
		return size;
	}
	public int setL2L_TEST_REPORT_NEED_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TEST_REPORT_NEED_TYP == null) {
			l_TEST_REPORT_NEED_TYP = new ArrayList();
		} else {
			l_TEST_REPORT_NEED_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TEST_REPORT_NEED_TYP.add(((AE0080010Struct) list.get(i)).getTEST_REPORT_NEED_TYP());
		}
		return size;
	}
	public int setL2L_TEST_REPORT_CHK_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TEST_REPORT_CHK_TYP == null) {
			l_TEST_REPORT_CHK_TYP = new ArrayList();
		} else {
			l_TEST_REPORT_CHK_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TEST_REPORT_CHK_TYP.add(((AE0080010Struct) list.get(i)).getTEST_REPORT_CHK_TYP());
		}
		return size;
	}
	public int setL2L_TEST_REPORT_PRESENT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TEST_REPORT_PRESENT_TYP == null) {
			l_TEST_REPORT_PRESENT_TYP = new ArrayList();
		} else {
			l_TEST_REPORT_PRESENT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TEST_REPORT_PRESENT_TYP.add(((AE0080010Struct) list.get(i)).getTEST_REPORT_PRESENT_TYP());
		}
		return size;
	}
	public int setL2L_MUNICIPAL_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MUNICIPAL_CD == null) {
			l_MUNICIPAL_CD = new ArrayList();
		} else {
			l_MUNICIPAL_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MUNICIPAL_CD.add(((AE0080010Struct) list.get(i)).getMUNICIPAL_CD());
		}
		return size;
	}
	public int setL2L_DLV_CONTACT_TEL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_CONTACT_TEL == null) {
			l_DLV_CONTACT_TEL = new ArrayList();
		} else {
			l_DLV_CONTACT_TEL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_CONTACT_TEL.add(((AE0080010Struct) list.get(i)).getDLV_CONTACT_TEL());
		}
		return size;
	}
	public int setL2L_DLV_PRICE_OPEN_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_PRICE_OPEN_TYP == null) {
			l_DLV_PRICE_OPEN_TYP = new ArrayList();
		} else {
			l_DLV_PRICE_OPEN_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_PRICE_OPEN_TYP.add(((AE0080010Struct) list.get(i)).getDLV_PRICE_OPEN_TYP());
		}
		return size;
	}
	public int setL2L_ODR_STAFF_NAME_J(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_STAFF_NAME_J == null) {
			l_ODR_STAFF_NAME_J = new ArrayList();
		} else {
			l_ODR_STAFF_NAME_J.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_STAFF_NAME_J.add(((AE0080010Struct) list.get(i)).getODR_STAFF_NAME_J());
		}
		return size;
	}
	public int setL2L_ITEM_SPEC_NAME_J(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_SPEC_NAME_J == null) {
			l_ITEM_SPEC_NAME_J = new ArrayList();
		} else {
			l_ITEM_SPEC_NAME_J.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_SPEC_NAME_J.add(((AE0080010Struct) list.get(i)).getITEM_SPEC_NAME_J());
		}
		return size;
	}
	public int setL2L_ITEM_NAME_J(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_NAME_J == null) {
			l_ITEM_NAME_J = new ArrayList();
		} else {
			l_ITEM_NAME_J.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_NAME_J.add(((AE0080010Struct) list.get(i)).getITEM_NAME_J());
		}
		return size;
	}
	public int setL2L_COMMENT_J(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COMMENT_J == null) {
			l_COMMENT_J = new ArrayList();
		} else {
			l_COMMENT_J.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COMMENT_J.add(((AE0080010Struct) list.get(i)).getCOMMENT_J());
		}
		return size;
	}
	public int setL2L_END_USER_NAME_J(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_END_USER_NAME_J == null) {
			l_END_USER_NAME_J = new ArrayList();
		} else {
			l_END_USER_NAME_J.clear();
		}
		for (int i = 0; i < size; i++) {
			l_END_USER_NAME_J.add(((AE0080010Struct) list.get(i)).getEND_USER_NAME_J());
		}
		return size;
	}
	public int setL2L_DLV_ADDRESS_J(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_ADDRESS_J == null) {
			l_DLV_ADDRESS_J = new ArrayList();
		} else {
			l_DLV_ADDRESS_J.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_ADDRESS_J.add(((AE0080010Struct) list.get(i)).getDLV_ADDRESS_J());
		}
		return size;
	}
	public int setL2L_DLV_NAME_J(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_NAME_J == null) {
			l_DLV_NAME_J = new ArrayList();
		} else {
			l_DLV_NAME_J.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_NAME_J.add(((AE0080010Struct) list.get(i)).getDLV_NAME_J());
		}
		return size;
	}
	public int setL2L_END_USER_ITEM_NAME_J(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_END_USER_ITEM_NAME_J == null) {
			l_END_USER_ITEM_NAME_J = new ArrayList();
		} else {
			l_END_USER_ITEM_NAME_J.clear();
		}
		for (int i = 0; i < size; i++) {
			l_END_USER_ITEM_NAME_J.add(((AE0080010Struct) list.get(i)).getEND_USER_ITEM_NAME_J());
		}
		return size;
	}
	public int setL2L_MAKER_NAME_J(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MAKER_NAME_J == null) {
			l_MAKER_NAME_J = new ArrayList();
		} else {
			l_MAKER_NAME_J.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MAKER_NAME_J.add(((AE0080010Struct) list.get(i)).getMAKER_NAME_J());
		}
		return size;
	}
	public int setL2L_WH_NAME_J(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WH_NAME_J == null) {
			l_WH_NAME_J = new ArrayList();
		} else {
			l_WH_NAME_J.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WH_NAME_J.add(((AE0080010Struct) list.get(i)).getWH_NAME_J());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_COMMENT_J(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_COMMENT_J == null) {
			l_PUCH_ODR_COMMENT_J = new ArrayList();
		} else {
			l_PUCH_ODR_COMMENT_J.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_COMMENT_J.add(((AE0080010Struct) list.get(i)).getPUCH_ODR_COMMENT_J());
		}
		return size;
	}
	public int setL2L_MACHINE_NAME_J(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MACHINE_NAME_J == null) {
			l_MACHINE_NAME_J = new ArrayList();
		} else {
			l_MACHINE_NAME_J.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MACHINE_NAME_J.add(((AE0080010Struct) list.get(i)).getMACHINE_NAME_J());
		}
		return size;
	}
	public int setL2L_ODR_SPEC_J(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_SPEC_J == null) {
			l_ODR_SPEC_J = new ArrayList();
		} else {
			l_ODR_SPEC_J.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_SPEC_J.add(((AE0080010Struct) list.get(i)).getODR_SPEC_J());
		}
		return size;
	}
	public int setL2L_ODR_ORG_NAME_J(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_ORG_NAME_J == null) {
			l_ODR_ORG_NAME_J = new ArrayList();
		} else {
			l_ODR_ORG_NAME_J.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_ORG_NAME_J.add(((AE0080010Struct) list.get(i)).getODR_ORG_NAME_J());
		}
		return size;
	}
	public int setL2L_CUST_CONSTRUCT_NAME_J(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_CONSTRUCT_NAME_J == null) {
			l_CUST_CONSTRUCT_NAME_J = new ArrayList();
		} else {
			l_CUST_CONSTRUCT_NAME_J.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_CONSTRUCT_NAME_J.add(((AE0080010Struct) list.get(i)).getCUST_CONSTRUCT_NAME_J());
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
			l_CUR_CD.add(((AE0080010Struct) list.get(i)).getCUR_CD());
		}
		return size;
	}
	public int setL2L_UNIT_COST_FOREIGN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_COST_FOREIGN == null) {
			l_UNIT_COST_FOREIGN = new ArrayList();
		} else {
			l_UNIT_COST_FOREIGN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_COST_FOREIGN.add(((AE0080010Struct) list.get(i)).getUNIT_COST_FOREIGN());
		}
		return size;
	}
	public int setL2L_ODR_AMOUNT_FOREIGN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_AMOUNT_FOREIGN == null) {
			l_ODR_AMOUNT_FOREIGN = new ArrayList();
		} else {
			l_ODR_AMOUNT_FOREIGN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_AMOUNT_FOREIGN.add(((AE0080010Struct) list.get(i)).getODR_AMOUNT_FOREIGN());
		}
		return size;
	}
	public int setL2L_TAX_AMOUNT_FOREIGN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_AMOUNT_FOREIGN == null) {
			l_TAX_AMOUNT_FOREIGN = new ArrayList();
		} else {
			l_TAX_AMOUNT_FOREIGN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_AMOUNT_FOREIGN.add(((AE0080010Struct) list.get(i)).getTAX_AMOUNT_FOREIGN());
		}
		return size;
	}
	public int setL2L_NET_AMOUNT_FOREIGN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NET_AMOUNT_FOREIGN == null) {
			l_NET_AMOUNT_FOREIGN = new ArrayList();
		} else {
			l_NET_AMOUNT_FOREIGN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NET_AMOUNT_FOREIGN.add(((AE0080010Struct) list.get(i)).getNET_AMOUNT_FOREIGN());
		}
		return size;
	}
	public int setL2L_MATERIAL_UNIT_PRICE_FOREIGN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MATERIAL_UNIT_PRICE_FOREIGN == null) {
			l_MATERIAL_UNIT_PRICE_FOREIGN = new ArrayList();
		} else {
			l_MATERIAL_UNIT_PRICE_FOREIGN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MATERIAL_UNIT_PRICE_FOREIGN.add(((AE0080010Struct) list.get(i)).getMATERIAL_UNIT_PRICE_FOREIGN());
		}
		return size;
	}
	public int setL2L_BEFORE_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BEFORE_ODR_QTY == null) {
			l_BEFORE_ODR_QTY = new ArrayList();
		} else {
			l_BEFORE_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BEFORE_ODR_QTY.add(((AE0080010Struct) list.get(i)).getBEFORE_ODR_QTY());
		}
		return size;
	}
	public int setL2L_BEFORE_UNIT_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BEFORE_UNIT_COST == null) {
			l_BEFORE_UNIT_COST = new ArrayList();
		} else {
			l_BEFORE_UNIT_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BEFORE_UNIT_COST.add(((AE0080010Struct) list.get(i)).getBEFORE_UNIT_COST());
		}
		return size;
	}
	public int setL2L_BEFORE_UNIT_COST_FOREIGN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BEFORE_UNIT_COST_FOREIGN == null) {
			l_BEFORE_UNIT_COST_FOREIGN = new ArrayList();
		} else {
			l_BEFORE_UNIT_COST_FOREIGN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BEFORE_UNIT_COST_FOREIGN.add(((AE0080010Struct) list.get(i)).getBEFORE_UNIT_COST_FOREIGN());
		}
		return size;
	}
	public int setL2L_BEFORE_DLV_DATE_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BEFORE_DLV_DATE_1 == null) {
			l_BEFORE_DLV_DATE_1 = new ArrayList();
		} else {
			l_BEFORE_DLV_DATE_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BEFORE_DLV_DATE_1.add(((AE0080010Struct) list.get(i)).getBEFORE_DLV_DATE_1());
		}
		return size;
	}
	public int setL2L_BEFORE_DLV_QTY_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BEFORE_DLV_QTY_1 == null) {
			l_BEFORE_DLV_QTY_1 = new ArrayList();
		} else {
			l_BEFORE_DLV_QTY_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BEFORE_DLV_QTY_1.add(((AE0080010Struct) list.get(i)).getBEFORE_DLV_QTY_1());
		}
		return size;
	}
	public int setL2L_BEFORE_DLV_DATE_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BEFORE_DLV_DATE_2 == null) {
			l_BEFORE_DLV_DATE_2 = new ArrayList();
		} else {
			l_BEFORE_DLV_DATE_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BEFORE_DLV_DATE_2.add(((AE0080010Struct) list.get(i)).getBEFORE_DLV_DATE_2());
		}
		return size;
	}
	public int setL2L_BEFORE_DLV_QTY_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BEFORE_DLV_QTY_2 == null) {
			l_BEFORE_DLV_QTY_2 = new ArrayList();
		} else {
			l_BEFORE_DLV_QTY_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BEFORE_DLV_QTY_2.add(((AE0080010Struct) list.get(i)).getBEFORE_DLV_QTY_2());
		}
		return size;
	}
	public int setL2L_BEFORE_DLV_DATE_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BEFORE_DLV_DATE_3 == null) {
			l_BEFORE_DLV_DATE_3 = new ArrayList();
		} else {
			l_BEFORE_DLV_DATE_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BEFORE_DLV_DATE_3.add(((AE0080010Struct) list.get(i)).getBEFORE_DLV_DATE_3());
		}
		return size;
	}
	public int setL2L_BEFORE_DLV_QTY_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BEFORE_DLV_QTY_3 == null) {
			l_BEFORE_DLV_QTY_3 = new ArrayList();
		} else {
			l_BEFORE_DLV_QTY_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BEFORE_DLV_QTY_3.add(((AE0080010Struct) list.get(i)).getBEFORE_DLV_QTY_3());
		}
		return size;
	}
	public int setL2L_BEFORE_DLV_DATE_4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BEFORE_DLV_DATE_4 == null) {
			l_BEFORE_DLV_DATE_4 = new ArrayList();
		} else {
			l_BEFORE_DLV_DATE_4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BEFORE_DLV_DATE_4.add(((AE0080010Struct) list.get(i)).getBEFORE_DLV_DATE_4());
		}
		return size;
	}
	public int setL2L_BEFORE_DLV_QTY_4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BEFORE_DLV_QTY_4 == null) {
			l_BEFORE_DLV_QTY_4 = new ArrayList();
		} else {
			l_BEFORE_DLV_QTY_4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BEFORE_DLV_QTY_4.add(((AE0080010Struct) list.get(i)).getBEFORE_DLV_QTY_4());
		}
		return size;
	}
	public int setL2L_BEFORE_DLV_DATE_5(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BEFORE_DLV_DATE_5 == null) {
			l_BEFORE_DLV_DATE_5 = new ArrayList();
		} else {
			l_BEFORE_DLV_DATE_5.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BEFORE_DLV_DATE_5.add(((AE0080010Struct) list.get(i)).getBEFORE_DLV_DATE_5());
		}
		return size;
	}
	public int setL2L_BEFORE_DLV_QTY_5(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BEFORE_DLV_QTY_5 == null) {
			l_BEFORE_DLV_QTY_5 = new ArrayList();
		} else {
			l_BEFORE_DLV_QTY_5.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BEFORE_DLV_QTY_5.add(((AE0080010Struct) list.get(i)).getBEFORE_DLV_QTY_5());
		}
		return size;
	}
	public int setL2L_ODR_RETURN_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_RETURN_DATE == null) {
			l_ODR_RETURN_DATE = new ArrayList();
		} else {
			l_ODR_RETURN_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_RETURN_DATE.add(((AE0080010Struct) list.get(i)).getODR_RETURN_DATE());
		}
		return size;
	}
	public int setL2L_REJECT_RETURN_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_REJECT_RETURN_TYP == null) {
			l_REJECT_RETURN_TYP = new ArrayList();
		} else {
			l_REJECT_RETURN_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_REJECT_RETURN_TYP.add(((AE0080010Struct) list.get(i)).getREJECT_RETURN_TYP());
		}
		return size;
	}
	public int setL2L_EDI_ODR_ISS_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EDI_ODR_ISS_FLG == null) {
			l_EDI_ODR_ISS_FLG = new ArrayList();
		} else {
			l_EDI_ODR_ISS_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EDI_ODR_ISS_FLG.add(((AE0080010Struct) list.get(i)).getEDI_ODR_ISS_FLG());
		}
		return size;
	}
	public int setL2L_EDI_ODR_ISS_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EDI_ODR_ISS_DATE == null) {
			l_EDI_ODR_ISS_DATE = new ArrayList();
		} else {
			l_EDI_ODR_ISS_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EDI_ODR_ISS_DATE.add(((AE0080010Struct) list.get(i)).getEDI_ODR_ISS_DATE());
		}
		return size;
	}
	public int setL2L_l_PUCH_ODR_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PUCH_ODR_START_DATE == null) {
			l_l_PUCH_ODR_START_DATE = new ArrayList();
		} else {
			l_l_PUCH_ODR_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PUCH_ODR_START_DATE.add(((AE0080010Struct) list.get(i)).getl_PUCH_ODR_START_DATE());
		}
		return size;
	}
	public int setL2L_l_PUCH_ODR_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PUCH_ODR_DLV_DATE == null) {
			l_l_PUCH_ODR_DLV_DATE = new ArrayList();
		} else {
			l_l_PUCH_ODR_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PUCH_ODR_DLV_DATE.add(((AE0080010Struct) list.get(i)).getl_PUCH_ODR_DLV_DATE());
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
			l_l_VEND_CD.add(((AE0080010Struct) list.get(i)).getl_VEND_CD());
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
			l_l_VEND_ANAME.add(((AE0080010Struct) list.get(i)).getl_VEND_ANAME());
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
			l_l_ITEM_CD.add(((AE0080010Struct) list.get(i)).getl_ITEM_CD());
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
			l_l_ITEM_NAME.add(((AE0080010Struct) list.get(i)).getl_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_l_PUCH_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PUCH_ODR_QTY == null) {
			l_l_PUCH_ODR_QTY = new ArrayList();
		} else {
			l_l_PUCH_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PUCH_ODR_QTY.add(((AE0080010Struct) list.get(i)).getl_PUCH_ODR_QTY());
		}
		return size;
	}
	public int setL2L_l_STOCK_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_STOCK_UNIT == null) {
			l_l_STOCK_UNIT = new ArrayList();
		} else {
			l_l_STOCK_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_STOCK_UNIT.add(((AE0080010Struct) list.get(i)).getl_STOCK_UNIT());
		}
		return size;
	}
	public int setL2L_l_PUCH_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PUCH_ODR_CD == null) {
			l_l_PUCH_ODR_CD = new ArrayList();
		} else {
			l_l_PUCH_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PUCH_ODR_CD.add(((AE0080010Struct) list.get(i)).getl_PUCH_ODR_CD());
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
			l_l_JOB_ODR_CD.add(((AE0080010Struct) list.get(i)).getl_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_l_PUCH_ODR_EDI_ISS_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PUCH_ODR_EDI_ISS_DATE == null) {
			l_l_PUCH_ODR_EDI_ISS_DATE = new ArrayList();
		} else {
			l_l_PUCH_ODR_EDI_ISS_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PUCH_ODR_EDI_ISS_DATE.add(((AE0080010Struct) list.get(i)).getl_PUCH_ODR_EDI_ISS_DATE());
		}
		return size;
	}
	public int setL2L_l_BUSINESS_OPR_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_BUSINESS_OPR_DATE == null) {
			l_l_BUSINESS_OPR_DATE = new ArrayList();
		} else {
			l_l_BUSINESS_OPR_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_BUSINESS_OPR_DATE.add(((AE0080010Struct) list.get(i)).getl_BUSINESS_OPR_DATE());
		}
		return size;
	}
	public int setL2L_l_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_MODIFY_COUNT == null) {
			l_l_MODIFY_COUNT = new ArrayList();
		} else {
			l_l_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_MODIFY_COUNT.add(((AE0080010Struct) list.get(i)).getl_MODIFY_COUNT());
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
			l_PUCH_ODR_START_DATE.add(((AE0080010Struct) list.get(i)).getPUCH_ODR_START_DATE());
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
			l_PUCH_ODR_DLV_DATE.add(((AE0080010Struct) list.get(i)).getPUCH_ODR_DLV_DATE());
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
			l_PUCH_ODR_STS_TYP.add(((AE0080010Struct) list.get(i)).getPUCH_ODR_STS_TYP());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_EDI_ISS_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_EDI_ISS_FLG == null) {
			l_PUCH_ODR_EDI_ISS_FLG = new ArrayList();
		} else {
			l_PUCH_ODR_EDI_ISS_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_EDI_ISS_FLG.add(((AE0080010Struct) list.get(i)).getPUCH_ODR_EDI_ISS_FLG());
		}
		return size;
	}
	public int setL2L_Not_PUCH_ODR_EDI_ISS_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Not_PUCH_ODR_EDI_ISS_FLG == null) {
			l_Not_PUCH_ODR_EDI_ISS_FLG = new ArrayList();
		} else {
			l_Not_PUCH_ODR_EDI_ISS_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Not_PUCH_ODR_EDI_ISS_FLG.add(((AE0080010Struct) list.get(i)).getNot_PUCH_ODR_EDI_ISS_FLG());
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
			l_EXCH_RATE.add(((AE0080010Struct) list.get(i)).getEXCH_RATE());
		}
		return size;
	}
	public int setL2L_ODR_CANCEL_EDI_ISS_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_CANCEL_EDI_ISS_DATE == null) {
			l_ODR_CANCEL_EDI_ISS_DATE = new ArrayList();
		} else {
			l_ODR_CANCEL_EDI_ISS_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_CANCEL_EDI_ISS_DATE.add(((AE0080010Struct) list.get(i)).getODR_CANCEL_EDI_ISS_DATE());
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
			l_PLANT_NAME.add(((AE0080010Struct) list.get(i)).getPLANT_NAME());
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
			l_VEND_NAME.add(((AE0080010Struct) list.get(i)).getVEND_NAME());
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
			l_USER_NAME.add(((AE0080010Struct) list.get(i)).getUSER_NAME());
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
			l_MODIFY_COUNT.add(((AE0080010Struct) list.get(i)).getMODIFY_COUNT());
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
			l_BUSINESS_OPR_DATE.add(((AE0080010Struct) list.get(i)).getBUSINESS_OPR_DATE());
		}
		return size;
	}
	public int setL2L_l_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PLANT_CD == null) {
			l_l_PLANT_CD = new ArrayList();
		} else {
			l_l_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PLANT_CD.add(((AE0080010Struct) list.get(i)).getl_PLANT_CD());
		}
		return size;
	}
	public int setL2L_l_PUCH_ODR_SLIP_ISS_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PUCH_ODR_SLIP_ISS_DATE == null) {
			l_l_PUCH_ODR_SLIP_ISS_DATE = new ArrayList();
		} else {
			l_l_PUCH_ODR_SLIP_ISS_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PUCH_ODR_SLIP_ISS_DATE.add(((AE0080010Struct) list.get(i)).getl_PUCH_ODR_SLIP_ISS_DATE());
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
			l_l_ACPT_DATE.add(((AE0080010Struct) list.get(i)).getl_ACPT_DATE());
		}
		return size;
	}
	public int setL2L_l_ODR_CANCEL_SLIP_ISS_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ODR_CANCEL_SLIP_ISS_DATE == null) {
			l_l_ODR_CANCEL_SLIP_ISS_DATE = new ArrayList();
		} else {
			l_l_ODR_CANCEL_SLIP_ISS_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ODR_CANCEL_SLIP_ISS_DATE.add(((AE0080010Struct) list.get(i)).getl_ODR_CANCEL_SLIP_ISS_DATE());
		}
		return size;
	}
	public int setL2L_l_PUCH_ODR_PERSON(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PUCH_ODR_PERSON == null) {
			l_l_PUCH_ODR_PERSON = new ArrayList();
		} else {
			l_l_PUCH_ODR_PERSON.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PUCH_ODR_PERSON.add(((AE0080010Struct) list.get(i)).getl_PUCH_ODR_PERSON());
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
			l_l_USER_NAME.add(((AE0080010Struct) list.get(i)).getl_USER_NAME());
		}
		return size;
	}
	public int setL2L_l_ODR_CANCEL_CAUSE_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ODR_CANCEL_CAUSE_CD == null) {
			l_l_ODR_CANCEL_CAUSE_CD = new ArrayList();
		} else {
			l_l_ODR_CANCEL_CAUSE_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ODR_CANCEL_CAUSE_CD.add(((AE0080010Struct) list.get(i)).getl_ODR_CANCEL_CAUSE_CD());
		}
		return size;
	}
	public int setL2L_l_ACPT_RSLT_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ACPT_RSLT_COMMENT == null) {
			l_l_ACPT_RSLT_COMMENT = new ArrayList();
		} else {
			l_l_ACPT_RSLT_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ACPT_RSLT_COMMENT.add(((AE0080010Struct) list.get(i)).getl_ACPT_RSLT_COMMENT());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_START_DATE_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_START_DATE_FROM == null) {
			l_PUCH_ODR_START_DATE_FROM = new ArrayList();
		} else {
			l_PUCH_ODR_START_DATE_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_START_DATE_FROM.add(((AE0080010Struct) list.get(i)).getPUCH_ODR_START_DATE_FROM());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_START_DATE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_START_DATE_TO == null) {
			l_PUCH_ODR_START_DATE_TO = new ArrayList();
		} else {
			l_PUCH_ODR_START_DATE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_START_DATE_TO.add(((AE0080010Struct) list.get(i)).getPUCH_ODR_START_DATE_TO());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_DLV_DATE_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_DLV_DATE_FROM == null) {
			l_PUCH_ODR_DLV_DATE_FROM = new ArrayList();
		} else {
			l_PUCH_ODR_DLV_DATE_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_DLV_DATE_FROM.add(((AE0080010Struct) list.get(i)).getPUCH_ODR_DLV_DATE_FROM());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_DLV_DATE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_DLV_DATE_TO == null) {
			l_PUCH_ODR_DLV_DATE_TO = new ArrayList();
		} else {
			l_PUCH_ODR_DLV_DATE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_DLV_DATE_TO.add(((AE0080010Struct) list.get(i)).getPUCH_ODR_DLV_DATE_TO());
		}
		return size;
	}
	public int setL2L_ACPT_DATE_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACPT_DATE_FROM == null) {
			l_ACPT_DATE_FROM = new ArrayList();
		} else {
			l_ACPT_DATE_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACPT_DATE_FROM.add(((AE0080010Struct) list.get(i)).getACPT_DATE_FROM());
		}
		return size;
	}
	public int setL2L_ACPT_DATE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACPT_DATE_TO == null) {
			l_ACPT_DATE_TO = new ArrayList();
		} else {
			l_ACPT_DATE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACPT_DATE_TO.add(((AE0080010Struct) list.get(i)).getACPT_DATE_TO());
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
			l_l_COUNT.add(((AE0080010Struct) list.get(i)).getl_COUNT());
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
			l_ROW_COUNT.add(((AE0080010Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_ReOutputFlg = null;
		m_INFO_TYP_CD = null;
		m_COMPANY_CD = null;
		m_PUCH_ODR_CD = null;
		m_DATA_PROC_CD = null;
		m_DATA_CREATE_DATE = null;
		m_VEND_CD = null;
		m_PLANT_CD = null;
		m_JOB_ODR_CD = null;
		m_CRCT_TYP = null;
		m_COCK_TYP = null;
		m_PUCH_ODR_DATE = null;
		m_PUCH_ODR_UNIT = null;
		m_UNIT_COST = null;
		m_UNIT_COST_TYP = null;
		m_PUCH_ODR_QTY = null;
		m_PUCH_ODR_AMOUNT = null;
		m_EDI_CONS_TYP = null;
		m_PUCH_ODR_PERSON = null;
		m_ITEM_SPEC = null;
		m_ITEM_DRAW_TYP = null;
		m_ITEM_VERSION = null;
		m_ITEM_NAME = null;
		m_VEND_ITEM_CD = null;
		m_ITEM_CD = null;
		m_ITEM_DRAW_QTY = null;
		m_ITEM_PKG_UNIT = null;
		m_DIRECT_DLV_TYP = null;
		m_WH_CD = null;
		m_ACPT_INSPC_TYP = null;
		m_DLV_INST_TYP = null;
		m_DLV_DATE_1 = null;
		m_DLV_INST_QTY_1 = null;
		m_DLV_INST_CD_1 = null;
		m_DLV_DATE_2 = null;
		m_DLV_INST_QTY_2 = null;
		m_DLV_INST_CD_2 = null;
		m_DLV_DATE_3 = null;
		m_DLV_INST_QTY_3 = null;
		m_DLV_INST_CD_3 = null;
		m_DLV_DATE_4 = null;
		m_DLV_INST_QTY_4 = null;
		m_DLV_INST_CD_4 = null;
		m_DLV_DATE_5 = null;
		m_DLV_INST_QTY_5 = null;
		m_DLV_INST_CD_5 = null;
		m_FREE_COLUMN = null;
		m_PUCH_ODR_COMMENT = null;
		m_INCLUDING_TAX_TYP = null;
		m_TAX_RELATION_TYP = null;
		m_TAX_AMOUNT = null;
		m_NET_AMOUNT = null;
		m_RESERVE_CD = null;
		m_COST_PLAN_CD = null;
		m_STL_COND_TYP = null;
		m_END_USER_NAME = null;
		m_DLV_ADDRESS_CD = null;
		m_DLV_ADDRESS = null;
		m_DLV_NAME = null;
		m_END_USER_ITEM_NAME = null;
		m_END_USER_ITEM_CD = null;
		m_END_USER_ODR_CD = null;
		m_MAKER_NAME = null;
		m_DLV_KEY_CD_1 = null;
		m_DLV_KEY_CD_2 = null;
		m_DLV_KEY_CD_3 = null;
		m_DLV_KEY_CD_4 = null;
		m_DLV_KEY_CD_5 = null;
		m_WH_NAME = null;
		m_PUCH_BCODE_INF = null;
		m_PUCH_COMMENT = null;
		m_CONTRACT_COND_TYP = null;
		m_PUCH_ODR_SHAP_TYP = null;
		m_OWNER_ODR_CD = null;
		m_QTY_CONTRACT_TYP = null;
		m_ODR_MODIFY_TYP_1 = null;
		m_ODR_MODIFY_TYP_2 = null;
		m_ODR_MODIFY_TYP_3 = null;
		m_MACHINE_CD = null;
		m_ENGINNERING_CHG_CD = null;
		m_ITEM_DRAW_CD = null;
		m_DLV_DOC_FORM_1 = null;
		m_DLV_DOC_COPY_NUM_1 = null;
		m_DLV_DOC_LANG_1 = null;
		m_DLV_DOC_FORM_2 = null;
		m_DLV_DOC_COPY_NUM_2 = null;
		m_DLV_DOC_LANG_2 = null;
		m_DLV_DOC_FORM_3 = null;
		m_DLV_DOC_COPY_NUM_3 = null;
		m_DLV_DOC_LANG_3 = null;
		m_DLV_DOC_FORM_4 = null;
		m_DLV_DOC_COPY_NUM_4 = null;
		m_DLV_DOC_LANG_4 = null;
		m_STRATEGIC_GOODS_TYP = null;
		m_ORGN_PLACE_CD_1 = null;
		m_ORGN_PLACE_CD_2 = null;
		m_ORGN_PLACE_CD_3 = null;
		m_ORGN_PLACE_CD_4 = null;
		m_ORGN_PLACE_CD_5 = null;
		m_DLV_TIME_1 = null;
		m_DLV_TIME_2 = null;
		m_DLV_TIME_3 = null;
		m_DLV_TIME_4 = null;
		m_DLV_TIME_5 = null;
		m_PACKAGE_DLV_CD = null;
		m_ODR_ITEM_SPEC = null;
		m_ODR_ORG_NAME = null;
		m_DLV_PART_LEN_1 = null;
		m_DLV_PART_QTY_1 = null;
		m_DLV_PART_LEN_2 = null;
		m_DLV_PART_QTY_2 = null;
		m_DLV_PART_LEN_3 = null;
		m_DLV_PART_QTY_3 = null;
		m_DLV_PART_LEN_4 = null;
		m_DLV_PART_QTY_4 = null;
		m_DLV_PART_LEN_5 = null;
		m_DLV_PART_QTY_5 = null;
		m_DLV_PART_UNIT = null;
		m_CUST_CONSTRUCT_NAME = null;
		m_MATERIAL_CD = null;
		m_MATERIAL_UNIT_PRICE = null;
		m_MATRRIAL_UNIT = null;
		m_TEST_REPORT_NEED_TYP = null;
		m_TEST_REPORT_CHK_TYP = null;
		m_TEST_REPORT_PRESENT_TYP = null;
		m_MUNICIPAL_CD = null;
		m_DLV_CONTACT_TEL = null;
		m_DLV_PRICE_OPEN_TYP = null;
		m_ODR_STAFF_NAME_J = null;
		m_ITEM_SPEC_NAME_J = null;
		m_ITEM_NAME_J = null;
		m_COMMENT_J = null;
		m_END_USER_NAME_J = null;
		m_DLV_ADDRESS_J = null;
		m_DLV_NAME_J = null;
		m_END_USER_ITEM_NAME_J = null;
		m_MAKER_NAME_J = null;
		m_WH_NAME_J = null;
		m_PUCH_ODR_COMMENT_J = null;
		m_MACHINE_NAME_J = null;
		m_ODR_SPEC_J = null;
		m_ODR_ORG_NAME_J = null;
		m_CUST_CONSTRUCT_NAME_J = null;
		m_CUR_CD = null;
		m_UNIT_COST_FOREIGN = null;
		m_ODR_AMOUNT_FOREIGN = null;
		m_TAX_AMOUNT_FOREIGN = null;
		m_NET_AMOUNT_FOREIGN = null;
		m_MATERIAL_UNIT_PRICE_FOREIGN = null;
		m_BEFORE_ODR_QTY = null;
		m_BEFORE_UNIT_COST = null;
		m_BEFORE_UNIT_COST_FOREIGN = null;
		m_BEFORE_DLV_DATE_1 = null;
		m_BEFORE_DLV_QTY_1 = null;
		m_BEFORE_DLV_DATE_2 = null;
		m_BEFORE_DLV_QTY_2 = null;
		m_BEFORE_DLV_DATE_3 = null;
		m_BEFORE_DLV_QTY_3 = null;
		m_BEFORE_DLV_DATE_4 = null;
		m_BEFORE_DLV_QTY_4 = null;
		m_BEFORE_DLV_DATE_5 = null;
		m_BEFORE_DLV_QTY_5 = null;
		m_ODR_RETURN_DATE = null;
		m_REJECT_RETURN_TYP = null;
		m_EDI_ODR_ISS_FLG = null;
		m_EDI_ODR_ISS_DATE = null;
		m_l_PUCH_ODR_START_DATE = null;
		m_l_PUCH_ODR_DLV_DATE = null;
		m_l_VEND_CD = null;
		m_l_VEND_ANAME = null;
		m_l_ITEM_CD = null;
		m_l_ITEM_NAME = null;
		m_l_PUCH_ODR_QTY = null;
		m_l_STOCK_UNIT = null;
		m_l_PUCH_ODR_CD = null;
		m_l_JOB_ODR_CD = null;
		m_l_PUCH_ODR_EDI_ISS_DATE = null;
		m_l_BUSINESS_OPR_DATE = null;
		m_l_MODIFY_COUNT = null;
		m_PUCH_ODR_START_DATE = null;
		m_PUCH_ODR_DLV_DATE = null;
		m_PUCH_ODR_STS_TYP = null;
		m_PUCH_ODR_EDI_ISS_FLG = null;
		m_Not_PUCH_ODR_EDI_ISS_FLG = null;
		m_EXCH_RATE = null;
		m_ODR_CANCEL_EDI_ISS_DATE = null;
		m_PLANT_NAME = null;
		m_VEND_NAME = null;
		m_USER_NAME = null;
		m_MODIFY_COUNT = null;
		m_BUSINESS_OPR_DATE = null;
		m_l_PLANT_CD = null;
		m_l_PUCH_ODR_SLIP_ISS_DATE = null;
		m_l_ACPT_DATE = null;
		m_l_ODR_CANCEL_SLIP_ISS_DATE = null;
		m_l_PUCH_ODR_PERSON = null;
		m_l_USER_NAME = null;
		m_l_ODR_CANCEL_CAUSE_CD = null;
		m_l_ACPT_RSLT_COMMENT = null;
		m_PUCH_ODR_START_DATE_FROM = null;
		m_PUCH_ODR_START_DATE_TO = null;
		m_PUCH_ODR_DLV_DATE_FROM = null;
		m_PUCH_ODR_DLV_DATE_TO = null;
		m_ACPT_DATE_FROM = null;
		m_ACPT_DATE_TO = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;

		l_ReOutputFlg = null;
		l_INFO_TYP_CD = null;
		l_COMPANY_CD = null;
		l_PUCH_ODR_CD = null;
		l_DATA_PROC_CD = null;
		l_DATA_CREATE_DATE = null;
		l_VEND_CD = null;
		l_PLANT_CD = null;
		l_JOB_ODR_CD = null;
		l_CRCT_TYP = null;
		l_COCK_TYP = null;
		l_PUCH_ODR_DATE = null;
		l_PUCH_ODR_UNIT = null;
		l_UNIT_COST = null;
		l_UNIT_COST_TYP = null;
		l_PUCH_ODR_QTY = null;
		l_PUCH_ODR_AMOUNT = null;
		l_EDI_CONS_TYP = null;
		l_PUCH_ODR_PERSON = null;
		l_ITEM_SPEC = null;
		l_ITEM_DRAW_TYP = null;
		l_ITEM_VERSION = null;
		l_ITEM_NAME = null;
		l_VEND_ITEM_CD = null;
		l_ITEM_CD = null;
		l_ITEM_DRAW_QTY = null;
		l_ITEM_PKG_UNIT = null;
		l_DIRECT_DLV_TYP = null;
		l_WH_CD = null;
		l_ACPT_INSPC_TYP = null;
		l_DLV_INST_TYP = null;
		l_DLV_DATE_1 = null;
		l_DLV_INST_QTY_1 = null;
		l_DLV_INST_CD_1 = null;
		l_DLV_DATE_2 = null;
		l_DLV_INST_QTY_2 = null;
		l_DLV_INST_CD_2 = null;
		l_DLV_DATE_3 = null;
		l_DLV_INST_QTY_3 = null;
		l_DLV_INST_CD_3 = null;
		l_DLV_DATE_4 = null;
		l_DLV_INST_QTY_4 = null;
		l_DLV_INST_CD_4 = null;
		l_DLV_DATE_5 = null;
		l_DLV_INST_QTY_5 = null;
		l_DLV_INST_CD_5 = null;
		l_FREE_COLUMN = null;
		l_PUCH_ODR_COMMENT = null;
		l_INCLUDING_TAX_TYP = null;
		l_TAX_RELATION_TYP = null;
		l_TAX_AMOUNT = null;
		l_NET_AMOUNT = null;
		l_RESERVE_CD = null;
		l_COST_PLAN_CD = null;
		l_STL_COND_TYP = null;
		l_END_USER_NAME = null;
		l_DLV_ADDRESS_CD = null;
		l_DLV_ADDRESS = null;
		l_DLV_NAME = null;
		l_END_USER_ITEM_NAME = null;
		l_END_USER_ITEM_CD = null;
		l_END_USER_ODR_CD = null;
		l_MAKER_NAME = null;
		l_DLV_KEY_CD_1 = null;
		l_DLV_KEY_CD_2 = null;
		l_DLV_KEY_CD_3 = null;
		l_DLV_KEY_CD_4 = null;
		l_DLV_KEY_CD_5 = null;
		l_WH_NAME = null;
		l_PUCH_BCODE_INF = null;
		l_PUCH_COMMENT = null;
		l_CONTRACT_COND_TYP = null;
		l_PUCH_ODR_SHAP_TYP = null;
		l_OWNER_ODR_CD = null;
		l_QTY_CONTRACT_TYP = null;
		l_ODR_MODIFY_TYP_1 = null;
		l_ODR_MODIFY_TYP_2 = null;
		l_ODR_MODIFY_TYP_3 = null;
		l_MACHINE_CD = null;
		l_ENGINNERING_CHG_CD = null;
		l_ITEM_DRAW_CD = null;
		l_DLV_DOC_FORM_1 = null;
		l_DLV_DOC_COPY_NUM_1 = null;
		l_DLV_DOC_LANG_1 = null;
		l_DLV_DOC_FORM_2 = null;
		l_DLV_DOC_COPY_NUM_2 = null;
		l_DLV_DOC_LANG_2 = null;
		l_DLV_DOC_FORM_3 = null;
		l_DLV_DOC_COPY_NUM_3 = null;
		l_DLV_DOC_LANG_3 = null;
		l_DLV_DOC_FORM_4 = null;
		l_DLV_DOC_COPY_NUM_4 = null;
		l_DLV_DOC_LANG_4 = null;
		l_STRATEGIC_GOODS_TYP = null;
		l_ORGN_PLACE_CD_1 = null;
		l_ORGN_PLACE_CD_2 = null;
		l_ORGN_PLACE_CD_3 = null;
		l_ORGN_PLACE_CD_4 = null;
		l_ORGN_PLACE_CD_5 = null;
		l_DLV_TIME_1 = null;
		l_DLV_TIME_2 = null;
		l_DLV_TIME_3 = null;
		l_DLV_TIME_4 = null;
		l_DLV_TIME_5 = null;
		l_PACKAGE_DLV_CD = null;
		l_ODR_ITEM_SPEC = null;
		l_ODR_ORG_NAME = null;
		l_DLV_PART_LEN_1 = null;
		l_DLV_PART_QTY_1 = null;
		l_DLV_PART_LEN_2 = null;
		l_DLV_PART_QTY_2 = null;
		l_DLV_PART_LEN_3 = null;
		l_DLV_PART_QTY_3 = null;
		l_DLV_PART_LEN_4 = null;
		l_DLV_PART_QTY_4 = null;
		l_DLV_PART_LEN_5 = null;
		l_DLV_PART_QTY_5 = null;
		l_DLV_PART_UNIT = null;
		l_CUST_CONSTRUCT_NAME = null;
		l_MATERIAL_CD = null;
		l_MATERIAL_UNIT_PRICE = null;
		l_MATRRIAL_UNIT = null;
		l_TEST_REPORT_NEED_TYP = null;
		l_TEST_REPORT_CHK_TYP = null;
		l_TEST_REPORT_PRESENT_TYP = null;
		l_MUNICIPAL_CD = null;
		l_DLV_CONTACT_TEL = null;
		l_DLV_PRICE_OPEN_TYP = null;
		l_ODR_STAFF_NAME_J = null;
		l_ITEM_SPEC_NAME_J = null;
		l_ITEM_NAME_J = null;
		l_COMMENT_J = null;
		l_END_USER_NAME_J = null;
		l_DLV_ADDRESS_J = null;
		l_DLV_NAME_J = null;
		l_END_USER_ITEM_NAME_J = null;
		l_MAKER_NAME_J = null;
		l_WH_NAME_J = null;
		l_PUCH_ODR_COMMENT_J = null;
		l_MACHINE_NAME_J = null;
		l_ODR_SPEC_J = null;
		l_ODR_ORG_NAME_J = null;
		l_CUST_CONSTRUCT_NAME_J = null;
		l_CUR_CD = null;
		l_UNIT_COST_FOREIGN = null;
		l_ODR_AMOUNT_FOREIGN = null;
		l_TAX_AMOUNT_FOREIGN = null;
		l_NET_AMOUNT_FOREIGN = null;
		l_MATERIAL_UNIT_PRICE_FOREIGN = null;
		l_BEFORE_ODR_QTY = null;
		l_BEFORE_UNIT_COST = null;
		l_BEFORE_UNIT_COST_FOREIGN = null;
		l_BEFORE_DLV_DATE_1 = null;
		l_BEFORE_DLV_QTY_1 = null;
		l_BEFORE_DLV_DATE_2 = null;
		l_BEFORE_DLV_QTY_2 = null;
		l_BEFORE_DLV_DATE_3 = null;
		l_BEFORE_DLV_QTY_3 = null;
		l_BEFORE_DLV_DATE_4 = null;
		l_BEFORE_DLV_QTY_4 = null;
		l_BEFORE_DLV_DATE_5 = null;
		l_BEFORE_DLV_QTY_5 = null;
		l_ODR_RETURN_DATE = null;
		l_REJECT_RETURN_TYP = null;
		l_EDI_ODR_ISS_FLG = null;
		l_EDI_ODR_ISS_DATE = null;
		l_l_PUCH_ODR_START_DATE = null;
		l_l_PUCH_ODR_DLV_DATE = null;
		l_l_VEND_CD = null;
		l_l_VEND_ANAME = null;
		l_l_ITEM_CD = null;
		l_l_ITEM_NAME = null;
		l_l_PUCH_ODR_QTY = null;
		l_l_STOCK_UNIT = null;
		l_l_PUCH_ODR_CD = null;
		l_l_JOB_ODR_CD = null;
		l_l_PUCH_ODR_EDI_ISS_DATE = null;
		l_l_BUSINESS_OPR_DATE = null;
		l_l_MODIFY_COUNT = null;
		l_PUCH_ODR_START_DATE = null;
		l_PUCH_ODR_DLV_DATE = null;
		l_PUCH_ODR_STS_TYP = null;
		l_PUCH_ODR_EDI_ISS_FLG = null;
		l_Not_PUCH_ODR_EDI_ISS_FLG = null;
		l_EXCH_RATE = null;
		l_ODR_CANCEL_EDI_ISS_DATE = null;
		l_PLANT_NAME = null;
		l_VEND_NAME = null;
		l_USER_NAME = null;
		l_MODIFY_COUNT = null;
		l_BUSINESS_OPR_DATE = null;
		l_l_PLANT_CD = null;
		l_l_PUCH_ODR_SLIP_ISS_DATE = null;
		l_l_ACPT_DATE = null;
		l_l_ODR_CANCEL_SLIP_ISS_DATE = null;
		l_l_PUCH_ODR_PERSON = null;
		l_l_USER_NAME = null;
		l_l_ODR_CANCEL_CAUSE_CD = null;
		l_l_ACPT_RSLT_COMMENT = null;
		l_PUCH_ODR_START_DATE_FROM = null;
		l_PUCH_ODR_START_DATE_TO = null;
		l_PUCH_ODR_DLV_DATE_FROM = null;
		l_PUCH_ODR_DLV_DATE_TO = null;
		l_ACPT_DATE_FROM = null;
		l_ACPT_DATE_TO = null;
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
	 * medAE0080010クラスの標準コンストラクタ
	 */
	public AE0080010Struct()
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
	public void setStruct(AE0080010Struct struct)
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
	public void setStructM(AE0080010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setReOutputFlg(struct.getReOutputFlg());
			this.setINFO_TYP_CD(struct.getINFO_TYP_CD());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());
			this.setDATA_PROC_CD(struct.getDATA_PROC_CD());
			this.setDATA_CREATE_DATE(struct.getDATA_CREATE_DATE());
			this.setVEND_CD(struct.getVEND_CD());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setCRCT_TYP(struct.getCRCT_TYP());
			this.setCOCK_TYP(struct.getCOCK_TYP());
			this.setPUCH_ODR_DATE(struct.getPUCH_ODR_DATE());
			this.setPUCH_ODR_UNIT(struct.getPUCH_ODR_UNIT());
			this.setUNIT_COST(struct.getUNIT_COST());
			this.setUNIT_COST_TYP(struct.getUNIT_COST_TYP());
			this.setPUCH_ODR_QTY(struct.getPUCH_ODR_QTY());
			this.setPUCH_ODR_AMOUNT(struct.getPUCH_ODR_AMOUNT());
			this.setEDI_CONS_TYP(struct.getEDI_CONS_TYP());
			this.setPUCH_ODR_PERSON(struct.getPUCH_ODR_PERSON());
			this.setITEM_SPEC(struct.getITEM_SPEC());
			this.setITEM_DRAW_TYP(struct.getITEM_DRAW_TYP());
			this.setITEM_VERSION(struct.getITEM_VERSION());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setVEND_ITEM_CD(struct.getVEND_ITEM_CD());
			this.setITEM_CD(struct.getITEM_CD());
			this.setITEM_DRAW_QTY(struct.getITEM_DRAW_QTY());
			this.setITEM_PKG_UNIT(struct.getITEM_PKG_UNIT());
			this.setDIRECT_DLV_TYP(struct.getDIRECT_DLV_TYP());
			this.setWH_CD(struct.getWH_CD());
			this.setACPT_INSPC_TYP(struct.getACPT_INSPC_TYP());
			this.setDLV_INST_TYP(struct.getDLV_INST_TYP());
			this.setDLV_DATE_1(struct.getDLV_DATE_1());
			this.setDLV_INST_QTY_1(struct.getDLV_INST_QTY_1());
			this.setDLV_INST_CD_1(struct.getDLV_INST_CD_1());
			this.setDLV_DATE_2(struct.getDLV_DATE_2());
			this.setDLV_INST_QTY_2(struct.getDLV_INST_QTY_2());
			this.setDLV_INST_CD_2(struct.getDLV_INST_CD_2());
			this.setDLV_DATE_3(struct.getDLV_DATE_3());
			this.setDLV_INST_QTY_3(struct.getDLV_INST_QTY_3());
			this.setDLV_INST_CD_3(struct.getDLV_INST_CD_3());
			this.setDLV_DATE_4(struct.getDLV_DATE_4());
			this.setDLV_INST_QTY_4(struct.getDLV_INST_QTY_4());
			this.setDLV_INST_CD_4(struct.getDLV_INST_CD_4());
			this.setDLV_DATE_5(struct.getDLV_DATE_5());
			this.setDLV_INST_QTY_5(struct.getDLV_INST_QTY_5());
			this.setDLV_INST_CD_5(struct.getDLV_INST_CD_5());
			this.setFREE_COLUMN(struct.getFREE_COLUMN());
			this.setPUCH_ODR_COMMENT(struct.getPUCH_ODR_COMMENT());
			this.setINCLUDING_TAX_TYP(struct.getINCLUDING_TAX_TYP());
			this.setTAX_RELATION_TYP(struct.getTAX_RELATION_TYP());
			this.setTAX_AMOUNT(struct.getTAX_AMOUNT());
			this.setNET_AMOUNT(struct.getNET_AMOUNT());
			this.setRESERVE_CD(struct.getRESERVE_CD());
			this.setCOST_PLAN_CD(struct.getCOST_PLAN_CD());
			this.setSTL_COND_TYP(struct.getSTL_COND_TYP());
			this.setEND_USER_NAME(struct.getEND_USER_NAME());
			this.setDLV_ADDRESS_CD(struct.getDLV_ADDRESS_CD());
			this.setDLV_ADDRESS(struct.getDLV_ADDRESS());
			this.setDLV_NAME(struct.getDLV_NAME());
			this.setEND_USER_ITEM_NAME(struct.getEND_USER_ITEM_NAME());
			this.setEND_USER_ITEM_CD(struct.getEND_USER_ITEM_CD());
			this.setEND_USER_ODR_CD(struct.getEND_USER_ODR_CD());
			this.setMAKER_NAME(struct.getMAKER_NAME());
			this.setDLV_KEY_CD_1(struct.getDLV_KEY_CD_1());
			this.setDLV_KEY_CD_2(struct.getDLV_KEY_CD_2());
			this.setDLV_KEY_CD_3(struct.getDLV_KEY_CD_3());
			this.setDLV_KEY_CD_4(struct.getDLV_KEY_CD_4());
			this.setDLV_KEY_CD_5(struct.getDLV_KEY_CD_5());
			this.setWH_NAME(struct.getWH_NAME());
			this.setPUCH_BCODE_INF(struct.getPUCH_BCODE_INF());
			this.setPUCH_COMMENT(struct.getPUCH_COMMENT());
			this.setCONTRACT_COND_TYP(struct.getCONTRACT_COND_TYP());
			this.setPUCH_ODR_SHAP_TYP(struct.getPUCH_ODR_SHAP_TYP());
			this.setOWNER_ODR_CD(struct.getOWNER_ODR_CD());
			this.setQTY_CONTRACT_TYP(struct.getQTY_CONTRACT_TYP());
			this.setODR_MODIFY_TYP_1(struct.getODR_MODIFY_TYP_1());
			this.setODR_MODIFY_TYP_2(struct.getODR_MODIFY_TYP_2());
			this.setODR_MODIFY_TYP_3(struct.getODR_MODIFY_TYP_3());
			this.setMACHINE_CD(struct.getMACHINE_CD());
			this.setENGINNERING_CHG_CD(struct.getENGINNERING_CHG_CD());
			this.setITEM_DRAW_CD(struct.getITEM_DRAW_CD());
			this.setDLV_DOC_FORM_1(struct.getDLV_DOC_FORM_1());
			this.setDLV_DOC_COPY_NUM_1(struct.getDLV_DOC_COPY_NUM_1());
			this.setDLV_DOC_LANG_1(struct.getDLV_DOC_LANG_1());
			this.setDLV_DOC_FORM_2(struct.getDLV_DOC_FORM_2());
			this.setDLV_DOC_COPY_NUM_2(struct.getDLV_DOC_COPY_NUM_2());
			this.setDLV_DOC_LANG_2(struct.getDLV_DOC_LANG_2());
			this.setDLV_DOC_FORM_3(struct.getDLV_DOC_FORM_3());
			this.setDLV_DOC_COPY_NUM_3(struct.getDLV_DOC_COPY_NUM_3());
			this.setDLV_DOC_LANG_3(struct.getDLV_DOC_LANG_3());
			this.setDLV_DOC_FORM_4(struct.getDLV_DOC_FORM_4());
			this.setDLV_DOC_COPY_NUM_4(struct.getDLV_DOC_COPY_NUM_4());
			this.setDLV_DOC_LANG_4(struct.getDLV_DOC_LANG_4());
			this.setSTRATEGIC_GOODS_TYP(struct.getSTRATEGIC_GOODS_TYP());
			this.setORGN_PLACE_CD_1(struct.getORGN_PLACE_CD_1());
			this.setORGN_PLACE_CD_2(struct.getORGN_PLACE_CD_2());
			this.setORGN_PLACE_CD_3(struct.getORGN_PLACE_CD_3());
			this.setORGN_PLACE_CD_4(struct.getORGN_PLACE_CD_4());
			this.setORGN_PLACE_CD_5(struct.getORGN_PLACE_CD_5());
			this.setDLV_TIME_1(struct.getDLV_TIME_1());
			this.setDLV_TIME_2(struct.getDLV_TIME_2());
			this.setDLV_TIME_3(struct.getDLV_TIME_3());
			this.setDLV_TIME_4(struct.getDLV_TIME_4());
			this.setDLV_TIME_5(struct.getDLV_TIME_5());
			this.setPACKAGE_DLV_CD(struct.getPACKAGE_DLV_CD());
			this.setODR_ITEM_SPEC(struct.getODR_ITEM_SPEC());
			this.setODR_ORG_NAME(struct.getODR_ORG_NAME());
			this.setDLV_PART_LEN_1(struct.getDLV_PART_LEN_1());
			this.setDLV_PART_QTY_1(struct.getDLV_PART_QTY_1());
			this.setDLV_PART_LEN_2(struct.getDLV_PART_LEN_2());
			this.setDLV_PART_QTY_2(struct.getDLV_PART_QTY_2());
			this.setDLV_PART_LEN_3(struct.getDLV_PART_LEN_3());
			this.setDLV_PART_QTY_3(struct.getDLV_PART_QTY_3());
			this.setDLV_PART_LEN_4(struct.getDLV_PART_LEN_4());
			this.setDLV_PART_QTY_4(struct.getDLV_PART_QTY_4());
			this.setDLV_PART_LEN_5(struct.getDLV_PART_LEN_5());
			this.setDLV_PART_QTY_5(struct.getDLV_PART_QTY_5());
			this.setDLV_PART_UNIT(struct.getDLV_PART_UNIT());
			this.setCUST_CONSTRUCT_NAME(struct.getCUST_CONSTRUCT_NAME());
			this.setMATERIAL_CD(struct.getMATERIAL_CD());
			this.setMATERIAL_UNIT_PRICE(struct.getMATERIAL_UNIT_PRICE());
			this.setMATRRIAL_UNIT(struct.getMATRRIAL_UNIT());
			this.setTEST_REPORT_NEED_TYP(struct.getTEST_REPORT_NEED_TYP());
			this.setTEST_REPORT_CHK_TYP(struct.getTEST_REPORT_CHK_TYP());
			this.setTEST_REPORT_PRESENT_TYP(struct.getTEST_REPORT_PRESENT_TYP());
			this.setMUNICIPAL_CD(struct.getMUNICIPAL_CD());
			this.setDLV_CONTACT_TEL(struct.getDLV_CONTACT_TEL());
			this.setDLV_PRICE_OPEN_TYP(struct.getDLV_PRICE_OPEN_TYP());
			this.setODR_STAFF_NAME_J(struct.getODR_STAFF_NAME_J());
			this.setITEM_SPEC_NAME_J(struct.getITEM_SPEC_NAME_J());
			this.setITEM_NAME_J(struct.getITEM_NAME_J());
			this.setCOMMENT_J(struct.getCOMMENT_J());
			this.setEND_USER_NAME_J(struct.getEND_USER_NAME_J());
			this.setDLV_ADDRESS_J(struct.getDLV_ADDRESS_J());
			this.setDLV_NAME_J(struct.getDLV_NAME_J());
			this.setEND_USER_ITEM_NAME_J(struct.getEND_USER_ITEM_NAME_J());
			this.setMAKER_NAME_J(struct.getMAKER_NAME_J());
			this.setWH_NAME_J(struct.getWH_NAME_J());
			this.setPUCH_ODR_COMMENT_J(struct.getPUCH_ODR_COMMENT_J());
			this.setMACHINE_NAME_J(struct.getMACHINE_NAME_J());
			this.setODR_SPEC_J(struct.getODR_SPEC_J());
			this.setODR_ORG_NAME_J(struct.getODR_ORG_NAME_J());
			this.setCUST_CONSTRUCT_NAME_J(struct.getCUST_CONSTRUCT_NAME_J());
			this.setCUR_CD(struct.getCUR_CD());
			this.setUNIT_COST_FOREIGN(struct.getUNIT_COST_FOREIGN());
			this.setODR_AMOUNT_FOREIGN(struct.getODR_AMOUNT_FOREIGN());
			this.setTAX_AMOUNT_FOREIGN(struct.getTAX_AMOUNT_FOREIGN());
			this.setNET_AMOUNT_FOREIGN(struct.getNET_AMOUNT_FOREIGN());
			this.setMATERIAL_UNIT_PRICE_FOREIGN(struct.getMATERIAL_UNIT_PRICE_FOREIGN());
			this.setBEFORE_ODR_QTY(struct.getBEFORE_ODR_QTY());
			this.setBEFORE_UNIT_COST(struct.getBEFORE_UNIT_COST());
			this.setBEFORE_UNIT_COST_FOREIGN(struct.getBEFORE_UNIT_COST_FOREIGN());
			this.setBEFORE_DLV_DATE_1(struct.getBEFORE_DLV_DATE_1());
			this.setBEFORE_DLV_QTY_1(struct.getBEFORE_DLV_QTY_1());
			this.setBEFORE_DLV_DATE_2(struct.getBEFORE_DLV_DATE_2());
			this.setBEFORE_DLV_QTY_2(struct.getBEFORE_DLV_QTY_2());
			this.setBEFORE_DLV_DATE_3(struct.getBEFORE_DLV_DATE_3());
			this.setBEFORE_DLV_QTY_3(struct.getBEFORE_DLV_QTY_3());
			this.setBEFORE_DLV_DATE_4(struct.getBEFORE_DLV_DATE_4());
			this.setBEFORE_DLV_QTY_4(struct.getBEFORE_DLV_QTY_4());
			this.setBEFORE_DLV_DATE_5(struct.getBEFORE_DLV_DATE_5());
			this.setBEFORE_DLV_QTY_5(struct.getBEFORE_DLV_QTY_5());
			this.setODR_RETURN_DATE(struct.getODR_RETURN_DATE());
			this.setREJECT_RETURN_TYP(struct.getREJECT_RETURN_TYP());
			this.setEDI_ODR_ISS_FLG(struct.getEDI_ODR_ISS_FLG());
			this.setEDI_ODR_ISS_DATE(struct.getEDI_ODR_ISS_DATE());
			this.setl_PUCH_ODR_START_DATE(struct.getl_PUCH_ODR_START_DATE());
			this.setl_PUCH_ODR_DLV_DATE(struct.getl_PUCH_ODR_DLV_DATE());
			this.setl_VEND_CD(struct.getl_VEND_CD());
			this.setl_VEND_ANAME(struct.getl_VEND_ANAME());
			this.setl_ITEM_CD(struct.getl_ITEM_CD());
			this.setl_ITEM_NAME(struct.getl_ITEM_NAME());
			this.setl_PUCH_ODR_QTY(struct.getl_PUCH_ODR_QTY());
			this.setl_STOCK_UNIT(struct.getl_STOCK_UNIT());
			this.setl_PUCH_ODR_CD(struct.getl_PUCH_ODR_CD());
			this.setl_JOB_ODR_CD(struct.getl_JOB_ODR_CD());
			this.setl_PUCH_ODR_EDI_ISS_DATE(struct.getl_PUCH_ODR_EDI_ISS_DATE());
			this.setl_BUSINESS_OPR_DATE(struct.getl_BUSINESS_OPR_DATE());
			this.setl_MODIFY_COUNT(struct.getl_MODIFY_COUNT());
			this.setPUCH_ODR_START_DATE(struct.getPUCH_ODR_START_DATE());
			this.setPUCH_ODR_DLV_DATE(struct.getPUCH_ODR_DLV_DATE());
			this.setPUCH_ODR_STS_TYP(struct.getPUCH_ODR_STS_TYP());
			this.setPUCH_ODR_EDI_ISS_FLG(struct.getPUCH_ODR_EDI_ISS_FLG());
			this.setNot_PUCH_ODR_EDI_ISS_FLG(struct.getNot_PUCH_ODR_EDI_ISS_FLG());
			this.setEXCH_RATE(struct.getEXCH_RATE());
			this.setODR_CANCEL_EDI_ISS_DATE(struct.getODR_CANCEL_EDI_ISS_DATE());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.setVEND_NAME(struct.getVEND_NAME());
			this.setUSER_NAME(struct.getUSER_NAME());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setBUSINESS_OPR_DATE(struct.getBUSINESS_OPR_DATE());
			this.setl_PLANT_CD(struct.getl_PLANT_CD());
			this.setl_PUCH_ODR_SLIP_ISS_DATE(struct.getl_PUCH_ODR_SLIP_ISS_DATE());
			this.setl_ACPT_DATE(struct.getl_ACPT_DATE());
			this.setl_ODR_CANCEL_SLIP_ISS_DATE(struct.getl_ODR_CANCEL_SLIP_ISS_DATE());
			this.setl_PUCH_ODR_PERSON(struct.getl_PUCH_ODR_PERSON());
			this.setl_USER_NAME(struct.getl_USER_NAME());
			this.setl_ODR_CANCEL_CAUSE_CD(struct.getl_ODR_CANCEL_CAUSE_CD());
			this.setl_ACPT_RSLT_COMMENT(struct.getl_ACPT_RSLT_COMMENT());
			this.setPUCH_ODR_START_DATE_FROM(struct.getPUCH_ODR_START_DATE_FROM());
			this.setPUCH_ODR_START_DATE_TO(struct.getPUCH_ODR_START_DATE_TO());
			this.setPUCH_ODR_DLV_DATE_FROM(struct.getPUCH_ODR_DLV_DATE_FROM());
			this.setPUCH_ODR_DLV_DATE_TO(struct.getPUCH_ODR_DLV_DATE_TO());
			this.setACPT_DATE_FROM(struct.getACPT_DATE_FROM());
			this.setACPT_DATE_TO(struct.getACPT_DATE_TO());
			this.setl_COUNT(struct.getl_COUNT());
			this.setROW_COUNT(struct.getROW_COUNT());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AE0080010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_ReOutputFlg(struct.getList_ReOutputFlg());
			this.setList_INFO_TYP_CD(struct.getList_INFO_TYP_CD());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_PUCH_ODR_CD(struct.getList_PUCH_ODR_CD());
			this.setList_DATA_PROC_CD(struct.getList_DATA_PROC_CD());
			this.setList_DATA_CREATE_DATE(struct.getList_DATA_CREATE_DATE());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_CRCT_TYP(struct.getList_CRCT_TYP());
			this.setList_COCK_TYP(struct.getList_COCK_TYP());
			this.setList_PUCH_ODR_DATE(struct.getList_PUCH_ODR_DATE());
			this.setList_PUCH_ODR_UNIT(struct.getList_PUCH_ODR_UNIT());
			this.setList_UNIT_COST(struct.getList_UNIT_COST());
			this.setList_UNIT_COST_TYP(struct.getList_UNIT_COST_TYP());
			this.setList_PUCH_ODR_QTY(struct.getList_PUCH_ODR_QTY());
			this.setList_PUCH_ODR_AMOUNT(struct.getList_PUCH_ODR_AMOUNT());
			this.setList_EDI_CONS_TYP(struct.getList_EDI_CONS_TYP());
			this.setList_PUCH_ODR_PERSON(struct.getList_PUCH_ODR_PERSON());
			this.setList_ITEM_SPEC(struct.getList_ITEM_SPEC());
			this.setList_ITEM_DRAW_TYP(struct.getList_ITEM_DRAW_TYP());
			this.setList_ITEM_VERSION(struct.getList_ITEM_VERSION());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_VEND_ITEM_CD(struct.getList_VEND_ITEM_CD());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_ITEM_DRAW_QTY(struct.getList_ITEM_DRAW_QTY());
			this.setList_ITEM_PKG_UNIT(struct.getList_ITEM_PKG_UNIT());
			this.setList_DIRECT_DLV_TYP(struct.getList_DIRECT_DLV_TYP());
			this.setList_WH_CD(struct.getList_WH_CD());
			this.setList_ACPT_INSPC_TYP(struct.getList_ACPT_INSPC_TYP());
			this.setList_DLV_INST_TYP(struct.getList_DLV_INST_TYP());
			this.setList_DLV_DATE_1(struct.getList_DLV_DATE_1());
			this.setList_DLV_INST_QTY_1(struct.getList_DLV_INST_QTY_1());
			this.setList_DLV_INST_CD_1(struct.getList_DLV_INST_CD_1());
			this.setList_DLV_DATE_2(struct.getList_DLV_DATE_2());
			this.setList_DLV_INST_QTY_2(struct.getList_DLV_INST_QTY_2());
			this.setList_DLV_INST_CD_2(struct.getList_DLV_INST_CD_2());
			this.setList_DLV_DATE_3(struct.getList_DLV_DATE_3());
			this.setList_DLV_INST_QTY_3(struct.getList_DLV_INST_QTY_3());
			this.setList_DLV_INST_CD_3(struct.getList_DLV_INST_CD_3());
			this.setList_DLV_DATE_4(struct.getList_DLV_DATE_4());
			this.setList_DLV_INST_QTY_4(struct.getList_DLV_INST_QTY_4());
			this.setList_DLV_INST_CD_4(struct.getList_DLV_INST_CD_4());
			this.setList_DLV_DATE_5(struct.getList_DLV_DATE_5());
			this.setList_DLV_INST_QTY_5(struct.getList_DLV_INST_QTY_5());
			this.setList_DLV_INST_CD_5(struct.getList_DLV_INST_CD_5());
			this.setList_FREE_COLUMN(struct.getList_FREE_COLUMN());
			this.setList_PUCH_ODR_COMMENT(struct.getList_PUCH_ODR_COMMENT());
			this.setList_INCLUDING_TAX_TYP(struct.getList_INCLUDING_TAX_TYP());
			this.setList_TAX_RELATION_TYP(struct.getList_TAX_RELATION_TYP());
			this.setList_TAX_AMOUNT(struct.getList_TAX_AMOUNT());
			this.setList_NET_AMOUNT(struct.getList_NET_AMOUNT());
			this.setList_RESERVE_CD(struct.getList_RESERVE_CD());
			this.setList_COST_PLAN_CD(struct.getList_COST_PLAN_CD());
			this.setList_STL_COND_TYP(struct.getList_STL_COND_TYP());
			this.setList_END_USER_NAME(struct.getList_END_USER_NAME());
			this.setList_DLV_ADDRESS_CD(struct.getList_DLV_ADDRESS_CD());
			this.setList_DLV_ADDRESS(struct.getList_DLV_ADDRESS());
			this.setList_DLV_NAME(struct.getList_DLV_NAME());
			this.setList_END_USER_ITEM_NAME(struct.getList_END_USER_ITEM_NAME());
			this.setList_END_USER_ITEM_CD(struct.getList_END_USER_ITEM_CD());
			this.setList_END_USER_ODR_CD(struct.getList_END_USER_ODR_CD());
			this.setList_MAKER_NAME(struct.getList_MAKER_NAME());
			this.setList_DLV_KEY_CD_1(struct.getList_DLV_KEY_CD_1());
			this.setList_DLV_KEY_CD_2(struct.getList_DLV_KEY_CD_2());
			this.setList_DLV_KEY_CD_3(struct.getList_DLV_KEY_CD_3());
			this.setList_DLV_KEY_CD_4(struct.getList_DLV_KEY_CD_4());
			this.setList_DLV_KEY_CD_5(struct.getList_DLV_KEY_CD_5());
			this.setList_WH_NAME(struct.getList_WH_NAME());
			this.setList_PUCH_BCODE_INF(struct.getList_PUCH_BCODE_INF());
			this.setList_PUCH_COMMENT(struct.getList_PUCH_COMMENT());
			this.setList_CONTRACT_COND_TYP(struct.getList_CONTRACT_COND_TYP());
			this.setList_PUCH_ODR_SHAP_TYP(struct.getList_PUCH_ODR_SHAP_TYP());
			this.setList_OWNER_ODR_CD(struct.getList_OWNER_ODR_CD());
			this.setList_QTY_CONTRACT_TYP(struct.getList_QTY_CONTRACT_TYP());
			this.setList_ODR_MODIFY_TYP_1(struct.getList_ODR_MODIFY_TYP_1());
			this.setList_ODR_MODIFY_TYP_2(struct.getList_ODR_MODIFY_TYP_2());
			this.setList_ODR_MODIFY_TYP_3(struct.getList_ODR_MODIFY_TYP_3());
			this.setList_MACHINE_CD(struct.getList_MACHINE_CD());
			this.setList_ENGINNERING_CHG_CD(struct.getList_ENGINNERING_CHG_CD());
			this.setList_ITEM_DRAW_CD(struct.getList_ITEM_DRAW_CD());
			this.setList_DLV_DOC_FORM_1(struct.getList_DLV_DOC_FORM_1());
			this.setList_DLV_DOC_COPY_NUM_1(struct.getList_DLV_DOC_COPY_NUM_1());
			this.setList_DLV_DOC_LANG_1(struct.getList_DLV_DOC_LANG_1());
			this.setList_DLV_DOC_FORM_2(struct.getList_DLV_DOC_FORM_2());
			this.setList_DLV_DOC_COPY_NUM_2(struct.getList_DLV_DOC_COPY_NUM_2());
			this.setList_DLV_DOC_LANG_2(struct.getList_DLV_DOC_LANG_2());
			this.setList_DLV_DOC_FORM_3(struct.getList_DLV_DOC_FORM_3());
			this.setList_DLV_DOC_COPY_NUM_3(struct.getList_DLV_DOC_COPY_NUM_3());
			this.setList_DLV_DOC_LANG_3(struct.getList_DLV_DOC_LANG_3());
			this.setList_DLV_DOC_FORM_4(struct.getList_DLV_DOC_FORM_4());
			this.setList_DLV_DOC_COPY_NUM_4(struct.getList_DLV_DOC_COPY_NUM_4());
			this.setList_DLV_DOC_LANG_4(struct.getList_DLV_DOC_LANG_4());
			this.setList_STRATEGIC_GOODS_TYP(struct.getList_STRATEGIC_GOODS_TYP());
			this.setList_ORGN_PLACE_CD_1(struct.getList_ORGN_PLACE_CD_1());
			this.setList_ORGN_PLACE_CD_2(struct.getList_ORGN_PLACE_CD_2());
			this.setList_ORGN_PLACE_CD_3(struct.getList_ORGN_PLACE_CD_3());
			this.setList_ORGN_PLACE_CD_4(struct.getList_ORGN_PLACE_CD_4());
			this.setList_ORGN_PLACE_CD_5(struct.getList_ORGN_PLACE_CD_5());
			this.setList_DLV_TIME_1(struct.getList_DLV_TIME_1());
			this.setList_DLV_TIME_2(struct.getList_DLV_TIME_2());
			this.setList_DLV_TIME_3(struct.getList_DLV_TIME_3());
			this.setList_DLV_TIME_4(struct.getList_DLV_TIME_4());
			this.setList_DLV_TIME_5(struct.getList_DLV_TIME_5());
			this.setList_PACKAGE_DLV_CD(struct.getList_PACKAGE_DLV_CD());
			this.setList_ODR_ITEM_SPEC(struct.getList_ODR_ITEM_SPEC());
			this.setList_ODR_ORG_NAME(struct.getList_ODR_ORG_NAME());
			this.setList_DLV_PART_LEN_1(struct.getList_DLV_PART_LEN_1());
			this.setList_DLV_PART_QTY_1(struct.getList_DLV_PART_QTY_1());
			this.setList_DLV_PART_LEN_2(struct.getList_DLV_PART_LEN_2());
			this.setList_DLV_PART_QTY_2(struct.getList_DLV_PART_QTY_2());
			this.setList_DLV_PART_LEN_3(struct.getList_DLV_PART_LEN_3());
			this.setList_DLV_PART_QTY_3(struct.getList_DLV_PART_QTY_3());
			this.setList_DLV_PART_LEN_4(struct.getList_DLV_PART_LEN_4());
			this.setList_DLV_PART_QTY_4(struct.getList_DLV_PART_QTY_4());
			this.setList_DLV_PART_LEN_5(struct.getList_DLV_PART_LEN_5());
			this.setList_DLV_PART_QTY_5(struct.getList_DLV_PART_QTY_5());
			this.setList_DLV_PART_UNIT(struct.getList_DLV_PART_UNIT());
			this.setList_CUST_CONSTRUCT_NAME(struct.getList_CUST_CONSTRUCT_NAME());
			this.setList_MATERIAL_CD(struct.getList_MATERIAL_CD());
			this.setList_MATERIAL_UNIT_PRICE(struct.getList_MATERIAL_UNIT_PRICE());
			this.setList_MATRRIAL_UNIT(struct.getList_MATRRIAL_UNIT());
			this.setList_TEST_REPORT_NEED_TYP(struct.getList_TEST_REPORT_NEED_TYP());
			this.setList_TEST_REPORT_CHK_TYP(struct.getList_TEST_REPORT_CHK_TYP());
			this.setList_TEST_REPORT_PRESENT_TYP(struct.getList_TEST_REPORT_PRESENT_TYP());
			this.setList_MUNICIPAL_CD(struct.getList_MUNICIPAL_CD());
			this.setList_DLV_CONTACT_TEL(struct.getList_DLV_CONTACT_TEL());
			this.setList_DLV_PRICE_OPEN_TYP(struct.getList_DLV_PRICE_OPEN_TYP());
			this.setList_ODR_STAFF_NAME_J(struct.getList_ODR_STAFF_NAME_J());
			this.setList_ITEM_SPEC_NAME_J(struct.getList_ITEM_SPEC_NAME_J());
			this.setList_ITEM_NAME_J(struct.getList_ITEM_NAME_J());
			this.setList_COMMENT_J(struct.getList_COMMENT_J());
			this.setList_END_USER_NAME_J(struct.getList_END_USER_NAME_J());
			this.setList_DLV_ADDRESS_J(struct.getList_DLV_ADDRESS_J());
			this.setList_DLV_NAME_J(struct.getList_DLV_NAME_J());
			this.setList_END_USER_ITEM_NAME_J(struct.getList_END_USER_ITEM_NAME_J());
			this.setList_MAKER_NAME_J(struct.getList_MAKER_NAME_J());
			this.setList_WH_NAME_J(struct.getList_WH_NAME_J());
			this.setList_PUCH_ODR_COMMENT_J(struct.getList_PUCH_ODR_COMMENT_J());
			this.setList_MACHINE_NAME_J(struct.getList_MACHINE_NAME_J());
			this.setList_ODR_SPEC_J(struct.getList_ODR_SPEC_J());
			this.setList_ODR_ORG_NAME_J(struct.getList_ODR_ORG_NAME_J());
			this.setList_CUST_CONSTRUCT_NAME_J(struct.getList_CUST_CONSTRUCT_NAME_J());
			this.setList_CUR_CD(struct.getList_CUR_CD());
			this.setList_UNIT_COST_FOREIGN(struct.getList_UNIT_COST_FOREIGN());
			this.setList_ODR_AMOUNT_FOREIGN(struct.getList_ODR_AMOUNT_FOREIGN());
			this.setList_TAX_AMOUNT_FOREIGN(struct.getList_TAX_AMOUNT_FOREIGN());
			this.setList_NET_AMOUNT_FOREIGN(struct.getList_NET_AMOUNT_FOREIGN());
			this.setList_MATERIAL_UNIT_PRICE_FOREIGN(struct.getList_MATERIAL_UNIT_PRICE_FOREIGN());
			this.setList_BEFORE_ODR_QTY(struct.getList_BEFORE_ODR_QTY());
			this.setList_BEFORE_UNIT_COST(struct.getList_BEFORE_UNIT_COST());
			this.setList_BEFORE_UNIT_COST_FOREIGN(struct.getList_BEFORE_UNIT_COST_FOREIGN());
			this.setList_BEFORE_DLV_DATE_1(struct.getList_BEFORE_DLV_DATE_1());
			this.setList_BEFORE_DLV_QTY_1(struct.getList_BEFORE_DLV_QTY_1());
			this.setList_BEFORE_DLV_DATE_2(struct.getList_BEFORE_DLV_DATE_2());
			this.setList_BEFORE_DLV_QTY_2(struct.getList_BEFORE_DLV_QTY_2());
			this.setList_BEFORE_DLV_DATE_3(struct.getList_BEFORE_DLV_DATE_3());
			this.setList_BEFORE_DLV_QTY_3(struct.getList_BEFORE_DLV_QTY_3());
			this.setList_BEFORE_DLV_DATE_4(struct.getList_BEFORE_DLV_DATE_4());
			this.setList_BEFORE_DLV_QTY_4(struct.getList_BEFORE_DLV_QTY_4());
			this.setList_BEFORE_DLV_DATE_5(struct.getList_BEFORE_DLV_DATE_5());
			this.setList_BEFORE_DLV_QTY_5(struct.getList_BEFORE_DLV_QTY_5());
			this.setList_ODR_RETURN_DATE(struct.getList_ODR_RETURN_DATE());
			this.setList_REJECT_RETURN_TYP(struct.getList_REJECT_RETURN_TYP());
			this.setList_EDI_ODR_ISS_FLG(struct.getList_EDI_ODR_ISS_FLG());
			this.setList_EDI_ODR_ISS_DATE(struct.getList_EDI_ODR_ISS_DATE());
			this.setList_l_PUCH_ODR_START_DATE(struct.getList_l_PUCH_ODR_START_DATE());
			this.setList_l_PUCH_ODR_DLV_DATE(struct.getList_l_PUCH_ODR_DLV_DATE());
			this.setList_l_VEND_CD(struct.getList_l_VEND_CD());
			this.setList_l_VEND_ANAME(struct.getList_l_VEND_ANAME());
			this.setList_l_ITEM_CD(struct.getList_l_ITEM_CD());
			this.setList_l_ITEM_NAME(struct.getList_l_ITEM_NAME());
			this.setList_l_PUCH_ODR_QTY(struct.getList_l_PUCH_ODR_QTY());
			this.setList_l_STOCK_UNIT(struct.getList_l_STOCK_UNIT());
			this.setList_l_PUCH_ODR_CD(struct.getList_l_PUCH_ODR_CD());
			this.setList_l_JOB_ODR_CD(struct.getList_l_JOB_ODR_CD());
			this.setList_l_PUCH_ODR_EDI_ISS_DATE(struct.getList_l_PUCH_ODR_EDI_ISS_DATE());
			this.setList_l_BUSINESS_OPR_DATE(struct.getList_l_BUSINESS_OPR_DATE());
			this.setList_l_MODIFY_COUNT(struct.getList_l_MODIFY_COUNT());
			this.setList_PUCH_ODR_START_DATE(struct.getList_PUCH_ODR_START_DATE());
			this.setList_PUCH_ODR_DLV_DATE(struct.getList_PUCH_ODR_DLV_DATE());
			this.setList_PUCH_ODR_STS_TYP(struct.getList_PUCH_ODR_STS_TYP());
			this.setList_PUCH_ODR_EDI_ISS_FLG(struct.getList_PUCH_ODR_EDI_ISS_FLG());
			this.setList_Not_PUCH_ODR_EDI_ISS_FLG(struct.getList_Not_PUCH_ODR_EDI_ISS_FLG());
			this.setList_EXCH_RATE(struct.getList_EXCH_RATE());
			this.setList_ODR_CANCEL_EDI_ISS_DATE(struct.getList_ODR_CANCEL_EDI_ISS_DATE());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_VEND_NAME(struct.getList_VEND_NAME());
			this.setList_USER_NAME(struct.getList_USER_NAME());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_BUSINESS_OPR_DATE(struct.getList_BUSINESS_OPR_DATE());
			this.setList_l_PLANT_CD(struct.getList_l_PLANT_CD());
			this.setList_l_PUCH_ODR_SLIP_ISS_DATE(struct.getList_l_PUCH_ODR_SLIP_ISS_DATE());
			this.setList_l_ACPT_DATE(struct.getList_l_ACPT_DATE());
			this.setList_l_ODR_CANCEL_SLIP_ISS_DATE(struct.getList_l_ODR_CANCEL_SLIP_ISS_DATE());
			this.setList_l_PUCH_ODR_PERSON(struct.getList_l_PUCH_ODR_PERSON());
			this.setList_l_USER_NAME(struct.getList_l_USER_NAME());
			this.setList_l_ODR_CANCEL_CAUSE_CD(struct.getList_l_ODR_CANCEL_CAUSE_CD());
			this.setList_l_ACPT_RSLT_COMMENT(struct.getList_l_ACPT_RSLT_COMMENT());
			this.setList_PUCH_ODR_START_DATE_FROM(struct.getList_PUCH_ODR_START_DATE_FROM());
			this.setList_PUCH_ODR_START_DATE_TO(struct.getList_PUCH_ODR_START_DATE_TO());
			this.setList_PUCH_ODR_DLV_DATE_FROM(struct.getList_PUCH_ODR_DLV_DATE_FROM());
			this.setList_PUCH_ODR_DLV_DATE_TO(struct.getList_PUCH_ODR_DLV_DATE_TO());
			this.setList_ACPT_DATE_FROM(struct.getList_ACPT_DATE_FROM());
			this.setList_ACPT_DATE_TO(struct.getList_ACPT_DATE_TO());
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
	// 第 1 変数初期値： i_ReOutputFlg


	final static String i_ReOutputFlg = null;

	// 第 2 変数初期値： i_INFO_TYP_CD


	final static String i_INFO_TYP_CD = null;

	// 第 3 変数初期値： i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// 第 4 変数初期値： i_PUCH_ODR_CD


	final static String i_PUCH_ODR_CD = null;

	// 第 5 変数初期値： i_DATA_PROC_CD


	final static String i_DATA_PROC_CD = null;

	// 第 6 変数初期値： i_DATA_CREATE_DATE


	final static String i_DATA_CREATE_DATE = null;

	// 第 7 変数初期値： i_VEND_CD


	final static String i_VEND_CD = null;

	// 第 8 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

	// 第 9 変数初期値： i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// 第 10 変数初期値： i_CRCT_TYP


	final static String i_CRCT_TYP = null;

	// 第 11 変数初期値： i_COCK_TYP


	final static String i_COCK_TYP = null;

	// 第 12 変数初期値： i_PUCH_ODR_DATE


	final static String i_PUCH_ODR_DATE = null;

	// 第 13 変数初期値： i_PUCH_ODR_UNIT


	final static String i_PUCH_ODR_UNIT = null;

	// 第 14 変数初期値： i_UNIT_COST


	final static String i_UNIT_COST = null;

	// 第 15 変数初期値： i_UNIT_COST_TYP


	final static String i_UNIT_COST_TYP = null;

	// 第 16 変数初期値： i_PUCH_ODR_QTY


	final static String i_PUCH_ODR_QTY = null;

	// 第 17 変数初期値： i_PUCH_ODR_AMOUNT


	final static String i_PUCH_ODR_AMOUNT = null;

	// 第 18 変数初期値： i_EDI_CONS_TYP


	final static String i_EDI_CONS_TYP = null;

	// 第 19 変数初期値： i_PUCH_ODR_PERSON


	final static String i_PUCH_ODR_PERSON = null;

	// 第 20 変数初期値： i_ITEM_SPEC


	final static String i_ITEM_SPEC = null;

	// 第 21 変数初期値： i_ITEM_DRAW_TYP


	final static String i_ITEM_DRAW_TYP = null;

	// 第 22 変数初期値： i_ITEM_VERSION


	final static String i_ITEM_VERSION = null;

	// 第 23 変数初期値： i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// 第 24 変数初期値： i_VEND_ITEM_CD


	final static String i_VEND_ITEM_CD = null;

	// 第 25 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 26 変数初期値： i_ITEM_DRAW_QTY


	final static String i_ITEM_DRAW_QTY = null;

	// 第 27 変数初期値： i_ITEM_PKG_UNIT


	final static String i_ITEM_PKG_UNIT = null;

	// 第 28 変数初期値： i_DIRECT_DLV_TYP


	final static String i_DIRECT_DLV_TYP = null;

	// 第 29 変数初期値： i_WH_CD


	final static String i_WH_CD = null;

	// 第 30 変数初期値： i_ACPT_INSPC_TYP


	final static String i_ACPT_INSPC_TYP = null;

	// 第 31 変数初期値： i_DLV_INST_TYP


	final static String i_DLV_INST_TYP = null;

	// 第 32 変数初期値： i_DLV_DATE_1


	final static String i_DLV_DATE_1 = null;

	// 第 33 変数初期値： i_DLV_INST_QTY_1


	final static String i_DLV_INST_QTY_1 = null;

	// 第 34 変数初期値： i_DLV_INST_CD_1


	final static String i_DLV_INST_CD_1 = null;

	// 第 35 変数初期値： i_DLV_DATE_2


	final static String i_DLV_DATE_2 = null;

	// 第 36 変数初期値： i_DLV_INST_QTY_2


	final static String i_DLV_INST_QTY_2 = null;

	// 第 37 変数初期値： i_DLV_INST_CD_2


	final static String i_DLV_INST_CD_2 = null;

	// 第 38 変数初期値： i_DLV_DATE_3


	final static String i_DLV_DATE_3 = null;

	// 第 39 変数初期値： i_DLV_INST_QTY_3


	final static String i_DLV_INST_QTY_3 = null;

	// 第 40 変数初期値： i_DLV_INST_CD_3


	final static String i_DLV_INST_CD_3 = null;

	// 第 41 変数初期値： i_DLV_DATE_4


	final static String i_DLV_DATE_4 = null;

	// 第 42 変数初期値： i_DLV_INST_QTY_4


	final static String i_DLV_INST_QTY_4 = null;

	// 第 43 変数初期値： i_DLV_INST_CD_4


	final static String i_DLV_INST_CD_4 = null;

	// 第 44 変数初期値： i_DLV_DATE_5


	final static String i_DLV_DATE_5 = null;

	// 第 45 変数初期値： i_DLV_INST_QTY_5


	final static String i_DLV_INST_QTY_5 = null;

	// 第 46 変数初期値： i_DLV_INST_CD_5


	final static String i_DLV_INST_CD_5 = null;

	// 第 47 変数初期値： i_FREE_COLUMN


	final static String i_FREE_COLUMN = null;

	// 第 48 変数初期値： i_PUCH_ODR_COMMENT


	final static String i_PUCH_ODR_COMMENT = null;

	// 第 49 変数初期値： i_INCLUDING_TAX_TYP


	final static String i_INCLUDING_TAX_TYP = null;

	// 第 50 変数初期値： i_TAX_RELATION_TYP


	final static String i_TAX_RELATION_TYP = null;

	// 第 51 変数初期値： i_TAX_AMOUNT


	final static String i_TAX_AMOUNT = null;

	// 第 52 変数初期値： i_NET_AMOUNT


	final static String i_NET_AMOUNT = null;

	// 第 53 変数初期値： i_RESERVE_CD


	final static String i_RESERVE_CD = null;

	// 第 54 変数初期値： i_COST_PLAN_CD


	final static String i_COST_PLAN_CD = null;

	// 第 55 変数初期値： i_STL_COND_TYP


	final static String i_STL_COND_TYP = null;

	// 第 56 変数初期値： i_END_USER_NAME


	final static String i_END_USER_NAME = null;

	// 第 57 変数初期値： i_DLV_ADDRESS_CD


	final static String i_DLV_ADDRESS_CD = null;

	// 第 58 変数初期値： i_DLV_ADDRESS


	final static String i_DLV_ADDRESS = null;

	// 第 59 変数初期値： i_DLV_NAME


	final static String i_DLV_NAME = null;

	// 第 60 変数初期値： i_END_USER_ITEM_NAME


	final static String i_END_USER_ITEM_NAME = null;

	// 第 61 変数初期値： i_END_USER_ITEM_CD


	final static String i_END_USER_ITEM_CD = null;

	// 第 62 変数初期値： i_END_USER_ODR_CD


	final static String i_END_USER_ODR_CD = null;

	// 第 63 変数初期値： i_MAKER_NAME


	final static String i_MAKER_NAME = null;

	// 第 64 変数初期値： i_DLV_KEY_CD_1


	final static String i_DLV_KEY_CD_1 = null;

	// 第 65 変数初期値： i_DLV_KEY_CD_2


	final static String i_DLV_KEY_CD_2 = null;

	// 第 66 変数初期値： i_DLV_KEY_CD_3


	final static String i_DLV_KEY_CD_3 = null;

	// 第 67 変数初期値： i_DLV_KEY_CD_4


	final static String i_DLV_KEY_CD_4 = null;

	// 第 68 変数初期値： i_DLV_KEY_CD_5


	final static String i_DLV_KEY_CD_5 = null;

	// 第 69 変数初期値： i_WH_NAME


	final static String i_WH_NAME = null;

	// 第 70 変数初期値： i_PUCH_BCODE_INF


	final static String i_PUCH_BCODE_INF = null;

	// 第 71 変数初期値： i_PUCH_COMMENT


	final static String i_PUCH_COMMENT = null;

	// 第 72 変数初期値： i_CONTRACT_COND_TYP


	final static String i_CONTRACT_COND_TYP = null;

	// 第 73 変数初期値： i_PUCH_ODR_SHAP_TYP


	final static String i_PUCH_ODR_SHAP_TYP = null;

	// 第 74 変数初期値： i_OWNER_ODR_CD


	final static String i_OWNER_ODR_CD = null;

	// 第 75 変数初期値： i_QTY_CONTRACT_TYP


	final static String i_QTY_CONTRACT_TYP = null;

	// 第 76 変数初期値： i_ODR_MODIFY_TYP_1


	final static String i_ODR_MODIFY_TYP_1 = null;

	// 第 77 変数初期値： i_ODR_MODIFY_TYP_2


	final static String i_ODR_MODIFY_TYP_2 = null;

	// 第 78 変数初期値： i_ODR_MODIFY_TYP_3


	final static String i_ODR_MODIFY_TYP_3 = null;

	// 第 79 変数初期値： i_MACHINE_CD


	final static String i_MACHINE_CD = null;

	// 第 80 変数初期値： i_ENGINNERING_CHG_CD


	final static String i_ENGINNERING_CHG_CD = null;

	// 第 81 変数初期値： i_ITEM_DRAW_CD


	final static String i_ITEM_DRAW_CD = null;

	// 第 82 変数初期値： i_DLV_DOC_FORM_1


	final static String i_DLV_DOC_FORM_1 = null;

	// 第 83 変数初期値： i_DLV_DOC_COPY_NUM_1


	final static String i_DLV_DOC_COPY_NUM_1 = null;

	// 第 84 変数初期値： i_DLV_DOC_LANG_1


	final static String i_DLV_DOC_LANG_1 = null;

	// 第 85 変数初期値： i_DLV_DOC_FORM_2


	final static String i_DLV_DOC_FORM_2 = null;

	// 第 86 変数初期値： i_DLV_DOC_COPY_NUM_2


	final static String i_DLV_DOC_COPY_NUM_2 = null;

	// 第 87 変数初期値： i_DLV_DOC_LANG_2


	final static String i_DLV_DOC_LANG_2 = null;

	// 第 88 変数初期値： i_DLV_DOC_FORM_3


	final static String i_DLV_DOC_FORM_3 = null;

	// 第 89 変数初期値： i_DLV_DOC_COPY_NUM_3


	final static String i_DLV_DOC_COPY_NUM_3 = null;

	// 第 90 変数初期値： i_DLV_DOC_LANG_3


	final static String i_DLV_DOC_LANG_3 = null;

	// 第 91 変数初期値： i_DLV_DOC_FORM_4


	final static String i_DLV_DOC_FORM_4 = null;

	// 第 92 変数初期値： i_DLV_DOC_COPY_NUM_4


	final static String i_DLV_DOC_COPY_NUM_4 = null;

	// 第 93 変数初期値： i_DLV_DOC_LANG_4


	final static String i_DLV_DOC_LANG_4 = null;

	// 第 94 変数初期値： i_STRATEGIC_GOODS_TYP


	final static String i_STRATEGIC_GOODS_TYP = null;

	// 第 95 変数初期値： i_ORGN_PLACE_CD_1


	final static String i_ORGN_PLACE_CD_1 = null;

	// 第 96 変数初期値： i_ORGN_PLACE_CD_2


	final static String i_ORGN_PLACE_CD_2 = null;

	// 第 97 変数初期値： i_ORGN_PLACE_CD_3


	final static String i_ORGN_PLACE_CD_3 = null;

	// 第 98 変数初期値： i_ORGN_PLACE_CD_4


	final static String i_ORGN_PLACE_CD_4 = null;

	// 第 99 変数初期値： i_ORGN_PLACE_CD_5


	final static String i_ORGN_PLACE_CD_5 = null;

	// 第 100 変数初期値： i_DLV_TIME_1


	final static String i_DLV_TIME_1 = null;

	// 第 101 変数初期値： i_DLV_TIME_2


	final static String i_DLV_TIME_2 = null;

	// 第 102 変数初期値： i_DLV_TIME_3


	final static String i_DLV_TIME_3 = null;

	// 第 103 変数初期値： i_DLV_TIME_4


	final static String i_DLV_TIME_4 = null;

	// 第 104 変数初期値： i_DLV_TIME_5


	final static String i_DLV_TIME_5 = null;

	// 第 105 変数初期値： i_PACKAGE_DLV_CD


	final static String i_PACKAGE_DLV_CD = null;

	// 第 106 変数初期値： i_ODR_ITEM_SPEC


	final static String i_ODR_ITEM_SPEC = null;

	// 第 107 変数初期値： i_ODR_ORG_NAME


	final static String i_ODR_ORG_NAME = null;

	// 第 108 変数初期値： i_DLV_PART_LEN_1


	final static String i_DLV_PART_LEN_1 = null;

	// 第 109 変数初期値： i_DLV_PART_QTY_1


	final static String i_DLV_PART_QTY_1 = null;

	// 第 110 変数初期値： i_DLV_PART_LEN_2


	final static String i_DLV_PART_LEN_2 = null;

	// 第 111 変数初期値： i_DLV_PART_QTY_2


	final static String i_DLV_PART_QTY_2 = null;

	// 第 112 変数初期値： i_DLV_PART_LEN_3


	final static String i_DLV_PART_LEN_3 = null;

	// 第 113 変数初期値： i_DLV_PART_QTY_3


	final static String i_DLV_PART_QTY_3 = null;

	// 第 114 変数初期値： i_DLV_PART_LEN_4


	final static String i_DLV_PART_LEN_4 = null;

	// 第 115 変数初期値： i_DLV_PART_QTY_4


	final static String i_DLV_PART_QTY_4 = null;

	// 第 116 変数初期値： i_DLV_PART_LEN_5


	final static String i_DLV_PART_LEN_5 = null;

	// 第 117 変数初期値： i_DLV_PART_QTY_5


	final static String i_DLV_PART_QTY_5 = null;

	// 第 118 変数初期値： i_DLV_PART_UNIT


	final static String i_DLV_PART_UNIT = null;

	// 第 119 変数初期値： i_CUST_CONSTRUCT_NAME


	final static String i_CUST_CONSTRUCT_NAME = null;

	// 第 120 変数初期値： i_MATERIAL_CD


	final static String i_MATERIAL_CD = null;

	// 第 121 変数初期値： i_MATERIAL_UNIT_PRICE


	final static String i_MATERIAL_UNIT_PRICE = null;

	// 第 122 変数初期値： i_MATRRIAL_UNIT


	final static String i_MATRRIAL_UNIT = null;

	// 第 123 変数初期値： i_TEST_REPORT_NEED_TYP


	final static String i_TEST_REPORT_NEED_TYP = null;

	// 第 124 変数初期値： i_TEST_REPORT_CHK_TYP


	final static String i_TEST_REPORT_CHK_TYP = null;

	// 第 125 変数初期値： i_TEST_REPORT_PRESENT_TYP


	final static String i_TEST_REPORT_PRESENT_TYP = null;

	// 第 126 変数初期値： i_MUNICIPAL_CD


	final static String i_MUNICIPAL_CD = null;

	// 第 127 変数初期値： i_DLV_CONTACT_TEL


	final static String i_DLV_CONTACT_TEL = null;

	// 第 128 変数初期値： i_DLV_PRICE_OPEN_TYP


	final static String i_DLV_PRICE_OPEN_TYP = null;

	// 第 129 変数初期値： i_ODR_STAFF_NAME_J


	final static String i_ODR_STAFF_NAME_J = null;

	// 第 130 変数初期値： i_ITEM_SPEC_NAME_J


	final static String i_ITEM_SPEC_NAME_J = null;

	// 第 131 変数初期値： i_ITEM_NAME_J


	final static String i_ITEM_NAME_J = null;

	// 第 132 変数初期値： i_COMMENT_J


	final static String i_COMMENT_J = null;

	// 第 133 変数初期値： i_END_USER_NAME_J


	final static String i_END_USER_NAME_J = null;

	// 第 134 変数初期値： i_DLV_ADDRESS_J


	final static String i_DLV_ADDRESS_J = null;

	// 第 135 変数初期値： i_DLV_NAME_J


	final static String i_DLV_NAME_J = null;

	// 第 136 変数初期値： i_END_USER_ITEM_NAME_J


	final static String i_END_USER_ITEM_NAME_J = null;

	// 第 137 変数初期値： i_MAKER_NAME_J


	final static String i_MAKER_NAME_J = null;

	// 第 138 変数初期値： i_WH_NAME_J


	final static String i_WH_NAME_J = null;

	// 第 139 変数初期値： i_PUCH_ODR_COMMENT_J


	final static String i_PUCH_ODR_COMMENT_J = null;

	// 第 140 変数初期値： i_MACHINE_NAME_J


	final static String i_MACHINE_NAME_J = null;

	// 第 141 変数初期値： i_ODR_SPEC_J


	final static String i_ODR_SPEC_J = null;

	// 第 142 変数初期値： i_ODR_ORG_NAME_J


	final static String i_ODR_ORG_NAME_J = null;

	// 第 143 変数初期値： i_CUST_CONSTRUCT_NAME_J


	final static String i_CUST_CONSTRUCT_NAME_J = null;

	// 第 144 変数初期値： i_CUR_CD


	final static String i_CUR_CD = null;

	// 第 145 変数初期値： i_UNIT_COST_FOREIGN


	final static String i_UNIT_COST_FOREIGN = null;

	// 第 146 変数初期値： i_ODR_AMOUNT_FOREIGN


	final static String i_ODR_AMOUNT_FOREIGN = null;

	// 第 147 変数初期値： i_TAX_AMOUNT_FOREIGN


	final static String i_TAX_AMOUNT_FOREIGN = null;

	// 第 148 変数初期値： i_NET_AMOUNT_FOREIGN


	final static String i_NET_AMOUNT_FOREIGN = null;

	// 第 149 変数初期値： i_MATERIAL_UNIT_PRICE_FOREIGN


	final static String i_MATERIAL_UNIT_PRICE_FOREIGN = null;

	// 第 150 変数初期値： i_BEFORE_ODR_QTY


	final static String i_BEFORE_ODR_QTY = null;

	// 第 151 変数初期値： i_BEFORE_UNIT_COST


	final static String i_BEFORE_UNIT_COST = null;

	// 第 152 変数初期値： i_BEFORE_UNIT_COST_FOREIGN


	final static String i_BEFORE_UNIT_COST_FOREIGN = null;

	// 第 153 変数初期値： i_BEFORE_DLV_DATE_1


	final static String i_BEFORE_DLV_DATE_1 = null;

	// 第 154 変数初期値： i_BEFORE_DLV_QTY_1


	final static String i_BEFORE_DLV_QTY_1 = null;

	// 第 155 変数初期値： i_BEFORE_DLV_DATE_2


	final static String i_BEFORE_DLV_DATE_2 = null;

	// 第 156 変数初期値： i_BEFORE_DLV_QTY_2


	final static String i_BEFORE_DLV_QTY_2 = null;

	// 第 157 変数初期値： i_BEFORE_DLV_DATE_3


	final static String i_BEFORE_DLV_DATE_3 = null;

	// 第 158 変数初期値： i_BEFORE_DLV_QTY_3


	final static String i_BEFORE_DLV_QTY_3 = null;

	// 第 159 変数初期値： i_BEFORE_DLV_DATE_4


	final static String i_BEFORE_DLV_DATE_4 = null;

	// 第 160 変数初期値： i_BEFORE_DLV_QTY_4


	final static String i_BEFORE_DLV_QTY_4 = null;

	// 第 161 変数初期値： i_BEFORE_DLV_DATE_5


	final static String i_BEFORE_DLV_DATE_5 = null;

	// 第 162 変数初期値： i_BEFORE_DLV_QTY_5


	final static String i_BEFORE_DLV_QTY_5 = null;

	// 第 163 変数初期値： i_ODR_RETURN_DATE


	final static String i_ODR_RETURN_DATE = null;

	// 第 164 変数初期値： i_REJECT_RETURN_TYP


	final static String i_REJECT_RETURN_TYP = null;

	// 第 165 変数初期値： i_EDI_ODR_ISS_FLG


	final static String i_EDI_ODR_ISS_FLG = null;

	// 第 166 変数初期値： i_EDI_ODR_ISS_DATE


	final static String i_EDI_ODR_ISS_DATE = null;

	// 第 167 変数初期値： i_l_PUCH_ODR_START_DATE


	final static String i_l_PUCH_ODR_START_DATE = null;

	// 第 168 変数初期値： i_l_PUCH_ODR_DLV_DATE


	final static String i_l_PUCH_ODR_DLV_DATE = null;

	// 第 169 変数初期値： i_l_VEND_CD


	final static String i_l_VEND_CD = null;

	// 第 170 変数初期値： i_l_VEND_ANAME


	final static String i_l_VEND_ANAME = null;

	// 第 171 変数初期値： i_l_ITEM_CD


	final static String i_l_ITEM_CD = null;

	// 第 172 変数初期値： i_l_ITEM_NAME


	final static String i_l_ITEM_NAME = null;

	// 第 173 変数初期値： i_l_PUCH_ODR_QTY


	final static String i_l_PUCH_ODR_QTY = null;

	// 第 174 変数初期値： i_l_STOCK_UNIT


	final static String i_l_STOCK_UNIT = null;

	// 第 175 変数初期値： i_l_PUCH_ODR_CD


	final static String i_l_PUCH_ODR_CD = null;

	// 第 176 変数初期値： i_l_JOB_ODR_CD


	final static String i_l_JOB_ODR_CD = null;

	// 第 177 変数初期値： i_l_PUCH_ODR_EDI_ISS_DATE


	final static String i_l_PUCH_ODR_EDI_ISS_DATE = null;

	// 第 178 変数初期値： i_l_BUSINESS_OPR_DATE


	final static String i_l_BUSINESS_OPR_DATE = null;

	// 第 179 変数初期値： i_l_MODIFY_COUNT


	final static String i_l_MODIFY_COUNT = null;

	// 第 180 変数初期値： i_PUCH_ODR_START_DATE


	final static String i_PUCH_ODR_START_DATE = null;

	// 第 181 変数初期値： i_PUCH_ODR_DLV_DATE


	final static String i_PUCH_ODR_DLV_DATE = null;

	// 第 182 変数初期値： i_PUCH_ODR_STS_TYP


	final static String i_PUCH_ODR_STS_TYP = null;

	// 第 183 変数初期値： i_PUCH_ODR_EDI_ISS_FLG


	final static String i_PUCH_ODR_EDI_ISS_FLG = null;

	// 第 184 変数初期値： i_Not_PUCH_ODR_EDI_ISS_FLG


	final static String i_Not_PUCH_ODR_EDI_ISS_FLG = null;

	// 第 185 変数初期値： i_EXCH_RATE


	final static String i_EXCH_RATE = null;

	// 第 186 変数初期値： i_ODR_CANCEL_EDI_ISS_DATE


	final static String i_ODR_CANCEL_EDI_ISS_DATE = null;

	// 第 187 変数初期値： i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// 第 188 変数初期値： i_VEND_NAME


	final static String i_VEND_NAME = null;

	// 第 189 変数初期値： i_USER_NAME


	final static String i_USER_NAME = null;

	// 第 190 変数初期値： i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// 第 191 変数初期値： i_BUSINESS_OPR_DATE


	final static String i_BUSINESS_OPR_DATE = null;

	// 第 192 変数初期値： i_l_PLANT_CD


	final static String i_l_PLANT_CD = null;

	// 第 193 変数初期値： i_l_PUCH_ODR_SLIP_ISS_DATE


	final static String i_l_PUCH_ODR_SLIP_ISS_DATE = null;

	// 第 194 変数初期値： i_l_ACPT_DATE


	final static String i_l_ACPT_DATE = null;

	// 第 195 変数初期値： i_l_ODR_CANCEL_SLIP_ISS_DATE


	final static String i_l_ODR_CANCEL_SLIP_ISS_DATE = null;

	// 第 196 変数初期値： i_l_PUCH_ODR_PERSON


	final static String i_l_PUCH_ODR_PERSON = null;

	// 第 197 変数初期値： i_l_USER_NAME


	final static String i_l_USER_NAME = null;

	// 第 198 変数初期値： i_l_ODR_CANCEL_CAUSE_CD


	final static String i_l_ODR_CANCEL_CAUSE_CD = null;

	// 第 199 変数初期値： i_l_ACPT_RSLT_COMMENT


	final static String i_l_ACPT_RSLT_COMMENT = null;

	// 第 200 変数初期値： i_PUCH_ODR_START_DATE_FROM


	final static String i_PUCH_ODR_START_DATE_FROM = null;

	// 第 201 変数初期値： i_PUCH_ODR_START_DATE_TO


	final static String i_PUCH_ODR_START_DATE_TO = null;

	// 第 202 変数初期値： i_PUCH_ODR_DLV_DATE_FROM


	final static String i_PUCH_ODR_DLV_DATE_FROM = null;

	// 第 203 変数初期値： i_PUCH_ODR_DLV_DATE_TO


	final static String i_PUCH_ODR_DLV_DATE_TO = null;

	// 第 204 変数初期値： i_ACPT_DATE_FROM


	final static String i_ACPT_DATE_FROM = null;

	// 第 205 変数初期値： i_ACPT_DATE_TO


	final static String i_ACPT_DATE_TO = null;

	// 第 206 変数初期値： i_l_COUNT


	final static String i_l_COUNT = null;

	// 第 207 変数初期値： i_ROW_COUNT


	final static String i_ROW_COUNT = null;

*/

	//{{user_implement_code
		// TODO: 初期化で使う定数は、ここに記述してください。
		// 以下に記述した内容は自動的には変更されません。
	// 第 1 変数初期値： i_ReOutputFlg

	final static String i_ReOutputFlg = null;

	// 第 2 変数初期値： i_INFO_TYP_CD

	final static String i_INFO_TYP_CD = null;

	// 第 3 変数初期値： i_COMPANY_CD

	final static String i_COMPANY_CD = null;

	// 第 4 変数初期値： i_PUCH_ODR_CD

	final static String i_PUCH_ODR_CD = null;

	// 第 5 変数初期値： i_DATA_PROC_CD

	final static String i_DATA_PROC_CD = null;

	// 第 6 変数初期値： i_DATA_CREATE_DATE

	final static String i_DATA_CREATE_DATE = null;

	// 第 7 変数初期値： i_VEND_CD

	final static String i_VEND_CD = null;

	// 第 8 変数初期値： i_PLANT_CD

	final static String i_PLANT_CD = null;

	// 第 9 変数初期値： i_JOB_ODR_CD

	final static String i_JOB_ODR_CD = null;

	// 第 10 変数初期値： i_CRCT_TYP

	final static String i_CRCT_TYP = null;

	// 第 11 変数初期値： i_COCK_TYP

	final static String i_COCK_TYP = null;

	// 第 12 変数初期値： i_PUCH_ODR_DATE

	final static String i_PUCH_ODR_DATE = null;

	// 第 13 変数初期値： i_PUCH_ODR_UNIT

	final static String i_PUCH_ODR_UNIT = null;

	// 第 14 変数初期値： i_UNIT_COST

	final static String i_UNIT_COST = null;

	// 第 15 変数初期値： i_UNIT_COST_TYP

	final static String i_UNIT_COST_TYP = null;

	// 第 16 変数初期値： i_PUCH_ODR_QTY

	final static String i_PUCH_ODR_QTY = null;

	// 第 17 変数初期値： i_PUCH_ODR_AMOUNT

	final static String i_PUCH_ODR_AMOUNT = null;

	// 第 18 変数初期値： i_EDI_CONS_TYP

	final static String i_EDI_CONS_TYP = null;

	// 第 19 変数初期値： i_PUCH_ODR_PERSON

	final static String i_PUCH_ODR_PERSON = null;

	// 第 20 変数初期値： i_ITEM_SPEC

	final static String i_ITEM_SPEC = null;

	// 第 21 変数初期値： i_ITEM_DRAW_TYP

	final static String i_ITEM_DRAW_TYP = null;

	// 第 22 変数初期値： i_ITEM_VERSION

	final static String i_ITEM_VERSION = null;

	// 第 23 変数初期値： i_ITEM_NAME

	final static String i_ITEM_NAME = null;

	// 第 24 変数初期値： i_VEND_ITEM_CD

	final static String i_VEND_ITEM_CD = null;

	// 第 25 変数初期値： i_ITEM_CD

	final static String i_ITEM_CD = null;

	// 第 26 変数初期値： i_ITEM_DRAW_QTY

	final static String i_ITEM_DRAW_QTY = null;

	// 第 27 変数初期値： i_ITEM_PKG_UNIT

	final static String i_ITEM_PKG_UNIT = null;

	// 第 28 変数初期値： i_DIRECT_DLV_TYP

	final static String i_DIRECT_DLV_TYP = null;

	// 第 29 変数初期値： i_WH_CD

	final static String i_WH_CD = null;

	// 第 30 変数初期値： i_ACPT_INSPC_TYP

	final static String i_ACPT_INSPC_TYP = null;

	// 第 31 変数初期値： i_DLV_INST_TYP

	final static String i_DLV_INST_TYP = null;

	// 第 32 変数初期値： i_DLV_DATE_1

	final static String i_DLV_DATE_1 = null;

	// 第 33 変数初期値： i_DLV_INST_QTY_1

	final static String i_DLV_INST_QTY_1 = null;

	// 第 34 変数初期値： i_DLV_INST_CD_1

	final static String i_DLV_INST_CD_1 = null;

	// 第 35 変数初期値： i_DLV_DATE_2

	final static String i_DLV_DATE_2 = null;

	// 第 36 変数初期値： i_DLV_INST_QTY_2

	final static String i_DLV_INST_QTY_2 = null;

	// 第 37 変数初期値： i_DLV_INST_CD_2

	final static String i_DLV_INST_CD_2 = null;

	// 第 38 変数初期値： i_DLV_DATE_3

	final static String i_DLV_DATE_3 = null;

	// 第 39 変数初期値： i_DLV_INST_QTY_3

	final static String i_DLV_INST_QTY_3 = null;

	// 第 40 変数初期値： i_DLV_INST_CD_3

	final static String i_DLV_INST_CD_3 = null;

	// 第 41 変数初期値： i_DLV_DATE_4

	final static String i_DLV_DATE_4 = null;

	// 第 42 変数初期値： i_DLV_INST_QTY_4

	final static String i_DLV_INST_QTY_4 = null;

	// 第 43 変数初期値： i_DLV_INST_CD_4

	final static String i_DLV_INST_CD_4 = null;

	// 第 44 変数初期値： i_DLV_DATE_5

	final static String i_DLV_DATE_5 = null;

	// 第 45 変数初期値： i_DLV_INST_QTY_5

	final static String i_DLV_INST_QTY_5 = null;

	// 第 46 変数初期値： i_DLV_INST_CD_5

	final static String i_DLV_INST_CD_5 = null;

	// 第 47 変数初期値： i_FREE_COLUMN

	final static String i_FREE_COLUMN = null;

	// 第 48 変数初期値： i_PUCH_ODR_COMMENT

	final static String i_PUCH_ODR_COMMENT = null;

	// 第 49 変数初期値： i_INCLUDING_TAX_TYP

	final static String i_INCLUDING_TAX_TYP = null;

	// 第 50 変数初期値： i_TAX_RELATION_TYP

	final static String i_TAX_RELATION_TYP = null;

	// 第 51 変数初期値： i_TAX_AMOUNT

	final static String i_TAX_AMOUNT = null;

	// 第 52 変数初期値： i_NET_AMOUNT

	final static String i_NET_AMOUNT = null;

	// 第 53 変数初期値： i_RESERVE_CD

	final static String i_RESERVE_CD = null;

	// 第 54 変数初期値： i_COST_PLAN_CD

	final static String i_COST_PLAN_CD = null;

	// 第 55 変数初期値： i_STL_COND_TYP

	final static String i_STL_COND_TYP = null;

	// 第 56 変数初期値： i_END_USER_NAME

	final static String i_END_USER_NAME = null;

	// 第 57 変数初期値： i_DLV_ADDRESS_CD

	final static String i_DLV_ADDRESS_CD = null;

	// 第 58 変数初期値： i_DLV_ADDRESS

	final static String i_DLV_ADDRESS = null;

	// 第 59 変数初期値： i_DLV_NAME

	final static String i_DLV_NAME = null;

	// 第 60 変数初期値： i_END_USER_ITEM_NAME

	final static String i_END_USER_ITEM_NAME = null;

	// 第 61 変数初期値： i_END_USER_ITEM_CD

	final static String i_END_USER_ITEM_CD = null;

	// 第 62 変数初期値： i_END_USER_ODR_CD

	final static String i_END_USER_ODR_CD = null;

	// 第 63 変数初期値： i_MAKER_NAME

	final static String i_MAKER_NAME = null;

	// 第 64 変数初期値： i_DLV_KEY_CD_1

	final static String i_DLV_KEY_CD_1 = null;

	// 第 65 変数初期値： i_DLV_KEY_CD_2

	final static String i_DLV_KEY_CD_2 = null;

	// 第 66 変数初期値： i_DLV_KEY_CD_3

	final static String i_DLV_KEY_CD_3 = null;

	// 第 67 変数初期値： i_DLV_KEY_CD_4

	final static String i_DLV_KEY_CD_4 = null;

	// 第 68 変数初期値： i_DLV_KEY_CD_5

	final static String i_DLV_KEY_CD_5 = null;

	// 第 69 変数初期値： i_WH_NAME

	final static String i_WH_NAME = null;

	// 第 70 変数初期値： i_PUCH_BCODE_INF

	final static String i_PUCH_BCODE_INF = null;

	// 第 71 変数初期値： i_PUCH_COMMENT

	final static String i_PUCH_COMMENT = null;

	// 第 72 変数初期値： i_CONTRACT_COND_TYP

	final static String i_CONTRACT_COND_TYP = null;

	// 第 73 変数初期値： i_PUCH_ODR_SHAP_TYP

	final static String i_PUCH_ODR_SHAP_TYP = null;

	// 第 74 変数初期値： i_OWNER_ODR_CD

	final static String i_OWNER_ODR_CD = null;

	// 第 75 変数初期値： i_QTY_CONTRACT_TYP

	final static String i_QTY_CONTRACT_TYP = null;

	// 第 76 変数初期値： i_ODR_MODIFY_TYP_1

	final static String i_ODR_MODIFY_TYP_1 = null;

	// 第 77 変数初期値： i_ODR_MODIFY_TYP_2

	final static String i_ODR_MODIFY_TYP_2 = null;

	// 第 78 変数初期値： i_ODR_MODIFY_TYP_3

	final static String i_ODR_MODIFY_TYP_3 = null;

	// 第 79 変数初期値： i_MACHINE_CD

	final static String i_MACHINE_CD = null;

	// 第 80 変数初期値： i_ENGINNERING_CHG_CD

	final static String i_ENGINNERING_CHG_CD = null;

	// 第 81 変数初期値： i_ITEM_DRAW_CD

	final static String i_ITEM_DRAW_CD = null;

	// 第 82 変数初期値： i_DLV_DOC_FORM_1

	final static String i_DLV_DOC_FORM_1 = null;

	// 第 83 変数初期値： i_DLV_DOC_COPY_NUM_1

	final static String i_DLV_DOC_COPY_NUM_1 = null;

	// 第 84 変数初期値： i_DLV_DOC_LANG_1

	final static String i_DLV_DOC_LANG_1 = null;

	// 第 85 変数初期値： i_DLV_DOC_FORM_2

	final static String i_DLV_DOC_FORM_2 = null;

	// 第 86 変数初期値： i_DLV_DOC_COPY_NUM_2

	final static String i_DLV_DOC_COPY_NUM_2 = null;

	// 第 87 変数初期値： i_DLV_DOC_LANG_2

	final static String i_DLV_DOC_LANG_2 = null;

	// 第 88 変数初期値： i_DLV_DOC_FORM_3

	final static String i_DLV_DOC_FORM_3 = null;

	// 第 89 変数初期値： i_DLV_DOC_COPY_NUM_3

	final static String i_DLV_DOC_COPY_NUM_3 = null;

	// 第 90 変数初期値： i_DLV_DOC_LANG_3

	final static String i_DLV_DOC_LANG_3 = null;

	// 第 91 変数初期値： i_DLV_DOC_FORM_4

	final static String i_DLV_DOC_FORM_4 = null;

	// 第 92 変数初期値： i_DLV_DOC_COPY_NUM_4

	final static String i_DLV_DOC_COPY_NUM_4 = null;

	// 第 93 変数初期値： i_DLV_DOC_LANG_4

	final static String i_DLV_DOC_LANG_4 = null;

	// 第 94 変数初期値： i_STRATEGIC_GOODS_TYP

	final static String i_STRATEGIC_GOODS_TYP = null;

	// 第 95 変数初期値： i_ORGN_PLACE_CD_1

	final static String i_ORGN_PLACE_CD_1 = null;

	// 第 96 変数初期値： i_ORGN_PLACE_CD_2

	final static String i_ORGN_PLACE_CD_2 = null;

	// 第 97 変数初期値： i_ORGN_PLACE_CD_3

	final static String i_ORGN_PLACE_CD_3 = null;

	// 第 98 変数初期値： i_ORGN_PLACE_CD_4

	final static String i_ORGN_PLACE_CD_4 = null;

	// 第 99 変数初期値： i_ORGN_PLACE_CD_5

	final static String i_ORGN_PLACE_CD_5 = null;

	// 第 100 変数初期値： i_DLV_TIME_1

	final static String i_DLV_TIME_1 = null;

	// 第 101 変数初期値： i_DLV_TIME_2

	final static String i_DLV_TIME_2 = null;

	// 第 102 変数初期値： i_DLV_TIME_3

	final static String i_DLV_TIME_3 = null;

	// 第 103 変数初期値： i_DLV_TIME_4

	final static String i_DLV_TIME_4 = null;

	// 第 104 変数初期値： i_DLV_TIME_5

	final static String i_DLV_TIME_5 = null;

	// 第 105 変数初期値： i_PACKAGE_DLV_CD

	final static String i_PACKAGE_DLV_CD = null;

	// 第 106 変数初期値： i_ODR_ITEM_SPEC

	final static String i_ODR_ITEM_SPEC = null;

	// 第 107 変数初期値： i_ODR_ORG_NAME

	final static String i_ODR_ORG_NAME = null;

	// 第 108 変数初期値： i_DLV_PART_LEN_1

	final static String i_DLV_PART_LEN_1 = null;

	// 第 109 変数初期値： i_DLV_PART_QTY_1

	final static String i_DLV_PART_QTY_1 = null;

	// 第 110 変数初期値： i_DLV_PART_LEN_2

	final static String i_DLV_PART_LEN_2 = null;

	// 第 111 変数初期値： i_DLV_PART_QTY_2

	final static String i_DLV_PART_QTY_2 = null;

	// 第 112 変数初期値： i_DLV_PART_LEN_3

	final static String i_DLV_PART_LEN_3 = null;

	// 第 113 変数初期値： i_DLV_PART_QTY_3

	final static String i_DLV_PART_QTY_3 = null;

	// 第 114 変数初期値： i_DLV_PART_LEN_4

	final static String i_DLV_PART_LEN_4 = null;

	// 第 115 変数初期値： i_DLV_PART_QTY_4

	final static String i_DLV_PART_QTY_4 = null;

	// 第 116 変数初期値： i_DLV_PART_LEN_5

	final static String i_DLV_PART_LEN_5 = null;

	// 第 117 変数初期値： i_DLV_PART_QTY_5

	final static String i_DLV_PART_QTY_5 = null;

	// 第 118 変数初期値： i_DLV_PART_UNIT

	final static String i_DLV_PART_UNIT = null;

	// 第 119 変数初期値： i_CUST_CONSTRUCT_NAME

	final static String i_CUST_CONSTRUCT_NAME = null;

	// 第 120 変数初期値： i_MATERIAL_CD

	final static String i_MATERIAL_CD = null;

	// 第 121 変数初期値： i_MATERIAL_UNIT_PRICE

	final static String i_MATERIAL_UNIT_PRICE = null;

	// 第 122 変数初期値： i_MATRRIAL_UNIT

	final static String i_MATRRIAL_UNIT = null;

	// 第 123 変数初期値： i_TEST_REPORT_NEED_TYP

	final static String i_TEST_REPORT_NEED_TYP = null;

	// 第 124 変数初期値： i_TEST_REPORT_CHK_TYP

	final static String i_TEST_REPORT_CHK_TYP = null;

	// 第 125 変数初期値： i_TEST_REPORT_PRESENT_TYP

	final static String i_TEST_REPORT_PRESENT_TYP = null;

	// 第 126 変数初期値： i_MUNICIPAL_CD

	final static String i_MUNICIPAL_CD = null;

	// 第 127 変数初期値： i_DLV_CONTACT_TEL

	final static String i_DLV_CONTACT_TEL = null;

	// 第 128 変数初期値： i_DLV_PRICE_OPEN_TYP

	final static String i_DLV_PRICE_OPEN_TYP = null;

	// 第 129 変数初期値： i_ODR_STAFF_NAME_J

	final static String i_ODR_STAFF_NAME_J = null;

	// 第 130 変数初期値： i_ITEM_SPEC_NAME_J

	final static String i_ITEM_SPEC_NAME_J = null;

	// 第 131 変数初期値： i_ITEM_NAME_J

	final static String i_ITEM_NAME_J = null;

	// 第 132 変数初期値： i_COMMENT_J

	final static String i_COMMENT_J = null;

	// 第 133 変数初期値： i_END_USER_NAME_J

	final static String i_END_USER_NAME_J = null;

	// 第 134 変数初期値： i_DLV_ADDRESS_J

	final static String i_DLV_ADDRESS_J = null;

	// 第 135 変数初期値： i_DLV_NAME_J

	final static String i_DLV_NAME_J = null;

	// 第 136 変数初期値： i_END_USER_ITEM_NAME_J

	final static String i_END_USER_ITEM_NAME_J = null;

	// 第 137 変数初期値： i_MAKER_NAME_J

	final static String i_MAKER_NAME_J = null;

	// 第 138 変数初期値： i_WH_NAME_J

	final static String i_WH_NAME_J = null;

	// 第 139 変数初期値： i_PUCH_ODR_COMMENT_J

	final static String i_PUCH_ODR_COMMENT_J = null;

	// 第 140 変数初期値： i_MACHINE_NAME_J

	final static String i_MACHINE_NAME_J = null;

	// 第 141 変数初期値： i_ODR_SPEC_J

	final static String i_ODR_SPEC_J = null;

	// 第 142 変数初期値： i_ODR_ORG_NAME_J

	final static String i_ODR_ORG_NAME_J = null;

	// 第 143 変数初期値： i_CUST_CONSTRUCT_NAME_J

	final static String i_CUST_CONSTRUCT_NAME_J = null;

	// 第 144 変数初期値： i_CUR_CD

	final static String i_CUR_CD = null;

	// 第 145 変数初期値： i_UNIT_COST_FOREIGN

	final static String i_UNIT_COST_FOREIGN = null;

	// 第 146 変数初期値： i_ODR_AMOUNT_FOREIGN

	final static String i_ODR_AMOUNT_FOREIGN = null;

	// 第 147 変数初期値： i_TAX_AMOUNT_FOREIGN

	final static String i_TAX_AMOUNT_FOREIGN = null;

	// 第 148 変数初期値： i_NET_AMOUNT_FOREIGN

	final static String i_NET_AMOUNT_FOREIGN = null;

	// 第 149 変数初期値： i_MATERIAL_UNIT_PRICE_FOREIGN

	final static String i_MATERIAL_UNIT_PRICE_FOREIGN = null;

	// 第 150 変数初期値： i_BEFORE_ODR_QTY

	final static String i_BEFORE_ODR_QTY = null;

	// 第 151 変数初期値： i_BEFORE_UNIT_COST

	final static String i_BEFORE_UNIT_COST = null;

	// 第 152 変数初期値： i_BEFORE_UNIT_COST_FOREIGN

	final static String i_BEFORE_UNIT_COST_FOREIGN = null;

	// 第 153 変数初期値： i_BEFORE_DLV_DATE_1

	final static String i_BEFORE_DLV_DATE_1 = null;

	// 第 154 変数初期値： i_BEFORE_DLV_QTY_1

	final static String i_BEFORE_DLV_QTY_1 = null;

	// 第 155 変数初期値： i_BEFORE_DLV_DATE_2

	final static String i_BEFORE_DLV_DATE_2 = null;

	// 第 156 変数初期値： i_BEFORE_DLV_QTY_2

	final static String i_BEFORE_DLV_QTY_2 = null;

	// 第 157 変数初期値： i_BEFORE_DLV_DATE_3

	final static String i_BEFORE_DLV_DATE_3 = null;

	// 第 158 変数初期値： i_BEFORE_DLV_QTY_3

	final static String i_BEFORE_DLV_QTY_3 = null;

	// 第 159 変数初期値： i_BEFORE_DLV_DATE_4

	final static String i_BEFORE_DLV_DATE_4 = null;

	// 第 160 変数初期値： i_BEFORE_DLV_QTY_4

	final static String i_BEFORE_DLV_QTY_4 = null;

	// 第 161 変数初期値： i_BEFORE_DLV_DATE_5

	final static String i_BEFORE_DLV_DATE_5 = null;

	// 第 162 変数初期値： i_BEFORE_DLV_QTY_5

	final static String i_BEFORE_DLV_QTY_5 = null;

	// 第 163 変数初期値： i_ODR_RETURN_DATE

	final static String i_ODR_RETURN_DATE = null;

	// 第 164 変数初期値： i_REJECT_RETURN_TYP

	final static String i_REJECT_RETURN_TYP = null;

	// 第 165 変数初期値： i_EDI_ODR_ISS_FLG

	final static String i_EDI_ODR_ISS_FLG = null;

	// 第 166 変数初期値： i_EDI_ODR_ISS_DATE

	final static String i_EDI_ODR_ISS_DATE = null;

	// 第 167 変数初期値： i_l_PUCH_ODR_START_DATE

	final static String i_l_PUCH_ODR_START_DATE = null;

	// 第 168 変数初期値： i_l_PUCH_ODR_DLV_DATE

	final static String i_l_PUCH_ODR_DLV_DATE = null;

	// 第 169 変数初期値： i_l_VEND_CD

	final static String i_l_VEND_CD = null;

	// 第 170 変数初期値： i_l_VEND_ANAME

	final static String i_l_VEND_ANAME = null;

	// 第 171 変数初期値： i_l_ITEM_CD

	final static String i_l_ITEM_CD = null;

	// 第 172 変数初期値： i_l_ITEM_NAME

	final static String i_l_ITEM_NAME = null;

	// 第 173 変数初期値： i_l_PUCH_ODR_QTY

	final static String i_l_PUCH_ODR_QTY = null;

	// 第 174 変数初期値： i_l_STOCK_UNIT

	final static String i_l_STOCK_UNIT = null;

	// 第 175 変数初期値： i_l_PUCH_ODR_CD

	final static String i_l_PUCH_ODR_CD = null;

	// 第 176 変数初期値： i_l_JOB_ODR_CD

	final static String i_l_JOB_ODR_CD = null;

	// 第 177 変数初期値： i_l_PUCH_ODR_EDI_ISS_DATE

	final static String i_l_PUCH_ODR_EDI_ISS_DATE = null;

	// 第 178 変数初期値： i_l_BUSINESS_OPR_DATE

	final static String i_l_BUSINESS_OPR_DATE = null;

	// 第 179 変数初期値： i_l_MODIFY_COUNT

	final static String i_l_MODIFY_COUNT = null;

	// 第 180 変数初期値： i_PUCH_ODR_START_DATE

	final static String i_PUCH_ODR_START_DATE = null;

	// 第 181 変数初期値： i_PUCH_ODR_DLV_DATE

	final static String i_PUCH_ODR_DLV_DATE = null;

	// 第 182 変数初期値： i_PUCH_ODR_STS_TYP

	final static String i_PUCH_ODR_STS_TYP = null;

	// 第 183 変数初期値： i_PUCH_ODR_EDI_ISS_FLG

	final static String i_PUCH_ODR_EDI_ISS_FLG = null;

	// 第 184 変数初期値： i_Not_PUCH_ODR_EDI_ISS_FLG

	final static String i_Not_PUCH_ODR_EDI_ISS_FLG = null;

	// 第 185 変数初期値： i_EXCH_RATE

	final static String i_EXCH_RATE = null;

	// 第 186 変数初期値： i_ODR_CANCEL_EDI_ISS_DATE

	final static String i_ODR_CANCEL_EDI_ISS_DATE = null;

	// 第 187 変数初期値： i_PLANT_NAME

	final static String i_PLANT_NAME = null;

	// 第 188 変数初期値： i_VEND_NAME

	final static String i_VEND_NAME = null;

	// 第 189 変数初期値： i_USER_NAME

	final static String i_USER_NAME = null;

	// 第 190 変数初期値： i_MODIFY_COUNT

	final static String i_MODIFY_COUNT = null;

	// 第 191 変数初期値： i_BUSINESS_OPR_DATE

	final static String i_BUSINESS_OPR_DATE = null;

	// 第 192 変数初期値： i_l_PLANT_CD

	final static String i_l_PLANT_CD = null;

	// 第 193 変数初期値： i_l_PUCH_ODR_SLIP_ISS_DATE

	final static String i_l_PUCH_ODR_SLIP_ISS_DATE = null;

	// 第 194 変数初期値： i_l_ACPT_DATE

	final static String i_l_ACPT_DATE = null;

	// 第 195 変数初期値： i_l_ODR_CANCEL_SLIP_ISS_DATE

	final static String i_l_ODR_CANCEL_SLIP_ISS_DATE = null;

	// 第 196 変数初期値： i_l_PUCH_ODR_PERSON

	final static String i_l_PUCH_ODR_PERSON = null;

	// 第 197 変数初期値： i_l_USER_NAME

	final static String i_l_USER_NAME = null;

	// 第 198 変数初期値： i_l_ODR_CANCEL_CAUSE_CD

	final static String i_l_ODR_CANCEL_CAUSE_CD = null;

	// 第 199 変数初期値： i_l_ACPT_RSLT_COMMENT

	final static String i_l_ACPT_RSLT_COMMENT = null;

	// 第 200 変数初期値： i_PUCH_ODR_START_DATE_FROM

	final static String i_PUCH_ODR_START_DATE_FROM = null;

	// 第 201 変数初期値： i_PUCH_ODR_START_DATE_TO

	final static String i_PUCH_ODR_START_DATE_TO = null;

	// 第 202 変数初期値： i_PUCH_ODR_DLV_DATE_FROM

	final static String i_PUCH_ODR_DLV_DATE_FROM = null;

	// 第 203 変数初期値： i_PUCH_ODR_DLV_DATE_TO

	final static String i_PUCH_ODR_DLV_DATE_TO = null;

	// 第 204 変数初期値： i_ACPT_DATE_FROM

	final static String i_ACPT_DATE_FROM = null;

	// 第 205 変数初期値： i_ACPT_DATE_TO

	final static String i_ACPT_DATE_TO = null;


	/**
	 * 初期化
	 *
	 */
	public void initialize()
	{

		clear();

		m_ReOutputFlg = i_ReOutputFlg;
		m_INFO_TYP_CD = i_INFO_TYP_CD;
		m_COMPANY_CD = i_COMPANY_CD;
		m_PUCH_ODR_CD = i_PUCH_ODR_CD;
		m_DATA_PROC_CD = i_DATA_PROC_CD;
		m_DATA_CREATE_DATE = i_DATA_CREATE_DATE;
		m_VEND_CD = i_VEND_CD;
		m_PLANT_CD = i_PLANT_CD;
		m_JOB_ODR_CD = i_JOB_ODR_CD;
		m_CRCT_TYP = i_CRCT_TYP;
		m_COCK_TYP = i_COCK_TYP;
		m_PUCH_ODR_DATE = i_PUCH_ODR_DATE;
		m_PUCH_ODR_UNIT = i_PUCH_ODR_UNIT;
		m_UNIT_COST = i_UNIT_COST;
		m_UNIT_COST_TYP = i_UNIT_COST_TYP;
		m_PUCH_ODR_QTY = i_PUCH_ODR_QTY;
		m_PUCH_ODR_AMOUNT = i_PUCH_ODR_AMOUNT;
		m_EDI_CONS_TYP = i_EDI_CONS_TYP;
		m_PUCH_ODR_PERSON = i_PUCH_ODR_PERSON;
		m_ITEM_SPEC = i_ITEM_SPEC;
		m_ITEM_DRAW_TYP = i_ITEM_DRAW_TYP;
		m_ITEM_VERSION = i_ITEM_VERSION;
		m_ITEM_NAME = i_ITEM_NAME;
		m_VEND_ITEM_CD = i_VEND_ITEM_CD;
		m_ITEM_CD = i_ITEM_CD;
		m_ITEM_DRAW_QTY = i_ITEM_DRAW_QTY;
		m_ITEM_PKG_UNIT = i_ITEM_PKG_UNIT;
		m_DIRECT_DLV_TYP = i_DIRECT_DLV_TYP;
		m_WH_CD = i_WH_CD;
		m_ACPT_INSPC_TYP = i_ACPT_INSPC_TYP;
		m_DLV_INST_TYP = i_DLV_INST_TYP;
		m_DLV_DATE_1 = i_DLV_DATE_1;
		m_DLV_INST_QTY_1 = i_DLV_INST_QTY_1;
		m_DLV_INST_CD_1 = i_DLV_INST_CD_1;
		m_DLV_DATE_2 = i_DLV_DATE_2;
		m_DLV_INST_QTY_2 = i_DLV_INST_QTY_2;
		m_DLV_INST_CD_2 = i_DLV_INST_CD_2;
		m_DLV_DATE_3 = i_DLV_DATE_3;
		m_DLV_INST_QTY_3 = i_DLV_INST_QTY_3;
		m_DLV_INST_CD_3 = i_DLV_INST_CD_3;
		m_DLV_DATE_4 = i_DLV_DATE_4;
		m_DLV_INST_QTY_4 = i_DLV_INST_QTY_4;
		m_DLV_INST_CD_4 = i_DLV_INST_CD_4;
		m_DLV_DATE_5 = i_DLV_DATE_5;
		m_DLV_INST_QTY_5 = i_DLV_INST_QTY_5;
		m_DLV_INST_CD_5 = i_DLV_INST_CD_5;
		m_FREE_COLUMN = i_FREE_COLUMN;
		m_PUCH_ODR_COMMENT = i_PUCH_ODR_COMMENT;
		m_INCLUDING_TAX_TYP = i_INCLUDING_TAX_TYP;
		m_TAX_RELATION_TYP = i_TAX_RELATION_TYP;
		m_TAX_AMOUNT = i_TAX_AMOUNT;
		m_NET_AMOUNT = i_NET_AMOUNT;
		m_RESERVE_CD = i_RESERVE_CD;
		m_COST_PLAN_CD = i_COST_PLAN_CD;
		m_STL_COND_TYP = i_STL_COND_TYP;
		m_END_USER_NAME = i_END_USER_NAME;
		m_DLV_ADDRESS_CD = i_DLV_ADDRESS_CD;
		m_DLV_ADDRESS = i_DLV_ADDRESS;
		m_DLV_NAME = i_DLV_NAME;
		m_END_USER_ITEM_NAME = i_END_USER_ITEM_NAME;
		m_END_USER_ITEM_CD = i_END_USER_ITEM_CD;
		m_END_USER_ODR_CD = i_END_USER_ODR_CD;
		m_MAKER_NAME = i_MAKER_NAME;
		m_DLV_KEY_CD_1 = i_DLV_KEY_CD_1;
		m_DLV_KEY_CD_2 = i_DLV_KEY_CD_2;
		m_DLV_KEY_CD_3 = i_DLV_KEY_CD_3;
		m_DLV_KEY_CD_4 = i_DLV_KEY_CD_4;
		m_DLV_KEY_CD_5 = i_DLV_KEY_CD_5;
		m_WH_NAME = i_WH_NAME;
		m_PUCH_BCODE_INF = i_PUCH_BCODE_INF;
		m_PUCH_COMMENT = i_PUCH_COMMENT;
		m_CONTRACT_COND_TYP = i_CONTRACT_COND_TYP;
		m_PUCH_ODR_SHAP_TYP = i_PUCH_ODR_SHAP_TYP;
		m_OWNER_ODR_CD = i_OWNER_ODR_CD;
		m_QTY_CONTRACT_TYP = i_QTY_CONTRACT_TYP;
		m_ODR_MODIFY_TYP_1 = i_ODR_MODIFY_TYP_1;
		m_ODR_MODIFY_TYP_2 = i_ODR_MODIFY_TYP_2;
		m_ODR_MODIFY_TYP_3 = i_ODR_MODIFY_TYP_3;
		m_MACHINE_CD = i_MACHINE_CD;
		m_ENGINNERING_CHG_CD = i_ENGINNERING_CHG_CD;
		m_ITEM_DRAW_CD = i_ITEM_DRAW_CD;
		m_DLV_DOC_FORM_1 = i_DLV_DOC_FORM_1;
		m_DLV_DOC_COPY_NUM_1 = i_DLV_DOC_COPY_NUM_1;
		m_DLV_DOC_LANG_1 = i_DLV_DOC_LANG_1;
		m_DLV_DOC_FORM_2 = i_DLV_DOC_FORM_2;
		m_DLV_DOC_COPY_NUM_2 = i_DLV_DOC_COPY_NUM_2;
		m_DLV_DOC_LANG_2 = i_DLV_DOC_LANG_2;
		m_DLV_DOC_FORM_3 = i_DLV_DOC_FORM_3;
		m_DLV_DOC_COPY_NUM_3 = i_DLV_DOC_COPY_NUM_3;
		m_DLV_DOC_LANG_3 = i_DLV_DOC_LANG_3;
		m_DLV_DOC_FORM_4 = i_DLV_DOC_FORM_4;
		m_DLV_DOC_COPY_NUM_4 = i_DLV_DOC_COPY_NUM_4;
		m_DLV_DOC_LANG_4 = i_DLV_DOC_LANG_4;
		m_STRATEGIC_GOODS_TYP = i_STRATEGIC_GOODS_TYP;
		m_ORGN_PLACE_CD_1 = i_ORGN_PLACE_CD_1;
		m_ORGN_PLACE_CD_2 = i_ORGN_PLACE_CD_2;
		m_ORGN_PLACE_CD_3 = i_ORGN_PLACE_CD_3;
		m_ORGN_PLACE_CD_4 = i_ORGN_PLACE_CD_4;
		m_ORGN_PLACE_CD_5 = i_ORGN_PLACE_CD_5;
		m_DLV_TIME_1 = i_DLV_TIME_1;
		m_DLV_TIME_2 = i_DLV_TIME_2;
		m_DLV_TIME_3 = i_DLV_TIME_3;
		m_DLV_TIME_4 = i_DLV_TIME_4;
		m_DLV_TIME_5 = i_DLV_TIME_5;
		m_PACKAGE_DLV_CD = i_PACKAGE_DLV_CD;
		m_ODR_ITEM_SPEC = i_ODR_ITEM_SPEC;
		m_ODR_ORG_NAME = i_ODR_ORG_NAME;
		m_DLV_PART_LEN_1 = i_DLV_PART_LEN_1;
		m_DLV_PART_QTY_1 = i_DLV_PART_QTY_1;
		m_DLV_PART_LEN_2 = i_DLV_PART_LEN_2;
		m_DLV_PART_QTY_2 = i_DLV_PART_QTY_2;
		m_DLV_PART_LEN_3 = i_DLV_PART_LEN_3;
		m_DLV_PART_QTY_3 = i_DLV_PART_QTY_3;
		m_DLV_PART_LEN_4 = i_DLV_PART_LEN_4;
		m_DLV_PART_QTY_4 = i_DLV_PART_QTY_4;
		m_DLV_PART_LEN_5 = i_DLV_PART_LEN_5;
		m_DLV_PART_QTY_5 = i_DLV_PART_QTY_5;
		m_DLV_PART_UNIT = i_DLV_PART_UNIT;
		m_CUST_CONSTRUCT_NAME = i_CUST_CONSTRUCT_NAME;
		m_MATERIAL_CD = i_MATERIAL_CD;
		m_MATERIAL_UNIT_PRICE = i_MATERIAL_UNIT_PRICE;
		m_MATRRIAL_UNIT = i_MATRRIAL_UNIT;
		m_TEST_REPORT_NEED_TYP = i_TEST_REPORT_NEED_TYP;
		m_TEST_REPORT_CHK_TYP = i_TEST_REPORT_CHK_TYP;
		m_TEST_REPORT_PRESENT_TYP = i_TEST_REPORT_PRESENT_TYP;
		m_MUNICIPAL_CD = i_MUNICIPAL_CD;
		m_DLV_CONTACT_TEL = i_DLV_CONTACT_TEL;
		m_DLV_PRICE_OPEN_TYP = i_DLV_PRICE_OPEN_TYP;
		m_ODR_STAFF_NAME_J = i_ODR_STAFF_NAME_J;
		m_ITEM_SPEC_NAME_J = i_ITEM_SPEC_NAME_J;
		m_ITEM_NAME_J = i_ITEM_NAME_J;
		m_COMMENT_J = i_COMMENT_J;
		m_END_USER_NAME_J = i_END_USER_NAME_J;
		m_DLV_ADDRESS_J = i_DLV_ADDRESS_J;
		m_DLV_NAME_J = i_DLV_NAME_J;
		m_END_USER_ITEM_NAME_J = i_END_USER_ITEM_NAME_J;
		m_MAKER_NAME_J = i_MAKER_NAME_J;
		m_WH_NAME_J = i_WH_NAME_J;
		m_PUCH_ODR_COMMENT_J = i_PUCH_ODR_COMMENT_J;
		m_MACHINE_NAME_J = i_MACHINE_NAME_J;
		m_ODR_SPEC_J = i_ODR_SPEC_J;
		m_ODR_ORG_NAME_J = i_ODR_ORG_NAME_J;
		m_CUST_CONSTRUCT_NAME_J = i_CUST_CONSTRUCT_NAME_J;
		m_CUR_CD = i_CUR_CD;
		m_UNIT_COST_FOREIGN = i_UNIT_COST_FOREIGN;
		m_ODR_AMOUNT_FOREIGN = i_ODR_AMOUNT_FOREIGN;
		m_TAX_AMOUNT_FOREIGN = i_TAX_AMOUNT_FOREIGN;
		m_NET_AMOUNT_FOREIGN = i_NET_AMOUNT_FOREIGN;
		m_MATERIAL_UNIT_PRICE_FOREIGN = i_MATERIAL_UNIT_PRICE_FOREIGN;
		m_BEFORE_ODR_QTY = i_BEFORE_ODR_QTY;
		m_BEFORE_UNIT_COST = i_BEFORE_UNIT_COST;
		m_BEFORE_UNIT_COST_FOREIGN = i_BEFORE_UNIT_COST_FOREIGN;
		m_BEFORE_DLV_DATE_1 = i_BEFORE_DLV_DATE_1;
		m_BEFORE_DLV_QTY_1 = i_BEFORE_DLV_QTY_1;
		m_BEFORE_DLV_DATE_2 = i_BEFORE_DLV_DATE_2;
		m_BEFORE_DLV_QTY_2 = i_BEFORE_DLV_QTY_2;
		m_BEFORE_DLV_DATE_3 = i_BEFORE_DLV_DATE_3;
		m_BEFORE_DLV_QTY_3 = i_BEFORE_DLV_QTY_3;
		m_BEFORE_DLV_DATE_4 = i_BEFORE_DLV_DATE_4;
		m_BEFORE_DLV_QTY_4 = i_BEFORE_DLV_QTY_4;
		m_BEFORE_DLV_DATE_5 = i_BEFORE_DLV_DATE_5;
		m_BEFORE_DLV_QTY_5 = i_BEFORE_DLV_QTY_5;
		m_ODR_RETURN_DATE = i_ODR_RETURN_DATE;
		m_REJECT_RETURN_TYP = i_REJECT_RETURN_TYP;
		m_EDI_ODR_ISS_FLG = i_EDI_ODR_ISS_FLG;
		m_EDI_ODR_ISS_DATE = i_EDI_ODR_ISS_DATE;
		m_l_PUCH_ODR_START_DATE = i_l_PUCH_ODR_START_DATE;
		m_l_PUCH_ODR_DLV_DATE = i_l_PUCH_ODR_DLV_DATE;
		m_l_VEND_CD = i_l_VEND_CD;
		m_l_VEND_ANAME = i_l_VEND_ANAME;
		m_l_ITEM_CD = i_l_ITEM_CD;
		m_l_ITEM_NAME = i_l_ITEM_NAME;
		m_l_PUCH_ODR_QTY = i_l_PUCH_ODR_QTY;
		m_l_STOCK_UNIT = i_l_STOCK_UNIT;
		m_l_PUCH_ODR_CD = i_l_PUCH_ODR_CD;
		m_l_JOB_ODR_CD = i_l_JOB_ODR_CD;
		m_l_PUCH_ODR_EDI_ISS_DATE = i_l_PUCH_ODR_EDI_ISS_DATE;
		m_l_BUSINESS_OPR_DATE = i_l_BUSINESS_OPR_DATE;
		m_l_MODIFY_COUNT = i_l_MODIFY_COUNT;
		m_PUCH_ODR_START_DATE = i_PUCH_ODR_START_DATE;
		m_PUCH_ODR_DLV_DATE = i_PUCH_ODR_DLV_DATE;
		m_PUCH_ODR_STS_TYP = i_PUCH_ODR_STS_TYP;
		m_PUCH_ODR_EDI_ISS_FLG = i_PUCH_ODR_EDI_ISS_FLG;
		m_Not_PUCH_ODR_EDI_ISS_FLG = i_Not_PUCH_ODR_EDI_ISS_FLG;
		m_EXCH_RATE = i_EXCH_RATE;
		m_ODR_CANCEL_EDI_ISS_DATE = i_ODR_CANCEL_EDI_ISS_DATE;
		m_PLANT_NAME = i_PLANT_NAME;
		m_VEND_NAME = i_VEND_NAME;
		m_USER_NAME = i_USER_NAME;
		m_MODIFY_COUNT = i_MODIFY_COUNT;
		m_BUSINESS_OPR_DATE = i_BUSINESS_OPR_DATE;
		m_l_PLANT_CD = i_l_PLANT_CD;
		m_l_PUCH_ODR_SLIP_ISS_DATE = i_l_PUCH_ODR_SLIP_ISS_DATE;
		m_l_ACPT_DATE = i_l_ACPT_DATE;
		m_l_ODR_CANCEL_SLIP_ISS_DATE = i_l_ODR_CANCEL_SLIP_ISS_DATE;
		m_l_PUCH_ODR_PERSON = i_l_PUCH_ODR_PERSON;
		m_l_USER_NAME = i_l_USER_NAME;
		m_l_ODR_CANCEL_CAUSE_CD = i_l_ODR_CANCEL_CAUSE_CD;
		m_l_ACPT_RSLT_COMMENT = i_l_ACPT_RSLT_COMMENT;
		m_PUCH_ODR_START_DATE_FROM = i_PUCH_ODR_START_DATE_FROM;
		m_PUCH_ODR_START_DATE_TO = i_PUCH_ODR_START_DATE_TO;
		m_PUCH_ODR_DLV_DATE_FROM = i_PUCH_ODR_DLV_DATE_FROM;
		m_PUCH_ODR_DLV_DATE_TO = i_PUCH_ODR_DLV_DATE_TO;
		m_ACPT_DATE_FROM = i_ACPT_DATE_FROM;
		m_ACPT_DATE_TO = i_ACPT_DATE_TO;
	}
		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
