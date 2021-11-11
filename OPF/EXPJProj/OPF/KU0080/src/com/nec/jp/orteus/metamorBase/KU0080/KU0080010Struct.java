/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KU0080/src/com/nec/jp/orteus/metamorBase/KU0080/KU0080010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.KU0080;

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
 * CLASS     : KU0080010Control クラス
 * ファイル・クラス説明
 * @author $Author: geng-jia $
 * @version $Revision: 1.2 $ $Date: 2015/09/15 07:18:21 $
 *
 */
//}}user_implement_code_header

public class KU0080010Struct extends DataStruct
{

	//////////////////////////////

	/** 第 1 変数： m_TRANSPORT_METHOD_name */
	public String m_TRANSPORT_METHOD_name = null;
	/** 第 2 変数： m_TRANSPORT_METHOD_val */
	public String m_TRANSPORT_METHOD_val = null;
	/** 第 3 変数： m_SCDL_SHIP_DATE_TIME */
	public String m_SCDL_SHIP_DATE_TIME = null;
	/** 第 4 変数： m_strTaxIncludeAmount */
	public String m_strTaxIncludeAmount = null;
	/** 第 5 変数： m_strTaxCreditAmount */
	public String m_strTaxCreditAmount = null;
	/** 第 6 変数： m_unit_cost_typ_val */
	public String m_unit_cost_typ_val = null;
	/** 第 7 変数： m_jump_flag */
	public String m_jump_flag = null;
	/** 第 8 変数： m_strTaxIN_CUST_ITEM_CD */
	public String m_strTaxIN_CUST_ITEM_CD = null;
	/** 第 9 変数： m_SHIP_INVOICE_NO */
	public String m_SHIP_INVOICE_NO = null;
	/** 第 10 変数： m_DEPARTURE_PLACE */
	public String m_DEPARTURE_PLACE = null;
	/** 第 11 変数： m_DEPARTURE_DATE */
	public String m_DEPARTURE_DATE = null;
	/** 第 12 変数： m_ARRIVAL_PLACE */
	public String m_ARRIVAL_PLACE = null;
	/** 第 13 変数： m_ARRIVAL_DATE */
	public String m_ARRIVAL_DATE = null;
	/** 第 14 変数： m_TRANSPORT_METHOD */
	public String m_TRANSPORT_METHOD = null;
	/** 第 15 変数： m_SHIP_NO */
	public String m_SHIP_NO = null;
	/** 第 16 変数： m_REMARKS_1 */
	public String m_REMARKS_1 = null;
	/** 第 17 変数： m_REMARKS_2 */
	public String m_REMARKS_2 = null;
	/** 第 18 変数： m_CUST_CD */
	public String m_CUST_CD = null;
	/** 第 19 変数： m_DLV_LOC_CD */
	public String m_DLV_LOC_CD = null;
	/** 第 20 変数： m_INVOICE_AMOUNT */
	public String m_INVOICE_AMOUNT = null;
	/** 第 21 変数： m_INVOICE_TAX_AMOUNT */
	public String m_INVOICE_TAX_AMOUNT = null;
	/** 第 22 変数： m_PRINT_FLG */
	public String m_PRINT_FLG = null;
	/** 第 23 変数： m_SCDL_SHIP_DATE */
	public String m_SCDL_SHIP_DATE = null;
	/** 第 24 変数： m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** 第 25 変数： m_IN_SHIP_INVOICE_CTL_NO */
	public String m_IN_SHIP_INVOICE_CTL_NO = null;
	/** 第 26 変数： m_SLIP_DETAIL_NO */
	public String m_SLIP_DETAIL_NO = null;
	/** 第 27 変数： m_CUST_ITEM_CD */
	public String m_CUST_ITEM_CD = null;
	/** 第 28 変数： m_CUST_ODR_NO */
	public String m_CUST_ODR_NO = null;
	/** 第 29 変数： m_ODR_NO */
	public String m_ODR_NO = null;
	/** 第 30 変数： m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** 第 31 変数： m_SHIP_ODR_NO */
	public String m_SHIP_ODR_NO = null;
	/** 第 32 変数： m_SHIP_QTY */
	public String m_SHIP_QTY = null;
	/** 第 33 変数： m_UNIT_PRICE */
	public String m_UNIT_PRICE = null;
	/** 第 34 変数： m_SHIP_ODR_AMOUNT */
	public String m_SHIP_ODR_AMOUNT = null;
	/** 第 35 変数： m_UNIT_COST_TYP */
	public String m_UNIT_COST_TYP = null;
	/** 第 36 変数： m_TAX_AMOUNT */
	public String m_TAX_AMOUNT = null;
	/** 第 37 変数： m_TAX_RATE */
	public String m_TAX_RATE = null;
	/** 第 38 変数： m_CUST_ITEM_NAME */
	public String m_CUST_ITEM_NAME = null;
	/** 第 39 変数： m_PART_DLV_SEQ_NO */
	public String m_PART_DLV_SEQ_NO = null;
	/** 第 40 変数： m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** 第 41 変数： m_strCOMPANY_CD */
	public String m_strCOMPANY_CD = null;
	/** 第 42 変数： m_SCDL_DLV_DATE */
	public String m_SCDL_DLV_DATE = null;
	/** 第 43 変数： m_strTaxTAX_KBN */
	public String m_strTaxTAX_KBN = null;
	/** 第 44 変数： m_strTaxOLD_TAX_1 */
	public String m_strTaxOLD_TAX_1 = null;
	/** 第 45 変数： m_strTaxOLD_TAX_2 */
	public String m_strTaxOLD_TAX_2 = null;
	/** 第 46 変数： m_strTaxOLD_TAX_3 */
	public String m_strTaxOLD_TAX_3 = null;
	/** 第 47 変数： m_strTaxNEW_TAX_1 */
	public String m_strTaxNEW_TAX_1 = null;
	/** 第 48 変数： m_strTaxNEW_TAX_2 */
	public String m_strTaxNEW_TAX_2 = null;
	/** 第 49 変数： m_strTaxNEW_TAX_3 */
	public String m_strTaxNEW_TAX_3 = null;
	/** 第 50 変数： m_strTaxSTART_DATE */
	public String m_strTaxSTART_DATE = null;
	/** 第 51 変数： m_strTaxROUND_TYP */
	public String m_strTaxROUND_TYP = null;
	/** 第 52 変数： m_strTaxIN_ODR_NO */
	public String m_strTaxIN_ODR_NO = null;
	/** 第 53 変数： m_strTaxIN_DECIMAL_FIG */
	public String m_strTaxIN_DECIMAL_FIG = null;
	/** 第 54 変数： m_strTaxIN_COMPANYCD */
	public String m_strTaxIN_COMPANYCD = null;
	/** 第 55 変数： m_strTaxIN_CUSTCD */
	public String m_strTaxIN_CUSTCD = null;
	/** 第 56 変数： m_PRINT_DATE */
	public String m_PRINT_DATE = null;
	/** 第 57 変数： m_SHIP_INVOICE_DTL_CTL_NO */
	public String m_SHIP_INVOICE_DTL_CTL_NO = null;
	/** 第 58 変数： m_INSPC_ACPT_TYP */
	public String m_INSPC_ACPT_TYP = null;

	// List型メンバ変数定義

	/** 第 1 List変数： l_TRANSPORT_METHOD_name */
	public List l_TRANSPORT_METHOD_name = null;

	/** 第 2 List変数： l_TRANSPORT_METHOD_val */
	public List l_TRANSPORT_METHOD_val = null;

	/** 第 3 List変数： l_SCDL_SHIP_DATE_TIME */
	public List l_SCDL_SHIP_DATE_TIME = null;

	/** 第 4 List変数： l_strTaxIncludeAmount */
	public List l_strTaxIncludeAmount = null;

	/** 第 5 List変数： l_strTaxCreditAmount */
	public List l_strTaxCreditAmount = null;

	/** 第 6 List変数： l_unit_cost_typ_val */
	public List l_unit_cost_typ_val = null;

	/** 第 7 List変数： l_jump_flag */
	public List l_jump_flag = null;

	/** 第 8 List変数： l_strTaxIN_CUST_ITEM_CD */
	public List l_strTaxIN_CUST_ITEM_CD = null;

	/** 第 9 List変数： l_SHIP_INVOICE_NO */
	public List l_SHIP_INVOICE_NO = null;

	/** 第 10 List変数： l_DEPARTURE_PLACE */
	public List l_DEPARTURE_PLACE = null;

	/** 第 11 List変数： l_DEPARTURE_DATE */
	public List l_DEPARTURE_DATE = null;

	/** 第 12 List変数： l_ARRIVAL_PLACE */
	public List l_ARRIVAL_PLACE = null;

	/** 第 13 List変数： l_ARRIVAL_DATE */
	public List l_ARRIVAL_DATE = null;

	/** 第 14 List変数： l_TRANSPORT_METHOD */
	public List l_TRANSPORT_METHOD = null;

	/** 第 15 List変数： l_SHIP_NO */
	public List l_SHIP_NO = null;

	/** 第 16 List変数： l_REMARKS_1 */
	public List l_REMARKS_1 = null;

	/** 第 17 List変数： l_REMARKS_2 */
	public List l_REMARKS_2 = null;

	/** 第 18 List変数： l_CUST_CD */
	public List l_CUST_CD = null;

	/** 第 19 List変数： l_DLV_LOC_CD */
	public List l_DLV_LOC_CD = null;

	/** 第 20 List変数： l_INVOICE_AMOUNT */
	public List l_INVOICE_AMOUNT = null;

	/** 第 21 List変数： l_INVOICE_TAX_AMOUNT */
	public List l_INVOICE_TAX_AMOUNT = null;

	/** 第 22 List変数： l_PRINT_FLG */
	public List l_PRINT_FLG = null;

	/** 第 23 List変数： l_SCDL_SHIP_DATE */
	public List l_SCDL_SHIP_DATE = null;

	/** 第 24 List変数： l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** 第 25 List変数： l_IN_SHIP_INVOICE_CTL_NO */
	public List l_IN_SHIP_INVOICE_CTL_NO = null;

	/** 第 26 List変数： l_SLIP_DETAIL_NO */
	public List l_SLIP_DETAIL_NO = null;

	/** 第 27 List変数： l_CUST_ITEM_CD */
	public List l_CUST_ITEM_CD = null;

	/** 第 28 List変数： l_CUST_ODR_NO */
	public List l_CUST_ODR_NO = null;

	/** 第 29 List変数： l_ODR_NO */
	public List l_ODR_NO = null;

	/** 第 30 List変数： l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** 第 31 List変数： l_SHIP_ODR_NO */
	public List l_SHIP_ODR_NO = null;

	/** 第 32 List変数： l_SHIP_QTY */
	public List l_SHIP_QTY = null;

	/** 第 33 List変数： l_UNIT_PRICE */
	public List l_UNIT_PRICE = null;

	/** 第 34 List変数： l_SHIP_ODR_AMOUNT */
	public List l_SHIP_ODR_AMOUNT = null;

	/** 第 35 List変数： l_UNIT_COST_TYP */
	public List l_UNIT_COST_TYP = null;

	/** 第 36 List変数： l_TAX_AMOUNT */
	public List l_TAX_AMOUNT = null;

	/** 第 37 List変数： l_TAX_RATE */
	public List l_TAX_RATE = null;

	/** 第 38 List変数： l_CUST_ITEM_NAME */
	public List l_CUST_ITEM_NAME = null;

	/** 第 39 List変数： l_PART_DLV_SEQ_NO */
	public List l_PART_DLV_SEQ_NO = null;

	/** 第 40 List変数： l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** 第 41 List変数： l_strCOMPANY_CD */
	public List l_strCOMPANY_CD = null;

	/** 第 42 List変数： l_SCDL_DLV_DATE */
	public List l_SCDL_DLV_DATE = null;

	/** 第 43 List変数： l_strTaxTAX_KBN */
	public List l_strTaxTAX_KBN = null;

	/** 第 44 List変数： l_strTaxOLD_TAX_1 */
	public List l_strTaxOLD_TAX_1 = null;

	/** 第 45 List変数： l_strTaxOLD_TAX_2 */
	public List l_strTaxOLD_TAX_2 = null;

	/** 第 46 List変数： l_strTaxOLD_TAX_3 */
	public List l_strTaxOLD_TAX_3 = null;

	/** 第 47 List変数： l_strTaxNEW_TAX_1 */
	public List l_strTaxNEW_TAX_1 = null;

	/** 第 48 List変数： l_strTaxNEW_TAX_2 */
	public List l_strTaxNEW_TAX_2 = null;

	/** 第 49 List変数： l_strTaxNEW_TAX_3 */
	public List l_strTaxNEW_TAX_3 = null;

	/** 第 50 List変数： l_strTaxSTART_DATE */
	public List l_strTaxSTART_DATE = null;

	/** 第 51 List変数： l_strTaxROUND_TYP */
	public List l_strTaxROUND_TYP = null;

	/** 第 52 List変数： l_strTaxIN_ODR_NO */
	public List l_strTaxIN_ODR_NO = null;

	/** 第 53 List変数： l_strTaxIN_DECIMAL_FIG */
	public List l_strTaxIN_DECIMAL_FIG = null;

	/** 第 54 List変数： l_strTaxIN_COMPANYCD */
	public List l_strTaxIN_COMPANYCD = null;

	/** 第 55 List変数： l_strTaxIN_CUSTCD */
	public List l_strTaxIN_CUSTCD = null;

	/** 第 56 List変数： l_PRINT_DATE */
	public List l_PRINT_DATE = null;

	/** 第 57 List変数： l_SHIP_INVOICE_DTL_CTL_NO */
	public List l_SHIP_INVOICE_DTL_CTL_NO = null;

	/** 第 58 List変数： l_INSPC_ACPT_TYP */
	public List l_INSPC_ACPT_TYP = null;


	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getTRANSPORT_METHOD_name() { return m_TRANSPORT_METHOD_name; }
	public String getTRANSPORT_METHOD_val() { return m_TRANSPORT_METHOD_val; }
	public String getSCDL_SHIP_DATE_TIME() { return m_SCDL_SHIP_DATE_TIME; }
	public String getstrTaxIncludeAmount() { return m_strTaxIncludeAmount; }
	public String getstrTaxCreditAmount() { return m_strTaxCreditAmount; }
	public String getunit_cost_typ_val() { return m_unit_cost_typ_val; }
	public String getjump_flag() { return m_jump_flag; }
	public String getstrTaxIN_CUST_ITEM_CD() { return m_strTaxIN_CUST_ITEM_CD; }
	public String getSHIP_INVOICE_NO() { return m_SHIP_INVOICE_NO; }
	public String getDEPARTURE_PLACE() { return m_DEPARTURE_PLACE; }
	public String getDEPARTURE_DATE() { return m_DEPARTURE_DATE; }
	public String getARRIVAL_PLACE() { return m_ARRIVAL_PLACE; }
	public String getARRIVAL_DATE() { return m_ARRIVAL_DATE; }
	public String getTRANSPORT_METHOD() { return m_TRANSPORT_METHOD; }
	public String getSHIP_NO() { return m_SHIP_NO; }
	public String getREMARKS_1() { return m_REMARKS_1; }
	public String getREMARKS_2() { return m_REMARKS_2; }
	public String getCUST_CD() { return m_CUST_CD; }
	public String getDLV_LOC_CD() { return m_DLV_LOC_CD; }
	public String getINVOICE_AMOUNT() { return m_INVOICE_AMOUNT; }
	public String getINVOICE_TAX_AMOUNT() { return m_INVOICE_TAX_AMOUNT; }
	public String getPRINT_FLG() { return m_PRINT_FLG; }
	public String getSCDL_SHIP_DATE() { return m_SCDL_SHIP_DATE; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getIN_SHIP_INVOICE_CTL_NO() { return m_IN_SHIP_INVOICE_CTL_NO; }
	public String getSLIP_DETAIL_NO() { return m_SLIP_DETAIL_NO; }
	public String getCUST_ITEM_CD() { return m_CUST_ITEM_CD; }
	public String getCUST_ODR_NO() { return m_CUST_ODR_NO; }
	public String getODR_NO() { return m_ODR_NO; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getSHIP_ODR_NO() { return m_SHIP_ODR_NO; }
	public String getSHIP_QTY() { return m_SHIP_QTY; }
	public String getUNIT_PRICE() { return m_UNIT_PRICE; }
	public String getSHIP_ODR_AMOUNT() { return m_SHIP_ODR_AMOUNT; }
	public String getUNIT_COST_TYP() { return m_UNIT_COST_TYP; }
	public String getTAX_AMOUNT() { return m_TAX_AMOUNT; }
	public String getTAX_RATE() { return m_TAX_RATE; }
	public String getCUST_ITEM_NAME() { return m_CUST_ITEM_NAME; }
	public String getPART_DLV_SEQ_NO() { return m_PART_DLV_SEQ_NO; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getstrCOMPANY_CD() { return m_strCOMPANY_CD; }
	public String getSCDL_DLV_DATE() { return m_SCDL_DLV_DATE; }
	public String getstrTaxTAX_KBN() { return m_strTaxTAX_KBN; }
	public String getstrTaxOLD_TAX_1() { return m_strTaxOLD_TAX_1; }
	public String getstrTaxOLD_TAX_2() { return m_strTaxOLD_TAX_2; }
	public String getstrTaxOLD_TAX_3() { return m_strTaxOLD_TAX_3; }
	public String getstrTaxNEW_TAX_1() { return m_strTaxNEW_TAX_1; }
	public String getstrTaxNEW_TAX_2() { return m_strTaxNEW_TAX_2; }
	public String getstrTaxNEW_TAX_3() { return m_strTaxNEW_TAX_3; }
	public String getstrTaxSTART_DATE() { return m_strTaxSTART_DATE; }
	public String getstrTaxROUND_TYP() { return m_strTaxROUND_TYP; }
	public String getstrTaxIN_ODR_NO() { return m_strTaxIN_ODR_NO; }
	public String getstrTaxIN_DECIMAL_FIG() { return m_strTaxIN_DECIMAL_FIG; }
	public String getstrTaxIN_COMPANYCD() { return m_strTaxIN_COMPANYCD; }
	public String getstrTaxIN_CUSTCD() { return m_strTaxIN_CUSTCD; }
	public String getPRINT_DATE() { return m_PRINT_DATE; }
	public String getSHIP_INVOICE_DTL_CTL_NO() { return m_SHIP_INVOICE_DTL_CTL_NO; }
	public String getINSPC_ACPT_TYP() { return m_INSPC_ACPT_TYP; }

	public List getList_TRANSPORT_METHOD_name() { return l_TRANSPORT_METHOD_name; }
	public List getList_TRANSPORT_METHOD_val() { return l_TRANSPORT_METHOD_val; }
	public List getList_SCDL_SHIP_DATE_TIME() { return l_SCDL_SHIP_DATE_TIME; }
	public List getList_strTaxIncludeAmount() { return l_strTaxIncludeAmount; }
	public List getList_strTaxCreditAmount() { return l_strTaxCreditAmount; }
	public List getList_unit_cost_typ_val() { return l_unit_cost_typ_val; }
	public List getList_jump_flag() { return l_jump_flag; }
	public List getList_strTaxIN_CUST_ITEM_CD() { return l_strTaxIN_CUST_ITEM_CD; }
	public List getList_SHIP_INVOICE_NO() { return l_SHIP_INVOICE_NO; }
	public List getList_DEPARTURE_PLACE() { return l_DEPARTURE_PLACE; }
	public List getList_DEPARTURE_DATE() { return l_DEPARTURE_DATE; }
	public List getList_ARRIVAL_PLACE() { return l_ARRIVAL_PLACE; }
	public List getList_ARRIVAL_DATE() { return l_ARRIVAL_DATE; }
	public List getList_TRANSPORT_METHOD() { return l_TRANSPORT_METHOD; }
	public List getList_SHIP_NO() { return l_SHIP_NO; }
	public List getList_REMARKS_1() { return l_REMARKS_1; }
	public List getList_REMARKS_2() { return l_REMARKS_2; }
	public List getList_CUST_CD() { return l_CUST_CD; }
	public List getList_DLV_LOC_CD() { return l_DLV_LOC_CD; }
	public List getList_INVOICE_AMOUNT() { return l_INVOICE_AMOUNT; }
	public List getList_INVOICE_TAX_AMOUNT() { return l_INVOICE_TAX_AMOUNT; }
	public List getList_PRINT_FLG() { return l_PRINT_FLG; }
	public List getList_SCDL_SHIP_DATE() { return l_SCDL_SHIP_DATE; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_IN_SHIP_INVOICE_CTL_NO() { return l_IN_SHIP_INVOICE_CTL_NO; }
	public List getList_SLIP_DETAIL_NO() { return l_SLIP_DETAIL_NO; }
	public List getList_CUST_ITEM_CD() { return l_CUST_ITEM_CD; }
	public List getList_CUST_ODR_NO() { return l_CUST_ODR_NO; }
	public List getList_ODR_NO() { return l_ODR_NO; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_SHIP_ODR_NO() { return l_SHIP_ODR_NO; }
	public List getList_SHIP_QTY() { return l_SHIP_QTY; }
	public List getList_UNIT_PRICE() { return l_UNIT_PRICE; }
	public List getList_SHIP_ODR_AMOUNT() { return l_SHIP_ODR_AMOUNT; }
	public List getList_UNIT_COST_TYP() { return l_UNIT_COST_TYP; }
	public List getList_TAX_AMOUNT() { return l_TAX_AMOUNT; }
	public List getList_TAX_RATE() { return l_TAX_RATE; }
	public List getList_CUST_ITEM_NAME() { return l_CUST_ITEM_NAME; }
	public List getList_PART_DLV_SEQ_NO() { return l_PART_DLV_SEQ_NO; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_strCOMPANY_CD() { return l_strCOMPANY_CD; }
	public List getList_SCDL_DLV_DATE() { return l_SCDL_DLV_DATE; }
	public List getList_strTaxTAX_KBN() { return l_strTaxTAX_KBN; }
	public List getList_strTaxOLD_TAX_1() { return l_strTaxOLD_TAX_1; }
	public List getList_strTaxOLD_TAX_2() { return l_strTaxOLD_TAX_2; }
	public List getList_strTaxOLD_TAX_3() { return l_strTaxOLD_TAX_3; }
	public List getList_strTaxNEW_TAX_1() { return l_strTaxNEW_TAX_1; }
	public List getList_strTaxNEW_TAX_2() { return l_strTaxNEW_TAX_2; }
	public List getList_strTaxNEW_TAX_3() { return l_strTaxNEW_TAX_3; }
	public List getList_strTaxSTART_DATE() { return l_strTaxSTART_DATE; }
	public List getList_strTaxROUND_TYP() { return l_strTaxROUND_TYP; }
	public List getList_strTaxIN_ODR_NO() { return l_strTaxIN_ODR_NO; }
	public List getList_strTaxIN_DECIMAL_FIG() { return l_strTaxIN_DECIMAL_FIG; }
	public List getList_strTaxIN_COMPANYCD() { return l_strTaxIN_COMPANYCD; }
	public List getList_strTaxIN_CUSTCD() { return l_strTaxIN_CUSTCD; }
	public List getList_PRINT_DATE() { return l_PRINT_DATE; }
	public List getList_SHIP_INVOICE_DTL_CTL_NO() { return l_SHIP_INVOICE_DTL_CTL_NO; }
	public List getList_INSPC_ACPT_TYP() { return l_INSPC_ACPT_TYP; }

	public void setTRANSPORT_METHOD_name(String val) { m_TRANSPORT_METHOD_name = val; }
	public void setTRANSPORT_METHOD_val(String val) { m_TRANSPORT_METHOD_val = val; }
	public void setSCDL_SHIP_DATE_TIME(String val) { m_SCDL_SHIP_DATE_TIME = val; }
	public void setstrTaxIncludeAmount(String val) { m_strTaxIncludeAmount = val; }
	public void setstrTaxCreditAmount(String val) { m_strTaxCreditAmount = val; }
	public void setunit_cost_typ_val(String val) { m_unit_cost_typ_val = val; }
	public void setjump_flag(String val) { m_jump_flag = val; }
	public void setstrTaxIN_CUST_ITEM_CD(String val) { m_strTaxIN_CUST_ITEM_CD = val; }
	public void setSHIP_INVOICE_NO(String val) { m_SHIP_INVOICE_NO = val; }
	public void setDEPARTURE_PLACE(String val) { m_DEPARTURE_PLACE = val; }
	public void setDEPARTURE_DATE(String val) { m_DEPARTURE_DATE = val; }
	public void setARRIVAL_PLACE(String val) { m_ARRIVAL_PLACE = val; }
	public void setARRIVAL_DATE(String val) { m_ARRIVAL_DATE = val; }
	public void setTRANSPORT_METHOD(String val) { m_TRANSPORT_METHOD = val; }
	public void setSHIP_NO(String val) { m_SHIP_NO = val; }
	public void setREMARKS_1(String val) { m_REMARKS_1 = val; }
	public void setREMARKS_2(String val) { m_REMARKS_2 = val; }
	public void setCUST_CD(String val) { m_CUST_CD = val; }
	public void setDLV_LOC_CD(String val) { m_DLV_LOC_CD = val; }
	public void setINVOICE_AMOUNT(String val) { m_INVOICE_AMOUNT = val; }
	public void setINVOICE_TAX_AMOUNT(String val) { m_INVOICE_TAX_AMOUNT = val; }
	public void setPRINT_FLG(String val) { m_PRINT_FLG = val; }
	public void setSCDL_SHIP_DATE(String val) { m_SCDL_SHIP_DATE = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setIN_SHIP_INVOICE_CTL_NO(String val) { m_IN_SHIP_INVOICE_CTL_NO = val; }
	public void setSLIP_DETAIL_NO(String val) { m_SLIP_DETAIL_NO = val; }
	public void setCUST_ITEM_CD(String val) { m_CUST_ITEM_CD = val; }
	public void setCUST_ODR_NO(String val) { m_CUST_ODR_NO = val; }
	public void setODR_NO(String val) { m_ODR_NO = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setSHIP_ODR_NO(String val) { m_SHIP_ODR_NO = val; }
	public void setSHIP_QTY(String val) { m_SHIP_QTY = val; }
	public void setUNIT_PRICE(String val) { m_UNIT_PRICE = val; }
	public void setSHIP_ODR_AMOUNT(String val) { m_SHIP_ODR_AMOUNT = val; }
	public void setUNIT_COST_TYP(String val) { m_UNIT_COST_TYP = val; }
	public void setTAX_AMOUNT(String val) { m_TAX_AMOUNT = val; }
	public void setTAX_RATE(String val) { m_TAX_RATE = val; }
	public void setCUST_ITEM_NAME(String val) { m_CUST_ITEM_NAME = val; }
	public void setPART_DLV_SEQ_NO(String val) { m_PART_DLV_SEQ_NO = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setstrCOMPANY_CD(String val) { m_strCOMPANY_CD = val; }
	public void setSCDL_DLV_DATE(String val) { m_SCDL_DLV_DATE = val; }
	public void setstrTaxTAX_KBN(String val) { m_strTaxTAX_KBN = val; }
	public void setstrTaxOLD_TAX_1(String val) { m_strTaxOLD_TAX_1 = val; }
	public void setstrTaxOLD_TAX_2(String val) { m_strTaxOLD_TAX_2 = val; }
	public void setstrTaxOLD_TAX_3(String val) { m_strTaxOLD_TAX_3 = val; }
	public void setstrTaxNEW_TAX_1(String val) { m_strTaxNEW_TAX_1 = val; }
	public void setstrTaxNEW_TAX_2(String val) { m_strTaxNEW_TAX_2 = val; }
	public void setstrTaxNEW_TAX_3(String val) { m_strTaxNEW_TAX_3 = val; }
	public void setstrTaxSTART_DATE(String val) { m_strTaxSTART_DATE = val; }
	public void setstrTaxROUND_TYP(String val) { m_strTaxROUND_TYP = val; }
	public void setstrTaxIN_ODR_NO(String val) { m_strTaxIN_ODR_NO = val; }
	public void setstrTaxIN_DECIMAL_FIG(String val) { m_strTaxIN_DECIMAL_FIG = val; }
	public void setstrTaxIN_COMPANYCD(String val) { m_strTaxIN_COMPANYCD = val; }
	public void setstrTaxIN_CUSTCD(String val) { m_strTaxIN_CUSTCD = val; }
	public void setPRINT_DATE(String val) { m_PRINT_DATE = val; }
	public void setSHIP_INVOICE_DTL_CTL_NO(String val) { m_SHIP_INVOICE_DTL_CTL_NO = val; }
	public void setINSPC_ACPT_TYP(String val) { m_INSPC_ACPT_TYP = val; }


	public void setList_TRANSPORT_METHOD_name(List list) { l_TRANSPORT_METHOD_name = list; }
	public void setList_TRANSPORT_METHOD_val(List list) { l_TRANSPORT_METHOD_val = list; }
	public void setList_SCDL_SHIP_DATE_TIME(List list) { l_SCDL_SHIP_DATE_TIME = list; }
	public void setList_strTaxIncludeAmount(List list) { l_strTaxIncludeAmount = list; }
	public void setList_strTaxCreditAmount(List list) { l_strTaxCreditAmount = list; }
	public void setList_unit_cost_typ_val(List list) { l_unit_cost_typ_val = list; }
	public void setList_jump_flag(List list) { l_jump_flag = list; }
	public void setList_strTaxIN_CUST_ITEM_CD(List list) { l_strTaxIN_CUST_ITEM_CD = list; }
	public void setList_SHIP_INVOICE_NO(List list) { l_SHIP_INVOICE_NO = list; }
	public void setList_DEPARTURE_PLACE(List list) { l_DEPARTURE_PLACE = list; }
	public void setList_DEPARTURE_DATE(List list) { l_DEPARTURE_DATE = list; }
	public void setList_ARRIVAL_PLACE(List list) { l_ARRIVAL_PLACE = list; }
	public void setList_ARRIVAL_DATE(List list) { l_ARRIVAL_DATE = list; }
	public void setList_TRANSPORT_METHOD(List list) { l_TRANSPORT_METHOD = list; }
	public void setList_SHIP_NO(List list) { l_SHIP_NO = list; }
	public void setList_REMARKS_1(List list) { l_REMARKS_1 = list; }
	public void setList_REMARKS_2(List list) { l_REMARKS_2 = list; }
	public void setList_CUST_CD(List list) { l_CUST_CD = list; }
	public void setList_DLV_LOC_CD(List list) { l_DLV_LOC_CD = list; }
	public void setList_INVOICE_AMOUNT(List list) { l_INVOICE_AMOUNT = list; }
	public void setList_INVOICE_TAX_AMOUNT(List list) { l_INVOICE_TAX_AMOUNT = list; }
	public void setList_PRINT_FLG(List list) { l_PRINT_FLG = list; }
	public void setList_SCDL_SHIP_DATE(List list) { l_SCDL_SHIP_DATE = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_IN_SHIP_INVOICE_CTL_NO(List list) { l_IN_SHIP_INVOICE_CTL_NO = list; }
	public void setList_SLIP_DETAIL_NO(List list) { l_SLIP_DETAIL_NO = list; }
	public void setList_CUST_ITEM_CD(List list) { l_CUST_ITEM_CD = list; }
	public void setList_CUST_ODR_NO(List list) { l_CUST_ODR_NO = list; }
	public void setList_ODR_NO(List list) { l_ODR_NO = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_SHIP_ODR_NO(List list) { l_SHIP_ODR_NO = list; }
	public void setList_SHIP_QTY(List list) { l_SHIP_QTY = list; }
	public void setList_UNIT_PRICE(List list) { l_UNIT_PRICE = list; }
	public void setList_SHIP_ODR_AMOUNT(List list) { l_SHIP_ODR_AMOUNT = list; }
	public void setList_UNIT_COST_TYP(List list) { l_UNIT_COST_TYP = list; }
	public void setList_TAX_AMOUNT(List list) { l_TAX_AMOUNT = list; }
	public void setList_TAX_RATE(List list) { l_TAX_RATE = list; }
	public void setList_CUST_ITEM_NAME(List list) { l_CUST_ITEM_NAME = list; }
	public void setList_PART_DLV_SEQ_NO(List list) { l_PART_DLV_SEQ_NO = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_strCOMPANY_CD(List list) { l_strCOMPANY_CD = list; }
	public void setList_SCDL_DLV_DATE(List list) { l_SCDL_DLV_DATE = list; }
	public void setList_strTaxTAX_KBN(List list) { l_strTaxTAX_KBN = list; }
	public void setList_strTaxOLD_TAX_1(List list) { l_strTaxOLD_TAX_1 = list; }
	public void setList_strTaxOLD_TAX_2(List list) { l_strTaxOLD_TAX_2 = list; }
	public void setList_strTaxOLD_TAX_3(List list) { l_strTaxOLD_TAX_3 = list; }
	public void setList_strTaxNEW_TAX_1(List list) { l_strTaxNEW_TAX_1 = list; }
	public void setList_strTaxNEW_TAX_2(List list) { l_strTaxNEW_TAX_2 = list; }
	public void setList_strTaxNEW_TAX_3(List list) { l_strTaxNEW_TAX_3 = list; }
	public void setList_strTaxSTART_DATE(List list) { l_strTaxSTART_DATE = list; }
	public void setList_strTaxROUND_TYP(List list) { l_strTaxROUND_TYP = list; }
	public void setList_strTaxIN_ODR_NO(List list) { l_strTaxIN_ODR_NO = list; }
	public void setList_strTaxIN_DECIMAL_FIG(List list) { l_strTaxIN_DECIMAL_FIG = list; }
	public void setList_strTaxIN_COMPANYCD(List list) { l_strTaxIN_COMPANYCD = list; }
	public void setList_strTaxIN_CUSTCD(List list) { l_strTaxIN_CUSTCD = list; }
	public void setList_PRINT_DATE(List list) { l_PRINT_DATE = list; }
	public void setList_SHIP_INVOICE_DTL_CTL_NO(List list) { l_SHIP_INVOICE_DTL_CTL_NO = list; }
	public void setList_INSPC_ACPT_TYP(List list) { l_INSPC_ACPT_TYP = list; }

	public int setL2L_TRANSPORT_METHOD_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TRANSPORT_METHOD_name == null) {
			l_TRANSPORT_METHOD_name = new ArrayList();
		} else {
			l_TRANSPORT_METHOD_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TRANSPORT_METHOD_name.add(((KU0080010Struct) list.get(i)).getTRANSPORT_METHOD_name());
		}
		return size;
	}
	public int setL2L_TRANSPORT_METHOD_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TRANSPORT_METHOD_val == null) {
			l_TRANSPORT_METHOD_val = new ArrayList();
		} else {
			l_TRANSPORT_METHOD_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TRANSPORT_METHOD_val.add(((KU0080010Struct) list.get(i)).getTRANSPORT_METHOD_val());
		}
		return size;
	}
	public int setL2L_SCDL_SHIP_DATE_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SCDL_SHIP_DATE_TIME == null) {
			l_SCDL_SHIP_DATE_TIME = new ArrayList();
		} else {
			l_SCDL_SHIP_DATE_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SCDL_SHIP_DATE_TIME.add(((KU0080010Struct) list.get(i)).getSCDL_SHIP_DATE_TIME());
		}
		return size;
	}
	public int setL2L_strTaxIncludeAmount(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strTaxIncludeAmount == null) {
			l_strTaxIncludeAmount = new ArrayList();
		} else {
			l_strTaxIncludeAmount.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strTaxIncludeAmount.add(((KU0080010Struct) list.get(i)).getstrTaxIncludeAmount());
		}
		return size;
	}
	public int setL2L_strTaxCreditAmount(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strTaxCreditAmount == null) {
			l_strTaxCreditAmount = new ArrayList();
		} else {
			l_strTaxCreditAmount.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strTaxCreditAmount.add(((KU0080010Struct) list.get(i)).getstrTaxCreditAmount());
		}
		return size;
	}
	public int setL2L_unit_cost_typ_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_unit_cost_typ_val == null) {
			l_unit_cost_typ_val = new ArrayList();
		} else {
			l_unit_cost_typ_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_unit_cost_typ_val.add(((KU0080010Struct) list.get(i)).getunit_cost_typ_val());
		}
		return size;
	}
	public int setL2L_jump_flag(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_jump_flag == null) {
			l_jump_flag = new ArrayList();
		} else {
			l_jump_flag.clear();
		}
		for (int i = 0; i < size; i++) {
			l_jump_flag.add(((KU0080010Struct) list.get(i)).getjump_flag());
		}
		return size;
	}
	public int setL2L_strTaxIN_CUST_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strTaxIN_CUST_ITEM_CD == null) {
			l_strTaxIN_CUST_ITEM_CD = new ArrayList();
		} else {
			l_strTaxIN_CUST_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strTaxIN_CUST_ITEM_CD.add(((KU0080010Struct) list.get(i)).getstrTaxIN_CUST_ITEM_CD());
		}
		return size;
	}
	public int setL2L_SHIP_INVOICE_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SHIP_INVOICE_NO == null) {
			l_SHIP_INVOICE_NO = new ArrayList();
		} else {
			l_SHIP_INVOICE_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SHIP_INVOICE_NO.add(((KU0080010Struct) list.get(i)).getSHIP_INVOICE_NO());
		}
		return size;
	}
	public int setL2L_DEPARTURE_PLACE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEPARTURE_PLACE == null) {
			l_DEPARTURE_PLACE = new ArrayList();
		} else {
			l_DEPARTURE_PLACE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEPARTURE_PLACE.add(((KU0080010Struct) list.get(i)).getDEPARTURE_PLACE());
		}
		return size;
	}
	public int setL2L_DEPARTURE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEPARTURE_DATE == null) {
			l_DEPARTURE_DATE = new ArrayList();
		} else {
			l_DEPARTURE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEPARTURE_DATE.add(((KU0080010Struct) list.get(i)).getDEPARTURE_DATE());
		}
		return size;
	}
	public int setL2L_ARRIVAL_PLACE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ARRIVAL_PLACE == null) {
			l_ARRIVAL_PLACE = new ArrayList();
		} else {
			l_ARRIVAL_PLACE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ARRIVAL_PLACE.add(((KU0080010Struct) list.get(i)).getARRIVAL_PLACE());
		}
		return size;
	}
	public int setL2L_ARRIVAL_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ARRIVAL_DATE == null) {
			l_ARRIVAL_DATE = new ArrayList();
		} else {
			l_ARRIVAL_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ARRIVAL_DATE.add(((KU0080010Struct) list.get(i)).getARRIVAL_DATE());
		}
		return size;
	}
	public int setL2L_TRANSPORT_METHOD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TRANSPORT_METHOD == null) {
			l_TRANSPORT_METHOD = new ArrayList();
		} else {
			l_TRANSPORT_METHOD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TRANSPORT_METHOD.add(((KU0080010Struct) list.get(i)).getTRANSPORT_METHOD());
		}
		return size;
	}
	public int setL2L_SHIP_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SHIP_NO == null) {
			l_SHIP_NO = new ArrayList();
		} else {
			l_SHIP_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SHIP_NO.add(((KU0080010Struct) list.get(i)).getSHIP_NO());
		}
		return size;
	}
	public int setL2L_REMARKS_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_REMARKS_1 == null) {
			l_REMARKS_1 = new ArrayList();
		} else {
			l_REMARKS_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_REMARKS_1.add(((KU0080010Struct) list.get(i)).getREMARKS_1());
		}
		return size;
	}
	public int setL2L_REMARKS_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_REMARKS_2 == null) {
			l_REMARKS_2 = new ArrayList();
		} else {
			l_REMARKS_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_REMARKS_2.add(((KU0080010Struct) list.get(i)).getREMARKS_2());
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
			l_CUST_CD.add(((KU0080010Struct) list.get(i)).getCUST_CD());
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
			l_DLV_LOC_CD.add(((KU0080010Struct) list.get(i)).getDLV_LOC_CD());
		}
		return size;
	}
	public int setL2L_INVOICE_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INVOICE_AMOUNT == null) {
			l_INVOICE_AMOUNT = new ArrayList();
		} else {
			l_INVOICE_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INVOICE_AMOUNT.add(((KU0080010Struct) list.get(i)).getINVOICE_AMOUNT());
		}
		return size;
	}
	public int setL2L_INVOICE_TAX_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INVOICE_TAX_AMOUNT == null) {
			l_INVOICE_TAX_AMOUNT = new ArrayList();
		} else {
			l_INVOICE_TAX_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INVOICE_TAX_AMOUNT.add(((KU0080010Struct) list.get(i)).getINVOICE_TAX_AMOUNT());
		}
		return size;
	}
	public int setL2L_PRINT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRINT_FLG == null) {
			l_PRINT_FLG = new ArrayList();
		} else {
			l_PRINT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRINT_FLG.add(((KU0080010Struct) list.get(i)).getPRINT_FLG());
		}
		return size;
	}
	public int setL2L_SCDL_SHIP_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SCDL_SHIP_DATE == null) {
			l_SCDL_SHIP_DATE = new ArrayList();
		} else {
			l_SCDL_SHIP_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SCDL_SHIP_DATE.add(((KU0080010Struct) list.get(i)).getSCDL_SHIP_DATE());
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
			l_MODIFY_COUNT.add(((KU0080010Struct) list.get(i)).getMODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_IN_SHIP_INVOICE_CTL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_SHIP_INVOICE_CTL_NO == null) {
			l_IN_SHIP_INVOICE_CTL_NO = new ArrayList();
		} else {
			l_IN_SHIP_INVOICE_CTL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_SHIP_INVOICE_CTL_NO.add(((KU0080010Struct) list.get(i)).getIN_SHIP_INVOICE_CTL_NO());
		}
		return size;
	}
	public int setL2L_SLIP_DETAIL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SLIP_DETAIL_NO == null) {
			l_SLIP_DETAIL_NO = new ArrayList();
		} else {
			l_SLIP_DETAIL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SLIP_DETAIL_NO.add(((KU0080010Struct) list.get(i)).getSLIP_DETAIL_NO());
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
			l_CUST_ITEM_CD.add(((KU0080010Struct) list.get(i)).getCUST_ITEM_CD());
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
			l_CUST_ODR_NO.add(((KU0080010Struct) list.get(i)).getCUST_ODR_NO());
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
			l_ODR_NO.add(((KU0080010Struct) list.get(i)).getODR_NO());
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
			l_ITEM_CD.add(((KU0080010Struct) list.get(i)).getITEM_CD());
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
			l_SHIP_ODR_NO.add(((KU0080010Struct) list.get(i)).getSHIP_ODR_NO());
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
			l_SHIP_QTY.add(((KU0080010Struct) list.get(i)).getSHIP_QTY());
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
			l_UNIT_PRICE.add(((KU0080010Struct) list.get(i)).getUNIT_PRICE());
		}
		return size;
	}
	public int setL2L_SHIP_ODR_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SHIP_ODR_AMOUNT == null) {
			l_SHIP_ODR_AMOUNT = new ArrayList();
		} else {
			l_SHIP_ODR_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SHIP_ODR_AMOUNT.add(((KU0080010Struct) list.get(i)).getSHIP_ODR_AMOUNT());
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
			l_UNIT_COST_TYP.add(((KU0080010Struct) list.get(i)).getUNIT_COST_TYP());
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
			l_TAX_AMOUNT.add(((KU0080010Struct) list.get(i)).getTAX_AMOUNT());
		}
		return size;
	}
	public int setL2L_TAX_RATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_RATE == null) {
			l_TAX_RATE = new ArrayList();
		} else {
			l_TAX_RATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_RATE.add(((KU0080010Struct) list.get(i)).getTAX_RATE());
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
			l_CUST_ITEM_NAME.add(((KU0080010Struct) list.get(i)).getCUST_ITEM_NAME());
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
			l_PART_DLV_SEQ_NO.add(((KU0080010Struct) list.get(i)).getPART_DLV_SEQ_NO());
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
			l_ITEM_NAME.add(((KU0080010Struct) list.get(i)).getITEM_NAME());
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
			l_strCOMPANY_CD.add(((KU0080010Struct) list.get(i)).getstrCOMPANY_CD());
		}
		return size;
	}
	public int setL2L_SCDL_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SCDL_DLV_DATE == null) {
			l_SCDL_DLV_DATE = new ArrayList();
		} else {
			l_SCDL_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SCDL_DLV_DATE.add(((KU0080010Struct) list.get(i)).getSCDL_DLV_DATE());
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
			l_strTaxTAX_KBN.add(((KU0080010Struct) list.get(i)).getstrTaxTAX_KBN());
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
			l_strTaxOLD_TAX_1.add(((KU0080010Struct) list.get(i)).getstrTaxOLD_TAX_1());
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
			l_strTaxOLD_TAX_2.add(((KU0080010Struct) list.get(i)).getstrTaxOLD_TAX_2());
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
			l_strTaxOLD_TAX_3.add(((KU0080010Struct) list.get(i)).getstrTaxOLD_TAX_3());
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
			l_strTaxNEW_TAX_1.add(((KU0080010Struct) list.get(i)).getstrTaxNEW_TAX_1());
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
			l_strTaxNEW_TAX_2.add(((KU0080010Struct) list.get(i)).getstrTaxNEW_TAX_2());
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
			l_strTaxNEW_TAX_3.add(((KU0080010Struct) list.get(i)).getstrTaxNEW_TAX_3());
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
			l_strTaxSTART_DATE.add(((KU0080010Struct) list.get(i)).getstrTaxSTART_DATE());
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
			l_strTaxROUND_TYP.add(((KU0080010Struct) list.get(i)).getstrTaxROUND_TYP());
		}
		return size;
	}
	public int setL2L_strTaxIN_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strTaxIN_ODR_NO == null) {
			l_strTaxIN_ODR_NO = new ArrayList();
		} else {
			l_strTaxIN_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strTaxIN_ODR_NO.add(((KU0080010Struct) list.get(i)).getstrTaxIN_ODR_NO());
		}
		return size;
	}
	public int setL2L_strTaxIN_DECIMAL_FIG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strTaxIN_DECIMAL_FIG == null) {
			l_strTaxIN_DECIMAL_FIG = new ArrayList();
		} else {
			l_strTaxIN_DECIMAL_FIG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strTaxIN_DECIMAL_FIG.add(((KU0080010Struct) list.get(i)).getstrTaxIN_DECIMAL_FIG());
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
			l_strTaxIN_COMPANYCD.add(((KU0080010Struct) list.get(i)).getstrTaxIN_COMPANYCD());
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
			l_strTaxIN_CUSTCD.add(((KU0080010Struct) list.get(i)).getstrTaxIN_CUSTCD());
		}
		return size;
	}
	public int setL2L_PRINT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRINT_DATE == null) {
			l_PRINT_DATE = new ArrayList();
		} else {
			l_PRINT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRINT_DATE.add(((KU0080010Struct) list.get(i)).getPRINT_DATE());
		}
		return size;
	}
	public int setL2L_SHIP_INVOICE_DTL_CTL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SHIP_INVOICE_DTL_CTL_NO == null) {
			l_SHIP_INVOICE_DTL_CTL_NO = new ArrayList();
		} else {
			l_SHIP_INVOICE_DTL_CTL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SHIP_INVOICE_DTL_CTL_NO.add(((KU0080010Struct) list.get(i)).getSHIP_INVOICE_DTL_CTL_NO());
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
			l_INSPC_ACPT_TYP.add(((KU0080010Struct) list.get(i)).getINSPC_ACPT_TYP());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_TRANSPORT_METHOD_name = null;
		m_TRANSPORT_METHOD_val = null;
		m_SCDL_SHIP_DATE_TIME = null;
		m_strTaxIncludeAmount = null;
		m_strTaxCreditAmount = null;
		m_unit_cost_typ_val = null;
		m_jump_flag = null;
		m_strTaxIN_CUST_ITEM_CD = null;
		m_SHIP_INVOICE_NO = null;
		m_DEPARTURE_PLACE = null;
		m_DEPARTURE_DATE = null;
		m_ARRIVAL_PLACE = null;
		m_ARRIVAL_DATE = null;
		m_TRANSPORT_METHOD = null;
		m_SHIP_NO = null;
		m_REMARKS_1 = null;
		m_REMARKS_2 = null;
		m_CUST_CD = null;
		m_DLV_LOC_CD = null;
		m_INVOICE_AMOUNT = null;
		m_INVOICE_TAX_AMOUNT = null;
		m_PRINT_FLG = null;
		m_SCDL_SHIP_DATE = null;
		m_MODIFY_COUNT = null;
		m_IN_SHIP_INVOICE_CTL_NO = null;
		m_SLIP_DETAIL_NO = null;
		m_CUST_ITEM_CD = null;
		m_CUST_ODR_NO = null;
		m_ODR_NO = null;
		m_ITEM_CD = null;
		m_SHIP_ODR_NO = null;
		m_SHIP_QTY = null;
		m_UNIT_PRICE = null;
		m_SHIP_ODR_AMOUNT = null;
		m_UNIT_COST_TYP = null;
		m_TAX_AMOUNT = null;
		m_TAX_RATE = null;
		m_CUST_ITEM_NAME = null;
		m_PART_DLV_SEQ_NO = null;
		m_ITEM_NAME = null;
		m_strCOMPANY_CD = null;
		m_SCDL_DLV_DATE = null;
		m_strTaxTAX_KBN = null;
		m_strTaxOLD_TAX_1 = null;
		m_strTaxOLD_TAX_2 = null;
		m_strTaxOLD_TAX_3 = null;
		m_strTaxNEW_TAX_1 = null;
		m_strTaxNEW_TAX_2 = null;
		m_strTaxNEW_TAX_3 = null;
		m_strTaxSTART_DATE = null;
		m_strTaxROUND_TYP = null;
		m_strTaxIN_ODR_NO = null;
		m_strTaxIN_DECIMAL_FIG = null;
		m_strTaxIN_COMPANYCD = null;
		m_strTaxIN_CUSTCD = null;
		m_PRINT_DATE = null;
		m_SHIP_INVOICE_DTL_CTL_NO = null;
		m_INSPC_ACPT_TYP = null;

		l_TRANSPORT_METHOD_name = null;
		l_TRANSPORT_METHOD_val = null;
		l_SCDL_SHIP_DATE_TIME = null;
		l_strTaxIncludeAmount = null;
		l_strTaxCreditAmount = null;
		l_unit_cost_typ_val = null;
		l_jump_flag = null;
		l_strTaxIN_CUST_ITEM_CD = null;
		l_SHIP_INVOICE_NO = null;
		l_DEPARTURE_PLACE = null;
		l_DEPARTURE_DATE = null;
		l_ARRIVAL_PLACE = null;
		l_ARRIVAL_DATE = null;
		l_TRANSPORT_METHOD = null;
		l_SHIP_NO = null;
		l_REMARKS_1 = null;
		l_REMARKS_2 = null;
		l_CUST_CD = null;
		l_DLV_LOC_CD = null;
		l_INVOICE_AMOUNT = null;
		l_INVOICE_TAX_AMOUNT = null;
		l_PRINT_FLG = null;
		l_SCDL_SHIP_DATE = null;
		l_MODIFY_COUNT = null;
		l_IN_SHIP_INVOICE_CTL_NO = null;
		l_SLIP_DETAIL_NO = null;
		l_CUST_ITEM_CD = null;
		l_CUST_ODR_NO = null;
		l_ODR_NO = null;
		l_ITEM_CD = null;
		l_SHIP_ODR_NO = null;
		l_SHIP_QTY = null;
		l_UNIT_PRICE = null;
		l_SHIP_ODR_AMOUNT = null;
		l_UNIT_COST_TYP = null;
		l_TAX_AMOUNT = null;
		l_TAX_RATE = null;
		l_CUST_ITEM_NAME = null;
		l_PART_DLV_SEQ_NO = null;
		l_ITEM_NAME = null;
		l_strCOMPANY_CD = null;
		l_SCDL_DLV_DATE = null;
		l_strTaxTAX_KBN = null;
		l_strTaxOLD_TAX_1 = null;
		l_strTaxOLD_TAX_2 = null;
		l_strTaxOLD_TAX_3 = null;
		l_strTaxNEW_TAX_1 = null;
		l_strTaxNEW_TAX_2 = null;
		l_strTaxNEW_TAX_3 = null;
		l_strTaxSTART_DATE = null;
		l_strTaxROUND_TYP = null;
		l_strTaxIN_ODR_NO = null;
		l_strTaxIN_DECIMAL_FIG = null;
		l_strTaxIN_COMPANYCD = null;
		l_strTaxIN_CUSTCD = null;
		l_PRINT_DATE = null;
		l_SHIP_INVOICE_DTL_CTL_NO = null;
		l_INSPC_ACPT_TYP = null;

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
	 * medKU0080010クラスの標準コンストラクタ
	 */
	public KU0080010Struct()
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
	public void setStruct(KU0080010Struct struct)
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
	public void setStructM(KU0080010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setTRANSPORT_METHOD_name(struct.getTRANSPORT_METHOD_name());
			this.setTRANSPORT_METHOD_val(struct.getTRANSPORT_METHOD_val());
			this.setSCDL_SHIP_DATE_TIME(struct.getSCDL_SHIP_DATE_TIME());
			this.setstrTaxIncludeAmount(struct.getstrTaxIncludeAmount());
			this.setstrTaxCreditAmount(struct.getstrTaxCreditAmount());
			this.setunit_cost_typ_val(struct.getunit_cost_typ_val());
			this.setjump_flag(struct.getjump_flag());
			this.setstrTaxIN_CUST_ITEM_CD(struct.getstrTaxIN_CUST_ITEM_CD());
			this.setSHIP_INVOICE_NO(struct.getSHIP_INVOICE_NO());
			this.setDEPARTURE_PLACE(struct.getDEPARTURE_PLACE());
			this.setDEPARTURE_DATE(struct.getDEPARTURE_DATE());
			this.setARRIVAL_PLACE(struct.getARRIVAL_PLACE());
			this.setARRIVAL_DATE(struct.getARRIVAL_DATE());
			this.setTRANSPORT_METHOD(struct.getTRANSPORT_METHOD());
			this.setSHIP_NO(struct.getSHIP_NO());
			this.setREMARKS_1(struct.getREMARKS_1());
			this.setREMARKS_2(struct.getREMARKS_2());
			this.setCUST_CD(struct.getCUST_CD());
			this.setDLV_LOC_CD(struct.getDLV_LOC_CD());
			this.setINVOICE_AMOUNT(struct.getINVOICE_AMOUNT());
			this.setINVOICE_TAX_AMOUNT(struct.getINVOICE_TAX_AMOUNT());
			this.setPRINT_FLG(struct.getPRINT_FLG());
			this.setSCDL_SHIP_DATE(struct.getSCDL_SHIP_DATE());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setIN_SHIP_INVOICE_CTL_NO(struct.getIN_SHIP_INVOICE_CTL_NO());
			this.setSLIP_DETAIL_NO(struct.getSLIP_DETAIL_NO());
			this.setCUST_ITEM_CD(struct.getCUST_ITEM_CD());
			this.setCUST_ODR_NO(struct.getCUST_ODR_NO());
			this.setODR_NO(struct.getODR_NO());
			this.setITEM_CD(struct.getITEM_CD());
			this.setSHIP_ODR_NO(struct.getSHIP_ODR_NO());
			this.setSHIP_QTY(struct.getSHIP_QTY());
			this.setUNIT_PRICE(struct.getUNIT_PRICE());
			this.setSHIP_ODR_AMOUNT(struct.getSHIP_ODR_AMOUNT());
			this.setUNIT_COST_TYP(struct.getUNIT_COST_TYP());
			this.setTAX_AMOUNT(struct.getTAX_AMOUNT());
			this.setTAX_RATE(struct.getTAX_RATE());
			this.setCUST_ITEM_NAME(struct.getCUST_ITEM_NAME());
			this.setPART_DLV_SEQ_NO(struct.getPART_DLV_SEQ_NO());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setstrCOMPANY_CD(struct.getstrCOMPANY_CD());
			this.setSCDL_DLV_DATE(struct.getSCDL_DLV_DATE());
			this.setstrTaxTAX_KBN(struct.getstrTaxTAX_KBN());
			this.setstrTaxOLD_TAX_1(struct.getstrTaxOLD_TAX_1());
			this.setstrTaxOLD_TAX_2(struct.getstrTaxOLD_TAX_2());
			this.setstrTaxOLD_TAX_3(struct.getstrTaxOLD_TAX_3());
			this.setstrTaxNEW_TAX_1(struct.getstrTaxNEW_TAX_1());
			this.setstrTaxNEW_TAX_2(struct.getstrTaxNEW_TAX_2());
			this.setstrTaxNEW_TAX_3(struct.getstrTaxNEW_TAX_3());
			this.setstrTaxSTART_DATE(struct.getstrTaxSTART_DATE());
			this.setstrTaxROUND_TYP(struct.getstrTaxROUND_TYP());
			this.setstrTaxIN_ODR_NO(struct.getstrTaxIN_ODR_NO());
			this.setstrTaxIN_DECIMAL_FIG(struct.getstrTaxIN_DECIMAL_FIG());
			this.setstrTaxIN_COMPANYCD(struct.getstrTaxIN_COMPANYCD());
			this.setstrTaxIN_CUSTCD(struct.getstrTaxIN_CUSTCD());
			this.setPRINT_DATE(struct.getPRINT_DATE());
			this.setSHIP_INVOICE_DTL_CTL_NO(struct.getSHIP_INVOICE_DTL_CTL_NO());
			this.setINSPC_ACPT_TYP(struct.getINSPC_ACPT_TYP());
		}
	}

	/**
	 * データのセット(リストメンバのみ)
	 *
	 * @param struct セットする元のStruct
	 */
	public void setStructL(KU0080010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_TRANSPORT_METHOD_name(struct.getList_TRANSPORT_METHOD_name());
			this.setList_TRANSPORT_METHOD_val(struct.getList_TRANSPORT_METHOD_val());
			this.setList_SCDL_SHIP_DATE_TIME(struct.getList_SCDL_SHIP_DATE_TIME());
			this.setList_strTaxIncludeAmount(struct.getList_strTaxIncludeAmount());
			this.setList_strTaxCreditAmount(struct.getList_strTaxCreditAmount());
			this.setList_unit_cost_typ_val(struct.getList_unit_cost_typ_val());
			this.setList_jump_flag(struct.getList_jump_flag());
			this.setList_strTaxIN_CUST_ITEM_CD(struct.getList_strTaxIN_CUST_ITEM_CD());
			this.setList_SHIP_INVOICE_NO(struct.getList_SHIP_INVOICE_NO());
			this.setList_DEPARTURE_PLACE(struct.getList_DEPARTURE_PLACE());
			this.setList_DEPARTURE_DATE(struct.getList_DEPARTURE_DATE());
			this.setList_ARRIVAL_PLACE(struct.getList_ARRIVAL_PLACE());
			this.setList_ARRIVAL_DATE(struct.getList_ARRIVAL_DATE());
			this.setList_TRANSPORT_METHOD(struct.getList_TRANSPORT_METHOD());
			this.setList_SHIP_NO(struct.getList_SHIP_NO());
			this.setList_REMARKS_1(struct.getList_REMARKS_1());
			this.setList_REMARKS_2(struct.getList_REMARKS_2());
			this.setList_CUST_CD(struct.getList_CUST_CD());
			this.setList_DLV_LOC_CD(struct.getList_DLV_LOC_CD());
			this.setList_INVOICE_AMOUNT(struct.getList_INVOICE_AMOUNT());
			this.setList_INVOICE_TAX_AMOUNT(struct.getList_INVOICE_TAX_AMOUNT());
			this.setList_PRINT_FLG(struct.getList_PRINT_FLG());
			this.setList_SCDL_SHIP_DATE(struct.getList_SCDL_SHIP_DATE());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_IN_SHIP_INVOICE_CTL_NO(struct.getList_IN_SHIP_INVOICE_CTL_NO());
			this.setList_SLIP_DETAIL_NO(struct.getList_SLIP_DETAIL_NO());
			this.setList_CUST_ITEM_CD(struct.getList_CUST_ITEM_CD());
			this.setList_CUST_ODR_NO(struct.getList_CUST_ODR_NO());
			this.setList_ODR_NO(struct.getList_ODR_NO());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_SHIP_ODR_NO(struct.getList_SHIP_ODR_NO());
			this.setList_SHIP_QTY(struct.getList_SHIP_QTY());
			this.setList_UNIT_PRICE(struct.getList_UNIT_PRICE());
			this.setList_SHIP_ODR_AMOUNT(struct.getList_SHIP_ODR_AMOUNT());
			this.setList_UNIT_COST_TYP(struct.getList_UNIT_COST_TYP());
			this.setList_TAX_AMOUNT(struct.getList_TAX_AMOUNT());
			this.setList_TAX_RATE(struct.getList_TAX_RATE());
			this.setList_CUST_ITEM_NAME(struct.getList_CUST_ITEM_NAME());
			this.setList_PART_DLV_SEQ_NO(struct.getList_PART_DLV_SEQ_NO());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_strCOMPANY_CD(struct.getList_strCOMPANY_CD());
			this.setList_SCDL_DLV_DATE(struct.getList_SCDL_DLV_DATE());
			this.setList_strTaxTAX_KBN(struct.getList_strTaxTAX_KBN());
			this.setList_strTaxOLD_TAX_1(struct.getList_strTaxOLD_TAX_1());
			this.setList_strTaxOLD_TAX_2(struct.getList_strTaxOLD_TAX_2());
			this.setList_strTaxOLD_TAX_3(struct.getList_strTaxOLD_TAX_3());
			this.setList_strTaxNEW_TAX_1(struct.getList_strTaxNEW_TAX_1());
			this.setList_strTaxNEW_TAX_2(struct.getList_strTaxNEW_TAX_2());
			this.setList_strTaxNEW_TAX_3(struct.getList_strTaxNEW_TAX_3());
			this.setList_strTaxSTART_DATE(struct.getList_strTaxSTART_DATE());
			this.setList_strTaxROUND_TYP(struct.getList_strTaxROUND_TYP());
			this.setList_strTaxIN_ODR_NO(struct.getList_strTaxIN_ODR_NO());
			this.setList_strTaxIN_DECIMAL_FIG(struct.getList_strTaxIN_DECIMAL_FIG());
			this.setList_strTaxIN_COMPANYCD(struct.getList_strTaxIN_COMPANYCD());
			this.setList_strTaxIN_CUSTCD(struct.getList_strTaxIN_CUSTCD());
			this.setList_PRINT_DATE(struct.getList_PRINT_DATE());
			this.setList_SHIP_INVOICE_DTL_CTL_NO(struct.getList_SHIP_INVOICE_DTL_CTL_NO());
			this.setList_INSPC_ACPT_TYP(struct.getList_INSPC_ACPT_TYP());
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
	// 第 1 変数初期値： i_TRANSPORT_METHOD_name


	final static String i_TRANSPORT_METHOD_name = null;

	// 第 2 変数初期値： i_TRANSPORT_METHOD_val


	final static String i_TRANSPORT_METHOD_val = null;

	// 第 3 変数初期値： i_SCDL_SHIP_DATE_TIME


	final static String i_SCDL_SHIP_DATE_TIME = null;

	// 第 4 変数初期値： i_strTaxIncludeAmount


	final static String i_strTaxIncludeAmount = null;

	// 第 5 変数初期値： i_strTaxCreditAmount


	final static String i_strTaxCreditAmount = null;

	// 第 6 変数初期値： i_unit_cost_typ_val


	final static String i_unit_cost_typ_val = null;

	// 第 7 変数初期値： i_jump_flag


	final static String i_jump_flag = null;

	// 第 8 変数初期値： i_strTaxIN_CUST_ITEM_CD


	final static String i_strTaxIN_CUST_ITEM_CD = null;

	// 第 9 変数初期値： i_SHIP_INVOICE_NO


	final static String i_SHIP_INVOICE_NO = null;

	// 第 10 変数初期値： i_DEPARTURE_PLACE


	final static String i_DEPARTURE_PLACE = null;

	// 第 11 変数初期値： i_DEPARTURE_DATE


	final static String i_DEPARTURE_DATE = null;

	// 第 12 変数初期値： i_ARRIVAL_PLACE


	final static String i_ARRIVAL_PLACE = null;

	// 第 13 変数初期値： i_ARRIVAL_DATE


	final static String i_ARRIVAL_DATE = null;

	// 第 14 変数初期値： i_TRANSPORT_METHOD


	final static String i_TRANSPORT_METHOD = null;

	// 第 15 変数初期値： i_SHIP_NO


	final static String i_SHIP_NO = null;

	// 第 16 変数初期値： i_REMARKS_1


	final static String i_REMARKS_1 = null;

	// 第 17 変数初期値： i_REMARKS_2


	final static String i_REMARKS_2 = null;

	// 第 18 変数初期値： i_CUST_CD


	final static String i_CUST_CD = null;

	// 第 19 変数初期値： i_DLV_LOC_CD


	final static String i_DLV_LOC_CD = null;

	// 第 20 変数初期値： i_INVOICE_AMOUNT


	final static String i_INVOICE_AMOUNT = null;

	// 第 21 変数初期値： i_INVOICE_TAX_AMOUNT


	final static String i_INVOICE_TAX_AMOUNT = null;

	// 第 22 変数初期値： i_PRINT_FLG


	final static String i_PRINT_FLG = null;

	// 第 23 変数初期値： i_SCDL_SHIP_DATE


	final static String i_SCDL_SHIP_DATE = null;

	// 第 24 変数初期値： i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// 第 25 変数初期値： i_IN_SHIP_INVOICE_CTL_NO


	final static String i_IN_SHIP_INVOICE_CTL_NO = null;

	// 第 26 変数初期値： i_SLIP_DETAIL_NO


	final static String i_SLIP_DETAIL_NO = null;

	// 第 27 変数初期値： i_CUST_ITEM_CD


	final static String i_CUST_ITEM_CD = null;

	// 第 28 変数初期値： i_CUST_ODR_NO


	final static String i_CUST_ODR_NO = null;

	// 第 29 変数初期値： i_ODR_NO


	final static String i_ODR_NO = null;

	// 第 30 変数初期値： i_ITEM_CD


	final static String i_ITEM_CD = null;

	// 第 31 変数初期値： i_SHIP_ODR_NO


	final static String i_SHIP_ODR_NO = null;

	// 第 32 変数初期値： i_SHIP_QTY


	final static String i_SHIP_QTY = null;

	// 第 33 変数初期値： i_UNIT_PRICE


	final static String i_UNIT_PRICE = null;

	// 第 34 変数初期値： i_SHIP_ODR_AMOUNT


	final static String i_SHIP_ODR_AMOUNT = null;

	// 第 35 変数初期値： i_UNIT_COST_TYP


	final static String i_UNIT_COST_TYP = null;

	// 第 36 変数初期値： i_TAX_AMOUNT


	final static String i_TAX_AMOUNT = null;

	// 第 37 変数初期値： i_TAX_RATE


	final static String i_TAX_RATE = null;

	// 第 38 変数初期値： i_CUST_ITEM_NAME


	final static String i_CUST_ITEM_NAME = null;

	// 第 39 変数初期値： i_PART_DLV_SEQ_NO


	final static String i_PART_DLV_SEQ_NO = null;

	// 第 40 変数初期値： i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// 第 41 変数初期値： i_strCOMPANY_CD


	final static String i_strCOMPANY_CD = null;

	// 第 42 変数初期値： i_SCDL_DLV_DATE


	final static String i_SCDL_DLV_DATE = null;

	// 第 43 変数初期値： i_strTaxTAX_KBN


	final static String i_strTaxTAX_KBN = null;

	// 第 44 変数初期値： i_strTaxOLD_TAX_1


	final static String i_strTaxOLD_TAX_1 = null;

	// 第 45 変数初期値： i_strTaxOLD_TAX_2


	final static String i_strTaxOLD_TAX_2 = null;

	// 第 46 変数初期値： i_strTaxOLD_TAX_3


	final static String i_strTaxOLD_TAX_3 = null;

	// 第 47 変数初期値： i_strTaxNEW_TAX_1


	final static String i_strTaxNEW_TAX_1 = null;

	// 第 48 変数初期値： i_strTaxNEW_TAX_2


	final static String i_strTaxNEW_TAX_2 = null;

	// 第 49 変数初期値： i_strTaxNEW_TAX_3


	final static String i_strTaxNEW_TAX_3 = null;

	// 第 50 変数初期値： i_strTaxSTART_DATE


	final static String i_strTaxSTART_DATE = null;

	// 第 51 変数初期値： i_strTaxROUND_TYP


	final static String i_strTaxROUND_TYP = null;

	// 第 52 変数初期値： i_strTaxIN_ODR_NO


	final static String i_strTaxIN_ODR_NO = null;

	// 第 53 変数初期値： i_strTaxIN_DECIMAL_FIG


	final static String i_strTaxIN_DECIMAL_FIG = null;

	// 第 54 変数初期値： i_strTaxIN_COMPANYCD


	final static String i_strTaxIN_COMPANYCD = null;

	// 第 55 変数初期値： i_strTaxIN_CUSTCD


	final static String i_strTaxIN_CUSTCD = null;

	// 第 56 変数初期値： i_PRINT_DATE


	final static String i_PRINT_DATE = null;

	// 第 57 変数初期値： i_SHIP_INVOICE_DTL_CTL_NO


	final static String i_SHIP_INVOICE_DTL_CTL_NO = null;

	// 第 58 変数初期値： i_INSPC_ACPT_TYP


	final static String i_INSPC_ACPT_TYP = null;

*/

	//{{user_implement_code
		// TODO: 初期化で使う定数は、ここに記述してください。
		// 以下に記述した内容は自動的には変更されません。
	// 第 1 変数初期値： i_TRANSPORT_METHOD_name

	final static String i_TRANSPORT_METHOD_name = null;

	// 第 2 変数初期値： i_TRANSPORT_METHOD_val

	final static String i_TRANSPORT_METHOD_val = null;

	// 第 3 変数初期値： i_strTaxIncludeAmount

	final static String i_strTaxIncludeAmount = null;

	// 第 4 変数初期値： i_strTaxCreditAmount

	final static String i_strTaxCreditAmount = null;

	// 第 5 変数初期値： i_unit_cost_typ_val

	final static String i_unit_cost_typ_val = null;

	// 第 6 変数初期値： i_jump_flag

	final static String i_jump_flag = null;

	// 第 7 変数初期値： i_SHIP_INVOICE_NO

	final static String i_SHIP_INVOICE_NO = null;

	// 第 8 変数初期値： i_DEPARTURE_PLACE

	final static String i_DEPARTURE_PLACE = null;

	// 第 9 変数初期値： i_DEPARTURE_DATE

	final static String i_DEPARTURE_DATE = null;

	// 第 10 変数初期値： i_ARRIVAL_PLACE

	final static String i_ARRIVAL_PLACE = null;

	// 第 11 変数初期値： i_ARRIVAL_DATE

	final static String i_ARRIVAL_DATE = null;

	// 第 12 変数初期値： i_TRANSPORT_METHOD

	final static String i_TRANSPORT_METHOD = null;

	// 第 13 変数初期値： i_SHIP_NO

	final static String i_SHIP_NO = null;

	// 第 14 変数初期値： i_REMARKS_1

	final static String i_REMARKS_1 = null;

	// 第 15 変数初期値： i_REMARKS_2

	final static String i_REMARKS_2 = null;

	// 第 16 変数初期値： i_CUST_CD

	final static String i_CUST_CD = null;

	// 第 17 変数初期値： i_DLV_LOC_CD

	final static String i_DLV_LOC_CD = null;

	// 第 18 変数初期値： i_INVOICE_AMOUNT

	final static String i_INVOICE_AMOUNT = null;

	// 第 19 変数初期値： i_INVOICE_TAX_AMOUNT

	final static String i_INVOICE_TAX_AMOUNT = null;

	// 第 20 変数初期値： i_PRINT_FLG

	final static String i_PRINT_FLG = null;

	// 第 21 変数初期値： i_SCDL_SHIP_DATE

	final static String i_SCDL_SHIP_DATE = null;

	// 第 22 変数初期値： i_MODIFY_COUNT

	final static String i_MODIFY_COUNT = null;

	// 第 23 変数初期値： i_IN_SHIP_INVOICE_CTL_NO

	final static String i_IN_SHIP_INVOICE_CTL_NO = null;

	// 第 24 変数初期値： i_SLIP_DETAIL_NO

	final static String i_SLIP_DETAIL_NO = null;

	// 第 25 変数初期値： i_CUST_ITEM_CD

	final static String i_CUST_ITEM_CD = null;

	// 第 26 変数初期値： i_CUST_ODR_NO

	final static String i_CUST_ODR_NO = null;

	// 第 27 変数初期値： i_ODR_NO

	final static String i_ODR_NO = null;

	// 第 28 変数初期値： i_ITEM_CD

	final static String i_ITEM_CD = null;

	// 第 29 変数初期値： i_SHIP_ODR_NO

	final static String i_SHIP_ODR_NO = null;

	// 第 30 変数初期値： i_SHIP_QTY

	final static String i_SHIP_QTY = null;

	// 第 31 変数初期値： i_UNIT_PRICE

	final static String i_UNIT_PRICE = null;

	// 第 32 変数初期値： i_SHIP_ODR_AMOUNT

	final static String i_SHIP_ODR_AMOUNT = null;

	// 第 33 変数初期値： i_UNIT_COST_TYP

	final static String i_UNIT_COST_TYP = null;

	// 第 34 変数初期値： i_TAX_AMOUNT

	final static String i_TAX_AMOUNT = null;

	// 第 35 変数初期値： i_TAX_RATE

	final static String i_TAX_RATE = null;

	// 第 36 変数初期値： i_CUST_ITEM_NAME

	final static String i_CUST_ITEM_NAME = null;

	// 第 37 変数初期値： i_PART_DLV_SEQ_NO

	final static String i_PART_DLV_SEQ_NO = null;

	// 第 38 変数初期値： i_ITEM_NAME

	final static String i_ITEM_NAME = null;

	// 第 39 変数初期値： i_strCOMPANY_CD

	final static String i_strCOMPANY_CD = null;

	// 第 40 変数初期値： i_strTaxTAX_KBN

	final static String i_strTaxTAX_KBN = null;

	// 第 41 変数初期値： i_strTaxOLD_TAX_1

	final static String i_strTaxOLD_TAX_1 = null;

	// 第 42 変数初期値： i_strTaxOLD_TAX_2

	final static String i_strTaxOLD_TAX_2 = null;

	// 第 43 変数初期値： i_strTaxOLD_TAX_3

	final static String i_strTaxOLD_TAX_3 = null;

	// 第 44 変数初期値： i_strTaxNEW_TAX_1

	final static String i_strTaxNEW_TAX_1 = null;

	// 第 45 変数初期値： i_strTaxNEW_TAX_2

	final static String i_strTaxNEW_TAX_2 = null;

	// 第 46 変数初期値： i_strTaxNEW_TAX_3

	final static String i_strTaxNEW_TAX_3 = null;

	// 第 47 変数初期値： i_strTaxSTART_DATE

	final static String i_strTaxSTART_DATE = null;

	// 第 48 変数初期値： i_strTaxROUND_TYP

	final static String i_strTaxROUND_TYP = null;

	// 第 49 変数初期値： i_strTaxIN_COMPANYCD

	final static String i_strTaxIN_COMPANYCD = null;

	// 第 50 変数初期値： i_strTaxIN_CUSTCD

	final static String i_strTaxIN_CUSTCD = null;

	// 第 51 変数初期値： i_strTaxIN_CUST_ITEM_CD

	final static String i_strTaxIN_CUST_ITEM_CD = null;

	// 第 52 変数初期値： i_strTaxIN_DECIMAL_FIG

	final static String i_strTaxIN_DECIMAL_FIG = null;

	// 第 53 変数初期値： i_SHIP_INVOICE_DTL_CTL_NO

	final static String i_SHIP_INVOICE_DTL_CTL_NO = null;


	/**
	 * 初期化
	 *
	 */
	public void initialize()
	{

		clear();

		m_TRANSPORT_METHOD_name = i_TRANSPORT_METHOD_name;
		m_TRANSPORT_METHOD_val = i_TRANSPORT_METHOD_val;
		m_strTaxIncludeAmount = i_strTaxIncludeAmount;
		m_strTaxCreditAmount = i_strTaxCreditAmount;
		m_unit_cost_typ_val = i_unit_cost_typ_val;
		m_jump_flag = i_jump_flag;
		m_SHIP_INVOICE_NO = i_SHIP_INVOICE_NO;
		m_DEPARTURE_PLACE = i_DEPARTURE_PLACE;
		m_DEPARTURE_DATE = i_DEPARTURE_DATE;
		m_ARRIVAL_PLACE = i_ARRIVAL_PLACE;
		m_ARRIVAL_DATE = i_ARRIVAL_DATE;
		m_TRANSPORT_METHOD = i_TRANSPORT_METHOD;
		m_SHIP_NO = i_SHIP_NO;
		m_REMARKS_1 = i_REMARKS_1;
		m_REMARKS_2 = i_REMARKS_2;
		m_CUST_CD = i_CUST_CD;
		m_DLV_LOC_CD = i_DLV_LOC_CD;
		m_INVOICE_AMOUNT = i_INVOICE_AMOUNT;
		m_INVOICE_TAX_AMOUNT = i_INVOICE_TAX_AMOUNT;
		m_PRINT_FLG = i_PRINT_FLG;
		m_SCDL_SHIP_DATE = i_SCDL_SHIP_DATE;
		m_MODIFY_COUNT = i_MODIFY_COUNT;
		m_IN_SHIP_INVOICE_CTL_NO = i_IN_SHIP_INVOICE_CTL_NO;
		m_SLIP_DETAIL_NO = i_SLIP_DETAIL_NO;
		m_CUST_ITEM_CD = i_CUST_ITEM_CD;
		m_CUST_ODR_NO = i_CUST_ODR_NO;
		m_ODR_NO = i_ODR_NO;
		m_ITEM_CD = i_ITEM_CD;
		m_SHIP_ODR_NO = i_SHIP_ODR_NO;
		m_SHIP_QTY = i_SHIP_QTY;
		m_UNIT_PRICE = i_UNIT_PRICE;
		m_SHIP_ODR_AMOUNT = i_SHIP_ODR_AMOUNT;
		m_UNIT_COST_TYP = i_UNIT_COST_TYP;
		m_TAX_AMOUNT = i_TAX_AMOUNT;
		m_TAX_RATE = i_TAX_RATE;
		m_CUST_ITEM_NAME = i_CUST_ITEM_NAME;
		m_PART_DLV_SEQ_NO = i_PART_DLV_SEQ_NO;
		m_ITEM_NAME = i_ITEM_NAME;
		m_strCOMPANY_CD = i_strCOMPANY_CD;
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
		m_strTaxIN_CUST_ITEM_CD = i_strTaxIN_CUST_ITEM_CD;
		m_strTaxIN_DECIMAL_FIG = i_strTaxIN_DECIMAL_FIG;
		m_SHIP_INVOICE_DTL_CTL_NO = i_SHIP_INVOICE_DTL_CTL_NO;
	}
	/**
	 * ヘッダ初期化
	 *
	 */
	public void init()
	{
        m_SHIP_INVOICE_NO = null;
		m_DEPARTURE_PLACE = null;
		m_DEPARTURE_DATE = null;
		m_ARRIVAL_PLACE = null;
		m_ARRIVAL_DATE = null;
		m_TRANSPORT_METHOD = null;
		m_SHIP_NO = null;
		m_REMARKS_1 = null;
		m_REMARKS_2 = null;
		m_CUST_CD = null;
		m_DLV_LOC_CD = null;
		m_INVOICE_AMOUNT = null;
		m_INVOICE_TAX_AMOUNT = null;
		m_SCDL_SHIP_DATE = null;
	}
		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_code

	//////////////////////////////

}
