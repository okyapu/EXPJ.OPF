/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KR0070/src/com/nec/jp/orteus/metamorBase/KR0070/KZ0010P001Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.KR0070;

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
//}}user_implement_code_header

public class KZ0010P001Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** �� 2 �ϐ��F m_SLIP_CTRL_GRP */
	public String m_SLIP_CTRL_GRP = null;
	/** �� 3 �ϐ��F m_SLIP_TRN_CD */
	public String m_SLIP_TRN_CD = null;
	/** �� 4 �ϐ��F m_STOCK_CLASS_CD */
	public String m_STOCK_CLASS_CD = null;
	/** �� 5 �ϐ��F m_BALANCE_CLASS_CD */
	public String m_BALANCE_CLASS_CD = null;
	/** �� 6 �ϐ��F m_HOME_CUR_CD */
	public String m_HOME_CUR_CD = null;
	/** �� 7 �ϐ��F m_SALES_DATE */
	public String m_SALES_DATE = null;
	/** �� 8 �ϐ��F m_SALES_DEPT_CD */
	public String m_SALES_DEPT_CD = null;
	/** �� 9 �ϐ��F m_CUST_CHRG_PSN_CD */
	public String m_CUST_CHRG_PSN_CD = null;
	/** �� 10 �ϐ��F m_CUST_CD */
	public String m_CUST_CD = null;
	/** �� 11 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 12 �ϐ��F m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** �� 13 �ϐ��F m_SALES_CUST_ODR_NO */
	public String m_SALES_CUST_ODR_NO = null;
	/** �� 14 �ϐ��F m_SALES_AMOUNT */
	public String m_SALES_AMOUNT = null;
	/** �� 15 �ϐ��F m_REMARKS */
	public String m_REMARKS = null;
	/** �� 16 �ϐ��F m_SALES_AMOUNT_EXCH_RATES */
	public String m_SALES_AMOUNT_EXCH_RATES = null;
	/** �� 17 �ϐ��F m_OWN_CUR_TAXCREDIT_SALES_AMOUNT */
	public String m_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;
	/** �� 18 �ϐ��F m_SALES_UNIT_PRICE */
	public String m_SALES_UNIT_PRICE = null;
	/** �� 19 �ϐ��F m_SALES_QTY */
	public String m_SALES_QTY = null;
	/** �� 20 �ϐ��F m_INSPC_ACPT_DATE */
	public String m_INSPC_ACPT_DATE = null;
	/** �� 21 �ϐ��F m_INSPC_ACPT_QTY */
	public String m_INSPC_ACPT_QTY = null;
	/** �� 22 �ϐ��F m_SLIP_CD */
	public String m_SLIP_CD = null;
	/** �� 23 �ϐ��F m_DLV_LOC_CD */
	public String m_DLV_LOC_CD = null;
	/** �� 24 �ϐ��F m_SHIP_DATE */
	public String m_SHIP_DATE = null;
	/** �� 25 �ϐ��F m_CUST_ODR_NO */
	public String m_CUST_ODR_NO = null;
	/** �� 26 �ϐ��F m_ODR_NO */
	public String m_ODR_NO = null;
	/** �� 27 �ϐ��F m_CUST_ITEM_CD */
	public String m_CUST_ITEM_CD = null;
	/** �� 28 �ϐ��F m_PART_DLV_SEQ_NO */
	public String m_PART_DLV_SEQ_NO = null;
	/** �� 29 �ϐ��F m_SHIP_ODR_NO */
	public String m_SHIP_ODR_NO = null;
	/** �� 30 �ϐ��F m_INSPC_ACPT_INFO_IF_CTRL_NO */
	public String m_INSPC_ACPT_INFO_IF_CTRL_NO = null;
	/** �� 31 �ϐ��F m_DESINATED_SHIP_DATE */
	public String m_DESINATED_SHIP_DATE = null;
	/** �� 32 �ϐ��F m_SCDL_DLV_DATE */
	public String m_SCDL_DLV_DATE = null;
	/** �� 33 �ϐ��F m_ODR_ACPT_DATE */
	public String m_ODR_ACPT_DATE = null;
	/** �� 34 �ϐ��F m_CUS_DLV_CD */
	public String m_CUS_DLV_CD = null;
	/** �� 35 �ϐ��F m_CUS_DLV_KEY_CD */
	public String m_CUS_DLV_KEY_CD = null;
	/** �� 36 �ϐ��F m_SPCL_PRICE_TYP */
	public String m_SPCL_PRICE_TYP = null;
	/** �� 37 �ϐ��F m_ODR_CMPLT_FLG */
	public String m_ODR_CMPLT_FLG = null;
	/** �� 38 �ϐ��F m_SHIP_CNT */
	public String m_SHIP_CNT = null;
	/** �� 39 �ϐ��F m_T_ODR_TAX_CD */
	public String m_T_ODR_TAX_CD = null;
	/** �� 40 �ϐ��F m_UNIT_COST_TYP */
	public String m_UNIT_COST_TYP = null;
	/** �� 41 �ϐ��F m_CUST_NAME */
	public String m_CUST_NAME = null;
	/** �� 42 �ϐ��F m_TAX_CALC_TYP */
	public String m_TAX_CALC_TYP = null;
	/** �� 43 �ϐ��F m_TAX_APPLY_TYP */
	public String m_TAX_APPLY_TYP = null;
	/** �� 44 �ϐ��F m_TEMP_UNIT_PRICE_SALES_FLG */
	public String m_TEMP_UNIT_PRICE_SALES_FLG = null;
	/** �� 45 �ϐ��F m_CLAIM_CYCLE_TYP */
	public String m_CLAIM_CYCLE_TYP = null;
	/** �� 46 �ϐ��F m_RM_INP_TYP */
	public String m_RM_INP_TYP = null;
	/** �� 47 �ϐ��F m_CUR_CD */
	public String m_CUR_CD = null;
	/** �� 48 �ϐ��F m_EXCH_TYP */
	public String m_EXCH_TYP = null;
	/** �� 49 �ϐ��F m_TAX_CD */
	public String m_TAX_CD = null;
	/** �� 50 �ϐ��F m_CUST_VARIOUS_TYP */
	public String m_CUST_VARIOUS_TYP = null;
	/** �� 51 �ϐ��F m_SLIP_PRINTING_TYP_1 */
	public String m_SLIP_PRINTING_TYP_1 = null;
	/** �� 52 �ϐ��F m_SLIP_PRINTING_TYP_2 */
	public String m_SLIP_PRINTING_TYP_2 = null;
	/** �� 53 �ϐ��F m_SLIP_PRINTING_TYP_3 */
	public String m_SLIP_PRINTING_TYP_3 = null;
	/** �� 54 �ϐ��F m_SLIP_PRINTING_TYP_4 */
	public String m_SLIP_PRINTING_TYP_4 = null;
	/** �� 55 �ϐ��F m_SLIP_PRINTING_TYP_5 */
	public String m_SLIP_PRINTING_TYP_5 = null;
	/** �� 56 �ϐ��F m_PRICE_RANK_CD */
	public String m_PRICE_RANK_CD = null;
	/** �� 57 �ϐ��F m_INSPC_ACPT_TYP */
	public String m_INSPC_ACPT_TYP = null;
	/** �� 58 �ϐ��F m_SHIP_SLIP_ID */
	public String m_SHIP_SLIP_ID = null;
	/** �� 59 �ϐ��F m_CARRIAGE_CHARGE_TYP */
	public String m_CARRIAGE_CHARGE_TYP = null;
	/** �� 60 �ϐ��F m_BILL_ADDRESSEE_CD */
	public String m_BILL_ADDRESSEE_CD = null;
	/** �� 61 �ϐ��F m_STL_COND_CD */
	public String m_STL_COND_CD = null;
	/** �� 62 �ϐ��F m_DLV_LOC_NAME */
	public String m_DLV_LOC_NAME = null;
	/** �� 63 �ϐ��F m_ZIP_CD */
	public String m_ZIP_CD = null;
	/** �� 64 �ϐ��F m_ADDRESS_1 */
	public String m_ADDRESS_1 = null;
	/** �� 65 �ϐ��F m_ADDRESS_2 */
	public String m_ADDRESS_2 = null;
	/** �� 66 �ϐ��F m_CUST_ITEM_NAME */
	public String m_CUST_ITEM_NAME = null;
	/** �� 67 �ϐ��F m_EXCH_RATE */
	public String m_EXCH_RATE = null;
	/** �� 68 �ϐ��F m_SLIP_DATE */
	public String m_SLIP_DATE = null;
	/** �� 69 �ϐ��F m_SHIP_SLIP_CD */
	public String m_SHIP_SLIP_CD = null;
	/** �� 70 �ϐ��F m_EXTERNAL_TAX_SALES_AMOUNT */
	public String m_EXTERNAL_TAX_SALES_AMOUNT = null;
	/** �� 71 �ϐ��F m_INTERNAL_TAX_SALES_AMOUNT */
	public String m_INTERNAL_TAX_SALES_AMOUNT = null;
	/** �� 72 �ϐ��F m_TAXFREE_SALES_AMOUNT */
	public String m_TAXFREE_SALES_AMOUNT = null;
	/** �� 73 �ϐ��F m_TAX_CREDIT_SALES_AMOUNT */
	public String m_TAX_CREDIT_SALES_AMOUNT = null;
	/** �� 74 �ϐ��F m_EXTERNAL_TAX_AMOUNT */
	public String m_EXTERNAL_TAX_AMOUNT = null;
	/** �� 75 �ϐ��F m_INTERNAL_TAX_AMOUNT */
	public String m_INTERNAL_TAX_AMOUNT = null;
	/** �� 76 �ϐ��F m_TAX_AMOUNT_1 */
	public String m_TAX_AMOUNT_1 = null;
	/** �� 77 �ϐ��F m_TAX_AMOUNT_2 */
	public String m_TAX_AMOUNT_2 = null;
	/** �� 78 �ϐ��F m_TAX_AMOUNT_3 */
	public String m_TAX_AMOUNT_3 = null;
	/** �� 79 �ϐ��F m_STATUS */
	public String m_STATUS = null;
	/** �� 80 �ϐ��F m_EDI_DATA_TYP */
	public String m_EDI_DATA_TYP = null;
	/** �� 81 �ϐ��F m_OLD_TAX_RATE_1 */
	public String m_OLD_TAX_RATE_1 = null;
	/** �� 82 �ϐ��F m_OLD_TAX_RATE_2 */
	public String m_OLD_TAX_RATE_2 = null;
	/** �� 83 �ϐ��F m_OLD_TAX_RATE_3 */
	public String m_OLD_TAX_RATE_3 = null;
	/** �� 84 �ϐ��F m_NEW_TAX_RATE_START_DATE */
	public String m_NEW_TAX_RATE_START_DATE = null;
	/** �� 85 �ϐ��F m_NEW_TAX_RATE_1 */
	public String m_NEW_TAX_RATE_1 = null;
	/** �� 86 �ϐ��F m_NEW_TAX_RATE_2 */
	public String m_NEW_TAX_RATE_2 = null;
	/** �� 87 �ϐ��F m_NEW_TAX_RATE_3 */
	public String m_NEW_TAX_RATE_3 = null;
	/** �� 88 �ϐ��F m_ROUND_TYP */
	public String m_ROUND_TYP = null;
	/** �� 89 �ϐ��F m_DECIMAL_FIG */
	public String m_DECIMAL_FIG = null;
	/** �� 90 �ϐ��F m_SEQ_NO */
	public String m_SEQ_NO = null;
	/** �� 91 �ϐ��F m_LINE_NO */
	public String m_LINE_NO = null;
	/** �� 92 �ϐ��F m_LINE_TYP */
	public String m_LINE_TYP = null;
	/** �� 93 �ϐ��F m_COMM_CD */
	public String m_COMM_CD = null;
	/** �� 94 �ϐ��F m_COMM_NAME */
	public String m_COMM_NAME = null;
	/** �� 95 �ϐ��F m_SPEC */
	public String m_SPEC = null;
	/** �� 96 �ϐ��F m_TAX_CD_2 */
	public String m_TAX_CD_2 = null;
	/** �� 97 �ϐ��F m_INP_UNIT_PRICE */
	public String m_INP_UNIT_PRICE = null;
	/** �� 98 �ϐ��F m_UNIT_PRICE_TYP */
	public String m_UNIT_PRICE_TYP = null;
	/** �� 99 �ϐ��F m_SLIP_QTY */
	public String m_SLIP_QTY = null;
	/** �� 100 �ϐ��F m_PART_DLV_TIMES */
	public String m_PART_DLV_TIMES = null;
	/** �� 101 �ϐ��F m_PART_DLV_TYP */
	public String m_PART_DLV_TYP = null;
	/** �� 102 �ϐ��F m_CUST_COMM_CD */
	public String m_CUST_COMM_CD = null;
	/** �� 103 �ϐ��F m_CUST_COMM_NAME */
	public String m_CUST_COMM_NAME = null;
	/** �� 104 �ϐ��F m_CUST_ODR_SLIP_CD */
	public String m_CUST_ODR_SLIP_CD = null;
	/** �� 105 �ϐ��F m_CUST_UNIT_PRICE_TYP */
	public String m_CUST_UNIT_PRICE_TYP = null;
	/** �� 106 �ϐ��F m_OWN_CUR_SALES_AMOUNT */
	public String m_OWN_CUR_SALES_AMOUNT = null;
	/** �� 107 �ϐ��F m_STOCK_CTRL_FLG */
	public String m_STOCK_CTRL_FLG = null;
	/** �� 108 �ϐ��F m_DUMMY */
	public String m_DUMMY = null;
	/** �� 109 �ϐ��F m_SLIP_CD2 */
	public String m_SLIP_CD2 = null;
	/** �� 110 �ϐ��F m_SYSTEMDATE */
	public String m_SYSTEMDATE = null;
	/** �� 111 �ϐ��F m_SYSTEMUSER */
	public String m_SYSTEMUSER = null;
	/** �� 112 �ϐ��F m_PROGRAMID */
	public String m_PROGRAMID = null;
	/** �� 113 �ϐ��F m_DLV_CD */
	public String m_DLV_CD = null;
	/** �� 114 �ϐ��F m_DLV_KEY_CD */
	public String m_DLV_KEY_CD = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** �� 2 List�ϐ��F l_SLIP_CTRL_GRP */
	public List l_SLIP_CTRL_GRP = null;

	/** �� 3 List�ϐ��F l_SLIP_TRN_CD */
	public List l_SLIP_TRN_CD = null;

	/** �� 4 List�ϐ��F l_STOCK_CLASS_CD */
	public List l_STOCK_CLASS_CD = null;

	/** �� 5 List�ϐ��F l_BALANCE_CLASS_CD */
	public List l_BALANCE_CLASS_CD = null;

	/** �� 6 List�ϐ��F l_HOME_CUR_CD */
	public List l_HOME_CUR_CD = null;

	/** �� 7 List�ϐ��F l_SALES_DATE */
	public List l_SALES_DATE = null;

	/** �� 8 List�ϐ��F l_SALES_DEPT_CD */
	public List l_SALES_DEPT_CD = null;

	/** �� 9 List�ϐ��F l_CUST_CHRG_PSN_CD */
	public List l_CUST_CHRG_PSN_CD = null;

	/** �� 10 List�ϐ��F l_CUST_CD */
	public List l_CUST_CD = null;

	/** �� 11 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 12 List�ϐ��F l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** �� 13 List�ϐ��F l_SALES_CUST_ODR_NO */
	public List l_SALES_CUST_ODR_NO = null;

	/** �� 14 List�ϐ��F l_SALES_AMOUNT */
	public List l_SALES_AMOUNT = null;

	/** �� 15 List�ϐ��F l_REMARKS */
	public List l_REMARKS = null;

	/** �� 16 List�ϐ��F l_SALES_AMOUNT_EXCH_RATES */
	public List l_SALES_AMOUNT_EXCH_RATES = null;

	/** �� 17 List�ϐ��F l_OWN_CUR_TAXCREDIT_SALES_AMOUNT */
	public List l_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;

	/** �� 18 List�ϐ��F l_SALES_UNIT_PRICE */
	public List l_SALES_UNIT_PRICE = null;

	/** �� 19 List�ϐ��F l_SALES_QTY */
	public List l_SALES_QTY = null;

	/** �� 20 List�ϐ��F l_INSPC_ACPT_DATE */
	public List l_INSPC_ACPT_DATE = null;

	/** �� 21 List�ϐ��F l_INSPC_ACPT_QTY */
	public List l_INSPC_ACPT_QTY = null;

	/** �� 22 List�ϐ��F l_SLIP_CD */
	public List l_SLIP_CD = null;

	/** �� 23 List�ϐ��F l_DLV_LOC_CD */
	public List l_DLV_LOC_CD = null;

	/** �� 24 List�ϐ��F l_SHIP_DATE */
	public List l_SHIP_DATE = null;

	/** �� 25 List�ϐ��F l_CUST_ODR_NO */
	public List l_CUST_ODR_NO = null;

	/** �� 26 List�ϐ��F l_ODR_NO */
	public List l_ODR_NO = null;

	/** �� 27 List�ϐ��F l_CUST_ITEM_CD */
	public List l_CUST_ITEM_CD = null;

	/** �� 28 List�ϐ��F l_PART_DLV_SEQ_NO */
	public List l_PART_DLV_SEQ_NO = null;

	/** �� 29 List�ϐ��F l_SHIP_ODR_NO */
	public List l_SHIP_ODR_NO = null;

	/** �� 30 List�ϐ��F l_INSPC_ACPT_INFO_IF_CTRL_NO */
	public List l_INSPC_ACPT_INFO_IF_CTRL_NO = null;

	/** �� 31 List�ϐ��F l_DESINATED_SHIP_DATE */
	public List l_DESINATED_SHIP_DATE = null;

	/** �� 32 List�ϐ��F l_SCDL_DLV_DATE */
	public List l_SCDL_DLV_DATE = null;

	/** �� 33 List�ϐ��F l_ODR_ACPT_DATE */
	public List l_ODR_ACPT_DATE = null;

	/** �� 34 List�ϐ��F l_CUS_DLV_CD */
	public List l_CUS_DLV_CD = null;

	/** �� 35 List�ϐ��F l_CUS_DLV_KEY_CD */
	public List l_CUS_DLV_KEY_CD = null;

	/** �� 36 List�ϐ��F l_SPCL_PRICE_TYP */
	public List l_SPCL_PRICE_TYP = null;

	/** �� 37 List�ϐ��F l_ODR_CMPLT_FLG */
	public List l_ODR_CMPLT_FLG = null;

	/** �� 38 List�ϐ��F l_SHIP_CNT */
	public List l_SHIP_CNT = null;

	/** �� 39 List�ϐ��F l_T_ODR_TAX_CD */
	public List l_T_ODR_TAX_CD = null;

	/** �� 40 List�ϐ��F l_UNIT_COST_TYP */
	public List l_UNIT_COST_TYP = null;

	/** �� 41 List�ϐ��F l_CUST_NAME */
	public List l_CUST_NAME = null;

	/** �� 42 List�ϐ��F l_TAX_CALC_TYP */
	public List l_TAX_CALC_TYP = null;

	/** �� 43 List�ϐ��F l_TAX_APPLY_TYP */
	public List l_TAX_APPLY_TYP = null;

	/** �� 44 List�ϐ��F l_TEMP_UNIT_PRICE_SALES_FLG */
	public List l_TEMP_UNIT_PRICE_SALES_FLG = null;

	/** �� 45 List�ϐ��F l_CLAIM_CYCLE_TYP */
	public List l_CLAIM_CYCLE_TYP = null;

	/** �� 46 List�ϐ��F l_RM_INP_TYP */
	public List l_RM_INP_TYP = null;

	/** �� 47 List�ϐ��F l_CUR_CD */
	public List l_CUR_CD = null;

	/** �� 48 List�ϐ��F l_EXCH_TYP */
	public List l_EXCH_TYP = null;

	/** �� 49 List�ϐ��F l_TAX_CD */
	public List l_TAX_CD = null;

	/** �� 50 List�ϐ��F l_CUST_VARIOUS_TYP */
	public List l_CUST_VARIOUS_TYP = null;

	/** �� 51 List�ϐ��F l_SLIP_PRINTING_TYP_1 */
	public List l_SLIP_PRINTING_TYP_1 = null;

	/** �� 52 List�ϐ��F l_SLIP_PRINTING_TYP_2 */
	public List l_SLIP_PRINTING_TYP_2 = null;

	/** �� 53 List�ϐ��F l_SLIP_PRINTING_TYP_3 */
	public List l_SLIP_PRINTING_TYP_3 = null;

	/** �� 54 List�ϐ��F l_SLIP_PRINTING_TYP_4 */
	public List l_SLIP_PRINTING_TYP_4 = null;

	/** �� 55 List�ϐ��F l_SLIP_PRINTING_TYP_5 */
	public List l_SLIP_PRINTING_TYP_5 = null;

	/** �� 56 List�ϐ��F l_PRICE_RANK_CD */
	public List l_PRICE_RANK_CD = null;

	/** �� 57 List�ϐ��F l_INSPC_ACPT_TYP */
	public List l_INSPC_ACPT_TYP = null;

	/** �� 58 List�ϐ��F l_SHIP_SLIP_ID */
	public List l_SHIP_SLIP_ID = null;

	/** �� 59 List�ϐ��F l_CARRIAGE_CHARGE_TYP */
	public List l_CARRIAGE_CHARGE_TYP = null;

	/** �� 60 List�ϐ��F l_BILL_ADDRESSEE_CD */
	public List l_BILL_ADDRESSEE_CD = null;

	/** �� 61 List�ϐ��F l_STL_COND_CD */
	public List l_STL_COND_CD = null;

	/** �� 62 List�ϐ��F l_DLV_LOC_NAME */
	public List l_DLV_LOC_NAME = null;

	/** �� 63 List�ϐ��F l_ZIP_CD */
	public List l_ZIP_CD = null;

	/** �� 64 List�ϐ��F l_ADDRESS_1 */
	public List l_ADDRESS_1 = null;

	/** �� 65 List�ϐ��F l_ADDRESS_2 */
	public List l_ADDRESS_2 = null;

	/** �� 66 List�ϐ��F l_CUST_ITEM_NAME */
	public List l_CUST_ITEM_NAME = null;

	/** �� 67 List�ϐ��F l_EXCH_RATE */
	public List l_EXCH_RATE = null;

	/** �� 68 List�ϐ��F l_SLIP_DATE */
	public List l_SLIP_DATE = null;

	/** �� 69 List�ϐ��F l_SHIP_SLIP_CD */
	public List l_SHIP_SLIP_CD = null;

	/** �� 70 List�ϐ��F l_EXTERNAL_TAX_SALES_AMOUNT */
	public List l_EXTERNAL_TAX_SALES_AMOUNT = null;

	/** �� 71 List�ϐ��F l_INTERNAL_TAX_SALES_AMOUNT */
	public List l_INTERNAL_TAX_SALES_AMOUNT = null;

	/** �� 72 List�ϐ��F l_TAXFREE_SALES_AMOUNT */
	public List l_TAXFREE_SALES_AMOUNT = null;

	/** �� 73 List�ϐ��F l_TAX_CREDIT_SALES_AMOUNT */
	public List l_TAX_CREDIT_SALES_AMOUNT = null;

	/** �� 74 List�ϐ��F l_EXTERNAL_TAX_AMOUNT */
	public List l_EXTERNAL_TAX_AMOUNT = null;

	/** �� 75 List�ϐ��F l_INTERNAL_TAX_AMOUNT */
	public List l_INTERNAL_TAX_AMOUNT = null;

	/** �� 76 List�ϐ��F l_TAX_AMOUNT_1 */
	public List l_TAX_AMOUNT_1 = null;

	/** �� 77 List�ϐ��F l_TAX_AMOUNT_2 */
	public List l_TAX_AMOUNT_2 = null;

	/** �� 78 List�ϐ��F l_TAX_AMOUNT_3 */
	public List l_TAX_AMOUNT_3 = null;

	/** �� 79 List�ϐ��F l_STATUS */
	public List l_STATUS = null;

	/** �� 80 List�ϐ��F l_EDI_DATA_TYP */
	public List l_EDI_DATA_TYP = null;

	/** �� 81 List�ϐ��F l_OLD_TAX_RATE_1 */
	public List l_OLD_TAX_RATE_1 = null;

	/** �� 82 List�ϐ��F l_OLD_TAX_RATE_2 */
	public List l_OLD_TAX_RATE_2 = null;

	/** �� 83 List�ϐ��F l_OLD_TAX_RATE_3 */
	public List l_OLD_TAX_RATE_3 = null;

	/** �� 84 List�ϐ��F l_NEW_TAX_RATE_START_DATE */
	public List l_NEW_TAX_RATE_START_DATE = null;

	/** �� 85 List�ϐ��F l_NEW_TAX_RATE_1 */
	public List l_NEW_TAX_RATE_1 = null;

	/** �� 86 List�ϐ��F l_NEW_TAX_RATE_2 */
	public List l_NEW_TAX_RATE_2 = null;

	/** �� 87 List�ϐ��F l_NEW_TAX_RATE_3 */
	public List l_NEW_TAX_RATE_3 = null;

	/** �� 88 List�ϐ��F l_ROUND_TYP */
	public List l_ROUND_TYP = null;

	/** �� 89 List�ϐ��F l_DECIMAL_FIG */
	public List l_DECIMAL_FIG = null;

	/** �� 90 List�ϐ��F l_SEQ_NO */
	public List l_SEQ_NO = null;

	/** �� 91 List�ϐ��F l_LINE_NO */
	public List l_LINE_NO = null;

	/** �� 92 List�ϐ��F l_LINE_TYP */
	public List l_LINE_TYP = null;

	/** �� 93 List�ϐ��F l_COMM_CD */
	public List l_COMM_CD = null;

	/** �� 94 List�ϐ��F l_COMM_NAME */
	public List l_COMM_NAME = null;

	/** �� 95 List�ϐ��F l_SPEC */
	public List l_SPEC = null;

	/** �� 96 List�ϐ��F l_TAX_CD_2 */
	public List l_TAX_CD_2 = null;

	/** �� 97 List�ϐ��F l_INP_UNIT_PRICE */
	public List l_INP_UNIT_PRICE = null;

	/** �� 98 List�ϐ��F l_UNIT_PRICE_TYP */
	public List l_UNIT_PRICE_TYP = null;

	/** �� 99 List�ϐ��F l_SLIP_QTY */
	public List l_SLIP_QTY = null;

	/** �� 100 List�ϐ��F l_PART_DLV_TIMES */
	public List l_PART_DLV_TIMES = null;

	/** �� 101 List�ϐ��F l_PART_DLV_TYP */
	public List l_PART_DLV_TYP = null;

	/** �� 102 List�ϐ��F l_CUST_COMM_CD */
	public List l_CUST_COMM_CD = null;

	/** �� 103 List�ϐ��F l_CUST_COMM_NAME */
	public List l_CUST_COMM_NAME = null;

	/** �� 104 List�ϐ��F l_CUST_ODR_SLIP_CD */
	public List l_CUST_ODR_SLIP_CD = null;

	/** �� 105 List�ϐ��F l_CUST_UNIT_PRICE_TYP */
	public List l_CUST_UNIT_PRICE_TYP = null;

	/** �� 106 List�ϐ��F l_OWN_CUR_SALES_AMOUNT */
	public List l_OWN_CUR_SALES_AMOUNT = null;

	/** �� 107 List�ϐ��F l_STOCK_CTRL_FLG */
	public List l_STOCK_CTRL_FLG = null;

	/** �� 108 List�ϐ��F l_DUMMY */
	public List l_DUMMY = null;

	/** �� 109 List�ϐ��F l_SLIP_CD2 */
	public List l_SLIP_CD2 = null;

	/** �� 110 List�ϐ��F l_SYSTEMDATE */
	public List l_SYSTEMDATE = null;

	/** �� 111 List�ϐ��F l_SYSTEMUSER */
	public List l_SYSTEMUSER = null;

	/** �� 112 List�ϐ��F l_PROGRAMID */
	public List l_PROGRAMID = null;

	/** �� 113 List�ϐ��F l_DLV_CD */
	public List l_DLV_CD = null;

	/** �� 114 List�ϐ��F l_DLV_KEY_CD */
	public List l_DLV_KEY_CD = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getSLIP_CTRL_GRP() { return m_SLIP_CTRL_GRP; }
	public String getSLIP_TRN_CD() { return m_SLIP_TRN_CD; }
	public String getSTOCK_CLASS_CD() { return m_STOCK_CLASS_CD; }
	public String getBALANCE_CLASS_CD() { return m_BALANCE_CLASS_CD; }
	public String getHOME_CUR_CD() { return m_HOME_CUR_CD; }
	public String getSALES_DATE() { return m_SALES_DATE; }
	public String getSALES_DEPT_CD() { return m_SALES_DEPT_CD; }
	public String getCUST_CHRG_PSN_CD() { return m_CUST_CHRG_PSN_CD; }
	public String getCUST_CD() { return m_CUST_CD; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getSALES_CUST_ODR_NO() { return m_SALES_CUST_ODR_NO; }
	public String getSALES_AMOUNT() { return m_SALES_AMOUNT; }
	public String getREMARKS() { return m_REMARKS; }
	public String getSALES_AMOUNT_EXCH_RATES() { return m_SALES_AMOUNT_EXCH_RATES; }
	public String getOWN_CUR_TAXCREDIT_SALES_AMOUNT() { return m_OWN_CUR_TAXCREDIT_SALES_AMOUNT; }
	public String getSALES_UNIT_PRICE() { return m_SALES_UNIT_PRICE; }
	public String getSALES_QTY() { return m_SALES_QTY; }
	public String getINSPC_ACPT_DATE() { return m_INSPC_ACPT_DATE; }
	public String getINSPC_ACPT_QTY() { return m_INSPC_ACPT_QTY; }
	public String getSLIP_CD() { return m_SLIP_CD; }
	public String getDLV_LOC_CD() { return m_DLV_LOC_CD; }
	public String getSHIP_DATE() { return m_SHIP_DATE; }
	public String getCUST_ODR_NO() { return m_CUST_ODR_NO; }
	public String getODR_NO() { return m_ODR_NO; }
	public String getCUST_ITEM_CD() { return m_CUST_ITEM_CD; }
	public String getPART_DLV_SEQ_NO() { return m_PART_DLV_SEQ_NO; }
	public String getSHIP_ODR_NO() { return m_SHIP_ODR_NO; }
	public String getINSPC_ACPT_INFO_IF_CTRL_NO() { return m_INSPC_ACPT_INFO_IF_CTRL_NO; }
	public String getDESINATED_SHIP_DATE() { return m_DESINATED_SHIP_DATE; }
	public String getSCDL_DLV_DATE() { return m_SCDL_DLV_DATE; }
	public String getODR_ACPT_DATE() { return m_ODR_ACPT_DATE; }
	public String getCUS_DLV_CD() { return m_CUS_DLV_CD; }
	public String getCUS_DLV_KEY_CD() { return m_CUS_DLV_KEY_CD; }
	public String getSPCL_PRICE_TYP() { return m_SPCL_PRICE_TYP; }
	public String getODR_CMPLT_FLG() { return m_ODR_CMPLT_FLG; }
	public String getSHIP_CNT() { return m_SHIP_CNT; }
	public String getT_ODR_TAX_CD() { return m_T_ODR_TAX_CD; }
	public String getUNIT_COST_TYP() { return m_UNIT_COST_TYP; }
	public String getCUST_NAME() { return m_CUST_NAME; }
	public String getTAX_CALC_TYP() { return m_TAX_CALC_TYP; }
	public String getTAX_APPLY_TYP() { return m_TAX_APPLY_TYP; }
	public String getTEMP_UNIT_PRICE_SALES_FLG() { return m_TEMP_UNIT_PRICE_SALES_FLG; }
	public String getCLAIM_CYCLE_TYP() { return m_CLAIM_CYCLE_TYP; }
	public String getRM_INP_TYP() { return m_RM_INP_TYP; }
	public String getCUR_CD() { return m_CUR_CD; }
	public String getEXCH_TYP() { return m_EXCH_TYP; }
	public String getTAX_CD() { return m_TAX_CD; }
	public String getCUST_VARIOUS_TYP() { return m_CUST_VARIOUS_TYP; }
	public String getSLIP_PRINTING_TYP_1() { return m_SLIP_PRINTING_TYP_1; }
	public String getSLIP_PRINTING_TYP_2() { return m_SLIP_PRINTING_TYP_2; }
	public String getSLIP_PRINTING_TYP_3() { return m_SLIP_PRINTING_TYP_3; }
	public String getSLIP_PRINTING_TYP_4() { return m_SLIP_PRINTING_TYP_4; }
	public String getSLIP_PRINTING_TYP_5() { return m_SLIP_PRINTING_TYP_5; }
	public String getPRICE_RANK_CD() { return m_PRICE_RANK_CD; }
	public String getINSPC_ACPT_TYP() { return m_INSPC_ACPT_TYP; }
	public String getSHIP_SLIP_ID() { return m_SHIP_SLIP_ID; }
	public String getCARRIAGE_CHARGE_TYP() { return m_CARRIAGE_CHARGE_TYP; }
	public String getBILL_ADDRESSEE_CD() { return m_BILL_ADDRESSEE_CD; }
	public String getSTL_COND_CD() { return m_STL_COND_CD; }
	public String getDLV_LOC_NAME() { return m_DLV_LOC_NAME; }
	public String getZIP_CD() { return m_ZIP_CD; }
	public String getADDRESS_1() { return m_ADDRESS_1; }
	public String getADDRESS_2() { return m_ADDRESS_2; }
	public String getCUST_ITEM_NAME() { return m_CUST_ITEM_NAME; }
	public String getEXCH_RATE() { return m_EXCH_RATE; }
	public String getSLIP_DATE() { return m_SLIP_DATE; }
	public String getSHIP_SLIP_CD() { return m_SHIP_SLIP_CD; }
	public String getEXTERNAL_TAX_SALES_AMOUNT() { return m_EXTERNAL_TAX_SALES_AMOUNT; }
	public String getINTERNAL_TAX_SALES_AMOUNT() { return m_INTERNAL_TAX_SALES_AMOUNT; }
	public String getTAXFREE_SALES_AMOUNT() { return m_TAXFREE_SALES_AMOUNT; }
	public String getTAX_CREDIT_SALES_AMOUNT() { return m_TAX_CREDIT_SALES_AMOUNT; }
	public String getEXTERNAL_TAX_AMOUNT() { return m_EXTERNAL_TAX_AMOUNT; }
	public String getINTERNAL_TAX_AMOUNT() { return m_INTERNAL_TAX_AMOUNT; }
	public String getTAX_AMOUNT_1() { return m_TAX_AMOUNT_1; }
	public String getTAX_AMOUNT_2() { return m_TAX_AMOUNT_2; }
	public String getTAX_AMOUNT_3() { return m_TAX_AMOUNT_3; }
	public String getSTATUS() { return m_STATUS; }
	public String getEDI_DATA_TYP() { return m_EDI_DATA_TYP; }
	public String getOLD_TAX_RATE_1() { return m_OLD_TAX_RATE_1; }
	public String getOLD_TAX_RATE_2() { return m_OLD_TAX_RATE_2; }
	public String getOLD_TAX_RATE_3() { return m_OLD_TAX_RATE_3; }
	public String getNEW_TAX_RATE_START_DATE() { return m_NEW_TAX_RATE_START_DATE; }
	public String getNEW_TAX_RATE_1() { return m_NEW_TAX_RATE_1; }
	public String getNEW_TAX_RATE_2() { return m_NEW_TAX_RATE_2; }
	public String getNEW_TAX_RATE_3() { return m_NEW_TAX_RATE_3; }
	public String getROUND_TYP() { return m_ROUND_TYP; }
	public String getDECIMAL_FIG() { return m_DECIMAL_FIG; }
	public String getSEQ_NO() { return m_SEQ_NO; }
	public String getLINE_NO() { return m_LINE_NO; }
	public String getLINE_TYP() { return m_LINE_TYP; }
	public String getCOMM_CD() { return m_COMM_CD; }
	public String getCOMM_NAME() { return m_COMM_NAME; }
	public String getSPEC() { return m_SPEC; }
	public String getTAX_CD_2() { return m_TAX_CD_2; }
	public String getINP_UNIT_PRICE() { return m_INP_UNIT_PRICE; }
	public String getUNIT_PRICE_TYP() { return m_UNIT_PRICE_TYP; }
	public String getSLIP_QTY() { return m_SLIP_QTY; }
	public String getPART_DLV_TIMES() { return m_PART_DLV_TIMES; }
	public String getPART_DLV_TYP() { return m_PART_DLV_TYP; }
	public String getCUST_COMM_CD() { return m_CUST_COMM_CD; }
	public String getCUST_COMM_NAME() { return m_CUST_COMM_NAME; }
	public String getCUST_ODR_SLIP_CD() { return m_CUST_ODR_SLIP_CD; }
	public String getCUST_UNIT_PRICE_TYP() { return m_CUST_UNIT_PRICE_TYP; }
	public String getOWN_CUR_SALES_AMOUNT() { return m_OWN_CUR_SALES_AMOUNT; }
	public String getSTOCK_CTRL_FLG() { return m_STOCK_CTRL_FLG; }
	public String getDUMMY() { return m_DUMMY; }
	public String getSLIP_CD2() { return m_SLIP_CD2; }
	public String getSYSTEMDATE() { return m_SYSTEMDATE; }
	public String getSYSTEMUSER() { return m_SYSTEMUSER; }
	public String getPROGRAMID() { return m_PROGRAMID; }
	public String getDLV_CD() { return m_DLV_CD; }
	public String getDLV_KEY_CD() { return m_DLV_KEY_CD; }

	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_SLIP_CTRL_GRP() { return l_SLIP_CTRL_GRP; }
	public List getList_SLIP_TRN_CD() { return l_SLIP_TRN_CD; }
	public List getList_STOCK_CLASS_CD() { return l_STOCK_CLASS_CD; }
	public List getList_BALANCE_CLASS_CD() { return l_BALANCE_CLASS_CD; }
	public List getList_HOME_CUR_CD() { return l_HOME_CUR_CD; }
	public List getList_SALES_DATE() { return l_SALES_DATE; }
	public List getList_SALES_DEPT_CD() { return l_SALES_DEPT_CD; }
	public List getList_CUST_CHRG_PSN_CD() { return l_CUST_CHRG_PSN_CD; }
	public List getList_CUST_CD() { return l_CUST_CD; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_SALES_CUST_ODR_NO() { return l_SALES_CUST_ODR_NO; }
	public List getList_SALES_AMOUNT() { return l_SALES_AMOUNT; }
	public List getList_REMARKS() { return l_REMARKS; }
	public List getList_SALES_AMOUNT_EXCH_RATES() { return l_SALES_AMOUNT_EXCH_RATES; }
	public List getList_OWN_CUR_TAXCREDIT_SALES_AMOUNT() { return l_OWN_CUR_TAXCREDIT_SALES_AMOUNT; }
	public List getList_SALES_UNIT_PRICE() { return l_SALES_UNIT_PRICE; }
	public List getList_SALES_QTY() { return l_SALES_QTY; }
	public List getList_INSPC_ACPT_DATE() { return l_INSPC_ACPT_DATE; }
	public List getList_INSPC_ACPT_QTY() { return l_INSPC_ACPT_QTY; }
	public List getList_SLIP_CD() { return l_SLIP_CD; }
	public List getList_DLV_LOC_CD() { return l_DLV_LOC_CD; }
	public List getList_SHIP_DATE() { return l_SHIP_DATE; }
	public List getList_CUST_ODR_NO() { return l_CUST_ODR_NO; }
	public List getList_ODR_NO() { return l_ODR_NO; }
	public List getList_CUST_ITEM_CD() { return l_CUST_ITEM_CD; }
	public List getList_PART_DLV_SEQ_NO() { return l_PART_DLV_SEQ_NO; }
	public List getList_SHIP_ODR_NO() { return l_SHIP_ODR_NO; }
	public List getList_INSPC_ACPT_INFO_IF_CTRL_NO() { return l_INSPC_ACPT_INFO_IF_CTRL_NO; }
	public List getList_DESINATED_SHIP_DATE() { return l_DESINATED_SHIP_DATE; }
	public List getList_SCDL_DLV_DATE() { return l_SCDL_DLV_DATE; }
	public List getList_ODR_ACPT_DATE() { return l_ODR_ACPT_DATE; }
	public List getList_CUS_DLV_CD() { return l_CUS_DLV_CD; }
	public List getList_CUS_DLV_KEY_CD() { return l_CUS_DLV_KEY_CD; }
	public List getList_SPCL_PRICE_TYP() { return l_SPCL_PRICE_TYP; }
	public List getList_ODR_CMPLT_FLG() { return l_ODR_CMPLT_FLG; }
	public List getList_SHIP_CNT() { return l_SHIP_CNT; }
	public List getList_T_ODR_TAX_CD() { return l_T_ODR_TAX_CD; }
	public List getList_UNIT_COST_TYP() { return l_UNIT_COST_TYP; }
	public List getList_CUST_NAME() { return l_CUST_NAME; }
	public List getList_TAX_CALC_TYP() { return l_TAX_CALC_TYP; }
	public List getList_TAX_APPLY_TYP() { return l_TAX_APPLY_TYP; }
	public List getList_TEMP_UNIT_PRICE_SALES_FLG() { return l_TEMP_UNIT_PRICE_SALES_FLG; }
	public List getList_CLAIM_CYCLE_TYP() { return l_CLAIM_CYCLE_TYP; }
	public List getList_RM_INP_TYP() { return l_RM_INP_TYP; }
	public List getList_CUR_CD() { return l_CUR_CD; }
	public List getList_EXCH_TYP() { return l_EXCH_TYP; }
	public List getList_TAX_CD() { return l_TAX_CD; }
	public List getList_CUST_VARIOUS_TYP() { return l_CUST_VARIOUS_TYP; }
	public List getList_SLIP_PRINTING_TYP_1() { return l_SLIP_PRINTING_TYP_1; }
	public List getList_SLIP_PRINTING_TYP_2() { return l_SLIP_PRINTING_TYP_2; }
	public List getList_SLIP_PRINTING_TYP_3() { return l_SLIP_PRINTING_TYP_3; }
	public List getList_SLIP_PRINTING_TYP_4() { return l_SLIP_PRINTING_TYP_4; }
	public List getList_SLIP_PRINTING_TYP_5() { return l_SLIP_PRINTING_TYP_5; }
	public List getList_PRICE_RANK_CD() { return l_PRICE_RANK_CD; }
	public List getList_INSPC_ACPT_TYP() { return l_INSPC_ACPT_TYP; }
	public List getList_SHIP_SLIP_ID() { return l_SHIP_SLIP_ID; }
	public List getList_CARRIAGE_CHARGE_TYP() { return l_CARRIAGE_CHARGE_TYP; }
	public List getList_BILL_ADDRESSEE_CD() { return l_BILL_ADDRESSEE_CD; }
	public List getList_STL_COND_CD() { return l_STL_COND_CD; }
	public List getList_DLV_LOC_NAME() { return l_DLV_LOC_NAME; }
	public List getList_ZIP_CD() { return l_ZIP_CD; }
	public List getList_ADDRESS_1() { return l_ADDRESS_1; }
	public List getList_ADDRESS_2() { return l_ADDRESS_2; }
	public List getList_CUST_ITEM_NAME() { return l_CUST_ITEM_NAME; }
	public List getList_EXCH_RATE() { return l_EXCH_RATE; }
	public List getList_SLIP_DATE() { return l_SLIP_DATE; }
	public List getList_SHIP_SLIP_CD() { return l_SHIP_SLIP_CD; }
	public List getList_EXTERNAL_TAX_SALES_AMOUNT() { return l_EXTERNAL_TAX_SALES_AMOUNT; }
	public List getList_INTERNAL_TAX_SALES_AMOUNT() { return l_INTERNAL_TAX_SALES_AMOUNT; }
	public List getList_TAXFREE_SALES_AMOUNT() { return l_TAXFREE_SALES_AMOUNT; }
	public List getList_TAX_CREDIT_SALES_AMOUNT() { return l_TAX_CREDIT_SALES_AMOUNT; }
	public List getList_EXTERNAL_TAX_AMOUNT() { return l_EXTERNAL_TAX_AMOUNT; }
	public List getList_INTERNAL_TAX_AMOUNT() { return l_INTERNAL_TAX_AMOUNT; }
	public List getList_TAX_AMOUNT_1() { return l_TAX_AMOUNT_1; }
	public List getList_TAX_AMOUNT_2() { return l_TAX_AMOUNT_2; }
	public List getList_TAX_AMOUNT_3() { return l_TAX_AMOUNT_3; }
	public List getList_STATUS() { return l_STATUS; }
	public List getList_EDI_DATA_TYP() { return l_EDI_DATA_TYP; }
	public List getList_OLD_TAX_RATE_1() { return l_OLD_TAX_RATE_1; }
	public List getList_OLD_TAX_RATE_2() { return l_OLD_TAX_RATE_2; }
	public List getList_OLD_TAX_RATE_3() { return l_OLD_TAX_RATE_3; }
	public List getList_NEW_TAX_RATE_START_DATE() { return l_NEW_TAX_RATE_START_DATE; }
	public List getList_NEW_TAX_RATE_1() { return l_NEW_TAX_RATE_1; }
	public List getList_NEW_TAX_RATE_2() { return l_NEW_TAX_RATE_2; }
	public List getList_NEW_TAX_RATE_3() { return l_NEW_TAX_RATE_3; }
	public List getList_ROUND_TYP() { return l_ROUND_TYP; }
	public List getList_DECIMAL_FIG() { return l_DECIMAL_FIG; }
	public List getList_SEQ_NO() { return l_SEQ_NO; }
	public List getList_LINE_NO() { return l_LINE_NO; }
	public List getList_LINE_TYP() { return l_LINE_TYP; }
	public List getList_COMM_CD() { return l_COMM_CD; }
	public List getList_COMM_NAME() { return l_COMM_NAME; }
	public List getList_SPEC() { return l_SPEC; }
	public List getList_TAX_CD_2() { return l_TAX_CD_2; }
	public List getList_INP_UNIT_PRICE() { return l_INP_UNIT_PRICE; }
	public List getList_UNIT_PRICE_TYP() { return l_UNIT_PRICE_TYP; }
	public List getList_SLIP_QTY() { return l_SLIP_QTY; }
	public List getList_PART_DLV_TIMES() { return l_PART_DLV_TIMES; }
	public List getList_PART_DLV_TYP() { return l_PART_DLV_TYP; }
	public List getList_CUST_COMM_CD() { return l_CUST_COMM_CD; }
	public List getList_CUST_COMM_NAME() { return l_CUST_COMM_NAME; }
	public List getList_CUST_ODR_SLIP_CD() { return l_CUST_ODR_SLIP_CD; }
	public List getList_CUST_UNIT_PRICE_TYP() { return l_CUST_UNIT_PRICE_TYP; }
	public List getList_OWN_CUR_SALES_AMOUNT() { return l_OWN_CUR_SALES_AMOUNT; }
	public List getList_STOCK_CTRL_FLG() { return l_STOCK_CTRL_FLG; }
	public List getList_DUMMY() { return l_DUMMY; }
	public List getList_SLIP_CD2() { return l_SLIP_CD2; }
	public List getList_SYSTEMDATE() { return l_SYSTEMDATE; }
	public List getList_SYSTEMUSER() { return l_SYSTEMUSER; }
	public List getList_PROGRAMID() { return l_PROGRAMID; }
	public List getList_DLV_CD() { return l_DLV_CD; }
	public List getList_DLV_KEY_CD() { return l_DLV_KEY_CD; }

	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setSLIP_CTRL_GRP(String val) { m_SLIP_CTRL_GRP = val; }
	public void setSLIP_TRN_CD(String val) { m_SLIP_TRN_CD = val; }
	public void setSTOCK_CLASS_CD(String val) { m_STOCK_CLASS_CD = val; }
	public void setBALANCE_CLASS_CD(String val) { m_BALANCE_CLASS_CD = val; }
	public void setHOME_CUR_CD(String val) { m_HOME_CUR_CD = val; }
	public void setSALES_DATE(String val) { m_SALES_DATE = val; }
	public void setSALES_DEPT_CD(String val) { m_SALES_DEPT_CD = val; }
	public void setCUST_CHRG_PSN_CD(String val) { m_CUST_CHRG_PSN_CD = val; }
	public void setCUST_CD(String val) { m_CUST_CD = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setSALES_CUST_ODR_NO(String val) { m_SALES_CUST_ODR_NO = val; }
	public void setSALES_AMOUNT(String val) { m_SALES_AMOUNT = val; }
	public void setREMARKS(String val) { m_REMARKS = val; }
	public void setSALES_AMOUNT_EXCH_RATES(String val) { m_SALES_AMOUNT_EXCH_RATES = val; }
	public void setOWN_CUR_TAXCREDIT_SALES_AMOUNT(String val) { m_OWN_CUR_TAXCREDIT_SALES_AMOUNT = val; }
	public void setSALES_UNIT_PRICE(String val) { m_SALES_UNIT_PRICE = val; }
	public void setSALES_QTY(String val) { m_SALES_QTY = val; }
	public void setINSPC_ACPT_DATE(String val) { m_INSPC_ACPT_DATE = val; }
	public void setINSPC_ACPT_QTY(String val) { m_INSPC_ACPT_QTY = val; }
	public void setSLIP_CD(String val) { m_SLIP_CD = val; }
	public void setDLV_LOC_CD(String val) { m_DLV_LOC_CD = val; }
	public void setSHIP_DATE(String val) { m_SHIP_DATE = val; }
	public void setCUST_ODR_NO(String val) { m_CUST_ODR_NO = val; }
	public void setODR_NO(String val) { m_ODR_NO = val; }
	public void setCUST_ITEM_CD(String val) { m_CUST_ITEM_CD = val; }
	public void setPART_DLV_SEQ_NO(String val) { m_PART_DLV_SEQ_NO = val; }
	public void setSHIP_ODR_NO(String val) { m_SHIP_ODR_NO = val; }
	public void setINSPC_ACPT_INFO_IF_CTRL_NO(String val) { m_INSPC_ACPT_INFO_IF_CTRL_NO = val; }
	public void setDESINATED_SHIP_DATE(String val) { m_DESINATED_SHIP_DATE = val; }
	public void setSCDL_DLV_DATE(String val) { m_SCDL_DLV_DATE = val; }
	public void setODR_ACPT_DATE(String val) { m_ODR_ACPT_DATE = val; }
	public void setCUS_DLV_CD(String val) { m_CUS_DLV_CD = val; }
	public void setCUS_DLV_KEY_CD(String val) { m_CUS_DLV_KEY_CD = val; }
	public void setSPCL_PRICE_TYP(String val) { m_SPCL_PRICE_TYP = val; }
	public void setODR_CMPLT_FLG(String val) { m_ODR_CMPLT_FLG = val; }
	public void setSHIP_CNT(String val) { m_SHIP_CNT = val; }
	public void setT_ODR_TAX_CD(String val) { m_T_ODR_TAX_CD = val; }
	public void setUNIT_COST_TYP(String val) { m_UNIT_COST_TYP = val; }
	public void setCUST_NAME(String val) { m_CUST_NAME = val; }
	public void setTAX_CALC_TYP(String val) { m_TAX_CALC_TYP = val; }
	public void setTAX_APPLY_TYP(String val) { m_TAX_APPLY_TYP = val; }
	public void setTEMP_UNIT_PRICE_SALES_FLG(String val) { m_TEMP_UNIT_PRICE_SALES_FLG = val; }
	public void setCLAIM_CYCLE_TYP(String val) { m_CLAIM_CYCLE_TYP = val; }
	public void setRM_INP_TYP(String val) { m_RM_INP_TYP = val; }
	public void setCUR_CD(String val) { m_CUR_CD = val; }
	public void setEXCH_TYP(String val) { m_EXCH_TYP = val; }
	public void setTAX_CD(String val) { m_TAX_CD = val; }
	public void setCUST_VARIOUS_TYP(String val) { m_CUST_VARIOUS_TYP = val; }
	public void setSLIP_PRINTING_TYP_1(String val) { m_SLIP_PRINTING_TYP_1 = val; }
	public void setSLIP_PRINTING_TYP_2(String val) { m_SLIP_PRINTING_TYP_2 = val; }
	public void setSLIP_PRINTING_TYP_3(String val) { m_SLIP_PRINTING_TYP_3 = val; }
	public void setSLIP_PRINTING_TYP_4(String val) { m_SLIP_PRINTING_TYP_4 = val; }
	public void setSLIP_PRINTING_TYP_5(String val) { m_SLIP_PRINTING_TYP_5 = val; }
	public void setPRICE_RANK_CD(String val) { m_PRICE_RANK_CD = val; }
	public void setINSPC_ACPT_TYP(String val) { m_INSPC_ACPT_TYP = val; }
	public void setSHIP_SLIP_ID(String val) { m_SHIP_SLIP_ID = val; }
	public void setCARRIAGE_CHARGE_TYP(String val) { m_CARRIAGE_CHARGE_TYP = val; }
	public void setBILL_ADDRESSEE_CD(String val) { m_BILL_ADDRESSEE_CD = val; }
	public void setSTL_COND_CD(String val) { m_STL_COND_CD = val; }
	public void setDLV_LOC_NAME(String val) { m_DLV_LOC_NAME = val; }
	public void setZIP_CD(String val) { m_ZIP_CD = val; }
	public void setADDRESS_1(String val) { m_ADDRESS_1 = val; }
	public void setADDRESS_2(String val) { m_ADDRESS_2 = val; }
	public void setCUST_ITEM_NAME(String val) { m_CUST_ITEM_NAME = val; }
	public void setEXCH_RATE(String val) { m_EXCH_RATE = val; }
	public void setSLIP_DATE(String val) { m_SLIP_DATE = val; }
	public void setSHIP_SLIP_CD(String val) { m_SHIP_SLIP_CD = val; }
	public void setEXTERNAL_TAX_SALES_AMOUNT(String val) { m_EXTERNAL_TAX_SALES_AMOUNT = val; }
	public void setINTERNAL_TAX_SALES_AMOUNT(String val) { m_INTERNAL_TAX_SALES_AMOUNT = val; }
	public void setTAXFREE_SALES_AMOUNT(String val) { m_TAXFREE_SALES_AMOUNT = val; }
	public void setTAX_CREDIT_SALES_AMOUNT(String val) { m_TAX_CREDIT_SALES_AMOUNT = val; }
	public void setEXTERNAL_TAX_AMOUNT(String val) { m_EXTERNAL_TAX_AMOUNT = val; }
	public void setINTERNAL_TAX_AMOUNT(String val) { m_INTERNAL_TAX_AMOUNT = val; }
	public void setTAX_AMOUNT_1(String val) { m_TAX_AMOUNT_1 = val; }
	public void setTAX_AMOUNT_2(String val) { m_TAX_AMOUNT_2 = val; }
	public void setTAX_AMOUNT_3(String val) { m_TAX_AMOUNT_3 = val; }
	public void setSTATUS(String val) { m_STATUS = val; }
	public void setEDI_DATA_TYP(String val) { m_EDI_DATA_TYP = val; }
	public void setOLD_TAX_RATE_1(String val) { m_OLD_TAX_RATE_1 = val; }
	public void setOLD_TAX_RATE_2(String val) { m_OLD_TAX_RATE_2 = val; }
	public void setOLD_TAX_RATE_3(String val) { m_OLD_TAX_RATE_3 = val; }
	public void setNEW_TAX_RATE_START_DATE(String val) { m_NEW_TAX_RATE_START_DATE = val; }
	public void setNEW_TAX_RATE_1(String val) { m_NEW_TAX_RATE_1 = val; }
	public void setNEW_TAX_RATE_2(String val) { m_NEW_TAX_RATE_2 = val; }
	public void setNEW_TAX_RATE_3(String val) { m_NEW_TAX_RATE_3 = val; }
	public void setROUND_TYP(String val) { m_ROUND_TYP = val; }
	public void setDECIMAL_FIG(String val) { m_DECIMAL_FIG = val; }
	public void setSEQ_NO(String val) { m_SEQ_NO = val; }
	public void setLINE_NO(String val) { m_LINE_NO = val; }
	public void setLINE_TYP(String val) { m_LINE_TYP = val; }
	public void setCOMM_CD(String val) { m_COMM_CD = val; }
	public void setCOMM_NAME(String val) { m_COMM_NAME = val; }
	public void setSPEC(String val) { m_SPEC = val; }
	public void setTAX_CD_2(String val) { m_TAX_CD_2 = val; }
	public void setINP_UNIT_PRICE(String val) { m_INP_UNIT_PRICE = val; }
	public void setUNIT_PRICE_TYP(String val) { m_UNIT_PRICE_TYP = val; }
	public void setSLIP_QTY(String val) { m_SLIP_QTY = val; }
	public void setPART_DLV_TIMES(String val) { m_PART_DLV_TIMES = val; }
	public void setPART_DLV_TYP(String val) { m_PART_DLV_TYP = val; }
	public void setCUST_COMM_CD(String val) { m_CUST_COMM_CD = val; }
	public void setCUST_COMM_NAME(String val) { m_CUST_COMM_NAME = val; }
	public void setCUST_ODR_SLIP_CD(String val) { m_CUST_ODR_SLIP_CD = val; }
	public void setCUST_UNIT_PRICE_TYP(String val) { m_CUST_UNIT_PRICE_TYP = val; }
	public void setOWN_CUR_SALES_AMOUNT(String val) { m_OWN_CUR_SALES_AMOUNT = val; }
	public void setSTOCK_CTRL_FLG(String val) { m_STOCK_CTRL_FLG = val; }
	public void setDUMMY(String val) { m_DUMMY = val; }
	public void setSLIP_CD2(String val) { m_SLIP_CD2 = val; }
	public void setSYSTEMDATE(String val) { m_SYSTEMDATE = val; }
	public void setSYSTEMUSER(String val) { m_SYSTEMUSER = val; }
	public void setPROGRAMID(String val) { m_PROGRAMID = val; }
	public void setDLV_CD(String val) { m_DLV_CD = val; }
	public void setDLV_KEY_CD(String val) { m_DLV_KEY_CD = val; }


	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_SLIP_CTRL_GRP(List list) { l_SLIP_CTRL_GRP = list; }
	public void setList_SLIP_TRN_CD(List list) { l_SLIP_TRN_CD = list; }
	public void setList_STOCK_CLASS_CD(List list) { l_STOCK_CLASS_CD = list; }
	public void setList_BALANCE_CLASS_CD(List list) { l_BALANCE_CLASS_CD = list; }
	public void setList_HOME_CUR_CD(List list) { l_HOME_CUR_CD = list; }
	public void setList_SALES_DATE(List list) { l_SALES_DATE = list; }
	public void setList_SALES_DEPT_CD(List list) { l_SALES_DEPT_CD = list; }
	public void setList_CUST_CHRG_PSN_CD(List list) { l_CUST_CHRG_PSN_CD = list; }
	public void setList_CUST_CD(List list) { l_CUST_CD = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_SALES_CUST_ODR_NO(List list) { l_SALES_CUST_ODR_NO = list; }
	public void setList_SALES_AMOUNT(List list) { l_SALES_AMOUNT = list; }
	public void setList_REMARKS(List list) { l_REMARKS = list; }
	public void setList_SALES_AMOUNT_EXCH_RATES(List list) { l_SALES_AMOUNT_EXCH_RATES = list; }
	public void setList_OWN_CUR_TAXCREDIT_SALES_AMOUNT(List list) { l_OWN_CUR_TAXCREDIT_SALES_AMOUNT = list; }
	public void setList_SALES_UNIT_PRICE(List list) { l_SALES_UNIT_PRICE = list; }
	public void setList_SALES_QTY(List list) { l_SALES_QTY = list; }
	public void setList_INSPC_ACPT_DATE(List list) { l_INSPC_ACPT_DATE = list; }
	public void setList_INSPC_ACPT_QTY(List list) { l_INSPC_ACPT_QTY = list; }
	public void setList_SLIP_CD(List list) { l_SLIP_CD = list; }
	public void setList_DLV_LOC_CD(List list) { l_DLV_LOC_CD = list; }
	public void setList_SHIP_DATE(List list) { l_SHIP_DATE = list; }
	public void setList_CUST_ODR_NO(List list) { l_CUST_ODR_NO = list; }
	public void setList_ODR_NO(List list) { l_ODR_NO = list; }
	public void setList_CUST_ITEM_CD(List list) { l_CUST_ITEM_CD = list; }
	public void setList_PART_DLV_SEQ_NO(List list) { l_PART_DLV_SEQ_NO = list; }
	public void setList_SHIP_ODR_NO(List list) { l_SHIP_ODR_NO = list; }
	public void setList_INSPC_ACPT_INFO_IF_CTRL_NO(List list) { l_INSPC_ACPT_INFO_IF_CTRL_NO = list; }
	public void setList_DESINATED_SHIP_DATE(List list) { l_DESINATED_SHIP_DATE = list; }
	public void setList_SCDL_DLV_DATE(List list) { l_SCDL_DLV_DATE = list; }
	public void setList_ODR_ACPT_DATE(List list) { l_ODR_ACPT_DATE = list; }
	public void setList_CUS_DLV_CD(List list) { l_CUS_DLV_CD = list; }
	public void setList_CUS_DLV_KEY_CD(List list) { l_CUS_DLV_KEY_CD = list; }
	public void setList_SPCL_PRICE_TYP(List list) { l_SPCL_PRICE_TYP = list; }
	public void setList_ODR_CMPLT_FLG(List list) { l_ODR_CMPLT_FLG = list; }
	public void setList_SHIP_CNT(List list) { l_SHIP_CNT = list; }
	public void setList_T_ODR_TAX_CD(List list) { l_T_ODR_TAX_CD = list; }
	public void setList_UNIT_COST_TYP(List list) { l_UNIT_COST_TYP = list; }
	public void setList_CUST_NAME(List list) { l_CUST_NAME = list; }
	public void setList_TAX_CALC_TYP(List list) { l_TAX_CALC_TYP = list; }
	public void setList_TAX_APPLY_TYP(List list) { l_TAX_APPLY_TYP = list; }
	public void setList_TEMP_UNIT_PRICE_SALES_FLG(List list) { l_TEMP_UNIT_PRICE_SALES_FLG = list; }
	public void setList_CLAIM_CYCLE_TYP(List list) { l_CLAIM_CYCLE_TYP = list; }
	public void setList_RM_INP_TYP(List list) { l_RM_INP_TYP = list; }
	public void setList_CUR_CD(List list) { l_CUR_CD = list; }
	public void setList_EXCH_TYP(List list) { l_EXCH_TYP = list; }
	public void setList_TAX_CD(List list) { l_TAX_CD = list; }
	public void setList_CUST_VARIOUS_TYP(List list) { l_CUST_VARIOUS_TYP = list; }
	public void setList_SLIP_PRINTING_TYP_1(List list) { l_SLIP_PRINTING_TYP_1 = list; }
	public void setList_SLIP_PRINTING_TYP_2(List list) { l_SLIP_PRINTING_TYP_2 = list; }
	public void setList_SLIP_PRINTING_TYP_3(List list) { l_SLIP_PRINTING_TYP_3 = list; }
	public void setList_SLIP_PRINTING_TYP_4(List list) { l_SLIP_PRINTING_TYP_4 = list; }
	public void setList_SLIP_PRINTING_TYP_5(List list) { l_SLIP_PRINTING_TYP_5 = list; }
	public void setList_PRICE_RANK_CD(List list) { l_PRICE_RANK_CD = list; }
	public void setList_INSPC_ACPT_TYP(List list) { l_INSPC_ACPT_TYP = list; }
	public void setList_SHIP_SLIP_ID(List list) { l_SHIP_SLIP_ID = list; }
	public void setList_CARRIAGE_CHARGE_TYP(List list) { l_CARRIAGE_CHARGE_TYP = list; }
	public void setList_BILL_ADDRESSEE_CD(List list) { l_BILL_ADDRESSEE_CD = list; }
	public void setList_STL_COND_CD(List list) { l_STL_COND_CD = list; }
	public void setList_DLV_LOC_NAME(List list) { l_DLV_LOC_NAME = list; }
	public void setList_ZIP_CD(List list) { l_ZIP_CD = list; }
	public void setList_ADDRESS_1(List list) { l_ADDRESS_1 = list; }
	public void setList_ADDRESS_2(List list) { l_ADDRESS_2 = list; }
	public void setList_CUST_ITEM_NAME(List list) { l_CUST_ITEM_NAME = list; }
	public void setList_EXCH_RATE(List list) { l_EXCH_RATE = list; }
	public void setList_SLIP_DATE(List list) { l_SLIP_DATE = list; }
	public void setList_SHIP_SLIP_CD(List list) { l_SHIP_SLIP_CD = list; }
	public void setList_EXTERNAL_TAX_SALES_AMOUNT(List list) { l_EXTERNAL_TAX_SALES_AMOUNT = list; }
	public void setList_INTERNAL_TAX_SALES_AMOUNT(List list) { l_INTERNAL_TAX_SALES_AMOUNT = list; }
	public void setList_TAXFREE_SALES_AMOUNT(List list) { l_TAXFREE_SALES_AMOUNT = list; }
	public void setList_TAX_CREDIT_SALES_AMOUNT(List list) { l_TAX_CREDIT_SALES_AMOUNT = list; }
	public void setList_EXTERNAL_TAX_AMOUNT(List list) { l_EXTERNAL_TAX_AMOUNT = list; }
	public void setList_INTERNAL_TAX_AMOUNT(List list) { l_INTERNAL_TAX_AMOUNT = list; }
	public void setList_TAX_AMOUNT_1(List list) { l_TAX_AMOUNT_1 = list; }
	public void setList_TAX_AMOUNT_2(List list) { l_TAX_AMOUNT_2 = list; }
	public void setList_TAX_AMOUNT_3(List list) { l_TAX_AMOUNT_3 = list; }
	public void setList_STATUS(List list) { l_STATUS = list; }
	public void setList_EDI_DATA_TYP(List list) { l_EDI_DATA_TYP = list; }
	public void setList_OLD_TAX_RATE_1(List list) { l_OLD_TAX_RATE_1 = list; }
	public void setList_OLD_TAX_RATE_2(List list) { l_OLD_TAX_RATE_2 = list; }
	public void setList_OLD_TAX_RATE_3(List list) { l_OLD_TAX_RATE_3 = list; }
	public void setList_NEW_TAX_RATE_START_DATE(List list) { l_NEW_TAX_RATE_START_DATE = list; }
	public void setList_NEW_TAX_RATE_1(List list) { l_NEW_TAX_RATE_1 = list; }
	public void setList_NEW_TAX_RATE_2(List list) { l_NEW_TAX_RATE_2 = list; }
	public void setList_NEW_TAX_RATE_3(List list) { l_NEW_TAX_RATE_3 = list; }
	public void setList_ROUND_TYP(List list) { l_ROUND_TYP = list; }
	public void setList_DECIMAL_FIG(List list) { l_DECIMAL_FIG = list; }
	public void setList_SEQ_NO(List list) { l_SEQ_NO = list; }
	public void setList_LINE_NO(List list) { l_LINE_NO = list; }
	public void setList_LINE_TYP(List list) { l_LINE_TYP = list; }
	public void setList_COMM_CD(List list) { l_COMM_CD = list; }
	public void setList_COMM_NAME(List list) { l_COMM_NAME = list; }
	public void setList_SPEC(List list) { l_SPEC = list; }
	public void setList_TAX_CD_2(List list) { l_TAX_CD_2 = list; }
	public void setList_INP_UNIT_PRICE(List list) { l_INP_UNIT_PRICE = list; }
	public void setList_UNIT_PRICE_TYP(List list) { l_UNIT_PRICE_TYP = list; }
	public void setList_SLIP_QTY(List list) { l_SLIP_QTY = list; }
	public void setList_PART_DLV_TIMES(List list) { l_PART_DLV_TIMES = list; }
	public void setList_PART_DLV_TYP(List list) { l_PART_DLV_TYP = list; }
	public void setList_CUST_COMM_CD(List list) { l_CUST_COMM_CD = list; }
	public void setList_CUST_COMM_NAME(List list) { l_CUST_COMM_NAME = list; }
	public void setList_CUST_ODR_SLIP_CD(List list) { l_CUST_ODR_SLIP_CD = list; }
	public void setList_CUST_UNIT_PRICE_TYP(List list) { l_CUST_UNIT_PRICE_TYP = list; }
	public void setList_OWN_CUR_SALES_AMOUNT(List list) { l_OWN_CUR_SALES_AMOUNT = list; }
	public void setList_STOCK_CTRL_FLG(List list) { l_STOCK_CTRL_FLG = list; }
	public void setList_DUMMY(List list) { l_DUMMY = list; }
	public void setList_SLIP_CD2(List list) { l_SLIP_CD2 = list; }
	public void setList_SYSTEMDATE(List list) { l_SYSTEMDATE = list; }
	public void setList_SYSTEMUSER(List list) { l_SYSTEMUSER = list; }
	public void setList_PROGRAMID(List list) { l_PROGRAMID = list; }
	public void setList_DLV_CD(List list) { l_DLV_CD = list; }
	public void setList_DLV_KEY_CD(List list) { l_DLV_KEY_CD = list; }

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
			l_COMPANY_CD.add(((KZ0010P001Struct) list.get(i)).getCOMPANY_CD());
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
			l_SLIP_CTRL_GRP.add(((KZ0010P001Struct) list.get(i)).getSLIP_CTRL_GRP());
		}
		return size;
	}
	public int setL2L_SLIP_TRN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SLIP_TRN_CD == null) {
			l_SLIP_TRN_CD = new ArrayList();
		} else {
			l_SLIP_TRN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SLIP_TRN_CD.add(((KZ0010P001Struct) list.get(i)).getSLIP_TRN_CD());
		}
		return size;
	}
	public int setL2L_STOCK_CLASS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_CLASS_CD == null) {
			l_STOCK_CLASS_CD = new ArrayList();
		} else {
			l_STOCK_CLASS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_CLASS_CD.add(((KZ0010P001Struct) list.get(i)).getSTOCK_CLASS_CD());
		}
		return size;
	}
	public int setL2L_BALANCE_CLASS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BALANCE_CLASS_CD == null) {
			l_BALANCE_CLASS_CD = new ArrayList();
		} else {
			l_BALANCE_CLASS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BALANCE_CLASS_CD.add(((KZ0010P001Struct) list.get(i)).getBALANCE_CLASS_CD());
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
			l_HOME_CUR_CD.add(((KZ0010P001Struct) list.get(i)).getHOME_CUR_CD());
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
			l_SALES_DATE.add(((KZ0010P001Struct) list.get(i)).getSALES_DATE());
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
			l_SALES_DEPT_CD.add(((KZ0010P001Struct) list.get(i)).getSALES_DEPT_CD());
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
			l_CUST_CHRG_PSN_CD.add(((KZ0010P001Struct) list.get(i)).getCUST_CHRG_PSN_CD());
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
			l_CUST_CD.add(((KZ0010P001Struct) list.get(i)).getCUST_CD());
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
			l_ITEM_CD.add(((KZ0010P001Struct) list.get(i)).getITEM_CD());
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
			l_ITEM_NAME.add(((KZ0010P001Struct) list.get(i)).getITEM_NAME());
		}
		return size;
	}
	public int setL2L_SALES_CUST_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SALES_CUST_ODR_NO == null) {
			l_SALES_CUST_ODR_NO = new ArrayList();
		} else {
			l_SALES_CUST_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SALES_CUST_ODR_NO.add(((KZ0010P001Struct) list.get(i)).getSALES_CUST_ODR_NO());
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
			l_SALES_AMOUNT.add(((KZ0010P001Struct) list.get(i)).getSALES_AMOUNT());
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
			l_REMARKS.add(((KZ0010P001Struct) list.get(i)).getREMARKS());
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
			l_SALES_AMOUNT_EXCH_RATES.add(((KZ0010P001Struct) list.get(i)).getSALES_AMOUNT_EXCH_RATES());
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
			l_OWN_CUR_TAXCREDIT_SALES_AMOUNT.add(((KZ0010P001Struct) list.get(i)).getOWN_CUR_TAXCREDIT_SALES_AMOUNT());
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
			l_SALES_UNIT_PRICE.add(((KZ0010P001Struct) list.get(i)).getSALES_UNIT_PRICE());
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
			l_SALES_QTY.add(((KZ0010P001Struct) list.get(i)).getSALES_QTY());
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
			l_INSPC_ACPT_DATE.add(((KZ0010P001Struct) list.get(i)).getINSPC_ACPT_DATE());
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
			l_INSPC_ACPT_QTY.add(((KZ0010P001Struct) list.get(i)).getINSPC_ACPT_QTY());
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
			l_SLIP_CD.add(((KZ0010P001Struct) list.get(i)).getSLIP_CD());
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
			l_DLV_LOC_CD.add(((KZ0010P001Struct) list.get(i)).getDLV_LOC_CD());
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
			l_SHIP_DATE.add(((KZ0010P001Struct) list.get(i)).getSHIP_DATE());
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
			l_CUST_ODR_NO.add(((KZ0010P001Struct) list.get(i)).getCUST_ODR_NO());
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
			l_ODR_NO.add(((KZ0010P001Struct) list.get(i)).getODR_NO());
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
			l_CUST_ITEM_CD.add(((KZ0010P001Struct) list.get(i)).getCUST_ITEM_CD());
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
			l_PART_DLV_SEQ_NO.add(((KZ0010P001Struct) list.get(i)).getPART_DLV_SEQ_NO());
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
			l_SHIP_ODR_NO.add(((KZ0010P001Struct) list.get(i)).getSHIP_ODR_NO());
		}
		return size;
	}
	public int setL2L_INSPC_ACPT_INFO_IF_CTRL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INSPC_ACPT_INFO_IF_CTRL_NO == null) {
			l_INSPC_ACPT_INFO_IF_CTRL_NO = new ArrayList();
		} else {
			l_INSPC_ACPT_INFO_IF_CTRL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INSPC_ACPT_INFO_IF_CTRL_NO.add(((KZ0010P001Struct) list.get(i)).getINSPC_ACPT_INFO_IF_CTRL_NO());
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
			l_DESINATED_SHIP_DATE.add(((KZ0010P001Struct) list.get(i)).getDESINATED_SHIP_DATE());
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
			l_SCDL_DLV_DATE.add(((KZ0010P001Struct) list.get(i)).getSCDL_DLV_DATE());
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
			l_ODR_ACPT_DATE.add(((KZ0010P001Struct) list.get(i)).getODR_ACPT_DATE());
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
			l_CUS_DLV_CD.add(((KZ0010P001Struct) list.get(i)).getCUS_DLV_CD());
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
			l_CUS_DLV_KEY_CD.add(((KZ0010P001Struct) list.get(i)).getCUS_DLV_KEY_CD());
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
			l_SPCL_PRICE_TYP.add(((KZ0010P001Struct) list.get(i)).getSPCL_PRICE_TYP());
		}
		return size;
	}
	public int setL2L_ODR_CMPLT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_CMPLT_FLG == null) {
			l_ODR_CMPLT_FLG = new ArrayList();
		} else {
			l_ODR_CMPLT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_CMPLT_FLG.add(((KZ0010P001Struct) list.get(i)).getODR_CMPLT_FLG());
		}
		return size;
	}
	public int setL2L_SHIP_CNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SHIP_CNT == null) {
			l_SHIP_CNT = new ArrayList();
		} else {
			l_SHIP_CNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SHIP_CNT.add(((KZ0010P001Struct) list.get(i)).getSHIP_CNT());
		}
		return size;
	}
	public int setL2L_T_ODR_TAX_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_ODR_TAX_CD == null) {
			l_T_ODR_TAX_CD = new ArrayList();
		} else {
			l_T_ODR_TAX_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_ODR_TAX_CD.add(((KZ0010P001Struct) list.get(i)).getT_ODR_TAX_CD());
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
			l_UNIT_COST_TYP.add(((KZ0010P001Struct) list.get(i)).getUNIT_COST_TYP());
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
			l_CUST_NAME.add(((KZ0010P001Struct) list.get(i)).getCUST_NAME());
		}
		return size;
	}
	public int setL2L_TAX_CALC_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_CALC_TYP == null) {
			l_TAX_CALC_TYP = new ArrayList();
		} else {
			l_TAX_CALC_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_CALC_TYP.add(((KZ0010P001Struct) list.get(i)).getTAX_CALC_TYP());
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
			l_TAX_APPLY_TYP.add(((KZ0010P001Struct) list.get(i)).getTAX_APPLY_TYP());
		}
		return size;
	}
	public int setL2L_TEMP_UNIT_PRICE_SALES_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TEMP_UNIT_PRICE_SALES_FLG == null) {
			l_TEMP_UNIT_PRICE_SALES_FLG = new ArrayList();
		} else {
			l_TEMP_UNIT_PRICE_SALES_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TEMP_UNIT_PRICE_SALES_FLG.add(((KZ0010P001Struct) list.get(i)).getTEMP_UNIT_PRICE_SALES_FLG());
		}
		return size;
	}
	public int setL2L_CLAIM_CYCLE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CLAIM_CYCLE_TYP == null) {
			l_CLAIM_CYCLE_TYP = new ArrayList();
		} else {
			l_CLAIM_CYCLE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CLAIM_CYCLE_TYP.add(((KZ0010P001Struct) list.get(i)).getCLAIM_CYCLE_TYP());
		}
		return size;
	}
	public int setL2L_RM_INP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RM_INP_TYP == null) {
			l_RM_INP_TYP = new ArrayList();
		} else {
			l_RM_INP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RM_INP_TYP.add(((KZ0010P001Struct) list.get(i)).getRM_INP_TYP());
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
			l_CUR_CD.add(((KZ0010P001Struct) list.get(i)).getCUR_CD());
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
			l_EXCH_TYP.add(((KZ0010P001Struct) list.get(i)).getEXCH_TYP());
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
			l_TAX_CD.add(((KZ0010P001Struct) list.get(i)).getTAX_CD());
		}
		return size;
	}
	public int setL2L_CUST_VARIOUS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_VARIOUS_TYP == null) {
			l_CUST_VARIOUS_TYP = new ArrayList();
		} else {
			l_CUST_VARIOUS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_VARIOUS_TYP.add(((KZ0010P001Struct) list.get(i)).getCUST_VARIOUS_TYP());
		}
		return size;
	}
	public int setL2L_SLIP_PRINTING_TYP_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SLIP_PRINTING_TYP_1 == null) {
			l_SLIP_PRINTING_TYP_1 = new ArrayList();
		} else {
			l_SLIP_PRINTING_TYP_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SLIP_PRINTING_TYP_1.add(((KZ0010P001Struct) list.get(i)).getSLIP_PRINTING_TYP_1());
		}
		return size;
	}
	public int setL2L_SLIP_PRINTING_TYP_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SLIP_PRINTING_TYP_2 == null) {
			l_SLIP_PRINTING_TYP_2 = new ArrayList();
		} else {
			l_SLIP_PRINTING_TYP_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SLIP_PRINTING_TYP_2.add(((KZ0010P001Struct) list.get(i)).getSLIP_PRINTING_TYP_2());
		}
		return size;
	}
	public int setL2L_SLIP_PRINTING_TYP_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SLIP_PRINTING_TYP_3 == null) {
			l_SLIP_PRINTING_TYP_3 = new ArrayList();
		} else {
			l_SLIP_PRINTING_TYP_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SLIP_PRINTING_TYP_3.add(((KZ0010P001Struct) list.get(i)).getSLIP_PRINTING_TYP_3());
		}
		return size;
	}
	public int setL2L_SLIP_PRINTING_TYP_4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SLIP_PRINTING_TYP_4 == null) {
			l_SLIP_PRINTING_TYP_4 = new ArrayList();
		} else {
			l_SLIP_PRINTING_TYP_4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SLIP_PRINTING_TYP_4.add(((KZ0010P001Struct) list.get(i)).getSLIP_PRINTING_TYP_4());
		}
		return size;
	}
	public int setL2L_SLIP_PRINTING_TYP_5(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SLIP_PRINTING_TYP_5 == null) {
			l_SLIP_PRINTING_TYP_5 = new ArrayList();
		} else {
			l_SLIP_PRINTING_TYP_5.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SLIP_PRINTING_TYP_5.add(((KZ0010P001Struct) list.get(i)).getSLIP_PRINTING_TYP_5());
		}
		return size;
	}
	public int setL2L_PRICE_RANK_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRICE_RANK_CD == null) {
			l_PRICE_RANK_CD = new ArrayList();
		} else {
			l_PRICE_RANK_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRICE_RANK_CD.add(((KZ0010P001Struct) list.get(i)).getPRICE_RANK_CD());
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
			l_INSPC_ACPT_TYP.add(((KZ0010P001Struct) list.get(i)).getINSPC_ACPT_TYP());
		}
		return size;
	}
	public int setL2L_SHIP_SLIP_ID(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SHIP_SLIP_ID == null) {
			l_SHIP_SLIP_ID = new ArrayList();
		} else {
			l_SHIP_SLIP_ID.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SHIP_SLIP_ID.add(((KZ0010P001Struct) list.get(i)).getSHIP_SLIP_ID());
		}
		return size;
	}
	public int setL2L_CARRIAGE_CHARGE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CARRIAGE_CHARGE_TYP == null) {
			l_CARRIAGE_CHARGE_TYP = new ArrayList();
		} else {
			l_CARRIAGE_CHARGE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CARRIAGE_CHARGE_TYP.add(((KZ0010P001Struct) list.get(i)).getCARRIAGE_CHARGE_TYP());
		}
		return size;
	}
	public int setL2L_BILL_ADDRESSEE_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BILL_ADDRESSEE_CD == null) {
			l_BILL_ADDRESSEE_CD = new ArrayList();
		} else {
			l_BILL_ADDRESSEE_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BILL_ADDRESSEE_CD.add(((KZ0010P001Struct) list.get(i)).getBILL_ADDRESSEE_CD());
		}
		return size;
	}
	public int setL2L_STL_COND_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STL_COND_CD == null) {
			l_STL_COND_CD = new ArrayList();
		} else {
			l_STL_COND_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STL_COND_CD.add(((KZ0010P001Struct) list.get(i)).getSTL_COND_CD());
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
			l_DLV_LOC_NAME.add(((KZ0010P001Struct) list.get(i)).getDLV_LOC_NAME());
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
			l_ZIP_CD.add(((KZ0010P001Struct) list.get(i)).getZIP_CD());
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
			l_ADDRESS_1.add(((KZ0010P001Struct) list.get(i)).getADDRESS_1());
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
			l_ADDRESS_2.add(((KZ0010P001Struct) list.get(i)).getADDRESS_2());
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
			l_CUST_ITEM_NAME.add(((KZ0010P001Struct) list.get(i)).getCUST_ITEM_NAME());
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
			l_EXCH_RATE.add(((KZ0010P001Struct) list.get(i)).getEXCH_RATE());
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
			l_SLIP_DATE.add(((KZ0010P001Struct) list.get(i)).getSLIP_DATE());
		}
		return size;
	}
	public int setL2L_SHIP_SLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SHIP_SLIP_CD == null) {
			l_SHIP_SLIP_CD = new ArrayList();
		} else {
			l_SHIP_SLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SHIP_SLIP_CD.add(((KZ0010P001Struct) list.get(i)).getSHIP_SLIP_CD());
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
			l_EXTERNAL_TAX_SALES_AMOUNT.add(((KZ0010P001Struct) list.get(i)).getEXTERNAL_TAX_SALES_AMOUNT());
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
			l_INTERNAL_TAX_SALES_AMOUNT.add(((KZ0010P001Struct) list.get(i)).getINTERNAL_TAX_SALES_AMOUNT());
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
			l_TAXFREE_SALES_AMOUNT.add(((KZ0010P001Struct) list.get(i)).getTAXFREE_SALES_AMOUNT());
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
			l_TAX_CREDIT_SALES_AMOUNT.add(((KZ0010P001Struct) list.get(i)).getTAX_CREDIT_SALES_AMOUNT());
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
			l_EXTERNAL_TAX_AMOUNT.add(((KZ0010P001Struct) list.get(i)).getEXTERNAL_TAX_AMOUNT());
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
			l_INTERNAL_TAX_AMOUNT.add(((KZ0010P001Struct) list.get(i)).getINTERNAL_TAX_AMOUNT());
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
			l_TAX_AMOUNT_1.add(((KZ0010P001Struct) list.get(i)).getTAX_AMOUNT_1());
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
			l_TAX_AMOUNT_2.add(((KZ0010P001Struct) list.get(i)).getTAX_AMOUNT_2());
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
			l_TAX_AMOUNT_3.add(((KZ0010P001Struct) list.get(i)).getTAX_AMOUNT_3());
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
			l_STATUS.add(((KZ0010P001Struct) list.get(i)).getSTATUS());
		}
		return size;
	}
	public int setL2L_EDI_DATA_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EDI_DATA_TYP == null) {
			l_EDI_DATA_TYP = new ArrayList();
		} else {
			l_EDI_DATA_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EDI_DATA_TYP.add(((KZ0010P001Struct) list.get(i)).getEDI_DATA_TYP());
		}
		return size;
	}
	public int setL2L_OLD_TAX_RATE_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OLD_TAX_RATE_1 == null) {
			l_OLD_TAX_RATE_1 = new ArrayList();
		} else {
			l_OLD_TAX_RATE_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OLD_TAX_RATE_1.add(((KZ0010P001Struct) list.get(i)).getOLD_TAX_RATE_1());
		}
		return size;
	}
	public int setL2L_OLD_TAX_RATE_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OLD_TAX_RATE_2 == null) {
			l_OLD_TAX_RATE_2 = new ArrayList();
		} else {
			l_OLD_TAX_RATE_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OLD_TAX_RATE_2.add(((KZ0010P001Struct) list.get(i)).getOLD_TAX_RATE_2());
		}
		return size;
	}
	public int setL2L_OLD_TAX_RATE_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OLD_TAX_RATE_3 == null) {
			l_OLD_TAX_RATE_3 = new ArrayList();
		} else {
			l_OLD_TAX_RATE_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OLD_TAX_RATE_3.add(((KZ0010P001Struct) list.get(i)).getOLD_TAX_RATE_3());
		}
		return size;
	}
	public int setL2L_NEW_TAX_RATE_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NEW_TAX_RATE_START_DATE == null) {
			l_NEW_TAX_RATE_START_DATE = new ArrayList();
		} else {
			l_NEW_TAX_RATE_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NEW_TAX_RATE_START_DATE.add(((KZ0010P001Struct) list.get(i)).getNEW_TAX_RATE_START_DATE());
		}
		return size;
	}
	public int setL2L_NEW_TAX_RATE_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NEW_TAX_RATE_1 == null) {
			l_NEW_TAX_RATE_1 = new ArrayList();
		} else {
			l_NEW_TAX_RATE_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NEW_TAX_RATE_1.add(((KZ0010P001Struct) list.get(i)).getNEW_TAX_RATE_1());
		}
		return size;
	}
	public int setL2L_NEW_TAX_RATE_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NEW_TAX_RATE_2 == null) {
			l_NEW_TAX_RATE_2 = new ArrayList();
		} else {
			l_NEW_TAX_RATE_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NEW_TAX_RATE_2.add(((KZ0010P001Struct) list.get(i)).getNEW_TAX_RATE_2());
		}
		return size;
	}
	public int setL2L_NEW_TAX_RATE_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NEW_TAX_RATE_3 == null) {
			l_NEW_TAX_RATE_3 = new ArrayList();
		} else {
			l_NEW_TAX_RATE_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NEW_TAX_RATE_3.add(((KZ0010P001Struct) list.get(i)).getNEW_TAX_RATE_3());
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
			l_ROUND_TYP.add(((KZ0010P001Struct) list.get(i)).getROUND_TYP());
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
			l_DECIMAL_FIG.add(((KZ0010P001Struct) list.get(i)).getDECIMAL_FIG());
		}
		return size;
	}
	public int setL2L_SEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEQ_NO == null) {
			l_SEQ_NO = new ArrayList();
		} else {
			l_SEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEQ_NO.add(((KZ0010P001Struct) list.get(i)).getSEQ_NO());
		}
		return size;
	}
	public int setL2L_LINE_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LINE_NO == null) {
			l_LINE_NO = new ArrayList();
		} else {
			l_LINE_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LINE_NO.add(((KZ0010P001Struct) list.get(i)).getLINE_NO());
		}
		return size;
	}
	public int setL2L_LINE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LINE_TYP == null) {
			l_LINE_TYP = new ArrayList();
		} else {
			l_LINE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LINE_TYP.add(((KZ0010P001Struct) list.get(i)).getLINE_TYP());
		}
		return size;
	}
	public int setL2L_COMM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COMM_CD == null) {
			l_COMM_CD = new ArrayList();
		} else {
			l_COMM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COMM_CD.add(((KZ0010P001Struct) list.get(i)).getCOMM_CD());
		}
		return size;
	}
	public int setL2L_COMM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COMM_NAME == null) {
			l_COMM_NAME = new ArrayList();
		} else {
			l_COMM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COMM_NAME.add(((KZ0010P001Struct) list.get(i)).getCOMM_NAME());
		}
		return size;
	}
	public int setL2L_SPEC(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SPEC == null) {
			l_SPEC = new ArrayList();
		} else {
			l_SPEC.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SPEC.add(((KZ0010P001Struct) list.get(i)).getSPEC());
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
			l_TAX_CD_2.add(((KZ0010P001Struct) list.get(i)).getTAX_CD_2());
		}
		return size;
	}
	public int setL2L_INP_UNIT_PRICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INP_UNIT_PRICE == null) {
			l_INP_UNIT_PRICE = new ArrayList();
		} else {
			l_INP_UNIT_PRICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INP_UNIT_PRICE.add(((KZ0010P001Struct) list.get(i)).getINP_UNIT_PRICE());
		}
		return size;
	}
	public int setL2L_UNIT_PRICE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_PRICE_TYP == null) {
			l_UNIT_PRICE_TYP = new ArrayList();
		} else {
			l_UNIT_PRICE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_PRICE_TYP.add(((KZ0010P001Struct) list.get(i)).getUNIT_PRICE_TYP());
		}
		return size;
	}
	public int setL2L_SLIP_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SLIP_QTY == null) {
			l_SLIP_QTY = new ArrayList();
		} else {
			l_SLIP_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SLIP_QTY.add(((KZ0010P001Struct) list.get(i)).getSLIP_QTY());
		}
		return size;
	}
	public int setL2L_PART_DLV_TIMES(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PART_DLV_TIMES == null) {
			l_PART_DLV_TIMES = new ArrayList();
		} else {
			l_PART_DLV_TIMES.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PART_DLV_TIMES.add(((KZ0010P001Struct) list.get(i)).getPART_DLV_TIMES());
		}
		return size;
	}
	public int setL2L_PART_DLV_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PART_DLV_TYP == null) {
			l_PART_DLV_TYP = new ArrayList();
		} else {
			l_PART_DLV_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PART_DLV_TYP.add(((KZ0010P001Struct) list.get(i)).getPART_DLV_TYP());
		}
		return size;
	}
	public int setL2L_CUST_COMM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_COMM_CD == null) {
			l_CUST_COMM_CD = new ArrayList();
		} else {
			l_CUST_COMM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_COMM_CD.add(((KZ0010P001Struct) list.get(i)).getCUST_COMM_CD());
		}
		return size;
	}
	public int setL2L_CUST_COMM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_COMM_NAME == null) {
			l_CUST_COMM_NAME = new ArrayList();
		} else {
			l_CUST_COMM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_COMM_NAME.add(((KZ0010P001Struct) list.get(i)).getCUST_COMM_NAME());
		}
		return size;
	}
	public int setL2L_CUST_ODR_SLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_ODR_SLIP_CD == null) {
			l_CUST_ODR_SLIP_CD = new ArrayList();
		} else {
			l_CUST_ODR_SLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_ODR_SLIP_CD.add(((KZ0010P001Struct) list.get(i)).getCUST_ODR_SLIP_CD());
		}
		return size;
	}
	public int setL2L_CUST_UNIT_PRICE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_UNIT_PRICE_TYP == null) {
			l_CUST_UNIT_PRICE_TYP = new ArrayList();
		} else {
			l_CUST_UNIT_PRICE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_UNIT_PRICE_TYP.add(((KZ0010P001Struct) list.get(i)).getCUST_UNIT_PRICE_TYP());
		}
		return size;
	}
	public int setL2L_OWN_CUR_SALES_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OWN_CUR_SALES_AMOUNT == null) {
			l_OWN_CUR_SALES_AMOUNT = new ArrayList();
		} else {
			l_OWN_CUR_SALES_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OWN_CUR_SALES_AMOUNT.add(((KZ0010P001Struct) list.get(i)).getOWN_CUR_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_STOCK_CTRL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_CTRL_FLG == null) {
			l_STOCK_CTRL_FLG = new ArrayList();
		} else {
			l_STOCK_CTRL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_CTRL_FLG.add(((KZ0010P001Struct) list.get(i)).getSTOCK_CTRL_FLG());
		}
		return size;
	}
	public int setL2L_DUMMY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DUMMY == null) {
			l_DUMMY = new ArrayList();
		} else {
			l_DUMMY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DUMMY.add(((KZ0010P001Struct) list.get(i)).getDUMMY());
		}
		return size;
	}
	public int setL2L_SLIP_CD2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SLIP_CD2 == null) {
			l_SLIP_CD2 = new ArrayList();
		} else {
			l_SLIP_CD2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SLIP_CD2.add(((KZ0010P001Struct) list.get(i)).getSLIP_CD2());
		}
		return size;
	}
	public int setL2L_SYSTEMDATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SYSTEMDATE == null) {
			l_SYSTEMDATE = new ArrayList();
		} else {
			l_SYSTEMDATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SYSTEMDATE.add(((KZ0010P001Struct) list.get(i)).getSYSTEMDATE());
		}
		return size;
	}
	public int setL2L_SYSTEMUSER(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SYSTEMUSER == null) {
			l_SYSTEMUSER = new ArrayList();
		} else {
			l_SYSTEMUSER.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SYSTEMUSER.add(((KZ0010P001Struct) list.get(i)).getSYSTEMUSER());
		}
		return size;
	}
	public int setL2L_PROGRAMID(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROGRAMID == null) {
			l_PROGRAMID = new ArrayList();
		} else {
			l_PROGRAMID.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROGRAMID.add(((KZ0010P001Struct) list.get(i)).getPROGRAMID());
		}
		return size;
	}
	public int setL2L_DLV_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_CD == null) {
			l_DLV_CD = new ArrayList();
		} else {
			l_DLV_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_CD.add(((KZ0010P001Struct) list.get(i)).getDLV_CD());
		}
		return size;
	}
	public int setL2L_DLV_KEY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_KEY_CD == null) {
			l_DLV_KEY_CD = new ArrayList();
		} else {
			l_DLV_KEY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_KEY_CD.add(((KZ0010P001Struct) list.get(i)).getDLV_KEY_CD());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_COMPANY_CD = null;
		m_SLIP_CTRL_GRP = null;
		m_SLIP_TRN_CD = null;
		m_STOCK_CLASS_CD = null;
		m_BALANCE_CLASS_CD = null;
		m_HOME_CUR_CD = null;
		m_SALES_DATE = null;
		m_SALES_DEPT_CD = null;
		m_CUST_CHRG_PSN_CD = null;
		m_CUST_CD = null;
		m_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_SALES_CUST_ODR_NO = null;
		m_SALES_AMOUNT = null;
		m_REMARKS = null;
		m_SALES_AMOUNT_EXCH_RATES = null;
		m_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;
		m_SALES_UNIT_PRICE = null;
		m_SALES_QTY = null;
		m_INSPC_ACPT_DATE = null;
		m_INSPC_ACPT_QTY = null;
		m_SLIP_CD = null;
		m_DLV_LOC_CD = null;
		m_SHIP_DATE = null;
		m_CUST_ODR_NO = null;
		m_ODR_NO = null;
		m_CUST_ITEM_CD = null;
		m_PART_DLV_SEQ_NO = null;
		m_SHIP_ODR_NO = null;
		m_INSPC_ACPT_INFO_IF_CTRL_NO = null;
		m_DESINATED_SHIP_DATE = null;
		m_SCDL_DLV_DATE = null;
		m_ODR_ACPT_DATE = null;
		m_CUS_DLV_CD = null;
		m_CUS_DLV_KEY_CD = null;
		m_SPCL_PRICE_TYP = null;
		m_ODR_CMPLT_FLG = null;
		m_SHIP_CNT = null;
		m_T_ODR_TAX_CD = null;
		m_UNIT_COST_TYP = null;
		m_CUST_NAME = null;
		m_TAX_CALC_TYP = null;
		m_TAX_APPLY_TYP = null;
		m_TEMP_UNIT_PRICE_SALES_FLG = null;
		m_CLAIM_CYCLE_TYP = null;
		m_RM_INP_TYP = null;
		m_CUR_CD = null;
		m_EXCH_TYP = null;
		m_TAX_CD = null;
		m_CUST_VARIOUS_TYP = null;
		m_SLIP_PRINTING_TYP_1 = null;
		m_SLIP_PRINTING_TYP_2 = null;
		m_SLIP_PRINTING_TYP_3 = null;
		m_SLIP_PRINTING_TYP_4 = null;
		m_SLIP_PRINTING_TYP_5 = null;
		m_PRICE_RANK_CD = null;
		m_INSPC_ACPT_TYP = null;
		m_SHIP_SLIP_ID = null;
		m_CARRIAGE_CHARGE_TYP = null;
		m_BILL_ADDRESSEE_CD = null;
		m_STL_COND_CD = null;
		m_DLV_LOC_NAME = null;
		m_ZIP_CD = null;
		m_ADDRESS_1 = null;
		m_ADDRESS_2 = null;
		m_CUST_ITEM_NAME = null;
		m_EXCH_RATE = null;
		m_SLIP_DATE = null;
		m_SHIP_SLIP_CD = null;
		m_EXTERNAL_TAX_SALES_AMOUNT = null;
		m_INTERNAL_TAX_SALES_AMOUNT = null;
		m_TAXFREE_SALES_AMOUNT = null;
		m_TAX_CREDIT_SALES_AMOUNT = null;
		m_EXTERNAL_TAX_AMOUNT = null;
		m_INTERNAL_TAX_AMOUNT = null;
		m_TAX_AMOUNT_1 = null;
		m_TAX_AMOUNT_2 = null;
		m_TAX_AMOUNT_3 = null;
		m_STATUS = null;
		m_EDI_DATA_TYP = null;
		m_OLD_TAX_RATE_1 = null;
		m_OLD_TAX_RATE_2 = null;
		m_OLD_TAX_RATE_3 = null;
		m_NEW_TAX_RATE_START_DATE = null;
		m_NEW_TAX_RATE_1 = null;
		m_NEW_TAX_RATE_2 = null;
		m_NEW_TAX_RATE_3 = null;
		m_ROUND_TYP = null;
		m_DECIMAL_FIG = null;
		m_SEQ_NO = null;
		m_LINE_NO = null;
		m_LINE_TYP = null;
		m_COMM_CD = null;
		m_COMM_NAME = null;
		m_SPEC = null;
		m_TAX_CD_2 = null;
		m_INP_UNIT_PRICE = null;
		m_UNIT_PRICE_TYP = null;
		m_SLIP_QTY = null;
		m_PART_DLV_TIMES = null;
		m_PART_DLV_TYP = null;
		m_CUST_COMM_CD = null;
		m_CUST_COMM_NAME = null;
		m_CUST_ODR_SLIP_CD = null;
		m_CUST_UNIT_PRICE_TYP = null;
		m_OWN_CUR_SALES_AMOUNT = null;
		m_STOCK_CTRL_FLG = null;
		m_DUMMY = null;
		m_SLIP_CD2 = null;
		m_SYSTEMDATE = null;
		m_SYSTEMUSER = null;
		m_PROGRAMID = null;
		m_DLV_CD = null;
		m_DLV_KEY_CD = null;

		l_COMPANY_CD = null;
		l_SLIP_CTRL_GRP = null;
		l_SLIP_TRN_CD = null;
		l_STOCK_CLASS_CD = null;
		l_BALANCE_CLASS_CD = null;
		l_HOME_CUR_CD = null;
		l_SALES_DATE = null;
		l_SALES_DEPT_CD = null;
		l_CUST_CHRG_PSN_CD = null;
		l_CUST_CD = null;
		l_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_SALES_CUST_ODR_NO = null;
		l_SALES_AMOUNT = null;
		l_REMARKS = null;
		l_SALES_AMOUNT_EXCH_RATES = null;
		l_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;
		l_SALES_UNIT_PRICE = null;
		l_SALES_QTY = null;
		l_INSPC_ACPT_DATE = null;
		l_INSPC_ACPT_QTY = null;
		l_SLIP_CD = null;
		l_DLV_LOC_CD = null;
		l_SHIP_DATE = null;
		l_CUST_ODR_NO = null;
		l_ODR_NO = null;
		l_CUST_ITEM_CD = null;
		l_PART_DLV_SEQ_NO = null;
		l_SHIP_ODR_NO = null;
		l_INSPC_ACPT_INFO_IF_CTRL_NO = null;
		l_DESINATED_SHIP_DATE = null;
		l_SCDL_DLV_DATE = null;
		l_ODR_ACPT_DATE = null;
		l_CUS_DLV_CD = null;
		l_CUS_DLV_KEY_CD = null;
		l_SPCL_PRICE_TYP = null;
		l_ODR_CMPLT_FLG = null;
		l_SHIP_CNT = null;
		l_T_ODR_TAX_CD = null;
		l_UNIT_COST_TYP = null;
		l_CUST_NAME = null;
		l_TAX_CALC_TYP = null;
		l_TAX_APPLY_TYP = null;
		l_TEMP_UNIT_PRICE_SALES_FLG = null;
		l_CLAIM_CYCLE_TYP = null;
		l_RM_INP_TYP = null;
		l_CUR_CD = null;
		l_EXCH_TYP = null;
		l_TAX_CD = null;
		l_CUST_VARIOUS_TYP = null;
		l_SLIP_PRINTING_TYP_1 = null;
		l_SLIP_PRINTING_TYP_2 = null;
		l_SLIP_PRINTING_TYP_3 = null;
		l_SLIP_PRINTING_TYP_4 = null;
		l_SLIP_PRINTING_TYP_5 = null;
		l_PRICE_RANK_CD = null;
		l_INSPC_ACPT_TYP = null;
		l_SHIP_SLIP_ID = null;
		l_CARRIAGE_CHARGE_TYP = null;
		l_BILL_ADDRESSEE_CD = null;
		l_STL_COND_CD = null;
		l_DLV_LOC_NAME = null;
		l_ZIP_CD = null;
		l_ADDRESS_1 = null;
		l_ADDRESS_2 = null;
		l_CUST_ITEM_NAME = null;
		l_EXCH_RATE = null;
		l_SLIP_DATE = null;
		l_SHIP_SLIP_CD = null;
		l_EXTERNAL_TAX_SALES_AMOUNT = null;
		l_INTERNAL_TAX_SALES_AMOUNT = null;
		l_TAXFREE_SALES_AMOUNT = null;
		l_TAX_CREDIT_SALES_AMOUNT = null;
		l_EXTERNAL_TAX_AMOUNT = null;
		l_INTERNAL_TAX_AMOUNT = null;
		l_TAX_AMOUNT_1 = null;
		l_TAX_AMOUNT_2 = null;
		l_TAX_AMOUNT_3 = null;
		l_STATUS = null;
		l_EDI_DATA_TYP = null;
		l_OLD_TAX_RATE_1 = null;
		l_OLD_TAX_RATE_2 = null;
		l_OLD_TAX_RATE_3 = null;
		l_NEW_TAX_RATE_START_DATE = null;
		l_NEW_TAX_RATE_1 = null;
		l_NEW_TAX_RATE_2 = null;
		l_NEW_TAX_RATE_3 = null;
		l_ROUND_TYP = null;
		l_DECIMAL_FIG = null;
		l_SEQ_NO = null;
		l_LINE_NO = null;
		l_LINE_TYP = null;
		l_COMM_CD = null;
		l_COMM_NAME = null;
		l_SPEC = null;
		l_TAX_CD_2 = null;
		l_INP_UNIT_PRICE = null;
		l_UNIT_PRICE_TYP = null;
		l_SLIP_QTY = null;
		l_PART_DLV_TIMES = null;
		l_PART_DLV_TYP = null;
		l_CUST_COMM_CD = null;
		l_CUST_COMM_NAME = null;
		l_CUST_ODR_SLIP_CD = null;
		l_CUST_UNIT_PRICE_TYP = null;
		l_OWN_CUR_SALES_AMOUNT = null;
		l_STOCK_CTRL_FLG = null;
		l_DUMMY = null;
		l_SLIP_CD2 = null;
		l_SYSTEMDATE = null;
		l_SYSTEMUSER = null;
		l_PROGRAMID = null;
		l_DLV_CD = null;
		l_DLV_KEY_CD = null;

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
	 * medKZ0010P001�N���X�̕W���R���X�g���N�^
	 */
	public KZ0010P001Struct()
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
	public void setStruct(KZ0010P001Struct struct)
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
	public void setStructM(KZ0010P001Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setSLIP_CTRL_GRP(struct.getSLIP_CTRL_GRP());
			this.setSLIP_TRN_CD(struct.getSLIP_TRN_CD());
			this.setSTOCK_CLASS_CD(struct.getSTOCK_CLASS_CD());
			this.setBALANCE_CLASS_CD(struct.getBALANCE_CLASS_CD());
			this.setHOME_CUR_CD(struct.getHOME_CUR_CD());
			this.setSALES_DATE(struct.getSALES_DATE());
			this.setSALES_DEPT_CD(struct.getSALES_DEPT_CD());
			this.setCUST_CHRG_PSN_CD(struct.getCUST_CHRG_PSN_CD());
			this.setCUST_CD(struct.getCUST_CD());
			this.setITEM_CD(struct.getITEM_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setSALES_CUST_ODR_NO(struct.getSALES_CUST_ODR_NO());
			this.setSALES_AMOUNT(struct.getSALES_AMOUNT());
			this.setREMARKS(struct.getREMARKS());
			this.setSALES_AMOUNT_EXCH_RATES(struct.getSALES_AMOUNT_EXCH_RATES());
			this.setOWN_CUR_TAXCREDIT_SALES_AMOUNT(struct.getOWN_CUR_TAXCREDIT_SALES_AMOUNT());
			this.setSALES_UNIT_PRICE(struct.getSALES_UNIT_PRICE());
			this.setSALES_QTY(struct.getSALES_QTY());
			this.setINSPC_ACPT_DATE(struct.getINSPC_ACPT_DATE());
			this.setINSPC_ACPT_QTY(struct.getINSPC_ACPT_QTY());
			this.setSLIP_CD(struct.getSLIP_CD());
			this.setDLV_LOC_CD(struct.getDLV_LOC_CD());
			this.setSHIP_DATE(struct.getSHIP_DATE());
			this.setCUST_ODR_NO(struct.getCUST_ODR_NO());
			this.setODR_NO(struct.getODR_NO());
			this.setCUST_ITEM_CD(struct.getCUST_ITEM_CD());
			this.setPART_DLV_SEQ_NO(struct.getPART_DLV_SEQ_NO());
			this.setSHIP_ODR_NO(struct.getSHIP_ODR_NO());
			this.setINSPC_ACPT_INFO_IF_CTRL_NO(struct.getINSPC_ACPT_INFO_IF_CTRL_NO());
			this.setDESINATED_SHIP_DATE(struct.getDESINATED_SHIP_DATE());
			this.setSCDL_DLV_DATE(struct.getSCDL_DLV_DATE());
			this.setODR_ACPT_DATE(struct.getODR_ACPT_DATE());
			this.setCUS_DLV_CD(struct.getCUS_DLV_CD());
			this.setCUS_DLV_KEY_CD(struct.getCUS_DLV_KEY_CD());
			this.setSPCL_PRICE_TYP(struct.getSPCL_PRICE_TYP());
			this.setODR_CMPLT_FLG(struct.getODR_CMPLT_FLG());
			this.setSHIP_CNT(struct.getSHIP_CNT());
			this.setT_ODR_TAX_CD(struct.getT_ODR_TAX_CD());
			this.setUNIT_COST_TYP(struct.getUNIT_COST_TYP());
			this.setCUST_NAME(struct.getCUST_NAME());
			this.setTAX_CALC_TYP(struct.getTAX_CALC_TYP());
			this.setTAX_APPLY_TYP(struct.getTAX_APPLY_TYP());
			this.setTEMP_UNIT_PRICE_SALES_FLG(struct.getTEMP_UNIT_PRICE_SALES_FLG());
			this.setCLAIM_CYCLE_TYP(struct.getCLAIM_CYCLE_TYP());
			this.setRM_INP_TYP(struct.getRM_INP_TYP());
			this.setCUR_CD(struct.getCUR_CD());
			this.setEXCH_TYP(struct.getEXCH_TYP());
			this.setTAX_CD(struct.getTAX_CD());
			this.setCUST_VARIOUS_TYP(struct.getCUST_VARIOUS_TYP());
			this.setSLIP_PRINTING_TYP_1(struct.getSLIP_PRINTING_TYP_1());
			this.setSLIP_PRINTING_TYP_2(struct.getSLIP_PRINTING_TYP_2());
			this.setSLIP_PRINTING_TYP_3(struct.getSLIP_PRINTING_TYP_3());
			this.setSLIP_PRINTING_TYP_4(struct.getSLIP_PRINTING_TYP_4());
			this.setSLIP_PRINTING_TYP_5(struct.getSLIP_PRINTING_TYP_5());
			this.setPRICE_RANK_CD(struct.getPRICE_RANK_CD());
			this.setINSPC_ACPT_TYP(struct.getINSPC_ACPT_TYP());
			this.setSHIP_SLIP_ID(struct.getSHIP_SLIP_ID());
			this.setCARRIAGE_CHARGE_TYP(struct.getCARRIAGE_CHARGE_TYP());
			this.setBILL_ADDRESSEE_CD(struct.getBILL_ADDRESSEE_CD());
			this.setSTL_COND_CD(struct.getSTL_COND_CD());
			this.setDLV_LOC_NAME(struct.getDLV_LOC_NAME());
			this.setZIP_CD(struct.getZIP_CD());
			this.setADDRESS_1(struct.getADDRESS_1());
			this.setADDRESS_2(struct.getADDRESS_2());
			this.setCUST_ITEM_NAME(struct.getCUST_ITEM_NAME());
			this.setEXCH_RATE(struct.getEXCH_RATE());
			this.setSLIP_DATE(struct.getSLIP_DATE());
			this.setSHIP_SLIP_CD(struct.getSHIP_SLIP_CD());
			this.setEXTERNAL_TAX_SALES_AMOUNT(struct.getEXTERNAL_TAX_SALES_AMOUNT());
			this.setINTERNAL_TAX_SALES_AMOUNT(struct.getINTERNAL_TAX_SALES_AMOUNT());
			this.setTAXFREE_SALES_AMOUNT(struct.getTAXFREE_SALES_AMOUNT());
			this.setTAX_CREDIT_SALES_AMOUNT(struct.getTAX_CREDIT_SALES_AMOUNT());
			this.setEXTERNAL_TAX_AMOUNT(struct.getEXTERNAL_TAX_AMOUNT());
			this.setINTERNAL_TAX_AMOUNT(struct.getINTERNAL_TAX_AMOUNT());
			this.setTAX_AMOUNT_1(struct.getTAX_AMOUNT_1());
			this.setTAX_AMOUNT_2(struct.getTAX_AMOUNT_2());
			this.setTAX_AMOUNT_3(struct.getTAX_AMOUNT_3());
			this.setSTATUS(struct.getSTATUS());
			this.setEDI_DATA_TYP(struct.getEDI_DATA_TYP());
			this.setOLD_TAX_RATE_1(struct.getOLD_TAX_RATE_1());
			this.setOLD_TAX_RATE_2(struct.getOLD_TAX_RATE_2());
			this.setOLD_TAX_RATE_3(struct.getOLD_TAX_RATE_3());
			this.setNEW_TAX_RATE_START_DATE(struct.getNEW_TAX_RATE_START_DATE());
			this.setNEW_TAX_RATE_1(struct.getNEW_TAX_RATE_1());
			this.setNEW_TAX_RATE_2(struct.getNEW_TAX_RATE_2());
			this.setNEW_TAX_RATE_3(struct.getNEW_TAX_RATE_3());
			this.setROUND_TYP(struct.getROUND_TYP());
			this.setDECIMAL_FIG(struct.getDECIMAL_FIG());
			this.setSEQ_NO(struct.getSEQ_NO());
			this.setLINE_NO(struct.getLINE_NO());
			this.setLINE_TYP(struct.getLINE_TYP());
			this.setCOMM_CD(struct.getCOMM_CD());
			this.setCOMM_NAME(struct.getCOMM_NAME());
			this.setSPEC(struct.getSPEC());
			this.setTAX_CD_2(struct.getTAX_CD_2());
			this.setINP_UNIT_PRICE(struct.getINP_UNIT_PRICE());
			this.setUNIT_PRICE_TYP(struct.getUNIT_PRICE_TYP());
			this.setSLIP_QTY(struct.getSLIP_QTY());
			this.setPART_DLV_TIMES(struct.getPART_DLV_TIMES());
			this.setPART_DLV_TYP(struct.getPART_DLV_TYP());
			this.setCUST_COMM_CD(struct.getCUST_COMM_CD());
			this.setCUST_COMM_NAME(struct.getCUST_COMM_NAME());
			this.setCUST_ODR_SLIP_CD(struct.getCUST_ODR_SLIP_CD());
			this.setCUST_UNIT_PRICE_TYP(struct.getCUST_UNIT_PRICE_TYP());
			this.setOWN_CUR_SALES_AMOUNT(struct.getOWN_CUR_SALES_AMOUNT());
			this.setSTOCK_CTRL_FLG(struct.getSTOCK_CTRL_FLG());
			this.setDUMMY(struct.getDUMMY());
			this.setSLIP_CD2(struct.getSLIP_CD2());
			this.setSYSTEMDATE(struct.getSYSTEMDATE());
			this.setSYSTEMUSER(struct.getSYSTEMUSER());
			this.setPROGRAMID(struct.getPROGRAMID());
			this.setDLV_CD(struct.getDLV_CD());
			this.setDLV_KEY_CD(struct.getDLV_KEY_CD());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(KZ0010P001Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_SLIP_CTRL_GRP(struct.getList_SLIP_CTRL_GRP());
			this.setList_SLIP_TRN_CD(struct.getList_SLIP_TRN_CD());
			this.setList_STOCK_CLASS_CD(struct.getList_STOCK_CLASS_CD());
			this.setList_BALANCE_CLASS_CD(struct.getList_BALANCE_CLASS_CD());
			this.setList_HOME_CUR_CD(struct.getList_HOME_CUR_CD());
			this.setList_SALES_DATE(struct.getList_SALES_DATE());
			this.setList_SALES_DEPT_CD(struct.getList_SALES_DEPT_CD());
			this.setList_CUST_CHRG_PSN_CD(struct.getList_CUST_CHRG_PSN_CD());
			this.setList_CUST_CD(struct.getList_CUST_CD());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_SALES_CUST_ODR_NO(struct.getList_SALES_CUST_ODR_NO());
			this.setList_SALES_AMOUNT(struct.getList_SALES_AMOUNT());
			this.setList_REMARKS(struct.getList_REMARKS());
			this.setList_SALES_AMOUNT_EXCH_RATES(struct.getList_SALES_AMOUNT_EXCH_RATES());
			this.setList_OWN_CUR_TAXCREDIT_SALES_AMOUNT(struct.getList_OWN_CUR_TAXCREDIT_SALES_AMOUNT());
			this.setList_SALES_UNIT_PRICE(struct.getList_SALES_UNIT_PRICE());
			this.setList_SALES_QTY(struct.getList_SALES_QTY());
			this.setList_INSPC_ACPT_DATE(struct.getList_INSPC_ACPT_DATE());
			this.setList_INSPC_ACPT_QTY(struct.getList_INSPC_ACPT_QTY());
			this.setList_SLIP_CD(struct.getList_SLIP_CD());
			this.setList_DLV_LOC_CD(struct.getList_DLV_LOC_CD());
			this.setList_SHIP_DATE(struct.getList_SHIP_DATE());
			this.setList_CUST_ODR_NO(struct.getList_CUST_ODR_NO());
			this.setList_ODR_NO(struct.getList_ODR_NO());
			this.setList_CUST_ITEM_CD(struct.getList_CUST_ITEM_CD());
			this.setList_PART_DLV_SEQ_NO(struct.getList_PART_DLV_SEQ_NO());
			this.setList_SHIP_ODR_NO(struct.getList_SHIP_ODR_NO());
			this.setList_INSPC_ACPT_INFO_IF_CTRL_NO(struct.getList_INSPC_ACPT_INFO_IF_CTRL_NO());
			this.setList_DESINATED_SHIP_DATE(struct.getList_DESINATED_SHIP_DATE());
			this.setList_SCDL_DLV_DATE(struct.getList_SCDL_DLV_DATE());
			this.setList_ODR_ACPT_DATE(struct.getList_ODR_ACPT_DATE());
			this.setList_CUS_DLV_CD(struct.getList_CUS_DLV_CD());
			this.setList_CUS_DLV_KEY_CD(struct.getList_CUS_DLV_KEY_CD());
			this.setList_SPCL_PRICE_TYP(struct.getList_SPCL_PRICE_TYP());
			this.setList_ODR_CMPLT_FLG(struct.getList_ODR_CMPLT_FLG());
			this.setList_SHIP_CNT(struct.getList_SHIP_CNT());
			this.setList_T_ODR_TAX_CD(struct.getList_T_ODR_TAX_CD());
			this.setList_UNIT_COST_TYP(struct.getList_UNIT_COST_TYP());
			this.setList_CUST_NAME(struct.getList_CUST_NAME());
			this.setList_TAX_CALC_TYP(struct.getList_TAX_CALC_TYP());
			this.setList_TAX_APPLY_TYP(struct.getList_TAX_APPLY_TYP());
			this.setList_TEMP_UNIT_PRICE_SALES_FLG(struct.getList_TEMP_UNIT_PRICE_SALES_FLG());
			this.setList_CLAIM_CYCLE_TYP(struct.getList_CLAIM_CYCLE_TYP());
			this.setList_RM_INP_TYP(struct.getList_RM_INP_TYP());
			this.setList_CUR_CD(struct.getList_CUR_CD());
			this.setList_EXCH_TYP(struct.getList_EXCH_TYP());
			this.setList_TAX_CD(struct.getList_TAX_CD());
			this.setList_CUST_VARIOUS_TYP(struct.getList_CUST_VARIOUS_TYP());
			this.setList_SLIP_PRINTING_TYP_1(struct.getList_SLIP_PRINTING_TYP_1());
			this.setList_SLIP_PRINTING_TYP_2(struct.getList_SLIP_PRINTING_TYP_2());
			this.setList_SLIP_PRINTING_TYP_3(struct.getList_SLIP_PRINTING_TYP_3());
			this.setList_SLIP_PRINTING_TYP_4(struct.getList_SLIP_PRINTING_TYP_4());
			this.setList_SLIP_PRINTING_TYP_5(struct.getList_SLIP_PRINTING_TYP_5());
			this.setList_PRICE_RANK_CD(struct.getList_PRICE_RANK_CD());
			this.setList_INSPC_ACPT_TYP(struct.getList_INSPC_ACPT_TYP());
			this.setList_SHIP_SLIP_ID(struct.getList_SHIP_SLIP_ID());
			this.setList_CARRIAGE_CHARGE_TYP(struct.getList_CARRIAGE_CHARGE_TYP());
			this.setList_BILL_ADDRESSEE_CD(struct.getList_BILL_ADDRESSEE_CD());
			this.setList_STL_COND_CD(struct.getList_STL_COND_CD());
			this.setList_DLV_LOC_NAME(struct.getList_DLV_LOC_NAME());
			this.setList_ZIP_CD(struct.getList_ZIP_CD());
			this.setList_ADDRESS_1(struct.getList_ADDRESS_1());
			this.setList_ADDRESS_2(struct.getList_ADDRESS_2());
			this.setList_CUST_ITEM_NAME(struct.getList_CUST_ITEM_NAME());
			this.setList_EXCH_RATE(struct.getList_EXCH_RATE());
			this.setList_SLIP_DATE(struct.getList_SLIP_DATE());
			this.setList_SHIP_SLIP_CD(struct.getList_SHIP_SLIP_CD());
			this.setList_EXTERNAL_TAX_SALES_AMOUNT(struct.getList_EXTERNAL_TAX_SALES_AMOUNT());
			this.setList_INTERNAL_TAX_SALES_AMOUNT(struct.getList_INTERNAL_TAX_SALES_AMOUNT());
			this.setList_TAXFREE_SALES_AMOUNT(struct.getList_TAXFREE_SALES_AMOUNT());
			this.setList_TAX_CREDIT_SALES_AMOUNT(struct.getList_TAX_CREDIT_SALES_AMOUNT());
			this.setList_EXTERNAL_TAX_AMOUNT(struct.getList_EXTERNAL_TAX_AMOUNT());
			this.setList_INTERNAL_TAX_AMOUNT(struct.getList_INTERNAL_TAX_AMOUNT());
			this.setList_TAX_AMOUNT_1(struct.getList_TAX_AMOUNT_1());
			this.setList_TAX_AMOUNT_2(struct.getList_TAX_AMOUNT_2());
			this.setList_TAX_AMOUNT_3(struct.getList_TAX_AMOUNT_3());
			this.setList_STATUS(struct.getList_STATUS());
			this.setList_EDI_DATA_TYP(struct.getList_EDI_DATA_TYP());
			this.setList_OLD_TAX_RATE_1(struct.getList_OLD_TAX_RATE_1());
			this.setList_OLD_TAX_RATE_2(struct.getList_OLD_TAX_RATE_2());
			this.setList_OLD_TAX_RATE_3(struct.getList_OLD_TAX_RATE_3());
			this.setList_NEW_TAX_RATE_START_DATE(struct.getList_NEW_TAX_RATE_START_DATE());
			this.setList_NEW_TAX_RATE_1(struct.getList_NEW_TAX_RATE_1());
			this.setList_NEW_TAX_RATE_2(struct.getList_NEW_TAX_RATE_2());
			this.setList_NEW_TAX_RATE_3(struct.getList_NEW_TAX_RATE_3());
			this.setList_ROUND_TYP(struct.getList_ROUND_TYP());
			this.setList_DECIMAL_FIG(struct.getList_DECIMAL_FIG());
			this.setList_SEQ_NO(struct.getList_SEQ_NO());
			this.setList_LINE_NO(struct.getList_LINE_NO());
			this.setList_LINE_TYP(struct.getList_LINE_TYP());
			this.setList_COMM_CD(struct.getList_COMM_CD());
			this.setList_COMM_NAME(struct.getList_COMM_NAME());
			this.setList_SPEC(struct.getList_SPEC());
			this.setList_TAX_CD_2(struct.getList_TAX_CD_2());
			this.setList_INP_UNIT_PRICE(struct.getList_INP_UNIT_PRICE());
			this.setList_UNIT_PRICE_TYP(struct.getList_UNIT_PRICE_TYP());
			this.setList_SLIP_QTY(struct.getList_SLIP_QTY());
			this.setList_PART_DLV_TIMES(struct.getList_PART_DLV_TIMES());
			this.setList_PART_DLV_TYP(struct.getList_PART_DLV_TYP());
			this.setList_CUST_COMM_CD(struct.getList_CUST_COMM_CD());
			this.setList_CUST_COMM_NAME(struct.getList_CUST_COMM_NAME());
			this.setList_CUST_ODR_SLIP_CD(struct.getList_CUST_ODR_SLIP_CD());
			this.setList_CUST_UNIT_PRICE_TYP(struct.getList_CUST_UNIT_PRICE_TYP());
			this.setList_OWN_CUR_SALES_AMOUNT(struct.getList_OWN_CUR_SALES_AMOUNT());
			this.setList_STOCK_CTRL_FLG(struct.getList_STOCK_CTRL_FLG());
			this.setList_DUMMY(struct.getList_DUMMY());
			this.setList_SLIP_CD2(struct.getList_SLIP_CD2());
			this.setList_SYSTEMDATE(struct.getList_SYSTEMDATE());
			this.setList_SYSTEMUSER(struct.getList_SYSTEMUSER());
			this.setList_PROGRAMID(struct.getList_PROGRAMID());
			this.setList_DLV_CD(struct.getList_DLV_CD());
			this.setList_DLV_KEY_CD(struct.getList_DLV_KEY_CD());
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
	// �� 1 �ϐ������l�F i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// �� 2 �ϐ������l�F i_SLIP_CTRL_GRP


	final static String i_SLIP_CTRL_GRP = null;

	// �� 3 �ϐ������l�F i_SLIP_TRN_CD


	final static String i_SLIP_TRN_CD = null;

	// �� 4 �ϐ������l�F i_STOCK_CLASS_CD


	final static String i_STOCK_CLASS_CD = null;

	// �� 5 �ϐ������l�F i_BALANCE_CLASS_CD


	final static String i_BALANCE_CLASS_CD = null;

	// �� 6 �ϐ������l�F i_HOME_CUR_CD


	final static String i_HOME_CUR_CD = null;

	// �� 7 �ϐ������l�F i_SALES_DATE


	final static String i_SALES_DATE = null;

	// �� 8 �ϐ������l�F i_SALES_DEPT_CD


	final static String i_SALES_DEPT_CD = null;

	// �� 9 �ϐ������l�F i_CUST_CHRG_PSN_CD


	final static String i_CUST_CHRG_PSN_CD = null;

	// �� 10 �ϐ������l�F i_CUST_CD


	final static String i_CUST_CD = null;

	// �� 11 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 12 �ϐ������l�F i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// �� 13 �ϐ������l�F i_SALES_CUST_ODR_NO


	final static String i_SALES_CUST_ODR_NO = null;

	// �� 14 �ϐ������l�F i_SALES_AMOUNT


	final static String i_SALES_AMOUNT = null;

	// �� 15 �ϐ������l�F i_REMARKS


	final static String i_REMARKS = null;

	// �� 16 �ϐ������l�F i_SALES_AMOUNT_EXCH_RATES


	final static String i_SALES_AMOUNT_EXCH_RATES = null;

	// �� 17 �ϐ������l�F i_OWN_CUR_TAXCREDIT_SALES_AMOUNT


	final static String i_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;

	// �� 18 �ϐ������l�F i_SALES_UNIT_PRICE


	final static String i_SALES_UNIT_PRICE = null;

	// �� 19 �ϐ������l�F i_SALES_QTY


	final static String i_SALES_QTY = null;

	// �� 20 �ϐ������l�F i_INSPC_ACPT_DATE


	final static String i_INSPC_ACPT_DATE = null;

	// �� 21 �ϐ������l�F i_INSPC_ACPT_QTY


	final static String i_INSPC_ACPT_QTY = null;

	// �� 22 �ϐ������l�F i_SLIP_CD


	final static String i_SLIP_CD = null;

	// �� 23 �ϐ������l�F i_DLV_LOC_CD


	final static String i_DLV_LOC_CD = null;

	// �� 24 �ϐ������l�F i_SHIP_DATE


	final static String i_SHIP_DATE = null;

	// �� 25 �ϐ������l�F i_CUST_ODR_NO


	final static String i_CUST_ODR_NO = null;

	// �� 26 �ϐ������l�F i_ODR_NO


	final static String i_ODR_NO = null;

	// �� 27 �ϐ������l�F i_CUST_ITEM_CD


	final static String i_CUST_ITEM_CD = null;

	// �� 28 �ϐ������l�F i_PART_DLV_SEQ_NO


	final static String i_PART_DLV_SEQ_NO = null;

	// �� 29 �ϐ������l�F i_SHIP_ODR_NO


	final static String i_SHIP_ODR_NO = null;

	// �� 30 �ϐ������l�F i_INSPC_ACPT_INFO_IF_CTRL_NO


	final static String i_INSPC_ACPT_INFO_IF_CTRL_NO = null;

	// �� 31 �ϐ������l�F i_DESINATED_SHIP_DATE


	final static String i_DESINATED_SHIP_DATE = null;

	// �� 32 �ϐ������l�F i_SCDL_DLV_DATE


	final static String i_SCDL_DLV_DATE = null;

	// �� 33 �ϐ������l�F i_ODR_ACPT_DATE


	final static String i_ODR_ACPT_DATE = null;

	// �� 34 �ϐ������l�F i_CUS_DLV_CD


	final static String i_CUS_DLV_CD = null;

	// �� 35 �ϐ������l�F i_CUS_DLV_KEY_CD


	final static String i_CUS_DLV_KEY_CD = null;

	// �� 36 �ϐ������l�F i_SPCL_PRICE_TYP


	final static String i_SPCL_PRICE_TYP = null;

	// �� 37 �ϐ������l�F i_ODR_CMPLT_FLG


	final static String i_ODR_CMPLT_FLG = null;

	// �� 38 �ϐ������l�F i_SHIP_CNT


	final static String i_SHIP_CNT = null;

	// �� 39 �ϐ������l�F i_T_ODR_TAX_CD


	final static String i_T_ODR_TAX_CD = null;

	// �� 40 �ϐ������l�F i_UNIT_COST_TYP


	final static String i_UNIT_COST_TYP = null;

	// �� 41 �ϐ������l�F i_CUST_NAME


	final static String i_CUST_NAME = null;

	// �� 42 �ϐ������l�F i_TAX_CALC_TYP


	final static String i_TAX_CALC_TYP = null;

	// �� 43 �ϐ������l�F i_TAX_APPLY_TYP


	final static String i_TAX_APPLY_TYP = null;

	// �� 44 �ϐ������l�F i_TEMP_UNIT_PRICE_SALES_FLG


	final static String i_TEMP_UNIT_PRICE_SALES_FLG = null;

	// �� 45 �ϐ������l�F i_CLAIM_CYCLE_TYP


	final static String i_CLAIM_CYCLE_TYP = null;

	// �� 46 �ϐ������l�F i_RM_INP_TYP


	final static String i_RM_INP_TYP = null;

	// �� 47 �ϐ������l�F i_CUR_CD


	final static String i_CUR_CD = null;

	// �� 48 �ϐ������l�F i_EXCH_TYP


	final static String i_EXCH_TYP = null;

	// �� 49 �ϐ������l�F i_TAX_CD


	final static String i_TAX_CD = null;

	// �� 50 �ϐ������l�F i_CUST_VARIOUS_TYP


	final static String i_CUST_VARIOUS_TYP = null;

	// �� 51 �ϐ������l�F i_SLIP_PRINTING_TYP_1


	final static String i_SLIP_PRINTING_TYP_1 = null;

	// �� 52 �ϐ������l�F i_SLIP_PRINTING_TYP_2


	final static String i_SLIP_PRINTING_TYP_2 = null;

	// �� 53 �ϐ������l�F i_SLIP_PRINTING_TYP_3


	final static String i_SLIP_PRINTING_TYP_3 = null;

	// �� 54 �ϐ������l�F i_SLIP_PRINTING_TYP_4


	final static String i_SLIP_PRINTING_TYP_4 = null;

	// �� 55 �ϐ������l�F i_SLIP_PRINTING_TYP_5


	final static String i_SLIP_PRINTING_TYP_5 = null;

	// �� 56 �ϐ������l�F i_PRICE_RANK_CD


	final static String i_PRICE_RANK_CD = null;

	// �� 57 �ϐ������l�F i_INSPC_ACPT_TYP


	final static String i_INSPC_ACPT_TYP = null;

	// �� 58 �ϐ������l�F i_SHIP_SLIP_ID


	final static String i_SHIP_SLIP_ID = null;

	// �� 59 �ϐ������l�F i_CARRIAGE_CHARGE_TYP


	final static String i_CARRIAGE_CHARGE_TYP = null;

	// �� 60 �ϐ������l�F i_BILL_ADDRESSEE_CD


	final static String i_BILL_ADDRESSEE_CD = null;

	// �� 61 �ϐ������l�F i_STL_COND_CD


	final static String i_STL_COND_CD = null;

	// �� 62 �ϐ������l�F i_DLV_LOC_NAME


	final static String i_DLV_LOC_NAME = null;

	// �� 63 �ϐ������l�F i_ZIP_CD


	final static String i_ZIP_CD = null;

	// �� 64 �ϐ������l�F i_ADDRESS_1


	final static String i_ADDRESS_1 = null;

	// �� 65 �ϐ������l�F i_ADDRESS_2


	final static String i_ADDRESS_2 = null;

	// �� 66 �ϐ������l�F i_CUST_ITEM_NAME


	final static String i_CUST_ITEM_NAME = null;

	// �� 67 �ϐ������l�F i_EXCH_RATE


	final static String i_EXCH_RATE = null;

	// �� 68 �ϐ������l�F i_SLIP_DATE


	final static String i_SLIP_DATE = null;

	// �� 69 �ϐ������l�F i_SHIP_SLIP_CD


	final static String i_SHIP_SLIP_CD = null;

	// �� 70 �ϐ������l�F i_EXTERNAL_TAX_SALES_AMOUNT


	final static String i_EXTERNAL_TAX_SALES_AMOUNT = null;

	// �� 71 �ϐ������l�F i_INTERNAL_TAX_SALES_AMOUNT


	final static String i_INTERNAL_TAX_SALES_AMOUNT = null;

	// �� 72 �ϐ������l�F i_TAXFREE_SALES_AMOUNT


	final static String i_TAXFREE_SALES_AMOUNT = null;

	// �� 73 �ϐ������l�F i_TAX_CREDIT_SALES_AMOUNT


	final static String i_TAX_CREDIT_SALES_AMOUNT = null;

	// �� 74 �ϐ������l�F i_EXTERNAL_TAX_AMOUNT


	final static String i_EXTERNAL_TAX_AMOUNT = null;

	// �� 75 �ϐ������l�F i_INTERNAL_TAX_AMOUNT


	final static String i_INTERNAL_TAX_AMOUNT = null;

	// �� 76 �ϐ������l�F i_TAX_AMOUNT_1


	final static String i_TAX_AMOUNT_1 = null;

	// �� 77 �ϐ������l�F i_TAX_AMOUNT_2


	final static String i_TAX_AMOUNT_2 = null;

	// �� 78 �ϐ������l�F i_TAX_AMOUNT_3


	final static String i_TAX_AMOUNT_3 = null;

	// �� 79 �ϐ������l�F i_STATUS


	final static String i_STATUS = null;

	// �� 80 �ϐ������l�F i_EDI_DATA_TYP


	final static String i_EDI_DATA_TYP = null;

	// �� 81 �ϐ������l�F i_OLD_TAX_RATE_1


	final static String i_OLD_TAX_RATE_1 = null;

	// �� 82 �ϐ������l�F i_OLD_TAX_RATE_2


	final static String i_OLD_TAX_RATE_2 = null;

	// �� 83 �ϐ������l�F i_OLD_TAX_RATE_3


	final static String i_OLD_TAX_RATE_3 = null;

	// �� 84 �ϐ������l�F i_NEW_TAX_RATE_START_DATE


	final static String i_NEW_TAX_RATE_START_DATE = null;

	// �� 85 �ϐ������l�F i_NEW_TAX_RATE_1


	final static String i_NEW_TAX_RATE_1 = null;

	// �� 86 �ϐ������l�F i_NEW_TAX_RATE_2


	final static String i_NEW_TAX_RATE_2 = null;

	// �� 87 �ϐ������l�F i_NEW_TAX_RATE_3


	final static String i_NEW_TAX_RATE_3 = null;

	// �� 88 �ϐ������l�F i_ROUND_TYP


	final static String i_ROUND_TYP = null;

	// �� 89 �ϐ������l�F i_DECIMAL_FIG


	final static String i_DECIMAL_FIG = null;

	// �� 90 �ϐ������l�F i_SEQ_NO


	final static String i_SEQ_NO = null;

	// �� 91 �ϐ������l�F i_LINE_NO


	final static String i_LINE_NO = null;

	// �� 92 �ϐ������l�F i_LINE_TYP


	final static String i_LINE_TYP = null;

	// �� 93 �ϐ������l�F i_COMM_CD


	final static String i_COMM_CD = null;

	// �� 94 �ϐ������l�F i_COMM_NAME


	final static String i_COMM_NAME = null;

	// �� 95 �ϐ������l�F i_SPEC


	final static String i_SPEC = null;

	// �� 96 �ϐ������l�F i_TAX_CD_2


	final static String i_TAX_CD_2 = null;

	// �� 97 �ϐ������l�F i_INP_UNIT_PRICE


	final static String i_INP_UNIT_PRICE = null;

	// �� 98 �ϐ������l�F i_UNIT_PRICE_TYP


	final static String i_UNIT_PRICE_TYP = null;

	// �� 99 �ϐ������l�F i_SLIP_QTY


	final static String i_SLIP_QTY = null;

	// �� 100 �ϐ������l�F i_PART_DLV_TIMES


	final static String i_PART_DLV_TIMES = null;

	// �� 101 �ϐ������l�F i_PART_DLV_TYP


	final static String i_PART_DLV_TYP = null;

	// �� 102 �ϐ������l�F i_CUST_COMM_CD


	final static String i_CUST_COMM_CD = null;

	// �� 103 �ϐ������l�F i_CUST_COMM_NAME


	final static String i_CUST_COMM_NAME = null;

	// �� 104 �ϐ������l�F i_CUST_ODR_SLIP_CD


	final static String i_CUST_ODR_SLIP_CD = null;

	// �� 105 �ϐ������l�F i_CUST_UNIT_PRICE_TYP


	final static String i_CUST_UNIT_PRICE_TYP = null;

	// �� 106 �ϐ������l�F i_OWN_CUR_SALES_AMOUNT


	final static String i_OWN_CUR_SALES_AMOUNT = null;

	// �� 107 �ϐ������l�F i_STOCK_CTRL_FLG


	final static String i_STOCK_CTRL_FLG = null;

	// �� 108 �ϐ������l�F i_DUMMY


	final static String i_DUMMY = null;

	// �� 109 �ϐ������l�F i_SLIP_CD2


	final static String i_SLIP_CD2 = null;

	// �� 110 �ϐ������l�F i_SYSTEMDATE


	final static String i_SYSTEMDATE = null;

	// �� 111 �ϐ������l�F i_SYSTEMUSER


	final static String i_SYSTEMUSER = null;

	// �� 112 �ϐ������l�F i_PROGRAMID


	final static String i_PROGRAMID = null;

	// �� 113 �ϐ������l�F i_DLV_CD


	final static String i_DLV_CD = null;

	// �� 114 �ϐ������l�F i_DLV_KEY_CD


	final static String i_DLV_KEY_CD = null;

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
