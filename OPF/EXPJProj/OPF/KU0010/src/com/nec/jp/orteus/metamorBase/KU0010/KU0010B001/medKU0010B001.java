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
 * �e���v���[�g�����F
 * EXPJ    (2004/04/05),���\�b�h�R�����g�́u* @param �Ȃ��v�����ׂč폜
 *                     ,���\�b�h�R�����g�́u* @return �Ȃ��v�����ׂč폜
 * EXPJ    (2004/03/21),EXPLANNER/J�p�ɉ���
 *                      SystemLog�̋L�q��ǉ��B
 * 2.0.0.0 (2002/05/27),new foundation�Ή�
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
	// TODO: ������import�p�b�P�[�W���L�q���Ă�������
//}}user_implement_dev:import

/**
 * CLASS     : medKU0010B001 �N���X
 * �t�@�C���E�N���X����
 * @author $Author: geng-jia $
 * @version $Revision: 1.18 $ $Date: 2015/12/03 08:16:03 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class medKU0010B001 extends Object
{

	//////////////////////////////

	/**
	 * �� 1 mediator�ϐ�
	 */
	protected String m_sysBusinessMEG_CD;

	/**
	 * �� 2 mediator�ϐ�
	 */
	protected String m_sysBusinessMEG;

	/**
	 * �� 3 mediator�ϐ�
	 */
	protected String m_sysBusinessIN_MEG_CD;

	/**
	 * �� 4 mediator�ϐ�
	 */
	protected String m_oprDatePLANT_CD;

	/**
	 * �� 5 mediator�ϐ�
	 */
	protected String m_oprDateBUSINESS_OPR_DATE;

	/**
	 * �� 6 mediator�ϐ�
	 */
	protected String m_oprDateSTOCK_CRITERION_DATE;

	/**
	 * �� 7 mediator�ϐ�
	 */
	protected String m_oprDateIN_PLANTCD;

	/**
	 * �� 8 mediator�ϐ�
	 */
	protected String m_leedTimeSYS_CLASS;

	/**
	 * �� 9 mediator�ϐ�
	 */
	protected String m_leedTimeCLASS_CODE;

	/**
	 * �� 10 mediator�ϐ�
	 */
	protected String m_leedTimeCODE;

	/**
	 * �� 11 mediator�ϐ�
	 */
	protected String m_readTAnsDlvDateODR_NO;

	/**
	 * �� 12 mediator�ϐ�
	 */
	protected String m_readTAnsDlvDatePART_DLV_SEQ_NO;

	/**
	 * �� 13 mediator�ϐ�
	 */
	protected String m_readTAnsDlvDatePRVS_ANS_DLV_DATE_RCD;

	/**
	 * �� 14 mediator�ϐ�
	 */
	protected String m_readTAnsDlvDateLAST_ANS_DLV_DATE_RCD;

	/**
	 * �� 15 mediator�ϐ�
	 */
	protected String m_readTAnsDlvDateDESINATED_SHIP_DATE;

	/**
	 * �� 16 mediator�ϐ�
	 */
	protected String m_readTAnsDlvDateDESINATED_SHIP_QTY;

	/**
	 * �� 17 mediator�ϐ�
	 */
	protected String m_readTAnsDlvDateREST_SHIP_ODR_QTY;

	/**
	 * �� 18 mediator�ϐ�
	 */
	protected String m_readTAnsDlvDateSHIP_ODR_CMPLT_FLG;

	/**
	 * �� 19 mediator�ϐ�
	 */
	protected String m_readTAnsDlvDateDEL_FLG;

	/**
	 * �� 20 mediator�ϐ�
	 */
	protected String m_readTAnsDlvDateCUST_ITEM_CD;

	/**
	 * �� 21 mediator�ϐ�
	 */
	protected String m_readTAnsDlvDateITEM_CD;

	/**
	 * �� 22 mediator�ϐ�
	 */
	protected String m_readTAnsDlvDateCUST_CD;

	/**
	 * �� 23 mediator�ϐ�
	 */
	protected String m_readTAnsDlvDatePKG_UNIT_QTY;

	/**
	 * �� 24 mediator�ϐ�
	 */
	protected String m_readTAnsDlvDateCUST_ANAME;

	/**
	 * �� 25 mediator�ϐ�
	 */
	protected String m_readTAnsDlvDateDETAIL_ROUND_TYP;

	/**
	 * �� 26 mediator�ϐ�
	 */
	protected String m_readTAnsDlvDateTRANSPORT_LT;

	/**
	 * �� 27 mediator�ϐ�
	 */
	protected String m_readTAnsDlvDateSHIP_WH_CD;

	/**
	 * �� 28 mediator�ϐ�
	 */
	protected String m_readTAnsDlvDateDEPO_WH_CD;

	/**
	 * �� 29 mediator�ϐ�
	 */
	protected String m_readTAnsDlvDateCUST_ODR_NO;

	/**
	 * �� 30 mediator�ϐ�
	 */
	protected String m_readTAnsDlvDateCUST_CHRG_PSN_CD;

	/**
	 * �� 31 mediator�ϐ�
	 */
	protected String m_readTAnsDlvDateCURRNCY_CD;

	/**
	 * �� 32 mediator�ϐ�
	 */
	protected String m_readTAnsDlvDateDLV_LOC_CD;

	/**
	 * �� 33 mediator�ϐ�
	 */
	protected String m_readTAnsDlvDateDLV_LOC_NAME_KANJI;

	/**
	 * �� 34 mediator�ϐ�
	 */
	protected String m_readTAnsDlvDateODR_UNIT_PRICE;

	/**
	 * �� 35 mediator�ϐ�
	 */
	protected String m_readTAnsDlvDateSHIP_CNT;

	/**
	 * �� 36 mediator�ϐ�
	 */
	protected String m_readTAnsDlvDateDEPO_TYP;

	/**
	 * �� 37 mediator�ϐ�
	 */
	protected String m_readTAnsDlvDateDESINATED_DLV_DATE;

	/**
	 * �� 38 mediator�ϐ�
	 */
	protected String m_readTAnsDlvDateODR_QTY;

	/**
	 * �� 39 mediator�ϐ�
	 */
	protected String m_readTAnsDlvDateUNIT_CD;

	/**
	 * �� 40 mediator�ϐ�
	 */
	protected String m_readTAnsDlvDateCUS_DLV_KEY_CD;

	/**
	 * �� 41 mediator�ϐ�
	 */
	protected String m_readTAnsDlvDatePART_NAME;

	/**
	 * �� 42 mediator�ϐ�
	 */
	protected String m_readTAnsDlvDateUNIT_CD_ORG;

	/**
	 * �� 43 mediator�ϐ�
	 */
	protected String m_readTAnsDlvDatePUCH_ODR_QTY_TOTAL;

	/**
	 * �� 44 mediator�ϐ�
	 */
	protected String m_readTAnsDlvDateBUYER_NAME;

	/**
	 * �� 45 mediator�ϐ�
	 */
	protected String m_readTAnsDlvDateINSPC_TYP;

	/**
	 * �� 46 mediator�ϐ�
	 */
	protected String m_readTAnsDlvDateCLIENT_REMARK;

	/**
	 * �� 47 mediator�ϐ�
	 */
	protected String m_readTAnsDlvDateCLIENT_BARCODE_INF;

	/**
	 * �� 48 mediator�ϐ�
	 */
	protected String m_readTAnsDlvDateTRANSPORT_CD;

	/**
	 * �� 49 mediator�ϐ�
	 */
	protected String m_readTAnsDlvDateREMARKS;

	/**
	 * �� 50 mediator�ϐ�
	 */
	protected String m_readTAnsDlvDatePARTIAL_SHIP_INST_FLG;

	/**
	 * �� 51 mediator�ϐ�
	 */
	protected String m_readTAnsDlvDateEXCH_TYP;

	/**
	 * �� 52 mediator�ϐ�
	 */
	protected String m_readTAnsDlvDateTAX_CD;

	/**
	 * �� 53 mediator�ϐ�
	 */
	protected String m_readTAnsDlvDateCUR_CD;

	/**
	 * �� 54 mediator�ϐ�
	 */
	protected String m_readTAnsDlvDateEXCH_TYP_R;

	/**
	 * �� 55 mediator�ϐ�
	 */
	protected String m_readTAnsDlvDateCOMPANY_CD;

	/**
	 * �� 56 mediator�ϐ�
	 */
	protected String m_upTAnsDlvDateREST_SHIP_ODR_QTY;

	/**
	 * �� 57 mediator�ϐ�
	 */
	protected String m_upTAnsDlvDateSHIP_ODR_CMPLT_FLG;

	/**
	 * �� 58 mediator�ϐ�
	 */
	protected String m_upTAnsDlvDateIN_PARTDLVSEQNO;

	/**
	 * �� 59 mediator�ϐ�
	 */
	protected String m_upTAnsDlvDateIN_ODRNO;

	/**
	 * �� 60 mediator�ϐ�
	 */
	protected String m_readTItemStockITEM_CD;

	/**
	 * �� 61 mediator�ϐ�
	 */
	protected String m_readTItemStockWH_CD;

	/**
	 * �� 62 mediator�ϐ�
	 */
	protected String m_readTItemStockPLANT_CD;

	/**
	 * �� 63 mediator�ϐ�
	 */
	protected String m_readTItemStockSTOCK_ON_HAND_QTY;

	/**
	 * �� 64 mediator�ϐ�
	 */
	protected String m_readTItemStockWH_TYP;

	/**
	 * �� 65 mediator�ϐ�
	 */
	protected String m_readTItemStockYUKOSU;

	/**
	 * �� 66 mediator�ϐ�
	 */
	protected String m_readTItemStockIN_ITEMCD;

	/**
	 * �� 67 mediator�ϐ�
	 */
	protected String m_readTItemStockIN_WHTYP;

	/**
	 * �� 68 mediator�ϐ�
	 */
	protected String m_whSuCOUNT;

	/**
	 * �� 69 mediator�ϐ�
	 */
	protected String m_whSuIN_ITEMCD;

	/**
	 * �� 70 mediator�ϐ�
	 */
	protected String m_whSuIN_WHTYP;

	/**
	 * �� 71 mediator�ϐ�
	 */
	protected String m_creTShipOdrODR_NO;

	/**
	 * �� 72 mediator�ϐ�
	 */
	protected String m_creTShipOdrPART_DLV_SEQ_NO;

	/**
	 * �� 73 mediator�ϐ�
	 */
	protected String m_creTShipOdrSLIP_CD;

	/**
	 * �� 74 mediator�ϐ�
	 */
	protected String m_creTShipOdrITEM_CD;

	/**
	 * �� 75 mediator�ϐ�
	 */
	protected String m_creTShipOdrCUST_ITEM_CD;

	/**
	 * �� 76 mediator�ϐ�
	 */
	protected String m_creTShipOdrCUST_ODR_NO;

	/**
	 * �� 77 mediator�ϐ�
	 */
	protected String m_creTShipOdrCUST_CD;

	/**
	 * �� 78 mediator�ϐ�
	 */
	protected String m_creTShipOdrCUST_NAME;

	/**
	 * �� 79 mediator�ϐ�
	 */
	protected String m_creTShipOdrCUST_CHRG_PSN_CD;

	/**
	 * �� 80 mediator�ϐ�
	 */
	protected String m_creTShipOdrSHIP_ODR_ISS_PSN_CD;

	/**
	 * �� 81 mediator�ϐ�
	 */
	protected String m_creTShipOdrDLV_LOC_CD;

	/**
	 * �� 82 mediator�ϐ�
	 */
	protected String m_creTShipOdrDEPO_TYP;

	/**
	 * �� 83 mediator�ϐ�
	 */
	protected String m_creTShipOdrDESINATED_SHIP_DATE;

	/**
	 * �� 84 mediator�ϐ�
	 */
	protected String m_creTShipOdrSHIP_QTY;

	/**
	 * �� 85 mediator�ϐ�
	 */
	protected String m_creTShipOdrUNIT_CD;

	/**
	 * �� 86 mediator�ϐ�
	 */
	protected String m_creTShipOdrUNIT_PRICE;

	/**
	 * �� 87 mediator�ϐ�
	 */
	protected String m_creTShipOdrSHIP_ODR_AMOUNT;

	/**
	 * �� 88 mediator�ϐ�
	 */
	protected String m_creTShipOdrCURRNCY_CD;

	/**
	 * �� 89 mediator�ϐ�
	 */
	protected String m_creTShipOdrPKG_UNIT_QTY;

	/**
	 * �� 90 mediator�ϐ�
	 */
	protected String m_creTShipOdrREMARKS;

	/**
	 * �� 91 mediator�ϐ�
	 */
	protected String m_creTShipOdrTRANSPORT_CD;

	/**
	 * �� 92 mediator�ϐ�
	 */
	protected String m_creTShipOdrALLCT_WH_CD;

	/**
	 * �� 93 mediator�ϐ�
	 */
	protected String m_creTShipOdrDIRECT_DLV_FLG;

	/**
	 * �� 94 mediator�ϐ�
	 */
	protected String m_creTShipOdrSCDL_DLV_DATE;

	/**
	 * �� 95 mediator�ϐ�
	 */
	protected String m_creTShipOdrDLV_KEY_NO;

	/**
	 * �� 96 mediator�ϐ�
	 */
	protected String m_creTShipOdrSHIP_ODR_AMOUNT_EXCH_RATES;

	/**
	 * �� 97 mediator�ϐ�
	 */
	protected String m_creTShipOdrTRANSFER_WH_CD;

	/**
	 * �� 98 mediator�ϐ�
	 */
	protected String m_creTShipOdrSHIP_ODR_NO;

	/**
	 * �� 99 mediator�ϐ�
	 */
	protected String m_creTShipOdrJOB_ODR_CD;

	/**
	 * �� 100 mediator�ϐ�
	 */
	protected String m_creTShipSlipSLIP_CD;

	/**
	 * �� 101 mediator�ϐ�
	 */
	protected String m_creTShipSlipITEM_CD;

	/**
	 * �� 102 mediator�ϐ�
	 */
	protected String m_creTShipSlipCUST_ITEM_CD;

	/**
	 * �� 103 mediator�ϐ�
	 */
	protected String m_creTShipSlipPART_NAME;

	/**
	 * �� 104 mediator�ϐ�
	 */
	protected String m_creTShipSlipCUST_ODR_NO;

	/**
	 * �� 105 mediator�ϐ�
	 */
	protected String m_creTShipSlipCUST_CD;

	/**
	 * �� 106 mediator�ϐ�
	 */
	protected String m_creTShipSlipCUST_NAME;

	/**
	 * �� 107 mediator�ϐ�
	 */
	protected String m_creTShipSlipDLV_LOC_CD;

	/**
	 * �� 108 mediator�ϐ�
	 */
	protected String m_creTShipSlipDLV_LOC_NAME_KANJI;

	/**
	 * �� 109 mediator�ϐ�
	 */
	protected String m_creTShipSlipCUS_DLV_KEY_CD;

	/**
	 * �� 110 mediator�ϐ�
	 */
	protected String m_creTShipSlipDESINATED_SHIP_DATE;

	/**
	 * �� 111 mediator�ϐ�
	 */
	protected String m_creTShipSlipDESINATED_DLV_DATE;

	/**
	 * �� 112 mediator�ϐ�
	 */
	protected String m_creTShipSlipSCDL_DLV_DATE;

	/**
	 * �� 113 mediator�ϐ�
	 */
	protected String m_creTShipSlipSHIP_ODR_QTY;

	/**
	 * �� 114 mediator�ϐ�
	 */
	protected String m_creTShipSlipUNIT_CD;

	/**
	 * �� 115 mediator�ϐ�
	 */
	protected String m_creTShipSlipUNIT_PRICE;

	/**
	 * �� 116 mediator�ϐ�
	 */
	protected String m_creTShipSlipSHIP_ODR_AMOUNT;

	/**
	 * �� 117 mediator�ϐ�
	 */
	protected String m_creTShipSlipTAX_AMOUNT;

	/**
	 * �� 118 mediator�ϐ�
	 */
	protected String m_creTShipSlipINSPC_TYP;

	/**
	 * �� 119 mediator�ϐ�
	 */
	protected String m_creTShipSlipCLIENT_REMARK_KANJI;

	/**
	 * �� 120 mediator�ϐ�
	 */
	protected String m_creTShipSlipCLIENT_BARCODE_INF;

	/**
	 * �� 121 mediator�ϐ�
	 */
	protected String m_creTShipSlipBUYER_NAME;

	/**
	 * �� 122 mediator�ϐ�
	 */
	protected String m_creTShipSlipPUCH_ODR_QTY_TOTAL;

	/**
	 * �� 123 mediator�ϐ�
	 */
	protected String m_creTShipSlipDLV_ODR_QTY;

	/**
	 * �� 124 mediator�ϐ�
	 */
	protected String m_creTShipSlipSHIP_ODR_AMOUNT_TAX;

	/**
	 * �� 125 mediator�ϐ�
	 */
	protected String m_creTShipSlipTAX_AMOUNT_1;

	/**
	 * �� 126 mediator�ϐ�
	 */
	protected String m_creTShipSlipTAX_AMOUNT_2;

	/**
	 * �� 127 mediator�ϐ�
	 */
	protected String m_creTShipSlipTAX_AMOUNT_3;

	/**
	 * �� 128 mediator�ϐ�
	 */
	protected String m_creTShipSlipOWN_CUR_TAXCREDIT_SALES_AMOUNT;

	/**
	 * �� 129 mediator�ϐ�
	 */
	protected String m_creTShipSlipEXTERNAL_TAX_SALES_AMOUNT;

	/**
	 * �� 130 mediator�ϐ�
	 */
	protected String m_creTShipSlipINTERNAL_TAX_SALES_AMOUNT;

	/**
	 * �� 131 mediator�ϐ�
	 */
	protected String m_creTShipSlipTAXFREE_SALES_AMOUNT;

	/**
	 * �� 132 mediator�ϐ�
	 */
	protected String m_creTShipSlipEXTERNAL_TAX_AMOUNT;

	/**
	 * �� 133 mediator�ϐ�
	 */
	protected String m_creTShipSlipINTERNAL_TAX_AMOUNT;

	/**
	 * �� 134 mediator�ϐ�
	 */
	protected String m_creTShipSlipTAX_CREDIT_SALES_AMOUNT;

	/**
	 * �� 135 mediator�ϐ�
	 */
	protected String m_creTUnShipListCUST_CD;

	/**
	 * �� 136 mediator�ϐ�
	 */
	protected String m_creTUnShipListACPT_ODR_CD;

	/**
	 * �� 137 mediator�ϐ�
	 */
	protected String m_creTUnShipListPART_DLV_SEQ_NO;

	/**
	 * �� 138 mediator�ϐ�
	 */
	protected String m_creTUnShipListITEM_CD;

	/**
	 * �� 139 mediator�ϐ�
	 */
	protected String m_creTUnShipListUN_SHIP_QTY;

	/**
	 * �� 140 mediator�ϐ�
	 */
	protected String m_creTUnShipListUN_SHIP_RSN;

	/**
	 * �� 141 mediator�ϐ�
	 */
	protected String m_creTUnShipListWH_CD;

	/**
	 * �� 142 mediator�ϐ�
	 */
	protected String m_UN_SHIP_SEQ_NO;

	/**
	 * �� 143 mediator�ϐ�
	 */
	protected String m_uptOdr_IN_ODRNO;

	/**
	 * �� 144 mediator�ϐ�
	 */
	protected String m_readTOdrCtlODR_CTL_NO;

	/**
	 * �� 145 mediator�ϐ�
	 */
	protected String m_readTOdrCtlITEM_CD;

	/**
	 * �� 146 mediator�ϐ�
	 */
	protected String m_readTOdrCtlCUST_ITEM_CD;

	/**
	 * �� 147 mediator�ϐ�
	 */
	protected String m_readTOdrCtlCUST_CD;

	/**
	 * �� 148 mediator�ϐ�
	 */
	protected String m_readTOdrCtlDEL_FLG;

	/**
	 * �� 149 mediator�ϐ�
	 */
	protected String m_readTOdrCtlIN_ODRCTLNO;

	/**
	 * �� 150 mediator�ϐ�
	 */
	protected String m_readMCustCOMPANY_CD;

	/**
	 * �� 151 mediator�ϐ�
	 */
	protected String m_readMCustCUST_CD;

	/**
	 * �� 152 mediator�ϐ�
	 */
	protected String m_readMCustCUST_ANAME;

	/**
	 * �� 153 mediator�ϐ�
	 */
	protected String m_readMCustIN_COMPANYCD;

	/**
	 * �� 154 mediator�ϐ�
	 */
	protected String m_readMCustIN_CUSTCD;

	/**
	 * �� 155 mediator�ϐ�
	 */
	protected String m_readMItemITEM_CD;

	/**
	 * �� 156 mediator�ϐ�
	 */
	protected String m_readMItemPKG_UNIT_QTY;

	/**
	 * �� 157 mediator�ϐ�
	 */
	protected String m_readMItemUNIT_WEIGHT;

	/**
	 * �� 158 mediator�ϐ�
	 */
	protected String m_readMItemIN_ITEMCD;

	/**
	 * �� 159 mediator�ϐ�
	 */
	protected String m_readMCustBaseCOMPANY_CD;

	/**
	 * �� 160 mediator�ϐ�
	 */
	protected String m_readMCustBaseCUST_CD;

	/**
	 * �� 161 mediator�ϐ�
	 */
	protected String m_readMCustBaseDLV_LOC_CD;

	/**
	 * �� 162 mediator�ϐ�
	 */
	protected String m_readMCustBaseTRANSPORT_LT;

	/**
	 * �� 163 mediator�ϐ�
	 */
	protected String m_readMCustBaseDEL_FLG;

	/**
	 * �� 164 mediator�ϐ�
	 */
	protected String m_readMCustBaseREMARKS_1;

	/**
	 * �� 165 mediator�ϐ�
	 */
	protected String m_readMCustBaseIN_COMPANYCD;

	/**
	 * �� 166 mediator�ϐ�
	 */
	protected String m_readMCustBaseIN_CUSTCD;

	/**
	 * �� 167 mediator�ϐ�
	 */
	protected String m_readMCustBaseIN_DLVLOCCD;

	/**
	 * �� 168 mediator�ϐ�
	 */
	protected String m_unShipRsnSYS_CLASS;

	/**
	 * �� 169 mediator�ϐ�
	 */
	protected String m_unShipRsnCLASS_CODE;

	/**
	 * �� 170 mediator�ϐ�
	 */
	protected String m_unShipRsnCODE;

	/**
	 * �� 171 mediator�ϐ�
	 */
	protected String m_unShipRsnCODE_NAME;

	/**
	 * �� 172 mediator�ϐ�
	 */
	protected String m_unShipRsnIN_SYSCLASS;

	/**
	 * �� 173 mediator�ϐ�
	 */
	protected String m_unShipRsnIN_CLASSCODE;

	/**
	 * �� 174 mediator�ϐ�
	 */
	protected String m_unShipRsnIN_CODE;

	/**
	 * �� 175 mediator�ϐ�
	 */
	protected String m_chkUnitPriceUNIT_COST;

	/**
	 * �� 176 mediator�ϐ�
	 */
	protected String m_chkUnitPriceEFF_PHASE_IN_DATE;

	/**
	 * �� 177 mediator�ϐ�
	 */
	protected String m_chkUnitPriceIN_COMPANYCD;

	/**
	 * �� 178 mediator�ϐ�
	 */
	protected String m_chkUnitPriceIN_CUSTCD;

	/**
	 * �� 179 mediator�ϐ�
	 */
	protected String m_chkUnitPriceIN_ITEMCD;

	/**
	 * �� 180 mediator�ϐ�
	 */
	protected String m_chkUnitPriceIN_EFFPHASEINDATE;

	/**
	 * �� 181 mediator�ϐ�
	 */
	protected String m_strTaxTAX_KBN;

	/**
	 * �� 182 mediator�ϐ�
	 */
	protected String m_strTaxOLD_TAX;

	/**
	 * �� 183 mediator�ϐ�
	 */
	protected String m_strTaxNEW_TAX;

	/**
	 * �� 184 mediator�ϐ�
	 */
	protected String m_strTaxSTART_DATE;

	/**
	 * �� 185 mediator�ϐ�
	 */
	protected String m_strTaxROUND_TYP;

	/**
	 * �� 186 mediator�ϐ�
	 */
	protected String m_strTaxIN_COMPANYCD;

	/**
	 * �� 187 mediator�ϐ�
	 */
	protected String m_strTaxIN_CUSTCD;

	/**
	 * �� 188 mediator�ϐ�
	 */
	protected String m_strTaxIN_ITEMCD;

	/**
	 * �� 189 mediator�ϐ�
	 */
	protected String m_strYotaku_WH_CD;

	/**
	 * �� 190 mediator�ϐ�
	 */
	protected String m_strYotaku_IN_WH_TYP;

	/**
	 * �� 191 mediator�ϐ�
	 */
	protected String m_strCOMPANY_CD;

	/**
	 * �� 192 mediator�ϐ�
	 */
	protected String m_strBUSINESS_OPR_DATE;

	/**
	 * �� 193 mediator�ϐ�
	 */
	protected String m_strPLANT_CD;

	/**
	 * �� 194 mediator�ϐ�
	 */
	protected String m_strSHIP_QTY_SUM;

	/**
	 * �� 195 mediator�ϐ�
	 */
	protected String m_strTaxOLD_TAX_1;

	/**
	 * �� 196 mediator�ϐ�
	 */
	protected String m_strTaxOLD_TAX_2;

	/**
	 * �� 197 mediator�ϐ�
	 */
	protected String m_strTaxOLD_TAX_3;

	/**
	 * �� 198 mediator�ϐ�
	 */
	protected String m_strTaxNEW_TAX_1;

	/**
	 * �� 199 mediator�ϐ�
	 */
	protected String m_strTaxNEW_TAX_2;

	/**
	 * �� 200 mediator�ϐ�
	 */
	protected String m_strTaxNEW_TAX_3;

	/**
	 * �� 201 mediator�ϐ�
	 */
	protected String m_strINSPC_ACPT_TYP;

	/**
	 * �� 202 mediator�ϐ�
	 */
	protected String m_strTaxIN_TAXCD;

	/**
	 * �� 203 mediator�ϐ�
	 */
	protected Double m_errCTL_SEQ_NO;

	/**
	 * �� 204 mediator�ϐ�
	 */
	protected String m_errSTATUS;

	/**
	 * �� 205 mediator�ϐ�
	 */
	protected String m_errMSSGE_CD;

	/**
	 * �� 206 mediator�ϐ�
	 */
	protected String m_errMSSGE;

	/**
	 * �� 207 mediator�ϐ�
	 */
	protected String m_errCUST_CD;

	/**
	 * �� 208 mediator�ϐ�
	 */
	protected String m_errCUST_ITEM_CD;

	/**
	 * �� 209 mediator�ϐ�
	 */
	protected String m_errITEM_CD;

	/**
	 * �� 210 mediator�ϐ�
	 */
	protected String m_errCUST_ODR_NO;

	/**
	 * �� 211 mediator�ϐ�
	 */
	protected String m_errCUST_CHRG_PSN_CD;

	/**
	 * �� 212 mediator�ϐ�
	 */
	protected String m_errERR_REC_TYPE;

	/**
	 * �� 213 mediator�ϐ�
	 */
	protected Double m_errACTUAL_UNIT_PRICE;

	/**
	 * �� 214 mediator�ϐ�
	 */
	protected Double m_errMASTER_UNIT_PRICE;

	/**
	 * �� 215 mediator�ϐ�
	 */
	protected Double m_errQTY;

	/**
	 * �� 216 mediator�ϐ�
	 */
	protected String m_errODR_NO;

	/**
	 * �� 217 mediator�ϐ�
	 */
	protected String m_errDESINATED_DLV_DATE;

	/**
	 * �� 218 mediator�ϐ�
	 */
	protected String m_errSLIP_NO;

	/**
	 * �� 219 mediator�ϐ�
	 */
	protected Double m_errIF_CTL_NO;

	/**
	 * �� 220 mediator�ϐ�
	 */
	protected String m_errPROC_TYP;

	/**
	 * �� 221 mediator�ϐ�
	 */
	protected Double m_errODR_SEQ;

	/**
	 * �� 222 mediator�ϐ�
	 */
	protected String m_strDECIMAL_FIG;

	/**
	 * �� 223 mediator�ϐ�
	 */
	protected String m_strCUR_CD;

	/**
	 * �� 224 mediator�ϐ�
	 */
	protected String m_strSYS_CLASS_CODE;

	/**
	 * �� 225 mediator�ϐ�
	 */
	protected String m_strJOB_ODR_CD;

	/**
	 * �� 226 mediator�ϐ�
	 */
	protected String m_readTJOBODRODRALCPLANT_CD;

	/**
	 * �� 227 mediator�ϐ�
	 */
	protected String m_readTJOBODRCDSTOCK_WHCD;

	/**
	 * �� 228 mediator�ϐ�
	 */
	protected String m_readTJOBODRCDSTOCK_PBL_SHIP_QTY;

	/**
	 * �� 229 mediator�ϐ�
	 */
	protected String m_readTJOBODRCDSTOCKITEM_CD;

	/**
	 * �� 230 mediator�ϐ�
	 */
	protected String m_readTJOBODRCDSTOCKIN_WHCD;

	/**
	 * readSysBusinessMessage entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity0=null;

	/**
	 * businessOprDate entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity1=null;

	/**
	 * leedTime entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity2=null;

	/**
	 * tblT_ANS_DLV_DATE entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity3=null;

	/**
	 * tblT_ITEM_STOCK entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity4=null;

	/**
	 * whSu entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity5=null;

	/**
	 * tblT_SHIP_ODR entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity6=null;

	/**
	 * tblT_SHIP_SLIP entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity7=null;

	/**
	 * tblT_UN_SHIP_LIST entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity8=null;

	/**
	 * tblT_ODR entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity9=null;

	/**
	 * tblT_ODR_CTL entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity10=null;

	/**
	 * tblM_CUST entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity11=null;

	/**
	 * tblM_ITEM entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity12=null;

	/**
	 * tblM_CUST_BASE entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity13=null;

	/**
	 * unShipRsn entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity14=null;

	/**
	 * chkUnitPrice entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity15=null;

	/**
	 * taxData entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity16=null;

	/**
	 * yotakuWhCd entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity17=null;

	/**
	 * getCompanyInfo entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity18=null;

	/**
	 * getGyomuDate entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity19=null;

	/**
	 * tblT_SHIP_ODR_CHK entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity20=null;

	/**
	 * getTax entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity21=null;

	/**
	 * getSEQ_ERR_WNG_LST entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity22=null;

	/**
	 * writeErrWngLst entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity23=null;

	/**
	 * tblM_CUR entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity24=null;

	/**
	 * tblSYS_CLASS_CODE entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity25=null;

	/**
	 * tblT_JOB_ODR_ODR_ALC entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity26=null;

	/**
	 * tblT_JOB_ODR_CD_STOCK entity �C���X�^���X���i�[���܂�
	 */
	public AbstractBatchAppEntity m_entity27=null;

	/**
	 * CtrlMain entity �C���X�^���X���i�[���܂�
	 */
	public IBatchAppCommon m_ctrl0=null;


	//////////////////////////////

	/**
	 * �v���O���������i�[���܂��B
	 */
	protected String m_Progname="KU0010B001";

	/**
	 * �v���O��������Ԃ��܂�
	 *
	 * @return �v���O������
	 */
	public String getProgname() { return m_Progname; }

	/**
	 * �v���O��������mediator�Ɋi�[���܂�
	 *
	 * @param �v���O������
		 */
	public void setProgname(String args) { m_Progname = args; }

	//////////////////////////////

	/**
	 * �����J�n���t���擾���܂��i������FYYYY/MM/DD HH24:MI:SS�j
	 */
	// java.util.Date mdate = new java.util.Date();
	// java.text.SimpleDateFormat dtformat = new java.text.SimpleDateFormat( "yyyy/MM/dd kk:mm:ss" );
	// protected String Sysdate = dtformat.format(mdate);
	protected String Sysdate = null;

	/**
	 * �����J�n���t���擾���܂��i������FYYYY/MM/DD HH24:MI:SS�j
	 *
	 * @return �������t
	 */
	public String getSysdate() { return Sysdate; }

	/**
	 * �������t��mediator�Ɋi�[���܂�
	 *
	 * @param �������t
		 */
	public void setSysdate( String arg ) { Sysdate = arg; }

	//////////////////////////////

	/**
	 * �o�^��/�X�V�҂��i�[���܂�
	 */
	protected String Username = "orteus_system";

	/**
	 * �o�^��/�X�V�҂��擾���܂�
	 *
	 * @return �o�^��/�X�V��
	 */
	public String getUsername() { return Username; }

	/**
	 * �o�^��/�X�V�҂�mediator�Ɋi�[���܂�
	 *
	 * @param �o�^��/�X�V��
		 */
	public void setUsername( String arg ) { Username = arg; }

	//////////////////////////////

	/**
	 * ���������i�[���܂�
	 */
	protected String[] m_args=null;

	//////////////////////////////

	/**
	 * �R�}���h���C���̈���������z���Ԃ��܂�
	 *
	 * @return ����������z��
	 */
	public String[] getArgs() { return m_args; }

	/**
	 * �R�}���h���C���̈���������z���mediator�Ɋi�[���܂�
	 *
	 * @param ����������z��
		 */
	public void setArgs(String[] args) { m_args = args; }

	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

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
	 * medKU0010B001�N���X�̕W���R���X�g���N�^
	 *
		 */
	public medKU0010B001()
	{
		// mediator�ϐ������������܂�
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
			// TODO: �����ɏ����������L�q���Ă�������
               //}}user_implement_dev:constractor

		return;
	}

	/**
	 * �C���X�^���X�j�󎞂ɍs������
	 *
		 */
	protected void finalize()
	{

		// todo: �C���X�^���X���Ŏ��Ɏ��s���鏈�����L�q���Ă�������

		return;
	}

	/**
	 * �V�X�e�����O
	 * 
	 */
	protected SystemLog m_syslog = null;
	public void setSyslog(SystemLog syslog){m_syslog = syslog;}
	public SystemLog getSyslog(){return m_syslog;}

	//////////////////////////////

        //{{user_implement_dev:original
		// TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_dev:original

	//////////////////////////////

}
