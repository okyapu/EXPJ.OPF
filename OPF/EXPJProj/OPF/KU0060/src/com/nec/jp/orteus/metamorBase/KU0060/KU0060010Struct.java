/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KU0060/src/com/nec/jp/orteus/metamorBase/KU0060/KU0060010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.KU0060;

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
 * CLASS     : KU0060010Control クラス
 * ファイル・クラス説明
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.14 $ $Date: 2015/11/16 05:16:59 $
 *
 */
//}}user_implement_code_header

public class KU0060010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_r1_SHIP_ODR */
	public String m_r1_SHIP_ODR = null;
	/** 第 2 変数： m_r2_SHIP_ODR */
	public String m_r2_SHIP_ODR = null;
	/** 第 3 変数： m_tAnsDlvDate_MODIFY_COUNT */
	public String m_tAnsDlvDate_MODIFY_COUNT = null;
	/** 第 4 変数： m_tShipOdr_MODIFY_COUNT */
	public String m_tShipOdr_MODIFY_COUNT = null;
	/** 第 5 変数： m_Shipt_MODIFY_COUNT */
	public String m_Shipt_MODIFY_COUNT = null;
	/** 第 6 変数： m_h_RESULT */
	public String m_h_RESULT = null;
	/** 第 7 変数： m_strBUSINESS_OPR_DATE */
	public String m_strBUSINESS_OPR_DATE = null;
	/** 第 8 変数： m_strPLANT_CD */
	public String m_strPLANT_CD = null;
	/** 第 9 変数： m_strTaxTAX_KBN */
	public String m_strTaxTAX_KBN = null;
	/** 第 10 変数： m_strTaxOLD_TAX_1 */
	public String m_strTaxOLD_TAX_1 = null;
	/** 第 11 変数： m_strTaxOLD_TAX_2 */
	public String m_strTaxOLD_TAX_2 = null;
	/** 第 12 変数： m_strTaxOLD_TAX_3 */
	public String m_strTaxOLD_TAX_3 = null;
	/** 第 13 変数： m_strTaxNEW_TAX_1 */
	public String m_strTaxNEW_TAX_1 = null;
	/** 第 14 変数： m_strTaxNEW_TAX_2 */
	public String m_strTaxNEW_TAX_2 = null;
	/** 第 15 変数： m_strTaxNEW_TAX_3 */
	public String m_strTaxNEW_TAX_3 = null;
	/** 第 16 変数： m_strTaxSTART_DATE */
	public String m_strTaxSTART_DATE = null;
	/** 第 17 変数： m_strTaxROUND_TYP */
	public String m_strTaxROUND_TYP = null;
	/** 第 18 変数： m_strTaxIN_COMPANYCD */
	public String m_strTaxIN_COMPANYCD = null;
	/** 第 19 変数： m_strTaxIN_CUSTCD */
	public String m_strTaxIN_CUSTCD = null;
	/** 第 20 変数： m_l_CUST_ITEM_CD */
	public String m_l_CUST_ITEM_CD = null;
	/** 第 21 変数： m_tDECIMAL_FIG */
	public String m_tDECIMAL_FIG = null;
	/** 第 22 変数： m_tCUR_CD */
	public String m_tCUR_CD = null;
	/** 第 23 変数： m_strCOMPANY_CD */
	public String m_strCOMPANY_CD = null;
	/** 第 24 変数： m_strUSER_NAME */
	public String m_strUSER_NAME = null;
	/** 第 25 変数： m_strSECTION_CD */
	public String m_strSECTION_CD = null;
	/** 第 26 変数： m_strPLANT_NAME */
	public String m_strPLANT_NAME = null;
	/** 第 27 変数： m_strPLANT_ANAME */
	public String m_strPLANT_ANAME = null;
	/** 第 28 変数： m_strCAL_NO */
	public String m_strCAL_NO = null;
	/** 第 29 変数： m_strUSER_CD */
	public String m_strUSER_CD = null;
	/** 第 30 変数： m_strSYUKA_LT */
	public String m_strSYUKA_LT = null;
	/** 第 31 変数： m_tHOLIDAY_FLG */
	public String m_tHOLIDAY_FLG = null;
	/** 第 32 変数： m_tWH_CD */
	public String m_tWH_CD = null;
	/** 第 33 変数： m_tCAL_DATE */
	public String m_tCAL_DATE = null;
	/** 第 34 変数： m_l_ODR_NO */
	public String m_l_ODR_NO = null;
	/** 第 35 変数： m_l_PART_DLV_SEQ_NO */
	public String m_l_PART_DLV_SEQ_NO = null;
	/** 第 36 変数： m_l_DESINATED_DLV_DATE */
	public String m_l_DESINATED_DLV_DATE = null;
	/** 第 37 変数： m_l_DESINATED_SHIP_DATE */
	public String m_l_DESINATED_SHIP_DATE = null;
	/** 第 38 変数： m_l_SHIP_QTY */
	public String m_l_SHIP_QTY = null;
	/** 第 39 変数： m_l_REST_SHIP_QTY */
	public String m_l_REST_SHIP_QTY = null;
	/** 第 40 変数： m_l_WH_CD */
	public String m_l_WH_CD = null;
	/** 第 41 変数： m_l_WH_NAME */
	public String m_l_WH_NAME = null;
	/** 第 42 変数： m_l_CUST_ODR_NO */
	public String m_l_CUST_ODR_NO = null;
	/** 第 43 変数： m_l_CUST_CD */
	public String m_l_CUST_CD = null;
	/** 第 44 変数： m_l_CUST_NAME */
	public String m_l_CUST_NAME = null;
	/** 第 45 変数： m_l_CUST_ITEM_NAME */
	public String m_l_CUST_ITEM_NAME = null;
	/** 第 46 変数： m_l_ITEM_CD */
	public String m_l_ITEM_CD = null;
	/** 第 47 変数： m_l_ITEM_NAME */
	public String m_l_ITEM_NAME = null;
	/** 第 48 変数： m_l_STOCK_UNIT */
	public String m_l_STOCK_UNIT = null;
	/** 第 49 変数： m_l_UNIT_QTY_TYP */
	public String m_l_UNIT_QTY_TYP = null;
	/** 第 50 変数： m_l_MRP_ODR_TYP */
	public String m_l_MRP_ODR_TYP = null;
	/** 第 51 変数： m_l_ODR_CTL_NO */
	public String m_l_ODR_CTL_NO = null;
	/** 第 52 変数： m_l_TRANSPORT_TYP */
	public String m_l_TRANSPORT_TYP = null;
	/** 第 53 変数： m_l_ODR_UNIT_PRICE */
	public String m_l_ODR_UNIT_PRICE = null;
	/** 第 54 変数： m_l_SPCL_PRICE_TYP */
	public String m_l_SPCL_PRICE_TYP = null;
	/** 第 55 変数： m_l_PARTIAL_SHIP_INST_FLG */
	public String m_l_PARTIAL_SHIP_INST_FLG = null;
	/** 第 56 変数： m_l_MODIFY_COUNT */
	public String m_l_MODIFY_COUNT = null;
	/** 第 57 変数： m_l_JOB_ODR_CD */
	public String m_l_JOB_ODR_CD = null;
	/** 第 58 変数： m_ODR_NO */
	public String m_ODR_NO = null;
	/** 第 59 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 60 変数： m_DESINATED_DLV_DATE */
	public String m_DESINATED_DLV_DATE = null;
	/** 第 61 変数： m_DESINATED_SHIP_DATE */
	public String m_DESINATED_SHIP_DATE = null;
	/** 第 62 変数： m_CUST_CD */
	public String m_CUST_CD = null;
	/** 第 63 変数： m_CUST_CHRG_PSN_CD */
	public String m_CUST_CHRG_PSN_CD = null;
	/** 第 64 変数： m_CUST_ODR_NO */
	public String m_CUST_ODR_NO = null;
	/** 第 65 変数： m_CUST_ITEM_CD */
	public String m_CUST_ITEM_CD = null;
	/** 第 66 変数： m_up_tAnsDlvDate_DESINATED_SHIP_DATE */
	public String m_up_tAnsDlvDate_DESINATED_SHIP_DATE = null;
	/** 第 67 変数： m_up_tAnsDlvDate_REST_SHIP_ODR_QTY */
	public String m_up_tAnsDlvDate_REST_SHIP_ODR_QTY = null;
	/** 第 68 変数： m_up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG */
	public String m_up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG = null;
	/** 第 69 変数： m_up_tAnsDlvDate_IN_ODRNO */
	public String m_up_tAnsDlvDate_IN_ODRNO = null;
	/** 第 70 変数： m_up_tAnsDlvDate_IN_PARTDLVSEQNO */
	public String m_up_tAnsDlvDate_IN_PARTDLVSEQNO = null;
	/** 第 71 変数： m_l_SLIP_CD */
	public String m_l_SLIP_CD = null;
	/** 第 72 変数： m_l_c_DIRECT_DLV_FLG */
	public String m_l_c_DIRECT_DLV_FLG = null;
	/** 第 73 変数： m_l_DLV_MODIFY_COUNT */
	public String m_l_DLV_MODIFY_COUNT = null;
	/** 第 74 変数： m_SLIP_CD */
	public String m_SLIP_CD = null;
	/** 第 75 変数： m_in_tShipOdr_ODR_NO */
	public String m_in_tShipOdr_ODR_NO = null;
	/** 第 76 変数： m_in_tShipOdr_PART_DLV_SEQ_NO */
	public String m_in_tShipOdr_PART_DLV_SEQ_NO = null;
	/** 第 77 変数： m_in_tShipOdr_SLIP_CD */
	public String m_in_tShipOdr_SLIP_CD = null;
	/** 第 78 変数： m_in_tShipOdr_ITEM_CD */
	public String m_in_tShipOdr_ITEM_CD = null;
	/** 第 79 変数： m_in_tShipOdr_CUST_ITEM_CD */
	public String m_in_tShipOdr_CUST_ITEM_CD = null;
	/** 第 80 変数： m_in_tShipOdr_CUST_ODR_NO */
	public String m_in_tShipOdr_CUST_ODR_NO = null;
	/** 第 81 変数： m_in_tShipOdr_CUST_CD */
	public String m_in_tShipOdr_CUST_CD = null;
	/** 第 82 変数： m_in_tShipOdr_CUST_NAME */
	public String m_in_tShipOdr_CUST_NAME = null;
	/** 第 83 変数： m_in_tShipOdr_SHIP_ODR_ISS_PSN_CD */
	public String m_in_tShipOdr_SHIP_ODR_ISS_PSN_CD = null;
	/** 第 84 変数： m_in_tShipOdr_DLV_LOC_CD */
	public String m_in_tShipOdr_DLV_LOC_CD = null;
	/** 第 85 変数： m_in_tShipOdr_DESINATED_SHIP_DATE */
	public String m_in_tShipOdr_DESINATED_SHIP_DATE = null;
	/** 第 86 変数： m_in_tShipOdr_SHIP_QTY */
	public String m_in_tShipOdr_SHIP_QTY = null;
	/** 第 87 変数： m_in_tShipOdr_UNIT_PRICE */
	public String m_in_tShipOdr_UNIT_PRICE = null;
	/** 第 88 変数： m_in_tShipOdr_SHIP_ODR_AMOUNT */
	public Double m_in_tShipOdr_SHIP_ODR_AMOUNT = null;
	/** 第 89 変数： m_in_tShipOdr_CURRNCY_CD */
	public String m_in_tShipOdr_CURRNCY_CD = null;
	/** 第 90 変数： m_in_tShipOdr_PKG_UNIT_QTY */
	public String m_in_tShipOdr_PKG_UNIT_QTY = null;
	/** 第 91 変数： m_in_tShipOdr_REMARKS */
	public String m_in_tShipOdr_REMARKS = null;
	/** 第 92 変数： m_in_tShipOdr_ALLCT_WH_CD */
	public String m_in_tShipOdr_ALLCT_WH_CD = null;
	/** 第 93 変数： m_in_tShipOdr_DEPO_TYP */
	public String m_in_tShipOdr_DEPO_TYP = null;
	/** 第 94 変数： m_in_tShipOdr_ENTRY_TYP */
	public String m_in_tShipOdr_ENTRY_TYP = null;
	/** 第 95 変数： m_in_tShipOdr_PRINT_FLG */
	public String m_in_tShipOdr_PRINT_FLG = null;
	/** 第 96 変数： m_in_tShipOdr_SHP_CMPLT_FLG */
	public String m_in_tShipOdr_SHP_CMPLT_FLG = null;
	/** 第 97 変数： m_in_tShipOdr_DEL_FLG */
	public String m_in_tShipOdr_DEL_FLG = null;
	/** 第 98 変数： m_in_tShipOdr_TRANSPORT_CD */
	public String m_in_tShipOdr_TRANSPORT_CD = null;
	/** 第 99 変数： m_in_tShipOdr_DIRECT_DLV_FLG */
	public String m_in_tShipOdr_DIRECT_DLV_FLG = null;
	/** 第 100 変数： m_in_tShipOdr_CUST_CHRG_PSN_CD */
	public String m_in_tShipOdr_CUST_CHRG_PSN_CD = null;
	/** 第 101 変数： m_in_tShipOdr_UNIT_CD */
	public String m_in_tShipOdr_UNIT_CD = null;
	/** 第 102 変数： m_in_tShipOdr_SCDL_DLV_DATE */
	public String m_in_tShipOdr_SCDL_DLV_DATE = null;
	/** 第 103 変数： m_in_tShipOdr_TRANSFER_WH_CD */
	public String m_in_tShipOdr_TRANSFER_WH_CD = null;
	/** 第 104 変数： m_in_tShipOdr_DLV_KEY_NO */
	public String m_in_tShipOdr_DLV_KEY_NO = null;
	/** 第 105 変数： m_in_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES */
	public Double m_in_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES = null;
	/** 第 106 変数： m_in_tShipOdr_SHIP_ODR_NO */
	public String m_in_tShipOdr_SHIP_ODR_NO = null;
	/** 第 107 変数： m_in_tShipOdr_JOB_ODR_CD */
	public String m_in_tShipOdr_JOB_ODR_CD = null;
	/** 第 108 変数： m_del_tShipOdr_IN_SLIPCD */
	public String m_del_tShipOdr_IN_SLIPCD = null;
	/** 第 109 変数： m_chkisinWhCd_WH_CD */
	public String m_chkisinWhCd_WH_CD = null;
	/** 第 110 変数： m_chkisinWhCd_WH_TYP */
	public String m_chkisinWhCd_WH_TYP = null;
	/** 第 111 変数： m_chkis_IN_WHCD */
	public String m_chkis_IN_WHCD = null;
	/** 第 112 変数： m_chkisWhCd_WH_CD */
	public String m_chkisWhCd_WH_CD = null;
	/** 第 113 変数： m_chkisWhCd_WH_TYP */
	public String m_chkisWhCd_WH_TYP = null;
	/** 第 114 変数： m_chkisWhCd_ITEM_CD */
	public String m_chkisWhCd_ITEM_CD = null;
	/** 第 115 変数： m_chkisWhCd_PBL_SHIP_QTY */
	public String m_chkisWhCd_PBL_SHIP_QTY = null;
	/** 第 116 変数： m_chkisWhCd_IN_ITEMCD */
	public String m_chkisWhCd_IN_ITEMCD = null;
	/** 第 117 変数： m_chkisWhCd_IN_WHCD */
	public String m_chkisWhCd_IN_WHCD = null;
	/** 第 118 変数： m_tOdr_ODR_NO */
	public String m_tOdr_ODR_NO = null;
	/** 第 119 変数： m_tOdr_ODR_TYP */
	public String m_tOdr_ODR_TYP = null;
	/** 第 120 変数： m_tOdr_ODR_CTL_NO */
	public String m_tOdr_ODR_CTL_NO = null;
	/** 第 121 変数： m_tOdr_CUST_ODR_NO */
	public String m_tOdr_CUST_ODR_NO = null;
	/** 第 122 変数： m_tOdr_CUST_CHRG_ORG_CD */
	public String m_tOdr_CUST_CHRG_ORG_CD = null;
	/** 第 123 変数： m_tOdr_CUST_CHRG_PSN_CD */
	public String m_tOdr_CUST_CHRG_PSN_CD = null;
	/** 第 124 変数： m_tOdr_ODR_ACPT_ORG_CD */
	public String m_tOdr_ODR_ACPT_ORG_CD = null;
	/** 第 125 変数： m_tOdr_ODR_ACPT_PSN_CD */
	public String m_tOdr_ODR_ACPT_PSN_CD = null;
	/** 第 126 変数： m_tOdr_CURRNCY_CD */
	public String m_tOdr_CURRNCY_CD = null;
	/** 第 127 変数： m_tOdr_EXCH_TYP */
	public String m_tOdr_EXCH_TYP = null;
	/** 第 128 変数： m_tOdr_DLV_LOC_CD */
	public String m_tOdr_DLV_LOC_CD = null;
	/** 第 129 変数： m_tOdr_DLV_LOC_CD_EIAJ */
	public String m_tOdr_DLV_LOC_CD_EIAJ = null;
	/** 第 130 変数： m_tOdr_DLV_LOC_NAME */
	public String m_tOdr_DLV_LOC_NAME = null;
	/** 第 131 変数： m_tOdr_DLV_LOC_NAME_KANJI */
	public String m_tOdr_DLV_LOC_NAME_KANJI = null;
	/** 第 132 変数： m_tOdr_PRD_ODR_PLACE_CD */
	public String m_tOdr_PRD_ODR_PLACE_CD = null;
	/** 第 133 変数： m_tOdr_ODR_UNIT_PRICE */
	public String m_tOdr_ODR_UNIT_PRICE = null;
	/** 第 134 変数： m_tOdr_SPCL_PRICE_TYP */
	public String m_tOdr_SPCL_PRICE_TYP = null;
	/** 第 135 変数： m_tOdr_PART_DLV_COUNT */
	public String m_tOdr_PART_DLV_COUNT = null;
	/** 第 136 変数： m_tOdr_DEPO_TYP */
	public String m_tOdr_DEPO_TYP = null;
	/** 第 137 変数： m_tOdr_DESINATED_DLV_DATE */
	public String m_tOdr_DESINATED_DLV_DATE = null;
	/** 第 138 変数： m_tOdr_STD_DESINATED_RCV_DATE */
	public String m_tOdr_STD_DESINATED_RCV_DATE = null;
	/** 第 139 変数： m_tOdr_ODR_QTY */
	public String m_tOdr_ODR_QTY = null;
	/** 第 140 変数： m_tOdr_REMAIN_UNCONFIRM_ODR_QTY */
	public String m_tOdr_REMAIN_UNCONFIRM_ODR_QTY = null;
	/** 第 141 変数： m_tOdr_CANCELED_UNCONFIRM_ODR_QTY */
	public String m_tOdr_CANCELED_UNCONFIRM_ODR_QTY = null;
	/** 第 142 変数： m_tOdr_UNIT_CD */
	public String m_tOdr_UNIT_CD = null;
	/** 第 143 変数： m_tOdr_UNCONFIRM_ODR_BALANCE */
	public String m_tOdr_UNCONFIRM_ODR_BALANCE = null;
	/** 第 144 変数： m_tOdr_ODR_AMOUNT */
	public String m_tOdr_ODR_AMOUNT = null;
	/** 第 145 変数： m_tOdr_ODR_AMOUNT_EXCH_RATES */
	public String m_tOdr_ODR_AMOUNT_EXCH_RATES = null;
	/** 第 146 変数： m_tOdr_TOTAL_SHIP_QTY */
	public String m_tOdr_TOTAL_SHIP_QTY = null;
	/** 第 147 変数： m_tOdr_SHIP_AMOUNT */
	public String m_tOdr_SHIP_AMOUNT = null;
	/** 第 148 変数： m_tOdr_SHIP_AMOUNT_EXCH_RATES */
	public String m_tOdr_SHIP_AMOUNT_EXCH_RATES = null;
	/** 第 149 変数： m_tOdr_RETURN_PRICE */
	public String m_tOdr_RETURN_PRICE = null;
	/** 第 150 変数： m_tOdr_RETURN_QTY */
	public String m_tOdr_RETURN_QTY = null;
	/** 第 151 変数： m_tOdr_RETURN_AMOUNT */
	public String m_tOdr_RETURN_AMOUNT = null;
	/** 第 152 変数： m_tOdr_RETURN_AMOUNT_EXCH_RATES */
	public String m_tOdr_RETURN_AMOUNT_EXCH_RATES = null;
	/** 第 153 変数： m_tOdr_ODR_CMPLT_FLG */
	public String m_tOdr_ODR_CMPLT_FLG = null;
	/** 第 154 変数： m_tOdr_ODR_CMPLT_DATE */
	public String m_tOdr_ODR_CMPLT_DATE = null;
	/** 第 155 変数： m_tOdr_CUS_DLV_CD */
	public String m_tOdr_CUS_DLV_CD = null;
	/** 第 156 変数： m_tOdr_CUS_DLV_KEY_CD */
	public String m_tOdr_CUS_DLV_KEY_CD = null;
	/** 第 157 変数： m_tOdr_PART_NAME */
	public String m_tOdr_PART_NAME = null;
	/** 第 158 変数： m_tOdr_PKG_UNIT */
	public String m_tOdr_PKG_UNIT = null;
	/** 第 159 変数： m_tOdr_SLIP_PRICE_PRINT_TYP */
	public String m_tOdr_SLIP_PRICE_PRINT_TYP = null;
	/** 第 160 変数： m_tOdr_INSPC_TYP */
	public String m_tOdr_INSPC_TYP = null;
	/** 第 161 変数： m_tOdr_CLIENT_REMARK */
	public String m_tOdr_CLIENT_REMARK = null;
	/** 第 162 変数： m_tOdr_CLIENT_REMARK_KANJI */
	public String m_tOdr_CLIENT_REMARK_KANJI = null;
	/** 第 163 変数： m_tOdr_CLIENT_BARCODE_INF */
	public String m_tOdr_CLIENT_BARCODE_INF = null;
	/** 第 164 変数： m_tOdr_TRANSPORT_CD */
	public String m_tOdr_TRANSPORT_CD = null;
	/** 第 165 変数： m_tOdr_TRANSPORT_TYP */
	public String m_tOdr_TRANSPORT_TYP = null;
	/** 第 166 変数： m_tOdr_TAX_APPLY_TYP */
	public String m_tOdr_TAX_APPLY_TYP = null;
	/** 第 167 変数： m_tOdr_TAX_CD */
	public String m_tOdr_TAX_CD = null;
	/** 第 168 変数： m_tOdr_TAX_CALC_TYP */
	public String m_tOdr_TAX_CALC_TYP = null;
	/** 第 169 変数： m_tOdr_REMARKS */
	public String m_tOdr_REMARKS = null;
	/** 第 170 変数： m_tOdr_ODR_ACPT_DATE */
	public String m_tOdr_ODR_ACPT_DATE = null;
	/** 第 171 変数： m_tOdr_SHIP_PLAN_REMAIN_QTY */
	public String m_tOdr_SHIP_PLAN_REMAIN_QTY = null;
	/** 第 172 変数： m_tOdr_SHIP_PLAN_CMPLT_FLG */
	public String m_tOdr_SHIP_PLAN_CMPLT_FLG = null;
	/** 第 173 変数： m_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG */
	public String m_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG = null;
	/** 第 174 変数： m_tOdr_PARTIAL_SHIP_INST_FLG */
	public String m_tOdr_PARTIAL_SHIP_INST_FLG = null;
	/** 第 175 変数： m_tOdr_IF_CTL_NO */
	public String m_tOdr_IF_CTL_NO = null;
	/** 第 176 変数： m_tOdr_ENTRY_TYP */
	public String m_tOdr_ENTRY_TYP = null;
	/** 第 177 変数： m_tOdr_BUYER_NAME */
	public String m_tOdr_BUYER_NAME = null;
	/** 第 178 変数： m_tOdr_PUCH_ODR_QTY_TOTAL */
	public String m_tOdr_PUCH_ODR_QTY_TOTAL = null;
	/** 第 179 変数： m_tOdr_UNIT_CD_ORG */
	public String m_tOdr_UNIT_CD_ORG = null;
	/** 第 180 変数： m_tOdr_SHIP_CNT */
	public String m_tOdr_SHIP_CNT = null;
	/** 第 181 変数： m_tOdr_IN_ODRNO */
	public String m_tOdr_IN_ODRNO = null;
	/** 第 182 変数： m_uptOdr_PART_DLV_COUNT */
	public String m_uptOdr_PART_DLV_COUNT = null;
	/** 第 183 変数： m_uptOdr_IN_ODRNO */
	public String m_uptOdr_IN_ODRNO = null;
	/** 第 184 変数： m_tOdrCtl_ODR_CTL_NO */
	public String m_tOdrCtl_ODR_CTL_NO = null;
	/** 第 185 変数： m_tOdrCtl_CUST_CD */
	public String m_tOdrCtl_CUST_CD = null;
	/** 第 186 変数： m_tOdrCtl_CUST_ITEM_CD */
	public String m_tOdrCtl_CUST_ITEM_CD = null;
	/** 第 187 変数： m_tOdrCtl_CUST_ITEM_NAME */
	public String m_tOdrCtl_CUST_ITEM_NAME = null;
	/** 第 188 変数： m_tOdrCtl_ITEM_CD */
	public String m_tOdrCtl_ITEM_CD = null;
	/** 第 189 変数： m_tOdrCtl_ITEM_NAME */
	public String m_tOdrCtl_ITEM_NAME = null;
	/** 第 190 変数： m_tOdrCtl_IN_ODRCTLNO */
	public String m_tOdrCtl_IN_ODRCTLNO = null;
	/** 第 191 変数： m_mItem_ITEM_CD */
	public String m_mItem_ITEM_CD = null;
	/** 第 192 変数： m_mItem_ITEM_NAME */
	public String m_mItem_ITEM_NAME = null;
	/** 第 193 変数： m_mItem_PRODUCT_TYP */
	public String m_mItem_PRODUCT_TYP = null;
	/** 第 194 変数： m_mItem_MRP_ODR_TYP */
	public String m_mItem_MRP_ODR_TYP = null;
	/** 第 195 変数： m_mItem_DRAW_CD */
	public String m_mItem_DRAW_CD = null;
	/** 第 196 変数： m_mItem_SPEC */
	public String m_mItem_SPEC = null;
	/** 第 197 変数： m_mItem_HIGH_LEVEL_NO */
	public String m_mItem_HIGH_LEVEL_NO = null;
	/** 第 198 変数： m_mItem_OUTSIDE_TYP */
	public String m_mItem_OUTSIDE_TYP = null;
	/** 第 199 変数： m_mItem_STOCK_UNIT_FLG */
	public String m_mItem_STOCK_UNIT_FLG = null;
	/** 第 200 変数： m_mItem_STOCK_UNIT */
	public String m_mItem_STOCK_UNIT = null;
	/** 第 201 変数： m_mItem_PKG_UNIT */
	public String m_mItem_PKG_UNIT = null;
	/** 第 202 変数： m_mItem_PKG_UNIT_QTY */
	public String m_mItem_PKG_UNIT_QTY = null;
	/** 第 203 変数： m_mItem_UNIT_QTY_TYP */
	public String m_mItem_UNIT_QTY_TYP = null;
	/** 第 204 変数： m_mItem_ODR_LT */
	public String m_mItem_ODR_LT = null;
	/** 第 205 変数： m_mItem_FIXED_LT */
	public String m_mItem_FIXED_LT = null;
	/** 第 206 変数： m_mItem_PROP_LT */
	public String m_mItem_PROP_LT = null;
	/** 第 207 変数： m_mItem_SAFETY_LT */
	public String m_mItem_SAFETY_LT = null;
	/** 第 208 変数： m_mItem_ISSUE_LT */
	public String m_mItem_ISSUE_LT = null;
	/** 第 209 変数： m_mItem_PROP_LOT_SIZE */
	public String m_mItem_PROP_LOT_SIZE = null;
	/** 第 210 変数： m_mItem_ITEM_SPOIL */
	public String m_mItem_ITEM_SPOIL = null;
	/** 第 211 変数： m_mItem_SAFETY_STOCK */
	public String m_mItem_SAFETY_STOCK = null;
	/** 第 212 変数： m_mItem_LOT_SIZING_TYP */
	public String m_mItem_LOT_SIZING_TYP = null;
	/** 第 213 変数： m_mItem_MAX_PERIOD */
	public String m_mItem_MAX_PERIOD = null;
	/** 第 214 変数： m_mItem_MAX_ODR_QTY */
	public String m_mItem_MAX_ODR_QTY = null;
	/** 第 215 変数： m_mItem_ODR_POINT */
	public String m_mItem_ODR_POINT = null;
	/** 第 216 変数： m_mItem_FIXED_ODR_QTY */
	public String m_mItem_FIXED_ODR_QTY = null;
	/** 第 217 変数： m_mItem_MIN_ODR_QTY */
	public String m_mItem_MIN_ODR_QTY = null;
	/** 第 218 変数： m_mItem_MUL_ODR_QTY */
	public String m_mItem_MUL_ODR_QTY = null;
	/** 第 219 変数： m_mItem_ISSUE_TYP */
	public String m_mItem_ISSUE_TYP = null;
	/** 第 220 変数： m_mItem_MPS_FLG */
	public String m_mItem_MPS_FLG = null;
	/** 第 221 変数： m_mItem_ACPT_INSPC_TYP */
	public String m_mItem_ACPT_INSPC_TYP = null;
	/** 第 222 変数： m_mItem_CLASIFICATION_CD */
	public String m_mItem_CLASIFICATION_CD = null;
	/** 第 223 変数： m_mItem_UNIT_WEIGHT */
	public String m_mItem_UNIT_WEIGHT = null;
	/** 第 224 変数： m_mItem_ABC_TYP */
	public String m_mItem_ABC_TYP = null;
	/** 第 225 変数： m_mItem_OPR_RSLT_TYP */
	public String m_mItem_OPR_RSLT_TYP = null;
	/** 第 226 変数： m_mItem_SPL_ITEM_TYP */
	public String m_mItem_SPL_ITEM_TYP = null;
	/** 第 227 変数： m_mItem_TAX_CD */
	public String m_mItem_TAX_CD = null;
	/** 第 228 変数： m_mItem_IN_ITEMCD */
	public String m_mItem_IN_ITEMCD = null;
	/** 第 229 変数： m_mCustBase_COMPANY_CD */
	public String m_mCustBase_COMPANY_CD = null;
	/** 第 230 変数： m_mCustBase_CUST_CD */
	public String m_mCustBase_CUST_CD = null;
	/** 第 231 変数： m_mCustBase_DLV_LOC_CD */
	public String m_mCustBase_DLV_LOC_CD = null;
	/** 第 232 変数： m_mCustBase_DLV_LOC_NAME */
	public String m_mCustBase_DLV_LOC_NAME = null;
	/** 第 233 変数： m_mCustBase_DLV_LOC_KNAME */
	public String m_mCustBase_DLV_LOC_KNAME = null;
	/** 第 234 変数： m_mCustBase_DLV_LOC_ENAME */
	public String m_mCustBase_DLV_LOC_ENAME = null;
	/** 第 235 変数： m_mCustBase_ZIP_CD */
	public String m_mCustBase_ZIP_CD = null;
	/** 第 236 変数： m_mCustBase_ADDRESS_1 */
	public String m_mCustBase_ADDRESS_1 = null;
	/** 第 237 変数： m_mCustBase_ADDRESS_2 */
	public String m_mCustBase_ADDRESS_2 = null;
	/** 第 238 変数： m_mCustBase_ADDRESS_K_1 */
	public String m_mCustBase_ADDRESS_K_1 = null;
	/** 第 239 変数： m_mCustBase_ADDRESS_K_2 */
	public String m_mCustBase_ADDRESS_K_2 = null;
	/** 第 240 変数： m_mCustBase_TEL */
	public String m_mCustBase_TEL = null;
	/** 第 241 変数： m_mCustBase_FAX */
	public String m_mCustBase_FAX = null;
	/** 第 242 変数： m_mCustBase_SHIP_WH_CD */
	public String m_mCustBase_SHIP_WH_CD = null;
	/** 第 243 変数： m_mCustBase_TRANSPORT_CD */
	public String m_mCustBase_TRANSPORT_CD = null;
	/** 第 244 変数： m_mCustBase_TRANSPORT_NAME */
	public String m_mCustBase_TRANSPORT_NAME = null;
	/** 第 245 変数： m_mCustBase_TRANSPORT_LT */
	public String m_mCustBase_TRANSPORT_LT = null;
	/** 第 246 変数： m_mCustBase_CAL_NO */
	public String m_mCustBase_CAL_NO = null;
	/** 第 247 変数： m_mCustBase_TRANSPORT_TYP */
	public String m_mCustBase_TRANSPORT_TYP = null;
	/** 第 248 変数： m_mCustBase_DLV_START_TIME */
	public String m_mCustBase_DLV_START_TIME = null;
	/** 第 249 変数： m_mCustBase_DLV_END_TIME */
	public String m_mCustBase_DLV_END_TIME = null;
	/** 第 250 変数： m_mCustBase_AREA_CLASS_TYP1 */
	public String m_mCustBase_AREA_CLASS_TYP1 = null;
	/** 第 251 変数： m_mCustBase_AREA_CLASS_1 */
	public String m_mCustBase_AREA_CLASS_1 = null;
	/** 第 252 変数： m_mCustBase_AREA_CLASS_TYP2 */
	public String m_mCustBase_AREA_CLASS_TYP2 = null;
	/** 第 253 変数： m_mCustBase_AREA_CLASS_2 */
	public String m_mCustBase_AREA_CLASS_2 = null;
	/** 第 254 変数： m_mCustBase_AREA_CLASS_TYP3 */
	public String m_mCustBase_AREA_CLASS_TYP3 = null;
	/** 第 255 変数： m_mCustBase_AREA_CLASS_3 */
	public String m_mCustBase_AREA_CLASS_3 = null;
	/** 第 256 変数： m_mCustBase_REMARKS_1 */
	public String m_mCustBase_REMARKS_1 = null;
	/** 第 257 変数： m_mCustBase_REMARKS_2 */
	public String m_mCustBase_REMARKS_2 = null;
	/** 第 258 変数： m_mCustBase_REMARKS_3 */
	public String m_mCustBase_REMARKS_3 = null;
	/** 第 259 変数： m_mCustBase_DEPO_WH_CD */
	public String m_mCustBase_DEPO_WH_CD = null;
	/** 第 260 変数： m_mCustBase_IN_COMPANYCD */
	public String m_mCustBase_IN_COMPANYCD = null;
	/** 第 261 変数： m_mCustBase_IN_CUSTCD */
	public String m_mCustBase_IN_CUSTCD = null;
	/** 第 262 変数： m_mCustBase_IN_DLVLOCCD */
	public String m_mCustBase_IN_DLVLOCCD = null;
	/** 第 263 変数： m_mCust_COMPANY_CD */
	public String m_mCust_COMPANY_CD = null;
	/** 第 264 変数： m_mCust_CUST_CD */
	public String m_mCust_CUST_CD = null;
	/** 第 265 変数： m_mCust_CUST_NAME */
	public String m_mCust_CUST_NAME = null;
	/** 第 266 変数： m_mCust_CUST_ANAME */
	public String m_mCust_CUST_ANAME = null;
	/** 第 267 変数： m_mCust_CUST_KNAME */
	public String m_mCust_CUST_KNAME = null;
	/** 第 268 変数： m_mCust_OWN_ORG_CD */
	public String m_mCust_OWN_ORG_CD = null;
	/** 第 269 変数： m_mCust_OWN_PERSON_CD */
	public String m_mCust_OWN_PERSON_CD = null;
	/** 第 270 変数： m_mCust_CUR_CD */
	public String m_mCust_CUR_CD = null;
	/** 第 271 変数： m_mCust_EXCH_TYP */
	public String m_mCust_EXCH_TYP = null;
	/** 第 272 変数： m_mCust_TAX_APPLY_TYP */
	public String m_mCust_TAX_APPLY_TYP = null;
	/** 第 273 変数： m_mCust_TAX_CD */
	public String m_mCust_TAX_CD = null;
	/** 第 274 変数： m_mCust_TAX_CALC_TYP */
	public String m_mCust_TAX_CALC_TYP = null;
	/** 第 275 変数： m_mCust_PRICE_ROUND_TYP */
	public String m_mCust_PRICE_ROUND_TYP = null;
	/** 第 276 変数： m_mCust_DETAIL_ROUND_TYP */
	public String m_mCust_DETAIL_ROUND_TYP = null;
	/** 第 277 変数： m_mCust_UNCONFIRM_ODR_EFF_PRIOD */
	public String m_mCust_UNCONFIRM_ODR_EFF_PRIOD = null;
	/** 第 278 変数： m_mCust_UNCONFIRM_ODR_EFF_TERM_FLG */
	public String m_mCust_UNCONFIRM_ODR_EFF_TERM_FLG = null;
	/** 第 279 変数： m_mCust_EDI_CUST_VEND_CD */
	public String m_mCust_EDI_CUST_VEND_CD = null;
	/** 第 280 変数： m_mCust_PARTIAL_SHIP_INST_FLG */
	public String m_mCust_PARTIAL_SHIP_INST_FLG = null;
	/** 第 281 変数： m_mCust_DEPO_TYP */
	public String m_mCust_DEPO_TYP = null;
	/** 第 282 変数： m_mCust_INSPC_ACPT_TYP */
	public String m_mCust_INSPC_ACPT_TYP = null;
	/** 第 283 変数： m_mCust_IN_COMPANYCD */
	public String m_mCust_IN_COMPANYCD = null;
	/** 第 284 変数： m_mCust_IN_CUSTCD */
	public String m_mCust_IN_CUSTCD = null;
	/** 第 285 変数： m_strYotaku_WH_CD */
	public String m_strYotaku_WH_CD = null;
	/** 第 286 変数： m_strYotaku_IN_WH_TYP */
	public String m_strYotaku_IN_WH_TYP = null;
	/** 第 287 変数： m_in_tShipSlip_SLIP_CD */
	public String m_in_tShipSlip_SLIP_CD = null;
	/** 第 288 変数： m_in_tShipSlip_ITEM_CD */
	public String m_in_tShipSlip_ITEM_CD = null;
	/** 第 289 変数： m_in_tShipSlip_CUST_ITEM_CD */
	public String m_in_tShipSlip_CUST_ITEM_CD = null;
	/** 第 290 変数： m_in_tShipSlip_PART_NAME */
	public String m_in_tShipSlip_PART_NAME = null;
	/** 第 291 変数： m_in_tShipSlip_CUST_ODR_NO */
	public String m_in_tShipSlip_CUST_ODR_NO = null;
	/** 第 292 変数： m_in_tShipSlip_CUST_CD */
	public String m_in_tShipSlip_CUST_CD = null;
	/** 第 293 変数： m_in_tShipSlip_CUST_NAME */
	public String m_in_tShipSlip_CUST_NAME = null;
	/** 第 294 変数： m_in_tShipSlip_DLV_LOC_CD */
	public String m_in_tShipSlip_DLV_LOC_CD = null;
	/** 第 295 変数： m_in_tShipSlip_DLV_LOC_NAME_KANJI */
	public String m_in_tShipSlip_DLV_LOC_NAME_KANJI = null;
	/** 第 296 変数： m_in_tShipSlip_CUS_DLV_KEY_CD */
	public String m_in_tShipSlip_CUS_DLV_KEY_CD = null;
	/** 第 297 変数： m_in_tShipSlip_DESINATED_SHIP_DATE */
	public String m_in_tShipSlip_DESINATED_SHIP_DATE = null;
	/** 第 298 変数： m_in_tShipSlip_DESINATED_DLV_DATE */
	public String m_in_tShipSlip_DESINATED_DLV_DATE = null;
	/** 第 299 変数： m_in_tShipSlip_SCDL_DLV_DATE */
	public String m_in_tShipSlip_SCDL_DLV_DATE = null;
	/** 第 300 変数： m_in_tShipSlip_SHIP_ODR_QTY */
	public String m_in_tShipSlip_SHIP_ODR_QTY = null;
	/** 第 301 変数： m_in_tShipSlip_UNIT_CD */
	public String m_in_tShipSlip_UNIT_CD = null;
	/** 第 302 変数： m_in_tShipSlip_UNIT_PRICE */
	public String m_in_tShipSlip_UNIT_PRICE = null;
	/** 第 303 変数： m_in_tShipSlip_SHIP_ODR_AMOUNT */
	public String m_in_tShipSlip_SHIP_ODR_AMOUNT = null;
	/** 第 304 変数： m_in_tShipSlip_TAX_AMOUNT */
	public String m_in_tShipSlip_TAX_AMOUNT = null;
	/** 第 305 変数： m_in_tShipSlip_INSPC_TYP */
	public String m_in_tShipSlip_INSPC_TYP = null;
	/** 第 306 変数： m_in_tShipSlip_CLIENT_REMARK_KANJI */
	public String m_in_tShipSlip_CLIENT_REMARK_KANJI = null;
	/** 第 307 変数： m_in_tShipSlip_CLIENT_BARCODE_INF */
	public String m_in_tShipSlip_CLIENT_BARCODE_INF = null;
	/** 第 308 変数： m_in_tShipSlip_PRINT_FLG */
	public String m_in_tShipSlip_PRINT_FLG = null;
	/** 第 309 変数： m_in_tShipSlip_DEL_FLG */
	public String m_in_tShipSlip_DEL_FLG = null;
	/** 第 310 変数： m_in_tShipSlip_BUYER_NAME */
	public String m_in_tShipSlip_BUYER_NAME = null;
	/** 第 311 変数： m_in_tShipSlip_PUCH_ODR_QTY_TOTAL */
	public String m_in_tShipSlip_PUCH_ODR_QTY_TOTAL = null;
	/** 第 312 変数： m_in_tShipSlip_DLV_ODR_QTY */
	public String m_in_tShipSlip_DLV_ODR_QTY = null;
	/** 第 313 変数： m_in_tShipSlip_SHIP_ODR_AMOUNT_TAX */
	public String m_in_tShipSlip_SHIP_ODR_AMOUNT_TAX = null;
	/** 第 314 変数： m_in_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT */
	public String m_in_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT = null;
	/** 第 315 変数： m_in_tShipSlip_INTERNAL_TAX_SALES_AMOUNT */
	public String m_in_tShipSlip_INTERNAL_TAX_SALES_AMOUNT = null;
	/** 第 316 変数： m_in_tShipSlip_TAXFREE_SALES_AMOUNT */
	public String m_in_tShipSlip_TAXFREE_SALES_AMOUNT = null;
	/** 第 317 変数： m_in_tShipSlip_TAX_CREDIT_SALES_AMOUNT */
	public String m_in_tShipSlip_TAX_CREDIT_SALES_AMOUNT = null;
	/** 第 318 変数： m_in_tShipSlip_EXTERNAL_TAX_AMOUNT */
	public String m_in_tShipSlip_EXTERNAL_TAX_AMOUNT = null;
	/** 第 319 変数： m_in_tShipSlip_INTERNAL_TAX_AMOUNT */
	public String m_in_tShipSlip_INTERNAL_TAX_AMOUNT = null;
	/** 第 320 変数： m_in_tShipSlip_TAX_AMOUNT_1 */
	public String m_in_tShipSlip_TAX_AMOUNT_1 = null;
	/** 第 321 変数： m_in_tShipSlip_TAX_AMOUNT_2 */
	public String m_in_tShipSlip_TAX_AMOUNT_2 = null;
	/** 第 322 変数： m_in_tShipSlip_TAX_AMOUNT_3 */
	public String m_in_tShipSlip_TAX_AMOUNT_3 = null;
	/** 第 323 変数： m_in_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT */
	public String m_in_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;
	/** 第 324 変数： m_del_tShipSlip_IN_SLIPCD */
	public String m_del_tShipSlip_IN_SLIPCD = null;
	/** 第 325 変数： m_uptOdr_SHIP_CNT */
	public String m_uptOdr_SHIP_CNT = null;
	/** 第 326 変数： m_tUnShipList_UN_SHIP_SEQ_NO */
	public String m_tUnShipList_UN_SHIP_SEQ_NO = null;
	/** 第 327 変数： m_tUnShipList_CUST_CD */
	public String m_tUnShipList_CUST_CD = null;
	/** 第 328 変数： m_tUnShipList_ACPT_ODR_CD */
	public String m_tUnShipList_ACPT_ODR_CD = null;
	/** 第 329 変数： m_tUnShipList_PART_DLV_SEQ_NO */
	public String m_tUnShipList_PART_DLV_SEQ_NO = null;
	/** 第 330 変数： m_tUnShipList_ITEM_CD */
	public String m_tUnShipList_ITEM_CD = null;
	/** 第 331 変数： m_tUnShipList_UN_SHIP_QTY */
	public String m_tUnShipList_UN_SHIP_QTY = null;
	/** 第 332 変数： m_tUnShipList_UN_SHIP_RSN */
	public String m_tUnShipList_UN_SHIP_RSN = null;
	/** 第 333 変数： m_tUnShipList_WH_CD */
	public String m_tUnShipList_WH_CD = null;
	/** 第 334 変数： m_tUnShipList_PRINT_FLG */
	public String m_tUnShipList_PRINT_FLG = null;
	/** 第 335 変数： m_tUnShipList_DEL_FLG */
	public String m_tUnShipList_DEL_FLG = null;
	/** 第 336 変数： m_tori_tAnsDlvDate_REST_SHIP_ODR_QTY */
	public String m_tori_tAnsDlvDate_REST_SHIP_ODR_QTY = null;
	/** 第 337 変数： m_tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG */
	public String m_tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG = null;
	/** 第 338 変数： m_tori_tAnsDlvDate_IN_ODRNO */
	public String m_tori_tAnsDlvDate_IN_ODRNO = null;
	/** 第 339 変数： m_tori_tAnsDlvDate_IN_PARTDLVSEQNO */
	public String m_tori_tAnsDlvDate_IN_PARTDLVSEQNO = null;
	/** 第 340 変数： m_l_COUNT */
	public String m_l_COUNT = null;
	/** 第 341 変数： m_ROW_COUNT */
	public String m_ROW_COUNT = null;
	/** 第 342 変数： m_strTAX_CD */
	public String m_strTAX_CD = null;
	/** 第 343 変数： m_SHIP_MODIFY_COUNT */
	public String m_SHIP_MODIFY_COUNT = null;
	/** 第 344 変数： m_SEL_MODIFY_COUNT */
	public String m_SEL_MODIFY_COUNT = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_r1_SHIP_ODR */
	public List l_r1_SHIP_ODR = null;

	/** 第 2 List変数： l_r2_SHIP_ODR */
	public List l_r2_SHIP_ODR = null;

	/** 第 3 List変数： l_tAnsDlvDate_MODIFY_COUNT */
	public List l_tAnsDlvDate_MODIFY_COUNT = null;

	/** 第 4 List変数： l_tShipOdr_MODIFY_COUNT */
	public List l_tShipOdr_MODIFY_COUNT = null;

	/** 第 5 List変数： l_Shipt_MODIFY_COUNT */
	public List l_Shipt_MODIFY_COUNT = null;

	/** 第 6 List変数： l_h_RESULT */
	public List l_h_RESULT = null;

	/** 第 7 List変数： l_strBUSINESS_OPR_DATE */
	public List l_strBUSINESS_OPR_DATE = null;

	/** 第 8 List変数： l_strPLANT_CD */
	public List l_strPLANT_CD = null;

	/** 第 9 List変数： l_strTaxTAX_KBN */
	public List l_strTaxTAX_KBN = null;

	/** 第 10 List変数： l_strTaxOLD_TAX_1 */
	public List l_strTaxOLD_TAX_1 = null;

	/** 第 11 List変数： l_strTaxOLD_TAX_2 */
	public List l_strTaxOLD_TAX_2 = null;

	/** 第 12 List変数： l_strTaxOLD_TAX_3 */
	public List l_strTaxOLD_TAX_3 = null;

	/** 第 13 List変数： l_strTaxNEW_TAX_1 */
	public List l_strTaxNEW_TAX_1 = null;

	/** 第 14 List変数： l_strTaxNEW_TAX_2 */
	public List l_strTaxNEW_TAX_2 = null;

	/** 第 15 List変数： l_strTaxNEW_TAX_3 */
	public List l_strTaxNEW_TAX_3 = null;

	/** 第 16 List変数： l_strTaxSTART_DATE */
	public List l_strTaxSTART_DATE = null;

	/** 第 17 List変数： l_strTaxROUND_TYP */
	public List l_strTaxROUND_TYP = null;

	/** 第 18 List変数： l_strTaxIN_COMPANYCD */
	public List l_strTaxIN_COMPANYCD = null;

	/** 第 19 List変数： l_strTaxIN_CUSTCD */
	public List l_strTaxIN_CUSTCD = null;

	/** 第 20 List変数： l_l_CUST_ITEM_CD */
	public List l_l_CUST_ITEM_CD = null;

	/** 第 21 List変数： l_tDECIMAL_FIG */
	public List l_tDECIMAL_FIG = null;

	/** 第 22 List変数： l_tCUR_CD */
	public List l_tCUR_CD = null;

	/** 第 23 List変数： l_strCOMPANY_CD */
	public List l_strCOMPANY_CD = null;

	/** 第 24 List変数： l_strUSER_NAME */
	public List l_strUSER_NAME = null;

	/** 第 25 List変数： l_strSECTION_CD */
	public List l_strSECTION_CD = null;

	/** 第 26 List変数： l_strPLANT_NAME */
	public List l_strPLANT_NAME = null;

	/** 第 27 List変数： l_strPLANT_ANAME */
	public List l_strPLANT_ANAME = null;

	/** 第 28 List変数： l_strCAL_NO */
	public List l_strCAL_NO = null;

	/** 第 29 List変数： l_strUSER_CD */
	public List l_strUSER_CD = null;

	/** 第 30 List変数： l_strSYUKA_LT */
	public List l_strSYUKA_LT = null;

	/** 第 31 List変数： l_tHOLIDAY_FLG */
	public List l_tHOLIDAY_FLG = null;

	/** 第 32 List変数： l_tWH_CD */
	public List l_tWH_CD = null;

	/** 第 33 List変数： l_tCAL_DATE */
	public List l_tCAL_DATE = null;

	/** 第 34 List変数： l_l_ODR_NO */
	public List l_l_ODR_NO = null;

	/** 第 35 List変数： l_l_PART_DLV_SEQ_NO */
	public List l_l_PART_DLV_SEQ_NO = null;

	/** 第 36 List変数： l_l_DESINATED_DLV_DATE */
	public List l_l_DESINATED_DLV_DATE = null;

	/** 第 37 List変数： l_l_DESINATED_SHIP_DATE */
	public List l_l_DESINATED_SHIP_DATE = null;

	/** 第 38 List変数： l_l_SHIP_QTY */
	public List l_l_SHIP_QTY = null;

	/** 第 39 List変数： l_l_REST_SHIP_QTY */
	public List l_l_REST_SHIP_QTY = null;

	/** 第 40 List変数： l_l_WH_CD */
	public List l_l_WH_CD = null;

	/** 第 41 List変数： l_l_WH_NAME */
	public List l_l_WH_NAME = null;

	/** 第 42 List変数： l_l_CUST_ODR_NO */
	public List l_l_CUST_ODR_NO = null;

	/** 第 43 List変数： l_l_CUST_CD */
	public List l_l_CUST_CD = null;

	/** 第 44 List変数： l_l_CUST_NAME */
	public List l_l_CUST_NAME = null;

	/** 第 45 List変数： l_l_CUST_ITEM_NAME */
	public List l_l_CUST_ITEM_NAME = null;

	/** 第 46 List変数： l_l_ITEM_CD */
	public List l_l_ITEM_CD = null;

	/** 第 47 List変数： l_l_ITEM_NAME */
	public List l_l_ITEM_NAME = null;

	/** 第 48 List変数： l_l_STOCK_UNIT */
	public List l_l_STOCK_UNIT = null;

	/** 第 49 List変数： l_l_UNIT_QTY_TYP */
	public List l_l_UNIT_QTY_TYP = null;

	/** 第 50 List変数： l_l_MRP_ODR_TYP */
	public List l_l_MRP_ODR_TYP = null;

	/** 第 51 List変数： l_l_ODR_CTL_NO */
	public List l_l_ODR_CTL_NO = null;

	/** 第 52 List変数： l_l_TRANSPORT_TYP */
	public List l_l_TRANSPORT_TYP = null;

	/** 第 53 List変数： l_l_ODR_UNIT_PRICE */
	public List l_l_ODR_UNIT_PRICE = null;

	/** 第 54 List変数： l_l_SPCL_PRICE_TYP */
	public List l_l_SPCL_PRICE_TYP = null;

	/** 第 55 List変数： l_l_PARTIAL_SHIP_INST_FLG */
	public List l_l_PARTIAL_SHIP_INST_FLG = null;

	/** 第 56 List変数： l_l_MODIFY_COUNT */
	public List l_l_MODIFY_COUNT = null;

	/** 第 57 List変数： l_l_JOB_ODR_CD */
	public List l_l_JOB_ODR_CD = null;

	/** 第 58 List変数： l_ODR_NO */
	public List l_ODR_NO = null;

	/** 第 59 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 60 List変数： l_DESINATED_DLV_DATE */
	public List l_DESINATED_DLV_DATE = null;

	/** 第 61 List変数： l_DESINATED_SHIP_DATE */
	public List l_DESINATED_SHIP_DATE = null;

	/** 第 62 List変数： l_CUST_CD */
	public List l_CUST_CD = null;

	/** 第 63 List変数： l_CUST_CHRG_PSN_CD */
	public List l_CUST_CHRG_PSN_CD = null;

	/** 第 64 List変数： l_CUST_ODR_NO */
	public List l_CUST_ODR_NO = null;

	/** 第 65 List変数： l_CUST_ITEM_CD */
	public List l_CUST_ITEM_CD = null;

	/** 第 66 List変数： l_up_tAnsDlvDate_DESINATED_SHIP_DATE */
	public List l_up_tAnsDlvDate_DESINATED_SHIP_DATE = null;

	/** 第 67 List変数： l_up_tAnsDlvDate_REST_SHIP_ODR_QTY */
	public List l_up_tAnsDlvDate_REST_SHIP_ODR_QTY = null;

	/** 第 68 List変数： l_up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG */
	public List l_up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG = null;

	/** 第 69 List変数： l_up_tAnsDlvDate_IN_ODRNO */
	public List l_up_tAnsDlvDate_IN_ODRNO = null;

	/** 第 70 List変数： l_up_tAnsDlvDate_IN_PARTDLVSEQNO */
	public List l_up_tAnsDlvDate_IN_PARTDLVSEQNO = null;

	/** 第 71 List変数： l_l_SLIP_CD */
	public List l_l_SLIP_CD = null;

	/** 第 72 List変数： l_l_c_DIRECT_DLV_FLG */
	public List l_l_c_DIRECT_DLV_FLG = null;

	/** 第 73 List変数： l_l_DLV_MODIFY_COUNT */
	public List l_l_DLV_MODIFY_COUNT = null;

	/** 第 74 List変数： l_SLIP_CD */
	public List l_SLIP_CD = null;

	/** 第 75 List変数： l_in_tShipOdr_ODR_NO */
	public List l_in_tShipOdr_ODR_NO = null;

	/** 第 76 List変数： l_in_tShipOdr_PART_DLV_SEQ_NO */
	public List l_in_tShipOdr_PART_DLV_SEQ_NO = null;

	/** 第 77 List変数： l_in_tShipOdr_SLIP_CD */
	public List l_in_tShipOdr_SLIP_CD = null;

	/** 第 78 List変数： l_in_tShipOdr_ITEM_CD */
	public List l_in_tShipOdr_ITEM_CD = null;

	/** 第 79 List変数： l_in_tShipOdr_CUST_ITEM_CD */
	public List l_in_tShipOdr_CUST_ITEM_CD = null;

	/** 第 80 List変数： l_in_tShipOdr_CUST_ODR_NO */
	public List l_in_tShipOdr_CUST_ODR_NO = null;

	/** 第 81 List変数： l_in_tShipOdr_CUST_CD */
	public List l_in_tShipOdr_CUST_CD = null;

	/** 第 82 List変数： l_in_tShipOdr_CUST_NAME */
	public List l_in_tShipOdr_CUST_NAME = null;

	/** 第 83 List変数： l_in_tShipOdr_SHIP_ODR_ISS_PSN_CD */
	public List l_in_tShipOdr_SHIP_ODR_ISS_PSN_CD = null;

	/** 第 84 List変数： l_in_tShipOdr_DLV_LOC_CD */
	public List l_in_tShipOdr_DLV_LOC_CD = null;

	/** 第 85 List変数： l_in_tShipOdr_DESINATED_SHIP_DATE */
	public List l_in_tShipOdr_DESINATED_SHIP_DATE = null;

	/** 第 86 List変数： l_in_tShipOdr_SHIP_QTY */
	public List l_in_tShipOdr_SHIP_QTY = null;

	/** 第 87 List変数： l_in_tShipOdr_UNIT_PRICE */
	public List l_in_tShipOdr_UNIT_PRICE = null;

	/** 第 88 List変数： l_in_tShipOdr_SHIP_ODR_AMOUNT */
	public List l_in_tShipOdr_SHIP_ODR_AMOUNT = null;

	/** 第 89 List変数： l_in_tShipOdr_CURRNCY_CD */
	public List l_in_tShipOdr_CURRNCY_CD = null;

	/** 第 90 List変数： l_in_tShipOdr_PKG_UNIT_QTY */
	public List l_in_tShipOdr_PKG_UNIT_QTY = null;

	/** 第 91 List変数： l_in_tShipOdr_REMARKS */
	public List l_in_tShipOdr_REMARKS = null;

	/** 第 92 List変数： l_in_tShipOdr_ALLCT_WH_CD */
	public List l_in_tShipOdr_ALLCT_WH_CD = null;

	/** 第 93 List変数： l_in_tShipOdr_DEPO_TYP */
	public List l_in_tShipOdr_DEPO_TYP = null;

	/** 第 94 List変数： l_in_tShipOdr_ENTRY_TYP */
	public List l_in_tShipOdr_ENTRY_TYP = null;

	/** 第 95 List変数： l_in_tShipOdr_PRINT_FLG */
	public List l_in_tShipOdr_PRINT_FLG = null;

	/** 第 96 List変数： l_in_tShipOdr_SHP_CMPLT_FLG */
	public List l_in_tShipOdr_SHP_CMPLT_FLG = null;

	/** 第 97 List変数： l_in_tShipOdr_DEL_FLG */
	public List l_in_tShipOdr_DEL_FLG = null;

	/** 第 98 List変数： l_in_tShipOdr_TRANSPORT_CD */
	public List l_in_tShipOdr_TRANSPORT_CD = null;

	/** 第 99 List変数： l_in_tShipOdr_DIRECT_DLV_FLG */
	public List l_in_tShipOdr_DIRECT_DLV_FLG = null;

	/** 第 100 List変数： l_in_tShipOdr_CUST_CHRG_PSN_CD */
	public List l_in_tShipOdr_CUST_CHRG_PSN_CD = null;

	/** 第 101 List変数： l_in_tShipOdr_UNIT_CD */
	public List l_in_tShipOdr_UNIT_CD = null;

	/** 第 102 List変数： l_in_tShipOdr_SCDL_DLV_DATE */
	public List l_in_tShipOdr_SCDL_DLV_DATE = null;

	/** 第 103 List変数： l_in_tShipOdr_TRANSFER_WH_CD */
	public List l_in_tShipOdr_TRANSFER_WH_CD = null;

	/** 第 104 List変数： l_in_tShipOdr_DLV_KEY_NO */
	public List l_in_tShipOdr_DLV_KEY_NO = null;

	/** 第 105 List変数： l_in_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES */
	public List l_in_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES = null;

	/** 第 106 List変数： l_in_tShipOdr_SHIP_ODR_NO */
	public List l_in_tShipOdr_SHIP_ODR_NO = null;

	/** 第 107 List変数： l_in_tShipOdr_JOB_ODR_CD */
	public List l_in_tShipOdr_JOB_ODR_CD = null;

	/** 第 108 List変数： l_del_tShipOdr_IN_SLIPCD */
	public List l_del_tShipOdr_IN_SLIPCD = null;

	/** 第 109 List変数： l_chkisinWhCd_WH_CD */
	public List l_chkisinWhCd_WH_CD = null;

	/** 第 110 List変数： l_chkisinWhCd_WH_TYP */
	public List l_chkisinWhCd_WH_TYP = null;

	/** 第 111 List変数： l_chkis_IN_WHCD */
	public List l_chkis_IN_WHCD = null;

	/** 第 112 List変数： l_chkisWhCd_WH_CD */
	public List l_chkisWhCd_WH_CD = null;

	/** 第 113 List変数： l_chkisWhCd_WH_TYP */
	public List l_chkisWhCd_WH_TYP = null;

	/** 第 114 List変数： l_chkisWhCd_ITEM_CD */
	public List l_chkisWhCd_ITEM_CD = null;

	/** 第 115 List変数： l_chkisWhCd_PBL_SHIP_QTY */
	public List l_chkisWhCd_PBL_SHIP_QTY = null;

	/** 第 116 List変数： l_chkisWhCd_IN_ITEMCD */
	public List l_chkisWhCd_IN_ITEMCD = null;

	/** 第 117 List変数： l_chkisWhCd_IN_WHCD */
	public List l_chkisWhCd_IN_WHCD = null;

	/** 第 118 List変数： l_tOdr_ODR_NO */
	public List l_tOdr_ODR_NO = null;

	/** 第 119 List変数： l_tOdr_ODR_TYP */
	public List l_tOdr_ODR_TYP = null;

	/** 第 120 List変数： l_tOdr_ODR_CTL_NO */
	public List l_tOdr_ODR_CTL_NO = null;

	/** 第 121 List変数： l_tOdr_CUST_ODR_NO */
	public List l_tOdr_CUST_ODR_NO = null;

	/** 第 122 List変数： l_tOdr_CUST_CHRG_ORG_CD */
	public List l_tOdr_CUST_CHRG_ORG_CD = null;

	/** 第 123 List変数： l_tOdr_CUST_CHRG_PSN_CD */
	public List l_tOdr_CUST_CHRG_PSN_CD = null;

	/** 第 124 List変数： l_tOdr_ODR_ACPT_ORG_CD */
	public List l_tOdr_ODR_ACPT_ORG_CD = null;

	/** 第 125 List変数： l_tOdr_ODR_ACPT_PSN_CD */
	public List l_tOdr_ODR_ACPT_PSN_CD = null;

	/** 第 126 List変数： l_tOdr_CURRNCY_CD */
	public List l_tOdr_CURRNCY_CD = null;

	/** 第 127 List変数： l_tOdr_EXCH_TYP */
	public List l_tOdr_EXCH_TYP = null;

	/** 第 128 List変数： l_tOdr_DLV_LOC_CD */
	public List l_tOdr_DLV_LOC_CD = null;

	/** 第 129 List変数： l_tOdr_DLV_LOC_CD_EIAJ */
	public List l_tOdr_DLV_LOC_CD_EIAJ = null;

	/** 第 130 List変数： l_tOdr_DLV_LOC_NAME */
	public List l_tOdr_DLV_LOC_NAME = null;

	/** 第 131 List変数： l_tOdr_DLV_LOC_NAME_KANJI */
	public List l_tOdr_DLV_LOC_NAME_KANJI = null;

	/** 第 132 List変数： l_tOdr_PRD_ODR_PLACE_CD */
	public List l_tOdr_PRD_ODR_PLACE_CD = null;

	/** 第 133 List変数： l_tOdr_ODR_UNIT_PRICE */
	public List l_tOdr_ODR_UNIT_PRICE = null;

	/** 第 134 List変数： l_tOdr_SPCL_PRICE_TYP */
	public List l_tOdr_SPCL_PRICE_TYP = null;

	/** 第 135 List変数： l_tOdr_PART_DLV_COUNT */
	public List l_tOdr_PART_DLV_COUNT = null;

	/** 第 136 List変数： l_tOdr_DEPO_TYP */
	public List l_tOdr_DEPO_TYP = null;

	/** 第 137 List変数： l_tOdr_DESINATED_DLV_DATE */
	public List l_tOdr_DESINATED_DLV_DATE = null;

	/** 第 138 List変数： l_tOdr_STD_DESINATED_RCV_DATE */
	public List l_tOdr_STD_DESINATED_RCV_DATE = null;

	/** 第 139 List変数： l_tOdr_ODR_QTY */
	public List l_tOdr_ODR_QTY = null;

	/** 第 140 List変数： l_tOdr_REMAIN_UNCONFIRM_ODR_QTY */
	public List l_tOdr_REMAIN_UNCONFIRM_ODR_QTY = null;

	/** 第 141 List変数： l_tOdr_CANCELED_UNCONFIRM_ODR_QTY */
	public List l_tOdr_CANCELED_UNCONFIRM_ODR_QTY = null;

	/** 第 142 List変数： l_tOdr_UNIT_CD */
	public List l_tOdr_UNIT_CD = null;

	/** 第 143 List変数： l_tOdr_UNCONFIRM_ODR_BALANCE */
	public List l_tOdr_UNCONFIRM_ODR_BALANCE = null;

	/** 第 144 List変数： l_tOdr_ODR_AMOUNT */
	public List l_tOdr_ODR_AMOUNT = null;

	/** 第 145 List変数： l_tOdr_ODR_AMOUNT_EXCH_RATES */
	public List l_tOdr_ODR_AMOUNT_EXCH_RATES = null;

	/** 第 146 List変数： l_tOdr_TOTAL_SHIP_QTY */
	public List l_tOdr_TOTAL_SHIP_QTY = null;

	/** 第 147 List変数： l_tOdr_SHIP_AMOUNT */
	public List l_tOdr_SHIP_AMOUNT = null;

	/** 第 148 List変数： l_tOdr_SHIP_AMOUNT_EXCH_RATES */
	public List l_tOdr_SHIP_AMOUNT_EXCH_RATES = null;

	/** 第 149 List変数： l_tOdr_RETURN_PRICE */
	public List l_tOdr_RETURN_PRICE = null;

	/** 第 150 List変数： l_tOdr_RETURN_QTY */
	public List l_tOdr_RETURN_QTY = null;

	/** 第 151 List変数： l_tOdr_RETURN_AMOUNT */
	public List l_tOdr_RETURN_AMOUNT = null;

	/** 第 152 List変数： l_tOdr_RETURN_AMOUNT_EXCH_RATES */
	public List l_tOdr_RETURN_AMOUNT_EXCH_RATES = null;

	/** 第 153 List変数： l_tOdr_ODR_CMPLT_FLG */
	public List l_tOdr_ODR_CMPLT_FLG = null;

	/** 第 154 List変数： l_tOdr_ODR_CMPLT_DATE */
	public List l_tOdr_ODR_CMPLT_DATE = null;

	/** 第 155 List変数： l_tOdr_CUS_DLV_CD */
	public List l_tOdr_CUS_DLV_CD = null;

	/** 第 156 List変数： l_tOdr_CUS_DLV_KEY_CD */
	public List l_tOdr_CUS_DLV_KEY_CD = null;

	/** 第 157 List変数： l_tOdr_PART_NAME */
	public List l_tOdr_PART_NAME = null;

	/** 第 158 List変数： l_tOdr_PKG_UNIT */
	public List l_tOdr_PKG_UNIT = null;

	/** 第 159 List変数： l_tOdr_SLIP_PRICE_PRINT_TYP */
	public List l_tOdr_SLIP_PRICE_PRINT_TYP = null;

	/** 第 160 List変数： l_tOdr_INSPC_TYP */
	public List l_tOdr_INSPC_TYP = null;

	/** 第 161 List変数： l_tOdr_CLIENT_REMARK */
	public List l_tOdr_CLIENT_REMARK = null;

	/** 第 162 List変数： l_tOdr_CLIENT_REMARK_KANJI */
	public List l_tOdr_CLIENT_REMARK_KANJI = null;

	/** 第 163 List変数： l_tOdr_CLIENT_BARCODE_INF */
	public List l_tOdr_CLIENT_BARCODE_INF = null;

	/** 第 164 List変数： l_tOdr_TRANSPORT_CD */
	public List l_tOdr_TRANSPORT_CD = null;

	/** 第 165 List変数： l_tOdr_TRANSPORT_TYP */
	public List l_tOdr_TRANSPORT_TYP = null;

	/** 第 166 List変数： l_tOdr_TAX_APPLY_TYP */
	public List l_tOdr_TAX_APPLY_TYP = null;

	/** 第 167 List変数： l_tOdr_TAX_CD */
	public List l_tOdr_TAX_CD = null;

	/** 第 168 List変数： l_tOdr_TAX_CALC_TYP */
	public List l_tOdr_TAX_CALC_TYP = null;

	/** 第 169 List変数： l_tOdr_REMARKS */
	public List l_tOdr_REMARKS = null;

	/** 第 170 List変数： l_tOdr_ODR_ACPT_DATE */
	public List l_tOdr_ODR_ACPT_DATE = null;

	/** 第 171 List変数： l_tOdr_SHIP_PLAN_REMAIN_QTY */
	public List l_tOdr_SHIP_PLAN_REMAIN_QTY = null;

	/** 第 172 List変数： l_tOdr_SHIP_PLAN_CMPLT_FLG */
	public List l_tOdr_SHIP_PLAN_CMPLT_FLG = null;

	/** 第 173 List変数： l_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG */
	public List l_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG = null;

	/** 第 174 List変数： l_tOdr_PARTIAL_SHIP_INST_FLG */
	public List l_tOdr_PARTIAL_SHIP_INST_FLG = null;

	/** 第 175 List変数： l_tOdr_IF_CTL_NO */
	public List l_tOdr_IF_CTL_NO = null;

	/** 第 176 List変数： l_tOdr_ENTRY_TYP */
	public List l_tOdr_ENTRY_TYP = null;

	/** 第 177 List変数： l_tOdr_BUYER_NAME */
	public List l_tOdr_BUYER_NAME = null;

	/** 第 178 List変数： l_tOdr_PUCH_ODR_QTY_TOTAL */
	public List l_tOdr_PUCH_ODR_QTY_TOTAL = null;

	/** 第 179 List変数： l_tOdr_UNIT_CD_ORG */
	public List l_tOdr_UNIT_CD_ORG = null;

	/** 第 180 List変数： l_tOdr_SHIP_CNT */
	public List l_tOdr_SHIP_CNT = null;

	/** 第 181 List変数： l_tOdr_IN_ODRNO */
	public List l_tOdr_IN_ODRNO = null;

	/** 第 182 List変数： l_uptOdr_PART_DLV_COUNT */
	public List l_uptOdr_PART_DLV_COUNT = null;

	/** 第 183 List変数： l_uptOdr_IN_ODRNO */
	public List l_uptOdr_IN_ODRNO = null;

	/** 第 184 List変数： l_tOdrCtl_ODR_CTL_NO */
	public List l_tOdrCtl_ODR_CTL_NO = null;

	/** 第 185 List変数： l_tOdrCtl_CUST_CD */
	public List l_tOdrCtl_CUST_CD = null;

	/** 第 186 List変数： l_tOdrCtl_CUST_ITEM_CD */
	public List l_tOdrCtl_CUST_ITEM_CD = null;

	/** 第 187 List変数： l_tOdrCtl_CUST_ITEM_NAME */
	public List l_tOdrCtl_CUST_ITEM_NAME = null;

	/** 第 188 List変数： l_tOdrCtl_ITEM_CD */
	public List l_tOdrCtl_ITEM_CD = null;

	/** 第 189 List変数： l_tOdrCtl_ITEM_NAME */
	public List l_tOdrCtl_ITEM_NAME = null;

	/** 第 190 List変数： l_tOdrCtl_IN_ODRCTLNO */
	public List l_tOdrCtl_IN_ODRCTLNO = null;

	/** 第 191 List変数： l_mItem_ITEM_CD */
	public List l_mItem_ITEM_CD = null;

	/** 第 192 List変数： l_mItem_ITEM_NAME */
	public List l_mItem_ITEM_NAME = null;

	/** 第 193 List変数： l_mItem_PRODUCT_TYP */
	public List l_mItem_PRODUCT_TYP = null;

	/** 第 194 List変数： l_mItem_MRP_ODR_TYP */
	public List l_mItem_MRP_ODR_TYP = null;

	/** 第 195 List変数： l_mItem_DRAW_CD */
	public List l_mItem_DRAW_CD = null;

	/** 第 196 List変数： l_mItem_SPEC */
	public List l_mItem_SPEC = null;

	/** 第 197 List変数： l_mItem_HIGH_LEVEL_NO */
	public List l_mItem_HIGH_LEVEL_NO = null;

	/** 第 198 List変数： l_mItem_OUTSIDE_TYP */
	public List l_mItem_OUTSIDE_TYP = null;

	/** 第 199 List変数： l_mItem_STOCK_UNIT_FLG */
	public List l_mItem_STOCK_UNIT_FLG = null;

	/** 第 200 List変数： l_mItem_STOCK_UNIT */
	public List l_mItem_STOCK_UNIT = null;

	/** 第 201 List変数： l_mItem_PKG_UNIT */
	public List l_mItem_PKG_UNIT = null;

	/** 第 202 List変数： l_mItem_PKG_UNIT_QTY */
	public List l_mItem_PKG_UNIT_QTY = null;

	/** 第 203 List変数： l_mItem_UNIT_QTY_TYP */
	public List l_mItem_UNIT_QTY_TYP = null;

	/** 第 204 List変数： l_mItem_ODR_LT */
	public List l_mItem_ODR_LT = null;

	/** 第 205 List変数： l_mItem_FIXED_LT */
	public List l_mItem_FIXED_LT = null;

	/** 第 206 List変数： l_mItem_PROP_LT */
	public List l_mItem_PROP_LT = null;

	/** 第 207 List変数： l_mItem_SAFETY_LT */
	public List l_mItem_SAFETY_LT = null;

	/** 第 208 List変数： l_mItem_ISSUE_LT */
	public List l_mItem_ISSUE_LT = null;

	/** 第 209 List変数： l_mItem_PROP_LOT_SIZE */
	public List l_mItem_PROP_LOT_SIZE = null;

	/** 第 210 List変数： l_mItem_ITEM_SPOIL */
	public List l_mItem_ITEM_SPOIL = null;

	/** 第 211 List変数： l_mItem_SAFETY_STOCK */
	public List l_mItem_SAFETY_STOCK = null;

	/** 第 212 List変数： l_mItem_LOT_SIZING_TYP */
	public List l_mItem_LOT_SIZING_TYP = null;

	/** 第 213 List変数： l_mItem_MAX_PERIOD */
	public List l_mItem_MAX_PERIOD = null;

	/** 第 214 List変数： l_mItem_MAX_ODR_QTY */
	public List l_mItem_MAX_ODR_QTY = null;

	/** 第 215 List変数： l_mItem_ODR_POINT */
	public List l_mItem_ODR_POINT = null;

	/** 第 216 List変数： l_mItem_FIXED_ODR_QTY */
	public List l_mItem_FIXED_ODR_QTY = null;

	/** 第 217 List変数： l_mItem_MIN_ODR_QTY */
	public List l_mItem_MIN_ODR_QTY = null;

	/** 第 218 List変数： l_mItem_MUL_ODR_QTY */
	public List l_mItem_MUL_ODR_QTY = null;

	/** 第 219 List変数： l_mItem_ISSUE_TYP */
	public List l_mItem_ISSUE_TYP = null;

	/** 第 220 List変数： l_mItem_MPS_FLG */
	public List l_mItem_MPS_FLG = null;

	/** 第 221 List変数： l_mItem_ACPT_INSPC_TYP */
	public List l_mItem_ACPT_INSPC_TYP = null;

	/** 第 222 List変数： l_mItem_CLASIFICATION_CD */
	public List l_mItem_CLASIFICATION_CD = null;

	/** 第 223 List変数： l_mItem_UNIT_WEIGHT */
	public List l_mItem_UNIT_WEIGHT = null;

	/** 第 224 List変数： l_mItem_ABC_TYP */
	public List l_mItem_ABC_TYP = null;

	/** 第 225 List変数： l_mItem_OPR_RSLT_TYP */
	public List l_mItem_OPR_RSLT_TYP = null;

	/** 第 226 List変数： l_mItem_SPL_ITEM_TYP */
	public List l_mItem_SPL_ITEM_TYP = null;

	/** 第 227 List変数： l_mItem_TAX_CD */
	public List l_mItem_TAX_CD = null;

	/** 第 228 List変数： l_mItem_IN_ITEMCD */
	public List l_mItem_IN_ITEMCD = null;

	/** 第 229 List変数： l_mCustBase_COMPANY_CD */
	public List l_mCustBase_COMPANY_CD = null;

	/** 第 230 List変数： l_mCustBase_CUST_CD */
	public List l_mCustBase_CUST_CD = null;

	/** 第 231 List変数： l_mCustBase_DLV_LOC_CD */
	public List l_mCustBase_DLV_LOC_CD = null;

	/** 第 232 List変数： l_mCustBase_DLV_LOC_NAME */
	public List l_mCustBase_DLV_LOC_NAME = null;

	/** 第 233 List変数： l_mCustBase_DLV_LOC_KNAME */
	public List l_mCustBase_DLV_LOC_KNAME = null;

	/** 第 234 List変数： l_mCustBase_DLV_LOC_ENAME */
	public List l_mCustBase_DLV_LOC_ENAME = null;

	/** 第 235 List変数： l_mCustBase_ZIP_CD */
	public List l_mCustBase_ZIP_CD = null;

	/** 第 236 List変数： l_mCustBase_ADDRESS_1 */
	public List l_mCustBase_ADDRESS_1 = null;

	/** 第 237 List変数： l_mCustBase_ADDRESS_2 */
	public List l_mCustBase_ADDRESS_2 = null;

	/** 第 238 List変数： l_mCustBase_ADDRESS_K_1 */
	public List l_mCustBase_ADDRESS_K_1 = null;

	/** 第 239 List変数： l_mCustBase_ADDRESS_K_2 */
	public List l_mCustBase_ADDRESS_K_2 = null;

	/** 第 240 List変数： l_mCustBase_TEL */
	public List l_mCustBase_TEL = null;

	/** 第 241 List変数： l_mCustBase_FAX */
	public List l_mCustBase_FAX = null;

	/** 第 242 List変数： l_mCustBase_SHIP_WH_CD */
	public List l_mCustBase_SHIP_WH_CD = null;

	/** 第 243 List変数： l_mCustBase_TRANSPORT_CD */
	public List l_mCustBase_TRANSPORT_CD = null;

	/** 第 244 List変数： l_mCustBase_TRANSPORT_NAME */
	public List l_mCustBase_TRANSPORT_NAME = null;

	/** 第 245 List変数： l_mCustBase_TRANSPORT_LT */
	public List l_mCustBase_TRANSPORT_LT = null;

	/** 第 246 List変数： l_mCustBase_CAL_NO */
	public List l_mCustBase_CAL_NO = null;

	/** 第 247 List変数： l_mCustBase_TRANSPORT_TYP */
	public List l_mCustBase_TRANSPORT_TYP = null;

	/** 第 248 List変数： l_mCustBase_DLV_START_TIME */
	public List l_mCustBase_DLV_START_TIME = null;

	/** 第 249 List変数： l_mCustBase_DLV_END_TIME */
	public List l_mCustBase_DLV_END_TIME = null;

	/** 第 250 List変数： l_mCustBase_AREA_CLASS_TYP1 */
	public List l_mCustBase_AREA_CLASS_TYP1 = null;

	/** 第 251 List変数： l_mCustBase_AREA_CLASS_1 */
	public List l_mCustBase_AREA_CLASS_1 = null;

	/** 第 252 List変数： l_mCustBase_AREA_CLASS_TYP2 */
	public List l_mCustBase_AREA_CLASS_TYP2 = null;

	/** 第 253 List変数： l_mCustBase_AREA_CLASS_2 */
	public List l_mCustBase_AREA_CLASS_2 = null;

	/** 第 254 List変数： l_mCustBase_AREA_CLASS_TYP3 */
	public List l_mCustBase_AREA_CLASS_TYP3 = null;

	/** 第 255 List変数： l_mCustBase_AREA_CLASS_3 */
	public List l_mCustBase_AREA_CLASS_3 = null;

	/** 第 256 List変数： l_mCustBase_REMARKS_1 */
	public List l_mCustBase_REMARKS_1 = null;

	/** 第 257 List変数： l_mCustBase_REMARKS_2 */
	public List l_mCustBase_REMARKS_2 = null;

	/** 第 258 List変数： l_mCustBase_REMARKS_3 */
	public List l_mCustBase_REMARKS_3 = null;

	/** 第 259 List変数： l_mCustBase_DEPO_WH_CD */
	public List l_mCustBase_DEPO_WH_CD = null;

	/** 第 260 List変数： l_mCustBase_IN_COMPANYCD */
	public List l_mCustBase_IN_COMPANYCD = null;

	/** 第 261 List変数： l_mCustBase_IN_CUSTCD */
	public List l_mCustBase_IN_CUSTCD = null;

	/** 第 262 List変数： l_mCustBase_IN_DLVLOCCD */
	public List l_mCustBase_IN_DLVLOCCD = null;

	/** 第 263 List変数： l_mCust_COMPANY_CD */
	public List l_mCust_COMPANY_CD = null;

	/** 第 264 List変数： l_mCust_CUST_CD */
	public List l_mCust_CUST_CD = null;

	/** 第 265 List変数： l_mCust_CUST_NAME */
	public List l_mCust_CUST_NAME = null;

	/** 第 266 List変数： l_mCust_CUST_ANAME */
	public List l_mCust_CUST_ANAME = null;

	/** 第 267 List変数： l_mCust_CUST_KNAME */
	public List l_mCust_CUST_KNAME = null;

	/** 第 268 List変数： l_mCust_OWN_ORG_CD */
	public List l_mCust_OWN_ORG_CD = null;

	/** 第 269 List変数： l_mCust_OWN_PERSON_CD */
	public List l_mCust_OWN_PERSON_CD = null;

	/** 第 270 List変数： l_mCust_CUR_CD */
	public List l_mCust_CUR_CD = null;

	/** 第 271 List変数： l_mCust_EXCH_TYP */
	public List l_mCust_EXCH_TYP = null;

	/** 第 272 List変数： l_mCust_TAX_APPLY_TYP */
	public List l_mCust_TAX_APPLY_TYP = null;

	/** 第 273 List変数： l_mCust_TAX_CD */
	public List l_mCust_TAX_CD = null;

	/** 第 274 List変数： l_mCust_TAX_CALC_TYP */
	public List l_mCust_TAX_CALC_TYP = null;

	/** 第 275 List変数： l_mCust_PRICE_ROUND_TYP */
	public List l_mCust_PRICE_ROUND_TYP = null;

	/** 第 276 List変数： l_mCust_DETAIL_ROUND_TYP */
	public List l_mCust_DETAIL_ROUND_TYP = null;

	/** 第 277 List変数： l_mCust_UNCONFIRM_ODR_EFF_PRIOD */
	public List l_mCust_UNCONFIRM_ODR_EFF_PRIOD = null;

	/** 第 278 List変数： l_mCust_UNCONFIRM_ODR_EFF_TERM_FLG */
	public List l_mCust_UNCONFIRM_ODR_EFF_TERM_FLG = null;

	/** 第 279 List変数： l_mCust_EDI_CUST_VEND_CD */
	public List l_mCust_EDI_CUST_VEND_CD = null;

	/** 第 280 List変数： l_mCust_PARTIAL_SHIP_INST_FLG */
	public List l_mCust_PARTIAL_SHIP_INST_FLG = null;

	/** 第 281 List変数： l_mCust_DEPO_TYP */
	public List l_mCust_DEPO_TYP = null;

	/** 第 282 List変数： l_mCust_INSPC_ACPT_TYP */
	public List l_mCust_INSPC_ACPT_TYP = null;

	/** 第 283 List変数： l_mCust_IN_COMPANYCD */
	public List l_mCust_IN_COMPANYCD = null;

	/** 第 284 List変数： l_mCust_IN_CUSTCD */
	public List l_mCust_IN_CUSTCD = null;

	/** 第 285 List変数： l_strYotaku_WH_CD */
	public List l_strYotaku_WH_CD = null;

	/** 第 286 List変数： l_strYotaku_IN_WH_TYP */
	public List l_strYotaku_IN_WH_TYP = null;

	/** 第 287 List変数： l_in_tShipSlip_SLIP_CD */
	public List l_in_tShipSlip_SLIP_CD = null;

	/** 第 288 List変数： l_in_tShipSlip_ITEM_CD */
	public List l_in_tShipSlip_ITEM_CD = null;

	/** 第 289 List変数： l_in_tShipSlip_CUST_ITEM_CD */
	public List l_in_tShipSlip_CUST_ITEM_CD = null;

	/** 第 290 List変数： l_in_tShipSlip_PART_NAME */
	public List l_in_tShipSlip_PART_NAME = null;

	/** 第 291 List変数： l_in_tShipSlip_CUST_ODR_NO */
	public List l_in_tShipSlip_CUST_ODR_NO = null;

	/** 第 292 List変数： l_in_tShipSlip_CUST_CD */
	public List l_in_tShipSlip_CUST_CD = null;

	/** 第 293 List変数： l_in_tShipSlip_CUST_NAME */
	public List l_in_tShipSlip_CUST_NAME = null;

	/** 第 294 List変数： l_in_tShipSlip_DLV_LOC_CD */
	public List l_in_tShipSlip_DLV_LOC_CD = null;

	/** 第 295 List変数： l_in_tShipSlip_DLV_LOC_NAME_KANJI */
	public List l_in_tShipSlip_DLV_LOC_NAME_KANJI = null;

	/** 第 296 List変数： l_in_tShipSlip_CUS_DLV_KEY_CD */
	public List l_in_tShipSlip_CUS_DLV_KEY_CD = null;

	/** 第 297 List変数： l_in_tShipSlip_DESINATED_SHIP_DATE */
	public List l_in_tShipSlip_DESINATED_SHIP_DATE = null;

	/** 第 298 List変数： l_in_tShipSlip_DESINATED_DLV_DATE */
	public List l_in_tShipSlip_DESINATED_DLV_DATE = null;

	/** 第 299 List変数： l_in_tShipSlip_SCDL_DLV_DATE */
	public List l_in_tShipSlip_SCDL_DLV_DATE = null;

	/** 第 300 List変数： l_in_tShipSlip_SHIP_ODR_QTY */
	public List l_in_tShipSlip_SHIP_ODR_QTY = null;

	/** 第 301 List変数： l_in_tShipSlip_UNIT_CD */
	public List l_in_tShipSlip_UNIT_CD = null;

	/** 第 302 List変数： l_in_tShipSlip_UNIT_PRICE */
	public List l_in_tShipSlip_UNIT_PRICE = null;

	/** 第 303 List変数： l_in_tShipSlip_SHIP_ODR_AMOUNT */
	public List l_in_tShipSlip_SHIP_ODR_AMOUNT = null;

	/** 第 304 List変数： l_in_tShipSlip_TAX_AMOUNT */
	public List l_in_tShipSlip_TAX_AMOUNT = null;

	/** 第 305 List変数： l_in_tShipSlip_INSPC_TYP */
	public List l_in_tShipSlip_INSPC_TYP = null;

	/** 第 306 List変数： l_in_tShipSlip_CLIENT_REMARK_KANJI */
	public List l_in_tShipSlip_CLIENT_REMARK_KANJI = null;

	/** 第 307 List変数： l_in_tShipSlip_CLIENT_BARCODE_INF */
	public List l_in_tShipSlip_CLIENT_BARCODE_INF = null;

	/** 第 308 List変数： l_in_tShipSlip_PRINT_FLG */
	public List l_in_tShipSlip_PRINT_FLG = null;

	/** 第 309 List変数： l_in_tShipSlip_DEL_FLG */
	public List l_in_tShipSlip_DEL_FLG = null;

	/** 第 310 List変数： l_in_tShipSlip_BUYER_NAME */
	public List l_in_tShipSlip_BUYER_NAME = null;

	/** 第 311 List変数： l_in_tShipSlip_PUCH_ODR_QTY_TOTAL */
	public List l_in_tShipSlip_PUCH_ODR_QTY_TOTAL = null;

	/** 第 312 List変数： l_in_tShipSlip_DLV_ODR_QTY */
	public List l_in_tShipSlip_DLV_ODR_QTY = null;

	/** 第 313 List変数： l_in_tShipSlip_SHIP_ODR_AMOUNT_TAX */
	public List l_in_tShipSlip_SHIP_ODR_AMOUNT_TAX = null;

	/** 第 314 List変数： l_in_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT */
	public List l_in_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT = null;

	/** 第 315 List変数： l_in_tShipSlip_INTERNAL_TAX_SALES_AMOUNT */
	public List l_in_tShipSlip_INTERNAL_TAX_SALES_AMOUNT = null;

	/** 第 316 List変数： l_in_tShipSlip_TAXFREE_SALES_AMOUNT */
	public List l_in_tShipSlip_TAXFREE_SALES_AMOUNT = null;

	/** 第 317 List変数： l_in_tShipSlip_TAX_CREDIT_SALES_AMOUNT */
	public List l_in_tShipSlip_TAX_CREDIT_SALES_AMOUNT = null;

	/** 第 318 List変数： l_in_tShipSlip_EXTERNAL_TAX_AMOUNT */
	public List l_in_tShipSlip_EXTERNAL_TAX_AMOUNT = null;

	/** 第 319 List変数： l_in_tShipSlip_INTERNAL_TAX_AMOUNT */
	public List l_in_tShipSlip_INTERNAL_TAX_AMOUNT = null;

	/** 第 320 List変数： l_in_tShipSlip_TAX_AMOUNT_1 */
	public List l_in_tShipSlip_TAX_AMOUNT_1 = null;

	/** 第 321 List変数： l_in_tShipSlip_TAX_AMOUNT_2 */
	public List l_in_tShipSlip_TAX_AMOUNT_2 = null;

	/** 第 322 List変数： l_in_tShipSlip_TAX_AMOUNT_3 */
	public List l_in_tShipSlip_TAX_AMOUNT_3 = null;

	/** 第 323 List変数： l_in_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT */
	public List l_in_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;

	/** 第 324 List変数： l_del_tShipSlip_IN_SLIPCD */
	public List l_del_tShipSlip_IN_SLIPCD = null;

	/** 第 325 List変数： l_uptOdr_SHIP_CNT */
	public List l_uptOdr_SHIP_CNT = null;

	/** 第 326 List変数： l_tUnShipList_UN_SHIP_SEQ_NO */
	public List l_tUnShipList_UN_SHIP_SEQ_NO = null;

	/** 第 327 List変数： l_tUnShipList_CUST_CD */
	public List l_tUnShipList_CUST_CD = null;

	/** 第 328 List変数： l_tUnShipList_ACPT_ODR_CD */
	public List l_tUnShipList_ACPT_ODR_CD = null;

	/** 第 329 List変数： l_tUnShipList_PART_DLV_SEQ_NO */
	public List l_tUnShipList_PART_DLV_SEQ_NO = null;

	/** 第 330 List変数： l_tUnShipList_ITEM_CD */
	public List l_tUnShipList_ITEM_CD = null;

	/** 第 331 List変数： l_tUnShipList_UN_SHIP_QTY */
	public List l_tUnShipList_UN_SHIP_QTY = null;

	/** 第 332 List変数： l_tUnShipList_UN_SHIP_RSN */
	public List l_tUnShipList_UN_SHIP_RSN = null;

	/** 第 333 List変数： l_tUnShipList_WH_CD */
	public List l_tUnShipList_WH_CD = null;

	/** 第 334 List変数： l_tUnShipList_PRINT_FLG */
	public List l_tUnShipList_PRINT_FLG = null;

	/** 第 335 List変数： l_tUnShipList_DEL_FLG */
	public List l_tUnShipList_DEL_FLG = null;

	/** 第 336 List変数： l_tori_tAnsDlvDate_REST_SHIP_ODR_QTY */
	public List l_tori_tAnsDlvDate_REST_SHIP_ODR_QTY = null;

	/** 第 337 List変数： l_tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG */
	public List l_tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG = null;

	/** 第 338 List変数： l_tori_tAnsDlvDate_IN_ODRNO */
	public List l_tori_tAnsDlvDate_IN_ODRNO = null;

	/** 第 339 List変数： l_tori_tAnsDlvDate_IN_PARTDLVSEQNO */
	public List l_tori_tAnsDlvDate_IN_PARTDLVSEQNO = null;

	/** 第 340 List変数： l_l_COUNT */
	public List l_l_COUNT = null;

	/** 第 341 List変数： l_ROW_COUNT */
	public List l_ROW_COUNT = null;

	/** 第 342 List変数： l_strTAX_CD */
	public List l_strTAX_CD = null;

	/** 第 343 List変数： l_SHIP_MODIFY_COUNT */
	public List l_SHIP_MODIFY_COUNT = null;

	/** 第 344 List変数： l_SEL_MODIFY_COUNT */
	public List l_SEL_MODIFY_COUNT = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getr1_SHIP_ODR() { return m_r1_SHIP_ODR; }
	public String getr2_SHIP_ODR() { return m_r2_SHIP_ODR; }
	public String gettAnsDlvDate_MODIFY_COUNT() { return m_tAnsDlvDate_MODIFY_COUNT; }
	public String gettShipOdr_MODIFY_COUNT() { return m_tShipOdr_MODIFY_COUNT; }
	public String getShipt_MODIFY_COUNT() { return m_Shipt_MODIFY_COUNT; }
	public String geth_RESULT() { return m_h_RESULT; }
	public String getstrBUSINESS_OPR_DATE() { return m_strBUSINESS_OPR_DATE; }
	public String getstrPLANT_CD() { return m_strPLANT_CD; }
	public String getstrTaxTAX_KBN() { return m_strTaxTAX_KBN; }
	public String getstrTaxOLD_TAX_1() { return m_strTaxOLD_TAX_1; }
	public String getstrTaxOLD_TAX_2() { return m_strTaxOLD_TAX_2; }
	public String getstrTaxOLD_TAX_3() { return m_strTaxOLD_TAX_3; }
	public String getstrTaxNEW_TAX_1() { return m_strTaxNEW_TAX_1; }
	public String getstrTaxNEW_TAX_2() { return m_strTaxNEW_TAX_2; }
	public String getstrTaxNEW_TAX_3() { return m_strTaxNEW_TAX_3; }
	public String getstrTaxSTART_DATE() { return m_strTaxSTART_DATE; }
	public String getstrTaxROUND_TYP() { return m_strTaxROUND_TYP; }
	public String getstrTaxIN_COMPANYCD() { return m_strTaxIN_COMPANYCD; }
	public String getstrTaxIN_CUSTCD() { return m_strTaxIN_CUSTCD; }
	public String getl_CUST_ITEM_CD() { return m_l_CUST_ITEM_CD; }
	public String gettDECIMAL_FIG() { return m_tDECIMAL_FIG; }
	public String gettCUR_CD() { return m_tCUR_CD; }
	public String getstrCOMPANY_CD() { return m_strCOMPANY_CD; }
	public String getstrUSER_NAME() { return m_strUSER_NAME; }
	public String getstrSECTION_CD() { return m_strSECTION_CD; }
	public String getstrPLANT_NAME() { return m_strPLANT_NAME; }
	public String getstrPLANT_ANAME() { return m_strPLANT_ANAME; }
	public String getstrCAL_NO() { return m_strCAL_NO; }
	public String getstrUSER_CD() { return m_strUSER_CD; }
	public String getstrSYUKA_LT() { return m_strSYUKA_LT; }
	public String gettHOLIDAY_FLG() { return m_tHOLIDAY_FLG; }
	public String gettWH_CD() { return m_tWH_CD; }
	public String gettCAL_DATE() { return m_tCAL_DATE; }
	public String getl_ODR_NO() { return m_l_ODR_NO; }
	public String getl_PART_DLV_SEQ_NO() { return m_l_PART_DLV_SEQ_NO; }
	public String getl_DESINATED_DLV_DATE() { return m_l_DESINATED_DLV_DATE; }
	public String getl_DESINATED_SHIP_DATE() { return m_l_DESINATED_SHIP_DATE; }
	public String getl_SHIP_QTY() { return m_l_SHIP_QTY; }
	public String getl_REST_SHIP_QTY() { return m_l_REST_SHIP_QTY; }
	public String getl_WH_CD() { return m_l_WH_CD; }
	public String getl_WH_NAME() { return m_l_WH_NAME; }
	public String getl_CUST_ODR_NO() { return m_l_CUST_ODR_NO; }
	public String getl_CUST_CD() { return m_l_CUST_CD; }
	public String getl_CUST_NAME() { return m_l_CUST_NAME; }
	public String getl_CUST_ITEM_NAME() { return m_l_CUST_ITEM_NAME; }
	public String getl_ITEM_CD() { return m_l_ITEM_CD; }
	public String getl_ITEM_NAME() { return m_l_ITEM_NAME; }
	public String getl_STOCK_UNIT() { return m_l_STOCK_UNIT; }
	public String getl_UNIT_QTY_TYP() { return m_l_UNIT_QTY_TYP; }
	public String getl_MRP_ODR_TYP() { return m_l_MRP_ODR_TYP; }
	public String getl_ODR_CTL_NO() { return m_l_ODR_CTL_NO; }
	public String getl_TRANSPORT_TYP() { return m_l_TRANSPORT_TYP; }
	public String getl_ODR_UNIT_PRICE() { return m_l_ODR_UNIT_PRICE; }
	public String getl_SPCL_PRICE_TYP() { return m_l_SPCL_PRICE_TYP; }
	public String getl_PARTIAL_SHIP_INST_FLG() { return m_l_PARTIAL_SHIP_INST_FLG; }
	public String getl_MODIFY_COUNT() { return m_l_MODIFY_COUNT; }
	public String getl_JOB_ODR_CD() { return m_l_JOB_ODR_CD; }
	public String getODR_NO() { return m_ODR_NO; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getDESINATED_DLV_DATE() { return m_DESINATED_DLV_DATE; }
	public String getDESINATED_SHIP_DATE() { return m_DESINATED_SHIP_DATE; }
	public String getCUST_CD() { return m_CUST_CD; }
	public String getCUST_CHRG_PSN_CD() { return m_CUST_CHRG_PSN_CD; }
	public String getCUST_ODR_NO() { return m_CUST_ODR_NO; }
	public String getCUST_ITEM_CD() { return m_CUST_ITEM_CD; }
	public String getup_tAnsDlvDate_DESINATED_SHIP_DATE() { return m_up_tAnsDlvDate_DESINATED_SHIP_DATE; }
	public String getup_tAnsDlvDate_REST_SHIP_ODR_QTY() { return m_up_tAnsDlvDate_REST_SHIP_ODR_QTY; }
	public String getup_tAnsDlvDate_SHIP_ODR_CMPLT_FLG() { return m_up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG; }
	public String getup_tAnsDlvDate_IN_ODRNO() { return m_up_tAnsDlvDate_IN_ODRNO; }
	public String getup_tAnsDlvDate_IN_PARTDLVSEQNO() { return m_up_tAnsDlvDate_IN_PARTDLVSEQNO; }
	public String getl_SLIP_CD() { return m_l_SLIP_CD; }
	public String getl_c_DIRECT_DLV_FLG() { return m_l_c_DIRECT_DLV_FLG; }
	public String getl_DLV_MODIFY_COUNT() { return m_l_DLV_MODIFY_COUNT; }
	public String getSLIP_CD() { return m_SLIP_CD; }
	public String getin_tShipOdr_ODR_NO() { return m_in_tShipOdr_ODR_NO; }
	public String getin_tShipOdr_PART_DLV_SEQ_NO() { return m_in_tShipOdr_PART_DLV_SEQ_NO; }
	public String getin_tShipOdr_SLIP_CD() { return m_in_tShipOdr_SLIP_CD; }
	public String getin_tShipOdr_ITEM_CD() { return m_in_tShipOdr_ITEM_CD; }
	public String getin_tShipOdr_CUST_ITEM_CD() { return m_in_tShipOdr_CUST_ITEM_CD; }
	public String getin_tShipOdr_CUST_ODR_NO() { return m_in_tShipOdr_CUST_ODR_NO; }
	public String getin_tShipOdr_CUST_CD() { return m_in_tShipOdr_CUST_CD; }
	public String getin_tShipOdr_CUST_NAME() { return m_in_tShipOdr_CUST_NAME; }
	public String getin_tShipOdr_SHIP_ODR_ISS_PSN_CD() { return m_in_tShipOdr_SHIP_ODR_ISS_PSN_CD; }
	public String getin_tShipOdr_DLV_LOC_CD() { return m_in_tShipOdr_DLV_LOC_CD; }
	public String getin_tShipOdr_DESINATED_SHIP_DATE() { return m_in_tShipOdr_DESINATED_SHIP_DATE; }
	public String getin_tShipOdr_SHIP_QTY() { return m_in_tShipOdr_SHIP_QTY; }
	public String getin_tShipOdr_UNIT_PRICE() { return m_in_tShipOdr_UNIT_PRICE; }
	public Double getin_tShipOdr_SHIP_ODR_AMOUNT() { return m_in_tShipOdr_SHIP_ODR_AMOUNT; }
	public String getin_tShipOdr_CURRNCY_CD() { return m_in_tShipOdr_CURRNCY_CD; }
	public String getin_tShipOdr_PKG_UNIT_QTY() { return m_in_tShipOdr_PKG_UNIT_QTY; }
	public String getin_tShipOdr_REMARKS() { return m_in_tShipOdr_REMARKS; }
	public String getin_tShipOdr_ALLCT_WH_CD() { return m_in_tShipOdr_ALLCT_WH_CD; }
	public String getin_tShipOdr_DEPO_TYP() { return m_in_tShipOdr_DEPO_TYP; }
	public String getin_tShipOdr_ENTRY_TYP() { return m_in_tShipOdr_ENTRY_TYP; }
	public String getin_tShipOdr_PRINT_FLG() { return m_in_tShipOdr_PRINT_FLG; }
	public String getin_tShipOdr_SHP_CMPLT_FLG() { return m_in_tShipOdr_SHP_CMPLT_FLG; }
	public String getin_tShipOdr_DEL_FLG() { return m_in_tShipOdr_DEL_FLG; }
	public String getin_tShipOdr_TRANSPORT_CD() { return m_in_tShipOdr_TRANSPORT_CD; }
	public String getin_tShipOdr_DIRECT_DLV_FLG() { return m_in_tShipOdr_DIRECT_DLV_FLG; }
	public String getin_tShipOdr_CUST_CHRG_PSN_CD() { return m_in_tShipOdr_CUST_CHRG_PSN_CD; }
	public String getin_tShipOdr_UNIT_CD() { return m_in_tShipOdr_UNIT_CD; }
	public String getin_tShipOdr_SCDL_DLV_DATE() { return m_in_tShipOdr_SCDL_DLV_DATE; }
	public String getin_tShipOdr_TRANSFER_WH_CD() { return m_in_tShipOdr_TRANSFER_WH_CD; }
	public String getin_tShipOdr_DLV_KEY_NO() { return m_in_tShipOdr_DLV_KEY_NO; }
	public Double getin_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES() { return m_in_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES; }
	public String getin_tShipOdr_SHIP_ODR_NO() { return m_in_tShipOdr_SHIP_ODR_NO; }
	public String getin_tShipOdr_JOB_ODR_CD() { return m_in_tShipOdr_JOB_ODR_CD; }
	public String getdel_tShipOdr_IN_SLIPCD() { return m_del_tShipOdr_IN_SLIPCD; }
	public String getchkisinWhCd_WH_CD() { return m_chkisinWhCd_WH_CD; }
	public String getchkisinWhCd_WH_TYP() { return m_chkisinWhCd_WH_TYP; }
	public String getchkis_IN_WHCD() { return m_chkis_IN_WHCD; }
	public String getchkisWhCd_WH_CD() { return m_chkisWhCd_WH_CD; }
	public String getchkisWhCd_WH_TYP() { return m_chkisWhCd_WH_TYP; }
	public String getchkisWhCd_ITEM_CD() { return m_chkisWhCd_ITEM_CD; }
	public String getchkisWhCd_PBL_SHIP_QTY() { return m_chkisWhCd_PBL_SHIP_QTY; }
	public String getchkisWhCd_IN_ITEMCD() { return m_chkisWhCd_IN_ITEMCD; }
	public String getchkisWhCd_IN_WHCD() { return m_chkisWhCd_IN_WHCD; }
	public String gettOdr_ODR_NO() { return m_tOdr_ODR_NO; }
	public String gettOdr_ODR_TYP() { return m_tOdr_ODR_TYP; }
	public String gettOdr_ODR_CTL_NO() { return m_tOdr_ODR_CTL_NO; }
	public String gettOdr_CUST_ODR_NO() { return m_tOdr_CUST_ODR_NO; }
	public String gettOdr_CUST_CHRG_ORG_CD() { return m_tOdr_CUST_CHRG_ORG_CD; }
	public String gettOdr_CUST_CHRG_PSN_CD() { return m_tOdr_CUST_CHRG_PSN_CD; }
	public String gettOdr_ODR_ACPT_ORG_CD() { return m_tOdr_ODR_ACPT_ORG_CD; }
	public String gettOdr_ODR_ACPT_PSN_CD() { return m_tOdr_ODR_ACPT_PSN_CD; }
	public String gettOdr_CURRNCY_CD() { return m_tOdr_CURRNCY_CD; }
	public String gettOdr_EXCH_TYP() { return m_tOdr_EXCH_TYP; }
	public String gettOdr_DLV_LOC_CD() { return m_tOdr_DLV_LOC_CD; }
	public String gettOdr_DLV_LOC_CD_EIAJ() { return m_tOdr_DLV_LOC_CD_EIAJ; }
	public String gettOdr_DLV_LOC_NAME() { return m_tOdr_DLV_LOC_NAME; }
	public String gettOdr_DLV_LOC_NAME_KANJI() { return m_tOdr_DLV_LOC_NAME_KANJI; }
	public String gettOdr_PRD_ODR_PLACE_CD() { return m_tOdr_PRD_ODR_PLACE_CD; }
	public String gettOdr_ODR_UNIT_PRICE() { return m_tOdr_ODR_UNIT_PRICE; }
	public String gettOdr_SPCL_PRICE_TYP() { return m_tOdr_SPCL_PRICE_TYP; }
	public String gettOdr_PART_DLV_COUNT() { return m_tOdr_PART_DLV_COUNT; }
	public String gettOdr_DEPO_TYP() { return m_tOdr_DEPO_TYP; }
	public String gettOdr_DESINATED_DLV_DATE() { return m_tOdr_DESINATED_DLV_DATE; }
	public String gettOdr_STD_DESINATED_RCV_DATE() { return m_tOdr_STD_DESINATED_RCV_DATE; }
	public String gettOdr_ODR_QTY() { return m_tOdr_ODR_QTY; }
	public String gettOdr_REMAIN_UNCONFIRM_ODR_QTY() { return m_tOdr_REMAIN_UNCONFIRM_ODR_QTY; }
	public String gettOdr_CANCELED_UNCONFIRM_ODR_QTY() { return m_tOdr_CANCELED_UNCONFIRM_ODR_QTY; }
	public String gettOdr_UNIT_CD() { return m_tOdr_UNIT_CD; }
	public String gettOdr_UNCONFIRM_ODR_BALANCE() { return m_tOdr_UNCONFIRM_ODR_BALANCE; }
	public String gettOdr_ODR_AMOUNT() { return m_tOdr_ODR_AMOUNT; }
	public String gettOdr_ODR_AMOUNT_EXCH_RATES() { return m_tOdr_ODR_AMOUNT_EXCH_RATES; }
	public String gettOdr_TOTAL_SHIP_QTY() { return m_tOdr_TOTAL_SHIP_QTY; }
	public String gettOdr_SHIP_AMOUNT() { return m_tOdr_SHIP_AMOUNT; }
	public String gettOdr_SHIP_AMOUNT_EXCH_RATES() { return m_tOdr_SHIP_AMOUNT_EXCH_RATES; }
	public String gettOdr_RETURN_PRICE() { return m_tOdr_RETURN_PRICE; }
	public String gettOdr_RETURN_QTY() { return m_tOdr_RETURN_QTY; }
	public String gettOdr_RETURN_AMOUNT() { return m_tOdr_RETURN_AMOUNT; }
	public String gettOdr_RETURN_AMOUNT_EXCH_RATES() { return m_tOdr_RETURN_AMOUNT_EXCH_RATES; }
	public String gettOdr_ODR_CMPLT_FLG() { return m_tOdr_ODR_CMPLT_FLG; }
	public String gettOdr_ODR_CMPLT_DATE() { return m_tOdr_ODR_CMPLT_DATE; }
	public String gettOdr_CUS_DLV_CD() { return m_tOdr_CUS_DLV_CD; }
	public String gettOdr_CUS_DLV_KEY_CD() { return m_tOdr_CUS_DLV_KEY_CD; }
	public String gettOdr_PART_NAME() { return m_tOdr_PART_NAME; }
	public String gettOdr_PKG_UNIT() { return m_tOdr_PKG_UNIT; }
	public String gettOdr_SLIP_PRICE_PRINT_TYP() { return m_tOdr_SLIP_PRICE_PRINT_TYP; }
	public String gettOdr_INSPC_TYP() { return m_tOdr_INSPC_TYP; }
	public String gettOdr_CLIENT_REMARK() { return m_tOdr_CLIENT_REMARK; }
	public String gettOdr_CLIENT_REMARK_KANJI() { return m_tOdr_CLIENT_REMARK_KANJI; }
	public String gettOdr_CLIENT_BARCODE_INF() { return m_tOdr_CLIENT_BARCODE_INF; }
	public String gettOdr_TRANSPORT_CD() { return m_tOdr_TRANSPORT_CD; }
	public String gettOdr_TRANSPORT_TYP() { return m_tOdr_TRANSPORT_TYP; }
	public String gettOdr_TAX_APPLY_TYP() { return m_tOdr_TAX_APPLY_TYP; }
	public String gettOdr_TAX_CD() { return m_tOdr_TAX_CD; }
	public String gettOdr_TAX_CALC_TYP() { return m_tOdr_TAX_CALC_TYP; }
	public String gettOdr_REMARKS() { return m_tOdr_REMARKS; }
	public String gettOdr_ODR_ACPT_DATE() { return m_tOdr_ODR_ACPT_DATE; }
	public String gettOdr_SHIP_PLAN_REMAIN_QTY() { return m_tOdr_SHIP_PLAN_REMAIN_QTY; }
	public String gettOdr_SHIP_PLAN_CMPLT_FLG() { return m_tOdr_SHIP_PLAN_CMPLT_FLG; }
	public String gettOdr_UNCONFIRMED_ODR_EFF_OVR_FLG() { return m_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG; }
	public String gettOdr_PARTIAL_SHIP_INST_FLG() { return m_tOdr_PARTIAL_SHIP_INST_FLG; }
	public String gettOdr_IF_CTL_NO() { return m_tOdr_IF_CTL_NO; }
	public String gettOdr_ENTRY_TYP() { return m_tOdr_ENTRY_TYP; }
	public String gettOdr_BUYER_NAME() { return m_tOdr_BUYER_NAME; }
	public String gettOdr_PUCH_ODR_QTY_TOTAL() { return m_tOdr_PUCH_ODR_QTY_TOTAL; }
	public String gettOdr_UNIT_CD_ORG() { return m_tOdr_UNIT_CD_ORG; }
	public String gettOdr_SHIP_CNT() { return m_tOdr_SHIP_CNT; }
	public String gettOdr_IN_ODRNO() { return m_tOdr_IN_ODRNO; }
	public String getuptOdr_PART_DLV_COUNT() { return m_uptOdr_PART_DLV_COUNT; }
	public String getuptOdr_IN_ODRNO() { return m_uptOdr_IN_ODRNO; }
	public String gettOdrCtl_ODR_CTL_NO() { return m_tOdrCtl_ODR_CTL_NO; }
	public String gettOdrCtl_CUST_CD() { return m_tOdrCtl_CUST_CD; }
	public String gettOdrCtl_CUST_ITEM_CD() { return m_tOdrCtl_CUST_ITEM_CD; }
	public String gettOdrCtl_CUST_ITEM_NAME() { return m_tOdrCtl_CUST_ITEM_NAME; }
	public String gettOdrCtl_ITEM_CD() { return m_tOdrCtl_ITEM_CD; }
	public String gettOdrCtl_ITEM_NAME() { return m_tOdrCtl_ITEM_NAME; }
	public String gettOdrCtl_IN_ODRCTLNO() { return m_tOdrCtl_IN_ODRCTLNO; }
	public String getmItem_ITEM_CD() { return m_mItem_ITEM_CD; }
	public String getmItem_ITEM_NAME() { return m_mItem_ITEM_NAME; }
	public String getmItem_PRODUCT_TYP() { return m_mItem_PRODUCT_TYP; }
	public String getmItem_MRP_ODR_TYP() { return m_mItem_MRP_ODR_TYP; }
	public String getmItem_DRAW_CD() { return m_mItem_DRAW_CD; }
	public String getmItem_SPEC() { return m_mItem_SPEC; }
	public String getmItem_HIGH_LEVEL_NO() { return m_mItem_HIGH_LEVEL_NO; }
	public String getmItem_OUTSIDE_TYP() { return m_mItem_OUTSIDE_TYP; }
	public String getmItem_STOCK_UNIT_FLG() { return m_mItem_STOCK_UNIT_FLG; }
	public String getmItem_STOCK_UNIT() { return m_mItem_STOCK_UNIT; }
	public String getmItem_PKG_UNIT() { return m_mItem_PKG_UNIT; }
	public String getmItem_PKG_UNIT_QTY() { return m_mItem_PKG_UNIT_QTY; }
	public String getmItem_UNIT_QTY_TYP() { return m_mItem_UNIT_QTY_TYP; }
	public String getmItem_ODR_LT() { return m_mItem_ODR_LT; }
	public String getmItem_FIXED_LT() { return m_mItem_FIXED_LT; }
	public String getmItem_PROP_LT() { return m_mItem_PROP_LT; }
	public String getmItem_SAFETY_LT() { return m_mItem_SAFETY_LT; }
	public String getmItem_ISSUE_LT() { return m_mItem_ISSUE_LT; }
	public String getmItem_PROP_LOT_SIZE() { return m_mItem_PROP_LOT_SIZE; }
	public String getmItem_ITEM_SPOIL() { return m_mItem_ITEM_SPOIL; }
	public String getmItem_SAFETY_STOCK() { return m_mItem_SAFETY_STOCK; }
	public String getmItem_LOT_SIZING_TYP() { return m_mItem_LOT_SIZING_TYP; }
	public String getmItem_MAX_PERIOD() { return m_mItem_MAX_PERIOD; }
	public String getmItem_MAX_ODR_QTY() { return m_mItem_MAX_ODR_QTY; }
	public String getmItem_ODR_POINT() { return m_mItem_ODR_POINT; }
	public String getmItem_FIXED_ODR_QTY() { return m_mItem_FIXED_ODR_QTY; }
	public String getmItem_MIN_ODR_QTY() { return m_mItem_MIN_ODR_QTY; }
	public String getmItem_MUL_ODR_QTY() { return m_mItem_MUL_ODR_QTY; }
	public String getmItem_ISSUE_TYP() { return m_mItem_ISSUE_TYP; }
	public String getmItem_MPS_FLG() { return m_mItem_MPS_FLG; }
	public String getmItem_ACPT_INSPC_TYP() { return m_mItem_ACPT_INSPC_TYP; }
	public String getmItem_CLASIFICATION_CD() { return m_mItem_CLASIFICATION_CD; }
	public String getmItem_UNIT_WEIGHT() { return m_mItem_UNIT_WEIGHT; }
	public String getmItem_ABC_TYP() { return m_mItem_ABC_TYP; }
	public String getmItem_OPR_RSLT_TYP() { return m_mItem_OPR_RSLT_TYP; }
	public String getmItem_SPL_ITEM_TYP() { return m_mItem_SPL_ITEM_TYP; }
	public String getmItem_TAX_CD() { return m_mItem_TAX_CD; }
	public String getmItem_IN_ITEMCD() { return m_mItem_IN_ITEMCD; }
	public String getmCustBase_COMPANY_CD() { return m_mCustBase_COMPANY_CD; }
	public String getmCustBase_CUST_CD() { return m_mCustBase_CUST_CD; }
	public String getmCustBase_DLV_LOC_CD() { return m_mCustBase_DLV_LOC_CD; }
	public String getmCustBase_DLV_LOC_NAME() { return m_mCustBase_DLV_LOC_NAME; }
	public String getmCustBase_DLV_LOC_KNAME() { return m_mCustBase_DLV_LOC_KNAME; }
	public String getmCustBase_DLV_LOC_ENAME() { return m_mCustBase_DLV_LOC_ENAME; }
	public String getmCustBase_ZIP_CD() { return m_mCustBase_ZIP_CD; }
	public String getmCustBase_ADDRESS_1() { return m_mCustBase_ADDRESS_1; }
	public String getmCustBase_ADDRESS_2() { return m_mCustBase_ADDRESS_2; }
	public String getmCustBase_ADDRESS_K_1() { return m_mCustBase_ADDRESS_K_1; }
	public String getmCustBase_ADDRESS_K_2() { return m_mCustBase_ADDRESS_K_2; }
	public String getmCustBase_TEL() { return m_mCustBase_TEL; }
	public String getmCustBase_FAX() { return m_mCustBase_FAX; }
	public String getmCustBase_SHIP_WH_CD() { return m_mCustBase_SHIP_WH_CD; }
	public String getmCustBase_TRANSPORT_CD() { return m_mCustBase_TRANSPORT_CD; }
	public String getmCustBase_TRANSPORT_NAME() { return m_mCustBase_TRANSPORT_NAME; }
	public String getmCustBase_TRANSPORT_LT() { return m_mCustBase_TRANSPORT_LT; }
	public String getmCustBase_CAL_NO() { return m_mCustBase_CAL_NO; }
	public String getmCustBase_TRANSPORT_TYP() { return m_mCustBase_TRANSPORT_TYP; }
	public String getmCustBase_DLV_START_TIME() { return m_mCustBase_DLV_START_TIME; }
	public String getmCustBase_DLV_END_TIME() { return m_mCustBase_DLV_END_TIME; }
	public String getmCustBase_AREA_CLASS_TYP1() { return m_mCustBase_AREA_CLASS_TYP1; }
	public String getmCustBase_AREA_CLASS_1() { return m_mCustBase_AREA_CLASS_1; }
	public String getmCustBase_AREA_CLASS_TYP2() { return m_mCustBase_AREA_CLASS_TYP2; }
	public String getmCustBase_AREA_CLASS_2() { return m_mCustBase_AREA_CLASS_2; }
	public String getmCustBase_AREA_CLASS_TYP3() { return m_mCustBase_AREA_CLASS_TYP3; }
	public String getmCustBase_AREA_CLASS_3() { return m_mCustBase_AREA_CLASS_3; }
	public String getmCustBase_REMARKS_1() { return m_mCustBase_REMARKS_1; }
	public String getmCustBase_REMARKS_2() { return m_mCustBase_REMARKS_2; }
	public String getmCustBase_REMARKS_3() { return m_mCustBase_REMARKS_3; }
	public String getmCustBase_DEPO_WH_CD() { return m_mCustBase_DEPO_WH_CD; }
	public String getmCustBase_IN_COMPANYCD() { return m_mCustBase_IN_COMPANYCD; }
	public String getmCustBase_IN_CUSTCD() { return m_mCustBase_IN_CUSTCD; }
	public String getmCustBase_IN_DLVLOCCD() { return m_mCustBase_IN_DLVLOCCD; }
	public String getmCust_COMPANY_CD() { return m_mCust_COMPANY_CD; }
	public String getmCust_CUST_CD() { return m_mCust_CUST_CD; }
	public String getmCust_CUST_NAME() { return m_mCust_CUST_NAME; }
	public String getmCust_CUST_ANAME() { return m_mCust_CUST_ANAME; }
	public String getmCust_CUST_KNAME() { return m_mCust_CUST_KNAME; }
	public String getmCust_OWN_ORG_CD() { return m_mCust_OWN_ORG_CD; }
	public String getmCust_OWN_PERSON_CD() { return m_mCust_OWN_PERSON_CD; }
	public String getmCust_CUR_CD() { return m_mCust_CUR_CD; }
	public String getmCust_EXCH_TYP() { return m_mCust_EXCH_TYP; }
	public String getmCust_TAX_APPLY_TYP() { return m_mCust_TAX_APPLY_TYP; }
	public String getmCust_TAX_CD() { return m_mCust_TAX_CD; }
	public String getmCust_TAX_CALC_TYP() { return m_mCust_TAX_CALC_TYP; }
	public String getmCust_PRICE_ROUND_TYP() { return m_mCust_PRICE_ROUND_TYP; }
	public String getmCust_DETAIL_ROUND_TYP() { return m_mCust_DETAIL_ROUND_TYP; }
	public String getmCust_UNCONFIRM_ODR_EFF_PRIOD() { return m_mCust_UNCONFIRM_ODR_EFF_PRIOD; }
	public String getmCust_UNCONFIRM_ODR_EFF_TERM_FLG() { return m_mCust_UNCONFIRM_ODR_EFF_TERM_FLG; }
	public String getmCust_EDI_CUST_VEND_CD() { return m_mCust_EDI_CUST_VEND_CD; }
	public String getmCust_PARTIAL_SHIP_INST_FLG() { return m_mCust_PARTIAL_SHIP_INST_FLG; }
	public String getmCust_DEPO_TYP() { return m_mCust_DEPO_TYP; }
	public String getmCust_INSPC_ACPT_TYP() { return m_mCust_INSPC_ACPT_TYP; }
	public String getmCust_IN_COMPANYCD() { return m_mCust_IN_COMPANYCD; }
	public String getmCust_IN_CUSTCD() { return m_mCust_IN_CUSTCD; }
	public String getstrYotaku_WH_CD() { return m_strYotaku_WH_CD; }
	public String getstrYotaku_IN_WH_TYP() { return m_strYotaku_IN_WH_TYP; }
	public String getin_tShipSlip_SLIP_CD() { return m_in_tShipSlip_SLIP_CD; }
	public String getin_tShipSlip_ITEM_CD() { return m_in_tShipSlip_ITEM_CD; }
	public String getin_tShipSlip_CUST_ITEM_CD() { return m_in_tShipSlip_CUST_ITEM_CD; }
	public String getin_tShipSlip_PART_NAME() { return m_in_tShipSlip_PART_NAME; }
	public String getin_tShipSlip_CUST_ODR_NO() { return m_in_tShipSlip_CUST_ODR_NO; }
	public String getin_tShipSlip_CUST_CD() { return m_in_tShipSlip_CUST_CD; }
	public String getin_tShipSlip_CUST_NAME() { return m_in_tShipSlip_CUST_NAME; }
	public String getin_tShipSlip_DLV_LOC_CD() { return m_in_tShipSlip_DLV_LOC_CD; }
	public String getin_tShipSlip_DLV_LOC_NAME_KANJI() { return m_in_tShipSlip_DLV_LOC_NAME_KANJI; }
	public String getin_tShipSlip_CUS_DLV_KEY_CD() { return m_in_tShipSlip_CUS_DLV_KEY_CD; }
	public String getin_tShipSlip_DESINATED_SHIP_DATE() { return m_in_tShipSlip_DESINATED_SHIP_DATE; }
	public String getin_tShipSlip_DESINATED_DLV_DATE() { return m_in_tShipSlip_DESINATED_DLV_DATE; }
	public String getin_tShipSlip_SCDL_DLV_DATE() { return m_in_tShipSlip_SCDL_DLV_DATE; }
	public String getin_tShipSlip_SHIP_ODR_QTY() { return m_in_tShipSlip_SHIP_ODR_QTY; }
	public String getin_tShipSlip_UNIT_CD() { return m_in_tShipSlip_UNIT_CD; }
	public String getin_tShipSlip_UNIT_PRICE() { return m_in_tShipSlip_UNIT_PRICE; }
	public String getin_tShipSlip_SHIP_ODR_AMOUNT() { return m_in_tShipSlip_SHIP_ODR_AMOUNT; }
	public String getin_tShipSlip_TAX_AMOUNT() { return m_in_tShipSlip_TAX_AMOUNT; }
	public String getin_tShipSlip_INSPC_TYP() { return m_in_tShipSlip_INSPC_TYP; }
	public String getin_tShipSlip_CLIENT_REMARK_KANJI() { return m_in_tShipSlip_CLIENT_REMARK_KANJI; }
	public String getin_tShipSlip_CLIENT_BARCODE_INF() { return m_in_tShipSlip_CLIENT_BARCODE_INF; }
	public String getin_tShipSlip_PRINT_FLG() { return m_in_tShipSlip_PRINT_FLG; }
	public String getin_tShipSlip_DEL_FLG() { return m_in_tShipSlip_DEL_FLG; }
	public String getin_tShipSlip_BUYER_NAME() { return m_in_tShipSlip_BUYER_NAME; }
	public String getin_tShipSlip_PUCH_ODR_QTY_TOTAL() { return m_in_tShipSlip_PUCH_ODR_QTY_TOTAL; }
	public String getin_tShipSlip_DLV_ODR_QTY() { return m_in_tShipSlip_DLV_ODR_QTY; }
	public String getin_tShipSlip_SHIP_ODR_AMOUNT_TAX() { return m_in_tShipSlip_SHIP_ODR_AMOUNT_TAX; }
	public String getin_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT() { return m_in_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT; }
	public String getin_tShipSlip_INTERNAL_TAX_SALES_AMOUNT() { return m_in_tShipSlip_INTERNAL_TAX_SALES_AMOUNT; }
	public String getin_tShipSlip_TAXFREE_SALES_AMOUNT() { return m_in_tShipSlip_TAXFREE_SALES_AMOUNT; }
	public String getin_tShipSlip_TAX_CREDIT_SALES_AMOUNT() { return m_in_tShipSlip_TAX_CREDIT_SALES_AMOUNT; }
	public String getin_tShipSlip_EXTERNAL_TAX_AMOUNT() { return m_in_tShipSlip_EXTERNAL_TAX_AMOUNT; }
	public String getin_tShipSlip_INTERNAL_TAX_AMOUNT() { return m_in_tShipSlip_INTERNAL_TAX_AMOUNT; }
	public String getin_tShipSlip_TAX_AMOUNT_1() { return m_in_tShipSlip_TAX_AMOUNT_1; }
	public String getin_tShipSlip_TAX_AMOUNT_2() { return m_in_tShipSlip_TAX_AMOUNT_2; }
	public String getin_tShipSlip_TAX_AMOUNT_3() { return m_in_tShipSlip_TAX_AMOUNT_3; }
	public String getin_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT() { return m_in_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT; }
	public String getdel_tShipSlip_IN_SLIPCD() { return m_del_tShipSlip_IN_SLIPCD; }
	public String getuptOdr_SHIP_CNT() { return m_uptOdr_SHIP_CNT; }
	public String gettUnShipList_UN_SHIP_SEQ_NO() { return m_tUnShipList_UN_SHIP_SEQ_NO; }
	public String gettUnShipList_CUST_CD() { return m_tUnShipList_CUST_CD; }
	public String gettUnShipList_ACPT_ODR_CD() { return m_tUnShipList_ACPT_ODR_CD; }
	public String gettUnShipList_PART_DLV_SEQ_NO() { return m_tUnShipList_PART_DLV_SEQ_NO; }
	public String gettUnShipList_ITEM_CD() { return m_tUnShipList_ITEM_CD; }
	public String gettUnShipList_UN_SHIP_QTY() { return m_tUnShipList_UN_SHIP_QTY; }
	public String gettUnShipList_UN_SHIP_RSN() { return m_tUnShipList_UN_SHIP_RSN; }
	public String gettUnShipList_WH_CD() { return m_tUnShipList_WH_CD; }
	public String gettUnShipList_PRINT_FLG() { return m_tUnShipList_PRINT_FLG; }
	public String gettUnShipList_DEL_FLG() { return m_tUnShipList_DEL_FLG; }
	public String gettori_tAnsDlvDate_REST_SHIP_ODR_QTY() { return m_tori_tAnsDlvDate_REST_SHIP_ODR_QTY; }
	public String gettori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG() { return m_tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG; }
	public String gettori_tAnsDlvDate_IN_ODRNO() { return m_tori_tAnsDlvDate_IN_ODRNO; }
	public String gettori_tAnsDlvDate_IN_PARTDLVSEQNO() { return m_tori_tAnsDlvDate_IN_PARTDLVSEQNO; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }
	public String getstrTAX_CD() { return m_strTAX_CD; }
	public String getSHIP_MODIFY_COUNT() { return m_SHIP_MODIFY_COUNT; }
	public String getSEL_MODIFY_COUNT() { return m_SEL_MODIFY_COUNT; }

	public List getList_r1_SHIP_ODR() { return l_r1_SHIP_ODR; }
	public List getList_r2_SHIP_ODR() { return l_r2_SHIP_ODR; }
	public List getList_tAnsDlvDate_MODIFY_COUNT() { return l_tAnsDlvDate_MODIFY_COUNT; }
	public List getList_tShipOdr_MODIFY_COUNT() { return l_tShipOdr_MODIFY_COUNT; }
	public List getList_Shipt_MODIFY_COUNT() { return l_Shipt_MODIFY_COUNT; }
	public List getList_h_RESULT() { return l_h_RESULT; }
	public List getList_strBUSINESS_OPR_DATE() { return l_strBUSINESS_OPR_DATE; }
	public List getList_strPLANT_CD() { return l_strPLANT_CD; }
	public List getList_strTaxTAX_KBN() { return l_strTaxTAX_KBN; }
	public List getList_strTaxOLD_TAX_1() { return l_strTaxOLD_TAX_1; }
	public List getList_strTaxOLD_TAX_2() { return l_strTaxOLD_TAX_2; }
	public List getList_strTaxOLD_TAX_3() { return l_strTaxOLD_TAX_3; }
	public List getList_strTaxNEW_TAX_1() { return l_strTaxNEW_TAX_1; }
	public List getList_strTaxNEW_TAX_2() { return l_strTaxNEW_TAX_2; }
	public List getList_strTaxNEW_TAX_3() { return l_strTaxNEW_TAX_3; }
	public List getList_strTaxSTART_DATE() { return l_strTaxSTART_DATE; }
	public List getList_strTaxROUND_TYP() { return l_strTaxROUND_TYP; }
	public List getList_strTaxIN_COMPANYCD() { return l_strTaxIN_COMPANYCD; }
	public List getList_strTaxIN_CUSTCD() { return l_strTaxIN_CUSTCD; }
	public List getList_l_CUST_ITEM_CD() { return l_l_CUST_ITEM_CD; }
	public List getList_tDECIMAL_FIG() { return l_tDECIMAL_FIG; }
	public List getList_tCUR_CD() { return l_tCUR_CD; }
	public List getList_strCOMPANY_CD() { return l_strCOMPANY_CD; }
	public List getList_strUSER_NAME() { return l_strUSER_NAME; }
	public List getList_strSECTION_CD() { return l_strSECTION_CD; }
	public List getList_strPLANT_NAME() { return l_strPLANT_NAME; }
	public List getList_strPLANT_ANAME() { return l_strPLANT_ANAME; }
	public List getList_strCAL_NO() { return l_strCAL_NO; }
	public List getList_strUSER_CD() { return l_strUSER_CD; }
	public List getList_strSYUKA_LT() { return l_strSYUKA_LT; }
	public List getList_tHOLIDAY_FLG() { return l_tHOLIDAY_FLG; }
	public List getList_tWH_CD() { return l_tWH_CD; }
	public List getList_tCAL_DATE() { return l_tCAL_DATE; }
	public List getList_l_ODR_NO() { return l_l_ODR_NO; }
	public List getList_l_PART_DLV_SEQ_NO() { return l_l_PART_DLV_SEQ_NO; }
	public List getList_l_DESINATED_DLV_DATE() { return l_l_DESINATED_DLV_DATE; }
	public List getList_l_DESINATED_SHIP_DATE() { return l_l_DESINATED_SHIP_DATE; }
	public List getList_l_SHIP_QTY() { return l_l_SHIP_QTY; }
	public List getList_l_REST_SHIP_QTY() { return l_l_REST_SHIP_QTY; }
	public List getList_l_WH_CD() { return l_l_WH_CD; }
	public List getList_l_WH_NAME() { return l_l_WH_NAME; }
	public List getList_l_CUST_ODR_NO() { return l_l_CUST_ODR_NO; }
	public List getList_l_CUST_CD() { return l_l_CUST_CD; }
	public List getList_l_CUST_NAME() { return l_l_CUST_NAME; }
	public List getList_l_CUST_ITEM_NAME() { return l_l_CUST_ITEM_NAME; }
	public List getList_l_ITEM_CD() { return l_l_ITEM_CD; }
	public List getList_l_ITEM_NAME() { return l_l_ITEM_NAME; }
	public List getList_l_STOCK_UNIT() { return l_l_STOCK_UNIT; }
	public List getList_l_UNIT_QTY_TYP() { return l_l_UNIT_QTY_TYP; }
	public List getList_l_MRP_ODR_TYP() { return l_l_MRP_ODR_TYP; }
	public List getList_l_ODR_CTL_NO() { return l_l_ODR_CTL_NO; }
	public List getList_l_TRANSPORT_TYP() { return l_l_TRANSPORT_TYP; }
	public List getList_l_ODR_UNIT_PRICE() { return l_l_ODR_UNIT_PRICE; }
	public List getList_l_SPCL_PRICE_TYP() { return l_l_SPCL_PRICE_TYP; }
	public List getList_l_PARTIAL_SHIP_INST_FLG() { return l_l_PARTIAL_SHIP_INST_FLG; }
	public List getList_l_MODIFY_COUNT() { return l_l_MODIFY_COUNT; }
	public List getList_l_JOB_ODR_CD() { return l_l_JOB_ODR_CD; }
	public List getList_ODR_NO() { return l_ODR_NO; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_DESINATED_DLV_DATE() { return l_DESINATED_DLV_DATE; }
	public List getList_DESINATED_SHIP_DATE() { return l_DESINATED_SHIP_DATE; }
	public List getList_CUST_CD() { return l_CUST_CD; }
	public List getList_CUST_CHRG_PSN_CD() { return l_CUST_CHRG_PSN_CD; }
	public List getList_CUST_ODR_NO() { return l_CUST_ODR_NO; }
	public List getList_CUST_ITEM_CD() { return l_CUST_ITEM_CD; }
	public List getList_up_tAnsDlvDate_DESINATED_SHIP_DATE() { return l_up_tAnsDlvDate_DESINATED_SHIP_DATE; }
	public List getList_up_tAnsDlvDate_REST_SHIP_ODR_QTY() { return l_up_tAnsDlvDate_REST_SHIP_ODR_QTY; }
	public List getList_up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG() { return l_up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG; }
	public List getList_up_tAnsDlvDate_IN_ODRNO() { return l_up_tAnsDlvDate_IN_ODRNO; }
	public List getList_up_tAnsDlvDate_IN_PARTDLVSEQNO() { return l_up_tAnsDlvDate_IN_PARTDLVSEQNO; }
	public List getList_l_SLIP_CD() { return l_l_SLIP_CD; }
	public List getList_l_c_DIRECT_DLV_FLG() { return l_l_c_DIRECT_DLV_FLG; }
	public List getList_l_DLV_MODIFY_COUNT() { return l_l_DLV_MODIFY_COUNT; }
	public List getList_SLIP_CD() { return l_SLIP_CD; }
	public List getList_in_tShipOdr_ODR_NO() { return l_in_tShipOdr_ODR_NO; }
	public List getList_in_tShipOdr_PART_DLV_SEQ_NO() { return l_in_tShipOdr_PART_DLV_SEQ_NO; }
	public List getList_in_tShipOdr_SLIP_CD() { return l_in_tShipOdr_SLIP_CD; }
	public List getList_in_tShipOdr_ITEM_CD() { return l_in_tShipOdr_ITEM_CD; }
	public List getList_in_tShipOdr_CUST_ITEM_CD() { return l_in_tShipOdr_CUST_ITEM_CD; }
	public List getList_in_tShipOdr_CUST_ODR_NO() { return l_in_tShipOdr_CUST_ODR_NO; }
	public List getList_in_tShipOdr_CUST_CD() { return l_in_tShipOdr_CUST_CD; }
	public List getList_in_tShipOdr_CUST_NAME() { return l_in_tShipOdr_CUST_NAME; }
	public List getList_in_tShipOdr_SHIP_ODR_ISS_PSN_CD() { return l_in_tShipOdr_SHIP_ODR_ISS_PSN_CD; }
	public List getList_in_tShipOdr_DLV_LOC_CD() { return l_in_tShipOdr_DLV_LOC_CD; }
	public List getList_in_tShipOdr_DESINATED_SHIP_DATE() { return l_in_tShipOdr_DESINATED_SHIP_DATE; }
	public List getList_in_tShipOdr_SHIP_QTY() { return l_in_tShipOdr_SHIP_QTY; }
	public List getList_in_tShipOdr_UNIT_PRICE() { return l_in_tShipOdr_UNIT_PRICE; }
	public List getList_in_tShipOdr_SHIP_ODR_AMOUNT() { return l_in_tShipOdr_SHIP_ODR_AMOUNT; }
	public List getList_in_tShipOdr_CURRNCY_CD() { return l_in_tShipOdr_CURRNCY_CD; }
	public List getList_in_tShipOdr_PKG_UNIT_QTY() { return l_in_tShipOdr_PKG_UNIT_QTY; }
	public List getList_in_tShipOdr_REMARKS() { return l_in_tShipOdr_REMARKS; }
	public List getList_in_tShipOdr_ALLCT_WH_CD() { return l_in_tShipOdr_ALLCT_WH_CD; }
	public List getList_in_tShipOdr_DEPO_TYP() { return l_in_tShipOdr_DEPO_TYP; }
	public List getList_in_tShipOdr_ENTRY_TYP() { return l_in_tShipOdr_ENTRY_TYP; }
	public List getList_in_tShipOdr_PRINT_FLG() { return l_in_tShipOdr_PRINT_FLG; }
	public List getList_in_tShipOdr_SHP_CMPLT_FLG() { return l_in_tShipOdr_SHP_CMPLT_FLG; }
	public List getList_in_tShipOdr_DEL_FLG() { return l_in_tShipOdr_DEL_FLG; }
	public List getList_in_tShipOdr_TRANSPORT_CD() { return l_in_tShipOdr_TRANSPORT_CD; }
	public List getList_in_tShipOdr_DIRECT_DLV_FLG() { return l_in_tShipOdr_DIRECT_DLV_FLG; }
	public List getList_in_tShipOdr_CUST_CHRG_PSN_CD() { return l_in_tShipOdr_CUST_CHRG_PSN_CD; }
	public List getList_in_tShipOdr_UNIT_CD() { return l_in_tShipOdr_UNIT_CD; }
	public List getList_in_tShipOdr_SCDL_DLV_DATE() { return l_in_tShipOdr_SCDL_DLV_DATE; }
	public List getList_in_tShipOdr_TRANSFER_WH_CD() { return l_in_tShipOdr_TRANSFER_WH_CD; }
	public List getList_in_tShipOdr_DLV_KEY_NO() { return l_in_tShipOdr_DLV_KEY_NO; }
	public List getList_in_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES() { return l_in_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES; }
	public List getList_in_tShipOdr_SHIP_ODR_NO() { return l_in_tShipOdr_SHIP_ODR_NO; }
	public List getList_in_tShipOdr_JOB_ODR_CD() { return l_in_tShipOdr_JOB_ODR_CD; }
	public List getList_del_tShipOdr_IN_SLIPCD() { return l_del_tShipOdr_IN_SLIPCD; }
	public List getList_chkisinWhCd_WH_CD() { return l_chkisinWhCd_WH_CD; }
	public List getList_chkisinWhCd_WH_TYP() { return l_chkisinWhCd_WH_TYP; }
	public List getList_chkis_IN_WHCD() { return l_chkis_IN_WHCD; }
	public List getList_chkisWhCd_WH_CD() { return l_chkisWhCd_WH_CD; }
	public List getList_chkisWhCd_WH_TYP() { return l_chkisWhCd_WH_TYP; }
	public List getList_chkisWhCd_ITEM_CD() { return l_chkisWhCd_ITEM_CD; }
	public List getList_chkisWhCd_PBL_SHIP_QTY() { return l_chkisWhCd_PBL_SHIP_QTY; }
	public List getList_chkisWhCd_IN_ITEMCD() { return l_chkisWhCd_IN_ITEMCD; }
	public List getList_chkisWhCd_IN_WHCD() { return l_chkisWhCd_IN_WHCD; }
	public List getList_tOdr_ODR_NO() { return l_tOdr_ODR_NO; }
	public List getList_tOdr_ODR_TYP() { return l_tOdr_ODR_TYP; }
	public List getList_tOdr_ODR_CTL_NO() { return l_tOdr_ODR_CTL_NO; }
	public List getList_tOdr_CUST_ODR_NO() { return l_tOdr_CUST_ODR_NO; }
	public List getList_tOdr_CUST_CHRG_ORG_CD() { return l_tOdr_CUST_CHRG_ORG_CD; }
	public List getList_tOdr_CUST_CHRG_PSN_CD() { return l_tOdr_CUST_CHRG_PSN_CD; }
	public List getList_tOdr_ODR_ACPT_ORG_CD() { return l_tOdr_ODR_ACPT_ORG_CD; }
	public List getList_tOdr_ODR_ACPT_PSN_CD() { return l_tOdr_ODR_ACPT_PSN_CD; }
	public List getList_tOdr_CURRNCY_CD() { return l_tOdr_CURRNCY_CD; }
	public List getList_tOdr_EXCH_TYP() { return l_tOdr_EXCH_TYP; }
	public List getList_tOdr_DLV_LOC_CD() { return l_tOdr_DLV_LOC_CD; }
	public List getList_tOdr_DLV_LOC_CD_EIAJ() { return l_tOdr_DLV_LOC_CD_EIAJ; }
	public List getList_tOdr_DLV_LOC_NAME() { return l_tOdr_DLV_LOC_NAME; }
	public List getList_tOdr_DLV_LOC_NAME_KANJI() { return l_tOdr_DLV_LOC_NAME_KANJI; }
	public List getList_tOdr_PRD_ODR_PLACE_CD() { return l_tOdr_PRD_ODR_PLACE_CD; }
	public List getList_tOdr_ODR_UNIT_PRICE() { return l_tOdr_ODR_UNIT_PRICE; }
	public List getList_tOdr_SPCL_PRICE_TYP() { return l_tOdr_SPCL_PRICE_TYP; }
	public List getList_tOdr_PART_DLV_COUNT() { return l_tOdr_PART_DLV_COUNT; }
	public List getList_tOdr_DEPO_TYP() { return l_tOdr_DEPO_TYP; }
	public List getList_tOdr_DESINATED_DLV_DATE() { return l_tOdr_DESINATED_DLV_DATE; }
	public List getList_tOdr_STD_DESINATED_RCV_DATE() { return l_tOdr_STD_DESINATED_RCV_DATE; }
	public List getList_tOdr_ODR_QTY() { return l_tOdr_ODR_QTY; }
	public List getList_tOdr_REMAIN_UNCONFIRM_ODR_QTY() { return l_tOdr_REMAIN_UNCONFIRM_ODR_QTY; }
	public List getList_tOdr_CANCELED_UNCONFIRM_ODR_QTY() { return l_tOdr_CANCELED_UNCONFIRM_ODR_QTY; }
	public List getList_tOdr_UNIT_CD() { return l_tOdr_UNIT_CD; }
	public List getList_tOdr_UNCONFIRM_ODR_BALANCE() { return l_tOdr_UNCONFIRM_ODR_BALANCE; }
	public List getList_tOdr_ODR_AMOUNT() { return l_tOdr_ODR_AMOUNT; }
	public List getList_tOdr_ODR_AMOUNT_EXCH_RATES() { return l_tOdr_ODR_AMOUNT_EXCH_RATES; }
	public List getList_tOdr_TOTAL_SHIP_QTY() { return l_tOdr_TOTAL_SHIP_QTY; }
	public List getList_tOdr_SHIP_AMOUNT() { return l_tOdr_SHIP_AMOUNT; }
	public List getList_tOdr_SHIP_AMOUNT_EXCH_RATES() { return l_tOdr_SHIP_AMOUNT_EXCH_RATES; }
	public List getList_tOdr_RETURN_PRICE() { return l_tOdr_RETURN_PRICE; }
	public List getList_tOdr_RETURN_QTY() { return l_tOdr_RETURN_QTY; }
	public List getList_tOdr_RETURN_AMOUNT() { return l_tOdr_RETURN_AMOUNT; }
	public List getList_tOdr_RETURN_AMOUNT_EXCH_RATES() { return l_tOdr_RETURN_AMOUNT_EXCH_RATES; }
	public List getList_tOdr_ODR_CMPLT_FLG() { return l_tOdr_ODR_CMPLT_FLG; }
	public List getList_tOdr_ODR_CMPLT_DATE() { return l_tOdr_ODR_CMPLT_DATE; }
	public List getList_tOdr_CUS_DLV_CD() { return l_tOdr_CUS_DLV_CD; }
	public List getList_tOdr_CUS_DLV_KEY_CD() { return l_tOdr_CUS_DLV_KEY_CD; }
	public List getList_tOdr_PART_NAME() { return l_tOdr_PART_NAME; }
	public List getList_tOdr_PKG_UNIT() { return l_tOdr_PKG_UNIT; }
	public List getList_tOdr_SLIP_PRICE_PRINT_TYP() { return l_tOdr_SLIP_PRICE_PRINT_TYP; }
	public List getList_tOdr_INSPC_TYP() { return l_tOdr_INSPC_TYP; }
	public List getList_tOdr_CLIENT_REMARK() { return l_tOdr_CLIENT_REMARK; }
	public List getList_tOdr_CLIENT_REMARK_KANJI() { return l_tOdr_CLIENT_REMARK_KANJI; }
	public List getList_tOdr_CLIENT_BARCODE_INF() { return l_tOdr_CLIENT_BARCODE_INF; }
	public List getList_tOdr_TRANSPORT_CD() { return l_tOdr_TRANSPORT_CD; }
	public List getList_tOdr_TRANSPORT_TYP() { return l_tOdr_TRANSPORT_TYP; }
	public List getList_tOdr_TAX_APPLY_TYP() { return l_tOdr_TAX_APPLY_TYP; }
	public List getList_tOdr_TAX_CD() { return l_tOdr_TAX_CD; }
	public List getList_tOdr_TAX_CALC_TYP() { return l_tOdr_TAX_CALC_TYP; }
	public List getList_tOdr_REMARKS() { return l_tOdr_REMARKS; }
	public List getList_tOdr_ODR_ACPT_DATE() { return l_tOdr_ODR_ACPT_DATE; }
	public List getList_tOdr_SHIP_PLAN_REMAIN_QTY() { return l_tOdr_SHIP_PLAN_REMAIN_QTY; }
	public List getList_tOdr_SHIP_PLAN_CMPLT_FLG() { return l_tOdr_SHIP_PLAN_CMPLT_FLG; }
	public List getList_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG() { return l_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG; }
	public List getList_tOdr_PARTIAL_SHIP_INST_FLG() { return l_tOdr_PARTIAL_SHIP_INST_FLG; }
	public List getList_tOdr_IF_CTL_NO() { return l_tOdr_IF_CTL_NO; }
	public List getList_tOdr_ENTRY_TYP() { return l_tOdr_ENTRY_TYP; }
	public List getList_tOdr_BUYER_NAME() { return l_tOdr_BUYER_NAME; }
	public List getList_tOdr_PUCH_ODR_QTY_TOTAL() { return l_tOdr_PUCH_ODR_QTY_TOTAL; }
	public List getList_tOdr_UNIT_CD_ORG() { return l_tOdr_UNIT_CD_ORG; }
	public List getList_tOdr_SHIP_CNT() { return l_tOdr_SHIP_CNT; }
	public List getList_tOdr_IN_ODRNO() { return l_tOdr_IN_ODRNO; }
	public List getList_uptOdr_PART_DLV_COUNT() { return l_uptOdr_PART_DLV_COUNT; }
	public List getList_uptOdr_IN_ODRNO() { return l_uptOdr_IN_ODRNO; }
	public List getList_tOdrCtl_ODR_CTL_NO() { return l_tOdrCtl_ODR_CTL_NO; }
	public List getList_tOdrCtl_CUST_CD() { return l_tOdrCtl_CUST_CD; }
	public List getList_tOdrCtl_CUST_ITEM_CD() { return l_tOdrCtl_CUST_ITEM_CD; }
	public List getList_tOdrCtl_CUST_ITEM_NAME() { return l_tOdrCtl_CUST_ITEM_NAME; }
	public List getList_tOdrCtl_ITEM_CD() { return l_tOdrCtl_ITEM_CD; }
	public List getList_tOdrCtl_ITEM_NAME() { return l_tOdrCtl_ITEM_NAME; }
	public List getList_tOdrCtl_IN_ODRCTLNO() { return l_tOdrCtl_IN_ODRCTLNO; }
	public List getList_mItem_ITEM_CD() { return l_mItem_ITEM_CD; }
	public List getList_mItem_ITEM_NAME() { return l_mItem_ITEM_NAME; }
	public List getList_mItem_PRODUCT_TYP() { return l_mItem_PRODUCT_TYP; }
	public List getList_mItem_MRP_ODR_TYP() { return l_mItem_MRP_ODR_TYP; }
	public List getList_mItem_DRAW_CD() { return l_mItem_DRAW_CD; }
	public List getList_mItem_SPEC() { return l_mItem_SPEC; }
	public List getList_mItem_HIGH_LEVEL_NO() { return l_mItem_HIGH_LEVEL_NO; }
	public List getList_mItem_OUTSIDE_TYP() { return l_mItem_OUTSIDE_TYP; }
	public List getList_mItem_STOCK_UNIT_FLG() { return l_mItem_STOCK_UNIT_FLG; }
	public List getList_mItem_STOCK_UNIT() { return l_mItem_STOCK_UNIT; }
	public List getList_mItem_PKG_UNIT() { return l_mItem_PKG_UNIT; }
	public List getList_mItem_PKG_UNIT_QTY() { return l_mItem_PKG_UNIT_QTY; }
	public List getList_mItem_UNIT_QTY_TYP() { return l_mItem_UNIT_QTY_TYP; }
	public List getList_mItem_ODR_LT() { return l_mItem_ODR_LT; }
	public List getList_mItem_FIXED_LT() { return l_mItem_FIXED_LT; }
	public List getList_mItem_PROP_LT() { return l_mItem_PROP_LT; }
	public List getList_mItem_SAFETY_LT() { return l_mItem_SAFETY_LT; }
	public List getList_mItem_ISSUE_LT() { return l_mItem_ISSUE_LT; }
	public List getList_mItem_PROP_LOT_SIZE() { return l_mItem_PROP_LOT_SIZE; }
	public List getList_mItem_ITEM_SPOIL() { return l_mItem_ITEM_SPOIL; }
	public List getList_mItem_SAFETY_STOCK() { return l_mItem_SAFETY_STOCK; }
	public List getList_mItem_LOT_SIZING_TYP() { return l_mItem_LOT_SIZING_TYP; }
	public List getList_mItem_MAX_PERIOD() { return l_mItem_MAX_PERIOD; }
	public List getList_mItem_MAX_ODR_QTY() { return l_mItem_MAX_ODR_QTY; }
	public List getList_mItem_ODR_POINT() { return l_mItem_ODR_POINT; }
	public List getList_mItem_FIXED_ODR_QTY() { return l_mItem_FIXED_ODR_QTY; }
	public List getList_mItem_MIN_ODR_QTY() { return l_mItem_MIN_ODR_QTY; }
	public List getList_mItem_MUL_ODR_QTY() { return l_mItem_MUL_ODR_QTY; }
	public List getList_mItem_ISSUE_TYP() { return l_mItem_ISSUE_TYP; }
	public List getList_mItem_MPS_FLG() { return l_mItem_MPS_FLG; }
	public List getList_mItem_ACPT_INSPC_TYP() { return l_mItem_ACPT_INSPC_TYP; }
	public List getList_mItem_CLASIFICATION_CD() { return l_mItem_CLASIFICATION_CD; }
	public List getList_mItem_UNIT_WEIGHT() { return l_mItem_UNIT_WEIGHT; }
	public List getList_mItem_ABC_TYP() { return l_mItem_ABC_TYP; }
	public List getList_mItem_OPR_RSLT_TYP() { return l_mItem_OPR_RSLT_TYP; }
	public List getList_mItem_SPL_ITEM_TYP() { return l_mItem_SPL_ITEM_TYP; }
	public List getList_mItem_TAX_CD() { return l_mItem_TAX_CD; }
	public List getList_mItem_IN_ITEMCD() { return l_mItem_IN_ITEMCD; }
	public List getList_mCustBase_COMPANY_CD() { return l_mCustBase_COMPANY_CD; }
	public List getList_mCustBase_CUST_CD() { return l_mCustBase_CUST_CD; }
	public List getList_mCustBase_DLV_LOC_CD() { return l_mCustBase_DLV_LOC_CD; }
	public List getList_mCustBase_DLV_LOC_NAME() { return l_mCustBase_DLV_LOC_NAME; }
	public List getList_mCustBase_DLV_LOC_KNAME() { return l_mCustBase_DLV_LOC_KNAME; }
	public List getList_mCustBase_DLV_LOC_ENAME() { return l_mCustBase_DLV_LOC_ENAME; }
	public List getList_mCustBase_ZIP_CD() { return l_mCustBase_ZIP_CD; }
	public List getList_mCustBase_ADDRESS_1() { return l_mCustBase_ADDRESS_1; }
	public List getList_mCustBase_ADDRESS_2() { return l_mCustBase_ADDRESS_2; }
	public List getList_mCustBase_ADDRESS_K_1() { return l_mCustBase_ADDRESS_K_1; }
	public List getList_mCustBase_ADDRESS_K_2() { return l_mCustBase_ADDRESS_K_2; }
	public List getList_mCustBase_TEL() { return l_mCustBase_TEL; }
	public List getList_mCustBase_FAX() { return l_mCustBase_FAX; }
	public List getList_mCustBase_SHIP_WH_CD() { return l_mCustBase_SHIP_WH_CD; }
	public List getList_mCustBase_TRANSPORT_CD() { return l_mCustBase_TRANSPORT_CD; }
	public List getList_mCustBase_TRANSPORT_NAME() { return l_mCustBase_TRANSPORT_NAME; }
	public List getList_mCustBase_TRANSPORT_LT() { return l_mCustBase_TRANSPORT_LT; }
	public List getList_mCustBase_CAL_NO() { return l_mCustBase_CAL_NO; }
	public List getList_mCustBase_TRANSPORT_TYP() { return l_mCustBase_TRANSPORT_TYP; }
	public List getList_mCustBase_DLV_START_TIME() { return l_mCustBase_DLV_START_TIME; }
	public List getList_mCustBase_DLV_END_TIME() { return l_mCustBase_DLV_END_TIME; }
	public List getList_mCustBase_AREA_CLASS_TYP1() { return l_mCustBase_AREA_CLASS_TYP1; }
	public List getList_mCustBase_AREA_CLASS_1() { return l_mCustBase_AREA_CLASS_1; }
	public List getList_mCustBase_AREA_CLASS_TYP2() { return l_mCustBase_AREA_CLASS_TYP2; }
	public List getList_mCustBase_AREA_CLASS_2() { return l_mCustBase_AREA_CLASS_2; }
	public List getList_mCustBase_AREA_CLASS_TYP3() { return l_mCustBase_AREA_CLASS_TYP3; }
	public List getList_mCustBase_AREA_CLASS_3() { return l_mCustBase_AREA_CLASS_3; }
	public List getList_mCustBase_REMARKS_1() { return l_mCustBase_REMARKS_1; }
	public List getList_mCustBase_REMARKS_2() { return l_mCustBase_REMARKS_2; }
	public List getList_mCustBase_REMARKS_3() { return l_mCustBase_REMARKS_3; }
	public List getList_mCustBase_DEPO_WH_CD() { return l_mCustBase_DEPO_WH_CD; }
	public List getList_mCustBase_IN_COMPANYCD() { return l_mCustBase_IN_COMPANYCD; }
	public List getList_mCustBase_IN_CUSTCD() { return l_mCustBase_IN_CUSTCD; }
	public List getList_mCustBase_IN_DLVLOCCD() { return l_mCustBase_IN_DLVLOCCD; }
	public List getList_mCust_COMPANY_CD() { return l_mCust_COMPANY_CD; }
	public List getList_mCust_CUST_CD() { return l_mCust_CUST_CD; }
	public List getList_mCust_CUST_NAME() { return l_mCust_CUST_NAME; }
	public List getList_mCust_CUST_ANAME() { return l_mCust_CUST_ANAME; }
	public List getList_mCust_CUST_KNAME() { return l_mCust_CUST_KNAME; }
	public List getList_mCust_OWN_ORG_CD() { return l_mCust_OWN_ORG_CD; }
	public List getList_mCust_OWN_PERSON_CD() { return l_mCust_OWN_PERSON_CD; }
	public List getList_mCust_CUR_CD() { return l_mCust_CUR_CD; }
	public List getList_mCust_EXCH_TYP() { return l_mCust_EXCH_TYP; }
	public List getList_mCust_TAX_APPLY_TYP() { return l_mCust_TAX_APPLY_TYP; }
	public List getList_mCust_TAX_CD() { return l_mCust_TAX_CD; }
	public List getList_mCust_TAX_CALC_TYP() { return l_mCust_TAX_CALC_TYP; }
	public List getList_mCust_PRICE_ROUND_TYP() { return l_mCust_PRICE_ROUND_TYP; }
	public List getList_mCust_DETAIL_ROUND_TYP() { return l_mCust_DETAIL_ROUND_TYP; }
	public List getList_mCust_UNCONFIRM_ODR_EFF_PRIOD() { return l_mCust_UNCONFIRM_ODR_EFF_PRIOD; }
	public List getList_mCust_UNCONFIRM_ODR_EFF_TERM_FLG() { return l_mCust_UNCONFIRM_ODR_EFF_TERM_FLG; }
	public List getList_mCust_EDI_CUST_VEND_CD() { return l_mCust_EDI_CUST_VEND_CD; }
	public List getList_mCust_PARTIAL_SHIP_INST_FLG() { return l_mCust_PARTIAL_SHIP_INST_FLG; }
	public List getList_mCust_DEPO_TYP() { return l_mCust_DEPO_TYP; }
	public List getList_mCust_INSPC_ACPT_TYP() { return l_mCust_INSPC_ACPT_TYP; }
	public List getList_mCust_IN_COMPANYCD() { return l_mCust_IN_COMPANYCD; }
	public List getList_mCust_IN_CUSTCD() { return l_mCust_IN_CUSTCD; }
	public List getList_strYotaku_WH_CD() { return l_strYotaku_WH_CD; }
	public List getList_strYotaku_IN_WH_TYP() { return l_strYotaku_IN_WH_TYP; }
	public List getList_in_tShipSlip_SLIP_CD() { return l_in_tShipSlip_SLIP_CD; }
	public List getList_in_tShipSlip_ITEM_CD() { return l_in_tShipSlip_ITEM_CD; }
	public List getList_in_tShipSlip_CUST_ITEM_CD() { return l_in_tShipSlip_CUST_ITEM_CD; }
	public List getList_in_tShipSlip_PART_NAME() { return l_in_tShipSlip_PART_NAME; }
	public List getList_in_tShipSlip_CUST_ODR_NO() { return l_in_tShipSlip_CUST_ODR_NO; }
	public List getList_in_tShipSlip_CUST_CD() { return l_in_tShipSlip_CUST_CD; }
	public List getList_in_tShipSlip_CUST_NAME() { return l_in_tShipSlip_CUST_NAME; }
	public List getList_in_tShipSlip_DLV_LOC_CD() { return l_in_tShipSlip_DLV_LOC_CD; }
	public List getList_in_tShipSlip_DLV_LOC_NAME_KANJI() { return l_in_tShipSlip_DLV_LOC_NAME_KANJI; }
	public List getList_in_tShipSlip_CUS_DLV_KEY_CD() { return l_in_tShipSlip_CUS_DLV_KEY_CD; }
	public List getList_in_tShipSlip_DESINATED_SHIP_DATE() { return l_in_tShipSlip_DESINATED_SHIP_DATE; }
	public List getList_in_tShipSlip_DESINATED_DLV_DATE() { return l_in_tShipSlip_DESINATED_DLV_DATE; }
	public List getList_in_tShipSlip_SCDL_DLV_DATE() { return l_in_tShipSlip_SCDL_DLV_DATE; }
	public List getList_in_tShipSlip_SHIP_ODR_QTY() { return l_in_tShipSlip_SHIP_ODR_QTY; }
	public List getList_in_tShipSlip_UNIT_CD() { return l_in_tShipSlip_UNIT_CD; }
	public List getList_in_tShipSlip_UNIT_PRICE() { return l_in_tShipSlip_UNIT_PRICE; }
	public List getList_in_tShipSlip_SHIP_ODR_AMOUNT() { return l_in_tShipSlip_SHIP_ODR_AMOUNT; }
	public List getList_in_tShipSlip_TAX_AMOUNT() { return l_in_tShipSlip_TAX_AMOUNT; }
	public List getList_in_tShipSlip_INSPC_TYP() { return l_in_tShipSlip_INSPC_TYP; }
	public List getList_in_tShipSlip_CLIENT_REMARK_KANJI() { return l_in_tShipSlip_CLIENT_REMARK_KANJI; }
	public List getList_in_tShipSlip_CLIENT_BARCODE_INF() { return l_in_tShipSlip_CLIENT_BARCODE_INF; }
	public List getList_in_tShipSlip_PRINT_FLG() { return l_in_tShipSlip_PRINT_FLG; }
	public List getList_in_tShipSlip_DEL_FLG() { return l_in_tShipSlip_DEL_FLG; }
	public List getList_in_tShipSlip_BUYER_NAME() { return l_in_tShipSlip_BUYER_NAME; }
	public List getList_in_tShipSlip_PUCH_ODR_QTY_TOTAL() { return l_in_tShipSlip_PUCH_ODR_QTY_TOTAL; }
	public List getList_in_tShipSlip_DLV_ODR_QTY() { return l_in_tShipSlip_DLV_ODR_QTY; }
	public List getList_in_tShipSlip_SHIP_ODR_AMOUNT_TAX() { return l_in_tShipSlip_SHIP_ODR_AMOUNT_TAX; }
	public List getList_in_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT() { return l_in_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT; }
	public List getList_in_tShipSlip_INTERNAL_TAX_SALES_AMOUNT() { return l_in_tShipSlip_INTERNAL_TAX_SALES_AMOUNT; }
	public List getList_in_tShipSlip_TAXFREE_SALES_AMOUNT() { return l_in_tShipSlip_TAXFREE_SALES_AMOUNT; }
	public List getList_in_tShipSlip_TAX_CREDIT_SALES_AMOUNT() { return l_in_tShipSlip_TAX_CREDIT_SALES_AMOUNT; }
	public List getList_in_tShipSlip_EXTERNAL_TAX_AMOUNT() { return l_in_tShipSlip_EXTERNAL_TAX_AMOUNT; }
	public List getList_in_tShipSlip_INTERNAL_TAX_AMOUNT() { return l_in_tShipSlip_INTERNAL_TAX_AMOUNT; }
	public List getList_in_tShipSlip_TAX_AMOUNT_1() { return l_in_tShipSlip_TAX_AMOUNT_1; }
	public List getList_in_tShipSlip_TAX_AMOUNT_2() { return l_in_tShipSlip_TAX_AMOUNT_2; }
	public List getList_in_tShipSlip_TAX_AMOUNT_3() { return l_in_tShipSlip_TAX_AMOUNT_3; }
	public List getList_in_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT() { return l_in_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT; }
	public List getList_del_tShipSlip_IN_SLIPCD() { return l_del_tShipSlip_IN_SLIPCD; }
	public List getList_uptOdr_SHIP_CNT() { return l_uptOdr_SHIP_CNT; }
	public List getList_tUnShipList_UN_SHIP_SEQ_NO() { return l_tUnShipList_UN_SHIP_SEQ_NO; }
	public List getList_tUnShipList_CUST_CD() { return l_tUnShipList_CUST_CD; }
	public List getList_tUnShipList_ACPT_ODR_CD() { return l_tUnShipList_ACPT_ODR_CD; }
	public List getList_tUnShipList_PART_DLV_SEQ_NO() { return l_tUnShipList_PART_DLV_SEQ_NO; }
	public List getList_tUnShipList_ITEM_CD() { return l_tUnShipList_ITEM_CD; }
	public List getList_tUnShipList_UN_SHIP_QTY() { return l_tUnShipList_UN_SHIP_QTY; }
	public List getList_tUnShipList_UN_SHIP_RSN() { return l_tUnShipList_UN_SHIP_RSN; }
	public List getList_tUnShipList_WH_CD() { return l_tUnShipList_WH_CD; }
	public List getList_tUnShipList_PRINT_FLG() { return l_tUnShipList_PRINT_FLG; }
	public List getList_tUnShipList_DEL_FLG() { return l_tUnShipList_DEL_FLG; }
	public List getList_tori_tAnsDlvDate_REST_SHIP_ODR_QTY() { return l_tori_tAnsDlvDate_REST_SHIP_ODR_QTY; }
	public List getList_tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG() { return l_tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG; }
	public List getList_tori_tAnsDlvDate_IN_ODRNO() { return l_tori_tAnsDlvDate_IN_ODRNO; }
	public List getList_tori_tAnsDlvDate_IN_PARTDLVSEQNO() { return l_tori_tAnsDlvDate_IN_PARTDLVSEQNO; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }
	public List getList_strTAX_CD() { return l_strTAX_CD; }
	public List getList_SHIP_MODIFY_COUNT() { return l_SHIP_MODIFY_COUNT; }
	public List getList_SEL_MODIFY_COUNT() { return l_SEL_MODIFY_COUNT; }

	public void setr1_SHIP_ODR(String val) { m_r1_SHIP_ODR = val; }
	public void setr2_SHIP_ODR(String val) { m_r2_SHIP_ODR = val; }
	public void settAnsDlvDate_MODIFY_COUNT(String val) { m_tAnsDlvDate_MODIFY_COUNT = val; }
	public void settShipOdr_MODIFY_COUNT(String val) { m_tShipOdr_MODIFY_COUNT = val; }
	public void setShipt_MODIFY_COUNT(String val) { m_Shipt_MODIFY_COUNT = val; }
	public void seth_RESULT(String val) { m_h_RESULT = val; }
	public void setstrBUSINESS_OPR_DATE(String val) { m_strBUSINESS_OPR_DATE = val; }
	public void setstrPLANT_CD(String val) { m_strPLANT_CD = val; }
	public void setstrTaxTAX_KBN(String val) { m_strTaxTAX_KBN = val; }
	public void setstrTaxOLD_TAX_1(String val) { m_strTaxOLD_TAX_1 = val; }
	public void setstrTaxOLD_TAX_2(String val) { m_strTaxOLD_TAX_2 = val; }
	public void setstrTaxOLD_TAX_3(String val) { m_strTaxOLD_TAX_3 = val; }
	public void setstrTaxNEW_TAX_1(String val) { m_strTaxNEW_TAX_1 = val; }
	public void setstrTaxNEW_TAX_2(String val) { m_strTaxNEW_TAX_2 = val; }
	public void setstrTaxNEW_TAX_3(String val) { m_strTaxNEW_TAX_3 = val; }
	public void setstrTaxSTART_DATE(String val) { m_strTaxSTART_DATE = val; }
	public void setstrTaxROUND_TYP(String val) { m_strTaxROUND_TYP = val; }
	public void setstrTaxIN_COMPANYCD(String val) { m_strTaxIN_COMPANYCD = val; }
	public void setstrTaxIN_CUSTCD(String val) { m_strTaxIN_CUSTCD = val; }
	public void setl_CUST_ITEM_CD(String val) { m_l_CUST_ITEM_CD = val; }
	public void settDECIMAL_FIG(String val) { m_tDECIMAL_FIG = val; }
	public void settCUR_CD(String val) { m_tCUR_CD = val; }
	public void setstrCOMPANY_CD(String val) { m_strCOMPANY_CD = val; }
	public void setstrUSER_NAME(String val) { m_strUSER_NAME = val; }
	public void setstrSECTION_CD(String val) { m_strSECTION_CD = val; }
	public void setstrPLANT_NAME(String val) { m_strPLANT_NAME = val; }
	public void setstrPLANT_ANAME(String val) { m_strPLANT_ANAME = val; }
	public void setstrCAL_NO(String val) { m_strCAL_NO = val; }
	public void setstrUSER_CD(String val) { m_strUSER_CD = val; }
	public void setstrSYUKA_LT(String val) { m_strSYUKA_LT = val; }
	public void settHOLIDAY_FLG(String val) { m_tHOLIDAY_FLG = val; }
	public void settWH_CD(String val) { m_tWH_CD = val; }
	public void settCAL_DATE(String val) { m_tCAL_DATE = val; }
	public void setl_ODR_NO(String val) { m_l_ODR_NO = val; }
	public void setl_PART_DLV_SEQ_NO(String val) { m_l_PART_DLV_SEQ_NO = val; }
	public void setl_DESINATED_DLV_DATE(String val) { m_l_DESINATED_DLV_DATE = val; }
	public void setl_DESINATED_SHIP_DATE(String val) { m_l_DESINATED_SHIP_DATE = val; }
	public void setl_SHIP_QTY(String val) { m_l_SHIP_QTY = val; }
	public void setl_REST_SHIP_QTY(String val) { m_l_REST_SHIP_QTY = val; }
	public void setl_WH_CD(String val) { m_l_WH_CD = val; }
	public void setl_WH_NAME(String val) { m_l_WH_NAME = val; }
	public void setl_CUST_ODR_NO(String val) { m_l_CUST_ODR_NO = val; }
	public void setl_CUST_CD(String val) { m_l_CUST_CD = val; }
	public void setl_CUST_NAME(String val) { m_l_CUST_NAME = val; }
	public void setl_CUST_ITEM_NAME(String val) { m_l_CUST_ITEM_NAME = val; }
	public void setl_ITEM_CD(String val) { m_l_ITEM_CD = val; }
	public void setl_ITEM_NAME(String val) { m_l_ITEM_NAME = val; }
	public void setl_STOCK_UNIT(String val) { m_l_STOCK_UNIT = val; }
	public void setl_UNIT_QTY_TYP(String val) { m_l_UNIT_QTY_TYP = val; }
	public void setl_MRP_ODR_TYP(String val) { m_l_MRP_ODR_TYP = val; }
	public void setl_ODR_CTL_NO(String val) { m_l_ODR_CTL_NO = val; }
	public void setl_TRANSPORT_TYP(String val) { m_l_TRANSPORT_TYP = val; }
	public void setl_ODR_UNIT_PRICE(String val) { m_l_ODR_UNIT_PRICE = val; }
	public void setl_SPCL_PRICE_TYP(String val) { m_l_SPCL_PRICE_TYP = val; }
	public void setl_PARTIAL_SHIP_INST_FLG(String val) { m_l_PARTIAL_SHIP_INST_FLG = val; }
	public void setl_MODIFY_COUNT(String val) { m_l_MODIFY_COUNT = val; }
	public void setl_JOB_ODR_CD(String val) { m_l_JOB_ODR_CD = val; }
	public void setODR_NO(String val) { m_ODR_NO = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setDESINATED_DLV_DATE(String val) { m_DESINATED_DLV_DATE = val; }
	public void setDESINATED_SHIP_DATE(String val) { m_DESINATED_SHIP_DATE = val; }
	public void setCUST_CD(String val) { m_CUST_CD = val; }
	public void setCUST_CHRG_PSN_CD(String val) { m_CUST_CHRG_PSN_CD = val; }
	public void setCUST_ODR_NO(String val) { m_CUST_ODR_NO = val; }
	public void setCUST_ITEM_CD(String val) { m_CUST_ITEM_CD = val; }
	public void setup_tAnsDlvDate_DESINATED_SHIP_DATE(String val) { m_up_tAnsDlvDate_DESINATED_SHIP_DATE = val; }
	public void setup_tAnsDlvDate_REST_SHIP_ODR_QTY(String val) { m_up_tAnsDlvDate_REST_SHIP_ODR_QTY = val; }
	public void setup_tAnsDlvDate_SHIP_ODR_CMPLT_FLG(String val) { m_up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG = val; }
	public void setup_tAnsDlvDate_IN_ODRNO(String val) { m_up_tAnsDlvDate_IN_ODRNO = val; }
	public void setup_tAnsDlvDate_IN_PARTDLVSEQNO(String val) { m_up_tAnsDlvDate_IN_PARTDLVSEQNO = val; }
	public void setl_SLIP_CD(String val) { m_l_SLIP_CD = val; }
	public void setl_c_DIRECT_DLV_FLG(String val) { m_l_c_DIRECT_DLV_FLG = val; }
	public void setl_DLV_MODIFY_COUNT(String val) { m_l_DLV_MODIFY_COUNT = val; }
	public void setSLIP_CD(String val) { m_SLIP_CD = val; }
	public void setin_tShipOdr_ODR_NO(String val) { m_in_tShipOdr_ODR_NO = val; }
	public void setin_tShipOdr_PART_DLV_SEQ_NO(String val) { m_in_tShipOdr_PART_DLV_SEQ_NO = val; }
	public void setin_tShipOdr_SLIP_CD(String val) { m_in_tShipOdr_SLIP_CD = val; }
	public void setin_tShipOdr_ITEM_CD(String val) { m_in_tShipOdr_ITEM_CD = val; }
	public void setin_tShipOdr_CUST_ITEM_CD(String val) { m_in_tShipOdr_CUST_ITEM_CD = val; }
	public void setin_tShipOdr_CUST_ODR_NO(String val) { m_in_tShipOdr_CUST_ODR_NO = val; }
	public void setin_tShipOdr_CUST_CD(String val) { m_in_tShipOdr_CUST_CD = val; }
	public void setin_tShipOdr_CUST_NAME(String val) { m_in_tShipOdr_CUST_NAME = val; }
	public void setin_tShipOdr_SHIP_ODR_ISS_PSN_CD(String val) { m_in_tShipOdr_SHIP_ODR_ISS_PSN_CD = val; }
	public void setin_tShipOdr_DLV_LOC_CD(String val) { m_in_tShipOdr_DLV_LOC_CD = val; }
	public void setin_tShipOdr_DESINATED_SHIP_DATE(String val) { m_in_tShipOdr_DESINATED_SHIP_DATE = val; }
	public void setin_tShipOdr_SHIP_QTY(String val) { m_in_tShipOdr_SHIP_QTY = val; }
	public void setin_tShipOdr_UNIT_PRICE(String val) { m_in_tShipOdr_UNIT_PRICE = val; }
	public void setin_tShipOdr_SHIP_ODR_AMOUNT(Double val) { m_in_tShipOdr_SHIP_ODR_AMOUNT = val; }
	public void setin_tShipOdr_CURRNCY_CD(String val) { m_in_tShipOdr_CURRNCY_CD = val; }
	public void setin_tShipOdr_PKG_UNIT_QTY(String val) { m_in_tShipOdr_PKG_UNIT_QTY = val; }
	public void setin_tShipOdr_REMARKS(String val) { m_in_tShipOdr_REMARKS = val; }
	public void setin_tShipOdr_ALLCT_WH_CD(String val) { m_in_tShipOdr_ALLCT_WH_CD = val; }
	public void setin_tShipOdr_DEPO_TYP(String val) { m_in_tShipOdr_DEPO_TYP = val; }
	public void setin_tShipOdr_ENTRY_TYP(String val) { m_in_tShipOdr_ENTRY_TYP = val; }
	public void setin_tShipOdr_PRINT_FLG(String val) { m_in_tShipOdr_PRINT_FLG = val; }
	public void setin_tShipOdr_SHP_CMPLT_FLG(String val) { m_in_tShipOdr_SHP_CMPLT_FLG = val; }
	public void setin_tShipOdr_DEL_FLG(String val) { m_in_tShipOdr_DEL_FLG = val; }
	public void setin_tShipOdr_TRANSPORT_CD(String val) { m_in_tShipOdr_TRANSPORT_CD = val; }
	public void setin_tShipOdr_DIRECT_DLV_FLG(String val) { m_in_tShipOdr_DIRECT_DLV_FLG = val; }
	public void setin_tShipOdr_CUST_CHRG_PSN_CD(String val) { m_in_tShipOdr_CUST_CHRG_PSN_CD = val; }
	public void setin_tShipOdr_UNIT_CD(String val) { m_in_tShipOdr_UNIT_CD = val; }
	public void setin_tShipOdr_SCDL_DLV_DATE(String val) { m_in_tShipOdr_SCDL_DLV_DATE = val; }
	public void setin_tShipOdr_TRANSFER_WH_CD(String val) { m_in_tShipOdr_TRANSFER_WH_CD = val; }
	public void setin_tShipOdr_DLV_KEY_NO(String val) { m_in_tShipOdr_DLV_KEY_NO = val; }
	public void setin_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES(Double val) { m_in_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES = val; }
	public void setin_tShipOdr_SHIP_ODR_NO(String val) { m_in_tShipOdr_SHIP_ODR_NO = val; }
	public void setin_tShipOdr_JOB_ODR_CD(String val) { m_in_tShipOdr_JOB_ODR_CD = val; }
	public void setdel_tShipOdr_IN_SLIPCD(String val) { m_del_tShipOdr_IN_SLIPCD = val; }
	public void setchkisinWhCd_WH_CD(String val) { m_chkisinWhCd_WH_CD = val; }
	public void setchkisinWhCd_WH_TYP(String val) { m_chkisinWhCd_WH_TYP = val; }
	public void setchkis_IN_WHCD(String val) { m_chkis_IN_WHCD = val; }
	public void setchkisWhCd_WH_CD(String val) { m_chkisWhCd_WH_CD = val; }
	public void setchkisWhCd_WH_TYP(String val) { m_chkisWhCd_WH_TYP = val; }
	public void setchkisWhCd_ITEM_CD(String val) { m_chkisWhCd_ITEM_CD = val; }
	public void setchkisWhCd_PBL_SHIP_QTY(String val) { m_chkisWhCd_PBL_SHIP_QTY = val; }
	public void setchkisWhCd_IN_ITEMCD(String val) { m_chkisWhCd_IN_ITEMCD = val; }
	public void setchkisWhCd_IN_WHCD(String val) { m_chkisWhCd_IN_WHCD = val; }
	public void settOdr_ODR_NO(String val) { m_tOdr_ODR_NO = val; }
	public void settOdr_ODR_TYP(String val) { m_tOdr_ODR_TYP = val; }
	public void settOdr_ODR_CTL_NO(String val) { m_tOdr_ODR_CTL_NO = val; }
	public void settOdr_CUST_ODR_NO(String val) { m_tOdr_CUST_ODR_NO = val; }
	public void settOdr_CUST_CHRG_ORG_CD(String val) { m_tOdr_CUST_CHRG_ORG_CD = val; }
	public void settOdr_CUST_CHRG_PSN_CD(String val) { m_tOdr_CUST_CHRG_PSN_CD = val; }
	public void settOdr_ODR_ACPT_ORG_CD(String val) { m_tOdr_ODR_ACPT_ORG_CD = val; }
	public void settOdr_ODR_ACPT_PSN_CD(String val) { m_tOdr_ODR_ACPT_PSN_CD = val; }
	public void settOdr_CURRNCY_CD(String val) { m_tOdr_CURRNCY_CD = val; }
	public void settOdr_EXCH_TYP(String val) { m_tOdr_EXCH_TYP = val; }
	public void settOdr_DLV_LOC_CD(String val) { m_tOdr_DLV_LOC_CD = val; }
	public void settOdr_DLV_LOC_CD_EIAJ(String val) { m_tOdr_DLV_LOC_CD_EIAJ = val; }
	public void settOdr_DLV_LOC_NAME(String val) { m_tOdr_DLV_LOC_NAME = val; }
	public void settOdr_DLV_LOC_NAME_KANJI(String val) { m_tOdr_DLV_LOC_NAME_KANJI = val; }
	public void settOdr_PRD_ODR_PLACE_CD(String val) { m_tOdr_PRD_ODR_PLACE_CD = val; }
	public void settOdr_ODR_UNIT_PRICE(String val) { m_tOdr_ODR_UNIT_PRICE = val; }
	public void settOdr_SPCL_PRICE_TYP(String val) { m_tOdr_SPCL_PRICE_TYP = val; }
	public void settOdr_PART_DLV_COUNT(String val) { m_tOdr_PART_DLV_COUNT = val; }
	public void settOdr_DEPO_TYP(String val) { m_tOdr_DEPO_TYP = val; }
	public void settOdr_DESINATED_DLV_DATE(String val) { m_tOdr_DESINATED_DLV_DATE = val; }
	public void settOdr_STD_DESINATED_RCV_DATE(String val) { m_tOdr_STD_DESINATED_RCV_DATE = val; }
	public void settOdr_ODR_QTY(String val) { m_tOdr_ODR_QTY = val; }
	public void settOdr_REMAIN_UNCONFIRM_ODR_QTY(String val) { m_tOdr_REMAIN_UNCONFIRM_ODR_QTY = val; }
	public void settOdr_CANCELED_UNCONFIRM_ODR_QTY(String val) { m_tOdr_CANCELED_UNCONFIRM_ODR_QTY = val; }
	public void settOdr_UNIT_CD(String val) { m_tOdr_UNIT_CD = val; }
	public void settOdr_UNCONFIRM_ODR_BALANCE(String val) { m_tOdr_UNCONFIRM_ODR_BALANCE = val; }
	public void settOdr_ODR_AMOUNT(String val) { m_tOdr_ODR_AMOUNT = val; }
	public void settOdr_ODR_AMOUNT_EXCH_RATES(String val) { m_tOdr_ODR_AMOUNT_EXCH_RATES = val; }
	public void settOdr_TOTAL_SHIP_QTY(String val) { m_tOdr_TOTAL_SHIP_QTY = val; }
	public void settOdr_SHIP_AMOUNT(String val) { m_tOdr_SHIP_AMOUNT = val; }
	public void settOdr_SHIP_AMOUNT_EXCH_RATES(String val) { m_tOdr_SHIP_AMOUNT_EXCH_RATES = val; }
	public void settOdr_RETURN_PRICE(String val) { m_tOdr_RETURN_PRICE = val; }
	public void settOdr_RETURN_QTY(String val) { m_tOdr_RETURN_QTY = val; }
	public void settOdr_RETURN_AMOUNT(String val) { m_tOdr_RETURN_AMOUNT = val; }
	public void settOdr_RETURN_AMOUNT_EXCH_RATES(String val) { m_tOdr_RETURN_AMOUNT_EXCH_RATES = val; }
	public void settOdr_ODR_CMPLT_FLG(String val) { m_tOdr_ODR_CMPLT_FLG = val; }
	public void settOdr_ODR_CMPLT_DATE(String val) { m_tOdr_ODR_CMPLT_DATE = val; }
	public void settOdr_CUS_DLV_CD(String val) { m_tOdr_CUS_DLV_CD = val; }
	public void settOdr_CUS_DLV_KEY_CD(String val) { m_tOdr_CUS_DLV_KEY_CD = val; }
	public void settOdr_PART_NAME(String val) { m_tOdr_PART_NAME = val; }
	public void settOdr_PKG_UNIT(String val) { m_tOdr_PKG_UNIT = val; }
	public void settOdr_SLIP_PRICE_PRINT_TYP(String val) { m_tOdr_SLIP_PRICE_PRINT_TYP = val; }
	public void settOdr_INSPC_TYP(String val) { m_tOdr_INSPC_TYP = val; }
	public void settOdr_CLIENT_REMARK(String val) { m_tOdr_CLIENT_REMARK = val; }
	public void settOdr_CLIENT_REMARK_KANJI(String val) { m_tOdr_CLIENT_REMARK_KANJI = val; }
	public void settOdr_CLIENT_BARCODE_INF(String val) { m_tOdr_CLIENT_BARCODE_INF = val; }
	public void settOdr_TRANSPORT_CD(String val) { m_tOdr_TRANSPORT_CD = val; }
	public void settOdr_TRANSPORT_TYP(String val) { m_tOdr_TRANSPORT_TYP = val; }
	public void settOdr_TAX_APPLY_TYP(String val) { m_tOdr_TAX_APPLY_TYP = val; }
	public void settOdr_TAX_CD(String val) { m_tOdr_TAX_CD = val; }
	public void settOdr_TAX_CALC_TYP(String val) { m_tOdr_TAX_CALC_TYP = val; }
	public void settOdr_REMARKS(String val) { m_tOdr_REMARKS = val; }
	public void settOdr_ODR_ACPT_DATE(String val) { m_tOdr_ODR_ACPT_DATE = val; }
	public void settOdr_SHIP_PLAN_REMAIN_QTY(String val) { m_tOdr_SHIP_PLAN_REMAIN_QTY = val; }
	public void settOdr_SHIP_PLAN_CMPLT_FLG(String val) { m_tOdr_SHIP_PLAN_CMPLT_FLG = val; }
	public void settOdr_UNCONFIRMED_ODR_EFF_OVR_FLG(String val) { m_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG = val; }
	public void settOdr_PARTIAL_SHIP_INST_FLG(String val) { m_tOdr_PARTIAL_SHIP_INST_FLG = val; }
	public void settOdr_IF_CTL_NO(String val) { m_tOdr_IF_CTL_NO = val; }
	public void settOdr_ENTRY_TYP(String val) { m_tOdr_ENTRY_TYP = val; }
	public void settOdr_BUYER_NAME(String val) { m_tOdr_BUYER_NAME = val; }
	public void settOdr_PUCH_ODR_QTY_TOTAL(String val) { m_tOdr_PUCH_ODR_QTY_TOTAL = val; }
	public void settOdr_UNIT_CD_ORG(String val) { m_tOdr_UNIT_CD_ORG = val; }
	public void settOdr_SHIP_CNT(String val) { m_tOdr_SHIP_CNT = val; }
	public void settOdr_IN_ODRNO(String val) { m_tOdr_IN_ODRNO = val; }
	public void setuptOdr_PART_DLV_COUNT(String val) { m_uptOdr_PART_DLV_COUNT = val; }
	public void setuptOdr_IN_ODRNO(String val) { m_uptOdr_IN_ODRNO = val; }
	public void settOdrCtl_ODR_CTL_NO(String val) { m_tOdrCtl_ODR_CTL_NO = val; }
	public void settOdrCtl_CUST_CD(String val) { m_tOdrCtl_CUST_CD = val; }
	public void settOdrCtl_CUST_ITEM_CD(String val) { m_tOdrCtl_CUST_ITEM_CD = val; }
	public void settOdrCtl_CUST_ITEM_NAME(String val) { m_tOdrCtl_CUST_ITEM_NAME = val; }
	public void settOdrCtl_ITEM_CD(String val) { m_tOdrCtl_ITEM_CD = val; }
	public void settOdrCtl_ITEM_NAME(String val) { m_tOdrCtl_ITEM_NAME = val; }
	public void settOdrCtl_IN_ODRCTLNO(String val) { m_tOdrCtl_IN_ODRCTLNO = val; }
	public void setmItem_ITEM_CD(String val) { m_mItem_ITEM_CD = val; }
	public void setmItem_ITEM_NAME(String val) { m_mItem_ITEM_NAME = val; }
	public void setmItem_PRODUCT_TYP(String val) { m_mItem_PRODUCT_TYP = val; }
	public void setmItem_MRP_ODR_TYP(String val) { m_mItem_MRP_ODR_TYP = val; }
	public void setmItem_DRAW_CD(String val) { m_mItem_DRAW_CD = val; }
	public void setmItem_SPEC(String val) { m_mItem_SPEC = val; }
	public void setmItem_HIGH_LEVEL_NO(String val) { m_mItem_HIGH_LEVEL_NO = val; }
	public void setmItem_OUTSIDE_TYP(String val) { m_mItem_OUTSIDE_TYP = val; }
	public void setmItem_STOCK_UNIT_FLG(String val) { m_mItem_STOCK_UNIT_FLG = val; }
	public void setmItem_STOCK_UNIT(String val) { m_mItem_STOCK_UNIT = val; }
	public void setmItem_PKG_UNIT(String val) { m_mItem_PKG_UNIT = val; }
	public void setmItem_PKG_UNIT_QTY(String val) { m_mItem_PKG_UNIT_QTY = val; }
	public void setmItem_UNIT_QTY_TYP(String val) { m_mItem_UNIT_QTY_TYP = val; }
	public void setmItem_ODR_LT(String val) { m_mItem_ODR_LT = val; }
	public void setmItem_FIXED_LT(String val) { m_mItem_FIXED_LT = val; }
	public void setmItem_PROP_LT(String val) { m_mItem_PROP_LT = val; }
	public void setmItem_SAFETY_LT(String val) { m_mItem_SAFETY_LT = val; }
	public void setmItem_ISSUE_LT(String val) { m_mItem_ISSUE_LT = val; }
	public void setmItem_PROP_LOT_SIZE(String val) { m_mItem_PROP_LOT_SIZE = val; }
	public void setmItem_ITEM_SPOIL(String val) { m_mItem_ITEM_SPOIL = val; }
	public void setmItem_SAFETY_STOCK(String val) { m_mItem_SAFETY_STOCK = val; }
	public void setmItem_LOT_SIZING_TYP(String val) { m_mItem_LOT_SIZING_TYP = val; }
	public void setmItem_MAX_PERIOD(String val) { m_mItem_MAX_PERIOD = val; }
	public void setmItem_MAX_ODR_QTY(String val) { m_mItem_MAX_ODR_QTY = val; }
	public void setmItem_ODR_POINT(String val) { m_mItem_ODR_POINT = val; }
	public void setmItem_FIXED_ODR_QTY(String val) { m_mItem_FIXED_ODR_QTY = val; }
	public void setmItem_MIN_ODR_QTY(String val) { m_mItem_MIN_ODR_QTY = val; }
	public void setmItem_MUL_ODR_QTY(String val) { m_mItem_MUL_ODR_QTY = val; }
	public void setmItem_ISSUE_TYP(String val) { m_mItem_ISSUE_TYP = val; }
	public void setmItem_MPS_FLG(String val) { m_mItem_MPS_FLG = val; }
	public void setmItem_ACPT_INSPC_TYP(String val) { m_mItem_ACPT_INSPC_TYP = val; }
	public void setmItem_CLASIFICATION_CD(String val) { m_mItem_CLASIFICATION_CD = val; }
	public void setmItem_UNIT_WEIGHT(String val) { m_mItem_UNIT_WEIGHT = val; }
	public void setmItem_ABC_TYP(String val) { m_mItem_ABC_TYP = val; }
	public void setmItem_OPR_RSLT_TYP(String val) { m_mItem_OPR_RSLT_TYP = val; }
	public void setmItem_SPL_ITEM_TYP(String val) { m_mItem_SPL_ITEM_TYP = val; }
	public void setmItem_TAX_CD(String val) { m_mItem_TAX_CD = val; }
	public void setmItem_IN_ITEMCD(String val) { m_mItem_IN_ITEMCD = val; }
	public void setmCustBase_COMPANY_CD(String val) { m_mCustBase_COMPANY_CD = val; }
	public void setmCustBase_CUST_CD(String val) { m_mCustBase_CUST_CD = val; }
	public void setmCustBase_DLV_LOC_CD(String val) { m_mCustBase_DLV_LOC_CD = val; }
	public void setmCustBase_DLV_LOC_NAME(String val) { m_mCustBase_DLV_LOC_NAME = val; }
	public void setmCustBase_DLV_LOC_KNAME(String val) { m_mCustBase_DLV_LOC_KNAME = val; }
	public void setmCustBase_DLV_LOC_ENAME(String val) { m_mCustBase_DLV_LOC_ENAME = val; }
	public void setmCustBase_ZIP_CD(String val) { m_mCustBase_ZIP_CD = val; }
	public void setmCustBase_ADDRESS_1(String val) { m_mCustBase_ADDRESS_1 = val; }
	public void setmCustBase_ADDRESS_2(String val) { m_mCustBase_ADDRESS_2 = val; }
	public void setmCustBase_ADDRESS_K_1(String val) { m_mCustBase_ADDRESS_K_1 = val; }
	public void setmCustBase_ADDRESS_K_2(String val) { m_mCustBase_ADDRESS_K_2 = val; }
	public void setmCustBase_TEL(String val) { m_mCustBase_TEL = val; }
	public void setmCustBase_FAX(String val) { m_mCustBase_FAX = val; }
	public void setmCustBase_SHIP_WH_CD(String val) { m_mCustBase_SHIP_WH_CD = val; }
	public void setmCustBase_TRANSPORT_CD(String val) { m_mCustBase_TRANSPORT_CD = val; }
	public void setmCustBase_TRANSPORT_NAME(String val) { m_mCustBase_TRANSPORT_NAME = val; }
	public void setmCustBase_TRANSPORT_LT(String val) { m_mCustBase_TRANSPORT_LT = val; }
	public void setmCustBase_CAL_NO(String val) { m_mCustBase_CAL_NO = val; }
	public void setmCustBase_TRANSPORT_TYP(String val) { m_mCustBase_TRANSPORT_TYP = val; }
	public void setmCustBase_DLV_START_TIME(String val) { m_mCustBase_DLV_START_TIME = val; }
	public void setmCustBase_DLV_END_TIME(String val) { m_mCustBase_DLV_END_TIME = val; }
	public void setmCustBase_AREA_CLASS_TYP1(String val) { m_mCustBase_AREA_CLASS_TYP1 = val; }
	public void setmCustBase_AREA_CLASS_1(String val) { m_mCustBase_AREA_CLASS_1 = val; }
	public void setmCustBase_AREA_CLASS_TYP2(String val) { m_mCustBase_AREA_CLASS_TYP2 = val; }
	public void setmCustBase_AREA_CLASS_2(String val) { m_mCustBase_AREA_CLASS_2 = val; }
	public void setmCustBase_AREA_CLASS_TYP3(String val) { m_mCustBase_AREA_CLASS_TYP3 = val; }
	public void setmCustBase_AREA_CLASS_3(String val) { m_mCustBase_AREA_CLASS_3 = val; }
	public void setmCustBase_REMARKS_1(String val) { m_mCustBase_REMARKS_1 = val; }
	public void setmCustBase_REMARKS_2(String val) { m_mCustBase_REMARKS_2 = val; }
	public void setmCustBase_REMARKS_3(String val) { m_mCustBase_REMARKS_3 = val; }
	public void setmCustBase_DEPO_WH_CD(String val) { m_mCustBase_DEPO_WH_CD = val; }
	public void setmCustBase_IN_COMPANYCD(String val) { m_mCustBase_IN_COMPANYCD = val; }
	public void setmCustBase_IN_CUSTCD(String val) { m_mCustBase_IN_CUSTCD = val; }
	public void setmCustBase_IN_DLVLOCCD(String val) { m_mCustBase_IN_DLVLOCCD = val; }
	public void setmCust_COMPANY_CD(String val) { m_mCust_COMPANY_CD = val; }
	public void setmCust_CUST_CD(String val) { m_mCust_CUST_CD = val; }
	public void setmCust_CUST_NAME(String val) { m_mCust_CUST_NAME = val; }
	public void setmCust_CUST_ANAME(String val) { m_mCust_CUST_ANAME = val; }
	public void setmCust_CUST_KNAME(String val) { m_mCust_CUST_KNAME = val; }
	public void setmCust_OWN_ORG_CD(String val) { m_mCust_OWN_ORG_CD = val; }
	public void setmCust_OWN_PERSON_CD(String val) { m_mCust_OWN_PERSON_CD = val; }
	public void setmCust_CUR_CD(String val) { m_mCust_CUR_CD = val; }
	public void setmCust_EXCH_TYP(String val) { m_mCust_EXCH_TYP = val; }
	public void setmCust_TAX_APPLY_TYP(String val) { m_mCust_TAX_APPLY_TYP = val; }
	public void setmCust_TAX_CD(String val) { m_mCust_TAX_CD = val; }
	public void setmCust_TAX_CALC_TYP(String val) { m_mCust_TAX_CALC_TYP = val; }
	public void setmCust_PRICE_ROUND_TYP(String val) { m_mCust_PRICE_ROUND_TYP = val; }
	public void setmCust_DETAIL_ROUND_TYP(String val) { m_mCust_DETAIL_ROUND_TYP = val; }
	public void setmCust_UNCONFIRM_ODR_EFF_PRIOD(String val) { m_mCust_UNCONFIRM_ODR_EFF_PRIOD = val; }
	public void setmCust_UNCONFIRM_ODR_EFF_TERM_FLG(String val) { m_mCust_UNCONFIRM_ODR_EFF_TERM_FLG = val; }
	public void setmCust_EDI_CUST_VEND_CD(String val) { m_mCust_EDI_CUST_VEND_CD = val; }
	public void setmCust_PARTIAL_SHIP_INST_FLG(String val) { m_mCust_PARTIAL_SHIP_INST_FLG = val; }
	public void setmCust_DEPO_TYP(String val) { m_mCust_DEPO_TYP = val; }
	public void setmCust_INSPC_ACPT_TYP(String val) { m_mCust_INSPC_ACPT_TYP = val; }
	public void setmCust_IN_COMPANYCD(String val) { m_mCust_IN_COMPANYCD = val; }
	public void setmCust_IN_CUSTCD(String val) { m_mCust_IN_CUSTCD = val; }
	public void setstrYotaku_WH_CD(String val) { m_strYotaku_WH_CD = val; }
	public void setstrYotaku_IN_WH_TYP(String val) { m_strYotaku_IN_WH_TYP = val; }
	public void setin_tShipSlip_SLIP_CD(String val) { m_in_tShipSlip_SLIP_CD = val; }
	public void setin_tShipSlip_ITEM_CD(String val) { m_in_tShipSlip_ITEM_CD = val; }
	public void setin_tShipSlip_CUST_ITEM_CD(String val) { m_in_tShipSlip_CUST_ITEM_CD = val; }
	public void setin_tShipSlip_PART_NAME(String val) { m_in_tShipSlip_PART_NAME = val; }
	public void setin_tShipSlip_CUST_ODR_NO(String val) { m_in_tShipSlip_CUST_ODR_NO = val; }
	public void setin_tShipSlip_CUST_CD(String val) { m_in_tShipSlip_CUST_CD = val; }
	public void setin_tShipSlip_CUST_NAME(String val) { m_in_tShipSlip_CUST_NAME = val; }
	public void setin_tShipSlip_DLV_LOC_CD(String val) { m_in_tShipSlip_DLV_LOC_CD = val; }
	public void setin_tShipSlip_DLV_LOC_NAME_KANJI(String val) { m_in_tShipSlip_DLV_LOC_NAME_KANJI = val; }
	public void setin_tShipSlip_CUS_DLV_KEY_CD(String val) { m_in_tShipSlip_CUS_DLV_KEY_CD = val; }
	public void setin_tShipSlip_DESINATED_SHIP_DATE(String val) { m_in_tShipSlip_DESINATED_SHIP_DATE = val; }
	public void setin_tShipSlip_DESINATED_DLV_DATE(String val) { m_in_tShipSlip_DESINATED_DLV_DATE = val; }
	public void setin_tShipSlip_SCDL_DLV_DATE(String val) { m_in_tShipSlip_SCDL_DLV_DATE = val; }
	public void setin_tShipSlip_SHIP_ODR_QTY(String val) { m_in_tShipSlip_SHIP_ODR_QTY = val; }
	public void setin_tShipSlip_UNIT_CD(String val) { m_in_tShipSlip_UNIT_CD = val; }
	public void setin_tShipSlip_UNIT_PRICE(String val) { m_in_tShipSlip_UNIT_PRICE = val; }
	public void setin_tShipSlip_SHIP_ODR_AMOUNT(String val) { m_in_tShipSlip_SHIP_ODR_AMOUNT = val; }
	public void setin_tShipSlip_TAX_AMOUNT(String val) { m_in_tShipSlip_TAX_AMOUNT = val; }
	public void setin_tShipSlip_INSPC_TYP(String val) { m_in_tShipSlip_INSPC_TYP = val; }
	public void setin_tShipSlip_CLIENT_REMARK_KANJI(String val) { m_in_tShipSlip_CLIENT_REMARK_KANJI = val; }
	public void setin_tShipSlip_CLIENT_BARCODE_INF(String val) { m_in_tShipSlip_CLIENT_BARCODE_INF = val; }
	public void setin_tShipSlip_PRINT_FLG(String val) { m_in_tShipSlip_PRINT_FLG = val; }
	public void setin_tShipSlip_DEL_FLG(String val) { m_in_tShipSlip_DEL_FLG = val; }
	public void setin_tShipSlip_BUYER_NAME(String val) { m_in_tShipSlip_BUYER_NAME = val; }
	public void setin_tShipSlip_PUCH_ODR_QTY_TOTAL(String val) { m_in_tShipSlip_PUCH_ODR_QTY_TOTAL = val; }
	public void setin_tShipSlip_DLV_ODR_QTY(String val) { m_in_tShipSlip_DLV_ODR_QTY = val; }
	public void setin_tShipSlip_SHIP_ODR_AMOUNT_TAX(String val) { m_in_tShipSlip_SHIP_ODR_AMOUNT_TAX = val; }
	public void setin_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT(String val) { m_in_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT = val; }
	public void setin_tShipSlip_INTERNAL_TAX_SALES_AMOUNT(String val) { m_in_tShipSlip_INTERNAL_TAX_SALES_AMOUNT = val; }
	public void setin_tShipSlip_TAXFREE_SALES_AMOUNT(String val) { m_in_tShipSlip_TAXFREE_SALES_AMOUNT = val; }
	public void setin_tShipSlip_TAX_CREDIT_SALES_AMOUNT(String val) { m_in_tShipSlip_TAX_CREDIT_SALES_AMOUNT = val; }
	public void setin_tShipSlip_EXTERNAL_TAX_AMOUNT(String val) { m_in_tShipSlip_EXTERNAL_TAX_AMOUNT = val; }
	public void setin_tShipSlip_INTERNAL_TAX_AMOUNT(String val) { m_in_tShipSlip_INTERNAL_TAX_AMOUNT = val; }
	public void setin_tShipSlip_TAX_AMOUNT_1(String val) { m_in_tShipSlip_TAX_AMOUNT_1 = val; }
	public void setin_tShipSlip_TAX_AMOUNT_2(String val) { m_in_tShipSlip_TAX_AMOUNT_2 = val; }
	public void setin_tShipSlip_TAX_AMOUNT_3(String val) { m_in_tShipSlip_TAX_AMOUNT_3 = val; }
	public void setin_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT(String val) { m_in_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT = val; }
	public void setdel_tShipSlip_IN_SLIPCD(String val) { m_del_tShipSlip_IN_SLIPCD = val; }
	public void setuptOdr_SHIP_CNT(String val) { m_uptOdr_SHIP_CNT = val; }
	public void settUnShipList_UN_SHIP_SEQ_NO(String val) { m_tUnShipList_UN_SHIP_SEQ_NO = val; }
	public void settUnShipList_CUST_CD(String val) { m_tUnShipList_CUST_CD = val; }
	public void settUnShipList_ACPT_ODR_CD(String val) { m_tUnShipList_ACPT_ODR_CD = val; }
	public void settUnShipList_PART_DLV_SEQ_NO(String val) { m_tUnShipList_PART_DLV_SEQ_NO = val; }
	public void settUnShipList_ITEM_CD(String val) { m_tUnShipList_ITEM_CD = val; }
	public void settUnShipList_UN_SHIP_QTY(String val) { m_tUnShipList_UN_SHIP_QTY = val; }
	public void settUnShipList_UN_SHIP_RSN(String val) { m_tUnShipList_UN_SHIP_RSN = val; }
	public void settUnShipList_WH_CD(String val) { m_tUnShipList_WH_CD = val; }
	public void settUnShipList_PRINT_FLG(String val) { m_tUnShipList_PRINT_FLG = val; }
	public void settUnShipList_DEL_FLG(String val) { m_tUnShipList_DEL_FLG = val; }
	public void settori_tAnsDlvDate_REST_SHIP_ODR_QTY(String val) { m_tori_tAnsDlvDate_REST_SHIP_ODR_QTY = val; }
	public void settori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG(String val) { m_tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG = val; }
	public void settori_tAnsDlvDate_IN_ODRNO(String val) { m_tori_tAnsDlvDate_IN_ODRNO = val; }
	public void settori_tAnsDlvDate_IN_PARTDLVSEQNO(String val) { m_tori_tAnsDlvDate_IN_PARTDLVSEQNO = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }
	public void setstrTAX_CD(String val) { m_strTAX_CD = val; }
	public void setSHIP_MODIFY_COUNT(String val) { m_SHIP_MODIFY_COUNT = val; }
	public void setSEL_MODIFY_COUNT(String val) { m_SEL_MODIFY_COUNT = val; }


	public void setList_r1_SHIP_ODR(List list) { l_r1_SHIP_ODR = list; }
	public void setList_r2_SHIP_ODR(List list) { l_r2_SHIP_ODR = list; }
	public void setList_tAnsDlvDate_MODIFY_COUNT(List list) { l_tAnsDlvDate_MODIFY_COUNT = list; }
	public void setList_tShipOdr_MODIFY_COUNT(List list) { l_tShipOdr_MODIFY_COUNT = list; }
	public void setList_Shipt_MODIFY_COUNT(List list) { l_Shipt_MODIFY_COUNT = list; }
	public void setList_h_RESULT(List list) { l_h_RESULT = list; }
	public void setList_strBUSINESS_OPR_DATE(List list) { l_strBUSINESS_OPR_DATE = list; }
	public void setList_strPLANT_CD(List list) { l_strPLANT_CD = list; }
	public void setList_strTaxTAX_KBN(List list) { l_strTaxTAX_KBN = list; }
	public void setList_strTaxOLD_TAX_1(List list) { l_strTaxOLD_TAX_1 = list; }
	public void setList_strTaxOLD_TAX_2(List list) { l_strTaxOLD_TAX_2 = list; }
	public void setList_strTaxOLD_TAX_3(List list) { l_strTaxOLD_TAX_3 = list; }
	public void setList_strTaxNEW_TAX_1(List list) { l_strTaxNEW_TAX_1 = list; }
	public void setList_strTaxNEW_TAX_2(List list) { l_strTaxNEW_TAX_2 = list; }
	public void setList_strTaxNEW_TAX_3(List list) { l_strTaxNEW_TAX_3 = list; }
	public void setList_strTaxSTART_DATE(List list) { l_strTaxSTART_DATE = list; }
	public void setList_strTaxROUND_TYP(List list) { l_strTaxROUND_TYP = list; }
	public void setList_strTaxIN_COMPANYCD(List list) { l_strTaxIN_COMPANYCD = list; }
	public void setList_strTaxIN_CUSTCD(List list) { l_strTaxIN_CUSTCD = list; }
	public void setList_l_CUST_ITEM_CD(List list) { l_l_CUST_ITEM_CD = list; }
	public void setList_tDECIMAL_FIG(List list) { l_tDECIMAL_FIG = list; }
	public void setList_tCUR_CD(List list) { l_tCUR_CD = list; }
	public void setList_strCOMPANY_CD(List list) { l_strCOMPANY_CD = list; }
	public void setList_strUSER_NAME(List list) { l_strUSER_NAME = list; }
	public void setList_strSECTION_CD(List list) { l_strSECTION_CD = list; }
	public void setList_strPLANT_NAME(List list) { l_strPLANT_NAME = list; }
	public void setList_strPLANT_ANAME(List list) { l_strPLANT_ANAME = list; }
	public void setList_strCAL_NO(List list) { l_strCAL_NO = list; }
	public void setList_strUSER_CD(List list) { l_strUSER_CD = list; }
	public void setList_strSYUKA_LT(List list) { l_strSYUKA_LT = list; }
	public void setList_tHOLIDAY_FLG(List list) { l_tHOLIDAY_FLG = list; }
	public void setList_tWH_CD(List list) { l_tWH_CD = list; }
	public void setList_tCAL_DATE(List list) { l_tCAL_DATE = list; }
	public void setList_l_ODR_NO(List list) { l_l_ODR_NO = list; }
	public void setList_l_PART_DLV_SEQ_NO(List list) { l_l_PART_DLV_SEQ_NO = list; }
	public void setList_l_DESINATED_DLV_DATE(List list) { l_l_DESINATED_DLV_DATE = list; }
	public void setList_l_DESINATED_SHIP_DATE(List list) { l_l_DESINATED_SHIP_DATE = list; }
	public void setList_l_SHIP_QTY(List list) { l_l_SHIP_QTY = list; }
	public void setList_l_REST_SHIP_QTY(List list) { l_l_REST_SHIP_QTY = list; }
	public void setList_l_WH_CD(List list) { l_l_WH_CD = list; }
	public void setList_l_WH_NAME(List list) { l_l_WH_NAME = list; }
	public void setList_l_CUST_ODR_NO(List list) { l_l_CUST_ODR_NO = list; }
	public void setList_l_CUST_CD(List list) { l_l_CUST_CD = list; }
	public void setList_l_CUST_NAME(List list) { l_l_CUST_NAME = list; }
	public void setList_l_CUST_ITEM_NAME(List list) { l_l_CUST_ITEM_NAME = list; }
	public void setList_l_ITEM_CD(List list) { l_l_ITEM_CD = list; }
	public void setList_l_ITEM_NAME(List list) { l_l_ITEM_NAME = list; }
	public void setList_l_STOCK_UNIT(List list) { l_l_STOCK_UNIT = list; }
	public void setList_l_UNIT_QTY_TYP(List list) { l_l_UNIT_QTY_TYP = list; }
	public void setList_l_MRP_ODR_TYP(List list) { l_l_MRP_ODR_TYP = list; }
	public void setList_l_ODR_CTL_NO(List list) { l_l_ODR_CTL_NO = list; }
	public void setList_l_TRANSPORT_TYP(List list) { l_l_TRANSPORT_TYP = list; }
	public void setList_l_ODR_UNIT_PRICE(List list) { l_l_ODR_UNIT_PRICE = list; }
	public void setList_l_SPCL_PRICE_TYP(List list) { l_l_SPCL_PRICE_TYP = list; }
	public void setList_l_PARTIAL_SHIP_INST_FLG(List list) { l_l_PARTIAL_SHIP_INST_FLG = list; }
	public void setList_l_MODIFY_COUNT(List list) { l_l_MODIFY_COUNT = list; }
	public void setList_l_JOB_ODR_CD(List list) { l_l_JOB_ODR_CD = list; }
	public void setList_ODR_NO(List list) { l_ODR_NO = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_DESINATED_DLV_DATE(List list) { l_DESINATED_DLV_DATE = list; }
	public void setList_DESINATED_SHIP_DATE(List list) { l_DESINATED_SHIP_DATE = list; }
	public void setList_CUST_CD(List list) { l_CUST_CD = list; }
	public void setList_CUST_CHRG_PSN_CD(List list) { l_CUST_CHRG_PSN_CD = list; }
	public void setList_CUST_ODR_NO(List list) { l_CUST_ODR_NO = list; }
	public void setList_CUST_ITEM_CD(List list) { l_CUST_ITEM_CD = list; }
	public void setList_up_tAnsDlvDate_DESINATED_SHIP_DATE(List list) { l_up_tAnsDlvDate_DESINATED_SHIP_DATE = list; }
	public void setList_up_tAnsDlvDate_REST_SHIP_ODR_QTY(List list) { l_up_tAnsDlvDate_REST_SHIP_ODR_QTY = list; }
	public void setList_up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG(List list) { l_up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG = list; }
	public void setList_up_tAnsDlvDate_IN_ODRNO(List list) { l_up_tAnsDlvDate_IN_ODRNO = list; }
	public void setList_up_tAnsDlvDate_IN_PARTDLVSEQNO(List list) { l_up_tAnsDlvDate_IN_PARTDLVSEQNO = list; }
	public void setList_l_SLIP_CD(List list) { l_l_SLIP_CD = list; }
	public void setList_l_c_DIRECT_DLV_FLG(List list) { l_l_c_DIRECT_DLV_FLG = list; }
	public void setList_l_DLV_MODIFY_COUNT(List list) { l_l_DLV_MODIFY_COUNT = list; }
	public void setList_SLIP_CD(List list) { l_SLIP_CD = list; }
	public void setList_in_tShipOdr_ODR_NO(List list) { l_in_tShipOdr_ODR_NO = list; }
	public void setList_in_tShipOdr_PART_DLV_SEQ_NO(List list) { l_in_tShipOdr_PART_DLV_SEQ_NO = list; }
	public void setList_in_tShipOdr_SLIP_CD(List list) { l_in_tShipOdr_SLIP_CD = list; }
	public void setList_in_tShipOdr_ITEM_CD(List list) { l_in_tShipOdr_ITEM_CD = list; }
	public void setList_in_tShipOdr_CUST_ITEM_CD(List list) { l_in_tShipOdr_CUST_ITEM_CD = list; }
	public void setList_in_tShipOdr_CUST_ODR_NO(List list) { l_in_tShipOdr_CUST_ODR_NO = list; }
	public void setList_in_tShipOdr_CUST_CD(List list) { l_in_tShipOdr_CUST_CD = list; }
	public void setList_in_tShipOdr_CUST_NAME(List list) { l_in_tShipOdr_CUST_NAME = list; }
	public void setList_in_tShipOdr_SHIP_ODR_ISS_PSN_CD(List list) { l_in_tShipOdr_SHIP_ODR_ISS_PSN_CD = list; }
	public void setList_in_tShipOdr_DLV_LOC_CD(List list) { l_in_tShipOdr_DLV_LOC_CD = list; }
	public void setList_in_tShipOdr_DESINATED_SHIP_DATE(List list) { l_in_tShipOdr_DESINATED_SHIP_DATE = list; }
	public void setList_in_tShipOdr_SHIP_QTY(List list) { l_in_tShipOdr_SHIP_QTY = list; }
	public void setList_in_tShipOdr_UNIT_PRICE(List list) { l_in_tShipOdr_UNIT_PRICE = list; }
	public void setList_in_tShipOdr_SHIP_ODR_AMOUNT(List list) { l_in_tShipOdr_SHIP_ODR_AMOUNT = list; }
	public void setList_in_tShipOdr_CURRNCY_CD(List list) { l_in_tShipOdr_CURRNCY_CD = list; }
	public void setList_in_tShipOdr_PKG_UNIT_QTY(List list) { l_in_tShipOdr_PKG_UNIT_QTY = list; }
	public void setList_in_tShipOdr_REMARKS(List list) { l_in_tShipOdr_REMARKS = list; }
	public void setList_in_tShipOdr_ALLCT_WH_CD(List list) { l_in_tShipOdr_ALLCT_WH_CD = list; }
	public void setList_in_tShipOdr_DEPO_TYP(List list) { l_in_tShipOdr_DEPO_TYP = list; }
	public void setList_in_tShipOdr_ENTRY_TYP(List list) { l_in_tShipOdr_ENTRY_TYP = list; }
	public void setList_in_tShipOdr_PRINT_FLG(List list) { l_in_tShipOdr_PRINT_FLG = list; }
	public void setList_in_tShipOdr_SHP_CMPLT_FLG(List list) { l_in_tShipOdr_SHP_CMPLT_FLG = list; }
	public void setList_in_tShipOdr_DEL_FLG(List list) { l_in_tShipOdr_DEL_FLG = list; }
	public void setList_in_tShipOdr_TRANSPORT_CD(List list) { l_in_tShipOdr_TRANSPORT_CD = list; }
	public void setList_in_tShipOdr_DIRECT_DLV_FLG(List list) { l_in_tShipOdr_DIRECT_DLV_FLG = list; }
	public void setList_in_tShipOdr_CUST_CHRG_PSN_CD(List list) { l_in_tShipOdr_CUST_CHRG_PSN_CD = list; }
	public void setList_in_tShipOdr_UNIT_CD(List list) { l_in_tShipOdr_UNIT_CD = list; }
	public void setList_in_tShipOdr_SCDL_DLV_DATE(List list) { l_in_tShipOdr_SCDL_DLV_DATE = list; }
	public void setList_in_tShipOdr_TRANSFER_WH_CD(List list) { l_in_tShipOdr_TRANSFER_WH_CD = list; }
	public void setList_in_tShipOdr_DLV_KEY_NO(List list) { l_in_tShipOdr_DLV_KEY_NO = list; }
	public void setList_in_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES(List list) { l_in_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES = list; }
	public void setList_in_tShipOdr_SHIP_ODR_NO(List list) { l_in_tShipOdr_SHIP_ODR_NO = list; }
	public void setList_in_tShipOdr_JOB_ODR_CD(List list) { l_in_tShipOdr_JOB_ODR_CD = list; }
	public void setList_del_tShipOdr_IN_SLIPCD(List list) { l_del_tShipOdr_IN_SLIPCD = list; }
	public void setList_chkisinWhCd_WH_CD(List list) { l_chkisinWhCd_WH_CD = list; }
	public void setList_chkisinWhCd_WH_TYP(List list) { l_chkisinWhCd_WH_TYP = list; }
	public void setList_chkis_IN_WHCD(List list) { l_chkis_IN_WHCD = list; }
	public void setList_chkisWhCd_WH_CD(List list) { l_chkisWhCd_WH_CD = list; }
	public void setList_chkisWhCd_WH_TYP(List list) { l_chkisWhCd_WH_TYP = list; }
	public void setList_chkisWhCd_ITEM_CD(List list) { l_chkisWhCd_ITEM_CD = list; }
	public void setList_chkisWhCd_PBL_SHIP_QTY(List list) { l_chkisWhCd_PBL_SHIP_QTY = list; }
	public void setList_chkisWhCd_IN_ITEMCD(List list) { l_chkisWhCd_IN_ITEMCD = list; }
	public void setList_chkisWhCd_IN_WHCD(List list) { l_chkisWhCd_IN_WHCD = list; }
	public void setList_tOdr_ODR_NO(List list) { l_tOdr_ODR_NO = list; }
	public void setList_tOdr_ODR_TYP(List list) { l_tOdr_ODR_TYP = list; }
	public void setList_tOdr_ODR_CTL_NO(List list) { l_tOdr_ODR_CTL_NO = list; }
	public void setList_tOdr_CUST_ODR_NO(List list) { l_tOdr_CUST_ODR_NO = list; }
	public void setList_tOdr_CUST_CHRG_ORG_CD(List list) { l_tOdr_CUST_CHRG_ORG_CD = list; }
	public void setList_tOdr_CUST_CHRG_PSN_CD(List list) { l_tOdr_CUST_CHRG_PSN_CD = list; }
	public void setList_tOdr_ODR_ACPT_ORG_CD(List list) { l_tOdr_ODR_ACPT_ORG_CD = list; }
	public void setList_tOdr_ODR_ACPT_PSN_CD(List list) { l_tOdr_ODR_ACPT_PSN_CD = list; }
	public void setList_tOdr_CURRNCY_CD(List list) { l_tOdr_CURRNCY_CD = list; }
	public void setList_tOdr_EXCH_TYP(List list) { l_tOdr_EXCH_TYP = list; }
	public void setList_tOdr_DLV_LOC_CD(List list) { l_tOdr_DLV_LOC_CD = list; }
	public void setList_tOdr_DLV_LOC_CD_EIAJ(List list) { l_tOdr_DLV_LOC_CD_EIAJ = list; }
	public void setList_tOdr_DLV_LOC_NAME(List list) { l_tOdr_DLV_LOC_NAME = list; }
	public void setList_tOdr_DLV_LOC_NAME_KANJI(List list) { l_tOdr_DLV_LOC_NAME_KANJI = list; }
	public void setList_tOdr_PRD_ODR_PLACE_CD(List list) { l_tOdr_PRD_ODR_PLACE_CD = list; }
	public void setList_tOdr_ODR_UNIT_PRICE(List list) { l_tOdr_ODR_UNIT_PRICE = list; }
	public void setList_tOdr_SPCL_PRICE_TYP(List list) { l_tOdr_SPCL_PRICE_TYP = list; }
	public void setList_tOdr_PART_DLV_COUNT(List list) { l_tOdr_PART_DLV_COUNT = list; }
	public void setList_tOdr_DEPO_TYP(List list) { l_tOdr_DEPO_TYP = list; }
	public void setList_tOdr_DESINATED_DLV_DATE(List list) { l_tOdr_DESINATED_DLV_DATE = list; }
	public void setList_tOdr_STD_DESINATED_RCV_DATE(List list) { l_tOdr_STD_DESINATED_RCV_DATE = list; }
	public void setList_tOdr_ODR_QTY(List list) { l_tOdr_ODR_QTY = list; }
	public void setList_tOdr_REMAIN_UNCONFIRM_ODR_QTY(List list) { l_tOdr_REMAIN_UNCONFIRM_ODR_QTY = list; }
	public void setList_tOdr_CANCELED_UNCONFIRM_ODR_QTY(List list) { l_tOdr_CANCELED_UNCONFIRM_ODR_QTY = list; }
	public void setList_tOdr_UNIT_CD(List list) { l_tOdr_UNIT_CD = list; }
	public void setList_tOdr_UNCONFIRM_ODR_BALANCE(List list) { l_tOdr_UNCONFIRM_ODR_BALANCE = list; }
	public void setList_tOdr_ODR_AMOUNT(List list) { l_tOdr_ODR_AMOUNT = list; }
	public void setList_tOdr_ODR_AMOUNT_EXCH_RATES(List list) { l_tOdr_ODR_AMOUNT_EXCH_RATES = list; }
	public void setList_tOdr_TOTAL_SHIP_QTY(List list) { l_tOdr_TOTAL_SHIP_QTY = list; }
	public void setList_tOdr_SHIP_AMOUNT(List list) { l_tOdr_SHIP_AMOUNT = list; }
	public void setList_tOdr_SHIP_AMOUNT_EXCH_RATES(List list) { l_tOdr_SHIP_AMOUNT_EXCH_RATES = list; }
	public void setList_tOdr_RETURN_PRICE(List list) { l_tOdr_RETURN_PRICE = list; }
	public void setList_tOdr_RETURN_QTY(List list) { l_tOdr_RETURN_QTY = list; }
	public void setList_tOdr_RETURN_AMOUNT(List list) { l_tOdr_RETURN_AMOUNT = list; }
	public void setList_tOdr_RETURN_AMOUNT_EXCH_RATES(List list) { l_tOdr_RETURN_AMOUNT_EXCH_RATES = list; }
	public void setList_tOdr_ODR_CMPLT_FLG(List list) { l_tOdr_ODR_CMPLT_FLG = list; }
	public void setList_tOdr_ODR_CMPLT_DATE(List list) { l_tOdr_ODR_CMPLT_DATE = list; }
	public void setList_tOdr_CUS_DLV_CD(List list) { l_tOdr_CUS_DLV_CD = list; }
	public void setList_tOdr_CUS_DLV_KEY_CD(List list) { l_tOdr_CUS_DLV_KEY_CD = list; }
	public void setList_tOdr_PART_NAME(List list) { l_tOdr_PART_NAME = list; }
	public void setList_tOdr_PKG_UNIT(List list) { l_tOdr_PKG_UNIT = list; }
	public void setList_tOdr_SLIP_PRICE_PRINT_TYP(List list) { l_tOdr_SLIP_PRICE_PRINT_TYP = list; }
	public void setList_tOdr_INSPC_TYP(List list) { l_tOdr_INSPC_TYP = list; }
	public void setList_tOdr_CLIENT_REMARK(List list) { l_tOdr_CLIENT_REMARK = list; }
	public void setList_tOdr_CLIENT_REMARK_KANJI(List list) { l_tOdr_CLIENT_REMARK_KANJI = list; }
	public void setList_tOdr_CLIENT_BARCODE_INF(List list) { l_tOdr_CLIENT_BARCODE_INF = list; }
	public void setList_tOdr_TRANSPORT_CD(List list) { l_tOdr_TRANSPORT_CD = list; }
	public void setList_tOdr_TRANSPORT_TYP(List list) { l_tOdr_TRANSPORT_TYP = list; }
	public void setList_tOdr_TAX_APPLY_TYP(List list) { l_tOdr_TAX_APPLY_TYP = list; }
	public void setList_tOdr_TAX_CD(List list) { l_tOdr_TAX_CD = list; }
	public void setList_tOdr_TAX_CALC_TYP(List list) { l_tOdr_TAX_CALC_TYP = list; }
	public void setList_tOdr_REMARKS(List list) { l_tOdr_REMARKS = list; }
	public void setList_tOdr_ODR_ACPT_DATE(List list) { l_tOdr_ODR_ACPT_DATE = list; }
	public void setList_tOdr_SHIP_PLAN_REMAIN_QTY(List list) { l_tOdr_SHIP_PLAN_REMAIN_QTY = list; }
	public void setList_tOdr_SHIP_PLAN_CMPLT_FLG(List list) { l_tOdr_SHIP_PLAN_CMPLT_FLG = list; }
	public void setList_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG(List list) { l_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG = list; }
	public void setList_tOdr_PARTIAL_SHIP_INST_FLG(List list) { l_tOdr_PARTIAL_SHIP_INST_FLG = list; }
	public void setList_tOdr_IF_CTL_NO(List list) { l_tOdr_IF_CTL_NO = list; }
	public void setList_tOdr_ENTRY_TYP(List list) { l_tOdr_ENTRY_TYP = list; }
	public void setList_tOdr_BUYER_NAME(List list) { l_tOdr_BUYER_NAME = list; }
	public void setList_tOdr_PUCH_ODR_QTY_TOTAL(List list) { l_tOdr_PUCH_ODR_QTY_TOTAL = list; }
	public void setList_tOdr_UNIT_CD_ORG(List list) { l_tOdr_UNIT_CD_ORG = list; }
	public void setList_tOdr_SHIP_CNT(List list) { l_tOdr_SHIP_CNT = list; }
	public void setList_tOdr_IN_ODRNO(List list) { l_tOdr_IN_ODRNO = list; }
	public void setList_uptOdr_PART_DLV_COUNT(List list) { l_uptOdr_PART_DLV_COUNT = list; }
	public void setList_uptOdr_IN_ODRNO(List list) { l_uptOdr_IN_ODRNO = list; }
	public void setList_tOdrCtl_ODR_CTL_NO(List list) { l_tOdrCtl_ODR_CTL_NO = list; }
	public void setList_tOdrCtl_CUST_CD(List list) { l_tOdrCtl_CUST_CD = list; }
	public void setList_tOdrCtl_CUST_ITEM_CD(List list) { l_tOdrCtl_CUST_ITEM_CD = list; }
	public void setList_tOdrCtl_CUST_ITEM_NAME(List list) { l_tOdrCtl_CUST_ITEM_NAME = list; }
	public void setList_tOdrCtl_ITEM_CD(List list) { l_tOdrCtl_ITEM_CD = list; }
	public void setList_tOdrCtl_ITEM_NAME(List list) { l_tOdrCtl_ITEM_NAME = list; }
	public void setList_tOdrCtl_IN_ODRCTLNO(List list) { l_tOdrCtl_IN_ODRCTLNO = list; }
	public void setList_mItem_ITEM_CD(List list) { l_mItem_ITEM_CD = list; }
	public void setList_mItem_ITEM_NAME(List list) { l_mItem_ITEM_NAME = list; }
	public void setList_mItem_PRODUCT_TYP(List list) { l_mItem_PRODUCT_TYP = list; }
	public void setList_mItem_MRP_ODR_TYP(List list) { l_mItem_MRP_ODR_TYP = list; }
	public void setList_mItem_DRAW_CD(List list) { l_mItem_DRAW_CD = list; }
	public void setList_mItem_SPEC(List list) { l_mItem_SPEC = list; }
	public void setList_mItem_HIGH_LEVEL_NO(List list) { l_mItem_HIGH_LEVEL_NO = list; }
	public void setList_mItem_OUTSIDE_TYP(List list) { l_mItem_OUTSIDE_TYP = list; }
	public void setList_mItem_STOCK_UNIT_FLG(List list) { l_mItem_STOCK_UNIT_FLG = list; }
	public void setList_mItem_STOCK_UNIT(List list) { l_mItem_STOCK_UNIT = list; }
	public void setList_mItem_PKG_UNIT(List list) { l_mItem_PKG_UNIT = list; }
	public void setList_mItem_PKG_UNIT_QTY(List list) { l_mItem_PKG_UNIT_QTY = list; }
	public void setList_mItem_UNIT_QTY_TYP(List list) { l_mItem_UNIT_QTY_TYP = list; }
	public void setList_mItem_ODR_LT(List list) { l_mItem_ODR_LT = list; }
	public void setList_mItem_FIXED_LT(List list) { l_mItem_FIXED_LT = list; }
	public void setList_mItem_PROP_LT(List list) { l_mItem_PROP_LT = list; }
	public void setList_mItem_SAFETY_LT(List list) { l_mItem_SAFETY_LT = list; }
	public void setList_mItem_ISSUE_LT(List list) { l_mItem_ISSUE_LT = list; }
	public void setList_mItem_PROP_LOT_SIZE(List list) { l_mItem_PROP_LOT_SIZE = list; }
	public void setList_mItem_ITEM_SPOIL(List list) { l_mItem_ITEM_SPOIL = list; }
	public void setList_mItem_SAFETY_STOCK(List list) { l_mItem_SAFETY_STOCK = list; }
	public void setList_mItem_LOT_SIZING_TYP(List list) { l_mItem_LOT_SIZING_TYP = list; }
	public void setList_mItem_MAX_PERIOD(List list) { l_mItem_MAX_PERIOD = list; }
	public void setList_mItem_MAX_ODR_QTY(List list) { l_mItem_MAX_ODR_QTY = list; }
	public void setList_mItem_ODR_POINT(List list) { l_mItem_ODR_POINT = list; }
	public void setList_mItem_FIXED_ODR_QTY(List list) { l_mItem_FIXED_ODR_QTY = list; }
	public void setList_mItem_MIN_ODR_QTY(List list) { l_mItem_MIN_ODR_QTY = list; }
	public void setList_mItem_MUL_ODR_QTY(List list) { l_mItem_MUL_ODR_QTY = list; }
	public void setList_mItem_ISSUE_TYP(List list) { l_mItem_ISSUE_TYP = list; }
	public void setList_mItem_MPS_FLG(List list) { l_mItem_MPS_FLG = list; }
	public void setList_mItem_ACPT_INSPC_TYP(List list) { l_mItem_ACPT_INSPC_TYP = list; }
	public void setList_mItem_CLASIFICATION_CD(List list) { l_mItem_CLASIFICATION_CD = list; }
	public void setList_mItem_UNIT_WEIGHT(List list) { l_mItem_UNIT_WEIGHT = list; }
	public void setList_mItem_ABC_TYP(List list) { l_mItem_ABC_TYP = list; }
	public void setList_mItem_OPR_RSLT_TYP(List list) { l_mItem_OPR_RSLT_TYP = list; }
	public void setList_mItem_SPL_ITEM_TYP(List list) { l_mItem_SPL_ITEM_TYP = list; }
	public void setList_mItem_TAX_CD(List list) { l_mItem_TAX_CD = list; }
	public void setList_mItem_IN_ITEMCD(List list) { l_mItem_IN_ITEMCD = list; }
	public void setList_mCustBase_COMPANY_CD(List list) { l_mCustBase_COMPANY_CD = list; }
	public void setList_mCustBase_CUST_CD(List list) { l_mCustBase_CUST_CD = list; }
	public void setList_mCustBase_DLV_LOC_CD(List list) { l_mCustBase_DLV_LOC_CD = list; }
	public void setList_mCustBase_DLV_LOC_NAME(List list) { l_mCustBase_DLV_LOC_NAME = list; }
	public void setList_mCustBase_DLV_LOC_KNAME(List list) { l_mCustBase_DLV_LOC_KNAME = list; }
	public void setList_mCustBase_DLV_LOC_ENAME(List list) { l_mCustBase_DLV_LOC_ENAME = list; }
	public void setList_mCustBase_ZIP_CD(List list) { l_mCustBase_ZIP_CD = list; }
	public void setList_mCustBase_ADDRESS_1(List list) { l_mCustBase_ADDRESS_1 = list; }
	public void setList_mCustBase_ADDRESS_2(List list) { l_mCustBase_ADDRESS_2 = list; }
	public void setList_mCustBase_ADDRESS_K_1(List list) { l_mCustBase_ADDRESS_K_1 = list; }
	public void setList_mCustBase_ADDRESS_K_2(List list) { l_mCustBase_ADDRESS_K_2 = list; }
	public void setList_mCustBase_TEL(List list) { l_mCustBase_TEL = list; }
	public void setList_mCustBase_FAX(List list) { l_mCustBase_FAX = list; }
	public void setList_mCustBase_SHIP_WH_CD(List list) { l_mCustBase_SHIP_WH_CD = list; }
	public void setList_mCustBase_TRANSPORT_CD(List list) { l_mCustBase_TRANSPORT_CD = list; }
	public void setList_mCustBase_TRANSPORT_NAME(List list) { l_mCustBase_TRANSPORT_NAME = list; }
	public void setList_mCustBase_TRANSPORT_LT(List list) { l_mCustBase_TRANSPORT_LT = list; }
	public void setList_mCustBase_CAL_NO(List list) { l_mCustBase_CAL_NO = list; }
	public void setList_mCustBase_TRANSPORT_TYP(List list) { l_mCustBase_TRANSPORT_TYP = list; }
	public void setList_mCustBase_DLV_START_TIME(List list) { l_mCustBase_DLV_START_TIME = list; }
	public void setList_mCustBase_DLV_END_TIME(List list) { l_mCustBase_DLV_END_TIME = list; }
	public void setList_mCustBase_AREA_CLASS_TYP1(List list) { l_mCustBase_AREA_CLASS_TYP1 = list; }
	public void setList_mCustBase_AREA_CLASS_1(List list) { l_mCustBase_AREA_CLASS_1 = list; }
	public void setList_mCustBase_AREA_CLASS_TYP2(List list) { l_mCustBase_AREA_CLASS_TYP2 = list; }
	public void setList_mCustBase_AREA_CLASS_2(List list) { l_mCustBase_AREA_CLASS_2 = list; }
	public void setList_mCustBase_AREA_CLASS_TYP3(List list) { l_mCustBase_AREA_CLASS_TYP3 = list; }
	public void setList_mCustBase_AREA_CLASS_3(List list) { l_mCustBase_AREA_CLASS_3 = list; }
	public void setList_mCustBase_REMARKS_1(List list) { l_mCustBase_REMARKS_1 = list; }
	public void setList_mCustBase_REMARKS_2(List list) { l_mCustBase_REMARKS_2 = list; }
	public void setList_mCustBase_REMARKS_3(List list) { l_mCustBase_REMARKS_3 = list; }
	public void setList_mCustBase_DEPO_WH_CD(List list) { l_mCustBase_DEPO_WH_CD = list; }
	public void setList_mCustBase_IN_COMPANYCD(List list) { l_mCustBase_IN_COMPANYCD = list; }
	public void setList_mCustBase_IN_CUSTCD(List list) { l_mCustBase_IN_CUSTCD = list; }
	public void setList_mCustBase_IN_DLVLOCCD(List list) { l_mCustBase_IN_DLVLOCCD = list; }
	public void setList_mCust_COMPANY_CD(List list) { l_mCust_COMPANY_CD = list; }
	public void setList_mCust_CUST_CD(List list) { l_mCust_CUST_CD = list; }
	public void setList_mCust_CUST_NAME(List list) { l_mCust_CUST_NAME = list; }
	public void setList_mCust_CUST_ANAME(List list) { l_mCust_CUST_ANAME = list; }
	public void setList_mCust_CUST_KNAME(List list) { l_mCust_CUST_KNAME = list; }
	public void setList_mCust_OWN_ORG_CD(List list) { l_mCust_OWN_ORG_CD = list; }
	public void setList_mCust_OWN_PERSON_CD(List list) { l_mCust_OWN_PERSON_CD = list; }
	public void setList_mCust_CUR_CD(List list) { l_mCust_CUR_CD = list; }
	public void setList_mCust_EXCH_TYP(List list) { l_mCust_EXCH_TYP = list; }
	public void setList_mCust_TAX_APPLY_TYP(List list) { l_mCust_TAX_APPLY_TYP = list; }
	public void setList_mCust_TAX_CD(List list) { l_mCust_TAX_CD = list; }
	public void setList_mCust_TAX_CALC_TYP(List list) { l_mCust_TAX_CALC_TYP = list; }
	public void setList_mCust_PRICE_ROUND_TYP(List list) { l_mCust_PRICE_ROUND_TYP = list; }
	public void setList_mCust_DETAIL_ROUND_TYP(List list) { l_mCust_DETAIL_ROUND_TYP = list; }
	public void setList_mCust_UNCONFIRM_ODR_EFF_PRIOD(List list) { l_mCust_UNCONFIRM_ODR_EFF_PRIOD = list; }
	public void setList_mCust_UNCONFIRM_ODR_EFF_TERM_FLG(List list) { l_mCust_UNCONFIRM_ODR_EFF_TERM_FLG = list; }
	public void setList_mCust_EDI_CUST_VEND_CD(List list) { l_mCust_EDI_CUST_VEND_CD = list; }
	public void setList_mCust_PARTIAL_SHIP_INST_FLG(List list) { l_mCust_PARTIAL_SHIP_INST_FLG = list; }
	public void setList_mCust_DEPO_TYP(List list) { l_mCust_DEPO_TYP = list; }
	public void setList_mCust_INSPC_ACPT_TYP(List list) { l_mCust_INSPC_ACPT_TYP = list; }
	public void setList_mCust_IN_COMPANYCD(List list) { l_mCust_IN_COMPANYCD = list; }
	public void setList_mCust_IN_CUSTCD(List list) { l_mCust_IN_CUSTCD = list; }
	public void setList_strYotaku_WH_CD(List list) { l_strYotaku_WH_CD = list; }
	public void setList_strYotaku_IN_WH_TYP(List list) { l_strYotaku_IN_WH_TYP = list; }
	public void setList_in_tShipSlip_SLIP_CD(List list) { l_in_tShipSlip_SLIP_CD = list; }
	public void setList_in_tShipSlip_ITEM_CD(List list) { l_in_tShipSlip_ITEM_CD = list; }
	public void setList_in_tShipSlip_CUST_ITEM_CD(List list) { l_in_tShipSlip_CUST_ITEM_CD = list; }
	public void setList_in_tShipSlip_PART_NAME(List list) { l_in_tShipSlip_PART_NAME = list; }
	public void setList_in_tShipSlip_CUST_ODR_NO(List list) { l_in_tShipSlip_CUST_ODR_NO = list; }
	public void setList_in_tShipSlip_CUST_CD(List list) { l_in_tShipSlip_CUST_CD = list; }
	public void setList_in_tShipSlip_CUST_NAME(List list) { l_in_tShipSlip_CUST_NAME = list; }
	public void setList_in_tShipSlip_DLV_LOC_CD(List list) { l_in_tShipSlip_DLV_LOC_CD = list; }
	public void setList_in_tShipSlip_DLV_LOC_NAME_KANJI(List list) { l_in_tShipSlip_DLV_LOC_NAME_KANJI = list; }
	public void setList_in_tShipSlip_CUS_DLV_KEY_CD(List list) { l_in_tShipSlip_CUS_DLV_KEY_CD = list; }
	public void setList_in_tShipSlip_DESINATED_SHIP_DATE(List list) { l_in_tShipSlip_DESINATED_SHIP_DATE = list; }
	public void setList_in_tShipSlip_DESINATED_DLV_DATE(List list) { l_in_tShipSlip_DESINATED_DLV_DATE = list; }
	public void setList_in_tShipSlip_SCDL_DLV_DATE(List list) { l_in_tShipSlip_SCDL_DLV_DATE = list; }
	public void setList_in_tShipSlip_SHIP_ODR_QTY(List list) { l_in_tShipSlip_SHIP_ODR_QTY = list; }
	public void setList_in_tShipSlip_UNIT_CD(List list) { l_in_tShipSlip_UNIT_CD = list; }
	public void setList_in_tShipSlip_UNIT_PRICE(List list) { l_in_tShipSlip_UNIT_PRICE = list; }
	public void setList_in_tShipSlip_SHIP_ODR_AMOUNT(List list) { l_in_tShipSlip_SHIP_ODR_AMOUNT = list; }
	public void setList_in_tShipSlip_TAX_AMOUNT(List list) { l_in_tShipSlip_TAX_AMOUNT = list; }
	public void setList_in_tShipSlip_INSPC_TYP(List list) { l_in_tShipSlip_INSPC_TYP = list; }
	public void setList_in_tShipSlip_CLIENT_REMARK_KANJI(List list) { l_in_tShipSlip_CLIENT_REMARK_KANJI = list; }
	public void setList_in_tShipSlip_CLIENT_BARCODE_INF(List list) { l_in_tShipSlip_CLIENT_BARCODE_INF = list; }
	public void setList_in_tShipSlip_PRINT_FLG(List list) { l_in_tShipSlip_PRINT_FLG = list; }
	public void setList_in_tShipSlip_DEL_FLG(List list) { l_in_tShipSlip_DEL_FLG = list; }
	public void setList_in_tShipSlip_BUYER_NAME(List list) { l_in_tShipSlip_BUYER_NAME = list; }
	public void setList_in_tShipSlip_PUCH_ODR_QTY_TOTAL(List list) { l_in_tShipSlip_PUCH_ODR_QTY_TOTAL = list; }
	public void setList_in_tShipSlip_DLV_ODR_QTY(List list) { l_in_tShipSlip_DLV_ODR_QTY = list; }
	public void setList_in_tShipSlip_SHIP_ODR_AMOUNT_TAX(List list) { l_in_tShipSlip_SHIP_ODR_AMOUNT_TAX = list; }
	public void setList_in_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT(List list) { l_in_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT = list; }
	public void setList_in_tShipSlip_INTERNAL_TAX_SALES_AMOUNT(List list) { l_in_tShipSlip_INTERNAL_TAX_SALES_AMOUNT = list; }
	public void setList_in_tShipSlip_TAXFREE_SALES_AMOUNT(List list) { l_in_tShipSlip_TAXFREE_SALES_AMOUNT = list; }
	public void setList_in_tShipSlip_TAX_CREDIT_SALES_AMOUNT(List list) { l_in_tShipSlip_TAX_CREDIT_SALES_AMOUNT = list; }
	public void setList_in_tShipSlip_EXTERNAL_TAX_AMOUNT(List list) { l_in_tShipSlip_EXTERNAL_TAX_AMOUNT = list; }
	public void setList_in_tShipSlip_INTERNAL_TAX_AMOUNT(List list) { l_in_tShipSlip_INTERNAL_TAX_AMOUNT = list; }
	public void setList_in_tShipSlip_TAX_AMOUNT_1(List list) { l_in_tShipSlip_TAX_AMOUNT_1 = list; }
	public void setList_in_tShipSlip_TAX_AMOUNT_2(List list) { l_in_tShipSlip_TAX_AMOUNT_2 = list; }
	public void setList_in_tShipSlip_TAX_AMOUNT_3(List list) { l_in_tShipSlip_TAX_AMOUNT_3 = list; }
	public void setList_in_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT(List list) { l_in_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT = list; }
	public void setList_del_tShipSlip_IN_SLIPCD(List list) { l_del_tShipSlip_IN_SLIPCD = list; }
	public void setList_uptOdr_SHIP_CNT(List list) { l_uptOdr_SHIP_CNT = list; }
	public void setList_tUnShipList_UN_SHIP_SEQ_NO(List list) { l_tUnShipList_UN_SHIP_SEQ_NO = list; }
	public void setList_tUnShipList_CUST_CD(List list) { l_tUnShipList_CUST_CD = list; }
	public void setList_tUnShipList_ACPT_ODR_CD(List list) { l_tUnShipList_ACPT_ODR_CD = list; }
	public void setList_tUnShipList_PART_DLV_SEQ_NO(List list) { l_tUnShipList_PART_DLV_SEQ_NO = list; }
	public void setList_tUnShipList_ITEM_CD(List list) { l_tUnShipList_ITEM_CD = list; }
	public void setList_tUnShipList_UN_SHIP_QTY(List list) { l_tUnShipList_UN_SHIP_QTY = list; }
	public void setList_tUnShipList_UN_SHIP_RSN(List list) { l_tUnShipList_UN_SHIP_RSN = list; }
	public void setList_tUnShipList_WH_CD(List list) { l_tUnShipList_WH_CD = list; }
	public void setList_tUnShipList_PRINT_FLG(List list) { l_tUnShipList_PRINT_FLG = list; }
	public void setList_tUnShipList_DEL_FLG(List list) { l_tUnShipList_DEL_FLG = list; }
	public void setList_tori_tAnsDlvDate_REST_SHIP_ODR_QTY(List list) { l_tori_tAnsDlvDate_REST_SHIP_ODR_QTY = list; }
	public void setList_tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG(List list) { l_tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG = list; }
	public void setList_tori_tAnsDlvDate_IN_ODRNO(List list) { l_tori_tAnsDlvDate_IN_ODRNO = list; }
	public void setList_tori_tAnsDlvDate_IN_PARTDLVSEQNO(List list) { l_tori_tAnsDlvDate_IN_PARTDLVSEQNO = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }
	public void setList_strTAX_CD(List list) { l_strTAX_CD = list; }
	public void setList_SHIP_MODIFY_COUNT(List list) { l_SHIP_MODIFY_COUNT = list; }
	public void setList_SEL_MODIFY_COUNT(List list) { l_SEL_MODIFY_COUNT = list; }

	public int setL2L_r1_SHIP_ODR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r1_SHIP_ODR == null) {
			l_r1_SHIP_ODR = new ArrayList();
		} else {
			l_r1_SHIP_ODR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r1_SHIP_ODR.add(((KU0060010Struct) list.get(i)).getr1_SHIP_ODR());
		}
		return size;
	}
	public int setL2L_r2_SHIP_ODR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r2_SHIP_ODR == null) {
			l_r2_SHIP_ODR = new ArrayList();
		} else {
			l_r2_SHIP_ODR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r2_SHIP_ODR.add(((KU0060010Struct) list.get(i)).getr2_SHIP_ODR());
		}
		return size;
	}
	public int setL2L_tAnsDlvDate_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tAnsDlvDate_MODIFY_COUNT == null) {
			l_tAnsDlvDate_MODIFY_COUNT = new ArrayList();
		} else {
			l_tAnsDlvDate_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tAnsDlvDate_MODIFY_COUNT.add(((KU0060010Struct) list.get(i)).gettAnsDlvDate_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_tShipOdr_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tShipOdr_MODIFY_COUNT == null) {
			l_tShipOdr_MODIFY_COUNT = new ArrayList();
		} else {
			l_tShipOdr_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tShipOdr_MODIFY_COUNT.add(((KU0060010Struct) list.get(i)).gettShipOdr_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_Shipt_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Shipt_MODIFY_COUNT == null) {
			l_Shipt_MODIFY_COUNT = new ArrayList();
		} else {
			l_Shipt_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Shipt_MODIFY_COUNT.add(((KU0060010Struct) list.get(i)).getShipt_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_h_RESULT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_RESULT == null) {
			l_h_RESULT = new ArrayList();
		} else {
			l_h_RESULT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_RESULT.add(((KU0060010Struct) list.get(i)).geth_RESULT());
		}
		return size;
	}
	public int setL2L_strBUSINESS_OPR_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strBUSINESS_OPR_DATE == null) {
			l_strBUSINESS_OPR_DATE = new ArrayList();
		} else {
			l_strBUSINESS_OPR_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strBUSINESS_OPR_DATE.add(((KU0060010Struct) list.get(i)).getstrBUSINESS_OPR_DATE());
		}
		return size;
	}
	public int setL2L_strPLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strPLANT_CD == null) {
			l_strPLANT_CD = new ArrayList();
		} else {
			l_strPLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strPLANT_CD.add(((KU0060010Struct) list.get(i)).getstrPLANT_CD());
		}
		return size;
	}
	public int setL2L_strTaxTAX_KBN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strTaxTAX_KBN == null) {
			l_strTaxTAX_KBN = new ArrayList();
		} else {
			l_strTaxTAX_KBN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strTaxTAX_KBN.add(((KU0060010Struct) list.get(i)).getstrTaxTAX_KBN());
		}
		return size;
	}
	public int setL2L_strTaxOLD_TAX_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strTaxOLD_TAX_1 == null) {
			l_strTaxOLD_TAX_1 = new ArrayList();
		} else {
			l_strTaxOLD_TAX_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strTaxOLD_TAX_1.add(((KU0060010Struct) list.get(i)).getstrTaxOLD_TAX_1());
		}
		return size;
	}
	public int setL2L_strTaxOLD_TAX_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strTaxOLD_TAX_2 == null) {
			l_strTaxOLD_TAX_2 = new ArrayList();
		} else {
			l_strTaxOLD_TAX_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strTaxOLD_TAX_2.add(((KU0060010Struct) list.get(i)).getstrTaxOLD_TAX_2());
		}
		return size;
	}
	public int setL2L_strTaxOLD_TAX_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strTaxOLD_TAX_3 == null) {
			l_strTaxOLD_TAX_3 = new ArrayList();
		} else {
			l_strTaxOLD_TAX_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strTaxOLD_TAX_3.add(((KU0060010Struct) list.get(i)).getstrTaxOLD_TAX_3());
		}
		return size;
	}
	public int setL2L_strTaxNEW_TAX_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strTaxNEW_TAX_1 == null) {
			l_strTaxNEW_TAX_1 = new ArrayList();
		} else {
			l_strTaxNEW_TAX_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strTaxNEW_TAX_1.add(((KU0060010Struct) list.get(i)).getstrTaxNEW_TAX_1());
		}
		return size;
	}
	public int setL2L_strTaxNEW_TAX_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strTaxNEW_TAX_2 == null) {
			l_strTaxNEW_TAX_2 = new ArrayList();
		} else {
			l_strTaxNEW_TAX_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strTaxNEW_TAX_2.add(((KU0060010Struct) list.get(i)).getstrTaxNEW_TAX_2());
		}
		return size;
	}
	public int setL2L_strTaxNEW_TAX_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strTaxNEW_TAX_3 == null) {
			l_strTaxNEW_TAX_3 = new ArrayList();
		} else {
			l_strTaxNEW_TAX_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strTaxNEW_TAX_3.add(((KU0060010Struct) list.get(i)).getstrTaxNEW_TAX_3());
		}
		return size;
	}
	public int setL2L_strTaxSTART_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strTaxSTART_DATE == null) {
			l_strTaxSTART_DATE = new ArrayList();
		} else {
			l_strTaxSTART_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strTaxSTART_DATE.add(((KU0060010Struct) list.get(i)).getstrTaxSTART_DATE());
		}
		return size;
	}
	public int setL2L_strTaxROUND_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strTaxROUND_TYP == null) {
			l_strTaxROUND_TYP = new ArrayList();
		} else {
			l_strTaxROUND_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strTaxROUND_TYP.add(((KU0060010Struct) list.get(i)).getstrTaxROUND_TYP());
		}
		return size;
	}
	public int setL2L_strTaxIN_COMPANYCD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strTaxIN_COMPANYCD == null) {
			l_strTaxIN_COMPANYCD = new ArrayList();
		} else {
			l_strTaxIN_COMPANYCD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strTaxIN_COMPANYCD.add(((KU0060010Struct) list.get(i)).getstrTaxIN_COMPANYCD());
		}
		return size;
	}
	public int setL2L_strTaxIN_CUSTCD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strTaxIN_CUSTCD == null) {
			l_strTaxIN_CUSTCD = new ArrayList();
		} else {
			l_strTaxIN_CUSTCD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strTaxIN_CUSTCD.add(((KU0060010Struct) list.get(i)).getstrTaxIN_CUSTCD());
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
			l_l_CUST_ITEM_CD.add(((KU0060010Struct) list.get(i)).getl_CUST_ITEM_CD());
		}
		return size;
	}
	public int setL2L_tDECIMAL_FIG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tDECIMAL_FIG == null) {
			l_tDECIMAL_FIG = new ArrayList();
		} else {
			l_tDECIMAL_FIG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tDECIMAL_FIG.add(((KU0060010Struct) list.get(i)).gettDECIMAL_FIG());
		}
		return size;
	}
	public int setL2L_tCUR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tCUR_CD == null) {
			l_tCUR_CD = new ArrayList();
		} else {
			l_tCUR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tCUR_CD.add(((KU0060010Struct) list.get(i)).gettCUR_CD());
		}
		return size;
	}
	public int setL2L_strCOMPANY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strCOMPANY_CD == null) {
			l_strCOMPANY_CD = new ArrayList();
		} else {
			l_strCOMPANY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strCOMPANY_CD.add(((KU0060010Struct) list.get(i)).getstrCOMPANY_CD());
		}
		return size;
	}
	public int setL2L_strUSER_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strUSER_NAME == null) {
			l_strUSER_NAME = new ArrayList();
		} else {
			l_strUSER_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strUSER_NAME.add(((KU0060010Struct) list.get(i)).getstrUSER_NAME());
		}
		return size;
	}
	public int setL2L_strSECTION_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strSECTION_CD == null) {
			l_strSECTION_CD = new ArrayList();
		} else {
			l_strSECTION_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strSECTION_CD.add(((KU0060010Struct) list.get(i)).getstrSECTION_CD());
		}
		return size;
	}
	public int setL2L_strPLANT_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strPLANT_NAME == null) {
			l_strPLANT_NAME = new ArrayList();
		} else {
			l_strPLANT_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strPLANT_NAME.add(((KU0060010Struct) list.get(i)).getstrPLANT_NAME());
		}
		return size;
	}
	public int setL2L_strPLANT_ANAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strPLANT_ANAME == null) {
			l_strPLANT_ANAME = new ArrayList();
		} else {
			l_strPLANT_ANAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strPLANT_ANAME.add(((KU0060010Struct) list.get(i)).getstrPLANT_ANAME());
		}
		return size;
	}
	public int setL2L_strCAL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strCAL_NO == null) {
			l_strCAL_NO = new ArrayList();
		} else {
			l_strCAL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strCAL_NO.add(((KU0060010Struct) list.get(i)).getstrCAL_NO());
		}
		return size;
	}
	public int setL2L_strUSER_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strUSER_CD == null) {
			l_strUSER_CD = new ArrayList();
		} else {
			l_strUSER_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strUSER_CD.add(((KU0060010Struct) list.get(i)).getstrUSER_CD());
		}
		return size;
	}
	public int setL2L_strSYUKA_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strSYUKA_LT == null) {
			l_strSYUKA_LT = new ArrayList();
		} else {
			l_strSYUKA_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strSYUKA_LT.add(((KU0060010Struct) list.get(i)).getstrSYUKA_LT());
		}
		return size;
	}
	public int setL2L_tHOLIDAY_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tHOLIDAY_FLG == null) {
			l_tHOLIDAY_FLG = new ArrayList();
		} else {
			l_tHOLIDAY_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tHOLIDAY_FLG.add(((KU0060010Struct) list.get(i)).gettHOLIDAY_FLG());
		}
		return size;
	}
	public int setL2L_tWH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tWH_CD == null) {
			l_tWH_CD = new ArrayList();
		} else {
			l_tWH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tWH_CD.add(((KU0060010Struct) list.get(i)).gettWH_CD());
		}
		return size;
	}
	public int setL2L_tCAL_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tCAL_DATE == null) {
			l_tCAL_DATE = new ArrayList();
		} else {
			l_tCAL_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tCAL_DATE.add(((KU0060010Struct) list.get(i)).gettCAL_DATE());
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
			l_l_ODR_NO.add(((KU0060010Struct) list.get(i)).getl_ODR_NO());
		}
		return size;
	}
	public int setL2L_l_PART_DLV_SEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PART_DLV_SEQ_NO == null) {
			l_l_PART_DLV_SEQ_NO = new ArrayList();
		} else {
			l_l_PART_DLV_SEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PART_DLV_SEQ_NO.add(((KU0060010Struct) list.get(i)).getl_PART_DLV_SEQ_NO());
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
			l_l_DESINATED_DLV_DATE.add(((KU0060010Struct) list.get(i)).getl_DESINATED_DLV_DATE());
		}
		return size;
	}
	public int setL2L_l_DESINATED_SHIP_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DESINATED_SHIP_DATE == null) {
			l_l_DESINATED_SHIP_DATE = new ArrayList();
		} else {
			l_l_DESINATED_SHIP_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DESINATED_SHIP_DATE.add(((KU0060010Struct) list.get(i)).getl_DESINATED_SHIP_DATE());
		}
		return size;
	}
	public int setL2L_l_SHIP_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SHIP_QTY == null) {
			l_l_SHIP_QTY = new ArrayList();
		} else {
			l_l_SHIP_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SHIP_QTY.add(((KU0060010Struct) list.get(i)).getl_SHIP_QTY());
		}
		return size;
	}
	public int setL2L_l_REST_SHIP_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_REST_SHIP_QTY == null) {
			l_l_REST_SHIP_QTY = new ArrayList();
		} else {
			l_l_REST_SHIP_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_REST_SHIP_QTY.add(((KU0060010Struct) list.get(i)).getl_REST_SHIP_QTY());
		}
		return size;
	}
	public int setL2L_l_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_WH_CD == null) {
			l_l_WH_CD = new ArrayList();
		} else {
			l_l_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_WH_CD.add(((KU0060010Struct) list.get(i)).getl_WH_CD());
		}
		return size;
	}
	public int setL2L_l_WH_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_WH_NAME == null) {
			l_l_WH_NAME = new ArrayList();
		} else {
			l_l_WH_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_WH_NAME.add(((KU0060010Struct) list.get(i)).getl_WH_NAME());
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
			l_l_CUST_ODR_NO.add(((KU0060010Struct) list.get(i)).getl_CUST_ODR_NO());
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
			l_l_CUST_CD.add(((KU0060010Struct) list.get(i)).getl_CUST_CD());
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
			l_l_CUST_NAME.add(((KU0060010Struct) list.get(i)).getl_CUST_NAME());
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
			l_l_CUST_ITEM_NAME.add(((KU0060010Struct) list.get(i)).getl_CUST_ITEM_NAME());
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
			l_l_ITEM_CD.add(((KU0060010Struct) list.get(i)).getl_ITEM_CD());
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
			l_l_ITEM_NAME.add(((KU0060010Struct) list.get(i)).getl_ITEM_NAME());
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
			l_l_STOCK_UNIT.add(((KU0060010Struct) list.get(i)).getl_STOCK_UNIT());
		}
		return size;
	}
	public int setL2L_l_UNIT_QTY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_UNIT_QTY_TYP == null) {
			l_l_UNIT_QTY_TYP = new ArrayList();
		} else {
			l_l_UNIT_QTY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_UNIT_QTY_TYP.add(((KU0060010Struct) list.get(i)).getl_UNIT_QTY_TYP());
		}
		return size;
	}
	public int setL2L_l_MRP_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_MRP_ODR_TYP == null) {
			l_l_MRP_ODR_TYP = new ArrayList();
		} else {
			l_l_MRP_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_MRP_ODR_TYP.add(((KU0060010Struct) list.get(i)).getl_MRP_ODR_TYP());
		}
		return size;
	}
	public int setL2L_l_ODR_CTL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ODR_CTL_NO == null) {
			l_l_ODR_CTL_NO = new ArrayList();
		} else {
			l_l_ODR_CTL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ODR_CTL_NO.add(((KU0060010Struct) list.get(i)).getl_ODR_CTL_NO());
		}
		return size;
	}
	public int setL2L_l_TRANSPORT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_TRANSPORT_TYP == null) {
			l_l_TRANSPORT_TYP = new ArrayList();
		} else {
			l_l_TRANSPORT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_TRANSPORT_TYP.add(((KU0060010Struct) list.get(i)).getl_TRANSPORT_TYP());
		}
		return size;
	}
	public int setL2L_l_ODR_UNIT_PRICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ODR_UNIT_PRICE == null) {
			l_l_ODR_UNIT_PRICE = new ArrayList();
		} else {
			l_l_ODR_UNIT_PRICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ODR_UNIT_PRICE.add(((KU0060010Struct) list.get(i)).getl_ODR_UNIT_PRICE());
		}
		return size;
	}
	public int setL2L_l_SPCL_PRICE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SPCL_PRICE_TYP == null) {
			l_l_SPCL_PRICE_TYP = new ArrayList();
		} else {
			l_l_SPCL_PRICE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SPCL_PRICE_TYP.add(((KU0060010Struct) list.get(i)).getl_SPCL_PRICE_TYP());
		}
		return size;
	}
	public int setL2L_l_PARTIAL_SHIP_INST_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PARTIAL_SHIP_INST_FLG == null) {
			l_l_PARTIAL_SHIP_INST_FLG = new ArrayList();
		} else {
			l_l_PARTIAL_SHIP_INST_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PARTIAL_SHIP_INST_FLG.add(((KU0060010Struct) list.get(i)).getl_PARTIAL_SHIP_INST_FLG());
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
			l_l_MODIFY_COUNT.add(((KU0060010Struct) list.get(i)).getl_MODIFY_COUNT());
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
			l_l_JOB_ODR_CD.add(((KU0060010Struct) list.get(i)).getl_JOB_ODR_CD());
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
			l_ODR_NO.add(((KU0060010Struct) list.get(i)).getODR_NO());
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
			l_ITEM_CD.add(((KU0060010Struct) list.get(i)).getITEM_CD());
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
			l_DESINATED_DLV_DATE.add(((KU0060010Struct) list.get(i)).getDESINATED_DLV_DATE());
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
			l_DESINATED_SHIP_DATE.add(((KU0060010Struct) list.get(i)).getDESINATED_SHIP_DATE());
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
			l_CUST_CD.add(((KU0060010Struct) list.get(i)).getCUST_CD());
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
			l_CUST_CHRG_PSN_CD.add(((KU0060010Struct) list.get(i)).getCUST_CHRG_PSN_CD());
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
			l_CUST_ODR_NO.add(((KU0060010Struct) list.get(i)).getCUST_ODR_NO());
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
			l_CUST_ITEM_CD.add(((KU0060010Struct) list.get(i)).getCUST_ITEM_CD());
		}
		return size;
	}
	public int setL2L_up_tAnsDlvDate_DESINATED_SHIP_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_up_tAnsDlvDate_DESINATED_SHIP_DATE == null) {
			l_up_tAnsDlvDate_DESINATED_SHIP_DATE = new ArrayList();
		} else {
			l_up_tAnsDlvDate_DESINATED_SHIP_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_up_tAnsDlvDate_DESINATED_SHIP_DATE.add(((KU0060010Struct) list.get(i)).getup_tAnsDlvDate_DESINATED_SHIP_DATE());
		}
		return size;
	}
	public int setL2L_up_tAnsDlvDate_REST_SHIP_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_up_tAnsDlvDate_REST_SHIP_ODR_QTY == null) {
			l_up_tAnsDlvDate_REST_SHIP_ODR_QTY = new ArrayList();
		} else {
			l_up_tAnsDlvDate_REST_SHIP_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_up_tAnsDlvDate_REST_SHIP_ODR_QTY.add(((KU0060010Struct) list.get(i)).getup_tAnsDlvDate_REST_SHIP_ODR_QTY());
		}
		return size;
	}
	public int setL2L_up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG == null) {
			l_up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG = new ArrayList();
		} else {
			l_up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG.add(((KU0060010Struct) list.get(i)).getup_tAnsDlvDate_SHIP_ODR_CMPLT_FLG());
		}
		return size;
	}
	public int setL2L_up_tAnsDlvDate_IN_ODRNO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_up_tAnsDlvDate_IN_ODRNO == null) {
			l_up_tAnsDlvDate_IN_ODRNO = new ArrayList();
		} else {
			l_up_tAnsDlvDate_IN_ODRNO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_up_tAnsDlvDate_IN_ODRNO.add(((KU0060010Struct) list.get(i)).getup_tAnsDlvDate_IN_ODRNO());
		}
		return size;
	}
	public int setL2L_up_tAnsDlvDate_IN_PARTDLVSEQNO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_up_tAnsDlvDate_IN_PARTDLVSEQNO == null) {
			l_up_tAnsDlvDate_IN_PARTDLVSEQNO = new ArrayList();
		} else {
			l_up_tAnsDlvDate_IN_PARTDLVSEQNO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_up_tAnsDlvDate_IN_PARTDLVSEQNO.add(((KU0060010Struct) list.get(i)).getup_tAnsDlvDate_IN_PARTDLVSEQNO());
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
			l_l_SLIP_CD.add(((KU0060010Struct) list.get(i)).getl_SLIP_CD());
		}
		return size;
	}
	public int setL2L_l_c_DIRECT_DLV_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_c_DIRECT_DLV_FLG == null) {
			l_l_c_DIRECT_DLV_FLG = new ArrayList();
		} else {
			l_l_c_DIRECT_DLV_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_c_DIRECT_DLV_FLG.add(((KU0060010Struct) list.get(i)).getl_c_DIRECT_DLV_FLG());
		}
		return size;
	}
	public int setL2L_l_DLV_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DLV_MODIFY_COUNT == null) {
			l_l_DLV_MODIFY_COUNT = new ArrayList();
		} else {
			l_l_DLV_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DLV_MODIFY_COUNT.add(((KU0060010Struct) list.get(i)).getl_DLV_MODIFY_COUNT());
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
			l_SLIP_CD.add(((KU0060010Struct) list.get(i)).getSLIP_CD());
		}
		return size;
	}
	public int setL2L_in_tShipOdr_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipOdr_ODR_NO == null) {
			l_in_tShipOdr_ODR_NO = new ArrayList();
		} else {
			l_in_tShipOdr_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipOdr_ODR_NO.add(((KU0060010Struct) list.get(i)).getin_tShipOdr_ODR_NO());
		}
		return size;
	}
	public int setL2L_in_tShipOdr_PART_DLV_SEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipOdr_PART_DLV_SEQ_NO == null) {
			l_in_tShipOdr_PART_DLV_SEQ_NO = new ArrayList();
		} else {
			l_in_tShipOdr_PART_DLV_SEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipOdr_PART_DLV_SEQ_NO.add(((KU0060010Struct) list.get(i)).getin_tShipOdr_PART_DLV_SEQ_NO());
		}
		return size;
	}
	public int setL2L_in_tShipOdr_SLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipOdr_SLIP_CD == null) {
			l_in_tShipOdr_SLIP_CD = new ArrayList();
		} else {
			l_in_tShipOdr_SLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipOdr_SLIP_CD.add(((KU0060010Struct) list.get(i)).getin_tShipOdr_SLIP_CD());
		}
		return size;
	}
	public int setL2L_in_tShipOdr_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipOdr_ITEM_CD == null) {
			l_in_tShipOdr_ITEM_CD = new ArrayList();
		} else {
			l_in_tShipOdr_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipOdr_ITEM_CD.add(((KU0060010Struct) list.get(i)).getin_tShipOdr_ITEM_CD());
		}
		return size;
	}
	public int setL2L_in_tShipOdr_CUST_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipOdr_CUST_ITEM_CD == null) {
			l_in_tShipOdr_CUST_ITEM_CD = new ArrayList();
		} else {
			l_in_tShipOdr_CUST_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipOdr_CUST_ITEM_CD.add(((KU0060010Struct) list.get(i)).getin_tShipOdr_CUST_ITEM_CD());
		}
		return size;
	}
	public int setL2L_in_tShipOdr_CUST_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipOdr_CUST_ODR_NO == null) {
			l_in_tShipOdr_CUST_ODR_NO = new ArrayList();
		} else {
			l_in_tShipOdr_CUST_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipOdr_CUST_ODR_NO.add(((KU0060010Struct) list.get(i)).getin_tShipOdr_CUST_ODR_NO());
		}
		return size;
	}
	public int setL2L_in_tShipOdr_CUST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipOdr_CUST_CD == null) {
			l_in_tShipOdr_CUST_CD = new ArrayList();
		} else {
			l_in_tShipOdr_CUST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipOdr_CUST_CD.add(((KU0060010Struct) list.get(i)).getin_tShipOdr_CUST_CD());
		}
		return size;
	}
	public int setL2L_in_tShipOdr_CUST_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipOdr_CUST_NAME == null) {
			l_in_tShipOdr_CUST_NAME = new ArrayList();
		} else {
			l_in_tShipOdr_CUST_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipOdr_CUST_NAME.add(((KU0060010Struct) list.get(i)).getin_tShipOdr_CUST_NAME());
		}
		return size;
	}
	public int setL2L_in_tShipOdr_SHIP_ODR_ISS_PSN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipOdr_SHIP_ODR_ISS_PSN_CD == null) {
			l_in_tShipOdr_SHIP_ODR_ISS_PSN_CD = new ArrayList();
		} else {
			l_in_tShipOdr_SHIP_ODR_ISS_PSN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipOdr_SHIP_ODR_ISS_PSN_CD.add(((KU0060010Struct) list.get(i)).getin_tShipOdr_SHIP_ODR_ISS_PSN_CD());
		}
		return size;
	}
	public int setL2L_in_tShipOdr_DLV_LOC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipOdr_DLV_LOC_CD == null) {
			l_in_tShipOdr_DLV_LOC_CD = new ArrayList();
		} else {
			l_in_tShipOdr_DLV_LOC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipOdr_DLV_LOC_CD.add(((KU0060010Struct) list.get(i)).getin_tShipOdr_DLV_LOC_CD());
		}
		return size;
	}
	public int setL2L_in_tShipOdr_DESINATED_SHIP_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipOdr_DESINATED_SHIP_DATE == null) {
			l_in_tShipOdr_DESINATED_SHIP_DATE = new ArrayList();
		} else {
			l_in_tShipOdr_DESINATED_SHIP_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipOdr_DESINATED_SHIP_DATE.add(((KU0060010Struct) list.get(i)).getin_tShipOdr_DESINATED_SHIP_DATE());
		}
		return size;
	}
	public int setL2L_in_tShipOdr_SHIP_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipOdr_SHIP_QTY == null) {
			l_in_tShipOdr_SHIP_QTY = new ArrayList();
		} else {
			l_in_tShipOdr_SHIP_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipOdr_SHIP_QTY.add(((KU0060010Struct) list.get(i)).getin_tShipOdr_SHIP_QTY());
		}
		return size;
	}
	public int setL2L_in_tShipOdr_UNIT_PRICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipOdr_UNIT_PRICE == null) {
			l_in_tShipOdr_UNIT_PRICE = new ArrayList();
		} else {
			l_in_tShipOdr_UNIT_PRICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipOdr_UNIT_PRICE.add(((KU0060010Struct) list.get(i)).getin_tShipOdr_UNIT_PRICE());
		}
		return size;
	}
	public int setL2L_in_tShipOdr_SHIP_ODR_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipOdr_SHIP_ODR_AMOUNT == null) {
			l_in_tShipOdr_SHIP_ODR_AMOUNT = new ArrayList();
		} else {
			l_in_tShipOdr_SHIP_ODR_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipOdr_SHIP_ODR_AMOUNT.add(((KU0060010Struct) list.get(i)).getin_tShipOdr_SHIP_ODR_AMOUNT());
		}
		return size;
	}
	public int setL2L_in_tShipOdr_CURRNCY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipOdr_CURRNCY_CD == null) {
			l_in_tShipOdr_CURRNCY_CD = new ArrayList();
		} else {
			l_in_tShipOdr_CURRNCY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipOdr_CURRNCY_CD.add(((KU0060010Struct) list.get(i)).getin_tShipOdr_CURRNCY_CD());
		}
		return size;
	}
	public int setL2L_in_tShipOdr_PKG_UNIT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipOdr_PKG_UNIT_QTY == null) {
			l_in_tShipOdr_PKG_UNIT_QTY = new ArrayList();
		} else {
			l_in_tShipOdr_PKG_UNIT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipOdr_PKG_UNIT_QTY.add(((KU0060010Struct) list.get(i)).getin_tShipOdr_PKG_UNIT_QTY());
		}
		return size;
	}
	public int setL2L_in_tShipOdr_REMARKS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipOdr_REMARKS == null) {
			l_in_tShipOdr_REMARKS = new ArrayList();
		} else {
			l_in_tShipOdr_REMARKS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipOdr_REMARKS.add(((KU0060010Struct) list.get(i)).getin_tShipOdr_REMARKS());
		}
		return size;
	}
	public int setL2L_in_tShipOdr_ALLCT_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipOdr_ALLCT_WH_CD == null) {
			l_in_tShipOdr_ALLCT_WH_CD = new ArrayList();
		} else {
			l_in_tShipOdr_ALLCT_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipOdr_ALLCT_WH_CD.add(((KU0060010Struct) list.get(i)).getin_tShipOdr_ALLCT_WH_CD());
		}
		return size;
	}
	public int setL2L_in_tShipOdr_DEPO_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipOdr_DEPO_TYP == null) {
			l_in_tShipOdr_DEPO_TYP = new ArrayList();
		} else {
			l_in_tShipOdr_DEPO_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipOdr_DEPO_TYP.add(((KU0060010Struct) list.get(i)).getin_tShipOdr_DEPO_TYP());
		}
		return size;
	}
	public int setL2L_in_tShipOdr_ENTRY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipOdr_ENTRY_TYP == null) {
			l_in_tShipOdr_ENTRY_TYP = new ArrayList();
		} else {
			l_in_tShipOdr_ENTRY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipOdr_ENTRY_TYP.add(((KU0060010Struct) list.get(i)).getin_tShipOdr_ENTRY_TYP());
		}
		return size;
	}
	public int setL2L_in_tShipOdr_PRINT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipOdr_PRINT_FLG == null) {
			l_in_tShipOdr_PRINT_FLG = new ArrayList();
		} else {
			l_in_tShipOdr_PRINT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipOdr_PRINT_FLG.add(((KU0060010Struct) list.get(i)).getin_tShipOdr_PRINT_FLG());
		}
		return size;
	}
	public int setL2L_in_tShipOdr_SHP_CMPLT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipOdr_SHP_CMPLT_FLG == null) {
			l_in_tShipOdr_SHP_CMPLT_FLG = new ArrayList();
		} else {
			l_in_tShipOdr_SHP_CMPLT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipOdr_SHP_CMPLT_FLG.add(((KU0060010Struct) list.get(i)).getin_tShipOdr_SHP_CMPLT_FLG());
		}
		return size;
	}
	public int setL2L_in_tShipOdr_DEL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipOdr_DEL_FLG == null) {
			l_in_tShipOdr_DEL_FLG = new ArrayList();
		} else {
			l_in_tShipOdr_DEL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipOdr_DEL_FLG.add(((KU0060010Struct) list.get(i)).getin_tShipOdr_DEL_FLG());
		}
		return size;
	}
	public int setL2L_in_tShipOdr_TRANSPORT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipOdr_TRANSPORT_CD == null) {
			l_in_tShipOdr_TRANSPORT_CD = new ArrayList();
		} else {
			l_in_tShipOdr_TRANSPORT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipOdr_TRANSPORT_CD.add(((KU0060010Struct) list.get(i)).getin_tShipOdr_TRANSPORT_CD());
		}
		return size;
	}
	public int setL2L_in_tShipOdr_DIRECT_DLV_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipOdr_DIRECT_DLV_FLG == null) {
			l_in_tShipOdr_DIRECT_DLV_FLG = new ArrayList();
		} else {
			l_in_tShipOdr_DIRECT_DLV_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipOdr_DIRECT_DLV_FLG.add(((KU0060010Struct) list.get(i)).getin_tShipOdr_DIRECT_DLV_FLG());
		}
		return size;
	}
	public int setL2L_in_tShipOdr_CUST_CHRG_PSN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipOdr_CUST_CHRG_PSN_CD == null) {
			l_in_tShipOdr_CUST_CHRG_PSN_CD = new ArrayList();
		} else {
			l_in_tShipOdr_CUST_CHRG_PSN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipOdr_CUST_CHRG_PSN_CD.add(((KU0060010Struct) list.get(i)).getin_tShipOdr_CUST_CHRG_PSN_CD());
		}
		return size;
	}
	public int setL2L_in_tShipOdr_UNIT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipOdr_UNIT_CD == null) {
			l_in_tShipOdr_UNIT_CD = new ArrayList();
		} else {
			l_in_tShipOdr_UNIT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipOdr_UNIT_CD.add(((KU0060010Struct) list.get(i)).getin_tShipOdr_UNIT_CD());
		}
		return size;
	}
	public int setL2L_in_tShipOdr_SCDL_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipOdr_SCDL_DLV_DATE == null) {
			l_in_tShipOdr_SCDL_DLV_DATE = new ArrayList();
		} else {
			l_in_tShipOdr_SCDL_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipOdr_SCDL_DLV_DATE.add(((KU0060010Struct) list.get(i)).getin_tShipOdr_SCDL_DLV_DATE());
		}
		return size;
	}
	public int setL2L_in_tShipOdr_TRANSFER_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipOdr_TRANSFER_WH_CD == null) {
			l_in_tShipOdr_TRANSFER_WH_CD = new ArrayList();
		} else {
			l_in_tShipOdr_TRANSFER_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipOdr_TRANSFER_WH_CD.add(((KU0060010Struct) list.get(i)).getin_tShipOdr_TRANSFER_WH_CD());
		}
		return size;
	}
	public int setL2L_in_tShipOdr_DLV_KEY_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipOdr_DLV_KEY_NO == null) {
			l_in_tShipOdr_DLV_KEY_NO = new ArrayList();
		} else {
			l_in_tShipOdr_DLV_KEY_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipOdr_DLV_KEY_NO.add(((KU0060010Struct) list.get(i)).getin_tShipOdr_DLV_KEY_NO());
		}
		return size;
	}
	public int setL2L_in_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES == null) {
			l_in_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES = new ArrayList();
		} else {
			l_in_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES.add(((KU0060010Struct) list.get(i)).getin_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES());
		}
		return size;
	}
	public int setL2L_in_tShipOdr_SHIP_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipOdr_SHIP_ODR_NO == null) {
			l_in_tShipOdr_SHIP_ODR_NO = new ArrayList();
		} else {
			l_in_tShipOdr_SHIP_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipOdr_SHIP_ODR_NO.add(((KU0060010Struct) list.get(i)).getin_tShipOdr_SHIP_ODR_NO());
		}
		return size;
	}
	public int setL2L_in_tShipOdr_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipOdr_JOB_ODR_CD == null) {
			l_in_tShipOdr_JOB_ODR_CD = new ArrayList();
		} else {
			l_in_tShipOdr_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipOdr_JOB_ODR_CD.add(((KU0060010Struct) list.get(i)).getin_tShipOdr_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_del_tShipOdr_IN_SLIPCD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_del_tShipOdr_IN_SLIPCD == null) {
			l_del_tShipOdr_IN_SLIPCD = new ArrayList();
		} else {
			l_del_tShipOdr_IN_SLIPCD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_del_tShipOdr_IN_SLIPCD.add(((KU0060010Struct) list.get(i)).getdel_tShipOdr_IN_SLIPCD());
		}
		return size;
	}
	public int setL2L_chkisinWhCd_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_chkisinWhCd_WH_CD == null) {
			l_chkisinWhCd_WH_CD = new ArrayList();
		} else {
			l_chkisinWhCd_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_chkisinWhCd_WH_CD.add(((KU0060010Struct) list.get(i)).getchkisinWhCd_WH_CD());
		}
		return size;
	}
	public int setL2L_chkisinWhCd_WH_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_chkisinWhCd_WH_TYP == null) {
			l_chkisinWhCd_WH_TYP = new ArrayList();
		} else {
			l_chkisinWhCd_WH_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_chkisinWhCd_WH_TYP.add(((KU0060010Struct) list.get(i)).getchkisinWhCd_WH_TYP());
		}
		return size;
	}
	public int setL2L_chkis_IN_WHCD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_chkis_IN_WHCD == null) {
			l_chkis_IN_WHCD = new ArrayList();
		} else {
			l_chkis_IN_WHCD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_chkis_IN_WHCD.add(((KU0060010Struct) list.get(i)).getchkis_IN_WHCD());
		}
		return size;
	}
	public int setL2L_chkisWhCd_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_chkisWhCd_WH_CD == null) {
			l_chkisWhCd_WH_CD = new ArrayList();
		} else {
			l_chkisWhCd_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_chkisWhCd_WH_CD.add(((KU0060010Struct) list.get(i)).getchkisWhCd_WH_CD());
		}
		return size;
	}
	public int setL2L_chkisWhCd_WH_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_chkisWhCd_WH_TYP == null) {
			l_chkisWhCd_WH_TYP = new ArrayList();
		} else {
			l_chkisWhCd_WH_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_chkisWhCd_WH_TYP.add(((KU0060010Struct) list.get(i)).getchkisWhCd_WH_TYP());
		}
		return size;
	}
	public int setL2L_chkisWhCd_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_chkisWhCd_ITEM_CD == null) {
			l_chkisWhCd_ITEM_CD = new ArrayList();
		} else {
			l_chkisWhCd_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_chkisWhCd_ITEM_CD.add(((KU0060010Struct) list.get(i)).getchkisWhCd_ITEM_CD());
		}
		return size;
	}
	public int setL2L_chkisWhCd_PBL_SHIP_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_chkisWhCd_PBL_SHIP_QTY == null) {
			l_chkisWhCd_PBL_SHIP_QTY = new ArrayList();
		} else {
			l_chkisWhCd_PBL_SHIP_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_chkisWhCd_PBL_SHIP_QTY.add(((KU0060010Struct) list.get(i)).getchkisWhCd_PBL_SHIP_QTY());
		}
		return size;
	}
	public int setL2L_chkisWhCd_IN_ITEMCD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_chkisWhCd_IN_ITEMCD == null) {
			l_chkisWhCd_IN_ITEMCD = new ArrayList();
		} else {
			l_chkisWhCd_IN_ITEMCD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_chkisWhCd_IN_ITEMCD.add(((KU0060010Struct) list.get(i)).getchkisWhCd_IN_ITEMCD());
		}
		return size;
	}
	public int setL2L_chkisWhCd_IN_WHCD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_chkisWhCd_IN_WHCD == null) {
			l_chkisWhCd_IN_WHCD = new ArrayList();
		} else {
			l_chkisWhCd_IN_WHCD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_chkisWhCd_IN_WHCD.add(((KU0060010Struct) list.get(i)).getchkisWhCd_IN_WHCD());
		}
		return size;
	}
	public int setL2L_tOdr_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_ODR_NO == null) {
			l_tOdr_ODR_NO = new ArrayList();
		} else {
			l_tOdr_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_ODR_NO.add(((KU0060010Struct) list.get(i)).gettOdr_ODR_NO());
		}
		return size;
	}
	public int setL2L_tOdr_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_ODR_TYP == null) {
			l_tOdr_ODR_TYP = new ArrayList();
		} else {
			l_tOdr_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_ODR_TYP.add(((KU0060010Struct) list.get(i)).gettOdr_ODR_TYP());
		}
		return size;
	}
	public int setL2L_tOdr_ODR_CTL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_ODR_CTL_NO == null) {
			l_tOdr_ODR_CTL_NO = new ArrayList();
		} else {
			l_tOdr_ODR_CTL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_ODR_CTL_NO.add(((KU0060010Struct) list.get(i)).gettOdr_ODR_CTL_NO());
		}
		return size;
	}
	public int setL2L_tOdr_CUST_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_CUST_ODR_NO == null) {
			l_tOdr_CUST_ODR_NO = new ArrayList();
		} else {
			l_tOdr_CUST_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_CUST_ODR_NO.add(((KU0060010Struct) list.get(i)).gettOdr_CUST_ODR_NO());
		}
		return size;
	}
	public int setL2L_tOdr_CUST_CHRG_ORG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_CUST_CHRG_ORG_CD == null) {
			l_tOdr_CUST_CHRG_ORG_CD = new ArrayList();
		} else {
			l_tOdr_CUST_CHRG_ORG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_CUST_CHRG_ORG_CD.add(((KU0060010Struct) list.get(i)).gettOdr_CUST_CHRG_ORG_CD());
		}
		return size;
	}
	public int setL2L_tOdr_CUST_CHRG_PSN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_CUST_CHRG_PSN_CD == null) {
			l_tOdr_CUST_CHRG_PSN_CD = new ArrayList();
		} else {
			l_tOdr_CUST_CHRG_PSN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_CUST_CHRG_PSN_CD.add(((KU0060010Struct) list.get(i)).gettOdr_CUST_CHRG_PSN_CD());
		}
		return size;
	}
	public int setL2L_tOdr_ODR_ACPT_ORG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_ODR_ACPT_ORG_CD == null) {
			l_tOdr_ODR_ACPT_ORG_CD = new ArrayList();
		} else {
			l_tOdr_ODR_ACPT_ORG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_ODR_ACPT_ORG_CD.add(((KU0060010Struct) list.get(i)).gettOdr_ODR_ACPT_ORG_CD());
		}
		return size;
	}
	public int setL2L_tOdr_ODR_ACPT_PSN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_ODR_ACPT_PSN_CD == null) {
			l_tOdr_ODR_ACPT_PSN_CD = new ArrayList();
		} else {
			l_tOdr_ODR_ACPT_PSN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_ODR_ACPT_PSN_CD.add(((KU0060010Struct) list.get(i)).gettOdr_ODR_ACPT_PSN_CD());
		}
		return size;
	}
	public int setL2L_tOdr_CURRNCY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_CURRNCY_CD == null) {
			l_tOdr_CURRNCY_CD = new ArrayList();
		} else {
			l_tOdr_CURRNCY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_CURRNCY_CD.add(((KU0060010Struct) list.get(i)).gettOdr_CURRNCY_CD());
		}
		return size;
	}
	public int setL2L_tOdr_EXCH_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_EXCH_TYP == null) {
			l_tOdr_EXCH_TYP = new ArrayList();
		} else {
			l_tOdr_EXCH_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_EXCH_TYP.add(((KU0060010Struct) list.get(i)).gettOdr_EXCH_TYP());
		}
		return size;
	}
	public int setL2L_tOdr_DLV_LOC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_DLV_LOC_CD == null) {
			l_tOdr_DLV_LOC_CD = new ArrayList();
		} else {
			l_tOdr_DLV_LOC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_DLV_LOC_CD.add(((KU0060010Struct) list.get(i)).gettOdr_DLV_LOC_CD());
		}
		return size;
	}
	public int setL2L_tOdr_DLV_LOC_CD_EIAJ(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_DLV_LOC_CD_EIAJ == null) {
			l_tOdr_DLV_LOC_CD_EIAJ = new ArrayList();
		} else {
			l_tOdr_DLV_LOC_CD_EIAJ.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_DLV_LOC_CD_EIAJ.add(((KU0060010Struct) list.get(i)).gettOdr_DLV_LOC_CD_EIAJ());
		}
		return size;
	}
	public int setL2L_tOdr_DLV_LOC_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_DLV_LOC_NAME == null) {
			l_tOdr_DLV_LOC_NAME = new ArrayList();
		} else {
			l_tOdr_DLV_LOC_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_DLV_LOC_NAME.add(((KU0060010Struct) list.get(i)).gettOdr_DLV_LOC_NAME());
		}
		return size;
	}
	public int setL2L_tOdr_DLV_LOC_NAME_KANJI(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_DLV_LOC_NAME_KANJI == null) {
			l_tOdr_DLV_LOC_NAME_KANJI = new ArrayList();
		} else {
			l_tOdr_DLV_LOC_NAME_KANJI.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_DLV_LOC_NAME_KANJI.add(((KU0060010Struct) list.get(i)).gettOdr_DLV_LOC_NAME_KANJI());
		}
		return size;
	}
	public int setL2L_tOdr_PRD_ODR_PLACE_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_PRD_ODR_PLACE_CD == null) {
			l_tOdr_PRD_ODR_PLACE_CD = new ArrayList();
		} else {
			l_tOdr_PRD_ODR_PLACE_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_PRD_ODR_PLACE_CD.add(((KU0060010Struct) list.get(i)).gettOdr_PRD_ODR_PLACE_CD());
		}
		return size;
	}
	public int setL2L_tOdr_ODR_UNIT_PRICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_ODR_UNIT_PRICE == null) {
			l_tOdr_ODR_UNIT_PRICE = new ArrayList();
		} else {
			l_tOdr_ODR_UNIT_PRICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_ODR_UNIT_PRICE.add(((KU0060010Struct) list.get(i)).gettOdr_ODR_UNIT_PRICE());
		}
		return size;
	}
	public int setL2L_tOdr_SPCL_PRICE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_SPCL_PRICE_TYP == null) {
			l_tOdr_SPCL_PRICE_TYP = new ArrayList();
		} else {
			l_tOdr_SPCL_PRICE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_SPCL_PRICE_TYP.add(((KU0060010Struct) list.get(i)).gettOdr_SPCL_PRICE_TYP());
		}
		return size;
	}
	public int setL2L_tOdr_PART_DLV_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_PART_DLV_COUNT == null) {
			l_tOdr_PART_DLV_COUNT = new ArrayList();
		} else {
			l_tOdr_PART_DLV_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_PART_DLV_COUNT.add(((KU0060010Struct) list.get(i)).gettOdr_PART_DLV_COUNT());
		}
		return size;
	}
	public int setL2L_tOdr_DEPO_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_DEPO_TYP == null) {
			l_tOdr_DEPO_TYP = new ArrayList();
		} else {
			l_tOdr_DEPO_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_DEPO_TYP.add(((KU0060010Struct) list.get(i)).gettOdr_DEPO_TYP());
		}
		return size;
	}
	public int setL2L_tOdr_DESINATED_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_DESINATED_DLV_DATE == null) {
			l_tOdr_DESINATED_DLV_DATE = new ArrayList();
		} else {
			l_tOdr_DESINATED_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_DESINATED_DLV_DATE.add(((KU0060010Struct) list.get(i)).gettOdr_DESINATED_DLV_DATE());
		}
		return size;
	}
	public int setL2L_tOdr_STD_DESINATED_RCV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_STD_DESINATED_RCV_DATE == null) {
			l_tOdr_STD_DESINATED_RCV_DATE = new ArrayList();
		} else {
			l_tOdr_STD_DESINATED_RCV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_STD_DESINATED_RCV_DATE.add(((KU0060010Struct) list.get(i)).gettOdr_STD_DESINATED_RCV_DATE());
		}
		return size;
	}
	public int setL2L_tOdr_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_ODR_QTY == null) {
			l_tOdr_ODR_QTY = new ArrayList();
		} else {
			l_tOdr_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_ODR_QTY.add(((KU0060010Struct) list.get(i)).gettOdr_ODR_QTY());
		}
		return size;
	}
	public int setL2L_tOdr_REMAIN_UNCONFIRM_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_REMAIN_UNCONFIRM_ODR_QTY == null) {
			l_tOdr_REMAIN_UNCONFIRM_ODR_QTY = new ArrayList();
		} else {
			l_tOdr_REMAIN_UNCONFIRM_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_REMAIN_UNCONFIRM_ODR_QTY.add(((KU0060010Struct) list.get(i)).gettOdr_REMAIN_UNCONFIRM_ODR_QTY());
		}
		return size;
	}
	public int setL2L_tOdr_CANCELED_UNCONFIRM_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_CANCELED_UNCONFIRM_ODR_QTY == null) {
			l_tOdr_CANCELED_UNCONFIRM_ODR_QTY = new ArrayList();
		} else {
			l_tOdr_CANCELED_UNCONFIRM_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_CANCELED_UNCONFIRM_ODR_QTY.add(((KU0060010Struct) list.get(i)).gettOdr_CANCELED_UNCONFIRM_ODR_QTY());
		}
		return size;
	}
	public int setL2L_tOdr_UNIT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_UNIT_CD == null) {
			l_tOdr_UNIT_CD = new ArrayList();
		} else {
			l_tOdr_UNIT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_UNIT_CD.add(((KU0060010Struct) list.get(i)).gettOdr_UNIT_CD());
		}
		return size;
	}
	public int setL2L_tOdr_UNCONFIRM_ODR_BALANCE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_UNCONFIRM_ODR_BALANCE == null) {
			l_tOdr_UNCONFIRM_ODR_BALANCE = new ArrayList();
		} else {
			l_tOdr_UNCONFIRM_ODR_BALANCE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_UNCONFIRM_ODR_BALANCE.add(((KU0060010Struct) list.get(i)).gettOdr_UNCONFIRM_ODR_BALANCE());
		}
		return size;
	}
	public int setL2L_tOdr_ODR_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_ODR_AMOUNT == null) {
			l_tOdr_ODR_AMOUNT = new ArrayList();
		} else {
			l_tOdr_ODR_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_ODR_AMOUNT.add(((KU0060010Struct) list.get(i)).gettOdr_ODR_AMOUNT());
		}
		return size;
	}
	public int setL2L_tOdr_ODR_AMOUNT_EXCH_RATES(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_ODR_AMOUNT_EXCH_RATES == null) {
			l_tOdr_ODR_AMOUNT_EXCH_RATES = new ArrayList();
		} else {
			l_tOdr_ODR_AMOUNT_EXCH_RATES.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_ODR_AMOUNT_EXCH_RATES.add(((KU0060010Struct) list.get(i)).gettOdr_ODR_AMOUNT_EXCH_RATES());
		}
		return size;
	}
	public int setL2L_tOdr_TOTAL_SHIP_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_TOTAL_SHIP_QTY == null) {
			l_tOdr_TOTAL_SHIP_QTY = new ArrayList();
		} else {
			l_tOdr_TOTAL_SHIP_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_TOTAL_SHIP_QTY.add(((KU0060010Struct) list.get(i)).gettOdr_TOTAL_SHIP_QTY());
		}
		return size;
	}
	public int setL2L_tOdr_SHIP_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_SHIP_AMOUNT == null) {
			l_tOdr_SHIP_AMOUNT = new ArrayList();
		} else {
			l_tOdr_SHIP_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_SHIP_AMOUNT.add(((KU0060010Struct) list.get(i)).gettOdr_SHIP_AMOUNT());
		}
		return size;
	}
	public int setL2L_tOdr_SHIP_AMOUNT_EXCH_RATES(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_SHIP_AMOUNT_EXCH_RATES == null) {
			l_tOdr_SHIP_AMOUNT_EXCH_RATES = new ArrayList();
		} else {
			l_tOdr_SHIP_AMOUNT_EXCH_RATES.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_SHIP_AMOUNT_EXCH_RATES.add(((KU0060010Struct) list.get(i)).gettOdr_SHIP_AMOUNT_EXCH_RATES());
		}
		return size;
	}
	public int setL2L_tOdr_RETURN_PRICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_RETURN_PRICE == null) {
			l_tOdr_RETURN_PRICE = new ArrayList();
		} else {
			l_tOdr_RETURN_PRICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_RETURN_PRICE.add(((KU0060010Struct) list.get(i)).gettOdr_RETURN_PRICE());
		}
		return size;
	}
	public int setL2L_tOdr_RETURN_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_RETURN_QTY == null) {
			l_tOdr_RETURN_QTY = new ArrayList();
		} else {
			l_tOdr_RETURN_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_RETURN_QTY.add(((KU0060010Struct) list.get(i)).gettOdr_RETURN_QTY());
		}
		return size;
	}
	public int setL2L_tOdr_RETURN_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_RETURN_AMOUNT == null) {
			l_tOdr_RETURN_AMOUNT = new ArrayList();
		} else {
			l_tOdr_RETURN_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_RETURN_AMOUNT.add(((KU0060010Struct) list.get(i)).gettOdr_RETURN_AMOUNT());
		}
		return size;
	}
	public int setL2L_tOdr_RETURN_AMOUNT_EXCH_RATES(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_RETURN_AMOUNT_EXCH_RATES == null) {
			l_tOdr_RETURN_AMOUNT_EXCH_RATES = new ArrayList();
		} else {
			l_tOdr_RETURN_AMOUNT_EXCH_RATES.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_RETURN_AMOUNT_EXCH_RATES.add(((KU0060010Struct) list.get(i)).gettOdr_RETURN_AMOUNT_EXCH_RATES());
		}
		return size;
	}
	public int setL2L_tOdr_ODR_CMPLT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_ODR_CMPLT_FLG == null) {
			l_tOdr_ODR_CMPLT_FLG = new ArrayList();
		} else {
			l_tOdr_ODR_CMPLT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_ODR_CMPLT_FLG.add(((KU0060010Struct) list.get(i)).gettOdr_ODR_CMPLT_FLG());
		}
		return size;
	}
	public int setL2L_tOdr_ODR_CMPLT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_ODR_CMPLT_DATE == null) {
			l_tOdr_ODR_CMPLT_DATE = new ArrayList();
		} else {
			l_tOdr_ODR_CMPLT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_ODR_CMPLT_DATE.add(((KU0060010Struct) list.get(i)).gettOdr_ODR_CMPLT_DATE());
		}
		return size;
	}
	public int setL2L_tOdr_CUS_DLV_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_CUS_DLV_CD == null) {
			l_tOdr_CUS_DLV_CD = new ArrayList();
		} else {
			l_tOdr_CUS_DLV_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_CUS_DLV_CD.add(((KU0060010Struct) list.get(i)).gettOdr_CUS_DLV_CD());
		}
		return size;
	}
	public int setL2L_tOdr_CUS_DLV_KEY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_CUS_DLV_KEY_CD == null) {
			l_tOdr_CUS_DLV_KEY_CD = new ArrayList();
		} else {
			l_tOdr_CUS_DLV_KEY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_CUS_DLV_KEY_CD.add(((KU0060010Struct) list.get(i)).gettOdr_CUS_DLV_KEY_CD());
		}
		return size;
	}
	public int setL2L_tOdr_PART_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_PART_NAME == null) {
			l_tOdr_PART_NAME = new ArrayList();
		} else {
			l_tOdr_PART_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_PART_NAME.add(((KU0060010Struct) list.get(i)).gettOdr_PART_NAME());
		}
		return size;
	}
	public int setL2L_tOdr_PKG_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_PKG_UNIT == null) {
			l_tOdr_PKG_UNIT = new ArrayList();
		} else {
			l_tOdr_PKG_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_PKG_UNIT.add(((KU0060010Struct) list.get(i)).gettOdr_PKG_UNIT());
		}
		return size;
	}
	public int setL2L_tOdr_SLIP_PRICE_PRINT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_SLIP_PRICE_PRINT_TYP == null) {
			l_tOdr_SLIP_PRICE_PRINT_TYP = new ArrayList();
		} else {
			l_tOdr_SLIP_PRICE_PRINT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_SLIP_PRICE_PRINT_TYP.add(((KU0060010Struct) list.get(i)).gettOdr_SLIP_PRICE_PRINT_TYP());
		}
		return size;
	}
	public int setL2L_tOdr_INSPC_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_INSPC_TYP == null) {
			l_tOdr_INSPC_TYP = new ArrayList();
		} else {
			l_tOdr_INSPC_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_INSPC_TYP.add(((KU0060010Struct) list.get(i)).gettOdr_INSPC_TYP());
		}
		return size;
	}
	public int setL2L_tOdr_CLIENT_REMARK(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_CLIENT_REMARK == null) {
			l_tOdr_CLIENT_REMARK = new ArrayList();
		} else {
			l_tOdr_CLIENT_REMARK.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_CLIENT_REMARK.add(((KU0060010Struct) list.get(i)).gettOdr_CLIENT_REMARK());
		}
		return size;
	}
	public int setL2L_tOdr_CLIENT_REMARK_KANJI(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_CLIENT_REMARK_KANJI == null) {
			l_tOdr_CLIENT_REMARK_KANJI = new ArrayList();
		} else {
			l_tOdr_CLIENT_REMARK_KANJI.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_CLIENT_REMARK_KANJI.add(((KU0060010Struct) list.get(i)).gettOdr_CLIENT_REMARK_KANJI());
		}
		return size;
	}
	public int setL2L_tOdr_CLIENT_BARCODE_INF(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_CLIENT_BARCODE_INF == null) {
			l_tOdr_CLIENT_BARCODE_INF = new ArrayList();
		} else {
			l_tOdr_CLIENT_BARCODE_INF.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_CLIENT_BARCODE_INF.add(((KU0060010Struct) list.get(i)).gettOdr_CLIENT_BARCODE_INF());
		}
		return size;
	}
	public int setL2L_tOdr_TRANSPORT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_TRANSPORT_CD == null) {
			l_tOdr_TRANSPORT_CD = new ArrayList();
		} else {
			l_tOdr_TRANSPORT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_TRANSPORT_CD.add(((KU0060010Struct) list.get(i)).gettOdr_TRANSPORT_CD());
		}
		return size;
	}
	public int setL2L_tOdr_TRANSPORT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_TRANSPORT_TYP == null) {
			l_tOdr_TRANSPORT_TYP = new ArrayList();
		} else {
			l_tOdr_TRANSPORT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_TRANSPORT_TYP.add(((KU0060010Struct) list.get(i)).gettOdr_TRANSPORT_TYP());
		}
		return size;
	}
	public int setL2L_tOdr_TAX_APPLY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_TAX_APPLY_TYP == null) {
			l_tOdr_TAX_APPLY_TYP = new ArrayList();
		} else {
			l_tOdr_TAX_APPLY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_TAX_APPLY_TYP.add(((KU0060010Struct) list.get(i)).gettOdr_TAX_APPLY_TYP());
		}
		return size;
	}
	public int setL2L_tOdr_TAX_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_TAX_CD == null) {
			l_tOdr_TAX_CD = new ArrayList();
		} else {
			l_tOdr_TAX_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_TAX_CD.add(((KU0060010Struct) list.get(i)).gettOdr_TAX_CD());
		}
		return size;
	}
	public int setL2L_tOdr_TAX_CALC_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_TAX_CALC_TYP == null) {
			l_tOdr_TAX_CALC_TYP = new ArrayList();
		} else {
			l_tOdr_TAX_CALC_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_TAX_CALC_TYP.add(((KU0060010Struct) list.get(i)).gettOdr_TAX_CALC_TYP());
		}
		return size;
	}
	public int setL2L_tOdr_REMARKS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_REMARKS == null) {
			l_tOdr_REMARKS = new ArrayList();
		} else {
			l_tOdr_REMARKS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_REMARKS.add(((KU0060010Struct) list.get(i)).gettOdr_REMARKS());
		}
		return size;
	}
	public int setL2L_tOdr_ODR_ACPT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_ODR_ACPT_DATE == null) {
			l_tOdr_ODR_ACPT_DATE = new ArrayList();
		} else {
			l_tOdr_ODR_ACPT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_ODR_ACPT_DATE.add(((KU0060010Struct) list.get(i)).gettOdr_ODR_ACPT_DATE());
		}
		return size;
	}
	public int setL2L_tOdr_SHIP_PLAN_REMAIN_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_SHIP_PLAN_REMAIN_QTY == null) {
			l_tOdr_SHIP_PLAN_REMAIN_QTY = new ArrayList();
		} else {
			l_tOdr_SHIP_PLAN_REMAIN_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_SHIP_PLAN_REMAIN_QTY.add(((KU0060010Struct) list.get(i)).gettOdr_SHIP_PLAN_REMAIN_QTY());
		}
		return size;
	}
	public int setL2L_tOdr_SHIP_PLAN_CMPLT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_SHIP_PLAN_CMPLT_FLG == null) {
			l_tOdr_SHIP_PLAN_CMPLT_FLG = new ArrayList();
		} else {
			l_tOdr_SHIP_PLAN_CMPLT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_SHIP_PLAN_CMPLT_FLG.add(((KU0060010Struct) list.get(i)).gettOdr_SHIP_PLAN_CMPLT_FLG());
		}
		return size;
	}
	public int setL2L_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG == null) {
			l_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG = new ArrayList();
		} else {
			l_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG.add(((KU0060010Struct) list.get(i)).gettOdr_UNCONFIRMED_ODR_EFF_OVR_FLG());
		}
		return size;
	}
	public int setL2L_tOdr_PARTIAL_SHIP_INST_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_PARTIAL_SHIP_INST_FLG == null) {
			l_tOdr_PARTIAL_SHIP_INST_FLG = new ArrayList();
		} else {
			l_tOdr_PARTIAL_SHIP_INST_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_PARTIAL_SHIP_INST_FLG.add(((KU0060010Struct) list.get(i)).gettOdr_PARTIAL_SHIP_INST_FLG());
		}
		return size;
	}
	public int setL2L_tOdr_IF_CTL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_IF_CTL_NO == null) {
			l_tOdr_IF_CTL_NO = new ArrayList();
		} else {
			l_tOdr_IF_CTL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_IF_CTL_NO.add(((KU0060010Struct) list.get(i)).gettOdr_IF_CTL_NO());
		}
		return size;
	}
	public int setL2L_tOdr_ENTRY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_ENTRY_TYP == null) {
			l_tOdr_ENTRY_TYP = new ArrayList();
		} else {
			l_tOdr_ENTRY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_ENTRY_TYP.add(((KU0060010Struct) list.get(i)).gettOdr_ENTRY_TYP());
		}
		return size;
	}
	public int setL2L_tOdr_BUYER_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_BUYER_NAME == null) {
			l_tOdr_BUYER_NAME = new ArrayList();
		} else {
			l_tOdr_BUYER_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_BUYER_NAME.add(((KU0060010Struct) list.get(i)).gettOdr_BUYER_NAME());
		}
		return size;
	}
	public int setL2L_tOdr_PUCH_ODR_QTY_TOTAL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_PUCH_ODR_QTY_TOTAL == null) {
			l_tOdr_PUCH_ODR_QTY_TOTAL = new ArrayList();
		} else {
			l_tOdr_PUCH_ODR_QTY_TOTAL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_PUCH_ODR_QTY_TOTAL.add(((KU0060010Struct) list.get(i)).gettOdr_PUCH_ODR_QTY_TOTAL());
		}
		return size;
	}
	public int setL2L_tOdr_UNIT_CD_ORG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_UNIT_CD_ORG == null) {
			l_tOdr_UNIT_CD_ORG = new ArrayList();
		} else {
			l_tOdr_UNIT_CD_ORG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_UNIT_CD_ORG.add(((KU0060010Struct) list.get(i)).gettOdr_UNIT_CD_ORG());
		}
		return size;
	}
	public int setL2L_tOdr_SHIP_CNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_SHIP_CNT == null) {
			l_tOdr_SHIP_CNT = new ArrayList();
		} else {
			l_tOdr_SHIP_CNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_SHIP_CNT.add(((KU0060010Struct) list.get(i)).gettOdr_SHIP_CNT());
		}
		return size;
	}
	public int setL2L_tOdr_IN_ODRNO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_IN_ODRNO == null) {
			l_tOdr_IN_ODRNO = new ArrayList();
		} else {
			l_tOdr_IN_ODRNO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_IN_ODRNO.add(((KU0060010Struct) list.get(i)).gettOdr_IN_ODRNO());
		}
		return size;
	}
	public int setL2L_uptOdr_PART_DLV_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_uptOdr_PART_DLV_COUNT == null) {
			l_uptOdr_PART_DLV_COUNT = new ArrayList();
		} else {
			l_uptOdr_PART_DLV_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_uptOdr_PART_DLV_COUNT.add(((KU0060010Struct) list.get(i)).getuptOdr_PART_DLV_COUNT());
		}
		return size;
	}
	public int setL2L_uptOdr_IN_ODRNO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_uptOdr_IN_ODRNO == null) {
			l_uptOdr_IN_ODRNO = new ArrayList();
		} else {
			l_uptOdr_IN_ODRNO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_uptOdr_IN_ODRNO.add(((KU0060010Struct) list.get(i)).getuptOdr_IN_ODRNO());
		}
		return size;
	}
	public int setL2L_tOdrCtl_ODR_CTL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdrCtl_ODR_CTL_NO == null) {
			l_tOdrCtl_ODR_CTL_NO = new ArrayList();
		} else {
			l_tOdrCtl_ODR_CTL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdrCtl_ODR_CTL_NO.add(((KU0060010Struct) list.get(i)).gettOdrCtl_ODR_CTL_NO());
		}
		return size;
	}
	public int setL2L_tOdrCtl_CUST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdrCtl_CUST_CD == null) {
			l_tOdrCtl_CUST_CD = new ArrayList();
		} else {
			l_tOdrCtl_CUST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdrCtl_CUST_CD.add(((KU0060010Struct) list.get(i)).gettOdrCtl_CUST_CD());
		}
		return size;
	}
	public int setL2L_tOdrCtl_CUST_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdrCtl_CUST_ITEM_CD == null) {
			l_tOdrCtl_CUST_ITEM_CD = new ArrayList();
		} else {
			l_tOdrCtl_CUST_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdrCtl_CUST_ITEM_CD.add(((KU0060010Struct) list.get(i)).gettOdrCtl_CUST_ITEM_CD());
		}
		return size;
	}
	public int setL2L_tOdrCtl_CUST_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdrCtl_CUST_ITEM_NAME == null) {
			l_tOdrCtl_CUST_ITEM_NAME = new ArrayList();
		} else {
			l_tOdrCtl_CUST_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdrCtl_CUST_ITEM_NAME.add(((KU0060010Struct) list.get(i)).gettOdrCtl_CUST_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_tOdrCtl_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdrCtl_ITEM_CD == null) {
			l_tOdrCtl_ITEM_CD = new ArrayList();
		} else {
			l_tOdrCtl_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdrCtl_ITEM_CD.add(((KU0060010Struct) list.get(i)).gettOdrCtl_ITEM_CD());
		}
		return size;
	}
	public int setL2L_tOdrCtl_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdrCtl_ITEM_NAME == null) {
			l_tOdrCtl_ITEM_NAME = new ArrayList();
		} else {
			l_tOdrCtl_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdrCtl_ITEM_NAME.add(((KU0060010Struct) list.get(i)).gettOdrCtl_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_tOdrCtl_IN_ODRCTLNO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdrCtl_IN_ODRCTLNO == null) {
			l_tOdrCtl_IN_ODRCTLNO = new ArrayList();
		} else {
			l_tOdrCtl_IN_ODRCTLNO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdrCtl_IN_ODRCTLNO.add(((KU0060010Struct) list.get(i)).gettOdrCtl_IN_ODRCTLNO());
		}
		return size;
	}
	public int setL2L_mItem_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mItem_ITEM_CD == null) {
			l_mItem_ITEM_CD = new ArrayList();
		} else {
			l_mItem_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mItem_ITEM_CD.add(((KU0060010Struct) list.get(i)).getmItem_ITEM_CD());
		}
		return size;
	}
	public int setL2L_mItem_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mItem_ITEM_NAME == null) {
			l_mItem_ITEM_NAME = new ArrayList();
		} else {
			l_mItem_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mItem_ITEM_NAME.add(((KU0060010Struct) list.get(i)).getmItem_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_mItem_PRODUCT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mItem_PRODUCT_TYP == null) {
			l_mItem_PRODUCT_TYP = new ArrayList();
		} else {
			l_mItem_PRODUCT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mItem_PRODUCT_TYP.add(((KU0060010Struct) list.get(i)).getmItem_PRODUCT_TYP());
		}
		return size;
	}
	public int setL2L_mItem_MRP_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mItem_MRP_ODR_TYP == null) {
			l_mItem_MRP_ODR_TYP = new ArrayList();
		} else {
			l_mItem_MRP_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mItem_MRP_ODR_TYP.add(((KU0060010Struct) list.get(i)).getmItem_MRP_ODR_TYP());
		}
		return size;
	}
	public int setL2L_mItem_DRAW_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mItem_DRAW_CD == null) {
			l_mItem_DRAW_CD = new ArrayList();
		} else {
			l_mItem_DRAW_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mItem_DRAW_CD.add(((KU0060010Struct) list.get(i)).getmItem_DRAW_CD());
		}
		return size;
	}
	public int setL2L_mItem_SPEC(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mItem_SPEC == null) {
			l_mItem_SPEC = new ArrayList();
		} else {
			l_mItem_SPEC.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mItem_SPEC.add(((KU0060010Struct) list.get(i)).getmItem_SPEC());
		}
		return size;
	}
	public int setL2L_mItem_HIGH_LEVEL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mItem_HIGH_LEVEL_NO == null) {
			l_mItem_HIGH_LEVEL_NO = new ArrayList();
		} else {
			l_mItem_HIGH_LEVEL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mItem_HIGH_LEVEL_NO.add(((KU0060010Struct) list.get(i)).getmItem_HIGH_LEVEL_NO());
		}
		return size;
	}
	public int setL2L_mItem_OUTSIDE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mItem_OUTSIDE_TYP == null) {
			l_mItem_OUTSIDE_TYP = new ArrayList();
		} else {
			l_mItem_OUTSIDE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mItem_OUTSIDE_TYP.add(((KU0060010Struct) list.get(i)).getmItem_OUTSIDE_TYP());
		}
		return size;
	}
	public int setL2L_mItem_STOCK_UNIT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mItem_STOCK_UNIT_FLG == null) {
			l_mItem_STOCK_UNIT_FLG = new ArrayList();
		} else {
			l_mItem_STOCK_UNIT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mItem_STOCK_UNIT_FLG.add(((KU0060010Struct) list.get(i)).getmItem_STOCK_UNIT_FLG());
		}
		return size;
	}
	public int setL2L_mItem_STOCK_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mItem_STOCK_UNIT == null) {
			l_mItem_STOCK_UNIT = new ArrayList();
		} else {
			l_mItem_STOCK_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mItem_STOCK_UNIT.add(((KU0060010Struct) list.get(i)).getmItem_STOCK_UNIT());
		}
		return size;
	}
	public int setL2L_mItem_PKG_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mItem_PKG_UNIT == null) {
			l_mItem_PKG_UNIT = new ArrayList();
		} else {
			l_mItem_PKG_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mItem_PKG_UNIT.add(((KU0060010Struct) list.get(i)).getmItem_PKG_UNIT());
		}
		return size;
	}
	public int setL2L_mItem_PKG_UNIT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mItem_PKG_UNIT_QTY == null) {
			l_mItem_PKG_UNIT_QTY = new ArrayList();
		} else {
			l_mItem_PKG_UNIT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mItem_PKG_UNIT_QTY.add(((KU0060010Struct) list.get(i)).getmItem_PKG_UNIT_QTY());
		}
		return size;
	}
	public int setL2L_mItem_UNIT_QTY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mItem_UNIT_QTY_TYP == null) {
			l_mItem_UNIT_QTY_TYP = new ArrayList();
		} else {
			l_mItem_UNIT_QTY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mItem_UNIT_QTY_TYP.add(((KU0060010Struct) list.get(i)).getmItem_UNIT_QTY_TYP());
		}
		return size;
	}
	public int setL2L_mItem_ODR_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mItem_ODR_LT == null) {
			l_mItem_ODR_LT = new ArrayList();
		} else {
			l_mItem_ODR_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mItem_ODR_LT.add(((KU0060010Struct) list.get(i)).getmItem_ODR_LT());
		}
		return size;
	}
	public int setL2L_mItem_FIXED_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mItem_FIXED_LT == null) {
			l_mItem_FIXED_LT = new ArrayList();
		} else {
			l_mItem_FIXED_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mItem_FIXED_LT.add(((KU0060010Struct) list.get(i)).getmItem_FIXED_LT());
		}
		return size;
	}
	public int setL2L_mItem_PROP_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mItem_PROP_LT == null) {
			l_mItem_PROP_LT = new ArrayList();
		} else {
			l_mItem_PROP_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mItem_PROP_LT.add(((KU0060010Struct) list.get(i)).getmItem_PROP_LT());
		}
		return size;
	}
	public int setL2L_mItem_SAFETY_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mItem_SAFETY_LT == null) {
			l_mItem_SAFETY_LT = new ArrayList();
		} else {
			l_mItem_SAFETY_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mItem_SAFETY_LT.add(((KU0060010Struct) list.get(i)).getmItem_SAFETY_LT());
		}
		return size;
	}
	public int setL2L_mItem_ISSUE_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mItem_ISSUE_LT == null) {
			l_mItem_ISSUE_LT = new ArrayList();
		} else {
			l_mItem_ISSUE_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mItem_ISSUE_LT.add(((KU0060010Struct) list.get(i)).getmItem_ISSUE_LT());
		}
		return size;
	}
	public int setL2L_mItem_PROP_LOT_SIZE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mItem_PROP_LOT_SIZE == null) {
			l_mItem_PROP_LOT_SIZE = new ArrayList();
		} else {
			l_mItem_PROP_LOT_SIZE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mItem_PROP_LOT_SIZE.add(((KU0060010Struct) list.get(i)).getmItem_PROP_LOT_SIZE());
		}
		return size;
	}
	public int setL2L_mItem_ITEM_SPOIL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mItem_ITEM_SPOIL == null) {
			l_mItem_ITEM_SPOIL = new ArrayList();
		} else {
			l_mItem_ITEM_SPOIL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mItem_ITEM_SPOIL.add(((KU0060010Struct) list.get(i)).getmItem_ITEM_SPOIL());
		}
		return size;
	}
	public int setL2L_mItem_SAFETY_STOCK(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mItem_SAFETY_STOCK == null) {
			l_mItem_SAFETY_STOCK = new ArrayList();
		} else {
			l_mItem_SAFETY_STOCK.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mItem_SAFETY_STOCK.add(((KU0060010Struct) list.get(i)).getmItem_SAFETY_STOCK());
		}
		return size;
	}
	public int setL2L_mItem_LOT_SIZING_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mItem_LOT_SIZING_TYP == null) {
			l_mItem_LOT_SIZING_TYP = new ArrayList();
		} else {
			l_mItem_LOT_SIZING_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mItem_LOT_SIZING_TYP.add(((KU0060010Struct) list.get(i)).getmItem_LOT_SIZING_TYP());
		}
		return size;
	}
	public int setL2L_mItem_MAX_PERIOD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mItem_MAX_PERIOD == null) {
			l_mItem_MAX_PERIOD = new ArrayList();
		} else {
			l_mItem_MAX_PERIOD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mItem_MAX_PERIOD.add(((KU0060010Struct) list.get(i)).getmItem_MAX_PERIOD());
		}
		return size;
	}
	public int setL2L_mItem_MAX_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mItem_MAX_ODR_QTY == null) {
			l_mItem_MAX_ODR_QTY = new ArrayList();
		} else {
			l_mItem_MAX_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mItem_MAX_ODR_QTY.add(((KU0060010Struct) list.get(i)).getmItem_MAX_ODR_QTY());
		}
		return size;
	}
	public int setL2L_mItem_ODR_POINT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mItem_ODR_POINT == null) {
			l_mItem_ODR_POINT = new ArrayList();
		} else {
			l_mItem_ODR_POINT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mItem_ODR_POINT.add(((KU0060010Struct) list.get(i)).getmItem_ODR_POINT());
		}
		return size;
	}
	public int setL2L_mItem_FIXED_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mItem_FIXED_ODR_QTY == null) {
			l_mItem_FIXED_ODR_QTY = new ArrayList();
		} else {
			l_mItem_FIXED_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mItem_FIXED_ODR_QTY.add(((KU0060010Struct) list.get(i)).getmItem_FIXED_ODR_QTY());
		}
		return size;
	}
	public int setL2L_mItem_MIN_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mItem_MIN_ODR_QTY == null) {
			l_mItem_MIN_ODR_QTY = new ArrayList();
		} else {
			l_mItem_MIN_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mItem_MIN_ODR_QTY.add(((KU0060010Struct) list.get(i)).getmItem_MIN_ODR_QTY());
		}
		return size;
	}
	public int setL2L_mItem_MUL_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mItem_MUL_ODR_QTY == null) {
			l_mItem_MUL_ODR_QTY = new ArrayList();
		} else {
			l_mItem_MUL_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mItem_MUL_ODR_QTY.add(((KU0060010Struct) list.get(i)).getmItem_MUL_ODR_QTY());
		}
		return size;
	}
	public int setL2L_mItem_ISSUE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mItem_ISSUE_TYP == null) {
			l_mItem_ISSUE_TYP = new ArrayList();
		} else {
			l_mItem_ISSUE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mItem_ISSUE_TYP.add(((KU0060010Struct) list.get(i)).getmItem_ISSUE_TYP());
		}
		return size;
	}
	public int setL2L_mItem_MPS_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mItem_MPS_FLG == null) {
			l_mItem_MPS_FLG = new ArrayList();
		} else {
			l_mItem_MPS_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mItem_MPS_FLG.add(((KU0060010Struct) list.get(i)).getmItem_MPS_FLG());
		}
		return size;
	}
	public int setL2L_mItem_ACPT_INSPC_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mItem_ACPT_INSPC_TYP == null) {
			l_mItem_ACPT_INSPC_TYP = new ArrayList();
		} else {
			l_mItem_ACPT_INSPC_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mItem_ACPT_INSPC_TYP.add(((KU0060010Struct) list.get(i)).getmItem_ACPT_INSPC_TYP());
		}
		return size;
	}
	public int setL2L_mItem_CLASIFICATION_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mItem_CLASIFICATION_CD == null) {
			l_mItem_CLASIFICATION_CD = new ArrayList();
		} else {
			l_mItem_CLASIFICATION_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mItem_CLASIFICATION_CD.add(((KU0060010Struct) list.get(i)).getmItem_CLASIFICATION_CD());
		}
		return size;
	}
	public int setL2L_mItem_UNIT_WEIGHT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mItem_UNIT_WEIGHT == null) {
			l_mItem_UNIT_WEIGHT = new ArrayList();
		} else {
			l_mItem_UNIT_WEIGHT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mItem_UNIT_WEIGHT.add(((KU0060010Struct) list.get(i)).getmItem_UNIT_WEIGHT());
		}
		return size;
	}
	public int setL2L_mItem_ABC_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mItem_ABC_TYP == null) {
			l_mItem_ABC_TYP = new ArrayList();
		} else {
			l_mItem_ABC_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mItem_ABC_TYP.add(((KU0060010Struct) list.get(i)).getmItem_ABC_TYP());
		}
		return size;
	}
	public int setL2L_mItem_OPR_RSLT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mItem_OPR_RSLT_TYP == null) {
			l_mItem_OPR_RSLT_TYP = new ArrayList();
		} else {
			l_mItem_OPR_RSLT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mItem_OPR_RSLT_TYP.add(((KU0060010Struct) list.get(i)).getmItem_OPR_RSLT_TYP());
		}
		return size;
	}
	public int setL2L_mItem_SPL_ITEM_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mItem_SPL_ITEM_TYP == null) {
			l_mItem_SPL_ITEM_TYP = new ArrayList();
		} else {
			l_mItem_SPL_ITEM_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mItem_SPL_ITEM_TYP.add(((KU0060010Struct) list.get(i)).getmItem_SPL_ITEM_TYP());
		}
		return size;
	}
	public int setL2L_mItem_TAX_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mItem_TAX_CD == null) {
			l_mItem_TAX_CD = new ArrayList();
		} else {
			l_mItem_TAX_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mItem_TAX_CD.add(((KU0060010Struct) list.get(i)).getmItem_TAX_CD());
		}
		return size;
	}
	public int setL2L_mItem_IN_ITEMCD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mItem_IN_ITEMCD == null) {
			l_mItem_IN_ITEMCD = new ArrayList();
		} else {
			l_mItem_IN_ITEMCD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mItem_IN_ITEMCD.add(((KU0060010Struct) list.get(i)).getmItem_IN_ITEMCD());
		}
		return size;
	}
	public int setL2L_mCustBase_COMPANY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCustBase_COMPANY_CD == null) {
			l_mCustBase_COMPANY_CD = new ArrayList();
		} else {
			l_mCustBase_COMPANY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCustBase_COMPANY_CD.add(((KU0060010Struct) list.get(i)).getmCustBase_COMPANY_CD());
		}
		return size;
	}
	public int setL2L_mCustBase_CUST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCustBase_CUST_CD == null) {
			l_mCustBase_CUST_CD = new ArrayList();
		} else {
			l_mCustBase_CUST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCustBase_CUST_CD.add(((KU0060010Struct) list.get(i)).getmCustBase_CUST_CD());
		}
		return size;
	}
	public int setL2L_mCustBase_DLV_LOC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCustBase_DLV_LOC_CD == null) {
			l_mCustBase_DLV_LOC_CD = new ArrayList();
		} else {
			l_mCustBase_DLV_LOC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCustBase_DLV_LOC_CD.add(((KU0060010Struct) list.get(i)).getmCustBase_DLV_LOC_CD());
		}
		return size;
	}
	public int setL2L_mCustBase_DLV_LOC_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCustBase_DLV_LOC_NAME == null) {
			l_mCustBase_DLV_LOC_NAME = new ArrayList();
		} else {
			l_mCustBase_DLV_LOC_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCustBase_DLV_LOC_NAME.add(((KU0060010Struct) list.get(i)).getmCustBase_DLV_LOC_NAME());
		}
		return size;
	}
	public int setL2L_mCustBase_DLV_LOC_KNAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCustBase_DLV_LOC_KNAME == null) {
			l_mCustBase_DLV_LOC_KNAME = new ArrayList();
		} else {
			l_mCustBase_DLV_LOC_KNAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCustBase_DLV_LOC_KNAME.add(((KU0060010Struct) list.get(i)).getmCustBase_DLV_LOC_KNAME());
		}
		return size;
	}
	public int setL2L_mCustBase_DLV_LOC_ENAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCustBase_DLV_LOC_ENAME == null) {
			l_mCustBase_DLV_LOC_ENAME = new ArrayList();
		} else {
			l_mCustBase_DLV_LOC_ENAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCustBase_DLV_LOC_ENAME.add(((KU0060010Struct) list.get(i)).getmCustBase_DLV_LOC_ENAME());
		}
		return size;
	}
	public int setL2L_mCustBase_ZIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCustBase_ZIP_CD == null) {
			l_mCustBase_ZIP_CD = new ArrayList();
		} else {
			l_mCustBase_ZIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCustBase_ZIP_CD.add(((KU0060010Struct) list.get(i)).getmCustBase_ZIP_CD());
		}
		return size;
	}
	public int setL2L_mCustBase_ADDRESS_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCustBase_ADDRESS_1 == null) {
			l_mCustBase_ADDRESS_1 = new ArrayList();
		} else {
			l_mCustBase_ADDRESS_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCustBase_ADDRESS_1.add(((KU0060010Struct) list.get(i)).getmCustBase_ADDRESS_1());
		}
		return size;
	}
	public int setL2L_mCustBase_ADDRESS_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCustBase_ADDRESS_2 == null) {
			l_mCustBase_ADDRESS_2 = new ArrayList();
		} else {
			l_mCustBase_ADDRESS_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCustBase_ADDRESS_2.add(((KU0060010Struct) list.get(i)).getmCustBase_ADDRESS_2());
		}
		return size;
	}
	public int setL2L_mCustBase_ADDRESS_K_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCustBase_ADDRESS_K_1 == null) {
			l_mCustBase_ADDRESS_K_1 = new ArrayList();
		} else {
			l_mCustBase_ADDRESS_K_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCustBase_ADDRESS_K_1.add(((KU0060010Struct) list.get(i)).getmCustBase_ADDRESS_K_1());
		}
		return size;
	}
	public int setL2L_mCustBase_ADDRESS_K_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCustBase_ADDRESS_K_2 == null) {
			l_mCustBase_ADDRESS_K_2 = new ArrayList();
		} else {
			l_mCustBase_ADDRESS_K_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCustBase_ADDRESS_K_2.add(((KU0060010Struct) list.get(i)).getmCustBase_ADDRESS_K_2());
		}
		return size;
	}
	public int setL2L_mCustBase_TEL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCustBase_TEL == null) {
			l_mCustBase_TEL = new ArrayList();
		} else {
			l_mCustBase_TEL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCustBase_TEL.add(((KU0060010Struct) list.get(i)).getmCustBase_TEL());
		}
		return size;
	}
	public int setL2L_mCustBase_FAX(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCustBase_FAX == null) {
			l_mCustBase_FAX = new ArrayList();
		} else {
			l_mCustBase_FAX.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCustBase_FAX.add(((KU0060010Struct) list.get(i)).getmCustBase_FAX());
		}
		return size;
	}
	public int setL2L_mCustBase_SHIP_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCustBase_SHIP_WH_CD == null) {
			l_mCustBase_SHIP_WH_CD = new ArrayList();
		} else {
			l_mCustBase_SHIP_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCustBase_SHIP_WH_CD.add(((KU0060010Struct) list.get(i)).getmCustBase_SHIP_WH_CD());
		}
		return size;
	}
	public int setL2L_mCustBase_TRANSPORT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCustBase_TRANSPORT_CD == null) {
			l_mCustBase_TRANSPORT_CD = new ArrayList();
		} else {
			l_mCustBase_TRANSPORT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCustBase_TRANSPORT_CD.add(((KU0060010Struct) list.get(i)).getmCustBase_TRANSPORT_CD());
		}
		return size;
	}
	public int setL2L_mCustBase_TRANSPORT_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCustBase_TRANSPORT_NAME == null) {
			l_mCustBase_TRANSPORT_NAME = new ArrayList();
		} else {
			l_mCustBase_TRANSPORT_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCustBase_TRANSPORT_NAME.add(((KU0060010Struct) list.get(i)).getmCustBase_TRANSPORT_NAME());
		}
		return size;
	}
	public int setL2L_mCustBase_TRANSPORT_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCustBase_TRANSPORT_LT == null) {
			l_mCustBase_TRANSPORT_LT = new ArrayList();
		} else {
			l_mCustBase_TRANSPORT_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCustBase_TRANSPORT_LT.add(((KU0060010Struct) list.get(i)).getmCustBase_TRANSPORT_LT());
		}
		return size;
	}
	public int setL2L_mCustBase_CAL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCustBase_CAL_NO == null) {
			l_mCustBase_CAL_NO = new ArrayList();
		} else {
			l_mCustBase_CAL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCustBase_CAL_NO.add(((KU0060010Struct) list.get(i)).getmCustBase_CAL_NO());
		}
		return size;
	}
	public int setL2L_mCustBase_TRANSPORT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCustBase_TRANSPORT_TYP == null) {
			l_mCustBase_TRANSPORT_TYP = new ArrayList();
		} else {
			l_mCustBase_TRANSPORT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCustBase_TRANSPORT_TYP.add(((KU0060010Struct) list.get(i)).getmCustBase_TRANSPORT_TYP());
		}
		return size;
	}
	public int setL2L_mCustBase_DLV_START_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCustBase_DLV_START_TIME == null) {
			l_mCustBase_DLV_START_TIME = new ArrayList();
		} else {
			l_mCustBase_DLV_START_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCustBase_DLV_START_TIME.add(((KU0060010Struct) list.get(i)).getmCustBase_DLV_START_TIME());
		}
		return size;
	}
	public int setL2L_mCustBase_DLV_END_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCustBase_DLV_END_TIME == null) {
			l_mCustBase_DLV_END_TIME = new ArrayList();
		} else {
			l_mCustBase_DLV_END_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCustBase_DLV_END_TIME.add(((KU0060010Struct) list.get(i)).getmCustBase_DLV_END_TIME());
		}
		return size;
	}
	public int setL2L_mCustBase_AREA_CLASS_TYP1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCustBase_AREA_CLASS_TYP1 == null) {
			l_mCustBase_AREA_CLASS_TYP1 = new ArrayList();
		} else {
			l_mCustBase_AREA_CLASS_TYP1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCustBase_AREA_CLASS_TYP1.add(((KU0060010Struct) list.get(i)).getmCustBase_AREA_CLASS_TYP1());
		}
		return size;
	}
	public int setL2L_mCustBase_AREA_CLASS_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCustBase_AREA_CLASS_1 == null) {
			l_mCustBase_AREA_CLASS_1 = new ArrayList();
		} else {
			l_mCustBase_AREA_CLASS_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCustBase_AREA_CLASS_1.add(((KU0060010Struct) list.get(i)).getmCustBase_AREA_CLASS_1());
		}
		return size;
	}
	public int setL2L_mCustBase_AREA_CLASS_TYP2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCustBase_AREA_CLASS_TYP2 == null) {
			l_mCustBase_AREA_CLASS_TYP2 = new ArrayList();
		} else {
			l_mCustBase_AREA_CLASS_TYP2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCustBase_AREA_CLASS_TYP2.add(((KU0060010Struct) list.get(i)).getmCustBase_AREA_CLASS_TYP2());
		}
		return size;
	}
	public int setL2L_mCustBase_AREA_CLASS_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCustBase_AREA_CLASS_2 == null) {
			l_mCustBase_AREA_CLASS_2 = new ArrayList();
		} else {
			l_mCustBase_AREA_CLASS_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCustBase_AREA_CLASS_2.add(((KU0060010Struct) list.get(i)).getmCustBase_AREA_CLASS_2());
		}
		return size;
	}
	public int setL2L_mCustBase_AREA_CLASS_TYP3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCustBase_AREA_CLASS_TYP3 == null) {
			l_mCustBase_AREA_CLASS_TYP3 = new ArrayList();
		} else {
			l_mCustBase_AREA_CLASS_TYP3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCustBase_AREA_CLASS_TYP3.add(((KU0060010Struct) list.get(i)).getmCustBase_AREA_CLASS_TYP3());
		}
		return size;
	}
	public int setL2L_mCustBase_AREA_CLASS_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCustBase_AREA_CLASS_3 == null) {
			l_mCustBase_AREA_CLASS_3 = new ArrayList();
		} else {
			l_mCustBase_AREA_CLASS_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCustBase_AREA_CLASS_3.add(((KU0060010Struct) list.get(i)).getmCustBase_AREA_CLASS_3());
		}
		return size;
	}
	public int setL2L_mCustBase_REMARKS_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCustBase_REMARKS_1 == null) {
			l_mCustBase_REMARKS_1 = new ArrayList();
		} else {
			l_mCustBase_REMARKS_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCustBase_REMARKS_1.add(((KU0060010Struct) list.get(i)).getmCustBase_REMARKS_1());
		}
		return size;
	}
	public int setL2L_mCustBase_REMARKS_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCustBase_REMARKS_2 == null) {
			l_mCustBase_REMARKS_2 = new ArrayList();
		} else {
			l_mCustBase_REMARKS_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCustBase_REMARKS_2.add(((KU0060010Struct) list.get(i)).getmCustBase_REMARKS_2());
		}
		return size;
	}
	public int setL2L_mCustBase_REMARKS_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCustBase_REMARKS_3 == null) {
			l_mCustBase_REMARKS_3 = new ArrayList();
		} else {
			l_mCustBase_REMARKS_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCustBase_REMARKS_3.add(((KU0060010Struct) list.get(i)).getmCustBase_REMARKS_3());
		}
		return size;
	}
	public int setL2L_mCustBase_DEPO_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCustBase_DEPO_WH_CD == null) {
			l_mCustBase_DEPO_WH_CD = new ArrayList();
		} else {
			l_mCustBase_DEPO_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCustBase_DEPO_WH_CD.add(((KU0060010Struct) list.get(i)).getmCustBase_DEPO_WH_CD());
		}
		return size;
	}
	public int setL2L_mCustBase_IN_COMPANYCD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCustBase_IN_COMPANYCD == null) {
			l_mCustBase_IN_COMPANYCD = new ArrayList();
		} else {
			l_mCustBase_IN_COMPANYCD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCustBase_IN_COMPANYCD.add(((KU0060010Struct) list.get(i)).getmCustBase_IN_COMPANYCD());
		}
		return size;
	}
	public int setL2L_mCustBase_IN_CUSTCD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCustBase_IN_CUSTCD == null) {
			l_mCustBase_IN_CUSTCD = new ArrayList();
		} else {
			l_mCustBase_IN_CUSTCD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCustBase_IN_CUSTCD.add(((KU0060010Struct) list.get(i)).getmCustBase_IN_CUSTCD());
		}
		return size;
	}
	public int setL2L_mCustBase_IN_DLVLOCCD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCustBase_IN_DLVLOCCD == null) {
			l_mCustBase_IN_DLVLOCCD = new ArrayList();
		} else {
			l_mCustBase_IN_DLVLOCCD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCustBase_IN_DLVLOCCD.add(((KU0060010Struct) list.get(i)).getmCustBase_IN_DLVLOCCD());
		}
		return size;
	}
	public int setL2L_mCust_COMPANY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCust_COMPANY_CD == null) {
			l_mCust_COMPANY_CD = new ArrayList();
		} else {
			l_mCust_COMPANY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCust_COMPANY_CD.add(((KU0060010Struct) list.get(i)).getmCust_COMPANY_CD());
		}
		return size;
	}
	public int setL2L_mCust_CUST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCust_CUST_CD == null) {
			l_mCust_CUST_CD = new ArrayList();
		} else {
			l_mCust_CUST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCust_CUST_CD.add(((KU0060010Struct) list.get(i)).getmCust_CUST_CD());
		}
		return size;
	}
	public int setL2L_mCust_CUST_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCust_CUST_NAME == null) {
			l_mCust_CUST_NAME = new ArrayList();
		} else {
			l_mCust_CUST_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCust_CUST_NAME.add(((KU0060010Struct) list.get(i)).getmCust_CUST_NAME());
		}
		return size;
	}
	public int setL2L_mCust_CUST_ANAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCust_CUST_ANAME == null) {
			l_mCust_CUST_ANAME = new ArrayList();
		} else {
			l_mCust_CUST_ANAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCust_CUST_ANAME.add(((KU0060010Struct) list.get(i)).getmCust_CUST_ANAME());
		}
		return size;
	}
	public int setL2L_mCust_CUST_KNAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCust_CUST_KNAME == null) {
			l_mCust_CUST_KNAME = new ArrayList();
		} else {
			l_mCust_CUST_KNAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCust_CUST_KNAME.add(((KU0060010Struct) list.get(i)).getmCust_CUST_KNAME());
		}
		return size;
	}
	public int setL2L_mCust_OWN_ORG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCust_OWN_ORG_CD == null) {
			l_mCust_OWN_ORG_CD = new ArrayList();
		} else {
			l_mCust_OWN_ORG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCust_OWN_ORG_CD.add(((KU0060010Struct) list.get(i)).getmCust_OWN_ORG_CD());
		}
		return size;
	}
	public int setL2L_mCust_OWN_PERSON_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCust_OWN_PERSON_CD == null) {
			l_mCust_OWN_PERSON_CD = new ArrayList();
		} else {
			l_mCust_OWN_PERSON_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCust_OWN_PERSON_CD.add(((KU0060010Struct) list.get(i)).getmCust_OWN_PERSON_CD());
		}
		return size;
	}
	public int setL2L_mCust_CUR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCust_CUR_CD == null) {
			l_mCust_CUR_CD = new ArrayList();
		} else {
			l_mCust_CUR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCust_CUR_CD.add(((KU0060010Struct) list.get(i)).getmCust_CUR_CD());
		}
		return size;
	}
	public int setL2L_mCust_EXCH_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCust_EXCH_TYP == null) {
			l_mCust_EXCH_TYP = new ArrayList();
		} else {
			l_mCust_EXCH_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCust_EXCH_TYP.add(((KU0060010Struct) list.get(i)).getmCust_EXCH_TYP());
		}
		return size;
	}
	public int setL2L_mCust_TAX_APPLY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCust_TAX_APPLY_TYP == null) {
			l_mCust_TAX_APPLY_TYP = new ArrayList();
		} else {
			l_mCust_TAX_APPLY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCust_TAX_APPLY_TYP.add(((KU0060010Struct) list.get(i)).getmCust_TAX_APPLY_TYP());
		}
		return size;
	}
	public int setL2L_mCust_TAX_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCust_TAX_CD == null) {
			l_mCust_TAX_CD = new ArrayList();
		} else {
			l_mCust_TAX_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCust_TAX_CD.add(((KU0060010Struct) list.get(i)).getmCust_TAX_CD());
		}
		return size;
	}
	public int setL2L_mCust_TAX_CALC_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCust_TAX_CALC_TYP == null) {
			l_mCust_TAX_CALC_TYP = new ArrayList();
		} else {
			l_mCust_TAX_CALC_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCust_TAX_CALC_TYP.add(((KU0060010Struct) list.get(i)).getmCust_TAX_CALC_TYP());
		}
		return size;
	}
	public int setL2L_mCust_PRICE_ROUND_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCust_PRICE_ROUND_TYP == null) {
			l_mCust_PRICE_ROUND_TYP = new ArrayList();
		} else {
			l_mCust_PRICE_ROUND_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCust_PRICE_ROUND_TYP.add(((KU0060010Struct) list.get(i)).getmCust_PRICE_ROUND_TYP());
		}
		return size;
	}
	public int setL2L_mCust_DETAIL_ROUND_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCust_DETAIL_ROUND_TYP == null) {
			l_mCust_DETAIL_ROUND_TYP = new ArrayList();
		} else {
			l_mCust_DETAIL_ROUND_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCust_DETAIL_ROUND_TYP.add(((KU0060010Struct) list.get(i)).getmCust_DETAIL_ROUND_TYP());
		}
		return size;
	}
	public int setL2L_mCust_UNCONFIRM_ODR_EFF_PRIOD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCust_UNCONFIRM_ODR_EFF_PRIOD == null) {
			l_mCust_UNCONFIRM_ODR_EFF_PRIOD = new ArrayList();
		} else {
			l_mCust_UNCONFIRM_ODR_EFF_PRIOD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCust_UNCONFIRM_ODR_EFF_PRIOD.add(((KU0060010Struct) list.get(i)).getmCust_UNCONFIRM_ODR_EFF_PRIOD());
		}
		return size;
	}
	public int setL2L_mCust_UNCONFIRM_ODR_EFF_TERM_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCust_UNCONFIRM_ODR_EFF_TERM_FLG == null) {
			l_mCust_UNCONFIRM_ODR_EFF_TERM_FLG = new ArrayList();
		} else {
			l_mCust_UNCONFIRM_ODR_EFF_TERM_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCust_UNCONFIRM_ODR_EFF_TERM_FLG.add(((KU0060010Struct) list.get(i)).getmCust_UNCONFIRM_ODR_EFF_TERM_FLG());
		}
		return size;
	}
	public int setL2L_mCust_EDI_CUST_VEND_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCust_EDI_CUST_VEND_CD == null) {
			l_mCust_EDI_CUST_VEND_CD = new ArrayList();
		} else {
			l_mCust_EDI_CUST_VEND_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCust_EDI_CUST_VEND_CD.add(((KU0060010Struct) list.get(i)).getmCust_EDI_CUST_VEND_CD());
		}
		return size;
	}
	public int setL2L_mCust_PARTIAL_SHIP_INST_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCust_PARTIAL_SHIP_INST_FLG == null) {
			l_mCust_PARTIAL_SHIP_INST_FLG = new ArrayList();
		} else {
			l_mCust_PARTIAL_SHIP_INST_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCust_PARTIAL_SHIP_INST_FLG.add(((KU0060010Struct) list.get(i)).getmCust_PARTIAL_SHIP_INST_FLG());
		}
		return size;
	}
	public int setL2L_mCust_DEPO_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCust_DEPO_TYP == null) {
			l_mCust_DEPO_TYP = new ArrayList();
		} else {
			l_mCust_DEPO_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCust_DEPO_TYP.add(((KU0060010Struct) list.get(i)).getmCust_DEPO_TYP());
		}
		return size;
	}
	public int setL2L_mCust_INSPC_ACPT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCust_INSPC_ACPT_TYP == null) {
			l_mCust_INSPC_ACPT_TYP = new ArrayList();
		} else {
			l_mCust_INSPC_ACPT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCust_INSPC_ACPT_TYP.add(((KU0060010Struct) list.get(i)).getmCust_INSPC_ACPT_TYP());
		}
		return size;
	}
	public int setL2L_mCust_IN_COMPANYCD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCust_IN_COMPANYCD == null) {
			l_mCust_IN_COMPANYCD = new ArrayList();
		} else {
			l_mCust_IN_COMPANYCD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCust_IN_COMPANYCD.add(((KU0060010Struct) list.get(i)).getmCust_IN_COMPANYCD());
		}
		return size;
	}
	public int setL2L_mCust_IN_CUSTCD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mCust_IN_CUSTCD == null) {
			l_mCust_IN_CUSTCD = new ArrayList();
		} else {
			l_mCust_IN_CUSTCD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mCust_IN_CUSTCD.add(((KU0060010Struct) list.get(i)).getmCust_IN_CUSTCD());
		}
		return size;
	}
	public int setL2L_strYotaku_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strYotaku_WH_CD == null) {
			l_strYotaku_WH_CD = new ArrayList();
		} else {
			l_strYotaku_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strYotaku_WH_CD.add(((KU0060010Struct) list.get(i)).getstrYotaku_WH_CD());
		}
		return size;
	}
	public int setL2L_strYotaku_IN_WH_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strYotaku_IN_WH_TYP == null) {
			l_strYotaku_IN_WH_TYP = new ArrayList();
		} else {
			l_strYotaku_IN_WH_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strYotaku_IN_WH_TYP.add(((KU0060010Struct) list.get(i)).getstrYotaku_IN_WH_TYP());
		}
		return size;
	}
	public int setL2L_in_tShipSlip_SLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipSlip_SLIP_CD == null) {
			l_in_tShipSlip_SLIP_CD = new ArrayList();
		} else {
			l_in_tShipSlip_SLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipSlip_SLIP_CD.add(((KU0060010Struct) list.get(i)).getin_tShipSlip_SLIP_CD());
		}
		return size;
	}
	public int setL2L_in_tShipSlip_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipSlip_ITEM_CD == null) {
			l_in_tShipSlip_ITEM_CD = new ArrayList();
		} else {
			l_in_tShipSlip_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipSlip_ITEM_CD.add(((KU0060010Struct) list.get(i)).getin_tShipSlip_ITEM_CD());
		}
		return size;
	}
	public int setL2L_in_tShipSlip_CUST_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipSlip_CUST_ITEM_CD == null) {
			l_in_tShipSlip_CUST_ITEM_CD = new ArrayList();
		} else {
			l_in_tShipSlip_CUST_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipSlip_CUST_ITEM_CD.add(((KU0060010Struct) list.get(i)).getin_tShipSlip_CUST_ITEM_CD());
		}
		return size;
	}
	public int setL2L_in_tShipSlip_PART_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipSlip_PART_NAME == null) {
			l_in_tShipSlip_PART_NAME = new ArrayList();
		} else {
			l_in_tShipSlip_PART_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipSlip_PART_NAME.add(((KU0060010Struct) list.get(i)).getin_tShipSlip_PART_NAME());
		}
		return size;
	}
	public int setL2L_in_tShipSlip_CUST_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipSlip_CUST_ODR_NO == null) {
			l_in_tShipSlip_CUST_ODR_NO = new ArrayList();
		} else {
			l_in_tShipSlip_CUST_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipSlip_CUST_ODR_NO.add(((KU0060010Struct) list.get(i)).getin_tShipSlip_CUST_ODR_NO());
		}
		return size;
	}
	public int setL2L_in_tShipSlip_CUST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipSlip_CUST_CD == null) {
			l_in_tShipSlip_CUST_CD = new ArrayList();
		} else {
			l_in_tShipSlip_CUST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipSlip_CUST_CD.add(((KU0060010Struct) list.get(i)).getin_tShipSlip_CUST_CD());
		}
		return size;
	}
	public int setL2L_in_tShipSlip_CUST_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipSlip_CUST_NAME == null) {
			l_in_tShipSlip_CUST_NAME = new ArrayList();
		} else {
			l_in_tShipSlip_CUST_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipSlip_CUST_NAME.add(((KU0060010Struct) list.get(i)).getin_tShipSlip_CUST_NAME());
		}
		return size;
	}
	public int setL2L_in_tShipSlip_DLV_LOC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipSlip_DLV_LOC_CD == null) {
			l_in_tShipSlip_DLV_LOC_CD = new ArrayList();
		} else {
			l_in_tShipSlip_DLV_LOC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipSlip_DLV_LOC_CD.add(((KU0060010Struct) list.get(i)).getin_tShipSlip_DLV_LOC_CD());
		}
		return size;
	}
	public int setL2L_in_tShipSlip_DLV_LOC_NAME_KANJI(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipSlip_DLV_LOC_NAME_KANJI == null) {
			l_in_tShipSlip_DLV_LOC_NAME_KANJI = new ArrayList();
		} else {
			l_in_tShipSlip_DLV_LOC_NAME_KANJI.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipSlip_DLV_LOC_NAME_KANJI.add(((KU0060010Struct) list.get(i)).getin_tShipSlip_DLV_LOC_NAME_KANJI());
		}
		return size;
	}
	public int setL2L_in_tShipSlip_CUS_DLV_KEY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipSlip_CUS_DLV_KEY_CD == null) {
			l_in_tShipSlip_CUS_DLV_KEY_CD = new ArrayList();
		} else {
			l_in_tShipSlip_CUS_DLV_KEY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipSlip_CUS_DLV_KEY_CD.add(((KU0060010Struct) list.get(i)).getin_tShipSlip_CUS_DLV_KEY_CD());
		}
		return size;
	}
	public int setL2L_in_tShipSlip_DESINATED_SHIP_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipSlip_DESINATED_SHIP_DATE == null) {
			l_in_tShipSlip_DESINATED_SHIP_DATE = new ArrayList();
		} else {
			l_in_tShipSlip_DESINATED_SHIP_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipSlip_DESINATED_SHIP_DATE.add(((KU0060010Struct) list.get(i)).getin_tShipSlip_DESINATED_SHIP_DATE());
		}
		return size;
	}
	public int setL2L_in_tShipSlip_DESINATED_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipSlip_DESINATED_DLV_DATE == null) {
			l_in_tShipSlip_DESINATED_DLV_DATE = new ArrayList();
		} else {
			l_in_tShipSlip_DESINATED_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipSlip_DESINATED_DLV_DATE.add(((KU0060010Struct) list.get(i)).getin_tShipSlip_DESINATED_DLV_DATE());
		}
		return size;
	}
	public int setL2L_in_tShipSlip_SCDL_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipSlip_SCDL_DLV_DATE == null) {
			l_in_tShipSlip_SCDL_DLV_DATE = new ArrayList();
		} else {
			l_in_tShipSlip_SCDL_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipSlip_SCDL_DLV_DATE.add(((KU0060010Struct) list.get(i)).getin_tShipSlip_SCDL_DLV_DATE());
		}
		return size;
	}
	public int setL2L_in_tShipSlip_SHIP_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipSlip_SHIP_ODR_QTY == null) {
			l_in_tShipSlip_SHIP_ODR_QTY = new ArrayList();
		} else {
			l_in_tShipSlip_SHIP_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipSlip_SHIP_ODR_QTY.add(((KU0060010Struct) list.get(i)).getin_tShipSlip_SHIP_ODR_QTY());
		}
		return size;
	}
	public int setL2L_in_tShipSlip_UNIT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipSlip_UNIT_CD == null) {
			l_in_tShipSlip_UNIT_CD = new ArrayList();
		} else {
			l_in_tShipSlip_UNIT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipSlip_UNIT_CD.add(((KU0060010Struct) list.get(i)).getin_tShipSlip_UNIT_CD());
		}
		return size;
	}
	public int setL2L_in_tShipSlip_UNIT_PRICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipSlip_UNIT_PRICE == null) {
			l_in_tShipSlip_UNIT_PRICE = new ArrayList();
		} else {
			l_in_tShipSlip_UNIT_PRICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipSlip_UNIT_PRICE.add(((KU0060010Struct) list.get(i)).getin_tShipSlip_UNIT_PRICE());
		}
		return size;
	}
	public int setL2L_in_tShipSlip_SHIP_ODR_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipSlip_SHIP_ODR_AMOUNT == null) {
			l_in_tShipSlip_SHIP_ODR_AMOUNT = new ArrayList();
		} else {
			l_in_tShipSlip_SHIP_ODR_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipSlip_SHIP_ODR_AMOUNT.add(((KU0060010Struct) list.get(i)).getin_tShipSlip_SHIP_ODR_AMOUNT());
		}
		return size;
	}
	public int setL2L_in_tShipSlip_TAX_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipSlip_TAX_AMOUNT == null) {
			l_in_tShipSlip_TAX_AMOUNT = new ArrayList();
		} else {
			l_in_tShipSlip_TAX_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipSlip_TAX_AMOUNT.add(((KU0060010Struct) list.get(i)).getin_tShipSlip_TAX_AMOUNT());
		}
		return size;
	}
	public int setL2L_in_tShipSlip_INSPC_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipSlip_INSPC_TYP == null) {
			l_in_tShipSlip_INSPC_TYP = new ArrayList();
		} else {
			l_in_tShipSlip_INSPC_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipSlip_INSPC_TYP.add(((KU0060010Struct) list.get(i)).getin_tShipSlip_INSPC_TYP());
		}
		return size;
	}
	public int setL2L_in_tShipSlip_CLIENT_REMARK_KANJI(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipSlip_CLIENT_REMARK_KANJI == null) {
			l_in_tShipSlip_CLIENT_REMARK_KANJI = new ArrayList();
		} else {
			l_in_tShipSlip_CLIENT_REMARK_KANJI.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipSlip_CLIENT_REMARK_KANJI.add(((KU0060010Struct) list.get(i)).getin_tShipSlip_CLIENT_REMARK_KANJI());
		}
		return size;
	}
	public int setL2L_in_tShipSlip_CLIENT_BARCODE_INF(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipSlip_CLIENT_BARCODE_INF == null) {
			l_in_tShipSlip_CLIENT_BARCODE_INF = new ArrayList();
		} else {
			l_in_tShipSlip_CLIENT_BARCODE_INF.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipSlip_CLIENT_BARCODE_INF.add(((KU0060010Struct) list.get(i)).getin_tShipSlip_CLIENT_BARCODE_INF());
		}
		return size;
	}
	public int setL2L_in_tShipSlip_PRINT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipSlip_PRINT_FLG == null) {
			l_in_tShipSlip_PRINT_FLG = new ArrayList();
		} else {
			l_in_tShipSlip_PRINT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipSlip_PRINT_FLG.add(((KU0060010Struct) list.get(i)).getin_tShipSlip_PRINT_FLG());
		}
		return size;
	}
	public int setL2L_in_tShipSlip_DEL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipSlip_DEL_FLG == null) {
			l_in_tShipSlip_DEL_FLG = new ArrayList();
		} else {
			l_in_tShipSlip_DEL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipSlip_DEL_FLG.add(((KU0060010Struct) list.get(i)).getin_tShipSlip_DEL_FLG());
		}
		return size;
	}
	public int setL2L_in_tShipSlip_BUYER_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipSlip_BUYER_NAME == null) {
			l_in_tShipSlip_BUYER_NAME = new ArrayList();
		} else {
			l_in_tShipSlip_BUYER_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipSlip_BUYER_NAME.add(((KU0060010Struct) list.get(i)).getin_tShipSlip_BUYER_NAME());
		}
		return size;
	}
	public int setL2L_in_tShipSlip_PUCH_ODR_QTY_TOTAL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipSlip_PUCH_ODR_QTY_TOTAL == null) {
			l_in_tShipSlip_PUCH_ODR_QTY_TOTAL = new ArrayList();
		} else {
			l_in_tShipSlip_PUCH_ODR_QTY_TOTAL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipSlip_PUCH_ODR_QTY_TOTAL.add(((KU0060010Struct) list.get(i)).getin_tShipSlip_PUCH_ODR_QTY_TOTAL());
		}
		return size;
	}
	public int setL2L_in_tShipSlip_DLV_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipSlip_DLV_ODR_QTY == null) {
			l_in_tShipSlip_DLV_ODR_QTY = new ArrayList();
		} else {
			l_in_tShipSlip_DLV_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipSlip_DLV_ODR_QTY.add(((KU0060010Struct) list.get(i)).getin_tShipSlip_DLV_ODR_QTY());
		}
		return size;
	}
	public int setL2L_in_tShipSlip_SHIP_ODR_AMOUNT_TAX(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipSlip_SHIP_ODR_AMOUNT_TAX == null) {
			l_in_tShipSlip_SHIP_ODR_AMOUNT_TAX = new ArrayList();
		} else {
			l_in_tShipSlip_SHIP_ODR_AMOUNT_TAX.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipSlip_SHIP_ODR_AMOUNT_TAX.add(((KU0060010Struct) list.get(i)).getin_tShipSlip_SHIP_ODR_AMOUNT_TAX());
		}
		return size;
	}
	public int setL2L_in_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT == null) {
			l_in_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT = new ArrayList();
		} else {
			l_in_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT.add(((KU0060010Struct) list.get(i)).getin_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_in_tShipSlip_INTERNAL_TAX_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipSlip_INTERNAL_TAX_SALES_AMOUNT == null) {
			l_in_tShipSlip_INTERNAL_TAX_SALES_AMOUNT = new ArrayList();
		} else {
			l_in_tShipSlip_INTERNAL_TAX_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipSlip_INTERNAL_TAX_SALES_AMOUNT.add(((KU0060010Struct) list.get(i)).getin_tShipSlip_INTERNAL_TAX_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_in_tShipSlip_TAXFREE_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipSlip_TAXFREE_SALES_AMOUNT == null) {
			l_in_tShipSlip_TAXFREE_SALES_AMOUNT = new ArrayList();
		} else {
			l_in_tShipSlip_TAXFREE_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipSlip_TAXFREE_SALES_AMOUNT.add(((KU0060010Struct) list.get(i)).getin_tShipSlip_TAXFREE_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_in_tShipSlip_TAX_CREDIT_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipSlip_TAX_CREDIT_SALES_AMOUNT == null) {
			l_in_tShipSlip_TAX_CREDIT_SALES_AMOUNT = new ArrayList();
		} else {
			l_in_tShipSlip_TAX_CREDIT_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipSlip_TAX_CREDIT_SALES_AMOUNT.add(((KU0060010Struct) list.get(i)).getin_tShipSlip_TAX_CREDIT_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_in_tShipSlip_EXTERNAL_TAX_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipSlip_EXTERNAL_TAX_AMOUNT == null) {
			l_in_tShipSlip_EXTERNAL_TAX_AMOUNT = new ArrayList();
		} else {
			l_in_tShipSlip_EXTERNAL_TAX_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipSlip_EXTERNAL_TAX_AMOUNT.add(((KU0060010Struct) list.get(i)).getin_tShipSlip_EXTERNAL_TAX_AMOUNT());
		}
		return size;
	}
	public int setL2L_in_tShipSlip_INTERNAL_TAX_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipSlip_INTERNAL_TAX_AMOUNT == null) {
			l_in_tShipSlip_INTERNAL_TAX_AMOUNT = new ArrayList();
		} else {
			l_in_tShipSlip_INTERNAL_TAX_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipSlip_INTERNAL_TAX_AMOUNT.add(((KU0060010Struct) list.get(i)).getin_tShipSlip_INTERNAL_TAX_AMOUNT());
		}
		return size;
	}
	public int setL2L_in_tShipSlip_TAX_AMOUNT_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipSlip_TAX_AMOUNT_1 == null) {
			l_in_tShipSlip_TAX_AMOUNT_1 = new ArrayList();
		} else {
			l_in_tShipSlip_TAX_AMOUNT_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipSlip_TAX_AMOUNT_1.add(((KU0060010Struct) list.get(i)).getin_tShipSlip_TAX_AMOUNT_1());
		}
		return size;
	}
	public int setL2L_in_tShipSlip_TAX_AMOUNT_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipSlip_TAX_AMOUNT_2 == null) {
			l_in_tShipSlip_TAX_AMOUNT_2 = new ArrayList();
		} else {
			l_in_tShipSlip_TAX_AMOUNT_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipSlip_TAX_AMOUNT_2.add(((KU0060010Struct) list.get(i)).getin_tShipSlip_TAX_AMOUNT_2());
		}
		return size;
	}
	public int setL2L_in_tShipSlip_TAX_AMOUNT_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipSlip_TAX_AMOUNT_3 == null) {
			l_in_tShipSlip_TAX_AMOUNT_3 = new ArrayList();
		} else {
			l_in_tShipSlip_TAX_AMOUNT_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipSlip_TAX_AMOUNT_3.add(((KU0060010Struct) list.get(i)).getin_tShipSlip_TAX_AMOUNT_3());
		}
		return size;
	}
	public int setL2L_in_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT == null) {
			l_in_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT = new ArrayList();
		} else {
			l_in_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT.add(((KU0060010Struct) list.get(i)).getin_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_del_tShipSlip_IN_SLIPCD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_del_tShipSlip_IN_SLIPCD == null) {
			l_del_tShipSlip_IN_SLIPCD = new ArrayList();
		} else {
			l_del_tShipSlip_IN_SLIPCD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_del_tShipSlip_IN_SLIPCD.add(((KU0060010Struct) list.get(i)).getdel_tShipSlip_IN_SLIPCD());
		}
		return size;
	}
	public int setL2L_uptOdr_SHIP_CNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_uptOdr_SHIP_CNT == null) {
			l_uptOdr_SHIP_CNT = new ArrayList();
		} else {
			l_uptOdr_SHIP_CNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_uptOdr_SHIP_CNT.add(((KU0060010Struct) list.get(i)).getuptOdr_SHIP_CNT());
		}
		return size;
	}
	public int setL2L_tUnShipList_UN_SHIP_SEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tUnShipList_UN_SHIP_SEQ_NO == null) {
			l_tUnShipList_UN_SHIP_SEQ_NO = new ArrayList();
		} else {
			l_tUnShipList_UN_SHIP_SEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tUnShipList_UN_SHIP_SEQ_NO.add(((KU0060010Struct) list.get(i)).gettUnShipList_UN_SHIP_SEQ_NO());
		}
		return size;
	}
	public int setL2L_tUnShipList_CUST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tUnShipList_CUST_CD == null) {
			l_tUnShipList_CUST_CD = new ArrayList();
		} else {
			l_tUnShipList_CUST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tUnShipList_CUST_CD.add(((KU0060010Struct) list.get(i)).gettUnShipList_CUST_CD());
		}
		return size;
	}
	public int setL2L_tUnShipList_ACPT_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tUnShipList_ACPT_ODR_CD == null) {
			l_tUnShipList_ACPT_ODR_CD = new ArrayList();
		} else {
			l_tUnShipList_ACPT_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tUnShipList_ACPT_ODR_CD.add(((KU0060010Struct) list.get(i)).gettUnShipList_ACPT_ODR_CD());
		}
		return size;
	}
	public int setL2L_tUnShipList_PART_DLV_SEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tUnShipList_PART_DLV_SEQ_NO == null) {
			l_tUnShipList_PART_DLV_SEQ_NO = new ArrayList();
		} else {
			l_tUnShipList_PART_DLV_SEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tUnShipList_PART_DLV_SEQ_NO.add(((KU0060010Struct) list.get(i)).gettUnShipList_PART_DLV_SEQ_NO());
		}
		return size;
	}
	public int setL2L_tUnShipList_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tUnShipList_ITEM_CD == null) {
			l_tUnShipList_ITEM_CD = new ArrayList();
		} else {
			l_tUnShipList_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tUnShipList_ITEM_CD.add(((KU0060010Struct) list.get(i)).gettUnShipList_ITEM_CD());
		}
		return size;
	}
	public int setL2L_tUnShipList_UN_SHIP_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tUnShipList_UN_SHIP_QTY == null) {
			l_tUnShipList_UN_SHIP_QTY = new ArrayList();
		} else {
			l_tUnShipList_UN_SHIP_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tUnShipList_UN_SHIP_QTY.add(((KU0060010Struct) list.get(i)).gettUnShipList_UN_SHIP_QTY());
		}
		return size;
	}
	public int setL2L_tUnShipList_UN_SHIP_RSN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tUnShipList_UN_SHIP_RSN == null) {
			l_tUnShipList_UN_SHIP_RSN = new ArrayList();
		} else {
			l_tUnShipList_UN_SHIP_RSN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tUnShipList_UN_SHIP_RSN.add(((KU0060010Struct) list.get(i)).gettUnShipList_UN_SHIP_RSN());
		}
		return size;
	}
	public int setL2L_tUnShipList_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tUnShipList_WH_CD == null) {
			l_tUnShipList_WH_CD = new ArrayList();
		} else {
			l_tUnShipList_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tUnShipList_WH_CD.add(((KU0060010Struct) list.get(i)).gettUnShipList_WH_CD());
		}
		return size;
	}
	public int setL2L_tUnShipList_PRINT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tUnShipList_PRINT_FLG == null) {
			l_tUnShipList_PRINT_FLG = new ArrayList();
		} else {
			l_tUnShipList_PRINT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tUnShipList_PRINT_FLG.add(((KU0060010Struct) list.get(i)).gettUnShipList_PRINT_FLG());
		}
		return size;
	}
	public int setL2L_tUnShipList_DEL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tUnShipList_DEL_FLG == null) {
			l_tUnShipList_DEL_FLG = new ArrayList();
		} else {
			l_tUnShipList_DEL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tUnShipList_DEL_FLG.add(((KU0060010Struct) list.get(i)).gettUnShipList_DEL_FLG());
		}
		return size;
	}
	public int setL2L_tori_tAnsDlvDate_REST_SHIP_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tori_tAnsDlvDate_REST_SHIP_ODR_QTY == null) {
			l_tori_tAnsDlvDate_REST_SHIP_ODR_QTY = new ArrayList();
		} else {
			l_tori_tAnsDlvDate_REST_SHIP_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tori_tAnsDlvDate_REST_SHIP_ODR_QTY.add(((KU0060010Struct) list.get(i)).gettori_tAnsDlvDate_REST_SHIP_ODR_QTY());
		}
		return size;
	}
	public int setL2L_tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG == null) {
			l_tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG = new ArrayList();
		} else {
			l_tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG.add(((KU0060010Struct) list.get(i)).gettori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG());
		}
		return size;
	}
	public int setL2L_tori_tAnsDlvDate_IN_ODRNO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tori_tAnsDlvDate_IN_ODRNO == null) {
			l_tori_tAnsDlvDate_IN_ODRNO = new ArrayList();
		} else {
			l_tori_tAnsDlvDate_IN_ODRNO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tori_tAnsDlvDate_IN_ODRNO.add(((KU0060010Struct) list.get(i)).gettori_tAnsDlvDate_IN_ODRNO());
		}
		return size;
	}
	public int setL2L_tori_tAnsDlvDate_IN_PARTDLVSEQNO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tori_tAnsDlvDate_IN_PARTDLVSEQNO == null) {
			l_tori_tAnsDlvDate_IN_PARTDLVSEQNO = new ArrayList();
		} else {
			l_tori_tAnsDlvDate_IN_PARTDLVSEQNO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tori_tAnsDlvDate_IN_PARTDLVSEQNO.add(((KU0060010Struct) list.get(i)).gettori_tAnsDlvDate_IN_PARTDLVSEQNO());
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
			l_l_COUNT.add(((KU0060010Struct) list.get(i)).getl_COUNT());
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
			l_ROW_COUNT.add(((KU0060010Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}
	public int setL2L_strTAX_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strTAX_CD == null) {
			l_strTAX_CD = new ArrayList();
		} else {
			l_strTAX_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strTAX_CD.add(((KU0060010Struct) list.get(i)).getstrTAX_CD());
		}
		return size;
	}
	public int setL2L_SHIP_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SHIP_MODIFY_COUNT == null) {
			l_SHIP_MODIFY_COUNT = new ArrayList();
		} else {
			l_SHIP_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SHIP_MODIFY_COUNT.add(((KU0060010Struct) list.get(i)).getSHIP_MODIFY_COUNT());
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
			l_SEL_MODIFY_COUNT.add(((KU0060010Struct) list.get(i)).getSEL_MODIFY_COUNT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_r1_SHIP_ODR = null;
		m_r2_SHIP_ODR = null;
		m_tAnsDlvDate_MODIFY_COUNT = null;
		m_tShipOdr_MODIFY_COUNT = null;
		m_Shipt_MODIFY_COUNT = null;
		m_h_RESULT = null;
		m_strBUSINESS_OPR_DATE = null;
		m_strPLANT_CD = null;
		m_strTaxTAX_KBN = null;
		m_strTaxOLD_TAX_1 = null;
		m_strTaxOLD_TAX_2 = null;
		m_strTaxOLD_TAX_3 = null;
		m_strTaxNEW_TAX_1 = null;
		m_strTaxNEW_TAX_2 = null;
		m_strTaxNEW_TAX_3 = null;
		m_strTaxSTART_DATE = null;
		m_strTaxROUND_TYP = null;
		m_strTaxIN_COMPANYCD = null;
		m_strTaxIN_CUSTCD = null;
		m_l_CUST_ITEM_CD = null;
		m_tDECIMAL_FIG = null;
		m_tCUR_CD = null;
		m_strCOMPANY_CD = null;
		m_strUSER_NAME = null;
		m_strSECTION_CD = null;
		m_strPLANT_NAME = null;
		m_strPLANT_ANAME = null;
		m_strCAL_NO = null;
		m_strUSER_CD = null;
		m_strSYUKA_LT = null;
		m_tHOLIDAY_FLG = null;
		m_tWH_CD = null;
		m_tCAL_DATE = null;
		m_l_ODR_NO = null;
		m_l_PART_DLV_SEQ_NO = null;
		m_l_DESINATED_DLV_DATE = null;
		m_l_DESINATED_SHIP_DATE = null;
		m_l_SHIP_QTY = null;
		m_l_REST_SHIP_QTY = null;
		m_l_WH_CD = null;
		m_l_WH_NAME = null;
		m_l_CUST_ODR_NO = null;
		m_l_CUST_CD = null;
		m_l_CUST_NAME = null;
		m_l_CUST_ITEM_NAME = null;
		m_l_ITEM_CD = null;
		m_l_ITEM_NAME = null;
		m_l_STOCK_UNIT = null;
		m_l_UNIT_QTY_TYP = null;
		m_l_MRP_ODR_TYP = null;
		m_l_ODR_CTL_NO = null;
		m_l_TRANSPORT_TYP = null;
		m_l_ODR_UNIT_PRICE = null;
		m_l_SPCL_PRICE_TYP = null;
		m_l_PARTIAL_SHIP_INST_FLG = null;
		m_l_MODIFY_COUNT = null;
		m_l_JOB_ODR_CD = null;
		m_ODR_NO = null;
		m_ITEM_CD = null;
		m_DESINATED_DLV_DATE = null;
		m_DESINATED_SHIP_DATE = null;
		m_CUST_CD = null;
		m_CUST_CHRG_PSN_CD = null;
		m_CUST_ODR_NO = null;
		m_CUST_ITEM_CD = null;
		m_up_tAnsDlvDate_DESINATED_SHIP_DATE = null;
		m_up_tAnsDlvDate_REST_SHIP_ODR_QTY = null;
		m_up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG = null;
		m_up_tAnsDlvDate_IN_ODRNO = null;
		m_up_tAnsDlvDate_IN_PARTDLVSEQNO = null;
		m_l_SLIP_CD = null;
		m_l_c_DIRECT_DLV_FLG = null;
		m_l_DLV_MODIFY_COUNT = null;
		m_SLIP_CD = null;
		m_in_tShipOdr_ODR_NO = null;
		m_in_tShipOdr_PART_DLV_SEQ_NO = null;
		m_in_tShipOdr_SLIP_CD = null;
		m_in_tShipOdr_ITEM_CD = null;
		m_in_tShipOdr_CUST_ITEM_CD = null;
		m_in_tShipOdr_CUST_ODR_NO = null;
		m_in_tShipOdr_CUST_CD = null;
		m_in_tShipOdr_CUST_NAME = null;
		m_in_tShipOdr_SHIP_ODR_ISS_PSN_CD = null;
		m_in_tShipOdr_DLV_LOC_CD = null;
		m_in_tShipOdr_DESINATED_SHIP_DATE = null;
		m_in_tShipOdr_SHIP_QTY = null;
		m_in_tShipOdr_UNIT_PRICE = null;
		m_in_tShipOdr_SHIP_ODR_AMOUNT = null;
		m_in_tShipOdr_CURRNCY_CD = null;
		m_in_tShipOdr_PKG_UNIT_QTY = null;
		m_in_tShipOdr_REMARKS = null;
		m_in_tShipOdr_ALLCT_WH_CD = null;
		m_in_tShipOdr_DEPO_TYP = null;
		m_in_tShipOdr_ENTRY_TYP = null;
		m_in_tShipOdr_PRINT_FLG = null;
		m_in_tShipOdr_SHP_CMPLT_FLG = null;
		m_in_tShipOdr_DEL_FLG = null;
		m_in_tShipOdr_TRANSPORT_CD = null;
		m_in_tShipOdr_DIRECT_DLV_FLG = null;
		m_in_tShipOdr_CUST_CHRG_PSN_CD = null;
		m_in_tShipOdr_UNIT_CD = null;
		m_in_tShipOdr_SCDL_DLV_DATE = null;
		m_in_tShipOdr_TRANSFER_WH_CD = null;
		m_in_tShipOdr_DLV_KEY_NO = null;
		m_in_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES = null;
		m_in_tShipOdr_SHIP_ODR_NO = null;
		m_in_tShipOdr_JOB_ODR_CD = null;
		m_del_tShipOdr_IN_SLIPCD = null;
		m_chkisinWhCd_WH_CD = null;
		m_chkisinWhCd_WH_TYP = null;
		m_chkis_IN_WHCD = null;
		m_chkisWhCd_WH_CD = null;
		m_chkisWhCd_WH_TYP = null;
		m_chkisWhCd_ITEM_CD = null;
		m_chkisWhCd_PBL_SHIP_QTY = null;
		m_chkisWhCd_IN_ITEMCD = null;
		m_chkisWhCd_IN_WHCD = null;
		m_tOdr_ODR_NO = null;
		m_tOdr_ODR_TYP = null;
		m_tOdr_ODR_CTL_NO = null;
		m_tOdr_CUST_ODR_NO = null;
		m_tOdr_CUST_CHRG_ORG_CD = null;
		m_tOdr_CUST_CHRG_PSN_CD = null;
		m_tOdr_ODR_ACPT_ORG_CD = null;
		m_tOdr_ODR_ACPT_PSN_CD = null;
		m_tOdr_CURRNCY_CD = null;
		m_tOdr_EXCH_TYP = null;
		m_tOdr_DLV_LOC_CD = null;
		m_tOdr_DLV_LOC_CD_EIAJ = null;
		m_tOdr_DLV_LOC_NAME = null;
		m_tOdr_DLV_LOC_NAME_KANJI = null;
		m_tOdr_PRD_ODR_PLACE_CD = null;
		m_tOdr_ODR_UNIT_PRICE = null;
		m_tOdr_SPCL_PRICE_TYP = null;
		m_tOdr_PART_DLV_COUNT = null;
		m_tOdr_DEPO_TYP = null;
		m_tOdr_DESINATED_DLV_DATE = null;
		m_tOdr_STD_DESINATED_RCV_DATE = null;
		m_tOdr_ODR_QTY = null;
		m_tOdr_REMAIN_UNCONFIRM_ODR_QTY = null;
		m_tOdr_CANCELED_UNCONFIRM_ODR_QTY = null;
		m_tOdr_UNIT_CD = null;
		m_tOdr_UNCONFIRM_ODR_BALANCE = null;
		m_tOdr_ODR_AMOUNT = null;
		m_tOdr_ODR_AMOUNT_EXCH_RATES = null;
		m_tOdr_TOTAL_SHIP_QTY = null;
		m_tOdr_SHIP_AMOUNT = null;
		m_tOdr_SHIP_AMOUNT_EXCH_RATES = null;
		m_tOdr_RETURN_PRICE = null;
		m_tOdr_RETURN_QTY = null;
		m_tOdr_RETURN_AMOUNT = null;
		m_tOdr_RETURN_AMOUNT_EXCH_RATES = null;
		m_tOdr_ODR_CMPLT_FLG = null;
		m_tOdr_ODR_CMPLT_DATE = null;
		m_tOdr_CUS_DLV_CD = null;
		m_tOdr_CUS_DLV_KEY_CD = null;
		m_tOdr_PART_NAME = null;
		m_tOdr_PKG_UNIT = null;
		m_tOdr_SLIP_PRICE_PRINT_TYP = null;
		m_tOdr_INSPC_TYP = null;
		m_tOdr_CLIENT_REMARK = null;
		m_tOdr_CLIENT_REMARK_KANJI = null;
		m_tOdr_CLIENT_BARCODE_INF = null;
		m_tOdr_TRANSPORT_CD = null;
		m_tOdr_TRANSPORT_TYP = null;
		m_tOdr_TAX_APPLY_TYP = null;
		m_tOdr_TAX_CD = null;
		m_tOdr_TAX_CALC_TYP = null;
		m_tOdr_REMARKS = null;
		m_tOdr_ODR_ACPT_DATE = null;
		m_tOdr_SHIP_PLAN_REMAIN_QTY = null;
		m_tOdr_SHIP_PLAN_CMPLT_FLG = null;
		m_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG = null;
		m_tOdr_PARTIAL_SHIP_INST_FLG = null;
		m_tOdr_IF_CTL_NO = null;
		m_tOdr_ENTRY_TYP = null;
		m_tOdr_BUYER_NAME = null;
		m_tOdr_PUCH_ODR_QTY_TOTAL = null;
		m_tOdr_UNIT_CD_ORG = null;
		m_tOdr_SHIP_CNT = null;
		m_tOdr_IN_ODRNO = null;
		m_uptOdr_PART_DLV_COUNT = null;
		m_uptOdr_IN_ODRNO = null;
		m_tOdrCtl_ODR_CTL_NO = null;
		m_tOdrCtl_CUST_CD = null;
		m_tOdrCtl_CUST_ITEM_CD = null;
		m_tOdrCtl_CUST_ITEM_NAME = null;
		m_tOdrCtl_ITEM_CD = null;
		m_tOdrCtl_ITEM_NAME = null;
		m_tOdrCtl_IN_ODRCTLNO = null;
		m_mItem_ITEM_CD = null;
		m_mItem_ITEM_NAME = null;
		m_mItem_PRODUCT_TYP = null;
		m_mItem_MRP_ODR_TYP = null;
		m_mItem_DRAW_CD = null;
		m_mItem_SPEC = null;
		m_mItem_HIGH_LEVEL_NO = null;
		m_mItem_OUTSIDE_TYP = null;
		m_mItem_STOCK_UNIT_FLG = null;
		m_mItem_STOCK_UNIT = null;
		m_mItem_PKG_UNIT = null;
		m_mItem_PKG_UNIT_QTY = null;
		m_mItem_UNIT_QTY_TYP = null;
		m_mItem_ODR_LT = null;
		m_mItem_FIXED_LT = null;
		m_mItem_PROP_LT = null;
		m_mItem_SAFETY_LT = null;
		m_mItem_ISSUE_LT = null;
		m_mItem_PROP_LOT_SIZE = null;
		m_mItem_ITEM_SPOIL = null;
		m_mItem_SAFETY_STOCK = null;
		m_mItem_LOT_SIZING_TYP = null;
		m_mItem_MAX_PERIOD = null;
		m_mItem_MAX_ODR_QTY = null;
		m_mItem_ODR_POINT = null;
		m_mItem_FIXED_ODR_QTY = null;
		m_mItem_MIN_ODR_QTY = null;
		m_mItem_MUL_ODR_QTY = null;
		m_mItem_ISSUE_TYP = null;
		m_mItem_MPS_FLG = null;
		m_mItem_ACPT_INSPC_TYP = null;
		m_mItem_CLASIFICATION_CD = null;
		m_mItem_UNIT_WEIGHT = null;
		m_mItem_ABC_TYP = null;
		m_mItem_OPR_RSLT_TYP = null;
		m_mItem_SPL_ITEM_TYP = null;
		m_mItem_TAX_CD = null;
		m_mItem_IN_ITEMCD = null;
		m_mCustBase_COMPANY_CD = null;
		m_mCustBase_CUST_CD = null;
		m_mCustBase_DLV_LOC_CD = null;
		m_mCustBase_DLV_LOC_NAME = null;
		m_mCustBase_DLV_LOC_KNAME = null;
		m_mCustBase_DLV_LOC_ENAME = null;
		m_mCustBase_ZIP_CD = null;
		m_mCustBase_ADDRESS_1 = null;
		m_mCustBase_ADDRESS_2 = null;
		m_mCustBase_ADDRESS_K_1 = null;
		m_mCustBase_ADDRESS_K_2 = null;
		m_mCustBase_TEL = null;
		m_mCustBase_FAX = null;
		m_mCustBase_SHIP_WH_CD = null;
		m_mCustBase_TRANSPORT_CD = null;
		m_mCustBase_TRANSPORT_NAME = null;
		m_mCustBase_TRANSPORT_LT = null;
		m_mCustBase_CAL_NO = null;
		m_mCustBase_TRANSPORT_TYP = null;
		m_mCustBase_DLV_START_TIME = null;
		m_mCustBase_DLV_END_TIME = null;
		m_mCustBase_AREA_CLASS_TYP1 = null;
		m_mCustBase_AREA_CLASS_1 = null;
		m_mCustBase_AREA_CLASS_TYP2 = null;
		m_mCustBase_AREA_CLASS_2 = null;
		m_mCustBase_AREA_CLASS_TYP3 = null;
		m_mCustBase_AREA_CLASS_3 = null;
		m_mCustBase_REMARKS_1 = null;
		m_mCustBase_REMARKS_2 = null;
		m_mCustBase_REMARKS_3 = null;
		m_mCustBase_DEPO_WH_CD = null;
		m_mCustBase_IN_COMPANYCD = null;
		m_mCustBase_IN_CUSTCD = null;
		m_mCustBase_IN_DLVLOCCD = null;
		m_mCust_COMPANY_CD = null;
		m_mCust_CUST_CD = null;
		m_mCust_CUST_NAME = null;
		m_mCust_CUST_ANAME = null;
		m_mCust_CUST_KNAME = null;
		m_mCust_OWN_ORG_CD = null;
		m_mCust_OWN_PERSON_CD = null;
		m_mCust_CUR_CD = null;
		m_mCust_EXCH_TYP = null;
		m_mCust_TAX_APPLY_TYP = null;
		m_mCust_TAX_CD = null;
		m_mCust_TAX_CALC_TYP = null;
		m_mCust_PRICE_ROUND_TYP = null;
		m_mCust_DETAIL_ROUND_TYP = null;
		m_mCust_UNCONFIRM_ODR_EFF_PRIOD = null;
		m_mCust_UNCONFIRM_ODR_EFF_TERM_FLG = null;
		m_mCust_EDI_CUST_VEND_CD = null;
		m_mCust_PARTIAL_SHIP_INST_FLG = null;
		m_mCust_DEPO_TYP = null;
		m_mCust_INSPC_ACPT_TYP = null;
		m_mCust_IN_COMPANYCD = null;
		m_mCust_IN_CUSTCD = null;
		m_strYotaku_WH_CD = null;
		m_strYotaku_IN_WH_TYP = null;
		m_in_tShipSlip_SLIP_CD = null;
		m_in_tShipSlip_ITEM_CD = null;
		m_in_tShipSlip_CUST_ITEM_CD = null;
		m_in_tShipSlip_PART_NAME = null;
		m_in_tShipSlip_CUST_ODR_NO = null;
		m_in_tShipSlip_CUST_CD = null;
		m_in_tShipSlip_CUST_NAME = null;
		m_in_tShipSlip_DLV_LOC_CD = null;
		m_in_tShipSlip_DLV_LOC_NAME_KANJI = null;
		m_in_tShipSlip_CUS_DLV_KEY_CD = null;
		m_in_tShipSlip_DESINATED_SHIP_DATE = null;
		m_in_tShipSlip_DESINATED_DLV_DATE = null;
		m_in_tShipSlip_SCDL_DLV_DATE = null;
		m_in_tShipSlip_SHIP_ODR_QTY = null;
		m_in_tShipSlip_UNIT_CD = null;
		m_in_tShipSlip_UNIT_PRICE = null;
		m_in_tShipSlip_SHIP_ODR_AMOUNT = null;
		m_in_tShipSlip_TAX_AMOUNT = null;
		m_in_tShipSlip_INSPC_TYP = null;
		m_in_tShipSlip_CLIENT_REMARK_KANJI = null;
		m_in_tShipSlip_CLIENT_BARCODE_INF = null;
		m_in_tShipSlip_PRINT_FLG = null;
		m_in_tShipSlip_DEL_FLG = null;
		m_in_tShipSlip_BUYER_NAME = null;
		m_in_tShipSlip_PUCH_ODR_QTY_TOTAL = null;
		m_in_tShipSlip_DLV_ODR_QTY = null;
		m_in_tShipSlip_SHIP_ODR_AMOUNT_TAX = null;
		m_in_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT = null;
		m_in_tShipSlip_INTERNAL_TAX_SALES_AMOUNT = null;
		m_in_tShipSlip_TAXFREE_SALES_AMOUNT = null;
		m_in_tShipSlip_TAX_CREDIT_SALES_AMOUNT = null;
		m_in_tShipSlip_EXTERNAL_TAX_AMOUNT = null;
		m_in_tShipSlip_INTERNAL_TAX_AMOUNT = null;
		m_in_tShipSlip_TAX_AMOUNT_1 = null;
		m_in_tShipSlip_TAX_AMOUNT_2 = null;
		m_in_tShipSlip_TAX_AMOUNT_3 = null;
		m_in_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;
		m_del_tShipSlip_IN_SLIPCD = null;
		m_uptOdr_SHIP_CNT = null;
		m_tUnShipList_UN_SHIP_SEQ_NO = null;
		m_tUnShipList_CUST_CD = null;
		m_tUnShipList_ACPT_ODR_CD = null;
		m_tUnShipList_PART_DLV_SEQ_NO = null;
		m_tUnShipList_ITEM_CD = null;
		m_tUnShipList_UN_SHIP_QTY = null;
		m_tUnShipList_UN_SHIP_RSN = null;
		m_tUnShipList_WH_CD = null;
		m_tUnShipList_PRINT_FLG = null;
		m_tUnShipList_DEL_FLG = null;
		m_tori_tAnsDlvDate_REST_SHIP_ODR_QTY = null;
		m_tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG = null;
		m_tori_tAnsDlvDate_IN_ODRNO = null;
		m_tori_tAnsDlvDate_IN_PARTDLVSEQNO = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;
		m_strTAX_CD = null;
		m_SHIP_MODIFY_COUNT = null;
		m_SEL_MODIFY_COUNT = null;

		l_r1_SHIP_ODR = null;
		l_r2_SHIP_ODR = null;
		l_tAnsDlvDate_MODIFY_COUNT = null;
		l_tShipOdr_MODIFY_COUNT = null;
		l_Shipt_MODIFY_COUNT = null;
		l_h_RESULT = null;
		l_strBUSINESS_OPR_DATE = null;
		l_strPLANT_CD = null;
		l_strTaxTAX_KBN = null;
		l_strTaxOLD_TAX_1 = null;
		l_strTaxOLD_TAX_2 = null;
		l_strTaxOLD_TAX_3 = null;
		l_strTaxNEW_TAX_1 = null;
		l_strTaxNEW_TAX_2 = null;
		l_strTaxNEW_TAX_3 = null;
		l_strTaxSTART_DATE = null;
		l_strTaxROUND_TYP = null;
		l_strTaxIN_COMPANYCD = null;
		l_strTaxIN_CUSTCD = null;
		l_l_CUST_ITEM_CD = null;
		l_tDECIMAL_FIG = null;
		l_tCUR_CD = null;
		l_strCOMPANY_CD = null;
		l_strUSER_NAME = null;
		l_strSECTION_CD = null;
		l_strPLANT_NAME = null;
		l_strPLANT_ANAME = null;
		l_strCAL_NO = null;
		l_strUSER_CD = null;
		l_strSYUKA_LT = null;
		l_tHOLIDAY_FLG = null;
		l_tWH_CD = null;
		l_tCAL_DATE = null;
		l_l_ODR_NO = null;
		l_l_PART_DLV_SEQ_NO = null;
		l_l_DESINATED_DLV_DATE = null;
		l_l_DESINATED_SHIP_DATE = null;
		l_l_SHIP_QTY = null;
		l_l_REST_SHIP_QTY = null;
		l_l_WH_CD = null;
		l_l_WH_NAME = null;
		l_l_CUST_ODR_NO = null;
		l_l_CUST_CD = null;
		l_l_CUST_NAME = null;
		l_l_CUST_ITEM_NAME = null;
		l_l_ITEM_CD = null;
		l_l_ITEM_NAME = null;
		l_l_STOCK_UNIT = null;
		l_l_UNIT_QTY_TYP = null;
		l_l_MRP_ODR_TYP = null;
		l_l_ODR_CTL_NO = null;
		l_l_TRANSPORT_TYP = null;
		l_l_ODR_UNIT_PRICE = null;
		l_l_SPCL_PRICE_TYP = null;
		l_l_PARTIAL_SHIP_INST_FLG = null;
		l_l_MODIFY_COUNT = null;
		l_l_JOB_ODR_CD = null;
		l_ODR_NO = null;
		l_ITEM_CD = null;
		l_DESINATED_DLV_DATE = null;
		l_DESINATED_SHIP_DATE = null;
		l_CUST_CD = null;
		l_CUST_CHRG_PSN_CD = null;
		l_CUST_ODR_NO = null;
		l_CUST_ITEM_CD = null;
		l_up_tAnsDlvDate_DESINATED_SHIP_DATE = null;
		l_up_tAnsDlvDate_REST_SHIP_ODR_QTY = null;
		l_up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG = null;
		l_up_tAnsDlvDate_IN_ODRNO = null;
		l_up_tAnsDlvDate_IN_PARTDLVSEQNO = null;
		l_l_SLIP_CD = null;
		l_l_c_DIRECT_DLV_FLG = null;
		l_l_DLV_MODIFY_COUNT = null;
		l_SLIP_CD = null;
		l_in_tShipOdr_ODR_NO = null;
		l_in_tShipOdr_PART_DLV_SEQ_NO = null;
		l_in_tShipOdr_SLIP_CD = null;
		l_in_tShipOdr_ITEM_CD = null;
		l_in_tShipOdr_CUST_ITEM_CD = null;
		l_in_tShipOdr_CUST_ODR_NO = null;
		l_in_tShipOdr_CUST_CD = null;
		l_in_tShipOdr_CUST_NAME = null;
		l_in_tShipOdr_SHIP_ODR_ISS_PSN_CD = null;
		l_in_tShipOdr_DLV_LOC_CD = null;
		l_in_tShipOdr_DESINATED_SHIP_DATE = null;
		l_in_tShipOdr_SHIP_QTY = null;
		l_in_tShipOdr_UNIT_PRICE = null;
		l_in_tShipOdr_SHIP_ODR_AMOUNT = null;
		l_in_tShipOdr_CURRNCY_CD = null;
		l_in_tShipOdr_PKG_UNIT_QTY = null;
		l_in_tShipOdr_REMARKS = null;
		l_in_tShipOdr_ALLCT_WH_CD = null;
		l_in_tShipOdr_DEPO_TYP = null;
		l_in_tShipOdr_ENTRY_TYP = null;
		l_in_tShipOdr_PRINT_FLG = null;
		l_in_tShipOdr_SHP_CMPLT_FLG = null;
		l_in_tShipOdr_DEL_FLG = null;
		l_in_tShipOdr_TRANSPORT_CD = null;
		l_in_tShipOdr_DIRECT_DLV_FLG = null;
		l_in_tShipOdr_CUST_CHRG_PSN_CD = null;
		l_in_tShipOdr_UNIT_CD = null;
		l_in_tShipOdr_SCDL_DLV_DATE = null;
		l_in_tShipOdr_TRANSFER_WH_CD = null;
		l_in_tShipOdr_DLV_KEY_NO = null;
		l_in_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES = null;
		l_in_tShipOdr_SHIP_ODR_NO = null;
		l_in_tShipOdr_JOB_ODR_CD = null;
		l_del_tShipOdr_IN_SLIPCD = null;
		l_chkisinWhCd_WH_CD = null;
		l_chkisinWhCd_WH_TYP = null;
		l_chkis_IN_WHCD = null;
		l_chkisWhCd_WH_CD = null;
		l_chkisWhCd_WH_TYP = null;
		l_chkisWhCd_ITEM_CD = null;
		l_chkisWhCd_PBL_SHIP_QTY = null;
		l_chkisWhCd_IN_ITEMCD = null;
		l_chkisWhCd_IN_WHCD = null;
		l_tOdr_ODR_NO = null;
		l_tOdr_ODR_TYP = null;
		l_tOdr_ODR_CTL_NO = null;
		l_tOdr_CUST_ODR_NO = null;
		l_tOdr_CUST_CHRG_ORG_CD = null;
		l_tOdr_CUST_CHRG_PSN_CD = null;
		l_tOdr_ODR_ACPT_ORG_CD = null;
		l_tOdr_ODR_ACPT_PSN_CD = null;
		l_tOdr_CURRNCY_CD = null;
		l_tOdr_EXCH_TYP = null;
		l_tOdr_DLV_LOC_CD = null;
		l_tOdr_DLV_LOC_CD_EIAJ = null;
		l_tOdr_DLV_LOC_NAME = null;
		l_tOdr_DLV_LOC_NAME_KANJI = null;
		l_tOdr_PRD_ODR_PLACE_CD = null;
		l_tOdr_ODR_UNIT_PRICE = null;
		l_tOdr_SPCL_PRICE_TYP = null;
		l_tOdr_PART_DLV_COUNT = null;
		l_tOdr_DEPO_TYP = null;
		l_tOdr_DESINATED_DLV_DATE = null;
		l_tOdr_STD_DESINATED_RCV_DATE = null;
		l_tOdr_ODR_QTY = null;
		l_tOdr_REMAIN_UNCONFIRM_ODR_QTY = null;
		l_tOdr_CANCELED_UNCONFIRM_ODR_QTY = null;
		l_tOdr_UNIT_CD = null;
		l_tOdr_UNCONFIRM_ODR_BALANCE = null;
		l_tOdr_ODR_AMOUNT = null;
		l_tOdr_ODR_AMOUNT_EXCH_RATES = null;
		l_tOdr_TOTAL_SHIP_QTY = null;
		l_tOdr_SHIP_AMOUNT = null;
		l_tOdr_SHIP_AMOUNT_EXCH_RATES = null;
		l_tOdr_RETURN_PRICE = null;
		l_tOdr_RETURN_QTY = null;
		l_tOdr_RETURN_AMOUNT = null;
		l_tOdr_RETURN_AMOUNT_EXCH_RATES = null;
		l_tOdr_ODR_CMPLT_FLG = null;
		l_tOdr_ODR_CMPLT_DATE = null;
		l_tOdr_CUS_DLV_CD = null;
		l_tOdr_CUS_DLV_KEY_CD = null;
		l_tOdr_PART_NAME = null;
		l_tOdr_PKG_UNIT = null;
		l_tOdr_SLIP_PRICE_PRINT_TYP = null;
		l_tOdr_INSPC_TYP = null;
		l_tOdr_CLIENT_REMARK = null;
		l_tOdr_CLIENT_REMARK_KANJI = null;
		l_tOdr_CLIENT_BARCODE_INF = null;
		l_tOdr_TRANSPORT_CD = null;
		l_tOdr_TRANSPORT_TYP = null;
		l_tOdr_TAX_APPLY_TYP = null;
		l_tOdr_TAX_CD = null;
		l_tOdr_TAX_CALC_TYP = null;
		l_tOdr_REMARKS = null;
		l_tOdr_ODR_ACPT_DATE = null;
		l_tOdr_SHIP_PLAN_REMAIN_QTY = null;
		l_tOdr_SHIP_PLAN_CMPLT_FLG = null;
		l_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG = null;
		l_tOdr_PARTIAL_SHIP_INST_FLG = null;
		l_tOdr_IF_CTL_NO = null;
		l_tOdr_ENTRY_TYP = null;
		l_tOdr_BUYER_NAME = null;
		l_tOdr_PUCH_ODR_QTY_TOTAL = null;
		l_tOdr_UNIT_CD_ORG = null;
		l_tOdr_SHIP_CNT = null;
		l_tOdr_IN_ODRNO = null;
		l_uptOdr_PART_DLV_COUNT = null;
		l_uptOdr_IN_ODRNO = null;
		l_tOdrCtl_ODR_CTL_NO = null;
		l_tOdrCtl_CUST_CD = null;
		l_tOdrCtl_CUST_ITEM_CD = null;
		l_tOdrCtl_CUST_ITEM_NAME = null;
		l_tOdrCtl_ITEM_CD = null;
		l_tOdrCtl_ITEM_NAME = null;
		l_tOdrCtl_IN_ODRCTLNO = null;
		l_mItem_ITEM_CD = null;
		l_mItem_ITEM_NAME = null;
		l_mItem_PRODUCT_TYP = null;
		l_mItem_MRP_ODR_TYP = null;
		l_mItem_DRAW_CD = null;
		l_mItem_SPEC = null;
		l_mItem_HIGH_LEVEL_NO = null;
		l_mItem_OUTSIDE_TYP = null;
		l_mItem_STOCK_UNIT_FLG = null;
		l_mItem_STOCK_UNIT = null;
		l_mItem_PKG_UNIT = null;
		l_mItem_PKG_UNIT_QTY = null;
		l_mItem_UNIT_QTY_TYP = null;
		l_mItem_ODR_LT = null;
		l_mItem_FIXED_LT = null;
		l_mItem_PROP_LT = null;
		l_mItem_SAFETY_LT = null;
		l_mItem_ISSUE_LT = null;
		l_mItem_PROP_LOT_SIZE = null;
		l_mItem_ITEM_SPOIL = null;
		l_mItem_SAFETY_STOCK = null;
		l_mItem_LOT_SIZING_TYP = null;
		l_mItem_MAX_PERIOD = null;
		l_mItem_MAX_ODR_QTY = null;
		l_mItem_ODR_POINT = null;
		l_mItem_FIXED_ODR_QTY = null;
		l_mItem_MIN_ODR_QTY = null;
		l_mItem_MUL_ODR_QTY = null;
		l_mItem_ISSUE_TYP = null;
		l_mItem_MPS_FLG = null;
		l_mItem_ACPT_INSPC_TYP = null;
		l_mItem_CLASIFICATION_CD = null;
		l_mItem_UNIT_WEIGHT = null;
		l_mItem_ABC_TYP = null;
		l_mItem_OPR_RSLT_TYP = null;
		l_mItem_SPL_ITEM_TYP = null;
		l_mItem_TAX_CD = null;
		l_mItem_IN_ITEMCD = null;
		l_mCustBase_COMPANY_CD = null;
		l_mCustBase_CUST_CD = null;
		l_mCustBase_DLV_LOC_CD = null;
		l_mCustBase_DLV_LOC_NAME = null;
		l_mCustBase_DLV_LOC_KNAME = null;
		l_mCustBase_DLV_LOC_ENAME = null;
		l_mCustBase_ZIP_CD = null;
		l_mCustBase_ADDRESS_1 = null;
		l_mCustBase_ADDRESS_2 = null;
		l_mCustBase_ADDRESS_K_1 = null;
		l_mCustBase_ADDRESS_K_2 = null;
		l_mCustBase_TEL = null;
		l_mCustBase_FAX = null;
		l_mCustBase_SHIP_WH_CD = null;
		l_mCustBase_TRANSPORT_CD = null;
		l_mCustBase_TRANSPORT_NAME = null;
		l_mCustBase_TRANSPORT_LT = null;
		l_mCustBase_CAL_NO = null;
		l_mCustBase_TRANSPORT_TYP = null;
		l_mCustBase_DLV_START_TIME = null;
		l_mCustBase_DLV_END_TIME = null;
		l_mCustBase_AREA_CLASS_TYP1 = null;
		l_mCustBase_AREA_CLASS_1 = null;
		l_mCustBase_AREA_CLASS_TYP2 = null;
		l_mCustBase_AREA_CLASS_2 = null;
		l_mCustBase_AREA_CLASS_TYP3 = null;
		l_mCustBase_AREA_CLASS_3 = null;
		l_mCustBase_REMARKS_1 = null;
		l_mCustBase_REMARKS_2 = null;
		l_mCustBase_REMARKS_3 = null;
		l_mCustBase_DEPO_WH_CD = null;
		l_mCustBase_IN_COMPANYCD = null;
		l_mCustBase_IN_CUSTCD = null;
		l_mCustBase_IN_DLVLOCCD = null;
		l_mCust_COMPANY_CD = null;
		l_mCust_CUST_CD = null;
		l_mCust_CUST_NAME = null;
		l_mCust_CUST_ANAME = null;
		l_mCust_CUST_KNAME = null;
		l_mCust_OWN_ORG_CD = null;
		l_mCust_OWN_PERSON_CD = null;
		l_mCust_CUR_CD = null;
		l_mCust_EXCH_TYP = null;
		l_mCust_TAX_APPLY_TYP = null;
		l_mCust_TAX_CD = null;
		l_mCust_TAX_CALC_TYP = null;
		l_mCust_PRICE_ROUND_TYP = null;
		l_mCust_DETAIL_ROUND_TYP = null;
		l_mCust_UNCONFIRM_ODR_EFF_PRIOD = null;
		l_mCust_UNCONFIRM_ODR_EFF_TERM_FLG = null;
		l_mCust_EDI_CUST_VEND_CD = null;
		l_mCust_PARTIAL_SHIP_INST_FLG = null;
		l_mCust_DEPO_TYP = null;
		l_mCust_INSPC_ACPT_TYP = null;
		l_mCust_IN_COMPANYCD = null;
		l_mCust_IN_CUSTCD = null;
		l_strYotaku_WH_CD = null;
		l_strYotaku_IN_WH_TYP = null;
		l_in_tShipSlip_SLIP_CD = null;
		l_in_tShipSlip_ITEM_CD = null;
		l_in_tShipSlip_CUST_ITEM_CD = null;
		l_in_tShipSlip_PART_NAME = null;
		l_in_tShipSlip_CUST_ODR_NO = null;
		l_in_tShipSlip_CUST_CD = null;
		l_in_tShipSlip_CUST_NAME = null;
		l_in_tShipSlip_DLV_LOC_CD = null;
		l_in_tShipSlip_DLV_LOC_NAME_KANJI = null;
		l_in_tShipSlip_CUS_DLV_KEY_CD = null;
		l_in_tShipSlip_DESINATED_SHIP_DATE = null;
		l_in_tShipSlip_DESINATED_DLV_DATE = null;
		l_in_tShipSlip_SCDL_DLV_DATE = null;
		l_in_tShipSlip_SHIP_ODR_QTY = null;
		l_in_tShipSlip_UNIT_CD = null;
		l_in_tShipSlip_UNIT_PRICE = null;
		l_in_tShipSlip_SHIP_ODR_AMOUNT = null;
		l_in_tShipSlip_TAX_AMOUNT = null;
		l_in_tShipSlip_INSPC_TYP = null;
		l_in_tShipSlip_CLIENT_REMARK_KANJI = null;
		l_in_tShipSlip_CLIENT_BARCODE_INF = null;
		l_in_tShipSlip_PRINT_FLG = null;
		l_in_tShipSlip_DEL_FLG = null;
		l_in_tShipSlip_BUYER_NAME = null;
		l_in_tShipSlip_PUCH_ODR_QTY_TOTAL = null;
		l_in_tShipSlip_DLV_ODR_QTY = null;
		l_in_tShipSlip_SHIP_ODR_AMOUNT_TAX = null;
		l_in_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT = null;
		l_in_tShipSlip_INTERNAL_TAX_SALES_AMOUNT = null;
		l_in_tShipSlip_TAXFREE_SALES_AMOUNT = null;
		l_in_tShipSlip_TAX_CREDIT_SALES_AMOUNT = null;
		l_in_tShipSlip_EXTERNAL_TAX_AMOUNT = null;
		l_in_tShipSlip_INTERNAL_TAX_AMOUNT = null;
		l_in_tShipSlip_TAX_AMOUNT_1 = null;
		l_in_tShipSlip_TAX_AMOUNT_2 = null;
		l_in_tShipSlip_TAX_AMOUNT_3 = null;
		l_in_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;
		l_del_tShipSlip_IN_SLIPCD = null;
		l_uptOdr_SHIP_CNT = null;
		l_tUnShipList_UN_SHIP_SEQ_NO = null;
		l_tUnShipList_CUST_CD = null;
		l_tUnShipList_ACPT_ODR_CD = null;
		l_tUnShipList_PART_DLV_SEQ_NO = null;
		l_tUnShipList_ITEM_CD = null;
		l_tUnShipList_UN_SHIP_QTY = null;
		l_tUnShipList_UN_SHIP_RSN = null;
		l_tUnShipList_WH_CD = null;
		l_tUnShipList_PRINT_FLG = null;
		l_tUnShipList_DEL_FLG = null;
		l_tori_tAnsDlvDate_REST_SHIP_ODR_QTY = null;
		l_tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG = null;
		l_tori_tAnsDlvDate_IN_ODRNO = null;
		l_tori_tAnsDlvDate_IN_PARTDLVSEQNO = null;
		l_l_COUNT = null;
		l_ROW_COUNT = null;
		l_strTAX_CD = null;
		l_SHIP_MODIFY_COUNT = null;
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
	 * medKU0060010クラスの標準コンストラクタ
	 */
	public KU0060010Struct()
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
	public void setStruct(KU0060010Struct struct)
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
	public void setStructM(KU0060010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setr1_SHIP_ODR(struct.getr1_SHIP_ODR());
			this.setr2_SHIP_ODR(struct.getr2_SHIP_ODR());
			this.settAnsDlvDate_MODIFY_COUNT(struct.gettAnsDlvDate_MODIFY_COUNT());
			this.settShipOdr_MODIFY_COUNT(struct.gettShipOdr_MODIFY_COUNT());
			this.setShipt_MODIFY_COUNT(struct.getShipt_MODIFY_COUNT());
			this.seth_RESULT(struct.geth_RESULT());
			this.setstrBUSINESS_OPR_DATE(struct.getstrBUSINESS_OPR_DATE());
			this.setstrPLANT_CD(struct.getstrPLANT_CD());
			this.setstrTaxTAX_KBN(struct.getstrTaxTAX_KBN());
			this.setstrTaxOLD_TAX_1(struct.getstrTaxOLD_TAX_1());
			this.setstrTaxOLD_TAX_2(struct.getstrTaxOLD_TAX_2());
			this.setstrTaxOLD_TAX_3(struct.getstrTaxOLD_TAX_3());
			this.setstrTaxNEW_TAX_1(struct.getstrTaxNEW_TAX_1());
			this.setstrTaxNEW_TAX_2(struct.getstrTaxNEW_TAX_2());
			this.setstrTaxNEW_TAX_3(struct.getstrTaxNEW_TAX_3());
			this.setstrTaxSTART_DATE(struct.getstrTaxSTART_DATE());
			this.setstrTaxROUND_TYP(struct.getstrTaxROUND_TYP());
			this.setstrTaxIN_COMPANYCD(struct.getstrTaxIN_COMPANYCD());
			this.setstrTaxIN_CUSTCD(struct.getstrTaxIN_CUSTCD());
			this.setl_CUST_ITEM_CD(struct.getl_CUST_ITEM_CD());
			this.settDECIMAL_FIG(struct.gettDECIMAL_FIG());
			this.settCUR_CD(struct.gettCUR_CD());
			this.setstrCOMPANY_CD(struct.getstrCOMPANY_CD());
			this.setstrUSER_NAME(struct.getstrUSER_NAME());
			this.setstrSECTION_CD(struct.getstrSECTION_CD());
			this.setstrPLANT_NAME(struct.getstrPLANT_NAME());
			this.setstrPLANT_ANAME(struct.getstrPLANT_ANAME());
			this.setstrCAL_NO(struct.getstrCAL_NO());
			this.setstrUSER_CD(struct.getstrUSER_CD());
			this.setstrSYUKA_LT(struct.getstrSYUKA_LT());
			this.settHOLIDAY_FLG(struct.gettHOLIDAY_FLG());
			this.settWH_CD(struct.gettWH_CD());
			this.settCAL_DATE(struct.gettCAL_DATE());
			this.setl_ODR_NO(struct.getl_ODR_NO());
			this.setl_PART_DLV_SEQ_NO(struct.getl_PART_DLV_SEQ_NO());
			this.setl_DESINATED_DLV_DATE(struct.getl_DESINATED_DLV_DATE());
			this.setl_DESINATED_SHIP_DATE(struct.getl_DESINATED_SHIP_DATE());
			this.setl_SHIP_QTY(struct.getl_SHIP_QTY());
			this.setl_REST_SHIP_QTY(struct.getl_REST_SHIP_QTY());
			this.setl_WH_CD(struct.getl_WH_CD());
			this.setl_WH_NAME(struct.getl_WH_NAME());
			this.setl_CUST_ODR_NO(struct.getl_CUST_ODR_NO());
			this.setl_CUST_CD(struct.getl_CUST_CD());
			this.setl_CUST_NAME(struct.getl_CUST_NAME());
			this.setl_CUST_ITEM_NAME(struct.getl_CUST_ITEM_NAME());
			this.setl_ITEM_CD(struct.getl_ITEM_CD());
			this.setl_ITEM_NAME(struct.getl_ITEM_NAME());
			this.setl_STOCK_UNIT(struct.getl_STOCK_UNIT());
			this.setl_UNIT_QTY_TYP(struct.getl_UNIT_QTY_TYP());
			this.setl_MRP_ODR_TYP(struct.getl_MRP_ODR_TYP());
			this.setl_ODR_CTL_NO(struct.getl_ODR_CTL_NO());
			this.setl_TRANSPORT_TYP(struct.getl_TRANSPORT_TYP());
			this.setl_ODR_UNIT_PRICE(struct.getl_ODR_UNIT_PRICE());
			this.setl_SPCL_PRICE_TYP(struct.getl_SPCL_PRICE_TYP());
			this.setl_PARTIAL_SHIP_INST_FLG(struct.getl_PARTIAL_SHIP_INST_FLG());
			this.setl_MODIFY_COUNT(struct.getl_MODIFY_COUNT());
			this.setl_JOB_ODR_CD(struct.getl_JOB_ODR_CD());
			this.setODR_NO(struct.getODR_NO());
			this.setITEM_CD(struct.getITEM_CD());
			this.setDESINATED_DLV_DATE(struct.getDESINATED_DLV_DATE());
			this.setDESINATED_SHIP_DATE(struct.getDESINATED_SHIP_DATE());
			this.setCUST_CD(struct.getCUST_CD());
			this.setCUST_CHRG_PSN_CD(struct.getCUST_CHRG_PSN_CD());
			this.setCUST_ODR_NO(struct.getCUST_ODR_NO());
			this.setCUST_ITEM_CD(struct.getCUST_ITEM_CD());
			this.setup_tAnsDlvDate_DESINATED_SHIP_DATE(struct.getup_tAnsDlvDate_DESINATED_SHIP_DATE());
			this.setup_tAnsDlvDate_REST_SHIP_ODR_QTY(struct.getup_tAnsDlvDate_REST_SHIP_ODR_QTY());
			this.setup_tAnsDlvDate_SHIP_ODR_CMPLT_FLG(struct.getup_tAnsDlvDate_SHIP_ODR_CMPLT_FLG());
			this.setup_tAnsDlvDate_IN_ODRNO(struct.getup_tAnsDlvDate_IN_ODRNO());
			this.setup_tAnsDlvDate_IN_PARTDLVSEQNO(struct.getup_tAnsDlvDate_IN_PARTDLVSEQNO());
			this.setl_SLIP_CD(struct.getl_SLIP_CD());
			this.setl_c_DIRECT_DLV_FLG(struct.getl_c_DIRECT_DLV_FLG());
			this.setl_DLV_MODIFY_COUNT(struct.getl_DLV_MODIFY_COUNT());
			this.setSLIP_CD(struct.getSLIP_CD());
			this.setin_tShipOdr_ODR_NO(struct.getin_tShipOdr_ODR_NO());
			this.setin_tShipOdr_PART_DLV_SEQ_NO(struct.getin_tShipOdr_PART_DLV_SEQ_NO());
			this.setin_tShipOdr_SLIP_CD(struct.getin_tShipOdr_SLIP_CD());
			this.setin_tShipOdr_ITEM_CD(struct.getin_tShipOdr_ITEM_CD());
			this.setin_tShipOdr_CUST_ITEM_CD(struct.getin_tShipOdr_CUST_ITEM_CD());
			this.setin_tShipOdr_CUST_ODR_NO(struct.getin_tShipOdr_CUST_ODR_NO());
			this.setin_tShipOdr_CUST_CD(struct.getin_tShipOdr_CUST_CD());
			this.setin_tShipOdr_CUST_NAME(struct.getin_tShipOdr_CUST_NAME());
			this.setin_tShipOdr_SHIP_ODR_ISS_PSN_CD(struct.getin_tShipOdr_SHIP_ODR_ISS_PSN_CD());
			this.setin_tShipOdr_DLV_LOC_CD(struct.getin_tShipOdr_DLV_LOC_CD());
			this.setin_tShipOdr_DESINATED_SHIP_DATE(struct.getin_tShipOdr_DESINATED_SHIP_DATE());
			this.setin_tShipOdr_SHIP_QTY(struct.getin_tShipOdr_SHIP_QTY());
			this.setin_tShipOdr_UNIT_PRICE(struct.getin_tShipOdr_UNIT_PRICE());
			this.setin_tShipOdr_SHIP_ODR_AMOUNT(struct.getin_tShipOdr_SHIP_ODR_AMOUNT());
			this.setin_tShipOdr_CURRNCY_CD(struct.getin_tShipOdr_CURRNCY_CD());
			this.setin_tShipOdr_PKG_UNIT_QTY(struct.getin_tShipOdr_PKG_UNIT_QTY());
			this.setin_tShipOdr_REMARKS(struct.getin_tShipOdr_REMARKS());
			this.setin_tShipOdr_ALLCT_WH_CD(struct.getin_tShipOdr_ALLCT_WH_CD());
			this.setin_tShipOdr_DEPO_TYP(struct.getin_tShipOdr_DEPO_TYP());
			this.setin_tShipOdr_ENTRY_TYP(struct.getin_tShipOdr_ENTRY_TYP());
			this.setin_tShipOdr_PRINT_FLG(struct.getin_tShipOdr_PRINT_FLG());
			this.setin_tShipOdr_SHP_CMPLT_FLG(struct.getin_tShipOdr_SHP_CMPLT_FLG());
			this.setin_tShipOdr_DEL_FLG(struct.getin_tShipOdr_DEL_FLG());
			this.setin_tShipOdr_TRANSPORT_CD(struct.getin_tShipOdr_TRANSPORT_CD());
			this.setin_tShipOdr_DIRECT_DLV_FLG(struct.getin_tShipOdr_DIRECT_DLV_FLG());
			this.setin_tShipOdr_CUST_CHRG_PSN_CD(struct.getin_tShipOdr_CUST_CHRG_PSN_CD());
			this.setin_tShipOdr_UNIT_CD(struct.getin_tShipOdr_UNIT_CD());
			this.setin_tShipOdr_SCDL_DLV_DATE(struct.getin_tShipOdr_SCDL_DLV_DATE());
			this.setin_tShipOdr_TRANSFER_WH_CD(struct.getin_tShipOdr_TRANSFER_WH_CD());
			this.setin_tShipOdr_DLV_KEY_NO(struct.getin_tShipOdr_DLV_KEY_NO());
			this.setin_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES(struct.getin_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES());
			this.setin_tShipOdr_SHIP_ODR_NO(struct.getin_tShipOdr_SHIP_ODR_NO());
			this.setin_tShipOdr_JOB_ODR_CD(struct.getin_tShipOdr_JOB_ODR_CD());
			this.setdel_tShipOdr_IN_SLIPCD(struct.getdel_tShipOdr_IN_SLIPCD());
			this.setchkisinWhCd_WH_CD(struct.getchkisinWhCd_WH_CD());
			this.setchkisinWhCd_WH_TYP(struct.getchkisinWhCd_WH_TYP());
			this.setchkis_IN_WHCD(struct.getchkis_IN_WHCD());
			this.setchkisWhCd_WH_CD(struct.getchkisWhCd_WH_CD());
			this.setchkisWhCd_WH_TYP(struct.getchkisWhCd_WH_TYP());
			this.setchkisWhCd_ITEM_CD(struct.getchkisWhCd_ITEM_CD());
			this.setchkisWhCd_PBL_SHIP_QTY(struct.getchkisWhCd_PBL_SHIP_QTY());
			this.setchkisWhCd_IN_ITEMCD(struct.getchkisWhCd_IN_ITEMCD());
			this.setchkisWhCd_IN_WHCD(struct.getchkisWhCd_IN_WHCD());
			this.settOdr_ODR_NO(struct.gettOdr_ODR_NO());
			this.settOdr_ODR_TYP(struct.gettOdr_ODR_TYP());
			this.settOdr_ODR_CTL_NO(struct.gettOdr_ODR_CTL_NO());
			this.settOdr_CUST_ODR_NO(struct.gettOdr_CUST_ODR_NO());
			this.settOdr_CUST_CHRG_ORG_CD(struct.gettOdr_CUST_CHRG_ORG_CD());
			this.settOdr_CUST_CHRG_PSN_CD(struct.gettOdr_CUST_CHRG_PSN_CD());
			this.settOdr_ODR_ACPT_ORG_CD(struct.gettOdr_ODR_ACPT_ORG_CD());
			this.settOdr_ODR_ACPT_PSN_CD(struct.gettOdr_ODR_ACPT_PSN_CD());
			this.settOdr_CURRNCY_CD(struct.gettOdr_CURRNCY_CD());
			this.settOdr_EXCH_TYP(struct.gettOdr_EXCH_TYP());
			this.settOdr_DLV_LOC_CD(struct.gettOdr_DLV_LOC_CD());
			this.settOdr_DLV_LOC_CD_EIAJ(struct.gettOdr_DLV_LOC_CD_EIAJ());
			this.settOdr_DLV_LOC_NAME(struct.gettOdr_DLV_LOC_NAME());
			this.settOdr_DLV_LOC_NAME_KANJI(struct.gettOdr_DLV_LOC_NAME_KANJI());
			this.settOdr_PRD_ODR_PLACE_CD(struct.gettOdr_PRD_ODR_PLACE_CD());
			this.settOdr_ODR_UNIT_PRICE(struct.gettOdr_ODR_UNIT_PRICE());
			this.settOdr_SPCL_PRICE_TYP(struct.gettOdr_SPCL_PRICE_TYP());
			this.settOdr_PART_DLV_COUNT(struct.gettOdr_PART_DLV_COUNT());
			this.settOdr_DEPO_TYP(struct.gettOdr_DEPO_TYP());
			this.settOdr_DESINATED_DLV_DATE(struct.gettOdr_DESINATED_DLV_DATE());
			this.settOdr_STD_DESINATED_RCV_DATE(struct.gettOdr_STD_DESINATED_RCV_DATE());
			this.settOdr_ODR_QTY(struct.gettOdr_ODR_QTY());
			this.settOdr_REMAIN_UNCONFIRM_ODR_QTY(struct.gettOdr_REMAIN_UNCONFIRM_ODR_QTY());
			this.settOdr_CANCELED_UNCONFIRM_ODR_QTY(struct.gettOdr_CANCELED_UNCONFIRM_ODR_QTY());
			this.settOdr_UNIT_CD(struct.gettOdr_UNIT_CD());
			this.settOdr_UNCONFIRM_ODR_BALANCE(struct.gettOdr_UNCONFIRM_ODR_BALANCE());
			this.settOdr_ODR_AMOUNT(struct.gettOdr_ODR_AMOUNT());
			this.settOdr_ODR_AMOUNT_EXCH_RATES(struct.gettOdr_ODR_AMOUNT_EXCH_RATES());
			this.settOdr_TOTAL_SHIP_QTY(struct.gettOdr_TOTAL_SHIP_QTY());
			this.settOdr_SHIP_AMOUNT(struct.gettOdr_SHIP_AMOUNT());
			this.settOdr_SHIP_AMOUNT_EXCH_RATES(struct.gettOdr_SHIP_AMOUNT_EXCH_RATES());
			this.settOdr_RETURN_PRICE(struct.gettOdr_RETURN_PRICE());
			this.settOdr_RETURN_QTY(struct.gettOdr_RETURN_QTY());
			this.settOdr_RETURN_AMOUNT(struct.gettOdr_RETURN_AMOUNT());
			this.settOdr_RETURN_AMOUNT_EXCH_RATES(struct.gettOdr_RETURN_AMOUNT_EXCH_RATES());
			this.settOdr_ODR_CMPLT_FLG(struct.gettOdr_ODR_CMPLT_FLG());
			this.settOdr_ODR_CMPLT_DATE(struct.gettOdr_ODR_CMPLT_DATE());
			this.settOdr_CUS_DLV_CD(struct.gettOdr_CUS_DLV_CD());
			this.settOdr_CUS_DLV_KEY_CD(struct.gettOdr_CUS_DLV_KEY_CD());
			this.settOdr_PART_NAME(struct.gettOdr_PART_NAME());
			this.settOdr_PKG_UNIT(struct.gettOdr_PKG_UNIT());
			this.settOdr_SLIP_PRICE_PRINT_TYP(struct.gettOdr_SLIP_PRICE_PRINT_TYP());
			this.settOdr_INSPC_TYP(struct.gettOdr_INSPC_TYP());
			this.settOdr_CLIENT_REMARK(struct.gettOdr_CLIENT_REMARK());
			this.settOdr_CLIENT_REMARK_KANJI(struct.gettOdr_CLIENT_REMARK_KANJI());
			this.settOdr_CLIENT_BARCODE_INF(struct.gettOdr_CLIENT_BARCODE_INF());
			this.settOdr_TRANSPORT_CD(struct.gettOdr_TRANSPORT_CD());
			this.settOdr_TRANSPORT_TYP(struct.gettOdr_TRANSPORT_TYP());
			this.settOdr_TAX_APPLY_TYP(struct.gettOdr_TAX_APPLY_TYP());
			this.settOdr_TAX_CD(struct.gettOdr_TAX_CD());
			this.settOdr_TAX_CALC_TYP(struct.gettOdr_TAX_CALC_TYP());
			this.settOdr_REMARKS(struct.gettOdr_REMARKS());
			this.settOdr_ODR_ACPT_DATE(struct.gettOdr_ODR_ACPT_DATE());
			this.settOdr_SHIP_PLAN_REMAIN_QTY(struct.gettOdr_SHIP_PLAN_REMAIN_QTY());
			this.settOdr_SHIP_PLAN_CMPLT_FLG(struct.gettOdr_SHIP_PLAN_CMPLT_FLG());
			this.settOdr_UNCONFIRMED_ODR_EFF_OVR_FLG(struct.gettOdr_UNCONFIRMED_ODR_EFF_OVR_FLG());
			this.settOdr_PARTIAL_SHIP_INST_FLG(struct.gettOdr_PARTIAL_SHIP_INST_FLG());
			this.settOdr_IF_CTL_NO(struct.gettOdr_IF_CTL_NO());
			this.settOdr_ENTRY_TYP(struct.gettOdr_ENTRY_TYP());
			this.settOdr_BUYER_NAME(struct.gettOdr_BUYER_NAME());
			this.settOdr_PUCH_ODR_QTY_TOTAL(struct.gettOdr_PUCH_ODR_QTY_TOTAL());
			this.settOdr_UNIT_CD_ORG(struct.gettOdr_UNIT_CD_ORG());
			this.settOdr_SHIP_CNT(struct.gettOdr_SHIP_CNT());
			this.settOdr_IN_ODRNO(struct.gettOdr_IN_ODRNO());
			this.setuptOdr_PART_DLV_COUNT(struct.getuptOdr_PART_DLV_COUNT());
			this.setuptOdr_IN_ODRNO(struct.getuptOdr_IN_ODRNO());
			this.settOdrCtl_ODR_CTL_NO(struct.gettOdrCtl_ODR_CTL_NO());
			this.settOdrCtl_CUST_CD(struct.gettOdrCtl_CUST_CD());
			this.settOdrCtl_CUST_ITEM_CD(struct.gettOdrCtl_CUST_ITEM_CD());
			this.settOdrCtl_CUST_ITEM_NAME(struct.gettOdrCtl_CUST_ITEM_NAME());
			this.settOdrCtl_ITEM_CD(struct.gettOdrCtl_ITEM_CD());
			this.settOdrCtl_ITEM_NAME(struct.gettOdrCtl_ITEM_NAME());
			this.settOdrCtl_IN_ODRCTLNO(struct.gettOdrCtl_IN_ODRCTLNO());
			this.setmItem_ITEM_CD(struct.getmItem_ITEM_CD());
			this.setmItem_ITEM_NAME(struct.getmItem_ITEM_NAME());
			this.setmItem_PRODUCT_TYP(struct.getmItem_PRODUCT_TYP());
			this.setmItem_MRP_ODR_TYP(struct.getmItem_MRP_ODR_TYP());
			this.setmItem_DRAW_CD(struct.getmItem_DRAW_CD());
			this.setmItem_SPEC(struct.getmItem_SPEC());
			this.setmItem_HIGH_LEVEL_NO(struct.getmItem_HIGH_LEVEL_NO());
			this.setmItem_OUTSIDE_TYP(struct.getmItem_OUTSIDE_TYP());
			this.setmItem_STOCK_UNIT_FLG(struct.getmItem_STOCK_UNIT_FLG());
			this.setmItem_STOCK_UNIT(struct.getmItem_STOCK_UNIT());
			this.setmItem_PKG_UNIT(struct.getmItem_PKG_UNIT());
			this.setmItem_PKG_UNIT_QTY(struct.getmItem_PKG_UNIT_QTY());
			this.setmItem_UNIT_QTY_TYP(struct.getmItem_UNIT_QTY_TYP());
			this.setmItem_ODR_LT(struct.getmItem_ODR_LT());
			this.setmItem_FIXED_LT(struct.getmItem_FIXED_LT());
			this.setmItem_PROP_LT(struct.getmItem_PROP_LT());
			this.setmItem_SAFETY_LT(struct.getmItem_SAFETY_LT());
			this.setmItem_ISSUE_LT(struct.getmItem_ISSUE_LT());
			this.setmItem_PROP_LOT_SIZE(struct.getmItem_PROP_LOT_SIZE());
			this.setmItem_ITEM_SPOIL(struct.getmItem_ITEM_SPOIL());
			this.setmItem_SAFETY_STOCK(struct.getmItem_SAFETY_STOCK());
			this.setmItem_LOT_SIZING_TYP(struct.getmItem_LOT_SIZING_TYP());
			this.setmItem_MAX_PERIOD(struct.getmItem_MAX_PERIOD());
			this.setmItem_MAX_ODR_QTY(struct.getmItem_MAX_ODR_QTY());
			this.setmItem_ODR_POINT(struct.getmItem_ODR_POINT());
			this.setmItem_FIXED_ODR_QTY(struct.getmItem_FIXED_ODR_QTY());
			this.setmItem_MIN_ODR_QTY(struct.getmItem_MIN_ODR_QTY());
			this.setmItem_MUL_ODR_QTY(struct.getmItem_MUL_ODR_QTY());
			this.setmItem_ISSUE_TYP(struct.getmItem_ISSUE_TYP());
			this.setmItem_MPS_FLG(struct.getmItem_MPS_FLG());
			this.setmItem_ACPT_INSPC_TYP(struct.getmItem_ACPT_INSPC_TYP());
			this.setmItem_CLASIFICATION_CD(struct.getmItem_CLASIFICATION_CD());
			this.setmItem_UNIT_WEIGHT(struct.getmItem_UNIT_WEIGHT());
			this.setmItem_ABC_TYP(struct.getmItem_ABC_TYP());
			this.setmItem_OPR_RSLT_TYP(struct.getmItem_OPR_RSLT_TYP());
			this.setmItem_SPL_ITEM_TYP(struct.getmItem_SPL_ITEM_TYP());
			this.setmItem_TAX_CD(struct.getmItem_TAX_CD());
			this.setmItem_IN_ITEMCD(struct.getmItem_IN_ITEMCD());
			this.setmCustBase_COMPANY_CD(struct.getmCustBase_COMPANY_CD());
			this.setmCustBase_CUST_CD(struct.getmCustBase_CUST_CD());
			this.setmCustBase_DLV_LOC_CD(struct.getmCustBase_DLV_LOC_CD());
			this.setmCustBase_DLV_LOC_NAME(struct.getmCustBase_DLV_LOC_NAME());
			this.setmCustBase_DLV_LOC_KNAME(struct.getmCustBase_DLV_LOC_KNAME());
			this.setmCustBase_DLV_LOC_ENAME(struct.getmCustBase_DLV_LOC_ENAME());
			this.setmCustBase_ZIP_CD(struct.getmCustBase_ZIP_CD());
			this.setmCustBase_ADDRESS_1(struct.getmCustBase_ADDRESS_1());
			this.setmCustBase_ADDRESS_2(struct.getmCustBase_ADDRESS_2());
			this.setmCustBase_ADDRESS_K_1(struct.getmCustBase_ADDRESS_K_1());
			this.setmCustBase_ADDRESS_K_2(struct.getmCustBase_ADDRESS_K_2());
			this.setmCustBase_TEL(struct.getmCustBase_TEL());
			this.setmCustBase_FAX(struct.getmCustBase_FAX());
			this.setmCustBase_SHIP_WH_CD(struct.getmCustBase_SHIP_WH_CD());
			this.setmCustBase_TRANSPORT_CD(struct.getmCustBase_TRANSPORT_CD());
			this.setmCustBase_TRANSPORT_NAME(struct.getmCustBase_TRANSPORT_NAME());
			this.setmCustBase_TRANSPORT_LT(struct.getmCustBase_TRANSPORT_LT());
			this.setmCustBase_CAL_NO(struct.getmCustBase_CAL_NO());
			this.setmCustBase_TRANSPORT_TYP(struct.getmCustBase_TRANSPORT_TYP());
			this.setmCustBase_DLV_START_TIME(struct.getmCustBase_DLV_START_TIME());
			this.setmCustBase_DLV_END_TIME(struct.getmCustBase_DLV_END_TIME());
			this.setmCustBase_AREA_CLASS_TYP1(struct.getmCustBase_AREA_CLASS_TYP1());
			this.setmCustBase_AREA_CLASS_1(struct.getmCustBase_AREA_CLASS_1());
			this.setmCustBase_AREA_CLASS_TYP2(struct.getmCustBase_AREA_CLASS_TYP2());
			this.setmCustBase_AREA_CLASS_2(struct.getmCustBase_AREA_CLASS_2());
			this.setmCustBase_AREA_CLASS_TYP3(struct.getmCustBase_AREA_CLASS_TYP3());
			this.setmCustBase_AREA_CLASS_3(struct.getmCustBase_AREA_CLASS_3());
			this.setmCustBase_REMARKS_1(struct.getmCustBase_REMARKS_1());
			this.setmCustBase_REMARKS_2(struct.getmCustBase_REMARKS_2());
			this.setmCustBase_REMARKS_3(struct.getmCustBase_REMARKS_3());
			this.setmCustBase_DEPO_WH_CD(struct.getmCustBase_DEPO_WH_CD());
			this.setmCustBase_IN_COMPANYCD(struct.getmCustBase_IN_COMPANYCD());
			this.setmCustBase_IN_CUSTCD(struct.getmCustBase_IN_CUSTCD());
			this.setmCustBase_IN_DLVLOCCD(struct.getmCustBase_IN_DLVLOCCD());
			this.setmCust_COMPANY_CD(struct.getmCust_COMPANY_CD());
			this.setmCust_CUST_CD(struct.getmCust_CUST_CD());
			this.setmCust_CUST_NAME(struct.getmCust_CUST_NAME());
			this.setmCust_CUST_ANAME(struct.getmCust_CUST_ANAME());
			this.setmCust_CUST_KNAME(struct.getmCust_CUST_KNAME());
			this.setmCust_OWN_ORG_CD(struct.getmCust_OWN_ORG_CD());
			this.setmCust_OWN_PERSON_CD(struct.getmCust_OWN_PERSON_CD());
			this.setmCust_CUR_CD(struct.getmCust_CUR_CD());
			this.setmCust_EXCH_TYP(struct.getmCust_EXCH_TYP());
			this.setmCust_TAX_APPLY_TYP(struct.getmCust_TAX_APPLY_TYP());
			this.setmCust_TAX_CD(struct.getmCust_TAX_CD());
			this.setmCust_TAX_CALC_TYP(struct.getmCust_TAX_CALC_TYP());
			this.setmCust_PRICE_ROUND_TYP(struct.getmCust_PRICE_ROUND_TYP());
			this.setmCust_DETAIL_ROUND_TYP(struct.getmCust_DETAIL_ROUND_TYP());
			this.setmCust_UNCONFIRM_ODR_EFF_PRIOD(struct.getmCust_UNCONFIRM_ODR_EFF_PRIOD());
			this.setmCust_UNCONFIRM_ODR_EFF_TERM_FLG(struct.getmCust_UNCONFIRM_ODR_EFF_TERM_FLG());
			this.setmCust_EDI_CUST_VEND_CD(struct.getmCust_EDI_CUST_VEND_CD());
			this.setmCust_PARTIAL_SHIP_INST_FLG(struct.getmCust_PARTIAL_SHIP_INST_FLG());
			this.setmCust_DEPO_TYP(struct.getmCust_DEPO_TYP());
			this.setmCust_INSPC_ACPT_TYP(struct.getmCust_INSPC_ACPT_TYP());
			this.setmCust_IN_COMPANYCD(struct.getmCust_IN_COMPANYCD());
			this.setmCust_IN_CUSTCD(struct.getmCust_IN_CUSTCD());
			this.setstrYotaku_WH_CD(struct.getstrYotaku_WH_CD());
			this.setstrYotaku_IN_WH_TYP(struct.getstrYotaku_IN_WH_TYP());
			this.setin_tShipSlip_SLIP_CD(struct.getin_tShipSlip_SLIP_CD());
			this.setin_tShipSlip_ITEM_CD(struct.getin_tShipSlip_ITEM_CD());
			this.setin_tShipSlip_CUST_ITEM_CD(struct.getin_tShipSlip_CUST_ITEM_CD());
			this.setin_tShipSlip_PART_NAME(struct.getin_tShipSlip_PART_NAME());
			this.setin_tShipSlip_CUST_ODR_NO(struct.getin_tShipSlip_CUST_ODR_NO());
			this.setin_tShipSlip_CUST_CD(struct.getin_tShipSlip_CUST_CD());
			this.setin_tShipSlip_CUST_NAME(struct.getin_tShipSlip_CUST_NAME());
			this.setin_tShipSlip_DLV_LOC_CD(struct.getin_tShipSlip_DLV_LOC_CD());
			this.setin_tShipSlip_DLV_LOC_NAME_KANJI(struct.getin_tShipSlip_DLV_LOC_NAME_KANJI());
			this.setin_tShipSlip_CUS_DLV_KEY_CD(struct.getin_tShipSlip_CUS_DLV_KEY_CD());
			this.setin_tShipSlip_DESINATED_SHIP_DATE(struct.getin_tShipSlip_DESINATED_SHIP_DATE());
			this.setin_tShipSlip_DESINATED_DLV_DATE(struct.getin_tShipSlip_DESINATED_DLV_DATE());
			this.setin_tShipSlip_SCDL_DLV_DATE(struct.getin_tShipSlip_SCDL_DLV_DATE());
			this.setin_tShipSlip_SHIP_ODR_QTY(struct.getin_tShipSlip_SHIP_ODR_QTY());
			this.setin_tShipSlip_UNIT_CD(struct.getin_tShipSlip_UNIT_CD());
			this.setin_tShipSlip_UNIT_PRICE(struct.getin_tShipSlip_UNIT_PRICE());
			this.setin_tShipSlip_SHIP_ODR_AMOUNT(struct.getin_tShipSlip_SHIP_ODR_AMOUNT());
			this.setin_tShipSlip_TAX_AMOUNT(struct.getin_tShipSlip_TAX_AMOUNT());
			this.setin_tShipSlip_INSPC_TYP(struct.getin_tShipSlip_INSPC_TYP());
			this.setin_tShipSlip_CLIENT_REMARK_KANJI(struct.getin_tShipSlip_CLIENT_REMARK_KANJI());
			this.setin_tShipSlip_CLIENT_BARCODE_INF(struct.getin_tShipSlip_CLIENT_BARCODE_INF());
			this.setin_tShipSlip_PRINT_FLG(struct.getin_tShipSlip_PRINT_FLG());
			this.setin_tShipSlip_DEL_FLG(struct.getin_tShipSlip_DEL_FLG());
			this.setin_tShipSlip_BUYER_NAME(struct.getin_tShipSlip_BUYER_NAME());
			this.setin_tShipSlip_PUCH_ODR_QTY_TOTAL(struct.getin_tShipSlip_PUCH_ODR_QTY_TOTAL());
			this.setin_tShipSlip_DLV_ODR_QTY(struct.getin_tShipSlip_DLV_ODR_QTY());
			this.setin_tShipSlip_SHIP_ODR_AMOUNT_TAX(struct.getin_tShipSlip_SHIP_ODR_AMOUNT_TAX());
			this.setin_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT(struct.getin_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT());
			this.setin_tShipSlip_INTERNAL_TAX_SALES_AMOUNT(struct.getin_tShipSlip_INTERNAL_TAX_SALES_AMOUNT());
			this.setin_tShipSlip_TAXFREE_SALES_AMOUNT(struct.getin_tShipSlip_TAXFREE_SALES_AMOUNT());
			this.setin_tShipSlip_TAX_CREDIT_SALES_AMOUNT(struct.getin_tShipSlip_TAX_CREDIT_SALES_AMOUNT());
			this.setin_tShipSlip_EXTERNAL_TAX_AMOUNT(struct.getin_tShipSlip_EXTERNAL_TAX_AMOUNT());
			this.setin_tShipSlip_INTERNAL_TAX_AMOUNT(struct.getin_tShipSlip_INTERNAL_TAX_AMOUNT());
			this.setin_tShipSlip_TAX_AMOUNT_1(struct.getin_tShipSlip_TAX_AMOUNT_1());
			this.setin_tShipSlip_TAX_AMOUNT_2(struct.getin_tShipSlip_TAX_AMOUNT_2());
			this.setin_tShipSlip_TAX_AMOUNT_3(struct.getin_tShipSlip_TAX_AMOUNT_3());
			this.setin_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT(struct.getin_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT());
			this.setdel_tShipSlip_IN_SLIPCD(struct.getdel_tShipSlip_IN_SLIPCD());
			this.setuptOdr_SHIP_CNT(struct.getuptOdr_SHIP_CNT());
			this.settUnShipList_UN_SHIP_SEQ_NO(struct.gettUnShipList_UN_SHIP_SEQ_NO());
			this.settUnShipList_CUST_CD(struct.gettUnShipList_CUST_CD());
			this.settUnShipList_ACPT_ODR_CD(struct.gettUnShipList_ACPT_ODR_CD());
			this.settUnShipList_PART_DLV_SEQ_NO(struct.gettUnShipList_PART_DLV_SEQ_NO());
			this.settUnShipList_ITEM_CD(struct.gettUnShipList_ITEM_CD());
			this.settUnShipList_UN_SHIP_QTY(struct.gettUnShipList_UN_SHIP_QTY());
			this.settUnShipList_UN_SHIP_RSN(struct.gettUnShipList_UN_SHIP_RSN());
			this.settUnShipList_WH_CD(struct.gettUnShipList_WH_CD());
			this.settUnShipList_PRINT_FLG(struct.gettUnShipList_PRINT_FLG());
			this.settUnShipList_DEL_FLG(struct.gettUnShipList_DEL_FLG());
			this.settori_tAnsDlvDate_REST_SHIP_ODR_QTY(struct.gettori_tAnsDlvDate_REST_SHIP_ODR_QTY());
			this.settori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG(struct.gettori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG());
			this.settori_tAnsDlvDate_IN_ODRNO(struct.gettori_tAnsDlvDate_IN_ODRNO());
			this.settori_tAnsDlvDate_IN_PARTDLVSEQNO(struct.gettori_tAnsDlvDate_IN_PARTDLVSEQNO());
			this.setl_COUNT(struct.getl_COUNT());
			this.setROW_COUNT(struct.getROW_COUNT());
			this.setstrTAX_CD(struct.getstrTAX_CD());
			this.setSHIP_MODIFY_COUNT(struct.getSHIP_MODIFY_COUNT());
			this.setSEL_MODIFY_COUNT(struct.getSEL_MODIFY_COUNT());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(KU0060010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_r1_SHIP_ODR(struct.getList_r1_SHIP_ODR());
			this.setList_r2_SHIP_ODR(struct.getList_r2_SHIP_ODR());
			this.setList_tAnsDlvDate_MODIFY_COUNT(struct.getList_tAnsDlvDate_MODIFY_COUNT());
			this.setList_tShipOdr_MODIFY_COUNT(struct.getList_tShipOdr_MODIFY_COUNT());
			this.setList_Shipt_MODIFY_COUNT(struct.getList_Shipt_MODIFY_COUNT());
			this.setList_h_RESULT(struct.getList_h_RESULT());
			this.setList_strBUSINESS_OPR_DATE(struct.getList_strBUSINESS_OPR_DATE());
			this.setList_strPLANT_CD(struct.getList_strPLANT_CD());
			this.setList_strTaxTAX_KBN(struct.getList_strTaxTAX_KBN());
			this.setList_strTaxOLD_TAX_1(struct.getList_strTaxOLD_TAX_1());
			this.setList_strTaxOLD_TAX_2(struct.getList_strTaxOLD_TAX_2());
			this.setList_strTaxOLD_TAX_3(struct.getList_strTaxOLD_TAX_3());
			this.setList_strTaxNEW_TAX_1(struct.getList_strTaxNEW_TAX_1());
			this.setList_strTaxNEW_TAX_2(struct.getList_strTaxNEW_TAX_2());
			this.setList_strTaxNEW_TAX_3(struct.getList_strTaxNEW_TAX_3());
			this.setList_strTaxSTART_DATE(struct.getList_strTaxSTART_DATE());
			this.setList_strTaxROUND_TYP(struct.getList_strTaxROUND_TYP());
			this.setList_strTaxIN_COMPANYCD(struct.getList_strTaxIN_COMPANYCD());
			this.setList_strTaxIN_CUSTCD(struct.getList_strTaxIN_CUSTCD());
			this.setList_l_CUST_ITEM_CD(struct.getList_l_CUST_ITEM_CD());
			this.setList_tDECIMAL_FIG(struct.getList_tDECIMAL_FIG());
			this.setList_tCUR_CD(struct.getList_tCUR_CD());
			this.setList_strCOMPANY_CD(struct.getList_strCOMPANY_CD());
			this.setList_strUSER_NAME(struct.getList_strUSER_NAME());
			this.setList_strSECTION_CD(struct.getList_strSECTION_CD());
			this.setList_strPLANT_NAME(struct.getList_strPLANT_NAME());
			this.setList_strPLANT_ANAME(struct.getList_strPLANT_ANAME());
			this.setList_strCAL_NO(struct.getList_strCAL_NO());
			this.setList_strUSER_CD(struct.getList_strUSER_CD());
			this.setList_strSYUKA_LT(struct.getList_strSYUKA_LT());
			this.setList_tHOLIDAY_FLG(struct.getList_tHOLIDAY_FLG());
			this.setList_tWH_CD(struct.getList_tWH_CD());
			this.setList_tCAL_DATE(struct.getList_tCAL_DATE());
			this.setList_l_ODR_NO(struct.getList_l_ODR_NO());
			this.setList_l_PART_DLV_SEQ_NO(struct.getList_l_PART_DLV_SEQ_NO());
			this.setList_l_DESINATED_DLV_DATE(struct.getList_l_DESINATED_DLV_DATE());
			this.setList_l_DESINATED_SHIP_DATE(struct.getList_l_DESINATED_SHIP_DATE());
			this.setList_l_SHIP_QTY(struct.getList_l_SHIP_QTY());
			this.setList_l_REST_SHIP_QTY(struct.getList_l_REST_SHIP_QTY());
			this.setList_l_WH_CD(struct.getList_l_WH_CD());
			this.setList_l_WH_NAME(struct.getList_l_WH_NAME());
			this.setList_l_CUST_ODR_NO(struct.getList_l_CUST_ODR_NO());
			this.setList_l_CUST_CD(struct.getList_l_CUST_CD());
			this.setList_l_CUST_NAME(struct.getList_l_CUST_NAME());
			this.setList_l_CUST_ITEM_NAME(struct.getList_l_CUST_ITEM_NAME());
			this.setList_l_ITEM_CD(struct.getList_l_ITEM_CD());
			this.setList_l_ITEM_NAME(struct.getList_l_ITEM_NAME());
			this.setList_l_STOCK_UNIT(struct.getList_l_STOCK_UNIT());
			this.setList_l_UNIT_QTY_TYP(struct.getList_l_UNIT_QTY_TYP());
			this.setList_l_MRP_ODR_TYP(struct.getList_l_MRP_ODR_TYP());
			this.setList_l_ODR_CTL_NO(struct.getList_l_ODR_CTL_NO());
			this.setList_l_TRANSPORT_TYP(struct.getList_l_TRANSPORT_TYP());
			this.setList_l_ODR_UNIT_PRICE(struct.getList_l_ODR_UNIT_PRICE());
			this.setList_l_SPCL_PRICE_TYP(struct.getList_l_SPCL_PRICE_TYP());
			this.setList_l_PARTIAL_SHIP_INST_FLG(struct.getList_l_PARTIAL_SHIP_INST_FLG());
			this.setList_l_MODIFY_COUNT(struct.getList_l_MODIFY_COUNT());
			this.setList_l_JOB_ODR_CD(struct.getList_l_JOB_ODR_CD());
			this.setList_ODR_NO(struct.getList_ODR_NO());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_DESINATED_DLV_DATE(struct.getList_DESINATED_DLV_DATE());
			this.setList_DESINATED_SHIP_DATE(struct.getList_DESINATED_SHIP_DATE());
			this.setList_CUST_CD(struct.getList_CUST_CD());
			this.setList_CUST_CHRG_PSN_CD(struct.getList_CUST_CHRG_PSN_CD());
			this.setList_CUST_ODR_NO(struct.getList_CUST_ODR_NO());
			this.setList_CUST_ITEM_CD(struct.getList_CUST_ITEM_CD());
			this.setList_up_tAnsDlvDate_DESINATED_SHIP_DATE(struct.getList_up_tAnsDlvDate_DESINATED_SHIP_DATE());
			this.setList_up_tAnsDlvDate_REST_SHIP_ODR_QTY(struct.getList_up_tAnsDlvDate_REST_SHIP_ODR_QTY());
			this.setList_up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG(struct.getList_up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG());
			this.setList_up_tAnsDlvDate_IN_ODRNO(struct.getList_up_tAnsDlvDate_IN_ODRNO());
			this.setList_up_tAnsDlvDate_IN_PARTDLVSEQNO(struct.getList_up_tAnsDlvDate_IN_PARTDLVSEQNO());
			this.setList_l_SLIP_CD(struct.getList_l_SLIP_CD());
			this.setList_l_c_DIRECT_DLV_FLG(struct.getList_l_c_DIRECT_DLV_FLG());
			this.setList_l_DLV_MODIFY_COUNT(struct.getList_l_DLV_MODIFY_COUNT());
			this.setList_SLIP_CD(struct.getList_SLIP_CD());
			this.setList_in_tShipOdr_ODR_NO(struct.getList_in_tShipOdr_ODR_NO());
			this.setList_in_tShipOdr_PART_DLV_SEQ_NO(struct.getList_in_tShipOdr_PART_DLV_SEQ_NO());
			this.setList_in_tShipOdr_SLIP_CD(struct.getList_in_tShipOdr_SLIP_CD());
			this.setList_in_tShipOdr_ITEM_CD(struct.getList_in_tShipOdr_ITEM_CD());
			this.setList_in_tShipOdr_CUST_ITEM_CD(struct.getList_in_tShipOdr_CUST_ITEM_CD());
			this.setList_in_tShipOdr_CUST_ODR_NO(struct.getList_in_tShipOdr_CUST_ODR_NO());
			this.setList_in_tShipOdr_CUST_CD(struct.getList_in_tShipOdr_CUST_CD());
			this.setList_in_tShipOdr_CUST_NAME(struct.getList_in_tShipOdr_CUST_NAME());
			this.setList_in_tShipOdr_SHIP_ODR_ISS_PSN_CD(struct.getList_in_tShipOdr_SHIP_ODR_ISS_PSN_CD());
			this.setList_in_tShipOdr_DLV_LOC_CD(struct.getList_in_tShipOdr_DLV_LOC_CD());
			this.setList_in_tShipOdr_DESINATED_SHIP_DATE(struct.getList_in_tShipOdr_DESINATED_SHIP_DATE());
			this.setList_in_tShipOdr_SHIP_QTY(struct.getList_in_tShipOdr_SHIP_QTY());
			this.setList_in_tShipOdr_UNIT_PRICE(struct.getList_in_tShipOdr_UNIT_PRICE());
			this.setList_in_tShipOdr_SHIP_ODR_AMOUNT(struct.getList_in_tShipOdr_SHIP_ODR_AMOUNT());
			this.setList_in_tShipOdr_CURRNCY_CD(struct.getList_in_tShipOdr_CURRNCY_CD());
			this.setList_in_tShipOdr_PKG_UNIT_QTY(struct.getList_in_tShipOdr_PKG_UNIT_QTY());
			this.setList_in_tShipOdr_REMARKS(struct.getList_in_tShipOdr_REMARKS());
			this.setList_in_tShipOdr_ALLCT_WH_CD(struct.getList_in_tShipOdr_ALLCT_WH_CD());
			this.setList_in_tShipOdr_DEPO_TYP(struct.getList_in_tShipOdr_DEPO_TYP());
			this.setList_in_tShipOdr_ENTRY_TYP(struct.getList_in_tShipOdr_ENTRY_TYP());
			this.setList_in_tShipOdr_PRINT_FLG(struct.getList_in_tShipOdr_PRINT_FLG());
			this.setList_in_tShipOdr_SHP_CMPLT_FLG(struct.getList_in_tShipOdr_SHP_CMPLT_FLG());
			this.setList_in_tShipOdr_DEL_FLG(struct.getList_in_tShipOdr_DEL_FLG());
			this.setList_in_tShipOdr_TRANSPORT_CD(struct.getList_in_tShipOdr_TRANSPORT_CD());
			this.setList_in_tShipOdr_DIRECT_DLV_FLG(struct.getList_in_tShipOdr_DIRECT_DLV_FLG());
			this.setList_in_tShipOdr_CUST_CHRG_PSN_CD(struct.getList_in_tShipOdr_CUST_CHRG_PSN_CD());
			this.setList_in_tShipOdr_UNIT_CD(struct.getList_in_tShipOdr_UNIT_CD());
			this.setList_in_tShipOdr_SCDL_DLV_DATE(struct.getList_in_tShipOdr_SCDL_DLV_DATE());
			this.setList_in_tShipOdr_TRANSFER_WH_CD(struct.getList_in_tShipOdr_TRANSFER_WH_CD());
			this.setList_in_tShipOdr_DLV_KEY_NO(struct.getList_in_tShipOdr_DLV_KEY_NO());
			this.setList_in_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES(struct.getList_in_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES());
			this.setList_in_tShipOdr_SHIP_ODR_NO(struct.getList_in_tShipOdr_SHIP_ODR_NO());
			this.setList_in_tShipOdr_JOB_ODR_CD(struct.getList_in_tShipOdr_JOB_ODR_CD());
			this.setList_del_tShipOdr_IN_SLIPCD(struct.getList_del_tShipOdr_IN_SLIPCD());
			this.setList_chkisinWhCd_WH_CD(struct.getList_chkisinWhCd_WH_CD());
			this.setList_chkisinWhCd_WH_TYP(struct.getList_chkisinWhCd_WH_TYP());
			this.setList_chkis_IN_WHCD(struct.getList_chkis_IN_WHCD());
			this.setList_chkisWhCd_WH_CD(struct.getList_chkisWhCd_WH_CD());
			this.setList_chkisWhCd_WH_TYP(struct.getList_chkisWhCd_WH_TYP());
			this.setList_chkisWhCd_ITEM_CD(struct.getList_chkisWhCd_ITEM_CD());
			this.setList_chkisWhCd_PBL_SHIP_QTY(struct.getList_chkisWhCd_PBL_SHIP_QTY());
			this.setList_chkisWhCd_IN_ITEMCD(struct.getList_chkisWhCd_IN_ITEMCD());
			this.setList_chkisWhCd_IN_WHCD(struct.getList_chkisWhCd_IN_WHCD());
			this.setList_tOdr_ODR_NO(struct.getList_tOdr_ODR_NO());
			this.setList_tOdr_ODR_TYP(struct.getList_tOdr_ODR_TYP());
			this.setList_tOdr_ODR_CTL_NO(struct.getList_tOdr_ODR_CTL_NO());
			this.setList_tOdr_CUST_ODR_NO(struct.getList_tOdr_CUST_ODR_NO());
			this.setList_tOdr_CUST_CHRG_ORG_CD(struct.getList_tOdr_CUST_CHRG_ORG_CD());
			this.setList_tOdr_CUST_CHRG_PSN_CD(struct.getList_tOdr_CUST_CHRG_PSN_CD());
			this.setList_tOdr_ODR_ACPT_ORG_CD(struct.getList_tOdr_ODR_ACPT_ORG_CD());
			this.setList_tOdr_ODR_ACPT_PSN_CD(struct.getList_tOdr_ODR_ACPT_PSN_CD());
			this.setList_tOdr_CURRNCY_CD(struct.getList_tOdr_CURRNCY_CD());
			this.setList_tOdr_EXCH_TYP(struct.getList_tOdr_EXCH_TYP());
			this.setList_tOdr_DLV_LOC_CD(struct.getList_tOdr_DLV_LOC_CD());
			this.setList_tOdr_DLV_LOC_CD_EIAJ(struct.getList_tOdr_DLV_LOC_CD_EIAJ());
			this.setList_tOdr_DLV_LOC_NAME(struct.getList_tOdr_DLV_LOC_NAME());
			this.setList_tOdr_DLV_LOC_NAME_KANJI(struct.getList_tOdr_DLV_LOC_NAME_KANJI());
			this.setList_tOdr_PRD_ODR_PLACE_CD(struct.getList_tOdr_PRD_ODR_PLACE_CD());
			this.setList_tOdr_ODR_UNIT_PRICE(struct.getList_tOdr_ODR_UNIT_PRICE());
			this.setList_tOdr_SPCL_PRICE_TYP(struct.getList_tOdr_SPCL_PRICE_TYP());
			this.setList_tOdr_PART_DLV_COUNT(struct.getList_tOdr_PART_DLV_COUNT());
			this.setList_tOdr_DEPO_TYP(struct.getList_tOdr_DEPO_TYP());
			this.setList_tOdr_DESINATED_DLV_DATE(struct.getList_tOdr_DESINATED_DLV_DATE());
			this.setList_tOdr_STD_DESINATED_RCV_DATE(struct.getList_tOdr_STD_DESINATED_RCV_DATE());
			this.setList_tOdr_ODR_QTY(struct.getList_tOdr_ODR_QTY());
			this.setList_tOdr_REMAIN_UNCONFIRM_ODR_QTY(struct.getList_tOdr_REMAIN_UNCONFIRM_ODR_QTY());
			this.setList_tOdr_CANCELED_UNCONFIRM_ODR_QTY(struct.getList_tOdr_CANCELED_UNCONFIRM_ODR_QTY());
			this.setList_tOdr_UNIT_CD(struct.getList_tOdr_UNIT_CD());
			this.setList_tOdr_UNCONFIRM_ODR_BALANCE(struct.getList_tOdr_UNCONFIRM_ODR_BALANCE());
			this.setList_tOdr_ODR_AMOUNT(struct.getList_tOdr_ODR_AMOUNT());
			this.setList_tOdr_ODR_AMOUNT_EXCH_RATES(struct.getList_tOdr_ODR_AMOUNT_EXCH_RATES());
			this.setList_tOdr_TOTAL_SHIP_QTY(struct.getList_tOdr_TOTAL_SHIP_QTY());
			this.setList_tOdr_SHIP_AMOUNT(struct.getList_tOdr_SHIP_AMOUNT());
			this.setList_tOdr_SHIP_AMOUNT_EXCH_RATES(struct.getList_tOdr_SHIP_AMOUNT_EXCH_RATES());
			this.setList_tOdr_RETURN_PRICE(struct.getList_tOdr_RETURN_PRICE());
			this.setList_tOdr_RETURN_QTY(struct.getList_tOdr_RETURN_QTY());
			this.setList_tOdr_RETURN_AMOUNT(struct.getList_tOdr_RETURN_AMOUNT());
			this.setList_tOdr_RETURN_AMOUNT_EXCH_RATES(struct.getList_tOdr_RETURN_AMOUNT_EXCH_RATES());
			this.setList_tOdr_ODR_CMPLT_FLG(struct.getList_tOdr_ODR_CMPLT_FLG());
			this.setList_tOdr_ODR_CMPLT_DATE(struct.getList_tOdr_ODR_CMPLT_DATE());
			this.setList_tOdr_CUS_DLV_CD(struct.getList_tOdr_CUS_DLV_CD());
			this.setList_tOdr_CUS_DLV_KEY_CD(struct.getList_tOdr_CUS_DLV_KEY_CD());
			this.setList_tOdr_PART_NAME(struct.getList_tOdr_PART_NAME());
			this.setList_tOdr_PKG_UNIT(struct.getList_tOdr_PKG_UNIT());
			this.setList_tOdr_SLIP_PRICE_PRINT_TYP(struct.getList_tOdr_SLIP_PRICE_PRINT_TYP());
			this.setList_tOdr_INSPC_TYP(struct.getList_tOdr_INSPC_TYP());
			this.setList_tOdr_CLIENT_REMARK(struct.getList_tOdr_CLIENT_REMARK());
			this.setList_tOdr_CLIENT_REMARK_KANJI(struct.getList_tOdr_CLIENT_REMARK_KANJI());
			this.setList_tOdr_CLIENT_BARCODE_INF(struct.getList_tOdr_CLIENT_BARCODE_INF());
			this.setList_tOdr_TRANSPORT_CD(struct.getList_tOdr_TRANSPORT_CD());
			this.setList_tOdr_TRANSPORT_TYP(struct.getList_tOdr_TRANSPORT_TYP());
			this.setList_tOdr_TAX_APPLY_TYP(struct.getList_tOdr_TAX_APPLY_TYP());
			this.setList_tOdr_TAX_CD(struct.getList_tOdr_TAX_CD());
			this.setList_tOdr_TAX_CALC_TYP(struct.getList_tOdr_TAX_CALC_TYP());
			this.setList_tOdr_REMARKS(struct.getList_tOdr_REMARKS());
			this.setList_tOdr_ODR_ACPT_DATE(struct.getList_tOdr_ODR_ACPT_DATE());
			this.setList_tOdr_SHIP_PLAN_REMAIN_QTY(struct.getList_tOdr_SHIP_PLAN_REMAIN_QTY());
			this.setList_tOdr_SHIP_PLAN_CMPLT_FLG(struct.getList_tOdr_SHIP_PLAN_CMPLT_FLG());
			this.setList_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG(struct.getList_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG());
			this.setList_tOdr_PARTIAL_SHIP_INST_FLG(struct.getList_tOdr_PARTIAL_SHIP_INST_FLG());
			this.setList_tOdr_IF_CTL_NO(struct.getList_tOdr_IF_CTL_NO());
			this.setList_tOdr_ENTRY_TYP(struct.getList_tOdr_ENTRY_TYP());
			this.setList_tOdr_BUYER_NAME(struct.getList_tOdr_BUYER_NAME());
			this.setList_tOdr_PUCH_ODR_QTY_TOTAL(struct.getList_tOdr_PUCH_ODR_QTY_TOTAL());
			this.setList_tOdr_UNIT_CD_ORG(struct.getList_tOdr_UNIT_CD_ORG());
			this.setList_tOdr_SHIP_CNT(struct.getList_tOdr_SHIP_CNT());
			this.setList_tOdr_IN_ODRNO(struct.getList_tOdr_IN_ODRNO());
			this.setList_uptOdr_PART_DLV_COUNT(struct.getList_uptOdr_PART_DLV_COUNT());
			this.setList_uptOdr_IN_ODRNO(struct.getList_uptOdr_IN_ODRNO());
			this.setList_tOdrCtl_ODR_CTL_NO(struct.getList_tOdrCtl_ODR_CTL_NO());
			this.setList_tOdrCtl_CUST_CD(struct.getList_tOdrCtl_CUST_CD());
			this.setList_tOdrCtl_CUST_ITEM_CD(struct.getList_tOdrCtl_CUST_ITEM_CD());
			this.setList_tOdrCtl_CUST_ITEM_NAME(struct.getList_tOdrCtl_CUST_ITEM_NAME());
			this.setList_tOdrCtl_ITEM_CD(struct.getList_tOdrCtl_ITEM_CD());
			this.setList_tOdrCtl_ITEM_NAME(struct.getList_tOdrCtl_ITEM_NAME());
			this.setList_tOdrCtl_IN_ODRCTLNO(struct.getList_tOdrCtl_IN_ODRCTLNO());
			this.setList_mItem_ITEM_CD(struct.getList_mItem_ITEM_CD());
			this.setList_mItem_ITEM_NAME(struct.getList_mItem_ITEM_NAME());
			this.setList_mItem_PRODUCT_TYP(struct.getList_mItem_PRODUCT_TYP());
			this.setList_mItem_MRP_ODR_TYP(struct.getList_mItem_MRP_ODR_TYP());
			this.setList_mItem_DRAW_CD(struct.getList_mItem_DRAW_CD());
			this.setList_mItem_SPEC(struct.getList_mItem_SPEC());
			this.setList_mItem_HIGH_LEVEL_NO(struct.getList_mItem_HIGH_LEVEL_NO());
			this.setList_mItem_OUTSIDE_TYP(struct.getList_mItem_OUTSIDE_TYP());
			this.setList_mItem_STOCK_UNIT_FLG(struct.getList_mItem_STOCK_UNIT_FLG());
			this.setList_mItem_STOCK_UNIT(struct.getList_mItem_STOCK_UNIT());
			this.setList_mItem_PKG_UNIT(struct.getList_mItem_PKG_UNIT());
			this.setList_mItem_PKG_UNIT_QTY(struct.getList_mItem_PKG_UNIT_QTY());
			this.setList_mItem_UNIT_QTY_TYP(struct.getList_mItem_UNIT_QTY_TYP());
			this.setList_mItem_ODR_LT(struct.getList_mItem_ODR_LT());
			this.setList_mItem_FIXED_LT(struct.getList_mItem_FIXED_LT());
			this.setList_mItem_PROP_LT(struct.getList_mItem_PROP_LT());
			this.setList_mItem_SAFETY_LT(struct.getList_mItem_SAFETY_LT());
			this.setList_mItem_ISSUE_LT(struct.getList_mItem_ISSUE_LT());
			this.setList_mItem_PROP_LOT_SIZE(struct.getList_mItem_PROP_LOT_SIZE());
			this.setList_mItem_ITEM_SPOIL(struct.getList_mItem_ITEM_SPOIL());
			this.setList_mItem_SAFETY_STOCK(struct.getList_mItem_SAFETY_STOCK());
			this.setList_mItem_LOT_SIZING_TYP(struct.getList_mItem_LOT_SIZING_TYP());
			this.setList_mItem_MAX_PERIOD(struct.getList_mItem_MAX_PERIOD());
			this.setList_mItem_MAX_ODR_QTY(struct.getList_mItem_MAX_ODR_QTY());
			this.setList_mItem_ODR_POINT(struct.getList_mItem_ODR_POINT());
			this.setList_mItem_FIXED_ODR_QTY(struct.getList_mItem_FIXED_ODR_QTY());
			this.setList_mItem_MIN_ODR_QTY(struct.getList_mItem_MIN_ODR_QTY());
			this.setList_mItem_MUL_ODR_QTY(struct.getList_mItem_MUL_ODR_QTY());
			this.setList_mItem_ISSUE_TYP(struct.getList_mItem_ISSUE_TYP());
			this.setList_mItem_MPS_FLG(struct.getList_mItem_MPS_FLG());
			this.setList_mItem_ACPT_INSPC_TYP(struct.getList_mItem_ACPT_INSPC_TYP());
			this.setList_mItem_CLASIFICATION_CD(struct.getList_mItem_CLASIFICATION_CD());
			this.setList_mItem_UNIT_WEIGHT(struct.getList_mItem_UNIT_WEIGHT());
			this.setList_mItem_ABC_TYP(struct.getList_mItem_ABC_TYP());
			this.setList_mItem_OPR_RSLT_TYP(struct.getList_mItem_OPR_RSLT_TYP());
			this.setList_mItem_SPL_ITEM_TYP(struct.getList_mItem_SPL_ITEM_TYP());
			this.setList_mItem_TAX_CD(struct.getList_mItem_TAX_CD());
			this.setList_mItem_IN_ITEMCD(struct.getList_mItem_IN_ITEMCD());
			this.setList_mCustBase_COMPANY_CD(struct.getList_mCustBase_COMPANY_CD());
			this.setList_mCustBase_CUST_CD(struct.getList_mCustBase_CUST_CD());
			this.setList_mCustBase_DLV_LOC_CD(struct.getList_mCustBase_DLV_LOC_CD());
			this.setList_mCustBase_DLV_LOC_NAME(struct.getList_mCustBase_DLV_LOC_NAME());
			this.setList_mCustBase_DLV_LOC_KNAME(struct.getList_mCustBase_DLV_LOC_KNAME());
			this.setList_mCustBase_DLV_LOC_ENAME(struct.getList_mCustBase_DLV_LOC_ENAME());
			this.setList_mCustBase_ZIP_CD(struct.getList_mCustBase_ZIP_CD());
			this.setList_mCustBase_ADDRESS_1(struct.getList_mCustBase_ADDRESS_1());
			this.setList_mCustBase_ADDRESS_2(struct.getList_mCustBase_ADDRESS_2());
			this.setList_mCustBase_ADDRESS_K_1(struct.getList_mCustBase_ADDRESS_K_1());
			this.setList_mCustBase_ADDRESS_K_2(struct.getList_mCustBase_ADDRESS_K_2());
			this.setList_mCustBase_TEL(struct.getList_mCustBase_TEL());
			this.setList_mCustBase_FAX(struct.getList_mCustBase_FAX());
			this.setList_mCustBase_SHIP_WH_CD(struct.getList_mCustBase_SHIP_WH_CD());
			this.setList_mCustBase_TRANSPORT_CD(struct.getList_mCustBase_TRANSPORT_CD());
			this.setList_mCustBase_TRANSPORT_NAME(struct.getList_mCustBase_TRANSPORT_NAME());
			this.setList_mCustBase_TRANSPORT_LT(struct.getList_mCustBase_TRANSPORT_LT());
			this.setList_mCustBase_CAL_NO(struct.getList_mCustBase_CAL_NO());
			this.setList_mCustBase_TRANSPORT_TYP(struct.getList_mCustBase_TRANSPORT_TYP());
			this.setList_mCustBase_DLV_START_TIME(struct.getList_mCustBase_DLV_START_TIME());
			this.setList_mCustBase_DLV_END_TIME(struct.getList_mCustBase_DLV_END_TIME());
			this.setList_mCustBase_AREA_CLASS_TYP1(struct.getList_mCustBase_AREA_CLASS_TYP1());
			this.setList_mCustBase_AREA_CLASS_1(struct.getList_mCustBase_AREA_CLASS_1());
			this.setList_mCustBase_AREA_CLASS_TYP2(struct.getList_mCustBase_AREA_CLASS_TYP2());
			this.setList_mCustBase_AREA_CLASS_2(struct.getList_mCustBase_AREA_CLASS_2());
			this.setList_mCustBase_AREA_CLASS_TYP3(struct.getList_mCustBase_AREA_CLASS_TYP3());
			this.setList_mCustBase_AREA_CLASS_3(struct.getList_mCustBase_AREA_CLASS_3());
			this.setList_mCustBase_REMARKS_1(struct.getList_mCustBase_REMARKS_1());
			this.setList_mCustBase_REMARKS_2(struct.getList_mCustBase_REMARKS_2());
			this.setList_mCustBase_REMARKS_3(struct.getList_mCustBase_REMARKS_3());
			this.setList_mCustBase_DEPO_WH_CD(struct.getList_mCustBase_DEPO_WH_CD());
			this.setList_mCustBase_IN_COMPANYCD(struct.getList_mCustBase_IN_COMPANYCD());
			this.setList_mCustBase_IN_CUSTCD(struct.getList_mCustBase_IN_CUSTCD());
			this.setList_mCustBase_IN_DLVLOCCD(struct.getList_mCustBase_IN_DLVLOCCD());
			this.setList_mCust_COMPANY_CD(struct.getList_mCust_COMPANY_CD());
			this.setList_mCust_CUST_CD(struct.getList_mCust_CUST_CD());
			this.setList_mCust_CUST_NAME(struct.getList_mCust_CUST_NAME());
			this.setList_mCust_CUST_ANAME(struct.getList_mCust_CUST_ANAME());
			this.setList_mCust_CUST_KNAME(struct.getList_mCust_CUST_KNAME());
			this.setList_mCust_OWN_ORG_CD(struct.getList_mCust_OWN_ORG_CD());
			this.setList_mCust_OWN_PERSON_CD(struct.getList_mCust_OWN_PERSON_CD());
			this.setList_mCust_CUR_CD(struct.getList_mCust_CUR_CD());
			this.setList_mCust_EXCH_TYP(struct.getList_mCust_EXCH_TYP());
			this.setList_mCust_TAX_APPLY_TYP(struct.getList_mCust_TAX_APPLY_TYP());
			this.setList_mCust_TAX_CD(struct.getList_mCust_TAX_CD());
			this.setList_mCust_TAX_CALC_TYP(struct.getList_mCust_TAX_CALC_TYP());
			this.setList_mCust_PRICE_ROUND_TYP(struct.getList_mCust_PRICE_ROUND_TYP());
			this.setList_mCust_DETAIL_ROUND_TYP(struct.getList_mCust_DETAIL_ROUND_TYP());
			this.setList_mCust_UNCONFIRM_ODR_EFF_PRIOD(struct.getList_mCust_UNCONFIRM_ODR_EFF_PRIOD());
			this.setList_mCust_UNCONFIRM_ODR_EFF_TERM_FLG(struct.getList_mCust_UNCONFIRM_ODR_EFF_TERM_FLG());
			this.setList_mCust_EDI_CUST_VEND_CD(struct.getList_mCust_EDI_CUST_VEND_CD());
			this.setList_mCust_PARTIAL_SHIP_INST_FLG(struct.getList_mCust_PARTIAL_SHIP_INST_FLG());
			this.setList_mCust_DEPO_TYP(struct.getList_mCust_DEPO_TYP());
			this.setList_mCust_INSPC_ACPT_TYP(struct.getList_mCust_INSPC_ACPT_TYP());
			this.setList_mCust_IN_COMPANYCD(struct.getList_mCust_IN_COMPANYCD());
			this.setList_mCust_IN_CUSTCD(struct.getList_mCust_IN_CUSTCD());
			this.setList_strYotaku_WH_CD(struct.getList_strYotaku_WH_CD());
			this.setList_strYotaku_IN_WH_TYP(struct.getList_strYotaku_IN_WH_TYP());
			this.setList_in_tShipSlip_SLIP_CD(struct.getList_in_tShipSlip_SLIP_CD());
			this.setList_in_tShipSlip_ITEM_CD(struct.getList_in_tShipSlip_ITEM_CD());
			this.setList_in_tShipSlip_CUST_ITEM_CD(struct.getList_in_tShipSlip_CUST_ITEM_CD());
			this.setList_in_tShipSlip_PART_NAME(struct.getList_in_tShipSlip_PART_NAME());
			this.setList_in_tShipSlip_CUST_ODR_NO(struct.getList_in_tShipSlip_CUST_ODR_NO());
			this.setList_in_tShipSlip_CUST_CD(struct.getList_in_tShipSlip_CUST_CD());
			this.setList_in_tShipSlip_CUST_NAME(struct.getList_in_tShipSlip_CUST_NAME());
			this.setList_in_tShipSlip_DLV_LOC_CD(struct.getList_in_tShipSlip_DLV_LOC_CD());
			this.setList_in_tShipSlip_DLV_LOC_NAME_KANJI(struct.getList_in_tShipSlip_DLV_LOC_NAME_KANJI());
			this.setList_in_tShipSlip_CUS_DLV_KEY_CD(struct.getList_in_tShipSlip_CUS_DLV_KEY_CD());
			this.setList_in_tShipSlip_DESINATED_SHIP_DATE(struct.getList_in_tShipSlip_DESINATED_SHIP_DATE());
			this.setList_in_tShipSlip_DESINATED_DLV_DATE(struct.getList_in_tShipSlip_DESINATED_DLV_DATE());
			this.setList_in_tShipSlip_SCDL_DLV_DATE(struct.getList_in_tShipSlip_SCDL_DLV_DATE());
			this.setList_in_tShipSlip_SHIP_ODR_QTY(struct.getList_in_tShipSlip_SHIP_ODR_QTY());
			this.setList_in_tShipSlip_UNIT_CD(struct.getList_in_tShipSlip_UNIT_CD());
			this.setList_in_tShipSlip_UNIT_PRICE(struct.getList_in_tShipSlip_UNIT_PRICE());
			this.setList_in_tShipSlip_SHIP_ODR_AMOUNT(struct.getList_in_tShipSlip_SHIP_ODR_AMOUNT());
			this.setList_in_tShipSlip_TAX_AMOUNT(struct.getList_in_tShipSlip_TAX_AMOUNT());
			this.setList_in_tShipSlip_INSPC_TYP(struct.getList_in_tShipSlip_INSPC_TYP());
			this.setList_in_tShipSlip_CLIENT_REMARK_KANJI(struct.getList_in_tShipSlip_CLIENT_REMARK_KANJI());
			this.setList_in_tShipSlip_CLIENT_BARCODE_INF(struct.getList_in_tShipSlip_CLIENT_BARCODE_INF());
			this.setList_in_tShipSlip_PRINT_FLG(struct.getList_in_tShipSlip_PRINT_FLG());
			this.setList_in_tShipSlip_DEL_FLG(struct.getList_in_tShipSlip_DEL_FLG());
			this.setList_in_tShipSlip_BUYER_NAME(struct.getList_in_tShipSlip_BUYER_NAME());
			this.setList_in_tShipSlip_PUCH_ODR_QTY_TOTAL(struct.getList_in_tShipSlip_PUCH_ODR_QTY_TOTAL());
			this.setList_in_tShipSlip_DLV_ODR_QTY(struct.getList_in_tShipSlip_DLV_ODR_QTY());
			this.setList_in_tShipSlip_SHIP_ODR_AMOUNT_TAX(struct.getList_in_tShipSlip_SHIP_ODR_AMOUNT_TAX());
			this.setList_in_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT(struct.getList_in_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT());
			this.setList_in_tShipSlip_INTERNAL_TAX_SALES_AMOUNT(struct.getList_in_tShipSlip_INTERNAL_TAX_SALES_AMOUNT());
			this.setList_in_tShipSlip_TAXFREE_SALES_AMOUNT(struct.getList_in_tShipSlip_TAXFREE_SALES_AMOUNT());
			this.setList_in_tShipSlip_TAX_CREDIT_SALES_AMOUNT(struct.getList_in_tShipSlip_TAX_CREDIT_SALES_AMOUNT());
			this.setList_in_tShipSlip_EXTERNAL_TAX_AMOUNT(struct.getList_in_tShipSlip_EXTERNAL_TAX_AMOUNT());
			this.setList_in_tShipSlip_INTERNAL_TAX_AMOUNT(struct.getList_in_tShipSlip_INTERNAL_TAX_AMOUNT());
			this.setList_in_tShipSlip_TAX_AMOUNT_1(struct.getList_in_tShipSlip_TAX_AMOUNT_1());
			this.setList_in_tShipSlip_TAX_AMOUNT_2(struct.getList_in_tShipSlip_TAX_AMOUNT_2());
			this.setList_in_tShipSlip_TAX_AMOUNT_3(struct.getList_in_tShipSlip_TAX_AMOUNT_3());
			this.setList_in_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT(struct.getList_in_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT());
			this.setList_del_tShipSlip_IN_SLIPCD(struct.getList_del_tShipSlip_IN_SLIPCD());
			this.setList_uptOdr_SHIP_CNT(struct.getList_uptOdr_SHIP_CNT());
			this.setList_tUnShipList_UN_SHIP_SEQ_NO(struct.getList_tUnShipList_UN_SHIP_SEQ_NO());
			this.setList_tUnShipList_CUST_CD(struct.getList_tUnShipList_CUST_CD());
			this.setList_tUnShipList_ACPT_ODR_CD(struct.getList_tUnShipList_ACPT_ODR_CD());
			this.setList_tUnShipList_PART_DLV_SEQ_NO(struct.getList_tUnShipList_PART_DLV_SEQ_NO());
			this.setList_tUnShipList_ITEM_CD(struct.getList_tUnShipList_ITEM_CD());
			this.setList_tUnShipList_UN_SHIP_QTY(struct.getList_tUnShipList_UN_SHIP_QTY());
			this.setList_tUnShipList_UN_SHIP_RSN(struct.getList_tUnShipList_UN_SHIP_RSN());
			this.setList_tUnShipList_WH_CD(struct.getList_tUnShipList_WH_CD());
			this.setList_tUnShipList_PRINT_FLG(struct.getList_tUnShipList_PRINT_FLG());
			this.setList_tUnShipList_DEL_FLG(struct.getList_tUnShipList_DEL_FLG());
			this.setList_tori_tAnsDlvDate_REST_SHIP_ODR_QTY(struct.getList_tori_tAnsDlvDate_REST_SHIP_ODR_QTY());
			this.setList_tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG(struct.getList_tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG());
			this.setList_tori_tAnsDlvDate_IN_ODRNO(struct.getList_tori_tAnsDlvDate_IN_ODRNO());
			this.setList_tori_tAnsDlvDate_IN_PARTDLVSEQNO(struct.getList_tori_tAnsDlvDate_IN_PARTDLVSEQNO());
			this.setList_l_COUNT(struct.getList_l_COUNT());
			this.setList_ROW_COUNT(struct.getList_ROW_COUNT());
			this.setList_strTAX_CD(struct.getList_strTAX_CD());
			this.setList_SHIP_MODIFY_COUNT(struct.getList_SHIP_MODIFY_COUNT());
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
	// 第 1 変数初期値： i_r1_SHIP_ODR


	final static String i_r1_SHIP_ODR = null;

	// 第 2 変数初期値： i_r2_SHIP_ODR


	final static String i_r2_SHIP_ODR = null;

	// 第 3 変数初期値： i_tAnsDlvDate_MODIFY_COUNT


	final static String i_tAnsDlvDate_MODIFY_COUNT = null;

	// 第 4 変数初期値： i_tShipOdr_MODIFY_COUNT


	final static String i_tShipOdr_MODIFY_COUNT = null;

	// 第 5 変数初期値： i_Shipt_MODIFY_COUNT


	final static String i_Shipt_MODIFY_COUNT = null;

	// 第 6 変数初期値： i_h_RESULT


	final static String i_h_RESULT = null;

	// 第 7 変数初期値： i_strBUSINESS_OPR_DATE


	final static String i_strBUSINESS_OPR_DATE = null;

	// 第 8 変数初期値： i_strPLANT_CD


	final static String i_strPLANT_CD = null;

	// 第 9 変数初期値： i_strTaxTAX_KBN


	final static String i_strTaxTAX_KBN = null;

	// 第 10 変数初期値： i_strTaxOLD_TAX_1


	final static String i_strTaxOLD_TAX_1 = null;

	// 第 11 変数初期値： i_strTaxOLD_TAX_2


	final static String i_strTaxOLD_TAX_2 = null;

	// 第 12 変数初期値： i_strTaxOLD_TAX_3


	final static String i_strTaxOLD_TAX_3 = null;

	// 第 13 変数初期値： i_strTaxNEW_TAX_1


	final static String i_strTaxNEW_TAX_1 = null;

	// 第 14 変数初期値： i_strTaxNEW_TAX_2


	final static String i_strTaxNEW_TAX_2 = null;

	// 第 15 変数初期値： i_strTaxNEW_TAX_3


	final static String i_strTaxNEW_TAX_3 = null;

	// 第 16 変数初期値： i_strTaxSTART_DATE


	final static String i_strTaxSTART_DATE = null;

	// 第 17 変数初期値： i_strTaxROUND_TYP


	final static String i_strTaxROUND_TYP = null;

	// 第 18 変数初期値： i_strTaxIN_COMPANYCD


	final static String i_strTaxIN_COMPANYCD = null;

	// 第 19 変数初期値： i_strTaxIN_CUSTCD


	final static String i_strTaxIN_CUSTCD = null;

	// 第 20 変数初期値： i_l_CUST_ITEM_CD


	final static String i_l_CUST_ITEM_CD = null;

	// 第 21 変数初期値： i_tDECIMAL_FIG


	final static String i_tDECIMAL_FIG = null;

	// 第 22 変数初期値： i_tCUR_CD


	final static String i_tCUR_CD = null;

	// 第 23 変数初期値： i_strCOMPANY_CD


	final static String i_strCOMPANY_CD = null;

	// 第 24 変数初期値： i_strUSER_NAME


	final static String i_strUSER_NAME = null;

	// 第 25 変数初期値： i_strSECTION_CD


	final static String i_strSECTION_CD = null;

	// 第 26 変数初期値： i_strPLANT_NAME


	final static String i_strPLANT_NAME = null;

	// 第 27 変数初期値： i_strPLANT_ANAME


	final static String i_strPLANT_ANAME = null;

	// 第 28 変数初期値： i_strCAL_NO


	final static String i_strCAL_NO = null;

	// 第 29 変数初期値： i_strUSER_CD


	final static String i_strUSER_CD = null;

	// 第 30 変数初期値： i_strSYUKA_LT


	final static String i_strSYUKA_LT = null;

	// 第 31 変数初期値： i_tHOLIDAY_FLG


	final static String i_tHOLIDAY_FLG = null;

	// 第 32 変数初期値： i_tWH_CD


	final static String i_tWH_CD = null;

	// 第 33 変数初期値： i_tCAL_DATE


	final static String i_tCAL_DATE = null;

	// 第 34 変数初期値： i_l_ODR_NO


	final static String i_l_ODR_NO = null;

	// 第 35 変数初期値： i_l_PART_DLV_SEQ_NO


	final static String i_l_PART_DLV_SEQ_NO = null;

	// 第 36 変数初期値： i_l_DESINATED_DLV_DATE


	final static String i_l_DESINATED_DLV_DATE = null;

	// 第 37 変数初期値： i_l_DESINATED_SHIP_DATE


	final static String i_l_DESINATED_SHIP_DATE = null;

	// 第 38 変数初期値： i_l_SHIP_QTY


	final static String i_l_SHIP_QTY = null;

	// 第 39 変数初期値： i_l_REST_SHIP_QTY


	final static String i_l_REST_SHIP_QTY = null;

	// 第 40 変数初期値： i_l_WH_CD


	final static String i_l_WH_CD = null;

	// 第 41 変数初期値： i_l_WH_NAME


	final static String i_l_WH_NAME = null;

	// 第 42 変数初期値： i_l_CUST_ODR_NO


	final static String i_l_CUST_ODR_NO = null;

	// 第 43 変数初期値： i_l_CUST_CD


	final static String i_l_CUST_CD = null;

	// 第 44 変数初期値： i_l_CUST_NAME


	final static String i_l_CUST_NAME = null;

	// 第 45 変数初期値： i_l_CUST_ITEM_NAME


	final static String i_l_CUST_ITEM_NAME = null;

	// 第 46 変数初期値： i_l_ITEM_CD


	final static String i_l_ITEM_CD = null;

	// 第 47 変数初期値： i_l_ITEM_NAME


	final static String i_l_ITEM_NAME = null;

	// 第 48 変数初期値： i_l_STOCK_UNIT


	final static String i_l_STOCK_UNIT = null;

	// 第 49 変数初期値： i_l_UNIT_QTY_TYP


	final static String i_l_UNIT_QTY_TYP = null;

	// 第 50 変数初期値： i_l_MRP_ODR_TYP


	final static String i_l_MRP_ODR_TYP = null;

	// 第 51 変数初期値： i_l_ODR_CTL_NO


	final static String i_l_ODR_CTL_NO = null;

	// 第 52 変数初期値： i_l_TRANSPORT_TYP


	final static String i_l_TRANSPORT_TYP = null;

	// 第 53 変数初期値： i_l_ODR_UNIT_PRICE


	final static String i_l_ODR_UNIT_PRICE = null;

	// 第 54 変数初期値： i_l_SPCL_PRICE_TYP


	final static String i_l_SPCL_PRICE_TYP = null;

	// 第 55 変数初期値： i_l_PARTIAL_SHIP_INST_FLG


	final static String i_l_PARTIAL_SHIP_INST_FLG = null;

	// 第 56 変数初期値： i_l_MODIFY_COUNT


	final static String i_l_MODIFY_COUNT = null;

	// 第 57 変数初期値： i_l_JOB_ODR_CD


	final static String i_l_JOB_ODR_CD = null;

	// 第 58 変数初期値： i_ODR_NO


	final static String i_ODR_NO = null;

	// 第 59 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 60 変数初期値： i_DESINATED_DLV_DATE


	final static String i_DESINATED_DLV_DATE = null;

	// 第 61 変数初期値： i_DESINATED_SHIP_DATE


	final static String i_DESINATED_SHIP_DATE = null;

	// 第 62 変数初期値： i_CUST_CD


	final static String i_CUST_CD = null;

	// 第 63 変数初期値： i_CUST_CHRG_PSN_CD


	final static String i_CUST_CHRG_PSN_CD = null;

	// 第 64 変数初期値： i_CUST_ODR_NO


	final static String i_CUST_ODR_NO = null;

	// 第 65 変数初期値： i_CUST_ITEM_CD


	final static String i_CUST_ITEM_CD = null;

	// 第 66 変数初期値： i_up_tAnsDlvDate_DESINATED_SHIP_DATE


	final static String i_up_tAnsDlvDate_DESINATED_SHIP_DATE = null;

	// 第 67 変数初期値： i_up_tAnsDlvDate_REST_SHIP_ODR_QTY


	final static String i_up_tAnsDlvDate_REST_SHIP_ODR_QTY = null;

	// 第 68 変数初期値： i_up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG


	final static String i_up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG = null;

	// 第 69 変数初期値： i_up_tAnsDlvDate_IN_ODRNO


	final static String i_up_tAnsDlvDate_IN_ODRNO = null;

	// 第 70 変数初期値： i_up_tAnsDlvDate_IN_PARTDLVSEQNO


	final static String i_up_tAnsDlvDate_IN_PARTDLVSEQNO = null;

	// 第 71 変数初期値： i_l_SLIP_CD


	final static String i_l_SLIP_CD = null;

	// 第 72 変数初期値： i_l_c_DIRECT_DLV_FLG


	final static String i_l_c_DIRECT_DLV_FLG = null;

	// 第 73 変数初期値： i_l_DLV_MODIFY_COUNT


	final static String i_l_DLV_MODIFY_COUNT = null;

	// 第 74 変数初期値： i_SLIP_CD


	final static String i_SLIP_CD = null;

	// 第 75 変数初期値： i_in_tShipOdr_ODR_NO


	final static String i_in_tShipOdr_ODR_NO = null;

	// 第 76 変数初期値： i_in_tShipOdr_PART_DLV_SEQ_NO


	final static String i_in_tShipOdr_PART_DLV_SEQ_NO = null;

	// 第 77 変数初期値： i_in_tShipOdr_SLIP_CD


	final static String i_in_tShipOdr_SLIP_CD = null;

	// 第 78 変数初期値： i_in_tShipOdr_ITEM_CD


	final static String i_in_tShipOdr_ITEM_CD = null;

	// 第 79 変数初期値： i_in_tShipOdr_CUST_ITEM_CD


	final static String i_in_tShipOdr_CUST_ITEM_CD = null;

	// 第 80 変数初期値： i_in_tShipOdr_CUST_ODR_NO


	final static String i_in_tShipOdr_CUST_ODR_NO = null;

	// 第 81 変数初期値： i_in_tShipOdr_CUST_CD


	final static String i_in_tShipOdr_CUST_CD = null;

	// 第 82 変数初期値： i_in_tShipOdr_CUST_NAME


	final static String i_in_tShipOdr_CUST_NAME = null;

	// 第 83 変数初期値： i_in_tShipOdr_SHIP_ODR_ISS_PSN_CD


	final static String i_in_tShipOdr_SHIP_ODR_ISS_PSN_CD = null;

	// 第 84 変数初期値： i_in_tShipOdr_DLV_LOC_CD


	final static String i_in_tShipOdr_DLV_LOC_CD = null;

	// 第 85 変数初期値： i_in_tShipOdr_DESINATED_SHIP_DATE


	final static String i_in_tShipOdr_DESINATED_SHIP_DATE = null;

	// 第 86 変数初期値： i_in_tShipOdr_SHIP_QTY


	final static String i_in_tShipOdr_SHIP_QTY = null;

	// 第 87 変数初期値： i_in_tShipOdr_UNIT_PRICE


	final static String i_in_tShipOdr_UNIT_PRICE = null;

	// 第 88 変数初期値： i_in_tShipOdr_SHIP_ODR_AMOUNT


	final static Double i_in_tShipOdr_SHIP_ODR_AMOUNT = null;

	// 第 89 変数初期値： i_in_tShipOdr_CURRNCY_CD


	final static String i_in_tShipOdr_CURRNCY_CD = null;

	// 第 90 変数初期値： i_in_tShipOdr_PKG_UNIT_QTY


	final static String i_in_tShipOdr_PKG_UNIT_QTY = null;

	// 第 91 変数初期値： i_in_tShipOdr_REMARKS


	final static String i_in_tShipOdr_REMARKS = null;

	// 第 92 変数初期値： i_in_tShipOdr_ALLCT_WH_CD


	final static String i_in_tShipOdr_ALLCT_WH_CD = null;

	// 第 93 変数初期値： i_in_tShipOdr_DEPO_TYP


	final static String i_in_tShipOdr_DEPO_TYP = null;

	// 第 94 変数初期値： i_in_tShipOdr_ENTRY_TYP


	final static String i_in_tShipOdr_ENTRY_TYP = null;

	// 第 95 変数初期値： i_in_tShipOdr_PRINT_FLG


	final static String i_in_tShipOdr_PRINT_FLG = null;

	// 第 96 変数初期値： i_in_tShipOdr_SHP_CMPLT_FLG


	final static String i_in_tShipOdr_SHP_CMPLT_FLG = null;

	// 第 97 変数初期値： i_in_tShipOdr_DEL_FLG


	final static String i_in_tShipOdr_DEL_FLG = null;

	// 第 98 変数初期値： i_in_tShipOdr_TRANSPORT_CD


	final static String i_in_tShipOdr_TRANSPORT_CD = null;

	// 第 99 変数初期値： i_in_tShipOdr_DIRECT_DLV_FLG


	final static String i_in_tShipOdr_DIRECT_DLV_FLG = null;

	// 第 100 変数初期値： i_in_tShipOdr_CUST_CHRG_PSN_CD


	final static String i_in_tShipOdr_CUST_CHRG_PSN_CD = null;

	// 第 101 変数初期値： i_in_tShipOdr_UNIT_CD


	final static String i_in_tShipOdr_UNIT_CD = null;

	// 第 102 変数初期値： i_in_tShipOdr_SCDL_DLV_DATE


	final static String i_in_tShipOdr_SCDL_DLV_DATE = null;

	// 第 103 変数初期値： i_in_tShipOdr_TRANSFER_WH_CD


	final static String i_in_tShipOdr_TRANSFER_WH_CD = null;

	// 第 104 変数初期値： i_in_tShipOdr_DLV_KEY_NO


	final static String i_in_tShipOdr_DLV_KEY_NO = null;

	// 第 105 変数初期値： i_in_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES


	final static Double i_in_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES = null;

	// 第 106 変数初期値： i_in_tShipOdr_SHIP_ODR_NO


	final static String i_in_tShipOdr_SHIP_ODR_NO = null;

	// 第 107 変数初期値： i_in_tShipOdr_JOB_ODR_CD


	final static String i_in_tShipOdr_JOB_ODR_CD = null;

	// 第 108 変数初期値： i_del_tShipOdr_IN_SLIPCD


	final static String i_del_tShipOdr_IN_SLIPCD = null;

	// 第 109 変数初期値： i_chkisinWhCd_WH_CD


	final static String i_chkisinWhCd_WH_CD = null;

	// 第 110 変数初期値： i_chkisinWhCd_WH_TYP


	final static String i_chkisinWhCd_WH_TYP = null;

	// 第 111 変数初期値： i_chkis_IN_WHCD


	final static String i_chkis_IN_WHCD = null;

	// 第 112 変数初期値： i_chkisWhCd_WH_CD


	final static String i_chkisWhCd_WH_CD = null;

	// 第 113 変数初期値： i_chkisWhCd_WH_TYP


	final static String i_chkisWhCd_WH_TYP = null;

	// 第 114 変数初期値： i_chkisWhCd_ITEM_CD


	final static String i_chkisWhCd_ITEM_CD = null;

	// 第 115 変数初期値： i_chkisWhCd_PBL_SHIP_QTY


	final static String i_chkisWhCd_PBL_SHIP_QTY = null;

	// 第 116 変数初期値： i_chkisWhCd_IN_ITEMCD


	final static String i_chkisWhCd_IN_ITEMCD = null;

	// 第 117 変数初期値： i_chkisWhCd_IN_WHCD


	final static String i_chkisWhCd_IN_WHCD = null;

	// 第 118 変数初期値： i_tOdr_ODR_NO


	final static String i_tOdr_ODR_NO = null;

	// 第 119 変数初期値： i_tOdr_ODR_TYP


	final static String i_tOdr_ODR_TYP = null;

	// 第 120 変数初期値： i_tOdr_ODR_CTL_NO


	final static String i_tOdr_ODR_CTL_NO = null;

	// 第 121 変数初期値： i_tOdr_CUST_ODR_NO


	final static String i_tOdr_CUST_ODR_NO = null;

	// 第 122 変数初期値： i_tOdr_CUST_CHRG_ORG_CD


	final static String i_tOdr_CUST_CHRG_ORG_CD = null;

	// 第 123 変数初期値： i_tOdr_CUST_CHRG_PSN_CD


	final static String i_tOdr_CUST_CHRG_PSN_CD = null;

	// 第 124 変数初期値： i_tOdr_ODR_ACPT_ORG_CD


	final static String i_tOdr_ODR_ACPT_ORG_CD = null;

	// 第 125 変数初期値： i_tOdr_ODR_ACPT_PSN_CD


	final static String i_tOdr_ODR_ACPT_PSN_CD = null;

	// 第 126 変数初期値： i_tOdr_CURRNCY_CD


	final static String i_tOdr_CURRNCY_CD = null;

	// 第 127 変数初期値： i_tOdr_EXCH_TYP


	final static String i_tOdr_EXCH_TYP = null;

	// 第 128 変数初期値： i_tOdr_DLV_LOC_CD


	final static String i_tOdr_DLV_LOC_CD = null;

	// 第 129 変数初期値： i_tOdr_DLV_LOC_CD_EIAJ


	final static String i_tOdr_DLV_LOC_CD_EIAJ = null;

	// 第 130 変数初期値： i_tOdr_DLV_LOC_NAME


	final static String i_tOdr_DLV_LOC_NAME = null;

	// 第 131 変数初期値： i_tOdr_DLV_LOC_NAME_KANJI


	final static String i_tOdr_DLV_LOC_NAME_KANJI = null;

	// 第 132 変数初期値： i_tOdr_PRD_ODR_PLACE_CD


	final static String i_tOdr_PRD_ODR_PLACE_CD = null;

	// 第 133 変数初期値： i_tOdr_ODR_UNIT_PRICE


	final static String i_tOdr_ODR_UNIT_PRICE = null;

	// 第 134 変数初期値： i_tOdr_SPCL_PRICE_TYP


	final static String i_tOdr_SPCL_PRICE_TYP = null;

	// 第 135 変数初期値： i_tOdr_PART_DLV_COUNT


	final static String i_tOdr_PART_DLV_COUNT = null;

	// 第 136 変数初期値： i_tOdr_DEPO_TYP


	final static String i_tOdr_DEPO_TYP = null;

	// 第 137 変数初期値： i_tOdr_DESINATED_DLV_DATE


	final static String i_tOdr_DESINATED_DLV_DATE = null;

	// 第 138 変数初期値： i_tOdr_STD_DESINATED_RCV_DATE


	final static String i_tOdr_STD_DESINATED_RCV_DATE = null;

	// 第 139 変数初期値： i_tOdr_ODR_QTY


	final static String i_tOdr_ODR_QTY = null;

	// 第 140 変数初期値： i_tOdr_REMAIN_UNCONFIRM_ODR_QTY


	final static String i_tOdr_REMAIN_UNCONFIRM_ODR_QTY = null;

	// 第 141 変数初期値： i_tOdr_CANCELED_UNCONFIRM_ODR_QTY


	final static String i_tOdr_CANCELED_UNCONFIRM_ODR_QTY = null;

	// 第 142 変数初期値： i_tOdr_UNIT_CD


	final static String i_tOdr_UNIT_CD = null;

	// 第 143 変数初期値： i_tOdr_UNCONFIRM_ODR_BALANCE


	final static String i_tOdr_UNCONFIRM_ODR_BALANCE = null;

	// 第 144 変数初期値： i_tOdr_ODR_AMOUNT


	final static String i_tOdr_ODR_AMOUNT = null;

	// 第 145 変数初期値： i_tOdr_ODR_AMOUNT_EXCH_RATES


	final static String i_tOdr_ODR_AMOUNT_EXCH_RATES = null;

	// 第 146 変数初期値： i_tOdr_TOTAL_SHIP_QTY


	final static String i_tOdr_TOTAL_SHIP_QTY = null;

	// 第 147 変数初期値： i_tOdr_SHIP_AMOUNT


	final static String i_tOdr_SHIP_AMOUNT = null;

	// 第 148 変数初期値： i_tOdr_SHIP_AMOUNT_EXCH_RATES


	final static String i_tOdr_SHIP_AMOUNT_EXCH_RATES = null;

	// 第 149 変数初期値： i_tOdr_RETURN_PRICE


	final static String i_tOdr_RETURN_PRICE = null;

	// 第 150 変数初期値： i_tOdr_RETURN_QTY


	final static String i_tOdr_RETURN_QTY = null;

	// 第 151 変数初期値： i_tOdr_RETURN_AMOUNT


	final static String i_tOdr_RETURN_AMOUNT = null;

	// 第 152 変数初期値： i_tOdr_RETURN_AMOUNT_EXCH_RATES


	final static String i_tOdr_RETURN_AMOUNT_EXCH_RATES = null;

	// 第 153 変数初期値： i_tOdr_ODR_CMPLT_FLG


	final static String i_tOdr_ODR_CMPLT_FLG = null;

	// 第 154 変数初期値： i_tOdr_ODR_CMPLT_DATE


	final static String i_tOdr_ODR_CMPLT_DATE = null;

	// 第 155 変数初期値： i_tOdr_CUS_DLV_CD


	final static String i_tOdr_CUS_DLV_CD = null;

	// 第 156 変数初期値： i_tOdr_CUS_DLV_KEY_CD


	final static String i_tOdr_CUS_DLV_KEY_CD = null;

	// 第 157 変数初期値： i_tOdr_PART_NAME


	final static String i_tOdr_PART_NAME = null;

	// 第 158 変数初期値： i_tOdr_PKG_UNIT


	final static String i_tOdr_PKG_UNIT = null;

	// 第 159 変数初期値： i_tOdr_SLIP_PRICE_PRINT_TYP


	final static String i_tOdr_SLIP_PRICE_PRINT_TYP = null;

	// 第 160 変数初期値： i_tOdr_INSPC_TYP


	final static String i_tOdr_INSPC_TYP = null;

	// 第 161 変数初期値： i_tOdr_CLIENT_REMARK


	final static String i_tOdr_CLIENT_REMARK = null;

	// 第 162 変数初期値： i_tOdr_CLIENT_REMARK_KANJI


	final static String i_tOdr_CLIENT_REMARK_KANJI = null;

	// 第 163 変数初期値： i_tOdr_CLIENT_BARCODE_INF


	final static String i_tOdr_CLIENT_BARCODE_INF = null;

	// 第 164 変数初期値： i_tOdr_TRANSPORT_CD


	final static String i_tOdr_TRANSPORT_CD = null;

	// 第 165 変数初期値： i_tOdr_TRANSPORT_TYP


	final static String i_tOdr_TRANSPORT_TYP = null;

	// 第 166 変数初期値： i_tOdr_TAX_APPLY_TYP


	final static String i_tOdr_TAX_APPLY_TYP = null;

	// 第 167 変数初期値： i_tOdr_TAX_CD


	final static String i_tOdr_TAX_CD = null;

	// 第 168 変数初期値： i_tOdr_TAX_CALC_TYP


	final static String i_tOdr_TAX_CALC_TYP = null;

	// 第 169 変数初期値： i_tOdr_REMARKS


	final static String i_tOdr_REMARKS = null;

	// 第 170 変数初期値： i_tOdr_ODR_ACPT_DATE


	final static String i_tOdr_ODR_ACPT_DATE = null;

	// 第 171 変数初期値： i_tOdr_SHIP_PLAN_REMAIN_QTY


	final static String i_tOdr_SHIP_PLAN_REMAIN_QTY = null;

	// 第 172 変数初期値： i_tOdr_SHIP_PLAN_CMPLT_FLG


	final static String i_tOdr_SHIP_PLAN_CMPLT_FLG = null;

	// 第 173 変数初期値： i_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG


	final static String i_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG = null;

	// 第 174 変数初期値： i_tOdr_PARTIAL_SHIP_INST_FLG


	final static String i_tOdr_PARTIAL_SHIP_INST_FLG = null;

	// 第 175 変数初期値： i_tOdr_IF_CTL_NO


	final static String i_tOdr_IF_CTL_NO = null;

	// 第 176 変数初期値： i_tOdr_ENTRY_TYP


	final static String i_tOdr_ENTRY_TYP = null;

	// 第 177 変数初期値： i_tOdr_BUYER_NAME


	final static String i_tOdr_BUYER_NAME = null;

	// 第 178 変数初期値： i_tOdr_PUCH_ODR_QTY_TOTAL


	final static String i_tOdr_PUCH_ODR_QTY_TOTAL = null;

	// 第 179 変数初期値： i_tOdr_UNIT_CD_ORG


	final static String i_tOdr_UNIT_CD_ORG = null;

	// 第 180 変数初期値： i_tOdr_SHIP_CNT


	final static String i_tOdr_SHIP_CNT = null;

	// 第 181 変数初期値： i_tOdr_IN_ODRNO


	final static String i_tOdr_IN_ODRNO = null;

	// 第 182 変数初期値： i_uptOdr_PART_DLV_COUNT


	final static String i_uptOdr_PART_DLV_COUNT = null;

	// 第 183 変数初期値： i_uptOdr_IN_ODRNO


	final static String i_uptOdr_IN_ODRNO = null;

	// 第 184 変数初期値： i_tOdrCtl_ODR_CTL_NO


	final static String i_tOdrCtl_ODR_CTL_NO = null;

	// 第 185 変数初期値： i_tOdrCtl_CUST_CD


	final static String i_tOdrCtl_CUST_CD = null;

	// 第 186 変数初期値： i_tOdrCtl_CUST_ITEM_CD


	final static String i_tOdrCtl_CUST_ITEM_CD = null;

	// 第 187 変数初期値： i_tOdrCtl_CUST_ITEM_NAME


	final static String i_tOdrCtl_CUST_ITEM_NAME = null;

	// 第 188 変数初期値： i_tOdrCtl_ITEM_CD


	final static String i_tOdrCtl_ITEM_CD = null;

	// 第 189 変数初期値： i_tOdrCtl_ITEM_NAME


	final static String i_tOdrCtl_ITEM_NAME = null;

	// 第 190 変数初期値： i_tOdrCtl_IN_ODRCTLNO


	final static String i_tOdrCtl_IN_ODRCTLNO = null;

	// 第 191 変数初期値： i_mItem_ITEM_CD


	final static String i_mItem_ITEM_CD = null;

	// 第 192 変数初期値： i_mItem_ITEM_NAME


	final static String i_mItem_ITEM_NAME = null;

	// 第 193 変数初期値： i_mItem_PRODUCT_TYP


	final static String i_mItem_PRODUCT_TYP = null;

	// 第 194 変数初期値： i_mItem_MRP_ODR_TYP


	final static String i_mItem_MRP_ODR_TYP = null;

	// 第 195 変数初期値： i_mItem_DRAW_CD


	final static String i_mItem_DRAW_CD = null;

	// 第 196 変数初期値： i_mItem_SPEC


	final static String i_mItem_SPEC = null;

	// 第 197 変数初期値： i_mItem_HIGH_LEVEL_NO


	final static String i_mItem_HIGH_LEVEL_NO = null;

	// 第 198 変数初期値： i_mItem_OUTSIDE_TYP


	final static String i_mItem_OUTSIDE_TYP = null;

	// 第 199 変数初期値： i_mItem_STOCK_UNIT_FLG


	final static String i_mItem_STOCK_UNIT_FLG = null;

	// 第 200 変数初期値： i_mItem_STOCK_UNIT


	final static String i_mItem_STOCK_UNIT = null;

	// 第 201 変数初期値： i_mItem_PKG_UNIT


	final static String i_mItem_PKG_UNIT = null;

	// 第 202 変数初期値： i_mItem_PKG_UNIT_QTY


	final static String i_mItem_PKG_UNIT_QTY = null;

	// 第 203 変数初期値： i_mItem_UNIT_QTY_TYP


	final static String i_mItem_UNIT_QTY_TYP = null;

	// 第 204 変数初期値： i_mItem_ODR_LT


	final static String i_mItem_ODR_LT = null;

	// 第 205 変数初期値： i_mItem_FIXED_LT


	final static String i_mItem_FIXED_LT = null;

	// 第 206 変数初期値： i_mItem_PROP_LT


	final static String i_mItem_PROP_LT = null;

	// 第 207 変数初期値： i_mItem_SAFETY_LT


	final static String i_mItem_SAFETY_LT = null;

	// 第 208 変数初期値： i_mItem_ISSUE_LT


	final static String i_mItem_ISSUE_LT = null;

	// 第 209 変数初期値： i_mItem_PROP_LOT_SIZE


	final static String i_mItem_PROP_LOT_SIZE = null;

	// 第 210 変数初期値： i_mItem_ITEM_SPOIL


	final static String i_mItem_ITEM_SPOIL = null;

	// 第 211 変数初期値： i_mItem_SAFETY_STOCK


	final static String i_mItem_SAFETY_STOCK = null;

	// 第 212 変数初期値： i_mItem_LOT_SIZING_TYP


	final static String i_mItem_LOT_SIZING_TYP = null;

	// 第 213 変数初期値： i_mItem_MAX_PERIOD


	final static String i_mItem_MAX_PERIOD = null;

	// 第 214 変数初期値： i_mItem_MAX_ODR_QTY


	final static String i_mItem_MAX_ODR_QTY = null;

	// 第 215 変数初期値： i_mItem_ODR_POINT


	final static String i_mItem_ODR_POINT = null;

	// 第 216 変数初期値： i_mItem_FIXED_ODR_QTY


	final static String i_mItem_FIXED_ODR_QTY = null;

	// 第 217 変数初期値： i_mItem_MIN_ODR_QTY


	final static String i_mItem_MIN_ODR_QTY = null;

	// 第 218 変数初期値： i_mItem_MUL_ODR_QTY


	final static String i_mItem_MUL_ODR_QTY = null;

	// 第 219 変数初期値： i_mItem_ISSUE_TYP


	final static String i_mItem_ISSUE_TYP = null;

	// 第 220 変数初期値： i_mItem_MPS_FLG


	final static String i_mItem_MPS_FLG = null;

	// 第 221 変数初期値： i_mItem_ACPT_INSPC_TYP


	final static String i_mItem_ACPT_INSPC_TYP = null;

	// 第 222 変数初期値： i_mItem_CLASIFICATION_CD


	final static String i_mItem_CLASIFICATION_CD = null;

	// 第 223 変数初期値： i_mItem_UNIT_WEIGHT


	final static String i_mItem_UNIT_WEIGHT = null;

	// 第 224 変数初期値： i_mItem_ABC_TYP


	final static String i_mItem_ABC_TYP = null;

	// 第 225 変数初期値： i_mItem_OPR_RSLT_TYP


	final static String i_mItem_OPR_RSLT_TYP = null;

	// 第 226 変数初期値： i_mItem_SPL_ITEM_TYP


	final static String i_mItem_SPL_ITEM_TYP = null;

	// 第 227 変数初期値： i_mItem_TAX_CD


	final static String i_mItem_TAX_CD = null;

	// 第 228 変数初期値： i_mItem_IN_ITEMCD


	final static String i_mItem_IN_ITEMCD = null;

	// 第 229 変数初期値： i_mCustBase_COMPANY_CD


	final static String i_mCustBase_COMPANY_CD = null;

	// 第 230 変数初期値： i_mCustBase_CUST_CD


	final static String i_mCustBase_CUST_CD = null;

	// 第 231 変数初期値： i_mCustBase_DLV_LOC_CD


	final static String i_mCustBase_DLV_LOC_CD = null;

	// 第 232 変数初期値： i_mCustBase_DLV_LOC_NAME


	final static String i_mCustBase_DLV_LOC_NAME = null;

	// 第 233 変数初期値： i_mCustBase_DLV_LOC_KNAME


	final static String i_mCustBase_DLV_LOC_KNAME = null;

	// 第 234 変数初期値： i_mCustBase_DLV_LOC_ENAME


	final static String i_mCustBase_DLV_LOC_ENAME = null;

	// 第 235 変数初期値： i_mCustBase_ZIP_CD


	final static String i_mCustBase_ZIP_CD = null;

	// 第 236 変数初期値： i_mCustBase_ADDRESS_1


	final static String i_mCustBase_ADDRESS_1 = null;

	// 第 237 変数初期値： i_mCustBase_ADDRESS_2


	final static String i_mCustBase_ADDRESS_2 = null;

	// 第 238 変数初期値： i_mCustBase_ADDRESS_K_1


	final static String i_mCustBase_ADDRESS_K_1 = null;

	// 第 239 変数初期値： i_mCustBase_ADDRESS_K_2


	final static String i_mCustBase_ADDRESS_K_2 = null;

	// 第 240 変数初期値： i_mCustBase_TEL


	final static String i_mCustBase_TEL = null;

	// 第 241 変数初期値： i_mCustBase_FAX


	final static String i_mCustBase_FAX = null;

	// 第 242 変数初期値： i_mCustBase_SHIP_WH_CD


	final static String i_mCustBase_SHIP_WH_CD = null;

	// 第 243 変数初期値： i_mCustBase_TRANSPORT_CD


	final static String i_mCustBase_TRANSPORT_CD = null;

	// 第 244 変数初期値： i_mCustBase_TRANSPORT_NAME


	final static String i_mCustBase_TRANSPORT_NAME = null;

	// 第 245 変数初期値： i_mCustBase_TRANSPORT_LT


	final static String i_mCustBase_TRANSPORT_LT = null;

	// 第 246 変数初期値： i_mCustBase_CAL_NO


	final static String i_mCustBase_CAL_NO = null;

	// 第 247 変数初期値： i_mCustBase_TRANSPORT_TYP


	final static String i_mCustBase_TRANSPORT_TYP = null;

	// 第 248 変数初期値： i_mCustBase_DLV_START_TIME


	final static String i_mCustBase_DLV_START_TIME = null;

	// 第 249 変数初期値： i_mCustBase_DLV_END_TIME


	final static String i_mCustBase_DLV_END_TIME = null;

	// 第 250 変数初期値： i_mCustBase_AREA_CLASS_TYP1


	final static String i_mCustBase_AREA_CLASS_TYP1 = null;

	// 第 251 変数初期値： i_mCustBase_AREA_CLASS_1


	final static String i_mCustBase_AREA_CLASS_1 = null;

	// 第 252 変数初期値： i_mCustBase_AREA_CLASS_TYP2


	final static String i_mCustBase_AREA_CLASS_TYP2 = null;

	// 第 253 変数初期値： i_mCustBase_AREA_CLASS_2


	final static String i_mCustBase_AREA_CLASS_2 = null;

	// 第 254 変数初期値： i_mCustBase_AREA_CLASS_TYP3


	final static String i_mCustBase_AREA_CLASS_TYP3 = null;

	// 第 255 変数初期値： i_mCustBase_AREA_CLASS_3


	final static String i_mCustBase_AREA_CLASS_3 = null;

	// 第 256 変数初期値： i_mCustBase_REMARKS_1


	final static String i_mCustBase_REMARKS_1 = null;

	// 第 257 変数初期値： i_mCustBase_REMARKS_2


	final static String i_mCustBase_REMARKS_2 = null;

	// 第 258 変数初期値： i_mCustBase_REMARKS_3


	final static String i_mCustBase_REMARKS_3 = null;

	// 第 259 変数初期値： i_mCustBase_DEPO_WH_CD


	final static String i_mCustBase_DEPO_WH_CD = null;

	// 第 260 変数初期値： i_mCustBase_IN_COMPANYCD


	final static String i_mCustBase_IN_COMPANYCD = null;

	// 第 261 変数初期値： i_mCustBase_IN_CUSTCD


	final static String i_mCustBase_IN_CUSTCD = null;

	// 第 262 変数初期値： i_mCustBase_IN_DLVLOCCD


	final static String i_mCustBase_IN_DLVLOCCD = null;

	// 第 263 変数初期値： i_mCust_COMPANY_CD


	final static String i_mCust_COMPANY_CD = null;

	// 第 264 変数初期値： i_mCust_CUST_CD


	final static String i_mCust_CUST_CD = null;

	// 第 265 変数初期値： i_mCust_CUST_NAME


	final static String i_mCust_CUST_NAME = null;

	// 第 266 変数初期値： i_mCust_CUST_ANAME


	final static String i_mCust_CUST_ANAME = null;

	// 第 267 変数初期値： i_mCust_CUST_KNAME


	final static String i_mCust_CUST_KNAME = null;

	// 第 268 変数初期値： i_mCust_OWN_ORG_CD


	final static String i_mCust_OWN_ORG_CD = null;

	// 第 269 変数初期値： i_mCust_OWN_PERSON_CD


	final static String i_mCust_OWN_PERSON_CD = null;

	// 第 270 変数初期値： i_mCust_CUR_CD


	final static String i_mCust_CUR_CD = null;

	// 第 271 変数初期値： i_mCust_EXCH_TYP


	final static String i_mCust_EXCH_TYP = null;

	// 第 272 変数初期値： i_mCust_TAX_APPLY_TYP


	final static String i_mCust_TAX_APPLY_TYP = null;

	// 第 273 変数初期値： i_mCust_TAX_CD


	final static String i_mCust_TAX_CD = null;

	// 第 274 変数初期値： i_mCust_TAX_CALC_TYP


	final static String i_mCust_TAX_CALC_TYP = null;

	// 第 275 変数初期値： i_mCust_PRICE_ROUND_TYP


	final static String i_mCust_PRICE_ROUND_TYP = null;

	// 第 276 変数初期値： i_mCust_DETAIL_ROUND_TYP


	final static String i_mCust_DETAIL_ROUND_TYP = null;

	// 第 277 変数初期値： i_mCust_UNCONFIRM_ODR_EFF_PRIOD


	final static String i_mCust_UNCONFIRM_ODR_EFF_PRIOD = null;

	// 第 278 変数初期値： i_mCust_UNCONFIRM_ODR_EFF_TERM_FLG


	final static String i_mCust_UNCONFIRM_ODR_EFF_TERM_FLG = null;

	// 第 279 変数初期値： i_mCust_EDI_CUST_VEND_CD


	final static String i_mCust_EDI_CUST_VEND_CD = null;

	// 第 280 変数初期値： i_mCust_PARTIAL_SHIP_INST_FLG


	final static String i_mCust_PARTIAL_SHIP_INST_FLG = null;

	// 第 281 変数初期値： i_mCust_DEPO_TYP


	final static String i_mCust_DEPO_TYP = null;

	// 第 282 変数初期値： i_mCust_INSPC_ACPT_TYP


	final static String i_mCust_INSPC_ACPT_TYP = null;

	// 第 283 変数初期値： i_mCust_IN_COMPANYCD


	final static String i_mCust_IN_COMPANYCD = null;

	// 第 284 変数初期値： i_mCust_IN_CUSTCD


	final static String i_mCust_IN_CUSTCD = null;

	// 第 285 変数初期値： i_strYotaku_WH_CD


	final static String i_strYotaku_WH_CD = null;

	// 第 286 変数初期値： i_strYotaku_IN_WH_TYP


	final static String i_strYotaku_IN_WH_TYP = null;

	// 第 287 変数初期値： i_in_tShipSlip_SLIP_CD


	final static String i_in_tShipSlip_SLIP_CD = null;

	// 第 288 変数初期値： i_in_tShipSlip_ITEM_CD


	final static String i_in_tShipSlip_ITEM_CD = null;

	// 第 289 変数初期値： i_in_tShipSlip_CUST_ITEM_CD


	final static String i_in_tShipSlip_CUST_ITEM_CD = null;

	// 第 290 変数初期値： i_in_tShipSlip_PART_NAME


	final static String i_in_tShipSlip_PART_NAME = null;

	// 第 291 変数初期値： i_in_tShipSlip_CUST_ODR_NO


	final static String i_in_tShipSlip_CUST_ODR_NO = null;

	// 第 292 変数初期値： i_in_tShipSlip_CUST_CD


	final static String i_in_tShipSlip_CUST_CD = null;

	// 第 293 変数初期値： i_in_tShipSlip_CUST_NAME


	final static String i_in_tShipSlip_CUST_NAME = null;

	// 第 294 変数初期値： i_in_tShipSlip_DLV_LOC_CD


	final static String i_in_tShipSlip_DLV_LOC_CD = null;

	// 第 295 変数初期値： i_in_tShipSlip_DLV_LOC_NAME_KANJI


	final static String i_in_tShipSlip_DLV_LOC_NAME_KANJI = null;

	// 第 296 変数初期値： i_in_tShipSlip_CUS_DLV_KEY_CD


	final static String i_in_tShipSlip_CUS_DLV_KEY_CD = null;

	// 第 297 変数初期値： i_in_tShipSlip_DESINATED_SHIP_DATE


	final static String i_in_tShipSlip_DESINATED_SHIP_DATE = null;

	// 第 298 変数初期値： i_in_tShipSlip_DESINATED_DLV_DATE


	final static String i_in_tShipSlip_DESINATED_DLV_DATE = null;

	// 第 299 変数初期値： i_in_tShipSlip_SCDL_DLV_DATE


	final static String i_in_tShipSlip_SCDL_DLV_DATE = null;

	// 第 300 変数初期値： i_in_tShipSlip_SHIP_ODR_QTY


	final static String i_in_tShipSlip_SHIP_ODR_QTY = null;

	// 第 301 変数初期値： i_in_tShipSlip_UNIT_CD


	final static String i_in_tShipSlip_UNIT_CD = null;

	// 第 302 変数初期値： i_in_tShipSlip_UNIT_PRICE


	final static String i_in_tShipSlip_UNIT_PRICE = null;

	// 第 303 変数初期値： i_in_tShipSlip_SHIP_ODR_AMOUNT


	final static String i_in_tShipSlip_SHIP_ODR_AMOUNT = null;

	// 第 304 変数初期値： i_in_tShipSlip_TAX_AMOUNT


	final static String i_in_tShipSlip_TAX_AMOUNT = null;

	// 第 305 変数初期値： i_in_tShipSlip_INSPC_TYP


	final static String i_in_tShipSlip_INSPC_TYP = null;

	// 第 306 変数初期値： i_in_tShipSlip_CLIENT_REMARK_KANJI


	final static String i_in_tShipSlip_CLIENT_REMARK_KANJI = null;

	// 第 307 変数初期値： i_in_tShipSlip_CLIENT_BARCODE_INF


	final static String i_in_tShipSlip_CLIENT_BARCODE_INF = null;

	// 第 308 変数初期値： i_in_tShipSlip_PRINT_FLG


	final static String i_in_tShipSlip_PRINT_FLG = null;

	// 第 309 変数初期値： i_in_tShipSlip_DEL_FLG


	final static String i_in_tShipSlip_DEL_FLG = null;

	// 第 310 変数初期値： i_in_tShipSlip_BUYER_NAME


	final static String i_in_tShipSlip_BUYER_NAME = null;

	// 第 311 変数初期値： i_in_tShipSlip_PUCH_ODR_QTY_TOTAL


	final static String i_in_tShipSlip_PUCH_ODR_QTY_TOTAL = null;

	// 第 312 変数初期値： i_in_tShipSlip_DLV_ODR_QTY


	final static String i_in_tShipSlip_DLV_ODR_QTY = null;

	// 第 313 変数初期値： i_in_tShipSlip_SHIP_ODR_AMOUNT_TAX


	final static String i_in_tShipSlip_SHIP_ODR_AMOUNT_TAX = null;

	// 第 314 変数初期値： i_in_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT


	final static String i_in_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT = null;

	// 第 315 変数初期値： i_in_tShipSlip_INTERNAL_TAX_SALES_AMOUNT


	final static String i_in_tShipSlip_INTERNAL_TAX_SALES_AMOUNT = null;

	// 第 316 変数初期値： i_in_tShipSlip_TAXFREE_SALES_AMOUNT


	final static String i_in_tShipSlip_TAXFREE_SALES_AMOUNT = null;

	// 第 317 変数初期値： i_in_tShipSlip_TAX_CREDIT_SALES_AMOUNT


	final static String i_in_tShipSlip_TAX_CREDIT_SALES_AMOUNT = null;

	// 第 318 変数初期値： i_in_tShipSlip_EXTERNAL_TAX_AMOUNT


	final static String i_in_tShipSlip_EXTERNAL_TAX_AMOUNT = null;

	// 第 319 変数初期値： i_in_tShipSlip_INTERNAL_TAX_AMOUNT


	final static String i_in_tShipSlip_INTERNAL_TAX_AMOUNT = null;

	// 第 320 変数初期値： i_in_tShipSlip_TAX_AMOUNT_1


	final static String i_in_tShipSlip_TAX_AMOUNT_1 = null;

	// 第 321 変数初期値： i_in_tShipSlip_TAX_AMOUNT_2


	final static String i_in_tShipSlip_TAX_AMOUNT_2 = null;

	// 第 322 変数初期値： i_in_tShipSlip_TAX_AMOUNT_3


	final static String i_in_tShipSlip_TAX_AMOUNT_3 = null;

	// 第 323 変数初期値： i_in_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT


	final static String i_in_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;

	// 第 324 変数初期値： i_del_tShipSlip_IN_SLIPCD


	final static String i_del_tShipSlip_IN_SLIPCD = null;

	// 第 325 変数初期値： i_uptOdr_SHIP_CNT


	final static String i_uptOdr_SHIP_CNT = null;

	// 第 326 変数初期値： i_tUnShipList_UN_SHIP_SEQ_NO


	final static String i_tUnShipList_UN_SHIP_SEQ_NO = null;

	// 第 327 変数初期値： i_tUnShipList_CUST_CD


	final static String i_tUnShipList_CUST_CD = null;

	// 第 328 変数初期値： i_tUnShipList_ACPT_ODR_CD


	final static String i_tUnShipList_ACPT_ODR_CD = null;

	// 第 329 変数初期値： i_tUnShipList_PART_DLV_SEQ_NO


	final static String i_tUnShipList_PART_DLV_SEQ_NO = null;

	// 第 330 変数初期値： i_tUnShipList_ITEM_CD


	final static String i_tUnShipList_ITEM_CD = null;

	// 第 331 変数初期値： i_tUnShipList_UN_SHIP_QTY


	final static String i_tUnShipList_UN_SHIP_QTY = null;

	// 第 332 変数初期値： i_tUnShipList_UN_SHIP_RSN


	final static String i_tUnShipList_UN_SHIP_RSN = null;

	// 第 333 変数初期値： i_tUnShipList_WH_CD


	final static String i_tUnShipList_WH_CD = null;

	// 第 334 変数初期値： i_tUnShipList_PRINT_FLG


	final static String i_tUnShipList_PRINT_FLG = null;

	// 第 335 変数初期値： i_tUnShipList_DEL_FLG


	final static String i_tUnShipList_DEL_FLG = null;

	// 第 336 変数初期値： i_tori_tAnsDlvDate_REST_SHIP_ODR_QTY


	final static String i_tori_tAnsDlvDate_REST_SHIP_ODR_QTY = null;

	// 第 337 変数初期値： i_tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG


	final static String i_tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG = null;

	// 第 338 変数初期値： i_tori_tAnsDlvDate_IN_ODRNO


	final static String i_tori_tAnsDlvDate_IN_ODRNO = null;

	// 第 339 変数初期値： i_tori_tAnsDlvDate_IN_PARTDLVSEQNO


	final static String i_tori_tAnsDlvDate_IN_PARTDLVSEQNO = null;

	// 第 340 変数初期値： i_l_COUNT


	final static String i_l_COUNT = null;

	// 第 341 変数初期値： i_ROW_COUNT


	final static String i_ROW_COUNT = null;

	// 第 342 変数初期値： i_strTAX_CD


	final static String i_strTAX_CD = null;

	// 第 343 変数初期値： i_SHIP_MODIFY_COUNT


	final static String i_SHIP_MODIFY_COUNT = null;

	// 第 344 変数初期値： i_SEL_MODIFY_COUNT


	final static String i_SEL_MODIFY_COUNT = null;

*/

	//{{user_implement_code
		// TODO: 初期化で使う定数は、ここに記述してください。
		// 以下に記述した内容は自動的には変更されません。
	// 第 1 変数初期値： i_r1_SHIP_ODR

	final static String i_r1_SHIP_ODR = null;

	// 第 2 変数初期値： i_r2_SHIP_ODR

	final static String i_r2_SHIP_ODR = null;

	// 第 3 変数初期値： i_tAnsDlvDate_MODIFY_COUNT

	final static String i_tAnsDlvDate_MODIFY_COUNT = null;

	// 第 4 変数初期値： i_tShipOdr_MODIFY_COUNT

	final static String i_tShipOdr_MODIFY_COUNT = null;

	// 第 5 変数初期値： i_Shipt_MODIFY_COUNT

	final static String i_Shipt_MODIFY_COUNT = null;

	// 第 6 変数初期値： i_h_RESULT

	final static String i_h_RESULT = null;

	// 第 7 変数初期値： i_strBUSINESS_OPR_DATE

	final static String i_strBUSINESS_OPR_DATE = null;

	// 第 8 変数初期値： i_strPLANT_CD

	final static String i_strPLANT_CD = null;

	// 第 9 変数初期値： i_strTaxTAX_KBN

	final static String i_strTaxTAX_KBN = null;

	// 第 10 変数初期値： i_strTaxOLD_TAX_1

	final static String i_strTaxOLD_TAX_1 = null;

	// 第 11 変数初期値： i_strTaxOLD_TAX_2

	final static String i_strTaxOLD_TAX_2 = null;

	// 第 12 変数初期値： i_strTaxOLD_TAX_3

	final static String i_strTaxOLD_TAX_3 = null;

	// 第 13 変数初期値： i_strTaxNEW_TAX_1

	final static String i_strTaxNEW_TAX_1 = null;

	// 第 14 変数初期値： i_strTaxNEW_TAX_2

	final static String i_strTaxNEW_TAX_2 = null;

	// 第 15 変数初期値： i_strTaxNEW_TAX_3

	final static String i_strTaxNEW_TAX_3 = null;

	// 第 16 変数初期値： i_strTaxSTART_DATE

	final static String i_strTaxSTART_DATE = null;

	// 第 17 変数初期値： i_strTaxROUND_TYP

	final static String i_strTaxROUND_TYP = null;

	// 第 18 変数初期値： i_strTaxIN_COMPANYCD

	final static String i_strTaxIN_COMPANYCD = null;

	// 第 19 変数初期値： i_strTaxIN_CUSTCD

	final static String i_strTaxIN_CUSTCD = null;

	// 第 20 変数初期値： i_g_CUST_ITEM_CD

	final static String i_g_CUST_ITEM_CD = null;

	// 第 21 変数初期値： i_tDECIMAL_FIG

	final static String i_tDECIMAL_FIG = null;

	// 第 22 変数初期値： i_tCUR_CD

	final static String i_tCUR_CD = null;

	// 第 23 変数初期値： i_strCOMPANY_CD

	final static String i_strCOMPANY_CD = null;

	// 第 24 変数初期値： i_strUSER_NAME

	final static String i_strUSER_NAME = null;

	// 第 25 変数初期値： i_strSECTION_CD

	final static String i_strSECTION_CD = null;

	// 第 26 変数初期値： i_strPLANT_NAME

	final static String i_strPLANT_NAME = null;

	// 第 27 変数初期値： i_strPLANT_ANAME

	final static String i_strPLANT_ANAME = null;

	// 第 28 変数初期値： i_strCAL_NO

	final static String i_strCAL_NO = null;

	// 第 29 変数初期値： i_strUSER_CD

	final static String i_strUSER_CD = null;

	// 第 30 変数初期値： i_strSYUKA_LT

	final static String i_strSYUKA_LT = null;

	// 第 31 変数初期値： i_tHOLIDAY_FLG

	final static String i_tHOLIDAY_FLG = null;

	// 第 32 変数初期値： i_tWH_CD

	final static String i_tWH_CD = null;

	// 第 33 変数初期値： i_tCAL_DATE

	final static String i_tCAL_DATE = null;

	// 第 34 変数初期値： i_l_ODR_NO

	final static String i_l_ODR_NO = null;

	// 第 35 変数初期値： i_l_PART_DLV_SEQ_NO

	final static String i_l_PART_DLV_SEQ_NO = null;

	// 第 36 変数初期値： i_l_DESINATED_DLV_DATE

	final static String i_l_DESINATED_DLV_DATE = null;

	// 第 37 変数初期値： i_l_DESINATED_SHIP_DATE

	final static String i_l_DESINATED_SHIP_DATE = null;

	// 第 38 変数初期値： i_l_SHIP_QTY

	final static String i_l_SHIP_QTY = null;

	// 第 39 変数初期値： i_l_REST_SHIP_QTY

	final static String i_l_REST_SHIP_QTY = null;

	// 第 40 変数初期値： i_l_WH_CD

	final static String i_l_WH_CD = null;

	// 第 41 変数初期値： i_l_WH_NAME

	final static String i_l_WH_NAME = null;

	// 第 42 変数初期値： i_l_CUST_ODR_NO

	final static String i_l_CUST_ODR_NO = null;

	// 第 43 変数初期値： i_l_CUST_CD

	final static String i_l_CUST_CD = null;

	// 第 44 変数初期値： i_l_CUST_NAME

	final static String i_l_CUST_NAME = null;

	// 第 45 変数初期値： i_l_CUST_ITEM_CD

	final static String i_l_CUST_ITEM_CD = null;

	// 第 46 変数初期値： i_l_CUST_ITEM_NAME

	final static String i_l_CUST_ITEM_NAME = null;

	// 第 47 変数初期値： i_l_ITEM_CD

	final static String i_l_ITEM_CD = null;

	// 第 48 変数初期値： i_l_ITEM_NAME

	final static String i_l_ITEM_NAME = null;

	// 第 49 変数初期値： i_l_STOCK_UNIT

	final static String i_l_STOCK_UNIT = null;

	// 第 50 変数初期値： i_l_UNIT_QTY_TYP

	final static String i_l_UNIT_QTY_TYP = null;

	// 第 51 変数初期値： i_l_MRP_ODR_TYP

	final static String i_l_MRP_ODR_TYP = null;

	// 第 52 変数初期値： i_l_ODR_CTL_NO

	final static String i_l_ODR_CTL_NO = null;

	// 第 53 変数初期値： i_l_TRANSPORT_TYP

	final static String i_l_TRANSPORT_TYP = null;

	// 第 54 変数初期値： i_l_ODR_UNIT_PRICE

	final static String i_l_ODR_UNIT_PRICE = null;

	// 第 55 変数初期値： i_l_SPCL_PRICE_TYP

	final static String i_l_SPCL_PRICE_TYP = null;

	// 第 56 変数初期値： i_l_PARTIAL_SHIP_INST_FLG

	final static String i_l_PARTIAL_SHIP_INST_FLG = null;

	// 第 57 変数初期値： i_ODR_NO

	final static String i_ODR_NO = null;

	// 第 58 変数初期値： i_ITEM_CD

	final static String i_ITEM_CD = null;

	// 第 59 変数初期値： i_DESINATED_DLV_DATE

	final static String i_DESINATED_DLV_DATE = null;

	// 第 60 変数初期値： i_DESINATED_SHIP_DATE

	final static String i_DESINATED_SHIP_DATE = null;

	// 第 61 変数初期値： i_CUST_CD

	final static String i_CUST_CD = null;

	// 第 62 変数初期値： i_CUST_CHRG_PSN_CD

	final static String i_CUST_CHRG_PSN_CD = null;

	// 第 63 変数初期値： i_CUST_ODR_NO

	final static String i_CUST_ODR_NO = null;

	// 第 64 変数初期値： i_CUST_ITEM_CD

	final static String i_CUST_ITEM_CD = null;

	// 第 65 変数初期値： i_l_SLIP_CD

	final static String i_l_SLIP_CD = null;

	// 第 66 変数初期値： i_l_JOB_ODR_CD

	final static String i_l_JOB_ODR_CD = null;

	// 第 67 変数初期値： i_l_c_DIRECT_DLV_FLG

	final static String i_l_c_DIRECT_DLV_FLG = null;

	// 第 68 変数初期値： i_SLIP_CD

	final static String i_SLIP_CD = null;


	/**
	 * 初期化
	 *
	 */
	public void initialize()
	{

		clear();

		m_r1_SHIP_ODR = i_r1_SHIP_ODR;
		m_r2_SHIP_ODR = i_r2_SHIP_ODR;
		m_tAnsDlvDate_MODIFY_COUNT = i_tAnsDlvDate_MODIFY_COUNT;
		m_tShipOdr_MODIFY_COUNT = i_tShipOdr_MODIFY_COUNT;
		m_Shipt_MODIFY_COUNT = i_Shipt_MODIFY_COUNT;
		m_h_RESULT = i_h_RESULT;
		m_strBUSINESS_OPR_DATE = i_strBUSINESS_OPR_DATE;
		m_strPLANT_CD = i_strPLANT_CD;
		m_strTaxTAX_KBN = i_strTaxTAX_KBN;
		m_strTaxOLD_TAX_1 = i_strTaxOLD_TAX_1;
		m_strTaxOLD_TAX_2 = i_strTaxOLD_TAX_2;
		m_strTaxOLD_TAX_3 = i_strTaxOLD_TAX_3;
		m_strTaxNEW_TAX_1 = i_strTaxNEW_TAX_1;
		m_strTaxNEW_TAX_2 = i_strTaxNEW_TAX_2;
		m_strTaxNEW_TAX_3 = i_strTaxNEW_TAX_3;
		m_strTaxSTART_DATE = i_strTaxSTART_DATE;
		m_strTaxROUND_TYP = i_strTaxROUND_TYP;
		m_strTaxIN_COMPANYCD = i_strTaxIN_COMPANYCD;
		m_strTaxIN_CUSTCD = i_strTaxIN_CUSTCD;
		m_l_CUST_ITEM_CD = i_l_CUST_ITEM_CD;
		m_tDECIMAL_FIG = i_tDECIMAL_FIG;
		m_tCUR_CD = i_tCUR_CD;
		m_strCOMPANY_CD = i_strCOMPANY_CD;
		m_strUSER_NAME = i_strUSER_NAME;
		m_strSECTION_CD = i_strSECTION_CD;
		m_strPLANT_NAME = i_strPLANT_NAME;
		m_strPLANT_ANAME = i_strPLANT_ANAME;
		m_strCAL_NO = i_strCAL_NO;
		m_strUSER_CD = i_strUSER_CD;
		m_strSYUKA_LT = i_strSYUKA_LT;
		m_tHOLIDAY_FLG = i_tHOLIDAY_FLG;
		m_tWH_CD = i_tWH_CD;
		m_tCAL_DATE = i_tCAL_DATE;
		m_l_ODR_NO = i_l_ODR_NO;
		m_l_PART_DLV_SEQ_NO = i_l_PART_DLV_SEQ_NO;
		m_l_DESINATED_DLV_DATE = i_l_DESINATED_DLV_DATE;
		m_l_DESINATED_SHIP_DATE = i_l_DESINATED_SHIP_DATE;
		m_l_SHIP_QTY = i_l_SHIP_QTY;
		m_l_REST_SHIP_QTY = i_l_REST_SHIP_QTY;
		m_l_WH_CD = i_l_WH_CD;
		m_l_WH_NAME = i_l_WH_NAME;
		m_l_CUST_ODR_NO = i_l_CUST_ODR_NO;
		m_l_CUST_CD = i_l_CUST_CD;
		m_l_CUST_NAME = i_l_CUST_NAME;
		m_l_CUST_ITEM_CD = i_l_CUST_ITEM_CD;
		m_l_CUST_ITEM_NAME = i_l_CUST_ITEM_NAME;
		m_l_ITEM_CD = i_l_ITEM_CD;
		m_l_ITEM_NAME = i_l_ITEM_NAME;
		m_l_STOCK_UNIT = i_l_STOCK_UNIT;
		m_l_UNIT_QTY_TYP = i_l_UNIT_QTY_TYP;
		m_l_MRP_ODR_TYP = i_l_MRP_ODR_TYP;
		m_l_ODR_CTL_NO = i_l_ODR_CTL_NO;
		m_l_TRANSPORT_TYP = i_l_TRANSPORT_TYP;
		m_l_ODR_UNIT_PRICE = i_l_ODR_UNIT_PRICE;
		m_l_SPCL_PRICE_TYP = i_l_SPCL_PRICE_TYP;
		m_l_PARTIAL_SHIP_INST_FLG = i_l_PARTIAL_SHIP_INST_FLG;
		m_ODR_NO = i_ODR_NO;
		m_ITEM_CD = i_ITEM_CD;
		m_DESINATED_DLV_DATE = i_DESINATED_DLV_DATE;
		m_DESINATED_SHIP_DATE = i_DESINATED_SHIP_DATE;
		m_CUST_CD = i_CUST_CD;
		m_CUST_CHRG_PSN_CD = i_CUST_CHRG_PSN_CD;
		m_CUST_ODR_NO = i_CUST_ODR_NO;
		m_CUST_ITEM_CD = i_CUST_ITEM_CD;
		m_l_SLIP_CD = i_l_SLIP_CD;
		m_l_JOB_ODR_CD = i_l_JOB_ODR_CD;
		m_l_c_DIRECT_DLV_FLG = i_l_c_DIRECT_DLV_FLG;
		m_SLIP_CD = i_SLIP_CD;
	}
		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
