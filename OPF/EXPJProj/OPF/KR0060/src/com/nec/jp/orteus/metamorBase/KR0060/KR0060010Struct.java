/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KR0060/src/com/nec/jp/orteus/metamorBase/KR0060/KR0060010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.KR0060;

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
 * CLASS     : KR0060010Control クラス
 * ファイル・クラス説明
 * @author $Author: zhou-kehong $
 * @version $Revision: 1.9 $ $Date: 2014/12/22 06:47:23 $
 *
 */
//}}user_implement_code_header

public class KR0060010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_r_APPR_1 */
	public String m_r_APPR_1 = null;
	/** 第 2 変数： m_r_APPR_2 */
	public String m_r_APPR_2 = null;
	/** 第 3 変数： m_r_APPR_3 */
	public String m_r_APPR_3 = null;
	/** 第 4 変数： m_r_APPR_4 */
	public String m_r_APPR_4 = null;
	/** 第 5 変数： m_h_APPR_POWER_TYP */
	public String m_h_APPR_POWER_TYP = null;
	/** 第 6 変数： m_l_SALES_TYP */
	public String m_l_SALES_TYP = null;
	/** 第 7 変数： m_l_PCL_PRICE_CO */
	public String m_l_PCL_PRICE_CO = null;
	/** 第 8 変数： m_l_INSPC_ACPT_TYP */
	public String m_l_INSPC_ACPT_TYP = null;
	/** 第 9 変数： m_l_APPR_HISTORY */
	public String m_l_APPR_HISTORY = null;
	/** 第 10 変数： m_INSTALL_FLG */
	public String m_INSTALL_FLG = null;
	/** 第 11 変数： m_SECTION_CD */
	public String m_SECTION_CD = null;
	/** 第 12 変数： m_APPR_POWER_TYP */
	public String m_APPR_POWER_TYP = null;
	/** 第 13 変数： m_USER_CD */
	public String m_USER_CD = null;
	/** 第 14 変数： m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** 第 15 変数： m_SYS_PLANT_CD */
	public String m_SYS_PLANT_CD = null;
	/** 第 16 変数： m_SYS_CLASS */
	public String m_SYS_CLASS = null;
	/** 第 17 変数： m_l_ROWNO */
	public String m_l_ROWNO = null;
	/** 第 18 変数： m_l_APPR_ID */
	public String m_l_APPR_ID = null;
	/** 第 19 変数： m_l_APPR_DATE */
	public String m_l_APPR_DATE = null;
	/** 第 20 変数： m_l_RESERVE_CAUSE */
	public String m_l_RESERVE_CAUSE = null;
	/** 第 21 変数： m_l_SALES_SEQ_NO */
	public String m_l_SALES_SEQ_NO = null;
	/** 第 22 変数： m_l_SHIP_ODR_NO */
	public String m_l_SHIP_ODR_NO = null;
	/** 第 23 変数： m_l_SLIP_CD */
	public String m_l_SLIP_CD = null;
	/** 第 24 変数： m_l_SALES_TYP_CD */
	public String m_l_SALES_TYP_CD = null;
	/** 第 25 変数： m_l_CUST_CD */
	public String m_l_CUST_CD = null;
	/** 第 26 変数： m_l_CUST_NAME */
	public String m_l_CUST_NAME = null;
	/** 第 27 変数： m_l_SALES_DEPT_CD */
	public String m_l_SALES_DEPT_CD = null;
	/** 第 28 変数： m_l_ORG_NAME */
	public String m_l_ORG_NAME = null;
	/** 第 29 変数： m_l_ITEM_CD */
	public String m_l_ITEM_CD = null;
	/** 第 30 変数： m_l_ITEM_NAME */
	public String m_l_ITEM_NAME = null;
	/** 第 31 変数： m_l_CUST_ODR_NO */
	public String m_l_CUST_ODR_NO = null;
	/** 第 32 変数： m_l_SALES_DATE */
	public String m_l_SALES_DATE = null;
	/** 第 33 変数： m_l_CUST_CHRG_PSN_CD */
	public String m_l_CUST_CHRG_PSN_CD = null;
	/** 第 34 変数： m_l_CUST_CHRG_PSN_NAME */
	public String m_l_CUST_CHRG_PSN_NAME = null;
	/** 第 35 変数： m_l_ODR_ACPT_PSN_CD */
	public String m_l_ODR_ACPT_PSN_CD = null;
	/** 第 36 変数： m_l_ODR_ACPT_PSN_NAME */
	public String m_l_ODR_ACPT_PSN_NAME = null;
	/** 第 37 変数： m_l_SALES_QTY */
	public String m_l_SALES_QTY = null;
	/** 第 38 変数： m_l_UNIT_COST */
	public String m_l_UNIT_COST = null;
	/** 第 39 変数： m_l_UNIT_CD */
	public String m_l_UNIT_CD = null;
	/** 第 40 変数： m_l_SALES_AMOUNT */
	public String m_l_SALES_AMOUNT = null;
	/** 第 41 変数： m_l_SALES_AMOUNT_EXCH_RATES */
	public String m_l_SALES_AMOUNT_EXCH_RATES = null;
	/** 第 42 変数： m_l_INSPC_ACPT_DATE */
	public String m_l_INSPC_ACPT_DATE = null;
	/** 第 43 変数： m_l_INSPC_ACPT_QTY */
	public String m_l_INSPC_ACPT_QTY = null;
	/** 第 44 変数： m_l_EXTERNAL_TAX_SALES_AMOUNT */
	public String m_l_EXTERNAL_TAX_SALES_AMOUNT = null;
	/** 第 45 変数： m_l_INTERNAL_TAX_SALES_AMOUNT */
	public String m_l_INTERNAL_TAX_SALES_AMOUNT = null;
	/** 第 46 変数： m_l_TAXFREE_SALES_AMOUNT */
	public String m_l_TAXFREE_SALES_AMOUNT = null;
	/** 第 47 変数： m_l_TAX_CREDIT_SALES_AMOUNT */
	public String m_l_TAX_CREDIT_SALES_AMOUNT = null;
	/** 第 48 変数： m_l_EXTERNAL_TAX_AMOUNT */
	public String m_l_EXTERNAL_TAX_AMOUNT = null;
	/** 第 49 変数： m_l_INTERNAL_TAX_AMOUNT */
	public String m_l_INTERNAL_TAX_AMOUNT = null;
	/** 第 50 変数： m_l_TAX_AMOUNT_1 */
	public String m_l_TAX_AMOUNT_1 = null;
	/** 第 51 変数： m_l_TAX_AMOUNT_2 */
	public String m_l_TAX_AMOUNT_2 = null;
	/** 第 52 変数： m_l_TAX_AMOUNT_3 */
	public String m_l_TAX_AMOUNT_3 = null;
	/** 第 53 変数： m_l_OWN_CUR_TAXCREDIT_SALES_AMOUNT */
	public String m_l_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;
	/** 第 54 変数： m_l_ORGN_SLIP_CD */
	public String m_l_ORGN_SLIP_CD = null;
	/** 第 55 変数： m_l_CUR_CD */
	public String m_l_CUR_CD = null;
	/** 第 56 変数： m_l_PCL_PRICE_CO_CD */
	public String m_l_PCL_PRICE_CO_CD = null;
	/** 第 57 変数： m_l_REMARKS */
	public String m_l_REMARKS = null;
	/** 第 58 変数： m_l_INSPC_ACPT_TYP_CD */
	public String m_l_INSPC_ACPT_TYP_CD = null;
	/** 第 59 変数： m_l_MODIFY_COUNT */
	public String m_l_MODIFY_COUNT = null;
	/** 第 60 変数： m_l_AI_AR_IF_FLG */
	public String m_l_AI_AR_IF_FLG = null;
	/** 第 61 変数： m_CUST_CD */
	public String m_CUST_CD = null;
	/** 第 62 変数： m_SALES_DATE_FROM */
	public String m_SALES_DATE_FROM = null;
	/** 第 63 変数： m_SALES_DATE_TO */
	public String m_SALES_DATE_TO = null;
	/** 第 64 変数： m_RAPPR */
	public String m_RAPPR = null;
	/** 第 65 変数： m_CUST_NAME */
	public String m_CUST_NAME = null;
	/** 第 66 変数： m_APPR_FLG */
	public String m_APPR_FLG = null;
	/** 第 67 変数： m_APPR_ID */
	public String m_APPR_ID = null;
	/** 第 68 変数： m_APPR_DATE */
	public String m_APPR_DATE = null;
	/** 第 69 変数： m_RESERVE_CAUSE */
	public String m_RESERVE_CAUSE = null;
	/** 第 70 変数： m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** 第 71 変数： m_h_INSTALL_FLG */
	public String m_h_INSTALL_FLG = null;
	/** 第 72 変数： m_l_ORGNAL_SHIP_DLV_H_NO */
	public String m_l_ORGNAL_SHIP_DLV_H_NO = null;
	/** 第 73 変数： m_l_ORGNAL_SHIP_DLV_D_NO */
	public String m_l_ORGNAL_SHIP_DLV_D_NO = null;
	/** 第 74 変数： m_l_CUST_SALES_QTY */
	public String m_l_CUST_SALES_QTY = null;
	/** 第 75 変数： m_l_CUST_UNIT_CD */
	public String m_l_CUST_UNIT_CD = null;
	/** 第 76 変数： m_l_CUST_INSPC_ACPT_QTY */
	public String m_l_CUST_INSPC_ACPT_QTY = null;
	/** 第 77 変数： m_l_SALES_H_NO */
	public String m_l_SALES_H_NO = null;
	/** 第 78 変数： m_l_SHIP_DLV_H_NO */
	public String m_l_SHIP_DLV_H_NO = null;
	/** 第 79 変数： m_l_SHIP_DLV_D_NO */
	public String m_l_SHIP_DLV_D_NO = null;
	/** 第 80 変数： m_l_TRANS_TYP */
	public String m_l_TRANS_TYP = null;
	/** 第 81 変数： m_l_APPR_HISTORY_FLG */
	public String m_l_APPR_HISTORY_FLG = null;
	/** 第 82 変数： m_u_OPTION_ID */
	public String m_u_OPTION_ID = null;
	/** 第 83 変数： m_l_COUNT */
	public String m_l_COUNT = null;
	/** 第 84 変数： m_ROW_COUNT */
	public String m_ROW_COUNT = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_r_APPR_1 */
	public List l_r_APPR_1 = null;

	/** 第 2 List変数： l_r_APPR_2 */
	public List l_r_APPR_2 = null;

	/** 第 3 List変数： l_r_APPR_3 */
	public List l_r_APPR_3 = null;

	/** 第 4 List変数： l_r_APPR_4 */
	public List l_r_APPR_4 = null;

	/** 第 5 List変数： l_h_APPR_POWER_TYP */
	public List l_h_APPR_POWER_TYP = null;

	/** 第 6 List変数： l_l_SALES_TYP */
	public List l_l_SALES_TYP = null;

	/** 第 7 List変数： l_l_PCL_PRICE_CO */
	public List l_l_PCL_PRICE_CO = null;

	/** 第 8 List変数： l_l_INSPC_ACPT_TYP */
	public List l_l_INSPC_ACPT_TYP = null;

	/** 第 9 List変数： l_l_APPR_HISTORY */
	public List l_l_APPR_HISTORY = null;

	/** 第 10 List変数： l_INSTALL_FLG */
	public List l_INSTALL_FLG = null;

	/** 第 11 List変数： l_SECTION_CD */
	public List l_SECTION_CD = null;

	/** 第 12 List変数： l_APPR_POWER_TYP */
	public List l_APPR_POWER_TYP = null;

	/** 第 13 List変数： l_USER_CD */
	public List l_USER_CD = null;

	/** 第 14 List変数： l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** 第 15 List変数： l_SYS_PLANT_CD */
	public List l_SYS_PLANT_CD = null;

	/** 第 16 List変数： l_SYS_CLASS */
	public List l_SYS_CLASS = null;

	/** 第 17 List変数： l_l_ROWNO */
	public List l_l_ROWNO = null;

	/** 第 18 List変数： l_l_APPR_ID */
	public List l_l_APPR_ID = null;

	/** 第 19 List変数： l_l_APPR_DATE */
	public List l_l_APPR_DATE = null;

	/** 第 20 List変数： l_l_RESERVE_CAUSE */
	public List l_l_RESERVE_CAUSE = null;

	/** 第 21 List変数： l_l_SALES_SEQ_NO */
	public List l_l_SALES_SEQ_NO = null;

	/** 第 22 List変数： l_l_SHIP_ODR_NO */
	public List l_l_SHIP_ODR_NO = null;

	/** 第 23 List変数： l_l_SLIP_CD */
	public List l_l_SLIP_CD = null;

	/** 第 24 List変数： l_l_SALES_TYP_CD */
	public List l_l_SALES_TYP_CD = null;

	/** 第 25 List変数： l_l_CUST_CD */
	public List l_l_CUST_CD = null;

	/** 第 26 List変数： l_l_CUST_NAME */
	public List l_l_CUST_NAME = null;

	/** 第 27 List変数： l_l_SALES_DEPT_CD */
	public List l_l_SALES_DEPT_CD = null;

	/** 第 28 List変数： l_l_ORG_NAME */
	public List l_l_ORG_NAME = null;

	/** 第 29 List変数： l_l_ITEM_CD */
	public List l_l_ITEM_CD = null;

	/** 第 30 List変数： l_l_ITEM_NAME */
	public List l_l_ITEM_NAME = null;

	/** 第 31 List変数： l_l_CUST_ODR_NO */
	public List l_l_CUST_ODR_NO = null;

	/** 第 32 List変数： l_l_SALES_DATE */
	public List l_l_SALES_DATE = null;

	/** 第 33 List変数： l_l_CUST_CHRG_PSN_CD */
	public List l_l_CUST_CHRG_PSN_CD = null;

	/** 第 34 List変数： l_l_CUST_CHRG_PSN_NAME */
	public List l_l_CUST_CHRG_PSN_NAME = null;

	/** 第 35 List変数： l_l_ODR_ACPT_PSN_CD */
	public List l_l_ODR_ACPT_PSN_CD = null;

	/** 第 36 List変数： l_l_ODR_ACPT_PSN_NAME */
	public List l_l_ODR_ACPT_PSN_NAME = null;

	/** 第 37 List変数： l_l_SALES_QTY */
	public List l_l_SALES_QTY = null;

	/** 第 38 List変数： l_l_UNIT_COST */
	public List l_l_UNIT_COST = null;

	/** 第 39 List変数： l_l_UNIT_CD */
	public List l_l_UNIT_CD = null;

	/** 第 40 List変数： l_l_SALES_AMOUNT */
	public List l_l_SALES_AMOUNT = null;

	/** 第 41 List変数： l_l_SALES_AMOUNT_EXCH_RATES */
	public List l_l_SALES_AMOUNT_EXCH_RATES = null;

	/** 第 42 List変数： l_l_INSPC_ACPT_DATE */
	public List l_l_INSPC_ACPT_DATE = null;

	/** 第 43 List変数： l_l_INSPC_ACPT_QTY */
	public List l_l_INSPC_ACPT_QTY = null;

	/** 第 44 List変数： l_l_EXTERNAL_TAX_SALES_AMOUNT */
	public List l_l_EXTERNAL_TAX_SALES_AMOUNT = null;

	/** 第 45 List変数： l_l_INTERNAL_TAX_SALES_AMOUNT */
	public List l_l_INTERNAL_TAX_SALES_AMOUNT = null;

	/** 第 46 List変数： l_l_TAXFREE_SALES_AMOUNT */
	public List l_l_TAXFREE_SALES_AMOUNT = null;

	/** 第 47 List変数： l_l_TAX_CREDIT_SALES_AMOUNT */
	public List l_l_TAX_CREDIT_SALES_AMOUNT = null;

	/** 第 48 List変数： l_l_EXTERNAL_TAX_AMOUNT */
	public List l_l_EXTERNAL_TAX_AMOUNT = null;

	/** 第 49 List変数： l_l_INTERNAL_TAX_AMOUNT */
	public List l_l_INTERNAL_TAX_AMOUNT = null;

	/** 第 50 List変数： l_l_TAX_AMOUNT_1 */
	public List l_l_TAX_AMOUNT_1 = null;

	/** 第 51 List変数： l_l_TAX_AMOUNT_2 */
	public List l_l_TAX_AMOUNT_2 = null;

	/** 第 52 List変数： l_l_TAX_AMOUNT_3 */
	public List l_l_TAX_AMOUNT_3 = null;

	/** 第 53 List変数： l_l_OWN_CUR_TAXCREDIT_SALES_AMOUNT */
	public List l_l_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;

	/** 第 54 List変数： l_l_ORGN_SLIP_CD */
	public List l_l_ORGN_SLIP_CD = null;

	/** 第 55 List変数： l_l_CUR_CD */
	public List l_l_CUR_CD = null;

	/** 第 56 List変数： l_l_PCL_PRICE_CO_CD */
	public List l_l_PCL_PRICE_CO_CD = null;

	/** 第 57 List変数： l_l_REMARKS */
	public List l_l_REMARKS = null;

	/** 第 58 List変数： l_l_INSPC_ACPT_TYP_CD */
	public List l_l_INSPC_ACPT_TYP_CD = null;

	/** 第 59 List変数： l_l_MODIFY_COUNT */
	public List l_l_MODIFY_COUNT = null;

	/** 第 60 List変数： l_l_AI_AR_IF_FLG */
	public List l_l_AI_AR_IF_FLG = null;

	/** 第 61 List変数： l_CUST_CD */
	public List l_CUST_CD = null;

	/** 第 62 List変数： l_SALES_DATE_FROM */
	public List l_SALES_DATE_FROM = null;

	/** 第 63 List変数： l_SALES_DATE_TO */
	public List l_SALES_DATE_TO = null;

	/** 第 64 List変数： l_RAPPR */
	public List l_RAPPR = null;

	/** 第 65 List変数： l_CUST_NAME */
	public List l_CUST_NAME = null;

	/** 第 66 List変数： l_APPR_FLG */
	public List l_APPR_FLG = null;

	/** 第 67 List変数： l_APPR_ID */
	public List l_APPR_ID = null;

	/** 第 68 List変数： l_APPR_DATE */
	public List l_APPR_DATE = null;

	/** 第 69 List変数： l_RESERVE_CAUSE */
	public List l_RESERVE_CAUSE = null;

	/** 第 70 List変数： l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** 第 71 List変数： l_h_INSTALL_FLG */
	public List l_h_INSTALL_FLG = null;

	/** 第 72 List変数： l_l_ORGNAL_SHIP_DLV_H_NO */
	public List l_l_ORGNAL_SHIP_DLV_H_NO = null;

	/** 第 73 List変数： l_l_ORGNAL_SHIP_DLV_D_NO */
	public List l_l_ORGNAL_SHIP_DLV_D_NO = null;

	/** 第 74 List変数： l_l_CUST_SALES_QTY */
	public List l_l_CUST_SALES_QTY = null;

	/** 第 75 List変数： l_l_CUST_UNIT_CD */
	public List l_l_CUST_UNIT_CD = null;

	/** 第 76 List変数： l_l_CUST_INSPC_ACPT_QTY */
	public List l_l_CUST_INSPC_ACPT_QTY = null;

	/** 第 77 List変数： l_l_SALES_H_NO */
	public List l_l_SALES_H_NO = null;

	/** 第 78 List変数： l_l_SHIP_DLV_H_NO */
	public List l_l_SHIP_DLV_H_NO = null;

	/** 第 79 List変数： l_l_SHIP_DLV_D_NO */
	public List l_l_SHIP_DLV_D_NO = null;

	/** 第 80 List変数： l_l_TRANS_TYP */
	public List l_l_TRANS_TYP = null;

	/** 第 81 List変数： l_l_APPR_HISTORY_FLG */
	public List l_l_APPR_HISTORY_FLG = null;

	/** 第 82 List変数： l_u_OPTION_ID */
	public List l_u_OPTION_ID = null;

	/** 第 83 List変数： l_l_COUNT */
	public List l_l_COUNT = null;

	/** 第 84 List変数： l_ROW_COUNT */
	public List l_ROW_COUNT = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getr_APPR_1() { return m_r_APPR_1; }
	public String getr_APPR_2() { return m_r_APPR_2; }
	public String getr_APPR_3() { return m_r_APPR_3; }
	public String getr_APPR_4() { return m_r_APPR_4; }
	public String geth_APPR_POWER_TYP() { return m_h_APPR_POWER_TYP; }
	public String getl_SALES_TYP() { return m_l_SALES_TYP; }
	public String getl_PCL_PRICE_CO() { return m_l_PCL_PRICE_CO; }
	public String getl_INSPC_ACPT_TYP() { return m_l_INSPC_ACPT_TYP; }
	public String getl_APPR_HISTORY() { return m_l_APPR_HISTORY; }
	public String getINSTALL_FLG() { return m_INSTALL_FLG; }
	public String getSECTION_CD() { return m_SECTION_CD; }
	public String getAPPR_POWER_TYP() { return m_APPR_POWER_TYP; }
	public String getUSER_CD() { return m_USER_CD; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getSYS_PLANT_CD() { return m_SYS_PLANT_CD; }
	public String getSYS_CLASS() { return m_SYS_CLASS; }
	public String getl_ROWNO() { return m_l_ROWNO; }
	public String getl_APPR_ID() { return m_l_APPR_ID; }
	public String getl_APPR_DATE() { return m_l_APPR_DATE; }
	public String getl_RESERVE_CAUSE() { return m_l_RESERVE_CAUSE; }
	public String getl_SALES_SEQ_NO() { return m_l_SALES_SEQ_NO; }
	public String getl_SHIP_ODR_NO() { return m_l_SHIP_ODR_NO; }
	public String getl_SLIP_CD() { return m_l_SLIP_CD; }
	public String getl_SALES_TYP_CD() { return m_l_SALES_TYP_CD; }
	public String getl_CUST_CD() { return m_l_CUST_CD; }
	public String getl_CUST_NAME() { return m_l_CUST_NAME; }
	public String getl_SALES_DEPT_CD() { return m_l_SALES_DEPT_CD; }
	public String getl_ORG_NAME() { return m_l_ORG_NAME; }
	public String getl_ITEM_CD() { return m_l_ITEM_CD; }
	public String getl_ITEM_NAME() { return m_l_ITEM_NAME; }
	public String getl_CUST_ODR_NO() { return m_l_CUST_ODR_NO; }
	public String getl_SALES_DATE() { return m_l_SALES_DATE; }
	public String getl_CUST_CHRG_PSN_CD() { return m_l_CUST_CHRG_PSN_CD; }
	public String getl_CUST_CHRG_PSN_NAME() { return m_l_CUST_CHRG_PSN_NAME; }
	public String getl_ODR_ACPT_PSN_CD() { return m_l_ODR_ACPT_PSN_CD; }
	public String getl_ODR_ACPT_PSN_NAME() { return m_l_ODR_ACPT_PSN_NAME; }
	public String getl_SALES_QTY() { return m_l_SALES_QTY; }
	public String getl_UNIT_COST() { return m_l_UNIT_COST; }
	public String getl_UNIT_CD() { return m_l_UNIT_CD; }
	public String getl_SALES_AMOUNT() { return m_l_SALES_AMOUNT; }
	public String getl_SALES_AMOUNT_EXCH_RATES() { return m_l_SALES_AMOUNT_EXCH_RATES; }
	public String getl_INSPC_ACPT_DATE() { return m_l_INSPC_ACPT_DATE; }
	public String getl_INSPC_ACPT_QTY() { return m_l_INSPC_ACPT_QTY; }
	public String getl_EXTERNAL_TAX_SALES_AMOUNT() { return m_l_EXTERNAL_TAX_SALES_AMOUNT; }
	public String getl_INTERNAL_TAX_SALES_AMOUNT() { return m_l_INTERNAL_TAX_SALES_AMOUNT; }
	public String getl_TAXFREE_SALES_AMOUNT() { return m_l_TAXFREE_SALES_AMOUNT; }
	public String getl_TAX_CREDIT_SALES_AMOUNT() { return m_l_TAX_CREDIT_SALES_AMOUNT; }
	public String getl_EXTERNAL_TAX_AMOUNT() { return m_l_EXTERNAL_TAX_AMOUNT; }
	public String getl_INTERNAL_TAX_AMOUNT() { return m_l_INTERNAL_TAX_AMOUNT; }
	public String getl_TAX_AMOUNT_1() { return m_l_TAX_AMOUNT_1; }
	public String getl_TAX_AMOUNT_2() { return m_l_TAX_AMOUNT_2; }
	public String getl_TAX_AMOUNT_3() { return m_l_TAX_AMOUNT_3; }
	public String getl_OWN_CUR_TAXCREDIT_SALES_AMOUNT() { return m_l_OWN_CUR_TAXCREDIT_SALES_AMOUNT; }
	public String getl_ORGN_SLIP_CD() { return m_l_ORGN_SLIP_CD; }
	public String getl_CUR_CD() { return m_l_CUR_CD; }
	public String getl_PCL_PRICE_CO_CD() { return m_l_PCL_PRICE_CO_CD; }
	public String getl_REMARKS() { return m_l_REMARKS; }
	public String getl_INSPC_ACPT_TYP_CD() { return m_l_INSPC_ACPT_TYP_CD; }
	public String getl_MODIFY_COUNT() { return m_l_MODIFY_COUNT; }
	public String getl_AI_AR_IF_FLG() { return m_l_AI_AR_IF_FLG; }
	public String getCUST_CD() { return m_CUST_CD; }
	public String getSALES_DATE_FROM() { return m_SALES_DATE_FROM; }
	public String getSALES_DATE_TO() { return m_SALES_DATE_TO; }
	public String getRAPPR() { return m_RAPPR; }
	public String getCUST_NAME() { return m_CUST_NAME; }
	public String getAPPR_FLG() { return m_APPR_FLG; }
	public String getAPPR_ID() { return m_APPR_ID; }
	public String getAPPR_DATE() { return m_APPR_DATE; }
	public String getRESERVE_CAUSE() { return m_RESERVE_CAUSE; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String geth_INSTALL_FLG() { return m_h_INSTALL_FLG; }
	public String getl_ORGNAL_SHIP_DLV_H_NO() { return m_l_ORGNAL_SHIP_DLV_H_NO; }
	public String getl_ORGNAL_SHIP_DLV_D_NO() { return m_l_ORGNAL_SHIP_DLV_D_NO; }
	public String getl_CUST_SALES_QTY() { return m_l_CUST_SALES_QTY; }
	public String getl_CUST_UNIT_CD() { return m_l_CUST_UNIT_CD; }
	public String getl_CUST_INSPC_ACPT_QTY() { return m_l_CUST_INSPC_ACPT_QTY; }
	public String getl_SALES_H_NO() { return m_l_SALES_H_NO; }
	public String getl_SHIP_DLV_H_NO() { return m_l_SHIP_DLV_H_NO; }
	public String getl_SHIP_DLV_D_NO() { return m_l_SHIP_DLV_D_NO; }
	public String getl_TRANS_TYP() { return m_l_TRANS_TYP; }
	public String getl_APPR_HISTORY_FLG() { return m_l_APPR_HISTORY_FLG; }
	public String getu_OPTION_ID() { return m_u_OPTION_ID; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }

	public List getList_r_APPR_1() { return l_r_APPR_1; }
	public List getList_r_APPR_2() { return l_r_APPR_2; }
	public List getList_r_APPR_3() { return l_r_APPR_3; }
	public List getList_r_APPR_4() { return l_r_APPR_4; }
	public List getList_h_APPR_POWER_TYP() { return l_h_APPR_POWER_TYP; }
	public List getList_l_SALES_TYP() { return l_l_SALES_TYP; }
	public List getList_l_PCL_PRICE_CO() { return l_l_PCL_PRICE_CO; }
	public List getList_l_INSPC_ACPT_TYP() { return l_l_INSPC_ACPT_TYP; }
	public List getList_l_APPR_HISTORY() { return l_l_APPR_HISTORY; }
	public List getList_INSTALL_FLG() { return l_INSTALL_FLG; }
	public List getList_SECTION_CD() { return l_SECTION_CD; }
	public List getList_APPR_POWER_TYP() { return l_APPR_POWER_TYP; }
	public List getList_USER_CD() { return l_USER_CD; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_SYS_PLANT_CD() { return l_SYS_PLANT_CD; }
	public List getList_SYS_CLASS() { return l_SYS_CLASS; }
	public List getList_l_ROWNO() { return l_l_ROWNO; }
	public List getList_l_APPR_ID() { return l_l_APPR_ID; }
	public List getList_l_APPR_DATE() { return l_l_APPR_DATE; }
	public List getList_l_RESERVE_CAUSE() { return l_l_RESERVE_CAUSE; }
	public List getList_l_SALES_SEQ_NO() { return l_l_SALES_SEQ_NO; }
	public List getList_l_SHIP_ODR_NO() { return l_l_SHIP_ODR_NO; }
	public List getList_l_SLIP_CD() { return l_l_SLIP_CD; }
	public List getList_l_SALES_TYP_CD() { return l_l_SALES_TYP_CD; }
	public List getList_l_CUST_CD() { return l_l_CUST_CD; }
	public List getList_l_CUST_NAME() { return l_l_CUST_NAME; }
	public List getList_l_SALES_DEPT_CD() { return l_l_SALES_DEPT_CD; }
	public List getList_l_ORG_NAME() { return l_l_ORG_NAME; }
	public List getList_l_ITEM_CD() { return l_l_ITEM_CD; }
	public List getList_l_ITEM_NAME() { return l_l_ITEM_NAME; }
	public List getList_l_CUST_ODR_NO() { return l_l_CUST_ODR_NO; }
	public List getList_l_SALES_DATE() { return l_l_SALES_DATE; }
	public List getList_l_CUST_CHRG_PSN_CD() { return l_l_CUST_CHRG_PSN_CD; }
	public List getList_l_CUST_CHRG_PSN_NAME() { return l_l_CUST_CHRG_PSN_NAME; }
	public List getList_l_ODR_ACPT_PSN_CD() { return l_l_ODR_ACPT_PSN_CD; }
	public List getList_l_ODR_ACPT_PSN_NAME() { return l_l_ODR_ACPT_PSN_NAME; }
	public List getList_l_SALES_QTY() { return l_l_SALES_QTY; }
	public List getList_l_UNIT_COST() { return l_l_UNIT_COST; }
	public List getList_l_UNIT_CD() { return l_l_UNIT_CD; }
	public List getList_l_SALES_AMOUNT() { return l_l_SALES_AMOUNT; }
	public List getList_l_SALES_AMOUNT_EXCH_RATES() { return l_l_SALES_AMOUNT_EXCH_RATES; }
	public List getList_l_INSPC_ACPT_DATE() { return l_l_INSPC_ACPT_DATE; }
	public List getList_l_INSPC_ACPT_QTY() { return l_l_INSPC_ACPT_QTY; }
	public List getList_l_EXTERNAL_TAX_SALES_AMOUNT() { return l_l_EXTERNAL_TAX_SALES_AMOUNT; }
	public List getList_l_INTERNAL_TAX_SALES_AMOUNT() { return l_l_INTERNAL_TAX_SALES_AMOUNT; }
	public List getList_l_TAXFREE_SALES_AMOUNT() { return l_l_TAXFREE_SALES_AMOUNT; }
	public List getList_l_TAX_CREDIT_SALES_AMOUNT() { return l_l_TAX_CREDIT_SALES_AMOUNT; }
	public List getList_l_EXTERNAL_TAX_AMOUNT() { return l_l_EXTERNAL_TAX_AMOUNT; }
	public List getList_l_INTERNAL_TAX_AMOUNT() { return l_l_INTERNAL_TAX_AMOUNT; }
	public List getList_l_TAX_AMOUNT_1() { return l_l_TAX_AMOUNT_1; }
	public List getList_l_TAX_AMOUNT_2() { return l_l_TAX_AMOUNT_2; }
	public List getList_l_TAX_AMOUNT_3() { return l_l_TAX_AMOUNT_3; }
	public List getList_l_OWN_CUR_TAXCREDIT_SALES_AMOUNT() { return l_l_OWN_CUR_TAXCREDIT_SALES_AMOUNT; }
	public List getList_l_ORGN_SLIP_CD() { return l_l_ORGN_SLIP_CD; }
	public List getList_l_CUR_CD() { return l_l_CUR_CD; }
	public List getList_l_PCL_PRICE_CO_CD() { return l_l_PCL_PRICE_CO_CD; }
	public List getList_l_REMARKS() { return l_l_REMARKS; }
	public List getList_l_INSPC_ACPT_TYP_CD() { return l_l_INSPC_ACPT_TYP_CD; }
	public List getList_l_MODIFY_COUNT() { return l_l_MODIFY_COUNT; }
	public List getList_l_AI_AR_IF_FLG() { return l_l_AI_AR_IF_FLG; }
	public List getList_CUST_CD() { return l_CUST_CD; }
	public List getList_SALES_DATE_FROM() { return l_SALES_DATE_FROM; }
	public List getList_SALES_DATE_TO() { return l_SALES_DATE_TO; }
	public List getList_RAPPR() { return l_RAPPR; }
	public List getList_CUST_NAME() { return l_CUST_NAME; }
	public List getList_APPR_FLG() { return l_APPR_FLG; }
	public List getList_APPR_ID() { return l_APPR_ID; }
	public List getList_APPR_DATE() { return l_APPR_DATE; }
	public List getList_RESERVE_CAUSE() { return l_RESERVE_CAUSE; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_h_INSTALL_FLG() { return l_h_INSTALL_FLG; }
	public List getList_l_ORGNAL_SHIP_DLV_H_NO() { return l_l_ORGNAL_SHIP_DLV_H_NO; }
	public List getList_l_ORGNAL_SHIP_DLV_D_NO() { return l_l_ORGNAL_SHIP_DLV_D_NO; }
	public List getList_l_CUST_SALES_QTY() { return l_l_CUST_SALES_QTY; }
	public List getList_l_CUST_UNIT_CD() { return l_l_CUST_UNIT_CD; }
	public List getList_l_CUST_INSPC_ACPT_QTY() { return l_l_CUST_INSPC_ACPT_QTY; }
	public List getList_l_SALES_H_NO() { return l_l_SALES_H_NO; }
	public List getList_l_SHIP_DLV_H_NO() { return l_l_SHIP_DLV_H_NO; }
	public List getList_l_SHIP_DLV_D_NO() { return l_l_SHIP_DLV_D_NO; }
	public List getList_l_TRANS_TYP() { return l_l_TRANS_TYP; }
	public List getList_l_APPR_HISTORY_FLG() { return l_l_APPR_HISTORY_FLG; }
	public List getList_u_OPTION_ID() { return l_u_OPTION_ID; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }

	public void setr_APPR_1(String val) { m_r_APPR_1 = val; }
	public void setr_APPR_2(String val) { m_r_APPR_2 = val; }
	public void setr_APPR_3(String val) { m_r_APPR_3 = val; }
	public void setr_APPR_4(String val) { m_r_APPR_4 = val; }
	public void seth_APPR_POWER_TYP(String val) { m_h_APPR_POWER_TYP = val; }
	public void setl_SALES_TYP(String val) { m_l_SALES_TYP = val; }
	public void setl_PCL_PRICE_CO(String val) { m_l_PCL_PRICE_CO = val; }
	public void setl_INSPC_ACPT_TYP(String val) { m_l_INSPC_ACPT_TYP = val; }
	public void setl_APPR_HISTORY(String val) { m_l_APPR_HISTORY = val; }
	public void setINSTALL_FLG(String val) { m_INSTALL_FLG = val; }
	public void setSECTION_CD(String val) { m_SECTION_CD = val; }
	public void setAPPR_POWER_TYP(String val) { m_APPR_POWER_TYP = val; }
	public void setUSER_CD(String val) { m_USER_CD = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setSYS_PLANT_CD(String val) { m_SYS_PLANT_CD = val; }
	public void setSYS_CLASS(String val) { m_SYS_CLASS = val; }
	public void setl_ROWNO(String val) { m_l_ROWNO = val; }
	public void setl_APPR_ID(String val) { m_l_APPR_ID = val; }
	public void setl_APPR_DATE(String val) { m_l_APPR_DATE = val; }
	public void setl_RESERVE_CAUSE(String val) { m_l_RESERVE_CAUSE = val; }
	public void setl_SALES_SEQ_NO(String val) { m_l_SALES_SEQ_NO = val; }
	public void setl_SHIP_ODR_NO(String val) { m_l_SHIP_ODR_NO = val; }
	public void setl_SLIP_CD(String val) { m_l_SLIP_CD = val; }
	public void setl_SALES_TYP_CD(String val) { m_l_SALES_TYP_CD = val; }
	public void setl_CUST_CD(String val) { m_l_CUST_CD = val; }
	public void setl_CUST_NAME(String val) { m_l_CUST_NAME = val; }
	public void setl_SALES_DEPT_CD(String val) { m_l_SALES_DEPT_CD = val; }
	public void setl_ORG_NAME(String val) { m_l_ORG_NAME = val; }
	public void setl_ITEM_CD(String val) { m_l_ITEM_CD = val; }
	public void setl_ITEM_NAME(String val) { m_l_ITEM_NAME = val; }
	public void setl_CUST_ODR_NO(String val) { m_l_CUST_ODR_NO = val; }
	public void setl_SALES_DATE(String val) { m_l_SALES_DATE = val; }
	public void setl_CUST_CHRG_PSN_CD(String val) { m_l_CUST_CHRG_PSN_CD = val; }
	public void setl_CUST_CHRG_PSN_NAME(String val) { m_l_CUST_CHRG_PSN_NAME = val; }
	public void setl_ODR_ACPT_PSN_CD(String val) { m_l_ODR_ACPT_PSN_CD = val; }
	public void setl_ODR_ACPT_PSN_NAME(String val) { m_l_ODR_ACPT_PSN_NAME = val; }
	public void setl_SALES_QTY(String val) { m_l_SALES_QTY = val; }
	public void setl_UNIT_COST(String val) { m_l_UNIT_COST = val; }
	public void setl_UNIT_CD(String val) { m_l_UNIT_CD = val; }
	public void setl_SALES_AMOUNT(String val) { m_l_SALES_AMOUNT = val; }
	public void setl_SALES_AMOUNT_EXCH_RATES(String val) { m_l_SALES_AMOUNT_EXCH_RATES = val; }
	public void setl_INSPC_ACPT_DATE(String val) { m_l_INSPC_ACPT_DATE = val; }
	public void setl_INSPC_ACPT_QTY(String val) { m_l_INSPC_ACPT_QTY = val; }
	public void setl_EXTERNAL_TAX_SALES_AMOUNT(String val) { m_l_EXTERNAL_TAX_SALES_AMOUNT = val; }
	public void setl_INTERNAL_TAX_SALES_AMOUNT(String val) { m_l_INTERNAL_TAX_SALES_AMOUNT = val; }
	public void setl_TAXFREE_SALES_AMOUNT(String val) { m_l_TAXFREE_SALES_AMOUNT = val; }
	public void setl_TAX_CREDIT_SALES_AMOUNT(String val) { m_l_TAX_CREDIT_SALES_AMOUNT = val; }
	public void setl_EXTERNAL_TAX_AMOUNT(String val) { m_l_EXTERNAL_TAX_AMOUNT = val; }
	public void setl_INTERNAL_TAX_AMOUNT(String val) { m_l_INTERNAL_TAX_AMOUNT = val; }
	public void setl_TAX_AMOUNT_1(String val) { m_l_TAX_AMOUNT_1 = val; }
	public void setl_TAX_AMOUNT_2(String val) { m_l_TAX_AMOUNT_2 = val; }
	public void setl_TAX_AMOUNT_3(String val) { m_l_TAX_AMOUNT_3 = val; }
	public void setl_OWN_CUR_TAXCREDIT_SALES_AMOUNT(String val) { m_l_OWN_CUR_TAXCREDIT_SALES_AMOUNT = val; }
	public void setl_ORGN_SLIP_CD(String val) { m_l_ORGN_SLIP_CD = val; }
	public void setl_CUR_CD(String val) { m_l_CUR_CD = val; }
	public void setl_PCL_PRICE_CO_CD(String val) { m_l_PCL_PRICE_CO_CD = val; }
	public void setl_REMARKS(String val) { m_l_REMARKS = val; }
	public void setl_INSPC_ACPT_TYP_CD(String val) { m_l_INSPC_ACPT_TYP_CD = val; }
	public void setl_MODIFY_COUNT(String val) { m_l_MODIFY_COUNT = val; }
	public void setl_AI_AR_IF_FLG(String val) { m_l_AI_AR_IF_FLG = val; }
	public void setCUST_CD(String val) { m_CUST_CD = val; }
	public void setSALES_DATE_FROM(String val) { m_SALES_DATE_FROM = val; }
	public void setSALES_DATE_TO(String val) { m_SALES_DATE_TO = val; }
	public void setRAPPR(String val) { m_RAPPR = val; }
	public void setCUST_NAME(String val) { m_CUST_NAME = val; }
	public void setAPPR_FLG(String val) { m_APPR_FLG = val; }
	public void setAPPR_ID(String val) { m_APPR_ID = val; }
	public void setAPPR_DATE(String val) { m_APPR_DATE = val; }
	public void setRESERVE_CAUSE(String val) { m_RESERVE_CAUSE = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void seth_INSTALL_FLG(String val) { m_h_INSTALL_FLG = val; }
	public void setl_ORGNAL_SHIP_DLV_H_NO(String val) { m_l_ORGNAL_SHIP_DLV_H_NO = val; }
	public void setl_ORGNAL_SHIP_DLV_D_NO(String val) { m_l_ORGNAL_SHIP_DLV_D_NO = val; }
	public void setl_CUST_SALES_QTY(String val) { m_l_CUST_SALES_QTY = val; }
	public void setl_CUST_UNIT_CD(String val) { m_l_CUST_UNIT_CD = val; }
	public void setl_CUST_INSPC_ACPT_QTY(String val) { m_l_CUST_INSPC_ACPT_QTY = val; }
	public void setl_SALES_H_NO(String val) { m_l_SALES_H_NO = val; }
	public void setl_SHIP_DLV_H_NO(String val) { m_l_SHIP_DLV_H_NO = val; }
	public void setl_SHIP_DLV_D_NO(String val) { m_l_SHIP_DLV_D_NO = val; }
	public void setl_TRANS_TYP(String val) { m_l_TRANS_TYP = val; }
	public void setl_APPR_HISTORY_FLG(String val) { m_l_APPR_HISTORY_FLG = val; }
	public void setu_OPTION_ID(String val) { m_u_OPTION_ID = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }


	public void setList_r_APPR_1(List list) { l_r_APPR_1 = list; }
	public void setList_r_APPR_2(List list) { l_r_APPR_2 = list; }
	public void setList_r_APPR_3(List list) { l_r_APPR_3 = list; }
	public void setList_r_APPR_4(List list) { l_r_APPR_4 = list; }
	public void setList_h_APPR_POWER_TYP(List list) { l_h_APPR_POWER_TYP = list; }
	public void setList_l_SALES_TYP(List list) { l_l_SALES_TYP = list; }
	public void setList_l_PCL_PRICE_CO(List list) { l_l_PCL_PRICE_CO = list; }
	public void setList_l_INSPC_ACPT_TYP(List list) { l_l_INSPC_ACPT_TYP = list; }
	public void setList_l_APPR_HISTORY(List list) { l_l_APPR_HISTORY = list; }
	public void setList_INSTALL_FLG(List list) { l_INSTALL_FLG = list; }
	public void setList_SECTION_CD(List list) { l_SECTION_CD = list; }
	public void setList_APPR_POWER_TYP(List list) { l_APPR_POWER_TYP = list; }
	public void setList_USER_CD(List list) { l_USER_CD = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_SYS_PLANT_CD(List list) { l_SYS_PLANT_CD = list; }
	public void setList_SYS_CLASS(List list) { l_SYS_CLASS = list; }
	public void setList_l_ROWNO(List list) { l_l_ROWNO = list; }
	public void setList_l_APPR_ID(List list) { l_l_APPR_ID = list; }
	public void setList_l_APPR_DATE(List list) { l_l_APPR_DATE = list; }
	public void setList_l_RESERVE_CAUSE(List list) { l_l_RESERVE_CAUSE = list; }
	public void setList_l_SALES_SEQ_NO(List list) { l_l_SALES_SEQ_NO = list; }
	public void setList_l_SHIP_ODR_NO(List list) { l_l_SHIP_ODR_NO = list; }
	public void setList_l_SLIP_CD(List list) { l_l_SLIP_CD = list; }
	public void setList_l_SALES_TYP_CD(List list) { l_l_SALES_TYP_CD = list; }
	public void setList_l_CUST_CD(List list) { l_l_CUST_CD = list; }
	public void setList_l_CUST_NAME(List list) { l_l_CUST_NAME = list; }
	public void setList_l_SALES_DEPT_CD(List list) { l_l_SALES_DEPT_CD = list; }
	public void setList_l_ORG_NAME(List list) { l_l_ORG_NAME = list; }
	public void setList_l_ITEM_CD(List list) { l_l_ITEM_CD = list; }
	public void setList_l_ITEM_NAME(List list) { l_l_ITEM_NAME = list; }
	public void setList_l_CUST_ODR_NO(List list) { l_l_CUST_ODR_NO = list; }
	public void setList_l_SALES_DATE(List list) { l_l_SALES_DATE = list; }
	public void setList_l_CUST_CHRG_PSN_CD(List list) { l_l_CUST_CHRG_PSN_CD = list; }
	public void setList_l_CUST_CHRG_PSN_NAME(List list) { l_l_CUST_CHRG_PSN_NAME = list; }
	public void setList_l_ODR_ACPT_PSN_CD(List list) { l_l_ODR_ACPT_PSN_CD = list; }
	public void setList_l_ODR_ACPT_PSN_NAME(List list) { l_l_ODR_ACPT_PSN_NAME = list; }
	public void setList_l_SALES_QTY(List list) { l_l_SALES_QTY = list; }
	public void setList_l_UNIT_COST(List list) { l_l_UNIT_COST = list; }
	public void setList_l_UNIT_CD(List list) { l_l_UNIT_CD = list; }
	public void setList_l_SALES_AMOUNT(List list) { l_l_SALES_AMOUNT = list; }
	public void setList_l_SALES_AMOUNT_EXCH_RATES(List list) { l_l_SALES_AMOUNT_EXCH_RATES = list; }
	public void setList_l_INSPC_ACPT_DATE(List list) { l_l_INSPC_ACPT_DATE = list; }
	public void setList_l_INSPC_ACPT_QTY(List list) { l_l_INSPC_ACPT_QTY = list; }
	public void setList_l_EXTERNAL_TAX_SALES_AMOUNT(List list) { l_l_EXTERNAL_TAX_SALES_AMOUNT = list; }
	public void setList_l_INTERNAL_TAX_SALES_AMOUNT(List list) { l_l_INTERNAL_TAX_SALES_AMOUNT = list; }
	public void setList_l_TAXFREE_SALES_AMOUNT(List list) { l_l_TAXFREE_SALES_AMOUNT = list; }
	public void setList_l_TAX_CREDIT_SALES_AMOUNT(List list) { l_l_TAX_CREDIT_SALES_AMOUNT = list; }
	public void setList_l_EXTERNAL_TAX_AMOUNT(List list) { l_l_EXTERNAL_TAX_AMOUNT = list; }
	public void setList_l_INTERNAL_TAX_AMOUNT(List list) { l_l_INTERNAL_TAX_AMOUNT = list; }
	public void setList_l_TAX_AMOUNT_1(List list) { l_l_TAX_AMOUNT_1 = list; }
	public void setList_l_TAX_AMOUNT_2(List list) { l_l_TAX_AMOUNT_2 = list; }
	public void setList_l_TAX_AMOUNT_3(List list) { l_l_TAX_AMOUNT_3 = list; }
	public void setList_l_OWN_CUR_TAXCREDIT_SALES_AMOUNT(List list) { l_l_OWN_CUR_TAXCREDIT_SALES_AMOUNT = list; }
	public void setList_l_ORGN_SLIP_CD(List list) { l_l_ORGN_SLIP_CD = list; }
	public void setList_l_CUR_CD(List list) { l_l_CUR_CD = list; }
	public void setList_l_PCL_PRICE_CO_CD(List list) { l_l_PCL_PRICE_CO_CD = list; }
	public void setList_l_REMARKS(List list) { l_l_REMARKS = list; }
	public void setList_l_INSPC_ACPT_TYP_CD(List list) { l_l_INSPC_ACPT_TYP_CD = list; }
	public void setList_l_MODIFY_COUNT(List list) { l_l_MODIFY_COUNT = list; }
	public void setList_l_AI_AR_IF_FLG(List list) { l_l_AI_AR_IF_FLG = list; }
	public void setList_CUST_CD(List list) { l_CUST_CD = list; }
	public void setList_SALES_DATE_FROM(List list) { l_SALES_DATE_FROM = list; }
	public void setList_SALES_DATE_TO(List list) { l_SALES_DATE_TO = list; }
	public void setList_RAPPR(List list) { l_RAPPR = list; }
	public void setList_CUST_NAME(List list) { l_CUST_NAME = list; }
	public void setList_APPR_FLG(List list) { l_APPR_FLG = list; }
	public void setList_APPR_ID(List list) { l_APPR_ID = list; }
	public void setList_APPR_DATE(List list) { l_APPR_DATE = list; }
	public void setList_RESERVE_CAUSE(List list) { l_RESERVE_CAUSE = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_h_INSTALL_FLG(List list) { l_h_INSTALL_FLG = list; }
	public void setList_l_ORGNAL_SHIP_DLV_H_NO(List list) { l_l_ORGNAL_SHIP_DLV_H_NO = list; }
	public void setList_l_ORGNAL_SHIP_DLV_D_NO(List list) { l_l_ORGNAL_SHIP_DLV_D_NO = list; }
	public void setList_l_CUST_SALES_QTY(List list) { l_l_CUST_SALES_QTY = list; }
	public void setList_l_CUST_UNIT_CD(List list) { l_l_CUST_UNIT_CD = list; }
	public void setList_l_CUST_INSPC_ACPT_QTY(List list) { l_l_CUST_INSPC_ACPT_QTY = list; }
	public void setList_l_SALES_H_NO(List list) { l_l_SALES_H_NO = list; }
	public void setList_l_SHIP_DLV_H_NO(List list) { l_l_SHIP_DLV_H_NO = list; }
	public void setList_l_SHIP_DLV_D_NO(List list) { l_l_SHIP_DLV_D_NO = list; }
	public void setList_l_TRANS_TYP(List list) { l_l_TRANS_TYP = list; }
	public void setList_l_APPR_HISTORY_FLG(List list) { l_l_APPR_HISTORY_FLG = list; }
	public void setList_u_OPTION_ID(List list) { l_u_OPTION_ID = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }

	public int setL2L_r_APPR_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r_APPR_1 == null) {
			l_r_APPR_1 = new ArrayList();
		} else {
			l_r_APPR_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r_APPR_1.add(((KR0060010Struct) list.get(i)).getr_APPR_1());
		}
		return size;
	}
	public int setL2L_r_APPR_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r_APPR_2 == null) {
			l_r_APPR_2 = new ArrayList();
		} else {
			l_r_APPR_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r_APPR_2.add(((KR0060010Struct) list.get(i)).getr_APPR_2());
		}
		return size;
	}
	public int setL2L_r_APPR_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r_APPR_3 == null) {
			l_r_APPR_3 = new ArrayList();
		} else {
			l_r_APPR_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r_APPR_3.add(((KR0060010Struct) list.get(i)).getr_APPR_3());
		}
		return size;
	}
	public int setL2L_r_APPR_4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r_APPR_4 == null) {
			l_r_APPR_4 = new ArrayList();
		} else {
			l_r_APPR_4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r_APPR_4.add(((KR0060010Struct) list.get(i)).getr_APPR_4());
		}
		return size;
	}
	public int setL2L_h_APPR_POWER_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_APPR_POWER_TYP == null) {
			l_h_APPR_POWER_TYP = new ArrayList();
		} else {
			l_h_APPR_POWER_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_APPR_POWER_TYP.add(((KR0060010Struct) list.get(i)).geth_APPR_POWER_TYP());
		}
		return size;
	}
	public int setL2L_l_SALES_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SALES_TYP == null) {
			l_l_SALES_TYP = new ArrayList();
		} else {
			l_l_SALES_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SALES_TYP.add(((KR0060010Struct) list.get(i)).getl_SALES_TYP());
		}
		return size;
	}
	public int setL2L_l_PCL_PRICE_CO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PCL_PRICE_CO == null) {
			l_l_PCL_PRICE_CO = new ArrayList();
		} else {
			l_l_PCL_PRICE_CO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PCL_PRICE_CO.add(((KR0060010Struct) list.get(i)).getl_PCL_PRICE_CO());
		}
		return size;
	}
	public int setL2L_l_INSPC_ACPT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_INSPC_ACPT_TYP == null) {
			l_l_INSPC_ACPT_TYP = new ArrayList();
		} else {
			l_l_INSPC_ACPT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_INSPC_ACPT_TYP.add(((KR0060010Struct) list.get(i)).getl_INSPC_ACPT_TYP());
		}
		return size;
	}
	public int setL2L_l_APPR_HISTORY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_APPR_HISTORY == null) {
			l_l_APPR_HISTORY = new ArrayList();
		} else {
			l_l_APPR_HISTORY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_APPR_HISTORY.add(((KR0060010Struct) list.get(i)).getl_APPR_HISTORY());
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
			l_INSTALL_FLG.add(((KR0060010Struct) list.get(i)).getINSTALL_FLG());
		}
		return size;
	}
	public int setL2L_SECTION_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SECTION_CD == null) {
			l_SECTION_CD = new ArrayList();
		} else {
			l_SECTION_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SECTION_CD.add(((KR0060010Struct) list.get(i)).getSECTION_CD());
		}
		return size;
	}
	public int setL2L_APPR_POWER_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_APPR_POWER_TYP == null) {
			l_APPR_POWER_TYP = new ArrayList();
		} else {
			l_APPR_POWER_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_APPR_POWER_TYP.add(((KR0060010Struct) list.get(i)).getAPPR_POWER_TYP());
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
			l_USER_CD.add(((KR0060010Struct) list.get(i)).getUSER_CD());
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
			l_COMPANY_CD.add(((KR0060010Struct) list.get(i)).getCOMPANY_CD());
		}
		return size;
	}
	public int setL2L_SYS_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SYS_PLANT_CD == null) {
			l_SYS_PLANT_CD = new ArrayList();
		} else {
			l_SYS_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SYS_PLANT_CD.add(((KR0060010Struct) list.get(i)).getSYS_PLANT_CD());
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
			l_SYS_CLASS.add(((KR0060010Struct) list.get(i)).getSYS_CLASS());
		}
		return size;
	}
	public int setL2L_l_ROWNO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ROWNO == null) {
			l_l_ROWNO = new ArrayList();
		} else {
			l_l_ROWNO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ROWNO.add(((KR0060010Struct) list.get(i)).getl_ROWNO());
		}
		return size;
	}
	public int setL2L_l_APPR_ID(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_APPR_ID == null) {
			l_l_APPR_ID = new ArrayList();
		} else {
			l_l_APPR_ID.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_APPR_ID.add(((KR0060010Struct) list.get(i)).getl_APPR_ID());
		}
		return size;
	}
	public int setL2L_l_APPR_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_APPR_DATE == null) {
			l_l_APPR_DATE = new ArrayList();
		} else {
			l_l_APPR_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_APPR_DATE.add(((KR0060010Struct) list.get(i)).getl_APPR_DATE());
		}
		return size;
	}
	public int setL2L_l_RESERVE_CAUSE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_RESERVE_CAUSE == null) {
			l_l_RESERVE_CAUSE = new ArrayList();
		} else {
			l_l_RESERVE_CAUSE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_RESERVE_CAUSE.add(((KR0060010Struct) list.get(i)).getl_RESERVE_CAUSE());
		}
		return size;
	}
	public int setL2L_l_SALES_SEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SALES_SEQ_NO == null) {
			l_l_SALES_SEQ_NO = new ArrayList();
		} else {
			l_l_SALES_SEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SALES_SEQ_NO.add(((KR0060010Struct) list.get(i)).getl_SALES_SEQ_NO());
		}
		return size;
	}
	public int setL2L_l_SHIP_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SHIP_ODR_NO == null) {
			l_l_SHIP_ODR_NO = new ArrayList();
		} else {
			l_l_SHIP_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SHIP_ODR_NO.add(((KR0060010Struct) list.get(i)).getl_SHIP_ODR_NO());
		}
		return size;
	}
	public int setL2L_l_SLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SLIP_CD == null) {
			l_l_SLIP_CD = new ArrayList();
		} else {
			l_l_SLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SLIP_CD.add(((KR0060010Struct) list.get(i)).getl_SLIP_CD());
		}
		return size;
	}
	public int setL2L_l_SALES_TYP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SALES_TYP_CD == null) {
			l_l_SALES_TYP_CD = new ArrayList();
		} else {
			l_l_SALES_TYP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SALES_TYP_CD.add(((KR0060010Struct) list.get(i)).getl_SALES_TYP_CD());
		}
		return size;
	}
	public int setL2L_l_CUST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_CUST_CD == null) {
			l_l_CUST_CD = new ArrayList();
		} else {
			l_l_CUST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_CUST_CD.add(((KR0060010Struct) list.get(i)).getl_CUST_CD());
		}
		return size;
	}
	public int setL2L_l_CUST_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_CUST_NAME == null) {
			l_l_CUST_NAME = new ArrayList();
		} else {
			l_l_CUST_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_CUST_NAME.add(((KR0060010Struct) list.get(i)).getl_CUST_NAME());
		}
		return size;
	}
	public int setL2L_l_SALES_DEPT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SALES_DEPT_CD == null) {
			l_l_SALES_DEPT_CD = new ArrayList();
		} else {
			l_l_SALES_DEPT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SALES_DEPT_CD.add(((KR0060010Struct) list.get(i)).getl_SALES_DEPT_CD());
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
			l_l_ORG_NAME.add(((KR0060010Struct) list.get(i)).getl_ORG_NAME());
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
			l_l_ITEM_CD.add(((KR0060010Struct) list.get(i)).getl_ITEM_CD());
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
			l_l_ITEM_NAME.add(((KR0060010Struct) list.get(i)).getl_ITEM_NAME());
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
			l_l_CUST_ODR_NO.add(((KR0060010Struct) list.get(i)).getl_CUST_ODR_NO());
		}
		return size;
	}
	public int setL2L_l_SALES_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SALES_DATE == null) {
			l_l_SALES_DATE = new ArrayList();
		} else {
			l_l_SALES_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SALES_DATE.add(((KR0060010Struct) list.get(i)).getl_SALES_DATE());
		}
		return size;
	}
	public int setL2L_l_CUST_CHRG_PSN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_CUST_CHRG_PSN_CD == null) {
			l_l_CUST_CHRG_PSN_CD = new ArrayList();
		} else {
			l_l_CUST_CHRG_PSN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_CUST_CHRG_PSN_CD.add(((KR0060010Struct) list.get(i)).getl_CUST_CHRG_PSN_CD());
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
			l_l_CUST_CHRG_PSN_NAME.add(((KR0060010Struct) list.get(i)).getl_CUST_CHRG_PSN_NAME());
		}
		return size;
	}
	public int setL2L_l_ODR_ACPT_PSN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ODR_ACPT_PSN_CD == null) {
			l_l_ODR_ACPT_PSN_CD = new ArrayList();
		} else {
			l_l_ODR_ACPT_PSN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ODR_ACPT_PSN_CD.add(((KR0060010Struct) list.get(i)).getl_ODR_ACPT_PSN_CD());
		}
		return size;
	}
	public int setL2L_l_ODR_ACPT_PSN_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ODR_ACPT_PSN_NAME == null) {
			l_l_ODR_ACPT_PSN_NAME = new ArrayList();
		} else {
			l_l_ODR_ACPT_PSN_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ODR_ACPT_PSN_NAME.add(((KR0060010Struct) list.get(i)).getl_ODR_ACPT_PSN_NAME());
		}
		return size;
	}
	public int setL2L_l_SALES_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SALES_QTY == null) {
			l_l_SALES_QTY = new ArrayList();
		} else {
			l_l_SALES_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SALES_QTY.add(((KR0060010Struct) list.get(i)).getl_SALES_QTY());
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
			l_l_UNIT_COST.add(((KR0060010Struct) list.get(i)).getl_UNIT_COST());
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
			l_l_UNIT_CD.add(((KR0060010Struct) list.get(i)).getl_UNIT_CD());
		}
		return size;
	}
	public int setL2L_l_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SALES_AMOUNT == null) {
			l_l_SALES_AMOUNT = new ArrayList();
		} else {
			l_l_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SALES_AMOUNT.add(((KR0060010Struct) list.get(i)).getl_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_l_SALES_AMOUNT_EXCH_RATES(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SALES_AMOUNT_EXCH_RATES == null) {
			l_l_SALES_AMOUNT_EXCH_RATES = new ArrayList();
		} else {
			l_l_SALES_AMOUNT_EXCH_RATES.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SALES_AMOUNT_EXCH_RATES.add(((KR0060010Struct) list.get(i)).getl_SALES_AMOUNT_EXCH_RATES());
		}
		return size;
	}
	public int setL2L_l_INSPC_ACPT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_INSPC_ACPT_DATE == null) {
			l_l_INSPC_ACPT_DATE = new ArrayList();
		} else {
			l_l_INSPC_ACPT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_INSPC_ACPT_DATE.add(((KR0060010Struct) list.get(i)).getl_INSPC_ACPT_DATE());
		}
		return size;
	}
	public int setL2L_l_INSPC_ACPT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_INSPC_ACPT_QTY == null) {
			l_l_INSPC_ACPT_QTY = new ArrayList();
		} else {
			l_l_INSPC_ACPT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_INSPC_ACPT_QTY.add(((KR0060010Struct) list.get(i)).getl_INSPC_ACPT_QTY());
		}
		return size;
	}
	public int setL2L_l_EXTERNAL_TAX_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_EXTERNAL_TAX_SALES_AMOUNT == null) {
			l_l_EXTERNAL_TAX_SALES_AMOUNT = new ArrayList();
		} else {
			l_l_EXTERNAL_TAX_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_EXTERNAL_TAX_SALES_AMOUNT.add(((KR0060010Struct) list.get(i)).getl_EXTERNAL_TAX_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_l_INTERNAL_TAX_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_INTERNAL_TAX_SALES_AMOUNT == null) {
			l_l_INTERNAL_TAX_SALES_AMOUNT = new ArrayList();
		} else {
			l_l_INTERNAL_TAX_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_INTERNAL_TAX_SALES_AMOUNT.add(((KR0060010Struct) list.get(i)).getl_INTERNAL_TAX_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_l_TAXFREE_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_TAXFREE_SALES_AMOUNT == null) {
			l_l_TAXFREE_SALES_AMOUNT = new ArrayList();
		} else {
			l_l_TAXFREE_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_TAXFREE_SALES_AMOUNT.add(((KR0060010Struct) list.get(i)).getl_TAXFREE_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_l_TAX_CREDIT_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_TAX_CREDIT_SALES_AMOUNT == null) {
			l_l_TAX_CREDIT_SALES_AMOUNT = new ArrayList();
		} else {
			l_l_TAX_CREDIT_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_TAX_CREDIT_SALES_AMOUNT.add(((KR0060010Struct) list.get(i)).getl_TAX_CREDIT_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_l_EXTERNAL_TAX_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_EXTERNAL_TAX_AMOUNT == null) {
			l_l_EXTERNAL_TAX_AMOUNT = new ArrayList();
		} else {
			l_l_EXTERNAL_TAX_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_EXTERNAL_TAX_AMOUNT.add(((KR0060010Struct) list.get(i)).getl_EXTERNAL_TAX_AMOUNT());
		}
		return size;
	}
	public int setL2L_l_INTERNAL_TAX_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_INTERNAL_TAX_AMOUNT == null) {
			l_l_INTERNAL_TAX_AMOUNT = new ArrayList();
		} else {
			l_l_INTERNAL_TAX_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_INTERNAL_TAX_AMOUNT.add(((KR0060010Struct) list.get(i)).getl_INTERNAL_TAX_AMOUNT());
		}
		return size;
	}
	public int setL2L_l_TAX_AMOUNT_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_TAX_AMOUNT_1 == null) {
			l_l_TAX_AMOUNT_1 = new ArrayList();
		} else {
			l_l_TAX_AMOUNT_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_TAX_AMOUNT_1.add(((KR0060010Struct) list.get(i)).getl_TAX_AMOUNT_1());
		}
		return size;
	}
	public int setL2L_l_TAX_AMOUNT_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_TAX_AMOUNT_2 == null) {
			l_l_TAX_AMOUNT_2 = new ArrayList();
		} else {
			l_l_TAX_AMOUNT_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_TAX_AMOUNT_2.add(((KR0060010Struct) list.get(i)).getl_TAX_AMOUNT_2());
		}
		return size;
	}
	public int setL2L_l_TAX_AMOUNT_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_TAX_AMOUNT_3 == null) {
			l_l_TAX_AMOUNT_3 = new ArrayList();
		} else {
			l_l_TAX_AMOUNT_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_TAX_AMOUNT_3.add(((KR0060010Struct) list.get(i)).getl_TAX_AMOUNT_3());
		}
		return size;
	}
	public int setL2L_l_OWN_CUR_TAXCREDIT_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OWN_CUR_TAXCREDIT_SALES_AMOUNT == null) {
			l_l_OWN_CUR_TAXCREDIT_SALES_AMOUNT = new ArrayList();
		} else {
			l_l_OWN_CUR_TAXCREDIT_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OWN_CUR_TAXCREDIT_SALES_AMOUNT.add(((KR0060010Struct) list.get(i)).getl_OWN_CUR_TAXCREDIT_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_l_ORGN_SLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ORGN_SLIP_CD == null) {
			l_l_ORGN_SLIP_CD = new ArrayList();
		} else {
			l_l_ORGN_SLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ORGN_SLIP_CD.add(((KR0060010Struct) list.get(i)).getl_ORGN_SLIP_CD());
		}
		return size;
	}
	public int setL2L_l_CUR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_CUR_CD == null) {
			l_l_CUR_CD = new ArrayList();
		} else {
			l_l_CUR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_CUR_CD.add(((KR0060010Struct) list.get(i)).getl_CUR_CD());
		}
		return size;
	}
	public int setL2L_l_PCL_PRICE_CO_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PCL_PRICE_CO_CD == null) {
			l_l_PCL_PRICE_CO_CD = new ArrayList();
		} else {
			l_l_PCL_PRICE_CO_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PCL_PRICE_CO_CD.add(((KR0060010Struct) list.get(i)).getl_PCL_PRICE_CO_CD());
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
			l_l_REMARKS.add(((KR0060010Struct) list.get(i)).getl_REMARKS());
		}
		return size;
	}
	public int setL2L_l_INSPC_ACPT_TYP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_INSPC_ACPT_TYP_CD == null) {
			l_l_INSPC_ACPT_TYP_CD = new ArrayList();
		} else {
			l_l_INSPC_ACPT_TYP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_INSPC_ACPT_TYP_CD.add(((KR0060010Struct) list.get(i)).getl_INSPC_ACPT_TYP_CD());
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
			l_l_MODIFY_COUNT.add(((KR0060010Struct) list.get(i)).getl_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_l_AI_AR_IF_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_AI_AR_IF_FLG == null) {
			l_l_AI_AR_IF_FLG = new ArrayList();
		} else {
			l_l_AI_AR_IF_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_AI_AR_IF_FLG.add(((KR0060010Struct) list.get(i)).getl_AI_AR_IF_FLG());
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
			l_CUST_CD.add(((KR0060010Struct) list.get(i)).getCUST_CD());
		}
		return size;
	}
	public int setL2L_SALES_DATE_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SALES_DATE_FROM == null) {
			l_SALES_DATE_FROM = new ArrayList();
		} else {
			l_SALES_DATE_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SALES_DATE_FROM.add(((KR0060010Struct) list.get(i)).getSALES_DATE_FROM());
		}
		return size;
	}
	public int setL2L_SALES_DATE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SALES_DATE_TO == null) {
			l_SALES_DATE_TO = new ArrayList();
		} else {
			l_SALES_DATE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SALES_DATE_TO.add(((KR0060010Struct) list.get(i)).getSALES_DATE_TO());
		}
		return size;
	}
	public int setL2L_RAPPR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RAPPR == null) {
			l_RAPPR = new ArrayList();
		} else {
			l_RAPPR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RAPPR.add(((KR0060010Struct) list.get(i)).getRAPPR());
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
			l_CUST_NAME.add(((KR0060010Struct) list.get(i)).getCUST_NAME());
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
			l_APPR_FLG.add(((KR0060010Struct) list.get(i)).getAPPR_FLG());
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
			l_APPR_ID.add(((KR0060010Struct) list.get(i)).getAPPR_ID());
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
			l_APPR_DATE.add(((KR0060010Struct) list.get(i)).getAPPR_DATE());
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
			l_RESERVE_CAUSE.add(((KR0060010Struct) list.get(i)).getRESERVE_CAUSE());
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
			l_MODIFY_COUNT.add(((KR0060010Struct) list.get(i)).getMODIFY_COUNT());
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
			l_h_INSTALL_FLG.add(((KR0060010Struct) list.get(i)).geth_INSTALL_FLG());
		}
		return size;
	}
	public int setL2L_l_ORGNAL_SHIP_DLV_H_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ORGNAL_SHIP_DLV_H_NO == null) {
			l_l_ORGNAL_SHIP_DLV_H_NO = new ArrayList();
		} else {
			l_l_ORGNAL_SHIP_DLV_H_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ORGNAL_SHIP_DLV_H_NO.add(((KR0060010Struct) list.get(i)).getl_ORGNAL_SHIP_DLV_H_NO());
		}
		return size;
	}
	public int setL2L_l_ORGNAL_SHIP_DLV_D_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ORGNAL_SHIP_DLV_D_NO == null) {
			l_l_ORGNAL_SHIP_DLV_D_NO = new ArrayList();
		} else {
			l_l_ORGNAL_SHIP_DLV_D_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ORGNAL_SHIP_DLV_D_NO.add(((KR0060010Struct) list.get(i)).getl_ORGNAL_SHIP_DLV_D_NO());
		}
		return size;
	}
	public int setL2L_l_CUST_SALES_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_CUST_SALES_QTY == null) {
			l_l_CUST_SALES_QTY = new ArrayList();
		} else {
			l_l_CUST_SALES_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_CUST_SALES_QTY.add(((KR0060010Struct) list.get(i)).getl_CUST_SALES_QTY());
		}
		return size;
	}
	public int setL2L_l_CUST_UNIT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_CUST_UNIT_CD == null) {
			l_l_CUST_UNIT_CD = new ArrayList();
		} else {
			l_l_CUST_UNIT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_CUST_UNIT_CD.add(((KR0060010Struct) list.get(i)).getl_CUST_UNIT_CD());
		}
		return size;
	}
	public int setL2L_l_CUST_INSPC_ACPT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_CUST_INSPC_ACPT_QTY == null) {
			l_l_CUST_INSPC_ACPT_QTY = new ArrayList();
		} else {
			l_l_CUST_INSPC_ACPT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_CUST_INSPC_ACPT_QTY.add(((KR0060010Struct) list.get(i)).getl_CUST_INSPC_ACPT_QTY());
		}
		return size;
	}
	public int setL2L_l_SALES_H_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SALES_H_NO == null) {
			l_l_SALES_H_NO = new ArrayList();
		} else {
			l_l_SALES_H_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SALES_H_NO.add(((KR0060010Struct) list.get(i)).getl_SALES_H_NO());
		}
		return size;
	}
	public int setL2L_l_SHIP_DLV_H_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SHIP_DLV_H_NO == null) {
			l_l_SHIP_DLV_H_NO = new ArrayList();
		} else {
			l_l_SHIP_DLV_H_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SHIP_DLV_H_NO.add(((KR0060010Struct) list.get(i)).getl_SHIP_DLV_H_NO());
		}
		return size;
	}
	public int setL2L_l_SHIP_DLV_D_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SHIP_DLV_D_NO == null) {
			l_l_SHIP_DLV_D_NO = new ArrayList();
		} else {
			l_l_SHIP_DLV_D_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SHIP_DLV_D_NO.add(((KR0060010Struct) list.get(i)).getl_SHIP_DLV_D_NO());
		}
		return size;
	}
	public int setL2L_l_TRANS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_TRANS_TYP == null) {
			l_l_TRANS_TYP = new ArrayList();
		} else {
			l_l_TRANS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_TRANS_TYP.add(((KR0060010Struct) list.get(i)).getl_TRANS_TYP());
		}
		return size;
	}
	public int setL2L_l_APPR_HISTORY_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_APPR_HISTORY_FLG == null) {
			l_l_APPR_HISTORY_FLG = new ArrayList();
		} else {
			l_l_APPR_HISTORY_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_APPR_HISTORY_FLG.add(((KR0060010Struct) list.get(i)).getl_APPR_HISTORY_FLG());
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
			l_u_OPTION_ID.add(((KR0060010Struct) list.get(i)).getu_OPTION_ID());
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
			l_l_COUNT.add(((KR0060010Struct) list.get(i)).getl_COUNT());
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
			l_ROW_COUNT.add(((KR0060010Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_r_APPR_1 = null;
		m_r_APPR_2 = null;
		m_r_APPR_3 = null;
		m_r_APPR_4 = null;
		m_h_APPR_POWER_TYP = null;
		m_l_SALES_TYP = null;
		m_l_PCL_PRICE_CO = null;
		m_l_INSPC_ACPT_TYP = null;
		m_l_APPR_HISTORY = null;
		m_INSTALL_FLG = null;
		m_SECTION_CD = null;
		m_APPR_POWER_TYP = null;
		m_USER_CD = null;
		m_COMPANY_CD = null;
		m_SYS_PLANT_CD = null;
		m_SYS_CLASS = null;
		m_l_ROWNO = null;
		m_l_APPR_ID = null;
		m_l_APPR_DATE = null;
		m_l_RESERVE_CAUSE = null;
		m_l_SALES_SEQ_NO = null;
		m_l_SHIP_ODR_NO = null;
		m_l_SLIP_CD = null;
		m_l_SALES_TYP_CD = null;
		m_l_CUST_CD = null;
		m_l_CUST_NAME = null;
		m_l_SALES_DEPT_CD = null;
		m_l_ORG_NAME = null;
		m_l_ITEM_CD = null;
		m_l_ITEM_NAME = null;
		m_l_CUST_ODR_NO = null;
		m_l_SALES_DATE = null;
		m_l_CUST_CHRG_PSN_CD = null;
		m_l_CUST_CHRG_PSN_NAME = null;
		m_l_ODR_ACPT_PSN_CD = null;
		m_l_ODR_ACPT_PSN_NAME = null;
		m_l_SALES_QTY = null;
		m_l_UNIT_COST = null;
		m_l_UNIT_CD = null;
		m_l_SALES_AMOUNT = null;
		m_l_SALES_AMOUNT_EXCH_RATES = null;
		m_l_INSPC_ACPT_DATE = null;
		m_l_INSPC_ACPT_QTY = null;
		m_l_EXTERNAL_TAX_SALES_AMOUNT = null;
		m_l_INTERNAL_TAX_SALES_AMOUNT = null;
		m_l_TAXFREE_SALES_AMOUNT = null;
		m_l_TAX_CREDIT_SALES_AMOUNT = null;
		m_l_EXTERNAL_TAX_AMOUNT = null;
		m_l_INTERNAL_TAX_AMOUNT = null;
		m_l_TAX_AMOUNT_1 = null;
		m_l_TAX_AMOUNT_2 = null;
		m_l_TAX_AMOUNT_3 = null;
		m_l_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;
		m_l_ORGN_SLIP_CD = null;
		m_l_CUR_CD = null;
		m_l_PCL_PRICE_CO_CD = null;
		m_l_REMARKS = null;
		m_l_INSPC_ACPT_TYP_CD = null;
		m_l_MODIFY_COUNT = null;
		m_l_AI_AR_IF_FLG = null;
		m_CUST_CD = null;
		m_SALES_DATE_FROM = null;
		m_SALES_DATE_TO = null;
		m_RAPPR = null;
		m_CUST_NAME = null;
		m_APPR_FLG = null;
		m_APPR_ID = null;
		m_APPR_DATE = null;
		m_RESERVE_CAUSE = null;
		m_MODIFY_COUNT = null;
		m_h_INSTALL_FLG = null;
		m_l_ORGNAL_SHIP_DLV_H_NO = null;
		m_l_ORGNAL_SHIP_DLV_D_NO = null;
		m_l_CUST_SALES_QTY = null;
		m_l_CUST_UNIT_CD = null;
		m_l_CUST_INSPC_ACPT_QTY = null;
		m_l_SALES_H_NO = null;
		m_l_SHIP_DLV_H_NO = null;
		m_l_SHIP_DLV_D_NO = null;
		m_l_TRANS_TYP = null;
		m_l_APPR_HISTORY_FLG = null;
		m_u_OPTION_ID = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;

		l_r_APPR_1 = null;
		l_r_APPR_2 = null;
		l_r_APPR_3 = null;
		l_r_APPR_4 = null;
		l_h_APPR_POWER_TYP = null;
		l_l_SALES_TYP = null;
		l_l_PCL_PRICE_CO = null;
		l_l_INSPC_ACPT_TYP = null;
		l_l_APPR_HISTORY = null;
		l_INSTALL_FLG = null;
		l_SECTION_CD = null;
		l_APPR_POWER_TYP = null;
		l_USER_CD = null;
		l_COMPANY_CD = null;
		l_SYS_PLANT_CD = null;
		l_SYS_CLASS = null;
		l_l_ROWNO = null;
		l_l_APPR_ID = null;
		l_l_APPR_DATE = null;
		l_l_RESERVE_CAUSE = null;
		l_l_SALES_SEQ_NO = null;
		l_l_SHIP_ODR_NO = null;
		l_l_SLIP_CD = null;
		l_l_SALES_TYP_CD = null;
		l_l_CUST_CD = null;
		l_l_CUST_NAME = null;
		l_l_SALES_DEPT_CD = null;
		l_l_ORG_NAME = null;
		l_l_ITEM_CD = null;
		l_l_ITEM_NAME = null;
		l_l_CUST_ODR_NO = null;
		l_l_SALES_DATE = null;
		l_l_CUST_CHRG_PSN_CD = null;
		l_l_CUST_CHRG_PSN_NAME = null;
		l_l_ODR_ACPT_PSN_CD = null;
		l_l_ODR_ACPT_PSN_NAME = null;
		l_l_SALES_QTY = null;
		l_l_UNIT_COST = null;
		l_l_UNIT_CD = null;
		l_l_SALES_AMOUNT = null;
		l_l_SALES_AMOUNT_EXCH_RATES = null;
		l_l_INSPC_ACPT_DATE = null;
		l_l_INSPC_ACPT_QTY = null;
		l_l_EXTERNAL_TAX_SALES_AMOUNT = null;
		l_l_INTERNAL_TAX_SALES_AMOUNT = null;
		l_l_TAXFREE_SALES_AMOUNT = null;
		l_l_TAX_CREDIT_SALES_AMOUNT = null;
		l_l_EXTERNAL_TAX_AMOUNT = null;
		l_l_INTERNAL_TAX_AMOUNT = null;
		l_l_TAX_AMOUNT_1 = null;
		l_l_TAX_AMOUNT_2 = null;
		l_l_TAX_AMOUNT_3 = null;
		l_l_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;
		l_l_ORGN_SLIP_CD = null;
		l_l_CUR_CD = null;
		l_l_PCL_PRICE_CO_CD = null;
		l_l_REMARKS = null;
		l_l_INSPC_ACPT_TYP_CD = null;
		l_l_MODIFY_COUNT = null;
		l_l_AI_AR_IF_FLG = null;
		l_CUST_CD = null;
		l_SALES_DATE_FROM = null;
		l_SALES_DATE_TO = null;
		l_RAPPR = null;
		l_CUST_NAME = null;
		l_APPR_FLG = null;
		l_APPR_ID = null;
		l_APPR_DATE = null;
		l_RESERVE_CAUSE = null;
		l_MODIFY_COUNT = null;
		l_h_INSTALL_FLG = null;
		l_l_ORGNAL_SHIP_DLV_H_NO = null;
		l_l_ORGNAL_SHIP_DLV_D_NO = null;
		l_l_CUST_SALES_QTY = null;
		l_l_CUST_UNIT_CD = null;
		l_l_CUST_INSPC_ACPT_QTY = null;
		l_l_SALES_H_NO = null;
		l_l_SHIP_DLV_H_NO = null;
		l_l_SHIP_DLV_D_NO = null;
		l_l_TRANS_TYP = null;
		l_l_APPR_HISTORY_FLG = null;
		l_u_OPTION_ID = null;
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
	 * medKR0060010クラスの標準コンストラクタ
	 */
	public KR0060010Struct()
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
	public void setStruct(KR0060010Struct struct)
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
	public void setStructM(KR0060010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setr_APPR_1(struct.getr_APPR_1());
			this.setr_APPR_2(struct.getr_APPR_2());
			this.setr_APPR_3(struct.getr_APPR_3());
			this.setr_APPR_4(struct.getr_APPR_4());
			this.seth_APPR_POWER_TYP(struct.geth_APPR_POWER_TYP());
			this.setl_SALES_TYP(struct.getl_SALES_TYP());
			this.setl_PCL_PRICE_CO(struct.getl_PCL_PRICE_CO());
			this.setl_INSPC_ACPT_TYP(struct.getl_INSPC_ACPT_TYP());
			this.setl_APPR_HISTORY(struct.getl_APPR_HISTORY());
			this.setINSTALL_FLG(struct.getINSTALL_FLG());
			this.setSECTION_CD(struct.getSECTION_CD());
			this.setAPPR_POWER_TYP(struct.getAPPR_POWER_TYP());
			this.setUSER_CD(struct.getUSER_CD());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setSYS_PLANT_CD(struct.getSYS_PLANT_CD());
			this.setSYS_CLASS(struct.getSYS_CLASS());
			this.setl_ROWNO(struct.getl_ROWNO());
			this.setl_APPR_ID(struct.getl_APPR_ID());
			this.setl_APPR_DATE(struct.getl_APPR_DATE());
			this.setl_RESERVE_CAUSE(struct.getl_RESERVE_CAUSE());
			this.setl_SALES_SEQ_NO(struct.getl_SALES_SEQ_NO());
			this.setl_SHIP_ODR_NO(struct.getl_SHIP_ODR_NO());
			this.setl_SLIP_CD(struct.getl_SLIP_CD());
			this.setl_SALES_TYP_CD(struct.getl_SALES_TYP_CD());
			this.setl_CUST_CD(struct.getl_CUST_CD());
			this.setl_CUST_NAME(struct.getl_CUST_NAME());
			this.setl_SALES_DEPT_CD(struct.getl_SALES_DEPT_CD());
			this.setl_ORG_NAME(struct.getl_ORG_NAME());
			this.setl_ITEM_CD(struct.getl_ITEM_CD());
			this.setl_ITEM_NAME(struct.getl_ITEM_NAME());
			this.setl_CUST_ODR_NO(struct.getl_CUST_ODR_NO());
			this.setl_SALES_DATE(struct.getl_SALES_DATE());
			this.setl_CUST_CHRG_PSN_CD(struct.getl_CUST_CHRG_PSN_CD());
			this.setl_CUST_CHRG_PSN_NAME(struct.getl_CUST_CHRG_PSN_NAME());
			this.setl_ODR_ACPT_PSN_CD(struct.getl_ODR_ACPT_PSN_CD());
			this.setl_ODR_ACPT_PSN_NAME(struct.getl_ODR_ACPT_PSN_NAME());
			this.setl_SALES_QTY(struct.getl_SALES_QTY());
			this.setl_UNIT_COST(struct.getl_UNIT_COST());
			this.setl_UNIT_CD(struct.getl_UNIT_CD());
			this.setl_SALES_AMOUNT(struct.getl_SALES_AMOUNT());
			this.setl_SALES_AMOUNT_EXCH_RATES(struct.getl_SALES_AMOUNT_EXCH_RATES());
			this.setl_INSPC_ACPT_DATE(struct.getl_INSPC_ACPT_DATE());
			this.setl_INSPC_ACPT_QTY(struct.getl_INSPC_ACPT_QTY());
			this.setl_EXTERNAL_TAX_SALES_AMOUNT(struct.getl_EXTERNAL_TAX_SALES_AMOUNT());
			this.setl_INTERNAL_TAX_SALES_AMOUNT(struct.getl_INTERNAL_TAX_SALES_AMOUNT());
			this.setl_TAXFREE_SALES_AMOUNT(struct.getl_TAXFREE_SALES_AMOUNT());
			this.setl_TAX_CREDIT_SALES_AMOUNT(struct.getl_TAX_CREDIT_SALES_AMOUNT());
			this.setl_EXTERNAL_TAX_AMOUNT(struct.getl_EXTERNAL_TAX_AMOUNT());
			this.setl_INTERNAL_TAX_AMOUNT(struct.getl_INTERNAL_TAX_AMOUNT());
			this.setl_TAX_AMOUNT_1(struct.getl_TAX_AMOUNT_1());
			this.setl_TAX_AMOUNT_2(struct.getl_TAX_AMOUNT_2());
			this.setl_TAX_AMOUNT_3(struct.getl_TAX_AMOUNT_3());
			this.setl_OWN_CUR_TAXCREDIT_SALES_AMOUNT(struct.getl_OWN_CUR_TAXCREDIT_SALES_AMOUNT());
			this.setl_ORGN_SLIP_CD(struct.getl_ORGN_SLIP_CD());
			this.setl_CUR_CD(struct.getl_CUR_CD());
			this.setl_PCL_PRICE_CO_CD(struct.getl_PCL_PRICE_CO_CD());
			this.setl_REMARKS(struct.getl_REMARKS());
			this.setl_INSPC_ACPT_TYP_CD(struct.getl_INSPC_ACPT_TYP_CD());
			this.setl_MODIFY_COUNT(struct.getl_MODIFY_COUNT());
			this.setl_AI_AR_IF_FLG(struct.getl_AI_AR_IF_FLG());
			this.setCUST_CD(struct.getCUST_CD());
			this.setSALES_DATE_FROM(struct.getSALES_DATE_FROM());
			this.setSALES_DATE_TO(struct.getSALES_DATE_TO());
			this.setRAPPR(struct.getRAPPR());
			this.setCUST_NAME(struct.getCUST_NAME());
			this.setAPPR_FLG(struct.getAPPR_FLG());
			this.setAPPR_ID(struct.getAPPR_ID());
			this.setAPPR_DATE(struct.getAPPR_DATE());
			this.setRESERVE_CAUSE(struct.getRESERVE_CAUSE());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.seth_INSTALL_FLG(struct.geth_INSTALL_FLG());
			this.setl_ORGNAL_SHIP_DLV_H_NO(struct.getl_ORGNAL_SHIP_DLV_H_NO());
			this.setl_ORGNAL_SHIP_DLV_D_NO(struct.getl_ORGNAL_SHIP_DLV_D_NO());
			this.setl_CUST_SALES_QTY(struct.getl_CUST_SALES_QTY());
			this.setl_CUST_UNIT_CD(struct.getl_CUST_UNIT_CD());
			this.setl_CUST_INSPC_ACPT_QTY(struct.getl_CUST_INSPC_ACPT_QTY());
			this.setl_SALES_H_NO(struct.getl_SALES_H_NO());
			this.setl_SHIP_DLV_H_NO(struct.getl_SHIP_DLV_H_NO());
			this.setl_SHIP_DLV_D_NO(struct.getl_SHIP_DLV_D_NO());
			this.setl_TRANS_TYP(struct.getl_TRANS_TYP());
			this.setl_APPR_HISTORY_FLG(struct.getl_APPR_HISTORY_FLG());
			this.setu_OPTION_ID(struct.getu_OPTION_ID());
			this.setl_COUNT(struct.getl_COUNT());
			this.setROW_COUNT(struct.getROW_COUNT());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(KR0060010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_r_APPR_1(struct.getList_r_APPR_1());
			this.setList_r_APPR_2(struct.getList_r_APPR_2());
			this.setList_r_APPR_3(struct.getList_r_APPR_3());
			this.setList_r_APPR_4(struct.getList_r_APPR_4());
			this.setList_h_APPR_POWER_TYP(struct.getList_h_APPR_POWER_TYP());
			this.setList_l_SALES_TYP(struct.getList_l_SALES_TYP());
			this.setList_l_PCL_PRICE_CO(struct.getList_l_PCL_PRICE_CO());
			this.setList_l_INSPC_ACPT_TYP(struct.getList_l_INSPC_ACPT_TYP());
			this.setList_l_APPR_HISTORY(struct.getList_l_APPR_HISTORY());
			this.setList_INSTALL_FLG(struct.getList_INSTALL_FLG());
			this.setList_SECTION_CD(struct.getList_SECTION_CD());
			this.setList_APPR_POWER_TYP(struct.getList_APPR_POWER_TYP());
			this.setList_USER_CD(struct.getList_USER_CD());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_SYS_PLANT_CD(struct.getList_SYS_PLANT_CD());
			this.setList_SYS_CLASS(struct.getList_SYS_CLASS());
			this.setList_l_ROWNO(struct.getList_l_ROWNO());
			this.setList_l_APPR_ID(struct.getList_l_APPR_ID());
			this.setList_l_APPR_DATE(struct.getList_l_APPR_DATE());
			this.setList_l_RESERVE_CAUSE(struct.getList_l_RESERVE_CAUSE());
			this.setList_l_SALES_SEQ_NO(struct.getList_l_SALES_SEQ_NO());
			this.setList_l_SHIP_ODR_NO(struct.getList_l_SHIP_ODR_NO());
			this.setList_l_SLIP_CD(struct.getList_l_SLIP_CD());
			this.setList_l_SALES_TYP_CD(struct.getList_l_SALES_TYP_CD());
			this.setList_l_CUST_CD(struct.getList_l_CUST_CD());
			this.setList_l_CUST_NAME(struct.getList_l_CUST_NAME());
			this.setList_l_SALES_DEPT_CD(struct.getList_l_SALES_DEPT_CD());
			this.setList_l_ORG_NAME(struct.getList_l_ORG_NAME());
			this.setList_l_ITEM_CD(struct.getList_l_ITEM_CD());
			this.setList_l_ITEM_NAME(struct.getList_l_ITEM_NAME());
			this.setList_l_CUST_ODR_NO(struct.getList_l_CUST_ODR_NO());
			this.setList_l_SALES_DATE(struct.getList_l_SALES_DATE());
			this.setList_l_CUST_CHRG_PSN_CD(struct.getList_l_CUST_CHRG_PSN_CD());
			this.setList_l_CUST_CHRG_PSN_NAME(struct.getList_l_CUST_CHRG_PSN_NAME());
			this.setList_l_ODR_ACPT_PSN_CD(struct.getList_l_ODR_ACPT_PSN_CD());
			this.setList_l_ODR_ACPT_PSN_NAME(struct.getList_l_ODR_ACPT_PSN_NAME());
			this.setList_l_SALES_QTY(struct.getList_l_SALES_QTY());
			this.setList_l_UNIT_COST(struct.getList_l_UNIT_COST());
			this.setList_l_UNIT_CD(struct.getList_l_UNIT_CD());
			this.setList_l_SALES_AMOUNT(struct.getList_l_SALES_AMOUNT());
			this.setList_l_SALES_AMOUNT_EXCH_RATES(struct.getList_l_SALES_AMOUNT_EXCH_RATES());
			this.setList_l_INSPC_ACPT_DATE(struct.getList_l_INSPC_ACPT_DATE());
			this.setList_l_INSPC_ACPT_QTY(struct.getList_l_INSPC_ACPT_QTY());
			this.setList_l_EXTERNAL_TAX_SALES_AMOUNT(struct.getList_l_EXTERNAL_TAX_SALES_AMOUNT());
			this.setList_l_INTERNAL_TAX_SALES_AMOUNT(struct.getList_l_INTERNAL_TAX_SALES_AMOUNT());
			this.setList_l_TAXFREE_SALES_AMOUNT(struct.getList_l_TAXFREE_SALES_AMOUNT());
			this.setList_l_TAX_CREDIT_SALES_AMOUNT(struct.getList_l_TAX_CREDIT_SALES_AMOUNT());
			this.setList_l_EXTERNAL_TAX_AMOUNT(struct.getList_l_EXTERNAL_TAX_AMOUNT());
			this.setList_l_INTERNAL_TAX_AMOUNT(struct.getList_l_INTERNAL_TAX_AMOUNT());
			this.setList_l_TAX_AMOUNT_1(struct.getList_l_TAX_AMOUNT_1());
			this.setList_l_TAX_AMOUNT_2(struct.getList_l_TAX_AMOUNT_2());
			this.setList_l_TAX_AMOUNT_3(struct.getList_l_TAX_AMOUNT_3());
			this.setList_l_OWN_CUR_TAXCREDIT_SALES_AMOUNT(struct.getList_l_OWN_CUR_TAXCREDIT_SALES_AMOUNT());
			this.setList_l_ORGN_SLIP_CD(struct.getList_l_ORGN_SLIP_CD());
			this.setList_l_CUR_CD(struct.getList_l_CUR_CD());
			this.setList_l_PCL_PRICE_CO_CD(struct.getList_l_PCL_PRICE_CO_CD());
			this.setList_l_REMARKS(struct.getList_l_REMARKS());
			this.setList_l_INSPC_ACPT_TYP_CD(struct.getList_l_INSPC_ACPT_TYP_CD());
			this.setList_l_MODIFY_COUNT(struct.getList_l_MODIFY_COUNT());
			this.setList_l_AI_AR_IF_FLG(struct.getList_l_AI_AR_IF_FLG());
			this.setList_CUST_CD(struct.getList_CUST_CD());
			this.setList_SALES_DATE_FROM(struct.getList_SALES_DATE_FROM());
			this.setList_SALES_DATE_TO(struct.getList_SALES_DATE_TO());
			this.setList_RAPPR(struct.getList_RAPPR());
			this.setList_CUST_NAME(struct.getList_CUST_NAME());
			this.setList_APPR_FLG(struct.getList_APPR_FLG());
			this.setList_APPR_ID(struct.getList_APPR_ID());
			this.setList_APPR_DATE(struct.getList_APPR_DATE());
			this.setList_RESERVE_CAUSE(struct.getList_RESERVE_CAUSE());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_h_INSTALL_FLG(struct.getList_h_INSTALL_FLG());
			this.setList_l_ORGNAL_SHIP_DLV_H_NO(struct.getList_l_ORGNAL_SHIP_DLV_H_NO());
			this.setList_l_ORGNAL_SHIP_DLV_D_NO(struct.getList_l_ORGNAL_SHIP_DLV_D_NO());
			this.setList_l_CUST_SALES_QTY(struct.getList_l_CUST_SALES_QTY());
			this.setList_l_CUST_UNIT_CD(struct.getList_l_CUST_UNIT_CD());
			this.setList_l_CUST_INSPC_ACPT_QTY(struct.getList_l_CUST_INSPC_ACPT_QTY());
			this.setList_l_SALES_H_NO(struct.getList_l_SALES_H_NO());
			this.setList_l_SHIP_DLV_H_NO(struct.getList_l_SHIP_DLV_H_NO());
			this.setList_l_SHIP_DLV_D_NO(struct.getList_l_SHIP_DLV_D_NO());
			this.setList_l_TRANS_TYP(struct.getList_l_TRANS_TYP());
			this.setList_l_APPR_HISTORY_FLG(struct.getList_l_APPR_HISTORY_FLG());
			this.setList_u_OPTION_ID(struct.getList_u_OPTION_ID());
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
	// 第 1 変数初期値： i_r_APPR_1


	final static String i_r_APPR_1 = null;

	// 第 2 変数初期値： i_r_APPR_2


	final static String i_r_APPR_2 = null;

	// 第 3 変数初期値： i_r_APPR_3


	final static String i_r_APPR_3 = null;

	// 第 4 変数初期値： i_r_APPR_4


	final static String i_r_APPR_4 = null;

	// 第 5 変数初期値： i_h_APPR_POWER_TYP


	final static String i_h_APPR_POWER_TYP = null;

	// 第 6 変数初期値： i_l_SALES_TYP


	final static String i_l_SALES_TYP = null;

	// 第 7 変数初期値： i_l_PCL_PRICE_CO


	final static String i_l_PCL_PRICE_CO = null;

	// 第 8 変数初期値： i_l_INSPC_ACPT_TYP


	final static String i_l_INSPC_ACPT_TYP = null;

	// 第 9 変数初期値： i_l_APPR_HISTORY


	final static String i_l_APPR_HISTORY = null;

	// 第 10 変数初期値： i_INSTALL_FLG


	final static String i_INSTALL_FLG = null;

	// 第 11 変数初期値： i_SECTION_CD


	final static String i_SECTION_CD = null;

	// 第 12 変数初期値： i_APPR_POWER_TYP


	final static String i_APPR_POWER_TYP = null;

	// 第 13 変数初期値： i_USER_CD


	final static String i_USER_CD = null;

	// 第 14 変数初期値： i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// 第 15 変数初期値： i_SYS_PLANT_CD


	final static String i_SYS_PLANT_CD = null;

	// 第 16 変数初期値： i_SYS_CLASS


	final static String i_SYS_CLASS = null;

	// 第 17 変数初期値： i_l_ROWNO


	final static String i_l_ROWNO = null;

	// 第 18 変数初期値： i_l_APPR_ID


	final static String i_l_APPR_ID = null;

	// 第 19 変数初期値： i_l_APPR_DATE


	final static String i_l_APPR_DATE = null;

	// 第 20 変数初期値： i_l_RESERVE_CAUSE


	final static String i_l_RESERVE_CAUSE = null;

	// 第 21 変数初期値： i_l_SALES_SEQ_NO


	final static String i_l_SALES_SEQ_NO = null;

	// 第 22 変数初期値： i_l_SHIP_ODR_NO


	final static String i_l_SHIP_ODR_NO = null;

	// 第 23 変数初期値： i_l_SLIP_CD


	final static String i_l_SLIP_CD = null;

	// 第 24 変数初期値： i_l_SALES_TYP_CD


	final static String i_l_SALES_TYP_CD = null;

	// 第 25 変数初期値： i_l_CUST_CD


	final static String i_l_CUST_CD = null;

	// 第 26 変数初期値： i_l_CUST_NAME


	final static String i_l_CUST_NAME = null;

	// 第 27 変数初期値： i_l_SALES_DEPT_CD


	final static String i_l_SALES_DEPT_CD = null;

	// 第 28 変数初期値： i_l_ORG_NAME


	final static String i_l_ORG_NAME = null;

	// 第 29 変数初期値： i_l_ITEM_CD


	final static String i_l_ITEM_CD = null;

	// 第 30 変数初期値： i_l_ITEM_NAME


	final static String i_l_ITEM_NAME = null;

	// 第 31 変数初期値： i_l_CUST_ODR_NO


	final static String i_l_CUST_ODR_NO = null;

	// 第 32 変数初期値： i_l_SALES_DATE


	final static String i_l_SALES_DATE = null;

	// 第 33 変数初期値： i_l_CUST_CHRG_PSN_CD


	final static String i_l_CUST_CHRG_PSN_CD = null;

	// 第 34 変数初期値： i_l_CUST_CHRG_PSN_NAME


	final static String i_l_CUST_CHRG_PSN_NAME = null;

	// 第 35 変数初期値： i_l_ODR_ACPT_PSN_CD


	final static String i_l_ODR_ACPT_PSN_CD = null;

	// 第 36 変数初期値： i_l_ODR_ACPT_PSN_NAME


	final static String i_l_ODR_ACPT_PSN_NAME = null;

	// 第 37 変数初期値： i_l_SALES_QTY


	final static String i_l_SALES_QTY = null;

	// 第 38 変数初期値： i_l_UNIT_COST


	final static String i_l_UNIT_COST = null;

	// 第 39 変数初期値： i_l_UNIT_CD


	final static String i_l_UNIT_CD = null;

	// 第 40 変数初期値： i_l_SALES_AMOUNT


	final static String i_l_SALES_AMOUNT = null;

	// 第 41 変数初期値： i_l_SALES_AMOUNT_EXCH_RATES


	final static String i_l_SALES_AMOUNT_EXCH_RATES = null;

	// 第 42 変数初期値： i_l_INSPC_ACPT_DATE


	final static String i_l_INSPC_ACPT_DATE = null;

	// 第 43 変数初期値： i_l_INSPC_ACPT_QTY


	final static String i_l_INSPC_ACPT_QTY = null;

	// 第 44 変数初期値： i_l_EXTERNAL_TAX_SALES_AMOUNT


	final static String i_l_EXTERNAL_TAX_SALES_AMOUNT = null;

	// 第 45 変数初期値： i_l_INTERNAL_TAX_SALES_AMOUNT


	final static String i_l_INTERNAL_TAX_SALES_AMOUNT = null;

	// 第 46 変数初期値： i_l_TAXFREE_SALES_AMOUNT


	final static String i_l_TAXFREE_SALES_AMOUNT = null;

	// 第 47 変数初期値： i_l_TAX_CREDIT_SALES_AMOUNT


	final static String i_l_TAX_CREDIT_SALES_AMOUNT = null;

	// 第 48 変数初期値： i_l_EXTERNAL_TAX_AMOUNT


	final static String i_l_EXTERNAL_TAX_AMOUNT = null;

	// 第 49 変数初期値： i_l_INTERNAL_TAX_AMOUNT


	final static String i_l_INTERNAL_TAX_AMOUNT = null;

	// 第 50 変数初期値： i_l_TAX_AMOUNT_1


	final static String i_l_TAX_AMOUNT_1 = null;

	// 第 51 変数初期値： i_l_TAX_AMOUNT_2


	final static String i_l_TAX_AMOUNT_2 = null;

	// 第 52 変数初期値： i_l_TAX_AMOUNT_3


	final static String i_l_TAX_AMOUNT_3 = null;

	// 第 53 変数初期値： i_l_OWN_CUR_TAXCREDIT_SALES_AMOUNT


	final static String i_l_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;

	// 第 54 変数初期値： i_l_ORGN_SLIP_CD


	final static String i_l_ORGN_SLIP_CD = null;

	// 第 55 変数初期値： i_l_CUR_CD


	final static String i_l_CUR_CD = null;

	// 第 56 変数初期値： i_l_PCL_PRICE_CO_CD


	final static String i_l_PCL_PRICE_CO_CD = null;

	// 第 57 変数初期値： i_l_REMARKS


	final static String i_l_REMARKS = null;

	// 第 58 変数初期値： i_l_INSPC_ACPT_TYP_CD


	final static String i_l_INSPC_ACPT_TYP_CD = null;

	// 第 59 変数初期値： i_l_MODIFY_COUNT


	final static String i_l_MODIFY_COUNT = null;

	// 第 60 変数初期値： i_l_AI_AR_IF_FLG


	final static String i_l_AI_AR_IF_FLG = null;

	// 第 61 変数初期値： i_CUST_CD


	final static String i_CUST_CD = null;

	// 第 62 変数初期値： i_SALES_DATE_FROM


	final static String i_SALES_DATE_FROM = null;

	// 第 63 変数初期値： i_SALES_DATE_TO


	final static String i_SALES_DATE_TO = null;

	// 第 64 変数初期値： i_RAPPR


	final static String i_RAPPR = null;

	// 第 65 変数初期値： i_CUST_NAME


	final static String i_CUST_NAME = null;

	// 第 66 変数初期値： i_APPR_FLG


	final static String i_APPR_FLG = null;

	// 第 67 変数初期値： i_APPR_ID


	final static String i_APPR_ID = null;

	// 第 68 変数初期値： i_APPR_DATE


	final static String i_APPR_DATE = null;

	// 第 69 変数初期値： i_RESERVE_CAUSE


	final static String i_RESERVE_CAUSE = null;

	// 第 70 変数初期値： i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// 第 71 変数初期値： i_h_INSTALL_FLG


	final static String i_h_INSTALL_FLG = null;

	// 第 72 変数初期値： i_l_ORGNAL_SHIP_DLV_H_NO


	final static String i_l_ORGNAL_SHIP_DLV_H_NO = null;

	// 第 73 変数初期値： i_l_ORGNAL_SHIP_DLV_D_NO


	final static String i_l_ORGNAL_SHIP_DLV_D_NO = null;

	// 第 74 変数初期値： i_l_CUST_SALES_QTY


	final static String i_l_CUST_SALES_QTY = null;

	// 第 75 変数初期値： i_l_CUST_UNIT_CD


	final static String i_l_CUST_UNIT_CD = null;

	// 第 76 変数初期値： i_l_CUST_INSPC_ACPT_QTY


	final static String i_l_CUST_INSPC_ACPT_QTY = null;

	// 第 77 変数初期値： i_l_SALES_H_NO


	final static String i_l_SALES_H_NO = null;

	// 第 78 変数初期値： i_l_SHIP_DLV_H_NO


	final static String i_l_SHIP_DLV_H_NO = null;

	// 第 79 変数初期値： i_l_SHIP_DLV_D_NO


	final static String i_l_SHIP_DLV_D_NO = null;

	// 第 80 変数初期値： i_l_TRANS_TYP


	final static String i_l_TRANS_TYP = null;

	// 第 81 変数初期値： i_l_APPR_HISTORY_FLG


	final static String i_l_APPR_HISTORY_FLG = null;

	// 第 82 変数初期値： i_u_OPTION_ID


	final static String i_u_OPTION_ID = null;

	// 第 83 変数初期値： i_l_COUNT


	final static String i_l_COUNT = null;

	// 第 84 変数初期値： i_ROW_COUNT


	final static String i_ROW_COUNT = null;

*/

	//{{user_implement_code
		// TODO: 初期化で使う定数は、ここに記述してください。
		// 以下に記述した内容は自動的には変更されません。
	// 第 1 変数初期値： i_r_APPR_1

	final static String i_r_APPR_1 = null;

	// 第 2 変数初期値： i_r_APPR_2

	final static String i_r_APPR_2 = null;

	// 第 3 変数初期値： i_r_APPR_3

	final static String i_r_APPR_3 = null;

	// 第 4 変数初期値： i_r_APPR_4

	final static String i_r_APPR_4 = null;

	// 第 5 変数初期値： i_h_APPR_POWER_TYP

	final static String i_h_APPR_POWER_TYP = null;

	// 第 6 変数初期値： i_l_MODIFY_COUNT

	final static String i_l_MODIFY_COUNT = null;

	// 第 7 変数初期値： i_INSTALL_FLG

	final static String i_INSTALL_FLG = null;

	// 第 8 変数初期値： i_SECTION_CD

	final static String i_SECTION_CD = null;

	// 第 9 変数初期値： i_APPR_POWER_TYP

	final static String i_APPR_POWER_TYP = null;

	// 第 10 変数初期値： i_USER_CD

	final static String i_USER_CD = null;

	// 第 11 変数初期値： i_COMPANY_CD

	final static String i_COMPANY_CD = null;

	// 第 12 変数初期値： i_SYS_PLANT_CD

	final static String i_SYS_PLANT_CD = null;

	// 第 13 変数初期値： i_l_APPR_ID

	final static String i_l_APPR_ID = null;

	// 第 14 変数初期値： i_l_APPR_DATE

	final static String i_l_APPR_DATE = null;

	// 第 15 変数初期値： i_l_RESERVE_CAUSE

	final static String i_l_RESERVE_CAUSE = null;

	// 第 16 変数初期値： i_l_SHIP_ODR_NO

	final static String i_l_SHIP_ODR_NO = null;

	// 第 17 変数初期値： i_l_SLIP_CD

	final static String i_l_SLIP_CD = null;

	// 第 18 変数初期値： i_l_SALES_TYP

	final static String i_l_SALES_TYP = null;

	// 第 19 変数初期値： i_l_CUST_CD

	final static String i_l_CUST_CD = null;

	// 第 20 変数初期値： i_l_CUST_NAME

	final static String i_l_CUST_NAME = null;

	// 第 21 変数初期値： i_l_SALES_DEPT_CD

	final static String i_l_SALES_DEPT_CD = null;

	// 第 22 変数初期値： i_l_ORG_NAME

	final static String i_l_ORG_NAME = null;

	// 第 23 変数初期値： i_l_ITEM_CD

	final static String i_l_ITEM_CD = null;

	// 第 24 変数初期値： i_l_ITEM_NAME

	final static String i_l_ITEM_NAME = null;

	// 第 25 変数初期値： i_l_CUST_ODR_NO

	final static String i_l_CUST_ODR_NO = null;

	// 第 26 変数初期値： i_l_SALES_DATE

	final static String i_l_SALES_DATE = null;

	// 第 27 変数初期値： i_l_VEND_CD

	final static String i_l_VEND_CD = null;

	// 第 28 変数初期値： i_l_VEND_NAME

	final static String i_l_VEND_NAME = null;

	// 第 29 変数初期値： i_l_PRD_ODR_PLACE_CD

	final static String i_l_PRD_ODR_PLACE_CD = null;

	// 第 30 変数初期値： i_l_CUST_CHRG_PSN_CD

	final static String i_l_CUST_CHRG_PSN_CD = null;

	// 第 31 変数初期値： i_l_CUST_CHRG_PSN_NAME

	final static String i_l_CUST_CHRG_PSN_NAME = null;

	// 第 32 変数初期値： i_l_ODR_ACPT_PSN_CD

	final static String i_l_ODR_ACPT_PSN_CD = null;

	// 第 33 変数初期値： i_l_ODR_ACPT_PSN_NAME

	final static String i_l_ODR_ACPT_PSN_NAME = null;

	// 第 34 変数初期値： i_l_SALES_QTY

	final static String i_l_SALES_QTY = null;

	// 第 35 変数初期値： i_l_UNIT_COST

	final static String i_l_UNIT_COST = null;

	// 第 36 変数初期値： i_l_UNIT_CD

	final static String i_l_UNIT_CD = null;

	// 第 37 変数初期値： i_l_SALES_AMOUNT

	final static String i_l_SALES_AMOUNT = null;

	// 第 38 変数初期値： i_l_SALES_AMOUNT_EXCH_RATES

	final static String i_l_SALES_AMOUNT_EXCH_RATES = null;

	// 第 39 変数初期値： i_l_INSPC_ACPT_DATE

	final static String i_l_INSPC_ACPT_DATE = null;

	// 第 40 変数初期値： i_l_INSPC_ACPT_QTY

	final static String i_l_INSPC_ACPT_QTY = null;

	// 第 41 変数初期値： i_l_EXTERNAL_TAX_SALES_AMOUNT

	final static String i_l_EXTERNAL_TAX_SALES_AMOUNT = null;

	// 第 42 変数初期値： i_l_INTERNAL_TAX_SALES_AMOUNT

	final static String i_l_INTERNAL_TAX_SALES_AMOUNT = null;

	// 第 43 変数初期値： i_l_TAXFREE_SALES_AMOUNT

	final static String i_l_TAXFREE_SALES_AMOUNT = null;

	// 第 44 変数初期値： i_l_TAX_CREDIT_SALES_AMOUNT

	final static String i_l_TAX_CREDIT_SALES_AMOUNT = null;

	// 第 45 変数初期値： i_l_EXTERNAL_TAX_AMOUNT

	final static String i_l_EXTERNAL_TAX_AMOUNT = null;

	// 第 46 変数初期値： i_l_INTERNAL_TAX_AMOUNT

	final static String i_l_INTERNAL_TAX_AMOUNT = null;

	// 第 47 変数初期値： i_l_TAX_AMOUNT_1

	final static String i_l_TAX_AMOUNT_1 = null;

	// 第 48 変数初期値： i_l_TAX_AMOUNT_2

	final static String i_l_TAX_AMOUNT_2 = null;

	// 第 49 変数初期値： i_l_TAX_AMOUNT_3

	final static String i_l_TAX_AMOUNT_3 = null;

	// 第 50 変数初期値： i_l_OWN_CUR_TAXCREDIT_SALES_AMOUNT

	final static String i_l_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;

	// 第 51 変数初期値： i_l_ORGN_SLIP_CD

	final static String i_l_ORGN_SLIP_CD = null;

	// 第 52 変数初期値： i_l_CUR_CD

	final static String i_l_CUR_CD = null;

	// 第 53 変数初期値： i_l_PCL_PRICE_CO

	final static String i_l_PCL_PRICE_CO = null;

	// 第 54 変数初期値： i_l_REMARKS

	final static String i_l_REMARKS = null;

	// 第 55 変数初期値： i_l_INSPC_ACPT_TYP

	final static String i_l_INSPC_ACPT_TYP = null;

	// 第 56 変数初期値： i_CUST_CD

	final static String i_CUST_CD = null;

	// 第 57 変数初期値： i_SALES_DATE_FROM

	final static String i_SALES_DATE_FROM = null;

	// 第 58 変数初期値： i_SALES_DATE_TO

	final static String i_SALES_DATE_TO = null;

	// 第 59 変数初期値： i_RAPPR

	final static String i_RAPPR = null;

	// 第 60 変数初期値： i_CUST_NAME

	final static String i_CUST_NAME = null;

	// 第 61 変数初期値： i_l_SALES_SEQ_NO

	final static String i_l_SALES_SEQ_NO = null;

	// 第 62 変数初期値： i_APPR_FLG

	final static String i_APPR_FLG = null;

	// 第 63 変数初期値： i_APPR_ID

	final static String i_APPR_ID = null;

	// 第 64 変数初期値： i_APPR_DATE

	final static String i_APPR_DATE = null;

	// 第 65 変数初期値： i_RESERVE_CAUSE

	final static String i_RESERVE_CAUSE = null;


	/**
	 * 初期化
	 *
	 */
	public void initialize()
	{

		clear();

		m_r_APPR_1 = i_r_APPR_1;
		m_r_APPR_2 = i_r_APPR_2;
		m_r_APPR_3 = i_r_APPR_3;
		m_r_APPR_4 = i_r_APPR_4;
		m_h_APPR_POWER_TYP = i_h_APPR_POWER_TYP;
		m_l_MODIFY_COUNT = i_l_MODIFY_COUNT;
		m_INSTALL_FLG = i_INSTALL_FLG;
		m_SECTION_CD = i_SECTION_CD;
		m_APPR_POWER_TYP = i_APPR_POWER_TYP;
		m_USER_CD = i_USER_CD;
		m_COMPANY_CD = i_COMPANY_CD;
		m_SYS_PLANT_CD = i_SYS_PLANT_CD;
		m_l_APPR_ID = i_l_APPR_ID;
		m_l_APPR_DATE = i_l_APPR_DATE;
		m_l_RESERVE_CAUSE = i_l_RESERVE_CAUSE;
		m_l_SHIP_ODR_NO = i_l_SHIP_ODR_NO;
		m_l_SLIP_CD = i_l_SLIP_CD;
		m_l_SALES_TYP = i_l_SALES_TYP;
		m_l_CUST_CD = i_l_CUST_CD;
		m_l_CUST_NAME = i_l_CUST_NAME;
		m_l_SALES_DEPT_CD = i_l_SALES_DEPT_CD;
		m_l_ORG_NAME = i_l_ORG_NAME;
		m_l_ITEM_CD = i_l_ITEM_CD;
		m_l_ITEM_NAME = i_l_ITEM_NAME;
		m_l_CUST_ODR_NO = i_l_CUST_ODR_NO;
		m_l_SALES_DATE = i_l_SALES_DATE;
		m_l_CUST_CHRG_PSN_CD = i_l_CUST_CHRG_PSN_CD;
		m_l_CUST_CHRG_PSN_NAME = i_l_CUST_CHRG_PSN_NAME;
		m_l_ODR_ACPT_PSN_CD = i_l_ODR_ACPT_PSN_CD;
		m_l_ODR_ACPT_PSN_NAME = i_l_ODR_ACPT_PSN_NAME;
		m_l_SALES_QTY = i_l_SALES_QTY;
		m_l_UNIT_COST = i_l_UNIT_COST;
		m_l_UNIT_CD = i_l_UNIT_CD;
		m_l_SALES_AMOUNT = i_l_SALES_AMOUNT;
		m_l_SALES_AMOUNT_EXCH_RATES = i_l_SALES_AMOUNT_EXCH_RATES;
		m_l_INSPC_ACPT_DATE = i_l_INSPC_ACPT_DATE;
		m_l_INSPC_ACPT_QTY = i_l_INSPC_ACPT_QTY;
		m_l_EXTERNAL_TAX_SALES_AMOUNT = i_l_EXTERNAL_TAX_SALES_AMOUNT;
		m_l_INTERNAL_TAX_SALES_AMOUNT = i_l_INTERNAL_TAX_SALES_AMOUNT;
		m_l_TAXFREE_SALES_AMOUNT = i_l_TAXFREE_SALES_AMOUNT;
		m_l_TAX_CREDIT_SALES_AMOUNT = i_l_TAX_CREDIT_SALES_AMOUNT;
		m_l_EXTERNAL_TAX_AMOUNT = i_l_EXTERNAL_TAX_AMOUNT;
		m_l_INTERNAL_TAX_AMOUNT = i_l_INTERNAL_TAX_AMOUNT;
		m_l_TAX_AMOUNT_1 = i_l_TAX_AMOUNT_1;
		m_l_TAX_AMOUNT_2 = i_l_TAX_AMOUNT_2;
		m_l_TAX_AMOUNT_3 = i_l_TAX_AMOUNT_3;
		m_l_OWN_CUR_TAXCREDIT_SALES_AMOUNT = i_l_OWN_CUR_TAXCREDIT_SALES_AMOUNT;
		m_l_ORGN_SLIP_CD = i_l_ORGN_SLIP_CD;
		m_l_CUR_CD = i_l_CUR_CD;
		m_l_PCL_PRICE_CO = i_l_PCL_PRICE_CO;
		m_l_REMARKS = i_l_REMARKS;
		m_l_INSPC_ACPT_TYP = i_l_INSPC_ACPT_TYP;
		m_CUST_CD = i_CUST_CD;
		m_SALES_DATE_FROM = i_SALES_DATE_FROM;
		m_SALES_DATE_TO = i_SALES_DATE_TO;
		m_RAPPR = i_RAPPR;
		m_CUST_NAME = i_CUST_NAME;
		m_l_SALES_SEQ_NO = i_l_SALES_SEQ_NO;
		m_APPR_FLG = i_APPR_FLG;
		m_APPR_ID = i_APPR_ID;
		m_APPR_DATE = i_APPR_DATE;
		m_RESERVE_CAUSE = i_RESERVE_CAUSE;
	}

	/**	
	 * 引数の情報の保持するリストの変数から指定の順のデータを取得	
	 * @param in リスト保持の情報	
	 * @param index 順番	
	 */	
	public void importData(KR0060010Struct in, int index)	
	{	
		clear();				
		if(in.l_l_ROWNO != null && in.l_l_ROWNO.size() > index)  m_l_ROWNO = (String)(in.l_l_ROWNO.get(index));
		if(in.l_l_SALES_SEQ_NO != null && in.l_l_SALES_SEQ_NO.size() > index)  m_l_SALES_SEQ_NO = (String)(in.l_l_SALES_SEQ_NO.get(index));
		if(in.l_l_SHIP_DLV_H_NO != null && in.l_l_SHIP_DLV_H_NO.size() > index)  m_l_SHIP_DLV_H_NO = (String)(in.l_l_SHIP_DLV_H_NO.get(index));
		if(in.l_l_SHIP_DLV_D_NO != null && in.l_l_SHIP_DLV_D_NO.size() > index)  m_l_SHIP_DLV_D_NO = (String)(in.l_l_SHIP_DLV_D_NO.get(index));
		if(in.l_l_SHIP_ODR_NO != null && in.l_l_SHIP_ODR_NO.size() > index)  m_l_SHIP_ODR_NO = (String)(in.l_l_SHIP_ODR_NO.get(index));
		if(in.l_l_SLIP_CD != null && in.l_l_SLIP_CD.size() > index)  m_l_SLIP_CD = (String)(in.l_l_SLIP_CD.get(index));
		if(in.l_l_AI_AR_IF_FLG != null && in.l_l_AI_AR_IF_FLG.size() > index)  m_l_AI_AR_IF_FLG = (String)(in.l_l_AI_AR_IF_FLG.get(index));
		if(in.l_l_MODIFY_COUNT != null && in.l_l_MODIFY_COUNT.size() > index)  m_l_MODIFY_COUNT = (String)(in.l_l_MODIFY_COUNT.get(index));
		return;
	}	
		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
