/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KU0010/src/com/nec/jp/orteus/metamorBase/KU0010/KU0010B001/medKU0010B001.java,v $
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
 * EXPJ    (2004/04/05),メソッドコメントの「* @param なし」をすべて削除
 *                     ,メソッドコメントの「* @return なし」をすべて削除
 * EXPJ    (2004/03/21),EXPLANNER/J用に改造
 *                      SystemLogの記述を追加。
 * 2.0.0.0 (2002/05/27),new foundation対応
 *
 */

package com.nec.jp.orteus.metamorBase.KU0010.KU0010B001;

import com.nec.jp.orteus.expj.systemlog.SystemLog;
import com.nec.jp.orteus.xaf.ba.*;

import java.lang.Number.*;
import java.lang.Float;
import java.lang.*;
import java.util.*;
import java.sql.*;
import java.io.*;

//{{user_implement_dev:import
	// TODO: ここにimportパッケージを記述してください
//}}user_implement_dev:import

/**
 * CLASS     : medKU0010B001 クラス
 * ファイル・クラス説明
 * @author $Author: geng-jia $
 * @version $Revision: 1.18 $ $Date: 2015/12/03 08:16:03 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class medKU0010B001 extends Object
{

	//////////////////////////////

	/**
	 * 第 1 mediator変数
	 */
	protected String m_sysBusinessMEG_CD;

	/**
	 * 第 2 mediator変数
	 */
	protected String m_sysBusinessMEG;

	/**
	 * 第 3 mediator変数
	 */
	protected String m_sysBusinessIN_MEG_CD;

	/**
	 * 第 4 mediator変数
	 */
	protected String m_oprDatePLANT_CD;

	/**
	 * 第 5 mediator変数
	 */
	protected String m_oprDateBUSINESS_OPR_DATE;

	/**
	 * 第 6 mediator変数
	 */
	protected String m_oprDateSTOCK_CRITERION_DATE;

	/**
	 * 第 7 mediator変数
	 */
	protected String m_oprDateIN_PLANTCD;

	/**
	 * 第 8 mediator変数
	 */
	protected String m_leedTimeSYS_CLASS;

	/**
	 * 第 9 mediator変数
	 */
	protected String m_leedTimeCLASS_CODE;

	/**
	 * 第 10 mediator変数
	 */
	protected String m_leedTimeCODE;

	/**
	 * 第 11 mediator変数
	 */
	protected String m_readTAnsDlvDateODR_NO;

	/**
	 * 第 12 mediator変数
	 */
	protected String m_readTAnsDlvDatePART_DLV_SEQ_NO;

	/**
	 * 第 13 mediator変数
	 */
	protected String m_readTAnsDlvDatePRVS_ANS_DLV_DATE_RCD;

	/**
	 * 第 14 mediator変数
	 */
	protected String m_readTAnsDlvDateLAST_ANS_DLV_DATE_RCD;

	/**
	 * 第 15 mediator変数
	 */
	protected String m_readTAnsDlvDateDESINATED_SHIP_DATE;

	/**
	 * 第 16 mediator変数
	 */
	protected String m_readTAnsDlvDateDESINATED_SHIP_QTY;

	/**
	 * 第 17 mediator変数
	 */
	protected String m_readTAnsDlvDateREST_SHIP_ODR_QTY;

	/**
	 * 第 18 mediator変数
	 */
	protected String m_readTAnsDlvDateSHIP_ODR_CMPLT_FLG;

	/**
	 * 第 19 mediator変数
	 */
	protected String m_readTAnsDlvDateDEL_FLG;

	/**
	 * 第 20 mediator変数
	 */
	protected String m_readTAnsDlvDateCUST_ITEM_CD;

	/**
	 * 第 21 mediator変数
	 */
	protected String m_readTAnsDlvDateITEM_CD;

	/**
	 * 第 22 mediator変数
	 */
	protected String m_readTAnsDlvDateCUST_CD;

	/**
	 * 第 23 mediator変数
	 */
	protected String m_readTAnsDlvDatePKG_UNIT_QTY;

	/**
	 * 第 24 mediator変数
	 */
	protected String m_readTAnsDlvDateCUST_ANAME;

	/**
	 * 第 25 mediator変数
	 */
	protected String m_readTAnsDlvDateDETAIL_ROUND_TYP;

	/**
	 * 第 26 mediator変数
	 */
	protected String m_readTAnsDlvDateTRANSPORT_LT;

	/**
	 * 第 27 mediator変数
	 */
	protected String m_readTAnsDlvDateSHIP_WH_CD;

	/**
	 * 第 28 mediator変数
	 */
	protected String m_readTAnsDlvDateDEPO_WH_CD;

	/**
	 * 第 29 mediator変数
	 */
	protected String m_readTAnsDlvDateCUST_ODR_NO;

	/**
	 * 第 30 mediator変数
	 */
	protected String m_readTAnsDlvDateCUST_CHRG_PSN_CD;

	/**
	 * 第 31 mediator変数
	 */
	protected String m_readTAnsDlvDateCURRNCY_CD;

	/**
	 * 第 32 mediator変数
	 */
	protected String m_readTAnsDlvDateDLV_LOC_CD;

	/**
	 * 第 33 mediator変数
	 */
	protected String m_readTAnsDlvDateDLV_LOC_NAME_KANJI;

	/**
	 * 第 34 mediator変数
	 */
	protected String m_readTAnsDlvDateODR_UNIT_PRICE;

	/**
	 * 第 35 mediator変数
	 */
	protected String m_readTAnsDlvDateSHIP_CNT;

	/**
	 * 第 36 mediator変数
	 */
	protected String m_readTAnsDlvDateDEPO_TYP;

	/**
	 * 第 37 mediator変数
	 */
	protected String m_readTAnsDlvDateDESINATED_DLV_DATE;

	/**
	 * 第 38 mediator変数
	 */
	protected String m_readTAnsDlvDateODR_QTY;

	/**
	 * 第 39 mediator変数
	 */
	protected String m_readTAnsDlvDateUNIT_CD;

	/**
	 * 第 40 mediator変数
	 */
	protected String m_readTAnsDlvDateCUS_DLV_KEY_CD;

	/**
	 * 第 41 mediator変数
	 */
	protected String m_readTAnsDlvDatePART_NAME;

	/**
	 * 第 42 mediator変数
	 */
	protected String m_readTAnsDlvDateUNIT_CD_ORG;

	/**
	 * 第 43 mediator変数
	 */
	protected String m_readTAnsDlvDatePUCH_ODR_QTY_TOTAL;

	/**
	 * 第 44 mediator変数
	 */
	protected String m_readTAnsDlvDateBUYER_NAME;

	/**
	 * 第 45 mediator変数
	 */
	protected String m_readTAnsDlvDateINSPC_TYP;

	/**
	 * 第 46 mediator変数
	 */
	protected String m_readTAnsDlvDateCLIENT_REMARK;

	/**
	 * 第 47 mediator変数
	 */
	protected String m_readTAnsDlvDateCLIENT_BARCODE_INF;

	/**
	 * 第 48 mediator変数
	 */
	protected String m_readTAnsDlvDateTRANSPORT_CD;

	/**
	 * 第 49 mediator変数
	 */
	protected String m_readTAnsDlvDateREMARKS;

	/**
	 * 第 50 mediator変数
	 */
	protected String m_readTAnsDlvDatePARTIAL_SHIP_INST_FLG;

	/**
	 * 第 51 mediator変数
	 */
	protected String m_readTAnsDlvDateEXCH_TYP;

	/**
	 * 第 52 mediator変数
	 */
	protected String m_readTAnsDlvDateTAX_CD;

	/**
	 * 第 53 mediator変数
	 */
	protected String m_readTAnsDlvDateCUR_CD;

	/**
	 * 第 54 mediator変数
	 */
	protected String m_readTAnsDlvDateEXCH_TYP_R;

	/**
	 * 第 55 mediator変数
	 */
	protected String m_readTAnsDlvDateCOMPANY_CD;

	/**
	 * 第 56 mediator変数
	 */
	protected String m_upTAnsDlvDateREST_SHIP_ODR_QTY;

	/**
	 * 第 57 mediator変数
	 */
	protected String m_upTAnsDlvDateSHIP_ODR_CMPLT_FLG;

	/**
	 * 第 58 mediator変数
	 */
	protected String m_upTAnsDlvDateIN_PARTDLVSEQNO;

	/**
	 * 第 59 mediator変数
	 */
	protected String m_upTAnsDlvDateIN_ODRNO;

	/**
	 * 第 60 mediator変数
	 */
	protected String m_readTItemStockITEM_CD;

	/**
	 * 第 61 mediator変数
	 */
	protected String m_readTItemStockWH_CD;

	/**
	 * 第 62 mediator変数
	 */
	protected String m_readTItemStockPLANT_CD;

	/**
	 * 第 63 mediator変数
	 */
	protected String m_readTItemStockSTOCK_ON_HAND_QTY;

	/**
	 * 第 64 mediator変数
	 */
	protected String m_readTItemStockWH_TYP;

	/**
	 * 第 65 mediator変数
	 */
	protected String m_readTItemStockYUKOSU;

	/**
	 * 第 66 mediator変数
	 */
	protected String m_readTItemStockIN_ITEMCD;

	/**
	 * 第 67 mediator変数
	 */
	protected String m_readTItemStockIN_WHTYP;

	/**
	 * 第 68 mediator変数
	 */
	protected String m_whSuCOUNT;

	/**
	 * 第 69 mediator変数
	 */
	protected String m_whSuIN_ITEMCD;

	/**
	 * 第 70 mediator変数
	 */
	protected String m_whSuIN_WHTYP;

	/**
	 * 第 71 mediator変数
	 */
	protected String m_creTShipOdrODR_NO;

	/**
	 * 第 72 mediator変数
	 */
	protected String m_creTShipOdrPART_DLV_SEQ_NO;

	/**
	 * 第 73 mediator変数
	 */
	protected String m_creTShipOdrSLIP_CD;

	/**
	 * 第 74 mediator変数
	 */
	protected String m_creTShipOdrITEM_CD;

	/**
	 * 第 75 mediator変数
	 */
	protected String m_creTShipOdrCUST_ITEM_CD;

	/**
	 * 第 76 mediator変数
	 */
	protected String m_creTShipOdrCUST_ODR_NO;

	/**
	 * 第 77 mediator変数
	 */
	protected String m_creTShipOdrCUST_CD;

	/**
	 * 第 78 mediator変数
	 */
	protected String m_creTShipOdrCUST_NAME;

	/**
	 * 第 79 mediator変数
	 */
	protected String m_creTShipOdrCUST_CHRG_PSN_CD;

	/**
	 * 第 80 mediator変数
	 */
	protected String m_creTShipOdrSHIP_ODR_ISS_PSN_CD;

	/**
	 * 第 81 mediator変数
	 */
	protected String m_creTShipOdrDLV_LOC_CD;

	/**
	 * 第 82 mediator変数
	 */
	protected String m_creTShipOdrDEPO_TYP;

	/**
	 * 第 83 mediator変数
	 */
	protected String m_creTShipOdrDESINATED_SHIP_DATE;

	/**
	 * 第 84 mediator変数
	 */
	protected String m_creTShipOdrSHIP_QTY;

	/**
	 * 第 85 mediator変数
	 */
	protected String m_creTShipOdrUNIT_CD;

	/**
	 * 第 86 mediator変数
	 */
	protected String m_creTShipOdrUNIT_PRICE;

	/**
	 * 第 87 mediator変数
	 */
	protected String m_creTShipOdrSHIP_ODR_AMOUNT;

	/**
	 * 第 88 mediator変数
	 */
	protected String m_creTShipOdrCURRNCY_CD;

	/**
	 * 第 89 mediator変数
	 */
	protected String m_creTShipOdrPKG_UNIT_QTY;

	/**
	 * 第 90 mediator変数
	 */
	protected String m_creTShipOdrREMARKS;

	/**
	 * 第 91 mediator変数
	 */
	protected String m_creTShipOdrTRANSPORT_CD;

	/**
	 * 第 92 mediator変数
	 */
	protected String m_creTShipOdrALLCT_WH_CD;

	/**
	 * 第 93 mediator変数
	 */
	protected String m_creTShipOdrDIRECT_DLV_FLG;

	/**
	 * 第 94 mediator変数
	 */
	protected String m_creTShipOdrSCDL_DLV_DATE;

	/**
	 * 第 95 mediator変数
	 */
	protected String m_creTShipOdrDLV_KEY_NO;

	/**
	 * 第 96 mediator変数
	 */
	protected String m_creTShipOdrSHIP_ODR_AMOUNT_EXCH_RATES;

	/**
	 * 第 97 mediator変数
	 */
	protected String m_creTShipOdrTRANSFER_WH_CD;

	/**
	 * 第 98 mediator変数
	 */
	protected String m_creTShipOdrSHIP_ODR_NO;

	/**
	 * 第 99 mediator変数
	 */
	protected String m_creTShipOdrJOB_ODR_CD;

	/**
	 * 第 100 mediator変数
	 */
	protected String m_creTShipSlipSLIP_CD;

	/**
	 * 第 101 mediator変数
	 */
	protected String m_creTShipSlipITEM_CD;

	/**
	 * 第 102 mediator変数
	 */
	protected String m_creTShipSlipCUST_ITEM_CD;

	/**
	 * 第 103 mediator変数
	 */
	protected String m_creTShipSlipPART_NAME;

	/**
	 * 第 104 mediator変数
	 */
	protected String m_creTShipSlipCUST_ODR_NO;

	/**
	 * 第 105 mediator変数
	 */
	protected String m_creTShipSlipCUST_CD;

	/**
	 * 第 106 mediator変数
	 */
	protected String m_creTShipSlipCUST_NAME;

	/**
	 * 第 107 mediator変数
	 */
	protected String m_creTShipSlipDLV_LOC_CD;

	/**
	 * 第 108 mediator変数
	 */
	protected String m_creTShipSlipDLV_LOC_NAME_KANJI;

	/**
	 * 第 109 mediator変数
	 */
	protected String m_creTShipSlipCUS_DLV_KEY_CD;

	/**
	 * 第 110 mediator変数
	 */
	protected String m_creTShipSlipDESINATED_SHIP_DATE;

	/**
	 * 第 111 mediator変数
	 */
	protected String m_creTShipSlipDESINATED_DLV_DATE;

	/**
	 * 第 112 mediator変数
	 */
	protected String m_creTShipSlipSCDL_DLV_DATE;

	/**
	 * 第 113 mediator変数
	 */
	protected String m_creTShipSlipSHIP_ODR_QTY;

	/**
	 * 第 114 mediator変数
	 */
	protected String m_creTShipSlipUNIT_CD;

	/**
	 * 第 115 mediator変数
	 */
	protected String m_creTShipSlipUNIT_PRICE;

	/**
	 * 第 116 mediator変数
	 */
	protected String m_creTShipSlipSHIP_ODR_AMOUNT;

	/**
	 * 第 117 mediator変数
	 */
	protected String m_creTShipSlipTAX_AMOUNT;

	/**
	 * 第 118 mediator変数
	 */
	protected String m_creTShipSlipINSPC_TYP;

	/**
	 * 第 119 mediator変数
	 */
	protected String m_creTShipSlipCLIENT_REMARK_KANJI;

	/**
	 * 第 120 mediator変数
	 */
	protected String m_creTShipSlipCLIENT_BARCODE_INF;

	/**
	 * 第 121 mediator変数
	 */
	protected String m_creTShipSlipBUYER_NAME;

	/**
	 * 第 122 mediator変数
	 */
	protected String m_creTShipSlipPUCH_ODR_QTY_TOTAL;

	/**
	 * 第 123 mediator変数
	 */
	protected String m_creTShipSlipDLV_ODR_QTY;

	/**
	 * 第 124 mediator変数
	 */
	protected String m_creTShipSlipSHIP_ODR_AMOUNT_TAX;

	/**
	 * 第 125 mediator変数
	 */
	protected String m_creTShipSlipTAX_AMOUNT_1;

	/**
	 * 第 126 mediator変数
	 */
	protected String m_creTShipSlipTAX_AMOUNT_2;

	/**
	 * 第 127 mediator変数
	 */
	protected String m_creTShipSlipTAX_AMOUNT_3;

	/**
	 * 第 128 mediator変数
	 */
	protected String m_creTShipSlipOWN_CUR_TAXCREDIT_SALES_AMOUNT;

	/**
	 * 第 129 mediator変数
	 */
	protected String m_creTShipSlipEXTERNAL_TAX_SALES_AMOUNT;

	/**
	 * 第 130 mediator変数
	 */
	protected String m_creTShipSlipINTERNAL_TAX_SALES_AMOUNT;

	/**
	 * 第 131 mediator変数
	 */
	protected String m_creTShipSlipTAXFREE_SALES_AMOUNT;

	/**
	 * 第 132 mediator変数
	 */
	protected String m_creTShipSlipEXTERNAL_TAX_AMOUNT;

	/**
	 * 第 133 mediator変数
	 */
	protected String m_creTShipSlipINTERNAL_TAX_AMOUNT;

	/**
	 * 第 134 mediator変数
	 */
	protected String m_creTShipSlipTAX_CREDIT_SALES_AMOUNT;

	/**
	 * 第 135 mediator変数
	 */
	protected String m_creTUnShipListCUST_CD;

	/**
	 * 第 136 mediator変数
	 */
	protected String m_creTUnShipListACPT_ODR_CD;

	/**
	 * 第 137 mediator変数
	 */
	protected String m_creTUnShipListPART_DLV_SEQ_NO;

	/**
	 * 第 138 mediator変数
	 */
	protected String m_creTUnShipListITEM_CD;

	/**
	 * 第 139 mediator変数
	 */
	protected String m_creTUnShipListUN_SHIP_QTY;

	/**
	 * 第 140 mediator変数
	 */
	protected String m_creTUnShipListUN_SHIP_RSN;

	/**
	 * 第 141 mediator変数
	 */
	protected String m_creTUnShipListWH_CD;

	/**
	 * 第 142 mediator変数
	 */
	protected String m_UN_SHIP_SEQ_NO;

	/**
	 * 第 143 mediator変数
	 */
	protected String m_uptOdr_IN_ODRNO;

	/**
	 * 第 144 mediator変数
	 */
	protected String m_readTOdrCtlODR_CTL_NO;

	/**
	 * 第 145 mediator変数
	 */
	protected String m_readTOdrCtlITEM_CD;

	/**
	 * 第 146 mediator変数
	 */
	protected String m_readTOdrCtlCUST_ITEM_CD;

	/**
	 * 第 147 mediator変数
	 */
	protected String m_readTOdrCtlCUST_CD;

	/**
	 * 第 148 mediator変数
	 */
	protected String m_readTOdrCtlDEL_FLG;

	/**
	 * 第 149 mediator変数
	 */
	protected String m_readTOdrCtlIN_ODRCTLNO;

	/**
	 * 第 150 mediator変数
	 */
	protected String m_readMCustCOMPANY_CD;

	/**
	 * 第 151 mediator変数
	 */
	protected String m_readMCustCUST_CD;

	/**
	 * 第 152 mediator変数
	 */
	protected String m_readMCustCUST_ANAME;

	/**
	 * 第 153 mediator変数
	 */
	protected String m_readMCustIN_COMPANYCD;

	/**
	 * 第 154 mediator変数
	 */
	protected String m_readMCustIN_CUSTCD;

	/**
	 * 第 155 mediator変数
	 */
	protected String m_readMItemITEM_CD;

	/**
	 * 第 156 mediator変数
	 */
	protected String m_readMItemPKG_UNIT_QTY;

	/**
	 * 第 157 mediator変数
	 */
	protected String m_readMItemUNIT_WEIGHT;

	/**
	 * 第 158 mediator変数
	 */
	protected String m_readMItemIN_ITEMCD;

	/**
	 * 第 159 mediator変数
	 */
	protected String m_readMCustBaseCOMPANY_CD;

	/**
	 * 第 160 mediator変数
	 */
	protected String m_readMCustBaseCUST_CD;

	/**
	 * 第 161 mediator変数
	 */
	protected String m_readMCustBaseDLV_LOC_CD;

	/**
	 * 第 162 mediator変数
	 */
	protected String m_readMCustBaseTRANSPORT_LT;

	/**
	 * 第 163 mediator変数
	 */
	protected String m_readMCustBaseDEL_FLG;

	/**
	 * 第 164 mediator変数
	 */
	protected String m_readMCustBaseREMARKS_1;

	/**
	 * 第 165 mediator変数
	 */
	protected String m_readMCustBaseIN_COMPANYCD;

	/**
	 * 第 166 mediator変数
	 */
	protected String m_readMCustBaseIN_CUSTCD;

	/**
	 * 第 167 mediator変数
	 */
	protected String m_readMCustBaseIN_DLVLOCCD;

	/**
	 * 第 168 mediator変数
	 */
	protected String m_unShipRsnSYS_CLASS;

	/**
	 * 第 169 mediator変数
	 */
	protected String m_unShipRsnCLASS_CODE;

	/**
	 * 第 170 mediator変数
	 */
	protected String m_unShipRsnCODE;

	/**
	 * 第 171 mediator変数
	 */
	protected String m_unShipRsnCODE_NAME;

	/**
	 * 第 172 mediator変数
	 */
	protected String m_unShipRsnIN_SYSCLASS;

	/**
	 * 第 173 mediator変数
	 */
	protected String m_unShipRsnIN_CLASSCODE;

	/**
	 * 第 174 mediator変数
	 */
	protected String m_unShipRsnIN_CODE;

	/**
	 * 第 175 mediator変数
	 */
	protected String m_chkUnitPriceUNIT_COST;

	/**
	 * 第 176 mediator変数
	 */
	protected String m_chkUnitPriceEFF_PHASE_IN_DATE;

	/**
	 * 第 177 mediator変数
	 */
	protected String m_chkUnitPriceIN_COMPANYCD;

	/**
	 * 第 178 mediator変数
	 */
	protected String m_chkUnitPriceIN_CUSTCD;

	/**
	 * 第 179 mediator変数
	 */
	protected String m_chkUnitPriceIN_ITEMCD;

	/**
	 * 第 180 mediator変数
	 */
	protected String m_chkUnitPriceIN_EFFPHASEINDATE;

	/**
	 * 第 181 mediator変数
	 */
	protected String m_strTaxTAX_KBN;

	/**
	 * 第 182 mediator変数
	 */
	protected String m_strTaxOLD_TAX;

	/**
	 * 第 183 mediator変数
	 */
	protected String m_strTaxNEW_TAX;

	/**
	 * 第 184 mediator変数
	 */
	protected String m_strTaxSTART_DATE;

	/**
	 * 第 185 mediator変数
	 */
	protected String m_strTaxROUND_TYP;

	/**
	 * 第 186 mediator変数
	 */
	protected String m_strTaxIN_COMPANYCD;

	/**
	 * 第 187 mediator変数
	 */
	protected String m_strTaxIN_CUSTCD;

	/**
	 * 第 188 mediator変数
	 */
	protected String m_strTaxIN_ITEMCD;

	/**
	 * 第 189 mediator変数
	 */
	protected String m_strYotaku_WH_CD;

	/**
	 * 第 190 mediator変数
	 */
	protected String m_strYotaku_IN_WH_TYP;

	/**
	 * 第 191 mediator変数
	 */
	protected String m_strCOMPANY_CD;

	/**
	 * 第 192 mediator変数
	 */
	protected String m_strBUSINESS_OPR_DATE;

	/**
	 * 第 193 mediator変数
	 */
	protected String m_strPLANT_CD;

	/**
	 * 第 194 mediator変数
	 */
	protected String m_strSHIP_QTY_SUM;

	/**
	 * 第 195 mediator変数
	 */
	protected String m_strTaxOLD_TAX_1;

	/**
	 * 第 196 mediator変数
	 */
	protected String m_strTaxOLD_TAX_2;

	/**
	 * 第 197 mediator変数
	 */
	protected String m_strTaxOLD_TAX_3;

	/**
	 * 第 198 mediator変数
	 */
	protected String m_strTaxNEW_TAX_1;

	/**
	 * 第 199 mediator変数
	 */
	protected String m_strTaxNEW_TAX_2;

	/**
	 * 第 200 mediator変数
	 */
	protected String m_strTaxNEW_TAX_3;

	/**
	 * 第 201 mediator変数
	 */
	protected String m_strINSPC_ACPT_TYP;

	/**
	 * 第 202 mediator変数
	 */
	protected String m_strTaxIN_TAXCD;

	/**
	 * 第 203 mediator変数
	 */
	protected Double m_errCTL_SEQ_NO;

	/**
	 * 第 204 mediator変数
	 */
	protected String m_errSTATUS;

	/**
	 * 第 205 mediator変数
	 */
	protected String m_errMSSGE_CD;

	/**
	 * 第 206 mediator変数
	 */
	protected String m_errMSSGE;

	/**
	 * 第 207 mediator変数
	 */
	protected String m_errCUST_CD;

	/**
	 * 第 208 mediator変数
	 */
	protected String m_errCUST_ITEM_CD;

	/**
	 * 第 209 mediator変数
	 */
	protected String m_errITEM_CD;

	/**
	 * 第 210 mediator変数
	 */
	protected String m_errCUST_ODR_NO;

	/**
	 * 第 211 mediator変数
	 */
	protected String m_errCUST_CHRG_PSN_CD;

	/**
	 * 第 212 mediator変数
	 */
	protected String m_errERR_REC_TYPE;

	/**
	 * 第 213 mediator変数
	 */
	protected Double m_errACTUAL_UNIT_PRICE;

	/**
	 * 第 214 mediator変数
	 */
	protected Double m_errMASTER_UNIT_PRICE;

	/**
	 * 第 215 mediator変数
	 */
	protected Double m_errQTY;

	/**
	 * 第 216 mediator変数
	 */
	protected String m_errODR_NO;

	/**
	 * 第 217 mediator変数
	 */
	protected String m_errDESINATED_DLV_DATE;

	/**
	 * 第 218 mediator変数
	 */
	protected String m_errSLIP_NO;

	/**
	 * 第 219 mediator変数
	 */
	protected Double m_errIF_CTL_NO;

	/**
	 * 第 220 mediator変数
	 */
	protected String m_errPROC_TYP;

	/**
	 * 第 221 mediator変数
	 */
	protected Double m_errODR_SEQ;

	/**
	 * 第 222 mediator変数
	 */
	protected String m_strDECIMAL_FIG;

	/**
	 * 第 223 mediator変数
	 */
	protected String m_strCUR_CD;

	/**
	 * 第 224 mediator変数
	 */
	protected String m_strSYS_CLASS_CODE;

	/**
	 * 第 225 mediator変数
	 */
	protected String m_strJOB_ODR_CD;

	/**
	 * 第 226 mediator変数
	 */
	protected String m_readTJOBODRODRALCPLANT_CD;

	/**
	 * 第 227 mediator変数
	 */
	protected String m_readTJOBODRCDSTOCK_WHCD;

	/**
	 * 第 228 mediator変数
	 */
	protected String m_readTJOBODRCDSTOCK_PBL_SHIP_QTY;

	/**
	 * 第 229 mediator変数
	 */
	protected String m_readTJOBODRCDSTOCKITEM_CD;

	/**
	 * 第 230 mediator変数
	 */
	protected String m_readTJOBODRCDSTOCKIN_WHCD;

	/**
	 * readSysBusinessMessage entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity0=null;

	/**
	 * businessOprDate entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity1=null;

	/**
	 * leedTime entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity2=null;

	/**
	 * tblT_ANS_DLV_DATE entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity3=null;

	/**
	 * tblT_ITEM_STOCK entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity4=null;

	/**
	 * whSu entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity5=null;

	/**
	 * tblT_SHIP_ODR entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity6=null;

	/**
	 * tblT_SHIP_SLIP entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity7=null;

	/**
	 * tblT_UN_SHIP_LIST entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity8=null;

	/**
	 * tblT_ODR entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity9=null;

	/**
	 * tblT_ODR_CTL entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity10=null;

	/**
	 * tblM_CUST entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity11=null;

	/**
	 * tblM_ITEM entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity12=null;

	/**
	 * tblM_CUST_BASE entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity13=null;

	/**
	 * unShipRsn entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity14=null;

	/**
	 * chkUnitPrice entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity15=null;

	/**
	 * taxData entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity16=null;

	/**
	 * yotakuWhCd entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity17=null;

	/**
	 * getCompanyInfo entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity18=null;

	/**
	 * getGyomuDate entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity19=null;

	/**
	 * tblT_SHIP_ODR_CHK entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity20=null;

	/**
	 * getTax entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity21=null;

	/**
	 * getSEQ_ERR_WNG_LST entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity22=null;

	/**
	 * writeErrWngLst entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity23=null;

	/**
	 * tblM_CUR entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity24=null;

	/**
	 * tblSYS_CLASS_CODE entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity25=null;

	/**
	 * tblT_JOB_ODR_ODR_ALC entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity26=null;

	/**
	 * tblT_JOB_ODR_CD_STOCK entity インスタンスを格納します
	 */
	public AbstractBatchAppEntity m_entity27=null;

	/**
	 * CtrlMain entity インスタンスを格納します
	 */
	public IBatchAppCommon m_ctrl0=null;


	//////////////////////////////

	/**
	 * プログラム名を格納します。
	 */
	protected String m_Progname="KU0010B001";

	/**
	 * プログラム名を返します
	 *
	 * @return プログラム名
	 */
	public String getProgname() { return m_Progname; }

	/**
	 * プログラム名をmediatorに格納します
	 *
	 * @param プログラム名
		 */
	public void setProgname(String args) { m_Progname = args; }

	//////////////////////////////

	/**
	 * 処理開始日付を取得します（文字列：YYYY/MM/DD HH24:MI:SS）
	 */
	// java.util.Date mdate = new java.util.Date();
	// java.text.SimpleDateFormat dtformat = new java.text.SimpleDateFormat( "yyyy/MM/dd kk:mm:ss" );
	// protected String Sysdate = dtformat.format(mdate);
	protected String Sysdate = null;

	/**
	 * 処理開始日付を取得します（文字列：YYYY/MM/DD HH24:MI:SS）
	 *
	 * @return 処理日付
	 */
	public String getSysdate() { return Sysdate; }

	/**
	 * 処理日付をmediatorに格納します
	 *
	 * @param 処理日付
		 */
	public void setSysdate( String arg ) { Sysdate = arg; }

	//////////////////////////////

	/**
	 * 登録者/更新者を格納します
	 */
	protected String Username = "orteus_system";

	/**
	 * 登録者/更新者を取得します
	 *
	 * @return 登録者/更新者
	 */
	public String getUsername() { return Username; }

	/**
	 * 登録者/更新者をmediatorに格納します
	 *
	 * @param 登録者/更新者
		 */
	public void setUsername( String arg ) { Username = arg; }

	//////////////////////////////

	/**
	 * 引数情報を格納します
	 */
	protected String[] m_args=null;

	//////////////////////////////

	/**
	 * コマンドラインの引数文字列配列を返します
	 *
	 * @return 引数文字列配列
	 */
	public String[] getArgs() { return m_args; }

	/**
	 * コマンドラインの引数文字列配列をmediatorに格納します
	 *
	 * @param 引数文字列配列
		 */
	public void setArgs(String[] args) { m_args = args; }

	//////////////////////////////

	// mediator変数用(get|set)メソッド

	public String getsysBusinessMEG_CD() { return m_sysBusinessMEG_CD; }
	public String getsysBusinessMEG() { return m_sysBusinessMEG; }
	public String getsysBusinessIN_MEG_CD() { return m_sysBusinessIN_MEG_CD; }
	public String getoprDatePLANT_CD() { return m_oprDatePLANT_CD; }
	public String getoprDateBUSINESS_OPR_DATE() { return m_oprDateBUSINESS_OPR_DATE; }
	public String getoprDateSTOCK_CRITERION_DATE() { return m_oprDateSTOCK_CRITERION_DATE; }
	public String getoprDateIN_PLANTCD() { return m_oprDateIN_PLANTCD; }
	public String getleedTimeSYS_CLASS() { return m_leedTimeSYS_CLASS; }
	public String getleedTimeCLASS_CODE() { return m_leedTimeCLASS_CODE; }
	public String getleedTimeCODE() { return m_leedTimeCODE; }
	public String getreadTAnsDlvDateODR_NO() { return m_readTAnsDlvDateODR_NO; }
	public String getreadTAnsDlvDatePART_DLV_SEQ_NO() { return m_readTAnsDlvDatePART_DLV_SEQ_NO; }
	public String getreadTAnsDlvDatePRVS_ANS_DLV_DATE_RCD() { return m_readTAnsDlvDatePRVS_ANS_DLV_DATE_RCD; }
	public String getreadTAnsDlvDateLAST_ANS_DLV_DATE_RCD() { return m_readTAnsDlvDateLAST_ANS_DLV_DATE_RCD; }
	public String getreadTAnsDlvDateDESINATED_SHIP_DATE() { return m_readTAnsDlvDateDESINATED_SHIP_DATE; }
	public String getreadTAnsDlvDateDESINATED_SHIP_QTY() { return m_readTAnsDlvDateDESINATED_SHIP_QTY; }
	public String getreadTAnsDlvDateREST_SHIP_ODR_QTY() { return m_readTAnsDlvDateREST_SHIP_ODR_QTY; }
	public String getreadTAnsDlvDateSHIP_ODR_CMPLT_FLG() { return m_readTAnsDlvDateSHIP_ODR_CMPLT_FLG; }
	public String getreadTAnsDlvDateDEL_FLG() { return m_readTAnsDlvDateDEL_FLG; }
	public String getreadTAnsDlvDateCUST_ITEM_CD() { return m_readTAnsDlvDateCUST_ITEM_CD; }
	public String getreadTAnsDlvDateITEM_CD() { return m_readTAnsDlvDateITEM_CD; }
	public String getreadTAnsDlvDateCUST_CD() { return m_readTAnsDlvDateCUST_CD; }
	public String getreadTAnsDlvDatePKG_UNIT_QTY() { return m_readTAnsDlvDatePKG_UNIT_QTY; }
	public String getreadTAnsDlvDateCUST_ANAME() { return m_readTAnsDlvDateCUST_ANAME; }
	public String getreadTAnsDlvDateDETAIL_ROUND_TYP() { return m_readTAnsDlvDateDETAIL_ROUND_TYP; }
	public String getreadTAnsDlvDateTRANSPORT_LT() { return m_readTAnsDlvDateTRANSPORT_LT; }
	public String getreadTAnsDlvDateSHIP_WH_CD() { return m_readTAnsDlvDateSHIP_WH_CD; }
	public String getreadTAnsDlvDateDEPO_WH_CD() { return m_readTAnsDlvDateDEPO_WH_CD; }
	public String getreadTAnsDlvDateCUST_ODR_NO() { return m_readTAnsDlvDateCUST_ODR_NO; }
	public String getreadTAnsDlvDateCUST_CHRG_PSN_CD() { return m_readTAnsDlvDateCUST_CHRG_PSN_CD; }
	public String getreadTAnsDlvDateCURRNCY_CD() { return m_readTAnsDlvDateCURRNCY_CD; }
	public String getreadTAnsDlvDateDLV_LOC_CD() { return m_readTAnsDlvDateDLV_LOC_CD; }
	public String getreadTAnsDlvDateDLV_LOC_NAME_KANJI() { return m_readTAnsDlvDateDLV_LOC_NAME_KANJI; }
	public String getreadTAnsDlvDateODR_UNIT_PRICE() { return m_readTAnsDlvDateODR_UNIT_PRICE; }
	public String getreadTAnsDlvDateSHIP_CNT() { return m_readTAnsDlvDateSHIP_CNT; }
	public String getreadTAnsDlvDateDEPO_TYP() { return m_readTAnsDlvDateDEPO_TYP; }
	public String getreadTAnsDlvDateDESINATED_DLV_DATE() { return m_readTAnsDlvDateDESINATED_DLV_DATE; }
	public String getreadTAnsDlvDateODR_QTY() { return m_readTAnsDlvDateODR_QTY; }
	public String getreadTAnsDlvDateUNIT_CD() { return m_readTAnsDlvDateUNIT_CD; }
	public String getreadTAnsDlvDateCUS_DLV_KEY_CD() { return m_readTAnsDlvDateCUS_DLV_KEY_CD; }
	public String getreadTAnsDlvDatePART_NAME() { return m_readTAnsDlvDatePART_NAME; }
	public String getreadTAnsDlvDateUNIT_CD_ORG() { return m_readTAnsDlvDateUNIT_CD_ORG; }
	public String getreadTAnsDlvDatePUCH_ODR_QTY_TOTAL() { return m_readTAnsDlvDatePUCH_ODR_QTY_TOTAL; }
	public String getreadTAnsDlvDateBUYER_NAME() { return m_readTAnsDlvDateBUYER_NAME; }
	public String getreadTAnsDlvDateINSPC_TYP() { return m_readTAnsDlvDateINSPC_TYP; }
	public String getreadTAnsDlvDateCLIENT_REMARK() { return m_readTAnsDlvDateCLIENT_REMARK; }
	public String getreadTAnsDlvDateCLIENT_BARCODE_INF() { return m_readTAnsDlvDateCLIENT_BARCODE_INF; }
	public String getreadTAnsDlvDateTRANSPORT_CD() { return m_readTAnsDlvDateTRANSPORT_CD; }
	public String getreadTAnsDlvDateREMARKS() { return m_readTAnsDlvDateREMARKS; }
	public String getreadTAnsDlvDatePARTIAL_SHIP_INST_FLG() { return m_readTAnsDlvDatePARTIAL_SHIP_INST_FLG; }
	public String getreadTAnsDlvDateEXCH_TYP() { return m_readTAnsDlvDateEXCH_TYP; }
	public String getreadTAnsDlvDateTAX_CD() { return m_readTAnsDlvDateTAX_CD; }
	public String getreadTAnsDlvDateCUR_CD() { return m_readTAnsDlvDateCUR_CD; }
	public String getreadTAnsDlvDateEXCH_TYP_R() { return m_readTAnsDlvDateEXCH_TYP_R; }
	public String getreadTAnsDlvDateCOMPANY_CD() { return m_readTAnsDlvDateCOMPANY_CD; }
	public String getupTAnsDlvDateREST_SHIP_ODR_QTY() { return m_upTAnsDlvDateREST_SHIP_ODR_QTY; }
	public String getupTAnsDlvDateSHIP_ODR_CMPLT_FLG() { return m_upTAnsDlvDateSHIP_ODR_CMPLT_FLG; }
	public String getupTAnsDlvDateIN_PARTDLVSEQNO() { return m_upTAnsDlvDateIN_PARTDLVSEQNO; }
	public String getupTAnsDlvDateIN_ODRNO() { return m_upTAnsDlvDateIN_ODRNO; }
	public String getreadTItemStockITEM_CD() { return m_readTItemStockITEM_CD; }
	public String getreadTItemStockWH_CD() { return m_readTItemStockWH_CD; }
	public String getreadTItemStockPLANT_CD() { return m_readTItemStockPLANT_CD; }
	public String getreadTItemStockSTOCK_ON_HAND_QTY() { return m_readTItemStockSTOCK_ON_HAND_QTY; }
	public String getreadTItemStockWH_TYP() { return m_readTItemStockWH_TYP; }
	public String getreadTItemStockYUKOSU() { return m_readTItemStockYUKOSU; }
	public String getreadTItemStockIN_ITEMCD() { return m_readTItemStockIN_ITEMCD; }
	public String getreadTItemStockIN_WHTYP() { return m_readTItemStockIN_WHTYP; }
	public String getwhSuCOUNT() { return m_whSuCOUNT; }
	public String getwhSuIN_ITEMCD() { return m_whSuIN_ITEMCD; }
	public String getwhSuIN_WHTYP() { return m_whSuIN_WHTYP; }
	public String getcreTShipOdrODR_NO() { return m_creTShipOdrODR_NO; }
	public String getcreTShipOdrPART_DLV_SEQ_NO() { return m_creTShipOdrPART_DLV_SEQ_NO; }
	public String getcreTShipOdrSLIP_CD() { return m_creTShipOdrSLIP_CD; }
	public String getcreTShipOdrITEM_CD() { return m_creTShipOdrITEM_CD; }
	public String getcreTShipOdrCUST_ITEM_CD() { return m_creTShipOdrCUST_ITEM_CD; }
	public String getcreTShipOdrCUST_ODR_NO() { return m_creTShipOdrCUST_ODR_NO; }
	public String getcreTShipOdrCUST_CD() { return m_creTShipOdrCUST_CD; }
	public String getcreTShipOdrCUST_NAME() { return m_creTShipOdrCUST_NAME; }
	public String getcreTShipOdrCUST_CHRG_PSN_CD() { return m_creTShipOdrCUST_CHRG_PSN_CD; }
	public String getcreTShipOdrSHIP_ODR_ISS_PSN_CD() { return m_creTShipOdrSHIP_ODR_ISS_PSN_CD; }
	public String getcreTShipOdrDLV_LOC_CD() { return m_creTShipOdrDLV_LOC_CD; }
	public String getcreTShipOdrDEPO_TYP() { return m_creTShipOdrDEPO_TYP; }
	public String getcreTShipOdrDESINATED_SHIP_DATE() { return m_creTShipOdrDESINATED_SHIP_DATE; }
	public String getcreTShipOdrSHIP_QTY() { return m_creTShipOdrSHIP_QTY; }
	public String getcreTShipOdrUNIT_CD() { return m_creTShipOdrUNIT_CD; }
	public String getcreTShipOdrUNIT_PRICE() { return m_creTShipOdrUNIT_PRICE; }
	public String getcreTShipOdrSHIP_ODR_AMOUNT() { return m_creTShipOdrSHIP_ODR_AMOUNT; }
	public String getcreTShipOdrCURRNCY_CD() { return m_creTShipOdrCURRNCY_CD; }
	public String getcreTShipOdrPKG_UNIT_QTY() { return m_creTShipOdrPKG_UNIT_QTY; }
	public String getcreTShipOdrREMARKS() { return m_creTShipOdrREMARKS; }
	public String getcreTShipOdrTRANSPORT_CD() { return m_creTShipOdrTRANSPORT_CD; }
	public String getcreTShipOdrALLCT_WH_CD() { return m_creTShipOdrALLCT_WH_CD; }
	public String getcreTShipOdrDIRECT_DLV_FLG() { return m_creTShipOdrDIRECT_DLV_FLG; }
	public String getcreTShipOdrSCDL_DLV_DATE() { return m_creTShipOdrSCDL_DLV_DATE; }
	public String getcreTShipOdrDLV_KEY_NO() { return m_creTShipOdrDLV_KEY_NO; }
	public String getcreTShipOdrSHIP_ODR_AMOUNT_EXCH_RATES() { return m_creTShipOdrSHIP_ODR_AMOUNT_EXCH_RATES; }
	public String getcreTShipOdrTRANSFER_WH_CD() { return m_creTShipOdrTRANSFER_WH_CD; }
	public String getcreTShipOdrSHIP_ODR_NO() { return m_creTShipOdrSHIP_ODR_NO; }
	public String getcreTShipOdrJOB_ODR_CD() { return m_creTShipOdrJOB_ODR_CD; }
	public String getcreTShipSlipSLIP_CD() { return m_creTShipSlipSLIP_CD; }
	public String getcreTShipSlipITEM_CD() { return m_creTShipSlipITEM_CD; }
	public String getcreTShipSlipCUST_ITEM_CD() { return m_creTShipSlipCUST_ITEM_CD; }
	public String getcreTShipSlipPART_NAME() { return m_creTShipSlipPART_NAME; }
	public String getcreTShipSlipCUST_ODR_NO() { return m_creTShipSlipCUST_ODR_NO; }
	public String getcreTShipSlipCUST_CD() { return m_creTShipSlipCUST_CD; }
	public String getcreTShipSlipCUST_NAME() { return m_creTShipSlipCUST_NAME; }
	public String getcreTShipSlipDLV_LOC_CD() { return m_creTShipSlipDLV_LOC_CD; }
	public String getcreTShipSlipDLV_LOC_NAME_KANJI() { return m_creTShipSlipDLV_LOC_NAME_KANJI; }
	public String getcreTShipSlipCUS_DLV_KEY_CD() { return m_creTShipSlipCUS_DLV_KEY_CD; }
	public String getcreTShipSlipDESINATED_SHIP_DATE() { return m_creTShipSlipDESINATED_SHIP_DATE; }
	public String getcreTShipSlipDESINATED_DLV_DATE() { return m_creTShipSlipDESINATED_DLV_DATE; }
	public String getcreTShipSlipSCDL_DLV_DATE() { return m_creTShipSlipSCDL_DLV_DATE; }
	public String getcreTShipSlipSHIP_ODR_QTY() { return m_creTShipSlipSHIP_ODR_QTY; }
	public String getcreTShipSlipUNIT_CD() { return m_creTShipSlipUNIT_CD; }
	public String getcreTShipSlipUNIT_PRICE() { return m_creTShipSlipUNIT_PRICE; }
	public String getcreTShipSlipSHIP_ODR_AMOUNT() { return m_creTShipSlipSHIP_ODR_AMOUNT; }
	public String getcreTShipSlipTAX_AMOUNT() { return m_creTShipSlipTAX_AMOUNT; }
	public String getcreTShipSlipINSPC_TYP() { return m_creTShipSlipINSPC_TYP; }
	public String getcreTShipSlipCLIENT_REMARK_KANJI() { return m_creTShipSlipCLIENT_REMARK_KANJI; }
	public String getcreTShipSlipCLIENT_BARCODE_INF() { return m_creTShipSlipCLIENT_BARCODE_INF; }
	public String getcreTShipSlipBUYER_NAME() { return m_creTShipSlipBUYER_NAME; }
	public String getcreTShipSlipPUCH_ODR_QTY_TOTAL() { return m_creTShipSlipPUCH_ODR_QTY_TOTAL; }
	public String getcreTShipSlipDLV_ODR_QTY() { return m_creTShipSlipDLV_ODR_QTY; }
	public String getcreTShipSlipSHIP_ODR_AMOUNT_TAX() { return m_creTShipSlipSHIP_ODR_AMOUNT_TAX; }
	public String getcreTShipSlipTAX_AMOUNT_1() { return m_creTShipSlipTAX_AMOUNT_1; }
	public String getcreTShipSlipTAX_AMOUNT_2() { return m_creTShipSlipTAX_AMOUNT_2; }
	public String getcreTShipSlipTAX_AMOUNT_3() { return m_creTShipSlipTAX_AMOUNT_3; }
	public String getcreTShipSlipOWN_CUR_TAXCREDIT_SALES_AMOUNT() { return m_creTShipSlipOWN_CUR_TAXCREDIT_SALES_AMOUNT; }
	public String getcreTShipSlipEXTERNAL_TAX_SALES_AMOUNT() { return m_creTShipSlipEXTERNAL_TAX_SALES_AMOUNT; }
	public String getcreTShipSlipINTERNAL_TAX_SALES_AMOUNT() { return m_creTShipSlipINTERNAL_TAX_SALES_AMOUNT; }
	public String getcreTShipSlipTAXFREE_SALES_AMOUNT() { return m_creTShipSlipTAXFREE_SALES_AMOUNT; }
	public String getcreTShipSlipEXTERNAL_TAX_AMOUNT() { return m_creTShipSlipEXTERNAL_TAX_AMOUNT; }
	public String getcreTShipSlipINTERNAL_TAX_AMOUNT() { return m_creTShipSlipINTERNAL_TAX_AMOUNT; }
	public String getcreTShipSlipTAX_CREDIT_SALES_AMOUNT() { return m_creTShipSlipTAX_CREDIT_SALES_AMOUNT; }
	public String getcreTUnShipListCUST_CD() { return m_creTUnShipListCUST_CD; }
	public String getcreTUnShipListACPT_ODR_CD() { return m_creTUnShipListACPT_ODR_CD; }
	public String getcreTUnShipListPART_DLV_SEQ_NO() { return m_creTUnShipListPART_DLV_SEQ_NO; }
	public String getcreTUnShipListITEM_CD() { return m_creTUnShipListITEM_CD; }
	public String getcreTUnShipListUN_SHIP_QTY() { return m_creTUnShipListUN_SHIP_QTY; }
	public String getcreTUnShipListUN_SHIP_RSN() { return m_creTUnShipListUN_SHIP_RSN; }
	public String getcreTUnShipListWH_CD() { return m_creTUnShipListWH_CD; }
	public String getUN_SHIP_SEQ_NO() { return m_UN_SHIP_SEQ_NO; }
	public String getuptOdr_IN_ODRNO() { return m_uptOdr_IN_ODRNO; }
	public String getreadTOdrCtlODR_CTL_NO() { return m_readTOdrCtlODR_CTL_NO; }
	public String getreadTOdrCtlITEM_CD() { return m_readTOdrCtlITEM_CD; }
	public String getreadTOdrCtlCUST_ITEM_CD() { return m_readTOdrCtlCUST_ITEM_CD; }
	public String getreadTOdrCtlCUST_CD() { return m_readTOdrCtlCUST_CD; }
	public String getreadTOdrCtlDEL_FLG() { return m_readTOdrCtlDEL_FLG; }
	public String getreadTOdrCtlIN_ODRCTLNO() { return m_readTOdrCtlIN_ODRCTLNO; }
	public String getreadMCustCOMPANY_CD() { return m_readMCustCOMPANY_CD; }
	public String getreadMCustCUST_CD() { return m_readMCustCUST_CD; }
	public String getreadMCustCUST_ANAME() { return m_readMCustCUST_ANAME; }
	public String getreadMCustIN_COMPANYCD() { return m_readMCustIN_COMPANYCD; }
	public String getreadMCustIN_CUSTCD() { return m_readMCustIN_CUSTCD; }
	public String getreadMItemITEM_CD() { return m_readMItemITEM_CD; }
	public String getreadMItemPKG_UNIT_QTY() { return m_readMItemPKG_UNIT_QTY; }
	public String getreadMItemUNIT_WEIGHT() { return m_readMItemUNIT_WEIGHT; }
	public String getreadMItemIN_ITEMCD() { return m_readMItemIN_ITEMCD; }
	public String getreadMCustBaseCOMPANY_CD() { return m_readMCustBaseCOMPANY_CD; }
	public String getreadMCustBaseCUST_CD() { return m_readMCustBaseCUST_CD; }
	public String getreadMCustBaseDLV_LOC_CD() { return m_readMCustBaseDLV_LOC_CD; }
	public String getreadMCustBaseTRANSPORT_LT() { return m_readMCustBaseTRANSPORT_LT; }
	public String getreadMCustBaseDEL_FLG() { return m_readMCustBaseDEL_FLG; }
	public String getreadMCustBaseREMARKS_1() { return m_readMCustBaseREMARKS_1; }
	public String getreadMCustBaseIN_COMPANYCD() { return m_readMCustBaseIN_COMPANYCD; }
	public String getreadMCustBaseIN_CUSTCD() { return m_readMCustBaseIN_CUSTCD; }
	public String getreadMCustBaseIN_DLVLOCCD() { return m_readMCustBaseIN_DLVLOCCD; }
	public String getunShipRsnSYS_CLASS() { return m_unShipRsnSYS_CLASS; }
	public String getunShipRsnCLASS_CODE() { return m_unShipRsnCLASS_CODE; }
	public String getunShipRsnCODE() { return m_unShipRsnCODE; }
	public String getunShipRsnCODE_NAME() { return m_unShipRsnCODE_NAME; }
	public String getunShipRsnIN_SYSCLASS() { return m_unShipRsnIN_SYSCLASS; }
	public String getunShipRsnIN_CLASSCODE() { return m_unShipRsnIN_CLASSCODE; }
	public String getunShipRsnIN_CODE() { return m_unShipRsnIN_CODE; }
	public String getchkUnitPriceUNIT_COST() { return m_chkUnitPriceUNIT_COST; }
	public String getchkUnitPriceEFF_PHASE_IN_DATE() { return m_chkUnitPriceEFF_PHASE_IN_DATE; }
	public String getchkUnitPriceIN_COMPANYCD() { return m_chkUnitPriceIN_COMPANYCD; }
	public String getchkUnitPriceIN_CUSTCD() { return m_chkUnitPriceIN_CUSTCD; }
	public String getchkUnitPriceIN_ITEMCD() { return m_chkUnitPriceIN_ITEMCD; }
	public String getchkUnitPriceIN_EFFPHASEINDATE() { return m_chkUnitPriceIN_EFFPHASEINDATE; }
	public String getstrTaxTAX_KBN() { return m_strTaxTAX_KBN; }
	public String getstrTaxOLD_TAX() { return m_strTaxOLD_TAX; }
	public String getstrTaxNEW_TAX() { return m_strTaxNEW_TAX; }
	public String getstrTaxSTART_DATE() { return m_strTaxSTART_DATE; }
	public String getstrTaxROUND_TYP() { return m_strTaxROUND_TYP; }
	public String getstrTaxIN_COMPANYCD() { return m_strTaxIN_COMPANYCD; }
	public String getstrTaxIN_CUSTCD() { return m_strTaxIN_CUSTCD; }
	public String getstrTaxIN_ITEMCD() { return m_strTaxIN_ITEMCD; }
	public String getstrYotaku_WH_CD() { return m_strYotaku_WH_CD; }
	public String getstrYotaku_IN_WH_TYP() { return m_strYotaku_IN_WH_TYP; }
	public String getstrCOMPANY_CD() { return m_strCOMPANY_CD; }
	public String getstrBUSINESS_OPR_DATE() { return m_strBUSINESS_OPR_DATE; }
	public String getstrPLANT_CD() { return m_strPLANT_CD; }
	public String getstrSHIP_QTY_SUM() { return m_strSHIP_QTY_SUM; }
	public String getstrTaxOLD_TAX_1() { return m_strTaxOLD_TAX_1; }
	public String getstrTaxOLD_TAX_2() { return m_strTaxOLD_TAX_2; }
	public String getstrTaxOLD_TAX_3() { return m_strTaxOLD_TAX_3; }
	public String getstrTaxNEW_TAX_1() { return m_strTaxNEW_TAX_1; }
	public String getstrTaxNEW_TAX_2() { return m_strTaxNEW_TAX_2; }
	public String getstrTaxNEW_TAX_3() { return m_strTaxNEW_TAX_3; }
	public String getstrINSPC_ACPT_TYP() { return m_strINSPC_ACPT_TYP; }
	public String getstrTaxIN_TAXCD() { return m_strTaxIN_TAXCD; }
	public Double geterrCTL_SEQ_NO() { return m_errCTL_SEQ_NO; }
	public String geterrSTATUS() { return m_errSTATUS; }
	public String geterrMSSGE_CD() { return m_errMSSGE_CD; }
	public String geterrMSSGE() { return m_errMSSGE; }
	public String geterrCUST_CD() { return m_errCUST_CD; }
	public String geterrCUST_ITEM_CD() { return m_errCUST_ITEM_CD; }
	public String geterrITEM_CD() { return m_errITEM_CD; }
	public String geterrCUST_ODR_NO() { return m_errCUST_ODR_NO; }
	public String geterrCUST_CHRG_PSN_CD() { return m_errCUST_CHRG_PSN_CD; }
	public String geterrERR_REC_TYPE() { return m_errERR_REC_TYPE; }
	public Double geterrACTUAL_UNIT_PRICE() { return m_errACTUAL_UNIT_PRICE; }
	public Double geterrMASTER_UNIT_PRICE() { return m_errMASTER_UNIT_PRICE; }
	public Double geterrQTY() { return m_errQTY; }
	public String geterrODR_NO() { return m_errODR_NO; }
	public String geterrDESINATED_DLV_DATE() { return m_errDESINATED_DLV_DATE; }
	public String geterrSLIP_NO() { return m_errSLIP_NO; }
	public Double geterrIF_CTL_NO() { return m_errIF_CTL_NO; }
	public String geterrPROC_TYP() { return m_errPROC_TYP; }
	public Double geterrODR_SEQ() { return m_errODR_SEQ; }
	public String getstrDECIMAL_FIG() { return m_strDECIMAL_FIG; }
	public String getstrCUR_CD() { return m_strCUR_CD; }
	public String getstrSYS_CLASS_CODE() { return m_strSYS_CLASS_CODE; }
	public String getstrJOB_ODR_CD() { return m_strJOB_ODR_CD; }
	public String getreadTJOBODRODRALCPLANT_CD() { return m_readTJOBODRODRALCPLANT_CD; }
	public String getreadTJOBODRCDSTOCK_WHCD() { return m_readTJOBODRCDSTOCK_WHCD; }
	public String getreadTJOBODRCDSTOCK_PBL_SHIP_QTY() { return m_readTJOBODRCDSTOCK_PBL_SHIP_QTY; }
	public String getreadTJOBODRCDSTOCKITEM_CD() { return m_readTJOBODRCDSTOCKITEM_CD; }
	public String getreadTJOBODRCDSTOCKIN_WHCD() { return m_readTJOBODRCDSTOCKIN_WHCD; }
	public void setsysBusinessMEG_CD(String arg) { m_sysBusinessMEG_CD = arg; }
	public void setsysBusinessMEG(String arg) { m_sysBusinessMEG = arg; }
	public void setsysBusinessIN_MEG_CD(String arg) { m_sysBusinessIN_MEG_CD = arg; }
	public void setoprDatePLANT_CD(String arg) { m_oprDatePLANT_CD = arg; }
	public void setoprDateBUSINESS_OPR_DATE(String arg) { m_oprDateBUSINESS_OPR_DATE = arg; }
	public void setoprDateSTOCK_CRITERION_DATE(String arg) { m_oprDateSTOCK_CRITERION_DATE = arg; }
	public void setoprDateIN_PLANTCD(String arg) { m_oprDateIN_PLANTCD = arg; }
	public void setleedTimeSYS_CLASS(String arg) { m_leedTimeSYS_CLASS = arg; }
	public void setleedTimeCLASS_CODE(String arg) { m_leedTimeCLASS_CODE = arg; }
	public void setleedTimeCODE(String arg) { m_leedTimeCODE = arg; }
	public void setreadTAnsDlvDateODR_NO(String arg) { m_readTAnsDlvDateODR_NO = arg; }
	public void setreadTAnsDlvDatePART_DLV_SEQ_NO(String arg) { m_readTAnsDlvDatePART_DLV_SEQ_NO = arg; }
	public void setreadTAnsDlvDatePRVS_ANS_DLV_DATE_RCD(String arg) { m_readTAnsDlvDatePRVS_ANS_DLV_DATE_RCD = arg; }
	public void setreadTAnsDlvDateLAST_ANS_DLV_DATE_RCD(String arg) { m_readTAnsDlvDateLAST_ANS_DLV_DATE_RCD = arg; }
	public void setreadTAnsDlvDateDESINATED_SHIP_DATE(String arg) { m_readTAnsDlvDateDESINATED_SHIP_DATE = arg; }
	public void setreadTAnsDlvDateDESINATED_SHIP_QTY(String arg) { m_readTAnsDlvDateDESINATED_SHIP_QTY = arg; }
	public void setreadTAnsDlvDateREST_SHIP_ODR_QTY(String arg) { m_readTAnsDlvDateREST_SHIP_ODR_QTY = arg; }
	public void setreadTAnsDlvDateSHIP_ODR_CMPLT_FLG(String arg) { m_readTAnsDlvDateSHIP_ODR_CMPLT_FLG = arg; }
	public void setreadTAnsDlvDateDEL_FLG(String arg) { m_readTAnsDlvDateDEL_FLG = arg; }
	public void setreadTAnsDlvDateCUST_ITEM_CD(String arg) { m_readTAnsDlvDateCUST_ITEM_CD = arg; }
	public void setreadTAnsDlvDateITEM_CD(String arg) { m_readTAnsDlvDateITEM_CD = arg; }
	public void setreadTAnsDlvDateCUST_CD(String arg) { m_readTAnsDlvDateCUST_CD = arg; }
	public void setreadTAnsDlvDatePKG_UNIT_QTY(String arg) { m_readTAnsDlvDatePKG_UNIT_QTY = arg; }
	public void setreadTAnsDlvDateCUST_ANAME(String arg) { m_readTAnsDlvDateCUST_ANAME = arg; }
	public void setreadTAnsDlvDateDETAIL_ROUND_TYP(String arg) { m_readTAnsDlvDateDETAIL_ROUND_TYP = arg; }
	public void setreadTAnsDlvDateTRANSPORT_LT(String arg) { m_readTAnsDlvDateTRANSPORT_LT = arg; }
	public void setreadTAnsDlvDateSHIP_WH_CD(String arg) { m_readTAnsDlvDateSHIP_WH_CD = arg; }
	public void setreadTAnsDlvDateDEPO_WH_CD(String arg) { m_readTAnsDlvDateDEPO_WH_CD = arg; }
	public void setreadTAnsDlvDateCUST_ODR_NO(String arg) { m_readTAnsDlvDateCUST_ODR_NO = arg; }
	public void setreadTAnsDlvDateCUST_CHRG_PSN_CD(String arg) { m_readTAnsDlvDateCUST_CHRG_PSN_CD = arg; }
	public void setreadTAnsDlvDateCURRNCY_CD(String arg) { m_readTAnsDlvDateCURRNCY_CD = arg; }
	public void setreadTAnsDlvDateDLV_LOC_CD(String arg) { m_readTAnsDlvDateDLV_LOC_CD = arg; }
	public void setreadTAnsDlvDateDLV_LOC_NAME_KANJI(String arg) { m_readTAnsDlvDateDLV_LOC_NAME_KANJI = arg; }
	public void setreadTAnsDlvDateODR_UNIT_PRICE(String arg) { m_readTAnsDlvDateODR_UNIT_PRICE = arg; }
	public void setreadTAnsDlvDateSHIP_CNT(String arg) { m_readTAnsDlvDateSHIP_CNT = arg; }
	public void setreadTAnsDlvDateDEPO_TYP(String arg) { m_readTAnsDlvDateDEPO_TYP = arg; }
	public void setreadTAnsDlvDateDESINATED_DLV_DATE(String arg) { m_readTAnsDlvDateDESINATED_DLV_DATE = arg; }
	public void setreadTAnsDlvDateODR_QTY(String arg) { m_readTAnsDlvDateODR_QTY = arg; }
	public void setreadTAnsDlvDateUNIT_CD(String arg) { m_readTAnsDlvDateUNIT_CD = arg; }
	public void setreadTAnsDlvDateCUS_DLV_KEY_CD(String arg) { m_readTAnsDlvDateCUS_DLV_KEY_CD = arg; }
	public void setreadTAnsDlvDatePART_NAME(String arg) { m_readTAnsDlvDatePART_NAME = arg; }
	public void setreadTAnsDlvDateUNIT_CD_ORG(String arg) { m_readTAnsDlvDateUNIT_CD_ORG = arg; }
	public void setreadTAnsDlvDatePUCH_ODR_QTY_TOTAL(String arg) { m_readTAnsDlvDatePUCH_ODR_QTY_TOTAL = arg; }
	public void setreadTAnsDlvDateBUYER_NAME(String arg) { m_readTAnsDlvDateBUYER_NAME = arg; }
	public void setreadTAnsDlvDateINSPC_TYP(String arg) { m_readTAnsDlvDateINSPC_TYP = arg; }
	public void setreadTAnsDlvDateCLIENT_REMARK(String arg) { m_readTAnsDlvDateCLIENT_REMARK = arg; }
	public void setreadTAnsDlvDateCLIENT_BARCODE_INF(String arg) { m_readTAnsDlvDateCLIENT_BARCODE_INF = arg; }
	public void setreadTAnsDlvDateTRANSPORT_CD(String arg) { m_readTAnsDlvDateTRANSPORT_CD = arg; }
	public void setreadTAnsDlvDateREMARKS(String arg) { m_readTAnsDlvDateREMARKS = arg; }
	public void setreadTAnsDlvDatePARTIAL_SHIP_INST_FLG(String arg) { m_readTAnsDlvDatePARTIAL_SHIP_INST_FLG = arg; }
	public void setreadTAnsDlvDateEXCH_TYP(String arg) { m_readTAnsDlvDateEXCH_TYP = arg; }
	public void setreadTAnsDlvDateTAX_CD(String arg) { m_readTAnsDlvDateTAX_CD = arg; }
	public void setreadTAnsDlvDateCUR_CD(String arg) { m_readTAnsDlvDateCUR_CD = arg; }
	public void setreadTAnsDlvDateEXCH_TYP_R(String arg) { m_readTAnsDlvDateEXCH_TYP_R = arg; }
	public void setreadTAnsDlvDateCOMPANY_CD(String arg) { m_readTAnsDlvDateCOMPANY_CD = arg; }
	public void setupTAnsDlvDateREST_SHIP_ODR_QTY(String arg) { m_upTAnsDlvDateREST_SHIP_ODR_QTY = arg; }
	public void setupTAnsDlvDateSHIP_ODR_CMPLT_FLG(String arg) { m_upTAnsDlvDateSHIP_ODR_CMPLT_FLG = arg; }
	public void setupTAnsDlvDateIN_PARTDLVSEQNO(String arg) { m_upTAnsDlvDateIN_PARTDLVSEQNO = arg; }
	public void setupTAnsDlvDateIN_ODRNO(String arg) { m_upTAnsDlvDateIN_ODRNO = arg; }
	public void setreadTItemStockITEM_CD(String arg) { m_readTItemStockITEM_CD = arg; }
	public void setreadTItemStockWH_CD(String arg) { m_readTItemStockWH_CD = arg; }
	public void setreadTItemStockPLANT_CD(String arg) { m_readTItemStockPLANT_CD = arg; }
	public void setreadTItemStockSTOCK_ON_HAND_QTY(String arg) { m_readTItemStockSTOCK_ON_HAND_QTY = arg; }
	public void setreadTItemStockWH_TYP(String arg) { m_readTItemStockWH_TYP = arg; }
	public void setreadTItemStockYUKOSU(String arg) { m_readTItemStockYUKOSU = arg; }
	public void setreadTItemStockIN_ITEMCD(String arg) { m_readTItemStockIN_ITEMCD = arg; }
	public void setreadTItemStockIN_WHTYP(String arg) { m_readTItemStockIN_WHTYP = arg; }
	public void setwhSuCOUNT(String arg) { m_whSuCOUNT = arg; }
	public void setwhSuIN_ITEMCD(String arg) { m_whSuIN_ITEMCD = arg; }
	public void setwhSuIN_WHTYP(String arg) { m_whSuIN_WHTYP = arg; }
	public void setcreTShipOdrODR_NO(String arg) { m_creTShipOdrODR_NO = arg; }
	public void setcreTShipOdrPART_DLV_SEQ_NO(String arg) { m_creTShipOdrPART_DLV_SEQ_NO = arg; }
	public void setcreTShipOdrSLIP_CD(String arg) { m_creTShipOdrSLIP_CD = arg; }
	public void setcreTShipOdrITEM_CD(String arg) { m_creTShipOdrITEM_CD = arg; }
	public void setcreTShipOdrCUST_ITEM_CD(String arg) { m_creTShipOdrCUST_ITEM_CD = arg; }
	public void setcreTShipOdrCUST_ODR_NO(String arg) { m_creTShipOdrCUST_ODR_NO = arg; }
	public void setcreTShipOdrCUST_CD(String arg) { m_creTShipOdrCUST_CD = arg; }
	public void setcreTShipOdrCUST_NAME(String arg) { m_creTShipOdrCUST_NAME = arg; }
	public void setcreTShipOdrCUST_CHRG_PSN_CD(String arg) { m_creTShipOdrCUST_CHRG_PSN_CD = arg; }
	public void setcreTShipOdrSHIP_ODR_ISS_PSN_CD(String arg) { m_creTShipOdrSHIP_ODR_ISS_PSN_CD = arg; }
	public void setcreTShipOdrDLV_LOC_CD(String arg) { m_creTShipOdrDLV_LOC_CD = arg; }
	public void setcreTShipOdrDEPO_TYP(String arg) { m_creTShipOdrDEPO_TYP = arg; }
	public void setcreTShipOdrDESINATED_SHIP_DATE(String arg) { m_creTShipOdrDESINATED_SHIP_DATE = arg; }
	public void setcreTShipOdrSHIP_QTY(String arg) { m_creTShipOdrSHIP_QTY = arg; }
	public void setcreTShipOdrUNIT_CD(String arg) { m_creTShipOdrUNIT_CD = arg; }
	public void setcreTShipOdrUNIT_PRICE(String arg) { m_creTShipOdrUNIT_PRICE = arg; }
	public void setcreTShipOdrSHIP_ODR_AMOUNT(String arg) { m_creTShipOdrSHIP_ODR_AMOUNT = arg; }
	public void setcreTShipOdrCURRNCY_CD(String arg) { m_creTShipOdrCURRNCY_CD = arg; }
	public void setcreTShipOdrPKG_UNIT_QTY(String arg) { m_creTShipOdrPKG_UNIT_QTY = arg; }
	public void setcreTShipOdrREMARKS(String arg) { m_creTShipOdrREMARKS = arg; }
	public void setcreTShipOdrTRANSPORT_CD(String arg) { m_creTShipOdrTRANSPORT_CD = arg; }
	public void setcreTShipOdrALLCT_WH_CD(String arg) { m_creTShipOdrALLCT_WH_CD = arg; }
	public void setcreTShipOdrDIRECT_DLV_FLG(String arg) { m_creTShipOdrDIRECT_DLV_FLG = arg; }
	public void setcreTShipOdrSCDL_DLV_DATE(String arg) { m_creTShipOdrSCDL_DLV_DATE = arg; }
	public void setcreTShipOdrDLV_KEY_NO(String arg) { m_creTShipOdrDLV_KEY_NO = arg; }
	public void setcreTShipOdrSHIP_ODR_AMOUNT_EXCH_RATES(String arg) { m_creTShipOdrSHIP_ODR_AMOUNT_EXCH_RATES = arg; }
	public void setcreTShipOdrTRANSFER_WH_CD(String arg) { m_creTShipOdrTRANSFER_WH_CD = arg; }
	public void setcreTShipOdrSHIP_ODR_NO(String arg) { m_creTShipOdrSHIP_ODR_NO = arg; }
	public void setcreTShipOdrJOB_ODR_CD(String arg) { m_creTShipOdrJOB_ODR_CD = arg; }
	public void setcreTShipSlipSLIP_CD(String arg) { m_creTShipSlipSLIP_CD = arg; }
	public void setcreTShipSlipITEM_CD(String arg) { m_creTShipSlipITEM_CD = arg; }
	public void setcreTShipSlipCUST_ITEM_CD(String arg) { m_creTShipSlipCUST_ITEM_CD = arg; }
	public void setcreTShipSlipPART_NAME(String arg) { m_creTShipSlipPART_NAME = arg; }
	public void setcreTShipSlipCUST_ODR_NO(String arg) { m_creTShipSlipCUST_ODR_NO = arg; }
	public void setcreTShipSlipCUST_CD(String arg) { m_creTShipSlipCUST_CD = arg; }
	public void setcreTShipSlipCUST_NAME(String arg) { m_creTShipSlipCUST_NAME = arg; }
	public void setcreTShipSlipDLV_LOC_CD(String arg) { m_creTShipSlipDLV_LOC_CD = arg; }
	public void setcreTShipSlipDLV_LOC_NAME_KANJI(String arg) { m_creTShipSlipDLV_LOC_NAME_KANJI = arg; }
	public void setcreTShipSlipCUS_DLV_KEY_CD(String arg) { m_creTShipSlipCUS_DLV_KEY_CD = arg; }
	public void setcreTShipSlipDESINATED_SHIP_DATE(String arg) { m_creTShipSlipDESINATED_SHIP_DATE = arg; }
	public void setcreTShipSlipDESINATED_DLV_DATE(String arg) { m_creTShipSlipDESINATED_DLV_DATE = arg; }
	public void setcreTShipSlipSCDL_DLV_DATE(String arg) { m_creTShipSlipSCDL_DLV_DATE = arg; }
	public void setcreTShipSlipSHIP_ODR_QTY(String arg) { m_creTShipSlipSHIP_ODR_QTY = arg; }
	public void setcreTShipSlipUNIT_CD(String arg) { m_creTShipSlipUNIT_CD = arg; }
	public void setcreTShipSlipUNIT_PRICE(String arg) { m_creTShipSlipUNIT_PRICE = arg; }
	public void setcreTShipSlipSHIP_ODR_AMOUNT(String arg) { m_creTShipSlipSHIP_ODR_AMOUNT = arg; }
	public void setcreTShipSlipTAX_AMOUNT(String arg) { m_creTShipSlipTAX_AMOUNT = arg; }
	public void setcreTShipSlipINSPC_TYP(String arg) { m_creTShipSlipINSPC_TYP = arg; }
	public void setcreTShipSlipCLIENT_REMARK_KANJI(String arg) { m_creTShipSlipCLIENT_REMARK_KANJI = arg; }
	public void setcreTShipSlipCLIENT_BARCODE_INF(String arg) { m_creTShipSlipCLIENT_BARCODE_INF = arg; }
	public void setcreTShipSlipBUYER_NAME(String arg) { m_creTShipSlipBUYER_NAME = arg; }
	public void setcreTShipSlipPUCH_ODR_QTY_TOTAL(String arg) { m_creTShipSlipPUCH_ODR_QTY_TOTAL = arg; }
	public void setcreTShipSlipDLV_ODR_QTY(String arg) { m_creTShipSlipDLV_ODR_QTY = arg; }
	public void setcreTShipSlipSHIP_ODR_AMOUNT_TAX(String arg) { m_creTShipSlipSHIP_ODR_AMOUNT_TAX = arg; }
	public void setcreTShipSlipTAX_AMOUNT_1(String arg) { m_creTShipSlipTAX_AMOUNT_1 = arg; }
	public void setcreTShipSlipTAX_AMOUNT_2(String arg) { m_creTShipSlipTAX_AMOUNT_2 = arg; }
	public void setcreTShipSlipTAX_AMOUNT_3(String arg) { m_creTShipSlipTAX_AMOUNT_3 = arg; }
	public void setcreTShipSlipOWN_CUR_TAXCREDIT_SALES_AMOUNT(String arg) { m_creTShipSlipOWN_CUR_TAXCREDIT_SALES_AMOUNT = arg; }
	public void setcreTShipSlipEXTERNAL_TAX_SALES_AMOUNT(String arg) { m_creTShipSlipEXTERNAL_TAX_SALES_AMOUNT = arg; }
	public void setcreTShipSlipINTERNAL_TAX_SALES_AMOUNT(String arg) { m_creTShipSlipINTERNAL_TAX_SALES_AMOUNT = arg; }
	public void setcreTShipSlipTAXFREE_SALES_AMOUNT(String arg) { m_creTShipSlipTAXFREE_SALES_AMOUNT = arg; }
	public void setcreTShipSlipEXTERNAL_TAX_AMOUNT(String arg) { m_creTShipSlipEXTERNAL_TAX_AMOUNT = arg; }
	public void setcreTShipSlipINTERNAL_TAX_AMOUNT(String arg) { m_creTShipSlipINTERNAL_TAX_AMOUNT = arg; }
	public void setcreTShipSlipTAX_CREDIT_SALES_AMOUNT(String arg) { m_creTShipSlipTAX_CREDIT_SALES_AMOUNT = arg; }
	public void setcreTUnShipListCUST_CD(String arg) { m_creTUnShipListCUST_CD = arg; }
	public void setcreTUnShipListACPT_ODR_CD(String arg) { m_creTUnShipListACPT_ODR_CD = arg; }
	public void setcreTUnShipListPART_DLV_SEQ_NO(String arg) { m_creTUnShipListPART_DLV_SEQ_NO = arg; }
	public void setcreTUnShipListITEM_CD(String arg) { m_creTUnShipListITEM_CD = arg; }
	public void setcreTUnShipListUN_SHIP_QTY(String arg) { m_creTUnShipListUN_SHIP_QTY = arg; }
	public void setcreTUnShipListUN_SHIP_RSN(String arg) { m_creTUnShipListUN_SHIP_RSN = arg; }
	public void setcreTUnShipListWH_CD(String arg) { m_creTUnShipListWH_CD = arg; }
	public void setUN_SHIP_SEQ_NO(String arg) { m_UN_SHIP_SEQ_NO = arg; }
	public void setuptOdr_IN_ODRNO(String arg) { m_uptOdr_IN_ODRNO = arg; }
	public void setreadTOdrCtlODR_CTL_NO(String arg) { m_readTOdrCtlODR_CTL_NO = arg; }
	public void setreadTOdrCtlITEM_CD(String arg) { m_readTOdrCtlITEM_CD = arg; }
	public void setreadTOdrCtlCUST_ITEM_CD(String arg) { m_readTOdrCtlCUST_ITEM_CD = arg; }
	public void setreadTOdrCtlCUST_CD(String arg) { m_readTOdrCtlCUST_CD = arg; }
	public void setreadTOdrCtlDEL_FLG(String arg) { m_readTOdrCtlDEL_FLG = arg; }
	public void setreadTOdrCtlIN_ODRCTLNO(String arg) { m_readTOdrCtlIN_ODRCTLNO = arg; }
	public void setreadMCustCOMPANY_CD(String arg) { m_readMCustCOMPANY_CD = arg; }
	public void setreadMCustCUST_CD(String arg) { m_readMCustCUST_CD = arg; }
	public void setreadMCustCUST_ANAME(String arg) { m_readMCustCUST_ANAME = arg; }
	public void setreadMCustIN_COMPANYCD(String arg) { m_readMCustIN_COMPANYCD = arg; }
	public void setreadMCustIN_CUSTCD(String arg) { m_readMCustIN_CUSTCD = arg; }
	public void setreadMItemITEM_CD(String arg) { m_readMItemITEM_CD = arg; }
	public void setreadMItemPKG_UNIT_QTY(String arg) { m_readMItemPKG_UNIT_QTY = arg; }
	public void setreadMItemUNIT_WEIGHT(String arg) { m_readMItemUNIT_WEIGHT = arg; }
	public void setreadMItemIN_ITEMCD(String arg) { m_readMItemIN_ITEMCD = arg; }
	public void setreadMCustBaseCOMPANY_CD(String arg) { m_readMCustBaseCOMPANY_CD = arg; }
	public void setreadMCustBaseCUST_CD(String arg) { m_readMCustBaseCUST_CD = arg; }
	public void setreadMCustBaseDLV_LOC_CD(String arg) { m_readMCustBaseDLV_LOC_CD = arg; }
	public void setreadMCustBaseTRANSPORT_LT(String arg) { m_readMCustBaseTRANSPORT_LT = arg; }
	public void setreadMCustBaseDEL_FLG(String arg) { m_readMCustBaseDEL_FLG = arg; }
	public void setreadMCustBaseREMARKS_1(String arg) { m_readMCustBaseREMARKS_1 = arg; }
	public void setreadMCustBaseIN_COMPANYCD(String arg) { m_readMCustBaseIN_COMPANYCD = arg; }
	public void setreadMCustBaseIN_CUSTCD(String arg) { m_readMCustBaseIN_CUSTCD = arg; }
	public void setreadMCustBaseIN_DLVLOCCD(String arg) { m_readMCustBaseIN_DLVLOCCD = arg; }
	public void setunShipRsnSYS_CLASS(String arg) { m_unShipRsnSYS_CLASS = arg; }
	public void setunShipRsnCLASS_CODE(String arg) { m_unShipRsnCLASS_CODE = arg; }
	public void setunShipRsnCODE(String arg) { m_unShipRsnCODE = arg; }
	public void setunShipRsnCODE_NAME(String arg) { m_unShipRsnCODE_NAME = arg; }
	public void setunShipRsnIN_SYSCLASS(String arg) { m_unShipRsnIN_SYSCLASS = arg; }
	public void setunShipRsnIN_CLASSCODE(String arg) { m_unShipRsnIN_CLASSCODE = arg; }
	public void setunShipRsnIN_CODE(String arg) { m_unShipRsnIN_CODE = arg; }
	public void setchkUnitPriceUNIT_COST(String arg) { m_chkUnitPriceUNIT_COST = arg; }
	public void setchkUnitPriceEFF_PHASE_IN_DATE(String arg) { m_chkUnitPriceEFF_PHASE_IN_DATE = arg; }
	public void setchkUnitPriceIN_COMPANYCD(String arg) { m_chkUnitPriceIN_COMPANYCD = arg; }
	public void setchkUnitPriceIN_CUSTCD(String arg) { m_chkUnitPriceIN_CUSTCD = arg; }
	public void setchkUnitPriceIN_ITEMCD(String arg) { m_chkUnitPriceIN_ITEMCD = arg; }
	public void setchkUnitPriceIN_EFFPHASEINDATE(String arg) { m_chkUnitPriceIN_EFFPHASEINDATE = arg; }
	public void setstrTaxTAX_KBN(String arg) { m_strTaxTAX_KBN = arg; }
	public void setstrTaxOLD_TAX(String arg) { m_strTaxOLD_TAX = arg; }
	public void setstrTaxNEW_TAX(String arg) { m_strTaxNEW_TAX = arg; }
	public void setstrTaxSTART_DATE(String arg) { m_strTaxSTART_DATE = arg; }
	public void setstrTaxROUND_TYP(String arg) { m_strTaxROUND_TYP = arg; }
	public void setstrTaxIN_COMPANYCD(String arg) { m_strTaxIN_COMPANYCD = arg; }
	public void setstrTaxIN_CUSTCD(String arg) { m_strTaxIN_CUSTCD = arg; }
	public void setstrTaxIN_ITEMCD(String arg) { m_strTaxIN_ITEMCD = arg; }
	public void setstrYotaku_WH_CD(String arg) { m_strYotaku_WH_CD = arg; }
	public void setstrYotaku_IN_WH_TYP(String arg) { m_strYotaku_IN_WH_TYP = arg; }
	public void setstrCOMPANY_CD(String arg) { m_strCOMPANY_CD = arg; }
	public void setstrBUSINESS_OPR_DATE(String arg) { m_strBUSINESS_OPR_DATE = arg; }
	public void setstrPLANT_CD(String arg) { m_strPLANT_CD = arg; }
	public void setstrSHIP_QTY_SUM(String arg) { m_strSHIP_QTY_SUM = arg; }
	public void setstrTaxOLD_TAX_1(String arg) { m_strTaxOLD_TAX_1 = arg; }
	public void setstrTaxOLD_TAX_2(String arg) { m_strTaxOLD_TAX_2 = arg; }
	public void setstrTaxOLD_TAX_3(String arg) { m_strTaxOLD_TAX_3 = arg; }
	public void setstrTaxNEW_TAX_1(String arg) { m_strTaxNEW_TAX_1 = arg; }
	public void setstrTaxNEW_TAX_2(String arg) { m_strTaxNEW_TAX_2 = arg; }
	public void setstrTaxNEW_TAX_3(String arg) { m_strTaxNEW_TAX_3 = arg; }
	public void setstrINSPC_ACPT_TYP(String arg) { m_strINSPC_ACPT_TYP = arg; }
	public void setstrTaxIN_TAXCD(String arg) { m_strTaxIN_TAXCD = arg; }
	public void seterrCTL_SEQ_NO(Double arg) { m_errCTL_SEQ_NO = arg; }
	public void seterrSTATUS(String arg) { m_errSTATUS = arg; }
	public void seterrMSSGE_CD(String arg) { m_errMSSGE_CD = arg; }
	public void seterrMSSGE(String arg) { m_errMSSGE = arg; }
	public void seterrCUST_CD(String arg) { m_errCUST_CD = arg; }
	public void seterrCUST_ITEM_CD(String arg) { m_errCUST_ITEM_CD = arg; }
	public void seterrITEM_CD(String arg) { m_errITEM_CD = arg; }
	public void seterrCUST_ODR_NO(String arg) { m_errCUST_ODR_NO = arg; }
	public void seterrCUST_CHRG_PSN_CD(String arg) { m_errCUST_CHRG_PSN_CD = arg; }
	public void seterrERR_REC_TYPE(String arg) { m_errERR_REC_TYPE = arg; }
	public void seterrACTUAL_UNIT_PRICE(Double arg) { m_errACTUAL_UNIT_PRICE = arg; }
	public void seterrMASTER_UNIT_PRICE(Double arg) { m_errMASTER_UNIT_PRICE = arg; }
	public void seterrQTY(Double arg) { m_errQTY = arg; }
	public void seterrODR_NO(String arg) { m_errODR_NO = arg; }
	public void seterrDESINATED_DLV_DATE(String arg) { m_errDESINATED_DLV_DATE = arg; }
	public void seterrSLIP_NO(String arg) { m_errSLIP_NO = arg; }
	public void seterrIF_CTL_NO(Double arg) { m_errIF_CTL_NO = arg; }
	public void seterrPROC_TYP(String arg) { m_errPROC_TYP = arg; }
	public void seterrODR_SEQ(Double arg) { m_errODR_SEQ = arg; }
	public void setstrDECIMAL_FIG(String arg) { m_strDECIMAL_FIG = arg; }
	public void setstrCUR_CD(String arg) { m_strCUR_CD = arg; }
	public void setstrSYS_CLASS_CODE(String arg) { m_strSYS_CLASS_CODE = arg; }
	public void setstrJOB_ODR_CD(String arg) { m_strJOB_ODR_CD = arg; }
	public void setreadTJOBODRODRALCPLANT_CD(String arg) { m_readTJOBODRODRALCPLANT_CD = arg; }
	public void setreadTJOBODRCDSTOCK_WHCD(String arg) { m_readTJOBODRCDSTOCK_WHCD = arg; }
	public void setreadTJOBODRCDSTOCK_PBL_SHIP_QTY(String arg) { m_readTJOBODRCDSTOCK_PBL_SHIP_QTY = arg; }
	public void setreadTJOBODRCDSTOCKITEM_CD(String arg) { m_readTJOBODRCDSTOCKITEM_CD = arg; }
	public void setreadTJOBODRCDSTOCKIN_WHCD(String arg) { m_readTJOBODRCDSTOCKIN_WHCD = arg; }

	/////////////////////////////////////////////////////////////////

	public AbstractBatchAppEntity getreadSysBusinessMessage() { return m_entity0; }
	public void setreadSysBusinessMessage(AbstractBatchAppEntity obj) { m_entity0 = obj; }
	public AbstractBatchAppEntity getbusinessOprDate() { return m_entity1; }
	public void setbusinessOprDate(AbstractBatchAppEntity obj) { m_entity1 = obj; }
	public AbstractBatchAppEntity getleedTime() { return m_entity2; }
	public void setleedTime(AbstractBatchAppEntity obj) { m_entity2 = obj; }
	public AbstractBatchAppEntity gettblT_ANS_DLV_DATE() { return m_entity3; }
	public void settblT_ANS_DLV_DATE(AbstractBatchAppEntity obj) { m_entity3 = obj; }
	public AbstractBatchAppEntity gettblT_ITEM_STOCK() { return m_entity4; }
	public void settblT_ITEM_STOCK(AbstractBatchAppEntity obj) { m_entity4 = obj; }
	public AbstractBatchAppEntity getwhSu() { return m_entity5; }
	public void setwhSu(AbstractBatchAppEntity obj) { m_entity5 = obj; }
	public AbstractBatchAppEntity gettblT_SHIP_ODR() { return m_entity6; }
	public void settblT_SHIP_ODR(AbstractBatchAppEntity obj) { m_entity6 = obj; }
	public AbstractBatchAppEntity gettblT_SHIP_SLIP() { return m_entity7; }
	public void settblT_SHIP_SLIP(AbstractBatchAppEntity obj) { m_entity7 = obj; }
	public AbstractBatchAppEntity gettblT_UN_SHIP_LIST() { return m_entity8; }
	public void settblT_UN_SHIP_LIST(AbstractBatchAppEntity obj) { m_entity8 = obj; }
	public AbstractBatchAppEntity gettblT_ODR() { return m_entity9; }
	public void settblT_ODR(AbstractBatchAppEntity obj) { m_entity9 = obj; }
	public AbstractBatchAppEntity gettblT_ODR_CTL() { return m_entity10; }
	public void settblT_ODR_CTL(AbstractBatchAppEntity obj) { m_entity10 = obj; }
	public AbstractBatchAppEntity gettblM_CUST() { return m_entity11; }
	public void settblM_CUST(AbstractBatchAppEntity obj) { m_entity11 = obj; }
	public AbstractBatchAppEntity gettblM_ITEM() { return m_entity12; }
	public void settblM_ITEM(AbstractBatchAppEntity obj) { m_entity12 = obj; }
	public AbstractBatchAppEntity gettblM_CUST_BASE() { return m_entity13; }
	public void settblM_CUST_BASE(AbstractBatchAppEntity obj) { m_entity13 = obj; }
	public AbstractBatchAppEntity getunShipRsn() { return m_entity14; }
	public void setunShipRsn(AbstractBatchAppEntity obj) { m_entity14 = obj; }
	public AbstractBatchAppEntity getchkUnitPrice() { return m_entity15; }
	public void setchkUnitPrice(AbstractBatchAppEntity obj) { m_entity15 = obj; }
	public AbstractBatchAppEntity gettaxData() { return m_entity16; }
	public void settaxData(AbstractBatchAppEntity obj) { m_entity16 = obj; }
	public AbstractBatchAppEntity getyotakuWhCd() { return m_entity17; }
	public void setyotakuWhCd(AbstractBatchAppEntity obj) { m_entity17 = obj; }
	public AbstractBatchAppEntity getgetCompanyInfo() { return m_entity18; }
	public void setgetCompanyInfo(AbstractBatchAppEntity obj) { m_entity18 = obj; }
	public AbstractBatchAppEntity getgetGyomuDate() { return m_entity19; }
	public void setgetGyomuDate(AbstractBatchAppEntity obj) { m_entity19 = obj; }
	public AbstractBatchAppEntity gettblT_SHIP_ODR_CHK() { return m_entity20; }
	public void settblT_SHIP_ODR_CHK(AbstractBatchAppEntity obj) { m_entity20 = obj; }
	public AbstractBatchAppEntity getgetTax() { return m_entity21; }
	public void setgetTax(AbstractBatchAppEntity obj) { m_entity21 = obj; }
	public AbstractBatchAppEntity getgetSEQ_ERR_WNG_LST() { return m_entity22; }
	public void setgetSEQ_ERR_WNG_LST(AbstractBatchAppEntity obj) { m_entity22 = obj; }
	public AbstractBatchAppEntity getwriteErrWngLst() { return m_entity23; }
	public void setwriteErrWngLst(AbstractBatchAppEntity obj) { m_entity23 = obj; }
	public AbstractBatchAppEntity gettblM_CUR() { return m_entity24; }
	public void settblM_CUR(AbstractBatchAppEntity obj) { m_entity24 = obj; }
	public AbstractBatchAppEntity gettblSYS_CLASS_CODE() { return m_entity25; }
	public void settblSYS_CLASS_CODE(AbstractBatchAppEntity obj) { m_entity25 = obj; }
	public AbstractBatchAppEntity gettblT_JOB_ODR_ODR_ALC() { return m_entity26; }
	public void settblT_JOB_ODR_ODR_ALC(AbstractBatchAppEntity obj) { m_entity26 = obj; }
	public AbstractBatchAppEntity gettblT_JOB_ODR_CD_STOCK() { return m_entity27; }
	public void settblT_JOB_ODR_CD_STOCK(AbstractBatchAppEntity obj) { m_entity27 = obj; }
	public IBatchAppCommon getCtrlMain() { return m_ctrl0; }
	public void setCtrlMain(IBatchAppCommon obj) { m_ctrl0 = obj; }

	//////////////////////////////

	/**
	 * medKU0010B001クラスの標準コンストラクタ
	 *
		 */
	public medKU0010B001()
	{
		// mediator変数を初期化します
		m_sysBusinessMEG_CD = null;
		m_sysBusinessMEG = null;
		m_sysBusinessIN_MEG_CD = null;
		m_oprDatePLANT_CD = null;
		m_oprDateBUSINESS_OPR_DATE = null;
		m_oprDateSTOCK_CRITERION_DATE = null;
		m_oprDateIN_PLANTCD = null;
		m_leedTimeSYS_CLASS = null;
		m_leedTimeCLASS_CODE = null;
		m_leedTimeCODE = null;
		m_readTAnsDlvDateODR_NO = null;
		m_readTAnsDlvDatePART_DLV_SEQ_NO = null;
		m_readTAnsDlvDatePRVS_ANS_DLV_DATE_RCD = null;
		m_readTAnsDlvDateLAST_ANS_DLV_DATE_RCD = null;
		m_readTAnsDlvDateDESINATED_SHIP_DATE = null;
		m_readTAnsDlvDateDESINATED_SHIP_QTY = null;
		m_readTAnsDlvDateREST_SHIP_ODR_QTY = null;
		m_readTAnsDlvDateSHIP_ODR_CMPLT_FLG = null;
		m_readTAnsDlvDateDEL_FLG = null;
		m_readTAnsDlvDateCUST_ITEM_CD = null;
		m_readTAnsDlvDateITEM_CD = null;
		m_readTAnsDlvDateCUST_CD = null;
		m_readTAnsDlvDatePKG_UNIT_QTY = null;
		m_readTAnsDlvDateCUST_ANAME = null;
		m_readTAnsDlvDateDETAIL_ROUND_TYP = null;
		m_readTAnsDlvDateTRANSPORT_LT = null;
		m_readTAnsDlvDateSHIP_WH_CD = null;
		m_readTAnsDlvDateDEPO_WH_CD = null;
		m_readTAnsDlvDateCUST_ODR_NO = null;
		m_readTAnsDlvDateCUST_CHRG_PSN_CD = null;
		m_readTAnsDlvDateCURRNCY_CD = null;
		m_readTAnsDlvDateDLV_LOC_CD = null;
		m_readTAnsDlvDateDLV_LOC_NAME_KANJI = null;
		m_readTAnsDlvDateODR_UNIT_PRICE = null;
		m_readTAnsDlvDateSHIP_CNT = null;
		m_readTAnsDlvDateDEPO_TYP = null;
		m_readTAnsDlvDateDESINATED_DLV_DATE = null;
		m_readTAnsDlvDateODR_QTY = null;
		m_readTAnsDlvDateUNIT_CD = null;
		m_readTAnsDlvDateCUS_DLV_KEY_CD = null;
		m_readTAnsDlvDatePART_NAME = null;
		m_readTAnsDlvDateUNIT_CD_ORG = null;
		m_readTAnsDlvDatePUCH_ODR_QTY_TOTAL = null;
		m_readTAnsDlvDateBUYER_NAME = null;
		m_readTAnsDlvDateINSPC_TYP = null;
		m_readTAnsDlvDateCLIENT_REMARK = null;
		m_readTAnsDlvDateCLIENT_BARCODE_INF = null;
		m_readTAnsDlvDateTRANSPORT_CD = null;
		m_readTAnsDlvDateREMARKS = null;
		m_readTAnsDlvDatePARTIAL_SHIP_INST_FLG = null;
		m_readTAnsDlvDateEXCH_TYP = null;
		m_readTAnsDlvDateTAX_CD = null;
		m_readTAnsDlvDateCUR_CD = null;
		m_readTAnsDlvDateEXCH_TYP_R = null;
		m_readTAnsDlvDateCOMPANY_CD = null;
		m_upTAnsDlvDateREST_SHIP_ODR_QTY = null;
		m_upTAnsDlvDateSHIP_ODR_CMPLT_FLG = null;
		m_upTAnsDlvDateIN_PARTDLVSEQNO = null;
		m_upTAnsDlvDateIN_ODRNO = null;
		m_readTItemStockITEM_CD = null;
		m_readTItemStockWH_CD = null;
		m_readTItemStockPLANT_CD = null;
		m_readTItemStockSTOCK_ON_HAND_QTY = null;
		m_readTItemStockWH_TYP = null;
		m_readTItemStockYUKOSU = null;
		m_readTItemStockIN_ITEMCD = null;
		m_readTItemStockIN_WHTYP = null;
		m_whSuCOUNT = null;
		m_whSuIN_ITEMCD = null;
		m_whSuIN_WHTYP = null;
		m_creTShipOdrODR_NO = null;
		m_creTShipOdrPART_DLV_SEQ_NO = null;
		m_creTShipOdrSLIP_CD = null;
		m_creTShipOdrITEM_CD = null;
		m_creTShipOdrCUST_ITEM_CD = null;
		m_creTShipOdrCUST_ODR_NO = null;
		m_creTShipOdrCUST_CD = null;
		m_creTShipOdrCUST_NAME = null;
		m_creTShipOdrCUST_CHRG_PSN_CD = null;
		m_creTShipOdrSHIP_ODR_ISS_PSN_CD = null;
		m_creTShipOdrDLV_LOC_CD = null;
		m_creTShipOdrDEPO_TYP = null;
		m_creTShipOdrDESINATED_SHIP_DATE = null;
		m_creTShipOdrSHIP_QTY = null;
		m_creTShipOdrUNIT_CD = null;
		m_creTShipOdrUNIT_PRICE = null;
		m_creTShipOdrSHIP_ODR_AMOUNT = null;
		m_creTShipOdrCURRNCY_CD = null;
		m_creTShipOdrPKG_UNIT_QTY = null;
		m_creTShipOdrREMARKS = null;
		m_creTShipOdrTRANSPORT_CD = null;
		m_creTShipOdrALLCT_WH_CD = null;
		m_creTShipOdrDIRECT_DLV_FLG = null;
		m_creTShipOdrSCDL_DLV_DATE = null;
		m_creTShipOdrDLV_KEY_NO = null;
		m_creTShipOdrSHIP_ODR_AMOUNT_EXCH_RATES = null;
		m_creTShipOdrTRANSFER_WH_CD = null;
		m_creTShipOdrSHIP_ODR_NO = null;
		m_creTShipOdrJOB_ODR_CD = null;
		m_creTShipSlipSLIP_CD = null;
		m_creTShipSlipITEM_CD = null;
		m_creTShipSlipCUST_ITEM_CD = null;
		m_creTShipSlipPART_NAME = null;
		m_creTShipSlipCUST_ODR_NO = null;
		m_creTShipSlipCUST_CD = null;
		m_creTShipSlipCUST_NAME = null;
		m_creTShipSlipDLV_LOC_CD = null;
		m_creTShipSlipDLV_LOC_NAME_KANJI = null;
		m_creTShipSlipCUS_DLV_KEY_CD = null;
		m_creTShipSlipDESINATED_SHIP_DATE = null;
		m_creTShipSlipDESINATED_DLV_DATE = null;
		m_creTShipSlipSCDL_DLV_DATE = null;
		m_creTShipSlipSHIP_ODR_QTY = null;
		m_creTShipSlipUNIT_CD = null;
		m_creTShipSlipUNIT_PRICE = null;
		m_creTShipSlipSHIP_ODR_AMOUNT = null;
		m_creTShipSlipTAX_AMOUNT = null;
		m_creTShipSlipINSPC_TYP = null;
		m_creTShipSlipCLIENT_REMARK_KANJI = null;
		m_creTShipSlipCLIENT_BARCODE_INF = null;
		m_creTShipSlipBUYER_NAME = null;
		m_creTShipSlipPUCH_ODR_QTY_TOTAL = null;
		m_creTShipSlipDLV_ODR_QTY = null;
		m_creTShipSlipSHIP_ODR_AMOUNT_TAX = null;
		m_creTShipSlipTAX_AMOUNT_1 = null;
		m_creTShipSlipTAX_AMOUNT_2 = null;
		m_creTShipSlipTAX_AMOUNT_3 = null;
		m_creTShipSlipOWN_CUR_TAXCREDIT_SALES_AMOUNT = null;
		m_creTShipSlipEXTERNAL_TAX_SALES_AMOUNT = null;
		m_creTShipSlipINTERNAL_TAX_SALES_AMOUNT = null;
		m_creTShipSlipTAXFREE_SALES_AMOUNT = null;
		m_creTShipSlipEXTERNAL_TAX_AMOUNT = null;
		m_creTShipSlipINTERNAL_TAX_AMOUNT = null;
		m_creTShipSlipTAX_CREDIT_SALES_AMOUNT = null;
		m_creTUnShipListCUST_CD = null;
		m_creTUnShipListACPT_ODR_CD = null;
		m_creTUnShipListPART_DLV_SEQ_NO = null;
		m_creTUnShipListITEM_CD = null;
		m_creTUnShipListUN_SHIP_QTY = null;
		m_creTUnShipListUN_SHIP_RSN = null;
		m_creTUnShipListWH_CD = null;
		m_UN_SHIP_SEQ_NO = null;
		m_uptOdr_IN_ODRNO = null;
		m_readTOdrCtlODR_CTL_NO = null;
		m_readTOdrCtlITEM_CD = null;
		m_readTOdrCtlCUST_ITEM_CD = null;
		m_readTOdrCtlCUST_CD = null;
		m_readTOdrCtlDEL_FLG = null;
		m_readTOdrCtlIN_ODRCTLNO = null;
		m_readMCustCOMPANY_CD = null;
		m_readMCustCUST_CD = null;
		m_readMCustCUST_ANAME = null;
		m_readMCustIN_COMPANYCD = null;
		m_readMCustIN_CUSTCD = null;
		m_readMItemITEM_CD = null;
		m_readMItemPKG_UNIT_QTY = null;
		m_readMItemUNIT_WEIGHT = null;
		m_readMItemIN_ITEMCD = null;
		m_readMCustBaseCOMPANY_CD = null;
		m_readMCustBaseCUST_CD = null;
		m_readMCustBaseDLV_LOC_CD = null;
		m_readMCustBaseTRANSPORT_LT = null;
		m_readMCustBaseDEL_FLG = null;
		m_readMCustBaseREMARKS_1 = null;
		m_readMCustBaseIN_COMPANYCD = null;
		m_readMCustBaseIN_CUSTCD = null;
		m_readMCustBaseIN_DLVLOCCD = null;
		m_unShipRsnSYS_CLASS = null;
		m_unShipRsnCLASS_CODE = null;
		m_unShipRsnCODE = null;
		m_unShipRsnCODE_NAME = null;
		m_unShipRsnIN_SYSCLASS = null;
		m_unShipRsnIN_CLASSCODE = null;
		m_unShipRsnIN_CODE = null;
		m_chkUnitPriceUNIT_COST = null;
		m_chkUnitPriceEFF_PHASE_IN_DATE = null;
		m_chkUnitPriceIN_COMPANYCD = null;
		m_chkUnitPriceIN_CUSTCD = null;
		m_chkUnitPriceIN_ITEMCD = null;
		m_chkUnitPriceIN_EFFPHASEINDATE = null;
		m_strTaxTAX_KBN = null;
		m_strTaxOLD_TAX = null;
		m_strTaxNEW_TAX = null;
		m_strTaxSTART_DATE = null;
		m_strTaxROUND_TYP = null;
		m_strTaxIN_COMPANYCD = null;
		m_strTaxIN_CUSTCD = null;
		m_strTaxIN_ITEMCD = null;
		m_strYotaku_WH_CD = null;
		m_strYotaku_IN_WH_TYP = null;
		m_strCOMPANY_CD = null;
		m_strBUSINESS_OPR_DATE = null;
		m_strPLANT_CD = null;
		m_strSHIP_QTY_SUM = null;
		m_strTaxOLD_TAX_1 = null;
		m_strTaxOLD_TAX_2 = null;
		m_strTaxOLD_TAX_3 = null;
		m_strTaxNEW_TAX_1 = null;
		m_strTaxNEW_TAX_2 = null;
		m_strTaxNEW_TAX_3 = null;
		m_strINSPC_ACPT_TYP = null;
		m_strTaxIN_TAXCD = null;
		m_errCTL_SEQ_NO = null;
		m_errSTATUS = null;
		m_errMSSGE_CD = null;
		m_errMSSGE = null;
		m_errCUST_CD = null;
		m_errCUST_ITEM_CD = null;
		m_errITEM_CD = null;
		m_errCUST_ODR_NO = null;
		m_errCUST_CHRG_PSN_CD = null;
		m_errERR_REC_TYPE = null;
		m_errACTUAL_UNIT_PRICE = null;
		m_errMASTER_UNIT_PRICE = null;
		m_errQTY = null;
		m_errODR_NO = null;
		m_errDESINATED_DLV_DATE = null;
		m_errSLIP_NO = null;
		m_errIF_CTL_NO = null;
		m_errPROC_TYP = null;
		m_errODR_SEQ = null;
		m_strDECIMAL_FIG = null;
		m_strCUR_CD = null;
		m_strSYS_CLASS_CODE = null;
		m_strJOB_ODR_CD = null;
		m_readTJOBODRODRALCPLANT_CD = null;
		m_readTJOBODRCDSTOCK_WHCD = null;
		m_readTJOBODRCDSTOCK_PBL_SHIP_QTY = null;
		m_readTJOBODRCDSTOCKITEM_CD = null;
		m_readTJOBODRCDSTOCKIN_WHCD = null;

               //{{user_implement_dev:constractor
			// TODO: ここに初期処理を記述してください
               //}}user_implement_dev:constractor

		return;
	}

	/**
	 * インスタンス破壊時に行う処理
	 *
		 */
	protected void finalize()
	{

		// todo: インスタンス消滅時に実行する処理を記述してください

		return;
	}

	/**
	 * システムログ
	 * 
	 */
	protected SystemLog m_syslog = null;
	public void setSyslog(SystemLog syslog){m_syslog = syslog;}
	public SystemLog getSyslog(){return m_syslog;}

	//////////////////////////////

        //{{user_implement_dev:original
		// TODO: ユーザ利用メソッド・変数は、ここに記述してください。
        //}}user_implement_dev:original

	//////////////////////////////

}
