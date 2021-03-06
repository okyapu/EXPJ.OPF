/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KU0030/src/com/nec/jp/orteus/metamorBase/KU0030/KU0030010Struct.java,v $
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
 * ev[gðF
 * EXPJ    (2005/01/19),SRCGENÎ
 * EXPJ    (2004/04/05),\bhRgÌu* @param Èµvð·×Äí
 * EXPJ    (2004/04/01),setStruct\bhÌÂÊoÌÝÅsetStructMÆAXgoÌÝÅsetStructLðÇÁB
 *                      initializeÅÌf[^ZbgÍAclearðÄñÅ©çs¤æ¤ÉC³B
 * EXPJ    (2004/03/31),úlÌRgAEgÌoOðC³B
 * EXPJ    (2004/03/20),r[Êð½fB
 * EXPJ    (2004/03/02),EXPLANNER/JpÉü¢i\[Xwb_ENXwb_ÏXj
 *                      ú¶¬ÉúlðnullÅì¬B
 *                      ú»\bhinitializeAf[^Zbg\bhsetStructÇÁB
 *                      RXgN^Ì[ULqÉinitialize\bhÄoÇÁB
 *                      initialize()\bhAsetStruct()\bhÇÁB
 * 4.1.0.0 (2003/07/16),setL2L_xxx\bhÇÁ
 * 4.0.0.1 (2003/06/05),javadocRgG[C³
 * 4.0.0.0 (2003/04/23),NX¼W»Î
 * 3.0.0.0 (2003/03/19),Time,Timestamp^Î
 * 2.1.0.0 (2002/12/17),Logging packageC³
 * 2.0.0.0 (2002/05/27),new foundationÎ
 *
 */

package com.nec.jp.orteus.metamorBase.KU0030;

import com.nec.jp.orteus.xaf.wa.*;

import com.nec.jp.orteus.util.logging.*;

import java.lang.Number.*;
import java.lang.Float;
import java.util.*;
import java.sql.*;
import java.io.*;

//{{user_implement_code_import
 // TODO: ±±ÉimportpbP[WðLqµÄ­¾³¢
import java.math.BigDecimal;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class KU0030010Struct extends DataStruct
{

	//////////////////////////////

	/** æ 1 ÏF m_k_MODE */
	public String m_k_MODE = null;
	/** æ 2 ÏF m_h_RESULT */
	public String m_h_RESULT = null;
	/** æ 3 ÏF m_r_SEL_PTN */
	public String m_r_SEL_PTN = null;
	/** æ 4 ÏF m_g_DESINATED_SHIP_DATE */
	public String m_g_DESINATED_SHIP_DATE = null;
	/** æ 5 ÏF m_g_SHIP_QTY */
	public String m_g_SHIP_QTY = null;
	/** æ 6 ÏF m_g_SHIP_QTY2 */
	public String m_g_SHIP_QTY2 = null;
	/** æ 7 ÏF m_g_UNIT_PRICE */
	public String m_g_UNIT_PRICE = null;
	/** æ 8 ÏF m_g_CURRNCY */
	public String m_g_CURRNCY = null;
	/** æ 9 ÏF m_g_SHIP_ODR_AMOUNT */
	public String m_g_SHIP_ODR_AMOUNT = null;
	/** æ 10 ÏF m_g_WH_CD */
	public String m_g_WH_CD = null;
	/** æ 11 ÏF m_g_REMARKS */
	public String m_g_REMARKS = null;
	/** æ 12 ÏF m_g_CUST_ANAME */
	public String m_g_CUST_ANAME = null;
	/** æ 13 ÏF m_g_ITEM_CD */
	public String m_g_ITEM_CD = null;
	/** æ 14 ÏF m_h_AP_SECRTY_TYP */
	public String m_h_AP_SECRTY_TYP = null;
	/** æ 15 ÏF m_h_SHIP_QTY */
	public String m_h_SHIP_QTY = null;
	/** æ 16 ÏF m_h_ITEM_CD */
	public String m_h_ITEM_CD = null;
	/** æ 17 ÏF m_h_GYOMU_DATE */
	public String m_h_GYOMU_DATE = null;
	/** æ 18 ÏF m_h_EXCH_TYP */
	public String m_h_EXCH_TYP = null;
	/** æ 19 ÏF m_h_MODFIY_CNT */
	public String m_h_MODFIY_CNT = null;
	/** æ 20 ÏF m_h_TOTAL_SHIP_QTY */
	public String m_h_TOTAL_SHIP_QTY = null;
	/** æ 21 ÏF m_m_selRadio */
	public String m_m_selRadio = null;
	/** æ 22 ÏF m_r_SEL_PTN1 */
	public String m_r_SEL_PTN1 = null;
	/** æ 23 ÏF m_r_SEL_PTN2 */
	public String m_r_SEL_PTN2 = null;
	/** æ 24 ÏF m_r_SEL_PTN3 */
	public String m_r_SEL_PTN3 = null;
	/** æ 25 ÏF m_h_SELECT_FG */
	public String m_h_SELECT_FG = null;
	/** æ 26 ÏF m_h_UNIT_PRICE */
	public String m_h_UNIT_PRICE = null;
	/** æ 27 ÏF m_g_STOCK_UNIT */
	public String m_g_STOCK_UNIT = null;
	/** æ 28 ÏF m_g_STOCK_UNIT2 */
	public String m_g_STOCK_UNIT2 = null;
	/** æ 29 ÏF m_g_CUR_UNIT2 */
	public String m_g_CUR_UNIT2 = null;
	/** æ 30 ÏF m_g_WH_NAME */
	public String m_g_WH_NAME = null;
	/** æ 31 ÏF m_g_SALES_DEPT_CD */
	public String m_g_SALES_DEPT_CD = null;
	/** æ 32 ÏF m_g_ORG_NAME */
	public String m_g_ORG_NAME = null;
	/** æ 33 ÏF m_g_CUST_CD */
	public String m_g_CUST_CD = null;
	/** æ 34 ÏF m_g_CUST_ITEM_NAME */
	public String m_g_CUST_ITEM_NAME = null;
	/** æ 35 ÏF m_g_ITEM_NAME */
	public String m_g_ITEM_NAME = null;
	/** æ 36 ÏF m_g_CUST_ODR_NO */
	public String m_g_CUST_ODR_NO = null;
	/** æ 37 ÏF m_g_ODR_NO */
	public String m_g_ODR_NO = null;
	/** æ 38 ÏF m_g_PART_DLV_SEQ_NO */
	public String m_g_PART_DLV_SEQ_NO = null;
	/** æ 39 ÏF m_g_SHIP_ODR_NO */
	public String m_g_SHIP_ODR_NO = null;
	/** æ 40 ÏF m_h_DATE */
	public String m_h_DATE = null;
	/** æ 41 ÏF m_g_JOB_ODR_CD */
	public String m_g_JOB_ODR_CD = null;
	/** æ 42 ÏF m_c_JOB_ODR_CD */
	public String m_c_JOB_ODR_CD = null;
	/** æ 43 ÏF m_g_DIRECT_DLV_FLG */
	public String m_g_DIRECT_DLV_FLG = null;
	/** æ 44 ÏF m_g_STOCK_LOT_CD */
	public String m_g_STOCK_LOT_CD = null;
	/** æ 45 ÏF m_h_STOCK_LOT_CD */
	public String m_h_STOCK_LOT_CD = null;
	/** æ 46 ÏF m_param1 */
	public String m_param1 = null;
	/** æ 47 ÏF m_param2 */
	public String m_param2 = null;
	/** æ 48 ÏF m_param3 */
	public String m_param3 = null;
	/** æ 49 ÏF m_ROUND_TYP */
	public String m_ROUND_TYP = null;
	/** æ 50 ÏF m_UNIT_QTY_TYP */
	public String m_UNIT_QTY_TYP = null;
	/** æ 51 ÏF m_UNIT_FIG */
	public String m_UNIT_FIG = null;
	/** æ 52 ÏF m_strCOMPANY_CD */
	public String m_strCOMPANY_CD = null;
	/** æ 53 ÏF m_strUSER_NAME */
	public String m_strUSER_NAME = null;
	/** æ 54 ÏF m_strPLANT_CD */
	public String m_strPLANT_CD = null;
	/** æ 55 ÏF m_strSECTION_CD */
	public String m_strSECTION_CD = null;
	/** æ 56 ÏF m_strORG_CD */
	public String m_strORG_CD = null;
	/** æ 57 ÏF m_strORG_NAME */
	public String m_strORG_NAME = null;
	/** æ 58 ÏF m_strORG_ANAME */
	public String m_strORG_ANAME = null;
	/** æ 59 ÏF m_strPLANT_NAME */
	public String m_strPLANT_NAME = null;
	/** æ 60 ÏF m_strPLANT_ANAME */
	public String m_strPLANT_ANAME = null;
	/** æ 61 ÏF m_strCAL_NO */
	public Double m_strCAL_NO = null;
	/** æ 62 ÏF m_strUSER_CD */
	public String m_strUSER_CD = null;
	/** æ 63 ÏF m_strBUSINESS_OPR_DATE */
	public String m_strBUSINESS_OPR_DATE = null;
	/** æ 64 ÏF m_serTori_SHIP_SEQ_NO */
	public String m_serTori_SHIP_SEQ_NO = null;
	/** æ 65 ÏF m_serTori_SHIP_ODR_NO */
	public String m_serTori_SHIP_ODR_NO = null;
	/** æ 66 ÏF m_serTori_SLIP_CD */
	public String m_serTori_SLIP_CD = null;
	/** æ 67 ÏF m_serTori_ODR_NO */
	public String m_serTori_ODR_NO = null;
	/** æ 68 ÏF m_serTori_PART_DLV_SEQ_NO */
	public String m_serTori_PART_DLV_SEQ_NO = null;
	/** æ 69 ÏF m_serTori_ORGNAL_SLIP_CD */
	public String m_serTori_ORGNAL_SLIP_CD = null;
	/** æ 70 ÏF m_serTori_SLIP_TRN_CD */
	public String m_serTori_SLIP_TRN_CD = null;
	/** æ 71 ÏF m_serTori_ITEM_CD */
	public String m_serTori_ITEM_CD = null;
	/** æ 72 ÏF m_serTori_JOB_ODR_CD */
	public String m_serTori_JOB_ODR_CD = null;
	/** æ 73 ÏF m_serTori_CUST_ITEM_CD */
	public String m_serTori_CUST_ITEM_CD = null;
	/** æ 74 ÏF m_serTori_CUST_ODR_NO */
	public String m_serTori_CUST_ODR_NO = null;
	/** æ 75 ÏF m_serTori_CUST_CD */
	public String m_serTori_CUST_CD = null;
	/** æ 76 ÏF m_serTori_CUST_NAME */
	public String m_serTori_CUST_NAME = null;
	/** æ 77 ÏF m_serTori_CUST_CHRG_PSN_CD */
	public String m_serTori_CUST_CHRG_PSN_CD = null;
	/** æ 78 ÏF m_serTori_SHIP_ODR_ISS_PSN_CD */
	public String m_serTori_SHIP_ODR_ISS_PSN_CD = null;
	/** æ 79 ÏF m_serTori_DLV_LOC_CD */
	public String m_serTori_DLV_LOC_CD = null;
	/** æ 80 ÏF m_serTori_DEPO_TYP */
	public String m_serTori_DEPO_TYP = null;
	/** æ 81 ÏF m_serTori_ALLCT_WH_CD */
	public String m_serTori_ALLCT_WH_CD = null;
	/** æ 82 ÏF m_serTori_DEPO_WH_CD */
	public String m_serTori_DEPO_WH_CD = null;
	/** æ 83 ÏF m_serTori_LOC_CD */
	public String m_serTori_LOC_CD = null;
	/** æ 84 ÏF m_serTori_SHIP_DATE */
	public String m_serTori_SHIP_DATE = null;
	/** æ 85 ÏF m_serTori_SHIP_QTY */
	public String m_serTori_SHIP_QTY = null;
	/** æ 86 ÏF m_serTori_UNIT_CD */
	public String m_serTori_UNIT_CD = null;
	/** æ 87 ÏF m_serTori_SHIP_UNIT_PRICE */
	public String m_serTori_SHIP_UNIT_PRICE = null;
	/** æ 88 ÏF m_serTori_SHIP_ODR_AMOUNT */
	public String m_serTori_SHIP_ODR_AMOUNT = null;
	/** æ 89 ÏF m_serTori_SHIP_ODR_AMOUNT_EXCH_RATES */
	public String m_serTori_SHIP_ODR_AMOUNT_EXCH_RATES = null;
	/** æ 90 ÏF m_serTori_CURRNCY_CD */
	public String m_serTori_CURRNCY_CD = null;
	/** æ 91 ÏF m_serTori_DIRECT_DLV_FLG */
	public String m_serTori_DIRECT_DLV_FLG = null;
	/** æ 92 ÏF m_serTori_SHIP_INFO_IF_CTRL_NO */
	public String m_serTori_SHIP_INFO_IF_CTRL_NO = null;
	/** æ 93 ÏF m_serTori_INSPC_ACPT_INFO_IF_CTRL_NO */
	public String m_serTori_INSPC_ACPT_INFO_IF_CTRL_NO = null;
	/** æ 94 ÏF m_serTori_DLV_KEY_NO */
	public String m_serTori_DLV_KEY_NO = null;
	/** æ 95 ÏF m_serTori_DEL_FLG */
	public String m_serTori_DEL_FLG = null;
	/** æ 96 ÏF m_serTori_CUR_NAME */
	public String m_serTori_CUR_NAME = null;
	/** æ 97 ÏF m_serTori_EXCH_TYP */
	public String m_serTori_EXCH_TYP = null;
	/** æ 98 ÏF m_serTori_MODIFY_COUNT */
	public String m_serTori_MODIFY_COUNT = null;
	/** æ 99 ÏF m_serTori_RETURN_QTY */
	public String m_serTori_RETURN_QTY = null;
	/** æ 100 ÏF m_serTori_TOTAL_SHIP_QTY */
	public String m_serTori_TOTAL_SHIP_QTY = null;
	/** æ 101 ÏF m_serTori_STATUS */
	public String m_serTori_STATUS = null;
	/** æ 102 ÏF m_serTori_INSPC_ACPT_TYP */
	public String m_serTori_INSPC_ACPT_TYP = null;
	/** æ 103 ÏF m_serToriSALES_DEPT_CD */
	public String m_serToriSALES_DEPT_CD = null;
	/** æ 104 ÏF m_serToriSALES_DATE */
	public String m_serToriSALES_DATE = null;
	/** æ 105 ÏF m_h_MRP_ODR_TYP */
	public String m_h_MRP_ODR_TYP = null;
	/** æ 106 ÏF m_h_LOT_CTRL_FLG */
	public String m_h_LOT_CTRL_FLG = null;
	/** æ 107 ÏF m_serTodrMODIFY_COUNT */
	public String m_serTodrMODIFY_COUNT = null;
	/** æ 108 ÏF m_serTori_IN_SLIPCD */
	public String m_serTori_IN_SLIPCD = null;
	/** æ 109 ÏF m_creTship_SHIP_SEQ_NO */
	public String m_creTship_SHIP_SEQ_NO = null;
	/** æ 110 ÏF m_creTship_SHIP_ODR_NO */
	public String m_creTship_SHIP_ODR_NO = null;
	/** æ 111 ÏF m_creTship_SLIP_CD */
	public String m_creTship_SLIP_CD = null;
	/** æ 112 ÏF m_creTship_ODR_NO */
	public String m_creTship_ODR_NO = null;
	/** æ 113 ÏF m_creTship_PART_DLV_SEQ_NO */
	public String m_creTship_PART_DLV_SEQ_NO = null;
	/** æ 114 ÏF m_creTship_ORGNAL_SLIP_CD */
	public String m_creTship_ORGNAL_SLIP_CD = null;
	/** æ 115 ÏF m_creTship_SLIP_TRN_CD */
	public String m_creTship_SLIP_TRN_CD = null;
	/** æ 116 ÏF m_creTship_ITEM_CD */
	public String m_creTship_ITEM_CD = null;
	/** æ 117 ÏF m_creTship_JOB_ODR_CD */
	public String m_creTship_JOB_ODR_CD = null;
	/** æ 118 ÏF m_creTship_CUST_ITEM_CD */
	public String m_creTship_CUST_ITEM_CD = null;
	/** æ 119 ÏF m_creTship_CUST_ODR_NO */
	public String m_creTship_CUST_ODR_NO = null;
	/** æ 120 ÏF m_creTship_CUST_CD */
	public String m_creTship_CUST_CD = null;
	/** æ 121 ÏF m_creTship_CUST_NAME */
	public String m_creTship_CUST_NAME = null;
	/** æ 122 ÏF m_creTship_CUST_CHRG_PSN_CD */
	public String m_creTship_CUST_CHRG_PSN_CD = null;
	/** æ 123 ÏF m_creTship_SHIP_ODR_ISS_PSN_CD */
	public String m_creTship_SHIP_ODR_ISS_PSN_CD = null;
	/** æ 124 ÏF m_creTship_DLV_LOC_CD */
	public String m_creTship_DLV_LOC_CD = null;
	/** æ 125 ÏF m_creTship_DEPO_TYP */
	public String m_creTship_DEPO_TYP = null;
	/** æ 126 ÏF m_creTship_ALLCT_WH_CD */
	public String m_creTship_ALLCT_WH_CD = null;
	/** æ 127 ÏF m_creTship_DEPO_WH_CD */
	public String m_creTship_DEPO_WH_CD = null;
	/** æ 128 ÏF m_creTship_LOC_CD */
	public String m_creTship_LOC_CD = null;
	/** æ 129 ÏF m_creTship_SHIP_DATE */
	public String m_creTship_SHIP_DATE = null;
	/** æ 130 ÏF m_creTship_SHIP_QTY */
	public String m_creTship_SHIP_QTY = null;
	/** æ 131 ÏF m_creTship_UNIT_CD */
	public String m_creTship_UNIT_CD = null;
	/** æ 132 ÏF m_creTship_SHIP_UNIT_PRICE */
	public String m_creTship_SHIP_UNIT_PRICE = null;
	/** æ 133 ÏF m_creTship_SHIP_ODR_AMOUNT */
	public String m_creTship_SHIP_ODR_AMOUNT = null;
	/** æ 134 ÏF m_creTship_SHIP_ODR_AMOUNT_EXCH_RATES */
	public String m_creTship_SHIP_ODR_AMOUNT_EXCH_RATES = null;
	/** æ 135 ÏF m_creTship_CURRNCY_CD */
	public String m_creTship_CURRNCY_CD = null;
	/** æ 136 ÏF m_creTship_DIRECT_DLV_FLG */
	public String m_creTship_DIRECT_DLV_FLG = null;
	/** æ 137 ÏF m_creTship_DLV_KEY_NO */
	public String m_creTship_DLV_KEY_NO = null;
	/** æ 138 ÏF m_creTship_REMARKS */
	public String m_creTship_REMARKS = null;
	/** æ 139 ÏF m_creTship_DEL_FLG */
	public String m_creTship_DEL_FLG = null;
	/** æ 140 ÏF m_updTship_SHIP_SEQ_NO */
	public String m_updTship_SHIP_SEQ_NO = null;
	/** æ 141 ÏF m_serInsert_SHIP_ODR_NO */
	public String m_serInsert_SHIP_ODR_NO = null;
	/** æ 142 ÏF m_serInsert_ODR_NO */
	public String m_serInsert_ODR_NO = null;
	/** æ 143 ÏF m_serInsert_PART_DLV_SEQ_NO */
	public String m_serInsert_PART_DLV_SEQ_NO = null;
	/** æ 144 ÏF m_serInsert_SLIP_CD */
	public String m_serInsert_SLIP_CD = null;
	/** æ 145 ÏF m_serInsert_ITEM_CD */
	public String m_serInsert_ITEM_CD = null;
	/** æ 146 ÏF m_serInsert_JOB_ODR_CD */
	public String m_serInsert_JOB_ODR_CD = null;
	/** æ 147 ÏF m_serInsert_CUST_ITEM_CD */
	public String m_serInsert_CUST_ITEM_CD = null;
	/** æ 148 ÏF m_serInsert_CUST_ODR_NO */
	public String m_serInsert_CUST_ODR_NO = null;
	/** æ 149 ÏF m_serInsert_CUST_CD */
	public String m_serInsert_CUST_CD = null;
	/** æ 150 ÏF m_serInsert_CUST_NAME */
	public String m_serInsert_CUST_NAME = null;
	/** æ 151 ÏF m_serInsert_CUST_CHRG_PSN_CD */
	public String m_serInsert_CUST_CHRG_PSN_CD = null;
	/** æ 152 ÏF m_serInsert_SHIP_ODR_ISS_PSN_CD */
	public String m_serInsert_SHIP_ODR_ISS_PSN_CD = null;
	/** æ 153 ÏF m_serInsert_DLV_LOC_CD */
	public String m_serInsert_DLV_LOC_CD = null;
	/** æ 154 ÏF m_serInsert_DEPO_TYP */
	public String m_serInsert_DEPO_TYP = null;
	/** æ 155 ÏF m_serInsert_DESINATED_SHIP_DATE */
	public String m_serInsert_DESINATED_SHIP_DATE = null;
	/** æ 156 ÏF m_serInsert_SHIP_QTY */
	public String m_serInsert_SHIP_QTY = null;
	/** æ 157 ÏF m_serInsert_TOTAL_SHIP_QTY */
	public String m_serInsert_TOTAL_SHIP_QTY = null;
	/** æ 158 ÏF m_serInsert_UNIT_CD */
	public String m_serInsert_UNIT_CD = null;
	/** æ 159 ÏF m_serInsert_UNIT_PRICE */
	public String m_serInsert_UNIT_PRICE = null;
	/** æ 160 ÏF m_serInsert_SHIP_ODR_AMOUNT */
	public String m_serInsert_SHIP_ODR_AMOUNT = null;
	/** æ 161 ÏF m_serInsert_SHIP_ODR_AMOUNT_EXCH_RATES */
	public String m_serInsert_SHIP_ODR_AMOUNT_EXCH_RATES = null;
	/** æ 162 ÏF m_serInsert_CURRNCY_CD */
	public String m_serInsert_CURRNCY_CD = null;
	/** æ 163 ÏF m_serInsert_LOC_CD */
	public String m_serInsert_LOC_CD = null;
	/** æ 164 ÏF m_serInsert_PKG_UNIT_QTY */
	public String m_serInsert_PKG_UNIT_QTY = null;
	/** æ 165 ÏF m_serInsert_REMARKS */
	public String m_serInsert_REMARKS = null;
	/** æ 166 ÏF m_serInsert_TRANSPORT_CD */
	public String m_serInsert_TRANSPORT_CD = null;
	/** æ 167 ÏF m_serInsert_TRANSPORT_TYP */
	public String m_serInsert_TRANSPORT_TYP = null;
	/** æ 168 ÏF m_serInsert_ALLCT_WH_CD */
	public String m_serInsert_ALLCT_WH_CD = null;
	/** æ 169 ÏF m_serInsert_TRANSFER_WH_CD */
	public String m_serInsert_TRANSFER_WH_CD = null;
	/** æ 170 ÏF m_serInsert_DIRECT_DLV_FLG */
	public String m_serInsert_DIRECT_DLV_FLG = null;
	/** æ 171 ÏF m_serInsert_ENTRY_TYP */
	public String m_serInsert_ENTRY_TYP = null;
	/** æ 172 ÏF m_serInsert_PRINT_FLG */
	public String m_serInsert_PRINT_FLG = null;
	/** æ 173 ÏF m_serInsert_SHP_CMPLT_FLG */
	public String m_serInsert_SHP_CMPLT_FLG = null;
	/** æ 174 ÏF m_serInsert_DEPO_TRANSFER_PROC_FLG */
	public String m_serInsert_DEPO_TRANSFER_PROC_FLG = null;
	/** æ 175 ÏF m_serInsert_DEL_FLG */
	public String m_serInsert_DEL_FLG = null;
	/** æ 176 ÏF m_serInsert_CUR_CD */
	public String m_serInsert_CUR_CD = null;
	/** æ 177 ÏF m_serInsert_CUR_NAME */
	public String m_serInsert_CUR_NAME = null;
	/** æ 178 ÏF m_serInsert_EXCH_TYP */
	public String m_serInsert_EXCH_TYP = null;
	/** æ 179 ÏF m_serInsert_SPCL_PRICE_TYP */
	public String m_serInsert_SPCL_PRICE_TYP = null;
	/** æ 180 ÏF m_serInsert_MODIFY_COUNT */
	public String m_serInsert_MODIFY_COUNT = null;
	/** æ 181 ÏF m_serInsert_SCDL_DLV_DATE */
	public String m_serInsert_SCDL_DLV_DATE = null;
	/** æ 182 ÏF m_serInsert_DLV_KEY_NO */
	public String m_serInsert_DLV_KEY_NO = null;
	/** æ 183 ÏF m_h_RETURN_QTY */
	public String m_h_RETURN_QTY = null;
	/** æ 184 ÏF m_serInsert_ODR_ACPT_DATE */
	public String m_serInsert_ODR_ACPT_DATE = null;
	/** æ 185 ÏF m_h_JOB_ODR_CD */
	public String m_h_JOB_ODR_CD = null;
	/** æ 186 ÏF m_selMODIFY_COUNT */
	public String m_selMODIFY_COUNT = null;
	/** æ 187 ÏF m_serInsert_IN_SLIPCD */
	public String m_serInsert_IN_SLIPCD = null;
	/** æ 188 ÏF m_upTshipOdr_DEPO_TRANSFER_PROC_FLG */
	public String m_upTshipOdr_DEPO_TRANSFER_PROC_FLG = null;
	/** æ 189 ÏF m_upTshipOdr_IN_SLIPCD */
	public String m_upTshipOdr_IN_SLIPCD = null;
	/** æ 190 ÏF m_chkisWhCd_WH_CD */
	public String m_chkisWhCd_WH_CD = null;
	/** æ 191 ÏF m_chkisWhCd_WH_TYP */
	public String m_chkisWhCd_WH_TYP = null;
	/** æ 192 ÏF m_chkisinWhCd_WH_NAME */
	public String m_chkisinWhCd_WH_NAME = null;
	/** æ 193 ÏF m_chkisWhCd_IN_WHCD */
	public String m_chkisWhCd_IN_WHCD = null;
	/** æ 194 ÏF m_chkisWhCd_IN_WHTYP */
	public String m_chkisWhCd_IN_WHTYP = null;
	/** æ 195 ÏF m_creTsales_SHIP_ODR_NO */
	public String m_creTsales_SHIP_ODR_NO = null;
	/** æ 196 ÏF m_creTsales_SLIP_CD */
	public String m_creTsales_SLIP_CD = null;
	/** æ 197 ÏF m_creTsales_SALES_TYP */
	public String m_creTsales_SALES_TYP = null;
	/** æ 198 ÏF m_creTsales_CUST_CD */
	public String m_creTsales_CUST_CD = null;
	/** æ 199 ÏF m_creTsales_ITEM_CD */
	public String m_creTsales_ITEM_CD = null;
	/** æ 200 ÏF m_creTsales_ITEM_NAME */
	public String m_creTsales_ITEM_NAME = null;
	/** æ 201 ÏF m_creTsales_CUST_ODR_NO */
	public String m_creTsales_CUST_ODR_NO = null;
	/** æ 202 ÏF m_creTsales_SALES_DATE */
	public String m_creTsales_SALES_DATE = null;
	/** æ 203 ÏF m_creTsales_SALES_DEPT_CD */
	public String m_creTsales_SALES_DEPT_CD = null;
	/** æ 204 ÏF m_creTsales_CUST_CHRG_PSN_CD */
	public String m_creTsales_CUST_CHRG_PSN_CD = null;
	/** æ 205 ÏF m_creTsales_ODR_ACPT_PSN_CD */
	public String m_creTsales_ODR_ACPT_PSN_CD = null;
	/** æ 206 ÏF m_creTsales_SALES_QTY */
	public String m_creTsales_SALES_QTY = null;
	/** æ 207 ÏF m_creTsales_SALES_UNIT_PRICE */
	public String m_creTsales_SALES_UNIT_PRICE = null;
	/** æ 208 ÏF m_creTsales_UNIT_CD */
	public String m_creTsales_UNIT_CD = null;
	/** æ 209 ÏF m_creTsales_SALES_AMOUNT */
	public String m_creTsales_SALES_AMOUNT = null;
	/** æ 210 ÏF m_creTsales_SALES_AMOUNT_EXCH_RATES */
	public String m_creTsales_SALES_AMOUNT_EXCH_RATES = null;
	/** æ 211 ÏF m_creTsales_INSPC_ACPT_DATE */
	public String m_creTsales_INSPC_ACPT_DATE = null;
	/** æ 212 ÏF m_creTsales_INSPC_ACPT_QTY */
	public String m_creTsales_INSPC_ACPT_QTY = null;
	/** æ 213 ÏF m_creTsales_EXTERNAL_TAX_SALES_AMOUNT */
	public String m_creTsales_EXTERNAL_TAX_SALES_AMOUNT = null;
	/** æ 214 ÏF m_creTsales_INTERNAL_TAX_SALES_AMOUNT */
	public String m_creTsales_INTERNAL_TAX_SALES_AMOUNT = null;
	/** æ 215 ÏF m_creTsales_TAXFREE_SALES_AMOUNT */
	public String m_creTsales_TAXFREE_SALES_AMOUNT = null;
	/** æ 216 ÏF m_creTsales_TAX_CREDIT_SALES_AMOUNT */
	public String m_creTsales_TAX_CREDIT_SALES_AMOUNT = null;
	/** æ 217 ÏF m_creTsales_EXTERNAL_TAX_AMOUNT */
	public String m_creTsales_EXTERNAL_TAX_AMOUNT = null;
	/** æ 218 ÏF m_creTsales_INTERNAL_TAX_AMOUNT */
	public String m_creTsales_INTERNAL_TAX_AMOUNT = null;
	/** æ 219 ÏF m_creTsales_TAX_AMOUNT_1 */
	public String m_creTsales_TAX_AMOUNT_1 = null;
	/** æ 220 ÏF m_creTsales_TAX_AMOUNT_2 */
	public String m_creTsales_TAX_AMOUNT_2 = null;
	/** æ 221 ÏF m_creTsales_TAX_AMOUNT_3 */
	public String m_creTsales_TAX_AMOUNT_3 = null;
	/** æ 222 ÏF m_creTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT */
	public String m_creTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;
	/** æ 223 ÏF m_creTsales_ORG_SLIP_CD */
	public String m_creTsales_ORG_SLIP_CD = null;
	/** æ 224 ÏF m_creTsales_CURRNCY_CD */
	public String m_creTsales_CURRNCY_CD = null;
	/** æ 225 ÏF m_creTsales_SPCL_PRICE_CO */
	public String m_creTsales_SPCL_PRICE_CO = null;
	/** æ 226 ÏF m_creTsales_REMARKS */
	public String m_creTsales_REMARKS = null;
	/** æ 227 ÏF m_creTsales_DEL_FLG */
	public String m_creTsales_DEL_FLG = null;
	/** æ 228 ÏF m_creTsales_INSPC_ACPT_TYP */
	public String m_creTsales_INSPC_ACPT_TYP = null;
	/** æ 229 ÏF m_creTsales_STATUS */
	public String m_creTsales_STATUS = null;
	/** æ 230 ÏF m_creTsales_APPR_FLG */
	public String m_creTsales_APPR_FLG = null;
	/** æ 231 ÏF m_creTsales_APPR_ID */
	public String m_creTsales_APPR_ID = null;
	/** æ 232 ÏF m_creTsales_APPR_DATE */
	public String m_creTsales_APPR_DATE = null;
	/** æ 233 ÏF m_creTsales_EXCH_RATE */
	public String m_creTsales_EXCH_RATE = null;
	/** æ 234 ÏF m_serTsales_SALES_SEQ_NO */
	public String m_serTsales_SALES_SEQ_NO = null;
	/** æ 235 ÏF m_serTsales_SLIP_CD */
	public String m_serTsales_SLIP_CD = null;
	/** æ 236 ÏF m_serTsales_SALES_TYP */
	public String m_serTsales_SALES_TYP = null;
	/** æ 237 ÏF m_serTsales_CUST_CD */
	public String m_serTsales_CUST_CD = null;
	/** æ 238 ÏF m_serTsales_ITEM_CD */
	public String m_serTsales_ITEM_CD = null;
	/** æ 239 ÏF m_serTsales_ITEM_NAME */
	public String m_serTsales_ITEM_NAME = null;
	/** æ 240 ÏF m_serTsales_CUST_ODR_NO */
	public String m_serTsales_CUST_ODR_NO = null;
	/** æ 241 ÏF m_serTsales_SALES_DATE */
	public String m_serTsales_SALES_DATE = null;
	/** æ 242 ÏF m_serTsales_SALES_DEPT_CD */
	public String m_serTsales_SALES_DEPT_CD = null;
	/** æ 243 ÏF m_serTsales_CUST_CHRG_PSN_CD */
	public String m_serTsales_CUST_CHRG_PSN_CD = null;
	/** æ 244 ÏF m_serTsales_ODR_ACPT_PSN_CD */
	public String m_serTsales_ODR_ACPT_PSN_CD = null;
	/** æ 245 ÏF m_serTsales_SALES_QTY */
	public String m_serTsales_SALES_QTY = null;
	/** æ 246 ÏF m_serTsales_SALES_UNIT_PRICE */
	public String m_serTsales_SALES_UNIT_PRICE = null;
	/** æ 247 ÏF m_serTsales_UNIT_CD */
	public String m_serTsales_UNIT_CD = null;
	/** æ 248 ÏF m_serTsales_SALES_AMOUNT */
	public String m_serTsales_SALES_AMOUNT = null;
	/** æ 249 ÏF m_serTsales_SALES_AMOUNT_EXCH_RATES */
	public String m_serTsales_SALES_AMOUNT_EXCH_RATES = null;
	/** æ 250 ÏF m_serTsales_EXTERNAL_TAX_SALES_AMOUNT */
	public String m_serTsales_EXTERNAL_TAX_SALES_AMOUNT = null;
	/** æ 251 ÏF m_serTsales_INTERNAL_TAX_SALES_AMOUNT */
	public String m_serTsales_INTERNAL_TAX_SALES_AMOUNT = null;
	/** æ 252 ÏF m_serTsales_TAXFREE_SALES_AMOUNT */
	public String m_serTsales_TAXFREE_SALES_AMOUNT = null;
	/** æ 253 ÏF m_serTsales_TAX_CREDIT_SALES_AMOUNT */
	public String m_serTsales_TAX_CREDIT_SALES_AMOUNT = null;
	/** æ 254 ÏF m_serTsales_EXTERNAL_TAX_AMOUNT */
	public String m_serTsales_EXTERNAL_TAX_AMOUNT = null;
	/** æ 255 ÏF m_serTsales_INTERNAL_TAX_AMOUNT */
	public String m_serTsales_INTERNAL_TAX_AMOUNT = null;
	/** æ 256 ÏF m_serTsales_TAX_AMOUNT_1 */
	public String m_serTsales_TAX_AMOUNT_1 = null;
	/** æ 257 ÏF m_serTsales_TAX_AMOUNT_2 */
	public String m_serTsales_TAX_AMOUNT_2 = null;
	/** æ 258 ÏF m_serTsales_TAX_AMOUNT_3 */
	public String m_serTsales_TAX_AMOUNT_3 = null;
	/** æ 259 ÏF m_serTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT */
	public String m_serTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;
	/** æ 260 ÏF m_serTsales_ORG_SLIP_CD */
	public String m_serTsales_ORG_SLIP_CD = null;
	/** æ 261 ÏF m_serTsales_CURRNCY_CD */
	public String m_serTsales_CURRNCY_CD = null;
	/** æ 262 ÏF m_serTsales_SPCL_PRICE_CO */
	public String m_serTsales_SPCL_PRICE_CO = null;
	/** æ 263 ÏF m_serTsales_REMARKS */
	public String m_serTsales_REMARKS = null;
	/** æ 264 ÏF m_serTsales_DEL_FLG */
	public String m_serTsales_DEL_FLG = null;
	/** æ 265 ÏF m_serTsales_INSPC_ACPT_TYP */
	public String m_serTsales_INSPC_ACPT_TYP = null;
	/** æ 266 ÏF m_serTsales_STATUS */
	public String m_serTsales_STATUS = null;
	/** æ 267 ÏF m_serTsales_PRD_ODR_PLACE_CD */
	public String m_serTsales_PRD_ODR_PLACE_CD = null;
	/** æ 268 ÏF m_serTsales_EXCH_RATE */
	public String m_serTsales_EXCH_RATE = null;
	/** æ 269 ÏF m_serTsales_IN_SLIPCD */
	public String m_serTsales_IN_SLIPCD = null;
	/** æ 270 ÏF m_updTsales_APPR_FLG */
	public String m_updTsales_APPR_FLG = null;
	/** æ 271 ÏF m_updTsales_APPR_ID */
	public String m_updTsales_APPR_ID = null;
	/** æ 272 ÏF m_updTsales_APPR_DATE */
	public String m_updTsales_APPR_DATE = null;
	/** æ 273 ÏF m_updTsales_SALES_SEQ_NO */
	public String m_updTsales_SALES_SEQ_NO = null;
	/** æ 274 ÏF m_mItem_ITEM_CD */
	public String m_mItem_ITEM_CD = null;
	/** æ 275 ÏF m_mItem_ITEM_NAME */
	public String m_mItem_ITEM_NAME = null;
	/** æ 276 ÏF m_mItem_PRODUCT_TYP */
	public String m_mItem_PRODUCT_TYP = null;
	/** æ 277 ÏF m_mItem_MRP_ODR_TYP */
	public String m_mItem_MRP_ODR_TYP = null;
	/** æ 278 ÏF m_mItem_DRAW_CD */
	public String m_mItem_DRAW_CD = null;
	/** æ 279 ÏF m_mItem_SPEC */
	public String m_mItem_SPEC = null;
	/** æ 280 ÏF m_mItem_HIGH_LEVEL_NO */
	public String m_mItem_HIGH_LEVEL_NO = null;
	/** æ 281 ÏF m_mItem_OUTSIDE_TYP */
	public String m_mItem_OUTSIDE_TYP = null;
	/** æ 282 ÏF m_mItem_STOCK_UNIT_FLG */
	public String m_mItem_STOCK_UNIT_FLG = null;
	/** æ 283 ÏF m_mItem_STOCK_UNIT */
	public String m_mItem_STOCK_UNIT = null;
	/** æ 284 ÏF m_mItem_PKG_UNIT */
	public String m_mItem_PKG_UNIT = null;
	/** æ 285 ÏF m_mItem_PKG_UNIT_QTY */
	public String m_mItem_PKG_UNIT_QTY = null;
	/** æ 286 ÏF m_mItem_UNIT_QTY_TYP */
	public String m_mItem_UNIT_QTY_TYP = null;
	/** æ 287 ÏF m_mItem_ODR_LT */
	public String m_mItem_ODR_LT = null;
	/** æ 288 ÏF m_mItem_FIXED_LT */
	public String m_mItem_FIXED_LT = null;
	/** æ 289 ÏF m_mItem_PROP_LT */
	public String m_mItem_PROP_LT = null;
	/** æ 290 ÏF m_mItem_SAFETY_LT */
	public String m_mItem_SAFETY_LT = null;
	/** æ 291 ÏF m_mItem_ISSUE_LT */
	public String m_mItem_ISSUE_LT = null;
	/** æ 292 ÏF m_mItem_PROP_LOT_SIZE */
	public String m_mItem_PROP_LOT_SIZE = null;
	/** æ 293 ÏF m_mItem_ITEM_SPOIL */
	public String m_mItem_ITEM_SPOIL = null;
	/** æ 294 ÏF m_mItem_SAFETY_STOCK */
	public String m_mItem_SAFETY_STOCK = null;
	/** æ 295 ÏF m_mItem_LOT_SIZING_TYP */
	public String m_mItem_LOT_SIZING_TYP = null;
	/** æ 296 ÏF m_mItem_MAX_PERIOD */
	public String m_mItem_MAX_PERIOD = null;
	/** æ 297 ÏF m_mItem_MAX_ODR_QTY */
	public String m_mItem_MAX_ODR_QTY = null;
	/** æ 298 ÏF m_mItem_ODR_POINT */
	public String m_mItem_ODR_POINT = null;
	/** æ 299 ÏF m_mItem_FIXED_ODR_QTY */
	public String m_mItem_FIXED_ODR_QTY = null;
	/** æ 300 ÏF m_mItem_MIN_ODR_QTY */
	public String m_mItem_MIN_ODR_QTY = null;
	/** æ 301 ÏF m_mItem_MUL_ODR_QTY */
	public String m_mItem_MUL_ODR_QTY = null;
	/** æ 302 ÏF m_mItem_ISSUE_TYP */
	public String m_mItem_ISSUE_TYP = null;
	/** æ 303 ÏF m_mItem_MPS_FLG */
	public String m_mItem_MPS_FLG = null;
	/** æ 304 ÏF m_mItem_ACPT_INSPC_TYP */
	public String m_mItem_ACPT_INSPC_TYP = null;
	/** æ 305 ÏF m_mItem_CLASIFICATION_CD */
	public String m_mItem_CLASIFICATION_CD = null;
	/** æ 306 ÏF m_mItem_UNIT_WEIGHT */
	public String m_mItem_UNIT_WEIGHT = null;
	/** æ 307 ÏF m_mItem_ABC_TYP */
	public String m_mItem_ABC_TYP = null;
	/** æ 308 ÏF m_mItem_OPR_RSLT_TYP */
	public String m_mItem_OPR_RSLT_TYP = null;
	/** æ 309 ÏF m_mItem_SPL_ITEM_TYP */
	public String m_mItem_SPL_ITEM_TYP = null;
	/** æ 310 ÏF m_mItem_TAX_CD */
	public String m_mItem_TAX_CD = null;
	/** æ 311 ÏF m_mItem_IN_ITEMCD */
	public String m_mItem_IN_ITEMCD = null;
	/** æ 312 ÏF m_mItemSpec_CUST_CD */
	public String m_mItemSpec_CUST_CD = null;
	/** æ 313 ÏF m_mItemSpec_CUST_ITEM_CD */
	public String m_mItemSpec_CUST_ITEM_CD = null;
	/** æ 314 ÏF m_mItemSpec_COMPANY_CD */
	public String m_mItemSpec_COMPANY_CD = null;
	/** æ 315 ÏF m_mItemSpec_SALES_DEPT_CD */
	public String m_mItemSpec_SALES_DEPT_CD = null;
	/** æ 316 ÏF m_mItemSpec_CUST_ITEM_NAME */
	public String m_mItemSpec_CUST_ITEM_NAME = null;
	/** æ 317 ÏF m_mItemSpec_IN_CUST_CD */
	public String m_mItemSpec_IN_CUST_CD = null;
	/** æ 318 ÏF m_mItemSpec_IN_CUST_ITEM_CD */
	public String m_mItemSpec_IN_CUST_ITEM_CD = null;
	/** æ 319 ÏF m_mItemSpec_IN_COMPANY_CD */
	public String m_mItemSpec_IN_COMPANY_CD = null;
	/** æ 320 ÏF m_tOdr_ODR_NO */
	public String m_tOdr_ODR_NO = null;
	/** æ 321 ÏF m_tOdr_ODR_TYP */
	public String m_tOdr_ODR_TYP = null;
	/** æ 322 ÏF m_tOdr_ODR_CTL_NO */
	public String m_tOdr_ODR_CTL_NO = null;
	/** æ 323 ÏF m_tOdr_CUST_ODR_NO */
	public String m_tOdr_CUST_ODR_NO = null;
	/** æ 324 ÏF m_tOdr_CUST_CHRG_ORG_CD */
	public String m_tOdr_CUST_CHRG_ORG_CD = null;
	/** æ 325 ÏF m_tOdr_CUST_CHRG_PSN_CD */
	public String m_tOdr_CUST_CHRG_PSN_CD = null;
	/** æ 326 ÏF m_tOdr_ODR_ACPT_ORG_CD */
	public String m_tOdr_ODR_ACPT_ORG_CD = null;
	/** æ 327 ÏF m_tOdr_ODR_ACPT_PSN_CD */
	public String m_tOdr_ODR_ACPT_PSN_CD = null;
	/** æ 328 ÏF m_tOdr_CURRNCY_CD */
	public String m_tOdr_CURRNCY_CD = null;
	/** æ 329 ÏF m_tOdr_EXCH_TYP */
	public String m_tOdr_EXCH_TYP = null;
	/** æ 330 ÏF m_tOdr_DLV_LOC_CD */
	public String m_tOdr_DLV_LOC_CD = null;
	/** æ 331 ÏF m_tOdr_DLV_LOC_CD_EIAJ */
	public String m_tOdr_DLV_LOC_CD_EIAJ = null;
	/** æ 332 ÏF m_tOdr_DLV_LOC_NAME */
	public String m_tOdr_DLV_LOC_NAME = null;
	/** æ 333 ÏF m_tOdr_DLV_LOC_NAME_KANJI */
	public String m_tOdr_DLV_LOC_NAME_KANJI = null;
	/** æ 334 ÏF m_tOdr_PRD_ODR_PLACE_CD */
	public String m_tOdr_PRD_ODR_PLACE_CD = null;
	/** æ 335 ÏF m_tOdr_ODR_UNIT_PRICE */
	public String m_tOdr_ODR_UNIT_PRICE = null;
	/** æ 336 ÏF m_tOdr_SPCL_PRICE_TYP */
	public String m_tOdr_SPCL_PRICE_TYP = null;
	/** æ 337 ÏF m_tOdr_PART_DLV_COUNT */
	public String m_tOdr_PART_DLV_COUNT = null;
	/** æ 338 ÏF m_tOdr_DEPO_TYP */
	public String m_tOdr_DEPO_TYP = null;
	/** æ 339 ÏF m_tOdr_DESINATED_DLV_DATE */
	public String m_tOdr_DESINATED_DLV_DATE = null;
	/** æ 340 ÏF m_tOdr_STD_DESINATED_RCV_DATE */
	public String m_tOdr_STD_DESINATED_RCV_DATE = null;
	/** æ 341 ÏF m_tOdr_ODR_QTY */
	public String m_tOdr_ODR_QTY = null;
	/** æ 342 ÏF m_tOdr_REMAIN_UNCONFIRM_ODR_QTY */
	public String m_tOdr_REMAIN_UNCONFIRM_ODR_QTY = null;
	/** æ 343 ÏF m_tOdr_CANCELED_UNCONFIRM_ODR_QTY */
	public String m_tOdr_CANCELED_UNCONFIRM_ODR_QTY = null;
	/** æ 344 ÏF m_tOdr_UNIT_CD */
	public String m_tOdr_UNIT_CD = null;
	/** æ 345 ÏF m_tOdr_UNCONFIRM_ODR_BALANCE */
	public String m_tOdr_UNCONFIRM_ODR_BALANCE = null;
	/** æ 346 ÏF m_tOdr_ODR_AMOUNT */
	public String m_tOdr_ODR_AMOUNT = null;
	/** æ 347 ÏF m_tOdr_ODR_AMOUNT_EXCH_RATES */
	public String m_tOdr_ODR_AMOUNT_EXCH_RATES = null;
	/** æ 348 ÏF m_tOdr_TOTAL_SHIP_QTY */
	public String m_tOdr_TOTAL_SHIP_QTY = null;
	/** æ 349 ÏF m_tOdr_SHIP_AMOUNT */
	public String m_tOdr_SHIP_AMOUNT = null;
	/** æ 350 ÏF m_tOdr_SHIP_AMOUNT_EXCH_RATES */
	public String m_tOdr_SHIP_AMOUNT_EXCH_RATES = null;
	/** æ 351 ÏF m_tOdr_RETURN_PRICE */
	public String m_tOdr_RETURN_PRICE = null;
	/** æ 352 ÏF m_tOdr_RETURN_QTY */
	public String m_tOdr_RETURN_QTY = null;
	/** æ 353 ÏF m_tOdr_RETURN_AMOUNT */
	public String m_tOdr_RETURN_AMOUNT = null;
	/** æ 354 ÏF m_tOdr_RETURN_AMOUNT_EXCH_RATES */
	public String m_tOdr_RETURN_AMOUNT_EXCH_RATES = null;
	/** æ 355 ÏF m_tOdr_ODR_CMPLT_FLG */
	public String m_tOdr_ODR_CMPLT_FLG = null;
	/** æ 356 ÏF m_tOdr_ODR_CMPLT_DATE */
	public String m_tOdr_ODR_CMPLT_DATE = null;
	/** æ 357 ÏF m_tOdr_CUS_DLV_CD */
	public String m_tOdr_CUS_DLV_CD = null;
	/** æ 358 ÏF m_tOdr_DLV_KEY_NO */
	public String m_tOdr_DLV_KEY_NO = null;
	/** æ 359 ÏF m_tOdr_PART_NAME */
	public String m_tOdr_PART_NAME = null;
	/** æ 360 ÏF m_tOdr_PKG_UNIT */
	public String m_tOdr_PKG_UNIT = null;
	/** æ 361 ÏF m_tOdr_SLIP_PRICE_PRINT_TYP */
	public String m_tOdr_SLIP_PRICE_PRINT_TYP = null;
	/** æ 362 ÏF m_tOdr_INSPC_TYP */
	public String m_tOdr_INSPC_TYP = null;
	/** æ 363 ÏF m_tOdr_CLIENT_REMARK */
	public String m_tOdr_CLIENT_REMARK = null;
	/** æ 364 ÏF m_tOdr_CLIENT_REMARK_KANJI */
	public String m_tOdr_CLIENT_REMARK_KANJI = null;
	/** æ 365 ÏF m_tOdr_CLIENT_BARCODE_INF */
	public String m_tOdr_CLIENT_BARCODE_INF = null;
	/** æ 366 ÏF m_tOdr_TRANSPORT_CD */
	public String m_tOdr_TRANSPORT_CD = null;
	/** æ 367 ÏF m_tOdr_TRANSPORT_TYP */
	public String m_tOdr_TRANSPORT_TYP = null;
	/** æ 368 ÏF m_tOdr_TAX_APPLY_TYP */
	public String m_tOdr_TAX_APPLY_TYP = null;
	/** æ 369 ÏF m_tOdr_TAX_CD */
	public String m_tOdr_TAX_CD = null;
	/** æ 370 ÏF m_tOdr_TAX_CALC_TYP */
	public String m_tOdr_TAX_CALC_TYP = null;
	/** æ 371 ÏF m_tOdr_REMARKS */
	public String m_tOdr_REMARKS = null;
	/** æ 372 ÏF m_tOdr_ODR_ACPT_DATE */
	public String m_tOdr_ODR_ACPT_DATE = null;
	/** æ 373 ÏF m_tOdr_SHIP_PLAN_REMAIN_QTY */
	public String m_tOdr_SHIP_PLAN_REMAIN_QTY = null;
	/** æ 374 ÏF m_tOdr_SHIP_PLAN_CMPLT_FLG */
	public String m_tOdr_SHIP_PLAN_CMPLT_FLG = null;
	/** æ 375 ÏF m_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG */
	public String m_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG = null;
	/** æ 376 ÏF m_tOdr_PARTIAL_SHIP_INST_FLG */
	public String m_tOdr_PARTIAL_SHIP_INST_FLG = null;
	/** æ 377 ÏF m_tOdr_IF_CTL_NO */
	public String m_tOdr_IF_CTL_NO = null;
	/** æ 378 ÏF m_tOdr_ENTRY_TYP */
	public String m_tOdr_ENTRY_TYP = null;
	/** æ 379 ÏF m_tOdr_DEL_FLG */
	public String m_tOdr_DEL_FLG = null;
	/** æ 380 ÏF m_tOdr_SHIP_CNT */
	public String m_tOdr_SHIP_CNT = null;
	/** æ 381 ÏF m_tOdr_UNIT_CD_ORG */
	public String m_tOdr_UNIT_CD_ORG = null;
	/** æ 382 ÏF m_tOdrCtl_CUST_ITEM_CD */
	public String m_tOdrCtl_CUST_ITEM_CD = null;
	/** æ 383 ÏF m_tOdr_COCK_TYP */
	public String m_tOdr_COCK_TYP = null;
	/** æ 384 ÏF m_tOdr_PUCH_ODR_QTY_TOTAL */
	public String m_tOdr_PUCH_ODR_QTY_TOTAL = null;
	/** æ 385 ÏF m_tOdr_BUYER_ORG_CD */
	public String m_tOdr_BUYER_ORG_CD = null;
	/** æ 386 ÏF m_tOdr_BUYER_NAME */
	public String m_tOdr_BUYER_NAME = null;
	/** æ 387 ÏF m_tOdr_IN_ODRNO */
	public String m_tOdr_IN_ODRNO = null;
	/** æ 388 ÏF m_creTodrODR_NO */
	public String m_creTodrODR_NO = null;
	/** æ 389 ÏF m_creTodrODR_TYP */
	public String m_creTodrODR_TYP = null;
	/** æ 390 ÏF m_creTodrODR_CTL_NO */
	public String m_creTodrODR_CTL_NO = null;
	/** æ 391 ÏF m_creTodrCUST_ODR_NO */
	public String m_creTodrCUST_ODR_NO = null;
	/** æ 392 ÏF m_creTodrCUST_CHRG_ORG_CD */
	public String m_creTodrCUST_CHRG_ORG_CD = null;
	/** æ 393 ÏF m_creTodrCUST_CHRG_PSN_CD */
	public String m_creTodrCUST_CHRG_PSN_CD = null;
	/** æ 394 ÏF m_creTodrODR_ACPT_ORG_CD */
	public String m_creTodrODR_ACPT_ORG_CD = null;
	/** æ 395 ÏF m_creTodrODR_ACPT_PSN_CD */
	public String m_creTodrODR_ACPT_PSN_CD = null;
	/** æ 396 ÏF m_creTodrCURRNCY_CD */
	public String m_creTodrCURRNCY_CD = null;
	/** æ 397 ÏF m_creTodrEXCH_TYP */
	public String m_creTodrEXCH_TYP = null;
	/** æ 398 ÏF m_creTodrDLV_LOC_CD */
	public String m_creTodrDLV_LOC_CD = null;
	/** æ 399 ÏF m_creTodrDLV_LOC_NAME */
	public String m_creTodrDLV_LOC_NAME = null;
	/** æ 400 ÏF m_creTodrDLV_LOC_NAME_KANJI */
	public String m_creTodrDLV_LOC_NAME_KANJI = null;
	/** æ 401 ÏF m_creTodrPRD_ODR_PLACE_CD */
	public String m_creTodrPRD_ODR_PLACE_CD = null;
	/** æ 402 ÏF m_creTodrODR_UNIT_PRICE */
	public String m_creTodrODR_UNIT_PRICE = null;
	/** æ 403 ÏF m_creTodrPART_DLV_COUNT */
	public String m_creTodrPART_DLV_COUNT = null;
	/** æ 404 ÏF m_creTodrDEPO_TYP */
	public String m_creTodrDEPO_TYP = null;
	/** æ 405 ÏF m_creTodrDESINATED_DLV_DATE */
	public String m_creTodrDESINATED_DLV_DATE = null;
	/** æ 406 ÏF m_creTodrODR_QTY */
	public String m_creTodrODR_QTY = null;
	/** æ 407 ÏF m_creTodrREMAIN_UNCONFIRM_ODR_QTY */
	public String m_creTodrREMAIN_UNCONFIRM_ODR_QTY = null;
	/** æ 408 ÏF m_creTodrCANCELED_UNCONFIRM_ODR_QTY */
	public String m_creTodrCANCELED_UNCONFIRM_ODR_QTY = null;
	/** æ 409 ÏF m_creTodrUNIT_CD */
	public String m_creTodrUNIT_CD = null;
	/** æ 410 ÏF m_creTodrUNCONFIRM_ODR_BALANCE */
	public String m_creTodrUNCONFIRM_ODR_BALANCE = null;
	/** æ 411 ÏF m_creTodrODR_AMOUNT */
	public String m_creTodrODR_AMOUNT = null;
	/** æ 412 ÏF m_creTodrODR_AMOUNT_EXCH_RATES */
	public String m_creTodrODR_AMOUNT_EXCH_RATES = null;
	/** æ 413 ÏF m_creTodrTOTAL_SHIP_QTY */
	public String m_creTodrTOTAL_SHIP_QTY = null;
	/** æ 414 ÏF m_creTodrSHIP_AMOUNT */
	public String m_creTodrSHIP_AMOUNT = null;
	/** æ 415 ÏF m_creTodrSHIP_AMOUNT_EXCH_RATES */
	public String m_creTodrSHIP_AMOUNT_EXCH_RATES = null;
	/** æ 416 ÏF m_creTodrODR_CMPLT_FLG */
	public String m_creTodrODR_CMPLT_FLG = null;
	/** æ 417 ÏF m_creTodrODR_CMPLT_DATE */
	public String m_creTodrODR_CMPLT_DATE = null;
	/** æ 418 ÏF m_creTodrREMARKS */
	public String m_creTodrREMARKS = null;
	/** æ 419 ÏF m_creTodrODR_ACPT_DATE */
	public String m_creTodrODR_ACPT_DATE = null;
	/** æ 420 ÏF m_creTodrSHIP_PLAN_REMAIN_QTY */
	public String m_creTodrSHIP_PLAN_REMAIN_QTY = null;
	/** æ 421 ÏF m_creTodrSHIP_PLAN_CMPLT_FLG */
	public String m_creTodrSHIP_PLAN_CMPLT_FLG = null;
	/** æ 422 ÏF m_creTodrUNCONFIRMED_ODR_EFF_OVR_FLG */
	public String m_creTodrUNCONFIRMED_ODR_EFF_OVR_FLG = null;
	/** æ 423 ÏF m_creTodrPARTIAL_SHIP_INST_FLG */
	public String m_creTodrPARTIAL_SHIP_INST_FLG = null;
	/** æ 424 ÏF m_creTodrENTRY_TYP */
	public String m_creTodrENTRY_TYP = null;
	/** æ 425 ÏF m_creTodrDEL_FLG */
	public String m_creTodrDEL_FLG = null;
	/** æ 426 ÏF m_upTodr_TOTAL_SHIP_QTY */
	public String m_upTodr_TOTAL_SHIP_QTY = null;
	/** æ 427 ÏF m_upTodr_SHIP_AMOUNT */
	public String m_upTodr_SHIP_AMOUNT = null;
	/** æ 428 ÏF m_upTodr_SHIP_AMOUNT_EXCH_RATES */
	public String m_upTodr_SHIP_AMOUNT_EXCH_RATES = null;
	/** æ 429 ÏF m_upTodr_ODR_CMPLT_FLG */
	public String m_upTodr_ODR_CMPLT_FLG = null;
	/** æ 430 ÏF m_upTodr_ODR_CMPLT_DATE */
	public String m_upTodr_ODR_CMPLT_DATE = null;
	/** æ 431 ÏF m_upTodr_IN_ODRNO */
	public String m_upTodr_IN_ODRNO = null;
	/** æ 432 ÏF m_creTrcvIssue_RCV_ISSUE_CTRL_CD */
	public String m_creTrcvIssue_RCV_ISSUE_CTRL_CD = null;
	/** æ 433 ÏF m_creTrcvIssue_RCV_ISSUE_TYP */
	public String m_creTrcvIssue_RCV_ISSUE_TYP = null;
	/** æ 434 ÏF m_creTrcvIssue_ITEM_CD */
	public String m_creTrcvIssue_ITEM_CD = null;
	/** æ 435 ÏF m_creTrcvIssue_JOB_ODR_CD */
	public String m_creTrcvIssue_JOB_ODR_CD = null;
	/** æ 436 ÏF m_creTrcvIssue_PLANT_CD */
	public String m_creTrcvIssue_PLANT_CD = null;
	/** æ 437 ÏF m_creTrcvIssue_WH_CD */
	public String m_creTrcvIssue_WH_CD = null;
	/** æ 438 ÏF m_creTrcvIssue_RCV_ISSUE_BEFORE_QTY */
	public String m_creTrcvIssue_RCV_ISSUE_BEFORE_QTY = null;
	/** æ 439 ÏF m_creTrcvIssue_RCV_ISSUE_QTY */
	public String m_creTrcvIssue_RCV_ISSUE_QTY = null;
	/** æ 440 ÏF m_creTrcvIssue_RCV_ISSUE_AFTER_QTY */
	public String m_creTrcvIssue_RCV_ISSUE_AFTER_QTY = null;
	/** æ 441 ÏF m_creTrcvIssue_RCV_ISSUE_AMOUNT */
	public String m_creTrcvIssue_RCV_ISSUE_AMOUNT = null;
	/** æ 442 ÏF m_creTrcvIssue_RCV_ISSUE_DATE */
	public String m_creTrcvIssue_RCV_ISSUE_DATE = null;
	/** æ 443 ÏF m_creTrcvIssue_RCV_ISSUE_GNR_TYP */
	public String m_creTrcvIssue_RCV_ISSUE_GNR_TYP = null;
	/** æ 444 ÏF m_creTrcvIssue_STOCK_UPD_TYP */
	public String m_creTrcvIssue_STOCK_UPD_TYP = null;
	/** æ 445 ÏF m_creTrcvIssue_RCV_ISSUE_CMPLT_FLG */
	public String m_creTrcvIssue_RCV_ISSUE_CMPLT_FLG = null;
	/** æ 446 ÏF m_creTrcvIssue_RCV_ISSUE_COMMENT */
	public String m_creTrcvIssue_RCV_ISSUE_COMMENT = null;
	/** æ 447 ÏF m_creTrcvIssue_LOT_NO */
	public String m_creTrcvIssue_LOT_NO = null;
	/** æ 448 ÏF m_creTrcvIssue_SHIP_ODR_NO */
	public String m_creTrcvIssue_SHIP_ODR_NO = null;
	/** æ 449 ÏF m_upTitemStock_STOCK_ON_HAND_QTY */
	public String m_upTitemStock_STOCK_ON_HAND_QTY = null;
	/** æ 450 ÏF m_upTitemStock_IN_ITEMCD */
	public String m_upTitemStock_IN_ITEMCD = null;
	/** æ 451 ÏF m_upTitemStock_IN_WHCD */
	public String m_upTitemStock_IN_WHCD = null;
	/** æ 452 ÏF m_serTitemStock_ITEM_CD */
	public String m_serTitemStock_ITEM_CD = null;
	/** æ 453 ÏF m_serTitemStock_WH_CD */
	public String m_serTitemStock_WH_CD = null;
	/** æ 454 ÏF m_serTitemStock_PLANT_CD */
	public String m_serTitemStock_PLANT_CD = null;
	/** æ 455 ÏF m_serTitemStock_STOCK_ON_HAND_QTY */
	public String m_serTitemStock_STOCK_ON_HAND_QTY = null;
	/** æ 456 ÏF m_serTitemStock_DEFECT_QTY */
	public String m_serTitemStock_DEFECT_QTY = null;
	/** æ 457 ÏF m_serTitemStock_PRVS_DAYEND_STOCK_QTY */
	public String m_serTitemStock_PRVS_DAYEND_STOCK_QTY = null;
	/** æ 458 ÏF m_serTitemStock_PRVS_MONTHEND_STOCK_QTY */
	public String m_serTitemStock_PRVS_MONTHEND_STOCK_QTY = null;
	/** æ 459 ÏF m_serTitemStock_PRVS_TERMEND_STOCK_QTY */
	public String m_serTitemStock_PRVS_TERMEND_STOCK_QTY = null;
	/** æ 460 ÏF m_serTitemStock_IN_ITEMCD */
	public String m_serTitemStock_IN_ITEMCD = null;
	/** æ 461 ÏF m_serTitemStock_IN_WHCD */
	public String m_serTitemStock_IN_WHCD = null;
	/** æ 462 ÏF m_creTitemStock_WH_CD */
	public String m_creTitemStock_WH_CD = null;
	/** æ 463 ÏF m_creTitemStock_ITEM_CD */
	public String m_creTitemStock_ITEM_CD = null;
	/** æ 464 ÏF m_creTitemStock_PLANT_CD */
	public String m_creTitemStock_PLANT_CD = null;
	/** æ 465 ÏF m_creTitemStock_STOCK_ON_HAND_QTY */
	public String m_creTitemStock_STOCK_ON_HAND_QTY = null;
	/** æ 466 ÏF m_mCust_COMPANY_CD */
	public String m_mCust_COMPANY_CD = null;
	/** æ 467 ÏF m_mCust_CUST_CD */
	public String m_mCust_CUST_CD = null;
	/** æ 468 ÏF m_mCust_CUST_NAME */
	public String m_mCust_CUST_NAME = null;
	/** æ 469 ÏF m_mCust_DETAIL_ROUND_TYP */
	public String m_mCust_DETAIL_ROUND_TYP = null;
	/** æ 470 ÏF m_mCust_INSPC_ACPT_TYP */
	public String m_mCust_INSPC_ACPT_TYP = null;
	/** æ 471 ÏF m_mCust_OWN_ORG_CD */
	public String m_mCust_OWN_ORG_CD = null;
	/** æ 472 ÏF m_mCust_EXCH_TYP */
	public String m_mCust_EXCH_TYP = null;
	/** æ 473 ÏF m_mCust_CUR_CD */
	public String m_mCust_CUR_CD = null;
	/** æ 474 ÏF m_mCust_IN_COMPANYCD */
	public String m_mCust_IN_COMPANYCD = null;
	/** æ 475 ÏF m_mCust_IN_CUSTCD */
	public String m_mCust_IN_CUSTCD = null;
	/** æ 476 ÏF m_getHomeCur_CUR_CD */
	public String m_getHomeCur_CUR_CD = null;
	/** æ 477 ÏF m_getHomeCur_DECIMAL_FIG */
	public String m_getHomeCur_DECIMAL_FIG = null;
	/** æ 478 ÏF m_getHomeCur_CTRL_CD */
	public String m_getHomeCur_CTRL_CD = null;
	/** æ 479 ÏF m_strCode */
	public String m_strCode = null;
	/** æ 480 ÏF m_mUnitCost_UNIT_COST */
	public String m_mUnitCost_UNIT_COST = null;
	/** æ 481 ÏF m_mUnitCost_EFF_PHASE_IN_DATE */
	public String m_mUnitCost_EFF_PHASE_IN_DATE = null;
	/** æ 482 ÏF m_mUnitCost_IN_COMPANYCD */
	public String m_mUnitCost_IN_COMPANYCD = null;
	/** æ 483 ÏF m_mUnitCost_IN_CUSTCD */
	public String m_mUnitCost_IN_CUSTCD = null;
	/** æ 484 ÏF m_mUnitCost_IN_ITEMCD */
	public String m_mUnitCost_IN_ITEMCD = null;
	/** æ 485 ÏF m_mUnitCost_IN_EFFPHASEINDATE */
	public String m_mUnitCost_IN_EFFPHASEINDATE = null;
	/** æ 486 ÏF m_readShipOdr_TOTAL_SHIP_QTY */
	public String m_readShipOdr_TOTAL_SHIP_QTY = null;
	/** æ 487 ÏF m_readShipOdr_RETURN_QTY */
	public String m_readShipOdr_RETURN_QTY = null;
	/** æ 488 ÏF m_readShipOdr_SHIP_ODR_NO */
	public String m_readShipOdr_SHIP_ODR_NO = null;
	/** æ 489 ÏF m_g_CUR_UNIT */
	public String m_g_CUR_UNIT = null;
	/** æ 490 ÏF m_DECIMAL_FIG */
	public String m_DECIMAL_FIG = null;
	/** æ 491 ÏF m_t_CUR_CD */
	public String m_t_CUR_CD = null;
	/** æ 492 ÏF m_strSLIP_CTRL_GRP */
	public String m_strSLIP_CTRL_GRP = null;
	/** æ 493 ÏF m_strSTATUS */
	public String m_strSTATUS = null;
	/** æ 494 ÏF m_strSLIP_CD */
	public String m_strSLIP_CD = null;
	/** æ 495 ÏF m_upTshipOdr_SHP_CMPLT_FLG */
	public String m_upTshipOdr_SHP_CMPLT_FLG = null;
	/** æ 496 ÏF m_upTshipOdr_TOTAL_SHIP_QTY */
	public String m_upTshipOdr_TOTAL_SHIP_QTY = null;
	/** æ 497 ÏF m_upTshipOdr_SLIP_CD */
	public String m_upTshipOdr_SLIP_CD = null;
	/** æ 498 ÏF m_upTshipOdr_ORG_SLIP_CD */
	public String m_upTshipOdr_ORG_SLIP_CD = null;
	/** æ 499 ÏF m_upTshipOdr_SHIP_ODR_NO */
	public String m_upTshipOdr_SHIP_ODR_NO = null;
	/** æ 500 ÏF m_strTod_OD_NO */
	public String m_strTod_OD_NO = null;
	/** æ 501 ÏF m_strTod_TOTAL_ISSUE_QTY */
	public String m_strTod_TOTAL_ISSUE_QTY = null;
	/** æ 502 ÏF m_strTod_DM_QTY */
	public String m_strTod_DM_QTY = null;
	/** æ 503 ÏF m_strTod_DM_STS_TYP */
	public String m_strTod_DM_STS_TYP = null;
	/** æ 504 ÏF m_inTod_ODR_NO */
	public String m_inTod_ODR_NO = null;
	/** æ 505 ÏF m_inTod_PART_DLV_SEQ_NO */
	public String m_inTod_PART_DLV_SEQ_NO = null;
	/** æ 506 ÏF m_inTod_OD_NO */
	public String m_inTod_OD_NO = null;
	/** æ 507 ÏF m_strTaxTAX_KBN */
	public String m_strTaxTAX_KBN = null;
	/** æ 508 ÏF m_strTaxOLD_TAX_1 */
	public String m_strTaxOLD_TAX_1 = null;
	/** æ 509 ÏF m_strTaxOLD_TAX_2 */
	public String m_strTaxOLD_TAX_2 = null;
	/** æ 510 ÏF m_strTaxOLD_TAX_3 */
	public String m_strTaxOLD_TAX_3 = null;
	/** æ 511 ÏF m_strTaxNEW_TAX_1 */
	public String m_strTaxNEW_TAX_1 = null;
	/** æ 512 ÏF m_strTaxNEW_TAX_2 */
	public String m_strTaxNEW_TAX_2 = null;
	/** æ 513 ÏF m_strTaxNEW_TAX_3 */
	public String m_strTaxNEW_TAX_3 = null;
	/** æ 514 ÏF m_strTaxSTART_DATE */
	public String m_strTaxSTART_DATE = null;
	/** æ 515 ÏF m_strTaxROUND_TYP */
	public String m_strTaxROUND_TYP = null;
	/** æ 516 ÏF m_updiffTAX_CD */
	public String m_updiffTAX_CD = null;
	/** æ 517 ÏF m_upTshipOdr_RETURN_QTY */
	public String m_upTshipOdr_RETURN_QTY = null;
	/** æ 518 ÏF m_chkSLIP_CD */
	public String m_chkSLIP_CD = null;
	/** æ 519 ÏF m_mWh_WH_NAME */
	public String m_mWh_WH_NAME = null;
	/** æ 520 ÏF m_mWh_PLANT_CD */
	public String m_mWh_PLANT_CD = null;
	/** æ 521 ÏF m_mWh_IN_WH_CD */
	public String m_mWh_IN_WH_CD = null;
	/** æ 522 ÏF m_mOrg_ORG_NAME */
	public String m_mOrg_ORG_NAME = null;
	/** æ 523 ÏF m_mOrg_IN_COMPANYCD */
	public String m_mOrg_IN_COMPANYCD = null;
	/** æ 524 ÏF m_mOrg_IN_ORGCD */
	public String m_mOrg_IN_ORGCD = null;
	/** æ 525 ÏF m_serTitemStock_JOB_ODR_CD */
	public String m_serTitemStock_JOB_ODR_CD = null;
	/** æ 526 ÏF m_serTitemStock_IN_JOBODRCD */
	public String m_serTitemStock_IN_JOBODRCD = null;
	/** æ 527 ÏF m_creTitemStock_JOB_ODR_CD */
	public String m_creTitemStock_JOB_ODR_CD = null;
	/** æ 528 ÏF m_upTitemStock_IN_JOBODRCD */
	public String m_upTitemStock_IN_JOBODRCD = null;
	/** æ 529 ÏF m_serTJobOdr_JOB_ODR_CD */
	public String m_serTJobOdr_JOB_ODR_CD = null;
	/** æ 530 ÏF m_serTJobOdr_ITEM_CD */
	public String m_serTJobOdr_ITEM_CD = null;
	/** æ 531 ÏF m_diffSHIP_QTY */
	public String m_diffSHIP_QTY = null;
	/** æ 532 ÏF m_diffSHIP_ODR_AMOUNT */
	public String m_diffSHIP_ODR_AMOUNT = null;
	/** æ 533 ÏF m_diffSHIP_ODR_AMOUNT_EXCH_RATE */
	public String m_diffSHIP_ODR_AMOUNT_EXCH_RATE = null;
	/** æ 534 ÏF m_diffSHIP_ODR_NO */
	public String m_diffSHIP_ODR_NO = null;
	/** æ 535 ÏF m_diffODR_NO */
	public String m_diffODR_NO = null;
	/** æ 536 ÏF m_diffPART_DLV_SEQ_NO */
	public String m_diffPART_DLV_SEQ_NO = null;
	/** æ 537 ÏF m_diffSLIP_CD */
	public String m_diffSLIP_CD = null;
	/** æ 538 ÏF m_diffITEM_CD */
	public String m_diffITEM_CD = null;
	/** æ 539 ÏF m_diffJOB_ODR_CD */
	public String m_diffJOB_ODR_CD = null;
	/** æ 540 ÏF m_diffCUST_ITEM_CD */
	public String m_diffCUST_ITEM_CD = null;
	/** æ 541 ÏF m_diffCUST_ODR_NO */
	public String m_diffCUST_ODR_NO = null;
	/** æ 542 ÏF m_diffCUST_CD */
	public String m_diffCUST_CD = null;
	/** æ 543 ÏF m_diffCUST_NAME */
	public String m_diffCUST_NAME = null;
	/** æ 544 ÏF m_diffCUST_CHRG_PSN_CD */
	public String m_diffCUST_CHRG_PSN_CD = null;
	/** æ 545 ÏF m_diffSHIP_ODR_ISS_PSN_CD */
	public String m_diffSHIP_ODR_ISS_PSN_CD = null;
	/** æ 546 ÏF m_diffDLV_LOC_CD */
	public String m_diffDLV_LOC_CD = null;
	/** æ 547 ÏF m_diffDEPO_TYP */
	public String m_diffDEPO_TYP = null;
	/** æ 548 ÏF m_diffDESINATED_SHIP_DATE */
	public String m_diffDESINATED_SHIP_DATE = null;
	/** æ 549 ÏF m_diffSCDL_DLV_DATE */
	public String m_diffSCDL_DLV_DATE = null;
	/** æ 550 ÏF m_diffTOTAL_SHIP_QTY */
	public String m_diffTOTAL_SHIP_QTY = null;
	/** æ 551 ÏF m_diffRETURN_QTY */
	public String m_diffRETURN_QTY = null;
	/** æ 552 ÏF m_diffUNIT_CD */
	public String m_diffUNIT_CD = null;
	/** æ 553 ÏF m_diffUNIT_PRICE */
	public String m_diffUNIT_PRICE = null;
	/** æ 554 ÏF m_diffCURRENCY_CD */
	public String m_diffCURRENCY_CD = null;
	/** æ 555 ÏF m_diffLOC_CD */
	public String m_diffLOC_CD = null;
	/** æ 556 ÏF m_diffPKG_UNIT_QTY */
	public String m_diffPKG_UNIT_QTY = null;
	/** æ 557 ÏF m_diffREMARKS */
	public String m_diffREMARKS = null;
	/** æ 558 ÏF m_diffDLV_KEY_NO */
	public String m_diffDLV_KEY_NO = null;
	/** æ 559 ÏF m_diffPART_DLV_COUNT */
	public String m_diffPART_DLV_COUNT = null;
	/** æ 560 ÏF m_diffTRANSPORT_CD */
	public String m_diffTRANSPORT_CD = null;
	/** æ 561 ÏF m_diffTRANSPORT_TYP */
	public String m_diffTRANSPORT_TYP = null;
	/** æ 562 ÏF m_diffALLCT_WH_CD */
	public String m_diffALLCT_WH_CD = null;
	/** æ 563 ÏF m_diffTRANSFER_WH_CD */
	public String m_diffTRANSFER_WH_CD = null;
	/** æ 564 ÏF m_diffDIRECT_DLV_FLG */
	public String m_diffDIRECT_DLV_FLG = null;
	/** æ 565 ÏF m_diffENTRY_TYP */
	public String m_diffENTRY_TYP = null;
	/** æ 566 ÏF m_diffPRINT_FLG */
	public String m_diffPRINT_FLG = null;
	/** æ 567 ÏF m_diffSHIP_CMPLT_FLG */
	public String m_diffSHIP_CMPLT_FLG = null;
	/** æ 568 ÏF m_diffDEPO_TRANSFER_PROC_FLG */
	public String m_diffDEPO_TRANSFER_PROC_FLG = null;
	/** æ 569 ÏF m_diffDEL_FLG */
	public String m_diffDEL_FLG = null;
	/** æ 570 ÏF m_diffuptOdr_SHIP_CNT */
	public String m_diffuptOdr_SHIP_CNT = null;
	/** æ 571 ÏF m_diffuptOdr_PART_DLV_COUNT */
	public String m_diffuptOdr_PART_DLV_COUNT = null;
	/** æ 572 ÏF m_diffuptOdr_IN_ODRNO */
	public String m_diffuptOdr_IN_ODRNO = null;
	/** æ 573 ÏF m_in_tShipSlip_SLIP_CD */
	public String m_in_tShipSlip_SLIP_CD = null;
	/** æ 574 ÏF m_in_tShipSlip_ITEM_CD */
	public String m_in_tShipSlip_ITEM_CD = null;
	/** æ 575 ÏF m_in_tShipSlip_CUST_ITEM_CD */
	public String m_in_tShipSlip_CUST_ITEM_CD = null;
	/** æ 576 ÏF m_in_tShipSlip_PART_NAME */
	public String m_in_tShipSlip_PART_NAME = null;
	/** æ 577 ÏF m_in_tShipSlip_CUST_ODR_NO */
	public String m_in_tShipSlip_CUST_ODR_NO = null;
	/** æ 578 ÏF m_in_tShipSlip_CUST_CD */
	public String m_in_tShipSlip_CUST_CD = null;
	/** æ 579 ÏF m_in_tShipSlip_CUST_NAME */
	public String m_in_tShipSlip_CUST_NAME = null;
	/** æ 580 ÏF m_in_tShipSlip_DLV_LOC_CD */
	public String m_in_tShipSlip_DLV_LOC_CD = null;
	/** æ 581 ÏF m_in_tShipSlip_DLV_LOC_NAME_KANJI */
	public String m_in_tShipSlip_DLV_LOC_NAME_KANJI = null;
	/** æ 582 ÏF m_in_tShipSlip_CUS_DLV_KEY_CD */
	public String m_in_tShipSlip_CUS_DLV_KEY_CD = null;
	/** æ 583 ÏF m_in_tShipSlip_DESINATED_SHIP_DATE */
	public String m_in_tShipSlip_DESINATED_SHIP_DATE = null;
	/** æ 584 ÏF m_in_tShipSlip_DESINATED_DLV_DATE */
	public String m_in_tShipSlip_DESINATED_DLV_DATE = null;
	/** æ 585 ÏF m_in_tShipSlip_SCDL_DLV_DATE */
	public String m_in_tShipSlip_SCDL_DLV_DATE = null;
	/** æ 586 ÏF m_in_tShipSlip_SHIP_ODR_QTY */
	public String m_in_tShipSlip_SHIP_ODR_QTY = null;
	/** æ 587 ÏF m_in_tShipSlip_UNIT_CD */
	public String m_in_tShipSlip_UNIT_CD = null;
	/** æ 588 ÏF m_in_tShipSlip_UNIT_PRICE */
	public String m_in_tShipSlip_UNIT_PRICE = null;
	/** æ 589 ÏF m_in_tShipSlip_SHIP_ODR_AMOUNT */
	public String m_in_tShipSlip_SHIP_ODR_AMOUNT = null;
	/** æ 590 ÏF m_in_tShipSlip_TAX_AMOUNT */
	public String m_in_tShipSlip_TAX_AMOUNT = null;
	/** æ 591 ÏF m_in_tShipSlip_INSPC_TYP */
	public String m_in_tShipSlip_INSPC_TYP = null;
	/** æ 592 ÏF m_in_tShipSlip_CLIENT_REMARK_KANJI */
	public String m_in_tShipSlip_CLIENT_REMARK_KANJI = null;
	/** æ 593 ÏF m_in_tShipSlip_CLIENT_BARCODE_INF */
	public String m_in_tShipSlip_CLIENT_BARCODE_INF = null;
	/** æ 594 ÏF m_in_tShipSlip_PRINT_FLG */
	public String m_in_tShipSlip_PRINT_FLG = null;
	/** æ 595 ÏF m_in_tShipSlip_DEL_FLG */
	public String m_in_tShipSlip_DEL_FLG = null;
	/** æ 596 ÏF m_in_tShipSlip_BUYER_NAME */
	public String m_in_tShipSlip_BUYER_NAME = null;
	/** æ 597 ÏF m_in_tShipSlip_PUCH_ODR_QTY_TOTAL */
	public String m_in_tShipSlip_PUCH_ODR_QTY_TOTAL = null;
	/** æ 598 ÏF m_in_tShipSlip_DLV_ODR_QTY */
	public String m_in_tShipSlip_DLV_ODR_QTY = null;
	/** æ 599 ÏF m_in_tShipSlip_SHIP_ODR_AMOUNT_TAX */
	public String m_in_tShipSlip_SHIP_ODR_AMOUNT_TAX = null;
	/** æ 600 ÏF m_in_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT */
	public String m_in_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT = null;
	/** æ 601 ÏF m_in_tShipSlip_INTERNAL_TAX_SALES_AMOUNT */
	public String m_in_tShipSlip_INTERNAL_TAX_SALES_AMOUNT = null;
	/** æ 602 ÏF m_in_tShipSlip_TAXFREE_SALES_AMOUNT */
	public String m_in_tShipSlip_TAXFREE_SALES_AMOUNT = null;
	/** æ 603 ÏF m_in_tShipSlip_TAX_CREDIT_SALES_AMOUNT */
	public String m_in_tShipSlip_TAX_CREDIT_SALES_AMOUNT = null;
	/** æ 604 ÏF m_in_tShipSlip_EXTERNAL_TAX_AMOUNT */
	public String m_in_tShipSlip_EXTERNAL_TAX_AMOUNT = null;
	/** æ 605 ÏF m_in_tShipSlip_INTERNAL_TAX_AMOUNT */
	public String m_in_tShipSlip_INTERNAL_TAX_AMOUNT = null;
	/** æ 606 ÏF m_in_tShipSlip_TAX_AMOUNT_1 */
	public String m_in_tShipSlip_TAX_AMOUNT_1 = null;
	/** æ 607 ÏF m_in_tShipSlip_TAX_AMOUNT_2 */
	public String m_in_tShipSlip_TAX_AMOUNT_2 = null;
	/** æ 608 ÏF m_in_tShipSlip_TAX_AMOUNT_3 */
	public String m_in_tShipSlip_TAX_AMOUNT_3 = null;
	/** æ 609 ÏF m_in_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT */
	public String m_in_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;
	/** æ 610 ÏF m_up_tShipSlip_SLIP_CD */
	public String m_up_tShipSlip_SLIP_CD = null;
	/** æ 611 ÏF m_updiffSHIP_ODR_QTY */
	public String m_updiffSHIP_ODR_QTY = null;
	/** æ 612 ÏF m_updiffSHIP_ODR_AMOUNT */
	public String m_updiffSHIP_ODR_AMOUNT = null;
	/** æ 613 ÏF m_updiffTAX_AMOUNT */
	public String m_updiffTAX_AMOUNT = null;
	/** æ 614 ÏF m_updiffSHIP_ODR_AMOUNT_TAX */
	public String m_updiffSHIP_ODR_AMOUNT_TAX = null;
	/** æ 615 ÏF m_updiffEXTERNAL_TAX_SALES_AMOUNT */
	public String m_updiffEXTERNAL_TAX_SALES_AMOUNT = null;
	/** æ 616 ÏF m_updiffINTERNAL_TAX_SALES_AMOUNT */
	public String m_updiffINTERNAL_TAX_SALES_AMOUNT = null;
	/** æ 617 ÏF m_updiffTAXFREE_SALES_AMOUNT */
	public String m_updiffTAXFREE_SALES_AMOUNT = null;
	/** æ 618 ÏF m_updiffTAX_CREDIT_SALES_AMOUNT */
	public String m_updiffTAX_CREDIT_SALES_AMOUNT = null;
	/** æ 619 ÏF m_updiffEXTERNAL_TAX_AMOUNT */
	public String m_updiffEXTERNAL_TAX_AMOUNT = null;
	/** æ 620 ÏF m_updiffINTERNAL_TAX_AMOUNT */
	public String m_updiffINTERNAL_TAX_AMOUNT = null;
	/** æ 621 ÏF m_updiffTAX_AMOUNT_1 */
	public String m_updiffTAX_AMOUNT_1 = null;
	/** æ 622 ÏF m_updiffTAX_AMOUNT_2 */
	public String m_updiffTAX_AMOUNT_2 = null;
	/** æ 623 ÏF m_updiffTAX_AMOUNT_3 */
	public String m_updiffTAX_AMOUNT_3 = null;
	/** æ 624 ÏF m_updiffOWN_CUR_TAXCREDIT_SALES_AMOUNT */
	public String m_updiffOWN_CUR_TAXCREDIT_SALES_AMOUNT = null;
	/** æ 625 ÏF m_updiffSLIP_CD */
	public String m_updiffSLIP_CD = null;
	/** æ 626 ÏF m_PAST_RESULT_ENTRY_TYP */
	public String m_PAST_RESULT_ENTRY_TYP = null;
	/** æ 627 ÏF m_PROC_EXEC_DATE */
	public BigDecimal m_PROC_EXEC_DATE = null;
	/** æ 628 ÏF m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** æ 629 ÏF m_mCustBase_TRANSPORT_LT */
	public String m_mCustBase_TRANSPORT_LT = null;
	/** æ 630 ÏF m_mCustBase_IN_COMPANYCD */
	public String m_mCustBase_IN_COMPANYCD = null;
	/** æ 631 ÏF m_mCustBase_IN_CUSTCD */
	public String m_mCustBase_IN_CUSTCD = null;
	/** æ 632 ÏF m_mCustBase_IN_DLVLOCCD */
	public String m_mCustBase_IN_DLVLOCCD = null;
	/** æ 633 ÏF m_strSYUKA_LT */
	public String m_strSYUKA_LT = null;
	/** æ 634 ÏF m_strTaxIN_COMPANYCD */
	public String m_strTaxIN_COMPANYCD = null;
	/** æ 635 ÏF m_strTaxIN_CUSTCD */
	public String m_strTaxIN_CUSTCD = null;
	/** æ 636 ÏF m_g_CUST_ITEM_CD */
	public String m_g_CUST_ITEM_CD = null;
	/** æ 637 ÏF m_strT_ODR_TAX */
	public String m_strT_ODR_TAX = null;
	/** æ 638 ÏF m_g_SLIP_CD */
	public String m_g_SLIP_CD = null;
	/** æ 639 ÏF m_getTship_SHIP_SEQ_NO */
	public String m_getTship_SHIP_SEQ_NO = null;
	/** æ 640 ÏF m_chkLOT_NO */
	public String m_chkLOT_NO = null;
	/** æ 641 ÏF m_chkITEM_CD */
	public String m_chkITEM_CD = null;
	/** æ 642 ÏF m_getQtySTOCK_ON_HAND_QTY */
	public String m_getQtySTOCK_ON_HAND_QTY = null;
	/** æ 643 ÏF m_getQtyALCD_QTY */
	public String m_getQtyALCD_QTY = null;
	/** æ 644 ÏF m_getQtyITEM_CD */
	public String m_getQtyITEM_CD = null;
	/** æ 645 ÏF m_getQtyWH_CD */
	public String m_getQtyWH_CD = null;
	/** æ 646 ÏF m_getQtyLOT_NO */
	public String m_getQtyLOT_NO = null;
	/** æ 647 ÏF m_readTlotStock_LOT_NO */
	public String m_readTlotStock_LOT_NO = null;
	/** æ 648 ÏF m_readTlotStock_STOCK_ON_HAND_QTY */
	public String m_readTlotStock_STOCK_ON_HAND_QTY = null;
	/** æ 649 ÏF m_readTlotStock_ALCD_QTY */
	public String m_readTlotStock_ALCD_QTY = null;
	/** æ 650 ÏF m_readTlotStock_IN_ITEM_CD */
	public String m_readTlotStock_IN_ITEM_CD = null;
	/** æ 651 ÏF m_readTlotStock_IN_WH_CD */
	public String m_readTlotStock_IN_WH_CD = null;
	/** æ 652 ÏF m_readTlotStock_IN_LOT_NO */
	public String m_readTlotStock_IN_LOT_NO = null;
	/** æ 653 ÏF m_upTlotStockSTOCK_ON_HAND_QTY */
	public String m_upTlotStockSTOCK_ON_HAND_QTY = null;
	/** æ 654 ÏF m_upTlotStockIN_ITEM_CD */
	public String m_upTlotStockIN_ITEM_CD = null;
	/** æ 655 ÏF m_upTlotStockIN_WH_CD */
	public String m_upTlotStockIN_WH_CD = null;
	/** æ 656 ÏF m_upTlotStockIN_LOT_NO */
	public String m_upTlotStockIN_LOT_NO = null;
	/** æ 657 ÏF m_serLotSTOCK_ON_HAND_QTY */
	public String m_serLotSTOCK_ON_HAND_QTY = null;
	/** æ 658 ÏF m_serLotALCD_QTY */
	public String m_serLotALCD_QTY = null;
	/** æ 659 ÏF m_serLotIN_ITEM_CD */
	public String m_serLotIN_ITEM_CD = null;
	/** æ 660 ÏF m_serLotIN_WH_CD */
	public String m_serLotIN_WH_CD = null;
	/** æ 661 ÏF m_serLotIN_LOT_NO */
	public String m_serLotIN_LOT_NO = null;
	/** æ 662 ÏF m_insertLotStock_ITEM_CD */
	public String m_insertLotStock_ITEM_CD = null;
	/** æ 663 ÏF m_insertLotStock_WH_CD */
	public String m_insertLotStock_WH_CD = null;
	/** æ 664 ÏF m_insertLotStock_LOT_CD */
	public String m_insertLotStock_LOT_CD = null;
	/** æ 665 ÏF m_insertLotStock_PLANT_CD */
	public String m_insertLotStock_PLANT_CD = null;
	/** æ 666 ÏF m_insertLotStock_STOCK_ON_HAND_QTY */
	public String m_insertLotStock_STOCK_ON_HAND_QTY = null;
	/** æ 667 ÏF m_insertLotStock_DEFECT_QTY */
	public String m_insertLotStock_DEFECT_QTY = null;
	/** æ 668 ÏF m_insertLotStock_ALCD_QTY */
	public String m_insertLotStock_ALCD_QTY = null;
	/** æ 669 ÏF m_insTshipInst_SHIP_SEQ_NO */
	public String m_insTshipInst_SHIP_SEQ_NO = null;
	/** æ 670 ÏF m_insTshipInst_SHIP_ODR_NO */
	public String m_insTshipInst_SHIP_ODR_NO = null;
	/** æ 671 ÏF m_insTshipInst_LOT_NO */
	public String m_insTshipInst_LOT_NO = null;
	/** æ 672 ÏF m_insTshipInst_ITEM_CD */
	public String m_insTshipInst_ITEM_CD = null;
	/** æ 673 ÏF m_insTshipInst_WH_CD */
	public String m_insTshipInst_WH_CD = null;
	/** æ 674 ÏF m_insTshipInst_ODR_NO */
	public String m_insTshipInst_ODR_NO = null;
	/** æ 675 ÏF m_insTshipInst_SLIP_CD */
	public String m_insTshipInst_SLIP_CD = null;
	/** æ 676 ÏF m_insTshipInst_SHIP_QTY */
	public String m_insTshipInst_SHIP_QTY = null;
	/** æ 677 ÏF m_insTshipInst_SHIP_DATE */
	public String m_insTshipInst_SHIP_DATE = null;
	/** æ 678 ÏF m_delTshipInstIN_SHIP_SEQ_NO */
	public String m_delTshipInstIN_SHIP_SEQ_NO = null;
	/** æ 679 ÏF m_delTshipInstIN_LOT_NO */
	public String m_delTshipInstIN_LOT_NO = null;
	/** æ 680 ÏF m_tlotTrace_FROM_ITEM_CD */
	public String m_tlotTrace_FROM_ITEM_CD = null;
	/** æ 681 ÏF m_tlotTrace_FROM_LOT_NO */
	public String m_tlotTrace_FROM_LOT_NO = null;
	/** æ 682 ÏF m_tlotTrace_TO_ITEM_CD */
	public String m_tlotTrace_TO_ITEM_CD = null;
	/** æ 683 ÏF m_tlotTrace_TO_LOT_NO */
	public String m_tlotTrace_TO_LOT_NO = null;
	/** æ 684 ÏF m_tlotTrace_LOT_TRACE_TYP */
	public String m_tlotTrace_LOT_TRACE_TYP = null;
	/** æ 685 ÏF m_tlotTrace_CUST_ODR_NO */
	public String m_tlotTrace_CUST_ODR_NO = null;
	/** æ 686 ÏF m_tlotTrace_SLIP_CD */
	public String m_tlotTrace_SLIP_CD = null;
	/** æ 687 ÏF m_tlotTrace_ODR_NO */
	public String m_tlotTrace_ODR_NO = null;
	/** æ 688 ÏF m_readTshipInst_LOT_NO */
	public String m_readTshipInst_LOT_NO = null;
	/** æ 689 ÏF m_readTshipInst_SHIP_QTY */
	public String m_readTshipInst_SHIP_QTY = null;
	/** æ 690 ÏF m_readTshipInst_SHIP_ODR_NO */
	public String m_readTshipInst_SHIP_ODR_NO = null;
	/** æ 691 ÏF m_readTshipInst_ITEM_CD */
	public String m_readTshipInst_ITEM_CD = null;
	/** æ 692 ÏF m_readTshipInst_WH_CD */
	public String m_readTshipInst_WH_CD = null;
	/** æ 693 ÏF m_readTshipInst_ODR_NO */
	public String m_readTshipInst_ODR_NO = null;
	/** æ 694 ÏF m_readTshipInst_SLIP_CD */
	public String m_readTshipInst_SLIP_CD = null;
	/** æ 695 ÏF m_readTshipInst_SHIP_DATE */
	public String m_readTshipInst_SHIP_DATE = null;
	/** æ 696 ÏF m_readTshipInst_IN_SHIP_SEQ_NO */
	public String m_readTshipInst_IN_SHIP_SEQ_NO = null;
	/** æ 697 ÏF m_readTshipInst_IN_LOT_NO */
	public String m_readTshipInst_IN_LOT_NO = null;
	/** æ 698 ÏF m_readT_Ship_Inst_Lot_NO */
	public String m_readT_Ship_Inst_Lot_NO = null;
	/** æ 699 ÏF m_readT_Ship_Inst_Ship_Seq_NO */
	public String m_readT_Ship_Inst_Ship_Seq_NO = null;
	/** æ 700 ÏF m_strOdrCurrncyCd */
	public String m_strOdrCurrncyCd = null;
	/** æ 701 ÏF m_strExchTyp */
	public String m_strExchTyp = null;
	/** æ 702 ÏF m_g_DATE */
	public String m_g_DATE = null;
	/** æ 703 ÏF m_selTShipOdr_MODIFY_COUNT */
	public String m_selTShipOdr_MODIFY_COUNT = null;
	/** æ 704 ÏF m_SEL_MODIFY_COUNT */
	public String m_SEL_MODIFY_COUNT = null;

	// List^oÏè`

	/** æ 1 ListÏF l_k_MODE */
	public List l_k_MODE = null;

	/** æ 2 ListÏF l_h_RESULT */
	public List l_h_RESULT = null;

	/** æ 3 ListÏF l_r_SEL_PTN */
	public List l_r_SEL_PTN = null;

	/** æ 4 ListÏF l_g_DESINATED_SHIP_DATE */
	public List l_g_DESINATED_SHIP_DATE = null;

	/** æ 5 ListÏF l_g_SHIP_QTY */
	public List l_g_SHIP_QTY = null;

	/** æ 6 ListÏF l_g_SHIP_QTY2 */
	public List l_g_SHIP_QTY2 = null;

	/** æ 7 ListÏF l_g_UNIT_PRICE */
	public List l_g_UNIT_PRICE = null;

	/** æ 8 ListÏF l_g_CURRNCY */
	public List l_g_CURRNCY = null;

	/** æ 9 ListÏF l_g_SHIP_ODR_AMOUNT */
	public List l_g_SHIP_ODR_AMOUNT = null;

	/** æ 10 ListÏF l_g_WH_CD */
	public List l_g_WH_CD = null;

	/** æ 11 ListÏF l_g_REMARKS */
	public List l_g_REMARKS = null;

	/** æ 12 ListÏF l_g_CUST_ANAME */
	public List l_g_CUST_ANAME = null;

	/** æ 13 ListÏF l_g_ITEM_CD */
	public List l_g_ITEM_CD = null;

	/** æ 14 ListÏF l_h_AP_SECRTY_TYP */
	public List l_h_AP_SECRTY_TYP = null;

	/** æ 15 ListÏF l_h_SHIP_QTY */
	public List l_h_SHIP_QTY = null;

	/** æ 16 ListÏF l_h_ITEM_CD */
	public List l_h_ITEM_CD = null;

	/** æ 17 ListÏF l_h_GYOMU_DATE */
	public List l_h_GYOMU_DATE = null;

	/** æ 18 ListÏF l_h_EXCH_TYP */
	public List l_h_EXCH_TYP = null;

	/** æ 19 ListÏF l_h_MODFIY_CNT */
	public List l_h_MODFIY_CNT = null;

	/** æ 20 ListÏF l_h_TOTAL_SHIP_QTY */
	public List l_h_TOTAL_SHIP_QTY = null;

	/** æ 21 ListÏF l_m_selRadio */
	public List l_m_selRadio = null;

	/** æ 22 ListÏF l_r_SEL_PTN1 */
	public List l_r_SEL_PTN1 = null;

	/** æ 23 ListÏF l_r_SEL_PTN2 */
	public List l_r_SEL_PTN2 = null;

	/** æ 24 ListÏF l_r_SEL_PTN3 */
	public List l_r_SEL_PTN3 = null;

	/** æ 25 ListÏF l_h_SELECT_FG */
	public List l_h_SELECT_FG = null;

	/** æ 26 ListÏF l_h_UNIT_PRICE */
	public List l_h_UNIT_PRICE = null;

	/** æ 27 ListÏF l_g_STOCK_UNIT */
	public List l_g_STOCK_UNIT = null;

	/** æ 28 ListÏF l_g_STOCK_UNIT2 */
	public List l_g_STOCK_UNIT2 = null;

	/** æ 29 ListÏF l_g_CUR_UNIT2 */
	public List l_g_CUR_UNIT2 = null;

	/** æ 30 ListÏF l_g_WH_NAME */
	public List l_g_WH_NAME = null;

	/** æ 31 ListÏF l_g_SALES_DEPT_CD */
	public List l_g_SALES_DEPT_CD = null;

	/** æ 32 ListÏF l_g_ORG_NAME */
	public List l_g_ORG_NAME = null;

	/** æ 33 ListÏF l_g_CUST_CD */
	public List l_g_CUST_CD = null;

	/** æ 34 ListÏF l_g_CUST_ITEM_NAME */
	public List l_g_CUST_ITEM_NAME = null;

	/** æ 35 ListÏF l_g_ITEM_NAME */
	public List l_g_ITEM_NAME = null;

	/** æ 36 ListÏF l_g_CUST_ODR_NO */
	public List l_g_CUST_ODR_NO = null;

	/** æ 37 ListÏF l_g_ODR_NO */
	public List l_g_ODR_NO = null;

	/** æ 38 ListÏF l_g_PART_DLV_SEQ_NO */
	public List l_g_PART_DLV_SEQ_NO = null;

	/** æ 39 ListÏF l_g_SHIP_ODR_NO */
	public List l_g_SHIP_ODR_NO = null;

	/** æ 40 ListÏF l_h_DATE */
	public List l_h_DATE = null;

	/** æ 41 ListÏF l_g_JOB_ODR_CD */
	public List l_g_JOB_ODR_CD = null;

	/** æ 42 ListÏF l_c_JOB_ODR_CD */
	public List l_c_JOB_ODR_CD = null;

	/** æ 43 ListÏF l_g_DIRECT_DLV_FLG */
	public List l_g_DIRECT_DLV_FLG = null;

	/** æ 44 ListÏF l_g_STOCK_LOT_CD */
	public List l_g_STOCK_LOT_CD = null;

	/** æ 45 ListÏF l_h_STOCK_LOT_CD */
	public List l_h_STOCK_LOT_CD = null;

	/** æ 46 ListÏF l_param1 */
	public List l_param1 = null;

	/** æ 47 ListÏF l_param2 */
	public List l_param2 = null;

	/** æ 48 ListÏF l_param3 */
	public List l_param3 = null;

	/** æ 49 ListÏF l_ROUND_TYP */
	public List l_ROUND_TYP = null;

	/** æ 50 ListÏF l_UNIT_QTY_TYP */
	public List l_UNIT_QTY_TYP = null;

	/** æ 51 ListÏF l_UNIT_FIG */
	public List l_UNIT_FIG = null;

	/** æ 52 ListÏF l_strCOMPANY_CD */
	public List l_strCOMPANY_CD = null;

	/** æ 53 ListÏF l_strUSER_NAME */
	public List l_strUSER_NAME = null;

	/** æ 54 ListÏF l_strPLANT_CD */
	public List l_strPLANT_CD = null;

	/** æ 55 ListÏF l_strSECTION_CD */
	public List l_strSECTION_CD = null;

	/** æ 56 ListÏF l_strORG_CD */
	public List l_strORG_CD = null;

	/** æ 57 ListÏF l_strORG_NAME */
	public List l_strORG_NAME = null;

	/** æ 58 ListÏF l_strORG_ANAME */
	public List l_strORG_ANAME = null;

	/** æ 59 ListÏF l_strPLANT_NAME */
	public List l_strPLANT_NAME = null;

	/** æ 60 ListÏF l_strPLANT_ANAME */
	public List l_strPLANT_ANAME = null;

	/** æ 61 ListÏF l_strCAL_NO */
	public List l_strCAL_NO = null;

	/** æ 62 ListÏF l_strUSER_CD */
	public List l_strUSER_CD = null;

	/** æ 63 ListÏF l_strBUSINESS_OPR_DATE */
	public List l_strBUSINESS_OPR_DATE = null;

	/** æ 64 ListÏF l_serTori_SHIP_SEQ_NO */
	public List l_serTori_SHIP_SEQ_NO = null;

	/** æ 65 ListÏF l_serTori_SHIP_ODR_NO */
	public List l_serTori_SHIP_ODR_NO = null;

	/** æ 66 ListÏF l_serTori_SLIP_CD */
	public List l_serTori_SLIP_CD = null;

	/** æ 67 ListÏF l_serTori_ODR_NO */
	public List l_serTori_ODR_NO = null;

	/** æ 68 ListÏF l_serTori_PART_DLV_SEQ_NO */
	public List l_serTori_PART_DLV_SEQ_NO = null;

	/** æ 69 ListÏF l_serTori_ORGNAL_SLIP_CD */
	public List l_serTori_ORGNAL_SLIP_CD = null;

	/** æ 70 ListÏF l_serTori_SLIP_TRN_CD */
	public List l_serTori_SLIP_TRN_CD = null;

	/** æ 71 ListÏF l_serTori_ITEM_CD */
	public List l_serTori_ITEM_CD = null;

	/** æ 72 ListÏF l_serTori_JOB_ODR_CD */
	public List l_serTori_JOB_ODR_CD = null;

	/** æ 73 ListÏF l_serTori_CUST_ITEM_CD */
	public List l_serTori_CUST_ITEM_CD = null;

	/** æ 74 ListÏF l_serTori_CUST_ODR_NO */
	public List l_serTori_CUST_ODR_NO = null;

	/** æ 75 ListÏF l_serTori_CUST_CD */
	public List l_serTori_CUST_CD = null;

	/** æ 76 ListÏF l_serTori_CUST_NAME */
	public List l_serTori_CUST_NAME = null;

	/** æ 77 ListÏF l_serTori_CUST_CHRG_PSN_CD */
	public List l_serTori_CUST_CHRG_PSN_CD = null;

	/** æ 78 ListÏF l_serTori_SHIP_ODR_ISS_PSN_CD */
	public List l_serTori_SHIP_ODR_ISS_PSN_CD = null;

	/** æ 79 ListÏF l_serTori_DLV_LOC_CD */
	public List l_serTori_DLV_LOC_CD = null;

	/** æ 80 ListÏF l_serTori_DEPO_TYP */
	public List l_serTori_DEPO_TYP = null;

	/** æ 81 ListÏF l_serTori_ALLCT_WH_CD */
	public List l_serTori_ALLCT_WH_CD = null;

	/** æ 82 ListÏF l_serTori_DEPO_WH_CD */
	public List l_serTori_DEPO_WH_CD = null;

	/** æ 83 ListÏF l_serTori_LOC_CD */
	public List l_serTori_LOC_CD = null;

	/** æ 84 ListÏF l_serTori_SHIP_DATE */
	public List l_serTori_SHIP_DATE = null;

	/** æ 85 ListÏF l_serTori_SHIP_QTY */
	public List l_serTori_SHIP_QTY = null;

	/** æ 86 ListÏF l_serTori_UNIT_CD */
	public List l_serTori_UNIT_CD = null;

	/** æ 87 ListÏF l_serTori_SHIP_UNIT_PRICE */
	public List l_serTori_SHIP_UNIT_PRICE = null;

	/** æ 88 ListÏF l_serTori_SHIP_ODR_AMOUNT */
	public List l_serTori_SHIP_ODR_AMOUNT = null;

	/** æ 89 ListÏF l_serTori_SHIP_ODR_AMOUNT_EXCH_RATES */
	public List l_serTori_SHIP_ODR_AMOUNT_EXCH_RATES = null;

	/** æ 90 ListÏF l_serTori_CURRNCY_CD */
	public List l_serTori_CURRNCY_CD = null;

	/** æ 91 ListÏF l_serTori_DIRECT_DLV_FLG */
	public List l_serTori_DIRECT_DLV_FLG = null;

	/** æ 92 ListÏF l_serTori_SHIP_INFO_IF_CTRL_NO */
	public List l_serTori_SHIP_INFO_IF_CTRL_NO = null;

	/** æ 93 ListÏF l_serTori_INSPC_ACPT_INFO_IF_CTRL_NO */
	public List l_serTori_INSPC_ACPT_INFO_IF_CTRL_NO = null;

	/** æ 94 ListÏF l_serTori_DLV_KEY_NO */
	public List l_serTori_DLV_KEY_NO = null;

	/** æ 95 ListÏF l_serTori_DEL_FLG */
	public List l_serTori_DEL_FLG = null;

	/** æ 96 ListÏF l_serTori_CUR_NAME */
	public List l_serTori_CUR_NAME = null;

	/** æ 97 ListÏF l_serTori_EXCH_TYP */
	public List l_serTori_EXCH_TYP = null;

	/** æ 98 ListÏF l_serTori_MODIFY_COUNT */
	public List l_serTori_MODIFY_COUNT = null;

	/** æ 99 ListÏF l_serTori_RETURN_QTY */
	public List l_serTori_RETURN_QTY = null;

	/** æ 100 ListÏF l_serTori_TOTAL_SHIP_QTY */
	public List l_serTori_TOTAL_SHIP_QTY = null;

	/** æ 101 ListÏF l_serTori_STATUS */
	public List l_serTori_STATUS = null;

	/** æ 102 ListÏF l_serTori_INSPC_ACPT_TYP */
	public List l_serTori_INSPC_ACPT_TYP = null;

	/** æ 103 ListÏF l_serToriSALES_DEPT_CD */
	public List l_serToriSALES_DEPT_CD = null;

	/** æ 104 ListÏF l_serToriSALES_DATE */
	public List l_serToriSALES_DATE = null;

	/** æ 105 ListÏF l_h_MRP_ODR_TYP */
	public List l_h_MRP_ODR_TYP = null;

	/** æ 106 ListÏF l_h_LOT_CTRL_FLG */
	public List l_h_LOT_CTRL_FLG = null;

	/** æ 107 ListÏF l_serTodrMODIFY_COUNT */
	public List l_serTodrMODIFY_COUNT = null;

	/** æ 108 ListÏF l_serTori_IN_SLIPCD */
	public List l_serTori_IN_SLIPCD = null;

	/** æ 109 ListÏF l_creTship_SHIP_SEQ_NO */
	public List l_creTship_SHIP_SEQ_NO = null;

	/** æ 110 ListÏF l_creTship_SHIP_ODR_NO */
	public List l_creTship_SHIP_ODR_NO = null;

	/** æ 111 ListÏF l_creTship_SLIP_CD */
	public List l_creTship_SLIP_CD = null;

	/** æ 112 ListÏF l_creTship_ODR_NO */
	public List l_creTship_ODR_NO = null;

	/** æ 113 ListÏF l_creTship_PART_DLV_SEQ_NO */
	public List l_creTship_PART_DLV_SEQ_NO = null;

	/** æ 114 ListÏF l_creTship_ORGNAL_SLIP_CD */
	public List l_creTship_ORGNAL_SLIP_CD = null;

	/** æ 115 ListÏF l_creTship_SLIP_TRN_CD */
	public List l_creTship_SLIP_TRN_CD = null;

	/** æ 116 ListÏF l_creTship_ITEM_CD */
	public List l_creTship_ITEM_CD = null;

	/** æ 117 ListÏF l_creTship_JOB_ODR_CD */
	public List l_creTship_JOB_ODR_CD = null;

	/** æ 118 ListÏF l_creTship_CUST_ITEM_CD */
	public List l_creTship_CUST_ITEM_CD = null;

	/** æ 119 ListÏF l_creTship_CUST_ODR_NO */
	public List l_creTship_CUST_ODR_NO = null;

	/** æ 120 ListÏF l_creTship_CUST_CD */
	public List l_creTship_CUST_CD = null;

	/** æ 121 ListÏF l_creTship_CUST_NAME */
	public List l_creTship_CUST_NAME = null;

	/** æ 122 ListÏF l_creTship_CUST_CHRG_PSN_CD */
	public List l_creTship_CUST_CHRG_PSN_CD = null;

	/** æ 123 ListÏF l_creTship_SHIP_ODR_ISS_PSN_CD */
	public List l_creTship_SHIP_ODR_ISS_PSN_CD = null;

	/** æ 124 ListÏF l_creTship_DLV_LOC_CD */
	public List l_creTship_DLV_LOC_CD = null;

	/** æ 125 ListÏF l_creTship_DEPO_TYP */
	public List l_creTship_DEPO_TYP = null;

	/** æ 126 ListÏF l_creTship_ALLCT_WH_CD */
	public List l_creTship_ALLCT_WH_CD = null;

	/** æ 127 ListÏF l_creTship_DEPO_WH_CD */
	public List l_creTship_DEPO_WH_CD = null;

	/** æ 128 ListÏF l_creTship_LOC_CD */
	public List l_creTship_LOC_CD = null;

	/** æ 129 ListÏF l_creTship_SHIP_DATE */
	public List l_creTship_SHIP_DATE = null;

	/** æ 130 ListÏF l_creTship_SHIP_QTY */
	public List l_creTship_SHIP_QTY = null;

	/** æ 131 ListÏF l_creTship_UNIT_CD */
	public List l_creTship_UNIT_CD = null;

	/** æ 132 ListÏF l_creTship_SHIP_UNIT_PRICE */
	public List l_creTship_SHIP_UNIT_PRICE = null;

	/** æ 133 ListÏF l_creTship_SHIP_ODR_AMOUNT */
	public List l_creTship_SHIP_ODR_AMOUNT = null;

	/** æ 134 ListÏF l_creTship_SHIP_ODR_AMOUNT_EXCH_RATES */
	public List l_creTship_SHIP_ODR_AMOUNT_EXCH_RATES = null;

	/** æ 135 ListÏF l_creTship_CURRNCY_CD */
	public List l_creTship_CURRNCY_CD = null;

	/** æ 136 ListÏF l_creTship_DIRECT_DLV_FLG */
	public List l_creTship_DIRECT_DLV_FLG = null;

	/** æ 137 ListÏF l_creTship_DLV_KEY_NO */
	public List l_creTship_DLV_KEY_NO = null;

	/** æ 138 ListÏF l_creTship_REMARKS */
	public List l_creTship_REMARKS = null;

	/** æ 139 ListÏF l_creTship_DEL_FLG */
	public List l_creTship_DEL_FLG = null;

	/** æ 140 ListÏF l_updTship_SHIP_SEQ_NO */
	public List l_updTship_SHIP_SEQ_NO = null;

	/** æ 141 ListÏF l_serInsert_SHIP_ODR_NO */
	public List l_serInsert_SHIP_ODR_NO = null;

	/** æ 142 ListÏF l_serInsert_ODR_NO */
	public List l_serInsert_ODR_NO = null;

	/** æ 143 ListÏF l_serInsert_PART_DLV_SEQ_NO */
	public List l_serInsert_PART_DLV_SEQ_NO = null;

	/** æ 144 ListÏF l_serInsert_SLIP_CD */
	public List l_serInsert_SLIP_CD = null;

	/** æ 145 ListÏF l_serInsert_ITEM_CD */
	public List l_serInsert_ITEM_CD = null;

	/** æ 146 ListÏF l_serInsert_JOB_ODR_CD */
	public List l_serInsert_JOB_ODR_CD = null;

	/** æ 147 ListÏF l_serInsert_CUST_ITEM_CD */
	public List l_serInsert_CUST_ITEM_CD = null;

	/** æ 148 ListÏF l_serInsert_CUST_ODR_NO */
	public List l_serInsert_CUST_ODR_NO = null;

	/** æ 149 ListÏF l_serInsert_CUST_CD */
	public List l_serInsert_CUST_CD = null;

	/** æ 150 ListÏF l_serInsert_CUST_NAME */
	public List l_serInsert_CUST_NAME = null;

	/** æ 151 ListÏF l_serInsert_CUST_CHRG_PSN_CD */
	public List l_serInsert_CUST_CHRG_PSN_CD = null;

	/** æ 152 ListÏF l_serInsert_SHIP_ODR_ISS_PSN_CD */
	public List l_serInsert_SHIP_ODR_ISS_PSN_CD = null;

	/** æ 153 ListÏF l_serInsert_DLV_LOC_CD */
	public List l_serInsert_DLV_LOC_CD = null;

	/** æ 154 ListÏF l_serInsert_DEPO_TYP */
	public List l_serInsert_DEPO_TYP = null;

	/** æ 155 ListÏF l_serInsert_DESINATED_SHIP_DATE */
	public List l_serInsert_DESINATED_SHIP_DATE = null;

	/** æ 156 ListÏF l_serInsert_SHIP_QTY */
	public List l_serInsert_SHIP_QTY = null;

	/** æ 157 ListÏF l_serInsert_TOTAL_SHIP_QTY */
	public List l_serInsert_TOTAL_SHIP_QTY = null;

	/** æ 158 ListÏF l_serInsert_UNIT_CD */
	public List l_serInsert_UNIT_CD = null;

	/** æ 159 ListÏF l_serInsert_UNIT_PRICE */
	public List l_serInsert_UNIT_PRICE = null;

	/** æ 160 ListÏF l_serInsert_SHIP_ODR_AMOUNT */
	public List l_serInsert_SHIP_ODR_AMOUNT = null;

	/** æ 161 ListÏF l_serInsert_SHIP_ODR_AMOUNT_EXCH_RATES */
	public List l_serInsert_SHIP_ODR_AMOUNT_EXCH_RATES = null;

	/** æ 162 ListÏF l_serInsert_CURRNCY_CD */
	public List l_serInsert_CURRNCY_CD = null;

	/** æ 163 ListÏF l_serInsert_LOC_CD */
	public List l_serInsert_LOC_CD = null;

	/** æ 164 ListÏF l_serInsert_PKG_UNIT_QTY */
	public List l_serInsert_PKG_UNIT_QTY = null;

	/** æ 165 ListÏF l_serInsert_REMARKS */
	public List l_serInsert_REMARKS = null;

	/** æ 166 ListÏF l_serInsert_TRANSPORT_CD */
	public List l_serInsert_TRANSPORT_CD = null;

	/** æ 167 ListÏF l_serInsert_TRANSPORT_TYP */
	public List l_serInsert_TRANSPORT_TYP = null;

	/** æ 168 ListÏF l_serInsert_ALLCT_WH_CD */
	public List l_serInsert_ALLCT_WH_CD = null;

	/** æ 169 ListÏF l_serInsert_TRANSFER_WH_CD */
	public List l_serInsert_TRANSFER_WH_CD = null;

	/** æ 170 ListÏF l_serInsert_DIRECT_DLV_FLG */
	public List l_serInsert_DIRECT_DLV_FLG = null;

	/** æ 171 ListÏF l_serInsert_ENTRY_TYP */
	public List l_serInsert_ENTRY_TYP = null;

	/** æ 172 ListÏF l_serInsert_PRINT_FLG */
	public List l_serInsert_PRINT_FLG = null;

	/** æ 173 ListÏF l_serInsert_SHP_CMPLT_FLG */
	public List l_serInsert_SHP_CMPLT_FLG = null;

	/** æ 174 ListÏF l_serInsert_DEPO_TRANSFER_PROC_FLG */
	public List l_serInsert_DEPO_TRANSFER_PROC_FLG = null;

	/** æ 175 ListÏF l_serInsert_DEL_FLG */
	public List l_serInsert_DEL_FLG = null;

	/** æ 176 ListÏF l_serInsert_CUR_CD */
	public List l_serInsert_CUR_CD = null;

	/** æ 177 ListÏF l_serInsert_CUR_NAME */
	public List l_serInsert_CUR_NAME = null;

	/** æ 178 ListÏF l_serInsert_EXCH_TYP */
	public List l_serInsert_EXCH_TYP = null;

	/** æ 179 ListÏF l_serInsert_SPCL_PRICE_TYP */
	public List l_serInsert_SPCL_PRICE_TYP = null;

	/** æ 180 ListÏF l_serInsert_MODIFY_COUNT */
	public List l_serInsert_MODIFY_COUNT = null;

	/** æ 181 ListÏF l_serInsert_SCDL_DLV_DATE */
	public List l_serInsert_SCDL_DLV_DATE = null;

	/** æ 182 ListÏF l_serInsert_DLV_KEY_NO */
	public List l_serInsert_DLV_KEY_NO = null;

	/** æ 183 ListÏF l_h_RETURN_QTY */
	public List l_h_RETURN_QTY = null;

	/** æ 184 ListÏF l_serInsert_ODR_ACPT_DATE */
	public List l_serInsert_ODR_ACPT_DATE = null;

	/** æ 185 ListÏF l_h_JOB_ODR_CD */
	public List l_h_JOB_ODR_CD = null;

	/** æ 186 ListÏF l_selMODIFY_COUNT */
	public List l_selMODIFY_COUNT = null;

	/** æ 187 ListÏF l_serInsert_IN_SLIPCD */
	public List l_serInsert_IN_SLIPCD = null;

	/** æ 188 ListÏF l_upTshipOdr_DEPO_TRANSFER_PROC_FLG */
	public List l_upTshipOdr_DEPO_TRANSFER_PROC_FLG = null;

	/** æ 189 ListÏF l_upTshipOdr_IN_SLIPCD */
	public List l_upTshipOdr_IN_SLIPCD = null;

	/** æ 190 ListÏF l_chkisWhCd_WH_CD */
	public List l_chkisWhCd_WH_CD = null;

	/** æ 191 ListÏF l_chkisWhCd_WH_TYP */
	public List l_chkisWhCd_WH_TYP = null;

	/** æ 192 ListÏF l_chkisinWhCd_WH_NAME */
	public List l_chkisinWhCd_WH_NAME = null;

	/** æ 193 ListÏF l_chkisWhCd_IN_WHCD */
	public List l_chkisWhCd_IN_WHCD = null;

	/** æ 194 ListÏF l_chkisWhCd_IN_WHTYP */
	public List l_chkisWhCd_IN_WHTYP = null;

	/** æ 195 ListÏF l_creTsales_SHIP_ODR_NO */
	public List l_creTsales_SHIP_ODR_NO = null;

	/** æ 196 ListÏF l_creTsales_SLIP_CD */
	public List l_creTsales_SLIP_CD = null;

	/** æ 197 ListÏF l_creTsales_SALES_TYP */
	public List l_creTsales_SALES_TYP = null;

	/** æ 198 ListÏF l_creTsales_CUST_CD */
	public List l_creTsales_CUST_CD = null;

	/** æ 199 ListÏF l_creTsales_ITEM_CD */
	public List l_creTsales_ITEM_CD = null;

	/** æ 200 ListÏF l_creTsales_ITEM_NAME */
	public List l_creTsales_ITEM_NAME = null;

	/** æ 201 ListÏF l_creTsales_CUST_ODR_NO */
	public List l_creTsales_CUST_ODR_NO = null;

	/** æ 202 ListÏF l_creTsales_SALES_DATE */
	public List l_creTsales_SALES_DATE = null;

	/** æ 203 ListÏF l_creTsales_SALES_DEPT_CD */
	public List l_creTsales_SALES_DEPT_CD = null;

	/** æ 204 ListÏF l_creTsales_CUST_CHRG_PSN_CD */
	public List l_creTsales_CUST_CHRG_PSN_CD = null;

	/** æ 205 ListÏF l_creTsales_ODR_ACPT_PSN_CD */
	public List l_creTsales_ODR_ACPT_PSN_CD = null;

	/** æ 206 ListÏF l_creTsales_SALES_QTY */
	public List l_creTsales_SALES_QTY = null;

	/** æ 207 ListÏF l_creTsales_SALES_UNIT_PRICE */
	public List l_creTsales_SALES_UNIT_PRICE = null;

	/** æ 208 ListÏF l_creTsales_UNIT_CD */
	public List l_creTsales_UNIT_CD = null;

	/** æ 209 ListÏF l_creTsales_SALES_AMOUNT */
	public List l_creTsales_SALES_AMOUNT = null;

	/** æ 210 ListÏF l_creTsales_SALES_AMOUNT_EXCH_RATES */
	public List l_creTsales_SALES_AMOUNT_EXCH_RATES = null;

	/** æ 211 ListÏF l_creTsales_INSPC_ACPT_DATE */
	public List l_creTsales_INSPC_ACPT_DATE = null;

	/** æ 212 ListÏF l_creTsales_INSPC_ACPT_QTY */
	public List l_creTsales_INSPC_ACPT_QTY = null;

	/** æ 213 ListÏF l_creTsales_EXTERNAL_TAX_SALES_AMOUNT */
	public List l_creTsales_EXTERNAL_TAX_SALES_AMOUNT = null;

	/** æ 214 ListÏF l_creTsales_INTERNAL_TAX_SALES_AMOUNT */
	public List l_creTsales_INTERNAL_TAX_SALES_AMOUNT = null;

	/** æ 215 ListÏF l_creTsales_TAXFREE_SALES_AMOUNT */
	public List l_creTsales_TAXFREE_SALES_AMOUNT = null;

	/** æ 216 ListÏF l_creTsales_TAX_CREDIT_SALES_AMOUNT */
	public List l_creTsales_TAX_CREDIT_SALES_AMOUNT = null;

	/** æ 217 ListÏF l_creTsales_EXTERNAL_TAX_AMOUNT */
	public List l_creTsales_EXTERNAL_TAX_AMOUNT = null;

	/** æ 218 ListÏF l_creTsales_INTERNAL_TAX_AMOUNT */
	public List l_creTsales_INTERNAL_TAX_AMOUNT = null;

	/** æ 219 ListÏF l_creTsales_TAX_AMOUNT_1 */
	public List l_creTsales_TAX_AMOUNT_1 = null;

	/** æ 220 ListÏF l_creTsales_TAX_AMOUNT_2 */
	public List l_creTsales_TAX_AMOUNT_2 = null;

	/** æ 221 ListÏF l_creTsales_TAX_AMOUNT_3 */
	public List l_creTsales_TAX_AMOUNT_3 = null;

	/** æ 222 ListÏF l_creTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT */
	public List l_creTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;

	/** æ 223 ListÏF l_creTsales_ORG_SLIP_CD */
	public List l_creTsales_ORG_SLIP_CD = null;

	/** æ 224 ListÏF l_creTsales_CURRNCY_CD */
	public List l_creTsales_CURRNCY_CD = null;

	/** æ 225 ListÏF l_creTsales_SPCL_PRICE_CO */
	public List l_creTsales_SPCL_PRICE_CO = null;

	/** æ 226 ListÏF l_creTsales_REMARKS */
	public List l_creTsales_REMARKS = null;

	/** æ 227 ListÏF l_creTsales_DEL_FLG */
	public List l_creTsales_DEL_FLG = null;

	/** æ 228 ListÏF l_creTsales_INSPC_ACPT_TYP */
	public List l_creTsales_INSPC_ACPT_TYP = null;

	/** æ 229 ListÏF l_creTsales_STATUS */
	public List l_creTsales_STATUS = null;

	/** æ 230 ListÏF l_creTsales_APPR_FLG */
	public List l_creTsales_APPR_FLG = null;

	/** æ 231 ListÏF l_creTsales_APPR_ID */
	public List l_creTsales_APPR_ID = null;

	/** æ 232 ListÏF l_creTsales_APPR_DATE */
	public List l_creTsales_APPR_DATE = null;

	/** æ 233 ListÏF l_creTsales_EXCH_RATE */
	public List l_creTsales_EXCH_RATE = null;

	/** æ 234 ListÏF l_serTsales_SALES_SEQ_NO */
	public List l_serTsales_SALES_SEQ_NO = null;

	/** æ 235 ListÏF l_serTsales_SLIP_CD */
	public List l_serTsales_SLIP_CD = null;

	/** æ 236 ListÏF l_serTsales_SALES_TYP */
	public List l_serTsales_SALES_TYP = null;

	/** æ 237 ListÏF l_serTsales_CUST_CD */
	public List l_serTsales_CUST_CD = null;

	/** æ 238 ListÏF l_serTsales_ITEM_CD */
	public List l_serTsales_ITEM_CD = null;

	/** æ 239 ListÏF l_serTsales_ITEM_NAME */
	public List l_serTsales_ITEM_NAME = null;

	/** æ 240 ListÏF l_serTsales_CUST_ODR_NO */
	public List l_serTsales_CUST_ODR_NO = null;

	/** æ 241 ListÏF l_serTsales_SALES_DATE */
	public List l_serTsales_SALES_DATE = null;

	/** æ 242 ListÏF l_serTsales_SALES_DEPT_CD */
	public List l_serTsales_SALES_DEPT_CD = null;

	/** æ 243 ListÏF l_serTsales_CUST_CHRG_PSN_CD */
	public List l_serTsales_CUST_CHRG_PSN_CD = null;

	/** æ 244 ListÏF l_serTsales_ODR_ACPT_PSN_CD */
	public List l_serTsales_ODR_ACPT_PSN_CD = null;

	/** æ 245 ListÏF l_serTsales_SALES_QTY */
	public List l_serTsales_SALES_QTY = null;

	/** æ 246 ListÏF l_serTsales_SALES_UNIT_PRICE */
	public List l_serTsales_SALES_UNIT_PRICE = null;

	/** æ 247 ListÏF l_serTsales_UNIT_CD */
	public List l_serTsales_UNIT_CD = null;

	/** æ 248 ListÏF l_serTsales_SALES_AMOUNT */
	public List l_serTsales_SALES_AMOUNT = null;

	/** æ 249 ListÏF l_serTsales_SALES_AMOUNT_EXCH_RATES */
	public List l_serTsales_SALES_AMOUNT_EXCH_RATES = null;

	/** æ 250 ListÏF l_serTsales_EXTERNAL_TAX_SALES_AMOUNT */
	public List l_serTsales_EXTERNAL_TAX_SALES_AMOUNT = null;

	/** æ 251 ListÏF l_serTsales_INTERNAL_TAX_SALES_AMOUNT */
	public List l_serTsales_INTERNAL_TAX_SALES_AMOUNT = null;

	/** æ 252 ListÏF l_serTsales_TAXFREE_SALES_AMOUNT */
	public List l_serTsales_TAXFREE_SALES_AMOUNT = null;

	/** æ 253 ListÏF l_serTsales_TAX_CREDIT_SALES_AMOUNT */
	public List l_serTsales_TAX_CREDIT_SALES_AMOUNT = null;

	/** æ 254 ListÏF l_serTsales_EXTERNAL_TAX_AMOUNT */
	public List l_serTsales_EXTERNAL_TAX_AMOUNT = null;

	/** æ 255 ListÏF l_serTsales_INTERNAL_TAX_AMOUNT */
	public List l_serTsales_INTERNAL_TAX_AMOUNT = null;

	/** æ 256 ListÏF l_serTsales_TAX_AMOUNT_1 */
	public List l_serTsales_TAX_AMOUNT_1 = null;

	/** æ 257 ListÏF l_serTsales_TAX_AMOUNT_2 */
	public List l_serTsales_TAX_AMOUNT_2 = null;

	/** æ 258 ListÏF l_serTsales_TAX_AMOUNT_3 */
	public List l_serTsales_TAX_AMOUNT_3 = null;

	/** æ 259 ListÏF l_serTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT */
	public List l_serTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;

	/** æ 260 ListÏF l_serTsales_ORG_SLIP_CD */
	public List l_serTsales_ORG_SLIP_CD = null;

	/** æ 261 ListÏF l_serTsales_CURRNCY_CD */
	public List l_serTsales_CURRNCY_CD = null;

	/** æ 262 ListÏF l_serTsales_SPCL_PRICE_CO */
	public List l_serTsales_SPCL_PRICE_CO = null;

	/** æ 263 ListÏF l_serTsales_REMARKS */
	public List l_serTsales_REMARKS = null;

	/** æ 264 ListÏF l_serTsales_DEL_FLG */
	public List l_serTsales_DEL_FLG = null;

	/** æ 265 ListÏF l_serTsales_INSPC_ACPT_TYP */
	public List l_serTsales_INSPC_ACPT_TYP = null;

	/** æ 266 ListÏF l_serTsales_STATUS */
	public List l_serTsales_STATUS = null;

	/** æ 267 ListÏF l_serTsales_PRD_ODR_PLACE_CD */
	public List l_serTsales_PRD_ODR_PLACE_CD = null;

	/** æ 268 ListÏF l_serTsales_EXCH_RATE */
	public List l_serTsales_EXCH_RATE = null;

	/** æ 269 ListÏF l_serTsales_IN_SLIPCD */
	public List l_serTsales_IN_SLIPCD = null;

	/** æ 270 ListÏF l_updTsales_APPR_FLG */
	public List l_updTsales_APPR_FLG = null;

	/** æ 271 ListÏF l_updTsales_APPR_ID */
	public List l_updTsales_APPR_ID = null;

	/** æ 272 ListÏF l_updTsales_APPR_DATE */
	public List l_updTsales_APPR_DATE = null;

	/** æ 273 ListÏF l_updTsales_SALES_SEQ_NO */
	public List l_updTsales_SALES_SEQ_NO = null;

	/** æ 274 ListÏF l_mItem_ITEM_CD */
	public List l_mItem_ITEM_CD = null;

	/** æ 275 ListÏF l_mItem_ITEM_NAME */
	public List l_mItem_ITEM_NAME = null;

	/** æ 276 ListÏF l_mItem_PRODUCT_TYP */
	public List l_mItem_PRODUCT_TYP = null;

	/** æ 277 ListÏF l_mItem_MRP_ODR_TYP */
	public List l_mItem_MRP_ODR_TYP = null;

	/** æ 278 ListÏF l_mItem_DRAW_CD */
	public List l_mItem_DRAW_CD = null;

	/** æ 279 ListÏF l_mItem_SPEC */
	public List l_mItem_SPEC = null;

	/** æ 280 ListÏF l_mItem_HIGH_LEVEL_NO */
	public List l_mItem_HIGH_LEVEL_NO = null;

	/** æ 281 ListÏF l_mItem_OUTSIDE_TYP */
	public List l_mItem_OUTSIDE_TYP = null;

	/** æ 282 ListÏF l_mItem_STOCK_UNIT_FLG */
	public List l_mItem_STOCK_UNIT_FLG = null;

	/** æ 283 ListÏF l_mItem_STOCK_UNIT */
	public List l_mItem_STOCK_UNIT = null;

	/** æ 284 ListÏF l_mItem_PKG_UNIT */
	public List l_mItem_PKG_UNIT = null;

	/** æ 285 ListÏF l_mItem_PKG_UNIT_QTY */
	public List l_mItem_PKG_UNIT_QTY = null;

	/** æ 286 ListÏF l_mItem_UNIT_QTY_TYP */
	public List l_mItem_UNIT_QTY_TYP = null;

	/** æ 287 ListÏF l_mItem_ODR_LT */
	public List l_mItem_ODR_LT = null;

	/** æ 288 ListÏF l_mItem_FIXED_LT */
	public List l_mItem_FIXED_LT = null;

	/** æ 289 ListÏF l_mItem_PROP_LT */
	public List l_mItem_PROP_LT = null;

	/** æ 290 ListÏF l_mItem_SAFETY_LT */
	public List l_mItem_SAFETY_LT = null;

	/** æ 291 ListÏF l_mItem_ISSUE_LT */
	public List l_mItem_ISSUE_LT = null;

	/** æ 292 ListÏF l_mItem_PROP_LOT_SIZE */
	public List l_mItem_PROP_LOT_SIZE = null;

	/** æ 293 ListÏF l_mItem_ITEM_SPOIL */
	public List l_mItem_ITEM_SPOIL = null;

	/** æ 294 ListÏF l_mItem_SAFETY_STOCK */
	public List l_mItem_SAFETY_STOCK = null;

	/** æ 295 ListÏF l_mItem_LOT_SIZING_TYP */
	public List l_mItem_LOT_SIZING_TYP = null;

	/** æ 296 ListÏF l_mItem_MAX_PERIOD */
	public List l_mItem_MAX_PERIOD = null;

	/** æ 297 ListÏF l_mItem_MAX_ODR_QTY */
	public List l_mItem_MAX_ODR_QTY = null;

	/** æ 298 ListÏF l_mItem_ODR_POINT */
	public List l_mItem_ODR_POINT = null;

	/** æ 299 ListÏF l_mItem_FIXED_ODR_QTY */
	public List l_mItem_FIXED_ODR_QTY = null;

	/** æ 300 ListÏF l_mItem_MIN_ODR_QTY */
	public List l_mItem_MIN_ODR_QTY = null;

	/** æ 301 ListÏF l_mItem_MUL_ODR_QTY */
	public List l_mItem_MUL_ODR_QTY = null;

	/** æ 302 ListÏF l_mItem_ISSUE_TYP */
	public List l_mItem_ISSUE_TYP = null;

	/** æ 303 ListÏF l_mItem_MPS_FLG */
	public List l_mItem_MPS_FLG = null;

	/** æ 304 ListÏF l_mItem_ACPT_INSPC_TYP */
	public List l_mItem_ACPT_INSPC_TYP = null;

	/** æ 305 ListÏF l_mItem_CLASIFICATION_CD */
	public List l_mItem_CLASIFICATION_CD = null;

	/** æ 306 ListÏF l_mItem_UNIT_WEIGHT */
	public List l_mItem_UNIT_WEIGHT = null;

	/** æ 307 ListÏF l_mItem_ABC_TYP */
	public List l_mItem_ABC_TYP = null;

	/** æ 308 ListÏF l_mItem_OPR_RSLT_TYP */
	public List l_mItem_OPR_RSLT_TYP = null;

	/** æ 309 ListÏF l_mItem_SPL_ITEM_TYP */
	public List l_mItem_SPL_ITEM_TYP = null;

	/** æ 310 ListÏF l_mItem_TAX_CD */
	public List l_mItem_TAX_CD = null;

	/** æ 311 ListÏF l_mItem_IN_ITEMCD */
	public List l_mItem_IN_ITEMCD = null;

	/** æ 312 ListÏF l_mItemSpec_CUST_CD */
	public List l_mItemSpec_CUST_CD = null;

	/** æ 313 ListÏF l_mItemSpec_CUST_ITEM_CD */
	public List l_mItemSpec_CUST_ITEM_CD = null;

	/** æ 314 ListÏF l_mItemSpec_COMPANY_CD */
	public List l_mItemSpec_COMPANY_CD = null;

	/** æ 315 ListÏF l_mItemSpec_SALES_DEPT_CD */
	public List l_mItemSpec_SALES_DEPT_CD = null;

	/** æ 316 ListÏF l_mItemSpec_CUST_ITEM_NAME */
	public List l_mItemSpec_CUST_ITEM_NAME = null;

	/** æ 317 ListÏF l_mItemSpec_IN_CUST_CD */
	public List l_mItemSpec_IN_CUST_CD = null;

	/** æ 318 ListÏF l_mItemSpec_IN_CUST_ITEM_CD */
	public List l_mItemSpec_IN_CUST_ITEM_CD = null;

	/** æ 319 ListÏF l_mItemSpec_IN_COMPANY_CD */
	public List l_mItemSpec_IN_COMPANY_CD = null;

	/** æ 320 ListÏF l_tOdr_ODR_NO */
	public List l_tOdr_ODR_NO = null;

	/** æ 321 ListÏF l_tOdr_ODR_TYP */
	public List l_tOdr_ODR_TYP = null;

	/** æ 322 ListÏF l_tOdr_ODR_CTL_NO */
	public List l_tOdr_ODR_CTL_NO = null;

	/** æ 323 ListÏF l_tOdr_CUST_ODR_NO */
	public List l_tOdr_CUST_ODR_NO = null;

	/** æ 324 ListÏF l_tOdr_CUST_CHRG_ORG_CD */
	public List l_tOdr_CUST_CHRG_ORG_CD = null;

	/** æ 325 ListÏF l_tOdr_CUST_CHRG_PSN_CD */
	public List l_tOdr_CUST_CHRG_PSN_CD = null;

	/** æ 326 ListÏF l_tOdr_ODR_ACPT_ORG_CD */
	public List l_tOdr_ODR_ACPT_ORG_CD = null;

	/** æ 327 ListÏF l_tOdr_ODR_ACPT_PSN_CD */
	public List l_tOdr_ODR_ACPT_PSN_CD = null;

	/** æ 328 ListÏF l_tOdr_CURRNCY_CD */
	public List l_tOdr_CURRNCY_CD = null;

	/** æ 329 ListÏF l_tOdr_EXCH_TYP */
	public List l_tOdr_EXCH_TYP = null;

	/** æ 330 ListÏF l_tOdr_DLV_LOC_CD */
	public List l_tOdr_DLV_LOC_CD = null;

	/** æ 331 ListÏF l_tOdr_DLV_LOC_CD_EIAJ */
	public List l_tOdr_DLV_LOC_CD_EIAJ = null;

	/** æ 332 ListÏF l_tOdr_DLV_LOC_NAME */
	public List l_tOdr_DLV_LOC_NAME = null;

	/** æ 333 ListÏF l_tOdr_DLV_LOC_NAME_KANJI */
	public List l_tOdr_DLV_LOC_NAME_KANJI = null;

	/** æ 334 ListÏF l_tOdr_PRD_ODR_PLACE_CD */
	public List l_tOdr_PRD_ODR_PLACE_CD = null;

	/** æ 335 ListÏF l_tOdr_ODR_UNIT_PRICE */
	public List l_tOdr_ODR_UNIT_PRICE = null;

	/** æ 336 ListÏF l_tOdr_SPCL_PRICE_TYP */
	public List l_tOdr_SPCL_PRICE_TYP = null;

	/** æ 337 ListÏF l_tOdr_PART_DLV_COUNT */
	public List l_tOdr_PART_DLV_COUNT = null;

	/** æ 338 ListÏF l_tOdr_DEPO_TYP */
	public List l_tOdr_DEPO_TYP = null;

	/** æ 339 ListÏF l_tOdr_DESINATED_DLV_DATE */
	public List l_tOdr_DESINATED_DLV_DATE = null;

	/** æ 340 ListÏF l_tOdr_STD_DESINATED_RCV_DATE */
	public List l_tOdr_STD_DESINATED_RCV_DATE = null;

	/** æ 341 ListÏF l_tOdr_ODR_QTY */
	public List l_tOdr_ODR_QTY = null;

	/** æ 342 ListÏF l_tOdr_REMAIN_UNCONFIRM_ODR_QTY */
	public List l_tOdr_REMAIN_UNCONFIRM_ODR_QTY = null;

	/** æ 343 ListÏF l_tOdr_CANCELED_UNCONFIRM_ODR_QTY */
	public List l_tOdr_CANCELED_UNCONFIRM_ODR_QTY = null;

	/** æ 344 ListÏF l_tOdr_UNIT_CD */
	public List l_tOdr_UNIT_CD = null;

	/** æ 345 ListÏF l_tOdr_UNCONFIRM_ODR_BALANCE */
	public List l_tOdr_UNCONFIRM_ODR_BALANCE = null;

	/** æ 346 ListÏF l_tOdr_ODR_AMOUNT */
	public List l_tOdr_ODR_AMOUNT = null;

	/** æ 347 ListÏF l_tOdr_ODR_AMOUNT_EXCH_RATES */
	public List l_tOdr_ODR_AMOUNT_EXCH_RATES = null;

	/** æ 348 ListÏF l_tOdr_TOTAL_SHIP_QTY */
	public List l_tOdr_TOTAL_SHIP_QTY = null;

	/** æ 349 ListÏF l_tOdr_SHIP_AMOUNT */
	public List l_tOdr_SHIP_AMOUNT = null;

	/** æ 350 ListÏF l_tOdr_SHIP_AMOUNT_EXCH_RATES */
	public List l_tOdr_SHIP_AMOUNT_EXCH_RATES = null;

	/** æ 351 ListÏF l_tOdr_RETURN_PRICE */
	public List l_tOdr_RETURN_PRICE = null;

	/** æ 352 ListÏF l_tOdr_RETURN_QTY */
	public List l_tOdr_RETURN_QTY = null;

	/** æ 353 ListÏF l_tOdr_RETURN_AMOUNT */
	public List l_tOdr_RETURN_AMOUNT = null;

	/** æ 354 ListÏF l_tOdr_RETURN_AMOUNT_EXCH_RATES */
	public List l_tOdr_RETURN_AMOUNT_EXCH_RATES = null;

	/** æ 355 ListÏF l_tOdr_ODR_CMPLT_FLG */
	public List l_tOdr_ODR_CMPLT_FLG = null;

	/** æ 356 ListÏF l_tOdr_ODR_CMPLT_DATE */
	public List l_tOdr_ODR_CMPLT_DATE = null;

	/** æ 357 ListÏF l_tOdr_CUS_DLV_CD */
	public List l_tOdr_CUS_DLV_CD = null;

	/** æ 358 ListÏF l_tOdr_DLV_KEY_NO */
	public List l_tOdr_DLV_KEY_NO = null;

	/** æ 359 ListÏF l_tOdr_PART_NAME */
	public List l_tOdr_PART_NAME = null;

	/** æ 360 ListÏF l_tOdr_PKG_UNIT */
	public List l_tOdr_PKG_UNIT = null;

	/** æ 361 ListÏF l_tOdr_SLIP_PRICE_PRINT_TYP */
	public List l_tOdr_SLIP_PRICE_PRINT_TYP = null;

	/** æ 362 ListÏF l_tOdr_INSPC_TYP */
	public List l_tOdr_INSPC_TYP = null;

	/** æ 363 ListÏF l_tOdr_CLIENT_REMARK */
	public List l_tOdr_CLIENT_REMARK = null;

	/** æ 364 ListÏF l_tOdr_CLIENT_REMARK_KANJI */
	public List l_tOdr_CLIENT_REMARK_KANJI = null;

	/** æ 365 ListÏF l_tOdr_CLIENT_BARCODE_INF */
	public List l_tOdr_CLIENT_BARCODE_INF = null;

	/** æ 366 ListÏF l_tOdr_TRANSPORT_CD */
	public List l_tOdr_TRANSPORT_CD = null;

	/** æ 367 ListÏF l_tOdr_TRANSPORT_TYP */
	public List l_tOdr_TRANSPORT_TYP = null;

	/** æ 368 ListÏF l_tOdr_TAX_APPLY_TYP */
	public List l_tOdr_TAX_APPLY_TYP = null;

	/** æ 369 ListÏF l_tOdr_TAX_CD */
	public List l_tOdr_TAX_CD = null;

	/** æ 370 ListÏF l_tOdr_TAX_CALC_TYP */
	public List l_tOdr_TAX_CALC_TYP = null;

	/** æ 371 ListÏF l_tOdr_REMARKS */
	public List l_tOdr_REMARKS = null;

	/** æ 372 ListÏF l_tOdr_ODR_ACPT_DATE */
	public List l_tOdr_ODR_ACPT_DATE = null;

	/** æ 373 ListÏF l_tOdr_SHIP_PLAN_REMAIN_QTY */
	public List l_tOdr_SHIP_PLAN_REMAIN_QTY = null;

	/** æ 374 ListÏF l_tOdr_SHIP_PLAN_CMPLT_FLG */
	public List l_tOdr_SHIP_PLAN_CMPLT_FLG = null;

	/** æ 375 ListÏF l_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG */
	public List l_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG = null;

	/** æ 376 ListÏF l_tOdr_PARTIAL_SHIP_INST_FLG */
	public List l_tOdr_PARTIAL_SHIP_INST_FLG = null;

	/** æ 377 ListÏF l_tOdr_IF_CTL_NO */
	public List l_tOdr_IF_CTL_NO = null;

	/** æ 378 ListÏF l_tOdr_ENTRY_TYP */
	public List l_tOdr_ENTRY_TYP = null;

	/** æ 379 ListÏF l_tOdr_DEL_FLG */
	public List l_tOdr_DEL_FLG = null;

	/** æ 380 ListÏF l_tOdr_SHIP_CNT */
	public List l_tOdr_SHIP_CNT = null;

	/** æ 381 ListÏF l_tOdr_UNIT_CD_ORG */
	public List l_tOdr_UNIT_CD_ORG = null;

	/** æ 382 ListÏF l_tOdrCtl_CUST_ITEM_CD */
	public List l_tOdrCtl_CUST_ITEM_CD = null;

	/** æ 383 ListÏF l_tOdr_COCK_TYP */
	public List l_tOdr_COCK_TYP = null;

	/** æ 384 ListÏF l_tOdr_PUCH_ODR_QTY_TOTAL */
	public List l_tOdr_PUCH_ODR_QTY_TOTAL = null;

	/** æ 385 ListÏF l_tOdr_BUYER_ORG_CD */
	public List l_tOdr_BUYER_ORG_CD = null;

	/** æ 386 ListÏF l_tOdr_BUYER_NAME */
	public List l_tOdr_BUYER_NAME = null;

	/** æ 387 ListÏF l_tOdr_IN_ODRNO */
	public List l_tOdr_IN_ODRNO = null;

	/** æ 388 ListÏF l_creTodrODR_NO */
	public List l_creTodrODR_NO = null;

	/** æ 389 ListÏF l_creTodrODR_TYP */
	public List l_creTodrODR_TYP = null;

	/** æ 390 ListÏF l_creTodrODR_CTL_NO */
	public List l_creTodrODR_CTL_NO = null;

	/** æ 391 ListÏF l_creTodrCUST_ODR_NO */
	public List l_creTodrCUST_ODR_NO = null;

	/** æ 392 ListÏF l_creTodrCUST_CHRG_ORG_CD */
	public List l_creTodrCUST_CHRG_ORG_CD = null;

	/** æ 393 ListÏF l_creTodrCUST_CHRG_PSN_CD */
	public List l_creTodrCUST_CHRG_PSN_CD = null;

	/** æ 394 ListÏF l_creTodrODR_ACPT_ORG_CD */
	public List l_creTodrODR_ACPT_ORG_CD = null;

	/** æ 395 ListÏF l_creTodrODR_ACPT_PSN_CD */
	public List l_creTodrODR_ACPT_PSN_CD = null;

	/** æ 396 ListÏF l_creTodrCURRNCY_CD */
	public List l_creTodrCURRNCY_CD = null;

	/** æ 397 ListÏF l_creTodrEXCH_TYP */
	public List l_creTodrEXCH_TYP = null;

	/** æ 398 ListÏF l_creTodrDLV_LOC_CD */
	public List l_creTodrDLV_LOC_CD = null;

	/** æ 399 ListÏF l_creTodrDLV_LOC_NAME */
	public List l_creTodrDLV_LOC_NAME = null;

	/** æ 400 ListÏF l_creTodrDLV_LOC_NAME_KANJI */
	public List l_creTodrDLV_LOC_NAME_KANJI = null;

	/** æ 401 ListÏF l_creTodrPRD_ODR_PLACE_CD */
	public List l_creTodrPRD_ODR_PLACE_CD = null;

	/** æ 402 ListÏF l_creTodrODR_UNIT_PRICE */
	public List l_creTodrODR_UNIT_PRICE = null;

	/** æ 403 ListÏF l_creTodrPART_DLV_COUNT */
	public List l_creTodrPART_DLV_COUNT = null;

	/** æ 404 ListÏF l_creTodrDEPO_TYP */
	public List l_creTodrDEPO_TYP = null;

	/** æ 405 ListÏF l_creTodrDESINATED_DLV_DATE */
	public List l_creTodrDESINATED_DLV_DATE = null;

	/** æ 406 ListÏF l_creTodrODR_QTY */
	public List l_creTodrODR_QTY = null;

	/** æ 407 ListÏF l_creTodrREMAIN_UNCONFIRM_ODR_QTY */
	public List l_creTodrREMAIN_UNCONFIRM_ODR_QTY = null;

	/** æ 408 ListÏF l_creTodrCANCELED_UNCONFIRM_ODR_QTY */
	public List l_creTodrCANCELED_UNCONFIRM_ODR_QTY = null;

	/** æ 409 ListÏF l_creTodrUNIT_CD */
	public List l_creTodrUNIT_CD = null;

	/** æ 410 ListÏF l_creTodrUNCONFIRM_ODR_BALANCE */
	public List l_creTodrUNCONFIRM_ODR_BALANCE = null;

	/** æ 411 ListÏF l_creTodrODR_AMOUNT */
	public List l_creTodrODR_AMOUNT = null;

	/** æ 412 ListÏF l_creTodrODR_AMOUNT_EXCH_RATES */
	public List l_creTodrODR_AMOUNT_EXCH_RATES = null;

	/** æ 413 ListÏF l_creTodrTOTAL_SHIP_QTY */
	public List l_creTodrTOTAL_SHIP_QTY = null;

	/** æ 414 ListÏF l_creTodrSHIP_AMOUNT */
	public List l_creTodrSHIP_AMOUNT = null;

	/** æ 415 ListÏF l_creTodrSHIP_AMOUNT_EXCH_RATES */
	public List l_creTodrSHIP_AMOUNT_EXCH_RATES = null;

	/** æ 416 ListÏF l_creTodrODR_CMPLT_FLG */
	public List l_creTodrODR_CMPLT_FLG = null;

	/** æ 417 ListÏF l_creTodrODR_CMPLT_DATE */
	public List l_creTodrODR_CMPLT_DATE = null;

	/** æ 418 ListÏF l_creTodrREMARKS */
	public List l_creTodrREMARKS = null;

	/** æ 419 ListÏF l_creTodrODR_ACPT_DATE */
	public List l_creTodrODR_ACPT_DATE = null;

	/** æ 420 ListÏF l_creTodrSHIP_PLAN_REMAIN_QTY */
	public List l_creTodrSHIP_PLAN_REMAIN_QTY = null;

	/** æ 421 ListÏF l_creTodrSHIP_PLAN_CMPLT_FLG */
	public List l_creTodrSHIP_PLAN_CMPLT_FLG = null;

	/** æ 422 ListÏF l_creTodrUNCONFIRMED_ODR_EFF_OVR_FLG */
	public List l_creTodrUNCONFIRMED_ODR_EFF_OVR_FLG = null;

	/** æ 423 ListÏF l_creTodrPARTIAL_SHIP_INST_FLG */
	public List l_creTodrPARTIAL_SHIP_INST_FLG = null;

	/** æ 424 ListÏF l_creTodrENTRY_TYP */
	public List l_creTodrENTRY_TYP = null;

	/** æ 425 ListÏF l_creTodrDEL_FLG */
	public List l_creTodrDEL_FLG = null;

	/** æ 426 ListÏF l_upTodr_TOTAL_SHIP_QTY */
	public List l_upTodr_TOTAL_SHIP_QTY = null;

	/** æ 427 ListÏF l_upTodr_SHIP_AMOUNT */
	public List l_upTodr_SHIP_AMOUNT = null;

	/** æ 428 ListÏF l_upTodr_SHIP_AMOUNT_EXCH_RATES */
	public List l_upTodr_SHIP_AMOUNT_EXCH_RATES = null;

	/** æ 429 ListÏF l_upTodr_ODR_CMPLT_FLG */
	public List l_upTodr_ODR_CMPLT_FLG = null;

	/** æ 430 ListÏF l_upTodr_ODR_CMPLT_DATE */
	public List l_upTodr_ODR_CMPLT_DATE = null;

	/** æ 431 ListÏF l_upTodr_IN_ODRNO */
	public List l_upTodr_IN_ODRNO = null;

	/** æ 432 ListÏF l_creTrcvIssue_RCV_ISSUE_CTRL_CD */
	public List l_creTrcvIssue_RCV_ISSUE_CTRL_CD = null;

	/** æ 433 ListÏF l_creTrcvIssue_RCV_ISSUE_TYP */
	public List l_creTrcvIssue_RCV_ISSUE_TYP = null;

	/** æ 434 ListÏF l_creTrcvIssue_ITEM_CD */
	public List l_creTrcvIssue_ITEM_CD = null;

	/** æ 435 ListÏF l_creTrcvIssue_JOB_ODR_CD */
	public List l_creTrcvIssue_JOB_ODR_CD = null;

	/** æ 436 ListÏF l_creTrcvIssue_PLANT_CD */
	public List l_creTrcvIssue_PLANT_CD = null;

	/** æ 437 ListÏF l_creTrcvIssue_WH_CD */
	public List l_creTrcvIssue_WH_CD = null;

	/** æ 438 ListÏF l_creTrcvIssue_RCV_ISSUE_BEFORE_QTY */
	public List l_creTrcvIssue_RCV_ISSUE_BEFORE_QTY = null;

	/** æ 439 ListÏF l_creTrcvIssue_RCV_ISSUE_QTY */
	public List l_creTrcvIssue_RCV_ISSUE_QTY = null;

	/** æ 440 ListÏF l_creTrcvIssue_RCV_ISSUE_AFTER_QTY */
	public List l_creTrcvIssue_RCV_ISSUE_AFTER_QTY = null;

	/** æ 441 ListÏF l_creTrcvIssue_RCV_ISSUE_AMOUNT */
	public List l_creTrcvIssue_RCV_ISSUE_AMOUNT = null;

	/** æ 442 ListÏF l_creTrcvIssue_RCV_ISSUE_DATE */
	public List l_creTrcvIssue_RCV_ISSUE_DATE = null;

	/** æ 443 ListÏF l_creTrcvIssue_RCV_ISSUE_GNR_TYP */
	public List l_creTrcvIssue_RCV_ISSUE_GNR_TYP = null;

	/** æ 444 ListÏF l_creTrcvIssue_STOCK_UPD_TYP */
	public List l_creTrcvIssue_STOCK_UPD_TYP = null;

	/** æ 445 ListÏF l_creTrcvIssue_RCV_ISSUE_CMPLT_FLG */
	public List l_creTrcvIssue_RCV_ISSUE_CMPLT_FLG = null;

	/** æ 446 ListÏF l_creTrcvIssue_RCV_ISSUE_COMMENT */
	public List l_creTrcvIssue_RCV_ISSUE_COMMENT = null;

	/** æ 447 ListÏF l_creTrcvIssue_LOT_NO */
	public List l_creTrcvIssue_LOT_NO = null;

	/** æ 448 ListÏF l_creTrcvIssue_SHIP_ODR_NO */
	public List l_creTrcvIssue_SHIP_ODR_NO = null;

	/** æ 449 ListÏF l_upTitemStock_STOCK_ON_HAND_QTY */
	public List l_upTitemStock_STOCK_ON_HAND_QTY = null;

	/** æ 450 ListÏF l_upTitemStock_IN_ITEMCD */
	public List l_upTitemStock_IN_ITEMCD = null;

	/** æ 451 ListÏF l_upTitemStock_IN_WHCD */
	public List l_upTitemStock_IN_WHCD = null;

	/** æ 452 ListÏF l_serTitemStock_ITEM_CD */
	public List l_serTitemStock_ITEM_CD = null;

	/** æ 453 ListÏF l_serTitemStock_WH_CD */
	public List l_serTitemStock_WH_CD = null;

	/** æ 454 ListÏF l_serTitemStock_PLANT_CD */
	public List l_serTitemStock_PLANT_CD = null;

	/** æ 455 ListÏF l_serTitemStock_STOCK_ON_HAND_QTY */
	public List l_serTitemStock_STOCK_ON_HAND_QTY = null;

	/** æ 456 ListÏF l_serTitemStock_DEFECT_QTY */
	public List l_serTitemStock_DEFECT_QTY = null;

	/** æ 457 ListÏF l_serTitemStock_PRVS_DAYEND_STOCK_QTY */
	public List l_serTitemStock_PRVS_DAYEND_STOCK_QTY = null;

	/** æ 458 ListÏF l_serTitemStock_PRVS_MONTHEND_STOCK_QTY */
	public List l_serTitemStock_PRVS_MONTHEND_STOCK_QTY = null;

	/** æ 459 ListÏF l_serTitemStock_PRVS_TERMEND_STOCK_QTY */
	public List l_serTitemStock_PRVS_TERMEND_STOCK_QTY = null;

	/** æ 460 ListÏF l_serTitemStock_IN_ITEMCD */
	public List l_serTitemStock_IN_ITEMCD = null;

	/** æ 461 ListÏF l_serTitemStock_IN_WHCD */
	public List l_serTitemStock_IN_WHCD = null;

	/** æ 462 ListÏF l_creTitemStock_WH_CD */
	public List l_creTitemStock_WH_CD = null;

	/** æ 463 ListÏF l_creTitemStock_ITEM_CD */
	public List l_creTitemStock_ITEM_CD = null;

	/** æ 464 ListÏF l_creTitemStock_PLANT_CD */
	public List l_creTitemStock_PLANT_CD = null;

	/** æ 465 ListÏF l_creTitemStock_STOCK_ON_HAND_QTY */
	public List l_creTitemStock_STOCK_ON_HAND_QTY = null;

	/** æ 466 ListÏF l_mCust_COMPANY_CD */
	public List l_mCust_COMPANY_CD = null;

	/** æ 467 ListÏF l_mCust_CUST_CD */
	public List l_mCust_CUST_CD = null;

	/** æ 468 ListÏF l_mCust_CUST_NAME */
	public List l_mCust_CUST_NAME = null;

	/** æ 469 ListÏF l_mCust_DETAIL_ROUND_TYP */
	public List l_mCust_DETAIL_ROUND_TYP = null;

	/** æ 470 ListÏF l_mCust_INSPC_ACPT_TYP */
	public List l_mCust_INSPC_ACPT_TYP = null;

	/** æ 471 ListÏF l_mCust_OWN_ORG_CD */
	public List l_mCust_OWN_ORG_CD = null;

	/** æ 472 ListÏF l_mCust_EXCH_TYP */
	public List l_mCust_EXCH_TYP = null;

	/** æ 473 ListÏF l_mCust_CUR_CD */
	public List l_mCust_CUR_CD = null;

	/** æ 474 ListÏF l_mCust_IN_COMPANYCD */
	public List l_mCust_IN_COMPANYCD = null;

	/** æ 475 ListÏF l_mCust_IN_CUSTCD */
	public List l_mCust_IN_CUSTCD = null;

	/** æ 476 ListÏF l_getHomeCur_CUR_CD */
	public List l_getHomeCur_CUR_CD = null;

	/** æ 477 ListÏF l_getHomeCur_DECIMAL_FIG */
	public List l_getHomeCur_DECIMAL_FIG = null;

	/** æ 478 ListÏF l_getHomeCur_CTRL_CD */
	public List l_getHomeCur_CTRL_CD = null;

	/** æ 479 ListÏF l_strCode */
	public List l_strCode = null;

	/** æ 480 ListÏF l_mUnitCost_UNIT_COST */
	public List l_mUnitCost_UNIT_COST = null;

	/** æ 481 ListÏF l_mUnitCost_EFF_PHASE_IN_DATE */
	public List l_mUnitCost_EFF_PHASE_IN_DATE = null;

	/** æ 482 ListÏF l_mUnitCost_IN_COMPANYCD */
	public List l_mUnitCost_IN_COMPANYCD = null;

	/** æ 483 ListÏF l_mUnitCost_IN_CUSTCD */
	public List l_mUnitCost_IN_CUSTCD = null;

	/** æ 484 ListÏF l_mUnitCost_IN_ITEMCD */
	public List l_mUnitCost_IN_ITEMCD = null;

	/** æ 485 ListÏF l_mUnitCost_IN_EFFPHASEINDATE */
	public List l_mUnitCost_IN_EFFPHASEINDATE = null;

	/** æ 486 ListÏF l_readShipOdr_TOTAL_SHIP_QTY */
	public List l_readShipOdr_TOTAL_SHIP_QTY = null;

	/** æ 487 ListÏF l_readShipOdr_RETURN_QTY */
	public List l_readShipOdr_RETURN_QTY = null;

	/** æ 488 ListÏF l_readShipOdr_SHIP_ODR_NO */
	public List l_readShipOdr_SHIP_ODR_NO = null;

	/** æ 489 ListÏF l_g_CUR_UNIT */
	public List l_g_CUR_UNIT = null;

	/** æ 490 ListÏF l_DECIMAL_FIG */
	public List l_DECIMAL_FIG = null;

	/** æ 491 ListÏF l_t_CUR_CD */
	public List l_t_CUR_CD = null;

	/** æ 492 ListÏF l_strSLIP_CTRL_GRP */
	public List l_strSLIP_CTRL_GRP = null;

	/** æ 493 ListÏF l_strSTATUS */
	public List l_strSTATUS = null;

	/** æ 494 ListÏF l_strSLIP_CD */
	public List l_strSLIP_CD = null;

	/** æ 495 ListÏF l_upTshipOdr_SHP_CMPLT_FLG */
	public List l_upTshipOdr_SHP_CMPLT_FLG = null;

	/** æ 496 ListÏF l_upTshipOdr_TOTAL_SHIP_QTY */
	public List l_upTshipOdr_TOTAL_SHIP_QTY = null;

	/** æ 497 ListÏF l_upTshipOdr_SLIP_CD */
	public List l_upTshipOdr_SLIP_CD = null;

	/** æ 498 ListÏF l_upTshipOdr_ORG_SLIP_CD */
	public List l_upTshipOdr_ORG_SLIP_CD = null;

	/** æ 499 ListÏF l_upTshipOdr_SHIP_ODR_NO */
	public List l_upTshipOdr_SHIP_ODR_NO = null;

	/** æ 500 ListÏF l_strTod_OD_NO */
	public List l_strTod_OD_NO = null;

	/** æ 501 ListÏF l_strTod_TOTAL_ISSUE_QTY */
	public List l_strTod_TOTAL_ISSUE_QTY = null;

	/** æ 502 ListÏF l_strTod_DM_QTY */
	public List l_strTod_DM_QTY = null;

	/** æ 503 ListÏF l_strTod_DM_STS_TYP */
	public List l_strTod_DM_STS_TYP = null;

	/** æ 504 ListÏF l_inTod_ODR_NO */
	public List l_inTod_ODR_NO = null;

	/** æ 505 ListÏF l_inTod_PART_DLV_SEQ_NO */
	public List l_inTod_PART_DLV_SEQ_NO = null;

	/** æ 506 ListÏF l_inTod_OD_NO */
	public List l_inTod_OD_NO = null;

	/** æ 507 ListÏF l_strTaxTAX_KBN */
	public List l_strTaxTAX_KBN = null;

	/** æ 508 ListÏF l_strTaxOLD_TAX_1 */
	public List l_strTaxOLD_TAX_1 = null;

	/** æ 509 ListÏF l_strTaxOLD_TAX_2 */
	public List l_strTaxOLD_TAX_2 = null;

	/** æ 510 ListÏF l_strTaxOLD_TAX_3 */
	public List l_strTaxOLD_TAX_3 = null;

	/** æ 511 ListÏF l_strTaxNEW_TAX_1 */
	public List l_strTaxNEW_TAX_1 = null;

	/** æ 512 ListÏF l_strTaxNEW_TAX_2 */
	public List l_strTaxNEW_TAX_2 = null;

	/** æ 513 ListÏF l_strTaxNEW_TAX_3 */
	public List l_strTaxNEW_TAX_3 = null;

	/** æ 514 ListÏF l_strTaxSTART_DATE */
	public List l_strTaxSTART_DATE = null;

	/** æ 515 ListÏF l_strTaxROUND_TYP */
	public List l_strTaxROUND_TYP = null;

	/** æ 516 ListÏF l_updiffTAX_CD */
	public List l_updiffTAX_CD = null;

	/** æ 517 ListÏF l_upTshipOdr_RETURN_QTY */
	public List l_upTshipOdr_RETURN_QTY = null;

	/** æ 518 ListÏF l_chkSLIP_CD */
	public List l_chkSLIP_CD = null;

	/** æ 519 ListÏF l_mWh_WH_NAME */
	public List l_mWh_WH_NAME = null;

	/** æ 520 ListÏF l_mWh_PLANT_CD */
	public List l_mWh_PLANT_CD = null;

	/** æ 521 ListÏF l_mWh_IN_WH_CD */
	public List l_mWh_IN_WH_CD = null;

	/** æ 522 ListÏF l_mOrg_ORG_NAME */
	public List l_mOrg_ORG_NAME = null;

	/** æ 523 ListÏF l_mOrg_IN_COMPANYCD */
	public List l_mOrg_IN_COMPANYCD = null;

	/** æ 524 ListÏF l_mOrg_IN_ORGCD */
	public List l_mOrg_IN_ORGCD = null;

	/** æ 525 ListÏF l_serTitemStock_JOB_ODR_CD */
	public List l_serTitemStock_JOB_ODR_CD = null;

	/** æ 526 ListÏF l_serTitemStock_IN_JOBODRCD */
	public List l_serTitemStock_IN_JOBODRCD = null;

	/** æ 527 ListÏF l_creTitemStock_JOB_ODR_CD */
	public List l_creTitemStock_JOB_ODR_CD = null;

	/** æ 528 ListÏF l_upTitemStock_IN_JOBODRCD */
	public List l_upTitemStock_IN_JOBODRCD = null;

	/** æ 529 ListÏF l_serTJobOdr_JOB_ODR_CD */
	public List l_serTJobOdr_JOB_ODR_CD = null;

	/** æ 530 ListÏF l_serTJobOdr_ITEM_CD */
	public List l_serTJobOdr_ITEM_CD = null;

	/** æ 531 ListÏF l_diffSHIP_QTY */
	public List l_diffSHIP_QTY = null;

	/** æ 532 ListÏF l_diffSHIP_ODR_AMOUNT */
	public List l_diffSHIP_ODR_AMOUNT = null;

	/** æ 533 ListÏF l_diffSHIP_ODR_AMOUNT_EXCH_RATE */
	public List l_diffSHIP_ODR_AMOUNT_EXCH_RATE = null;

	/** æ 534 ListÏF l_diffSHIP_ODR_NO */
	public List l_diffSHIP_ODR_NO = null;

	/** æ 535 ListÏF l_diffODR_NO */
	public List l_diffODR_NO = null;

	/** æ 536 ListÏF l_diffPART_DLV_SEQ_NO */
	public List l_diffPART_DLV_SEQ_NO = null;

	/** æ 537 ListÏF l_diffSLIP_CD */
	public List l_diffSLIP_CD = null;

	/** æ 538 ListÏF l_diffITEM_CD */
	public List l_diffITEM_CD = null;

	/** æ 539 ListÏF l_diffJOB_ODR_CD */
	public List l_diffJOB_ODR_CD = null;

	/** æ 540 ListÏF l_diffCUST_ITEM_CD */
	public List l_diffCUST_ITEM_CD = null;

	/** æ 541 ListÏF l_diffCUST_ODR_NO */
	public List l_diffCUST_ODR_NO = null;

	/** æ 542 ListÏF l_diffCUST_CD */
	public List l_diffCUST_CD = null;

	/** æ 543 ListÏF l_diffCUST_NAME */
	public List l_diffCUST_NAME = null;

	/** æ 544 ListÏF l_diffCUST_CHRG_PSN_CD */
	public List l_diffCUST_CHRG_PSN_CD = null;

	/** æ 545 ListÏF l_diffSHIP_ODR_ISS_PSN_CD */
	public List l_diffSHIP_ODR_ISS_PSN_CD = null;

	/** æ 546 ListÏF l_diffDLV_LOC_CD */
	public List l_diffDLV_LOC_CD = null;

	/** æ 547 ListÏF l_diffDEPO_TYP */
	public List l_diffDEPO_TYP = null;

	/** æ 548 ListÏF l_diffDESINATED_SHIP_DATE */
	public List l_diffDESINATED_SHIP_DATE = null;

	/** æ 549 ListÏF l_diffSCDL_DLV_DATE */
	public List l_diffSCDL_DLV_DATE = null;

	/** æ 550 ListÏF l_diffTOTAL_SHIP_QTY */
	public List l_diffTOTAL_SHIP_QTY = null;

	/** æ 551 ListÏF l_diffRETURN_QTY */
	public List l_diffRETURN_QTY = null;

	/** æ 552 ListÏF l_diffUNIT_CD */
	public List l_diffUNIT_CD = null;

	/** æ 553 ListÏF l_diffUNIT_PRICE */
	public List l_diffUNIT_PRICE = null;

	/** æ 554 ListÏF l_diffCURRENCY_CD */
	public List l_diffCURRENCY_CD = null;

	/** æ 555 ListÏF l_diffLOC_CD */
	public List l_diffLOC_CD = null;

	/** æ 556 ListÏF l_diffPKG_UNIT_QTY */
	public List l_diffPKG_UNIT_QTY = null;

	/** æ 557 ListÏF l_diffREMARKS */
	public List l_diffREMARKS = null;

	/** æ 558 ListÏF l_diffDLV_KEY_NO */
	public List l_diffDLV_KEY_NO = null;

	/** æ 559 ListÏF l_diffPART_DLV_COUNT */
	public List l_diffPART_DLV_COUNT = null;

	/** æ 560 ListÏF l_diffTRANSPORT_CD */
	public List l_diffTRANSPORT_CD = null;

	/** æ 561 ListÏF l_diffTRANSPORT_TYP */
	public List l_diffTRANSPORT_TYP = null;

	/** æ 562 ListÏF l_diffALLCT_WH_CD */
	public List l_diffALLCT_WH_CD = null;

	/** æ 563 ListÏF l_diffTRANSFER_WH_CD */
	public List l_diffTRANSFER_WH_CD = null;

	/** æ 564 ListÏF l_diffDIRECT_DLV_FLG */
	public List l_diffDIRECT_DLV_FLG = null;

	/** æ 565 ListÏF l_diffENTRY_TYP */
	public List l_diffENTRY_TYP = null;

	/** æ 566 ListÏF l_diffPRINT_FLG */
	public List l_diffPRINT_FLG = null;

	/** æ 567 ListÏF l_diffSHIP_CMPLT_FLG */
	public List l_diffSHIP_CMPLT_FLG = null;

	/** æ 568 ListÏF l_diffDEPO_TRANSFER_PROC_FLG */
	public List l_diffDEPO_TRANSFER_PROC_FLG = null;

	/** æ 569 ListÏF l_diffDEL_FLG */
	public List l_diffDEL_FLG = null;

	/** æ 570 ListÏF l_diffuptOdr_SHIP_CNT */
	public List l_diffuptOdr_SHIP_CNT = null;

	/** æ 571 ListÏF l_diffuptOdr_PART_DLV_COUNT */
	public List l_diffuptOdr_PART_DLV_COUNT = null;

	/** æ 572 ListÏF l_diffuptOdr_IN_ODRNO */
	public List l_diffuptOdr_IN_ODRNO = null;

	/** æ 573 ListÏF l_in_tShipSlip_SLIP_CD */
	public List l_in_tShipSlip_SLIP_CD = null;

	/** æ 574 ListÏF l_in_tShipSlip_ITEM_CD */
	public List l_in_tShipSlip_ITEM_CD = null;

	/** æ 575 ListÏF l_in_tShipSlip_CUST_ITEM_CD */
	public List l_in_tShipSlip_CUST_ITEM_CD = null;

	/** æ 576 ListÏF l_in_tShipSlip_PART_NAME */
	public List l_in_tShipSlip_PART_NAME = null;

	/** æ 577 ListÏF l_in_tShipSlip_CUST_ODR_NO */
	public List l_in_tShipSlip_CUST_ODR_NO = null;

	/** æ 578 ListÏF l_in_tShipSlip_CUST_CD */
	public List l_in_tShipSlip_CUST_CD = null;

	/** æ 579 ListÏF l_in_tShipSlip_CUST_NAME */
	public List l_in_tShipSlip_CUST_NAME = null;

	/** æ 580 ListÏF l_in_tShipSlip_DLV_LOC_CD */
	public List l_in_tShipSlip_DLV_LOC_CD = null;

	/** æ 581 ListÏF l_in_tShipSlip_DLV_LOC_NAME_KANJI */
	public List l_in_tShipSlip_DLV_LOC_NAME_KANJI = null;

	/** æ 582 ListÏF l_in_tShipSlip_CUS_DLV_KEY_CD */
	public List l_in_tShipSlip_CUS_DLV_KEY_CD = null;

	/** æ 583 ListÏF l_in_tShipSlip_DESINATED_SHIP_DATE */
	public List l_in_tShipSlip_DESINATED_SHIP_DATE = null;

	/** æ 584 ListÏF l_in_tShipSlip_DESINATED_DLV_DATE */
	public List l_in_tShipSlip_DESINATED_DLV_DATE = null;

	/** æ 585 ListÏF l_in_tShipSlip_SCDL_DLV_DATE */
	public List l_in_tShipSlip_SCDL_DLV_DATE = null;

	/** æ 586 ListÏF l_in_tShipSlip_SHIP_ODR_QTY */
	public List l_in_tShipSlip_SHIP_ODR_QTY = null;

	/** æ 587 ListÏF l_in_tShipSlip_UNIT_CD */
	public List l_in_tShipSlip_UNIT_CD = null;

	/** æ 588 ListÏF l_in_tShipSlip_UNIT_PRICE */
	public List l_in_tShipSlip_UNIT_PRICE = null;

	/** æ 589 ListÏF l_in_tShipSlip_SHIP_ODR_AMOUNT */
	public List l_in_tShipSlip_SHIP_ODR_AMOUNT = null;

	/** æ 590 ListÏF l_in_tShipSlip_TAX_AMOUNT */
	public List l_in_tShipSlip_TAX_AMOUNT = null;

	/** æ 591 ListÏF l_in_tShipSlip_INSPC_TYP */
	public List l_in_tShipSlip_INSPC_TYP = null;

	/** æ 592 ListÏF l_in_tShipSlip_CLIENT_REMARK_KANJI */
	public List l_in_tShipSlip_CLIENT_REMARK_KANJI = null;

	/** æ 593 ListÏF l_in_tShipSlip_CLIENT_BARCODE_INF */
	public List l_in_tShipSlip_CLIENT_BARCODE_INF = null;

	/** æ 594 ListÏF l_in_tShipSlip_PRINT_FLG */
	public List l_in_tShipSlip_PRINT_FLG = null;

	/** æ 595 ListÏF l_in_tShipSlip_DEL_FLG */
	public List l_in_tShipSlip_DEL_FLG = null;

	/** æ 596 ListÏF l_in_tShipSlip_BUYER_NAME */
	public List l_in_tShipSlip_BUYER_NAME = null;

	/** æ 597 ListÏF l_in_tShipSlip_PUCH_ODR_QTY_TOTAL */
	public List l_in_tShipSlip_PUCH_ODR_QTY_TOTAL = null;

	/** æ 598 ListÏF l_in_tShipSlip_DLV_ODR_QTY */
	public List l_in_tShipSlip_DLV_ODR_QTY = null;

	/** æ 599 ListÏF l_in_tShipSlip_SHIP_ODR_AMOUNT_TAX */
	public List l_in_tShipSlip_SHIP_ODR_AMOUNT_TAX = null;

	/** æ 600 ListÏF l_in_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT */
	public List l_in_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT = null;

	/** æ 601 ListÏF l_in_tShipSlip_INTERNAL_TAX_SALES_AMOUNT */
	public List l_in_tShipSlip_INTERNAL_TAX_SALES_AMOUNT = null;

	/** æ 602 ListÏF l_in_tShipSlip_TAXFREE_SALES_AMOUNT */
	public List l_in_tShipSlip_TAXFREE_SALES_AMOUNT = null;

	/** æ 603 ListÏF l_in_tShipSlip_TAX_CREDIT_SALES_AMOUNT */
	public List l_in_tShipSlip_TAX_CREDIT_SALES_AMOUNT = null;

	/** æ 604 ListÏF l_in_tShipSlip_EXTERNAL_TAX_AMOUNT */
	public List l_in_tShipSlip_EXTERNAL_TAX_AMOUNT = null;

	/** æ 605 ListÏF l_in_tShipSlip_INTERNAL_TAX_AMOUNT */
	public List l_in_tShipSlip_INTERNAL_TAX_AMOUNT = null;

	/** æ 606 ListÏF l_in_tShipSlip_TAX_AMOUNT_1 */
	public List l_in_tShipSlip_TAX_AMOUNT_1 = null;

	/** æ 607 ListÏF l_in_tShipSlip_TAX_AMOUNT_2 */
	public List l_in_tShipSlip_TAX_AMOUNT_2 = null;

	/** æ 608 ListÏF l_in_tShipSlip_TAX_AMOUNT_3 */
	public List l_in_tShipSlip_TAX_AMOUNT_3 = null;

	/** æ 609 ListÏF l_in_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT */
	public List l_in_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;

	/** æ 610 ListÏF l_up_tShipSlip_SLIP_CD */
	public List l_up_tShipSlip_SLIP_CD = null;

	/** æ 611 ListÏF l_updiffSHIP_ODR_QTY */
	public List l_updiffSHIP_ODR_QTY = null;

	/** æ 612 ListÏF l_updiffSHIP_ODR_AMOUNT */
	public List l_updiffSHIP_ODR_AMOUNT = null;

	/** æ 613 ListÏF l_updiffTAX_AMOUNT */
	public List l_updiffTAX_AMOUNT = null;

	/** æ 614 ListÏF l_updiffSHIP_ODR_AMOUNT_TAX */
	public List l_updiffSHIP_ODR_AMOUNT_TAX = null;

	/** æ 615 ListÏF l_updiffEXTERNAL_TAX_SALES_AMOUNT */
	public List l_updiffEXTERNAL_TAX_SALES_AMOUNT = null;

	/** æ 616 ListÏF l_updiffINTERNAL_TAX_SALES_AMOUNT */
	public List l_updiffINTERNAL_TAX_SALES_AMOUNT = null;

	/** æ 617 ListÏF l_updiffTAXFREE_SALES_AMOUNT */
	public List l_updiffTAXFREE_SALES_AMOUNT = null;

	/** æ 618 ListÏF l_updiffTAX_CREDIT_SALES_AMOUNT */
	public List l_updiffTAX_CREDIT_SALES_AMOUNT = null;

	/** æ 619 ListÏF l_updiffEXTERNAL_TAX_AMOUNT */
	public List l_updiffEXTERNAL_TAX_AMOUNT = null;

	/** æ 620 ListÏF l_updiffINTERNAL_TAX_AMOUNT */
	public List l_updiffINTERNAL_TAX_AMOUNT = null;

	/** æ 621 ListÏF l_updiffTAX_AMOUNT_1 */
	public List l_updiffTAX_AMOUNT_1 = null;

	/** æ 622 ListÏF l_updiffTAX_AMOUNT_2 */
	public List l_updiffTAX_AMOUNT_2 = null;

	/** æ 623 ListÏF l_updiffTAX_AMOUNT_3 */
	public List l_updiffTAX_AMOUNT_3 = null;

	/** æ 624 ListÏF l_updiffOWN_CUR_TAXCREDIT_SALES_AMOUNT */
	public List l_updiffOWN_CUR_TAXCREDIT_SALES_AMOUNT = null;

	/** æ 625 ListÏF l_updiffSLIP_CD */
	public List l_updiffSLIP_CD = null;

	/** æ 626 ListÏF l_PAST_RESULT_ENTRY_TYP */
	public List l_PAST_RESULT_ENTRY_TYP = null;

	/** æ 627 ListÏF l_PROC_EXEC_DATE */
	public List l_PROC_EXEC_DATE = null;

	/** æ 628 ListÏF l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** æ 629 ListÏF l_mCustBase_TRANSPORT_LT */
	public List l_mCustBase_TRANSPORT_LT = null;

	/** æ 630 ListÏF l_mCustBase_IN_COMPANYCD */
	public List l_mCustBase_IN_COMPANYCD = null;

	/** æ 631 ListÏF l_mCustBase_IN_CUSTCD */
	public List l_mCustBase_IN_CUSTCD = null;

	/** æ 632 ListÏF l_mCustBase_IN_DLVLOCCD */
	public List l_mCustBase_IN_DLVLOCCD = null;

	/** æ 633 ListÏF l_strSYUKA_LT */
	public List l_strSYUKA_LT = null;

	/** æ 634 ListÏF l_strTaxIN_COMPANYCD */
	public List l_strTaxIN_COMPANYCD = null;

	/** æ 635 ListÏF l_strTaxIN_CUSTCD */
	public List l_strTaxIN_CUSTCD = null;

	/** æ 636 ListÏF l_g_CUST_ITEM_CD */
	public List l_g_CUST_ITEM_CD = null;

	/** æ 637 ListÏF l_strT_ODR_TAX */
	public List l_strT_ODR_TAX = null;

	/** æ 638 ListÏF l_g_SLIP_CD */
	public List l_g_SLIP_CD = null;

	/** æ 639 ListÏF l_getTship_SHIP_SEQ_NO */
	public List l_getTship_SHIP_SEQ_NO = null;

	/** æ 640 ListÏF l_chkLOT_NO */
	public List l_chkLOT_NO = null;

	/** æ 641 ListÏF l_chkITEM_CD */
	public List l_chkITEM_CD = null;

	/** æ 642 ListÏF l_getQtySTOCK_ON_HAND_QTY */
	public List l_getQtySTOCK_ON_HAND_QTY = null;

	/** æ 643 ListÏF l_getQtyALCD_QTY */
	public List l_getQtyALCD_QTY = null;

	/** æ 644 ListÏF l_getQtyITEM_CD */
	public List l_getQtyITEM_CD = null;

	/** æ 645 ListÏF l_getQtyWH_CD */
	public List l_getQtyWH_CD = null;

	/** æ 646 ListÏF l_getQtyLOT_NO */
	public List l_getQtyLOT_NO = null;

	/** æ 647 ListÏF l_readTlotStock_LOT_NO */
	public List l_readTlotStock_LOT_NO = null;

	/** æ 648 ListÏF l_readTlotStock_STOCK_ON_HAND_QTY */
	public List l_readTlotStock_STOCK_ON_HAND_QTY = null;

	/** æ 649 ListÏF l_readTlotStock_ALCD_QTY */
	public List l_readTlotStock_ALCD_QTY = null;

	/** æ 650 ListÏF l_readTlotStock_IN_ITEM_CD */
	public List l_readTlotStock_IN_ITEM_CD = null;

	/** æ 651 ListÏF l_readTlotStock_IN_WH_CD */
	public List l_readTlotStock_IN_WH_CD = null;

	/** æ 652 ListÏF l_readTlotStock_IN_LOT_NO */
	public List l_readTlotStock_IN_LOT_NO = null;

	/** æ 653 ListÏF l_upTlotStockSTOCK_ON_HAND_QTY */
	public List l_upTlotStockSTOCK_ON_HAND_QTY = null;

	/** æ 654 ListÏF l_upTlotStockIN_ITEM_CD */
	public List l_upTlotStockIN_ITEM_CD = null;

	/** æ 655 ListÏF l_upTlotStockIN_WH_CD */
	public List l_upTlotStockIN_WH_CD = null;

	/** æ 656 ListÏF l_upTlotStockIN_LOT_NO */
	public List l_upTlotStockIN_LOT_NO = null;

	/** æ 657 ListÏF l_serLotSTOCK_ON_HAND_QTY */
	public List l_serLotSTOCK_ON_HAND_QTY = null;

	/** æ 658 ListÏF l_serLotALCD_QTY */
	public List l_serLotALCD_QTY = null;

	/** æ 659 ListÏF l_serLotIN_ITEM_CD */
	public List l_serLotIN_ITEM_CD = null;

	/** æ 660 ListÏF l_serLotIN_WH_CD */
	public List l_serLotIN_WH_CD = null;

	/** æ 661 ListÏF l_serLotIN_LOT_NO */
	public List l_serLotIN_LOT_NO = null;

	/** æ 662 ListÏF l_insertLotStock_ITEM_CD */
	public List l_insertLotStock_ITEM_CD = null;

	/** æ 663 ListÏF l_insertLotStock_WH_CD */
	public List l_insertLotStock_WH_CD = null;

	/** æ 664 ListÏF l_insertLotStock_LOT_CD */
	public List l_insertLotStock_LOT_CD = null;

	/** æ 665 ListÏF l_insertLotStock_PLANT_CD */
	public List l_insertLotStock_PLANT_CD = null;

	/** æ 666 ListÏF l_insertLotStock_STOCK_ON_HAND_QTY */
	public List l_insertLotStock_STOCK_ON_HAND_QTY = null;

	/** æ 667 ListÏF l_insertLotStock_DEFECT_QTY */
	public List l_insertLotStock_DEFECT_QTY = null;

	/** æ 668 ListÏF l_insertLotStock_ALCD_QTY */
	public List l_insertLotStock_ALCD_QTY = null;

	/** æ 669 ListÏF l_insTshipInst_SHIP_SEQ_NO */
	public List l_insTshipInst_SHIP_SEQ_NO = null;

	/** æ 670 ListÏF l_insTshipInst_SHIP_ODR_NO */
	public List l_insTshipInst_SHIP_ODR_NO = null;

	/** æ 671 ListÏF l_insTshipInst_LOT_NO */
	public List l_insTshipInst_LOT_NO = null;

	/** æ 672 ListÏF l_insTshipInst_ITEM_CD */
	public List l_insTshipInst_ITEM_CD = null;

	/** æ 673 ListÏF l_insTshipInst_WH_CD */
	public List l_insTshipInst_WH_CD = null;

	/** æ 674 ListÏF l_insTshipInst_ODR_NO */
	public List l_insTshipInst_ODR_NO = null;

	/** æ 675 ListÏF l_insTshipInst_SLIP_CD */
	public List l_insTshipInst_SLIP_CD = null;

	/** æ 676 ListÏF l_insTshipInst_SHIP_QTY */
	public List l_insTshipInst_SHIP_QTY = null;

	/** æ 677 ListÏF l_insTshipInst_SHIP_DATE */
	public List l_insTshipInst_SHIP_DATE = null;

	/** æ 678 ListÏF l_delTshipInstIN_SHIP_SEQ_NO */
	public List l_delTshipInstIN_SHIP_SEQ_NO = null;

	/** æ 679 ListÏF l_delTshipInstIN_LOT_NO */
	public List l_delTshipInstIN_LOT_NO = null;

	/** æ 680 ListÏF l_tlotTrace_FROM_ITEM_CD */
	public List l_tlotTrace_FROM_ITEM_CD = null;

	/** æ 681 ListÏF l_tlotTrace_FROM_LOT_NO */
	public List l_tlotTrace_FROM_LOT_NO = null;

	/** æ 682 ListÏF l_tlotTrace_TO_ITEM_CD */
	public List l_tlotTrace_TO_ITEM_CD = null;

	/** æ 683 ListÏF l_tlotTrace_TO_LOT_NO */
	public List l_tlotTrace_TO_LOT_NO = null;

	/** æ 684 ListÏF l_tlotTrace_LOT_TRACE_TYP */
	public List l_tlotTrace_LOT_TRACE_TYP = null;

	/** æ 685 ListÏF l_tlotTrace_CUST_ODR_NO */
	public List l_tlotTrace_CUST_ODR_NO = null;

	/** æ 686 ListÏF l_tlotTrace_SLIP_CD */
	public List l_tlotTrace_SLIP_CD = null;

	/** æ 687 ListÏF l_tlotTrace_ODR_NO */
	public List l_tlotTrace_ODR_NO = null;

	/** æ 688 ListÏF l_readTshipInst_LOT_NO */
	public List l_readTshipInst_LOT_NO = null;

	/** æ 689 ListÏF l_readTshipInst_SHIP_QTY */
	public List l_readTshipInst_SHIP_QTY = null;

	/** æ 690 ListÏF l_readTshipInst_SHIP_ODR_NO */
	public List l_readTshipInst_SHIP_ODR_NO = null;

	/** æ 691 ListÏF l_readTshipInst_ITEM_CD */
	public List l_readTshipInst_ITEM_CD = null;

	/** æ 692 ListÏF l_readTshipInst_WH_CD */
	public List l_readTshipInst_WH_CD = null;

	/** æ 693 ListÏF l_readTshipInst_ODR_NO */
	public List l_readTshipInst_ODR_NO = null;

	/** æ 694 ListÏF l_readTshipInst_SLIP_CD */
	public List l_readTshipInst_SLIP_CD = null;

	/** æ 695 ListÏF l_readTshipInst_SHIP_DATE */
	public List l_readTshipInst_SHIP_DATE = null;

	/** æ 696 ListÏF l_readTshipInst_IN_SHIP_SEQ_NO */
	public List l_readTshipInst_IN_SHIP_SEQ_NO = null;

	/** æ 697 ListÏF l_readTshipInst_IN_LOT_NO */
	public List l_readTshipInst_IN_LOT_NO = null;

	/** æ 698 ListÏF l_readT_Ship_Inst_Lot_NO */
	public List l_readT_Ship_Inst_Lot_NO = null;

	/** æ 699 ListÏF l_readT_Ship_Inst_Ship_Seq_NO */
	public List l_readT_Ship_Inst_Ship_Seq_NO = null;

	/** æ 700 ListÏF l_strOdrCurrncyCd */
	public List l_strOdrCurrncyCd = null;

	/** æ 701 ListÏF l_strExchTyp */
	public List l_strExchTyp = null;

	/** æ 702 ListÏF l_g_DATE */
	public List l_g_DATE = null;

	/** æ 703 ListÏF l_selTShipOdr_MODIFY_COUNT */
	public List l_selTShipOdr_MODIFY_COUNT = null;

	/** æ 704 ListÏF l_SEL_MODIFY_COUNT */
	public List l_SEL_MODIFY_COUNT = null;


	//////////////////////////////

	// mediatorÏp(get|set)\bh

	public String getk_MODE() { return m_k_MODE; }
	public String geth_RESULT() { return m_h_RESULT; }
	public String getr_SEL_PTN() { return m_r_SEL_PTN; }
	public String getg_DESINATED_SHIP_DATE() { return m_g_DESINATED_SHIP_DATE; }
	public String getg_SHIP_QTY() { return m_g_SHIP_QTY; }
	public String getg_SHIP_QTY2() { return m_g_SHIP_QTY2; }
	public String getg_UNIT_PRICE() { return m_g_UNIT_PRICE; }
	public String getg_CURRNCY() { return m_g_CURRNCY; }
	public String getg_SHIP_ODR_AMOUNT() { return m_g_SHIP_ODR_AMOUNT; }
	public String getg_WH_CD() { return m_g_WH_CD; }
	public String getg_REMARKS() { return m_g_REMARKS; }
	public String getg_CUST_ANAME() { return m_g_CUST_ANAME; }
	public String getg_ITEM_CD() { return m_g_ITEM_CD; }
	public String geth_AP_SECRTY_TYP() { return m_h_AP_SECRTY_TYP; }
	public String geth_SHIP_QTY() { return m_h_SHIP_QTY; }
	public String geth_ITEM_CD() { return m_h_ITEM_CD; }
	public String geth_GYOMU_DATE() { return m_h_GYOMU_DATE; }
	public String geth_EXCH_TYP() { return m_h_EXCH_TYP; }
	public String geth_MODFIY_CNT() { return m_h_MODFIY_CNT; }
	public String geth_TOTAL_SHIP_QTY() { return m_h_TOTAL_SHIP_QTY; }
	public String getm_selRadio() { return m_m_selRadio; }
	public String getr_SEL_PTN1() { return m_r_SEL_PTN1; }
	public String getr_SEL_PTN2() { return m_r_SEL_PTN2; }
	public String getr_SEL_PTN3() { return m_r_SEL_PTN3; }
	public String geth_SELECT_FG() { return m_h_SELECT_FG; }
	public String geth_UNIT_PRICE() { return m_h_UNIT_PRICE; }
	public String getg_STOCK_UNIT() { return m_g_STOCK_UNIT; }
	public String getg_STOCK_UNIT2() { return m_g_STOCK_UNIT2; }
	public String getg_CUR_UNIT2() { return m_g_CUR_UNIT2; }
	public String getg_WH_NAME() { return m_g_WH_NAME; }
	public String getg_SALES_DEPT_CD() { return m_g_SALES_DEPT_CD; }
	public String getg_ORG_NAME() { return m_g_ORG_NAME; }
	public String getg_CUST_CD() { return m_g_CUST_CD; }
	public String getg_CUST_ITEM_NAME() { return m_g_CUST_ITEM_NAME; }
	public String getg_ITEM_NAME() { return m_g_ITEM_NAME; }
	public String getg_CUST_ODR_NO() { return m_g_CUST_ODR_NO; }
	public String getg_ODR_NO() { return m_g_ODR_NO; }
	public String getg_PART_DLV_SEQ_NO() { return m_g_PART_DLV_SEQ_NO; }
	public String getg_SHIP_ODR_NO() { return m_g_SHIP_ODR_NO; }
	public String geth_DATE() { return m_h_DATE; }
	public String getg_JOB_ODR_CD() { return m_g_JOB_ODR_CD; }
	public String getc_JOB_ODR_CD() { return m_c_JOB_ODR_CD; }
	public String getg_DIRECT_DLV_FLG() { return m_g_DIRECT_DLV_FLG; }
	public String getg_STOCK_LOT_CD() { return m_g_STOCK_LOT_CD; }
	public String geth_STOCK_LOT_CD() { return m_h_STOCK_LOT_CD; }
	public String getparam1() { return m_param1; }
	public String getparam2() { return m_param2; }
	public String getparam3() { return m_param3; }
	public String getROUND_TYP() { return m_ROUND_TYP; }
	public String getUNIT_QTY_TYP() { return m_UNIT_QTY_TYP; }
	public String getUNIT_FIG() { return m_UNIT_FIG; }
	public String getstrCOMPANY_CD() { return m_strCOMPANY_CD; }
	public String getstrUSER_NAME() { return m_strUSER_NAME; }
	public String getstrPLANT_CD() { return m_strPLANT_CD; }
	public String getstrSECTION_CD() { return m_strSECTION_CD; }
	public String getstrORG_CD() { return m_strORG_CD; }
	public String getstrORG_NAME() { return m_strORG_NAME; }
	public String getstrORG_ANAME() { return m_strORG_ANAME; }
	public String getstrPLANT_NAME() { return m_strPLANT_NAME; }
	public String getstrPLANT_ANAME() { return m_strPLANT_ANAME; }
	public Double getstrCAL_NO() { return m_strCAL_NO; }
	public String getstrUSER_CD() { return m_strUSER_CD; }
	public String getstrBUSINESS_OPR_DATE() { return m_strBUSINESS_OPR_DATE; }
	public String getserTori_SHIP_SEQ_NO() { return m_serTori_SHIP_SEQ_NO; }
	public String getserTori_SHIP_ODR_NO() { return m_serTori_SHIP_ODR_NO; }
	public String getserTori_SLIP_CD() { return m_serTori_SLIP_CD; }
	public String getserTori_ODR_NO() { return m_serTori_ODR_NO; }
	public String getserTori_PART_DLV_SEQ_NO() { return m_serTori_PART_DLV_SEQ_NO; }
	public String getserTori_ORGNAL_SLIP_CD() { return m_serTori_ORGNAL_SLIP_CD; }
	public String getserTori_SLIP_TRN_CD() { return m_serTori_SLIP_TRN_CD; }
	public String getserTori_ITEM_CD() { return m_serTori_ITEM_CD; }
	public String getserTori_JOB_ODR_CD() { return m_serTori_JOB_ODR_CD; }
	public String getserTori_CUST_ITEM_CD() { return m_serTori_CUST_ITEM_CD; }
	public String getserTori_CUST_ODR_NO() { return m_serTori_CUST_ODR_NO; }
	public String getserTori_CUST_CD() { return m_serTori_CUST_CD; }
	public String getserTori_CUST_NAME() { return m_serTori_CUST_NAME; }
	public String getserTori_CUST_CHRG_PSN_CD() { return m_serTori_CUST_CHRG_PSN_CD; }
	public String getserTori_SHIP_ODR_ISS_PSN_CD() { return m_serTori_SHIP_ODR_ISS_PSN_CD; }
	public String getserTori_DLV_LOC_CD() { return m_serTori_DLV_LOC_CD; }
	public String getserTori_DEPO_TYP() { return m_serTori_DEPO_TYP; }
	public String getserTori_ALLCT_WH_CD() { return m_serTori_ALLCT_WH_CD; }
	public String getserTori_DEPO_WH_CD() { return m_serTori_DEPO_WH_CD; }
	public String getserTori_LOC_CD() { return m_serTori_LOC_CD; }
	public String getserTori_SHIP_DATE() { return m_serTori_SHIP_DATE; }
	public String getserTori_SHIP_QTY() { return m_serTori_SHIP_QTY; }
	public String getserTori_UNIT_CD() { return m_serTori_UNIT_CD; }
	public String getserTori_SHIP_UNIT_PRICE() { return m_serTori_SHIP_UNIT_PRICE; }
	public String getserTori_SHIP_ODR_AMOUNT() { return m_serTori_SHIP_ODR_AMOUNT; }
	public String getserTori_SHIP_ODR_AMOUNT_EXCH_RATES() { return m_serTori_SHIP_ODR_AMOUNT_EXCH_RATES; }
	public String getserTori_CURRNCY_CD() { return m_serTori_CURRNCY_CD; }
	public String getserTori_DIRECT_DLV_FLG() { return m_serTori_DIRECT_DLV_FLG; }
	public String getserTori_SHIP_INFO_IF_CTRL_NO() { return m_serTori_SHIP_INFO_IF_CTRL_NO; }
	public String getserTori_INSPC_ACPT_INFO_IF_CTRL_NO() { return m_serTori_INSPC_ACPT_INFO_IF_CTRL_NO; }
	public String getserTori_DLV_KEY_NO() { return m_serTori_DLV_KEY_NO; }
	public String getserTori_DEL_FLG() { return m_serTori_DEL_FLG; }
	public String getserTori_CUR_NAME() { return m_serTori_CUR_NAME; }
	public String getserTori_EXCH_TYP() { return m_serTori_EXCH_TYP; }
	public String getserTori_MODIFY_COUNT() { return m_serTori_MODIFY_COUNT; }
	public String getserTori_RETURN_QTY() { return m_serTori_RETURN_QTY; }
	public String getserTori_TOTAL_SHIP_QTY() { return m_serTori_TOTAL_SHIP_QTY; }
	public String getserTori_STATUS() { return m_serTori_STATUS; }
	public String getserTori_INSPC_ACPT_TYP() { return m_serTori_INSPC_ACPT_TYP; }
	public String getserToriSALES_DEPT_CD() { return m_serToriSALES_DEPT_CD; }
	public String getserToriSALES_DATE() { return m_serToriSALES_DATE; }
	public String geth_MRP_ODR_TYP() { return m_h_MRP_ODR_TYP; }
	public String geth_LOT_CTRL_FLG() { return m_h_LOT_CTRL_FLG; }
	public String getserTodrMODIFY_COUNT() { return m_serTodrMODIFY_COUNT; }
	public String getserTori_IN_SLIPCD() { return m_serTori_IN_SLIPCD; }
	public String getcreTship_SHIP_SEQ_NO() { return m_creTship_SHIP_SEQ_NO; }
	public String getcreTship_SHIP_ODR_NO() { return m_creTship_SHIP_ODR_NO; }
	public String getcreTship_SLIP_CD() { return m_creTship_SLIP_CD; }
	public String getcreTship_ODR_NO() { return m_creTship_ODR_NO; }
	public String getcreTship_PART_DLV_SEQ_NO() { return m_creTship_PART_DLV_SEQ_NO; }
	public String getcreTship_ORGNAL_SLIP_CD() { return m_creTship_ORGNAL_SLIP_CD; }
	public String getcreTship_SLIP_TRN_CD() { return m_creTship_SLIP_TRN_CD; }
	public String getcreTship_ITEM_CD() { return m_creTship_ITEM_CD; }
	public String getcreTship_JOB_ODR_CD() { return m_creTship_JOB_ODR_CD; }
	public String getcreTship_CUST_ITEM_CD() { return m_creTship_CUST_ITEM_CD; }
	public String getcreTship_CUST_ODR_NO() { return m_creTship_CUST_ODR_NO; }
	public String getcreTship_CUST_CD() { return m_creTship_CUST_CD; }
	public String getcreTship_CUST_NAME() { return m_creTship_CUST_NAME; }
	public String getcreTship_CUST_CHRG_PSN_CD() { return m_creTship_CUST_CHRG_PSN_CD; }
	public String getcreTship_SHIP_ODR_ISS_PSN_CD() { return m_creTship_SHIP_ODR_ISS_PSN_CD; }
	public String getcreTship_DLV_LOC_CD() { return m_creTship_DLV_LOC_CD; }
	public String getcreTship_DEPO_TYP() { return m_creTship_DEPO_TYP; }
	public String getcreTship_ALLCT_WH_CD() { return m_creTship_ALLCT_WH_CD; }
	public String getcreTship_DEPO_WH_CD() { return m_creTship_DEPO_WH_CD; }
	public String getcreTship_LOC_CD() { return m_creTship_LOC_CD; }
	public String getcreTship_SHIP_DATE() { return m_creTship_SHIP_DATE; }
	public String getcreTship_SHIP_QTY() { return m_creTship_SHIP_QTY; }
	public String getcreTship_UNIT_CD() { return m_creTship_UNIT_CD; }
	public String getcreTship_SHIP_UNIT_PRICE() { return m_creTship_SHIP_UNIT_PRICE; }
	public String getcreTship_SHIP_ODR_AMOUNT() { return m_creTship_SHIP_ODR_AMOUNT; }
	public String getcreTship_SHIP_ODR_AMOUNT_EXCH_RATES() { return m_creTship_SHIP_ODR_AMOUNT_EXCH_RATES; }
	public String getcreTship_CURRNCY_CD() { return m_creTship_CURRNCY_CD; }
	public String getcreTship_DIRECT_DLV_FLG() { return m_creTship_DIRECT_DLV_FLG; }
	public String getcreTship_DLV_KEY_NO() { return m_creTship_DLV_KEY_NO; }
	public String getcreTship_REMARKS() { return m_creTship_REMARKS; }
	public String getcreTship_DEL_FLG() { return m_creTship_DEL_FLG; }
	public String getupdTship_SHIP_SEQ_NO() { return m_updTship_SHIP_SEQ_NO; }
	public String getserInsert_SHIP_ODR_NO() { return m_serInsert_SHIP_ODR_NO; }
	public String getserInsert_ODR_NO() { return m_serInsert_ODR_NO; }
	public String getserInsert_PART_DLV_SEQ_NO() { return m_serInsert_PART_DLV_SEQ_NO; }
	public String getserInsert_SLIP_CD() { return m_serInsert_SLIP_CD; }
	public String getserInsert_ITEM_CD() { return m_serInsert_ITEM_CD; }
	public String getserInsert_JOB_ODR_CD() { return m_serInsert_JOB_ODR_CD; }
	public String getserInsert_CUST_ITEM_CD() { return m_serInsert_CUST_ITEM_CD; }
	public String getserInsert_CUST_ODR_NO() { return m_serInsert_CUST_ODR_NO; }
	public String getserInsert_CUST_CD() { return m_serInsert_CUST_CD; }
	public String getserInsert_CUST_NAME() { return m_serInsert_CUST_NAME; }
	public String getserInsert_CUST_CHRG_PSN_CD() { return m_serInsert_CUST_CHRG_PSN_CD; }
	public String getserInsert_SHIP_ODR_ISS_PSN_CD() { return m_serInsert_SHIP_ODR_ISS_PSN_CD; }
	public String getserInsert_DLV_LOC_CD() { return m_serInsert_DLV_LOC_CD; }
	public String getserInsert_DEPO_TYP() { return m_serInsert_DEPO_TYP; }
	public String getserInsert_DESINATED_SHIP_DATE() { return m_serInsert_DESINATED_SHIP_DATE; }
	public String getserInsert_SHIP_QTY() { return m_serInsert_SHIP_QTY; }
	public String getserInsert_TOTAL_SHIP_QTY() { return m_serInsert_TOTAL_SHIP_QTY; }
	public String getserInsert_UNIT_CD() { return m_serInsert_UNIT_CD; }
	public String getserInsert_UNIT_PRICE() { return m_serInsert_UNIT_PRICE; }
	public String getserInsert_SHIP_ODR_AMOUNT() { return m_serInsert_SHIP_ODR_AMOUNT; }
	public String getserInsert_SHIP_ODR_AMOUNT_EXCH_RATES() { return m_serInsert_SHIP_ODR_AMOUNT_EXCH_RATES; }
	public String getserInsert_CURRNCY_CD() { return m_serInsert_CURRNCY_CD; }
	public String getserInsert_LOC_CD() { return m_serInsert_LOC_CD; }
	public String getserInsert_PKG_UNIT_QTY() { return m_serInsert_PKG_UNIT_QTY; }
	public String getserInsert_REMARKS() { return m_serInsert_REMARKS; }
	public String getserInsert_TRANSPORT_CD() { return m_serInsert_TRANSPORT_CD; }
	public String getserInsert_TRANSPORT_TYP() { return m_serInsert_TRANSPORT_TYP; }
	public String getserInsert_ALLCT_WH_CD() { return m_serInsert_ALLCT_WH_CD; }
	public String getserInsert_TRANSFER_WH_CD() { return m_serInsert_TRANSFER_WH_CD; }
	public String getserInsert_DIRECT_DLV_FLG() { return m_serInsert_DIRECT_DLV_FLG; }
	public String getserInsert_ENTRY_TYP() { return m_serInsert_ENTRY_TYP; }
	public String getserInsert_PRINT_FLG() { return m_serInsert_PRINT_FLG; }
	public String getserInsert_SHP_CMPLT_FLG() { return m_serInsert_SHP_CMPLT_FLG; }
	public String getserInsert_DEPO_TRANSFER_PROC_FLG() { return m_serInsert_DEPO_TRANSFER_PROC_FLG; }
	public String getserInsert_DEL_FLG() { return m_serInsert_DEL_FLG; }
	public String getserInsert_CUR_CD() { return m_serInsert_CUR_CD; }
	public String getserInsert_CUR_NAME() { return m_serInsert_CUR_NAME; }
	public String getserInsert_EXCH_TYP() { return m_serInsert_EXCH_TYP; }
	public String getserInsert_SPCL_PRICE_TYP() { return m_serInsert_SPCL_PRICE_TYP; }
	public String getserInsert_MODIFY_COUNT() { return m_serInsert_MODIFY_COUNT; }
	public String getserInsert_SCDL_DLV_DATE() { return m_serInsert_SCDL_DLV_DATE; }
	public String getserInsert_DLV_KEY_NO() { return m_serInsert_DLV_KEY_NO; }
	public String geth_RETURN_QTY() { return m_h_RETURN_QTY; }
	public String getserInsert_ODR_ACPT_DATE() { return m_serInsert_ODR_ACPT_DATE; }
	public String geth_JOB_ODR_CD() { return m_h_JOB_ODR_CD; }
	public String getselMODIFY_COUNT() { return m_selMODIFY_COUNT; }
	public String getserInsert_IN_SLIPCD() { return m_serInsert_IN_SLIPCD; }
	public String getupTshipOdr_DEPO_TRANSFER_PROC_FLG() { return m_upTshipOdr_DEPO_TRANSFER_PROC_FLG; }
	public String getupTshipOdr_IN_SLIPCD() { return m_upTshipOdr_IN_SLIPCD; }
	public String getchkisWhCd_WH_CD() { return m_chkisWhCd_WH_CD; }
	public String getchkisWhCd_WH_TYP() { return m_chkisWhCd_WH_TYP; }
	public String getchkisinWhCd_WH_NAME() { return m_chkisinWhCd_WH_NAME; }
	public String getchkisWhCd_IN_WHCD() { return m_chkisWhCd_IN_WHCD; }
	public String getchkisWhCd_IN_WHTYP() { return m_chkisWhCd_IN_WHTYP; }
	public String getcreTsales_SHIP_ODR_NO() { return m_creTsales_SHIP_ODR_NO; }
	public String getcreTsales_SLIP_CD() { return m_creTsales_SLIP_CD; }
	public String getcreTsales_SALES_TYP() { return m_creTsales_SALES_TYP; }
	public String getcreTsales_CUST_CD() { return m_creTsales_CUST_CD; }
	public String getcreTsales_ITEM_CD() { return m_creTsales_ITEM_CD; }
	public String getcreTsales_ITEM_NAME() { return m_creTsales_ITEM_NAME; }
	public String getcreTsales_CUST_ODR_NO() { return m_creTsales_CUST_ODR_NO; }
	public String getcreTsales_SALES_DATE() { return m_creTsales_SALES_DATE; }
	public String getcreTsales_SALES_DEPT_CD() { return m_creTsales_SALES_DEPT_CD; }
	public String getcreTsales_CUST_CHRG_PSN_CD() { return m_creTsales_CUST_CHRG_PSN_CD; }
	public String getcreTsales_ODR_ACPT_PSN_CD() { return m_creTsales_ODR_ACPT_PSN_CD; }
	public String getcreTsales_SALES_QTY() { return m_creTsales_SALES_QTY; }
	public String getcreTsales_SALES_UNIT_PRICE() { return m_creTsales_SALES_UNIT_PRICE; }
	public String getcreTsales_UNIT_CD() { return m_creTsales_UNIT_CD; }
	public String getcreTsales_SALES_AMOUNT() { return m_creTsales_SALES_AMOUNT; }
	public String getcreTsales_SALES_AMOUNT_EXCH_RATES() { return m_creTsales_SALES_AMOUNT_EXCH_RATES; }
	public String getcreTsales_INSPC_ACPT_DATE() { return m_creTsales_INSPC_ACPT_DATE; }
	public String getcreTsales_INSPC_ACPT_QTY() { return m_creTsales_INSPC_ACPT_QTY; }
	public String getcreTsales_EXTERNAL_TAX_SALES_AMOUNT() { return m_creTsales_EXTERNAL_TAX_SALES_AMOUNT; }
	public String getcreTsales_INTERNAL_TAX_SALES_AMOUNT() { return m_creTsales_INTERNAL_TAX_SALES_AMOUNT; }
	public String getcreTsales_TAXFREE_SALES_AMOUNT() { return m_creTsales_TAXFREE_SALES_AMOUNT; }
	public String getcreTsales_TAX_CREDIT_SALES_AMOUNT() { return m_creTsales_TAX_CREDIT_SALES_AMOUNT; }
	public String getcreTsales_EXTERNAL_TAX_AMOUNT() { return m_creTsales_EXTERNAL_TAX_AMOUNT; }
	public String getcreTsales_INTERNAL_TAX_AMOUNT() { return m_creTsales_INTERNAL_TAX_AMOUNT; }
	public String getcreTsales_TAX_AMOUNT_1() { return m_creTsales_TAX_AMOUNT_1; }
	public String getcreTsales_TAX_AMOUNT_2() { return m_creTsales_TAX_AMOUNT_2; }
	public String getcreTsales_TAX_AMOUNT_3() { return m_creTsales_TAX_AMOUNT_3; }
	public String getcreTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT() { return m_creTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT; }
	public String getcreTsales_ORG_SLIP_CD() { return m_creTsales_ORG_SLIP_CD; }
	public String getcreTsales_CURRNCY_CD() { return m_creTsales_CURRNCY_CD; }
	public String getcreTsales_SPCL_PRICE_CO() { return m_creTsales_SPCL_PRICE_CO; }
	public String getcreTsales_REMARKS() { return m_creTsales_REMARKS; }
	public String getcreTsales_DEL_FLG() { return m_creTsales_DEL_FLG; }
	public String getcreTsales_INSPC_ACPT_TYP() { return m_creTsales_INSPC_ACPT_TYP; }
	public String getcreTsales_STATUS() { return m_creTsales_STATUS; }
	public String getcreTsales_APPR_FLG() { return m_creTsales_APPR_FLG; }
	public String getcreTsales_APPR_ID() { return m_creTsales_APPR_ID; }
	public String getcreTsales_APPR_DATE() { return m_creTsales_APPR_DATE; }
	public String getcreTsales_EXCH_RATE() { return m_creTsales_EXCH_RATE; }
	public String getserTsales_SALES_SEQ_NO() { return m_serTsales_SALES_SEQ_NO; }
	public String getserTsales_SLIP_CD() { return m_serTsales_SLIP_CD; }
	public String getserTsales_SALES_TYP() { return m_serTsales_SALES_TYP; }
	public String getserTsales_CUST_CD() { return m_serTsales_CUST_CD; }
	public String getserTsales_ITEM_CD() { return m_serTsales_ITEM_CD; }
	public String getserTsales_ITEM_NAME() { return m_serTsales_ITEM_NAME; }
	public String getserTsales_CUST_ODR_NO() { return m_serTsales_CUST_ODR_NO; }
	public String getserTsales_SALES_DATE() { return m_serTsales_SALES_DATE; }
	public String getserTsales_SALES_DEPT_CD() { return m_serTsales_SALES_DEPT_CD; }
	public String getserTsales_CUST_CHRG_PSN_CD() { return m_serTsales_CUST_CHRG_PSN_CD; }
	public String getserTsales_ODR_ACPT_PSN_CD() { return m_serTsales_ODR_ACPT_PSN_CD; }
	public String getserTsales_SALES_QTY() { return m_serTsales_SALES_QTY; }
	public String getserTsales_SALES_UNIT_PRICE() { return m_serTsales_SALES_UNIT_PRICE; }
	public String getserTsales_UNIT_CD() { return m_serTsales_UNIT_CD; }
	public String getserTsales_SALES_AMOUNT() { return m_serTsales_SALES_AMOUNT; }
	public String getserTsales_SALES_AMOUNT_EXCH_RATES() { return m_serTsales_SALES_AMOUNT_EXCH_RATES; }
	public String getserTsales_EXTERNAL_TAX_SALES_AMOUNT() { return m_serTsales_EXTERNAL_TAX_SALES_AMOUNT; }
	public String getserTsales_INTERNAL_TAX_SALES_AMOUNT() { return m_serTsales_INTERNAL_TAX_SALES_AMOUNT; }
	public String getserTsales_TAXFREE_SALES_AMOUNT() { return m_serTsales_TAXFREE_SALES_AMOUNT; }
	public String getserTsales_TAX_CREDIT_SALES_AMOUNT() { return m_serTsales_TAX_CREDIT_SALES_AMOUNT; }
	public String getserTsales_EXTERNAL_TAX_AMOUNT() { return m_serTsales_EXTERNAL_TAX_AMOUNT; }
	public String getserTsales_INTERNAL_TAX_AMOUNT() { return m_serTsales_INTERNAL_TAX_AMOUNT; }
	public String getserTsales_TAX_AMOUNT_1() { return m_serTsales_TAX_AMOUNT_1; }
	public String getserTsales_TAX_AMOUNT_2() { return m_serTsales_TAX_AMOUNT_2; }
	public String getserTsales_TAX_AMOUNT_3() { return m_serTsales_TAX_AMOUNT_3; }
	public String getserTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT() { return m_serTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT; }
	public String getserTsales_ORG_SLIP_CD() { return m_serTsales_ORG_SLIP_CD; }
	public String getserTsales_CURRNCY_CD() { return m_serTsales_CURRNCY_CD; }
	public String getserTsales_SPCL_PRICE_CO() { return m_serTsales_SPCL_PRICE_CO; }
	public String getserTsales_REMARKS() { return m_serTsales_REMARKS; }
	public String getserTsales_DEL_FLG() { return m_serTsales_DEL_FLG; }
	public String getserTsales_INSPC_ACPT_TYP() { return m_serTsales_INSPC_ACPT_TYP; }
	public String getserTsales_STATUS() { return m_serTsales_STATUS; }
	public String getserTsales_PRD_ODR_PLACE_CD() { return m_serTsales_PRD_ODR_PLACE_CD; }
	public String getserTsales_EXCH_RATE() { return m_serTsales_EXCH_RATE; }
	public String getserTsales_IN_SLIPCD() { return m_serTsales_IN_SLIPCD; }
	public String getupdTsales_APPR_FLG() { return m_updTsales_APPR_FLG; }
	public String getupdTsales_APPR_ID() { return m_updTsales_APPR_ID; }
	public String getupdTsales_APPR_DATE() { return m_updTsales_APPR_DATE; }
	public String getupdTsales_SALES_SEQ_NO() { return m_updTsales_SALES_SEQ_NO; }
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
	public String getmItemSpec_CUST_CD() { return m_mItemSpec_CUST_CD; }
	public String getmItemSpec_CUST_ITEM_CD() { return m_mItemSpec_CUST_ITEM_CD; }
	public String getmItemSpec_COMPANY_CD() { return m_mItemSpec_COMPANY_CD; }
	public String getmItemSpec_SALES_DEPT_CD() { return m_mItemSpec_SALES_DEPT_CD; }
	public String getmItemSpec_CUST_ITEM_NAME() { return m_mItemSpec_CUST_ITEM_NAME; }
	public String getmItemSpec_IN_CUST_CD() { return m_mItemSpec_IN_CUST_CD; }
	public String getmItemSpec_IN_CUST_ITEM_CD() { return m_mItemSpec_IN_CUST_ITEM_CD; }
	public String getmItemSpec_IN_COMPANY_CD() { return m_mItemSpec_IN_COMPANY_CD; }
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
	public String gettOdr_DLV_KEY_NO() { return m_tOdr_DLV_KEY_NO; }
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
	public String gettOdr_DEL_FLG() { return m_tOdr_DEL_FLG; }
	public String gettOdr_SHIP_CNT() { return m_tOdr_SHIP_CNT; }
	public String gettOdr_UNIT_CD_ORG() { return m_tOdr_UNIT_CD_ORG; }
	public String gettOdrCtl_CUST_ITEM_CD() { return m_tOdrCtl_CUST_ITEM_CD; }
	public String gettOdr_COCK_TYP() { return m_tOdr_COCK_TYP; }
	public String gettOdr_PUCH_ODR_QTY_TOTAL() { return m_tOdr_PUCH_ODR_QTY_TOTAL; }
	public String gettOdr_BUYER_ORG_CD() { return m_tOdr_BUYER_ORG_CD; }
	public String gettOdr_BUYER_NAME() { return m_tOdr_BUYER_NAME; }
	public String gettOdr_IN_ODRNO() { return m_tOdr_IN_ODRNO; }
	public String getcreTodrODR_NO() { return m_creTodrODR_NO; }
	public String getcreTodrODR_TYP() { return m_creTodrODR_TYP; }
	public String getcreTodrODR_CTL_NO() { return m_creTodrODR_CTL_NO; }
	public String getcreTodrCUST_ODR_NO() { return m_creTodrCUST_ODR_NO; }
	public String getcreTodrCUST_CHRG_ORG_CD() { return m_creTodrCUST_CHRG_ORG_CD; }
	public String getcreTodrCUST_CHRG_PSN_CD() { return m_creTodrCUST_CHRG_PSN_CD; }
	public String getcreTodrODR_ACPT_ORG_CD() { return m_creTodrODR_ACPT_ORG_CD; }
	public String getcreTodrODR_ACPT_PSN_CD() { return m_creTodrODR_ACPT_PSN_CD; }
	public String getcreTodrCURRNCY_CD() { return m_creTodrCURRNCY_CD; }
	public String getcreTodrEXCH_TYP() { return m_creTodrEXCH_TYP; }
	public String getcreTodrDLV_LOC_CD() { return m_creTodrDLV_LOC_CD; }
	public String getcreTodrDLV_LOC_NAME() { return m_creTodrDLV_LOC_NAME; }
	public String getcreTodrDLV_LOC_NAME_KANJI() { return m_creTodrDLV_LOC_NAME_KANJI; }
	public String getcreTodrPRD_ODR_PLACE_CD() { return m_creTodrPRD_ODR_PLACE_CD; }
	public String getcreTodrODR_UNIT_PRICE() { return m_creTodrODR_UNIT_PRICE; }
	public String getcreTodrPART_DLV_COUNT() { return m_creTodrPART_DLV_COUNT; }
	public String getcreTodrDEPO_TYP() { return m_creTodrDEPO_TYP; }
	public String getcreTodrDESINATED_DLV_DATE() { return m_creTodrDESINATED_DLV_DATE; }
	public String getcreTodrODR_QTY() { return m_creTodrODR_QTY; }
	public String getcreTodrREMAIN_UNCONFIRM_ODR_QTY() { return m_creTodrREMAIN_UNCONFIRM_ODR_QTY; }
	public String getcreTodrCANCELED_UNCONFIRM_ODR_QTY() { return m_creTodrCANCELED_UNCONFIRM_ODR_QTY; }
	public String getcreTodrUNIT_CD() { return m_creTodrUNIT_CD; }
	public String getcreTodrUNCONFIRM_ODR_BALANCE() { return m_creTodrUNCONFIRM_ODR_BALANCE; }
	public String getcreTodrODR_AMOUNT() { return m_creTodrODR_AMOUNT; }
	public String getcreTodrODR_AMOUNT_EXCH_RATES() { return m_creTodrODR_AMOUNT_EXCH_RATES; }
	public String getcreTodrTOTAL_SHIP_QTY() { return m_creTodrTOTAL_SHIP_QTY; }
	public String getcreTodrSHIP_AMOUNT() { return m_creTodrSHIP_AMOUNT; }
	public String getcreTodrSHIP_AMOUNT_EXCH_RATES() { return m_creTodrSHIP_AMOUNT_EXCH_RATES; }
	public String getcreTodrODR_CMPLT_FLG() { return m_creTodrODR_CMPLT_FLG; }
	public String getcreTodrODR_CMPLT_DATE() { return m_creTodrODR_CMPLT_DATE; }
	public String getcreTodrREMARKS() { return m_creTodrREMARKS; }
	public String getcreTodrODR_ACPT_DATE() { return m_creTodrODR_ACPT_DATE; }
	public String getcreTodrSHIP_PLAN_REMAIN_QTY() { return m_creTodrSHIP_PLAN_REMAIN_QTY; }
	public String getcreTodrSHIP_PLAN_CMPLT_FLG() { return m_creTodrSHIP_PLAN_CMPLT_FLG; }
	public String getcreTodrUNCONFIRMED_ODR_EFF_OVR_FLG() { return m_creTodrUNCONFIRMED_ODR_EFF_OVR_FLG; }
	public String getcreTodrPARTIAL_SHIP_INST_FLG() { return m_creTodrPARTIAL_SHIP_INST_FLG; }
	public String getcreTodrENTRY_TYP() { return m_creTodrENTRY_TYP; }
	public String getcreTodrDEL_FLG() { return m_creTodrDEL_FLG; }
	public String getupTodr_TOTAL_SHIP_QTY() { return m_upTodr_TOTAL_SHIP_QTY; }
	public String getupTodr_SHIP_AMOUNT() { return m_upTodr_SHIP_AMOUNT; }
	public String getupTodr_SHIP_AMOUNT_EXCH_RATES() { return m_upTodr_SHIP_AMOUNT_EXCH_RATES; }
	public String getupTodr_ODR_CMPLT_FLG() { return m_upTodr_ODR_CMPLT_FLG; }
	public String getupTodr_ODR_CMPLT_DATE() { return m_upTodr_ODR_CMPLT_DATE; }
	public String getupTodr_IN_ODRNO() { return m_upTodr_IN_ODRNO; }
	public String getcreTrcvIssue_RCV_ISSUE_CTRL_CD() { return m_creTrcvIssue_RCV_ISSUE_CTRL_CD; }
	public String getcreTrcvIssue_RCV_ISSUE_TYP() { return m_creTrcvIssue_RCV_ISSUE_TYP; }
	public String getcreTrcvIssue_ITEM_CD() { return m_creTrcvIssue_ITEM_CD; }
	public String getcreTrcvIssue_JOB_ODR_CD() { return m_creTrcvIssue_JOB_ODR_CD; }
	public String getcreTrcvIssue_PLANT_CD() { return m_creTrcvIssue_PLANT_CD; }
	public String getcreTrcvIssue_WH_CD() { return m_creTrcvIssue_WH_CD; }
	public String getcreTrcvIssue_RCV_ISSUE_BEFORE_QTY() { return m_creTrcvIssue_RCV_ISSUE_BEFORE_QTY; }
	public String getcreTrcvIssue_RCV_ISSUE_QTY() { return m_creTrcvIssue_RCV_ISSUE_QTY; }
	public String getcreTrcvIssue_RCV_ISSUE_AFTER_QTY() { return m_creTrcvIssue_RCV_ISSUE_AFTER_QTY; }
	public String getcreTrcvIssue_RCV_ISSUE_AMOUNT() { return m_creTrcvIssue_RCV_ISSUE_AMOUNT; }
	public String getcreTrcvIssue_RCV_ISSUE_DATE() { return m_creTrcvIssue_RCV_ISSUE_DATE; }
	public String getcreTrcvIssue_RCV_ISSUE_GNR_TYP() { return m_creTrcvIssue_RCV_ISSUE_GNR_TYP; }
	public String getcreTrcvIssue_STOCK_UPD_TYP() { return m_creTrcvIssue_STOCK_UPD_TYP; }
	public String getcreTrcvIssue_RCV_ISSUE_CMPLT_FLG() { return m_creTrcvIssue_RCV_ISSUE_CMPLT_FLG; }
	public String getcreTrcvIssue_RCV_ISSUE_COMMENT() { return m_creTrcvIssue_RCV_ISSUE_COMMENT; }
	public String getcreTrcvIssue_LOT_NO() { return m_creTrcvIssue_LOT_NO; }
	public String getcreTrcvIssue_SHIP_ODR_NO() { return m_creTrcvIssue_SHIP_ODR_NO; }
	public String getupTitemStock_STOCK_ON_HAND_QTY() { return m_upTitemStock_STOCK_ON_HAND_QTY; }
	public String getupTitemStock_IN_ITEMCD() { return m_upTitemStock_IN_ITEMCD; }
	public String getupTitemStock_IN_WHCD() { return m_upTitemStock_IN_WHCD; }
	public String getserTitemStock_ITEM_CD() { return m_serTitemStock_ITEM_CD; }
	public String getserTitemStock_WH_CD() { return m_serTitemStock_WH_CD; }
	public String getserTitemStock_PLANT_CD() { return m_serTitemStock_PLANT_CD; }
	public String getserTitemStock_STOCK_ON_HAND_QTY() { return m_serTitemStock_STOCK_ON_HAND_QTY; }
	public String getserTitemStock_DEFECT_QTY() { return m_serTitemStock_DEFECT_QTY; }
	public String getserTitemStock_PRVS_DAYEND_STOCK_QTY() { return m_serTitemStock_PRVS_DAYEND_STOCK_QTY; }
	public String getserTitemStock_PRVS_MONTHEND_STOCK_QTY() { return m_serTitemStock_PRVS_MONTHEND_STOCK_QTY; }
	public String getserTitemStock_PRVS_TERMEND_STOCK_QTY() { return m_serTitemStock_PRVS_TERMEND_STOCK_QTY; }
	public String getserTitemStock_IN_ITEMCD() { return m_serTitemStock_IN_ITEMCD; }
	public String getserTitemStock_IN_WHCD() { return m_serTitemStock_IN_WHCD; }
	public String getcreTitemStock_WH_CD() { return m_creTitemStock_WH_CD; }
	public String getcreTitemStock_ITEM_CD() { return m_creTitemStock_ITEM_CD; }
	public String getcreTitemStock_PLANT_CD() { return m_creTitemStock_PLANT_CD; }
	public String getcreTitemStock_STOCK_ON_HAND_QTY() { return m_creTitemStock_STOCK_ON_HAND_QTY; }
	public String getmCust_COMPANY_CD() { return m_mCust_COMPANY_CD; }
	public String getmCust_CUST_CD() { return m_mCust_CUST_CD; }
	public String getmCust_CUST_NAME() { return m_mCust_CUST_NAME; }
	public String getmCust_DETAIL_ROUND_TYP() { return m_mCust_DETAIL_ROUND_TYP; }
	public String getmCust_INSPC_ACPT_TYP() { return m_mCust_INSPC_ACPT_TYP; }
	public String getmCust_OWN_ORG_CD() { return m_mCust_OWN_ORG_CD; }
	public String getmCust_EXCH_TYP() { return m_mCust_EXCH_TYP; }
	public String getmCust_CUR_CD() { return m_mCust_CUR_CD; }
	public String getmCust_IN_COMPANYCD() { return m_mCust_IN_COMPANYCD; }
	public String getmCust_IN_CUSTCD() { return m_mCust_IN_CUSTCD; }
	public String getgetHomeCur_CUR_CD() { return m_getHomeCur_CUR_CD; }
	public String getgetHomeCur_DECIMAL_FIG() { return m_getHomeCur_DECIMAL_FIG; }
	public String getgetHomeCur_CTRL_CD() { return m_getHomeCur_CTRL_CD; }
	public String getstrCode() { return m_strCode; }
	public String getmUnitCost_UNIT_COST() { return m_mUnitCost_UNIT_COST; }
	public String getmUnitCost_EFF_PHASE_IN_DATE() { return m_mUnitCost_EFF_PHASE_IN_DATE; }
	public String getmUnitCost_IN_COMPANYCD() { return m_mUnitCost_IN_COMPANYCD; }
	public String getmUnitCost_IN_CUSTCD() { return m_mUnitCost_IN_CUSTCD; }
	public String getmUnitCost_IN_ITEMCD() { return m_mUnitCost_IN_ITEMCD; }
	public String getmUnitCost_IN_EFFPHASEINDATE() { return m_mUnitCost_IN_EFFPHASEINDATE; }
	public String getreadShipOdr_TOTAL_SHIP_QTY() { return m_readShipOdr_TOTAL_SHIP_QTY; }
	public String getreadShipOdr_RETURN_QTY() { return m_readShipOdr_RETURN_QTY; }
	public String getreadShipOdr_SHIP_ODR_NO() { return m_readShipOdr_SHIP_ODR_NO; }
	public String getg_CUR_UNIT() { return m_g_CUR_UNIT; }
	public String getDECIMAL_FIG() { return m_DECIMAL_FIG; }
	public String gett_CUR_CD() { return m_t_CUR_CD; }
	public String getstrSLIP_CTRL_GRP() { return m_strSLIP_CTRL_GRP; }
	public String getstrSTATUS() { return m_strSTATUS; }
	public String getstrSLIP_CD() { return m_strSLIP_CD; }
	public String getupTshipOdr_SHP_CMPLT_FLG() { return m_upTshipOdr_SHP_CMPLT_FLG; }
	public String getupTshipOdr_TOTAL_SHIP_QTY() { return m_upTshipOdr_TOTAL_SHIP_QTY; }
	public String getupTshipOdr_SLIP_CD() { return m_upTshipOdr_SLIP_CD; }
	public String getupTshipOdr_ORG_SLIP_CD() { return m_upTshipOdr_ORG_SLIP_CD; }
	public String getupTshipOdr_SHIP_ODR_NO() { return m_upTshipOdr_SHIP_ODR_NO; }
	public String getstrTod_OD_NO() { return m_strTod_OD_NO; }
	public String getstrTod_TOTAL_ISSUE_QTY() { return m_strTod_TOTAL_ISSUE_QTY; }
	public String getstrTod_DM_QTY() { return m_strTod_DM_QTY; }
	public String getstrTod_DM_STS_TYP() { return m_strTod_DM_STS_TYP; }
	public String getinTod_ODR_NO() { return m_inTod_ODR_NO; }
	public String getinTod_PART_DLV_SEQ_NO() { return m_inTod_PART_DLV_SEQ_NO; }
	public String getinTod_OD_NO() { return m_inTod_OD_NO; }
	public String getstrTaxTAX_KBN() { return m_strTaxTAX_KBN; }
	public String getstrTaxOLD_TAX_1() { return m_strTaxOLD_TAX_1; }
	public String getstrTaxOLD_TAX_2() { return m_strTaxOLD_TAX_2; }
	public String getstrTaxOLD_TAX_3() { return m_strTaxOLD_TAX_3; }
	public String getstrTaxNEW_TAX_1() { return m_strTaxNEW_TAX_1; }
	public String getstrTaxNEW_TAX_2() { return m_strTaxNEW_TAX_2; }
	public String getstrTaxNEW_TAX_3() { return m_strTaxNEW_TAX_3; }
	public String getstrTaxSTART_DATE() { return m_strTaxSTART_DATE; }
	public String getstrTaxROUND_TYP() { return m_strTaxROUND_TYP; }
	public String getupdiffTAX_CD() { return m_updiffTAX_CD; }
	public String getupTshipOdr_RETURN_QTY() { return m_upTshipOdr_RETURN_QTY; }
	public String getchkSLIP_CD() { return m_chkSLIP_CD; }
	public String getmWh_WH_NAME() { return m_mWh_WH_NAME; }
	public String getmWh_PLANT_CD() { return m_mWh_PLANT_CD; }
	public String getmWh_IN_WH_CD() { return m_mWh_IN_WH_CD; }
	public String getmOrg_ORG_NAME() { return m_mOrg_ORG_NAME; }
	public String getmOrg_IN_COMPANYCD() { return m_mOrg_IN_COMPANYCD; }
	public String getmOrg_IN_ORGCD() { return m_mOrg_IN_ORGCD; }
	public String getserTitemStock_JOB_ODR_CD() { return m_serTitemStock_JOB_ODR_CD; }
	public String getserTitemStock_IN_JOBODRCD() { return m_serTitemStock_IN_JOBODRCD; }
	public String getcreTitemStock_JOB_ODR_CD() { return m_creTitemStock_JOB_ODR_CD; }
	public String getupTitemStock_IN_JOBODRCD() { return m_upTitemStock_IN_JOBODRCD; }
	public String getserTJobOdr_JOB_ODR_CD() { return m_serTJobOdr_JOB_ODR_CD; }
	public String getserTJobOdr_ITEM_CD() { return m_serTJobOdr_ITEM_CD; }
	public String getdiffSHIP_QTY() { return m_diffSHIP_QTY; }
	public String getdiffSHIP_ODR_AMOUNT() { return m_diffSHIP_ODR_AMOUNT; }
	public String getdiffSHIP_ODR_AMOUNT_EXCH_RATE() { return m_diffSHIP_ODR_AMOUNT_EXCH_RATE; }
	public String getdiffSHIP_ODR_NO() { return m_diffSHIP_ODR_NO; }
	public String getdiffODR_NO() { return m_diffODR_NO; }
	public String getdiffPART_DLV_SEQ_NO() { return m_diffPART_DLV_SEQ_NO; }
	public String getdiffSLIP_CD() { return m_diffSLIP_CD; }
	public String getdiffITEM_CD() { return m_diffITEM_CD; }
	public String getdiffJOB_ODR_CD() { return m_diffJOB_ODR_CD; }
	public String getdiffCUST_ITEM_CD() { return m_diffCUST_ITEM_CD; }
	public String getdiffCUST_ODR_NO() { return m_diffCUST_ODR_NO; }
	public String getdiffCUST_CD() { return m_diffCUST_CD; }
	public String getdiffCUST_NAME() { return m_diffCUST_NAME; }
	public String getdiffCUST_CHRG_PSN_CD() { return m_diffCUST_CHRG_PSN_CD; }
	public String getdiffSHIP_ODR_ISS_PSN_CD() { return m_diffSHIP_ODR_ISS_PSN_CD; }
	public String getdiffDLV_LOC_CD() { return m_diffDLV_LOC_CD; }
	public String getdiffDEPO_TYP() { return m_diffDEPO_TYP; }
	public String getdiffDESINATED_SHIP_DATE() { return m_diffDESINATED_SHIP_DATE; }
	public String getdiffSCDL_DLV_DATE() { return m_diffSCDL_DLV_DATE; }
	public String getdiffTOTAL_SHIP_QTY() { return m_diffTOTAL_SHIP_QTY; }
	public String getdiffRETURN_QTY() { return m_diffRETURN_QTY; }
	public String getdiffUNIT_CD() { return m_diffUNIT_CD; }
	public String getdiffUNIT_PRICE() { return m_diffUNIT_PRICE; }
	public String getdiffCURRENCY_CD() { return m_diffCURRENCY_CD; }
	public String getdiffLOC_CD() { return m_diffLOC_CD; }
	public String getdiffPKG_UNIT_QTY() { return m_diffPKG_UNIT_QTY; }
	public String getdiffREMARKS() { return m_diffREMARKS; }
	public String getdiffDLV_KEY_NO() { return m_diffDLV_KEY_NO; }
	public String getdiffPART_DLV_COUNT() { return m_diffPART_DLV_COUNT; }
	public String getdiffTRANSPORT_CD() { return m_diffTRANSPORT_CD; }
	public String getdiffTRANSPORT_TYP() { return m_diffTRANSPORT_TYP; }
	public String getdiffALLCT_WH_CD() { return m_diffALLCT_WH_CD; }
	public String getdiffTRANSFER_WH_CD() { return m_diffTRANSFER_WH_CD; }
	public String getdiffDIRECT_DLV_FLG() { return m_diffDIRECT_DLV_FLG; }
	public String getdiffENTRY_TYP() { return m_diffENTRY_TYP; }
	public String getdiffPRINT_FLG() { return m_diffPRINT_FLG; }
	public String getdiffSHIP_CMPLT_FLG() { return m_diffSHIP_CMPLT_FLG; }
	public String getdiffDEPO_TRANSFER_PROC_FLG() { return m_diffDEPO_TRANSFER_PROC_FLG; }
	public String getdiffDEL_FLG() { return m_diffDEL_FLG; }
	public String getdiffuptOdr_SHIP_CNT() { return m_diffuptOdr_SHIP_CNT; }
	public String getdiffuptOdr_PART_DLV_COUNT() { return m_diffuptOdr_PART_DLV_COUNT; }
	public String getdiffuptOdr_IN_ODRNO() { return m_diffuptOdr_IN_ODRNO; }
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
	public String getup_tShipSlip_SLIP_CD() { return m_up_tShipSlip_SLIP_CD; }
	public String getupdiffSHIP_ODR_QTY() { return m_updiffSHIP_ODR_QTY; }
	public String getupdiffSHIP_ODR_AMOUNT() { return m_updiffSHIP_ODR_AMOUNT; }
	public String getupdiffTAX_AMOUNT() { return m_updiffTAX_AMOUNT; }
	public String getupdiffSHIP_ODR_AMOUNT_TAX() { return m_updiffSHIP_ODR_AMOUNT_TAX; }
	public String getupdiffEXTERNAL_TAX_SALES_AMOUNT() { return m_updiffEXTERNAL_TAX_SALES_AMOUNT; }
	public String getupdiffINTERNAL_TAX_SALES_AMOUNT() { return m_updiffINTERNAL_TAX_SALES_AMOUNT; }
	public String getupdiffTAXFREE_SALES_AMOUNT() { return m_updiffTAXFREE_SALES_AMOUNT; }
	public String getupdiffTAX_CREDIT_SALES_AMOUNT() { return m_updiffTAX_CREDIT_SALES_AMOUNT; }
	public String getupdiffEXTERNAL_TAX_AMOUNT() { return m_updiffEXTERNAL_TAX_AMOUNT; }
	public String getupdiffINTERNAL_TAX_AMOUNT() { return m_updiffINTERNAL_TAX_AMOUNT; }
	public String getupdiffTAX_AMOUNT_1() { return m_updiffTAX_AMOUNT_1; }
	public String getupdiffTAX_AMOUNT_2() { return m_updiffTAX_AMOUNT_2; }
	public String getupdiffTAX_AMOUNT_3() { return m_updiffTAX_AMOUNT_3; }
	public String getupdiffOWN_CUR_TAXCREDIT_SALES_AMOUNT() { return m_updiffOWN_CUR_TAXCREDIT_SALES_AMOUNT; }
	public String getupdiffSLIP_CD() { return m_updiffSLIP_CD; }
	public String getPAST_RESULT_ENTRY_TYP() { return m_PAST_RESULT_ENTRY_TYP; }
	public BigDecimal getPROC_EXEC_DATE() { return m_PROC_EXEC_DATE; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getmCustBase_TRANSPORT_LT() { return m_mCustBase_TRANSPORT_LT; }
	public String getmCustBase_IN_COMPANYCD() { return m_mCustBase_IN_COMPANYCD; }
	public String getmCustBase_IN_CUSTCD() { return m_mCustBase_IN_CUSTCD; }
	public String getmCustBase_IN_DLVLOCCD() { return m_mCustBase_IN_DLVLOCCD; }
	public String getstrSYUKA_LT() { return m_strSYUKA_LT; }
	public String getstrTaxIN_COMPANYCD() { return m_strTaxIN_COMPANYCD; }
	public String getstrTaxIN_CUSTCD() { return m_strTaxIN_CUSTCD; }
	public String getg_CUST_ITEM_CD() { return m_g_CUST_ITEM_CD; }
	public String getstrT_ODR_TAX() { return m_strT_ODR_TAX; }
	public String getg_SLIP_CD() { return m_g_SLIP_CD; }
	public String getgetTship_SHIP_SEQ_NO() { return m_getTship_SHIP_SEQ_NO; }
	public String getchkLOT_NO() { return m_chkLOT_NO; }
	public String getchkITEM_CD() { return m_chkITEM_CD; }
	public String getgetQtySTOCK_ON_HAND_QTY() { return m_getQtySTOCK_ON_HAND_QTY; }
	public String getgetQtyALCD_QTY() { return m_getQtyALCD_QTY; }
	public String getgetQtyITEM_CD() { return m_getQtyITEM_CD; }
	public String getgetQtyWH_CD() { return m_getQtyWH_CD; }
	public String getgetQtyLOT_NO() { return m_getQtyLOT_NO; }
	public String getreadTlotStock_LOT_NO() { return m_readTlotStock_LOT_NO; }
	public String getreadTlotStock_STOCK_ON_HAND_QTY() { return m_readTlotStock_STOCK_ON_HAND_QTY; }
	public String getreadTlotStock_ALCD_QTY() { return m_readTlotStock_ALCD_QTY; }
	public String getreadTlotStock_IN_ITEM_CD() { return m_readTlotStock_IN_ITEM_CD; }
	public String getreadTlotStock_IN_WH_CD() { return m_readTlotStock_IN_WH_CD; }
	public String getreadTlotStock_IN_LOT_NO() { return m_readTlotStock_IN_LOT_NO; }
	public String getupTlotStockSTOCK_ON_HAND_QTY() { return m_upTlotStockSTOCK_ON_HAND_QTY; }
	public String getupTlotStockIN_ITEM_CD() { return m_upTlotStockIN_ITEM_CD; }
	public String getupTlotStockIN_WH_CD() { return m_upTlotStockIN_WH_CD; }
	public String getupTlotStockIN_LOT_NO() { return m_upTlotStockIN_LOT_NO; }
	public String getserLotSTOCK_ON_HAND_QTY() { return m_serLotSTOCK_ON_HAND_QTY; }
	public String getserLotALCD_QTY() { return m_serLotALCD_QTY; }
	public String getserLotIN_ITEM_CD() { return m_serLotIN_ITEM_CD; }
	public String getserLotIN_WH_CD() { return m_serLotIN_WH_CD; }
	public String getserLotIN_LOT_NO() { return m_serLotIN_LOT_NO; }
	public String getinsertLotStock_ITEM_CD() { return m_insertLotStock_ITEM_CD; }
	public String getinsertLotStock_WH_CD() { return m_insertLotStock_WH_CD; }
	public String getinsertLotStock_LOT_CD() { return m_insertLotStock_LOT_CD; }
	public String getinsertLotStock_PLANT_CD() { return m_insertLotStock_PLANT_CD; }
	public String getinsertLotStock_STOCK_ON_HAND_QTY() { return m_insertLotStock_STOCK_ON_HAND_QTY; }
	public String getinsertLotStock_DEFECT_QTY() { return m_insertLotStock_DEFECT_QTY; }
	public String getinsertLotStock_ALCD_QTY() { return m_insertLotStock_ALCD_QTY; }
	public String getinsTshipInst_SHIP_SEQ_NO() { return m_insTshipInst_SHIP_SEQ_NO; }
	public String getinsTshipInst_SHIP_ODR_NO() { return m_insTshipInst_SHIP_ODR_NO; }
	public String getinsTshipInst_LOT_NO() { return m_insTshipInst_LOT_NO; }
	public String getinsTshipInst_ITEM_CD() { return m_insTshipInst_ITEM_CD; }
	public String getinsTshipInst_WH_CD() { return m_insTshipInst_WH_CD; }
	public String getinsTshipInst_ODR_NO() { return m_insTshipInst_ODR_NO; }
	public String getinsTshipInst_SLIP_CD() { return m_insTshipInst_SLIP_CD; }
	public String getinsTshipInst_SHIP_QTY() { return m_insTshipInst_SHIP_QTY; }
	public String getinsTshipInst_SHIP_DATE() { return m_insTshipInst_SHIP_DATE; }
	public String getdelTshipInstIN_SHIP_SEQ_NO() { return m_delTshipInstIN_SHIP_SEQ_NO; }
	public String getdelTshipInstIN_LOT_NO() { return m_delTshipInstIN_LOT_NO; }
	public String gettlotTrace_FROM_ITEM_CD() { return m_tlotTrace_FROM_ITEM_CD; }
	public String gettlotTrace_FROM_LOT_NO() { return m_tlotTrace_FROM_LOT_NO; }
	public String gettlotTrace_TO_ITEM_CD() { return m_tlotTrace_TO_ITEM_CD; }
	public String gettlotTrace_TO_LOT_NO() { return m_tlotTrace_TO_LOT_NO; }
	public String gettlotTrace_LOT_TRACE_TYP() { return m_tlotTrace_LOT_TRACE_TYP; }
	public String gettlotTrace_CUST_ODR_NO() { return m_tlotTrace_CUST_ODR_NO; }
	public String gettlotTrace_SLIP_CD() { return m_tlotTrace_SLIP_CD; }
	public String gettlotTrace_ODR_NO() { return m_tlotTrace_ODR_NO; }
	public String getreadTshipInst_LOT_NO() { return m_readTshipInst_LOT_NO; }
	public String getreadTshipInst_SHIP_QTY() { return m_readTshipInst_SHIP_QTY; }
	public String getreadTshipInst_SHIP_ODR_NO() { return m_readTshipInst_SHIP_ODR_NO; }
	public String getreadTshipInst_ITEM_CD() { return m_readTshipInst_ITEM_CD; }
	public String getreadTshipInst_WH_CD() { return m_readTshipInst_WH_CD; }
	public String getreadTshipInst_ODR_NO() { return m_readTshipInst_ODR_NO; }
	public String getreadTshipInst_SLIP_CD() { return m_readTshipInst_SLIP_CD; }
	public String getreadTshipInst_SHIP_DATE() { return m_readTshipInst_SHIP_DATE; }
	public String getreadTshipInst_IN_SHIP_SEQ_NO() { return m_readTshipInst_IN_SHIP_SEQ_NO; }
	public String getreadTshipInst_IN_LOT_NO() { return m_readTshipInst_IN_LOT_NO; }
	public String getreadT_Ship_Inst_Lot_NO() { return m_readT_Ship_Inst_Lot_NO; }
	public String getreadT_Ship_Inst_Ship_Seq_NO() { return m_readT_Ship_Inst_Ship_Seq_NO; }
	public String getstrOdrCurrncyCd() { return m_strOdrCurrncyCd; }
	public String getstrExchTyp() { return m_strExchTyp; }
	public String getg_DATE() { return m_g_DATE; }
	public String getselTShipOdr_MODIFY_COUNT() { return m_selTShipOdr_MODIFY_COUNT; }
	public String getSEL_MODIFY_COUNT() { return m_SEL_MODIFY_COUNT; }

	public List getList_k_MODE() { return l_k_MODE; }
	public List getList_h_RESULT() { return l_h_RESULT; }
	public List getList_r_SEL_PTN() { return l_r_SEL_PTN; }
	public List getList_g_DESINATED_SHIP_DATE() { return l_g_DESINATED_SHIP_DATE; }
	public List getList_g_SHIP_QTY() { return l_g_SHIP_QTY; }
	public List getList_g_SHIP_QTY2() { return l_g_SHIP_QTY2; }
	public List getList_g_UNIT_PRICE() { return l_g_UNIT_PRICE; }
	public List getList_g_CURRNCY() { return l_g_CURRNCY; }
	public List getList_g_SHIP_ODR_AMOUNT() { return l_g_SHIP_ODR_AMOUNT; }
	public List getList_g_WH_CD() { return l_g_WH_CD; }
	public List getList_g_REMARKS() { return l_g_REMARKS; }
	public List getList_g_CUST_ANAME() { return l_g_CUST_ANAME; }
	public List getList_g_ITEM_CD() { return l_g_ITEM_CD; }
	public List getList_h_AP_SECRTY_TYP() { return l_h_AP_SECRTY_TYP; }
	public List getList_h_SHIP_QTY() { return l_h_SHIP_QTY; }
	public List getList_h_ITEM_CD() { return l_h_ITEM_CD; }
	public List getList_h_GYOMU_DATE() { return l_h_GYOMU_DATE; }
	public List getList_h_EXCH_TYP() { return l_h_EXCH_TYP; }
	public List getList_h_MODFIY_CNT() { return l_h_MODFIY_CNT; }
	public List getList_h_TOTAL_SHIP_QTY() { return l_h_TOTAL_SHIP_QTY; }
	public List getList_m_selRadio() { return l_m_selRadio; }
	public List getList_r_SEL_PTN1() { return l_r_SEL_PTN1; }
	public List getList_r_SEL_PTN2() { return l_r_SEL_PTN2; }
	public List getList_r_SEL_PTN3() { return l_r_SEL_PTN3; }
	public List getList_h_SELECT_FG() { return l_h_SELECT_FG; }
	public List getList_h_UNIT_PRICE() { return l_h_UNIT_PRICE; }
	public List getList_g_STOCK_UNIT() { return l_g_STOCK_UNIT; }
	public List getList_g_STOCK_UNIT2() { return l_g_STOCK_UNIT2; }
	public List getList_g_CUR_UNIT2() { return l_g_CUR_UNIT2; }
	public List getList_g_WH_NAME() { return l_g_WH_NAME; }
	public List getList_g_SALES_DEPT_CD() { return l_g_SALES_DEPT_CD; }
	public List getList_g_ORG_NAME() { return l_g_ORG_NAME; }
	public List getList_g_CUST_CD() { return l_g_CUST_CD; }
	public List getList_g_CUST_ITEM_NAME() { return l_g_CUST_ITEM_NAME; }
	public List getList_g_ITEM_NAME() { return l_g_ITEM_NAME; }
	public List getList_g_CUST_ODR_NO() { return l_g_CUST_ODR_NO; }
	public List getList_g_ODR_NO() { return l_g_ODR_NO; }
	public List getList_g_PART_DLV_SEQ_NO() { return l_g_PART_DLV_SEQ_NO; }
	public List getList_g_SHIP_ODR_NO() { return l_g_SHIP_ODR_NO; }
	public List getList_h_DATE() { return l_h_DATE; }
	public List getList_g_JOB_ODR_CD() { return l_g_JOB_ODR_CD; }
	public List getList_c_JOB_ODR_CD() { return l_c_JOB_ODR_CD; }
	public List getList_g_DIRECT_DLV_FLG() { return l_g_DIRECT_DLV_FLG; }
	public List getList_g_STOCK_LOT_CD() { return l_g_STOCK_LOT_CD; }
	public List getList_h_STOCK_LOT_CD() { return l_h_STOCK_LOT_CD; }
	public List getList_param1() { return l_param1; }
	public List getList_param2() { return l_param2; }
	public List getList_param3() { return l_param3; }
	public List getList_ROUND_TYP() { return l_ROUND_TYP; }
	public List getList_UNIT_QTY_TYP() { return l_UNIT_QTY_TYP; }
	public List getList_UNIT_FIG() { return l_UNIT_FIG; }
	public List getList_strCOMPANY_CD() { return l_strCOMPANY_CD; }
	public List getList_strUSER_NAME() { return l_strUSER_NAME; }
	public List getList_strPLANT_CD() { return l_strPLANT_CD; }
	public List getList_strSECTION_CD() { return l_strSECTION_CD; }
	public List getList_strORG_CD() { return l_strORG_CD; }
	public List getList_strORG_NAME() { return l_strORG_NAME; }
	public List getList_strORG_ANAME() { return l_strORG_ANAME; }
	public List getList_strPLANT_NAME() { return l_strPLANT_NAME; }
	public List getList_strPLANT_ANAME() { return l_strPLANT_ANAME; }
	public List getList_strCAL_NO() { return l_strCAL_NO; }
	public List getList_strUSER_CD() { return l_strUSER_CD; }
	public List getList_strBUSINESS_OPR_DATE() { return l_strBUSINESS_OPR_DATE; }
	public List getList_serTori_SHIP_SEQ_NO() { return l_serTori_SHIP_SEQ_NO; }
	public List getList_serTori_SHIP_ODR_NO() { return l_serTori_SHIP_ODR_NO; }
	public List getList_serTori_SLIP_CD() { return l_serTori_SLIP_CD; }
	public List getList_serTori_ODR_NO() { return l_serTori_ODR_NO; }
	public List getList_serTori_PART_DLV_SEQ_NO() { return l_serTori_PART_DLV_SEQ_NO; }
	public List getList_serTori_ORGNAL_SLIP_CD() { return l_serTori_ORGNAL_SLIP_CD; }
	public List getList_serTori_SLIP_TRN_CD() { return l_serTori_SLIP_TRN_CD; }
	public List getList_serTori_ITEM_CD() { return l_serTori_ITEM_CD; }
	public List getList_serTori_JOB_ODR_CD() { return l_serTori_JOB_ODR_CD; }
	public List getList_serTori_CUST_ITEM_CD() { return l_serTori_CUST_ITEM_CD; }
	public List getList_serTori_CUST_ODR_NO() { return l_serTori_CUST_ODR_NO; }
	public List getList_serTori_CUST_CD() { return l_serTori_CUST_CD; }
	public List getList_serTori_CUST_NAME() { return l_serTori_CUST_NAME; }
	public List getList_serTori_CUST_CHRG_PSN_CD() { return l_serTori_CUST_CHRG_PSN_CD; }
	public List getList_serTori_SHIP_ODR_ISS_PSN_CD() { return l_serTori_SHIP_ODR_ISS_PSN_CD; }
	public List getList_serTori_DLV_LOC_CD() { return l_serTori_DLV_LOC_CD; }
	public List getList_serTori_DEPO_TYP() { return l_serTori_DEPO_TYP; }
	public List getList_serTori_ALLCT_WH_CD() { return l_serTori_ALLCT_WH_CD; }
	public List getList_serTori_DEPO_WH_CD() { return l_serTori_DEPO_WH_CD; }
	public List getList_serTori_LOC_CD() { return l_serTori_LOC_CD; }
	public List getList_serTori_SHIP_DATE() { return l_serTori_SHIP_DATE; }
	public List getList_serTori_SHIP_QTY() { return l_serTori_SHIP_QTY; }
	public List getList_serTori_UNIT_CD() { return l_serTori_UNIT_CD; }
	public List getList_serTori_SHIP_UNIT_PRICE() { return l_serTori_SHIP_UNIT_PRICE; }
	public List getList_serTori_SHIP_ODR_AMOUNT() { return l_serTori_SHIP_ODR_AMOUNT; }
	public List getList_serTori_SHIP_ODR_AMOUNT_EXCH_RATES() { return l_serTori_SHIP_ODR_AMOUNT_EXCH_RATES; }
	public List getList_serTori_CURRNCY_CD() { return l_serTori_CURRNCY_CD; }
	public List getList_serTori_DIRECT_DLV_FLG() { return l_serTori_DIRECT_DLV_FLG; }
	public List getList_serTori_SHIP_INFO_IF_CTRL_NO() { return l_serTori_SHIP_INFO_IF_CTRL_NO; }
	public List getList_serTori_INSPC_ACPT_INFO_IF_CTRL_NO() { return l_serTori_INSPC_ACPT_INFO_IF_CTRL_NO; }
	public List getList_serTori_DLV_KEY_NO() { return l_serTori_DLV_KEY_NO; }
	public List getList_serTori_DEL_FLG() { return l_serTori_DEL_FLG; }
	public List getList_serTori_CUR_NAME() { return l_serTori_CUR_NAME; }
	public List getList_serTori_EXCH_TYP() { return l_serTori_EXCH_TYP; }
	public List getList_serTori_MODIFY_COUNT() { return l_serTori_MODIFY_COUNT; }
	public List getList_serTori_RETURN_QTY() { return l_serTori_RETURN_QTY; }
	public List getList_serTori_TOTAL_SHIP_QTY() { return l_serTori_TOTAL_SHIP_QTY; }
	public List getList_serTori_STATUS() { return l_serTori_STATUS; }
	public List getList_serTori_INSPC_ACPT_TYP() { return l_serTori_INSPC_ACPT_TYP; }
	public List getList_serToriSALES_DEPT_CD() { return l_serToriSALES_DEPT_CD; }
	public List getList_serToriSALES_DATE() { return l_serToriSALES_DATE; }
	public List getList_h_MRP_ODR_TYP() { return l_h_MRP_ODR_TYP; }
	public List getList_h_LOT_CTRL_FLG() { return l_h_LOT_CTRL_FLG; }
	public List getList_serTodrMODIFY_COUNT() { return l_serTodrMODIFY_COUNT; }
	public List getList_serTori_IN_SLIPCD() { return l_serTori_IN_SLIPCD; }
	public List getList_creTship_SHIP_SEQ_NO() { return l_creTship_SHIP_SEQ_NO; }
	public List getList_creTship_SHIP_ODR_NO() { return l_creTship_SHIP_ODR_NO; }
	public List getList_creTship_SLIP_CD() { return l_creTship_SLIP_CD; }
	public List getList_creTship_ODR_NO() { return l_creTship_ODR_NO; }
	public List getList_creTship_PART_DLV_SEQ_NO() { return l_creTship_PART_DLV_SEQ_NO; }
	public List getList_creTship_ORGNAL_SLIP_CD() { return l_creTship_ORGNAL_SLIP_CD; }
	public List getList_creTship_SLIP_TRN_CD() { return l_creTship_SLIP_TRN_CD; }
	public List getList_creTship_ITEM_CD() { return l_creTship_ITEM_CD; }
	public List getList_creTship_JOB_ODR_CD() { return l_creTship_JOB_ODR_CD; }
	public List getList_creTship_CUST_ITEM_CD() { return l_creTship_CUST_ITEM_CD; }
	public List getList_creTship_CUST_ODR_NO() { return l_creTship_CUST_ODR_NO; }
	public List getList_creTship_CUST_CD() { return l_creTship_CUST_CD; }
	public List getList_creTship_CUST_NAME() { return l_creTship_CUST_NAME; }
	public List getList_creTship_CUST_CHRG_PSN_CD() { return l_creTship_CUST_CHRG_PSN_CD; }
	public List getList_creTship_SHIP_ODR_ISS_PSN_CD() { return l_creTship_SHIP_ODR_ISS_PSN_CD; }
	public List getList_creTship_DLV_LOC_CD() { return l_creTship_DLV_LOC_CD; }
	public List getList_creTship_DEPO_TYP() { return l_creTship_DEPO_TYP; }
	public List getList_creTship_ALLCT_WH_CD() { return l_creTship_ALLCT_WH_CD; }
	public List getList_creTship_DEPO_WH_CD() { return l_creTship_DEPO_WH_CD; }
	public List getList_creTship_LOC_CD() { return l_creTship_LOC_CD; }
	public List getList_creTship_SHIP_DATE() { return l_creTship_SHIP_DATE; }
	public List getList_creTship_SHIP_QTY() { return l_creTship_SHIP_QTY; }
	public List getList_creTship_UNIT_CD() { return l_creTship_UNIT_CD; }
	public List getList_creTship_SHIP_UNIT_PRICE() { return l_creTship_SHIP_UNIT_PRICE; }
	public List getList_creTship_SHIP_ODR_AMOUNT() { return l_creTship_SHIP_ODR_AMOUNT; }
	public List getList_creTship_SHIP_ODR_AMOUNT_EXCH_RATES() { return l_creTship_SHIP_ODR_AMOUNT_EXCH_RATES; }
	public List getList_creTship_CURRNCY_CD() { return l_creTship_CURRNCY_CD; }
	public List getList_creTship_DIRECT_DLV_FLG() { return l_creTship_DIRECT_DLV_FLG; }
	public List getList_creTship_DLV_KEY_NO() { return l_creTship_DLV_KEY_NO; }
	public List getList_creTship_REMARKS() { return l_creTship_REMARKS; }
	public List getList_creTship_DEL_FLG() { return l_creTship_DEL_FLG; }
	public List getList_updTship_SHIP_SEQ_NO() { return l_updTship_SHIP_SEQ_NO; }
	public List getList_serInsert_SHIP_ODR_NO() { return l_serInsert_SHIP_ODR_NO; }
	public List getList_serInsert_ODR_NO() { return l_serInsert_ODR_NO; }
	public List getList_serInsert_PART_DLV_SEQ_NO() { return l_serInsert_PART_DLV_SEQ_NO; }
	public List getList_serInsert_SLIP_CD() { return l_serInsert_SLIP_CD; }
	public List getList_serInsert_ITEM_CD() { return l_serInsert_ITEM_CD; }
	public List getList_serInsert_JOB_ODR_CD() { return l_serInsert_JOB_ODR_CD; }
	public List getList_serInsert_CUST_ITEM_CD() { return l_serInsert_CUST_ITEM_CD; }
	public List getList_serInsert_CUST_ODR_NO() { return l_serInsert_CUST_ODR_NO; }
	public List getList_serInsert_CUST_CD() { return l_serInsert_CUST_CD; }
	public List getList_serInsert_CUST_NAME() { return l_serInsert_CUST_NAME; }
	public List getList_serInsert_CUST_CHRG_PSN_CD() { return l_serInsert_CUST_CHRG_PSN_CD; }
	public List getList_serInsert_SHIP_ODR_ISS_PSN_CD() { return l_serInsert_SHIP_ODR_ISS_PSN_CD; }
	public List getList_serInsert_DLV_LOC_CD() { return l_serInsert_DLV_LOC_CD; }
	public List getList_serInsert_DEPO_TYP() { return l_serInsert_DEPO_TYP; }
	public List getList_serInsert_DESINATED_SHIP_DATE() { return l_serInsert_DESINATED_SHIP_DATE; }
	public List getList_serInsert_SHIP_QTY() { return l_serInsert_SHIP_QTY; }
	public List getList_serInsert_TOTAL_SHIP_QTY() { return l_serInsert_TOTAL_SHIP_QTY; }
	public List getList_serInsert_UNIT_CD() { return l_serInsert_UNIT_CD; }
	public List getList_serInsert_UNIT_PRICE() { return l_serInsert_UNIT_PRICE; }
	public List getList_serInsert_SHIP_ODR_AMOUNT() { return l_serInsert_SHIP_ODR_AMOUNT; }
	public List getList_serInsert_SHIP_ODR_AMOUNT_EXCH_RATES() { return l_serInsert_SHIP_ODR_AMOUNT_EXCH_RATES; }
	public List getList_serInsert_CURRNCY_CD() { return l_serInsert_CURRNCY_CD; }
	public List getList_serInsert_LOC_CD() { return l_serInsert_LOC_CD; }
	public List getList_serInsert_PKG_UNIT_QTY() { return l_serInsert_PKG_UNIT_QTY; }
	public List getList_serInsert_REMARKS() { return l_serInsert_REMARKS; }
	public List getList_serInsert_TRANSPORT_CD() { return l_serInsert_TRANSPORT_CD; }
	public List getList_serInsert_TRANSPORT_TYP() { return l_serInsert_TRANSPORT_TYP; }
	public List getList_serInsert_ALLCT_WH_CD() { return l_serInsert_ALLCT_WH_CD; }
	public List getList_serInsert_TRANSFER_WH_CD() { return l_serInsert_TRANSFER_WH_CD; }
	public List getList_serInsert_DIRECT_DLV_FLG() { return l_serInsert_DIRECT_DLV_FLG; }
	public List getList_serInsert_ENTRY_TYP() { return l_serInsert_ENTRY_TYP; }
	public List getList_serInsert_PRINT_FLG() { return l_serInsert_PRINT_FLG; }
	public List getList_serInsert_SHP_CMPLT_FLG() { return l_serInsert_SHP_CMPLT_FLG; }
	public List getList_serInsert_DEPO_TRANSFER_PROC_FLG() { return l_serInsert_DEPO_TRANSFER_PROC_FLG; }
	public List getList_serInsert_DEL_FLG() { return l_serInsert_DEL_FLG; }
	public List getList_serInsert_CUR_CD() { return l_serInsert_CUR_CD; }
	public List getList_serInsert_CUR_NAME() { return l_serInsert_CUR_NAME; }
	public List getList_serInsert_EXCH_TYP() { return l_serInsert_EXCH_TYP; }
	public List getList_serInsert_SPCL_PRICE_TYP() { return l_serInsert_SPCL_PRICE_TYP; }
	public List getList_serInsert_MODIFY_COUNT() { return l_serInsert_MODIFY_COUNT; }
	public List getList_serInsert_SCDL_DLV_DATE() { return l_serInsert_SCDL_DLV_DATE; }
	public List getList_serInsert_DLV_KEY_NO() { return l_serInsert_DLV_KEY_NO; }
	public List getList_h_RETURN_QTY() { return l_h_RETURN_QTY; }
	public List getList_serInsert_ODR_ACPT_DATE() { return l_serInsert_ODR_ACPT_DATE; }
	public List getList_h_JOB_ODR_CD() { return l_h_JOB_ODR_CD; }
	public List getList_selMODIFY_COUNT() { return l_selMODIFY_COUNT; }
	public List getList_serInsert_IN_SLIPCD() { return l_serInsert_IN_SLIPCD; }
	public List getList_upTshipOdr_DEPO_TRANSFER_PROC_FLG() { return l_upTshipOdr_DEPO_TRANSFER_PROC_FLG; }
	public List getList_upTshipOdr_IN_SLIPCD() { return l_upTshipOdr_IN_SLIPCD; }
	public List getList_chkisWhCd_WH_CD() { return l_chkisWhCd_WH_CD; }
	public List getList_chkisWhCd_WH_TYP() { return l_chkisWhCd_WH_TYP; }
	public List getList_chkisinWhCd_WH_NAME() { return l_chkisinWhCd_WH_NAME; }
	public List getList_chkisWhCd_IN_WHCD() { return l_chkisWhCd_IN_WHCD; }
	public List getList_chkisWhCd_IN_WHTYP() { return l_chkisWhCd_IN_WHTYP; }
	public List getList_creTsales_SHIP_ODR_NO() { return l_creTsales_SHIP_ODR_NO; }
	public List getList_creTsales_SLIP_CD() { return l_creTsales_SLIP_CD; }
	public List getList_creTsales_SALES_TYP() { return l_creTsales_SALES_TYP; }
	public List getList_creTsales_CUST_CD() { return l_creTsales_CUST_CD; }
	public List getList_creTsales_ITEM_CD() { return l_creTsales_ITEM_CD; }
	public List getList_creTsales_ITEM_NAME() { return l_creTsales_ITEM_NAME; }
	public List getList_creTsales_CUST_ODR_NO() { return l_creTsales_CUST_ODR_NO; }
	public List getList_creTsales_SALES_DATE() { return l_creTsales_SALES_DATE; }
	public List getList_creTsales_SALES_DEPT_CD() { return l_creTsales_SALES_DEPT_CD; }
	public List getList_creTsales_CUST_CHRG_PSN_CD() { return l_creTsales_CUST_CHRG_PSN_CD; }
	public List getList_creTsales_ODR_ACPT_PSN_CD() { return l_creTsales_ODR_ACPT_PSN_CD; }
	public List getList_creTsales_SALES_QTY() { return l_creTsales_SALES_QTY; }
	public List getList_creTsales_SALES_UNIT_PRICE() { return l_creTsales_SALES_UNIT_PRICE; }
	public List getList_creTsales_UNIT_CD() { return l_creTsales_UNIT_CD; }
	public List getList_creTsales_SALES_AMOUNT() { return l_creTsales_SALES_AMOUNT; }
	public List getList_creTsales_SALES_AMOUNT_EXCH_RATES() { return l_creTsales_SALES_AMOUNT_EXCH_RATES; }
	public List getList_creTsales_INSPC_ACPT_DATE() { return l_creTsales_INSPC_ACPT_DATE; }
	public List getList_creTsales_INSPC_ACPT_QTY() { return l_creTsales_INSPC_ACPT_QTY; }
	public List getList_creTsales_EXTERNAL_TAX_SALES_AMOUNT() { return l_creTsales_EXTERNAL_TAX_SALES_AMOUNT; }
	public List getList_creTsales_INTERNAL_TAX_SALES_AMOUNT() { return l_creTsales_INTERNAL_TAX_SALES_AMOUNT; }
	public List getList_creTsales_TAXFREE_SALES_AMOUNT() { return l_creTsales_TAXFREE_SALES_AMOUNT; }
	public List getList_creTsales_TAX_CREDIT_SALES_AMOUNT() { return l_creTsales_TAX_CREDIT_SALES_AMOUNT; }
	public List getList_creTsales_EXTERNAL_TAX_AMOUNT() { return l_creTsales_EXTERNAL_TAX_AMOUNT; }
	public List getList_creTsales_INTERNAL_TAX_AMOUNT() { return l_creTsales_INTERNAL_TAX_AMOUNT; }
	public List getList_creTsales_TAX_AMOUNT_1() { return l_creTsales_TAX_AMOUNT_1; }
	public List getList_creTsales_TAX_AMOUNT_2() { return l_creTsales_TAX_AMOUNT_2; }
	public List getList_creTsales_TAX_AMOUNT_3() { return l_creTsales_TAX_AMOUNT_3; }
	public List getList_creTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT() { return l_creTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT; }
	public List getList_creTsales_ORG_SLIP_CD() { return l_creTsales_ORG_SLIP_CD; }
	public List getList_creTsales_CURRNCY_CD() { return l_creTsales_CURRNCY_CD; }
	public List getList_creTsales_SPCL_PRICE_CO() { return l_creTsales_SPCL_PRICE_CO; }
	public List getList_creTsales_REMARKS() { return l_creTsales_REMARKS; }
	public List getList_creTsales_DEL_FLG() { return l_creTsales_DEL_FLG; }
	public List getList_creTsales_INSPC_ACPT_TYP() { return l_creTsales_INSPC_ACPT_TYP; }
	public List getList_creTsales_STATUS() { return l_creTsales_STATUS; }
	public List getList_creTsales_APPR_FLG() { return l_creTsales_APPR_FLG; }
	public List getList_creTsales_APPR_ID() { return l_creTsales_APPR_ID; }
	public List getList_creTsales_APPR_DATE() { return l_creTsales_APPR_DATE; }
	public List getList_creTsales_EXCH_RATE() { return l_creTsales_EXCH_RATE; }
	public List getList_serTsales_SALES_SEQ_NO() { return l_serTsales_SALES_SEQ_NO; }
	public List getList_serTsales_SLIP_CD() { return l_serTsales_SLIP_CD; }
	public List getList_serTsales_SALES_TYP() { return l_serTsales_SALES_TYP; }
	public List getList_serTsales_CUST_CD() { return l_serTsales_CUST_CD; }
	public List getList_serTsales_ITEM_CD() { return l_serTsales_ITEM_CD; }
	public List getList_serTsales_ITEM_NAME() { return l_serTsales_ITEM_NAME; }
	public List getList_serTsales_CUST_ODR_NO() { return l_serTsales_CUST_ODR_NO; }
	public List getList_serTsales_SALES_DATE() { return l_serTsales_SALES_DATE; }
	public List getList_serTsales_SALES_DEPT_CD() { return l_serTsales_SALES_DEPT_CD; }
	public List getList_serTsales_CUST_CHRG_PSN_CD() { return l_serTsales_CUST_CHRG_PSN_CD; }
	public List getList_serTsales_ODR_ACPT_PSN_CD() { return l_serTsales_ODR_ACPT_PSN_CD; }
	public List getList_serTsales_SALES_QTY() { return l_serTsales_SALES_QTY; }
	public List getList_serTsales_SALES_UNIT_PRICE() { return l_serTsales_SALES_UNIT_PRICE; }
	public List getList_serTsales_UNIT_CD() { return l_serTsales_UNIT_CD; }
	public List getList_serTsales_SALES_AMOUNT() { return l_serTsales_SALES_AMOUNT; }
	public List getList_serTsales_SALES_AMOUNT_EXCH_RATES() { return l_serTsales_SALES_AMOUNT_EXCH_RATES; }
	public List getList_serTsales_EXTERNAL_TAX_SALES_AMOUNT() { return l_serTsales_EXTERNAL_TAX_SALES_AMOUNT; }
	public List getList_serTsales_INTERNAL_TAX_SALES_AMOUNT() { return l_serTsales_INTERNAL_TAX_SALES_AMOUNT; }
	public List getList_serTsales_TAXFREE_SALES_AMOUNT() { return l_serTsales_TAXFREE_SALES_AMOUNT; }
	public List getList_serTsales_TAX_CREDIT_SALES_AMOUNT() { return l_serTsales_TAX_CREDIT_SALES_AMOUNT; }
	public List getList_serTsales_EXTERNAL_TAX_AMOUNT() { return l_serTsales_EXTERNAL_TAX_AMOUNT; }
	public List getList_serTsales_INTERNAL_TAX_AMOUNT() { return l_serTsales_INTERNAL_TAX_AMOUNT; }
	public List getList_serTsales_TAX_AMOUNT_1() { return l_serTsales_TAX_AMOUNT_1; }
	public List getList_serTsales_TAX_AMOUNT_2() { return l_serTsales_TAX_AMOUNT_2; }
	public List getList_serTsales_TAX_AMOUNT_3() { return l_serTsales_TAX_AMOUNT_3; }
	public List getList_serTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT() { return l_serTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT; }
	public List getList_serTsales_ORG_SLIP_CD() { return l_serTsales_ORG_SLIP_CD; }
	public List getList_serTsales_CURRNCY_CD() { return l_serTsales_CURRNCY_CD; }
	public List getList_serTsales_SPCL_PRICE_CO() { return l_serTsales_SPCL_PRICE_CO; }
	public List getList_serTsales_REMARKS() { return l_serTsales_REMARKS; }
	public List getList_serTsales_DEL_FLG() { return l_serTsales_DEL_FLG; }
	public List getList_serTsales_INSPC_ACPT_TYP() { return l_serTsales_INSPC_ACPT_TYP; }
	public List getList_serTsales_STATUS() { return l_serTsales_STATUS; }
	public List getList_serTsales_PRD_ODR_PLACE_CD() { return l_serTsales_PRD_ODR_PLACE_CD; }
	public List getList_serTsales_EXCH_RATE() { return l_serTsales_EXCH_RATE; }
	public List getList_serTsales_IN_SLIPCD() { return l_serTsales_IN_SLIPCD; }
	public List getList_updTsales_APPR_FLG() { return l_updTsales_APPR_FLG; }
	public List getList_updTsales_APPR_ID() { return l_updTsales_APPR_ID; }
	public List getList_updTsales_APPR_DATE() { return l_updTsales_APPR_DATE; }
	public List getList_updTsales_SALES_SEQ_NO() { return l_updTsales_SALES_SEQ_NO; }
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
	public List getList_mItemSpec_CUST_CD() { return l_mItemSpec_CUST_CD; }
	public List getList_mItemSpec_CUST_ITEM_CD() { return l_mItemSpec_CUST_ITEM_CD; }
	public List getList_mItemSpec_COMPANY_CD() { return l_mItemSpec_COMPANY_CD; }
	public List getList_mItemSpec_SALES_DEPT_CD() { return l_mItemSpec_SALES_DEPT_CD; }
	public List getList_mItemSpec_CUST_ITEM_NAME() { return l_mItemSpec_CUST_ITEM_NAME; }
	public List getList_mItemSpec_IN_CUST_CD() { return l_mItemSpec_IN_CUST_CD; }
	public List getList_mItemSpec_IN_CUST_ITEM_CD() { return l_mItemSpec_IN_CUST_ITEM_CD; }
	public List getList_mItemSpec_IN_COMPANY_CD() { return l_mItemSpec_IN_COMPANY_CD; }
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
	public List getList_tOdr_DLV_KEY_NO() { return l_tOdr_DLV_KEY_NO; }
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
	public List getList_tOdr_DEL_FLG() { return l_tOdr_DEL_FLG; }
	public List getList_tOdr_SHIP_CNT() { return l_tOdr_SHIP_CNT; }
	public List getList_tOdr_UNIT_CD_ORG() { return l_tOdr_UNIT_CD_ORG; }
	public List getList_tOdrCtl_CUST_ITEM_CD() { return l_tOdrCtl_CUST_ITEM_CD; }
	public List getList_tOdr_COCK_TYP() { return l_tOdr_COCK_TYP; }
	public List getList_tOdr_PUCH_ODR_QTY_TOTAL() { return l_tOdr_PUCH_ODR_QTY_TOTAL; }
	public List getList_tOdr_BUYER_ORG_CD() { return l_tOdr_BUYER_ORG_CD; }
	public List getList_tOdr_BUYER_NAME() { return l_tOdr_BUYER_NAME; }
	public List getList_tOdr_IN_ODRNO() { return l_tOdr_IN_ODRNO; }
	public List getList_creTodrODR_NO() { return l_creTodrODR_NO; }
	public List getList_creTodrODR_TYP() { return l_creTodrODR_TYP; }
	public List getList_creTodrODR_CTL_NO() { return l_creTodrODR_CTL_NO; }
	public List getList_creTodrCUST_ODR_NO() { return l_creTodrCUST_ODR_NO; }
	public List getList_creTodrCUST_CHRG_ORG_CD() { return l_creTodrCUST_CHRG_ORG_CD; }
	public List getList_creTodrCUST_CHRG_PSN_CD() { return l_creTodrCUST_CHRG_PSN_CD; }
	public List getList_creTodrODR_ACPT_ORG_CD() { return l_creTodrODR_ACPT_ORG_CD; }
	public List getList_creTodrODR_ACPT_PSN_CD() { return l_creTodrODR_ACPT_PSN_CD; }
	public List getList_creTodrCURRNCY_CD() { return l_creTodrCURRNCY_CD; }
	public List getList_creTodrEXCH_TYP() { return l_creTodrEXCH_TYP; }
	public List getList_creTodrDLV_LOC_CD() { return l_creTodrDLV_LOC_CD; }
	public List getList_creTodrDLV_LOC_NAME() { return l_creTodrDLV_LOC_NAME; }
	public List getList_creTodrDLV_LOC_NAME_KANJI() { return l_creTodrDLV_LOC_NAME_KANJI; }
	public List getList_creTodrPRD_ODR_PLACE_CD() { return l_creTodrPRD_ODR_PLACE_CD; }
	public List getList_creTodrODR_UNIT_PRICE() { return l_creTodrODR_UNIT_PRICE; }
	public List getList_creTodrPART_DLV_COUNT() { return l_creTodrPART_DLV_COUNT; }
	public List getList_creTodrDEPO_TYP() { return l_creTodrDEPO_TYP; }
	public List getList_creTodrDESINATED_DLV_DATE() { return l_creTodrDESINATED_DLV_DATE; }
	public List getList_creTodrODR_QTY() { return l_creTodrODR_QTY; }
	public List getList_creTodrREMAIN_UNCONFIRM_ODR_QTY() { return l_creTodrREMAIN_UNCONFIRM_ODR_QTY; }
	public List getList_creTodrCANCELED_UNCONFIRM_ODR_QTY() { return l_creTodrCANCELED_UNCONFIRM_ODR_QTY; }
	public List getList_creTodrUNIT_CD() { return l_creTodrUNIT_CD; }
	public List getList_creTodrUNCONFIRM_ODR_BALANCE() { return l_creTodrUNCONFIRM_ODR_BALANCE; }
	public List getList_creTodrODR_AMOUNT() { return l_creTodrODR_AMOUNT; }
	public List getList_creTodrODR_AMOUNT_EXCH_RATES() { return l_creTodrODR_AMOUNT_EXCH_RATES; }
	public List getList_creTodrTOTAL_SHIP_QTY() { return l_creTodrTOTAL_SHIP_QTY; }
	public List getList_creTodrSHIP_AMOUNT() { return l_creTodrSHIP_AMOUNT; }
	public List getList_creTodrSHIP_AMOUNT_EXCH_RATES() { return l_creTodrSHIP_AMOUNT_EXCH_RATES; }
	public List getList_creTodrODR_CMPLT_FLG() { return l_creTodrODR_CMPLT_FLG; }
	public List getList_creTodrODR_CMPLT_DATE() { return l_creTodrODR_CMPLT_DATE; }
	public List getList_creTodrREMARKS() { return l_creTodrREMARKS; }
	public List getList_creTodrODR_ACPT_DATE() { return l_creTodrODR_ACPT_DATE; }
	public List getList_creTodrSHIP_PLAN_REMAIN_QTY() { return l_creTodrSHIP_PLAN_REMAIN_QTY; }
	public List getList_creTodrSHIP_PLAN_CMPLT_FLG() { return l_creTodrSHIP_PLAN_CMPLT_FLG; }
	public List getList_creTodrUNCONFIRMED_ODR_EFF_OVR_FLG() { return l_creTodrUNCONFIRMED_ODR_EFF_OVR_FLG; }
	public List getList_creTodrPARTIAL_SHIP_INST_FLG() { return l_creTodrPARTIAL_SHIP_INST_FLG; }
	public List getList_creTodrENTRY_TYP() { return l_creTodrENTRY_TYP; }
	public List getList_creTodrDEL_FLG() { return l_creTodrDEL_FLG; }
	public List getList_upTodr_TOTAL_SHIP_QTY() { return l_upTodr_TOTAL_SHIP_QTY; }
	public List getList_upTodr_SHIP_AMOUNT() { return l_upTodr_SHIP_AMOUNT; }
	public List getList_upTodr_SHIP_AMOUNT_EXCH_RATES() { return l_upTodr_SHIP_AMOUNT_EXCH_RATES; }
	public List getList_upTodr_ODR_CMPLT_FLG() { return l_upTodr_ODR_CMPLT_FLG; }
	public List getList_upTodr_ODR_CMPLT_DATE() { return l_upTodr_ODR_CMPLT_DATE; }
	public List getList_upTodr_IN_ODRNO() { return l_upTodr_IN_ODRNO; }
	public List getList_creTrcvIssue_RCV_ISSUE_CTRL_CD() { return l_creTrcvIssue_RCV_ISSUE_CTRL_CD; }
	public List getList_creTrcvIssue_RCV_ISSUE_TYP() { return l_creTrcvIssue_RCV_ISSUE_TYP; }
	public List getList_creTrcvIssue_ITEM_CD() { return l_creTrcvIssue_ITEM_CD; }
	public List getList_creTrcvIssue_JOB_ODR_CD() { return l_creTrcvIssue_JOB_ODR_CD; }
	public List getList_creTrcvIssue_PLANT_CD() { return l_creTrcvIssue_PLANT_CD; }
	public List getList_creTrcvIssue_WH_CD() { return l_creTrcvIssue_WH_CD; }
	public List getList_creTrcvIssue_RCV_ISSUE_BEFORE_QTY() { return l_creTrcvIssue_RCV_ISSUE_BEFORE_QTY; }
	public List getList_creTrcvIssue_RCV_ISSUE_QTY() { return l_creTrcvIssue_RCV_ISSUE_QTY; }
	public List getList_creTrcvIssue_RCV_ISSUE_AFTER_QTY() { return l_creTrcvIssue_RCV_ISSUE_AFTER_QTY; }
	public List getList_creTrcvIssue_RCV_ISSUE_AMOUNT() { return l_creTrcvIssue_RCV_ISSUE_AMOUNT; }
	public List getList_creTrcvIssue_RCV_ISSUE_DATE() { return l_creTrcvIssue_RCV_ISSUE_DATE; }
	public List getList_creTrcvIssue_RCV_ISSUE_GNR_TYP() { return l_creTrcvIssue_RCV_ISSUE_GNR_TYP; }
	public List getList_creTrcvIssue_STOCK_UPD_TYP() { return l_creTrcvIssue_STOCK_UPD_TYP; }
	public List getList_creTrcvIssue_RCV_ISSUE_CMPLT_FLG() { return l_creTrcvIssue_RCV_ISSUE_CMPLT_FLG; }
	public List getList_creTrcvIssue_RCV_ISSUE_COMMENT() { return l_creTrcvIssue_RCV_ISSUE_COMMENT; }
	public List getList_creTrcvIssue_LOT_NO() { return l_creTrcvIssue_LOT_NO; }
	public List getList_creTrcvIssue_SHIP_ODR_NO() { return l_creTrcvIssue_SHIP_ODR_NO; }
	public List getList_upTitemStock_STOCK_ON_HAND_QTY() { return l_upTitemStock_STOCK_ON_HAND_QTY; }
	public List getList_upTitemStock_IN_ITEMCD() { return l_upTitemStock_IN_ITEMCD; }
	public List getList_upTitemStock_IN_WHCD() { return l_upTitemStock_IN_WHCD; }
	public List getList_serTitemStock_ITEM_CD() { return l_serTitemStock_ITEM_CD; }
	public List getList_serTitemStock_WH_CD() { return l_serTitemStock_WH_CD; }
	public List getList_serTitemStock_PLANT_CD() { return l_serTitemStock_PLANT_CD; }
	public List getList_serTitemStock_STOCK_ON_HAND_QTY() { return l_serTitemStock_STOCK_ON_HAND_QTY; }
	public List getList_serTitemStock_DEFECT_QTY() { return l_serTitemStock_DEFECT_QTY; }
	public List getList_serTitemStock_PRVS_DAYEND_STOCK_QTY() { return l_serTitemStock_PRVS_DAYEND_STOCK_QTY; }
	public List getList_serTitemStock_PRVS_MONTHEND_STOCK_QTY() { return l_serTitemStock_PRVS_MONTHEND_STOCK_QTY; }
	public List getList_serTitemStock_PRVS_TERMEND_STOCK_QTY() { return l_serTitemStock_PRVS_TERMEND_STOCK_QTY; }
	public List getList_serTitemStock_IN_ITEMCD() { return l_serTitemStock_IN_ITEMCD; }
	public List getList_serTitemStock_IN_WHCD() { return l_serTitemStock_IN_WHCD; }
	public List getList_creTitemStock_WH_CD() { return l_creTitemStock_WH_CD; }
	public List getList_creTitemStock_ITEM_CD() { return l_creTitemStock_ITEM_CD; }
	public List getList_creTitemStock_PLANT_CD() { return l_creTitemStock_PLANT_CD; }
	public List getList_creTitemStock_STOCK_ON_HAND_QTY() { return l_creTitemStock_STOCK_ON_HAND_QTY; }
	public List getList_mCust_COMPANY_CD() { return l_mCust_COMPANY_CD; }
	public List getList_mCust_CUST_CD() { return l_mCust_CUST_CD; }
	public List getList_mCust_CUST_NAME() { return l_mCust_CUST_NAME; }
	public List getList_mCust_DETAIL_ROUND_TYP() { return l_mCust_DETAIL_ROUND_TYP; }
	public List getList_mCust_INSPC_ACPT_TYP() { return l_mCust_INSPC_ACPT_TYP; }
	public List getList_mCust_OWN_ORG_CD() { return l_mCust_OWN_ORG_CD; }
	public List getList_mCust_EXCH_TYP() { return l_mCust_EXCH_TYP; }
	public List getList_mCust_CUR_CD() { return l_mCust_CUR_CD; }
	public List getList_mCust_IN_COMPANYCD() { return l_mCust_IN_COMPANYCD; }
	public List getList_mCust_IN_CUSTCD() { return l_mCust_IN_CUSTCD; }
	public List getList_getHomeCur_CUR_CD() { return l_getHomeCur_CUR_CD; }
	public List getList_getHomeCur_DECIMAL_FIG() { return l_getHomeCur_DECIMAL_FIG; }
	public List getList_getHomeCur_CTRL_CD() { return l_getHomeCur_CTRL_CD; }
	public List getList_strCode() { return l_strCode; }
	public List getList_mUnitCost_UNIT_COST() { return l_mUnitCost_UNIT_COST; }
	public List getList_mUnitCost_EFF_PHASE_IN_DATE() { return l_mUnitCost_EFF_PHASE_IN_DATE; }
	public List getList_mUnitCost_IN_COMPANYCD() { return l_mUnitCost_IN_COMPANYCD; }
	public List getList_mUnitCost_IN_CUSTCD() { return l_mUnitCost_IN_CUSTCD; }
	public List getList_mUnitCost_IN_ITEMCD() { return l_mUnitCost_IN_ITEMCD; }
	public List getList_mUnitCost_IN_EFFPHASEINDATE() { return l_mUnitCost_IN_EFFPHASEINDATE; }
	public List getList_readShipOdr_TOTAL_SHIP_QTY() { return l_readShipOdr_TOTAL_SHIP_QTY; }
	public List getList_readShipOdr_RETURN_QTY() { return l_readShipOdr_RETURN_QTY; }
	public List getList_readShipOdr_SHIP_ODR_NO() { return l_readShipOdr_SHIP_ODR_NO; }
	public List getList_g_CUR_UNIT() { return l_g_CUR_UNIT; }
	public List getList_DECIMAL_FIG() { return l_DECIMAL_FIG; }
	public List getList_t_CUR_CD() { return l_t_CUR_CD; }
	public List getList_strSLIP_CTRL_GRP() { return l_strSLIP_CTRL_GRP; }
	public List getList_strSTATUS() { return l_strSTATUS; }
	public List getList_strSLIP_CD() { return l_strSLIP_CD; }
	public List getList_upTshipOdr_SHP_CMPLT_FLG() { return l_upTshipOdr_SHP_CMPLT_FLG; }
	public List getList_upTshipOdr_TOTAL_SHIP_QTY() { return l_upTshipOdr_TOTAL_SHIP_QTY; }
	public List getList_upTshipOdr_SLIP_CD() { return l_upTshipOdr_SLIP_CD; }
	public List getList_upTshipOdr_ORG_SLIP_CD() { return l_upTshipOdr_ORG_SLIP_CD; }
	public List getList_upTshipOdr_SHIP_ODR_NO() { return l_upTshipOdr_SHIP_ODR_NO; }
	public List getList_strTod_OD_NO() { return l_strTod_OD_NO; }
	public List getList_strTod_TOTAL_ISSUE_QTY() { return l_strTod_TOTAL_ISSUE_QTY; }
	public List getList_strTod_DM_QTY() { return l_strTod_DM_QTY; }
	public List getList_strTod_DM_STS_TYP() { return l_strTod_DM_STS_TYP; }
	public List getList_inTod_ODR_NO() { return l_inTod_ODR_NO; }
	public List getList_inTod_PART_DLV_SEQ_NO() { return l_inTod_PART_DLV_SEQ_NO; }
	public List getList_inTod_OD_NO() { return l_inTod_OD_NO; }
	public List getList_strTaxTAX_KBN() { return l_strTaxTAX_KBN; }
	public List getList_strTaxOLD_TAX_1() { return l_strTaxOLD_TAX_1; }
	public List getList_strTaxOLD_TAX_2() { return l_strTaxOLD_TAX_2; }
	public List getList_strTaxOLD_TAX_3() { return l_strTaxOLD_TAX_3; }
	public List getList_strTaxNEW_TAX_1() { return l_strTaxNEW_TAX_1; }
	public List getList_strTaxNEW_TAX_2() { return l_strTaxNEW_TAX_2; }
	public List getList_strTaxNEW_TAX_3() { return l_strTaxNEW_TAX_3; }
	public List getList_strTaxSTART_DATE() { return l_strTaxSTART_DATE; }
	public List getList_strTaxROUND_TYP() { return l_strTaxROUND_TYP; }
	public List getList_updiffTAX_CD() { return l_updiffTAX_CD; }
	public List getList_upTshipOdr_RETURN_QTY() { return l_upTshipOdr_RETURN_QTY; }
	public List getList_chkSLIP_CD() { return l_chkSLIP_CD; }
	public List getList_mWh_WH_NAME() { return l_mWh_WH_NAME; }
	public List getList_mWh_PLANT_CD() { return l_mWh_PLANT_CD; }
	public List getList_mWh_IN_WH_CD() { return l_mWh_IN_WH_CD; }
	public List getList_mOrg_ORG_NAME() { return l_mOrg_ORG_NAME; }
	public List getList_mOrg_IN_COMPANYCD() { return l_mOrg_IN_COMPANYCD; }
	public List getList_mOrg_IN_ORGCD() { return l_mOrg_IN_ORGCD; }
	public List getList_serTitemStock_JOB_ODR_CD() { return l_serTitemStock_JOB_ODR_CD; }
	public List getList_serTitemStock_IN_JOBODRCD() { return l_serTitemStock_IN_JOBODRCD; }
	public List getList_creTitemStock_JOB_ODR_CD() { return l_creTitemStock_JOB_ODR_CD; }
	public List getList_upTitemStock_IN_JOBODRCD() { return l_upTitemStock_IN_JOBODRCD; }
	public List getList_serTJobOdr_JOB_ODR_CD() { return l_serTJobOdr_JOB_ODR_CD; }
	public List getList_serTJobOdr_ITEM_CD() { return l_serTJobOdr_ITEM_CD; }
	public List getList_diffSHIP_QTY() { return l_diffSHIP_QTY; }
	public List getList_diffSHIP_ODR_AMOUNT() { return l_diffSHIP_ODR_AMOUNT; }
	public List getList_diffSHIP_ODR_AMOUNT_EXCH_RATE() { return l_diffSHIP_ODR_AMOUNT_EXCH_RATE; }
	public List getList_diffSHIP_ODR_NO() { return l_diffSHIP_ODR_NO; }
	public List getList_diffODR_NO() { return l_diffODR_NO; }
	public List getList_diffPART_DLV_SEQ_NO() { return l_diffPART_DLV_SEQ_NO; }
	public List getList_diffSLIP_CD() { return l_diffSLIP_CD; }
	public List getList_diffITEM_CD() { return l_diffITEM_CD; }
	public List getList_diffJOB_ODR_CD() { return l_diffJOB_ODR_CD; }
	public List getList_diffCUST_ITEM_CD() { return l_diffCUST_ITEM_CD; }
	public List getList_diffCUST_ODR_NO() { return l_diffCUST_ODR_NO; }
	public List getList_diffCUST_CD() { return l_diffCUST_CD; }
	public List getList_diffCUST_NAME() { return l_diffCUST_NAME; }
	public List getList_diffCUST_CHRG_PSN_CD() { return l_diffCUST_CHRG_PSN_CD; }
	public List getList_diffSHIP_ODR_ISS_PSN_CD() { return l_diffSHIP_ODR_ISS_PSN_CD; }
	public List getList_diffDLV_LOC_CD() { return l_diffDLV_LOC_CD; }
	public List getList_diffDEPO_TYP() { return l_diffDEPO_TYP; }
	public List getList_diffDESINATED_SHIP_DATE() { return l_diffDESINATED_SHIP_DATE; }
	public List getList_diffSCDL_DLV_DATE() { return l_diffSCDL_DLV_DATE; }
	public List getList_diffTOTAL_SHIP_QTY() { return l_diffTOTAL_SHIP_QTY; }
	public List getList_diffRETURN_QTY() { return l_diffRETURN_QTY; }
	public List getList_diffUNIT_CD() { return l_diffUNIT_CD; }
	public List getList_diffUNIT_PRICE() { return l_diffUNIT_PRICE; }
	public List getList_diffCURRENCY_CD() { return l_diffCURRENCY_CD; }
	public List getList_diffLOC_CD() { return l_diffLOC_CD; }
	public List getList_diffPKG_UNIT_QTY() { return l_diffPKG_UNIT_QTY; }
	public List getList_diffREMARKS() { return l_diffREMARKS; }
	public List getList_diffDLV_KEY_NO() { return l_diffDLV_KEY_NO; }
	public List getList_diffPART_DLV_COUNT() { return l_diffPART_DLV_COUNT; }
	public List getList_diffTRANSPORT_CD() { return l_diffTRANSPORT_CD; }
	public List getList_diffTRANSPORT_TYP() { return l_diffTRANSPORT_TYP; }
	public List getList_diffALLCT_WH_CD() { return l_diffALLCT_WH_CD; }
	public List getList_diffTRANSFER_WH_CD() { return l_diffTRANSFER_WH_CD; }
	public List getList_diffDIRECT_DLV_FLG() { return l_diffDIRECT_DLV_FLG; }
	public List getList_diffENTRY_TYP() { return l_diffENTRY_TYP; }
	public List getList_diffPRINT_FLG() { return l_diffPRINT_FLG; }
	public List getList_diffSHIP_CMPLT_FLG() { return l_diffSHIP_CMPLT_FLG; }
	public List getList_diffDEPO_TRANSFER_PROC_FLG() { return l_diffDEPO_TRANSFER_PROC_FLG; }
	public List getList_diffDEL_FLG() { return l_diffDEL_FLG; }
	public List getList_diffuptOdr_SHIP_CNT() { return l_diffuptOdr_SHIP_CNT; }
	public List getList_diffuptOdr_PART_DLV_COUNT() { return l_diffuptOdr_PART_DLV_COUNT; }
	public List getList_diffuptOdr_IN_ODRNO() { return l_diffuptOdr_IN_ODRNO; }
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
	public List getList_up_tShipSlip_SLIP_CD() { return l_up_tShipSlip_SLIP_CD; }
	public List getList_updiffSHIP_ODR_QTY() { return l_updiffSHIP_ODR_QTY; }
	public List getList_updiffSHIP_ODR_AMOUNT() { return l_updiffSHIP_ODR_AMOUNT; }
	public List getList_updiffTAX_AMOUNT() { return l_updiffTAX_AMOUNT; }
	public List getList_updiffSHIP_ODR_AMOUNT_TAX() { return l_updiffSHIP_ODR_AMOUNT_TAX; }
	public List getList_updiffEXTERNAL_TAX_SALES_AMOUNT() { return l_updiffEXTERNAL_TAX_SALES_AMOUNT; }
	public List getList_updiffINTERNAL_TAX_SALES_AMOUNT() { return l_updiffINTERNAL_TAX_SALES_AMOUNT; }
	public List getList_updiffTAXFREE_SALES_AMOUNT() { return l_updiffTAXFREE_SALES_AMOUNT; }
	public List getList_updiffTAX_CREDIT_SALES_AMOUNT() { return l_updiffTAX_CREDIT_SALES_AMOUNT; }
	public List getList_updiffEXTERNAL_TAX_AMOUNT() { return l_updiffEXTERNAL_TAX_AMOUNT; }
	public List getList_updiffINTERNAL_TAX_AMOUNT() { return l_updiffINTERNAL_TAX_AMOUNT; }
	public List getList_updiffTAX_AMOUNT_1() { return l_updiffTAX_AMOUNT_1; }
	public List getList_updiffTAX_AMOUNT_2() { return l_updiffTAX_AMOUNT_2; }
	public List getList_updiffTAX_AMOUNT_3() { return l_updiffTAX_AMOUNT_3; }
	public List getList_updiffOWN_CUR_TAXCREDIT_SALES_AMOUNT() { return l_updiffOWN_CUR_TAXCREDIT_SALES_AMOUNT; }
	public List getList_updiffSLIP_CD() { return l_updiffSLIP_CD; }
	public List getList_PAST_RESULT_ENTRY_TYP() { return l_PAST_RESULT_ENTRY_TYP; }
	public List getList_PROC_EXEC_DATE() { return l_PROC_EXEC_DATE; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_mCustBase_TRANSPORT_LT() { return l_mCustBase_TRANSPORT_LT; }
	public List getList_mCustBase_IN_COMPANYCD() { return l_mCustBase_IN_COMPANYCD; }
	public List getList_mCustBase_IN_CUSTCD() { return l_mCustBase_IN_CUSTCD; }
	public List getList_mCustBase_IN_DLVLOCCD() { return l_mCustBase_IN_DLVLOCCD; }
	public List getList_strSYUKA_LT() { return l_strSYUKA_LT; }
	public List getList_strTaxIN_COMPANYCD() { return l_strTaxIN_COMPANYCD; }
	public List getList_strTaxIN_CUSTCD() { return l_strTaxIN_CUSTCD; }
	public List getList_g_CUST_ITEM_CD() { return l_g_CUST_ITEM_CD; }
	public List getList_strT_ODR_TAX() { return l_strT_ODR_TAX; }
	public List getList_g_SLIP_CD() { return l_g_SLIP_CD; }
	public List getList_getTship_SHIP_SEQ_NO() { return l_getTship_SHIP_SEQ_NO; }
	public List getList_chkLOT_NO() { return l_chkLOT_NO; }
	public List getList_chkITEM_CD() { return l_chkITEM_CD; }
	public List getList_getQtySTOCK_ON_HAND_QTY() { return l_getQtySTOCK_ON_HAND_QTY; }
	public List getList_getQtyALCD_QTY() { return l_getQtyALCD_QTY; }
	public List getList_getQtyITEM_CD() { return l_getQtyITEM_CD; }
	public List getList_getQtyWH_CD() { return l_getQtyWH_CD; }
	public List getList_getQtyLOT_NO() { return l_getQtyLOT_NO; }
	public List getList_readTlotStock_LOT_NO() { return l_readTlotStock_LOT_NO; }
	public List getList_readTlotStock_STOCK_ON_HAND_QTY() { return l_readTlotStock_STOCK_ON_HAND_QTY; }
	public List getList_readTlotStock_ALCD_QTY() { return l_readTlotStock_ALCD_QTY; }
	public List getList_readTlotStock_IN_ITEM_CD() { return l_readTlotStock_IN_ITEM_CD; }
	public List getList_readTlotStock_IN_WH_CD() { return l_readTlotStock_IN_WH_CD; }
	public List getList_readTlotStock_IN_LOT_NO() { return l_readTlotStock_IN_LOT_NO; }
	public List getList_upTlotStockSTOCK_ON_HAND_QTY() { return l_upTlotStockSTOCK_ON_HAND_QTY; }
	public List getList_upTlotStockIN_ITEM_CD() { return l_upTlotStockIN_ITEM_CD; }
	public List getList_upTlotStockIN_WH_CD() { return l_upTlotStockIN_WH_CD; }
	public List getList_upTlotStockIN_LOT_NO() { return l_upTlotStockIN_LOT_NO; }
	public List getList_serLotSTOCK_ON_HAND_QTY() { return l_serLotSTOCK_ON_HAND_QTY; }
	public List getList_serLotALCD_QTY() { return l_serLotALCD_QTY; }
	public List getList_serLotIN_ITEM_CD() { return l_serLotIN_ITEM_CD; }
	public List getList_serLotIN_WH_CD() { return l_serLotIN_WH_CD; }
	public List getList_serLotIN_LOT_NO() { return l_serLotIN_LOT_NO; }
	public List getList_insertLotStock_ITEM_CD() { return l_insertLotStock_ITEM_CD; }
	public List getList_insertLotStock_WH_CD() { return l_insertLotStock_WH_CD; }
	public List getList_insertLotStock_LOT_CD() { return l_insertLotStock_LOT_CD; }
	public List getList_insertLotStock_PLANT_CD() { return l_insertLotStock_PLANT_CD; }
	public List getList_insertLotStock_STOCK_ON_HAND_QTY() { return l_insertLotStock_STOCK_ON_HAND_QTY; }
	public List getList_insertLotStock_DEFECT_QTY() { return l_insertLotStock_DEFECT_QTY; }
	public List getList_insertLotStock_ALCD_QTY() { return l_insertLotStock_ALCD_QTY; }
	public List getList_insTshipInst_SHIP_SEQ_NO() { return l_insTshipInst_SHIP_SEQ_NO; }
	public List getList_insTshipInst_SHIP_ODR_NO() { return l_insTshipInst_SHIP_ODR_NO; }
	public List getList_insTshipInst_LOT_NO() { return l_insTshipInst_LOT_NO; }
	public List getList_insTshipInst_ITEM_CD() { return l_insTshipInst_ITEM_CD; }
	public List getList_insTshipInst_WH_CD() { return l_insTshipInst_WH_CD; }
	public List getList_insTshipInst_ODR_NO() { return l_insTshipInst_ODR_NO; }
	public List getList_insTshipInst_SLIP_CD() { return l_insTshipInst_SLIP_CD; }
	public List getList_insTshipInst_SHIP_QTY() { return l_insTshipInst_SHIP_QTY; }
	public List getList_insTshipInst_SHIP_DATE() { return l_insTshipInst_SHIP_DATE; }
	public List getList_delTshipInstIN_SHIP_SEQ_NO() { return l_delTshipInstIN_SHIP_SEQ_NO; }
	public List getList_delTshipInstIN_LOT_NO() { return l_delTshipInstIN_LOT_NO; }
	public List getList_tlotTrace_FROM_ITEM_CD() { return l_tlotTrace_FROM_ITEM_CD; }
	public List getList_tlotTrace_FROM_LOT_NO() { return l_tlotTrace_FROM_LOT_NO; }
	public List getList_tlotTrace_TO_ITEM_CD() { return l_tlotTrace_TO_ITEM_CD; }
	public List getList_tlotTrace_TO_LOT_NO() { return l_tlotTrace_TO_LOT_NO; }
	public List getList_tlotTrace_LOT_TRACE_TYP() { return l_tlotTrace_LOT_TRACE_TYP; }
	public List getList_tlotTrace_CUST_ODR_NO() { return l_tlotTrace_CUST_ODR_NO; }
	public List getList_tlotTrace_SLIP_CD() { return l_tlotTrace_SLIP_CD; }
	public List getList_tlotTrace_ODR_NO() { return l_tlotTrace_ODR_NO; }
	public List getList_readTshipInst_LOT_NO() { return l_readTshipInst_LOT_NO; }
	public List getList_readTshipInst_SHIP_QTY() { return l_readTshipInst_SHIP_QTY; }
	public List getList_readTshipInst_SHIP_ODR_NO() { return l_readTshipInst_SHIP_ODR_NO; }
	public List getList_readTshipInst_ITEM_CD() { return l_readTshipInst_ITEM_CD; }
	public List getList_readTshipInst_WH_CD() { return l_readTshipInst_WH_CD; }
	public List getList_readTshipInst_ODR_NO() { return l_readTshipInst_ODR_NO; }
	public List getList_readTshipInst_SLIP_CD() { return l_readTshipInst_SLIP_CD; }
	public List getList_readTshipInst_SHIP_DATE() { return l_readTshipInst_SHIP_DATE; }
	public List getList_readTshipInst_IN_SHIP_SEQ_NO() { return l_readTshipInst_IN_SHIP_SEQ_NO; }
	public List getList_readTshipInst_IN_LOT_NO() { return l_readTshipInst_IN_LOT_NO; }
	public List getList_readT_Ship_Inst_Lot_NO() { return l_readT_Ship_Inst_Lot_NO; }
	public List getList_readT_Ship_Inst_Ship_Seq_NO() { return l_readT_Ship_Inst_Ship_Seq_NO; }
	public List getList_strOdrCurrncyCd() { return l_strOdrCurrncyCd; }
	public List getList_strExchTyp() { return l_strExchTyp; }
	public List getList_g_DATE() { return l_g_DATE; }
	public List getList_selTShipOdr_MODIFY_COUNT() { return l_selTShipOdr_MODIFY_COUNT; }
	public List getList_SEL_MODIFY_COUNT() { return l_SEL_MODIFY_COUNT; }

	public void setk_MODE(String val) { m_k_MODE = val; }
	public void seth_RESULT(String val) { m_h_RESULT = val; }
	public void setr_SEL_PTN(String val) { m_r_SEL_PTN = val; }
	public void setg_DESINATED_SHIP_DATE(String val) { m_g_DESINATED_SHIP_DATE = val; }
	public void setg_SHIP_QTY(String val) { m_g_SHIP_QTY = val; }
	public void setg_SHIP_QTY2(String val) { m_g_SHIP_QTY2 = val; }
	public void setg_UNIT_PRICE(String val) { m_g_UNIT_PRICE = val; }
	public void setg_CURRNCY(String val) { m_g_CURRNCY = val; }
	public void setg_SHIP_ODR_AMOUNT(String val) { m_g_SHIP_ODR_AMOUNT = val; }
	public void setg_WH_CD(String val) { m_g_WH_CD = val; }
	public void setg_REMARKS(String val) { m_g_REMARKS = val; }
	public void setg_CUST_ANAME(String val) { m_g_CUST_ANAME = val; }
	public void setg_ITEM_CD(String val) { m_g_ITEM_CD = val; }
	public void seth_AP_SECRTY_TYP(String val) { m_h_AP_SECRTY_TYP = val; }
	public void seth_SHIP_QTY(String val) { m_h_SHIP_QTY = val; }
	public void seth_ITEM_CD(String val) { m_h_ITEM_CD = val; }
	public void seth_GYOMU_DATE(String val) { m_h_GYOMU_DATE = val; }
	public void seth_EXCH_TYP(String val) { m_h_EXCH_TYP = val; }
	public void seth_MODFIY_CNT(String val) { m_h_MODFIY_CNT = val; }
	public void seth_TOTAL_SHIP_QTY(String val) { m_h_TOTAL_SHIP_QTY = val; }
	public void setm_selRadio(String val) { m_m_selRadio = val; }
	public void setr_SEL_PTN1(String val) { m_r_SEL_PTN1 = val; }
	public void setr_SEL_PTN2(String val) { m_r_SEL_PTN2 = val; }
	public void setr_SEL_PTN3(String val) { m_r_SEL_PTN3 = val; }
	public void seth_SELECT_FG(String val) { m_h_SELECT_FG = val; }
	public void seth_UNIT_PRICE(String val) { m_h_UNIT_PRICE = val; }
	public void setg_STOCK_UNIT(String val) { m_g_STOCK_UNIT = val; }
	public void setg_STOCK_UNIT2(String val) { m_g_STOCK_UNIT2 = val; }
	public void setg_CUR_UNIT2(String val) { m_g_CUR_UNIT2 = val; }
	public void setg_WH_NAME(String val) { m_g_WH_NAME = val; }
	public void setg_SALES_DEPT_CD(String val) { m_g_SALES_DEPT_CD = val; }
	public void setg_ORG_NAME(String val) { m_g_ORG_NAME = val; }
	public void setg_CUST_CD(String val) { m_g_CUST_CD = val; }
	public void setg_CUST_ITEM_NAME(String val) { m_g_CUST_ITEM_NAME = val; }
	public void setg_ITEM_NAME(String val) { m_g_ITEM_NAME = val; }
	public void setg_CUST_ODR_NO(String val) { m_g_CUST_ODR_NO = val; }
	public void setg_ODR_NO(String val) { m_g_ODR_NO = val; }
	public void setg_PART_DLV_SEQ_NO(String val) { m_g_PART_DLV_SEQ_NO = val; }
	public void setg_SHIP_ODR_NO(String val) { m_g_SHIP_ODR_NO = val; }
	public void seth_DATE(String val) { m_h_DATE = val; }
	public void setg_JOB_ODR_CD(String val) { m_g_JOB_ODR_CD = val; }
	public void setc_JOB_ODR_CD(String val) { m_c_JOB_ODR_CD = val; }
	public void setg_DIRECT_DLV_FLG(String val) { m_g_DIRECT_DLV_FLG = val; }
	public void setg_STOCK_LOT_CD(String val) { m_g_STOCK_LOT_CD = val; }
	public void seth_STOCK_LOT_CD(String val) { m_h_STOCK_LOT_CD = val; }
	public void setparam1(String val) { m_param1 = val; }
	public void setparam2(String val) { m_param2 = val; }
	public void setparam3(String val) { m_param3 = val; }
	public void setROUND_TYP(String val) { m_ROUND_TYP = val; }
	public void setUNIT_QTY_TYP(String val) { m_UNIT_QTY_TYP = val; }
	public void setUNIT_FIG(String val) { m_UNIT_FIG = val; }
	public void setstrCOMPANY_CD(String val) { m_strCOMPANY_CD = val; }
	public void setstrUSER_NAME(String val) { m_strUSER_NAME = val; }
	public void setstrPLANT_CD(String val) { m_strPLANT_CD = val; }
	public void setstrSECTION_CD(String val) { m_strSECTION_CD = val; }
	public void setstrORG_CD(String val) { m_strORG_CD = val; }
	public void setstrORG_NAME(String val) { m_strORG_NAME = val; }
	public void setstrORG_ANAME(String val) { m_strORG_ANAME = val; }
	public void setstrPLANT_NAME(String val) { m_strPLANT_NAME = val; }
	public void setstrPLANT_ANAME(String val) { m_strPLANT_ANAME = val; }
	public void setstrCAL_NO(Double val) { m_strCAL_NO = val; }
	public void setstrUSER_CD(String val) { m_strUSER_CD = val; }
	public void setstrBUSINESS_OPR_DATE(String val) { m_strBUSINESS_OPR_DATE = val; }
	public void setserTori_SHIP_SEQ_NO(String val) { m_serTori_SHIP_SEQ_NO = val; }
	public void setserTori_SHIP_ODR_NO(String val) { m_serTori_SHIP_ODR_NO = val; }
	public void setserTori_SLIP_CD(String val) { m_serTori_SLIP_CD = val; }
	public void setserTori_ODR_NO(String val) { m_serTori_ODR_NO = val; }
	public void setserTori_PART_DLV_SEQ_NO(String val) { m_serTori_PART_DLV_SEQ_NO = val; }
	public void setserTori_ORGNAL_SLIP_CD(String val) { m_serTori_ORGNAL_SLIP_CD = val; }
	public void setserTori_SLIP_TRN_CD(String val) { m_serTori_SLIP_TRN_CD = val; }
	public void setserTori_ITEM_CD(String val) { m_serTori_ITEM_CD = val; }
	public void setserTori_JOB_ODR_CD(String val) { m_serTori_JOB_ODR_CD = val; }
	public void setserTori_CUST_ITEM_CD(String val) { m_serTori_CUST_ITEM_CD = val; }
	public void setserTori_CUST_ODR_NO(String val) { m_serTori_CUST_ODR_NO = val; }
	public void setserTori_CUST_CD(String val) { m_serTori_CUST_CD = val; }
	public void setserTori_CUST_NAME(String val) { m_serTori_CUST_NAME = val; }
	public void setserTori_CUST_CHRG_PSN_CD(String val) { m_serTori_CUST_CHRG_PSN_CD = val; }
	public void setserTori_SHIP_ODR_ISS_PSN_CD(String val) { m_serTori_SHIP_ODR_ISS_PSN_CD = val; }
	public void setserTori_DLV_LOC_CD(String val) { m_serTori_DLV_LOC_CD = val; }
	public void setserTori_DEPO_TYP(String val) { m_serTori_DEPO_TYP = val; }
	public void setserTori_ALLCT_WH_CD(String val) { m_serTori_ALLCT_WH_CD = val; }
	public void setserTori_DEPO_WH_CD(String val) { m_serTori_DEPO_WH_CD = val; }
	public void setserTori_LOC_CD(String val) { m_serTori_LOC_CD = val; }
	public void setserTori_SHIP_DATE(String val) { m_serTori_SHIP_DATE = val; }
	public void setserTori_SHIP_QTY(String val) { m_serTori_SHIP_QTY = val; }
	public void setserTori_UNIT_CD(String val) { m_serTori_UNIT_CD = val; }
	public void setserTori_SHIP_UNIT_PRICE(String val) { m_serTori_SHIP_UNIT_PRICE = val; }
	public void setserTori_SHIP_ODR_AMOUNT(String val) { m_serTori_SHIP_ODR_AMOUNT = val; }
	public void setserTori_SHIP_ODR_AMOUNT_EXCH_RATES(String val) { m_serTori_SHIP_ODR_AMOUNT_EXCH_RATES = val; }
	public void setserTori_CURRNCY_CD(String val) { m_serTori_CURRNCY_CD = val; }
	public void setserTori_DIRECT_DLV_FLG(String val) { m_serTori_DIRECT_DLV_FLG = val; }
	public void setserTori_SHIP_INFO_IF_CTRL_NO(String val) { m_serTori_SHIP_INFO_IF_CTRL_NO = val; }
	public void setserTori_INSPC_ACPT_INFO_IF_CTRL_NO(String val) { m_serTori_INSPC_ACPT_INFO_IF_CTRL_NO = val; }
	public void setserTori_DLV_KEY_NO(String val) { m_serTori_DLV_KEY_NO = val; }
	public void setserTori_DEL_FLG(String val) { m_serTori_DEL_FLG = val; }
	public void setserTori_CUR_NAME(String val) { m_serTori_CUR_NAME = val; }
	public void setserTori_EXCH_TYP(String val) { m_serTori_EXCH_TYP = val; }
	public void setserTori_MODIFY_COUNT(String val) { m_serTori_MODIFY_COUNT = val; }
	public void setserTori_RETURN_QTY(String val) { m_serTori_RETURN_QTY = val; }
	public void setserTori_TOTAL_SHIP_QTY(String val) { m_serTori_TOTAL_SHIP_QTY = val; }
	public void setserTori_STATUS(String val) { m_serTori_STATUS = val; }
	public void setserTori_INSPC_ACPT_TYP(String val) { m_serTori_INSPC_ACPT_TYP = val; }
	public void setserToriSALES_DEPT_CD(String val) { m_serToriSALES_DEPT_CD = val; }
	public void setserToriSALES_DATE(String val) { m_serToriSALES_DATE = val; }
	public void seth_MRP_ODR_TYP(String val) { m_h_MRP_ODR_TYP = val; }
	public void seth_LOT_CTRL_FLG(String val) { m_h_LOT_CTRL_FLG = val; }
	public void setserTodrMODIFY_COUNT(String val) { m_serTodrMODIFY_COUNT = val; }
	public void setserTori_IN_SLIPCD(String val) { m_serTori_IN_SLIPCD = val; }
	public void setcreTship_SHIP_SEQ_NO(String val) { m_creTship_SHIP_SEQ_NO = val; }
	public void setcreTship_SHIP_ODR_NO(String val) { m_creTship_SHIP_ODR_NO = val; }
	public void setcreTship_SLIP_CD(String val) { m_creTship_SLIP_CD = val; }
	public void setcreTship_ODR_NO(String val) { m_creTship_ODR_NO = val; }
	public void setcreTship_PART_DLV_SEQ_NO(String val) { m_creTship_PART_DLV_SEQ_NO = val; }
	public void setcreTship_ORGNAL_SLIP_CD(String val) { m_creTship_ORGNAL_SLIP_CD = val; }
	public void setcreTship_SLIP_TRN_CD(String val) { m_creTship_SLIP_TRN_CD = val; }
	public void setcreTship_ITEM_CD(String val) { m_creTship_ITEM_CD = val; }
	public void setcreTship_JOB_ODR_CD(String val) { m_creTship_JOB_ODR_CD = val; }
	public void setcreTship_CUST_ITEM_CD(String val) { m_creTship_CUST_ITEM_CD = val; }
	public void setcreTship_CUST_ODR_NO(String val) { m_creTship_CUST_ODR_NO = val; }
	public void setcreTship_CUST_CD(String val) { m_creTship_CUST_CD = val; }
	public void setcreTship_CUST_NAME(String val) { m_creTship_CUST_NAME = val; }
	public void setcreTship_CUST_CHRG_PSN_CD(String val) { m_creTship_CUST_CHRG_PSN_CD = val; }
	public void setcreTship_SHIP_ODR_ISS_PSN_CD(String val) { m_creTship_SHIP_ODR_ISS_PSN_CD = val; }
	public void setcreTship_DLV_LOC_CD(String val) { m_creTship_DLV_LOC_CD = val; }
	public void setcreTship_DEPO_TYP(String val) { m_creTship_DEPO_TYP = val; }
	public void setcreTship_ALLCT_WH_CD(String val) { m_creTship_ALLCT_WH_CD = val; }
	public void setcreTship_DEPO_WH_CD(String val) { m_creTship_DEPO_WH_CD = val; }
	public void setcreTship_LOC_CD(String val) { m_creTship_LOC_CD = val; }
	public void setcreTship_SHIP_DATE(String val) { m_creTship_SHIP_DATE = val; }
	public void setcreTship_SHIP_QTY(String val) { m_creTship_SHIP_QTY = val; }
	public void setcreTship_UNIT_CD(String val) { m_creTship_UNIT_CD = val; }
	public void setcreTship_SHIP_UNIT_PRICE(String val) { m_creTship_SHIP_UNIT_PRICE = val; }
	public void setcreTship_SHIP_ODR_AMOUNT(String val) { m_creTship_SHIP_ODR_AMOUNT = val; }
	public void setcreTship_SHIP_ODR_AMOUNT_EXCH_RATES(String val) { m_creTship_SHIP_ODR_AMOUNT_EXCH_RATES = val; }
	public void setcreTship_CURRNCY_CD(String val) { m_creTship_CURRNCY_CD = val; }
	public void setcreTship_DIRECT_DLV_FLG(String val) { m_creTship_DIRECT_DLV_FLG = val; }
	public void setcreTship_DLV_KEY_NO(String val) { m_creTship_DLV_KEY_NO = val; }
	public void setcreTship_REMARKS(String val) { m_creTship_REMARKS = val; }
	public void setcreTship_DEL_FLG(String val) { m_creTship_DEL_FLG = val; }
	public void setupdTship_SHIP_SEQ_NO(String val) { m_updTship_SHIP_SEQ_NO = val; }
	public void setserInsert_SHIP_ODR_NO(String val) { m_serInsert_SHIP_ODR_NO = val; }
	public void setserInsert_ODR_NO(String val) { m_serInsert_ODR_NO = val; }
	public void setserInsert_PART_DLV_SEQ_NO(String val) { m_serInsert_PART_DLV_SEQ_NO = val; }
	public void setserInsert_SLIP_CD(String val) { m_serInsert_SLIP_CD = val; }
	public void setserInsert_ITEM_CD(String val) { m_serInsert_ITEM_CD = val; }
	public void setserInsert_JOB_ODR_CD(String val) { m_serInsert_JOB_ODR_CD = val; }
	public void setserInsert_CUST_ITEM_CD(String val) { m_serInsert_CUST_ITEM_CD = val; }
	public void setserInsert_CUST_ODR_NO(String val) { m_serInsert_CUST_ODR_NO = val; }
	public void setserInsert_CUST_CD(String val) { m_serInsert_CUST_CD = val; }
	public void setserInsert_CUST_NAME(String val) { m_serInsert_CUST_NAME = val; }
	public void setserInsert_CUST_CHRG_PSN_CD(String val) { m_serInsert_CUST_CHRG_PSN_CD = val; }
	public void setserInsert_SHIP_ODR_ISS_PSN_CD(String val) { m_serInsert_SHIP_ODR_ISS_PSN_CD = val; }
	public void setserInsert_DLV_LOC_CD(String val) { m_serInsert_DLV_LOC_CD = val; }
	public void setserInsert_DEPO_TYP(String val) { m_serInsert_DEPO_TYP = val; }
	public void setserInsert_DESINATED_SHIP_DATE(String val) { m_serInsert_DESINATED_SHIP_DATE = val; }
	public void setserInsert_SHIP_QTY(String val) { m_serInsert_SHIP_QTY = val; }
	public void setserInsert_TOTAL_SHIP_QTY(String val) { m_serInsert_TOTAL_SHIP_QTY = val; }
	public void setserInsert_UNIT_CD(String val) { m_serInsert_UNIT_CD = val; }
	public void setserInsert_UNIT_PRICE(String val) { m_serInsert_UNIT_PRICE = val; }
	public void setserInsert_SHIP_ODR_AMOUNT(String val) { m_serInsert_SHIP_ODR_AMOUNT = val; }
	public void setserInsert_SHIP_ODR_AMOUNT_EXCH_RATES(String val) { m_serInsert_SHIP_ODR_AMOUNT_EXCH_RATES = val; }
	public void setserInsert_CURRNCY_CD(String val) { m_serInsert_CURRNCY_CD = val; }
	public void setserInsert_LOC_CD(String val) { m_serInsert_LOC_CD = val; }
	public void setserInsert_PKG_UNIT_QTY(String val) { m_serInsert_PKG_UNIT_QTY = val; }
	public void setserInsert_REMARKS(String val) { m_serInsert_REMARKS = val; }
	public void setserInsert_TRANSPORT_CD(String val) { m_serInsert_TRANSPORT_CD = val; }
	public void setserInsert_TRANSPORT_TYP(String val) { m_serInsert_TRANSPORT_TYP = val; }
	public void setserInsert_ALLCT_WH_CD(String val) { m_serInsert_ALLCT_WH_CD = val; }
	public void setserInsert_TRANSFER_WH_CD(String val) { m_serInsert_TRANSFER_WH_CD = val; }
	public void setserInsert_DIRECT_DLV_FLG(String val) { m_serInsert_DIRECT_DLV_FLG = val; }
	public void setserInsert_ENTRY_TYP(String val) { m_serInsert_ENTRY_TYP = val; }
	public void setserInsert_PRINT_FLG(String val) { m_serInsert_PRINT_FLG = val; }
	public void setserInsert_SHP_CMPLT_FLG(String val) { m_serInsert_SHP_CMPLT_FLG = val; }
	public void setserInsert_DEPO_TRANSFER_PROC_FLG(String val) { m_serInsert_DEPO_TRANSFER_PROC_FLG = val; }
	public void setserInsert_DEL_FLG(String val) { m_serInsert_DEL_FLG = val; }
	public void setserInsert_CUR_CD(String val) { m_serInsert_CUR_CD = val; }
	public void setserInsert_CUR_NAME(String val) { m_serInsert_CUR_NAME = val; }
	public void setserInsert_EXCH_TYP(String val) { m_serInsert_EXCH_TYP = val; }
	public void setserInsert_SPCL_PRICE_TYP(String val) { m_serInsert_SPCL_PRICE_TYP = val; }
	public void setserInsert_MODIFY_COUNT(String val) { m_serInsert_MODIFY_COUNT = val; }
	public void setserInsert_SCDL_DLV_DATE(String val) { m_serInsert_SCDL_DLV_DATE = val; }
	public void setserInsert_DLV_KEY_NO(String val) { m_serInsert_DLV_KEY_NO = val; }
	public void seth_RETURN_QTY(String val) { m_h_RETURN_QTY = val; }
	public void setserInsert_ODR_ACPT_DATE(String val) { m_serInsert_ODR_ACPT_DATE = val; }
	public void seth_JOB_ODR_CD(String val) { m_h_JOB_ODR_CD = val; }
	public void setselMODIFY_COUNT(String val) { m_selMODIFY_COUNT = val; }
	public void setserInsert_IN_SLIPCD(String val) { m_serInsert_IN_SLIPCD = val; }
	public void setupTshipOdr_DEPO_TRANSFER_PROC_FLG(String val) { m_upTshipOdr_DEPO_TRANSFER_PROC_FLG = val; }
	public void setupTshipOdr_IN_SLIPCD(String val) { m_upTshipOdr_IN_SLIPCD = val; }
	public void setchkisWhCd_WH_CD(String val) { m_chkisWhCd_WH_CD = val; }
	public void setchkisWhCd_WH_TYP(String val) { m_chkisWhCd_WH_TYP = val; }
	public void setchkisinWhCd_WH_NAME(String val) { m_chkisinWhCd_WH_NAME = val; }
	public void setchkisWhCd_IN_WHCD(String val) { m_chkisWhCd_IN_WHCD = val; }
	public void setchkisWhCd_IN_WHTYP(String val) { m_chkisWhCd_IN_WHTYP = val; }
	public void setcreTsales_SHIP_ODR_NO(String val) { m_creTsales_SHIP_ODR_NO = val; }
	public void setcreTsales_SLIP_CD(String val) { m_creTsales_SLIP_CD = val; }
	public void setcreTsales_SALES_TYP(String val) { m_creTsales_SALES_TYP = val; }
	public void setcreTsales_CUST_CD(String val) { m_creTsales_CUST_CD = val; }
	public void setcreTsales_ITEM_CD(String val) { m_creTsales_ITEM_CD = val; }
	public void setcreTsales_ITEM_NAME(String val) { m_creTsales_ITEM_NAME = val; }
	public void setcreTsales_CUST_ODR_NO(String val) { m_creTsales_CUST_ODR_NO = val; }
	public void setcreTsales_SALES_DATE(String val) { m_creTsales_SALES_DATE = val; }
	public void setcreTsales_SALES_DEPT_CD(String val) { m_creTsales_SALES_DEPT_CD = val; }
	public void setcreTsales_CUST_CHRG_PSN_CD(String val) { m_creTsales_CUST_CHRG_PSN_CD = val; }
	public void setcreTsales_ODR_ACPT_PSN_CD(String val) { m_creTsales_ODR_ACPT_PSN_CD = val; }
	public void setcreTsales_SALES_QTY(String val) { m_creTsales_SALES_QTY = val; }
	public void setcreTsales_SALES_UNIT_PRICE(String val) { m_creTsales_SALES_UNIT_PRICE = val; }
	public void setcreTsales_UNIT_CD(String val) { m_creTsales_UNIT_CD = val; }
	public void setcreTsales_SALES_AMOUNT(String val) { m_creTsales_SALES_AMOUNT = val; }
	public void setcreTsales_SALES_AMOUNT_EXCH_RATES(String val) { m_creTsales_SALES_AMOUNT_EXCH_RATES = val; }
	public void setcreTsales_INSPC_ACPT_DATE(String val) { m_creTsales_INSPC_ACPT_DATE = val; }
	public void setcreTsales_INSPC_ACPT_QTY(String val) { m_creTsales_INSPC_ACPT_QTY = val; }
	public void setcreTsales_EXTERNAL_TAX_SALES_AMOUNT(String val) { m_creTsales_EXTERNAL_TAX_SALES_AMOUNT = val; }
	public void setcreTsales_INTERNAL_TAX_SALES_AMOUNT(String val) { m_creTsales_INTERNAL_TAX_SALES_AMOUNT = val; }
	public void setcreTsales_TAXFREE_SALES_AMOUNT(String val) { m_creTsales_TAXFREE_SALES_AMOUNT = val; }
	public void setcreTsales_TAX_CREDIT_SALES_AMOUNT(String val) { m_creTsales_TAX_CREDIT_SALES_AMOUNT = val; }
	public void setcreTsales_EXTERNAL_TAX_AMOUNT(String val) { m_creTsales_EXTERNAL_TAX_AMOUNT = val; }
	public void setcreTsales_INTERNAL_TAX_AMOUNT(String val) { m_creTsales_INTERNAL_TAX_AMOUNT = val; }
	public void setcreTsales_TAX_AMOUNT_1(String val) { m_creTsales_TAX_AMOUNT_1 = val; }
	public void setcreTsales_TAX_AMOUNT_2(String val) { m_creTsales_TAX_AMOUNT_2 = val; }
	public void setcreTsales_TAX_AMOUNT_3(String val) { m_creTsales_TAX_AMOUNT_3 = val; }
	public void setcreTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT(String val) { m_creTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT = val; }
	public void setcreTsales_ORG_SLIP_CD(String val) { m_creTsales_ORG_SLIP_CD = val; }
	public void setcreTsales_CURRNCY_CD(String val) { m_creTsales_CURRNCY_CD = val; }
	public void setcreTsales_SPCL_PRICE_CO(String val) { m_creTsales_SPCL_PRICE_CO = val; }
	public void setcreTsales_REMARKS(String val) { m_creTsales_REMARKS = val; }
	public void setcreTsales_DEL_FLG(String val) { m_creTsales_DEL_FLG = val; }
	public void setcreTsales_INSPC_ACPT_TYP(String val) { m_creTsales_INSPC_ACPT_TYP = val; }
	public void setcreTsales_STATUS(String val) { m_creTsales_STATUS = val; }
	public void setcreTsales_APPR_FLG(String val) { m_creTsales_APPR_FLG = val; }
	public void setcreTsales_APPR_ID(String val) { m_creTsales_APPR_ID = val; }
	public void setcreTsales_APPR_DATE(String val) { m_creTsales_APPR_DATE = val; }
	public void setcreTsales_EXCH_RATE(String val) { m_creTsales_EXCH_RATE = val; }
	public void setserTsales_SALES_SEQ_NO(String val) { m_serTsales_SALES_SEQ_NO = val; }
	public void setserTsales_SLIP_CD(String val) { m_serTsales_SLIP_CD = val; }
	public void setserTsales_SALES_TYP(String val) { m_serTsales_SALES_TYP = val; }
	public void setserTsales_CUST_CD(String val) { m_serTsales_CUST_CD = val; }
	public void setserTsales_ITEM_CD(String val) { m_serTsales_ITEM_CD = val; }
	public void setserTsales_ITEM_NAME(String val) { m_serTsales_ITEM_NAME = val; }
	public void setserTsales_CUST_ODR_NO(String val) { m_serTsales_CUST_ODR_NO = val; }
	public void setserTsales_SALES_DATE(String val) { m_serTsales_SALES_DATE = val; }
	public void setserTsales_SALES_DEPT_CD(String val) { m_serTsales_SALES_DEPT_CD = val; }
	public void setserTsales_CUST_CHRG_PSN_CD(String val) { m_serTsales_CUST_CHRG_PSN_CD = val; }
	public void setserTsales_ODR_ACPT_PSN_CD(String val) { m_serTsales_ODR_ACPT_PSN_CD = val; }
	public void setserTsales_SALES_QTY(String val) { m_serTsales_SALES_QTY = val; }
	public void setserTsales_SALES_UNIT_PRICE(String val) { m_serTsales_SALES_UNIT_PRICE = val; }
	public void setserTsales_UNIT_CD(String val) { m_serTsales_UNIT_CD = val; }
	public void setserTsales_SALES_AMOUNT(String val) { m_serTsales_SALES_AMOUNT = val; }
	public void setserTsales_SALES_AMOUNT_EXCH_RATES(String val) { m_serTsales_SALES_AMOUNT_EXCH_RATES = val; }
	public void setserTsales_EXTERNAL_TAX_SALES_AMOUNT(String val) { m_serTsales_EXTERNAL_TAX_SALES_AMOUNT = val; }
	public void setserTsales_INTERNAL_TAX_SALES_AMOUNT(String val) { m_serTsales_INTERNAL_TAX_SALES_AMOUNT = val; }
	public void setserTsales_TAXFREE_SALES_AMOUNT(String val) { m_serTsales_TAXFREE_SALES_AMOUNT = val; }
	public void setserTsales_TAX_CREDIT_SALES_AMOUNT(String val) { m_serTsales_TAX_CREDIT_SALES_AMOUNT = val; }
	public void setserTsales_EXTERNAL_TAX_AMOUNT(String val) { m_serTsales_EXTERNAL_TAX_AMOUNT = val; }
	public void setserTsales_INTERNAL_TAX_AMOUNT(String val) { m_serTsales_INTERNAL_TAX_AMOUNT = val; }
	public void setserTsales_TAX_AMOUNT_1(String val) { m_serTsales_TAX_AMOUNT_1 = val; }
	public void setserTsales_TAX_AMOUNT_2(String val) { m_serTsales_TAX_AMOUNT_2 = val; }
	public void setserTsales_TAX_AMOUNT_3(String val) { m_serTsales_TAX_AMOUNT_3 = val; }
	public void setserTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT(String val) { m_serTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT = val; }
	public void setserTsales_ORG_SLIP_CD(String val) { m_serTsales_ORG_SLIP_CD = val; }
	public void setserTsales_CURRNCY_CD(String val) { m_serTsales_CURRNCY_CD = val; }
	public void setserTsales_SPCL_PRICE_CO(String val) { m_serTsales_SPCL_PRICE_CO = val; }
	public void setserTsales_REMARKS(String val) { m_serTsales_REMARKS = val; }
	public void setserTsales_DEL_FLG(String val) { m_serTsales_DEL_FLG = val; }
	public void setserTsales_INSPC_ACPT_TYP(String val) { m_serTsales_INSPC_ACPT_TYP = val; }
	public void setserTsales_STATUS(String val) { m_serTsales_STATUS = val; }
	public void setserTsales_PRD_ODR_PLACE_CD(String val) { m_serTsales_PRD_ODR_PLACE_CD = val; }
	public void setserTsales_EXCH_RATE(String val) { m_serTsales_EXCH_RATE = val; }
	public void setserTsales_IN_SLIPCD(String val) { m_serTsales_IN_SLIPCD = val; }
	public void setupdTsales_APPR_FLG(String val) { m_updTsales_APPR_FLG = val; }
	public void setupdTsales_APPR_ID(String val) { m_updTsales_APPR_ID = val; }
	public void setupdTsales_APPR_DATE(String val) { m_updTsales_APPR_DATE = val; }
	public void setupdTsales_SALES_SEQ_NO(String val) { m_updTsales_SALES_SEQ_NO = val; }
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
	public void setmItemSpec_CUST_CD(String val) { m_mItemSpec_CUST_CD = val; }
	public void setmItemSpec_CUST_ITEM_CD(String val) { m_mItemSpec_CUST_ITEM_CD = val; }
	public void setmItemSpec_COMPANY_CD(String val) { m_mItemSpec_COMPANY_CD = val; }
	public void setmItemSpec_SALES_DEPT_CD(String val) { m_mItemSpec_SALES_DEPT_CD = val; }
	public void setmItemSpec_CUST_ITEM_NAME(String val) { m_mItemSpec_CUST_ITEM_NAME = val; }
	public void setmItemSpec_IN_CUST_CD(String val) { m_mItemSpec_IN_CUST_CD = val; }
	public void setmItemSpec_IN_CUST_ITEM_CD(String val) { m_mItemSpec_IN_CUST_ITEM_CD = val; }
	public void setmItemSpec_IN_COMPANY_CD(String val) { m_mItemSpec_IN_COMPANY_CD = val; }
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
	public void settOdr_DLV_KEY_NO(String val) { m_tOdr_DLV_KEY_NO = val; }
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
	public void settOdr_DEL_FLG(String val) { m_tOdr_DEL_FLG = val; }
	public void settOdr_SHIP_CNT(String val) { m_tOdr_SHIP_CNT = val; }
	public void settOdr_UNIT_CD_ORG(String val) { m_tOdr_UNIT_CD_ORG = val; }
	public void settOdrCtl_CUST_ITEM_CD(String val) { m_tOdrCtl_CUST_ITEM_CD = val; }
	public void settOdr_COCK_TYP(String val) { m_tOdr_COCK_TYP = val; }
	public void settOdr_PUCH_ODR_QTY_TOTAL(String val) { m_tOdr_PUCH_ODR_QTY_TOTAL = val; }
	public void settOdr_BUYER_ORG_CD(String val) { m_tOdr_BUYER_ORG_CD = val; }
	public void settOdr_BUYER_NAME(String val) { m_tOdr_BUYER_NAME = val; }
	public void settOdr_IN_ODRNO(String val) { m_tOdr_IN_ODRNO = val; }
	public void setcreTodrODR_NO(String val) { m_creTodrODR_NO = val; }
	public void setcreTodrODR_TYP(String val) { m_creTodrODR_TYP = val; }
	public void setcreTodrODR_CTL_NO(String val) { m_creTodrODR_CTL_NO = val; }
	public void setcreTodrCUST_ODR_NO(String val) { m_creTodrCUST_ODR_NO = val; }
	public void setcreTodrCUST_CHRG_ORG_CD(String val) { m_creTodrCUST_CHRG_ORG_CD = val; }
	public void setcreTodrCUST_CHRG_PSN_CD(String val) { m_creTodrCUST_CHRG_PSN_CD = val; }
	public void setcreTodrODR_ACPT_ORG_CD(String val) { m_creTodrODR_ACPT_ORG_CD = val; }
	public void setcreTodrODR_ACPT_PSN_CD(String val) { m_creTodrODR_ACPT_PSN_CD = val; }
	public void setcreTodrCURRNCY_CD(String val) { m_creTodrCURRNCY_CD = val; }
	public void setcreTodrEXCH_TYP(String val) { m_creTodrEXCH_TYP = val; }
	public void setcreTodrDLV_LOC_CD(String val) { m_creTodrDLV_LOC_CD = val; }
	public void setcreTodrDLV_LOC_NAME(String val) { m_creTodrDLV_LOC_NAME = val; }
	public void setcreTodrDLV_LOC_NAME_KANJI(String val) { m_creTodrDLV_LOC_NAME_KANJI = val; }
	public void setcreTodrPRD_ODR_PLACE_CD(String val) { m_creTodrPRD_ODR_PLACE_CD = val; }
	public void setcreTodrODR_UNIT_PRICE(String val) { m_creTodrODR_UNIT_PRICE = val; }
	public void setcreTodrPART_DLV_COUNT(String val) { m_creTodrPART_DLV_COUNT = val; }
	public void setcreTodrDEPO_TYP(String val) { m_creTodrDEPO_TYP = val; }
	public void setcreTodrDESINATED_DLV_DATE(String val) { m_creTodrDESINATED_DLV_DATE = val; }
	public void setcreTodrODR_QTY(String val) { m_creTodrODR_QTY = val; }
	public void setcreTodrREMAIN_UNCONFIRM_ODR_QTY(String val) { m_creTodrREMAIN_UNCONFIRM_ODR_QTY = val; }
	public void setcreTodrCANCELED_UNCONFIRM_ODR_QTY(String val) { m_creTodrCANCELED_UNCONFIRM_ODR_QTY = val; }
	public void setcreTodrUNIT_CD(String val) { m_creTodrUNIT_CD = val; }
	public void setcreTodrUNCONFIRM_ODR_BALANCE(String val) { m_creTodrUNCONFIRM_ODR_BALANCE = val; }
	public void setcreTodrODR_AMOUNT(String val) { m_creTodrODR_AMOUNT = val; }
	public void setcreTodrODR_AMOUNT_EXCH_RATES(String val) { m_creTodrODR_AMOUNT_EXCH_RATES = val; }
	public void setcreTodrTOTAL_SHIP_QTY(String val) { m_creTodrTOTAL_SHIP_QTY = val; }
	public void setcreTodrSHIP_AMOUNT(String val) { m_creTodrSHIP_AMOUNT = val; }
	public void setcreTodrSHIP_AMOUNT_EXCH_RATES(String val) { m_creTodrSHIP_AMOUNT_EXCH_RATES = val; }
	public void setcreTodrODR_CMPLT_FLG(String val) { m_creTodrODR_CMPLT_FLG = val; }
	public void setcreTodrODR_CMPLT_DATE(String val) { m_creTodrODR_CMPLT_DATE = val; }
	public void setcreTodrREMARKS(String val) { m_creTodrREMARKS = val; }
	public void setcreTodrODR_ACPT_DATE(String val) { m_creTodrODR_ACPT_DATE = val; }
	public void setcreTodrSHIP_PLAN_REMAIN_QTY(String val) { m_creTodrSHIP_PLAN_REMAIN_QTY = val; }
	public void setcreTodrSHIP_PLAN_CMPLT_FLG(String val) { m_creTodrSHIP_PLAN_CMPLT_FLG = val; }
	public void setcreTodrUNCONFIRMED_ODR_EFF_OVR_FLG(String val) { m_creTodrUNCONFIRMED_ODR_EFF_OVR_FLG = val; }
	public void setcreTodrPARTIAL_SHIP_INST_FLG(String val) { m_creTodrPARTIAL_SHIP_INST_FLG = val; }
	public void setcreTodrENTRY_TYP(String val) { m_creTodrENTRY_TYP = val; }
	public void setcreTodrDEL_FLG(String val) { m_creTodrDEL_FLG = val; }
	public void setupTodr_TOTAL_SHIP_QTY(String val) { m_upTodr_TOTAL_SHIP_QTY = val; }
	public void setupTodr_SHIP_AMOUNT(String val) { m_upTodr_SHIP_AMOUNT = val; }
	public void setupTodr_SHIP_AMOUNT_EXCH_RATES(String val) { m_upTodr_SHIP_AMOUNT_EXCH_RATES = val; }
	public void setupTodr_ODR_CMPLT_FLG(String val) { m_upTodr_ODR_CMPLT_FLG = val; }
	public void setupTodr_ODR_CMPLT_DATE(String val) { m_upTodr_ODR_CMPLT_DATE = val; }
	public void setupTodr_IN_ODRNO(String val) { m_upTodr_IN_ODRNO = val; }
	public void setcreTrcvIssue_RCV_ISSUE_CTRL_CD(String val) { m_creTrcvIssue_RCV_ISSUE_CTRL_CD = val; }
	public void setcreTrcvIssue_RCV_ISSUE_TYP(String val) { m_creTrcvIssue_RCV_ISSUE_TYP = val; }
	public void setcreTrcvIssue_ITEM_CD(String val) { m_creTrcvIssue_ITEM_CD = val; }
	public void setcreTrcvIssue_JOB_ODR_CD(String val) { m_creTrcvIssue_JOB_ODR_CD = val; }
	public void setcreTrcvIssue_PLANT_CD(String val) { m_creTrcvIssue_PLANT_CD = val; }
	public void setcreTrcvIssue_WH_CD(String val) { m_creTrcvIssue_WH_CD = val; }
	public void setcreTrcvIssue_RCV_ISSUE_BEFORE_QTY(String val) { m_creTrcvIssue_RCV_ISSUE_BEFORE_QTY = val; }
	public void setcreTrcvIssue_RCV_ISSUE_QTY(String val) { m_creTrcvIssue_RCV_ISSUE_QTY = val; }
	public void setcreTrcvIssue_RCV_ISSUE_AFTER_QTY(String val) { m_creTrcvIssue_RCV_ISSUE_AFTER_QTY = val; }
	public void setcreTrcvIssue_RCV_ISSUE_AMOUNT(String val) { m_creTrcvIssue_RCV_ISSUE_AMOUNT = val; }
	public void setcreTrcvIssue_RCV_ISSUE_DATE(String val) { m_creTrcvIssue_RCV_ISSUE_DATE = val; }
	public void setcreTrcvIssue_RCV_ISSUE_GNR_TYP(String val) { m_creTrcvIssue_RCV_ISSUE_GNR_TYP = val; }
	public void setcreTrcvIssue_STOCK_UPD_TYP(String val) { m_creTrcvIssue_STOCK_UPD_TYP = val; }
	public void setcreTrcvIssue_RCV_ISSUE_CMPLT_FLG(String val) { m_creTrcvIssue_RCV_ISSUE_CMPLT_FLG = val; }
	public void setcreTrcvIssue_RCV_ISSUE_COMMENT(String val) { m_creTrcvIssue_RCV_ISSUE_COMMENT = val; }
	public void setcreTrcvIssue_LOT_NO(String val) { m_creTrcvIssue_LOT_NO = val; }
	public void setcreTrcvIssue_SHIP_ODR_NO(String val) { m_creTrcvIssue_SHIP_ODR_NO = val; }
	public void setupTitemStock_STOCK_ON_HAND_QTY(String val) { m_upTitemStock_STOCK_ON_HAND_QTY = val; }
	public void setupTitemStock_IN_ITEMCD(String val) { m_upTitemStock_IN_ITEMCD = val; }
	public void setupTitemStock_IN_WHCD(String val) { m_upTitemStock_IN_WHCD = val; }
	public void setserTitemStock_ITEM_CD(String val) { m_serTitemStock_ITEM_CD = val; }
	public void setserTitemStock_WH_CD(String val) { m_serTitemStock_WH_CD = val; }
	public void setserTitemStock_PLANT_CD(String val) { m_serTitemStock_PLANT_CD = val; }
	public void setserTitemStock_STOCK_ON_HAND_QTY(String val) { m_serTitemStock_STOCK_ON_HAND_QTY = val; }
	public void setserTitemStock_DEFECT_QTY(String val) { m_serTitemStock_DEFECT_QTY = val; }
	public void setserTitemStock_PRVS_DAYEND_STOCK_QTY(String val) { m_serTitemStock_PRVS_DAYEND_STOCK_QTY = val; }
	public void setserTitemStock_PRVS_MONTHEND_STOCK_QTY(String val) { m_serTitemStock_PRVS_MONTHEND_STOCK_QTY = val; }
	public void setserTitemStock_PRVS_TERMEND_STOCK_QTY(String val) { m_serTitemStock_PRVS_TERMEND_STOCK_QTY = val; }
	public void setserTitemStock_IN_ITEMCD(String val) { m_serTitemStock_IN_ITEMCD = val; }
	public void setserTitemStock_IN_WHCD(String val) { m_serTitemStock_IN_WHCD = val; }
	public void setcreTitemStock_WH_CD(String val) { m_creTitemStock_WH_CD = val; }
	public void setcreTitemStock_ITEM_CD(String val) { m_creTitemStock_ITEM_CD = val; }
	public void setcreTitemStock_PLANT_CD(String val) { m_creTitemStock_PLANT_CD = val; }
	public void setcreTitemStock_STOCK_ON_HAND_QTY(String val) { m_creTitemStock_STOCK_ON_HAND_QTY = val; }
	public void setmCust_COMPANY_CD(String val) { m_mCust_COMPANY_CD = val; }
	public void setmCust_CUST_CD(String val) { m_mCust_CUST_CD = val; }
	public void setmCust_CUST_NAME(String val) { m_mCust_CUST_NAME = val; }
	public void setmCust_DETAIL_ROUND_TYP(String val) { m_mCust_DETAIL_ROUND_TYP = val; }
	public void setmCust_INSPC_ACPT_TYP(String val) { m_mCust_INSPC_ACPT_TYP = val; }
	public void setmCust_OWN_ORG_CD(String val) { m_mCust_OWN_ORG_CD = val; }
	public void setmCust_EXCH_TYP(String val) { m_mCust_EXCH_TYP = val; }
	public void setmCust_CUR_CD(String val) { m_mCust_CUR_CD = val; }
	public void setmCust_IN_COMPANYCD(String val) { m_mCust_IN_COMPANYCD = val; }
	public void setmCust_IN_CUSTCD(String val) { m_mCust_IN_CUSTCD = val; }
	public void setgetHomeCur_CUR_CD(String val) { m_getHomeCur_CUR_CD = val; }
	public void setgetHomeCur_DECIMAL_FIG(String val) { m_getHomeCur_DECIMAL_FIG = val; }
	public void setgetHomeCur_CTRL_CD(String val) { m_getHomeCur_CTRL_CD = val; }
	public void setstrCode(String val) { m_strCode = val; }
	public void setmUnitCost_UNIT_COST(String val) { m_mUnitCost_UNIT_COST = val; }
	public void setmUnitCost_EFF_PHASE_IN_DATE(String val) { m_mUnitCost_EFF_PHASE_IN_DATE = val; }
	public void setmUnitCost_IN_COMPANYCD(String val) { m_mUnitCost_IN_COMPANYCD = val; }
	public void setmUnitCost_IN_CUSTCD(String val) { m_mUnitCost_IN_CUSTCD = val; }
	public void setmUnitCost_IN_ITEMCD(String val) { m_mUnitCost_IN_ITEMCD = val; }
	public void setmUnitCost_IN_EFFPHASEINDATE(String val) { m_mUnitCost_IN_EFFPHASEINDATE = val; }
	public void setreadShipOdr_TOTAL_SHIP_QTY(String val) { m_readShipOdr_TOTAL_SHIP_QTY = val; }
	public void setreadShipOdr_RETURN_QTY(String val) { m_readShipOdr_RETURN_QTY = val; }
	public void setreadShipOdr_SHIP_ODR_NO(String val) { m_readShipOdr_SHIP_ODR_NO = val; }
	public void setg_CUR_UNIT(String val) { m_g_CUR_UNIT = val; }
	public void setDECIMAL_FIG(String val) { m_DECIMAL_FIG = val; }
	public void sett_CUR_CD(String val) { m_t_CUR_CD = val; }
	public void setstrSLIP_CTRL_GRP(String val) { m_strSLIP_CTRL_GRP = val; }
	public void setstrSTATUS(String val) { m_strSTATUS = val; }
	public void setstrSLIP_CD(String val) { m_strSLIP_CD = val; }
	public void setupTshipOdr_SHP_CMPLT_FLG(String val) { m_upTshipOdr_SHP_CMPLT_FLG = val; }
	public void setupTshipOdr_TOTAL_SHIP_QTY(String val) { m_upTshipOdr_TOTAL_SHIP_QTY = val; }
	public void setupTshipOdr_SLIP_CD(String val) { m_upTshipOdr_SLIP_CD = val; }
	public void setupTshipOdr_ORG_SLIP_CD(String val) { m_upTshipOdr_ORG_SLIP_CD = val; }
	public void setupTshipOdr_SHIP_ODR_NO(String val) { m_upTshipOdr_SHIP_ODR_NO = val; }
	public void setstrTod_OD_NO(String val) { m_strTod_OD_NO = val; }
	public void setstrTod_TOTAL_ISSUE_QTY(String val) { m_strTod_TOTAL_ISSUE_QTY = val; }
	public void setstrTod_DM_QTY(String val) { m_strTod_DM_QTY = val; }
	public void setstrTod_DM_STS_TYP(String val) { m_strTod_DM_STS_TYP = val; }
	public void setinTod_ODR_NO(String val) { m_inTod_ODR_NO = val; }
	public void setinTod_PART_DLV_SEQ_NO(String val) { m_inTod_PART_DLV_SEQ_NO = val; }
	public void setinTod_OD_NO(String val) { m_inTod_OD_NO = val; }
	public void setstrTaxTAX_KBN(String val) { m_strTaxTAX_KBN = val; }
	public void setstrTaxOLD_TAX_1(String val) { m_strTaxOLD_TAX_1 = val; }
	public void setstrTaxOLD_TAX_2(String val) { m_strTaxOLD_TAX_2 = val; }
	public void setstrTaxOLD_TAX_3(String val) { m_strTaxOLD_TAX_3 = val; }
	public void setstrTaxNEW_TAX_1(String val) { m_strTaxNEW_TAX_1 = val; }
	public void setstrTaxNEW_TAX_2(String val) { m_strTaxNEW_TAX_2 = val; }
	public void setstrTaxNEW_TAX_3(String val) { m_strTaxNEW_TAX_3 = val; }
	public void setstrTaxSTART_DATE(String val) { m_strTaxSTART_DATE = val; }
	public void setstrTaxROUND_TYP(String val) { m_strTaxROUND_TYP = val; }
	public void setupdiffTAX_CD(String val) { m_updiffTAX_CD = val; }
	public void setupTshipOdr_RETURN_QTY(String val) { m_upTshipOdr_RETURN_QTY = val; }
	public void setchkSLIP_CD(String val) { m_chkSLIP_CD = val; }
	public void setmWh_WH_NAME(String val) { m_mWh_WH_NAME = val; }
	public void setmWh_PLANT_CD(String val) { m_mWh_PLANT_CD = val; }
	public void setmWh_IN_WH_CD(String val) { m_mWh_IN_WH_CD = val; }
	public void setmOrg_ORG_NAME(String val) { m_mOrg_ORG_NAME = val; }
	public void setmOrg_IN_COMPANYCD(String val) { m_mOrg_IN_COMPANYCD = val; }
	public void setmOrg_IN_ORGCD(String val) { m_mOrg_IN_ORGCD = val; }
	public void setserTitemStock_JOB_ODR_CD(String val) { m_serTitemStock_JOB_ODR_CD = val; }
	public void setserTitemStock_IN_JOBODRCD(String val) { m_serTitemStock_IN_JOBODRCD = val; }
	public void setcreTitemStock_JOB_ODR_CD(String val) { m_creTitemStock_JOB_ODR_CD = val; }
	public void setupTitemStock_IN_JOBODRCD(String val) { m_upTitemStock_IN_JOBODRCD = val; }
	public void setserTJobOdr_JOB_ODR_CD(String val) { m_serTJobOdr_JOB_ODR_CD = val; }
	public void setserTJobOdr_ITEM_CD(String val) { m_serTJobOdr_ITEM_CD = val; }
	public void setdiffSHIP_QTY(String val) { m_diffSHIP_QTY = val; }
	public void setdiffSHIP_ODR_AMOUNT(String val) { m_diffSHIP_ODR_AMOUNT = val; }
	public void setdiffSHIP_ODR_AMOUNT_EXCH_RATE(String val) { m_diffSHIP_ODR_AMOUNT_EXCH_RATE = val; }
	public void setdiffSHIP_ODR_NO(String val) { m_diffSHIP_ODR_NO = val; }
	public void setdiffODR_NO(String val) { m_diffODR_NO = val; }
	public void setdiffPART_DLV_SEQ_NO(String val) { m_diffPART_DLV_SEQ_NO = val; }
	public void setdiffSLIP_CD(String val) { m_diffSLIP_CD = val; }
	public void setdiffITEM_CD(String val) { m_diffITEM_CD = val; }
	public void setdiffJOB_ODR_CD(String val) { m_diffJOB_ODR_CD = val; }
	public void setdiffCUST_ITEM_CD(String val) { m_diffCUST_ITEM_CD = val; }
	public void setdiffCUST_ODR_NO(String val) { m_diffCUST_ODR_NO = val; }
	public void setdiffCUST_CD(String val) { m_diffCUST_CD = val; }
	public void setdiffCUST_NAME(String val) { m_diffCUST_NAME = val; }
	public void setdiffCUST_CHRG_PSN_CD(String val) { m_diffCUST_CHRG_PSN_CD = val; }
	public void setdiffSHIP_ODR_ISS_PSN_CD(String val) { m_diffSHIP_ODR_ISS_PSN_CD = val; }
	public void setdiffDLV_LOC_CD(String val) { m_diffDLV_LOC_CD = val; }
	public void setdiffDEPO_TYP(String val) { m_diffDEPO_TYP = val; }
	public void setdiffDESINATED_SHIP_DATE(String val) { m_diffDESINATED_SHIP_DATE = val; }
	public void setdiffSCDL_DLV_DATE(String val) { m_diffSCDL_DLV_DATE = val; }
	public void setdiffTOTAL_SHIP_QTY(String val) { m_diffTOTAL_SHIP_QTY = val; }
	public void setdiffRETURN_QTY(String val) { m_diffRETURN_QTY = val; }
	public void setdiffUNIT_CD(String val) { m_diffUNIT_CD = val; }
	public void setdiffUNIT_PRICE(String val) { m_diffUNIT_PRICE = val; }
	public void setdiffCURRENCY_CD(String val) { m_diffCURRENCY_CD = val; }
	public void setdiffLOC_CD(String val) { m_diffLOC_CD = val; }
	public void setdiffPKG_UNIT_QTY(String val) { m_diffPKG_UNIT_QTY = val; }
	public void setdiffREMARKS(String val) { m_diffREMARKS = val; }
	public void setdiffDLV_KEY_NO(String val) { m_diffDLV_KEY_NO = val; }
	public void setdiffPART_DLV_COUNT(String val) { m_diffPART_DLV_COUNT = val; }
	public void setdiffTRANSPORT_CD(String val) { m_diffTRANSPORT_CD = val; }
	public void setdiffTRANSPORT_TYP(String val) { m_diffTRANSPORT_TYP = val; }
	public void setdiffALLCT_WH_CD(String val) { m_diffALLCT_WH_CD = val; }
	public void setdiffTRANSFER_WH_CD(String val) { m_diffTRANSFER_WH_CD = val; }
	public void setdiffDIRECT_DLV_FLG(String val) { m_diffDIRECT_DLV_FLG = val; }
	public void setdiffENTRY_TYP(String val) { m_diffENTRY_TYP = val; }
	public void setdiffPRINT_FLG(String val) { m_diffPRINT_FLG = val; }
	public void setdiffSHIP_CMPLT_FLG(String val) { m_diffSHIP_CMPLT_FLG = val; }
	public void setdiffDEPO_TRANSFER_PROC_FLG(String val) { m_diffDEPO_TRANSFER_PROC_FLG = val; }
	public void setdiffDEL_FLG(String val) { m_diffDEL_FLG = val; }
	public void setdiffuptOdr_SHIP_CNT(String val) { m_diffuptOdr_SHIP_CNT = val; }
	public void setdiffuptOdr_PART_DLV_COUNT(String val) { m_diffuptOdr_PART_DLV_COUNT = val; }
	public void setdiffuptOdr_IN_ODRNO(String val) { m_diffuptOdr_IN_ODRNO = val; }
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
	public void setup_tShipSlip_SLIP_CD(String val) { m_up_tShipSlip_SLIP_CD = val; }
	public void setupdiffSHIP_ODR_QTY(String val) { m_updiffSHIP_ODR_QTY = val; }
	public void setupdiffSHIP_ODR_AMOUNT(String val) { m_updiffSHIP_ODR_AMOUNT = val; }
	public void setupdiffTAX_AMOUNT(String val) { m_updiffTAX_AMOUNT = val; }
	public void setupdiffSHIP_ODR_AMOUNT_TAX(String val) { m_updiffSHIP_ODR_AMOUNT_TAX = val; }
	public void setupdiffEXTERNAL_TAX_SALES_AMOUNT(String val) { m_updiffEXTERNAL_TAX_SALES_AMOUNT = val; }
	public void setupdiffINTERNAL_TAX_SALES_AMOUNT(String val) { m_updiffINTERNAL_TAX_SALES_AMOUNT = val; }
	public void setupdiffTAXFREE_SALES_AMOUNT(String val) { m_updiffTAXFREE_SALES_AMOUNT = val; }
	public void setupdiffTAX_CREDIT_SALES_AMOUNT(String val) { m_updiffTAX_CREDIT_SALES_AMOUNT = val; }
	public void setupdiffEXTERNAL_TAX_AMOUNT(String val) { m_updiffEXTERNAL_TAX_AMOUNT = val; }
	public void setupdiffINTERNAL_TAX_AMOUNT(String val) { m_updiffINTERNAL_TAX_AMOUNT = val; }
	public void setupdiffTAX_AMOUNT_1(String val) { m_updiffTAX_AMOUNT_1 = val; }
	public void setupdiffTAX_AMOUNT_2(String val) { m_updiffTAX_AMOUNT_2 = val; }
	public void setupdiffTAX_AMOUNT_3(String val) { m_updiffTAX_AMOUNT_3 = val; }
	public void setupdiffOWN_CUR_TAXCREDIT_SALES_AMOUNT(String val) { m_updiffOWN_CUR_TAXCREDIT_SALES_AMOUNT = val; }
	public void setupdiffSLIP_CD(String val) { m_updiffSLIP_CD = val; }
	public void setPAST_RESULT_ENTRY_TYP(String val) { m_PAST_RESULT_ENTRY_TYP = val; }
	public void setPROC_EXEC_DATE(BigDecimal val) { m_PROC_EXEC_DATE = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setmCustBase_TRANSPORT_LT(String val) { m_mCustBase_TRANSPORT_LT = val; }
	public void setmCustBase_IN_COMPANYCD(String val) { m_mCustBase_IN_COMPANYCD = val; }
	public void setmCustBase_IN_CUSTCD(String val) { m_mCustBase_IN_CUSTCD = val; }
	public void setmCustBase_IN_DLVLOCCD(String val) { m_mCustBase_IN_DLVLOCCD = val; }
	public void setstrSYUKA_LT(String val) { m_strSYUKA_LT = val; }
	public void setstrTaxIN_COMPANYCD(String val) { m_strTaxIN_COMPANYCD = val; }
	public void setstrTaxIN_CUSTCD(String val) { m_strTaxIN_CUSTCD = val; }
	public void setg_CUST_ITEM_CD(String val) { m_g_CUST_ITEM_CD = val; }
	public void setstrT_ODR_TAX(String val) { m_strT_ODR_TAX = val; }
	public void setg_SLIP_CD(String val) { m_g_SLIP_CD = val; }
	public void setgetTship_SHIP_SEQ_NO(String val) { m_getTship_SHIP_SEQ_NO = val; }
	public void setchkLOT_NO(String val) { m_chkLOT_NO = val; }
	public void setchkITEM_CD(String val) { m_chkITEM_CD = val; }
	public void setgetQtySTOCK_ON_HAND_QTY(String val) { m_getQtySTOCK_ON_HAND_QTY = val; }
	public void setgetQtyALCD_QTY(String val) { m_getQtyALCD_QTY = val; }
	public void setgetQtyITEM_CD(String val) { m_getQtyITEM_CD = val; }
	public void setgetQtyWH_CD(String val) { m_getQtyWH_CD = val; }
	public void setgetQtyLOT_NO(String val) { m_getQtyLOT_NO = val; }
	public void setreadTlotStock_LOT_NO(String val) { m_readTlotStock_LOT_NO = val; }
	public void setreadTlotStock_STOCK_ON_HAND_QTY(String val) { m_readTlotStock_STOCK_ON_HAND_QTY = val; }
	public void setreadTlotStock_ALCD_QTY(String val) { m_readTlotStock_ALCD_QTY = val; }
	public void setreadTlotStock_IN_ITEM_CD(String val) { m_readTlotStock_IN_ITEM_CD = val; }
	public void setreadTlotStock_IN_WH_CD(String val) { m_readTlotStock_IN_WH_CD = val; }
	public void setreadTlotStock_IN_LOT_NO(String val) { m_readTlotStock_IN_LOT_NO = val; }
	public void setupTlotStockSTOCK_ON_HAND_QTY(String val) { m_upTlotStockSTOCK_ON_HAND_QTY = val; }
	public void setupTlotStockIN_ITEM_CD(String val) { m_upTlotStockIN_ITEM_CD = val; }
	public void setupTlotStockIN_WH_CD(String val) { m_upTlotStockIN_WH_CD = val; }
	public void setupTlotStockIN_LOT_NO(String val) { m_upTlotStockIN_LOT_NO = val; }
	public void setserLotSTOCK_ON_HAND_QTY(String val) { m_serLotSTOCK_ON_HAND_QTY = val; }
	public void setserLotALCD_QTY(String val) { m_serLotALCD_QTY = val; }
	public void setserLotIN_ITEM_CD(String val) { m_serLotIN_ITEM_CD = val; }
	public void setserLotIN_WH_CD(String val) { m_serLotIN_WH_CD = val; }
	public void setserLotIN_LOT_NO(String val) { m_serLotIN_LOT_NO = val; }
	public void setinsertLotStock_ITEM_CD(String val) { m_insertLotStock_ITEM_CD = val; }
	public void setinsertLotStock_WH_CD(String val) { m_insertLotStock_WH_CD = val; }
	public void setinsertLotStock_LOT_CD(String val) { m_insertLotStock_LOT_CD = val; }
	public void setinsertLotStock_PLANT_CD(String val) { m_insertLotStock_PLANT_CD = val; }
	public void setinsertLotStock_STOCK_ON_HAND_QTY(String val) { m_insertLotStock_STOCK_ON_HAND_QTY = val; }
	public void setinsertLotStock_DEFECT_QTY(String val) { m_insertLotStock_DEFECT_QTY = val; }
	public void setinsertLotStock_ALCD_QTY(String val) { m_insertLotStock_ALCD_QTY = val; }
	public void setinsTshipInst_SHIP_SEQ_NO(String val) { m_insTshipInst_SHIP_SEQ_NO = val; }
	public void setinsTshipInst_SHIP_ODR_NO(String val) { m_insTshipInst_SHIP_ODR_NO = val; }
	public void setinsTshipInst_LOT_NO(String val) { m_insTshipInst_LOT_NO = val; }
	public void setinsTshipInst_ITEM_CD(String val) { m_insTshipInst_ITEM_CD = val; }
	public void setinsTshipInst_WH_CD(String val) { m_insTshipInst_WH_CD = val; }
	public void setinsTshipInst_ODR_NO(String val) { m_insTshipInst_ODR_NO = val; }
	public void setinsTshipInst_SLIP_CD(String val) { m_insTshipInst_SLIP_CD = val; }
	public void setinsTshipInst_SHIP_QTY(String val) { m_insTshipInst_SHIP_QTY = val; }
	public void setinsTshipInst_SHIP_DATE(String val) { m_insTshipInst_SHIP_DATE = val; }
	public void setdelTshipInstIN_SHIP_SEQ_NO(String val) { m_delTshipInstIN_SHIP_SEQ_NO = val; }
	public void setdelTshipInstIN_LOT_NO(String val) { m_delTshipInstIN_LOT_NO = val; }
	public void settlotTrace_FROM_ITEM_CD(String val) { m_tlotTrace_FROM_ITEM_CD = val; }
	public void settlotTrace_FROM_LOT_NO(String val) { m_tlotTrace_FROM_LOT_NO = val; }
	public void settlotTrace_TO_ITEM_CD(String val) { m_tlotTrace_TO_ITEM_CD = val; }
	public void settlotTrace_TO_LOT_NO(String val) { m_tlotTrace_TO_LOT_NO = val; }
	public void settlotTrace_LOT_TRACE_TYP(String val) { m_tlotTrace_LOT_TRACE_TYP = val; }
	public void settlotTrace_CUST_ODR_NO(String val) { m_tlotTrace_CUST_ODR_NO = val; }
	public void settlotTrace_SLIP_CD(String val) { m_tlotTrace_SLIP_CD = val; }
	public void settlotTrace_ODR_NO(String val) { m_tlotTrace_ODR_NO = val; }
	public void setreadTshipInst_LOT_NO(String val) { m_readTshipInst_LOT_NO = val; }
	public void setreadTshipInst_SHIP_QTY(String val) { m_readTshipInst_SHIP_QTY = val; }
	public void setreadTshipInst_SHIP_ODR_NO(String val) { m_readTshipInst_SHIP_ODR_NO = val; }
	public void setreadTshipInst_ITEM_CD(String val) { m_readTshipInst_ITEM_CD = val; }
	public void setreadTshipInst_WH_CD(String val) { m_readTshipInst_WH_CD = val; }
	public void setreadTshipInst_ODR_NO(String val) { m_readTshipInst_ODR_NO = val; }
	public void setreadTshipInst_SLIP_CD(String val) { m_readTshipInst_SLIP_CD = val; }
	public void setreadTshipInst_SHIP_DATE(String val) { m_readTshipInst_SHIP_DATE = val; }
	public void setreadTshipInst_IN_SHIP_SEQ_NO(String val) { m_readTshipInst_IN_SHIP_SEQ_NO = val; }
	public void setreadTshipInst_IN_LOT_NO(String val) { m_readTshipInst_IN_LOT_NO = val; }
	public void setreadT_Ship_Inst_Lot_NO(String val) { m_readT_Ship_Inst_Lot_NO = val; }
	public void setreadT_Ship_Inst_Ship_Seq_NO(String val) { m_readT_Ship_Inst_Ship_Seq_NO = val; }
	public void setstrOdrCurrncyCd(String val) { m_strOdrCurrncyCd = val; }
	public void setstrExchTyp(String val) { m_strExchTyp = val; }
	public void setg_DATE(String val) { m_g_DATE = val; }
	public void setselTShipOdr_MODIFY_COUNT(String val) { m_selTShipOdr_MODIFY_COUNT = val; }
	public void setSEL_MODIFY_COUNT(String val) { m_SEL_MODIFY_COUNT = val; }


	public void setList_k_MODE(List list) { l_k_MODE = list; }
	public void setList_h_RESULT(List list) { l_h_RESULT = list; }
	public void setList_r_SEL_PTN(List list) { l_r_SEL_PTN = list; }
	public void setList_g_DESINATED_SHIP_DATE(List list) { l_g_DESINATED_SHIP_DATE = list; }
	public void setList_g_SHIP_QTY(List list) { l_g_SHIP_QTY = list; }
	public void setList_g_SHIP_QTY2(List list) { l_g_SHIP_QTY2 = list; }
	public void setList_g_UNIT_PRICE(List list) { l_g_UNIT_PRICE = list; }
	public void setList_g_CURRNCY(List list) { l_g_CURRNCY = list; }
	public void setList_g_SHIP_ODR_AMOUNT(List list) { l_g_SHIP_ODR_AMOUNT = list; }
	public void setList_g_WH_CD(List list) { l_g_WH_CD = list; }
	public void setList_g_REMARKS(List list) { l_g_REMARKS = list; }
	public void setList_g_CUST_ANAME(List list) { l_g_CUST_ANAME = list; }
	public void setList_g_ITEM_CD(List list) { l_g_ITEM_CD = list; }
	public void setList_h_AP_SECRTY_TYP(List list) { l_h_AP_SECRTY_TYP = list; }
	public void setList_h_SHIP_QTY(List list) { l_h_SHIP_QTY = list; }
	public void setList_h_ITEM_CD(List list) { l_h_ITEM_CD = list; }
	public void setList_h_GYOMU_DATE(List list) { l_h_GYOMU_DATE = list; }
	public void setList_h_EXCH_TYP(List list) { l_h_EXCH_TYP = list; }
	public void setList_h_MODFIY_CNT(List list) { l_h_MODFIY_CNT = list; }
	public void setList_h_TOTAL_SHIP_QTY(List list) { l_h_TOTAL_SHIP_QTY = list; }
	public void setList_m_selRadio(List list) { l_m_selRadio = list; }
	public void setList_r_SEL_PTN1(List list) { l_r_SEL_PTN1 = list; }
	public void setList_r_SEL_PTN2(List list) { l_r_SEL_PTN2 = list; }
	public void setList_r_SEL_PTN3(List list) { l_r_SEL_PTN3 = list; }
	public void setList_h_SELECT_FG(List list) { l_h_SELECT_FG = list; }
	public void setList_h_UNIT_PRICE(List list) { l_h_UNIT_PRICE = list; }
	public void setList_g_STOCK_UNIT(List list) { l_g_STOCK_UNIT = list; }
	public void setList_g_STOCK_UNIT2(List list) { l_g_STOCK_UNIT2 = list; }
	public void setList_g_CUR_UNIT2(List list) { l_g_CUR_UNIT2 = list; }
	public void setList_g_WH_NAME(List list) { l_g_WH_NAME = list; }
	public void setList_g_SALES_DEPT_CD(List list) { l_g_SALES_DEPT_CD = list; }
	public void setList_g_ORG_NAME(List list) { l_g_ORG_NAME = list; }
	public void setList_g_CUST_CD(List list) { l_g_CUST_CD = list; }
	public void setList_g_CUST_ITEM_NAME(List list) { l_g_CUST_ITEM_NAME = list; }
	public void setList_g_ITEM_NAME(List list) { l_g_ITEM_NAME = list; }
	public void setList_g_CUST_ODR_NO(List list) { l_g_CUST_ODR_NO = list; }
	public void setList_g_ODR_NO(List list) { l_g_ODR_NO = list; }
	public void setList_g_PART_DLV_SEQ_NO(List list) { l_g_PART_DLV_SEQ_NO = list; }
	public void setList_g_SHIP_ODR_NO(List list) { l_g_SHIP_ODR_NO = list; }
	public void setList_h_DATE(List list) { l_h_DATE = list; }
	public void setList_g_JOB_ODR_CD(List list) { l_g_JOB_ODR_CD = list; }
	public void setList_c_JOB_ODR_CD(List list) { l_c_JOB_ODR_CD = list; }
	public void setList_g_DIRECT_DLV_FLG(List list) { l_g_DIRECT_DLV_FLG = list; }
	public void setList_g_STOCK_LOT_CD(List list) { l_g_STOCK_LOT_CD = list; }
	public void setList_h_STOCK_LOT_CD(List list) { l_h_STOCK_LOT_CD = list; }
	public void setList_param1(List list) { l_param1 = list; }
	public void setList_param2(List list) { l_param2 = list; }
	public void setList_param3(List list) { l_param3 = list; }
	public void setList_ROUND_TYP(List list) { l_ROUND_TYP = list; }
	public void setList_UNIT_QTY_TYP(List list) { l_UNIT_QTY_TYP = list; }
	public void setList_UNIT_FIG(List list) { l_UNIT_FIG = list; }
	public void setList_strCOMPANY_CD(List list) { l_strCOMPANY_CD = list; }
	public void setList_strUSER_NAME(List list) { l_strUSER_NAME = list; }
	public void setList_strPLANT_CD(List list) { l_strPLANT_CD = list; }
	public void setList_strSECTION_CD(List list) { l_strSECTION_CD = list; }
	public void setList_strORG_CD(List list) { l_strORG_CD = list; }
	public void setList_strORG_NAME(List list) { l_strORG_NAME = list; }
	public void setList_strORG_ANAME(List list) { l_strORG_ANAME = list; }
	public void setList_strPLANT_NAME(List list) { l_strPLANT_NAME = list; }
	public void setList_strPLANT_ANAME(List list) { l_strPLANT_ANAME = list; }
	public void setList_strCAL_NO(List list) { l_strCAL_NO = list; }
	public void setList_strUSER_CD(List list) { l_strUSER_CD = list; }
	public void setList_strBUSINESS_OPR_DATE(List list) { l_strBUSINESS_OPR_DATE = list; }
	public void setList_serTori_SHIP_SEQ_NO(List list) { l_serTori_SHIP_SEQ_NO = list; }
	public void setList_serTori_SHIP_ODR_NO(List list) { l_serTori_SHIP_ODR_NO = list; }
	public void setList_serTori_SLIP_CD(List list) { l_serTori_SLIP_CD = list; }
	public void setList_serTori_ODR_NO(List list) { l_serTori_ODR_NO = list; }
	public void setList_serTori_PART_DLV_SEQ_NO(List list) { l_serTori_PART_DLV_SEQ_NO = list; }
	public void setList_serTori_ORGNAL_SLIP_CD(List list) { l_serTori_ORGNAL_SLIP_CD = list; }
	public void setList_serTori_SLIP_TRN_CD(List list) { l_serTori_SLIP_TRN_CD = list; }
	public void setList_serTori_ITEM_CD(List list) { l_serTori_ITEM_CD = list; }
	public void setList_serTori_JOB_ODR_CD(List list) { l_serTori_JOB_ODR_CD = list; }
	public void setList_serTori_CUST_ITEM_CD(List list) { l_serTori_CUST_ITEM_CD = list; }
	public void setList_serTori_CUST_ODR_NO(List list) { l_serTori_CUST_ODR_NO = list; }
	public void setList_serTori_CUST_CD(List list) { l_serTori_CUST_CD = list; }
	public void setList_serTori_CUST_NAME(List list) { l_serTori_CUST_NAME = list; }
	public void setList_serTori_CUST_CHRG_PSN_CD(List list) { l_serTori_CUST_CHRG_PSN_CD = list; }
	public void setList_serTori_SHIP_ODR_ISS_PSN_CD(List list) { l_serTori_SHIP_ODR_ISS_PSN_CD = list; }
	public void setList_serTori_DLV_LOC_CD(List list) { l_serTori_DLV_LOC_CD = list; }
	public void setList_serTori_DEPO_TYP(List list) { l_serTori_DEPO_TYP = list; }
	public void setList_serTori_ALLCT_WH_CD(List list) { l_serTori_ALLCT_WH_CD = list; }
	public void setList_serTori_DEPO_WH_CD(List list) { l_serTori_DEPO_WH_CD = list; }
	public void setList_serTori_LOC_CD(List list) { l_serTori_LOC_CD = list; }
	public void setList_serTori_SHIP_DATE(List list) { l_serTori_SHIP_DATE = list; }
	public void setList_serTori_SHIP_QTY(List list) { l_serTori_SHIP_QTY = list; }
	public void setList_serTori_UNIT_CD(List list) { l_serTori_UNIT_CD = list; }
	public void setList_serTori_SHIP_UNIT_PRICE(List list) { l_serTori_SHIP_UNIT_PRICE = list; }
	public void setList_serTori_SHIP_ODR_AMOUNT(List list) { l_serTori_SHIP_ODR_AMOUNT = list; }
	public void setList_serTori_SHIP_ODR_AMOUNT_EXCH_RATES(List list) { l_serTori_SHIP_ODR_AMOUNT_EXCH_RATES = list; }
	public void setList_serTori_CURRNCY_CD(List list) { l_serTori_CURRNCY_CD = list; }
	public void setList_serTori_DIRECT_DLV_FLG(List list) { l_serTori_DIRECT_DLV_FLG = list; }
	public void setList_serTori_SHIP_INFO_IF_CTRL_NO(List list) { l_serTori_SHIP_INFO_IF_CTRL_NO = list; }
	public void setList_serTori_INSPC_ACPT_INFO_IF_CTRL_NO(List list) { l_serTori_INSPC_ACPT_INFO_IF_CTRL_NO = list; }
	public void setList_serTori_DLV_KEY_NO(List list) { l_serTori_DLV_KEY_NO = list; }
	public void setList_serTori_DEL_FLG(List list) { l_serTori_DEL_FLG = list; }
	public void setList_serTori_CUR_NAME(List list) { l_serTori_CUR_NAME = list; }
	public void setList_serTori_EXCH_TYP(List list) { l_serTori_EXCH_TYP = list; }
	public void setList_serTori_MODIFY_COUNT(List list) { l_serTori_MODIFY_COUNT = list; }
	public void setList_serTori_RETURN_QTY(List list) { l_serTori_RETURN_QTY = list; }
	public void setList_serTori_TOTAL_SHIP_QTY(List list) { l_serTori_TOTAL_SHIP_QTY = list; }
	public void setList_serTori_STATUS(List list) { l_serTori_STATUS = list; }
	public void setList_serTori_INSPC_ACPT_TYP(List list) { l_serTori_INSPC_ACPT_TYP = list; }
	public void setList_serToriSALES_DEPT_CD(List list) { l_serToriSALES_DEPT_CD = list; }
	public void setList_serToriSALES_DATE(List list) { l_serToriSALES_DATE = list; }
	public void setList_h_MRP_ODR_TYP(List list) { l_h_MRP_ODR_TYP = list; }
	public void setList_h_LOT_CTRL_FLG(List list) { l_h_LOT_CTRL_FLG = list; }
	public void setList_serTodrMODIFY_COUNT(List list) { l_serTodrMODIFY_COUNT = list; }
	public void setList_serTori_IN_SLIPCD(List list) { l_serTori_IN_SLIPCD = list; }
	public void setList_creTship_SHIP_SEQ_NO(List list) { l_creTship_SHIP_SEQ_NO = list; }
	public void setList_creTship_SHIP_ODR_NO(List list) { l_creTship_SHIP_ODR_NO = list; }
	public void setList_creTship_SLIP_CD(List list) { l_creTship_SLIP_CD = list; }
	public void setList_creTship_ODR_NO(List list) { l_creTship_ODR_NO = list; }
	public void setList_creTship_PART_DLV_SEQ_NO(List list) { l_creTship_PART_DLV_SEQ_NO = list; }
	public void setList_creTship_ORGNAL_SLIP_CD(List list) { l_creTship_ORGNAL_SLIP_CD = list; }
	public void setList_creTship_SLIP_TRN_CD(List list) { l_creTship_SLIP_TRN_CD = list; }
	public void setList_creTship_ITEM_CD(List list) { l_creTship_ITEM_CD = list; }
	public void setList_creTship_JOB_ODR_CD(List list) { l_creTship_JOB_ODR_CD = list; }
	public void setList_creTship_CUST_ITEM_CD(List list) { l_creTship_CUST_ITEM_CD = list; }
	public void setList_creTship_CUST_ODR_NO(List list) { l_creTship_CUST_ODR_NO = list; }
	public void setList_creTship_CUST_CD(List list) { l_creTship_CUST_CD = list; }
	public void setList_creTship_CUST_NAME(List list) { l_creTship_CUST_NAME = list; }
	public void setList_creTship_CUST_CHRG_PSN_CD(List list) { l_creTship_CUST_CHRG_PSN_CD = list; }
	public void setList_creTship_SHIP_ODR_ISS_PSN_CD(List list) { l_creTship_SHIP_ODR_ISS_PSN_CD = list; }
	public void setList_creTship_DLV_LOC_CD(List list) { l_creTship_DLV_LOC_CD = list; }
	public void setList_creTship_DEPO_TYP(List list) { l_creTship_DEPO_TYP = list; }
	public void setList_creTship_ALLCT_WH_CD(List list) { l_creTship_ALLCT_WH_CD = list; }
	public void setList_creTship_DEPO_WH_CD(List list) { l_creTship_DEPO_WH_CD = list; }
	public void setList_creTship_LOC_CD(List list) { l_creTship_LOC_CD = list; }
	public void setList_creTship_SHIP_DATE(List list) { l_creTship_SHIP_DATE = list; }
	public void setList_creTship_SHIP_QTY(List list) { l_creTship_SHIP_QTY = list; }
	public void setList_creTship_UNIT_CD(List list) { l_creTship_UNIT_CD = list; }
	public void setList_creTship_SHIP_UNIT_PRICE(List list) { l_creTship_SHIP_UNIT_PRICE = list; }
	public void setList_creTship_SHIP_ODR_AMOUNT(List list) { l_creTship_SHIP_ODR_AMOUNT = list; }
	public void setList_creTship_SHIP_ODR_AMOUNT_EXCH_RATES(List list) { l_creTship_SHIP_ODR_AMOUNT_EXCH_RATES = list; }
	public void setList_creTship_CURRNCY_CD(List list) { l_creTship_CURRNCY_CD = list; }
	public void setList_creTship_DIRECT_DLV_FLG(List list) { l_creTship_DIRECT_DLV_FLG = list; }
	public void setList_creTship_DLV_KEY_NO(List list) { l_creTship_DLV_KEY_NO = list; }
	public void setList_creTship_REMARKS(List list) { l_creTship_REMARKS = list; }
	public void setList_creTship_DEL_FLG(List list) { l_creTship_DEL_FLG = list; }
	public void setList_updTship_SHIP_SEQ_NO(List list) { l_updTship_SHIP_SEQ_NO = list; }
	public void setList_serInsert_SHIP_ODR_NO(List list) { l_serInsert_SHIP_ODR_NO = list; }
	public void setList_serInsert_ODR_NO(List list) { l_serInsert_ODR_NO = list; }
	public void setList_serInsert_PART_DLV_SEQ_NO(List list) { l_serInsert_PART_DLV_SEQ_NO = list; }
	public void setList_serInsert_SLIP_CD(List list) { l_serInsert_SLIP_CD = list; }
	public void setList_serInsert_ITEM_CD(List list) { l_serInsert_ITEM_CD = list; }
	public void setList_serInsert_JOB_ODR_CD(List list) { l_serInsert_JOB_ODR_CD = list; }
	public void setList_serInsert_CUST_ITEM_CD(List list) { l_serInsert_CUST_ITEM_CD = list; }
	public void setList_serInsert_CUST_ODR_NO(List list) { l_serInsert_CUST_ODR_NO = list; }
	public void setList_serInsert_CUST_CD(List list) { l_serInsert_CUST_CD = list; }
	public void setList_serInsert_CUST_NAME(List list) { l_serInsert_CUST_NAME = list; }
	public void setList_serInsert_CUST_CHRG_PSN_CD(List list) { l_serInsert_CUST_CHRG_PSN_CD = list; }
	public void setList_serInsert_SHIP_ODR_ISS_PSN_CD(List list) { l_serInsert_SHIP_ODR_ISS_PSN_CD = list; }
	public void setList_serInsert_DLV_LOC_CD(List list) { l_serInsert_DLV_LOC_CD = list; }
	public void setList_serInsert_DEPO_TYP(List list) { l_serInsert_DEPO_TYP = list; }
	public void setList_serInsert_DESINATED_SHIP_DATE(List list) { l_serInsert_DESINATED_SHIP_DATE = list; }
	public void setList_serInsert_SHIP_QTY(List list) { l_serInsert_SHIP_QTY = list; }
	public void setList_serInsert_TOTAL_SHIP_QTY(List list) { l_serInsert_TOTAL_SHIP_QTY = list; }
	public void setList_serInsert_UNIT_CD(List list) { l_serInsert_UNIT_CD = list; }
	public void setList_serInsert_UNIT_PRICE(List list) { l_serInsert_UNIT_PRICE = list; }
	public void setList_serInsert_SHIP_ODR_AMOUNT(List list) { l_serInsert_SHIP_ODR_AMOUNT = list; }
	public void setList_serInsert_SHIP_ODR_AMOUNT_EXCH_RATES(List list) { l_serInsert_SHIP_ODR_AMOUNT_EXCH_RATES = list; }
	public void setList_serInsert_CURRNCY_CD(List list) { l_serInsert_CURRNCY_CD = list; }
	public void setList_serInsert_LOC_CD(List list) { l_serInsert_LOC_CD = list; }
	public void setList_serInsert_PKG_UNIT_QTY(List list) { l_serInsert_PKG_UNIT_QTY = list; }
	public void setList_serInsert_REMARKS(List list) { l_serInsert_REMARKS = list; }
	public void setList_serInsert_TRANSPORT_CD(List list) { l_serInsert_TRANSPORT_CD = list; }
	public void setList_serInsert_TRANSPORT_TYP(List list) { l_serInsert_TRANSPORT_TYP = list; }
	public void setList_serInsert_ALLCT_WH_CD(List list) { l_serInsert_ALLCT_WH_CD = list; }
	public void setList_serInsert_TRANSFER_WH_CD(List list) { l_serInsert_TRANSFER_WH_CD = list; }
	public void setList_serInsert_DIRECT_DLV_FLG(List list) { l_serInsert_DIRECT_DLV_FLG = list; }
	public void setList_serInsert_ENTRY_TYP(List list) { l_serInsert_ENTRY_TYP = list; }
	public void setList_serInsert_PRINT_FLG(List list) { l_serInsert_PRINT_FLG = list; }
	public void setList_serInsert_SHP_CMPLT_FLG(List list) { l_serInsert_SHP_CMPLT_FLG = list; }
	public void setList_serInsert_DEPO_TRANSFER_PROC_FLG(List list) { l_serInsert_DEPO_TRANSFER_PROC_FLG = list; }
	public void setList_serInsert_DEL_FLG(List list) { l_serInsert_DEL_FLG = list; }
	public void setList_serInsert_CUR_CD(List list) { l_serInsert_CUR_CD = list; }
	public void setList_serInsert_CUR_NAME(List list) { l_serInsert_CUR_NAME = list; }
	public void setList_serInsert_EXCH_TYP(List list) { l_serInsert_EXCH_TYP = list; }
	public void setList_serInsert_SPCL_PRICE_TYP(List list) { l_serInsert_SPCL_PRICE_TYP = list; }
	public void setList_serInsert_MODIFY_COUNT(List list) { l_serInsert_MODIFY_COUNT = list; }
	public void setList_serInsert_SCDL_DLV_DATE(List list) { l_serInsert_SCDL_DLV_DATE = list; }
	public void setList_serInsert_DLV_KEY_NO(List list) { l_serInsert_DLV_KEY_NO = list; }
	public void setList_h_RETURN_QTY(List list) { l_h_RETURN_QTY = list; }
	public void setList_serInsert_ODR_ACPT_DATE(List list) { l_serInsert_ODR_ACPT_DATE = list; }
	public void setList_h_JOB_ODR_CD(List list) { l_h_JOB_ODR_CD = list; }
	public void setList_selMODIFY_COUNT(List list) { l_selMODIFY_COUNT = list; }
	public void setList_serInsert_IN_SLIPCD(List list) { l_serInsert_IN_SLIPCD = list; }
	public void setList_upTshipOdr_DEPO_TRANSFER_PROC_FLG(List list) { l_upTshipOdr_DEPO_TRANSFER_PROC_FLG = list; }
	public void setList_upTshipOdr_IN_SLIPCD(List list) { l_upTshipOdr_IN_SLIPCD = list; }
	public void setList_chkisWhCd_WH_CD(List list) { l_chkisWhCd_WH_CD = list; }
	public void setList_chkisWhCd_WH_TYP(List list) { l_chkisWhCd_WH_TYP = list; }
	public void setList_chkisinWhCd_WH_NAME(List list) { l_chkisinWhCd_WH_NAME = list; }
	public void setList_chkisWhCd_IN_WHCD(List list) { l_chkisWhCd_IN_WHCD = list; }
	public void setList_chkisWhCd_IN_WHTYP(List list) { l_chkisWhCd_IN_WHTYP = list; }
	public void setList_creTsales_SHIP_ODR_NO(List list) { l_creTsales_SHIP_ODR_NO = list; }
	public void setList_creTsales_SLIP_CD(List list) { l_creTsales_SLIP_CD = list; }
	public void setList_creTsales_SALES_TYP(List list) { l_creTsales_SALES_TYP = list; }
	public void setList_creTsales_CUST_CD(List list) { l_creTsales_CUST_CD = list; }
	public void setList_creTsales_ITEM_CD(List list) { l_creTsales_ITEM_CD = list; }
	public void setList_creTsales_ITEM_NAME(List list) { l_creTsales_ITEM_NAME = list; }
	public void setList_creTsales_CUST_ODR_NO(List list) { l_creTsales_CUST_ODR_NO = list; }
	public void setList_creTsales_SALES_DATE(List list) { l_creTsales_SALES_DATE = list; }
	public void setList_creTsales_SALES_DEPT_CD(List list) { l_creTsales_SALES_DEPT_CD = list; }
	public void setList_creTsales_CUST_CHRG_PSN_CD(List list) { l_creTsales_CUST_CHRG_PSN_CD = list; }
	public void setList_creTsales_ODR_ACPT_PSN_CD(List list) { l_creTsales_ODR_ACPT_PSN_CD = list; }
	public void setList_creTsales_SALES_QTY(List list) { l_creTsales_SALES_QTY = list; }
	public void setList_creTsales_SALES_UNIT_PRICE(List list) { l_creTsales_SALES_UNIT_PRICE = list; }
	public void setList_creTsales_UNIT_CD(List list) { l_creTsales_UNIT_CD = list; }
	public void setList_creTsales_SALES_AMOUNT(List list) { l_creTsales_SALES_AMOUNT = list; }
	public void setList_creTsales_SALES_AMOUNT_EXCH_RATES(List list) { l_creTsales_SALES_AMOUNT_EXCH_RATES = list; }
	public void setList_creTsales_INSPC_ACPT_DATE(List list) { l_creTsales_INSPC_ACPT_DATE = list; }
	public void setList_creTsales_INSPC_ACPT_QTY(List list) { l_creTsales_INSPC_ACPT_QTY = list; }
	public void setList_creTsales_EXTERNAL_TAX_SALES_AMOUNT(List list) { l_creTsales_EXTERNAL_TAX_SALES_AMOUNT = list; }
	public void setList_creTsales_INTERNAL_TAX_SALES_AMOUNT(List list) { l_creTsales_INTERNAL_TAX_SALES_AMOUNT = list; }
	public void setList_creTsales_TAXFREE_SALES_AMOUNT(List list) { l_creTsales_TAXFREE_SALES_AMOUNT = list; }
	public void setList_creTsales_TAX_CREDIT_SALES_AMOUNT(List list) { l_creTsales_TAX_CREDIT_SALES_AMOUNT = list; }
	public void setList_creTsales_EXTERNAL_TAX_AMOUNT(List list) { l_creTsales_EXTERNAL_TAX_AMOUNT = list; }
	public void setList_creTsales_INTERNAL_TAX_AMOUNT(List list) { l_creTsales_INTERNAL_TAX_AMOUNT = list; }
	public void setList_creTsales_TAX_AMOUNT_1(List list) { l_creTsales_TAX_AMOUNT_1 = list; }
	public void setList_creTsales_TAX_AMOUNT_2(List list) { l_creTsales_TAX_AMOUNT_2 = list; }
	public void setList_creTsales_TAX_AMOUNT_3(List list) { l_creTsales_TAX_AMOUNT_3 = list; }
	public void setList_creTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT(List list) { l_creTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT = list; }
	public void setList_creTsales_ORG_SLIP_CD(List list) { l_creTsales_ORG_SLIP_CD = list; }
	public void setList_creTsales_CURRNCY_CD(List list) { l_creTsales_CURRNCY_CD = list; }
	public void setList_creTsales_SPCL_PRICE_CO(List list) { l_creTsales_SPCL_PRICE_CO = list; }
	public void setList_creTsales_REMARKS(List list) { l_creTsales_REMARKS = list; }
	public void setList_creTsales_DEL_FLG(List list) { l_creTsales_DEL_FLG = list; }
	public void setList_creTsales_INSPC_ACPT_TYP(List list) { l_creTsales_INSPC_ACPT_TYP = list; }
	public void setList_creTsales_STATUS(List list) { l_creTsales_STATUS = list; }
	public void setList_creTsales_APPR_FLG(List list) { l_creTsales_APPR_FLG = list; }
	public void setList_creTsales_APPR_ID(List list) { l_creTsales_APPR_ID = list; }
	public void setList_creTsales_APPR_DATE(List list) { l_creTsales_APPR_DATE = list; }
	public void setList_creTsales_EXCH_RATE(List list) { l_creTsales_EXCH_RATE = list; }
	public void setList_serTsales_SALES_SEQ_NO(List list) { l_serTsales_SALES_SEQ_NO = list; }
	public void setList_serTsales_SLIP_CD(List list) { l_serTsales_SLIP_CD = list; }
	public void setList_serTsales_SALES_TYP(List list) { l_serTsales_SALES_TYP = list; }
	public void setList_serTsales_CUST_CD(List list) { l_serTsales_CUST_CD = list; }
	public void setList_serTsales_ITEM_CD(List list) { l_serTsales_ITEM_CD = list; }
	public void setList_serTsales_ITEM_NAME(List list) { l_serTsales_ITEM_NAME = list; }
	public void setList_serTsales_CUST_ODR_NO(List list) { l_serTsales_CUST_ODR_NO = list; }
	public void setList_serTsales_SALES_DATE(List list) { l_serTsales_SALES_DATE = list; }
	public void setList_serTsales_SALES_DEPT_CD(List list) { l_serTsales_SALES_DEPT_CD = list; }
	public void setList_serTsales_CUST_CHRG_PSN_CD(List list) { l_serTsales_CUST_CHRG_PSN_CD = list; }
	public void setList_serTsales_ODR_ACPT_PSN_CD(List list) { l_serTsales_ODR_ACPT_PSN_CD = list; }
	public void setList_serTsales_SALES_QTY(List list) { l_serTsales_SALES_QTY = list; }
	public void setList_serTsales_SALES_UNIT_PRICE(List list) { l_serTsales_SALES_UNIT_PRICE = list; }
	public void setList_serTsales_UNIT_CD(List list) { l_serTsales_UNIT_CD = list; }
	public void setList_serTsales_SALES_AMOUNT(List list) { l_serTsales_SALES_AMOUNT = list; }
	public void setList_serTsales_SALES_AMOUNT_EXCH_RATES(List list) { l_serTsales_SALES_AMOUNT_EXCH_RATES = list; }
	public void setList_serTsales_EXTERNAL_TAX_SALES_AMOUNT(List list) { l_serTsales_EXTERNAL_TAX_SALES_AMOUNT = list; }
	public void setList_serTsales_INTERNAL_TAX_SALES_AMOUNT(List list) { l_serTsales_INTERNAL_TAX_SALES_AMOUNT = list; }
	public void setList_serTsales_TAXFREE_SALES_AMOUNT(List list) { l_serTsales_TAXFREE_SALES_AMOUNT = list; }
	public void setList_serTsales_TAX_CREDIT_SALES_AMOUNT(List list) { l_serTsales_TAX_CREDIT_SALES_AMOUNT = list; }
	public void setList_serTsales_EXTERNAL_TAX_AMOUNT(List list) { l_serTsales_EXTERNAL_TAX_AMOUNT = list; }
	public void setList_serTsales_INTERNAL_TAX_AMOUNT(List list) { l_serTsales_INTERNAL_TAX_AMOUNT = list; }
	public void setList_serTsales_TAX_AMOUNT_1(List list) { l_serTsales_TAX_AMOUNT_1 = list; }
	public void setList_serTsales_TAX_AMOUNT_2(List list) { l_serTsales_TAX_AMOUNT_2 = list; }
	public void setList_serTsales_TAX_AMOUNT_3(List list) { l_serTsales_TAX_AMOUNT_3 = list; }
	public void setList_serTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT(List list) { l_serTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT = list; }
	public void setList_serTsales_ORG_SLIP_CD(List list) { l_serTsales_ORG_SLIP_CD = list; }
	public void setList_serTsales_CURRNCY_CD(List list) { l_serTsales_CURRNCY_CD = list; }
	public void setList_serTsales_SPCL_PRICE_CO(List list) { l_serTsales_SPCL_PRICE_CO = list; }
	public void setList_serTsales_REMARKS(List list) { l_serTsales_REMARKS = list; }
	public void setList_serTsales_DEL_FLG(List list) { l_serTsales_DEL_FLG = list; }
	public void setList_serTsales_INSPC_ACPT_TYP(List list) { l_serTsales_INSPC_ACPT_TYP = list; }
	public void setList_serTsales_STATUS(List list) { l_serTsales_STATUS = list; }
	public void setList_serTsales_PRD_ODR_PLACE_CD(List list) { l_serTsales_PRD_ODR_PLACE_CD = list; }
	public void setList_serTsales_EXCH_RATE(List list) { l_serTsales_EXCH_RATE = list; }
	public void setList_serTsales_IN_SLIPCD(List list) { l_serTsales_IN_SLIPCD = list; }
	public void setList_updTsales_APPR_FLG(List list) { l_updTsales_APPR_FLG = list; }
	public void setList_updTsales_APPR_ID(List list) { l_updTsales_APPR_ID = list; }
	public void setList_updTsales_APPR_DATE(List list) { l_updTsales_APPR_DATE = list; }
	public void setList_updTsales_SALES_SEQ_NO(List list) { l_updTsales_SALES_SEQ_NO = list; }
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
	public void setList_mItemSpec_CUST_CD(List list) { l_mItemSpec_CUST_CD = list; }
	public void setList_mItemSpec_CUST_ITEM_CD(List list) { l_mItemSpec_CUST_ITEM_CD = list; }
	public void setList_mItemSpec_COMPANY_CD(List list) { l_mItemSpec_COMPANY_CD = list; }
	public void setList_mItemSpec_SALES_DEPT_CD(List list) { l_mItemSpec_SALES_DEPT_CD = list; }
	public void setList_mItemSpec_CUST_ITEM_NAME(List list) { l_mItemSpec_CUST_ITEM_NAME = list; }
	public void setList_mItemSpec_IN_CUST_CD(List list) { l_mItemSpec_IN_CUST_CD = list; }
	public void setList_mItemSpec_IN_CUST_ITEM_CD(List list) { l_mItemSpec_IN_CUST_ITEM_CD = list; }
	public void setList_mItemSpec_IN_COMPANY_CD(List list) { l_mItemSpec_IN_COMPANY_CD = list; }
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
	public void setList_tOdr_DLV_KEY_NO(List list) { l_tOdr_DLV_KEY_NO = list; }
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
	public void setList_tOdr_DEL_FLG(List list) { l_tOdr_DEL_FLG = list; }
	public void setList_tOdr_SHIP_CNT(List list) { l_tOdr_SHIP_CNT = list; }
	public void setList_tOdr_UNIT_CD_ORG(List list) { l_tOdr_UNIT_CD_ORG = list; }
	public void setList_tOdrCtl_CUST_ITEM_CD(List list) { l_tOdrCtl_CUST_ITEM_CD = list; }
	public void setList_tOdr_COCK_TYP(List list) { l_tOdr_COCK_TYP = list; }
	public void setList_tOdr_PUCH_ODR_QTY_TOTAL(List list) { l_tOdr_PUCH_ODR_QTY_TOTAL = list; }
	public void setList_tOdr_BUYER_ORG_CD(List list) { l_tOdr_BUYER_ORG_CD = list; }
	public void setList_tOdr_BUYER_NAME(List list) { l_tOdr_BUYER_NAME = list; }
	public void setList_tOdr_IN_ODRNO(List list) { l_tOdr_IN_ODRNO = list; }
	public void setList_creTodrODR_NO(List list) { l_creTodrODR_NO = list; }
	public void setList_creTodrODR_TYP(List list) { l_creTodrODR_TYP = list; }
	public void setList_creTodrODR_CTL_NO(List list) { l_creTodrODR_CTL_NO = list; }
	public void setList_creTodrCUST_ODR_NO(List list) { l_creTodrCUST_ODR_NO = list; }
	public void setList_creTodrCUST_CHRG_ORG_CD(List list) { l_creTodrCUST_CHRG_ORG_CD = list; }
	public void setList_creTodrCUST_CHRG_PSN_CD(List list) { l_creTodrCUST_CHRG_PSN_CD = list; }
	public void setList_creTodrODR_ACPT_ORG_CD(List list) { l_creTodrODR_ACPT_ORG_CD = list; }
	public void setList_creTodrODR_ACPT_PSN_CD(List list) { l_creTodrODR_ACPT_PSN_CD = list; }
	public void setList_creTodrCURRNCY_CD(List list) { l_creTodrCURRNCY_CD = list; }
	public void setList_creTodrEXCH_TYP(List list) { l_creTodrEXCH_TYP = list; }
	public void setList_creTodrDLV_LOC_CD(List list) { l_creTodrDLV_LOC_CD = list; }
	public void setList_creTodrDLV_LOC_NAME(List list) { l_creTodrDLV_LOC_NAME = list; }
	public void setList_creTodrDLV_LOC_NAME_KANJI(List list) { l_creTodrDLV_LOC_NAME_KANJI = list; }
	public void setList_creTodrPRD_ODR_PLACE_CD(List list) { l_creTodrPRD_ODR_PLACE_CD = list; }
	public void setList_creTodrODR_UNIT_PRICE(List list) { l_creTodrODR_UNIT_PRICE = list; }
	public void setList_creTodrPART_DLV_COUNT(List list) { l_creTodrPART_DLV_COUNT = list; }
	public void setList_creTodrDEPO_TYP(List list) { l_creTodrDEPO_TYP = list; }
	public void setList_creTodrDESINATED_DLV_DATE(List list) { l_creTodrDESINATED_DLV_DATE = list; }
	public void setList_creTodrODR_QTY(List list) { l_creTodrODR_QTY = list; }
	public void setList_creTodrREMAIN_UNCONFIRM_ODR_QTY(List list) { l_creTodrREMAIN_UNCONFIRM_ODR_QTY = list; }
	public void setList_creTodrCANCELED_UNCONFIRM_ODR_QTY(List list) { l_creTodrCANCELED_UNCONFIRM_ODR_QTY = list; }
	public void setList_creTodrUNIT_CD(List list) { l_creTodrUNIT_CD = list; }
	public void setList_creTodrUNCONFIRM_ODR_BALANCE(List list) { l_creTodrUNCONFIRM_ODR_BALANCE = list; }
	public void setList_creTodrODR_AMOUNT(List list) { l_creTodrODR_AMOUNT = list; }
	public void setList_creTodrODR_AMOUNT_EXCH_RATES(List list) { l_creTodrODR_AMOUNT_EXCH_RATES = list; }
	public void setList_creTodrTOTAL_SHIP_QTY(List list) { l_creTodrTOTAL_SHIP_QTY = list; }
	public void setList_creTodrSHIP_AMOUNT(List list) { l_creTodrSHIP_AMOUNT = list; }
	public void setList_creTodrSHIP_AMOUNT_EXCH_RATES(List list) { l_creTodrSHIP_AMOUNT_EXCH_RATES = list; }
	public void setList_creTodrODR_CMPLT_FLG(List list) { l_creTodrODR_CMPLT_FLG = list; }
	public void setList_creTodrODR_CMPLT_DATE(List list) { l_creTodrODR_CMPLT_DATE = list; }
	public void setList_creTodrREMARKS(List list) { l_creTodrREMARKS = list; }
	public void setList_creTodrODR_ACPT_DATE(List list) { l_creTodrODR_ACPT_DATE = list; }
	public void setList_creTodrSHIP_PLAN_REMAIN_QTY(List list) { l_creTodrSHIP_PLAN_REMAIN_QTY = list; }
	public void setList_creTodrSHIP_PLAN_CMPLT_FLG(List list) { l_creTodrSHIP_PLAN_CMPLT_FLG = list; }
	public void setList_creTodrUNCONFIRMED_ODR_EFF_OVR_FLG(List list) { l_creTodrUNCONFIRMED_ODR_EFF_OVR_FLG = list; }
	public void setList_creTodrPARTIAL_SHIP_INST_FLG(List list) { l_creTodrPARTIAL_SHIP_INST_FLG = list; }
	public void setList_creTodrENTRY_TYP(List list) { l_creTodrENTRY_TYP = list; }
	public void setList_creTodrDEL_FLG(List list) { l_creTodrDEL_FLG = list; }
	public void setList_upTodr_TOTAL_SHIP_QTY(List list) { l_upTodr_TOTAL_SHIP_QTY = list; }
	public void setList_upTodr_SHIP_AMOUNT(List list) { l_upTodr_SHIP_AMOUNT = list; }
	public void setList_upTodr_SHIP_AMOUNT_EXCH_RATES(List list) { l_upTodr_SHIP_AMOUNT_EXCH_RATES = list; }
	public void setList_upTodr_ODR_CMPLT_FLG(List list) { l_upTodr_ODR_CMPLT_FLG = list; }
	public void setList_upTodr_ODR_CMPLT_DATE(List list) { l_upTodr_ODR_CMPLT_DATE = list; }
	public void setList_upTodr_IN_ODRNO(List list) { l_upTodr_IN_ODRNO = list; }
	public void setList_creTrcvIssue_RCV_ISSUE_CTRL_CD(List list) { l_creTrcvIssue_RCV_ISSUE_CTRL_CD = list; }
	public void setList_creTrcvIssue_RCV_ISSUE_TYP(List list) { l_creTrcvIssue_RCV_ISSUE_TYP = list; }
	public void setList_creTrcvIssue_ITEM_CD(List list) { l_creTrcvIssue_ITEM_CD = list; }
	public void setList_creTrcvIssue_JOB_ODR_CD(List list) { l_creTrcvIssue_JOB_ODR_CD = list; }
	public void setList_creTrcvIssue_PLANT_CD(List list) { l_creTrcvIssue_PLANT_CD = list; }
	public void setList_creTrcvIssue_WH_CD(List list) { l_creTrcvIssue_WH_CD = list; }
	public void setList_creTrcvIssue_RCV_ISSUE_BEFORE_QTY(List list) { l_creTrcvIssue_RCV_ISSUE_BEFORE_QTY = list; }
	public void setList_creTrcvIssue_RCV_ISSUE_QTY(List list) { l_creTrcvIssue_RCV_ISSUE_QTY = list; }
	public void setList_creTrcvIssue_RCV_ISSUE_AFTER_QTY(List list) { l_creTrcvIssue_RCV_ISSUE_AFTER_QTY = list; }
	public void setList_creTrcvIssue_RCV_ISSUE_AMOUNT(List list) { l_creTrcvIssue_RCV_ISSUE_AMOUNT = list; }
	public void setList_creTrcvIssue_RCV_ISSUE_DATE(List list) { l_creTrcvIssue_RCV_ISSUE_DATE = list; }
	public void setList_creTrcvIssue_RCV_ISSUE_GNR_TYP(List list) { l_creTrcvIssue_RCV_ISSUE_GNR_TYP = list; }
	public void setList_creTrcvIssue_STOCK_UPD_TYP(List list) { l_creTrcvIssue_STOCK_UPD_TYP = list; }
	public void setList_creTrcvIssue_RCV_ISSUE_CMPLT_FLG(List list) { l_creTrcvIssue_RCV_ISSUE_CMPLT_FLG = list; }
	public void setList_creTrcvIssue_RCV_ISSUE_COMMENT(List list) { l_creTrcvIssue_RCV_ISSUE_COMMENT = list; }
	public void setList_creTrcvIssue_LOT_NO(List list) { l_creTrcvIssue_LOT_NO = list; }
	public void setList_creTrcvIssue_SHIP_ODR_NO(List list) { l_creTrcvIssue_SHIP_ODR_NO = list; }
	public void setList_upTitemStock_STOCK_ON_HAND_QTY(List list) { l_upTitemStock_STOCK_ON_HAND_QTY = list; }
	public void setList_upTitemStock_IN_ITEMCD(List list) { l_upTitemStock_IN_ITEMCD = list; }
	public void setList_upTitemStock_IN_WHCD(List list) { l_upTitemStock_IN_WHCD = list; }
	public void setList_serTitemStock_ITEM_CD(List list) { l_serTitemStock_ITEM_CD = list; }
	public void setList_serTitemStock_WH_CD(List list) { l_serTitemStock_WH_CD = list; }
	public void setList_serTitemStock_PLANT_CD(List list) { l_serTitemStock_PLANT_CD = list; }
	public void setList_serTitemStock_STOCK_ON_HAND_QTY(List list) { l_serTitemStock_STOCK_ON_HAND_QTY = list; }
	public void setList_serTitemStock_DEFECT_QTY(List list) { l_serTitemStock_DEFECT_QTY = list; }
	public void setList_serTitemStock_PRVS_DAYEND_STOCK_QTY(List list) { l_serTitemStock_PRVS_DAYEND_STOCK_QTY = list; }
	public void setList_serTitemStock_PRVS_MONTHEND_STOCK_QTY(List list) { l_serTitemStock_PRVS_MONTHEND_STOCK_QTY = list; }
	public void setList_serTitemStock_PRVS_TERMEND_STOCK_QTY(List list) { l_serTitemStock_PRVS_TERMEND_STOCK_QTY = list; }
	public void setList_serTitemStock_IN_ITEMCD(List list) { l_serTitemStock_IN_ITEMCD = list; }
	public void setList_serTitemStock_IN_WHCD(List list) { l_serTitemStock_IN_WHCD = list; }
	public void setList_creTitemStock_WH_CD(List list) { l_creTitemStock_WH_CD = list; }
	public void setList_creTitemStock_ITEM_CD(List list) { l_creTitemStock_ITEM_CD = list; }
	public void setList_creTitemStock_PLANT_CD(List list) { l_creTitemStock_PLANT_CD = list; }
	public void setList_creTitemStock_STOCK_ON_HAND_QTY(List list) { l_creTitemStock_STOCK_ON_HAND_QTY = list; }
	public void setList_mCust_COMPANY_CD(List list) { l_mCust_COMPANY_CD = list; }
	public void setList_mCust_CUST_CD(List list) { l_mCust_CUST_CD = list; }
	public void setList_mCust_CUST_NAME(List list) { l_mCust_CUST_NAME = list; }
	public void setList_mCust_DETAIL_ROUND_TYP(List list) { l_mCust_DETAIL_ROUND_TYP = list; }
	public void setList_mCust_INSPC_ACPT_TYP(List list) { l_mCust_INSPC_ACPT_TYP = list; }
	public void setList_mCust_OWN_ORG_CD(List list) { l_mCust_OWN_ORG_CD = list; }
	public void setList_mCust_EXCH_TYP(List list) { l_mCust_EXCH_TYP = list; }
	public void setList_mCust_CUR_CD(List list) { l_mCust_CUR_CD = list; }
	public void setList_mCust_IN_COMPANYCD(List list) { l_mCust_IN_COMPANYCD = list; }
	public void setList_mCust_IN_CUSTCD(List list) { l_mCust_IN_CUSTCD = list; }
	public void setList_getHomeCur_CUR_CD(List list) { l_getHomeCur_CUR_CD = list; }
	public void setList_getHomeCur_DECIMAL_FIG(List list) { l_getHomeCur_DECIMAL_FIG = list; }
	public void setList_getHomeCur_CTRL_CD(List list) { l_getHomeCur_CTRL_CD = list; }
	public void setList_strCode(List list) { l_strCode = list; }
	public void setList_mUnitCost_UNIT_COST(List list) { l_mUnitCost_UNIT_COST = list; }
	public void setList_mUnitCost_EFF_PHASE_IN_DATE(List list) { l_mUnitCost_EFF_PHASE_IN_DATE = list; }
	public void setList_mUnitCost_IN_COMPANYCD(List list) { l_mUnitCost_IN_COMPANYCD = list; }
	public void setList_mUnitCost_IN_CUSTCD(List list) { l_mUnitCost_IN_CUSTCD = list; }
	public void setList_mUnitCost_IN_ITEMCD(List list) { l_mUnitCost_IN_ITEMCD = list; }
	public void setList_mUnitCost_IN_EFFPHASEINDATE(List list) { l_mUnitCost_IN_EFFPHASEINDATE = list; }
	public void setList_readShipOdr_TOTAL_SHIP_QTY(List list) { l_readShipOdr_TOTAL_SHIP_QTY = list; }
	public void setList_readShipOdr_RETURN_QTY(List list) { l_readShipOdr_RETURN_QTY = list; }
	public void setList_readShipOdr_SHIP_ODR_NO(List list) { l_readShipOdr_SHIP_ODR_NO = list; }
	public void setList_g_CUR_UNIT(List list) { l_g_CUR_UNIT = list; }
	public void setList_DECIMAL_FIG(List list) { l_DECIMAL_FIG = list; }
	public void setList_t_CUR_CD(List list) { l_t_CUR_CD = list; }
	public void setList_strSLIP_CTRL_GRP(List list) { l_strSLIP_CTRL_GRP = list; }
	public void setList_strSTATUS(List list) { l_strSTATUS = list; }
	public void setList_strSLIP_CD(List list) { l_strSLIP_CD = list; }
	public void setList_upTshipOdr_SHP_CMPLT_FLG(List list) { l_upTshipOdr_SHP_CMPLT_FLG = list; }
	public void setList_upTshipOdr_TOTAL_SHIP_QTY(List list) { l_upTshipOdr_TOTAL_SHIP_QTY = list; }
	public void setList_upTshipOdr_SLIP_CD(List list) { l_upTshipOdr_SLIP_CD = list; }
	public void setList_upTshipOdr_ORG_SLIP_CD(List list) { l_upTshipOdr_ORG_SLIP_CD = list; }
	public void setList_upTshipOdr_SHIP_ODR_NO(List list) { l_upTshipOdr_SHIP_ODR_NO = list; }
	public void setList_strTod_OD_NO(List list) { l_strTod_OD_NO = list; }
	public void setList_strTod_TOTAL_ISSUE_QTY(List list) { l_strTod_TOTAL_ISSUE_QTY = list; }
	public void setList_strTod_DM_QTY(List list) { l_strTod_DM_QTY = list; }
	public void setList_strTod_DM_STS_TYP(List list) { l_strTod_DM_STS_TYP = list; }
	public void setList_inTod_ODR_NO(List list) { l_inTod_ODR_NO = list; }
	public void setList_inTod_PART_DLV_SEQ_NO(List list) { l_inTod_PART_DLV_SEQ_NO = list; }
	public void setList_inTod_OD_NO(List list) { l_inTod_OD_NO = list; }
	public void setList_strTaxTAX_KBN(List list) { l_strTaxTAX_KBN = list; }
	public void setList_strTaxOLD_TAX_1(List list) { l_strTaxOLD_TAX_1 = list; }
	public void setList_strTaxOLD_TAX_2(List list) { l_strTaxOLD_TAX_2 = list; }
	public void setList_strTaxOLD_TAX_3(List list) { l_strTaxOLD_TAX_3 = list; }
	public void setList_strTaxNEW_TAX_1(List list) { l_strTaxNEW_TAX_1 = list; }
	public void setList_strTaxNEW_TAX_2(List list) { l_strTaxNEW_TAX_2 = list; }
	public void setList_strTaxNEW_TAX_3(List list) { l_strTaxNEW_TAX_3 = list; }
	public void setList_strTaxSTART_DATE(List list) { l_strTaxSTART_DATE = list; }
	public void setList_strTaxROUND_TYP(List list) { l_strTaxROUND_TYP = list; }
	public void setList_updiffTAX_CD(List list) { l_updiffTAX_CD = list; }
	public void setList_upTshipOdr_RETURN_QTY(List list) { l_upTshipOdr_RETURN_QTY = list; }
	public void setList_chkSLIP_CD(List list) { l_chkSLIP_CD = list; }
	public void setList_mWh_WH_NAME(List list) { l_mWh_WH_NAME = list; }
	public void setList_mWh_PLANT_CD(List list) { l_mWh_PLANT_CD = list; }
	public void setList_mWh_IN_WH_CD(List list) { l_mWh_IN_WH_CD = list; }
	public void setList_mOrg_ORG_NAME(List list) { l_mOrg_ORG_NAME = list; }
	public void setList_mOrg_IN_COMPANYCD(List list) { l_mOrg_IN_COMPANYCD = list; }
	public void setList_mOrg_IN_ORGCD(List list) { l_mOrg_IN_ORGCD = list; }
	public void setList_serTitemStock_JOB_ODR_CD(List list) { l_serTitemStock_JOB_ODR_CD = list; }
	public void setList_serTitemStock_IN_JOBODRCD(List list) { l_serTitemStock_IN_JOBODRCD = list; }
	public void setList_creTitemStock_JOB_ODR_CD(List list) { l_creTitemStock_JOB_ODR_CD = list; }
	public void setList_upTitemStock_IN_JOBODRCD(List list) { l_upTitemStock_IN_JOBODRCD = list; }
	public void setList_serTJobOdr_JOB_ODR_CD(List list) { l_serTJobOdr_JOB_ODR_CD = list; }
	public void setList_serTJobOdr_ITEM_CD(List list) { l_serTJobOdr_ITEM_CD = list; }
	public void setList_diffSHIP_QTY(List list) { l_diffSHIP_QTY = list; }
	public void setList_diffSHIP_ODR_AMOUNT(List list) { l_diffSHIP_ODR_AMOUNT = list; }
	public void setList_diffSHIP_ODR_AMOUNT_EXCH_RATE(List list) { l_diffSHIP_ODR_AMOUNT_EXCH_RATE = list; }
	public void setList_diffSHIP_ODR_NO(List list) { l_diffSHIP_ODR_NO = list; }
	public void setList_diffODR_NO(List list) { l_diffODR_NO = list; }
	public void setList_diffPART_DLV_SEQ_NO(List list) { l_diffPART_DLV_SEQ_NO = list; }
	public void setList_diffSLIP_CD(List list) { l_diffSLIP_CD = list; }
	public void setList_diffITEM_CD(List list) { l_diffITEM_CD = list; }
	public void setList_diffJOB_ODR_CD(List list) { l_diffJOB_ODR_CD = list; }
	public void setList_diffCUST_ITEM_CD(List list) { l_diffCUST_ITEM_CD = list; }
	public void setList_diffCUST_ODR_NO(List list) { l_diffCUST_ODR_NO = list; }
	public void setList_diffCUST_CD(List list) { l_diffCUST_CD = list; }
	public void setList_diffCUST_NAME(List list) { l_diffCUST_NAME = list; }
	public void setList_diffCUST_CHRG_PSN_CD(List list) { l_diffCUST_CHRG_PSN_CD = list; }
	public void setList_diffSHIP_ODR_ISS_PSN_CD(List list) { l_diffSHIP_ODR_ISS_PSN_CD = list; }
	public void setList_diffDLV_LOC_CD(List list) { l_diffDLV_LOC_CD = list; }
	public void setList_diffDEPO_TYP(List list) { l_diffDEPO_TYP = list; }
	public void setList_diffDESINATED_SHIP_DATE(List list) { l_diffDESINATED_SHIP_DATE = list; }
	public void setList_diffSCDL_DLV_DATE(List list) { l_diffSCDL_DLV_DATE = list; }
	public void setList_diffTOTAL_SHIP_QTY(List list) { l_diffTOTAL_SHIP_QTY = list; }
	public void setList_diffRETURN_QTY(List list) { l_diffRETURN_QTY = list; }
	public void setList_diffUNIT_CD(List list) { l_diffUNIT_CD = list; }
	public void setList_diffUNIT_PRICE(List list) { l_diffUNIT_PRICE = list; }
	public void setList_diffCURRENCY_CD(List list) { l_diffCURRENCY_CD = list; }
	public void setList_diffLOC_CD(List list) { l_diffLOC_CD = list; }
	public void setList_diffPKG_UNIT_QTY(List list) { l_diffPKG_UNIT_QTY = list; }
	public void setList_diffREMARKS(List list) { l_diffREMARKS = list; }
	public void setList_diffDLV_KEY_NO(List list) { l_diffDLV_KEY_NO = list; }
	public void setList_diffPART_DLV_COUNT(List list) { l_diffPART_DLV_COUNT = list; }
	public void setList_diffTRANSPORT_CD(List list) { l_diffTRANSPORT_CD = list; }
	public void setList_diffTRANSPORT_TYP(List list) { l_diffTRANSPORT_TYP = list; }
	public void setList_diffALLCT_WH_CD(List list) { l_diffALLCT_WH_CD = list; }
	public void setList_diffTRANSFER_WH_CD(List list) { l_diffTRANSFER_WH_CD = list; }
	public void setList_diffDIRECT_DLV_FLG(List list) { l_diffDIRECT_DLV_FLG = list; }
	public void setList_diffENTRY_TYP(List list) { l_diffENTRY_TYP = list; }
	public void setList_diffPRINT_FLG(List list) { l_diffPRINT_FLG = list; }
	public void setList_diffSHIP_CMPLT_FLG(List list) { l_diffSHIP_CMPLT_FLG = list; }
	public void setList_diffDEPO_TRANSFER_PROC_FLG(List list) { l_diffDEPO_TRANSFER_PROC_FLG = list; }
	public void setList_diffDEL_FLG(List list) { l_diffDEL_FLG = list; }
	public void setList_diffuptOdr_SHIP_CNT(List list) { l_diffuptOdr_SHIP_CNT = list; }
	public void setList_diffuptOdr_PART_DLV_COUNT(List list) { l_diffuptOdr_PART_DLV_COUNT = list; }
	public void setList_diffuptOdr_IN_ODRNO(List list) { l_diffuptOdr_IN_ODRNO = list; }
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
	public void setList_up_tShipSlip_SLIP_CD(List list) { l_up_tShipSlip_SLIP_CD = list; }
	public void setList_updiffSHIP_ODR_QTY(List list) { l_updiffSHIP_ODR_QTY = list; }
	public void setList_updiffSHIP_ODR_AMOUNT(List list) { l_updiffSHIP_ODR_AMOUNT = list; }
	public void setList_updiffTAX_AMOUNT(List list) { l_updiffTAX_AMOUNT = list; }
	public void setList_updiffSHIP_ODR_AMOUNT_TAX(List list) { l_updiffSHIP_ODR_AMOUNT_TAX = list; }
	public void setList_updiffEXTERNAL_TAX_SALES_AMOUNT(List list) { l_updiffEXTERNAL_TAX_SALES_AMOUNT = list; }
	public void setList_updiffINTERNAL_TAX_SALES_AMOUNT(List list) { l_updiffINTERNAL_TAX_SALES_AMOUNT = list; }
	public void setList_updiffTAXFREE_SALES_AMOUNT(List list) { l_updiffTAXFREE_SALES_AMOUNT = list; }
	public void setList_updiffTAX_CREDIT_SALES_AMOUNT(List list) { l_updiffTAX_CREDIT_SALES_AMOUNT = list; }
	public void setList_updiffEXTERNAL_TAX_AMOUNT(List list) { l_updiffEXTERNAL_TAX_AMOUNT = list; }
	public void setList_updiffINTERNAL_TAX_AMOUNT(List list) { l_updiffINTERNAL_TAX_AMOUNT = list; }
	public void setList_updiffTAX_AMOUNT_1(List list) { l_updiffTAX_AMOUNT_1 = list; }
	public void setList_updiffTAX_AMOUNT_2(List list) { l_updiffTAX_AMOUNT_2 = list; }
	public void setList_updiffTAX_AMOUNT_3(List list) { l_updiffTAX_AMOUNT_3 = list; }
	public void setList_updiffOWN_CUR_TAXCREDIT_SALES_AMOUNT(List list) { l_updiffOWN_CUR_TAXCREDIT_SALES_AMOUNT = list; }
	public void setList_updiffSLIP_CD(List list) { l_updiffSLIP_CD = list; }
	public void setList_PAST_RESULT_ENTRY_TYP(List list) { l_PAST_RESULT_ENTRY_TYP = list; }
	public void setList_PROC_EXEC_DATE(List list) { l_PROC_EXEC_DATE = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_mCustBase_TRANSPORT_LT(List list) { l_mCustBase_TRANSPORT_LT = list; }
	public void setList_mCustBase_IN_COMPANYCD(List list) { l_mCustBase_IN_COMPANYCD = list; }
	public void setList_mCustBase_IN_CUSTCD(List list) { l_mCustBase_IN_CUSTCD = list; }
	public void setList_mCustBase_IN_DLVLOCCD(List list) { l_mCustBase_IN_DLVLOCCD = list; }
	public void setList_strSYUKA_LT(List list) { l_strSYUKA_LT = list; }
	public void setList_strTaxIN_COMPANYCD(List list) { l_strTaxIN_COMPANYCD = list; }
	public void setList_strTaxIN_CUSTCD(List list) { l_strTaxIN_CUSTCD = list; }
	public void setList_g_CUST_ITEM_CD(List list) { l_g_CUST_ITEM_CD = list; }
	public void setList_strT_ODR_TAX(List list) { l_strT_ODR_TAX = list; }
	public void setList_g_SLIP_CD(List list) { l_g_SLIP_CD = list; }
	public void setList_getTship_SHIP_SEQ_NO(List list) { l_getTship_SHIP_SEQ_NO = list; }
	public void setList_chkLOT_NO(List list) { l_chkLOT_NO = list; }
	public void setList_chkITEM_CD(List list) { l_chkITEM_CD = list; }
	public void setList_getQtySTOCK_ON_HAND_QTY(List list) { l_getQtySTOCK_ON_HAND_QTY = list; }
	public void setList_getQtyALCD_QTY(List list) { l_getQtyALCD_QTY = list; }
	public void setList_getQtyITEM_CD(List list) { l_getQtyITEM_CD = list; }
	public void setList_getQtyWH_CD(List list) { l_getQtyWH_CD = list; }
	public void setList_getQtyLOT_NO(List list) { l_getQtyLOT_NO = list; }
	public void setList_readTlotStock_LOT_NO(List list) { l_readTlotStock_LOT_NO = list; }
	public void setList_readTlotStock_STOCK_ON_HAND_QTY(List list) { l_readTlotStock_STOCK_ON_HAND_QTY = list; }
	public void setList_readTlotStock_ALCD_QTY(List list) { l_readTlotStock_ALCD_QTY = list; }
	public void setList_readTlotStock_IN_ITEM_CD(List list) { l_readTlotStock_IN_ITEM_CD = list; }
	public void setList_readTlotStock_IN_WH_CD(List list) { l_readTlotStock_IN_WH_CD = list; }
	public void setList_readTlotStock_IN_LOT_NO(List list) { l_readTlotStock_IN_LOT_NO = list; }
	public void setList_upTlotStockSTOCK_ON_HAND_QTY(List list) { l_upTlotStockSTOCK_ON_HAND_QTY = list; }
	public void setList_upTlotStockIN_ITEM_CD(List list) { l_upTlotStockIN_ITEM_CD = list; }
	public void setList_upTlotStockIN_WH_CD(List list) { l_upTlotStockIN_WH_CD = list; }
	public void setList_upTlotStockIN_LOT_NO(List list) { l_upTlotStockIN_LOT_NO = list; }
	public void setList_serLotSTOCK_ON_HAND_QTY(List list) { l_serLotSTOCK_ON_HAND_QTY = list; }
	public void setList_serLotALCD_QTY(List list) { l_serLotALCD_QTY = list; }
	public void setList_serLotIN_ITEM_CD(List list) { l_serLotIN_ITEM_CD = list; }
	public void setList_serLotIN_WH_CD(List list) { l_serLotIN_WH_CD = list; }
	public void setList_serLotIN_LOT_NO(List list) { l_serLotIN_LOT_NO = list; }
	public void setList_insertLotStock_ITEM_CD(List list) { l_insertLotStock_ITEM_CD = list; }
	public void setList_insertLotStock_WH_CD(List list) { l_insertLotStock_WH_CD = list; }
	public void setList_insertLotStock_LOT_CD(List list) { l_insertLotStock_LOT_CD = list; }
	public void setList_insertLotStock_PLANT_CD(List list) { l_insertLotStock_PLANT_CD = list; }
	public void setList_insertLotStock_STOCK_ON_HAND_QTY(List list) { l_insertLotStock_STOCK_ON_HAND_QTY = list; }
	public void setList_insertLotStock_DEFECT_QTY(List list) { l_insertLotStock_DEFECT_QTY = list; }
	public void setList_insertLotStock_ALCD_QTY(List list) { l_insertLotStock_ALCD_QTY = list; }
	public void setList_insTshipInst_SHIP_SEQ_NO(List list) { l_insTshipInst_SHIP_SEQ_NO = list; }
	public void setList_insTshipInst_SHIP_ODR_NO(List list) { l_insTshipInst_SHIP_ODR_NO = list; }
	public void setList_insTshipInst_LOT_NO(List list) { l_insTshipInst_LOT_NO = list; }
	public void setList_insTshipInst_ITEM_CD(List list) { l_insTshipInst_ITEM_CD = list; }
	public void setList_insTshipInst_WH_CD(List list) { l_insTshipInst_WH_CD = list; }
	public void setList_insTshipInst_ODR_NO(List list) { l_insTshipInst_ODR_NO = list; }
	public void setList_insTshipInst_SLIP_CD(List list) { l_insTshipInst_SLIP_CD = list; }
	public void setList_insTshipInst_SHIP_QTY(List list) { l_insTshipInst_SHIP_QTY = list; }
	public void setList_insTshipInst_SHIP_DATE(List list) { l_insTshipInst_SHIP_DATE = list; }
	public void setList_delTshipInstIN_SHIP_SEQ_NO(List list) { l_delTshipInstIN_SHIP_SEQ_NO = list; }
	public void setList_delTshipInstIN_LOT_NO(List list) { l_delTshipInstIN_LOT_NO = list; }
	public void setList_tlotTrace_FROM_ITEM_CD(List list) { l_tlotTrace_FROM_ITEM_CD = list; }
	public void setList_tlotTrace_FROM_LOT_NO(List list) { l_tlotTrace_FROM_LOT_NO = list; }
	public void setList_tlotTrace_TO_ITEM_CD(List list) { l_tlotTrace_TO_ITEM_CD = list; }
	public void setList_tlotTrace_TO_LOT_NO(List list) { l_tlotTrace_TO_LOT_NO = list; }
	public void setList_tlotTrace_LOT_TRACE_TYP(List list) { l_tlotTrace_LOT_TRACE_TYP = list; }
	public void setList_tlotTrace_CUST_ODR_NO(List list) { l_tlotTrace_CUST_ODR_NO = list; }
	public void setList_tlotTrace_SLIP_CD(List list) { l_tlotTrace_SLIP_CD = list; }
	public void setList_tlotTrace_ODR_NO(List list) { l_tlotTrace_ODR_NO = list; }
	public void setList_readTshipInst_LOT_NO(List list) { l_readTshipInst_LOT_NO = list; }
	public void setList_readTshipInst_SHIP_QTY(List list) { l_readTshipInst_SHIP_QTY = list; }
	public void setList_readTshipInst_SHIP_ODR_NO(List list) { l_readTshipInst_SHIP_ODR_NO = list; }
	public void setList_readTshipInst_ITEM_CD(List list) { l_readTshipInst_ITEM_CD = list; }
	public void setList_readTshipInst_WH_CD(List list) { l_readTshipInst_WH_CD = list; }
	public void setList_readTshipInst_ODR_NO(List list) { l_readTshipInst_ODR_NO = list; }
	public void setList_readTshipInst_SLIP_CD(List list) { l_readTshipInst_SLIP_CD = list; }
	public void setList_readTshipInst_SHIP_DATE(List list) { l_readTshipInst_SHIP_DATE = list; }
	public void setList_readTshipInst_IN_SHIP_SEQ_NO(List list) { l_readTshipInst_IN_SHIP_SEQ_NO = list; }
	public void setList_readTshipInst_IN_LOT_NO(List list) { l_readTshipInst_IN_LOT_NO = list; }
	public void setList_readT_Ship_Inst_Lot_NO(List list) { l_readT_Ship_Inst_Lot_NO = list; }
	public void setList_readT_Ship_Inst_Ship_Seq_NO(List list) { l_readT_Ship_Inst_Ship_Seq_NO = list; }
	public void setList_strOdrCurrncyCd(List list) { l_strOdrCurrncyCd = list; }
	public void setList_strExchTyp(List list) { l_strExchTyp = list; }
	public void setList_g_DATE(List list) { l_g_DATE = list; }
	public void setList_selTShipOdr_MODIFY_COUNT(List list) { l_selTShipOdr_MODIFY_COUNT = list; }
	public void setList_SEL_MODIFY_COUNT(List list) { l_SEL_MODIFY_COUNT = list; }

	public int setL2L_k_MODE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_k_MODE == null) {
			l_k_MODE = new ArrayList();
		} else {
			l_k_MODE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_k_MODE.add(((KU0030010Struct) list.get(i)).getk_MODE());
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
			l_h_RESULT.add(((KU0030010Struct) list.get(i)).geth_RESULT());
		}
		return size;
	}
	public int setL2L_r_SEL_PTN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r_SEL_PTN == null) {
			l_r_SEL_PTN = new ArrayList();
		} else {
			l_r_SEL_PTN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r_SEL_PTN.add(((KU0030010Struct) list.get(i)).getr_SEL_PTN());
		}
		return size;
	}
	public int setL2L_g_DESINATED_SHIP_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_g_DESINATED_SHIP_DATE == null) {
			l_g_DESINATED_SHIP_DATE = new ArrayList();
		} else {
			l_g_DESINATED_SHIP_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_g_DESINATED_SHIP_DATE.add(((KU0030010Struct) list.get(i)).getg_DESINATED_SHIP_DATE());
		}
		return size;
	}
	public int setL2L_g_SHIP_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_g_SHIP_QTY == null) {
			l_g_SHIP_QTY = new ArrayList();
		} else {
			l_g_SHIP_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_g_SHIP_QTY.add(((KU0030010Struct) list.get(i)).getg_SHIP_QTY());
		}
		return size;
	}
	public int setL2L_g_SHIP_QTY2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_g_SHIP_QTY2 == null) {
			l_g_SHIP_QTY2 = new ArrayList();
		} else {
			l_g_SHIP_QTY2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_g_SHIP_QTY2.add(((KU0030010Struct) list.get(i)).getg_SHIP_QTY2());
		}
		return size;
	}
	public int setL2L_g_UNIT_PRICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_g_UNIT_PRICE == null) {
			l_g_UNIT_PRICE = new ArrayList();
		} else {
			l_g_UNIT_PRICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_g_UNIT_PRICE.add(((KU0030010Struct) list.get(i)).getg_UNIT_PRICE());
		}
		return size;
	}
	public int setL2L_g_CURRNCY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_g_CURRNCY == null) {
			l_g_CURRNCY = new ArrayList();
		} else {
			l_g_CURRNCY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_g_CURRNCY.add(((KU0030010Struct) list.get(i)).getg_CURRNCY());
		}
		return size;
	}
	public int setL2L_g_SHIP_ODR_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_g_SHIP_ODR_AMOUNT == null) {
			l_g_SHIP_ODR_AMOUNT = new ArrayList();
		} else {
			l_g_SHIP_ODR_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_g_SHIP_ODR_AMOUNT.add(((KU0030010Struct) list.get(i)).getg_SHIP_ODR_AMOUNT());
		}
		return size;
	}
	public int setL2L_g_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_g_WH_CD == null) {
			l_g_WH_CD = new ArrayList();
		} else {
			l_g_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_g_WH_CD.add(((KU0030010Struct) list.get(i)).getg_WH_CD());
		}
		return size;
	}
	public int setL2L_g_REMARKS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_g_REMARKS == null) {
			l_g_REMARKS = new ArrayList();
		} else {
			l_g_REMARKS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_g_REMARKS.add(((KU0030010Struct) list.get(i)).getg_REMARKS());
		}
		return size;
	}
	public int setL2L_g_CUST_ANAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_g_CUST_ANAME == null) {
			l_g_CUST_ANAME = new ArrayList();
		} else {
			l_g_CUST_ANAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_g_CUST_ANAME.add(((KU0030010Struct) list.get(i)).getg_CUST_ANAME());
		}
		return size;
	}
	public int setL2L_g_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_g_ITEM_CD == null) {
			l_g_ITEM_CD = new ArrayList();
		} else {
			l_g_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_g_ITEM_CD.add(((KU0030010Struct) list.get(i)).getg_ITEM_CD());
		}
		return size;
	}
	public int setL2L_h_AP_SECRTY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_AP_SECRTY_TYP == null) {
			l_h_AP_SECRTY_TYP = new ArrayList();
		} else {
			l_h_AP_SECRTY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_AP_SECRTY_TYP.add(((KU0030010Struct) list.get(i)).geth_AP_SECRTY_TYP());
		}
		return size;
	}
	public int setL2L_h_SHIP_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_SHIP_QTY == null) {
			l_h_SHIP_QTY = new ArrayList();
		} else {
			l_h_SHIP_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_SHIP_QTY.add(((KU0030010Struct) list.get(i)).geth_SHIP_QTY());
		}
		return size;
	}
	public int setL2L_h_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ITEM_CD == null) {
			l_h_ITEM_CD = new ArrayList();
		} else {
			l_h_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ITEM_CD.add(((KU0030010Struct) list.get(i)).geth_ITEM_CD());
		}
		return size;
	}
	public int setL2L_h_GYOMU_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_GYOMU_DATE == null) {
			l_h_GYOMU_DATE = new ArrayList();
		} else {
			l_h_GYOMU_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_GYOMU_DATE.add(((KU0030010Struct) list.get(i)).geth_GYOMU_DATE());
		}
		return size;
	}
	public int setL2L_h_EXCH_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_EXCH_TYP == null) {
			l_h_EXCH_TYP = new ArrayList();
		} else {
			l_h_EXCH_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_EXCH_TYP.add(((KU0030010Struct) list.get(i)).geth_EXCH_TYP());
		}
		return size;
	}
	public int setL2L_h_MODFIY_CNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_MODFIY_CNT == null) {
			l_h_MODFIY_CNT = new ArrayList();
		} else {
			l_h_MODFIY_CNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_MODFIY_CNT.add(((KU0030010Struct) list.get(i)).geth_MODFIY_CNT());
		}
		return size;
	}
	public int setL2L_h_TOTAL_SHIP_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_TOTAL_SHIP_QTY == null) {
			l_h_TOTAL_SHIP_QTY = new ArrayList();
		} else {
			l_h_TOTAL_SHIP_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_TOTAL_SHIP_QTY.add(((KU0030010Struct) list.get(i)).geth_TOTAL_SHIP_QTY());
		}
		return size;
	}
	public int setL2L_m_selRadio(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_m_selRadio == null) {
			l_m_selRadio = new ArrayList();
		} else {
			l_m_selRadio.clear();
		}
		for (int i = 0; i < size; i++) {
			l_m_selRadio.add(((KU0030010Struct) list.get(i)).getm_selRadio());
		}
		return size;
	}
	public int setL2L_r_SEL_PTN1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r_SEL_PTN1 == null) {
			l_r_SEL_PTN1 = new ArrayList();
		} else {
			l_r_SEL_PTN1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r_SEL_PTN1.add(((KU0030010Struct) list.get(i)).getr_SEL_PTN1());
		}
		return size;
	}
	public int setL2L_r_SEL_PTN2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r_SEL_PTN2 == null) {
			l_r_SEL_PTN2 = new ArrayList();
		} else {
			l_r_SEL_PTN2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r_SEL_PTN2.add(((KU0030010Struct) list.get(i)).getr_SEL_PTN2());
		}
		return size;
	}
	public int setL2L_r_SEL_PTN3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r_SEL_PTN3 == null) {
			l_r_SEL_PTN3 = new ArrayList();
		} else {
			l_r_SEL_PTN3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r_SEL_PTN3.add(((KU0030010Struct) list.get(i)).getr_SEL_PTN3());
		}
		return size;
	}
	public int setL2L_h_SELECT_FG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_SELECT_FG == null) {
			l_h_SELECT_FG = new ArrayList();
		} else {
			l_h_SELECT_FG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_SELECT_FG.add(((KU0030010Struct) list.get(i)).geth_SELECT_FG());
		}
		return size;
	}
	public int setL2L_h_UNIT_PRICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_UNIT_PRICE == null) {
			l_h_UNIT_PRICE = new ArrayList();
		} else {
			l_h_UNIT_PRICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_UNIT_PRICE.add(((KU0030010Struct) list.get(i)).geth_UNIT_PRICE());
		}
		return size;
	}
	public int setL2L_g_STOCK_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_g_STOCK_UNIT == null) {
			l_g_STOCK_UNIT = new ArrayList();
		} else {
			l_g_STOCK_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_g_STOCK_UNIT.add(((KU0030010Struct) list.get(i)).getg_STOCK_UNIT());
		}
		return size;
	}
	public int setL2L_g_STOCK_UNIT2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_g_STOCK_UNIT2 == null) {
			l_g_STOCK_UNIT2 = new ArrayList();
		} else {
			l_g_STOCK_UNIT2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_g_STOCK_UNIT2.add(((KU0030010Struct) list.get(i)).getg_STOCK_UNIT2());
		}
		return size;
	}
	public int setL2L_g_CUR_UNIT2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_g_CUR_UNIT2 == null) {
			l_g_CUR_UNIT2 = new ArrayList();
		} else {
			l_g_CUR_UNIT2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_g_CUR_UNIT2.add(((KU0030010Struct) list.get(i)).getg_CUR_UNIT2());
		}
		return size;
	}
	public int setL2L_g_WH_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_g_WH_NAME == null) {
			l_g_WH_NAME = new ArrayList();
		} else {
			l_g_WH_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_g_WH_NAME.add(((KU0030010Struct) list.get(i)).getg_WH_NAME());
		}
		return size;
	}
	public int setL2L_g_SALES_DEPT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_g_SALES_DEPT_CD == null) {
			l_g_SALES_DEPT_CD = new ArrayList();
		} else {
			l_g_SALES_DEPT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_g_SALES_DEPT_CD.add(((KU0030010Struct) list.get(i)).getg_SALES_DEPT_CD());
		}
		return size;
	}
	public int setL2L_g_ORG_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_g_ORG_NAME == null) {
			l_g_ORG_NAME = new ArrayList();
		} else {
			l_g_ORG_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_g_ORG_NAME.add(((KU0030010Struct) list.get(i)).getg_ORG_NAME());
		}
		return size;
	}
	public int setL2L_g_CUST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_g_CUST_CD == null) {
			l_g_CUST_CD = new ArrayList();
		} else {
			l_g_CUST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_g_CUST_CD.add(((KU0030010Struct) list.get(i)).getg_CUST_CD());
		}
		return size;
	}
	public int setL2L_g_CUST_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_g_CUST_ITEM_NAME == null) {
			l_g_CUST_ITEM_NAME = new ArrayList();
		} else {
			l_g_CUST_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_g_CUST_ITEM_NAME.add(((KU0030010Struct) list.get(i)).getg_CUST_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_g_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_g_ITEM_NAME == null) {
			l_g_ITEM_NAME = new ArrayList();
		} else {
			l_g_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_g_ITEM_NAME.add(((KU0030010Struct) list.get(i)).getg_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_g_CUST_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_g_CUST_ODR_NO == null) {
			l_g_CUST_ODR_NO = new ArrayList();
		} else {
			l_g_CUST_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_g_CUST_ODR_NO.add(((KU0030010Struct) list.get(i)).getg_CUST_ODR_NO());
		}
		return size;
	}
	public int setL2L_g_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_g_ODR_NO == null) {
			l_g_ODR_NO = new ArrayList();
		} else {
			l_g_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_g_ODR_NO.add(((KU0030010Struct) list.get(i)).getg_ODR_NO());
		}
		return size;
	}
	public int setL2L_g_PART_DLV_SEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_g_PART_DLV_SEQ_NO == null) {
			l_g_PART_DLV_SEQ_NO = new ArrayList();
		} else {
			l_g_PART_DLV_SEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_g_PART_DLV_SEQ_NO.add(((KU0030010Struct) list.get(i)).getg_PART_DLV_SEQ_NO());
		}
		return size;
	}
	public int setL2L_g_SHIP_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_g_SHIP_ODR_NO == null) {
			l_g_SHIP_ODR_NO = new ArrayList();
		} else {
			l_g_SHIP_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_g_SHIP_ODR_NO.add(((KU0030010Struct) list.get(i)).getg_SHIP_ODR_NO());
		}
		return size;
	}
	public int setL2L_h_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_DATE == null) {
			l_h_DATE = new ArrayList();
		} else {
			l_h_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_DATE.add(((KU0030010Struct) list.get(i)).geth_DATE());
		}
		return size;
	}
	public int setL2L_g_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_g_JOB_ODR_CD == null) {
			l_g_JOB_ODR_CD = new ArrayList();
		} else {
			l_g_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_g_JOB_ODR_CD.add(((KU0030010Struct) list.get(i)).getg_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_c_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_JOB_ODR_CD == null) {
			l_c_JOB_ODR_CD = new ArrayList();
		} else {
			l_c_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_JOB_ODR_CD.add(((KU0030010Struct) list.get(i)).getc_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_g_DIRECT_DLV_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_g_DIRECT_DLV_FLG == null) {
			l_g_DIRECT_DLV_FLG = new ArrayList();
		} else {
			l_g_DIRECT_DLV_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_g_DIRECT_DLV_FLG.add(((KU0030010Struct) list.get(i)).getg_DIRECT_DLV_FLG());
		}
		return size;
	}
	public int setL2L_g_STOCK_LOT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_g_STOCK_LOT_CD == null) {
			l_g_STOCK_LOT_CD = new ArrayList();
		} else {
			l_g_STOCK_LOT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_g_STOCK_LOT_CD.add(((KU0030010Struct) list.get(i)).getg_STOCK_LOT_CD());
		}
		return size;
	}
	public int setL2L_h_STOCK_LOT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_STOCK_LOT_CD == null) {
			l_h_STOCK_LOT_CD = new ArrayList();
		} else {
			l_h_STOCK_LOT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_STOCK_LOT_CD.add(((KU0030010Struct) list.get(i)).geth_STOCK_LOT_CD());
		}
		return size;
	}
	public int setL2L_param1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_param1 == null) {
			l_param1 = new ArrayList();
		} else {
			l_param1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_param1.add(((KU0030010Struct) list.get(i)).getparam1());
		}
		return size;
	}
	public int setL2L_param2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_param2 == null) {
			l_param2 = new ArrayList();
		} else {
			l_param2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_param2.add(((KU0030010Struct) list.get(i)).getparam2());
		}
		return size;
	}
	public int setL2L_param3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_param3 == null) {
			l_param3 = new ArrayList();
		} else {
			l_param3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_param3.add(((KU0030010Struct) list.get(i)).getparam3());
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
			l_ROUND_TYP.add(((KU0030010Struct) list.get(i)).getROUND_TYP());
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
			l_UNIT_QTY_TYP.add(((KU0030010Struct) list.get(i)).getUNIT_QTY_TYP());
		}
		return size;
	}
	public int setL2L_UNIT_FIG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_FIG == null) {
			l_UNIT_FIG = new ArrayList();
		} else {
			l_UNIT_FIG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_FIG.add(((KU0030010Struct) list.get(i)).getUNIT_FIG());
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
			l_strCOMPANY_CD.add(((KU0030010Struct) list.get(i)).getstrCOMPANY_CD());
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
			l_strUSER_NAME.add(((KU0030010Struct) list.get(i)).getstrUSER_NAME());
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
			l_strPLANT_CD.add(((KU0030010Struct) list.get(i)).getstrPLANT_CD());
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
			l_strSECTION_CD.add(((KU0030010Struct) list.get(i)).getstrSECTION_CD());
		}
		return size;
	}
	public int setL2L_strORG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strORG_CD == null) {
			l_strORG_CD = new ArrayList();
		} else {
			l_strORG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strORG_CD.add(((KU0030010Struct) list.get(i)).getstrORG_CD());
		}
		return size;
	}
	public int setL2L_strORG_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strORG_NAME == null) {
			l_strORG_NAME = new ArrayList();
		} else {
			l_strORG_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strORG_NAME.add(((KU0030010Struct) list.get(i)).getstrORG_NAME());
		}
		return size;
	}
	public int setL2L_strORG_ANAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strORG_ANAME == null) {
			l_strORG_ANAME = new ArrayList();
		} else {
			l_strORG_ANAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strORG_ANAME.add(((KU0030010Struct) list.get(i)).getstrORG_ANAME());
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
			l_strPLANT_NAME.add(((KU0030010Struct) list.get(i)).getstrPLANT_NAME());
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
			l_strPLANT_ANAME.add(((KU0030010Struct) list.get(i)).getstrPLANT_ANAME());
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
			l_strCAL_NO.add(((KU0030010Struct) list.get(i)).getstrCAL_NO());
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
			l_strUSER_CD.add(((KU0030010Struct) list.get(i)).getstrUSER_CD());
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
			l_strBUSINESS_OPR_DATE.add(((KU0030010Struct) list.get(i)).getstrBUSINESS_OPR_DATE());
		}
		return size;
	}
	public int setL2L_serTori_SHIP_SEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTori_SHIP_SEQ_NO == null) {
			l_serTori_SHIP_SEQ_NO = new ArrayList();
		} else {
			l_serTori_SHIP_SEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTori_SHIP_SEQ_NO.add(((KU0030010Struct) list.get(i)).getserTori_SHIP_SEQ_NO());
		}
		return size;
	}
	public int setL2L_serTori_SHIP_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTori_SHIP_ODR_NO == null) {
			l_serTori_SHIP_ODR_NO = new ArrayList();
		} else {
			l_serTori_SHIP_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTori_SHIP_ODR_NO.add(((KU0030010Struct) list.get(i)).getserTori_SHIP_ODR_NO());
		}
		return size;
	}
	public int setL2L_serTori_SLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTori_SLIP_CD == null) {
			l_serTori_SLIP_CD = new ArrayList();
		} else {
			l_serTori_SLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTori_SLIP_CD.add(((KU0030010Struct) list.get(i)).getserTori_SLIP_CD());
		}
		return size;
	}
	public int setL2L_serTori_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTori_ODR_NO == null) {
			l_serTori_ODR_NO = new ArrayList();
		} else {
			l_serTori_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTori_ODR_NO.add(((KU0030010Struct) list.get(i)).getserTori_ODR_NO());
		}
		return size;
	}
	public int setL2L_serTori_PART_DLV_SEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTori_PART_DLV_SEQ_NO == null) {
			l_serTori_PART_DLV_SEQ_NO = new ArrayList();
		} else {
			l_serTori_PART_DLV_SEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTori_PART_DLV_SEQ_NO.add(((KU0030010Struct) list.get(i)).getserTori_PART_DLV_SEQ_NO());
		}
		return size;
	}
	public int setL2L_serTori_ORGNAL_SLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTori_ORGNAL_SLIP_CD == null) {
			l_serTori_ORGNAL_SLIP_CD = new ArrayList();
		} else {
			l_serTori_ORGNAL_SLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTori_ORGNAL_SLIP_CD.add(((KU0030010Struct) list.get(i)).getserTori_ORGNAL_SLIP_CD());
		}
		return size;
	}
	public int setL2L_serTori_SLIP_TRN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTori_SLIP_TRN_CD == null) {
			l_serTori_SLIP_TRN_CD = new ArrayList();
		} else {
			l_serTori_SLIP_TRN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTori_SLIP_TRN_CD.add(((KU0030010Struct) list.get(i)).getserTori_SLIP_TRN_CD());
		}
		return size;
	}
	public int setL2L_serTori_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTori_ITEM_CD == null) {
			l_serTori_ITEM_CD = new ArrayList();
		} else {
			l_serTori_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTori_ITEM_CD.add(((KU0030010Struct) list.get(i)).getserTori_ITEM_CD());
		}
		return size;
	}
	public int setL2L_serTori_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTori_JOB_ODR_CD == null) {
			l_serTori_JOB_ODR_CD = new ArrayList();
		} else {
			l_serTori_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTori_JOB_ODR_CD.add(((KU0030010Struct) list.get(i)).getserTori_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_serTori_CUST_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTori_CUST_ITEM_CD == null) {
			l_serTori_CUST_ITEM_CD = new ArrayList();
		} else {
			l_serTori_CUST_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTori_CUST_ITEM_CD.add(((KU0030010Struct) list.get(i)).getserTori_CUST_ITEM_CD());
		}
		return size;
	}
	public int setL2L_serTori_CUST_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTori_CUST_ODR_NO == null) {
			l_serTori_CUST_ODR_NO = new ArrayList();
		} else {
			l_serTori_CUST_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTori_CUST_ODR_NO.add(((KU0030010Struct) list.get(i)).getserTori_CUST_ODR_NO());
		}
		return size;
	}
	public int setL2L_serTori_CUST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTori_CUST_CD == null) {
			l_serTori_CUST_CD = new ArrayList();
		} else {
			l_serTori_CUST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTori_CUST_CD.add(((KU0030010Struct) list.get(i)).getserTori_CUST_CD());
		}
		return size;
	}
	public int setL2L_serTori_CUST_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTori_CUST_NAME == null) {
			l_serTori_CUST_NAME = new ArrayList();
		} else {
			l_serTori_CUST_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTori_CUST_NAME.add(((KU0030010Struct) list.get(i)).getserTori_CUST_NAME());
		}
		return size;
	}
	public int setL2L_serTori_CUST_CHRG_PSN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTori_CUST_CHRG_PSN_CD == null) {
			l_serTori_CUST_CHRG_PSN_CD = new ArrayList();
		} else {
			l_serTori_CUST_CHRG_PSN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTori_CUST_CHRG_PSN_CD.add(((KU0030010Struct) list.get(i)).getserTori_CUST_CHRG_PSN_CD());
		}
		return size;
	}
	public int setL2L_serTori_SHIP_ODR_ISS_PSN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTori_SHIP_ODR_ISS_PSN_CD == null) {
			l_serTori_SHIP_ODR_ISS_PSN_CD = new ArrayList();
		} else {
			l_serTori_SHIP_ODR_ISS_PSN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTori_SHIP_ODR_ISS_PSN_CD.add(((KU0030010Struct) list.get(i)).getserTori_SHIP_ODR_ISS_PSN_CD());
		}
		return size;
	}
	public int setL2L_serTori_DLV_LOC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTori_DLV_LOC_CD == null) {
			l_serTori_DLV_LOC_CD = new ArrayList();
		} else {
			l_serTori_DLV_LOC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTori_DLV_LOC_CD.add(((KU0030010Struct) list.get(i)).getserTori_DLV_LOC_CD());
		}
		return size;
	}
	public int setL2L_serTori_DEPO_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTori_DEPO_TYP == null) {
			l_serTori_DEPO_TYP = new ArrayList();
		} else {
			l_serTori_DEPO_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTori_DEPO_TYP.add(((KU0030010Struct) list.get(i)).getserTori_DEPO_TYP());
		}
		return size;
	}
	public int setL2L_serTori_ALLCT_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTori_ALLCT_WH_CD == null) {
			l_serTori_ALLCT_WH_CD = new ArrayList();
		} else {
			l_serTori_ALLCT_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTori_ALLCT_WH_CD.add(((KU0030010Struct) list.get(i)).getserTori_ALLCT_WH_CD());
		}
		return size;
	}
	public int setL2L_serTori_DEPO_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTori_DEPO_WH_CD == null) {
			l_serTori_DEPO_WH_CD = new ArrayList();
		} else {
			l_serTori_DEPO_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTori_DEPO_WH_CD.add(((KU0030010Struct) list.get(i)).getserTori_DEPO_WH_CD());
		}
		return size;
	}
	public int setL2L_serTori_LOC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTori_LOC_CD == null) {
			l_serTori_LOC_CD = new ArrayList();
		} else {
			l_serTori_LOC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTori_LOC_CD.add(((KU0030010Struct) list.get(i)).getserTori_LOC_CD());
		}
		return size;
	}
	public int setL2L_serTori_SHIP_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTori_SHIP_DATE == null) {
			l_serTori_SHIP_DATE = new ArrayList();
		} else {
			l_serTori_SHIP_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTori_SHIP_DATE.add(((KU0030010Struct) list.get(i)).getserTori_SHIP_DATE());
		}
		return size;
	}
	public int setL2L_serTori_SHIP_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTori_SHIP_QTY == null) {
			l_serTori_SHIP_QTY = new ArrayList();
		} else {
			l_serTori_SHIP_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTori_SHIP_QTY.add(((KU0030010Struct) list.get(i)).getserTori_SHIP_QTY());
		}
		return size;
	}
	public int setL2L_serTori_UNIT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTori_UNIT_CD == null) {
			l_serTori_UNIT_CD = new ArrayList();
		} else {
			l_serTori_UNIT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTori_UNIT_CD.add(((KU0030010Struct) list.get(i)).getserTori_UNIT_CD());
		}
		return size;
	}
	public int setL2L_serTori_SHIP_UNIT_PRICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTori_SHIP_UNIT_PRICE == null) {
			l_serTori_SHIP_UNIT_PRICE = new ArrayList();
		} else {
			l_serTori_SHIP_UNIT_PRICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTori_SHIP_UNIT_PRICE.add(((KU0030010Struct) list.get(i)).getserTori_SHIP_UNIT_PRICE());
		}
		return size;
	}
	public int setL2L_serTori_SHIP_ODR_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTori_SHIP_ODR_AMOUNT == null) {
			l_serTori_SHIP_ODR_AMOUNT = new ArrayList();
		} else {
			l_serTori_SHIP_ODR_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTori_SHIP_ODR_AMOUNT.add(((KU0030010Struct) list.get(i)).getserTori_SHIP_ODR_AMOUNT());
		}
		return size;
	}
	public int setL2L_serTori_SHIP_ODR_AMOUNT_EXCH_RATES(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTori_SHIP_ODR_AMOUNT_EXCH_RATES == null) {
			l_serTori_SHIP_ODR_AMOUNT_EXCH_RATES = new ArrayList();
		} else {
			l_serTori_SHIP_ODR_AMOUNT_EXCH_RATES.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTori_SHIP_ODR_AMOUNT_EXCH_RATES.add(((KU0030010Struct) list.get(i)).getserTori_SHIP_ODR_AMOUNT_EXCH_RATES());
		}
		return size;
	}
	public int setL2L_serTori_CURRNCY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTori_CURRNCY_CD == null) {
			l_serTori_CURRNCY_CD = new ArrayList();
		} else {
			l_serTori_CURRNCY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTori_CURRNCY_CD.add(((KU0030010Struct) list.get(i)).getserTori_CURRNCY_CD());
		}
		return size;
	}
	public int setL2L_serTori_DIRECT_DLV_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTori_DIRECT_DLV_FLG == null) {
			l_serTori_DIRECT_DLV_FLG = new ArrayList();
		} else {
			l_serTori_DIRECT_DLV_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTori_DIRECT_DLV_FLG.add(((KU0030010Struct) list.get(i)).getserTori_DIRECT_DLV_FLG());
		}
		return size;
	}
	public int setL2L_serTori_SHIP_INFO_IF_CTRL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTori_SHIP_INFO_IF_CTRL_NO == null) {
			l_serTori_SHIP_INFO_IF_CTRL_NO = new ArrayList();
		} else {
			l_serTori_SHIP_INFO_IF_CTRL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTori_SHIP_INFO_IF_CTRL_NO.add(((KU0030010Struct) list.get(i)).getserTori_SHIP_INFO_IF_CTRL_NO());
		}
		return size;
	}
	public int setL2L_serTori_INSPC_ACPT_INFO_IF_CTRL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTori_INSPC_ACPT_INFO_IF_CTRL_NO == null) {
			l_serTori_INSPC_ACPT_INFO_IF_CTRL_NO = new ArrayList();
		} else {
			l_serTori_INSPC_ACPT_INFO_IF_CTRL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTori_INSPC_ACPT_INFO_IF_CTRL_NO.add(((KU0030010Struct) list.get(i)).getserTori_INSPC_ACPT_INFO_IF_CTRL_NO());
		}
		return size;
	}
	public int setL2L_serTori_DLV_KEY_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTori_DLV_KEY_NO == null) {
			l_serTori_DLV_KEY_NO = new ArrayList();
		} else {
			l_serTori_DLV_KEY_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTori_DLV_KEY_NO.add(((KU0030010Struct) list.get(i)).getserTori_DLV_KEY_NO());
		}
		return size;
	}
	public int setL2L_serTori_DEL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTori_DEL_FLG == null) {
			l_serTori_DEL_FLG = new ArrayList();
		} else {
			l_serTori_DEL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTori_DEL_FLG.add(((KU0030010Struct) list.get(i)).getserTori_DEL_FLG());
		}
		return size;
	}
	public int setL2L_serTori_CUR_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTori_CUR_NAME == null) {
			l_serTori_CUR_NAME = new ArrayList();
		} else {
			l_serTori_CUR_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTori_CUR_NAME.add(((KU0030010Struct) list.get(i)).getserTori_CUR_NAME());
		}
		return size;
	}
	public int setL2L_serTori_EXCH_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTori_EXCH_TYP == null) {
			l_serTori_EXCH_TYP = new ArrayList();
		} else {
			l_serTori_EXCH_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTori_EXCH_TYP.add(((KU0030010Struct) list.get(i)).getserTori_EXCH_TYP());
		}
		return size;
	}
	public int setL2L_serTori_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTori_MODIFY_COUNT == null) {
			l_serTori_MODIFY_COUNT = new ArrayList();
		} else {
			l_serTori_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTori_MODIFY_COUNT.add(((KU0030010Struct) list.get(i)).getserTori_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_serTori_RETURN_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTori_RETURN_QTY == null) {
			l_serTori_RETURN_QTY = new ArrayList();
		} else {
			l_serTori_RETURN_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTori_RETURN_QTY.add(((KU0030010Struct) list.get(i)).getserTori_RETURN_QTY());
		}
		return size;
	}
	public int setL2L_serTori_TOTAL_SHIP_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTori_TOTAL_SHIP_QTY == null) {
			l_serTori_TOTAL_SHIP_QTY = new ArrayList();
		} else {
			l_serTori_TOTAL_SHIP_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTori_TOTAL_SHIP_QTY.add(((KU0030010Struct) list.get(i)).getserTori_TOTAL_SHIP_QTY());
		}
		return size;
	}
	public int setL2L_serTori_STATUS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTori_STATUS == null) {
			l_serTori_STATUS = new ArrayList();
		} else {
			l_serTori_STATUS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTori_STATUS.add(((KU0030010Struct) list.get(i)).getserTori_STATUS());
		}
		return size;
	}
	public int setL2L_serTori_INSPC_ACPT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTori_INSPC_ACPT_TYP == null) {
			l_serTori_INSPC_ACPT_TYP = new ArrayList();
		} else {
			l_serTori_INSPC_ACPT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTori_INSPC_ACPT_TYP.add(((KU0030010Struct) list.get(i)).getserTori_INSPC_ACPT_TYP());
		}
		return size;
	}
	public int setL2L_serToriSALES_DEPT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serToriSALES_DEPT_CD == null) {
			l_serToriSALES_DEPT_CD = new ArrayList();
		} else {
			l_serToriSALES_DEPT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serToriSALES_DEPT_CD.add(((KU0030010Struct) list.get(i)).getserToriSALES_DEPT_CD());
		}
		return size;
	}
	public int setL2L_serToriSALES_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serToriSALES_DATE == null) {
			l_serToriSALES_DATE = new ArrayList();
		} else {
			l_serToriSALES_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serToriSALES_DATE.add(((KU0030010Struct) list.get(i)).getserToriSALES_DATE());
		}
		return size;
	}
	public int setL2L_h_MRP_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_MRP_ODR_TYP == null) {
			l_h_MRP_ODR_TYP = new ArrayList();
		} else {
			l_h_MRP_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_MRP_ODR_TYP.add(((KU0030010Struct) list.get(i)).geth_MRP_ODR_TYP());
		}
		return size;
	}
	public int setL2L_h_LOT_CTRL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_LOT_CTRL_FLG == null) {
			l_h_LOT_CTRL_FLG = new ArrayList();
		} else {
			l_h_LOT_CTRL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_LOT_CTRL_FLG.add(((KU0030010Struct) list.get(i)).geth_LOT_CTRL_FLG());
		}
		return size;
	}
	public int setL2L_serTodrMODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTodrMODIFY_COUNT == null) {
			l_serTodrMODIFY_COUNT = new ArrayList();
		} else {
			l_serTodrMODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTodrMODIFY_COUNT.add(((KU0030010Struct) list.get(i)).getserTodrMODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_serTori_IN_SLIPCD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTori_IN_SLIPCD == null) {
			l_serTori_IN_SLIPCD = new ArrayList();
		} else {
			l_serTori_IN_SLIPCD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTori_IN_SLIPCD.add(((KU0030010Struct) list.get(i)).getserTori_IN_SLIPCD());
		}
		return size;
	}
	public int setL2L_creTship_SHIP_SEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTship_SHIP_SEQ_NO == null) {
			l_creTship_SHIP_SEQ_NO = new ArrayList();
		} else {
			l_creTship_SHIP_SEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTship_SHIP_SEQ_NO.add(((KU0030010Struct) list.get(i)).getcreTship_SHIP_SEQ_NO());
		}
		return size;
	}
	public int setL2L_creTship_SHIP_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTship_SHIP_ODR_NO == null) {
			l_creTship_SHIP_ODR_NO = new ArrayList();
		} else {
			l_creTship_SHIP_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTship_SHIP_ODR_NO.add(((KU0030010Struct) list.get(i)).getcreTship_SHIP_ODR_NO());
		}
		return size;
	}
	public int setL2L_creTship_SLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTship_SLIP_CD == null) {
			l_creTship_SLIP_CD = new ArrayList();
		} else {
			l_creTship_SLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTship_SLIP_CD.add(((KU0030010Struct) list.get(i)).getcreTship_SLIP_CD());
		}
		return size;
	}
	public int setL2L_creTship_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTship_ODR_NO == null) {
			l_creTship_ODR_NO = new ArrayList();
		} else {
			l_creTship_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTship_ODR_NO.add(((KU0030010Struct) list.get(i)).getcreTship_ODR_NO());
		}
		return size;
	}
	public int setL2L_creTship_PART_DLV_SEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTship_PART_DLV_SEQ_NO == null) {
			l_creTship_PART_DLV_SEQ_NO = new ArrayList();
		} else {
			l_creTship_PART_DLV_SEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTship_PART_DLV_SEQ_NO.add(((KU0030010Struct) list.get(i)).getcreTship_PART_DLV_SEQ_NO());
		}
		return size;
	}
	public int setL2L_creTship_ORGNAL_SLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTship_ORGNAL_SLIP_CD == null) {
			l_creTship_ORGNAL_SLIP_CD = new ArrayList();
		} else {
			l_creTship_ORGNAL_SLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTship_ORGNAL_SLIP_CD.add(((KU0030010Struct) list.get(i)).getcreTship_ORGNAL_SLIP_CD());
		}
		return size;
	}
	public int setL2L_creTship_SLIP_TRN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTship_SLIP_TRN_CD == null) {
			l_creTship_SLIP_TRN_CD = new ArrayList();
		} else {
			l_creTship_SLIP_TRN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTship_SLIP_TRN_CD.add(((KU0030010Struct) list.get(i)).getcreTship_SLIP_TRN_CD());
		}
		return size;
	}
	public int setL2L_creTship_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTship_ITEM_CD == null) {
			l_creTship_ITEM_CD = new ArrayList();
		} else {
			l_creTship_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTship_ITEM_CD.add(((KU0030010Struct) list.get(i)).getcreTship_ITEM_CD());
		}
		return size;
	}
	public int setL2L_creTship_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTship_JOB_ODR_CD == null) {
			l_creTship_JOB_ODR_CD = new ArrayList();
		} else {
			l_creTship_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTship_JOB_ODR_CD.add(((KU0030010Struct) list.get(i)).getcreTship_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_creTship_CUST_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTship_CUST_ITEM_CD == null) {
			l_creTship_CUST_ITEM_CD = new ArrayList();
		} else {
			l_creTship_CUST_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTship_CUST_ITEM_CD.add(((KU0030010Struct) list.get(i)).getcreTship_CUST_ITEM_CD());
		}
		return size;
	}
	public int setL2L_creTship_CUST_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTship_CUST_ODR_NO == null) {
			l_creTship_CUST_ODR_NO = new ArrayList();
		} else {
			l_creTship_CUST_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTship_CUST_ODR_NO.add(((KU0030010Struct) list.get(i)).getcreTship_CUST_ODR_NO());
		}
		return size;
	}
	public int setL2L_creTship_CUST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTship_CUST_CD == null) {
			l_creTship_CUST_CD = new ArrayList();
		} else {
			l_creTship_CUST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTship_CUST_CD.add(((KU0030010Struct) list.get(i)).getcreTship_CUST_CD());
		}
		return size;
	}
	public int setL2L_creTship_CUST_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTship_CUST_NAME == null) {
			l_creTship_CUST_NAME = new ArrayList();
		} else {
			l_creTship_CUST_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTship_CUST_NAME.add(((KU0030010Struct) list.get(i)).getcreTship_CUST_NAME());
		}
		return size;
	}
	public int setL2L_creTship_CUST_CHRG_PSN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTship_CUST_CHRG_PSN_CD == null) {
			l_creTship_CUST_CHRG_PSN_CD = new ArrayList();
		} else {
			l_creTship_CUST_CHRG_PSN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTship_CUST_CHRG_PSN_CD.add(((KU0030010Struct) list.get(i)).getcreTship_CUST_CHRG_PSN_CD());
		}
		return size;
	}
	public int setL2L_creTship_SHIP_ODR_ISS_PSN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTship_SHIP_ODR_ISS_PSN_CD == null) {
			l_creTship_SHIP_ODR_ISS_PSN_CD = new ArrayList();
		} else {
			l_creTship_SHIP_ODR_ISS_PSN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTship_SHIP_ODR_ISS_PSN_CD.add(((KU0030010Struct) list.get(i)).getcreTship_SHIP_ODR_ISS_PSN_CD());
		}
		return size;
	}
	public int setL2L_creTship_DLV_LOC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTship_DLV_LOC_CD == null) {
			l_creTship_DLV_LOC_CD = new ArrayList();
		} else {
			l_creTship_DLV_LOC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTship_DLV_LOC_CD.add(((KU0030010Struct) list.get(i)).getcreTship_DLV_LOC_CD());
		}
		return size;
	}
	public int setL2L_creTship_DEPO_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTship_DEPO_TYP == null) {
			l_creTship_DEPO_TYP = new ArrayList();
		} else {
			l_creTship_DEPO_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTship_DEPO_TYP.add(((KU0030010Struct) list.get(i)).getcreTship_DEPO_TYP());
		}
		return size;
	}
	public int setL2L_creTship_ALLCT_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTship_ALLCT_WH_CD == null) {
			l_creTship_ALLCT_WH_CD = new ArrayList();
		} else {
			l_creTship_ALLCT_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTship_ALLCT_WH_CD.add(((KU0030010Struct) list.get(i)).getcreTship_ALLCT_WH_CD());
		}
		return size;
	}
	public int setL2L_creTship_DEPO_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTship_DEPO_WH_CD == null) {
			l_creTship_DEPO_WH_CD = new ArrayList();
		} else {
			l_creTship_DEPO_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTship_DEPO_WH_CD.add(((KU0030010Struct) list.get(i)).getcreTship_DEPO_WH_CD());
		}
		return size;
	}
	public int setL2L_creTship_LOC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTship_LOC_CD == null) {
			l_creTship_LOC_CD = new ArrayList();
		} else {
			l_creTship_LOC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTship_LOC_CD.add(((KU0030010Struct) list.get(i)).getcreTship_LOC_CD());
		}
		return size;
	}
	public int setL2L_creTship_SHIP_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTship_SHIP_DATE == null) {
			l_creTship_SHIP_DATE = new ArrayList();
		} else {
			l_creTship_SHIP_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTship_SHIP_DATE.add(((KU0030010Struct) list.get(i)).getcreTship_SHIP_DATE());
		}
		return size;
	}
	public int setL2L_creTship_SHIP_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTship_SHIP_QTY == null) {
			l_creTship_SHIP_QTY = new ArrayList();
		} else {
			l_creTship_SHIP_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTship_SHIP_QTY.add(((KU0030010Struct) list.get(i)).getcreTship_SHIP_QTY());
		}
		return size;
	}
	public int setL2L_creTship_UNIT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTship_UNIT_CD == null) {
			l_creTship_UNIT_CD = new ArrayList();
		} else {
			l_creTship_UNIT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTship_UNIT_CD.add(((KU0030010Struct) list.get(i)).getcreTship_UNIT_CD());
		}
		return size;
	}
	public int setL2L_creTship_SHIP_UNIT_PRICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTship_SHIP_UNIT_PRICE == null) {
			l_creTship_SHIP_UNIT_PRICE = new ArrayList();
		} else {
			l_creTship_SHIP_UNIT_PRICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTship_SHIP_UNIT_PRICE.add(((KU0030010Struct) list.get(i)).getcreTship_SHIP_UNIT_PRICE());
		}
		return size;
	}
	public int setL2L_creTship_SHIP_ODR_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTship_SHIP_ODR_AMOUNT == null) {
			l_creTship_SHIP_ODR_AMOUNT = new ArrayList();
		} else {
			l_creTship_SHIP_ODR_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTship_SHIP_ODR_AMOUNT.add(((KU0030010Struct) list.get(i)).getcreTship_SHIP_ODR_AMOUNT());
		}
		return size;
	}
	public int setL2L_creTship_SHIP_ODR_AMOUNT_EXCH_RATES(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTship_SHIP_ODR_AMOUNT_EXCH_RATES == null) {
			l_creTship_SHIP_ODR_AMOUNT_EXCH_RATES = new ArrayList();
		} else {
			l_creTship_SHIP_ODR_AMOUNT_EXCH_RATES.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTship_SHIP_ODR_AMOUNT_EXCH_RATES.add(((KU0030010Struct) list.get(i)).getcreTship_SHIP_ODR_AMOUNT_EXCH_RATES());
		}
		return size;
	}
	public int setL2L_creTship_CURRNCY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTship_CURRNCY_CD == null) {
			l_creTship_CURRNCY_CD = new ArrayList();
		} else {
			l_creTship_CURRNCY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTship_CURRNCY_CD.add(((KU0030010Struct) list.get(i)).getcreTship_CURRNCY_CD());
		}
		return size;
	}
	public int setL2L_creTship_DIRECT_DLV_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTship_DIRECT_DLV_FLG == null) {
			l_creTship_DIRECT_DLV_FLG = new ArrayList();
		} else {
			l_creTship_DIRECT_DLV_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTship_DIRECT_DLV_FLG.add(((KU0030010Struct) list.get(i)).getcreTship_DIRECT_DLV_FLG());
		}
		return size;
	}
	public int setL2L_creTship_DLV_KEY_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTship_DLV_KEY_NO == null) {
			l_creTship_DLV_KEY_NO = new ArrayList();
		} else {
			l_creTship_DLV_KEY_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTship_DLV_KEY_NO.add(((KU0030010Struct) list.get(i)).getcreTship_DLV_KEY_NO());
		}
		return size;
	}
	public int setL2L_creTship_REMARKS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTship_REMARKS == null) {
			l_creTship_REMARKS = new ArrayList();
		} else {
			l_creTship_REMARKS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTship_REMARKS.add(((KU0030010Struct) list.get(i)).getcreTship_REMARKS());
		}
		return size;
	}
	public int setL2L_creTship_DEL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTship_DEL_FLG == null) {
			l_creTship_DEL_FLG = new ArrayList();
		} else {
			l_creTship_DEL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTship_DEL_FLG.add(((KU0030010Struct) list.get(i)).getcreTship_DEL_FLG());
		}
		return size;
	}
	public int setL2L_updTship_SHIP_SEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_updTship_SHIP_SEQ_NO == null) {
			l_updTship_SHIP_SEQ_NO = new ArrayList();
		} else {
			l_updTship_SHIP_SEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_updTship_SHIP_SEQ_NO.add(((KU0030010Struct) list.get(i)).getupdTship_SHIP_SEQ_NO());
		}
		return size;
	}
	public int setL2L_serInsert_SHIP_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serInsert_SHIP_ODR_NO == null) {
			l_serInsert_SHIP_ODR_NO = new ArrayList();
		} else {
			l_serInsert_SHIP_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serInsert_SHIP_ODR_NO.add(((KU0030010Struct) list.get(i)).getserInsert_SHIP_ODR_NO());
		}
		return size;
	}
	public int setL2L_serInsert_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serInsert_ODR_NO == null) {
			l_serInsert_ODR_NO = new ArrayList();
		} else {
			l_serInsert_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serInsert_ODR_NO.add(((KU0030010Struct) list.get(i)).getserInsert_ODR_NO());
		}
		return size;
	}
	public int setL2L_serInsert_PART_DLV_SEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serInsert_PART_DLV_SEQ_NO == null) {
			l_serInsert_PART_DLV_SEQ_NO = new ArrayList();
		} else {
			l_serInsert_PART_DLV_SEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serInsert_PART_DLV_SEQ_NO.add(((KU0030010Struct) list.get(i)).getserInsert_PART_DLV_SEQ_NO());
		}
		return size;
	}
	public int setL2L_serInsert_SLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serInsert_SLIP_CD == null) {
			l_serInsert_SLIP_CD = new ArrayList();
		} else {
			l_serInsert_SLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serInsert_SLIP_CD.add(((KU0030010Struct) list.get(i)).getserInsert_SLIP_CD());
		}
		return size;
	}
	public int setL2L_serInsert_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serInsert_ITEM_CD == null) {
			l_serInsert_ITEM_CD = new ArrayList();
		} else {
			l_serInsert_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serInsert_ITEM_CD.add(((KU0030010Struct) list.get(i)).getserInsert_ITEM_CD());
		}
		return size;
	}
	public int setL2L_serInsert_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serInsert_JOB_ODR_CD == null) {
			l_serInsert_JOB_ODR_CD = new ArrayList();
		} else {
			l_serInsert_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serInsert_JOB_ODR_CD.add(((KU0030010Struct) list.get(i)).getserInsert_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_serInsert_CUST_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serInsert_CUST_ITEM_CD == null) {
			l_serInsert_CUST_ITEM_CD = new ArrayList();
		} else {
			l_serInsert_CUST_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serInsert_CUST_ITEM_CD.add(((KU0030010Struct) list.get(i)).getserInsert_CUST_ITEM_CD());
		}
		return size;
	}
	public int setL2L_serInsert_CUST_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serInsert_CUST_ODR_NO == null) {
			l_serInsert_CUST_ODR_NO = new ArrayList();
		} else {
			l_serInsert_CUST_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serInsert_CUST_ODR_NO.add(((KU0030010Struct) list.get(i)).getserInsert_CUST_ODR_NO());
		}
		return size;
	}
	public int setL2L_serInsert_CUST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serInsert_CUST_CD == null) {
			l_serInsert_CUST_CD = new ArrayList();
		} else {
			l_serInsert_CUST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serInsert_CUST_CD.add(((KU0030010Struct) list.get(i)).getserInsert_CUST_CD());
		}
		return size;
	}
	public int setL2L_serInsert_CUST_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serInsert_CUST_NAME == null) {
			l_serInsert_CUST_NAME = new ArrayList();
		} else {
			l_serInsert_CUST_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serInsert_CUST_NAME.add(((KU0030010Struct) list.get(i)).getserInsert_CUST_NAME());
		}
		return size;
	}
	public int setL2L_serInsert_CUST_CHRG_PSN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serInsert_CUST_CHRG_PSN_CD == null) {
			l_serInsert_CUST_CHRG_PSN_CD = new ArrayList();
		} else {
			l_serInsert_CUST_CHRG_PSN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serInsert_CUST_CHRG_PSN_CD.add(((KU0030010Struct) list.get(i)).getserInsert_CUST_CHRG_PSN_CD());
		}
		return size;
	}
	public int setL2L_serInsert_SHIP_ODR_ISS_PSN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serInsert_SHIP_ODR_ISS_PSN_CD == null) {
			l_serInsert_SHIP_ODR_ISS_PSN_CD = new ArrayList();
		} else {
			l_serInsert_SHIP_ODR_ISS_PSN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serInsert_SHIP_ODR_ISS_PSN_CD.add(((KU0030010Struct) list.get(i)).getserInsert_SHIP_ODR_ISS_PSN_CD());
		}
		return size;
	}
	public int setL2L_serInsert_DLV_LOC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serInsert_DLV_LOC_CD == null) {
			l_serInsert_DLV_LOC_CD = new ArrayList();
		} else {
			l_serInsert_DLV_LOC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serInsert_DLV_LOC_CD.add(((KU0030010Struct) list.get(i)).getserInsert_DLV_LOC_CD());
		}
		return size;
	}
	public int setL2L_serInsert_DEPO_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serInsert_DEPO_TYP == null) {
			l_serInsert_DEPO_TYP = new ArrayList();
		} else {
			l_serInsert_DEPO_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serInsert_DEPO_TYP.add(((KU0030010Struct) list.get(i)).getserInsert_DEPO_TYP());
		}
		return size;
	}
	public int setL2L_serInsert_DESINATED_SHIP_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serInsert_DESINATED_SHIP_DATE == null) {
			l_serInsert_DESINATED_SHIP_DATE = new ArrayList();
		} else {
			l_serInsert_DESINATED_SHIP_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serInsert_DESINATED_SHIP_DATE.add(((KU0030010Struct) list.get(i)).getserInsert_DESINATED_SHIP_DATE());
		}
		return size;
	}
	public int setL2L_serInsert_SHIP_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serInsert_SHIP_QTY == null) {
			l_serInsert_SHIP_QTY = new ArrayList();
		} else {
			l_serInsert_SHIP_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serInsert_SHIP_QTY.add(((KU0030010Struct) list.get(i)).getserInsert_SHIP_QTY());
		}
		return size;
	}
	public int setL2L_serInsert_TOTAL_SHIP_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serInsert_TOTAL_SHIP_QTY == null) {
			l_serInsert_TOTAL_SHIP_QTY = new ArrayList();
		} else {
			l_serInsert_TOTAL_SHIP_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serInsert_TOTAL_SHIP_QTY.add(((KU0030010Struct) list.get(i)).getserInsert_TOTAL_SHIP_QTY());
		}
		return size;
	}
	public int setL2L_serInsert_UNIT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serInsert_UNIT_CD == null) {
			l_serInsert_UNIT_CD = new ArrayList();
		} else {
			l_serInsert_UNIT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serInsert_UNIT_CD.add(((KU0030010Struct) list.get(i)).getserInsert_UNIT_CD());
		}
		return size;
	}
	public int setL2L_serInsert_UNIT_PRICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serInsert_UNIT_PRICE == null) {
			l_serInsert_UNIT_PRICE = new ArrayList();
		} else {
			l_serInsert_UNIT_PRICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serInsert_UNIT_PRICE.add(((KU0030010Struct) list.get(i)).getserInsert_UNIT_PRICE());
		}
		return size;
	}
	public int setL2L_serInsert_SHIP_ODR_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serInsert_SHIP_ODR_AMOUNT == null) {
			l_serInsert_SHIP_ODR_AMOUNT = new ArrayList();
		} else {
			l_serInsert_SHIP_ODR_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serInsert_SHIP_ODR_AMOUNT.add(((KU0030010Struct) list.get(i)).getserInsert_SHIP_ODR_AMOUNT());
		}
		return size;
	}
	public int setL2L_serInsert_SHIP_ODR_AMOUNT_EXCH_RATES(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serInsert_SHIP_ODR_AMOUNT_EXCH_RATES == null) {
			l_serInsert_SHIP_ODR_AMOUNT_EXCH_RATES = new ArrayList();
		} else {
			l_serInsert_SHIP_ODR_AMOUNT_EXCH_RATES.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serInsert_SHIP_ODR_AMOUNT_EXCH_RATES.add(((KU0030010Struct) list.get(i)).getserInsert_SHIP_ODR_AMOUNT_EXCH_RATES());
		}
		return size;
	}
	public int setL2L_serInsert_CURRNCY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serInsert_CURRNCY_CD == null) {
			l_serInsert_CURRNCY_CD = new ArrayList();
		} else {
			l_serInsert_CURRNCY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serInsert_CURRNCY_CD.add(((KU0030010Struct) list.get(i)).getserInsert_CURRNCY_CD());
		}
		return size;
	}
	public int setL2L_serInsert_LOC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serInsert_LOC_CD == null) {
			l_serInsert_LOC_CD = new ArrayList();
		} else {
			l_serInsert_LOC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serInsert_LOC_CD.add(((KU0030010Struct) list.get(i)).getserInsert_LOC_CD());
		}
		return size;
	}
	public int setL2L_serInsert_PKG_UNIT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serInsert_PKG_UNIT_QTY == null) {
			l_serInsert_PKG_UNIT_QTY = new ArrayList();
		} else {
			l_serInsert_PKG_UNIT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serInsert_PKG_UNIT_QTY.add(((KU0030010Struct) list.get(i)).getserInsert_PKG_UNIT_QTY());
		}
		return size;
	}
	public int setL2L_serInsert_REMARKS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serInsert_REMARKS == null) {
			l_serInsert_REMARKS = new ArrayList();
		} else {
			l_serInsert_REMARKS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serInsert_REMARKS.add(((KU0030010Struct) list.get(i)).getserInsert_REMARKS());
		}
		return size;
	}
	public int setL2L_serInsert_TRANSPORT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serInsert_TRANSPORT_CD == null) {
			l_serInsert_TRANSPORT_CD = new ArrayList();
		} else {
			l_serInsert_TRANSPORT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serInsert_TRANSPORT_CD.add(((KU0030010Struct) list.get(i)).getserInsert_TRANSPORT_CD());
		}
		return size;
	}
	public int setL2L_serInsert_TRANSPORT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serInsert_TRANSPORT_TYP == null) {
			l_serInsert_TRANSPORT_TYP = new ArrayList();
		} else {
			l_serInsert_TRANSPORT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serInsert_TRANSPORT_TYP.add(((KU0030010Struct) list.get(i)).getserInsert_TRANSPORT_TYP());
		}
		return size;
	}
	public int setL2L_serInsert_ALLCT_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serInsert_ALLCT_WH_CD == null) {
			l_serInsert_ALLCT_WH_CD = new ArrayList();
		} else {
			l_serInsert_ALLCT_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serInsert_ALLCT_WH_CD.add(((KU0030010Struct) list.get(i)).getserInsert_ALLCT_WH_CD());
		}
		return size;
	}
	public int setL2L_serInsert_TRANSFER_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serInsert_TRANSFER_WH_CD == null) {
			l_serInsert_TRANSFER_WH_CD = new ArrayList();
		} else {
			l_serInsert_TRANSFER_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serInsert_TRANSFER_WH_CD.add(((KU0030010Struct) list.get(i)).getserInsert_TRANSFER_WH_CD());
		}
		return size;
	}
	public int setL2L_serInsert_DIRECT_DLV_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serInsert_DIRECT_DLV_FLG == null) {
			l_serInsert_DIRECT_DLV_FLG = new ArrayList();
		} else {
			l_serInsert_DIRECT_DLV_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serInsert_DIRECT_DLV_FLG.add(((KU0030010Struct) list.get(i)).getserInsert_DIRECT_DLV_FLG());
		}
		return size;
	}
	public int setL2L_serInsert_ENTRY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serInsert_ENTRY_TYP == null) {
			l_serInsert_ENTRY_TYP = new ArrayList();
		} else {
			l_serInsert_ENTRY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serInsert_ENTRY_TYP.add(((KU0030010Struct) list.get(i)).getserInsert_ENTRY_TYP());
		}
		return size;
	}
	public int setL2L_serInsert_PRINT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serInsert_PRINT_FLG == null) {
			l_serInsert_PRINT_FLG = new ArrayList();
		} else {
			l_serInsert_PRINT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serInsert_PRINT_FLG.add(((KU0030010Struct) list.get(i)).getserInsert_PRINT_FLG());
		}
		return size;
	}
	public int setL2L_serInsert_SHP_CMPLT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serInsert_SHP_CMPLT_FLG == null) {
			l_serInsert_SHP_CMPLT_FLG = new ArrayList();
		} else {
			l_serInsert_SHP_CMPLT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serInsert_SHP_CMPLT_FLG.add(((KU0030010Struct) list.get(i)).getserInsert_SHP_CMPLT_FLG());
		}
		return size;
	}
	public int setL2L_serInsert_DEPO_TRANSFER_PROC_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serInsert_DEPO_TRANSFER_PROC_FLG == null) {
			l_serInsert_DEPO_TRANSFER_PROC_FLG = new ArrayList();
		} else {
			l_serInsert_DEPO_TRANSFER_PROC_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serInsert_DEPO_TRANSFER_PROC_FLG.add(((KU0030010Struct) list.get(i)).getserInsert_DEPO_TRANSFER_PROC_FLG());
		}
		return size;
	}
	public int setL2L_serInsert_DEL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serInsert_DEL_FLG == null) {
			l_serInsert_DEL_FLG = new ArrayList();
		} else {
			l_serInsert_DEL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serInsert_DEL_FLG.add(((KU0030010Struct) list.get(i)).getserInsert_DEL_FLG());
		}
		return size;
	}
	public int setL2L_serInsert_CUR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serInsert_CUR_CD == null) {
			l_serInsert_CUR_CD = new ArrayList();
		} else {
			l_serInsert_CUR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serInsert_CUR_CD.add(((KU0030010Struct) list.get(i)).getserInsert_CUR_CD());
		}
		return size;
	}
	public int setL2L_serInsert_CUR_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serInsert_CUR_NAME == null) {
			l_serInsert_CUR_NAME = new ArrayList();
		} else {
			l_serInsert_CUR_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serInsert_CUR_NAME.add(((KU0030010Struct) list.get(i)).getserInsert_CUR_NAME());
		}
		return size;
	}
	public int setL2L_serInsert_EXCH_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serInsert_EXCH_TYP == null) {
			l_serInsert_EXCH_TYP = new ArrayList();
		} else {
			l_serInsert_EXCH_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serInsert_EXCH_TYP.add(((KU0030010Struct) list.get(i)).getserInsert_EXCH_TYP());
		}
		return size;
	}
	public int setL2L_serInsert_SPCL_PRICE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serInsert_SPCL_PRICE_TYP == null) {
			l_serInsert_SPCL_PRICE_TYP = new ArrayList();
		} else {
			l_serInsert_SPCL_PRICE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serInsert_SPCL_PRICE_TYP.add(((KU0030010Struct) list.get(i)).getserInsert_SPCL_PRICE_TYP());
		}
		return size;
	}
	public int setL2L_serInsert_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serInsert_MODIFY_COUNT == null) {
			l_serInsert_MODIFY_COUNT = new ArrayList();
		} else {
			l_serInsert_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serInsert_MODIFY_COUNT.add(((KU0030010Struct) list.get(i)).getserInsert_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_serInsert_SCDL_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serInsert_SCDL_DLV_DATE == null) {
			l_serInsert_SCDL_DLV_DATE = new ArrayList();
		} else {
			l_serInsert_SCDL_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serInsert_SCDL_DLV_DATE.add(((KU0030010Struct) list.get(i)).getserInsert_SCDL_DLV_DATE());
		}
		return size;
	}
	public int setL2L_serInsert_DLV_KEY_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serInsert_DLV_KEY_NO == null) {
			l_serInsert_DLV_KEY_NO = new ArrayList();
		} else {
			l_serInsert_DLV_KEY_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serInsert_DLV_KEY_NO.add(((KU0030010Struct) list.get(i)).getserInsert_DLV_KEY_NO());
		}
		return size;
	}
	public int setL2L_h_RETURN_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_RETURN_QTY == null) {
			l_h_RETURN_QTY = new ArrayList();
		} else {
			l_h_RETURN_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_RETURN_QTY.add(((KU0030010Struct) list.get(i)).geth_RETURN_QTY());
		}
		return size;
	}
	public int setL2L_serInsert_ODR_ACPT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serInsert_ODR_ACPT_DATE == null) {
			l_serInsert_ODR_ACPT_DATE = new ArrayList();
		} else {
			l_serInsert_ODR_ACPT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serInsert_ODR_ACPT_DATE.add(((KU0030010Struct) list.get(i)).getserInsert_ODR_ACPT_DATE());
		}
		return size;
	}
	public int setL2L_h_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_JOB_ODR_CD == null) {
			l_h_JOB_ODR_CD = new ArrayList();
		} else {
			l_h_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_JOB_ODR_CD.add(((KU0030010Struct) list.get(i)).geth_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_selMODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_selMODIFY_COUNT == null) {
			l_selMODIFY_COUNT = new ArrayList();
		} else {
			l_selMODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_selMODIFY_COUNT.add(((KU0030010Struct) list.get(i)).getselMODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_serInsert_IN_SLIPCD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serInsert_IN_SLIPCD == null) {
			l_serInsert_IN_SLIPCD = new ArrayList();
		} else {
			l_serInsert_IN_SLIPCD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serInsert_IN_SLIPCD.add(((KU0030010Struct) list.get(i)).getserInsert_IN_SLIPCD());
		}
		return size;
	}
	public int setL2L_upTshipOdr_DEPO_TRANSFER_PROC_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_upTshipOdr_DEPO_TRANSFER_PROC_FLG == null) {
			l_upTshipOdr_DEPO_TRANSFER_PROC_FLG = new ArrayList();
		} else {
			l_upTshipOdr_DEPO_TRANSFER_PROC_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_upTshipOdr_DEPO_TRANSFER_PROC_FLG.add(((KU0030010Struct) list.get(i)).getupTshipOdr_DEPO_TRANSFER_PROC_FLG());
		}
		return size;
	}
	public int setL2L_upTshipOdr_IN_SLIPCD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_upTshipOdr_IN_SLIPCD == null) {
			l_upTshipOdr_IN_SLIPCD = new ArrayList();
		} else {
			l_upTshipOdr_IN_SLIPCD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_upTshipOdr_IN_SLIPCD.add(((KU0030010Struct) list.get(i)).getupTshipOdr_IN_SLIPCD());
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
			l_chkisWhCd_WH_CD.add(((KU0030010Struct) list.get(i)).getchkisWhCd_WH_CD());
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
			l_chkisWhCd_WH_TYP.add(((KU0030010Struct) list.get(i)).getchkisWhCd_WH_TYP());
		}
		return size;
	}
	public int setL2L_chkisinWhCd_WH_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_chkisinWhCd_WH_NAME == null) {
			l_chkisinWhCd_WH_NAME = new ArrayList();
		} else {
			l_chkisinWhCd_WH_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_chkisinWhCd_WH_NAME.add(((KU0030010Struct) list.get(i)).getchkisinWhCd_WH_NAME());
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
			l_chkisWhCd_IN_WHCD.add(((KU0030010Struct) list.get(i)).getchkisWhCd_IN_WHCD());
		}
		return size;
	}
	public int setL2L_chkisWhCd_IN_WHTYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_chkisWhCd_IN_WHTYP == null) {
			l_chkisWhCd_IN_WHTYP = new ArrayList();
		} else {
			l_chkisWhCd_IN_WHTYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_chkisWhCd_IN_WHTYP.add(((KU0030010Struct) list.get(i)).getchkisWhCd_IN_WHTYP());
		}
		return size;
	}
	public int setL2L_creTsales_SHIP_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTsales_SHIP_ODR_NO == null) {
			l_creTsales_SHIP_ODR_NO = new ArrayList();
		} else {
			l_creTsales_SHIP_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTsales_SHIP_ODR_NO.add(((KU0030010Struct) list.get(i)).getcreTsales_SHIP_ODR_NO());
		}
		return size;
	}
	public int setL2L_creTsales_SLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTsales_SLIP_CD == null) {
			l_creTsales_SLIP_CD = new ArrayList();
		} else {
			l_creTsales_SLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTsales_SLIP_CD.add(((KU0030010Struct) list.get(i)).getcreTsales_SLIP_CD());
		}
		return size;
	}
	public int setL2L_creTsales_SALES_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTsales_SALES_TYP == null) {
			l_creTsales_SALES_TYP = new ArrayList();
		} else {
			l_creTsales_SALES_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTsales_SALES_TYP.add(((KU0030010Struct) list.get(i)).getcreTsales_SALES_TYP());
		}
		return size;
	}
	public int setL2L_creTsales_CUST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTsales_CUST_CD == null) {
			l_creTsales_CUST_CD = new ArrayList();
		} else {
			l_creTsales_CUST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTsales_CUST_CD.add(((KU0030010Struct) list.get(i)).getcreTsales_CUST_CD());
		}
		return size;
	}
	public int setL2L_creTsales_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTsales_ITEM_CD == null) {
			l_creTsales_ITEM_CD = new ArrayList();
		} else {
			l_creTsales_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTsales_ITEM_CD.add(((KU0030010Struct) list.get(i)).getcreTsales_ITEM_CD());
		}
		return size;
	}
	public int setL2L_creTsales_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTsales_ITEM_NAME == null) {
			l_creTsales_ITEM_NAME = new ArrayList();
		} else {
			l_creTsales_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTsales_ITEM_NAME.add(((KU0030010Struct) list.get(i)).getcreTsales_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_creTsales_CUST_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTsales_CUST_ODR_NO == null) {
			l_creTsales_CUST_ODR_NO = new ArrayList();
		} else {
			l_creTsales_CUST_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTsales_CUST_ODR_NO.add(((KU0030010Struct) list.get(i)).getcreTsales_CUST_ODR_NO());
		}
		return size;
	}
	public int setL2L_creTsales_SALES_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTsales_SALES_DATE == null) {
			l_creTsales_SALES_DATE = new ArrayList();
		} else {
			l_creTsales_SALES_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTsales_SALES_DATE.add(((KU0030010Struct) list.get(i)).getcreTsales_SALES_DATE());
		}
		return size;
	}
	public int setL2L_creTsales_SALES_DEPT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTsales_SALES_DEPT_CD == null) {
			l_creTsales_SALES_DEPT_CD = new ArrayList();
		} else {
			l_creTsales_SALES_DEPT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTsales_SALES_DEPT_CD.add(((KU0030010Struct) list.get(i)).getcreTsales_SALES_DEPT_CD());
		}
		return size;
	}
	public int setL2L_creTsales_CUST_CHRG_PSN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTsales_CUST_CHRG_PSN_CD == null) {
			l_creTsales_CUST_CHRG_PSN_CD = new ArrayList();
		} else {
			l_creTsales_CUST_CHRG_PSN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTsales_CUST_CHRG_PSN_CD.add(((KU0030010Struct) list.get(i)).getcreTsales_CUST_CHRG_PSN_CD());
		}
		return size;
	}
	public int setL2L_creTsales_ODR_ACPT_PSN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTsales_ODR_ACPT_PSN_CD == null) {
			l_creTsales_ODR_ACPT_PSN_CD = new ArrayList();
		} else {
			l_creTsales_ODR_ACPT_PSN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTsales_ODR_ACPT_PSN_CD.add(((KU0030010Struct) list.get(i)).getcreTsales_ODR_ACPT_PSN_CD());
		}
		return size;
	}
	public int setL2L_creTsales_SALES_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTsales_SALES_QTY == null) {
			l_creTsales_SALES_QTY = new ArrayList();
		} else {
			l_creTsales_SALES_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTsales_SALES_QTY.add(((KU0030010Struct) list.get(i)).getcreTsales_SALES_QTY());
		}
		return size;
	}
	public int setL2L_creTsales_SALES_UNIT_PRICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTsales_SALES_UNIT_PRICE == null) {
			l_creTsales_SALES_UNIT_PRICE = new ArrayList();
		} else {
			l_creTsales_SALES_UNIT_PRICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTsales_SALES_UNIT_PRICE.add(((KU0030010Struct) list.get(i)).getcreTsales_SALES_UNIT_PRICE());
		}
		return size;
	}
	public int setL2L_creTsales_UNIT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTsales_UNIT_CD == null) {
			l_creTsales_UNIT_CD = new ArrayList();
		} else {
			l_creTsales_UNIT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTsales_UNIT_CD.add(((KU0030010Struct) list.get(i)).getcreTsales_UNIT_CD());
		}
		return size;
	}
	public int setL2L_creTsales_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTsales_SALES_AMOUNT == null) {
			l_creTsales_SALES_AMOUNT = new ArrayList();
		} else {
			l_creTsales_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTsales_SALES_AMOUNT.add(((KU0030010Struct) list.get(i)).getcreTsales_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_creTsales_SALES_AMOUNT_EXCH_RATES(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTsales_SALES_AMOUNT_EXCH_RATES == null) {
			l_creTsales_SALES_AMOUNT_EXCH_RATES = new ArrayList();
		} else {
			l_creTsales_SALES_AMOUNT_EXCH_RATES.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTsales_SALES_AMOUNT_EXCH_RATES.add(((KU0030010Struct) list.get(i)).getcreTsales_SALES_AMOUNT_EXCH_RATES());
		}
		return size;
	}
	public int setL2L_creTsales_INSPC_ACPT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTsales_INSPC_ACPT_DATE == null) {
			l_creTsales_INSPC_ACPT_DATE = new ArrayList();
		} else {
			l_creTsales_INSPC_ACPT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTsales_INSPC_ACPT_DATE.add(((KU0030010Struct) list.get(i)).getcreTsales_INSPC_ACPT_DATE());
		}
		return size;
	}
	public int setL2L_creTsales_INSPC_ACPT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTsales_INSPC_ACPT_QTY == null) {
			l_creTsales_INSPC_ACPT_QTY = new ArrayList();
		} else {
			l_creTsales_INSPC_ACPT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTsales_INSPC_ACPT_QTY.add(((KU0030010Struct) list.get(i)).getcreTsales_INSPC_ACPT_QTY());
		}
		return size;
	}
	public int setL2L_creTsales_EXTERNAL_TAX_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTsales_EXTERNAL_TAX_SALES_AMOUNT == null) {
			l_creTsales_EXTERNAL_TAX_SALES_AMOUNT = new ArrayList();
		} else {
			l_creTsales_EXTERNAL_TAX_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTsales_EXTERNAL_TAX_SALES_AMOUNT.add(((KU0030010Struct) list.get(i)).getcreTsales_EXTERNAL_TAX_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_creTsales_INTERNAL_TAX_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTsales_INTERNAL_TAX_SALES_AMOUNT == null) {
			l_creTsales_INTERNAL_TAX_SALES_AMOUNT = new ArrayList();
		} else {
			l_creTsales_INTERNAL_TAX_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTsales_INTERNAL_TAX_SALES_AMOUNT.add(((KU0030010Struct) list.get(i)).getcreTsales_INTERNAL_TAX_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_creTsales_TAXFREE_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTsales_TAXFREE_SALES_AMOUNT == null) {
			l_creTsales_TAXFREE_SALES_AMOUNT = new ArrayList();
		} else {
			l_creTsales_TAXFREE_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTsales_TAXFREE_SALES_AMOUNT.add(((KU0030010Struct) list.get(i)).getcreTsales_TAXFREE_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_creTsales_TAX_CREDIT_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTsales_TAX_CREDIT_SALES_AMOUNT == null) {
			l_creTsales_TAX_CREDIT_SALES_AMOUNT = new ArrayList();
		} else {
			l_creTsales_TAX_CREDIT_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTsales_TAX_CREDIT_SALES_AMOUNT.add(((KU0030010Struct) list.get(i)).getcreTsales_TAX_CREDIT_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_creTsales_EXTERNAL_TAX_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTsales_EXTERNAL_TAX_AMOUNT == null) {
			l_creTsales_EXTERNAL_TAX_AMOUNT = new ArrayList();
		} else {
			l_creTsales_EXTERNAL_TAX_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTsales_EXTERNAL_TAX_AMOUNT.add(((KU0030010Struct) list.get(i)).getcreTsales_EXTERNAL_TAX_AMOUNT());
		}
		return size;
	}
	public int setL2L_creTsales_INTERNAL_TAX_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTsales_INTERNAL_TAX_AMOUNT == null) {
			l_creTsales_INTERNAL_TAX_AMOUNT = new ArrayList();
		} else {
			l_creTsales_INTERNAL_TAX_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTsales_INTERNAL_TAX_AMOUNT.add(((KU0030010Struct) list.get(i)).getcreTsales_INTERNAL_TAX_AMOUNT());
		}
		return size;
	}
	public int setL2L_creTsales_TAX_AMOUNT_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTsales_TAX_AMOUNT_1 == null) {
			l_creTsales_TAX_AMOUNT_1 = new ArrayList();
		} else {
			l_creTsales_TAX_AMOUNT_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTsales_TAX_AMOUNT_1.add(((KU0030010Struct) list.get(i)).getcreTsales_TAX_AMOUNT_1());
		}
		return size;
	}
	public int setL2L_creTsales_TAX_AMOUNT_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTsales_TAX_AMOUNT_2 == null) {
			l_creTsales_TAX_AMOUNT_2 = new ArrayList();
		} else {
			l_creTsales_TAX_AMOUNT_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTsales_TAX_AMOUNT_2.add(((KU0030010Struct) list.get(i)).getcreTsales_TAX_AMOUNT_2());
		}
		return size;
	}
	public int setL2L_creTsales_TAX_AMOUNT_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTsales_TAX_AMOUNT_3 == null) {
			l_creTsales_TAX_AMOUNT_3 = new ArrayList();
		} else {
			l_creTsales_TAX_AMOUNT_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTsales_TAX_AMOUNT_3.add(((KU0030010Struct) list.get(i)).getcreTsales_TAX_AMOUNT_3());
		}
		return size;
	}
	public int setL2L_creTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT == null) {
			l_creTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT = new ArrayList();
		} else {
			l_creTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT.add(((KU0030010Struct) list.get(i)).getcreTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_creTsales_ORG_SLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTsales_ORG_SLIP_CD == null) {
			l_creTsales_ORG_SLIP_CD = new ArrayList();
		} else {
			l_creTsales_ORG_SLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTsales_ORG_SLIP_CD.add(((KU0030010Struct) list.get(i)).getcreTsales_ORG_SLIP_CD());
		}
		return size;
	}
	public int setL2L_creTsales_CURRNCY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTsales_CURRNCY_CD == null) {
			l_creTsales_CURRNCY_CD = new ArrayList();
		} else {
			l_creTsales_CURRNCY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTsales_CURRNCY_CD.add(((KU0030010Struct) list.get(i)).getcreTsales_CURRNCY_CD());
		}
		return size;
	}
	public int setL2L_creTsales_SPCL_PRICE_CO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTsales_SPCL_PRICE_CO == null) {
			l_creTsales_SPCL_PRICE_CO = new ArrayList();
		} else {
			l_creTsales_SPCL_PRICE_CO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTsales_SPCL_PRICE_CO.add(((KU0030010Struct) list.get(i)).getcreTsales_SPCL_PRICE_CO());
		}
		return size;
	}
	public int setL2L_creTsales_REMARKS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTsales_REMARKS == null) {
			l_creTsales_REMARKS = new ArrayList();
		} else {
			l_creTsales_REMARKS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTsales_REMARKS.add(((KU0030010Struct) list.get(i)).getcreTsales_REMARKS());
		}
		return size;
	}
	public int setL2L_creTsales_DEL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTsales_DEL_FLG == null) {
			l_creTsales_DEL_FLG = new ArrayList();
		} else {
			l_creTsales_DEL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTsales_DEL_FLG.add(((KU0030010Struct) list.get(i)).getcreTsales_DEL_FLG());
		}
		return size;
	}
	public int setL2L_creTsales_INSPC_ACPT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTsales_INSPC_ACPT_TYP == null) {
			l_creTsales_INSPC_ACPT_TYP = new ArrayList();
		} else {
			l_creTsales_INSPC_ACPT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTsales_INSPC_ACPT_TYP.add(((KU0030010Struct) list.get(i)).getcreTsales_INSPC_ACPT_TYP());
		}
		return size;
	}
	public int setL2L_creTsales_STATUS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTsales_STATUS == null) {
			l_creTsales_STATUS = new ArrayList();
		} else {
			l_creTsales_STATUS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTsales_STATUS.add(((KU0030010Struct) list.get(i)).getcreTsales_STATUS());
		}
		return size;
	}
	public int setL2L_creTsales_APPR_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTsales_APPR_FLG == null) {
			l_creTsales_APPR_FLG = new ArrayList();
		} else {
			l_creTsales_APPR_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTsales_APPR_FLG.add(((KU0030010Struct) list.get(i)).getcreTsales_APPR_FLG());
		}
		return size;
	}
	public int setL2L_creTsales_APPR_ID(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTsales_APPR_ID == null) {
			l_creTsales_APPR_ID = new ArrayList();
		} else {
			l_creTsales_APPR_ID.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTsales_APPR_ID.add(((KU0030010Struct) list.get(i)).getcreTsales_APPR_ID());
		}
		return size;
	}
	public int setL2L_creTsales_APPR_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTsales_APPR_DATE == null) {
			l_creTsales_APPR_DATE = new ArrayList();
		} else {
			l_creTsales_APPR_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTsales_APPR_DATE.add(((KU0030010Struct) list.get(i)).getcreTsales_APPR_DATE());
		}
		return size;
	}
	public int setL2L_creTsales_EXCH_RATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTsales_EXCH_RATE == null) {
			l_creTsales_EXCH_RATE = new ArrayList();
		} else {
			l_creTsales_EXCH_RATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTsales_EXCH_RATE.add(((KU0030010Struct) list.get(i)).getcreTsales_EXCH_RATE());
		}
		return size;
	}
	public int setL2L_serTsales_SALES_SEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTsales_SALES_SEQ_NO == null) {
			l_serTsales_SALES_SEQ_NO = new ArrayList();
		} else {
			l_serTsales_SALES_SEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTsales_SALES_SEQ_NO.add(((KU0030010Struct) list.get(i)).getserTsales_SALES_SEQ_NO());
		}
		return size;
	}
	public int setL2L_serTsales_SLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTsales_SLIP_CD == null) {
			l_serTsales_SLIP_CD = new ArrayList();
		} else {
			l_serTsales_SLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTsales_SLIP_CD.add(((KU0030010Struct) list.get(i)).getserTsales_SLIP_CD());
		}
		return size;
	}
	public int setL2L_serTsales_SALES_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTsales_SALES_TYP == null) {
			l_serTsales_SALES_TYP = new ArrayList();
		} else {
			l_serTsales_SALES_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTsales_SALES_TYP.add(((KU0030010Struct) list.get(i)).getserTsales_SALES_TYP());
		}
		return size;
	}
	public int setL2L_serTsales_CUST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTsales_CUST_CD == null) {
			l_serTsales_CUST_CD = new ArrayList();
		} else {
			l_serTsales_CUST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTsales_CUST_CD.add(((KU0030010Struct) list.get(i)).getserTsales_CUST_CD());
		}
		return size;
	}
	public int setL2L_serTsales_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTsales_ITEM_CD == null) {
			l_serTsales_ITEM_CD = new ArrayList();
		} else {
			l_serTsales_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTsales_ITEM_CD.add(((KU0030010Struct) list.get(i)).getserTsales_ITEM_CD());
		}
		return size;
	}
	public int setL2L_serTsales_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTsales_ITEM_NAME == null) {
			l_serTsales_ITEM_NAME = new ArrayList();
		} else {
			l_serTsales_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTsales_ITEM_NAME.add(((KU0030010Struct) list.get(i)).getserTsales_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_serTsales_CUST_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTsales_CUST_ODR_NO == null) {
			l_serTsales_CUST_ODR_NO = new ArrayList();
		} else {
			l_serTsales_CUST_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTsales_CUST_ODR_NO.add(((KU0030010Struct) list.get(i)).getserTsales_CUST_ODR_NO());
		}
		return size;
	}
	public int setL2L_serTsales_SALES_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTsales_SALES_DATE == null) {
			l_serTsales_SALES_DATE = new ArrayList();
		} else {
			l_serTsales_SALES_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTsales_SALES_DATE.add(((KU0030010Struct) list.get(i)).getserTsales_SALES_DATE());
		}
		return size;
	}
	public int setL2L_serTsales_SALES_DEPT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTsales_SALES_DEPT_CD == null) {
			l_serTsales_SALES_DEPT_CD = new ArrayList();
		} else {
			l_serTsales_SALES_DEPT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTsales_SALES_DEPT_CD.add(((KU0030010Struct) list.get(i)).getserTsales_SALES_DEPT_CD());
		}
		return size;
	}
	public int setL2L_serTsales_CUST_CHRG_PSN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTsales_CUST_CHRG_PSN_CD == null) {
			l_serTsales_CUST_CHRG_PSN_CD = new ArrayList();
		} else {
			l_serTsales_CUST_CHRG_PSN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTsales_CUST_CHRG_PSN_CD.add(((KU0030010Struct) list.get(i)).getserTsales_CUST_CHRG_PSN_CD());
		}
		return size;
	}
	public int setL2L_serTsales_ODR_ACPT_PSN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTsales_ODR_ACPT_PSN_CD == null) {
			l_serTsales_ODR_ACPT_PSN_CD = new ArrayList();
		} else {
			l_serTsales_ODR_ACPT_PSN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTsales_ODR_ACPT_PSN_CD.add(((KU0030010Struct) list.get(i)).getserTsales_ODR_ACPT_PSN_CD());
		}
		return size;
	}
	public int setL2L_serTsales_SALES_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTsales_SALES_QTY == null) {
			l_serTsales_SALES_QTY = new ArrayList();
		} else {
			l_serTsales_SALES_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTsales_SALES_QTY.add(((KU0030010Struct) list.get(i)).getserTsales_SALES_QTY());
		}
		return size;
	}
	public int setL2L_serTsales_SALES_UNIT_PRICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTsales_SALES_UNIT_PRICE == null) {
			l_serTsales_SALES_UNIT_PRICE = new ArrayList();
		} else {
			l_serTsales_SALES_UNIT_PRICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTsales_SALES_UNIT_PRICE.add(((KU0030010Struct) list.get(i)).getserTsales_SALES_UNIT_PRICE());
		}
		return size;
	}
	public int setL2L_serTsales_UNIT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTsales_UNIT_CD == null) {
			l_serTsales_UNIT_CD = new ArrayList();
		} else {
			l_serTsales_UNIT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTsales_UNIT_CD.add(((KU0030010Struct) list.get(i)).getserTsales_UNIT_CD());
		}
		return size;
	}
	public int setL2L_serTsales_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTsales_SALES_AMOUNT == null) {
			l_serTsales_SALES_AMOUNT = new ArrayList();
		} else {
			l_serTsales_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTsales_SALES_AMOUNT.add(((KU0030010Struct) list.get(i)).getserTsales_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_serTsales_SALES_AMOUNT_EXCH_RATES(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTsales_SALES_AMOUNT_EXCH_RATES == null) {
			l_serTsales_SALES_AMOUNT_EXCH_RATES = new ArrayList();
		} else {
			l_serTsales_SALES_AMOUNT_EXCH_RATES.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTsales_SALES_AMOUNT_EXCH_RATES.add(((KU0030010Struct) list.get(i)).getserTsales_SALES_AMOUNT_EXCH_RATES());
		}
		return size;
	}
	public int setL2L_serTsales_EXTERNAL_TAX_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTsales_EXTERNAL_TAX_SALES_AMOUNT == null) {
			l_serTsales_EXTERNAL_TAX_SALES_AMOUNT = new ArrayList();
		} else {
			l_serTsales_EXTERNAL_TAX_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTsales_EXTERNAL_TAX_SALES_AMOUNT.add(((KU0030010Struct) list.get(i)).getserTsales_EXTERNAL_TAX_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_serTsales_INTERNAL_TAX_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTsales_INTERNAL_TAX_SALES_AMOUNT == null) {
			l_serTsales_INTERNAL_TAX_SALES_AMOUNT = new ArrayList();
		} else {
			l_serTsales_INTERNAL_TAX_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTsales_INTERNAL_TAX_SALES_AMOUNT.add(((KU0030010Struct) list.get(i)).getserTsales_INTERNAL_TAX_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_serTsales_TAXFREE_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTsales_TAXFREE_SALES_AMOUNT == null) {
			l_serTsales_TAXFREE_SALES_AMOUNT = new ArrayList();
		} else {
			l_serTsales_TAXFREE_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTsales_TAXFREE_SALES_AMOUNT.add(((KU0030010Struct) list.get(i)).getserTsales_TAXFREE_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_serTsales_TAX_CREDIT_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTsales_TAX_CREDIT_SALES_AMOUNT == null) {
			l_serTsales_TAX_CREDIT_SALES_AMOUNT = new ArrayList();
		} else {
			l_serTsales_TAX_CREDIT_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTsales_TAX_CREDIT_SALES_AMOUNT.add(((KU0030010Struct) list.get(i)).getserTsales_TAX_CREDIT_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_serTsales_EXTERNAL_TAX_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTsales_EXTERNAL_TAX_AMOUNT == null) {
			l_serTsales_EXTERNAL_TAX_AMOUNT = new ArrayList();
		} else {
			l_serTsales_EXTERNAL_TAX_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTsales_EXTERNAL_TAX_AMOUNT.add(((KU0030010Struct) list.get(i)).getserTsales_EXTERNAL_TAX_AMOUNT());
		}
		return size;
	}
	public int setL2L_serTsales_INTERNAL_TAX_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTsales_INTERNAL_TAX_AMOUNT == null) {
			l_serTsales_INTERNAL_TAX_AMOUNT = new ArrayList();
		} else {
			l_serTsales_INTERNAL_TAX_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTsales_INTERNAL_TAX_AMOUNT.add(((KU0030010Struct) list.get(i)).getserTsales_INTERNAL_TAX_AMOUNT());
		}
		return size;
	}
	public int setL2L_serTsales_TAX_AMOUNT_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTsales_TAX_AMOUNT_1 == null) {
			l_serTsales_TAX_AMOUNT_1 = new ArrayList();
		} else {
			l_serTsales_TAX_AMOUNT_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTsales_TAX_AMOUNT_1.add(((KU0030010Struct) list.get(i)).getserTsales_TAX_AMOUNT_1());
		}
		return size;
	}
	public int setL2L_serTsales_TAX_AMOUNT_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTsales_TAX_AMOUNT_2 == null) {
			l_serTsales_TAX_AMOUNT_2 = new ArrayList();
		} else {
			l_serTsales_TAX_AMOUNT_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTsales_TAX_AMOUNT_2.add(((KU0030010Struct) list.get(i)).getserTsales_TAX_AMOUNT_2());
		}
		return size;
	}
	public int setL2L_serTsales_TAX_AMOUNT_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTsales_TAX_AMOUNT_3 == null) {
			l_serTsales_TAX_AMOUNT_3 = new ArrayList();
		} else {
			l_serTsales_TAX_AMOUNT_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTsales_TAX_AMOUNT_3.add(((KU0030010Struct) list.get(i)).getserTsales_TAX_AMOUNT_3());
		}
		return size;
	}
	public int setL2L_serTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT == null) {
			l_serTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT = new ArrayList();
		} else {
			l_serTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT.add(((KU0030010Struct) list.get(i)).getserTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_serTsales_ORG_SLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTsales_ORG_SLIP_CD == null) {
			l_serTsales_ORG_SLIP_CD = new ArrayList();
		} else {
			l_serTsales_ORG_SLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTsales_ORG_SLIP_CD.add(((KU0030010Struct) list.get(i)).getserTsales_ORG_SLIP_CD());
		}
		return size;
	}
	public int setL2L_serTsales_CURRNCY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTsales_CURRNCY_CD == null) {
			l_serTsales_CURRNCY_CD = new ArrayList();
		} else {
			l_serTsales_CURRNCY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTsales_CURRNCY_CD.add(((KU0030010Struct) list.get(i)).getserTsales_CURRNCY_CD());
		}
		return size;
	}
	public int setL2L_serTsales_SPCL_PRICE_CO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTsales_SPCL_PRICE_CO == null) {
			l_serTsales_SPCL_PRICE_CO = new ArrayList();
		} else {
			l_serTsales_SPCL_PRICE_CO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTsales_SPCL_PRICE_CO.add(((KU0030010Struct) list.get(i)).getserTsales_SPCL_PRICE_CO());
		}
		return size;
	}
	public int setL2L_serTsales_REMARKS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTsales_REMARKS == null) {
			l_serTsales_REMARKS = new ArrayList();
		} else {
			l_serTsales_REMARKS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTsales_REMARKS.add(((KU0030010Struct) list.get(i)).getserTsales_REMARKS());
		}
		return size;
	}
	public int setL2L_serTsales_DEL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTsales_DEL_FLG == null) {
			l_serTsales_DEL_FLG = new ArrayList();
		} else {
			l_serTsales_DEL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTsales_DEL_FLG.add(((KU0030010Struct) list.get(i)).getserTsales_DEL_FLG());
		}
		return size;
	}
	public int setL2L_serTsales_INSPC_ACPT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTsales_INSPC_ACPT_TYP == null) {
			l_serTsales_INSPC_ACPT_TYP = new ArrayList();
		} else {
			l_serTsales_INSPC_ACPT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTsales_INSPC_ACPT_TYP.add(((KU0030010Struct) list.get(i)).getserTsales_INSPC_ACPT_TYP());
		}
		return size;
	}
	public int setL2L_serTsales_STATUS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTsales_STATUS == null) {
			l_serTsales_STATUS = new ArrayList();
		} else {
			l_serTsales_STATUS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTsales_STATUS.add(((KU0030010Struct) list.get(i)).getserTsales_STATUS());
		}
		return size;
	}
	public int setL2L_serTsales_PRD_ODR_PLACE_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTsales_PRD_ODR_PLACE_CD == null) {
			l_serTsales_PRD_ODR_PLACE_CD = new ArrayList();
		} else {
			l_serTsales_PRD_ODR_PLACE_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTsales_PRD_ODR_PLACE_CD.add(((KU0030010Struct) list.get(i)).getserTsales_PRD_ODR_PLACE_CD());
		}
		return size;
	}
	public int setL2L_serTsales_EXCH_RATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTsales_EXCH_RATE == null) {
			l_serTsales_EXCH_RATE = new ArrayList();
		} else {
			l_serTsales_EXCH_RATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTsales_EXCH_RATE.add(((KU0030010Struct) list.get(i)).getserTsales_EXCH_RATE());
		}
		return size;
	}
	public int setL2L_serTsales_IN_SLIPCD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTsales_IN_SLIPCD == null) {
			l_serTsales_IN_SLIPCD = new ArrayList();
		} else {
			l_serTsales_IN_SLIPCD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTsales_IN_SLIPCD.add(((KU0030010Struct) list.get(i)).getserTsales_IN_SLIPCD());
		}
		return size;
	}
	public int setL2L_updTsales_APPR_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_updTsales_APPR_FLG == null) {
			l_updTsales_APPR_FLG = new ArrayList();
		} else {
			l_updTsales_APPR_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_updTsales_APPR_FLG.add(((KU0030010Struct) list.get(i)).getupdTsales_APPR_FLG());
		}
		return size;
	}
	public int setL2L_updTsales_APPR_ID(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_updTsales_APPR_ID == null) {
			l_updTsales_APPR_ID = new ArrayList();
		} else {
			l_updTsales_APPR_ID.clear();
		}
		for (int i = 0; i < size; i++) {
			l_updTsales_APPR_ID.add(((KU0030010Struct) list.get(i)).getupdTsales_APPR_ID());
		}
		return size;
	}
	public int setL2L_updTsales_APPR_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_updTsales_APPR_DATE == null) {
			l_updTsales_APPR_DATE = new ArrayList();
		} else {
			l_updTsales_APPR_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_updTsales_APPR_DATE.add(((KU0030010Struct) list.get(i)).getupdTsales_APPR_DATE());
		}
		return size;
	}
	public int setL2L_updTsales_SALES_SEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_updTsales_SALES_SEQ_NO == null) {
			l_updTsales_SALES_SEQ_NO = new ArrayList();
		} else {
			l_updTsales_SALES_SEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_updTsales_SALES_SEQ_NO.add(((KU0030010Struct) list.get(i)).getupdTsales_SALES_SEQ_NO());
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
			l_mItem_ITEM_CD.add(((KU0030010Struct) list.get(i)).getmItem_ITEM_CD());
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
			l_mItem_ITEM_NAME.add(((KU0030010Struct) list.get(i)).getmItem_ITEM_NAME());
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
			l_mItem_PRODUCT_TYP.add(((KU0030010Struct) list.get(i)).getmItem_PRODUCT_TYP());
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
			l_mItem_MRP_ODR_TYP.add(((KU0030010Struct) list.get(i)).getmItem_MRP_ODR_TYP());
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
			l_mItem_DRAW_CD.add(((KU0030010Struct) list.get(i)).getmItem_DRAW_CD());
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
			l_mItem_SPEC.add(((KU0030010Struct) list.get(i)).getmItem_SPEC());
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
			l_mItem_HIGH_LEVEL_NO.add(((KU0030010Struct) list.get(i)).getmItem_HIGH_LEVEL_NO());
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
			l_mItem_OUTSIDE_TYP.add(((KU0030010Struct) list.get(i)).getmItem_OUTSIDE_TYP());
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
			l_mItem_STOCK_UNIT_FLG.add(((KU0030010Struct) list.get(i)).getmItem_STOCK_UNIT_FLG());
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
			l_mItem_STOCK_UNIT.add(((KU0030010Struct) list.get(i)).getmItem_STOCK_UNIT());
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
			l_mItem_PKG_UNIT.add(((KU0030010Struct) list.get(i)).getmItem_PKG_UNIT());
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
			l_mItem_PKG_UNIT_QTY.add(((KU0030010Struct) list.get(i)).getmItem_PKG_UNIT_QTY());
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
			l_mItem_UNIT_QTY_TYP.add(((KU0030010Struct) list.get(i)).getmItem_UNIT_QTY_TYP());
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
			l_mItem_ODR_LT.add(((KU0030010Struct) list.get(i)).getmItem_ODR_LT());
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
			l_mItem_FIXED_LT.add(((KU0030010Struct) list.get(i)).getmItem_FIXED_LT());
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
			l_mItem_PROP_LT.add(((KU0030010Struct) list.get(i)).getmItem_PROP_LT());
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
			l_mItem_SAFETY_LT.add(((KU0030010Struct) list.get(i)).getmItem_SAFETY_LT());
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
			l_mItem_ISSUE_LT.add(((KU0030010Struct) list.get(i)).getmItem_ISSUE_LT());
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
			l_mItem_PROP_LOT_SIZE.add(((KU0030010Struct) list.get(i)).getmItem_PROP_LOT_SIZE());
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
			l_mItem_ITEM_SPOIL.add(((KU0030010Struct) list.get(i)).getmItem_ITEM_SPOIL());
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
			l_mItem_SAFETY_STOCK.add(((KU0030010Struct) list.get(i)).getmItem_SAFETY_STOCK());
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
			l_mItem_LOT_SIZING_TYP.add(((KU0030010Struct) list.get(i)).getmItem_LOT_SIZING_TYP());
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
			l_mItem_MAX_PERIOD.add(((KU0030010Struct) list.get(i)).getmItem_MAX_PERIOD());
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
			l_mItem_MAX_ODR_QTY.add(((KU0030010Struct) list.get(i)).getmItem_MAX_ODR_QTY());
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
			l_mItem_ODR_POINT.add(((KU0030010Struct) list.get(i)).getmItem_ODR_POINT());
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
			l_mItem_FIXED_ODR_QTY.add(((KU0030010Struct) list.get(i)).getmItem_FIXED_ODR_QTY());
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
			l_mItem_MIN_ODR_QTY.add(((KU0030010Struct) list.get(i)).getmItem_MIN_ODR_QTY());
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
			l_mItem_MUL_ODR_QTY.add(((KU0030010Struct) list.get(i)).getmItem_MUL_ODR_QTY());
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
			l_mItem_ISSUE_TYP.add(((KU0030010Struct) list.get(i)).getmItem_ISSUE_TYP());
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
			l_mItem_MPS_FLG.add(((KU0030010Struct) list.get(i)).getmItem_MPS_FLG());
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
			l_mItem_ACPT_INSPC_TYP.add(((KU0030010Struct) list.get(i)).getmItem_ACPT_INSPC_TYP());
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
			l_mItem_CLASIFICATION_CD.add(((KU0030010Struct) list.get(i)).getmItem_CLASIFICATION_CD());
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
			l_mItem_UNIT_WEIGHT.add(((KU0030010Struct) list.get(i)).getmItem_UNIT_WEIGHT());
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
			l_mItem_ABC_TYP.add(((KU0030010Struct) list.get(i)).getmItem_ABC_TYP());
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
			l_mItem_OPR_RSLT_TYP.add(((KU0030010Struct) list.get(i)).getmItem_OPR_RSLT_TYP());
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
			l_mItem_SPL_ITEM_TYP.add(((KU0030010Struct) list.get(i)).getmItem_SPL_ITEM_TYP());
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
			l_mItem_TAX_CD.add(((KU0030010Struct) list.get(i)).getmItem_TAX_CD());
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
			l_mItem_IN_ITEMCD.add(((KU0030010Struct) list.get(i)).getmItem_IN_ITEMCD());
		}
		return size;
	}
	public int setL2L_mItemSpec_CUST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mItemSpec_CUST_CD == null) {
			l_mItemSpec_CUST_CD = new ArrayList();
		} else {
			l_mItemSpec_CUST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mItemSpec_CUST_CD.add(((KU0030010Struct) list.get(i)).getmItemSpec_CUST_CD());
		}
		return size;
	}
	public int setL2L_mItemSpec_CUST_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mItemSpec_CUST_ITEM_CD == null) {
			l_mItemSpec_CUST_ITEM_CD = new ArrayList();
		} else {
			l_mItemSpec_CUST_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mItemSpec_CUST_ITEM_CD.add(((KU0030010Struct) list.get(i)).getmItemSpec_CUST_ITEM_CD());
		}
		return size;
	}
	public int setL2L_mItemSpec_COMPANY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mItemSpec_COMPANY_CD == null) {
			l_mItemSpec_COMPANY_CD = new ArrayList();
		} else {
			l_mItemSpec_COMPANY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mItemSpec_COMPANY_CD.add(((KU0030010Struct) list.get(i)).getmItemSpec_COMPANY_CD());
		}
		return size;
	}
	public int setL2L_mItemSpec_SALES_DEPT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mItemSpec_SALES_DEPT_CD == null) {
			l_mItemSpec_SALES_DEPT_CD = new ArrayList();
		} else {
			l_mItemSpec_SALES_DEPT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mItemSpec_SALES_DEPT_CD.add(((KU0030010Struct) list.get(i)).getmItemSpec_SALES_DEPT_CD());
		}
		return size;
	}
	public int setL2L_mItemSpec_CUST_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mItemSpec_CUST_ITEM_NAME == null) {
			l_mItemSpec_CUST_ITEM_NAME = new ArrayList();
		} else {
			l_mItemSpec_CUST_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mItemSpec_CUST_ITEM_NAME.add(((KU0030010Struct) list.get(i)).getmItemSpec_CUST_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_mItemSpec_IN_CUST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mItemSpec_IN_CUST_CD == null) {
			l_mItemSpec_IN_CUST_CD = new ArrayList();
		} else {
			l_mItemSpec_IN_CUST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mItemSpec_IN_CUST_CD.add(((KU0030010Struct) list.get(i)).getmItemSpec_IN_CUST_CD());
		}
		return size;
	}
	public int setL2L_mItemSpec_IN_CUST_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mItemSpec_IN_CUST_ITEM_CD == null) {
			l_mItemSpec_IN_CUST_ITEM_CD = new ArrayList();
		} else {
			l_mItemSpec_IN_CUST_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mItemSpec_IN_CUST_ITEM_CD.add(((KU0030010Struct) list.get(i)).getmItemSpec_IN_CUST_ITEM_CD());
		}
		return size;
	}
	public int setL2L_mItemSpec_IN_COMPANY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mItemSpec_IN_COMPANY_CD == null) {
			l_mItemSpec_IN_COMPANY_CD = new ArrayList();
		} else {
			l_mItemSpec_IN_COMPANY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mItemSpec_IN_COMPANY_CD.add(((KU0030010Struct) list.get(i)).getmItemSpec_IN_COMPANY_CD());
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
			l_tOdr_ODR_NO.add(((KU0030010Struct) list.get(i)).gettOdr_ODR_NO());
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
			l_tOdr_ODR_TYP.add(((KU0030010Struct) list.get(i)).gettOdr_ODR_TYP());
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
			l_tOdr_ODR_CTL_NO.add(((KU0030010Struct) list.get(i)).gettOdr_ODR_CTL_NO());
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
			l_tOdr_CUST_ODR_NO.add(((KU0030010Struct) list.get(i)).gettOdr_CUST_ODR_NO());
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
			l_tOdr_CUST_CHRG_ORG_CD.add(((KU0030010Struct) list.get(i)).gettOdr_CUST_CHRG_ORG_CD());
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
			l_tOdr_CUST_CHRG_PSN_CD.add(((KU0030010Struct) list.get(i)).gettOdr_CUST_CHRG_PSN_CD());
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
			l_tOdr_ODR_ACPT_ORG_CD.add(((KU0030010Struct) list.get(i)).gettOdr_ODR_ACPT_ORG_CD());
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
			l_tOdr_ODR_ACPT_PSN_CD.add(((KU0030010Struct) list.get(i)).gettOdr_ODR_ACPT_PSN_CD());
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
			l_tOdr_CURRNCY_CD.add(((KU0030010Struct) list.get(i)).gettOdr_CURRNCY_CD());
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
			l_tOdr_EXCH_TYP.add(((KU0030010Struct) list.get(i)).gettOdr_EXCH_TYP());
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
			l_tOdr_DLV_LOC_CD.add(((KU0030010Struct) list.get(i)).gettOdr_DLV_LOC_CD());
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
			l_tOdr_DLV_LOC_CD_EIAJ.add(((KU0030010Struct) list.get(i)).gettOdr_DLV_LOC_CD_EIAJ());
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
			l_tOdr_DLV_LOC_NAME.add(((KU0030010Struct) list.get(i)).gettOdr_DLV_LOC_NAME());
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
			l_tOdr_DLV_LOC_NAME_KANJI.add(((KU0030010Struct) list.get(i)).gettOdr_DLV_LOC_NAME_KANJI());
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
			l_tOdr_PRD_ODR_PLACE_CD.add(((KU0030010Struct) list.get(i)).gettOdr_PRD_ODR_PLACE_CD());
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
			l_tOdr_ODR_UNIT_PRICE.add(((KU0030010Struct) list.get(i)).gettOdr_ODR_UNIT_PRICE());
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
			l_tOdr_SPCL_PRICE_TYP.add(((KU0030010Struct) list.get(i)).gettOdr_SPCL_PRICE_TYP());
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
			l_tOdr_PART_DLV_COUNT.add(((KU0030010Struct) list.get(i)).gettOdr_PART_DLV_COUNT());
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
			l_tOdr_DEPO_TYP.add(((KU0030010Struct) list.get(i)).gettOdr_DEPO_TYP());
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
			l_tOdr_DESINATED_DLV_DATE.add(((KU0030010Struct) list.get(i)).gettOdr_DESINATED_DLV_DATE());
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
			l_tOdr_STD_DESINATED_RCV_DATE.add(((KU0030010Struct) list.get(i)).gettOdr_STD_DESINATED_RCV_DATE());
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
			l_tOdr_ODR_QTY.add(((KU0030010Struct) list.get(i)).gettOdr_ODR_QTY());
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
			l_tOdr_REMAIN_UNCONFIRM_ODR_QTY.add(((KU0030010Struct) list.get(i)).gettOdr_REMAIN_UNCONFIRM_ODR_QTY());
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
			l_tOdr_CANCELED_UNCONFIRM_ODR_QTY.add(((KU0030010Struct) list.get(i)).gettOdr_CANCELED_UNCONFIRM_ODR_QTY());
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
			l_tOdr_UNIT_CD.add(((KU0030010Struct) list.get(i)).gettOdr_UNIT_CD());
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
			l_tOdr_UNCONFIRM_ODR_BALANCE.add(((KU0030010Struct) list.get(i)).gettOdr_UNCONFIRM_ODR_BALANCE());
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
			l_tOdr_ODR_AMOUNT.add(((KU0030010Struct) list.get(i)).gettOdr_ODR_AMOUNT());
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
			l_tOdr_ODR_AMOUNT_EXCH_RATES.add(((KU0030010Struct) list.get(i)).gettOdr_ODR_AMOUNT_EXCH_RATES());
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
			l_tOdr_TOTAL_SHIP_QTY.add(((KU0030010Struct) list.get(i)).gettOdr_TOTAL_SHIP_QTY());
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
			l_tOdr_SHIP_AMOUNT.add(((KU0030010Struct) list.get(i)).gettOdr_SHIP_AMOUNT());
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
			l_tOdr_SHIP_AMOUNT_EXCH_RATES.add(((KU0030010Struct) list.get(i)).gettOdr_SHIP_AMOUNT_EXCH_RATES());
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
			l_tOdr_RETURN_PRICE.add(((KU0030010Struct) list.get(i)).gettOdr_RETURN_PRICE());
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
			l_tOdr_RETURN_QTY.add(((KU0030010Struct) list.get(i)).gettOdr_RETURN_QTY());
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
			l_tOdr_RETURN_AMOUNT.add(((KU0030010Struct) list.get(i)).gettOdr_RETURN_AMOUNT());
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
			l_tOdr_RETURN_AMOUNT_EXCH_RATES.add(((KU0030010Struct) list.get(i)).gettOdr_RETURN_AMOUNT_EXCH_RATES());
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
			l_tOdr_ODR_CMPLT_FLG.add(((KU0030010Struct) list.get(i)).gettOdr_ODR_CMPLT_FLG());
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
			l_tOdr_ODR_CMPLT_DATE.add(((KU0030010Struct) list.get(i)).gettOdr_ODR_CMPLT_DATE());
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
			l_tOdr_CUS_DLV_CD.add(((KU0030010Struct) list.get(i)).gettOdr_CUS_DLV_CD());
		}
		return size;
	}
	public int setL2L_tOdr_DLV_KEY_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_DLV_KEY_NO == null) {
			l_tOdr_DLV_KEY_NO = new ArrayList();
		} else {
			l_tOdr_DLV_KEY_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_DLV_KEY_NO.add(((KU0030010Struct) list.get(i)).gettOdr_DLV_KEY_NO());
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
			l_tOdr_PART_NAME.add(((KU0030010Struct) list.get(i)).gettOdr_PART_NAME());
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
			l_tOdr_PKG_UNIT.add(((KU0030010Struct) list.get(i)).gettOdr_PKG_UNIT());
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
			l_tOdr_SLIP_PRICE_PRINT_TYP.add(((KU0030010Struct) list.get(i)).gettOdr_SLIP_PRICE_PRINT_TYP());
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
			l_tOdr_INSPC_TYP.add(((KU0030010Struct) list.get(i)).gettOdr_INSPC_TYP());
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
			l_tOdr_CLIENT_REMARK.add(((KU0030010Struct) list.get(i)).gettOdr_CLIENT_REMARK());
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
			l_tOdr_CLIENT_REMARK_KANJI.add(((KU0030010Struct) list.get(i)).gettOdr_CLIENT_REMARK_KANJI());
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
			l_tOdr_CLIENT_BARCODE_INF.add(((KU0030010Struct) list.get(i)).gettOdr_CLIENT_BARCODE_INF());
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
			l_tOdr_TRANSPORT_CD.add(((KU0030010Struct) list.get(i)).gettOdr_TRANSPORT_CD());
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
			l_tOdr_TRANSPORT_TYP.add(((KU0030010Struct) list.get(i)).gettOdr_TRANSPORT_TYP());
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
			l_tOdr_TAX_APPLY_TYP.add(((KU0030010Struct) list.get(i)).gettOdr_TAX_APPLY_TYP());
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
			l_tOdr_TAX_CD.add(((KU0030010Struct) list.get(i)).gettOdr_TAX_CD());
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
			l_tOdr_TAX_CALC_TYP.add(((KU0030010Struct) list.get(i)).gettOdr_TAX_CALC_TYP());
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
			l_tOdr_REMARKS.add(((KU0030010Struct) list.get(i)).gettOdr_REMARKS());
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
			l_tOdr_ODR_ACPT_DATE.add(((KU0030010Struct) list.get(i)).gettOdr_ODR_ACPT_DATE());
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
			l_tOdr_SHIP_PLAN_REMAIN_QTY.add(((KU0030010Struct) list.get(i)).gettOdr_SHIP_PLAN_REMAIN_QTY());
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
			l_tOdr_SHIP_PLAN_CMPLT_FLG.add(((KU0030010Struct) list.get(i)).gettOdr_SHIP_PLAN_CMPLT_FLG());
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
			l_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG.add(((KU0030010Struct) list.get(i)).gettOdr_UNCONFIRMED_ODR_EFF_OVR_FLG());
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
			l_tOdr_PARTIAL_SHIP_INST_FLG.add(((KU0030010Struct) list.get(i)).gettOdr_PARTIAL_SHIP_INST_FLG());
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
			l_tOdr_IF_CTL_NO.add(((KU0030010Struct) list.get(i)).gettOdr_IF_CTL_NO());
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
			l_tOdr_ENTRY_TYP.add(((KU0030010Struct) list.get(i)).gettOdr_ENTRY_TYP());
		}
		return size;
	}
	public int setL2L_tOdr_DEL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_DEL_FLG == null) {
			l_tOdr_DEL_FLG = new ArrayList();
		} else {
			l_tOdr_DEL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_DEL_FLG.add(((KU0030010Struct) list.get(i)).gettOdr_DEL_FLG());
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
			l_tOdr_SHIP_CNT.add(((KU0030010Struct) list.get(i)).gettOdr_SHIP_CNT());
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
			l_tOdr_UNIT_CD_ORG.add(((KU0030010Struct) list.get(i)).gettOdr_UNIT_CD_ORG());
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
			l_tOdrCtl_CUST_ITEM_CD.add(((KU0030010Struct) list.get(i)).gettOdrCtl_CUST_ITEM_CD());
		}
		return size;
	}
	public int setL2L_tOdr_COCK_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_COCK_TYP == null) {
			l_tOdr_COCK_TYP = new ArrayList();
		} else {
			l_tOdr_COCK_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_COCK_TYP.add(((KU0030010Struct) list.get(i)).gettOdr_COCK_TYP());
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
			l_tOdr_PUCH_ODR_QTY_TOTAL.add(((KU0030010Struct) list.get(i)).gettOdr_PUCH_ODR_QTY_TOTAL());
		}
		return size;
	}
	public int setL2L_tOdr_BUYER_ORG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_BUYER_ORG_CD == null) {
			l_tOdr_BUYER_ORG_CD = new ArrayList();
		} else {
			l_tOdr_BUYER_ORG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_BUYER_ORG_CD.add(((KU0030010Struct) list.get(i)).gettOdr_BUYER_ORG_CD());
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
			l_tOdr_BUYER_NAME.add(((KU0030010Struct) list.get(i)).gettOdr_BUYER_NAME());
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
			l_tOdr_IN_ODRNO.add(((KU0030010Struct) list.get(i)).gettOdr_IN_ODRNO());
		}
		return size;
	}
	public int setL2L_creTodrODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTodrODR_NO == null) {
			l_creTodrODR_NO = new ArrayList();
		} else {
			l_creTodrODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTodrODR_NO.add(((KU0030010Struct) list.get(i)).getcreTodrODR_NO());
		}
		return size;
	}
	public int setL2L_creTodrODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTodrODR_TYP == null) {
			l_creTodrODR_TYP = new ArrayList();
		} else {
			l_creTodrODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTodrODR_TYP.add(((KU0030010Struct) list.get(i)).getcreTodrODR_TYP());
		}
		return size;
	}
	public int setL2L_creTodrODR_CTL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTodrODR_CTL_NO == null) {
			l_creTodrODR_CTL_NO = new ArrayList();
		} else {
			l_creTodrODR_CTL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTodrODR_CTL_NO.add(((KU0030010Struct) list.get(i)).getcreTodrODR_CTL_NO());
		}
		return size;
	}
	public int setL2L_creTodrCUST_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTodrCUST_ODR_NO == null) {
			l_creTodrCUST_ODR_NO = new ArrayList();
		} else {
			l_creTodrCUST_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTodrCUST_ODR_NO.add(((KU0030010Struct) list.get(i)).getcreTodrCUST_ODR_NO());
		}
		return size;
	}
	public int setL2L_creTodrCUST_CHRG_ORG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTodrCUST_CHRG_ORG_CD == null) {
			l_creTodrCUST_CHRG_ORG_CD = new ArrayList();
		} else {
			l_creTodrCUST_CHRG_ORG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTodrCUST_CHRG_ORG_CD.add(((KU0030010Struct) list.get(i)).getcreTodrCUST_CHRG_ORG_CD());
		}
		return size;
	}
	public int setL2L_creTodrCUST_CHRG_PSN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTodrCUST_CHRG_PSN_CD == null) {
			l_creTodrCUST_CHRG_PSN_CD = new ArrayList();
		} else {
			l_creTodrCUST_CHRG_PSN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTodrCUST_CHRG_PSN_CD.add(((KU0030010Struct) list.get(i)).getcreTodrCUST_CHRG_PSN_CD());
		}
		return size;
	}
	public int setL2L_creTodrODR_ACPT_ORG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTodrODR_ACPT_ORG_CD == null) {
			l_creTodrODR_ACPT_ORG_CD = new ArrayList();
		} else {
			l_creTodrODR_ACPT_ORG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTodrODR_ACPT_ORG_CD.add(((KU0030010Struct) list.get(i)).getcreTodrODR_ACPT_ORG_CD());
		}
		return size;
	}
	public int setL2L_creTodrODR_ACPT_PSN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTodrODR_ACPT_PSN_CD == null) {
			l_creTodrODR_ACPT_PSN_CD = new ArrayList();
		} else {
			l_creTodrODR_ACPT_PSN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTodrODR_ACPT_PSN_CD.add(((KU0030010Struct) list.get(i)).getcreTodrODR_ACPT_PSN_CD());
		}
		return size;
	}
	public int setL2L_creTodrCURRNCY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTodrCURRNCY_CD == null) {
			l_creTodrCURRNCY_CD = new ArrayList();
		} else {
			l_creTodrCURRNCY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTodrCURRNCY_CD.add(((KU0030010Struct) list.get(i)).getcreTodrCURRNCY_CD());
		}
		return size;
	}
	public int setL2L_creTodrEXCH_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTodrEXCH_TYP == null) {
			l_creTodrEXCH_TYP = new ArrayList();
		} else {
			l_creTodrEXCH_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTodrEXCH_TYP.add(((KU0030010Struct) list.get(i)).getcreTodrEXCH_TYP());
		}
		return size;
	}
	public int setL2L_creTodrDLV_LOC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTodrDLV_LOC_CD == null) {
			l_creTodrDLV_LOC_CD = new ArrayList();
		} else {
			l_creTodrDLV_LOC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTodrDLV_LOC_CD.add(((KU0030010Struct) list.get(i)).getcreTodrDLV_LOC_CD());
		}
		return size;
	}
	public int setL2L_creTodrDLV_LOC_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTodrDLV_LOC_NAME == null) {
			l_creTodrDLV_LOC_NAME = new ArrayList();
		} else {
			l_creTodrDLV_LOC_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTodrDLV_LOC_NAME.add(((KU0030010Struct) list.get(i)).getcreTodrDLV_LOC_NAME());
		}
		return size;
	}
	public int setL2L_creTodrDLV_LOC_NAME_KANJI(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTodrDLV_LOC_NAME_KANJI == null) {
			l_creTodrDLV_LOC_NAME_KANJI = new ArrayList();
		} else {
			l_creTodrDLV_LOC_NAME_KANJI.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTodrDLV_LOC_NAME_KANJI.add(((KU0030010Struct) list.get(i)).getcreTodrDLV_LOC_NAME_KANJI());
		}
		return size;
	}
	public int setL2L_creTodrPRD_ODR_PLACE_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTodrPRD_ODR_PLACE_CD == null) {
			l_creTodrPRD_ODR_PLACE_CD = new ArrayList();
		} else {
			l_creTodrPRD_ODR_PLACE_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTodrPRD_ODR_PLACE_CD.add(((KU0030010Struct) list.get(i)).getcreTodrPRD_ODR_PLACE_CD());
		}
		return size;
	}
	public int setL2L_creTodrODR_UNIT_PRICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTodrODR_UNIT_PRICE == null) {
			l_creTodrODR_UNIT_PRICE = new ArrayList();
		} else {
			l_creTodrODR_UNIT_PRICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTodrODR_UNIT_PRICE.add(((KU0030010Struct) list.get(i)).getcreTodrODR_UNIT_PRICE());
		}
		return size;
	}
	public int setL2L_creTodrPART_DLV_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTodrPART_DLV_COUNT == null) {
			l_creTodrPART_DLV_COUNT = new ArrayList();
		} else {
			l_creTodrPART_DLV_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTodrPART_DLV_COUNT.add(((KU0030010Struct) list.get(i)).getcreTodrPART_DLV_COUNT());
		}
		return size;
	}
	public int setL2L_creTodrDEPO_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTodrDEPO_TYP == null) {
			l_creTodrDEPO_TYP = new ArrayList();
		} else {
			l_creTodrDEPO_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTodrDEPO_TYP.add(((KU0030010Struct) list.get(i)).getcreTodrDEPO_TYP());
		}
		return size;
	}
	public int setL2L_creTodrDESINATED_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTodrDESINATED_DLV_DATE == null) {
			l_creTodrDESINATED_DLV_DATE = new ArrayList();
		} else {
			l_creTodrDESINATED_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTodrDESINATED_DLV_DATE.add(((KU0030010Struct) list.get(i)).getcreTodrDESINATED_DLV_DATE());
		}
		return size;
	}
	public int setL2L_creTodrODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTodrODR_QTY == null) {
			l_creTodrODR_QTY = new ArrayList();
		} else {
			l_creTodrODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTodrODR_QTY.add(((KU0030010Struct) list.get(i)).getcreTodrODR_QTY());
		}
		return size;
	}
	public int setL2L_creTodrREMAIN_UNCONFIRM_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTodrREMAIN_UNCONFIRM_ODR_QTY == null) {
			l_creTodrREMAIN_UNCONFIRM_ODR_QTY = new ArrayList();
		} else {
			l_creTodrREMAIN_UNCONFIRM_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTodrREMAIN_UNCONFIRM_ODR_QTY.add(((KU0030010Struct) list.get(i)).getcreTodrREMAIN_UNCONFIRM_ODR_QTY());
		}
		return size;
	}
	public int setL2L_creTodrCANCELED_UNCONFIRM_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTodrCANCELED_UNCONFIRM_ODR_QTY == null) {
			l_creTodrCANCELED_UNCONFIRM_ODR_QTY = new ArrayList();
		} else {
			l_creTodrCANCELED_UNCONFIRM_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTodrCANCELED_UNCONFIRM_ODR_QTY.add(((KU0030010Struct) list.get(i)).getcreTodrCANCELED_UNCONFIRM_ODR_QTY());
		}
		return size;
	}
	public int setL2L_creTodrUNIT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTodrUNIT_CD == null) {
			l_creTodrUNIT_CD = new ArrayList();
		} else {
			l_creTodrUNIT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTodrUNIT_CD.add(((KU0030010Struct) list.get(i)).getcreTodrUNIT_CD());
		}
		return size;
	}
	public int setL2L_creTodrUNCONFIRM_ODR_BALANCE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTodrUNCONFIRM_ODR_BALANCE == null) {
			l_creTodrUNCONFIRM_ODR_BALANCE = new ArrayList();
		} else {
			l_creTodrUNCONFIRM_ODR_BALANCE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTodrUNCONFIRM_ODR_BALANCE.add(((KU0030010Struct) list.get(i)).getcreTodrUNCONFIRM_ODR_BALANCE());
		}
		return size;
	}
	public int setL2L_creTodrODR_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTodrODR_AMOUNT == null) {
			l_creTodrODR_AMOUNT = new ArrayList();
		} else {
			l_creTodrODR_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTodrODR_AMOUNT.add(((KU0030010Struct) list.get(i)).getcreTodrODR_AMOUNT());
		}
		return size;
	}
	public int setL2L_creTodrODR_AMOUNT_EXCH_RATES(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTodrODR_AMOUNT_EXCH_RATES == null) {
			l_creTodrODR_AMOUNT_EXCH_RATES = new ArrayList();
		} else {
			l_creTodrODR_AMOUNT_EXCH_RATES.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTodrODR_AMOUNT_EXCH_RATES.add(((KU0030010Struct) list.get(i)).getcreTodrODR_AMOUNT_EXCH_RATES());
		}
		return size;
	}
	public int setL2L_creTodrTOTAL_SHIP_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTodrTOTAL_SHIP_QTY == null) {
			l_creTodrTOTAL_SHIP_QTY = new ArrayList();
		} else {
			l_creTodrTOTAL_SHIP_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTodrTOTAL_SHIP_QTY.add(((KU0030010Struct) list.get(i)).getcreTodrTOTAL_SHIP_QTY());
		}
		return size;
	}
	public int setL2L_creTodrSHIP_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTodrSHIP_AMOUNT == null) {
			l_creTodrSHIP_AMOUNT = new ArrayList();
		} else {
			l_creTodrSHIP_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTodrSHIP_AMOUNT.add(((KU0030010Struct) list.get(i)).getcreTodrSHIP_AMOUNT());
		}
		return size;
	}
	public int setL2L_creTodrSHIP_AMOUNT_EXCH_RATES(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTodrSHIP_AMOUNT_EXCH_RATES == null) {
			l_creTodrSHIP_AMOUNT_EXCH_RATES = new ArrayList();
		} else {
			l_creTodrSHIP_AMOUNT_EXCH_RATES.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTodrSHIP_AMOUNT_EXCH_RATES.add(((KU0030010Struct) list.get(i)).getcreTodrSHIP_AMOUNT_EXCH_RATES());
		}
		return size;
	}
	public int setL2L_creTodrODR_CMPLT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTodrODR_CMPLT_FLG == null) {
			l_creTodrODR_CMPLT_FLG = new ArrayList();
		} else {
			l_creTodrODR_CMPLT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTodrODR_CMPLT_FLG.add(((KU0030010Struct) list.get(i)).getcreTodrODR_CMPLT_FLG());
		}
		return size;
	}
	public int setL2L_creTodrODR_CMPLT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTodrODR_CMPLT_DATE == null) {
			l_creTodrODR_CMPLT_DATE = new ArrayList();
		} else {
			l_creTodrODR_CMPLT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTodrODR_CMPLT_DATE.add(((KU0030010Struct) list.get(i)).getcreTodrODR_CMPLT_DATE());
		}
		return size;
	}
	public int setL2L_creTodrREMARKS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTodrREMARKS == null) {
			l_creTodrREMARKS = new ArrayList();
		} else {
			l_creTodrREMARKS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTodrREMARKS.add(((KU0030010Struct) list.get(i)).getcreTodrREMARKS());
		}
		return size;
	}
	public int setL2L_creTodrODR_ACPT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTodrODR_ACPT_DATE == null) {
			l_creTodrODR_ACPT_DATE = new ArrayList();
		} else {
			l_creTodrODR_ACPT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTodrODR_ACPT_DATE.add(((KU0030010Struct) list.get(i)).getcreTodrODR_ACPT_DATE());
		}
		return size;
	}
	public int setL2L_creTodrSHIP_PLAN_REMAIN_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTodrSHIP_PLAN_REMAIN_QTY == null) {
			l_creTodrSHIP_PLAN_REMAIN_QTY = new ArrayList();
		} else {
			l_creTodrSHIP_PLAN_REMAIN_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTodrSHIP_PLAN_REMAIN_QTY.add(((KU0030010Struct) list.get(i)).getcreTodrSHIP_PLAN_REMAIN_QTY());
		}
		return size;
	}
	public int setL2L_creTodrSHIP_PLAN_CMPLT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTodrSHIP_PLAN_CMPLT_FLG == null) {
			l_creTodrSHIP_PLAN_CMPLT_FLG = new ArrayList();
		} else {
			l_creTodrSHIP_PLAN_CMPLT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTodrSHIP_PLAN_CMPLT_FLG.add(((KU0030010Struct) list.get(i)).getcreTodrSHIP_PLAN_CMPLT_FLG());
		}
		return size;
	}
	public int setL2L_creTodrUNCONFIRMED_ODR_EFF_OVR_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTodrUNCONFIRMED_ODR_EFF_OVR_FLG == null) {
			l_creTodrUNCONFIRMED_ODR_EFF_OVR_FLG = new ArrayList();
		} else {
			l_creTodrUNCONFIRMED_ODR_EFF_OVR_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTodrUNCONFIRMED_ODR_EFF_OVR_FLG.add(((KU0030010Struct) list.get(i)).getcreTodrUNCONFIRMED_ODR_EFF_OVR_FLG());
		}
		return size;
	}
	public int setL2L_creTodrPARTIAL_SHIP_INST_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTodrPARTIAL_SHIP_INST_FLG == null) {
			l_creTodrPARTIAL_SHIP_INST_FLG = new ArrayList();
		} else {
			l_creTodrPARTIAL_SHIP_INST_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTodrPARTIAL_SHIP_INST_FLG.add(((KU0030010Struct) list.get(i)).getcreTodrPARTIAL_SHIP_INST_FLG());
		}
		return size;
	}
	public int setL2L_creTodrENTRY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTodrENTRY_TYP == null) {
			l_creTodrENTRY_TYP = new ArrayList();
		} else {
			l_creTodrENTRY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTodrENTRY_TYP.add(((KU0030010Struct) list.get(i)).getcreTodrENTRY_TYP());
		}
		return size;
	}
	public int setL2L_creTodrDEL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTodrDEL_FLG == null) {
			l_creTodrDEL_FLG = new ArrayList();
		} else {
			l_creTodrDEL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTodrDEL_FLG.add(((KU0030010Struct) list.get(i)).getcreTodrDEL_FLG());
		}
		return size;
	}
	public int setL2L_upTodr_TOTAL_SHIP_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_upTodr_TOTAL_SHIP_QTY == null) {
			l_upTodr_TOTAL_SHIP_QTY = new ArrayList();
		} else {
			l_upTodr_TOTAL_SHIP_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_upTodr_TOTAL_SHIP_QTY.add(((KU0030010Struct) list.get(i)).getupTodr_TOTAL_SHIP_QTY());
		}
		return size;
	}
	public int setL2L_upTodr_SHIP_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_upTodr_SHIP_AMOUNT == null) {
			l_upTodr_SHIP_AMOUNT = new ArrayList();
		} else {
			l_upTodr_SHIP_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_upTodr_SHIP_AMOUNT.add(((KU0030010Struct) list.get(i)).getupTodr_SHIP_AMOUNT());
		}
		return size;
	}
	public int setL2L_upTodr_SHIP_AMOUNT_EXCH_RATES(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_upTodr_SHIP_AMOUNT_EXCH_RATES == null) {
			l_upTodr_SHIP_AMOUNT_EXCH_RATES = new ArrayList();
		} else {
			l_upTodr_SHIP_AMOUNT_EXCH_RATES.clear();
		}
		for (int i = 0; i < size; i++) {
			l_upTodr_SHIP_AMOUNT_EXCH_RATES.add(((KU0030010Struct) list.get(i)).getupTodr_SHIP_AMOUNT_EXCH_RATES());
		}
		return size;
	}
	public int setL2L_upTodr_ODR_CMPLT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_upTodr_ODR_CMPLT_FLG == null) {
			l_upTodr_ODR_CMPLT_FLG = new ArrayList();
		} else {
			l_upTodr_ODR_CMPLT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_upTodr_ODR_CMPLT_FLG.add(((KU0030010Struct) list.get(i)).getupTodr_ODR_CMPLT_FLG());
		}
		return size;
	}
	public int setL2L_upTodr_ODR_CMPLT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_upTodr_ODR_CMPLT_DATE == null) {
			l_upTodr_ODR_CMPLT_DATE = new ArrayList();
		} else {
			l_upTodr_ODR_CMPLT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_upTodr_ODR_CMPLT_DATE.add(((KU0030010Struct) list.get(i)).getupTodr_ODR_CMPLT_DATE());
		}
		return size;
	}
	public int setL2L_upTodr_IN_ODRNO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_upTodr_IN_ODRNO == null) {
			l_upTodr_IN_ODRNO = new ArrayList();
		} else {
			l_upTodr_IN_ODRNO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_upTodr_IN_ODRNO.add(((KU0030010Struct) list.get(i)).getupTodr_IN_ODRNO());
		}
		return size;
	}
	public int setL2L_creTrcvIssue_RCV_ISSUE_CTRL_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTrcvIssue_RCV_ISSUE_CTRL_CD == null) {
			l_creTrcvIssue_RCV_ISSUE_CTRL_CD = new ArrayList();
		} else {
			l_creTrcvIssue_RCV_ISSUE_CTRL_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTrcvIssue_RCV_ISSUE_CTRL_CD.add(((KU0030010Struct) list.get(i)).getcreTrcvIssue_RCV_ISSUE_CTRL_CD());
		}
		return size;
	}
	public int setL2L_creTrcvIssue_RCV_ISSUE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTrcvIssue_RCV_ISSUE_TYP == null) {
			l_creTrcvIssue_RCV_ISSUE_TYP = new ArrayList();
		} else {
			l_creTrcvIssue_RCV_ISSUE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTrcvIssue_RCV_ISSUE_TYP.add(((KU0030010Struct) list.get(i)).getcreTrcvIssue_RCV_ISSUE_TYP());
		}
		return size;
	}
	public int setL2L_creTrcvIssue_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTrcvIssue_ITEM_CD == null) {
			l_creTrcvIssue_ITEM_CD = new ArrayList();
		} else {
			l_creTrcvIssue_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTrcvIssue_ITEM_CD.add(((KU0030010Struct) list.get(i)).getcreTrcvIssue_ITEM_CD());
		}
		return size;
	}
	public int setL2L_creTrcvIssue_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTrcvIssue_JOB_ODR_CD == null) {
			l_creTrcvIssue_JOB_ODR_CD = new ArrayList();
		} else {
			l_creTrcvIssue_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTrcvIssue_JOB_ODR_CD.add(((KU0030010Struct) list.get(i)).getcreTrcvIssue_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_creTrcvIssue_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTrcvIssue_PLANT_CD == null) {
			l_creTrcvIssue_PLANT_CD = new ArrayList();
		} else {
			l_creTrcvIssue_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTrcvIssue_PLANT_CD.add(((KU0030010Struct) list.get(i)).getcreTrcvIssue_PLANT_CD());
		}
		return size;
	}
	public int setL2L_creTrcvIssue_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTrcvIssue_WH_CD == null) {
			l_creTrcvIssue_WH_CD = new ArrayList();
		} else {
			l_creTrcvIssue_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTrcvIssue_WH_CD.add(((KU0030010Struct) list.get(i)).getcreTrcvIssue_WH_CD());
		}
		return size;
	}
	public int setL2L_creTrcvIssue_RCV_ISSUE_BEFORE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTrcvIssue_RCV_ISSUE_BEFORE_QTY == null) {
			l_creTrcvIssue_RCV_ISSUE_BEFORE_QTY = new ArrayList();
		} else {
			l_creTrcvIssue_RCV_ISSUE_BEFORE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTrcvIssue_RCV_ISSUE_BEFORE_QTY.add(((KU0030010Struct) list.get(i)).getcreTrcvIssue_RCV_ISSUE_BEFORE_QTY());
		}
		return size;
	}
	public int setL2L_creTrcvIssue_RCV_ISSUE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTrcvIssue_RCV_ISSUE_QTY == null) {
			l_creTrcvIssue_RCV_ISSUE_QTY = new ArrayList();
		} else {
			l_creTrcvIssue_RCV_ISSUE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTrcvIssue_RCV_ISSUE_QTY.add(((KU0030010Struct) list.get(i)).getcreTrcvIssue_RCV_ISSUE_QTY());
		}
		return size;
	}
	public int setL2L_creTrcvIssue_RCV_ISSUE_AFTER_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTrcvIssue_RCV_ISSUE_AFTER_QTY == null) {
			l_creTrcvIssue_RCV_ISSUE_AFTER_QTY = new ArrayList();
		} else {
			l_creTrcvIssue_RCV_ISSUE_AFTER_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTrcvIssue_RCV_ISSUE_AFTER_QTY.add(((KU0030010Struct) list.get(i)).getcreTrcvIssue_RCV_ISSUE_AFTER_QTY());
		}
		return size;
	}
	public int setL2L_creTrcvIssue_RCV_ISSUE_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTrcvIssue_RCV_ISSUE_AMOUNT == null) {
			l_creTrcvIssue_RCV_ISSUE_AMOUNT = new ArrayList();
		} else {
			l_creTrcvIssue_RCV_ISSUE_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTrcvIssue_RCV_ISSUE_AMOUNT.add(((KU0030010Struct) list.get(i)).getcreTrcvIssue_RCV_ISSUE_AMOUNT());
		}
		return size;
	}
	public int setL2L_creTrcvIssue_RCV_ISSUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTrcvIssue_RCV_ISSUE_DATE == null) {
			l_creTrcvIssue_RCV_ISSUE_DATE = new ArrayList();
		} else {
			l_creTrcvIssue_RCV_ISSUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTrcvIssue_RCV_ISSUE_DATE.add(((KU0030010Struct) list.get(i)).getcreTrcvIssue_RCV_ISSUE_DATE());
		}
		return size;
	}
	public int setL2L_creTrcvIssue_RCV_ISSUE_GNR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTrcvIssue_RCV_ISSUE_GNR_TYP == null) {
			l_creTrcvIssue_RCV_ISSUE_GNR_TYP = new ArrayList();
		} else {
			l_creTrcvIssue_RCV_ISSUE_GNR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTrcvIssue_RCV_ISSUE_GNR_TYP.add(((KU0030010Struct) list.get(i)).getcreTrcvIssue_RCV_ISSUE_GNR_TYP());
		}
		return size;
	}
	public int setL2L_creTrcvIssue_STOCK_UPD_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTrcvIssue_STOCK_UPD_TYP == null) {
			l_creTrcvIssue_STOCK_UPD_TYP = new ArrayList();
		} else {
			l_creTrcvIssue_STOCK_UPD_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTrcvIssue_STOCK_UPD_TYP.add(((KU0030010Struct) list.get(i)).getcreTrcvIssue_STOCK_UPD_TYP());
		}
		return size;
	}
	public int setL2L_creTrcvIssue_RCV_ISSUE_CMPLT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTrcvIssue_RCV_ISSUE_CMPLT_FLG == null) {
			l_creTrcvIssue_RCV_ISSUE_CMPLT_FLG = new ArrayList();
		} else {
			l_creTrcvIssue_RCV_ISSUE_CMPLT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTrcvIssue_RCV_ISSUE_CMPLT_FLG.add(((KU0030010Struct) list.get(i)).getcreTrcvIssue_RCV_ISSUE_CMPLT_FLG());
		}
		return size;
	}
	public int setL2L_creTrcvIssue_RCV_ISSUE_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTrcvIssue_RCV_ISSUE_COMMENT == null) {
			l_creTrcvIssue_RCV_ISSUE_COMMENT = new ArrayList();
		} else {
			l_creTrcvIssue_RCV_ISSUE_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTrcvIssue_RCV_ISSUE_COMMENT.add(((KU0030010Struct) list.get(i)).getcreTrcvIssue_RCV_ISSUE_COMMENT());
		}
		return size;
	}
	public int setL2L_creTrcvIssue_LOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTrcvIssue_LOT_NO == null) {
			l_creTrcvIssue_LOT_NO = new ArrayList();
		} else {
			l_creTrcvIssue_LOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTrcvIssue_LOT_NO.add(((KU0030010Struct) list.get(i)).getcreTrcvIssue_LOT_NO());
		}
		return size;
	}
	public int setL2L_creTrcvIssue_SHIP_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTrcvIssue_SHIP_ODR_NO == null) {
			l_creTrcvIssue_SHIP_ODR_NO = new ArrayList();
		} else {
			l_creTrcvIssue_SHIP_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTrcvIssue_SHIP_ODR_NO.add(((KU0030010Struct) list.get(i)).getcreTrcvIssue_SHIP_ODR_NO());
		}
		return size;
	}
	public int setL2L_upTitemStock_STOCK_ON_HAND_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_upTitemStock_STOCK_ON_HAND_QTY == null) {
			l_upTitemStock_STOCK_ON_HAND_QTY = new ArrayList();
		} else {
			l_upTitemStock_STOCK_ON_HAND_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_upTitemStock_STOCK_ON_HAND_QTY.add(((KU0030010Struct) list.get(i)).getupTitemStock_STOCK_ON_HAND_QTY());
		}
		return size;
	}
	public int setL2L_upTitemStock_IN_ITEMCD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_upTitemStock_IN_ITEMCD == null) {
			l_upTitemStock_IN_ITEMCD = new ArrayList();
		} else {
			l_upTitemStock_IN_ITEMCD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_upTitemStock_IN_ITEMCD.add(((KU0030010Struct) list.get(i)).getupTitemStock_IN_ITEMCD());
		}
		return size;
	}
	public int setL2L_upTitemStock_IN_WHCD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_upTitemStock_IN_WHCD == null) {
			l_upTitemStock_IN_WHCD = new ArrayList();
		} else {
			l_upTitemStock_IN_WHCD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_upTitemStock_IN_WHCD.add(((KU0030010Struct) list.get(i)).getupTitemStock_IN_WHCD());
		}
		return size;
	}
	public int setL2L_serTitemStock_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTitemStock_ITEM_CD == null) {
			l_serTitemStock_ITEM_CD = new ArrayList();
		} else {
			l_serTitemStock_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTitemStock_ITEM_CD.add(((KU0030010Struct) list.get(i)).getserTitemStock_ITEM_CD());
		}
		return size;
	}
	public int setL2L_serTitemStock_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTitemStock_WH_CD == null) {
			l_serTitemStock_WH_CD = new ArrayList();
		} else {
			l_serTitemStock_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTitemStock_WH_CD.add(((KU0030010Struct) list.get(i)).getserTitemStock_WH_CD());
		}
		return size;
	}
	public int setL2L_serTitemStock_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTitemStock_PLANT_CD == null) {
			l_serTitemStock_PLANT_CD = new ArrayList();
		} else {
			l_serTitemStock_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTitemStock_PLANT_CD.add(((KU0030010Struct) list.get(i)).getserTitemStock_PLANT_CD());
		}
		return size;
	}
	public int setL2L_serTitemStock_STOCK_ON_HAND_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTitemStock_STOCK_ON_HAND_QTY == null) {
			l_serTitemStock_STOCK_ON_HAND_QTY = new ArrayList();
		} else {
			l_serTitemStock_STOCK_ON_HAND_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTitemStock_STOCK_ON_HAND_QTY.add(((KU0030010Struct) list.get(i)).getserTitemStock_STOCK_ON_HAND_QTY());
		}
		return size;
	}
	public int setL2L_serTitemStock_DEFECT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTitemStock_DEFECT_QTY == null) {
			l_serTitemStock_DEFECT_QTY = new ArrayList();
		} else {
			l_serTitemStock_DEFECT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTitemStock_DEFECT_QTY.add(((KU0030010Struct) list.get(i)).getserTitemStock_DEFECT_QTY());
		}
		return size;
	}
	public int setL2L_serTitemStock_PRVS_DAYEND_STOCK_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTitemStock_PRVS_DAYEND_STOCK_QTY == null) {
			l_serTitemStock_PRVS_DAYEND_STOCK_QTY = new ArrayList();
		} else {
			l_serTitemStock_PRVS_DAYEND_STOCK_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTitemStock_PRVS_DAYEND_STOCK_QTY.add(((KU0030010Struct) list.get(i)).getserTitemStock_PRVS_DAYEND_STOCK_QTY());
		}
		return size;
	}
	public int setL2L_serTitemStock_PRVS_MONTHEND_STOCK_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTitemStock_PRVS_MONTHEND_STOCK_QTY == null) {
			l_serTitemStock_PRVS_MONTHEND_STOCK_QTY = new ArrayList();
		} else {
			l_serTitemStock_PRVS_MONTHEND_STOCK_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTitemStock_PRVS_MONTHEND_STOCK_QTY.add(((KU0030010Struct) list.get(i)).getserTitemStock_PRVS_MONTHEND_STOCK_QTY());
		}
		return size;
	}
	public int setL2L_serTitemStock_PRVS_TERMEND_STOCK_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTitemStock_PRVS_TERMEND_STOCK_QTY == null) {
			l_serTitemStock_PRVS_TERMEND_STOCK_QTY = new ArrayList();
		} else {
			l_serTitemStock_PRVS_TERMEND_STOCK_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTitemStock_PRVS_TERMEND_STOCK_QTY.add(((KU0030010Struct) list.get(i)).getserTitemStock_PRVS_TERMEND_STOCK_QTY());
		}
		return size;
	}
	public int setL2L_serTitemStock_IN_ITEMCD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTitemStock_IN_ITEMCD == null) {
			l_serTitemStock_IN_ITEMCD = new ArrayList();
		} else {
			l_serTitemStock_IN_ITEMCD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTitemStock_IN_ITEMCD.add(((KU0030010Struct) list.get(i)).getserTitemStock_IN_ITEMCD());
		}
		return size;
	}
	public int setL2L_serTitemStock_IN_WHCD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTitemStock_IN_WHCD == null) {
			l_serTitemStock_IN_WHCD = new ArrayList();
		} else {
			l_serTitemStock_IN_WHCD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTitemStock_IN_WHCD.add(((KU0030010Struct) list.get(i)).getserTitemStock_IN_WHCD());
		}
		return size;
	}
	public int setL2L_creTitemStock_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTitemStock_WH_CD == null) {
			l_creTitemStock_WH_CD = new ArrayList();
		} else {
			l_creTitemStock_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTitemStock_WH_CD.add(((KU0030010Struct) list.get(i)).getcreTitemStock_WH_CD());
		}
		return size;
	}
	public int setL2L_creTitemStock_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTitemStock_ITEM_CD == null) {
			l_creTitemStock_ITEM_CD = new ArrayList();
		} else {
			l_creTitemStock_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTitemStock_ITEM_CD.add(((KU0030010Struct) list.get(i)).getcreTitemStock_ITEM_CD());
		}
		return size;
	}
	public int setL2L_creTitemStock_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTitemStock_PLANT_CD == null) {
			l_creTitemStock_PLANT_CD = new ArrayList();
		} else {
			l_creTitemStock_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTitemStock_PLANT_CD.add(((KU0030010Struct) list.get(i)).getcreTitemStock_PLANT_CD());
		}
		return size;
	}
	public int setL2L_creTitemStock_STOCK_ON_HAND_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTitemStock_STOCK_ON_HAND_QTY == null) {
			l_creTitemStock_STOCK_ON_HAND_QTY = new ArrayList();
		} else {
			l_creTitemStock_STOCK_ON_HAND_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTitemStock_STOCK_ON_HAND_QTY.add(((KU0030010Struct) list.get(i)).getcreTitemStock_STOCK_ON_HAND_QTY());
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
			l_mCust_COMPANY_CD.add(((KU0030010Struct) list.get(i)).getmCust_COMPANY_CD());
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
			l_mCust_CUST_CD.add(((KU0030010Struct) list.get(i)).getmCust_CUST_CD());
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
			l_mCust_CUST_NAME.add(((KU0030010Struct) list.get(i)).getmCust_CUST_NAME());
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
			l_mCust_DETAIL_ROUND_TYP.add(((KU0030010Struct) list.get(i)).getmCust_DETAIL_ROUND_TYP());
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
			l_mCust_INSPC_ACPT_TYP.add(((KU0030010Struct) list.get(i)).getmCust_INSPC_ACPT_TYP());
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
			l_mCust_OWN_ORG_CD.add(((KU0030010Struct) list.get(i)).getmCust_OWN_ORG_CD());
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
			l_mCust_EXCH_TYP.add(((KU0030010Struct) list.get(i)).getmCust_EXCH_TYP());
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
			l_mCust_CUR_CD.add(((KU0030010Struct) list.get(i)).getmCust_CUR_CD());
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
			l_mCust_IN_COMPANYCD.add(((KU0030010Struct) list.get(i)).getmCust_IN_COMPANYCD());
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
			l_mCust_IN_CUSTCD.add(((KU0030010Struct) list.get(i)).getmCust_IN_CUSTCD());
		}
		return size;
	}
	public int setL2L_getHomeCur_CUR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_getHomeCur_CUR_CD == null) {
			l_getHomeCur_CUR_CD = new ArrayList();
		} else {
			l_getHomeCur_CUR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_getHomeCur_CUR_CD.add(((KU0030010Struct) list.get(i)).getgetHomeCur_CUR_CD());
		}
		return size;
	}
	public int setL2L_getHomeCur_DECIMAL_FIG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_getHomeCur_DECIMAL_FIG == null) {
			l_getHomeCur_DECIMAL_FIG = new ArrayList();
		} else {
			l_getHomeCur_DECIMAL_FIG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_getHomeCur_DECIMAL_FIG.add(((KU0030010Struct) list.get(i)).getgetHomeCur_DECIMAL_FIG());
		}
		return size;
	}
	public int setL2L_getHomeCur_CTRL_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_getHomeCur_CTRL_CD == null) {
			l_getHomeCur_CTRL_CD = new ArrayList();
		} else {
			l_getHomeCur_CTRL_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_getHomeCur_CTRL_CD.add(((KU0030010Struct) list.get(i)).getgetHomeCur_CTRL_CD());
		}
		return size;
	}
	public int setL2L_strCode(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strCode == null) {
			l_strCode = new ArrayList();
		} else {
			l_strCode.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strCode.add(((KU0030010Struct) list.get(i)).getstrCode());
		}
		return size;
	}
	public int setL2L_mUnitCost_UNIT_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mUnitCost_UNIT_COST == null) {
			l_mUnitCost_UNIT_COST = new ArrayList();
		} else {
			l_mUnitCost_UNIT_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mUnitCost_UNIT_COST.add(((KU0030010Struct) list.get(i)).getmUnitCost_UNIT_COST());
		}
		return size;
	}
	public int setL2L_mUnitCost_EFF_PHASE_IN_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mUnitCost_EFF_PHASE_IN_DATE == null) {
			l_mUnitCost_EFF_PHASE_IN_DATE = new ArrayList();
		} else {
			l_mUnitCost_EFF_PHASE_IN_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mUnitCost_EFF_PHASE_IN_DATE.add(((KU0030010Struct) list.get(i)).getmUnitCost_EFF_PHASE_IN_DATE());
		}
		return size;
	}
	public int setL2L_mUnitCost_IN_COMPANYCD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mUnitCost_IN_COMPANYCD == null) {
			l_mUnitCost_IN_COMPANYCD = new ArrayList();
		} else {
			l_mUnitCost_IN_COMPANYCD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mUnitCost_IN_COMPANYCD.add(((KU0030010Struct) list.get(i)).getmUnitCost_IN_COMPANYCD());
		}
		return size;
	}
	public int setL2L_mUnitCost_IN_CUSTCD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mUnitCost_IN_CUSTCD == null) {
			l_mUnitCost_IN_CUSTCD = new ArrayList();
		} else {
			l_mUnitCost_IN_CUSTCD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mUnitCost_IN_CUSTCD.add(((KU0030010Struct) list.get(i)).getmUnitCost_IN_CUSTCD());
		}
		return size;
	}
	public int setL2L_mUnitCost_IN_ITEMCD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mUnitCost_IN_ITEMCD == null) {
			l_mUnitCost_IN_ITEMCD = new ArrayList();
		} else {
			l_mUnitCost_IN_ITEMCD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mUnitCost_IN_ITEMCD.add(((KU0030010Struct) list.get(i)).getmUnitCost_IN_ITEMCD());
		}
		return size;
	}
	public int setL2L_mUnitCost_IN_EFFPHASEINDATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mUnitCost_IN_EFFPHASEINDATE == null) {
			l_mUnitCost_IN_EFFPHASEINDATE = new ArrayList();
		} else {
			l_mUnitCost_IN_EFFPHASEINDATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mUnitCost_IN_EFFPHASEINDATE.add(((KU0030010Struct) list.get(i)).getmUnitCost_IN_EFFPHASEINDATE());
		}
		return size;
	}
	public int setL2L_readShipOdr_TOTAL_SHIP_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readShipOdr_TOTAL_SHIP_QTY == null) {
			l_readShipOdr_TOTAL_SHIP_QTY = new ArrayList();
		} else {
			l_readShipOdr_TOTAL_SHIP_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readShipOdr_TOTAL_SHIP_QTY.add(((KU0030010Struct) list.get(i)).getreadShipOdr_TOTAL_SHIP_QTY());
		}
		return size;
	}
	public int setL2L_readShipOdr_RETURN_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readShipOdr_RETURN_QTY == null) {
			l_readShipOdr_RETURN_QTY = new ArrayList();
		} else {
			l_readShipOdr_RETURN_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readShipOdr_RETURN_QTY.add(((KU0030010Struct) list.get(i)).getreadShipOdr_RETURN_QTY());
		}
		return size;
	}
	public int setL2L_readShipOdr_SHIP_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readShipOdr_SHIP_ODR_NO == null) {
			l_readShipOdr_SHIP_ODR_NO = new ArrayList();
		} else {
			l_readShipOdr_SHIP_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readShipOdr_SHIP_ODR_NO.add(((KU0030010Struct) list.get(i)).getreadShipOdr_SHIP_ODR_NO());
		}
		return size;
	}
	public int setL2L_g_CUR_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_g_CUR_UNIT == null) {
			l_g_CUR_UNIT = new ArrayList();
		} else {
			l_g_CUR_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_g_CUR_UNIT.add(((KU0030010Struct) list.get(i)).getg_CUR_UNIT());
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
			l_DECIMAL_FIG.add(((KU0030010Struct) list.get(i)).getDECIMAL_FIG());
		}
		return size;
	}
	public int setL2L_t_CUR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_t_CUR_CD == null) {
			l_t_CUR_CD = new ArrayList();
		} else {
			l_t_CUR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_t_CUR_CD.add(((KU0030010Struct) list.get(i)).gett_CUR_CD());
		}
		return size;
	}
	public int setL2L_strSLIP_CTRL_GRP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strSLIP_CTRL_GRP == null) {
			l_strSLIP_CTRL_GRP = new ArrayList();
		} else {
			l_strSLIP_CTRL_GRP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strSLIP_CTRL_GRP.add(((KU0030010Struct) list.get(i)).getstrSLIP_CTRL_GRP());
		}
		return size;
	}
	public int setL2L_strSTATUS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strSTATUS == null) {
			l_strSTATUS = new ArrayList();
		} else {
			l_strSTATUS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strSTATUS.add(((KU0030010Struct) list.get(i)).getstrSTATUS());
		}
		return size;
	}
	public int setL2L_strSLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strSLIP_CD == null) {
			l_strSLIP_CD = new ArrayList();
		} else {
			l_strSLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strSLIP_CD.add(((KU0030010Struct) list.get(i)).getstrSLIP_CD());
		}
		return size;
	}
	public int setL2L_upTshipOdr_SHP_CMPLT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_upTshipOdr_SHP_CMPLT_FLG == null) {
			l_upTshipOdr_SHP_CMPLT_FLG = new ArrayList();
		} else {
			l_upTshipOdr_SHP_CMPLT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_upTshipOdr_SHP_CMPLT_FLG.add(((KU0030010Struct) list.get(i)).getupTshipOdr_SHP_CMPLT_FLG());
		}
		return size;
	}
	public int setL2L_upTshipOdr_TOTAL_SHIP_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_upTshipOdr_TOTAL_SHIP_QTY == null) {
			l_upTshipOdr_TOTAL_SHIP_QTY = new ArrayList();
		} else {
			l_upTshipOdr_TOTAL_SHIP_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_upTshipOdr_TOTAL_SHIP_QTY.add(((KU0030010Struct) list.get(i)).getupTshipOdr_TOTAL_SHIP_QTY());
		}
		return size;
	}
	public int setL2L_upTshipOdr_SLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_upTshipOdr_SLIP_CD == null) {
			l_upTshipOdr_SLIP_CD = new ArrayList();
		} else {
			l_upTshipOdr_SLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_upTshipOdr_SLIP_CD.add(((KU0030010Struct) list.get(i)).getupTshipOdr_SLIP_CD());
		}
		return size;
	}
	public int setL2L_upTshipOdr_ORG_SLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_upTshipOdr_ORG_SLIP_CD == null) {
			l_upTshipOdr_ORG_SLIP_CD = new ArrayList();
		} else {
			l_upTshipOdr_ORG_SLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_upTshipOdr_ORG_SLIP_CD.add(((KU0030010Struct) list.get(i)).getupTshipOdr_ORG_SLIP_CD());
		}
		return size;
	}
	public int setL2L_upTshipOdr_SHIP_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_upTshipOdr_SHIP_ODR_NO == null) {
			l_upTshipOdr_SHIP_ODR_NO = new ArrayList();
		} else {
			l_upTshipOdr_SHIP_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_upTshipOdr_SHIP_ODR_NO.add(((KU0030010Struct) list.get(i)).getupTshipOdr_SHIP_ODR_NO());
		}
		return size;
	}
	public int setL2L_strTod_OD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strTod_OD_NO == null) {
			l_strTod_OD_NO = new ArrayList();
		} else {
			l_strTod_OD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strTod_OD_NO.add(((KU0030010Struct) list.get(i)).getstrTod_OD_NO());
		}
		return size;
	}
	public int setL2L_strTod_TOTAL_ISSUE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strTod_TOTAL_ISSUE_QTY == null) {
			l_strTod_TOTAL_ISSUE_QTY = new ArrayList();
		} else {
			l_strTod_TOTAL_ISSUE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strTod_TOTAL_ISSUE_QTY.add(((KU0030010Struct) list.get(i)).getstrTod_TOTAL_ISSUE_QTY());
		}
		return size;
	}
	public int setL2L_strTod_DM_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strTod_DM_QTY == null) {
			l_strTod_DM_QTY = new ArrayList();
		} else {
			l_strTod_DM_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strTod_DM_QTY.add(((KU0030010Struct) list.get(i)).getstrTod_DM_QTY());
		}
		return size;
	}
	public int setL2L_strTod_DM_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strTod_DM_STS_TYP == null) {
			l_strTod_DM_STS_TYP = new ArrayList();
		} else {
			l_strTod_DM_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strTod_DM_STS_TYP.add(((KU0030010Struct) list.get(i)).getstrTod_DM_STS_TYP());
		}
		return size;
	}
	public int setL2L_inTod_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_inTod_ODR_NO == null) {
			l_inTod_ODR_NO = new ArrayList();
		} else {
			l_inTod_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_inTod_ODR_NO.add(((KU0030010Struct) list.get(i)).getinTod_ODR_NO());
		}
		return size;
	}
	public int setL2L_inTod_PART_DLV_SEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_inTod_PART_DLV_SEQ_NO == null) {
			l_inTod_PART_DLV_SEQ_NO = new ArrayList();
		} else {
			l_inTod_PART_DLV_SEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_inTod_PART_DLV_SEQ_NO.add(((KU0030010Struct) list.get(i)).getinTod_PART_DLV_SEQ_NO());
		}
		return size;
	}
	public int setL2L_inTod_OD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_inTod_OD_NO == null) {
			l_inTod_OD_NO = new ArrayList();
		} else {
			l_inTod_OD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_inTod_OD_NO.add(((KU0030010Struct) list.get(i)).getinTod_OD_NO());
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
			l_strTaxTAX_KBN.add(((KU0030010Struct) list.get(i)).getstrTaxTAX_KBN());
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
			l_strTaxOLD_TAX_1.add(((KU0030010Struct) list.get(i)).getstrTaxOLD_TAX_1());
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
			l_strTaxOLD_TAX_2.add(((KU0030010Struct) list.get(i)).getstrTaxOLD_TAX_2());
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
			l_strTaxOLD_TAX_3.add(((KU0030010Struct) list.get(i)).getstrTaxOLD_TAX_3());
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
			l_strTaxNEW_TAX_1.add(((KU0030010Struct) list.get(i)).getstrTaxNEW_TAX_1());
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
			l_strTaxNEW_TAX_2.add(((KU0030010Struct) list.get(i)).getstrTaxNEW_TAX_2());
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
			l_strTaxNEW_TAX_3.add(((KU0030010Struct) list.get(i)).getstrTaxNEW_TAX_3());
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
			l_strTaxSTART_DATE.add(((KU0030010Struct) list.get(i)).getstrTaxSTART_DATE());
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
			l_strTaxROUND_TYP.add(((KU0030010Struct) list.get(i)).getstrTaxROUND_TYP());
		}
		return size;
	}
	public int setL2L_updiffTAX_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_updiffTAX_CD == null) {
			l_updiffTAX_CD = new ArrayList();
		} else {
			l_updiffTAX_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_updiffTAX_CD.add(((KU0030010Struct) list.get(i)).getupdiffTAX_CD());
		}
		return size;
	}
	public int setL2L_upTshipOdr_RETURN_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_upTshipOdr_RETURN_QTY == null) {
			l_upTshipOdr_RETURN_QTY = new ArrayList();
		} else {
			l_upTshipOdr_RETURN_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_upTshipOdr_RETURN_QTY.add(((KU0030010Struct) list.get(i)).getupTshipOdr_RETURN_QTY());
		}
		return size;
	}
	public int setL2L_chkSLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_chkSLIP_CD == null) {
			l_chkSLIP_CD = new ArrayList();
		} else {
			l_chkSLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_chkSLIP_CD.add(((KU0030010Struct) list.get(i)).getchkSLIP_CD());
		}
		return size;
	}
	public int setL2L_mWh_WH_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mWh_WH_NAME == null) {
			l_mWh_WH_NAME = new ArrayList();
		} else {
			l_mWh_WH_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mWh_WH_NAME.add(((KU0030010Struct) list.get(i)).getmWh_WH_NAME());
		}
		return size;
	}
	public int setL2L_mWh_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mWh_PLANT_CD == null) {
			l_mWh_PLANT_CD = new ArrayList();
		} else {
			l_mWh_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mWh_PLANT_CD.add(((KU0030010Struct) list.get(i)).getmWh_PLANT_CD());
		}
		return size;
	}
	public int setL2L_mWh_IN_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mWh_IN_WH_CD == null) {
			l_mWh_IN_WH_CD = new ArrayList();
		} else {
			l_mWh_IN_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mWh_IN_WH_CD.add(((KU0030010Struct) list.get(i)).getmWh_IN_WH_CD());
		}
		return size;
	}
	public int setL2L_mOrg_ORG_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mOrg_ORG_NAME == null) {
			l_mOrg_ORG_NAME = new ArrayList();
		} else {
			l_mOrg_ORG_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mOrg_ORG_NAME.add(((KU0030010Struct) list.get(i)).getmOrg_ORG_NAME());
		}
		return size;
	}
	public int setL2L_mOrg_IN_COMPANYCD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mOrg_IN_COMPANYCD == null) {
			l_mOrg_IN_COMPANYCD = new ArrayList();
		} else {
			l_mOrg_IN_COMPANYCD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mOrg_IN_COMPANYCD.add(((KU0030010Struct) list.get(i)).getmOrg_IN_COMPANYCD());
		}
		return size;
	}
	public int setL2L_mOrg_IN_ORGCD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mOrg_IN_ORGCD == null) {
			l_mOrg_IN_ORGCD = new ArrayList();
		} else {
			l_mOrg_IN_ORGCD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mOrg_IN_ORGCD.add(((KU0030010Struct) list.get(i)).getmOrg_IN_ORGCD());
		}
		return size;
	}
	public int setL2L_serTitemStock_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTitemStock_JOB_ODR_CD == null) {
			l_serTitemStock_JOB_ODR_CD = new ArrayList();
		} else {
			l_serTitemStock_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTitemStock_JOB_ODR_CD.add(((KU0030010Struct) list.get(i)).getserTitemStock_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_serTitemStock_IN_JOBODRCD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTitemStock_IN_JOBODRCD == null) {
			l_serTitemStock_IN_JOBODRCD = new ArrayList();
		} else {
			l_serTitemStock_IN_JOBODRCD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTitemStock_IN_JOBODRCD.add(((KU0030010Struct) list.get(i)).getserTitemStock_IN_JOBODRCD());
		}
		return size;
	}
	public int setL2L_creTitemStock_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_creTitemStock_JOB_ODR_CD == null) {
			l_creTitemStock_JOB_ODR_CD = new ArrayList();
		} else {
			l_creTitemStock_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_creTitemStock_JOB_ODR_CD.add(((KU0030010Struct) list.get(i)).getcreTitemStock_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_upTitemStock_IN_JOBODRCD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_upTitemStock_IN_JOBODRCD == null) {
			l_upTitemStock_IN_JOBODRCD = new ArrayList();
		} else {
			l_upTitemStock_IN_JOBODRCD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_upTitemStock_IN_JOBODRCD.add(((KU0030010Struct) list.get(i)).getupTitemStock_IN_JOBODRCD());
		}
		return size;
	}
	public int setL2L_serTJobOdr_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTJobOdr_JOB_ODR_CD == null) {
			l_serTJobOdr_JOB_ODR_CD = new ArrayList();
		} else {
			l_serTJobOdr_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTJobOdr_JOB_ODR_CD.add(((KU0030010Struct) list.get(i)).getserTJobOdr_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_serTJobOdr_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serTJobOdr_ITEM_CD == null) {
			l_serTJobOdr_ITEM_CD = new ArrayList();
		} else {
			l_serTJobOdr_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serTJobOdr_ITEM_CD.add(((KU0030010Struct) list.get(i)).getserTJobOdr_ITEM_CD());
		}
		return size;
	}
	public int setL2L_diffSHIP_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_diffSHIP_QTY == null) {
			l_diffSHIP_QTY = new ArrayList();
		} else {
			l_diffSHIP_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_diffSHIP_QTY.add(((KU0030010Struct) list.get(i)).getdiffSHIP_QTY());
		}
		return size;
	}
	public int setL2L_diffSHIP_ODR_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_diffSHIP_ODR_AMOUNT == null) {
			l_diffSHIP_ODR_AMOUNT = new ArrayList();
		} else {
			l_diffSHIP_ODR_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_diffSHIP_ODR_AMOUNT.add(((KU0030010Struct) list.get(i)).getdiffSHIP_ODR_AMOUNT());
		}
		return size;
	}
	public int setL2L_diffSHIP_ODR_AMOUNT_EXCH_RATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_diffSHIP_ODR_AMOUNT_EXCH_RATE == null) {
			l_diffSHIP_ODR_AMOUNT_EXCH_RATE = new ArrayList();
		} else {
			l_diffSHIP_ODR_AMOUNT_EXCH_RATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_diffSHIP_ODR_AMOUNT_EXCH_RATE.add(((KU0030010Struct) list.get(i)).getdiffSHIP_ODR_AMOUNT_EXCH_RATE());
		}
		return size;
	}
	public int setL2L_diffSHIP_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_diffSHIP_ODR_NO == null) {
			l_diffSHIP_ODR_NO = new ArrayList();
		} else {
			l_diffSHIP_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_diffSHIP_ODR_NO.add(((KU0030010Struct) list.get(i)).getdiffSHIP_ODR_NO());
		}
		return size;
	}
	public int setL2L_diffODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_diffODR_NO == null) {
			l_diffODR_NO = new ArrayList();
		} else {
			l_diffODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_diffODR_NO.add(((KU0030010Struct) list.get(i)).getdiffODR_NO());
		}
		return size;
	}
	public int setL2L_diffPART_DLV_SEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_diffPART_DLV_SEQ_NO == null) {
			l_diffPART_DLV_SEQ_NO = new ArrayList();
		} else {
			l_diffPART_DLV_SEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_diffPART_DLV_SEQ_NO.add(((KU0030010Struct) list.get(i)).getdiffPART_DLV_SEQ_NO());
		}
		return size;
	}
	public int setL2L_diffSLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_diffSLIP_CD == null) {
			l_diffSLIP_CD = new ArrayList();
		} else {
			l_diffSLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_diffSLIP_CD.add(((KU0030010Struct) list.get(i)).getdiffSLIP_CD());
		}
		return size;
	}
	public int setL2L_diffITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_diffITEM_CD == null) {
			l_diffITEM_CD = new ArrayList();
		} else {
			l_diffITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_diffITEM_CD.add(((KU0030010Struct) list.get(i)).getdiffITEM_CD());
		}
		return size;
	}
	public int setL2L_diffJOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_diffJOB_ODR_CD == null) {
			l_diffJOB_ODR_CD = new ArrayList();
		} else {
			l_diffJOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_diffJOB_ODR_CD.add(((KU0030010Struct) list.get(i)).getdiffJOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_diffCUST_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_diffCUST_ITEM_CD == null) {
			l_diffCUST_ITEM_CD = new ArrayList();
		} else {
			l_diffCUST_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_diffCUST_ITEM_CD.add(((KU0030010Struct) list.get(i)).getdiffCUST_ITEM_CD());
		}
		return size;
	}
	public int setL2L_diffCUST_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_diffCUST_ODR_NO == null) {
			l_diffCUST_ODR_NO = new ArrayList();
		} else {
			l_diffCUST_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_diffCUST_ODR_NO.add(((KU0030010Struct) list.get(i)).getdiffCUST_ODR_NO());
		}
		return size;
	}
	public int setL2L_diffCUST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_diffCUST_CD == null) {
			l_diffCUST_CD = new ArrayList();
		} else {
			l_diffCUST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_diffCUST_CD.add(((KU0030010Struct) list.get(i)).getdiffCUST_CD());
		}
		return size;
	}
	public int setL2L_diffCUST_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_diffCUST_NAME == null) {
			l_diffCUST_NAME = new ArrayList();
		} else {
			l_diffCUST_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_diffCUST_NAME.add(((KU0030010Struct) list.get(i)).getdiffCUST_NAME());
		}
		return size;
	}
	public int setL2L_diffCUST_CHRG_PSN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_diffCUST_CHRG_PSN_CD == null) {
			l_diffCUST_CHRG_PSN_CD = new ArrayList();
		} else {
			l_diffCUST_CHRG_PSN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_diffCUST_CHRG_PSN_CD.add(((KU0030010Struct) list.get(i)).getdiffCUST_CHRG_PSN_CD());
		}
		return size;
	}
	public int setL2L_diffSHIP_ODR_ISS_PSN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_diffSHIP_ODR_ISS_PSN_CD == null) {
			l_diffSHIP_ODR_ISS_PSN_CD = new ArrayList();
		} else {
			l_diffSHIP_ODR_ISS_PSN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_diffSHIP_ODR_ISS_PSN_CD.add(((KU0030010Struct) list.get(i)).getdiffSHIP_ODR_ISS_PSN_CD());
		}
		return size;
	}
	public int setL2L_diffDLV_LOC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_diffDLV_LOC_CD == null) {
			l_diffDLV_LOC_CD = new ArrayList();
		} else {
			l_diffDLV_LOC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_diffDLV_LOC_CD.add(((KU0030010Struct) list.get(i)).getdiffDLV_LOC_CD());
		}
		return size;
	}
	public int setL2L_diffDEPO_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_diffDEPO_TYP == null) {
			l_diffDEPO_TYP = new ArrayList();
		} else {
			l_diffDEPO_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_diffDEPO_TYP.add(((KU0030010Struct) list.get(i)).getdiffDEPO_TYP());
		}
		return size;
	}
	public int setL2L_diffDESINATED_SHIP_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_diffDESINATED_SHIP_DATE == null) {
			l_diffDESINATED_SHIP_DATE = new ArrayList();
		} else {
			l_diffDESINATED_SHIP_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_diffDESINATED_SHIP_DATE.add(((KU0030010Struct) list.get(i)).getdiffDESINATED_SHIP_DATE());
		}
		return size;
	}
	public int setL2L_diffSCDL_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_diffSCDL_DLV_DATE == null) {
			l_diffSCDL_DLV_DATE = new ArrayList();
		} else {
			l_diffSCDL_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_diffSCDL_DLV_DATE.add(((KU0030010Struct) list.get(i)).getdiffSCDL_DLV_DATE());
		}
		return size;
	}
	public int setL2L_diffTOTAL_SHIP_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_diffTOTAL_SHIP_QTY == null) {
			l_diffTOTAL_SHIP_QTY = new ArrayList();
		} else {
			l_diffTOTAL_SHIP_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_diffTOTAL_SHIP_QTY.add(((KU0030010Struct) list.get(i)).getdiffTOTAL_SHIP_QTY());
		}
		return size;
	}
	public int setL2L_diffRETURN_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_diffRETURN_QTY == null) {
			l_diffRETURN_QTY = new ArrayList();
		} else {
			l_diffRETURN_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_diffRETURN_QTY.add(((KU0030010Struct) list.get(i)).getdiffRETURN_QTY());
		}
		return size;
	}
	public int setL2L_diffUNIT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_diffUNIT_CD == null) {
			l_diffUNIT_CD = new ArrayList();
		} else {
			l_diffUNIT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_diffUNIT_CD.add(((KU0030010Struct) list.get(i)).getdiffUNIT_CD());
		}
		return size;
	}
	public int setL2L_diffUNIT_PRICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_diffUNIT_PRICE == null) {
			l_diffUNIT_PRICE = new ArrayList();
		} else {
			l_diffUNIT_PRICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_diffUNIT_PRICE.add(((KU0030010Struct) list.get(i)).getdiffUNIT_PRICE());
		}
		return size;
	}
	public int setL2L_diffCURRENCY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_diffCURRENCY_CD == null) {
			l_diffCURRENCY_CD = new ArrayList();
		} else {
			l_diffCURRENCY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_diffCURRENCY_CD.add(((KU0030010Struct) list.get(i)).getdiffCURRENCY_CD());
		}
		return size;
	}
	public int setL2L_diffLOC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_diffLOC_CD == null) {
			l_diffLOC_CD = new ArrayList();
		} else {
			l_diffLOC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_diffLOC_CD.add(((KU0030010Struct) list.get(i)).getdiffLOC_CD());
		}
		return size;
	}
	public int setL2L_diffPKG_UNIT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_diffPKG_UNIT_QTY == null) {
			l_diffPKG_UNIT_QTY = new ArrayList();
		} else {
			l_diffPKG_UNIT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_diffPKG_UNIT_QTY.add(((KU0030010Struct) list.get(i)).getdiffPKG_UNIT_QTY());
		}
		return size;
	}
	public int setL2L_diffREMARKS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_diffREMARKS == null) {
			l_diffREMARKS = new ArrayList();
		} else {
			l_diffREMARKS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_diffREMARKS.add(((KU0030010Struct) list.get(i)).getdiffREMARKS());
		}
		return size;
	}
	public int setL2L_diffDLV_KEY_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_diffDLV_KEY_NO == null) {
			l_diffDLV_KEY_NO = new ArrayList();
		} else {
			l_diffDLV_KEY_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_diffDLV_KEY_NO.add(((KU0030010Struct) list.get(i)).getdiffDLV_KEY_NO());
		}
		return size;
	}
	public int setL2L_diffPART_DLV_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_diffPART_DLV_COUNT == null) {
			l_diffPART_DLV_COUNT = new ArrayList();
		} else {
			l_diffPART_DLV_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_diffPART_DLV_COUNT.add(((KU0030010Struct) list.get(i)).getdiffPART_DLV_COUNT());
		}
		return size;
	}
	public int setL2L_diffTRANSPORT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_diffTRANSPORT_CD == null) {
			l_diffTRANSPORT_CD = new ArrayList();
		} else {
			l_diffTRANSPORT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_diffTRANSPORT_CD.add(((KU0030010Struct) list.get(i)).getdiffTRANSPORT_CD());
		}
		return size;
	}
	public int setL2L_diffTRANSPORT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_diffTRANSPORT_TYP == null) {
			l_diffTRANSPORT_TYP = new ArrayList();
		} else {
			l_diffTRANSPORT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_diffTRANSPORT_TYP.add(((KU0030010Struct) list.get(i)).getdiffTRANSPORT_TYP());
		}
		return size;
	}
	public int setL2L_diffALLCT_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_diffALLCT_WH_CD == null) {
			l_diffALLCT_WH_CD = new ArrayList();
		} else {
			l_diffALLCT_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_diffALLCT_WH_CD.add(((KU0030010Struct) list.get(i)).getdiffALLCT_WH_CD());
		}
		return size;
	}
	public int setL2L_diffTRANSFER_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_diffTRANSFER_WH_CD == null) {
			l_diffTRANSFER_WH_CD = new ArrayList();
		} else {
			l_diffTRANSFER_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_diffTRANSFER_WH_CD.add(((KU0030010Struct) list.get(i)).getdiffTRANSFER_WH_CD());
		}
		return size;
	}
	public int setL2L_diffDIRECT_DLV_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_diffDIRECT_DLV_FLG == null) {
			l_diffDIRECT_DLV_FLG = new ArrayList();
		} else {
			l_diffDIRECT_DLV_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_diffDIRECT_DLV_FLG.add(((KU0030010Struct) list.get(i)).getdiffDIRECT_DLV_FLG());
		}
		return size;
	}
	public int setL2L_diffENTRY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_diffENTRY_TYP == null) {
			l_diffENTRY_TYP = new ArrayList();
		} else {
			l_diffENTRY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_diffENTRY_TYP.add(((KU0030010Struct) list.get(i)).getdiffENTRY_TYP());
		}
		return size;
	}
	public int setL2L_diffPRINT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_diffPRINT_FLG == null) {
			l_diffPRINT_FLG = new ArrayList();
		} else {
			l_diffPRINT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_diffPRINT_FLG.add(((KU0030010Struct) list.get(i)).getdiffPRINT_FLG());
		}
		return size;
	}
	public int setL2L_diffSHIP_CMPLT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_diffSHIP_CMPLT_FLG == null) {
			l_diffSHIP_CMPLT_FLG = new ArrayList();
		} else {
			l_diffSHIP_CMPLT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_diffSHIP_CMPLT_FLG.add(((KU0030010Struct) list.get(i)).getdiffSHIP_CMPLT_FLG());
		}
		return size;
	}
	public int setL2L_diffDEPO_TRANSFER_PROC_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_diffDEPO_TRANSFER_PROC_FLG == null) {
			l_diffDEPO_TRANSFER_PROC_FLG = new ArrayList();
		} else {
			l_diffDEPO_TRANSFER_PROC_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_diffDEPO_TRANSFER_PROC_FLG.add(((KU0030010Struct) list.get(i)).getdiffDEPO_TRANSFER_PROC_FLG());
		}
		return size;
	}
	public int setL2L_diffDEL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_diffDEL_FLG == null) {
			l_diffDEL_FLG = new ArrayList();
		} else {
			l_diffDEL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_diffDEL_FLG.add(((KU0030010Struct) list.get(i)).getdiffDEL_FLG());
		}
		return size;
	}
	public int setL2L_diffuptOdr_SHIP_CNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_diffuptOdr_SHIP_CNT == null) {
			l_diffuptOdr_SHIP_CNT = new ArrayList();
		} else {
			l_diffuptOdr_SHIP_CNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_diffuptOdr_SHIP_CNT.add(((KU0030010Struct) list.get(i)).getdiffuptOdr_SHIP_CNT());
		}
		return size;
	}
	public int setL2L_diffuptOdr_PART_DLV_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_diffuptOdr_PART_DLV_COUNT == null) {
			l_diffuptOdr_PART_DLV_COUNT = new ArrayList();
		} else {
			l_diffuptOdr_PART_DLV_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_diffuptOdr_PART_DLV_COUNT.add(((KU0030010Struct) list.get(i)).getdiffuptOdr_PART_DLV_COUNT());
		}
		return size;
	}
	public int setL2L_diffuptOdr_IN_ODRNO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_diffuptOdr_IN_ODRNO == null) {
			l_diffuptOdr_IN_ODRNO = new ArrayList();
		} else {
			l_diffuptOdr_IN_ODRNO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_diffuptOdr_IN_ODRNO.add(((KU0030010Struct) list.get(i)).getdiffuptOdr_IN_ODRNO());
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
			l_in_tShipSlip_SLIP_CD.add(((KU0030010Struct) list.get(i)).getin_tShipSlip_SLIP_CD());
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
			l_in_tShipSlip_ITEM_CD.add(((KU0030010Struct) list.get(i)).getin_tShipSlip_ITEM_CD());
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
			l_in_tShipSlip_CUST_ITEM_CD.add(((KU0030010Struct) list.get(i)).getin_tShipSlip_CUST_ITEM_CD());
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
			l_in_tShipSlip_PART_NAME.add(((KU0030010Struct) list.get(i)).getin_tShipSlip_PART_NAME());
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
			l_in_tShipSlip_CUST_ODR_NO.add(((KU0030010Struct) list.get(i)).getin_tShipSlip_CUST_ODR_NO());
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
			l_in_tShipSlip_CUST_CD.add(((KU0030010Struct) list.get(i)).getin_tShipSlip_CUST_CD());
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
			l_in_tShipSlip_CUST_NAME.add(((KU0030010Struct) list.get(i)).getin_tShipSlip_CUST_NAME());
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
			l_in_tShipSlip_DLV_LOC_CD.add(((KU0030010Struct) list.get(i)).getin_tShipSlip_DLV_LOC_CD());
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
			l_in_tShipSlip_DLV_LOC_NAME_KANJI.add(((KU0030010Struct) list.get(i)).getin_tShipSlip_DLV_LOC_NAME_KANJI());
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
			l_in_tShipSlip_CUS_DLV_KEY_CD.add(((KU0030010Struct) list.get(i)).getin_tShipSlip_CUS_DLV_KEY_CD());
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
			l_in_tShipSlip_DESINATED_SHIP_DATE.add(((KU0030010Struct) list.get(i)).getin_tShipSlip_DESINATED_SHIP_DATE());
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
			l_in_tShipSlip_DESINATED_DLV_DATE.add(((KU0030010Struct) list.get(i)).getin_tShipSlip_DESINATED_DLV_DATE());
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
			l_in_tShipSlip_SCDL_DLV_DATE.add(((KU0030010Struct) list.get(i)).getin_tShipSlip_SCDL_DLV_DATE());
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
			l_in_tShipSlip_SHIP_ODR_QTY.add(((KU0030010Struct) list.get(i)).getin_tShipSlip_SHIP_ODR_QTY());
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
			l_in_tShipSlip_UNIT_CD.add(((KU0030010Struct) list.get(i)).getin_tShipSlip_UNIT_CD());
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
			l_in_tShipSlip_UNIT_PRICE.add(((KU0030010Struct) list.get(i)).getin_tShipSlip_UNIT_PRICE());
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
			l_in_tShipSlip_SHIP_ODR_AMOUNT.add(((KU0030010Struct) list.get(i)).getin_tShipSlip_SHIP_ODR_AMOUNT());
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
			l_in_tShipSlip_TAX_AMOUNT.add(((KU0030010Struct) list.get(i)).getin_tShipSlip_TAX_AMOUNT());
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
			l_in_tShipSlip_INSPC_TYP.add(((KU0030010Struct) list.get(i)).getin_tShipSlip_INSPC_TYP());
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
			l_in_tShipSlip_CLIENT_REMARK_KANJI.add(((KU0030010Struct) list.get(i)).getin_tShipSlip_CLIENT_REMARK_KANJI());
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
			l_in_tShipSlip_CLIENT_BARCODE_INF.add(((KU0030010Struct) list.get(i)).getin_tShipSlip_CLIENT_BARCODE_INF());
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
			l_in_tShipSlip_PRINT_FLG.add(((KU0030010Struct) list.get(i)).getin_tShipSlip_PRINT_FLG());
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
			l_in_tShipSlip_DEL_FLG.add(((KU0030010Struct) list.get(i)).getin_tShipSlip_DEL_FLG());
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
			l_in_tShipSlip_BUYER_NAME.add(((KU0030010Struct) list.get(i)).getin_tShipSlip_BUYER_NAME());
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
			l_in_tShipSlip_PUCH_ODR_QTY_TOTAL.add(((KU0030010Struct) list.get(i)).getin_tShipSlip_PUCH_ODR_QTY_TOTAL());
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
			l_in_tShipSlip_DLV_ODR_QTY.add(((KU0030010Struct) list.get(i)).getin_tShipSlip_DLV_ODR_QTY());
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
			l_in_tShipSlip_SHIP_ODR_AMOUNT_TAX.add(((KU0030010Struct) list.get(i)).getin_tShipSlip_SHIP_ODR_AMOUNT_TAX());
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
			l_in_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT.add(((KU0030010Struct) list.get(i)).getin_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT());
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
			l_in_tShipSlip_INTERNAL_TAX_SALES_AMOUNT.add(((KU0030010Struct) list.get(i)).getin_tShipSlip_INTERNAL_TAX_SALES_AMOUNT());
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
			l_in_tShipSlip_TAXFREE_SALES_AMOUNT.add(((KU0030010Struct) list.get(i)).getin_tShipSlip_TAXFREE_SALES_AMOUNT());
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
			l_in_tShipSlip_TAX_CREDIT_SALES_AMOUNT.add(((KU0030010Struct) list.get(i)).getin_tShipSlip_TAX_CREDIT_SALES_AMOUNT());
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
			l_in_tShipSlip_EXTERNAL_TAX_AMOUNT.add(((KU0030010Struct) list.get(i)).getin_tShipSlip_EXTERNAL_TAX_AMOUNT());
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
			l_in_tShipSlip_INTERNAL_TAX_AMOUNT.add(((KU0030010Struct) list.get(i)).getin_tShipSlip_INTERNAL_TAX_AMOUNT());
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
			l_in_tShipSlip_TAX_AMOUNT_1.add(((KU0030010Struct) list.get(i)).getin_tShipSlip_TAX_AMOUNT_1());
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
			l_in_tShipSlip_TAX_AMOUNT_2.add(((KU0030010Struct) list.get(i)).getin_tShipSlip_TAX_AMOUNT_2());
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
			l_in_tShipSlip_TAX_AMOUNT_3.add(((KU0030010Struct) list.get(i)).getin_tShipSlip_TAX_AMOUNT_3());
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
			l_in_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT.add(((KU0030010Struct) list.get(i)).getin_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_up_tShipSlip_SLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_up_tShipSlip_SLIP_CD == null) {
			l_up_tShipSlip_SLIP_CD = new ArrayList();
		} else {
			l_up_tShipSlip_SLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_up_tShipSlip_SLIP_CD.add(((KU0030010Struct) list.get(i)).getup_tShipSlip_SLIP_CD());
		}
		return size;
	}
	public int setL2L_updiffSHIP_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_updiffSHIP_ODR_QTY == null) {
			l_updiffSHIP_ODR_QTY = new ArrayList();
		} else {
			l_updiffSHIP_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_updiffSHIP_ODR_QTY.add(((KU0030010Struct) list.get(i)).getupdiffSHIP_ODR_QTY());
		}
		return size;
	}
	public int setL2L_updiffSHIP_ODR_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_updiffSHIP_ODR_AMOUNT == null) {
			l_updiffSHIP_ODR_AMOUNT = new ArrayList();
		} else {
			l_updiffSHIP_ODR_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_updiffSHIP_ODR_AMOUNT.add(((KU0030010Struct) list.get(i)).getupdiffSHIP_ODR_AMOUNT());
		}
		return size;
	}
	public int setL2L_updiffTAX_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_updiffTAX_AMOUNT == null) {
			l_updiffTAX_AMOUNT = new ArrayList();
		} else {
			l_updiffTAX_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_updiffTAX_AMOUNT.add(((KU0030010Struct) list.get(i)).getupdiffTAX_AMOUNT());
		}
		return size;
	}
	public int setL2L_updiffSHIP_ODR_AMOUNT_TAX(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_updiffSHIP_ODR_AMOUNT_TAX == null) {
			l_updiffSHIP_ODR_AMOUNT_TAX = new ArrayList();
		} else {
			l_updiffSHIP_ODR_AMOUNT_TAX.clear();
		}
		for (int i = 0; i < size; i++) {
			l_updiffSHIP_ODR_AMOUNT_TAX.add(((KU0030010Struct) list.get(i)).getupdiffSHIP_ODR_AMOUNT_TAX());
		}
		return size;
	}
	public int setL2L_updiffEXTERNAL_TAX_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_updiffEXTERNAL_TAX_SALES_AMOUNT == null) {
			l_updiffEXTERNAL_TAX_SALES_AMOUNT = new ArrayList();
		} else {
			l_updiffEXTERNAL_TAX_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_updiffEXTERNAL_TAX_SALES_AMOUNT.add(((KU0030010Struct) list.get(i)).getupdiffEXTERNAL_TAX_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_updiffINTERNAL_TAX_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_updiffINTERNAL_TAX_SALES_AMOUNT == null) {
			l_updiffINTERNAL_TAX_SALES_AMOUNT = new ArrayList();
		} else {
			l_updiffINTERNAL_TAX_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_updiffINTERNAL_TAX_SALES_AMOUNT.add(((KU0030010Struct) list.get(i)).getupdiffINTERNAL_TAX_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_updiffTAXFREE_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_updiffTAXFREE_SALES_AMOUNT == null) {
			l_updiffTAXFREE_SALES_AMOUNT = new ArrayList();
		} else {
			l_updiffTAXFREE_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_updiffTAXFREE_SALES_AMOUNT.add(((KU0030010Struct) list.get(i)).getupdiffTAXFREE_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_updiffTAX_CREDIT_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_updiffTAX_CREDIT_SALES_AMOUNT == null) {
			l_updiffTAX_CREDIT_SALES_AMOUNT = new ArrayList();
		} else {
			l_updiffTAX_CREDIT_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_updiffTAX_CREDIT_SALES_AMOUNT.add(((KU0030010Struct) list.get(i)).getupdiffTAX_CREDIT_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_updiffEXTERNAL_TAX_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_updiffEXTERNAL_TAX_AMOUNT == null) {
			l_updiffEXTERNAL_TAX_AMOUNT = new ArrayList();
		} else {
			l_updiffEXTERNAL_TAX_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_updiffEXTERNAL_TAX_AMOUNT.add(((KU0030010Struct) list.get(i)).getupdiffEXTERNAL_TAX_AMOUNT());
		}
		return size;
	}
	public int setL2L_updiffINTERNAL_TAX_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_updiffINTERNAL_TAX_AMOUNT == null) {
			l_updiffINTERNAL_TAX_AMOUNT = new ArrayList();
		} else {
			l_updiffINTERNAL_TAX_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_updiffINTERNAL_TAX_AMOUNT.add(((KU0030010Struct) list.get(i)).getupdiffINTERNAL_TAX_AMOUNT());
		}
		return size;
	}
	public int setL2L_updiffTAX_AMOUNT_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_updiffTAX_AMOUNT_1 == null) {
			l_updiffTAX_AMOUNT_1 = new ArrayList();
		} else {
			l_updiffTAX_AMOUNT_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_updiffTAX_AMOUNT_1.add(((KU0030010Struct) list.get(i)).getupdiffTAX_AMOUNT_1());
		}
		return size;
	}
	public int setL2L_updiffTAX_AMOUNT_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_updiffTAX_AMOUNT_2 == null) {
			l_updiffTAX_AMOUNT_2 = new ArrayList();
		} else {
			l_updiffTAX_AMOUNT_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_updiffTAX_AMOUNT_2.add(((KU0030010Struct) list.get(i)).getupdiffTAX_AMOUNT_2());
		}
		return size;
	}
	public int setL2L_updiffTAX_AMOUNT_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_updiffTAX_AMOUNT_3 == null) {
			l_updiffTAX_AMOUNT_3 = new ArrayList();
		} else {
			l_updiffTAX_AMOUNT_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_updiffTAX_AMOUNT_3.add(((KU0030010Struct) list.get(i)).getupdiffTAX_AMOUNT_3());
		}
		return size;
	}
	public int setL2L_updiffOWN_CUR_TAXCREDIT_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_updiffOWN_CUR_TAXCREDIT_SALES_AMOUNT == null) {
			l_updiffOWN_CUR_TAXCREDIT_SALES_AMOUNT = new ArrayList();
		} else {
			l_updiffOWN_CUR_TAXCREDIT_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_updiffOWN_CUR_TAXCREDIT_SALES_AMOUNT.add(((KU0030010Struct) list.get(i)).getupdiffOWN_CUR_TAXCREDIT_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_updiffSLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_updiffSLIP_CD == null) {
			l_updiffSLIP_CD = new ArrayList();
		} else {
			l_updiffSLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_updiffSLIP_CD.add(((KU0030010Struct) list.get(i)).getupdiffSLIP_CD());
		}
		return size;
	}
	public int setL2L_PAST_RESULT_ENTRY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PAST_RESULT_ENTRY_TYP == null) {
			l_PAST_RESULT_ENTRY_TYP = new ArrayList();
		} else {
			l_PAST_RESULT_ENTRY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PAST_RESULT_ENTRY_TYP.add(((KU0030010Struct) list.get(i)).getPAST_RESULT_ENTRY_TYP());
		}
		return size;
	}
	public int setL2L_PROC_EXEC_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_EXEC_DATE == null) {
			l_PROC_EXEC_DATE = new ArrayList();
		} else {
			l_PROC_EXEC_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_EXEC_DATE.add(((KU0030010Struct) list.get(i)).getPROC_EXEC_DATE());
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
			l_PLANT_CD.add(((KU0030010Struct) list.get(i)).getPLANT_CD());
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
			l_mCustBase_TRANSPORT_LT.add(((KU0030010Struct) list.get(i)).getmCustBase_TRANSPORT_LT());
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
			l_mCustBase_IN_COMPANYCD.add(((KU0030010Struct) list.get(i)).getmCustBase_IN_COMPANYCD());
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
			l_mCustBase_IN_CUSTCD.add(((KU0030010Struct) list.get(i)).getmCustBase_IN_CUSTCD());
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
			l_mCustBase_IN_DLVLOCCD.add(((KU0030010Struct) list.get(i)).getmCustBase_IN_DLVLOCCD());
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
			l_strSYUKA_LT.add(((KU0030010Struct) list.get(i)).getstrSYUKA_LT());
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
			l_strTaxIN_COMPANYCD.add(((KU0030010Struct) list.get(i)).getstrTaxIN_COMPANYCD());
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
			l_strTaxIN_CUSTCD.add(((KU0030010Struct) list.get(i)).getstrTaxIN_CUSTCD());
		}
		return size;
	}
	public int setL2L_g_CUST_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_g_CUST_ITEM_CD == null) {
			l_g_CUST_ITEM_CD = new ArrayList();
		} else {
			l_g_CUST_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_g_CUST_ITEM_CD.add(((KU0030010Struct) list.get(i)).getg_CUST_ITEM_CD());
		}
		return size;
	}
	public int setL2L_strT_ODR_TAX(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strT_ODR_TAX == null) {
			l_strT_ODR_TAX = new ArrayList();
		} else {
			l_strT_ODR_TAX.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strT_ODR_TAX.add(((KU0030010Struct) list.get(i)).getstrT_ODR_TAX());
		}
		return size;
	}
	public int setL2L_g_SLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_g_SLIP_CD == null) {
			l_g_SLIP_CD = new ArrayList();
		} else {
			l_g_SLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_g_SLIP_CD.add(((KU0030010Struct) list.get(i)).getg_SLIP_CD());
		}
		return size;
	}
	public int setL2L_getTship_SHIP_SEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_getTship_SHIP_SEQ_NO == null) {
			l_getTship_SHIP_SEQ_NO = new ArrayList();
		} else {
			l_getTship_SHIP_SEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_getTship_SHIP_SEQ_NO.add(((KU0030010Struct) list.get(i)).getgetTship_SHIP_SEQ_NO());
		}
		return size;
	}
	public int setL2L_chkLOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_chkLOT_NO == null) {
			l_chkLOT_NO = new ArrayList();
		} else {
			l_chkLOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_chkLOT_NO.add(((KU0030010Struct) list.get(i)).getchkLOT_NO());
		}
		return size;
	}
	public int setL2L_chkITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_chkITEM_CD == null) {
			l_chkITEM_CD = new ArrayList();
		} else {
			l_chkITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_chkITEM_CD.add(((KU0030010Struct) list.get(i)).getchkITEM_CD());
		}
		return size;
	}
	public int setL2L_getQtySTOCK_ON_HAND_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_getQtySTOCK_ON_HAND_QTY == null) {
			l_getQtySTOCK_ON_HAND_QTY = new ArrayList();
		} else {
			l_getQtySTOCK_ON_HAND_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_getQtySTOCK_ON_HAND_QTY.add(((KU0030010Struct) list.get(i)).getgetQtySTOCK_ON_HAND_QTY());
		}
		return size;
	}
	public int setL2L_getQtyALCD_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_getQtyALCD_QTY == null) {
			l_getQtyALCD_QTY = new ArrayList();
		} else {
			l_getQtyALCD_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_getQtyALCD_QTY.add(((KU0030010Struct) list.get(i)).getgetQtyALCD_QTY());
		}
		return size;
	}
	public int setL2L_getQtyITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_getQtyITEM_CD == null) {
			l_getQtyITEM_CD = new ArrayList();
		} else {
			l_getQtyITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_getQtyITEM_CD.add(((KU0030010Struct) list.get(i)).getgetQtyITEM_CD());
		}
		return size;
	}
	public int setL2L_getQtyWH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_getQtyWH_CD == null) {
			l_getQtyWH_CD = new ArrayList();
		} else {
			l_getQtyWH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_getQtyWH_CD.add(((KU0030010Struct) list.get(i)).getgetQtyWH_CD());
		}
		return size;
	}
	public int setL2L_getQtyLOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_getQtyLOT_NO == null) {
			l_getQtyLOT_NO = new ArrayList();
		} else {
			l_getQtyLOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_getQtyLOT_NO.add(((KU0030010Struct) list.get(i)).getgetQtyLOT_NO());
		}
		return size;
	}
	public int setL2L_readTlotStock_LOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readTlotStock_LOT_NO == null) {
			l_readTlotStock_LOT_NO = new ArrayList();
		} else {
			l_readTlotStock_LOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readTlotStock_LOT_NO.add(((KU0030010Struct) list.get(i)).getreadTlotStock_LOT_NO());
		}
		return size;
	}
	public int setL2L_readTlotStock_STOCK_ON_HAND_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readTlotStock_STOCK_ON_HAND_QTY == null) {
			l_readTlotStock_STOCK_ON_HAND_QTY = new ArrayList();
		} else {
			l_readTlotStock_STOCK_ON_HAND_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readTlotStock_STOCK_ON_HAND_QTY.add(((KU0030010Struct) list.get(i)).getreadTlotStock_STOCK_ON_HAND_QTY());
		}
		return size;
	}
	public int setL2L_readTlotStock_ALCD_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readTlotStock_ALCD_QTY == null) {
			l_readTlotStock_ALCD_QTY = new ArrayList();
		} else {
			l_readTlotStock_ALCD_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readTlotStock_ALCD_QTY.add(((KU0030010Struct) list.get(i)).getreadTlotStock_ALCD_QTY());
		}
		return size;
	}
	public int setL2L_readTlotStock_IN_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readTlotStock_IN_ITEM_CD == null) {
			l_readTlotStock_IN_ITEM_CD = new ArrayList();
		} else {
			l_readTlotStock_IN_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readTlotStock_IN_ITEM_CD.add(((KU0030010Struct) list.get(i)).getreadTlotStock_IN_ITEM_CD());
		}
		return size;
	}
	public int setL2L_readTlotStock_IN_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readTlotStock_IN_WH_CD == null) {
			l_readTlotStock_IN_WH_CD = new ArrayList();
		} else {
			l_readTlotStock_IN_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readTlotStock_IN_WH_CD.add(((KU0030010Struct) list.get(i)).getreadTlotStock_IN_WH_CD());
		}
		return size;
	}
	public int setL2L_readTlotStock_IN_LOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readTlotStock_IN_LOT_NO == null) {
			l_readTlotStock_IN_LOT_NO = new ArrayList();
		} else {
			l_readTlotStock_IN_LOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readTlotStock_IN_LOT_NO.add(((KU0030010Struct) list.get(i)).getreadTlotStock_IN_LOT_NO());
		}
		return size;
	}
	public int setL2L_upTlotStockSTOCK_ON_HAND_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_upTlotStockSTOCK_ON_HAND_QTY == null) {
			l_upTlotStockSTOCK_ON_HAND_QTY = new ArrayList();
		} else {
			l_upTlotStockSTOCK_ON_HAND_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_upTlotStockSTOCK_ON_HAND_QTY.add(((KU0030010Struct) list.get(i)).getupTlotStockSTOCK_ON_HAND_QTY());
		}
		return size;
	}
	public int setL2L_upTlotStockIN_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_upTlotStockIN_ITEM_CD == null) {
			l_upTlotStockIN_ITEM_CD = new ArrayList();
		} else {
			l_upTlotStockIN_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_upTlotStockIN_ITEM_CD.add(((KU0030010Struct) list.get(i)).getupTlotStockIN_ITEM_CD());
		}
		return size;
	}
	public int setL2L_upTlotStockIN_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_upTlotStockIN_WH_CD == null) {
			l_upTlotStockIN_WH_CD = new ArrayList();
		} else {
			l_upTlotStockIN_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_upTlotStockIN_WH_CD.add(((KU0030010Struct) list.get(i)).getupTlotStockIN_WH_CD());
		}
		return size;
	}
	public int setL2L_upTlotStockIN_LOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_upTlotStockIN_LOT_NO == null) {
			l_upTlotStockIN_LOT_NO = new ArrayList();
		} else {
			l_upTlotStockIN_LOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_upTlotStockIN_LOT_NO.add(((KU0030010Struct) list.get(i)).getupTlotStockIN_LOT_NO());
		}
		return size;
	}
	public int setL2L_serLotSTOCK_ON_HAND_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serLotSTOCK_ON_HAND_QTY == null) {
			l_serLotSTOCK_ON_HAND_QTY = new ArrayList();
		} else {
			l_serLotSTOCK_ON_HAND_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serLotSTOCK_ON_HAND_QTY.add(((KU0030010Struct) list.get(i)).getserLotSTOCK_ON_HAND_QTY());
		}
		return size;
	}
	public int setL2L_serLotALCD_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serLotALCD_QTY == null) {
			l_serLotALCD_QTY = new ArrayList();
		} else {
			l_serLotALCD_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serLotALCD_QTY.add(((KU0030010Struct) list.get(i)).getserLotALCD_QTY());
		}
		return size;
	}
	public int setL2L_serLotIN_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serLotIN_ITEM_CD == null) {
			l_serLotIN_ITEM_CD = new ArrayList();
		} else {
			l_serLotIN_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serLotIN_ITEM_CD.add(((KU0030010Struct) list.get(i)).getserLotIN_ITEM_CD());
		}
		return size;
	}
	public int setL2L_serLotIN_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serLotIN_WH_CD == null) {
			l_serLotIN_WH_CD = new ArrayList();
		} else {
			l_serLotIN_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serLotIN_WH_CD.add(((KU0030010Struct) list.get(i)).getserLotIN_WH_CD());
		}
		return size;
	}
	public int setL2L_serLotIN_LOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_serLotIN_LOT_NO == null) {
			l_serLotIN_LOT_NO = new ArrayList();
		} else {
			l_serLotIN_LOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_serLotIN_LOT_NO.add(((KU0030010Struct) list.get(i)).getserLotIN_LOT_NO());
		}
		return size;
	}
	public int setL2L_insertLotStock_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_insertLotStock_ITEM_CD == null) {
			l_insertLotStock_ITEM_CD = new ArrayList();
		} else {
			l_insertLotStock_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_insertLotStock_ITEM_CD.add(((KU0030010Struct) list.get(i)).getinsertLotStock_ITEM_CD());
		}
		return size;
	}
	public int setL2L_insertLotStock_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_insertLotStock_WH_CD == null) {
			l_insertLotStock_WH_CD = new ArrayList();
		} else {
			l_insertLotStock_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_insertLotStock_WH_CD.add(((KU0030010Struct) list.get(i)).getinsertLotStock_WH_CD());
		}
		return size;
	}
	public int setL2L_insertLotStock_LOT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_insertLotStock_LOT_CD == null) {
			l_insertLotStock_LOT_CD = new ArrayList();
		} else {
			l_insertLotStock_LOT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_insertLotStock_LOT_CD.add(((KU0030010Struct) list.get(i)).getinsertLotStock_LOT_CD());
		}
		return size;
	}
	public int setL2L_insertLotStock_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_insertLotStock_PLANT_CD == null) {
			l_insertLotStock_PLANT_CD = new ArrayList();
		} else {
			l_insertLotStock_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_insertLotStock_PLANT_CD.add(((KU0030010Struct) list.get(i)).getinsertLotStock_PLANT_CD());
		}
		return size;
	}
	public int setL2L_insertLotStock_STOCK_ON_HAND_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_insertLotStock_STOCK_ON_HAND_QTY == null) {
			l_insertLotStock_STOCK_ON_HAND_QTY = new ArrayList();
		} else {
			l_insertLotStock_STOCK_ON_HAND_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_insertLotStock_STOCK_ON_HAND_QTY.add(((KU0030010Struct) list.get(i)).getinsertLotStock_STOCK_ON_HAND_QTY());
		}
		return size;
	}
	public int setL2L_insertLotStock_DEFECT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_insertLotStock_DEFECT_QTY == null) {
			l_insertLotStock_DEFECT_QTY = new ArrayList();
		} else {
			l_insertLotStock_DEFECT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_insertLotStock_DEFECT_QTY.add(((KU0030010Struct) list.get(i)).getinsertLotStock_DEFECT_QTY());
		}
		return size;
	}
	public int setL2L_insertLotStock_ALCD_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_insertLotStock_ALCD_QTY == null) {
			l_insertLotStock_ALCD_QTY = new ArrayList();
		} else {
			l_insertLotStock_ALCD_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_insertLotStock_ALCD_QTY.add(((KU0030010Struct) list.get(i)).getinsertLotStock_ALCD_QTY());
		}
		return size;
	}
	public int setL2L_insTshipInst_SHIP_SEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_insTshipInst_SHIP_SEQ_NO == null) {
			l_insTshipInst_SHIP_SEQ_NO = new ArrayList();
		} else {
			l_insTshipInst_SHIP_SEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_insTshipInst_SHIP_SEQ_NO.add(((KU0030010Struct) list.get(i)).getinsTshipInst_SHIP_SEQ_NO());
		}
		return size;
	}
	public int setL2L_insTshipInst_SHIP_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_insTshipInst_SHIP_ODR_NO == null) {
			l_insTshipInst_SHIP_ODR_NO = new ArrayList();
		} else {
			l_insTshipInst_SHIP_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_insTshipInst_SHIP_ODR_NO.add(((KU0030010Struct) list.get(i)).getinsTshipInst_SHIP_ODR_NO());
		}
		return size;
	}
	public int setL2L_insTshipInst_LOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_insTshipInst_LOT_NO == null) {
			l_insTshipInst_LOT_NO = new ArrayList();
		} else {
			l_insTshipInst_LOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_insTshipInst_LOT_NO.add(((KU0030010Struct) list.get(i)).getinsTshipInst_LOT_NO());
		}
		return size;
	}
	public int setL2L_insTshipInst_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_insTshipInst_ITEM_CD == null) {
			l_insTshipInst_ITEM_CD = new ArrayList();
		} else {
			l_insTshipInst_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_insTshipInst_ITEM_CD.add(((KU0030010Struct) list.get(i)).getinsTshipInst_ITEM_CD());
		}
		return size;
	}
	public int setL2L_insTshipInst_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_insTshipInst_WH_CD == null) {
			l_insTshipInst_WH_CD = new ArrayList();
		} else {
			l_insTshipInst_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_insTshipInst_WH_CD.add(((KU0030010Struct) list.get(i)).getinsTshipInst_WH_CD());
		}
		return size;
	}
	public int setL2L_insTshipInst_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_insTshipInst_ODR_NO == null) {
			l_insTshipInst_ODR_NO = new ArrayList();
		} else {
			l_insTshipInst_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_insTshipInst_ODR_NO.add(((KU0030010Struct) list.get(i)).getinsTshipInst_ODR_NO());
		}
		return size;
	}
	public int setL2L_insTshipInst_SLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_insTshipInst_SLIP_CD == null) {
			l_insTshipInst_SLIP_CD = new ArrayList();
		} else {
			l_insTshipInst_SLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_insTshipInst_SLIP_CD.add(((KU0030010Struct) list.get(i)).getinsTshipInst_SLIP_CD());
		}
		return size;
	}
	public int setL2L_insTshipInst_SHIP_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_insTshipInst_SHIP_QTY == null) {
			l_insTshipInst_SHIP_QTY = new ArrayList();
		} else {
			l_insTshipInst_SHIP_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_insTshipInst_SHIP_QTY.add(((KU0030010Struct) list.get(i)).getinsTshipInst_SHIP_QTY());
		}
		return size;
	}
	public int setL2L_insTshipInst_SHIP_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_insTshipInst_SHIP_DATE == null) {
			l_insTshipInst_SHIP_DATE = new ArrayList();
		} else {
			l_insTshipInst_SHIP_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_insTshipInst_SHIP_DATE.add(((KU0030010Struct) list.get(i)).getinsTshipInst_SHIP_DATE());
		}
		return size;
	}
	public int setL2L_delTshipInstIN_SHIP_SEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_delTshipInstIN_SHIP_SEQ_NO == null) {
			l_delTshipInstIN_SHIP_SEQ_NO = new ArrayList();
		} else {
			l_delTshipInstIN_SHIP_SEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_delTshipInstIN_SHIP_SEQ_NO.add(((KU0030010Struct) list.get(i)).getdelTshipInstIN_SHIP_SEQ_NO());
		}
		return size;
	}
	public int setL2L_delTshipInstIN_LOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_delTshipInstIN_LOT_NO == null) {
			l_delTshipInstIN_LOT_NO = new ArrayList();
		} else {
			l_delTshipInstIN_LOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_delTshipInstIN_LOT_NO.add(((KU0030010Struct) list.get(i)).getdelTshipInstIN_LOT_NO());
		}
		return size;
	}
	public int setL2L_tlotTrace_FROM_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tlotTrace_FROM_ITEM_CD == null) {
			l_tlotTrace_FROM_ITEM_CD = new ArrayList();
		} else {
			l_tlotTrace_FROM_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tlotTrace_FROM_ITEM_CD.add(((KU0030010Struct) list.get(i)).gettlotTrace_FROM_ITEM_CD());
		}
		return size;
	}
	public int setL2L_tlotTrace_FROM_LOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tlotTrace_FROM_LOT_NO == null) {
			l_tlotTrace_FROM_LOT_NO = new ArrayList();
		} else {
			l_tlotTrace_FROM_LOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tlotTrace_FROM_LOT_NO.add(((KU0030010Struct) list.get(i)).gettlotTrace_FROM_LOT_NO());
		}
		return size;
	}
	public int setL2L_tlotTrace_TO_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tlotTrace_TO_ITEM_CD == null) {
			l_tlotTrace_TO_ITEM_CD = new ArrayList();
		} else {
			l_tlotTrace_TO_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tlotTrace_TO_ITEM_CD.add(((KU0030010Struct) list.get(i)).gettlotTrace_TO_ITEM_CD());
		}
		return size;
	}
	public int setL2L_tlotTrace_TO_LOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tlotTrace_TO_LOT_NO == null) {
			l_tlotTrace_TO_LOT_NO = new ArrayList();
		} else {
			l_tlotTrace_TO_LOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tlotTrace_TO_LOT_NO.add(((KU0030010Struct) list.get(i)).gettlotTrace_TO_LOT_NO());
		}
		return size;
	}
	public int setL2L_tlotTrace_LOT_TRACE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tlotTrace_LOT_TRACE_TYP == null) {
			l_tlotTrace_LOT_TRACE_TYP = new ArrayList();
		} else {
			l_tlotTrace_LOT_TRACE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tlotTrace_LOT_TRACE_TYP.add(((KU0030010Struct) list.get(i)).gettlotTrace_LOT_TRACE_TYP());
		}
		return size;
	}
	public int setL2L_tlotTrace_CUST_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tlotTrace_CUST_ODR_NO == null) {
			l_tlotTrace_CUST_ODR_NO = new ArrayList();
		} else {
			l_tlotTrace_CUST_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tlotTrace_CUST_ODR_NO.add(((KU0030010Struct) list.get(i)).gettlotTrace_CUST_ODR_NO());
		}
		return size;
	}
	public int setL2L_tlotTrace_SLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tlotTrace_SLIP_CD == null) {
			l_tlotTrace_SLIP_CD = new ArrayList();
		} else {
			l_tlotTrace_SLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tlotTrace_SLIP_CD.add(((KU0030010Struct) list.get(i)).gettlotTrace_SLIP_CD());
		}
		return size;
	}
	public int setL2L_tlotTrace_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tlotTrace_ODR_NO == null) {
			l_tlotTrace_ODR_NO = new ArrayList();
		} else {
			l_tlotTrace_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tlotTrace_ODR_NO.add(((KU0030010Struct) list.get(i)).gettlotTrace_ODR_NO());
		}
		return size;
	}
	public int setL2L_readTshipInst_LOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readTshipInst_LOT_NO == null) {
			l_readTshipInst_LOT_NO = new ArrayList();
		} else {
			l_readTshipInst_LOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readTshipInst_LOT_NO.add(((KU0030010Struct) list.get(i)).getreadTshipInst_LOT_NO());
		}
		return size;
	}
	public int setL2L_readTshipInst_SHIP_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readTshipInst_SHIP_QTY == null) {
			l_readTshipInst_SHIP_QTY = new ArrayList();
		} else {
			l_readTshipInst_SHIP_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readTshipInst_SHIP_QTY.add(((KU0030010Struct) list.get(i)).getreadTshipInst_SHIP_QTY());
		}
		return size;
	}
	public int setL2L_readTshipInst_SHIP_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readTshipInst_SHIP_ODR_NO == null) {
			l_readTshipInst_SHIP_ODR_NO = new ArrayList();
		} else {
			l_readTshipInst_SHIP_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readTshipInst_SHIP_ODR_NO.add(((KU0030010Struct) list.get(i)).getreadTshipInst_SHIP_ODR_NO());
		}
		return size;
	}
	public int setL2L_readTshipInst_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readTshipInst_ITEM_CD == null) {
			l_readTshipInst_ITEM_CD = new ArrayList();
		} else {
			l_readTshipInst_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readTshipInst_ITEM_CD.add(((KU0030010Struct) list.get(i)).getreadTshipInst_ITEM_CD());
		}
		return size;
	}
	public int setL2L_readTshipInst_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readTshipInst_WH_CD == null) {
			l_readTshipInst_WH_CD = new ArrayList();
		} else {
			l_readTshipInst_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readTshipInst_WH_CD.add(((KU0030010Struct) list.get(i)).getreadTshipInst_WH_CD());
		}
		return size;
	}
	public int setL2L_readTshipInst_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readTshipInst_ODR_NO == null) {
			l_readTshipInst_ODR_NO = new ArrayList();
		} else {
			l_readTshipInst_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readTshipInst_ODR_NO.add(((KU0030010Struct) list.get(i)).getreadTshipInst_ODR_NO());
		}
		return size;
	}
	public int setL2L_readTshipInst_SLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readTshipInst_SLIP_CD == null) {
			l_readTshipInst_SLIP_CD = new ArrayList();
		} else {
			l_readTshipInst_SLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readTshipInst_SLIP_CD.add(((KU0030010Struct) list.get(i)).getreadTshipInst_SLIP_CD());
		}
		return size;
	}
	public int setL2L_readTshipInst_SHIP_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readTshipInst_SHIP_DATE == null) {
			l_readTshipInst_SHIP_DATE = new ArrayList();
		} else {
			l_readTshipInst_SHIP_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readTshipInst_SHIP_DATE.add(((KU0030010Struct) list.get(i)).getreadTshipInst_SHIP_DATE());
		}
		return size;
	}
	public int setL2L_readTshipInst_IN_SHIP_SEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readTshipInst_IN_SHIP_SEQ_NO == null) {
			l_readTshipInst_IN_SHIP_SEQ_NO = new ArrayList();
		} else {
			l_readTshipInst_IN_SHIP_SEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readTshipInst_IN_SHIP_SEQ_NO.add(((KU0030010Struct) list.get(i)).getreadTshipInst_IN_SHIP_SEQ_NO());
		}
		return size;
	}
	public int setL2L_readTshipInst_IN_LOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readTshipInst_IN_LOT_NO == null) {
			l_readTshipInst_IN_LOT_NO = new ArrayList();
		} else {
			l_readTshipInst_IN_LOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readTshipInst_IN_LOT_NO.add(((KU0030010Struct) list.get(i)).getreadTshipInst_IN_LOT_NO());
		}
		return size;
	}
	public int setL2L_readT_Ship_Inst_Lot_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readT_Ship_Inst_Lot_NO == null) {
			l_readT_Ship_Inst_Lot_NO = new ArrayList();
		} else {
			l_readT_Ship_Inst_Lot_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readT_Ship_Inst_Lot_NO.add(((KU0030010Struct) list.get(i)).getreadT_Ship_Inst_Lot_NO());
		}
		return size;
	}
	public int setL2L_readT_Ship_Inst_Ship_Seq_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readT_Ship_Inst_Ship_Seq_NO == null) {
			l_readT_Ship_Inst_Ship_Seq_NO = new ArrayList();
		} else {
			l_readT_Ship_Inst_Ship_Seq_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readT_Ship_Inst_Ship_Seq_NO.add(((KU0030010Struct) list.get(i)).getreadT_Ship_Inst_Ship_Seq_NO());
		}
		return size;
	}
	public int setL2L_strOdrCurrncyCd(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strOdrCurrncyCd == null) {
			l_strOdrCurrncyCd = new ArrayList();
		} else {
			l_strOdrCurrncyCd.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strOdrCurrncyCd.add(((KU0030010Struct) list.get(i)).getstrOdrCurrncyCd());
		}
		return size;
	}
	public int setL2L_strExchTyp(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strExchTyp == null) {
			l_strExchTyp = new ArrayList();
		} else {
			l_strExchTyp.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strExchTyp.add(((KU0030010Struct) list.get(i)).getstrExchTyp());
		}
		return size;
	}
	public int setL2L_g_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_g_DATE == null) {
			l_g_DATE = new ArrayList();
		} else {
			l_g_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_g_DATE.add(((KU0030010Struct) list.get(i)).getg_DATE());
		}
		return size;
	}
	public int setL2L_selTShipOdr_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_selTShipOdr_MODIFY_COUNT == null) {
			l_selTShipOdr_MODIFY_COUNT = new ArrayList();
		} else {
			l_selTShipOdr_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_selTShipOdr_MODIFY_COUNT.add(((KU0030010Struct) list.get(i)).getselTShipOdr_MODIFY_COUNT());
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
			l_SEL_MODIFY_COUNT.add(((KU0030010Struct) list.get(i)).getSEL_MODIFY_COUNT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_k_MODE = null;
		m_h_RESULT = null;
		m_r_SEL_PTN = null;
		m_g_DESINATED_SHIP_DATE = null;
		m_g_SHIP_QTY = null;
		m_g_SHIP_QTY2 = null;
		m_g_UNIT_PRICE = null;
		m_g_CURRNCY = null;
		m_g_SHIP_ODR_AMOUNT = null;
		m_g_WH_CD = null;
		m_g_REMARKS = null;
		m_g_CUST_ANAME = null;
		m_g_ITEM_CD = null;
		m_h_AP_SECRTY_TYP = null;
		m_h_SHIP_QTY = null;
		m_h_ITEM_CD = null;
		m_h_GYOMU_DATE = null;
		m_h_EXCH_TYP = null;
		m_h_MODFIY_CNT = null;
		m_h_TOTAL_SHIP_QTY = null;
		m_m_selRadio = null;
		m_r_SEL_PTN1 = null;
		m_r_SEL_PTN2 = null;
		m_r_SEL_PTN3 = null;
		m_h_SELECT_FG = null;
		m_h_UNIT_PRICE = null;
		m_g_STOCK_UNIT = null;
		m_g_STOCK_UNIT2 = null;
		m_g_CUR_UNIT2 = null;
		m_g_WH_NAME = null;
		m_g_SALES_DEPT_CD = null;
		m_g_ORG_NAME = null;
		m_g_CUST_CD = null;
		m_g_CUST_ITEM_NAME = null;
		m_g_ITEM_NAME = null;
		m_g_CUST_ODR_NO = null;
		m_g_ODR_NO = null;
		m_g_PART_DLV_SEQ_NO = null;
		m_g_SHIP_ODR_NO = null;
		m_h_DATE = null;
		m_g_JOB_ODR_CD = null;
		m_c_JOB_ODR_CD = null;
		m_g_DIRECT_DLV_FLG = null;
		m_g_STOCK_LOT_CD = null;
		m_h_STOCK_LOT_CD = null;
		m_param1 = null;
		m_param2 = null;
		m_param3 = null;
		m_ROUND_TYP = null;
		m_UNIT_QTY_TYP = null;
		m_UNIT_FIG = null;
		m_strCOMPANY_CD = null;
		m_strUSER_NAME = null;
		m_strPLANT_CD = null;
		m_strSECTION_CD = null;
		m_strORG_CD = null;
		m_strORG_NAME = null;
		m_strORG_ANAME = null;
		m_strPLANT_NAME = null;
		m_strPLANT_ANAME = null;
		m_strCAL_NO = null;
		m_strUSER_CD = null;
		m_strBUSINESS_OPR_DATE = null;
		m_serTori_SHIP_SEQ_NO = null;
		m_serTori_SHIP_ODR_NO = null;
		m_serTori_SLIP_CD = null;
		m_serTori_ODR_NO = null;
		m_serTori_PART_DLV_SEQ_NO = null;
		m_serTori_ORGNAL_SLIP_CD = null;
		m_serTori_SLIP_TRN_CD = null;
		m_serTori_ITEM_CD = null;
		m_serTori_JOB_ODR_CD = null;
		m_serTori_CUST_ITEM_CD = null;
		m_serTori_CUST_ODR_NO = null;
		m_serTori_CUST_CD = null;
		m_serTori_CUST_NAME = null;
		m_serTori_CUST_CHRG_PSN_CD = null;
		m_serTori_SHIP_ODR_ISS_PSN_CD = null;
		m_serTori_DLV_LOC_CD = null;
		m_serTori_DEPO_TYP = null;
		m_serTori_ALLCT_WH_CD = null;
		m_serTori_DEPO_WH_CD = null;
		m_serTori_LOC_CD = null;
		m_serTori_SHIP_DATE = null;
		m_serTori_SHIP_QTY = null;
		m_serTori_UNIT_CD = null;
		m_serTori_SHIP_UNIT_PRICE = null;
		m_serTori_SHIP_ODR_AMOUNT = null;
		m_serTori_SHIP_ODR_AMOUNT_EXCH_RATES = null;
		m_serTori_CURRNCY_CD = null;
		m_serTori_DIRECT_DLV_FLG = null;
		m_serTori_SHIP_INFO_IF_CTRL_NO = null;
		m_serTori_INSPC_ACPT_INFO_IF_CTRL_NO = null;
		m_serTori_DLV_KEY_NO = null;
		m_serTori_DEL_FLG = null;
		m_serTori_CUR_NAME = null;
		m_serTori_EXCH_TYP = null;
		m_serTori_MODIFY_COUNT = null;
		m_serTori_RETURN_QTY = null;
		m_serTori_TOTAL_SHIP_QTY = null;
		m_serTori_STATUS = null;
		m_serTori_INSPC_ACPT_TYP = null;
		m_serToriSALES_DEPT_CD = null;
		m_serToriSALES_DATE = null;
		m_h_MRP_ODR_TYP = null;
		m_h_LOT_CTRL_FLG = null;
		m_serTodrMODIFY_COUNT = null;
		m_serTori_IN_SLIPCD = null;
		m_creTship_SHIP_SEQ_NO = null;
		m_creTship_SHIP_ODR_NO = null;
		m_creTship_SLIP_CD = null;
		m_creTship_ODR_NO = null;
		m_creTship_PART_DLV_SEQ_NO = null;
		m_creTship_ORGNAL_SLIP_CD = null;
		m_creTship_SLIP_TRN_CD = null;
		m_creTship_ITEM_CD = null;
		m_creTship_JOB_ODR_CD = null;
		m_creTship_CUST_ITEM_CD = null;
		m_creTship_CUST_ODR_NO = null;
		m_creTship_CUST_CD = null;
		m_creTship_CUST_NAME = null;
		m_creTship_CUST_CHRG_PSN_CD = null;
		m_creTship_SHIP_ODR_ISS_PSN_CD = null;
		m_creTship_DLV_LOC_CD = null;
		m_creTship_DEPO_TYP = null;
		m_creTship_ALLCT_WH_CD = null;
		m_creTship_DEPO_WH_CD = null;
		m_creTship_LOC_CD = null;
		m_creTship_SHIP_DATE = null;
		m_creTship_SHIP_QTY = null;
		m_creTship_UNIT_CD = null;
		m_creTship_SHIP_UNIT_PRICE = null;
		m_creTship_SHIP_ODR_AMOUNT = null;
		m_creTship_SHIP_ODR_AMOUNT_EXCH_RATES = null;
		m_creTship_CURRNCY_CD = null;
		m_creTship_DIRECT_DLV_FLG = null;
		m_creTship_DLV_KEY_NO = null;
		m_creTship_REMARKS = null;
		m_creTship_DEL_FLG = null;
		m_updTship_SHIP_SEQ_NO = null;
		m_serInsert_SHIP_ODR_NO = null;
		m_serInsert_ODR_NO = null;
		m_serInsert_PART_DLV_SEQ_NO = null;
		m_serInsert_SLIP_CD = null;
		m_serInsert_ITEM_CD = null;
		m_serInsert_JOB_ODR_CD = null;
		m_serInsert_CUST_ITEM_CD = null;
		m_serInsert_CUST_ODR_NO = null;
		m_serInsert_CUST_CD = null;
		m_serInsert_CUST_NAME = null;
		m_serInsert_CUST_CHRG_PSN_CD = null;
		m_serInsert_SHIP_ODR_ISS_PSN_CD = null;
		m_serInsert_DLV_LOC_CD = null;
		m_serInsert_DEPO_TYP = null;
		m_serInsert_DESINATED_SHIP_DATE = null;
		m_serInsert_SHIP_QTY = null;
		m_serInsert_TOTAL_SHIP_QTY = null;
		m_serInsert_UNIT_CD = null;
		m_serInsert_UNIT_PRICE = null;
		m_serInsert_SHIP_ODR_AMOUNT = null;
		m_serInsert_SHIP_ODR_AMOUNT_EXCH_RATES = null;
		m_serInsert_CURRNCY_CD = null;
		m_serInsert_LOC_CD = null;
		m_serInsert_PKG_UNIT_QTY = null;
		m_serInsert_REMARKS = null;
		m_serInsert_TRANSPORT_CD = null;
		m_serInsert_TRANSPORT_TYP = null;
		m_serInsert_ALLCT_WH_CD = null;
		m_serInsert_TRANSFER_WH_CD = null;
		m_serInsert_DIRECT_DLV_FLG = null;
		m_serInsert_ENTRY_TYP = null;
		m_serInsert_PRINT_FLG = null;
		m_serInsert_SHP_CMPLT_FLG = null;
		m_serInsert_DEPO_TRANSFER_PROC_FLG = null;
		m_serInsert_DEL_FLG = null;
		m_serInsert_CUR_CD = null;
		m_serInsert_CUR_NAME = null;
		m_serInsert_EXCH_TYP = null;
		m_serInsert_SPCL_PRICE_TYP = null;
		m_serInsert_MODIFY_COUNT = null;
		m_serInsert_SCDL_DLV_DATE = null;
		m_serInsert_DLV_KEY_NO = null;
		m_h_RETURN_QTY = null;
		m_serInsert_ODR_ACPT_DATE = null;
		m_h_JOB_ODR_CD = null;
		m_selMODIFY_COUNT = null;
		m_serInsert_IN_SLIPCD = null;
		m_upTshipOdr_DEPO_TRANSFER_PROC_FLG = null;
		m_upTshipOdr_IN_SLIPCD = null;
		m_chkisWhCd_WH_CD = null;
		m_chkisWhCd_WH_TYP = null;
		m_chkisinWhCd_WH_NAME = null;
		m_chkisWhCd_IN_WHCD = null;
		m_chkisWhCd_IN_WHTYP = null;
		m_creTsales_SHIP_ODR_NO = null;
		m_creTsales_SLIP_CD = null;
		m_creTsales_SALES_TYP = null;
		m_creTsales_CUST_CD = null;
		m_creTsales_ITEM_CD = null;
		m_creTsales_ITEM_NAME = null;
		m_creTsales_CUST_ODR_NO = null;
		m_creTsales_SALES_DATE = null;
		m_creTsales_SALES_DEPT_CD = null;
		m_creTsales_CUST_CHRG_PSN_CD = null;
		m_creTsales_ODR_ACPT_PSN_CD = null;
		m_creTsales_SALES_QTY = null;
		m_creTsales_SALES_UNIT_PRICE = null;
		m_creTsales_UNIT_CD = null;
		m_creTsales_SALES_AMOUNT = null;
		m_creTsales_SALES_AMOUNT_EXCH_RATES = null;
		m_creTsales_INSPC_ACPT_DATE = null;
		m_creTsales_INSPC_ACPT_QTY = null;
		m_creTsales_EXTERNAL_TAX_SALES_AMOUNT = null;
		m_creTsales_INTERNAL_TAX_SALES_AMOUNT = null;
		m_creTsales_TAXFREE_SALES_AMOUNT = null;
		m_creTsales_TAX_CREDIT_SALES_AMOUNT = null;
		m_creTsales_EXTERNAL_TAX_AMOUNT = null;
		m_creTsales_INTERNAL_TAX_AMOUNT = null;
		m_creTsales_TAX_AMOUNT_1 = null;
		m_creTsales_TAX_AMOUNT_2 = null;
		m_creTsales_TAX_AMOUNT_3 = null;
		m_creTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;
		m_creTsales_ORG_SLIP_CD = null;
		m_creTsales_CURRNCY_CD = null;
		m_creTsales_SPCL_PRICE_CO = null;
		m_creTsales_REMARKS = null;
		m_creTsales_DEL_FLG = null;
		m_creTsales_INSPC_ACPT_TYP = null;
		m_creTsales_STATUS = null;
		m_creTsales_APPR_FLG = null;
		m_creTsales_APPR_ID = null;
		m_creTsales_APPR_DATE = null;
		m_creTsales_EXCH_RATE = null;
		m_serTsales_SALES_SEQ_NO = null;
		m_serTsales_SLIP_CD = null;
		m_serTsales_SALES_TYP = null;
		m_serTsales_CUST_CD = null;
		m_serTsales_ITEM_CD = null;
		m_serTsales_ITEM_NAME = null;
		m_serTsales_CUST_ODR_NO = null;
		m_serTsales_SALES_DATE = null;
		m_serTsales_SALES_DEPT_CD = null;
		m_serTsales_CUST_CHRG_PSN_CD = null;
		m_serTsales_ODR_ACPT_PSN_CD = null;
		m_serTsales_SALES_QTY = null;
		m_serTsales_SALES_UNIT_PRICE = null;
		m_serTsales_UNIT_CD = null;
		m_serTsales_SALES_AMOUNT = null;
		m_serTsales_SALES_AMOUNT_EXCH_RATES = null;
		m_serTsales_EXTERNAL_TAX_SALES_AMOUNT = null;
		m_serTsales_INTERNAL_TAX_SALES_AMOUNT = null;
		m_serTsales_TAXFREE_SALES_AMOUNT = null;
		m_serTsales_TAX_CREDIT_SALES_AMOUNT = null;
		m_serTsales_EXTERNAL_TAX_AMOUNT = null;
		m_serTsales_INTERNAL_TAX_AMOUNT = null;
		m_serTsales_TAX_AMOUNT_1 = null;
		m_serTsales_TAX_AMOUNT_2 = null;
		m_serTsales_TAX_AMOUNT_3 = null;
		m_serTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;
		m_serTsales_ORG_SLIP_CD = null;
		m_serTsales_CURRNCY_CD = null;
		m_serTsales_SPCL_PRICE_CO = null;
		m_serTsales_REMARKS = null;
		m_serTsales_DEL_FLG = null;
		m_serTsales_INSPC_ACPT_TYP = null;
		m_serTsales_STATUS = null;
		m_serTsales_PRD_ODR_PLACE_CD = null;
		m_serTsales_EXCH_RATE = null;
		m_serTsales_IN_SLIPCD = null;
		m_updTsales_APPR_FLG = null;
		m_updTsales_APPR_ID = null;
		m_updTsales_APPR_DATE = null;
		m_updTsales_SALES_SEQ_NO = null;
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
		m_mItemSpec_CUST_CD = null;
		m_mItemSpec_CUST_ITEM_CD = null;
		m_mItemSpec_COMPANY_CD = null;
		m_mItemSpec_SALES_DEPT_CD = null;
		m_mItemSpec_CUST_ITEM_NAME = null;
		m_mItemSpec_IN_CUST_CD = null;
		m_mItemSpec_IN_CUST_ITEM_CD = null;
		m_mItemSpec_IN_COMPANY_CD = null;
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
		m_tOdr_DLV_KEY_NO = null;
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
		m_tOdr_DEL_FLG = null;
		m_tOdr_SHIP_CNT = null;
		m_tOdr_UNIT_CD_ORG = null;
		m_tOdrCtl_CUST_ITEM_CD = null;
		m_tOdr_COCK_TYP = null;
		m_tOdr_PUCH_ODR_QTY_TOTAL = null;
		m_tOdr_BUYER_ORG_CD = null;
		m_tOdr_BUYER_NAME = null;
		m_tOdr_IN_ODRNO = null;
		m_creTodrODR_NO = null;
		m_creTodrODR_TYP = null;
		m_creTodrODR_CTL_NO = null;
		m_creTodrCUST_ODR_NO = null;
		m_creTodrCUST_CHRG_ORG_CD = null;
		m_creTodrCUST_CHRG_PSN_CD = null;
		m_creTodrODR_ACPT_ORG_CD = null;
		m_creTodrODR_ACPT_PSN_CD = null;
		m_creTodrCURRNCY_CD = null;
		m_creTodrEXCH_TYP = null;
		m_creTodrDLV_LOC_CD = null;
		m_creTodrDLV_LOC_NAME = null;
		m_creTodrDLV_LOC_NAME_KANJI = null;
		m_creTodrPRD_ODR_PLACE_CD = null;
		m_creTodrODR_UNIT_PRICE = null;
		m_creTodrPART_DLV_COUNT = null;
		m_creTodrDEPO_TYP = null;
		m_creTodrDESINATED_DLV_DATE = null;
		m_creTodrODR_QTY = null;
		m_creTodrREMAIN_UNCONFIRM_ODR_QTY = null;
		m_creTodrCANCELED_UNCONFIRM_ODR_QTY = null;
		m_creTodrUNIT_CD = null;
		m_creTodrUNCONFIRM_ODR_BALANCE = null;
		m_creTodrODR_AMOUNT = null;
		m_creTodrODR_AMOUNT_EXCH_RATES = null;
		m_creTodrTOTAL_SHIP_QTY = null;
		m_creTodrSHIP_AMOUNT = null;
		m_creTodrSHIP_AMOUNT_EXCH_RATES = null;
		m_creTodrODR_CMPLT_FLG = null;
		m_creTodrODR_CMPLT_DATE = null;
		m_creTodrREMARKS = null;
		m_creTodrODR_ACPT_DATE = null;
		m_creTodrSHIP_PLAN_REMAIN_QTY = null;
		m_creTodrSHIP_PLAN_CMPLT_FLG = null;
		m_creTodrUNCONFIRMED_ODR_EFF_OVR_FLG = null;
		m_creTodrPARTIAL_SHIP_INST_FLG = null;
		m_creTodrENTRY_TYP = null;
		m_creTodrDEL_FLG = null;
		m_upTodr_TOTAL_SHIP_QTY = null;
		m_upTodr_SHIP_AMOUNT = null;
		m_upTodr_SHIP_AMOUNT_EXCH_RATES = null;
		m_upTodr_ODR_CMPLT_FLG = null;
		m_upTodr_ODR_CMPLT_DATE = null;
		m_upTodr_IN_ODRNO = null;
		m_creTrcvIssue_RCV_ISSUE_CTRL_CD = null;
		m_creTrcvIssue_RCV_ISSUE_TYP = null;
		m_creTrcvIssue_ITEM_CD = null;
		m_creTrcvIssue_JOB_ODR_CD = null;
		m_creTrcvIssue_PLANT_CD = null;
		m_creTrcvIssue_WH_CD = null;
		m_creTrcvIssue_RCV_ISSUE_BEFORE_QTY = null;
		m_creTrcvIssue_RCV_ISSUE_QTY = null;
		m_creTrcvIssue_RCV_ISSUE_AFTER_QTY = null;
		m_creTrcvIssue_RCV_ISSUE_AMOUNT = null;
		m_creTrcvIssue_RCV_ISSUE_DATE = null;
		m_creTrcvIssue_RCV_ISSUE_GNR_TYP = null;
		m_creTrcvIssue_STOCK_UPD_TYP = null;
		m_creTrcvIssue_RCV_ISSUE_CMPLT_FLG = null;
		m_creTrcvIssue_RCV_ISSUE_COMMENT = null;
		m_creTrcvIssue_LOT_NO = null;
		m_creTrcvIssue_SHIP_ODR_NO = null;
		m_upTitemStock_STOCK_ON_HAND_QTY = null;
		m_upTitemStock_IN_ITEMCD = null;
		m_upTitemStock_IN_WHCD = null;
		m_serTitemStock_ITEM_CD = null;
		m_serTitemStock_WH_CD = null;
		m_serTitemStock_PLANT_CD = null;
		m_serTitemStock_STOCK_ON_HAND_QTY = null;
		m_serTitemStock_DEFECT_QTY = null;
		m_serTitemStock_PRVS_DAYEND_STOCK_QTY = null;
		m_serTitemStock_PRVS_MONTHEND_STOCK_QTY = null;
		m_serTitemStock_PRVS_TERMEND_STOCK_QTY = null;
		m_serTitemStock_IN_ITEMCD = null;
		m_serTitemStock_IN_WHCD = null;
		m_creTitemStock_WH_CD = null;
		m_creTitemStock_ITEM_CD = null;
		m_creTitemStock_PLANT_CD = null;
		m_creTitemStock_STOCK_ON_HAND_QTY = null;
		m_mCust_COMPANY_CD = null;
		m_mCust_CUST_CD = null;
		m_mCust_CUST_NAME = null;
		m_mCust_DETAIL_ROUND_TYP = null;
		m_mCust_INSPC_ACPT_TYP = null;
		m_mCust_OWN_ORG_CD = null;
		m_mCust_EXCH_TYP = null;
		m_mCust_CUR_CD = null;
		m_mCust_IN_COMPANYCD = null;
		m_mCust_IN_CUSTCD = null;
		m_getHomeCur_CUR_CD = null;
		m_getHomeCur_DECIMAL_FIG = null;
		m_getHomeCur_CTRL_CD = null;
		m_strCode = null;
		m_mUnitCost_UNIT_COST = null;
		m_mUnitCost_EFF_PHASE_IN_DATE = null;
		m_mUnitCost_IN_COMPANYCD = null;
		m_mUnitCost_IN_CUSTCD = null;
		m_mUnitCost_IN_ITEMCD = null;
		m_mUnitCost_IN_EFFPHASEINDATE = null;
		m_readShipOdr_TOTAL_SHIP_QTY = null;
		m_readShipOdr_RETURN_QTY = null;
		m_readShipOdr_SHIP_ODR_NO = null;
		m_g_CUR_UNIT = null;
		m_DECIMAL_FIG = null;
		m_t_CUR_CD = null;
		m_strSLIP_CTRL_GRP = null;
		m_strSTATUS = null;
		m_strSLIP_CD = null;
		m_upTshipOdr_SHP_CMPLT_FLG = null;
		m_upTshipOdr_TOTAL_SHIP_QTY = null;
		m_upTshipOdr_SLIP_CD = null;
		m_upTshipOdr_ORG_SLIP_CD = null;
		m_upTshipOdr_SHIP_ODR_NO = null;
		m_strTod_OD_NO = null;
		m_strTod_TOTAL_ISSUE_QTY = null;
		m_strTod_DM_QTY = null;
		m_strTod_DM_STS_TYP = null;
		m_inTod_ODR_NO = null;
		m_inTod_PART_DLV_SEQ_NO = null;
		m_inTod_OD_NO = null;
		m_strTaxTAX_KBN = null;
		m_strTaxOLD_TAX_1 = null;
		m_strTaxOLD_TAX_2 = null;
		m_strTaxOLD_TAX_3 = null;
		m_strTaxNEW_TAX_1 = null;
		m_strTaxNEW_TAX_2 = null;
		m_strTaxNEW_TAX_3 = null;
		m_strTaxSTART_DATE = null;
		m_strTaxROUND_TYP = null;
		m_updiffTAX_CD = null;
		m_upTshipOdr_RETURN_QTY = null;
		m_chkSLIP_CD = null;
		m_mWh_WH_NAME = null;
		m_mWh_PLANT_CD = null;
		m_mWh_IN_WH_CD = null;
		m_mOrg_ORG_NAME = null;
		m_mOrg_IN_COMPANYCD = null;
		m_mOrg_IN_ORGCD = null;
		m_serTitemStock_JOB_ODR_CD = null;
		m_serTitemStock_IN_JOBODRCD = null;
		m_creTitemStock_JOB_ODR_CD = null;
		m_upTitemStock_IN_JOBODRCD = null;
		m_serTJobOdr_JOB_ODR_CD = null;
		m_serTJobOdr_ITEM_CD = null;
		m_diffSHIP_QTY = null;
		m_diffSHIP_ODR_AMOUNT = null;
		m_diffSHIP_ODR_AMOUNT_EXCH_RATE = null;
		m_diffSHIP_ODR_NO = null;
		m_diffODR_NO = null;
		m_diffPART_DLV_SEQ_NO = null;
		m_diffSLIP_CD = null;
		m_diffITEM_CD = null;
		m_diffJOB_ODR_CD = null;
		m_diffCUST_ITEM_CD = null;
		m_diffCUST_ODR_NO = null;
		m_diffCUST_CD = null;
		m_diffCUST_NAME = null;
		m_diffCUST_CHRG_PSN_CD = null;
		m_diffSHIP_ODR_ISS_PSN_CD = null;
		m_diffDLV_LOC_CD = null;
		m_diffDEPO_TYP = null;
		m_diffDESINATED_SHIP_DATE = null;
		m_diffSCDL_DLV_DATE = null;
		m_diffTOTAL_SHIP_QTY = null;
		m_diffRETURN_QTY = null;
		m_diffUNIT_CD = null;
		m_diffUNIT_PRICE = null;
		m_diffCURRENCY_CD = null;
		m_diffLOC_CD = null;
		m_diffPKG_UNIT_QTY = null;
		m_diffREMARKS = null;
		m_diffDLV_KEY_NO = null;
		m_diffPART_DLV_COUNT = null;
		m_diffTRANSPORT_CD = null;
		m_diffTRANSPORT_TYP = null;
		m_diffALLCT_WH_CD = null;
		m_diffTRANSFER_WH_CD = null;
		m_diffDIRECT_DLV_FLG = null;
		m_diffENTRY_TYP = null;
		m_diffPRINT_FLG = null;
		m_diffSHIP_CMPLT_FLG = null;
		m_diffDEPO_TRANSFER_PROC_FLG = null;
		m_diffDEL_FLG = null;
		m_diffuptOdr_SHIP_CNT = null;
		m_diffuptOdr_PART_DLV_COUNT = null;
		m_diffuptOdr_IN_ODRNO = null;
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
		m_up_tShipSlip_SLIP_CD = null;
		m_updiffSHIP_ODR_QTY = null;
		m_updiffSHIP_ODR_AMOUNT = null;
		m_updiffTAX_AMOUNT = null;
		m_updiffSHIP_ODR_AMOUNT_TAX = null;
		m_updiffEXTERNAL_TAX_SALES_AMOUNT = null;
		m_updiffINTERNAL_TAX_SALES_AMOUNT = null;
		m_updiffTAXFREE_SALES_AMOUNT = null;
		m_updiffTAX_CREDIT_SALES_AMOUNT = null;
		m_updiffEXTERNAL_TAX_AMOUNT = null;
		m_updiffINTERNAL_TAX_AMOUNT = null;
		m_updiffTAX_AMOUNT_1 = null;
		m_updiffTAX_AMOUNT_2 = null;
		m_updiffTAX_AMOUNT_3 = null;
		m_updiffOWN_CUR_TAXCREDIT_SALES_AMOUNT = null;
		m_updiffSLIP_CD = null;
		m_PAST_RESULT_ENTRY_TYP = null;
		m_PROC_EXEC_DATE = null;
		m_PLANT_CD = null;
		m_mCustBase_TRANSPORT_LT = null;
		m_mCustBase_IN_COMPANYCD = null;
		m_mCustBase_IN_CUSTCD = null;
		m_mCustBase_IN_DLVLOCCD = null;
		m_strSYUKA_LT = null;
		m_strTaxIN_COMPANYCD = null;
		m_strTaxIN_CUSTCD = null;
		m_g_CUST_ITEM_CD = null;
		m_strT_ODR_TAX = null;
		m_g_SLIP_CD = null;
		m_getTship_SHIP_SEQ_NO = null;
		m_chkLOT_NO = null;
		m_chkITEM_CD = null;
		m_getQtySTOCK_ON_HAND_QTY = null;
		m_getQtyALCD_QTY = null;
		m_getQtyITEM_CD = null;
		m_getQtyWH_CD = null;
		m_getQtyLOT_NO = null;
		m_readTlotStock_LOT_NO = null;
		m_readTlotStock_STOCK_ON_HAND_QTY = null;
		m_readTlotStock_ALCD_QTY = null;
		m_readTlotStock_IN_ITEM_CD = null;
		m_readTlotStock_IN_WH_CD = null;
		m_readTlotStock_IN_LOT_NO = null;
		m_upTlotStockSTOCK_ON_HAND_QTY = null;
		m_upTlotStockIN_ITEM_CD = null;
		m_upTlotStockIN_WH_CD = null;
		m_upTlotStockIN_LOT_NO = null;
		m_serLotSTOCK_ON_HAND_QTY = null;
		m_serLotALCD_QTY = null;
		m_serLotIN_ITEM_CD = null;
		m_serLotIN_WH_CD = null;
		m_serLotIN_LOT_NO = null;
		m_insertLotStock_ITEM_CD = null;
		m_insertLotStock_WH_CD = null;
		m_insertLotStock_LOT_CD = null;
		m_insertLotStock_PLANT_CD = null;
		m_insertLotStock_STOCK_ON_HAND_QTY = null;
		m_insertLotStock_DEFECT_QTY = null;
		m_insertLotStock_ALCD_QTY = null;
		m_insTshipInst_SHIP_SEQ_NO = null;
		m_insTshipInst_SHIP_ODR_NO = null;
		m_insTshipInst_LOT_NO = null;
		m_insTshipInst_ITEM_CD = null;
		m_insTshipInst_WH_CD = null;
		m_insTshipInst_ODR_NO = null;
		m_insTshipInst_SLIP_CD = null;
		m_insTshipInst_SHIP_QTY = null;
		m_insTshipInst_SHIP_DATE = null;
		m_delTshipInstIN_SHIP_SEQ_NO = null;
		m_delTshipInstIN_LOT_NO = null;
		m_tlotTrace_FROM_ITEM_CD = null;
		m_tlotTrace_FROM_LOT_NO = null;
		m_tlotTrace_TO_ITEM_CD = null;
		m_tlotTrace_TO_LOT_NO = null;
		m_tlotTrace_LOT_TRACE_TYP = null;
		m_tlotTrace_CUST_ODR_NO = null;
		m_tlotTrace_SLIP_CD = null;
		m_tlotTrace_ODR_NO = null;
		m_readTshipInst_LOT_NO = null;
		m_readTshipInst_SHIP_QTY = null;
		m_readTshipInst_SHIP_ODR_NO = null;
		m_readTshipInst_ITEM_CD = null;
		m_readTshipInst_WH_CD = null;
		m_readTshipInst_ODR_NO = null;
		m_readTshipInst_SLIP_CD = null;
		m_readTshipInst_SHIP_DATE = null;
		m_readTshipInst_IN_SHIP_SEQ_NO = null;
		m_readTshipInst_IN_LOT_NO = null;
		m_readT_Ship_Inst_Lot_NO = null;
		m_readT_Ship_Inst_Ship_Seq_NO = null;
		m_strOdrCurrncyCd = null;
		m_strExchTyp = null;
		m_g_DATE = null;
		m_selTShipOdr_MODIFY_COUNT = null;
		m_SEL_MODIFY_COUNT = null;

		l_k_MODE = null;
		l_h_RESULT = null;
		l_r_SEL_PTN = null;
		l_g_DESINATED_SHIP_DATE = null;
		l_g_SHIP_QTY = null;
		l_g_SHIP_QTY2 = null;
		l_g_UNIT_PRICE = null;
		l_g_CURRNCY = null;
		l_g_SHIP_ODR_AMOUNT = null;
		l_g_WH_CD = null;
		l_g_REMARKS = null;
		l_g_CUST_ANAME = null;
		l_g_ITEM_CD = null;
		l_h_AP_SECRTY_TYP = null;
		l_h_SHIP_QTY = null;
		l_h_ITEM_CD = null;
		l_h_GYOMU_DATE = null;
		l_h_EXCH_TYP = null;
		l_h_MODFIY_CNT = null;
		l_h_TOTAL_SHIP_QTY = null;
		l_m_selRadio = null;
		l_r_SEL_PTN1 = null;
		l_r_SEL_PTN2 = null;
		l_r_SEL_PTN3 = null;
		l_h_SELECT_FG = null;
		l_h_UNIT_PRICE = null;
		l_g_STOCK_UNIT = null;
		l_g_STOCK_UNIT2 = null;
		l_g_CUR_UNIT2 = null;
		l_g_WH_NAME = null;
		l_g_SALES_DEPT_CD = null;
		l_g_ORG_NAME = null;
		l_g_CUST_CD = null;
		l_g_CUST_ITEM_NAME = null;
		l_g_ITEM_NAME = null;
		l_g_CUST_ODR_NO = null;
		l_g_ODR_NO = null;
		l_g_PART_DLV_SEQ_NO = null;
		l_g_SHIP_ODR_NO = null;
		l_h_DATE = null;
		l_g_JOB_ODR_CD = null;
		l_c_JOB_ODR_CD = null;
		l_g_DIRECT_DLV_FLG = null;
		l_g_STOCK_LOT_CD = null;
		l_h_STOCK_LOT_CD = null;
		l_param1 = null;
		l_param2 = null;
		l_param3 = null;
		l_ROUND_TYP = null;
		l_UNIT_QTY_TYP = null;
		l_UNIT_FIG = null;
		l_strCOMPANY_CD = null;
		l_strUSER_NAME = null;
		l_strPLANT_CD = null;
		l_strSECTION_CD = null;
		l_strORG_CD = null;
		l_strORG_NAME = null;
		l_strORG_ANAME = null;
		l_strPLANT_NAME = null;
		l_strPLANT_ANAME = null;
		l_strCAL_NO = null;
		l_strUSER_CD = null;
		l_strBUSINESS_OPR_DATE = null;
		l_serTori_SHIP_SEQ_NO = null;
		l_serTori_SHIP_ODR_NO = null;
		l_serTori_SLIP_CD = null;
		l_serTori_ODR_NO = null;
		l_serTori_PART_DLV_SEQ_NO = null;
		l_serTori_ORGNAL_SLIP_CD = null;
		l_serTori_SLIP_TRN_CD = null;
		l_serTori_ITEM_CD = null;
		l_serTori_JOB_ODR_CD = null;
		l_serTori_CUST_ITEM_CD = null;
		l_serTori_CUST_ODR_NO = null;
		l_serTori_CUST_CD = null;
		l_serTori_CUST_NAME = null;
		l_serTori_CUST_CHRG_PSN_CD = null;
		l_serTori_SHIP_ODR_ISS_PSN_CD = null;
		l_serTori_DLV_LOC_CD = null;
		l_serTori_DEPO_TYP = null;
		l_serTori_ALLCT_WH_CD = null;
		l_serTori_DEPO_WH_CD = null;
		l_serTori_LOC_CD = null;
		l_serTori_SHIP_DATE = null;
		l_serTori_SHIP_QTY = null;
		l_serTori_UNIT_CD = null;
		l_serTori_SHIP_UNIT_PRICE = null;
		l_serTori_SHIP_ODR_AMOUNT = null;
		l_serTori_SHIP_ODR_AMOUNT_EXCH_RATES = null;
		l_serTori_CURRNCY_CD = null;
		l_serTori_DIRECT_DLV_FLG = null;
		l_serTori_SHIP_INFO_IF_CTRL_NO = null;
		l_serTori_INSPC_ACPT_INFO_IF_CTRL_NO = null;
		l_serTori_DLV_KEY_NO = null;
		l_serTori_DEL_FLG = null;
		l_serTori_CUR_NAME = null;
		l_serTori_EXCH_TYP = null;
		l_serTori_MODIFY_COUNT = null;
		l_serTori_RETURN_QTY = null;
		l_serTori_TOTAL_SHIP_QTY = null;
		l_serTori_STATUS = null;
		l_serTori_INSPC_ACPT_TYP = null;
		l_serToriSALES_DEPT_CD = null;
		l_serToriSALES_DATE = null;
		l_h_MRP_ODR_TYP = null;
		l_h_LOT_CTRL_FLG = null;
		l_serTodrMODIFY_COUNT = null;
		l_serTori_IN_SLIPCD = null;
		l_creTship_SHIP_SEQ_NO = null;
		l_creTship_SHIP_ODR_NO = null;
		l_creTship_SLIP_CD = null;
		l_creTship_ODR_NO = null;
		l_creTship_PART_DLV_SEQ_NO = null;
		l_creTship_ORGNAL_SLIP_CD = null;
		l_creTship_SLIP_TRN_CD = null;
		l_creTship_ITEM_CD = null;
		l_creTship_JOB_ODR_CD = null;
		l_creTship_CUST_ITEM_CD = null;
		l_creTship_CUST_ODR_NO = null;
		l_creTship_CUST_CD = null;
		l_creTship_CUST_NAME = null;
		l_creTship_CUST_CHRG_PSN_CD = null;
		l_creTship_SHIP_ODR_ISS_PSN_CD = null;
		l_creTship_DLV_LOC_CD = null;
		l_creTship_DEPO_TYP = null;
		l_creTship_ALLCT_WH_CD = null;
		l_creTship_DEPO_WH_CD = null;
		l_creTship_LOC_CD = null;
		l_creTship_SHIP_DATE = null;
		l_creTship_SHIP_QTY = null;
		l_creTship_UNIT_CD = null;
		l_creTship_SHIP_UNIT_PRICE = null;
		l_creTship_SHIP_ODR_AMOUNT = null;
		l_creTship_SHIP_ODR_AMOUNT_EXCH_RATES = null;
		l_creTship_CURRNCY_CD = null;
		l_creTship_DIRECT_DLV_FLG = null;
		l_creTship_DLV_KEY_NO = null;
		l_creTship_REMARKS = null;
		l_creTship_DEL_FLG = null;
		l_updTship_SHIP_SEQ_NO = null;
		l_serInsert_SHIP_ODR_NO = null;
		l_serInsert_ODR_NO = null;
		l_serInsert_PART_DLV_SEQ_NO = null;
		l_serInsert_SLIP_CD = null;
		l_serInsert_ITEM_CD = null;
		l_serInsert_JOB_ODR_CD = null;
		l_serInsert_CUST_ITEM_CD = null;
		l_serInsert_CUST_ODR_NO = null;
		l_serInsert_CUST_CD = null;
		l_serInsert_CUST_NAME = null;
		l_serInsert_CUST_CHRG_PSN_CD = null;
		l_serInsert_SHIP_ODR_ISS_PSN_CD = null;
		l_serInsert_DLV_LOC_CD = null;
		l_serInsert_DEPO_TYP = null;
		l_serInsert_DESINATED_SHIP_DATE = null;
		l_serInsert_SHIP_QTY = null;
		l_serInsert_TOTAL_SHIP_QTY = null;
		l_serInsert_UNIT_CD = null;
		l_serInsert_UNIT_PRICE = null;
		l_serInsert_SHIP_ODR_AMOUNT = null;
		l_serInsert_SHIP_ODR_AMOUNT_EXCH_RATES = null;
		l_serInsert_CURRNCY_CD = null;
		l_serInsert_LOC_CD = null;
		l_serInsert_PKG_UNIT_QTY = null;
		l_serInsert_REMARKS = null;
		l_serInsert_TRANSPORT_CD = null;
		l_serInsert_TRANSPORT_TYP = null;
		l_serInsert_ALLCT_WH_CD = null;
		l_serInsert_TRANSFER_WH_CD = null;
		l_serInsert_DIRECT_DLV_FLG = null;
		l_serInsert_ENTRY_TYP = null;
		l_serInsert_PRINT_FLG = null;
		l_serInsert_SHP_CMPLT_FLG = null;
		l_serInsert_DEPO_TRANSFER_PROC_FLG = null;
		l_serInsert_DEL_FLG = null;
		l_serInsert_CUR_CD = null;
		l_serInsert_CUR_NAME = null;
		l_serInsert_EXCH_TYP = null;
		l_serInsert_SPCL_PRICE_TYP = null;
		l_serInsert_MODIFY_COUNT = null;
		l_serInsert_SCDL_DLV_DATE = null;
		l_serInsert_DLV_KEY_NO = null;
		l_h_RETURN_QTY = null;
		l_serInsert_ODR_ACPT_DATE = null;
		l_h_JOB_ODR_CD = null;
		l_selMODIFY_COUNT = null;
		l_serInsert_IN_SLIPCD = null;
		l_upTshipOdr_DEPO_TRANSFER_PROC_FLG = null;
		l_upTshipOdr_IN_SLIPCD = null;
		l_chkisWhCd_WH_CD = null;
		l_chkisWhCd_WH_TYP = null;
		l_chkisinWhCd_WH_NAME = null;
		l_chkisWhCd_IN_WHCD = null;
		l_chkisWhCd_IN_WHTYP = null;
		l_creTsales_SHIP_ODR_NO = null;
		l_creTsales_SLIP_CD = null;
		l_creTsales_SALES_TYP = null;
		l_creTsales_CUST_CD = null;
		l_creTsales_ITEM_CD = null;
		l_creTsales_ITEM_NAME = null;
		l_creTsales_CUST_ODR_NO = null;
		l_creTsales_SALES_DATE = null;
		l_creTsales_SALES_DEPT_CD = null;
		l_creTsales_CUST_CHRG_PSN_CD = null;
		l_creTsales_ODR_ACPT_PSN_CD = null;
		l_creTsales_SALES_QTY = null;
		l_creTsales_SALES_UNIT_PRICE = null;
		l_creTsales_UNIT_CD = null;
		l_creTsales_SALES_AMOUNT = null;
		l_creTsales_SALES_AMOUNT_EXCH_RATES = null;
		l_creTsales_INSPC_ACPT_DATE = null;
		l_creTsales_INSPC_ACPT_QTY = null;
		l_creTsales_EXTERNAL_TAX_SALES_AMOUNT = null;
		l_creTsales_INTERNAL_TAX_SALES_AMOUNT = null;
		l_creTsales_TAXFREE_SALES_AMOUNT = null;
		l_creTsales_TAX_CREDIT_SALES_AMOUNT = null;
		l_creTsales_EXTERNAL_TAX_AMOUNT = null;
		l_creTsales_INTERNAL_TAX_AMOUNT = null;
		l_creTsales_TAX_AMOUNT_1 = null;
		l_creTsales_TAX_AMOUNT_2 = null;
		l_creTsales_TAX_AMOUNT_3 = null;
		l_creTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;
		l_creTsales_ORG_SLIP_CD = null;
		l_creTsales_CURRNCY_CD = null;
		l_creTsales_SPCL_PRICE_CO = null;
		l_creTsales_REMARKS = null;
		l_creTsales_DEL_FLG = null;
		l_creTsales_INSPC_ACPT_TYP = null;
		l_creTsales_STATUS = null;
		l_creTsales_APPR_FLG = null;
		l_creTsales_APPR_ID = null;
		l_creTsales_APPR_DATE = null;
		l_creTsales_EXCH_RATE = null;
		l_serTsales_SALES_SEQ_NO = null;
		l_serTsales_SLIP_CD = null;
		l_serTsales_SALES_TYP = null;
		l_serTsales_CUST_CD = null;
		l_serTsales_ITEM_CD = null;
		l_serTsales_ITEM_NAME = null;
		l_serTsales_CUST_ODR_NO = null;
		l_serTsales_SALES_DATE = null;
		l_serTsales_SALES_DEPT_CD = null;
		l_serTsales_CUST_CHRG_PSN_CD = null;
		l_serTsales_ODR_ACPT_PSN_CD = null;
		l_serTsales_SALES_QTY = null;
		l_serTsales_SALES_UNIT_PRICE = null;
		l_serTsales_UNIT_CD = null;
		l_serTsales_SALES_AMOUNT = null;
		l_serTsales_SALES_AMOUNT_EXCH_RATES = null;
		l_serTsales_EXTERNAL_TAX_SALES_AMOUNT = null;
		l_serTsales_INTERNAL_TAX_SALES_AMOUNT = null;
		l_serTsales_TAXFREE_SALES_AMOUNT = null;
		l_serTsales_TAX_CREDIT_SALES_AMOUNT = null;
		l_serTsales_EXTERNAL_TAX_AMOUNT = null;
		l_serTsales_INTERNAL_TAX_AMOUNT = null;
		l_serTsales_TAX_AMOUNT_1 = null;
		l_serTsales_TAX_AMOUNT_2 = null;
		l_serTsales_TAX_AMOUNT_3 = null;
		l_serTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;
		l_serTsales_ORG_SLIP_CD = null;
		l_serTsales_CURRNCY_CD = null;
		l_serTsales_SPCL_PRICE_CO = null;
		l_serTsales_REMARKS = null;
		l_serTsales_DEL_FLG = null;
		l_serTsales_INSPC_ACPT_TYP = null;
		l_serTsales_STATUS = null;
		l_serTsales_PRD_ODR_PLACE_CD = null;
		l_serTsales_EXCH_RATE = null;
		l_serTsales_IN_SLIPCD = null;
		l_updTsales_APPR_FLG = null;
		l_updTsales_APPR_ID = null;
		l_updTsales_APPR_DATE = null;
		l_updTsales_SALES_SEQ_NO = null;
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
		l_mItemSpec_CUST_CD = null;
		l_mItemSpec_CUST_ITEM_CD = null;
		l_mItemSpec_COMPANY_CD = null;
		l_mItemSpec_SALES_DEPT_CD = null;
		l_mItemSpec_CUST_ITEM_NAME = null;
		l_mItemSpec_IN_CUST_CD = null;
		l_mItemSpec_IN_CUST_ITEM_CD = null;
		l_mItemSpec_IN_COMPANY_CD = null;
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
		l_tOdr_DLV_KEY_NO = null;
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
		l_tOdr_DEL_FLG = null;
		l_tOdr_SHIP_CNT = null;
		l_tOdr_UNIT_CD_ORG = null;
		l_tOdrCtl_CUST_ITEM_CD = null;
		l_tOdr_COCK_TYP = null;
		l_tOdr_PUCH_ODR_QTY_TOTAL = null;
		l_tOdr_BUYER_ORG_CD = null;
		l_tOdr_BUYER_NAME = null;
		l_tOdr_IN_ODRNO = null;
		l_creTodrODR_NO = null;
		l_creTodrODR_TYP = null;
		l_creTodrODR_CTL_NO = null;
		l_creTodrCUST_ODR_NO = null;
		l_creTodrCUST_CHRG_ORG_CD = null;
		l_creTodrCUST_CHRG_PSN_CD = null;
		l_creTodrODR_ACPT_ORG_CD = null;
		l_creTodrODR_ACPT_PSN_CD = null;
		l_creTodrCURRNCY_CD = null;
		l_creTodrEXCH_TYP = null;
		l_creTodrDLV_LOC_CD = null;
		l_creTodrDLV_LOC_NAME = null;
		l_creTodrDLV_LOC_NAME_KANJI = null;
		l_creTodrPRD_ODR_PLACE_CD = null;
		l_creTodrODR_UNIT_PRICE = null;
		l_creTodrPART_DLV_COUNT = null;
		l_creTodrDEPO_TYP = null;
		l_creTodrDESINATED_DLV_DATE = null;
		l_creTodrODR_QTY = null;
		l_creTodrREMAIN_UNCONFIRM_ODR_QTY = null;
		l_creTodrCANCELED_UNCONFIRM_ODR_QTY = null;
		l_creTodrUNIT_CD = null;
		l_creTodrUNCONFIRM_ODR_BALANCE = null;
		l_creTodrODR_AMOUNT = null;
		l_creTodrODR_AMOUNT_EXCH_RATES = null;
		l_creTodrTOTAL_SHIP_QTY = null;
		l_creTodrSHIP_AMOUNT = null;
		l_creTodrSHIP_AMOUNT_EXCH_RATES = null;
		l_creTodrODR_CMPLT_FLG = null;
		l_creTodrODR_CMPLT_DATE = null;
		l_creTodrREMARKS = null;
		l_creTodrODR_ACPT_DATE = null;
		l_creTodrSHIP_PLAN_REMAIN_QTY = null;
		l_creTodrSHIP_PLAN_CMPLT_FLG = null;
		l_creTodrUNCONFIRMED_ODR_EFF_OVR_FLG = null;
		l_creTodrPARTIAL_SHIP_INST_FLG = null;
		l_creTodrENTRY_TYP = null;
		l_creTodrDEL_FLG = null;
		l_upTodr_TOTAL_SHIP_QTY = null;
		l_upTodr_SHIP_AMOUNT = null;
		l_upTodr_SHIP_AMOUNT_EXCH_RATES = null;
		l_upTodr_ODR_CMPLT_FLG = null;
		l_upTodr_ODR_CMPLT_DATE = null;
		l_upTodr_IN_ODRNO = null;
		l_creTrcvIssue_RCV_ISSUE_CTRL_CD = null;
		l_creTrcvIssue_RCV_ISSUE_TYP = null;
		l_creTrcvIssue_ITEM_CD = null;
		l_creTrcvIssue_JOB_ODR_CD = null;
		l_creTrcvIssue_PLANT_CD = null;
		l_creTrcvIssue_WH_CD = null;
		l_creTrcvIssue_RCV_ISSUE_BEFORE_QTY = null;
		l_creTrcvIssue_RCV_ISSUE_QTY = null;
		l_creTrcvIssue_RCV_ISSUE_AFTER_QTY = null;
		l_creTrcvIssue_RCV_ISSUE_AMOUNT = null;
		l_creTrcvIssue_RCV_ISSUE_DATE = null;
		l_creTrcvIssue_RCV_ISSUE_GNR_TYP = null;
		l_creTrcvIssue_STOCK_UPD_TYP = null;
		l_creTrcvIssue_RCV_ISSUE_CMPLT_FLG = null;
		l_creTrcvIssue_RCV_ISSUE_COMMENT = null;
		l_creTrcvIssue_LOT_NO = null;
		l_creTrcvIssue_SHIP_ODR_NO = null;
		l_upTitemStock_STOCK_ON_HAND_QTY = null;
		l_upTitemStock_IN_ITEMCD = null;
		l_upTitemStock_IN_WHCD = null;
		l_serTitemStock_ITEM_CD = null;
		l_serTitemStock_WH_CD = null;
		l_serTitemStock_PLANT_CD = null;
		l_serTitemStock_STOCK_ON_HAND_QTY = null;
		l_serTitemStock_DEFECT_QTY = null;
		l_serTitemStock_PRVS_DAYEND_STOCK_QTY = null;
		l_serTitemStock_PRVS_MONTHEND_STOCK_QTY = null;
		l_serTitemStock_PRVS_TERMEND_STOCK_QTY = null;
		l_serTitemStock_IN_ITEMCD = null;
		l_serTitemStock_IN_WHCD = null;
		l_creTitemStock_WH_CD = null;
		l_creTitemStock_ITEM_CD = null;
		l_creTitemStock_PLANT_CD = null;
		l_creTitemStock_STOCK_ON_HAND_QTY = null;
		l_mCust_COMPANY_CD = null;
		l_mCust_CUST_CD = null;
		l_mCust_CUST_NAME = null;
		l_mCust_DETAIL_ROUND_TYP = null;
		l_mCust_INSPC_ACPT_TYP = null;
		l_mCust_OWN_ORG_CD = null;
		l_mCust_EXCH_TYP = null;
		l_mCust_CUR_CD = null;
		l_mCust_IN_COMPANYCD = null;
		l_mCust_IN_CUSTCD = null;
		l_getHomeCur_CUR_CD = null;
		l_getHomeCur_DECIMAL_FIG = null;
		l_getHomeCur_CTRL_CD = null;
		l_strCode = null;
		l_mUnitCost_UNIT_COST = null;
		l_mUnitCost_EFF_PHASE_IN_DATE = null;
		l_mUnitCost_IN_COMPANYCD = null;
		l_mUnitCost_IN_CUSTCD = null;
		l_mUnitCost_IN_ITEMCD = null;
		l_mUnitCost_IN_EFFPHASEINDATE = null;
		l_readShipOdr_TOTAL_SHIP_QTY = null;
		l_readShipOdr_RETURN_QTY = null;
		l_readShipOdr_SHIP_ODR_NO = null;
		l_g_CUR_UNIT = null;
		l_DECIMAL_FIG = null;
		l_t_CUR_CD = null;
		l_strSLIP_CTRL_GRP = null;
		l_strSTATUS = null;
		l_strSLIP_CD = null;
		l_upTshipOdr_SHP_CMPLT_FLG = null;
		l_upTshipOdr_TOTAL_SHIP_QTY = null;
		l_upTshipOdr_SLIP_CD = null;
		l_upTshipOdr_ORG_SLIP_CD = null;
		l_upTshipOdr_SHIP_ODR_NO = null;
		l_strTod_OD_NO = null;
		l_strTod_TOTAL_ISSUE_QTY = null;
		l_strTod_DM_QTY = null;
		l_strTod_DM_STS_TYP = null;
		l_inTod_ODR_NO = null;
		l_inTod_PART_DLV_SEQ_NO = null;
		l_inTod_OD_NO = null;
		l_strTaxTAX_KBN = null;
		l_strTaxOLD_TAX_1 = null;
		l_strTaxOLD_TAX_2 = null;
		l_strTaxOLD_TAX_3 = null;
		l_strTaxNEW_TAX_1 = null;
		l_strTaxNEW_TAX_2 = null;
		l_strTaxNEW_TAX_3 = null;
		l_strTaxSTART_DATE = null;
		l_strTaxROUND_TYP = null;
		l_updiffTAX_CD = null;
		l_upTshipOdr_RETURN_QTY = null;
		l_chkSLIP_CD = null;
		l_mWh_WH_NAME = null;
		l_mWh_PLANT_CD = null;
		l_mWh_IN_WH_CD = null;
		l_mOrg_ORG_NAME = null;
		l_mOrg_IN_COMPANYCD = null;
		l_mOrg_IN_ORGCD = null;
		l_serTitemStock_JOB_ODR_CD = null;
		l_serTitemStock_IN_JOBODRCD = null;
		l_creTitemStock_JOB_ODR_CD = null;
		l_upTitemStock_IN_JOBODRCD = null;
		l_serTJobOdr_JOB_ODR_CD = null;
		l_serTJobOdr_ITEM_CD = null;
		l_diffSHIP_QTY = null;
		l_diffSHIP_ODR_AMOUNT = null;
		l_diffSHIP_ODR_AMOUNT_EXCH_RATE = null;
		l_diffSHIP_ODR_NO = null;
		l_diffODR_NO = null;
		l_diffPART_DLV_SEQ_NO = null;
		l_diffSLIP_CD = null;
		l_diffITEM_CD = null;
		l_diffJOB_ODR_CD = null;
		l_diffCUST_ITEM_CD = null;
		l_diffCUST_ODR_NO = null;
		l_diffCUST_CD = null;
		l_diffCUST_NAME = null;
		l_diffCUST_CHRG_PSN_CD = null;
		l_diffSHIP_ODR_ISS_PSN_CD = null;
		l_diffDLV_LOC_CD = null;
		l_diffDEPO_TYP = null;
		l_diffDESINATED_SHIP_DATE = null;
		l_diffSCDL_DLV_DATE = null;
		l_diffTOTAL_SHIP_QTY = null;
		l_diffRETURN_QTY = null;
		l_diffUNIT_CD = null;
		l_diffUNIT_PRICE = null;
		l_diffCURRENCY_CD = null;
		l_diffLOC_CD = null;
		l_diffPKG_UNIT_QTY = null;
		l_diffREMARKS = null;
		l_diffDLV_KEY_NO = null;
		l_diffPART_DLV_COUNT = null;
		l_diffTRANSPORT_CD = null;
		l_diffTRANSPORT_TYP = null;
		l_diffALLCT_WH_CD = null;
		l_diffTRANSFER_WH_CD = null;
		l_diffDIRECT_DLV_FLG = null;
		l_diffENTRY_TYP = null;
		l_diffPRINT_FLG = null;
		l_diffSHIP_CMPLT_FLG = null;
		l_diffDEPO_TRANSFER_PROC_FLG = null;
		l_diffDEL_FLG = null;
		l_diffuptOdr_SHIP_CNT = null;
		l_diffuptOdr_PART_DLV_COUNT = null;
		l_diffuptOdr_IN_ODRNO = null;
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
		l_up_tShipSlip_SLIP_CD = null;
		l_updiffSHIP_ODR_QTY = null;
		l_updiffSHIP_ODR_AMOUNT = null;
		l_updiffTAX_AMOUNT = null;
		l_updiffSHIP_ODR_AMOUNT_TAX = null;
		l_updiffEXTERNAL_TAX_SALES_AMOUNT = null;
		l_updiffINTERNAL_TAX_SALES_AMOUNT = null;
		l_updiffTAXFREE_SALES_AMOUNT = null;
		l_updiffTAX_CREDIT_SALES_AMOUNT = null;
		l_updiffEXTERNAL_TAX_AMOUNT = null;
		l_updiffINTERNAL_TAX_AMOUNT = null;
		l_updiffTAX_AMOUNT_1 = null;
		l_updiffTAX_AMOUNT_2 = null;
		l_updiffTAX_AMOUNT_3 = null;
		l_updiffOWN_CUR_TAXCREDIT_SALES_AMOUNT = null;
		l_updiffSLIP_CD = null;
		l_PAST_RESULT_ENTRY_TYP = null;
		l_PROC_EXEC_DATE = null;
		l_PLANT_CD = null;
		l_mCustBase_TRANSPORT_LT = null;
		l_mCustBase_IN_COMPANYCD = null;
		l_mCustBase_IN_CUSTCD = null;
		l_mCustBase_IN_DLVLOCCD = null;
		l_strSYUKA_LT = null;
		l_strTaxIN_COMPANYCD = null;
		l_strTaxIN_CUSTCD = null;
		l_g_CUST_ITEM_CD = null;
		l_strT_ODR_TAX = null;
		l_g_SLIP_CD = null;
		l_getTship_SHIP_SEQ_NO = null;
		l_chkLOT_NO = null;
		l_chkITEM_CD = null;
		l_getQtySTOCK_ON_HAND_QTY = null;
		l_getQtyALCD_QTY = null;
		l_getQtyITEM_CD = null;
		l_getQtyWH_CD = null;
		l_getQtyLOT_NO = null;
		l_readTlotStock_LOT_NO = null;
		l_readTlotStock_STOCK_ON_HAND_QTY = null;
		l_readTlotStock_ALCD_QTY = null;
		l_readTlotStock_IN_ITEM_CD = null;
		l_readTlotStock_IN_WH_CD = null;
		l_readTlotStock_IN_LOT_NO = null;
		l_upTlotStockSTOCK_ON_HAND_QTY = null;
		l_upTlotStockIN_ITEM_CD = null;
		l_upTlotStockIN_WH_CD = null;
		l_upTlotStockIN_LOT_NO = null;
		l_serLotSTOCK_ON_HAND_QTY = null;
		l_serLotALCD_QTY = null;
		l_serLotIN_ITEM_CD = null;
		l_serLotIN_WH_CD = null;
		l_serLotIN_LOT_NO = null;
		l_insertLotStock_ITEM_CD = null;
		l_insertLotStock_WH_CD = null;
		l_insertLotStock_LOT_CD = null;
		l_insertLotStock_PLANT_CD = null;
		l_insertLotStock_STOCK_ON_HAND_QTY = null;
		l_insertLotStock_DEFECT_QTY = null;
		l_insertLotStock_ALCD_QTY = null;
		l_insTshipInst_SHIP_SEQ_NO = null;
		l_insTshipInst_SHIP_ODR_NO = null;
		l_insTshipInst_LOT_NO = null;
		l_insTshipInst_ITEM_CD = null;
		l_insTshipInst_WH_CD = null;
		l_insTshipInst_ODR_NO = null;
		l_insTshipInst_SLIP_CD = null;
		l_insTshipInst_SHIP_QTY = null;
		l_insTshipInst_SHIP_DATE = null;
		l_delTshipInstIN_SHIP_SEQ_NO = null;
		l_delTshipInstIN_LOT_NO = null;
		l_tlotTrace_FROM_ITEM_CD = null;
		l_tlotTrace_FROM_LOT_NO = null;
		l_tlotTrace_TO_ITEM_CD = null;
		l_tlotTrace_TO_LOT_NO = null;
		l_tlotTrace_LOT_TRACE_TYP = null;
		l_tlotTrace_CUST_ODR_NO = null;
		l_tlotTrace_SLIP_CD = null;
		l_tlotTrace_ODR_NO = null;
		l_readTshipInst_LOT_NO = null;
		l_readTshipInst_SHIP_QTY = null;
		l_readTshipInst_SHIP_ODR_NO = null;
		l_readTshipInst_ITEM_CD = null;
		l_readTshipInst_WH_CD = null;
		l_readTshipInst_ODR_NO = null;
		l_readTshipInst_SLIP_CD = null;
		l_readTshipInst_SHIP_DATE = null;
		l_readTshipInst_IN_SHIP_SEQ_NO = null;
		l_readTshipInst_IN_LOT_NO = null;
		l_readT_Ship_Inst_Lot_NO = null;
		l_readT_Ship_Inst_Ship_Seq_NO = null;
		l_strOdrCurrncyCd = null;
		l_strExchTyp = null;
		l_g_DATE = null;
		l_selTShipOdr_MODIFY_COUNT = null;
		l_SEL_MODIFY_COUNT = null;

		return;
	}

	//////////////////////////////
	// OrteusWStruct
	// [UR[h
	public String sUser_ID = null;
	// set/get\bh
	public String getsUser_ID() { return sUser_ID; }
	public void setsUser_ID(String val) { sUser_ID = val; }

	// gDR[h
	public String sOrganization_CD = null;
	// set/get\bh
	public String getsOrganization_CD() { return sOrganization_CD; }
	public void setsOraganization_CD(String val) { sOrganization_CD = val; }

	// út
	public String sSysdate = null;
	// set/get\bh
	public String getsSysdate() { return sSysdate; }
	public void setsSysdate(String val) { sSysdate = val; }
	//////////////////////////////

	/**
	 * medKU0030010NXÌWRXgN^
	 */
	public KU0030010Struct()
	{
		//{{user_implement_code_constractor
                 // TODO: ±±ÉúðLqµÄ­¾³¢
                //}}user_implement_code_constractor

		return;
	}

	/**
	 * CX^XjóÉs¤
	 *
	 */
	protected void finalize()
	{
		clear();
		return;
	}

	/**
	 * f[^ÌZbg(ÂÊoEXgo¼û)
	 *
	 * @param struct Zbg·é³ÌStruct
	 */
	public void setStruct(KU0030010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setStructM(struct);
			this.setStructL(struct);
		}
	}

	/**
	 * f[^ÌZbg(ÂÊoÌÝ)
	 *
	 * @param struct Zbg·é³ÌStruct
	 */
	public void setStructM(KU0030010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setk_MODE(struct.getk_MODE());
			this.seth_RESULT(struct.geth_RESULT());
			this.setr_SEL_PTN(struct.getr_SEL_PTN());
			this.setg_DESINATED_SHIP_DATE(struct.getg_DESINATED_SHIP_DATE());
			this.setg_SHIP_QTY(struct.getg_SHIP_QTY());
			this.setg_SHIP_QTY2(struct.getg_SHIP_QTY2());
			this.setg_UNIT_PRICE(struct.getg_UNIT_PRICE());
			this.setg_CURRNCY(struct.getg_CURRNCY());
			this.setg_SHIP_ODR_AMOUNT(struct.getg_SHIP_ODR_AMOUNT());
			this.setg_WH_CD(struct.getg_WH_CD());
			this.setg_REMARKS(struct.getg_REMARKS());
			this.setg_CUST_ANAME(struct.getg_CUST_ANAME());
			this.setg_ITEM_CD(struct.getg_ITEM_CD());
			this.seth_AP_SECRTY_TYP(struct.geth_AP_SECRTY_TYP());
			this.seth_SHIP_QTY(struct.geth_SHIP_QTY());
			this.seth_ITEM_CD(struct.geth_ITEM_CD());
			this.seth_GYOMU_DATE(struct.geth_GYOMU_DATE());
			this.seth_EXCH_TYP(struct.geth_EXCH_TYP());
			this.seth_MODFIY_CNT(struct.geth_MODFIY_CNT());
			this.seth_TOTAL_SHIP_QTY(struct.geth_TOTAL_SHIP_QTY());
			this.setm_selRadio(struct.getm_selRadio());
			this.setr_SEL_PTN1(struct.getr_SEL_PTN1());
			this.setr_SEL_PTN2(struct.getr_SEL_PTN2());
			this.setr_SEL_PTN3(struct.getr_SEL_PTN3());
			this.seth_SELECT_FG(struct.geth_SELECT_FG());
			this.seth_UNIT_PRICE(struct.geth_UNIT_PRICE());
			this.setg_STOCK_UNIT(struct.getg_STOCK_UNIT());
			this.setg_STOCK_UNIT2(struct.getg_STOCK_UNIT2());
			this.setg_CUR_UNIT2(struct.getg_CUR_UNIT2());
			this.setg_WH_NAME(struct.getg_WH_NAME());
			this.setg_SALES_DEPT_CD(struct.getg_SALES_DEPT_CD());
			this.setg_ORG_NAME(struct.getg_ORG_NAME());
			this.setg_CUST_CD(struct.getg_CUST_CD());
			this.setg_CUST_ITEM_NAME(struct.getg_CUST_ITEM_NAME());
			this.setg_ITEM_NAME(struct.getg_ITEM_NAME());
			this.setg_CUST_ODR_NO(struct.getg_CUST_ODR_NO());
			this.setg_ODR_NO(struct.getg_ODR_NO());
			this.setg_PART_DLV_SEQ_NO(struct.getg_PART_DLV_SEQ_NO());
			this.setg_SHIP_ODR_NO(struct.getg_SHIP_ODR_NO());
			this.seth_DATE(struct.geth_DATE());
			this.setg_JOB_ODR_CD(struct.getg_JOB_ODR_CD());
			this.setc_JOB_ODR_CD(struct.getc_JOB_ODR_CD());
			this.setg_DIRECT_DLV_FLG(struct.getg_DIRECT_DLV_FLG());
			this.setg_STOCK_LOT_CD(struct.getg_STOCK_LOT_CD());
			this.seth_STOCK_LOT_CD(struct.geth_STOCK_LOT_CD());
			this.setparam1(struct.getparam1());
			this.setparam2(struct.getparam2());
			this.setparam3(struct.getparam3());
			this.setROUND_TYP(struct.getROUND_TYP());
			this.setUNIT_QTY_TYP(struct.getUNIT_QTY_TYP());
			this.setUNIT_FIG(struct.getUNIT_FIG());
			this.setstrCOMPANY_CD(struct.getstrCOMPANY_CD());
			this.setstrUSER_NAME(struct.getstrUSER_NAME());
			this.setstrPLANT_CD(struct.getstrPLANT_CD());
			this.setstrSECTION_CD(struct.getstrSECTION_CD());
			this.setstrORG_CD(struct.getstrORG_CD());
			this.setstrORG_NAME(struct.getstrORG_NAME());
			this.setstrORG_ANAME(struct.getstrORG_ANAME());
			this.setstrPLANT_NAME(struct.getstrPLANT_NAME());
			this.setstrPLANT_ANAME(struct.getstrPLANT_ANAME());
			this.setstrCAL_NO(struct.getstrCAL_NO());
			this.setstrUSER_CD(struct.getstrUSER_CD());
			this.setstrBUSINESS_OPR_DATE(struct.getstrBUSINESS_OPR_DATE());
			this.setserTori_SHIP_SEQ_NO(struct.getserTori_SHIP_SEQ_NO());
			this.setserTori_SHIP_ODR_NO(struct.getserTori_SHIP_ODR_NO());
			this.setserTori_SLIP_CD(struct.getserTori_SLIP_CD());
			this.setserTori_ODR_NO(struct.getserTori_ODR_NO());
			this.setserTori_PART_DLV_SEQ_NO(struct.getserTori_PART_DLV_SEQ_NO());
			this.setserTori_ORGNAL_SLIP_CD(struct.getserTori_ORGNAL_SLIP_CD());
			this.setserTori_SLIP_TRN_CD(struct.getserTori_SLIP_TRN_CD());
			this.setserTori_ITEM_CD(struct.getserTori_ITEM_CD());
			this.setserTori_JOB_ODR_CD(struct.getserTori_JOB_ODR_CD());
			this.setserTori_CUST_ITEM_CD(struct.getserTori_CUST_ITEM_CD());
			this.setserTori_CUST_ODR_NO(struct.getserTori_CUST_ODR_NO());
			this.setserTori_CUST_CD(struct.getserTori_CUST_CD());
			this.setserTori_CUST_NAME(struct.getserTori_CUST_NAME());
			this.setserTori_CUST_CHRG_PSN_CD(struct.getserTori_CUST_CHRG_PSN_CD());
			this.setserTori_SHIP_ODR_ISS_PSN_CD(struct.getserTori_SHIP_ODR_ISS_PSN_CD());
			this.setserTori_DLV_LOC_CD(struct.getserTori_DLV_LOC_CD());
			this.setserTori_DEPO_TYP(struct.getserTori_DEPO_TYP());
			this.setserTori_ALLCT_WH_CD(struct.getserTori_ALLCT_WH_CD());
			this.setserTori_DEPO_WH_CD(struct.getserTori_DEPO_WH_CD());
			this.setserTori_LOC_CD(struct.getserTori_LOC_CD());
			this.setserTori_SHIP_DATE(struct.getserTori_SHIP_DATE());
			this.setserTori_SHIP_QTY(struct.getserTori_SHIP_QTY());
			this.setserTori_UNIT_CD(struct.getserTori_UNIT_CD());
			this.setserTori_SHIP_UNIT_PRICE(struct.getserTori_SHIP_UNIT_PRICE());
			this.setserTori_SHIP_ODR_AMOUNT(struct.getserTori_SHIP_ODR_AMOUNT());
			this.setserTori_SHIP_ODR_AMOUNT_EXCH_RATES(struct.getserTori_SHIP_ODR_AMOUNT_EXCH_RATES());
			this.setserTori_CURRNCY_CD(struct.getserTori_CURRNCY_CD());
			this.setserTori_DIRECT_DLV_FLG(struct.getserTori_DIRECT_DLV_FLG());
			this.setserTori_SHIP_INFO_IF_CTRL_NO(struct.getserTori_SHIP_INFO_IF_CTRL_NO());
			this.setserTori_INSPC_ACPT_INFO_IF_CTRL_NO(struct.getserTori_INSPC_ACPT_INFO_IF_CTRL_NO());
			this.setserTori_DLV_KEY_NO(struct.getserTori_DLV_KEY_NO());
			this.setserTori_DEL_FLG(struct.getserTori_DEL_FLG());
			this.setserTori_CUR_NAME(struct.getserTori_CUR_NAME());
			this.setserTori_EXCH_TYP(struct.getserTori_EXCH_TYP());
			this.setserTori_MODIFY_COUNT(struct.getserTori_MODIFY_COUNT());
			this.setserTori_RETURN_QTY(struct.getserTori_RETURN_QTY());
			this.setserTori_TOTAL_SHIP_QTY(struct.getserTori_TOTAL_SHIP_QTY());
			this.setserTori_STATUS(struct.getserTori_STATUS());
			this.setserTori_INSPC_ACPT_TYP(struct.getserTori_INSPC_ACPT_TYP());
			this.setserToriSALES_DEPT_CD(struct.getserToriSALES_DEPT_CD());
			this.setserToriSALES_DATE(struct.getserToriSALES_DATE());
			this.seth_MRP_ODR_TYP(struct.geth_MRP_ODR_TYP());
			this.seth_LOT_CTRL_FLG(struct.geth_LOT_CTRL_FLG());
			this.setserTodrMODIFY_COUNT(struct.getserTodrMODIFY_COUNT());
			this.setserTori_IN_SLIPCD(struct.getserTori_IN_SLIPCD());
			this.setcreTship_SHIP_SEQ_NO(struct.getcreTship_SHIP_SEQ_NO());
			this.setcreTship_SHIP_ODR_NO(struct.getcreTship_SHIP_ODR_NO());
			this.setcreTship_SLIP_CD(struct.getcreTship_SLIP_CD());
			this.setcreTship_ODR_NO(struct.getcreTship_ODR_NO());
			this.setcreTship_PART_DLV_SEQ_NO(struct.getcreTship_PART_DLV_SEQ_NO());
			this.setcreTship_ORGNAL_SLIP_CD(struct.getcreTship_ORGNAL_SLIP_CD());
			this.setcreTship_SLIP_TRN_CD(struct.getcreTship_SLIP_TRN_CD());
			this.setcreTship_ITEM_CD(struct.getcreTship_ITEM_CD());
			this.setcreTship_JOB_ODR_CD(struct.getcreTship_JOB_ODR_CD());
			this.setcreTship_CUST_ITEM_CD(struct.getcreTship_CUST_ITEM_CD());
			this.setcreTship_CUST_ODR_NO(struct.getcreTship_CUST_ODR_NO());
			this.setcreTship_CUST_CD(struct.getcreTship_CUST_CD());
			this.setcreTship_CUST_NAME(struct.getcreTship_CUST_NAME());
			this.setcreTship_CUST_CHRG_PSN_CD(struct.getcreTship_CUST_CHRG_PSN_CD());
			this.setcreTship_SHIP_ODR_ISS_PSN_CD(struct.getcreTship_SHIP_ODR_ISS_PSN_CD());
			this.setcreTship_DLV_LOC_CD(struct.getcreTship_DLV_LOC_CD());
			this.setcreTship_DEPO_TYP(struct.getcreTship_DEPO_TYP());
			this.setcreTship_ALLCT_WH_CD(struct.getcreTship_ALLCT_WH_CD());
			this.setcreTship_DEPO_WH_CD(struct.getcreTship_DEPO_WH_CD());
			this.setcreTship_LOC_CD(struct.getcreTship_LOC_CD());
			this.setcreTship_SHIP_DATE(struct.getcreTship_SHIP_DATE());
			this.setcreTship_SHIP_QTY(struct.getcreTship_SHIP_QTY());
			this.setcreTship_UNIT_CD(struct.getcreTship_UNIT_CD());
			this.setcreTship_SHIP_UNIT_PRICE(struct.getcreTship_SHIP_UNIT_PRICE());
			this.setcreTship_SHIP_ODR_AMOUNT(struct.getcreTship_SHIP_ODR_AMOUNT());
			this.setcreTship_SHIP_ODR_AMOUNT_EXCH_RATES(struct.getcreTship_SHIP_ODR_AMOUNT_EXCH_RATES());
			this.setcreTship_CURRNCY_CD(struct.getcreTship_CURRNCY_CD());
			this.setcreTship_DIRECT_DLV_FLG(struct.getcreTship_DIRECT_DLV_FLG());
			this.setcreTship_DLV_KEY_NO(struct.getcreTship_DLV_KEY_NO());
			this.setcreTship_REMARKS(struct.getcreTship_REMARKS());
			this.setcreTship_DEL_FLG(struct.getcreTship_DEL_FLG());
			this.setupdTship_SHIP_SEQ_NO(struct.getupdTship_SHIP_SEQ_NO());
			this.setserInsert_SHIP_ODR_NO(struct.getserInsert_SHIP_ODR_NO());
			this.setserInsert_ODR_NO(struct.getserInsert_ODR_NO());
			this.setserInsert_PART_DLV_SEQ_NO(struct.getserInsert_PART_DLV_SEQ_NO());
			this.setserInsert_SLIP_CD(struct.getserInsert_SLIP_CD());
			this.setserInsert_ITEM_CD(struct.getserInsert_ITEM_CD());
			this.setserInsert_JOB_ODR_CD(struct.getserInsert_JOB_ODR_CD());
			this.setserInsert_CUST_ITEM_CD(struct.getserInsert_CUST_ITEM_CD());
			this.setserInsert_CUST_ODR_NO(struct.getserInsert_CUST_ODR_NO());
			this.setserInsert_CUST_CD(struct.getserInsert_CUST_CD());
			this.setserInsert_CUST_NAME(struct.getserInsert_CUST_NAME());
			this.setserInsert_CUST_CHRG_PSN_CD(struct.getserInsert_CUST_CHRG_PSN_CD());
			this.setserInsert_SHIP_ODR_ISS_PSN_CD(struct.getserInsert_SHIP_ODR_ISS_PSN_CD());
			this.setserInsert_DLV_LOC_CD(struct.getserInsert_DLV_LOC_CD());
			this.setserInsert_DEPO_TYP(struct.getserInsert_DEPO_TYP());
			this.setserInsert_DESINATED_SHIP_DATE(struct.getserInsert_DESINATED_SHIP_DATE());
			this.setserInsert_SHIP_QTY(struct.getserInsert_SHIP_QTY());
			this.setserInsert_TOTAL_SHIP_QTY(struct.getserInsert_TOTAL_SHIP_QTY());
			this.setserInsert_UNIT_CD(struct.getserInsert_UNIT_CD());
			this.setserInsert_UNIT_PRICE(struct.getserInsert_UNIT_PRICE());
			this.setserInsert_SHIP_ODR_AMOUNT(struct.getserInsert_SHIP_ODR_AMOUNT());
			this.setserInsert_SHIP_ODR_AMOUNT_EXCH_RATES(struct.getserInsert_SHIP_ODR_AMOUNT_EXCH_RATES());
			this.setserInsert_CURRNCY_CD(struct.getserInsert_CURRNCY_CD());
			this.setserInsert_LOC_CD(struct.getserInsert_LOC_CD());
			this.setserInsert_PKG_UNIT_QTY(struct.getserInsert_PKG_UNIT_QTY());
			this.setserInsert_REMARKS(struct.getserInsert_REMARKS());
			this.setserInsert_TRANSPORT_CD(struct.getserInsert_TRANSPORT_CD());
			this.setserInsert_TRANSPORT_TYP(struct.getserInsert_TRANSPORT_TYP());
			this.setserInsert_ALLCT_WH_CD(struct.getserInsert_ALLCT_WH_CD());
			this.setserInsert_TRANSFER_WH_CD(struct.getserInsert_TRANSFER_WH_CD());
			this.setserInsert_DIRECT_DLV_FLG(struct.getserInsert_DIRECT_DLV_FLG());
			this.setserInsert_ENTRY_TYP(struct.getserInsert_ENTRY_TYP());
			this.setserInsert_PRINT_FLG(struct.getserInsert_PRINT_FLG());
			this.setserInsert_SHP_CMPLT_FLG(struct.getserInsert_SHP_CMPLT_FLG());
			this.setserInsert_DEPO_TRANSFER_PROC_FLG(struct.getserInsert_DEPO_TRANSFER_PROC_FLG());
			this.setserInsert_DEL_FLG(struct.getserInsert_DEL_FLG());
			this.setserInsert_CUR_CD(struct.getserInsert_CUR_CD());
			this.setserInsert_CUR_NAME(struct.getserInsert_CUR_NAME());
			this.setserInsert_EXCH_TYP(struct.getserInsert_EXCH_TYP());
			this.setserInsert_SPCL_PRICE_TYP(struct.getserInsert_SPCL_PRICE_TYP());
			this.setserInsert_MODIFY_COUNT(struct.getserInsert_MODIFY_COUNT());
			this.setserInsert_SCDL_DLV_DATE(struct.getserInsert_SCDL_DLV_DATE());
			this.setserInsert_DLV_KEY_NO(struct.getserInsert_DLV_KEY_NO());
			this.seth_RETURN_QTY(struct.geth_RETURN_QTY());
			this.setserInsert_ODR_ACPT_DATE(struct.getserInsert_ODR_ACPT_DATE());
			this.seth_JOB_ODR_CD(struct.geth_JOB_ODR_CD());
			this.setselMODIFY_COUNT(struct.getselMODIFY_COUNT());
			this.setserInsert_IN_SLIPCD(struct.getserInsert_IN_SLIPCD());
			this.setupTshipOdr_DEPO_TRANSFER_PROC_FLG(struct.getupTshipOdr_DEPO_TRANSFER_PROC_FLG());
			this.setupTshipOdr_IN_SLIPCD(struct.getupTshipOdr_IN_SLIPCD());
			this.setchkisWhCd_WH_CD(struct.getchkisWhCd_WH_CD());
			this.setchkisWhCd_WH_TYP(struct.getchkisWhCd_WH_TYP());
			this.setchkisinWhCd_WH_NAME(struct.getchkisinWhCd_WH_NAME());
			this.setchkisWhCd_IN_WHCD(struct.getchkisWhCd_IN_WHCD());
			this.setchkisWhCd_IN_WHTYP(struct.getchkisWhCd_IN_WHTYP());
			this.setcreTsales_SHIP_ODR_NO(struct.getcreTsales_SHIP_ODR_NO());
			this.setcreTsales_SLIP_CD(struct.getcreTsales_SLIP_CD());
			this.setcreTsales_SALES_TYP(struct.getcreTsales_SALES_TYP());
			this.setcreTsales_CUST_CD(struct.getcreTsales_CUST_CD());
			this.setcreTsales_ITEM_CD(struct.getcreTsales_ITEM_CD());
			this.setcreTsales_ITEM_NAME(struct.getcreTsales_ITEM_NAME());
			this.setcreTsales_CUST_ODR_NO(struct.getcreTsales_CUST_ODR_NO());
			this.setcreTsales_SALES_DATE(struct.getcreTsales_SALES_DATE());
			this.setcreTsales_SALES_DEPT_CD(struct.getcreTsales_SALES_DEPT_CD());
			this.setcreTsales_CUST_CHRG_PSN_CD(struct.getcreTsales_CUST_CHRG_PSN_CD());
			this.setcreTsales_ODR_ACPT_PSN_CD(struct.getcreTsales_ODR_ACPT_PSN_CD());
			this.setcreTsales_SALES_QTY(struct.getcreTsales_SALES_QTY());
			this.setcreTsales_SALES_UNIT_PRICE(struct.getcreTsales_SALES_UNIT_PRICE());
			this.setcreTsales_UNIT_CD(struct.getcreTsales_UNIT_CD());
			this.setcreTsales_SALES_AMOUNT(struct.getcreTsales_SALES_AMOUNT());
			this.setcreTsales_SALES_AMOUNT_EXCH_RATES(struct.getcreTsales_SALES_AMOUNT_EXCH_RATES());
			this.setcreTsales_INSPC_ACPT_DATE(struct.getcreTsales_INSPC_ACPT_DATE());
			this.setcreTsales_INSPC_ACPT_QTY(struct.getcreTsales_INSPC_ACPT_QTY());
			this.setcreTsales_EXTERNAL_TAX_SALES_AMOUNT(struct.getcreTsales_EXTERNAL_TAX_SALES_AMOUNT());
			this.setcreTsales_INTERNAL_TAX_SALES_AMOUNT(struct.getcreTsales_INTERNAL_TAX_SALES_AMOUNT());
			this.setcreTsales_TAXFREE_SALES_AMOUNT(struct.getcreTsales_TAXFREE_SALES_AMOUNT());
			this.setcreTsales_TAX_CREDIT_SALES_AMOUNT(struct.getcreTsales_TAX_CREDIT_SALES_AMOUNT());
			this.setcreTsales_EXTERNAL_TAX_AMOUNT(struct.getcreTsales_EXTERNAL_TAX_AMOUNT());
			this.setcreTsales_INTERNAL_TAX_AMOUNT(struct.getcreTsales_INTERNAL_TAX_AMOUNT());
			this.setcreTsales_TAX_AMOUNT_1(struct.getcreTsales_TAX_AMOUNT_1());
			this.setcreTsales_TAX_AMOUNT_2(struct.getcreTsales_TAX_AMOUNT_2());
			this.setcreTsales_TAX_AMOUNT_3(struct.getcreTsales_TAX_AMOUNT_3());
			this.setcreTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT(struct.getcreTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT());
			this.setcreTsales_ORG_SLIP_CD(struct.getcreTsales_ORG_SLIP_CD());
			this.setcreTsales_CURRNCY_CD(struct.getcreTsales_CURRNCY_CD());
			this.setcreTsales_SPCL_PRICE_CO(struct.getcreTsales_SPCL_PRICE_CO());
			this.setcreTsales_REMARKS(struct.getcreTsales_REMARKS());
			this.setcreTsales_DEL_FLG(struct.getcreTsales_DEL_FLG());
			this.setcreTsales_INSPC_ACPT_TYP(struct.getcreTsales_INSPC_ACPT_TYP());
			this.setcreTsales_STATUS(struct.getcreTsales_STATUS());
			this.setcreTsales_APPR_FLG(struct.getcreTsales_APPR_FLG());
			this.setcreTsales_APPR_ID(struct.getcreTsales_APPR_ID());
			this.setcreTsales_APPR_DATE(struct.getcreTsales_APPR_DATE());
			this.setcreTsales_EXCH_RATE(struct.getcreTsales_EXCH_RATE());
			this.setserTsales_SALES_SEQ_NO(struct.getserTsales_SALES_SEQ_NO());
			this.setserTsales_SLIP_CD(struct.getserTsales_SLIP_CD());
			this.setserTsales_SALES_TYP(struct.getserTsales_SALES_TYP());
			this.setserTsales_CUST_CD(struct.getserTsales_CUST_CD());
			this.setserTsales_ITEM_CD(struct.getserTsales_ITEM_CD());
			this.setserTsales_ITEM_NAME(struct.getserTsales_ITEM_NAME());
			this.setserTsales_CUST_ODR_NO(struct.getserTsales_CUST_ODR_NO());
			this.setserTsales_SALES_DATE(struct.getserTsales_SALES_DATE());
			this.setserTsales_SALES_DEPT_CD(struct.getserTsales_SALES_DEPT_CD());
			this.setserTsales_CUST_CHRG_PSN_CD(struct.getserTsales_CUST_CHRG_PSN_CD());
			this.setserTsales_ODR_ACPT_PSN_CD(struct.getserTsales_ODR_ACPT_PSN_CD());
			this.setserTsales_SALES_QTY(struct.getserTsales_SALES_QTY());
			this.setserTsales_SALES_UNIT_PRICE(struct.getserTsales_SALES_UNIT_PRICE());
			this.setserTsales_UNIT_CD(struct.getserTsales_UNIT_CD());
			this.setserTsales_SALES_AMOUNT(struct.getserTsales_SALES_AMOUNT());
			this.setserTsales_SALES_AMOUNT_EXCH_RATES(struct.getserTsales_SALES_AMOUNT_EXCH_RATES());
			this.setserTsales_EXTERNAL_TAX_SALES_AMOUNT(struct.getserTsales_EXTERNAL_TAX_SALES_AMOUNT());
			this.setserTsales_INTERNAL_TAX_SALES_AMOUNT(struct.getserTsales_INTERNAL_TAX_SALES_AMOUNT());
			this.setserTsales_TAXFREE_SALES_AMOUNT(struct.getserTsales_TAXFREE_SALES_AMOUNT());
			this.setserTsales_TAX_CREDIT_SALES_AMOUNT(struct.getserTsales_TAX_CREDIT_SALES_AMOUNT());
			this.setserTsales_EXTERNAL_TAX_AMOUNT(struct.getserTsales_EXTERNAL_TAX_AMOUNT());
			this.setserTsales_INTERNAL_TAX_AMOUNT(struct.getserTsales_INTERNAL_TAX_AMOUNT());
			this.setserTsales_TAX_AMOUNT_1(struct.getserTsales_TAX_AMOUNT_1());
			this.setserTsales_TAX_AMOUNT_2(struct.getserTsales_TAX_AMOUNT_2());
			this.setserTsales_TAX_AMOUNT_3(struct.getserTsales_TAX_AMOUNT_3());
			this.setserTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT(struct.getserTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT());
			this.setserTsales_ORG_SLIP_CD(struct.getserTsales_ORG_SLIP_CD());
			this.setserTsales_CURRNCY_CD(struct.getserTsales_CURRNCY_CD());
			this.setserTsales_SPCL_PRICE_CO(struct.getserTsales_SPCL_PRICE_CO());
			this.setserTsales_REMARKS(struct.getserTsales_REMARKS());
			this.setserTsales_DEL_FLG(struct.getserTsales_DEL_FLG());
			this.setserTsales_INSPC_ACPT_TYP(struct.getserTsales_INSPC_ACPT_TYP());
			this.setserTsales_STATUS(struct.getserTsales_STATUS());
			this.setserTsales_PRD_ODR_PLACE_CD(struct.getserTsales_PRD_ODR_PLACE_CD());
			this.setserTsales_EXCH_RATE(struct.getserTsales_EXCH_RATE());
			this.setserTsales_IN_SLIPCD(struct.getserTsales_IN_SLIPCD());
			this.setupdTsales_APPR_FLG(struct.getupdTsales_APPR_FLG());
			this.setupdTsales_APPR_ID(struct.getupdTsales_APPR_ID());
			this.setupdTsales_APPR_DATE(struct.getupdTsales_APPR_DATE());
			this.setupdTsales_SALES_SEQ_NO(struct.getupdTsales_SALES_SEQ_NO());
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
			this.setmItemSpec_CUST_CD(struct.getmItemSpec_CUST_CD());
			this.setmItemSpec_CUST_ITEM_CD(struct.getmItemSpec_CUST_ITEM_CD());
			this.setmItemSpec_COMPANY_CD(struct.getmItemSpec_COMPANY_CD());
			this.setmItemSpec_SALES_DEPT_CD(struct.getmItemSpec_SALES_DEPT_CD());
			this.setmItemSpec_CUST_ITEM_NAME(struct.getmItemSpec_CUST_ITEM_NAME());
			this.setmItemSpec_IN_CUST_CD(struct.getmItemSpec_IN_CUST_CD());
			this.setmItemSpec_IN_CUST_ITEM_CD(struct.getmItemSpec_IN_CUST_ITEM_CD());
			this.setmItemSpec_IN_COMPANY_CD(struct.getmItemSpec_IN_COMPANY_CD());
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
			this.settOdr_DLV_KEY_NO(struct.gettOdr_DLV_KEY_NO());
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
			this.settOdr_DEL_FLG(struct.gettOdr_DEL_FLG());
			this.settOdr_SHIP_CNT(struct.gettOdr_SHIP_CNT());
			this.settOdr_UNIT_CD_ORG(struct.gettOdr_UNIT_CD_ORG());
			this.settOdrCtl_CUST_ITEM_CD(struct.gettOdrCtl_CUST_ITEM_CD());
			this.settOdr_COCK_TYP(struct.gettOdr_COCK_TYP());
			this.settOdr_PUCH_ODR_QTY_TOTAL(struct.gettOdr_PUCH_ODR_QTY_TOTAL());
			this.settOdr_BUYER_ORG_CD(struct.gettOdr_BUYER_ORG_CD());
			this.settOdr_BUYER_NAME(struct.gettOdr_BUYER_NAME());
			this.settOdr_IN_ODRNO(struct.gettOdr_IN_ODRNO());
			this.setcreTodrODR_NO(struct.getcreTodrODR_NO());
			this.setcreTodrODR_TYP(struct.getcreTodrODR_TYP());
			this.setcreTodrODR_CTL_NO(struct.getcreTodrODR_CTL_NO());
			this.setcreTodrCUST_ODR_NO(struct.getcreTodrCUST_ODR_NO());
			this.setcreTodrCUST_CHRG_ORG_CD(struct.getcreTodrCUST_CHRG_ORG_CD());
			this.setcreTodrCUST_CHRG_PSN_CD(struct.getcreTodrCUST_CHRG_PSN_CD());
			this.setcreTodrODR_ACPT_ORG_CD(struct.getcreTodrODR_ACPT_ORG_CD());
			this.setcreTodrODR_ACPT_PSN_CD(struct.getcreTodrODR_ACPT_PSN_CD());
			this.setcreTodrCURRNCY_CD(struct.getcreTodrCURRNCY_CD());
			this.setcreTodrEXCH_TYP(struct.getcreTodrEXCH_TYP());
			this.setcreTodrDLV_LOC_CD(struct.getcreTodrDLV_LOC_CD());
			this.setcreTodrDLV_LOC_NAME(struct.getcreTodrDLV_LOC_NAME());
			this.setcreTodrDLV_LOC_NAME_KANJI(struct.getcreTodrDLV_LOC_NAME_KANJI());
			this.setcreTodrPRD_ODR_PLACE_CD(struct.getcreTodrPRD_ODR_PLACE_CD());
			this.setcreTodrODR_UNIT_PRICE(struct.getcreTodrODR_UNIT_PRICE());
			this.setcreTodrPART_DLV_COUNT(struct.getcreTodrPART_DLV_COUNT());
			this.setcreTodrDEPO_TYP(struct.getcreTodrDEPO_TYP());
			this.setcreTodrDESINATED_DLV_DATE(struct.getcreTodrDESINATED_DLV_DATE());
			this.setcreTodrODR_QTY(struct.getcreTodrODR_QTY());
			this.setcreTodrREMAIN_UNCONFIRM_ODR_QTY(struct.getcreTodrREMAIN_UNCONFIRM_ODR_QTY());
			this.setcreTodrCANCELED_UNCONFIRM_ODR_QTY(struct.getcreTodrCANCELED_UNCONFIRM_ODR_QTY());
			this.setcreTodrUNIT_CD(struct.getcreTodrUNIT_CD());
			this.setcreTodrUNCONFIRM_ODR_BALANCE(struct.getcreTodrUNCONFIRM_ODR_BALANCE());
			this.setcreTodrODR_AMOUNT(struct.getcreTodrODR_AMOUNT());
			this.setcreTodrODR_AMOUNT_EXCH_RATES(struct.getcreTodrODR_AMOUNT_EXCH_RATES());
			this.setcreTodrTOTAL_SHIP_QTY(struct.getcreTodrTOTAL_SHIP_QTY());
			this.setcreTodrSHIP_AMOUNT(struct.getcreTodrSHIP_AMOUNT());
			this.setcreTodrSHIP_AMOUNT_EXCH_RATES(struct.getcreTodrSHIP_AMOUNT_EXCH_RATES());
			this.setcreTodrODR_CMPLT_FLG(struct.getcreTodrODR_CMPLT_FLG());
			this.setcreTodrODR_CMPLT_DATE(struct.getcreTodrODR_CMPLT_DATE());
			this.setcreTodrREMARKS(struct.getcreTodrREMARKS());
			this.setcreTodrODR_ACPT_DATE(struct.getcreTodrODR_ACPT_DATE());
			this.setcreTodrSHIP_PLAN_REMAIN_QTY(struct.getcreTodrSHIP_PLAN_REMAIN_QTY());
			this.setcreTodrSHIP_PLAN_CMPLT_FLG(struct.getcreTodrSHIP_PLAN_CMPLT_FLG());
			this.setcreTodrUNCONFIRMED_ODR_EFF_OVR_FLG(struct.getcreTodrUNCONFIRMED_ODR_EFF_OVR_FLG());
			this.setcreTodrPARTIAL_SHIP_INST_FLG(struct.getcreTodrPARTIAL_SHIP_INST_FLG());
			this.setcreTodrENTRY_TYP(struct.getcreTodrENTRY_TYP());
			this.setcreTodrDEL_FLG(struct.getcreTodrDEL_FLG());
			this.setupTodr_TOTAL_SHIP_QTY(struct.getupTodr_TOTAL_SHIP_QTY());
			this.setupTodr_SHIP_AMOUNT(struct.getupTodr_SHIP_AMOUNT());
			this.setupTodr_SHIP_AMOUNT_EXCH_RATES(struct.getupTodr_SHIP_AMOUNT_EXCH_RATES());
			this.setupTodr_ODR_CMPLT_FLG(struct.getupTodr_ODR_CMPLT_FLG());
			this.setupTodr_ODR_CMPLT_DATE(struct.getupTodr_ODR_CMPLT_DATE());
			this.setupTodr_IN_ODRNO(struct.getupTodr_IN_ODRNO());
			this.setcreTrcvIssue_RCV_ISSUE_CTRL_CD(struct.getcreTrcvIssue_RCV_ISSUE_CTRL_CD());
			this.setcreTrcvIssue_RCV_ISSUE_TYP(struct.getcreTrcvIssue_RCV_ISSUE_TYP());
			this.setcreTrcvIssue_ITEM_CD(struct.getcreTrcvIssue_ITEM_CD());
			this.setcreTrcvIssue_JOB_ODR_CD(struct.getcreTrcvIssue_JOB_ODR_CD());
			this.setcreTrcvIssue_PLANT_CD(struct.getcreTrcvIssue_PLANT_CD());
			this.setcreTrcvIssue_WH_CD(struct.getcreTrcvIssue_WH_CD());
			this.setcreTrcvIssue_RCV_ISSUE_BEFORE_QTY(struct.getcreTrcvIssue_RCV_ISSUE_BEFORE_QTY());
			this.setcreTrcvIssue_RCV_ISSUE_QTY(struct.getcreTrcvIssue_RCV_ISSUE_QTY());
			this.setcreTrcvIssue_RCV_ISSUE_AFTER_QTY(struct.getcreTrcvIssue_RCV_ISSUE_AFTER_QTY());
			this.setcreTrcvIssue_RCV_ISSUE_AMOUNT(struct.getcreTrcvIssue_RCV_ISSUE_AMOUNT());
			this.setcreTrcvIssue_RCV_ISSUE_DATE(struct.getcreTrcvIssue_RCV_ISSUE_DATE());
			this.setcreTrcvIssue_RCV_ISSUE_GNR_TYP(struct.getcreTrcvIssue_RCV_ISSUE_GNR_TYP());
			this.setcreTrcvIssue_STOCK_UPD_TYP(struct.getcreTrcvIssue_STOCK_UPD_TYP());
			this.setcreTrcvIssue_RCV_ISSUE_CMPLT_FLG(struct.getcreTrcvIssue_RCV_ISSUE_CMPLT_FLG());
			this.setcreTrcvIssue_RCV_ISSUE_COMMENT(struct.getcreTrcvIssue_RCV_ISSUE_COMMENT());
			this.setcreTrcvIssue_LOT_NO(struct.getcreTrcvIssue_LOT_NO());
			this.setcreTrcvIssue_SHIP_ODR_NO(struct.getcreTrcvIssue_SHIP_ODR_NO());
			this.setupTitemStock_STOCK_ON_HAND_QTY(struct.getupTitemStock_STOCK_ON_HAND_QTY());
			this.setupTitemStock_IN_ITEMCD(struct.getupTitemStock_IN_ITEMCD());
			this.setupTitemStock_IN_WHCD(struct.getupTitemStock_IN_WHCD());
			this.setserTitemStock_ITEM_CD(struct.getserTitemStock_ITEM_CD());
			this.setserTitemStock_WH_CD(struct.getserTitemStock_WH_CD());
			this.setserTitemStock_PLANT_CD(struct.getserTitemStock_PLANT_CD());
			this.setserTitemStock_STOCK_ON_HAND_QTY(struct.getserTitemStock_STOCK_ON_HAND_QTY());
			this.setserTitemStock_DEFECT_QTY(struct.getserTitemStock_DEFECT_QTY());
			this.setserTitemStock_PRVS_DAYEND_STOCK_QTY(struct.getserTitemStock_PRVS_DAYEND_STOCK_QTY());
			this.setserTitemStock_PRVS_MONTHEND_STOCK_QTY(struct.getserTitemStock_PRVS_MONTHEND_STOCK_QTY());
			this.setserTitemStock_PRVS_TERMEND_STOCK_QTY(struct.getserTitemStock_PRVS_TERMEND_STOCK_QTY());
			this.setserTitemStock_IN_ITEMCD(struct.getserTitemStock_IN_ITEMCD());
			this.setserTitemStock_IN_WHCD(struct.getserTitemStock_IN_WHCD());
			this.setcreTitemStock_WH_CD(struct.getcreTitemStock_WH_CD());
			this.setcreTitemStock_ITEM_CD(struct.getcreTitemStock_ITEM_CD());
			this.setcreTitemStock_PLANT_CD(struct.getcreTitemStock_PLANT_CD());
			this.setcreTitemStock_STOCK_ON_HAND_QTY(struct.getcreTitemStock_STOCK_ON_HAND_QTY());
			this.setmCust_COMPANY_CD(struct.getmCust_COMPANY_CD());
			this.setmCust_CUST_CD(struct.getmCust_CUST_CD());
			this.setmCust_CUST_NAME(struct.getmCust_CUST_NAME());
			this.setmCust_DETAIL_ROUND_TYP(struct.getmCust_DETAIL_ROUND_TYP());
			this.setmCust_INSPC_ACPT_TYP(struct.getmCust_INSPC_ACPT_TYP());
			this.setmCust_OWN_ORG_CD(struct.getmCust_OWN_ORG_CD());
			this.setmCust_EXCH_TYP(struct.getmCust_EXCH_TYP());
			this.setmCust_CUR_CD(struct.getmCust_CUR_CD());
			this.setmCust_IN_COMPANYCD(struct.getmCust_IN_COMPANYCD());
			this.setmCust_IN_CUSTCD(struct.getmCust_IN_CUSTCD());
			this.setgetHomeCur_CUR_CD(struct.getgetHomeCur_CUR_CD());
			this.setgetHomeCur_DECIMAL_FIG(struct.getgetHomeCur_DECIMAL_FIG());
			this.setgetHomeCur_CTRL_CD(struct.getgetHomeCur_CTRL_CD());
			this.setstrCode(struct.getstrCode());
			this.setmUnitCost_UNIT_COST(struct.getmUnitCost_UNIT_COST());
			this.setmUnitCost_EFF_PHASE_IN_DATE(struct.getmUnitCost_EFF_PHASE_IN_DATE());
			this.setmUnitCost_IN_COMPANYCD(struct.getmUnitCost_IN_COMPANYCD());
			this.setmUnitCost_IN_CUSTCD(struct.getmUnitCost_IN_CUSTCD());
			this.setmUnitCost_IN_ITEMCD(struct.getmUnitCost_IN_ITEMCD());
			this.setmUnitCost_IN_EFFPHASEINDATE(struct.getmUnitCost_IN_EFFPHASEINDATE());
			this.setreadShipOdr_TOTAL_SHIP_QTY(struct.getreadShipOdr_TOTAL_SHIP_QTY());
			this.setreadShipOdr_RETURN_QTY(struct.getreadShipOdr_RETURN_QTY());
			this.setreadShipOdr_SHIP_ODR_NO(struct.getreadShipOdr_SHIP_ODR_NO());
			this.setg_CUR_UNIT(struct.getg_CUR_UNIT());
			this.setDECIMAL_FIG(struct.getDECIMAL_FIG());
			this.sett_CUR_CD(struct.gett_CUR_CD());
			this.setstrSLIP_CTRL_GRP(struct.getstrSLIP_CTRL_GRP());
			this.setstrSTATUS(struct.getstrSTATUS());
			this.setstrSLIP_CD(struct.getstrSLIP_CD());
			this.setupTshipOdr_SHP_CMPLT_FLG(struct.getupTshipOdr_SHP_CMPLT_FLG());
			this.setupTshipOdr_TOTAL_SHIP_QTY(struct.getupTshipOdr_TOTAL_SHIP_QTY());
			this.setupTshipOdr_SLIP_CD(struct.getupTshipOdr_SLIP_CD());
			this.setupTshipOdr_ORG_SLIP_CD(struct.getupTshipOdr_ORG_SLIP_CD());
			this.setupTshipOdr_SHIP_ODR_NO(struct.getupTshipOdr_SHIP_ODR_NO());
			this.setstrTod_OD_NO(struct.getstrTod_OD_NO());
			this.setstrTod_TOTAL_ISSUE_QTY(struct.getstrTod_TOTAL_ISSUE_QTY());
			this.setstrTod_DM_QTY(struct.getstrTod_DM_QTY());
			this.setstrTod_DM_STS_TYP(struct.getstrTod_DM_STS_TYP());
			this.setinTod_ODR_NO(struct.getinTod_ODR_NO());
			this.setinTod_PART_DLV_SEQ_NO(struct.getinTod_PART_DLV_SEQ_NO());
			this.setinTod_OD_NO(struct.getinTod_OD_NO());
			this.setstrTaxTAX_KBN(struct.getstrTaxTAX_KBN());
			this.setstrTaxOLD_TAX_1(struct.getstrTaxOLD_TAX_1());
			this.setstrTaxOLD_TAX_2(struct.getstrTaxOLD_TAX_2());
			this.setstrTaxOLD_TAX_3(struct.getstrTaxOLD_TAX_3());
			this.setstrTaxNEW_TAX_1(struct.getstrTaxNEW_TAX_1());
			this.setstrTaxNEW_TAX_2(struct.getstrTaxNEW_TAX_2());
			this.setstrTaxNEW_TAX_3(struct.getstrTaxNEW_TAX_3());
			this.setstrTaxSTART_DATE(struct.getstrTaxSTART_DATE());
			this.setstrTaxROUND_TYP(struct.getstrTaxROUND_TYP());
			this.setupdiffTAX_CD(struct.getupdiffTAX_CD());
			this.setupTshipOdr_RETURN_QTY(struct.getupTshipOdr_RETURN_QTY());
			this.setchkSLIP_CD(struct.getchkSLIP_CD());
			this.setmWh_WH_NAME(struct.getmWh_WH_NAME());
			this.setmWh_PLANT_CD(struct.getmWh_PLANT_CD());
			this.setmWh_IN_WH_CD(struct.getmWh_IN_WH_CD());
			this.setmOrg_ORG_NAME(struct.getmOrg_ORG_NAME());
			this.setmOrg_IN_COMPANYCD(struct.getmOrg_IN_COMPANYCD());
			this.setmOrg_IN_ORGCD(struct.getmOrg_IN_ORGCD());
			this.setserTitemStock_JOB_ODR_CD(struct.getserTitemStock_JOB_ODR_CD());
			this.setserTitemStock_IN_JOBODRCD(struct.getserTitemStock_IN_JOBODRCD());
			this.setcreTitemStock_JOB_ODR_CD(struct.getcreTitemStock_JOB_ODR_CD());
			this.setupTitemStock_IN_JOBODRCD(struct.getupTitemStock_IN_JOBODRCD());
			this.setserTJobOdr_JOB_ODR_CD(struct.getserTJobOdr_JOB_ODR_CD());
			this.setserTJobOdr_ITEM_CD(struct.getserTJobOdr_ITEM_CD());
			this.setdiffSHIP_QTY(struct.getdiffSHIP_QTY());
			this.setdiffSHIP_ODR_AMOUNT(struct.getdiffSHIP_ODR_AMOUNT());
			this.setdiffSHIP_ODR_AMOUNT_EXCH_RATE(struct.getdiffSHIP_ODR_AMOUNT_EXCH_RATE());
			this.setdiffSHIP_ODR_NO(struct.getdiffSHIP_ODR_NO());
			this.setdiffODR_NO(struct.getdiffODR_NO());
			this.setdiffPART_DLV_SEQ_NO(struct.getdiffPART_DLV_SEQ_NO());
			this.setdiffSLIP_CD(struct.getdiffSLIP_CD());
			this.setdiffITEM_CD(struct.getdiffITEM_CD());
			this.setdiffJOB_ODR_CD(struct.getdiffJOB_ODR_CD());
			this.setdiffCUST_ITEM_CD(struct.getdiffCUST_ITEM_CD());
			this.setdiffCUST_ODR_NO(struct.getdiffCUST_ODR_NO());
			this.setdiffCUST_CD(struct.getdiffCUST_CD());
			this.setdiffCUST_NAME(struct.getdiffCUST_NAME());
			this.setdiffCUST_CHRG_PSN_CD(struct.getdiffCUST_CHRG_PSN_CD());
			this.setdiffSHIP_ODR_ISS_PSN_CD(struct.getdiffSHIP_ODR_ISS_PSN_CD());
			this.setdiffDLV_LOC_CD(struct.getdiffDLV_LOC_CD());
			this.setdiffDEPO_TYP(struct.getdiffDEPO_TYP());
			this.setdiffDESINATED_SHIP_DATE(struct.getdiffDESINATED_SHIP_DATE());
			this.setdiffSCDL_DLV_DATE(struct.getdiffSCDL_DLV_DATE());
			this.setdiffTOTAL_SHIP_QTY(struct.getdiffTOTAL_SHIP_QTY());
			this.setdiffRETURN_QTY(struct.getdiffRETURN_QTY());
			this.setdiffUNIT_CD(struct.getdiffUNIT_CD());
			this.setdiffUNIT_PRICE(struct.getdiffUNIT_PRICE());
			this.setdiffCURRENCY_CD(struct.getdiffCURRENCY_CD());
			this.setdiffLOC_CD(struct.getdiffLOC_CD());
			this.setdiffPKG_UNIT_QTY(struct.getdiffPKG_UNIT_QTY());
			this.setdiffREMARKS(struct.getdiffREMARKS());
			this.setdiffDLV_KEY_NO(struct.getdiffDLV_KEY_NO());
			this.setdiffPART_DLV_COUNT(struct.getdiffPART_DLV_COUNT());
			this.setdiffTRANSPORT_CD(struct.getdiffTRANSPORT_CD());
			this.setdiffTRANSPORT_TYP(struct.getdiffTRANSPORT_TYP());
			this.setdiffALLCT_WH_CD(struct.getdiffALLCT_WH_CD());
			this.setdiffTRANSFER_WH_CD(struct.getdiffTRANSFER_WH_CD());
			this.setdiffDIRECT_DLV_FLG(struct.getdiffDIRECT_DLV_FLG());
			this.setdiffENTRY_TYP(struct.getdiffENTRY_TYP());
			this.setdiffPRINT_FLG(struct.getdiffPRINT_FLG());
			this.setdiffSHIP_CMPLT_FLG(struct.getdiffSHIP_CMPLT_FLG());
			this.setdiffDEPO_TRANSFER_PROC_FLG(struct.getdiffDEPO_TRANSFER_PROC_FLG());
			this.setdiffDEL_FLG(struct.getdiffDEL_FLG());
			this.setdiffuptOdr_SHIP_CNT(struct.getdiffuptOdr_SHIP_CNT());
			this.setdiffuptOdr_PART_DLV_COUNT(struct.getdiffuptOdr_PART_DLV_COUNT());
			this.setdiffuptOdr_IN_ODRNO(struct.getdiffuptOdr_IN_ODRNO());
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
			this.setup_tShipSlip_SLIP_CD(struct.getup_tShipSlip_SLIP_CD());
			this.setupdiffSHIP_ODR_QTY(struct.getupdiffSHIP_ODR_QTY());
			this.setupdiffSHIP_ODR_AMOUNT(struct.getupdiffSHIP_ODR_AMOUNT());
			this.setupdiffTAX_AMOUNT(struct.getupdiffTAX_AMOUNT());
			this.setupdiffSHIP_ODR_AMOUNT_TAX(struct.getupdiffSHIP_ODR_AMOUNT_TAX());
			this.setupdiffEXTERNAL_TAX_SALES_AMOUNT(struct.getupdiffEXTERNAL_TAX_SALES_AMOUNT());
			this.setupdiffINTERNAL_TAX_SALES_AMOUNT(struct.getupdiffINTERNAL_TAX_SALES_AMOUNT());
			this.setupdiffTAXFREE_SALES_AMOUNT(struct.getupdiffTAXFREE_SALES_AMOUNT());
			this.setupdiffTAX_CREDIT_SALES_AMOUNT(struct.getupdiffTAX_CREDIT_SALES_AMOUNT());
			this.setupdiffEXTERNAL_TAX_AMOUNT(struct.getupdiffEXTERNAL_TAX_AMOUNT());
			this.setupdiffINTERNAL_TAX_AMOUNT(struct.getupdiffINTERNAL_TAX_AMOUNT());
			this.setupdiffTAX_AMOUNT_1(struct.getupdiffTAX_AMOUNT_1());
			this.setupdiffTAX_AMOUNT_2(struct.getupdiffTAX_AMOUNT_2());
			this.setupdiffTAX_AMOUNT_3(struct.getupdiffTAX_AMOUNT_3());
			this.setupdiffOWN_CUR_TAXCREDIT_SALES_AMOUNT(struct.getupdiffOWN_CUR_TAXCREDIT_SALES_AMOUNT());
			this.setupdiffSLIP_CD(struct.getupdiffSLIP_CD());
			this.setPAST_RESULT_ENTRY_TYP(struct.getPAST_RESULT_ENTRY_TYP());
			this.setPROC_EXEC_DATE(struct.getPROC_EXEC_DATE());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setmCustBase_TRANSPORT_LT(struct.getmCustBase_TRANSPORT_LT());
			this.setmCustBase_IN_COMPANYCD(struct.getmCustBase_IN_COMPANYCD());
			this.setmCustBase_IN_CUSTCD(struct.getmCustBase_IN_CUSTCD());
			this.setmCustBase_IN_DLVLOCCD(struct.getmCustBase_IN_DLVLOCCD());
			this.setstrSYUKA_LT(struct.getstrSYUKA_LT());
			this.setstrTaxIN_COMPANYCD(struct.getstrTaxIN_COMPANYCD());
			this.setstrTaxIN_CUSTCD(struct.getstrTaxIN_CUSTCD());
			this.setg_CUST_ITEM_CD(struct.getg_CUST_ITEM_CD());
			this.setstrT_ODR_TAX(struct.getstrT_ODR_TAX());
			this.setg_SLIP_CD(struct.getg_SLIP_CD());
			this.setgetTship_SHIP_SEQ_NO(struct.getgetTship_SHIP_SEQ_NO());
			this.setchkLOT_NO(struct.getchkLOT_NO());
			this.setchkITEM_CD(struct.getchkITEM_CD());
			this.setgetQtySTOCK_ON_HAND_QTY(struct.getgetQtySTOCK_ON_HAND_QTY());
			this.setgetQtyALCD_QTY(struct.getgetQtyALCD_QTY());
			this.setgetQtyITEM_CD(struct.getgetQtyITEM_CD());
			this.setgetQtyWH_CD(struct.getgetQtyWH_CD());
			this.setgetQtyLOT_NO(struct.getgetQtyLOT_NO());
			this.setreadTlotStock_LOT_NO(struct.getreadTlotStock_LOT_NO());
			this.setreadTlotStock_STOCK_ON_HAND_QTY(struct.getreadTlotStock_STOCK_ON_HAND_QTY());
			this.setreadTlotStock_ALCD_QTY(struct.getreadTlotStock_ALCD_QTY());
			this.setreadTlotStock_IN_ITEM_CD(struct.getreadTlotStock_IN_ITEM_CD());
			this.setreadTlotStock_IN_WH_CD(struct.getreadTlotStock_IN_WH_CD());
			this.setreadTlotStock_IN_LOT_NO(struct.getreadTlotStock_IN_LOT_NO());
			this.setupTlotStockSTOCK_ON_HAND_QTY(struct.getupTlotStockSTOCK_ON_HAND_QTY());
			this.setupTlotStockIN_ITEM_CD(struct.getupTlotStockIN_ITEM_CD());
			this.setupTlotStockIN_WH_CD(struct.getupTlotStockIN_WH_CD());
			this.setupTlotStockIN_LOT_NO(struct.getupTlotStockIN_LOT_NO());
			this.setserLotSTOCK_ON_HAND_QTY(struct.getserLotSTOCK_ON_HAND_QTY());
			this.setserLotALCD_QTY(struct.getserLotALCD_QTY());
			this.setserLotIN_ITEM_CD(struct.getserLotIN_ITEM_CD());
			this.setserLotIN_WH_CD(struct.getserLotIN_WH_CD());
			this.setserLotIN_LOT_NO(struct.getserLotIN_LOT_NO());
			this.setinsertLotStock_ITEM_CD(struct.getinsertLotStock_ITEM_CD());
			this.setinsertLotStock_WH_CD(struct.getinsertLotStock_WH_CD());
			this.setinsertLotStock_LOT_CD(struct.getinsertLotStock_LOT_CD());
			this.setinsertLotStock_PLANT_CD(struct.getinsertLotStock_PLANT_CD());
			this.setinsertLotStock_STOCK_ON_HAND_QTY(struct.getinsertLotStock_STOCK_ON_HAND_QTY());
			this.setinsertLotStock_DEFECT_QTY(struct.getinsertLotStock_DEFECT_QTY());
			this.setinsertLotStock_ALCD_QTY(struct.getinsertLotStock_ALCD_QTY());
			this.setinsTshipInst_SHIP_SEQ_NO(struct.getinsTshipInst_SHIP_SEQ_NO());
			this.setinsTshipInst_SHIP_ODR_NO(struct.getinsTshipInst_SHIP_ODR_NO());
			this.setinsTshipInst_LOT_NO(struct.getinsTshipInst_LOT_NO());
			this.setinsTshipInst_ITEM_CD(struct.getinsTshipInst_ITEM_CD());
			this.setinsTshipInst_WH_CD(struct.getinsTshipInst_WH_CD());
			this.setinsTshipInst_ODR_NO(struct.getinsTshipInst_ODR_NO());
			this.setinsTshipInst_SLIP_CD(struct.getinsTshipInst_SLIP_CD());
			this.setinsTshipInst_SHIP_QTY(struct.getinsTshipInst_SHIP_QTY());
			this.setinsTshipInst_SHIP_DATE(struct.getinsTshipInst_SHIP_DATE());
			this.setdelTshipInstIN_SHIP_SEQ_NO(struct.getdelTshipInstIN_SHIP_SEQ_NO());
			this.setdelTshipInstIN_LOT_NO(struct.getdelTshipInstIN_LOT_NO());
			this.settlotTrace_FROM_ITEM_CD(struct.gettlotTrace_FROM_ITEM_CD());
			this.settlotTrace_FROM_LOT_NO(struct.gettlotTrace_FROM_LOT_NO());
			this.settlotTrace_TO_ITEM_CD(struct.gettlotTrace_TO_ITEM_CD());
			this.settlotTrace_TO_LOT_NO(struct.gettlotTrace_TO_LOT_NO());
			this.settlotTrace_LOT_TRACE_TYP(struct.gettlotTrace_LOT_TRACE_TYP());
			this.settlotTrace_CUST_ODR_NO(struct.gettlotTrace_CUST_ODR_NO());
			this.settlotTrace_SLIP_CD(struct.gettlotTrace_SLIP_CD());
			this.settlotTrace_ODR_NO(struct.gettlotTrace_ODR_NO());
			this.setreadTshipInst_LOT_NO(struct.getreadTshipInst_LOT_NO());
			this.setreadTshipInst_SHIP_QTY(struct.getreadTshipInst_SHIP_QTY());
			this.setreadTshipInst_SHIP_ODR_NO(struct.getreadTshipInst_SHIP_ODR_NO());
			this.setreadTshipInst_ITEM_CD(struct.getreadTshipInst_ITEM_CD());
			this.setreadTshipInst_WH_CD(struct.getreadTshipInst_WH_CD());
			this.setreadTshipInst_ODR_NO(struct.getreadTshipInst_ODR_NO());
			this.setreadTshipInst_SLIP_CD(struct.getreadTshipInst_SLIP_CD());
			this.setreadTshipInst_SHIP_DATE(struct.getreadTshipInst_SHIP_DATE());
			this.setreadTshipInst_IN_SHIP_SEQ_NO(struct.getreadTshipInst_IN_SHIP_SEQ_NO());
			this.setreadTshipInst_IN_LOT_NO(struct.getreadTshipInst_IN_LOT_NO());
			this.setreadT_Ship_Inst_Lot_NO(struct.getreadT_Ship_Inst_Lot_NO());
			this.setreadT_Ship_Inst_Ship_Seq_NO(struct.getreadT_Ship_Inst_Ship_Seq_NO());
			this.setstrOdrCurrncyCd(struct.getstrOdrCurrncyCd());
			this.setstrExchTyp(struct.getstrExchTyp());
			this.setg_DATE(struct.getg_DATE());
			this.setselTShipOdr_MODIFY_COUNT(struct.getselTShipOdr_MODIFY_COUNT());
			this.setSEL_MODIFY_COUNT(struct.getSEL_MODIFY_COUNT());
		}
	}

	/**
	 * f[^ÌZbg(XgoÌÝ)
	 *
	 * @param struct Zbg·é³ÌStruct
	 */
	public void setStructL(KU0030010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_k_MODE(struct.getList_k_MODE());
			this.setList_h_RESULT(struct.getList_h_RESULT());
			this.setList_r_SEL_PTN(struct.getList_r_SEL_PTN());
			this.setList_g_DESINATED_SHIP_DATE(struct.getList_g_DESINATED_SHIP_DATE());
			this.setList_g_SHIP_QTY(struct.getList_g_SHIP_QTY());
			this.setList_g_SHIP_QTY2(struct.getList_g_SHIP_QTY2());
			this.setList_g_UNIT_PRICE(struct.getList_g_UNIT_PRICE());
			this.setList_g_CURRNCY(struct.getList_g_CURRNCY());
			this.setList_g_SHIP_ODR_AMOUNT(struct.getList_g_SHIP_ODR_AMOUNT());
			this.setList_g_WH_CD(struct.getList_g_WH_CD());
			this.setList_g_REMARKS(struct.getList_g_REMARKS());
			this.setList_g_CUST_ANAME(struct.getList_g_CUST_ANAME());
			this.setList_g_ITEM_CD(struct.getList_g_ITEM_CD());
			this.setList_h_AP_SECRTY_TYP(struct.getList_h_AP_SECRTY_TYP());
			this.setList_h_SHIP_QTY(struct.getList_h_SHIP_QTY());
			this.setList_h_ITEM_CD(struct.getList_h_ITEM_CD());
			this.setList_h_GYOMU_DATE(struct.getList_h_GYOMU_DATE());
			this.setList_h_EXCH_TYP(struct.getList_h_EXCH_TYP());
			this.setList_h_MODFIY_CNT(struct.getList_h_MODFIY_CNT());
			this.setList_h_TOTAL_SHIP_QTY(struct.getList_h_TOTAL_SHIP_QTY());
			this.setList_m_selRadio(struct.getList_m_selRadio());
			this.setList_r_SEL_PTN1(struct.getList_r_SEL_PTN1());
			this.setList_r_SEL_PTN2(struct.getList_r_SEL_PTN2());
			this.setList_r_SEL_PTN3(struct.getList_r_SEL_PTN3());
			this.setList_h_SELECT_FG(struct.getList_h_SELECT_FG());
			this.setList_h_UNIT_PRICE(struct.getList_h_UNIT_PRICE());
			this.setList_g_STOCK_UNIT(struct.getList_g_STOCK_UNIT());
			this.setList_g_STOCK_UNIT2(struct.getList_g_STOCK_UNIT2());
			this.setList_g_CUR_UNIT2(struct.getList_g_CUR_UNIT2());
			this.setList_g_WH_NAME(struct.getList_g_WH_NAME());
			this.setList_g_SALES_DEPT_CD(struct.getList_g_SALES_DEPT_CD());
			this.setList_g_ORG_NAME(struct.getList_g_ORG_NAME());
			this.setList_g_CUST_CD(struct.getList_g_CUST_CD());
			this.setList_g_CUST_ITEM_NAME(struct.getList_g_CUST_ITEM_NAME());
			this.setList_g_ITEM_NAME(struct.getList_g_ITEM_NAME());
			this.setList_g_CUST_ODR_NO(struct.getList_g_CUST_ODR_NO());
			this.setList_g_ODR_NO(struct.getList_g_ODR_NO());
			this.setList_g_PART_DLV_SEQ_NO(struct.getList_g_PART_DLV_SEQ_NO());
			this.setList_g_SHIP_ODR_NO(struct.getList_g_SHIP_ODR_NO());
			this.setList_h_DATE(struct.getList_h_DATE());
			this.setList_g_JOB_ODR_CD(struct.getList_g_JOB_ODR_CD());
			this.setList_c_JOB_ODR_CD(struct.getList_c_JOB_ODR_CD());
			this.setList_g_DIRECT_DLV_FLG(struct.getList_g_DIRECT_DLV_FLG());
			this.setList_g_STOCK_LOT_CD(struct.getList_g_STOCK_LOT_CD());
			this.setList_h_STOCK_LOT_CD(struct.getList_h_STOCK_LOT_CD());
			this.setList_param1(struct.getList_param1());
			this.setList_param2(struct.getList_param2());
			this.setList_param3(struct.getList_param3());
			this.setList_ROUND_TYP(struct.getList_ROUND_TYP());
			this.setList_UNIT_QTY_TYP(struct.getList_UNIT_QTY_TYP());
			this.setList_UNIT_FIG(struct.getList_UNIT_FIG());
			this.setList_strCOMPANY_CD(struct.getList_strCOMPANY_CD());
			this.setList_strUSER_NAME(struct.getList_strUSER_NAME());
			this.setList_strPLANT_CD(struct.getList_strPLANT_CD());
			this.setList_strSECTION_CD(struct.getList_strSECTION_CD());
			this.setList_strORG_CD(struct.getList_strORG_CD());
			this.setList_strORG_NAME(struct.getList_strORG_NAME());
			this.setList_strORG_ANAME(struct.getList_strORG_ANAME());
			this.setList_strPLANT_NAME(struct.getList_strPLANT_NAME());
			this.setList_strPLANT_ANAME(struct.getList_strPLANT_ANAME());
			this.setList_strCAL_NO(struct.getList_strCAL_NO());
			this.setList_strUSER_CD(struct.getList_strUSER_CD());
			this.setList_strBUSINESS_OPR_DATE(struct.getList_strBUSINESS_OPR_DATE());
			this.setList_serTori_SHIP_SEQ_NO(struct.getList_serTori_SHIP_SEQ_NO());
			this.setList_serTori_SHIP_ODR_NO(struct.getList_serTori_SHIP_ODR_NO());
			this.setList_serTori_SLIP_CD(struct.getList_serTori_SLIP_CD());
			this.setList_serTori_ODR_NO(struct.getList_serTori_ODR_NO());
			this.setList_serTori_PART_DLV_SEQ_NO(struct.getList_serTori_PART_DLV_SEQ_NO());
			this.setList_serTori_ORGNAL_SLIP_CD(struct.getList_serTori_ORGNAL_SLIP_CD());
			this.setList_serTori_SLIP_TRN_CD(struct.getList_serTori_SLIP_TRN_CD());
			this.setList_serTori_ITEM_CD(struct.getList_serTori_ITEM_CD());
			this.setList_serTori_JOB_ODR_CD(struct.getList_serTori_JOB_ODR_CD());
			this.setList_serTori_CUST_ITEM_CD(struct.getList_serTori_CUST_ITEM_CD());
			this.setList_serTori_CUST_ODR_NO(struct.getList_serTori_CUST_ODR_NO());
			this.setList_serTori_CUST_CD(struct.getList_serTori_CUST_CD());
			this.setList_serTori_CUST_NAME(struct.getList_serTori_CUST_NAME());
			this.setList_serTori_CUST_CHRG_PSN_CD(struct.getList_serTori_CUST_CHRG_PSN_CD());
			this.setList_serTori_SHIP_ODR_ISS_PSN_CD(struct.getList_serTori_SHIP_ODR_ISS_PSN_CD());
			this.setList_serTori_DLV_LOC_CD(struct.getList_serTori_DLV_LOC_CD());
			this.setList_serTori_DEPO_TYP(struct.getList_serTori_DEPO_TYP());
			this.setList_serTori_ALLCT_WH_CD(struct.getList_serTori_ALLCT_WH_CD());
			this.setList_serTori_DEPO_WH_CD(struct.getList_serTori_DEPO_WH_CD());
			this.setList_serTori_LOC_CD(struct.getList_serTori_LOC_CD());
			this.setList_serTori_SHIP_DATE(struct.getList_serTori_SHIP_DATE());
			this.setList_serTori_SHIP_QTY(struct.getList_serTori_SHIP_QTY());
			this.setList_serTori_UNIT_CD(struct.getList_serTori_UNIT_CD());
			this.setList_serTori_SHIP_UNIT_PRICE(struct.getList_serTori_SHIP_UNIT_PRICE());
			this.setList_serTori_SHIP_ODR_AMOUNT(struct.getList_serTori_SHIP_ODR_AMOUNT());
			this.setList_serTori_SHIP_ODR_AMOUNT_EXCH_RATES(struct.getList_serTori_SHIP_ODR_AMOUNT_EXCH_RATES());
			this.setList_serTori_CURRNCY_CD(struct.getList_serTori_CURRNCY_CD());
			this.setList_serTori_DIRECT_DLV_FLG(struct.getList_serTori_DIRECT_DLV_FLG());
			this.setList_serTori_SHIP_INFO_IF_CTRL_NO(struct.getList_serTori_SHIP_INFO_IF_CTRL_NO());
			this.setList_serTori_INSPC_ACPT_INFO_IF_CTRL_NO(struct.getList_serTori_INSPC_ACPT_INFO_IF_CTRL_NO());
			this.setList_serTori_DLV_KEY_NO(struct.getList_serTori_DLV_KEY_NO());
			this.setList_serTori_DEL_FLG(struct.getList_serTori_DEL_FLG());
			this.setList_serTori_CUR_NAME(struct.getList_serTori_CUR_NAME());
			this.setList_serTori_EXCH_TYP(struct.getList_serTori_EXCH_TYP());
			this.setList_serTori_MODIFY_COUNT(struct.getList_serTori_MODIFY_COUNT());
			this.setList_serTori_RETURN_QTY(struct.getList_serTori_RETURN_QTY());
			this.setList_serTori_TOTAL_SHIP_QTY(struct.getList_serTori_TOTAL_SHIP_QTY());
			this.setList_serTori_STATUS(struct.getList_serTori_STATUS());
			this.setList_serTori_INSPC_ACPT_TYP(struct.getList_serTori_INSPC_ACPT_TYP());
			this.setList_serToriSALES_DEPT_CD(struct.getList_serToriSALES_DEPT_CD());
			this.setList_serToriSALES_DATE(struct.getList_serToriSALES_DATE());
			this.setList_h_MRP_ODR_TYP(struct.getList_h_MRP_ODR_TYP());
			this.setList_h_LOT_CTRL_FLG(struct.getList_h_LOT_CTRL_FLG());
			this.setList_serTodrMODIFY_COUNT(struct.getList_serTodrMODIFY_COUNT());
			this.setList_serTori_IN_SLIPCD(struct.getList_serTori_IN_SLIPCD());
			this.setList_creTship_SHIP_SEQ_NO(struct.getList_creTship_SHIP_SEQ_NO());
			this.setList_creTship_SHIP_ODR_NO(struct.getList_creTship_SHIP_ODR_NO());
			this.setList_creTship_SLIP_CD(struct.getList_creTship_SLIP_CD());
			this.setList_creTship_ODR_NO(struct.getList_creTship_ODR_NO());
			this.setList_creTship_PART_DLV_SEQ_NO(struct.getList_creTship_PART_DLV_SEQ_NO());
			this.setList_creTship_ORGNAL_SLIP_CD(struct.getList_creTship_ORGNAL_SLIP_CD());
			this.setList_creTship_SLIP_TRN_CD(struct.getList_creTship_SLIP_TRN_CD());
			this.setList_creTship_ITEM_CD(struct.getList_creTship_ITEM_CD());
			this.setList_creTship_JOB_ODR_CD(struct.getList_creTship_JOB_ODR_CD());
			this.setList_creTship_CUST_ITEM_CD(struct.getList_creTship_CUST_ITEM_CD());
			this.setList_creTship_CUST_ODR_NO(struct.getList_creTship_CUST_ODR_NO());
			this.setList_creTship_CUST_CD(struct.getList_creTship_CUST_CD());
			this.setList_creTship_CUST_NAME(struct.getList_creTship_CUST_NAME());
			this.setList_creTship_CUST_CHRG_PSN_CD(struct.getList_creTship_CUST_CHRG_PSN_CD());
			this.setList_creTship_SHIP_ODR_ISS_PSN_CD(struct.getList_creTship_SHIP_ODR_ISS_PSN_CD());
			this.setList_creTship_DLV_LOC_CD(struct.getList_creTship_DLV_LOC_CD());
			this.setList_creTship_DEPO_TYP(struct.getList_creTship_DEPO_TYP());
			this.setList_creTship_ALLCT_WH_CD(struct.getList_creTship_ALLCT_WH_CD());
			this.setList_creTship_DEPO_WH_CD(struct.getList_creTship_DEPO_WH_CD());
			this.setList_creTship_LOC_CD(struct.getList_creTship_LOC_CD());
			this.setList_creTship_SHIP_DATE(struct.getList_creTship_SHIP_DATE());
			this.setList_creTship_SHIP_QTY(struct.getList_creTship_SHIP_QTY());
			this.setList_creTship_UNIT_CD(struct.getList_creTship_UNIT_CD());
			this.setList_creTship_SHIP_UNIT_PRICE(struct.getList_creTship_SHIP_UNIT_PRICE());
			this.setList_creTship_SHIP_ODR_AMOUNT(struct.getList_creTship_SHIP_ODR_AMOUNT());
			this.setList_creTship_SHIP_ODR_AMOUNT_EXCH_RATES(struct.getList_creTship_SHIP_ODR_AMOUNT_EXCH_RATES());
			this.setList_creTship_CURRNCY_CD(struct.getList_creTship_CURRNCY_CD());
			this.setList_creTship_DIRECT_DLV_FLG(struct.getList_creTship_DIRECT_DLV_FLG());
			this.setList_creTship_DLV_KEY_NO(struct.getList_creTship_DLV_KEY_NO());
			this.setList_creTship_REMARKS(struct.getList_creTship_REMARKS());
			this.setList_creTship_DEL_FLG(struct.getList_creTship_DEL_FLG());
			this.setList_updTship_SHIP_SEQ_NO(struct.getList_updTship_SHIP_SEQ_NO());
			this.setList_serInsert_SHIP_ODR_NO(struct.getList_serInsert_SHIP_ODR_NO());
			this.setList_serInsert_ODR_NO(struct.getList_serInsert_ODR_NO());
			this.setList_serInsert_PART_DLV_SEQ_NO(struct.getList_serInsert_PART_DLV_SEQ_NO());
			this.setList_serInsert_SLIP_CD(struct.getList_serInsert_SLIP_CD());
			this.setList_serInsert_ITEM_CD(struct.getList_serInsert_ITEM_CD());
			this.setList_serInsert_JOB_ODR_CD(struct.getList_serInsert_JOB_ODR_CD());
			this.setList_serInsert_CUST_ITEM_CD(struct.getList_serInsert_CUST_ITEM_CD());
			this.setList_serInsert_CUST_ODR_NO(struct.getList_serInsert_CUST_ODR_NO());
			this.setList_serInsert_CUST_CD(struct.getList_serInsert_CUST_CD());
			this.setList_serInsert_CUST_NAME(struct.getList_serInsert_CUST_NAME());
			this.setList_serInsert_CUST_CHRG_PSN_CD(struct.getList_serInsert_CUST_CHRG_PSN_CD());
			this.setList_serInsert_SHIP_ODR_ISS_PSN_CD(struct.getList_serInsert_SHIP_ODR_ISS_PSN_CD());
			this.setList_serInsert_DLV_LOC_CD(struct.getList_serInsert_DLV_LOC_CD());
			this.setList_serInsert_DEPO_TYP(struct.getList_serInsert_DEPO_TYP());
			this.setList_serInsert_DESINATED_SHIP_DATE(struct.getList_serInsert_DESINATED_SHIP_DATE());
			this.setList_serInsert_SHIP_QTY(struct.getList_serInsert_SHIP_QTY());
			this.setList_serInsert_TOTAL_SHIP_QTY(struct.getList_serInsert_TOTAL_SHIP_QTY());
			this.setList_serInsert_UNIT_CD(struct.getList_serInsert_UNIT_CD());
			this.setList_serInsert_UNIT_PRICE(struct.getList_serInsert_UNIT_PRICE());
			this.setList_serInsert_SHIP_ODR_AMOUNT(struct.getList_serInsert_SHIP_ODR_AMOUNT());
			this.setList_serInsert_SHIP_ODR_AMOUNT_EXCH_RATES(struct.getList_serInsert_SHIP_ODR_AMOUNT_EXCH_RATES());
			this.setList_serInsert_CURRNCY_CD(struct.getList_serInsert_CURRNCY_CD());
			this.setList_serInsert_LOC_CD(struct.getList_serInsert_LOC_CD());
			this.setList_serInsert_PKG_UNIT_QTY(struct.getList_serInsert_PKG_UNIT_QTY());
			this.setList_serInsert_REMARKS(struct.getList_serInsert_REMARKS());
			this.setList_serInsert_TRANSPORT_CD(struct.getList_serInsert_TRANSPORT_CD());
			this.setList_serInsert_TRANSPORT_TYP(struct.getList_serInsert_TRANSPORT_TYP());
			this.setList_serInsert_ALLCT_WH_CD(struct.getList_serInsert_ALLCT_WH_CD());
			this.setList_serInsert_TRANSFER_WH_CD(struct.getList_serInsert_TRANSFER_WH_CD());
			this.setList_serInsert_DIRECT_DLV_FLG(struct.getList_serInsert_DIRECT_DLV_FLG());
			this.setList_serInsert_ENTRY_TYP(struct.getList_serInsert_ENTRY_TYP());
			this.setList_serInsert_PRINT_FLG(struct.getList_serInsert_PRINT_FLG());
			this.setList_serInsert_SHP_CMPLT_FLG(struct.getList_serInsert_SHP_CMPLT_FLG());
			this.setList_serInsert_DEPO_TRANSFER_PROC_FLG(struct.getList_serInsert_DEPO_TRANSFER_PROC_FLG());
			this.setList_serInsert_DEL_FLG(struct.getList_serInsert_DEL_FLG());
			this.setList_serInsert_CUR_CD(struct.getList_serInsert_CUR_CD());
			this.setList_serInsert_CUR_NAME(struct.getList_serInsert_CUR_NAME());
			this.setList_serInsert_EXCH_TYP(struct.getList_serInsert_EXCH_TYP());
			this.setList_serInsert_SPCL_PRICE_TYP(struct.getList_serInsert_SPCL_PRICE_TYP());
			this.setList_serInsert_MODIFY_COUNT(struct.getList_serInsert_MODIFY_COUNT());
			this.setList_serInsert_SCDL_DLV_DATE(struct.getList_serInsert_SCDL_DLV_DATE());
			this.setList_serInsert_DLV_KEY_NO(struct.getList_serInsert_DLV_KEY_NO());
			this.setList_h_RETURN_QTY(struct.getList_h_RETURN_QTY());
			this.setList_serInsert_ODR_ACPT_DATE(struct.getList_serInsert_ODR_ACPT_DATE());
			this.setList_h_JOB_ODR_CD(struct.getList_h_JOB_ODR_CD());
			this.setList_selMODIFY_COUNT(struct.getList_selMODIFY_COUNT());
			this.setList_serInsert_IN_SLIPCD(struct.getList_serInsert_IN_SLIPCD());
			this.setList_upTshipOdr_DEPO_TRANSFER_PROC_FLG(struct.getList_upTshipOdr_DEPO_TRANSFER_PROC_FLG());
			this.setList_upTshipOdr_IN_SLIPCD(struct.getList_upTshipOdr_IN_SLIPCD());
			this.setList_chkisWhCd_WH_CD(struct.getList_chkisWhCd_WH_CD());
			this.setList_chkisWhCd_WH_TYP(struct.getList_chkisWhCd_WH_TYP());
			this.setList_chkisinWhCd_WH_NAME(struct.getList_chkisinWhCd_WH_NAME());
			this.setList_chkisWhCd_IN_WHCD(struct.getList_chkisWhCd_IN_WHCD());
			this.setList_chkisWhCd_IN_WHTYP(struct.getList_chkisWhCd_IN_WHTYP());
			this.setList_creTsales_SHIP_ODR_NO(struct.getList_creTsales_SHIP_ODR_NO());
			this.setList_creTsales_SLIP_CD(struct.getList_creTsales_SLIP_CD());
			this.setList_creTsales_SALES_TYP(struct.getList_creTsales_SALES_TYP());
			this.setList_creTsales_CUST_CD(struct.getList_creTsales_CUST_CD());
			this.setList_creTsales_ITEM_CD(struct.getList_creTsales_ITEM_CD());
			this.setList_creTsales_ITEM_NAME(struct.getList_creTsales_ITEM_NAME());
			this.setList_creTsales_CUST_ODR_NO(struct.getList_creTsales_CUST_ODR_NO());
			this.setList_creTsales_SALES_DATE(struct.getList_creTsales_SALES_DATE());
			this.setList_creTsales_SALES_DEPT_CD(struct.getList_creTsales_SALES_DEPT_CD());
			this.setList_creTsales_CUST_CHRG_PSN_CD(struct.getList_creTsales_CUST_CHRG_PSN_CD());
			this.setList_creTsales_ODR_ACPT_PSN_CD(struct.getList_creTsales_ODR_ACPT_PSN_CD());
			this.setList_creTsales_SALES_QTY(struct.getList_creTsales_SALES_QTY());
			this.setList_creTsales_SALES_UNIT_PRICE(struct.getList_creTsales_SALES_UNIT_PRICE());
			this.setList_creTsales_UNIT_CD(struct.getList_creTsales_UNIT_CD());
			this.setList_creTsales_SALES_AMOUNT(struct.getList_creTsales_SALES_AMOUNT());
			this.setList_creTsales_SALES_AMOUNT_EXCH_RATES(struct.getList_creTsales_SALES_AMOUNT_EXCH_RATES());
			this.setList_creTsales_INSPC_ACPT_DATE(struct.getList_creTsales_INSPC_ACPT_DATE());
			this.setList_creTsales_INSPC_ACPT_QTY(struct.getList_creTsales_INSPC_ACPT_QTY());
			this.setList_creTsales_EXTERNAL_TAX_SALES_AMOUNT(struct.getList_creTsales_EXTERNAL_TAX_SALES_AMOUNT());
			this.setList_creTsales_INTERNAL_TAX_SALES_AMOUNT(struct.getList_creTsales_INTERNAL_TAX_SALES_AMOUNT());
			this.setList_creTsales_TAXFREE_SALES_AMOUNT(struct.getList_creTsales_TAXFREE_SALES_AMOUNT());
			this.setList_creTsales_TAX_CREDIT_SALES_AMOUNT(struct.getList_creTsales_TAX_CREDIT_SALES_AMOUNT());
			this.setList_creTsales_EXTERNAL_TAX_AMOUNT(struct.getList_creTsales_EXTERNAL_TAX_AMOUNT());
			this.setList_creTsales_INTERNAL_TAX_AMOUNT(struct.getList_creTsales_INTERNAL_TAX_AMOUNT());
			this.setList_creTsales_TAX_AMOUNT_1(struct.getList_creTsales_TAX_AMOUNT_1());
			this.setList_creTsales_TAX_AMOUNT_2(struct.getList_creTsales_TAX_AMOUNT_2());
			this.setList_creTsales_TAX_AMOUNT_3(struct.getList_creTsales_TAX_AMOUNT_3());
			this.setList_creTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT(struct.getList_creTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT());
			this.setList_creTsales_ORG_SLIP_CD(struct.getList_creTsales_ORG_SLIP_CD());
			this.setList_creTsales_CURRNCY_CD(struct.getList_creTsales_CURRNCY_CD());
			this.setList_creTsales_SPCL_PRICE_CO(struct.getList_creTsales_SPCL_PRICE_CO());
			this.setList_creTsales_REMARKS(struct.getList_creTsales_REMARKS());
			this.setList_creTsales_DEL_FLG(struct.getList_creTsales_DEL_FLG());
			this.setList_creTsales_INSPC_ACPT_TYP(struct.getList_creTsales_INSPC_ACPT_TYP());
			this.setList_creTsales_STATUS(struct.getList_creTsales_STATUS());
			this.setList_creTsales_APPR_FLG(struct.getList_creTsales_APPR_FLG());
			this.setList_creTsales_APPR_ID(struct.getList_creTsales_APPR_ID());
			this.setList_creTsales_APPR_DATE(struct.getList_creTsales_APPR_DATE());
			this.setList_creTsales_EXCH_RATE(struct.getList_creTsales_EXCH_RATE());
			this.setList_serTsales_SALES_SEQ_NO(struct.getList_serTsales_SALES_SEQ_NO());
			this.setList_serTsales_SLIP_CD(struct.getList_serTsales_SLIP_CD());
			this.setList_serTsales_SALES_TYP(struct.getList_serTsales_SALES_TYP());
			this.setList_serTsales_CUST_CD(struct.getList_serTsales_CUST_CD());
			this.setList_serTsales_ITEM_CD(struct.getList_serTsales_ITEM_CD());
			this.setList_serTsales_ITEM_NAME(struct.getList_serTsales_ITEM_NAME());
			this.setList_serTsales_CUST_ODR_NO(struct.getList_serTsales_CUST_ODR_NO());
			this.setList_serTsales_SALES_DATE(struct.getList_serTsales_SALES_DATE());
			this.setList_serTsales_SALES_DEPT_CD(struct.getList_serTsales_SALES_DEPT_CD());
			this.setList_serTsales_CUST_CHRG_PSN_CD(struct.getList_serTsales_CUST_CHRG_PSN_CD());
			this.setList_serTsales_ODR_ACPT_PSN_CD(struct.getList_serTsales_ODR_ACPT_PSN_CD());
			this.setList_serTsales_SALES_QTY(struct.getList_serTsales_SALES_QTY());
			this.setList_serTsales_SALES_UNIT_PRICE(struct.getList_serTsales_SALES_UNIT_PRICE());
			this.setList_serTsales_UNIT_CD(struct.getList_serTsales_UNIT_CD());
			this.setList_serTsales_SALES_AMOUNT(struct.getList_serTsales_SALES_AMOUNT());
			this.setList_serTsales_SALES_AMOUNT_EXCH_RATES(struct.getList_serTsales_SALES_AMOUNT_EXCH_RATES());
			this.setList_serTsales_EXTERNAL_TAX_SALES_AMOUNT(struct.getList_serTsales_EXTERNAL_TAX_SALES_AMOUNT());
			this.setList_serTsales_INTERNAL_TAX_SALES_AMOUNT(struct.getList_serTsales_INTERNAL_TAX_SALES_AMOUNT());
			this.setList_serTsales_TAXFREE_SALES_AMOUNT(struct.getList_serTsales_TAXFREE_SALES_AMOUNT());
			this.setList_serTsales_TAX_CREDIT_SALES_AMOUNT(struct.getList_serTsales_TAX_CREDIT_SALES_AMOUNT());
			this.setList_serTsales_EXTERNAL_TAX_AMOUNT(struct.getList_serTsales_EXTERNAL_TAX_AMOUNT());
			this.setList_serTsales_INTERNAL_TAX_AMOUNT(struct.getList_serTsales_INTERNAL_TAX_AMOUNT());
			this.setList_serTsales_TAX_AMOUNT_1(struct.getList_serTsales_TAX_AMOUNT_1());
			this.setList_serTsales_TAX_AMOUNT_2(struct.getList_serTsales_TAX_AMOUNT_2());
			this.setList_serTsales_TAX_AMOUNT_3(struct.getList_serTsales_TAX_AMOUNT_3());
			this.setList_serTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT(struct.getList_serTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT());
			this.setList_serTsales_ORG_SLIP_CD(struct.getList_serTsales_ORG_SLIP_CD());
			this.setList_serTsales_CURRNCY_CD(struct.getList_serTsales_CURRNCY_CD());
			this.setList_serTsales_SPCL_PRICE_CO(struct.getList_serTsales_SPCL_PRICE_CO());
			this.setList_serTsales_REMARKS(struct.getList_serTsales_REMARKS());
			this.setList_serTsales_DEL_FLG(struct.getList_serTsales_DEL_FLG());
			this.setList_serTsales_INSPC_ACPT_TYP(struct.getList_serTsales_INSPC_ACPT_TYP());
			this.setList_serTsales_STATUS(struct.getList_serTsales_STATUS());
			this.setList_serTsales_PRD_ODR_PLACE_CD(struct.getList_serTsales_PRD_ODR_PLACE_CD());
			this.setList_serTsales_EXCH_RATE(struct.getList_serTsales_EXCH_RATE());
			this.setList_serTsales_IN_SLIPCD(struct.getList_serTsales_IN_SLIPCD());
			this.setList_updTsales_APPR_FLG(struct.getList_updTsales_APPR_FLG());
			this.setList_updTsales_APPR_ID(struct.getList_updTsales_APPR_ID());
			this.setList_updTsales_APPR_DATE(struct.getList_updTsales_APPR_DATE());
			this.setList_updTsales_SALES_SEQ_NO(struct.getList_updTsales_SALES_SEQ_NO());
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
			this.setList_mItemSpec_CUST_CD(struct.getList_mItemSpec_CUST_CD());
			this.setList_mItemSpec_CUST_ITEM_CD(struct.getList_mItemSpec_CUST_ITEM_CD());
			this.setList_mItemSpec_COMPANY_CD(struct.getList_mItemSpec_COMPANY_CD());
			this.setList_mItemSpec_SALES_DEPT_CD(struct.getList_mItemSpec_SALES_DEPT_CD());
			this.setList_mItemSpec_CUST_ITEM_NAME(struct.getList_mItemSpec_CUST_ITEM_NAME());
			this.setList_mItemSpec_IN_CUST_CD(struct.getList_mItemSpec_IN_CUST_CD());
			this.setList_mItemSpec_IN_CUST_ITEM_CD(struct.getList_mItemSpec_IN_CUST_ITEM_CD());
			this.setList_mItemSpec_IN_COMPANY_CD(struct.getList_mItemSpec_IN_COMPANY_CD());
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
			this.setList_tOdr_DLV_KEY_NO(struct.getList_tOdr_DLV_KEY_NO());
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
			this.setList_tOdr_DEL_FLG(struct.getList_tOdr_DEL_FLG());
			this.setList_tOdr_SHIP_CNT(struct.getList_tOdr_SHIP_CNT());
			this.setList_tOdr_UNIT_CD_ORG(struct.getList_tOdr_UNIT_CD_ORG());
			this.setList_tOdrCtl_CUST_ITEM_CD(struct.getList_tOdrCtl_CUST_ITEM_CD());
			this.setList_tOdr_COCK_TYP(struct.getList_tOdr_COCK_TYP());
			this.setList_tOdr_PUCH_ODR_QTY_TOTAL(struct.getList_tOdr_PUCH_ODR_QTY_TOTAL());
			this.setList_tOdr_BUYER_ORG_CD(struct.getList_tOdr_BUYER_ORG_CD());
			this.setList_tOdr_BUYER_NAME(struct.getList_tOdr_BUYER_NAME());
			this.setList_tOdr_IN_ODRNO(struct.getList_tOdr_IN_ODRNO());
			this.setList_creTodrODR_NO(struct.getList_creTodrODR_NO());
			this.setList_creTodrODR_TYP(struct.getList_creTodrODR_TYP());
			this.setList_creTodrODR_CTL_NO(struct.getList_creTodrODR_CTL_NO());
			this.setList_creTodrCUST_ODR_NO(struct.getList_creTodrCUST_ODR_NO());
			this.setList_creTodrCUST_CHRG_ORG_CD(struct.getList_creTodrCUST_CHRG_ORG_CD());
			this.setList_creTodrCUST_CHRG_PSN_CD(struct.getList_creTodrCUST_CHRG_PSN_CD());
			this.setList_creTodrODR_ACPT_ORG_CD(struct.getList_creTodrODR_ACPT_ORG_CD());
			this.setList_creTodrODR_ACPT_PSN_CD(struct.getList_creTodrODR_ACPT_PSN_CD());
			this.setList_creTodrCURRNCY_CD(struct.getList_creTodrCURRNCY_CD());
			this.setList_creTodrEXCH_TYP(struct.getList_creTodrEXCH_TYP());
			this.setList_creTodrDLV_LOC_CD(struct.getList_creTodrDLV_LOC_CD());
			this.setList_creTodrDLV_LOC_NAME(struct.getList_creTodrDLV_LOC_NAME());
			this.setList_creTodrDLV_LOC_NAME_KANJI(struct.getList_creTodrDLV_LOC_NAME_KANJI());
			this.setList_creTodrPRD_ODR_PLACE_CD(struct.getList_creTodrPRD_ODR_PLACE_CD());
			this.setList_creTodrODR_UNIT_PRICE(struct.getList_creTodrODR_UNIT_PRICE());
			this.setList_creTodrPART_DLV_COUNT(struct.getList_creTodrPART_DLV_COUNT());
			this.setList_creTodrDEPO_TYP(struct.getList_creTodrDEPO_TYP());
			this.setList_creTodrDESINATED_DLV_DATE(struct.getList_creTodrDESINATED_DLV_DATE());
			this.setList_creTodrODR_QTY(struct.getList_creTodrODR_QTY());
			this.setList_creTodrREMAIN_UNCONFIRM_ODR_QTY(struct.getList_creTodrREMAIN_UNCONFIRM_ODR_QTY());
			this.setList_creTodrCANCELED_UNCONFIRM_ODR_QTY(struct.getList_creTodrCANCELED_UNCONFIRM_ODR_QTY());
			this.setList_creTodrUNIT_CD(struct.getList_creTodrUNIT_CD());
			this.setList_creTodrUNCONFIRM_ODR_BALANCE(struct.getList_creTodrUNCONFIRM_ODR_BALANCE());
			this.setList_creTodrODR_AMOUNT(struct.getList_creTodrODR_AMOUNT());
			this.setList_creTodrODR_AMOUNT_EXCH_RATES(struct.getList_creTodrODR_AMOUNT_EXCH_RATES());
			this.setList_creTodrTOTAL_SHIP_QTY(struct.getList_creTodrTOTAL_SHIP_QTY());
			this.setList_creTodrSHIP_AMOUNT(struct.getList_creTodrSHIP_AMOUNT());
			this.setList_creTodrSHIP_AMOUNT_EXCH_RATES(struct.getList_creTodrSHIP_AMOUNT_EXCH_RATES());
			this.setList_creTodrODR_CMPLT_FLG(struct.getList_creTodrODR_CMPLT_FLG());
			this.setList_creTodrODR_CMPLT_DATE(struct.getList_creTodrODR_CMPLT_DATE());
			this.setList_creTodrREMARKS(struct.getList_creTodrREMARKS());
			this.setList_creTodrODR_ACPT_DATE(struct.getList_creTodrODR_ACPT_DATE());
			this.setList_creTodrSHIP_PLAN_REMAIN_QTY(struct.getList_creTodrSHIP_PLAN_REMAIN_QTY());
			this.setList_creTodrSHIP_PLAN_CMPLT_FLG(struct.getList_creTodrSHIP_PLAN_CMPLT_FLG());
			this.setList_creTodrUNCONFIRMED_ODR_EFF_OVR_FLG(struct.getList_creTodrUNCONFIRMED_ODR_EFF_OVR_FLG());
			this.setList_creTodrPARTIAL_SHIP_INST_FLG(struct.getList_creTodrPARTIAL_SHIP_INST_FLG());
			this.setList_creTodrENTRY_TYP(struct.getList_creTodrENTRY_TYP());
			this.setList_creTodrDEL_FLG(struct.getList_creTodrDEL_FLG());
			this.setList_upTodr_TOTAL_SHIP_QTY(struct.getList_upTodr_TOTAL_SHIP_QTY());
			this.setList_upTodr_SHIP_AMOUNT(struct.getList_upTodr_SHIP_AMOUNT());
			this.setList_upTodr_SHIP_AMOUNT_EXCH_RATES(struct.getList_upTodr_SHIP_AMOUNT_EXCH_RATES());
			this.setList_upTodr_ODR_CMPLT_FLG(struct.getList_upTodr_ODR_CMPLT_FLG());
			this.setList_upTodr_ODR_CMPLT_DATE(struct.getList_upTodr_ODR_CMPLT_DATE());
			this.setList_upTodr_IN_ODRNO(struct.getList_upTodr_IN_ODRNO());
			this.setList_creTrcvIssue_RCV_ISSUE_CTRL_CD(struct.getList_creTrcvIssue_RCV_ISSUE_CTRL_CD());
			this.setList_creTrcvIssue_RCV_ISSUE_TYP(struct.getList_creTrcvIssue_RCV_ISSUE_TYP());
			this.setList_creTrcvIssue_ITEM_CD(struct.getList_creTrcvIssue_ITEM_CD());
			this.setList_creTrcvIssue_JOB_ODR_CD(struct.getList_creTrcvIssue_JOB_ODR_CD());
			this.setList_creTrcvIssue_PLANT_CD(struct.getList_creTrcvIssue_PLANT_CD());
			this.setList_creTrcvIssue_WH_CD(struct.getList_creTrcvIssue_WH_CD());
			this.setList_creTrcvIssue_RCV_ISSUE_BEFORE_QTY(struct.getList_creTrcvIssue_RCV_ISSUE_BEFORE_QTY());
			this.setList_creTrcvIssue_RCV_ISSUE_QTY(struct.getList_creTrcvIssue_RCV_ISSUE_QTY());
			this.setList_creTrcvIssue_RCV_ISSUE_AFTER_QTY(struct.getList_creTrcvIssue_RCV_ISSUE_AFTER_QTY());
			this.setList_creTrcvIssue_RCV_ISSUE_AMOUNT(struct.getList_creTrcvIssue_RCV_ISSUE_AMOUNT());
			this.setList_creTrcvIssue_RCV_ISSUE_DATE(struct.getList_creTrcvIssue_RCV_ISSUE_DATE());
			this.setList_creTrcvIssue_RCV_ISSUE_GNR_TYP(struct.getList_creTrcvIssue_RCV_ISSUE_GNR_TYP());
			this.setList_creTrcvIssue_STOCK_UPD_TYP(struct.getList_creTrcvIssue_STOCK_UPD_TYP());
			this.setList_creTrcvIssue_RCV_ISSUE_CMPLT_FLG(struct.getList_creTrcvIssue_RCV_ISSUE_CMPLT_FLG());
			this.setList_creTrcvIssue_RCV_ISSUE_COMMENT(struct.getList_creTrcvIssue_RCV_ISSUE_COMMENT());
			this.setList_creTrcvIssue_LOT_NO(struct.getList_creTrcvIssue_LOT_NO());
			this.setList_creTrcvIssue_SHIP_ODR_NO(struct.getList_creTrcvIssue_SHIP_ODR_NO());
			this.setList_upTitemStock_STOCK_ON_HAND_QTY(struct.getList_upTitemStock_STOCK_ON_HAND_QTY());
			this.setList_upTitemStock_IN_ITEMCD(struct.getList_upTitemStock_IN_ITEMCD());
			this.setList_upTitemStock_IN_WHCD(struct.getList_upTitemStock_IN_WHCD());
			this.setList_serTitemStock_ITEM_CD(struct.getList_serTitemStock_ITEM_CD());
			this.setList_serTitemStock_WH_CD(struct.getList_serTitemStock_WH_CD());
			this.setList_serTitemStock_PLANT_CD(struct.getList_serTitemStock_PLANT_CD());
			this.setList_serTitemStock_STOCK_ON_HAND_QTY(struct.getList_serTitemStock_STOCK_ON_HAND_QTY());
			this.setList_serTitemStock_DEFECT_QTY(struct.getList_serTitemStock_DEFECT_QTY());
			this.setList_serTitemStock_PRVS_DAYEND_STOCK_QTY(struct.getList_serTitemStock_PRVS_DAYEND_STOCK_QTY());
			this.setList_serTitemStock_PRVS_MONTHEND_STOCK_QTY(struct.getList_serTitemStock_PRVS_MONTHEND_STOCK_QTY());
			this.setList_serTitemStock_PRVS_TERMEND_STOCK_QTY(struct.getList_serTitemStock_PRVS_TERMEND_STOCK_QTY());
			this.setList_serTitemStock_IN_ITEMCD(struct.getList_serTitemStock_IN_ITEMCD());
			this.setList_serTitemStock_IN_WHCD(struct.getList_serTitemStock_IN_WHCD());
			this.setList_creTitemStock_WH_CD(struct.getList_creTitemStock_WH_CD());
			this.setList_creTitemStock_ITEM_CD(struct.getList_creTitemStock_ITEM_CD());
			this.setList_creTitemStock_PLANT_CD(struct.getList_creTitemStock_PLANT_CD());
			this.setList_creTitemStock_STOCK_ON_HAND_QTY(struct.getList_creTitemStock_STOCK_ON_HAND_QTY());
			this.setList_mCust_COMPANY_CD(struct.getList_mCust_COMPANY_CD());
			this.setList_mCust_CUST_CD(struct.getList_mCust_CUST_CD());
			this.setList_mCust_CUST_NAME(struct.getList_mCust_CUST_NAME());
			this.setList_mCust_DETAIL_ROUND_TYP(struct.getList_mCust_DETAIL_ROUND_TYP());
			this.setList_mCust_INSPC_ACPT_TYP(struct.getList_mCust_INSPC_ACPT_TYP());
			this.setList_mCust_OWN_ORG_CD(struct.getList_mCust_OWN_ORG_CD());
			this.setList_mCust_EXCH_TYP(struct.getList_mCust_EXCH_TYP());
			this.setList_mCust_CUR_CD(struct.getList_mCust_CUR_CD());
			this.setList_mCust_IN_COMPANYCD(struct.getList_mCust_IN_COMPANYCD());
			this.setList_mCust_IN_CUSTCD(struct.getList_mCust_IN_CUSTCD());
			this.setList_getHomeCur_CUR_CD(struct.getList_getHomeCur_CUR_CD());
			this.setList_getHomeCur_DECIMAL_FIG(struct.getList_getHomeCur_DECIMAL_FIG());
			this.setList_getHomeCur_CTRL_CD(struct.getList_getHomeCur_CTRL_CD());
			this.setList_strCode(struct.getList_strCode());
			this.setList_mUnitCost_UNIT_COST(struct.getList_mUnitCost_UNIT_COST());
			this.setList_mUnitCost_EFF_PHASE_IN_DATE(struct.getList_mUnitCost_EFF_PHASE_IN_DATE());
			this.setList_mUnitCost_IN_COMPANYCD(struct.getList_mUnitCost_IN_COMPANYCD());
			this.setList_mUnitCost_IN_CUSTCD(struct.getList_mUnitCost_IN_CUSTCD());
			this.setList_mUnitCost_IN_ITEMCD(struct.getList_mUnitCost_IN_ITEMCD());
			this.setList_mUnitCost_IN_EFFPHASEINDATE(struct.getList_mUnitCost_IN_EFFPHASEINDATE());
			this.setList_readShipOdr_TOTAL_SHIP_QTY(struct.getList_readShipOdr_TOTAL_SHIP_QTY());
			this.setList_readShipOdr_RETURN_QTY(struct.getList_readShipOdr_RETURN_QTY());
			this.setList_readShipOdr_SHIP_ODR_NO(struct.getList_readShipOdr_SHIP_ODR_NO());
			this.setList_g_CUR_UNIT(struct.getList_g_CUR_UNIT());
			this.setList_DECIMAL_FIG(struct.getList_DECIMAL_FIG());
			this.setList_t_CUR_CD(struct.getList_t_CUR_CD());
			this.setList_strSLIP_CTRL_GRP(struct.getList_strSLIP_CTRL_GRP());
			this.setList_strSTATUS(struct.getList_strSTATUS());
			this.setList_strSLIP_CD(struct.getList_strSLIP_CD());
			this.setList_upTshipOdr_SHP_CMPLT_FLG(struct.getList_upTshipOdr_SHP_CMPLT_FLG());
			this.setList_upTshipOdr_TOTAL_SHIP_QTY(struct.getList_upTshipOdr_TOTAL_SHIP_QTY());
			this.setList_upTshipOdr_SLIP_CD(struct.getList_upTshipOdr_SLIP_CD());
			this.setList_upTshipOdr_ORG_SLIP_CD(struct.getList_upTshipOdr_ORG_SLIP_CD());
			this.setList_upTshipOdr_SHIP_ODR_NO(struct.getList_upTshipOdr_SHIP_ODR_NO());
			this.setList_strTod_OD_NO(struct.getList_strTod_OD_NO());
			this.setList_strTod_TOTAL_ISSUE_QTY(struct.getList_strTod_TOTAL_ISSUE_QTY());
			this.setList_strTod_DM_QTY(struct.getList_strTod_DM_QTY());
			this.setList_strTod_DM_STS_TYP(struct.getList_strTod_DM_STS_TYP());
			this.setList_inTod_ODR_NO(struct.getList_inTod_ODR_NO());
			this.setList_inTod_PART_DLV_SEQ_NO(struct.getList_inTod_PART_DLV_SEQ_NO());
			this.setList_inTod_OD_NO(struct.getList_inTod_OD_NO());
			this.setList_strTaxTAX_KBN(struct.getList_strTaxTAX_KBN());
			this.setList_strTaxOLD_TAX_1(struct.getList_strTaxOLD_TAX_1());
			this.setList_strTaxOLD_TAX_2(struct.getList_strTaxOLD_TAX_2());
			this.setList_strTaxOLD_TAX_3(struct.getList_strTaxOLD_TAX_3());
			this.setList_strTaxNEW_TAX_1(struct.getList_strTaxNEW_TAX_1());
			this.setList_strTaxNEW_TAX_2(struct.getList_strTaxNEW_TAX_2());
			this.setList_strTaxNEW_TAX_3(struct.getList_strTaxNEW_TAX_3());
			this.setList_strTaxSTART_DATE(struct.getList_strTaxSTART_DATE());
			this.setList_strTaxROUND_TYP(struct.getList_strTaxROUND_TYP());
			this.setList_updiffTAX_CD(struct.getList_updiffTAX_CD());
			this.setList_upTshipOdr_RETURN_QTY(struct.getList_upTshipOdr_RETURN_QTY());
			this.setList_chkSLIP_CD(struct.getList_chkSLIP_CD());
			this.setList_mWh_WH_NAME(struct.getList_mWh_WH_NAME());
			this.setList_mWh_PLANT_CD(struct.getList_mWh_PLANT_CD());
			this.setList_mWh_IN_WH_CD(struct.getList_mWh_IN_WH_CD());
			this.setList_mOrg_ORG_NAME(struct.getList_mOrg_ORG_NAME());
			this.setList_mOrg_IN_COMPANYCD(struct.getList_mOrg_IN_COMPANYCD());
			this.setList_mOrg_IN_ORGCD(struct.getList_mOrg_IN_ORGCD());
			this.setList_serTitemStock_JOB_ODR_CD(struct.getList_serTitemStock_JOB_ODR_CD());
			this.setList_serTitemStock_IN_JOBODRCD(struct.getList_serTitemStock_IN_JOBODRCD());
			this.setList_creTitemStock_JOB_ODR_CD(struct.getList_creTitemStock_JOB_ODR_CD());
			this.setList_upTitemStock_IN_JOBODRCD(struct.getList_upTitemStock_IN_JOBODRCD());
			this.setList_serTJobOdr_JOB_ODR_CD(struct.getList_serTJobOdr_JOB_ODR_CD());
			this.setList_serTJobOdr_ITEM_CD(struct.getList_serTJobOdr_ITEM_CD());
			this.setList_diffSHIP_QTY(struct.getList_diffSHIP_QTY());
			this.setList_diffSHIP_ODR_AMOUNT(struct.getList_diffSHIP_ODR_AMOUNT());
			this.setList_diffSHIP_ODR_AMOUNT_EXCH_RATE(struct.getList_diffSHIP_ODR_AMOUNT_EXCH_RATE());
			this.setList_diffSHIP_ODR_NO(struct.getList_diffSHIP_ODR_NO());
			this.setList_diffODR_NO(struct.getList_diffODR_NO());
			this.setList_diffPART_DLV_SEQ_NO(struct.getList_diffPART_DLV_SEQ_NO());
			this.setList_diffSLIP_CD(struct.getList_diffSLIP_CD());
			this.setList_diffITEM_CD(struct.getList_diffITEM_CD());
			this.setList_diffJOB_ODR_CD(struct.getList_diffJOB_ODR_CD());
			this.setList_diffCUST_ITEM_CD(struct.getList_diffCUST_ITEM_CD());
			this.setList_diffCUST_ODR_NO(struct.getList_diffCUST_ODR_NO());
			this.setList_diffCUST_CD(struct.getList_diffCUST_CD());
			this.setList_diffCUST_NAME(struct.getList_diffCUST_NAME());
			this.setList_diffCUST_CHRG_PSN_CD(struct.getList_diffCUST_CHRG_PSN_CD());
			this.setList_diffSHIP_ODR_ISS_PSN_CD(struct.getList_diffSHIP_ODR_ISS_PSN_CD());
			this.setList_diffDLV_LOC_CD(struct.getList_diffDLV_LOC_CD());
			this.setList_diffDEPO_TYP(struct.getList_diffDEPO_TYP());
			this.setList_diffDESINATED_SHIP_DATE(struct.getList_diffDESINATED_SHIP_DATE());
			this.setList_diffSCDL_DLV_DATE(struct.getList_diffSCDL_DLV_DATE());
			this.setList_diffTOTAL_SHIP_QTY(struct.getList_diffTOTAL_SHIP_QTY());
			this.setList_diffRETURN_QTY(struct.getList_diffRETURN_QTY());
			this.setList_diffUNIT_CD(struct.getList_diffUNIT_CD());
			this.setList_diffUNIT_PRICE(struct.getList_diffUNIT_PRICE());
			this.setList_diffCURRENCY_CD(struct.getList_diffCURRENCY_CD());
			this.setList_diffLOC_CD(struct.getList_diffLOC_CD());
			this.setList_diffPKG_UNIT_QTY(struct.getList_diffPKG_UNIT_QTY());
			this.setList_diffREMARKS(struct.getList_diffREMARKS());
			this.setList_diffDLV_KEY_NO(struct.getList_diffDLV_KEY_NO());
			this.setList_diffPART_DLV_COUNT(struct.getList_diffPART_DLV_COUNT());
			this.setList_diffTRANSPORT_CD(struct.getList_diffTRANSPORT_CD());
			this.setList_diffTRANSPORT_TYP(struct.getList_diffTRANSPORT_TYP());
			this.setList_diffALLCT_WH_CD(struct.getList_diffALLCT_WH_CD());
			this.setList_diffTRANSFER_WH_CD(struct.getList_diffTRANSFER_WH_CD());
			this.setList_diffDIRECT_DLV_FLG(struct.getList_diffDIRECT_DLV_FLG());
			this.setList_diffENTRY_TYP(struct.getList_diffENTRY_TYP());
			this.setList_diffPRINT_FLG(struct.getList_diffPRINT_FLG());
			this.setList_diffSHIP_CMPLT_FLG(struct.getList_diffSHIP_CMPLT_FLG());
			this.setList_diffDEPO_TRANSFER_PROC_FLG(struct.getList_diffDEPO_TRANSFER_PROC_FLG());
			this.setList_diffDEL_FLG(struct.getList_diffDEL_FLG());
			this.setList_diffuptOdr_SHIP_CNT(struct.getList_diffuptOdr_SHIP_CNT());
			this.setList_diffuptOdr_PART_DLV_COUNT(struct.getList_diffuptOdr_PART_DLV_COUNT());
			this.setList_diffuptOdr_IN_ODRNO(struct.getList_diffuptOdr_IN_ODRNO());
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
			this.setList_up_tShipSlip_SLIP_CD(struct.getList_up_tShipSlip_SLIP_CD());
			this.setList_updiffSHIP_ODR_QTY(struct.getList_updiffSHIP_ODR_QTY());
			this.setList_updiffSHIP_ODR_AMOUNT(struct.getList_updiffSHIP_ODR_AMOUNT());
			this.setList_updiffTAX_AMOUNT(struct.getList_updiffTAX_AMOUNT());
			this.setList_updiffSHIP_ODR_AMOUNT_TAX(struct.getList_updiffSHIP_ODR_AMOUNT_TAX());
			this.setList_updiffEXTERNAL_TAX_SALES_AMOUNT(struct.getList_updiffEXTERNAL_TAX_SALES_AMOUNT());
			this.setList_updiffINTERNAL_TAX_SALES_AMOUNT(struct.getList_updiffINTERNAL_TAX_SALES_AMOUNT());
			this.setList_updiffTAXFREE_SALES_AMOUNT(struct.getList_updiffTAXFREE_SALES_AMOUNT());
			this.setList_updiffTAX_CREDIT_SALES_AMOUNT(struct.getList_updiffTAX_CREDIT_SALES_AMOUNT());
			this.setList_updiffEXTERNAL_TAX_AMOUNT(struct.getList_updiffEXTERNAL_TAX_AMOUNT());
			this.setList_updiffINTERNAL_TAX_AMOUNT(struct.getList_updiffINTERNAL_TAX_AMOUNT());
			this.setList_updiffTAX_AMOUNT_1(struct.getList_updiffTAX_AMOUNT_1());
			this.setList_updiffTAX_AMOUNT_2(struct.getList_updiffTAX_AMOUNT_2());
			this.setList_updiffTAX_AMOUNT_3(struct.getList_updiffTAX_AMOUNT_3());
			this.setList_updiffOWN_CUR_TAXCREDIT_SALES_AMOUNT(struct.getList_updiffOWN_CUR_TAXCREDIT_SALES_AMOUNT());
			this.setList_updiffSLIP_CD(struct.getList_updiffSLIP_CD());
			this.setList_PAST_RESULT_ENTRY_TYP(struct.getList_PAST_RESULT_ENTRY_TYP());
			this.setList_PROC_EXEC_DATE(struct.getList_PROC_EXEC_DATE());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_mCustBase_TRANSPORT_LT(struct.getList_mCustBase_TRANSPORT_LT());
			this.setList_mCustBase_IN_COMPANYCD(struct.getList_mCustBase_IN_COMPANYCD());
			this.setList_mCustBase_IN_CUSTCD(struct.getList_mCustBase_IN_CUSTCD());
			this.setList_mCustBase_IN_DLVLOCCD(struct.getList_mCustBase_IN_DLVLOCCD());
			this.setList_strSYUKA_LT(struct.getList_strSYUKA_LT());
			this.setList_strTaxIN_COMPANYCD(struct.getList_strTaxIN_COMPANYCD());
			this.setList_strTaxIN_CUSTCD(struct.getList_strTaxIN_CUSTCD());
			this.setList_g_CUST_ITEM_CD(struct.getList_g_CUST_ITEM_CD());
			this.setList_strT_ODR_TAX(struct.getList_strT_ODR_TAX());
			this.setList_g_SLIP_CD(struct.getList_g_SLIP_CD());
			this.setList_getTship_SHIP_SEQ_NO(struct.getList_getTship_SHIP_SEQ_NO());
			this.setList_chkLOT_NO(struct.getList_chkLOT_NO());
			this.setList_chkITEM_CD(struct.getList_chkITEM_CD());
			this.setList_getQtySTOCK_ON_HAND_QTY(struct.getList_getQtySTOCK_ON_HAND_QTY());
			this.setList_getQtyALCD_QTY(struct.getList_getQtyALCD_QTY());
			this.setList_getQtyITEM_CD(struct.getList_getQtyITEM_CD());
			this.setList_getQtyWH_CD(struct.getList_getQtyWH_CD());
			this.setList_getQtyLOT_NO(struct.getList_getQtyLOT_NO());
			this.setList_readTlotStock_LOT_NO(struct.getList_readTlotStock_LOT_NO());
			this.setList_readTlotStock_STOCK_ON_HAND_QTY(struct.getList_readTlotStock_STOCK_ON_HAND_QTY());
			this.setList_readTlotStock_ALCD_QTY(struct.getList_readTlotStock_ALCD_QTY());
			this.setList_readTlotStock_IN_ITEM_CD(struct.getList_readTlotStock_IN_ITEM_CD());
			this.setList_readTlotStock_IN_WH_CD(struct.getList_readTlotStock_IN_WH_CD());
			this.setList_readTlotStock_IN_LOT_NO(struct.getList_readTlotStock_IN_LOT_NO());
			this.setList_upTlotStockSTOCK_ON_HAND_QTY(struct.getList_upTlotStockSTOCK_ON_HAND_QTY());
			this.setList_upTlotStockIN_ITEM_CD(struct.getList_upTlotStockIN_ITEM_CD());
			this.setList_upTlotStockIN_WH_CD(struct.getList_upTlotStockIN_WH_CD());
			this.setList_upTlotStockIN_LOT_NO(struct.getList_upTlotStockIN_LOT_NO());
			this.setList_serLotSTOCK_ON_HAND_QTY(struct.getList_serLotSTOCK_ON_HAND_QTY());
			this.setList_serLotALCD_QTY(struct.getList_serLotALCD_QTY());
			this.setList_serLotIN_ITEM_CD(struct.getList_serLotIN_ITEM_CD());
			this.setList_serLotIN_WH_CD(struct.getList_serLotIN_WH_CD());
			this.setList_serLotIN_LOT_NO(struct.getList_serLotIN_LOT_NO());
			this.setList_insertLotStock_ITEM_CD(struct.getList_insertLotStock_ITEM_CD());
			this.setList_insertLotStock_WH_CD(struct.getList_insertLotStock_WH_CD());
			this.setList_insertLotStock_LOT_CD(struct.getList_insertLotStock_LOT_CD());
			this.setList_insertLotStock_PLANT_CD(struct.getList_insertLotStock_PLANT_CD());
			this.setList_insertLotStock_STOCK_ON_HAND_QTY(struct.getList_insertLotStock_STOCK_ON_HAND_QTY());
			this.setList_insertLotStock_DEFECT_QTY(struct.getList_insertLotStock_DEFECT_QTY());
			this.setList_insertLotStock_ALCD_QTY(struct.getList_insertLotStock_ALCD_QTY());
			this.setList_insTshipInst_SHIP_SEQ_NO(struct.getList_insTshipInst_SHIP_SEQ_NO());
			this.setList_insTshipInst_SHIP_ODR_NO(struct.getList_insTshipInst_SHIP_ODR_NO());
			this.setList_insTshipInst_LOT_NO(struct.getList_insTshipInst_LOT_NO());
			this.setList_insTshipInst_ITEM_CD(struct.getList_insTshipInst_ITEM_CD());
			this.setList_insTshipInst_WH_CD(struct.getList_insTshipInst_WH_CD());
			this.setList_insTshipInst_ODR_NO(struct.getList_insTshipInst_ODR_NO());
			this.setList_insTshipInst_SLIP_CD(struct.getList_insTshipInst_SLIP_CD());
			this.setList_insTshipInst_SHIP_QTY(struct.getList_insTshipInst_SHIP_QTY());
			this.setList_insTshipInst_SHIP_DATE(struct.getList_insTshipInst_SHIP_DATE());
			this.setList_delTshipInstIN_SHIP_SEQ_NO(struct.getList_delTshipInstIN_SHIP_SEQ_NO());
			this.setList_delTshipInstIN_LOT_NO(struct.getList_delTshipInstIN_LOT_NO());
			this.setList_tlotTrace_FROM_ITEM_CD(struct.getList_tlotTrace_FROM_ITEM_CD());
			this.setList_tlotTrace_FROM_LOT_NO(struct.getList_tlotTrace_FROM_LOT_NO());
			this.setList_tlotTrace_TO_ITEM_CD(struct.getList_tlotTrace_TO_ITEM_CD());
			this.setList_tlotTrace_TO_LOT_NO(struct.getList_tlotTrace_TO_LOT_NO());
			this.setList_tlotTrace_LOT_TRACE_TYP(struct.getList_tlotTrace_LOT_TRACE_TYP());
			this.setList_tlotTrace_CUST_ODR_NO(struct.getList_tlotTrace_CUST_ODR_NO());
			this.setList_tlotTrace_SLIP_CD(struct.getList_tlotTrace_SLIP_CD());
			this.setList_tlotTrace_ODR_NO(struct.getList_tlotTrace_ODR_NO());
			this.setList_readTshipInst_LOT_NO(struct.getList_readTshipInst_LOT_NO());
			this.setList_readTshipInst_SHIP_QTY(struct.getList_readTshipInst_SHIP_QTY());
			this.setList_readTshipInst_SHIP_ODR_NO(struct.getList_readTshipInst_SHIP_ODR_NO());
			this.setList_readTshipInst_ITEM_CD(struct.getList_readTshipInst_ITEM_CD());
			this.setList_readTshipInst_WH_CD(struct.getList_readTshipInst_WH_CD());
			this.setList_readTshipInst_ODR_NO(struct.getList_readTshipInst_ODR_NO());
			this.setList_readTshipInst_SLIP_CD(struct.getList_readTshipInst_SLIP_CD());
			this.setList_readTshipInst_SHIP_DATE(struct.getList_readTshipInst_SHIP_DATE());
			this.setList_readTshipInst_IN_SHIP_SEQ_NO(struct.getList_readTshipInst_IN_SHIP_SEQ_NO());
			this.setList_readTshipInst_IN_LOT_NO(struct.getList_readTshipInst_IN_LOT_NO());
			this.setList_readT_Ship_Inst_Lot_NO(struct.getList_readT_Ship_Inst_Lot_NO());
			this.setList_readT_Ship_Inst_Ship_Seq_NO(struct.getList_readT_Ship_Inst_Ship_Seq_NO());
			this.setList_strOdrCurrncyCd(struct.getList_strOdrCurrncyCd());
			this.setList_strExchTyp(struct.getList_strExchTyp());
			this.setList_g_DATE(struct.getList_g_DATE());
			this.setList_selTShipOdr_MODIFY_COUNT(struct.getList_selTShipOdr_MODIFY_COUNT());
			this.setList_SEL_MODIFY_COUNT(struct.getList_SEL_MODIFY_COUNT());
		}
	}

	/**
	 * IuWFNgÌ¶ñ\»ðÔµÜ·B
	 * ±±ÅÍAgetXXXXÅæ¾Å«é±ÌNXÌ®«liXgÍ­jðÔµÜ·B
	 * @return IuWFNgÌ¶ñ\»
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
	// úlè`
	// ÈºÉú»Ég¤èÌQlÆµÄÄ¶¬Ì½ÑÉ©®IÉSo[ÌTvðRgAEgµÄoÍµÄ¢Ü·B
/*
	// æ 1 ÏúlF i_k_MODE


	final static String i_k_MODE = null;

	// æ 2 ÏúlF i_h_RESULT


	final static String i_h_RESULT = null;

	// æ 3 ÏúlF i_r_SEL_PTN


	final static String i_r_SEL_PTN = null;

	// æ 4 ÏúlF i_g_DESINATED_SHIP_DATE


	final static String i_g_DESINATED_SHIP_DATE = null;

	// æ 5 ÏúlF i_g_SHIP_QTY


	final static String i_g_SHIP_QTY = null;

	// æ 6 ÏúlF i_g_SHIP_QTY2


	final static String i_g_SHIP_QTY2 = null;

	// æ 7 ÏúlF i_g_UNIT_PRICE


	final static String i_g_UNIT_PRICE = null;

	// æ 8 ÏúlF i_g_CURRNCY


	final static String i_g_CURRNCY = null;

	// æ 9 ÏúlF i_g_SHIP_ODR_AMOUNT


	final static String i_g_SHIP_ODR_AMOUNT = null;

	// æ 10 ÏúlF i_g_WH_CD


	final static String i_g_WH_CD = null;

	// æ 11 ÏúlF i_g_REMARKS


	final static String i_g_REMARKS = null;

	// æ 12 ÏúlF i_g_CUST_ANAME


	final static String i_g_CUST_ANAME = null;

	// æ 13 ÏúlF i_g_ITEM_CD


	final static String i_g_ITEM_CD = null;

	// æ 14 ÏúlF i_h_AP_SECRTY_TYP


	final static String i_h_AP_SECRTY_TYP = null;

	// æ 15 ÏúlF i_h_SHIP_QTY


	final static String i_h_SHIP_QTY = null;

	// æ 16 ÏúlF i_h_ITEM_CD


	final static String i_h_ITEM_CD = null;

	// æ 17 ÏúlF i_h_GYOMU_DATE


	final static String i_h_GYOMU_DATE = null;

	// æ 18 ÏúlF i_h_EXCH_TYP


	final static String i_h_EXCH_TYP = null;

	// æ 19 ÏúlF i_h_MODFIY_CNT


	final static String i_h_MODFIY_CNT = null;

	// æ 20 ÏúlF i_h_TOTAL_SHIP_QTY


	final static String i_h_TOTAL_SHIP_QTY = null;

	// æ 21 ÏúlF i_m_selRadio


	final static String i_m_selRadio = null;

	// æ 22 ÏúlF i_r_SEL_PTN1


	final static String i_r_SEL_PTN1 = null;

	// æ 23 ÏúlF i_r_SEL_PTN2


	final static String i_r_SEL_PTN2 = null;

	// æ 24 ÏúlF i_r_SEL_PTN3


	final static String i_r_SEL_PTN3 = null;

	// æ 25 ÏúlF i_h_SELECT_FG


	final static String i_h_SELECT_FG = null;

	// æ 26 ÏúlF i_h_UNIT_PRICE


	final static String i_h_UNIT_PRICE = null;

	// æ 27 ÏúlF i_g_STOCK_UNIT


	final static String i_g_STOCK_UNIT = null;

	// æ 28 ÏúlF i_g_STOCK_UNIT2


	final static String i_g_STOCK_UNIT2 = null;

	// æ 29 ÏúlF i_g_CUR_UNIT2


	final static String i_g_CUR_UNIT2 = null;

	// æ 30 ÏúlF i_g_WH_NAME


	final static String i_g_WH_NAME = null;

	// æ 31 ÏúlF i_g_SALES_DEPT_CD


	final static String i_g_SALES_DEPT_CD = null;

	// æ 32 ÏúlF i_g_ORG_NAME


	final static String i_g_ORG_NAME = null;

	// æ 33 ÏúlF i_g_CUST_CD


	final static String i_g_CUST_CD = null;

	// æ 34 ÏúlF i_g_CUST_ITEM_NAME


	final static String i_g_CUST_ITEM_NAME = null;

	// æ 35 ÏúlF i_g_ITEM_NAME


	final static String i_g_ITEM_NAME = null;

	// æ 36 ÏúlF i_g_CUST_ODR_NO


	final static String i_g_CUST_ODR_NO = null;

	// æ 37 ÏúlF i_g_ODR_NO


	final static String i_g_ODR_NO = null;

	// æ 38 ÏúlF i_g_PART_DLV_SEQ_NO


	final static String i_g_PART_DLV_SEQ_NO = null;

	// æ 39 ÏúlF i_g_SHIP_ODR_NO


	final static String i_g_SHIP_ODR_NO = null;

	// æ 40 ÏúlF i_h_DATE


	final static String i_h_DATE = null;

	// æ 41 ÏúlF i_g_JOB_ODR_CD


	final static String i_g_JOB_ODR_CD = null;

	// æ 42 ÏúlF i_c_JOB_ODR_CD


	final static String i_c_JOB_ODR_CD = null;

	// æ 43 ÏúlF i_g_DIRECT_DLV_FLG


	final static String i_g_DIRECT_DLV_FLG = null;

	// æ 44 ÏúlF i_g_STOCK_LOT_CD


	final static String i_g_STOCK_LOT_CD = null;

	// æ 45 ÏúlF i_h_STOCK_LOT_CD


	final static String i_h_STOCK_LOT_CD = null;

	// æ 46 ÏúlF i_param1


	final static String i_param1 = null;

	// æ 47 ÏúlF i_param2


	final static String i_param2 = null;

	// æ 48 ÏúlF i_param3


	final static String i_param3 = null;

	// æ 49 ÏúlF i_ROUND_TYP


	final static String i_ROUND_TYP = null;

	// æ 50 ÏúlF i_UNIT_QTY_TYP


	final static String i_UNIT_QTY_TYP = null;

	// æ 51 ÏúlF i_UNIT_FIG


	final static String i_UNIT_FIG = null;

	// æ 52 ÏúlF i_strCOMPANY_CD


	final static String i_strCOMPANY_CD = null;

	// æ 53 ÏúlF i_strUSER_NAME


	final static String i_strUSER_NAME = null;

	// æ 54 ÏúlF i_strPLANT_CD


	final static String i_strPLANT_CD = null;

	// æ 55 ÏúlF i_strSECTION_CD


	final static String i_strSECTION_CD = null;

	// æ 56 ÏúlF i_strORG_CD


	final static String i_strORG_CD = null;

	// æ 57 ÏúlF i_strORG_NAME


	final static String i_strORG_NAME = null;

	// æ 58 ÏúlF i_strORG_ANAME


	final static String i_strORG_ANAME = null;

	// æ 59 ÏúlF i_strPLANT_NAME


	final static String i_strPLANT_NAME = null;

	// æ 60 ÏúlF i_strPLANT_ANAME


	final static String i_strPLANT_ANAME = null;

	// æ 61 ÏúlF i_strCAL_NO


	final static Double i_strCAL_NO = null;

	// æ 62 ÏúlF i_strUSER_CD


	final static String i_strUSER_CD = null;

	// æ 63 ÏúlF i_strBUSINESS_OPR_DATE


	final static String i_strBUSINESS_OPR_DATE = null;

	// æ 64 ÏúlF i_serTori_SHIP_SEQ_NO


	final static String i_serTori_SHIP_SEQ_NO = null;

	// æ 65 ÏúlF i_serTori_SHIP_ODR_NO


	final static String i_serTori_SHIP_ODR_NO = null;

	// æ 66 ÏúlF i_serTori_SLIP_CD


	final static String i_serTori_SLIP_CD = null;

	// æ 67 ÏúlF i_serTori_ODR_NO


	final static String i_serTori_ODR_NO = null;

	// æ 68 ÏúlF i_serTori_PART_DLV_SEQ_NO


	final static String i_serTori_PART_DLV_SEQ_NO = null;

	// æ 69 ÏúlF i_serTori_ORGNAL_SLIP_CD


	final static String i_serTori_ORGNAL_SLIP_CD = null;

	// æ 70 ÏúlF i_serTori_SLIP_TRN_CD


	final static String i_serTori_SLIP_TRN_CD = null;

	// æ 71 ÏúlF i_serTori_ITEM_CD


	final static String i_serTori_ITEM_CD = null;

	// æ 72 ÏúlF i_serTori_JOB_ODR_CD


	final static String i_serTori_JOB_ODR_CD = null;

	// æ 73 ÏúlF i_serTori_CUST_ITEM_CD


	final static String i_serTori_CUST_ITEM_CD = null;

	// æ 74 ÏúlF i_serTori_CUST_ODR_NO


	final static String i_serTori_CUST_ODR_NO = null;

	// æ 75 ÏúlF i_serTori_CUST_CD


	final static String i_serTori_CUST_CD = null;

	// æ 76 ÏúlF i_serTori_CUST_NAME


	final static String i_serTori_CUST_NAME = null;

	// æ 77 ÏúlF i_serTori_CUST_CHRG_PSN_CD


	final static String i_serTori_CUST_CHRG_PSN_CD = null;

	// æ 78 ÏúlF i_serTori_SHIP_ODR_ISS_PSN_CD


	final static String i_serTori_SHIP_ODR_ISS_PSN_CD = null;

	// æ 79 ÏúlF i_serTori_DLV_LOC_CD


	final static String i_serTori_DLV_LOC_CD = null;

	// æ 80 ÏúlF i_serTori_DEPO_TYP


	final static String i_serTori_DEPO_TYP = null;

	// æ 81 ÏúlF i_serTori_ALLCT_WH_CD


	final static String i_serTori_ALLCT_WH_CD = null;

	// æ 82 ÏúlF i_serTori_DEPO_WH_CD


	final static String i_serTori_DEPO_WH_CD = null;

	// æ 83 ÏúlF i_serTori_LOC_CD


	final static String i_serTori_LOC_CD = null;

	// æ 84 ÏúlF i_serTori_SHIP_DATE


	final static String i_serTori_SHIP_DATE = null;

	// æ 85 ÏúlF i_serTori_SHIP_QTY


	final static String i_serTori_SHIP_QTY = null;

	// æ 86 ÏúlF i_serTori_UNIT_CD


	final static String i_serTori_UNIT_CD = null;

	// æ 87 ÏúlF i_serTori_SHIP_UNIT_PRICE


	final static String i_serTori_SHIP_UNIT_PRICE = null;

	// æ 88 ÏúlF i_serTori_SHIP_ODR_AMOUNT


	final static String i_serTori_SHIP_ODR_AMOUNT = null;

	// æ 89 ÏúlF i_serTori_SHIP_ODR_AMOUNT_EXCH_RATES


	final static String i_serTori_SHIP_ODR_AMOUNT_EXCH_RATES = null;

	// æ 90 ÏúlF i_serTori_CURRNCY_CD


	final static String i_serTori_CURRNCY_CD = null;

	// æ 91 ÏúlF i_serTori_DIRECT_DLV_FLG


	final static String i_serTori_DIRECT_DLV_FLG = null;

	// æ 92 ÏúlF i_serTori_SHIP_INFO_IF_CTRL_NO


	final static String i_serTori_SHIP_INFO_IF_CTRL_NO = null;

	// æ 93 ÏúlF i_serTori_INSPC_ACPT_INFO_IF_CTRL_NO


	final static String i_serTori_INSPC_ACPT_INFO_IF_CTRL_NO = null;

	// æ 94 ÏúlF i_serTori_DLV_KEY_NO


	final static String i_serTori_DLV_KEY_NO = null;

	// æ 95 ÏúlF i_serTori_DEL_FLG


	final static String i_serTori_DEL_FLG = null;

	// æ 96 ÏúlF i_serTori_CUR_NAME


	final static String i_serTori_CUR_NAME = null;

	// æ 97 ÏúlF i_serTori_EXCH_TYP


	final static String i_serTori_EXCH_TYP = null;

	// æ 98 ÏúlF i_serTori_MODIFY_COUNT


	final static String i_serTori_MODIFY_COUNT = null;

	// æ 99 ÏúlF i_serTori_RETURN_QTY


	final static String i_serTori_RETURN_QTY = null;

	// æ 100 ÏúlF i_serTori_TOTAL_SHIP_QTY


	final static String i_serTori_TOTAL_SHIP_QTY = null;

	// æ 101 ÏúlF i_serTori_STATUS


	final static String i_serTori_STATUS = null;

	// æ 102 ÏúlF i_serTori_INSPC_ACPT_TYP


	final static String i_serTori_INSPC_ACPT_TYP = null;

	// æ 103 ÏúlF i_serToriSALES_DEPT_CD


	final static String i_serToriSALES_DEPT_CD = null;

	// æ 104 ÏúlF i_serToriSALES_DATE


	final static String i_serToriSALES_DATE = null;

	// æ 105 ÏúlF i_h_MRP_ODR_TYP


	final static String i_h_MRP_ODR_TYP = null;

	// æ 106 ÏúlF i_h_LOT_CTRL_FLG


	final static String i_h_LOT_CTRL_FLG = null;

	// æ 107 ÏúlF i_serTodrMODIFY_COUNT


	final static String i_serTodrMODIFY_COUNT = null;

	// æ 108 ÏúlF i_serTori_IN_SLIPCD


	final static String i_serTori_IN_SLIPCD = null;

	// æ 109 ÏúlF i_creTship_SHIP_SEQ_NO


	final static String i_creTship_SHIP_SEQ_NO = null;

	// æ 110 ÏúlF i_creTship_SHIP_ODR_NO


	final static String i_creTship_SHIP_ODR_NO = null;

	// æ 111 ÏúlF i_creTship_SLIP_CD


	final static String i_creTship_SLIP_CD = null;

	// æ 112 ÏúlF i_creTship_ODR_NO


	final static String i_creTship_ODR_NO = null;

	// æ 113 ÏúlF i_creTship_PART_DLV_SEQ_NO


	final static String i_creTship_PART_DLV_SEQ_NO = null;

	// æ 114 ÏúlF i_creTship_ORGNAL_SLIP_CD


	final static String i_creTship_ORGNAL_SLIP_CD = null;

	// æ 115 ÏúlF i_creTship_SLIP_TRN_CD


	final static String i_creTship_SLIP_TRN_CD = null;

	// æ 116 ÏúlF i_creTship_ITEM_CD


	final static String i_creTship_ITEM_CD = null;

	// æ 117 ÏúlF i_creTship_JOB_ODR_CD


	final static String i_creTship_JOB_ODR_CD = null;

	// æ 118 ÏúlF i_creTship_CUST_ITEM_CD


	final static String i_creTship_CUST_ITEM_CD = null;

	// æ 119 ÏúlF i_creTship_CUST_ODR_NO


	final static String i_creTship_CUST_ODR_NO = null;

	// æ 120 ÏúlF i_creTship_CUST_CD


	final static String i_creTship_CUST_CD = null;

	// æ 121 ÏúlF i_creTship_CUST_NAME


	final static String i_creTship_CUST_NAME = null;

	// æ 122 ÏúlF i_creTship_CUST_CHRG_PSN_CD


	final static String i_creTship_CUST_CHRG_PSN_CD = null;

	// æ 123 ÏúlF i_creTship_SHIP_ODR_ISS_PSN_CD


	final static String i_creTship_SHIP_ODR_ISS_PSN_CD = null;

	// æ 124 ÏúlF i_creTship_DLV_LOC_CD


	final static String i_creTship_DLV_LOC_CD = null;

	// æ 125 ÏúlF i_creTship_DEPO_TYP


	final static String i_creTship_DEPO_TYP = null;

	// æ 126 ÏúlF i_creTship_ALLCT_WH_CD


	final static String i_creTship_ALLCT_WH_CD = null;

	// æ 127 ÏúlF i_creTship_DEPO_WH_CD


	final static String i_creTship_DEPO_WH_CD = null;

	// æ 128 ÏúlF i_creTship_LOC_CD


	final static String i_creTship_LOC_CD = null;

	// æ 129 ÏúlF i_creTship_SHIP_DATE


	final static String i_creTship_SHIP_DATE = null;

	// æ 130 ÏúlF i_creTship_SHIP_QTY


	final static String i_creTship_SHIP_QTY = null;

	// æ 131 ÏúlF i_creTship_UNIT_CD


	final static String i_creTship_UNIT_CD = null;

	// æ 132 ÏúlF i_creTship_SHIP_UNIT_PRICE


	final static String i_creTship_SHIP_UNIT_PRICE = null;

	// æ 133 ÏúlF i_creTship_SHIP_ODR_AMOUNT


	final static String i_creTship_SHIP_ODR_AMOUNT = null;

	// æ 134 ÏúlF i_creTship_SHIP_ODR_AMOUNT_EXCH_RATES


	final static String i_creTship_SHIP_ODR_AMOUNT_EXCH_RATES = null;

	// æ 135 ÏúlF i_creTship_CURRNCY_CD


	final static String i_creTship_CURRNCY_CD = null;

	// æ 136 ÏúlF i_creTship_DIRECT_DLV_FLG


	final static String i_creTship_DIRECT_DLV_FLG = null;

	// æ 137 ÏúlF i_creTship_DLV_KEY_NO


	final static String i_creTship_DLV_KEY_NO = null;

	// æ 138 ÏúlF i_creTship_REMARKS


	final static String i_creTship_REMARKS = null;

	// æ 139 ÏúlF i_creTship_DEL_FLG


	final static String i_creTship_DEL_FLG = null;

	// æ 140 ÏúlF i_updTship_SHIP_SEQ_NO


	final static String i_updTship_SHIP_SEQ_NO = null;

	// æ 141 ÏúlF i_serInsert_SHIP_ODR_NO


	final static String i_serInsert_SHIP_ODR_NO = null;

	// æ 142 ÏúlF i_serInsert_ODR_NO


	final static String i_serInsert_ODR_NO = null;

	// æ 143 ÏúlF i_serInsert_PART_DLV_SEQ_NO


	final static String i_serInsert_PART_DLV_SEQ_NO = null;

	// æ 144 ÏúlF i_serInsert_SLIP_CD


	final static String i_serInsert_SLIP_CD = null;

	// æ 145 ÏúlF i_serInsert_ITEM_CD


	final static String i_serInsert_ITEM_CD = null;

	// æ 146 ÏúlF i_serInsert_JOB_ODR_CD


	final static String i_serInsert_JOB_ODR_CD = null;

	// æ 147 ÏúlF i_serInsert_CUST_ITEM_CD


	final static String i_serInsert_CUST_ITEM_CD = null;

	// æ 148 ÏúlF i_serInsert_CUST_ODR_NO


	final static String i_serInsert_CUST_ODR_NO = null;

	// æ 149 ÏúlF i_serInsert_CUST_CD


	final static String i_serInsert_CUST_CD = null;

	// æ 150 ÏúlF i_serInsert_CUST_NAME


	final static String i_serInsert_CUST_NAME = null;

	// æ 151 ÏúlF i_serInsert_CUST_CHRG_PSN_CD


	final static String i_serInsert_CUST_CHRG_PSN_CD = null;

	// æ 152 ÏúlF i_serInsert_SHIP_ODR_ISS_PSN_CD


	final static String i_serInsert_SHIP_ODR_ISS_PSN_CD = null;

	// æ 153 ÏúlF i_serInsert_DLV_LOC_CD


	final static String i_serInsert_DLV_LOC_CD = null;

	// æ 154 ÏúlF i_serInsert_DEPO_TYP


	final static String i_serInsert_DEPO_TYP = null;

	// æ 155 ÏúlF i_serInsert_DESINATED_SHIP_DATE


	final static String i_serInsert_DESINATED_SHIP_DATE = null;

	// æ 156 ÏúlF i_serInsert_SHIP_QTY


	final static String i_serInsert_SHIP_QTY = null;

	// æ 157 ÏúlF i_serInsert_TOTAL_SHIP_QTY


	final static String i_serInsert_TOTAL_SHIP_QTY = null;

	// æ 158 ÏúlF i_serInsert_UNIT_CD


	final static String i_serInsert_UNIT_CD = null;

	// æ 159 ÏúlF i_serInsert_UNIT_PRICE


	final static String i_serInsert_UNIT_PRICE = null;

	// æ 160 ÏúlF i_serInsert_SHIP_ODR_AMOUNT


	final static String i_serInsert_SHIP_ODR_AMOUNT = null;

	// æ 161 ÏúlF i_serInsert_SHIP_ODR_AMOUNT_EXCH_RATES


	final static String i_serInsert_SHIP_ODR_AMOUNT_EXCH_RATES = null;

	// æ 162 ÏúlF i_serInsert_CURRNCY_CD


	final static String i_serInsert_CURRNCY_CD = null;

	// æ 163 ÏúlF i_serInsert_LOC_CD


	final static String i_serInsert_LOC_CD = null;

	// æ 164 ÏúlF i_serInsert_PKG_UNIT_QTY


	final static String i_serInsert_PKG_UNIT_QTY = null;

	// æ 165 ÏúlF i_serInsert_REMARKS


	final static String i_serInsert_REMARKS = null;

	// æ 166 ÏúlF i_serInsert_TRANSPORT_CD


	final static String i_serInsert_TRANSPORT_CD = null;

	// æ 167 ÏúlF i_serInsert_TRANSPORT_TYP


	final static String i_serInsert_TRANSPORT_TYP = null;

	// æ 168 ÏúlF i_serInsert_ALLCT_WH_CD


	final static String i_serInsert_ALLCT_WH_CD = null;

	// æ 169 ÏúlF i_serInsert_TRANSFER_WH_CD


	final static String i_serInsert_TRANSFER_WH_CD = null;

	// æ 170 ÏúlF i_serInsert_DIRECT_DLV_FLG


	final static String i_serInsert_DIRECT_DLV_FLG = null;

	// æ 171 ÏúlF i_serInsert_ENTRY_TYP


	final static String i_serInsert_ENTRY_TYP = null;

	// æ 172 ÏúlF i_serInsert_PRINT_FLG


	final static String i_serInsert_PRINT_FLG = null;

	// æ 173 ÏúlF i_serInsert_SHP_CMPLT_FLG


	final static String i_serInsert_SHP_CMPLT_FLG = null;

	// æ 174 ÏúlF i_serInsert_DEPO_TRANSFER_PROC_FLG


	final static String i_serInsert_DEPO_TRANSFER_PROC_FLG = null;

	// æ 175 ÏúlF i_serInsert_DEL_FLG


	final static String i_serInsert_DEL_FLG = null;

	// æ 176 ÏúlF i_serInsert_CUR_CD


	final static String i_serInsert_CUR_CD = null;

	// æ 177 ÏúlF i_serInsert_CUR_NAME


	final static String i_serInsert_CUR_NAME = null;

	// æ 178 ÏúlF i_serInsert_EXCH_TYP


	final static String i_serInsert_EXCH_TYP = null;

	// æ 179 ÏúlF i_serInsert_SPCL_PRICE_TYP


	final static String i_serInsert_SPCL_PRICE_TYP = null;

	// æ 180 ÏúlF i_serInsert_MODIFY_COUNT


	final static String i_serInsert_MODIFY_COUNT = null;

	// æ 181 ÏúlF i_serInsert_SCDL_DLV_DATE


	final static String i_serInsert_SCDL_DLV_DATE = null;

	// æ 182 ÏúlF i_serInsert_DLV_KEY_NO


	final static String i_serInsert_DLV_KEY_NO = null;

	// æ 183 ÏúlF i_h_RETURN_QTY


	final static String i_h_RETURN_QTY = null;

	// æ 184 ÏúlF i_serInsert_ODR_ACPT_DATE


	final static String i_serInsert_ODR_ACPT_DATE = null;

	// æ 185 ÏúlF i_h_JOB_ODR_CD


	final static String i_h_JOB_ODR_CD = null;

	// æ 186 ÏúlF i_selMODIFY_COUNT


	final static String i_selMODIFY_COUNT = null;

	// æ 187 ÏúlF i_serInsert_IN_SLIPCD


	final static String i_serInsert_IN_SLIPCD = null;

	// æ 188 ÏúlF i_upTshipOdr_DEPO_TRANSFER_PROC_FLG


	final static String i_upTshipOdr_DEPO_TRANSFER_PROC_FLG = null;

	// æ 189 ÏúlF i_upTshipOdr_IN_SLIPCD


	final static String i_upTshipOdr_IN_SLIPCD = null;

	// æ 190 ÏúlF i_chkisWhCd_WH_CD


	final static String i_chkisWhCd_WH_CD = null;

	// æ 191 ÏúlF i_chkisWhCd_WH_TYP


	final static String i_chkisWhCd_WH_TYP = null;

	// æ 192 ÏúlF i_chkisinWhCd_WH_NAME


	final static String i_chkisinWhCd_WH_NAME = null;

	// æ 193 ÏúlF i_chkisWhCd_IN_WHCD


	final static String i_chkisWhCd_IN_WHCD = null;

	// æ 194 ÏúlF i_chkisWhCd_IN_WHTYP


	final static String i_chkisWhCd_IN_WHTYP = null;

	// æ 195 ÏúlF i_creTsales_SHIP_ODR_NO


	final static String i_creTsales_SHIP_ODR_NO = null;

	// æ 196 ÏúlF i_creTsales_SLIP_CD


	final static String i_creTsales_SLIP_CD = null;

	// æ 197 ÏúlF i_creTsales_SALES_TYP


	final static String i_creTsales_SALES_TYP = null;

	// æ 198 ÏúlF i_creTsales_CUST_CD


	final static String i_creTsales_CUST_CD = null;

	// æ 199 ÏúlF i_creTsales_ITEM_CD


	final static String i_creTsales_ITEM_CD = null;

	// æ 200 ÏúlF i_creTsales_ITEM_NAME


	final static String i_creTsales_ITEM_NAME = null;

	// æ 201 ÏúlF i_creTsales_CUST_ODR_NO


	final static String i_creTsales_CUST_ODR_NO = null;

	// æ 202 ÏúlF i_creTsales_SALES_DATE


	final static String i_creTsales_SALES_DATE = null;

	// æ 203 ÏúlF i_creTsales_SALES_DEPT_CD


	final static String i_creTsales_SALES_DEPT_CD = null;

	// æ 204 ÏúlF i_creTsales_CUST_CHRG_PSN_CD


	final static String i_creTsales_CUST_CHRG_PSN_CD = null;

	// æ 205 ÏúlF i_creTsales_ODR_ACPT_PSN_CD


	final static String i_creTsales_ODR_ACPT_PSN_CD = null;

	// æ 206 ÏúlF i_creTsales_SALES_QTY


	final static String i_creTsales_SALES_QTY = null;

	// æ 207 ÏúlF i_creTsales_SALES_UNIT_PRICE


	final static String i_creTsales_SALES_UNIT_PRICE = null;

	// æ 208 ÏúlF i_creTsales_UNIT_CD


	final static String i_creTsales_UNIT_CD = null;

	// æ 209 ÏúlF i_creTsales_SALES_AMOUNT


	final static String i_creTsales_SALES_AMOUNT = null;

	// æ 210 ÏúlF i_creTsales_SALES_AMOUNT_EXCH_RATES


	final static String i_creTsales_SALES_AMOUNT_EXCH_RATES = null;

	// æ 211 ÏúlF i_creTsales_INSPC_ACPT_DATE


	final static String i_creTsales_INSPC_ACPT_DATE = null;

	// æ 212 ÏúlF i_creTsales_INSPC_ACPT_QTY


	final static String i_creTsales_INSPC_ACPT_QTY = null;

	// æ 213 ÏúlF i_creTsales_EXTERNAL_TAX_SALES_AMOUNT


	final static String i_creTsales_EXTERNAL_TAX_SALES_AMOUNT = null;

	// æ 214 ÏúlF i_creTsales_INTERNAL_TAX_SALES_AMOUNT


	final static String i_creTsales_INTERNAL_TAX_SALES_AMOUNT = null;

	// æ 215 ÏúlF i_creTsales_TAXFREE_SALES_AMOUNT


	final static String i_creTsales_TAXFREE_SALES_AMOUNT = null;

	// æ 216 ÏúlF i_creTsales_TAX_CREDIT_SALES_AMOUNT


	final static String i_creTsales_TAX_CREDIT_SALES_AMOUNT = null;

	// æ 217 ÏúlF i_creTsales_EXTERNAL_TAX_AMOUNT


	final static String i_creTsales_EXTERNAL_TAX_AMOUNT = null;

	// æ 218 ÏúlF i_creTsales_INTERNAL_TAX_AMOUNT


	final static String i_creTsales_INTERNAL_TAX_AMOUNT = null;

	// æ 219 ÏúlF i_creTsales_TAX_AMOUNT_1


	final static String i_creTsales_TAX_AMOUNT_1 = null;

	// æ 220 ÏúlF i_creTsales_TAX_AMOUNT_2


	final static String i_creTsales_TAX_AMOUNT_2 = null;

	// æ 221 ÏúlF i_creTsales_TAX_AMOUNT_3


	final static String i_creTsales_TAX_AMOUNT_3 = null;

	// æ 222 ÏúlF i_creTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT


	final static String i_creTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;

	// æ 223 ÏúlF i_creTsales_ORG_SLIP_CD


	final static String i_creTsales_ORG_SLIP_CD = null;

	// æ 224 ÏúlF i_creTsales_CURRNCY_CD


	final static String i_creTsales_CURRNCY_CD = null;

	// æ 225 ÏúlF i_creTsales_SPCL_PRICE_CO


	final static String i_creTsales_SPCL_PRICE_CO = null;

	// æ 226 ÏúlF i_creTsales_REMARKS


	final static String i_creTsales_REMARKS = null;

	// æ 227 ÏúlF i_creTsales_DEL_FLG


	final static String i_creTsales_DEL_FLG = null;

	// æ 228 ÏúlF i_creTsales_INSPC_ACPT_TYP


	final static String i_creTsales_INSPC_ACPT_TYP = null;

	// æ 229 ÏúlF i_creTsales_STATUS


	final static String i_creTsales_STATUS = null;

	// æ 230 ÏúlF i_creTsales_APPR_FLG


	final static String i_creTsales_APPR_FLG = null;

	// æ 231 ÏúlF i_creTsales_APPR_ID


	final static String i_creTsales_APPR_ID = null;

	// æ 232 ÏúlF i_creTsales_APPR_DATE


	final static String i_creTsales_APPR_DATE = null;

	// æ 233 ÏúlF i_creTsales_EXCH_RATE


	final static String i_creTsales_EXCH_RATE = null;

	// æ 234 ÏúlF i_serTsales_SALES_SEQ_NO


	final static String i_serTsales_SALES_SEQ_NO = null;

	// æ 235 ÏúlF i_serTsales_SLIP_CD


	final static String i_serTsales_SLIP_CD = null;

	// æ 236 ÏúlF i_serTsales_SALES_TYP


	final static String i_serTsales_SALES_TYP = null;

	// æ 237 ÏúlF i_serTsales_CUST_CD


	final static String i_serTsales_CUST_CD = null;

	// æ 238 ÏúlF i_serTsales_ITEM_CD


	final static String i_serTsales_ITEM_CD = null;

	// æ 239 ÏúlF i_serTsales_ITEM_NAME


	final static String i_serTsales_ITEM_NAME = null;

	// æ 240 ÏúlF i_serTsales_CUST_ODR_NO


	final static String i_serTsales_CUST_ODR_NO = null;

	// æ 241 ÏúlF i_serTsales_SALES_DATE


	final static String i_serTsales_SALES_DATE = null;

	// æ 242 ÏúlF i_serTsales_SALES_DEPT_CD


	final static String i_serTsales_SALES_DEPT_CD = null;

	// æ 243 ÏúlF i_serTsales_CUST_CHRG_PSN_CD


	final static String i_serTsales_CUST_CHRG_PSN_CD = null;

	// æ 244 ÏúlF i_serTsales_ODR_ACPT_PSN_CD


	final static String i_serTsales_ODR_ACPT_PSN_CD = null;

	// æ 245 ÏúlF i_serTsales_SALES_QTY


	final static String i_serTsales_SALES_QTY = null;

	// æ 246 ÏúlF i_serTsales_SALES_UNIT_PRICE


	final static String i_serTsales_SALES_UNIT_PRICE = null;

	// æ 247 ÏúlF i_serTsales_UNIT_CD


	final static String i_serTsales_UNIT_CD = null;

	// æ 248 ÏúlF i_serTsales_SALES_AMOUNT


	final static String i_serTsales_SALES_AMOUNT = null;

	// æ 249 ÏúlF i_serTsales_SALES_AMOUNT_EXCH_RATES


	final static String i_serTsales_SALES_AMOUNT_EXCH_RATES = null;

	// æ 250 ÏúlF i_serTsales_EXTERNAL_TAX_SALES_AMOUNT


	final static String i_serTsales_EXTERNAL_TAX_SALES_AMOUNT = null;

	// æ 251 ÏúlF i_serTsales_INTERNAL_TAX_SALES_AMOUNT


	final static String i_serTsales_INTERNAL_TAX_SALES_AMOUNT = null;

	// æ 252 ÏúlF i_serTsales_TAXFREE_SALES_AMOUNT


	final static String i_serTsales_TAXFREE_SALES_AMOUNT = null;

	// æ 253 ÏúlF i_serTsales_TAX_CREDIT_SALES_AMOUNT


	final static String i_serTsales_TAX_CREDIT_SALES_AMOUNT = null;

	// æ 254 ÏúlF i_serTsales_EXTERNAL_TAX_AMOUNT


	final static String i_serTsales_EXTERNAL_TAX_AMOUNT = null;

	// æ 255 ÏúlF i_serTsales_INTERNAL_TAX_AMOUNT


	final static String i_serTsales_INTERNAL_TAX_AMOUNT = null;

	// æ 256 ÏúlF i_serTsales_TAX_AMOUNT_1


	final static String i_serTsales_TAX_AMOUNT_1 = null;

	// æ 257 ÏúlF i_serTsales_TAX_AMOUNT_2


	final static String i_serTsales_TAX_AMOUNT_2 = null;

	// æ 258 ÏúlF i_serTsales_TAX_AMOUNT_3


	final static String i_serTsales_TAX_AMOUNT_3 = null;

	// æ 259 ÏúlF i_serTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT


	final static String i_serTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;

	// æ 260 ÏúlF i_serTsales_ORG_SLIP_CD


	final static String i_serTsales_ORG_SLIP_CD = null;

	// æ 261 ÏúlF i_serTsales_CURRNCY_CD


	final static String i_serTsales_CURRNCY_CD = null;

	// æ 262 ÏúlF i_serTsales_SPCL_PRICE_CO


	final static String i_serTsales_SPCL_PRICE_CO = null;

	// æ 263 ÏúlF i_serTsales_REMARKS


	final static String i_serTsales_REMARKS = null;

	// æ 264 ÏúlF i_serTsales_DEL_FLG


	final static String i_serTsales_DEL_FLG = null;

	// æ 265 ÏúlF i_serTsales_INSPC_ACPT_TYP


	final static String i_serTsales_INSPC_ACPT_TYP = null;

	// æ 266 ÏúlF i_serTsales_STATUS


	final static String i_serTsales_STATUS = null;

	// æ 267 ÏúlF i_serTsales_PRD_ODR_PLACE_CD


	final static String i_serTsales_PRD_ODR_PLACE_CD = null;

	// æ 268 ÏúlF i_serTsales_EXCH_RATE


	final static String i_serTsales_EXCH_RATE = null;

	// æ 269 ÏúlF i_serTsales_IN_SLIPCD


	final static String i_serTsales_IN_SLIPCD = null;

	// æ 270 ÏúlF i_updTsales_APPR_FLG


	final static String i_updTsales_APPR_FLG = null;

	// æ 271 ÏúlF i_updTsales_APPR_ID


	final static String i_updTsales_APPR_ID = null;

	// æ 272 ÏúlF i_updTsales_APPR_DATE


	final static String i_updTsales_APPR_DATE = null;

	// æ 273 ÏúlF i_updTsales_SALES_SEQ_NO


	final static String i_updTsales_SALES_SEQ_NO = null;

	// æ 274 ÏúlF i_mItem_ITEM_CD


	final static String i_mItem_ITEM_CD = null;

	// æ 275 ÏúlF i_mItem_ITEM_NAME


	final static String i_mItem_ITEM_NAME = null;

	// æ 276 ÏúlF i_mItem_PRODUCT_TYP


	final static String i_mItem_PRODUCT_TYP = null;

	// æ 277 ÏúlF i_mItem_MRP_ODR_TYP


	final static String i_mItem_MRP_ODR_TYP = null;

	// æ 278 ÏúlF i_mItem_DRAW_CD


	final static String i_mItem_DRAW_CD = null;

	// æ 279 ÏúlF i_mItem_SPEC


	final static String i_mItem_SPEC = null;

	// æ 280 ÏúlF i_mItem_HIGH_LEVEL_NO


	final static String i_mItem_HIGH_LEVEL_NO = null;

	// æ 281 ÏúlF i_mItem_OUTSIDE_TYP


	final static String i_mItem_OUTSIDE_TYP = null;

	// æ 282 ÏúlF i_mItem_STOCK_UNIT_FLG


	final static String i_mItem_STOCK_UNIT_FLG = null;

	// æ 283 ÏúlF i_mItem_STOCK_UNIT


	final static String i_mItem_STOCK_UNIT = null;

	// æ 284 ÏúlF i_mItem_PKG_UNIT


	final static String i_mItem_PKG_UNIT = null;

	// æ 285 ÏúlF i_mItem_PKG_UNIT_QTY


	final static String i_mItem_PKG_UNIT_QTY = null;

	// æ 286 ÏúlF i_mItem_UNIT_QTY_TYP


	final static String i_mItem_UNIT_QTY_TYP = null;

	// æ 287 ÏúlF i_mItem_ODR_LT


	final static String i_mItem_ODR_LT = null;

	// æ 288 ÏúlF i_mItem_FIXED_LT


	final static String i_mItem_FIXED_LT = null;

	// æ 289 ÏúlF i_mItem_PROP_LT


	final static String i_mItem_PROP_LT = null;

	// æ 290 ÏúlF i_mItem_SAFETY_LT


	final static String i_mItem_SAFETY_LT = null;

	// æ 291 ÏúlF i_mItem_ISSUE_LT


	final static String i_mItem_ISSUE_LT = null;

	// æ 292 ÏúlF i_mItem_PROP_LOT_SIZE


	final static String i_mItem_PROP_LOT_SIZE = null;

	// æ 293 ÏúlF i_mItem_ITEM_SPOIL


	final static String i_mItem_ITEM_SPOIL = null;

	// æ 294 ÏúlF i_mItem_SAFETY_STOCK


	final static String i_mItem_SAFETY_STOCK = null;

	// æ 295 ÏúlF i_mItem_LOT_SIZING_TYP


	final static String i_mItem_LOT_SIZING_TYP = null;

	// æ 296 ÏúlF i_mItem_MAX_PERIOD


	final static String i_mItem_MAX_PERIOD = null;

	// æ 297 ÏúlF i_mItem_MAX_ODR_QTY


	final static String i_mItem_MAX_ODR_QTY = null;

	// æ 298 ÏúlF i_mItem_ODR_POINT


	final static String i_mItem_ODR_POINT = null;

	// æ 299 ÏúlF i_mItem_FIXED_ODR_QTY


	final static String i_mItem_FIXED_ODR_QTY = null;

	// æ 300 ÏúlF i_mItem_MIN_ODR_QTY


	final static String i_mItem_MIN_ODR_QTY = null;

	// æ 301 ÏúlF i_mItem_MUL_ODR_QTY


	final static String i_mItem_MUL_ODR_QTY = null;

	// æ 302 ÏúlF i_mItem_ISSUE_TYP


	final static String i_mItem_ISSUE_TYP = null;

	// æ 303 ÏúlF i_mItem_MPS_FLG


	final static String i_mItem_MPS_FLG = null;

	// æ 304 ÏúlF i_mItem_ACPT_INSPC_TYP


	final static String i_mItem_ACPT_INSPC_TYP = null;

	// æ 305 ÏúlF i_mItem_CLASIFICATION_CD


	final static String i_mItem_CLASIFICATION_CD = null;

	// æ 306 ÏúlF i_mItem_UNIT_WEIGHT


	final static String i_mItem_UNIT_WEIGHT = null;

	// æ 307 ÏúlF i_mItem_ABC_TYP


	final static String i_mItem_ABC_TYP = null;

	// æ 308 ÏúlF i_mItem_OPR_RSLT_TYP


	final static String i_mItem_OPR_RSLT_TYP = null;

	// æ 309 ÏúlF i_mItem_SPL_ITEM_TYP


	final static String i_mItem_SPL_ITEM_TYP = null;

	// æ 310 ÏúlF i_mItem_TAX_CD


	final static String i_mItem_TAX_CD = null;

	// æ 311 ÏúlF i_mItem_IN_ITEMCD


	final static String i_mItem_IN_ITEMCD = null;

	// æ 312 ÏúlF i_mItemSpec_CUST_CD


	final static String i_mItemSpec_CUST_CD = null;

	// æ 313 ÏúlF i_mItemSpec_CUST_ITEM_CD


	final static String i_mItemSpec_CUST_ITEM_CD = null;

	// æ 314 ÏúlF i_mItemSpec_COMPANY_CD


	final static String i_mItemSpec_COMPANY_CD = null;

	// æ 315 ÏúlF i_mItemSpec_SALES_DEPT_CD


	final static String i_mItemSpec_SALES_DEPT_CD = null;

	// æ 316 ÏúlF i_mItemSpec_CUST_ITEM_NAME


	final static String i_mItemSpec_CUST_ITEM_NAME = null;

	// æ 317 ÏúlF i_mItemSpec_IN_CUST_CD


	final static String i_mItemSpec_IN_CUST_CD = null;

	// æ 318 ÏúlF i_mItemSpec_IN_CUST_ITEM_CD


	final static String i_mItemSpec_IN_CUST_ITEM_CD = null;

	// æ 319 ÏúlF i_mItemSpec_IN_COMPANY_CD


	final static String i_mItemSpec_IN_COMPANY_CD = null;

	// æ 320 ÏúlF i_tOdr_ODR_NO


	final static String i_tOdr_ODR_NO = null;

	// æ 321 ÏúlF i_tOdr_ODR_TYP


	final static String i_tOdr_ODR_TYP = null;

	// æ 322 ÏúlF i_tOdr_ODR_CTL_NO


	final static String i_tOdr_ODR_CTL_NO = null;

	// æ 323 ÏúlF i_tOdr_CUST_ODR_NO


	final static String i_tOdr_CUST_ODR_NO = null;

	// æ 324 ÏúlF i_tOdr_CUST_CHRG_ORG_CD


	final static String i_tOdr_CUST_CHRG_ORG_CD = null;

	// æ 325 ÏúlF i_tOdr_CUST_CHRG_PSN_CD


	final static String i_tOdr_CUST_CHRG_PSN_CD = null;

	// æ 326 ÏúlF i_tOdr_ODR_ACPT_ORG_CD


	final static String i_tOdr_ODR_ACPT_ORG_CD = null;

	// æ 327 ÏúlF i_tOdr_ODR_ACPT_PSN_CD


	final static String i_tOdr_ODR_ACPT_PSN_CD = null;

	// æ 328 ÏúlF i_tOdr_CURRNCY_CD


	final static String i_tOdr_CURRNCY_CD = null;

	// æ 329 ÏúlF i_tOdr_EXCH_TYP


	final static String i_tOdr_EXCH_TYP = null;

	// æ 330 ÏúlF i_tOdr_DLV_LOC_CD


	final static String i_tOdr_DLV_LOC_CD = null;

	// æ 331 ÏúlF i_tOdr_DLV_LOC_CD_EIAJ


	final static String i_tOdr_DLV_LOC_CD_EIAJ = null;

	// æ 332 ÏúlF i_tOdr_DLV_LOC_NAME


	final static String i_tOdr_DLV_LOC_NAME = null;

	// æ 333 ÏúlF i_tOdr_DLV_LOC_NAME_KANJI


	final static String i_tOdr_DLV_LOC_NAME_KANJI = null;

	// æ 334 ÏúlF i_tOdr_PRD_ODR_PLACE_CD


	final static String i_tOdr_PRD_ODR_PLACE_CD = null;

	// æ 335 ÏúlF i_tOdr_ODR_UNIT_PRICE


	final static String i_tOdr_ODR_UNIT_PRICE = null;

	// æ 336 ÏúlF i_tOdr_SPCL_PRICE_TYP


	final static String i_tOdr_SPCL_PRICE_TYP = null;

	// æ 337 ÏúlF i_tOdr_PART_DLV_COUNT


	final static String i_tOdr_PART_DLV_COUNT = null;

	// æ 338 ÏúlF i_tOdr_DEPO_TYP


	final static String i_tOdr_DEPO_TYP = null;

	// æ 339 ÏúlF i_tOdr_DESINATED_DLV_DATE


	final static String i_tOdr_DESINATED_DLV_DATE = null;

	// æ 340 ÏúlF i_tOdr_STD_DESINATED_RCV_DATE


	final static String i_tOdr_STD_DESINATED_RCV_DATE = null;

	// æ 341 ÏúlF i_tOdr_ODR_QTY


	final static String i_tOdr_ODR_QTY = null;

	// æ 342 ÏúlF i_tOdr_REMAIN_UNCONFIRM_ODR_QTY


	final static String i_tOdr_REMAIN_UNCONFIRM_ODR_QTY = null;

	// æ 343 ÏúlF i_tOdr_CANCELED_UNCONFIRM_ODR_QTY


	final static String i_tOdr_CANCELED_UNCONFIRM_ODR_QTY = null;

	// æ 344 ÏúlF i_tOdr_UNIT_CD


	final static String i_tOdr_UNIT_CD = null;

	// æ 345 ÏúlF i_tOdr_UNCONFIRM_ODR_BALANCE


	final static String i_tOdr_UNCONFIRM_ODR_BALANCE = null;

	// æ 346 ÏúlF i_tOdr_ODR_AMOUNT


	final static String i_tOdr_ODR_AMOUNT = null;

	// æ 347 ÏúlF i_tOdr_ODR_AMOUNT_EXCH_RATES


	final static String i_tOdr_ODR_AMOUNT_EXCH_RATES = null;

	// æ 348 ÏúlF i_tOdr_TOTAL_SHIP_QTY


	final static String i_tOdr_TOTAL_SHIP_QTY = null;

	// æ 349 ÏúlF i_tOdr_SHIP_AMOUNT


	final static String i_tOdr_SHIP_AMOUNT = null;

	// æ 350 ÏúlF i_tOdr_SHIP_AMOUNT_EXCH_RATES


	final static String i_tOdr_SHIP_AMOUNT_EXCH_RATES = null;

	// æ 351 ÏúlF i_tOdr_RETURN_PRICE


	final static String i_tOdr_RETURN_PRICE = null;

	// æ 352 ÏúlF i_tOdr_RETURN_QTY


	final static String i_tOdr_RETURN_QTY = null;

	// æ 353 ÏúlF i_tOdr_RETURN_AMOUNT


	final static String i_tOdr_RETURN_AMOUNT = null;

	// æ 354 ÏúlF i_tOdr_RETURN_AMOUNT_EXCH_RATES


	final static String i_tOdr_RETURN_AMOUNT_EXCH_RATES = null;

	// æ 355 ÏúlF i_tOdr_ODR_CMPLT_FLG


	final static String i_tOdr_ODR_CMPLT_FLG = null;

	// æ 356 ÏúlF i_tOdr_ODR_CMPLT_DATE


	final static String i_tOdr_ODR_CMPLT_DATE = null;

	// æ 357 ÏúlF i_tOdr_CUS_DLV_CD


	final static String i_tOdr_CUS_DLV_CD = null;

	// æ 358 ÏúlF i_tOdr_DLV_KEY_NO


	final static String i_tOdr_DLV_KEY_NO = null;

	// æ 359 ÏúlF i_tOdr_PART_NAME


	final static String i_tOdr_PART_NAME = null;

	// æ 360 ÏúlF i_tOdr_PKG_UNIT


	final static String i_tOdr_PKG_UNIT = null;

	// æ 361 ÏúlF i_tOdr_SLIP_PRICE_PRINT_TYP


	final static String i_tOdr_SLIP_PRICE_PRINT_TYP = null;

	// æ 362 ÏúlF i_tOdr_INSPC_TYP


	final static String i_tOdr_INSPC_TYP = null;

	// æ 363 ÏúlF i_tOdr_CLIENT_REMARK


	final static String i_tOdr_CLIENT_REMARK = null;

	// æ 364 ÏúlF i_tOdr_CLIENT_REMARK_KANJI


	final static String i_tOdr_CLIENT_REMARK_KANJI = null;

	// æ 365 ÏúlF i_tOdr_CLIENT_BARCODE_INF


	final static String i_tOdr_CLIENT_BARCODE_INF = null;

	// æ 366 ÏúlF i_tOdr_TRANSPORT_CD


	final static String i_tOdr_TRANSPORT_CD = null;

	// æ 367 ÏúlF i_tOdr_TRANSPORT_TYP


	final static String i_tOdr_TRANSPORT_TYP = null;

	// æ 368 ÏúlF i_tOdr_TAX_APPLY_TYP


	final static String i_tOdr_TAX_APPLY_TYP = null;

	// æ 369 ÏúlF i_tOdr_TAX_CD


	final static String i_tOdr_TAX_CD = null;

	// æ 370 ÏúlF i_tOdr_TAX_CALC_TYP


	final static String i_tOdr_TAX_CALC_TYP = null;

	// æ 371 ÏúlF i_tOdr_REMARKS


	final static String i_tOdr_REMARKS = null;

	// æ 372 ÏúlF i_tOdr_ODR_ACPT_DATE


	final static String i_tOdr_ODR_ACPT_DATE = null;

	// æ 373 ÏúlF i_tOdr_SHIP_PLAN_REMAIN_QTY


	final static String i_tOdr_SHIP_PLAN_REMAIN_QTY = null;

	// æ 374 ÏúlF i_tOdr_SHIP_PLAN_CMPLT_FLG


	final static String i_tOdr_SHIP_PLAN_CMPLT_FLG = null;

	// æ 375 ÏúlF i_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG


	final static String i_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG = null;

	// æ 376 ÏúlF i_tOdr_PARTIAL_SHIP_INST_FLG


	final static String i_tOdr_PARTIAL_SHIP_INST_FLG = null;

	// æ 377 ÏúlF i_tOdr_IF_CTL_NO


	final static String i_tOdr_IF_CTL_NO = null;

	// æ 378 ÏúlF i_tOdr_ENTRY_TYP


	final static String i_tOdr_ENTRY_TYP = null;

	// æ 379 ÏúlF i_tOdr_DEL_FLG


	final static String i_tOdr_DEL_FLG = null;

	// æ 380 ÏúlF i_tOdr_SHIP_CNT


	final static String i_tOdr_SHIP_CNT = null;

	// æ 381 ÏúlF i_tOdr_UNIT_CD_ORG


	final static String i_tOdr_UNIT_CD_ORG = null;

	// æ 382 ÏúlF i_tOdrCtl_CUST_ITEM_CD


	final static String i_tOdrCtl_CUST_ITEM_CD = null;

	// æ 383 ÏúlF i_tOdr_COCK_TYP


	final static String i_tOdr_COCK_TYP = null;

	// æ 384 ÏúlF i_tOdr_PUCH_ODR_QTY_TOTAL


	final static String i_tOdr_PUCH_ODR_QTY_TOTAL = null;

	// æ 385 ÏúlF i_tOdr_BUYER_ORG_CD


	final static String i_tOdr_BUYER_ORG_CD = null;

	// æ 386 ÏúlF i_tOdr_BUYER_NAME


	final static String i_tOdr_BUYER_NAME = null;

	// æ 387 ÏúlF i_tOdr_IN_ODRNO


	final static String i_tOdr_IN_ODRNO = null;

	// æ 388 ÏúlF i_creTodrODR_NO


	final static String i_creTodrODR_NO = null;

	// æ 389 ÏúlF i_creTodrODR_TYP


	final static String i_creTodrODR_TYP = null;

	// æ 390 ÏúlF i_creTodrODR_CTL_NO


	final static String i_creTodrODR_CTL_NO = null;

	// æ 391 ÏúlF i_creTodrCUST_ODR_NO


	final static String i_creTodrCUST_ODR_NO = null;

	// æ 392 ÏúlF i_creTodrCUST_CHRG_ORG_CD


	final static String i_creTodrCUST_CHRG_ORG_CD = null;

	// æ 393 ÏúlF i_creTodrCUST_CHRG_PSN_CD


	final static String i_creTodrCUST_CHRG_PSN_CD = null;

	// æ 394 ÏúlF i_creTodrODR_ACPT_ORG_CD


	final static String i_creTodrODR_ACPT_ORG_CD = null;

	// æ 395 ÏúlF i_creTodrODR_ACPT_PSN_CD


	final static String i_creTodrODR_ACPT_PSN_CD = null;

	// æ 396 ÏúlF i_creTodrCURRNCY_CD


	final static String i_creTodrCURRNCY_CD = null;

	// æ 397 ÏúlF i_creTodrEXCH_TYP


	final static String i_creTodrEXCH_TYP = null;

	// æ 398 ÏúlF i_creTodrDLV_LOC_CD


	final static String i_creTodrDLV_LOC_CD = null;

	// æ 399 ÏúlF i_creTodrDLV_LOC_NAME


	final static String i_creTodrDLV_LOC_NAME = null;

	// æ 400 ÏúlF i_creTodrDLV_LOC_NAME_KANJI


	final static String i_creTodrDLV_LOC_NAME_KANJI = null;

	// æ 401 ÏúlF i_creTodrPRD_ODR_PLACE_CD


	final static String i_creTodrPRD_ODR_PLACE_CD = null;

	// æ 402 ÏúlF i_creTodrODR_UNIT_PRICE


	final static String i_creTodrODR_UNIT_PRICE = null;

	// æ 403 ÏúlF i_creTodrPART_DLV_COUNT


	final static String i_creTodrPART_DLV_COUNT = null;

	// æ 404 ÏúlF i_creTodrDEPO_TYP


	final static String i_creTodrDEPO_TYP = null;

	// æ 405 ÏúlF i_creTodrDESINATED_DLV_DATE


	final static String i_creTodrDESINATED_DLV_DATE = null;

	// æ 406 ÏúlF i_creTodrODR_QTY


	final static String i_creTodrODR_QTY = null;

	// æ 407 ÏúlF i_creTodrREMAIN_UNCONFIRM_ODR_QTY


	final static String i_creTodrREMAIN_UNCONFIRM_ODR_QTY = null;

	// æ 408 ÏúlF i_creTodrCANCELED_UNCONFIRM_ODR_QTY


	final static String i_creTodrCANCELED_UNCONFIRM_ODR_QTY = null;

	// æ 409 ÏúlF i_creTodrUNIT_CD


	final static String i_creTodrUNIT_CD = null;

	// æ 410 ÏúlF i_creTodrUNCONFIRM_ODR_BALANCE


	final static String i_creTodrUNCONFIRM_ODR_BALANCE = null;

	// æ 411 ÏúlF i_creTodrODR_AMOUNT


	final static String i_creTodrODR_AMOUNT = null;

	// æ 412 ÏúlF i_creTodrODR_AMOUNT_EXCH_RATES


	final static String i_creTodrODR_AMOUNT_EXCH_RATES = null;

	// æ 413 ÏúlF i_creTodrTOTAL_SHIP_QTY


	final static String i_creTodrTOTAL_SHIP_QTY = null;

	// æ 414 ÏúlF i_creTodrSHIP_AMOUNT


	final static String i_creTodrSHIP_AMOUNT = null;

	// æ 415 ÏúlF i_creTodrSHIP_AMOUNT_EXCH_RATES


	final static String i_creTodrSHIP_AMOUNT_EXCH_RATES = null;

	// æ 416 ÏúlF i_creTodrODR_CMPLT_FLG


	final static String i_creTodrODR_CMPLT_FLG = null;

	// æ 417 ÏúlF i_creTodrODR_CMPLT_DATE


	final static String i_creTodrODR_CMPLT_DATE = null;

	// æ 418 ÏúlF i_creTodrREMARKS


	final static String i_creTodrREMARKS = null;

	// æ 419 ÏúlF i_creTodrODR_ACPT_DATE


	final static String i_creTodrODR_ACPT_DATE = null;

	// æ 420 ÏúlF i_creTodrSHIP_PLAN_REMAIN_QTY


	final static String i_creTodrSHIP_PLAN_REMAIN_QTY = null;

	// æ 421 ÏúlF i_creTodrSHIP_PLAN_CMPLT_FLG


	final static String i_creTodrSHIP_PLAN_CMPLT_FLG = null;

	// æ 422 ÏúlF i_creTodrUNCONFIRMED_ODR_EFF_OVR_FLG


	final static String i_creTodrUNCONFIRMED_ODR_EFF_OVR_FLG = null;

	// æ 423 ÏúlF i_creTodrPARTIAL_SHIP_INST_FLG


	final static String i_creTodrPARTIAL_SHIP_INST_FLG = null;

	// æ 424 ÏúlF i_creTodrENTRY_TYP


	final static String i_creTodrENTRY_TYP = null;

	// æ 425 ÏúlF i_creTodrDEL_FLG


	final static String i_creTodrDEL_FLG = null;

	// æ 426 ÏúlF i_upTodr_TOTAL_SHIP_QTY


	final static String i_upTodr_TOTAL_SHIP_QTY = null;

	// æ 427 ÏúlF i_upTodr_SHIP_AMOUNT


	final static String i_upTodr_SHIP_AMOUNT = null;

	// æ 428 ÏúlF i_upTodr_SHIP_AMOUNT_EXCH_RATES


	final static String i_upTodr_SHIP_AMOUNT_EXCH_RATES = null;

	// æ 429 ÏúlF i_upTodr_ODR_CMPLT_FLG


	final static String i_upTodr_ODR_CMPLT_FLG = null;

	// æ 430 ÏúlF i_upTodr_ODR_CMPLT_DATE


	final static String i_upTodr_ODR_CMPLT_DATE = null;

	// æ 431 ÏúlF i_upTodr_IN_ODRNO


	final static String i_upTodr_IN_ODRNO = null;

	// æ 432 ÏúlF i_creTrcvIssue_RCV_ISSUE_CTRL_CD


	final static String i_creTrcvIssue_RCV_ISSUE_CTRL_CD = null;

	// æ 433 ÏúlF i_creTrcvIssue_RCV_ISSUE_TYP


	final static String i_creTrcvIssue_RCV_ISSUE_TYP = null;

	// æ 434 ÏúlF i_creTrcvIssue_ITEM_CD


	final static String i_creTrcvIssue_ITEM_CD = null;

	// æ 435 ÏúlF i_creTrcvIssue_JOB_ODR_CD


	final static String i_creTrcvIssue_JOB_ODR_CD = null;

	// æ 436 ÏúlF i_creTrcvIssue_PLANT_CD


	final static String i_creTrcvIssue_PLANT_CD = null;

	// æ 437 ÏúlF i_creTrcvIssue_WH_CD


	final static String i_creTrcvIssue_WH_CD = null;

	// æ 438 ÏúlF i_creTrcvIssue_RCV_ISSUE_BEFORE_QTY


	final static String i_creTrcvIssue_RCV_ISSUE_BEFORE_QTY = null;

	// æ 439 ÏúlF i_creTrcvIssue_RCV_ISSUE_QTY


	final static String i_creTrcvIssue_RCV_ISSUE_QTY = null;

	// æ 440 ÏúlF i_creTrcvIssue_RCV_ISSUE_AFTER_QTY


	final static String i_creTrcvIssue_RCV_ISSUE_AFTER_QTY = null;

	// æ 441 ÏúlF i_creTrcvIssue_RCV_ISSUE_AMOUNT


	final static String i_creTrcvIssue_RCV_ISSUE_AMOUNT = null;

	// æ 442 ÏúlF i_creTrcvIssue_RCV_ISSUE_DATE


	final static String i_creTrcvIssue_RCV_ISSUE_DATE = null;

	// æ 443 ÏúlF i_creTrcvIssue_RCV_ISSUE_GNR_TYP


	final static String i_creTrcvIssue_RCV_ISSUE_GNR_TYP = null;

	// æ 444 ÏúlF i_creTrcvIssue_STOCK_UPD_TYP


	final static String i_creTrcvIssue_STOCK_UPD_TYP = null;

	// æ 445 ÏúlF i_creTrcvIssue_RCV_ISSUE_CMPLT_FLG


	final static String i_creTrcvIssue_RCV_ISSUE_CMPLT_FLG = null;

	// æ 446 ÏúlF i_creTrcvIssue_RCV_ISSUE_COMMENT


	final static String i_creTrcvIssue_RCV_ISSUE_COMMENT = null;

	// æ 447 ÏúlF i_creTrcvIssue_LOT_NO


	final static String i_creTrcvIssue_LOT_NO = null;

	// æ 448 ÏúlF i_creTrcvIssue_SHIP_ODR_NO


	final static String i_creTrcvIssue_SHIP_ODR_NO = null;

	// æ 449 ÏúlF i_upTitemStock_STOCK_ON_HAND_QTY


	final static String i_upTitemStock_STOCK_ON_HAND_QTY = null;

	// æ 450 ÏúlF i_upTitemStock_IN_ITEMCD


	final static String i_upTitemStock_IN_ITEMCD = null;

	// æ 451 ÏúlF i_upTitemStock_IN_WHCD


	final static String i_upTitemStock_IN_WHCD = null;

	// æ 452 ÏúlF i_serTitemStock_ITEM_CD


	final static String i_serTitemStock_ITEM_CD = null;

	// æ 453 ÏúlF i_serTitemStock_WH_CD


	final static String i_serTitemStock_WH_CD = null;

	// æ 454 ÏúlF i_serTitemStock_PLANT_CD


	final static String i_serTitemStock_PLANT_CD = null;

	// æ 455 ÏúlF i_serTitemStock_STOCK_ON_HAND_QTY


	final static String i_serTitemStock_STOCK_ON_HAND_QTY = null;

	// æ 456 ÏúlF i_serTitemStock_DEFECT_QTY


	final static String i_serTitemStock_DEFECT_QTY = null;

	// æ 457 ÏúlF i_serTitemStock_PRVS_DAYEND_STOCK_QTY


	final static String i_serTitemStock_PRVS_DAYEND_STOCK_QTY = null;

	// æ 458 ÏúlF i_serTitemStock_PRVS_MONTHEND_STOCK_QTY


	final static String i_serTitemStock_PRVS_MONTHEND_STOCK_QTY = null;

	// æ 459 ÏúlF i_serTitemStock_PRVS_TERMEND_STOCK_QTY


	final static String i_serTitemStock_PRVS_TERMEND_STOCK_QTY = null;

	// æ 460 ÏúlF i_serTitemStock_IN_ITEMCD


	final static String i_serTitemStock_IN_ITEMCD = null;

	// æ 461 ÏúlF i_serTitemStock_IN_WHCD


	final static String i_serTitemStock_IN_WHCD = null;

	// æ 462 ÏúlF i_creTitemStock_WH_CD


	final static String i_creTitemStock_WH_CD = null;

	// æ 463 ÏúlF i_creTitemStock_ITEM_CD


	final static String i_creTitemStock_ITEM_CD = null;

	// æ 464 ÏúlF i_creTitemStock_PLANT_CD


	final static String i_creTitemStock_PLANT_CD = null;

	// æ 465 ÏúlF i_creTitemStock_STOCK_ON_HAND_QTY


	final static String i_creTitemStock_STOCK_ON_HAND_QTY = null;

	// æ 466 ÏúlF i_mCust_COMPANY_CD


	final static String i_mCust_COMPANY_CD = null;

	// æ 467 ÏúlF i_mCust_CUST_CD


	final static String i_mCust_CUST_CD = null;

	// æ 468 ÏúlF i_mCust_CUST_NAME


	final static String i_mCust_CUST_NAME = null;

	// æ 469 ÏúlF i_mCust_DETAIL_ROUND_TYP


	final static String i_mCust_DETAIL_ROUND_TYP = null;

	// æ 470 ÏúlF i_mCust_INSPC_ACPT_TYP


	final static String i_mCust_INSPC_ACPT_TYP = null;

	// æ 471 ÏúlF i_mCust_OWN_ORG_CD


	final static String i_mCust_OWN_ORG_CD = null;

	// æ 472 ÏúlF i_mCust_EXCH_TYP


	final static String i_mCust_EXCH_TYP = null;

	// æ 473 ÏúlF i_mCust_CUR_CD


	final static String i_mCust_CUR_CD = null;

	// æ 474 ÏúlF i_mCust_IN_COMPANYCD


	final static String i_mCust_IN_COMPANYCD = null;

	// æ 475 ÏúlF i_mCust_IN_CUSTCD


	final static String i_mCust_IN_CUSTCD = null;

	// æ 476 ÏúlF i_getHomeCur_CUR_CD


	final static String i_getHomeCur_CUR_CD = null;

	// æ 477 ÏúlF i_getHomeCur_DECIMAL_FIG


	final static String i_getHomeCur_DECIMAL_FIG = null;

	// æ 478 ÏúlF i_getHomeCur_CTRL_CD


	final static String i_getHomeCur_CTRL_CD = null;

	// æ 479 ÏúlF i_strCode


	final static String i_strCode = null;

	// æ 480 ÏúlF i_mUnitCost_UNIT_COST


	final static String i_mUnitCost_UNIT_COST = null;

	// æ 481 ÏúlF i_mUnitCost_EFF_PHASE_IN_DATE


	final static String i_mUnitCost_EFF_PHASE_IN_DATE = null;

	// æ 482 ÏúlF i_mUnitCost_IN_COMPANYCD


	final static String i_mUnitCost_IN_COMPANYCD = null;

	// æ 483 ÏúlF i_mUnitCost_IN_CUSTCD


	final static String i_mUnitCost_IN_CUSTCD = null;

	// æ 484 ÏúlF i_mUnitCost_IN_ITEMCD


	final static String i_mUnitCost_IN_ITEMCD = null;

	// æ 485 ÏúlF i_mUnitCost_IN_EFFPHASEINDATE


	final static String i_mUnitCost_IN_EFFPHASEINDATE = null;

	// æ 486 ÏúlF i_readShipOdr_TOTAL_SHIP_QTY


	final static String i_readShipOdr_TOTAL_SHIP_QTY = null;

	// æ 487 ÏúlF i_readShipOdr_RETURN_QTY


	final static String i_readShipOdr_RETURN_QTY = null;

	// æ 488 ÏúlF i_readShipOdr_SHIP_ODR_NO


	final static String i_readShipOdr_SHIP_ODR_NO = null;

	// æ 489 ÏúlF i_g_CUR_UNIT


	final static String i_g_CUR_UNIT = null;

	// æ 490 ÏúlF i_DECIMAL_FIG


	final static String i_DECIMAL_FIG = null;

	// æ 491 ÏúlF i_t_CUR_CD


	final static String i_t_CUR_CD = null;

	// æ 492 ÏúlF i_strSLIP_CTRL_GRP


	final static String i_strSLIP_CTRL_GRP = null;

	// æ 493 ÏúlF i_strSTATUS


	final static String i_strSTATUS = null;

	// æ 494 ÏúlF i_strSLIP_CD


	final static String i_strSLIP_CD = null;

	// æ 495 ÏúlF i_upTshipOdr_SHP_CMPLT_FLG


	final static String i_upTshipOdr_SHP_CMPLT_FLG = null;

	// æ 496 ÏúlF i_upTshipOdr_TOTAL_SHIP_QTY


	final static String i_upTshipOdr_TOTAL_SHIP_QTY = null;

	// æ 497 ÏúlF i_upTshipOdr_SLIP_CD


	final static String i_upTshipOdr_SLIP_CD = null;

	// æ 498 ÏúlF i_upTshipOdr_ORG_SLIP_CD


	final static String i_upTshipOdr_ORG_SLIP_CD = null;

	// æ 499 ÏúlF i_upTshipOdr_SHIP_ODR_NO


	final static String i_upTshipOdr_SHIP_ODR_NO = null;

	// æ 500 ÏúlF i_strTod_OD_NO


	final static String i_strTod_OD_NO = null;

	// æ 501 ÏúlF i_strTod_TOTAL_ISSUE_QTY


	final static String i_strTod_TOTAL_ISSUE_QTY = null;

	// æ 502 ÏúlF i_strTod_DM_QTY


	final static String i_strTod_DM_QTY = null;

	// æ 503 ÏúlF i_strTod_DM_STS_TYP


	final static String i_strTod_DM_STS_TYP = null;

	// æ 504 ÏúlF i_inTod_ODR_NO


	final static String i_inTod_ODR_NO = null;

	// æ 505 ÏúlF i_inTod_PART_DLV_SEQ_NO


	final static String i_inTod_PART_DLV_SEQ_NO = null;

	// æ 506 ÏúlF i_inTod_OD_NO


	final static String i_inTod_OD_NO = null;

	// æ 507 ÏúlF i_strTaxTAX_KBN


	final static String i_strTaxTAX_KBN = null;

	// æ 508 ÏúlF i_strTaxOLD_TAX_1


	final static String i_strTaxOLD_TAX_1 = null;

	// æ 509 ÏúlF i_strTaxOLD_TAX_2


	final static String i_strTaxOLD_TAX_2 = null;

	// æ 510 ÏúlF i_strTaxOLD_TAX_3


	final static String i_strTaxOLD_TAX_3 = null;

	// æ 511 ÏúlF i_strTaxNEW_TAX_1


	final static String i_strTaxNEW_TAX_1 = null;

	// æ 512 ÏúlF i_strTaxNEW_TAX_2


	final static String i_strTaxNEW_TAX_2 = null;

	// æ 513 ÏúlF i_strTaxNEW_TAX_3


	final static String i_strTaxNEW_TAX_3 = null;

	// æ 514 ÏúlF i_strTaxSTART_DATE


	final static String i_strTaxSTART_DATE = null;

	// æ 515 ÏúlF i_strTaxROUND_TYP


	final static String i_strTaxROUND_TYP = null;

	// æ 516 ÏúlF i_updiffTAX_CD


	final static String i_updiffTAX_CD = null;

	// æ 517 ÏúlF i_upTshipOdr_RETURN_QTY


	final static String i_upTshipOdr_RETURN_QTY = null;

	// æ 518 ÏúlF i_chkSLIP_CD


	final static String i_chkSLIP_CD = null;

	// æ 519 ÏúlF i_mWh_WH_NAME


	final static String i_mWh_WH_NAME = null;

	// æ 520 ÏúlF i_mWh_PLANT_CD


	final static String i_mWh_PLANT_CD = null;

	// æ 521 ÏúlF i_mWh_IN_WH_CD


	final static String i_mWh_IN_WH_CD = null;

	// æ 522 ÏúlF i_mOrg_ORG_NAME


	final static String i_mOrg_ORG_NAME = null;

	// æ 523 ÏúlF i_mOrg_IN_COMPANYCD


	final static String i_mOrg_IN_COMPANYCD = null;

	// æ 524 ÏúlF i_mOrg_IN_ORGCD


	final static String i_mOrg_IN_ORGCD = null;

	// æ 525 ÏúlF i_serTitemStock_JOB_ODR_CD


	final static String i_serTitemStock_JOB_ODR_CD = null;

	// æ 526 ÏúlF i_serTitemStock_IN_JOBODRCD


	final static String i_serTitemStock_IN_JOBODRCD = null;

	// æ 527 ÏúlF i_creTitemStock_JOB_ODR_CD


	final static String i_creTitemStock_JOB_ODR_CD = null;

	// æ 528 ÏúlF i_upTitemStock_IN_JOBODRCD


	final static String i_upTitemStock_IN_JOBODRCD = null;

	// æ 529 ÏúlF i_serTJobOdr_JOB_ODR_CD


	final static String i_serTJobOdr_JOB_ODR_CD = null;

	// æ 530 ÏúlF i_serTJobOdr_ITEM_CD


	final static String i_serTJobOdr_ITEM_CD = null;

	// æ 531 ÏúlF i_diffSHIP_QTY


	final static String i_diffSHIP_QTY = null;

	// æ 532 ÏúlF i_diffSHIP_ODR_AMOUNT


	final static String i_diffSHIP_ODR_AMOUNT = null;

	// æ 533 ÏúlF i_diffSHIP_ODR_AMOUNT_EXCH_RATE


	final static String i_diffSHIP_ODR_AMOUNT_EXCH_RATE = null;

	// æ 534 ÏúlF i_diffSHIP_ODR_NO


	final static String i_diffSHIP_ODR_NO = null;

	// æ 535 ÏúlF i_diffODR_NO


	final static String i_diffODR_NO = null;

	// æ 536 ÏúlF i_diffPART_DLV_SEQ_NO


	final static String i_diffPART_DLV_SEQ_NO = null;

	// æ 537 ÏúlF i_diffSLIP_CD


	final static String i_diffSLIP_CD = null;

	// æ 538 ÏúlF i_diffITEM_CD


	final static String i_diffITEM_CD = null;

	// æ 539 ÏúlF i_diffJOB_ODR_CD


	final static String i_diffJOB_ODR_CD = null;

	// æ 540 ÏúlF i_diffCUST_ITEM_CD


	final static String i_diffCUST_ITEM_CD = null;

	// æ 541 ÏúlF i_diffCUST_ODR_NO


	final static String i_diffCUST_ODR_NO = null;

	// æ 542 ÏúlF i_diffCUST_CD


	final static String i_diffCUST_CD = null;

	// æ 543 ÏúlF i_diffCUST_NAME


	final static String i_diffCUST_NAME = null;

	// æ 544 ÏúlF i_diffCUST_CHRG_PSN_CD


	final static String i_diffCUST_CHRG_PSN_CD = null;

	// æ 545 ÏúlF i_diffSHIP_ODR_ISS_PSN_CD


	final static String i_diffSHIP_ODR_ISS_PSN_CD = null;

	// æ 546 ÏúlF i_diffDLV_LOC_CD


	final static String i_diffDLV_LOC_CD = null;

	// æ 547 ÏúlF i_diffDEPO_TYP


	final static String i_diffDEPO_TYP = null;

	// æ 548 ÏúlF i_diffDESINATED_SHIP_DATE


	final static String i_diffDESINATED_SHIP_DATE = null;

	// æ 549 ÏúlF i_diffSCDL_DLV_DATE


	final static String i_diffSCDL_DLV_DATE = null;

	// æ 550 ÏúlF i_diffTOTAL_SHIP_QTY


	final static String i_diffTOTAL_SHIP_QTY = null;

	// æ 551 ÏúlF i_diffRETURN_QTY


	final static String i_diffRETURN_QTY = null;

	// æ 552 ÏúlF i_diffUNIT_CD


	final static String i_diffUNIT_CD = null;

	// æ 553 ÏúlF i_diffUNIT_PRICE


	final static String i_diffUNIT_PRICE = null;

	// æ 554 ÏúlF i_diffCURRENCY_CD


	final static String i_diffCURRENCY_CD = null;

	// æ 555 ÏúlF i_diffLOC_CD


	final static String i_diffLOC_CD = null;

	// æ 556 ÏúlF i_diffPKG_UNIT_QTY


	final static String i_diffPKG_UNIT_QTY = null;

	// æ 557 ÏúlF i_diffREMARKS


	final static String i_diffREMARKS = null;

	// æ 558 ÏúlF i_diffDLV_KEY_NO


	final static String i_diffDLV_KEY_NO = null;

	// æ 559 ÏúlF i_diffPART_DLV_COUNT


	final static String i_diffPART_DLV_COUNT = null;

	// æ 560 ÏúlF i_diffTRANSPORT_CD


	final static String i_diffTRANSPORT_CD = null;

	// æ 561 ÏúlF i_diffTRANSPORT_TYP


	final static String i_diffTRANSPORT_TYP = null;

	// æ 562 ÏúlF i_diffALLCT_WH_CD


	final static String i_diffALLCT_WH_CD = null;

	// æ 563 ÏúlF i_diffTRANSFER_WH_CD


	final static String i_diffTRANSFER_WH_CD = null;

	// æ 564 ÏúlF i_diffDIRECT_DLV_FLG


	final static String i_diffDIRECT_DLV_FLG = null;

	// æ 565 ÏúlF i_diffENTRY_TYP


	final static String i_diffENTRY_TYP = null;

	// æ 566 ÏúlF i_diffPRINT_FLG


	final static String i_diffPRINT_FLG = null;

	// æ 567 ÏúlF i_diffSHIP_CMPLT_FLG


	final static String i_diffSHIP_CMPLT_FLG = null;

	// æ 568 ÏúlF i_diffDEPO_TRANSFER_PROC_FLG


	final static String i_diffDEPO_TRANSFER_PROC_FLG = null;

	// æ 569 ÏúlF i_diffDEL_FLG


	final static String i_diffDEL_FLG = null;

	// æ 570 ÏúlF i_diffuptOdr_SHIP_CNT


	final static String i_diffuptOdr_SHIP_CNT = null;

	// æ 571 ÏúlF i_diffuptOdr_PART_DLV_COUNT


	final static String i_diffuptOdr_PART_DLV_COUNT = null;

	// æ 572 ÏúlF i_diffuptOdr_IN_ODRNO


	final static String i_diffuptOdr_IN_ODRNO = null;

	// æ 573 ÏúlF i_in_tShipSlip_SLIP_CD


	final static String i_in_tShipSlip_SLIP_CD = null;

	// æ 574 ÏúlF i_in_tShipSlip_ITEM_CD


	final static String i_in_tShipSlip_ITEM_CD = null;

	// æ 575 ÏúlF i_in_tShipSlip_CUST_ITEM_CD


	final static String i_in_tShipSlip_CUST_ITEM_CD = null;

	// æ 576 ÏúlF i_in_tShipSlip_PART_NAME


	final static String i_in_tShipSlip_PART_NAME = null;

	// æ 577 ÏúlF i_in_tShipSlip_CUST_ODR_NO


	final static String i_in_tShipSlip_CUST_ODR_NO = null;

	// æ 578 ÏúlF i_in_tShipSlip_CUST_CD


	final static String i_in_tShipSlip_CUST_CD = null;

	// æ 579 ÏúlF i_in_tShipSlip_CUST_NAME


	final static String i_in_tShipSlip_CUST_NAME = null;

	// æ 580 ÏúlF i_in_tShipSlip_DLV_LOC_CD


	final static String i_in_tShipSlip_DLV_LOC_CD = null;

	// æ 581 ÏúlF i_in_tShipSlip_DLV_LOC_NAME_KANJI


	final static String i_in_tShipSlip_DLV_LOC_NAME_KANJI = null;

	// æ 582 ÏúlF i_in_tShipSlip_CUS_DLV_KEY_CD


	final static String i_in_tShipSlip_CUS_DLV_KEY_CD = null;

	// æ 583 ÏúlF i_in_tShipSlip_DESINATED_SHIP_DATE


	final static String i_in_tShipSlip_DESINATED_SHIP_DATE = null;

	// æ 584 ÏúlF i_in_tShipSlip_DESINATED_DLV_DATE


	final static String i_in_tShipSlip_DESINATED_DLV_DATE = null;

	// æ 585 ÏúlF i_in_tShipSlip_SCDL_DLV_DATE


	final static String i_in_tShipSlip_SCDL_DLV_DATE = null;

	// æ 586 ÏúlF i_in_tShipSlip_SHIP_ODR_QTY


	final static String i_in_tShipSlip_SHIP_ODR_QTY = null;

	// æ 587 ÏúlF i_in_tShipSlip_UNIT_CD


	final static String i_in_tShipSlip_UNIT_CD = null;

	// æ 588 ÏúlF i_in_tShipSlip_UNIT_PRICE


	final static String i_in_tShipSlip_UNIT_PRICE = null;

	// æ 589 ÏúlF i_in_tShipSlip_SHIP_ODR_AMOUNT


	final static String i_in_tShipSlip_SHIP_ODR_AMOUNT = null;

	// æ 590 ÏúlF i_in_tShipSlip_TAX_AMOUNT


	final static String i_in_tShipSlip_TAX_AMOUNT = null;

	// æ 591 ÏúlF i_in_tShipSlip_INSPC_TYP


	final static String i_in_tShipSlip_INSPC_TYP = null;

	// æ 592 ÏúlF i_in_tShipSlip_CLIENT_REMARK_KANJI


	final static String i_in_tShipSlip_CLIENT_REMARK_KANJI = null;

	// æ 593 ÏúlF i_in_tShipSlip_CLIENT_BARCODE_INF


	final static String i_in_tShipSlip_CLIENT_BARCODE_INF = null;

	// æ 594 ÏúlF i_in_tShipSlip_PRINT_FLG


	final static String i_in_tShipSlip_PRINT_FLG = null;

	// æ 595 ÏúlF i_in_tShipSlip_DEL_FLG


	final static String i_in_tShipSlip_DEL_FLG = null;

	// æ 596 ÏúlF i_in_tShipSlip_BUYER_NAME


	final static String i_in_tShipSlip_BUYER_NAME = null;

	// æ 597 ÏúlF i_in_tShipSlip_PUCH_ODR_QTY_TOTAL


	final static String i_in_tShipSlip_PUCH_ODR_QTY_TOTAL = null;

	// æ 598 ÏúlF i_in_tShipSlip_DLV_ODR_QTY


	final static String i_in_tShipSlip_DLV_ODR_QTY = null;

	// æ 599 ÏúlF i_in_tShipSlip_SHIP_ODR_AMOUNT_TAX


	final static String i_in_tShipSlip_SHIP_ODR_AMOUNT_TAX = null;

	// æ 600 ÏúlF i_in_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT


	final static String i_in_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT = null;

	// æ 601 ÏúlF i_in_tShipSlip_INTERNAL_TAX_SALES_AMOUNT


	final static String i_in_tShipSlip_INTERNAL_TAX_SALES_AMOUNT = null;

	// æ 602 ÏúlF i_in_tShipSlip_TAXFREE_SALES_AMOUNT


	final static String i_in_tShipSlip_TAXFREE_SALES_AMOUNT = null;

	// æ 603 ÏúlF i_in_tShipSlip_TAX_CREDIT_SALES_AMOUNT


	final static String i_in_tShipSlip_TAX_CREDIT_SALES_AMOUNT = null;

	// æ 604 ÏúlF i_in_tShipSlip_EXTERNAL_TAX_AMOUNT


	final static String i_in_tShipSlip_EXTERNAL_TAX_AMOUNT = null;

	// æ 605 ÏúlF i_in_tShipSlip_INTERNAL_TAX_AMOUNT


	final static String i_in_tShipSlip_INTERNAL_TAX_AMOUNT = null;

	// æ 606 ÏúlF i_in_tShipSlip_TAX_AMOUNT_1


	final static String i_in_tShipSlip_TAX_AMOUNT_1 = null;

	// æ 607 ÏúlF i_in_tShipSlip_TAX_AMOUNT_2


	final static String i_in_tShipSlip_TAX_AMOUNT_2 = null;

	// æ 608 ÏúlF i_in_tShipSlip_TAX_AMOUNT_3


	final static String i_in_tShipSlip_TAX_AMOUNT_3 = null;

	// æ 609 ÏúlF i_in_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT


	final static String i_in_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;

	// æ 610 ÏúlF i_up_tShipSlip_SLIP_CD


	final static String i_up_tShipSlip_SLIP_CD = null;

	// æ 611 ÏúlF i_updiffSHIP_ODR_QTY


	final static String i_updiffSHIP_ODR_QTY = null;

	// æ 612 ÏúlF i_updiffSHIP_ODR_AMOUNT


	final static String i_updiffSHIP_ODR_AMOUNT = null;

	// æ 613 ÏúlF i_updiffTAX_AMOUNT


	final static String i_updiffTAX_AMOUNT = null;

	// æ 614 ÏúlF i_updiffSHIP_ODR_AMOUNT_TAX


	final static String i_updiffSHIP_ODR_AMOUNT_TAX = null;

	// æ 615 ÏúlF i_updiffEXTERNAL_TAX_SALES_AMOUNT


	final static String i_updiffEXTERNAL_TAX_SALES_AMOUNT = null;

	// æ 616 ÏúlF i_updiffINTERNAL_TAX_SALES_AMOUNT


	final static String i_updiffINTERNAL_TAX_SALES_AMOUNT = null;

	// æ 617 ÏúlF i_updiffTAXFREE_SALES_AMOUNT


	final static String i_updiffTAXFREE_SALES_AMOUNT = null;

	// æ 618 ÏúlF i_updiffTAX_CREDIT_SALES_AMOUNT


	final static String i_updiffTAX_CREDIT_SALES_AMOUNT = null;

	// æ 619 ÏúlF i_updiffEXTERNAL_TAX_AMOUNT


	final static String i_updiffEXTERNAL_TAX_AMOUNT = null;

	// æ 620 ÏúlF i_updiffINTERNAL_TAX_AMOUNT


	final static String i_updiffINTERNAL_TAX_AMOUNT = null;

	// æ 621 ÏúlF i_updiffTAX_AMOUNT_1


	final static String i_updiffTAX_AMOUNT_1 = null;

	// æ 622 ÏúlF i_updiffTAX_AMOUNT_2


	final static String i_updiffTAX_AMOUNT_2 = null;

	// æ 623 ÏúlF i_updiffTAX_AMOUNT_3


	final static String i_updiffTAX_AMOUNT_3 = null;

	// æ 624 ÏúlF i_updiffOWN_CUR_TAXCREDIT_SALES_AMOUNT


	final static String i_updiffOWN_CUR_TAXCREDIT_SALES_AMOUNT = null;

	// æ 625 ÏúlF i_updiffSLIP_CD


	final static String i_updiffSLIP_CD = null;

	// æ 626 ÏúlF i_PAST_RESULT_ENTRY_TYP


	final static String i_PAST_RESULT_ENTRY_TYP = null;

	// æ 627 ÏúlF i_PROC_EXEC_DATE


	final static BigDecimal i_PROC_EXEC_DATE = null;

	// æ 628 ÏúlF i_PLANT_CD


	final static String i_PLANT_CD = null;

	// æ 629 ÏúlF i_mCustBase_TRANSPORT_LT


	final static String i_mCustBase_TRANSPORT_LT = null;

	// æ 630 ÏúlF i_mCustBase_IN_COMPANYCD


	final static String i_mCustBase_IN_COMPANYCD = null;

	// æ 631 ÏúlF i_mCustBase_IN_CUSTCD


	final static String i_mCustBase_IN_CUSTCD = null;

	// æ 632 ÏúlF i_mCustBase_IN_DLVLOCCD


	final static String i_mCustBase_IN_DLVLOCCD = null;

	// æ 633 ÏúlF i_strSYUKA_LT


	final static String i_strSYUKA_LT = null;

	// æ 634 ÏúlF i_strTaxIN_COMPANYCD


	final static String i_strTaxIN_COMPANYCD = null;

	// æ 635 ÏúlF i_strTaxIN_CUSTCD


	final static String i_strTaxIN_CUSTCD = null;

	// æ 636 ÏúlF i_g_CUST_ITEM_CD


	final static String i_g_CUST_ITEM_CD = null;

	// æ 637 ÏúlF i_strT_ODR_TAX


	final static String i_strT_ODR_TAX = null;

	// æ 638 ÏúlF i_g_SLIP_CD


	final static String i_g_SLIP_CD = null;

	// æ 639 ÏúlF i_getTship_SHIP_SEQ_NO


	final static String i_getTship_SHIP_SEQ_NO = null;

	// æ 640 ÏúlF i_chkLOT_NO


	final static String i_chkLOT_NO = null;

	// æ 641 ÏúlF i_chkITEM_CD


	final static String i_chkITEM_CD = null;

	// æ 642 ÏúlF i_getQtySTOCK_ON_HAND_QTY


	final static String i_getQtySTOCK_ON_HAND_QTY = null;

	// æ 643 ÏúlF i_getQtyALCD_QTY


	final static String i_getQtyALCD_QTY = null;

	// æ 644 ÏúlF i_getQtyITEM_CD


	final static String i_getQtyITEM_CD = null;

	// æ 645 ÏúlF i_getQtyWH_CD


	final static String i_getQtyWH_CD = null;

	// æ 646 ÏúlF i_getQtyLOT_NO


	final static String i_getQtyLOT_NO = null;

	// æ 647 ÏúlF i_readTlotStock_LOT_NO


	final static String i_readTlotStock_LOT_NO = null;

	// æ 648 ÏúlF i_readTlotStock_STOCK_ON_HAND_QTY


	final static String i_readTlotStock_STOCK_ON_HAND_QTY = null;

	// æ 649 ÏúlF i_readTlotStock_ALCD_QTY


	final static String i_readTlotStock_ALCD_QTY = null;

	// æ 650 ÏúlF i_readTlotStock_IN_ITEM_CD


	final static String i_readTlotStock_IN_ITEM_CD = null;

	// æ 651 ÏúlF i_readTlotStock_IN_WH_CD


	final static String i_readTlotStock_IN_WH_CD = null;

	// æ 652 ÏúlF i_readTlotStock_IN_LOT_NO


	final static String i_readTlotStock_IN_LOT_NO = null;

	// æ 653 ÏúlF i_upTlotStockSTOCK_ON_HAND_QTY


	final static String i_upTlotStockSTOCK_ON_HAND_QTY = null;

	// æ 654 ÏúlF i_upTlotStockIN_ITEM_CD


	final static String i_upTlotStockIN_ITEM_CD = null;

	// æ 655 ÏúlF i_upTlotStockIN_WH_CD


	final static String i_upTlotStockIN_WH_CD = null;

	// æ 656 ÏúlF i_upTlotStockIN_LOT_NO


	final static String i_upTlotStockIN_LOT_NO = null;

	// æ 657 ÏúlF i_serLotSTOCK_ON_HAND_QTY


	final static String i_serLotSTOCK_ON_HAND_QTY = null;

	// æ 658 ÏúlF i_serLotALCD_QTY


	final static String i_serLotALCD_QTY = null;

	// æ 659 ÏúlF i_serLotIN_ITEM_CD


	final static String i_serLotIN_ITEM_CD = null;

	// æ 660 ÏúlF i_serLotIN_WH_CD


	final static String i_serLotIN_WH_CD = null;

	// æ 661 ÏúlF i_serLotIN_LOT_NO


	final static String i_serLotIN_LOT_NO = null;

	// æ 662 ÏúlF i_insertLotStock_ITEM_CD


	final static String i_insertLotStock_ITEM_CD = null;

	// æ 663 ÏúlF i_insertLotStock_WH_CD


	final static String i_insertLotStock_WH_CD = null;

	// æ 664 ÏúlF i_insertLotStock_LOT_CD


	final static String i_insertLotStock_LOT_CD = null;

	// æ 665 ÏúlF i_insertLotStock_PLANT_CD


	final static String i_insertLotStock_PLANT_CD = null;

	// æ 666 ÏúlF i_insertLotStock_STOCK_ON_HAND_QTY


	final static String i_insertLotStock_STOCK_ON_HAND_QTY = null;

	// æ 667 ÏúlF i_insertLotStock_DEFECT_QTY


	final static String i_insertLotStock_DEFECT_QTY = null;

	// æ 668 ÏúlF i_insertLotStock_ALCD_QTY


	final static String i_insertLotStock_ALCD_QTY = null;

	// æ 669 ÏúlF i_insTshipInst_SHIP_SEQ_NO


	final static String i_insTshipInst_SHIP_SEQ_NO = null;

	// æ 670 ÏúlF i_insTshipInst_SHIP_ODR_NO


	final static String i_insTshipInst_SHIP_ODR_NO = null;

	// æ 671 ÏúlF i_insTshipInst_LOT_NO


	final static String i_insTshipInst_LOT_NO = null;

	// æ 672 ÏúlF i_insTshipInst_ITEM_CD


	final static String i_insTshipInst_ITEM_CD = null;

	// æ 673 ÏúlF i_insTshipInst_WH_CD


	final static String i_insTshipInst_WH_CD = null;

	// æ 674 ÏúlF i_insTshipInst_ODR_NO


	final static String i_insTshipInst_ODR_NO = null;

	// æ 675 ÏúlF i_insTshipInst_SLIP_CD


	final static String i_insTshipInst_SLIP_CD = null;

	// æ 676 ÏúlF i_insTshipInst_SHIP_QTY


	final static String i_insTshipInst_SHIP_QTY = null;

	// æ 677 ÏúlF i_insTshipInst_SHIP_DATE


	final static String i_insTshipInst_SHIP_DATE = null;

	// æ 678 ÏúlF i_delTshipInstIN_SHIP_SEQ_NO


	final static String i_delTshipInstIN_SHIP_SEQ_NO = null;

	// æ 679 ÏúlF i_delTshipInstIN_LOT_NO


	final static String i_delTshipInstIN_LOT_NO = null;

	// æ 680 ÏúlF i_tlotTrace_FROM_ITEM_CD


	final static String i_tlotTrace_FROM_ITEM_CD = null;

	// æ 681 ÏúlF i_tlotTrace_FROM_LOT_NO


	final static String i_tlotTrace_FROM_LOT_NO = null;

	// æ 682 ÏúlF i_tlotTrace_TO_ITEM_CD


	final static String i_tlotTrace_TO_ITEM_CD = null;

	// æ 683 ÏúlF i_tlotTrace_TO_LOT_NO


	final static String i_tlotTrace_TO_LOT_NO = null;

	// æ 684 ÏúlF i_tlotTrace_LOT_TRACE_TYP


	final static String i_tlotTrace_LOT_TRACE_TYP = null;

	// æ 685 ÏúlF i_tlotTrace_CUST_ODR_NO


	final static String i_tlotTrace_CUST_ODR_NO = null;

	// æ 686 ÏúlF i_tlotTrace_SLIP_CD


	final static String i_tlotTrace_SLIP_CD = null;

	// æ 687 ÏúlF i_tlotTrace_ODR_NO


	final static String i_tlotTrace_ODR_NO = null;

	// æ 688 ÏúlF i_readTshipInst_LOT_NO


	final static String i_readTshipInst_LOT_NO = null;

	// æ 689 ÏúlF i_readTshipInst_SHIP_QTY


	final static String i_readTshipInst_SHIP_QTY = null;

	// æ 690 ÏúlF i_readTshipInst_SHIP_ODR_NO


	final static String i_readTshipInst_SHIP_ODR_NO = null;

	// æ 691 ÏúlF i_readTshipInst_ITEM_CD


	final static String i_readTshipInst_ITEM_CD = null;

	// æ 692 ÏúlF i_readTshipInst_WH_CD


	final static String i_readTshipInst_WH_CD = null;

	// æ 693 ÏúlF i_readTshipInst_ODR_NO


	final static String i_readTshipInst_ODR_NO = null;

	// æ 694 ÏúlF i_readTshipInst_SLIP_CD


	final static String i_readTshipInst_SLIP_CD = null;

	// æ 695 ÏúlF i_readTshipInst_SHIP_DATE


	final static String i_readTshipInst_SHIP_DATE = null;

	// æ 696 ÏúlF i_readTshipInst_IN_SHIP_SEQ_NO


	final static String i_readTshipInst_IN_SHIP_SEQ_NO = null;

	// æ 697 ÏúlF i_readTshipInst_IN_LOT_NO


	final static String i_readTshipInst_IN_LOT_NO = null;

	// æ 698 ÏúlF i_readT_Ship_Inst_Lot_NO


	final static String i_readT_Ship_Inst_Lot_NO = null;

	// æ 699 ÏúlF i_readT_Ship_Inst_Ship_Seq_NO


	final static String i_readT_Ship_Inst_Ship_Seq_NO = null;

	// æ 700 ÏúlF i_strOdrCurrncyCd


	final static String i_strOdrCurrncyCd = null;

	// æ 701 ÏúlF i_strExchTyp


	final static String i_strExchTyp = null;

	// æ 702 ÏúlF i_g_DATE


	final static String i_g_DATE = null;

	// æ 703 ÏúlF i_selTShipOdr_MODIFY_COUNT


	final static String i_selTShipOdr_MODIFY_COUNT = null;

	// æ 704 ÏúlF i_SEL_MODIFY_COUNT


	final static String i_SEL_MODIFY_COUNT = null;

*/

	//{{user_implement_code
         // TODO: [Up\bhEÏÍA±±ÉLqµÄ­¾³¢B
        /**
         * ú»
         */
        public void init()
        {
       
        }
       
        /**
         * Rs[
         * @param struct Rs[ÎÛÌStruct
         */
        public void copy(KU0030010Struct struct)
        {
         this.setsUser_ID(struct.getsUser_ID());
        }
         
        //}}user_implement_code

	//////////////////////////////

}
