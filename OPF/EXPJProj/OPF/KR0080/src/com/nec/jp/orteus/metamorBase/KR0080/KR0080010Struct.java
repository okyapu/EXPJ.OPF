/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KR0080/src/com/nec/jp/orteus/metamorBase/KR0080/KR0080010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.KR0080;

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
 * CLASS     : KR0080010Control クラス
 * ファイル・クラス説明
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.2 $ $Date: 2015/11/16 05:14:51 $
 *
 */
//}}user_implement_code_header

public class KR0080010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_h_SALES_UNIT_PRICE */
	public String m_h_SALES_UNIT_PRICE = null;
	/** 第 2 変数： m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** 第 3 変数： m_BUSINESS_OPR_DATE */
	public String m_BUSINESS_OPR_DATE = null;
	/** 第 4 変数： m_ODR_NO_2 */
	public String m_ODR_NO_2 = null;
	/** 第 5 変数： m_UNSTOCK_MODIFY_COUNT */
	public String m_UNSTOCK_MODIFY_COUNT = null;
	/** 第 6 変数： m_ODR_CMPLT_FLG */
	public String m_ODR_CMPLT_FLG = null;
	/** 第 7 変数： m_ODR_NO */
	public String m_ODR_NO = null;
	/** 第 8 変数： m_haveFlag */
	public String m_haveFlag = null;
	/** 第 9 変数： m_PROJECT_CD */
	public String m_PROJECT_CD = null;
	/** 第 10 変数： m_h_CTL_SEQ_CD */
	public String m_h_CTL_SEQ_CD = null;
	/** 第 11 変数： m_SLIP_TRN_CD */
	public String m_SLIP_TRN_CD = null;
	/** 第 12 変数： m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** 第 13 変数： m_JOB_ODR_COMP_FLG */
	public String m_JOB_ODR_COMP_FLG = null;
	/** 第 14 変数： m_PROJECT_NAME */
	public String m_PROJECT_NAME = null;
	/** 第 15 変数： m_ESTIMATE_NO */
	public String m_ESTIMATE_NO = null;
	/** 第 16 変数： m_DETAIL_NO */
	public String m_DETAIL_NO = null;
	/** 第 17 変数： m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** 第 18 変数： m_SALES_DATE */
	public String m_SALES_DATE = null;
	/** 第 19 変数： m_CUST_CHRG_PSN_CD */
	public String m_CUST_CHRG_PSN_CD = null;
	/** 第 20 変数： m_CUST_CHRG_PSN_NAME */
	public String m_CUST_CHRG_PSN_NAME = null;
	/** 第 21 変数： m_SALES_QTY */
	public String m_SALES_QTY = null;
	/** 第 22 変数： m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** 第 23 変数： m_SALES_UNIT_PRICE */
	public String m_SALES_UNIT_PRICE = null;
	/** 第 24 変数： m_CUR_UNIT */
	public String m_CUR_UNIT = null;
	/** 第 25 変数： m_SALES_AMOUNT */
	public String m_SALES_AMOUNT = null;
	/** 第 26 変数： m_SALES_AMOUNT_YEN */
	public String m_SALES_AMOUNT_YEN = null;
	/** 第 27 変数： m_TAX_CD */
	public String m_TAX_CD = null;
	/** 第 28 変数： m_PAY_RATE */
	public String m_PAY_RATE = null;
	/** 第 29 変数： m_CUST_CD */
	public String m_CUST_CD = null;
	/** 第 30 変数： m_CUST_NAME */
	public String m_CUST_NAME = null;
	/** 第 31 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 32 変数： m_ITEM_NAME_1 */
	public String m_ITEM_NAME_1 = null;
	/** 第 33 変数： m_CUST_ODR_NO */
	public String m_CUST_ODR_NO = null;
	/** 第 34 変数： m_DESINATED_DLV_DATE */
	public String m_DESINATED_DLV_DATE = null;
	/** 第 35 変数： m_OPTION_ID */
	public String m_OPTION_ID = null;
	/** 第 36 変数： m_INSTALL_FLG */
	public String m_INSTALL_FLG = null;
	/** 第 37 変数： m_SLIP_CD */
	public String m_SLIP_CD = null;
	/** 第 38 変数： m_SALSE_MODIFY_COUNT */
	public String m_SALSE_MODIFY_COUNT = null;
	/** 第 39 変数： m_h_SALES_SEQ_NO */
	public String m_h_SALES_SEQ_NO = null;
	/** 第 40 変数： m_AI_AR_IF_FLG */
	public String m_AI_AR_IF_FLG = null;
	/** 第 41 変数： m_SALES_SEQ_NO */
	public String m_SALES_SEQ_NO = null;
	/** 第 42 変数： m_SALES_TYP */
	public String m_SALES_TYP = null;
	/** 第 43 変数： m_SALES_DEPT_CD */
	public String m_SALES_DEPT_CD = null;
	/** 第 44 変数： m_VEND_CD */
	public String m_VEND_CD = null;
	/** 第 45 変数： m_PRD_ODR_PLACE_CD */
	public String m_PRD_ODR_PLACE_CD = null;
	/** 第 46 変数： m_ODR_ACPT_PSN_CD */
	public String m_ODR_ACPT_PSN_CD = null;
	/** 第 47 変数： m_UNIT_CD */
	public String m_UNIT_CD = null;
	/** 第 48 変数： m_INSPC_ACPT_DATE */
	public String m_INSPC_ACPT_DATE = null;
	/** 第 49 変数： m_INSPC_ACPT_QTY */
	public String m_INSPC_ACPT_QTY = null;
	/** 第 50 変数： m_EXTERNAL_TAX_SALES_AMOUNT */
	public String m_EXTERNAL_TAX_SALES_AMOUNT = null;
	/** 第 51 変数： m_INTERNAL_TAX_SALES_AMOUNT */
	public String m_INTERNAL_TAX_SALES_AMOUNT = null;
	/** 第 52 変数： m_TAXFREE_SALES_AMOUNT */
	public String m_TAXFREE_SALES_AMOUNT = null;
	/** 第 53 変数： m_TAX_CREDIT_SALES_AMOUNT */
	public String m_TAX_CREDIT_SALES_AMOUNT = null;
	/** 第 54 変数： m_EXTERNAL_TAX_AMOUNT */
	public String m_EXTERNAL_TAX_AMOUNT = null;
	/** 第 55 変数： m_INTERNAL_TAX_AMOUNT */
	public String m_INTERNAL_TAX_AMOUNT = null;
	/** 第 56 変数： m_TAX_AMOUNT_1 */
	public String m_TAX_AMOUNT_1 = null;
	/** 第 57 変数： m_TAX_AMOUNT_2 */
	public String m_TAX_AMOUNT_2 = null;
	/** 第 58 変数： m_TAX_AMOUNT_3 */
	public String m_TAX_AMOUNT_3 = null;
	/** 第 59 変数： m_OWN_CUR_TAXCREDIT_SALES_AMOUNT */
	public String m_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;
	/** 第 60 変数： m_ORG_SLIP_CD */
	public String m_ORG_SLIP_CD = null;
	/** 第 61 変数： m_CURRNCY_CD */
	public String m_CURRNCY_CD = null;
	/** 第 62 変数： m_SPCL_PRICE_CO */
	public String m_SPCL_PRICE_CO = null;
	/** 第 63 変数： m_REMARKS */
	public String m_REMARKS = null;
	/** 第 64 変数： m_INSPC_ACPT_TYP */
	public String m_INSPC_ACPT_TYP = null;
	/** 第 65 変数： m_STATUS */
	public String m_STATUS = null;
	/** 第 66 変数： m_DEL_FLG */
	public String m_DEL_FLG = null;
	/** 第 67 変数： m_APPR_FLG */
	public String m_APPR_FLG = null;
	/** 第 68 変数： m_APPR_ID */
	public String m_APPR_ID = null;
	/** 第 69 変数： m_APPR_DATE */
	public String m_APPR_DATE = null;
	/** 第 70 変数： m_CTL_SEQ_CD */
	public String m_CTL_SEQ_CD = null;
	/** 第 71 変数： m_WORK_TIME */
	public String m_WORK_TIME = null;
	/** 第 72 変数： m_WORK_DATE */
	public String m_WORK_DATE = null;
	/** 第 73 変数： m_WORK_PERSON_CD */
	public String m_WORK_PERSON_CD = null;
	/** 第 74 変数： m_WORK_REMARKS */
	public String m_WORK_REMARKS = null;
	/** 第 75 変数： m_HS_CTL_SEQ_CD */
	public String m_HS_CTL_SEQ_CD = null;
	/** 第 76 変数： m_NEW_OLD_FLG */
	public String m_NEW_OLD_FLG = null;
	/** 第 77 変数： m_TRAN_TYPE */
	public String m_TRAN_TYPE = null;
	/** 第 78 変数： m_CRCT_TYP */
	public String m_CRCT_TYP = null;
	/** 第 79 変数： m_APR_SALES_VALUE */
	public String m_APR_SALES_VALUE = null;
	/** 第 80 変数： m_SALES_DEPT_NAME */
	public String m_SALES_DEPT_NAME = null;
	/** 第 81 変数： m_WORK_PERSON_NAME */
	public String m_WORK_PERSON_NAME = null;
	/** 第 82 変数： m_ORG_CD */
	public String m_ORG_CD = null;
	/** 第 83 変数： m_ORG_NAME */
	public String m_ORG_NAME = null;
	/** 第 84 変数： m_TAX_RATE_1 */
	public String m_TAX_RATE_1 = null;
	/** 第 85 変数： m_TAX_RATE_2 */
	public String m_TAX_RATE_2 = null;
	/** 第 86 変数： m_TAX_RATE_3 */
	public String m_TAX_RATE_3 = null;
	/** 第 87 変数： m_TAX_ROUND_TYP */
	public String m_TAX_ROUND_TYP = null;
	/** 第 88 変数： m_USER_CD */
	public String m_USER_CD = null;
	/** 第 89 変数： m_USER_NAME */
	public String m_USER_NAME = null;
	/** 第 90 変数： m_CUR_CD */
	public String m_CUR_CD = null;
	/** 第 91 変数： m_EXCH_TYP */
	public String m_EXCH_TYP = null;
	/** 第 92 変数： m_DETAIL_ROUND_TYP */
	public String m_DETAIL_ROUND_TYP = null;
	/** 第 93 変数： m_SYS_CLASS_CODE */
	public String m_SYS_CLASS_CODE = null;
	/** 第 94 変数： m_DECIMAL_FIG */
	public String m_DECIMAL_FIG = null;
	/** 第 95 変数： m_h_INSTALL_FLG */
	public String m_h_INSTALL_FLG = null;
	/** 第 96 変数： m_SEL_MODIFY_COUNT */
	public String m_SEL_MODIFY_COUNT = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_h_SALES_UNIT_PRICE */
	public List l_h_SALES_UNIT_PRICE = null;

	/** 第 2 List変数： l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** 第 3 List変数： l_BUSINESS_OPR_DATE */
	public List l_BUSINESS_OPR_DATE = null;

	/** 第 4 List変数： l_ODR_NO_2 */
	public List l_ODR_NO_2 = null;

	/** 第 5 List変数： l_UNSTOCK_MODIFY_COUNT */
	public List l_UNSTOCK_MODIFY_COUNT = null;

	/** 第 6 List変数： l_ODR_CMPLT_FLG */
	public List l_ODR_CMPLT_FLG = null;

	/** 第 7 List変数： l_ODR_NO */
	public List l_ODR_NO = null;

	/** 第 8 List変数： l_haveFlag */
	public List l_haveFlag = null;

	/** 第 9 List変数： l_PROJECT_CD */
	public List l_PROJECT_CD = null;

	/** 第 10 List変数： l_h_CTL_SEQ_CD */
	public List l_h_CTL_SEQ_CD = null;

	/** 第 11 List変数： l_SLIP_TRN_CD */
	public List l_SLIP_TRN_CD = null;

	/** 第 12 List変数： l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** 第 13 List変数： l_JOB_ODR_COMP_FLG */
	public List l_JOB_ODR_COMP_FLG = null;

	/** 第 14 List変数： l_PROJECT_NAME */
	public List l_PROJECT_NAME = null;

	/** 第 15 List変数： l_ESTIMATE_NO */
	public List l_ESTIMATE_NO = null;

	/** 第 16 List変数： l_DETAIL_NO */
	public List l_DETAIL_NO = null;

	/** 第 17 List変数： l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** 第 18 List変数： l_SALES_DATE */
	public List l_SALES_DATE = null;

	/** 第 19 List変数： l_CUST_CHRG_PSN_CD */
	public List l_CUST_CHRG_PSN_CD = null;

	/** 第 20 List変数： l_CUST_CHRG_PSN_NAME */
	public List l_CUST_CHRG_PSN_NAME = null;

	/** 第 21 List変数： l_SALES_QTY */
	public List l_SALES_QTY = null;

	/** 第 22 List変数： l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** 第 23 List変数： l_SALES_UNIT_PRICE */
	public List l_SALES_UNIT_PRICE = null;

	/** 第 24 List変数： l_CUR_UNIT */
	public List l_CUR_UNIT = null;

	/** 第 25 List変数： l_SALES_AMOUNT */
	public List l_SALES_AMOUNT = null;

	/** 第 26 List変数： l_SALES_AMOUNT_YEN */
	public List l_SALES_AMOUNT_YEN = null;

	/** 第 27 List変数： l_TAX_CD */
	public List l_TAX_CD = null;

	/** 第 28 List変数： l_PAY_RATE */
	public List l_PAY_RATE = null;

	/** 第 29 List変数： l_CUST_CD */
	public List l_CUST_CD = null;

	/** 第 30 List変数： l_CUST_NAME */
	public List l_CUST_NAME = null;

	/** 第 31 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 32 List変数： l_ITEM_NAME_1 */
	public List l_ITEM_NAME_1 = null;

	/** 第 33 List変数： l_CUST_ODR_NO */
	public List l_CUST_ODR_NO = null;

	/** 第 34 List変数： l_DESINATED_DLV_DATE */
	public List l_DESINATED_DLV_DATE = null;

	/** 第 35 List変数： l_OPTION_ID */
	public List l_OPTION_ID = null;

	/** 第 36 List変数： l_INSTALL_FLG */
	public List l_INSTALL_FLG = null;

	/** 第 37 List変数： l_SLIP_CD */
	public List l_SLIP_CD = null;

	/** 第 38 List変数： l_SALSE_MODIFY_COUNT */
	public List l_SALSE_MODIFY_COUNT = null;

	/** 第 39 List変数： l_h_SALES_SEQ_NO */
	public List l_h_SALES_SEQ_NO = null;

	/** 第 40 List変数： l_AI_AR_IF_FLG */
	public List l_AI_AR_IF_FLG = null;

	/** 第 41 List変数： l_SALES_SEQ_NO */
	public List l_SALES_SEQ_NO = null;

	/** 第 42 List変数： l_SALES_TYP */
	public List l_SALES_TYP = null;

	/** 第 43 List変数： l_SALES_DEPT_CD */
	public List l_SALES_DEPT_CD = null;

	/** 第 44 List変数： l_VEND_CD */
	public List l_VEND_CD = null;

	/** 第 45 List変数： l_PRD_ODR_PLACE_CD */
	public List l_PRD_ODR_PLACE_CD = null;

	/** 第 46 List変数： l_ODR_ACPT_PSN_CD */
	public List l_ODR_ACPT_PSN_CD = null;

	/** 第 47 List変数： l_UNIT_CD */
	public List l_UNIT_CD = null;

	/** 第 48 List変数： l_INSPC_ACPT_DATE */
	public List l_INSPC_ACPT_DATE = null;

	/** 第 49 List変数： l_INSPC_ACPT_QTY */
	public List l_INSPC_ACPT_QTY = null;

	/** 第 50 List変数： l_EXTERNAL_TAX_SALES_AMOUNT */
	public List l_EXTERNAL_TAX_SALES_AMOUNT = null;

	/** 第 51 List変数： l_INTERNAL_TAX_SALES_AMOUNT */
	public List l_INTERNAL_TAX_SALES_AMOUNT = null;

	/** 第 52 List変数： l_TAXFREE_SALES_AMOUNT */
	public List l_TAXFREE_SALES_AMOUNT = null;

	/** 第 53 List変数： l_TAX_CREDIT_SALES_AMOUNT */
	public List l_TAX_CREDIT_SALES_AMOUNT = null;

	/** 第 54 List変数： l_EXTERNAL_TAX_AMOUNT */
	public List l_EXTERNAL_TAX_AMOUNT = null;

	/** 第 55 List変数： l_INTERNAL_TAX_AMOUNT */
	public List l_INTERNAL_TAX_AMOUNT = null;

	/** 第 56 List変数： l_TAX_AMOUNT_1 */
	public List l_TAX_AMOUNT_1 = null;

	/** 第 57 List変数： l_TAX_AMOUNT_2 */
	public List l_TAX_AMOUNT_2 = null;

	/** 第 58 List変数： l_TAX_AMOUNT_3 */
	public List l_TAX_AMOUNT_3 = null;

	/** 第 59 List変数： l_OWN_CUR_TAXCREDIT_SALES_AMOUNT */
	public List l_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;

	/** 第 60 List変数： l_ORG_SLIP_CD */
	public List l_ORG_SLIP_CD = null;

	/** 第 61 List変数： l_CURRNCY_CD */
	public List l_CURRNCY_CD = null;

	/** 第 62 List変数： l_SPCL_PRICE_CO */
	public List l_SPCL_PRICE_CO = null;

	/** 第 63 List変数： l_REMARKS */
	public List l_REMARKS = null;

	/** 第 64 List変数： l_INSPC_ACPT_TYP */
	public List l_INSPC_ACPT_TYP = null;

	/** 第 65 List変数： l_STATUS */
	public List l_STATUS = null;

	/** 第 66 List変数： l_DEL_FLG */
	public List l_DEL_FLG = null;

	/** 第 67 List変数： l_APPR_FLG */
	public List l_APPR_FLG = null;

	/** 第 68 List変数： l_APPR_ID */
	public List l_APPR_ID = null;

	/** 第 69 List変数： l_APPR_DATE */
	public List l_APPR_DATE = null;

	/** 第 70 List変数： l_CTL_SEQ_CD */
	public List l_CTL_SEQ_CD = null;

	/** 第 71 List変数： l_WORK_TIME */
	public List l_WORK_TIME = null;

	/** 第 72 List変数： l_WORK_DATE */
	public List l_WORK_DATE = null;

	/** 第 73 List変数： l_WORK_PERSON_CD */
	public List l_WORK_PERSON_CD = null;

	/** 第 74 List変数： l_WORK_REMARKS */
	public List l_WORK_REMARKS = null;

	/** 第 75 List変数： l_HS_CTL_SEQ_CD */
	public List l_HS_CTL_SEQ_CD = null;

	/** 第 76 List変数： l_NEW_OLD_FLG */
	public List l_NEW_OLD_FLG = null;

	/** 第 77 List変数： l_TRAN_TYPE */
	public List l_TRAN_TYPE = null;

	/** 第 78 List変数： l_CRCT_TYP */
	public List l_CRCT_TYP = null;

	/** 第 79 List変数： l_APR_SALES_VALUE */
	public List l_APR_SALES_VALUE = null;

	/** 第 80 List変数： l_SALES_DEPT_NAME */
	public List l_SALES_DEPT_NAME = null;

	/** 第 81 List変数： l_WORK_PERSON_NAME */
	public List l_WORK_PERSON_NAME = null;

	/** 第 82 List変数： l_ORG_CD */
	public List l_ORG_CD = null;

	/** 第 83 List変数： l_ORG_NAME */
	public List l_ORG_NAME = null;

	/** 第 84 List変数： l_TAX_RATE_1 */
	public List l_TAX_RATE_1 = null;

	/** 第 85 List変数： l_TAX_RATE_2 */
	public List l_TAX_RATE_2 = null;

	/** 第 86 List変数： l_TAX_RATE_3 */
	public List l_TAX_RATE_3 = null;

	/** 第 87 List変数： l_TAX_ROUND_TYP */
	public List l_TAX_ROUND_TYP = null;

	/** 第 88 List変数： l_USER_CD */
	public List l_USER_CD = null;

	/** 第 89 List変数： l_USER_NAME */
	public List l_USER_NAME = null;

	/** 第 90 List変数： l_CUR_CD */
	public List l_CUR_CD = null;

	/** 第 91 List変数： l_EXCH_TYP */
	public List l_EXCH_TYP = null;

	/** 第 92 List変数： l_DETAIL_ROUND_TYP */
	public List l_DETAIL_ROUND_TYP = null;

	/** 第 93 List変数： l_SYS_CLASS_CODE */
	public List l_SYS_CLASS_CODE = null;

	/** 第 94 List変数： l_DECIMAL_FIG */
	public List l_DECIMAL_FIG = null;

	/** 第 95 List変数： l_h_INSTALL_FLG */
	public List l_h_INSTALL_FLG = null;

	/** 第 96 List変数： l_SEL_MODIFY_COUNT */
	public List l_SEL_MODIFY_COUNT = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String geth_SALES_UNIT_PRICE() { return m_h_SALES_UNIT_PRICE; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getBUSINESS_OPR_DATE() { return m_BUSINESS_OPR_DATE; }
	public String getODR_NO_2() { return m_ODR_NO_2; }
	public String getUNSTOCK_MODIFY_COUNT() { return m_UNSTOCK_MODIFY_COUNT; }
	public String getODR_CMPLT_FLG() { return m_ODR_CMPLT_FLG; }
	public String getODR_NO() { return m_ODR_NO; }
	public String gethaveFlag() { return m_haveFlag; }
	public String getPROJECT_CD() { return m_PROJECT_CD; }
	public String geth_CTL_SEQ_CD() { return m_h_CTL_SEQ_CD; }
	public String getSLIP_TRN_CD() { return m_SLIP_TRN_CD; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getJOB_ODR_COMP_FLG() { return m_JOB_ODR_COMP_FLG; }
	public String getPROJECT_NAME() { return m_PROJECT_NAME; }
	public String getESTIMATE_NO() { return m_ESTIMATE_NO; }
	public String getDETAIL_NO() { return m_DETAIL_NO; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getSALES_DATE() { return m_SALES_DATE; }
	public String getCUST_CHRG_PSN_CD() { return m_CUST_CHRG_PSN_CD; }
	public String getCUST_CHRG_PSN_NAME() { return m_CUST_CHRG_PSN_NAME; }
	public String getSALES_QTY() { return m_SALES_QTY; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getSALES_UNIT_PRICE() { return m_SALES_UNIT_PRICE; }
	public String getCUR_UNIT() { return m_CUR_UNIT; }
	public String getSALES_AMOUNT() { return m_SALES_AMOUNT; }
	public String getSALES_AMOUNT_YEN() { return m_SALES_AMOUNT_YEN; }
	public String getTAX_CD() { return m_TAX_CD; }
	public String getPAY_RATE() { return m_PAY_RATE; }
	public String getCUST_CD() { return m_CUST_CD; }
	public String getCUST_NAME() { return m_CUST_NAME; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getITEM_NAME_1() { return m_ITEM_NAME_1; }
	public String getCUST_ODR_NO() { return m_CUST_ODR_NO; }
	public String getDESINATED_DLV_DATE() { return m_DESINATED_DLV_DATE; }
	public String getOPTION_ID() { return m_OPTION_ID; }
	public String getINSTALL_FLG() { return m_INSTALL_FLG; }
	public String getSLIP_CD() { return m_SLIP_CD; }
	public String getSALSE_MODIFY_COUNT() { return m_SALSE_MODIFY_COUNT; }
	public String geth_SALES_SEQ_NO() { return m_h_SALES_SEQ_NO; }
	public String getAI_AR_IF_FLG() { return m_AI_AR_IF_FLG; }
	public String getSALES_SEQ_NO() { return m_SALES_SEQ_NO; }
	public String getSALES_TYP() { return m_SALES_TYP; }
	public String getSALES_DEPT_CD() { return m_SALES_DEPT_CD; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getPRD_ODR_PLACE_CD() { return m_PRD_ODR_PLACE_CD; }
	public String getODR_ACPT_PSN_CD() { return m_ODR_ACPT_PSN_CD; }
	public String getUNIT_CD() { return m_UNIT_CD; }
	public String getINSPC_ACPT_DATE() { return m_INSPC_ACPT_DATE; }
	public String getINSPC_ACPT_QTY() { return m_INSPC_ACPT_QTY; }
	public String getEXTERNAL_TAX_SALES_AMOUNT() { return m_EXTERNAL_TAX_SALES_AMOUNT; }
	public String getINTERNAL_TAX_SALES_AMOUNT() { return m_INTERNAL_TAX_SALES_AMOUNT; }
	public String getTAXFREE_SALES_AMOUNT() { return m_TAXFREE_SALES_AMOUNT; }
	public String getTAX_CREDIT_SALES_AMOUNT() { return m_TAX_CREDIT_SALES_AMOUNT; }
	public String getEXTERNAL_TAX_AMOUNT() { return m_EXTERNAL_TAX_AMOUNT; }
	public String getINTERNAL_TAX_AMOUNT() { return m_INTERNAL_TAX_AMOUNT; }
	public String getTAX_AMOUNT_1() { return m_TAX_AMOUNT_1; }
	public String getTAX_AMOUNT_2() { return m_TAX_AMOUNT_2; }
	public String getTAX_AMOUNT_3() { return m_TAX_AMOUNT_3; }
	public String getOWN_CUR_TAXCREDIT_SALES_AMOUNT() { return m_OWN_CUR_TAXCREDIT_SALES_AMOUNT; }
	public String getORG_SLIP_CD() { return m_ORG_SLIP_CD; }
	public String getCURRNCY_CD() { return m_CURRNCY_CD; }
	public String getSPCL_PRICE_CO() { return m_SPCL_PRICE_CO; }
	public String getREMARKS() { return m_REMARKS; }
	public String getINSPC_ACPT_TYP() { return m_INSPC_ACPT_TYP; }
	public String getSTATUS() { return m_STATUS; }
	public String getDEL_FLG() { return m_DEL_FLG; }
	public String getAPPR_FLG() { return m_APPR_FLG; }
	public String getAPPR_ID() { return m_APPR_ID; }
	public String getAPPR_DATE() { return m_APPR_DATE; }
	public String getCTL_SEQ_CD() { return m_CTL_SEQ_CD; }
	public String getWORK_TIME() { return m_WORK_TIME; }
	public String getWORK_DATE() { return m_WORK_DATE; }
	public String getWORK_PERSON_CD() { return m_WORK_PERSON_CD; }
	public String getWORK_REMARKS() { return m_WORK_REMARKS; }
	public String getHS_CTL_SEQ_CD() { return m_HS_CTL_SEQ_CD; }
	public String getNEW_OLD_FLG() { return m_NEW_OLD_FLG; }
	public String getTRAN_TYPE() { return m_TRAN_TYPE; }
	public String getCRCT_TYP() { return m_CRCT_TYP; }
	public String getAPR_SALES_VALUE() { return m_APR_SALES_VALUE; }
	public String getSALES_DEPT_NAME() { return m_SALES_DEPT_NAME; }
	public String getWORK_PERSON_NAME() { return m_WORK_PERSON_NAME; }
	public String getORG_CD() { return m_ORG_CD; }
	public String getORG_NAME() { return m_ORG_NAME; }
	public String getTAX_RATE_1() { return m_TAX_RATE_1; }
	public String getTAX_RATE_2() { return m_TAX_RATE_2; }
	public String getTAX_RATE_3() { return m_TAX_RATE_3; }
	public String getTAX_ROUND_TYP() { return m_TAX_ROUND_TYP; }
	public String getUSER_CD() { return m_USER_CD; }
	public String getUSER_NAME() { return m_USER_NAME; }
	public String getCUR_CD() { return m_CUR_CD; }
	public String getEXCH_TYP() { return m_EXCH_TYP; }
	public String getDETAIL_ROUND_TYP() { return m_DETAIL_ROUND_TYP; }
	public String getSYS_CLASS_CODE() { return m_SYS_CLASS_CODE; }
	public String getDECIMAL_FIG() { return m_DECIMAL_FIG; }
	public String geth_INSTALL_FLG() { return m_h_INSTALL_FLG; }
	public String getSEL_MODIFY_COUNT() { return m_SEL_MODIFY_COUNT; }

	public List getList_h_SALES_UNIT_PRICE() { return l_h_SALES_UNIT_PRICE; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_BUSINESS_OPR_DATE() { return l_BUSINESS_OPR_DATE; }
	public List getList_ODR_NO_2() { return l_ODR_NO_2; }
	public List getList_UNSTOCK_MODIFY_COUNT() { return l_UNSTOCK_MODIFY_COUNT; }
	public List getList_ODR_CMPLT_FLG() { return l_ODR_CMPLT_FLG; }
	public List getList_ODR_NO() { return l_ODR_NO; }
	public List getList_haveFlag() { return l_haveFlag; }
	public List getList_PROJECT_CD() { return l_PROJECT_CD; }
	public List getList_h_CTL_SEQ_CD() { return l_h_CTL_SEQ_CD; }
	public List getList_SLIP_TRN_CD() { return l_SLIP_TRN_CD; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_JOB_ODR_COMP_FLG() { return l_JOB_ODR_COMP_FLG; }
	public List getList_PROJECT_NAME() { return l_PROJECT_NAME; }
	public List getList_ESTIMATE_NO() { return l_ESTIMATE_NO; }
	public List getList_DETAIL_NO() { return l_DETAIL_NO; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_SALES_DATE() { return l_SALES_DATE; }
	public List getList_CUST_CHRG_PSN_CD() { return l_CUST_CHRG_PSN_CD; }
	public List getList_CUST_CHRG_PSN_NAME() { return l_CUST_CHRG_PSN_NAME; }
	public List getList_SALES_QTY() { return l_SALES_QTY; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_SALES_UNIT_PRICE() { return l_SALES_UNIT_PRICE; }
	public List getList_CUR_UNIT() { return l_CUR_UNIT; }
	public List getList_SALES_AMOUNT() { return l_SALES_AMOUNT; }
	public List getList_SALES_AMOUNT_YEN() { return l_SALES_AMOUNT_YEN; }
	public List getList_TAX_CD() { return l_TAX_CD; }
	public List getList_PAY_RATE() { return l_PAY_RATE; }
	public List getList_CUST_CD() { return l_CUST_CD; }
	public List getList_CUST_NAME() { return l_CUST_NAME; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_ITEM_NAME_1() { return l_ITEM_NAME_1; }
	public List getList_CUST_ODR_NO() { return l_CUST_ODR_NO; }
	public List getList_DESINATED_DLV_DATE() { return l_DESINATED_DLV_DATE; }
	public List getList_OPTION_ID() { return l_OPTION_ID; }
	public List getList_INSTALL_FLG() { return l_INSTALL_FLG; }
	public List getList_SLIP_CD() { return l_SLIP_CD; }
	public List getList_SALSE_MODIFY_COUNT() { return l_SALSE_MODIFY_COUNT; }
	public List getList_h_SALES_SEQ_NO() { return l_h_SALES_SEQ_NO; }
	public List getList_AI_AR_IF_FLG() { return l_AI_AR_IF_FLG; }
	public List getList_SALES_SEQ_NO() { return l_SALES_SEQ_NO; }
	public List getList_SALES_TYP() { return l_SALES_TYP; }
	public List getList_SALES_DEPT_CD() { return l_SALES_DEPT_CD; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_PRD_ODR_PLACE_CD() { return l_PRD_ODR_PLACE_CD; }
	public List getList_ODR_ACPT_PSN_CD() { return l_ODR_ACPT_PSN_CD; }
	public List getList_UNIT_CD() { return l_UNIT_CD; }
	public List getList_INSPC_ACPT_DATE() { return l_INSPC_ACPT_DATE; }
	public List getList_INSPC_ACPT_QTY() { return l_INSPC_ACPT_QTY; }
	public List getList_EXTERNAL_TAX_SALES_AMOUNT() { return l_EXTERNAL_TAX_SALES_AMOUNT; }
	public List getList_INTERNAL_TAX_SALES_AMOUNT() { return l_INTERNAL_TAX_SALES_AMOUNT; }
	public List getList_TAXFREE_SALES_AMOUNT() { return l_TAXFREE_SALES_AMOUNT; }
	public List getList_TAX_CREDIT_SALES_AMOUNT() { return l_TAX_CREDIT_SALES_AMOUNT; }
	public List getList_EXTERNAL_TAX_AMOUNT() { return l_EXTERNAL_TAX_AMOUNT; }
	public List getList_INTERNAL_TAX_AMOUNT() { return l_INTERNAL_TAX_AMOUNT; }
	public List getList_TAX_AMOUNT_1() { return l_TAX_AMOUNT_1; }
	public List getList_TAX_AMOUNT_2() { return l_TAX_AMOUNT_2; }
	public List getList_TAX_AMOUNT_3() { return l_TAX_AMOUNT_3; }
	public List getList_OWN_CUR_TAXCREDIT_SALES_AMOUNT() { return l_OWN_CUR_TAXCREDIT_SALES_AMOUNT; }
	public List getList_ORG_SLIP_CD() { return l_ORG_SLIP_CD; }
	public List getList_CURRNCY_CD() { return l_CURRNCY_CD; }
	public List getList_SPCL_PRICE_CO() { return l_SPCL_PRICE_CO; }
	public List getList_REMARKS() { return l_REMARKS; }
	public List getList_INSPC_ACPT_TYP() { return l_INSPC_ACPT_TYP; }
	public List getList_STATUS() { return l_STATUS; }
	public List getList_DEL_FLG() { return l_DEL_FLG; }
	public List getList_APPR_FLG() { return l_APPR_FLG; }
	public List getList_APPR_ID() { return l_APPR_ID; }
	public List getList_APPR_DATE() { return l_APPR_DATE; }
	public List getList_CTL_SEQ_CD() { return l_CTL_SEQ_CD; }
	public List getList_WORK_TIME() { return l_WORK_TIME; }
	public List getList_WORK_DATE() { return l_WORK_DATE; }
	public List getList_WORK_PERSON_CD() { return l_WORK_PERSON_CD; }
	public List getList_WORK_REMARKS() { return l_WORK_REMARKS; }
	public List getList_HS_CTL_SEQ_CD() { return l_HS_CTL_SEQ_CD; }
	public List getList_NEW_OLD_FLG() { return l_NEW_OLD_FLG; }
	public List getList_TRAN_TYPE() { return l_TRAN_TYPE; }
	public List getList_CRCT_TYP() { return l_CRCT_TYP; }
	public List getList_APR_SALES_VALUE() { return l_APR_SALES_VALUE; }
	public List getList_SALES_DEPT_NAME() { return l_SALES_DEPT_NAME; }
	public List getList_WORK_PERSON_NAME() { return l_WORK_PERSON_NAME; }
	public List getList_ORG_CD() { return l_ORG_CD; }
	public List getList_ORG_NAME() { return l_ORG_NAME; }
	public List getList_TAX_RATE_1() { return l_TAX_RATE_1; }
	public List getList_TAX_RATE_2() { return l_TAX_RATE_2; }
	public List getList_TAX_RATE_3() { return l_TAX_RATE_3; }
	public List getList_TAX_ROUND_TYP() { return l_TAX_ROUND_TYP; }
	public List getList_USER_CD() { return l_USER_CD; }
	public List getList_USER_NAME() { return l_USER_NAME; }
	public List getList_CUR_CD() { return l_CUR_CD; }
	public List getList_EXCH_TYP() { return l_EXCH_TYP; }
	public List getList_DETAIL_ROUND_TYP() { return l_DETAIL_ROUND_TYP; }
	public List getList_SYS_CLASS_CODE() { return l_SYS_CLASS_CODE; }
	public List getList_DECIMAL_FIG() { return l_DECIMAL_FIG; }
	public List getList_h_INSTALL_FLG() { return l_h_INSTALL_FLG; }
	public List getList_SEL_MODIFY_COUNT() { return l_SEL_MODIFY_COUNT; }

	public void seth_SALES_UNIT_PRICE(String val) { m_h_SALES_UNIT_PRICE = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setBUSINESS_OPR_DATE(String val) { m_BUSINESS_OPR_DATE = val; }
	public void setODR_NO_2(String val) { m_ODR_NO_2 = val; }
	public void setUNSTOCK_MODIFY_COUNT(String val) { m_UNSTOCK_MODIFY_COUNT = val; }
	public void setODR_CMPLT_FLG(String val) { m_ODR_CMPLT_FLG = val; }
	public void setODR_NO(String val) { m_ODR_NO = val; }
	public void sethaveFlag(String val) { m_haveFlag = val; }
	public void setPROJECT_CD(String val) { m_PROJECT_CD = val; }
	public void seth_CTL_SEQ_CD(String val) { m_h_CTL_SEQ_CD = val; }
	public void setSLIP_TRN_CD(String val) { m_SLIP_TRN_CD = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setJOB_ODR_COMP_FLG(String val) { m_JOB_ODR_COMP_FLG = val; }
	public void setPROJECT_NAME(String val) { m_PROJECT_NAME = val; }
	public void setESTIMATE_NO(String val) { m_ESTIMATE_NO = val; }
	public void setDETAIL_NO(String val) { m_DETAIL_NO = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setSALES_DATE(String val) { m_SALES_DATE = val; }
	public void setCUST_CHRG_PSN_CD(String val) { m_CUST_CHRG_PSN_CD = val; }
	public void setCUST_CHRG_PSN_NAME(String val) { m_CUST_CHRG_PSN_NAME = val; }
	public void setSALES_QTY(String val) { m_SALES_QTY = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setSALES_UNIT_PRICE(String val) { m_SALES_UNIT_PRICE = val; }
	public void setCUR_UNIT(String val) { m_CUR_UNIT = val; }
	public void setSALES_AMOUNT(String val) { m_SALES_AMOUNT = val; }
	public void setSALES_AMOUNT_YEN(String val) { m_SALES_AMOUNT_YEN = val; }
	public void setTAX_CD(String val) { m_TAX_CD = val; }
	public void setPAY_RATE(String val) { m_PAY_RATE = val; }
	public void setCUST_CD(String val) { m_CUST_CD = val; }
	public void setCUST_NAME(String val) { m_CUST_NAME = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setITEM_NAME_1(String val) { m_ITEM_NAME_1 = val; }
	public void setCUST_ODR_NO(String val) { m_CUST_ODR_NO = val; }
	public void setDESINATED_DLV_DATE(String val) { m_DESINATED_DLV_DATE = val; }
	public void setOPTION_ID(String val) { m_OPTION_ID = val; }
	public void setINSTALL_FLG(String val) { m_INSTALL_FLG = val; }
	public void setSLIP_CD(String val) { m_SLIP_CD = val; }
	public void setSALSE_MODIFY_COUNT(String val) { m_SALSE_MODIFY_COUNT = val; }
	public void seth_SALES_SEQ_NO(String val) { m_h_SALES_SEQ_NO = val; }
	public void setAI_AR_IF_FLG(String val) { m_AI_AR_IF_FLG = val; }
	public void setSALES_SEQ_NO(String val) { m_SALES_SEQ_NO = val; }
	public void setSALES_TYP(String val) { m_SALES_TYP = val; }
	public void setSALES_DEPT_CD(String val) { m_SALES_DEPT_CD = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void setPRD_ODR_PLACE_CD(String val) { m_PRD_ODR_PLACE_CD = val; }
	public void setODR_ACPT_PSN_CD(String val) { m_ODR_ACPT_PSN_CD = val; }
	public void setUNIT_CD(String val) { m_UNIT_CD = val; }
	public void setINSPC_ACPT_DATE(String val) { m_INSPC_ACPT_DATE = val; }
	public void setINSPC_ACPT_QTY(String val) { m_INSPC_ACPT_QTY = val; }
	public void setEXTERNAL_TAX_SALES_AMOUNT(String val) { m_EXTERNAL_TAX_SALES_AMOUNT = val; }
	public void setINTERNAL_TAX_SALES_AMOUNT(String val) { m_INTERNAL_TAX_SALES_AMOUNT = val; }
	public void setTAXFREE_SALES_AMOUNT(String val) { m_TAXFREE_SALES_AMOUNT = val; }
	public void setTAX_CREDIT_SALES_AMOUNT(String val) { m_TAX_CREDIT_SALES_AMOUNT = val; }
	public void setEXTERNAL_TAX_AMOUNT(String val) { m_EXTERNAL_TAX_AMOUNT = val; }
	public void setINTERNAL_TAX_AMOUNT(String val) { m_INTERNAL_TAX_AMOUNT = val; }
	public void setTAX_AMOUNT_1(String val) { m_TAX_AMOUNT_1 = val; }
	public void setTAX_AMOUNT_2(String val) { m_TAX_AMOUNT_2 = val; }
	public void setTAX_AMOUNT_3(String val) { m_TAX_AMOUNT_3 = val; }
	public void setOWN_CUR_TAXCREDIT_SALES_AMOUNT(String val) { m_OWN_CUR_TAXCREDIT_SALES_AMOUNT = val; }
	public void setORG_SLIP_CD(String val) { m_ORG_SLIP_CD = val; }
	public void setCURRNCY_CD(String val) { m_CURRNCY_CD = val; }
	public void setSPCL_PRICE_CO(String val) { m_SPCL_PRICE_CO = val; }
	public void setREMARKS(String val) { m_REMARKS = val; }
	public void setINSPC_ACPT_TYP(String val) { m_INSPC_ACPT_TYP = val; }
	public void setSTATUS(String val) { m_STATUS = val; }
	public void setDEL_FLG(String val) { m_DEL_FLG = val; }
	public void setAPPR_FLG(String val) { m_APPR_FLG = val; }
	public void setAPPR_ID(String val) { m_APPR_ID = val; }
	public void setAPPR_DATE(String val) { m_APPR_DATE = val; }
	public void setCTL_SEQ_CD(String val) { m_CTL_SEQ_CD = val; }
	public void setWORK_TIME(String val) { m_WORK_TIME = val; }
	public void setWORK_DATE(String val) { m_WORK_DATE = val; }
	public void setWORK_PERSON_CD(String val) { m_WORK_PERSON_CD = val; }
	public void setWORK_REMARKS(String val) { m_WORK_REMARKS = val; }
	public void setHS_CTL_SEQ_CD(String val) { m_HS_CTL_SEQ_CD = val; }
	public void setNEW_OLD_FLG(String val) { m_NEW_OLD_FLG = val; }
	public void setTRAN_TYPE(String val) { m_TRAN_TYPE = val; }
	public void setCRCT_TYP(String val) { m_CRCT_TYP = val; }
	public void setAPR_SALES_VALUE(String val) { m_APR_SALES_VALUE = val; }
	public void setSALES_DEPT_NAME(String val) { m_SALES_DEPT_NAME = val; }
	public void setWORK_PERSON_NAME(String val) { m_WORK_PERSON_NAME = val; }
	public void setORG_CD(String val) { m_ORG_CD = val; }
	public void setORG_NAME(String val) { m_ORG_NAME = val; }
	public void setTAX_RATE_1(String val) { m_TAX_RATE_1 = val; }
	public void setTAX_RATE_2(String val) { m_TAX_RATE_2 = val; }
	public void setTAX_RATE_3(String val) { m_TAX_RATE_3 = val; }
	public void setTAX_ROUND_TYP(String val) { m_TAX_ROUND_TYP = val; }
	public void setUSER_CD(String val) { m_USER_CD = val; }
	public void setUSER_NAME(String val) { m_USER_NAME = val; }
	public void setCUR_CD(String val) { m_CUR_CD = val; }
	public void setEXCH_TYP(String val) { m_EXCH_TYP = val; }
	public void setDETAIL_ROUND_TYP(String val) { m_DETAIL_ROUND_TYP = val; }
	public void setSYS_CLASS_CODE(String val) { m_SYS_CLASS_CODE = val; }
	public void setDECIMAL_FIG(String val) { m_DECIMAL_FIG = val; }
	public void seth_INSTALL_FLG(String val) { m_h_INSTALL_FLG = val; }
	public void setSEL_MODIFY_COUNT(String val) { m_SEL_MODIFY_COUNT = val; }


	public void setList_h_SALES_UNIT_PRICE(List list) { l_h_SALES_UNIT_PRICE = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_BUSINESS_OPR_DATE(List list) { l_BUSINESS_OPR_DATE = list; }
	public void setList_ODR_NO_2(List list) { l_ODR_NO_2 = list; }
	public void setList_UNSTOCK_MODIFY_COUNT(List list) { l_UNSTOCK_MODIFY_COUNT = list; }
	public void setList_ODR_CMPLT_FLG(List list) { l_ODR_CMPLT_FLG = list; }
	public void setList_ODR_NO(List list) { l_ODR_NO = list; }
	public void setList_haveFlag(List list) { l_haveFlag = list; }
	public void setList_PROJECT_CD(List list) { l_PROJECT_CD = list; }
	public void setList_h_CTL_SEQ_CD(List list) { l_h_CTL_SEQ_CD = list; }
	public void setList_SLIP_TRN_CD(List list) { l_SLIP_TRN_CD = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_JOB_ODR_COMP_FLG(List list) { l_JOB_ODR_COMP_FLG = list; }
	public void setList_PROJECT_NAME(List list) { l_PROJECT_NAME = list; }
	public void setList_ESTIMATE_NO(List list) { l_ESTIMATE_NO = list; }
	public void setList_DETAIL_NO(List list) { l_DETAIL_NO = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_SALES_DATE(List list) { l_SALES_DATE = list; }
	public void setList_CUST_CHRG_PSN_CD(List list) { l_CUST_CHRG_PSN_CD = list; }
	public void setList_CUST_CHRG_PSN_NAME(List list) { l_CUST_CHRG_PSN_NAME = list; }
	public void setList_SALES_QTY(List list) { l_SALES_QTY = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_SALES_UNIT_PRICE(List list) { l_SALES_UNIT_PRICE = list; }
	public void setList_CUR_UNIT(List list) { l_CUR_UNIT = list; }
	public void setList_SALES_AMOUNT(List list) { l_SALES_AMOUNT = list; }
	public void setList_SALES_AMOUNT_YEN(List list) { l_SALES_AMOUNT_YEN = list; }
	public void setList_TAX_CD(List list) { l_TAX_CD = list; }
	public void setList_PAY_RATE(List list) { l_PAY_RATE = list; }
	public void setList_CUST_CD(List list) { l_CUST_CD = list; }
	public void setList_CUST_NAME(List list) { l_CUST_NAME = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_ITEM_NAME_1(List list) { l_ITEM_NAME_1 = list; }
	public void setList_CUST_ODR_NO(List list) { l_CUST_ODR_NO = list; }
	public void setList_DESINATED_DLV_DATE(List list) { l_DESINATED_DLV_DATE = list; }
	public void setList_OPTION_ID(List list) { l_OPTION_ID = list; }
	public void setList_INSTALL_FLG(List list) { l_INSTALL_FLG = list; }
	public void setList_SLIP_CD(List list) { l_SLIP_CD = list; }
	public void setList_SALSE_MODIFY_COUNT(List list) { l_SALSE_MODIFY_COUNT = list; }
	public void setList_h_SALES_SEQ_NO(List list) { l_h_SALES_SEQ_NO = list; }
	public void setList_AI_AR_IF_FLG(List list) { l_AI_AR_IF_FLG = list; }
	public void setList_SALES_SEQ_NO(List list) { l_SALES_SEQ_NO = list; }
	public void setList_SALES_TYP(List list) { l_SALES_TYP = list; }
	public void setList_SALES_DEPT_CD(List list) { l_SALES_DEPT_CD = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_PRD_ODR_PLACE_CD(List list) { l_PRD_ODR_PLACE_CD = list; }
	public void setList_ODR_ACPT_PSN_CD(List list) { l_ODR_ACPT_PSN_CD = list; }
	public void setList_UNIT_CD(List list) { l_UNIT_CD = list; }
	public void setList_INSPC_ACPT_DATE(List list) { l_INSPC_ACPT_DATE = list; }
	public void setList_INSPC_ACPT_QTY(List list) { l_INSPC_ACPT_QTY = list; }
	public void setList_EXTERNAL_TAX_SALES_AMOUNT(List list) { l_EXTERNAL_TAX_SALES_AMOUNT = list; }
	public void setList_INTERNAL_TAX_SALES_AMOUNT(List list) { l_INTERNAL_TAX_SALES_AMOUNT = list; }
	public void setList_TAXFREE_SALES_AMOUNT(List list) { l_TAXFREE_SALES_AMOUNT = list; }
	public void setList_TAX_CREDIT_SALES_AMOUNT(List list) { l_TAX_CREDIT_SALES_AMOUNT = list; }
	public void setList_EXTERNAL_TAX_AMOUNT(List list) { l_EXTERNAL_TAX_AMOUNT = list; }
	public void setList_INTERNAL_TAX_AMOUNT(List list) { l_INTERNAL_TAX_AMOUNT = list; }
	public void setList_TAX_AMOUNT_1(List list) { l_TAX_AMOUNT_1 = list; }
	public void setList_TAX_AMOUNT_2(List list) { l_TAX_AMOUNT_2 = list; }
	public void setList_TAX_AMOUNT_3(List list) { l_TAX_AMOUNT_3 = list; }
	public void setList_OWN_CUR_TAXCREDIT_SALES_AMOUNT(List list) { l_OWN_CUR_TAXCREDIT_SALES_AMOUNT = list; }
	public void setList_ORG_SLIP_CD(List list) { l_ORG_SLIP_CD = list; }
	public void setList_CURRNCY_CD(List list) { l_CURRNCY_CD = list; }
	public void setList_SPCL_PRICE_CO(List list) { l_SPCL_PRICE_CO = list; }
	public void setList_REMARKS(List list) { l_REMARKS = list; }
	public void setList_INSPC_ACPT_TYP(List list) { l_INSPC_ACPT_TYP = list; }
	public void setList_STATUS(List list) { l_STATUS = list; }
	public void setList_DEL_FLG(List list) { l_DEL_FLG = list; }
	public void setList_APPR_FLG(List list) { l_APPR_FLG = list; }
	public void setList_APPR_ID(List list) { l_APPR_ID = list; }
	public void setList_APPR_DATE(List list) { l_APPR_DATE = list; }
	public void setList_CTL_SEQ_CD(List list) { l_CTL_SEQ_CD = list; }
	public void setList_WORK_TIME(List list) { l_WORK_TIME = list; }
	public void setList_WORK_DATE(List list) { l_WORK_DATE = list; }
	public void setList_WORK_PERSON_CD(List list) { l_WORK_PERSON_CD = list; }
	public void setList_WORK_REMARKS(List list) { l_WORK_REMARKS = list; }
	public void setList_HS_CTL_SEQ_CD(List list) { l_HS_CTL_SEQ_CD = list; }
	public void setList_NEW_OLD_FLG(List list) { l_NEW_OLD_FLG = list; }
	public void setList_TRAN_TYPE(List list) { l_TRAN_TYPE = list; }
	public void setList_CRCT_TYP(List list) { l_CRCT_TYP = list; }
	public void setList_APR_SALES_VALUE(List list) { l_APR_SALES_VALUE = list; }
	public void setList_SALES_DEPT_NAME(List list) { l_SALES_DEPT_NAME = list; }
	public void setList_WORK_PERSON_NAME(List list) { l_WORK_PERSON_NAME = list; }
	public void setList_ORG_CD(List list) { l_ORG_CD = list; }
	public void setList_ORG_NAME(List list) { l_ORG_NAME = list; }
	public void setList_TAX_RATE_1(List list) { l_TAX_RATE_1 = list; }
	public void setList_TAX_RATE_2(List list) { l_TAX_RATE_2 = list; }
	public void setList_TAX_RATE_3(List list) { l_TAX_RATE_3 = list; }
	public void setList_TAX_ROUND_TYP(List list) { l_TAX_ROUND_TYP = list; }
	public void setList_USER_CD(List list) { l_USER_CD = list; }
	public void setList_USER_NAME(List list) { l_USER_NAME = list; }
	public void setList_CUR_CD(List list) { l_CUR_CD = list; }
	public void setList_EXCH_TYP(List list) { l_EXCH_TYP = list; }
	public void setList_DETAIL_ROUND_TYP(List list) { l_DETAIL_ROUND_TYP = list; }
	public void setList_SYS_CLASS_CODE(List list) { l_SYS_CLASS_CODE = list; }
	public void setList_DECIMAL_FIG(List list) { l_DECIMAL_FIG = list; }
	public void setList_h_INSTALL_FLG(List list) { l_h_INSTALL_FLG = list; }
	public void setList_SEL_MODIFY_COUNT(List list) { l_SEL_MODIFY_COUNT = list; }

	public int setL2L_h_SALES_UNIT_PRICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_SALES_UNIT_PRICE == null) {
			l_h_SALES_UNIT_PRICE = new ArrayList();
		} else {
			l_h_SALES_UNIT_PRICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_SALES_UNIT_PRICE.add(((KR0080010Struct) list.get(i)).geth_SALES_UNIT_PRICE());
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
			l_COMPANY_CD.add(((KR0080010Struct) list.get(i)).getCOMPANY_CD());
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
			l_BUSINESS_OPR_DATE.add(((KR0080010Struct) list.get(i)).getBUSINESS_OPR_DATE());
		}
		return size;
	}
	public int setL2L_ODR_NO_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_NO_2 == null) {
			l_ODR_NO_2 = new ArrayList();
		} else {
			l_ODR_NO_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_NO_2.add(((KR0080010Struct) list.get(i)).getODR_NO_2());
		}
		return size;
	}
	public int setL2L_UNSTOCK_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNSTOCK_MODIFY_COUNT == null) {
			l_UNSTOCK_MODIFY_COUNT = new ArrayList();
		} else {
			l_UNSTOCK_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNSTOCK_MODIFY_COUNT.add(((KR0080010Struct) list.get(i)).getUNSTOCK_MODIFY_COUNT());
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
			l_ODR_CMPLT_FLG.add(((KR0080010Struct) list.get(i)).getODR_CMPLT_FLG());
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
			l_ODR_NO.add(((KR0080010Struct) list.get(i)).getODR_NO());
		}
		return size;
	}
	public int setL2L_haveFlag(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_haveFlag == null) {
			l_haveFlag = new ArrayList();
		} else {
			l_haveFlag.clear();
		}
		for (int i = 0; i < size; i++) {
			l_haveFlag.add(((KR0080010Struct) list.get(i)).gethaveFlag());
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
			l_PROJECT_CD.add(((KR0080010Struct) list.get(i)).getPROJECT_CD());
		}
		return size;
	}
	public int setL2L_h_CTL_SEQ_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_CTL_SEQ_CD == null) {
			l_h_CTL_SEQ_CD = new ArrayList();
		} else {
			l_h_CTL_SEQ_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_CTL_SEQ_CD.add(((KR0080010Struct) list.get(i)).geth_CTL_SEQ_CD());
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
			l_SLIP_TRN_CD.add(((KR0080010Struct) list.get(i)).getSLIP_TRN_CD());
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
			l_MODIFY_COUNT.add(((KR0080010Struct) list.get(i)).getMODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_JOB_ODR_COMP_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_COMP_FLG == null) {
			l_JOB_ODR_COMP_FLG = new ArrayList();
		} else {
			l_JOB_ODR_COMP_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_COMP_FLG.add(((KR0080010Struct) list.get(i)).getJOB_ODR_COMP_FLG());
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
			l_PROJECT_NAME.add(((KR0080010Struct) list.get(i)).getPROJECT_NAME());
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
			l_ESTIMATE_NO.add(((KR0080010Struct) list.get(i)).getESTIMATE_NO());
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
			l_DETAIL_NO.add(((KR0080010Struct) list.get(i)).getDETAIL_NO());
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
			l_ITEM_NAME.add(((KR0080010Struct) list.get(i)).getITEM_NAME());
		}
		return size;
	}
	public int setL2L_SALES_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SALES_DATE == null) {
			l_SALES_DATE = new ArrayList();
		} else {
			l_SALES_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SALES_DATE.add(((KR0080010Struct) list.get(i)).getSALES_DATE());
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
			l_CUST_CHRG_PSN_CD.add(((KR0080010Struct) list.get(i)).getCUST_CHRG_PSN_CD());
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
			l_CUST_CHRG_PSN_NAME.add(((KR0080010Struct) list.get(i)).getCUST_CHRG_PSN_NAME());
		}
		return size;
	}
	public int setL2L_SALES_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SALES_QTY == null) {
			l_SALES_QTY = new ArrayList();
		} else {
			l_SALES_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SALES_QTY.add(((KR0080010Struct) list.get(i)).getSALES_QTY());
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
			l_STOCK_UNIT.add(((KR0080010Struct) list.get(i)).getSTOCK_UNIT());
		}
		return size;
	}
	public int setL2L_SALES_UNIT_PRICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SALES_UNIT_PRICE == null) {
			l_SALES_UNIT_PRICE = new ArrayList();
		} else {
			l_SALES_UNIT_PRICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SALES_UNIT_PRICE.add(((KR0080010Struct) list.get(i)).getSALES_UNIT_PRICE());
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
			l_CUR_UNIT.add(((KR0080010Struct) list.get(i)).getCUR_UNIT());
		}
		return size;
	}
	public int setL2L_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SALES_AMOUNT == null) {
			l_SALES_AMOUNT = new ArrayList();
		} else {
			l_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SALES_AMOUNT.add(((KR0080010Struct) list.get(i)).getSALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_SALES_AMOUNT_YEN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SALES_AMOUNT_YEN == null) {
			l_SALES_AMOUNT_YEN = new ArrayList();
		} else {
			l_SALES_AMOUNT_YEN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SALES_AMOUNT_YEN.add(((KR0080010Struct) list.get(i)).getSALES_AMOUNT_YEN());
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
			l_TAX_CD.add(((KR0080010Struct) list.get(i)).getTAX_CD());
		}
		return size;
	}
	public int setL2L_PAY_RATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PAY_RATE == null) {
			l_PAY_RATE = new ArrayList();
		} else {
			l_PAY_RATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PAY_RATE.add(((KR0080010Struct) list.get(i)).getPAY_RATE());
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
			l_CUST_CD.add(((KR0080010Struct) list.get(i)).getCUST_CD());
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
			l_CUST_NAME.add(((KR0080010Struct) list.get(i)).getCUST_NAME());
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
			l_ITEM_CD.add(((KR0080010Struct) list.get(i)).getITEM_CD());
		}
		return size;
	}
	public int setL2L_ITEM_NAME_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_NAME_1 == null) {
			l_ITEM_NAME_1 = new ArrayList();
		} else {
			l_ITEM_NAME_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_NAME_1.add(((KR0080010Struct) list.get(i)).getITEM_NAME_1());
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
			l_CUST_ODR_NO.add(((KR0080010Struct) list.get(i)).getCUST_ODR_NO());
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
			l_DESINATED_DLV_DATE.add(((KR0080010Struct) list.get(i)).getDESINATED_DLV_DATE());
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
			l_OPTION_ID.add(((KR0080010Struct) list.get(i)).getOPTION_ID());
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
			l_INSTALL_FLG.add(((KR0080010Struct) list.get(i)).getINSTALL_FLG());
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
			l_SLIP_CD.add(((KR0080010Struct) list.get(i)).getSLIP_CD());
		}
		return size;
	}
	public int setL2L_SALSE_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SALSE_MODIFY_COUNT == null) {
			l_SALSE_MODIFY_COUNT = new ArrayList();
		} else {
			l_SALSE_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SALSE_MODIFY_COUNT.add(((KR0080010Struct) list.get(i)).getSALSE_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_h_SALES_SEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_SALES_SEQ_NO == null) {
			l_h_SALES_SEQ_NO = new ArrayList();
		} else {
			l_h_SALES_SEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_SALES_SEQ_NO.add(((KR0080010Struct) list.get(i)).geth_SALES_SEQ_NO());
		}
		return size;
	}
	public int setL2L_AI_AR_IF_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_AI_AR_IF_FLG == null) {
			l_AI_AR_IF_FLG = new ArrayList();
		} else {
			l_AI_AR_IF_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_AI_AR_IF_FLG.add(((KR0080010Struct) list.get(i)).getAI_AR_IF_FLG());
		}
		return size;
	}
	public int setL2L_SALES_SEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SALES_SEQ_NO == null) {
			l_SALES_SEQ_NO = new ArrayList();
		} else {
			l_SALES_SEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SALES_SEQ_NO.add(((KR0080010Struct) list.get(i)).getSALES_SEQ_NO());
		}
		return size;
	}
	public int setL2L_SALES_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SALES_TYP == null) {
			l_SALES_TYP = new ArrayList();
		} else {
			l_SALES_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SALES_TYP.add(((KR0080010Struct) list.get(i)).getSALES_TYP());
		}
		return size;
	}
	public int setL2L_SALES_DEPT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SALES_DEPT_CD == null) {
			l_SALES_DEPT_CD = new ArrayList();
		} else {
			l_SALES_DEPT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SALES_DEPT_CD.add(((KR0080010Struct) list.get(i)).getSALES_DEPT_CD());
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
			l_VEND_CD.add(((KR0080010Struct) list.get(i)).getVEND_CD());
		}
		return size;
	}
	public int setL2L_PRD_ODR_PLACE_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRD_ODR_PLACE_CD == null) {
			l_PRD_ODR_PLACE_CD = new ArrayList();
		} else {
			l_PRD_ODR_PLACE_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRD_ODR_PLACE_CD.add(((KR0080010Struct) list.get(i)).getPRD_ODR_PLACE_CD());
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
			l_ODR_ACPT_PSN_CD.add(((KR0080010Struct) list.get(i)).getODR_ACPT_PSN_CD());
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
			l_UNIT_CD.add(((KR0080010Struct) list.get(i)).getUNIT_CD());
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
			l_INSPC_ACPT_DATE.add(((KR0080010Struct) list.get(i)).getINSPC_ACPT_DATE());
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
			l_INSPC_ACPT_QTY.add(((KR0080010Struct) list.get(i)).getINSPC_ACPT_QTY());
		}
		return size;
	}
	public int setL2L_EXTERNAL_TAX_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXTERNAL_TAX_SALES_AMOUNT == null) {
			l_EXTERNAL_TAX_SALES_AMOUNT = new ArrayList();
		} else {
			l_EXTERNAL_TAX_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXTERNAL_TAX_SALES_AMOUNT.add(((KR0080010Struct) list.get(i)).getEXTERNAL_TAX_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_INTERNAL_TAX_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INTERNAL_TAX_SALES_AMOUNT == null) {
			l_INTERNAL_TAX_SALES_AMOUNT = new ArrayList();
		} else {
			l_INTERNAL_TAX_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INTERNAL_TAX_SALES_AMOUNT.add(((KR0080010Struct) list.get(i)).getINTERNAL_TAX_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_TAXFREE_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAXFREE_SALES_AMOUNT == null) {
			l_TAXFREE_SALES_AMOUNT = new ArrayList();
		} else {
			l_TAXFREE_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAXFREE_SALES_AMOUNT.add(((KR0080010Struct) list.get(i)).getTAXFREE_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_TAX_CREDIT_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_CREDIT_SALES_AMOUNT == null) {
			l_TAX_CREDIT_SALES_AMOUNT = new ArrayList();
		} else {
			l_TAX_CREDIT_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_CREDIT_SALES_AMOUNT.add(((KR0080010Struct) list.get(i)).getTAX_CREDIT_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_EXTERNAL_TAX_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXTERNAL_TAX_AMOUNT == null) {
			l_EXTERNAL_TAX_AMOUNT = new ArrayList();
		} else {
			l_EXTERNAL_TAX_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXTERNAL_TAX_AMOUNT.add(((KR0080010Struct) list.get(i)).getEXTERNAL_TAX_AMOUNT());
		}
		return size;
	}
	public int setL2L_INTERNAL_TAX_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INTERNAL_TAX_AMOUNT == null) {
			l_INTERNAL_TAX_AMOUNT = new ArrayList();
		} else {
			l_INTERNAL_TAX_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INTERNAL_TAX_AMOUNT.add(((KR0080010Struct) list.get(i)).getINTERNAL_TAX_AMOUNT());
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
			l_TAX_AMOUNT_1.add(((KR0080010Struct) list.get(i)).getTAX_AMOUNT_1());
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
			l_TAX_AMOUNT_2.add(((KR0080010Struct) list.get(i)).getTAX_AMOUNT_2());
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
			l_TAX_AMOUNT_3.add(((KR0080010Struct) list.get(i)).getTAX_AMOUNT_3());
		}
		return size;
	}
	public int setL2L_OWN_CUR_TAXCREDIT_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OWN_CUR_TAXCREDIT_SALES_AMOUNT == null) {
			l_OWN_CUR_TAXCREDIT_SALES_AMOUNT = new ArrayList();
		} else {
			l_OWN_CUR_TAXCREDIT_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OWN_CUR_TAXCREDIT_SALES_AMOUNT.add(((KR0080010Struct) list.get(i)).getOWN_CUR_TAXCREDIT_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_ORG_SLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ORG_SLIP_CD == null) {
			l_ORG_SLIP_CD = new ArrayList();
		} else {
			l_ORG_SLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ORG_SLIP_CD.add(((KR0080010Struct) list.get(i)).getORG_SLIP_CD());
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
			l_CURRNCY_CD.add(((KR0080010Struct) list.get(i)).getCURRNCY_CD());
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
			l_SPCL_PRICE_CO.add(((KR0080010Struct) list.get(i)).getSPCL_PRICE_CO());
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
			l_REMARKS.add(((KR0080010Struct) list.get(i)).getREMARKS());
		}
		return size;
	}
	public int setL2L_INSPC_ACPT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INSPC_ACPT_TYP == null) {
			l_INSPC_ACPT_TYP = new ArrayList();
		} else {
			l_INSPC_ACPT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INSPC_ACPT_TYP.add(((KR0080010Struct) list.get(i)).getINSPC_ACPT_TYP());
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
			l_STATUS.add(((KR0080010Struct) list.get(i)).getSTATUS());
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
			l_DEL_FLG.add(((KR0080010Struct) list.get(i)).getDEL_FLG());
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
			l_APPR_FLG.add(((KR0080010Struct) list.get(i)).getAPPR_FLG());
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
			l_APPR_ID.add(((KR0080010Struct) list.get(i)).getAPPR_ID());
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
			l_APPR_DATE.add(((KR0080010Struct) list.get(i)).getAPPR_DATE());
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
			l_CTL_SEQ_CD.add(((KR0080010Struct) list.get(i)).getCTL_SEQ_CD());
		}
		return size;
	}
	public int setL2L_WORK_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WORK_TIME == null) {
			l_WORK_TIME = new ArrayList();
		} else {
			l_WORK_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WORK_TIME.add(((KR0080010Struct) list.get(i)).getWORK_TIME());
		}
		return size;
	}
	public int setL2L_WORK_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WORK_DATE == null) {
			l_WORK_DATE = new ArrayList();
		} else {
			l_WORK_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WORK_DATE.add(((KR0080010Struct) list.get(i)).getWORK_DATE());
		}
		return size;
	}
	public int setL2L_WORK_PERSON_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WORK_PERSON_CD == null) {
			l_WORK_PERSON_CD = new ArrayList();
		} else {
			l_WORK_PERSON_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WORK_PERSON_CD.add(((KR0080010Struct) list.get(i)).getWORK_PERSON_CD());
		}
		return size;
	}
	public int setL2L_WORK_REMARKS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WORK_REMARKS == null) {
			l_WORK_REMARKS = new ArrayList();
		} else {
			l_WORK_REMARKS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WORK_REMARKS.add(((KR0080010Struct) list.get(i)).getWORK_REMARKS());
		}
		return size;
	}
	public int setL2L_HS_CTL_SEQ_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HS_CTL_SEQ_CD == null) {
			l_HS_CTL_SEQ_CD = new ArrayList();
		} else {
			l_HS_CTL_SEQ_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HS_CTL_SEQ_CD.add(((KR0080010Struct) list.get(i)).getHS_CTL_SEQ_CD());
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
			l_NEW_OLD_FLG.add(((KR0080010Struct) list.get(i)).getNEW_OLD_FLG());
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
			l_TRAN_TYPE.add(((KR0080010Struct) list.get(i)).getTRAN_TYPE());
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
			l_CRCT_TYP.add(((KR0080010Struct) list.get(i)).getCRCT_TYP());
		}
		return size;
	}
	public int setL2L_APR_SALES_VALUE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_APR_SALES_VALUE == null) {
			l_APR_SALES_VALUE = new ArrayList();
		} else {
			l_APR_SALES_VALUE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_APR_SALES_VALUE.add(((KR0080010Struct) list.get(i)).getAPR_SALES_VALUE());
		}
		return size;
	}
	public int setL2L_SALES_DEPT_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SALES_DEPT_NAME == null) {
			l_SALES_DEPT_NAME = new ArrayList();
		} else {
			l_SALES_DEPT_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SALES_DEPT_NAME.add(((KR0080010Struct) list.get(i)).getSALES_DEPT_NAME());
		}
		return size;
	}
	public int setL2L_WORK_PERSON_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WORK_PERSON_NAME == null) {
			l_WORK_PERSON_NAME = new ArrayList();
		} else {
			l_WORK_PERSON_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WORK_PERSON_NAME.add(((KR0080010Struct) list.get(i)).getWORK_PERSON_NAME());
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
			l_ORG_CD.add(((KR0080010Struct) list.get(i)).getORG_CD());
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
			l_ORG_NAME.add(((KR0080010Struct) list.get(i)).getORG_NAME());
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
			l_TAX_RATE_1.add(((KR0080010Struct) list.get(i)).getTAX_RATE_1());
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
			l_TAX_RATE_2.add(((KR0080010Struct) list.get(i)).getTAX_RATE_2());
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
			l_TAX_RATE_3.add(((KR0080010Struct) list.get(i)).getTAX_RATE_3());
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
			l_TAX_ROUND_TYP.add(((KR0080010Struct) list.get(i)).getTAX_ROUND_TYP());
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
			l_USER_CD.add(((KR0080010Struct) list.get(i)).getUSER_CD());
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
			l_USER_NAME.add(((KR0080010Struct) list.get(i)).getUSER_NAME());
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
			l_CUR_CD.add(((KR0080010Struct) list.get(i)).getCUR_CD());
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
			l_EXCH_TYP.add(((KR0080010Struct) list.get(i)).getEXCH_TYP());
		}
		return size;
	}
	public int setL2L_DETAIL_ROUND_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DETAIL_ROUND_TYP == null) {
			l_DETAIL_ROUND_TYP = new ArrayList();
		} else {
			l_DETAIL_ROUND_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DETAIL_ROUND_TYP.add(((KR0080010Struct) list.get(i)).getDETAIL_ROUND_TYP());
		}
		return size;
	}
	public int setL2L_SYS_CLASS_CODE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SYS_CLASS_CODE == null) {
			l_SYS_CLASS_CODE = new ArrayList();
		} else {
			l_SYS_CLASS_CODE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SYS_CLASS_CODE.add(((KR0080010Struct) list.get(i)).getSYS_CLASS_CODE());
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
			l_DECIMAL_FIG.add(((KR0080010Struct) list.get(i)).getDECIMAL_FIG());
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
			l_h_INSTALL_FLG.add(((KR0080010Struct) list.get(i)).geth_INSTALL_FLG());
		}
		return size;
	}
	public int setL2L_SEL_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEL_MODIFY_COUNT == null) {
			l_SEL_MODIFY_COUNT = new ArrayList();
		} else {
			l_SEL_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEL_MODIFY_COUNT.add(((KR0080010Struct) list.get(i)).getSEL_MODIFY_COUNT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_h_SALES_UNIT_PRICE = null;
		m_COMPANY_CD = null;
		m_BUSINESS_OPR_DATE = null;
		m_ODR_NO_2 = null;
		m_UNSTOCK_MODIFY_COUNT = null;
		m_ODR_CMPLT_FLG = null;
		m_ODR_NO = null;
		m_haveFlag = null;
		m_PROJECT_CD = null;
		m_h_CTL_SEQ_CD = null;
		m_SLIP_TRN_CD = null;
		m_MODIFY_COUNT = null;
		m_JOB_ODR_COMP_FLG = null;
		m_PROJECT_NAME = null;
		m_ESTIMATE_NO = null;
		m_DETAIL_NO = null;
		m_ITEM_NAME = null;
		m_SALES_DATE = null;
		m_CUST_CHRG_PSN_CD = null;
		m_CUST_CHRG_PSN_NAME = null;
		m_SALES_QTY = null;
		m_STOCK_UNIT = null;
		m_SALES_UNIT_PRICE = null;
		m_CUR_UNIT = null;
		m_SALES_AMOUNT = null;
		m_SALES_AMOUNT_YEN = null;
		m_TAX_CD = null;
		m_PAY_RATE = null;
		m_CUST_CD = null;
		m_CUST_NAME = null;
		m_ITEM_CD = null;
		m_ITEM_NAME_1 = null;
		m_CUST_ODR_NO = null;
		m_DESINATED_DLV_DATE = null;
		m_OPTION_ID = null;
		m_INSTALL_FLG = null;
		m_SLIP_CD = null;
		m_SALSE_MODIFY_COUNT = null;
		m_h_SALES_SEQ_NO = null;
		m_AI_AR_IF_FLG = null;
		m_SALES_SEQ_NO = null;
		m_SALES_TYP = null;
		m_SALES_DEPT_CD = null;
		m_VEND_CD = null;
		m_PRD_ODR_PLACE_CD = null;
		m_ODR_ACPT_PSN_CD = null;
		m_UNIT_CD = null;
		m_INSPC_ACPT_DATE = null;
		m_INSPC_ACPT_QTY = null;
		m_EXTERNAL_TAX_SALES_AMOUNT = null;
		m_INTERNAL_TAX_SALES_AMOUNT = null;
		m_TAXFREE_SALES_AMOUNT = null;
		m_TAX_CREDIT_SALES_AMOUNT = null;
		m_EXTERNAL_TAX_AMOUNT = null;
		m_INTERNAL_TAX_AMOUNT = null;
		m_TAX_AMOUNT_1 = null;
		m_TAX_AMOUNT_2 = null;
		m_TAX_AMOUNT_3 = null;
		m_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;
		m_ORG_SLIP_CD = null;
		m_CURRNCY_CD = null;
		m_SPCL_PRICE_CO = null;
		m_REMARKS = null;
		m_INSPC_ACPT_TYP = null;
		m_STATUS = null;
		m_DEL_FLG = null;
		m_APPR_FLG = null;
		m_APPR_ID = null;
		m_APPR_DATE = null;
		m_CTL_SEQ_CD = null;
		m_WORK_TIME = null;
		m_WORK_DATE = null;
		m_WORK_PERSON_CD = null;
		m_WORK_REMARKS = null;
		m_HS_CTL_SEQ_CD = null;
		m_NEW_OLD_FLG = null;
		m_TRAN_TYPE = null;
		m_CRCT_TYP = null;
		m_APR_SALES_VALUE = null;
		m_SALES_DEPT_NAME = null;
		m_WORK_PERSON_NAME = null;
		m_ORG_CD = null;
		m_ORG_NAME = null;
		m_TAX_RATE_1 = null;
		m_TAX_RATE_2 = null;
		m_TAX_RATE_3 = null;
		m_TAX_ROUND_TYP = null;
		m_USER_CD = null;
		m_USER_NAME = null;
		m_CUR_CD = null;
		m_EXCH_TYP = null;
		m_DETAIL_ROUND_TYP = null;
		m_SYS_CLASS_CODE = null;
		m_DECIMAL_FIG = null;
		m_h_INSTALL_FLG = null;
		m_SEL_MODIFY_COUNT = null;

		l_h_SALES_UNIT_PRICE = null;
		l_COMPANY_CD = null;
		l_BUSINESS_OPR_DATE = null;
		l_ODR_NO_2 = null;
		l_UNSTOCK_MODIFY_COUNT = null;
		l_ODR_CMPLT_FLG = null;
		l_ODR_NO = null;
		l_haveFlag = null;
		l_PROJECT_CD = null;
		l_h_CTL_SEQ_CD = null;
		l_SLIP_TRN_CD = null;
		l_MODIFY_COUNT = null;
		l_JOB_ODR_COMP_FLG = null;
		l_PROJECT_NAME = null;
		l_ESTIMATE_NO = null;
		l_DETAIL_NO = null;
		l_ITEM_NAME = null;
		l_SALES_DATE = null;
		l_CUST_CHRG_PSN_CD = null;
		l_CUST_CHRG_PSN_NAME = null;
		l_SALES_QTY = null;
		l_STOCK_UNIT = null;
		l_SALES_UNIT_PRICE = null;
		l_CUR_UNIT = null;
		l_SALES_AMOUNT = null;
		l_SALES_AMOUNT_YEN = null;
		l_TAX_CD = null;
		l_PAY_RATE = null;
		l_CUST_CD = null;
		l_CUST_NAME = null;
		l_ITEM_CD = null;
		l_ITEM_NAME_1 = null;
		l_CUST_ODR_NO = null;
		l_DESINATED_DLV_DATE = null;
		l_OPTION_ID = null;
		l_INSTALL_FLG = null;
		l_SLIP_CD = null;
		l_SALSE_MODIFY_COUNT = null;
		l_h_SALES_SEQ_NO = null;
		l_AI_AR_IF_FLG = null;
		l_SALES_SEQ_NO = null;
		l_SALES_TYP = null;
		l_SALES_DEPT_CD = null;
		l_VEND_CD = null;
		l_PRD_ODR_PLACE_CD = null;
		l_ODR_ACPT_PSN_CD = null;
		l_UNIT_CD = null;
		l_INSPC_ACPT_DATE = null;
		l_INSPC_ACPT_QTY = null;
		l_EXTERNAL_TAX_SALES_AMOUNT = null;
		l_INTERNAL_TAX_SALES_AMOUNT = null;
		l_TAXFREE_SALES_AMOUNT = null;
		l_TAX_CREDIT_SALES_AMOUNT = null;
		l_EXTERNAL_TAX_AMOUNT = null;
		l_INTERNAL_TAX_AMOUNT = null;
		l_TAX_AMOUNT_1 = null;
		l_TAX_AMOUNT_2 = null;
		l_TAX_AMOUNT_3 = null;
		l_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;
		l_ORG_SLIP_CD = null;
		l_CURRNCY_CD = null;
		l_SPCL_PRICE_CO = null;
		l_REMARKS = null;
		l_INSPC_ACPT_TYP = null;
		l_STATUS = null;
		l_DEL_FLG = null;
		l_APPR_FLG = null;
		l_APPR_ID = null;
		l_APPR_DATE = null;
		l_CTL_SEQ_CD = null;
		l_WORK_TIME = null;
		l_WORK_DATE = null;
		l_WORK_PERSON_CD = null;
		l_WORK_REMARKS = null;
		l_HS_CTL_SEQ_CD = null;
		l_NEW_OLD_FLG = null;
		l_TRAN_TYPE = null;
		l_CRCT_TYP = null;
		l_APR_SALES_VALUE = null;
		l_SALES_DEPT_NAME = null;
		l_WORK_PERSON_NAME = null;
		l_ORG_CD = null;
		l_ORG_NAME = null;
		l_TAX_RATE_1 = null;
		l_TAX_RATE_2 = null;
		l_TAX_RATE_3 = null;
		l_TAX_ROUND_TYP = null;
		l_USER_CD = null;
		l_USER_NAME = null;
		l_CUR_CD = null;
		l_EXCH_TYP = null;
		l_DETAIL_ROUND_TYP = null;
		l_SYS_CLASS_CODE = null;
		l_DECIMAL_FIG = null;
		l_h_INSTALL_FLG = null;
		l_SEL_MODIFY_COUNT = null;

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
	 * medKR0080010クラスの標準コンストラクタ
	 */
	public KR0080010Struct()
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
	public void setStruct(KR0080010Struct struct)
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
	public void setStructM(KR0080010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.seth_SALES_UNIT_PRICE(struct.geth_SALES_UNIT_PRICE());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setBUSINESS_OPR_DATE(struct.getBUSINESS_OPR_DATE());
			this.setODR_NO_2(struct.getODR_NO_2());
			this.setUNSTOCK_MODIFY_COUNT(struct.getUNSTOCK_MODIFY_COUNT());
			this.setODR_CMPLT_FLG(struct.getODR_CMPLT_FLG());
			this.setODR_NO(struct.getODR_NO());
			this.sethaveFlag(struct.gethaveFlag());
			this.setPROJECT_CD(struct.getPROJECT_CD());
			this.seth_CTL_SEQ_CD(struct.geth_CTL_SEQ_CD());
			this.setSLIP_TRN_CD(struct.getSLIP_TRN_CD());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setJOB_ODR_COMP_FLG(struct.getJOB_ODR_COMP_FLG());
			this.setPROJECT_NAME(struct.getPROJECT_NAME());
			this.setESTIMATE_NO(struct.getESTIMATE_NO());
			this.setDETAIL_NO(struct.getDETAIL_NO());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setSALES_DATE(struct.getSALES_DATE());
			this.setCUST_CHRG_PSN_CD(struct.getCUST_CHRG_PSN_CD());
			this.setCUST_CHRG_PSN_NAME(struct.getCUST_CHRG_PSN_NAME());
			this.setSALES_QTY(struct.getSALES_QTY());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setSALES_UNIT_PRICE(struct.getSALES_UNIT_PRICE());
			this.setCUR_UNIT(struct.getCUR_UNIT());
			this.setSALES_AMOUNT(struct.getSALES_AMOUNT());
			this.setSALES_AMOUNT_YEN(struct.getSALES_AMOUNT_YEN());
			this.setTAX_CD(struct.getTAX_CD());
			this.setPAY_RATE(struct.getPAY_RATE());
			this.setCUST_CD(struct.getCUST_CD());
			this.setCUST_NAME(struct.getCUST_NAME());
			this.setITEM_CD(struct.getITEM_CD());
			this.setITEM_NAME_1(struct.getITEM_NAME_1());
			this.setCUST_ODR_NO(struct.getCUST_ODR_NO());
			this.setDESINATED_DLV_DATE(struct.getDESINATED_DLV_DATE());
			this.setOPTION_ID(struct.getOPTION_ID());
			this.setINSTALL_FLG(struct.getINSTALL_FLG());
			this.setSLIP_CD(struct.getSLIP_CD());
			this.setSALSE_MODIFY_COUNT(struct.getSALSE_MODIFY_COUNT());
			this.seth_SALES_SEQ_NO(struct.geth_SALES_SEQ_NO());
			this.setAI_AR_IF_FLG(struct.getAI_AR_IF_FLG());
			this.setSALES_SEQ_NO(struct.getSALES_SEQ_NO());
			this.setSALES_TYP(struct.getSALES_TYP());
			this.setSALES_DEPT_CD(struct.getSALES_DEPT_CD());
			this.setVEND_CD(struct.getVEND_CD());
			this.setPRD_ODR_PLACE_CD(struct.getPRD_ODR_PLACE_CD());
			this.setODR_ACPT_PSN_CD(struct.getODR_ACPT_PSN_CD());
			this.setUNIT_CD(struct.getUNIT_CD());
			this.setINSPC_ACPT_DATE(struct.getINSPC_ACPT_DATE());
			this.setINSPC_ACPT_QTY(struct.getINSPC_ACPT_QTY());
			this.setEXTERNAL_TAX_SALES_AMOUNT(struct.getEXTERNAL_TAX_SALES_AMOUNT());
			this.setINTERNAL_TAX_SALES_AMOUNT(struct.getINTERNAL_TAX_SALES_AMOUNT());
			this.setTAXFREE_SALES_AMOUNT(struct.getTAXFREE_SALES_AMOUNT());
			this.setTAX_CREDIT_SALES_AMOUNT(struct.getTAX_CREDIT_SALES_AMOUNT());
			this.setEXTERNAL_TAX_AMOUNT(struct.getEXTERNAL_TAX_AMOUNT());
			this.setINTERNAL_TAX_AMOUNT(struct.getINTERNAL_TAX_AMOUNT());
			this.setTAX_AMOUNT_1(struct.getTAX_AMOUNT_1());
			this.setTAX_AMOUNT_2(struct.getTAX_AMOUNT_2());
			this.setTAX_AMOUNT_3(struct.getTAX_AMOUNT_3());
			this.setOWN_CUR_TAXCREDIT_SALES_AMOUNT(struct.getOWN_CUR_TAXCREDIT_SALES_AMOUNT());
			this.setORG_SLIP_CD(struct.getORG_SLIP_CD());
			this.setCURRNCY_CD(struct.getCURRNCY_CD());
			this.setSPCL_PRICE_CO(struct.getSPCL_PRICE_CO());
			this.setREMARKS(struct.getREMARKS());
			this.setINSPC_ACPT_TYP(struct.getINSPC_ACPT_TYP());
			this.setSTATUS(struct.getSTATUS());
			this.setDEL_FLG(struct.getDEL_FLG());
			this.setAPPR_FLG(struct.getAPPR_FLG());
			this.setAPPR_ID(struct.getAPPR_ID());
			this.setAPPR_DATE(struct.getAPPR_DATE());
			this.setCTL_SEQ_CD(struct.getCTL_SEQ_CD());
			this.setWORK_TIME(struct.getWORK_TIME());
			this.setWORK_DATE(struct.getWORK_DATE());
			this.setWORK_PERSON_CD(struct.getWORK_PERSON_CD());
			this.setWORK_REMARKS(struct.getWORK_REMARKS());
			this.setHS_CTL_SEQ_CD(struct.getHS_CTL_SEQ_CD());
			this.setNEW_OLD_FLG(struct.getNEW_OLD_FLG());
			this.setTRAN_TYPE(struct.getTRAN_TYPE());
			this.setCRCT_TYP(struct.getCRCT_TYP());
			this.setAPR_SALES_VALUE(struct.getAPR_SALES_VALUE());
			this.setSALES_DEPT_NAME(struct.getSALES_DEPT_NAME());
			this.setWORK_PERSON_NAME(struct.getWORK_PERSON_NAME());
			this.setORG_CD(struct.getORG_CD());
			this.setORG_NAME(struct.getORG_NAME());
			this.setTAX_RATE_1(struct.getTAX_RATE_1());
			this.setTAX_RATE_2(struct.getTAX_RATE_2());
			this.setTAX_RATE_3(struct.getTAX_RATE_3());
			this.setTAX_ROUND_TYP(struct.getTAX_ROUND_TYP());
			this.setUSER_CD(struct.getUSER_CD());
			this.setUSER_NAME(struct.getUSER_NAME());
			this.setCUR_CD(struct.getCUR_CD());
			this.setEXCH_TYP(struct.getEXCH_TYP());
			this.setDETAIL_ROUND_TYP(struct.getDETAIL_ROUND_TYP());
			this.setSYS_CLASS_CODE(struct.getSYS_CLASS_CODE());
			this.setDECIMAL_FIG(struct.getDECIMAL_FIG());
			this.seth_INSTALL_FLG(struct.geth_INSTALL_FLG());
			this.setSEL_MODIFY_COUNT(struct.getSEL_MODIFY_COUNT());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(KR0080010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_h_SALES_UNIT_PRICE(struct.getList_h_SALES_UNIT_PRICE());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_BUSINESS_OPR_DATE(struct.getList_BUSINESS_OPR_DATE());
			this.setList_ODR_NO_2(struct.getList_ODR_NO_2());
			this.setList_UNSTOCK_MODIFY_COUNT(struct.getList_UNSTOCK_MODIFY_COUNT());
			this.setList_ODR_CMPLT_FLG(struct.getList_ODR_CMPLT_FLG());
			this.setList_ODR_NO(struct.getList_ODR_NO());
			this.setList_haveFlag(struct.getList_haveFlag());
			this.setList_PROJECT_CD(struct.getList_PROJECT_CD());
			this.setList_h_CTL_SEQ_CD(struct.getList_h_CTL_SEQ_CD());
			this.setList_SLIP_TRN_CD(struct.getList_SLIP_TRN_CD());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_JOB_ODR_COMP_FLG(struct.getList_JOB_ODR_COMP_FLG());
			this.setList_PROJECT_NAME(struct.getList_PROJECT_NAME());
			this.setList_ESTIMATE_NO(struct.getList_ESTIMATE_NO());
			this.setList_DETAIL_NO(struct.getList_DETAIL_NO());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_SALES_DATE(struct.getList_SALES_DATE());
			this.setList_CUST_CHRG_PSN_CD(struct.getList_CUST_CHRG_PSN_CD());
			this.setList_CUST_CHRG_PSN_NAME(struct.getList_CUST_CHRG_PSN_NAME());
			this.setList_SALES_QTY(struct.getList_SALES_QTY());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_SALES_UNIT_PRICE(struct.getList_SALES_UNIT_PRICE());
			this.setList_CUR_UNIT(struct.getList_CUR_UNIT());
			this.setList_SALES_AMOUNT(struct.getList_SALES_AMOUNT());
			this.setList_SALES_AMOUNT_YEN(struct.getList_SALES_AMOUNT_YEN());
			this.setList_TAX_CD(struct.getList_TAX_CD());
			this.setList_PAY_RATE(struct.getList_PAY_RATE());
			this.setList_CUST_CD(struct.getList_CUST_CD());
			this.setList_CUST_NAME(struct.getList_CUST_NAME());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_ITEM_NAME_1(struct.getList_ITEM_NAME_1());
			this.setList_CUST_ODR_NO(struct.getList_CUST_ODR_NO());
			this.setList_DESINATED_DLV_DATE(struct.getList_DESINATED_DLV_DATE());
			this.setList_OPTION_ID(struct.getList_OPTION_ID());
			this.setList_INSTALL_FLG(struct.getList_INSTALL_FLG());
			this.setList_SLIP_CD(struct.getList_SLIP_CD());
			this.setList_SALSE_MODIFY_COUNT(struct.getList_SALSE_MODIFY_COUNT());
			this.setList_h_SALES_SEQ_NO(struct.getList_h_SALES_SEQ_NO());
			this.setList_AI_AR_IF_FLG(struct.getList_AI_AR_IF_FLG());
			this.setList_SALES_SEQ_NO(struct.getList_SALES_SEQ_NO());
			this.setList_SALES_TYP(struct.getList_SALES_TYP());
			this.setList_SALES_DEPT_CD(struct.getList_SALES_DEPT_CD());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_PRD_ODR_PLACE_CD(struct.getList_PRD_ODR_PLACE_CD());
			this.setList_ODR_ACPT_PSN_CD(struct.getList_ODR_ACPT_PSN_CD());
			this.setList_UNIT_CD(struct.getList_UNIT_CD());
			this.setList_INSPC_ACPT_DATE(struct.getList_INSPC_ACPT_DATE());
			this.setList_INSPC_ACPT_QTY(struct.getList_INSPC_ACPT_QTY());
			this.setList_EXTERNAL_TAX_SALES_AMOUNT(struct.getList_EXTERNAL_TAX_SALES_AMOUNT());
			this.setList_INTERNAL_TAX_SALES_AMOUNT(struct.getList_INTERNAL_TAX_SALES_AMOUNT());
			this.setList_TAXFREE_SALES_AMOUNT(struct.getList_TAXFREE_SALES_AMOUNT());
			this.setList_TAX_CREDIT_SALES_AMOUNT(struct.getList_TAX_CREDIT_SALES_AMOUNT());
			this.setList_EXTERNAL_TAX_AMOUNT(struct.getList_EXTERNAL_TAX_AMOUNT());
			this.setList_INTERNAL_TAX_AMOUNT(struct.getList_INTERNAL_TAX_AMOUNT());
			this.setList_TAX_AMOUNT_1(struct.getList_TAX_AMOUNT_1());
			this.setList_TAX_AMOUNT_2(struct.getList_TAX_AMOUNT_2());
			this.setList_TAX_AMOUNT_3(struct.getList_TAX_AMOUNT_3());
			this.setList_OWN_CUR_TAXCREDIT_SALES_AMOUNT(struct.getList_OWN_CUR_TAXCREDIT_SALES_AMOUNT());
			this.setList_ORG_SLIP_CD(struct.getList_ORG_SLIP_CD());
			this.setList_CURRNCY_CD(struct.getList_CURRNCY_CD());
			this.setList_SPCL_PRICE_CO(struct.getList_SPCL_PRICE_CO());
			this.setList_REMARKS(struct.getList_REMARKS());
			this.setList_INSPC_ACPT_TYP(struct.getList_INSPC_ACPT_TYP());
			this.setList_STATUS(struct.getList_STATUS());
			this.setList_DEL_FLG(struct.getList_DEL_FLG());
			this.setList_APPR_FLG(struct.getList_APPR_FLG());
			this.setList_APPR_ID(struct.getList_APPR_ID());
			this.setList_APPR_DATE(struct.getList_APPR_DATE());
			this.setList_CTL_SEQ_CD(struct.getList_CTL_SEQ_CD());
			this.setList_WORK_TIME(struct.getList_WORK_TIME());
			this.setList_WORK_DATE(struct.getList_WORK_DATE());
			this.setList_WORK_PERSON_CD(struct.getList_WORK_PERSON_CD());
			this.setList_WORK_REMARKS(struct.getList_WORK_REMARKS());
			this.setList_HS_CTL_SEQ_CD(struct.getList_HS_CTL_SEQ_CD());
			this.setList_NEW_OLD_FLG(struct.getList_NEW_OLD_FLG());
			this.setList_TRAN_TYPE(struct.getList_TRAN_TYPE());
			this.setList_CRCT_TYP(struct.getList_CRCT_TYP());
			this.setList_APR_SALES_VALUE(struct.getList_APR_SALES_VALUE());
			this.setList_SALES_DEPT_NAME(struct.getList_SALES_DEPT_NAME());
			this.setList_WORK_PERSON_NAME(struct.getList_WORK_PERSON_NAME());
			this.setList_ORG_CD(struct.getList_ORG_CD());
			this.setList_ORG_NAME(struct.getList_ORG_NAME());
			this.setList_TAX_RATE_1(struct.getList_TAX_RATE_1());
			this.setList_TAX_RATE_2(struct.getList_TAX_RATE_2());
			this.setList_TAX_RATE_3(struct.getList_TAX_RATE_3());
			this.setList_TAX_ROUND_TYP(struct.getList_TAX_ROUND_TYP());
			this.setList_USER_CD(struct.getList_USER_CD());
			this.setList_USER_NAME(struct.getList_USER_NAME());
			this.setList_CUR_CD(struct.getList_CUR_CD());
			this.setList_EXCH_TYP(struct.getList_EXCH_TYP());
			this.setList_DETAIL_ROUND_TYP(struct.getList_DETAIL_ROUND_TYP());
			this.setList_SYS_CLASS_CODE(struct.getList_SYS_CLASS_CODE());
			this.setList_DECIMAL_FIG(struct.getList_DECIMAL_FIG());
			this.setList_h_INSTALL_FLG(struct.getList_h_INSTALL_FLG());
			this.setList_SEL_MODIFY_COUNT(struct.getList_SEL_MODIFY_COUNT());
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
	// 第 1 変数初期値： i_h_SALES_UNIT_PRICE


	final static String i_h_SALES_UNIT_PRICE = null;

	// 第 2 変数初期値： i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// 第 3 変数初期値： i_BUSINESS_OPR_DATE


	final static String i_BUSINESS_OPR_DATE = null;

	// 第 4 変数初期値： i_ODR_NO_2


	final static String i_ODR_NO_2 = null;

	// 第 5 変数初期値： i_UNSTOCK_MODIFY_COUNT


	final static String i_UNSTOCK_MODIFY_COUNT = null;

	// 第 6 変数初期値： i_ODR_CMPLT_FLG


	final static String i_ODR_CMPLT_FLG = null;

	// 第 7 変数初期値： i_ODR_NO


	final static String i_ODR_NO = null;

	// 第 8 変数初期値： i_haveFlag


	final static String i_haveFlag = null;

	// 第 9 変数初期値： i_PROJECT_CD


	final static String i_PROJECT_CD = null;

	// 第 10 変数初期値： i_h_CTL_SEQ_CD


	final static String i_h_CTL_SEQ_CD = null;

	// 第 11 変数初期値： i_SLIP_TRN_CD


	final static String i_SLIP_TRN_CD = null;

	// 第 12 変数初期値： i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// 第 13 変数初期値： i_JOB_ODR_COMP_FLG


	final static String i_JOB_ODR_COMP_FLG = null;

	// 第 14 変数初期値： i_PROJECT_NAME


	final static String i_PROJECT_NAME = null;

	// 第 15 変数初期値： i_ESTIMATE_NO


	final static String i_ESTIMATE_NO = null;

	// 第 16 変数初期値： i_DETAIL_NO


	final static String i_DETAIL_NO = null;

	// 第 17 変数初期値： i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// 第 18 変数初期値： i_SALES_DATE


	final static String i_SALES_DATE = null;

	// 第 19 変数初期値： i_CUST_CHRG_PSN_CD


	final static String i_CUST_CHRG_PSN_CD = null;

	// 第 20 変数初期値： i_CUST_CHRG_PSN_NAME


	final static String i_CUST_CHRG_PSN_NAME = null;

	// 第 21 変数初期値： i_SALES_QTY


	final static String i_SALES_QTY = null;

	// 第 22 変数初期値： i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// 第 23 変数初期値： i_SALES_UNIT_PRICE


	final static String i_SALES_UNIT_PRICE = null;

	// 第 24 変数初期値： i_CUR_UNIT


	final static String i_CUR_UNIT = null;

	// 第 25 変数初期値： i_SALES_AMOUNT


	final static String i_SALES_AMOUNT = null;

	// 第 26 変数初期値： i_SALES_AMOUNT_YEN


	final static String i_SALES_AMOUNT_YEN = null;

	// 第 27 変数初期値： i_TAX_CD


	final static String i_TAX_CD = null;

	// 第 28 変数初期値： i_PAY_RATE


	final static String i_PAY_RATE = null;

	// 第 29 変数初期値： i_CUST_CD


	final static String i_CUST_CD = null;

	// 第 30 変数初期値： i_CUST_NAME


	final static String i_CUST_NAME = null;

	// 第 31 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 32 変数初期値： i_ITEM_NAME_1


	final static String i_ITEM_NAME_1 = null;

	// 第 33 変数初期値： i_CUST_ODR_NO


	final static String i_CUST_ODR_NO = null;

	// 第 34 変数初期値： i_DESINATED_DLV_DATE


	final static String i_DESINATED_DLV_DATE = null;

	// 第 35 変数初期値： i_OPTION_ID


	final static String i_OPTION_ID = null;

	// 第 36 変数初期値： i_INSTALL_FLG


	final static String i_INSTALL_FLG = null;

	// 第 37 変数初期値： i_SLIP_CD


	final static String i_SLIP_CD = null;

	// 第 38 変数初期値： i_SALSE_MODIFY_COUNT


	final static String i_SALSE_MODIFY_COUNT = null;

	// 第 39 変数初期値： i_h_SALES_SEQ_NO


	final static String i_h_SALES_SEQ_NO = null;

	// 第 40 変数初期値： i_AI_AR_IF_FLG


	final static String i_AI_AR_IF_FLG = null;

	// 第 41 変数初期値： i_SALES_SEQ_NO


	final static String i_SALES_SEQ_NO = null;

	// 第 42 変数初期値： i_SALES_TYP


	final static String i_SALES_TYP = null;

	// 第 43 変数初期値： i_SALES_DEPT_CD


	final static String i_SALES_DEPT_CD = null;

	// 第 44 変数初期値： i_VEND_CD


	final static String i_VEND_CD = null;

	// 第 45 変数初期値： i_PRD_ODR_PLACE_CD


	final static String i_PRD_ODR_PLACE_CD = null;

	// 第 46 変数初期値： i_ODR_ACPT_PSN_CD


	final static String i_ODR_ACPT_PSN_CD = null;

	// 第 47 変数初期値： i_UNIT_CD


	final static String i_UNIT_CD = null;

	// 第 48 変数初期値： i_INSPC_ACPT_DATE


	final static String i_INSPC_ACPT_DATE = null;

	// 第 49 変数初期値： i_INSPC_ACPT_QTY


	final static String i_INSPC_ACPT_QTY = null;

	// 第 50 変数初期値： i_EXTERNAL_TAX_SALES_AMOUNT


	final static String i_EXTERNAL_TAX_SALES_AMOUNT = null;

	// 第 51 変数初期値： i_INTERNAL_TAX_SALES_AMOUNT


	final static String i_INTERNAL_TAX_SALES_AMOUNT = null;

	// 第 52 変数初期値： i_TAXFREE_SALES_AMOUNT


	final static String i_TAXFREE_SALES_AMOUNT = null;

	// 第 53 変数初期値： i_TAX_CREDIT_SALES_AMOUNT


	final static String i_TAX_CREDIT_SALES_AMOUNT = null;

	// 第 54 変数初期値： i_EXTERNAL_TAX_AMOUNT


	final static String i_EXTERNAL_TAX_AMOUNT = null;

	// 第 55 変数初期値： i_INTERNAL_TAX_AMOUNT


	final static String i_INTERNAL_TAX_AMOUNT = null;

	// 第 56 変数初期値： i_TAX_AMOUNT_1


	final static String i_TAX_AMOUNT_1 = null;

	// 第 57 変数初期値： i_TAX_AMOUNT_2


	final static String i_TAX_AMOUNT_2 = null;

	// 第 58 変数初期値： i_TAX_AMOUNT_3


	final static String i_TAX_AMOUNT_3 = null;

	// 第 59 変数初期値： i_OWN_CUR_TAXCREDIT_SALES_AMOUNT


	final static String i_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;

	// 第 60 変数初期値： i_ORG_SLIP_CD


	final static String i_ORG_SLIP_CD = null;

	// 第 61 変数初期値： i_CURRNCY_CD


	final static String i_CURRNCY_CD = null;

	// 第 62 変数初期値： i_SPCL_PRICE_CO


	final static String i_SPCL_PRICE_CO = null;

	// 第 63 変数初期値： i_REMARKS


	final static String i_REMARKS = null;

	// 第 64 変数初期値： i_INSPC_ACPT_TYP


	final static String i_INSPC_ACPT_TYP = null;

	// 第 65 変数初期値： i_STATUS


	final static String i_STATUS = null;

	// 第 66 変数初期値： i_DEL_FLG


	final static String i_DEL_FLG = null;

	// 第 67 変数初期値： i_APPR_FLG


	final static String i_APPR_FLG = null;

	// 第 68 変数初期値： i_APPR_ID


	final static String i_APPR_ID = null;

	// 第 69 変数初期値： i_APPR_DATE


	final static String i_APPR_DATE = null;

	// 第 70 変数初期値： i_CTL_SEQ_CD


	final static String i_CTL_SEQ_CD = null;

	// 第 71 変数初期値： i_WORK_TIME


	final static String i_WORK_TIME = null;

	// 第 72 変数初期値： i_WORK_DATE


	final static String i_WORK_DATE = null;

	// 第 73 変数初期値： i_WORK_PERSON_CD


	final static String i_WORK_PERSON_CD = null;

	// 第 74 変数初期値： i_WORK_REMARKS


	final static String i_WORK_REMARKS = null;

	// 第 75 変数初期値： i_HS_CTL_SEQ_CD


	final static String i_HS_CTL_SEQ_CD = null;

	// 第 76 変数初期値： i_NEW_OLD_FLG


	final static String i_NEW_OLD_FLG = null;

	// 第 77 変数初期値： i_TRAN_TYPE


	final static String i_TRAN_TYPE = null;

	// 第 78 変数初期値： i_CRCT_TYP


	final static String i_CRCT_TYP = null;

	// 第 79 変数初期値： i_APR_SALES_VALUE


	final static String i_APR_SALES_VALUE = null;

	// 第 80 変数初期値： i_SALES_DEPT_NAME


	final static String i_SALES_DEPT_NAME = null;

	// 第 81 変数初期値： i_WORK_PERSON_NAME


	final static String i_WORK_PERSON_NAME = null;

	// 第 82 変数初期値： i_ORG_CD


	final static String i_ORG_CD = null;

	// 第 83 変数初期値： i_ORG_NAME


	final static String i_ORG_NAME = null;

	// 第 84 変数初期値： i_TAX_RATE_1


	final static String i_TAX_RATE_1 = null;

	// 第 85 変数初期値： i_TAX_RATE_2


	final static String i_TAX_RATE_2 = null;

	// 第 86 変数初期値： i_TAX_RATE_3


	final static String i_TAX_RATE_3 = null;

	// 第 87 変数初期値： i_TAX_ROUND_TYP


	final static String i_TAX_ROUND_TYP = null;

	// 第 88 変数初期値： i_USER_CD


	final static String i_USER_CD = null;

	// 第 89 変数初期値： i_USER_NAME


	final static String i_USER_NAME = null;

	// 第 90 変数初期値： i_CUR_CD


	final static String i_CUR_CD = null;

	// 第 91 変数初期値： i_EXCH_TYP


	final static String i_EXCH_TYP = null;

	// 第 92 変数初期値： i_DETAIL_ROUND_TYP


	final static String i_DETAIL_ROUND_TYP = null;

	// 第 93 変数初期値： i_SYS_CLASS_CODE


	final static String i_SYS_CLASS_CODE = null;

	// 第 94 変数初期値： i_DECIMAL_FIG


	final static String i_DECIMAL_FIG = null;

	// 第 95 変数初期値： i_h_INSTALL_FLG


	final static String i_h_INSTALL_FLG = null;

	// 第 96 変数初期値： i_SEL_MODIFY_COUNT


	final static String i_SEL_MODIFY_COUNT = null;

*/

	//{{user_implement_code
		// TODO: 初期化で使う定数は、ここに記述してください。
		// 以下に記述した内容は自動的には変更されません。
	// 第 1 変数初期値： i_h_SALES_UNIT_PRICE

	final static String i_h_SALES_UNIT_PRICE = null;

	// 第 2 変数初期値： i_COMPANY_CD

	final static String i_COMPANY_CD = null;

	// 第 3 変数初期値： i_BUSINESS_OPR_DATE

	final static String i_BUSINESS_OPR_DATE = null;

	// 第 4 変数初期値： i_ODR_NO_2

	final static String i_ODR_NO_2 = null;

	// 第 5 変数初期値： i_UNSTOCK_MODIFY_COUNT

	final static String i_UNSTOCK_MODIFY_COUNT = null;

	// 第 6 変数初期値： i_ODR_CMPLT_FLG

	final static String i_ODR_CMPLT_FLG = null;

	// 第 7 変数初期値： i_ODR_NO

	final static String i_ODR_NO = null;

	// 第 8 変数初期値： i_haveFlag

	final static String i_haveFlag = null;

	// 第 9 変数初期値： i_PROJECT_CD

	final static String i_PROJECT_CD = null;

	// 第 10 変数初期値： i_h_CTL_SEQ_CD

	final static String i_h_CTL_SEQ_CD = null;

	// 第 11 変数初期値： i_SLIP_TRN_CD

	final static String i_SLIP_TRN_CD = null;

	// 第 12 変数初期値： i_MODIFY_COUNT

	final static String i_MODIFY_COUNT = null;

	// 第 13 変数初期値： i_JOB_ODR_COMP_FLG

	final static String i_JOB_ODR_COMP_FLG = null;

	// 第 14 変数初期値： i_PROJECT_NAME

	final static String i_PROJECT_NAME = null;

	// 第 15 変数初期値： i_ESTIMATE_NO

	final static String i_ESTIMATE_NO = null;

	// 第 16 変数初期値： i_DETAIL_NO

	final static String i_DETAIL_NO = null;

	// 第 17 変数初期値： i_ITEM_NAME

	final static String i_ITEM_NAME = null;

	// 第 18 変数初期値： i_SALES_DATE

	final static String i_SALES_DATE = null;

	// 第 19 変数初期値： i_CUST_CHRG_PSN_CD

	final static String i_CUST_CHRG_PSN_CD = null;

	// 第 20 変数初期値： i_CUST_CHRG_PSN_NAME

	final static String i_CUST_CHRG_PSN_NAME = null;

	// 第 21 変数初期値： i_SALES_QTY

	final static String i_SALES_QTY = null;

	// 第 22 変数初期値： i_STOCK_UNIT

	final static String i_STOCK_UNIT = null;

	// 第 23 変数初期値： i_SALES_UNIT_PRICE

	final static String i_SALES_UNIT_PRICE = null;

	// 第 24 変数初期値： i_CUR_UNIT

	final static String i_CUR_UNIT = null;

	// 第 25 変数初期値： i_SALES_AMOUNT

	final static String i_SALES_AMOUNT = null;

	// 第 26 変数初期値： i_SALES_AMOUNT_YEN

	final static String i_SALES_AMOUNT_YEN = null;

	// 第 27 変数初期値： i_TAX_CD

	final static String i_TAX_CD = null;

	// 第 28 変数初期値： i_PAY_RATE

	final static String i_PAY_RATE = null;

	// 第 29 変数初期値： i_CUST_CD

	final static String i_CUST_CD = null;

	// 第 30 変数初期値： i_CUST_NAME

	final static String i_CUST_NAME = null;

	// 第 31 変数初期値： i_ITEM_CD

	final static String i_ITEM_CD = null;

	// 第 32 変数初期値： i_ITEM_NAME_1

	final static String i_ITEM_NAME_1 = null;

	// 第 33 変数初期値： i_CUST_ODR_NO

	final static String i_CUST_ODR_NO = null;

	// 第 34 変数初期値： i_DESINATED_DLV_DATE

	final static String i_DESINATED_DLV_DATE = null;

	// 第 35 変数初期値： i_OPTION_ID

	final static String i_OPTION_ID = null;

	// 第 36 変数初期値： i_INSTALL_FLG

	final static String i_INSTALL_FLG = null;

	// 第 37 変数初期値： i_SLIP_CD

	final static String i_SLIP_CD = null;

	// 第 38 変数初期値： i_SALSE_MODIFY_COUNT

	final static String i_SALSE_MODIFY_COUNT = null;

	// 第 39 変数初期値： i_h_SALES_SEQ_NO

	final static String i_h_SALES_SEQ_NO = null;

	// 第 40 変数初期値： i_AI_AR_IF_FLG

	final static String i_AI_AR_IF_FLG = null;

	// 第 41 変数初期値： i_SALES_SEQ_NO

	final static String i_SALES_SEQ_NO = null;

	// 第 42 変数初期値： i_SALES_TYP

	final static String i_SALES_TYP = null;

	// 第 43 変数初期値： i_SALES_DEPT_CD

	final static String i_SALES_DEPT_CD = null;

	// 第 44 変数初期値： i_VEND_CD

	final static String i_VEND_CD = null;

	// 第 45 変数初期値： i_PRD_ODR_PLACE_CD

	final static String i_PRD_ODR_PLACE_CD = null;

	// 第 46 変数初期値： i_ODR_ACPT_PSN_CD

	final static String i_ODR_ACPT_PSN_CD = null;

	// 第 47 変数初期値： i_UNIT_CD

	final static String i_UNIT_CD = null;

	// 第 48 変数初期値： i_INSPC_ACPT_DATE

	final static String i_INSPC_ACPT_DATE = null;

	// 第 49 変数初期値： i_INSPC_ACPT_QTY

	final static String i_INSPC_ACPT_QTY = null;

	// 第 50 変数初期値： i_EXTERNAL_TAX_SALES_AMOUNT

	final static String i_EXTERNAL_TAX_SALES_AMOUNT = null;

	// 第 51 変数初期値： i_INTERNAL_TAX_SALES_AMOUNT

	final static String i_INTERNAL_TAX_SALES_AMOUNT = null;

	// 第 52 変数初期値： i_TAXFREE_SALES_AMOUNT

	final static String i_TAXFREE_SALES_AMOUNT = null;

	// 第 53 変数初期値： i_TAX_CREDIT_SALES_AMOUNT

	final static String i_TAX_CREDIT_SALES_AMOUNT = null;

	// 第 54 変数初期値： i_EXTERNAL_TAX_AMOUNT

	final static String i_EXTERNAL_TAX_AMOUNT = null;

	// 第 55 変数初期値： i_INTERNAL_TAX_AMOUNT

	final static String i_INTERNAL_TAX_AMOUNT = null;

	// 第 56 変数初期値： i_TAX_AMOUNT_1

	final static String i_TAX_AMOUNT_1 = null;

	// 第 57 変数初期値： i_TAX_AMOUNT_2

	final static String i_TAX_AMOUNT_2 = null;

	// 第 58 変数初期値： i_TAX_AMOUNT_3

	final static String i_TAX_AMOUNT_3 = null;

	// 第 59 変数初期値： i_OWN_CUR_TAXCREDIT_SALES_AMOUNT

	final static String i_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;

	// 第 60 変数初期値： i_ORG_SLIP_CD

	final static String i_ORG_SLIP_CD = null;

	// 第 61 変数初期値： i_CURRNCY_CD

	final static String i_CURRNCY_CD = null;

	// 第 62 変数初期値： i_SPCL_PRICE_CO

	final static String i_SPCL_PRICE_CO = null;

	// 第 63 変数初期値： i_REMARKS

	final static String i_REMARKS = null;

	// 第 64 変数初期値： i_INSPC_ACPT_TYP

	final static String i_INSPC_ACPT_TYP = null;

	// 第 65 変数初期値： i_STATUS

	final static String i_STATUS = null;

	// 第 66 変数初期値： i_DEL_FLG

	final static String i_DEL_FLG = null;

	// 第 67 変数初期値： i_APPR_FLG

	final static String i_APPR_FLG = null;

	// 第 68 変数初期値： i_APPR_ID

	final static String i_APPR_ID = null;

	// 第 69 変数初期値： i_APPR_DATE

	final static String i_APPR_DATE = null;

	// 第 70 変数初期値： i_CTL_SEQ_CD

	final static String i_CTL_SEQ_CD = null;

	// 第 71 変数初期値： i_WORK_TIME

	final static String i_WORK_TIME = null;

	// 第 72 変数初期値： i_WORK_DATE

	final static String i_WORK_DATE = null;

	// 第 73 変数初期値： i_WORK_PERSON_CD

	final static String i_WORK_PERSON_CD = null;

	// 第 74 変数初期値： i_WORK_REMARKS

	final static String i_WORK_REMARKS = null;

	// 第 75 変数初期値： i_HS_CTL_SEQ_CD

	final static String i_HS_CTL_SEQ_CD = null;

	// 第 76 変数初期値： i_NEW_OLD_FLG

	final static String i_NEW_OLD_FLG = null;

	// 第 77 変数初期値： i_TRAN_TYPE

	final static String i_TRAN_TYPE = null;

	// 第 78 変数初期値： i_CRCT_TYP

	final static String i_CRCT_TYP = null;

	// 第 79 変数初期値： i_APR_SALES_VALUE

	final static String i_APR_SALES_VALUE = null;

	// 第 80 変数初期値： i_SALES_DEPT_NAME

	final static String i_SALES_DEPT_NAME = null;

	// 第 81 変数初期値： i_WORK_PERSON_NAME

	final static String i_WORK_PERSON_NAME = null;

	// 第 82 変数初期値： i_ORG_CD

	final static String i_ORG_CD = null;

	// 第 83 変数初期値： i_ORG_NAME

	final static String i_ORG_NAME = null;

	// 第 84 変数初期値： i_TAX_RATE_1

	final static String i_TAX_RATE_1 = null;

	// 第 85 変数初期値： i_TAX_RATE_2

	final static String i_TAX_RATE_2 = null;

	// 第 86 変数初期値： i_TAX_RATE_3

	final static String i_TAX_RATE_3 = null;

	// 第 87 変数初期値： i_TAX_ROUND_TYP

	final static String i_TAX_ROUND_TYP = null;

	// 第 88 変数初期値： i_USER_CD

	final static String i_USER_CD = null;

	// 第 89 変数初期値： i_USER_NAME

	final static String i_USER_NAME = null;

	// 第 90 変数初期値： i_CUR_CD

	final static String i_CUR_CD = null;

	// 第 91 変数初期値： i_EXCH_TYP

	final static String i_EXCH_TYP = null;

	// 第 92 変数初期値： i_DETAIL_ROUND_TYP

	final static String i_DETAIL_ROUND_TYP = null;

	// 第 93 変数初期値： i_SYS_CLASS_CODE

	final static String i_SYS_CLASS_CODE = null;

	// 第 94 変数初期値： i_DECIMAL_FIG

	final static String i_DECIMAL_FIG = null;

	// 第 95 変数初期値： i_h_INSTALL_FLG

	final static String i_h_INSTALL_FLG = null;


	/**
	 * 初期化
	 *
	 */
	public void initialize()
	{

		clear();

		m_h_SALES_UNIT_PRICE = i_h_SALES_UNIT_PRICE;
		m_COMPANY_CD = i_COMPANY_CD;
		m_BUSINESS_OPR_DATE = i_BUSINESS_OPR_DATE;
		m_ODR_NO_2 = i_ODR_NO_2;
		m_UNSTOCK_MODIFY_COUNT = i_UNSTOCK_MODIFY_COUNT;
		m_ODR_CMPLT_FLG = i_ODR_CMPLT_FLG;
		m_ODR_NO = i_ODR_NO;
		m_haveFlag = i_haveFlag;
		m_PROJECT_CD = i_PROJECT_CD;
		m_h_CTL_SEQ_CD = i_h_CTL_SEQ_CD;
		m_SLIP_TRN_CD = i_SLIP_TRN_CD;
		m_MODIFY_COUNT = i_MODIFY_COUNT;
		m_JOB_ODR_COMP_FLG = i_JOB_ODR_COMP_FLG;
		m_PROJECT_NAME = i_PROJECT_NAME;
		m_ESTIMATE_NO = i_ESTIMATE_NO;
		m_DETAIL_NO = i_DETAIL_NO;
		m_ITEM_NAME = i_ITEM_NAME;
		m_SALES_DATE = i_SALES_DATE;
		m_CUST_CHRG_PSN_CD = i_CUST_CHRG_PSN_CD;
		m_CUST_CHRG_PSN_NAME = i_CUST_CHRG_PSN_NAME;
		m_SALES_QTY = i_SALES_QTY;
		m_STOCK_UNIT = i_STOCK_UNIT;
		m_SALES_UNIT_PRICE = i_SALES_UNIT_PRICE;
		m_CUR_UNIT = i_CUR_UNIT;
		m_SALES_AMOUNT = i_SALES_AMOUNT;
		m_SALES_AMOUNT_YEN = i_SALES_AMOUNT_YEN;
		m_TAX_CD = i_TAX_CD;
		m_PAY_RATE = i_PAY_RATE;
		m_CUST_CD = i_CUST_CD;
		m_CUST_NAME = i_CUST_NAME;
		m_ITEM_CD = i_ITEM_CD;
		m_ITEM_NAME_1 = i_ITEM_NAME_1;
		m_CUST_ODR_NO = i_CUST_ODR_NO;
		m_DESINATED_DLV_DATE = i_DESINATED_DLV_DATE;
		m_OPTION_ID = i_OPTION_ID;
		m_INSTALL_FLG = i_INSTALL_FLG;
		m_SLIP_CD = i_SLIP_CD;
		m_SALSE_MODIFY_COUNT = i_SALSE_MODIFY_COUNT;
		m_h_SALES_SEQ_NO = i_h_SALES_SEQ_NO;
		m_AI_AR_IF_FLG = i_AI_AR_IF_FLG;
		m_SALES_SEQ_NO = i_SALES_SEQ_NO;
		m_SALES_TYP = i_SALES_TYP;
		m_SALES_DEPT_CD = i_SALES_DEPT_CD;
		m_VEND_CD = i_VEND_CD;
		m_PRD_ODR_PLACE_CD = i_PRD_ODR_PLACE_CD;
		m_ODR_ACPT_PSN_CD = i_ODR_ACPT_PSN_CD;
		m_UNIT_CD = i_UNIT_CD;
		m_INSPC_ACPT_DATE = i_INSPC_ACPT_DATE;
		m_INSPC_ACPT_QTY = i_INSPC_ACPT_QTY;
		m_EXTERNAL_TAX_SALES_AMOUNT = i_EXTERNAL_TAX_SALES_AMOUNT;
		m_INTERNAL_TAX_SALES_AMOUNT = i_INTERNAL_TAX_SALES_AMOUNT;
		m_TAXFREE_SALES_AMOUNT = i_TAXFREE_SALES_AMOUNT;
		m_TAX_CREDIT_SALES_AMOUNT = i_TAX_CREDIT_SALES_AMOUNT;
		m_EXTERNAL_TAX_AMOUNT = i_EXTERNAL_TAX_AMOUNT;
		m_INTERNAL_TAX_AMOUNT = i_INTERNAL_TAX_AMOUNT;
		m_TAX_AMOUNT_1 = i_TAX_AMOUNT_1;
		m_TAX_AMOUNT_2 = i_TAX_AMOUNT_2;
		m_TAX_AMOUNT_3 = i_TAX_AMOUNT_3;
		m_OWN_CUR_TAXCREDIT_SALES_AMOUNT = i_OWN_CUR_TAXCREDIT_SALES_AMOUNT;
		m_ORG_SLIP_CD = i_ORG_SLIP_CD;
		m_CURRNCY_CD = i_CURRNCY_CD;
		m_SPCL_PRICE_CO = i_SPCL_PRICE_CO;
		m_REMARKS = i_REMARKS;
		m_INSPC_ACPT_TYP = i_INSPC_ACPT_TYP;
		m_STATUS = i_STATUS;
		m_DEL_FLG = i_DEL_FLG;
		m_APPR_FLG = i_APPR_FLG;
		m_APPR_ID = i_APPR_ID;
		m_APPR_DATE = i_APPR_DATE;
		m_CTL_SEQ_CD = i_CTL_SEQ_CD;
		m_WORK_TIME = i_WORK_TIME;
		m_WORK_DATE = i_WORK_DATE;
		m_WORK_PERSON_CD = i_WORK_PERSON_CD;
		m_WORK_REMARKS = i_WORK_REMARKS;
		m_HS_CTL_SEQ_CD = i_HS_CTL_SEQ_CD;
		m_NEW_OLD_FLG = i_NEW_OLD_FLG;
		m_TRAN_TYPE = i_TRAN_TYPE;
		m_CRCT_TYP = i_CRCT_TYP;
		m_APR_SALES_VALUE = i_APR_SALES_VALUE;
		m_SALES_DEPT_NAME = i_SALES_DEPT_NAME;
		m_WORK_PERSON_NAME = i_WORK_PERSON_NAME;
		m_ORG_CD = i_ORG_CD;
		m_ORG_NAME = i_ORG_NAME;
		m_TAX_RATE_1 = i_TAX_RATE_1;
		m_TAX_RATE_2 = i_TAX_RATE_2;
		m_TAX_RATE_3 = i_TAX_RATE_3;
		m_TAX_ROUND_TYP = i_TAX_ROUND_TYP;
		m_USER_CD = i_USER_CD;
		m_USER_NAME = i_USER_NAME;
		m_CUR_CD = i_CUR_CD;
		m_EXCH_TYP = i_EXCH_TYP;
		m_DETAIL_ROUND_TYP = i_DETAIL_ROUND_TYP;
		m_SYS_CLASS_CODE = i_SYS_CLASS_CODE;
		m_DECIMAL_FIG = i_DECIMAL_FIG;
		m_h_INSTALL_FLG = i_h_INSTALL_FLG;
	}
		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
