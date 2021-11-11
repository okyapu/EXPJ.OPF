/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KR0030/src/com/nec/jp/orteus/metamorBase/KR0030/KR0030010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.KR0030;

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

public class KR0030010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_h_SLIP_CD */
	public String m_h_SLIP_CD = null;
	/** �� 2 �ϐ��F m_CUR_UNIT2 */
	public String m_CUR_UNIT2 = null;
	/** �� 3 �ϐ��F m_h_SALES_SEQ_NO */
	public String m_h_SALES_SEQ_NO = null;
	/** �� 4 �ϐ��F m_SLIP_CD */
	public String m_SLIP_CD = null;
	/** �� 5 �ϐ��F m_SALES_DATE */
	public String m_SALES_DATE = null;
	/** �� 6 �ϐ��F m_CUST_CD */
	public String m_CUST_CD = null;
	/** �� 7 �ϐ��F m_CUST_ANAME */
	public String m_CUST_ANAME = null;
	/** �� 8 �ϐ��F m_SALES_DEPT_CD */
	public String m_SALES_DEPT_CD = null;
	/** �� 9 �ϐ��F m_ORG_NAME */
	public String m_ORG_NAME = null;
	/** �� 10 �ϐ��F m_CUST_CHRG_PSN_CD */
	public String m_CUST_CHRG_PSN_CD = null;
	/** �� 11 �ϐ��F m_USER_NAME */
	public String m_USER_NAME = null;
	/** �� 12 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 13 �ϐ��F m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** �� 14 �ϐ��F m_CUST_ODR_NO */
	public String m_CUST_ODR_NO = null;
	/** �� 15 �ϐ��F m_SALES_QTY */
	public String m_SALES_QTY = null;
	/** �� 16 �ϐ��F m_SALES_UNIT_PRICE */
	public String m_SALES_UNIT_PRICE = null;
	/** �� 17 �ϐ��F m_SALES_AMOUNT */
	public String m_SALES_AMOUNT = null;
	/** �� 18 �ϐ��F m_CUR_UNIT */
	public String m_CUR_UNIT = null;
	/** �� 19 �ϐ��F m_REMARKS */
	public String m_REMARKS = null;
	/** �� 20 �ϐ��F m_STATUS */
	public String m_STATUS = null;
	/** �� 21 �ϐ��F m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** �� 22 �ϐ��F m_AI_AR_IF_FLG */
	public String m_AI_AR_IF_FLG = null;
	/** �� 23 �ϐ��F m_TAX_CD */
	public String m_TAX_CD = null;
	/** �� 24 �ϐ��F m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** �� 25 �ϐ��F m_UNIT_QTY_TYP */
	public String m_UNIT_QTY_TYP = null;
	/** �� 26 �ϐ��F m_OPTION_ID */
	public String m_OPTION_ID = null;
	/** �� 27 �ϐ��F m_INSTALL_FLG */
	public String m_INSTALL_FLG = null;
	/** �� 28 �ϐ��F m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** �� 29 �ϐ��F m_CUR_CD */
	public String m_CUR_CD = null;
	/** �� 30 �ϐ��F m_EXCH_TYP */
	public String m_EXCH_TYP = null;
	/** �� 31 �ϐ��F m_INSPC_ACPT_TYP */
	public String m_INSPC_ACPT_TYP = null;
	/** �� 32 �ϐ��F m_TAX_APPLY_TYP */
	public String m_TAX_APPLY_TYP = null;
	/** �� 33 �ϐ��F m_w_TAX_CD */
	public String m_w_TAX_CD = null;
	/** �� 34 �ϐ��F m_DETAIL_ROUND_TYP */
	public String m_DETAIL_ROUND_TYP = null;
	/** �� 35 �ϐ��F m_ORG_CD */
	public String m_ORG_CD = null;
	/** �� 36 �ϐ��F m_USER_CD */
	public String m_USER_CD = null;
	/** �� 37 �ϐ��F m_DECIMAL_FIG */
	public String m_DECIMAL_FIG = null;
	/** �� 38 �ϐ��F m_SALES_SEQ_NO */
	public String m_SALES_SEQ_NO = null;
	/** �� 39 �ϐ��F m_SALES_TYP */
	public String m_SALES_TYP = null;
	/** �� 40 �ϐ��F m_VEND_CD */
	public String m_VEND_CD = null;
	/** �� 41 �ϐ��F m_PRD_ODR_PLACE_CD */
	public String m_PRD_ODR_PLACE_CD = null;
	/** �� 42 �ϐ��F m_ODR_ACPT_PSN_CD */
	public String m_ODR_ACPT_PSN_CD = null;
	/** �� 43 �ϐ��F m_UNIT_CD */
	public String m_UNIT_CD = null;
	/** �� 44 �ϐ��F m_SALES_AMOUNT_EXCH_RATES */
	public String m_SALES_AMOUNT_EXCH_RATES = null;
	/** �� 45 �ϐ��F m_INSPC_ACPT_DATE */
	public String m_INSPC_ACPT_DATE = null;
	/** �� 46 �ϐ��F m_INSPC_ACPT_QTY */
	public String m_INSPC_ACPT_QTY = null;
	/** �� 47 �ϐ��F m_EXTERNAL_TAX_SALES_AMOUNT */
	public String m_EXTERNAL_TAX_SALES_AMOUNT = null;
	/** �� 48 �ϐ��F m_INTERNAL_TAX_SALES_AMOUNT */
	public String m_INTERNAL_TAX_SALES_AMOUNT = null;
	/** �� 49 �ϐ��F m_TAXFREE_SALES_AMOUNT */
	public String m_TAXFREE_SALES_AMOUNT = null;
	/** �� 50 �ϐ��F m_TAX_CREDIT_SALES_AMOUNT */
	public String m_TAX_CREDIT_SALES_AMOUNT = null;
	/** �� 51 �ϐ��F m_EXTERNAL_TAX_AMOUNT */
	public String m_EXTERNAL_TAX_AMOUNT = null;
	/** �� 52 �ϐ��F m_INTERNAL_TAX_AMOUNT */
	public String m_INTERNAL_TAX_AMOUNT = null;
	/** �� 53 �ϐ��F m_TAX_AMOUNT_1 */
	public String m_TAX_AMOUNT_1 = null;
	/** �� 54 �ϐ��F m_TAX_AMOUNT_2 */
	public String m_TAX_AMOUNT_2 = null;
	/** �� 55 �ϐ��F m_TAX_AMOUNT_3 */
	public String m_TAX_AMOUNT_3 = null;
	/** �� 56 �ϐ��F m_OWN_CUR_TAXCREDIT_SALES_AMOUNT */
	public String m_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;
	/** �� 57 �ϐ��F m_ORG_SLIP_CD */
	public String m_ORG_SLIP_CD = null;
	/** �� 58 �ϐ��F m_CURRNCY_CD */
	public String m_CURRNCY_CD = null;
	/** �� 59 �ϐ��F m_SPCL_PRICE_CO */
	public String m_SPCL_PRICE_CO = null;
	/** �� 60 �ϐ��F m_DEL_FLG */
	public String m_DEL_FLG = null;
	/** �� 61 �ϐ��F m_APPR_FLG */
	public String m_APPR_FLG = null;
	/** �� 62 �ϐ��F m_APPR_ID */
	public String m_APPR_ID = null;
	/** �� 63 �ϐ��F m_APPR_DATE */
	public String m_APPR_DATE = null;
	/** �� 64 �ϐ��F m_h_TAX_CD */
	public String m_h_TAX_CD = null;
	/** �� 65 �ϐ��F m_EXCH_RATE */
	public String m_EXCH_RATE = null;
	/** �� 66 �ϐ��F m_ORG_TAX_CD */
	public String m_ORG_TAX_CD = null;
	/** �� 67 �ϐ��F m_PVC2SHUBETU */
	public String m_PVC2SHUBETU = null;
	/** �� 68 �ϐ��F m_PVC2ORGSLIP_CD */
	public String m_PVC2ORGSLIP_CD = null;
	/** �� 69 �ϐ��F m_PVC2REDSLIP_CD */
	public String m_PVC2REDSLIP_CD = null;
	/** �� 70 �ϐ��F m_PVC2BLKSLIP_CD */
	public String m_PVC2BLKSLIP_CD = null;
	/** �� 71 �ϐ��F m_PVC2RESULT */
	public String m_PVC2RESULT = null;
	/** �� 72 �ϐ��F m_TAX_RATE_1 */
	public String m_TAX_RATE_1 = null;
	/** �� 73 �ϐ��F m_TAX_RATE_2 */
	public String m_TAX_RATE_2 = null;
	/** �� 74 �ϐ��F m_TAX_RATE_3 */
	public String m_TAX_RATE_3 = null;
	/** �� 75 �ϐ��F m_TAX_ROUND_TYP */
	public String m_TAX_ROUND_TYP = null;
	/** �� 76 �ϐ��F m_BUSINESS_OPR_DATE */
	public String m_BUSINESS_OPR_DATE = null;
	/** �� 77 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 78 �ϐ��F m_SYS_CLASS_CODE */
	public String m_SYS_CLASS_CODE = null;
	/** �� 79 �ϐ��F m_h_INSTALL_FLG */
	public String m_h_INSTALL_FLG = null;
	/** �� 80 �ϐ��F m_w_TAX_NAME */
	public String m_w_TAX_NAME = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_h_SLIP_CD */
	public List l_h_SLIP_CD = null;

	/** �� 2 List�ϐ��F l_CUR_UNIT2 */
	public List l_CUR_UNIT2 = null;

	/** �� 3 List�ϐ��F l_h_SALES_SEQ_NO */
	public List l_h_SALES_SEQ_NO = null;

	/** �� 4 List�ϐ��F l_SLIP_CD */
	public List l_SLIP_CD = null;

	/** �� 5 List�ϐ��F l_SALES_DATE */
	public List l_SALES_DATE = null;

	/** �� 6 List�ϐ��F l_CUST_CD */
	public List l_CUST_CD = null;

	/** �� 7 List�ϐ��F l_CUST_ANAME */
	public List l_CUST_ANAME = null;

	/** �� 8 List�ϐ��F l_SALES_DEPT_CD */
	public List l_SALES_DEPT_CD = null;

	/** �� 9 List�ϐ��F l_ORG_NAME */
	public List l_ORG_NAME = null;

	/** �� 10 List�ϐ��F l_CUST_CHRG_PSN_CD */
	public List l_CUST_CHRG_PSN_CD = null;

	/** �� 11 List�ϐ��F l_USER_NAME */
	public List l_USER_NAME = null;

	/** �� 12 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 13 List�ϐ��F l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** �� 14 List�ϐ��F l_CUST_ODR_NO */
	public List l_CUST_ODR_NO = null;

	/** �� 15 List�ϐ��F l_SALES_QTY */
	public List l_SALES_QTY = null;

	/** �� 16 List�ϐ��F l_SALES_UNIT_PRICE */
	public List l_SALES_UNIT_PRICE = null;

	/** �� 17 List�ϐ��F l_SALES_AMOUNT */
	public List l_SALES_AMOUNT = null;

	/** �� 18 List�ϐ��F l_CUR_UNIT */
	public List l_CUR_UNIT = null;

	/** �� 19 List�ϐ��F l_REMARKS */
	public List l_REMARKS = null;

	/** �� 20 List�ϐ��F l_STATUS */
	public List l_STATUS = null;

	/** �� 21 List�ϐ��F l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** �� 22 List�ϐ��F l_AI_AR_IF_FLG */
	public List l_AI_AR_IF_FLG = null;

	/** �� 23 List�ϐ��F l_TAX_CD */
	public List l_TAX_CD = null;

	/** �� 24 List�ϐ��F l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** �� 25 List�ϐ��F l_UNIT_QTY_TYP */
	public List l_UNIT_QTY_TYP = null;

	/** �� 26 List�ϐ��F l_OPTION_ID */
	public List l_OPTION_ID = null;

	/** �� 27 List�ϐ��F l_INSTALL_FLG */
	public List l_INSTALL_FLG = null;

	/** �� 28 List�ϐ��F l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** �� 29 List�ϐ��F l_CUR_CD */
	public List l_CUR_CD = null;

	/** �� 30 List�ϐ��F l_EXCH_TYP */
	public List l_EXCH_TYP = null;

	/** �� 31 List�ϐ��F l_INSPC_ACPT_TYP */
	public List l_INSPC_ACPT_TYP = null;

	/** �� 32 List�ϐ��F l_TAX_APPLY_TYP */
	public List l_TAX_APPLY_TYP = null;

	/** �� 33 List�ϐ��F l_w_TAX_CD */
	public List l_w_TAX_CD = null;

	/** �� 34 List�ϐ��F l_DETAIL_ROUND_TYP */
	public List l_DETAIL_ROUND_TYP = null;

	/** �� 35 List�ϐ��F l_ORG_CD */
	public List l_ORG_CD = null;

	/** �� 36 List�ϐ��F l_USER_CD */
	public List l_USER_CD = null;

	/** �� 37 List�ϐ��F l_DECIMAL_FIG */
	public List l_DECIMAL_FIG = null;

	/** �� 38 List�ϐ��F l_SALES_SEQ_NO */
	public List l_SALES_SEQ_NO = null;

	/** �� 39 List�ϐ��F l_SALES_TYP */
	public List l_SALES_TYP = null;

	/** �� 40 List�ϐ��F l_VEND_CD */
	public List l_VEND_CD = null;

	/** �� 41 List�ϐ��F l_PRD_ODR_PLACE_CD */
	public List l_PRD_ODR_PLACE_CD = null;

	/** �� 42 List�ϐ��F l_ODR_ACPT_PSN_CD */
	public List l_ODR_ACPT_PSN_CD = null;

	/** �� 43 List�ϐ��F l_UNIT_CD */
	public List l_UNIT_CD = null;

	/** �� 44 List�ϐ��F l_SALES_AMOUNT_EXCH_RATES */
	public List l_SALES_AMOUNT_EXCH_RATES = null;

	/** �� 45 List�ϐ��F l_INSPC_ACPT_DATE */
	public List l_INSPC_ACPT_DATE = null;

	/** �� 46 List�ϐ��F l_INSPC_ACPT_QTY */
	public List l_INSPC_ACPT_QTY = null;

	/** �� 47 List�ϐ��F l_EXTERNAL_TAX_SALES_AMOUNT */
	public List l_EXTERNAL_TAX_SALES_AMOUNT = null;

	/** �� 48 List�ϐ��F l_INTERNAL_TAX_SALES_AMOUNT */
	public List l_INTERNAL_TAX_SALES_AMOUNT = null;

	/** �� 49 List�ϐ��F l_TAXFREE_SALES_AMOUNT */
	public List l_TAXFREE_SALES_AMOUNT = null;

	/** �� 50 List�ϐ��F l_TAX_CREDIT_SALES_AMOUNT */
	public List l_TAX_CREDIT_SALES_AMOUNT = null;

	/** �� 51 List�ϐ��F l_EXTERNAL_TAX_AMOUNT */
	public List l_EXTERNAL_TAX_AMOUNT = null;

	/** �� 52 List�ϐ��F l_INTERNAL_TAX_AMOUNT */
	public List l_INTERNAL_TAX_AMOUNT = null;

	/** �� 53 List�ϐ��F l_TAX_AMOUNT_1 */
	public List l_TAX_AMOUNT_1 = null;

	/** �� 54 List�ϐ��F l_TAX_AMOUNT_2 */
	public List l_TAX_AMOUNT_2 = null;

	/** �� 55 List�ϐ��F l_TAX_AMOUNT_3 */
	public List l_TAX_AMOUNT_3 = null;

	/** �� 56 List�ϐ��F l_OWN_CUR_TAXCREDIT_SALES_AMOUNT */
	public List l_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;

	/** �� 57 List�ϐ��F l_ORG_SLIP_CD */
	public List l_ORG_SLIP_CD = null;

	/** �� 58 List�ϐ��F l_CURRNCY_CD */
	public List l_CURRNCY_CD = null;

	/** �� 59 List�ϐ��F l_SPCL_PRICE_CO */
	public List l_SPCL_PRICE_CO = null;

	/** �� 60 List�ϐ��F l_DEL_FLG */
	public List l_DEL_FLG = null;

	/** �� 61 List�ϐ��F l_APPR_FLG */
	public List l_APPR_FLG = null;

	/** �� 62 List�ϐ��F l_APPR_ID */
	public List l_APPR_ID = null;

	/** �� 63 List�ϐ��F l_APPR_DATE */
	public List l_APPR_DATE = null;

	/** �� 64 List�ϐ��F l_h_TAX_CD */
	public List l_h_TAX_CD = null;

	/** �� 65 List�ϐ��F l_EXCH_RATE */
	public List l_EXCH_RATE = null;

	/** �� 66 List�ϐ��F l_ORG_TAX_CD */
	public List l_ORG_TAX_CD = null;

	/** �� 67 List�ϐ��F l_PVC2SHUBETU */
	public List l_PVC2SHUBETU = null;

	/** �� 68 List�ϐ��F l_PVC2ORGSLIP_CD */
	public List l_PVC2ORGSLIP_CD = null;

	/** �� 69 List�ϐ��F l_PVC2REDSLIP_CD */
	public List l_PVC2REDSLIP_CD = null;

	/** �� 70 List�ϐ��F l_PVC2BLKSLIP_CD */
	public List l_PVC2BLKSLIP_CD = null;

	/** �� 71 List�ϐ��F l_PVC2RESULT */
	public List l_PVC2RESULT = null;

	/** �� 72 List�ϐ��F l_TAX_RATE_1 */
	public List l_TAX_RATE_1 = null;

	/** �� 73 List�ϐ��F l_TAX_RATE_2 */
	public List l_TAX_RATE_2 = null;

	/** �� 74 List�ϐ��F l_TAX_RATE_3 */
	public List l_TAX_RATE_3 = null;

	/** �� 75 List�ϐ��F l_TAX_ROUND_TYP */
	public List l_TAX_ROUND_TYP = null;

	/** �� 76 List�ϐ��F l_BUSINESS_OPR_DATE */
	public List l_BUSINESS_OPR_DATE = null;

	/** �� 77 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 78 List�ϐ��F l_SYS_CLASS_CODE */
	public List l_SYS_CLASS_CODE = null;

	/** �� 79 List�ϐ��F l_h_INSTALL_FLG */
	public List l_h_INSTALL_FLG = null;

	/** �� 80 List�ϐ��F l_w_TAX_NAME */
	public List l_w_TAX_NAME = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String geth_SLIP_CD() { return m_h_SLIP_CD; }
	public String getCUR_UNIT2() { return m_CUR_UNIT2; }
	public String geth_SALES_SEQ_NO() { return m_h_SALES_SEQ_NO; }
	public String getSLIP_CD() { return m_SLIP_CD; }
	public String getSALES_DATE() { return m_SALES_DATE; }
	public String getCUST_CD() { return m_CUST_CD; }
	public String getCUST_ANAME() { return m_CUST_ANAME; }
	public String getSALES_DEPT_CD() { return m_SALES_DEPT_CD; }
	public String getORG_NAME() { return m_ORG_NAME; }
	public String getCUST_CHRG_PSN_CD() { return m_CUST_CHRG_PSN_CD; }
	public String getUSER_NAME() { return m_USER_NAME; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getCUST_ODR_NO() { return m_CUST_ODR_NO; }
	public String getSALES_QTY() { return m_SALES_QTY; }
	public String getSALES_UNIT_PRICE() { return m_SALES_UNIT_PRICE; }
	public String getSALES_AMOUNT() { return m_SALES_AMOUNT; }
	public String getCUR_UNIT() { return m_CUR_UNIT; }
	public String getREMARKS() { return m_REMARKS; }
	public String getSTATUS() { return m_STATUS; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getAI_AR_IF_FLG() { return m_AI_AR_IF_FLG; }
	public String getTAX_CD() { return m_TAX_CD; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getUNIT_QTY_TYP() { return m_UNIT_QTY_TYP; }
	public String getOPTION_ID() { return m_OPTION_ID; }
	public String getINSTALL_FLG() { return m_INSTALL_FLG; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getCUR_CD() { return m_CUR_CD; }
	public String getEXCH_TYP() { return m_EXCH_TYP; }
	public String getINSPC_ACPT_TYP() { return m_INSPC_ACPT_TYP; }
	public String getTAX_APPLY_TYP() { return m_TAX_APPLY_TYP; }
	public String getw_TAX_CD() { return m_w_TAX_CD; }
	public String getDETAIL_ROUND_TYP() { return m_DETAIL_ROUND_TYP; }
	public String getORG_CD() { return m_ORG_CD; }
	public String getUSER_CD() { return m_USER_CD; }
	public String getDECIMAL_FIG() { return m_DECIMAL_FIG; }
	public String getSALES_SEQ_NO() { return m_SALES_SEQ_NO; }
	public String getSALES_TYP() { return m_SALES_TYP; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getPRD_ODR_PLACE_CD() { return m_PRD_ODR_PLACE_CD; }
	public String getODR_ACPT_PSN_CD() { return m_ODR_ACPT_PSN_CD; }
	public String getUNIT_CD() { return m_UNIT_CD; }
	public String getSALES_AMOUNT_EXCH_RATES() { return m_SALES_AMOUNT_EXCH_RATES; }
	public String getINSPC_ACPT_DATE() { return m_INSPC_ACPT_DATE; }
	public String getINSPC_ACPT_QTY() { return m_INSPC_ACPT_QTY; }
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
	public String getORG_SLIP_CD() { return m_ORG_SLIP_CD; }
	public String getCURRNCY_CD() { return m_CURRNCY_CD; }
	public String getSPCL_PRICE_CO() { return m_SPCL_PRICE_CO; }
	public String getDEL_FLG() { return m_DEL_FLG; }
	public String getAPPR_FLG() { return m_APPR_FLG; }
	public String getAPPR_ID() { return m_APPR_ID; }
	public String getAPPR_DATE() { return m_APPR_DATE; }
	public String geth_TAX_CD() { return m_h_TAX_CD; }
	public String getEXCH_RATE() { return m_EXCH_RATE; }
	public String getORG_TAX_CD() { return m_ORG_TAX_CD; }
	public String getPVC2SHUBETU() { return m_PVC2SHUBETU; }
	public String getPVC2ORGSLIP_CD() { return m_PVC2ORGSLIP_CD; }
	public String getPVC2REDSLIP_CD() { return m_PVC2REDSLIP_CD; }
	public String getPVC2BLKSLIP_CD() { return m_PVC2BLKSLIP_CD; }
	public String getPVC2RESULT() { return m_PVC2RESULT; }
	public String getTAX_RATE_1() { return m_TAX_RATE_1; }
	public String getTAX_RATE_2() { return m_TAX_RATE_2; }
	public String getTAX_RATE_3() { return m_TAX_RATE_3; }
	public String getTAX_ROUND_TYP() { return m_TAX_ROUND_TYP; }
	public String getBUSINESS_OPR_DATE() { return m_BUSINESS_OPR_DATE; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getSYS_CLASS_CODE() { return m_SYS_CLASS_CODE; }
	public String geth_INSTALL_FLG() { return m_h_INSTALL_FLG; }
	public String getw_TAX_NAME() { return m_w_TAX_NAME; }

	public List getList_h_SLIP_CD() { return l_h_SLIP_CD; }
	public List getList_CUR_UNIT2() { return l_CUR_UNIT2; }
	public List getList_h_SALES_SEQ_NO() { return l_h_SALES_SEQ_NO; }
	public List getList_SLIP_CD() { return l_SLIP_CD; }
	public List getList_SALES_DATE() { return l_SALES_DATE; }
	public List getList_CUST_CD() { return l_CUST_CD; }
	public List getList_CUST_ANAME() { return l_CUST_ANAME; }
	public List getList_SALES_DEPT_CD() { return l_SALES_DEPT_CD; }
	public List getList_ORG_NAME() { return l_ORG_NAME; }
	public List getList_CUST_CHRG_PSN_CD() { return l_CUST_CHRG_PSN_CD; }
	public List getList_USER_NAME() { return l_USER_NAME; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_CUST_ODR_NO() { return l_CUST_ODR_NO; }
	public List getList_SALES_QTY() { return l_SALES_QTY; }
	public List getList_SALES_UNIT_PRICE() { return l_SALES_UNIT_PRICE; }
	public List getList_SALES_AMOUNT() { return l_SALES_AMOUNT; }
	public List getList_CUR_UNIT() { return l_CUR_UNIT; }
	public List getList_REMARKS() { return l_REMARKS; }
	public List getList_STATUS() { return l_STATUS; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_AI_AR_IF_FLG() { return l_AI_AR_IF_FLG; }
	public List getList_TAX_CD() { return l_TAX_CD; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_UNIT_QTY_TYP() { return l_UNIT_QTY_TYP; }
	public List getList_OPTION_ID() { return l_OPTION_ID; }
	public List getList_INSTALL_FLG() { return l_INSTALL_FLG; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_CUR_CD() { return l_CUR_CD; }
	public List getList_EXCH_TYP() { return l_EXCH_TYP; }
	public List getList_INSPC_ACPT_TYP() { return l_INSPC_ACPT_TYP; }
	public List getList_TAX_APPLY_TYP() { return l_TAX_APPLY_TYP; }
	public List getList_w_TAX_CD() { return l_w_TAX_CD; }
	public List getList_DETAIL_ROUND_TYP() { return l_DETAIL_ROUND_TYP; }
	public List getList_ORG_CD() { return l_ORG_CD; }
	public List getList_USER_CD() { return l_USER_CD; }
	public List getList_DECIMAL_FIG() { return l_DECIMAL_FIG; }
	public List getList_SALES_SEQ_NO() { return l_SALES_SEQ_NO; }
	public List getList_SALES_TYP() { return l_SALES_TYP; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_PRD_ODR_PLACE_CD() { return l_PRD_ODR_PLACE_CD; }
	public List getList_ODR_ACPT_PSN_CD() { return l_ODR_ACPT_PSN_CD; }
	public List getList_UNIT_CD() { return l_UNIT_CD; }
	public List getList_SALES_AMOUNT_EXCH_RATES() { return l_SALES_AMOUNT_EXCH_RATES; }
	public List getList_INSPC_ACPT_DATE() { return l_INSPC_ACPT_DATE; }
	public List getList_INSPC_ACPT_QTY() { return l_INSPC_ACPT_QTY; }
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
	public List getList_ORG_SLIP_CD() { return l_ORG_SLIP_CD; }
	public List getList_CURRNCY_CD() { return l_CURRNCY_CD; }
	public List getList_SPCL_PRICE_CO() { return l_SPCL_PRICE_CO; }
	public List getList_DEL_FLG() { return l_DEL_FLG; }
	public List getList_APPR_FLG() { return l_APPR_FLG; }
	public List getList_APPR_ID() { return l_APPR_ID; }
	public List getList_APPR_DATE() { return l_APPR_DATE; }
	public List getList_h_TAX_CD() { return l_h_TAX_CD; }
	public List getList_EXCH_RATE() { return l_EXCH_RATE; }
	public List getList_ORG_TAX_CD() { return l_ORG_TAX_CD; }
	public List getList_PVC2SHUBETU() { return l_PVC2SHUBETU; }
	public List getList_PVC2ORGSLIP_CD() { return l_PVC2ORGSLIP_CD; }
	public List getList_PVC2REDSLIP_CD() { return l_PVC2REDSLIP_CD; }
	public List getList_PVC2BLKSLIP_CD() { return l_PVC2BLKSLIP_CD; }
	public List getList_PVC2RESULT() { return l_PVC2RESULT; }
	public List getList_TAX_RATE_1() { return l_TAX_RATE_1; }
	public List getList_TAX_RATE_2() { return l_TAX_RATE_2; }
	public List getList_TAX_RATE_3() { return l_TAX_RATE_3; }
	public List getList_TAX_ROUND_TYP() { return l_TAX_ROUND_TYP; }
	public List getList_BUSINESS_OPR_DATE() { return l_BUSINESS_OPR_DATE; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_SYS_CLASS_CODE() { return l_SYS_CLASS_CODE; }
	public List getList_h_INSTALL_FLG() { return l_h_INSTALL_FLG; }
	public List getList_w_TAX_NAME() { return l_w_TAX_NAME; }

	public void seth_SLIP_CD(String val) { m_h_SLIP_CD = val; }
	public void setCUR_UNIT2(String val) { m_CUR_UNIT2 = val; }
	public void seth_SALES_SEQ_NO(String val) { m_h_SALES_SEQ_NO = val; }
	public void setSLIP_CD(String val) { m_SLIP_CD = val; }
	public void setSALES_DATE(String val) { m_SALES_DATE = val; }
	public void setCUST_CD(String val) { m_CUST_CD = val; }
	public void setCUST_ANAME(String val) { m_CUST_ANAME = val; }
	public void setSALES_DEPT_CD(String val) { m_SALES_DEPT_CD = val; }
	public void setORG_NAME(String val) { m_ORG_NAME = val; }
	public void setCUST_CHRG_PSN_CD(String val) { m_CUST_CHRG_PSN_CD = val; }
	public void setUSER_NAME(String val) { m_USER_NAME = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setCUST_ODR_NO(String val) { m_CUST_ODR_NO = val; }
	public void setSALES_QTY(String val) { m_SALES_QTY = val; }
	public void setSALES_UNIT_PRICE(String val) { m_SALES_UNIT_PRICE = val; }
	public void setSALES_AMOUNT(String val) { m_SALES_AMOUNT = val; }
	public void setCUR_UNIT(String val) { m_CUR_UNIT = val; }
	public void setREMARKS(String val) { m_REMARKS = val; }
	public void setSTATUS(String val) { m_STATUS = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setAI_AR_IF_FLG(String val) { m_AI_AR_IF_FLG = val; }
	public void setTAX_CD(String val) { m_TAX_CD = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setUNIT_QTY_TYP(String val) { m_UNIT_QTY_TYP = val; }
	public void setOPTION_ID(String val) { m_OPTION_ID = val; }
	public void setINSTALL_FLG(String val) { m_INSTALL_FLG = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setCUR_CD(String val) { m_CUR_CD = val; }
	public void setEXCH_TYP(String val) { m_EXCH_TYP = val; }
	public void setINSPC_ACPT_TYP(String val) { m_INSPC_ACPT_TYP = val; }
	public void setTAX_APPLY_TYP(String val) { m_TAX_APPLY_TYP = val; }
	public void setw_TAX_CD(String val) { m_w_TAX_CD = val; }
	public void setDETAIL_ROUND_TYP(String val) { m_DETAIL_ROUND_TYP = val; }
	public void setORG_CD(String val) { m_ORG_CD = val; }
	public void setUSER_CD(String val) { m_USER_CD = val; }
	public void setDECIMAL_FIG(String val) { m_DECIMAL_FIG = val; }
	public void setSALES_SEQ_NO(String val) { m_SALES_SEQ_NO = val; }
	public void setSALES_TYP(String val) { m_SALES_TYP = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void setPRD_ODR_PLACE_CD(String val) { m_PRD_ODR_PLACE_CD = val; }
	public void setODR_ACPT_PSN_CD(String val) { m_ODR_ACPT_PSN_CD = val; }
	public void setUNIT_CD(String val) { m_UNIT_CD = val; }
	public void setSALES_AMOUNT_EXCH_RATES(String val) { m_SALES_AMOUNT_EXCH_RATES = val; }
	public void setINSPC_ACPT_DATE(String val) { m_INSPC_ACPT_DATE = val; }
	public void setINSPC_ACPT_QTY(String val) { m_INSPC_ACPT_QTY = val; }
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
	public void setORG_SLIP_CD(String val) { m_ORG_SLIP_CD = val; }
	public void setCURRNCY_CD(String val) { m_CURRNCY_CD = val; }
	public void setSPCL_PRICE_CO(String val) { m_SPCL_PRICE_CO = val; }
	public void setDEL_FLG(String val) { m_DEL_FLG = val; }
	public void setAPPR_FLG(String val) { m_APPR_FLG = val; }
	public void setAPPR_ID(String val) { m_APPR_ID = val; }
	public void setAPPR_DATE(String val) { m_APPR_DATE = val; }
	public void seth_TAX_CD(String val) { m_h_TAX_CD = val; }
	public void setEXCH_RATE(String val) { m_EXCH_RATE = val; }
	public void setORG_TAX_CD(String val) { m_ORG_TAX_CD = val; }
	public void setPVC2SHUBETU(String val) { m_PVC2SHUBETU = val; }
	public void setPVC2ORGSLIP_CD(String val) { m_PVC2ORGSLIP_CD = val; }
	public void setPVC2REDSLIP_CD(String val) { m_PVC2REDSLIP_CD = val; }
	public void setPVC2BLKSLIP_CD(String val) { m_PVC2BLKSLIP_CD = val; }
	public void setPVC2RESULT(String val) { m_PVC2RESULT = val; }
	public void setTAX_RATE_1(String val) { m_TAX_RATE_1 = val; }
	public void setTAX_RATE_2(String val) { m_TAX_RATE_2 = val; }
	public void setTAX_RATE_3(String val) { m_TAX_RATE_3 = val; }
	public void setTAX_ROUND_TYP(String val) { m_TAX_ROUND_TYP = val; }
	public void setBUSINESS_OPR_DATE(String val) { m_BUSINESS_OPR_DATE = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setSYS_CLASS_CODE(String val) { m_SYS_CLASS_CODE = val; }
	public void seth_INSTALL_FLG(String val) { m_h_INSTALL_FLG = val; }
	public void setw_TAX_NAME(String val) { m_w_TAX_NAME = val; }


	public void setList_h_SLIP_CD(List list) { l_h_SLIP_CD = list; }
	public void setList_CUR_UNIT2(List list) { l_CUR_UNIT2 = list; }
	public void setList_h_SALES_SEQ_NO(List list) { l_h_SALES_SEQ_NO = list; }
	public void setList_SLIP_CD(List list) { l_SLIP_CD = list; }
	public void setList_SALES_DATE(List list) { l_SALES_DATE = list; }
	public void setList_CUST_CD(List list) { l_CUST_CD = list; }
	public void setList_CUST_ANAME(List list) { l_CUST_ANAME = list; }
	public void setList_SALES_DEPT_CD(List list) { l_SALES_DEPT_CD = list; }
	public void setList_ORG_NAME(List list) { l_ORG_NAME = list; }
	public void setList_CUST_CHRG_PSN_CD(List list) { l_CUST_CHRG_PSN_CD = list; }
	public void setList_USER_NAME(List list) { l_USER_NAME = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_CUST_ODR_NO(List list) { l_CUST_ODR_NO = list; }
	public void setList_SALES_QTY(List list) { l_SALES_QTY = list; }
	public void setList_SALES_UNIT_PRICE(List list) { l_SALES_UNIT_PRICE = list; }
	public void setList_SALES_AMOUNT(List list) { l_SALES_AMOUNT = list; }
	public void setList_CUR_UNIT(List list) { l_CUR_UNIT = list; }
	public void setList_REMARKS(List list) { l_REMARKS = list; }
	public void setList_STATUS(List list) { l_STATUS = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_AI_AR_IF_FLG(List list) { l_AI_AR_IF_FLG = list; }
	public void setList_TAX_CD(List list) { l_TAX_CD = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_UNIT_QTY_TYP(List list) { l_UNIT_QTY_TYP = list; }
	public void setList_OPTION_ID(List list) { l_OPTION_ID = list; }
	public void setList_INSTALL_FLG(List list) { l_INSTALL_FLG = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_CUR_CD(List list) { l_CUR_CD = list; }
	public void setList_EXCH_TYP(List list) { l_EXCH_TYP = list; }
	public void setList_INSPC_ACPT_TYP(List list) { l_INSPC_ACPT_TYP = list; }
	public void setList_TAX_APPLY_TYP(List list) { l_TAX_APPLY_TYP = list; }
	public void setList_w_TAX_CD(List list) { l_w_TAX_CD = list; }
	public void setList_DETAIL_ROUND_TYP(List list) { l_DETAIL_ROUND_TYP = list; }
	public void setList_ORG_CD(List list) { l_ORG_CD = list; }
	public void setList_USER_CD(List list) { l_USER_CD = list; }
	public void setList_DECIMAL_FIG(List list) { l_DECIMAL_FIG = list; }
	public void setList_SALES_SEQ_NO(List list) { l_SALES_SEQ_NO = list; }
	public void setList_SALES_TYP(List list) { l_SALES_TYP = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_PRD_ODR_PLACE_CD(List list) { l_PRD_ODR_PLACE_CD = list; }
	public void setList_ODR_ACPT_PSN_CD(List list) { l_ODR_ACPT_PSN_CD = list; }
	public void setList_UNIT_CD(List list) { l_UNIT_CD = list; }
	public void setList_SALES_AMOUNT_EXCH_RATES(List list) { l_SALES_AMOUNT_EXCH_RATES = list; }
	public void setList_INSPC_ACPT_DATE(List list) { l_INSPC_ACPT_DATE = list; }
	public void setList_INSPC_ACPT_QTY(List list) { l_INSPC_ACPT_QTY = list; }
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
	public void setList_ORG_SLIP_CD(List list) { l_ORG_SLIP_CD = list; }
	public void setList_CURRNCY_CD(List list) { l_CURRNCY_CD = list; }
	public void setList_SPCL_PRICE_CO(List list) { l_SPCL_PRICE_CO = list; }
	public void setList_DEL_FLG(List list) { l_DEL_FLG = list; }
	public void setList_APPR_FLG(List list) { l_APPR_FLG = list; }
	public void setList_APPR_ID(List list) { l_APPR_ID = list; }
	public void setList_APPR_DATE(List list) { l_APPR_DATE = list; }
	public void setList_h_TAX_CD(List list) { l_h_TAX_CD = list; }
	public void setList_EXCH_RATE(List list) { l_EXCH_RATE = list; }
	public void setList_ORG_TAX_CD(List list) { l_ORG_TAX_CD = list; }
	public void setList_PVC2SHUBETU(List list) { l_PVC2SHUBETU = list; }
	public void setList_PVC2ORGSLIP_CD(List list) { l_PVC2ORGSLIP_CD = list; }
	public void setList_PVC2REDSLIP_CD(List list) { l_PVC2REDSLIP_CD = list; }
	public void setList_PVC2BLKSLIP_CD(List list) { l_PVC2BLKSLIP_CD = list; }
	public void setList_PVC2RESULT(List list) { l_PVC2RESULT = list; }
	public void setList_TAX_RATE_1(List list) { l_TAX_RATE_1 = list; }
	public void setList_TAX_RATE_2(List list) { l_TAX_RATE_2 = list; }
	public void setList_TAX_RATE_3(List list) { l_TAX_RATE_3 = list; }
	public void setList_TAX_ROUND_TYP(List list) { l_TAX_ROUND_TYP = list; }
	public void setList_BUSINESS_OPR_DATE(List list) { l_BUSINESS_OPR_DATE = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_SYS_CLASS_CODE(List list) { l_SYS_CLASS_CODE = list; }
	public void setList_h_INSTALL_FLG(List list) { l_h_INSTALL_FLG = list; }
	public void setList_w_TAX_NAME(List list) { l_w_TAX_NAME = list; }

	public int setL2L_h_SLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_SLIP_CD == null) {
			l_h_SLIP_CD = new ArrayList();
		} else {
			l_h_SLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_SLIP_CD.add(((KR0030010Struct) list.get(i)).geth_SLIP_CD());
		}
		return size;
	}
	public int setL2L_CUR_UNIT2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUR_UNIT2 == null) {
			l_CUR_UNIT2 = new ArrayList();
		} else {
			l_CUR_UNIT2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUR_UNIT2.add(((KR0030010Struct) list.get(i)).getCUR_UNIT2());
		}
		return size;
	}
	public int setL2L_h_SALES_SEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_SALES_SEQ_NO == null) {
			l_h_SALES_SEQ_NO = new ArrayList();
		} else {
			l_h_SALES_SEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_SALES_SEQ_NO.add(((KR0030010Struct) list.get(i)).geth_SALES_SEQ_NO());
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
			l_SLIP_CD.add(((KR0030010Struct) list.get(i)).getSLIP_CD());
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
			l_SALES_DATE.add(((KR0030010Struct) list.get(i)).getSALES_DATE());
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
			l_CUST_CD.add(((KR0030010Struct) list.get(i)).getCUST_CD());
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
			l_CUST_ANAME.add(((KR0030010Struct) list.get(i)).getCUST_ANAME());
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
			l_SALES_DEPT_CD.add(((KR0030010Struct) list.get(i)).getSALES_DEPT_CD());
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
			l_ORG_NAME.add(((KR0030010Struct) list.get(i)).getORG_NAME());
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
			l_CUST_CHRG_PSN_CD.add(((KR0030010Struct) list.get(i)).getCUST_CHRG_PSN_CD());
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
			l_USER_NAME.add(((KR0030010Struct) list.get(i)).getUSER_NAME());
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
			l_ITEM_CD.add(((KR0030010Struct) list.get(i)).getITEM_CD());
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
			l_ITEM_NAME.add(((KR0030010Struct) list.get(i)).getITEM_NAME());
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
			l_CUST_ODR_NO.add(((KR0030010Struct) list.get(i)).getCUST_ODR_NO());
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
			l_SALES_QTY.add(((KR0030010Struct) list.get(i)).getSALES_QTY());
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
			l_SALES_UNIT_PRICE.add(((KR0030010Struct) list.get(i)).getSALES_UNIT_PRICE());
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
			l_SALES_AMOUNT.add(((KR0030010Struct) list.get(i)).getSALES_AMOUNT());
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
			l_CUR_UNIT.add(((KR0030010Struct) list.get(i)).getCUR_UNIT());
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
			l_REMARKS.add(((KR0030010Struct) list.get(i)).getREMARKS());
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
			l_STATUS.add(((KR0030010Struct) list.get(i)).getSTATUS());
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
			l_MODIFY_COUNT.add(((KR0030010Struct) list.get(i)).getMODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_AI_AR_IF_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_AI_AR_IF_FLG == null) {
			l_AI_AR_IF_FLG = new ArrayList();
		} else {
			l_AI_AR_IF_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_AI_AR_IF_FLG.add(((KR0030010Struct) list.get(i)).getAI_AR_IF_FLG());
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
			l_TAX_CD.add(((KR0030010Struct) list.get(i)).getTAX_CD());
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
			l_STOCK_UNIT.add(((KR0030010Struct) list.get(i)).getSTOCK_UNIT());
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
			l_UNIT_QTY_TYP.add(((KR0030010Struct) list.get(i)).getUNIT_QTY_TYP());
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
			l_OPTION_ID.add(((KR0030010Struct) list.get(i)).getOPTION_ID());
		}
		return size;
	}
	public int setL2L_INSTALL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INSTALL_FLG == null) {
			l_INSTALL_FLG = new ArrayList();
		} else {
			l_INSTALL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INSTALL_FLG.add(((KR0030010Struct) list.get(i)).getINSTALL_FLG());
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
			l_COMPANY_CD.add(((KR0030010Struct) list.get(i)).getCOMPANY_CD());
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
			l_CUR_CD.add(((KR0030010Struct) list.get(i)).getCUR_CD());
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
			l_EXCH_TYP.add(((KR0030010Struct) list.get(i)).getEXCH_TYP());
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
			l_INSPC_ACPT_TYP.add(((KR0030010Struct) list.get(i)).getINSPC_ACPT_TYP());
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
			l_TAX_APPLY_TYP.add(((KR0030010Struct) list.get(i)).getTAX_APPLY_TYP());
		}
		return size;
	}
	public int setL2L_w_TAX_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_TAX_CD == null) {
			l_w_TAX_CD = new ArrayList();
		} else {
			l_w_TAX_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_TAX_CD.add(((KR0030010Struct) list.get(i)).getw_TAX_CD());
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
			l_DETAIL_ROUND_TYP.add(((KR0030010Struct) list.get(i)).getDETAIL_ROUND_TYP());
		}
		return size;
	}
	public int setL2L_ORG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ORG_CD == null) {
			l_ORG_CD = new ArrayList();
		} else {
			l_ORG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ORG_CD.add(((KR0030010Struct) list.get(i)).getORG_CD());
		}
		return size;
	}
	public int setL2L_USER_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_USER_CD == null) {
			l_USER_CD = new ArrayList();
		} else {
			l_USER_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_USER_CD.add(((KR0030010Struct) list.get(i)).getUSER_CD());
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
			l_DECIMAL_FIG.add(((KR0030010Struct) list.get(i)).getDECIMAL_FIG());
		}
		return size;
	}
	public int setL2L_SALES_SEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SALES_SEQ_NO == null) {
			l_SALES_SEQ_NO = new ArrayList();
		} else {
			l_SALES_SEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SALES_SEQ_NO.add(((KR0030010Struct) list.get(i)).getSALES_SEQ_NO());
		}
		return size;
	}
	public int setL2L_SALES_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SALES_TYP == null) {
			l_SALES_TYP = new ArrayList();
		} else {
			l_SALES_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SALES_TYP.add(((KR0030010Struct) list.get(i)).getSALES_TYP());
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
			l_VEND_CD.add(((KR0030010Struct) list.get(i)).getVEND_CD());
		}
		return size;
	}
	public int setL2L_PRD_ODR_PLACE_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRD_ODR_PLACE_CD == null) {
			l_PRD_ODR_PLACE_CD = new ArrayList();
		} else {
			l_PRD_ODR_PLACE_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRD_ODR_PLACE_CD.add(((KR0030010Struct) list.get(i)).getPRD_ODR_PLACE_CD());
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
			l_ODR_ACPT_PSN_CD.add(((KR0030010Struct) list.get(i)).getODR_ACPT_PSN_CD());
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
			l_UNIT_CD.add(((KR0030010Struct) list.get(i)).getUNIT_CD());
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
			l_SALES_AMOUNT_EXCH_RATES.add(((KR0030010Struct) list.get(i)).getSALES_AMOUNT_EXCH_RATES());
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
			l_INSPC_ACPT_DATE.add(((KR0030010Struct) list.get(i)).getINSPC_ACPT_DATE());
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
			l_INSPC_ACPT_QTY.add(((KR0030010Struct) list.get(i)).getINSPC_ACPT_QTY());
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
			l_EXTERNAL_TAX_SALES_AMOUNT.add(((KR0030010Struct) list.get(i)).getEXTERNAL_TAX_SALES_AMOUNT());
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
			l_INTERNAL_TAX_SALES_AMOUNT.add(((KR0030010Struct) list.get(i)).getINTERNAL_TAX_SALES_AMOUNT());
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
			l_TAXFREE_SALES_AMOUNT.add(((KR0030010Struct) list.get(i)).getTAXFREE_SALES_AMOUNT());
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
			l_TAX_CREDIT_SALES_AMOUNT.add(((KR0030010Struct) list.get(i)).getTAX_CREDIT_SALES_AMOUNT());
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
			l_EXTERNAL_TAX_AMOUNT.add(((KR0030010Struct) list.get(i)).getEXTERNAL_TAX_AMOUNT());
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
			l_INTERNAL_TAX_AMOUNT.add(((KR0030010Struct) list.get(i)).getINTERNAL_TAX_AMOUNT());
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
			l_TAX_AMOUNT_1.add(((KR0030010Struct) list.get(i)).getTAX_AMOUNT_1());
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
			l_TAX_AMOUNT_2.add(((KR0030010Struct) list.get(i)).getTAX_AMOUNT_2());
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
			l_TAX_AMOUNT_3.add(((KR0030010Struct) list.get(i)).getTAX_AMOUNT_3());
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
			l_OWN_CUR_TAXCREDIT_SALES_AMOUNT.add(((KR0030010Struct) list.get(i)).getOWN_CUR_TAXCREDIT_SALES_AMOUNT());
		}
		return size;
	}
	public int setL2L_ORG_SLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ORG_SLIP_CD == null) {
			l_ORG_SLIP_CD = new ArrayList();
		} else {
			l_ORG_SLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ORG_SLIP_CD.add(((KR0030010Struct) list.get(i)).getORG_SLIP_CD());
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
			l_CURRNCY_CD.add(((KR0030010Struct) list.get(i)).getCURRNCY_CD());
		}
		return size;
	}
	public int setL2L_SPCL_PRICE_CO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SPCL_PRICE_CO == null) {
			l_SPCL_PRICE_CO = new ArrayList();
		} else {
			l_SPCL_PRICE_CO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SPCL_PRICE_CO.add(((KR0030010Struct) list.get(i)).getSPCL_PRICE_CO());
		}
		return size;
	}
	public int setL2L_DEL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEL_FLG == null) {
			l_DEL_FLG = new ArrayList();
		} else {
			l_DEL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEL_FLG.add(((KR0030010Struct) list.get(i)).getDEL_FLG());
		}
		return size;
	}
	public int setL2L_APPR_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_APPR_FLG == null) {
			l_APPR_FLG = new ArrayList();
		} else {
			l_APPR_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_APPR_FLG.add(((KR0030010Struct) list.get(i)).getAPPR_FLG());
		}
		return size;
	}
	public int setL2L_APPR_ID(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_APPR_ID == null) {
			l_APPR_ID = new ArrayList();
		} else {
			l_APPR_ID.clear();
		}
		for (int i = 0; i < size; i++) {
			l_APPR_ID.add(((KR0030010Struct) list.get(i)).getAPPR_ID());
		}
		return size;
	}
	public int setL2L_APPR_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_APPR_DATE == null) {
			l_APPR_DATE = new ArrayList();
		} else {
			l_APPR_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_APPR_DATE.add(((KR0030010Struct) list.get(i)).getAPPR_DATE());
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
			l_h_TAX_CD.add(((KR0030010Struct) list.get(i)).geth_TAX_CD());
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
			l_EXCH_RATE.add(((KR0030010Struct) list.get(i)).getEXCH_RATE());
		}
		return size;
	}
	public int setL2L_ORG_TAX_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ORG_TAX_CD == null) {
			l_ORG_TAX_CD = new ArrayList();
		} else {
			l_ORG_TAX_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ORG_TAX_CD.add(((KR0030010Struct) list.get(i)).getORG_TAX_CD());
		}
		return size;
	}
	public int setL2L_PVC2SHUBETU(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PVC2SHUBETU == null) {
			l_PVC2SHUBETU = new ArrayList();
		} else {
			l_PVC2SHUBETU.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PVC2SHUBETU.add(((KR0030010Struct) list.get(i)).getPVC2SHUBETU());
		}
		return size;
	}
	public int setL2L_PVC2ORGSLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PVC2ORGSLIP_CD == null) {
			l_PVC2ORGSLIP_CD = new ArrayList();
		} else {
			l_PVC2ORGSLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PVC2ORGSLIP_CD.add(((KR0030010Struct) list.get(i)).getPVC2ORGSLIP_CD());
		}
		return size;
	}
	public int setL2L_PVC2REDSLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PVC2REDSLIP_CD == null) {
			l_PVC2REDSLIP_CD = new ArrayList();
		} else {
			l_PVC2REDSLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PVC2REDSLIP_CD.add(((KR0030010Struct) list.get(i)).getPVC2REDSLIP_CD());
		}
		return size;
	}
	public int setL2L_PVC2BLKSLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PVC2BLKSLIP_CD == null) {
			l_PVC2BLKSLIP_CD = new ArrayList();
		} else {
			l_PVC2BLKSLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PVC2BLKSLIP_CD.add(((KR0030010Struct) list.get(i)).getPVC2BLKSLIP_CD());
		}
		return size;
	}
	public int setL2L_PVC2RESULT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PVC2RESULT == null) {
			l_PVC2RESULT = new ArrayList();
		} else {
			l_PVC2RESULT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PVC2RESULT.add(((KR0030010Struct) list.get(i)).getPVC2RESULT());
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
			l_TAX_RATE_1.add(((KR0030010Struct) list.get(i)).getTAX_RATE_1());
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
			l_TAX_RATE_2.add(((KR0030010Struct) list.get(i)).getTAX_RATE_2());
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
			l_TAX_RATE_3.add(((KR0030010Struct) list.get(i)).getTAX_RATE_3());
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
			l_TAX_ROUND_TYP.add(((KR0030010Struct) list.get(i)).getTAX_ROUND_TYP());
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
			l_BUSINESS_OPR_DATE.add(((KR0030010Struct) list.get(i)).getBUSINESS_OPR_DATE());
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
			l_PLANT_CD.add(((KR0030010Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_SYS_CLASS_CODE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SYS_CLASS_CODE == null) {
			l_SYS_CLASS_CODE = new ArrayList();
		} else {
			l_SYS_CLASS_CODE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SYS_CLASS_CODE.add(((KR0030010Struct) list.get(i)).getSYS_CLASS_CODE());
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
			l_h_INSTALL_FLG.add(((KR0030010Struct) list.get(i)).geth_INSTALL_FLG());
		}
		return size;
	}
	public int setL2L_w_TAX_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_TAX_NAME == null) {
			l_w_TAX_NAME = new ArrayList();
		} else {
			l_w_TAX_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_TAX_NAME.add(((KR0030010Struct) list.get(i)).getw_TAX_NAME());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_h_SLIP_CD = null;
		m_CUR_UNIT2 = null;
		m_h_SALES_SEQ_NO = null;
		m_SLIP_CD = null;
		m_SALES_DATE = null;
		m_CUST_CD = null;
		m_CUST_ANAME = null;
		m_SALES_DEPT_CD = null;
		m_ORG_NAME = null;
		m_CUST_CHRG_PSN_CD = null;
		m_USER_NAME = null;
		m_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_CUST_ODR_NO = null;
		m_SALES_QTY = null;
		m_SALES_UNIT_PRICE = null;
		m_SALES_AMOUNT = null;
		m_CUR_UNIT = null;
		m_REMARKS = null;
		m_STATUS = null;
		m_MODIFY_COUNT = null;
		m_AI_AR_IF_FLG = null;
		m_TAX_CD = null;
		m_STOCK_UNIT = null;
		m_UNIT_QTY_TYP = null;
		m_OPTION_ID = null;
		m_INSTALL_FLG = null;
		m_COMPANY_CD = null;
		m_CUR_CD = null;
		m_EXCH_TYP = null;
		m_INSPC_ACPT_TYP = null;
		m_TAX_APPLY_TYP = null;
		m_w_TAX_CD = null;
		m_DETAIL_ROUND_TYP = null;
		m_ORG_CD = null;
		m_USER_CD = null;
		m_DECIMAL_FIG = null;
		m_SALES_SEQ_NO = null;
		m_SALES_TYP = null;
		m_VEND_CD = null;
		m_PRD_ODR_PLACE_CD = null;
		m_ODR_ACPT_PSN_CD = null;
		m_UNIT_CD = null;
		m_SALES_AMOUNT_EXCH_RATES = null;
		m_INSPC_ACPT_DATE = null;
		m_INSPC_ACPT_QTY = null;
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
		m_ORG_SLIP_CD = null;
		m_CURRNCY_CD = null;
		m_SPCL_PRICE_CO = null;
		m_DEL_FLG = null;
		m_APPR_FLG = null;
		m_APPR_ID = null;
		m_APPR_DATE = null;
		m_h_TAX_CD = null;
		m_EXCH_RATE = null;
		m_ORG_TAX_CD = null;
		m_PVC2SHUBETU = null;
		m_PVC2ORGSLIP_CD = null;
		m_PVC2REDSLIP_CD = null;
		m_PVC2BLKSLIP_CD = null;
		m_PVC2RESULT = null;
		m_TAX_RATE_1 = null;
		m_TAX_RATE_2 = null;
		m_TAX_RATE_3 = null;
		m_TAX_ROUND_TYP = null;
		m_BUSINESS_OPR_DATE = null;
		m_PLANT_CD = null;
		m_SYS_CLASS_CODE = null;
		m_h_INSTALL_FLG = null;
		m_w_TAX_NAME = null;

		l_h_SLIP_CD = null;
		l_CUR_UNIT2 = null;
		l_h_SALES_SEQ_NO = null;
		l_SLIP_CD = null;
		l_SALES_DATE = null;
		l_CUST_CD = null;
		l_CUST_ANAME = null;
		l_SALES_DEPT_CD = null;
		l_ORG_NAME = null;
		l_CUST_CHRG_PSN_CD = null;
		l_USER_NAME = null;
		l_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_CUST_ODR_NO = null;
		l_SALES_QTY = null;
		l_SALES_UNIT_PRICE = null;
		l_SALES_AMOUNT = null;
		l_CUR_UNIT = null;
		l_REMARKS = null;
		l_STATUS = null;
		l_MODIFY_COUNT = null;
		l_AI_AR_IF_FLG = null;
		l_TAX_CD = null;
		l_STOCK_UNIT = null;
		l_UNIT_QTY_TYP = null;
		l_OPTION_ID = null;
		l_INSTALL_FLG = null;
		l_COMPANY_CD = null;
		l_CUR_CD = null;
		l_EXCH_TYP = null;
		l_INSPC_ACPT_TYP = null;
		l_TAX_APPLY_TYP = null;
		l_w_TAX_CD = null;
		l_DETAIL_ROUND_TYP = null;
		l_ORG_CD = null;
		l_USER_CD = null;
		l_DECIMAL_FIG = null;
		l_SALES_SEQ_NO = null;
		l_SALES_TYP = null;
		l_VEND_CD = null;
		l_PRD_ODR_PLACE_CD = null;
		l_ODR_ACPT_PSN_CD = null;
		l_UNIT_CD = null;
		l_SALES_AMOUNT_EXCH_RATES = null;
		l_INSPC_ACPT_DATE = null;
		l_INSPC_ACPT_QTY = null;
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
		l_ORG_SLIP_CD = null;
		l_CURRNCY_CD = null;
		l_SPCL_PRICE_CO = null;
		l_DEL_FLG = null;
		l_APPR_FLG = null;
		l_APPR_ID = null;
		l_APPR_DATE = null;
		l_h_TAX_CD = null;
		l_EXCH_RATE = null;
		l_ORG_TAX_CD = null;
		l_PVC2SHUBETU = null;
		l_PVC2ORGSLIP_CD = null;
		l_PVC2REDSLIP_CD = null;
		l_PVC2BLKSLIP_CD = null;
		l_PVC2RESULT = null;
		l_TAX_RATE_1 = null;
		l_TAX_RATE_2 = null;
		l_TAX_RATE_3 = null;
		l_TAX_ROUND_TYP = null;
		l_BUSINESS_OPR_DATE = null;
		l_PLANT_CD = null;
		l_SYS_CLASS_CODE = null;
		l_h_INSTALL_FLG = null;
		l_w_TAX_NAME = null;

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
	 * medKR0030010�N���X�̕W���R���X�g���N�^
	 */
	public KR0030010Struct()
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
	public void setStruct(KR0030010Struct struct)
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
	public void setStructM(KR0030010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.seth_SLIP_CD(struct.geth_SLIP_CD());
			this.setCUR_UNIT2(struct.getCUR_UNIT2());
			this.seth_SALES_SEQ_NO(struct.geth_SALES_SEQ_NO());
			this.setSLIP_CD(struct.getSLIP_CD());
			this.setSALES_DATE(struct.getSALES_DATE());
			this.setCUST_CD(struct.getCUST_CD());
			this.setCUST_ANAME(struct.getCUST_ANAME());
			this.setSALES_DEPT_CD(struct.getSALES_DEPT_CD());
			this.setORG_NAME(struct.getORG_NAME());
			this.setCUST_CHRG_PSN_CD(struct.getCUST_CHRG_PSN_CD());
			this.setUSER_NAME(struct.getUSER_NAME());
			this.setITEM_CD(struct.getITEM_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setCUST_ODR_NO(struct.getCUST_ODR_NO());
			this.setSALES_QTY(struct.getSALES_QTY());
			this.setSALES_UNIT_PRICE(struct.getSALES_UNIT_PRICE());
			this.setSALES_AMOUNT(struct.getSALES_AMOUNT());
			this.setCUR_UNIT(struct.getCUR_UNIT());
			this.setREMARKS(struct.getREMARKS());
			this.setSTATUS(struct.getSTATUS());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setAI_AR_IF_FLG(struct.getAI_AR_IF_FLG());
			this.setTAX_CD(struct.getTAX_CD());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setUNIT_QTY_TYP(struct.getUNIT_QTY_TYP());
			this.setOPTION_ID(struct.getOPTION_ID());
			this.setINSTALL_FLG(struct.getINSTALL_FLG());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setCUR_CD(struct.getCUR_CD());
			this.setEXCH_TYP(struct.getEXCH_TYP());
			this.setINSPC_ACPT_TYP(struct.getINSPC_ACPT_TYP());
			this.setTAX_APPLY_TYP(struct.getTAX_APPLY_TYP());
			this.setw_TAX_CD(struct.getw_TAX_CD());
			this.setDETAIL_ROUND_TYP(struct.getDETAIL_ROUND_TYP());
			this.setORG_CD(struct.getORG_CD());
			this.setUSER_CD(struct.getUSER_CD());
			this.setDECIMAL_FIG(struct.getDECIMAL_FIG());
			this.setSALES_SEQ_NO(struct.getSALES_SEQ_NO());
			this.setSALES_TYP(struct.getSALES_TYP());
			this.setVEND_CD(struct.getVEND_CD());
			this.setPRD_ODR_PLACE_CD(struct.getPRD_ODR_PLACE_CD());
			this.setODR_ACPT_PSN_CD(struct.getODR_ACPT_PSN_CD());
			this.setUNIT_CD(struct.getUNIT_CD());
			this.setSALES_AMOUNT_EXCH_RATES(struct.getSALES_AMOUNT_EXCH_RATES());
			this.setINSPC_ACPT_DATE(struct.getINSPC_ACPT_DATE());
			this.setINSPC_ACPT_QTY(struct.getINSPC_ACPT_QTY());
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
			this.setORG_SLIP_CD(struct.getORG_SLIP_CD());
			this.setCURRNCY_CD(struct.getCURRNCY_CD());
			this.setSPCL_PRICE_CO(struct.getSPCL_PRICE_CO());
			this.setDEL_FLG(struct.getDEL_FLG());
			this.setAPPR_FLG(struct.getAPPR_FLG());
			this.setAPPR_ID(struct.getAPPR_ID());
			this.setAPPR_DATE(struct.getAPPR_DATE());
			this.seth_TAX_CD(struct.geth_TAX_CD());
			this.setEXCH_RATE(struct.getEXCH_RATE());
			this.setORG_TAX_CD(struct.getORG_TAX_CD());
			this.setPVC2SHUBETU(struct.getPVC2SHUBETU());
			this.setPVC2ORGSLIP_CD(struct.getPVC2ORGSLIP_CD());
			this.setPVC2REDSLIP_CD(struct.getPVC2REDSLIP_CD());
			this.setPVC2BLKSLIP_CD(struct.getPVC2BLKSLIP_CD());
			this.setPVC2RESULT(struct.getPVC2RESULT());
			this.setTAX_RATE_1(struct.getTAX_RATE_1());
			this.setTAX_RATE_2(struct.getTAX_RATE_2());
			this.setTAX_RATE_3(struct.getTAX_RATE_3());
			this.setTAX_ROUND_TYP(struct.getTAX_ROUND_TYP());
			this.setBUSINESS_OPR_DATE(struct.getBUSINESS_OPR_DATE());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setSYS_CLASS_CODE(struct.getSYS_CLASS_CODE());
			this.seth_INSTALL_FLG(struct.geth_INSTALL_FLG());
			this.setw_TAX_NAME(struct.getw_TAX_NAME());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(KR0030010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_h_SLIP_CD(struct.getList_h_SLIP_CD());
			this.setList_CUR_UNIT2(struct.getList_CUR_UNIT2());
			this.setList_h_SALES_SEQ_NO(struct.getList_h_SALES_SEQ_NO());
			this.setList_SLIP_CD(struct.getList_SLIP_CD());
			this.setList_SALES_DATE(struct.getList_SALES_DATE());
			this.setList_CUST_CD(struct.getList_CUST_CD());
			this.setList_CUST_ANAME(struct.getList_CUST_ANAME());
			this.setList_SALES_DEPT_CD(struct.getList_SALES_DEPT_CD());
			this.setList_ORG_NAME(struct.getList_ORG_NAME());
			this.setList_CUST_CHRG_PSN_CD(struct.getList_CUST_CHRG_PSN_CD());
			this.setList_USER_NAME(struct.getList_USER_NAME());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_CUST_ODR_NO(struct.getList_CUST_ODR_NO());
			this.setList_SALES_QTY(struct.getList_SALES_QTY());
			this.setList_SALES_UNIT_PRICE(struct.getList_SALES_UNIT_PRICE());
			this.setList_SALES_AMOUNT(struct.getList_SALES_AMOUNT());
			this.setList_CUR_UNIT(struct.getList_CUR_UNIT());
			this.setList_REMARKS(struct.getList_REMARKS());
			this.setList_STATUS(struct.getList_STATUS());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_AI_AR_IF_FLG(struct.getList_AI_AR_IF_FLG());
			this.setList_TAX_CD(struct.getList_TAX_CD());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_UNIT_QTY_TYP(struct.getList_UNIT_QTY_TYP());
			this.setList_OPTION_ID(struct.getList_OPTION_ID());
			this.setList_INSTALL_FLG(struct.getList_INSTALL_FLG());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_CUR_CD(struct.getList_CUR_CD());
			this.setList_EXCH_TYP(struct.getList_EXCH_TYP());
			this.setList_INSPC_ACPT_TYP(struct.getList_INSPC_ACPT_TYP());
			this.setList_TAX_APPLY_TYP(struct.getList_TAX_APPLY_TYP());
			this.setList_w_TAX_CD(struct.getList_w_TAX_CD());
			this.setList_DETAIL_ROUND_TYP(struct.getList_DETAIL_ROUND_TYP());
			this.setList_ORG_CD(struct.getList_ORG_CD());
			this.setList_USER_CD(struct.getList_USER_CD());
			this.setList_DECIMAL_FIG(struct.getList_DECIMAL_FIG());
			this.setList_SALES_SEQ_NO(struct.getList_SALES_SEQ_NO());
			this.setList_SALES_TYP(struct.getList_SALES_TYP());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_PRD_ODR_PLACE_CD(struct.getList_PRD_ODR_PLACE_CD());
			this.setList_ODR_ACPT_PSN_CD(struct.getList_ODR_ACPT_PSN_CD());
			this.setList_UNIT_CD(struct.getList_UNIT_CD());
			this.setList_SALES_AMOUNT_EXCH_RATES(struct.getList_SALES_AMOUNT_EXCH_RATES());
			this.setList_INSPC_ACPT_DATE(struct.getList_INSPC_ACPT_DATE());
			this.setList_INSPC_ACPT_QTY(struct.getList_INSPC_ACPT_QTY());
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
			this.setList_ORG_SLIP_CD(struct.getList_ORG_SLIP_CD());
			this.setList_CURRNCY_CD(struct.getList_CURRNCY_CD());
			this.setList_SPCL_PRICE_CO(struct.getList_SPCL_PRICE_CO());
			this.setList_DEL_FLG(struct.getList_DEL_FLG());
			this.setList_APPR_FLG(struct.getList_APPR_FLG());
			this.setList_APPR_ID(struct.getList_APPR_ID());
			this.setList_APPR_DATE(struct.getList_APPR_DATE());
			this.setList_h_TAX_CD(struct.getList_h_TAX_CD());
			this.setList_EXCH_RATE(struct.getList_EXCH_RATE());
			this.setList_ORG_TAX_CD(struct.getList_ORG_TAX_CD());
			this.setList_PVC2SHUBETU(struct.getList_PVC2SHUBETU());
			this.setList_PVC2ORGSLIP_CD(struct.getList_PVC2ORGSLIP_CD());
			this.setList_PVC2REDSLIP_CD(struct.getList_PVC2REDSLIP_CD());
			this.setList_PVC2BLKSLIP_CD(struct.getList_PVC2BLKSLIP_CD());
			this.setList_PVC2RESULT(struct.getList_PVC2RESULT());
			this.setList_TAX_RATE_1(struct.getList_TAX_RATE_1());
			this.setList_TAX_RATE_2(struct.getList_TAX_RATE_2());
			this.setList_TAX_RATE_3(struct.getList_TAX_RATE_3());
			this.setList_TAX_ROUND_TYP(struct.getList_TAX_ROUND_TYP());
			this.setList_BUSINESS_OPR_DATE(struct.getList_BUSINESS_OPR_DATE());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_SYS_CLASS_CODE(struct.getList_SYS_CLASS_CODE());
			this.setList_h_INSTALL_FLG(struct.getList_h_INSTALL_FLG());
			this.setList_w_TAX_NAME(struct.getList_w_TAX_NAME());
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
	// �� 1 �ϐ������l�F i_h_SLIP_CD


	final static String i_h_SLIP_CD = null;

	// �� 2 �ϐ������l�F i_CUR_UNIT2


	final static String i_CUR_UNIT2 = null;

	// �� 3 �ϐ������l�F i_h_SALES_SEQ_NO


	final static String i_h_SALES_SEQ_NO = null;

	// �� 4 �ϐ������l�F i_SLIP_CD


	final static String i_SLIP_CD = null;

	// �� 5 �ϐ������l�F i_SALES_DATE


	final static String i_SALES_DATE = null;

	// �� 6 �ϐ������l�F i_CUST_CD


	final static String i_CUST_CD = null;

	// �� 7 �ϐ������l�F i_CUST_ANAME


	final static String i_CUST_ANAME = null;

	// �� 8 �ϐ������l�F i_SALES_DEPT_CD


	final static String i_SALES_DEPT_CD = null;

	// �� 9 �ϐ������l�F i_ORG_NAME


	final static String i_ORG_NAME = null;

	// �� 10 �ϐ������l�F i_CUST_CHRG_PSN_CD


	final static String i_CUST_CHRG_PSN_CD = null;

	// �� 11 �ϐ������l�F i_USER_NAME


	final static String i_USER_NAME = null;

	// �� 12 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 13 �ϐ������l�F i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// �� 14 �ϐ������l�F i_CUST_ODR_NO


	final static String i_CUST_ODR_NO = null;

	// �� 15 �ϐ������l�F i_SALES_QTY


	final static String i_SALES_QTY = null;

	// �� 16 �ϐ������l�F i_SALES_UNIT_PRICE


	final static String i_SALES_UNIT_PRICE = null;

	// �� 17 �ϐ������l�F i_SALES_AMOUNT


	final static String i_SALES_AMOUNT = null;

	// �� 18 �ϐ������l�F i_CUR_UNIT


	final static String i_CUR_UNIT = null;

	// �� 19 �ϐ������l�F i_REMARKS


	final static String i_REMARKS = null;

	// �� 20 �ϐ������l�F i_STATUS


	final static String i_STATUS = null;

	// �� 21 �ϐ������l�F i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// �� 22 �ϐ������l�F i_AI_AR_IF_FLG


	final static String i_AI_AR_IF_FLG = null;

	// �� 23 �ϐ������l�F i_TAX_CD


	final static String i_TAX_CD = null;

	// �� 24 �ϐ������l�F i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// �� 25 �ϐ������l�F i_UNIT_QTY_TYP


	final static String i_UNIT_QTY_TYP = null;

	// �� 26 �ϐ������l�F i_OPTION_ID


	final static String i_OPTION_ID = null;

	// �� 27 �ϐ������l�F i_INSTALL_FLG


	final static String i_INSTALL_FLG = null;

	// �� 28 �ϐ������l�F i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// �� 29 �ϐ������l�F i_CUR_CD


	final static String i_CUR_CD = null;

	// �� 30 �ϐ������l�F i_EXCH_TYP


	final static String i_EXCH_TYP = null;

	// �� 31 �ϐ������l�F i_INSPC_ACPT_TYP


	final static String i_INSPC_ACPT_TYP = null;

	// �� 32 �ϐ������l�F i_TAX_APPLY_TYP


	final static String i_TAX_APPLY_TYP = null;

	// �� 33 �ϐ������l�F i_w_TAX_CD


	final static String i_w_TAX_CD = null;

	// �� 34 �ϐ������l�F i_DETAIL_ROUND_TYP


	final static String i_DETAIL_ROUND_TYP = null;

	// �� 35 �ϐ������l�F i_ORG_CD


	final static String i_ORG_CD = null;

	// �� 36 �ϐ������l�F i_USER_CD


	final static String i_USER_CD = null;

	// �� 37 �ϐ������l�F i_DECIMAL_FIG


	final static String i_DECIMAL_FIG = null;

	// �� 38 �ϐ������l�F i_SALES_SEQ_NO


	final static String i_SALES_SEQ_NO = null;

	// �� 39 �ϐ������l�F i_SALES_TYP


	final static String i_SALES_TYP = null;

	// �� 40 �ϐ������l�F i_VEND_CD


	final static String i_VEND_CD = null;

	// �� 41 �ϐ������l�F i_PRD_ODR_PLACE_CD


	final static String i_PRD_ODR_PLACE_CD = null;

	// �� 42 �ϐ������l�F i_ODR_ACPT_PSN_CD


	final static String i_ODR_ACPT_PSN_CD = null;

	// �� 43 �ϐ������l�F i_UNIT_CD


	final static String i_UNIT_CD = null;

	// �� 44 �ϐ������l�F i_SALES_AMOUNT_EXCH_RATES


	final static String i_SALES_AMOUNT_EXCH_RATES = null;

	// �� 45 �ϐ������l�F i_INSPC_ACPT_DATE


	final static String i_INSPC_ACPT_DATE = null;

	// �� 46 �ϐ������l�F i_INSPC_ACPT_QTY


	final static String i_INSPC_ACPT_QTY = null;

	// �� 47 �ϐ������l�F i_EXTERNAL_TAX_SALES_AMOUNT


	final static String i_EXTERNAL_TAX_SALES_AMOUNT = null;

	// �� 48 �ϐ������l�F i_INTERNAL_TAX_SALES_AMOUNT


	final static String i_INTERNAL_TAX_SALES_AMOUNT = null;

	// �� 49 �ϐ������l�F i_TAXFREE_SALES_AMOUNT


	final static String i_TAXFREE_SALES_AMOUNT = null;

	// �� 50 �ϐ������l�F i_TAX_CREDIT_SALES_AMOUNT


	final static String i_TAX_CREDIT_SALES_AMOUNT = null;

	// �� 51 �ϐ������l�F i_EXTERNAL_TAX_AMOUNT


	final static String i_EXTERNAL_TAX_AMOUNT = null;

	// �� 52 �ϐ������l�F i_INTERNAL_TAX_AMOUNT


	final static String i_INTERNAL_TAX_AMOUNT = null;

	// �� 53 �ϐ������l�F i_TAX_AMOUNT_1


	final static String i_TAX_AMOUNT_1 = null;

	// �� 54 �ϐ������l�F i_TAX_AMOUNT_2


	final static String i_TAX_AMOUNT_2 = null;

	// �� 55 �ϐ������l�F i_TAX_AMOUNT_3


	final static String i_TAX_AMOUNT_3 = null;

	// �� 56 �ϐ������l�F i_OWN_CUR_TAXCREDIT_SALES_AMOUNT


	final static String i_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;

	// �� 57 �ϐ������l�F i_ORG_SLIP_CD


	final static String i_ORG_SLIP_CD = null;

	// �� 58 �ϐ������l�F i_CURRNCY_CD


	final static String i_CURRNCY_CD = null;

	// �� 59 �ϐ������l�F i_SPCL_PRICE_CO


	final static String i_SPCL_PRICE_CO = null;

	// �� 60 �ϐ������l�F i_DEL_FLG


	final static String i_DEL_FLG = null;

	// �� 61 �ϐ������l�F i_APPR_FLG


	final static String i_APPR_FLG = null;

	// �� 62 �ϐ������l�F i_APPR_ID


	final static String i_APPR_ID = null;

	// �� 63 �ϐ������l�F i_APPR_DATE


	final static String i_APPR_DATE = null;

	// �� 64 �ϐ������l�F i_h_TAX_CD


	final static String i_h_TAX_CD = null;

	// �� 65 �ϐ������l�F i_EXCH_RATE


	final static String i_EXCH_RATE = null;

	// �� 66 �ϐ������l�F i_ORG_TAX_CD


	final static String i_ORG_TAX_CD = null;

	// �� 67 �ϐ������l�F i_PVC2SHUBETU


	final static String i_PVC2SHUBETU = null;

	// �� 68 �ϐ������l�F i_PVC2ORGSLIP_CD


	final static String i_PVC2ORGSLIP_CD = null;

	// �� 69 �ϐ������l�F i_PVC2REDSLIP_CD


	final static String i_PVC2REDSLIP_CD = null;

	// �� 70 �ϐ������l�F i_PVC2BLKSLIP_CD


	final static String i_PVC2BLKSLIP_CD = null;

	// �� 71 �ϐ������l�F i_PVC2RESULT


	final static String i_PVC2RESULT = null;

	// �� 72 �ϐ������l�F i_TAX_RATE_1


	final static String i_TAX_RATE_1 = null;

	// �� 73 �ϐ������l�F i_TAX_RATE_2


	final static String i_TAX_RATE_2 = null;

	// �� 74 �ϐ������l�F i_TAX_RATE_3


	final static String i_TAX_RATE_3 = null;

	// �� 75 �ϐ������l�F i_TAX_ROUND_TYP


	final static String i_TAX_ROUND_TYP = null;

	// �� 76 �ϐ������l�F i_BUSINESS_OPR_DATE


	final static String i_BUSINESS_OPR_DATE = null;

	// �� 77 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 78 �ϐ������l�F i_SYS_CLASS_CODE


	final static String i_SYS_CLASS_CODE = null;

	// �� 79 �ϐ������l�F i_h_INSTALL_FLG


	final static String i_h_INSTALL_FLG = null;

	// �� 80 �ϐ������l�F i_w_TAX_NAME


	final static String i_w_TAX_NAME = null;

*/

	//{{user_implement_code
         // TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
         // �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
        // �� 1 �ϐ������l�F i_SLIP_CD
        final static String i_SLIP_CD = null;
        // �� 2 �ϐ������l�F i_SALES_DATE
        final static String i_SALES_DATE = null;
        // �� 3 �ϐ������l�F i_CUST_CD
        final static String i_CUST_CD = null;
        // �� 4 �ϐ������l�F i_CUST_ANAME
        final static String i_CUST_ANAME = null;
        // �� 5 �ϐ������l�F i_SALES_DEPT_CD
        final static String i_SALES_DEPT_CD = null;
        // �� 6 �ϐ������l�F i_ORG_NAME
        final static String i_ORG_NAME = null;
        // �� 7 �ϐ������l�F i_CUST_CHRG_PSN_CD
        final static String i_CUST_CHRG_PSN_CD = null;
        // �� 8 �ϐ������l�F i_USER_NAME
        final static String i_USER_NAME = null;
        // �� 9 �ϐ������l�F i_ITEM_CD
        final static String i_ITEM_CD = null;
        // �� 10 �ϐ������l�F i_ITEM_NAME
        final static String i_ITEM_NAME = null;
        // �� 11 �ϐ������l�F i_CUST_ODR_NO
        final static String i_CUST_ODR_NO = null;
        // �� 12 �ϐ������l�F i_SALES_QTY
        final static String i_SALES_QTY = null;
        // �� 13 �ϐ������l�F i_SALES_UNIT_PRICE
        final static String i_SALES_UNIT_PRICE = null;
        // �� 14 �ϐ������l�F i_SALES_AMOUNT
        final static String i_SALES_AMOUNT = null;
        // �� 15 �ϐ������l�F i_CUR_UNIT
        final static String i_CUR_UNIT = null;
        // �� 16 �ϐ������l�F i_REMARKS
        final static String i_REMARKS = null;
        // �� 17 �ϐ������l�F i_STATUS
        final static String i_STATUS = null;
        // �� 18 �ϐ������l�F i_MODIFY_COUNT
        final static String i_MODIFY_COUNT = null;
        // �� 19 �ϐ������l�F i_OPTION_ID
        final static String i_OPTION_ID = null;
        // �� 20 �ϐ������l�F i_COMPANY_CD
        final static String i_COMPANY_CD = null;
        // �� 21 �ϐ������l�F i_CUR_CD
        final static String i_CUR_CD = null;
        // �� 22 �ϐ������l�F i_EXCH_TYP
        final static String i_EXCH_TYP = null;
        // �� 23 �ϐ������l�F i_INSPC_ACPT_TYP
        final static String i_INSPC_ACPT_TYP = null;
        // �� 24 �ϐ������l�F i_TAX_CD
        final static String i_TAX_CD = null;
        // �� 25 �ϐ������l�F i_DETAIL_ROUND_TYP
        final static String i_DETAIL_ROUND_TYP = null;
        // �� 26 �ϐ������l�F i_ORG_CD
        final static String i_ORG_CD = null;
        // �� 27 �ϐ������l�F i_USER_CD
        final static String i_USER_CD = null;
        // �� 28 �ϐ������l�F i_DECIMAL_FIG
        final static String i_DECIMAL_FIG = null;
        // �� 29 �ϐ������l�F i_STOCK_UNIT
        final static String i_STOCK_UNIT = null;
        // �� 30 �ϐ������l�F i_SALES_SEQ_NO
        final static String i_SALES_SEQ_NO = null;
        // �� 31 �ϐ������l�F i_SALES_TYP
        final static String i_SALES_TYP = null;
        // �� 32 �ϐ������l�F i_VEND_CD
        final static String i_VEND_CD = null;
        // �� 33 �ϐ������l�F i_PRD_ODR_PLACE_CD
        final static String i_PRD_ODR_PLACE_CD = null;
        // �� 34 �ϐ������l�F i_ODR_ACPT_PSN_CD
        final static String i_ODR_ACPT_PSN_CD = null;
        // �� 35 �ϐ������l�F i_UNIT_CD
        final static String i_UNIT_CD = null;
        // �� 36 �ϐ������l�F i_SALES_AMOUNT_EXCH_RATES
        final static String i_SALES_AMOUNT_EXCH_RATES = null;
        // �� 37 �ϐ������l�F i_INSPC_ACPT_DATE
        final static String i_INSPC_ACPT_DATE = null;
        // �� 38 �ϐ������l�F i_INSPC_ACPT_QTY
        final static String i_INSPC_ACPT_QTY = null;
        // �� 39 �ϐ������l�F i_EXTERNAL_TAX_SALES_AMOUNT
        final static String i_EXTERNAL_TAX_SALES_AMOUNT = null;
        // �� 40 �ϐ������l�F i_INTERNAL_TAX_SALES_AMOUNT
        final static String i_INTERNAL_TAX_SALES_AMOUNT = null;
        // �� 41 �ϐ������l�F i_TAXFREE_SALES_AMOUNT
        final static String i_TAXFREE_SALES_AMOUNT = null;
        // �� 42 �ϐ������l�F i_TAX_CREDIT_SALES_AMOUNT
        final static String i_TAX_CREDIT_SALES_AMOUNT = null;
        // �� 43 �ϐ������l�F i_EXTERNAL_TAX_AMOUNT
        final static String i_EXTERNAL_TAX_AMOUNT = null;
        // �� 44 �ϐ������l�F i_INTERNAL_TAX_AMOUNT
        final static String i_INTERNAL_TAX_AMOUNT = null;
        // �� 45 �ϐ������l�F i_TAX_AMOUNT_1
        final static String i_TAX_AMOUNT_1 = null;
        // �� 46 �ϐ������l�F i_TAX_AMOUNT_2
        final static String i_TAX_AMOUNT_2 = null;
        // �� 47 �ϐ������l�F i_TAX_AMOUNT_3
        final static String i_TAX_AMOUNT_3 = null;
        // �� 48 �ϐ������l�F i_OWN_CUR_TAXCREDIT_SALES_AMOUNT
        final static String i_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;
        // �� 49 �ϐ������l�F i_ORG_SLIP_CD
        final static String i_ORG_SLIP_CD = null;
        // �� 50 �ϐ������l�F i_CURRNCY_CD
        final static String i_CURRNCY_CD = null;
        // �� 51 �ϐ������l�F i_SPCL_PRICE_CO
        final static String i_SPCL_PRICE_CO = null;
        // �� 52 �ϐ������l�F i_DEL_FLG
        final static String i_DEL_FLG = null;
        // �� 53 �ϐ������l�F i_PVC2SHUBETU
        final static String i_PVC2SHUBETU = null;
        // �� 54 �ϐ������l�F i_PVC2ORGSLIP_CD
        final static String i_PVC2ORGSLIP_CD = null;
        // �� 55 �ϐ������l�F i_PVC2REDSLIP_CD
        final static String i_PVC2REDSLIP_CD = null;
        // �� 56 �ϐ������l�F i_PVC2BLKSLIP_CD
        final static String i_PVC2BLKSLIP_CD = null;
        // �� 57 �ϐ������l�F i_PVC2RESULT
        final static String i_PVC2RESULT = null;
        // �� 58 �ϐ������l�F i_TAX_RATE_1
        final static String i_TAX_RATE_1 = null;
        // �� 59 �ϐ������l�F i_TAX_RATE_2
        final static String i_TAX_RATE_2 = null;
        // �� 60 �ϐ������l�F i_TAX_RATE_3
        final static String i_TAX_RATE_3 = null;
        // �� 61 �ϐ������l�F i_TAX_ROUND_TYP
        final static String i_TAX_ROUND_TYP = null;
        // �� 62 �ϐ������l�F i_h_SLIP_CD
        final static String i_h_SLIP_CD = null;
       
        /**
         * ������
         *
         */
        public void initialize()
        {
       
         clear();
       
         m_SLIP_CD = i_SLIP_CD;
         m_SALES_DATE = i_SALES_DATE;
         m_CUST_CD = i_CUST_CD;
         m_CUST_ANAME = i_CUST_ANAME;
         m_SALES_DEPT_CD = i_SALES_DEPT_CD;
         m_ORG_NAME = i_ORG_NAME;
         m_CUST_CHRG_PSN_CD = i_CUST_CHRG_PSN_CD;
         m_USER_NAME = i_USER_NAME;
         m_ITEM_CD = i_ITEM_CD;
         m_ITEM_NAME = i_ITEM_NAME;
         m_CUST_ODR_NO = i_CUST_ODR_NO;
         m_SALES_QTY = i_SALES_QTY;
         m_SALES_UNIT_PRICE = i_SALES_UNIT_PRICE;
         m_SALES_AMOUNT = i_SALES_AMOUNT;
         m_CUR_UNIT = i_CUR_UNIT;
         m_REMARKS = i_REMARKS;
         m_STATUS = i_STATUS;
         m_MODIFY_COUNT = i_MODIFY_COUNT;
         m_OPTION_ID = i_OPTION_ID;
         m_COMPANY_CD = i_COMPANY_CD;
         m_CUR_CD = i_CUR_CD;
         m_EXCH_TYP = i_EXCH_TYP;
         m_INSPC_ACPT_TYP = i_INSPC_ACPT_TYP;
         m_TAX_CD = i_TAX_CD;
         m_DETAIL_ROUND_TYP = i_DETAIL_ROUND_TYP;
         m_ORG_CD = i_ORG_CD;
         m_USER_CD = i_USER_CD;
         m_DECIMAL_FIG = i_DECIMAL_FIG;
         m_STOCK_UNIT = i_STOCK_UNIT;
         m_SALES_SEQ_NO = i_SALES_SEQ_NO;
         m_SALES_TYP = i_SALES_TYP;
         m_VEND_CD = i_VEND_CD;
         m_PRD_ODR_PLACE_CD = i_PRD_ODR_PLACE_CD;
         m_ODR_ACPT_PSN_CD = i_ODR_ACPT_PSN_CD;
         m_UNIT_CD = i_UNIT_CD;
         m_SALES_AMOUNT_EXCH_RATES = i_SALES_AMOUNT_EXCH_RATES;
         m_INSPC_ACPT_DATE = i_INSPC_ACPT_DATE;
         m_INSPC_ACPT_QTY = i_INSPC_ACPT_QTY;
         m_EXTERNAL_TAX_SALES_AMOUNT = i_EXTERNAL_TAX_SALES_AMOUNT;
         m_INTERNAL_TAX_SALES_AMOUNT = i_INTERNAL_TAX_SALES_AMOUNT;
         m_TAXFREE_SALES_AMOUNT = i_TAXFREE_SALES_AMOUNT;
         m_TAX_CREDIT_SALES_AMOUNT = i_TAX_CREDIT_SALES_AMOUNT;
         m_EXTERNAL_TAX_AMOUNT = i_EXTERNAL_TAX_AMOUNT;
         m_INTERNAL_TAX_AMOUNT = i_INTERNAL_TAX_AMOUNT;
         m_TAX_AMOUNT_1 = i_TAX_AMOUNT_1;
         m_TAX_AMOUNT_2 = i_TAX_AMOUNT_2;
         m_TAX_AMOUNT_3 = i_TAX_AMOUNT_3;
         m_OWN_CUR_TAXCREDIT_SALES_AMOUNT = i_OWN_CUR_TAXCREDIT_SALES_AMOUNT;
         m_ORG_SLIP_CD = i_ORG_SLIP_CD;
         m_CURRNCY_CD = i_CURRNCY_CD;
         m_SPCL_PRICE_CO = i_SPCL_PRICE_CO;
         m_DEL_FLG = i_DEL_FLG;
         m_PVC2SHUBETU = i_PVC2SHUBETU;
         m_PVC2ORGSLIP_CD = i_PVC2ORGSLIP_CD;
         m_PVC2REDSLIP_CD = i_PVC2REDSLIP_CD;
         m_PVC2BLKSLIP_CD = i_PVC2BLKSLIP_CD;
         m_PVC2RESULT = i_PVC2RESULT;
         m_TAX_RATE_1 = i_TAX_RATE_1;
         m_TAX_RATE_2 = i_TAX_RATE_2;
         m_TAX_RATE_3 = i_TAX_RATE_3;
         m_TAX_ROUND_TYP = i_TAX_ROUND_TYP;
         m_h_SLIP_CD = i_h_SLIP_CD;
        }
       
         // TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}