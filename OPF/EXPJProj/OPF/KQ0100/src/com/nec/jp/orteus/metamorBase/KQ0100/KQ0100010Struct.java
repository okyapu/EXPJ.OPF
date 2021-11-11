/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KQ0100/src/com/nec/jp/orteus/metamorBase/KQ0100/KQ0100010Struct.java,v $
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
 * EXPJ    (2005/01/19),SRCGEN�Ή�
 * EXPJ    (2004/04/05),���\�b�h�R�����g�́u* @param �Ȃ��v�����ׂč폜
 * EXPJ    (2004/04/01),setStruct���\�b�h�̌ʃ����o�̂ݔ�setStructM�ƁA���X�g�����o�̂ݔ�setStructL��ǉ��B
 *                      initialize�ł̃f�[�^�Z�b�g�́Aclear���Ă�ł���s���悤�ɏC���B
 * EXPJ    (2004/03/31),�����l�̃R�����g�A�E�g�̃o�O���C���B
 * EXPJ    (2004/03/20),���r���[���ʂ𔽉f�B
 * EXPJ    (2004/03/02),EXPLANNER/J�p�ɉ����i�\�[�X�w�b�_�E�N���X�w�b�_�ύX�j
 *                      �����������ɏ����l��null�ō쐬�B
 *                      ���������\�b�hinitialize�A�f�[�^�Z�b�g���\�b�hsetStruct�ǉ��B
 *                      �R���X�g���N�^�̃��[�U�L�q����initialize���\�b�h�ďo�ǉ��B
 *                      initialize()���\�b�h�AsetStruct()���\�b�h�ǉ��B
 * 4.1.0.0 (2003/07/16),setL2L_xxx���\�b�h�ǉ�
 * 4.0.0.1 (2003/06/05),javadoc�R�����g�G���[�C��
 * 4.0.0.0 (2003/04/23),�N���X���W�����Ή�
 * 3.0.0.0 (2003/03/19),Time,Timestamp�^�Ή�
 * 2.1.0.0 (2002/12/17),Logging package�C��
 * 2.0.0.0 (2002/05/27),new foundation�Ή�
 *
 */

package com.nec.jp.orteus.metamorBase.KQ0100;

import com.nec.jp.orteus.xaf.wa.*;

import com.nec.jp.orteus.util.logging.*;

import java.lang.Number.*;
import java.lang.Float;
import java.util.*;
import java.sql.*;
import java.io.*;

//{{user_implement_code_import
	// TODO: ������import�p�b�P�[�W���L�q���Ă�������
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : KQ0100010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.3 $ $Date: 2015/11/16 05:14:02 $
 *
 */
//}}user_implement_code_header

public class KQ0100010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_h_UPDATE_FLG */
	public String m_h_UPDATE_FLG = null;
	/** �� 2 �ϐ��F m_r_SEL_PTN1 */
	public String m_r_SEL_PTN1 = null;
	/** �� 3 �ϐ��F m_r_SEL_PTN2 */
	public String m_r_SEL_PTN2 = null;
	/** �� 4 �ϐ��F m_INSPC_ACPT_TYP */
	public String m_INSPC_ACPT_TYP = null;
	/** �� 5 �ϐ��F m_SHIP_DLV_DATE */
	public String m_SHIP_DLV_DATE = null;
	/** �� 6 �ϐ��F m_l_STATUS */
	public String m_l_STATUS = null;
	/** �� 7 �ϐ��F m_l_h_STATUS_CD */
	public String m_l_h_STATUS_CD = null;
	/** �� 8 �ϐ��F m_l_ODR_SCDL_DLV_DATE */
	public String m_l_ODR_SCDL_DLV_DATE = null;
	/** �� 9 �ϐ��F m_l_SHIP_SCDL_DLV_DATE */
	public String m_l_SHIP_SCDL_DLV_DATE = null;
	/** �� 10 �ϐ��F m_h_TAX_CD */
	public String m_h_TAX_CD = null;
	/** �� 11 �ϐ��F m_l_h_SHIP_ODR_AMOUNT */
	public String m_l_h_SHIP_ODR_AMOUNT = null;
	/** �� 12 �ϐ��F m_l_h_SALES_AMOUNT */
	public String m_l_h_SALES_AMOUNT = null;
	/** �� 13 �ϐ��F m_l_h_AI_AR_IF_FLG */
	public String m_l_h_AI_AR_IF_FLG = null;
	/** �� 14 �ϐ��F m_l_h_TAX_DESINATED_SHIP_DATE */
	public String m_l_h_TAX_DESINATED_SHIP_DATE = null;
	/** �� 15 �ϐ��F m_l_h_SALES_SLIP_CD */
	public String m_l_h_SALES_SLIP_CD = null;
	/** �� 16 �ϐ��F m_l_h_UPDATE_FLG */
	public String m_l_h_UPDATE_FLG = null;
	/** �� 17 �ϐ��F m_h_SLIP_CTRL_GRP */
	public String m_h_SLIP_CTRL_GRP = null;
	/** �� 18 �ϐ��F m_h_ODR_NO */
	public String m_h_ODR_NO = null;
	/** �� 19 �ϐ��F m_CUST_ODR_NO */
	public String m_CUST_ODR_NO = null;
	/** �� 20 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 21 �ϐ��F m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** �� 22 �ϐ��F m_CUST_CD */
	public String m_CUST_CD = null;
	/** �� 23 �ϐ��F m_CUST_NAME */
	public String m_CUST_NAME = null;
	/** �� 24 �ϐ��F m_CUST_ITEM_CD */
	public String m_CUST_ITEM_CD = null;
	/** �� 25 �ϐ��F m_CUST_ITEM_NAME */
	public String m_CUST_ITEM_NAME = null;
	/** �� 26 �ϐ��F m_ODR_ACPT_DATE */
	public String m_ODR_ACPT_DATE = null;
	/** �� 27 �ϐ��F m_DESINATED_DLV_DATE */
	public String m_DESINATED_DLV_DATE = null;
	/** �� 28 �ϐ��F m_ODR_UNIT_PRICE */
	public String m_ODR_UNIT_PRICE = null;
	/** �� 29 �ϐ��F m_ODR_UNIT_CD */
	public String m_ODR_UNIT_CD = null;
	/** �� 30 �ϐ��F m_ODR_QTY */
	public String m_ODR_QTY = null;
	/** �� 31 �ϐ��F m_TAX_CD */
	public String m_TAX_CD = null;
	/** �� 32 �ϐ��F m_ODR_AMOUNT */
	public String m_ODR_AMOUNT = null;
	/** �� 33 �ϐ��F m_ODR_AMOUNT_UNIT_CD */
	public String m_ODR_AMOUNT_UNIT_CD = null;
	/** �� 34 �ϐ��F m_h_INSPC_ACPT_TYP */
	public String m_h_INSPC_ACPT_TYP = null;
	/** �� 35 �ϐ��F m_h_CURRNCY_CD */
	public String m_h_CURRNCY_CD = null;
	/** �� 36 �ϐ��F m_h_EXCH_TYP */
	public String m_h_EXCH_TYP = null;
	/** �� 37 �ϐ��F m_h_PRICE_ROUND_TYP */
	public String m_h_PRICE_ROUND_TYP = null;
	/** �� 38 �ϐ��F m_h_TRANSPORT_LT */
	public String m_h_TRANSPORT_LT = null;
	/** �� 39 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 40 �ϐ��F m_h_MODIFY_COUNT */
	public String m_h_MODIFY_COUNT = null;
	/** �� 41 �ϐ��F m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** �� 42 �ϐ��F m_ODR_NO */
	public String m_ODR_NO = null;
	/** �� 43 �ϐ��F m_l_ODR_ODR_NO */
	public String m_l_ODR_ODR_NO = null;
	/** �� 44 �ϐ��F m_l_JOB_ODR_CD */
	public String m_l_JOB_ODR_CD = null;
	/** �� 45 �ϐ��F m_l_PART_DLV_SEQ_NO */
	public String m_l_PART_DLV_SEQ_NO = null;
	/** �� 46 �ϐ��F m_l_DLV_ODR_NO */
	public String m_l_DLV_ODR_NO = null;
	/** �� 47 �ϐ��F m_l_SHIP_ODR_SLIP_CD */
	public String m_l_SHIP_ODR_SLIP_CD = null;
	/** �� 48 �ϐ��F m_l_DESINATED_SHIP_DATE */
	public String m_l_DESINATED_SHIP_DATE = null;
	/** �� 49 �ϐ��F m_l_SCDL_DLV_DATE */
	public String m_l_SCDL_DLV_DATE = null;
	/** �� 50 �ϐ��F m_l_SHIP_ODR_NO */
	public String m_l_SHIP_ODR_NO = null;
	/** �� 51 �ϐ��F m_l_ODR_AMOUNT */
	public String m_l_ODR_AMOUNT = null;
	/** �� 52 �ϐ��F m_l_SHIP_DATE */
	public String m_l_SHIP_DATE = null;
	/** �� 53 �ϐ��F m_l_SHIP_ODR_AMOUNT */
	public String m_l_SHIP_ODR_AMOUNT = null;
	/** �� 54 �ϐ��F m_l_SHIP_SEQ_NO */
	public String m_l_SHIP_SEQ_NO = null;
	/** �� 55 �ϐ��F m_l_SALES_DATE */
	public String m_l_SALES_DATE = null;
	/** �� 56 �ϐ��F m_l_SALES_AMOUNT */
	public String m_l_SALES_AMOUNT = null;
	/** �� 57 �ϐ��F m_l_AI_AR_IF_FLG */
	public String m_l_AI_AR_IF_FLG = null;
	/** �� 58 �ϐ��F m_l_SALES_SEQ_NO */
	public String m_l_SALES_SEQ_NO = null;
	/** �� 59 �ϐ��F m_l_SALES_SLIP_CD */
	public String m_l_SALES_SLIP_CD = null;
	/** �� 60 �ϐ��F m_l_SALES_STATUS */
	public String m_l_SALES_STATUS = null;
	/** �� 61 �ϐ��F m_l_AR_SLIP_CD */
	public String m_l_AR_SLIP_CD = null;
	/** �� 62 �ϐ��F m_l_AR_TRN_SLIP_CD */
	public String m_l_AR_TRN_SLIP_CD = null;
	/** �� 63 �ϐ��F m_l_h_INSPC_ACPT_DATE */
	public String m_l_h_INSPC_ACPT_DATE = null;
	/** �� 64 �ϐ��F m_l_h_AR_INSPC_ACPT_DATE */
	public String m_l_h_AR_INSPC_ACPT_DATE = null;
	/** �� 65 �ϐ��F m_l_h_AR_SALES_AMOUNT */
	public String m_l_h_AR_SALES_AMOUNT = null;
	/** �� 66 �ϐ��F m_l_h_AR_TRN_INSPC_ACPT_DATE */
	public String m_l_h_AR_TRN_INSPC_ACPT_DATE = null;
	/** �� 67 �ϐ��F m_l_h_AR_TRN_SALES_AMOUNT */
	public String m_l_h_AR_TRN_SALES_AMOUNT = null;
	/** �� 68 �ϐ��F m_AR_STATUS */
	public String m_AR_STATUS = null;
	/** �� 69 �ϐ��F m_AR_TRN_STATUS */
	public String m_AR_TRN_STATUS = null;
	/** �� 70 �ϐ��F m_SLIP_CTRL_GRP */
	public String m_SLIP_CTRL_GRP = null;
	/** �� 71 �ϐ��F m_OPTION_ID */
	public String m_OPTION_ID = null;
	/** �� 72 �ϐ��F m_CODE */
	public String m_CODE = null;
	/** �� 73 �ϐ��F m_CREATED_BY */
	public String m_CREATED_BY = null;
	/** �� 74 �ϐ��F m_CREATED_PRG_NM */
	public String m_CREATED_PRG_NM = null;
	/** �� 75 �ϐ��F m_slipSHIP_ODR_AMOUNT */
	public String m_slipSHIP_ODR_AMOUNT = null;
	/** �� 76 �ϐ��F m_slipTAX_AMOUNT */
	public String m_slipTAX_AMOUNT = null;
	/** �� 77 �ϐ��F m_slipSHIP_ODR_AMOUNT_TAX */
	public String m_slipSHIP_ODR_AMOUNT_TAX = null;
	/** �� 78 �ϐ��F m_slipEXTERNAL_TAX_SALES_AMOUNT */
	public String m_slipEXTERNAL_TAX_SALES_AMOUNT = null;
	/** �� 79 �ϐ��F m_slipINTERNAL_TAX_SALES_AMOUNT */
	public String m_slipINTERNAL_TAX_SALES_AMOUNT = null;
	/** �� 80 �ϐ��F m_slipTAXFREE_SALES_AMOUNT */
	public String m_slipTAXFREE_SALES_AMOUNT = null;
	/** �� 81 �ϐ��F m_slipTAX_CREDIT_SALES_AMOUNT */
	public String m_slipTAX_CREDIT_SALES_AMOUNT = null;
	/** �� 82 �ϐ��F m_slipEXTERNAL_TAX_AMOUNT */
	public String m_slipEXTERNAL_TAX_AMOUNT = null;
	/** �� 83 �ϐ��F m_slipINTERNAL_TAX_AMOUNT */
	public String m_slipINTERNAL_TAX_AMOUNT = null;
	/** �� 84 �ϐ��F m_slipTAX_AMOUNT_1 */
	public String m_slipTAX_AMOUNT_1 = null;
	/** �� 85 �ϐ��F m_slipTAX_AMOUNT_2 */
	public String m_slipTAX_AMOUNT_2 = null;
	/** �� 86 �ϐ��F m_slipTAX_AMOUNT_3 */
	public String m_slipTAX_AMOUNT_3 = null;
	/** �� 87 �ϐ��F m_slipOWN_CUR_TAXCREDIT_SALES_AMOUNT */
	public String m_slipOWN_CUR_TAXCREDIT_SALES_AMOUNT = null;
	/** �� 88 �ϐ��F m_selectSHIP_ODR_NO */
	public String m_selectSHIP_ODR_NO = null;
	/** �� 89 �ϐ��F m_selectSLIP_CD */
	public String m_selectSLIP_CD = null;
	/** �� 90 �ϐ��F m_selectSALES_TYP */
	public String m_selectSALES_TYP = null;
	/** �� 91 �ϐ��F m_selectCUST_CD */
	public String m_selectCUST_CD = null;
	/** �� 92 �ϐ��F m_selectITEM_CD */
	public String m_selectITEM_CD = null;
	/** �� 93 �ϐ��F m_selectITEM_NAME */
	public String m_selectITEM_NAME = null;
	/** �� 94 �ϐ��F m_selectCUST_ODR_NO */
	public String m_selectCUST_ODR_NO = null;
	/** �� 95 �ϐ��F m_selectSALES_DATE */
	public String m_selectSALES_DATE = null;
	/** �� 96 �ϐ��F m_selectSALES_DEPT_CD */
	public String m_selectSALES_DEPT_CD = null;
	/** �� 97 �ϐ��F m_selectVEND_CD */
	public String m_selectVEND_CD = null;
	/** �� 98 �ϐ��F m_selectPRD_ODR_PLACE_CD */
	public String m_selectPRD_ODR_PLACE_CD = null;
	/** �� 99 �ϐ��F m_selectCUST_CHRG_PSN_CD */
	public String m_selectCUST_CHRG_PSN_CD = null;
	/** �� 100 �ϐ��F m_selectODR_ACPT_PSN_CD */
	public String m_selectODR_ACPT_PSN_CD = null;
	/** �� 101 �ϐ��F m_selectSALES_QTY */
	public String m_selectSALES_QTY = null;
	/** �� 102 �ϐ��F m_selectSALES_UNIT_PRICE */
	public String m_selectSALES_UNIT_PRICE = null;
	/** �� 103 �ϐ��F m_selectUNIT_CD */
	public String m_selectUNIT_CD = null;
	/** �� 104 �ϐ��F m_selectSALES_AMOUNT */
	public String m_selectSALES_AMOUNT = null;
	/** �� 105 �ϐ��F m_selectSALES_AMOUNT_EXCH_RATES */
	public String m_selectSALES_AMOUNT_EXCH_RATES = null;
	/** �� 106 �ϐ��F m_selectINSPC_ACPT_DATE */
	public String m_selectINSPC_ACPT_DATE = null;
	/** �� 107 �ϐ��F m_selectINSPC_ACPT_QTY */
	public String m_selectINSPC_ACPT_QTY = null;
	/** �� 108 �ϐ��F m_selectEXTERNAL_TAX_SALES_AMOUNT */
	public String m_selectEXTERNAL_TAX_SALES_AMOUNT = null;
	/** �� 109 �ϐ��F m_selectINTERNAL_TAX_SALES_AMOUNT */
	public String m_selectINTERNAL_TAX_SALES_AMOUNT = null;
	/** �� 110 �ϐ��F m_selectTAXFREE_SALES_AMOUNT */
	public String m_selectTAXFREE_SALES_AMOUNT = null;
	/** �� 111 �ϐ��F m_selectTAX_CREDIT_SALES_AMOUNT */
	public String m_selectTAX_CREDIT_SALES_AMOUNT = null;
	/** �� 112 �ϐ��F m_selectEXTERNAL_TAX_AMOUNT */
	public String m_selectEXTERNAL_TAX_AMOUNT = null;
	/** �� 113 �ϐ��F m_selectINTERNAL_TAX_AMOUNT */
	public String m_selectINTERNAL_TAX_AMOUNT = null;
	/** �� 114 �ϐ��F m_selectTAX_AMOUNT_1 */
	public String m_selectTAX_AMOUNT_1 = null;
	/** �� 115 �ϐ��F m_selectTAX_AMOUNT_2 */
	public String m_selectTAX_AMOUNT_2 = null;
	/** �� 116 �ϐ��F m_selectTAX_AMOUNT_3 */
	public String m_selectTAX_AMOUNT_3 = null;
	/** �� 117 �ϐ��F m_selectOWN_CUR_TAXCREDIT_SALES_AMOUNT */
	public String m_selectOWN_CUR_TAXCREDIT_SALES_AMOUNT = null;
	/** �� 118 �ϐ��F m_selectORG_SLIP_CD */
	public String m_selectORG_SLIP_CD = null;
	/** �� 119 �ϐ��F m_selectCURRNCY_CD */
	public String m_selectCURRNCY_CD = null;
	/** �� 120 �ϐ��F m_selectSPCL_PRICE_CO */
	public String m_selectSPCL_PRICE_CO = null;
	/** �� 121 �ϐ��F m_selectREMARKS */
	public String m_selectREMARKS = null;
	/** �� 122 �ϐ��F m_selectINSPC_ACPT_TYP */
	public String m_selectINSPC_ACPT_TYP = null;
	/** �� 123 �ϐ��F m_selectSTATUS */
	public String m_selectSTATUS = null;
	/** �� 124 �ϐ��F m_l_h_SALES_SEQ_NO */
	public String m_l_h_SALES_SEQ_NO = null;
	/** �� 125 �ϐ��F m_salesEXTERNAL_TAX_SALES_AMOUNT */
	public String m_salesEXTERNAL_TAX_SALES_AMOUNT = null;
	/** �� 126 �ϐ��F m_salesINTERNAL_TAX_SALES_AMOUNT */
	public String m_salesINTERNAL_TAX_SALES_AMOUNT = null;
	/** �� 127 �ϐ��F m_salesTAXFREE_SALES_AMOUNT */
	public String m_salesTAXFREE_SALES_AMOUNT = null;
	/** �� 128 �ϐ��F m_salesTAX_CREDIT_SALES_AMOUNT */
	public String m_salesTAX_CREDIT_SALES_AMOUNT = null;
	/** �� 129 �ϐ��F m_salesEXTERNAL_TAX_AMOUNT */
	public String m_salesEXTERNAL_TAX_AMOUNT = null;
	/** �� 130 �ϐ��F m_salesINTERNAL_TAX_AMOUNT */
	public String m_salesINTERNAL_TAX_AMOUNT = null;
	/** �� 131 �ϐ��F m_salesTAX_AMOUNT_1 */
	public String m_salesTAX_AMOUNT_1 = null;
	/** �� 132 �ϐ��F m_salesTAX_AMOUNT_2 */
	public String m_salesTAX_AMOUNT_2 = null;
	/** �� 133 �ϐ��F m_salesTAX_AMOUNT_3 */
	public String m_salesTAX_AMOUNT_3 = null;
	/** �� 134 �ϐ��F m_salesOWN_CUR_TAXCREDIT_SALES_AMOUNT */
	public String m_salesOWN_CUR_TAXCREDIT_SALES_AMOUNT = null;
	/** �� 135 �ϐ��F m_SLIP_CD */
	public String m_SLIP_CD = null;
	/** �� 136 �ϐ��F m_COUNT */
	public String m_COUNT = null;
	/** �� 137 �ϐ��F m_ROW_COUNT */
	public String m_ROW_COUNT = null;
	/** �� 138 �ϐ��F m_insertSLIP_CD */
	public String m_insertSLIP_CD = null;
	/** �� 139 �ϐ��F m_l_h_SHIP_ODR_NO */
	public String m_l_h_SHIP_ODR_NO = null;
	/** �� 140 �ϐ��F m_ORGNAL_SLIP_CD */
	public String m_ORGNAL_SLIP_CD = null;
	/** �� 141 �ϐ��F m_l_h_SHIP_SEQ_NO */
	public String m_l_h_SHIP_SEQ_NO = null;
	/** �� 142 �ϐ��F m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** �� 143 �ϐ��F m_TAX_CD_1 */
	public String m_TAX_CD_1 = null;
	/** �� 144 �ϐ��F m_TAX_CD_2 */
	public String m_TAX_CD_2 = null;
	/** �� 145 �ϐ��F m_EXTERNAL_TAX_SALES_AMOUNT */
	public String m_EXTERNAL_TAX_SALES_AMOUNT = null;
	/** �� 146 �ϐ��F m_INTERNAL_TAX_SALES_AMOUNT */
	public String m_INTERNAL_TAX_SALES_AMOUNT = null;
	/** �� 147 �ϐ��F m_TAXFREE_SALES_AMOUNT */
	public String m_TAXFREE_SALES_AMOUNT = null;
	/** �� 148 �ϐ��F m_TAX_CREDIT_SALES_AMOUNT */
	public String m_TAX_CREDIT_SALES_AMOUNT = null;
	/** �� 149 �ϐ��F m_EXTERNAL_TAX_AMOUNT */
	public String m_EXTERNAL_TAX_AMOUNT = null;
	/** �� 150 �ϐ��F m_INTERNAL_TAX_AMOUNT */
	public String m_INTERNAL_TAX_AMOUNT = null;
	/** �� 151 �ϐ��F m_TAX_AMOUNT_1 */
	public String m_TAX_AMOUNT_1 = null;
	/** �� 152 �ϐ��F m_TAX_AMOUNT_2 */
	public String m_TAX_AMOUNT_2 = null;
	/** �� 153 �ϐ��F m_TAX_AMOUNT_3 */
	public String m_TAX_AMOUNT_3 = null;
	/** �� 154 �ϐ��F m_OWN_CUR_TAXCREDIT_SALES_AMOUNT */
	public String m_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;
	/** �� 155 �ϐ��F m_SLIP_DATE */
	public String m_SLIP_DATE = null;
	/** �� 156 �ϐ��F m_SUM_EXTERNAL_TAX_SALES_AMOUNT */
	public String m_SUM_EXTERNAL_TAX_SALES_AMOUNT = null;
	/** �� 157 �ϐ��F m_SUM_INTERNAL_TAX_SALES_AMOUNT */
	public String m_SUM_INTERNAL_TAX_SALES_AMOUNT = null;
	/** �� 158 �ϐ��F m_SUM_TAXFREE_SALES_AMOUNT */
	public String m_SUM_TAXFREE_SALES_AMOUNT = null;
	/** �� 159 �ϐ��F m_SUM_TAX_CREDIT_SALES_AMOUNT */
	public String m_SUM_TAX_CREDIT_SALES_AMOUNT = null;
	/** �� 160 �ϐ��F m_SUM_EXTERNAL_TAX_AMOUNT */
	public String m_SUM_EXTERNAL_TAX_AMOUNT = null;
	/** �� 161 �ϐ��F m_SUM_INTERNAL_TAX_AMOUNT */
	public String m_SUM_INTERNAL_TAX_AMOUNT = null;
	/** �� 162 �ϐ��F m_SUM_TAX_AMOUNT_1 */
	public String m_SUM_TAX_AMOUNT_1 = null;
	/** �� 163 �ϐ��F m_SUM_TAX_AMOUNT_2 */
	public String m_SUM_TAX_AMOUNT_2 = null;
	/** �� 164 �ϐ��F m_SUM_TAX_AMOUNT_3 */
	public String m_SUM_TAX_AMOUNT_3 = null;
	/** �� 165 �ϐ��F m_SUM_OWN_CUR_TAXCREDIT_SALES_AMOUNT */
	public String m_SUM_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;
	/** �� 166 �ϐ��F m_SEL_SLIP_CD */
	public String m_SEL_SLIP_CD = null;
	/** �� 167 �ϐ��F m_SEL_SHIP_CD */
	public String m_SEL_SHIP_CD = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_h_UPDATE_FLG */
	public List l_h_UPDATE_FLG = null;

	/** �� 2 List�ϐ��F l_r_SEL_PTN1 */
	public List l_r_SEL_PTN1 = null;

	/** �� 3 List�ϐ��F l_r_SEL_PTN2 */
	public List l_r_SEL_PTN2 = null;

	/** �� 4 List�ϐ��F l_INSPC_ACPT_TYP */
	public List l_INSPC_ACPT_TYP = null;

	/** �� 5 List�ϐ��F l_SHIP_DLV_DATE */
	public List l_SHIP_DLV_DATE = null;

	/** �� 6 List�ϐ��F l_l_STATUS */
	public List l_l_STATUS = null;

	/** �� 7 List�ϐ��F l_l_h_STATUS_CD */
	public List l_l_h_STATUS_CD = null;

	/** �� 8 List�ϐ��F l_l_ODR_SCDL_DLV_DATE */
	public List l_l_ODR_SCDL_DLV_DATE = null;

	/** �� 9 List�ϐ��F l_l_SHIP_SCDL_DLV_DATE */
	public List l_l_SHIP_SCDL_DLV_DATE = null;

	/** �� 10 List�ϐ��F l_h_TAX_CD */
	public List l_h_TAX_CD = null;

	/** �� 11 List�ϐ��F l_l_h_SHIP_ODR_AMOUNT */
	public List l_l_h_SHIP_ODR_AMOUNT = null;

	/** �� 12 List�ϐ��F l_l_h_SALES_AMOUNT */
	public List l_l_h_SALES_AMOUNT = null;

	/** �� 13 List�ϐ��F l_l_h_AI_AR_IF_FLG */
	public List l_l_h_AI_AR_IF_FLG = null;

	/** �� 14 List�ϐ��F l_l_h_TAX_DESINATED_SHIP_DATE */
	public List l_l_h_TAX_DESINATED_SHIP_DATE = null;

	/** �� 15 List�ϐ��F l_l_h_SALES_SLIP_CD */
	public List l_l_h_SALES_SLIP_CD = null;

	/** �� 16 List�ϐ��F l_l_h_UPDATE_FLG */
	public List l_l_h_UPDATE_FLG = null;

	/** �� 17 List�ϐ��F l_h_SLIP_CTRL_GRP */
	public List l_h_SLIP_CTRL_GRP = null;

	/** �� 18 List�ϐ��F l_h_ODR_NO */
	public List l_h_ODR_NO = null;

	/** �� 19 List�ϐ��F l_CUST_ODR_NO */
	public List l_CUST_ODR_NO = null;

	/** �� 20 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 21 List�ϐ��F l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** �� 22 List�ϐ��F l_CUST_CD */
	public List l_CUST_CD = null;

	/** �� 23 List�ϐ��F l_CUST_NAME */
	public List l_CUST_NAME = null;

	/** �� 24 List�ϐ��F l_CUST_ITEM_CD */
	public List l_CUST_ITEM_CD = null;

	/** �� 25 List�ϐ��F l_CUST_ITEM_NAME */
	public List l_CUST_ITEM_NAME = null;

	/** �� 26 List�ϐ��F l_ODR_ACPT_DATE */
	public List l_ODR_ACPT_DATE = null;

	/** �� 27 List�ϐ��F l_DESINATED_DLV_DATE */
	public List l_DESINATED_DLV_DATE = null;

	/** �� 28 List�ϐ��F l_ODR_UNIT_PRICE */
	public List l_ODR_UNIT_PRICE = null;

	/** �� 29 List�ϐ��F l_ODR_UNIT_CD */
	public List l_ODR_UNIT_CD = null;

	/** �� 30 List�ϐ��F l_ODR_QTY */
	public List l_ODR_QTY = null;

	/** �� 31 List�ϐ��F l_TAX_CD */
	public List l_TAX_CD = null;

	/** �� 32 List�ϐ��F l_ODR_AMOUNT */
	public List l_ODR_AMOUNT = null;

	/** �� 33 List�ϐ��F l_ODR_AMOUNT_UNIT_CD */
	public List l_ODR_AMOUNT_UNIT_CD = null;

	/** �� 34 List�ϐ��F l_h_INSPC_ACPT_TYP */
	public List l_h_INSPC_ACPT_TYP = null;

	/** �� 35 List�ϐ��F l_h_CURRNCY_CD */
	public List l_h_CURRNCY_CD = null;

	/** �� 36 List�ϐ��F l_h_EXCH_TYP */
	public List l_h_EXCH_TYP = null;

	/** �� 37 List�ϐ��F l_h_PRICE_ROUND_TYP */
	public List l_h_PRICE_ROUND_TYP = null;

	/** �� 38 List�ϐ��F l_h_TRANSPORT_LT */
	public List l_h_TRANSPORT_LT = null;

	/** �� 39 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 40 List�ϐ��F l_h_MODIFY_COUNT */
	public List l_h_MODIFY_COUNT = null;

	/** �� 41 List�ϐ��F l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** �� 42 List�ϐ��F l_ODR_NO */
	public List l_ODR_NO = null;

	/** �� 43 List�ϐ��F l_l_ODR_ODR_NO */
	public List l_l_ODR_ODR_NO = null;

	/** �� 44 List�ϐ��F l_l_JOB_ODR_CD */
	public List l_l_JOB_ODR_CD = null;

	/** �� 45 List�ϐ��F l_l_PART_DLV_SEQ_NO */
	public List l_l_PART_DLV_SEQ_NO = null;

	/** �� 46 List�ϐ��F l_l_DLV_ODR_NO */
	public List l_l_DLV_ODR_NO = null;

	/** �� 47 List�ϐ��F l_l_SHIP_ODR_SLIP_CD */
	public List l_l_SHIP_ODR_SLIP_CD = null;

	/** �� 48 List�ϐ��F l_l_DESINATED_SHIP_DATE */
	public List l_l_DESINATED_SHIP_DATE = null;

	/** �� 49 List�ϐ��F l_l_SCDL_DLV_DATE */
	public List l_l_SCDL_DLV_DATE = null;

	/** �� 50 List�ϐ��F l_l_SHIP_ODR_NO */
	public List l_l_SHIP_ODR_NO = null;

	/** �� 51 List�ϐ��F l_l_ODR_AMOUNT */
	public List l_l_ODR_AMOUNT = null;

	/** �� 52 List�ϐ��F l_l_SHIP_DATE */
	public List l_l_SHIP_DATE = null;

	/** �� 53 List�ϐ��F l_l_SHIP_ODR_AMOUNT */
	public List l_l_SHIP_ODR_AMOUNT = null;

	/** �� 54 List�ϐ��F l_l_SHIP_SEQ_NO */
	public List l_l_SHIP_SEQ_NO = null;

	/** �� 55 List�ϐ��F l_l_SALES_DATE */
	public List l_l_SALES_DATE = null;

	/** �� 56 List�ϐ��F l_l_SALES_AMOUNT */
	public List l_l_SALES_AMOUNT = null;

	/** �� 57 List�ϐ��F l_l_AI_AR_IF_FLG */
	public List l_l_AI_AR_IF_FLG = null;

	/** �� 58 List�ϐ��F l_l_SALES_SEQ_NO */
	public List l_l_SALES_SEQ_NO = null;

	/** �� 59 List�ϐ��F l_l_SALES_SLIP_CD */
	public List l_l_SALES_SLIP_CD = null;

	/** �� 60 List�ϐ��F l_l_SALES_STATUS */
	public List l_l_SALES_STATUS = null;

	/** �� 61 List�ϐ��F l_l_AR_SLIP_CD */
	public List l_l_AR_SLIP_CD = null;

	/** �� 62 List�ϐ��F l_l_AR_TRN_SLIP_CD */
	public List l_l_AR_TRN_SLIP_CD = null;

	/** �� 63 List�ϐ��F l_l_h_INSPC_ACPT_DATE */
	public List l_l_h_INSPC_ACPT_DATE = null;

	/** �� 64 List�ϐ��F l_l_h_AR_INSPC_ACPT_DATE */
	public List l_l_h_AR_INSPC_ACPT_DATE = null;

	/** �� 65 List�ϐ��F l_l_h_AR_SALES_AMOUNT */
	public List l_l_h_AR_SALES_AMOUNT = null;

	/** �� 66 List�ϐ��F l_l_h_AR_TRN_INSPC_ACPT_DATE */
	public List l_l_h_AR_TRN_INSPC_ACPT_DATE = null;

	/** �� 67 List�ϐ��F l_l_h_AR_TRN_SALES_AMOUNT */
	public List l_l_h_AR_TRN_SALES_AMOUNT = null;

	/** �� 68 List�ϐ��F l_AR_STATUS */
	public List l_AR_STATUS = null;

	/** �� 69 List�ϐ��F l_AR_TRN_STATUS */
	public List l_AR_TRN_STATUS = null;

	/** �� 70 List�ϐ��F l_SLIP_CTRL_GRP */
	public List l_SLIP_CTRL_GRP = null;

	/** �� 71 List�ϐ��F l_OPTION_ID */
	public List l_OPTION_ID = null;

	/** �� 72 List�ϐ��F l_CODE */
	public List l_CODE = null;

	/** �� 73 List�ϐ��F l_CREATED_BY */
	public List l_CREATED_BY = null;

	/** �� 74 List�ϐ��F l_CREATED_PRG_NM */
	public List l_CREATED_PRG_NM = null;

	/** �� 75 List�ϐ��F l_slipSHIP_ODR_AMOUNT */
	public List l_slipSHIP_ODR_AMOUNT = null;

	/** �� 76 List�ϐ��F l_slipTAX_AMOUNT */
	public List l_slipTAX_AMOUNT = null;

	/** �� 77 List�ϐ��F l_slipSHIP_ODR_AMOUNT_TAX */
	public List l_slipSHIP_ODR_AMOUNT_TAX = null;

	/** �� 78 List�ϐ��F l_slipEXTERNAL_TAX_SALES_AMOUNT */
	public List l_slipEXTERNAL_TAX_SALES_AMOUNT = null;

	/** �� 79 List�ϐ��F l_slipINTERNAL_TAX_SALES_AMOUNT */
	public List l_slipINTERNAL_TAX_SALES_AMOUNT = null;

	/** �� 80 List�ϐ��F l_slipTAXFREE_SALES_AMOUNT */
	public List l_slipTAXFREE_SALES_AMOUNT = null;

	/** �� 81 List�ϐ��F l_slipTAX_CREDIT_SALES_AMOUNT */
	public List l_slipTAX_CREDIT_SALES_AMOUNT = null;

	/** �� 82 List�ϐ��F l_slipEXTERNAL_TAX_AMOUNT */
	public List l_slipEXTERNAL_TAX_AMOUNT = null;

	/** �� 83 List�ϐ��F l_slipINTERNAL_TAX_AMOUNT */
	public List l_slipINTERNAL_TAX_AMOUNT = null;

	/** �� 84 List�ϐ��F l_slipTAX_AMOUNT_1 */
	public List l_slipTAX_AMOUNT_1 = null;

	/** �� 85 List�ϐ��F l_slipTAX_AMOUNT_2 */
	public List l_slipTAX_AMOUNT_2 = null;

	/** �� 86 List�ϐ��F l_slipTAX_AMOUNT_3 */
	public List l_slipTAX_AMOUNT_3 = null;

	/** �� 87 List�ϐ��F l_slipOWN_CUR_TAXCREDIT_SALES_AMOUNT */
	public List l_slipOWN_CUR_TAXCREDIT_SALES_AMOUNT = null;

	/** �� 88 List�ϐ��F l_selectSHIP_ODR_NO */
	public List l_selectSHIP_ODR_NO = null;

	/** �� 89 List�ϐ��F l_selectSLIP_CD */
	public List l_selectSLIP_CD = null;

	/** �� 90 List�ϐ��F l_selectSALES_TYP */
	public List l_selectSALES_TYP = null;

	/** �� 91 List�ϐ��F l_selectCUST_CD */
	public List l_selectCUST_CD = null;

	/** �� 92 List�ϐ��F l_selectITEM_CD */
	public List l_selectITEM_CD = null;

	/** �� 93 List�ϐ��F l_selectITEM_NAME */
	public List l_selectITEM_NAME = null;

	/** �� 94 List�ϐ��F l_selectCUST_ODR_NO */
	public List l_selectCUST_ODR_NO = null;

	/** �� 95 List�ϐ��F l_selectSALES_DATE */
	public List l_selectSALES_DATE = null;

	/** �� 96 List�ϐ��F l_selectSALES_DEPT_CD */
	public List l_selectSALES_DEPT_CD = null;

	/** �� 97 List�ϐ��F l_selectVEND_CD */
	public List l_selectVEND_CD = null;

	/** �� 98 List�ϐ��F l_selectPRD_ODR_PLACE_CD */
	public List l_selectPRD_ODR_PLACE_CD = null;

	/** �� 99 List�ϐ��F l_selectCUST_CHRG_PSN_CD */
	public List l_selectCUST_CHRG_PSN_CD = null;

	/** �� 100 List�ϐ��F l_selectODR_ACPT_PSN_CD */
	public List l_selectODR_ACPT_PSN_CD = null;

	/** �� 101 List�ϐ��F l_selectSALES_QTY */
	public List l_selectSALES_QTY = null;

	/** �� 102 List�ϐ��F l_selectSALES_UNIT_PRICE */
	public List l_selectSALES_UNIT_PRICE = null;

	/** �� 103 List�ϐ��F l_selectUNIT_CD */
	public List l_selectUNIT_CD = null;

	/** �� 104 List�ϐ��F l_selectSALES_AMOUNT */
	public List l_selectSALES_AMOUNT = null;

	/** �� 105 List�ϐ��F l_selectSALES_AMOUNT_EXCH_RATES */
	public List l_selectSALES_AMOUNT_EXCH_RATES = null;

	/** �� 106 List�ϐ��F l_selectINSPC_ACPT_DATE */
	public List l_selectINSPC_ACPT_DATE = null;

	/** �� 107 List�ϐ��F l_selectINSPC_ACPT_QTY */
	public List l_selectINSPC_ACPT_QTY = null;

	/** �� 108 List�ϐ��F l_selectEXTERNAL_TAX_SALES_AMOUNT */
	public List l_selectEXTERNAL_TAX_SALES_AMOUNT = null;

	/** �� 109 List�ϐ��F l_selectINTERNAL_TAX_SALES_AMOUNT */
	public List l_selectINTERNAL_TAX_SALES_AMOUNT = null;

	/** �� 110 List�ϐ��F l_selectTAXFREE_SALES_AMOUNT */
	public List l_selectTAXFREE_SALES_AMOUNT = null;

	/** �� 111 List�ϐ��F l_selectTAX_CREDIT_SALES_AMOUNT */
	public List l_selectTAX_CREDIT_SALES_AMOUNT = null;

	/** �� 112 List�ϐ��F l_selectEXTERNAL_TAX_AMOUNT */
	public List l_selectEXTERNAL_TAX_AMOUNT = null;

	/** �� 113 List�ϐ��F l_selectINTERNAL_TAX_AMOUNT */
	public List l_selectINTERNAL_TAX_AMOUNT = null;

	/** �� 114 List�ϐ��F l_selectTAX_AMOUNT_1 */
	public List l_selectTAX_AMOUNT_1 = null;

	/** �� 115 List�ϐ��F l_selectTAX_AMOUNT_2 */
	public List l_selectTAX_AMOUNT_2 = null;

	/** �� 116 List�ϐ��F l_selectTAX_AMOUNT_3 */
	public List l_selectTAX_AMOUNT_3 = null;

	/** �� 117 List�ϐ��F l_selectOWN_CUR_TAXCREDIT_SALES_AMOUNT */
	public List l_selectOWN_CUR_TAXCREDIT_SALES_AMOUNT = null;

	/** �� 118 List�ϐ��F l_selectORG_SLIP_CD */
	public List l_selectORG_SLIP_CD = null;

	/** �� 119 List�ϐ��F l_selectCURRNCY_CD */
	public List l_selectCURRNCY_CD = null;

	/** �� 120 List�ϐ��F l_selectSPCL_PRICE_CO */
	public List l_selectSPCL_PRICE_CO = null;

	/** �� 121 List�ϐ��F l_selectREMARKS */
	public List l_selectREMARKS = null;

	/** �� 122 List�ϐ��F l_selectINSPC_ACPT_TYP */
	public List l_selectINSPC_ACPT_TYP = null;

	/** �� 123 List�ϐ��F l_selectSTATUS */
	public List l_selectSTATUS = null;

	/** �� 124 List�ϐ��F l_l_h_SALES_SEQ_NO */
	public List l_l_h_SALES_SEQ_NO = null;

	/** �� 125 List�ϐ��F l_salesEXTERNAL_TAX_SALES_AMOUNT */
	public List l_salesEXTERNAL_TAX_SALES_AMOUNT = null;

	/** �� 126 List�ϐ��F l_salesINTERNAL_TAX_SALES_AMOUNT */
	public List l_salesINTERNAL_TAX_SALES_AMOUNT = null;

	/** �� 127 List�ϐ��F l_salesTAXFREE_SALES_AMOUNT */
	public List l_salesTAXFREE_SALES_AMOUNT = null;

	/** �� 128 List�ϐ��F l_salesTAX_CREDIT_SALES_AMOUNT */
	public List l_salesTAX_CREDIT_SALES_AMOUNT = null;

	/** �� 129 List�ϐ��F l_salesEXTERNAL_TAX_AMOUNT */
	public List l_salesEXTERNAL_TAX_AMOUNT = null;

	/** �� 130 List�ϐ��F l_salesINTERNAL_TAX_AMOUNT */
	public List l_salesINTERNAL_TAX_AMOUNT = null;

	/** �� 131 List�ϐ��F l_salesTAX_AMOUNT_1 */
	public List l_salesTAX_AMOUNT_1 = null;

	/** �� 132 List�ϐ��F l_salesTAX_AMOUNT_2 */
	public List l_salesTAX_AMOUNT_2 = null;

	/** �� 133 List�ϐ��F l_salesTAX_AMOUNT_3 */
	public List l_salesTAX_AMOUNT_3 = null;

	/** �� 134 List�ϐ��F l_salesOWN_CUR_TAXCREDIT_SALES_AMOUNT */
	public List l_salesOWN_CUR_TAXCREDIT_SALES_AMOUNT = null;

	/** �� 135 List�ϐ��F l_SLIP_CD */
	public List l_SLIP_CD = null;

	/** �� 136 List�ϐ��F l_COUNT */
	public List l_COUNT = null;

	/** �� 137 List�ϐ��F l_ROW_COUNT */
	public List l_ROW_COUNT = null;

	/** �� 138 List�ϐ��F l_insertSLIP_CD */
	public List l_insertSLIP_CD = null;

	/** �� 139 List�ϐ��F l_l_h_SHIP_ODR_NO */
	public List l_l_h_SHIP_ODR_NO = null;

	/** �� 140 List�ϐ��F l_ORGNAL_SLIP_CD */
	public List l_ORGNAL_SLIP_CD = null;

	/** �� 141 List�ϐ��F l_l_h_SHIP_SEQ_NO */
	public List l_l_h_SHIP_SEQ_NO = null;

	/** �� 142 List�ϐ��F l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** �� 143 List�ϐ��F l_TAX_CD_1 */
	public List l_TAX_CD_1 = null;

	/** �� 144 List�ϐ��F l_TAX_CD_2 */
	public List l_TAX_CD_2 = null;

	/** �� 145 List�ϐ��F l_EXTERNAL_TAX_SALES_AMOUNT */
	public List l_EXTERNAL_TAX_SALES_AMOUNT = null;

	/** �� 146 List�ϐ��F l_INTERNAL_TAX_SALES_AMOUNT */
	public List l_INTERNAL_TAX_SALES_AMOUNT = null;

	/** �� 147 List�ϐ��F l_TAXFREE_SALES_AMOUNT */
	public List l_TAXFREE_SALES_AMOUNT = null;

	/** �� 148 List�ϐ��F l_TAX_CREDIT_SALES_AMOUNT */
	public List l_TAX_CREDIT_SALES_AMOUNT = null;

	/** �� 149 List�ϐ��F l_EXTERNAL_TAX_AMOUNT */
	public List l_EXTERNAL_TAX_AMOUNT = null;

	/** �� 150 List�ϐ��F l_INTERNAL_TAX_AMOUNT */
	public List l_INTERNAL_TAX_AMOUNT = null;

	/** �� 151 List�ϐ��F l_TAX_AMOUNT_1 */
	public List l_TAX_AMOUNT_1 = null;

	/** �� 152 List�ϐ��F l_TAX_AMOUNT_2 */
	public List l_TAX_AMOUNT_2 = null;

	/** �� 153 List�ϐ��F l_TAX_AMOUNT_3 */
	public List l_TAX_AMOUNT_3 = null;

	/** �� 154 List�ϐ��F l_OWN_CUR_TAXCREDIT_SALES_AMOUNT */
	public List l_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;

	/** �� 155 List�ϐ��F l_SLIP_DATE */
	public List l_SLIP_DATE = null;

	/** �� 156 List�ϐ��F l_SUM_EXTERNAL_TAX_SALES_AMOUNT */
	public List l_SUM_EXTERNAL_TAX_SALES_AMOUNT = null;

	/** �� 157 List�ϐ��F l_SUM_INTERNAL_TAX_SALES_AMOUNT */
	public List l_SUM_INTERNAL_TAX_SALES_AMOUNT = null;

	/** �� 158 List�ϐ��F l_SUM_TAXFREE_SALES_AMOUNT */
	public List l_SUM_TAXFREE_SALES_AMOUNT = null;

	/** �� 159 List�ϐ��F l_SUM_TAX_CREDIT_SALES_AMOUNT */
	public List l_SUM_TAX_CREDIT_SALES_AMOUNT = null;

	/** �� 160 List�ϐ��F l_SUM_EXTERNAL_TAX_AMOUNT */
	public List l_SUM_EXTERNAL_TAX_AMOUNT = null;

	/** �� 161 List�ϐ��F l_SUM_INTERNAL_TAX_AMOUNT */
	public List l_SUM_INTERNAL_TAX_AMOUNT = null;

	/** �� 162 List�ϐ��F l_SUM_TAX_AMOUNT_1 */
	public List l_SUM_TAX_AMOUNT_1 = null;

	/** �� 163 List�ϐ��F l_SUM_TAX_AMOUNT_2 */
	public List l_SUM_TAX_AMOUNT_2 = null;

	/** �� 164 List�ϐ��F l_SUM_TAX_AMOUNT_3 */
	public List l_SUM_TAX_AMOUNT_3 = null;

	/** �� 165 List�ϐ��F l_SUM_OWN_CUR_TAXCREDIT_SALES_AMOUNT */
	public List l_SUM_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;

	/** �� 166 List�ϐ��F l_SEL_SLIP_CD */
	public List l_SEL_SLIP_CD = null;

	/** �� 167 List�ϐ��F l_SEL_SHIP_CD */
	public List l_SEL_SHIP_CD = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String geth_UPDATE_FLG() { return m_h_UPDATE_FLG; }
	public String getr_SEL_PTN1() { return m_r_SEL_PTN1; }
	public String getr_SEL_PTN2() { return m_r_SEL_PTN2; }
	public String getINSPC_ACPT_TYP() { return m_INSPC_ACPT_TYP; }
	public String getSHIP_DLV_DATE() { return m_SHIP_DLV_DATE; }
	public String getl_STATUS() { return m_l_STATUS; }
	public String getl_h_STATUS_CD() { return m_l_h_STATUS_CD; }
	public String getl_ODR_SCDL_DLV_DATE() { return m_l_ODR_SCDL_DLV_DATE; }
	public String getl_SHIP_SCDL_DLV_DATE() { return m_l_SHIP_SCDL_DLV_DATE; }
	public String geth_TAX_CD() { return m_h_TAX_CD; }
	public String getl_h_SHIP_ODR_AMOUNT() { return m_l_h_SHIP_ODR_AMOUNT; }
	public String getl_h_SALES_AMOUNT() { return m_l_h_SALES_AMOUNT; }
	public String getl_h_AI_AR_IF_FLG() { return m_l_h_AI_AR_IF_FLG; }
	public String getl_h_TAX_DESINATED_SHIP_DATE() { return m_l_h_TAX_DESINATED_SHIP_DATE; }
	public String getl_h_SALES_SLIP_CD() { return m_l_h_SALES_SLIP_CD; }
	public String getl_h_UPDATE_FLG() { return m_l_h_UPDATE_FLG; }
	public String geth_SLIP_CTRL_GRP() { return m_h_SLIP_CTRL_GRP; }
	public String geth_ODR_NO() { return m_h_ODR_NO; }
	public String getCUST_ODR_NO() { return m_CUST_ODR_NO; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getCUST_CD() { return m_CUST_CD; }
	public String getCUST_NAME() { return m_CUST_NAME; }
	public String getCUST_ITEM_CD() { return m_CUST_ITEM_CD; }
	public String getCUST_ITEM_NAME() { return m_CUST_ITEM_NAME; }
	public String getODR_ACPT_DATE() { return m_ODR_ACPT_DATE; }
	public String getDESINATED_DLV_DATE() { return m_DESINATED_DLV_DATE; }
	public String getODR_UNIT_PRICE() { return m_ODR_UNIT_PRICE; }
	public String getODR_UNIT_CD() { return m_ODR_UNIT_CD; }
	public String getODR_QTY() { return m_ODR_QTY; }
	public String getTAX_CD() { return m_TAX_CD; }
	public String getODR_AMOUNT() { return m_ODR_AMOUNT; }
	public String getODR_AMOUNT_UNIT_CD() { return m_ODR_AMOUNT_UNIT_CD; }
	public String geth_INSPC_ACPT_TYP() { return m_h_INSPC_ACPT_TYP; }
	public String geth_CURRNCY_CD() { return m_h_CURRNCY_CD; }
	public String geth_EXCH_TYP() { return m_h_EXCH_TYP; }
	public String geth_PRICE_ROUND_TYP() { return m_h_PRICE_ROUND_TYP; }
	public String geth_TRANSPORT_LT() { return m_h_TRANSPORT_LT; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String geth_MODIFY_COUNT() { return m_h_MODIFY_COUNT; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getODR_NO() { return m_ODR_NO; }
	public String getl_ODR_ODR_NO() { return m_l_ODR_ODR_NO; }
	public String getl_JOB_ODR_CD() { return m_l_JOB_ODR_CD; }
	public String getl_PART_DLV_SEQ_NO() { return m_l_PART_DLV_SEQ_NO; }
	public String getl_DLV_ODR_NO() { return m_l_DLV_ODR_NO; }
	public String getl_SHIP_ODR_SLIP_CD() { return m_l_SHIP_ODR_SLIP_CD; }
	public String getl_DESINATED_SHIP_DATE() { return m_l_DESINATED_SHIP_DATE; }
	public String getl_SCDL_DLV_DATE() { return m_l_SCDL_DLV_DATE; }
	public String getl_SHIP_ODR_NO() { return m_l_SHIP_ODR_NO; }
	public String getl_ODR_AMOUNT() { return m_l_ODR_AMOUNT; }
	public String getl_SHIP_DATE() { return m_l_SHIP_DATE; }
	public String getl_SHIP_ODR_AMOUNT() { return m_l_SHIP_ODR_AMOUNT; }
	public String getl_SHIP_SEQ_NO() { return m_l_SHIP_SEQ_NO; }
	public String getl_SALES_DATE() { return m_l_SALES_DATE; }
	public String getl_SALES_AMOUNT() { return m_l_SALES_AMOUNT; }
	public String getl_AI_AR_IF_FLG() { return m_l_AI_AR_IF_FLG; }
	public String getl_SALES_SEQ_NO() { return m_l_SALES_SEQ_NO; }
	public String getl_SALES_SLIP_CD() { return m_l_SALES_SLIP_CD; }
	public String getl_SALES_STATUS() { return m_l_SALES_STATUS; }
	public String getl_AR_SLIP_CD() { return m_l_AR_SLIP_CD; }
	public String getl_AR_TRN_SLIP_CD() { return m_l_AR_TRN_SLIP_CD; }
	public String getl_h_INSPC_ACPT_DATE() { return m_l_h_INSPC_ACPT_DATE; }
	public String getl_h_AR_INSPC_ACPT_DATE() { return m_l_h_AR_INSPC_ACPT_DATE; }
	public String getl_h_AR_SALES_AMOUNT() { return m_l_h_AR_SALES_AMOUNT; }
	public String getl_h_AR_TRN_INSPC_ACPT_DATE() { return m_l_h_AR_TRN_INSPC_ACPT_DATE; }
	public String getl_h_AR_TRN_SALES_AMOUNT() { return m_l_h_AR_TRN_SALES_AMOUNT; }
	public String getAR_STATUS() { return m_AR_STATUS; }
	public String getAR_TRN_STATUS() { return m_AR_TRN_STATUS; }
	public String getSLIP_CTRL_GRP() { return m_SLIP_CTRL_GRP; }
	public String getOPTION_ID() { return m_OPTION_ID; }
	public String getCODE() { return m_CODE; }
	public String getCREATED_BY() { return m_CREATED_BY; }
	public String getCREATED_PRG_NM() { return m_CREATED_PRG_NM; }
	public String getslipSHIP_ODR_AMOUNT() { return m_slipSHIP_ODR_AMOUNT; }
	public String getslipTAX_AMOUNT() { return m_slipTAX_AMOUNT; }
	public String getslipSHIP_ODR_AMOUNT_TAX() { return m_slipSHIP_ODR_AMOUNT_TAX; }
	public String getslipEXTERNAL_TAX_SALES_AMOUNT() { return m_slipEXTERNAL_TAX_SALES_AMOUNT; }
	public String getslipINTERNAL_TAX_SALES_AMOUNT() { return m_slipINTERNAL_TAX_SALES_AMOUNT; }
	public String getslipTAXFREE_SALES_AMOUNT() { return m_slipTAXFREE_SALES_AMOUNT; }
	public String getslipTAX_CREDIT_SALES_AMOUNT() { return m_slipTAX_CREDIT_SALES_AMOUNT; }
	public String getslipEXTERNAL_TAX_AMOUNT() { return m_slipEXTERNAL_TAX_AMOUNT; }
	public String getslipINTERNAL_TAX_AMOUNT() { return m_slipINTERNAL_TAX_AMOUNT; }
	public String getslipTAX_AMOUNT_1() { return m_slipTAX_AMOUNT_1; }
	public String getslipTAX_AMOUNT_2() { return m_slipTAX_AMOUNT_2; }
	public String getslipTAX_AMOUNT_3() { return m_slipTAX_AMOUNT_3; }
	public String getslipOWN_CUR_TAXCREDIT_SALES_AMOUNT() { return m_slipOWN_CUR_TAXCREDIT_SALES_AMOUNT; }
	public String getselectSHIP_ODR_NO() { return m_selectSHIP_ODR_NO; }
	public String getselectSLIP_CD() { return m_selectSLIP_CD; }
	public String getselectSALES_TYP() { return m_selectSALES_TYP; }
	public String getselectCUST_CD() { return m_selectCUST_CD; }
	public String getselectITEM_CD() { return m_selectITEM_CD; }
	public String getselectITEM_NAME() { return m_selectITEM_NAME; }
	public String getselectCUST_ODR_NO() { return m_selectCUST_ODR_NO; }
	public String getselectSALES_DATE() { return m_selectSALES_DATE; }
	public String getselectSALES_DEPT_CD() { return m_selectSALES_DEPT_CD; }
	public String getselectVEND_CD() { return m_selectVEND_CD; }
	public String getselectPRD_ODR_PLACE_CD() { return m_selectPRD_ODR_PLACE_CD; }
	public String getselectCUST_CHRG_PSN_CD() { return m_selectCUST_CHRG_PSN_CD; }
	public String getselectODR_ACPT_PSN_CD() { return m_selectODR_ACPT_PSN_CD; }
	public String getselectSALES_QTY() { return m_selectSALES_QTY; }
	public String getselectSALES_UNIT_PRICE() { return m_selectSALES_UNIT_PRICE; }
	public String getselectUNIT_CD() { return m_selectUNIT_CD; }
	public String getselectSALES_AMOUNT() { return m_selectSALES_AMOUNT; }
	public String getselectSALES_AMOUNT_EXCH_RATES() { return m_selectSALES_AMOUNT_EXCH_RATES; }
	public String getselectINSPC_ACPT_DATE() { return m_selectINSPC_ACPT_DATE; }
	public String getselectINSPC_ACPT_QTY() { return m_selectINSPC_ACPT_QTY; }
	public String getselectEXTERNAL_TAX_SALES_AMOUNT() { return m_selectEXTERNAL_TAX_SALES_AMOUNT; }
	public String getselectINTERNAL_TAX_SALES_AMOUNT() { return m_selectINTERNAL_TAX_SALES_AMOUNT; }
	public String getselectTAXFREE_SALES_AMOUNT() { return m_selectTAXFREE_SALES_AMOUNT; }
	public String getselectTAX_CREDIT_SALES_AMOUNT() { return m_selectTAX_CREDIT_SALES_AMOUNT; }
	public String getselectEXTERNAL_TAX_AMOUNT() { return m_selectEXTERNAL_TAX_AMOUNT; }
	public String getselectINTERNAL_TAX_AMOUNT() { return m_selectINTERNAL_TAX_AMOUNT; }
	public String getselectTAX_AMOUNT_1() { return m_selectTAX_AMOUNT_1; }
	public String getselectTAX_AMOUNT_2() { return m_selectTAX_AMOUNT_2; }
	public String getselectTAX_AMOUNT_3() { return m_selectTAX_AMOUNT_3; }
	public String getselectOWN_CUR_TAXCREDIT_SALES_AMOUNT() { return m_selectOWN_CUR_TAXCREDIT_SALES_AMOUNT; }
	public String getselectORG_SLIP_CD() { return m_selectORG_SLIP_CD; }
	public String getselectCURRNCY_CD() { return m_selectCURRNCY_CD; }
	public String getselectSPCL_PRICE_CO() { return m_selectSPCL_PRICE_CO; }
	public String getselectREMARKS() { return m_selectREMARKS; }
	public String getselectINSPC_ACPT_TYP() { return m_selectINSPC_ACPT_TYP; }
	public String getselectSTATUS() { return m_selectSTATUS; }
	public String getl_h_SALES_SEQ_NO() { return m_l_h_SALES_SEQ_NO; }
	public String getsalesEXTERNAL_TAX_SALES_AMOUNT() { return m_salesEXTERNAL_TAX_SALES_AMOUNT; }
	public String getsalesINTERNAL_TAX_SALES_AMOUNT() { return m_salesINTERNAL_TAX_SALES_AMOUNT; }
	public String getsalesTAXFREE_SALES_AMOUNT() { return m_salesTAXFREE_SALES_AMOUNT; }
	public String getsalesTAX_CREDIT_SALES_AMOUNT() { return m_salesTAX_CREDIT_SALES_AMOUNT; }
	public String getsalesEXTERNAL_TAX_AMOUNT() { return m_salesEXTERNAL_TAX_AMOUNT; }
	public String getsalesINTERNAL_TAX_AMOUNT() { return m_salesINTERNAL_TAX_AMOUNT; }
	public String getsalesTAX_AMOUNT_1() { return m_salesTAX_AMOUNT_1; }
	public String getsalesTAX_AMOUNT_2() { return m_salesTAX_AMOUNT_2; }
	public String getsalesTAX_AMOUNT_3() { return m_salesTAX_AMOUNT_3; }
	public String getsalesOWN_CUR_TAXCREDIT_SALES_AMOUNT() { return m_salesOWN_CUR_TAXCREDIT_SALES_AMOUNT; }
	public String getSLIP_CD() { return m_SLIP_CD; }
	public String getCOUNT() { return m_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }
	public String getinsertSLIP_CD() { return m_insertSLIP_CD; }
	public String getl_h_SHIP_ODR_NO() { return m_l_h_SHIP_ODR_NO; }
	public String getORGNAL_SLIP_CD() { return m_ORGNAL_SLIP_CD; }
	public String getl_h_SHIP_SEQ_NO() { return m_l_h_SHIP_SEQ_NO; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getTAX_CD_1() { return m_TAX_CD_1; }
	public String getTAX_CD_2() { return m_TAX_CD_2; }
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
	public String getSLIP_DATE() { return m_SLIP_DATE; }
	public String getSUM_EXTERNAL_TAX_SALES_AMOUNT() { return m_SUM_EXTERNAL_TAX_SALES_AMOUNT; }
	public String getSUM_INTERNAL_TAX_SALES_AMOUNT() { return m_SUM_INTERNAL_TAX_SALES_AMOUNT; }
	public String getSUM_TAXFREE_SALES_AMOUNT() { return m_SUM_TAXFREE_SALES_AMOUNT; }
	public String getSUM_TAX_CREDIT_SALES_AMOUNT() { return m_SUM_TAX_CREDIT_SALES_AMOUNT; }
	public String getSUM_EXTERNAL_TAX_AMOUNT() { return m_SUM_EXTERNAL_TAX_AMOUNT; }
	public String getSUM_INTERNAL_TAX_AMOUNT() { return m_SUM_INTERNAL_TAX_AMOUNT; }
	public String getSUM_TAX_AMOUNT_1() { return m_SUM_TAX_AMOUNT_1; }
	public String getSUM_TAX_AMOUNT_2() { return m_SUM_TAX_AMOUNT_2; }
	public String getSUM_TAX_AMOUNT_3() { return m_SUM_TAX_AMOUNT_3; }
	public String getSUM_OWN_CUR_TAXCREDIT_SALES_AMOUNT() { return m_SUM_OWN_CUR_TAXCREDIT_SALES_AMOUNT; }
	public String getSEL_SLIP_CD() { return m_SEL_SLIP_CD; }
	public String getSEL_SHIP_CD() { return m_SEL_SHIP_CD; }

	public List getList_h_UPDATE_FLG() { return l_h_UPDATE_FLG; }
	public List getList_r_SEL_PTN1() { return l_r_SEL_PTN1; }
	public List getList_r_SEL_PTN2() { return l_r_SEL_PTN2; }
	public List getList_INSPC_ACPT_TYP() { return l_INSPC_ACPT_TYP; }
	public List getList_SHIP_DLV_DATE() { return l_SHIP_DLV_DATE; }
	public List getList_l_STATUS() { return l_l_STATUS; }
	public List getList_l_h_STATUS_CD() { return l_l_h_STATUS_CD; }
	public List getList_l_ODR_SCDL_DLV_DATE() { return l_l_ODR_SCDL_DLV_DATE; }
	public List getList_l_SHIP_SCDL_DLV_DATE() { return l_l_SHIP_SCDL_DLV_DATE; }
	public List getList_h_TAX_CD() { return l_h_TAX_CD; }
	public List getList_l_h_SHIP_ODR_AMOUNT() { return l_l_h_SHIP_ODR_AMOUNT; }
	public List getList_l_h_SALES_AMOUNT() { return l_l_h_SALES_AMOUNT; }
	public List getList_l_h_AI_AR_IF_FLG() { return l_l_h_AI_AR_IF_FLG; }
	public List getList_l_h_TAX_DESINATED_SHIP_DATE() { return l_l_h_TAX_DESINATED_SHIP_DATE; }
	public List getList_l_h_SALES_SLIP_CD() { return l_l_h_SALES_SLIP_CD; }
	public List getList_l_h_UPDATE_FLG() { return l_l_h_UPDATE_FLG; }
	public List getList_h_SLIP_CTRL_GRP() { return l_h_SLIP_CTRL_GRP; }
	public List getList_h_ODR_NO() { return l_h_ODR_NO; }
	public List getList_CUST_ODR_NO() { return l_CUST_ODR_NO; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_CUST_CD() { return l_CUST_CD; }
	public List getList_CUST_NAME() { return l_CUST_NAME; }
	public List getList_CUST_ITEM_CD() { return l_CUST_ITEM_CD; }
	public List getList_CUST_ITEM_NAME() { return l_CUST_ITEM_NAME; }
	public List getList_ODR_ACPT_DATE() { return l_ODR_ACPT_DATE; }
	public List getList_DESINATED_DLV_DATE() { return l_DESINATED_DLV_DATE; }
	public List getList_ODR_UNIT_PRICE() { return l_ODR_UNIT_PRICE; }
	public List getList_ODR_UNIT_CD() { return l_ODR_UNIT_CD; }
	public List getList_ODR_QTY() { return l_ODR_QTY; }
	public List getList_TAX_CD() { return l_TAX_CD; }
	public List getList_ODR_AMOUNT() { return l_ODR_AMOUNT; }
	public List getList_ODR_AMOUNT_UNIT_CD() { return l_ODR_AMOUNT_UNIT_CD; }
	public List getList_h_INSPC_ACPT_TYP() { return l_h_INSPC_ACPT_TYP; }
	public List getList_h_CURRNCY_CD() { return l_h_CURRNCY_CD; }
	public List getList_h_EXCH_TYP() { return l_h_EXCH_TYP; }
	public List getList_h_PRICE_ROUND_TYP() { return l_h_PRICE_ROUND_TYP; }
	public List getList_h_TRANSPORT_LT() { return l_h_TRANSPORT_LT; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_h_MODIFY_COUNT() { return l_h_MODIFY_COUNT; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_ODR_NO() { return l_ODR_NO; }
	public List getList_l_ODR_ODR_NO() { return l_l_ODR_ODR_NO; }
	public List getList_l_JOB_ODR_CD() { return l_l_JOB_ODR_CD; }
	public List getList_l_PART_DLV_SEQ_NO() { return l_l_PART_DLV_SEQ_NO; }
	public List getList_l_DLV_ODR_NO() { return l_l_DLV_ODR_NO; }
	public List getList_l_SHIP_ODR_SLIP_CD() { return l_l_SHIP_ODR_SLIP_CD; }
	public List getList_l_DESINATED_SHIP_DATE() { return l_l_DESINATED_SHIP_DATE; }
	public List getList_l_SCDL_DLV_DATE() { return l_l_SCDL_DLV_DATE; }
	public List getList_l_SHIP_ODR_NO() { return l_l_SHIP_ODR_NO; }
	public List getList_l_ODR_AMOUNT() { return l_l_ODR_AMOUNT; }
	public List getList_l_SHIP_DATE() { return l_l_SHIP_DATE; }
	public List getList_l_SHIP_ODR_AMOUNT() { return l_l_SHIP_ODR_AMOUNT; }
	public List getList_l_SHIP_SEQ_NO() { return l_l_SHIP_SEQ_NO; }
	public List getList_l_SALES_DATE() { return l_l_SALES_DATE; }
	public List getList_l_SALES_AMOUNT() { return l_l_SALES_AMOUNT; }
	public List getList_l_AI_AR_IF_FLG() { return l_l_AI_AR_IF_FLG; }
	public List getList_l_SALES_SEQ_NO() { return l_l_SALES_SEQ_NO; }
	public List getList_l_SALES_SLIP_CD() { return l_l_SALES_SLIP_CD; }
	public List getList_l_SALES_STATUS() { return l_l_SALES_STATUS; }
	public List getList_l_AR_SLIP_CD() { return l_l_AR_SLIP_CD; }
	public List getList_l_AR_TRN_SLIP_CD() { return l_l_AR_TRN_SLIP_CD; }
	public List getList_l_h_INSPC_ACPT_DATE() { return l_l_h_INSPC_ACPT_DATE; }
	public List getList_l_h_AR_INSPC_ACPT_DATE() { return l_l_h_AR_INSPC_ACPT_DATE; }
	public List getList_l_h_AR_SALES_AMOUNT() { return l_l_h_AR_SALES_AMOUNT; }
	public List getList_l_h_AR_TRN_INSPC_ACPT_DATE() { return l_l_h_AR_TRN_INSPC_ACPT_DATE; }
	public List getList_l_h_AR_TRN_SALES_AMOUNT() { return l_l_h_AR_TRN_SALES_AMOUNT; }
	public List getList_AR_STATUS() { return l_AR_STATUS; }
	public List getList_AR_TRN_STATUS() { return l_AR_TRN_STATUS; }
	public List getList_SLIP_CTRL_GRP() { return l_SLIP_CTRL_GRP; }
	public List getList_OPTION_ID() { return l_OPTION_ID; }
	public List getList_CODE() { return l_CODE; }
	public List getList_CREATED_BY() { return l_CREATED_BY; }
	public List getList_CREATED_PRG_NM() { return l_CREATED_PRG_NM; }
	public List getList_slipSHIP_ODR_AMOUNT() { return l_slipSHIP_ODR_AMOUNT; }
	public List getList_slipTAX_AMOUNT() { return l_slipTAX_AMOUNT; }
	public List getList_slipSHIP_ODR_AMOUNT_TAX() { return l_slipSHIP_ODR_AMOUNT_TAX; }
	public List getList_slipEXTERNAL_TAX_SALES_AMOUNT() { return l_slipEXTERNAL_TAX_SALES_AMOUNT; }
	public List getList_slipINTERNAL_TAX_SALES_AMOUNT() { return l_slipINTERNAL_TAX_SALES_AMOUNT; }
	public List getList_slipTAXFREE_SALES_AMOUNT() { return l_slipTAXFREE_SALES_AMOUNT; }
	public List getList_slipTAX_CREDIT_SALES_AMOUNT() { return l_slipTAX_CREDIT_SALES_AMOUNT; }
	public List getList_slipEXTERNAL_TAX_AMOUNT() { return l_slipEXTERNAL_TAX_AMOUNT; }
	public List getList_slipINTERNAL_TAX_AMOUNT() { return l_slipINTERNAL_TAX_AMOUNT; }
	public List getList_slipTAX_AMOUNT_1() { return l_slipTAX_AMOUNT_1; }
	public List getList_slipTAX_AMOUNT_2() { return l_slipTAX_AMOUNT_2; }
	public List getList_slipTAX_AMOUNT_3() { return l_slipTAX_AMOUNT_3; }
	public List getList_slipOWN_CUR_TAXCREDIT_SALES_AMOUNT() { return l_slipOWN_CUR_TAXCREDIT_SALES_AMOUNT; }
	public List getList_selectSHIP_ODR_NO() { return l_selectSHIP_ODR_NO; }
	public List getList_selectSLIP_CD() { return l_selectSLIP_CD; }
	public List getList_selectSALES_TYP() { return l_selectSALES_TYP; }
	public List getList_selectCUST_CD() { return l_selectCUST_CD; }
	public List getList_selectITEM_CD() { return l_selectITEM_CD; }
	public List getList_selectITEM_NAME() { return l_selectITEM_NAME; }
	public List getList_selectCUST_ODR_NO() { return l_selectCUST_ODR_NO; }
	public List getList_selectSALES_DATE() { return l_selectSALES_DATE; }
	public List getList_selectSALES_DEPT_CD() { return l_selectSALES_DEPT_CD; }
	public List getList_selectVEND_CD() { return l_selectVEND_CD; }
	public List getList_selectPRD_ODR_PLACE_CD() { return l_selectPRD_ODR_PLACE_CD; }
	public List getList_selectCUST_CHRG_PSN_CD() { return l_selectCUST_CHRG_PSN_CD; }
	public List getList_selectODR_ACPT_PSN_CD() { return l_selectODR_ACPT_PSN_CD; }
	public List getList_selectSALES_QTY() { return l_selectSALES_QTY; }
	public List getList_selectSALES_UNIT_PRICE() { return l_selectSALES_UNIT_PRICE; }
	public List getList_selectUNIT_CD() { return l_selectUNIT_CD; }
	public List getList_selectSALES_AMOUNT() { return l_selectSALES_AMOUNT; }
	public List getList_selectSALES_AMOUNT_EXCH_RATES() { return l_selectSALES_AMOUNT_EXCH_RATES; }
	public List getList_selectINSPC_ACPT_DATE() { return l_selectINSPC_ACPT_DATE; }
	public List getList_selectINSPC_ACPT_QTY() { return l_selectINSPC_ACPT_QTY; }
	public List getList_selectEXTERNAL_TAX_SALES_AMOUNT() { return l_selectEXTERNAL_TAX_SALES_AMOUNT; }
	public List getList_selectINTERNAL_TAX_SALES_AMOUNT() { return l_selectINTERNAL_TAX_SALES_AMOUNT; }
	public List getList_selectTAXFREE_SALES_AMOUNT() { return l_selectTAXFREE_SALES_AMOUNT; }
	public List getList_selectTAX_CREDIT_SALES_AMOUNT() { return l_selectTAX_CREDIT_SALES_AMOUNT; }
	public List getList_selectEXTERNAL_TAX_AMOUNT() { return l_selectEXTERNAL_TAX_AMOUNT; }
	public List getList_selectINTERNAL_TAX_AMOUNT() { return l_selectINTERNAL_TAX_AMOUNT; }
	public List getList_selectTAX_AMOUNT_1() { return l_selectTAX_AMOUNT_1; }
	public List getList_selectTAX_AMOUNT_2() { return l_selectTAX_AMOUNT_2; }
	public List getList_selectTAX_AMOUNT_3() { return l_selectTAX_AMOUNT_3; }
	public List getList_selectOWN_CUR_TAXCREDIT_SALES_AMOUNT() { return l_selectOWN_CUR_TAXCREDIT_SALES_AMOUNT; }
	public List getList_selectORG_SLIP_CD() { return l_selectORG_SLIP_CD; }
	public List getList_selectCURRNCY_CD() { return l_selectCURRNCY_CD; }
	public List getList_selectSPCL_PRICE_CO() { return l_selectSPCL_PRICE_CO; }
	public List getList_selectREMARKS() { return l_selectREMARKS; }
	public List getList_selectINSPC_ACPT_TYP() { return l_selectINSPC_ACPT_TYP; }
	public List getList_selectSTATUS() { return l_selectSTATUS; }
	public List getList_l_h_SALES_SEQ_NO() { return l_l_h_SALES_SEQ_NO; }
	public List getList_salesEXTERNAL_TAX_SALES_AMOUNT() { return l_salesEXTERNAL_TAX_SALES_AMOUNT; }
	public List getList_salesINTERNAL_TAX_SALES_AMOUNT() { return l_salesINTERNAL_TAX_SALES_AMOUNT; }
	public List getList_salesTAXFREE_SALES_AMOUNT() { return l_salesTAXFREE_SALES_AMOUNT; }
	public List getList_salesTAX_CREDIT_SALES_AMOUNT() { return l_salesTAX_CREDIT_SALES_AMOUNT; }
	public List getList_salesEXTERNAL_TAX_AMOUNT() { return l_salesEXTERNAL_TAX_AMOUNT; }
	public List getList_salesINTERNAL_TAX_AMOUNT() { return l_salesINTERNAL_TAX_AMOUNT; }
	public List getList_salesTAX_AMOUNT_1() { return l_salesTAX_AMOUNT_1; }
	public List getList_salesTAX_AMOUNT_2() { return l_salesTAX_AMOUNT_2; }
	public List getList_salesTAX_AMOUNT_3() { return l_salesTAX_AMOUNT_3; }
	public List getList_salesOWN_CUR_TAXCREDIT_SALES_AMOUNT() { return l_salesOWN_CUR_TAXCREDIT_SALES_AMOUNT; }
	public List getList_SLIP_CD() { return l_SLIP_CD; }
	public List getList_COUNT() { return l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }
	public List getList_insertSLIP_CD() { return l_insertSLIP_CD; }
	public List getList_l_h_SHIP_ODR_NO() { return l_l_h_SHIP_ODR_NO; }
	public List getList_ORGNAL_SLIP_CD() { return l_ORGNAL_SLIP_CD; }
	public List getList_l_h_SHIP_SEQ_NO() { return l_l_h_SHIP_SEQ_NO; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_TAX_CD_1() { return l_TAX_CD_1; }
	public List getList_TAX_CD_2() { return l_TAX_CD_2; }
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
	public List getList_SLIP_DATE() { return l_SLIP_DATE; }
	public List getList_SUM_EXTERNAL_TAX_SALES_AMOUNT() { return l_SUM_EXTERNAL_TAX_SALES_AMOUNT; }
	public List getList_SUM_INTERNAL_TAX_SALES_AMOUNT() { return l_SUM_INTERNAL_TAX_SALES_AMOUNT; }
	public List getList_SUM_TAXFREE_SALES_AMOUNT() { return l_SUM_TAXFREE_SALES_AMOUNT; }
	public List getList_SUM_TAX_CREDIT_SALES_AMOUNT() { return l_SUM_TAX_CREDIT_SALES_AMOUNT; }
	public List getList_SUM_EXTERNAL_TAX_AMOUNT() { return l_SUM_EXTERNAL_TAX_AMOUNT; }
	public List getList_SUM_INTERNAL_TAX_AMOUNT() { return l_SUM_INTERNAL_TAX_AMOUNT; }
	public List getList_SUM_TAX_AMOUNT_1() { return l_SUM_TAX_AMOUNT_1; }
	public List getList_SUM_TAX_AMOUNT_2() { return l_SUM_TAX_AMOUNT_2; }
	public List getList_SUM_TAX_AMOUNT_3() { return l_SUM_TAX_AMOUNT_3; }
	public List getList_SUM_OWN_CUR_TAXCREDIT_SALES_AMOUNT() { return l_SUM_OWN_CUR_TAXCREDIT_SALES_AMOUNT; }
	public List getList_SEL_SLIP_CD() { return l_SEL_SLIP_CD; }
	public List getList_SEL_SHIP_CD() { return l_SEL_SHIP_CD; }

	public void seth_UPDATE_FLG(String val) { m_h_UPDATE_FLG = val; }
	public void setr_SEL_PTN1(String val) { m_r_SEL_PTN1 = val; }
	public void setr_SEL_PTN2(String val) { m_r_SEL_PTN2 = val; }
	public void setINSPC_ACPT_TYP(String val) { m_INSPC_ACPT_TYP = val; }
	public void setSHIP_DLV_DATE(String val) { m_SHIP_DLV_DATE = val; }
	public void setl_STATUS(String val) { m_l_STATUS = val; }
	public void setl_h_STATUS_CD(String val) { m_l_h_STATUS_CD = val; }
	public void setl_ODR_SCDL_DLV_DATE(String val) { m_l_ODR_SCDL_DLV_DATE = val; }
	public void setl_SHIP_SCDL_DLV_DATE(String val) { m_l_SHIP_SCDL_DLV_DATE = val; }
	public void seth_TAX_CD(String val) { m_h_TAX_CD = val; }
	public void setl_h_SHIP_ODR_AMOUNT(String val) { m_l_h_SHIP_ODR_AMOUNT = val; }
	public void setl_h_SALES_AMOUNT(String val) { m_l_h_SALES_AMOUNT = val; }
	public void setl_h_AI_AR_IF_FLG(String val) { m_l_h_AI_AR_IF_FLG = val; }
	public void setl_h_TAX_DESINATED_SHIP_DATE(String val) { m_l_h_TAX_DESINATED_SHIP_DATE = val; }
	public void setl_h_SALES_SLIP_CD(String val) { m_l_h_SALES_SLIP_CD = val; }
	public void setl_h_UPDATE_FLG(String val) { m_l_h_UPDATE_FLG = val; }
	public void seth_SLIP_CTRL_GRP(String val) { m_h_SLIP_CTRL_GRP = val; }
	public void seth_ODR_NO(String val) { m_h_ODR_NO = val; }
	public void setCUST_ODR_NO(String val) { m_CUST_ODR_NO = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setCUST_CD(String val) { m_CUST_CD = val; }
	public void setCUST_NAME(String val) { m_CUST_NAME = val; }
	public void setCUST_ITEM_CD(String val) { m_CUST_ITEM_CD = val; }
	public void setCUST_ITEM_NAME(String val) { m_CUST_ITEM_NAME = val; }
	public void setODR_ACPT_DATE(String val) { m_ODR_ACPT_DATE = val; }
	public void setDESINATED_DLV_DATE(String val) { m_DESINATED_DLV_DATE = val; }
	public void setODR_UNIT_PRICE(String val) { m_ODR_UNIT_PRICE = val; }
	public void setODR_UNIT_CD(String val) { m_ODR_UNIT_CD = val; }
	public void setODR_QTY(String val) { m_ODR_QTY = val; }
	public void setTAX_CD(String val) { m_TAX_CD = val; }
	public void setODR_AMOUNT(String val) { m_ODR_AMOUNT = val; }
	public void setODR_AMOUNT_UNIT_CD(String val) { m_ODR_AMOUNT_UNIT_CD = val; }
	public void seth_INSPC_ACPT_TYP(String val) { m_h_INSPC_ACPT_TYP = val; }
	public void seth_CURRNCY_CD(String val) { m_h_CURRNCY_CD = val; }
	public void seth_EXCH_TYP(String val) { m_h_EXCH_TYP = val; }
	public void seth_PRICE_ROUND_TYP(String val) { m_h_PRICE_ROUND_TYP = val; }
	public void seth_TRANSPORT_LT(String val) { m_h_TRANSPORT_LT = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void seth_MODIFY_COUNT(String val) { m_h_MODIFY_COUNT = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setODR_NO(String val) { m_ODR_NO = val; }
	public void setl_ODR_ODR_NO(String val) { m_l_ODR_ODR_NO = val; }
	public void setl_JOB_ODR_CD(String val) { m_l_JOB_ODR_CD = val; }
	public void setl_PART_DLV_SEQ_NO(String val) { m_l_PART_DLV_SEQ_NO = val; }
	public void setl_DLV_ODR_NO(String val) { m_l_DLV_ODR_NO = val; }
	public void setl_SHIP_ODR_SLIP_CD(String val) { m_l_SHIP_ODR_SLIP_CD = val; }
	public void setl_DESINATED_SHIP_DATE(String val) { m_l_DESINATED_SHIP_DATE = val; }
	public void setl_SCDL_DLV_DATE(String val) { m_l_SCDL_DLV_DATE = val; }
	public void setl_SHIP_ODR_NO(String val) { m_l_SHIP_ODR_NO = val; }
	public void setl_ODR_AMOUNT(String val) { m_l_ODR_AMOUNT = val; }
	public void setl_SHIP_DATE(String val) { m_l_SHIP_DATE = val; }
	public void setl_SHIP_ODR_AMOUNT(String val) { m_l_SHIP_ODR_AMOUNT = val; }
	public void setl_SHIP_SEQ_NO(String val) { m_l_SHIP_SEQ_NO = val; }
	public void setl_SALES_DATE(String val) { m_l_SALES_DATE = val; }
	public void setl_SALES_AMOUNT(String val) { m_l_SALES_AMOUNT = val; }
	public void setl_AI_AR_IF_FLG(String val) { m_l_AI_AR_IF_FLG = val; }
	public void setl_SALES_SEQ_NO(String val) { m_l_SALES_SEQ_NO = val; }
	public void setl_SALES_SLIP_CD(String val) { m_l_SALES_SLIP_CD = val; }
	public void setl_SALES_STATUS(String val) { m_l_SALES_STATUS = val; }
	public void setl_AR_SLIP_CD(String val) { m_l_AR_SLIP_CD = val; }
	public void setl_AR_TRN_SLIP_CD(String val) { m_l_AR_TRN_SLIP_CD = val; }
	public void setl_h_INSPC_ACPT_DATE(String val) { m_l_h_INSPC_ACPT_DATE = val; }
	public void setl_h_AR_INSPC_ACPT_DATE(String val) { m_l_h_AR_INSPC_ACPT_DATE = val; }
	public void setl_h_AR_SALES_AMOUNT(String val) { m_l_h_AR_SALES_AMOUNT = val; }
	public void setl_h_AR_TRN_INSPC_ACPT_DATE(String val) { m_l_h_AR_TRN_INSPC_ACPT_DATE = val; }
	public void setl_h_AR_TRN_SALES_AMOUNT(String val) { m_l_h_AR_TRN_SALES_AMOUNT = val; }
	public void setAR_STATUS(String val) { m_AR_STATUS = val; }
	public void setAR_TRN_STATUS(String val) { m_AR_TRN_STATUS = val; }
	public void setSLIP_CTRL_GRP(String val) { m_SLIP_CTRL_GRP = val; }
	public void setOPTION_ID(String val) { m_OPTION_ID = val; }
	public void setCODE(String val) { m_CODE = val; }
	public void setCREATED_BY(String val) { m_CREATED_BY = val; }
	public void setCREATED_PRG_NM(String val) { m_CREATED_PRG_NM = val; }
	public void setslipSHIP_ODR_AMOUNT(String val) { m_slipSHIP_ODR_AMOUNT = val; }
	public void setslipTAX_AMOUNT(String val) { m_slipTAX_AMOUNT = val; }
	public void setslipSHIP_ODR_AMOUNT_TAX(String val) { m_slipSHIP_ODR_AMOUNT_TAX = val; }
	public void setslipEXTERNAL_TAX_SALES_AMOUNT(String val) { m_slipEXTERNAL_TAX_SALES_AMOUNT = val; }
	public void setslipINTERNAL_TAX_SALES_AMOUNT(String val) { m_slipINTERNAL_TAX_SALES_AMOUNT = val; }
	public void setslipTAXFREE_SALES_AMOUNT(String val) { m_slipTAXFREE_SALES_AMOUNT = val; }
	public void setslipTAX_CREDIT_SALES_AMOUNT(String val) { m_slipTAX_CREDIT_SALES_AMOUNT = val; }
	public void setslipEXTERNAL_TAX_AMOUNT(String val) { m_slipEXTERNAL_TAX_AMOUNT = val; }
	public void setslipINTERNAL_TAX_AMOUNT(String val) { m_slipINTERNAL_TAX_AMOUNT = val; }
	public void setslipTAX_AMOUNT_1(String val) { m_slipTAX_AMOUNT_1 = val; }
	public void setslipTAX_AMOUNT_2(String val) { m_slipTAX_AMOUNT_2 = val; }
	public void setslipTAX_AMOUNT_3(String val) { m_slipTAX_AMOUNT_3 = val; }
	public void setslipOWN_CUR_TAXCREDIT_SALES_AMOUNT(String val) { m_slipOWN_CUR_TAXCREDIT_SALES_AMOUNT = val; }
	public void setselectSHIP_ODR_NO(String val) { m_selectSHIP_ODR_NO = val; }
	public void setselectSLIP_CD(String val) { m_selectSLIP_CD = val; }
	public void setselectSALES_TYP(String val) { m_selectSALES_TYP = val; }
	public void setselectCUST_CD(String val) { m_selectCUST_CD = val; }
	public void setselectITEM_CD(String val) { m_selectITEM_CD = val; }
	public void setselectITEM_NAME(String val) { m_selectITEM_NAME = val; }
	public void setselectCUST_ODR_NO(String val) { m_selectCUST_ODR_NO = val; }
	public void setselectSALES_DATE(String val) { m_selectSALES_DATE = val; }
	public void setselectSALES_DEPT_CD(String val) { m_selectSALES_DEPT_CD = val; }
	public void setselectVEND_CD(String val) { m_selectVEND_CD = val; }
	public void setselectPRD_ODR_PLACE_CD(String val) { m_selectPRD_ODR_PLACE_CD = val; }
	public void setselectCUST_CHRG_PSN_CD(String val) { m_selectCUST_CHRG_PSN_CD = val; }
	public void setselectODR_ACPT_PSN_CD(String val) { m_selectODR_ACPT_PSN_CD = val; }
	public void setselectSALES_QTY(String val) { m_selectSALES_QTY = val; }
	public void setselectSALES_UNIT_PRICE(String val) { m_selectSALES_UNIT_PRICE = val; }
	public void setselectUNIT_CD(String val) { m_selectUNIT_CD = val; }
	public void setselectSALES_AMOUNT(String val) { m_selectSALES_AMOUNT = val; }
	public void setselectSALES_AMOUNT_EXCH_RATES(String val) { m_selectSALES_AMOUNT_EXCH_RATES = val; }
	public void setselectINSPC_ACPT_DATE(String val) { m_selectINSPC_ACPT_DATE = val; }
	public void setselectINSPC_ACPT_QTY(String val) { m_selectINSPC_ACPT_QTY = val; }
	public void setselectEXTERNAL_TAX_SALES_AMOUNT(String val) { m_selectEXTERNAL_TAX_SALES_AMOUNT = val; }
	public void setselectINTERNAL_TAX_SALES_AMOUNT(String val) { m_selectINTERNAL_TAX_SALES_AMOUNT = val; }
	public void setselectTAXFREE_SALES_AMOUNT(String val) { m_selectTAXFREE_SALES_AMOUNT = val; }
	public void setselectTAX_CREDIT_SALES_AMOUNT(String val) { m_selectTAX_CREDIT_SALES_AMOUNT = val; }
	public void setselectEXTERNAL_TAX_AMOUNT(String val) { m_selectEXTERNAL_TAX_AMOUNT = val; }
	public void setselectINTERNAL_TAX_AMOUNT(String val) { m_selectINTERNAL_TAX_AMOUNT = val; }
	public void setselectTAX_AMOUNT_1(String val) { m_selectTAX_AMOUNT_1 = val; }
	public void setselectTAX_AMOUNT_2(String val) { m_selectTAX_AMOUNT_2 = val; }
	public void setselectTAX_AMOUNT_3(String val) { m_selectTAX_AMOUNT_3 = val; }
	public void setselectOWN_CUR_TAXCREDIT_SALES_AMOUNT(String val) { m_selectOWN_CUR_TAXCREDIT_SALES_AMOUNT = val; }
	public void setselectORG_SLIP_CD(String val) { m_selectORG_SLIP_CD = val; }
	public void setselectCURRNCY_CD(String val) { m_selectCURRNCY_CD = val; }
	public void setselectSPCL_PRICE_CO(String val) { m_selectSPCL_PRICE_CO = val; }
	public void setselectREMARKS(String val) { m_selectREMARKS = val; }
	public void setselectINSPC_ACPT_TYP(String val) { m_selectINSPC_ACPT_TYP = val; }
	public void setselectSTATUS(String val) { m_selectSTATUS = val; }
	public void setl_h_SALES_SEQ_NO(String val) { m_l_h_SALES_SEQ_NO = val; }
	public void setsalesEXTERNAL_TAX_SALES_AMOUNT(String val) { m_salesEXTERNAL_TAX_SALES_AMOUNT = val; }
	public void setsalesINTERNAL_TAX_SALES_AMOUNT(String val) { m_salesINTERNAL_TAX_SALES_AMOUNT = val; }
	public void setsalesTAXFREE_SALES_AMOUNT(String val) { m_salesTAXFREE_SALES_AMOUNT = val; }
	public void setsalesTAX_CREDIT_SALES_AMOUNT(String val) { m_salesTAX_CREDIT_SALES_AMOUNT = val; }
	public void setsalesEXTERNAL_TAX_AMOUNT(String val) { m_salesEXTERNAL_TAX_AMOUNT = val; }
	public void setsalesINTERNAL_TAX_AMOUNT(String val) { m_salesINTERNAL_TAX_AMOUNT = val; }
	public void setsalesTAX_AMOUNT_1(String val) { m_salesTAX_AMOUNT_1 = val; }
	public void setsalesTAX_AMOUNT_2(String val) { m_salesTAX_AMOUNT_2 = val; }
	public void setsalesTAX_AMOUNT_3(String val) { m_salesTAX_AMOUNT_3 = val; }
	public void setsalesOWN_CUR_TAXCREDIT_SALES_AMOUNT(String val) { m_salesOWN_CUR_TAXCREDIT_SALES_AMOUNT = val; }
	public void setSLIP_CD(String val) { m_SLIP_CD = val; }
	public void setCOUNT(String val) { m_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }
	public void setinsertSLIP_CD(String val) { m_insertSLIP_CD = val; }
	public void setl_h_SHIP_ODR_NO(String val) { m_l_h_SHIP_ODR_NO = val; }
	public void setORGNAL_SLIP_CD(String val) { m_ORGNAL_SLIP_CD = val; }
	public void setl_h_SHIP_SEQ_NO(String val) { m_l_h_SHIP_SEQ_NO = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setTAX_CD_1(String val) { m_TAX_CD_1 = val; }
	public void setTAX_CD_2(String val) { m_TAX_CD_2 = val; }
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
	public void setSLIP_DATE(String val) { m_SLIP_DATE = val; }
	public void setSUM_EXTERNAL_TAX_SALES_AMOUNT(String val) { m_SUM_EXTERNAL_TAX_SALES_AMOUNT = val; }
	public void setSUM_INTERNAL_TAX_SALES_AMOUNT(String val) { m_SUM_INTERNAL_TAX_SALES_AMOUNT = val; }
	public void setSUM_TAXFREE_SALES_AMOUNT(String val) { m_SUM_TAXFREE_SALES_AMOUNT = val; }
	public void setSUM_TAX_CREDIT_SALES_AMOUNT(String val) { m_SUM_TAX_CREDIT_SALES_AMOUNT = val; }
	public void setSUM_EXTERNAL_TAX_AMOUNT(String val) { m_SUM_EXTERNAL_TAX_AMOUNT = val; }
	public void setSUM_INTERNAL_TAX_AMOUNT(String val) { m_SUM_INTERNAL_TAX_AMOUNT = val; }
	public void setSUM_TAX_AMOUNT_1(String val) { m_SUM_TAX_AMOUNT_1 = val; }
	public void setSUM_TAX_AMOUNT_2(String val) { m_SUM_TAX_AMOUNT_2 = val; }
	public void setSUM_TAX_AMOUNT_3(String val) { m_SUM_TAX_AMOUNT_3 = val; }
	public void setSUM_OWN_CUR_TAXCREDIT_SALES_AMOUNT(String val) { m_SUM_OWN_CUR_TAXCREDIT_SALES_AMOUNT = val; }
	public void setSEL_SLIP_CD(String val) { m_SEL_SLIP_CD = val; }
	public void setSEL_SHIP_CD(String val) { m_SEL_SHIP_CD = val; }


	public void setList_h_UPDATE_FLG(List list) { l_h_UPDATE_FLG = list; }
	public void setList_r_SEL_PTN1(List list) { l_r_SEL_PTN1 = list; }
	public void setList_r_SEL_PTN2(List list) { l_r_SEL_PTN2 = list; }
	public void setList_INSPC_ACPT_TYP(List list) { l_INSPC_ACPT_TYP = list; }
	public void setList_SHIP_DLV_DATE(List list) { l_SHIP_DLV_DATE = list; }
	public void setList_l_STATUS(List list) { l_l_STATUS = list; }
	public void setList_l_h_STATUS_CD(List list) { l_l_h_STATUS_CD = list; }
	public void setList_l_ODR_SCDL_DLV_DATE(List list) { l_l_ODR_SCDL_DLV_DATE = list; }
	public void setList_l_SHIP_SCDL_DLV_DATE(List list) { l_l_SHIP_SCDL_DLV_DATE = list; }
	public void setList_h_TAX_CD(List list) { l_h_TAX_CD = list; }
	public void setList_l_h_SHIP_ODR_AMOUNT(List list) { l_l_h_SHIP_ODR_AMOUNT = list; }
	public void setList_l_h_SALES_AMOUNT(List list) { l_l_h_SALES_AMOUNT = list; }
	public void setList_l_h_AI_AR_IF_FLG(List list) { l_l_h_AI_AR_IF_FLG = list; }
	public void setList_l_h_TAX_DESINATED_SHIP_DATE(List list) { l_l_h_TAX_DESINATED_SHIP_DATE = list; }
	public void setList_l_h_SALES_SLIP_CD(List list) { l_l_h_SALES_SLIP_CD = list; }
	public void setList_l_h_UPDATE_FLG(List list) { l_l_h_UPDATE_FLG = list; }
	public void setList_h_SLIP_CTRL_GRP(List list) { l_h_SLIP_CTRL_GRP = list; }
	public void setList_h_ODR_NO(List list) { l_h_ODR_NO = list; }
	public void setList_CUST_ODR_NO(List list) { l_CUST_ODR_NO = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_CUST_CD(List list) { l_CUST_CD = list; }
	public void setList_CUST_NAME(List list) { l_CUST_NAME = list; }
	public void setList_CUST_ITEM_CD(List list) { l_CUST_ITEM_CD = list; }
	public void setList_CUST_ITEM_NAME(List list) { l_CUST_ITEM_NAME = list; }
	public void setList_ODR_ACPT_DATE(List list) { l_ODR_ACPT_DATE = list; }
	public void setList_DESINATED_DLV_DATE(List list) { l_DESINATED_DLV_DATE = list; }
	public void setList_ODR_UNIT_PRICE(List list) { l_ODR_UNIT_PRICE = list; }
	public void setList_ODR_UNIT_CD(List list) { l_ODR_UNIT_CD = list; }
	public void setList_ODR_QTY(List list) { l_ODR_QTY = list; }
	public void setList_TAX_CD(List list) { l_TAX_CD = list; }
	public void setList_ODR_AMOUNT(List list) { l_ODR_AMOUNT = list; }
	public void setList_ODR_AMOUNT_UNIT_CD(List list) { l_ODR_AMOUNT_UNIT_CD = list; }
	public void setList_h_INSPC_ACPT_TYP(List list) { l_h_INSPC_ACPT_TYP = list; }
	public void setList_h_CURRNCY_CD(List list) { l_h_CURRNCY_CD = list; }
	public void setList_h_EXCH_TYP(List list) { l_h_EXCH_TYP = list; }
	public void setList_h_PRICE_ROUND_TYP(List list) { l_h_PRICE_ROUND_TYP = list; }
	public void setList_h_TRANSPORT_LT(List list) { l_h_TRANSPORT_LT = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_h_MODIFY_COUNT(List list) { l_h_MODIFY_COUNT = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_ODR_NO(List list) { l_ODR_NO = list; }
	public void setList_l_ODR_ODR_NO(List list) { l_l_ODR_ODR_NO = list; }
	public void setList_l_JOB_ODR_CD(List list) { l_l_JOB_ODR_CD = list; }
	public void setList_l_PART_DLV_SEQ_NO(List list) { l_l_PART_DLV_SEQ_NO = list; }
	public void setList_l_DLV_ODR_NO(List list) { l_l_DLV_ODR_NO = list; }
	public void setList_l_SHIP_ODR_SLIP_CD(List list) { l_l_SHIP_ODR_SLIP_CD = list; }
	public void setList_l_DESINATED_SHIP_DATE(List list) { l_l_DESINATED_SHIP_DATE = list; }
	public void setList_l_SCDL_DLV_DATE(List list) { l_l_SCDL_DLV_DATE = list; }
	public void setList_l_SHIP_ODR_NO(List list) { l_l_SHIP_ODR_NO = list; }
	public void setList_l_ODR_AMOUNT(List list) { l_l_ODR_AMOUNT = list; }
	public void setList_l_SHIP_DATE(List list) { l_l_SHIP_DATE = list; }
	public void setList_l_SHIP_ODR_AMOUNT(List list) { l_l_SHIP_ODR_AMOUNT = list; }
	public void setList_l_SHIP_SEQ_NO(List list) { l_l_SHIP_SEQ_NO = list; }
	public void setList_l_SALES_DATE(List list) { l_l_SALES_DATE = list; }
	public void setList_l_SALES_AMOUNT(List list) { l_l_SALES_AMOUNT = list; }
	public void setList_l_AI_AR_IF_FLG(List list) { l_l_AI_AR_IF_FLG = list; }
	public void setList_l_SALES_SEQ_NO(List list) { l_l_SALES_SEQ_NO = list; }
	public void setList_l_SALES_SLIP_CD(List list) { l_l_SALES_SLIP_CD = list; }
	public void setList_l_SALES_STATUS(List list) { l_l_SALES_STATUS = list; }
	public void setList_l_AR_SLIP_CD(List list) { l_l_AR_SLIP_CD = list; }
	public void setList_l_AR_TRN_SLIP_CD(List list) { l_l_AR_TRN_SLIP_CD = list; }
	public void setList_l_h_INSPC_ACPT_DATE(List list) { l_l_h_INSPC_ACPT_DATE = list; }
	public void setList_l_h_AR_INSPC_ACPT_DATE(List list) { l_l_h_AR_INSPC_ACPT_DATE = list; }
	public void setList_l_h_AR_SALES_AMOUNT(List list) { l_l_h_AR_SALES_AMOUNT = list; }
	public void setList_l_h_AR_TRN_INSPC_ACPT_DATE(List list) { l_l_h_AR_TRN_INSPC_ACPT_DATE = list; }
	public void setList_l_h_AR_TRN_SALES_AMOUNT(List list) { l_l_h_AR_TRN_SALES_AMOUNT = list; }
	public void setList_AR_STATUS(List list) { l_AR_STATUS = list; }
	public void setList_AR_TRN_STATUS(List list) { l_AR_TRN_STATUS = list; }
	public void setList_SLIP_CTRL_GRP(List list) { l_SLIP_CTRL_GRP = list; }
	public void setList_OPTION_ID(List list) { l_OPTION_ID = list; }
	public void setList_CODE(List list) { l_CODE = list; }
	public void setList_CREATED_BY(List list) { l_CREATED_BY = list; }
	public void setList_CREATED_PRG_NM(List list) { l_CREATED_PRG_NM = list; }
	public void setList_slipSHIP_ODR_AMOUNT(List list) { l_slipSHIP_ODR_AMOUNT = list; }
	public void setList_slipTAX_AMOUNT(List list) { l_slipTAX_AMOUNT = list; }
	public void setList_slipSHIP_ODR_AMOUNT_TAX(List list) { l_slipSHIP_ODR_AMOUNT_TAX = list; }
	public void setList_slipEXTERNAL_TAX_SALES_AMOUNT(List list) { l_slipEXTERNAL_TAX_SALES_AMOUNT = list; }
	public void setList_slipINTERNAL_TAX_SALES_AMOUNT(List list) { l_slipINTERNAL_TAX_SALES_AMOUNT = list; }
	public void setList_slipTAXFREE_SALES_AMOUNT(List list) { l_slipTAXFREE_SALES_AMOUNT = list; }
	public void setList_slipTAX_CREDIT_SALES_AMOUNT(List list) { l_slipTAX_CREDIT_SALES_AMOUNT = list; }
	public void setList_slipEXTERNAL_TAX_AMOUNT(List list) { l_slipEXTERNAL_TAX_AMOUNT = list; }
	public void setList_slipINTERNAL_TAX_AMOUNT(List list) { l_slipINTERNAL_TAX_AMOUNT = list; }
	public void setList_slipTAX_AMOUNT_1(List list) { l_slipTAX_AMOUNT_1 = list; }
	public void setList_slipTAX_AMOUNT_2(List list) { l_slipTAX_AMOUNT_2 = list; }
	public void setList_slipTAX_AMOUNT_3(List list) { l_slipTAX_AMOUNT_3 = list; }
	public void setList_slipOWN_CUR_TAXCREDIT_SALES_AMOUNT(List list) { l_slipOWN_CUR_TAXCREDIT_SALES_AMOUNT = list; }
	public void setList_selectSHIP_ODR_NO(List list) { l_selectSHIP_ODR_NO = list; }
	public void setList_selectSLIP_CD(List list) { l_selectSLIP_CD = list; }
	public void setList_selectSALES_TYP(List list) { l_selectSALES_TYP = list; }
	public void setList_selectCUST_CD(List list) { l_selectCUST_CD = list; }
	public void setList_selectITEM_CD(List list) { l_selectITEM_CD = list; }
	public void setList_selectITEM_NAME(List list) { l_selectITEM_NAME = list; }
	public void setList_selectCUST_ODR_NO(List list) { l_selectCUST_ODR_NO = list; }
	public void setList_selectSALES_DATE(List list) { l_selectSALES_DATE = list; }
	public void setList_selectSALES_DEPT_CD(List list) { l_selectSALES_DEPT_CD = list; }
	public void setList_selectVEND_CD(List list) { l_selectVEND_CD = list; }
	public void setList_selectPRD_ODR_PLACE_CD(List list) { l_selectPRD_ODR_PLACE_CD = list; }
	public void setList_selectCUST_CHRG_PSN_CD(List list) { l_selectCUST_CHRG_PSN_CD = list; }
	public void setList_selectODR_ACPT_PSN_CD(List list) { l_selectODR_ACPT_PSN_CD = list; }
	public void setList_selectSALES_QTY(List list) { l_selectSALES_QTY = list; }
	public void setList_selectSALES_UNIT_PRICE(List list) { l_selectSALES_UNIT_PRICE = list; }
	public void setList_selectUNIT_CD(List list) { l_selectUNIT_CD = list; }
	public void setList_selectSALES_AMOUNT(List list) { l_selectSALES_AMOUNT = list; }
	public void setList_selectSALES_AMOUNT_EXCH_RATES(List list) { l_selectSALES_AMOUNT_EXCH_RATES = list; }
	public void setList_selectINSPC_ACPT_DATE(List list) { l_selectINSPC_ACPT_DATE = list; }
	public void setList_selectINSPC_ACPT_QTY(List list) { l_selectINSPC_ACPT_QTY = list; }
	public void setList_selectEXTERNAL_TAX_SALES_AMOUNT(List list) { l_selectEXTERNAL_TAX_SALES_AMOUNT = list; }
	public void setList_selectINTERNAL_TAX_SALES_AMOUNT(List list) { l_selectINTERNAL_TAX_SALES_AMOUNT = list; }
	public void setList_selectTAXFREE_SALES_AMOUNT(List list) { l_selectTAXFREE_SALES_AMOUNT = list; }
	public void setList_selectTAX_CREDIT_SALES_AMOUNT(List list) { l_selectTAX_CREDIT_SALES_AMOUNT = list; }
	public void setList_selectEXTERNAL_TAX_AMOUNT(List list) { l_selectEXTERNAL_TAX_AMOUNT = list; }
	public void setList_selectINTERNAL_TAX_AMOUNT(List list) { l_selectINTERNAL_TAX_AMOUNT = list; }
	public void setList_selectTAX_AMOUNT_1(List list) { l_selectTAX_AMOUNT_1 = list; }
	public void setList_selectTAX_AMOUNT_2(List list) { l_selectTAX_AMOUNT_2 = list; }
	public void setList_selectTAX_AMOUNT_3(List list) { l_selectTAX_AMOUNT_3 = list; }
	public void setList_selectOWN_CUR_TAXCREDIT_SALES_AMOUNT(List list) { l_selectOWN_CUR_TAXCREDIT_SALES_AMOUNT = list; }
	public void setList_selectORG_SLIP_CD(List list) { l_selectORG_SLIP_CD = list; }
	public void setList_selectCURRNCY_CD(List list) { l_selectCURRNCY_CD = list; }
	public void setList_selectSPCL_PRICE_CO(List list) { l_selectSPCL_PRICE_CO = list; }
	public void setList_selectREMARKS(List list) { l_selectREMARKS = list; }
	public void setList_selectINSPC_ACPT_TYP(List list) { l_selectINSPC_ACPT_TYP = list; }
	public void setList_selectSTATUS(List list) { l_selectSTATUS = list; }
	public void setList_l_h_SALES_SEQ_NO(List list) { l_l_h_SALES_SEQ_NO = list; }
	public void setList_salesEXTERNAL_TAX_SALES_AMOUNT(List list) { l_salesEXTERNAL_TAX_SALES_AMOUNT = list; }
	public void setList_salesINTERNAL_TAX_SALES_AMOUNT(List list) { l_salesINTERNAL_TAX_SALES_AMOUNT = list; }
	public void setList_salesTAXFREE_SALES_AMOUNT(List list) { l_salesTAXFREE_SALES_AMOUNT = list; }
	public void setList_salesTAX_CREDIT_SALES_AMOUNT(List list) { l_salesTAX_CREDIT_SALES_AMOUNT = list; }
	public void setList_salesEXTERNAL_TAX_AMOUNT(List list) { l_salesEXTERNAL_TAX_AMOUNT = list; }
	public void setList_salesINTERNAL_TAX_AMOUNT(List list) { l_salesINTERNAL_TAX_AMOUNT = list; }
	public void setList_salesTAX_AMOUNT_1(List list) { l_salesTAX_AMOUNT_1 = list; }
	public void setList_salesTAX_AMOUNT_2(List list) { l_salesTAX_AMOUNT_2 = list; }
	public void setList_salesTAX_AMOUNT_3(List list) { l_salesTAX_AMOUNT_3 = list; }
	public void setList_salesOWN_CUR_TAXCREDIT_SALES_AMOUNT(List list) { l_salesOWN_CUR_TAXCREDIT_SALES_AMOUNT = list; }
	public void setList_SLIP_CD(List list) { l_SLIP_CD = list; }
	public void setList_COUNT(List list) { l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }
	public void setList_insertSLIP_CD(List list) { l_insertSLIP_CD = list; }
	public void setList_l_h_SHIP_ODR_NO(List list) { l_l_h_SHIP_ODR_NO = list; }
	public void setList_ORGNAL_SLIP_CD(List list) { l_ORGNAL_SLIP_CD = list; }
	public void setList_l_h_SHIP_SEQ_NO(List list) { l_l_h_SHIP_SEQ_NO = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_TAX_CD_1(List list) { l_TAX_CD_1 = list; }
	public void setList_TAX_CD_2(List list) { l_TAX_CD_2 = list; }
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
	public void setList_SLIP_DATE(List list) { l_SLIP_DATE = list; }
	public void setList_SUM_EXTERNAL_TAX_SALES_AMOUNT(List list) { l_SUM_EXTERNAL_TAX_SALES_AMOUNT = list; }
	public void setList_SUM_INTERNAL_TAX_SALES_AMOUNT(List list) { l_SUM_INTERNAL_TAX_SALES_AMOUNT = list; }
	public void setList_SUM_TAXFREE_SALES_AMOUNT(List list) { l_SUM_TAXFREE_SALES_AMOUNT = list; }
	public void setList_SUM_TAX_CREDIT_SALES_AMOUNT(List list) { l_SUM_TAX_CREDIT_SALES_AMOUNT = list; }
	public void setList_SUM_EXTERNAL_TAX_AMOUNT(List list) { l_SUM_EXTERNAL_TAX_AMOUNT = list; }
	public void setList_SUM_INTERNAL_TAX_AMOUNT(List list) { l_SUM_INTERNAL_TAX_AMOUNT = list; }
	public void setList_SUM_TAX_AMOUNT_1(List list) { l_SUM_TAX_AMOUNT_1 = list; }
	public void setList_SUM_TAX_AMOUNT_2(List list) { l_SUM_TAX_AMOUNT_2 = list; }
	public void setList_SUM_TAX_AMOUNT_3(List list) { l_SUM_TAX_AMOUNT_3 = list; }
	public void setList_SUM_OWN_CUR_TAXCREDIT_SALES_AMOUNT(List list) { l_SUM_OWN_CUR_TAXCREDIT_SALES_AMOUNT = list; }
	public void setList_SEL_SLIP_CD(List list) { l_SEL_SLIP_CD = list; }
	public void setList_SEL_SHIP_CD(List list) { l_SEL_SHIP_CD = list; }

	public int setL2L_h_UPDATE_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_UPDATE_FLG == null) {
			l_h_UPDATE_FLG = new ArrayList();
		} else {
			l_h_UPDATE_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_UPDATE_FLG.add(((KQ0100010Struct) list.get(i)).geth_UPDATE_FLG());
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
			l_r_SEL_PTN1.add(((KQ0100010Struct) list.get(i)).getr_SEL_PTN1());
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
			l_r_SEL_PTN2.add(((KQ0100010Struct) list.get(i)).getr_SEL_PTN2());
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
			l_INSPC_ACPT_TYP.add(((KQ0100010Struct) list.get(i)).getINSPC_ACPT_TYP());
		}
		return size;
	}
	public int setL2L_SHIP_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SHIP_DLV_DATE == null) {
			l_SHIP_DLV_DATE = new ArrayList();
		} else {
			l_SHIP_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SHIP_DLV_DATE.add(((KQ0100010Struct) list.get(i)).getSHIP_DLV_DATE());
		}
		return size;
	}
	public int setL2L_l_STATUS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_STATUS == null) {
			l_l_STATUS = new ArrayList();
		} else {
			l_l_STATUS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_STATUS.add(((KQ0100010Struct) list.get(i)).getl_STATUS());
		}
		return size;
	}
	public int setL2L_l_h_STATUS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_h_STATUS_CD == null) {
			l_l_h_STATUS_CD = new ArrayList();
		} else {
			l_l_h_STATUS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_h_STATUS_CD.add(((KQ0100010Struct) list.get(i)).getl_h_STATUS_CD());
		}
		return size;
	}
	public int setL2L_l_ODR_SCDL_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ODR_SCDL_DLV_DATE == null) {
			l_l_ODR_SCDL_DLV_DATE = new ArrayList();
		} else {
			l_l_ODR_SCDL_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ODR_SCDL_DLV_DATE.add(((KQ0100010Struct) list.get(i)).getl_ODR_SCDL_DLV_DATE());
		}
		return size;
	}
	public int setL2L_l_SHIP_SCDL_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SHIP_SCDL_DLV_DATE == null) {
			l_l_SHIP_SCDL_DLV_DATE = new ArrayList();
		} else {
			l_l_SHIP_SCDL_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SHIP_SCDL_DLV_DATE.add(((KQ0100010Struct) list.get(i)).getl_SHIP_SCDL_DLV_DATE());
		}
		return size;
	}
	public int setL2L_h_TAX_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_TAX_CD == null) {
			l_h_TAX_CD = new ArrayList();
		} else {
			l_h_TAX_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_TAX_CD.add(((KQ0100010Struct) list.get(i)).geth_TAX_CD());
		}
		return size;
	}
	public int setL2L_l_h_SHIP_ODR_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_h_SHIP_ODR_AMOUNT == null) {
			l_l_h_SHIP_ODR_AMOUNT = new ArrayList();
		} else {
			l_l_h_SHIP_ODR_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_h_SHIP_ODR_AMOUNT.add(((KQ0100010Struct) list.get(i)).getl_h_SHIP_ODR_AMOUNT());
		}
		return size;
	}
	public int setL2L_l_h_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_h_SALES_AMOUNT == null) {
			l_l_h_SALES_AMOUNT = new ArrayList();
		} else {
			l_l_h_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_h_SALES_AMOUNT.add(((KQ0100010Struct) list.get(i)).getl_h_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_l_h_AI_AR_IF_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_h_AI_AR_IF_FLG == null) {
			l_l_h_AI_AR_IF_FLG = new ArrayList();
		} else {
			l_l_h_AI_AR_IF_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_h_AI_AR_IF_FLG.add(((KQ0100010Struct) list.get(i)).getl_h_AI_AR_IF_FLG());
		}
		return size;
	}
	public int setL2L_l_h_TAX_DESINATED_SHIP_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_h_TAX_DESINATED_SHIP_DATE == null) {
			l_l_h_TAX_DESINATED_SHIP_DATE = new ArrayList();
		} else {
			l_l_h_TAX_DESINATED_SHIP_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_h_TAX_DESINATED_SHIP_DATE.add(((KQ0100010Struct) list.get(i)).getl_h_TAX_DESINATED_SHIP_DATE());
		}
		return size;
	}
	public int setL2L_l_h_SALES_SLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_h_SALES_SLIP_CD == null) {
			l_l_h_SALES_SLIP_CD = new ArrayList();
		} else {
			l_l_h_SALES_SLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_h_SALES_SLIP_CD.add(((KQ0100010Struct) list.get(i)).getl_h_SALES_SLIP_CD());
		}
		return size;
	}
	public int setL2L_l_h_UPDATE_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_h_UPDATE_FLG == null) {
			l_l_h_UPDATE_FLG = new ArrayList();
		} else {
			l_l_h_UPDATE_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_h_UPDATE_FLG.add(((KQ0100010Struct) list.get(i)).getl_h_UPDATE_FLG());
		}
		return size;
	}
	public int setL2L_h_SLIP_CTRL_GRP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_SLIP_CTRL_GRP == null) {
			l_h_SLIP_CTRL_GRP = new ArrayList();
		} else {
			l_h_SLIP_CTRL_GRP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_SLIP_CTRL_GRP.add(((KQ0100010Struct) list.get(i)).geth_SLIP_CTRL_GRP());
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
			l_h_ODR_NO.add(((KQ0100010Struct) list.get(i)).geth_ODR_NO());
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
			l_CUST_ODR_NO.add(((KQ0100010Struct) list.get(i)).getCUST_ODR_NO());
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
			l_ITEM_CD.add(((KQ0100010Struct) list.get(i)).getITEM_CD());
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
			l_ITEM_NAME.add(((KQ0100010Struct) list.get(i)).getITEM_NAME());
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
			l_CUST_CD.add(((KQ0100010Struct) list.get(i)).getCUST_CD());
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
			l_CUST_NAME.add(((KQ0100010Struct) list.get(i)).getCUST_NAME());
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
			l_CUST_ITEM_CD.add(((KQ0100010Struct) list.get(i)).getCUST_ITEM_CD());
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
			l_CUST_ITEM_NAME.add(((KQ0100010Struct) list.get(i)).getCUST_ITEM_NAME());
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
			l_ODR_ACPT_DATE.add(((KQ0100010Struct) list.get(i)).getODR_ACPT_DATE());
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
			l_DESINATED_DLV_DATE.add(((KQ0100010Struct) list.get(i)).getDESINATED_DLV_DATE());
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
			l_ODR_UNIT_PRICE.add(((KQ0100010Struct) list.get(i)).getODR_UNIT_PRICE());
		}
		return size;
	}
	public int setL2L_ODR_UNIT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_UNIT_CD == null) {
			l_ODR_UNIT_CD = new ArrayList();
		} else {
			l_ODR_UNIT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_UNIT_CD.add(((KQ0100010Struct) list.get(i)).getODR_UNIT_CD());
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
			l_ODR_QTY.add(((KQ0100010Struct) list.get(i)).getODR_QTY());
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
			l_TAX_CD.add(((KQ0100010Struct) list.get(i)).getTAX_CD());
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
			l_ODR_AMOUNT.add(((KQ0100010Struct) list.get(i)).getODR_AMOUNT());
		}
		return size;
	}
	public int setL2L_ODR_AMOUNT_UNIT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_AMOUNT_UNIT_CD == null) {
			l_ODR_AMOUNT_UNIT_CD = new ArrayList();
		} else {
			l_ODR_AMOUNT_UNIT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_AMOUNT_UNIT_CD.add(((KQ0100010Struct) list.get(i)).getODR_AMOUNT_UNIT_CD());
		}
		return size;
	}
	public int setL2L_h_INSPC_ACPT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_INSPC_ACPT_TYP == null) {
			l_h_INSPC_ACPT_TYP = new ArrayList();
		} else {
			l_h_INSPC_ACPT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_INSPC_ACPT_TYP.add(((KQ0100010Struct) list.get(i)).geth_INSPC_ACPT_TYP());
		}
		return size;
	}
	public int setL2L_h_CURRNCY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_CURRNCY_CD == null) {
			l_h_CURRNCY_CD = new ArrayList();
		} else {
			l_h_CURRNCY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_CURRNCY_CD.add(((KQ0100010Struct) list.get(i)).geth_CURRNCY_CD());
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
			l_h_EXCH_TYP.add(((KQ0100010Struct) list.get(i)).geth_EXCH_TYP());
		}
		return size;
	}
	public int setL2L_h_PRICE_ROUND_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PRICE_ROUND_TYP == null) {
			l_h_PRICE_ROUND_TYP = new ArrayList();
		} else {
			l_h_PRICE_ROUND_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PRICE_ROUND_TYP.add(((KQ0100010Struct) list.get(i)).geth_PRICE_ROUND_TYP());
		}
		return size;
	}
	public int setL2L_h_TRANSPORT_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_TRANSPORT_LT == null) {
			l_h_TRANSPORT_LT = new ArrayList();
		} else {
			l_h_TRANSPORT_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_TRANSPORT_LT.add(((KQ0100010Struct) list.get(i)).geth_TRANSPORT_LT());
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
			l_PLANT_CD.add(((KQ0100010Struct) list.get(i)).getPLANT_CD());
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
			l_h_MODIFY_COUNT.add(((KQ0100010Struct) list.get(i)).geth_MODIFY_COUNT());
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
			l_COMPANY_CD.add(((KQ0100010Struct) list.get(i)).getCOMPANY_CD());
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
			l_ODR_NO.add(((KQ0100010Struct) list.get(i)).getODR_NO());
		}
		return size;
	}
	public int setL2L_l_ODR_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ODR_ODR_NO == null) {
			l_l_ODR_ODR_NO = new ArrayList();
		} else {
			l_l_ODR_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ODR_ODR_NO.add(((KQ0100010Struct) list.get(i)).getl_ODR_ODR_NO());
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
			l_l_JOB_ODR_CD.add(((KQ0100010Struct) list.get(i)).getl_JOB_ODR_CD());
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
			l_l_PART_DLV_SEQ_NO.add(((KQ0100010Struct) list.get(i)).getl_PART_DLV_SEQ_NO());
		}
		return size;
	}
	public int setL2L_l_DLV_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DLV_ODR_NO == null) {
			l_l_DLV_ODR_NO = new ArrayList();
		} else {
			l_l_DLV_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DLV_ODR_NO.add(((KQ0100010Struct) list.get(i)).getl_DLV_ODR_NO());
		}
		return size;
	}
	public int setL2L_l_SHIP_ODR_SLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SHIP_ODR_SLIP_CD == null) {
			l_l_SHIP_ODR_SLIP_CD = new ArrayList();
		} else {
			l_l_SHIP_ODR_SLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SHIP_ODR_SLIP_CD.add(((KQ0100010Struct) list.get(i)).getl_SHIP_ODR_SLIP_CD());
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
			l_l_DESINATED_SHIP_DATE.add(((KQ0100010Struct) list.get(i)).getl_DESINATED_SHIP_DATE());
		}
		return size;
	}
	public int setL2L_l_SCDL_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SCDL_DLV_DATE == null) {
			l_l_SCDL_DLV_DATE = new ArrayList();
		} else {
			l_l_SCDL_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SCDL_DLV_DATE.add(((KQ0100010Struct) list.get(i)).getl_SCDL_DLV_DATE());
		}
		return size;
	}
	public int setL2L_l_SHIP_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SHIP_ODR_NO == null) {
			l_l_SHIP_ODR_NO = new ArrayList();
		} else {
			l_l_SHIP_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SHIP_ODR_NO.add(((KQ0100010Struct) list.get(i)).getl_SHIP_ODR_NO());
		}
		return size;
	}
	public int setL2L_l_ODR_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ODR_AMOUNT == null) {
			l_l_ODR_AMOUNT = new ArrayList();
		} else {
			l_l_ODR_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ODR_AMOUNT.add(((KQ0100010Struct) list.get(i)).getl_ODR_AMOUNT());
		}
		return size;
	}
	public int setL2L_l_SHIP_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SHIP_DATE == null) {
			l_l_SHIP_DATE = new ArrayList();
		} else {
			l_l_SHIP_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SHIP_DATE.add(((KQ0100010Struct) list.get(i)).getl_SHIP_DATE());
		}
		return size;
	}
	public int setL2L_l_SHIP_ODR_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SHIP_ODR_AMOUNT == null) {
			l_l_SHIP_ODR_AMOUNT = new ArrayList();
		} else {
			l_l_SHIP_ODR_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SHIP_ODR_AMOUNT.add(((KQ0100010Struct) list.get(i)).getl_SHIP_ODR_AMOUNT());
		}
		return size;
	}
	public int setL2L_l_SHIP_SEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SHIP_SEQ_NO == null) {
			l_l_SHIP_SEQ_NO = new ArrayList();
		} else {
			l_l_SHIP_SEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SHIP_SEQ_NO.add(((KQ0100010Struct) list.get(i)).getl_SHIP_SEQ_NO());
		}
		return size;
	}
	public int setL2L_l_SALES_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SALES_DATE == null) {
			l_l_SALES_DATE = new ArrayList();
		} else {
			l_l_SALES_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SALES_DATE.add(((KQ0100010Struct) list.get(i)).getl_SALES_DATE());
		}
		return size;
	}
	public int setL2L_l_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SALES_AMOUNT == null) {
			l_l_SALES_AMOUNT = new ArrayList();
		} else {
			l_l_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SALES_AMOUNT.add(((KQ0100010Struct) list.get(i)).getl_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_l_AI_AR_IF_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_AI_AR_IF_FLG == null) {
			l_l_AI_AR_IF_FLG = new ArrayList();
		} else {
			l_l_AI_AR_IF_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_AI_AR_IF_FLG.add(((KQ0100010Struct) list.get(i)).getl_AI_AR_IF_FLG());
		}
		return size;
	}
	public int setL2L_l_SALES_SEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SALES_SEQ_NO == null) {
			l_l_SALES_SEQ_NO = new ArrayList();
		} else {
			l_l_SALES_SEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SALES_SEQ_NO.add(((KQ0100010Struct) list.get(i)).getl_SALES_SEQ_NO());
		}
		return size;
	}
	public int setL2L_l_SALES_SLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SALES_SLIP_CD == null) {
			l_l_SALES_SLIP_CD = new ArrayList();
		} else {
			l_l_SALES_SLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SALES_SLIP_CD.add(((KQ0100010Struct) list.get(i)).getl_SALES_SLIP_CD());
		}
		return size;
	}
	public int setL2L_l_SALES_STATUS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SALES_STATUS == null) {
			l_l_SALES_STATUS = new ArrayList();
		} else {
			l_l_SALES_STATUS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SALES_STATUS.add(((KQ0100010Struct) list.get(i)).getl_SALES_STATUS());
		}
		return size;
	}
	public int setL2L_l_AR_SLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_AR_SLIP_CD == null) {
			l_l_AR_SLIP_CD = new ArrayList();
		} else {
			l_l_AR_SLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_AR_SLIP_CD.add(((KQ0100010Struct) list.get(i)).getl_AR_SLIP_CD());
		}
		return size;
	}
	public int setL2L_l_AR_TRN_SLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_AR_TRN_SLIP_CD == null) {
			l_l_AR_TRN_SLIP_CD = new ArrayList();
		} else {
			l_l_AR_TRN_SLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_AR_TRN_SLIP_CD.add(((KQ0100010Struct) list.get(i)).getl_AR_TRN_SLIP_CD());
		}
		return size;
	}
	public int setL2L_l_h_INSPC_ACPT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_h_INSPC_ACPT_DATE == null) {
			l_l_h_INSPC_ACPT_DATE = new ArrayList();
		} else {
			l_l_h_INSPC_ACPT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_h_INSPC_ACPT_DATE.add(((KQ0100010Struct) list.get(i)).getl_h_INSPC_ACPT_DATE());
		}
		return size;
	}
	public int setL2L_l_h_AR_INSPC_ACPT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_h_AR_INSPC_ACPT_DATE == null) {
			l_l_h_AR_INSPC_ACPT_DATE = new ArrayList();
		} else {
			l_l_h_AR_INSPC_ACPT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_h_AR_INSPC_ACPT_DATE.add(((KQ0100010Struct) list.get(i)).getl_h_AR_INSPC_ACPT_DATE());
		}
		return size;
	}
	public int setL2L_l_h_AR_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_h_AR_SALES_AMOUNT == null) {
			l_l_h_AR_SALES_AMOUNT = new ArrayList();
		} else {
			l_l_h_AR_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_h_AR_SALES_AMOUNT.add(((KQ0100010Struct) list.get(i)).getl_h_AR_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_l_h_AR_TRN_INSPC_ACPT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_h_AR_TRN_INSPC_ACPT_DATE == null) {
			l_l_h_AR_TRN_INSPC_ACPT_DATE = new ArrayList();
		} else {
			l_l_h_AR_TRN_INSPC_ACPT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_h_AR_TRN_INSPC_ACPT_DATE.add(((KQ0100010Struct) list.get(i)).getl_h_AR_TRN_INSPC_ACPT_DATE());
		}
		return size;
	}
	public int setL2L_l_h_AR_TRN_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_h_AR_TRN_SALES_AMOUNT == null) {
			l_l_h_AR_TRN_SALES_AMOUNT = new ArrayList();
		} else {
			l_l_h_AR_TRN_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_h_AR_TRN_SALES_AMOUNT.add(((KQ0100010Struct) list.get(i)).getl_h_AR_TRN_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_AR_STATUS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_AR_STATUS == null) {
			l_AR_STATUS = new ArrayList();
		} else {
			l_AR_STATUS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_AR_STATUS.add(((KQ0100010Struct) list.get(i)).getAR_STATUS());
		}
		return size;
	}
	public int setL2L_AR_TRN_STATUS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_AR_TRN_STATUS == null) {
			l_AR_TRN_STATUS = new ArrayList();
		} else {
			l_AR_TRN_STATUS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_AR_TRN_STATUS.add(((KQ0100010Struct) list.get(i)).getAR_TRN_STATUS());
		}
		return size;
	}
	public int setL2L_SLIP_CTRL_GRP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SLIP_CTRL_GRP == null) {
			l_SLIP_CTRL_GRP = new ArrayList();
		} else {
			l_SLIP_CTRL_GRP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SLIP_CTRL_GRP.add(((KQ0100010Struct) list.get(i)).getSLIP_CTRL_GRP());
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
			l_OPTION_ID.add(((KQ0100010Struct) list.get(i)).getOPTION_ID());
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
			l_CODE.add(((KQ0100010Struct) list.get(i)).getCODE());
		}
		return size;
	}
	public int setL2L_CREATED_BY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CREATED_BY == null) {
			l_CREATED_BY = new ArrayList();
		} else {
			l_CREATED_BY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CREATED_BY.add(((KQ0100010Struct) list.get(i)).getCREATED_BY());
		}
		return size;
	}
	public int setL2L_CREATED_PRG_NM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CREATED_PRG_NM == null) {
			l_CREATED_PRG_NM = new ArrayList();
		} else {
			l_CREATED_PRG_NM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CREATED_PRG_NM.add(((KQ0100010Struct) list.get(i)).getCREATED_PRG_NM());
		}
		return size;
	}
	public int setL2L_slipSHIP_ODR_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_slipSHIP_ODR_AMOUNT == null) {
			l_slipSHIP_ODR_AMOUNT = new ArrayList();
		} else {
			l_slipSHIP_ODR_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_slipSHIP_ODR_AMOUNT.add(((KQ0100010Struct) list.get(i)).getslipSHIP_ODR_AMOUNT());
		}
		return size;
	}
	public int setL2L_slipTAX_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_slipTAX_AMOUNT == null) {
			l_slipTAX_AMOUNT = new ArrayList();
		} else {
			l_slipTAX_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_slipTAX_AMOUNT.add(((KQ0100010Struct) list.get(i)).getslipTAX_AMOUNT());
		}
		return size;
	}
	public int setL2L_slipSHIP_ODR_AMOUNT_TAX(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_slipSHIP_ODR_AMOUNT_TAX == null) {
			l_slipSHIP_ODR_AMOUNT_TAX = new ArrayList();
		} else {
			l_slipSHIP_ODR_AMOUNT_TAX.clear();
		}
		for (int i = 0; i < size; i++) {
			l_slipSHIP_ODR_AMOUNT_TAX.add(((KQ0100010Struct) list.get(i)).getslipSHIP_ODR_AMOUNT_TAX());
		}
		return size;
	}
	public int setL2L_slipEXTERNAL_TAX_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_slipEXTERNAL_TAX_SALES_AMOUNT == null) {
			l_slipEXTERNAL_TAX_SALES_AMOUNT = new ArrayList();
		} else {
			l_slipEXTERNAL_TAX_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_slipEXTERNAL_TAX_SALES_AMOUNT.add(((KQ0100010Struct) list.get(i)).getslipEXTERNAL_TAX_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_slipINTERNAL_TAX_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_slipINTERNAL_TAX_SALES_AMOUNT == null) {
			l_slipINTERNAL_TAX_SALES_AMOUNT = new ArrayList();
		} else {
			l_slipINTERNAL_TAX_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_slipINTERNAL_TAX_SALES_AMOUNT.add(((KQ0100010Struct) list.get(i)).getslipINTERNAL_TAX_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_slipTAXFREE_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_slipTAXFREE_SALES_AMOUNT == null) {
			l_slipTAXFREE_SALES_AMOUNT = new ArrayList();
		} else {
			l_slipTAXFREE_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_slipTAXFREE_SALES_AMOUNT.add(((KQ0100010Struct) list.get(i)).getslipTAXFREE_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_slipTAX_CREDIT_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_slipTAX_CREDIT_SALES_AMOUNT == null) {
			l_slipTAX_CREDIT_SALES_AMOUNT = new ArrayList();
		} else {
			l_slipTAX_CREDIT_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_slipTAX_CREDIT_SALES_AMOUNT.add(((KQ0100010Struct) list.get(i)).getslipTAX_CREDIT_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_slipEXTERNAL_TAX_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_slipEXTERNAL_TAX_AMOUNT == null) {
			l_slipEXTERNAL_TAX_AMOUNT = new ArrayList();
		} else {
			l_slipEXTERNAL_TAX_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_slipEXTERNAL_TAX_AMOUNT.add(((KQ0100010Struct) list.get(i)).getslipEXTERNAL_TAX_AMOUNT());
		}
		return size;
	}
	public int setL2L_slipINTERNAL_TAX_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_slipINTERNAL_TAX_AMOUNT == null) {
			l_slipINTERNAL_TAX_AMOUNT = new ArrayList();
		} else {
			l_slipINTERNAL_TAX_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_slipINTERNAL_TAX_AMOUNT.add(((KQ0100010Struct) list.get(i)).getslipINTERNAL_TAX_AMOUNT());
		}
		return size;
	}
	public int setL2L_slipTAX_AMOUNT_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_slipTAX_AMOUNT_1 == null) {
			l_slipTAX_AMOUNT_1 = new ArrayList();
		} else {
			l_slipTAX_AMOUNT_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_slipTAX_AMOUNT_1.add(((KQ0100010Struct) list.get(i)).getslipTAX_AMOUNT_1());
		}
		return size;
	}
	public int setL2L_slipTAX_AMOUNT_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_slipTAX_AMOUNT_2 == null) {
			l_slipTAX_AMOUNT_2 = new ArrayList();
		} else {
			l_slipTAX_AMOUNT_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_slipTAX_AMOUNT_2.add(((KQ0100010Struct) list.get(i)).getslipTAX_AMOUNT_2());
		}
		return size;
	}
	public int setL2L_slipTAX_AMOUNT_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_slipTAX_AMOUNT_3 == null) {
			l_slipTAX_AMOUNT_3 = new ArrayList();
		} else {
			l_slipTAX_AMOUNT_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_slipTAX_AMOUNT_3.add(((KQ0100010Struct) list.get(i)).getslipTAX_AMOUNT_3());
		}
		return size;
	}
	public int setL2L_slipOWN_CUR_TAXCREDIT_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_slipOWN_CUR_TAXCREDIT_SALES_AMOUNT == null) {
			l_slipOWN_CUR_TAXCREDIT_SALES_AMOUNT = new ArrayList();
		} else {
			l_slipOWN_CUR_TAXCREDIT_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_slipOWN_CUR_TAXCREDIT_SALES_AMOUNT.add(((KQ0100010Struct) list.get(i)).getslipOWN_CUR_TAXCREDIT_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_selectSHIP_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_selectSHIP_ODR_NO == null) {
			l_selectSHIP_ODR_NO = new ArrayList();
		} else {
			l_selectSHIP_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_selectSHIP_ODR_NO.add(((KQ0100010Struct) list.get(i)).getselectSHIP_ODR_NO());
		}
		return size;
	}
	public int setL2L_selectSLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_selectSLIP_CD == null) {
			l_selectSLIP_CD = new ArrayList();
		} else {
			l_selectSLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_selectSLIP_CD.add(((KQ0100010Struct) list.get(i)).getselectSLIP_CD());
		}
		return size;
	}
	public int setL2L_selectSALES_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_selectSALES_TYP == null) {
			l_selectSALES_TYP = new ArrayList();
		} else {
			l_selectSALES_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_selectSALES_TYP.add(((KQ0100010Struct) list.get(i)).getselectSALES_TYP());
		}
		return size;
	}
	public int setL2L_selectCUST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_selectCUST_CD == null) {
			l_selectCUST_CD = new ArrayList();
		} else {
			l_selectCUST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_selectCUST_CD.add(((KQ0100010Struct) list.get(i)).getselectCUST_CD());
		}
		return size;
	}
	public int setL2L_selectITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_selectITEM_CD == null) {
			l_selectITEM_CD = new ArrayList();
		} else {
			l_selectITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_selectITEM_CD.add(((KQ0100010Struct) list.get(i)).getselectITEM_CD());
		}
		return size;
	}
	public int setL2L_selectITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_selectITEM_NAME == null) {
			l_selectITEM_NAME = new ArrayList();
		} else {
			l_selectITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_selectITEM_NAME.add(((KQ0100010Struct) list.get(i)).getselectITEM_NAME());
		}
		return size;
	}
	public int setL2L_selectCUST_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_selectCUST_ODR_NO == null) {
			l_selectCUST_ODR_NO = new ArrayList();
		} else {
			l_selectCUST_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_selectCUST_ODR_NO.add(((KQ0100010Struct) list.get(i)).getselectCUST_ODR_NO());
		}
		return size;
	}
	public int setL2L_selectSALES_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_selectSALES_DATE == null) {
			l_selectSALES_DATE = new ArrayList();
		} else {
			l_selectSALES_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_selectSALES_DATE.add(((KQ0100010Struct) list.get(i)).getselectSALES_DATE());
		}
		return size;
	}
	public int setL2L_selectSALES_DEPT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_selectSALES_DEPT_CD == null) {
			l_selectSALES_DEPT_CD = new ArrayList();
		} else {
			l_selectSALES_DEPT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_selectSALES_DEPT_CD.add(((KQ0100010Struct) list.get(i)).getselectSALES_DEPT_CD());
		}
		return size;
	}
	public int setL2L_selectVEND_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_selectVEND_CD == null) {
			l_selectVEND_CD = new ArrayList();
		} else {
			l_selectVEND_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_selectVEND_CD.add(((KQ0100010Struct) list.get(i)).getselectVEND_CD());
		}
		return size;
	}
	public int setL2L_selectPRD_ODR_PLACE_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_selectPRD_ODR_PLACE_CD == null) {
			l_selectPRD_ODR_PLACE_CD = new ArrayList();
		} else {
			l_selectPRD_ODR_PLACE_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_selectPRD_ODR_PLACE_CD.add(((KQ0100010Struct) list.get(i)).getselectPRD_ODR_PLACE_CD());
		}
		return size;
	}
	public int setL2L_selectCUST_CHRG_PSN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_selectCUST_CHRG_PSN_CD == null) {
			l_selectCUST_CHRG_PSN_CD = new ArrayList();
		} else {
			l_selectCUST_CHRG_PSN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_selectCUST_CHRG_PSN_CD.add(((KQ0100010Struct) list.get(i)).getselectCUST_CHRG_PSN_CD());
		}
		return size;
	}
	public int setL2L_selectODR_ACPT_PSN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_selectODR_ACPT_PSN_CD == null) {
			l_selectODR_ACPT_PSN_CD = new ArrayList();
		} else {
			l_selectODR_ACPT_PSN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_selectODR_ACPT_PSN_CD.add(((KQ0100010Struct) list.get(i)).getselectODR_ACPT_PSN_CD());
		}
		return size;
	}
	public int setL2L_selectSALES_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_selectSALES_QTY == null) {
			l_selectSALES_QTY = new ArrayList();
		} else {
			l_selectSALES_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_selectSALES_QTY.add(((KQ0100010Struct) list.get(i)).getselectSALES_QTY());
		}
		return size;
	}
	public int setL2L_selectSALES_UNIT_PRICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_selectSALES_UNIT_PRICE == null) {
			l_selectSALES_UNIT_PRICE = new ArrayList();
		} else {
			l_selectSALES_UNIT_PRICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_selectSALES_UNIT_PRICE.add(((KQ0100010Struct) list.get(i)).getselectSALES_UNIT_PRICE());
		}
		return size;
	}
	public int setL2L_selectUNIT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_selectUNIT_CD == null) {
			l_selectUNIT_CD = new ArrayList();
		} else {
			l_selectUNIT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_selectUNIT_CD.add(((KQ0100010Struct) list.get(i)).getselectUNIT_CD());
		}
		return size;
	}
	public int setL2L_selectSALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_selectSALES_AMOUNT == null) {
			l_selectSALES_AMOUNT = new ArrayList();
		} else {
			l_selectSALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_selectSALES_AMOUNT.add(((KQ0100010Struct) list.get(i)).getselectSALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_selectSALES_AMOUNT_EXCH_RATES(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_selectSALES_AMOUNT_EXCH_RATES == null) {
			l_selectSALES_AMOUNT_EXCH_RATES = new ArrayList();
		} else {
			l_selectSALES_AMOUNT_EXCH_RATES.clear();
		}
		for (int i = 0; i < size; i++) {
			l_selectSALES_AMOUNT_EXCH_RATES.add(((KQ0100010Struct) list.get(i)).getselectSALES_AMOUNT_EXCH_RATES());
		}
		return size;
	}
	public int setL2L_selectINSPC_ACPT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_selectINSPC_ACPT_DATE == null) {
			l_selectINSPC_ACPT_DATE = new ArrayList();
		} else {
			l_selectINSPC_ACPT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_selectINSPC_ACPT_DATE.add(((KQ0100010Struct) list.get(i)).getselectINSPC_ACPT_DATE());
		}
		return size;
	}
	public int setL2L_selectINSPC_ACPT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_selectINSPC_ACPT_QTY == null) {
			l_selectINSPC_ACPT_QTY = new ArrayList();
		} else {
			l_selectINSPC_ACPT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_selectINSPC_ACPT_QTY.add(((KQ0100010Struct) list.get(i)).getselectINSPC_ACPT_QTY());
		}
		return size;
	}
	public int setL2L_selectEXTERNAL_TAX_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_selectEXTERNAL_TAX_SALES_AMOUNT == null) {
			l_selectEXTERNAL_TAX_SALES_AMOUNT = new ArrayList();
		} else {
			l_selectEXTERNAL_TAX_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_selectEXTERNAL_TAX_SALES_AMOUNT.add(((KQ0100010Struct) list.get(i)).getselectEXTERNAL_TAX_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_selectINTERNAL_TAX_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_selectINTERNAL_TAX_SALES_AMOUNT == null) {
			l_selectINTERNAL_TAX_SALES_AMOUNT = new ArrayList();
		} else {
			l_selectINTERNAL_TAX_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_selectINTERNAL_TAX_SALES_AMOUNT.add(((KQ0100010Struct) list.get(i)).getselectINTERNAL_TAX_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_selectTAXFREE_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_selectTAXFREE_SALES_AMOUNT == null) {
			l_selectTAXFREE_SALES_AMOUNT = new ArrayList();
		} else {
			l_selectTAXFREE_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_selectTAXFREE_SALES_AMOUNT.add(((KQ0100010Struct) list.get(i)).getselectTAXFREE_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_selectTAX_CREDIT_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_selectTAX_CREDIT_SALES_AMOUNT == null) {
			l_selectTAX_CREDIT_SALES_AMOUNT = new ArrayList();
		} else {
			l_selectTAX_CREDIT_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_selectTAX_CREDIT_SALES_AMOUNT.add(((KQ0100010Struct) list.get(i)).getselectTAX_CREDIT_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_selectEXTERNAL_TAX_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_selectEXTERNAL_TAX_AMOUNT == null) {
			l_selectEXTERNAL_TAX_AMOUNT = new ArrayList();
		} else {
			l_selectEXTERNAL_TAX_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_selectEXTERNAL_TAX_AMOUNT.add(((KQ0100010Struct) list.get(i)).getselectEXTERNAL_TAX_AMOUNT());
		}
		return size;
	}
	public int setL2L_selectINTERNAL_TAX_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_selectINTERNAL_TAX_AMOUNT == null) {
			l_selectINTERNAL_TAX_AMOUNT = new ArrayList();
		} else {
			l_selectINTERNAL_TAX_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_selectINTERNAL_TAX_AMOUNT.add(((KQ0100010Struct) list.get(i)).getselectINTERNAL_TAX_AMOUNT());
		}
		return size;
	}
	public int setL2L_selectTAX_AMOUNT_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_selectTAX_AMOUNT_1 == null) {
			l_selectTAX_AMOUNT_1 = new ArrayList();
		} else {
			l_selectTAX_AMOUNT_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_selectTAX_AMOUNT_1.add(((KQ0100010Struct) list.get(i)).getselectTAX_AMOUNT_1());
		}
		return size;
	}
	public int setL2L_selectTAX_AMOUNT_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_selectTAX_AMOUNT_2 == null) {
			l_selectTAX_AMOUNT_2 = new ArrayList();
		} else {
			l_selectTAX_AMOUNT_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_selectTAX_AMOUNT_2.add(((KQ0100010Struct) list.get(i)).getselectTAX_AMOUNT_2());
		}
		return size;
	}
	public int setL2L_selectTAX_AMOUNT_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_selectTAX_AMOUNT_3 == null) {
			l_selectTAX_AMOUNT_3 = new ArrayList();
		} else {
			l_selectTAX_AMOUNT_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_selectTAX_AMOUNT_3.add(((KQ0100010Struct) list.get(i)).getselectTAX_AMOUNT_3());
		}
		return size;
	}
	public int setL2L_selectOWN_CUR_TAXCREDIT_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_selectOWN_CUR_TAXCREDIT_SALES_AMOUNT == null) {
			l_selectOWN_CUR_TAXCREDIT_SALES_AMOUNT = new ArrayList();
		} else {
			l_selectOWN_CUR_TAXCREDIT_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_selectOWN_CUR_TAXCREDIT_SALES_AMOUNT.add(((KQ0100010Struct) list.get(i)).getselectOWN_CUR_TAXCREDIT_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_selectORG_SLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_selectORG_SLIP_CD == null) {
			l_selectORG_SLIP_CD = new ArrayList();
		} else {
			l_selectORG_SLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_selectORG_SLIP_CD.add(((KQ0100010Struct) list.get(i)).getselectORG_SLIP_CD());
		}
		return size;
	}
	public int setL2L_selectCURRNCY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_selectCURRNCY_CD == null) {
			l_selectCURRNCY_CD = new ArrayList();
		} else {
			l_selectCURRNCY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_selectCURRNCY_CD.add(((KQ0100010Struct) list.get(i)).getselectCURRNCY_CD());
		}
		return size;
	}
	public int setL2L_selectSPCL_PRICE_CO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_selectSPCL_PRICE_CO == null) {
			l_selectSPCL_PRICE_CO = new ArrayList();
		} else {
			l_selectSPCL_PRICE_CO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_selectSPCL_PRICE_CO.add(((KQ0100010Struct) list.get(i)).getselectSPCL_PRICE_CO());
		}
		return size;
	}
	public int setL2L_selectREMARKS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_selectREMARKS == null) {
			l_selectREMARKS = new ArrayList();
		} else {
			l_selectREMARKS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_selectREMARKS.add(((KQ0100010Struct) list.get(i)).getselectREMARKS());
		}
		return size;
	}
	public int setL2L_selectINSPC_ACPT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_selectINSPC_ACPT_TYP == null) {
			l_selectINSPC_ACPT_TYP = new ArrayList();
		} else {
			l_selectINSPC_ACPT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_selectINSPC_ACPT_TYP.add(((KQ0100010Struct) list.get(i)).getselectINSPC_ACPT_TYP());
		}
		return size;
	}
	public int setL2L_selectSTATUS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_selectSTATUS == null) {
			l_selectSTATUS = new ArrayList();
		} else {
			l_selectSTATUS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_selectSTATUS.add(((KQ0100010Struct) list.get(i)).getselectSTATUS());
		}
		return size;
	}
	public int setL2L_l_h_SALES_SEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_h_SALES_SEQ_NO == null) {
			l_l_h_SALES_SEQ_NO = new ArrayList();
		} else {
			l_l_h_SALES_SEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_h_SALES_SEQ_NO.add(((KQ0100010Struct) list.get(i)).getl_h_SALES_SEQ_NO());
		}
		return size;
	}
	public int setL2L_salesEXTERNAL_TAX_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_salesEXTERNAL_TAX_SALES_AMOUNT == null) {
			l_salesEXTERNAL_TAX_SALES_AMOUNT = new ArrayList();
		} else {
			l_salesEXTERNAL_TAX_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_salesEXTERNAL_TAX_SALES_AMOUNT.add(((KQ0100010Struct) list.get(i)).getsalesEXTERNAL_TAX_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_salesINTERNAL_TAX_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_salesINTERNAL_TAX_SALES_AMOUNT == null) {
			l_salesINTERNAL_TAX_SALES_AMOUNT = new ArrayList();
		} else {
			l_salesINTERNAL_TAX_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_salesINTERNAL_TAX_SALES_AMOUNT.add(((KQ0100010Struct) list.get(i)).getsalesINTERNAL_TAX_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_salesTAXFREE_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_salesTAXFREE_SALES_AMOUNT == null) {
			l_salesTAXFREE_SALES_AMOUNT = new ArrayList();
		} else {
			l_salesTAXFREE_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_salesTAXFREE_SALES_AMOUNT.add(((KQ0100010Struct) list.get(i)).getsalesTAXFREE_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_salesTAX_CREDIT_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_salesTAX_CREDIT_SALES_AMOUNT == null) {
			l_salesTAX_CREDIT_SALES_AMOUNT = new ArrayList();
		} else {
			l_salesTAX_CREDIT_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_salesTAX_CREDIT_SALES_AMOUNT.add(((KQ0100010Struct) list.get(i)).getsalesTAX_CREDIT_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_salesEXTERNAL_TAX_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_salesEXTERNAL_TAX_AMOUNT == null) {
			l_salesEXTERNAL_TAX_AMOUNT = new ArrayList();
		} else {
			l_salesEXTERNAL_TAX_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_salesEXTERNAL_TAX_AMOUNT.add(((KQ0100010Struct) list.get(i)).getsalesEXTERNAL_TAX_AMOUNT());
		}
		return size;
	}
	public int setL2L_salesINTERNAL_TAX_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_salesINTERNAL_TAX_AMOUNT == null) {
			l_salesINTERNAL_TAX_AMOUNT = new ArrayList();
		} else {
			l_salesINTERNAL_TAX_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_salesINTERNAL_TAX_AMOUNT.add(((KQ0100010Struct) list.get(i)).getsalesINTERNAL_TAX_AMOUNT());
		}
		return size;
	}
	public int setL2L_salesTAX_AMOUNT_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_salesTAX_AMOUNT_1 == null) {
			l_salesTAX_AMOUNT_1 = new ArrayList();
		} else {
			l_salesTAX_AMOUNT_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_salesTAX_AMOUNT_1.add(((KQ0100010Struct) list.get(i)).getsalesTAX_AMOUNT_1());
		}
		return size;
	}
	public int setL2L_salesTAX_AMOUNT_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_salesTAX_AMOUNT_2 == null) {
			l_salesTAX_AMOUNT_2 = new ArrayList();
		} else {
			l_salesTAX_AMOUNT_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_salesTAX_AMOUNT_2.add(((KQ0100010Struct) list.get(i)).getsalesTAX_AMOUNT_2());
		}
		return size;
	}
	public int setL2L_salesTAX_AMOUNT_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_salesTAX_AMOUNT_3 == null) {
			l_salesTAX_AMOUNT_3 = new ArrayList();
		} else {
			l_salesTAX_AMOUNT_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_salesTAX_AMOUNT_3.add(((KQ0100010Struct) list.get(i)).getsalesTAX_AMOUNT_3());
		}
		return size;
	}
	public int setL2L_salesOWN_CUR_TAXCREDIT_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_salesOWN_CUR_TAXCREDIT_SALES_AMOUNT == null) {
			l_salesOWN_CUR_TAXCREDIT_SALES_AMOUNT = new ArrayList();
		} else {
			l_salesOWN_CUR_TAXCREDIT_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_salesOWN_CUR_TAXCREDIT_SALES_AMOUNT.add(((KQ0100010Struct) list.get(i)).getsalesOWN_CUR_TAXCREDIT_SALES_AMOUNT());
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
			l_SLIP_CD.add(((KQ0100010Struct) list.get(i)).getSLIP_CD());
		}
		return size;
	}
	public int setL2L_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COUNT == null) {
			l_COUNT = new ArrayList();
		} else {
			l_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COUNT.add(((KQ0100010Struct) list.get(i)).getCOUNT());
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
			l_ROW_COUNT.add(((KQ0100010Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}
	public int setL2L_insertSLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_insertSLIP_CD == null) {
			l_insertSLIP_CD = new ArrayList();
		} else {
			l_insertSLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_insertSLIP_CD.add(((KQ0100010Struct) list.get(i)).getinsertSLIP_CD());
		}
		return size;
	}
	public int setL2L_l_h_SHIP_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_h_SHIP_ODR_NO == null) {
			l_l_h_SHIP_ODR_NO = new ArrayList();
		} else {
			l_l_h_SHIP_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_h_SHIP_ODR_NO.add(((KQ0100010Struct) list.get(i)).getl_h_SHIP_ODR_NO());
		}
		return size;
	}
	public int setL2L_ORGNAL_SLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ORGNAL_SLIP_CD == null) {
			l_ORGNAL_SLIP_CD = new ArrayList();
		} else {
			l_ORGNAL_SLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ORGNAL_SLIP_CD.add(((KQ0100010Struct) list.get(i)).getORGNAL_SLIP_CD());
		}
		return size;
	}
	public int setL2L_l_h_SHIP_SEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_h_SHIP_SEQ_NO == null) {
			l_l_h_SHIP_SEQ_NO = new ArrayList();
		} else {
			l_l_h_SHIP_SEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_h_SHIP_SEQ_NO.add(((KQ0100010Struct) list.get(i)).getl_h_SHIP_SEQ_NO());
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
			l_MODIFY_COUNT.add(((KQ0100010Struct) list.get(i)).getMODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_TAX_CD_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_CD_1 == null) {
			l_TAX_CD_1 = new ArrayList();
		} else {
			l_TAX_CD_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_CD_1.add(((KQ0100010Struct) list.get(i)).getTAX_CD_1());
		}
		return size;
	}
	public int setL2L_TAX_CD_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_CD_2 == null) {
			l_TAX_CD_2 = new ArrayList();
		} else {
			l_TAX_CD_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_CD_2.add(((KQ0100010Struct) list.get(i)).getTAX_CD_2());
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
			l_EXTERNAL_TAX_SALES_AMOUNT.add(((KQ0100010Struct) list.get(i)).getEXTERNAL_TAX_SALES_AMOUNT());
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
			l_INTERNAL_TAX_SALES_AMOUNT.add(((KQ0100010Struct) list.get(i)).getINTERNAL_TAX_SALES_AMOUNT());
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
			l_TAXFREE_SALES_AMOUNT.add(((KQ0100010Struct) list.get(i)).getTAXFREE_SALES_AMOUNT());
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
			l_TAX_CREDIT_SALES_AMOUNT.add(((KQ0100010Struct) list.get(i)).getTAX_CREDIT_SALES_AMOUNT());
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
			l_EXTERNAL_TAX_AMOUNT.add(((KQ0100010Struct) list.get(i)).getEXTERNAL_TAX_AMOUNT());
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
			l_INTERNAL_TAX_AMOUNT.add(((KQ0100010Struct) list.get(i)).getINTERNAL_TAX_AMOUNT());
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
			l_TAX_AMOUNT_1.add(((KQ0100010Struct) list.get(i)).getTAX_AMOUNT_1());
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
			l_TAX_AMOUNT_2.add(((KQ0100010Struct) list.get(i)).getTAX_AMOUNT_2());
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
			l_TAX_AMOUNT_3.add(((KQ0100010Struct) list.get(i)).getTAX_AMOUNT_3());
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
			l_OWN_CUR_TAXCREDIT_SALES_AMOUNT.add(((KQ0100010Struct) list.get(i)).getOWN_CUR_TAXCREDIT_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_SLIP_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SLIP_DATE == null) {
			l_SLIP_DATE = new ArrayList();
		} else {
			l_SLIP_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SLIP_DATE.add(((KQ0100010Struct) list.get(i)).getSLIP_DATE());
		}
		return size;
	}
	public int setL2L_SUM_EXTERNAL_TAX_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUM_EXTERNAL_TAX_SALES_AMOUNT == null) {
			l_SUM_EXTERNAL_TAX_SALES_AMOUNT = new ArrayList();
		} else {
			l_SUM_EXTERNAL_TAX_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUM_EXTERNAL_TAX_SALES_AMOUNT.add(((KQ0100010Struct) list.get(i)).getSUM_EXTERNAL_TAX_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_SUM_INTERNAL_TAX_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUM_INTERNAL_TAX_SALES_AMOUNT == null) {
			l_SUM_INTERNAL_TAX_SALES_AMOUNT = new ArrayList();
		} else {
			l_SUM_INTERNAL_TAX_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUM_INTERNAL_TAX_SALES_AMOUNT.add(((KQ0100010Struct) list.get(i)).getSUM_INTERNAL_TAX_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_SUM_TAXFREE_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUM_TAXFREE_SALES_AMOUNT == null) {
			l_SUM_TAXFREE_SALES_AMOUNT = new ArrayList();
		} else {
			l_SUM_TAXFREE_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUM_TAXFREE_SALES_AMOUNT.add(((KQ0100010Struct) list.get(i)).getSUM_TAXFREE_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_SUM_TAX_CREDIT_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUM_TAX_CREDIT_SALES_AMOUNT == null) {
			l_SUM_TAX_CREDIT_SALES_AMOUNT = new ArrayList();
		} else {
			l_SUM_TAX_CREDIT_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUM_TAX_CREDIT_SALES_AMOUNT.add(((KQ0100010Struct) list.get(i)).getSUM_TAX_CREDIT_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_SUM_EXTERNAL_TAX_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUM_EXTERNAL_TAX_AMOUNT == null) {
			l_SUM_EXTERNAL_TAX_AMOUNT = new ArrayList();
		} else {
			l_SUM_EXTERNAL_TAX_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUM_EXTERNAL_TAX_AMOUNT.add(((KQ0100010Struct) list.get(i)).getSUM_EXTERNAL_TAX_AMOUNT());
		}
		return size;
	}
	public int setL2L_SUM_INTERNAL_TAX_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUM_INTERNAL_TAX_AMOUNT == null) {
			l_SUM_INTERNAL_TAX_AMOUNT = new ArrayList();
		} else {
			l_SUM_INTERNAL_TAX_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUM_INTERNAL_TAX_AMOUNT.add(((KQ0100010Struct) list.get(i)).getSUM_INTERNAL_TAX_AMOUNT());
		}
		return size;
	}
	public int setL2L_SUM_TAX_AMOUNT_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUM_TAX_AMOUNT_1 == null) {
			l_SUM_TAX_AMOUNT_1 = new ArrayList();
		} else {
			l_SUM_TAX_AMOUNT_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUM_TAX_AMOUNT_1.add(((KQ0100010Struct) list.get(i)).getSUM_TAX_AMOUNT_1());
		}
		return size;
	}
	public int setL2L_SUM_TAX_AMOUNT_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUM_TAX_AMOUNT_2 == null) {
			l_SUM_TAX_AMOUNT_2 = new ArrayList();
		} else {
			l_SUM_TAX_AMOUNT_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUM_TAX_AMOUNT_2.add(((KQ0100010Struct) list.get(i)).getSUM_TAX_AMOUNT_2());
		}
		return size;
	}
	public int setL2L_SUM_TAX_AMOUNT_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUM_TAX_AMOUNT_3 == null) {
			l_SUM_TAX_AMOUNT_3 = new ArrayList();
		} else {
			l_SUM_TAX_AMOUNT_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUM_TAX_AMOUNT_3.add(((KQ0100010Struct) list.get(i)).getSUM_TAX_AMOUNT_3());
		}
		return size;
	}
	public int setL2L_SUM_OWN_CUR_TAXCREDIT_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUM_OWN_CUR_TAXCREDIT_SALES_AMOUNT == null) {
			l_SUM_OWN_CUR_TAXCREDIT_SALES_AMOUNT = new ArrayList();
		} else {
			l_SUM_OWN_CUR_TAXCREDIT_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUM_OWN_CUR_TAXCREDIT_SALES_AMOUNT.add(((KQ0100010Struct) list.get(i)).getSUM_OWN_CUR_TAXCREDIT_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_SEL_SLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEL_SLIP_CD == null) {
			l_SEL_SLIP_CD = new ArrayList();
		} else {
			l_SEL_SLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEL_SLIP_CD.add(((KQ0100010Struct) list.get(i)).getSEL_SLIP_CD());
		}
		return size;
	}
	public int setL2L_SEL_SHIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEL_SHIP_CD == null) {
			l_SEL_SHIP_CD = new ArrayList();
		} else {
			l_SEL_SHIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEL_SHIP_CD.add(((KQ0100010Struct) list.get(i)).getSEL_SHIP_CD());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_h_UPDATE_FLG = null;
		m_r_SEL_PTN1 = null;
		m_r_SEL_PTN2 = null;
		m_INSPC_ACPT_TYP = null;
		m_SHIP_DLV_DATE = null;
		m_l_STATUS = null;
		m_l_h_STATUS_CD = null;
		m_l_ODR_SCDL_DLV_DATE = null;
		m_l_SHIP_SCDL_DLV_DATE = null;
		m_h_TAX_CD = null;
		m_l_h_SHIP_ODR_AMOUNT = null;
		m_l_h_SALES_AMOUNT = null;
		m_l_h_AI_AR_IF_FLG = null;
		m_l_h_TAX_DESINATED_SHIP_DATE = null;
		m_l_h_SALES_SLIP_CD = null;
		m_l_h_UPDATE_FLG = null;
		m_h_SLIP_CTRL_GRP = null;
		m_h_ODR_NO = null;
		m_CUST_ODR_NO = null;
		m_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_CUST_CD = null;
		m_CUST_NAME = null;
		m_CUST_ITEM_CD = null;
		m_CUST_ITEM_NAME = null;
		m_ODR_ACPT_DATE = null;
		m_DESINATED_DLV_DATE = null;
		m_ODR_UNIT_PRICE = null;
		m_ODR_UNIT_CD = null;
		m_ODR_QTY = null;
		m_TAX_CD = null;
		m_ODR_AMOUNT = null;
		m_ODR_AMOUNT_UNIT_CD = null;
		m_h_INSPC_ACPT_TYP = null;
		m_h_CURRNCY_CD = null;
		m_h_EXCH_TYP = null;
		m_h_PRICE_ROUND_TYP = null;
		m_h_TRANSPORT_LT = null;
		m_PLANT_CD = null;
		m_h_MODIFY_COUNT = null;
		m_COMPANY_CD = null;
		m_ODR_NO = null;
		m_l_ODR_ODR_NO = null;
		m_l_JOB_ODR_CD = null;
		m_l_PART_DLV_SEQ_NO = null;
		m_l_DLV_ODR_NO = null;
		m_l_SHIP_ODR_SLIP_CD = null;
		m_l_DESINATED_SHIP_DATE = null;
		m_l_SCDL_DLV_DATE = null;
		m_l_SHIP_ODR_NO = null;
		m_l_ODR_AMOUNT = null;
		m_l_SHIP_DATE = null;
		m_l_SHIP_ODR_AMOUNT = null;
		m_l_SHIP_SEQ_NO = null;
		m_l_SALES_DATE = null;
		m_l_SALES_AMOUNT = null;
		m_l_AI_AR_IF_FLG = null;
		m_l_SALES_SEQ_NO = null;
		m_l_SALES_SLIP_CD = null;
		m_l_SALES_STATUS = null;
		m_l_AR_SLIP_CD = null;
		m_l_AR_TRN_SLIP_CD = null;
		m_l_h_INSPC_ACPT_DATE = null;
		m_l_h_AR_INSPC_ACPT_DATE = null;
		m_l_h_AR_SALES_AMOUNT = null;
		m_l_h_AR_TRN_INSPC_ACPT_DATE = null;
		m_l_h_AR_TRN_SALES_AMOUNT = null;
		m_AR_STATUS = null;
		m_AR_TRN_STATUS = null;
		m_SLIP_CTRL_GRP = null;
		m_OPTION_ID = null;
		m_CODE = null;
		m_CREATED_BY = null;
		m_CREATED_PRG_NM = null;
		m_slipSHIP_ODR_AMOUNT = null;
		m_slipTAX_AMOUNT = null;
		m_slipSHIP_ODR_AMOUNT_TAX = null;
		m_slipEXTERNAL_TAX_SALES_AMOUNT = null;
		m_slipINTERNAL_TAX_SALES_AMOUNT = null;
		m_slipTAXFREE_SALES_AMOUNT = null;
		m_slipTAX_CREDIT_SALES_AMOUNT = null;
		m_slipEXTERNAL_TAX_AMOUNT = null;
		m_slipINTERNAL_TAX_AMOUNT = null;
		m_slipTAX_AMOUNT_1 = null;
		m_slipTAX_AMOUNT_2 = null;
		m_slipTAX_AMOUNT_3 = null;
		m_slipOWN_CUR_TAXCREDIT_SALES_AMOUNT = null;
		m_selectSHIP_ODR_NO = null;
		m_selectSLIP_CD = null;
		m_selectSALES_TYP = null;
		m_selectCUST_CD = null;
		m_selectITEM_CD = null;
		m_selectITEM_NAME = null;
		m_selectCUST_ODR_NO = null;
		m_selectSALES_DATE = null;
		m_selectSALES_DEPT_CD = null;
		m_selectVEND_CD = null;
		m_selectPRD_ODR_PLACE_CD = null;
		m_selectCUST_CHRG_PSN_CD = null;
		m_selectODR_ACPT_PSN_CD = null;
		m_selectSALES_QTY = null;
		m_selectSALES_UNIT_PRICE = null;
		m_selectUNIT_CD = null;
		m_selectSALES_AMOUNT = null;
		m_selectSALES_AMOUNT_EXCH_RATES = null;
		m_selectINSPC_ACPT_DATE = null;
		m_selectINSPC_ACPT_QTY = null;
		m_selectEXTERNAL_TAX_SALES_AMOUNT = null;
		m_selectINTERNAL_TAX_SALES_AMOUNT = null;
		m_selectTAXFREE_SALES_AMOUNT = null;
		m_selectTAX_CREDIT_SALES_AMOUNT = null;
		m_selectEXTERNAL_TAX_AMOUNT = null;
		m_selectINTERNAL_TAX_AMOUNT = null;
		m_selectTAX_AMOUNT_1 = null;
		m_selectTAX_AMOUNT_2 = null;
		m_selectTAX_AMOUNT_3 = null;
		m_selectOWN_CUR_TAXCREDIT_SALES_AMOUNT = null;
		m_selectORG_SLIP_CD = null;
		m_selectCURRNCY_CD = null;
		m_selectSPCL_PRICE_CO = null;
		m_selectREMARKS = null;
		m_selectINSPC_ACPT_TYP = null;
		m_selectSTATUS = null;
		m_l_h_SALES_SEQ_NO = null;
		m_salesEXTERNAL_TAX_SALES_AMOUNT = null;
		m_salesINTERNAL_TAX_SALES_AMOUNT = null;
		m_salesTAXFREE_SALES_AMOUNT = null;
		m_salesTAX_CREDIT_SALES_AMOUNT = null;
		m_salesEXTERNAL_TAX_AMOUNT = null;
		m_salesINTERNAL_TAX_AMOUNT = null;
		m_salesTAX_AMOUNT_1 = null;
		m_salesTAX_AMOUNT_2 = null;
		m_salesTAX_AMOUNT_3 = null;
		m_salesOWN_CUR_TAXCREDIT_SALES_AMOUNT = null;
		m_SLIP_CD = null;
		m_COUNT = null;
		m_ROW_COUNT = null;
		m_insertSLIP_CD = null;
		m_l_h_SHIP_ODR_NO = null;
		m_ORGNAL_SLIP_CD = null;
		m_l_h_SHIP_SEQ_NO = null;
		m_MODIFY_COUNT = null;
		m_TAX_CD_1 = null;
		m_TAX_CD_2 = null;
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
		m_SLIP_DATE = null;
		m_SUM_EXTERNAL_TAX_SALES_AMOUNT = null;
		m_SUM_INTERNAL_TAX_SALES_AMOUNT = null;
		m_SUM_TAXFREE_SALES_AMOUNT = null;
		m_SUM_TAX_CREDIT_SALES_AMOUNT = null;
		m_SUM_EXTERNAL_TAX_AMOUNT = null;
		m_SUM_INTERNAL_TAX_AMOUNT = null;
		m_SUM_TAX_AMOUNT_1 = null;
		m_SUM_TAX_AMOUNT_2 = null;
		m_SUM_TAX_AMOUNT_3 = null;
		m_SUM_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;
		m_SEL_SLIP_CD = null;
		m_SEL_SHIP_CD = null;

		l_h_UPDATE_FLG = null;
		l_r_SEL_PTN1 = null;
		l_r_SEL_PTN2 = null;
		l_INSPC_ACPT_TYP = null;
		l_SHIP_DLV_DATE = null;
		l_l_STATUS = null;
		l_l_h_STATUS_CD = null;
		l_l_ODR_SCDL_DLV_DATE = null;
		l_l_SHIP_SCDL_DLV_DATE = null;
		l_h_TAX_CD = null;
		l_l_h_SHIP_ODR_AMOUNT = null;
		l_l_h_SALES_AMOUNT = null;
		l_l_h_AI_AR_IF_FLG = null;
		l_l_h_TAX_DESINATED_SHIP_DATE = null;
		l_l_h_SALES_SLIP_CD = null;
		l_l_h_UPDATE_FLG = null;
		l_h_SLIP_CTRL_GRP = null;
		l_h_ODR_NO = null;
		l_CUST_ODR_NO = null;
		l_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_CUST_CD = null;
		l_CUST_NAME = null;
		l_CUST_ITEM_CD = null;
		l_CUST_ITEM_NAME = null;
		l_ODR_ACPT_DATE = null;
		l_DESINATED_DLV_DATE = null;
		l_ODR_UNIT_PRICE = null;
		l_ODR_UNIT_CD = null;
		l_ODR_QTY = null;
		l_TAX_CD = null;
		l_ODR_AMOUNT = null;
		l_ODR_AMOUNT_UNIT_CD = null;
		l_h_INSPC_ACPT_TYP = null;
		l_h_CURRNCY_CD = null;
		l_h_EXCH_TYP = null;
		l_h_PRICE_ROUND_TYP = null;
		l_h_TRANSPORT_LT = null;
		l_PLANT_CD = null;
		l_h_MODIFY_COUNT = null;
		l_COMPANY_CD = null;
		l_ODR_NO = null;
		l_l_ODR_ODR_NO = null;
		l_l_JOB_ODR_CD = null;
		l_l_PART_DLV_SEQ_NO = null;
		l_l_DLV_ODR_NO = null;
		l_l_SHIP_ODR_SLIP_CD = null;
		l_l_DESINATED_SHIP_DATE = null;
		l_l_SCDL_DLV_DATE = null;
		l_l_SHIP_ODR_NO = null;
		l_l_ODR_AMOUNT = null;
		l_l_SHIP_DATE = null;
		l_l_SHIP_ODR_AMOUNT = null;
		l_l_SHIP_SEQ_NO = null;
		l_l_SALES_DATE = null;
		l_l_SALES_AMOUNT = null;
		l_l_AI_AR_IF_FLG = null;
		l_l_SALES_SEQ_NO = null;
		l_l_SALES_SLIP_CD = null;
		l_l_SALES_STATUS = null;
		l_l_AR_SLIP_CD = null;
		l_l_AR_TRN_SLIP_CD = null;
		l_l_h_INSPC_ACPT_DATE = null;
		l_l_h_AR_INSPC_ACPT_DATE = null;
		l_l_h_AR_SALES_AMOUNT = null;
		l_l_h_AR_TRN_INSPC_ACPT_DATE = null;
		l_l_h_AR_TRN_SALES_AMOUNT = null;
		l_AR_STATUS = null;
		l_AR_TRN_STATUS = null;
		l_SLIP_CTRL_GRP = null;
		l_OPTION_ID = null;
		l_CODE = null;
		l_CREATED_BY = null;
		l_CREATED_PRG_NM = null;
		l_slipSHIP_ODR_AMOUNT = null;
		l_slipTAX_AMOUNT = null;
		l_slipSHIP_ODR_AMOUNT_TAX = null;
		l_slipEXTERNAL_TAX_SALES_AMOUNT = null;
		l_slipINTERNAL_TAX_SALES_AMOUNT = null;
		l_slipTAXFREE_SALES_AMOUNT = null;
		l_slipTAX_CREDIT_SALES_AMOUNT = null;
		l_slipEXTERNAL_TAX_AMOUNT = null;
		l_slipINTERNAL_TAX_AMOUNT = null;
		l_slipTAX_AMOUNT_1 = null;
		l_slipTAX_AMOUNT_2 = null;
		l_slipTAX_AMOUNT_3 = null;
		l_slipOWN_CUR_TAXCREDIT_SALES_AMOUNT = null;
		l_selectSHIP_ODR_NO = null;
		l_selectSLIP_CD = null;
		l_selectSALES_TYP = null;
		l_selectCUST_CD = null;
		l_selectITEM_CD = null;
		l_selectITEM_NAME = null;
		l_selectCUST_ODR_NO = null;
		l_selectSALES_DATE = null;
		l_selectSALES_DEPT_CD = null;
		l_selectVEND_CD = null;
		l_selectPRD_ODR_PLACE_CD = null;
		l_selectCUST_CHRG_PSN_CD = null;
		l_selectODR_ACPT_PSN_CD = null;
		l_selectSALES_QTY = null;
		l_selectSALES_UNIT_PRICE = null;
		l_selectUNIT_CD = null;
		l_selectSALES_AMOUNT = null;
		l_selectSALES_AMOUNT_EXCH_RATES = null;
		l_selectINSPC_ACPT_DATE = null;
		l_selectINSPC_ACPT_QTY = null;
		l_selectEXTERNAL_TAX_SALES_AMOUNT = null;
		l_selectINTERNAL_TAX_SALES_AMOUNT = null;
		l_selectTAXFREE_SALES_AMOUNT = null;
		l_selectTAX_CREDIT_SALES_AMOUNT = null;
		l_selectEXTERNAL_TAX_AMOUNT = null;
		l_selectINTERNAL_TAX_AMOUNT = null;
		l_selectTAX_AMOUNT_1 = null;
		l_selectTAX_AMOUNT_2 = null;
		l_selectTAX_AMOUNT_3 = null;
		l_selectOWN_CUR_TAXCREDIT_SALES_AMOUNT = null;
		l_selectORG_SLIP_CD = null;
		l_selectCURRNCY_CD = null;
		l_selectSPCL_PRICE_CO = null;
		l_selectREMARKS = null;
		l_selectINSPC_ACPT_TYP = null;
		l_selectSTATUS = null;
		l_l_h_SALES_SEQ_NO = null;
		l_salesEXTERNAL_TAX_SALES_AMOUNT = null;
		l_salesINTERNAL_TAX_SALES_AMOUNT = null;
		l_salesTAXFREE_SALES_AMOUNT = null;
		l_salesTAX_CREDIT_SALES_AMOUNT = null;
		l_salesEXTERNAL_TAX_AMOUNT = null;
		l_salesINTERNAL_TAX_AMOUNT = null;
		l_salesTAX_AMOUNT_1 = null;
		l_salesTAX_AMOUNT_2 = null;
		l_salesTAX_AMOUNT_3 = null;
		l_salesOWN_CUR_TAXCREDIT_SALES_AMOUNT = null;
		l_SLIP_CD = null;
		l_COUNT = null;
		l_ROW_COUNT = null;
		l_insertSLIP_CD = null;
		l_l_h_SHIP_ODR_NO = null;
		l_ORGNAL_SLIP_CD = null;
		l_l_h_SHIP_SEQ_NO = null;
		l_MODIFY_COUNT = null;
		l_TAX_CD_1 = null;
		l_TAX_CD_2 = null;
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
		l_SLIP_DATE = null;
		l_SUM_EXTERNAL_TAX_SALES_AMOUNT = null;
		l_SUM_INTERNAL_TAX_SALES_AMOUNT = null;
		l_SUM_TAXFREE_SALES_AMOUNT = null;
		l_SUM_TAX_CREDIT_SALES_AMOUNT = null;
		l_SUM_EXTERNAL_TAX_AMOUNT = null;
		l_SUM_INTERNAL_TAX_AMOUNT = null;
		l_SUM_TAX_AMOUNT_1 = null;
		l_SUM_TAX_AMOUNT_2 = null;
		l_SUM_TAX_AMOUNT_3 = null;
		l_SUM_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;
		l_SEL_SLIP_CD = null;
		l_SEL_SHIP_CD = null;

		return;
	}

	//////////////////////////////
	// Orteus�W��Struct
	// ���[�U�R�[�h
	public String sUser_ID = null;
	// set/get���\�b�h
	public String getsUser_ID() { return sUser_ID; }
	public void setsUser_ID(String val) { sUser_ID = val; }

	// �g�D�R�[�h
	public String sOrganization_CD = null;
	// set/get���\�b�h
	public String getsOrganization_CD() { return sOrganization_CD; }
	public void setsOraganization_CD(String val) { sOrganization_CD = val; }

	// �������t
	public String sSysdate = null;
	// set/get���\�b�h
	public String getsSysdate() { return sSysdate; }
	public void setsSysdate(String val) { sSysdate = val; }
	//////////////////////////////

	/**
	 * medKQ0100010�N���X�̕W���R���X�g���N�^
	 */
	public KQ0100010Struct()
	{
		//{{user_implement_code_constractor
			initialize();
			// TODO: �����ɏ����������L�q���Ă�������
                //}}user_implement_code_constractor

		return;
	}

	/**
	 * �C���X�^���X�j�󎞂ɍs������
	 *
	 */
	protected void finalize()
	{
		clear();
		return;
	}

	/**
	 * �f�[�^�̃Z�b�g(�ʃ����o�E���X�g�����o����)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStruct(KQ0100010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setStructM(struct);
			this.setStructL(struct);
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(�ʃ����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructM(KQ0100010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.seth_UPDATE_FLG(struct.geth_UPDATE_FLG());
			this.setr_SEL_PTN1(struct.getr_SEL_PTN1());
			this.setr_SEL_PTN2(struct.getr_SEL_PTN2());
			this.setINSPC_ACPT_TYP(struct.getINSPC_ACPT_TYP());
			this.setSHIP_DLV_DATE(struct.getSHIP_DLV_DATE());
			this.setl_STATUS(struct.getl_STATUS());
			this.setl_h_STATUS_CD(struct.getl_h_STATUS_CD());
			this.setl_ODR_SCDL_DLV_DATE(struct.getl_ODR_SCDL_DLV_DATE());
			this.setl_SHIP_SCDL_DLV_DATE(struct.getl_SHIP_SCDL_DLV_DATE());
			this.seth_TAX_CD(struct.geth_TAX_CD());
			this.setl_h_SHIP_ODR_AMOUNT(struct.getl_h_SHIP_ODR_AMOUNT());
			this.setl_h_SALES_AMOUNT(struct.getl_h_SALES_AMOUNT());
			this.setl_h_AI_AR_IF_FLG(struct.getl_h_AI_AR_IF_FLG());
			this.setl_h_TAX_DESINATED_SHIP_DATE(struct.getl_h_TAX_DESINATED_SHIP_DATE());
			this.setl_h_SALES_SLIP_CD(struct.getl_h_SALES_SLIP_CD());
			this.setl_h_UPDATE_FLG(struct.getl_h_UPDATE_FLG());
			this.seth_SLIP_CTRL_GRP(struct.geth_SLIP_CTRL_GRP());
			this.seth_ODR_NO(struct.geth_ODR_NO());
			this.setCUST_ODR_NO(struct.getCUST_ODR_NO());
			this.setITEM_CD(struct.getITEM_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setCUST_CD(struct.getCUST_CD());
			this.setCUST_NAME(struct.getCUST_NAME());
			this.setCUST_ITEM_CD(struct.getCUST_ITEM_CD());
			this.setCUST_ITEM_NAME(struct.getCUST_ITEM_NAME());
			this.setODR_ACPT_DATE(struct.getODR_ACPT_DATE());
			this.setDESINATED_DLV_DATE(struct.getDESINATED_DLV_DATE());
			this.setODR_UNIT_PRICE(struct.getODR_UNIT_PRICE());
			this.setODR_UNIT_CD(struct.getODR_UNIT_CD());
			this.setODR_QTY(struct.getODR_QTY());
			this.setTAX_CD(struct.getTAX_CD());
			this.setODR_AMOUNT(struct.getODR_AMOUNT());
			this.setODR_AMOUNT_UNIT_CD(struct.getODR_AMOUNT_UNIT_CD());
			this.seth_INSPC_ACPT_TYP(struct.geth_INSPC_ACPT_TYP());
			this.seth_CURRNCY_CD(struct.geth_CURRNCY_CD());
			this.seth_EXCH_TYP(struct.geth_EXCH_TYP());
			this.seth_PRICE_ROUND_TYP(struct.geth_PRICE_ROUND_TYP());
			this.seth_TRANSPORT_LT(struct.geth_TRANSPORT_LT());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.seth_MODIFY_COUNT(struct.geth_MODIFY_COUNT());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setODR_NO(struct.getODR_NO());
			this.setl_ODR_ODR_NO(struct.getl_ODR_ODR_NO());
			this.setl_JOB_ODR_CD(struct.getl_JOB_ODR_CD());
			this.setl_PART_DLV_SEQ_NO(struct.getl_PART_DLV_SEQ_NO());
			this.setl_DLV_ODR_NO(struct.getl_DLV_ODR_NO());
			this.setl_SHIP_ODR_SLIP_CD(struct.getl_SHIP_ODR_SLIP_CD());
			this.setl_DESINATED_SHIP_DATE(struct.getl_DESINATED_SHIP_DATE());
			this.setl_SCDL_DLV_DATE(struct.getl_SCDL_DLV_DATE());
			this.setl_SHIP_ODR_NO(struct.getl_SHIP_ODR_NO());
			this.setl_ODR_AMOUNT(struct.getl_ODR_AMOUNT());
			this.setl_SHIP_DATE(struct.getl_SHIP_DATE());
			this.setl_SHIP_ODR_AMOUNT(struct.getl_SHIP_ODR_AMOUNT());
			this.setl_SHIP_SEQ_NO(struct.getl_SHIP_SEQ_NO());
			this.setl_SALES_DATE(struct.getl_SALES_DATE());
			this.setl_SALES_AMOUNT(struct.getl_SALES_AMOUNT());
			this.setl_AI_AR_IF_FLG(struct.getl_AI_AR_IF_FLG());
			this.setl_SALES_SEQ_NO(struct.getl_SALES_SEQ_NO());
			this.setl_SALES_SLIP_CD(struct.getl_SALES_SLIP_CD());
			this.setl_SALES_STATUS(struct.getl_SALES_STATUS());
			this.setl_AR_SLIP_CD(struct.getl_AR_SLIP_CD());
			this.setl_AR_TRN_SLIP_CD(struct.getl_AR_TRN_SLIP_CD());
			this.setl_h_INSPC_ACPT_DATE(struct.getl_h_INSPC_ACPT_DATE());
			this.setl_h_AR_INSPC_ACPT_DATE(struct.getl_h_AR_INSPC_ACPT_DATE());
			this.setl_h_AR_SALES_AMOUNT(struct.getl_h_AR_SALES_AMOUNT());
			this.setl_h_AR_TRN_INSPC_ACPT_DATE(struct.getl_h_AR_TRN_INSPC_ACPT_DATE());
			this.setl_h_AR_TRN_SALES_AMOUNT(struct.getl_h_AR_TRN_SALES_AMOUNT());
			this.setAR_STATUS(struct.getAR_STATUS());
			this.setAR_TRN_STATUS(struct.getAR_TRN_STATUS());
			this.setSLIP_CTRL_GRP(struct.getSLIP_CTRL_GRP());
			this.setOPTION_ID(struct.getOPTION_ID());
			this.setCODE(struct.getCODE());
			this.setCREATED_BY(struct.getCREATED_BY());
			this.setCREATED_PRG_NM(struct.getCREATED_PRG_NM());
			this.setslipSHIP_ODR_AMOUNT(struct.getslipSHIP_ODR_AMOUNT());
			this.setslipTAX_AMOUNT(struct.getslipTAX_AMOUNT());
			this.setslipSHIP_ODR_AMOUNT_TAX(struct.getslipSHIP_ODR_AMOUNT_TAX());
			this.setslipEXTERNAL_TAX_SALES_AMOUNT(struct.getslipEXTERNAL_TAX_SALES_AMOUNT());
			this.setslipINTERNAL_TAX_SALES_AMOUNT(struct.getslipINTERNAL_TAX_SALES_AMOUNT());
			this.setslipTAXFREE_SALES_AMOUNT(struct.getslipTAXFREE_SALES_AMOUNT());
			this.setslipTAX_CREDIT_SALES_AMOUNT(struct.getslipTAX_CREDIT_SALES_AMOUNT());
			this.setslipEXTERNAL_TAX_AMOUNT(struct.getslipEXTERNAL_TAX_AMOUNT());
			this.setslipINTERNAL_TAX_AMOUNT(struct.getslipINTERNAL_TAX_AMOUNT());
			this.setslipTAX_AMOUNT_1(struct.getslipTAX_AMOUNT_1());
			this.setslipTAX_AMOUNT_2(struct.getslipTAX_AMOUNT_2());
			this.setslipTAX_AMOUNT_3(struct.getslipTAX_AMOUNT_3());
			this.setslipOWN_CUR_TAXCREDIT_SALES_AMOUNT(struct.getslipOWN_CUR_TAXCREDIT_SALES_AMOUNT());
			this.setselectSHIP_ODR_NO(struct.getselectSHIP_ODR_NO());
			this.setselectSLIP_CD(struct.getselectSLIP_CD());
			this.setselectSALES_TYP(struct.getselectSALES_TYP());
			this.setselectCUST_CD(struct.getselectCUST_CD());
			this.setselectITEM_CD(struct.getselectITEM_CD());
			this.setselectITEM_NAME(struct.getselectITEM_NAME());
			this.setselectCUST_ODR_NO(struct.getselectCUST_ODR_NO());
			this.setselectSALES_DATE(struct.getselectSALES_DATE());
			this.setselectSALES_DEPT_CD(struct.getselectSALES_DEPT_CD());
			this.setselectVEND_CD(struct.getselectVEND_CD());
			this.setselectPRD_ODR_PLACE_CD(struct.getselectPRD_ODR_PLACE_CD());
			this.setselectCUST_CHRG_PSN_CD(struct.getselectCUST_CHRG_PSN_CD());
			this.setselectODR_ACPT_PSN_CD(struct.getselectODR_ACPT_PSN_CD());
			this.setselectSALES_QTY(struct.getselectSALES_QTY());
			this.setselectSALES_UNIT_PRICE(struct.getselectSALES_UNIT_PRICE());
			this.setselectUNIT_CD(struct.getselectUNIT_CD());
			this.setselectSALES_AMOUNT(struct.getselectSALES_AMOUNT());
			this.setselectSALES_AMOUNT_EXCH_RATES(struct.getselectSALES_AMOUNT_EXCH_RATES());
			this.setselectINSPC_ACPT_DATE(struct.getselectINSPC_ACPT_DATE());
			this.setselectINSPC_ACPT_QTY(struct.getselectINSPC_ACPT_QTY());
			this.setselectEXTERNAL_TAX_SALES_AMOUNT(struct.getselectEXTERNAL_TAX_SALES_AMOUNT());
			this.setselectINTERNAL_TAX_SALES_AMOUNT(struct.getselectINTERNAL_TAX_SALES_AMOUNT());
			this.setselectTAXFREE_SALES_AMOUNT(struct.getselectTAXFREE_SALES_AMOUNT());
			this.setselectTAX_CREDIT_SALES_AMOUNT(struct.getselectTAX_CREDIT_SALES_AMOUNT());
			this.setselectEXTERNAL_TAX_AMOUNT(struct.getselectEXTERNAL_TAX_AMOUNT());
			this.setselectINTERNAL_TAX_AMOUNT(struct.getselectINTERNAL_TAX_AMOUNT());
			this.setselectTAX_AMOUNT_1(struct.getselectTAX_AMOUNT_1());
			this.setselectTAX_AMOUNT_2(struct.getselectTAX_AMOUNT_2());
			this.setselectTAX_AMOUNT_3(struct.getselectTAX_AMOUNT_3());
			this.setselectOWN_CUR_TAXCREDIT_SALES_AMOUNT(struct.getselectOWN_CUR_TAXCREDIT_SALES_AMOUNT());
			this.setselectORG_SLIP_CD(struct.getselectORG_SLIP_CD());
			this.setselectCURRNCY_CD(struct.getselectCURRNCY_CD());
			this.setselectSPCL_PRICE_CO(struct.getselectSPCL_PRICE_CO());
			this.setselectREMARKS(struct.getselectREMARKS());
			this.setselectINSPC_ACPT_TYP(struct.getselectINSPC_ACPT_TYP());
			this.setselectSTATUS(struct.getselectSTATUS());
			this.setl_h_SALES_SEQ_NO(struct.getl_h_SALES_SEQ_NO());
			this.setsalesEXTERNAL_TAX_SALES_AMOUNT(struct.getsalesEXTERNAL_TAX_SALES_AMOUNT());
			this.setsalesINTERNAL_TAX_SALES_AMOUNT(struct.getsalesINTERNAL_TAX_SALES_AMOUNT());
			this.setsalesTAXFREE_SALES_AMOUNT(struct.getsalesTAXFREE_SALES_AMOUNT());
			this.setsalesTAX_CREDIT_SALES_AMOUNT(struct.getsalesTAX_CREDIT_SALES_AMOUNT());
			this.setsalesEXTERNAL_TAX_AMOUNT(struct.getsalesEXTERNAL_TAX_AMOUNT());
			this.setsalesINTERNAL_TAX_AMOUNT(struct.getsalesINTERNAL_TAX_AMOUNT());
			this.setsalesTAX_AMOUNT_1(struct.getsalesTAX_AMOUNT_1());
			this.setsalesTAX_AMOUNT_2(struct.getsalesTAX_AMOUNT_2());
			this.setsalesTAX_AMOUNT_3(struct.getsalesTAX_AMOUNT_3());
			this.setsalesOWN_CUR_TAXCREDIT_SALES_AMOUNT(struct.getsalesOWN_CUR_TAXCREDIT_SALES_AMOUNT());
			this.setSLIP_CD(struct.getSLIP_CD());
			this.setCOUNT(struct.getCOUNT());
			this.setROW_COUNT(struct.getROW_COUNT());
			this.setinsertSLIP_CD(struct.getinsertSLIP_CD());
			this.setl_h_SHIP_ODR_NO(struct.getl_h_SHIP_ODR_NO());
			this.setORGNAL_SLIP_CD(struct.getORGNAL_SLIP_CD());
			this.setl_h_SHIP_SEQ_NO(struct.getl_h_SHIP_SEQ_NO());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setTAX_CD_1(struct.getTAX_CD_1());
			this.setTAX_CD_2(struct.getTAX_CD_2());
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
			this.setSLIP_DATE(struct.getSLIP_DATE());
			this.setSUM_EXTERNAL_TAX_SALES_AMOUNT(struct.getSUM_EXTERNAL_TAX_SALES_AMOUNT());
			this.setSUM_INTERNAL_TAX_SALES_AMOUNT(struct.getSUM_INTERNAL_TAX_SALES_AMOUNT());
			this.setSUM_TAXFREE_SALES_AMOUNT(struct.getSUM_TAXFREE_SALES_AMOUNT());
			this.setSUM_TAX_CREDIT_SALES_AMOUNT(struct.getSUM_TAX_CREDIT_SALES_AMOUNT());
			this.setSUM_EXTERNAL_TAX_AMOUNT(struct.getSUM_EXTERNAL_TAX_AMOUNT());
			this.setSUM_INTERNAL_TAX_AMOUNT(struct.getSUM_INTERNAL_TAX_AMOUNT());
			this.setSUM_TAX_AMOUNT_1(struct.getSUM_TAX_AMOUNT_1());
			this.setSUM_TAX_AMOUNT_2(struct.getSUM_TAX_AMOUNT_2());
			this.setSUM_TAX_AMOUNT_3(struct.getSUM_TAX_AMOUNT_3());
			this.setSUM_OWN_CUR_TAXCREDIT_SALES_AMOUNT(struct.getSUM_OWN_CUR_TAXCREDIT_SALES_AMOUNT());
			this.setSEL_SLIP_CD(struct.getSEL_SLIP_CD());
			this.setSEL_SHIP_CD(struct.getSEL_SHIP_CD());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(KQ0100010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_h_UPDATE_FLG(struct.getList_h_UPDATE_FLG());
			this.setList_r_SEL_PTN1(struct.getList_r_SEL_PTN1());
			this.setList_r_SEL_PTN2(struct.getList_r_SEL_PTN2());
			this.setList_INSPC_ACPT_TYP(struct.getList_INSPC_ACPT_TYP());
			this.setList_SHIP_DLV_DATE(struct.getList_SHIP_DLV_DATE());
			this.setList_l_STATUS(struct.getList_l_STATUS());
			this.setList_l_h_STATUS_CD(struct.getList_l_h_STATUS_CD());
			this.setList_l_ODR_SCDL_DLV_DATE(struct.getList_l_ODR_SCDL_DLV_DATE());
			this.setList_l_SHIP_SCDL_DLV_DATE(struct.getList_l_SHIP_SCDL_DLV_DATE());
			this.setList_h_TAX_CD(struct.getList_h_TAX_CD());
			this.setList_l_h_SHIP_ODR_AMOUNT(struct.getList_l_h_SHIP_ODR_AMOUNT());
			this.setList_l_h_SALES_AMOUNT(struct.getList_l_h_SALES_AMOUNT());
			this.setList_l_h_AI_AR_IF_FLG(struct.getList_l_h_AI_AR_IF_FLG());
			this.setList_l_h_TAX_DESINATED_SHIP_DATE(struct.getList_l_h_TAX_DESINATED_SHIP_DATE());
			this.setList_l_h_SALES_SLIP_CD(struct.getList_l_h_SALES_SLIP_CD());
			this.setList_l_h_UPDATE_FLG(struct.getList_l_h_UPDATE_FLG());
			this.setList_h_SLIP_CTRL_GRP(struct.getList_h_SLIP_CTRL_GRP());
			this.setList_h_ODR_NO(struct.getList_h_ODR_NO());
			this.setList_CUST_ODR_NO(struct.getList_CUST_ODR_NO());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_CUST_CD(struct.getList_CUST_CD());
			this.setList_CUST_NAME(struct.getList_CUST_NAME());
			this.setList_CUST_ITEM_CD(struct.getList_CUST_ITEM_CD());
			this.setList_CUST_ITEM_NAME(struct.getList_CUST_ITEM_NAME());
			this.setList_ODR_ACPT_DATE(struct.getList_ODR_ACPT_DATE());
			this.setList_DESINATED_DLV_DATE(struct.getList_DESINATED_DLV_DATE());
			this.setList_ODR_UNIT_PRICE(struct.getList_ODR_UNIT_PRICE());
			this.setList_ODR_UNIT_CD(struct.getList_ODR_UNIT_CD());
			this.setList_ODR_QTY(struct.getList_ODR_QTY());
			this.setList_TAX_CD(struct.getList_TAX_CD());
			this.setList_ODR_AMOUNT(struct.getList_ODR_AMOUNT());
			this.setList_ODR_AMOUNT_UNIT_CD(struct.getList_ODR_AMOUNT_UNIT_CD());
			this.setList_h_INSPC_ACPT_TYP(struct.getList_h_INSPC_ACPT_TYP());
			this.setList_h_CURRNCY_CD(struct.getList_h_CURRNCY_CD());
			this.setList_h_EXCH_TYP(struct.getList_h_EXCH_TYP());
			this.setList_h_PRICE_ROUND_TYP(struct.getList_h_PRICE_ROUND_TYP());
			this.setList_h_TRANSPORT_LT(struct.getList_h_TRANSPORT_LT());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_h_MODIFY_COUNT(struct.getList_h_MODIFY_COUNT());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_ODR_NO(struct.getList_ODR_NO());
			this.setList_l_ODR_ODR_NO(struct.getList_l_ODR_ODR_NO());
			this.setList_l_JOB_ODR_CD(struct.getList_l_JOB_ODR_CD());
			this.setList_l_PART_DLV_SEQ_NO(struct.getList_l_PART_DLV_SEQ_NO());
			this.setList_l_DLV_ODR_NO(struct.getList_l_DLV_ODR_NO());
			this.setList_l_SHIP_ODR_SLIP_CD(struct.getList_l_SHIP_ODR_SLIP_CD());
			this.setList_l_DESINATED_SHIP_DATE(struct.getList_l_DESINATED_SHIP_DATE());
			this.setList_l_SCDL_DLV_DATE(struct.getList_l_SCDL_DLV_DATE());
			this.setList_l_SHIP_ODR_NO(struct.getList_l_SHIP_ODR_NO());
			this.setList_l_ODR_AMOUNT(struct.getList_l_ODR_AMOUNT());
			this.setList_l_SHIP_DATE(struct.getList_l_SHIP_DATE());
			this.setList_l_SHIP_ODR_AMOUNT(struct.getList_l_SHIP_ODR_AMOUNT());
			this.setList_l_SHIP_SEQ_NO(struct.getList_l_SHIP_SEQ_NO());
			this.setList_l_SALES_DATE(struct.getList_l_SALES_DATE());
			this.setList_l_SALES_AMOUNT(struct.getList_l_SALES_AMOUNT());
			this.setList_l_AI_AR_IF_FLG(struct.getList_l_AI_AR_IF_FLG());
			this.setList_l_SALES_SEQ_NO(struct.getList_l_SALES_SEQ_NO());
			this.setList_l_SALES_SLIP_CD(struct.getList_l_SALES_SLIP_CD());
			this.setList_l_SALES_STATUS(struct.getList_l_SALES_STATUS());
			this.setList_l_AR_SLIP_CD(struct.getList_l_AR_SLIP_CD());
			this.setList_l_AR_TRN_SLIP_CD(struct.getList_l_AR_TRN_SLIP_CD());
			this.setList_l_h_INSPC_ACPT_DATE(struct.getList_l_h_INSPC_ACPT_DATE());
			this.setList_l_h_AR_INSPC_ACPT_DATE(struct.getList_l_h_AR_INSPC_ACPT_DATE());
			this.setList_l_h_AR_SALES_AMOUNT(struct.getList_l_h_AR_SALES_AMOUNT());
			this.setList_l_h_AR_TRN_INSPC_ACPT_DATE(struct.getList_l_h_AR_TRN_INSPC_ACPT_DATE());
			this.setList_l_h_AR_TRN_SALES_AMOUNT(struct.getList_l_h_AR_TRN_SALES_AMOUNT());
			this.setList_AR_STATUS(struct.getList_AR_STATUS());
			this.setList_AR_TRN_STATUS(struct.getList_AR_TRN_STATUS());
			this.setList_SLIP_CTRL_GRP(struct.getList_SLIP_CTRL_GRP());
			this.setList_OPTION_ID(struct.getList_OPTION_ID());
			this.setList_CODE(struct.getList_CODE());
			this.setList_CREATED_BY(struct.getList_CREATED_BY());
			this.setList_CREATED_PRG_NM(struct.getList_CREATED_PRG_NM());
			this.setList_slipSHIP_ODR_AMOUNT(struct.getList_slipSHIP_ODR_AMOUNT());
			this.setList_slipTAX_AMOUNT(struct.getList_slipTAX_AMOUNT());
			this.setList_slipSHIP_ODR_AMOUNT_TAX(struct.getList_slipSHIP_ODR_AMOUNT_TAX());
			this.setList_slipEXTERNAL_TAX_SALES_AMOUNT(struct.getList_slipEXTERNAL_TAX_SALES_AMOUNT());
			this.setList_slipINTERNAL_TAX_SALES_AMOUNT(struct.getList_slipINTERNAL_TAX_SALES_AMOUNT());
			this.setList_slipTAXFREE_SALES_AMOUNT(struct.getList_slipTAXFREE_SALES_AMOUNT());
			this.setList_slipTAX_CREDIT_SALES_AMOUNT(struct.getList_slipTAX_CREDIT_SALES_AMOUNT());
			this.setList_slipEXTERNAL_TAX_AMOUNT(struct.getList_slipEXTERNAL_TAX_AMOUNT());
			this.setList_slipINTERNAL_TAX_AMOUNT(struct.getList_slipINTERNAL_TAX_AMOUNT());
			this.setList_slipTAX_AMOUNT_1(struct.getList_slipTAX_AMOUNT_1());
			this.setList_slipTAX_AMOUNT_2(struct.getList_slipTAX_AMOUNT_2());
			this.setList_slipTAX_AMOUNT_3(struct.getList_slipTAX_AMOUNT_3());
			this.setList_slipOWN_CUR_TAXCREDIT_SALES_AMOUNT(struct.getList_slipOWN_CUR_TAXCREDIT_SALES_AMOUNT());
			this.setList_selectSHIP_ODR_NO(struct.getList_selectSHIP_ODR_NO());
			this.setList_selectSLIP_CD(struct.getList_selectSLIP_CD());
			this.setList_selectSALES_TYP(struct.getList_selectSALES_TYP());
			this.setList_selectCUST_CD(struct.getList_selectCUST_CD());
			this.setList_selectITEM_CD(struct.getList_selectITEM_CD());
			this.setList_selectITEM_NAME(struct.getList_selectITEM_NAME());
			this.setList_selectCUST_ODR_NO(struct.getList_selectCUST_ODR_NO());
			this.setList_selectSALES_DATE(struct.getList_selectSALES_DATE());
			this.setList_selectSALES_DEPT_CD(struct.getList_selectSALES_DEPT_CD());
			this.setList_selectVEND_CD(struct.getList_selectVEND_CD());
			this.setList_selectPRD_ODR_PLACE_CD(struct.getList_selectPRD_ODR_PLACE_CD());
			this.setList_selectCUST_CHRG_PSN_CD(struct.getList_selectCUST_CHRG_PSN_CD());
			this.setList_selectODR_ACPT_PSN_CD(struct.getList_selectODR_ACPT_PSN_CD());
			this.setList_selectSALES_QTY(struct.getList_selectSALES_QTY());
			this.setList_selectSALES_UNIT_PRICE(struct.getList_selectSALES_UNIT_PRICE());
			this.setList_selectUNIT_CD(struct.getList_selectUNIT_CD());
			this.setList_selectSALES_AMOUNT(struct.getList_selectSALES_AMOUNT());
			this.setList_selectSALES_AMOUNT_EXCH_RATES(struct.getList_selectSALES_AMOUNT_EXCH_RATES());
			this.setList_selectINSPC_ACPT_DATE(struct.getList_selectINSPC_ACPT_DATE());
			this.setList_selectINSPC_ACPT_QTY(struct.getList_selectINSPC_ACPT_QTY());
			this.setList_selectEXTERNAL_TAX_SALES_AMOUNT(struct.getList_selectEXTERNAL_TAX_SALES_AMOUNT());
			this.setList_selectINTERNAL_TAX_SALES_AMOUNT(struct.getList_selectINTERNAL_TAX_SALES_AMOUNT());
			this.setList_selectTAXFREE_SALES_AMOUNT(struct.getList_selectTAXFREE_SALES_AMOUNT());
			this.setList_selectTAX_CREDIT_SALES_AMOUNT(struct.getList_selectTAX_CREDIT_SALES_AMOUNT());
			this.setList_selectEXTERNAL_TAX_AMOUNT(struct.getList_selectEXTERNAL_TAX_AMOUNT());
			this.setList_selectINTERNAL_TAX_AMOUNT(struct.getList_selectINTERNAL_TAX_AMOUNT());
			this.setList_selectTAX_AMOUNT_1(struct.getList_selectTAX_AMOUNT_1());
			this.setList_selectTAX_AMOUNT_2(struct.getList_selectTAX_AMOUNT_2());
			this.setList_selectTAX_AMOUNT_3(struct.getList_selectTAX_AMOUNT_3());
			this.setList_selectOWN_CUR_TAXCREDIT_SALES_AMOUNT(struct.getList_selectOWN_CUR_TAXCREDIT_SALES_AMOUNT());
			this.setList_selectORG_SLIP_CD(struct.getList_selectORG_SLIP_CD());
			this.setList_selectCURRNCY_CD(struct.getList_selectCURRNCY_CD());
			this.setList_selectSPCL_PRICE_CO(struct.getList_selectSPCL_PRICE_CO());
			this.setList_selectREMARKS(struct.getList_selectREMARKS());
			this.setList_selectINSPC_ACPT_TYP(struct.getList_selectINSPC_ACPT_TYP());
			this.setList_selectSTATUS(struct.getList_selectSTATUS());
			this.setList_l_h_SALES_SEQ_NO(struct.getList_l_h_SALES_SEQ_NO());
			this.setList_salesEXTERNAL_TAX_SALES_AMOUNT(struct.getList_salesEXTERNAL_TAX_SALES_AMOUNT());
			this.setList_salesINTERNAL_TAX_SALES_AMOUNT(struct.getList_salesINTERNAL_TAX_SALES_AMOUNT());
			this.setList_salesTAXFREE_SALES_AMOUNT(struct.getList_salesTAXFREE_SALES_AMOUNT());
			this.setList_salesTAX_CREDIT_SALES_AMOUNT(struct.getList_salesTAX_CREDIT_SALES_AMOUNT());
			this.setList_salesEXTERNAL_TAX_AMOUNT(struct.getList_salesEXTERNAL_TAX_AMOUNT());
			this.setList_salesINTERNAL_TAX_AMOUNT(struct.getList_salesINTERNAL_TAX_AMOUNT());
			this.setList_salesTAX_AMOUNT_1(struct.getList_salesTAX_AMOUNT_1());
			this.setList_salesTAX_AMOUNT_2(struct.getList_salesTAX_AMOUNT_2());
			this.setList_salesTAX_AMOUNT_3(struct.getList_salesTAX_AMOUNT_3());
			this.setList_salesOWN_CUR_TAXCREDIT_SALES_AMOUNT(struct.getList_salesOWN_CUR_TAXCREDIT_SALES_AMOUNT());
			this.setList_SLIP_CD(struct.getList_SLIP_CD());
			this.setList_COUNT(struct.getList_COUNT());
			this.setList_ROW_COUNT(struct.getList_ROW_COUNT());
			this.setList_insertSLIP_CD(struct.getList_insertSLIP_CD());
			this.setList_l_h_SHIP_ODR_NO(struct.getList_l_h_SHIP_ODR_NO());
			this.setList_ORGNAL_SLIP_CD(struct.getList_ORGNAL_SLIP_CD());
			this.setList_l_h_SHIP_SEQ_NO(struct.getList_l_h_SHIP_SEQ_NO());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_TAX_CD_1(struct.getList_TAX_CD_1());
			this.setList_TAX_CD_2(struct.getList_TAX_CD_2());
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
			this.setList_SLIP_DATE(struct.getList_SLIP_DATE());
			this.setList_SUM_EXTERNAL_TAX_SALES_AMOUNT(struct.getList_SUM_EXTERNAL_TAX_SALES_AMOUNT());
			this.setList_SUM_INTERNAL_TAX_SALES_AMOUNT(struct.getList_SUM_INTERNAL_TAX_SALES_AMOUNT());
			this.setList_SUM_TAXFREE_SALES_AMOUNT(struct.getList_SUM_TAXFREE_SALES_AMOUNT());
			this.setList_SUM_TAX_CREDIT_SALES_AMOUNT(struct.getList_SUM_TAX_CREDIT_SALES_AMOUNT());
			this.setList_SUM_EXTERNAL_TAX_AMOUNT(struct.getList_SUM_EXTERNAL_TAX_AMOUNT());
			this.setList_SUM_INTERNAL_TAX_AMOUNT(struct.getList_SUM_INTERNAL_TAX_AMOUNT());
			this.setList_SUM_TAX_AMOUNT_1(struct.getList_SUM_TAX_AMOUNT_1());
			this.setList_SUM_TAX_AMOUNT_2(struct.getList_SUM_TAX_AMOUNT_2());
			this.setList_SUM_TAX_AMOUNT_3(struct.getList_SUM_TAX_AMOUNT_3());
			this.setList_SUM_OWN_CUR_TAXCREDIT_SALES_AMOUNT(struct.getList_SUM_OWN_CUR_TAXCREDIT_SALES_AMOUNT());
			this.setList_SEL_SLIP_CD(struct.getList_SEL_SLIP_CD());
			this.setList_SEL_SHIP_CD(struct.getList_SEL_SHIP_CD());
		}
	}

	/**
	 * �I�u�W�F�N�g�̕�����\����Ԃ��܂��B
	 * �����ł́AgetXXXX�Ŏ擾�ł��邱�̃N���X�̑����l�i���X�g�͏����j��Ԃ��܂��B
	 * @return �I�u�W�F�N�g�̕�����\��
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
	// �����l��`
	// �ȉ��ɏ������Ɏg���萔�̎Q�l�Ƃ��čĐ����̂��тɎ����I�ɑS�����o�[�̃T���v�����R�����g�A�E�g���ďo�͂��Ă��܂��B
/*
	// �� 1 �ϐ������l�F i_h_UPDATE_FLG


	final static String i_h_UPDATE_FLG = null;

	// �� 2 �ϐ������l�F i_r_SEL_PTN1


	final static String i_r_SEL_PTN1 = null;

	// �� 3 �ϐ������l�F i_r_SEL_PTN2


	final static String i_r_SEL_PTN2 = null;

	// �� 4 �ϐ������l�F i_INSPC_ACPT_TYP


	final static String i_INSPC_ACPT_TYP = null;

	// �� 5 �ϐ������l�F i_SHIP_DLV_DATE


	final static String i_SHIP_DLV_DATE = null;

	// �� 6 �ϐ������l�F i_l_STATUS


	final static String i_l_STATUS = null;

	// �� 7 �ϐ������l�F i_l_h_STATUS_CD


	final static String i_l_h_STATUS_CD = null;

	// �� 8 �ϐ������l�F i_l_ODR_SCDL_DLV_DATE


	final static String i_l_ODR_SCDL_DLV_DATE = null;

	// �� 9 �ϐ������l�F i_l_SHIP_SCDL_DLV_DATE


	final static String i_l_SHIP_SCDL_DLV_DATE = null;

	// �� 10 �ϐ������l�F i_h_TAX_CD


	final static String i_h_TAX_CD = null;

	// �� 11 �ϐ������l�F i_l_h_SHIP_ODR_AMOUNT


	final static String i_l_h_SHIP_ODR_AMOUNT = null;

	// �� 12 �ϐ������l�F i_l_h_SALES_AMOUNT


	final static String i_l_h_SALES_AMOUNT = null;

	// �� 13 �ϐ������l�F i_l_h_AI_AR_IF_FLG


	final static String i_l_h_AI_AR_IF_FLG = null;

	// �� 14 �ϐ������l�F i_l_h_TAX_DESINATED_SHIP_DATE


	final static String i_l_h_TAX_DESINATED_SHIP_DATE = null;

	// �� 15 �ϐ������l�F i_l_h_SALES_SLIP_CD


	final static String i_l_h_SALES_SLIP_CD = null;

	// �� 16 �ϐ������l�F i_l_h_UPDATE_FLG


	final static String i_l_h_UPDATE_FLG = null;

	// �� 17 �ϐ������l�F i_h_SLIP_CTRL_GRP


	final static String i_h_SLIP_CTRL_GRP = null;

	// �� 18 �ϐ������l�F i_h_ODR_NO


	final static String i_h_ODR_NO = null;

	// �� 19 �ϐ������l�F i_CUST_ODR_NO


	final static String i_CUST_ODR_NO = null;

	// �� 20 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 21 �ϐ������l�F i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// �� 22 �ϐ������l�F i_CUST_CD


	final static String i_CUST_CD = null;

	// �� 23 �ϐ������l�F i_CUST_NAME


	final static String i_CUST_NAME = null;

	// �� 24 �ϐ������l�F i_CUST_ITEM_CD


	final static String i_CUST_ITEM_CD = null;

	// �� 25 �ϐ������l�F i_CUST_ITEM_NAME


	final static String i_CUST_ITEM_NAME = null;

	// �� 26 �ϐ������l�F i_ODR_ACPT_DATE


	final static String i_ODR_ACPT_DATE = null;

	// �� 27 �ϐ������l�F i_DESINATED_DLV_DATE


	final static String i_DESINATED_DLV_DATE = null;

	// �� 28 �ϐ������l�F i_ODR_UNIT_PRICE


	final static String i_ODR_UNIT_PRICE = null;

	// �� 29 �ϐ������l�F i_ODR_UNIT_CD


	final static String i_ODR_UNIT_CD = null;

	// �� 30 �ϐ������l�F i_ODR_QTY


	final static String i_ODR_QTY = null;

	// �� 31 �ϐ������l�F i_TAX_CD


	final static String i_TAX_CD = null;

	// �� 32 �ϐ������l�F i_ODR_AMOUNT


	final static String i_ODR_AMOUNT = null;

	// �� 33 �ϐ������l�F i_ODR_AMOUNT_UNIT_CD


	final static String i_ODR_AMOUNT_UNIT_CD = null;

	// �� 34 �ϐ������l�F i_h_INSPC_ACPT_TYP


	final static String i_h_INSPC_ACPT_TYP = null;

	// �� 35 �ϐ������l�F i_h_CURRNCY_CD


	final static String i_h_CURRNCY_CD = null;

	// �� 36 �ϐ������l�F i_h_EXCH_TYP


	final static String i_h_EXCH_TYP = null;

	// �� 37 �ϐ������l�F i_h_PRICE_ROUND_TYP


	final static String i_h_PRICE_ROUND_TYP = null;

	// �� 38 �ϐ������l�F i_h_TRANSPORT_LT


	final static String i_h_TRANSPORT_LT = null;

	// �� 39 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 40 �ϐ������l�F i_h_MODIFY_COUNT


	final static String i_h_MODIFY_COUNT = null;

	// �� 41 �ϐ������l�F i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// �� 42 �ϐ������l�F i_ODR_NO


	final static String i_ODR_NO = null;

	// �� 43 �ϐ������l�F i_l_ODR_ODR_NO


	final static String i_l_ODR_ODR_NO = null;

	// �� 44 �ϐ������l�F i_l_JOB_ODR_CD


	final static String i_l_JOB_ODR_CD = null;

	// �� 45 �ϐ������l�F i_l_PART_DLV_SEQ_NO


	final static String i_l_PART_DLV_SEQ_NO = null;

	// �� 46 �ϐ������l�F i_l_DLV_ODR_NO


	final static String i_l_DLV_ODR_NO = null;

	// �� 47 �ϐ������l�F i_l_SHIP_ODR_SLIP_CD


	final static String i_l_SHIP_ODR_SLIP_CD = null;

	// �� 48 �ϐ������l�F i_l_DESINATED_SHIP_DATE


	final static String i_l_DESINATED_SHIP_DATE = null;

	// �� 49 �ϐ������l�F i_l_SCDL_DLV_DATE


	final static String i_l_SCDL_DLV_DATE = null;

	// �� 50 �ϐ������l�F i_l_SHIP_ODR_NO


	final static String i_l_SHIP_ODR_NO = null;

	// �� 51 �ϐ������l�F i_l_ODR_AMOUNT


	final static String i_l_ODR_AMOUNT = null;

	// �� 52 �ϐ������l�F i_l_SHIP_DATE


	final static String i_l_SHIP_DATE = null;

	// �� 53 �ϐ������l�F i_l_SHIP_ODR_AMOUNT


	final static String i_l_SHIP_ODR_AMOUNT = null;

	// �� 54 �ϐ������l�F i_l_SHIP_SEQ_NO


	final static String i_l_SHIP_SEQ_NO = null;

	// �� 55 �ϐ������l�F i_l_SALES_DATE


	final static String i_l_SALES_DATE = null;

	// �� 56 �ϐ������l�F i_l_SALES_AMOUNT


	final static String i_l_SALES_AMOUNT = null;

	// �� 57 �ϐ������l�F i_l_AI_AR_IF_FLG


	final static String i_l_AI_AR_IF_FLG = null;

	// �� 58 �ϐ������l�F i_l_SALES_SEQ_NO


	final static String i_l_SALES_SEQ_NO = null;

	// �� 59 �ϐ������l�F i_l_SALES_SLIP_CD


	final static String i_l_SALES_SLIP_CD = null;

	// �� 60 �ϐ������l�F i_l_SALES_STATUS


	final static String i_l_SALES_STATUS = null;

	// �� 61 �ϐ������l�F i_l_AR_SLIP_CD


	final static String i_l_AR_SLIP_CD = null;

	// �� 62 �ϐ������l�F i_l_AR_TRN_SLIP_CD


	final static String i_l_AR_TRN_SLIP_CD = null;

	// �� 63 �ϐ������l�F i_l_h_INSPC_ACPT_DATE


	final static String i_l_h_INSPC_ACPT_DATE = null;

	// �� 64 �ϐ������l�F i_l_h_AR_INSPC_ACPT_DATE


	final static String i_l_h_AR_INSPC_ACPT_DATE = null;

	// �� 65 �ϐ������l�F i_l_h_AR_SALES_AMOUNT


	final static String i_l_h_AR_SALES_AMOUNT = null;

	// �� 66 �ϐ������l�F i_l_h_AR_TRN_INSPC_ACPT_DATE


	final static String i_l_h_AR_TRN_INSPC_ACPT_DATE = null;

	// �� 67 �ϐ������l�F i_l_h_AR_TRN_SALES_AMOUNT


	final static String i_l_h_AR_TRN_SALES_AMOUNT = null;

	// �� 68 �ϐ������l�F i_AR_STATUS


	final static String i_AR_STATUS = null;

	// �� 69 �ϐ������l�F i_AR_TRN_STATUS


	final static String i_AR_TRN_STATUS = null;

	// �� 70 �ϐ������l�F i_SLIP_CTRL_GRP


	final static String i_SLIP_CTRL_GRP = null;

	// �� 71 �ϐ������l�F i_OPTION_ID


	final static String i_OPTION_ID = null;

	// �� 72 �ϐ������l�F i_CODE


	final static String i_CODE = null;

	// �� 73 �ϐ������l�F i_CREATED_BY


	final static String i_CREATED_BY = null;

	// �� 74 �ϐ������l�F i_CREATED_PRG_NM


	final static String i_CREATED_PRG_NM = null;

	// �� 75 �ϐ������l�F i_slipSHIP_ODR_AMOUNT


	final static String i_slipSHIP_ODR_AMOUNT = null;

	// �� 76 �ϐ������l�F i_slipTAX_AMOUNT


	final static String i_slipTAX_AMOUNT = null;

	// �� 77 �ϐ������l�F i_slipSHIP_ODR_AMOUNT_TAX


	final static String i_slipSHIP_ODR_AMOUNT_TAX = null;

	// �� 78 �ϐ������l�F i_slipEXTERNAL_TAX_SALES_AMOUNT


	final static String i_slipEXTERNAL_TAX_SALES_AMOUNT = null;

	// �� 79 �ϐ������l�F i_slipINTERNAL_TAX_SALES_AMOUNT


	final static String i_slipINTERNAL_TAX_SALES_AMOUNT = null;

	// �� 80 �ϐ������l�F i_slipTAXFREE_SALES_AMOUNT


	final static String i_slipTAXFREE_SALES_AMOUNT = null;

	// �� 81 �ϐ������l�F i_slipTAX_CREDIT_SALES_AMOUNT


	final static String i_slipTAX_CREDIT_SALES_AMOUNT = null;

	// �� 82 �ϐ������l�F i_slipEXTERNAL_TAX_AMOUNT


	final static String i_slipEXTERNAL_TAX_AMOUNT = null;

	// �� 83 �ϐ������l�F i_slipINTERNAL_TAX_AMOUNT


	final static String i_slipINTERNAL_TAX_AMOUNT = null;

	// �� 84 �ϐ������l�F i_slipTAX_AMOUNT_1


	final static String i_slipTAX_AMOUNT_1 = null;

	// �� 85 �ϐ������l�F i_slipTAX_AMOUNT_2


	final static String i_slipTAX_AMOUNT_2 = null;

	// �� 86 �ϐ������l�F i_slipTAX_AMOUNT_3


	final static String i_slipTAX_AMOUNT_3 = null;

	// �� 87 �ϐ������l�F i_slipOWN_CUR_TAXCREDIT_SALES_AMOUNT


	final static String i_slipOWN_CUR_TAXCREDIT_SALES_AMOUNT = null;

	// �� 88 �ϐ������l�F i_selectSHIP_ODR_NO


	final static String i_selectSHIP_ODR_NO = null;

	// �� 89 �ϐ������l�F i_selectSLIP_CD


	final static String i_selectSLIP_CD = null;

	// �� 90 �ϐ������l�F i_selectSALES_TYP


	final static String i_selectSALES_TYP = null;

	// �� 91 �ϐ������l�F i_selectCUST_CD


	final static String i_selectCUST_CD = null;

	// �� 92 �ϐ������l�F i_selectITEM_CD


	final static String i_selectITEM_CD = null;

	// �� 93 �ϐ������l�F i_selectITEM_NAME


	final static String i_selectITEM_NAME = null;

	// �� 94 �ϐ������l�F i_selectCUST_ODR_NO


	final static String i_selectCUST_ODR_NO = null;

	// �� 95 �ϐ������l�F i_selectSALES_DATE


	final static String i_selectSALES_DATE = null;

	// �� 96 �ϐ������l�F i_selectSALES_DEPT_CD


	final static String i_selectSALES_DEPT_CD = null;

	// �� 97 �ϐ������l�F i_selectVEND_CD


	final static String i_selectVEND_CD = null;

	// �� 98 �ϐ������l�F i_selectPRD_ODR_PLACE_CD


	final static String i_selectPRD_ODR_PLACE_CD = null;

	// �� 99 �ϐ������l�F i_selectCUST_CHRG_PSN_CD


	final static String i_selectCUST_CHRG_PSN_CD = null;

	// �� 100 �ϐ������l�F i_selectODR_ACPT_PSN_CD


	final static String i_selectODR_ACPT_PSN_CD = null;

	// �� 101 �ϐ������l�F i_selectSALES_QTY


	final static String i_selectSALES_QTY = null;

	// �� 102 �ϐ������l�F i_selectSALES_UNIT_PRICE


	final static String i_selectSALES_UNIT_PRICE = null;

	// �� 103 �ϐ������l�F i_selectUNIT_CD


	final static String i_selectUNIT_CD = null;

	// �� 104 �ϐ������l�F i_selectSALES_AMOUNT


	final static String i_selectSALES_AMOUNT = null;

	// �� 105 �ϐ������l�F i_selectSALES_AMOUNT_EXCH_RATES


	final static String i_selectSALES_AMOUNT_EXCH_RATES = null;

	// �� 106 �ϐ������l�F i_selectINSPC_ACPT_DATE


	final static String i_selectINSPC_ACPT_DATE = null;

	// �� 107 �ϐ������l�F i_selectINSPC_ACPT_QTY


	final static String i_selectINSPC_ACPT_QTY = null;

	// �� 108 �ϐ������l�F i_selectEXTERNAL_TAX_SALES_AMOUNT


	final static String i_selectEXTERNAL_TAX_SALES_AMOUNT = null;

	// �� 109 �ϐ������l�F i_selectINTERNAL_TAX_SALES_AMOUNT


	final static String i_selectINTERNAL_TAX_SALES_AMOUNT = null;

	// �� 110 �ϐ������l�F i_selectTAXFREE_SALES_AMOUNT


	final static String i_selectTAXFREE_SALES_AMOUNT = null;

	// �� 111 �ϐ������l�F i_selectTAX_CREDIT_SALES_AMOUNT


	final static String i_selectTAX_CREDIT_SALES_AMOUNT = null;

	// �� 112 �ϐ������l�F i_selectEXTERNAL_TAX_AMOUNT


	final static String i_selectEXTERNAL_TAX_AMOUNT = null;

	// �� 113 �ϐ������l�F i_selectINTERNAL_TAX_AMOUNT


	final static String i_selectINTERNAL_TAX_AMOUNT = null;

	// �� 114 �ϐ������l�F i_selectTAX_AMOUNT_1


	final static String i_selectTAX_AMOUNT_1 = null;

	// �� 115 �ϐ������l�F i_selectTAX_AMOUNT_2


	final static String i_selectTAX_AMOUNT_2 = null;

	// �� 116 �ϐ������l�F i_selectTAX_AMOUNT_3


	final static String i_selectTAX_AMOUNT_3 = null;

	// �� 117 �ϐ������l�F i_selectOWN_CUR_TAXCREDIT_SALES_AMOUNT


	final static String i_selectOWN_CUR_TAXCREDIT_SALES_AMOUNT = null;

	// �� 118 �ϐ������l�F i_selectORG_SLIP_CD


	final static String i_selectORG_SLIP_CD = null;

	// �� 119 �ϐ������l�F i_selectCURRNCY_CD


	final static String i_selectCURRNCY_CD = null;

	// �� 120 �ϐ������l�F i_selectSPCL_PRICE_CO


	final static String i_selectSPCL_PRICE_CO = null;

	// �� 121 �ϐ������l�F i_selectREMARKS


	final static String i_selectREMARKS = null;

	// �� 122 �ϐ������l�F i_selectINSPC_ACPT_TYP


	final static String i_selectINSPC_ACPT_TYP = null;

	// �� 123 �ϐ������l�F i_selectSTATUS


	final static String i_selectSTATUS = null;

	// �� 124 �ϐ������l�F i_l_h_SALES_SEQ_NO


	final static String i_l_h_SALES_SEQ_NO = null;

	// �� 125 �ϐ������l�F i_salesEXTERNAL_TAX_SALES_AMOUNT


	final static String i_salesEXTERNAL_TAX_SALES_AMOUNT = null;

	// �� 126 �ϐ������l�F i_salesINTERNAL_TAX_SALES_AMOUNT


	final static String i_salesINTERNAL_TAX_SALES_AMOUNT = null;

	// �� 127 �ϐ������l�F i_salesTAXFREE_SALES_AMOUNT


	final static String i_salesTAXFREE_SALES_AMOUNT = null;

	// �� 128 �ϐ������l�F i_salesTAX_CREDIT_SALES_AMOUNT


	final static String i_salesTAX_CREDIT_SALES_AMOUNT = null;

	// �� 129 �ϐ������l�F i_salesEXTERNAL_TAX_AMOUNT


	final static String i_salesEXTERNAL_TAX_AMOUNT = null;

	// �� 130 �ϐ������l�F i_salesINTERNAL_TAX_AMOUNT


	final static String i_salesINTERNAL_TAX_AMOUNT = null;

	// �� 131 �ϐ������l�F i_salesTAX_AMOUNT_1


	final static String i_salesTAX_AMOUNT_1 = null;

	// �� 132 �ϐ������l�F i_salesTAX_AMOUNT_2


	final static String i_salesTAX_AMOUNT_2 = null;

	// �� 133 �ϐ������l�F i_salesTAX_AMOUNT_3


	final static String i_salesTAX_AMOUNT_3 = null;

	// �� 134 �ϐ������l�F i_salesOWN_CUR_TAXCREDIT_SALES_AMOUNT


	final static String i_salesOWN_CUR_TAXCREDIT_SALES_AMOUNT = null;

	// �� 135 �ϐ������l�F i_SLIP_CD


	final static String i_SLIP_CD = null;

	// �� 136 �ϐ������l�F i_COUNT


	final static String i_COUNT = null;

	// �� 137 �ϐ������l�F i_ROW_COUNT


	final static String i_ROW_COUNT = null;

	// �� 138 �ϐ������l�F i_insertSLIP_CD


	final static String i_insertSLIP_CD = null;

	// �� 139 �ϐ������l�F i_l_h_SHIP_ODR_NO


	final static String i_l_h_SHIP_ODR_NO = null;

	// �� 140 �ϐ������l�F i_ORGNAL_SLIP_CD


	final static String i_ORGNAL_SLIP_CD = null;

	// �� 141 �ϐ������l�F i_l_h_SHIP_SEQ_NO


	final static String i_l_h_SHIP_SEQ_NO = null;

	// �� 142 �ϐ������l�F i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// �� 143 �ϐ������l�F i_TAX_CD_1


	final static String i_TAX_CD_1 = null;

	// �� 144 �ϐ������l�F i_TAX_CD_2


	final static String i_TAX_CD_2 = null;

	// �� 145 �ϐ������l�F i_EXTERNAL_TAX_SALES_AMOUNT


	final static String i_EXTERNAL_TAX_SALES_AMOUNT = null;

	// �� 146 �ϐ������l�F i_INTERNAL_TAX_SALES_AMOUNT


	final static String i_INTERNAL_TAX_SALES_AMOUNT = null;

	// �� 147 �ϐ������l�F i_TAXFREE_SALES_AMOUNT


	final static String i_TAXFREE_SALES_AMOUNT = null;

	// �� 148 �ϐ������l�F i_TAX_CREDIT_SALES_AMOUNT


	final static String i_TAX_CREDIT_SALES_AMOUNT = null;

	// �� 149 �ϐ������l�F i_EXTERNAL_TAX_AMOUNT


	final static String i_EXTERNAL_TAX_AMOUNT = null;

	// �� 150 �ϐ������l�F i_INTERNAL_TAX_AMOUNT


	final static String i_INTERNAL_TAX_AMOUNT = null;

	// �� 151 �ϐ������l�F i_TAX_AMOUNT_1


	final static String i_TAX_AMOUNT_1 = null;

	// �� 152 �ϐ������l�F i_TAX_AMOUNT_2


	final static String i_TAX_AMOUNT_2 = null;

	// �� 153 �ϐ������l�F i_TAX_AMOUNT_3


	final static String i_TAX_AMOUNT_3 = null;

	// �� 154 �ϐ������l�F i_OWN_CUR_TAXCREDIT_SALES_AMOUNT


	final static String i_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;

	// �� 155 �ϐ������l�F i_SLIP_DATE


	final static String i_SLIP_DATE = null;

	// �� 156 �ϐ������l�F i_SUM_EXTERNAL_TAX_SALES_AMOUNT


	final static String i_SUM_EXTERNAL_TAX_SALES_AMOUNT = null;

	// �� 157 �ϐ������l�F i_SUM_INTERNAL_TAX_SALES_AMOUNT


	final static String i_SUM_INTERNAL_TAX_SALES_AMOUNT = null;

	// �� 158 �ϐ������l�F i_SUM_TAXFREE_SALES_AMOUNT


	final static String i_SUM_TAXFREE_SALES_AMOUNT = null;

	// �� 159 �ϐ������l�F i_SUM_TAX_CREDIT_SALES_AMOUNT


	final static String i_SUM_TAX_CREDIT_SALES_AMOUNT = null;

	// �� 160 �ϐ������l�F i_SUM_EXTERNAL_TAX_AMOUNT


	final static String i_SUM_EXTERNAL_TAX_AMOUNT = null;

	// �� 161 �ϐ������l�F i_SUM_INTERNAL_TAX_AMOUNT


	final static String i_SUM_INTERNAL_TAX_AMOUNT = null;

	// �� 162 �ϐ������l�F i_SUM_TAX_AMOUNT_1


	final static String i_SUM_TAX_AMOUNT_1 = null;

	// �� 163 �ϐ������l�F i_SUM_TAX_AMOUNT_2


	final static String i_SUM_TAX_AMOUNT_2 = null;

	// �� 164 �ϐ������l�F i_SUM_TAX_AMOUNT_3


	final static String i_SUM_TAX_AMOUNT_3 = null;

	// �� 165 �ϐ������l�F i_SUM_OWN_CUR_TAXCREDIT_SALES_AMOUNT


	final static String i_SUM_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;

	// �� 166 �ϐ������l�F i_SEL_SLIP_CD


	final static String i_SEL_SLIP_CD = null;

	// �� 167 �ϐ������l�F i_SEL_SHIP_CD


	final static String i_SEL_SHIP_CD = null;

*/

	//{{user_implement_code
		// TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
		// �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B


	/**
	 * ������
	 *
	 */
	public void initialize()
	{

		clear();

	}
		// TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
