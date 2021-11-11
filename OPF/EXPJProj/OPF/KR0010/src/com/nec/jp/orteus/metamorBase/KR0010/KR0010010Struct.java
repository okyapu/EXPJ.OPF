/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KR0010/src/com/nec/jp/orteus/metamorBase/KR0010/KR0010010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.KR0010;

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

public class KR0010010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_h_SLIP_CD */
	public String m_h_SLIP_CD = null;
	/** 第 2 変数： m_INSPC_ACPT_TYP_DN */
	public String m_INSPC_ACPT_TYP_DN = null;
	/** 第 3 変数： m_PKG_UNIT2 */
	public String m_PKG_UNIT2 = null;
	/** 第 4 変数： m_CUR_UNIT2 */
	public String m_CUR_UNIT2 = null;
	/** 第 5 変数： m_PKG_UNIT3 */
	public String m_PKG_UNIT3 = null;
	/** 第 6 変数： m_SALES_DATE2 */
	public String m_SALES_DATE2 = null;
	/** 第 7 変数： m_ROUND_TYP */
	public String m_ROUND_TYP = null;
	/** 第 8 変数： m_SLIP_CD */
	public String m_SLIP_CD = null;
	/** 第 9 変数： m_CUST_CD */
	public String m_CUST_CD = null;
	/** 第 10 変数： m_CUST_ANAME */
	public String m_CUST_ANAME = null;
	/** 第 11 変数： m_INSPC_ACPT_TYP */
	public String m_INSPC_ACPT_TYP = null;
	/** 第 12 変数： m_CUST_ODR_NO */
	public String m_CUST_ODR_NO = null;
	/** 第 13 変数： m_SALES_DATE */
	public String m_SALES_DATE = null;
	/** 第 14 変数： m_SHIP_DATE */
	public String m_SHIP_DATE = null;
	/** 第 15 変数： m_SALES_DEPT_CD */
	public String m_SALES_DEPT_CD = null;
	/** 第 16 変数： m_ORG_NAME */
	public String m_ORG_NAME = null;
	/** 第 17 変数： m_CUST_CHRG_PSN_CD */
	public String m_CUST_CHRG_PSN_CD = null;
	/** 第 18 変数： m_USER_NAME */
	public String m_USER_NAME = null;
	/** 第 19 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 20 変数： m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** 第 21 変数： m_CUST_ITEM_CD */
	public String m_CUST_ITEM_CD = null;
	/** 第 22 変数： m_SALES_QTY */
	public String m_SALES_QTY = null;
	/** 第 23 変数： m_SHIP_QTY */
	public String m_SHIP_QTY = null;
	/** 第 24 変数： m_SALES_UNIT_PRICE */
	public String m_SALES_UNIT_PRICE = null;
	/** 第 25 変数： m_SALES_AMOUNT */
	public String m_SALES_AMOUNT = null;
	/** 第 26 変数： m_CUR_UNIT */
	public String m_CUR_UNIT = null;
	/** 第 27 変数： m_REMARKS */
	public String m_REMARKS = null;
	/** 第 28 変数： m_STATUS */
	public String m_STATUS = null;
	/** 第 29 変数： m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** 第 30 変数： m_AI_AR_IF_FLG */
	public String m_AI_AR_IF_FLG = null;
	/** 第 31 変数： m_PKG_UNIT */
	public String m_PKG_UNIT = null;
	/** 第 32 変数： m_ODR_NO */
	public String m_ODR_NO = null;
	/** 第 33 変数： m_PART_DLV_SEQ_NO */
	public String m_PART_DLV_SEQ_NO = null;
	/** 第 34 変数： m_DESINATED_DLV_DATE */
	public String m_DESINATED_DLV_DATE = null;
	/** 第 35 変数： m_ODR_ACPT_DATE */
	public String m_ODR_ACPT_DATE = null;
	/** 第 36 変数： m_ODR_QTY */
	public String m_ODR_QTY = null;
	/** 第 37 変数： m_SHIP_ODR_NO */
	public String m_SHIP_ODR_NO = null;
	/** 第 38 変数： m_UNIT_QTY_TYP */
	public String m_UNIT_QTY_TYP = null;
	/** 第 39 変数： m_CUST_ITEM_NAME */
	public String m_CUST_ITEM_NAME = null;
	/** 第 40 変数： m_OPTION_ID */
	public String m_OPTION_ID = null;
	/** 第 41 変数： m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** 第 42 変数： m_CUR_CD */
	public String m_CUR_CD = null;
	/** 第 43 変数： m_EXCH_TYP */
	public String m_EXCH_TYP = null;
	/** 第 44 変数： m_TAX_CD */
	public String m_TAX_CD = null;
	/** 第 45 変数： m_DETAIL_ROUND_TYP */
	public String m_DETAIL_ROUND_TYP = null;
	/** 第 46 変数： m_TAX_APPLY_TYP */
	public String m_TAX_APPLY_TYP = null;
	/** 第 47 変数： m_ORG_CD */
	public String m_ORG_CD = null;
	/** 第 48 変数： m_USER_CD */
	public String m_USER_CD = null;
	/** 第 49 変数： m_DECIMAL_FIG */
	public String m_DECIMAL_FIG = null;
	/** 第 50 変数： m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** 第 51 変数： m_PVC2SHUBETU */
	public String m_PVC2SHUBETU = null;
	/** 第 52 変数： m_PVC2ORGSLIP_CD */
	public String m_PVC2ORGSLIP_CD = null;
	/** 第 53 変数： m_PVC2REDSLIP_CD */
	public String m_PVC2REDSLIP_CD = null;
	/** 第 54 変数： m_PVC2BLKSLIP_CD */
	public String m_PVC2BLKSLIP_CD = null;
	/** 第 55 変数： m_PVC2RESULT */
	public String m_PVC2RESULT = null;
	/** 第 56 変数： m_TAX_RATE_1 */
	public String m_TAX_RATE_1 = null;
	/** 第 57 変数： m_TAX_RATE_2 */
	public String m_TAX_RATE_2 = null;
	/** 第 58 変数： m_TAX_RATE_3 */
	public String m_TAX_RATE_3 = null;
	/** 第 59 変数： m_TAX_ROUND_TYP */
	public String m_TAX_ROUND_TYP = null;
	/** 第 60 変数： m_SALES_AMOUNT_EXCH_RATES */
	public String m_SALES_AMOUNT_EXCH_RATES = null;
	/** 第 61 変数： m_INSPC_ACPT_DATE */
	public String m_INSPC_ACPT_DATE = null;
	/** 第 62 変数： m_INSPC_ACPT_QTY */
	public String m_INSPC_ACPT_QTY = null;
	/** 第 63 変数： m_EXTERNAL_TAX_SALES_AMOUNT */
	public String m_EXTERNAL_TAX_SALES_AMOUNT = null;
	/** 第 64 変数： m_INTERNAL_TAX_SALES_AMOUNT */
	public String m_INTERNAL_TAX_SALES_AMOUNT = null;
	/** 第 65 変数： m_TAXFREE_SALES_AMOUNT */
	public String m_TAXFREE_SALES_AMOUNT = null;
	/** 第 66 変数： m_TAX_CREDIT_SALES_AMOUNT */
	public String m_TAX_CREDIT_SALES_AMOUNT = null;
	/** 第 67 変数： m_EXTERNAL_TAX_AMOUNT */
	public String m_EXTERNAL_TAX_AMOUNT = null;
	/** 第 68 変数： m_INTERNAL_TAX_AMOUNT */
	public String m_INTERNAL_TAX_AMOUNT = null;
	/** 第 69 変数： m_TAX_AMOUNT_1 */
	public String m_TAX_AMOUNT_1 = null;
	/** 第 70 変数： m_TAX_AMOUNT_2 */
	public String m_TAX_AMOUNT_2 = null;
	/** 第 71 変数： m_TAX_AMOUNT_3 */
	public String m_TAX_AMOUNT_3 = null;
	/** 第 72 変数： m_OWN_CUR_TAXCREDIT_SALES_AMOUNT */
	public String m_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;
	/** 第 73 変数： m_APPR_FLG */
	public String m_APPR_FLG = null;
	/** 第 74 変数： m_APPR_ID */
	public String m_APPR_ID = null;
	/** 第 75 変数： m_APPR_DATE */
	public String m_APPR_DATE = null;
	/** 第 76 変数： m_EXCH_RATE */
	public String m_EXCH_RATE = null;
	/** 第 77 変数： m_ORG_SLIP_CD */
	public String m_ORG_SLIP_CD = null;
	/** 第 78 変数： m_BUSINESS_OPR_DATE */
	public String m_BUSINESS_OPR_DATE = null;
	/** 第 79 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** 第 80 変数： m_SYS_CLASS_CODE */
	public String m_SYS_CLASS_CODE = null;
	/** 第 81 変数： m_h_INSTALL_FLG */
	public String m_h_INSTALL_FLG = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_h_SLIP_CD */
	public List l_h_SLIP_CD = null;

	/** 第 2 List変数： l_INSPC_ACPT_TYP_DN */
	public List l_INSPC_ACPT_TYP_DN = null;

	/** 第 3 List変数： l_PKG_UNIT2 */
	public List l_PKG_UNIT2 = null;

	/** 第 4 List変数： l_CUR_UNIT2 */
	public List l_CUR_UNIT2 = null;

	/** 第 5 List変数： l_PKG_UNIT3 */
	public List l_PKG_UNIT3 = null;

	/** 第 6 List変数： l_SALES_DATE2 */
	public List l_SALES_DATE2 = null;

	/** 第 7 List変数： l_ROUND_TYP */
	public List l_ROUND_TYP = null;

	/** 第 8 List変数： l_SLIP_CD */
	public List l_SLIP_CD = null;

	/** 第 9 List変数： l_CUST_CD */
	public List l_CUST_CD = null;

	/** 第 10 List変数： l_CUST_ANAME */
	public List l_CUST_ANAME = null;

	/** 第 11 List変数： l_INSPC_ACPT_TYP */
	public List l_INSPC_ACPT_TYP = null;

	/** 第 12 List変数： l_CUST_ODR_NO */
	public List l_CUST_ODR_NO = null;

	/** 第 13 List変数： l_SALES_DATE */
	public List l_SALES_DATE = null;

	/** 第 14 List変数： l_SHIP_DATE */
	public List l_SHIP_DATE = null;

	/** 第 15 List変数： l_SALES_DEPT_CD */
	public List l_SALES_DEPT_CD = null;

	/** 第 16 List変数： l_ORG_NAME */
	public List l_ORG_NAME = null;

	/** 第 17 List変数： l_CUST_CHRG_PSN_CD */
	public List l_CUST_CHRG_PSN_CD = null;

	/** 第 18 List変数： l_USER_NAME */
	public List l_USER_NAME = null;

	/** 第 19 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 20 List変数： l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** 第 21 List変数： l_CUST_ITEM_CD */
	public List l_CUST_ITEM_CD = null;

	/** 第 22 List変数： l_SALES_QTY */
	public List l_SALES_QTY = null;

	/** 第 23 List変数： l_SHIP_QTY */
	public List l_SHIP_QTY = null;

	/** 第 24 List変数： l_SALES_UNIT_PRICE */
	public List l_SALES_UNIT_PRICE = null;

	/** 第 25 List変数： l_SALES_AMOUNT */
	public List l_SALES_AMOUNT = null;

	/** 第 26 List変数： l_CUR_UNIT */
	public List l_CUR_UNIT = null;

	/** 第 27 List変数： l_REMARKS */
	public List l_REMARKS = null;

	/** 第 28 List変数： l_STATUS */
	public List l_STATUS = null;

	/** 第 29 List変数： l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** 第 30 List変数： l_AI_AR_IF_FLG */
	public List l_AI_AR_IF_FLG = null;

	/** 第 31 List変数： l_PKG_UNIT */
	public List l_PKG_UNIT = null;

	/** 第 32 List変数： l_ODR_NO */
	public List l_ODR_NO = null;

	/** 第 33 List変数： l_PART_DLV_SEQ_NO */
	public List l_PART_DLV_SEQ_NO = null;

	/** 第 34 List変数： l_DESINATED_DLV_DATE */
	public List l_DESINATED_DLV_DATE = null;

	/** 第 35 List変数： l_ODR_ACPT_DATE */
	public List l_ODR_ACPT_DATE = null;

	/** 第 36 List変数： l_ODR_QTY */
	public List l_ODR_QTY = null;

	/** 第 37 List変数： l_SHIP_ODR_NO */
	public List l_SHIP_ODR_NO = null;

	/** 第 38 List変数： l_UNIT_QTY_TYP */
	public List l_UNIT_QTY_TYP = null;

	/** 第 39 List変数： l_CUST_ITEM_NAME */
	public List l_CUST_ITEM_NAME = null;

	/** 第 40 List変数： l_OPTION_ID */
	public List l_OPTION_ID = null;

	/** 第 41 List変数： l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** 第 42 List変数： l_CUR_CD */
	public List l_CUR_CD = null;

	/** 第 43 List変数： l_EXCH_TYP */
	public List l_EXCH_TYP = null;

	/** 第 44 List変数： l_TAX_CD */
	public List l_TAX_CD = null;

	/** 第 45 List変数： l_DETAIL_ROUND_TYP */
	public List l_DETAIL_ROUND_TYP = null;

	/** 第 46 List変数： l_TAX_APPLY_TYP */
	public List l_TAX_APPLY_TYP = null;

	/** 第 47 List変数： l_ORG_CD */
	public List l_ORG_CD = null;

	/** 第 48 List変数： l_USER_CD */
	public List l_USER_CD = null;

	/** 第 49 List変数： l_DECIMAL_FIG */
	public List l_DECIMAL_FIG = null;

	/** 第 50 List変数： l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** 第 51 List変数： l_PVC2SHUBETU */
	public List l_PVC2SHUBETU = null;

	/** 第 52 List変数： l_PVC2ORGSLIP_CD */
	public List l_PVC2ORGSLIP_CD = null;

	/** 第 53 List変数： l_PVC2REDSLIP_CD */
	public List l_PVC2REDSLIP_CD = null;

	/** 第 54 List変数： l_PVC2BLKSLIP_CD */
	public List l_PVC2BLKSLIP_CD = null;

	/** 第 55 List変数： l_PVC2RESULT */
	public List l_PVC2RESULT = null;

	/** 第 56 List変数： l_TAX_RATE_1 */
	public List l_TAX_RATE_1 = null;

	/** 第 57 List変数： l_TAX_RATE_2 */
	public List l_TAX_RATE_2 = null;

	/** 第 58 List変数： l_TAX_RATE_3 */
	public List l_TAX_RATE_3 = null;

	/** 第 59 List変数： l_TAX_ROUND_TYP */
	public List l_TAX_ROUND_TYP = null;

	/** 第 60 List変数： l_SALES_AMOUNT_EXCH_RATES */
	public List l_SALES_AMOUNT_EXCH_RATES = null;

	/** 第 61 List変数： l_INSPC_ACPT_DATE */
	public List l_INSPC_ACPT_DATE = null;

	/** 第 62 List変数： l_INSPC_ACPT_QTY */
	public List l_INSPC_ACPT_QTY = null;

	/** 第 63 List変数： l_EXTERNAL_TAX_SALES_AMOUNT */
	public List l_EXTERNAL_TAX_SALES_AMOUNT = null;

	/** 第 64 List変数： l_INTERNAL_TAX_SALES_AMOUNT */
	public List l_INTERNAL_TAX_SALES_AMOUNT = null;

	/** 第 65 List変数： l_TAXFREE_SALES_AMOUNT */
	public List l_TAXFREE_SALES_AMOUNT = null;

	/** 第 66 List変数： l_TAX_CREDIT_SALES_AMOUNT */
	public List l_TAX_CREDIT_SALES_AMOUNT = null;

	/** 第 67 List変数： l_EXTERNAL_TAX_AMOUNT */
	public List l_EXTERNAL_TAX_AMOUNT = null;

	/** 第 68 List変数： l_INTERNAL_TAX_AMOUNT */
	public List l_INTERNAL_TAX_AMOUNT = null;

	/** 第 69 List変数： l_TAX_AMOUNT_1 */
	public List l_TAX_AMOUNT_1 = null;

	/** 第 70 List変数： l_TAX_AMOUNT_2 */
	public List l_TAX_AMOUNT_2 = null;

	/** 第 71 List変数： l_TAX_AMOUNT_3 */
	public List l_TAX_AMOUNT_3 = null;

	/** 第 72 List変数： l_OWN_CUR_TAXCREDIT_SALES_AMOUNT */
	public List l_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;

	/** 第 73 List変数： l_APPR_FLG */
	public List l_APPR_FLG = null;

	/** 第 74 List変数： l_APPR_ID */
	public List l_APPR_ID = null;

	/** 第 75 List変数： l_APPR_DATE */
	public List l_APPR_DATE = null;

	/** 第 76 List変数： l_EXCH_RATE */
	public List l_EXCH_RATE = null;

	/** 第 77 List変数： l_ORG_SLIP_CD */
	public List l_ORG_SLIP_CD = null;

	/** 第 78 List変数： l_BUSINESS_OPR_DATE */
	public List l_BUSINESS_OPR_DATE = null;

	/** 第 79 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** 第 80 List変数： l_SYS_CLASS_CODE */
	public List l_SYS_CLASS_CODE = null;

	/** 第 81 List変数： l_h_INSTALL_FLG */
	public List l_h_INSTALL_FLG = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String geth_SLIP_CD() { return m_h_SLIP_CD; }
	public String getINSPC_ACPT_TYP_DN() { return m_INSPC_ACPT_TYP_DN; }
	public String getPKG_UNIT2() { return m_PKG_UNIT2; }
	public String getCUR_UNIT2() { return m_CUR_UNIT2; }
	public String getPKG_UNIT3() { return m_PKG_UNIT3; }
	public String getSALES_DATE2() { return m_SALES_DATE2; }
	public String getROUND_TYP() { return m_ROUND_TYP; }
	public String getSLIP_CD() { return m_SLIP_CD; }
	public String getCUST_CD() { return m_CUST_CD; }
	public String getCUST_ANAME() { return m_CUST_ANAME; }
	public String getINSPC_ACPT_TYP() { return m_INSPC_ACPT_TYP; }
	public String getCUST_ODR_NO() { return m_CUST_ODR_NO; }
	public String getSALES_DATE() { return m_SALES_DATE; }
	public String getSHIP_DATE() { return m_SHIP_DATE; }
	public String getSALES_DEPT_CD() { return m_SALES_DEPT_CD; }
	public String getORG_NAME() { return m_ORG_NAME; }
	public String getCUST_CHRG_PSN_CD() { return m_CUST_CHRG_PSN_CD; }
	public String getUSER_NAME() { return m_USER_NAME; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getCUST_ITEM_CD() { return m_CUST_ITEM_CD; }
	public String getSALES_QTY() { return m_SALES_QTY; }
	public String getSHIP_QTY() { return m_SHIP_QTY; }
	public String getSALES_UNIT_PRICE() { return m_SALES_UNIT_PRICE; }
	public String getSALES_AMOUNT() { return m_SALES_AMOUNT; }
	public String getCUR_UNIT() { return m_CUR_UNIT; }
	public String getREMARKS() { return m_REMARKS; }
	public String getSTATUS() { return m_STATUS; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getAI_AR_IF_FLG() { return m_AI_AR_IF_FLG; }
	public String getPKG_UNIT() { return m_PKG_UNIT; }
	public String getODR_NO() { return m_ODR_NO; }
	public String getPART_DLV_SEQ_NO() { return m_PART_DLV_SEQ_NO; }
	public String getDESINATED_DLV_DATE() { return m_DESINATED_DLV_DATE; }
	public String getODR_ACPT_DATE() { return m_ODR_ACPT_DATE; }
	public String getODR_QTY() { return m_ODR_QTY; }
	public String getSHIP_ODR_NO() { return m_SHIP_ODR_NO; }
	public String getUNIT_QTY_TYP() { return m_UNIT_QTY_TYP; }
	public String getCUST_ITEM_NAME() { return m_CUST_ITEM_NAME; }
	public String getOPTION_ID() { return m_OPTION_ID; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getCUR_CD() { return m_CUR_CD; }
	public String getEXCH_TYP() { return m_EXCH_TYP; }
	public String getTAX_CD() { return m_TAX_CD; }
	public String getDETAIL_ROUND_TYP() { return m_DETAIL_ROUND_TYP; }
	public String getTAX_APPLY_TYP() { return m_TAX_APPLY_TYP; }
	public String getORG_CD() { return m_ORG_CD; }
	public String getUSER_CD() { return m_USER_CD; }
	public String getDECIMAL_FIG() { return m_DECIMAL_FIG; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getPVC2SHUBETU() { return m_PVC2SHUBETU; }
	public String getPVC2ORGSLIP_CD() { return m_PVC2ORGSLIP_CD; }
	public String getPVC2REDSLIP_CD() { return m_PVC2REDSLIP_CD; }
	public String getPVC2BLKSLIP_CD() { return m_PVC2BLKSLIP_CD; }
	public String getPVC2RESULT() { return m_PVC2RESULT; }
	public String getTAX_RATE_1() { return m_TAX_RATE_1; }
	public String getTAX_RATE_2() { return m_TAX_RATE_2; }
	public String getTAX_RATE_3() { return m_TAX_RATE_3; }
	public String getTAX_ROUND_TYP() { return m_TAX_ROUND_TYP; }
	public String getSALES_AMOUNT_EXCH_RATES() { return m_SALES_AMOUNT_EXCH_RATES; }
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
	public String getAPPR_FLG() { return m_APPR_FLG; }
	public String getAPPR_ID() { return m_APPR_ID; }
	public String getAPPR_DATE() { return m_APPR_DATE; }
	public String getEXCH_RATE() { return m_EXCH_RATE; }
	public String getORG_SLIP_CD() { return m_ORG_SLIP_CD; }
	public String getBUSINESS_OPR_DATE() { return m_BUSINESS_OPR_DATE; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getSYS_CLASS_CODE() { return m_SYS_CLASS_CODE; }
	public String geth_INSTALL_FLG() { return m_h_INSTALL_FLG; }

	public List getList_h_SLIP_CD() { return l_h_SLIP_CD; }
	public List getList_INSPC_ACPT_TYP_DN() { return l_INSPC_ACPT_TYP_DN; }
	public List getList_PKG_UNIT2() { return l_PKG_UNIT2; }
	public List getList_CUR_UNIT2() { return l_CUR_UNIT2; }
	public List getList_PKG_UNIT3() { return l_PKG_UNIT3; }
	public List getList_SALES_DATE2() { return l_SALES_DATE2; }
	public List getList_ROUND_TYP() { return l_ROUND_TYP; }
	public List getList_SLIP_CD() { return l_SLIP_CD; }
	public List getList_CUST_CD() { return l_CUST_CD; }
	public List getList_CUST_ANAME() { return l_CUST_ANAME; }
	public List getList_INSPC_ACPT_TYP() { return l_INSPC_ACPT_TYP; }
	public List getList_CUST_ODR_NO() { return l_CUST_ODR_NO; }
	public List getList_SALES_DATE() { return l_SALES_DATE; }
	public List getList_SHIP_DATE() { return l_SHIP_DATE; }
	public List getList_SALES_DEPT_CD() { return l_SALES_DEPT_CD; }
	public List getList_ORG_NAME() { return l_ORG_NAME; }
	public List getList_CUST_CHRG_PSN_CD() { return l_CUST_CHRG_PSN_CD; }
	public List getList_USER_NAME() { return l_USER_NAME; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_CUST_ITEM_CD() { return l_CUST_ITEM_CD; }
	public List getList_SALES_QTY() { return l_SALES_QTY; }
	public List getList_SHIP_QTY() { return l_SHIP_QTY; }
	public List getList_SALES_UNIT_PRICE() { return l_SALES_UNIT_PRICE; }
	public List getList_SALES_AMOUNT() { return l_SALES_AMOUNT; }
	public List getList_CUR_UNIT() { return l_CUR_UNIT; }
	public List getList_REMARKS() { return l_REMARKS; }
	public List getList_STATUS() { return l_STATUS; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_AI_AR_IF_FLG() { return l_AI_AR_IF_FLG; }
	public List getList_PKG_UNIT() { return l_PKG_UNIT; }
	public List getList_ODR_NO() { return l_ODR_NO; }
	public List getList_PART_DLV_SEQ_NO() { return l_PART_DLV_SEQ_NO; }
	public List getList_DESINATED_DLV_DATE() { return l_DESINATED_DLV_DATE; }
	public List getList_ODR_ACPT_DATE() { return l_ODR_ACPT_DATE; }
	public List getList_ODR_QTY() { return l_ODR_QTY; }
	public List getList_SHIP_ODR_NO() { return l_SHIP_ODR_NO; }
	public List getList_UNIT_QTY_TYP() { return l_UNIT_QTY_TYP; }
	public List getList_CUST_ITEM_NAME() { return l_CUST_ITEM_NAME; }
	public List getList_OPTION_ID() { return l_OPTION_ID; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_CUR_CD() { return l_CUR_CD; }
	public List getList_EXCH_TYP() { return l_EXCH_TYP; }
	public List getList_TAX_CD() { return l_TAX_CD; }
	public List getList_DETAIL_ROUND_TYP() { return l_DETAIL_ROUND_TYP; }
	public List getList_TAX_APPLY_TYP() { return l_TAX_APPLY_TYP; }
	public List getList_ORG_CD() { return l_ORG_CD; }
	public List getList_USER_CD() { return l_USER_CD; }
	public List getList_DECIMAL_FIG() { return l_DECIMAL_FIG; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_PVC2SHUBETU() { return l_PVC2SHUBETU; }
	public List getList_PVC2ORGSLIP_CD() { return l_PVC2ORGSLIP_CD; }
	public List getList_PVC2REDSLIP_CD() { return l_PVC2REDSLIP_CD; }
	public List getList_PVC2BLKSLIP_CD() { return l_PVC2BLKSLIP_CD; }
	public List getList_PVC2RESULT() { return l_PVC2RESULT; }
	public List getList_TAX_RATE_1() { return l_TAX_RATE_1; }
	public List getList_TAX_RATE_2() { return l_TAX_RATE_2; }
	public List getList_TAX_RATE_3() { return l_TAX_RATE_3; }
	public List getList_TAX_ROUND_TYP() { return l_TAX_ROUND_TYP; }
	public List getList_SALES_AMOUNT_EXCH_RATES() { return l_SALES_AMOUNT_EXCH_RATES; }
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
	public List getList_APPR_FLG() { return l_APPR_FLG; }
	public List getList_APPR_ID() { return l_APPR_ID; }
	public List getList_APPR_DATE() { return l_APPR_DATE; }
	public List getList_EXCH_RATE() { return l_EXCH_RATE; }
	public List getList_ORG_SLIP_CD() { return l_ORG_SLIP_CD; }
	public List getList_BUSINESS_OPR_DATE() { return l_BUSINESS_OPR_DATE; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_SYS_CLASS_CODE() { return l_SYS_CLASS_CODE; }
	public List getList_h_INSTALL_FLG() { return l_h_INSTALL_FLG; }

	public void seth_SLIP_CD(String val) { m_h_SLIP_CD = val; }
	public void setINSPC_ACPT_TYP_DN(String val) { m_INSPC_ACPT_TYP_DN = val; }
	public void setPKG_UNIT2(String val) { m_PKG_UNIT2 = val; }
	public void setCUR_UNIT2(String val) { m_CUR_UNIT2 = val; }
	public void setPKG_UNIT3(String val) { m_PKG_UNIT3 = val; }
	public void setSALES_DATE2(String val) { m_SALES_DATE2 = val; }
	public void setROUND_TYP(String val) { m_ROUND_TYP = val; }
	public void setSLIP_CD(String val) { m_SLIP_CD = val; }
	public void setCUST_CD(String val) { m_CUST_CD = val; }
	public void setCUST_ANAME(String val) { m_CUST_ANAME = val; }
	public void setINSPC_ACPT_TYP(String val) { m_INSPC_ACPT_TYP = val; }
	public void setCUST_ODR_NO(String val) { m_CUST_ODR_NO = val; }
	public void setSALES_DATE(String val) { m_SALES_DATE = val; }
	public void setSHIP_DATE(String val) { m_SHIP_DATE = val; }
	public void setSALES_DEPT_CD(String val) { m_SALES_DEPT_CD = val; }
	public void setORG_NAME(String val) { m_ORG_NAME = val; }
	public void setCUST_CHRG_PSN_CD(String val) { m_CUST_CHRG_PSN_CD = val; }
	public void setUSER_NAME(String val) { m_USER_NAME = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setCUST_ITEM_CD(String val) { m_CUST_ITEM_CD = val; }
	public void setSALES_QTY(String val) { m_SALES_QTY = val; }
	public void setSHIP_QTY(String val) { m_SHIP_QTY = val; }
	public void setSALES_UNIT_PRICE(String val) { m_SALES_UNIT_PRICE = val; }
	public void setSALES_AMOUNT(String val) { m_SALES_AMOUNT = val; }
	public void setCUR_UNIT(String val) { m_CUR_UNIT = val; }
	public void setREMARKS(String val) { m_REMARKS = val; }
	public void setSTATUS(String val) { m_STATUS = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setAI_AR_IF_FLG(String val) { m_AI_AR_IF_FLG = val; }
	public void setPKG_UNIT(String val) { m_PKG_UNIT = val; }
	public void setODR_NO(String val) { m_ODR_NO = val; }
	public void setPART_DLV_SEQ_NO(String val) { m_PART_DLV_SEQ_NO = val; }
	public void setDESINATED_DLV_DATE(String val) { m_DESINATED_DLV_DATE = val; }
	public void setODR_ACPT_DATE(String val) { m_ODR_ACPT_DATE = val; }
	public void setODR_QTY(String val) { m_ODR_QTY = val; }
	public void setSHIP_ODR_NO(String val) { m_SHIP_ODR_NO = val; }
	public void setUNIT_QTY_TYP(String val) { m_UNIT_QTY_TYP = val; }
	public void setCUST_ITEM_NAME(String val) { m_CUST_ITEM_NAME = val; }
	public void setOPTION_ID(String val) { m_OPTION_ID = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setCUR_CD(String val) { m_CUR_CD = val; }
	public void setEXCH_TYP(String val) { m_EXCH_TYP = val; }
	public void setTAX_CD(String val) { m_TAX_CD = val; }
	public void setDETAIL_ROUND_TYP(String val) { m_DETAIL_ROUND_TYP = val; }
	public void setTAX_APPLY_TYP(String val) { m_TAX_APPLY_TYP = val; }
	public void setORG_CD(String val) { m_ORG_CD = val; }
	public void setUSER_CD(String val) { m_USER_CD = val; }
	public void setDECIMAL_FIG(String val) { m_DECIMAL_FIG = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setPVC2SHUBETU(String val) { m_PVC2SHUBETU = val; }
	public void setPVC2ORGSLIP_CD(String val) { m_PVC2ORGSLIP_CD = val; }
	public void setPVC2REDSLIP_CD(String val) { m_PVC2REDSLIP_CD = val; }
	public void setPVC2BLKSLIP_CD(String val) { m_PVC2BLKSLIP_CD = val; }
	public void setPVC2RESULT(String val) { m_PVC2RESULT = val; }
	public void setTAX_RATE_1(String val) { m_TAX_RATE_1 = val; }
	public void setTAX_RATE_2(String val) { m_TAX_RATE_2 = val; }
	public void setTAX_RATE_3(String val) { m_TAX_RATE_3 = val; }
	public void setTAX_ROUND_TYP(String val) { m_TAX_ROUND_TYP = val; }
	public void setSALES_AMOUNT_EXCH_RATES(String val) { m_SALES_AMOUNT_EXCH_RATES = val; }
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
	public void setAPPR_FLG(String val) { m_APPR_FLG = val; }
	public void setAPPR_ID(String val) { m_APPR_ID = val; }
	public void setAPPR_DATE(String val) { m_APPR_DATE = val; }
	public void setEXCH_RATE(String val) { m_EXCH_RATE = val; }
	public void setORG_SLIP_CD(String val) { m_ORG_SLIP_CD = val; }
	public void setBUSINESS_OPR_DATE(String val) { m_BUSINESS_OPR_DATE = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setSYS_CLASS_CODE(String val) { m_SYS_CLASS_CODE = val; }
	public void seth_INSTALL_FLG(String val) { m_h_INSTALL_FLG = val; }


	public void setList_h_SLIP_CD(List list) { l_h_SLIP_CD = list; }
	public void setList_INSPC_ACPT_TYP_DN(List list) { l_INSPC_ACPT_TYP_DN = list; }
	public void setList_PKG_UNIT2(List list) { l_PKG_UNIT2 = list; }
	public void setList_CUR_UNIT2(List list) { l_CUR_UNIT2 = list; }
	public void setList_PKG_UNIT3(List list) { l_PKG_UNIT3 = list; }
	public void setList_SALES_DATE2(List list) { l_SALES_DATE2 = list; }
	public void setList_ROUND_TYP(List list) { l_ROUND_TYP = list; }
	public void setList_SLIP_CD(List list) { l_SLIP_CD = list; }
	public void setList_CUST_CD(List list) { l_CUST_CD = list; }
	public void setList_CUST_ANAME(List list) { l_CUST_ANAME = list; }
	public void setList_INSPC_ACPT_TYP(List list) { l_INSPC_ACPT_TYP = list; }
	public void setList_CUST_ODR_NO(List list) { l_CUST_ODR_NO = list; }
	public void setList_SALES_DATE(List list) { l_SALES_DATE = list; }
	public void setList_SHIP_DATE(List list) { l_SHIP_DATE = list; }
	public void setList_SALES_DEPT_CD(List list) { l_SALES_DEPT_CD = list; }
	public void setList_ORG_NAME(List list) { l_ORG_NAME = list; }
	public void setList_CUST_CHRG_PSN_CD(List list) { l_CUST_CHRG_PSN_CD = list; }
	public void setList_USER_NAME(List list) { l_USER_NAME = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_CUST_ITEM_CD(List list) { l_CUST_ITEM_CD = list; }
	public void setList_SALES_QTY(List list) { l_SALES_QTY = list; }
	public void setList_SHIP_QTY(List list) { l_SHIP_QTY = list; }
	public void setList_SALES_UNIT_PRICE(List list) { l_SALES_UNIT_PRICE = list; }
	public void setList_SALES_AMOUNT(List list) { l_SALES_AMOUNT = list; }
	public void setList_CUR_UNIT(List list) { l_CUR_UNIT = list; }
	public void setList_REMARKS(List list) { l_REMARKS = list; }
	public void setList_STATUS(List list) { l_STATUS = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_AI_AR_IF_FLG(List list) { l_AI_AR_IF_FLG = list; }
	public void setList_PKG_UNIT(List list) { l_PKG_UNIT = list; }
	public void setList_ODR_NO(List list) { l_ODR_NO = list; }
	public void setList_PART_DLV_SEQ_NO(List list) { l_PART_DLV_SEQ_NO = list; }
	public void setList_DESINATED_DLV_DATE(List list) { l_DESINATED_DLV_DATE = list; }
	public void setList_ODR_ACPT_DATE(List list) { l_ODR_ACPT_DATE = list; }
	public void setList_ODR_QTY(List list) { l_ODR_QTY = list; }
	public void setList_SHIP_ODR_NO(List list) { l_SHIP_ODR_NO = list; }
	public void setList_UNIT_QTY_TYP(List list) { l_UNIT_QTY_TYP = list; }
	public void setList_CUST_ITEM_NAME(List list) { l_CUST_ITEM_NAME = list; }
	public void setList_OPTION_ID(List list) { l_OPTION_ID = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_CUR_CD(List list) { l_CUR_CD = list; }
	public void setList_EXCH_TYP(List list) { l_EXCH_TYP = list; }
	public void setList_TAX_CD(List list) { l_TAX_CD = list; }
	public void setList_DETAIL_ROUND_TYP(List list) { l_DETAIL_ROUND_TYP = list; }
	public void setList_TAX_APPLY_TYP(List list) { l_TAX_APPLY_TYP = list; }
	public void setList_ORG_CD(List list) { l_ORG_CD = list; }
	public void setList_USER_CD(List list) { l_USER_CD = list; }
	public void setList_DECIMAL_FIG(List list) { l_DECIMAL_FIG = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_PVC2SHUBETU(List list) { l_PVC2SHUBETU = list; }
	public void setList_PVC2ORGSLIP_CD(List list) { l_PVC2ORGSLIP_CD = list; }
	public void setList_PVC2REDSLIP_CD(List list) { l_PVC2REDSLIP_CD = list; }
	public void setList_PVC2BLKSLIP_CD(List list) { l_PVC2BLKSLIP_CD = list; }
	public void setList_PVC2RESULT(List list) { l_PVC2RESULT = list; }
	public void setList_TAX_RATE_1(List list) { l_TAX_RATE_1 = list; }
	public void setList_TAX_RATE_2(List list) { l_TAX_RATE_2 = list; }
	public void setList_TAX_RATE_3(List list) { l_TAX_RATE_3 = list; }
	public void setList_TAX_ROUND_TYP(List list) { l_TAX_ROUND_TYP = list; }
	public void setList_SALES_AMOUNT_EXCH_RATES(List list) { l_SALES_AMOUNT_EXCH_RATES = list; }
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
	public void setList_APPR_FLG(List list) { l_APPR_FLG = list; }
	public void setList_APPR_ID(List list) { l_APPR_ID = list; }
	public void setList_APPR_DATE(List list) { l_APPR_DATE = list; }
	public void setList_EXCH_RATE(List list) { l_EXCH_RATE = list; }
	public void setList_ORG_SLIP_CD(List list) { l_ORG_SLIP_CD = list; }
	public void setList_BUSINESS_OPR_DATE(List list) { l_BUSINESS_OPR_DATE = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_SYS_CLASS_CODE(List list) { l_SYS_CLASS_CODE = list; }
	public void setList_h_INSTALL_FLG(List list) { l_h_INSTALL_FLG = list; }

	public int setL2L_h_SLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_SLIP_CD == null) {
			l_h_SLIP_CD = new ArrayList();
		} else {
			l_h_SLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_SLIP_CD.add(((KR0010010Struct) list.get(i)).geth_SLIP_CD());
		}
		return size;
	}
	public int setL2L_INSPC_ACPT_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INSPC_ACPT_TYP_DN == null) {
			l_INSPC_ACPT_TYP_DN = new ArrayList();
		} else {
			l_INSPC_ACPT_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INSPC_ACPT_TYP_DN.add(((KR0010010Struct) list.get(i)).getINSPC_ACPT_TYP_DN());
		}
		return size;
	}
	public int setL2L_PKG_UNIT2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PKG_UNIT2 == null) {
			l_PKG_UNIT2 = new ArrayList();
		} else {
			l_PKG_UNIT2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PKG_UNIT2.add(((KR0010010Struct) list.get(i)).getPKG_UNIT2());
		}
		return size;
	}
	public int setL2L_CUR_UNIT2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUR_UNIT2 == null) {
			l_CUR_UNIT2 = new ArrayList();
		} else {
			l_CUR_UNIT2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUR_UNIT2.add(((KR0010010Struct) list.get(i)).getCUR_UNIT2());
		}
		return size;
	}
	public int setL2L_PKG_UNIT3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PKG_UNIT3 == null) {
			l_PKG_UNIT3 = new ArrayList();
		} else {
			l_PKG_UNIT3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PKG_UNIT3.add(((KR0010010Struct) list.get(i)).getPKG_UNIT3());
		}
		return size;
	}
	public int setL2L_SALES_DATE2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SALES_DATE2 == null) {
			l_SALES_DATE2 = new ArrayList();
		} else {
			l_SALES_DATE2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SALES_DATE2.add(((KR0010010Struct) list.get(i)).getSALES_DATE2());
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
			l_ROUND_TYP.add(((KR0010010Struct) list.get(i)).getROUND_TYP());
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
			l_SLIP_CD.add(((KR0010010Struct) list.get(i)).getSLIP_CD());
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
			l_CUST_CD.add(((KR0010010Struct) list.get(i)).getCUST_CD());
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
			l_CUST_ANAME.add(((KR0010010Struct) list.get(i)).getCUST_ANAME());
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
			l_INSPC_ACPT_TYP.add(((KR0010010Struct) list.get(i)).getINSPC_ACPT_TYP());
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
			l_CUST_ODR_NO.add(((KR0010010Struct) list.get(i)).getCUST_ODR_NO());
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
			l_SALES_DATE.add(((KR0010010Struct) list.get(i)).getSALES_DATE());
		}
		return size;
	}
	public int setL2L_SHIP_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SHIP_DATE == null) {
			l_SHIP_DATE = new ArrayList();
		} else {
			l_SHIP_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SHIP_DATE.add(((KR0010010Struct) list.get(i)).getSHIP_DATE());
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
			l_SALES_DEPT_CD.add(((KR0010010Struct) list.get(i)).getSALES_DEPT_CD());
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
			l_ORG_NAME.add(((KR0010010Struct) list.get(i)).getORG_NAME());
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
			l_CUST_CHRG_PSN_CD.add(((KR0010010Struct) list.get(i)).getCUST_CHRG_PSN_CD());
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
			l_USER_NAME.add(((KR0010010Struct) list.get(i)).getUSER_NAME());
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
			l_ITEM_CD.add(((KR0010010Struct) list.get(i)).getITEM_CD());
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
			l_ITEM_NAME.add(((KR0010010Struct) list.get(i)).getITEM_NAME());
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
			l_CUST_ITEM_CD.add(((KR0010010Struct) list.get(i)).getCUST_ITEM_CD());
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
			l_SALES_QTY.add(((KR0010010Struct) list.get(i)).getSALES_QTY());
		}
		return size;
	}
	public int setL2L_SHIP_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SHIP_QTY == null) {
			l_SHIP_QTY = new ArrayList();
		} else {
			l_SHIP_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SHIP_QTY.add(((KR0010010Struct) list.get(i)).getSHIP_QTY());
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
			l_SALES_UNIT_PRICE.add(((KR0010010Struct) list.get(i)).getSALES_UNIT_PRICE());
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
			l_SALES_AMOUNT.add(((KR0010010Struct) list.get(i)).getSALES_AMOUNT());
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
			l_CUR_UNIT.add(((KR0010010Struct) list.get(i)).getCUR_UNIT());
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
			l_REMARKS.add(((KR0010010Struct) list.get(i)).getREMARKS());
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
			l_STATUS.add(((KR0010010Struct) list.get(i)).getSTATUS());
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
			l_MODIFY_COUNT.add(((KR0010010Struct) list.get(i)).getMODIFY_COUNT());
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
			l_AI_AR_IF_FLG.add(((KR0010010Struct) list.get(i)).getAI_AR_IF_FLG());
		}
		return size;
	}
	public int setL2L_PKG_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PKG_UNIT == null) {
			l_PKG_UNIT = new ArrayList();
		} else {
			l_PKG_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PKG_UNIT.add(((KR0010010Struct) list.get(i)).getPKG_UNIT());
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
			l_ODR_NO.add(((KR0010010Struct) list.get(i)).getODR_NO());
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
			l_PART_DLV_SEQ_NO.add(((KR0010010Struct) list.get(i)).getPART_DLV_SEQ_NO());
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
			l_DESINATED_DLV_DATE.add(((KR0010010Struct) list.get(i)).getDESINATED_DLV_DATE());
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
			l_ODR_ACPT_DATE.add(((KR0010010Struct) list.get(i)).getODR_ACPT_DATE());
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
			l_ODR_QTY.add(((KR0010010Struct) list.get(i)).getODR_QTY());
		}
		return size;
	}
	public int setL2L_SHIP_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SHIP_ODR_NO == null) {
			l_SHIP_ODR_NO = new ArrayList();
		} else {
			l_SHIP_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SHIP_ODR_NO.add(((KR0010010Struct) list.get(i)).getSHIP_ODR_NO());
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
			l_UNIT_QTY_TYP.add(((KR0010010Struct) list.get(i)).getUNIT_QTY_TYP());
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
			l_CUST_ITEM_NAME.add(((KR0010010Struct) list.get(i)).getCUST_ITEM_NAME());
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
			l_OPTION_ID.add(((KR0010010Struct) list.get(i)).getOPTION_ID());
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
			l_COMPANY_CD.add(((KR0010010Struct) list.get(i)).getCOMPANY_CD());
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
			l_CUR_CD.add(((KR0010010Struct) list.get(i)).getCUR_CD());
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
			l_EXCH_TYP.add(((KR0010010Struct) list.get(i)).getEXCH_TYP());
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
			l_TAX_CD.add(((KR0010010Struct) list.get(i)).getTAX_CD());
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
			l_DETAIL_ROUND_TYP.add(((KR0010010Struct) list.get(i)).getDETAIL_ROUND_TYP());
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
			l_TAX_APPLY_TYP.add(((KR0010010Struct) list.get(i)).getTAX_APPLY_TYP());
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
			l_ORG_CD.add(((KR0010010Struct) list.get(i)).getORG_CD());
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
			l_USER_CD.add(((KR0010010Struct) list.get(i)).getUSER_CD());
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
			l_DECIMAL_FIG.add(((KR0010010Struct) list.get(i)).getDECIMAL_FIG());
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
			l_STOCK_UNIT.add(((KR0010010Struct) list.get(i)).getSTOCK_UNIT());
		}
		return size;
	}
	public int setL2L_PVC2SHUBETU(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PVC2SHUBETU == null) {
			l_PVC2SHUBETU = new ArrayList();
		} else {
			l_PVC2SHUBETU.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PVC2SHUBETU.add(((KR0010010Struct) list.get(i)).getPVC2SHUBETU());
		}
		return size;
	}
	public int setL2L_PVC2ORGSLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PVC2ORGSLIP_CD == null) {
			l_PVC2ORGSLIP_CD = new ArrayList();
		} else {
			l_PVC2ORGSLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PVC2ORGSLIP_CD.add(((KR0010010Struct) list.get(i)).getPVC2ORGSLIP_CD());
		}
		return size;
	}
	public int setL2L_PVC2REDSLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PVC2REDSLIP_CD == null) {
			l_PVC2REDSLIP_CD = new ArrayList();
		} else {
			l_PVC2REDSLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PVC2REDSLIP_CD.add(((KR0010010Struct) list.get(i)).getPVC2REDSLIP_CD());
		}
		return size;
	}
	public int setL2L_PVC2BLKSLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PVC2BLKSLIP_CD == null) {
			l_PVC2BLKSLIP_CD = new ArrayList();
		} else {
			l_PVC2BLKSLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PVC2BLKSLIP_CD.add(((KR0010010Struct) list.get(i)).getPVC2BLKSLIP_CD());
		}
		return size;
	}
	public int setL2L_PVC2RESULT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PVC2RESULT == null) {
			l_PVC2RESULT = new ArrayList();
		} else {
			l_PVC2RESULT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PVC2RESULT.add(((KR0010010Struct) list.get(i)).getPVC2RESULT());
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
			l_TAX_RATE_1.add(((KR0010010Struct) list.get(i)).getTAX_RATE_1());
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
			l_TAX_RATE_2.add(((KR0010010Struct) list.get(i)).getTAX_RATE_2());
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
			l_TAX_RATE_3.add(((KR0010010Struct) list.get(i)).getTAX_RATE_3());
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
			l_TAX_ROUND_TYP.add(((KR0010010Struct) list.get(i)).getTAX_ROUND_TYP());
		}
		return size;
	}
	public int setL2L_SALES_AMOUNT_EXCH_RATES(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SALES_AMOUNT_EXCH_RATES == null) {
			l_SALES_AMOUNT_EXCH_RATES = new ArrayList();
		} else {
			l_SALES_AMOUNT_EXCH_RATES.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SALES_AMOUNT_EXCH_RATES.add(((KR0010010Struct) list.get(i)).getSALES_AMOUNT_EXCH_RATES());
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
			l_INSPC_ACPT_DATE.add(((KR0010010Struct) list.get(i)).getINSPC_ACPT_DATE());
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
			l_INSPC_ACPT_QTY.add(((KR0010010Struct) list.get(i)).getINSPC_ACPT_QTY());
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
			l_EXTERNAL_TAX_SALES_AMOUNT.add(((KR0010010Struct) list.get(i)).getEXTERNAL_TAX_SALES_AMOUNT());
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
			l_INTERNAL_TAX_SALES_AMOUNT.add(((KR0010010Struct) list.get(i)).getINTERNAL_TAX_SALES_AMOUNT());
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
			l_TAXFREE_SALES_AMOUNT.add(((KR0010010Struct) list.get(i)).getTAXFREE_SALES_AMOUNT());
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
			l_TAX_CREDIT_SALES_AMOUNT.add(((KR0010010Struct) list.get(i)).getTAX_CREDIT_SALES_AMOUNT());
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
			l_EXTERNAL_TAX_AMOUNT.add(((KR0010010Struct) list.get(i)).getEXTERNAL_TAX_AMOUNT());
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
			l_INTERNAL_TAX_AMOUNT.add(((KR0010010Struct) list.get(i)).getINTERNAL_TAX_AMOUNT());
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
			l_TAX_AMOUNT_1.add(((KR0010010Struct) list.get(i)).getTAX_AMOUNT_1());
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
			l_TAX_AMOUNT_2.add(((KR0010010Struct) list.get(i)).getTAX_AMOUNT_2());
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
			l_TAX_AMOUNT_3.add(((KR0010010Struct) list.get(i)).getTAX_AMOUNT_3());
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
			l_OWN_CUR_TAXCREDIT_SALES_AMOUNT.add(((KR0010010Struct) list.get(i)).getOWN_CUR_TAXCREDIT_SALES_AMOUNT());
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
			l_APPR_FLG.add(((KR0010010Struct) list.get(i)).getAPPR_FLG());
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
			l_APPR_ID.add(((KR0010010Struct) list.get(i)).getAPPR_ID());
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
			l_APPR_DATE.add(((KR0010010Struct) list.get(i)).getAPPR_DATE());
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
			l_EXCH_RATE.add(((KR0010010Struct) list.get(i)).getEXCH_RATE());
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
			l_ORG_SLIP_CD.add(((KR0010010Struct) list.get(i)).getORG_SLIP_CD());
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
			l_BUSINESS_OPR_DATE.add(((KR0010010Struct) list.get(i)).getBUSINESS_OPR_DATE());
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
			l_PLANT_CD.add(((KR0010010Struct) list.get(i)).getPLANT_CD());
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
			l_SYS_CLASS_CODE.add(((KR0010010Struct) list.get(i)).getSYS_CLASS_CODE());
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
			l_h_INSTALL_FLG.add(((KR0010010Struct) list.get(i)).geth_INSTALL_FLG());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_h_SLIP_CD = null;
		m_INSPC_ACPT_TYP_DN = null;
		m_PKG_UNIT2 = null;
		m_CUR_UNIT2 = null;
		m_PKG_UNIT3 = null;
		m_SALES_DATE2 = null;
		m_ROUND_TYP = null;
		m_SLIP_CD = null;
		m_CUST_CD = null;
		m_CUST_ANAME = null;
		m_INSPC_ACPT_TYP = null;
		m_CUST_ODR_NO = null;
		m_SALES_DATE = null;
		m_SHIP_DATE = null;
		m_SALES_DEPT_CD = null;
		m_ORG_NAME = null;
		m_CUST_CHRG_PSN_CD = null;
		m_USER_NAME = null;
		m_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_CUST_ITEM_CD = null;
		m_SALES_QTY = null;
		m_SHIP_QTY = null;
		m_SALES_UNIT_PRICE = null;
		m_SALES_AMOUNT = null;
		m_CUR_UNIT = null;
		m_REMARKS = null;
		m_STATUS = null;
		m_MODIFY_COUNT = null;
		m_AI_AR_IF_FLG = null;
		m_PKG_UNIT = null;
		m_ODR_NO = null;
		m_PART_DLV_SEQ_NO = null;
		m_DESINATED_DLV_DATE = null;
		m_ODR_ACPT_DATE = null;
		m_ODR_QTY = null;
		m_SHIP_ODR_NO = null;
		m_UNIT_QTY_TYP = null;
		m_CUST_ITEM_NAME = null;
		m_OPTION_ID = null;
		m_COMPANY_CD = null;
		m_CUR_CD = null;
		m_EXCH_TYP = null;
		m_TAX_CD = null;
		m_DETAIL_ROUND_TYP = null;
		m_TAX_APPLY_TYP = null;
		m_ORG_CD = null;
		m_USER_CD = null;
		m_DECIMAL_FIG = null;
		m_STOCK_UNIT = null;
		m_PVC2SHUBETU = null;
		m_PVC2ORGSLIP_CD = null;
		m_PVC2REDSLIP_CD = null;
		m_PVC2BLKSLIP_CD = null;
		m_PVC2RESULT = null;
		m_TAX_RATE_1 = null;
		m_TAX_RATE_2 = null;
		m_TAX_RATE_3 = null;
		m_TAX_ROUND_TYP = null;
		m_SALES_AMOUNT_EXCH_RATES = null;
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
		m_APPR_FLG = null;
		m_APPR_ID = null;
		m_APPR_DATE = null;
		m_EXCH_RATE = null;
		m_ORG_SLIP_CD = null;
		m_BUSINESS_OPR_DATE = null;
		m_PLANT_CD = null;
		m_SYS_CLASS_CODE = null;
		m_h_INSTALL_FLG = null;

		l_h_SLIP_CD = null;
		l_INSPC_ACPT_TYP_DN = null;
		l_PKG_UNIT2 = null;
		l_CUR_UNIT2 = null;
		l_PKG_UNIT3 = null;
		l_SALES_DATE2 = null;
		l_ROUND_TYP = null;
		l_SLIP_CD = null;
		l_CUST_CD = null;
		l_CUST_ANAME = null;
		l_INSPC_ACPT_TYP = null;
		l_CUST_ODR_NO = null;
		l_SALES_DATE = null;
		l_SHIP_DATE = null;
		l_SALES_DEPT_CD = null;
		l_ORG_NAME = null;
		l_CUST_CHRG_PSN_CD = null;
		l_USER_NAME = null;
		l_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_CUST_ITEM_CD = null;
		l_SALES_QTY = null;
		l_SHIP_QTY = null;
		l_SALES_UNIT_PRICE = null;
		l_SALES_AMOUNT = null;
		l_CUR_UNIT = null;
		l_REMARKS = null;
		l_STATUS = null;
		l_MODIFY_COUNT = null;
		l_AI_AR_IF_FLG = null;
		l_PKG_UNIT = null;
		l_ODR_NO = null;
		l_PART_DLV_SEQ_NO = null;
		l_DESINATED_DLV_DATE = null;
		l_ODR_ACPT_DATE = null;
		l_ODR_QTY = null;
		l_SHIP_ODR_NO = null;
		l_UNIT_QTY_TYP = null;
		l_CUST_ITEM_NAME = null;
		l_OPTION_ID = null;
		l_COMPANY_CD = null;
		l_CUR_CD = null;
		l_EXCH_TYP = null;
		l_TAX_CD = null;
		l_DETAIL_ROUND_TYP = null;
		l_TAX_APPLY_TYP = null;
		l_ORG_CD = null;
		l_USER_CD = null;
		l_DECIMAL_FIG = null;
		l_STOCK_UNIT = null;
		l_PVC2SHUBETU = null;
		l_PVC2ORGSLIP_CD = null;
		l_PVC2REDSLIP_CD = null;
		l_PVC2BLKSLIP_CD = null;
		l_PVC2RESULT = null;
		l_TAX_RATE_1 = null;
		l_TAX_RATE_2 = null;
		l_TAX_RATE_3 = null;
		l_TAX_ROUND_TYP = null;
		l_SALES_AMOUNT_EXCH_RATES = null;
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
		l_APPR_FLG = null;
		l_APPR_ID = null;
		l_APPR_DATE = null;
		l_EXCH_RATE = null;
		l_ORG_SLIP_CD = null;
		l_BUSINESS_OPR_DATE = null;
		l_PLANT_CD = null;
		l_SYS_CLASS_CODE = null;
		l_h_INSTALL_FLG = null;

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
	 * medKR0010010クラスの標準コンストラクタ
	 */
	public KR0010010Struct()
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
	public void setStruct(KR0010010Struct struct)
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
	public void setStructM(KR0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.seth_SLIP_CD(struct.geth_SLIP_CD());
			this.setINSPC_ACPT_TYP_DN(struct.getINSPC_ACPT_TYP_DN());
			this.setPKG_UNIT2(struct.getPKG_UNIT2());
			this.setCUR_UNIT2(struct.getCUR_UNIT2());
			this.setPKG_UNIT3(struct.getPKG_UNIT3());
			this.setSALES_DATE2(struct.getSALES_DATE2());
			this.setROUND_TYP(struct.getROUND_TYP());
			this.setSLIP_CD(struct.getSLIP_CD());
			this.setCUST_CD(struct.getCUST_CD());
			this.setCUST_ANAME(struct.getCUST_ANAME());
			this.setINSPC_ACPT_TYP(struct.getINSPC_ACPT_TYP());
			this.setCUST_ODR_NO(struct.getCUST_ODR_NO());
			this.setSALES_DATE(struct.getSALES_DATE());
			this.setSHIP_DATE(struct.getSHIP_DATE());
			this.setSALES_DEPT_CD(struct.getSALES_DEPT_CD());
			this.setORG_NAME(struct.getORG_NAME());
			this.setCUST_CHRG_PSN_CD(struct.getCUST_CHRG_PSN_CD());
			this.setUSER_NAME(struct.getUSER_NAME());
			this.setITEM_CD(struct.getITEM_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setCUST_ITEM_CD(struct.getCUST_ITEM_CD());
			this.setSALES_QTY(struct.getSALES_QTY());
			this.setSHIP_QTY(struct.getSHIP_QTY());
			this.setSALES_UNIT_PRICE(struct.getSALES_UNIT_PRICE());
			this.setSALES_AMOUNT(struct.getSALES_AMOUNT());
			this.setCUR_UNIT(struct.getCUR_UNIT());
			this.setREMARKS(struct.getREMARKS());
			this.setSTATUS(struct.getSTATUS());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setAI_AR_IF_FLG(struct.getAI_AR_IF_FLG());
			this.setPKG_UNIT(struct.getPKG_UNIT());
			this.setODR_NO(struct.getODR_NO());
			this.setPART_DLV_SEQ_NO(struct.getPART_DLV_SEQ_NO());
			this.setDESINATED_DLV_DATE(struct.getDESINATED_DLV_DATE());
			this.setODR_ACPT_DATE(struct.getODR_ACPT_DATE());
			this.setODR_QTY(struct.getODR_QTY());
			this.setSHIP_ODR_NO(struct.getSHIP_ODR_NO());
			this.setUNIT_QTY_TYP(struct.getUNIT_QTY_TYP());
			this.setCUST_ITEM_NAME(struct.getCUST_ITEM_NAME());
			this.setOPTION_ID(struct.getOPTION_ID());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setCUR_CD(struct.getCUR_CD());
			this.setEXCH_TYP(struct.getEXCH_TYP());
			this.setTAX_CD(struct.getTAX_CD());
			this.setDETAIL_ROUND_TYP(struct.getDETAIL_ROUND_TYP());
			this.setTAX_APPLY_TYP(struct.getTAX_APPLY_TYP());
			this.setORG_CD(struct.getORG_CD());
			this.setUSER_CD(struct.getUSER_CD());
			this.setDECIMAL_FIG(struct.getDECIMAL_FIG());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setPVC2SHUBETU(struct.getPVC2SHUBETU());
			this.setPVC2ORGSLIP_CD(struct.getPVC2ORGSLIP_CD());
			this.setPVC2REDSLIP_CD(struct.getPVC2REDSLIP_CD());
			this.setPVC2BLKSLIP_CD(struct.getPVC2BLKSLIP_CD());
			this.setPVC2RESULT(struct.getPVC2RESULT());
			this.setTAX_RATE_1(struct.getTAX_RATE_1());
			this.setTAX_RATE_2(struct.getTAX_RATE_2());
			this.setTAX_RATE_3(struct.getTAX_RATE_3());
			this.setTAX_ROUND_TYP(struct.getTAX_ROUND_TYP());
			this.setSALES_AMOUNT_EXCH_RATES(struct.getSALES_AMOUNT_EXCH_RATES());
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
			this.setAPPR_FLG(struct.getAPPR_FLG());
			this.setAPPR_ID(struct.getAPPR_ID());
			this.setAPPR_DATE(struct.getAPPR_DATE());
			this.setEXCH_RATE(struct.getEXCH_RATE());
			this.setORG_SLIP_CD(struct.getORG_SLIP_CD());
			this.setBUSINESS_OPR_DATE(struct.getBUSINESS_OPR_DATE());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setSYS_CLASS_CODE(struct.getSYS_CLASS_CODE());
			this.seth_INSTALL_FLG(struct.geth_INSTALL_FLG());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(KR0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_h_SLIP_CD(struct.getList_h_SLIP_CD());
			this.setList_INSPC_ACPT_TYP_DN(struct.getList_INSPC_ACPT_TYP_DN());
			this.setList_PKG_UNIT2(struct.getList_PKG_UNIT2());
			this.setList_CUR_UNIT2(struct.getList_CUR_UNIT2());
			this.setList_PKG_UNIT3(struct.getList_PKG_UNIT3());
			this.setList_SALES_DATE2(struct.getList_SALES_DATE2());
			this.setList_ROUND_TYP(struct.getList_ROUND_TYP());
			this.setList_SLIP_CD(struct.getList_SLIP_CD());
			this.setList_CUST_CD(struct.getList_CUST_CD());
			this.setList_CUST_ANAME(struct.getList_CUST_ANAME());
			this.setList_INSPC_ACPT_TYP(struct.getList_INSPC_ACPT_TYP());
			this.setList_CUST_ODR_NO(struct.getList_CUST_ODR_NO());
			this.setList_SALES_DATE(struct.getList_SALES_DATE());
			this.setList_SHIP_DATE(struct.getList_SHIP_DATE());
			this.setList_SALES_DEPT_CD(struct.getList_SALES_DEPT_CD());
			this.setList_ORG_NAME(struct.getList_ORG_NAME());
			this.setList_CUST_CHRG_PSN_CD(struct.getList_CUST_CHRG_PSN_CD());
			this.setList_USER_NAME(struct.getList_USER_NAME());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_CUST_ITEM_CD(struct.getList_CUST_ITEM_CD());
			this.setList_SALES_QTY(struct.getList_SALES_QTY());
			this.setList_SHIP_QTY(struct.getList_SHIP_QTY());
			this.setList_SALES_UNIT_PRICE(struct.getList_SALES_UNIT_PRICE());
			this.setList_SALES_AMOUNT(struct.getList_SALES_AMOUNT());
			this.setList_CUR_UNIT(struct.getList_CUR_UNIT());
			this.setList_REMARKS(struct.getList_REMARKS());
			this.setList_STATUS(struct.getList_STATUS());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_AI_AR_IF_FLG(struct.getList_AI_AR_IF_FLG());
			this.setList_PKG_UNIT(struct.getList_PKG_UNIT());
			this.setList_ODR_NO(struct.getList_ODR_NO());
			this.setList_PART_DLV_SEQ_NO(struct.getList_PART_DLV_SEQ_NO());
			this.setList_DESINATED_DLV_DATE(struct.getList_DESINATED_DLV_DATE());
			this.setList_ODR_ACPT_DATE(struct.getList_ODR_ACPT_DATE());
			this.setList_ODR_QTY(struct.getList_ODR_QTY());
			this.setList_SHIP_ODR_NO(struct.getList_SHIP_ODR_NO());
			this.setList_UNIT_QTY_TYP(struct.getList_UNIT_QTY_TYP());
			this.setList_CUST_ITEM_NAME(struct.getList_CUST_ITEM_NAME());
			this.setList_OPTION_ID(struct.getList_OPTION_ID());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_CUR_CD(struct.getList_CUR_CD());
			this.setList_EXCH_TYP(struct.getList_EXCH_TYP());
			this.setList_TAX_CD(struct.getList_TAX_CD());
			this.setList_DETAIL_ROUND_TYP(struct.getList_DETAIL_ROUND_TYP());
			this.setList_TAX_APPLY_TYP(struct.getList_TAX_APPLY_TYP());
			this.setList_ORG_CD(struct.getList_ORG_CD());
			this.setList_USER_CD(struct.getList_USER_CD());
			this.setList_DECIMAL_FIG(struct.getList_DECIMAL_FIG());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_PVC2SHUBETU(struct.getList_PVC2SHUBETU());
			this.setList_PVC2ORGSLIP_CD(struct.getList_PVC2ORGSLIP_CD());
			this.setList_PVC2REDSLIP_CD(struct.getList_PVC2REDSLIP_CD());
			this.setList_PVC2BLKSLIP_CD(struct.getList_PVC2BLKSLIP_CD());
			this.setList_PVC2RESULT(struct.getList_PVC2RESULT());
			this.setList_TAX_RATE_1(struct.getList_TAX_RATE_1());
			this.setList_TAX_RATE_2(struct.getList_TAX_RATE_2());
			this.setList_TAX_RATE_3(struct.getList_TAX_RATE_3());
			this.setList_TAX_ROUND_TYP(struct.getList_TAX_ROUND_TYP());
			this.setList_SALES_AMOUNT_EXCH_RATES(struct.getList_SALES_AMOUNT_EXCH_RATES());
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
			this.setList_APPR_FLG(struct.getList_APPR_FLG());
			this.setList_APPR_ID(struct.getList_APPR_ID());
			this.setList_APPR_DATE(struct.getList_APPR_DATE());
			this.setList_EXCH_RATE(struct.getList_EXCH_RATE());
			this.setList_ORG_SLIP_CD(struct.getList_ORG_SLIP_CD());
			this.setList_BUSINESS_OPR_DATE(struct.getList_BUSINESS_OPR_DATE());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_SYS_CLASS_CODE(struct.getList_SYS_CLASS_CODE());
			this.setList_h_INSTALL_FLG(struct.getList_h_INSTALL_FLG());
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
	// 第 1 変数初期値： i_h_SLIP_CD


	final static String i_h_SLIP_CD = null;

	// 第 2 変数初期値： i_INSPC_ACPT_TYP_DN


	final static String i_INSPC_ACPT_TYP_DN = null;

	// 第 3 変数初期値： i_PKG_UNIT2


	final static String i_PKG_UNIT2 = null;

	// 第 4 変数初期値： i_CUR_UNIT2


	final static String i_CUR_UNIT2 = null;

	// 第 5 変数初期値： i_PKG_UNIT3


	final static String i_PKG_UNIT3 = null;

	// 第 6 変数初期値： i_SALES_DATE2


	final static String i_SALES_DATE2 = null;

	// 第 7 変数初期値： i_ROUND_TYP


	final static String i_ROUND_TYP = null;

	// 第 8 変数初期値： i_SLIP_CD


	final static String i_SLIP_CD = null;

	// 第 9 変数初期値： i_CUST_CD


	final static String i_CUST_CD = null;

	// 第 10 変数初期値： i_CUST_ANAME


	final static String i_CUST_ANAME = null;

	// 第 11 変数初期値： i_INSPC_ACPT_TYP


	final static String i_INSPC_ACPT_TYP = null;

	// 第 12 変数初期値： i_CUST_ODR_NO


	final static String i_CUST_ODR_NO = null;

	// 第 13 変数初期値： i_SALES_DATE


	final static String i_SALES_DATE = null;

	// 第 14 変数初期値： i_SHIP_DATE


	final static String i_SHIP_DATE = null;

	// 第 15 変数初期値： i_SALES_DEPT_CD


	final static String i_SALES_DEPT_CD = null;

	// 第 16 変数初期値： i_ORG_NAME


	final static String i_ORG_NAME = null;

	// 第 17 変数初期値： i_CUST_CHRG_PSN_CD


	final static String i_CUST_CHRG_PSN_CD = null;

	// 第 18 変数初期値： i_USER_NAME


	final static String i_USER_NAME = null;

	// 第 19 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 20 変数初期値： i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// 第 21 変数初期値： i_CUST_ITEM_CD


	final static String i_CUST_ITEM_CD = null;

	// 第 22 変数初期値： i_SALES_QTY


	final static String i_SALES_QTY = null;

	// 第 23 変数初期値： i_SHIP_QTY


	final static String i_SHIP_QTY = null;

	// 第 24 変数初期値： i_SALES_UNIT_PRICE


	final static String i_SALES_UNIT_PRICE = null;

	// 第 25 変数初期値： i_SALES_AMOUNT


	final static String i_SALES_AMOUNT = null;

	// 第 26 変数初期値： i_CUR_UNIT


	final static String i_CUR_UNIT = null;

	// 第 27 変数初期値： i_REMARKS


	final static String i_REMARKS = null;

	// 第 28 変数初期値： i_STATUS


	final static String i_STATUS = null;

	// 第 29 変数初期値： i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// 第 30 変数初期値： i_AI_AR_IF_FLG


	final static String i_AI_AR_IF_FLG = null;

	// 第 31 変数初期値： i_PKG_UNIT


	final static String i_PKG_UNIT = null;

	// 第 32 変数初期値： i_ODR_NO


	final static String i_ODR_NO = null;

	// 第 33 変数初期値： i_PART_DLV_SEQ_NO


	final static String i_PART_DLV_SEQ_NO = null;

	// 第 34 変数初期値： i_DESINATED_DLV_DATE


	final static String i_DESINATED_DLV_DATE = null;

	// 第 35 変数初期値： i_ODR_ACPT_DATE


	final static String i_ODR_ACPT_DATE = null;

	// 第 36 変数初期値： i_ODR_QTY


	final static String i_ODR_QTY = null;

	// 第 37 変数初期値： i_SHIP_ODR_NO


	final static String i_SHIP_ODR_NO = null;

	// 第 38 変数初期値： i_UNIT_QTY_TYP


	final static String i_UNIT_QTY_TYP = null;

	// 第 39 変数初期値： i_CUST_ITEM_NAME


	final static String i_CUST_ITEM_NAME = null;

	// 第 40 変数初期値： i_OPTION_ID


	final static String i_OPTION_ID = null;

	// 第 41 変数初期値： i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// 第 42 変数初期値： i_CUR_CD


	final static String i_CUR_CD = null;

	// 第 43 変数初期値： i_EXCH_TYP


	final static String i_EXCH_TYP = null;

	// 第 44 変数初期値： i_TAX_CD


	final static String i_TAX_CD = null;

	// 第 45 変数初期値： i_DETAIL_ROUND_TYP


	final static String i_DETAIL_ROUND_TYP = null;

	// 第 46 変数初期値： i_TAX_APPLY_TYP


	final static String i_TAX_APPLY_TYP = null;

	// 第 47 変数初期値： i_ORG_CD


	final static String i_ORG_CD = null;

	// 第 48 変数初期値： i_USER_CD


	final static String i_USER_CD = null;

	// 第 49 変数初期値： i_DECIMAL_FIG


	final static String i_DECIMAL_FIG = null;

	// 第 50 変数初期値： i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// 第 51 変数初期値： i_PVC2SHUBETU


	final static String i_PVC2SHUBETU = null;

	// 第 52 変数初期値： i_PVC2ORGSLIP_CD


	final static String i_PVC2ORGSLIP_CD = null;

	// 第 53 変数初期値： i_PVC2REDSLIP_CD


	final static String i_PVC2REDSLIP_CD = null;

	// 第 54 変数初期値： i_PVC2BLKSLIP_CD


	final static String i_PVC2BLKSLIP_CD = null;

	// 第 55 変数初期値： i_PVC2RESULT


	final static String i_PVC2RESULT = null;

	// 第 56 変数初期値： i_TAX_RATE_1


	final static String i_TAX_RATE_1 = null;

	// 第 57 変数初期値： i_TAX_RATE_2


	final static String i_TAX_RATE_2 = null;

	// 第 58 変数初期値： i_TAX_RATE_3


	final static String i_TAX_RATE_3 = null;

	// 第 59 変数初期値： i_TAX_ROUND_TYP


	final static String i_TAX_ROUND_TYP = null;

	// 第 60 変数初期値： i_SALES_AMOUNT_EXCH_RATES


	final static String i_SALES_AMOUNT_EXCH_RATES = null;

	// 第 61 変数初期値： i_INSPC_ACPT_DATE


	final static String i_INSPC_ACPT_DATE = null;

	// 第 62 変数初期値： i_INSPC_ACPT_QTY


	final static String i_INSPC_ACPT_QTY = null;

	// 第 63 変数初期値： i_EXTERNAL_TAX_SALES_AMOUNT


	final static String i_EXTERNAL_TAX_SALES_AMOUNT = null;

	// 第 64 変数初期値： i_INTERNAL_TAX_SALES_AMOUNT


	final static String i_INTERNAL_TAX_SALES_AMOUNT = null;

	// 第 65 変数初期値： i_TAXFREE_SALES_AMOUNT


	final static String i_TAXFREE_SALES_AMOUNT = null;

	// 第 66 変数初期値： i_TAX_CREDIT_SALES_AMOUNT


	final static String i_TAX_CREDIT_SALES_AMOUNT = null;

	// 第 67 変数初期値： i_EXTERNAL_TAX_AMOUNT


	final static String i_EXTERNAL_TAX_AMOUNT = null;

	// 第 68 変数初期値： i_INTERNAL_TAX_AMOUNT


	final static String i_INTERNAL_TAX_AMOUNT = null;

	// 第 69 変数初期値： i_TAX_AMOUNT_1


	final static String i_TAX_AMOUNT_1 = null;

	// 第 70 変数初期値： i_TAX_AMOUNT_2


	final static String i_TAX_AMOUNT_2 = null;

	// 第 71 変数初期値： i_TAX_AMOUNT_3


	final static String i_TAX_AMOUNT_3 = null;

	// 第 72 変数初期値： i_OWN_CUR_TAXCREDIT_SALES_AMOUNT


	final static String i_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;

	// 第 73 変数初期値： i_APPR_FLG


	final static String i_APPR_FLG = null;

	// 第 74 変数初期値： i_APPR_ID


	final static String i_APPR_ID = null;

	// 第 75 変数初期値： i_APPR_DATE


	final static String i_APPR_DATE = null;

	// 第 76 変数初期値： i_EXCH_RATE


	final static String i_EXCH_RATE = null;

	// 第 77 変数初期値： i_ORG_SLIP_CD


	final static String i_ORG_SLIP_CD = null;

	// 第 78 変数初期値： i_BUSINESS_OPR_DATE


	final static String i_BUSINESS_OPR_DATE = null;

	// 第 79 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

	// 第 80 変数初期値： i_SYS_CLASS_CODE


	final static String i_SYS_CLASS_CODE = null;

	// 第 81 変数初期値： i_h_INSTALL_FLG


	final static String i_h_INSTALL_FLG = null;

*/

	//{{user_implement_code
         // TODO: 初期化で使う定数は、ここに記述してください。
         // 以下に記述した内容は自動的には変更されません。
        // 第 1 変数初期値： i_SLIP_CD
        final static String i_SLIP_CD = null;
        // 第 2 変数初期値： i_h_SLIP_CD
        final static String i_h_SLIP_CD = null;
        // 第 3 変数初期値： i_CUST_CD
        final static String i_CUST_CD = null;
        // 第 4 変数初期値： i_CUST_ANAME
        final static String i_CUST_ANAME = null;
        // 第 5 変数初期値： i_INSPC_ACPT_TYP_DN
        final static String i_INSPC_ACPT_TYP_DN = null;
        // 第 6 変数初期値： i_INSPC_ACPT_TYP
        final static String i_INSPC_ACPT_TYP = null;
        // 第 7 変数初期値： i_CUST_ODR_NO
        final static String i_CUST_ODR_NO = null;
        // 第 8 変数初期値： i_SALES_DATE
        final static String i_SALES_DATE = null;
        // 第 9 変数初期値： i_SHIP_DATE
        final static String i_SHIP_DATE = null;
        // 第 10 変数初期値： i_SALES_DEPT_CD
        final static String i_SALES_DEPT_CD = null;
        // 第 11 変数初期値： i_ORG_NAME
        final static String i_ORG_NAME = null;
        // 第 12 変数初期値： i_CUST_CHRG_PSN_CD
        final static String i_CUST_CHRG_PSN_CD = null;
        // 第 13 変数初期値： i_USER_NAME
        final static String i_USER_NAME = null;
        // 第 14 変数初期値： i_ITEM_CD
        final static String i_ITEM_CD = null;
        // 第 15 変数初期値： i_ITEM_NAME
        final static String i_ITEM_NAME = null;
        // 第 16 変数初期値： i_CUST_ITEM_CD
        final static String i_CUST_ITEM_CD = null;
        // 第 17 変数初期値： i_SALES_QTY
        final static String i_SALES_QTY = null;
        // 第 18 変数初期値： i_SHIP_QTY
        final static String i_SHIP_QTY = null;
        // 第 19 変数初期値： i_SALES_UNIT_PRICE
        final static String i_SALES_UNIT_PRICE = null;
        // 第 20 変数初期値： i_SALES_AMOUNT
        final static String i_SALES_AMOUNT = null;
        // 第 21 変数初期値： i_CUR_UNIT
        final static String i_CUR_UNIT = null;
        // 第 22 変数初期値： i_REMARKS
        final static String i_REMARKS = null;
       
        /**
         * 初期化
         *
         */
        public void initialize()
        {
       
         clear();
        }
       
         // TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
