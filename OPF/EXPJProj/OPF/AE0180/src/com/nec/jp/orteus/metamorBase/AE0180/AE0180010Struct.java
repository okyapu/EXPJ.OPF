/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0180/src/com/nec/jp/orteus/metamorBase/AE0180/AE0180010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0180;

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
 * CLASS     : AE0180010Control クラス
 * ファイル・クラス説明
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.6 $ $Date: 2016/05/23 08:15:48 $
 *
 */
//}}user_implement_code_header

public class AE0180010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_FileName */
	public String m_FileName = null;
	/** 第 2 変数： m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** 第 3 変数： m_l_ERROR_IN */
	public String m_l_ERROR_IN = null;
	/** 第 4 変数： m_l_ERR_TYP */
	public String m_l_ERR_TYP = null;
	/** 第 5 変数： m_l_ERR_INFO */
	public String m_l_ERR_INFO = null;
	/** 第 6 変数： m_l_ERR_CTR_NM */
	public String m_l_ERR_CTR_NM = null;
	/** 第 7 変数： m_l_ERR_ITEM_CD */
	public String m_l_ERR_ITEM_CD = null;
	/** 第 8 変数： m_l_ERR_PRD_DUE_DATE */
	public String m_l_ERR_PRD_DUE_DATE = null;
	/** 第 9 変数： m_l_ERR_PUCH_ODR_DLV_DATE */
	public String m_l_ERR_PUCH_ODR_DLV_DATE = null;
	/** 第 10 変数： m_l_ERR_PUCH_ODR_QTY */
	public String m_l_ERR_PUCH_ODR_QTY = null;
	/** 第 11 変数： m_l_ERR_VEND_CD */
	public String m_l_ERR_VEND_CD = null;
	/** 第 12 変数： m_l_ERR_JOB_ODR_CD */
	public String m_l_ERR_JOB_ODR_CD = null;
	/** 第 13 変数： m_l_ERR_CONFIRM_DLV_DATE */
	public String m_l_ERR_CONFIRM_DLV_DATE = null;
	/** 第 14 変数： m_l_ERR_WH_CD */
	public String m_l_ERR_WH_CD = null;
	/** 第 15 変数： m_l_ERR_WORK_IN_PROC_COMMENT */
	public String m_l_ERR_WORK_IN_PROC_COMMENT = null;
	/** 第 16 変数： m_l_ERR_NON_NO_ITEM_FLG */
	public String m_l_ERR_NON_NO_ITEM_FLG = null;
	/** 第 17 変数： m_l_ERR_NON_NO_ITEM_NAME */
	public String m_l_ERR_NON_NO_ITEM_NAME = null;
	/** 第 18 変数： m_l_ERR_NON_NO_ITEM_TYP */
	public String m_l_ERR_NON_NO_ITEM_TYP = null;
	/** 第 19 変数： m_l_ERR_NON_NO_ITEM_PUCH_ODR_UNIT */
	public String m_l_ERR_NON_NO_ITEM_PUCH_ODR_UNIT = null;
	/** 第 20 変数： m_l_ERR_UNIT_COST_TYP */
	public String m_l_ERR_UNIT_COST_TYP = null;
	/** 第 21 変数： m_l_ERR_ACTUAL_UNIT_PRICE */
	public String m_l_ERR_ACTUAL_UNIT_PRICE = null;
	/** 第 22 変数： m_l_ERR_PROCESSING_COST */
	public String m_l_ERR_PROCESSING_COST = null;
	/** 第 23 変数： m_l_ERR_MATERIAL_COST */
	public String m_l_ERR_MATERIAL_COST = null;
	/** 第 24 変数： m_l_ERR_OTHER_OVERHEADS */
	public String m_l_ERR_OTHER_OVERHEADS = null;
	/** 第 25 変数： m_l_ERR_NET_AMOUNT */
	public String m_l_ERR_NET_AMOUNT = null;
	/** 第 26 変数： m_l_ERR_EXCH_RATE */
	public String m_l_ERR_EXCH_RATE = null;
	/** 第 27 変数： m_h_INSTALL_FLG */
	public String m_h_INSTALL_FLG = null;
	/** 第 28 変数： m_l_ERR_EXPENSE_CLASS_CD */
	public String m_l_ERR_EXPENSE_CLASS_CD = null;
	/** 第 29 変数： m_l_ERR_DEPT_CD */
	public String m_l_ERR_DEPT_CD = null;
	/** 第 30 変数： m_l_ERR_PJ_CD */
	public String m_l_ERR_PJ_CD = null;
	/** 第 31 変数： m_l_ERR_SEG_CONTENTS1 */
	public String m_l_ERR_SEG_CONTENTS1 = null;
	/** 第 32 変数： m_l_ERR_SEG_CONTENTS2 */
	public String m_l_ERR_SEG_CONTENTS2 = null;
	/** 第 33 変数： m_l_ERR_SEG_CONTENTS3 */
	public String m_l_ERR_SEG_CONTENTS3 = null;
	/** 第 34 変数： m_l_ERR_SEG_CONTENTS4 */
	public String m_l_ERR_SEG_CONTENTS4 = null;
	/** 第 35 変数： m_w_COLUMN_FLG */
	public String m_w_COLUMN_FLG = null;
	/** 第 36 変数： m_L_PUCH_ODR_START_DATE */
	public String m_L_PUCH_ODR_START_DATE = null;
	/** 第 37 変数： m_L_JOB_ODR_CD */
	public String m_L_JOB_ODR_CD = null;
	/** 第 38 変数： m_L_UNIT_COST_TYP */
	public String m_L_UNIT_COST_TYP = null;
	/** 第 39 変数： m_L_UNIT_COST */
	public String m_L_UNIT_COST = null;
	/** 第 40 変数： m_L_PROCESSING_COST */
	public String m_L_PROCESSING_COST = null;
	/** 第 41 変数： m_L_MATERIAL_COST */
	public String m_L_MATERIAL_COST = null;
	/** 第 42 変数： m_L_OTHER_OVERHEADS */
	public String m_L_OTHER_OVERHEADS = null;
	/** 第 43 変数： m_L_NET_AMOUNT */
	public String m_L_NET_AMOUNT = null;
	/** 第 44 変数： m_L_EXCH_RATE */
	public String m_L_EXCH_RATE = null;
	/** 第 45 変数： m_L_PUCH_ODR_QTY */
	public String m_L_PUCH_ODR_QTY = null;
	/** 第 46 変数： m_MRP_ODR_TYP */
	public String m_MRP_ODR_TYP = null;
	/** 第 47 変数： m_ACPT_INSPC_TYP */
	public String m_ACPT_INSPC_TYP = null;
	/** 第 48 変数： m_UNIT_QTY_TYP */
	public String m_UNIT_QTY_TYP = null;
	/** 第 49 変数： m_FIXED_LT */
	public String m_FIXED_LT = null;
	/** 第 50 変数： m_PROP_LT */
	public String m_PROP_LT = null;
	/** 第 51 変数： m_SAFETY_LT */
	public String m_SAFETY_LT = null;
	/** 第 52 変数： m_PROP_LOT_SIZE */
	public String m_PROP_LOT_SIZE = null;
	/** 第 53 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 54 変数： m_VEND_CD */
	public String m_VEND_CD = null;
	/** 第 55 変数： m_DEAL_STS_FLG */
	public String m_DEAL_STS_FLG = null;
	/** 第 56 変数： m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** 第 57 変数： m_WH_CD */
	public String m_WH_CD = null;
	/** 第 58 変数： m_JOB_ODR_STS_TYP */
	public String m_JOB_ODR_STS_TYP = null;
	/** 第 59 変数： m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** 第 60 変数： m_OD_NO */
	public String m_OD_NO = null;
	/** 第 61 変数： m_JOB_ODR_DLV_DATE */
	public String m_JOB_ODR_DLV_DATE = null;
	/** 第 62 変数： m_VALUE */
	public String m_VALUE = null;
	/** 第 63 変数： m_NAME */
	public String m_NAME = null;
	/** 第 64 変数： m_PUCH_ODR_CD */
	public String m_PUCH_ODR_CD = null;
	/** 第 65 変数： m_NON_NO_ITEM_NAME */
	public String m_NON_NO_ITEM_NAME = null;
	/** 第 66 変数： m_NON_NO_ITEM_TYP */
	public String m_NON_NO_ITEM_TYP = null;
	/** 第 67 変数： m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** 第 68 変数： m_PUCH_ODR_PERSON */
	public String m_PUCH_ODR_PERSON = null;
	/** 第 69 変数： m_PUCH_ODR_START_DATE */
	public String m_PUCH_ODR_START_DATE = null;
	/** 第 70 変数： m_PUCH_ODR_DLV_DATE */
	public String m_PUCH_ODR_DLV_DATE = null;
	/** 第 71 変数： m_PUCH_ODR_QTY */
	public String m_PUCH_ODR_QTY = null;
	/** 第 72 変数： m_NON_NO_ITEM_PUCH_ODR_UNIT */
	public String m_NON_NO_ITEM_PUCH_ODR_UNIT = null;
	/** 第 73 変数： m_UNIT_COST_TYP */
	public String m_UNIT_COST_TYP = null;
	/** 第 74 変数： m_UNIT_COST */
	public String m_UNIT_COST = null;
	/** 第 75 変数： m_PROCESSING_COST */
	public String m_PROCESSING_COST = null;
	/** 第 76 変数： m_MATERIAL_COST */
	public String m_MATERIAL_COST = null;
	/** 第 77 変数： m_OTHER_OVERHEADS */
	public String m_OTHER_OVERHEADS = null;
	/** 第 78 変数： m_DISC_AMOUNT */
	public String m_DISC_AMOUNT = null;
	/** 第 79 変数： m_PUCH_ODR_AMOUNT */
	public String m_PUCH_ODR_AMOUNT = null;
	/** 第 80 変数： m_CONFIRM_DLV_DATE */
	public String m_CONFIRM_DLV_DATE = null;
	/** 第 81 変数： m_INV_CTRL_FLG */
	public String m_INV_CTRL_FLG = null;
	/** 第 82 変数： m_PUCH_ODR_COMMENT */
	public String m_PUCH_ODR_COMMENT = null;
	/** 第 83 変数： m_RATE_JUDGE_DATE */
	public String m_RATE_JUDGE_DATE = null;
	/** 第 84 変数： m_EXCH_RATE */
	public String m_EXCH_RATE = null;
	/** 第 85 変数： m_TAX_RATE_1 */
	public String m_TAX_RATE_1 = null;
	/** 第 86 変数： m_TAX_RATE_2 */
	public String m_TAX_RATE_2 = null;
	/** 第 87 変数： m_TAX_RATE_3 */
	public String m_TAX_RATE_3 = null;
	/** 第 88 変数： m_NET_AMOUNT */
	public String m_NET_AMOUNT = null;
	/** 第 89 変数： m_TAX_AMOUNT_1 */
	public String m_TAX_AMOUNT_1 = null;
	/** 第 90 変数： m_TAX_AMOUNT_2 */
	public String m_TAX_AMOUNT_2 = null;
	/** 第 91 変数： m_TAX_AMOUNT_3 */
	public String m_TAX_AMOUNT_3 = null;
	/** 第 92 変数： m_AMOUNT_INCLUDE_TAX */
	public String m_AMOUNT_INCLUDE_TAX = null;
	/** 第 93 変数： m_HOME_CUR_AMOUNT */
	public String m_HOME_CUR_AMOUNT = null;
	/** 第 94 変数： m_TAX_CD */
	public String m_TAX_CD = null;
	/** 第 95 変数： m_TAX_ROUND_TYP */
	public String m_TAX_ROUND_TYP = null;
	/** 第 96 変数： m_NON_NO_ITEM_FLG */
	public String m_NON_NO_ITEM_FLG = null;
	/** 第 97 変数： m_ACCT_CD */
	public String m_ACCT_CD = null;
	/** 第 98 変数： m_DEPT_CD */
	public String m_DEPT_CD = null;
	/** 第 99 変数： m_PJ_CD */
	public String m_PJ_CD = null;
	/** 第 100 変数： m_SEG_CONTENTS1 */
	public String m_SEG_CONTENTS1 = null;
	/** 第 101 変数： m_SEG_CONTENTS2 */
	public String m_SEG_CONTENTS2 = null;
	/** 第 102 変数： m_SEG_CONTENTS3 */
	public String m_SEG_CONTENTS3 = null;
	/** 第 103 変数： m_SEG_CONTENTS4 */
	public String m_SEG_CONTENTS4 = null;
	/** 第 104 変数： m_ASP_INSTALL_FLG */
	public String m_ASP_INSTALL_FLG = null;
	/** 第 105 変数： m_TIME_CTRL */
	public String m_TIME_CTRL = null;
	/** 第 106 変数： m_PVC2BUSINESSNAME */
	public String m_PVC2BUSINESSNAME = null;
	/** 第 107 変数： m_PVC2OUTPUTPATH */
	public String m_PVC2OUTPUTPATH = null;
	/** 第 108 変数： m_PVC2OUTPUTNAME */
	public String m_PVC2OUTPUTNAME = null;
	/** 第 109 変数： m_PVC2LOGMODE */
	public String m_PVC2LOGMODE = null;
	/** 第 110 変数： m_PVC2OUTPUTMODE */
	public String m_PVC2OUTPUTMODE = null;
	/** 第 111 変数： m_PVC2USERID */
	public String m_PVC2USERID = null;
	/** 第 112 変数： m_PVC2PLANTCD */
	public String m_PVC2PLANTCD = null;
	/** 第 113 変数： m_PVC2TAXID */
	public String m_PVC2TAXID = null;
	/** 第 114 変数： m_VEND_DECIMAL_FIG */
	public String m_VEND_DECIMAL_FIG = null;
	/** 第 115 変数： m_PNUMTAXOUTAMOUNT */
	public String m_PNUMTAXOUTAMOUNT = null;
	/** 第 116 変数： m_PNUMTAXAMOUNT */
	public String m_PNUMTAXAMOUNT = null;
	/** 第 117 変数： m_PNUMEXTERNALTAXSALESAMOUNT */
	public String m_PNUMEXTERNALTAXSALESAMOUNT = null;
	/** 第 118 変数： m_PNUMINTERNALTAXSALESAMOUNT */
	public String m_PNUMINTERNALTAXSALESAMOUNT = null;
	/** 第 119 変数： m_PNUMTAXFREESALESAMOUNT */
	public String m_PNUMTAXFREESALESAMOUNT = null;
	/** 第 120 変数： m_PNUMEXTERNALTAXAMOUNT */
	public String m_PNUMEXTERNALTAXAMOUNT = null;
	/** 第 121 変数： m_PNUMINTERNALTAXAMOUNT */
	public String m_PNUMINTERNALTAXAMOUNT = null;
	/** 第 122 変数： m_PVC2ERRCD */
	public String m_PVC2ERRCD = null;
	/** 第 123 変数： m_PNUMSTATUS */
	public String m_PNUMSTATUS = null;
	/** 第 124 変数： m_DEPT_NAME */
	public String m_DEPT_NAME = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_FileName */
	public List l_FileName = null;

	/** 第 2 List変数： l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** 第 3 List変数： l_l_ERROR_IN */
	public List l_l_ERROR_IN = null;

	/** 第 4 List変数： l_l_ERR_TYP */
	public List l_l_ERR_TYP = null;

	/** 第 5 List変数： l_l_ERR_INFO */
	public List l_l_ERR_INFO = null;

	/** 第 6 List変数： l_l_ERR_CTR_NM */
	public List l_l_ERR_CTR_NM = null;

	/** 第 7 List変数： l_l_ERR_ITEM_CD */
	public List l_l_ERR_ITEM_CD = null;

	/** 第 8 List変数： l_l_ERR_PRD_DUE_DATE */
	public List l_l_ERR_PRD_DUE_DATE = null;

	/** 第 9 List変数： l_l_ERR_PUCH_ODR_DLV_DATE */
	public List l_l_ERR_PUCH_ODR_DLV_DATE = null;

	/** 第 10 List変数： l_l_ERR_PUCH_ODR_QTY */
	public List l_l_ERR_PUCH_ODR_QTY = null;

	/** 第 11 List変数： l_l_ERR_VEND_CD */
	public List l_l_ERR_VEND_CD = null;

	/** 第 12 List変数： l_l_ERR_JOB_ODR_CD */
	public List l_l_ERR_JOB_ODR_CD = null;

	/** 第 13 List変数： l_l_ERR_CONFIRM_DLV_DATE */
	public List l_l_ERR_CONFIRM_DLV_DATE = null;

	/** 第 14 List変数： l_l_ERR_WH_CD */
	public List l_l_ERR_WH_CD = null;

	/** 第 15 List変数： l_l_ERR_WORK_IN_PROC_COMMENT */
	public List l_l_ERR_WORK_IN_PROC_COMMENT = null;

	/** 第 16 List変数： l_l_ERR_NON_NO_ITEM_FLG */
	public List l_l_ERR_NON_NO_ITEM_FLG = null;

	/** 第 17 List変数： l_l_ERR_NON_NO_ITEM_NAME */
	public List l_l_ERR_NON_NO_ITEM_NAME = null;

	/** 第 18 List変数： l_l_ERR_NON_NO_ITEM_TYP */
	public List l_l_ERR_NON_NO_ITEM_TYP = null;

	/** 第 19 List変数： l_l_ERR_NON_NO_ITEM_PUCH_ODR_UNIT */
	public List l_l_ERR_NON_NO_ITEM_PUCH_ODR_UNIT = null;

	/** 第 20 List変数： l_l_ERR_UNIT_COST_TYP */
	public List l_l_ERR_UNIT_COST_TYP = null;

	/** 第 21 List変数： l_l_ERR_ACTUAL_UNIT_PRICE */
	public List l_l_ERR_ACTUAL_UNIT_PRICE = null;

	/** 第 22 List変数： l_l_ERR_PROCESSING_COST */
	public List l_l_ERR_PROCESSING_COST = null;

	/** 第 23 List変数： l_l_ERR_MATERIAL_COST */
	public List l_l_ERR_MATERIAL_COST = null;

	/** 第 24 List変数： l_l_ERR_OTHER_OVERHEADS */
	public List l_l_ERR_OTHER_OVERHEADS = null;

	/** 第 25 List変数： l_l_ERR_NET_AMOUNT */
	public List l_l_ERR_NET_AMOUNT = null;

	/** 第 26 List変数： l_l_ERR_EXCH_RATE */
	public List l_l_ERR_EXCH_RATE = null;

	/** 第 27 List変数： l_h_INSTALL_FLG */
	public List l_h_INSTALL_FLG = null;

	/** 第 28 List変数： l_l_ERR_EXPENSE_CLASS_CD */
	public List l_l_ERR_EXPENSE_CLASS_CD = null;

	/** 第 29 List変数： l_l_ERR_DEPT_CD */
	public List l_l_ERR_DEPT_CD = null;

	/** 第 30 List変数： l_l_ERR_PJ_CD */
	public List l_l_ERR_PJ_CD = null;

	/** 第 31 List変数： l_l_ERR_SEG_CONTENTS1 */
	public List l_l_ERR_SEG_CONTENTS1 = null;

	/** 第 32 List変数： l_l_ERR_SEG_CONTENTS2 */
	public List l_l_ERR_SEG_CONTENTS2 = null;

	/** 第 33 List変数： l_l_ERR_SEG_CONTENTS3 */
	public List l_l_ERR_SEG_CONTENTS3 = null;

	/** 第 34 List変数： l_l_ERR_SEG_CONTENTS4 */
	public List l_l_ERR_SEG_CONTENTS4 = null;

	/** 第 35 List変数： l_w_COLUMN_FLG */
	public List l_w_COLUMN_FLG = null;

	/** 第 36 List変数： l_L_PUCH_ODR_START_DATE */
	public List l_L_PUCH_ODR_START_DATE = null;

	/** 第 37 List変数： l_L_JOB_ODR_CD */
	public List l_L_JOB_ODR_CD = null;

	/** 第 38 List変数： l_L_UNIT_COST_TYP */
	public List l_L_UNIT_COST_TYP = null;

	/** 第 39 List変数： l_L_UNIT_COST */
	public List l_L_UNIT_COST = null;

	/** 第 40 List変数： l_L_PROCESSING_COST */
	public List l_L_PROCESSING_COST = null;

	/** 第 41 List変数： l_L_MATERIAL_COST */
	public List l_L_MATERIAL_COST = null;

	/** 第 42 List変数： l_L_OTHER_OVERHEADS */
	public List l_L_OTHER_OVERHEADS = null;

	/** 第 43 List変数： l_L_NET_AMOUNT */
	public List l_L_NET_AMOUNT = null;

	/** 第 44 List変数： l_L_EXCH_RATE */
	public List l_L_EXCH_RATE = null;

	/** 第 45 List変数： l_L_PUCH_ODR_QTY */
	public List l_L_PUCH_ODR_QTY = null;

	/** 第 46 List変数： l_MRP_ODR_TYP */
	public List l_MRP_ODR_TYP = null;

	/** 第 47 List変数： l_ACPT_INSPC_TYP */
	public List l_ACPT_INSPC_TYP = null;

	/** 第 48 List変数： l_UNIT_QTY_TYP */
	public List l_UNIT_QTY_TYP = null;

	/** 第 49 List変数： l_FIXED_LT */
	public List l_FIXED_LT = null;

	/** 第 50 List変数： l_PROP_LT */
	public List l_PROP_LT = null;

	/** 第 51 List変数： l_SAFETY_LT */
	public List l_SAFETY_LT = null;

	/** 第 52 List変数： l_PROP_LOT_SIZE */
	public List l_PROP_LOT_SIZE = null;

	/** 第 53 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 54 List変数： l_VEND_CD */
	public List l_VEND_CD = null;

	/** 第 55 List変数： l_DEAL_STS_FLG */
	public List l_DEAL_STS_FLG = null;

	/** 第 56 List変数： l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** 第 57 List変数： l_WH_CD */
	public List l_WH_CD = null;

	/** 第 58 List変数： l_JOB_ODR_STS_TYP */
	public List l_JOB_ODR_STS_TYP = null;

	/** 第 59 List変数： l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** 第 60 List変数： l_OD_NO */
	public List l_OD_NO = null;

	/** 第 61 List変数： l_JOB_ODR_DLV_DATE */
	public List l_JOB_ODR_DLV_DATE = null;

	/** 第 62 List変数： l_VALUE */
	public List l_VALUE = null;

	/** 第 63 List変数： l_NAME */
	public List l_NAME = null;

	/** 第 64 List変数： l_PUCH_ODR_CD */
	public List l_PUCH_ODR_CD = null;

	/** 第 65 List変数： l_NON_NO_ITEM_NAME */
	public List l_NON_NO_ITEM_NAME = null;

	/** 第 66 List変数： l_NON_NO_ITEM_TYP */
	public List l_NON_NO_ITEM_TYP = null;

	/** 第 67 List変数： l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** 第 68 List変数： l_PUCH_ODR_PERSON */
	public List l_PUCH_ODR_PERSON = null;

	/** 第 69 List変数： l_PUCH_ODR_START_DATE */
	public List l_PUCH_ODR_START_DATE = null;

	/** 第 70 List変数： l_PUCH_ODR_DLV_DATE */
	public List l_PUCH_ODR_DLV_DATE = null;

	/** 第 71 List変数： l_PUCH_ODR_QTY */
	public List l_PUCH_ODR_QTY = null;

	/** 第 72 List変数： l_NON_NO_ITEM_PUCH_ODR_UNIT */
	public List l_NON_NO_ITEM_PUCH_ODR_UNIT = null;

	/** 第 73 List変数： l_UNIT_COST_TYP */
	public List l_UNIT_COST_TYP = null;

	/** 第 74 List変数： l_UNIT_COST */
	public List l_UNIT_COST = null;

	/** 第 75 List変数： l_PROCESSING_COST */
	public List l_PROCESSING_COST = null;

	/** 第 76 List変数： l_MATERIAL_COST */
	public List l_MATERIAL_COST = null;

	/** 第 77 List変数： l_OTHER_OVERHEADS */
	public List l_OTHER_OVERHEADS = null;

	/** 第 78 List変数： l_DISC_AMOUNT */
	public List l_DISC_AMOUNT = null;

	/** 第 79 List変数： l_PUCH_ODR_AMOUNT */
	public List l_PUCH_ODR_AMOUNT = null;

	/** 第 80 List変数： l_CONFIRM_DLV_DATE */
	public List l_CONFIRM_DLV_DATE = null;

	/** 第 81 List変数： l_INV_CTRL_FLG */
	public List l_INV_CTRL_FLG = null;

	/** 第 82 List変数： l_PUCH_ODR_COMMENT */
	public List l_PUCH_ODR_COMMENT = null;

	/** 第 83 List変数： l_RATE_JUDGE_DATE */
	public List l_RATE_JUDGE_DATE = null;

	/** 第 84 List変数： l_EXCH_RATE */
	public List l_EXCH_RATE = null;

	/** 第 85 List変数： l_TAX_RATE_1 */
	public List l_TAX_RATE_1 = null;

	/** 第 86 List変数： l_TAX_RATE_2 */
	public List l_TAX_RATE_2 = null;

	/** 第 87 List変数： l_TAX_RATE_3 */
	public List l_TAX_RATE_3 = null;

	/** 第 88 List変数： l_NET_AMOUNT */
	public List l_NET_AMOUNT = null;

	/** 第 89 List変数： l_TAX_AMOUNT_1 */
	public List l_TAX_AMOUNT_1 = null;

	/** 第 90 List変数： l_TAX_AMOUNT_2 */
	public List l_TAX_AMOUNT_2 = null;

	/** 第 91 List変数： l_TAX_AMOUNT_3 */
	public List l_TAX_AMOUNT_3 = null;

	/** 第 92 List変数： l_AMOUNT_INCLUDE_TAX */
	public List l_AMOUNT_INCLUDE_TAX = null;

	/** 第 93 List変数： l_HOME_CUR_AMOUNT */
	public List l_HOME_CUR_AMOUNT = null;

	/** 第 94 List変数： l_TAX_CD */
	public List l_TAX_CD = null;

	/** 第 95 List変数： l_TAX_ROUND_TYP */
	public List l_TAX_ROUND_TYP = null;

	/** 第 96 List変数： l_NON_NO_ITEM_FLG */
	public List l_NON_NO_ITEM_FLG = null;

	/** 第 97 List変数： l_ACCT_CD */
	public List l_ACCT_CD = null;

	/** 第 98 List変数： l_DEPT_CD */
	public List l_DEPT_CD = null;

	/** 第 99 List変数： l_PJ_CD */
	public List l_PJ_CD = null;

	/** 第 100 List変数： l_SEG_CONTENTS1 */
	public List l_SEG_CONTENTS1 = null;

	/** 第 101 List変数： l_SEG_CONTENTS2 */
	public List l_SEG_CONTENTS2 = null;

	/** 第 102 List変数： l_SEG_CONTENTS3 */
	public List l_SEG_CONTENTS3 = null;

	/** 第 103 List変数： l_SEG_CONTENTS4 */
	public List l_SEG_CONTENTS4 = null;

	/** 第 104 List変数： l_ASP_INSTALL_FLG */
	public List l_ASP_INSTALL_FLG = null;

	/** 第 105 List変数： l_TIME_CTRL */
	public List l_TIME_CTRL = null;

	/** 第 106 List変数： l_PVC2BUSINESSNAME */
	public List l_PVC2BUSINESSNAME = null;

	/** 第 107 List変数： l_PVC2OUTPUTPATH */
	public List l_PVC2OUTPUTPATH = null;

	/** 第 108 List変数： l_PVC2OUTPUTNAME */
	public List l_PVC2OUTPUTNAME = null;

	/** 第 109 List変数： l_PVC2LOGMODE */
	public List l_PVC2LOGMODE = null;

	/** 第 110 List変数： l_PVC2OUTPUTMODE */
	public List l_PVC2OUTPUTMODE = null;

	/** 第 111 List変数： l_PVC2USERID */
	public List l_PVC2USERID = null;

	/** 第 112 List変数： l_PVC2PLANTCD */
	public List l_PVC2PLANTCD = null;

	/** 第 113 List変数： l_PVC2TAXID */
	public List l_PVC2TAXID = null;

	/** 第 114 List変数： l_VEND_DECIMAL_FIG */
	public List l_VEND_DECIMAL_FIG = null;

	/** 第 115 List変数： l_PNUMTAXOUTAMOUNT */
	public List l_PNUMTAXOUTAMOUNT = null;

	/** 第 116 List変数： l_PNUMTAXAMOUNT */
	public List l_PNUMTAXAMOUNT = null;

	/** 第 117 List変数： l_PNUMEXTERNALTAXSALESAMOUNT */
	public List l_PNUMEXTERNALTAXSALESAMOUNT = null;

	/** 第 118 List変数： l_PNUMINTERNALTAXSALESAMOUNT */
	public List l_PNUMINTERNALTAXSALESAMOUNT = null;

	/** 第 119 List変数： l_PNUMTAXFREESALESAMOUNT */
	public List l_PNUMTAXFREESALESAMOUNT = null;

	/** 第 120 List変数： l_PNUMEXTERNALTAXAMOUNT */
	public List l_PNUMEXTERNALTAXAMOUNT = null;

	/** 第 121 List変数： l_PNUMINTERNALTAXAMOUNT */
	public List l_PNUMINTERNALTAXAMOUNT = null;

	/** 第 122 List変数： l_PVC2ERRCD */
	public List l_PVC2ERRCD = null;

	/** 第 123 List変数： l_PNUMSTATUS */
	public List l_PNUMSTATUS = null;

	/** 第 124 List変数： l_DEPT_NAME */
	public List l_DEPT_NAME = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getFileName() { return m_FileName; }
	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getl_ERROR_IN() { return m_l_ERROR_IN; }
	public String getl_ERR_TYP() { return m_l_ERR_TYP; }
	public String getl_ERR_INFO() { return m_l_ERR_INFO; }
	public String getl_ERR_CTR_NM() { return m_l_ERR_CTR_NM; }
	public String getl_ERR_ITEM_CD() { return m_l_ERR_ITEM_CD; }
	public String getl_ERR_PRD_DUE_DATE() { return m_l_ERR_PRD_DUE_DATE; }
	public String getl_ERR_PUCH_ODR_DLV_DATE() { return m_l_ERR_PUCH_ODR_DLV_DATE; }
	public String getl_ERR_PUCH_ODR_QTY() { return m_l_ERR_PUCH_ODR_QTY; }
	public String getl_ERR_VEND_CD() { return m_l_ERR_VEND_CD; }
	public String getl_ERR_JOB_ODR_CD() { return m_l_ERR_JOB_ODR_CD; }
	public String getl_ERR_CONFIRM_DLV_DATE() { return m_l_ERR_CONFIRM_DLV_DATE; }
	public String getl_ERR_WH_CD() { return m_l_ERR_WH_CD; }
	public String getl_ERR_WORK_IN_PROC_COMMENT() { return m_l_ERR_WORK_IN_PROC_COMMENT; }
	public String getl_ERR_NON_NO_ITEM_FLG() { return m_l_ERR_NON_NO_ITEM_FLG; }
	public String getl_ERR_NON_NO_ITEM_NAME() { return m_l_ERR_NON_NO_ITEM_NAME; }
	public String getl_ERR_NON_NO_ITEM_TYP() { return m_l_ERR_NON_NO_ITEM_TYP; }
	public String getl_ERR_NON_NO_ITEM_PUCH_ODR_UNIT() { return m_l_ERR_NON_NO_ITEM_PUCH_ODR_UNIT; }
	public String getl_ERR_UNIT_COST_TYP() { return m_l_ERR_UNIT_COST_TYP; }
	public String getl_ERR_ACTUAL_UNIT_PRICE() { return m_l_ERR_ACTUAL_UNIT_PRICE; }
	public String getl_ERR_PROCESSING_COST() { return m_l_ERR_PROCESSING_COST; }
	public String getl_ERR_MATERIAL_COST() { return m_l_ERR_MATERIAL_COST; }
	public String getl_ERR_OTHER_OVERHEADS() { return m_l_ERR_OTHER_OVERHEADS; }
	public String getl_ERR_NET_AMOUNT() { return m_l_ERR_NET_AMOUNT; }
	public String getl_ERR_EXCH_RATE() { return m_l_ERR_EXCH_RATE; }
	public String geth_INSTALL_FLG() { return m_h_INSTALL_FLG; }
	public String getl_ERR_EXPENSE_CLASS_CD() { return m_l_ERR_EXPENSE_CLASS_CD; }
	public String getl_ERR_DEPT_CD() { return m_l_ERR_DEPT_CD; }
	public String getl_ERR_PJ_CD() { return m_l_ERR_PJ_CD; }
	public String getl_ERR_SEG_CONTENTS1() { return m_l_ERR_SEG_CONTENTS1; }
	public String getl_ERR_SEG_CONTENTS2() { return m_l_ERR_SEG_CONTENTS2; }
	public String getl_ERR_SEG_CONTENTS3() { return m_l_ERR_SEG_CONTENTS3; }
	public String getl_ERR_SEG_CONTENTS4() { return m_l_ERR_SEG_CONTENTS4; }
	public String getw_COLUMN_FLG() { return m_w_COLUMN_FLG; }
	public String getL_PUCH_ODR_START_DATE() { return m_L_PUCH_ODR_START_DATE; }
	public String getL_JOB_ODR_CD() { return m_L_JOB_ODR_CD; }
	public String getL_UNIT_COST_TYP() { return m_L_UNIT_COST_TYP; }
	public String getL_UNIT_COST() { return m_L_UNIT_COST; }
	public String getL_PROCESSING_COST() { return m_L_PROCESSING_COST; }
	public String getL_MATERIAL_COST() { return m_L_MATERIAL_COST; }
	public String getL_OTHER_OVERHEADS() { return m_L_OTHER_OVERHEADS; }
	public String getL_NET_AMOUNT() { return m_L_NET_AMOUNT; }
	public String getL_EXCH_RATE() { return m_L_EXCH_RATE; }
	public String getL_PUCH_ODR_QTY() { return m_L_PUCH_ODR_QTY; }
	public String getMRP_ODR_TYP() { return m_MRP_ODR_TYP; }
	public String getACPT_INSPC_TYP() { return m_ACPT_INSPC_TYP; }
	public String getUNIT_QTY_TYP() { return m_UNIT_QTY_TYP; }
	public String getFIXED_LT() { return m_FIXED_LT; }
	public String getPROP_LT() { return m_PROP_LT; }
	public String getSAFETY_LT() { return m_SAFETY_LT; }
	public String getPROP_LOT_SIZE() { return m_PROP_LOT_SIZE; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getDEAL_STS_FLG() { return m_DEAL_STS_FLG; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getWH_CD() { return m_WH_CD; }
	public String getJOB_ODR_STS_TYP() { return m_JOB_ODR_STS_TYP; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getOD_NO() { return m_OD_NO; }
	public String getJOB_ODR_DLV_DATE() { return m_JOB_ODR_DLV_DATE; }
	public String getVALUE() { return m_VALUE; }
	public String getNAME() { return m_NAME; }
	public String getPUCH_ODR_CD() { return m_PUCH_ODR_CD; }
	public String getNON_NO_ITEM_NAME() { return m_NON_NO_ITEM_NAME; }
	public String getNON_NO_ITEM_TYP() { return m_NON_NO_ITEM_TYP; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getPUCH_ODR_PERSON() { return m_PUCH_ODR_PERSON; }
	public String getPUCH_ODR_START_DATE() { return m_PUCH_ODR_START_DATE; }
	public String getPUCH_ODR_DLV_DATE() { return m_PUCH_ODR_DLV_DATE; }
	public String getPUCH_ODR_QTY() { return m_PUCH_ODR_QTY; }
	public String getNON_NO_ITEM_PUCH_ODR_UNIT() { return m_NON_NO_ITEM_PUCH_ODR_UNIT; }
	public String getUNIT_COST_TYP() { return m_UNIT_COST_TYP; }
	public String getUNIT_COST() { return m_UNIT_COST; }
	public String getPROCESSING_COST() { return m_PROCESSING_COST; }
	public String getMATERIAL_COST() { return m_MATERIAL_COST; }
	public String getOTHER_OVERHEADS() { return m_OTHER_OVERHEADS; }
	public String getDISC_AMOUNT() { return m_DISC_AMOUNT; }
	public String getPUCH_ODR_AMOUNT() { return m_PUCH_ODR_AMOUNT; }
	public String getCONFIRM_DLV_DATE() { return m_CONFIRM_DLV_DATE; }
	public String getINV_CTRL_FLG() { return m_INV_CTRL_FLG; }
	public String getPUCH_ODR_COMMENT() { return m_PUCH_ODR_COMMENT; }
	public String getRATE_JUDGE_DATE() { return m_RATE_JUDGE_DATE; }
	public String getEXCH_RATE() { return m_EXCH_RATE; }
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
	public String getNON_NO_ITEM_FLG() { return m_NON_NO_ITEM_FLG; }
	public String getACCT_CD() { return m_ACCT_CD; }
	public String getDEPT_CD() { return m_DEPT_CD; }
	public String getPJ_CD() { return m_PJ_CD; }
	public String getSEG_CONTENTS1() { return m_SEG_CONTENTS1; }
	public String getSEG_CONTENTS2() { return m_SEG_CONTENTS2; }
	public String getSEG_CONTENTS3() { return m_SEG_CONTENTS3; }
	public String getSEG_CONTENTS4() { return m_SEG_CONTENTS4; }
	public String getASP_INSTALL_FLG() { return m_ASP_INSTALL_FLG; }
	public String getTIME_CTRL() { return m_TIME_CTRL; }
	public String getPVC2BUSINESSNAME() { return m_PVC2BUSINESSNAME; }
	public String getPVC2OUTPUTPATH() { return m_PVC2OUTPUTPATH; }
	public String getPVC2OUTPUTNAME() { return m_PVC2OUTPUTNAME; }
	public String getPVC2LOGMODE() { return m_PVC2LOGMODE; }
	public String getPVC2OUTPUTMODE() { return m_PVC2OUTPUTMODE; }
	public String getPVC2USERID() { return m_PVC2USERID; }
	public String getPVC2PLANTCD() { return m_PVC2PLANTCD; }
	public String getPVC2TAXID() { return m_PVC2TAXID; }
	public String getVEND_DECIMAL_FIG() { return m_VEND_DECIMAL_FIG; }
	public String getPNUMTAXOUTAMOUNT() { return m_PNUMTAXOUTAMOUNT; }
	public String getPNUMTAXAMOUNT() { return m_PNUMTAXAMOUNT; }
	public String getPNUMEXTERNALTAXSALESAMOUNT() { return m_PNUMEXTERNALTAXSALESAMOUNT; }
	public String getPNUMINTERNALTAXSALESAMOUNT() { return m_PNUMINTERNALTAXSALESAMOUNT; }
	public String getPNUMTAXFREESALESAMOUNT() { return m_PNUMTAXFREESALESAMOUNT; }
	public String getPNUMEXTERNALTAXAMOUNT() { return m_PNUMEXTERNALTAXAMOUNT; }
	public String getPNUMINTERNALTAXAMOUNT() { return m_PNUMINTERNALTAXAMOUNT; }
	public String getPVC2ERRCD() { return m_PVC2ERRCD; }
	public String getPNUMSTATUS() { return m_PNUMSTATUS; }
	public String getDEPT_NAME() { return m_DEPT_NAME; }

	public List getList_FileName() { return l_FileName; }
	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_l_ERROR_IN() { return l_l_ERROR_IN; }
	public List getList_l_ERR_TYP() { return l_l_ERR_TYP; }
	public List getList_l_ERR_INFO() { return l_l_ERR_INFO; }
	public List getList_l_ERR_CTR_NM() { return l_l_ERR_CTR_NM; }
	public List getList_l_ERR_ITEM_CD() { return l_l_ERR_ITEM_CD; }
	public List getList_l_ERR_PRD_DUE_DATE() { return l_l_ERR_PRD_DUE_DATE; }
	public List getList_l_ERR_PUCH_ODR_DLV_DATE() { return l_l_ERR_PUCH_ODR_DLV_DATE; }
	public List getList_l_ERR_PUCH_ODR_QTY() { return l_l_ERR_PUCH_ODR_QTY; }
	public List getList_l_ERR_VEND_CD() { return l_l_ERR_VEND_CD; }
	public List getList_l_ERR_JOB_ODR_CD() { return l_l_ERR_JOB_ODR_CD; }
	public List getList_l_ERR_CONFIRM_DLV_DATE() { return l_l_ERR_CONFIRM_DLV_DATE; }
	public List getList_l_ERR_WH_CD() { return l_l_ERR_WH_CD; }
	public List getList_l_ERR_WORK_IN_PROC_COMMENT() { return l_l_ERR_WORK_IN_PROC_COMMENT; }
	public List getList_l_ERR_NON_NO_ITEM_FLG() { return l_l_ERR_NON_NO_ITEM_FLG; }
	public List getList_l_ERR_NON_NO_ITEM_NAME() { return l_l_ERR_NON_NO_ITEM_NAME; }
	public List getList_l_ERR_NON_NO_ITEM_TYP() { return l_l_ERR_NON_NO_ITEM_TYP; }
	public List getList_l_ERR_NON_NO_ITEM_PUCH_ODR_UNIT() { return l_l_ERR_NON_NO_ITEM_PUCH_ODR_UNIT; }
	public List getList_l_ERR_UNIT_COST_TYP() { return l_l_ERR_UNIT_COST_TYP; }
	public List getList_l_ERR_ACTUAL_UNIT_PRICE() { return l_l_ERR_ACTUAL_UNIT_PRICE; }
	public List getList_l_ERR_PROCESSING_COST() { return l_l_ERR_PROCESSING_COST; }
	public List getList_l_ERR_MATERIAL_COST() { return l_l_ERR_MATERIAL_COST; }
	public List getList_l_ERR_OTHER_OVERHEADS() { return l_l_ERR_OTHER_OVERHEADS; }
	public List getList_l_ERR_NET_AMOUNT() { return l_l_ERR_NET_AMOUNT; }
	public List getList_l_ERR_EXCH_RATE() { return l_l_ERR_EXCH_RATE; }
	public List getList_h_INSTALL_FLG() { return l_h_INSTALL_FLG; }
	public List getList_l_ERR_EXPENSE_CLASS_CD() { return l_l_ERR_EXPENSE_CLASS_CD; }
	public List getList_l_ERR_DEPT_CD() { return l_l_ERR_DEPT_CD; }
	public List getList_l_ERR_PJ_CD() { return l_l_ERR_PJ_CD; }
	public List getList_l_ERR_SEG_CONTENTS1() { return l_l_ERR_SEG_CONTENTS1; }
	public List getList_l_ERR_SEG_CONTENTS2() { return l_l_ERR_SEG_CONTENTS2; }
	public List getList_l_ERR_SEG_CONTENTS3() { return l_l_ERR_SEG_CONTENTS3; }
	public List getList_l_ERR_SEG_CONTENTS4() { return l_l_ERR_SEG_CONTENTS4; }
	public List getList_w_COLUMN_FLG() { return l_w_COLUMN_FLG; }
	public List getList_L_PUCH_ODR_START_DATE() { return l_L_PUCH_ODR_START_DATE; }
	public List getList_L_JOB_ODR_CD() { return l_L_JOB_ODR_CD; }
	public List getList_L_UNIT_COST_TYP() { return l_L_UNIT_COST_TYP; }
	public List getList_L_UNIT_COST() { return l_L_UNIT_COST; }
	public List getList_L_PROCESSING_COST() { return l_L_PROCESSING_COST; }
	public List getList_L_MATERIAL_COST() { return l_L_MATERIAL_COST; }
	public List getList_L_OTHER_OVERHEADS() { return l_L_OTHER_OVERHEADS; }
	public List getList_L_NET_AMOUNT() { return l_L_NET_AMOUNT; }
	public List getList_L_EXCH_RATE() { return l_L_EXCH_RATE; }
	public List getList_L_PUCH_ODR_QTY() { return l_L_PUCH_ODR_QTY; }
	public List getList_MRP_ODR_TYP() { return l_MRP_ODR_TYP; }
	public List getList_ACPT_INSPC_TYP() { return l_ACPT_INSPC_TYP; }
	public List getList_UNIT_QTY_TYP() { return l_UNIT_QTY_TYP; }
	public List getList_FIXED_LT() { return l_FIXED_LT; }
	public List getList_PROP_LT() { return l_PROP_LT; }
	public List getList_SAFETY_LT() { return l_SAFETY_LT; }
	public List getList_PROP_LOT_SIZE() { return l_PROP_LOT_SIZE; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_DEAL_STS_FLG() { return l_DEAL_STS_FLG; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_WH_CD() { return l_WH_CD; }
	public List getList_JOB_ODR_STS_TYP() { return l_JOB_ODR_STS_TYP; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_OD_NO() { return l_OD_NO; }
	public List getList_JOB_ODR_DLV_DATE() { return l_JOB_ODR_DLV_DATE; }
	public List getList_VALUE() { return l_VALUE; }
	public List getList_NAME() { return l_NAME; }
	public List getList_PUCH_ODR_CD() { return l_PUCH_ODR_CD; }
	public List getList_NON_NO_ITEM_NAME() { return l_NON_NO_ITEM_NAME; }
	public List getList_NON_NO_ITEM_TYP() { return l_NON_NO_ITEM_TYP; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_PUCH_ODR_PERSON() { return l_PUCH_ODR_PERSON; }
	public List getList_PUCH_ODR_START_DATE() { return l_PUCH_ODR_START_DATE; }
	public List getList_PUCH_ODR_DLV_DATE() { return l_PUCH_ODR_DLV_DATE; }
	public List getList_PUCH_ODR_QTY() { return l_PUCH_ODR_QTY; }
	public List getList_NON_NO_ITEM_PUCH_ODR_UNIT() { return l_NON_NO_ITEM_PUCH_ODR_UNIT; }
	public List getList_UNIT_COST_TYP() { return l_UNIT_COST_TYP; }
	public List getList_UNIT_COST() { return l_UNIT_COST; }
	public List getList_PROCESSING_COST() { return l_PROCESSING_COST; }
	public List getList_MATERIAL_COST() { return l_MATERIAL_COST; }
	public List getList_OTHER_OVERHEADS() { return l_OTHER_OVERHEADS; }
	public List getList_DISC_AMOUNT() { return l_DISC_AMOUNT; }
	public List getList_PUCH_ODR_AMOUNT() { return l_PUCH_ODR_AMOUNT; }
	public List getList_CONFIRM_DLV_DATE() { return l_CONFIRM_DLV_DATE; }
	public List getList_INV_CTRL_FLG() { return l_INV_CTRL_FLG; }
	public List getList_PUCH_ODR_COMMENT() { return l_PUCH_ODR_COMMENT; }
	public List getList_RATE_JUDGE_DATE() { return l_RATE_JUDGE_DATE; }
	public List getList_EXCH_RATE() { return l_EXCH_RATE; }
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
	public List getList_NON_NO_ITEM_FLG() { return l_NON_NO_ITEM_FLG; }
	public List getList_ACCT_CD() { return l_ACCT_CD; }
	public List getList_DEPT_CD() { return l_DEPT_CD; }
	public List getList_PJ_CD() { return l_PJ_CD; }
	public List getList_SEG_CONTENTS1() { return l_SEG_CONTENTS1; }
	public List getList_SEG_CONTENTS2() { return l_SEG_CONTENTS2; }
	public List getList_SEG_CONTENTS3() { return l_SEG_CONTENTS3; }
	public List getList_SEG_CONTENTS4() { return l_SEG_CONTENTS4; }
	public List getList_ASP_INSTALL_FLG() { return l_ASP_INSTALL_FLG; }
	public List getList_TIME_CTRL() { return l_TIME_CTRL; }
	public List getList_PVC2BUSINESSNAME() { return l_PVC2BUSINESSNAME; }
	public List getList_PVC2OUTPUTPATH() { return l_PVC2OUTPUTPATH; }
	public List getList_PVC2OUTPUTNAME() { return l_PVC2OUTPUTNAME; }
	public List getList_PVC2LOGMODE() { return l_PVC2LOGMODE; }
	public List getList_PVC2OUTPUTMODE() { return l_PVC2OUTPUTMODE; }
	public List getList_PVC2USERID() { return l_PVC2USERID; }
	public List getList_PVC2PLANTCD() { return l_PVC2PLANTCD; }
	public List getList_PVC2TAXID() { return l_PVC2TAXID; }
	public List getList_VEND_DECIMAL_FIG() { return l_VEND_DECIMAL_FIG; }
	public List getList_PNUMTAXOUTAMOUNT() { return l_PNUMTAXOUTAMOUNT; }
	public List getList_PNUMTAXAMOUNT() { return l_PNUMTAXAMOUNT; }
	public List getList_PNUMEXTERNALTAXSALESAMOUNT() { return l_PNUMEXTERNALTAXSALESAMOUNT; }
	public List getList_PNUMINTERNALTAXSALESAMOUNT() { return l_PNUMINTERNALTAXSALESAMOUNT; }
	public List getList_PNUMTAXFREESALESAMOUNT() { return l_PNUMTAXFREESALESAMOUNT; }
	public List getList_PNUMEXTERNALTAXAMOUNT() { return l_PNUMEXTERNALTAXAMOUNT; }
	public List getList_PNUMINTERNALTAXAMOUNT() { return l_PNUMINTERNALTAXAMOUNT; }
	public List getList_PVC2ERRCD() { return l_PVC2ERRCD; }
	public List getList_PNUMSTATUS() { return l_PNUMSTATUS; }
	public List getList_DEPT_NAME() { return l_DEPT_NAME; }

	public void setFileName(String val) { m_FileName = val; }
	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setl_ERROR_IN(String val) { m_l_ERROR_IN = val; }
	public void setl_ERR_TYP(String val) { m_l_ERR_TYP = val; }
	public void setl_ERR_INFO(String val) { m_l_ERR_INFO = val; }
	public void setl_ERR_CTR_NM(String val) { m_l_ERR_CTR_NM = val; }
	public void setl_ERR_ITEM_CD(String val) { m_l_ERR_ITEM_CD = val; }
	public void setl_ERR_PRD_DUE_DATE(String val) { m_l_ERR_PRD_DUE_DATE = val; }
	public void setl_ERR_PUCH_ODR_DLV_DATE(String val) { m_l_ERR_PUCH_ODR_DLV_DATE = val; }
	public void setl_ERR_PUCH_ODR_QTY(String val) { m_l_ERR_PUCH_ODR_QTY = val; }
	public void setl_ERR_VEND_CD(String val) { m_l_ERR_VEND_CD = val; }
	public void setl_ERR_JOB_ODR_CD(String val) { m_l_ERR_JOB_ODR_CD = val; }
	public void setl_ERR_CONFIRM_DLV_DATE(String val) { m_l_ERR_CONFIRM_DLV_DATE = val; }
	public void setl_ERR_WH_CD(String val) { m_l_ERR_WH_CD = val; }
	public void setl_ERR_WORK_IN_PROC_COMMENT(String val) { m_l_ERR_WORK_IN_PROC_COMMENT = val; }
	public void setl_ERR_NON_NO_ITEM_FLG(String val) { m_l_ERR_NON_NO_ITEM_FLG = val; }
	public void setl_ERR_NON_NO_ITEM_NAME(String val) { m_l_ERR_NON_NO_ITEM_NAME = val; }
	public void setl_ERR_NON_NO_ITEM_TYP(String val) { m_l_ERR_NON_NO_ITEM_TYP = val; }
	public void setl_ERR_NON_NO_ITEM_PUCH_ODR_UNIT(String val) { m_l_ERR_NON_NO_ITEM_PUCH_ODR_UNIT = val; }
	public void setl_ERR_UNIT_COST_TYP(String val) { m_l_ERR_UNIT_COST_TYP = val; }
	public void setl_ERR_ACTUAL_UNIT_PRICE(String val) { m_l_ERR_ACTUAL_UNIT_PRICE = val; }
	public void setl_ERR_PROCESSING_COST(String val) { m_l_ERR_PROCESSING_COST = val; }
	public void setl_ERR_MATERIAL_COST(String val) { m_l_ERR_MATERIAL_COST = val; }
	public void setl_ERR_OTHER_OVERHEADS(String val) { m_l_ERR_OTHER_OVERHEADS = val; }
	public void setl_ERR_NET_AMOUNT(String val) { m_l_ERR_NET_AMOUNT = val; }
	public void setl_ERR_EXCH_RATE(String val) { m_l_ERR_EXCH_RATE = val; }
	public void seth_INSTALL_FLG(String val) { m_h_INSTALL_FLG = val; }
	public void setl_ERR_EXPENSE_CLASS_CD(String val) { m_l_ERR_EXPENSE_CLASS_CD = val; }
	public void setl_ERR_DEPT_CD(String val) { m_l_ERR_DEPT_CD = val; }
	public void setl_ERR_PJ_CD(String val) { m_l_ERR_PJ_CD = val; }
	public void setl_ERR_SEG_CONTENTS1(String val) { m_l_ERR_SEG_CONTENTS1 = val; }
	public void setl_ERR_SEG_CONTENTS2(String val) { m_l_ERR_SEG_CONTENTS2 = val; }
	public void setl_ERR_SEG_CONTENTS3(String val) { m_l_ERR_SEG_CONTENTS3 = val; }
	public void setl_ERR_SEG_CONTENTS4(String val) { m_l_ERR_SEG_CONTENTS4 = val; }
	public void setw_COLUMN_FLG(String val) { m_w_COLUMN_FLG = val; }
	public void setL_PUCH_ODR_START_DATE(String val) { m_L_PUCH_ODR_START_DATE = val; }
	public void setL_JOB_ODR_CD(String val) { m_L_JOB_ODR_CD = val; }
	public void setL_UNIT_COST_TYP(String val) { m_L_UNIT_COST_TYP = val; }
	public void setL_UNIT_COST(String val) { m_L_UNIT_COST = val; }
	public void setL_PROCESSING_COST(String val) { m_L_PROCESSING_COST = val; }
	public void setL_MATERIAL_COST(String val) { m_L_MATERIAL_COST = val; }
	public void setL_OTHER_OVERHEADS(String val) { m_L_OTHER_OVERHEADS = val; }
	public void setL_NET_AMOUNT(String val) { m_L_NET_AMOUNT = val; }
	public void setL_EXCH_RATE(String val) { m_L_EXCH_RATE = val; }
	public void setL_PUCH_ODR_QTY(String val) { m_L_PUCH_ODR_QTY = val; }
	public void setMRP_ODR_TYP(String val) { m_MRP_ODR_TYP = val; }
	public void setACPT_INSPC_TYP(String val) { m_ACPT_INSPC_TYP = val; }
	public void setUNIT_QTY_TYP(String val) { m_UNIT_QTY_TYP = val; }
	public void setFIXED_LT(String val) { m_FIXED_LT = val; }
	public void setPROP_LT(String val) { m_PROP_LT = val; }
	public void setSAFETY_LT(String val) { m_SAFETY_LT = val; }
	public void setPROP_LOT_SIZE(String val) { m_PROP_LOT_SIZE = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void setDEAL_STS_FLG(String val) { m_DEAL_STS_FLG = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setWH_CD(String val) { m_WH_CD = val; }
	public void setJOB_ODR_STS_TYP(String val) { m_JOB_ODR_STS_TYP = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setOD_NO(String val) { m_OD_NO = val; }
	public void setJOB_ODR_DLV_DATE(String val) { m_JOB_ODR_DLV_DATE = val; }
	public void setVALUE(String val) { m_VALUE = val; }
	public void setNAME(String val) { m_NAME = val; }
	public void setPUCH_ODR_CD(String val) { m_PUCH_ODR_CD = val; }
	public void setNON_NO_ITEM_NAME(String val) { m_NON_NO_ITEM_NAME = val; }
	public void setNON_NO_ITEM_TYP(String val) { m_NON_NO_ITEM_TYP = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setPUCH_ODR_PERSON(String val) { m_PUCH_ODR_PERSON = val; }
	public void setPUCH_ODR_START_DATE(String val) { m_PUCH_ODR_START_DATE = val; }
	public void setPUCH_ODR_DLV_DATE(String val) { m_PUCH_ODR_DLV_DATE = val; }
	public void setPUCH_ODR_QTY(String val) { m_PUCH_ODR_QTY = val; }
	public void setNON_NO_ITEM_PUCH_ODR_UNIT(String val) { m_NON_NO_ITEM_PUCH_ODR_UNIT = val; }
	public void setUNIT_COST_TYP(String val) { m_UNIT_COST_TYP = val; }
	public void setUNIT_COST(String val) { m_UNIT_COST = val; }
	public void setPROCESSING_COST(String val) { m_PROCESSING_COST = val; }
	public void setMATERIAL_COST(String val) { m_MATERIAL_COST = val; }
	public void setOTHER_OVERHEADS(String val) { m_OTHER_OVERHEADS = val; }
	public void setDISC_AMOUNT(String val) { m_DISC_AMOUNT = val; }
	public void setPUCH_ODR_AMOUNT(String val) { m_PUCH_ODR_AMOUNT = val; }
	public void setCONFIRM_DLV_DATE(String val) { m_CONFIRM_DLV_DATE = val; }
	public void setINV_CTRL_FLG(String val) { m_INV_CTRL_FLG = val; }
	public void setPUCH_ODR_COMMENT(String val) { m_PUCH_ODR_COMMENT = val; }
	public void setRATE_JUDGE_DATE(String val) { m_RATE_JUDGE_DATE = val; }
	public void setEXCH_RATE(String val) { m_EXCH_RATE = val; }
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
	public void setNON_NO_ITEM_FLG(String val) { m_NON_NO_ITEM_FLG = val; }
	public void setACCT_CD(String val) { m_ACCT_CD = val; }
	public void setDEPT_CD(String val) { m_DEPT_CD = val; }
	public void setPJ_CD(String val) { m_PJ_CD = val; }
	public void setSEG_CONTENTS1(String val) { m_SEG_CONTENTS1 = val; }
	public void setSEG_CONTENTS2(String val) { m_SEG_CONTENTS2 = val; }
	public void setSEG_CONTENTS3(String val) { m_SEG_CONTENTS3 = val; }
	public void setSEG_CONTENTS4(String val) { m_SEG_CONTENTS4 = val; }
	public void setASP_INSTALL_FLG(String val) { m_ASP_INSTALL_FLG = val; }
	public void setTIME_CTRL(String val) { m_TIME_CTRL = val; }
	public void setPVC2BUSINESSNAME(String val) { m_PVC2BUSINESSNAME = val; }
	public void setPVC2OUTPUTPATH(String val) { m_PVC2OUTPUTPATH = val; }
	public void setPVC2OUTPUTNAME(String val) { m_PVC2OUTPUTNAME = val; }
	public void setPVC2LOGMODE(String val) { m_PVC2LOGMODE = val; }
	public void setPVC2OUTPUTMODE(String val) { m_PVC2OUTPUTMODE = val; }
	public void setPVC2USERID(String val) { m_PVC2USERID = val; }
	public void setPVC2PLANTCD(String val) { m_PVC2PLANTCD = val; }
	public void setPVC2TAXID(String val) { m_PVC2TAXID = val; }
	public void setVEND_DECIMAL_FIG(String val) { m_VEND_DECIMAL_FIG = val; }
	public void setPNUMTAXOUTAMOUNT(String val) { m_PNUMTAXOUTAMOUNT = val; }
	public void setPNUMTAXAMOUNT(String val) { m_PNUMTAXAMOUNT = val; }
	public void setPNUMEXTERNALTAXSALESAMOUNT(String val) { m_PNUMEXTERNALTAXSALESAMOUNT = val; }
	public void setPNUMINTERNALTAXSALESAMOUNT(String val) { m_PNUMINTERNALTAXSALESAMOUNT = val; }
	public void setPNUMTAXFREESALESAMOUNT(String val) { m_PNUMTAXFREESALESAMOUNT = val; }
	public void setPNUMEXTERNALTAXAMOUNT(String val) { m_PNUMEXTERNALTAXAMOUNT = val; }
	public void setPNUMINTERNALTAXAMOUNT(String val) { m_PNUMINTERNALTAXAMOUNT = val; }
	public void setPVC2ERRCD(String val) { m_PVC2ERRCD = val; }
	public void setPNUMSTATUS(String val) { m_PNUMSTATUS = val; }
	public void setDEPT_NAME(String val) { m_DEPT_NAME = val; }


	public void setList_FileName(List list) { l_FileName = list; }
	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_l_ERROR_IN(List list) { l_l_ERROR_IN = list; }
	public void setList_l_ERR_TYP(List list) { l_l_ERR_TYP = list; }
	public void setList_l_ERR_INFO(List list) { l_l_ERR_INFO = list; }
	public void setList_l_ERR_CTR_NM(List list) { l_l_ERR_CTR_NM = list; }
	public void setList_l_ERR_ITEM_CD(List list) { l_l_ERR_ITEM_CD = list; }
	public void setList_l_ERR_PRD_DUE_DATE(List list) { l_l_ERR_PRD_DUE_DATE = list; }
	public void setList_l_ERR_PUCH_ODR_DLV_DATE(List list) { l_l_ERR_PUCH_ODR_DLV_DATE = list; }
	public void setList_l_ERR_PUCH_ODR_QTY(List list) { l_l_ERR_PUCH_ODR_QTY = list; }
	public void setList_l_ERR_VEND_CD(List list) { l_l_ERR_VEND_CD = list; }
	public void setList_l_ERR_JOB_ODR_CD(List list) { l_l_ERR_JOB_ODR_CD = list; }
	public void setList_l_ERR_CONFIRM_DLV_DATE(List list) { l_l_ERR_CONFIRM_DLV_DATE = list; }
	public void setList_l_ERR_WH_CD(List list) { l_l_ERR_WH_CD = list; }
	public void setList_l_ERR_WORK_IN_PROC_COMMENT(List list) { l_l_ERR_WORK_IN_PROC_COMMENT = list; }
	public void setList_l_ERR_NON_NO_ITEM_FLG(List list) { l_l_ERR_NON_NO_ITEM_FLG = list; }
	public void setList_l_ERR_NON_NO_ITEM_NAME(List list) { l_l_ERR_NON_NO_ITEM_NAME = list; }
	public void setList_l_ERR_NON_NO_ITEM_TYP(List list) { l_l_ERR_NON_NO_ITEM_TYP = list; }
	public void setList_l_ERR_NON_NO_ITEM_PUCH_ODR_UNIT(List list) { l_l_ERR_NON_NO_ITEM_PUCH_ODR_UNIT = list; }
	public void setList_l_ERR_UNIT_COST_TYP(List list) { l_l_ERR_UNIT_COST_TYP = list; }
	public void setList_l_ERR_ACTUAL_UNIT_PRICE(List list) { l_l_ERR_ACTUAL_UNIT_PRICE = list; }
	public void setList_l_ERR_PROCESSING_COST(List list) { l_l_ERR_PROCESSING_COST = list; }
	public void setList_l_ERR_MATERIAL_COST(List list) { l_l_ERR_MATERIAL_COST = list; }
	public void setList_l_ERR_OTHER_OVERHEADS(List list) { l_l_ERR_OTHER_OVERHEADS = list; }
	public void setList_l_ERR_NET_AMOUNT(List list) { l_l_ERR_NET_AMOUNT = list; }
	public void setList_l_ERR_EXCH_RATE(List list) { l_l_ERR_EXCH_RATE = list; }
	public void setList_h_INSTALL_FLG(List list) { l_h_INSTALL_FLG = list; }
	public void setList_l_ERR_EXPENSE_CLASS_CD(List list) { l_l_ERR_EXPENSE_CLASS_CD = list; }
	public void setList_l_ERR_DEPT_CD(List list) { l_l_ERR_DEPT_CD = list; }
	public void setList_l_ERR_PJ_CD(List list) { l_l_ERR_PJ_CD = list; }
	public void setList_l_ERR_SEG_CONTENTS1(List list) { l_l_ERR_SEG_CONTENTS1 = list; }
	public void setList_l_ERR_SEG_CONTENTS2(List list) { l_l_ERR_SEG_CONTENTS2 = list; }
	public void setList_l_ERR_SEG_CONTENTS3(List list) { l_l_ERR_SEG_CONTENTS3 = list; }
	public void setList_l_ERR_SEG_CONTENTS4(List list) { l_l_ERR_SEG_CONTENTS4 = list; }
	public void setList_w_COLUMN_FLG(List list) { l_w_COLUMN_FLG = list; }
	public void setList_L_PUCH_ODR_START_DATE(List list) { l_L_PUCH_ODR_START_DATE = list; }
	public void setList_L_JOB_ODR_CD(List list) { l_L_JOB_ODR_CD = list; }
	public void setList_L_UNIT_COST_TYP(List list) { l_L_UNIT_COST_TYP = list; }
	public void setList_L_UNIT_COST(List list) { l_L_UNIT_COST = list; }
	public void setList_L_PROCESSING_COST(List list) { l_L_PROCESSING_COST = list; }
	public void setList_L_MATERIAL_COST(List list) { l_L_MATERIAL_COST = list; }
	public void setList_L_OTHER_OVERHEADS(List list) { l_L_OTHER_OVERHEADS = list; }
	public void setList_L_NET_AMOUNT(List list) { l_L_NET_AMOUNT = list; }
	public void setList_L_EXCH_RATE(List list) { l_L_EXCH_RATE = list; }
	public void setList_L_PUCH_ODR_QTY(List list) { l_L_PUCH_ODR_QTY = list; }
	public void setList_MRP_ODR_TYP(List list) { l_MRP_ODR_TYP = list; }
	public void setList_ACPT_INSPC_TYP(List list) { l_ACPT_INSPC_TYP = list; }
	public void setList_UNIT_QTY_TYP(List list) { l_UNIT_QTY_TYP = list; }
	public void setList_FIXED_LT(List list) { l_FIXED_LT = list; }
	public void setList_PROP_LT(List list) { l_PROP_LT = list; }
	public void setList_SAFETY_LT(List list) { l_SAFETY_LT = list; }
	public void setList_PROP_LOT_SIZE(List list) { l_PROP_LOT_SIZE = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_DEAL_STS_FLG(List list) { l_DEAL_STS_FLG = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_WH_CD(List list) { l_WH_CD = list; }
	public void setList_JOB_ODR_STS_TYP(List list) { l_JOB_ODR_STS_TYP = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_OD_NO(List list) { l_OD_NO = list; }
	public void setList_JOB_ODR_DLV_DATE(List list) { l_JOB_ODR_DLV_DATE = list; }
	public void setList_VALUE(List list) { l_VALUE = list; }
	public void setList_NAME(List list) { l_NAME = list; }
	public void setList_PUCH_ODR_CD(List list) { l_PUCH_ODR_CD = list; }
	public void setList_NON_NO_ITEM_NAME(List list) { l_NON_NO_ITEM_NAME = list; }
	public void setList_NON_NO_ITEM_TYP(List list) { l_NON_NO_ITEM_TYP = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_PUCH_ODR_PERSON(List list) { l_PUCH_ODR_PERSON = list; }
	public void setList_PUCH_ODR_START_DATE(List list) { l_PUCH_ODR_START_DATE = list; }
	public void setList_PUCH_ODR_DLV_DATE(List list) { l_PUCH_ODR_DLV_DATE = list; }
	public void setList_PUCH_ODR_QTY(List list) { l_PUCH_ODR_QTY = list; }
	public void setList_NON_NO_ITEM_PUCH_ODR_UNIT(List list) { l_NON_NO_ITEM_PUCH_ODR_UNIT = list; }
	public void setList_UNIT_COST_TYP(List list) { l_UNIT_COST_TYP = list; }
	public void setList_UNIT_COST(List list) { l_UNIT_COST = list; }
	public void setList_PROCESSING_COST(List list) { l_PROCESSING_COST = list; }
	public void setList_MATERIAL_COST(List list) { l_MATERIAL_COST = list; }
	public void setList_OTHER_OVERHEADS(List list) { l_OTHER_OVERHEADS = list; }
	public void setList_DISC_AMOUNT(List list) { l_DISC_AMOUNT = list; }
	public void setList_PUCH_ODR_AMOUNT(List list) { l_PUCH_ODR_AMOUNT = list; }
	public void setList_CONFIRM_DLV_DATE(List list) { l_CONFIRM_DLV_DATE = list; }
	public void setList_INV_CTRL_FLG(List list) { l_INV_CTRL_FLG = list; }
	public void setList_PUCH_ODR_COMMENT(List list) { l_PUCH_ODR_COMMENT = list; }
	public void setList_RATE_JUDGE_DATE(List list) { l_RATE_JUDGE_DATE = list; }
	public void setList_EXCH_RATE(List list) { l_EXCH_RATE = list; }
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
	public void setList_NON_NO_ITEM_FLG(List list) { l_NON_NO_ITEM_FLG = list; }
	public void setList_ACCT_CD(List list) { l_ACCT_CD = list; }
	public void setList_DEPT_CD(List list) { l_DEPT_CD = list; }
	public void setList_PJ_CD(List list) { l_PJ_CD = list; }
	public void setList_SEG_CONTENTS1(List list) { l_SEG_CONTENTS1 = list; }
	public void setList_SEG_CONTENTS2(List list) { l_SEG_CONTENTS2 = list; }
	public void setList_SEG_CONTENTS3(List list) { l_SEG_CONTENTS3 = list; }
	public void setList_SEG_CONTENTS4(List list) { l_SEG_CONTENTS4 = list; }
	public void setList_ASP_INSTALL_FLG(List list) { l_ASP_INSTALL_FLG = list; }
	public void setList_TIME_CTRL(List list) { l_TIME_CTRL = list; }
	public void setList_PVC2BUSINESSNAME(List list) { l_PVC2BUSINESSNAME = list; }
	public void setList_PVC2OUTPUTPATH(List list) { l_PVC2OUTPUTPATH = list; }
	public void setList_PVC2OUTPUTNAME(List list) { l_PVC2OUTPUTNAME = list; }
	public void setList_PVC2LOGMODE(List list) { l_PVC2LOGMODE = list; }
	public void setList_PVC2OUTPUTMODE(List list) { l_PVC2OUTPUTMODE = list; }
	public void setList_PVC2USERID(List list) { l_PVC2USERID = list; }
	public void setList_PVC2PLANTCD(List list) { l_PVC2PLANTCD = list; }
	public void setList_PVC2TAXID(List list) { l_PVC2TAXID = list; }
	public void setList_VEND_DECIMAL_FIG(List list) { l_VEND_DECIMAL_FIG = list; }
	public void setList_PNUMTAXOUTAMOUNT(List list) { l_PNUMTAXOUTAMOUNT = list; }
	public void setList_PNUMTAXAMOUNT(List list) { l_PNUMTAXAMOUNT = list; }
	public void setList_PNUMEXTERNALTAXSALESAMOUNT(List list) { l_PNUMEXTERNALTAXSALESAMOUNT = list; }
	public void setList_PNUMINTERNALTAXSALESAMOUNT(List list) { l_PNUMINTERNALTAXSALESAMOUNT = list; }
	public void setList_PNUMTAXFREESALESAMOUNT(List list) { l_PNUMTAXFREESALESAMOUNT = list; }
	public void setList_PNUMEXTERNALTAXAMOUNT(List list) { l_PNUMEXTERNALTAXAMOUNT = list; }
	public void setList_PNUMINTERNALTAXAMOUNT(List list) { l_PNUMINTERNALTAXAMOUNT = list; }
	public void setList_PVC2ERRCD(List list) { l_PVC2ERRCD = list; }
	public void setList_PNUMSTATUS(List list) { l_PNUMSTATUS = list; }
	public void setList_DEPT_NAME(List list) { l_DEPT_NAME = list; }

	public int setL2L_FileName(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FileName == null) {
			l_FileName = new ArrayList();
		} else {
			l_FileName.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FileName.add(((AE0180010Struct) list.get(i)).getFileName());
		}
		return size;
	}
	public int setL2L_DOWNLOAD_FILE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DOWNLOAD_FILE == null) {
			l_DOWNLOAD_FILE = new ArrayList();
		} else {
			l_DOWNLOAD_FILE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DOWNLOAD_FILE.add(((AE0180010Struct) list.get(i)).getDOWNLOAD_FILE());
		}
		return size;
	}
	public int setL2L_l_ERROR_IN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERROR_IN == null) {
			l_l_ERROR_IN = new ArrayList();
		} else {
			l_l_ERROR_IN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERROR_IN.add(((AE0180010Struct) list.get(i)).getl_ERROR_IN());
		}
		return size;
	}
	public int setL2L_l_ERR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_TYP == null) {
			l_l_ERR_TYP = new ArrayList();
		} else {
			l_l_ERR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_TYP.add(((AE0180010Struct) list.get(i)).getl_ERR_TYP());
		}
		return size;
	}
	public int setL2L_l_ERR_INFO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_INFO == null) {
			l_l_ERR_INFO = new ArrayList();
		} else {
			l_l_ERR_INFO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_INFO.add(((AE0180010Struct) list.get(i)).getl_ERR_INFO());
		}
		return size;
	}
	public int setL2L_l_ERR_CTR_NM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_CTR_NM == null) {
			l_l_ERR_CTR_NM = new ArrayList();
		} else {
			l_l_ERR_CTR_NM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_CTR_NM.add(((AE0180010Struct) list.get(i)).getl_ERR_CTR_NM());
		}
		return size;
	}
	public int setL2L_l_ERR_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_ITEM_CD == null) {
			l_l_ERR_ITEM_CD = new ArrayList();
		} else {
			l_l_ERR_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_ITEM_CD.add(((AE0180010Struct) list.get(i)).getl_ERR_ITEM_CD());
		}
		return size;
	}
	public int setL2L_l_ERR_PRD_DUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_PRD_DUE_DATE == null) {
			l_l_ERR_PRD_DUE_DATE = new ArrayList();
		} else {
			l_l_ERR_PRD_DUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_PRD_DUE_DATE.add(((AE0180010Struct) list.get(i)).getl_ERR_PRD_DUE_DATE());
		}
		return size;
	}
	public int setL2L_l_ERR_PUCH_ODR_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_PUCH_ODR_DLV_DATE == null) {
			l_l_ERR_PUCH_ODR_DLV_DATE = new ArrayList();
		} else {
			l_l_ERR_PUCH_ODR_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_PUCH_ODR_DLV_DATE.add(((AE0180010Struct) list.get(i)).getl_ERR_PUCH_ODR_DLV_DATE());
		}
		return size;
	}
	public int setL2L_l_ERR_PUCH_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_PUCH_ODR_QTY == null) {
			l_l_ERR_PUCH_ODR_QTY = new ArrayList();
		} else {
			l_l_ERR_PUCH_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_PUCH_ODR_QTY.add(((AE0180010Struct) list.get(i)).getl_ERR_PUCH_ODR_QTY());
		}
		return size;
	}
	public int setL2L_l_ERR_VEND_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_VEND_CD == null) {
			l_l_ERR_VEND_CD = new ArrayList();
		} else {
			l_l_ERR_VEND_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_VEND_CD.add(((AE0180010Struct) list.get(i)).getl_ERR_VEND_CD());
		}
		return size;
	}
	public int setL2L_l_ERR_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_JOB_ODR_CD == null) {
			l_l_ERR_JOB_ODR_CD = new ArrayList();
		} else {
			l_l_ERR_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_JOB_ODR_CD.add(((AE0180010Struct) list.get(i)).getl_ERR_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_l_ERR_CONFIRM_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_CONFIRM_DLV_DATE == null) {
			l_l_ERR_CONFIRM_DLV_DATE = new ArrayList();
		} else {
			l_l_ERR_CONFIRM_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_CONFIRM_DLV_DATE.add(((AE0180010Struct) list.get(i)).getl_ERR_CONFIRM_DLV_DATE());
		}
		return size;
	}
	public int setL2L_l_ERR_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_WH_CD == null) {
			l_l_ERR_WH_CD = new ArrayList();
		} else {
			l_l_ERR_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_WH_CD.add(((AE0180010Struct) list.get(i)).getl_ERR_WH_CD());
		}
		return size;
	}
	public int setL2L_l_ERR_WORK_IN_PROC_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_WORK_IN_PROC_COMMENT == null) {
			l_l_ERR_WORK_IN_PROC_COMMENT = new ArrayList();
		} else {
			l_l_ERR_WORK_IN_PROC_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_WORK_IN_PROC_COMMENT.add(((AE0180010Struct) list.get(i)).getl_ERR_WORK_IN_PROC_COMMENT());
		}
		return size;
	}
	public int setL2L_l_ERR_NON_NO_ITEM_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_NON_NO_ITEM_FLG == null) {
			l_l_ERR_NON_NO_ITEM_FLG = new ArrayList();
		} else {
			l_l_ERR_NON_NO_ITEM_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_NON_NO_ITEM_FLG.add(((AE0180010Struct) list.get(i)).getl_ERR_NON_NO_ITEM_FLG());
		}
		return size;
	}
	public int setL2L_l_ERR_NON_NO_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_NON_NO_ITEM_NAME == null) {
			l_l_ERR_NON_NO_ITEM_NAME = new ArrayList();
		} else {
			l_l_ERR_NON_NO_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_NON_NO_ITEM_NAME.add(((AE0180010Struct) list.get(i)).getl_ERR_NON_NO_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_l_ERR_NON_NO_ITEM_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_NON_NO_ITEM_TYP == null) {
			l_l_ERR_NON_NO_ITEM_TYP = new ArrayList();
		} else {
			l_l_ERR_NON_NO_ITEM_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_NON_NO_ITEM_TYP.add(((AE0180010Struct) list.get(i)).getl_ERR_NON_NO_ITEM_TYP());
		}
		return size;
	}
	public int setL2L_l_ERR_NON_NO_ITEM_PUCH_ODR_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_NON_NO_ITEM_PUCH_ODR_UNIT == null) {
			l_l_ERR_NON_NO_ITEM_PUCH_ODR_UNIT = new ArrayList();
		} else {
			l_l_ERR_NON_NO_ITEM_PUCH_ODR_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_NON_NO_ITEM_PUCH_ODR_UNIT.add(((AE0180010Struct) list.get(i)).getl_ERR_NON_NO_ITEM_PUCH_ODR_UNIT());
		}
		return size;
	}
	public int setL2L_l_ERR_UNIT_COST_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_UNIT_COST_TYP == null) {
			l_l_ERR_UNIT_COST_TYP = new ArrayList();
		} else {
			l_l_ERR_UNIT_COST_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_UNIT_COST_TYP.add(((AE0180010Struct) list.get(i)).getl_ERR_UNIT_COST_TYP());
		}
		return size;
	}
	public int setL2L_l_ERR_ACTUAL_UNIT_PRICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_ACTUAL_UNIT_PRICE == null) {
			l_l_ERR_ACTUAL_UNIT_PRICE = new ArrayList();
		} else {
			l_l_ERR_ACTUAL_UNIT_PRICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_ACTUAL_UNIT_PRICE.add(((AE0180010Struct) list.get(i)).getl_ERR_ACTUAL_UNIT_PRICE());
		}
		return size;
	}
	public int setL2L_l_ERR_PROCESSING_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_PROCESSING_COST == null) {
			l_l_ERR_PROCESSING_COST = new ArrayList();
		} else {
			l_l_ERR_PROCESSING_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_PROCESSING_COST.add(((AE0180010Struct) list.get(i)).getl_ERR_PROCESSING_COST());
		}
		return size;
	}
	public int setL2L_l_ERR_MATERIAL_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_MATERIAL_COST == null) {
			l_l_ERR_MATERIAL_COST = new ArrayList();
		} else {
			l_l_ERR_MATERIAL_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_MATERIAL_COST.add(((AE0180010Struct) list.get(i)).getl_ERR_MATERIAL_COST());
		}
		return size;
	}
	public int setL2L_l_ERR_OTHER_OVERHEADS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_OTHER_OVERHEADS == null) {
			l_l_ERR_OTHER_OVERHEADS = new ArrayList();
		} else {
			l_l_ERR_OTHER_OVERHEADS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_OTHER_OVERHEADS.add(((AE0180010Struct) list.get(i)).getl_ERR_OTHER_OVERHEADS());
		}
		return size;
	}
	public int setL2L_l_ERR_NET_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_NET_AMOUNT == null) {
			l_l_ERR_NET_AMOUNT = new ArrayList();
		} else {
			l_l_ERR_NET_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_NET_AMOUNT.add(((AE0180010Struct) list.get(i)).getl_ERR_NET_AMOUNT());
		}
		return size;
	}
	public int setL2L_l_ERR_EXCH_RATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_EXCH_RATE == null) {
			l_l_ERR_EXCH_RATE = new ArrayList();
		} else {
			l_l_ERR_EXCH_RATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_EXCH_RATE.add(((AE0180010Struct) list.get(i)).getl_ERR_EXCH_RATE());
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
			l_h_INSTALL_FLG.add(((AE0180010Struct) list.get(i)).geth_INSTALL_FLG());
		}
		return size;
	}
	public int setL2L_l_ERR_EXPENSE_CLASS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_EXPENSE_CLASS_CD == null) {
			l_l_ERR_EXPENSE_CLASS_CD = new ArrayList();
		} else {
			l_l_ERR_EXPENSE_CLASS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_EXPENSE_CLASS_CD.add(((AE0180010Struct) list.get(i)).getl_ERR_EXPENSE_CLASS_CD());
		}
		return size;
	}
	public int setL2L_l_ERR_DEPT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_DEPT_CD == null) {
			l_l_ERR_DEPT_CD = new ArrayList();
		} else {
			l_l_ERR_DEPT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_DEPT_CD.add(((AE0180010Struct) list.get(i)).getl_ERR_DEPT_CD());
		}
		return size;
	}
	public int setL2L_l_ERR_PJ_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_PJ_CD == null) {
			l_l_ERR_PJ_CD = new ArrayList();
		} else {
			l_l_ERR_PJ_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_PJ_CD.add(((AE0180010Struct) list.get(i)).getl_ERR_PJ_CD());
		}
		return size;
	}
	public int setL2L_l_ERR_SEG_CONTENTS1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_SEG_CONTENTS1 == null) {
			l_l_ERR_SEG_CONTENTS1 = new ArrayList();
		} else {
			l_l_ERR_SEG_CONTENTS1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_SEG_CONTENTS1.add(((AE0180010Struct) list.get(i)).getl_ERR_SEG_CONTENTS1());
		}
		return size;
	}
	public int setL2L_l_ERR_SEG_CONTENTS2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_SEG_CONTENTS2 == null) {
			l_l_ERR_SEG_CONTENTS2 = new ArrayList();
		} else {
			l_l_ERR_SEG_CONTENTS2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_SEG_CONTENTS2.add(((AE0180010Struct) list.get(i)).getl_ERR_SEG_CONTENTS2());
		}
		return size;
	}
	public int setL2L_l_ERR_SEG_CONTENTS3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_SEG_CONTENTS3 == null) {
			l_l_ERR_SEG_CONTENTS3 = new ArrayList();
		} else {
			l_l_ERR_SEG_CONTENTS3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_SEG_CONTENTS3.add(((AE0180010Struct) list.get(i)).getl_ERR_SEG_CONTENTS3());
		}
		return size;
	}
	public int setL2L_l_ERR_SEG_CONTENTS4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ERR_SEG_CONTENTS4 == null) {
			l_l_ERR_SEG_CONTENTS4 = new ArrayList();
		} else {
			l_l_ERR_SEG_CONTENTS4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ERR_SEG_CONTENTS4.add(((AE0180010Struct) list.get(i)).getl_ERR_SEG_CONTENTS4());
		}
		return size;
	}
	public int setL2L_w_COLUMN_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_COLUMN_FLG == null) {
			l_w_COLUMN_FLG = new ArrayList();
		} else {
			l_w_COLUMN_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_COLUMN_FLG.add(((AE0180010Struct) list.get(i)).getw_COLUMN_FLG());
		}
		return size;
	}
	public int setL2L_L_PUCH_ODR_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_PUCH_ODR_START_DATE == null) {
			l_L_PUCH_ODR_START_DATE = new ArrayList();
		} else {
			l_L_PUCH_ODR_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_PUCH_ODR_START_DATE.add(((AE0180010Struct) list.get(i)).getL_PUCH_ODR_START_DATE());
		}
		return size;
	}
	public int setL2L_L_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_JOB_ODR_CD == null) {
			l_L_JOB_ODR_CD = new ArrayList();
		} else {
			l_L_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_JOB_ODR_CD.add(((AE0180010Struct) list.get(i)).getL_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_L_UNIT_COST_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_UNIT_COST_TYP == null) {
			l_L_UNIT_COST_TYP = new ArrayList();
		} else {
			l_L_UNIT_COST_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_UNIT_COST_TYP.add(((AE0180010Struct) list.get(i)).getL_UNIT_COST_TYP());
		}
		return size;
	}
	public int setL2L_L_UNIT_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_UNIT_COST == null) {
			l_L_UNIT_COST = new ArrayList();
		} else {
			l_L_UNIT_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_UNIT_COST.add(((AE0180010Struct) list.get(i)).getL_UNIT_COST());
		}
		return size;
	}
	public int setL2L_L_PROCESSING_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_PROCESSING_COST == null) {
			l_L_PROCESSING_COST = new ArrayList();
		} else {
			l_L_PROCESSING_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_PROCESSING_COST.add(((AE0180010Struct) list.get(i)).getL_PROCESSING_COST());
		}
		return size;
	}
	public int setL2L_L_MATERIAL_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_MATERIAL_COST == null) {
			l_L_MATERIAL_COST = new ArrayList();
		} else {
			l_L_MATERIAL_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_MATERIAL_COST.add(((AE0180010Struct) list.get(i)).getL_MATERIAL_COST());
		}
		return size;
	}
	public int setL2L_L_OTHER_OVERHEADS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_OTHER_OVERHEADS == null) {
			l_L_OTHER_OVERHEADS = new ArrayList();
		} else {
			l_L_OTHER_OVERHEADS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_OTHER_OVERHEADS.add(((AE0180010Struct) list.get(i)).getL_OTHER_OVERHEADS());
		}
		return size;
	}
	public int setL2L_L_NET_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_NET_AMOUNT == null) {
			l_L_NET_AMOUNT = new ArrayList();
		} else {
			l_L_NET_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_NET_AMOUNT.add(((AE0180010Struct) list.get(i)).getL_NET_AMOUNT());
		}
		return size;
	}
	public int setL2L_L_EXCH_RATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_EXCH_RATE == null) {
			l_L_EXCH_RATE = new ArrayList();
		} else {
			l_L_EXCH_RATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_EXCH_RATE.add(((AE0180010Struct) list.get(i)).getL_EXCH_RATE());
		}
		return size;
	}
	public int setL2L_L_PUCH_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_L_PUCH_ODR_QTY == null) {
			l_L_PUCH_ODR_QTY = new ArrayList();
		} else {
			l_L_PUCH_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_L_PUCH_ODR_QTY.add(((AE0180010Struct) list.get(i)).getL_PUCH_ODR_QTY());
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
			l_MRP_ODR_TYP.add(((AE0180010Struct) list.get(i)).getMRP_ODR_TYP());
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
			l_ACPT_INSPC_TYP.add(((AE0180010Struct) list.get(i)).getACPT_INSPC_TYP());
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
			l_UNIT_QTY_TYP.add(((AE0180010Struct) list.get(i)).getUNIT_QTY_TYP());
		}
		return size;
	}
	public int setL2L_FIXED_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FIXED_LT == null) {
			l_FIXED_LT = new ArrayList();
		} else {
			l_FIXED_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FIXED_LT.add(((AE0180010Struct) list.get(i)).getFIXED_LT());
		}
		return size;
	}
	public int setL2L_PROP_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROP_LT == null) {
			l_PROP_LT = new ArrayList();
		} else {
			l_PROP_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROP_LT.add(((AE0180010Struct) list.get(i)).getPROP_LT());
		}
		return size;
	}
	public int setL2L_SAFETY_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SAFETY_LT == null) {
			l_SAFETY_LT = new ArrayList();
		} else {
			l_SAFETY_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SAFETY_LT.add(((AE0180010Struct) list.get(i)).getSAFETY_LT());
		}
		return size;
	}
	public int setL2L_PROP_LOT_SIZE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROP_LOT_SIZE == null) {
			l_PROP_LOT_SIZE = new ArrayList();
		} else {
			l_PROP_LOT_SIZE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROP_LOT_SIZE.add(((AE0180010Struct) list.get(i)).getPROP_LOT_SIZE());
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
			l_ITEM_CD.add(((AE0180010Struct) list.get(i)).getITEM_CD());
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
			l_VEND_CD.add(((AE0180010Struct) list.get(i)).getVEND_CD());
		}
		return size;
	}
	public int setL2L_DEAL_STS_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEAL_STS_FLG == null) {
			l_DEAL_STS_FLG = new ArrayList();
		} else {
			l_DEAL_STS_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEAL_STS_FLG.add(((AE0180010Struct) list.get(i)).getDEAL_STS_FLG());
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
			l_PLANT_CD.add(((AE0180010Struct) list.get(i)).getPLANT_CD());
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
			l_WH_CD.add(((AE0180010Struct) list.get(i)).getWH_CD());
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
			l_JOB_ODR_STS_TYP.add(((AE0180010Struct) list.get(i)).getJOB_ODR_STS_TYP());
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
			l_JOB_ODR_CD.add(((AE0180010Struct) list.get(i)).getJOB_ODR_CD());
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
			l_OD_NO.add(((AE0180010Struct) list.get(i)).getOD_NO());
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
			l_JOB_ODR_DLV_DATE.add(((AE0180010Struct) list.get(i)).getJOB_ODR_DLV_DATE());
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
			l_VALUE.add(((AE0180010Struct) list.get(i)).getVALUE());
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
			l_NAME.add(((AE0180010Struct) list.get(i)).getNAME());
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
			l_PUCH_ODR_CD.add(((AE0180010Struct) list.get(i)).getPUCH_ODR_CD());
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
			l_NON_NO_ITEM_NAME.add(((AE0180010Struct) list.get(i)).getNON_NO_ITEM_NAME());
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
			l_NON_NO_ITEM_TYP.add(((AE0180010Struct) list.get(i)).getNON_NO_ITEM_TYP());
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
			l_COMPANY_CD.add(((AE0180010Struct) list.get(i)).getCOMPANY_CD());
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
			l_PUCH_ODR_PERSON.add(((AE0180010Struct) list.get(i)).getPUCH_ODR_PERSON());
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
			l_PUCH_ODR_START_DATE.add(((AE0180010Struct) list.get(i)).getPUCH_ODR_START_DATE());
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
			l_PUCH_ODR_DLV_DATE.add(((AE0180010Struct) list.get(i)).getPUCH_ODR_DLV_DATE());
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
			l_PUCH_ODR_QTY.add(((AE0180010Struct) list.get(i)).getPUCH_ODR_QTY());
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
			l_NON_NO_ITEM_PUCH_ODR_UNIT.add(((AE0180010Struct) list.get(i)).getNON_NO_ITEM_PUCH_ODR_UNIT());
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
			l_UNIT_COST_TYP.add(((AE0180010Struct) list.get(i)).getUNIT_COST_TYP());
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
			l_UNIT_COST.add(((AE0180010Struct) list.get(i)).getUNIT_COST());
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
			l_PROCESSING_COST.add(((AE0180010Struct) list.get(i)).getPROCESSING_COST());
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
			l_MATERIAL_COST.add(((AE0180010Struct) list.get(i)).getMATERIAL_COST());
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
			l_OTHER_OVERHEADS.add(((AE0180010Struct) list.get(i)).getOTHER_OVERHEADS());
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
			l_DISC_AMOUNT.add(((AE0180010Struct) list.get(i)).getDISC_AMOUNT());
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
			l_PUCH_ODR_AMOUNT.add(((AE0180010Struct) list.get(i)).getPUCH_ODR_AMOUNT());
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
			l_CONFIRM_DLV_DATE.add(((AE0180010Struct) list.get(i)).getCONFIRM_DLV_DATE());
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
			l_INV_CTRL_FLG.add(((AE0180010Struct) list.get(i)).getINV_CTRL_FLG());
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
			l_PUCH_ODR_COMMENT.add(((AE0180010Struct) list.get(i)).getPUCH_ODR_COMMENT());
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
			l_RATE_JUDGE_DATE.add(((AE0180010Struct) list.get(i)).getRATE_JUDGE_DATE());
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
			l_EXCH_RATE.add(((AE0180010Struct) list.get(i)).getEXCH_RATE());
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
			l_TAX_RATE_1.add(((AE0180010Struct) list.get(i)).getTAX_RATE_1());
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
			l_TAX_RATE_2.add(((AE0180010Struct) list.get(i)).getTAX_RATE_2());
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
			l_TAX_RATE_3.add(((AE0180010Struct) list.get(i)).getTAX_RATE_3());
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
			l_NET_AMOUNT.add(((AE0180010Struct) list.get(i)).getNET_AMOUNT());
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
			l_TAX_AMOUNT_1.add(((AE0180010Struct) list.get(i)).getTAX_AMOUNT_1());
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
			l_TAX_AMOUNT_2.add(((AE0180010Struct) list.get(i)).getTAX_AMOUNT_2());
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
			l_TAX_AMOUNT_3.add(((AE0180010Struct) list.get(i)).getTAX_AMOUNT_3());
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
			l_AMOUNT_INCLUDE_TAX.add(((AE0180010Struct) list.get(i)).getAMOUNT_INCLUDE_TAX());
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
			l_HOME_CUR_AMOUNT.add(((AE0180010Struct) list.get(i)).getHOME_CUR_AMOUNT());
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
			l_TAX_CD.add(((AE0180010Struct) list.get(i)).getTAX_CD());
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
			l_TAX_ROUND_TYP.add(((AE0180010Struct) list.get(i)).getTAX_ROUND_TYP());
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
			l_NON_NO_ITEM_FLG.add(((AE0180010Struct) list.get(i)).getNON_NO_ITEM_FLG());
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
			l_ACCT_CD.add(((AE0180010Struct) list.get(i)).getACCT_CD());
		}
		return size;
	}
	public int setL2L_DEPT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEPT_CD == null) {
			l_DEPT_CD = new ArrayList();
		} else {
			l_DEPT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEPT_CD.add(((AE0180010Struct) list.get(i)).getDEPT_CD());
		}
		return size;
	}
	public int setL2L_PJ_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PJ_CD == null) {
			l_PJ_CD = new ArrayList();
		} else {
			l_PJ_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PJ_CD.add(((AE0180010Struct) list.get(i)).getPJ_CD());
		}
		return size;
	}
	public int setL2L_SEG_CONTENTS1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEG_CONTENTS1 == null) {
			l_SEG_CONTENTS1 = new ArrayList();
		} else {
			l_SEG_CONTENTS1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEG_CONTENTS1.add(((AE0180010Struct) list.get(i)).getSEG_CONTENTS1());
		}
		return size;
	}
	public int setL2L_SEG_CONTENTS2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEG_CONTENTS2 == null) {
			l_SEG_CONTENTS2 = new ArrayList();
		} else {
			l_SEG_CONTENTS2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEG_CONTENTS2.add(((AE0180010Struct) list.get(i)).getSEG_CONTENTS2());
		}
		return size;
	}
	public int setL2L_SEG_CONTENTS3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEG_CONTENTS3 == null) {
			l_SEG_CONTENTS3 = new ArrayList();
		} else {
			l_SEG_CONTENTS3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEG_CONTENTS3.add(((AE0180010Struct) list.get(i)).getSEG_CONTENTS3());
		}
		return size;
	}
	public int setL2L_SEG_CONTENTS4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEG_CONTENTS4 == null) {
			l_SEG_CONTENTS4 = new ArrayList();
		} else {
			l_SEG_CONTENTS4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEG_CONTENTS4.add(((AE0180010Struct) list.get(i)).getSEG_CONTENTS4());
		}
		return size;
	}
	public int setL2L_ASP_INSTALL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ASP_INSTALL_FLG == null) {
			l_ASP_INSTALL_FLG = new ArrayList();
		} else {
			l_ASP_INSTALL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ASP_INSTALL_FLG.add(((AE0180010Struct) list.get(i)).getASP_INSTALL_FLG());
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
			l_TIME_CTRL.add(((AE0180010Struct) list.get(i)).getTIME_CTRL());
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
			l_PVC2BUSINESSNAME.add(((AE0180010Struct) list.get(i)).getPVC2BUSINESSNAME());
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
			l_PVC2OUTPUTPATH.add(((AE0180010Struct) list.get(i)).getPVC2OUTPUTPATH());
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
			l_PVC2OUTPUTNAME.add(((AE0180010Struct) list.get(i)).getPVC2OUTPUTNAME());
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
			l_PVC2LOGMODE.add(((AE0180010Struct) list.get(i)).getPVC2LOGMODE());
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
			l_PVC2OUTPUTMODE.add(((AE0180010Struct) list.get(i)).getPVC2OUTPUTMODE());
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
			l_PVC2USERID.add(((AE0180010Struct) list.get(i)).getPVC2USERID());
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
			l_PVC2PLANTCD.add(((AE0180010Struct) list.get(i)).getPVC2PLANTCD());
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
			l_PVC2TAXID.add(((AE0180010Struct) list.get(i)).getPVC2TAXID());
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
			l_VEND_DECIMAL_FIG.add(((AE0180010Struct) list.get(i)).getVEND_DECIMAL_FIG());
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
			l_PNUMTAXOUTAMOUNT.add(((AE0180010Struct) list.get(i)).getPNUMTAXOUTAMOUNT());
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
			l_PNUMTAXAMOUNT.add(((AE0180010Struct) list.get(i)).getPNUMTAXAMOUNT());
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
			l_PNUMEXTERNALTAXSALESAMOUNT.add(((AE0180010Struct) list.get(i)).getPNUMEXTERNALTAXSALESAMOUNT());
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
			l_PNUMINTERNALTAXSALESAMOUNT.add(((AE0180010Struct) list.get(i)).getPNUMINTERNALTAXSALESAMOUNT());
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
			l_PNUMTAXFREESALESAMOUNT.add(((AE0180010Struct) list.get(i)).getPNUMTAXFREESALESAMOUNT());
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
			l_PNUMEXTERNALTAXAMOUNT.add(((AE0180010Struct) list.get(i)).getPNUMEXTERNALTAXAMOUNT());
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
			l_PNUMINTERNALTAXAMOUNT.add(((AE0180010Struct) list.get(i)).getPNUMINTERNALTAXAMOUNT());
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
			l_PVC2ERRCD.add(((AE0180010Struct) list.get(i)).getPVC2ERRCD());
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
			l_PNUMSTATUS.add(((AE0180010Struct) list.get(i)).getPNUMSTATUS());
		}
		return size;
	}
	public int setL2L_DEPT_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEPT_NAME == null) {
			l_DEPT_NAME = new ArrayList();
		} else {
			l_DEPT_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEPT_NAME.add(((AE0180010Struct) list.get(i)).getDEPT_NAME());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_FileName = null;
		m_DOWNLOAD_FILE = null;
		m_l_ERROR_IN = null;
		m_l_ERR_TYP = null;
		m_l_ERR_INFO = null;
		m_l_ERR_CTR_NM = null;
		m_l_ERR_ITEM_CD = null;
		m_l_ERR_PRD_DUE_DATE = null;
		m_l_ERR_PUCH_ODR_DLV_DATE = null;
		m_l_ERR_PUCH_ODR_QTY = null;
		m_l_ERR_VEND_CD = null;
		m_l_ERR_JOB_ODR_CD = null;
		m_l_ERR_CONFIRM_DLV_DATE = null;
		m_l_ERR_WH_CD = null;
		m_l_ERR_WORK_IN_PROC_COMMENT = null;
		m_l_ERR_NON_NO_ITEM_FLG = null;
		m_l_ERR_NON_NO_ITEM_NAME = null;
		m_l_ERR_NON_NO_ITEM_TYP = null;
		m_l_ERR_NON_NO_ITEM_PUCH_ODR_UNIT = null;
		m_l_ERR_UNIT_COST_TYP = null;
		m_l_ERR_ACTUAL_UNIT_PRICE = null;
		m_l_ERR_PROCESSING_COST = null;
		m_l_ERR_MATERIAL_COST = null;
		m_l_ERR_OTHER_OVERHEADS = null;
		m_l_ERR_NET_AMOUNT = null;
		m_l_ERR_EXCH_RATE = null;
		m_h_INSTALL_FLG = null;
		m_l_ERR_EXPENSE_CLASS_CD = null;
		m_l_ERR_DEPT_CD = null;
		m_l_ERR_PJ_CD = null;
		m_l_ERR_SEG_CONTENTS1 = null;
		m_l_ERR_SEG_CONTENTS2 = null;
		m_l_ERR_SEG_CONTENTS3 = null;
		m_l_ERR_SEG_CONTENTS4 = null;
		m_w_COLUMN_FLG = null;
		m_L_PUCH_ODR_START_DATE = null;
		m_L_JOB_ODR_CD = null;
		m_L_UNIT_COST_TYP = null;
		m_L_UNIT_COST = null;
		m_L_PROCESSING_COST = null;
		m_L_MATERIAL_COST = null;
		m_L_OTHER_OVERHEADS = null;
		m_L_NET_AMOUNT = null;
		m_L_EXCH_RATE = null;
		m_L_PUCH_ODR_QTY = null;
		m_MRP_ODR_TYP = null;
		m_ACPT_INSPC_TYP = null;
		m_UNIT_QTY_TYP = null;
		m_FIXED_LT = null;
		m_PROP_LT = null;
		m_SAFETY_LT = null;
		m_PROP_LOT_SIZE = null;
		m_ITEM_CD = null;
		m_VEND_CD = null;
		m_DEAL_STS_FLG = null;
		m_PLANT_CD = null;
		m_WH_CD = null;
		m_JOB_ODR_STS_TYP = null;
		m_JOB_ODR_CD = null;
		m_OD_NO = null;
		m_JOB_ODR_DLV_DATE = null;
		m_VALUE = null;
		m_NAME = null;
		m_PUCH_ODR_CD = null;
		m_NON_NO_ITEM_NAME = null;
		m_NON_NO_ITEM_TYP = null;
		m_COMPANY_CD = null;
		m_PUCH_ODR_PERSON = null;
		m_PUCH_ODR_START_DATE = null;
		m_PUCH_ODR_DLV_DATE = null;
		m_PUCH_ODR_QTY = null;
		m_NON_NO_ITEM_PUCH_ODR_UNIT = null;
		m_UNIT_COST_TYP = null;
		m_UNIT_COST = null;
		m_PROCESSING_COST = null;
		m_MATERIAL_COST = null;
		m_OTHER_OVERHEADS = null;
		m_DISC_AMOUNT = null;
		m_PUCH_ODR_AMOUNT = null;
		m_CONFIRM_DLV_DATE = null;
		m_INV_CTRL_FLG = null;
		m_PUCH_ODR_COMMENT = null;
		m_RATE_JUDGE_DATE = null;
		m_EXCH_RATE = null;
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
		m_NON_NO_ITEM_FLG = null;
		m_ACCT_CD = null;
		m_DEPT_CD = null;
		m_PJ_CD = null;
		m_SEG_CONTENTS1 = null;
		m_SEG_CONTENTS2 = null;
		m_SEG_CONTENTS3 = null;
		m_SEG_CONTENTS4 = null;
		m_ASP_INSTALL_FLG = null;
		m_TIME_CTRL = null;
		m_PVC2BUSINESSNAME = null;
		m_PVC2OUTPUTPATH = null;
		m_PVC2OUTPUTNAME = null;
		m_PVC2LOGMODE = null;
		m_PVC2OUTPUTMODE = null;
		m_PVC2USERID = null;
		m_PVC2PLANTCD = null;
		m_PVC2TAXID = null;
		m_VEND_DECIMAL_FIG = null;
		m_PNUMTAXOUTAMOUNT = null;
		m_PNUMTAXAMOUNT = null;
		m_PNUMEXTERNALTAXSALESAMOUNT = null;
		m_PNUMINTERNALTAXSALESAMOUNT = null;
		m_PNUMTAXFREESALESAMOUNT = null;
		m_PNUMEXTERNALTAXAMOUNT = null;
		m_PNUMINTERNALTAXAMOUNT = null;
		m_PVC2ERRCD = null;
		m_PNUMSTATUS = null;
		m_DEPT_NAME = null;

		l_FileName = null;
		l_DOWNLOAD_FILE = null;
		l_l_ERROR_IN = null;
		l_l_ERR_TYP = null;
		l_l_ERR_INFO = null;
		l_l_ERR_CTR_NM = null;
		l_l_ERR_ITEM_CD = null;
		l_l_ERR_PRD_DUE_DATE = null;
		l_l_ERR_PUCH_ODR_DLV_DATE = null;
		l_l_ERR_PUCH_ODR_QTY = null;
		l_l_ERR_VEND_CD = null;
		l_l_ERR_JOB_ODR_CD = null;
		l_l_ERR_CONFIRM_DLV_DATE = null;
		l_l_ERR_WH_CD = null;
		l_l_ERR_WORK_IN_PROC_COMMENT = null;
		l_l_ERR_NON_NO_ITEM_FLG = null;
		l_l_ERR_NON_NO_ITEM_NAME = null;
		l_l_ERR_NON_NO_ITEM_TYP = null;
		l_l_ERR_NON_NO_ITEM_PUCH_ODR_UNIT = null;
		l_l_ERR_UNIT_COST_TYP = null;
		l_l_ERR_ACTUAL_UNIT_PRICE = null;
		l_l_ERR_PROCESSING_COST = null;
		l_l_ERR_MATERIAL_COST = null;
		l_l_ERR_OTHER_OVERHEADS = null;
		l_l_ERR_NET_AMOUNT = null;
		l_l_ERR_EXCH_RATE = null;
		l_h_INSTALL_FLG = null;
		l_l_ERR_EXPENSE_CLASS_CD = null;
		l_l_ERR_DEPT_CD = null;
		l_l_ERR_PJ_CD = null;
		l_l_ERR_SEG_CONTENTS1 = null;
		l_l_ERR_SEG_CONTENTS2 = null;
		l_l_ERR_SEG_CONTENTS3 = null;
		l_l_ERR_SEG_CONTENTS4 = null;
		l_w_COLUMN_FLG = null;
		l_L_PUCH_ODR_START_DATE = null;
		l_L_JOB_ODR_CD = null;
		l_L_UNIT_COST_TYP = null;
		l_L_UNIT_COST = null;
		l_L_PROCESSING_COST = null;
		l_L_MATERIAL_COST = null;
		l_L_OTHER_OVERHEADS = null;
		l_L_NET_AMOUNT = null;
		l_L_EXCH_RATE = null;
		l_L_PUCH_ODR_QTY = null;
		l_MRP_ODR_TYP = null;
		l_ACPT_INSPC_TYP = null;
		l_UNIT_QTY_TYP = null;
		l_FIXED_LT = null;
		l_PROP_LT = null;
		l_SAFETY_LT = null;
		l_PROP_LOT_SIZE = null;
		l_ITEM_CD = null;
		l_VEND_CD = null;
		l_DEAL_STS_FLG = null;
		l_PLANT_CD = null;
		l_WH_CD = null;
		l_JOB_ODR_STS_TYP = null;
		l_JOB_ODR_CD = null;
		l_OD_NO = null;
		l_JOB_ODR_DLV_DATE = null;
		l_VALUE = null;
		l_NAME = null;
		l_PUCH_ODR_CD = null;
		l_NON_NO_ITEM_NAME = null;
		l_NON_NO_ITEM_TYP = null;
		l_COMPANY_CD = null;
		l_PUCH_ODR_PERSON = null;
		l_PUCH_ODR_START_DATE = null;
		l_PUCH_ODR_DLV_DATE = null;
		l_PUCH_ODR_QTY = null;
		l_NON_NO_ITEM_PUCH_ODR_UNIT = null;
		l_UNIT_COST_TYP = null;
		l_UNIT_COST = null;
		l_PROCESSING_COST = null;
		l_MATERIAL_COST = null;
		l_OTHER_OVERHEADS = null;
		l_DISC_AMOUNT = null;
		l_PUCH_ODR_AMOUNT = null;
		l_CONFIRM_DLV_DATE = null;
		l_INV_CTRL_FLG = null;
		l_PUCH_ODR_COMMENT = null;
		l_RATE_JUDGE_DATE = null;
		l_EXCH_RATE = null;
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
		l_NON_NO_ITEM_FLG = null;
		l_ACCT_CD = null;
		l_DEPT_CD = null;
		l_PJ_CD = null;
		l_SEG_CONTENTS1 = null;
		l_SEG_CONTENTS2 = null;
		l_SEG_CONTENTS3 = null;
		l_SEG_CONTENTS4 = null;
		l_ASP_INSTALL_FLG = null;
		l_TIME_CTRL = null;
		l_PVC2BUSINESSNAME = null;
		l_PVC2OUTPUTPATH = null;
		l_PVC2OUTPUTNAME = null;
		l_PVC2LOGMODE = null;
		l_PVC2OUTPUTMODE = null;
		l_PVC2USERID = null;
		l_PVC2PLANTCD = null;
		l_PVC2TAXID = null;
		l_VEND_DECIMAL_FIG = null;
		l_PNUMTAXOUTAMOUNT = null;
		l_PNUMTAXAMOUNT = null;
		l_PNUMEXTERNALTAXSALESAMOUNT = null;
		l_PNUMINTERNALTAXSALESAMOUNT = null;
		l_PNUMTAXFREESALESAMOUNT = null;
		l_PNUMEXTERNALTAXAMOUNT = null;
		l_PNUMINTERNALTAXAMOUNT = null;
		l_PVC2ERRCD = null;
		l_PNUMSTATUS = null;
		l_DEPT_NAME = null;

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
	 * medAE0180010クラスの標準コンストラクタ
	 */
	public AE0180010Struct()
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
	public void setStruct(AE0180010Struct struct)
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
	public void setStructM(AE0180010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setFileName(struct.getFileName());
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setl_ERROR_IN(struct.getl_ERROR_IN());
			this.setl_ERR_TYP(struct.getl_ERR_TYP());
			this.setl_ERR_INFO(struct.getl_ERR_INFO());
			this.setl_ERR_CTR_NM(struct.getl_ERR_CTR_NM());
			this.setl_ERR_ITEM_CD(struct.getl_ERR_ITEM_CD());
			this.setl_ERR_PRD_DUE_DATE(struct.getl_ERR_PRD_DUE_DATE());
			this.setl_ERR_PUCH_ODR_DLV_DATE(struct.getl_ERR_PUCH_ODR_DLV_DATE());
			this.setl_ERR_PUCH_ODR_QTY(struct.getl_ERR_PUCH_ODR_QTY());
			this.setl_ERR_VEND_CD(struct.getl_ERR_VEND_CD());
			this.setl_ERR_JOB_ODR_CD(struct.getl_ERR_JOB_ODR_CD());
			this.setl_ERR_CONFIRM_DLV_DATE(struct.getl_ERR_CONFIRM_DLV_DATE());
			this.setl_ERR_WH_CD(struct.getl_ERR_WH_CD());
			this.setl_ERR_WORK_IN_PROC_COMMENT(struct.getl_ERR_WORK_IN_PROC_COMMENT());
			this.setl_ERR_NON_NO_ITEM_FLG(struct.getl_ERR_NON_NO_ITEM_FLG());
			this.setl_ERR_NON_NO_ITEM_NAME(struct.getl_ERR_NON_NO_ITEM_NAME());
			this.setl_ERR_NON_NO_ITEM_TYP(struct.getl_ERR_NON_NO_ITEM_TYP());
			this.setl_ERR_NON_NO_ITEM_PUCH_ODR_UNIT(struct.getl_ERR_NON_NO_ITEM_PUCH_ODR_UNIT());
			this.setl_ERR_UNIT_COST_TYP(struct.getl_ERR_UNIT_COST_TYP());
			this.setl_ERR_ACTUAL_UNIT_PRICE(struct.getl_ERR_ACTUAL_UNIT_PRICE());
			this.setl_ERR_PROCESSING_COST(struct.getl_ERR_PROCESSING_COST());
			this.setl_ERR_MATERIAL_COST(struct.getl_ERR_MATERIAL_COST());
			this.setl_ERR_OTHER_OVERHEADS(struct.getl_ERR_OTHER_OVERHEADS());
			this.setl_ERR_NET_AMOUNT(struct.getl_ERR_NET_AMOUNT());
			this.setl_ERR_EXCH_RATE(struct.getl_ERR_EXCH_RATE());
			this.seth_INSTALL_FLG(struct.geth_INSTALL_FLG());
			this.setl_ERR_EXPENSE_CLASS_CD(struct.getl_ERR_EXPENSE_CLASS_CD());
			this.setl_ERR_DEPT_CD(struct.getl_ERR_DEPT_CD());
			this.setl_ERR_PJ_CD(struct.getl_ERR_PJ_CD());
			this.setl_ERR_SEG_CONTENTS1(struct.getl_ERR_SEG_CONTENTS1());
			this.setl_ERR_SEG_CONTENTS2(struct.getl_ERR_SEG_CONTENTS2());
			this.setl_ERR_SEG_CONTENTS3(struct.getl_ERR_SEG_CONTENTS3());
			this.setl_ERR_SEG_CONTENTS4(struct.getl_ERR_SEG_CONTENTS4());
			this.setw_COLUMN_FLG(struct.getw_COLUMN_FLG());
			this.setL_PUCH_ODR_START_DATE(struct.getL_PUCH_ODR_START_DATE());
			this.setL_JOB_ODR_CD(struct.getL_JOB_ODR_CD());
			this.setL_UNIT_COST_TYP(struct.getL_UNIT_COST_TYP());
			this.setL_UNIT_COST(struct.getL_UNIT_COST());
			this.setL_PROCESSING_COST(struct.getL_PROCESSING_COST());
			this.setL_MATERIAL_COST(struct.getL_MATERIAL_COST());
			this.setL_OTHER_OVERHEADS(struct.getL_OTHER_OVERHEADS());
			this.setL_NET_AMOUNT(struct.getL_NET_AMOUNT());
			this.setL_EXCH_RATE(struct.getL_EXCH_RATE());
			this.setL_PUCH_ODR_QTY(struct.getL_PUCH_ODR_QTY());
			this.setMRP_ODR_TYP(struct.getMRP_ODR_TYP());
			this.setACPT_INSPC_TYP(struct.getACPT_INSPC_TYP());
			this.setUNIT_QTY_TYP(struct.getUNIT_QTY_TYP());
			this.setFIXED_LT(struct.getFIXED_LT());
			this.setPROP_LT(struct.getPROP_LT());
			this.setSAFETY_LT(struct.getSAFETY_LT());
			this.setPROP_LOT_SIZE(struct.getPROP_LOT_SIZE());
			this.setITEM_CD(struct.getITEM_CD());
			this.setVEND_CD(struct.getVEND_CD());
			this.setDEAL_STS_FLG(struct.getDEAL_STS_FLG());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setWH_CD(struct.getWH_CD());
			this.setJOB_ODR_STS_TYP(struct.getJOB_ODR_STS_TYP());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setOD_NO(struct.getOD_NO());
			this.setJOB_ODR_DLV_DATE(struct.getJOB_ODR_DLV_DATE());
			this.setVALUE(struct.getVALUE());
			this.setNAME(struct.getNAME());
			this.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());
			this.setNON_NO_ITEM_NAME(struct.getNON_NO_ITEM_NAME());
			this.setNON_NO_ITEM_TYP(struct.getNON_NO_ITEM_TYP());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setPUCH_ODR_PERSON(struct.getPUCH_ODR_PERSON());
			this.setPUCH_ODR_START_DATE(struct.getPUCH_ODR_START_DATE());
			this.setPUCH_ODR_DLV_DATE(struct.getPUCH_ODR_DLV_DATE());
			this.setPUCH_ODR_QTY(struct.getPUCH_ODR_QTY());
			this.setNON_NO_ITEM_PUCH_ODR_UNIT(struct.getNON_NO_ITEM_PUCH_ODR_UNIT());
			this.setUNIT_COST_TYP(struct.getUNIT_COST_TYP());
			this.setUNIT_COST(struct.getUNIT_COST());
			this.setPROCESSING_COST(struct.getPROCESSING_COST());
			this.setMATERIAL_COST(struct.getMATERIAL_COST());
			this.setOTHER_OVERHEADS(struct.getOTHER_OVERHEADS());
			this.setDISC_AMOUNT(struct.getDISC_AMOUNT());
			this.setPUCH_ODR_AMOUNT(struct.getPUCH_ODR_AMOUNT());
			this.setCONFIRM_DLV_DATE(struct.getCONFIRM_DLV_DATE());
			this.setINV_CTRL_FLG(struct.getINV_CTRL_FLG());
			this.setPUCH_ODR_COMMENT(struct.getPUCH_ODR_COMMENT());
			this.setRATE_JUDGE_DATE(struct.getRATE_JUDGE_DATE());
			this.setEXCH_RATE(struct.getEXCH_RATE());
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
			this.setNON_NO_ITEM_FLG(struct.getNON_NO_ITEM_FLG());
			this.setACCT_CD(struct.getACCT_CD());
			this.setDEPT_CD(struct.getDEPT_CD());
			this.setPJ_CD(struct.getPJ_CD());
			this.setSEG_CONTENTS1(struct.getSEG_CONTENTS1());
			this.setSEG_CONTENTS2(struct.getSEG_CONTENTS2());
			this.setSEG_CONTENTS3(struct.getSEG_CONTENTS3());
			this.setSEG_CONTENTS4(struct.getSEG_CONTENTS4());
			this.setASP_INSTALL_FLG(struct.getASP_INSTALL_FLG());
			this.setTIME_CTRL(struct.getTIME_CTRL());
			this.setPVC2BUSINESSNAME(struct.getPVC2BUSINESSNAME());
			this.setPVC2OUTPUTPATH(struct.getPVC2OUTPUTPATH());
			this.setPVC2OUTPUTNAME(struct.getPVC2OUTPUTNAME());
			this.setPVC2LOGMODE(struct.getPVC2LOGMODE());
			this.setPVC2OUTPUTMODE(struct.getPVC2OUTPUTMODE());
			this.setPVC2USERID(struct.getPVC2USERID());
			this.setPVC2PLANTCD(struct.getPVC2PLANTCD());
			this.setPVC2TAXID(struct.getPVC2TAXID());
			this.setVEND_DECIMAL_FIG(struct.getVEND_DECIMAL_FIG());
			this.setPNUMTAXOUTAMOUNT(struct.getPNUMTAXOUTAMOUNT());
			this.setPNUMTAXAMOUNT(struct.getPNUMTAXAMOUNT());
			this.setPNUMEXTERNALTAXSALESAMOUNT(struct.getPNUMEXTERNALTAXSALESAMOUNT());
			this.setPNUMINTERNALTAXSALESAMOUNT(struct.getPNUMINTERNALTAXSALESAMOUNT());
			this.setPNUMTAXFREESALESAMOUNT(struct.getPNUMTAXFREESALESAMOUNT());
			this.setPNUMEXTERNALTAXAMOUNT(struct.getPNUMEXTERNALTAXAMOUNT());
			this.setPNUMINTERNALTAXAMOUNT(struct.getPNUMINTERNALTAXAMOUNT());
			this.setPVC2ERRCD(struct.getPVC2ERRCD());
			this.setPNUMSTATUS(struct.getPNUMSTATUS());
			this.setDEPT_NAME(struct.getDEPT_NAME());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(AE0180010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_FileName(struct.getList_FileName());
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_l_ERROR_IN(struct.getList_l_ERROR_IN());
			this.setList_l_ERR_TYP(struct.getList_l_ERR_TYP());
			this.setList_l_ERR_INFO(struct.getList_l_ERR_INFO());
			this.setList_l_ERR_CTR_NM(struct.getList_l_ERR_CTR_NM());
			this.setList_l_ERR_ITEM_CD(struct.getList_l_ERR_ITEM_CD());
			this.setList_l_ERR_PRD_DUE_DATE(struct.getList_l_ERR_PRD_DUE_DATE());
			this.setList_l_ERR_PUCH_ODR_DLV_DATE(struct.getList_l_ERR_PUCH_ODR_DLV_DATE());
			this.setList_l_ERR_PUCH_ODR_QTY(struct.getList_l_ERR_PUCH_ODR_QTY());
			this.setList_l_ERR_VEND_CD(struct.getList_l_ERR_VEND_CD());
			this.setList_l_ERR_JOB_ODR_CD(struct.getList_l_ERR_JOB_ODR_CD());
			this.setList_l_ERR_CONFIRM_DLV_DATE(struct.getList_l_ERR_CONFIRM_DLV_DATE());
			this.setList_l_ERR_WH_CD(struct.getList_l_ERR_WH_CD());
			this.setList_l_ERR_WORK_IN_PROC_COMMENT(struct.getList_l_ERR_WORK_IN_PROC_COMMENT());
			this.setList_l_ERR_NON_NO_ITEM_FLG(struct.getList_l_ERR_NON_NO_ITEM_FLG());
			this.setList_l_ERR_NON_NO_ITEM_NAME(struct.getList_l_ERR_NON_NO_ITEM_NAME());
			this.setList_l_ERR_NON_NO_ITEM_TYP(struct.getList_l_ERR_NON_NO_ITEM_TYP());
			this.setList_l_ERR_NON_NO_ITEM_PUCH_ODR_UNIT(struct.getList_l_ERR_NON_NO_ITEM_PUCH_ODR_UNIT());
			this.setList_l_ERR_UNIT_COST_TYP(struct.getList_l_ERR_UNIT_COST_TYP());
			this.setList_l_ERR_ACTUAL_UNIT_PRICE(struct.getList_l_ERR_ACTUAL_UNIT_PRICE());
			this.setList_l_ERR_PROCESSING_COST(struct.getList_l_ERR_PROCESSING_COST());
			this.setList_l_ERR_MATERIAL_COST(struct.getList_l_ERR_MATERIAL_COST());
			this.setList_l_ERR_OTHER_OVERHEADS(struct.getList_l_ERR_OTHER_OVERHEADS());
			this.setList_l_ERR_NET_AMOUNT(struct.getList_l_ERR_NET_AMOUNT());
			this.setList_l_ERR_EXCH_RATE(struct.getList_l_ERR_EXCH_RATE());
			this.setList_h_INSTALL_FLG(struct.getList_h_INSTALL_FLG());
			this.setList_l_ERR_EXPENSE_CLASS_CD(struct.getList_l_ERR_EXPENSE_CLASS_CD());
			this.setList_l_ERR_DEPT_CD(struct.getList_l_ERR_DEPT_CD());
			this.setList_l_ERR_PJ_CD(struct.getList_l_ERR_PJ_CD());
			this.setList_l_ERR_SEG_CONTENTS1(struct.getList_l_ERR_SEG_CONTENTS1());
			this.setList_l_ERR_SEG_CONTENTS2(struct.getList_l_ERR_SEG_CONTENTS2());
			this.setList_l_ERR_SEG_CONTENTS3(struct.getList_l_ERR_SEG_CONTENTS3());
			this.setList_l_ERR_SEG_CONTENTS4(struct.getList_l_ERR_SEG_CONTENTS4());
			this.setList_w_COLUMN_FLG(struct.getList_w_COLUMN_FLG());
			this.setList_L_PUCH_ODR_START_DATE(struct.getList_L_PUCH_ODR_START_DATE());
			this.setList_L_JOB_ODR_CD(struct.getList_L_JOB_ODR_CD());
			this.setList_L_UNIT_COST_TYP(struct.getList_L_UNIT_COST_TYP());
			this.setList_L_UNIT_COST(struct.getList_L_UNIT_COST());
			this.setList_L_PROCESSING_COST(struct.getList_L_PROCESSING_COST());
			this.setList_L_MATERIAL_COST(struct.getList_L_MATERIAL_COST());
			this.setList_L_OTHER_OVERHEADS(struct.getList_L_OTHER_OVERHEADS());
			this.setList_L_NET_AMOUNT(struct.getList_L_NET_AMOUNT());
			this.setList_L_EXCH_RATE(struct.getList_L_EXCH_RATE());
			this.setList_L_PUCH_ODR_QTY(struct.getList_L_PUCH_ODR_QTY());
			this.setList_MRP_ODR_TYP(struct.getList_MRP_ODR_TYP());
			this.setList_ACPT_INSPC_TYP(struct.getList_ACPT_INSPC_TYP());
			this.setList_UNIT_QTY_TYP(struct.getList_UNIT_QTY_TYP());
			this.setList_FIXED_LT(struct.getList_FIXED_LT());
			this.setList_PROP_LT(struct.getList_PROP_LT());
			this.setList_SAFETY_LT(struct.getList_SAFETY_LT());
			this.setList_PROP_LOT_SIZE(struct.getList_PROP_LOT_SIZE());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_DEAL_STS_FLG(struct.getList_DEAL_STS_FLG());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_WH_CD(struct.getList_WH_CD());
			this.setList_JOB_ODR_STS_TYP(struct.getList_JOB_ODR_STS_TYP());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_OD_NO(struct.getList_OD_NO());
			this.setList_JOB_ODR_DLV_DATE(struct.getList_JOB_ODR_DLV_DATE());
			this.setList_VALUE(struct.getList_VALUE());
			this.setList_NAME(struct.getList_NAME());
			this.setList_PUCH_ODR_CD(struct.getList_PUCH_ODR_CD());
			this.setList_NON_NO_ITEM_NAME(struct.getList_NON_NO_ITEM_NAME());
			this.setList_NON_NO_ITEM_TYP(struct.getList_NON_NO_ITEM_TYP());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_PUCH_ODR_PERSON(struct.getList_PUCH_ODR_PERSON());
			this.setList_PUCH_ODR_START_DATE(struct.getList_PUCH_ODR_START_DATE());
			this.setList_PUCH_ODR_DLV_DATE(struct.getList_PUCH_ODR_DLV_DATE());
			this.setList_PUCH_ODR_QTY(struct.getList_PUCH_ODR_QTY());
			this.setList_NON_NO_ITEM_PUCH_ODR_UNIT(struct.getList_NON_NO_ITEM_PUCH_ODR_UNIT());
			this.setList_UNIT_COST_TYP(struct.getList_UNIT_COST_TYP());
			this.setList_UNIT_COST(struct.getList_UNIT_COST());
			this.setList_PROCESSING_COST(struct.getList_PROCESSING_COST());
			this.setList_MATERIAL_COST(struct.getList_MATERIAL_COST());
			this.setList_OTHER_OVERHEADS(struct.getList_OTHER_OVERHEADS());
			this.setList_DISC_AMOUNT(struct.getList_DISC_AMOUNT());
			this.setList_PUCH_ODR_AMOUNT(struct.getList_PUCH_ODR_AMOUNT());
			this.setList_CONFIRM_DLV_DATE(struct.getList_CONFIRM_DLV_DATE());
			this.setList_INV_CTRL_FLG(struct.getList_INV_CTRL_FLG());
			this.setList_PUCH_ODR_COMMENT(struct.getList_PUCH_ODR_COMMENT());
			this.setList_RATE_JUDGE_DATE(struct.getList_RATE_JUDGE_DATE());
			this.setList_EXCH_RATE(struct.getList_EXCH_RATE());
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
			this.setList_NON_NO_ITEM_FLG(struct.getList_NON_NO_ITEM_FLG());
			this.setList_ACCT_CD(struct.getList_ACCT_CD());
			this.setList_DEPT_CD(struct.getList_DEPT_CD());
			this.setList_PJ_CD(struct.getList_PJ_CD());
			this.setList_SEG_CONTENTS1(struct.getList_SEG_CONTENTS1());
			this.setList_SEG_CONTENTS2(struct.getList_SEG_CONTENTS2());
			this.setList_SEG_CONTENTS3(struct.getList_SEG_CONTENTS3());
			this.setList_SEG_CONTENTS4(struct.getList_SEG_CONTENTS4());
			this.setList_ASP_INSTALL_FLG(struct.getList_ASP_INSTALL_FLG());
			this.setList_TIME_CTRL(struct.getList_TIME_CTRL());
			this.setList_PVC2BUSINESSNAME(struct.getList_PVC2BUSINESSNAME());
			this.setList_PVC2OUTPUTPATH(struct.getList_PVC2OUTPUTPATH());
			this.setList_PVC2OUTPUTNAME(struct.getList_PVC2OUTPUTNAME());
			this.setList_PVC2LOGMODE(struct.getList_PVC2LOGMODE());
			this.setList_PVC2OUTPUTMODE(struct.getList_PVC2OUTPUTMODE());
			this.setList_PVC2USERID(struct.getList_PVC2USERID());
			this.setList_PVC2PLANTCD(struct.getList_PVC2PLANTCD());
			this.setList_PVC2TAXID(struct.getList_PVC2TAXID());
			this.setList_VEND_DECIMAL_FIG(struct.getList_VEND_DECIMAL_FIG());
			this.setList_PNUMTAXOUTAMOUNT(struct.getList_PNUMTAXOUTAMOUNT());
			this.setList_PNUMTAXAMOUNT(struct.getList_PNUMTAXAMOUNT());
			this.setList_PNUMEXTERNALTAXSALESAMOUNT(struct.getList_PNUMEXTERNALTAXSALESAMOUNT());
			this.setList_PNUMINTERNALTAXSALESAMOUNT(struct.getList_PNUMINTERNALTAXSALESAMOUNT());
			this.setList_PNUMTAXFREESALESAMOUNT(struct.getList_PNUMTAXFREESALESAMOUNT());
			this.setList_PNUMEXTERNALTAXAMOUNT(struct.getList_PNUMEXTERNALTAXAMOUNT());
			this.setList_PNUMINTERNALTAXAMOUNT(struct.getList_PNUMINTERNALTAXAMOUNT());
			this.setList_PVC2ERRCD(struct.getList_PVC2ERRCD());
			this.setList_PNUMSTATUS(struct.getList_PNUMSTATUS());
			this.setList_DEPT_NAME(struct.getList_DEPT_NAME());
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
	// 第 1 変数初期値： i_FileName


	final static String i_FileName = null;

	// 第 2 変数初期値： i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// 第 3 変数初期値： i_l_ERROR_IN


	final static String i_l_ERROR_IN = null;

	// 第 4 変数初期値： i_l_ERR_TYP


	final static String i_l_ERR_TYP = null;

	// 第 5 変数初期値： i_l_ERR_INFO


	final static String i_l_ERR_INFO = null;

	// 第 6 変数初期値： i_l_ERR_CTR_NM


	final static String i_l_ERR_CTR_NM = null;

	// 第 7 変数初期値： i_l_ERR_ITEM_CD


	final static String i_l_ERR_ITEM_CD = null;

	// 第 8 変数初期値： i_l_ERR_PRD_DUE_DATE


	final static String i_l_ERR_PRD_DUE_DATE = null;

	// 第 9 変数初期値： i_l_ERR_PUCH_ODR_DLV_DATE


	final static String i_l_ERR_PUCH_ODR_DLV_DATE = null;

	// 第 10 変数初期値： i_l_ERR_PUCH_ODR_QTY


	final static String i_l_ERR_PUCH_ODR_QTY = null;

	// 第 11 変数初期値： i_l_ERR_VEND_CD


	final static String i_l_ERR_VEND_CD = null;

	// 第 12 変数初期値： i_l_ERR_JOB_ODR_CD


	final static String i_l_ERR_JOB_ODR_CD = null;

	// 第 13 変数初期値： i_l_ERR_CONFIRM_DLV_DATE


	final static String i_l_ERR_CONFIRM_DLV_DATE = null;

	// 第 14 変数初期値： i_l_ERR_WH_CD


	final static String i_l_ERR_WH_CD = null;

	// 第 15 変数初期値： i_l_ERR_WORK_IN_PROC_COMMENT


	final static String i_l_ERR_WORK_IN_PROC_COMMENT = null;

	// 第 16 変数初期値： i_l_ERR_NON_NO_ITEM_FLG


	final static String i_l_ERR_NON_NO_ITEM_FLG = null;

	// 第 17 変数初期値： i_l_ERR_NON_NO_ITEM_NAME


	final static String i_l_ERR_NON_NO_ITEM_NAME = null;

	// 第 18 変数初期値： i_l_ERR_NON_NO_ITEM_TYP


	final static String i_l_ERR_NON_NO_ITEM_TYP = null;

	// 第 19 変数初期値： i_l_ERR_NON_NO_ITEM_PUCH_ODR_UNIT


	final static String i_l_ERR_NON_NO_ITEM_PUCH_ODR_UNIT = null;

	// 第 20 変数初期値： i_l_ERR_UNIT_COST_TYP


	final static String i_l_ERR_UNIT_COST_TYP = null;

	// 第 21 変数初期値： i_l_ERR_ACTUAL_UNIT_PRICE


	final static String i_l_ERR_ACTUAL_UNIT_PRICE = null;

	// 第 22 変数初期値： i_l_ERR_PROCESSING_COST


	final static String i_l_ERR_PROCESSING_COST = null;

	// 第 23 変数初期値： i_l_ERR_MATERIAL_COST


	final static String i_l_ERR_MATERIAL_COST = null;

	// 第 24 変数初期値： i_l_ERR_OTHER_OVERHEADS


	final static String i_l_ERR_OTHER_OVERHEADS = null;

	// 第 25 変数初期値： i_l_ERR_NET_AMOUNT


	final static String i_l_ERR_NET_AMOUNT = null;

	// 第 26 変数初期値： i_l_ERR_EXCH_RATE


	final static String i_l_ERR_EXCH_RATE = null;

	// 第 27 変数初期値： i_h_INSTALL_FLG


	final static String i_h_INSTALL_FLG = null;

	// 第 28 変数初期値： i_l_ERR_EXPENSE_CLASS_CD


	final static String i_l_ERR_EXPENSE_CLASS_CD = null;

	// 第 29 変数初期値： i_l_ERR_DEPT_CD


	final static String i_l_ERR_DEPT_CD = null;

	// 第 30 変数初期値： i_l_ERR_PJ_CD


	final static String i_l_ERR_PJ_CD = null;

	// 第 31 変数初期値： i_l_ERR_SEG_CONTENTS1


	final static String i_l_ERR_SEG_CONTENTS1 = null;

	// 第 32 変数初期値： i_l_ERR_SEG_CONTENTS2


	final static String i_l_ERR_SEG_CONTENTS2 = null;

	// 第 33 変数初期値： i_l_ERR_SEG_CONTENTS3


	final static String i_l_ERR_SEG_CONTENTS3 = null;

	// 第 34 変数初期値： i_l_ERR_SEG_CONTENTS4


	final static String i_l_ERR_SEG_CONTENTS4 = null;

	// 第 35 変数初期値： i_w_COLUMN_FLG


	final static String i_w_COLUMN_FLG = null;

	// 第 36 変数初期値： i_L_PUCH_ODR_START_DATE


	final static String i_L_PUCH_ODR_START_DATE = null;

	// 第 37 変数初期値： i_L_JOB_ODR_CD


	final static String i_L_JOB_ODR_CD = null;

	// 第 38 変数初期値： i_L_UNIT_COST_TYP


	final static String i_L_UNIT_COST_TYP = null;

	// 第 39 変数初期値： i_L_UNIT_COST


	final static String i_L_UNIT_COST = null;

	// 第 40 変数初期値： i_L_PROCESSING_COST


	final static String i_L_PROCESSING_COST = null;

	// 第 41 変数初期値： i_L_MATERIAL_COST


	final static String i_L_MATERIAL_COST = null;

	// 第 42 変数初期値： i_L_OTHER_OVERHEADS


	final static String i_L_OTHER_OVERHEADS = null;

	// 第 43 変数初期値： i_L_NET_AMOUNT


	final static String i_L_NET_AMOUNT = null;

	// 第 44 変数初期値： i_L_EXCH_RATE


	final static String i_L_EXCH_RATE = null;

	// 第 45 変数初期値： i_L_PUCH_ODR_QTY


	final static String i_L_PUCH_ODR_QTY = null;

	// 第 46 変数初期値： i_MRP_ODR_TYP


	final static String i_MRP_ODR_TYP = null;

	// 第 47 変数初期値： i_ACPT_INSPC_TYP


	final static String i_ACPT_INSPC_TYP = null;

	// 第 48 変数初期値： i_UNIT_QTY_TYP


	final static String i_UNIT_QTY_TYP = null;

	// 第 49 変数初期値： i_FIXED_LT


	final static String i_FIXED_LT = null;

	// 第 50 変数初期値： i_PROP_LT


	final static String i_PROP_LT = null;

	// 第 51 変数初期値： i_SAFETY_LT


	final static String i_SAFETY_LT = null;

	// 第 52 変数初期値： i_PROP_LOT_SIZE


	final static String i_PROP_LOT_SIZE = null;

	// 第 53 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 54 変数初期値： i_VEND_CD


	final static String i_VEND_CD = null;

	// 第 55 変数初期値： i_DEAL_STS_FLG


	final static String i_DEAL_STS_FLG = null;

	// 第 56 変数初期値： i_PLANT_CD


	final static String i_PLANT_CD = null;

	// 第 57 変数初期値： i_WH_CD


	final static String i_WH_CD = null;

	// 第 58 変数初期値： i_JOB_ODR_STS_TYP


	final static String i_JOB_ODR_STS_TYP = null;

	// 第 59 変数初期値： i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// 第 60 変数初期値： i_OD_NO


	final static String i_OD_NO = null;

	// 第 61 変数初期値： i_JOB_ODR_DLV_DATE


	final static String i_JOB_ODR_DLV_DATE = null;

	// 第 62 変数初期値： i_VALUE


	final static String i_VALUE = null;

	// 第 63 変数初期値： i_NAME


	final static String i_NAME = null;

	// 第 64 変数初期値： i_PUCH_ODR_CD


	final static String i_PUCH_ODR_CD = null;

	// 第 65 変数初期値： i_NON_NO_ITEM_NAME


	final static String i_NON_NO_ITEM_NAME = null;

	// 第 66 変数初期値： i_NON_NO_ITEM_TYP


	final static String i_NON_NO_ITEM_TYP = null;

	// 第 67 変数初期値： i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// 第 68 変数初期値： i_PUCH_ODR_PERSON


	final static String i_PUCH_ODR_PERSON = null;

	// 第 69 変数初期値： i_PUCH_ODR_START_DATE


	final static String i_PUCH_ODR_START_DATE = null;

	// 第 70 変数初期値： i_PUCH_ODR_DLV_DATE


	final static String i_PUCH_ODR_DLV_DATE = null;

	// 第 71 変数初期値： i_PUCH_ODR_QTY


	final static String i_PUCH_ODR_QTY = null;

	// 第 72 変数初期値： i_NON_NO_ITEM_PUCH_ODR_UNIT


	final static String i_NON_NO_ITEM_PUCH_ODR_UNIT = null;

	// 第 73 変数初期値： i_UNIT_COST_TYP


	final static String i_UNIT_COST_TYP = null;

	// 第 74 変数初期値： i_UNIT_COST


	final static String i_UNIT_COST = null;

	// 第 75 変数初期値： i_PROCESSING_COST


	final static String i_PROCESSING_COST = null;

	// 第 76 変数初期値： i_MATERIAL_COST


	final static String i_MATERIAL_COST = null;

	// 第 77 変数初期値： i_OTHER_OVERHEADS


	final static String i_OTHER_OVERHEADS = null;

	// 第 78 変数初期値： i_DISC_AMOUNT


	final static String i_DISC_AMOUNT = null;

	// 第 79 変数初期値： i_PUCH_ODR_AMOUNT


	final static String i_PUCH_ODR_AMOUNT = null;

	// 第 80 変数初期値： i_CONFIRM_DLV_DATE


	final static String i_CONFIRM_DLV_DATE = null;

	// 第 81 変数初期値： i_INV_CTRL_FLG


	final static String i_INV_CTRL_FLG = null;

	// 第 82 変数初期値： i_PUCH_ODR_COMMENT


	final static String i_PUCH_ODR_COMMENT = null;

	// 第 83 変数初期値： i_RATE_JUDGE_DATE


	final static String i_RATE_JUDGE_DATE = null;

	// 第 84 変数初期値： i_EXCH_RATE


	final static String i_EXCH_RATE = null;

	// 第 85 変数初期値： i_TAX_RATE_1


	final static String i_TAX_RATE_1 = null;

	// 第 86 変数初期値： i_TAX_RATE_2


	final static String i_TAX_RATE_2 = null;

	// 第 87 変数初期値： i_TAX_RATE_3


	final static String i_TAX_RATE_3 = null;

	// 第 88 変数初期値： i_NET_AMOUNT


	final static String i_NET_AMOUNT = null;

	// 第 89 変数初期値： i_TAX_AMOUNT_1


	final static String i_TAX_AMOUNT_1 = null;

	// 第 90 変数初期値： i_TAX_AMOUNT_2


	final static String i_TAX_AMOUNT_2 = null;

	// 第 91 変数初期値： i_TAX_AMOUNT_3


	final static String i_TAX_AMOUNT_3 = null;

	// 第 92 変数初期値： i_AMOUNT_INCLUDE_TAX


	final static String i_AMOUNT_INCLUDE_TAX = null;

	// 第 93 変数初期値： i_HOME_CUR_AMOUNT


	final static String i_HOME_CUR_AMOUNT = null;

	// 第 94 変数初期値： i_TAX_CD


	final static String i_TAX_CD = null;

	// 第 95 変数初期値： i_TAX_ROUND_TYP


	final static String i_TAX_ROUND_TYP = null;

	// 第 96 変数初期値： i_NON_NO_ITEM_FLG


	final static String i_NON_NO_ITEM_FLG = null;

	// 第 97 変数初期値： i_ACCT_CD


	final static String i_ACCT_CD = null;

	// 第 98 変数初期値： i_DEPT_CD


	final static String i_DEPT_CD = null;

	// 第 99 変数初期値： i_PJ_CD


	final static String i_PJ_CD = null;

	// 第 100 変数初期値： i_SEG_CONTENTS1


	final static String i_SEG_CONTENTS1 = null;

	// 第 101 変数初期値： i_SEG_CONTENTS2


	final static String i_SEG_CONTENTS2 = null;

	// 第 102 変数初期値： i_SEG_CONTENTS3


	final static String i_SEG_CONTENTS3 = null;

	// 第 103 変数初期値： i_SEG_CONTENTS4


	final static String i_SEG_CONTENTS4 = null;

	// 第 104 変数初期値： i_ASP_INSTALL_FLG


	final static String i_ASP_INSTALL_FLG = null;

	// 第 105 変数初期値： i_TIME_CTRL


	final static String i_TIME_CTRL = null;

	// 第 106 変数初期値： i_PVC2BUSINESSNAME


	final static String i_PVC2BUSINESSNAME = null;

	// 第 107 変数初期値： i_PVC2OUTPUTPATH


	final static String i_PVC2OUTPUTPATH = null;

	// 第 108 変数初期値： i_PVC2OUTPUTNAME


	final static String i_PVC2OUTPUTNAME = null;

	// 第 109 変数初期値： i_PVC2LOGMODE


	final static String i_PVC2LOGMODE = null;

	// 第 110 変数初期値： i_PVC2OUTPUTMODE


	final static String i_PVC2OUTPUTMODE = null;

	// 第 111 変数初期値： i_PVC2USERID


	final static String i_PVC2USERID = null;

	// 第 112 変数初期値： i_PVC2PLANTCD


	final static String i_PVC2PLANTCD = null;

	// 第 113 変数初期値： i_PVC2TAXID


	final static String i_PVC2TAXID = null;

	// 第 114 変数初期値： i_VEND_DECIMAL_FIG


	final static String i_VEND_DECIMAL_FIG = null;

	// 第 115 変数初期値： i_PNUMTAXOUTAMOUNT


	final static String i_PNUMTAXOUTAMOUNT = null;

	// 第 116 変数初期値： i_PNUMTAXAMOUNT


	final static String i_PNUMTAXAMOUNT = null;

	// 第 117 変数初期値： i_PNUMEXTERNALTAXSALESAMOUNT


	final static String i_PNUMEXTERNALTAXSALESAMOUNT = null;

	// 第 118 変数初期値： i_PNUMINTERNALTAXSALESAMOUNT


	final static String i_PNUMINTERNALTAXSALESAMOUNT = null;

	// 第 119 変数初期値： i_PNUMTAXFREESALESAMOUNT


	final static String i_PNUMTAXFREESALESAMOUNT = null;

	// 第 120 変数初期値： i_PNUMEXTERNALTAXAMOUNT


	final static String i_PNUMEXTERNALTAXAMOUNT = null;

	// 第 121 変数初期値： i_PNUMINTERNALTAXAMOUNT


	final static String i_PNUMINTERNALTAXAMOUNT = null;

	// 第 122 変数初期値： i_PVC2ERRCD


	final static String i_PVC2ERRCD = null;

	// 第 123 変数初期値： i_PNUMSTATUS


	final static String i_PNUMSTATUS = null;

	// 第 124 変数初期値： i_DEPT_NAME


	final static String i_DEPT_NAME = null;

*/

	//{{user_implement_code
		// TODO: 初期化で使う定数は、ここに記述してください。
		// 以下に記述した内容は自動的には変更されません。
	// 第 1 変数初期値： i_FileName

	final static String i_FileName = null;

	// 第 2 変数初期値： i_DOWNLOAD_FILE

	final static String i_DOWNLOAD_FILE = null;

	// 第 3 変数初期値： i_l_ERROR_IN

	final static String i_l_ERROR_IN = null;

	// 第 4 変数初期値： i_l_ERR_TYP

	final static String i_l_ERR_TYP = null;

	// 第 5 変数初期値： i_l_ERR_INFO

	final static String i_l_ERR_INFO = null;

	// 第 6 変数初期値： i_l_ERR_CTR_NM

	final static String i_l_ERR_CTR_NM = null;

	// 第 7 変数初期値： i_l_ERR_ITEM_CD

	final static String i_l_ERR_ITEM_CD = null;

	// 第 8 変数初期値： i_l_ERR_PRD_DUE_DATE

	final static String i_l_ERR_PRD_DUE_DATE = null;

	// 第 9 変数初期値： i_l_ERR_PUCH_ODR_DLV_DATE

	final static String i_l_ERR_PUCH_ODR_DLV_DATE = null;

	// 第 10 変数初期値： i_l_ERR_PUCH_ODR_QTY

	final static String i_l_ERR_PUCH_ODR_QTY = null;

	// 第 11 変数初期値： i_l_ERR_VEND_CD

	final static String i_l_ERR_VEND_CD = null;

	// 第 12 変数初期値： i_l_ERR_JOB_ODR_CD

	final static String i_l_ERR_JOB_ODR_CD = null;

	// 第 13 変数初期値： i_l_ERR_CONFIRM_DLV_DATE

	final static String i_l_ERR_CONFIRM_DLV_DATE = null;

	// 第 14 変数初期値： i_l_ERR_WH_CD

	final static String i_l_ERR_WH_CD = null;

	// 第 15 変数初期値： i_l_ERR_WORK_IN_PROC_COMMENT

	final static String i_l_ERR_WORK_IN_PROC_COMMENT = null;

	// 第 16 変数初期値： i_l_ERR_NON_NO_ITEM_FLG

	final static String i_l_ERR_NON_NO_ITEM_FLG = null;

	// 第 17 変数初期値： i_l_ERR_NON_NO_ITEM_NAME

	final static String i_l_ERR_NON_NO_ITEM_NAME = null;

	// 第 18 変数初期値： i_l_ERR_NON_NO_ITEM_TYP

	final static String i_l_ERR_NON_NO_ITEM_TYP = null;

	// 第 19 変数初期値： i_l_ERR_NON_NO_ITEM_PUCH_ODR_UNIT

	final static String i_l_ERR_NON_NO_ITEM_PUCH_ODR_UNIT = null;

	// 第 20 変数初期値： i_l_ERR_UNIT_COST_TYP

	final static String i_l_ERR_UNIT_COST_TYP = null;

	// 第 21 変数初期値： i_l_ERR_ACTUAL_UNIT_PRICE

	final static String i_l_ERR_ACTUAL_UNIT_PRICE = null;

	// 第 22 変数初期値： i_l_ERR_PROCESSING_COST

	final static String i_l_ERR_PROCESSING_COST = null;

	// 第 23 変数初期値： i_l_ERR_MATERIAL_COST

	final static String i_l_ERR_MATERIAL_COST = null;

	// 第 24 変数初期値： i_l_ERR_OTHER_OVERHEADS

	final static String i_l_ERR_OTHER_OVERHEADS = null;

	// 第 25 変数初期値： i_l_ERR_NET_AMOUNT

	final static String i_l_ERR_NET_AMOUNT = null;

	// 第 26 変数初期値： i_l_ERR_EXCH_RATE

	final static String i_l_ERR_EXCH_RATE = null;

	// 第 27 変数初期値： i_MRP_ODR_TYP

	final static String i_MRP_ODR_TYP = null;

	// 第 28 変数初期値： i_ACPT_INSPC_TYP

	final static String i_ACPT_INSPC_TYP = null;

	// 第 29 変数初期値： i_UNIT_QTY_TYP

	final static String i_UNIT_QTY_TYP = null;

	// 第 30 変数初期値： i_FIXED_LT

	final static String i_FIXED_LT = null;

	// 第 31 変数初期値： i_PROP_LT

	final static String i_PROP_LT = null;

	// 第 32 変数初期値： i_SAFETY_LT

	final static String i_SAFETY_LT = null;

	// 第 33 変数初期値： i_PROP_LOT_SIZE

	final static String i_PROP_LOT_SIZE = null;

	// 第 34 変数初期値： i_ITEM_CD

	final static String i_ITEM_CD = null;

	// 第 35 変数初期値： i_VEND_CD

	final static String i_VEND_CD = null;

	// 第 36 変数初期値： i_DEAL_STS_FLG

	final static String i_DEAL_STS_FLG = null;

	// 第 37 変数初期値： i_COMPANY_CD

	final static String i_COMPANY_CD = null;

	// 第 38 変数初期値： i_PLANT_CD

	final static String i_PLANT_CD = null;

	// 第 39 変数初期値： i_WH_CD

	final static String i_WH_CD = null;

	// 第 40 変数初期値： i_JOB_ODR_STS_TYP

	final static String i_JOB_ODR_STS_TYP = null;

	// 第 41 変数初期値： i_JOB_ODR_CD

	final static String i_JOB_ODR_CD = null;

	// 第 42 変数初期値： i_JOB_ODR_DLV_DATE

	final static String i_JOB_ODR_DLV_DATE = null;

	// 第 43 変数初期値： i_VALUE

	final static String i_VALUE = null;

	// 第 44 変数初期値： i_NAME

	final static String i_NAME = null;

	// 第 45 変数初期値： i_PUCH_ODR_CD

	final static String i_PUCH_ODR_CD = null;

	// 第 46 変数初期値： i_NON_NO_ITEM_NAME

	final static String i_NON_NO_ITEM_NAME = null;

	// 第 47 変数初期値： i_NON_NO_ITEM_TYP

	final static String i_NON_NO_ITEM_TYP = null;

	// 第 48 変数初期値： i_PUCH_ODR_PERSON

	final static String i_PUCH_ODR_PERSON = null;

	// 第 49 変数初期値： i_PUCH_ODR_START_DATE

	final static String i_PUCH_ODR_START_DATE = null;

	// 第 50 変数初期値： i_PUCH_ODR_DLV_DATE

	final static String i_PUCH_ODR_DLV_DATE = null;

	// 第 51 変数初期値： i_PUCH_ODR_QTY

	final static String i_PUCH_ODR_QTY = null;

	// 第 52 変数初期値： i_NON_NO_ITEM_PUCH_ODR_UNIT

	final static String i_NON_NO_ITEM_PUCH_ODR_UNIT = null;

	// 第 53 変数初期値： i_UNIT_COST_TYP

	final static String i_UNIT_COST_TYP = null;

	// 第 54 変数初期値： i_UNIT_COST

	final static String i_UNIT_COST = null;

	// 第 55 変数初期値： i_PROCESSING_COST

	final static String i_PROCESSING_COST = null;

	// 第 56 変数初期値： i_MATERIAL_COST

	final static String i_MATERIAL_COST = null;

	// 第 57 変数初期値： i_OTHER_OVERHEADS

	final static String i_OTHER_OVERHEADS = null;

	// 第 58 変数初期値： i_DISC_AMOUNT

	final static String i_DISC_AMOUNT = null;

	// 第 59 変数初期値： i_PUCH_ODR_AMOUNT

	final static String i_PUCH_ODR_AMOUNT = null;

	// 第 60 変数初期値： i_CONFIRM_DLV_DATE

	final static String i_CONFIRM_DLV_DATE = null;

	// 第 61 変数初期値： i_INV_CTRL_FLG

	final static String i_INV_CTRL_FLG = null;

	// 第 62 変数初期値： i_OD_NO

	final static String i_OD_NO = null;

	// 第 63 変数初期値： i_PUCH_ODR_COMMENT

	final static String i_PUCH_ODR_COMMENT = null;

	// 第 64 変数初期値： i_RATE_JUDGE_DATE

	final static String i_RATE_JUDGE_DATE = null;

	// 第 65 変数初期値： i_EXCH_RATE

	final static String i_EXCH_RATE = null;

	// 第 66 変数初期値： i_TAX_RATE_1

	final static String i_TAX_RATE_1 = null;

	// 第 67 変数初期値： i_TAX_RATE_2

	final static String i_TAX_RATE_2 = null;

	// 第 68 変数初期値： i_TAX_RATE_3

	final static String i_TAX_RATE_3 = null;

	// 第 69 変数初期値： i_NET_AMOUNT

	final static String i_NET_AMOUNT = null;

	// 第 70 変数初期値： i_TAX_AMOUNT_1

	final static String i_TAX_AMOUNT_1 = null;

	// 第 71 変数初期値： i_TAX_AMOUNT_2

	final static String i_TAX_AMOUNT_2 = null;

	// 第 72 変数初期値： i_TAX_AMOUNT_3

	final static String i_TAX_AMOUNT_3 = null;

	// 第 73 変数初期値： i_AMOUNT_INCLUDE_TAX

	final static String i_AMOUNT_INCLUDE_TAX = null;

	// 第 74 変数初期値： i_HOME_CUR_AMOUNT

	final static String i_HOME_CUR_AMOUNT = null;

	// 第 75 変数初期値： i_TAX_CD

	final static String i_TAX_CD = null;

	// 第 76 変数初期値： i_TAX_ROUND_TYP

	final static String i_TAX_ROUND_TYP = null;

	// 第 77 変数初期値： i_NON_NO_ITEM_FLG

	final static String i_NON_NO_ITEM_FLG = null;


	/**
	 * 初期化
	 *
	 */
	public void initialize()
	{

		clear();

		m_FileName = i_FileName;
		m_DOWNLOAD_FILE = i_DOWNLOAD_FILE;
		m_l_ERROR_IN = i_l_ERROR_IN;
		m_l_ERR_TYP = i_l_ERR_TYP;
		m_l_ERR_INFO = i_l_ERR_INFO;
		m_l_ERR_CTR_NM = i_l_ERR_CTR_NM;
		m_l_ERR_ITEM_CD = i_l_ERR_ITEM_CD;
		m_l_ERR_PRD_DUE_DATE = i_l_ERR_PRD_DUE_DATE;
		m_l_ERR_PUCH_ODR_DLV_DATE = i_l_ERR_PUCH_ODR_DLV_DATE;
		m_l_ERR_PUCH_ODR_QTY = i_l_ERR_PUCH_ODR_QTY;
		m_l_ERR_VEND_CD = i_l_ERR_VEND_CD;
		m_l_ERR_JOB_ODR_CD = i_l_ERR_JOB_ODR_CD;
		m_l_ERR_CONFIRM_DLV_DATE = i_l_ERR_CONFIRM_DLV_DATE;
		m_l_ERR_WH_CD = i_l_ERR_WH_CD;
		m_l_ERR_WORK_IN_PROC_COMMENT = i_l_ERR_WORK_IN_PROC_COMMENT;
		m_l_ERR_NON_NO_ITEM_FLG = i_l_ERR_NON_NO_ITEM_FLG;
		m_l_ERR_NON_NO_ITEM_NAME = i_l_ERR_NON_NO_ITEM_NAME;
		m_l_ERR_NON_NO_ITEM_TYP = i_l_ERR_NON_NO_ITEM_TYP;
		m_l_ERR_NON_NO_ITEM_PUCH_ODR_UNIT = i_l_ERR_NON_NO_ITEM_PUCH_ODR_UNIT;
		m_l_ERR_UNIT_COST_TYP = i_l_ERR_UNIT_COST_TYP;
		m_l_ERR_ACTUAL_UNIT_PRICE = i_l_ERR_ACTUAL_UNIT_PRICE;
		m_l_ERR_PROCESSING_COST = i_l_ERR_PROCESSING_COST;
		m_l_ERR_MATERIAL_COST = i_l_ERR_MATERIAL_COST;
		m_l_ERR_OTHER_OVERHEADS = i_l_ERR_OTHER_OVERHEADS;
		m_l_ERR_NET_AMOUNT = i_l_ERR_NET_AMOUNT;
		m_l_ERR_EXCH_RATE = i_l_ERR_EXCH_RATE;
		m_MRP_ODR_TYP = i_MRP_ODR_TYP;
		m_ACPT_INSPC_TYP = i_ACPT_INSPC_TYP;
		m_UNIT_QTY_TYP = i_UNIT_QTY_TYP;
		m_FIXED_LT = i_FIXED_LT;
		m_PROP_LT = i_PROP_LT;
		m_SAFETY_LT = i_SAFETY_LT;
		m_PROP_LOT_SIZE = i_PROP_LOT_SIZE;
		m_ITEM_CD = i_ITEM_CD;
		m_VEND_CD = i_VEND_CD;
		m_DEAL_STS_FLG = i_DEAL_STS_FLG;
		m_COMPANY_CD = i_COMPANY_CD;
		m_PLANT_CD = i_PLANT_CD;
		m_WH_CD = i_WH_CD;
		m_JOB_ODR_STS_TYP = i_JOB_ODR_STS_TYP;
		m_JOB_ODR_CD = i_JOB_ODR_CD;
		m_JOB_ODR_DLV_DATE = i_JOB_ODR_DLV_DATE;
		m_VALUE = i_VALUE;
		m_NAME = i_NAME;
		m_PUCH_ODR_CD = i_PUCH_ODR_CD;
		m_NON_NO_ITEM_NAME = i_NON_NO_ITEM_NAME;
		m_NON_NO_ITEM_TYP = i_NON_NO_ITEM_TYP;
		m_PUCH_ODR_PERSON = i_PUCH_ODR_PERSON;
		m_PUCH_ODR_START_DATE = i_PUCH_ODR_START_DATE;
		m_PUCH_ODR_DLV_DATE = i_PUCH_ODR_DLV_DATE;
		m_PUCH_ODR_QTY = i_PUCH_ODR_QTY;
		m_NON_NO_ITEM_PUCH_ODR_UNIT = i_NON_NO_ITEM_PUCH_ODR_UNIT;
		m_UNIT_COST_TYP = i_UNIT_COST_TYP;
		m_UNIT_COST = i_UNIT_COST;
		m_PROCESSING_COST = i_PROCESSING_COST;
		m_MATERIAL_COST = i_MATERIAL_COST;
		m_OTHER_OVERHEADS = i_OTHER_OVERHEADS;
		m_DISC_AMOUNT = i_DISC_AMOUNT;
		m_PUCH_ODR_AMOUNT = i_PUCH_ODR_AMOUNT;
		m_CONFIRM_DLV_DATE = i_CONFIRM_DLV_DATE;
		m_INV_CTRL_FLG = i_INV_CTRL_FLG;
		m_OD_NO = i_OD_NO;
		m_PUCH_ODR_COMMENT = i_PUCH_ODR_COMMENT;
		m_RATE_JUDGE_DATE = i_RATE_JUDGE_DATE;
		m_EXCH_RATE = i_EXCH_RATE;
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
		m_NON_NO_ITEM_FLG = i_NON_NO_ITEM_FLG;
	}
		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
