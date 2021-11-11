/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KM0020/src/com/nec/jp/orteus/metamorBase/KM0020/KM0020010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.KM0020;

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
 * CLASS     : KM0020010Control クラス
 * ファイル・クラス説明
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.4 $ $Date: 2014/11/05 07:29:16 $
 *
 */
//}}user_implement_code_header

public class KM0020010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_l_CUR_UNIT */
	public String m_l_CUR_UNIT = null;
	/** 第 2 変数： m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** 第 3 変数： m_l_FLAG */
	public String m_l_FLAG = null;
	/** 第 4 変数： m_QUOTE_ESTIMATE_NO */
	public String m_QUOTE_ESTIMATE_NO = null;
	/** 第 5 変数： m_l_ESTIMATE_NAME */
	public String m_l_ESTIMATE_NAME = null;
	/** 第 6 変数： m_l_SPEC_CLASS1_NAME */
	public String m_l_SPEC_CLASS1_NAME = null;
	/** 第 7 変数： m_l_SPEC_CLASS2_NAME */
	public String m_l_SPEC_CLASS2_NAME = null;
	/** 第 8 変数： m_l_SPEC_SELECT1_NAME */
	public String m_l_SPEC_SELECT1_NAME = null;
	/** 第 9 変数： m_l_SPEC_SELECT2_NAME */
	public String m_l_SPEC_SELECT2_NAME = null;
	/** 第 10 変数： m_l_SPEC_SELECT3_NAME */
	public String m_l_SPEC_SELECT3_NAME = null;
	/** 第 11 変数： m_l_SPEC_SELECT4_NAME */
	public String m_l_SPEC_SELECT4_NAME = null;
	/** 第 12 変数： m_l_ESTIMATE_TYP_name */
	public String m_l_ESTIMATE_TYP_name = null;
	/** 第 13 変数： m_l_ESTIMATE_TYP_val */
	public String m_l_ESTIMATE_TYP_val = null;
	/** 第 14 変数： m_l_SPEC_CLASS1_TYP_name */
	public String m_l_SPEC_CLASS1_TYP_name = null;
	/** 第 15 変数： m_l_SPEC_CLASS1_TYP_val */
	public String m_l_SPEC_CLASS1_TYP_val = null;
	/** 第 16 変数： m_l_SPEC_CLASS2_TYP_name */
	public String m_l_SPEC_CLASS2_TYP_name = null;
	/** 第 17 変数： m_l_SPEC_CLASS2_TYP_val */
	public String m_l_SPEC_CLASS2_TYP_val = null;
	/** 第 18 変数： m_l_SPEC_SELECT1_TYP_name */
	public String m_l_SPEC_SELECT1_TYP_name = null;
	/** 第 19 変数： m_l_SPEC_SELECT1_TYP_val */
	public String m_l_SPEC_SELECT1_TYP_val = null;
	/** 第 20 変数： m_l_SPEC_SELECT2_TYP_name */
	public String m_l_SPEC_SELECT2_TYP_name = null;
	/** 第 21 変数： m_l_SPEC_SELECT2_TYP_val */
	public String m_l_SPEC_SELECT2_TYP_val = null;
	/** 第 22 変数： m_l_SPEC_SELECT3_TYP_name */
	public String m_l_SPEC_SELECT3_TYP_name = null;
	/** 第 23 変数： m_l_SPEC_SELECT3_TYP_val */
	public String m_l_SPEC_SELECT3_TYP_val = null;
	/** 第 24 変数： m_l_SPEC_SELECT4_TYP_name */
	public String m_l_SPEC_SELECT4_TYP_name = null;
	/** 第 25 変数： m_l_SPEC_SELECT4_TYP_val */
	public String m_l_SPEC_SELECT4_TYP_val = null;
	/** 第 26 変数： m_LIST_CNT */
	public String m_LIST_CNT = null;
	/** 第 27 変数： m_h_ESTIMATE_NO */
	public String m_h_ESTIMATE_NO = null;
	/** 第 28 変数： m_h_UNOFFICIAL_RECEIPT_FLAG */
	public String m_h_UNOFFICIAL_RECEIPT_FLAG = null;
	/** 第 29 変数： m_h_PROJECT_STAT */
	public String m_h_PROJECT_STAT = null;
	/** 第 30 変数： m_h_CALLBUTTON */
	public String m_h_CALLBUTTON = null;
	/** 第 31 変数： m_PROJECT_NAME */
	public String m_PROJECT_NAME = null;
	/** 第 32 変数： m_h_CUST_CD */
	public String m_h_CUST_CD = null;
	/** 第 33 変数： m_ES_ORG_CD */
	public String m_ES_ORG_CD = null;
	/** 第 34 変数： m_ES_USER_CD */
	public String m_ES_USER_CD = null;
	/** 第 35 変数： m_ORG_NAME */
	public String m_ORG_NAME = null;
	/** 第 36 変数： m_USER_NAME */
	public String m_USER_NAME = null;
	/** 第 37 変数： m_PROJECT_STAT */
	public String m_PROJECT_STAT = null;
	/** 第 38 変数： m_MODIFY_COUNT_PJ */
	public String m_MODIFY_COUNT_PJ = null;
	/** 第 39 変数： m_PROJECT_CD */
	public String m_PROJECT_CD = null;
	/** 第 40 変数： m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** 第 41 変数： m_CUST_NAME */
	public String m_CUST_NAME = null;
	/** 第 42 変数： m_h_CUR_CD */
	public String m_h_CUR_CD = null;
	/** 第 43 変数： m_EXCH_TYP */
	public String m_EXCH_TYP = null;
	/** 第 44 変数： m_DETAIL_ROUND_TYP */
	public String m_DETAIL_ROUND_TYP = null;
	/** 第 45 変数： m_CUR_UNIT */
	public String m_CUR_UNIT = null;
	/** 第 46 変数： m_h_PROJECT_CD */
	public String m_h_PROJECT_CD = null;
	/** 第 47 変数： m_ESTIMATE_STAT */
	public String m_ESTIMATE_STAT = null;
	/** 第 48 変数： m_UNOFFICIAL_RECEIPT_FLG */
	public String m_UNOFFICIAL_RECEIPT_FLG = null;
	/** 第 49 変数： m_ESTIMATE_DATE */
	public String m_ESTIMATE_DATE = null;
	/** 第 50 変数： m_ESTIMATE_AMOUNT */
	public String m_ESTIMATE_AMOUNT = null;
	/** 第 51 変数： m_ESTIMATE_AMOUNT_JPN */
	public String m_ESTIMATE_AMOUNT_JPN = null;
	/** 第 52 変数： m_ES_COMMET1 */
	public String m_ES_COMMET1 = null;
	/** 第 53 変数： m_ES_COMMET2 */
	public String m_ES_COMMET2 = null;
	/** 第 54 変数： m_ES_COMMET4 */
	public String m_ES_COMMET4 = null;
	/** 第 55 変数： m_ES_COMMET3 */
	public String m_ES_COMMET3 = null;
	/** 第 56 変数： m_ES_COMMET5 */
	public String m_ES_COMMET5 = null;
	/** 第 57 変数： m_ESREMARK1 */
	public String m_ESREMARK1 = null;
	/** 第 58 変数： m_ESREMARK2 */
	public String m_ESREMARK2 = null;
	/** 第 59 変数： m_ESREMARK3 */
	public String m_ESREMARK3 = null;
	/** 第 60 変数： m_ZIP_CD */
	public String m_ZIP_CD = null;
	/** 第 61 変数： m_ADDRESS_1 */
	public String m_ADDRESS_1 = null;
	/** 第 62 変数： m_ADDRESS_2 */
	public String m_ADDRESS_2 = null;
	/** 第 63 変数： m_TEL */
	public String m_TEL = null;
	/** 第 64 変数： m_MODIFY_COUNT_ES */
	public String m_MODIFY_COUNT_ES = null;
	/** 第 65 変数： m_l_DETAL_NO */
	public String m_l_DETAL_NO = null;
	/** 第 66 変数： m_l_ESTIMATE_TYP */
	public String m_l_ESTIMATE_TYP = null;
	/** 第 67 変数： m_l_CUST_ITEM_CD */
	public String m_l_CUST_ITEM_CD = null;
	/** 第 68 変数： m_l_ITEM_NAME */
	public String m_l_ITEM_NAME = null;
	/** 第 69 変数： m_l_DESINATED_DLV_DATE */
	public String m_l_DESINATED_DLV_DATE = null;
	/** 第 70 変数： m_l_ESTIMATE_QTY */
	public String m_l_ESTIMATE_QTY = null;
	/** 第 71 変数： m_l_UNIT_CD */
	public String m_l_UNIT_CD = null;
	/** 第 72 変数： m_l_UNIT_PRICE */
	public String m_l_UNIT_PRICE = null;
	/** 第 73 変数： m_l_DISCOUNT_PRICE */
	public String m_l_DISCOUNT_PRICE = null;
	/** 第 74 変数： m_l_ESTIMATE_UNIT_PRICE */
	public String m_l_ESTIMATE_UNIT_PRICE = null;
	/** 第 75 変数： m_l_AMOUNT */
	public String m_l_AMOUNT = null;
	/** 第 76 変数： m_l_DISCOUNT_AMOUNT */
	public String m_l_DISCOUNT_AMOUNT = null;
	/** 第 77 変数： m_l_ESTIMATE_AMOUNT */
	public String m_l_ESTIMATE_AMOUNT = null;
	/** 第 78 変数： m_l_ESTIMATE_AMOUNT_JPN */
	public String m_l_ESTIMATE_AMOUNT_JPN = null;
	/** 第 79 変数： m_l_ESTIMATE_GAIN */
	public String m_l_ESTIMATE_GAIN = null;
	/** 第 80 変数： m_l_ES_COST_MATERIAL */
	public String m_l_ES_COST_MATERIAL = null;
	/** 第 81 変数： m_l_ES_COST_PROCESS */
	public String m_l_ES_COST_PROCESS = null;
	/** 第 82 変数： m_l_ES_COST_OUTSOUCE */
	public String m_l_ES_COST_OUTSOUCE = null;
	/** 第 83 変数： m_l_ES_COST_ETC */
	public String m_l_ES_COST_ETC = null;
	/** 第 84 変数： m_l_ES_COST_SERVICE */
	public String m_l_ES_COST_SERVICE = null;
	/** 第 85 変数： m_l_ES_COST_ALL */
	public String m_l_ES_COST_ALL = null;
	/** 第 86 変数： m_l_SPEC_CLASS1_TYP */
	public String m_l_SPEC_CLASS1_TYP = null;
	/** 第 87 変数： m_l_SPEC_CLASS2_TYP */
	public String m_l_SPEC_CLASS2_TYP = null;
	/** 第 88 変数： m_l_SPEC_SELECT1_TYP */
	public String m_l_SPEC_SELECT1_TYP = null;
	/** 第 89 変数： m_l_SPEC_SELECT2_TYP */
	public String m_l_SPEC_SELECT2_TYP = null;
	/** 第 90 変数： m_l_SPEC_SELECT3_TYP */
	public String m_l_SPEC_SELECT3_TYP = null;
	/** 第 91 変数： m_l_SPEC_SELECT4_TYP */
	public String m_l_SPEC_SELECT4_TYP = null;
	/** 第 92 変数： m_l_REMARKS */
	public String m_l_REMARKS = null;
	/** 第 93 変数： m_l_UNIT_COST */
	public String m_l_UNIT_COST = null;
	/** 第 94 変数： m_l_CUST_ITEM_NAME */
	public String m_l_CUST_ITEM_NAME = null;
	/** 第 95 変数： m_h_MAX_DETAL_NO */
	public String m_h_MAX_DETAL_NO = null;
	/** 第 96 変数： m_l_COUNT */
	public String m_l_COUNT = null;
	/** 第 97 変数： m_ROW_COUNT */
	public String m_ROW_COUNT = null;
	/** 第 98 変数： m_BUSINESS_DATE */
	public String m_BUSINESS_DATE = null;
	/** 第 99 変数： m_HOME_CUR_CD */
	public String m_HOME_CUR_CD = null;
	/** 第 100 変数： m_QUOTE_CUST_CD */
	public String m_QUOTE_CUST_CD = null;
	/** 第 101 変数： m_QUOTE_CUR_CD */
	public String m_QUOTE_CUR_CD = null;
	/** 第 102 変数： m_QUOTE_CUR_UNIT */
	public String m_QUOTE_CUR_UNIT = null;
	/** 第 103 変数： m_QUOTE_PROJECT_CD */
	public String m_QUOTE_PROJECT_CD = null;
	/** 第 104 変数： m_UNIT_QTY_TYP */
	public String m_UNIT_QTY_TYP = null;
	/** 第 105 変数： m_UNIT_COST */
	public String m_UNIT_COST = null;
	/** 第 106 変数： m_ESTIMATE_NO */
	public String m_ESTIMATE_NO = null;
	/** 第 107 変数： m_UNOFFICIAL_RECEIPT_FLAG */
	public String m_UNOFFICIAL_RECEIPT_FLAG = null;
	/** 第 108 変数： m_ESTIMATE_ST */
	public String m_ESTIMATE_ST = null;
	/** 第 109 変数： m_USER */
	public String m_USER = null;
	/** 第 110 変数： m_PROGRAM_NAME */
	public String m_PROGRAM_NAME = null;
	/** 第 111 変数： m_h_ESTIMATE_ST */
	public String m_h_ESTIMATE_ST = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_l_CUR_UNIT */
	public List l_l_CUR_UNIT = null;

	/** 第 2 List変数： l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** 第 3 List変数： l_l_FLAG */
	public List l_l_FLAG = null;

	/** 第 4 List変数： l_QUOTE_ESTIMATE_NO */
	public List l_QUOTE_ESTIMATE_NO = null;

	/** 第 5 List変数： l_l_ESTIMATE_NAME */
	public List l_l_ESTIMATE_NAME = null;

	/** 第 6 List変数： l_l_SPEC_CLASS1_NAME */
	public List l_l_SPEC_CLASS1_NAME = null;

	/** 第 7 List変数： l_l_SPEC_CLASS2_NAME */
	public List l_l_SPEC_CLASS2_NAME = null;

	/** 第 8 List変数： l_l_SPEC_SELECT1_NAME */
	public List l_l_SPEC_SELECT1_NAME = null;

	/** 第 9 List変数： l_l_SPEC_SELECT2_NAME */
	public List l_l_SPEC_SELECT2_NAME = null;

	/** 第 10 List変数： l_l_SPEC_SELECT3_NAME */
	public List l_l_SPEC_SELECT3_NAME = null;

	/** 第 11 List変数： l_l_SPEC_SELECT4_NAME */
	public List l_l_SPEC_SELECT4_NAME = null;

	/** 第 12 List変数： l_l_ESTIMATE_TYP_name */
	public List l_l_ESTIMATE_TYP_name = null;

	/** 第 13 List変数： l_l_ESTIMATE_TYP_val */
	public List l_l_ESTIMATE_TYP_val = null;

	/** 第 14 List変数： l_l_SPEC_CLASS1_TYP_name */
	public List l_l_SPEC_CLASS1_TYP_name = null;

	/** 第 15 List変数： l_l_SPEC_CLASS1_TYP_val */
	public List l_l_SPEC_CLASS1_TYP_val = null;

	/** 第 16 List変数： l_l_SPEC_CLASS2_TYP_name */
	public List l_l_SPEC_CLASS2_TYP_name = null;

	/** 第 17 List変数： l_l_SPEC_CLASS2_TYP_val */
	public List l_l_SPEC_CLASS2_TYP_val = null;

	/** 第 18 List変数： l_l_SPEC_SELECT1_TYP_name */
	public List l_l_SPEC_SELECT1_TYP_name = null;

	/** 第 19 List変数： l_l_SPEC_SELECT1_TYP_val */
	public List l_l_SPEC_SELECT1_TYP_val = null;

	/** 第 20 List変数： l_l_SPEC_SELECT2_TYP_name */
	public List l_l_SPEC_SELECT2_TYP_name = null;

	/** 第 21 List変数： l_l_SPEC_SELECT2_TYP_val */
	public List l_l_SPEC_SELECT2_TYP_val = null;

	/** 第 22 List変数： l_l_SPEC_SELECT3_TYP_name */
	public List l_l_SPEC_SELECT3_TYP_name = null;

	/** 第 23 List変数： l_l_SPEC_SELECT3_TYP_val */
	public List l_l_SPEC_SELECT3_TYP_val = null;

	/** 第 24 List変数： l_l_SPEC_SELECT4_TYP_name */
	public List l_l_SPEC_SELECT4_TYP_name = null;

	/** 第 25 List変数： l_l_SPEC_SELECT4_TYP_val */
	public List l_l_SPEC_SELECT4_TYP_val = null;

	/** 第 26 List変数： l_LIST_CNT */
	public List l_LIST_CNT = null;

	/** 第 27 List変数： l_h_ESTIMATE_NO */
	public List l_h_ESTIMATE_NO = null;

	/** 第 28 List変数： l_h_UNOFFICIAL_RECEIPT_FLAG */
	public List l_h_UNOFFICIAL_RECEIPT_FLAG = null;

	/** 第 29 List変数： l_h_PROJECT_STAT */
	public List l_h_PROJECT_STAT = null;

	/** 第 30 List変数： l_h_CALLBUTTON */
	public List l_h_CALLBUTTON = null;

	/** 第 31 List変数： l_PROJECT_NAME */
	public List l_PROJECT_NAME = null;

	/** 第 32 List変数： l_h_CUST_CD */
	public List l_h_CUST_CD = null;

	/** 第 33 List変数： l_ES_ORG_CD */
	public List l_ES_ORG_CD = null;

	/** 第 34 List変数： l_ES_USER_CD */
	public List l_ES_USER_CD = null;

	/** 第 35 List変数： l_ORG_NAME */
	public List l_ORG_NAME = null;

	/** 第 36 List変数： l_USER_NAME */
	public List l_USER_NAME = null;

	/** 第 37 List変数： l_PROJECT_STAT */
	public List l_PROJECT_STAT = null;

	/** 第 38 List変数： l_MODIFY_COUNT_PJ */
	public List l_MODIFY_COUNT_PJ = null;

	/** 第 39 List変数： l_PROJECT_CD */
	public List l_PROJECT_CD = null;

	/** 第 40 List変数： l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** 第 41 List変数： l_CUST_NAME */
	public List l_CUST_NAME = null;

	/** 第 42 List変数： l_h_CUR_CD */
	public List l_h_CUR_CD = null;

	/** 第 43 List変数： l_EXCH_TYP */
	public List l_EXCH_TYP = null;

	/** 第 44 List変数： l_DETAIL_ROUND_TYP */
	public List l_DETAIL_ROUND_TYP = null;

	/** 第 45 List変数： l_CUR_UNIT */
	public List l_CUR_UNIT = null;

	/** 第 46 List変数： l_h_PROJECT_CD */
	public List l_h_PROJECT_CD = null;

	/** 第 47 List変数： l_ESTIMATE_STAT */
	public List l_ESTIMATE_STAT = null;

	/** 第 48 List変数： l_UNOFFICIAL_RECEIPT_FLG */
	public List l_UNOFFICIAL_RECEIPT_FLG = null;

	/** 第 49 List変数： l_ESTIMATE_DATE */
	public List l_ESTIMATE_DATE = null;

	/** 第 50 List変数： l_ESTIMATE_AMOUNT */
	public List l_ESTIMATE_AMOUNT = null;

	/** 第 51 List変数： l_ESTIMATE_AMOUNT_JPN */
	public List l_ESTIMATE_AMOUNT_JPN = null;

	/** 第 52 List変数： l_ES_COMMET1 */
	public List l_ES_COMMET1 = null;

	/** 第 53 List変数： l_ES_COMMET2 */
	public List l_ES_COMMET2 = null;

	/** 第 54 List変数： l_ES_COMMET4 */
	public List l_ES_COMMET4 = null;

	/** 第 55 List変数： l_ES_COMMET3 */
	public List l_ES_COMMET3 = null;

	/** 第 56 List変数： l_ES_COMMET5 */
	public List l_ES_COMMET5 = null;

	/** 第 57 List変数： l_ESREMARK1 */
	public List l_ESREMARK1 = null;

	/** 第 58 List変数： l_ESREMARK2 */
	public List l_ESREMARK2 = null;

	/** 第 59 List変数： l_ESREMARK3 */
	public List l_ESREMARK3 = null;

	/** 第 60 List変数： l_ZIP_CD */
	public List l_ZIP_CD = null;

	/** 第 61 List変数： l_ADDRESS_1 */
	public List l_ADDRESS_1 = null;

	/** 第 62 List変数： l_ADDRESS_2 */
	public List l_ADDRESS_2 = null;

	/** 第 63 List変数： l_TEL */
	public List l_TEL = null;

	/** 第 64 List変数： l_MODIFY_COUNT_ES */
	public List l_MODIFY_COUNT_ES = null;

	/** 第 65 List変数： l_l_DETAL_NO */
	public List l_l_DETAL_NO = null;

	/** 第 66 List変数： l_l_ESTIMATE_TYP */
	public List l_l_ESTIMATE_TYP = null;

	/** 第 67 List変数： l_l_CUST_ITEM_CD */
	public List l_l_CUST_ITEM_CD = null;

	/** 第 68 List変数： l_l_ITEM_NAME */
	public List l_l_ITEM_NAME = null;

	/** 第 69 List変数： l_l_DESINATED_DLV_DATE */
	public List l_l_DESINATED_DLV_DATE = null;

	/** 第 70 List変数： l_l_ESTIMATE_QTY */
	public List l_l_ESTIMATE_QTY = null;

	/** 第 71 List変数： l_l_UNIT_CD */
	public List l_l_UNIT_CD = null;

	/** 第 72 List変数： l_l_UNIT_PRICE */
	public List l_l_UNIT_PRICE = null;

	/** 第 73 List変数： l_l_DISCOUNT_PRICE */
	public List l_l_DISCOUNT_PRICE = null;

	/** 第 74 List変数： l_l_ESTIMATE_UNIT_PRICE */
	public List l_l_ESTIMATE_UNIT_PRICE = null;

	/** 第 75 List変数： l_l_AMOUNT */
	public List l_l_AMOUNT = null;

	/** 第 76 List変数： l_l_DISCOUNT_AMOUNT */
	public List l_l_DISCOUNT_AMOUNT = null;

	/** 第 77 List変数： l_l_ESTIMATE_AMOUNT */
	public List l_l_ESTIMATE_AMOUNT = null;

	/** 第 78 List変数： l_l_ESTIMATE_AMOUNT_JPN */
	public List l_l_ESTIMATE_AMOUNT_JPN = null;

	/** 第 79 List変数： l_l_ESTIMATE_GAIN */
	public List l_l_ESTIMATE_GAIN = null;

	/** 第 80 List変数： l_l_ES_COST_MATERIAL */
	public List l_l_ES_COST_MATERIAL = null;

	/** 第 81 List変数： l_l_ES_COST_PROCESS */
	public List l_l_ES_COST_PROCESS = null;

	/** 第 82 List変数： l_l_ES_COST_OUTSOUCE */
	public List l_l_ES_COST_OUTSOUCE = null;

	/** 第 83 List変数： l_l_ES_COST_ETC */
	public List l_l_ES_COST_ETC = null;

	/** 第 84 List変数： l_l_ES_COST_SERVICE */
	public List l_l_ES_COST_SERVICE = null;

	/** 第 85 List変数： l_l_ES_COST_ALL */
	public List l_l_ES_COST_ALL = null;

	/** 第 86 List変数： l_l_SPEC_CLASS1_TYP */
	public List l_l_SPEC_CLASS1_TYP = null;

	/** 第 87 List変数： l_l_SPEC_CLASS2_TYP */
	public List l_l_SPEC_CLASS2_TYP = null;

	/** 第 88 List変数： l_l_SPEC_SELECT1_TYP */
	public List l_l_SPEC_SELECT1_TYP = null;

	/** 第 89 List変数： l_l_SPEC_SELECT2_TYP */
	public List l_l_SPEC_SELECT2_TYP = null;

	/** 第 90 List変数： l_l_SPEC_SELECT3_TYP */
	public List l_l_SPEC_SELECT3_TYP = null;

	/** 第 91 List変数： l_l_SPEC_SELECT4_TYP */
	public List l_l_SPEC_SELECT4_TYP = null;

	/** 第 92 List変数： l_l_REMARKS */
	public List l_l_REMARKS = null;

	/** 第 93 List変数： l_l_UNIT_COST */
	public List l_l_UNIT_COST = null;

	/** 第 94 List変数： l_l_CUST_ITEM_NAME */
	public List l_l_CUST_ITEM_NAME = null;

	/** 第 95 List変数： l_h_MAX_DETAL_NO */
	public List l_h_MAX_DETAL_NO = null;

	/** 第 96 List変数： l_l_COUNT */
	public List l_l_COUNT = null;

	/** 第 97 List変数： l_ROW_COUNT */
	public List l_ROW_COUNT = null;

	/** 第 98 List変数： l_BUSINESS_DATE */
	public List l_BUSINESS_DATE = null;

	/** 第 99 List変数： l_HOME_CUR_CD */
	public List l_HOME_CUR_CD = null;

	/** 第 100 List変数： l_QUOTE_CUST_CD */
	public List l_QUOTE_CUST_CD = null;

	/** 第 101 List変数： l_QUOTE_CUR_CD */
	public List l_QUOTE_CUR_CD = null;

	/** 第 102 List変数： l_QUOTE_CUR_UNIT */
	public List l_QUOTE_CUR_UNIT = null;

	/** 第 103 List変数： l_QUOTE_PROJECT_CD */
	public List l_QUOTE_PROJECT_CD = null;

	/** 第 104 List変数： l_UNIT_QTY_TYP */
	public List l_UNIT_QTY_TYP = null;

	/** 第 105 List変数： l_UNIT_COST */
	public List l_UNIT_COST = null;

	/** 第 106 List変数： l_ESTIMATE_NO */
	public List l_ESTIMATE_NO = null;

	/** 第 107 List変数： l_UNOFFICIAL_RECEIPT_FLAG */
	public List l_UNOFFICIAL_RECEIPT_FLAG = null;

	/** 第 108 List変数： l_ESTIMATE_ST */
	public List l_ESTIMATE_ST = null;

	/** 第 109 List変数： l_USER */
	public List l_USER = null;

	/** 第 110 List変数： l_PROGRAM_NAME */
	public List l_PROGRAM_NAME = null;

	/** 第 111 List変数： l_h_ESTIMATE_ST */
	public List l_h_ESTIMATE_ST = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getl_CUR_UNIT() { return m_l_CUR_UNIT; }
	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getl_FLAG() { return m_l_FLAG; }
	public String getQUOTE_ESTIMATE_NO() { return m_QUOTE_ESTIMATE_NO; }
	public String getl_ESTIMATE_NAME() { return m_l_ESTIMATE_NAME; }
	public String getl_SPEC_CLASS1_NAME() { return m_l_SPEC_CLASS1_NAME; }
	public String getl_SPEC_CLASS2_NAME() { return m_l_SPEC_CLASS2_NAME; }
	public String getl_SPEC_SELECT1_NAME() { return m_l_SPEC_SELECT1_NAME; }
	public String getl_SPEC_SELECT2_NAME() { return m_l_SPEC_SELECT2_NAME; }
	public String getl_SPEC_SELECT3_NAME() { return m_l_SPEC_SELECT3_NAME; }
	public String getl_SPEC_SELECT4_NAME() { return m_l_SPEC_SELECT4_NAME; }
	public String getl_ESTIMATE_TYP_name() { return m_l_ESTIMATE_TYP_name; }
	public String getl_ESTIMATE_TYP_val() { return m_l_ESTIMATE_TYP_val; }
	public String getl_SPEC_CLASS1_TYP_name() { return m_l_SPEC_CLASS1_TYP_name; }
	public String getl_SPEC_CLASS1_TYP_val() { return m_l_SPEC_CLASS1_TYP_val; }
	public String getl_SPEC_CLASS2_TYP_name() { return m_l_SPEC_CLASS2_TYP_name; }
	public String getl_SPEC_CLASS2_TYP_val() { return m_l_SPEC_CLASS2_TYP_val; }
	public String getl_SPEC_SELECT1_TYP_name() { return m_l_SPEC_SELECT1_TYP_name; }
	public String getl_SPEC_SELECT1_TYP_val() { return m_l_SPEC_SELECT1_TYP_val; }
	public String getl_SPEC_SELECT2_TYP_name() { return m_l_SPEC_SELECT2_TYP_name; }
	public String getl_SPEC_SELECT2_TYP_val() { return m_l_SPEC_SELECT2_TYP_val; }
	public String getl_SPEC_SELECT3_TYP_name() { return m_l_SPEC_SELECT3_TYP_name; }
	public String getl_SPEC_SELECT3_TYP_val() { return m_l_SPEC_SELECT3_TYP_val; }
	public String getl_SPEC_SELECT4_TYP_name() { return m_l_SPEC_SELECT4_TYP_name; }
	public String getl_SPEC_SELECT4_TYP_val() { return m_l_SPEC_SELECT4_TYP_val; }
	public String getLIST_CNT() { return m_LIST_CNT; }
	public String geth_ESTIMATE_NO() { return m_h_ESTIMATE_NO; }
	public String geth_UNOFFICIAL_RECEIPT_FLAG() { return m_h_UNOFFICIAL_RECEIPT_FLAG; }
	public String geth_PROJECT_STAT() { return m_h_PROJECT_STAT; }
	public String geth_CALLBUTTON() { return m_h_CALLBUTTON; }
	public String getPROJECT_NAME() { return m_PROJECT_NAME; }
	public String geth_CUST_CD() { return m_h_CUST_CD; }
	public String getES_ORG_CD() { return m_ES_ORG_CD; }
	public String getES_USER_CD() { return m_ES_USER_CD; }
	public String getORG_NAME() { return m_ORG_NAME; }
	public String getUSER_NAME() { return m_USER_NAME; }
	public String getPROJECT_STAT() { return m_PROJECT_STAT; }
	public String getMODIFY_COUNT_PJ() { return m_MODIFY_COUNT_PJ; }
	public String getPROJECT_CD() { return m_PROJECT_CD; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getCUST_NAME() { return m_CUST_NAME; }
	public String geth_CUR_CD() { return m_h_CUR_CD; }
	public String getEXCH_TYP() { return m_EXCH_TYP; }
	public String getDETAIL_ROUND_TYP() { return m_DETAIL_ROUND_TYP; }
	public String getCUR_UNIT() { return m_CUR_UNIT; }
	public String geth_PROJECT_CD() { return m_h_PROJECT_CD; }
	public String getESTIMATE_STAT() { return m_ESTIMATE_STAT; }
	public String getUNOFFICIAL_RECEIPT_FLG() { return m_UNOFFICIAL_RECEIPT_FLG; }
	public String getESTIMATE_DATE() { return m_ESTIMATE_DATE; }
	public String getESTIMATE_AMOUNT() { return m_ESTIMATE_AMOUNT; }
	public String getESTIMATE_AMOUNT_JPN() { return m_ESTIMATE_AMOUNT_JPN; }
	public String getES_COMMET1() { return m_ES_COMMET1; }
	public String getES_COMMET2() { return m_ES_COMMET2; }
	public String getES_COMMET4() { return m_ES_COMMET4; }
	public String getES_COMMET3() { return m_ES_COMMET3; }
	public String getES_COMMET5() { return m_ES_COMMET5; }
	public String getESREMARK1() { return m_ESREMARK1; }
	public String getESREMARK2() { return m_ESREMARK2; }
	public String getESREMARK3() { return m_ESREMARK3; }
	public String getZIP_CD() { return m_ZIP_CD; }
	public String getADDRESS_1() { return m_ADDRESS_1; }
	public String getADDRESS_2() { return m_ADDRESS_2; }
	public String getTEL() { return m_TEL; }
	public String getMODIFY_COUNT_ES() { return m_MODIFY_COUNT_ES; }
	public String getl_DETAL_NO() { return m_l_DETAL_NO; }
	public String getl_ESTIMATE_TYP() { return m_l_ESTIMATE_TYP; }
	public String getl_CUST_ITEM_CD() { return m_l_CUST_ITEM_CD; }
	public String getl_ITEM_NAME() { return m_l_ITEM_NAME; }
	public String getl_DESINATED_DLV_DATE() { return m_l_DESINATED_DLV_DATE; }
	public String getl_ESTIMATE_QTY() { return m_l_ESTIMATE_QTY; }
	public String getl_UNIT_CD() { return m_l_UNIT_CD; }
	public String getl_UNIT_PRICE() { return m_l_UNIT_PRICE; }
	public String getl_DISCOUNT_PRICE() { return m_l_DISCOUNT_PRICE; }
	public String getl_ESTIMATE_UNIT_PRICE() { return m_l_ESTIMATE_UNIT_PRICE; }
	public String getl_AMOUNT() { return m_l_AMOUNT; }
	public String getl_DISCOUNT_AMOUNT() { return m_l_DISCOUNT_AMOUNT; }
	public String getl_ESTIMATE_AMOUNT() { return m_l_ESTIMATE_AMOUNT; }
	public String getl_ESTIMATE_AMOUNT_JPN() { return m_l_ESTIMATE_AMOUNT_JPN; }
	public String getl_ESTIMATE_GAIN() { return m_l_ESTIMATE_GAIN; }
	public String getl_ES_COST_MATERIAL() { return m_l_ES_COST_MATERIAL; }
	public String getl_ES_COST_PROCESS() { return m_l_ES_COST_PROCESS; }
	public String getl_ES_COST_OUTSOUCE() { return m_l_ES_COST_OUTSOUCE; }
	public String getl_ES_COST_ETC() { return m_l_ES_COST_ETC; }
	public String getl_ES_COST_SERVICE() { return m_l_ES_COST_SERVICE; }
	public String getl_ES_COST_ALL() { return m_l_ES_COST_ALL; }
	public String getl_SPEC_CLASS1_TYP() { return m_l_SPEC_CLASS1_TYP; }
	public String getl_SPEC_CLASS2_TYP() { return m_l_SPEC_CLASS2_TYP; }
	public String getl_SPEC_SELECT1_TYP() { return m_l_SPEC_SELECT1_TYP; }
	public String getl_SPEC_SELECT2_TYP() { return m_l_SPEC_SELECT2_TYP; }
	public String getl_SPEC_SELECT3_TYP() { return m_l_SPEC_SELECT3_TYP; }
	public String getl_SPEC_SELECT4_TYP() { return m_l_SPEC_SELECT4_TYP; }
	public String getl_REMARKS() { return m_l_REMARKS; }
	public String getl_UNIT_COST() { return m_l_UNIT_COST; }
	public String getl_CUST_ITEM_NAME() { return m_l_CUST_ITEM_NAME; }
	public String geth_MAX_DETAL_NO() { return m_h_MAX_DETAL_NO; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }
	public String getBUSINESS_DATE() { return m_BUSINESS_DATE; }
	public String getHOME_CUR_CD() { return m_HOME_CUR_CD; }
	public String getQUOTE_CUST_CD() { return m_QUOTE_CUST_CD; }
	public String getQUOTE_CUR_CD() { return m_QUOTE_CUR_CD; }
	public String getQUOTE_CUR_UNIT() { return m_QUOTE_CUR_UNIT; }
	public String getQUOTE_PROJECT_CD() { return m_QUOTE_PROJECT_CD; }
	public String getUNIT_QTY_TYP() { return m_UNIT_QTY_TYP; }
	public String getUNIT_COST() { return m_UNIT_COST; }
	public String getESTIMATE_NO() { return m_ESTIMATE_NO; }
	public String getUNOFFICIAL_RECEIPT_FLAG() { return m_UNOFFICIAL_RECEIPT_FLAG; }
	public String getESTIMATE_ST() { return m_ESTIMATE_ST; }
	public String getUSER() { return m_USER; }
	public String getPROGRAM_NAME() { return m_PROGRAM_NAME; }
	public String geth_ESTIMATE_ST() { return m_h_ESTIMATE_ST; }

	public List getList_l_CUR_UNIT() { return l_l_CUR_UNIT; }
	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_l_FLAG() { return l_l_FLAG; }
	public List getList_QUOTE_ESTIMATE_NO() { return l_QUOTE_ESTIMATE_NO; }
	public List getList_l_ESTIMATE_NAME() { return l_l_ESTIMATE_NAME; }
	public List getList_l_SPEC_CLASS1_NAME() { return l_l_SPEC_CLASS1_NAME; }
	public List getList_l_SPEC_CLASS2_NAME() { return l_l_SPEC_CLASS2_NAME; }
	public List getList_l_SPEC_SELECT1_NAME() { return l_l_SPEC_SELECT1_NAME; }
	public List getList_l_SPEC_SELECT2_NAME() { return l_l_SPEC_SELECT2_NAME; }
	public List getList_l_SPEC_SELECT3_NAME() { return l_l_SPEC_SELECT3_NAME; }
	public List getList_l_SPEC_SELECT4_NAME() { return l_l_SPEC_SELECT4_NAME; }
	public List getList_l_ESTIMATE_TYP_name() { return l_l_ESTIMATE_TYP_name; }
	public List getList_l_ESTIMATE_TYP_val() { return l_l_ESTIMATE_TYP_val; }
	public List getList_l_SPEC_CLASS1_TYP_name() { return l_l_SPEC_CLASS1_TYP_name; }
	public List getList_l_SPEC_CLASS1_TYP_val() { return l_l_SPEC_CLASS1_TYP_val; }
	public List getList_l_SPEC_CLASS2_TYP_name() { return l_l_SPEC_CLASS2_TYP_name; }
	public List getList_l_SPEC_CLASS2_TYP_val() { return l_l_SPEC_CLASS2_TYP_val; }
	public List getList_l_SPEC_SELECT1_TYP_name() { return l_l_SPEC_SELECT1_TYP_name; }
	public List getList_l_SPEC_SELECT1_TYP_val() { return l_l_SPEC_SELECT1_TYP_val; }
	public List getList_l_SPEC_SELECT2_TYP_name() { return l_l_SPEC_SELECT2_TYP_name; }
	public List getList_l_SPEC_SELECT2_TYP_val() { return l_l_SPEC_SELECT2_TYP_val; }
	public List getList_l_SPEC_SELECT3_TYP_name() { return l_l_SPEC_SELECT3_TYP_name; }
	public List getList_l_SPEC_SELECT3_TYP_val() { return l_l_SPEC_SELECT3_TYP_val; }
	public List getList_l_SPEC_SELECT4_TYP_name() { return l_l_SPEC_SELECT4_TYP_name; }
	public List getList_l_SPEC_SELECT4_TYP_val() { return l_l_SPEC_SELECT4_TYP_val; }
	public List getList_LIST_CNT() { return l_LIST_CNT; }
	public List getList_h_ESTIMATE_NO() { return l_h_ESTIMATE_NO; }
	public List getList_h_UNOFFICIAL_RECEIPT_FLAG() { return l_h_UNOFFICIAL_RECEIPT_FLAG; }
	public List getList_h_PROJECT_STAT() { return l_h_PROJECT_STAT; }
	public List getList_h_CALLBUTTON() { return l_h_CALLBUTTON; }
	public List getList_PROJECT_NAME() { return l_PROJECT_NAME; }
	public List getList_h_CUST_CD() { return l_h_CUST_CD; }
	public List getList_ES_ORG_CD() { return l_ES_ORG_CD; }
	public List getList_ES_USER_CD() { return l_ES_USER_CD; }
	public List getList_ORG_NAME() { return l_ORG_NAME; }
	public List getList_USER_NAME() { return l_USER_NAME; }
	public List getList_PROJECT_STAT() { return l_PROJECT_STAT; }
	public List getList_MODIFY_COUNT_PJ() { return l_MODIFY_COUNT_PJ; }
	public List getList_PROJECT_CD() { return l_PROJECT_CD; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_CUST_NAME() { return l_CUST_NAME; }
	public List getList_h_CUR_CD() { return l_h_CUR_CD; }
	public List getList_EXCH_TYP() { return l_EXCH_TYP; }
	public List getList_DETAIL_ROUND_TYP() { return l_DETAIL_ROUND_TYP; }
	public List getList_CUR_UNIT() { return l_CUR_UNIT; }
	public List getList_h_PROJECT_CD() { return l_h_PROJECT_CD; }
	public List getList_ESTIMATE_STAT() { return l_ESTIMATE_STAT; }
	public List getList_UNOFFICIAL_RECEIPT_FLG() { return l_UNOFFICIAL_RECEIPT_FLG; }
	public List getList_ESTIMATE_DATE() { return l_ESTIMATE_DATE; }
	public List getList_ESTIMATE_AMOUNT() { return l_ESTIMATE_AMOUNT; }
	public List getList_ESTIMATE_AMOUNT_JPN() { return l_ESTIMATE_AMOUNT_JPN; }
	public List getList_ES_COMMET1() { return l_ES_COMMET1; }
	public List getList_ES_COMMET2() { return l_ES_COMMET2; }
	public List getList_ES_COMMET4() { return l_ES_COMMET4; }
	public List getList_ES_COMMET3() { return l_ES_COMMET3; }
	public List getList_ES_COMMET5() { return l_ES_COMMET5; }
	public List getList_ESREMARK1() { return l_ESREMARK1; }
	public List getList_ESREMARK2() { return l_ESREMARK2; }
	public List getList_ESREMARK3() { return l_ESREMARK3; }
	public List getList_ZIP_CD() { return l_ZIP_CD; }
	public List getList_ADDRESS_1() { return l_ADDRESS_1; }
	public List getList_ADDRESS_2() { return l_ADDRESS_2; }
	public List getList_TEL() { return l_TEL; }
	public List getList_MODIFY_COUNT_ES() { return l_MODIFY_COUNT_ES; }
	public List getList_l_DETAL_NO() { return l_l_DETAL_NO; }
	public List getList_l_ESTIMATE_TYP() { return l_l_ESTIMATE_TYP; }
	public List getList_l_CUST_ITEM_CD() { return l_l_CUST_ITEM_CD; }
	public List getList_l_ITEM_NAME() { return l_l_ITEM_NAME; }
	public List getList_l_DESINATED_DLV_DATE() { return l_l_DESINATED_DLV_DATE; }
	public List getList_l_ESTIMATE_QTY() { return l_l_ESTIMATE_QTY; }
	public List getList_l_UNIT_CD() { return l_l_UNIT_CD; }
	public List getList_l_UNIT_PRICE() { return l_l_UNIT_PRICE; }
	public List getList_l_DISCOUNT_PRICE() { return l_l_DISCOUNT_PRICE; }
	public List getList_l_ESTIMATE_UNIT_PRICE() { return l_l_ESTIMATE_UNIT_PRICE; }
	public List getList_l_AMOUNT() { return l_l_AMOUNT; }
	public List getList_l_DISCOUNT_AMOUNT() { return l_l_DISCOUNT_AMOUNT; }
	public List getList_l_ESTIMATE_AMOUNT() { return l_l_ESTIMATE_AMOUNT; }
	public List getList_l_ESTIMATE_AMOUNT_JPN() { return l_l_ESTIMATE_AMOUNT_JPN; }
	public List getList_l_ESTIMATE_GAIN() { return l_l_ESTIMATE_GAIN; }
	public List getList_l_ES_COST_MATERIAL() { return l_l_ES_COST_MATERIAL; }
	public List getList_l_ES_COST_PROCESS() { return l_l_ES_COST_PROCESS; }
	public List getList_l_ES_COST_OUTSOUCE() { return l_l_ES_COST_OUTSOUCE; }
	public List getList_l_ES_COST_ETC() { return l_l_ES_COST_ETC; }
	public List getList_l_ES_COST_SERVICE() { return l_l_ES_COST_SERVICE; }
	public List getList_l_ES_COST_ALL() { return l_l_ES_COST_ALL; }
	public List getList_l_SPEC_CLASS1_TYP() { return l_l_SPEC_CLASS1_TYP; }
	public List getList_l_SPEC_CLASS2_TYP() { return l_l_SPEC_CLASS2_TYP; }
	public List getList_l_SPEC_SELECT1_TYP() { return l_l_SPEC_SELECT1_TYP; }
	public List getList_l_SPEC_SELECT2_TYP() { return l_l_SPEC_SELECT2_TYP; }
	public List getList_l_SPEC_SELECT3_TYP() { return l_l_SPEC_SELECT3_TYP; }
	public List getList_l_SPEC_SELECT4_TYP() { return l_l_SPEC_SELECT4_TYP; }
	public List getList_l_REMARKS() { return l_l_REMARKS; }
	public List getList_l_UNIT_COST() { return l_l_UNIT_COST; }
	public List getList_l_CUST_ITEM_NAME() { return l_l_CUST_ITEM_NAME; }
	public List getList_h_MAX_DETAL_NO() { return l_h_MAX_DETAL_NO; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }
	public List getList_BUSINESS_DATE() { return l_BUSINESS_DATE; }
	public List getList_HOME_CUR_CD() { return l_HOME_CUR_CD; }
	public List getList_QUOTE_CUST_CD() { return l_QUOTE_CUST_CD; }
	public List getList_QUOTE_CUR_CD() { return l_QUOTE_CUR_CD; }
	public List getList_QUOTE_CUR_UNIT() { return l_QUOTE_CUR_UNIT; }
	public List getList_QUOTE_PROJECT_CD() { return l_QUOTE_PROJECT_CD; }
	public List getList_UNIT_QTY_TYP() { return l_UNIT_QTY_TYP; }
	public List getList_UNIT_COST() { return l_UNIT_COST; }
	public List getList_ESTIMATE_NO() { return l_ESTIMATE_NO; }
	public List getList_UNOFFICIAL_RECEIPT_FLAG() { return l_UNOFFICIAL_RECEIPT_FLAG; }
	public List getList_ESTIMATE_ST() { return l_ESTIMATE_ST; }
	public List getList_USER() { return l_USER; }
	public List getList_PROGRAM_NAME() { return l_PROGRAM_NAME; }
	public List getList_h_ESTIMATE_ST() { return l_h_ESTIMATE_ST; }

	public void setl_CUR_UNIT(String val) { m_l_CUR_UNIT = val; }
	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setl_FLAG(String val) { m_l_FLAG = val; }
	public void setQUOTE_ESTIMATE_NO(String val) { m_QUOTE_ESTIMATE_NO = val; }
	public void setl_ESTIMATE_NAME(String val) { m_l_ESTIMATE_NAME = val; }
	public void setl_SPEC_CLASS1_NAME(String val) { m_l_SPEC_CLASS1_NAME = val; }
	public void setl_SPEC_CLASS2_NAME(String val) { m_l_SPEC_CLASS2_NAME = val; }
	public void setl_SPEC_SELECT1_NAME(String val) { m_l_SPEC_SELECT1_NAME = val; }
	public void setl_SPEC_SELECT2_NAME(String val) { m_l_SPEC_SELECT2_NAME = val; }
	public void setl_SPEC_SELECT3_NAME(String val) { m_l_SPEC_SELECT3_NAME = val; }
	public void setl_SPEC_SELECT4_NAME(String val) { m_l_SPEC_SELECT4_NAME = val; }
	public void setl_ESTIMATE_TYP_name(String val) { m_l_ESTIMATE_TYP_name = val; }
	public void setl_ESTIMATE_TYP_val(String val) { m_l_ESTIMATE_TYP_val = val; }
	public void setl_SPEC_CLASS1_TYP_name(String val) { m_l_SPEC_CLASS1_TYP_name = val; }
	public void setl_SPEC_CLASS1_TYP_val(String val) { m_l_SPEC_CLASS1_TYP_val = val; }
	public void setl_SPEC_CLASS2_TYP_name(String val) { m_l_SPEC_CLASS2_TYP_name = val; }
	public void setl_SPEC_CLASS2_TYP_val(String val) { m_l_SPEC_CLASS2_TYP_val = val; }
	public void setl_SPEC_SELECT1_TYP_name(String val) { m_l_SPEC_SELECT1_TYP_name = val; }
	public void setl_SPEC_SELECT1_TYP_val(String val) { m_l_SPEC_SELECT1_TYP_val = val; }
	public void setl_SPEC_SELECT2_TYP_name(String val) { m_l_SPEC_SELECT2_TYP_name = val; }
	public void setl_SPEC_SELECT2_TYP_val(String val) { m_l_SPEC_SELECT2_TYP_val = val; }
	public void setl_SPEC_SELECT3_TYP_name(String val) { m_l_SPEC_SELECT3_TYP_name = val; }
	public void setl_SPEC_SELECT3_TYP_val(String val) { m_l_SPEC_SELECT3_TYP_val = val; }
	public void setl_SPEC_SELECT4_TYP_name(String val) { m_l_SPEC_SELECT4_TYP_name = val; }
	public void setl_SPEC_SELECT4_TYP_val(String val) { m_l_SPEC_SELECT4_TYP_val = val; }
	public void setLIST_CNT(String val) { m_LIST_CNT = val; }
	public void seth_ESTIMATE_NO(String val) { m_h_ESTIMATE_NO = val; }
	public void seth_UNOFFICIAL_RECEIPT_FLAG(String val) { m_h_UNOFFICIAL_RECEIPT_FLAG = val; }
	public void seth_PROJECT_STAT(String val) { m_h_PROJECT_STAT = val; }
	public void seth_CALLBUTTON(String val) { m_h_CALLBUTTON = val; }
	public void setPROJECT_NAME(String val) { m_PROJECT_NAME = val; }
	public void seth_CUST_CD(String val) { m_h_CUST_CD = val; }
	public void setES_ORG_CD(String val) { m_ES_ORG_CD = val; }
	public void setES_USER_CD(String val) { m_ES_USER_CD = val; }
	public void setORG_NAME(String val) { m_ORG_NAME = val; }
	public void setUSER_NAME(String val) { m_USER_NAME = val; }
	public void setPROJECT_STAT(String val) { m_PROJECT_STAT = val; }
	public void setMODIFY_COUNT_PJ(String val) { m_MODIFY_COUNT_PJ = val; }
	public void setPROJECT_CD(String val) { m_PROJECT_CD = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setCUST_NAME(String val) { m_CUST_NAME = val; }
	public void seth_CUR_CD(String val) { m_h_CUR_CD = val; }
	public void setEXCH_TYP(String val) { m_EXCH_TYP = val; }
	public void setDETAIL_ROUND_TYP(String val) { m_DETAIL_ROUND_TYP = val; }
	public void setCUR_UNIT(String val) { m_CUR_UNIT = val; }
	public void seth_PROJECT_CD(String val) { m_h_PROJECT_CD = val; }
	public void setESTIMATE_STAT(String val) { m_ESTIMATE_STAT = val; }
	public void setUNOFFICIAL_RECEIPT_FLG(String val) { m_UNOFFICIAL_RECEIPT_FLG = val; }
	public void setESTIMATE_DATE(String val) { m_ESTIMATE_DATE = val; }
	public void setESTIMATE_AMOUNT(String val) { m_ESTIMATE_AMOUNT = val; }
	public void setESTIMATE_AMOUNT_JPN(String val) { m_ESTIMATE_AMOUNT_JPN = val; }
	public void setES_COMMET1(String val) { m_ES_COMMET1 = val; }
	public void setES_COMMET2(String val) { m_ES_COMMET2 = val; }
	public void setES_COMMET4(String val) { m_ES_COMMET4 = val; }
	public void setES_COMMET3(String val) { m_ES_COMMET3 = val; }
	public void setES_COMMET5(String val) { m_ES_COMMET5 = val; }
	public void setESREMARK1(String val) { m_ESREMARK1 = val; }
	public void setESREMARK2(String val) { m_ESREMARK2 = val; }
	public void setESREMARK3(String val) { m_ESREMARK3 = val; }
	public void setZIP_CD(String val) { m_ZIP_CD = val; }
	public void setADDRESS_1(String val) { m_ADDRESS_1 = val; }
	public void setADDRESS_2(String val) { m_ADDRESS_2 = val; }
	public void setTEL(String val) { m_TEL = val; }
	public void setMODIFY_COUNT_ES(String val) { m_MODIFY_COUNT_ES = val; }
	public void setl_DETAL_NO(String val) { m_l_DETAL_NO = val; }
	public void setl_ESTIMATE_TYP(String val) { m_l_ESTIMATE_TYP = val; }
	public void setl_CUST_ITEM_CD(String val) { m_l_CUST_ITEM_CD = val; }
	public void setl_ITEM_NAME(String val) { m_l_ITEM_NAME = val; }
	public void setl_DESINATED_DLV_DATE(String val) { m_l_DESINATED_DLV_DATE = val; }
	public void setl_ESTIMATE_QTY(String val) { m_l_ESTIMATE_QTY = val; }
	public void setl_UNIT_CD(String val) { m_l_UNIT_CD = val; }
	public void setl_UNIT_PRICE(String val) { m_l_UNIT_PRICE = val; }
	public void setl_DISCOUNT_PRICE(String val) { m_l_DISCOUNT_PRICE = val; }
	public void setl_ESTIMATE_UNIT_PRICE(String val) { m_l_ESTIMATE_UNIT_PRICE = val; }
	public void setl_AMOUNT(String val) { m_l_AMOUNT = val; }
	public void setl_DISCOUNT_AMOUNT(String val) { m_l_DISCOUNT_AMOUNT = val; }
	public void setl_ESTIMATE_AMOUNT(String val) { m_l_ESTIMATE_AMOUNT = val; }
	public void setl_ESTIMATE_AMOUNT_JPN(String val) { m_l_ESTIMATE_AMOUNT_JPN = val; }
	public void setl_ESTIMATE_GAIN(String val) { m_l_ESTIMATE_GAIN = val; }
	public void setl_ES_COST_MATERIAL(String val) { m_l_ES_COST_MATERIAL = val; }
	public void setl_ES_COST_PROCESS(String val) { m_l_ES_COST_PROCESS = val; }
	public void setl_ES_COST_OUTSOUCE(String val) { m_l_ES_COST_OUTSOUCE = val; }
	public void setl_ES_COST_ETC(String val) { m_l_ES_COST_ETC = val; }
	public void setl_ES_COST_SERVICE(String val) { m_l_ES_COST_SERVICE = val; }
	public void setl_ES_COST_ALL(String val) { m_l_ES_COST_ALL = val; }
	public void setl_SPEC_CLASS1_TYP(String val) { m_l_SPEC_CLASS1_TYP = val; }
	public void setl_SPEC_CLASS2_TYP(String val) { m_l_SPEC_CLASS2_TYP = val; }
	public void setl_SPEC_SELECT1_TYP(String val) { m_l_SPEC_SELECT1_TYP = val; }
	public void setl_SPEC_SELECT2_TYP(String val) { m_l_SPEC_SELECT2_TYP = val; }
	public void setl_SPEC_SELECT3_TYP(String val) { m_l_SPEC_SELECT3_TYP = val; }
	public void setl_SPEC_SELECT4_TYP(String val) { m_l_SPEC_SELECT4_TYP = val; }
	public void setl_REMARKS(String val) { m_l_REMARKS = val; }
	public void setl_UNIT_COST(String val) { m_l_UNIT_COST = val; }
	public void setl_CUST_ITEM_NAME(String val) { m_l_CUST_ITEM_NAME = val; }
	public void seth_MAX_DETAL_NO(String val) { m_h_MAX_DETAL_NO = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }
	public void setBUSINESS_DATE(String val) { m_BUSINESS_DATE = val; }
	public void setHOME_CUR_CD(String val) { m_HOME_CUR_CD = val; }
	public void setQUOTE_CUST_CD(String val) { m_QUOTE_CUST_CD = val; }
	public void setQUOTE_CUR_CD(String val) { m_QUOTE_CUR_CD = val; }
	public void setQUOTE_CUR_UNIT(String val) { m_QUOTE_CUR_UNIT = val; }
	public void setQUOTE_PROJECT_CD(String val) { m_QUOTE_PROJECT_CD = val; }
	public void setUNIT_QTY_TYP(String val) { m_UNIT_QTY_TYP = val; }
	public void setUNIT_COST(String val) { m_UNIT_COST = val; }
	public void setESTIMATE_NO(String val) { m_ESTIMATE_NO = val; }
	public void setUNOFFICIAL_RECEIPT_FLAG(String val) { m_UNOFFICIAL_RECEIPT_FLAG = val; }
	public void setESTIMATE_ST(String val) { m_ESTIMATE_ST = val; }
	public void setUSER(String val) { m_USER = val; }
	public void setPROGRAM_NAME(String val) { m_PROGRAM_NAME = val; }
	public void seth_ESTIMATE_ST(String val) { m_h_ESTIMATE_ST = val; }


	public void setList_l_CUR_UNIT(List list) { l_l_CUR_UNIT = list; }
	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_l_FLAG(List list) { l_l_FLAG = list; }
	public void setList_QUOTE_ESTIMATE_NO(List list) { l_QUOTE_ESTIMATE_NO = list; }
	public void setList_l_ESTIMATE_NAME(List list) { l_l_ESTIMATE_NAME = list; }
	public void setList_l_SPEC_CLASS1_NAME(List list) { l_l_SPEC_CLASS1_NAME = list; }
	public void setList_l_SPEC_CLASS2_NAME(List list) { l_l_SPEC_CLASS2_NAME = list; }
	public void setList_l_SPEC_SELECT1_NAME(List list) { l_l_SPEC_SELECT1_NAME = list; }
	public void setList_l_SPEC_SELECT2_NAME(List list) { l_l_SPEC_SELECT2_NAME = list; }
	public void setList_l_SPEC_SELECT3_NAME(List list) { l_l_SPEC_SELECT3_NAME = list; }
	public void setList_l_SPEC_SELECT4_NAME(List list) { l_l_SPEC_SELECT4_NAME = list; }
	public void setList_l_ESTIMATE_TYP_name(List list) { l_l_ESTIMATE_TYP_name = list; }
	public void setList_l_ESTIMATE_TYP_val(List list) { l_l_ESTIMATE_TYP_val = list; }
	public void setList_l_SPEC_CLASS1_TYP_name(List list) { l_l_SPEC_CLASS1_TYP_name = list; }
	public void setList_l_SPEC_CLASS1_TYP_val(List list) { l_l_SPEC_CLASS1_TYP_val = list; }
	public void setList_l_SPEC_CLASS2_TYP_name(List list) { l_l_SPEC_CLASS2_TYP_name = list; }
	public void setList_l_SPEC_CLASS2_TYP_val(List list) { l_l_SPEC_CLASS2_TYP_val = list; }
	public void setList_l_SPEC_SELECT1_TYP_name(List list) { l_l_SPEC_SELECT1_TYP_name = list; }
	public void setList_l_SPEC_SELECT1_TYP_val(List list) { l_l_SPEC_SELECT1_TYP_val = list; }
	public void setList_l_SPEC_SELECT2_TYP_name(List list) { l_l_SPEC_SELECT2_TYP_name = list; }
	public void setList_l_SPEC_SELECT2_TYP_val(List list) { l_l_SPEC_SELECT2_TYP_val = list; }
	public void setList_l_SPEC_SELECT3_TYP_name(List list) { l_l_SPEC_SELECT3_TYP_name = list; }
	public void setList_l_SPEC_SELECT3_TYP_val(List list) { l_l_SPEC_SELECT3_TYP_val = list; }
	public void setList_l_SPEC_SELECT4_TYP_name(List list) { l_l_SPEC_SELECT4_TYP_name = list; }
	public void setList_l_SPEC_SELECT4_TYP_val(List list) { l_l_SPEC_SELECT4_TYP_val = list; }
	public void setList_LIST_CNT(List list) { l_LIST_CNT = list; }
	public void setList_h_ESTIMATE_NO(List list) { l_h_ESTIMATE_NO = list; }
	public void setList_h_UNOFFICIAL_RECEIPT_FLAG(List list) { l_h_UNOFFICIAL_RECEIPT_FLAG = list; }
	public void setList_h_PROJECT_STAT(List list) { l_h_PROJECT_STAT = list; }
	public void setList_h_CALLBUTTON(List list) { l_h_CALLBUTTON = list; }
	public void setList_PROJECT_NAME(List list) { l_PROJECT_NAME = list; }
	public void setList_h_CUST_CD(List list) { l_h_CUST_CD = list; }
	public void setList_ES_ORG_CD(List list) { l_ES_ORG_CD = list; }
	public void setList_ES_USER_CD(List list) { l_ES_USER_CD = list; }
	public void setList_ORG_NAME(List list) { l_ORG_NAME = list; }
	public void setList_USER_NAME(List list) { l_USER_NAME = list; }
	public void setList_PROJECT_STAT(List list) { l_PROJECT_STAT = list; }
	public void setList_MODIFY_COUNT_PJ(List list) { l_MODIFY_COUNT_PJ = list; }
	public void setList_PROJECT_CD(List list) { l_PROJECT_CD = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_CUST_NAME(List list) { l_CUST_NAME = list; }
	public void setList_h_CUR_CD(List list) { l_h_CUR_CD = list; }
	public void setList_EXCH_TYP(List list) { l_EXCH_TYP = list; }
	public void setList_DETAIL_ROUND_TYP(List list) { l_DETAIL_ROUND_TYP = list; }
	public void setList_CUR_UNIT(List list) { l_CUR_UNIT = list; }
	public void setList_h_PROJECT_CD(List list) { l_h_PROJECT_CD = list; }
	public void setList_ESTIMATE_STAT(List list) { l_ESTIMATE_STAT = list; }
	public void setList_UNOFFICIAL_RECEIPT_FLG(List list) { l_UNOFFICIAL_RECEIPT_FLG = list; }
	public void setList_ESTIMATE_DATE(List list) { l_ESTIMATE_DATE = list; }
	public void setList_ESTIMATE_AMOUNT(List list) { l_ESTIMATE_AMOUNT = list; }
	public void setList_ESTIMATE_AMOUNT_JPN(List list) { l_ESTIMATE_AMOUNT_JPN = list; }
	public void setList_ES_COMMET1(List list) { l_ES_COMMET1 = list; }
	public void setList_ES_COMMET2(List list) { l_ES_COMMET2 = list; }
	public void setList_ES_COMMET4(List list) { l_ES_COMMET4 = list; }
	public void setList_ES_COMMET3(List list) { l_ES_COMMET3 = list; }
	public void setList_ES_COMMET5(List list) { l_ES_COMMET5 = list; }
	public void setList_ESREMARK1(List list) { l_ESREMARK1 = list; }
	public void setList_ESREMARK2(List list) { l_ESREMARK2 = list; }
	public void setList_ESREMARK3(List list) { l_ESREMARK3 = list; }
	public void setList_ZIP_CD(List list) { l_ZIP_CD = list; }
	public void setList_ADDRESS_1(List list) { l_ADDRESS_1 = list; }
	public void setList_ADDRESS_2(List list) { l_ADDRESS_2 = list; }
	public void setList_TEL(List list) { l_TEL = list; }
	public void setList_MODIFY_COUNT_ES(List list) { l_MODIFY_COUNT_ES = list; }
	public void setList_l_DETAL_NO(List list) { l_l_DETAL_NO = list; }
	public void setList_l_ESTIMATE_TYP(List list) { l_l_ESTIMATE_TYP = list; }
	public void setList_l_CUST_ITEM_CD(List list) { l_l_CUST_ITEM_CD = list; }
	public void setList_l_ITEM_NAME(List list) { l_l_ITEM_NAME = list; }
	public void setList_l_DESINATED_DLV_DATE(List list) { l_l_DESINATED_DLV_DATE = list; }
	public void setList_l_ESTIMATE_QTY(List list) { l_l_ESTIMATE_QTY = list; }
	public void setList_l_UNIT_CD(List list) { l_l_UNIT_CD = list; }
	public void setList_l_UNIT_PRICE(List list) { l_l_UNIT_PRICE = list; }
	public void setList_l_DISCOUNT_PRICE(List list) { l_l_DISCOUNT_PRICE = list; }
	public void setList_l_ESTIMATE_UNIT_PRICE(List list) { l_l_ESTIMATE_UNIT_PRICE = list; }
	public void setList_l_AMOUNT(List list) { l_l_AMOUNT = list; }
	public void setList_l_DISCOUNT_AMOUNT(List list) { l_l_DISCOUNT_AMOUNT = list; }
	public void setList_l_ESTIMATE_AMOUNT(List list) { l_l_ESTIMATE_AMOUNT = list; }
	public void setList_l_ESTIMATE_AMOUNT_JPN(List list) { l_l_ESTIMATE_AMOUNT_JPN = list; }
	public void setList_l_ESTIMATE_GAIN(List list) { l_l_ESTIMATE_GAIN = list; }
	public void setList_l_ES_COST_MATERIAL(List list) { l_l_ES_COST_MATERIAL = list; }
	public void setList_l_ES_COST_PROCESS(List list) { l_l_ES_COST_PROCESS = list; }
	public void setList_l_ES_COST_OUTSOUCE(List list) { l_l_ES_COST_OUTSOUCE = list; }
	public void setList_l_ES_COST_ETC(List list) { l_l_ES_COST_ETC = list; }
	public void setList_l_ES_COST_SERVICE(List list) { l_l_ES_COST_SERVICE = list; }
	public void setList_l_ES_COST_ALL(List list) { l_l_ES_COST_ALL = list; }
	public void setList_l_SPEC_CLASS1_TYP(List list) { l_l_SPEC_CLASS1_TYP = list; }
	public void setList_l_SPEC_CLASS2_TYP(List list) { l_l_SPEC_CLASS2_TYP = list; }
	public void setList_l_SPEC_SELECT1_TYP(List list) { l_l_SPEC_SELECT1_TYP = list; }
	public void setList_l_SPEC_SELECT2_TYP(List list) { l_l_SPEC_SELECT2_TYP = list; }
	public void setList_l_SPEC_SELECT3_TYP(List list) { l_l_SPEC_SELECT3_TYP = list; }
	public void setList_l_SPEC_SELECT4_TYP(List list) { l_l_SPEC_SELECT4_TYP = list; }
	public void setList_l_REMARKS(List list) { l_l_REMARKS = list; }
	public void setList_l_UNIT_COST(List list) { l_l_UNIT_COST = list; }
	public void setList_l_CUST_ITEM_NAME(List list) { l_l_CUST_ITEM_NAME = list; }
	public void setList_h_MAX_DETAL_NO(List list) { l_h_MAX_DETAL_NO = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }
	public void setList_BUSINESS_DATE(List list) { l_BUSINESS_DATE = list; }
	public void setList_HOME_CUR_CD(List list) { l_HOME_CUR_CD = list; }
	public void setList_QUOTE_CUST_CD(List list) { l_QUOTE_CUST_CD = list; }
	public void setList_QUOTE_CUR_CD(List list) { l_QUOTE_CUR_CD = list; }
	public void setList_QUOTE_CUR_UNIT(List list) { l_QUOTE_CUR_UNIT = list; }
	public void setList_QUOTE_PROJECT_CD(List list) { l_QUOTE_PROJECT_CD = list; }
	public void setList_UNIT_QTY_TYP(List list) { l_UNIT_QTY_TYP = list; }
	public void setList_UNIT_COST(List list) { l_UNIT_COST = list; }
	public void setList_ESTIMATE_NO(List list) { l_ESTIMATE_NO = list; }
	public void setList_UNOFFICIAL_RECEIPT_FLAG(List list) { l_UNOFFICIAL_RECEIPT_FLAG = list; }
	public void setList_ESTIMATE_ST(List list) { l_ESTIMATE_ST = list; }
	public void setList_USER(List list) { l_USER = list; }
	public void setList_PROGRAM_NAME(List list) { l_PROGRAM_NAME = list; }
	public void setList_h_ESTIMATE_ST(List list) { l_h_ESTIMATE_ST = list; }

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
			l_l_CUR_UNIT.add(((KM0020010Struct) list.get(i)).getl_CUR_UNIT());
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
			l_DOWNLOAD_FILE.add(((KM0020010Struct) list.get(i)).getDOWNLOAD_FILE());
		}
		return size;
	}
	public int setL2L_l_FLAG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_FLAG == null) {
			l_l_FLAG = new ArrayList();
		} else {
			l_l_FLAG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_FLAG.add(((KM0020010Struct) list.get(i)).getl_FLAG());
		}
		return size;
	}
	public int setL2L_QUOTE_ESTIMATE_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_QUOTE_ESTIMATE_NO == null) {
			l_QUOTE_ESTIMATE_NO = new ArrayList();
		} else {
			l_QUOTE_ESTIMATE_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_QUOTE_ESTIMATE_NO.add(((KM0020010Struct) list.get(i)).getQUOTE_ESTIMATE_NO());
		}
		return size;
	}
	public int setL2L_l_ESTIMATE_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ESTIMATE_NAME == null) {
			l_l_ESTIMATE_NAME = new ArrayList();
		} else {
			l_l_ESTIMATE_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ESTIMATE_NAME.add(((KM0020010Struct) list.get(i)).getl_ESTIMATE_NAME());
		}
		return size;
	}
	public int setL2L_l_SPEC_CLASS1_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SPEC_CLASS1_NAME == null) {
			l_l_SPEC_CLASS1_NAME = new ArrayList();
		} else {
			l_l_SPEC_CLASS1_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SPEC_CLASS1_NAME.add(((KM0020010Struct) list.get(i)).getl_SPEC_CLASS1_NAME());
		}
		return size;
	}
	public int setL2L_l_SPEC_CLASS2_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SPEC_CLASS2_NAME == null) {
			l_l_SPEC_CLASS2_NAME = new ArrayList();
		} else {
			l_l_SPEC_CLASS2_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SPEC_CLASS2_NAME.add(((KM0020010Struct) list.get(i)).getl_SPEC_CLASS2_NAME());
		}
		return size;
	}
	public int setL2L_l_SPEC_SELECT1_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SPEC_SELECT1_NAME == null) {
			l_l_SPEC_SELECT1_NAME = new ArrayList();
		} else {
			l_l_SPEC_SELECT1_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SPEC_SELECT1_NAME.add(((KM0020010Struct) list.get(i)).getl_SPEC_SELECT1_NAME());
		}
		return size;
	}
	public int setL2L_l_SPEC_SELECT2_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SPEC_SELECT2_NAME == null) {
			l_l_SPEC_SELECT2_NAME = new ArrayList();
		} else {
			l_l_SPEC_SELECT2_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SPEC_SELECT2_NAME.add(((KM0020010Struct) list.get(i)).getl_SPEC_SELECT2_NAME());
		}
		return size;
	}
	public int setL2L_l_SPEC_SELECT3_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SPEC_SELECT3_NAME == null) {
			l_l_SPEC_SELECT3_NAME = new ArrayList();
		} else {
			l_l_SPEC_SELECT3_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SPEC_SELECT3_NAME.add(((KM0020010Struct) list.get(i)).getl_SPEC_SELECT3_NAME());
		}
		return size;
	}
	public int setL2L_l_SPEC_SELECT4_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SPEC_SELECT4_NAME == null) {
			l_l_SPEC_SELECT4_NAME = new ArrayList();
		} else {
			l_l_SPEC_SELECT4_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SPEC_SELECT4_NAME.add(((KM0020010Struct) list.get(i)).getl_SPEC_SELECT4_NAME());
		}
		return size;
	}
	public int setL2L_l_ESTIMATE_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ESTIMATE_TYP_name == null) {
			l_l_ESTIMATE_TYP_name = new ArrayList();
		} else {
			l_l_ESTIMATE_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ESTIMATE_TYP_name.add(((KM0020010Struct) list.get(i)).getl_ESTIMATE_TYP_name());
		}
		return size;
	}
	public int setL2L_l_ESTIMATE_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ESTIMATE_TYP_val == null) {
			l_l_ESTIMATE_TYP_val = new ArrayList();
		} else {
			l_l_ESTIMATE_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ESTIMATE_TYP_val.add(((KM0020010Struct) list.get(i)).getl_ESTIMATE_TYP_val());
		}
		return size;
	}
	public int setL2L_l_SPEC_CLASS1_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SPEC_CLASS1_TYP_name == null) {
			l_l_SPEC_CLASS1_TYP_name = new ArrayList();
		} else {
			l_l_SPEC_CLASS1_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SPEC_CLASS1_TYP_name.add(((KM0020010Struct) list.get(i)).getl_SPEC_CLASS1_TYP_name());
		}
		return size;
	}
	public int setL2L_l_SPEC_CLASS1_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SPEC_CLASS1_TYP_val == null) {
			l_l_SPEC_CLASS1_TYP_val = new ArrayList();
		} else {
			l_l_SPEC_CLASS1_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SPEC_CLASS1_TYP_val.add(((KM0020010Struct) list.get(i)).getl_SPEC_CLASS1_TYP_val());
		}
		return size;
	}
	public int setL2L_l_SPEC_CLASS2_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SPEC_CLASS2_TYP_name == null) {
			l_l_SPEC_CLASS2_TYP_name = new ArrayList();
		} else {
			l_l_SPEC_CLASS2_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SPEC_CLASS2_TYP_name.add(((KM0020010Struct) list.get(i)).getl_SPEC_CLASS2_TYP_name());
		}
		return size;
	}
	public int setL2L_l_SPEC_CLASS2_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SPEC_CLASS2_TYP_val == null) {
			l_l_SPEC_CLASS2_TYP_val = new ArrayList();
		} else {
			l_l_SPEC_CLASS2_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SPEC_CLASS2_TYP_val.add(((KM0020010Struct) list.get(i)).getl_SPEC_CLASS2_TYP_val());
		}
		return size;
	}
	public int setL2L_l_SPEC_SELECT1_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SPEC_SELECT1_TYP_name == null) {
			l_l_SPEC_SELECT1_TYP_name = new ArrayList();
		} else {
			l_l_SPEC_SELECT1_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SPEC_SELECT1_TYP_name.add(((KM0020010Struct) list.get(i)).getl_SPEC_SELECT1_TYP_name());
		}
		return size;
	}
	public int setL2L_l_SPEC_SELECT1_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SPEC_SELECT1_TYP_val == null) {
			l_l_SPEC_SELECT1_TYP_val = new ArrayList();
		} else {
			l_l_SPEC_SELECT1_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SPEC_SELECT1_TYP_val.add(((KM0020010Struct) list.get(i)).getl_SPEC_SELECT1_TYP_val());
		}
		return size;
	}
	public int setL2L_l_SPEC_SELECT2_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SPEC_SELECT2_TYP_name == null) {
			l_l_SPEC_SELECT2_TYP_name = new ArrayList();
		} else {
			l_l_SPEC_SELECT2_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SPEC_SELECT2_TYP_name.add(((KM0020010Struct) list.get(i)).getl_SPEC_SELECT2_TYP_name());
		}
		return size;
	}
	public int setL2L_l_SPEC_SELECT2_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SPEC_SELECT2_TYP_val == null) {
			l_l_SPEC_SELECT2_TYP_val = new ArrayList();
		} else {
			l_l_SPEC_SELECT2_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SPEC_SELECT2_TYP_val.add(((KM0020010Struct) list.get(i)).getl_SPEC_SELECT2_TYP_val());
		}
		return size;
	}
	public int setL2L_l_SPEC_SELECT3_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SPEC_SELECT3_TYP_name == null) {
			l_l_SPEC_SELECT3_TYP_name = new ArrayList();
		} else {
			l_l_SPEC_SELECT3_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SPEC_SELECT3_TYP_name.add(((KM0020010Struct) list.get(i)).getl_SPEC_SELECT3_TYP_name());
		}
		return size;
	}
	public int setL2L_l_SPEC_SELECT3_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SPEC_SELECT3_TYP_val == null) {
			l_l_SPEC_SELECT3_TYP_val = new ArrayList();
		} else {
			l_l_SPEC_SELECT3_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SPEC_SELECT3_TYP_val.add(((KM0020010Struct) list.get(i)).getl_SPEC_SELECT3_TYP_val());
		}
		return size;
	}
	public int setL2L_l_SPEC_SELECT4_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SPEC_SELECT4_TYP_name == null) {
			l_l_SPEC_SELECT4_TYP_name = new ArrayList();
		} else {
			l_l_SPEC_SELECT4_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SPEC_SELECT4_TYP_name.add(((KM0020010Struct) list.get(i)).getl_SPEC_SELECT4_TYP_name());
		}
		return size;
	}
	public int setL2L_l_SPEC_SELECT4_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SPEC_SELECT4_TYP_val == null) {
			l_l_SPEC_SELECT4_TYP_val = new ArrayList();
		} else {
			l_l_SPEC_SELECT4_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SPEC_SELECT4_TYP_val.add(((KM0020010Struct) list.get(i)).getl_SPEC_SELECT4_TYP_val());
		}
		return size;
	}
	public int setL2L_LIST_CNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LIST_CNT == null) {
			l_LIST_CNT = new ArrayList();
		} else {
			l_LIST_CNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LIST_CNT.add(((KM0020010Struct) list.get(i)).getLIST_CNT());
		}
		return size;
	}
	public int setL2L_h_ESTIMATE_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ESTIMATE_NO == null) {
			l_h_ESTIMATE_NO = new ArrayList();
		} else {
			l_h_ESTIMATE_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ESTIMATE_NO.add(((KM0020010Struct) list.get(i)).geth_ESTIMATE_NO());
		}
		return size;
	}
	public int setL2L_h_UNOFFICIAL_RECEIPT_FLAG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_UNOFFICIAL_RECEIPT_FLAG == null) {
			l_h_UNOFFICIAL_RECEIPT_FLAG = new ArrayList();
		} else {
			l_h_UNOFFICIAL_RECEIPT_FLAG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_UNOFFICIAL_RECEIPT_FLAG.add(((KM0020010Struct) list.get(i)).geth_UNOFFICIAL_RECEIPT_FLAG());
		}
		return size;
	}
	public int setL2L_h_PROJECT_STAT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PROJECT_STAT == null) {
			l_h_PROJECT_STAT = new ArrayList();
		} else {
			l_h_PROJECT_STAT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PROJECT_STAT.add(((KM0020010Struct) list.get(i)).geth_PROJECT_STAT());
		}
		return size;
	}
	public int setL2L_h_CALLBUTTON(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_CALLBUTTON == null) {
			l_h_CALLBUTTON = new ArrayList();
		} else {
			l_h_CALLBUTTON.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_CALLBUTTON.add(((KM0020010Struct) list.get(i)).geth_CALLBUTTON());
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
			l_PROJECT_NAME.add(((KM0020010Struct) list.get(i)).getPROJECT_NAME());
		}
		return size;
	}
	public int setL2L_h_CUST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_CUST_CD == null) {
			l_h_CUST_CD = new ArrayList();
		} else {
			l_h_CUST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_CUST_CD.add(((KM0020010Struct) list.get(i)).geth_CUST_CD());
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
			l_ES_ORG_CD.add(((KM0020010Struct) list.get(i)).getES_ORG_CD());
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
			l_ES_USER_CD.add(((KM0020010Struct) list.get(i)).getES_USER_CD());
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
			l_ORG_NAME.add(((KM0020010Struct) list.get(i)).getORG_NAME());
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
			l_USER_NAME.add(((KM0020010Struct) list.get(i)).getUSER_NAME());
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
			l_PROJECT_STAT.add(((KM0020010Struct) list.get(i)).getPROJECT_STAT());
		}
		return size;
	}
	public int setL2L_MODIFY_COUNT_PJ(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MODIFY_COUNT_PJ == null) {
			l_MODIFY_COUNT_PJ = new ArrayList();
		} else {
			l_MODIFY_COUNT_PJ.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MODIFY_COUNT_PJ.add(((KM0020010Struct) list.get(i)).getMODIFY_COUNT_PJ());
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
			l_PROJECT_CD.add(((KM0020010Struct) list.get(i)).getPROJECT_CD());
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
			l_COMPANY_CD.add(((KM0020010Struct) list.get(i)).getCOMPANY_CD());
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
			l_CUST_NAME.add(((KM0020010Struct) list.get(i)).getCUST_NAME());
		}
		return size;
	}
	public int setL2L_h_CUR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_CUR_CD == null) {
			l_h_CUR_CD = new ArrayList();
		} else {
			l_h_CUR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_CUR_CD.add(((KM0020010Struct) list.get(i)).geth_CUR_CD());
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
			l_EXCH_TYP.add(((KM0020010Struct) list.get(i)).getEXCH_TYP());
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
			l_DETAIL_ROUND_TYP.add(((KM0020010Struct) list.get(i)).getDETAIL_ROUND_TYP());
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
			l_CUR_UNIT.add(((KM0020010Struct) list.get(i)).getCUR_UNIT());
		}
		return size;
	}
	public int setL2L_h_PROJECT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PROJECT_CD == null) {
			l_h_PROJECT_CD = new ArrayList();
		} else {
			l_h_PROJECT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PROJECT_CD.add(((KM0020010Struct) list.get(i)).geth_PROJECT_CD());
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
			l_ESTIMATE_STAT.add(((KM0020010Struct) list.get(i)).getESTIMATE_STAT());
		}
		return size;
	}
	public int setL2L_UNOFFICIAL_RECEIPT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNOFFICIAL_RECEIPT_FLG == null) {
			l_UNOFFICIAL_RECEIPT_FLG = new ArrayList();
		} else {
			l_UNOFFICIAL_RECEIPT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNOFFICIAL_RECEIPT_FLG.add(((KM0020010Struct) list.get(i)).getUNOFFICIAL_RECEIPT_FLG());
		}
		return size;
	}
	public int setL2L_ESTIMATE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ESTIMATE_DATE == null) {
			l_ESTIMATE_DATE = new ArrayList();
		} else {
			l_ESTIMATE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ESTIMATE_DATE.add(((KM0020010Struct) list.get(i)).getESTIMATE_DATE());
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
			l_ESTIMATE_AMOUNT.add(((KM0020010Struct) list.get(i)).getESTIMATE_AMOUNT());
		}
		return size;
	}
	public int setL2L_ESTIMATE_AMOUNT_JPN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ESTIMATE_AMOUNT_JPN == null) {
			l_ESTIMATE_AMOUNT_JPN = new ArrayList();
		} else {
			l_ESTIMATE_AMOUNT_JPN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ESTIMATE_AMOUNT_JPN.add(((KM0020010Struct) list.get(i)).getESTIMATE_AMOUNT_JPN());
		}
		return size;
	}
	public int setL2L_ES_COMMET1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ES_COMMET1 == null) {
			l_ES_COMMET1 = new ArrayList();
		} else {
			l_ES_COMMET1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ES_COMMET1.add(((KM0020010Struct) list.get(i)).getES_COMMET1());
		}
		return size;
	}
	public int setL2L_ES_COMMET2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ES_COMMET2 == null) {
			l_ES_COMMET2 = new ArrayList();
		} else {
			l_ES_COMMET2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ES_COMMET2.add(((KM0020010Struct) list.get(i)).getES_COMMET2());
		}
		return size;
	}
	public int setL2L_ES_COMMET4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ES_COMMET4 == null) {
			l_ES_COMMET4 = new ArrayList();
		} else {
			l_ES_COMMET4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ES_COMMET4.add(((KM0020010Struct) list.get(i)).getES_COMMET4());
		}
		return size;
	}
	public int setL2L_ES_COMMET3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ES_COMMET3 == null) {
			l_ES_COMMET3 = new ArrayList();
		} else {
			l_ES_COMMET3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ES_COMMET3.add(((KM0020010Struct) list.get(i)).getES_COMMET3());
		}
		return size;
	}
	public int setL2L_ES_COMMET5(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ES_COMMET5 == null) {
			l_ES_COMMET5 = new ArrayList();
		} else {
			l_ES_COMMET5.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ES_COMMET5.add(((KM0020010Struct) list.get(i)).getES_COMMET5());
		}
		return size;
	}
	public int setL2L_ESREMARK1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ESREMARK1 == null) {
			l_ESREMARK1 = new ArrayList();
		} else {
			l_ESREMARK1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ESREMARK1.add(((KM0020010Struct) list.get(i)).getESREMARK1());
		}
		return size;
	}
	public int setL2L_ESREMARK2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ESREMARK2 == null) {
			l_ESREMARK2 = new ArrayList();
		} else {
			l_ESREMARK2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ESREMARK2.add(((KM0020010Struct) list.get(i)).getESREMARK2());
		}
		return size;
	}
	public int setL2L_ESREMARK3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ESREMARK3 == null) {
			l_ESREMARK3 = new ArrayList();
		} else {
			l_ESREMARK3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ESREMARK3.add(((KM0020010Struct) list.get(i)).getESREMARK3());
		}
		return size;
	}
	public int setL2L_ZIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ZIP_CD == null) {
			l_ZIP_CD = new ArrayList();
		} else {
			l_ZIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ZIP_CD.add(((KM0020010Struct) list.get(i)).getZIP_CD());
		}
		return size;
	}
	public int setL2L_ADDRESS_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ADDRESS_1 == null) {
			l_ADDRESS_1 = new ArrayList();
		} else {
			l_ADDRESS_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ADDRESS_1.add(((KM0020010Struct) list.get(i)).getADDRESS_1());
		}
		return size;
	}
	public int setL2L_ADDRESS_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ADDRESS_2 == null) {
			l_ADDRESS_2 = new ArrayList();
		} else {
			l_ADDRESS_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ADDRESS_2.add(((KM0020010Struct) list.get(i)).getADDRESS_2());
		}
		return size;
	}
	public int setL2L_TEL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TEL == null) {
			l_TEL = new ArrayList();
		} else {
			l_TEL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TEL.add(((KM0020010Struct) list.get(i)).getTEL());
		}
		return size;
	}
	public int setL2L_MODIFY_COUNT_ES(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MODIFY_COUNT_ES == null) {
			l_MODIFY_COUNT_ES = new ArrayList();
		} else {
			l_MODIFY_COUNT_ES.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MODIFY_COUNT_ES.add(((KM0020010Struct) list.get(i)).getMODIFY_COUNT_ES());
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
			l_l_DETAL_NO.add(((KM0020010Struct) list.get(i)).getl_DETAL_NO());
		}
		return size;
	}
	public int setL2L_l_ESTIMATE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ESTIMATE_TYP == null) {
			l_l_ESTIMATE_TYP = new ArrayList();
		} else {
			l_l_ESTIMATE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ESTIMATE_TYP.add(((KM0020010Struct) list.get(i)).getl_ESTIMATE_TYP());
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
			l_l_CUST_ITEM_CD.add(((KM0020010Struct) list.get(i)).getl_CUST_ITEM_CD());
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
			l_l_ITEM_NAME.add(((KM0020010Struct) list.get(i)).getl_ITEM_NAME());
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
			l_l_DESINATED_DLV_DATE.add(((KM0020010Struct) list.get(i)).getl_DESINATED_DLV_DATE());
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
			l_l_ESTIMATE_QTY.add(((KM0020010Struct) list.get(i)).getl_ESTIMATE_QTY());
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
			l_l_UNIT_CD.add(((KM0020010Struct) list.get(i)).getl_UNIT_CD());
		}
		return size;
	}
	public int setL2L_l_UNIT_PRICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_UNIT_PRICE == null) {
			l_l_UNIT_PRICE = new ArrayList();
		} else {
			l_l_UNIT_PRICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_UNIT_PRICE.add(((KM0020010Struct) list.get(i)).getl_UNIT_PRICE());
		}
		return size;
	}
	public int setL2L_l_DISCOUNT_PRICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DISCOUNT_PRICE == null) {
			l_l_DISCOUNT_PRICE = new ArrayList();
		} else {
			l_l_DISCOUNT_PRICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DISCOUNT_PRICE.add(((KM0020010Struct) list.get(i)).getl_DISCOUNT_PRICE());
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
			l_l_ESTIMATE_UNIT_PRICE.add(((KM0020010Struct) list.get(i)).getl_ESTIMATE_UNIT_PRICE());
		}
		return size;
	}
	public int setL2L_l_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_AMOUNT == null) {
			l_l_AMOUNT = new ArrayList();
		} else {
			l_l_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_AMOUNT.add(((KM0020010Struct) list.get(i)).getl_AMOUNT());
		}
		return size;
	}
	public int setL2L_l_DISCOUNT_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DISCOUNT_AMOUNT == null) {
			l_l_DISCOUNT_AMOUNT = new ArrayList();
		} else {
			l_l_DISCOUNT_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DISCOUNT_AMOUNT.add(((KM0020010Struct) list.get(i)).getl_DISCOUNT_AMOUNT());
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
			l_l_ESTIMATE_AMOUNT.add(((KM0020010Struct) list.get(i)).getl_ESTIMATE_AMOUNT());
		}
		return size;
	}
	public int setL2L_l_ESTIMATE_AMOUNT_JPN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ESTIMATE_AMOUNT_JPN == null) {
			l_l_ESTIMATE_AMOUNT_JPN = new ArrayList();
		} else {
			l_l_ESTIMATE_AMOUNT_JPN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ESTIMATE_AMOUNT_JPN.add(((KM0020010Struct) list.get(i)).getl_ESTIMATE_AMOUNT_JPN());
		}
		return size;
	}
	public int setL2L_l_ESTIMATE_GAIN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ESTIMATE_GAIN == null) {
			l_l_ESTIMATE_GAIN = new ArrayList();
		} else {
			l_l_ESTIMATE_GAIN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ESTIMATE_GAIN.add(((KM0020010Struct) list.get(i)).getl_ESTIMATE_GAIN());
		}
		return size;
	}
	public int setL2L_l_ES_COST_MATERIAL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ES_COST_MATERIAL == null) {
			l_l_ES_COST_MATERIAL = new ArrayList();
		} else {
			l_l_ES_COST_MATERIAL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ES_COST_MATERIAL.add(((KM0020010Struct) list.get(i)).getl_ES_COST_MATERIAL());
		}
		return size;
	}
	public int setL2L_l_ES_COST_PROCESS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ES_COST_PROCESS == null) {
			l_l_ES_COST_PROCESS = new ArrayList();
		} else {
			l_l_ES_COST_PROCESS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ES_COST_PROCESS.add(((KM0020010Struct) list.get(i)).getl_ES_COST_PROCESS());
		}
		return size;
	}
	public int setL2L_l_ES_COST_OUTSOUCE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ES_COST_OUTSOUCE == null) {
			l_l_ES_COST_OUTSOUCE = new ArrayList();
		} else {
			l_l_ES_COST_OUTSOUCE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ES_COST_OUTSOUCE.add(((KM0020010Struct) list.get(i)).getl_ES_COST_OUTSOUCE());
		}
		return size;
	}
	public int setL2L_l_ES_COST_ETC(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ES_COST_ETC == null) {
			l_l_ES_COST_ETC = new ArrayList();
		} else {
			l_l_ES_COST_ETC.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ES_COST_ETC.add(((KM0020010Struct) list.get(i)).getl_ES_COST_ETC());
		}
		return size;
	}
	public int setL2L_l_ES_COST_SERVICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ES_COST_SERVICE == null) {
			l_l_ES_COST_SERVICE = new ArrayList();
		} else {
			l_l_ES_COST_SERVICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ES_COST_SERVICE.add(((KM0020010Struct) list.get(i)).getl_ES_COST_SERVICE());
		}
		return size;
	}
	public int setL2L_l_ES_COST_ALL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ES_COST_ALL == null) {
			l_l_ES_COST_ALL = new ArrayList();
		} else {
			l_l_ES_COST_ALL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ES_COST_ALL.add(((KM0020010Struct) list.get(i)).getl_ES_COST_ALL());
		}
		return size;
	}
	public int setL2L_l_SPEC_CLASS1_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SPEC_CLASS1_TYP == null) {
			l_l_SPEC_CLASS1_TYP = new ArrayList();
		} else {
			l_l_SPEC_CLASS1_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SPEC_CLASS1_TYP.add(((KM0020010Struct) list.get(i)).getl_SPEC_CLASS1_TYP());
		}
		return size;
	}
	public int setL2L_l_SPEC_CLASS2_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SPEC_CLASS2_TYP == null) {
			l_l_SPEC_CLASS2_TYP = new ArrayList();
		} else {
			l_l_SPEC_CLASS2_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SPEC_CLASS2_TYP.add(((KM0020010Struct) list.get(i)).getl_SPEC_CLASS2_TYP());
		}
		return size;
	}
	public int setL2L_l_SPEC_SELECT1_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SPEC_SELECT1_TYP == null) {
			l_l_SPEC_SELECT1_TYP = new ArrayList();
		} else {
			l_l_SPEC_SELECT1_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SPEC_SELECT1_TYP.add(((KM0020010Struct) list.get(i)).getl_SPEC_SELECT1_TYP());
		}
		return size;
	}
	public int setL2L_l_SPEC_SELECT2_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SPEC_SELECT2_TYP == null) {
			l_l_SPEC_SELECT2_TYP = new ArrayList();
		} else {
			l_l_SPEC_SELECT2_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SPEC_SELECT2_TYP.add(((KM0020010Struct) list.get(i)).getl_SPEC_SELECT2_TYP());
		}
		return size;
	}
	public int setL2L_l_SPEC_SELECT3_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SPEC_SELECT3_TYP == null) {
			l_l_SPEC_SELECT3_TYP = new ArrayList();
		} else {
			l_l_SPEC_SELECT3_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SPEC_SELECT3_TYP.add(((KM0020010Struct) list.get(i)).getl_SPEC_SELECT3_TYP());
		}
		return size;
	}
	public int setL2L_l_SPEC_SELECT4_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SPEC_SELECT4_TYP == null) {
			l_l_SPEC_SELECT4_TYP = new ArrayList();
		} else {
			l_l_SPEC_SELECT4_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SPEC_SELECT4_TYP.add(((KM0020010Struct) list.get(i)).getl_SPEC_SELECT4_TYP());
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
			l_l_REMARKS.add(((KM0020010Struct) list.get(i)).getl_REMARKS());
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
			l_l_UNIT_COST.add(((KM0020010Struct) list.get(i)).getl_UNIT_COST());
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
			l_l_CUST_ITEM_NAME.add(((KM0020010Struct) list.get(i)).getl_CUST_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_h_MAX_DETAL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_MAX_DETAL_NO == null) {
			l_h_MAX_DETAL_NO = new ArrayList();
		} else {
			l_h_MAX_DETAL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_MAX_DETAL_NO.add(((KM0020010Struct) list.get(i)).geth_MAX_DETAL_NO());
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
			l_l_COUNT.add(((KM0020010Struct) list.get(i)).getl_COUNT());
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
			l_ROW_COUNT.add(((KM0020010Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}
	public int setL2L_BUSINESS_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BUSINESS_DATE == null) {
			l_BUSINESS_DATE = new ArrayList();
		} else {
			l_BUSINESS_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BUSINESS_DATE.add(((KM0020010Struct) list.get(i)).getBUSINESS_DATE());
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
			l_HOME_CUR_CD.add(((KM0020010Struct) list.get(i)).getHOME_CUR_CD());
		}
		return size;
	}
	public int setL2L_QUOTE_CUST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_QUOTE_CUST_CD == null) {
			l_QUOTE_CUST_CD = new ArrayList();
		} else {
			l_QUOTE_CUST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_QUOTE_CUST_CD.add(((KM0020010Struct) list.get(i)).getQUOTE_CUST_CD());
		}
		return size;
	}
	public int setL2L_QUOTE_CUR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_QUOTE_CUR_CD == null) {
			l_QUOTE_CUR_CD = new ArrayList();
		} else {
			l_QUOTE_CUR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_QUOTE_CUR_CD.add(((KM0020010Struct) list.get(i)).getQUOTE_CUR_CD());
		}
		return size;
	}
	public int setL2L_QUOTE_CUR_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_QUOTE_CUR_UNIT == null) {
			l_QUOTE_CUR_UNIT = new ArrayList();
		} else {
			l_QUOTE_CUR_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_QUOTE_CUR_UNIT.add(((KM0020010Struct) list.get(i)).getQUOTE_CUR_UNIT());
		}
		return size;
	}
	public int setL2L_QUOTE_PROJECT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_QUOTE_PROJECT_CD == null) {
			l_QUOTE_PROJECT_CD = new ArrayList();
		} else {
			l_QUOTE_PROJECT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_QUOTE_PROJECT_CD.add(((KM0020010Struct) list.get(i)).getQUOTE_PROJECT_CD());
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
			l_UNIT_QTY_TYP.add(((KM0020010Struct) list.get(i)).getUNIT_QTY_TYP());
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
			l_UNIT_COST.add(((KM0020010Struct) list.get(i)).getUNIT_COST());
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
			l_ESTIMATE_NO.add(((KM0020010Struct) list.get(i)).getESTIMATE_NO());
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
			l_UNOFFICIAL_RECEIPT_FLAG.add(((KM0020010Struct) list.get(i)).getUNOFFICIAL_RECEIPT_FLAG());
		}
		return size;
	}
	public int setL2L_ESTIMATE_ST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ESTIMATE_ST == null) {
			l_ESTIMATE_ST = new ArrayList();
		} else {
			l_ESTIMATE_ST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ESTIMATE_ST.add(((KM0020010Struct) list.get(i)).getESTIMATE_ST());
		}
		return size;
	}
	public int setL2L_USER(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_USER == null) {
			l_USER = new ArrayList();
		} else {
			l_USER.clear();
		}
		for (int i = 0; i < size; i++) {
			l_USER.add(((KM0020010Struct) list.get(i)).getUSER());
		}
		return size;
	}
	public int setL2L_PROGRAM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROGRAM_NAME == null) {
			l_PROGRAM_NAME = new ArrayList();
		} else {
			l_PROGRAM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROGRAM_NAME.add(((KM0020010Struct) list.get(i)).getPROGRAM_NAME());
		}
		return size;
	}
	public int setL2L_h_ESTIMATE_ST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ESTIMATE_ST == null) {
			l_h_ESTIMATE_ST = new ArrayList();
		} else {
			l_h_ESTIMATE_ST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ESTIMATE_ST.add(((KM0020010Struct) list.get(i)).geth_ESTIMATE_ST());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_l_CUR_UNIT = null;
		m_DOWNLOAD_FILE = null;
		m_l_FLAG = null;
		m_QUOTE_ESTIMATE_NO = null;
		m_l_ESTIMATE_NAME = null;
		m_l_SPEC_CLASS1_NAME = null;
		m_l_SPEC_CLASS2_NAME = null;
		m_l_SPEC_SELECT1_NAME = null;
		m_l_SPEC_SELECT2_NAME = null;
		m_l_SPEC_SELECT3_NAME = null;
		m_l_SPEC_SELECT4_NAME = null;
		m_l_ESTIMATE_TYP_name = null;
		m_l_ESTIMATE_TYP_val = null;
		m_l_SPEC_CLASS1_TYP_name = null;
		m_l_SPEC_CLASS1_TYP_val = null;
		m_l_SPEC_CLASS2_TYP_name = null;
		m_l_SPEC_CLASS2_TYP_val = null;
		m_l_SPEC_SELECT1_TYP_name = null;
		m_l_SPEC_SELECT1_TYP_val = null;
		m_l_SPEC_SELECT2_TYP_name = null;
		m_l_SPEC_SELECT2_TYP_val = null;
		m_l_SPEC_SELECT3_TYP_name = null;
		m_l_SPEC_SELECT3_TYP_val = null;
		m_l_SPEC_SELECT4_TYP_name = null;
		m_l_SPEC_SELECT4_TYP_val = null;
		m_LIST_CNT = null;
		m_h_ESTIMATE_NO = null;
		m_h_UNOFFICIAL_RECEIPT_FLAG = null;
		m_h_PROJECT_STAT = null;
		m_h_CALLBUTTON = null;
		m_PROJECT_NAME = null;
		m_h_CUST_CD = null;
		m_ES_ORG_CD = null;
		m_ES_USER_CD = null;
		m_ORG_NAME = null;
		m_USER_NAME = null;
		m_PROJECT_STAT = null;
		m_MODIFY_COUNT_PJ = null;
		m_PROJECT_CD = null;
		m_COMPANY_CD = null;
		m_CUST_NAME = null;
		m_h_CUR_CD = null;
		m_EXCH_TYP = null;
		m_DETAIL_ROUND_TYP = null;
		m_CUR_UNIT = null;
		m_h_PROJECT_CD = null;
		m_ESTIMATE_STAT = null;
		m_UNOFFICIAL_RECEIPT_FLG = null;
		m_ESTIMATE_DATE = null;
		m_ESTIMATE_AMOUNT = null;
		m_ESTIMATE_AMOUNT_JPN = null;
		m_ES_COMMET1 = null;
		m_ES_COMMET2 = null;
		m_ES_COMMET4 = null;
		m_ES_COMMET3 = null;
		m_ES_COMMET5 = null;
		m_ESREMARK1 = null;
		m_ESREMARK2 = null;
		m_ESREMARK3 = null;
		m_ZIP_CD = null;
		m_ADDRESS_1 = null;
		m_ADDRESS_2 = null;
		m_TEL = null;
		m_MODIFY_COUNT_ES = null;
		m_l_DETAL_NO = null;
		m_l_ESTIMATE_TYP = null;
		m_l_CUST_ITEM_CD = null;
		m_l_ITEM_NAME = null;
		m_l_DESINATED_DLV_DATE = null;
		m_l_ESTIMATE_QTY = null;
		m_l_UNIT_CD = null;
		m_l_UNIT_PRICE = null;
		m_l_DISCOUNT_PRICE = null;
		m_l_ESTIMATE_UNIT_PRICE = null;
		m_l_AMOUNT = null;
		m_l_DISCOUNT_AMOUNT = null;
		m_l_ESTIMATE_AMOUNT = null;
		m_l_ESTIMATE_AMOUNT_JPN = null;
		m_l_ESTIMATE_GAIN = null;
		m_l_ES_COST_MATERIAL = null;
		m_l_ES_COST_PROCESS = null;
		m_l_ES_COST_OUTSOUCE = null;
		m_l_ES_COST_ETC = null;
		m_l_ES_COST_SERVICE = null;
		m_l_ES_COST_ALL = null;
		m_l_SPEC_CLASS1_TYP = null;
		m_l_SPEC_CLASS2_TYP = null;
		m_l_SPEC_SELECT1_TYP = null;
		m_l_SPEC_SELECT2_TYP = null;
		m_l_SPEC_SELECT3_TYP = null;
		m_l_SPEC_SELECT4_TYP = null;
		m_l_REMARKS = null;
		m_l_UNIT_COST = null;
		m_l_CUST_ITEM_NAME = null;
		m_h_MAX_DETAL_NO = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;
		m_BUSINESS_DATE = null;
		m_HOME_CUR_CD = null;
		m_QUOTE_CUST_CD = null;
		m_QUOTE_CUR_CD = null;
		m_QUOTE_CUR_UNIT = null;
		m_QUOTE_PROJECT_CD = null;
		m_UNIT_QTY_TYP = null;
		m_UNIT_COST = null;
		m_ESTIMATE_NO = null;
		m_UNOFFICIAL_RECEIPT_FLAG = null;
		m_ESTIMATE_ST = null;
		m_USER = null;
		m_PROGRAM_NAME = null;
		m_h_ESTIMATE_ST = null;

		l_l_CUR_UNIT = null;
		l_DOWNLOAD_FILE = null;
		l_l_FLAG = null;
		l_QUOTE_ESTIMATE_NO = null;
		l_l_ESTIMATE_NAME = null;
		l_l_SPEC_CLASS1_NAME = null;
		l_l_SPEC_CLASS2_NAME = null;
		l_l_SPEC_SELECT1_NAME = null;
		l_l_SPEC_SELECT2_NAME = null;
		l_l_SPEC_SELECT3_NAME = null;
		l_l_SPEC_SELECT4_NAME = null;
		l_l_ESTIMATE_TYP_name = null;
		l_l_ESTIMATE_TYP_val = null;
		l_l_SPEC_CLASS1_TYP_name = null;
		l_l_SPEC_CLASS1_TYP_val = null;
		l_l_SPEC_CLASS2_TYP_name = null;
		l_l_SPEC_CLASS2_TYP_val = null;
		l_l_SPEC_SELECT1_TYP_name = null;
		l_l_SPEC_SELECT1_TYP_val = null;
		l_l_SPEC_SELECT2_TYP_name = null;
		l_l_SPEC_SELECT2_TYP_val = null;
		l_l_SPEC_SELECT3_TYP_name = null;
		l_l_SPEC_SELECT3_TYP_val = null;
		l_l_SPEC_SELECT4_TYP_name = null;
		l_l_SPEC_SELECT4_TYP_val = null;
		l_LIST_CNT = null;
		l_h_ESTIMATE_NO = null;
		l_h_UNOFFICIAL_RECEIPT_FLAG = null;
		l_h_PROJECT_STAT = null;
		l_h_CALLBUTTON = null;
		l_PROJECT_NAME = null;
		l_h_CUST_CD = null;
		l_ES_ORG_CD = null;
		l_ES_USER_CD = null;
		l_ORG_NAME = null;
		l_USER_NAME = null;
		l_PROJECT_STAT = null;
		l_MODIFY_COUNT_PJ = null;
		l_PROJECT_CD = null;
		l_COMPANY_CD = null;
		l_CUST_NAME = null;
		l_h_CUR_CD = null;
		l_EXCH_TYP = null;
		l_DETAIL_ROUND_TYP = null;
		l_CUR_UNIT = null;
		l_h_PROJECT_CD = null;
		l_ESTIMATE_STAT = null;
		l_UNOFFICIAL_RECEIPT_FLG = null;
		l_ESTIMATE_DATE = null;
		l_ESTIMATE_AMOUNT = null;
		l_ESTIMATE_AMOUNT_JPN = null;
		l_ES_COMMET1 = null;
		l_ES_COMMET2 = null;
		l_ES_COMMET4 = null;
		l_ES_COMMET3 = null;
		l_ES_COMMET5 = null;
		l_ESREMARK1 = null;
		l_ESREMARK2 = null;
		l_ESREMARK3 = null;
		l_ZIP_CD = null;
		l_ADDRESS_1 = null;
		l_ADDRESS_2 = null;
		l_TEL = null;
		l_MODIFY_COUNT_ES = null;
		l_l_DETAL_NO = null;
		l_l_ESTIMATE_TYP = null;
		l_l_CUST_ITEM_CD = null;
		l_l_ITEM_NAME = null;
		l_l_DESINATED_DLV_DATE = null;
		l_l_ESTIMATE_QTY = null;
		l_l_UNIT_CD = null;
		l_l_UNIT_PRICE = null;
		l_l_DISCOUNT_PRICE = null;
		l_l_ESTIMATE_UNIT_PRICE = null;
		l_l_AMOUNT = null;
		l_l_DISCOUNT_AMOUNT = null;
		l_l_ESTIMATE_AMOUNT = null;
		l_l_ESTIMATE_AMOUNT_JPN = null;
		l_l_ESTIMATE_GAIN = null;
		l_l_ES_COST_MATERIAL = null;
		l_l_ES_COST_PROCESS = null;
		l_l_ES_COST_OUTSOUCE = null;
		l_l_ES_COST_ETC = null;
		l_l_ES_COST_SERVICE = null;
		l_l_ES_COST_ALL = null;
		l_l_SPEC_CLASS1_TYP = null;
		l_l_SPEC_CLASS2_TYP = null;
		l_l_SPEC_SELECT1_TYP = null;
		l_l_SPEC_SELECT2_TYP = null;
		l_l_SPEC_SELECT3_TYP = null;
		l_l_SPEC_SELECT4_TYP = null;
		l_l_REMARKS = null;
		l_l_UNIT_COST = null;
		l_l_CUST_ITEM_NAME = null;
		l_h_MAX_DETAL_NO = null;
		l_l_COUNT = null;
		l_ROW_COUNT = null;
		l_BUSINESS_DATE = null;
		l_HOME_CUR_CD = null;
		l_QUOTE_CUST_CD = null;
		l_QUOTE_CUR_CD = null;
		l_QUOTE_CUR_UNIT = null;
		l_QUOTE_PROJECT_CD = null;
		l_UNIT_QTY_TYP = null;
		l_UNIT_COST = null;
		l_ESTIMATE_NO = null;
		l_UNOFFICIAL_RECEIPT_FLAG = null;
		l_ESTIMATE_ST = null;
		l_USER = null;
		l_PROGRAM_NAME = null;
		l_h_ESTIMATE_ST = null;

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
	 * medKM0020010クラスの標準コンストラクタ
	 */
	public KM0020010Struct()
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
	public void setStruct(KM0020010Struct struct)
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
	public void setStructM(KM0020010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setl_CUR_UNIT(struct.getl_CUR_UNIT());
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setl_FLAG(struct.getl_FLAG());
			this.setQUOTE_ESTIMATE_NO(struct.getQUOTE_ESTIMATE_NO());
			this.setl_ESTIMATE_NAME(struct.getl_ESTIMATE_NAME());
			this.setl_SPEC_CLASS1_NAME(struct.getl_SPEC_CLASS1_NAME());
			this.setl_SPEC_CLASS2_NAME(struct.getl_SPEC_CLASS2_NAME());
			this.setl_SPEC_SELECT1_NAME(struct.getl_SPEC_SELECT1_NAME());
			this.setl_SPEC_SELECT2_NAME(struct.getl_SPEC_SELECT2_NAME());
			this.setl_SPEC_SELECT3_NAME(struct.getl_SPEC_SELECT3_NAME());
			this.setl_SPEC_SELECT4_NAME(struct.getl_SPEC_SELECT4_NAME());
			this.setl_ESTIMATE_TYP_name(struct.getl_ESTIMATE_TYP_name());
			this.setl_ESTIMATE_TYP_val(struct.getl_ESTIMATE_TYP_val());
			this.setl_SPEC_CLASS1_TYP_name(struct.getl_SPEC_CLASS1_TYP_name());
			this.setl_SPEC_CLASS1_TYP_val(struct.getl_SPEC_CLASS1_TYP_val());
			this.setl_SPEC_CLASS2_TYP_name(struct.getl_SPEC_CLASS2_TYP_name());
			this.setl_SPEC_CLASS2_TYP_val(struct.getl_SPEC_CLASS2_TYP_val());
			this.setl_SPEC_SELECT1_TYP_name(struct.getl_SPEC_SELECT1_TYP_name());
			this.setl_SPEC_SELECT1_TYP_val(struct.getl_SPEC_SELECT1_TYP_val());
			this.setl_SPEC_SELECT2_TYP_name(struct.getl_SPEC_SELECT2_TYP_name());
			this.setl_SPEC_SELECT2_TYP_val(struct.getl_SPEC_SELECT2_TYP_val());
			this.setl_SPEC_SELECT3_TYP_name(struct.getl_SPEC_SELECT3_TYP_name());
			this.setl_SPEC_SELECT3_TYP_val(struct.getl_SPEC_SELECT3_TYP_val());
			this.setl_SPEC_SELECT4_TYP_name(struct.getl_SPEC_SELECT4_TYP_name());
			this.setl_SPEC_SELECT4_TYP_val(struct.getl_SPEC_SELECT4_TYP_val());
			this.setLIST_CNT(struct.getLIST_CNT());
			this.seth_ESTIMATE_NO(struct.geth_ESTIMATE_NO());
			this.seth_UNOFFICIAL_RECEIPT_FLAG(struct.geth_UNOFFICIAL_RECEIPT_FLAG());
			this.seth_PROJECT_STAT(struct.geth_PROJECT_STAT());
			this.seth_CALLBUTTON(struct.geth_CALLBUTTON());
			this.setPROJECT_NAME(struct.getPROJECT_NAME());
			this.seth_CUST_CD(struct.geth_CUST_CD());
			this.setES_ORG_CD(struct.getES_ORG_CD());
			this.setES_USER_CD(struct.getES_USER_CD());
			this.setORG_NAME(struct.getORG_NAME());
			this.setUSER_NAME(struct.getUSER_NAME());
			this.setPROJECT_STAT(struct.getPROJECT_STAT());
			this.setMODIFY_COUNT_PJ(struct.getMODIFY_COUNT_PJ());
			this.setPROJECT_CD(struct.getPROJECT_CD());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setCUST_NAME(struct.getCUST_NAME());
			this.seth_CUR_CD(struct.geth_CUR_CD());
			this.setEXCH_TYP(struct.getEXCH_TYP());
			this.setDETAIL_ROUND_TYP(struct.getDETAIL_ROUND_TYP());
			this.setCUR_UNIT(struct.getCUR_UNIT());
			this.seth_PROJECT_CD(struct.geth_PROJECT_CD());
			this.setESTIMATE_STAT(struct.getESTIMATE_STAT());
			this.setUNOFFICIAL_RECEIPT_FLG(struct.getUNOFFICIAL_RECEIPT_FLG());
			this.setESTIMATE_DATE(struct.getESTIMATE_DATE());
			this.setESTIMATE_AMOUNT(struct.getESTIMATE_AMOUNT());
			this.setESTIMATE_AMOUNT_JPN(struct.getESTIMATE_AMOUNT_JPN());
			this.setES_COMMET1(struct.getES_COMMET1());
			this.setES_COMMET2(struct.getES_COMMET2());
			this.setES_COMMET4(struct.getES_COMMET4());
			this.setES_COMMET3(struct.getES_COMMET3());
			this.setES_COMMET5(struct.getES_COMMET5());
			this.setESREMARK1(struct.getESREMARK1());
			this.setESREMARK2(struct.getESREMARK2());
			this.setESREMARK3(struct.getESREMARK3());
			this.setZIP_CD(struct.getZIP_CD());
			this.setADDRESS_1(struct.getADDRESS_1());
			this.setADDRESS_2(struct.getADDRESS_2());
			this.setTEL(struct.getTEL());
			this.setMODIFY_COUNT_ES(struct.getMODIFY_COUNT_ES());
			this.setl_DETAL_NO(struct.getl_DETAL_NO());
			this.setl_ESTIMATE_TYP(struct.getl_ESTIMATE_TYP());
			this.setl_CUST_ITEM_CD(struct.getl_CUST_ITEM_CD());
			this.setl_ITEM_NAME(struct.getl_ITEM_NAME());
			this.setl_DESINATED_DLV_DATE(struct.getl_DESINATED_DLV_DATE());
			this.setl_ESTIMATE_QTY(struct.getl_ESTIMATE_QTY());
			this.setl_UNIT_CD(struct.getl_UNIT_CD());
			this.setl_UNIT_PRICE(struct.getl_UNIT_PRICE());
			this.setl_DISCOUNT_PRICE(struct.getl_DISCOUNT_PRICE());
			this.setl_ESTIMATE_UNIT_PRICE(struct.getl_ESTIMATE_UNIT_PRICE());
			this.setl_AMOUNT(struct.getl_AMOUNT());
			this.setl_DISCOUNT_AMOUNT(struct.getl_DISCOUNT_AMOUNT());
			this.setl_ESTIMATE_AMOUNT(struct.getl_ESTIMATE_AMOUNT());
			this.setl_ESTIMATE_AMOUNT_JPN(struct.getl_ESTIMATE_AMOUNT_JPN());
			this.setl_ESTIMATE_GAIN(struct.getl_ESTIMATE_GAIN());
			this.setl_ES_COST_MATERIAL(struct.getl_ES_COST_MATERIAL());
			this.setl_ES_COST_PROCESS(struct.getl_ES_COST_PROCESS());
			this.setl_ES_COST_OUTSOUCE(struct.getl_ES_COST_OUTSOUCE());
			this.setl_ES_COST_ETC(struct.getl_ES_COST_ETC());
			this.setl_ES_COST_SERVICE(struct.getl_ES_COST_SERVICE());
			this.setl_ES_COST_ALL(struct.getl_ES_COST_ALL());
			this.setl_SPEC_CLASS1_TYP(struct.getl_SPEC_CLASS1_TYP());
			this.setl_SPEC_CLASS2_TYP(struct.getl_SPEC_CLASS2_TYP());
			this.setl_SPEC_SELECT1_TYP(struct.getl_SPEC_SELECT1_TYP());
			this.setl_SPEC_SELECT2_TYP(struct.getl_SPEC_SELECT2_TYP());
			this.setl_SPEC_SELECT3_TYP(struct.getl_SPEC_SELECT3_TYP());
			this.setl_SPEC_SELECT4_TYP(struct.getl_SPEC_SELECT4_TYP());
			this.setl_REMARKS(struct.getl_REMARKS());
			this.setl_UNIT_COST(struct.getl_UNIT_COST());
			this.setl_CUST_ITEM_NAME(struct.getl_CUST_ITEM_NAME());
			this.seth_MAX_DETAL_NO(struct.geth_MAX_DETAL_NO());
			this.setl_COUNT(struct.getl_COUNT());
			this.setROW_COUNT(struct.getROW_COUNT());
			this.setBUSINESS_DATE(struct.getBUSINESS_DATE());
			this.setHOME_CUR_CD(struct.getHOME_CUR_CD());
			this.setQUOTE_CUST_CD(struct.getQUOTE_CUST_CD());
			this.setQUOTE_CUR_CD(struct.getQUOTE_CUR_CD());
			this.setQUOTE_CUR_UNIT(struct.getQUOTE_CUR_UNIT());
			this.setQUOTE_PROJECT_CD(struct.getQUOTE_PROJECT_CD());
			this.setUNIT_QTY_TYP(struct.getUNIT_QTY_TYP());
			this.setUNIT_COST(struct.getUNIT_COST());
			this.setESTIMATE_NO(struct.getESTIMATE_NO());
			this.setUNOFFICIAL_RECEIPT_FLAG(struct.getUNOFFICIAL_RECEIPT_FLAG());
			this.setESTIMATE_ST(struct.getESTIMATE_ST());
			this.setUSER(struct.getUSER());
			this.setPROGRAM_NAME(struct.getPROGRAM_NAME());
			this.seth_ESTIMATE_ST(struct.geth_ESTIMATE_ST());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(KM0020010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_l_CUR_UNIT(struct.getList_l_CUR_UNIT());
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_l_FLAG(struct.getList_l_FLAG());
			this.setList_QUOTE_ESTIMATE_NO(struct.getList_QUOTE_ESTIMATE_NO());
			this.setList_l_ESTIMATE_NAME(struct.getList_l_ESTIMATE_NAME());
			this.setList_l_SPEC_CLASS1_NAME(struct.getList_l_SPEC_CLASS1_NAME());
			this.setList_l_SPEC_CLASS2_NAME(struct.getList_l_SPEC_CLASS2_NAME());
			this.setList_l_SPEC_SELECT1_NAME(struct.getList_l_SPEC_SELECT1_NAME());
			this.setList_l_SPEC_SELECT2_NAME(struct.getList_l_SPEC_SELECT2_NAME());
			this.setList_l_SPEC_SELECT3_NAME(struct.getList_l_SPEC_SELECT3_NAME());
			this.setList_l_SPEC_SELECT4_NAME(struct.getList_l_SPEC_SELECT4_NAME());
			this.setList_l_ESTIMATE_TYP_name(struct.getList_l_ESTIMATE_TYP_name());
			this.setList_l_ESTIMATE_TYP_val(struct.getList_l_ESTIMATE_TYP_val());
			this.setList_l_SPEC_CLASS1_TYP_name(struct.getList_l_SPEC_CLASS1_TYP_name());
			this.setList_l_SPEC_CLASS1_TYP_val(struct.getList_l_SPEC_CLASS1_TYP_val());
			this.setList_l_SPEC_CLASS2_TYP_name(struct.getList_l_SPEC_CLASS2_TYP_name());
			this.setList_l_SPEC_CLASS2_TYP_val(struct.getList_l_SPEC_CLASS2_TYP_val());
			this.setList_l_SPEC_SELECT1_TYP_name(struct.getList_l_SPEC_SELECT1_TYP_name());
			this.setList_l_SPEC_SELECT1_TYP_val(struct.getList_l_SPEC_SELECT1_TYP_val());
			this.setList_l_SPEC_SELECT2_TYP_name(struct.getList_l_SPEC_SELECT2_TYP_name());
			this.setList_l_SPEC_SELECT2_TYP_val(struct.getList_l_SPEC_SELECT2_TYP_val());
			this.setList_l_SPEC_SELECT3_TYP_name(struct.getList_l_SPEC_SELECT3_TYP_name());
			this.setList_l_SPEC_SELECT3_TYP_val(struct.getList_l_SPEC_SELECT3_TYP_val());
			this.setList_l_SPEC_SELECT4_TYP_name(struct.getList_l_SPEC_SELECT4_TYP_name());
			this.setList_l_SPEC_SELECT4_TYP_val(struct.getList_l_SPEC_SELECT4_TYP_val());
			this.setList_LIST_CNT(struct.getList_LIST_CNT());
			this.setList_h_ESTIMATE_NO(struct.getList_h_ESTIMATE_NO());
			this.setList_h_UNOFFICIAL_RECEIPT_FLAG(struct.getList_h_UNOFFICIAL_RECEIPT_FLAG());
			this.setList_h_PROJECT_STAT(struct.getList_h_PROJECT_STAT());
			this.setList_h_CALLBUTTON(struct.getList_h_CALLBUTTON());
			this.setList_PROJECT_NAME(struct.getList_PROJECT_NAME());
			this.setList_h_CUST_CD(struct.getList_h_CUST_CD());
			this.setList_ES_ORG_CD(struct.getList_ES_ORG_CD());
			this.setList_ES_USER_CD(struct.getList_ES_USER_CD());
			this.setList_ORG_NAME(struct.getList_ORG_NAME());
			this.setList_USER_NAME(struct.getList_USER_NAME());
			this.setList_PROJECT_STAT(struct.getList_PROJECT_STAT());
			this.setList_MODIFY_COUNT_PJ(struct.getList_MODIFY_COUNT_PJ());
			this.setList_PROJECT_CD(struct.getList_PROJECT_CD());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_CUST_NAME(struct.getList_CUST_NAME());
			this.setList_h_CUR_CD(struct.getList_h_CUR_CD());
			this.setList_EXCH_TYP(struct.getList_EXCH_TYP());
			this.setList_DETAIL_ROUND_TYP(struct.getList_DETAIL_ROUND_TYP());
			this.setList_CUR_UNIT(struct.getList_CUR_UNIT());
			this.setList_h_PROJECT_CD(struct.getList_h_PROJECT_CD());
			this.setList_ESTIMATE_STAT(struct.getList_ESTIMATE_STAT());
			this.setList_UNOFFICIAL_RECEIPT_FLG(struct.getList_UNOFFICIAL_RECEIPT_FLG());
			this.setList_ESTIMATE_DATE(struct.getList_ESTIMATE_DATE());
			this.setList_ESTIMATE_AMOUNT(struct.getList_ESTIMATE_AMOUNT());
			this.setList_ESTIMATE_AMOUNT_JPN(struct.getList_ESTIMATE_AMOUNT_JPN());
			this.setList_ES_COMMET1(struct.getList_ES_COMMET1());
			this.setList_ES_COMMET2(struct.getList_ES_COMMET2());
			this.setList_ES_COMMET4(struct.getList_ES_COMMET4());
			this.setList_ES_COMMET3(struct.getList_ES_COMMET3());
			this.setList_ES_COMMET5(struct.getList_ES_COMMET5());
			this.setList_ESREMARK1(struct.getList_ESREMARK1());
			this.setList_ESREMARK2(struct.getList_ESREMARK2());
			this.setList_ESREMARK3(struct.getList_ESREMARK3());
			this.setList_ZIP_CD(struct.getList_ZIP_CD());
			this.setList_ADDRESS_1(struct.getList_ADDRESS_1());
			this.setList_ADDRESS_2(struct.getList_ADDRESS_2());
			this.setList_TEL(struct.getList_TEL());
			this.setList_MODIFY_COUNT_ES(struct.getList_MODIFY_COUNT_ES());
			this.setList_l_DETAL_NO(struct.getList_l_DETAL_NO());
			this.setList_l_ESTIMATE_TYP(struct.getList_l_ESTIMATE_TYP());
			this.setList_l_CUST_ITEM_CD(struct.getList_l_CUST_ITEM_CD());
			this.setList_l_ITEM_NAME(struct.getList_l_ITEM_NAME());
			this.setList_l_DESINATED_DLV_DATE(struct.getList_l_DESINATED_DLV_DATE());
			this.setList_l_ESTIMATE_QTY(struct.getList_l_ESTIMATE_QTY());
			this.setList_l_UNIT_CD(struct.getList_l_UNIT_CD());
			this.setList_l_UNIT_PRICE(struct.getList_l_UNIT_PRICE());
			this.setList_l_DISCOUNT_PRICE(struct.getList_l_DISCOUNT_PRICE());
			this.setList_l_ESTIMATE_UNIT_PRICE(struct.getList_l_ESTIMATE_UNIT_PRICE());
			this.setList_l_AMOUNT(struct.getList_l_AMOUNT());
			this.setList_l_DISCOUNT_AMOUNT(struct.getList_l_DISCOUNT_AMOUNT());
			this.setList_l_ESTIMATE_AMOUNT(struct.getList_l_ESTIMATE_AMOUNT());
			this.setList_l_ESTIMATE_AMOUNT_JPN(struct.getList_l_ESTIMATE_AMOUNT_JPN());
			this.setList_l_ESTIMATE_GAIN(struct.getList_l_ESTIMATE_GAIN());
			this.setList_l_ES_COST_MATERIAL(struct.getList_l_ES_COST_MATERIAL());
			this.setList_l_ES_COST_PROCESS(struct.getList_l_ES_COST_PROCESS());
			this.setList_l_ES_COST_OUTSOUCE(struct.getList_l_ES_COST_OUTSOUCE());
			this.setList_l_ES_COST_ETC(struct.getList_l_ES_COST_ETC());
			this.setList_l_ES_COST_SERVICE(struct.getList_l_ES_COST_SERVICE());
			this.setList_l_ES_COST_ALL(struct.getList_l_ES_COST_ALL());
			this.setList_l_SPEC_CLASS1_TYP(struct.getList_l_SPEC_CLASS1_TYP());
			this.setList_l_SPEC_CLASS2_TYP(struct.getList_l_SPEC_CLASS2_TYP());
			this.setList_l_SPEC_SELECT1_TYP(struct.getList_l_SPEC_SELECT1_TYP());
			this.setList_l_SPEC_SELECT2_TYP(struct.getList_l_SPEC_SELECT2_TYP());
			this.setList_l_SPEC_SELECT3_TYP(struct.getList_l_SPEC_SELECT3_TYP());
			this.setList_l_SPEC_SELECT4_TYP(struct.getList_l_SPEC_SELECT4_TYP());
			this.setList_l_REMARKS(struct.getList_l_REMARKS());
			this.setList_l_UNIT_COST(struct.getList_l_UNIT_COST());
			this.setList_l_CUST_ITEM_NAME(struct.getList_l_CUST_ITEM_NAME());
			this.setList_h_MAX_DETAL_NO(struct.getList_h_MAX_DETAL_NO());
			this.setList_l_COUNT(struct.getList_l_COUNT());
			this.setList_ROW_COUNT(struct.getList_ROW_COUNT());
			this.setList_BUSINESS_DATE(struct.getList_BUSINESS_DATE());
			this.setList_HOME_CUR_CD(struct.getList_HOME_CUR_CD());
			this.setList_QUOTE_CUST_CD(struct.getList_QUOTE_CUST_CD());
			this.setList_QUOTE_CUR_CD(struct.getList_QUOTE_CUR_CD());
			this.setList_QUOTE_CUR_UNIT(struct.getList_QUOTE_CUR_UNIT());
			this.setList_QUOTE_PROJECT_CD(struct.getList_QUOTE_PROJECT_CD());
			this.setList_UNIT_QTY_TYP(struct.getList_UNIT_QTY_TYP());
			this.setList_UNIT_COST(struct.getList_UNIT_COST());
			this.setList_ESTIMATE_NO(struct.getList_ESTIMATE_NO());
			this.setList_UNOFFICIAL_RECEIPT_FLAG(struct.getList_UNOFFICIAL_RECEIPT_FLAG());
			this.setList_ESTIMATE_ST(struct.getList_ESTIMATE_ST());
			this.setList_USER(struct.getList_USER());
			this.setList_PROGRAM_NAME(struct.getList_PROGRAM_NAME());
			this.setList_h_ESTIMATE_ST(struct.getList_h_ESTIMATE_ST());
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
	// 第 1 変数初期値： i_l_CUR_UNIT


	final static String i_l_CUR_UNIT = null;

	// 第 2 変数初期値： i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// 第 3 変数初期値： i_l_FLAG


	final static String i_l_FLAG = null;

	// 第 4 変数初期値： i_QUOTE_ESTIMATE_NO


	final static String i_QUOTE_ESTIMATE_NO = null;

	// 第 5 変数初期値： i_l_ESTIMATE_NAME


	final static String i_l_ESTIMATE_NAME = null;

	// 第 6 変数初期値： i_l_SPEC_CLASS1_NAME


	final static String i_l_SPEC_CLASS1_NAME = null;

	// 第 7 変数初期値： i_l_SPEC_CLASS2_NAME


	final static String i_l_SPEC_CLASS2_NAME = null;

	// 第 8 変数初期値： i_l_SPEC_SELECT1_NAME


	final static String i_l_SPEC_SELECT1_NAME = null;

	// 第 9 変数初期値： i_l_SPEC_SELECT2_NAME


	final static String i_l_SPEC_SELECT2_NAME = null;

	// 第 10 変数初期値： i_l_SPEC_SELECT3_NAME


	final static String i_l_SPEC_SELECT3_NAME = null;

	// 第 11 変数初期値： i_l_SPEC_SELECT4_NAME


	final static String i_l_SPEC_SELECT4_NAME = null;

	// 第 12 変数初期値： i_l_ESTIMATE_TYP_name


	final static String i_l_ESTIMATE_TYP_name = null;

	// 第 13 変数初期値： i_l_ESTIMATE_TYP_val


	final static String i_l_ESTIMATE_TYP_val = null;

	// 第 14 変数初期値： i_l_SPEC_CLASS1_TYP_name


	final static String i_l_SPEC_CLASS1_TYP_name = null;

	// 第 15 変数初期値： i_l_SPEC_CLASS1_TYP_val


	final static String i_l_SPEC_CLASS1_TYP_val = null;

	// 第 16 変数初期値： i_l_SPEC_CLASS2_TYP_name


	final static String i_l_SPEC_CLASS2_TYP_name = null;

	// 第 17 変数初期値： i_l_SPEC_CLASS2_TYP_val


	final static String i_l_SPEC_CLASS2_TYP_val = null;

	// 第 18 変数初期値： i_l_SPEC_SELECT1_TYP_name


	final static String i_l_SPEC_SELECT1_TYP_name = null;

	// 第 19 変数初期値： i_l_SPEC_SELECT1_TYP_val


	final static String i_l_SPEC_SELECT1_TYP_val = null;

	// 第 20 変数初期値： i_l_SPEC_SELECT2_TYP_name


	final static String i_l_SPEC_SELECT2_TYP_name = null;

	// 第 21 変数初期値： i_l_SPEC_SELECT2_TYP_val


	final static String i_l_SPEC_SELECT2_TYP_val = null;

	// 第 22 変数初期値： i_l_SPEC_SELECT3_TYP_name


	final static String i_l_SPEC_SELECT3_TYP_name = null;

	// 第 23 変数初期値： i_l_SPEC_SELECT3_TYP_val


	final static String i_l_SPEC_SELECT3_TYP_val = null;

	// 第 24 変数初期値： i_l_SPEC_SELECT4_TYP_name


	final static String i_l_SPEC_SELECT4_TYP_name = null;

	// 第 25 変数初期値： i_l_SPEC_SELECT4_TYP_val


	final static String i_l_SPEC_SELECT4_TYP_val = null;

	// 第 26 変数初期値： i_LIST_CNT


	final static String i_LIST_CNT = null;

	// 第 27 変数初期値： i_h_ESTIMATE_NO


	final static String i_h_ESTIMATE_NO = null;

	// 第 28 変数初期値： i_h_UNOFFICIAL_RECEIPT_FLAG


	final static String i_h_UNOFFICIAL_RECEIPT_FLAG = null;

	// 第 29 変数初期値： i_h_PROJECT_STAT


	final static String i_h_PROJECT_STAT = null;

	// 第 30 変数初期値： i_h_CALLBUTTON


	final static String i_h_CALLBUTTON = null;

	// 第 31 変数初期値： i_PROJECT_NAME


	final static String i_PROJECT_NAME = null;

	// 第 32 変数初期値： i_h_CUST_CD


	final static String i_h_CUST_CD = null;

	// 第 33 変数初期値： i_ES_ORG_CD


	final static String i_ES_ORG_CD = null;

	// 第 34 変数初期値： i_ES_USER_CD


	final static String i_ES_USER_CD = null;

	// 第 35 変数初期値： i_ORG_NAME


	final static String i_ORG_NAME = null;

	// 第 36 変数初期値： i_USER_NAME


	final static String i_USER_NAME = null;

	// 第 37 変数初期値： i_PROJECT_STAT


	final static String i_PROJECT_STAT = null;

	// 第 38 変数初期値： i_MODIFY_COUNT_PJ


	final static String i_MODIFY_COUNT_PJ = null;

	// 第 39 変数初期値： i_PROJECT_CD


	final static String i_PROJECT_CD = null;

	// 第 40 変数初期値： i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// 第 41 変数初期値： i_CUST_NAME


	final static String i_CUST_NAME = null;

	// 第 42 変数初期値： i_h_CUR_CD


	final static String i_h_CUR_CD = null;

	// 第 43 変数初期値： i_EXCH_TYP


	final static String i_EXCH_TYP = null;

	// 第 44 変数初期値： i_DETAIL_ROUND_TYP


	final static String i_DETAIL_ROUND_TYP = null;

	// 第 45 変数初期値： i_CUR_UNIT


	final static String i_CUR_UNIT = null;

	// 第 46 変数初期値： i_h_PROJECT_CD


	final static String i_h_PROJECT_CD = null;

	// 第 47 変数初期値： i_ESTIMATE_STAT


	final static String i_ESTIMATE_STAT = null;

	// 第 48 変数初期値： i_UNOFFICIAL_RECEIPT_FLG


	final static String i_UNOFFICIAL_RECEIPT_FLG = null;

	// 第 49 変数初期値： i_ESTIMATE_DATE


	final static String i_ESTIMATE_DATE = null;

	// 第 50 変数初期値： i_ESTIMATE_AMOUNT


	final static String i_ESTIMATE_AMOUNT = null;

	// 第 51 変数初期値： i_ESTIMATE_AMOUNT_JPN


	final static String i_ESTIMATE_AMOUNT_JPN = null;

	// 第 52 変数初期値： i_ES_COMMET1


	final static String i_ES_COMMET1 = null;

	// 第 53 変数初期値： i_ES_COMMET2


	final static String i_ES_COMMET2 = null;

	// 第 54 変数初期値： i_ES_COMMET4


	final static String i_ES_COMMET4 = null;

	// 第 55 変数初期値： i_ES_COMMET3


	final static String i_ES_COMMET3 = null;

	// 第 56 変数初期値： i_ES_COMMET5


	final static String i_ES_COMMET5 = null;

	// 第 57 変数初期値： i_ESREMARK1


	final static String i_ESREMARK1 = null;

	// 第 58 変数初期値： i_ESREMARK2


	final static String i_ESREMARK2 = null;

	// 第 59 変数初期値： i_ESREMARK3


	final static String i_ESREMARK3 = null;

	// 第 60 変数初期値： i_ZIP_CD


	final static String i_ZIP_CD = null;

	// 第 61 変数初期値： i_ADDRESS_1


	final static String i_ADDRESS_1 = null;

	// 第 62 変数初期値： i_ADDRESS_2


	final static String i_ADDRESS_2 = null;

	// 第 63 変数初期値： i_TEL


	final static String i_TEL = null;

	// 第 64 変数初期値： i_MODIFY_COUNT_ES


	final static String i_MODIFY_COUNT_ES = null;

	// 第 65 変数初期値： i_l_DETAL_NO


	final static String i_l_DETAL_NO = null;

	// 第 66 変数初期値： i_l_ESTIMATE_TYP


	final static String i_l_ESTIMATE_TYP = null;

	// 第 67 変数初期値： i_l_CUST_ITEM_CD


	final static String i_l_CUST_ITEM_CD = null;

	// 第 68 変数初期値： i_l_ITEM_NAME


	final static String i_l_ITEM_NAME = null;

	// 第 69 変数初期値： i_l_DESINATED_DLV_DATE


	final static String i_l_DESINATED_DLV_DATE = null;

	// 第 70 変数初期値： i_l_ESTIMATE_QTY


	final static String i_l_ESTIMATE_QTY = null;

	// 第 71 変数初期値： i_l_UNIT_CD


	final static String i_l_UNIT_CD = null;

	// 第 72 変数初期値： i_l_UNIT_PRICE


	final static String i_l_UNIT_PRICE = null;

	// 第 73 変数初期値： i_l_DISCOUNT_PRICE


	final static String i_l_DISCOUNT_PRICE = null;

	// 第 74 変数初期値： i_l_ESTIMATE_UNIT_PRICE


	final static String i_l_ESTIMATE_UNIT_PRICE = null;

	// 第 75 変数初期値： i_l_AMOUNT


	final static String i_l_AMOUNT = null;

	// 第 76 変数初期値： i_l_DISCOUNT_AMOUNT


	final static String i_l_DISCOUNT_AMOUNT = null;

	// 第 77 変数初期値： i_l_ESTIMATE_AMOUNT


	final static String i_l_ESTIMATE_AMOUNT = null;

	// 第 78 変数初期値： i_l_ESTIMATE_AMOUNT_JPN


	final static String i_l_ESTIMATE_AMOUNT_JPN = null;

	// 第 79 変数初期値： i_l_ESTIMATE_GAIN


	final static String i_l_ESTIMATE_GAIN = null;

	// 第 80 変数初期値： i_l_ES_COST_MATERIAL


	final static String i_l_ES_COST_MATERIAL = null;

	// 第 81 変数初期値： i_l_ES_COST_PROCESS


	final static String i_l_ES_COST_PROCESS = null;

	// 第 82 変数初期値： i_l_ES_COST_OUTSOUCE


	final static String i_l_ES_COST_OUTSOUCE = null;

	// 第 83 変数初期値： i_l_ES_COST_ETC


	final static String i_l_ES_COST_ETC = null;

	// 第 84 変数初期値： i_l_ES_COST_SERVICE


	final static String i_l_ES_COST_SERVICE = null;

	// 第 85 変数初期値： i_l_ES_COST_ALL


	final static String i_l_ES_COST_ALL = null;

	// 第 86 変数初期値： i_l_SPEC_CLASS1_TYP


	final static String i_l_SPEC_CLASS1_TYP = null;

	// 第 87 変数初期値： i_l_SPEC_CLASS2_TYP


	final static String i_l_SPEC_CLASS2_TYP = null;

	// 第 88 変数初期値： i_l_SPEC_SELECT1_TYP


	final static String i_l_SPEC_SELECT1_TYP = null;

	// 第 89 変数初期値： i_l_SPEC_SELECT2_TYP


	final static String i_l_SPEC_SELECT2_TYP = null;

	// 第 90 変数初期値： i_l_SPEC_SELECT3_TYP


	final static String i_l_SPEC_SELECT3_TYP = null;

	// 第 91 変数初期値： i_l_SPEC_SELECT4_TYP


	final static String i_l_SPEC_SELECT4_TYP = null;

	// 第 92 変数初期値： i_l_REMARKS


	final static String i_l_REMARKS = null;

	// 第 93 変数初期値： i_l_UNIT_COST


	final static String i_l_UNIT_COST = null;

	// 第 94 変数初期値： i_l_CUST_ITEM_NAME


	final static String i_l_CUST_ITEM_NAME = null;

	// 第 95 変数初期値： i_h_MAX_DETAL_NO


	final static String i_h_MAX_DETAL_NO = null;

	// 第 96 変数初期値： i_l_COUNT


	final static String i_l_COUNT = null;

	// 第 97 変数初期値： i_ROW_COUNT


	final static String i_ROW_COUNT = null;

	// 第 98 変数初期値： i_BUSINESS_DATE


	final static String i_BUSINESS_DATE = null;

	// 第 99 変数初期値： i_HOME_CUR_CD


	final static String i_HOME_CUR_CD = null;

	// 第 100 変数初期値： i_QUOTE_CUST_CD


	final static String i_QUOTE_CUST_CD = null;

	// 第 101 変数初期値： i_QUOTE_CUR_CD


	final static String i_QUOTE_CUR_CD = null;

	// 第 102 変数初期値： i_QUOTE_CUR_UNIT


	final static String i_QUOTE_CUR_UNIT = null;

	// 第 103 変数初期値： i_QUOTE_PROJECT_CD


	final static String i_QUOTE_PROJECT_CD = null;

	// 第 104 変数初期値： i_UNIT_QTY_TYP


	final static String i_UNIT_QTY_TYP = null;

	// 第 105 変数初期値： i_UNIT_COST


	final static String i_UNIT_COST = null;

	// 第 106 変数初期値： i_ESTIMATE_NO


	final static String i_ESTIMATE_NO = null;

	// 第 107 変数初期値： i_UNOFFICIAL_RECEIPT_FLAG


	final static String i_UNOFFICIAL_RECEIPT_FLAG = null;

	// 第 108 変数初期値： i_ESTIMATE_ST


	final static String i_ESTIMATE_ST = null;

	// 第 109 変数初期値： i_USER


	final static String i_USER = null;

	// 第 110 変数初期値： i_PROGRAM_NAME


	final static String i_PROGRAM_NAME = null;

	// 第 111 変数初期値： i_h_ESTIMATE_ST


	final static String i_h_ESTIMATE_ST = null;

*/

	//{{user_implement_code
		// TODO: 初期化で使う定数は、ここに記述してください。
		// 以下に記述した内容は自動的には変更されません。
	// 第 1 変数初期値： i_ESTIMATE_NO

	final static String i_ESTIMATE_NO = null;

	// 第 2 変数初期値： i_l_CUR_UNIT

	final static String i_l_CUR_UNIT = null;

	// 第 3 変数初期値： i_DOWNLOAD_FILE

	final static String i_DOWNLOAD_FILE = null;

	// 第 4 変数初期値： i_l_FLAG

	final static String i_l_FLAG = null;

	// 第 5 変数初期値： i_QUOTE_ESTIMATE_NO

	final static String i_QUOTE_ESTIMATE_NO = null;

	// 第 6 変数初期値： i_l_ESTIMATE_NAME

	final static String i_l_ESTIMATE_NAME = null;

	// 第 7 変数初期値： i_l_SPEC_CLASS1_NAME

	final static String i_l_SPEC_CLASS1_NAME = null;

	// 第 8 変数初期値： i_l_SPEC_CLASS2_NAME

	final static String i_l_SPEC_CLASS2_NAME = null;

	// 第 9 変数初期値： i_l_SPEC_SELECT1_NAME

	final static String i_l_SPEC_SELECT1_NAME = null;

	// 第 10 変数初期値： i_l_SPEC_SELECT2_NAME

	final static String i_l_SPEC_SELECT2_NAME = null;

	// 第 11 変数初期値： i_l_SPEC_SELECT3_NAME

	final static String i_l_SPEC_SELECT3_NAME = null;

	// 第 12 変数初期値： i_l_SPEC_SELECT4_NAME

	final static String i_l_SPEC_SELECT4_NAME = null;

	// 第 13 変数初期値： i_l_ESTIMATE_TYP_name

	final static String i_l_ESTIMATE_TYP_name = null;

	// 第 14 変数初期値： i_l_ESTIMATE_TYP_val

	final static String i_l_ESTIMATE_TYP_val = null;

	// 第 15 変数初期値： i_l_SPEC_CLASS1_TYP_name

	final static String i_l_SPEC_CLASS1_TYP_name = null;

	// 第 16 変数初期値： i_l_SPEC_CLASS1_TYP_val

	final static String i_l_SPEC_CLASS1_TYP_val = null;

	// 第 17 変数初期値： i_l_SPEC_CLASS2_TYP_name

	final static String i_l_SPEC_CLASS2_TYP_name = null;

	// 第 18 変数初期値： i_l_SPEC_CLASS2_TYP_val

	final static String i_l_SPEC_CLASS2_TYP_val = null;

	// 第 19 変数初期値： i_l_SPEC_SELECT1_TYP_name

	final static String i_l_SPEC_SELECT1_TYP_name = null;

	// 第 20 変数初期値： i_l_SPEC_SELECT1_TYP_val

	final static String i_l_SPEC_SELECT1_TYP_val = null;

	// 第 21 変数初期値： i_l_SPEC_SELECT2_TYP_name

	final static String i_l_SPEC_SELECT2_TYP_name = null;

	// 第 22 変数初期値： i_l_SPEC_SELECT2_TYP_val

	final static String i_l_SPEC_SELECT2_TYP_val = null;

	// 第 23 変数初期値： i_l_SPEC_SELECT3_TYP_name

	final static String i_l_SPEC_SELECT3_TYP_name = null;

	// 第 24 変数初期値： i_l_SPEC_SELECT3_TYP_val

	final static String i_l_SPEC_SELECT3_TYP_val = null;

	// 第 25 変数初期値： i_l_SPEC_SELECT4_TYP_name

	final static String i_l_SPEC_SELECT4_TYP_name = null;

	// 第 26 変数初期値： i_l_SPEC_SELECT4_TYP_val

	final static String i_l_SPEC_SELECT4_TYP_val = null;

	// 第 27 変数初期値： i_h_ESTIMATE_NO

	final static String i_h_ESTIMATE_NO = null;

	// 第 28 変数初期値： i_PROJECT_NAME

	final static String i_PROJECT_NAME = null;

	// 第 29 変数初期値： i_h_CUST_CD

	final static String i_h_CUST_CD = null;

	// 第 30 変数初期値： i_ES_ORG_CD

	final static String i_ES_ORG_CD = null;

	// 第 31 変数初期値： i_ES_USER_CD

	final static String i_ES_USER_CD = null;

	// 第 32 変数初期値： i_ORG_NAME

	final static String i_ORG_NAME = null;

	// 第 33 変数初期値： i_USER_NAME

	final static String i_USER_NAME = null;

	// 第 34 変数初期値： i_PROJECT_STAT

	final static String i_PROJECT_STAT = null;

	// 第 35 変数初期値： i_PROJECT_CD

	final static String i_PROJECT_CD = null;

	// 第 36 変数初期値： i_COMPANY_CD

	final static String i_COMPANY_CD = null;

	// 第 37 変数初期値： i_CUST_NAME

	final static String i_CUST_NAME = null;

	// 第 38 変数初期値： i_h_CUR_CD

	final static String i_h_CUR_CD = null;

	// 第 39 変数初期値： i_CUR_UNIT

	final static String i_CUR_UNIT = null;

	// 第 40 変数初期値： i_h_PROJECT_CD

	final static String i_h_PROJECT_CD = null;

	// 第 41 変数初期値： i_ESTIMATE_STAT

	final static String i_ESTIMATE_STAT = null;

	// 第 42 変数初期値： i_ESTIMATE_DATE

	final static String i_ESTIMATE_DATE = null;

	// 第 43 変数初期値： i_ESTIMATE_AMOUNT

	final static String i_ESTIMATE_AMOUNT = null;

	// 第 44 変数初期値： i_ESTIMATE_AMOUNT_JPN

	final static String i_ESTIMATE_AMOUNT_JPN = null;

	// 第 45 変数初期値： i_ES_COMMET1

	final static String i_ES_COMMET1 = null;

	// 第 46 変数初期値： i_ES_COMMET2

	final static String i_ES_COMMET2 = null;

	// 第 47 変数初期値： i_ES_COMMET4

	final static String i_ES_COMMET4 = null;

	// 第 48 変数初期値： i_ES_COMMET3

	final static String i_ES_COMMET3 = null;

	// 第 49 変数初期値： i_ES_COMMET5

	final static String i_ES_COMMET5 = null;

	// 第 50 変数初期値： i_ESREMARK1

	final static String i_ESREMARK1 = null;

	// 第 51 変数初期値： i_ESREMARK2

	final static String i_ESREMARK2 = null;

	// 第 52 変数初期値： i_ESREMARK3

	final static String i_ESREMARK3 = null;

	// 第 53 変数初期値： i_ZIP_CD

	final static String i_ZIP_CD = null;

	// 第 54 変数初期値： i_ADDRESS_1

	final static String i_ADDRESS_1 = null;

	// 第 55 変数初期値： i_ADDRESS_2

	final static String i_ADDRESS_2 = null;

	// 第 56 変数初期値： i_TEL

	final static String i_TEL = null;

	// 第 57 変数初期値： i_l_DETAL_NO

	final static String i_l_DETAL_NO = null;

	// 第 58 変数初期値： i_l_ESTIMATE_TYP

	final static String i_l_ESTIMATE_TYP = null;

	// 第 59 変数初期値： i_l_CUST_ITEM_CD

	final static String i_l_CUST_ITEM_CD = null;

	// 第 60 変数初期値： i_l_ITEM_NAME

	final static String i_l_ITEM_NAME = null;

	// 第 61 変数初期値： i_l_DESINATED_DLV_DATE

	final static String i_l_DESINATED_DLV_DATE = null;

	// 第 62 変数初期値： i_l_ESTIMATE_QTY

	final static String i_l_ESTIMATE_QTY = null;

	// 第 63 変数初期値： i_l_UNIT_CD

	final static String i_l_UNIT_CD = null;

	// 第 64 変数初期値： i_l_UNIT_PRICE

	final static String i_l_UNIT_PRICE = null;

	// 第 65 変数初期値： i_l_DISCOUNT_PRICE

	final static String i_l_DISCOUNT_PRICE = null;

	// 第 66 変数初期値： i_l_ESTIMATE_UNIT_PRICE

	final static String i_l_ESTIMATE_UNIT_PRICE = null;

	// 第 67 変数初期値： i_l_AMOUNT

	final static String i_l_AMOUNT = null;

	// 第 68 変数初期値： i_l_DISCOUNT_AMOUNT

	final static String i_l_DISCOUNT_AMOUNT = null;

	// 第 69 変数初期値： i_l_ESTIMATE_AMOUNT

	final static String i_l_ESTIMATE_AMOUNT = null;

	// 第 70 変数初期値： i_l_ESTIMATE_AMOUNT_JPN

	final static String i_l_ESTIMATE_AMOUNT_JPN = null;

	// 第 71 変数初期値： i_l_ESTIMATE_GAIN

	final static String i_l_ESTIMATE_GAIN = null;

	// 第 72 変数初期値： i_l_ES_COST_MATERIAL

	final static String i_l_ES_COST_MATERIAL = null;

	// 第 73 変数初期値： i_l_ES_COST_PROCESS

	final static String i_l_ES_COST_PROCESS = null;

	// 第 74 変数初期値： i_l_ES_COST_OUTSOUCE

	final static String i_l_ES_COST_OUTSOUCE = null;

	// 第 75 変数初期値： i_l_ES_COST_ETC

	final static String i_l_ES_COST_ETC = null;

	// 第 76 変数初期値： i_l_ES_COST_ALL

	final static String i_l_ES_COST_ALL = null;

	// 第 77 変数初期値： i_l_ES_COST_SERVICE

	final static String i_l_ES_COST_SERVICE = null;

	// 第 78 変数初期値： i_l_SPEC_CLASS1_TYP

	final static String i_l_SPEC_CLASS1_TYP = null;

	// 第 79 変数初期値： i_l_SPEC_CLASS2_TYP

	final static String i_l_SPEC_CLASS2_TYP = null;

	// 第 80 変数初期値： i_l_SPEC_SELECT1_TYP

	final static String i_l_SPEC_SELECT1_TYP = null;

	// 第 81 変数初期値： i_l_SPEC_SELECT2_TYP

	final static String i_l_SPEC_SELECT2_TYP = null;

	// 第 82 変数初期値： i_l_SPEC_SELECT3_TYP

	final static String i_l_SPEC_SELECT3_TYP = null;

	// 第 83 変数初期値： i_l_SPEC_SELECT4_TYP

	final static String i_l_SPEC_SELECT4_TYP = null;

	// 第 84 変数初期値： i_l_REMARKS

	final static String i_l_REMARKS = null;

	// 第 85 変数初期値： i_l_UNIT_COST

	final static String i_l_UNIT_COST = null;

	// 第 86 変数初期値： i_l_CUST_ITEM_NAME

	final static String i_l_CUST_ITEM_NAME = null;

	// 第 87 変数初期値： i_h_MAX_DETAL_NO

	final static String i_h_MAX_DETAL_NO = null;

	// 第 88 変数初期値： i_l_COUNT

	final static String i_l_COUNT = null;

	// 第 89 変数初期値： i_ROW_COUNT

	final static String i_ROW_COUNT = null;

	// 第 90 変数初期値： i_BUSINESS_DATE

	final static String i_BUSINESS_DATE = null;

	// 第 91 変数初期値： i_HOME_CUR_CD

	final static String i_HOME_CUR_CD = null;

	// 第 92 変数初期値： i_QUOTE_CUST_CD

	final static String i_QUOTE_CUST_CD = null;

	// 第 93 変数初期値： i_QUOTE_CUR_CD

	final static String i_QUOTE_CUR_CD = null;

	// 第 94 変数初期値： i_QUOTE_PROJECT_CD

	final static String i_QUOTE_PROJECT_CD = null;


	/**
	 * 初期化
	 *
	 */
	public void initialize()
	{

		clear();

		m_ESTIMATE_NO = i_ESTIMATE_NO;
		m_l_CUR_UNIT = i_l_CUR_UNIT;
		m_DOWNLOAD_FILE = i_DOWNLOAD_FILE;
		m_l_FLAG = i_l_FLAG;
		m_QUOTE_ESTIMATE_NO = i_QUOTE_ESTIMATE_NO;
		m_l_ESTIMATE_NAME = i_l_ESTIMATE_NAME;
		m_l_SPEC_CLASS1_NAME = i_l_SPEC_CLASS1_NAME;
		m_l_SPEC_CLASS2_NAME = i_l_SPEC_CLASS2_NAME;
		m_l_SPEC_SELECT1_NAME = i_l_SPEC_SELECT1_NAME;
		m_l_SPEC_SELECT2_NAME = i_l_SPEC_SELECT2_NAME;
		m_l_SPEC_SELECT3_NAME = i_l_SPEC_SELECT3_NAME;
		m_l_SPEC_SELECT4_NAME = i_l_SPEC_SELECT4_NAME;
		m_l_ESTIMATE_TYP_name = i_l_ESTIMATE_TYP_name;
		m_l_ESTIMATE_TYP_val = i_l_ESTIMATE_TYP_val;
		m_l_SPEC_CLASS1_TYP_name = i_l_SPEC_CLASS1_TYP_name;
		m_l_SPEC_CLASS1_TYP_val = i_l_SPEC_CLASS1_TYP_val;
		m_l_SPEC_CLASS2_TYP_name = i_l_SPEC_CLASS2_TYP_name;
		m_l_SPEC_CLASS2_TYP_val = i_l_SPEC_CLASS2_TYP_val;
		m_l_SPEC_SELECT1_TYP_name = i_l_SPEC_SELECT1_TYP_name;
		m_l_SPEC_SELECT1_TYP_val = i_l_SPEC_SELECT1_TYP_val;
		m_l_SPEC_SELECT2_TYP_name = i_l_SPEC_SELECT2_TYP_name;
		m_l_SPEC_SELECT2_TYP_val = i_l_SPEC_SELECT2_TYP_val;
		m_l_SPEC_SELECT3_TYP_name = i_l_SPEC_SELECT3_TYP_name;
		m_l_SPEC_SELECT3_TYP_val = i_l_SPEC_SELECT3_TYP_val;
		m_l_SPEC_SELECT4_TYP_name = i_l_SPEC_SELECT4_TYP_name;
		m_l_SPEC_SELECT4_TYP_val = i_l_SPEC_SELECT4_TYP_val;
		m_h_ESTIMATE_NO = i_h_ESTIMATE_NO;
		m_PROJECT_NAME = i_PROJECT_NAME;
		m_h_CUST_CD = i_h_CUST_CD;
		m_ES_ORG_CD = i_ES_ORG_CD;
		m_ES_USER_CD = i_ES_USER_CD;
		m_ORG_NAME = i_ORG_NAME;
		m_USER_NAME = i_USER_NAME;
		m_PROJECT_STAT = i_PROJECT_STAT;
		m_PROJECT_CD = i_PROJECT_CD;
		m_COMPANY_CD = i_COMPANY_CD;
		m_CUST_NAME = i_CUST_NAME;
		m_h_CUR_CD = i_h_CUR_CD;
		m_CUR_UNIT = i_CUR_UNIT;
		m_h_PROJECT_CD = i_h_PROJECT_CD;
		m_ESTIMATE_STAT = i_ESTIMATE_STAT;
		m_ESTIMATE_DATE = i_ESTIMATE_DATE;
		m_ESTIMATE_AMOUNT = i_ESTIMATE_AMOUNT;
		m_ESTIMATE_AMOUNT_JPN = i_ESTIMATE_AMOUNT_JPN;
		m_ES_COMMET1 = i_ES_COMMET1;
		m_ES_COMMET2 = i_ES_COMMET2;
		m_ES_COMMET4 = i_ES_COMMET4;
		m_ES_COMMET3 = i_ES_COMMET3;
		m_ES_COMMET5 = i_ES_COMMET5;
		m_ESREMARK1 = i_ESREMARK1;
		m_ESREMARK2 = i_ESREMARK2;
		m_ESREMARK3 = i_ESREMARK3;
		m_ZIP_CD = i_ZIP_CD;
		m_ADDRESS_1 = i_ADDRESS_1;
		m_ADDRESS_2 = i_ADDRESS_2;
		m_TEL = i_TEL;
		m_l_DETAL_NO = i_l_DETAL_NO;
		m_l_ESTIMATE_TYP = i_l_ESTIMATE_TYP;
		m_l_CUST_ITEM_CD = i_l_CUST_ITEM_CD;
		m_l_ITEM_NAME = i_l_ITEM_NAME;
		m_l_DESINATED_DLV_DATE = i_l_DESINATED_DLV_DATE;
		m_l_ESTIMATE_QTY = i_l_ESTIMATE_QTY;
		m_l_UNIT_CD = i_l_UNIT_CD;
		m_l_UNIT_PRICE = i_l_UNIT_PRICE;
		m_l_DISCOUNT_PRICE = i_l_DISCOUNT_PRICE;
		m_l_ESTIMATE_UNIT_PRICE = i_l_ESTIMATE_UNIT_PRICE;
		m_l_AMOUNT = i_l_AMOUNT;
		m_l_DISCOUNT_AMOUNT = i_l_DISCOUNT_AMOUNT;
		m_l_ESTIMATE_AMOUNT = i_l_ESTIMATE_AMOUNT;
		m_l_ESTIMATE_AMOUNT_JPN = i_l_ESTIMATE_AMOUNT_JPN;
		m_l_ESTIMATE_GAIN = i_l_ESTIMATE_GAIN;
		m_l_ES_COST_MATERIAL = i_l_ES_COST_MATERIAL;
		m_l_ES_COST_PROCESS = i_l_ES_COST_PROCESS;
		m_l_ES_COST_OUTSOUCE = i_l_ES_COST_OUTSOUCE;
		m_l_ES_COST_ETC = i_l_ES_COST_ETC;
		m_l_ES_COST_ALL = i_l_ES_COST_ALL;
		m_l_ES_COST_SERVICE = i_l_ES_COST_SERVICE;
		m_l_SPEC_CLASS1_TYP = i_l_SPEC_CLASS1_TYP;
		m_l_SPEC_CLASS2_TYP = i_l_SPEC_CLASS2_TYP;
		m_l_SPEC_SELECT1_TYP = i_l_SPEC_SELECT1_TYP;
		m_l_SPEC_SELECT2_TYP = i_l_SPEC_SELECT2_TYP;
		m_l_SPEC_SELECT3_TYP = i_l_SPEC_SELECT3_TYP;
		m_l_SPEC_SELECT4_TYP = i_l_SPEC_SELECT4_TYP;
		m_l_REMARKS = i_l_REMARKS;
		m_l_UNIT_COST = i_l_UNIT_COST;
		m_l_CUST_ITEM_NAME = i_l_CUST_ITEM_NAME;
		m_h_MAX_DETAL_NO = i_h_MAX_DETAL_NO;
		m_l_COUNT = i_l_COUNT;
		m_ROW_COUNT = i_ROW_COUNT;
		m_BUSINESS_DATE = i_BUSINESS_DATE;
		m_HOME_CUR_CD = i_HOME_CUR_CD;
		m_QUOTE_CUST_CD = i_QUOTE_CUST_CD;
		m_QUOTE_CUR_CD = i_QUOTE_CUR_CD;
		m_QUOTE_PROJECT_CD = i_QUOTE_PROJECT_CD;
	}
		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
	public void keycopy(KM0020010Struct struct){
        if(struct.m_PROJECT_CD != null){ 
        	m_PROJECT_CD = new String(struct.m_PROJECT_CD);
        }else{
        	m_PROJECT_CD = null;
        }
        
        if(struct.m_ESTIMATE_NO!= null){ 
        	m_ESTIMATE_NO = new String(struct.m_ESTIMATE_NO);
        }else{
        	m_ESTIMATE_NO = null;
        }

        if(struct.m_PROJECT_NAME!= null){ 
        	m_PROJECT_NAME = new String(struct.m_PROJECT_NAME);
        }else{
        	m_PROJECT_NAME = null;
        }

        if(struct.m_QUOTE_PROJECT_CD!= null){ 
        	m_QUOTE_PROJECT_CD = new String(struct.m_QUOTE_PROJECT_CD);
        }else{
        	m_QUOTE_PROJECT_CD = null;
        }

        if(struct.m_QUOTE_ESTIMATE_NO!= null){ 
        	m_QUOTE_ESTIMATE_NO = new String(struct.m_QUOTE_ESTIMATE_NO);
        }else{
        	m_QUOTE_ESTIMATE_NO = null;
        }

        if(struct.m_ESTIMATE_STAT!= null){ 
        	m_ESTIMATE_STAT = new String(struct.m_ESTIMATE_STAT);
        }else{
        	m_ESTIMATE_STAT = null;
        }

        if(struct.m_CUST_NAME!= null){ 
        	m_CUST_NAME = new String(struct.m_CUST_NAME);
        }else{
        	m_CUST_NAME = null;
        }

        if(struct.m_ESTIMATE_DATE!= null){ 
        	m_ESTIMATE_DATE = new String(struct.m_ESTIMATE_DATE);
        }else{
        	m_ESTIMATE_DATE = null;
        }

        if(struct.m_ESTIMATE_AMOUNT!= null){ 
        	m_ESTIMATE_AMOUNT = new String(struct.m_ESTIMATE_AMOUNT);
        }else{
        	m_ESTIMATE_AMOUNT = null;
        }

        if(struct.m_CUR_UNIT!= null){ 
        	m_CUR_UNIT = new String(struct.m_CUR_UNIT);
        }else{
        	m_CUR_UNIT = null;
        }

        if(struct.m_ESTIMATE_AMOUNT_JPN!= null){ 
        	m_ESTIMATE_AMOUNT_JPN = new String(struct.m_ESTIMATE_AMOUNT_JPN);
        }else{
        	m_ESTIMATE_AMOUNT_JPN = null;
        }

        if(struct.m_ES_USER_CD!= null){ 
        	m_ES_USER_CD = new String(struct.m_ES_USER_CD);
        }else{
        	m_ES_USER_CD = null;
        }

        if(struct.m_ES_ORG_CD!= null){ 
        	m_ES_ORG_CD = new String(struct.m_ES_ORG_CD);
        }else{
        	m_ES_ORG_CD = null;
        }

        if(struct.m_ZIP_CD!= null){ 
        	m_ZIP_CD = new String(struct.m_ZIP_CD);
        }else{
        	m_ZIP_CD = null;
        }

        if(struct.m_ADDRESS_1!= null){ 
        	m_ADDRESS_1 = new String(struct.m_ADDRESS_1);
        }else{
        	m_ADDRESS_1 = null;
        }

        if(struct.m_ADDRESS_2!= null){ 
        	m_ADDRESS_2 = new String(struct.m_ADDRESS_2);
        }else{
        	m_ADDRESS_2 = null;
        }

        if(struct.m_ESREMARK1!= null){ 
        	m_ESREMARK1 = new String(struct.m_ESREMARK1);
        }else{
        	m_ESREMARK1 = null;
        }

        if(struct.m_ESREMARK2!= null){ 
        	m_ESREMARK2 = new String(struct.m_ESREMARK2);
        }else{
        	m_ESREMARK2 = null;
        }

        if(struct.m_ESREMARK3!= null){ 
        	m_ESREMARK3 = new String(struct.m_ESREMARK3);
        }else{
        	m_ESREMARK3 = null;
        }

        if(struct.m_ES_COMMET1!= null){ 
        	m_ES_COMMET1 = new String(struct.m_ES_COMMET1);
        }else{
        	m_ES_COMMET1 = null;
        }

        if(struct.m_ES_COMMET2!= null){ 
        	m_ES_COMMET2 = new String(struct.m_ES_COMMET2);
        }else{
        	m_ES_COMMET2 = null;
        }

        if(struct.m_ES_COMMET4!= null){ 
        	m_ES_COMMET4 = new String(struct.m_ES_COMMET4);
        }else{
        	m_ES_COMMET4 = null;
        }

        if(struct.m_ES_COMMET3!= null){ 
        	m_ES_COMMET3 = new String(struct.m_ES_COMMET3);
        }else{
        	m_ES_COMMET3 = null;
        }

        if(struct.m_ES_COMMET5!= null){ 
        	m_ES_COMMET5 = new String(struct.m_ES_COMMET5);
        }else{
        	m_ES_COMMET5 = null;
        }

        if(struct.m_USER_NAME!= null){ 
        	m_USER_NAME = new String(struct.m_USER_NAME);
        }else{
        	m_USER_NAME = null;
        }

        if(struct.m_ORG_NAME!= null){ 
        	m_ORG_NAME = new String(struct.m_ORG_NAME);
        }else{
        	m_ORG_NAME = null;
        }

        if(struct.m_TEL!= null){ 
        	m_TEL = new String(struct.m_TEL);
        }else{
        	m_TEL = null;
        }

        if(struct.m_h_MAX_DETAL_NO!= null){ 
        	m_h_MAX_DETAL_NO = new String(struct.m_h_MAX_DETAL_NO);
        }else{
        	m_h_MAX_DETAL_NO = null;
        }

        if(struct.m_h_CUST_CD!= null){ 
        	m_h_CUST_CD = new String(struct.m_h_CUST_CD);
        }else{
        	m_h_CUST_CD = null;
        }

        if(struct.m_h_CUR_CD!= null){ 
        	m_h_CUR_CD = new String(struct.m_h_CUR_CD);
        }else{
        	m_h_CUR_CD = null;
        }
        if(struct.m_PROJECT_STAT != null){ 
        	m_PROJECT_STAT = new String(struct.m_PROJECT_STAT);
        }else{
        	m_PROJECT_STAT = null;
        }
        if(struct.m_UNOFFICIAL_RECEIPT_FLG != null){ 
        	m_UNOFFICIAL_RECEIPT_FLG = new String(struct.m_UNOFFICIAL_RECEIPT_FLG);
        }else{
        	m_UNOFFICIAL_RECEIPT_FLG = null;
        }
    }
	//明細部
	public void copy(KM0020010Struct struct){
		if(struct.m_PROJECT_CD != null){ 
        	m_PROJECT_CD = new String(struct.m_PROJECT_CD);
        }else{
        	m_PROJECT_CD = null;
        }
		
        if(struct.m_ESTIMATE_NO!= null){ 
        	m_ESTIMATE_NO = new String(struct.m_ESTIMATE_NO);
        }else{
        	m_ESTIMATE_NO = null;
        }
        
        if(struct.m_l_DETAL_NO != null){ 
        	m_l_DETAL_NO = new String(struct.m_l_DETAL_NO);
        }else{
        	m_l_DETAL_NO = null;
        }
        
        if(struct.m_l_ESTIMATE_NAME != null){ 
        	m_l_ESTIMATE_NAME = new String(struct.m_l_ESTIMATE_NAME);
        }else{
        	m_l_ESTIMATE_NAME = null;
        }

        if(struct.m_l_CUST_ITEM_CD != null){ 
        	m_l_CUST_ITEM_CD = new String(struct.m_l_CUST_ITEM_CD);
        }else{
        	m_l_CUST_ITEM_CD = null;
        }

        if(struct.m_l_ITEM_NAME != null){ 
        	m_l_ITEM_NAME = new String(struct.m_l_ITEM_NAME);
        }else{
        	m_l_ITEM_NAME = null;
        }

        if(struct.m_l_DESINATED_DLV_DATE != null){ 
        	m_l_DESINATED_DLV_DATE = new String(struct.m_l_DESINATED_DLV_DATE);
        }else{
        	m_l_DESINATED_DLV_DATE = null;
        }

        if(struct.m_l_ESTIMATE_QTY != null){ 
        	m_l_ESTIMATE_QTY = new String(struct.m_l_ESTIMATE_QTY);
        }else{
        	m_l_ESTIMATE_QTY = null;
        }

        if(struct.m_l_UNIT_CD != null){ 
        	m_l_UNIT_CD = new String(struct.m_l_UNIT_CD);
        }else{
        	m_l_UNIT_CD = null;
        }

        if(struct.m_l_UNIT_PRICE != null){ 
        	m_l_UNIT_PRICE = new String(struct.m_l_UNIT_PRICE);
        }else{
        	m_l_UNIT_PRICE = null;
        }

        if(struct.m_l_DISCOUNT_PRICE != null){ 
        	m_l_DISCOUNT_PRICE = new String(struct.m_l_DISCOUNT_PRICE);
        }else{
        	m_l_DISCOUNT_PRICE = null;
        }

        if(struct.m_l_ESTIMATE_UNIT_PRICE != null){ 
        	m_l_ESTIMATE_UNIT_PRICE = new String(struct.m_l_ESTIMATE_UNIT_PRICE);
        }else{
        	m_l_ESTIMATE_UNIT_PRICE = null;
        }

        if(struct.m_l_CUR_UNIT != null){ 
        	m_l_CUR_UNIT = new String(struct.m_l_CUR_UNIT);
        }else{
        	m_l_CUR_UNIT = null;
        }

        if(struct.m_l_AMOUNT != null){ 
        	m_l_AMOUNT = new String(struct.m_l_AMOUNT);
        }else{
        	m_l_AMOUNT = null;
        }
        
        if(struct.m_l_DISCOUNT_AMOUNT != null){ 
        	m_l_DISCOUNT_AMOUNT = new String(struct.m_l_DISCOUNT_AMOUNT);
        }else{
        	m_l_DISCOUNT_AMOUNT = null;
        }

        if(struct.m_l_ESTIMATE_AMOUNT != null){ 
        	m_l_ESTIMATE_AMOUNT = new String(struct.m_l_ESTIMATE_AMOUNT);
        }else{
        	m_l_ESTIMATE_AMOUNT = null;
        }

        if(struct.m_l_ESTIMATE_AMOUNT_JPN != null){ 
        	m_l_ESTIMATE_AMOUNT_JPN = new String(struct.m_l_ESTIMATE_AMOUNT_JPN);
        }else{
        	m_l_ESTIMATE_AMOUNT_JPN = null;
        }
        
        if(struct.m_l_ES_COST_ALL != null){ 
        	m_l_ES_COST_ALL = new String(struct.m_l_ES_COST_ALL);
        }else{
        	m_l_ES_COST_ALL = null;
        }
        
        if(struct.m_l_ESTIMATE_GAIN != null){ 
        	m_l_ESTIMATE_GAIN = new String(struct.m_l_ESTIMATE_GAIN);
        }else{
        	m_l_ESTIMATE_GAIN = null;
        }
        
        if(struct.m_l_ES_COST_MATERIAL != null){ 
        	m_l_ES_COST_MATERIAL = new String(struct.m_l_ES_COST_MATERIAL);
        }else{
        	m_l_ES_COST_MATERIAL = null;
        }
        
        if(struct.m_l_ES_COST_PROCESS != null){ 
        	m_l_ES_COST_PROCESS = new String(struct.m_l_ES_COST_PROCESS);
        }else{
        	m_l_ES_COST_PROCESS = null;
        }

        if(struct.m_l_ES_COST_OUTSOUCE != null){ 
        	m_l_ES_COST_OUTSOUCE = new String(struct.m_l_ES_COST_OUTSOUCE);
        }else{
        	m_l_ES_COST_OUTSOUCE = null;
        }

        if(struct.m_l_ES_COST_ETC != null){ 
        	m_l_ES_COST_ETC = new String(struct.m_l_ES_COST_ETC);
        }else{
        	m_l_ES_COST_ETC = null;
        }

        if(struct.m_l_ES_COST_SERVICE != null){ 
        	m_l_ES_COST_SERVICE = new String(struct.m_l_ES_COST_SERVICE);
        }else{
        	m_l_ES_COST_SERVICE = null;
        }

        if(struct.m_l_SPEC_CLASS1_NAME != null){ 
        	m_l_SPEC_CLASS1_NAME = new String(struct.m_l_SPEC_CLASS1_NAME);
        }else{
        	m_l_SPEC_CLASS1_NAME = null;
        }

        if(struct.m_l_SPEC_CLASS2_NAME != null){ 
        	m_l_SPEC_CLASS2_NAME = new String(struct.m_l_SPEC_CLASS2_NAME);
        }else{
        	m_l_SPEC_CLASS2_NAME = null;
        }

        if(struct.m_l_SPEC_SELECT1_NAME != null){ 
        	m_l_SPEC_SELECT1_NAME = new String(struct.m_l_SPEC_SELECT1_NAME);
        }else{
        	m_l_SPEC_SELECT1_NAME = null;
        }

        if(struct.m_l_SPEC_SELECT2_NAME != null){ 
        	m_l_SPEC_SELECT2_NAME = new String(struct.m_l_SPEC_SELECT2_NAME);
        }else{
        	m_l_SPEC_SELECT2_NAME = null;
        }

        if(struct.m_l_SPEC_SELECT3_NAME != null){ 
        	m_l_SPEC_SELECT3_NAME = new String(struct.m_l_SPEC_SELECT3_NAME);
        }else{
        	m_l_SPEC_SELECT3_NAME = null;
        }

        if(struct.m_l_SPEC_SELECT4_NAME != null){ 
        	m_l_SPEC_SELECT4_NAME = new String(struct.m_l_SPEC_SELECT4_NAME);
        }else{
        	m_l_SPEC_SELECT4_NAME = null;
        }

        if(struct.m_l_REMARKS != null){ 
        	m_l_REMARKS = new String(struct.m_l_REMARKS);
        }else{
        	m_l_REMARKS = null;
        }

        if(struct.m_l_CUST_ITEM_NAME != null){ 
        	m_l_CUST_ITEM_NAME = new String(struct.m_l_CUST_ITEM_NAME);
        }else{
        	m_l_CUST_ITEM_NAME = null;
        }

        if(struct.m_l_UNIT_COST != null){ 
        	m_l_UNIT_COST = new String(struct.m_l_UNIT_COST);
        }else{
        	m_l_UNIT_COST = null;
        }

        if(struct.m_l_FLAG != null){ 
        	m_l_FLAG = new String(struct.m_l_FLAG);
        }else{
        	m_l_FLAG = null;
        }

        if(struct.m_l_ESTIMATE_TYP != null){ 
        	m_l_ESTIMATE_TYP = new String(struct.m_l_ESTIMATE_TYP);
        }else{
        	m_l_ESTIMATE_TYP = null;
        }

        if(struct.m_l_SPEC_CLASS1_TYP != null){ 
        	m_l_SPEC_CLASS1_TYP = new String(struct.m_l_SPEC_CLASS1_TYP);
        }else{
        	m_l_SPEC_CLASS1_TYP = null;
        }

        if(struct.m_l_SPEC_CLASS2_TYP != null){ 
        	m_l_SPEC_CLASS2_TYP = new String(struct.m_l_SPEC_CLASS2_TYP);
        }else{
        	m_l_SPEC_CLASS2_TYP = null;
        }

        if(struct.m_l_SPEC_SELECT1_TYP != null){ 
        	m_l_SPEC_SELECT1_TYP = new String(struct.m_l_SPEC_SELECT1_TYP);
        }else{
        	m_l_SPEC_SELECT1_TYP = null;
        }

        if(struct.m_l_SPEC_SELECT2_TYP != null){ 
        	m_l_SPEC_SELECT2_TYP = new String(struct.m_l_SPEC_SELECT2_TYP);
        }else{
        	m_l_SPEC_SELECT2_TYP = null;
        }

        if(struct.m_l_SPEC_SELECT3_TYP != null){ 
        	m_l_SPEC_SELECT3_TYP = new String(struct.m_l_SPEC_SELECT3_TYP);
        }else{
        	m_l_SPEC_SELECT3_TYP = null;
        }

        if(struct.m_l_SPEC_SELECT4_TYP != null){ 
        	m_l_SPEC_SELECT4_TYP = new String(struct.m_l_SPEC_SELECT4_TYP);
        }else{
        	m_l_SPEC_SELECT4_TYP = null;
        }
    }
        //}}user_implement_code

	//////////////////////////////

}
