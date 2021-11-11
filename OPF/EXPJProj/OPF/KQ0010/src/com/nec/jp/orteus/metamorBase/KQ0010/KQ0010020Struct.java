/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KQ0010/src/com/nec/jp/orteus/metamorBase/KQ0010/KQ0010020Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.KQ0010;

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

public class KQ0010020Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_SPCL_PRICE_TYP_name */
	public String m_SPCL_PRICE_TYP_name = null;
	/** 第 2 変数： m_SPCL_PRICE_TYP_val */
	public String m_SPCL_PRICE_TYP_val = null;
	/** 第 3 変数： m_h_ODR_QTY */
	public String m_h_ODR_QTY = null;
	/** 第 4 変数： m_h_DESINATED_DLV_DATE */
	public String m_h_DESINATED_DLV_DATE = null;
	/** 第 5 変数： m_h_SPCL_PRICE_TYP */
	public String m_h_SPCL_PRICE_TYP = null;
	/** 第 6 変数： m_h_CUS_DLV_KEY_CD */
	public String m_h_CUS_DLV_KEY_CD = null;
	/** 第 7 変数： m_h_CUS_DLV_CD */
	public String m_h_CUS_DLV_CD = null;
	/** 第 8 変数： m_h_DLV_LOC_CD */
	public String m_h_DLV_LOC_CD = null;
	/** 第 9 変数： m_APPR_REMARKS */
	public String m_APPR_REMARKS = null;
	/** 第 10 変数： m_h_APR_ODR */
	public String m_h_APR_ODR = null;
	/** 第 11 変数： m_ODR_UNIT_PRICE */
	public String m_ODR_UNIT_PRICE = null;
	/** 第 12 変数： m_SPCL_PRICE_TYP */
	public String m_SPCL_PRICE_TYP = null;
	/** 第 13 変数： m_DESINATED_DLV_DATE */
	public String m_DESINATED_DLV_DATE = null;
	/** 第 14 変数： m_STD_DESINATED_RCV_DATE */
	public String m_STD_DESINATED_RCV_DATE = null;
	/** 第 15 変数： m_ODR_QTY */
	public String m_ODR_QTY = null;
	/** 第 16 変数： m_UNCONFIRM_ODR_BALANCE */
	public Double m_UNCONFIRM_ODR_BALANCE = null;
	/** 第 17 変数： m_ODR_AMOUNT */
	public Double m_ODR_AMOUNT = null;
	/** 第 18 変数： m_ODR_AMOUNT_EXCH_RATES */
	public Double m_ODR_AMOUNT_EXCH_RATES = null;
	/** 第 19 変数： m_CUS_DLV_CD */
	public String m_CUS_DLV_CD = null;
	/** 第 20 変数： m_CUS_DLV_KEY_CD */
	public String m_CUS_DLV_KEY_CD = null;
	/** 第 21 変数： m_h_REMAIN_UNCONFIRM_ODR_QTY */
	public String m_h_REMAIN_UNCONFIRM_ODR_QTY = null;
	/** 第 22 変数： m_CANCELED_UNCONFIRM_ODR_QTY */
	public String m_CANCELED_UNCONFIRM_ODR_QTY = null;
	/** 第 23 変数： m_h_SHIP_PLAN_REMAIN_QTY */
	public String m_h_SHIP_PLAN_REMAIN_QTY = null;
	/** 第 24 変数： m_SHIP_PLAN_CMPLT_FLG */
	public String m_SHIP_PLAN_CMPLT_FLG = null;
	/** 第 25 変数： m_PUCH_ODR_QTY_TOTAL */
	public String m_PUCH_ODR_QTY_TOTAL = null;
	/** 第 26 変数： m_REMARKS */
	public String m_REMARKS = null;
	/** 第 27 変数： m_DLV_LOC_CD */
	public String m_DLV_LOC_CD = null;
	/** 第 28 変数： m_DLV_LOC_NAME_KANJI */
	public String m_DLV_LOC_NAME_KANJI = null;
	/** 第 29 変数： m_CUST_ODR_NO */
	public String m_CUST_ODR_NO = null;
	/** 第 30 変数： m_h_ODR_NO */
	public String m_h_ODR_NO = null;
	/** 第 31 変数： m_RSLT_CTL_SEQ_CD */
	public String m_RSLT_CTL_SEQ_CD = null;
	/** 第 32 変数： m_ODR_CTL_NO */
	public String m_ODR_CTL_NO = null;
	/** 第 33 変数： m_h_ODR_TYP */
	public String m_h_ODR_TYP = null;
	/** 第 34 変数： m_CUST_CD */
	public String m_CUST_CD = null;
	/** 第 35 変数： m_CUST_ITEM_CD */
	public String m_CUST_ITEM_CD = null;
	/** 第 36 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 37 変数： m_UNIT_CD */
	public String m_UNIT_CD = null;
	/** 第 38 変数： m_CURRNCY_CD */
	public String m_CURRNCY_CD = null;
	/** 第 39 変数： m_DEPO_TYP */
	public String m_DEPO_TYP = null;
	/** 第 40 変数： m_CUST_CHRG_PSN_CD */
	public String m_CUST_CHRG_PSN_CD = null;
	/** 第 41 変数： m_ODR_ACPT_PSN_CD */
	public String m_ODR_ACPT_PSN_CD = null;
	/** 第 42 変数： m_ODR_ACPT_DATE */
	public String m_ODR_ACPT_DATE = null;
	/** 第 43 変数： m_fkgnALCTED_UNCONFIRM_ODR_NO */
	public String m_fkgnALCTED_UNCONFIRM_ODR_NO = null;
	/** 第 44 変数： m_fkgnALCTED_UNCONFIRM_ODR_QTY */
	public Double m_fkgnALCTED_UNCONFIRM_ODR_QTY = null;
	/** 第 45 変数： m_fkgnALCTED_SEQ_CD */
	public String m_fkgnALCTED_SEQ_CD = null;
	/** 第 46 変数： m_fkgnREMAIN_UNCONFIRM_ODR_QTY */
	public Double m_fkgnREMAIN_UNCONFIRM_ODR_QTY = null;
	/** 第 47 変数： m_fkgnODR_UNIT_PRICE */
	public Double m_fkgnODR_UNIT_PRICE = null;
	/** 第 48 変数： m_fkgnCURRNCY_CD */
	public String m_fkgnCURRNCY_CD = null;
	/** 第 49 変数： m_fkgnODR_QTY */
	public Double m_fkgnODR_QTY = null;
	/** 第 50 変数： m_fkgnODR_TYP */
	public String m_fkgnODR_TYP = null;
	/** 第 51 変数： m_fkgnFIXED_ODR_NO */
	public String m_fkgnFIXED_ODR_NO = null;
	/** 第 52 変数： m_fkgnDEL_FLG */
	public String m_fkgnDEL_FLG = null;
	/** 第 53 変数： m_fkgnUNCONFIRM_ODR_BALANCE */
	public Double m_fkgnUNCONFIRM_ODR_BALANCE = null;
	/** 第 54 変数： m_fkgnODR_NO */
	public String m_fkgnODR_NO = null;
	/** 第 55 変数： m_IF_CTL_NO */
	public String m_IF_CTL_NO = null;
	/** 第 56 変数： m_UNIT_NAME */
	public String m_UNIT_NAME = null;
	/** 第 57 変数： m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** 第 58 変数： m_CUST_ANAME */
	public String m_CUST_ANAME = null;
	/** 第 59 変数： m_EXCH_TYP */
	public String m_EXCH_TYP = null;
	/** 第 60 変数： m_DETAIL_ROUND_TYP */
	public String m_DETAIL_ROUND_TYP = null;
	/** 第 61 変数： m_CUST_ITEM_NAME */
	public String m_CUST_ITEM_NAME = null;
	/** 第 62 変数： m_ODR_TYP */
	public String m_ODR_TYP = null;
	/** 第 63 変数： m_CUST_CHRG_PSN_NAME */
	public String m_CUST_CHRG_PSN_NAME = null;
	/** 第 64 変数： m_CUST_CHRG_ORG_CD */
	public String m_CUST_CHRG_ORG_CD = null;
	/** 第 65 変数： m_CUST_CHRG_ORG_NAME */
	public String m_CUST_CHRG_ORG_NAME = null;
	/** 第 66 変数： m_h_MODIFY_COUNT */
	public String m_h_MODIFY_COUNT = null;
	/** 第 67 変数： m_h_ANS_DLV_DATE_EXIST_FLG */
	public String m_h_ANS_DLV_DATE_EXIST_FLG = null;
	/** 第 68 変数： m_h_T_SHIP_ODR_EXIST_FLG */
	public String m_h_T_SHIP_ODR_EXIST_FLG = null;
	/** 第 69 変数： m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** 第 70 変数： m_PKG_UNIT */
	public String m_PKG_UNIT = null;
	/** 第 71 変数： m_UNIT_QTY_TYP */
	public String m_UNIT_QTY_TYP = null;
	/** 第 72 変数： m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** 第 73 変数： m_h_ODR_UNIT_PRICE */
	public String m_h_ODR_UNIT_PRICE = null;
	/** 第 74 変数： m_h_BUSINESS_OPR_DATE */
	public String m_h_BUSINESS_OPR_DATE = null;
	/** 第 75 変数： m_DLV_LOC_NAME */
	public String m_DLV_LOC_NAME = null;
	/** 第 76 変数： m_ODR_NO */
	public String m_ODR_NO = null;
	/** 第 77 変数： m_REMAIN_UNCONFIRM_ODR_QTY */
	public String m_REMAIN_UNCONFIRM_ODR_QTY = null;
	/** 第 78 変数： m_BUSINESS_OPR_DATE */
	public String m_BUSINESS_OPR_DATE = null;
	/** 第 79 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** 第 80 変数： m_CODE */
	public String m_CODE = null;
	/** 第 81 変数： m_CLASS_CODE */
	public String m_CLASS_CODE = null;
	/** 第 82 変数： m_MAX_ALCTED_SEQ_CD */
	public Double m_MAX_ALCTED_SEQ_CD = null;
	/** 第 83 変数： m_MAX_ODR_NO */
	public String m_MAX_ODR_NO = null;
	/** 第 84 変数： m_h_ALCTED_UNCONFIRM_ODR_QTY */
	public String m_h_ALCTED_UNCONFIRM_ODR_QTY = null;
	/** 第 85 変数： m_IN_ODR_NO */
	public String m_IN_ODR_NO = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_SPCL_PRICE_TYP_name */
	public List l_SPCL_PRICE_TYP_name = null;

	/** 第 2 List変数： l_SPCL_PRICE_TYP_val */
	public List l_SPCL_PRICE_TYP_val = null;

	/** 第 3 List変数： l_h_ODR_QTY */
	public List l_h_ODR_QTY = null;

	/** 第 4 List変数： l_h_DESINATED_DLV_DATE */
	public List l_h_DESINATED_DLV_DATE = null;

	/** 第 5 List変数： l_h_SPCL_PRICE_TYP */
	public List l_h_SPCL_PRICE_TYP = null;

	/** 第 6 List変数： l_h_CUS_DLV_KEY_CD */
	public List l_h_CUS_DLV_KEY_CD = null;

	/** 第 7 List変数： l_h_CUS_DLV_CD */
	public List l_h_CUS_DLV_CD = null;

	/** 第 8 List変数： l_h_DLV_LOC_CD */
	public List l_h_DLV_LOC_CD = null;

	/** 第 9 List変数： l_APPR_REMARKS */
	public List l_APPR_REMARKS = null;

	/** 第 10 List変数： l_h_APR_ODR */
	public List l_h_APR_ODR = null;

	/** 第 11 List変数： l_ODR_UNIT_PRICE */
	public List l_ODR_UNIT_PRICE = null;

	/** 第 12 List変数： l_SPCL_PRICE_TYP */
	public List l_SPCL_PRICE_TYP = null;

	/** 第 13 List変数： l_DESINATED_DLV_DATE */
	public List l_DESINATED_DLV_DATE = null;

	/** 第 14 List変数： l_STD_DESINATED_RCV_DATE */
	public List l_STD_DESINATED_RCV_DATE = null;

	/** 第 15 List変数： l_ODR_QTY */
	public List l_ODR_QTY = null;

	/** 第 16 List変数： l_UNCONFIRM_ODR_BALANCE */
	public List l_UNCONFIRM_ODR_BALANCE = null;

	/** 第 17 List変数： l_ODR_AMOUNT */
	public List l_ODR_AMOUNT = null;

	/** 第 18 List変数： l_ODR_AMOUNT_EXCH_RATES */
	public List l_ODR_AMOUNT_EXCH_RATES = null;

	/** 第 19 List変数： l_CUS_DLV_CD */
	public List l_CUS_DLV_CD = null;

	/** 第 20 List変数： l_CUS_DLV_KEY_CD */
	public List l_CUS_DLV_KEY_CD = null;

	/** 第 21 List変数： l_h_REMAIN_UNCONFIRM_ODR_QTY */
	public List l_h_REMAIN_UNCONFIRM_ODR_QTY = null;

	/** 第 22 List変数： l_CANCELED_UNCONFIRM_ODR_QTY */
	public List l_CANCELED_UNCONFIRM_ODR_QTY = null;

	/** 第 23 List変数： l_h_SHIP_PLAN_REMAIN_QTY */
	public List l_h_SHIP_PLAN_REMAIN_QTY = null;

	/** 第 24 List変数： l_SHIP_PLAN_CMPLT_FLG */
	public List l_SHIP_PLAN_CMPLT_FLG = null;

	/** 第 25 List変数： l_PUCH_ODR_QTY_TOTAL */
	public List l_PUCH_ODR_QTY_TOTAL = null;

	/** 第 26 List変数： l_REMARKS */
	public List l_REMARKS = null;

	/** 第 27 List変数： l_DLV_LOC_CD */
	public List l_DLV_LOC_CD = null;

	/** 第 28 List変数： l_DLV_LOC_NAME_KANJI */
	public List l_DLV_LOC_NAME_KANJI = null;

	/** 第 29 List変数： l_CUST_ODR_NO */
	public List l_CUST_ODR_NO = null;

	/** 第 30 List変数： l_h_ODR_NO */
	public List l_h_ODR_NO = null;

	/** 第 31 List変数： l_RSLT_CTL_SEQ_CD */
	public List l_RSLT_CTL_SEQ_CD = null;

	/** 第 32 List変数： l_ODR_CTL_NO */
	public List l_ODR_CTL_NO = null;

	/** 第 33 List変数： l_h_ODR_TYP */
	public List l_h_ODR_TYP = null;

	/** 第 34 List変数： l_CUST_CD */
	public List l_CUST_CD = null;

	/** 第 35 List変数： l_CUST_ITEM_CD */
	public List l_CUST_ITEM_CD = null;

	/** 第 36 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 37 List変数： l_UNIT_CD */
	public List l_UNIT_CD = null;

	/** 第 38 List変数： l_CURRNCY_CD */
	public List l_CURRNCY_CD = null;

	/** 第 39 List変数： l_DEPO_TYP */
	public List l_DEPO_TYP = null;

	/** 第 40 List変数： l_CUST_CHRG_PSN_CD */
	public List l_CUST_CHRG_PSN_CD = null;

	/** 第 41 List変数： l_ODR_ACPT_PSN_CD */
	public List l_ODR_ACPT_PSN_CD = null;

	/** 第 42 List変数： l_ODR_ACPT_DATE */
	public List l_ODR_ACPT_DATE = null;

	/** 第 43 List変数： l_fkgnALCTED_UNCONFIRM_ODR_NO */
	public List l_fkgnALCTED_UNCONFIRM_ODR_NO = null;

	/** 第 44 List変数： l_fkgnALCTED_UNCONFIRM_ODR_QTY */
	public List l_fkgnALCTED_UNCONFIRM_ODR_QTY = null;

	/** 第 45 List変数： l_fkgnALCTED_SEQ_CD */
	public List l_fkgnALCTED_SEQ_CD = null;

	/** 第 46 List変数： l_fkgnREMAIN_UNCONFIRM_ODR_QTY */
	public List l_fkgnREMAIN_UNCONFIRM_ODR_QTY = null;

	/** 第 47 List変数： l_fkgnODR_UNIT_PRICE */
	public List l_fkgnODR_UNIT_PRICE = null;

	/** 第 48 List変数： l_fkgnCURRNCY_CD */
	public List l_fkgnCURRNCY_CD = null;

	/** 第 49 List変数： l_fkgnODR_QTY */
	public List l_fkgnODR_QTY = null;

	/** 第 50 List変数： l_fkgnODR_TYP */
	public List l_fkgnODR_TYP = null;

	/** 第 51 List変数： l_fkgnFIXED_ODR_NO */
	public List l_fkgnFIXED_ODR_NO = null;

	/** 第 52 List変数： l_fkgnDEL_FLG */
	public List l_fkgnDEL_FLG = null;

	/** 第 53 List変数： l_fkgnUNCONFIRM_ODR_BALANCE */
	public List l_fkgnUNCONFIRM_ODR_BALANCE = null;

	/** 第 54 List変数： l_fkgnODR_NO */
	public List l_fkgnODR_NO = null;

	/** 第 55 List変数： l_IF_CTL_NO */
	public List l_IF_CTL_NO = null;

	/** 第 56 List変数： l_UNIT_NAME */
	public List l_UNIT_NAME = null;

	/** 第 57 List変数： l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** 第 58 List変数： l_CUST_ANAME */
	public List l_CUST_ANAME = null;

	/** 第 59 List変数： l_EXCH_TYP */
	public List l_EXCH_TYP = null;

	/** 第 60 List変数： l_DETAIL_ROUND_TYP */
	public List l_DETAIL_ROUND_TYP = null;

	/** 第 61 List変数： l_CUST_ITEM_NAME */
	public List l_CUST_ITEM_NAME = null;

	/** 第 62 List変数： l_ODR_TYP */
	public List l_ODR_TYP = null;

	/** 第 63 List変数： l_CUST_CHRG_PSN_NAME */
	public List l_CUST_CHRG_PSN_NAME = null;

	/** 第 64 List変数： l_CUST_CHRG_ORG_CD */
	public List l_CUST_CHRG_ORG_CD = null;

	/** 第 65 List変数： l_CUST_CHRG_ORG_NAME */
	public List l_CUST_CHRG_ORG_NAME = null;

	/** 第 66 List変数： l_h_MODIFY_COUNT */
	public List l_h_MODIFY_COUNT = null;

	/** 第 67 List変数： l_h_ANS_DLV_DATE_EXIST_FLG */
	public List l_h_ANS_DLV_DATE_EXIST_FLG = null;

	/** 第 68 List変数： l_h_T_SHIP_ODR_EXIST_FLG */
	public List l_h_T_SHIP_ODR_EXIST_FLG = null;

	/** 第 69 List変数： l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** 第 70 List変数： l_PKG_UNIT */
	public List l_PKG_UNIT = null;

	/** 第 71 List変数： l_UNIT_QTY_TYP */
	public List l_UNIT_QTY_TYP = null;

	/** 第 72 List変数： l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** 第 73 List変数： l_h_ODR_UNIT_PRICE */
	public List l_h_ODR_UNIT_PRICE = null;

	/** 第 74 List変数： l_h_BUSINESS_OPR_DATE */
	public List l_h_BUSINESS_OPR_DATE = null;

	/** 第 75 List変数： l_DLV_LOC_NAME */
	public List l_DLV_LOC_NAME = null;

	/** 第 76 List変数： l_ODR_NO */
	public List l_ODR_NO = null;

	/** 第 77 List変数： l_REMAIN_UNCONFIRM_ODR_QTY */
	public List l_REMAIN_UNCONFIRM_ODR_QTY = null;

	/** 第 78 List変数： l_BUSINESS_OPR_DATE */
	public List l_BUSINESS_OPR_DATE = null;

	/** 第 79 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** 第 80 List変数： l_CODE */
	public List l_CODE = null;

	/** 第 81 List変数： l_CLASS_CODE */
	public List l_CLASS_CODE = null;

	/** 第 82 List変数： l_MAX_ALCTED_SEQ_CD */
	public List l_MAX_ALCTED_SEQ_CD = null;

	/** 第 83 List変数： l_MAX_ODR_NO */
	public List l_MAX_ODR_NO = null;

	/** 第 84 List変数： l_h_ALCTED_UNCONFIRM_ODR_QTY */
	public List l_h_ALCTED_UNCONFIRM_ODR_QTY = null;

	/** 第 85 List変数： l_IN_ODR_NO */
	public List l_IN_ODR_NO = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getSPCL_PRICE_TYP_name() { return m_SPCL_PRICE_TYP_name; }
	public String getSPCL_PRICE_TYP_val() { return m_SPCL_PRICE_TYP_val; }
	public String geth_ODR_QTY() { return m_h_ODR_QTY; }
	public String geth_DESINATED_DLV_DATE() { return m_h_DESINATED_DLV_DATE; }
	public String geth_SPCL_PRICE_TYP() { return m_h_SPCL_PRICE_TYP; }
	public String geth_CUS_DLV_KEY_CD() { return m_h_CUS_DLV_KEY_CD; }
	public String geth_CUS_DLV_CD() { return m_h_CUS_DLV_CD; }
	public String geth_DLV_LOC_CD() { return m_h_DLV_LOC_CD; }
	public String getAPPR_REMARKS() { return m_APPR_REMARKS; }
	public String geth_APR_ODR() { return m_h_APR_ODR; }
	public String getODR_UNIT_PRICE() { return m_ODR_UNIT_PRICE; }
	public String getSPCL_PRICE_TYP() { return m_SPCL_PRICE_TYP; }
	public String getDESINATED_DLV_DATE() { return m_DESINATED_DLV_DATE; }
	public String getSTD_DESINATED_RCV_DATE() { return m_STD_DESINATED_RCV_DATE; }
	public String getODR_QTY() { return m_ODR_QTY; }
	public Double getUNCONFIRM_ODR_BALANCE() { return m_UNCONFIRM_ODR_BALANCE; }
	public Double getODR_AMOUNT() { return m_ODR_AMOUNT; }
	public Double getODR_AMOUNT_EXCH_RATES() { return m_ODR_AMOUNT_EXCH_RATES; }
	public String getCUS_DLV_CD() { return m_CUS_DLV_CD; }
	public String getCUS_DLV_KEY_CD() { return m_CUS_DLV_KEY_CD; }
	public String geth_REMAIN_UNCONFIRM_ODR_QTY() { return m_h_REMAIN_UNCONFIRM_ODR_QTY; }
	public String getCANCELED_UNCONFIRM_ODR_QTY() { return m_CANCELED_UNCONFIRM_ODR_QTY; }
	public String geth_SHIP_PLAN_REMAIN_QTY() { return m_h_SHIP_PLAN_REMAIN_QTY; }
	public String getSHIP_PLAN_CMPLT_FLG() { return m_SHIP_PLAN_CMPLT_FLG; }
	public String getPUCH_ODR_QTY_TOTAL() { return m_PUCH_ODR_QTY_TOTAL; }
	public String getREMARKS() { return m_REMARKS; }
	public String getDLV_LOC_CD() { return m_DLV_LOC_CD; }
	public String getDLV_LOC_NAME_KANJI() { return m_DLV_LOC_NAME_KANJI; }
	public String getCUST_ODR_NO() { return m_CUST_ODR_NO; }
	public String geth_ODR_NO() { return m_h_ODR_NO; }
	public String getRSLT_CTL_SEQ_CD() { return m_RSLT_CTL_SEQ_CD; }
	public String getODR_CTL_NO() { return m_ODR_CTL_NO; }
	public String geth_ODR_TYP() { return m_h_ODR_TYP; }
	public String getCUST_CD() { return m_CUST_CD; }
	public String getCUST_ITEM_CD() { return m_CUST_ITEM_CD; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getUNIT_CD() { return m_UNIT_CD; }
	public String getCURRNCY_CD() { return m_CURRNCY_CD; }
	public String getDEPO_TYP() { return m_DEPO_TYP; }
	public String getCUST_CHRG_PSN_CD() { return m_CUST_CHRG_PSN_CD; }
	public String getODR_ACPT_PSN_CD() { return m_ODR_ACPT_PSN_CD; }
	public String getODR_ACPT_DATE() { return m_ODR_ACPT_DATE; }
	public String getfkgnALCTED_UNCONFIRM_ODR_NO() { return m_fkgnALCTED_UNCONFIRM_ODR_NO; }
	public Double getfkgnALCTED_UNCONFIRM_ODR_QTY() { return m_fkgnALCTED_UNCONFIRM_ODR_QTY; }
	public String getfkgnALCTED_SEQ_CD() { return m_fkgnALCTED_SEQ_CD; }
	public Double getfkgnREMAIN_UNCONFIRM_ODR_QTY() { return m_fkgnREMAIN_UNCONFIRM_ODR_QTY; }
	public Double getfkgnODR_UNIT_PRICE() { return m_fkgnODR_UNIT_PRICE; }
	public String getfkgnCURRNCY_CD() { return m_fkgnCURRNCY_CD; }
	public Double getfkgnODR_QTY() { return m_fkgnODR_QTY; }
	public String getfkgnODR_TYP() { return m_fkgnODR_TYP; }
	public String getfkgnFIXED_ODR_NO() { return m_fkgnFIXED_ODR_NO; }
	public String getfkgnDEL_FLG() { return m_fkgnDEL_FLG; }
	public Double getfkgnUNCONFIRM_ODR_BALANCE() { return m_fkgnUNCONFIRM_ODR_BALANCE; }
	public String getfkgnODR_NO() { return m_fkgnODR_NO; }
	public String getIF_CTL_NO() { return m_IF_CTL_NO; }
	public String getUNIT_NAME() { return m_UNIT_NAME; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getCUST_ANAME() { return m_CUST_ANAME; }
	public String getEXCH_TYP() { return m_EXCH_TYP; }
	public String getDETAIL_ROUND_TYP() { return m_DETAIL_ROUND_TYP; }
	public String getCUST_ITEM_NAME() { return m_CUST_ITEM_NAME; }
	public String getODR_TYP() { return m_ODR_TYP; }
	public String getCUST_CHRG_PSN_NAME() { return m_CUST_CHRG_PSN_NAME; }
	public String getCUST_CHRG_ORG_CD() { return m_CUST_CHRG_ORG_CD; }
	public String getCUST_CHRG_ORG_NAME() { return m_CUST_CHRG_ORG_NAME; }
	public String geth_MODIFY_COUNT() { return m_h_MODIFY_COUNT; }
	public String geth_ANS_DLV_DATE_EXIST_FLG() { return m_h_ANS_DLV_DATE_EXIST_FLG; }
	public String geth_T_SHIP_ODR_EXIST_FLG() { return m_h_T_SHIP_ODR_EXIST_FLG; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getPKG_UNIT() { return m_PKG_UNIT; }
	public String getUNIT_QTY_TYP() { return m_UNIT_QTY_TYP; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String geth_ODR_UNIT_PRICE() { return m_h_ODR_UNIT_PRICE; }
	public String geth_BUSINESS_OPR_DATE() { return m_h_BUSINESS_OPR_DATE; }
	public String getDLV_LOC_NAME() { return m_DLV_LOC_NAME; }
	public String getODR_NO() { return m_ODR_NO; }
	public String getREMAIN_UNCONFIRM_ODR_QTY() { return m_REMAIN_UNCONFIRM_ODR_QTY; }
	public String getBUSINESS_OPR_DATE() { return m_BUSINESS_OPR_DATE; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getCODE() { return m_CODE; }
	public String getCLASS_CODE() { return m_CLASS_CODE; }
	public Double getMAX_ALCTED_SEQ_CD() { return m_MAX_ALCTED_SEQ_CD; }
	public String getMAX_ODR_NO() { return m_MAX_ODR_NO; }
	public String geth_ALCTED_UNCONFIRM_ODR_QTY() { return m_h_ALCTED_UNCONFIRM_ODR_QTY; }
	public String getIN_ODR_NO() { return m_IN_ODR_NO; }

	public List getList_SPCL_PRICE_TYP_name() { return l_SPCL_PRICE_TYP_name; }
	public List getList_SPCL_PRICE_TYP_val() { return l_SPCL_PRICE_TYP_val; }
	public List getList_h_ODR_QTY() { return l_h_ODR_QTY; }
	public List getList_h_DESINATED_DLV_DATE() { return l_h_DESINATED_DLV_DATE; }
	public List getList_h_SPCL_PRICE_TYP() { return l_h_SPCL_PRICE_TYP; }
	public List getList_h_CUS_DLV_KEY_CD() { return l_h_CUS_DLV_KEY_CD; }
	public List getList_h_CUS_DLV_CD() { return l_h_CUS_DLV_CD; }
	public List getList_h_DLV_LOC_CD() { return l_h_DLV_LOC_CD; }
	public List getList_APPR_REMARKS() { return l_APPR_REMARKS; }
	public List getList_h_APR_ODR() { return l_h_APR_ODR; }
	public List getList_ODR_UNIT_PRICE() { return l_ODR_UNIT_PRICE; }
	public List getList_SPCL_PRICE_TYP() { return l_SPCL_PRICE_TYP; }
	public List getList_DESINATED_DLV_DATE() { return l_DESINATED_DLV_DATE; }
	public List getList_STD_DESINATED_RCV_DATE() { return l_STD_DESINATED_RCV_DATE; }
	public List getList_ODR_QTY() { return l_ODR_QTY; }
	public List getList_UNCONFIRM_ODR_BALANCE() { return l_UNCONFIRM_ODR_BALANCE; }
	public List getList_ODR_AMOUNT() { return l_ODR_AMOUNT; }
	public List getList_ODR_AMOUNT_EXCH_RATES() { return l_ODR_AMOUNT_EXCH_RATES; }
	public List getList_CUS_DLV_CD() { return l_CUS_DLV_CD; }
	public List getList_CUS_DLV_KEY_CD() { return l_CUS_DLV_KEY_CD; }
	public List getList_h_REMAIN_UNCONFIRM_ODR_QTY() { return l_h_REMAIN_UNCONFIRM_ODR_QTY; }
	public List getList_CANCELED_UNCONFIRM_ODR_QTY() { return l_CANCELED_UNCONFIRM_ODR_QTY; }
	public List getList_h_SHIP_PLAN_REMAIN_QTY() { return l_h_SHIP_PLAN_REMAIN_QTY; }
	public List getList_SHIP_PLAN_CMPLT_FLG() { return l_SHIP_PLAN_CMPLT_FLG; }
	public List getList_PUCH_ODR_QTY_TOTAL() { return l_PUCH_ODR_QTY_TOTAL; }
	public List getList_REMARKS() { return l_REMARKS; }
	public List getList_DLV_LOC_CD() { return l_DLV_LOC_CD; }
	public List getList_DLV_LOC_NAME_KANJI() { return l_DLV_LOC_NAME_KANJI; }
	public List getList_CUST_ODR_NO() { return l_CUST_ODR_NO; }
	public List getList_h_ODR_NO() { return l_h_ODR_NO; }
	public List getList_RSLT_CTL_SEQ_CD() { return l_RSLT_CTL_SEQ_CD; }
	public List getList_ODR_CTL_NO() { return l_ODR_CTL_NO; }
	public List getList_h_ODR_TYP() { return l_h_ODR_TYP; }
	public List getList_CUST_CD() { return l_CUST_CD; }
	public List getList_CUST_ITEM_CD() { return l_CUST_ITEM_CD; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_UNIT_CD() { return l_UNIT_CD; }
	public List getList_CURRNCY_CD() { return l_CURRNCY_CD; }
	public List getList_DEPO_TYP() { return l_DEPO_TYP; }
	public List getList_CUST_CHRG_PSN_CD() { return l_CUST_CHRG_PSN_CD; }
	public List getList_ODR_ACPT_PSN_CD() { return l_ODR_ACPT_PSN_CD; }
	public List getList_ODR_ACPT_DATE() { return l_ODR_ACPT_DATE; }
	public List getList_fkgnALCTED_UNCONFIRM_ODR_NO() { return l_fkgnALCTED_UNCONFIRM_ODR_NO; }
	public List getList_fkgnALCTED_UNCONFIRM_ODR_QTY() { return l_fkgnALCTED_UNCONFIRM_ODR_QTY; }
	public List getList_fkgnALCTED_SEQ_CD() { return l_fkgnALCTED_SEQ_CD; }
	public List getList_fkgnREMAIN_UNCONFIRM_ODR_QTY() { return l_fkgnREMAIN_UNCONFIRM_ODR_QTY; }
	public List getList_fkgnODR_UNIT_PRICE() { return l_fkgnODR_UNIT_PRICE; }
	public List getList_fkgnCURRNCY_CD() { return l_fkgnCURRNCY_CD; }
	public List getList_fkgnODR_QTY() { return l_fkgnODR_QTY; }
	public List getList_fkgnODR_TYP() { return l_fkgnODR_TYP; }
	public List getList_fkgnFIXED_ODR_NO() { return l_fkgnFIXED_ODR_NO; }
	public List getList_fkgnDEL_FLG() { return l_fkgnDEL_FLG; }
	public List getList_fkgnUNCONFIRM_ODR_BALANCE() { return l_fkgnUNCONFIRM_ODR_BALANCE; }
	public List getList_fkgnODR_NO() { return l_fkgnODR_NO; }
	public List getList_IF_CTL_NO() { return l_IF_CTL_NO; }
	public List getList_UNIT_NAME() { return l_UNIT_NAME; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_CUST_ANAME() { return l_CUST_ANAME; }
	public List getList_EXCH_TYP() { return l_EXCH_TYP; }
	public List getList_DETAIL_ROUND_TYP() { return l_DETAIL_ROUND_TYP; }
	public List getList_CUST_ITEM_NAME() { return l_CUST_ITEM_NAME; }
	public List getList_ODR_TYP() { return l_ODR_TYP; }
	public List getList_CUST_CHRG_PSN_NAME() { return l_CUST_CHRG_PSN_NAME; }
	public List getList_CUST_CHRG_ORG_CD() { return l_CUST_CHRG_ORG_CD; }
	public List getList_CUST_CHRG_ORG_NAME() { return l_CUST_CHRG_ORG_NAME; }
	public List getList_h_MODIFY_COUNT() { return l_h_MODIFY_COUNT; }
	public List getList_h_ANS_DLV_DATE_EXIST_FLG() { return l_h_ANS_DLV_DATE_EXIST_FLG; }
	public List getList_h_T_SHIP_ODR_EXIST_FLG() { return l_h_T_SHIP_ODR_EXIST_FLG; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_PKG_UNIT() { return l_PKG_UNIT; }
	public List getList_UNIT_QTY_TYP() { return l_UNIT_QTY_TYP; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_h_ODR_UNIT_PRICE() { return l_h_ODR_UNIT_PRICE; }
	public List getList_h_BUSINESS_OPR_DATE() { return l_h_BUSINESS_OPR_DATE; }
	public List getList_DLV_LOC_NAME() { return l_DLV_LOC_NAME; }
	public List getList_ODR_NO() { return l_ODR_NO; }
	public List getList_REMAIN_UNCONFIRM_ODR_QTY() { return l_REMAIN_UNCONFIRM_ODR_QTY; }
	public List getList_BUSINESS_OPR_DATE() { return l_BUSINESS_OPR_DATE; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_CODE() { return l_CODE; }
	public List getList_CLASS_CODE() { return l_CLASS_CODE; }
	public List getList_MAX_ALCTED_SEQ_CD() { return l_MAX_ALCTED_SEQ_CD; }
	public List getList_MAX_ODR_NO() { return l_MAX_ODR_NO; }
	public List getList_h_ALCTED_UNCONFIRM_ODR_QTY() { return l_h_ALCTED_UNCONFIRM_ODR_QTY; }
	public List getList_IN_ODR_NO() { return l_IN_ODR_NO; }

	public void setSPCL_PRICE_TYP_name(String val) { m_SPCL_PRICE_TYP_name = val; }
	public void setSPCL_PRICE_TYP_val(String val) { m_SPCL_PRICE_TYP_val = val; }
	public void seth_ODR_QTY(String val) { m_h_ODR_QTY = val; }
	public void seth_DESINATED_DLV_DATE(String val) { m_h_DESINATED_DLV_DATE = val; }
	public void seth_SPCL_PRICE_TYP(String val) { m_h_SPCL_PRICE_TYP = val; }
	public void seth_CUS_DLV_KEY_CD(String val) { m_h_CUS_DLV_KEY_CD = val; }
	public void seth_CUS_DLV_CD(String val) { m_h_CUS_DLV_CD = val; }
	public void seth_DLV_LOC_CD(String val) { m_h_DLV_LOC_CD = val; }
	public void setAPPR_REMARKS(String val) { m_APPR_REMARKS = val; }
	public void seth_APR_ODR(String val) { m_h_APR_ODR = val; }
	public void setODR_UNIT_PRICE(String val) { m_ODR_UNIT_PRICE = val; }
	public void setSPCL_PRICE_TYP(String val) { m_SPCL_PRICE_TYP = val; }
	public void setDESINATED_DLV_DATE(String val) { m_DESINATED_DLV_DATE = val; }
	public void setSTD_DESINATED_RCV_DATE(String val) { m_STD_DESINATED_RCV_DATE = val; }
	public void setODR_QTY(String val) { m_ODR_QTY = val; }
	public void setUNCONFIRM_ODR_BALANCE(Double val) { m_UNCONFIRM_ODR_BALANCE = val; }
	public void setODR_AMOUNT(Double val) { m_ODR_AMOUNT = val; }
	public void setODR_AMOUNT_EXCH_RATES(Double val) { m_ODR_AMOUNT_EXCH_RATES = val; }
	public void setCUS_DLV_CD(String val) { m_CUS_DLV_CD = val; }
	public void setCUS_DLV_KEY_CD(String val) { m_CUS_DLV_KEY_CD = val; }
	public void seth_REMAIN_UNCONFIRM_ODR_QTY(String val) { m_h_REMAIN_UNCONFIRM_ODR_QTY = val; }
	public void setCANCELED_UNCONFIRM_ODR_QTY(String val) { m_CANCELED_UNCONFIRM_ODR_QTY = val; }
	public void seth_SHIP_PLAN_REMAIN_QTY(String val) { m_h_SHIP_PLAN_REMAIN_QTY = val; }
	public void setSHIP_PLAN_CMPLT_FLG(String val) { m_SHIP_PLAN_CMPLT_FLG = val; }
	public void setPUCH_ODR_QTY_TOTAL(String val) { m_PUCH_ODR_QTY_TOTAL = val; }
	public void setREMARKS(String val) { m_REMARKS = val; }
	public void setDLV_LOC_CD(String val) { m_DLV_LOC_CD = val; }
	public void setDLV_LOC_NAME_KANJI(String val) { m_DLV_LOC_NAME_KANJI = val; }
	public void setCUST_ODR_NO(String val) { m_CUST_ODR_NO = val; }
	public void seth_ODR_NO(String val) { m_h_ODR_NO = val; }
	public void setRSLT_CTL_SEQ_CD(String val) { m_RSLT_CTL_SEQ_CD = val; }
	public void setODR_CTL_NO(String val) { m_ODR_CTL_NO = val; }
	public void seth_ODR_TYP(String val) { m_h_ODR_TYP = val; }
	public void setCUST_CD(String val) { m_CUST_CD = val; }
	public void setCUST_ITEM_CD(String val) { m_CUST_ITEM_CD = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setUNIT_CD(String val) { m_UNIT_CD = val; }
	public void setCURRNCY_CD(String val) { m_CURRNCY_CD = val; }
	public void setDEPO_TYP(String val) { m_DEPO_TYP = val; }
	public void setCUST_CHRG_PSN_CD(String val) { m_CUST_CHRG_PSN_CD = val; }
	public void setODR_ACPT_PSN_CD(String val) { m_ODR_ACPT_PSN_CD = val; }
	public void setODR_ACPT_DATE(String val) { m_ODR_ACPT_DATE = val; }
	public void setfkgnALCTED_UNCONFIRM_ODR_NO(String val) { m_fkgnALCTED_UNCONFIRM_ODR_NO = val; }
	public void setfkgnALCTED_UNCONFIRM_ODR_QTY(Double val) { m_fkgnALCTED_UNCONFIRM_ODR_QTY = val; }
	public void setfkgnALCTED_SEQ_CD(String val) { m_fkgnALCTED_SEQ_CD = val; }
	public void setfkgnREMAIN_UNCONFIRM_ODR_QTY(Double val) { m_fkgnREMAIN_UNCONFIRM_ODR_QTY = val; }
	public void setfkgnODR_UNIT_PRICE(Double val) { m_fkgnODR_UNIT_PRICE = val; }
	public void setfkgnCURRNCY_CD(String val) { m_fkgnCURRNCY_CD = val; }
	public void setfkgnODR_QTY(Double val) { m_fkgnODR_QTY = val; }
	public void setfkgnODR_TYP(String val) { m_fkgnODR_TYP = val; }
	public void setfkgnFIXED_ODR_NO(String val) { m_fkgnFIXED_ODR_NO = val; }
	public void setfkgnDEL_FLG(String val) { m_fkgnDEL_FLG = val; }
	public void setfkgnUNCONFIRM_ODR_BALANCE(Double val) { m_fkgnUNCONFIRM_ODR_BALANCE = val; }
	public void setfkgnODR_NO(String val) { m_fkgnODR_NO = val; }
	public void setIF_CTL_NO(String val) { m_IF_CTL_NO = val; }
	public void setUNIT_NAME(String val) { m_UNIT_NAME = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setCUST_ANAME(String val) { m_CUST_ANAME = val; }
	public void setEXCH_TYP(String val) { m_EXCH_TYP = val; }
	public void setDETAIL_ROUND_TYP(String val) { m_DETAIL_ROUND_TYP = val; }
	public void setCUST_ITEM_NAME(String val) { m_CUST_ITEM_NAME = val; }
	public void setODR_TYP(String val) { m_ODR_TYP = val; }
	public void setCUST_CHRG_PSN_NAME(String val) { m_CUST_CHRG_PSN_NAME = val; }
	public void setCUST_CHRG_ORG_CD(String val) { m_CUST_CHRG_ORG_CD = val; }
	public void setCUST_CHRG_ORG_NAME(String val) { m_CUST_CHRG_ORG_NAME = val; }
	public void seth_MODIFY_COUNT(String val) { m_h_MODIFY_COUNT = val; }
	public void seth_ANS_DLV_DATE_EXIST_FLG(String val) { m_h_ANS_DLV_DATE_EXIST_FLG = val; }
	public void seth_T_SHIP_ODR_EXIST_FLG(String val) { m_h_T_SHIP_ODR_EXIST_FLG = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setPKG_UNIT(String val) { m_PKG_UNIT = val; }
	public void setUNIT_QTY_TYP(String val) { m_UNIT_QTY_TYP = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void seth_ODR_UNIT_PRICE(String val) { m_h_ODR_UNIT_PRICE = val; }
	public void seth_BUSINESS_OPR_DATE(String val) { m_h_BUSINESS_OPR_DATE = val; }
	public void setDLV_LOC_NAME(String val) { m_DLV_LOC_NAME = val; }
	public void setODR_NO(String val) { m_ODR_NO = val; }
	public void setREMAIN_UNCONFIRM_ODR_QTY(String val) { m_REMAIN_UNCONFIRM_ODR_QTY = val; }
	public void setBUSINESS_OPR_DATE(String val) { m_BUSINESS_OPR_DATE = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setCODE(String val) { m_CODE = val; }
	public void setCLASS_CODE(String val) { m_CLASS_CODE = val; }
	public void setMAX_ALCTED_SEQ_CD(Double val) { m_MAX_ALCTED_SEQ_CD = val; }
	public void setMAX_ODR_NO(String val) { m_MAX_ODR_NO = val; }
	public void seth_ALCTED_UNCONFIRM_ODR_QTY(String val) { m_h_ALCTED_UNCONFIRM_ODR_QTY = val; }
	public void setIN_ODR_NO(String val) { m_IN_ODR_NO = val; }


	public void setList_SPCL_PRICE_TYP_name(List list) { l_SPCL_PRICE_TYP_name = list; }
	public void setList_SPCL_PRICE_TYP_val(List list) { l_SPCL_PRICE_TYP_val = list; }
	public void setList_h_ODR_QTY(List list) { l_h_ODR_QTY = list; }
	public void setList_h_DESINATED_DLV_DATE(List list) { l_h_DESINATED_DLV_DATE = list; }
	public void setList_h_SPCL_PRICE_TYP(List list) { l_h_SPCL_PRICE_TYP = list; }
	public void setList_h_CUS_DLV_KEY_CD(List list) { l_h_CUS_DLV_KEY_CD = list; }
	public void setList_h_CUS_DLV_CD(List list) { l_h_CUS_DLV_CD = list; }
	public void setList_h_DLV_LOC_CD(List list) { l_h_DLV_LOC_CD = list; }
	public void setList_APPR_REMARKS(List list) { l_APPR_REMARKS = list; }
	public void setList_h_APR_ODR(List list) { l_h_APR_ODR = list; }
	public void setList_ODR_UNIT_PRICE(List list) { l_ODR_UNIT_PRICE = list; }
	public void setList_SPCL_PRICE_TYP(List list) { l_SPCL_PRICE_TYP = list; }
	public void setList_DESINATED_DLV_DATE(List list) { l_DESINATED_DLV_DATE = list; }
	public void setList_STD_DESINATED_RCV_DATE(List list) { l_STD_DESINATED_RCV_DATE = list; }
	public void setList_ODR_QTY(List list) { l_ODR_QTY = list; }
	public void setList_UNCONFIRM_ODR_BALANCE(List list) { l_UNCONFIRM_ODR_BALANCE = list; }
	public void setList_ODR_AMOUNT(List list) { l_ODR_AMOUNT = list; }
	public void setList_ODR_AMOUNT_EXCH_RATES(List list) { l_ODR_AMOUNT_EXCH_RATES = list; }
	public void setList_CUS_DLV_CD(List list) { l_CUS_DLV_CD = list; }
	public void setList_CUS_DLV_KEY_CD(List list) { l_CUS_DLV_KEY_CD = list; }
	public void setList_h_REMAIN_UNCONFIRM_ODR_QTY(List list) { l_h_REMAIN_UNCONFIRM_ODR_QTY = list; }
	public void setList_CANCELED_UNCONFIRM_ODR_QTY(List list) { l_CANCELED_UNCONFIRM_ODR_QTY = list; }
	public void setList_h_SHIP_PLAN_REMAIN_QTY(List list) { l_h_SHIP_PLAN_REMAIN_QTY = list; }
	public void setList_SHIP_PLAN_CMPLT_FLG(List list) { l_SHIP_PLAN_CMPLT_FLG = list; }
	public void setList_PUCH_ODR_QTY_TOTAL(List list) { l_PUCH_ODR_QTY_TOTAL = list; }
	public void setList_REMARKS(List list) { l_REMARKS = list; }
	public void setList_DLV_LOC_CD(List list) { l_DLV_LOC_CD = list; }
	public void setList_DLV_LOC_NAME_KANJI(List list) { l_DLV_LOC_NAME_KANJI = list; }
	public void setList_CUST_ODR_NO(List list) { l_CUST_ODR_NO = list; }
	public void setList_h_ODR_NO(List list) { l_h_ODR_NO = list; }
	public void setList_RSLT_CTL_SEQ_CD(List list) { l_RSLT_CTL_SEQ_CD = list; }
	public void setList_ODR_CTL_NO(List list) { l_ODR_CTL_NO = list; }
	public void setList_h_ODR_TYP(List list) { l_h_ODR_TYP = list; }
	public void setList_CUST_CD(List list) { l_CUST_CD = list; }
	public void setList_CUST_ITEM_CD(List list) { l_CUST_ITEM_CD = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_UNIT_CD(List list) { l_UNIT_CD = list; }
	public void setList_CURRNCY_CD(List list) { l_CURRNCY_CD = list; }
	public void setList_DEPO_TYP(List list) { l_DEPO_TYP = list; }
	public void setList_CUST_CHRG_PSN_CD(List list) { l_CUST_CHRG_PSN_CD = list; }
	public void setList_ODR_ACPT_PSN_CD(List list) { l_ODR_ACPT_PSN_CD = list; }
	public void setList_ODR_ACPT_DATE(List list) { l_ODR_ACPT_DATE = list; }
	public void setList_fkgnALCTED_UNCONFIRM_ODR_NO(List list) { l_fkgnALCTED_UNCONFIRM_ODR_NO = list; }
	public void setList_fkgnALCTED_UNCONFIRM_ODR_QTY(List list) { l_fkgnALCTED_UNCONFIRM_ODR_QTY = list; }
	public void setList_fkgnALCTED_SEQ_CD(List list) { l_fkgnALCTED_SEQ_CD = list; }
	public void setList_fkgnREMAIN_UNCONFIRM_ODR_QTY(List list) { l_fkgnREMAIN_UNCONFIRM_ODR_QTY = list; }
	public void setList_fkgnODR_UNIT_PRICE(List list) { l_fkgnODR_UNIT_PRICE = list; }
	public void setList_fkgnCURRNCY_CD(List list) { l_fkgnCURRNCY_CD = list; }
	public void setList_fkgnODR_QTY(List list) { l_fkgnODR_QTY = list; }
	public void setList_fkgnODR_TYP(List list) { l_fkgnODR_TYP = list; }
	public void setList_fkgnFIXED_ODR_NO(List list) { l_fkgnFIXED_ODR_NO = list; }
	public void setList_fkgnDEL_FLG(List list) { l_fkgnDEL_FLG = list; }
	public void setList_fkgnUNCONFIRM_ODR_BALANCE(List list) { l_fkgnUNCONFIRM_ODR_BALANCE = list; }
	public void setList_fkgnODR_NO(List list) { l_fkgnODR_NO = list; }
	public void setList_IF_CTL_NO(List list) { l_IF_CTL_NO = list; }
	public void setList_UNIT_NAME(List list) { l_UNIT_NAME = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_CUST_ANAME(List list) { l_CUST_ANAME = list; }
	public void setList_EXCH_TYP(List list) { l_EXCH_TYP = list; }
	public void setList_DETAIL_ROUND_TYP(List list) { l_DETAIL_ROUND_TYP = list; }
	public void setList_CUST_ITEM_NAME(List list) { l_CUST_ITEM_NAME = list; }
	public void setList_ODR_TYP(List list) { l_ODR_TYP = list; }
	public void setList_CUST_CHRG_PSN_NAME(List list) { l_CUST_CHRG_PSN_NAME = list; }
	public void setList_CUST_CHRG_ORG_CD(List list) { l_CUST_CHRG_ORG_CD = list; }
	public void setList_CUST_CHRG_ORG_NAME(List list) { l_CUST_CHRG_ORG_NAME = list; }
	public void setList_h_MODIFY_COUNT(List list) { l_h_MODIFY_COUNT = list; }
	public void setList_h_ANS_DLV_DATE_EXIST_FLG(List list) { l_h_ANS_DLV_DATE_EXIST_FLG = list; }
	public void setList_h_T_SHIP_ODR_EXIST_FLG(List list) { l_h_T_SHIP_ODR_EXIST_FLG = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_PKG_UNIT(List list) { l_PKG_UNIT = list; }
	public void setList_UNIT_QTY_TYP(List list) { l_UNIT_QTY_TYP = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_h_ODR_UNIT_PRICE(List list) { l_h_ODR_UNIT_PRICE = list; }
	public void setList_h_BUSINESS_OPR_DATE(List list) { l_h_BUSINESS_OPR_DATE = list; }
	public void setList_DLV_LOC_NAME(List list) { l_DLV_LOC_NAME = list; }
	public void setList_ODR_NO(List list) { l_ODR_NO = list; }
	public void setList_REMAIN_UNCONFIRM_ODR_QTY(List list) { l_REMAIN_UNCONFIRM_ODR_QTY = list; }
	public void setList_BUSINESS_OPR_DATE(List list) { l_BUSINESS_OPR_DATE = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_CODE(List list) { l_CODE = list; }
	public void setList_CLASS_CODE(List list) { l_CLASS_CODE = list; }
	public void setList_MAX_ALCTED_SEQ_CD(List list) { l_MAX_ALCTED_SEQ_CD = list; }
	public void setList_MAX_ODR_NO(List list) { l_MAX_ODR_NO = list; }
	public void setList_h_ALCTED_UNCONFIRM_ODR_QTY(List list) { l_h_ALCTED_UNCONFIRM_ODR_QTY = list; }
	public void setList_IN_ODR_NO(List list) { l_IN_ODR_NO = list; }

	public int setL2L_SPCL_PRICE_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SPCL_PRICE_TYP_name == null) {
			l_SPCL_PRICE_TYP_name = new ArrayList();
		} else {
			l_SPCL_PRICE_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SPCL_PRICE_TYP_name.add(((KQ0010020Struct) list.get(i)).getSPCL_PRICE_TYP_name());
		}
		return size;
	}
	public int setL2L_SPCL_PRICE_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SPCL_PRICE_TYP_val == null) {
			l_SPCL_PRICE_TYP_val = new ArrayList();
		} else {
			l_SPCL_PRICE_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SPCL_PRICE_TYP_val.add(((KQ0010020Struct) list.get(i)).getSPCL_PRICE_TYP_val());
		}
		return size;
	}
	public int setL2L_h_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ODR_QTY == null) {
			l_h_ODR_QTY = new ArrayList();
		} else {
			l_h_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ODR_QTY.add(((KQ0010020Struct) list.get(i)).geth_ODR_QTY());
		}
		return size;
	}
	public int setL2L_h_DESINATED_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_DESINATED_DLV_DATE == null) {
			l_h_DESINATED_DLV_DATE = new ArrayList();
		} else {
			l_h_DESINATED_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_DESINATED_DLV_DATE.add(((KQ0010020Struct) list.get(i)).geth_DESINATED_DLV_DATE());
		}
		return size;
	}
	public int setL2L_h_SPCL_PRICE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_SPCL_PRICE_TYP == null) {
			l_h_SPCL_PRICE_TYP = new ArrayList();
		} else {
			l_h_SPCL_PRICE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_SPCL_PRICE_TYP.add(((KQ0010020Struct) list.get(i)).geth_SPCL_PRICE_TYP());
		}
		return size;
	}
	public int setL2L_h_CUS_DLV_KEY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_CUS_DLV_KEY_CD == null) {
			l_h_CUS_DLV_KEY_CD = new ArrayList();
		} else {
			l_h_CUS_DLV_KEY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_CUS_DLV_KEY_CD.add(((KQ0010020Struct) list.get(i)).geth_CUS_DLV_KEY_CD());
		}
		return size;
	}
	public int setL2L_h_CUS_DLV_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_CUS_DLV_CD == null) {
			l_h_CUS_DLV_CD = new ArrayList();
		} else {
			l_h_CUS_DLV_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_CUS_DLV_CD.add(((KQ0010020Struct) list.get(i)).geth_CUS_DLV_CD());
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
			l_h_DLV_LOC_CD.add(((KQ0010020Struct) list.get(i)).geth_DLV_LOC_CD());
		}
		return size;
	}
	public int setL2L_APPR_REMARKS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_APPR_REMARKS == null) {
			l_APPR_REMARKS = new ArrayList();
		} else {
			l_APPR_REMARKS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_APPR_REMARKS.add(((KQ0010020Struct) list.get(i)).getAPPR_REMARKS());
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
			l_h_APR_ODR.add(((KQ0010020Struct) list.get(i)).geth_APR_ODR());
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
			l_ODR_UNIT_PRICE.add(((KQ0010020Struct) list.get(i)).getODR_UNIT_PRICE());
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
			l_SPCL_PRICE_TYP.add(((KQ0010020Struct) list.get(i)).getSPCL_PRICE_TYP());
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
			l_DESINATED_DLV_DATE.add(((KQ0010020Struct) list.get(i)).getDESINATED_DLV_DATE());
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
			l_STD_DESINATED_RCV_DATE.add(((KQ0010020Struct) list.get(i)).getSTD_DESINATED_RCV_DATE());
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
			l_ODR_QTY.add(((KQ0010020Struct) list.get(i)).getODR_QTY());
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
			l_UNCONFIRM_ODR_BALANCE.add(((KQ0010020Struct) list.get(i)).getUNCONFIRM_ODR_BALANCE());
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
			l_ODR_AMOUNT.add(((KQ0010020Struct) list.get(i)).getODR_AMOUNT());
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
			l_ODR_AMOUNT_EXCH_RATES.add(((KQ0010020Struct) list.get(i)).getODR_AMOUNT_EXCH_RATES());
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
			l_CUS_DLV_CD.add(((KQ0010020Struct) list.get(i)).getCUS_DLV_CD());
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
			l_CUS_DLV_KEY_CD.add(((KQ0010020Struct) list.get(i)).getCUS_DLV_KEY_CD());
		}
		return size;
	}
	public int setL2L_h_REMAIN_UNCONFIRM_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_REMAIN_UNCONFIRM_ODR_QTY == null) {
			l_h_REMAIN_UNCONFIRM_ODR_QTY = new ArrayList();
		} else {
			l_h_REMAIN_UNCONFIRM_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_REMAIN_UNCONFIRM_ODR_QTY.add(((KQ0010020Struct) list.get(i)).geth_REMAIN_UNCONFIRM_ODR_QTY());
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
			l_CANCELED_UNCONFIRM_ODR_QTY.add(((KQ0010020Struct) list.get(i)).getCANCELED_UNCONFIRM_ODR_QTY());
		}
		return size;
	}
	public int setL2L_h_SHIP_PLAN_REMAIN_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_SHIP_PLAN_REMAIN_QTY == null) {
			l_h_SHIP_PLAN_REMAIN_QTY = new ArrayList();
		} else {
			l_h_SHIP_PLAN_REMAIN_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_SHIP_PLAN_REMAIN_QTY.add(((KQ0010020Struct) list.get(i)).geth_SHIP_PLAN_REMAIN_QTY());
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
			l_SHIP_PLAN_CMPLT_FLG.add(((KQ0010020Struct) list.get(i)).getSHIP_PLAN_CMPLT_FLG());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_QTY_TOTAL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_QTY_TOTAL == null) {
			l_PUCH_ODR_QTY_TOTAL = new ArrayList();
		} else {
			l_PUCH_ODR_QTY_TOTAL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_QTY_TOTAL.add(((KQ0010020Struct) list.get(i)).getPUCH_ODR_QTY_TOTAL());
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
			l_REMARKS.add(((KQ0010020Struct) list.get(i)).getREMARKS());
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
			l_DLV_LOC_CD.add(((KQ0010020Struct) list.get(i)).getDLV_LOC_CD());
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
			l_DLV_LOC_NAME_KANJI.add(((KQ0010020Struct) list.get(i)).getDLV_LOC_NAME_KANJI());
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
			l_CUST_ODR_NO.add(((KQ0010020Struct) list.get(i)).getCUST_ODR_NO());
		}
		return size;
	}
	public int setL2L_h_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ODR_NO == null) {
			l_h_ODR_NO = new ArrayList();
		} else {
			l_h_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ODR_NO.add(((KQ0010020Struct) list.get(i)).geth_ODR_NO());
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
			l_RSLT_CTL_SEQ_CD.add(((KQ0010020Struct) list.get(i)).getRSLT_CTL_SEQ_CD());
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
			l_ODR_CTL_NO.add(((KQ0010020Struct) list.get(i)).getODR_CTL_NO());
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
			l_h_ODR_TYP.add(((KQ0010020Struct) list.get(i)).geth_ODR_TYP());
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
			l_CUST_CD.add(((KQ0010020Struct) list.get(i)).getCUST_CD());
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
			l_CUST_ITEM_CD.add(((KQ0010020Struct) list.get(i)).getCUST_ITEM_CD());
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
			l_ITEM_CD.add(((KQ0010020Struct) list.get(i)).getITEM_CD());
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
			l_UNIT_CD.add(((KQ0010020Struct) list.get(i)).getUNIT_CD());
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
			l_CURRNCY_CD.add(((KQ0010020Struct) list.get(i)).getCURRNCY_CD());
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
			l_DEPO_TYP.add(((KQ0010020Struct) list.get(i)).getDEPO_TYP());
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
			l_CUST_CHRG_PSN_CD.add(((KQ0010020Struct) list.get(i)).getCUST_CHRG_PSN_CD());
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
			l_ODR_ACPT_PSN_CD.add(((KQ0010020Struct) list.get(i)).getODR_ACPT_PSN_CD());
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
			l_ODR_ACPT_DATE.add(((KQ0010020Struct) list.get(i)).getODR_ACPT_DATE());
		}
		return size;
	}
	public int setL2L_fkgnALCTED_UNCONFIRM_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_fkgnALCTED_UNCONFIRM_ODR_NO == null) {
			l_fkgnALCTED_UNCONFIRM_ODR_NO = new ArrayList();
		} else {
			l_fkgnALCTED_UNCONFIRM_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_fkgnALCTED_UNCONFIRM_ODR_NO.add(((KQ0010020Struct) list.get(i)).getfkgnALCTED_UNCONFIRM_ODR_NO());
		}
		return size;
	}
	public int setL2L_fkgnALCTED_UNCONFIRM_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_fkgnALCTED_UNCONFIRM_ODR_QTY == null) {
			l_fkgnALCTED_UNCONFIRM_ODR_QTY = new ArrayList();
		} else {
			l_fkgnALCTED_UNCONFIRM_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_fkgnALCTED_UNCONFIRM_ODR_QTY.add(((KQ0010020Struct) list.get(i)).getfkgnALCTED_UNCONFIRM_ODR_QTY());
		}
		return size;
	}
	public int setL2L_fkgnALCTED_SEQ_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_fkgnALCTED_SEQ_CD == null) {
			l_fkgnALCTED_SEQ_CD = new ArrayList();
		} else {
			l_fkgnALCTED_SEQ_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_fkgnALCTED_SEQ_CD.add(((KQ0010020Struct) list.get(i)).getfkgnALCTED_SEQ_CD());
		}
		return size;
	}
	public int setL2L_fkgnREMAIN_UNCONFIRM_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_fkgnREMAIN_UNCONFIRM_ODR_QTY == null) {
			l_fkgnREMAIN_UNCONFIRM_ODR_QTY = new ArrayList();
		} else {
			l_fkgnREMAIN_UNCONFIRM_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_fkgnREMAIN_UNCONFIRM_ODR_QTY.add(((KQ0010020Struct) list.get(i)).getfkgnREMAIN_UNCONFIRM_ODR_QTY());
		}
		return size;
	}
	public int setL2L_fkgnODR_UNIT_PRICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_fkgnODR_UNIT_PRICE == null) {
			l_fkgnODR_UNIT_PRICE = new ArrayList();
		} else {
			l_fkgnODR_UNIT_PRICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_fkgnODR_UNIT_PRICE.add(((KQ0010020Struct) list.get(i)).getfkgnODR_UNIT_PRICE());
		}
		return size;
	}
	public int setL2L_fkgnCURRNCY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_fkgnCURRNCY_CD == null) {
			l_fkgnCURRNCY_CD = new ArrayList();
		} else {
			l_fkgnCURRNCY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_fkgnCURRNCY_CD.add(((KQ0010020Struct) list.get(i)).getfkgnCURRNCY_CD());
		}
		return size;
	}
	public int setL2L_fkgnODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_fkgnODR_QTY == null) {
			l_fkgnODR_QTY = new ArrayList();
		} else {
			l_fkgnODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_fkgnODR_QTY.add(((KQ0010020Struct) list.get(i)).getfkgnODR_QTY());
		}
		return size;
	}
	public int setL2L_fkgnODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_fkgnODR_TYP == null) {
			l_fkgnODR_TYP = new ArrayList();
		} else {
			l_fkgnODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_fkgnODR_TYP.add(((KQ0010020Struct) list.get(i)).getfkgnODR_TYP());
		}
		return size;
	}
	public int setL2L_fkgnFIXED_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_fkgnFIXED_ODR_NO == null) {
			l_fkgnFIXED_ODR_NO = new ArrayList();
		} else {
			l_fkgnFIXED_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_fkgnFIXED_ODR_NO.add(((KQ0010020Struct) list.get(i)).getfkgnFIXED_ODR_NO());
		}
		return size;
	}
	public int setL2L_fkgnDEL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_fkgnDEL_FLG == null) {
			l_fkgnDEL_FLG = new ArrayList();
		} else {
			l_fkgnDEL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_fkgnDEL_FLG.add(((KQ0010020Struct) list.get(i)).getfkgnDEL_FLG());
		}
		return size;
	}
	public int setL2L_fkgnUNCONFIRM_ODR_BALANCE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_fkgnUNCONFIRM_ODR_BALANCE == null) {
			l_fkgnUNCONFIRM_ODR_BALANCE = new ArrayList();
		} else {
			l_fkgnUNCONFIRM_ODR_BALANCE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_fkgnUNCONFIRM_ODR_BALANCE.add(((KQ0010020Struct) list.get(i)).getfkgnUNCONFIRM_ODR_BALANCE());
		}
		return size;
	}
	public int setL2L_fkgnODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_fkgnODR_NO == null) {
			l_fkgnODR_NO = new ArrayList();
		} else {
			l_fkgnODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_fkgnODR_NO.add(((KQ0010020Struct) list.get(i)).getfkgnODR_NO());
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
			l_IF_CTL_NO.add(((KQ0010020Struct) list.get(i)).getIF_CTL_NO());
		}
		return size;
	}
	public int setL2L_UNIT_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_NAME == null) {
			l_UNIT_NAME = new ArrayList();
		} else {
			l_UNIT_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_NAME.add(((KQ0010020Struct) list.get(i)).getUNIT_NAME());
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
			l_ITEM_NAME.add(((KQ0010020Struct) list.get(i)).getITEM_NAME());
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
			l_CUST_ANAME.add(((KQ0010020Struct) list.get(i)).getCUST_ANAME());
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
			l_EXCH_TYP.add(((KQ0010020Struct) list.get(i)).getEXCH_TYP());
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
			l_DETAIL_ROUND_TYP.add(((KQ0010020Struct) list.get(i)).getDETAIL_ROUND_TYP());
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
			l_CUST_ITEM_NAME.add(((KQ0010020Struct) list.get(i)).getCUST_ITEM_NAME());
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
			l_ODR_TYP.add(((KQ0010020Struct) list.get(i)).getODR_TYP());
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
			l_CUST_CHRG_PSN_NAME.add(((KQ0010020Struct) list.get(i)).getCUST_CHRG_PSN_NAME());
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
			l_CUST_CHRG_ORG_CD.add(((KQ0010020Struct) list.get(i)).getCUST_CHRG_ORG_CD());
		}
		return size;
	}
	public int setL2L_CUST_CHRG_ORG_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_CHRG_ORG_NAME == null) {
			l_CUST_CHRG_ORG_NAME = new ArrayList();
		} else {
			l_CUST_CHRG_ORG_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_CHRG_ORG_NAME.add(((KQ0010020Struct) list.get(i)).getCUST_CHRG_ORG_NAME());
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
			l_h_MODIFY_COUNT.add(((KQ0010020Struct) list.get(i)).geth_MODIFY_COUNT());
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
			l_h_ANS_DLV_DATE_EXIST_FLG.add(((KQ0010020Struct) list.get(i)).geth_ANS_DLV_DATE_EXIST_FLG());
		}
		return size;
	}
	public int setL2L_h_T_SHIP_ODR_EXIST_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_T_SHIP_ODR_EXIST_FLG == null) {
			l_h_T_SHIP_ODR_EXIST_FLG = new ArrayList();
		} else {
			l_h_T_SHIP_ODR_EXIST_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_T_SHIP_ODR_EXIST_FLG.add(((KQ0010020Struct) list.get(i)).geth_T_SHIP_ODR_EXIST_FLG());
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
			l_STOCK_UNIT.add(((KQ0010020Struct) list.get(i)).getSTOCK_UNIT());
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
			l_PKG_UNIT.add(((KQ0010020Struct) list.get(i)).getPKG_UNIT());
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
			l_UNIT_QTY_TYP.add(((KQ0010020Struct) list.get(i)).getUNIT_QTY_TYP());
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
			l_COMPANY_CD.add(((KQ0010020Struct) list.get(i)).getCOMPANY_CD());
		}
		return size;
	}
	public int setL2L_h_ODR_UNIT_PRICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ODR_UNIT_PRICE == null) {
			l_h_ODR_UNIT_PRICE = new ArrayList();
		} else {
			l_h_ODR_UNIT_PRICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ODR_UNIT_PRICE.add(((KQ0010020Struct) list.get(i)).geth_ODR_UNIT_PRICE());
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
			l_h_BUSINESS_OPR_DATE.add(((KQ0010020Struct) list.get(i)).geth_BUSINESS_OPR_DATE());
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
			l_DLV_LOC_NAME.add(((KQ0010020Struct) list.get(i)).getDLV_LOC_NAME());
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
			l_ODR_NO.add(((KQ0010020Struct) list.get(i)).getODR_NO());
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
			l_REMAIN_UNCONFIRM_ODR_QTY.add(((KQ0010020Struct) list.get(i)).getREMAIN_UNCONFIRM_ODR_QTY());
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
			l_BUSINESS_OPR_DATE.add(((KQ0010020Struct) list.get(i)).getBUSINESS_OPR_DATE());
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
			l_PLANT_CD.add(((KQ0010020Struct) list.get(i)).getPLANT_CD());
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
			l_CODE.add(((KQ0010020Struct) list.get(i)).getCODE());
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
			l_CLASS_CODE.add(((KQ0010020Struct) list.get(i)).getCLASS_CODE());
		}
		return size;
	}
	public int setL2L_MAX_ALCTED_SEQ_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MAX_ALCTED_SEQ_CD == null) {
			l_MAX_ALCTED_SEQ_CD = new ArrayList();
		} else {
			l_MAX_ALCTED_SEQ_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MAX_ALCTED_SEQ_CD.add(((KQ0010020Struct) list.get(i)).getMAX_ALCTED_SEQ_CD());
		}
		return size;
	}
	public int setL2L_MAX_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MAX_ODR_NO == null) {
			l_MAX_ODR_NO = new ArrayList();
		} else {
			l_MAX_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MAX_ODR_NO.add(((KQ0010020Struct) list.get(i)).getMAX_ODR_NO());
		}
		return size;
	}
	public int setL2L_h_ALCTED_UNCONFIRM_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ALCTED_UNCONFIRM_ODR_QTY == null) {
			l_h_ALCTED_UNCONFIRM_ODR_QTY = new ArrayList();
		} else {
			l_h_ALCTED_UNCONFIRM_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ALCTED_UNCONFIRM_ODR_QTY.add(((KQ0010020Struct) list.get(i)).geth_ALCTED_UNCONFIRM_ODR_QTY());
		}
		return size;
	}
	public int setL2L_IN_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_ODR_NO == null) {
			l_IN_ODR_NO = new ArrayList();
		} else {
			l_IN_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_ODR_NO.add(((KQ0010020Struct) list.get(i)).getIN_ODR_NO());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_SPCL_PRICE_TYP_name = null;
		m_SPCL_PRICE_TYP_val = null;
		m_h_ODR_QTY = null;
		m_h_DESINATED_DLV_DATE = null;
		m_h_SPCL_PRICE_TYP = null;
		m_h_CUS_DLV_KEY_CD = null;
		m_h_CUS_DLV_CD = null;
		m_h_DLV_LOC_CD = null;
		m_APPR_REMARKS = null;
		m_h_APR_ODR = null;
		m_ODR_UNIT_PRICE = null;
		m_SPCL_PRICE_TYP = null;
		m_DESINATED_DLV_DATE = null;
		m_STD_DESINATED_RCV_DATE = null;
		m_ODR_QTY = null;
		m_UNCONFIRM_ODR_BALANCE = null;
		m_ODR_AMOUNT = null;
		m_ODR_AMOUNT_EXCH_RATES = null;
		m_CUS_DLV_CD = null;
		m_CUS_DLV_KEY_CD = null;
		m_h_REMAIN_UNCONFIRM_ODR_QTY = null;
		m_CANCELED_UNCONFIRM_ODR_QTY = null;
		m_h_SHIP_PLAN_REMAIN_QTY = null;
		m_SHIP_PLAN_CMPLT_FLG = null;
		m_PUCH_ODR_QTY_TOTAL = null;
		m_REMARKS = null;
		m_DLV_LOC_CD = null;
		m_DLV_LOC_NAME_KANJI = null;
		m_CUST_ODR_NO = null;
		m_h_ODR_NO = null;
		m_RSLT_CTL_SEQ_CD = null;
		m_ODR_CTL_NO = null;
		m_h_ODR_TYP = null;
		m_CUST_CD = null;
		m_CUST_ITEM_CD = null;
		m_ITEM_CD = null;
		m_UNIT_CD = null;
		m_CURRNCY_CD = null;
		m_DEPO_TYP = null;
		m_CUST_CHRG_PSN_CD = null;
		m_ODR_ACPT_PSN_CD = null;
		m_ODR_ACPT_DATE = null;
		m_fkgnALCTED_UNCONFIRM_ODR_NO = null;
		m_fkgnALCTED_UNCONFIRM_ODR_QTY = null;
		m_fkgnALCTED_SEQ_CD = null;
		m_fkgnREMAIN_UNCONFIRM_ODR_QTY = null;
		m_fkgnODR_UNIT_PRICE = null;
		m_fkgnCURRNCY_CD = null;
		m_fkgnODR_QTY = null;
		m_fkgnODR_TYP = null;
		m_fkgnFIXED_ODR_NO = null;
		m_fkgnDEL_FLG = null;
		m_fkgnUNCONFIRM_ODR_BALANCE = null;
		m_fkgnODR_NO = null;
		m_IF_CTL_NO = null;
		m_UNIT_NAME = null;
		m_ITEM_NAME = null;
		m_CUST_ANAME = null;
		m_EXCH_TYP = null;
		m_DETAIL_ROUND_TYP = null;
		m_CUST_ITEM_NAME = null;
		m_ODR_TYP = null;
		m_CUST_CHRG_PSN_NAME = null;
		m_CUST_CHRG_ORG_CD = null;
		m_CUST_CHRG_ORG_NAME = null;
		m_h_MODIFY_COUNT = null;
		m_h_ANS_DLV_DATE_EXIST_FLG = null;
		m_h_T_SHIP_ODR_EXIST_FLG = null;
		m_STOCK_UNIT = null;
		m_PKG_UNIT = null;
		m_UNIT_QTY_TYP = null;
		m_COMPANY_CD = null;
		m_h_ODR_UNIT_PRICE = null;
		m_h_BUSINESS_OPR_DATE = null;
		m_DLV_LOC_NAME = null;
		m_ODR_NO = null;
		m_REMAIN_UNCONFIRM_ODR_QTY = null;
		m_BUSINESS_OPR_DATE = null;
		m_PLANT_CD = null;
		m_CODE = null;
		m_CLASS_CODE = null;
		m_MAX_ALCTED_SEQ_CD = null;
		m_MAX_ODR_NO = null;
		m_h_ALCTED_UNCONFIRM_ODR_QTY = null;
		m_IN_ODR_NO = null;

		l_SPCL_PRICE_TYP_name = null;
		l_SPCL_PRICE_TYP_val = null;
		l_h_ODR_QTY = null;
		l_h_DESINATED_DLV_DATE = null;
		l_h_SPCL_PRICE_TYP = null;
		l_h_CUS_DLV_KEY_CD = null;
		l_h_CUS_DLV_CD = null;
		l_h_DLV_LOC_CD = null;
		l_APPR_REMARKS = null;
		l_h_APR_ODR = null;
		l_ODR_UNIT_PRICE = null;
		l_SPCL_PRICE_TYP = null;
		l_DESINATED_DLV_DATE = null;
		l_STD_DESINATED_RCV_DATE = null;
		l_ODR_QTY = null;
		l_UNCONFIRM_ODR_BALANCE = null;
		l_ODR_AMOUNT = null;
		l_ODR_AMOUNT_EXCH_RATES = null;
		l_CUS_DLV_CD = null;
		l_CUS_DLV_KEY_CD = null;
		l_h_REMAIN_UNCONFIRM_ODR_QTY = null;
		l_CANCELED_UNCONFIRM_ODR_QTY = null;
		l_h_SHIP_PLAN_REMAIN_QTY = null;
		l_SHIP_PLAN_CMPLT_FLG = null;
		l_PUCH_ODR_QTY_TOTAL = null;
		l_REMARKS = null;
		l_DLV_LOC_CD = null;
		l_DLV_LOC_NAME_KANJI = null;
		l_CUST_ODR_NO = null;
		l_h_ODR_NO = null;
		l_RSLT_CTL_SEQ_CD = null;
		l_ODR_CTL_NO = null;
		l_h_ODR_TYP = null;
		l_CUST_CD = null;
		l_CUST_ITEM_CD = null;
		l_ITEM_CD = null;
		l_UNIT_CD = null;
		l_CURRNCY_CD = null;
		l_DEPO_TYP = null;
		l_CUST_CHRG_PSN_CD = null;
		l_ODR_ACPT_PSN_CD = null;
		l_ODR_ACPT_DATE = null;
		l_fkgnALCTED_UNCONFIRM_ODR_NO = null;
		l_fkgnALCTED_UNCONFIRM_ODR_QTY = null;
		l_fkgnALCTED_SEQ_CD = null;
		l_fkgnREMAIN_UNCONFIRM_ODR_QTY = null;
		l_fkgnODR_UNIT_PRICE = null;
		l_fkgnCURRNCY_CD = null;
		l_fkgnODR_QTY = null;
		l_fkgnODR_TYP = null;
		l_fkgnFIXED_ODR_NO = null;
		l_fkgnDEL_FLG = null;
		l_fkgnUNCONFIRM_ODR_BALANCE = null;
		l_fkgnODR_NO = null;
		l_IF_CTL_NO = null;
		l_UNIT_NAME = null;
		l_ITEM_NAME = null;
		l_CUST_ANAME = null;
		l_EXCH_TYP = null;
		l_DETAIL_ROUND_TYP = null;
		l_CUST_ITEM_NAME = null;
		l_ODR_TYP = null;
		l_CUST_CHRG_PSN_NAME = null;
		l_CUST_CHRG_ORG_CD = null;
		l_CUST_CHRG_ORG_NAME = null;
		l_h_MODIFY_COUNT = null;
		l_h_ANS_DLV_DATE_EXIST_FLG = null;
		l_h_T_SHIP_ODR_EXIST_FLG = null;
		l_STOCK_UNIT = null;
		l_PKG_UNIT = null;
		l_UNIT_QTY_TYP = null;
		l_COMPANY_CD = null;
		l_h_ODR_UNIT_PRICE = null;
		l_h_BUSINESS_OPR_DATE = null;
		l_DLV_LOC_NAME = null;
		l_ODR_NO = null;
		l_REMAIN_UNCONFIRM_ODR_QTY = null;
		l_BUSINESS_OPR_DATE = null;
		l_PLANT_CD = null;
		l_CODE = null;
		l_CLASS_CODE = null;
		l_MAX_ALCTED_SEQ_CD = null;
		l_MAX_ODR_NO = null;
		l_h_ALCTED_UNCONFIRM_ODR_QTY = null;
		l_IN_ODR_NO = null;

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
	 * medKQ0010020クラスの標準コンストラクタ
	 */
	public KQ0010020Struct()
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
	public void setStruct(KQ0010020Struct struct)
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
	public void setStructM(KQ0010020Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setSPCL_PRICE_TYP_name(struct.getSPCL_PRICE_TYP_name());
			this.setSPCL_PRICE_TYP_val(struct.getSPCL_PRICE_TYP_val());
			this.seth_ODR_QTY(struct.geth_ODR_QTY());
			this.seth_DESINATED_DLV_DATE(struct.geth_DESINATED_DLV_DATE());
			this.seth_SPCL_PRICE_TYP(struct.geth_SPCL_PRICE_TYP());
			this.seth_CUS_DLV_KEY_CD(struct.geth_CUS_DLV_KEY_CD());
			this.seth_CUS_DLV_CD(struct.geth_CUS_DLV_CD());
			this.seth_DLV_LOC_CD(struct.geth_DLV_LOC_CD());
			this.setAPPR_REMARKS(struct.getAPPR_REMARKS());
			this.seth_APR_ODR(struct.geth_APR_ODR());
			this.setODR_UNIT_PRICE(struct.getODR_UNIT_PRICE());
			this.setSPCL_PRICE_TYP(struct.getSPCL_PRICE_TYP());
			this.setDESINATED_DLV_DATE(struct.getDESINATED_DLV_DATE());
			this.setSTD_DESINATED_RCV_DATE(struct.getSTD_DESINATED_RCV_DATE());
			this.setODR_QTY(struct.getODR_QTY());
			this.setUNCONFIRM_ODR_BALANCE(struct.getUNCONFIRM_ODR_BALANCE());
			this.setODR_AMOUNT(struct.getODR_AMOUNT());
			this.setODR_AMOUNT_EXCH_RATES(struct.getODR_AMOUNT_EXCH_RATES());
			this.setCUS_DLV_CD(struct.getCUS_DLV_CD());
			this.setCUS_DLV_KEY_CD(struct.getCUS_DLV_KEY_CD());
			this.seth_REMAIN_UNCONFIRM_ODR_QTY(struct.geth_REMAIN_UNCONFIRM_ODR_QTY());
			this.setCANCELED_UNCONFIRM_ODR_QTY(struct.getCANCELED_UNCONFIRM_ODR_QTY());
			this.seth_SHIP_PLAN_REMAIN_QTY(struct.geth_SHIP_PLAN_REMAIN_QTY());
			this.setSHIP_PLAN_CMPLT_FLG(struct.getSHIP_PLAN_CMPLT_FLG());
			this.setPUCH_ODR_QTY_TOTAL(struct.getPUCH_ODR_QTY_TOTAL());
			this.setREMARKS(struct.getREMARKS());
			this.setDLV_LOC_CD(struct.getDLV_LOC_CD());
			this.setDLV_LOC_NAME_KANJI(struct.getDLV_LOC_NAME_KANJI());
			this.setCUST_ODR_NO(struct.getCUST_ODR_NO());
			this.seth_ODR_NO(struct.geth_ODR_NO());
			this.setRSLT_CTL_SEQ_CD(struct.getRSLT_CTL_SEQ_CD());
			this.setODR_CTL_NO(struct.getODR_CTL_NO());
			this.seth_ODR_TYP(struct.geth_ODR_TYP());
			this.setCUST_CD(struct.getCUST_CD());
			this.setCUST_ITEM_CD(struct.getCUST_ITEM_CD());
			this.setITEM_CD(struct.getITEM_CD());
			this.setUNIT_CD(struct.getUNIT_CD());
			this.setCURRNCY_CD(struct.getCURRNCY_CD());
			this.setDEPO_TYP(struct.getDEPO_TYP());
			this.setCUST_CHRG_PSN_CD(struct.getCUST_CHRG_PSN_CD());
			this.setODR_ACPT_PSN_CD(struct.getODR_ACPT_PSN_CD());
			this.setODR_ACPT_DATE(struct.getODR_ACPT_DATE());
			this.setfkgnALCTED_UNCONFIRM_ODR_NO(struct.getfkgnALCTED_UNCONFIRM_ODR_NO());
			this.setfkgnALCTED_UNCONFIRM_ODR_QTY(struct.getfkgnALCTED_UNCONFIRM_ODR_QTY());
			this.setfkgnALCTED_SEQ_CD(struct.getfkgnALCTED_SEQ_CD());
			this.setfkgnREMAIN_UNCONFIRM_ODR_QTY(struct.getfkgnREMAIN_UNCONFIRM_ODR_QTY());
			this.setfkgnODR_UNIT_PRICE(struct.getfkgnODR_UNIT_PRICE());
			this.setfkgnCURRNCY_CD(struct.getfkgnCURRNCY_CD());
			this.setfkgnODR_QTY(struct.getfkgnODR_QTY());
			this.setfkgnODR_TYP(struct.getfkgnODR_TYP());
			this.setfkgnFIXED_ODR_NO(struct.getfkgnFIXED_ODR_NO());
			this.setfkgnDEL_FLG(struct.getfkgnDEL_FLG());
			this.setfkgnUNCONFIRM_ODR_BALANCE(struct.getfkgnUNCONFIRM_ODR_BALANCE());
			this.setfkgnODR_NO(struct.getfkgnODR_NO());
			this.setIF_CTL_NO(struct.getIF_CTL_NO());
			this.setUNIT_NAME(struct.getUNIT_NAME());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setCUST_ANAME(struct.getCUST_ANAME());
			this.setEXCH_TYP(struct.getEXCH_TYP());
			this.setDETAIL_ROUND_TYP(struct.getDETAIL_ROUND_TYP());
			this.setCUST_ITEM_NAME(struct.getCUST_ITEM_NAME());
			this.setODR_TYP(struct.getODR_TYP());
			this.setCUST_CHRG_PSN_NAME(struct.getCUST_CHRG_PSN_NAME());
			this.setCUST_CHRG_ORG_CD(struct.getCUST_CHRG_ORG_CD());
			this.setCUST_CHRG_ORG_NAME(struct.getCUST_CHRG_ORG_NAME());
			this.seth_MODIFY_COUNT(struct.geth_MODIFY_COUNT());
			this.seth_ANS_DLV_DATE_EXIST_FLG(struct.geth_ANS_DLV_DATE_EXIST_FLG());
			this.seth_T_SHIP_ODR_EXIST_FLG(struct.geth_T_SHIP_ODR_EXIST_FLG());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setPKG_UNIT(struct.getPKG_UNIT());
			this.setUNIT_QTY_TYP(struct.getUNIT_QTY_TYP());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.seth_ODR_UNIT_PRICE(struct.geth_ODR_UNIT_PRICE());
			this.seth_BUSINESS_OPR_DATE(struct.geth_BUSINESS_OPR_DATE());
			this.setDLV_LOC_NAME(struct.getDLV_LOC_NAME());
			this.setODR_NO(struct.getODR_NO());
			this.setREMAIN_UNCONFIRM_ODR_QTY(struct.getREMAIN_UNCONFIRM_ODR_QTY());
			this.setBUSINESS_OPR_DATE(struct.getBUSINESS_OPR_DATE());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setCODE(struct.getCODE());
			this.setCLASS_CODE(struct.getCLASS_CODE());
			this.setMAX_ALCTED_SEQ_CD(struct.getMAX_ALCTED_SEQ_CD());
			this.setMAX_ODR_NO(struct.getMAX_ODR_NO());
			this.seth_ALCTED_UNCONFIRM_ODR_QTY(struct.geth_ALCTED_UNCONFIRM_ODR_QTY());
			this.setIN_ODR_NO(struct.getIN_ODR_NO());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(KQ0010020Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_SPCL_PRICE_TYP_name(struct.getList_SPCL_PRICE_TYP_name());
			this.setList_SPCL_PRICE_TYP_val(struct.getList_SPCL_PRICE_TYP_val());
			this.setList_h_ODR_QTY(struct.getList_h_ODR_QTY());
			this.setList_h_DESINATED_DLV_DATE(struct.getList_h_DESINATED_DLV_DATE());
			this.setList_h_SPCL_PRICE_TYP(struct.getList_h_SPCL_PRICE_TYP());
			this.setList_h_CUS_DLV_KEY_CD(struct.getList_h_CUS_DLV_KEY_CD());
			this.setList_h_CUS_DLV_CD(struct.getList_h_CUS_DLV_CD());
			this.setList_h_DLV_LOC_CD(struct.getList_h_DLV_LOC_CD());
			this.setList_APPR_REMARKS(struct.getList_APPR_REMARKS());
			this.setList_h_APR_ODR(struct.getList_h_APR_ODR());
			this.setList_ODR_UNIT_PRICE(struct.getList_ODR_UNIT_PRICE());
			this.setList_SPCL_PRICE_TYP(struct.getList_SPCL_PRICE_TYP());
			this.setList_DESINATED_DLV_DATE(struct.getList_DESINATED_DLV_DATE());
			this.setList_STD_DESINATED_RCV_DATE(struct.getList_STD_DESINATED_RCV_DATE());
			this.setList_ODR_QTY(struct.getList_ODR_QTY());
			this.setList_UNCONFIRM_ODR_BALANCE(struct.getList_UNCONFIRM_ODR_BALANCE());
			this.setList_ODR_AMOUNT(struct.getList_ODR_AMOUNT());
			this.setList_ODR_AMOUNT_EXCH_RATES(struct.getList_ODR_AMOUNT_EXCH_RATES());
			this.setList_CUS_DLV_CD(struct.getList_CUS_DLV_CD());
			this.setList_CUS_DLV_KEY_CD(struct.getList_CUS_DLV_KEY_CD());
			this.setList_h_REMAIN_UNCONFIRM_ODR_QTY(struct.getList_h_REMAIN_UNCONFIRM_ODR_QTY());
			this.setList_CANCELED_UNCONFIRM_ODR_QTY(struct.getList_CANCELED_UNCONFIRM_ODR_QTY());
			this.setList_h_SHIP_PLAN_REMAIN_QTY(struct.getList_h_SHIP_PLAN_REMAIN_QTY());
			this.setList_SHIP_PLAN_CMPLT_FLG(struct.getList_SHIP_PLAN_CMPLT_FLG());
			this.setList_PUCH_ODR_QTY_TOTAL(struct.getList_PUCH_ODR_QTY_TOTAL());
			this.setList_REMARKS(struct.getList_REMARKS());
			this.setList_DLV_LOC_CD(struct.getList_DLV_LOC_CD());
			this.setList_DLV_LOC_NAME_KANJI(struct.getList_DLV_LOC_NAME_KANJI());
			this.setList_CUST_ODR_NO(struct.getList_CUST_ODR_NO());
			this.setList_h_ODR_NO(struct.getList_h_ODR_NO());
			this.setList_RSLT_CTL_SEQ_CD(struct.getList_RSLT_CTL_SEQ_CD());
			this.setList_ODR_CTL_NO(struct.getList_ODR_CTL_NO());
			this.setList_h_ODR_TYP(struct.getList_h_ODR_TYP());
			this.setList_CUST_CD(struct.getList_CUST_CD());
			this.setList_CUST_ITEM_CD(struct.getList_CUST_ITEM_CD());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_UNIT_CD(struct.getList_UNIT_CD());
			this.setList_CURRNCY_CD(struct.getList_CURRNCY_CD());
			this.setList_DEPO_TYP(struct.getList_DEPO_TYP());
			this.setList_CUST_CHRG_PSN_CD(struct.getList_CUST_CHRG_PSN_CD());
			this.setList_ODR_ACPT_PSN_CD(struct.getList_ODR_ACPT_PSN_CD());
			this.setList_ODR_ACPT_DATE(struct.getList_ODR_ACPT_DATE());
			this.setList_fkgnALCTED_UNCONFIRM_ODR_NO(struct.getList_fkgnALCTED_UNCONFIRM_ODR_NO());
			this.setList_fkgnALCTED_UNCONFIRM_ODR_QTY(struct.getList_fkgnALCTED_UNCONFIRM_ODR_QTY());
			this.setList_fkgnALCTED_SEQ_CD(struct.getList_fkgnALCTED_SEQ_CD());
			this.setList_fkgnREMAIN_UNCONFIRM_ODR_QTY(struct.getList_fkgnREMAIN_UNCONFIRM_ODR_QTY());
			this.setList_fkgnODR_UNIT_PRICE(struct.getList_fkgnODR_UNIT_PRICE());
			this.setList_fkgnCURRNCY_CD(struct.getList_fkgnCURRNCY_CD());
			this.setList_fkgnODR_QTY(struct.getList_fkgnODR_QTY());
			this.setList_fkgnODR_TYP(struct.getList_fkgnODR_TYP());
			this.setList_fkgnFIXED_ODR_NO(struct.getList_fkgnFIXED_ODR_NO());
			this.setList_fkgnDEL_FLG(struct.getList_fkgnDEL_FLG());
			this.setList_fkgnUNCONFIRM_ODR_BALANCE(struct.getList_fkgnUNCONFIRM_ODR_BALANCE());
			this.setList_fkgnODR_NO(struct.getList_fkgnODR_NO());
			this.setList_IF_CTL_NO(struct.getList_IF_CTL_NO());
			this.setList_UNIT_NAME(struct.getList_UNIT_NAME());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_CUST_ANAME(struct.getList_CUST_ANAME());
			this.setList_EXCH_TYP(struct.getList_EXCH_TYP());
			this.setList_DETAIL_ROUND_TYP(struct.getList_DETAIL_ROUND_TYP());
			this.setList_CUST_ITEM_NAME(struct.getList_CUST_ITEM_NAME());
			this.setList_ODR_TYP(struct.getList_ODR_TYP());
			this.setList_CUST_CHRG_PSN_NAME(struct.getList_CUST_CHRG_PSN_NAME());
			this.setList_CUST_CHRG_ORG_CD(struct.getList_CUST_CHRG_ORG_CD());
			this.setList_CUST_CHRG_ORG_NAME(struct.getList_CUST_CHRG_ORG_NAME());
			this.setList_h_MODIFY_COUNT(struct.getList_h_MODIFY_COUNT());
			this.setList_h_ANS_DLV_DATE_EXIST_FLG(struct.getList_h_ANS_DLV_DATE_EXIST_FLG());
			this.setList_h_T_SHIP_ODR_EXIST_FLG(struct.getList_h_T_SHIP_ODR_EXIST_FLG());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_PKG_UNIT(struct.getList_PKG_UNIT());
			this.setList_UNIT_QTY_TYP(struct.getList_UNIT_QTY_TYP());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_h_ODR_UNIT_PRICE(struct.getList_h_ODR_UNIT_PRICE());
			this.setList_h_BUSINESS_OPR_DATE(struct.getList_h_BUSINESS_OPR_DATE());
			this.setList_DLV_LOC_NAME(struct.getList_DLV_LOC_NAME());
			this.setList_ODR_NO(struct.getList_ODR_NO());
			this.setList_REMAIN_UNCONFIRM_ODR_QTY(struct.getList_REMAIN_UNCONFIRM_ODR_QTY());
			this.setList_BUSINESS_OPR_DATE(struct.getList_BUSINESS_OPR_DATE());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_CODE(struct.getList_CODE());
			this.setList_CLASS_CODE(struct.getList_CLASS_CODE());
			this.setList_MAX_ALCTED_SEQ_CD(struct.getList_MAX_ALCTED_SEQ_CD());
			this.setList_MAX_ODR_NO(struct.getList_MAX_ODR_NO());
			this.setList_h_ALCTED_UNCONFIRM_ODR_QTY(struct.getList_h_ALCTED_UNCONFIRM_ODR_QTY());
			this.setList_IN_ODR_NO(struct.getList_IN_ODR_NO());
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
	// 第 1 変数初期値： i_SPCL_PRICE_TYP_name


	final static String i_SPCL_PRICE_TYP_name = null;

	// 第 2 変数初期値： i_SPCL_PRICE_TYP_val


	final static String i_SPCL_PRICE_TYP_val = null;

	// 第 3 変数初期値： i_h_ODR_QTY


	final static String i_h_ODR_QTY = null;

	// 第 4 変数初期値： i_h_DESINATED_DLV_DATE


	final static String i_h_DESINATED_DLV_DATE = null;

	// 第 5 変数初期値： i_h_SPCL_PRICE_TYP


	final static String i_h_SPCL_PRICE_TYP = null;

	// 第 6 変数初期値： i_h_CUS_DLV_KEY_CD


	final static String i_h_CUS_DLV_KEY_CD = null;

	// 第 7 変数初期値： i_h_CUS_DLV_CD


	final static String i_h_CUS_DLV_CD = null;

	// 第 8 変数初期値： i_h_DLV_LOC_CD


	final static String i_h_DLV_LOC_CD = null;

	// 第 9 変数初期値： i_APPR_REMARKS


	final static String i_APPR_REMARKS = null;

	// 第 10 変数初期値： i_h_APR_ODR


	final static String i_h_APR_ODR = null;

	// 第 11 変数初期値： i_ODR_UNIT_PRICE


	final static String i_ODR_UNIT_PRICE = null;

	// 第 12 変数初期値： i_SPCL_PRICE_TYP


	final static String i_SPCL_PRICE_TYP = null;

	// 第 13 変数初期値： i_DESINATED_DLV_DATE


	final static String i_DESINATED_DLV_DATE = null;

	// 第 14 変数初期値： i_STD_DESINATED_RCV_DATE


	final static String i_STD_DESINATED_RCV_DATE = null;

	// 第 15 変数初期値： i_ODR_QTY


	final static String i_ODR_QTY = null;

	// 第 16 変数初期値： i_UNCONFIRM_ODR_BALANCE


	final static Double i_UNCONFIRM_ODR_BALANCE = null;

	// 第 17 変数初期値： i_ODR_AMOUNT


	final static Double i_ODR_AMOUNT = null;

	// 第 18 変数初期値： i_ODR_AMOUNT_EXCH_RATES


	final static Double i_ODR_AMOUNT_EXCH_RATES = null;

	// 第 19 変数初期値： i_CUS_DLV_CD


	final static String i_CUS_DLV_CD = null;

	// 第 20 変数初期値： i_CUS_DLV_KEY_CD


	final static String i_CUS_DLV_KEY_CD = null;

	// 第 21 変数初期値： i_h_REMAIN_UNCONFIRM_ODR_QTY


	final static String i_h_REMAIN_UNCONFIRM_ODR_QTY = null;

	// 第 22 変数初期値： i_CANCELED_UNCONFIRM_ODR_QTY


	final static String i_CANCELED_UNCONFIRM_ODR_QTY = null;

	// 第 23 変数初期値： i_h_SHIP_PLAN_REMAIN_QTY


	final static String i_h_SHIP_PLAN_REMAIN_QTY = null;

	// 第 24 変数初期値： i_SHIP_PLAN_CMPLT_FLG


	final static String i_SHIP_PLAN_CMPLT_FLG = null;

	// 第 25 変数初期値： i_PUCH_ODR_QTY_TOTAL


	final static String i_PUCH_ODR_QTY_TOTAL = null;

	// 第 26 変数初期値： i_REMARKS


	final static String i_REMARKS = null;

	// 第 27 変数初期値： i_DLV_LOC_CD


	final static String i_DLV_LOC_CD = null;

	// 第 28 変数初期値： i_DLV_LOC_NAME_KANJI


	final static String i_DLV_LOC_NAME_KANJI = null;

	// 第 29 変数初期値： i_CUST_ODR_NO


	final static String i_CUST_ODR_NO = null;

	// 第 30 変数初期値： i_h_ODR_NO


	final static String i_h_ODR_NO = null;

	// 第 31 変数初期値： i_RSLT_CTL_SEQ_CD


	final static String i_RSLT_CTL_SEQ_CD = null;

	// 第 32 変数初期値： i_ODR_CTL_NO


	final static String i_ODR_CTL_NO = null;

	// 第 33 変数初期値： i_h_ODR_TYP


	final static String i_h_ODR_TYP = null;

	// 第 34 変数初期値： i_CUST_CD


	final static String i_CUST_CD = null;

	// 第 35 変数初期値： i_CUST_ITEM_CD


	final static String i_CUST_ITEM_CD = null;

	// 第 36 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 37 変数初期値： i_UNIT_CD


	final static String i_UNIT_CD = null;

	// 第 38 変数初期値： i_CURRNCY_CD


	final static String i_CURRNCY_CD = null;

	// 第 39 変数初期値： i_DEPO_TYP


	final static String i_DEPO_TYP = null;

	// 第 40 変数初期値： i_CUST_CHRG_PSN_CD


	final static String i_CUST_CHRG_PSN_CD = null;

	// 第 41 変数初期値： i_ODR_ACPT_PSN_CD


	final static String i_ODR_ACPT_PSN_CD = null;

	// 第 42 変数初期値： i_ODR_ACPT_DATE


	final static String i_ODR_ACPT_DATE = null;

	// 第 43 変数初期値： i_fkgnALCTED_UNCONFIRM_ODR_NO


	final static String i_fkgnALCTED_UNCONFIRM_ODR_NO = null;

	// 第 44 変数初期値： i_fkgnALCTED_UNCONFIRM_ODR_QTY


	final static Double i_fkgnALCTED_UNCONFIRM_ODR_QTY = null;

	// 第 45 変数初期値： i_fkgnALCTED_SEQ_CD


	final static String i_fkgnALCTED_SEQ_CD = null;

	// 第 46 変数初期値： i_fkgnREMAIN_UNCONFIRM_ODR_QTY


	final static Double i_fkgnREMAIN_UNCONFIRM_ODR_QTY = null;

	// 第 47 変数初期値： i_fkgnODR_UNIT_PRICE


	final static Double i_fkgnODR_UNIT_PRICE = null;

	// 第 48 変数初期値： i_fkgnCURRNCY_CD


	final static String i_fkgnCURRNCY_CD = null;

	// 第 49 変数初期値： i_fkgnODR_QTY


	final static Double i_fkgnODR_QTY = null;

	// 第 50 変数初期値： i_fkgnODR_TYP


	final static String i_fkgnODR_TYP = null;

	// 第 51 変数初期値： i_fkgnFIXED_ODR_NO


	final static String i_fkgnFIXED_ODR_NO = null;

	// 第 52 変数初期値： i_fkgnDEL_FLG


	final static String i_fkgnDEL_FLG = null;

	// 第 53 変数初期値： i_fkgnUNCONFIRM_ODR_BALANCE


	final static Double i_fkgnUNCONFIRM_ODR_BALANCE = null;

	// 第 54 変数初期値： i_fkgnODR_NO


	final static String i_fkgnODR_NO = null;

	// 第 55 変数初期値： i_IF_CTL_NO


	final static String i_IF_CTL_NO = null;

	// 第 56 変数初期値： i_UNIT_NAME


	final static String i_UNIT_NAME = null;

	// 第 57 変数初期値： i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// 第 58 変数初期値： i_CUST_ANAME


	final static String i_CUST_ANAME = null;

	// 第 59 変数初期値： i_EXCH_TYP


	final static String i_EXCH_TYP = null;

	// 第 60 変数初期値： i_DETAIL_ROUND_TYP


	final static String i_DETAIL_ROUND_TYP = null;

	// 第 61 変数初期値： i_CUST_ITEM_NAME


	final static String i_CUST_ITEM_NAME = null;

	// 第 62 変数初期値： i_ODR_TYP


	final static String i_ODR_TYP = null;

	// 第 63 変数初期値： i_CUST_CHRG_PSN_NAME


	final static String i_CUST_CHRG_PSN_NAME = null;

	// 第 64 変数初期値： i_CUST_CHRG_ORG_CD


	final static String i_CUST_CHRG_ORG_CD = null;

	// 第 65 変数初期値： i_CUST_CHRG_ORG_NAME


	final static String i_CUST_CHRG_ORG_NAME = null;

	// 第 66 変数初期値： i_h_MODIFY_COUNT


	final static String i_h_MODIFY_COUNT = null;

	// 第 67 変数初期値： i_h_ANS_DLV_DATE_EXIST_FLG


	final static String i_h_ANS_DLV_DATE_EXIST_FLG = null;

	// 第 68 変数初期値： i_h_T_SHIP_ODR_EXIST_FLG


	final static String i_h_T_SHIP_ODR_EXIST_FLG = null;

	// 第 69 変数初期値： i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// 第 70 変数初期値： i_PKG_UNIT


	final static String i_PKG_UNIT = null;

	// 第 71 変数初期値： i_UNIT_QTY_TYP


	final static String i_UNIT_QTY_TYP = null;

	// 第 72 変数初期値： i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// 第 73 変数初期値： i_h_ODR_UNIT_PRICE


	final static String i_h_ODR_UNIT_PRICE = null;

	// 第 74 変数初期値： i_h_BUSINESS_OPR_DATE


	final static String i_h_BUSINESS_OPR_DATE = null;

	// 第 75 変数初期値： i_DLV_LOC_NAME


	final static String i_DLV_LOC_NAME = null;

	// 第 76 変数初期値： i_ODR_NO


	final static String i_ODR_NO = null;

	// 第 77 変数初期値： i_REMAIN_UNCONFIRM_ODR_QTY


	final static String i_REMAIN_UNCONFIRM_ODR_QTY = null;

	// 第 78 変数初期値： i_BUSINESS_OPR_DATE


	final static String i_BUSINESS_OPR_DATE = null;

	// 第 79 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

	// 第 80 変数初期値： i_CODE


	final static String i_CODE = null;

	// 第 81 変数初期値： i_CLASS_CODE


	final static String i_CLASS_CODE = null;

	// 第 82 変数初期値： i_MAX_ALCTED_SEQ_CD


	final static Double i_MAX_ALCTED_SEQ_CD = null;

	// 第 83 変数初期値： i_MAX_ODR_NO


	final static String i_MAX_ODR_NO = null;

	// 第 84 変数初期値： i_h_ALCTED_UNCONFIRM_ODR_QTY


	final static String i_h_ALCTED_UNCONFIRM_ODR_QTY = null;

	// 第 85 変数初期値： i_IN_ODR_NO


	final static String i_IN_ODR_NO = null;

*/

	//{{user_implement_code
		// TODO: 初期化で使う定数は、ここに記述してください。
		// 以下に記述した内容は自動的には変更されません。
	// 第 1 変数初期値： i_updODR_UNIT_PRICE
	final static Double i_updODR_UNIT_PRICE = null;
	// 第 2 変数初期値： i_updSPCL_PRICE_TYP
	final static String i_updSPCL_PRICE_TYP = null;
	// 第 3 変数初期値： i_updDEPO_TYP
	final static String i_updDEPO_TYP = null;
	// 第 4 変数初期値： i_updDESINATED_DLV_DATE
	final static String i_updDESINATED_DLV_DATE = null;
	// 第 5 変数初期値： i_updSTD_DESINATED_RCV_DATE
	final static String i_updSTD_DESINATED_RCV_DATE = null;
	// 第 6 変数初期値： i_updODR_QTY
	final static Double i_updODR_QTY = null;
	// 第 7 変数初期値： i_updUNIT_CD
	final static String i_updUNIT_CD = null;
	// 第 8 変数初期値： i_updUNCONFIRM_ODR_BALANCE
	final static Double i_updUNCONFIRM_ODR_BALANCE = null;
	// 第 9 変数初期値： i_updODR_AMOUNT
	final static Double i_updODR_AMOUNT = null;
	// 第 10 変数初期値： i_updODR_AMOUNT_EXCH_RATES
	final static Double i_updODR_AMOUNT_EXCH_RATES = null;
	// 第 11 変数初期値： i_updCUS_DLV_CD
	final static String i_updCUS_DLV_CD = null;
	// 第 12 変数初期値： i_updCUS_DLV_KEY_CD
	final static String i_updCUS_DLV_KEY_CD = null;
	// 第 13 変数初期値： i_updREMAIN_UNCONFIRM_ODR_QTY
	final static Double i_updREMAIN_UNCONFIRM_ODR_QTY = null;
	// 第 14 変数初期値： i_updCANCELED_UNCONFIRM_ODR_QTY
	final static Double i_updCANCELED_UNCONFIRM_ODR_QTY = null;
	// 第 15 変数初期値： i_updSHIP_PLAN_REMAIN_QTY
	final static Double i_updSHIP_PLAN_REMAIN_QTY = null;
	// 第 16 変数初期値： i_updSHIP_PLAN_CMPLT_FLG
	final static String i_updSHIP_PLAN_CMPLT_FLG = null;
	// 第 17 変数初期値： i_updPUCH_ODR_QTY_TOTAL
	final static Double i_updPUCH_ODR_QTY_TOTAL = null;
	// 第 18 変数初期値： i_updODR_NO
	final static String i_updODR_NO = null;
	// 第 19 変数初期値： i_hisRSLT_CTL_SEQ_CD
	final static Double i_hisRSLT_CTL_SEQ_CD = null;
	// 第 20 変数初期値： i_hisODR_CTL_NO
	final static String i_hisODR_CTL_NO = null;
	// 第 21 変数初期値： i_hisODR_NO
	final static String i_hisODR_NO = null;
	// 第 22 変数初期値： i_hisCUST_ODR_NO
	final static String i_hisCUST_ODR_NO = null;
	// 第 23 変数初期値： i_hisODR_TYP
	final static String i_hisODR_TYP = null;
	// 第 24 変数初期値： i_hisCUST_CD
	final static String i_hisCUST_CD = null;
	// 第 25 変数初期値： i_hisCUST_ITEM_CD
	final static String i_hisCUST_ITEM_CD = null;
	// 第 26 変数初期値： i_hisITEM_CD
	final static String i_hisITEM_CD = null;
	// 第 27 変数初期値： i_hisDESINATED_DLV_DATE
	final static String i_hisDESINATED_DLV_DATE = null;
	// 第 28 変数初期値： i_hisODR_QTY
	final static Double i_hisODR_QTY = null;
	// 第 29 変数初期値： i_hisUNIT_CD
	final static String i_hisUNIT_CD = null;
	// 第 30 変数初期値： i_hisDLV_LOC_CD
	final static String i_hisDLV_LOC_CD = null;
	// 第 31 変数初期値： i_hisODR_UNIT_PRICE
	final static Double i_hisODR_UNIT_PRICE = null;
	// 第 32 変数初期値： i_hisCURRNCY_CD
	final static String i_hisCURRNCY_CD = null;
	// 第 33 変数初期値： i_hisSPCL_PRICE_TYP
	final static String i_hisSPCL_PRICE_TYP = null;
	// 第 34 変数初期値： i_hisDEPO_TYP
	final static String i_hisDEPO_TYP = null;
	// 第 35 変数初期値： i_hisCUS_DLV_CD
	final static String i_hisCUS_DLV_CD = null;
	// 第 36 変数初期値： i_hisCUS_DLV_KEY_CD
	final static String i_hisCUS_DLV_KEY_CD = null;
	// 第 37 変数初期値： i_hisREMARKS
	final static String i_hisREMARKS = null;
	// 第 38 変数初期値： i_hisCUST_CHRG_PSN_CD
	final static String i_hisCUST_CHRG_PSN_CD = null;
	// 第 39 変数初期値： i_hisODR_ACPT_PSN_CD
	final static String i_hisODR_ACPT_PSN_CD = null;
	// 第 40 変数初期値： i_hisODR_ACPT_DATE
	final static String i_hisODR_ACPT_DATE = null;
	// 第 41 変数初期値： i_strCUST_ANAME
	final static String i_strCUST_ANAME = null;
	// 第 42 変数初期値： i_strCOMPANY_CD
	final static String i_strCOMPANY_CD = null;
	// 第 43 変数初期値： i_strCUR_CD
	final static String i_strCUR_CD = null;
	// 第 44 変数初期値： i_strOWN_ORG_CD
	final static String i_strOWN_ORG_CD = null;
	// 第 45 変数初期値： i_strOWN_PERSON_CD
	final static String i_strOWN_PERSON_CD = null;
	// 第 46 変数初期値： i_strDEPO_TYP
	final static String i_strDEPO_TYP = null;
	// 第 47 変数初期値： i_strPARTIAL_SHIP_INST_FLG
	final static String i_strPARTIAL_SHIP_INST_FLG = null;
	// 第 48 変数初期値： i_strEXCH_TYP
	final static Double i_strEXCH_TYP = null;
	// 第 49 変数初期値： i_strTAX_APPLY_TYP
	final static String i_strTAX_APPLY_TYP = null;
	// 第 50 変数初期値： i_strTAX_CD
	final static String i_strTAX_CD = null;
	// 第 51 変数初期値： i_strTAX_CALC_TYP
	final static String i_strTAX_CALC_TYP = null;
	// 第 52 変数初期値： i_strUNCONFIRM_ODR_EFF_PRIOD
	final static Double i_strUNCONFIRM_ODR_EFF_PRIOD = null;
	// 第 53 変数初期値： i_strUNCONFIRM_ODR_EFF_TERM_FLG
	final static String i_strUNCONFIRM_ODR_EFF_TERM_FLG = null;
	// 第 54 変数初期値： i_strROUND_TYP
	final static String i_strROUND_TYP = null;
	// 第 55 変数初期値： i_strCUST_CD
	final static String i_strCUST_CD = null;
	// 第 56 変数初期値： i_strCUR_NAME
	final static String i_strCUR_NAME = null;
	// 第 57 変数初期値： i_strDLV_LOC_CD
	final static String i_strDLV_LOC_CD = null;
	// 第 58 変数初期値： i_strTRANSPORT_LT
	final static Double i_strTRANSPORT_LT = null;
	// 第 59 変数初期値： i_strTRANSPORT_CD
	final static String i_strTRANSPORT_CD = null;
	// 第 60 変数初期値： i_strCAL_NO
	final static Double i_strCAL_NO = null;
	// 第 61 変数初期値： i_strTRANSPORT_TYP
	final static String i_strTRANSPORT_TYP = null;
	// 第 62 変数初期値： i_strDLV_LOC_NAME
	final static String i_strDLV_LOC_NAME = null;
	// 第 63 変数初期値： i_strEXCH_RATE
	final static Double i_strEXCH_RATE = null;
	// 第 64 変数初期値： i_strCompareEXCH_DATE
	final static String i_strCompareEXCH_DATE = null;
	// 第 65 変数初期値： i_strSTOCK_UNIT
	final static String i_strSTOCK_UNIT = null;
	// 第 66 変数初期値： i_strITEM_NAME
	final static String i_strITEM_NAME = null;
	// 第 67 変数初期値： i_strOUTSIDE_TYP
	final static Double i_strOUTSIDE_TYP = null;
	// 第 68 変数初期値： i_strITEM_CD
	final static String i_strITEM_CD = null;
	// 第 69 変数初期値： i_strUSER_NAME
	final static String i_strUSER_NAME = null;
	// 第 70 変数初期値： i_strPLANT_CD
	final static String i_strPLANT_CD = null;
	// 第 71 変数初期値： i_strSECTION_CD
	final static String i_strSECTION_CD = null;
	// 第 72 変数初期値： i_strORG_CD
	final static String i_strORG_CD = null;
	// 第 73 変数初期値： i_strORG_NAME
	final static String i_strORG_NAME = null;
	// 第 74 変数初期値： i_strORG_ANAME
	final static String i_strORG_ANAME = null;
	// 第 75 変数初期値： i_strUSER_CD
	final static String i_strUSER_CD = null;
	// 第 76 変数初期値： i_strBUSINESS_OPR_DATE
	final static String i_strBUSINESS_OPR_DATE = null;
	// 第 77 変数初期値： i_strUNIT_PRICE
	final static Double i_strUNIT_PRICE = null;
	// 第 78 変数初期値： i_strEFF_PHASE_IN_DATE
	final static String i_strEFF_PHASE_IN_DATE = null;
	// 第 79 変数初期値： i_sysCODE
	final static String i_sysCODE = null;
	// 第 80 変数初期値： i_sysCLASS
	final static String i_sysCLASS = null;
	// 第 81 変数初期値： i_strRSLT_CTL_SEQ_CD
	final static Double i_strRSLT_CTL_SEQ_CD = null;
	// 第 82 変数初期値： i_h_ODR_NO
	final static String i_h_ODR_NO = null;
	// 第 83 変数初期値： i_ANS_DLV_DATE_EXIST_FLG
	final static String i_ANS_DLV_DATE_EXIST_FLG = null;
	// 第 84 変数初期値： i_T_SHIP_ODR_EXIST_FLG
	final static String i_T_SHIP_ODR_EXIST_FLG = null;
	// 第 85 変数初期値： i_h_ODR_TYP
	final static String i_h_ODR_TYP = null;
	// 第 86 変数初期値： i_ODR_CTL_NO
	final static String i_ODR_CTL_NO = null;
	// 第 87 変数初期値： i_CUST_CD
	final static String i_CUST_CD = null;
	// 第 88 変数初期値： i_CUST_ITEM_CD
	final static String i_CUST_ITEM_CD = null;
	// 第 89 変数初期値： i_ITEM_CD
	final static String i_ITEM_CD = null;
	// 第 90 変数初期値： i_CUST_ODR_NO
	final static String i_CUST_ODR_NO = null;
	// 第 91 変数初期値： i_DESINATED_DLV_DATE
	final static String i_DESINATED_DLV_DATE = null;
	// 第 92 変数初期値： i_ODR_QTY
	final static String i_ODR_QTY = null;
	// 第 93 変数初期値： i_REMAIN_UNCONFIRM_ODR_QTY
	final static String i_REMAIN_UNCONFIRM_ODR_QTY = null;
	// 第 94 変数初期値： i_v_REMAIN_UNCONFIRM_ODR_QTY
	final static String i_v_REMAIN_UNCONFIRM_ODR_QTY = null;
	// 第 95 変数初期値： i_ODR_UNIT_PRICE
	final static String i_ODR_UNIT_PRICE = null;
	// 第 96 変数初期値： i_UNIT_CD
	final static String i_UNIT_CD = null;
	// 第 97 変数初期値： i_CURRNCY_CD
	final static String i_CURRNCY_CD = null;
	// 第 98 変数初期値： i_SPCL_PRICE_TYP
	final static String i_SPCL_PRICE_TYP = null;
	// 第 99 変数初期値： i_CUS_DLV_KEY_CD
	final static String i_CUS_DLV_KEY_CD = null;
	// 第 100 変数初期値： i_CUS_DLV_CD
	final static String i_CUS_DLV_CD = null;
	// 第 101 変数初期値： i_DEPO_TYP
	final static String i_DEPO_TYP = null;
	// 第 102 変数初期値： i_ODR_NO
	final static String i_ODR_NO = null;
	// 第 103 変数初期値： i_h_MODIFY_COUNT
	final static String i_h_MODIFY_COUNT = null;
	// 第 104 変数初期値： i_PRD_ODR_PLACE_CD
	final static String i_PRD_ODR_PLACE_CD = null;
	// 第 105 変数初期値： i_STD_DESINATED_RCV_DATE
	final static String i_STD_DESINATED_RCV_DATE = null;
	// 第 106 変数初期値： i_CANCELED_UNCONFIRM_ODR_QTY
	final static String i_CANCELED_UNCONFIRM_ODR_QTY = null;
	// 第 107 変数初期値： i_UNCONFIRM_ODR_BALANCE
	final static String i_UNCONFIRM_ODR_BALANCE = null;
	// 第 108 変数初期値： i_ODR_AMOUNT
	final static String i_ODR_AMOUNT = null;
	// 第 109 変数初期値： i_ODR_AMOUNT_EXCH_RATES
	final static String i_ODR_AMOUNT_EXCH_RATES = null;
	// 第 110 変数初期値： i_REMARKS
	final static String i_REMARKS = null;
	// 第 111 変数初期値： i_CUST_CHRG_PSN_CD
	final static String i_CUST_CHRG_PSN_CD = null;
	// 第 112 変数初期値： i_ODR_ACPT_PSN_CD
	final static String i_ODR_ACPT_PSN_CD = null;
	// 第 113 変数初期値： i_ODR_ACPT_DATE
	final static String i_ODR_ACPT_DATE = null;
	// 第 114 変数初期値： i_DLV_LOC_CD
	final static String i_DLV_LOC_CD = null;
	// 第 115 変数初期値： i_SHIP_PLAN_REMAIN_QTY
	final static Double i_SHIP_PLAN_REMAIN_QTY = null;
	// 第 116 変数初期値： i_SHIP_PLAN_CMPLT_FLG
	final static String i_SHIP_PLAN_CMPLT_FLG = null;
	// 第 117 変数初期値： i_PUCH_ODR_QTY_TOTAL
	final static Double i_PUCH_ODR_QTY_TOTAL = null;
	// 第 118 変数初期値： i_IF_CTL_NO
	final static Double i_IF_CTL_NO = null;
	// 第 119 変数初期値： i_check_ODR_NO
	final static String i_check_ODR_NO = null;
	// 第 120 変数初期値： i_w_CUST_CD
	final static String i_w_CUST_CD = null;
	// 第 121 変数初期値： i_w_CUST_ITEM_CD
	final static String i_w_CUST_ITEM_CD = null;
	// 第 122 変数初期値： i_w_PSN_CD
	final static String i_w_PSN_CD = null;
	// 第 123 変数初期値： i_w_CUST_ODR_NO
	final static String i_w_CUST_ODR_NO = null;
	// 第 124 変数初期値： i_w_DESINATED_DLV_DATE_from
	final static String i_w_DESINATED_DLV_DATE_from = null;
	// 第 125 変数初期値： i_w_DESINATED_DLV_DATE_to
	final static String i_w_DESINATED_DLV_DATE_to = null;
	// 第 126 変数初期値： i_w_ODR_ACPT_DATE_from
	final static String i_w_ODR_ACPT_DATE_from = null;
	// 第 127 変数初期値： i_w_ODR_ACPT_DATE_to
	final static String i_w_ODR_ACPT_DATE_to = null;
	// 第 128 変数初期値： i_fkgnALCTED_UNCONFIRM_ODR_NO
	final static String i_fkgnALCTED_UNCONFIRM_ODR_NO = null;
	// 第 129 変数初期値： i_fkgnALCTED_UNCONFIRM_ODR_QTY
	final static Double i_fkgnALCTED_UNCONFIRM_ODR_QTY = null;
	// 第 130 変数初期値： i_fkgnALCTED_SEQ_CD
	final static Double i_fkgnALCTED_SEQ_CD = null;
	// 第 131 変数初期値： i_fkgnREMAIN_UNCONFIRM_ODR_QTY
	final static Double i_fkgnREMAIN_UNCONFIRM_ODR_QTY = null;
	// 第 132 変数初期値： i_fkgnODR_UNIT_PRICE
	final static Double i_fkgnODR_UNIT_PRICE = null;
	// 第 133 変数初期値： i_fkgnCURRNCY_CD
	final static String i_fkgnCURRNCY_CD = null;
	// 第 134 変数初期値： i_fkgnODR_QTY
	final static Double i_fkgnODR_QTY = null;
	// 第 135 変数初期値： i_fkgnODR_TYP
	final static String i_fkgnODR_TYP = null;
	// 第 136 変数初期値： i_fkgnFIXED_ODR_NO
	final static String i_fkgnFIXED_ODR_NO = null;
	// 第 137 変数初期値： i_fkgnDEL_FLG
	final static String i_fkgnDEL_FLG = null;
	// 第 138 変数初期値： i_fkgnUNCONFIRM_ODR_BALANCE
	final static Double i_fkgnUNCONFIRM_ODR_BALANCE = null;
	// 第 139 変数初期値： i_fkgnODR_NO
	final static String i_fkgnODR_NO = null;
	// 第 140 変数初期値： i_sysHomeCurCd
	final static String i_sysHomeCurCd = null;
	// 第 141 変数初期値： i_ITEM_NAME
	final static String i_ITEM_NAME = null;
	// 第 142 変数初期値： i_CUST_ANAME
	final static String i_CUST_ANAME = null;
	// 第 143 変数初期値： i_ODR_TYP
	final static String i_ODR_TYP = null;
	// 第 144 変数初期値： i_IN_ODR_NO
	final static String i_IN_ODR_NO = null;
	// 第 145 変数初期値： i_SPCL_PRICE_TYP_name
	final static String i_SPCL_PRICE_TYP_name = null;
	// 第 146 変数初期値： i_SPCL_PRICE_TYP_val
	final static String i_SPCL_PRICE_TYP_val = null;
	// 第 147 変数初期値： i_UNIT_NAME
	final static String i_UNIT_NAME = null;
	// 第 148 変数初期値： i_UNIT_CD_name
	final static String i_UNIT_CD_name = null;
	// 第 149 変数初期値： i_UNIT_CD_val
	final static String i_UNIT_CD_val = null;
	// 第 150 変数初期値： i_CURRNCY_CD_name
	final static String i_CURRNCY_CD_name = null;
	// 第 151 変数初期値： i_CURRNCY_CD_val
	final static String i_CURRNCY_CD_val = null;

	/**
	 * 初期化
	 *
	 */
	public void initialize()
	{
		m_ODR_QTY = null;
		m_h_ODR_QTY = null;
		m_DESINATED_DLV_DATE = null;
		m_h_DESINATED_DLV_DATE = null;
		m_SPCL_PRICE_TYP = null;
		m_h_SPCL_PRICE_TYP = null;
		m_ODR_UNIT_PRICE = null;
		m_h_ODR_UNIT_PRICE = null;
		m_CUS_DLV_KEY_CD = null;
		m_h_CUS_DLV_KEY_CD = null;
		m_CUS_DLV_CD = null;
		m_h_CUS_DLV_CD = null;
		m_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_CUST_CD = null;
		m_CUST_ANAME = null;
		m_CUST_ITEM_CD = null;
		m_CUST_ODR_NO = null;
		m_ODR_TYP = null;
		m_h_ODR_TYP = null;
		m_h_REMAIN_UNCONFIRM_ODR_QTY = null;
		m_h_SHIP_PLAN_REMAIN_QTY = null;
		m_h_ODR_TYP = null;
		m_h_MODIFY_COUNT = null;
		m_h_ANS_DLV_DATE_EXIST_FLG = null;
		m_h_T_SHIP_ODR_EXIST_FLG = null;
		m_DLV_LOC_CD = null;
		m_DLV_LOC_NAME_KANJI = null;
		m_h_DLV_LOC_CD = null;

	}

		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
