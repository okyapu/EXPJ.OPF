/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KQ0010/src/com/nec/jp/orteus/metamorBase/KQ0010/KQ0010010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.KQ0010;

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
 * CLASS     : KQ0010010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: geng-jia $
 * @version $Revision: 1.21 $ $Date: 2015/12/03 08:12:19 $
 *
 */
//}}user_implement_code_header

public class KQ0010010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_l_NO */
	public String m_l_NO = null;
	/** �� 2 �ϐ��F m_l_ODR_TYP_DN */
	public String m_l_ODR_TYP_DN = null;
	/** �� 3 �ϐ��F m_l_SPCL_PRICE_TYP_DN */
	public String m_l_SPCL_PRICE_TYP_DN = null;
	/** �� 4 �ϐ��F m_l_DEPO_TYP_DN */
	public String m_l_DEPO_TYP_DN = null;
	/** �� 5 �ϐ��F m_ODR_TYP */
	public String m_ODR_TYP = null;
	/** �� 6 �ϐ��F m_ODR_TYP_name */
	public String m_ODR_TYP_name = null;
	/** �� 7 �ϐ��F m_ODR_TYP_val */
	public String m_ODR_TYP_val = null;
	/** �� 8 �ϐ��F m_NO */
	public String m_NO = null;
	/** �� 9 �ϐ��F m_CUST_ODR_NO */
	public String m_CUST_ODR_NO = null;
	/** �� 10 �ϐ��F m_CUST_ITEM_CD */
	public String m_CUST_ITEM_CD = null;
	/** �� 11 �ϐ��F m_CUST_CD */
	public String m_CUST_CD = null;
	/** �� 12 �ϐ��F m_DLV_LOC_CD */
	public String m_DLV_LOC_CD = null;
	/** �� 13 �ϐ��F m_DESINATED_DLV_DATE */
	public String m_DESINATED_DLV_DATE = null;
	/** �� 14 �ϐ��F m_ODR_QTY */
	public String m_ODR_QTY = null;
	/** �� 15 �ϐ��F m_ODR_UNIT_PRICE */
	public String m_ODR_UNIT_PRICE = null;
	/** �� 16 �ϐ��F m_SPCL_PRICE_TYP */
	public String m_SPCL_PRICE_TYP = null;
	/** �� 17 �ϐ��F m_SPCL_PRICE_TYP_name */
	public String m_SPCL_PRICE_TYP_name = null;
	/** �� 18 �ϐ��F m_SPCL_PRICE_TYP_val */
	public String m_SPCL_PRICE_TYP_val = null;
	/** �� 19 �ϐ��F m_REMARKS */
	public String m_REMARKS = null;
	/** �� 20 �ϐ��F m_ODR_ACPT_DATE */
	public String m_ODR_ACPT_DATE = null;
	/** �� 21 �ϐ��F m_h_BUSINESS_OPR_DATE */
	public String m_h_BUSINESS_OPR_DATE = null;
	/** �� 22 �ϐ��F m_c_DOODR */
	public String m_c_DOODR = null;
	/** �� 23 �ϐ��F m_JOB_ODR_QTY */
	public String m_JOB_ODR_QTY = null;
	/** �� 24 �ϐ��F m_JOB_ODR_DLV_DATE */
	public String m_JOB_ODR_DLV_DATE = null;
	/** �� 25 �ϐ��F m_ALC_GRP_CD */
	public String m_ALC_GRP_CD = null;
	/** �� 26 �ϐ��F m_c_INPUTODRCD */
	public String m_c_INPUTODRCD = null;
	/** �� 27 �ϐ��F m_h_DOODRFLG */
	public String m_h_DOODRFLG = null;
	/** �� 28 �ϐ��F m_h_INPUTODRCDFLG */
	public String m_h_INPUTODRCDFLG = null;
	/** �� 29 �ϐ��F m_h_CHECK_STATUS */
	public String m_h_CHECK_STATUS = null;
	/** �� 30 �ϐ��F m_h_APR_ODR */
	public String m_h_APR_ODR = null;
	/** �� 31 �ϐ��F m_APPR_REMARKS */
	public String m_APPR_REMARKS = null;
	/** �� 32 �ϐ��F m_l_APPR_REMARKS */
	public String m_l_APPR_REMARKS = null;
	/** �� 33 �ϐ��F m_l_PROJECT_CD */
	public String m_l_PROJECT_CD = null;
	/** �� 34 �ϐ��F m_l_ESTIMATE_NO */
	public String m_l_ESTIMATE_NO = null;
	/** �� 35 �ϐ��F m_l_DETAL_NO */
	public String m_l_DETAL_NO = null;
	/** �� 36 �ϐ��F m_l_ODR_CTL_NO */
	public String m_l_ODR_CTL_NO = null;
	/** �� 37 �ϐ��F m_l_CUST_CD */
	public String m_l_CUST_CD = null;
	/** �� 38 �ϐ��F m_l_CUST_ITEM_CD */
	public String m_l_CUST_ITEM_CD = null;
	/** �� 39 �ϐ��F m_l_ITEM_CD */
	public String m_l_ITEM_CD = null;
	/** �� 40 �ϐ��F m_l_CUST_ITEM_NAME */
	public String m_l_CUST_ITEM_NAME = null;
	/** �� 41 �ϐ��F m_l_ITEM_NAME */
	public String m_l_ITEM_NAME = null;
	/** �� 42 �ϐ��F m_l_ODR_NO */
	public String m_l_ODR_NO = null;
	/** �� 43 �ϐ��F m_l_ODR_TYP */
	public String m_l_ODR_TYP = null;
	/** �� 44 �ϐ��F m_l_CUST_ODR_NO */
	public String m_l_CUST_ODR_NO = null;
	/** �� 45 �ϐ��F m_l_CUST_CHRG_ORG_CD */
	public String m_l_CUST_CHRG_ORG_CD = null;
	/** �� 46 �ϐ��F m_l_CUST_CHRG_PSN_CD */
	public String m_l_CUST_CHRG_PSN_CD = null;
	/** �� 47 �ϐ��F m_l_ODR_ACPT_ORG_CD */
	public String m_l_ODR_ACPT_ORG_CD = null;
	/** �� 48 �ϐ��F m_l_ODR_ACPT_PSN_CD */
	public String m_l_ODR_ACPT_PSN_CD = null;
	/** �� 49 �ϐ��F m_l_CURRNCY_CD */
	public String m_l_CURRNCY_CD = null;
	/** �� 50 �ϐ��F m_l_EXCH_TYP */
	public String m_l_EXCH_TYP = null;
	/** �� 51 �ϐ��F m_l_DLV_LOC_CD */
	public String m_l_DLV_LOC_CD = null;
	/** �� 52 �ϐ��F m_l_DLV_LOC_NAME_KANJI */
	public String m_l_DLV_LOC_NAME_KANJI = null;
	/** �� 53 �ϐ��F m_l_ODR_UNIT_PRICE */
	public String m_l_ODR_UNIT_PRICE = null;
	/** �� 54 �ϐ��F m_l_SPCL_PRICE_TYP */
	public String m_l_SPCL_PRICE_TYP = null;
	/** �� 55 �ϐ��F m_l_DEPO_TYP */
	public String m_l_DEPO_TYP = null;
	/** �� 56 �ϐ��F m_l_DESINATED_DLV_DATE */
	public String m_l_DESINATED_DLV_DATE = null;
	/** �� 57 �ϐ��F m_l_STD_DESINATED_RCV_DATE */
	public String m_l_STD_DESINATED_RCV_DATE = null;
	/** �� 58 �ϐ��F m_l_ODR_QTY */
	public String m_l_ODR_QTY = null;
	/** �� 59 �ϐ��F m_l_REMAIN_UNCONFIRM_ODR_QTY */
	public String m_l_REMAIN_UNCONFIRM_ODR_QTY = null;
	/** �� 60 �ϐ��F m_l_UNIT_CD */
	public String m_l_UNIT_CD = null;
	/** �� 61 �ϐ��F m_l_UNCONFIRM_ODR_BALANCE */
	public String m_l_UNCONFIRM_ODR_BALANCE = null;
	/** �� 62 �ϐ��F m_l_ODR_AMOUNT */
	public String m_l_ODR_AMOUNT = null;
	/** �� 63 �ϐ��F m_l_ODR_AMOUNT_EXCH_RATES */
	public String m_l_ODR_AMOUNT_EXCH_RATES = null;
	/** �� 64 �ϐ��F m_l_TRANSPORT_CD */
	public String m_l_TRANSPORT_CD = null;
	/** �� 65 �ϐ��F m_l_TRANSPORT_TYP */
	public String m_l_TRANSPORT_TYP = null;
	/** �� 66 �ϐ��F m_l_TAX_APPLY_TYP */
	public String m_l_TAX_APPLY_TYP = null;
	/** �� 67 �ϐ��F m_l_TAX_CD */
	public String m_l_TAX_CD = null;
	/** �� 68 �ϐ��F m_l_TAX_CALC_TYP */
	public String m_l_TAX_CALC_TYP = null;
	/** �� 69 �ϐ��F m_l_REMARKS */
	public String m_l_REMARKS = null;
	/** �� 70 �ϐ��F m_l_ODR_ACPT_DATE */
	public String m_l_ODR_ACPT_DATE = null;
	/** �� 71 �ϐ��F m_l_SHIP_PLAN_REMAIN_QTY */
	public String m_l_SHIP_PLAN_REMAIN_QTY = null;
	/** �� 72 �ϐ��F m_l_PARTIAL_SHIP_INST_FLG */
	public String m_l_PARTIAL_SHIP_INST_FLG = null;
	/** �� 73 �ϐ��F m_PART_NAME */
	public String m_PART_NAME = null;
	/** �� 74 �ϐ��F m_l_RSLT_CTL_SEQ_CD */
	public String m_l_RSLT_CTL_SEQ_CD = null;
	/** �� 75 �ϐ��F m_l_UNIT */
	public String m_l_UNIT = null;
	/** �� 76 �ϐ��F m_l_DLV_PLACE_CD */
	public String m_l_DLV_PLACE_CD = null;
	/** �� 77 �ϐ��F m_l_UNIT_PRICE */
	public String m_l_UNIT_PRICE = null;
	/** �� 78 �ϐ��F m_l_CUR_CD */
	public String m_l_CUR_CD = null;
	/** �� 79 �ϐ��F m_l_SPCL_PRICE_CO */
	public String m_l_SPCL_PRICE_CO = null;
	/** �� 80 �ϐ��F m_l_CUST_DLV_CD */
	public String m_l_CUST_DLV_CD = null;
	/** �� 81 �ϐ��F m_l_CUST_DLV_KEY_CD */
	public String m_l_CUST_DLV_KEY_CD = null;
	/** �� 82 �ϐ��F m_l_FIXED_ODR_NO */
	public String m_l_FIXED_ODR_NO = null;
	/** �� 83 �ϐ��F m_l_ALCTED_SEQ_CD */
	public String m_l_ALCTED_SEQ_CD = null;
	/** �� 84 �ϐ��F m_l_ALCTED_UNCONFIRM_ODR_NO */
	public String m_l_ALCTED_UNCONFIRM_ODR_NO = null;
	/** �� 85 �ϐ��F m_l_ALCTED_UNCONFIRM_ODR_QTY */
	public String m_l_ALCTED_UNCONFIRM_ODR_QTY = null;
	/** �� 86 �ϐ��F m_l_LAST_ANS_DLV_DATE_RCD */
	public String m_l_LAST_ANS_DLV_DATE_RCD = null;
	/** �� 87 �ϐ��F m_l_DESINATED_SHIP_DATE */
	public String m_l_DESINATED_SHIP_DATE = null;
	/** �� 88 �ϐ��F m_l_DESINATED_SHIP_QTY */
	public String m_l_DESINATED_SHIP_QTY = null;
	/** �� 89 �ϐ��F m_l_REST_SHIP_ODR_QTY */
	public String m_l_REST_SHIP_ODR_QTY = null;
	/** �� 90 �ϐ��F m_l_CUST_ANAME */
	public String m_l_CUST_ANAME = null;
	/** �� 91 �ϐ��F m_l_OWN_ORG_CD */
	public String m_l_OWN_ORG_CD = null;
	/** �� 92 �ϐ��F m_l_OWN_PERSON_CD */
	public String m_l_OWN_PERSON_CD = null;
	/** �� 93 �ϐ��F m_l_DETAIL_ROUND_TYP */
	public String m_l_DETAIL_ROUND_TYP = null;
	/** �� 94 �ϐ��F m_l_COMPANY_CD */
	public String m_l_COMPANY_CD = null;
	/** �� 95 �ϐ��F m_l_DLV_LOC_NAME */
	public String m_l_DLV_LOC_NAME = null;
	/** �� 96 �ϐ��F m_l_TRANSPORT_LT */
	public String m_l_TRANSPORT_LT = null;
	/** �� 97 �ϐ��F m_l_DEPO_WH_CD */
	public String m_l_DEPO_WH_CD = null;
	/** �� 98 �ϐ��F m_l_SHIP_WH_CD */
	public String m_l_SHIP_WH_CD = null;
	/** �� 99 �ϐ��F m_h_SHIP_PLANT_CD */
	public String m_h_SHIP_PLANT_CD = null;
	/** �� 100 �ϐ��F m_l_UNIT_COST */
	public String m_l_UNIT_COST = null;
	/** �� 101 �ϐ��F m_l_EFF_PHASE_IN_DATE */
	public String m_l_EFF_PHASE_IN_DATE = null;
	/** �� 102 �ϐ��F m_l_STOCK_UNIT */
	public String m_l_STOCK_UNIT = null;
	/** �� 103 �ϐ��F m_l_UNIT_QTY_TYP */
	public String m_l_UNIT_QTY_TYP = null;
	/** �� 104 �ϐ��F m_h_MRP_ODR_TYP */
	public String m_h_MRP_ODR_TYP = null;
	/** �� 105 �ϐ��F m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** �� 106 �ϐ��F m_CODE */
	public String m_CODE = null;
	/** �� 107 �ϐ��F m_CLASS_CODE */
	public String m_CLASS_CODE = null;
	/** �� 108 �ϐ��F m_HOME_CUR_CD */
	public String m_HOME_CUR_CD = null;
	/** �� 109 �ϐ��F m_BUSINESS_OPR_DATE */
	public String m_BUSINESS_OPR_DATE = null;
	/** �� 110 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 111 �ϐ��F m_l_CUR_UNIT */
	public String m_l_CUR_UNIT = null;
	/** �� 112 �ϐ��F m_h_PRD_REQ_JOB_ODR_TYP_1 */
	public String m_h_PRD_REQ_JOB_ODR_TYP_1 = null;
	/** �� 113 �ϐ��F m_h_PRD_REQ_JOB_ODR_TYP_2 */
	public String m_h_PRD_REQ_JOB_ODR_TYP_2 = null;
	/** �� 114 �ϐ��F m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** �� 115 �ϐ��F m_l_JOB_ODR_CD */
	public String m_l_JOB_ODR_CD = null;
	/** �� 116 �ϐ��F m_l_JOB_ODR_DLV_DATE */
	public String m_l_JOB_ODR_DLV_DATE = null;
	/** �� 117 �ϐ��F m_JOB_OD_CD */
	public String m_JOB_OD_CD = null;
	/** �� 118 �ϐ��F m_JOB_OD_CD_PREFIX */
	public String m_JOB_OD_CD_PREFIX = null;
	/** �� 119 �ϐ��F m_l_JOB_ODR_SET_FLG */
	public String m_l_JOB_ODR_SET_FLG = null;
	/** �� 120 �ϐ��F m_l_JOB_ODR_QTY */
	public String m_l_JOB_ODR_QTY = null;
	/** �� 121 �ϐ��F m_l_ALC_GRP_CD */
	public String m_l_ALC_GRP_CD = null;
	/** �� 122 �ϐ��F m_l_ALCD_QTY */
	public String m_l_ALCD_QTY = null;
	/** �� 123 �ϐ��F m_OD_CALC_FLG */
	public String m_OD_CALC_FLG = null;
	/** �� 124 �ϐ��F m_TAX_CD */
	public String m_TAX_CD = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_l_NO */
	public List l_l_NO = null;

	/** �� 2 List�ϐ��F l_l_ODR_TYP_DN */
	public List l_l_ODR_TYP_DN = null;

	/** �� 3 List�ϐ��F l_l_SPCL_PRICE_TYP_DN */
	public List l_l_SPCL_PRICE_TYP_DN = null;

	/** �� 4 List�ϐ��F l_l_DEPO_TYP_DN */
	public List l_l_DEPO_TYP_DN = null;

	/** �� 5 List�ϐ��F l_ODR_TYP */
	public List l_ODR_TYP = null;

	/** �� 6 List�ϐ��F l_ODR_TYP_name */
	public List l_ODR_TYP_name = null;

	/** �� 7 List�ϐ��F l_ODR_TYP_val */
	public List l_ODR_TYP_val = null;

	/** �� 8 List�ϐ��F l_NO */
	public List l_NO = null;

	/** �� 9 List�ϐ��F l_CUST_ODR_NO */
	public List l_CUST_ODR_NO = null;

	/** �� 10 List�ϐ��F l_CUST_ITEM_CD */
	public List l_CUST_ITEM_CD = null;

	/** �� 11 List�ϐ��F l_CUST_CD */
	public List l_CUST_CD = null;

	/** �� 12 List�ϐ��F l_DLV_LOC_CD */
	public List l_DLV_LOC_CD = null;

	/** �� 13 List�ϐ��F l_DESINATED_DLV_DATE */
	public List l_DESINATED_DLV_DATE = null;

	/** �� 14 List�ϐ��F l_ODR_QTY */
	public List l_ODR_QTY = null;

	/** �� 15 List�ϐ��F l_ODR_UNIT_PRICE */
	public List l_ODR_UNIT_PRICE = null;

	/** �� 16 List�ϐ��F l_SPCL_PRICE_TYP */
	public List l_SPCL_PRICE_TYP = null;

	/** �� 17 List�ϐ��F l_SPCL_PRICE_TYP_name */
	public List l_SPCL_PRICE_TYP_name = null;

	/** �� 18 List�ϐ��F l_SPCL_PRICE_TYP_val */
	public List l_SPCL_PRICE_TYP_val = null;

	/** �� 19 List�ϐ��F l_REMARKS */
	public List l_REMARKS = null;

	/** �� 20 List�ϐ��F l_ODR_ACPT_DATE */
	public List l_ODR_ACPT_DATE = null;

	/** �� 21 List�ϐ��F l_h_BUSINESS_OPR_DATE */
	public List l_h_BUSINESS_OPR_DATE = null;

	/** �� 22 List�ϐ��F l_c_DOODR */
	public List l_c_DOODR = null;

	/** �� 23 List�ϐ��F l_JOB_ODR_QTY */
	public List l_JOB_ODR_QTY = null;

	/** �� 24 List�ϐ��F l_JOB_ODR_DLV_DATE */
	public List l_JOB_ODR_DLV_DATE = null;

	/** �� 25 List�ϐ��F l_ALC_GRP_CD */
	public List l_ALC_GRP_CD = null;

	/** �� 26 List�ϐ��F l_c_INPUTODRCD */
	public List l_c_INPUTODRCD = null;

	/** �� 27 List�ϐ��F l_h_DOODRFLG */
	public List l_h_DOODRFLG = null;

	/** �� 28 List�ϐ��F l_h_INPUTODRCDFLG */
	public List l_h_INPUTODRCDFLG = null;

	/** �� 29 List�ϐ��F l_h_CHECK_STATUS */
	public List l_h_CHECK_STATUS = null;

	/** �� 30 List�ϐ��F l_h_APR_ODR */
	public List l_h_APR_ODR = null;

	/** �� 31 List�ϐ��F l_APPR_REMARKS */
	public List l_APPR_REMARKS = null;

	/** �� 32 List�ϐ��F l_l_APPR_REMARKS */
	public List l_l_APPR_REMARKS = null;

	/** �� 33 List�ϐ��F l_l_PROJECT_CD */
	public List l_l_PROJECT_CD = null;

	/** �� 34 List�ϐ��F l_l_ESTIMATE_NO */
	public List l_l_ESTIMATE_NO = null;

	/** �� 35 List�ϐ��F l_l_DETAL_NO */
	public List l_l_DETAL_NO = null;

	/** �� 36 List�ϐ��F l_l_ODR_CTL_NO */
	public List l_l_ODR_CTL_NO = null;

	/** �� 37 List�ϐ��F l_l_CUST_CD */
	public List l_l_CUST_CD = null;

	/** �� 38 List�ϐ��F l_l_CUST_ITEM_CD */
	public List l_l_CUST_ITEM_CD = null;

	/** �� 39 List�ϐ��F l_l_ITEM_CD */
	public List l_l_ITEM_CD = null;

	/** �� 40 List�ϐ��F l_l_CUST_ITEM_NAME */
	public List l_l_CUST_ITEM_NAME = null;

	/** �� 41 List�ϐ��F l_l_ITEM_NAME */
	public List l_l_ITEM_NAME = null;

	/** �� 42 List�ϐ��F l_l_ODR_NO */
	public List l_l_ODR_NO = null;

	/** �� 43 List�ϐ��F l_l_ODR_TYP */
	public List l_l_ODR_TYP = null;

	/** �� 44 List�ϐ��F l_l_CUST_ODR_NO */
	public List l_l_CUST_ODR_NO = null;

	/** �� 45 List�ϐ��F l_l_CUST_CHRG_ORG_CD */
	public List l_l_CUST_CHRG_ORG_CD = null;

	/** �� 46 List�ϐ��F l_l_CUST_CHRG_PSN_CD */
	public List l_l_CUST_CHRG_PSN_CD = null;

	/** �� 47 List�ϐ��F l_l_ODR_ACPT_ORG_CD */
	public List l_l_ODR_ACPT_ORG_CD = null;

	/** �� 48 List�ϐ��F l_l_ODR_ACPT_PSN_CD */
	public List l_l_ODR_ACPT_PSN_CD = null;

	/** �� 49 List�ϐ��F l_l_CURRNCY_CD */
	public List l_l_CURRNCY_CD = null;

	/** �� 50 List�ϐ��F l_l_EXCH_TYP */
	public List l_l_EXCH_TYP = null;

	/** �� 51 List�ϐ��F l_l_DLV_LOC_CD */
	public List l_l_DLV_LOC_CD = null;

	/** �� 52 List�ϐ��F l_l_DLV_LOC_NAME_KANJI */
	public List l_l_DLV_LOC_NAME_KANJI = null;

	/** �� 53 List�ϐ��F l_l_ODR_UNIT_PRICE */
	public List l_l_ODR_UNIT_PRICE = null;

	/** �� 54 List�ϐ��F l_l_SPCL_PRICE_TYP */
	public List l_l_SPCL_PRICE_TYP = null;

	/** �� 55 List�ϐ��F l_l_DEPO_TYP */
	public List l_l_DEPO_TYP = null;

	/** �� 56 List�ϐ��F l_l_DESINATED_DLV_DATE */
	public List l_l_DESINATED_DLV_DATE = null;

	/** �� 57 List�ϐ��F l_l_STD_DESINATED_RCV_DATE */
	public List l_l_STD_DESINATED_RCV_DATE = null;

	/** �� 58 List�ϐ��F l_l_ODR_QTY */
	public List l_l_ODR_QTY = null;

	/** �� 59 List�ϐ��F l_l_REMAIN_UNCONFIRM_ODR_QTY */
	public List l_l_REMAIN_UNCONFIRM_ODR_QTY = null;

	/** �� 60 List�ϐ��F l_l_UNIT_CD */
	public List l_l_UNIT_CD = null;

	/** �� 61 List�ϐ��F l_l_UNCONFIRM_ODR_BALANCE */
	public List l_l_UNCONFIRM_ODR_BALANCE = null;

	/** �� 62 List�ϐ��F l_l_ODR_AMOUNT */
	public List l_l_ODR_AMOUNT = null;

	/** �� 63 List�ϐ��F l_l_ODR_AMOUNT_EXCH_RATES */
	public List l_l_ODR_AMOUNT_EXCH_RATES = null;

	/** �� 64 List�ϐ��F l_l_TRANSPORT_CD */
	public List l_l_TRANSPORT_CD = null;

	/** �� 65 List�ϐ��F l_l_TRANSPORT_TYP */
	public List l_l_TRANSPORT_TYP = null;

	/** �� 66 List�ϐ��F l_l_TAX_APPLY_TYP */
	public List l_l_TAX_APPLY_TYP = null;

	/** �� 67 List�ϐ��F l_l_TAX_CD */
	public List l_l_TAX_CD = null;

	/** �� 68 List�ϐ��F l_l_TAX_CALC_TYP */
	public List l_l_TAX_CALC_TYP = null;

	/** �� 69 List�ϐ��F l_l_REMARKS */
	public List l_l_REMARKS = null;

	/** �� 70 List�ϐ��F l_l_ODR_ACPT_DATE */
	public List l_l_ODR_ACPT_DATE = null;

	/** �� 71 List�ϐ��F l_l_SHIP_PLAN_REMAIN_QTY */
	public List l_l_SHIP_PLAN_REMAIN_QTY = null;

	/** �� 72 List�ϐ��F l_l_PARTIAL_SHIP_INST_FLG */
	public List l_l_PARTIAL_SHIP_INST_FLG = null;

	/** �� 73 List�ϐ��F l_PART_NAME */
	public List l_PART_NAME = null;

	/** �� 74 List�ϐ��F l_l_RSLT_CTL_SEQ_CD */
	public List l_l_RSLT_CTL_SEQ_CD = null;

	/** �� 75 List�ϐ��F l_l_UNIT */
	public List l_l_UNIT = null;

	/** �� 76 List�ϐ��F l_l_DLV_PLACE_CD */
	public List l_l_DLV_PLACE_CD = null;

	/** �� 77 List�ϐ��F l_l_UNIT_PRICE */
	public List l_l_UNIT_PRICE = null;

	/** �� 78 List�ϐ��F l_l_CUR_CD */
	public List l_l_CUR_CD = null;

	/** �� 79 List�ϐ��F l_l_SPCL_PRICE_CO */
	public List l_l_SPCL_PRICE_CO = null;

	/** �� 80 List�ϐ��F l_l_CUST_DLV_CD */
	public List l_l_CUST_DLV_CD = null;

	/** �� 81 List�ϐ��F l_l_CUST_DLV_KEY_CD */
	public List l_l_CUST_DLV_KEY_CD = null;

	/** �� 82 List�ϐ��F l_l_FIXED_ODR_NO */
	public List l_l_FIXED_ODR_NO = null;

	/** �� 83 List�ϐ��F l_l_ALCTED_SEQ_CD */
	public List l_l_ALCTED_SEQ_CD = null;

	/** �� 84 List�ϐ��F l_l_ALCTED_UNCONFIRM_ODR_NO */
	public List l_l_ALCTED_UNCONFIRM_ODR_NO = null;

	/** �� 85 List�ϐ��F l_l_ALCTED_UNCONFIRM_ODR_QTY */
	public List l_l_ALCTED_UNCONFIRM_ODR_QTY = null;

	/** �� 86 List�ϐ��F l_l_LAST_ANS_DLV_DATE_RCD */
	public List l_l_LAST_ANS_DLV_DATE_RCD = null;

	/** �� 87 List�ϐ��F l_l_DESINATED_SHIP_DATE */
	public List l_l_DESINATED_SHIP_DATE = null;

	/** �� 88 List�ϐ��F l_l_DESINATED_SHIP_QTY */
	public List l_l_DESINATED_SHIP_QTY = null;

	/** �� 89 List�ϐ��F l_l_REST_SHIP_ODR_QTY */
	public List l_l_REST_SHIP_ODR_QTY = null;

	/** �� 90 List�ϐ��F l_l_CUST_ANAME */
	public List l_l_CUST_ANAME = null;

	/** �� 91 List�ϐ��F l_l_OWN_ORG_CD */
	public List l_l_OWN_ORG_CD = null;

	/** �� 92 List�ϐ��F l_l_OWN_PERSON_CD */
	public List l_l_OWN_PERSON_CD = null;

	/** �� 93 List�ϐ��F l_l_DETAIL_ROUND_TYP */
	public List l_l_DETAIL_ROUND_TYP = null;

	/** �� 94 List�ϐ��F l_l_COMPANY_CD */
	public List l_l_COMPANY_CD = null;

	/** �� 95 List�ϐ��F l_l_DLV_LOC_NAME */
	public List l_l_DLV_LOC_NAME = null;

	/** �� 96 List�ϐ��F l_l_TRANSPORT_LT */
	public List l_l_TRANSPORT_LT = null;

	/** �� 97 List�ϐ��F l_l_DEPO_WH_CD */
	public List l_l_DEPO_WH_CD = null;

	/** �� 98 List�ϐ��F l_l_SHIP_WH_CD */
	public List l_l_SHIP_WH_CD = null;

	/** �� 99 List�ϐ��F l_h_SHIP_PLANT_CD */
	public List l_h_SHIP_PLANT_CD = null;

	/** �� 100 List�ϐ��F l_l_UNIT_COST */
	public List l_l_UNIT_COST = null;

	/** �� 101 List�ϐ��F l_l_EFF_PHASE_IN_DATE */
	public List l_l_EFF_PHASE_IN_DATE = null;

	/** �� 102 List�ϐ��F l_l_STOCK_UNIT */
	public List l_l_STOCK_UNIT = null;

	/** �� 103 List�ϐ��F l_l_UNIT_QTY_TYP */
	public List l_l_UNIT_QTY_TYP = null;

	/** �� 104 List�ϐ��F l_h_MRP_ODR_TYP */
	public List l_h_MRP_ODR_TYP = null;

	/** �� 105 List�ϐ��F l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** �� 106 List�ϐ��F l_CODE */
	public List l_CODE = null;

	/** �� 107 List�ϐ��F l_CLASS_CODE */
	public List l_CLASS_CODE = null;

	/** �� 108 List�ϐ��F l_HOME_CUR_CD */
	public List l_HOME_CUR_CD = null;

	/** �� 109 List�ϐ��F l_BUSINESS_OPR_DATE */
	public List l_BUSINESS_OPR_DATE = null;

	/** �� 110 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 111 List�ϐ��F l_l_CUR_UNIT */
	public List l_l_CUR_UNIT = null;

	/** �� 112 List�ϐ��F l_h_PRD_REQ_JOB_ODR_TYP_1 */
	public List l_h_PRD_REQ_JOB_ODR_TYP_1 = null;

	/** �� 113 List�ϐ��F l_h_PRD_REQ_JOB_ODR_TYP_2 */
	public List l_h_PRD_REQ_JOB_ODR_TYP_2 = null;

	/** �� 114 List�ϐ��F l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** �� 115 List�ϐ��F l_l_JOB_ODR_CD */
	public List l_l_JOB_ODR_CD = null;

	/** �� 116 List�ϐ��F l_l_JOB_ODR_DLV_DATE */
	public List l_l_JOB_ODR_DLV_DATE = null;

	/** �� 117 List�ϐ��F l_JOB_OD_CD */
	public List l_JOB_OD_CD = null;

	/** �� 118 List�ϐ��F l_JOB_OD_CD_PREFIX */
	public List l_JOB_OD_CD_PREFIX = null;

	/** �� 119 List�ϐ��F l_l_JOB_ODR_SET_FLG */
	public List l_l_JOB_ODR_SET_FLG = null;

	/** �� 120 List�ϐ��F l_l_JOB_ODR_QTY */
	public List l_l_JOB_ODR_QTY = null;

	/** �� 121 List�ϐ��F l_l_ALC_GRP_CD */
	public List l_l_ALC_GRP_CD = null;

	/** �� 122 List�ϐ��F l_l_ALCD_QTY */
	public List l_l_ALCD_QTY = null;

	/** �� 123 List�ϐ��F l_OD_CALC_FLG */
	public List l_OD_CALC_FLG = null;

	/** �� 124 List�ϐ��F l_TAX_CD */
	public List l_TAX_CD = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getl_NO() { return m_l_NO; }
	public String getl_ODR_TYP_DN() { return m_l_ODR_TYP_DN; }
	public String getl_SPCL_PRICE_TYP_DN() { return m_l_SPCL_PRICE_TYP_DN; }
	public String getl_DEPO_TYP_DN() { return m_l_DEPO_TYP_DN; }
	public String getODR_TYP() { return m_ODR_TYP; }
	public String getODR_TYP_name() { return m_ODR_TYP_name; }
	public String getODR_TYP_val() { return m_ODR_TYP_val; }
	public String getNO() { return m_NO; }
	public String getCUST_ODR_NO() { return m_CUST_ODR_NO; }
	public String getCUST_ITEM_CD() { return m_CUST_ITEM_CD; }
	public String getCUST_CD() { return m_CUST_CD; }
	public String getDLV_LOC_CD() { return m_DLV_LOC_CD; }
	public String getDESINATED_DLV_DATE() { return m_DESINATED_DLV_DATE; }
	public String getODR_QTY() { return m_ODR_QTY; }
	public String getODR_UNIT_PRICE() { return m_ODR_UNIT_PRICE; }
	public String getSPCL_PRICE_TYP() { return m_SPCL_PRICE_TYP; }
	public String getSPCL_PRICE_TYP_name() { return m_SPCL_PRICE_TYP_name; }
	public String getSPCL_PRICE_TYP_val() { return m_SPCL_PRICE_TYP_val; }
	public String getREMARKS() { return m_REMARKS; }
	public String getODR_ACPT_DATE() { return m_ODR_ACPT_DATE; }
	public String geth_BUSINESS_OPR_DATE() { return m_h_BUSINESS_OPR_DATE; }
	public String getc_DOODR() { return m_c_DOODR; }
	public String getJOB_ODR_QTY() { return m_JOB_ODR_QTY; }
	public String getJOB_ODR_DLV_DATE() { return m_JOB_ODR_DLV_DATE; }
	public String getALC_GRP_CD() { return m_ALC_GRP_CD; }
	public String getc_INPUTODRCD() { return m_c_INPUTODRCD; }
	public String geth_DOODRFLG() { return m_h_DOODRFLG; }
	public String geth_INPUTODRCDFLG() { return m_h_INPUTODRCDFLG; }
	public String geth_CHECK_STATUS() { return m_h_CHECK_STATUS; }
	public String geth_APR_ODR() { return m_h_APR_ODR; }
	public String getAPPR_REMARKS() { return m_APPR_REMARKS; }
	public String getl_APPR_REMARKS() { return m_l_APPR_REMARKS; }
	public String getl_PROJECT_CD() { return m_l_PROJECT_CD; }
	public String getl_ESTIMATE_NO() { return m_l_ESTIMATE_NO; }
	public String getl_DETAL_NO() { return m_l_DETAL_NO; }
	public String getl_ODR_CTL_NO() { return m_l_ODR_CTL_NO; }
	public String getl_CUST_CD() { return m_l_CUST_CD; }
	public String getl_CUST_ITEM_CD() { return m_l_CUST_ITEM_CD; }
	public String getl_ITEM_CD() { return m_l_ITEM_CD; }
	public String getl_CUST_ITEM_NAME() { return m_l_CUST_ITEM_NAME; }
	public String getl_ITEM_NAME() { return m_l_ITEM_NAME; }
	public String getl_ODR_NO() { return m_l_ODR_NO; }
	public String getl_ODR_TYP() { return m_l_ODR_TYP; }
	public String getl_CUST_ODR_NO() { return m_l_CUST_ODR_NO; }
	public String getl_CUST_CHRG_ORG_CD() { return m_l_CUST_CHRG_ORG_CD; }
	public String getl_CUST_CHRG_PSN_CD() { return m_l_CUST_CHRG_PSN_CD; }
	public String getl_ODR_ACPT_ORG_CD() { return m_l_ODR_ACPT_ORG_CD; }
	public String getl_ODR_ACPT_PSN_CD() { return m_l_ODR_ACPT_PSN_CD; }
	public String getl_CURRNCY_CD() { return m_l_CURRNCY_CD; }
	public String getl_EXCH_TYP() { return m_l_EXCH_TYP; }
	public String getl_DLV_LOC_CD() { return m_l_DLV_LOC_CD; }
	public String getl_DLV_LOC_NAME_KANJI() { return m_l_DLV_LOC_NAME_KANJI; }
	public String getl_ODR_UNIT_PRICE() { return m_l_ODR_UNIT_PRICE; }
	public String getl_SPCL_PRICE_TYP() { return m_l_SPCL_PRICE_TYP; }
	public String getl_DEPO_TYP() { return m_l_DEPO_TYP; }
	public String getl_DESINATED_DLV_DATE() { return m_l_DESINATED_DLV_DATE; }
	public String getl_STD_DESINATED_RCV_DATE() { return m_l_STD_DESINATED_RCV_DATE; }
	public String getl_ODR_QTY() { return m_l_ODR_QTY; }
	public String getl_REMAIN_UNCONFIRM_ODR_QTY() { return m_l_REMAIN_UNCONFIRM_ODR_QTY; }
	public String getl_UNIT_CD() { return m_l_UNIT_CD; }
	public String getl_UNCONFIRM_ODR_BALANCE() { return m_l_UNCONFIRM_ODR_BALANCE; }
	public String getl_ODR_AMOUNT() { return m_l_ODR_AMOUNT; }
	public String getl_ODR_AMOUNT_EXCH_RATES() { return m_l_ODR_AMOUNT_EXCH_RATES; }
	public String getl_TRANSPORT_CD() { return m_l_TRANSPORT_CD; }
	public String getl_TRANSPORT_TYP() { return m_l_TRANSPORT_TYP; }
	public String getl_TAX_APPLY_TYP() { return m_l_TAX_APPLY_TYP; }
	public String getl_TAX_CD() { return m_l_TAX_CD; }
	public String getl_TAX_CALC_TYP() { return m_l_TAX_CALC_TYP; }
	public String getl_REMARKS() { return m_l_REMARKS; }
	public String getl_ODR_ACPT_DATE() { return m_l_ODR_ACPT_DATE; }
	public String getl_SHIP_PLAN_REMAIN_QTY() { return m_l_SHIP_PLAN_REMAIN_QTY; }
	public String getl_PARTIAL_SHIP_INST_FLG() { return m_l_PARTIAL_SHIP_INST_FLG; }
	public String getPART_NAME() { return m_PART_NAME; }
	public String getl_RSLT_CTL_SEQ_CD() { return m_l_RSLT_CTL_SEQ_CD; }
	public String getl_UNIT() { return m_l_UNIT; }
	public String getl_DLV_PLACE_CD() { return m_l_DLV_PLACE_CD; }
	public String getl_UNIT_PRICE() { return m_l_UNIT_PRICE; }
	public String getl_CUR_CD() { return m_l_CUR_CD; }
	public String getl_SPCL_PRICE_CO() { return m_l_SPCL_PRICE_CO; }
	public String getl_CUST_DLV_CD() { return m_l_CUST_DLV_CD; }
	public String getl_CUST_DLV_KEY_CD() { return m_l_CUST_DLV_KEY_CD; }
	public String getl_FIXED_ODR_NO() { return m_l_FIXED_ODR_NO; }
	public String getl_ALCTED_SEQ_CD() { return m_l_ALCTED_SEQ_CD; }
	public String getl_ALCTED_UNCONFIRM_ODR_NO() { return m_l_ALCTED_UNCONFIRM_ODR_NO; }
	public String getl_ALCTED_UNCONFIRM_ODR_QTY() { return m_l_ALCTED_UNCONFIRM_ODR_QTY; }
	public String getl_LAST_ANS_DLV_DATE_RCD() { return m_l_LAST_ANS_DLV_DATE_RCD; }
	public String getl_DESINATED_SHIP_DATE() { return m_l_DESINATED_SHIP_DATE; }
	public String getl_DESINATED_SHIP_QTY() { return m_l_DESINATED_SHIP_QTY; }
	public String getl_REST_SHIP_ODR_QTY() { return m_l_REST_SHIP_ODR_QTY; }
	public String getl_CUST_ANAME() { return m_l_CUST_ANAME; }
	public String getl_OWN_ORG_CD() { return m_l_OWN_ORG_CD; }
	public String getl_OWN_PERSON_CD() { return m_l_OWN_PERSON_CD; }
	public String getl_DETAIL_ROUND_TYP() { return m_l_DETAIL_ROUND_TYP; }
	public String getl_COMPANY_CD() { return m_l_COMPANY_CD; }
	public String getl_DLV_LOC_NAME() { return m_l_DLV_LOC_NAME; }
	public String getl_TRANSPORT_LT() { return m_l_TRANSPORT_LT; }
	public String getl_DEPO_WH_CD() { return m_l_DEPO_WH_CD; }
	public String getl_SHIP_WH_CD() { return m_l_SHIP_WH_CD; }
	public String geth_SHIP_PLANT_CD() { return m_h_SHIP_PLANT_CD; }
	public String getl_UNIT_COST() { return m_l_UNIT_COST; }
	public String getl_EFF_PHASE_IN_DATE() { return m_l_EFF_PHASE_IN_DATE; }
	public String getl_STOCK_UNIT() { return m_l_STOCK_UNIT; }
	public String getl_UNIT_QTY_TYP() { return m_l_UNIT_QTY_TYP; }
	public String geth_MRP_ODR_TYP() { return m_h_MRP_ODR_TYP; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getCODE() { return m_CODE; }
	public String getCLASS_CODE() { return m_CLASS_CODE; }
	public String getHOME_CUR_CD() { return m_HOME_CUR_CD; }
	public String getBUSINESS_OPR_DATE() { return m_BUSINESS_OPR_DATE; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getl_CUR_UNIT() { return m_l_CUR_UNIT; }
	public String geth_PRD_REQ_JOB_ODR_TYP_1() { return m_h_PRD_REQ_JOB_ODR_TYP_1; }
	public String geth_PRD_REQ_JOB_ODR_TYP_2() { return m_h_PRD_REQ_JOB_ODR_TYP_2; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getl_JOB_ODR_CD() { return m_l_JOB_ODR_CD; }
	public String getl_JOB_ODR_DLV_DATE() { return m_l_JOB_ODR_DLV_DATE; }
	public String getJOB_OD_CD() { return m_JOB_OD_CD; }
	public String getJOB_OD_CD_PREFIX() { return m_JOB_OD_CD_PREFIX; }
	public String getl_JOB_ODR_SET_FLG() { return m_l_JOB_ODR_SET_FLG; }
	public String getl_JOB_ODR_QTY() { return m_l_JOB_ODR_QTY; }
	public String getl_ALC_GRP_CD() { return m_l_ALC_GRP_CD; }
	public String getl_ALCD_QTY() { return m_l_ALCD_QTY; }
	public String getOD_CALC_FLG() { return m_OD_CALC_FLG; }
	public String getTAX_CD() { return m_TAX_CD; }

	public List getList_l_NO() { return l_l_NO; }
	public List getList_l_ODR_TYP_DN() { return l_l_ODR_TYP_DN; }
	public List getList_l_SPCL_PRICE_TYP_DN() { return l_l_SPCL_PRICE_TYP_DN; }
	public List getList_l_DEPO_TYP_DN() { return l_l_DEPO_TYP_DN; }
	public List getList_ODR_TYP() { return l_ODR_TYP; }
	public List getList_ODR_TYP_name() { return l_ODR_TYP_name; }
	public List getList_ODR_TYP_val() { return l_ODR_TYP_val; }
	public List getList_NO() { return l_NO; }
	public List getList_CUST_ODR_NO() { return l_CUST_ODR_NO; }
	public List getList_CUST_ITEM_CD() { return l_CUST_ITEM_CD; }
	public List getList_CUST_CD() { return l_CUST_CD; }
	public List getList_DLV_LOC_CD() { return l_DLV_LOC_CD; }
	public List getList_DESINATED_DLV_DATE() { return l_DESINATED_DLV_DATE; }
	public List getList_ODR_QTY() { return l_ODR_QTY; }
	public List getList_ODR_UNIT_PRICE() { return l_ODR_UNIT_PRICE; }
	public List getList_SPCL_PRICE_TYP() { return l_SPCL_PRICE_TYP; }
	public List getList_SPCL_PRICE_TYP_name() { return l_SPCL_PRICE_TYP_name; }
	public List getList_SPCL_PRICE_TYP_val() { return l_SPCL_PRICE_TYP_val; }
	public List getList_REMARKS() { return l_REMARKS; }
	public List getList_ODR_ACPT_DATE() { return l_ODR_ACPT_DATE; }
	public List getList_h_BUSINESS_OPR_DATE() { return l_h_BUSINESS_OPR_DATE; }
	public List getList_c_DOODR() { return l_c_DOODR; }
	public List getList_JOB_ODR_QTY() { return l_JOB_ODR_QTY; }
	public List getList_JOB_ODR_DLV_DATE() { return l_JOB_ODR_DLV_DATE; }
	public List getList_ALC_GRP_CD() { return l_ALC_GRP_CD; }
	public List getList_c_INPUTODRCD() { return l_c_INPUTODRCD; }
	public List getList_h_DOODRFLG() { return l_h_DOODRFLG; }
	public List getList_h_INPUTODRCDFLG() { return l_h_INPUTODRCDFLG; }
	public List getList_h_CHECK_STATUS() { return l_h_CHECK_STATUS; }
	public List getList_h_APR_ODR() { return l_h_APR_ODR; }
	public List getList_APPR_REMARKS() { return l_APPR_REMARKS; }
	public List getList_l_APPR_REMARKS() { return l_l_APPR_REMARKS; }
	public List getList_l_PROJECT_CD() { return l_l_PROJECT_CD; }
	public List getList_l_ESTIMATE_NO() { return l_l_ESTIMATE_NO; }
	public List getList_l_DETAL_NO() { return l_l_DETAL_NO; }
	public List getList_l_ODR_CTL_NO() { return l_l_ODR_CTL_NO; }
	public List getList_l_CUST_CD() { return l_l_CUST_CD; }
	public List getList_l_CUST_ITEM_CD() { return l_l_CUST_ITEM_CD; }
	public List getList_l_ITEM_CD() { return l_l_ITEM_CD; }
	public List getList_l_CUST_ITEM_NAME() { return l_l_CUST_ITEM_NAME; }
	public List getList_l_ITEM_NAME() { return l_l_ITEM_NAME; }
	public List getList_l_ODR_NO() { return l_l_ODR_NO; }
	public List getList_l_ODR_TYP() { return l_l_ODR_TYP; }
	public List getList_l_CUST_ODR_NO() { return l_l_CUST_ODR_NO; }
	public List getList_l_CUST_CHRG_ORG_CD() { return l_l_CUST_CHRG_ORG_CD; }
	public List getList_l_CUST_CHRG_PSN_CD() { return l_l_CUST_CHRG_PSN_CD; }
	public List getList_l_ODR_ACPT_ORG_CD() { return l_l_ODR_ACPT_ORG_CD; }
	public List getList_l_ODR_ACPT_PSN_CD() { return l_l_ODR_ACPT_PSN_CD; }
	public List getList_l_CURRNCY_CD() { return l_l_CURRNCY_CD; }
	public List getList_l_EXCH_TYP() { return l_l_EXCH_TYP; }
	public List getList_l_DLV_LOC_CD() { return l_l_DLV_LOC_CD; }
	public List getList_l_DLV_LOC_NAME_KANJI() { return l_l_DLV_LOC_NAME_KANJI; }
	public List getList_l_ODR_UNIT_PRICE() { return l_l_ODR_UNIT_PRICE; }
	public List getList_l_SPCL_PRICE_TYP() { return l_l_SPCL_PRICE_TYP; }
	public List getList_l_DEPO_TYP() { return l_l_DEPO_TYP; }
	public List getList_l_DESINATED_DLV_DATE() { return l_l_DESINATED_DLV_DATE; }
	public List getList_l_STD_DESINATED_RCV_DATE() { return l_l_STD_DESINATED_RCV_DATE; }
	public List getList_l_ODR_QTY() { return l_l_ODR_QTY; }
	public List getList_l_REMAIN_UNCONFIRM_ODR_QTY() { return l_l_REMAIN_UNCONFIRM_ODR_QTY; }
	public List getList_l_UNIT_CD() { return l_l_UNIT_CD; }
	public List getList_l_UNCONFIRM_ODR_BALANCE() { return l_l_UNCONFIRM_ODR_BALANCE; }
	public List getList_l_ODR_AMOUNT() { return l_l_ODR_AMOUNT; }
	public List getList_l_ODR_AMOUNT_EXCH_RATES() { return l_l_ODR_AMOUNT_EXCH_RATES; }
	public List getList_l_TRANSPORT_CD() { return l_l_TRANSPORT_CD; }
	public List getList_l_TRANSPORT_TYP() { return l_l_TRANSPORT_TYP; }
	public List getList_l_TAX_APPLY_TYP() { return l_l_TAX_APPLY_TYP; }
	public List getList_l_TAX_CD() { return l_l_TAX_CD; }
	public List getList_l_TAX_CALC_TYP() { return l_l_TAX_CALC_TYP; }
	public List getList_l_REMARKS() { return l_l_REMARKS; }
	public List getList_l_ODR_ACPT_DATE() { return l_l_ODR_ACPT_DATE; }
	public List getList_l_SHIP_PLAN_REMAIN_QTY() { return l_l_SHIP_PLAN_REMAIN_QTY; }
	public List getList_l_PARTIAL_SHIP_INST_FLG() { return l_l_PARTIAL_SHIP_INST_FLG; }
	public List getList_PART_NAME() { return l_PART_NAME; }
	public List getList_l_RSLT_CTL_SEQ_CD() { return l_l_RSLT_CTL_SEQ_CD; }
	public List getList_l_UNIT() { return l_l_UNIT; }
	public List getList_l_DLV_PLACE_CD() { return l_l_DLV_PLACE_CD; }
	public List getList_l_UNIT_PRICE() { return l_l_UNIT_PRICE; }
	public List getList_l_CUR_CD() { return l_l_CUR_CD; }
	public List getList_l_SPCL_PRICE_CO() { return l_l_SPCL_PRICE_CO; }
	public List getList_l_CUST_DLV_CD() { return l_l_CUST_DLV_CD; }
	public List getList_l_CUST_DLV_KEY_CD() { return l_l_CUST_DLV_KEY_CD; }
	public List getList_l_FIXED_ODR_NO() { return l_l_FIXED_ODR_NO; }
	public List getList_l_ALCTED_SEQ_CD() { return l_l_ALCTED_SEQ_CD; }
	public List getList_l_ALCTED_UNCONFIRM_ODR_NO() { return l_l_ALCTED_UNCONFIRM_ODR_NO; }
	public List getList_l_ALCTED_UNCONFIRM_ODR_QTY() { return l_l_ALCTED_UNCONFIRM_ODR_QTY; }
	public List getList_l_LAST_ANS_DLV_DATE_RCD() { return l_l_LAST_ANS_DLV_DATE_RCD; }
	public List getList_l_DESINATED_SHIP_DATE() { return l_l_DESINATED_SHIP_DATE; }
	public List getList_l_DESINATED_SHIP_QTY() { return l_l_DESINATED_SHIP_QTY; }
	public List getList_l_REST_SHIP_ODR_QTY() { return l_l_REST_SHIP_ODR_QTY; }
	public List getList_l_CUST_ANAME() { return l_l_CUST_ANAME; }
	public List getList_l_OWN_ORG_CD() { return l_l_OWN_ORG_CD; }
	public List getList_l_OWN_PERSON_CD() { return l_l_OWN_PERSON_CD; }
	public List getList_l_DETAIL_ROUND_TYP() { return l_l_DETAIL_ROUND_TYP; }
	public List getList_l_COMPANY_CD() { return l_l_COMPANY_CD; }
	public List getList_l_DLV_LOC_NAME() { return l_l_DLV_LOC_NAME; }
	public List getList_l_TRANSPORT_LT() { return l_l_TRANSPORT_LT; }
	public List getList_l_DEPO_WH_CD() { return l_l_DEPO_WH_CD; }
	public List getList_l_SHIP_WH_CD() { return l_l_SHIP_WH_CD; }
	public List getList_h_SHIP_PLANT_CD() { return l_h_SHIP_PLANT_CD; }
	public List getList_l_UNIT_COST() { return l_l_UNIT_COST; }
	public List getList_l_EFF_PHASE_IN_DATE() { return l_l_EFF_PHASE_IN_DATE; }
	public List getList_l_STOCK_UNIT() { return l_l_STOCK_UNIT; }
	public List getList_l_UNIT_QTY_TYP() { return l_l_UNIT_QTY_TYP; }
	public List getList_h_MRP_ODR_TYP() { return l_h_MRP_ODR_TYP; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_CODE() { return l_CODE; }
	public List getList_CLASS_CODE() { return l_CLASS_CODE; }
	public List getList_HOME_CUR_CD() { return l_HOME_CUR_CD; }
	public List getList_BUSINESS_OPR_DATE() { return l_BUSINESS_OPR_DATE; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_l_CUR_UNIT() { return l_l_CUR_UNIT; }
	public List getList_h_PRD_REQ_JOB_ODR_TYP_1() { return l_h_PRD_REQ_JOB_ODR_TYP_1; }
	public List getList_h_PRD_REQ_JOB_ODR_TYP_2() { return l_h_PRD_REQ_JOB_ODR_TYP_2; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_l_JOB_ODR_CD() { return l_l_JOB_ODR_CD; }
	public List getList_l_JOB_ODR_DLV_DATE() { return l_l_JOB_ODR_DLV_DATE; }
	public List getList_JOB_OD_CD() { return l_JOB_OD_CD; }
	public List getList_JOB_OD_CD_PREFIX() { return l_JOB_OD_CD_PREFIX; }
	public List getList_l_JOB_ODR_SET_FLG() { return l_l_JOB_ODR_SET_FLG; }
	public List getList_l_JOB_ODR_QTY() { return l_l_JOB_ODR_QTY; }
	public List getList_l_ALC_GRP_CD() { return l_l_ALC_GRP_CD; }
	public List getList_l_ALCD_QTY() { return l_l_ALCD_QTY; }
	public List getList_OD_CALC_FLG() { return l_OD_CALC_FLG; }
	public List getList_TAX_CD() { return l_TAX_CD; }

	public void setl_NO(String val) { m_l_NO = val; }
	public void setl_ODR_TYP_DN(String val) { m_l_ODR_TYP_DN = val; }
	public void setl_SPCL_PRICE_TYP_DN(String val) { m_l_SPCL_PRICE_TYP_DN = val; }
	public void setl_DEPO_TYP_DN(String val) { m_l_DEPO_TYP_DN = val; }
	public void setODR_TYP(String val) { m_ODR_TYP = val; }
	public void setODR_TYP_name(String val) { m_ODR_TYP_name = val; }
	public void setODR_TYP_val(String val) { m_ODR_TYP_val = val; }
	public void setNO(String val) { m_NO = val; }
	public void setCUST_ODR_NO(String val) { m_CUST_ODR_NO = val; }
	public void setCUST_ITEM_CD(String val) { m_CUST_ITEM_CD = val; }
	public void setCUST_CD(String val) { m_CUST_CD = val; }
	public void setDLV_LOC_CD(String val) { m_DLV_LOC_CD = val; }
	public void setDESINATED_DLV_DATE(String val) { m_DESINATED_DLV_DATE = val; }
	public void setODR_QTY(String val) { m_ODR_QTY = val; }
	public void setODR_UNIT_PRICE(String val) { m_ODR_UNIT_PRICE = val; }
	public void setSPCL_PRICE_TYP(String val) { m_SPCL_PRICE_TYP = val; }
	public void setSPCL_PRICE_TYP_name(String val) { m_SPCL_PRICE_TYP_name = val; }
	public void setSPCL_PRICE_TYP_val(String val) { m_SPCL_PRICE_TYP_val = val; }
	public void setREMARKS(String val) { m_REMARKS = val; }
	public void setODR_ACPT_DATE(String val) { m_ODR_ACPT_DATE = val; }
	public void seth_BUSINESS_OPR_DATE(String val) { m_h_BUSINESS_OPR_DATE = val; }
	public void setc_DOODR(String val) { m_c_DOODR = val; }
	public void setJOB_ODR_QTY(String val) { m_JOB_ODR_QTY = val; }
	public void setJOB_ODR_DLV_DATE(String val) { m_JOB_ODR_DLV_DATE = val; }
	public void setALC_GRP_CD(String val) { m_ALC_GRP_CD = val; }
	public void setc_INPUTODRCD(String val) { m_c_INPUTODRCD = val; }
	public void seth_DOODRFLG(String val) { m_h_DOODRFLG = val; }
	public void seth_INPUTODRCDFLG(String val) { m_h_INPUTODRCDFLG = val; }
	public void seth_CHECK_STATUS(String val) { m_h_CHECK_STATUS = val; }
	public void seth_APR_ODR(String val) { m_h_APR_ODR = val; }
	public void setAPPR_REMARKS(String val) { m_APPR_REMARKS = val; }
	public void setl_APPR_REMARKS(String val) { m_l_APPR_REMARKS = val; }
	public void setl_PROJECT_CD(String val) { m_l_PROJECT_CD = val; }
	public void setl_ESTIMATE_NO(String val) { m_l_ESTIMATE_NO = val; }
	public void setl_DETAL_NO(String val) { m_l_DETAL_NO = val; }
	public void setl_ODR_CTL_NO(String val) { m_l_ODR_CTL_NO = val; }
	public void setl_CUST_CD(String val) { m_l_CUST_CD = val; }
	public void setl_CUST_ITEM_CD(String val) { m_l_CUST_ITEM_CD = val; }
	public void setl_ITEM_CD(String val) { m_l_ITEM_CD = val; }
	public void setl_CUST_ITEM_NAME(String val) { m_l_CUST_ITEM_NAME = val; }
	public void setl_ITEM_NAME(String val) { m_l_ITEM_NAME = val; }
	public void setl_ODR_NO(String val) { m_l_ODR_NO = val; }
	public void setl_ODR_TYP(String val) { m_l_ODR_TYP = val; }
	public void setl_CUST_ODR_NO(String val) { m_l_CUST_ODR_NO = val; }
	public void setl_CUST_CHRG_ORG_CD(String val) { m_l_CUST_CHRG_ORG_CD = val; }
	public void setl_CUST_CHRG_PSN_CD(String val) { m_l_CUST_CHRG_PSN_CD = val; }
	public void setl_ODR_ACPT_ORG_CD(String val) { m_l_ODR_ACPT_ORG_CD = val; }
	public void setl_ODR_ACPT_PSN_CD(String val) { m_l_ODR_ACPT_PSN_CD = val; }
	public void setl_CURRNCY_CD(String val) { m_l_CURRNCY_CD = val; }
	public void setl_EXCH_TYP(String val) { m_l_EXCH_TYP = val; }
	public void setl_DLV_LOC_CD(String val) { m_l_DLV_LOC_CD = val; }
	public void setl_DLV_LOC_NAME_KANJI(String val) { m_l_DLV_LOC_NAME_KANJI = val; }
	public void setl_ODR_UNIT_PRICE(String val) { m_l_ODR_UNIT_PRICE = val; }
	public void setl_SPCL_PRICE_TYP(String val) { m_l_SPCL_PRICE_TYP = val; }
	public void setl_DEPO_TYP(String val) { m_l_DEPO_TYP = val; }
	public void setl_DESINATED_DLV_DATE(String val) { m_l_DESINATED_DLV_DATE = val; }
	public void setl_STD_DESINATED_RCV_DATE(String val) { m_l_STD_DESINATED_RCV_DATE = val; }
	public void setl_ODR_QTY(String val) { m_l_ODR_QTY = val; }
	public void setl_REMAIN_UNCONFIRM_ODR_QTY(String val) { m_l_REMAIN_UNCONFIRM_ODR_QTY = val; }
	public void setl_UNIT_CD(String val) { m_l_UNIT_CD = val; }
	public void setl_UNCONFIRM_ODR_BALANCE(String val) { m_l_UNCONFIRM_ODR_BALANCE = val; }
	public void setl_ODR_AMOUNT(String val) { m_l_ODR_AMOUNT = val; }
	public void setl_ODR_AMOUNT_EXCH_RATES(String val) { m_l_ODR_AMOUNT_EXCH_RATES = val; }
	public void setl_TRANSPORT_CD(String val) { m_l_TRANSPORT_CD = val; }
	public void setl_TRANSPORT_TYP(String val) { m_l_TRANSPORT_TYP = val; }
	public void setl_TAX_APPLY_TYP(String val) { m_l_TAX_APPLY_TYP = val; }
	public void setl_TAX_CD(String val) { m_l_TAX_CD = val; }
	public void setl_TAX_CALC_TYP(String val) { m_l_TAX_CALC_TYP = val; }
	public void setl_REMARKS(String val) { m_l_REMARKS = val; }
	public void setl_ODR_ACPT_DATE(String val) { m_l_ODR_ACPT_DATE = val; }
	public void setl_SHIP_PLAN_REMAIN_QTY(String val) { m_l_SHIP_PLAN_REMAIN_QTY = val; }
	public void setl_PARTIAL_SHIP_INST_FLG(String val) { m_l_PARTIAL_SHIP_INST_FLG = val; }
	public void setPART_NAME(String val) { m_PART_NAME = val; }
	public void setl_RSLT_CTL_SEQ_CD(String val) { m_l_RSLT_CTL_SEQ_CD = val; }
	public void setl_UNIT(String val) { m_l_UNIT = val; }
	public void setl_DLV_PLACE_CD(String val) { m_l_DLV_PLACE_CD = val; }
	public void setl_UNIT_PRICE(String val) { m_l_UNIT_PRICE = val; }
	public void setl_CUR_CD(String val) { m_l_CUR_CD = val; }
	public void setl_SPCL_PRICE_CO(String val) { m_l_SPCL_PRICE_CO = val; }
	public void setl_CUST_DLV_CD(String val) { m_l_CUST_DLV_CD = val; }
	public void setl_CUST_DLV_KEY_CD(String val) { m_l_CUST_DLV_KEY_CD = val; }
	public void setl_FIXED_ODR_NO(String val) { m_l_FIXED_ODR_NO = val; }
	public void setl_ALCTED_SEQ_CD(String val) { m_l_ALCTED_SEQ_CD = val; }
	public void setl_ALCTED_UNCONFIRM_ODR_NO(String val) { m_l_ALCTED_UNCONFIRM_ODR_NO = val; }
	public void setl_ALCTED_UNCONFIRM_ODR_QTY(String val) { m_l_ALCTED_UNCONFIRM_ODR_QTY = val; }
	public void setl_LAST_ANS_DLV_DATE_RCD(String val) { m_l_LAST_ANS_DLV_DATE_RCD = val; }
	public void setl_DESINATED_SHIP_DATE(String val) { m_l_DESINATED_SHIP_DATE = val; }
	public void setl_DESINATED_SHIP_QTY(String val) { m_l_DESINATED_SHIP_QTY = val; }
	public void setl_REST_SHIP_ODR_QTY(String val) { m_l_REST_SHIP_ODR_QTY = val; }
	public void setl_CUST_ANAME(String val) { m_l_CUST_ANAME = val; }
	public void setl_OWN_ORG_CD(String val) { m_l_OWN_ORG_CD = val; }
	public void setl_OWN_PERSON_CD(String val) { m_l_OWN_PERSON_CD = val; }
	public void setl_DETAIL_ROUND_TYP(String val) { m_l_DETAIL_ROUND_TYP = val; }
	public void setl_COMPANY_CD(String val) { m_l_COMPANY_CD = val; }
	public void setl_DLV_LOC_NAME(String val) { m_l_DLV_LOC_NAME = val; }
	public void setl_TRANSPORT_LT(String val) { m_l_TRANSPORT_LT = val; }
	public void setl_DEPO_WH_CD(String val) { m_l_DEPO_WH_CD = val; }
	public void setl_SHIP_WH_CD(String val) { m_l_SHIP_WH_CD = val; }
	public void seth_SHIP_PLANT_CD(String val) { m_h_SHIP_PLANT_CD = val; }
	public void setl_UNIT_COST(String val) { m_l_UNIT_COST = val; }
	public void setl_EFF_PHASE_IN_DATE(String val) { m_l_EFF_PHASE_IN_DATE = val; }
	public void setl_STOCK_UNIT(String val) { m_l_STOCK_UNIT = val; }
	public void setl_UNIT_QTY_TYP(String val) { m_l_UNIT_QTY_TYP = val; }
	public void seth_MRP_ODR_TYP(String val) { m_h_MRP_ODR_TYP = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setCODE(String val) { m_CODE = val; }
	public void setCLASS_CODE(String val) { m_CLASS_CODE = val; }
	public void setHOME_CUR_CD(String val) { m_HOME_CUR_CD = val; }
	public void setBUSINESS_OPR_DATE(String val) { m_BUSINESS_OPR_DATE = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setl_CUR_UNIT(String val) { m_l_CUR_UNIT = val; }
	public void seth_PRD_REQ_JOB_ODR_TYP_1(String val) { m_h_PRD_REQ_JOB_ODR_TYP_1 = val; }
	public void seth_PRD_REQ_JOB_ODR_TYP_2(String val) { m_h_PRD_REQ_JOB_ODR_TYP_2 = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setl_JOB_ODR_CD(String val) { m_l_JOB_ODR_CD = val; }
	public void setl_JOB_ODR_DLV_DATE(String val) { m_l_JOB_ODR_DLV_DATE = val; }
	public void setJOB_OD_CD(String val) { m_JOB_OD_CD = val; }
	public void setJOB_OD_CD_PREFIX(String val) { m_JOB_OD_CD_PREFIX = val; }
	public void setl_JOB_ODR_SET_FLG(String val) { m_l_JOB_ODR_SET_FLG = val; }
	public void setl_JOB_ODR_QTY(String val) { m_l_JOB_ODR_QTY = val; }
	public void setl_ALC_GRP_CD(String val) { m_l_ALC_GRP_CD = val; }
	public void setl_ALCD_QTY(String val) { m_l_ALCD_QTY = val; }
	public void setOD_CALC_FLG(String val) { m_OD_CALC_FLG = val; }
	public void setTAX_CD(String val) { m_TAX_CD = val; }


	public void setList_l_NO(List list) { l_l_NO = list; }
	public void setList_l_ODR_TYP_DN(List list) { l_l_ODR_TYP_DN = list; }
	public void setList_l_SPCL_PRICE_TYP_DN(List list) { l_l_SPCL_PRICE_TYP_DN = list; }
	public void setList_l_DEPO_TYP_DN(List list) { l_l_DEPO_TYP_DN = list; }
	public void setList_ODR_TYP(List list) { l_ODR_TYP = list; }
	public void setList_ODR_TYP_name(List list) { l_ODR_TYP_name = list; }
	public void setList_ODR_TYP_val(List list) { l_ODR_TYP_val = list; }
	public void setList_NO(List list) { l_NO = list; }
	public void setList_CUST_ODR_NO(List list) { l_CUST_ODR_NO = list; }
	public void setList_CUST_ITEM_CD(List list) { l_CUST_ITEM_CD = list; }
	public void setList_CUST_CD(List list) { l_CUST_CD = list; }
	public void setList_DLV_LOC_CD(List list) { l_DLV_LOC_CD = list; }
	public void setList_DESINATED_DLV_DATE(List list) { l_DESINATED_DLV_DATE = list; }
	public void setList_ODR_QTY(List list) { l_ODR_QTY = list; }
	public void setList_ODR_UNIT_PRICE(List list) { l_ODR_UNIT_PRICE = list; }
	public void setList_SPCL_PRICE_TYP(List list) { l_SPCL_PRICE_TYP = list; }
	public void setList_SPCL_PRICE_TYP_name(List list) { l_SPCL_PRICE_TYP_name = list; }
	public void setList_SPCL_PRICE_TYP_val(List list) { l_SPCL_PRICE_TYP_val = list; }
	public void setList_REMARKS(List list) { l_REMARKS = list; }
	public void setList_ODR_ACPT_DATE(List list) { l_ODR_ACPT_DATE = list; }
	public void setList_h_BUSINESS_OPR_DATE(List list) { l_h_BUSINESS_OPR_DATE = list; }
	public void setList_c_DOODR(List list) { l_c_DOODR = list; }
	public void setList_JOB_ODR_QTY(List list) { l_JOB_ODR_QTY = list; }
	public void setList_JOB_ODR_DLV_DATE(List list) { l_JOB_ODR_DLV_DATE = list; }
	public void setList_ALC_GRP_CD(List list) { l_ALC_GRP_CD = list; }
	public void setList_c_INPUTODRCD(List list) { l_c_INPUTODRCD = list; }
	public void setList_h_DOODRFLG(List list) { l_h_DOODRFLG = list; }
	public void setList_h_INPUTODRCDFLG(List list) { l_h_INPUTODRCDFLG = list; }
	public void setList_h_CHECK_STATUS(List list) { l_h_CHECK_STATUS = list; }
	public void setList_h_APR_ODR(List list) { l_h_APR_ODR = list; }
	public void setList_APPR_REMARKS(List list) { l_APPR_REMARKS = list; }
	public void setList_l_APPR_REMARKS(List list) { l_l_APPR_REMARKS = list; }
	public void setList_l_PROJECT_CD(List list) { l_l_PROJECT_CD = list; }
	public void setList_l_ESTIMATE_NO(List list) { l_l_ESTIMATE_NO = list; }
	public void setList_l_DETAL_NO(List list) { l_l_DETAL_NO = list; }
	public void setList_l_ODR_CTL_NO(List list) { l_l_ODR_CTL_NO = list; }
	public void setList_l_CUST_CD(List list) { l_l_CUST_CD = list; }
	public void setList_l_CUST_ITEM_CD(List list) { l_l_CUST_ITEM_CD = list; }
	public void setList_l_ITEM_CD(List list) { l_l_ITEM_CD = list; }
	public void setList_l_CUST_ITEM_NAME(List list) { l_l_CUST_ITEM_NAME = list; }
	public void setList_l_ITEM_NAME(List list) { l_l_ITEM_NAME = list; }
	public void setList_l_ODR_NO(List list) { l_l_ODR_NO = list; }
	public void setList_l_ODR_TYP(List list) { l_l_ODR_TYP = list; }
	public void setList_l_CUST_ODR_NO(List list) { l_l_CUST_ODR_NO = list; }
	public void setList_l_CUST_CHRG_ORG_CD(List list) { l_l_CUST_CHRG_ORG_CD = list; }
	public void setList_l_CUST_CHRG_PSN_CD(List list) { l_l_CUST_CHRG_PSN_CD = list; }
	public void setList_l_ODR_ACPT_ORG_CD(List list) { l_l_ODR_ACPT_ORG_CD = list; }
	public void setList_l_ODR_ACPT_PSN_CD(List list) { l_l_ODR_ACPT_PSN_CD = list; }
	public void setList_l_CURRNCY_CD(List list) { l_l_CURRNCY_CD = list; }
	public void setList_l_EXCH_TYP(List list) { l_l_EXCH_TYP = list; }
	public void setList_l_DLV_LOC_CD(List list) { l_l_DLV_LOC_CD = list; }
	public void setList_l_DLV_LOC_NAME_KANJI(List list) { l_l_DLV_LOC_NAME_KANJI = list; }
	public void setList_l_ODR_UNIT_PRICE(List list) { l_l_ODR_UNIT_PRICE = list; }
	public void setList_l_SPCL_PRICE_TYP(List list) { l_l_SPCL_PRICE_TYP = list; }
	public void setList_l_DEPO_TYP(List list) { l_l_DEPO_TYP = list; }
	public void setList_l_DESINATED_DLV_DATE(List list) { l_l_DESINATED_DLV_DATE = list; }
	public void setList_l_STD_DESINATED_RCV_DATE(List list) { l_l_STD_DESINATED_RCV_DATE = list; }
	public void setList_l_ODR_QTY(List list) { l_l_ODR_QTY = list; }
	public void setList_l_REMAIN_UNCONFIRM_ODR_QTY(List list) { l_l_REMAIN_UNCONFIRM_ODR_QTY = list; }
	public void setList_l_UNIT_CD(List list) { l_l_UNIT_CD = list; }
	public void setList_l_UNCONFIRM_ODR_BALANCE(List list) { l_l_UNCONFIRM_ODR_BALANCE = list; }
	public void setList_l_ODR_AMOUNT(List list) { l_l_ODR_AMOUNT = list; }
	public void setList_l_ODR_AMOUNT_EXCH_RATES(List list) { l_l_ODR_AMOUNT_EXCH_RATES = list; }
	public void setList_l_TRANSPORT_CD(List list) { l_l_TRANSPORT_CD = list; }
	public void setList_l_TRANSPORT_TYP(List list) { l_l_TRANSPORT_TYP = list; }
	public void setList_l_TAX_APPLY_TYP(List list) { l_l_TAX_APPLY_TYP = list; }
	public void setList_l_TAX_CD(List list) { l_l_TAX_CD = list; }
	public void setList_l_TAX_CALC_TYP(List list) { l_l_TAX_CALC_TYP = list; }
	public void setList_l_REMARKS(List list) { l_l_REMARKS = list; }
	public void setList_l_ODR_ACPT_DATE(List list) { l_l_ODR_ACPT_DATE = list; }
	public void setList_l_SHIP_PLAN_REMAIN_QTY(List list) { l_l_SHIP_PLAN_REMAIN_QTY = list; }
	public void setList_l_PARTIAL_SHIP_INST_FLG(List list) { l_l_PARTIAL_SHIP_INST_FLG = list; }
	public void setList_PART_NAME(List list) { l_PART_NAME = list; }
	public void setList_l_RSLT_CTL_SEQ_CD(List list) { l_l_RSLT_CTL_SEQ_CD = list; }
	public void setList_l_UNIT(List list) { l_l_UNIT = list; }
	public void setList_l_DLV_PLACE_CD(List list) { l_l_DLV_PLACE_CD = list; }
	public void setList_l_UNIT_PRICE(List list) { l_l_UNIT_PRICE = list; }
	public void setList_l_CUR_CD(List list) { l_l_CUR_CD = list; }
	public void setList_l_SPCL_PRICE_CO(List list) { l_l_SPCL_PRICE_CO = list; }
	public void setList_l_CUST_DLV_CD(List list) { l_l_CUST_DLV_CD = list; }
	public void setList_l_CUST_DLV_KEY_CD(List list) { l_l_CUST_DLV_KEY_CD = list; }
	public void setList_l_FIXED_ODR_NO(List list) { l_l_FIXED_ODR_NO = list; }
	public void setList_l_ALCTED_SEQ_CD(List list) { l_l_ALCTED_SEQ_CD = list; }
	public void setList_l_ALCTED_UNCONFIRM_ODR_NO(List list) { l_l_ALCTED_UNCONFIRM_ODR_NO = list; }
	public void setList_l_ALCTED_UNCONFIRM_ODR_QTY(List list) { l_l_ALCTED_UNCONFIRM_ODR_QTY = list; }
	public void setList_l_LAST_ANS_DLV_DATE_RCD(List list) { l_l_LAST_ANS_DLV_DATE_RCD = list; }
	public void setList_l_DESINATED_SHIP_DATE(List list) { l_l_DESINATED_SHIP_DATE = list; }
	public void setList_l_DESINATED_SHIP_QTY(List list) { l_l_DESINATED_SHIP_QTY = list; }
	public void setList_l_REST_SHIP_ODR_QTY(List list) { l_l_REST_SHIP_ODR_QTY = list; }
	public void setList_l_CUST_ANAME(List list) { l_l_CUST_ANAME = list; }
	public void setList_l_OWN_ORG_CD(List list) { l_l_OWN_ORG_CD = list; }
	public void setList_l_OWN_PERSON_CD(List list) { l_l_OWN_PERSON_CD = list; }
	public void setList_l_DETAIL_ROUND_TYP(List list) { l_l_DETAIL_ROUND_TYP = list; }
	public void setList_l_COMPANY_CD(List list) { l_l_COMPANY_CD = list; }
	public void setList_l_DLV_LOC_NAME(List list) { l_l_DLV_LOC_NAME = list; }
	public void setList_l_TRANSPORT_LT(List list) { l_l_TRANSPORT_LT = list; }
	public void setList_l_DEPO_WH_CD(List list) { l_l_DEPO_WH_CD = list; }
	public void setList_l_SHIP_WH_CD(List list) { l_l_SHIP_WH_CD = list; }
	public void setList_h_SHIP_PLANT_CD(List list) { l_h_SHIP_PLANT_CD = list; }
	public void setList_l_UNIT_COST(List list) { l_l_UNIT_COST = list; }
	public void setList_l_EFF_PHASE_IN_DATE(List list) { l_l_EFF_PHASE_IN_DATE = list; }
	public void setList_l_STOCK_UNIT(List list) { l_l_STOCK_UNIT = list; }
	public void setList_l_UNIT_QTY_TYP(List list) { l_l_UNIT_QTY_TYP = list; }
	public void setList_h_MRP_ODR_TYP(List list) { l_h_MRP_ODR_TYP = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_CODE(List list) { l_CODE = list; }
	public void setList_CLASS_CODE(List list) { l_CLASS_CODE = list; }
	public void setList_HOME_CUR_CD(List list) { l_HOME_CUR_CD = list; }
	public void setList_BUSINESS_OPR_DATE(List list) { l_BUSINESS_OPR_DATE = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_l_CUR_UNIT(List list) { l_l_CUR_UNIT = list; }
	public void setList_h_PRD_REQ_JOB_ODR_TYP_1(List list) { l_h_PRD_REQ_JOB_ODR_TYP_1 = list; }
	public void setList_h_PRD_REQ_JOB_ODR_TYP_2(List list) { l_h_PRD_REQ_JOB_ODR_TYP_2 = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_l_JOB_ODR_CD(List list) { l_l_JOB_ODR_CD = list; }
	public void setList_l_JOB_ODR_DLV_DATE(List list) { l_l_JOB_ODR_DLV_DATE = list; }
	public void setList_JOB_OD_CD(List list) { l_JOB_OD_CD = list; }
	public void setList_JOB_OD_CD_PREFIX(List list) { l_JOB_OD_CD_PREFIX = list; }
	public void setList_l_JOB_ODR_SET_FLG(List list) { l_l_JOB_ODR_SET_FLG = list; }
	public void setList_l_JOB_ODR_QTY(List list) { l_l_JOB_ODR_QTY = list; }
	public void setList_l_ALC_GRP_CD(List list) { l_l_ALC_GRP_CD = list; }
	public void setList_l_ALCD_QTY(List list) { l_l_ALCD_QTY = list; }
	public void setList_OD_CALC_FLG(List list) { l_OD_CALC_FLG = list; }
	public void setList_TAX_CD(List list) { l_TAX_CD = list; }

	public int setL2L_l_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_NO == null) {
			l_l_NO = new ArrayList();
		} else {
			l_l_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_NO.add(((KQ0010010Struct) list.get(i)).getl_NO());
		}
		return size;
	}
	public int setL2L_l_ODR_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ODR_TYP_DN == null) {
			l_l_ODR_TYP_DN = new ArrayList();
		} else {
			l_l_ODR_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ODR_TYP_DN.add(((KQ0010010Struct) list.get(i)).getl_ODR_TYP_DN());
		}
		return size;
	}
	public int setL2L_l_SPCL_PRICE_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SPCL_PRICE_TYP_DN == null) {
			l_l_SPCL_PRICE_TYP_DN = new ArrayList();
		} else {
			l_l_SPCL_PRICE_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SPCL_PRICE_TYP_DN.add(((KQ0010010Struct) list.get(i)).getl_SPCL_PRICE_TYP_DN());
		}
		return size;
	}
	public int setL2L_l_DEPO_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DEPO_TYP_DN == null) {
			l_l_DEPO_TYP_DN = new ArrayList();
		} else {
			l_l_DEPO_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DEPO_TYP_DN.add(((KQ0010010Struct) list.get(i)).getl_DEPO_TYP_DN());
		}
		return size;
	}
	public int setL2L_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_TYP == null) {
			l_ODR_TYP = new ArrayList();
		} else {
			l_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_TYP.add(((KQ0010010Struct) list.get(i)).getODR_TYP());
		}
		return size;
	}
	public int setL2L_ODR_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_TYP_name == null) {
			l_ODR_TYP_name = new ArrayList();
		} else {
			l_ODR_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_TYP_name.add(((KQ0010010Struct) list.get(i)).getODR_TYP_name());
		}
		return size;
	}
	public int setL2L_ODR_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_TYP_val == null) {
			l_ODR_TYP_val = new ArrayList();
		} else {
			l_ODR_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_TYP_val.add(((KQ0010010Struct) list.get(i)).getODR_TYP_val());
		}
		return size;
	}
	public int setL2L_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NO == null) {
			l_NO = new ArrayList();
		} else {
			l_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NO.add(((KQ0010010Struct) list.get(i)).getNO());
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
			l_CUST_ODR_NO.add(((KQ0010010Struct) list.get(i)).getCUST_ODR_NO());
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
			l_CUST_ITEM_CD.add(((KQ0010010Struct) list.get(i)).getCUST_ITEM_CD());
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
			l_CUST_CD.add(((KQ0010010Struct) list.get(i)).getCUST_CD());
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
			l_DLV_LOC_CD.add(((KQ0010010Struct) list.get(i)).getDLV_LOC_CD());
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
			l_DESINATED_DLV_DATE.add(((KQ0010010Struct) list.get(i)).getDESINATED_DLV_DATE());
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
			l_ODR_QTY.add(((KQ0010010Struct) list.get(i)).getODR_QTY());
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
			l_ODR_UNIT_PRICE.add(((KQ0010010Struct) list.get(i)).getODR_UNIT_PRICE());
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
			l_SPCL_PRICE_TYP.add(((KQ0010010Struct) list.get(i)).getSPCL_PRICE_TYP());
		}
		return size;
	}
	public int setL2L_SPCL_PRICE_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SPCL_PRICE_TYP_name == null) {
			l_SPCL_PRICE_TYP_name = new ArrayList();
		} else {
			l_SPCL_PRICE_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SPCL_PRICE_TYP_name.add(((KQ0010010Struct) list.get(i)).getSPCL_PRICE_TYP_name());
		}
		return size;
	}
	public int setL2L_SPCL_PRICE_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SPCL_PRICE_TYP_val == null) {
			l_SPCL_PRICE_TYP_val = new ArrayList();
		} else {
			l_SPCL_PRICE_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SPCL_PRICE_TYP_val.add(((KQ0010010Struct) list.get(i)).getSPCL_PRICE_TYP_val());
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
			l_REMARKS.add(((KQ0010010Struct) list.get(i)).getREMARKS());
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
			l_ODR_ACPT_DATE.add(((KQ0010010Struct) list.get(i)).getODR_ACPT_DATE());
		}
		return size;
	}
	public int setL2L_h_BUSINESS_OPR_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_BUSINESS_OPR_DATE == null) {
			l_h_BUSINESS_OPR_DATE = new ArrayList();
		} else {
			l_h_BUSINESS_OPR_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_BUSINESS_OPR_DATE.add(((KQ0010010Struct) list.get(i)).geth_BUSINESS_OPR_DATE());
		}
		return size;
	}
	public int setL2L_c_DOODR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_DOODR == null) {
			l_c_DOODR = new ArrayList();
		} else {
			l_c_DOODR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_DOODR.add(((KQ0010010Struct) list.get(i)).getc_DOODR());
		}
		return size;
	}
	public int setL2L_JOB_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_QTY == null) {
			l_JOB_ODR_QTY = new ArrayList();
		} else {
			l_JOB_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_QTY.add(((KQ0010010Struct) list.get(i)).getJOB_ODR_QTY());
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
			l_JOB_ODR_DLV_DATE.add(((KQ0010010Struct) list.get(i)).getJOB_ODR_DLV_DATE());
		}
		return size;
	}
	public int setL2L_ALC_GRP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ALC_GRP_CD == null) {
			l_ALC_GRP_CD = new ArrayList();
		} else {
			l_ALC_GRP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ALC_GRP_CD.add(((KQ0010010Struct) list.get(i)).getALC_GRP_CD());
		}
		return size;
	}
	public int setL2L_c_INPUTODRCD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_INPUTODRCD == null) {
			l_c_INPUTODRCD = new ArrayList();
		} else {
			l_c_INPUTODRCD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_INPUTODRCD.add(((KQ0010010Struct) list.get(i)).getc_INPUTODRCD());
		}
		return size;
	}
	public int setL2L_h_DOODRFLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_DOODRFLG == null) {
			l_h_DOODRFLG = new ArrayList();
		} else {
			l_h_DOODRFLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_DOODRFLG.add(((KQ0010010Struct) list.get(i)).geth_DOODRFLG());
		}
		return size;
	}
	public int setL2L_h_INPUTODRCDFLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_INPUTODRCDFLG == null) {
			l_h_INPUTODRCDFLG = new ArrayList();
		} else {
			l_h_INPUTODRCDFLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_INPUTODRCDFLG.add(((KQ0010010Struct) list.get(i)).geth_INPUTODRCDFLG());
		}
		return size;
	}
	public int setL2L_h_CHECK_STATUS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_CHECK_STATUS == null) {
			l_h_CHECK_STATUS = new ArrayList();
		} else {
			l_h_CHECK_STATUS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_CHECK_STATUS.add(((KQ0010010Struct) list.get(i)).geth_CHECK_STATUS());
		}
		return size;
	}
	public int setL2L_h_APR_ODR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_APR_ODR == null) {
			l_h_APR_ODR = new ArrayList();
		} else {
			l_h_APR_ODR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_APR_ODR.add(((KQ0010010Struct) list.get(i)).geth_APR_ODR());
		}
		return size;
	}
	public int setL2L_APPR_REMARKS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_APPR_REMARKS == null) {
			l_APPR_REMARKS = new ArrayList();
		} else {
			l_APPR_REMARKS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_APPR_REMARKS.add(((KQ0010010Struct) list.get(i)).getAPPR_REMARKS());
		}
		return size;
	}
	public int setL2L_l_APPR_REMARKS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_APPR_REMARKS == null) {
			l_l_APPR_REMARKS = new ArrayList();
		} else {
			l_l_APPR_REMARKS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_APPR_REMARKS.add(((KQ0010010Struct) list.get(i)).getl_APPR_REMARKS());
		}
		return size;
	}
	public int setL2L_l_PROJECT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PROJECT_CD == null) {
			l_l_PROJECT_CD = new ArrayList();
		} else {
			l_l_PROJECT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PROJECT_CD.add(((KQ0010010Struct) list.get(i)).getl_PROJECT_CD());
		}
		return size;
	}
	public int setL2L_l_ESTIMATE_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ESTIMATE_NO == null) {
			l_l_ESTIMATE_NO = new ArrayList();
		} else {
			l_l_ESTIMATE_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ESTIMATE_NO.add(((KQ0010010Struct) list.get(i)).getl_ESTIMATE_NO());
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
			l_l_DETAL_NO.add(((KQ0010010Struct) list.get(i)).getl_DETAL_NO());
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
			l_l_ODR_CTL_NO.add(((KQ0010010Struct) list.get(i)).getl_ODR_CTL_NO());
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
			l_l_CUST_CD.add(((KQ0010010Struct) list.get(i)).getl_CUST_CD());
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
			l_l_CUST_ITEM_CD.add(((KQ0010010Struct) list.get(i)).getl_CUST_ITEM_CD());
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
			l_l_ITEM_CD.add(((KQ0010010Struct) list.get(i)).getl_ITEM_CD());
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
			l_l_CUST_ITEM_NAME.add(((KQ0010010Struct) list.get(i)).getl_CUST_ITEM_NAME());
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
			l_l_ITEM_NAME.add(((KQ0010010Struct) list.get(i)).getl_ITEM_NAME());
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
			l_l_ODR_NO.add(((KQ0010010Struct) list.get(i)).getl_ODR_NO());
		}
		return size;
	}
	public int setL2L_l_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ODR_TYP == null) {
			l_l_ODR_TYP = new ArrayList();
		} else {
			l_l_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ODR_TYP.add(((KQ0010010Struct) list.get(i)).getl_ODR_TYP());
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
			l_l_CUST_ODR_NO.add(((KQ0010010Struct) list.get(i)).getl_CUST_ODR_NO());
		}
		return size;
	}
	public int setL2L_l_CUST_CHRG_ORG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_CUST_CHRG_ORG_CD == null) {
			l_l_CUST_CHRG_ORG_CD = new ArrayList();
		} else {
			l_l_CUST_CHRG_ORG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_CUST_CHRG_ORG_CD.add(((KQ0010010Struct) list.get(i)).getl_CUST_CHRG_ORG_CD());
		}
		return size;
	}
	public int setL2L_l_CUST_CHRG_PSN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_CUST_CHRG_PSN_CD == null) {
			l_l_CUST_CHRG_PSN_CD = new ArrayList();
		} else {
			l_l_CUST_CHRG_PSN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_CUST_CHRG_PSN_CD.add(((KQ0010010Struct) list.get(i)).getl_CUST_CHRG_PSN_CD());
		}
		return size;
	}
	public int setL2L_l_ODR_ACPT_ORG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ODR_ACPT_ORG_CD == null) {
			l_l_ODR_ACPT_ORG_CD = new ArrayList();
		} else {
			l_l_ODR_ACPT_ORG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ODR_ACPT_ORG_CD.add(((KQ0010010Struct) list.get(i)).getl_ODR_ACPT_ORG_CD());
		}
		return size;
	}
	public int setL2L_l_ODR_ACPT_PSN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ODR_ACPT_PSN_CD == null) {
			l_l_ODR_ACPT_PSN_CD = new ArrayList();
		} else {
			l_l_ODR_ACPT_PSN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ODR_ACPT_PSN_CD.add(((KQ0010010Struct) list.get(i)).getl_ODR_ACPT_PSN_CD());
		}
		return size;
	}
	public int setL2L_l_CURRNCY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_CURRNCY_CD == null) {
			l_l_CURRNCY_CD = new ArrayList();
		} else {
			l_l_CURRNCY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_CURRNCY_CD.add(((KQ0010010Struct) list.get(i)).getl_CURRNCY_CD());
		}
		return size;
	}
	public int setL2L_l_EXCH_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_EXCH_TYP == null) {
			l_l_EXCH_TYP = new ArrayList();
		} else {
			l_l_EXCH_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_EXCH_TYP.add(((KQ0010010Struct) list.get(i)).getl_EXCH_TYP());
		}
		return size;
	}
	public int setL2L_l_DLV_LOC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DLV_LOC_CD == null) {
			l_l_DLV_LOC_CD = new ArrayList();
		} else {
			l_l_DLV_LOC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DLV_LOC_CD.add(((KQ0010010Struct) list.get(i)).getl_DLV_LOC_CD());
		}
		return size;
	}
	public int setL2L_l_DLV_LOC_NAME_KANJI(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DLV_LOC_NAME_KANJI == null) {
			l_l_DLV_LOC_NAME_KANJI = new ArrayList();
		} else {
			l_l_DLV_LOC_NAME_KANJI.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DLV_LOC_NAME_KANJI.add(((KQ0010010Struct) list.get(i)).getl_DLV_LOC_NAME_KANJI());
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
			l_l_ODR_UNIT_PRICE.add(((KQ0010010Struct) list.get(i)).getl_ODR_UNIT_PRICE());
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
			l_l_SPCL_PRICE_TYP.add(((KQ0010010Struct) list.get(i)).getl_SPCL_PRICE_TYP());
		}
		return size;
	}
	public int setL2L_l_DEPO_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DEPO_TYP == null) {
			l_l_DEPO_TYP = new ArrayList();
		} else {
			l_l_DEPO_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DEPO_TYP.add(((KQ0010010Struct) list.get(i)).getl_DEPO_TYP());
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
			l_l_DESINATED_DLV_DATE.add(((KQ0010010Struct) list.get(i)).getl_DESINATED_DLV_DATE());
		}
		return size;
	}
	public int setL2L_l_STD_DESINATED_RCV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_STD_DESINATED_RCV_DATE == null) {
			l_l_STD_DESINATED_RCV_DATE = new ArrayList();
		} else {
			l_l_STD_DESINATED_RCV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_STD_DESINATED_RCV_DATE.add(((KQ0010010Struct) list.get(i)).getl_STD_DESINATED_RCV_DATE());
		}
		return size;
	}
	public int setL2L_l_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ODR_QTY == null) {
			l_l_ODR_QTY = new ArrayList();
		} else {
			l_l_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ODR_QTY.add(((KQ0010010Struct) list.get(i)).getl_ODR_QTY());
		}
		return size;
	}
	public int setL2L_l_REMAIN_UNCONFIRM_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_REMAIN_UNCONFIRM_ODR_QTY == null) {
			l_l_REMAIN_UNCONFIRM_ODR_QTY = new ArrayList();
		} else {
			l_l_REMAIN_UNCONFIRM_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_REMAIN_UNCONFIRM_ODR_QTY.add(((KQ0010010Struct) list.get(i)).getl_REMAIN_UNCONFIRM_ODR_QTY());
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
			l_l_UNIT_CD.add(((KQ0010010Struct) list.get(i)).getl_UNIT_CD());
		}
		return size;
	}
	public int setL2L_l_UNCONFIRM_ODR_BALANCE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_UNCONFIRM_ODR_BALANCE == null) {
			l_l_UNCONFIRM_ODR_BALANCE = new ArrayList();
		} else {
			l_l_UNCONFIRM_ODR_BALANCE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_UNCONFIRM_ODR_BALANCE.add(((KQ0010010Struct) list.get(i)).getl_UNCONFIRM_ODR_BALANCE());
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
			l_l_ODR_AMOUNT.add(((KQ0010010Struct) list.get(i)).getl_ODR_AMOUNT());
		}
		return size;
	}
	public int setL2L_l_ODR_AMOUNT_EXCH_RATES(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ODR_AMOUNT_EXCH_RATES == null) {
			l_l_ODR_AMOUNT_EXCH_RATES = new ArrayList();
		} else {
			l_l_ODR_AMOUNT_EXCH_RATES.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ODR_AMOUNT_EXCH_RATES.add(((KQ0010010Struct) list.get(i)).getl_ODR_AMOUNT_EXCH_RATES());
		}
		return size;
	}
	public int setL2L_l_TRANSPORT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_TRANSPORT_CD == null) {
			l_l_TRANSPORT_CD = new ArrayList();
		} else {
			l_l_TRANSPORT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_TRANSPORT_CD.add(((KQ0010010Struct) list.get(i)).getl_TRANSPORT_CD());
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
			l_l_TRANSPORT_TYP.add(((KQ0010010Struct) list.get(i)).getl_TRANSPORT_TYP());
		}
		return size;
	}
	public int setL2L_l_TAX_APPLY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_TAX_APPLY_TYP == null) {
			l_l_TAX_APPLY_TYP = new ArrayList();
		} else {
			l_l_TAX_APPLY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_TAX_APPLY_TYP.add(((KQ0010010Struct) list.get(i)).getl_TAX_APPLY_TYP());
		}
		return size;
	}
	public int setL2L_l_TAX_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_TAX_CD == null) {
			l_l_TAX_CD = new ArrayList();
		} else {
			l_l_TAX_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_TAX_CD.add(((KQ0010010Struct) list.get(i)).getl_TAX_CD());
		}
		return size;
	}
	public int setL2L_l_TAX_CALC_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_TAX_CALC_TYP == null) {
			l_l_TAX_CALC_TYP = new ArrayList();
		} else {
			l_l_TAX_CALC_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_TAX_CALC_TYP.add(((KQ0010010Struct) list.get(i)).getl_TAX_CALC_TYP());
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
			l_l_REMARKS.add(((KQ0010010Struct) list.get(i)).getl_REMARKS());
		}
		return size;
	}
	public int setL2L_l_ODR_ACPT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ODR_ACPT_DATE == null) {
			l_l_ODR_ACPT_DATE = new ArrayList();
		} else {
			l_l_ODR_ACPT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ODR_ACPT_DATE.add(((KQ0010010Struct) list.get(i)).getl_ODR_ACPT_DATE());
		}
		return size;
	}
	public int setL2L_l_SHIP_PLAN_REMAIN_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SHIP_PLAN_REMAIN_QTY == null) {
			l_l_SHIP_PLAN_REMAIN_QTY = new ArrayList();
		} else {
			l_l_SHIP_PLAN_REMAIN_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SHIP_PLAN_REMAIN_QTY.add(((KQ0010010Struct) list.get(i)).getl_SHIP_PLAN_REMAIN_QTY());
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
			l_l_PARTIAL_SHIP_INST_FLG.add(((KQ0010010Struct) list.get(i)).getl_PARTIAL_SHIP_INST_FLG());
		}
		return size;
	}
	public int setL2L_PART_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PART_NAME == null) {
			l_PART_NAME = new ArrayList();
		} else {
			l_PART_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PART_NAME.add(((KQ0010010Struct) list.get(i)).getPART_NAME());
		}
		return size;
	}
	public int setL2L_l_RSLT_CTL_SEQ_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_RSLT_CTL_SEQ_CD == null) {
			l_l_RSLT_CTL_SEQ_CD = new ArrayList();
		} else {
			l_l_RSLT_CTL_SEQ_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_RSLT_CTL_SEQ_CD.add(((KQ0010010Struct) list.get(i)).getl_RSLT_CTL_SEQ_CD());
		}
		return size;
	}
	public int setL2L_l_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_UNIT == null) {
			l_l_UNIT = new ArrayList();
		} else {
			l_l_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_UNIT.add(((KQ0010010Struct) list.get(i)).getl_UNIT());
		}
		return size;
	}
	public int setL2L_l_DLV_PLACE_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DLV_PLACE_CD == null) {
			l_l_DLV_PLACE_CD = new ArrayList();
		} else {
			l_l_DLV_PLACE_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DLV_PLACE_CD.add(((KQ0010010Struct) list.get(i)).getl_DLV_PLACE_CD());
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
			l_l_UNIT_PRICE.add(((KQ0010010Struct) list.get(i)).getl_UNIT_PRICE());
		}
		return size;
	}
	public int setL2L_l_CUR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_CUR_CD == null) {
			l_l_CUR_CD = new ArrayList();
		} else {
			l_l_CUR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_CUR_CD.add(((KQ0010010Struct) list.get(i)).getl_CUR_CD());
		}
		return size;
	}
	public int setL2L_l_SPCL_PRICE_CO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SPCL_PRICE_CO == null) {
			l_l_SPCL_PRICE_CO = new ArrayList();
		} else {
			l_l_SPCL_PRICE_CO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SPCL_PRICE_CO.add(((KQ0010010Struct) list.get(i)).getl_SPCL_PRICE_CO());
		}
		return size;
	}
	public int setL2L_l_CUST_DLV_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_CUST_DLV_CD == null) {
			l_l_CUST_DLV_CD = new ArrayList();
		} else {
			l_l_CUST_DLV_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_CUST_DLV_CD.add(((KQ0010010Struct) list.get(i)).getl_CUST_DLV_CD());
		}
		return size;
	}
	public int setL2L_l_CUST_DLV_KEY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_CUST_DLV_KEY_CD == null) {
			l_l_CUST_DLV_KEY_CD = new ArrayList();
		} else {
			l_l_CUST_DLV_KEY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_CUST_DLV_KEY_CD.add(((KQ0010010Struct) list.get(i)).getl_CUST_DLV_KEY_CD());
		}
		return size;
	}
	public int setL2L_l_FIXED_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_FIXED_ODR_NO == null) {
			l_l_FIXED_ODR_NO = new ArrayList();
		} else {
			l_l_FIXED_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_FIXED_ODR_NO.add(((KQ0010010Struct) list.get(i)).getl_FIXED_ODR_NO());
		}
		return size;
	}
	public int setL2L_l_ALCTED_SEQ_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ALCTED_SEQ_CD == null) {
			l_l_ALCTED_SEQ_CD = new ArrayList();
		} else {
			l_l_ALCTED_SEQ_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ALCTED_SEQ_CD.add(((KQ0010010Struct) list.get(i)).getl_ALCTED_SEQ_CD());
		}
		return size;
	}
	public int setL2L_l_ALCTED_UNCONFIRM_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ALCTED_UNCONFIRM_ODR_NO == null) {
			l_l_ALCTED_UNCONFIRM_ODR_NO = new ArrayList();
		} else {
			l_l_ALCTED_UNCONFIRM_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ALCTED_UNCONFIRM_ODR_NO.add(((KQ0010010Struct) list.get(i)).getl_ALCTED_UNCONFIRM_ODR_NO());
		}
		return size;
	}
	public int setL2L_l_ALCTED_UNCONFIRM_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ALCTED_UNCONFIRM_ODR_QTY == null) {
			l_l_ALCTED_UNCONFIRM_ODR_QTY = new ArrayList();
		} else {
			l_l_ALCTED_UNCONFIRM_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ALCTED_UNCONFIRM_ODR_QTY.add(((KQ0010010Struct) list.get(i)).getl_ALCTED_UNCONFIRM_ODR_QTY());
		}
		return size;
	}
	public int setL2L_l_LAST_ANS_DLV_DATE_RCD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_LAST_ANS_DLV_DATE_RCD == null) {
			l_l_LAST_ANS_DLV_DATE_RCD = new ArrayList();
		} else {
			l_l_LAST_ANS_DLV_DATE_RCD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_LAST_ANS_DLV_DATE_RCD.add(((KQ0010010Struct) list.get(i)).getl_LAST_ANS_DLV_DATE_RCD());
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
			l_l_DESINATED_SHIP_DATE.add(((KQ0010010Struct) list.get(i)).getl_DESINATED_SHIP_DATE());
		}
		return size;
	}
	public int setL2L_l_DESINATED_SHIP_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DESINATED_SHIP_QTY == null) {
			l_l_DESINATED_SHIP_QTY = new ArrayList();
		} else {
			l_l_DESINATED_SHIP_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DESINATED_SHIP_QTY.add(((KQ0010010Struct) list.get(i)).getl_DESINATED_SHIP_QTY());
		}
		return size;
	}
	public int setL2L_l_REST_SHIP_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_REST_SHIP_ODR_QTY == null) {
			l_l_REST_SHIP_ODR_QTY = new ArrayList();
		} else {
			l_l_REST_SHIP_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_REST_SHIP_ODR_QTY.add(((KQ0010010Struct) list.get(i)).getl_REST_SHIP_ODR_QTY());
		}
		return size;
	}
	public int setL2L_l_CUST_ANAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_CUST_ANAME == null) {
			l_l_CUST_ANAME = new ArrayList();
		} else {
			l_l_CUST_ANAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_CUST_ANAME.add(((KQ0010010Struct) list.get(i)).getl_CUST_ANAME());
		}
		return size;
	}
	public int setL2L_l_OWN_ORG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OWN_ORG_CD == null) {
			l_l_OWN_ORG_CD = new ArrayList();
		} else {
			l_l_OWN_ORG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OWN_ORG_CD.add(((KQ0010010Struct) list.get(i)).getl_OWN_ORG_CD());
		}
		return size;
	}
	public int setL2L_l_OWN_PERSON_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OWN_PERSON_CD == null) {
			l_l_OWN_PERSON_CD = new ArrayList();
		} else {
			l_l_OWN_PERSON_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OWN_PERSON_CD.add(((KQ0010010Struct) list.get(i)).getl_OWN_PERSON_CD());
		}
		return size;
	}
	public int setL2L_l_DETAIL_ROUND_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DETAIL_ROUND_TYP == null) {
			l_l_DETAIL_ROUND_TYP = new ArrayList();
		} else {
			l_l_DETAIL_ROUND_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DETAIL_ROUND_TYP.add(((KQ0010010Struct) list.get(i)).getl_DETAIL_ROUND_TYP());
		}
		return size;
	}
	public int setL2L_l_COMPANY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_COMPANY_CD == null) {
			l_l_COMPANY_CD = new ArrayList();
		} else {
			l_l_COMPANY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_COMPANY_CD.add(((KQ0010010Struct) list.get(i)).getl_COMPANY_CD());
		}
		return size;
	}
	public int setL2L_l_DLV_LOC_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DLV_LOC_NAME == null) {
			l_l_DLV_LOC_NAME = new ArrayList();
		} else {
			l_l_DLV_LOC_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DLV_LOC_NAME.add(((KQ0010010Struct) list.get(i)).getl_DLV_LOC_NAME());
		}
		return size;
	}
	public int setL2L_l_TRANSPORT_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_TRANSPORT_LT == null) {
			l_l_TRANSPORT_LT = new ArrayList();
		} else {
			l_l_TRANSPORT_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_TRANSPORT_LT.add(((KQ0010010Struct) list.get(i)).getl_TRANSPORT_LT());
		}
		return size;
	}
	public int setL2L_l_DEPO_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DEPO_WH_CD == null) {
			l_l_DEPO_WH_CD = new ArrayList();
		} else {
			l_l_DEPO_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DEPO_WH_CD.add(((KQ0010010Struct) list.get(i)).getl_DEPO_WH_CD());
		}
		return size;
	}
	public int setL2L_l_SHIP_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SHIP_WH_CD == null) {
			l_l_SHIP_WH_CD = new ArrayList();
		} else {
			l_l_SHIP_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SHIP_WH_CD.add(((KQ0010010Struct) list.get(i)).getl_SHIP_WH_CD());
		}
		return size;
	}
	public int setL2L_h_SHIP_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_SHIP_PLANT_CD == null) {
			l_h_SHIP_PLANT_CD = new ArrayList();
		} else {
			l_h_SHIP_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_SHIP_PLANT_CD.add(((KQ0010010Struct) list.get(i)).geth_SHIP_PLANT_CD());
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
			l_l_UNIT_COST.add(((KQ0010010Struct) list.get(i)).getl_UNIT_COST());
		}
		return size;
	}
	public int setL2L_l_EFF_PHASE_IN_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_EFF_PHASE_IN_DATE == null) {
			l_l_EFF_PHASE_IN_DATE = new ArrayList();
		} else {
			l_l_EFF_PHASE_IN_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_EFF_PHASE_IN_DATE.add(((KQ0010010Struct) list.get(i)).getl_EFF_PHASE_IN_DATE());
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
			l_l_STOCK_UNIT.add(((KQ0010010Struct) list.get(i)).getl_STOCK_UNIT());
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
			l_l_UNIT_QTY_TYP.add(((KQ0010010Struct) list.get(i)).getl_UNIT_QTY_TYP());
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
			l_h_MRP_ODR_TYP.add(((KQ0010010Struct) list.get(i)).geth_MRP_ODR_TYP());
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
			l_COMPANY_CD.add(((KQ0010010Struct) list.get(i)).getCOMPANY_CD());
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
			l_CODE.add(((KQ0010010Struct) list.get(i)).getCODE());
		}
		return size;
	}
	public int setL2L_CLASS_CODE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CLASS_CODE == null) {
			l_CLASS_CODE = new ArrayList();
		} else {
			l_CLASS_CODE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CLASS_CODE.add(((KQ0010010Struct) list.get(i)).getCLASS_CODE());
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
			l_HOME_CUR_CD.add(((KQ0010010Struct) list.get(i)).getHOME_CUR_CD());
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
			l_BUSINESS_OPR_DATE.add(((KQ0010010Struct) list.get(i)).getBUSINESS_OPR_DATE());
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
			l_PLANT_CD.add(((KQ0010010Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
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
			l_l_CUR_UNIT.add(((KQ0010010Struct) list.get(i)).getl_CUR_UNIT());
		}
		return size;
	}
	public int setL2L_h_PRD_REQ_JOB_ODR_TYP_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PRD_REQ_JOB_ODR_TYP_1 == null) {
			l_h_PRD_REQ_JOB_ODR_TYP_1 = new ArrayList();
		} else {
			l_h_PRD_REQ_JOB_ODR_TYP_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PRD_REQ_JOB_ODR_TYP_1.add(((KQ0010010Struct) list.get(i)).geth_PRD_REQ_JOB_ODR_TYP_1());
		}
		return size;
	}
	public int setL2L_h_PRD_REQ_JOB_ODR_TYP_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PRD_REQ_JOB_ODR_TYP_2 == null) {
			l_h_PRD_REQ_JOB_ODR_TYP_2 = new ArrayList();
		} else {
			l_h_PRD_REQ_JOB_ODR_TYP_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PRD_REQ_JOB_ODR_TYP_2.add(((KQ0010010Struct) list.get(i)).geth_PRD_REQ_JOB_ODR_TYP_2());
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
			l_JOB_ODR_CD.add(((KQ0010010Struct) list.get(i)).getJOB_ODR_CD());
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
			l_l_JOB_ODR_CD.add(((KQ0010010Struct) list.get(i)).getl_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_l_JOB_ODR_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_JOB_ODR_DLV_DATE == null) {
			l_l_JOB_ODR_DLV_DATE = new ArrayList();
		} else {
			l_l_JOB_ODR_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_JOB_ODR_DLV_DATE.add(((KQ0010010Struct) list.get(i)).getl_JOB_ODR_DLV_DATE());
		}
		return size;
	}
	public int setL2L_JOB_OD_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_OD_CD == null) {
			l_JOB_OD_CD = new ArrayList();
		} else {
			l_JOB_OD_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_OD_CD.add(((KQ0010010Struct) list.get(i)).getJOB_OD_CD());
		}
		return size;
	}
	public int setL2L_JOB_OD_CD_PREFIX(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_OD_CD_PREFIX == null) {
			l_JOB_OD_CD_PREFIX = new ArrayList();
		} else {
			l_JOB_OD_CD_PREFIX.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_OD_CD_PREFIX.add(((KQ0010010Struct) list.get(i)).getJOB_OD_CD_PREFIX());
		}
		return size;
	}
	public int setL2L_l_JOB_ODR_SET_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_JOB_ODR_SET_FLG == null) {
			l_l_JOB_ODR_SET_FLG = new ArrayList();
		} else {
			l_l_JOB_ODR_SET_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_JOB_ODR_SET_FLG.add(((KQ0010010Struct) list.get(i)).getl_JOB_ODR_SET_FLG());
		}
		return size;
	}
	public int setL2L_l_JOB_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_JOB_ODR_QTY == null) {
			l_l_JOB_ODR_QTY = new ArrayList();
		} else {
			l_l_JOB_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_JOB_ODR_QTY.add(((KQ0010010Struct) list.get(i)).getl_JOB_ODR_QTY());
		}
		return size;
	}
	public int setL2L_l_ALC_GRP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ALC_GRP_CD == null) {
			l_l_ALC_GRP_CD = new ArrayList();
		} else {
			l_l_ALC_GRP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ALC_GRP_CD.add(((KQ0010010Struct) list.get(i)).getl_ALC_GRP_CD());
		}
		return size;
	}
	public int setL2L_l_ALCD_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ALCD_QTY == null) {
			l_l_ALCD_QTY = new ArrayList();
		} else {
			l_l_ALCD_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ALCD_QTY.add(((KQ0010010Struct) list.get(i)).getl_ALCD_QTY());
		}
		return size;
	}
	public int setL2L_OD_CALC_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OD_CALC_FLG == null) {
			l_OD_CALC_FLG = new ArrayList();
		} else {
			l_OD_CALC_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OD_CALC_FLG.add(((KQ0010010Struct) list.get(i)).getOD_CALC_FLG());
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
			l_TAX_CD.add(((KQ0010010Struct) list.get(i)).getTAX_CD());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_l_NO = null;
		m_l_ODR_TYP_DN = null;
		m_l_SPCL_PRICE_TYP_DN = null;
		m_l_DEPO_TYP_DN = null;
		m_ODR_TYP = null;
		m_ODR_TYP_name = null;
		m_ODR_TYP_val = null;
		m_NO = null;
		m_CUST_ODR_NO = null;
		m_CUST_ITEM_CD = null;
		m_CUST_CD = null;
		m_DLV_LOC_CD = null;
		m_DESINATED_DLV_DATE = null;
		m_ODR_QTY = null;
		m_ODR_UNIT_PRICE = null;
		m_SPCL_PRICE_TYP = null;
		m_SPCL_PRICE_TYP_name = null;
		m_SPCL_PRICE_TYP_val = null;
		m_REMARKS = null;
		m_ODR_ACPT_DATE = null;
		m_h_BUSINESS_OPR_DATE = null;
		m_c_DOODR = null;
		m_JOB_ODR_QTY = null;
		m_JOB_ODR_DLV_DATE = null;
		m_ALC_GRP_CD = null;
		m_c_INPUTODRCD = null;
		m_h_DOODRFLG = null;
		m_h_INPUTODRCDFLG = null;
		m_h_CHECK_STATUS = null;
		m_h_APR_ODR = null;
		m_APPR_REMARKS = null;
		m_l_APPR_REMARKS = null;
		m_l_PROJECT_CD = null;
		m_l_ESTIMATE_NO = null;
		m_l_DETAL_NO = null;
		m_l_ODR_CTL_NO = null;
		m_l_CUST_CD = null;
		m_l_CUST_ITEM_CD = null;
		m_l_ITEM_CD = null;
		m_l_CUST_ITEM_NAME = null;
		m_l_ITEM_NAME = null;
		m_l_ODR_NO = null;
		m_l_ODR_TYP = null;
		m_l_CUST_ODR_NO = null;
		m_l_CUST_CHRG_ORG_CD = null;
		m_l_CUST_CHRG_PSN_CD = null;
		m_l_ODR_ACPT_ORG_CD = null;
		m_l_ODR_ACPT_PSN_CD = null;
		m_l_CURRNCY_CD = null;
		m_l_EXCH_TYP = null;
		m_l_DLV_LOC_CD = null;
		m_l_DLV_LOC_NAME_KANJI = null;
		m_l_ODR_UNIT_PRICE = null;
		m_l_SPCL_PRICE_TYP = null;
		m_l_DEPO_TYP = null;
		m_l_DESINATED_DLV_DATE = null;
		m_l_STD_DESINATED_RCV_DATE = null;
		m_l_ODR_QTY = null;
		m_l_REMAIN_UNCONFIRM_ODR_QTY = null;
		m_l_UNIT_CD = null;
		m_l_UNCONFIRM_ODR_BALANCE = null;
		m_l_ODR_AMOUNT = null;
		m_l_ODR_AMOUNT_EXCH_RATES = null;
		m_l_TRANSPORT_CD = null;
		m_l_TRANSPORT_TYP = null;
		m_l_TAX_APPLY_TYP = null;
		m_l_TAX_CD = null;
		m_l_TAX_CALC_TYP = null;
		m_l_REMARKS = null;
		m_l_ODR_ACPT_DATE = null;
		m_l_SHIP_PLAN_REMAIN_QTY = null;
		m_l_PARTIAL_SHIP_INST_FLG = null;
		m_PART_NAME = null;
		m_l_RSLT_CTL_SEQ_CD = null;
		m_l_UNIT = null;
		m_l_DLV_PLACE_CD = null;
		m_l_UNIT_PRICE = null;
		m_l_CUR_CD = null;
		m_l_SPCL_PRICE_CO = null;
		m_l_CUST_DLV_CD = null;
		m_l_CUST_DLV_KEY_CD = null;
		m_l_FIXED_ODR_NO = null;
		m_l_ALCTED_SEQ_CD = null;
		m_l_ALCTED_UNCONFIRM_ODR_NO = null;
		m_l_ALCTED_UNCONFIRM_ODR_QTY = null;
		m_l_LAST_ANS_DLV_DATE_RCD = null;
		m_l_DESINATED_SHIP_DATE = null;
		m_l_DESINATED_SHIP_QTY = null;
		m_l_REST_SHIP_ODR_QTY = null;
		m_l_CUST_ANAME = null;
		m_l_OWN_ORG_CD = null;
		m_l_OWN_PERSON_CD = null;
		m_l_DETAIL_ROUND_TYP = null;
		m_l_COMPANY_CD = null;
		m_l_DLV_LOC_NAME = null;
		m_l_TRANSPORT_LT = null;
		m_l_DEPO_WH_CD = null;
		m_l_SHIP_WH_CD = null;
		m_h_SHIP_PLANT_CD = null;
		m_l_UNIT_COST = null;
		m_l_EFF_PHASE_IN_DATE = null;
		m_l_STOCK_UNIT = null;
		m_l_UNIT_QTY_TYP = null;
		m_h_MRP_ODR_TYP = null;
		m_COMPANY_CD = null;
		m_CODE = null;
		m_CLASS_CODE = null;
		m_HOME_CUR_CD = null;
		m_BUSINESS_OPR_DATE = null;
		m_PLANT_CD = null;
		m_l_CUR_UNIT = null;
		m_h_PRD_REQ_JOB_ODR_TYP_1 = null;
		m_h_PRD_REQ_JOB_ODR_TYP_2 = null;
		m_JOB_ODR_CD = null;
		m_l_JOB_ODR_CD = null;
		m_l_JOB_ODR_DLV_DATE = null;
		m_JOB_OD_CD = null;
		m_JOB_OD_CD_PREFIX = null;
		m_l_JOB_ODR_SET_FLG = null;
		m_l_JOB_ODR_QTY = null;
		m_l_ALC_GRP_CD = null;
		m_l_ALCD_QTY = null;
		m_OD_CALC_FLG = null;
		m_TAX_CD = null;

		l_l_NO = null;
		l_l_ODR_TYP_DN = null;
		l_l_SPCL_PRICE_TYP_DN = null;
		l_l_DEPO_TYP_DN = null;
		l_ODR_TYP = null;
		l_ODR_TYP_name = null;
		l_ODR_TYP_val = null;
		l_NO = null;
		l_CUST_ODR_NO = null;
		l_CUST_ITEM_CD = null;
		l_CUST_CD = null;
		l_DLV_LOC_CD = null;
		l_DESINATED_DLV_DATE = null;
		l_ODR_QTY = null;
		l_ODR_UNIT_PRICE = null;
		l_SPCL_PRICE_TYP = null;
		l_SPCL_PRICE_TYP_name = null;
		l_SPCL_PRICE_TYP_val = null;
		l_REMARKS = null;
		l_ODR_ACPT_DATE = null;
		l_h_BUSINESS_OPR_DATE = null;
		l_c_DOODR = null;
		l_JOB_ODR_QTY = null;
		l_JOB_ODR_DLV_DATE = null;
		l_ALC_GRP_CD = null;
		l_c_INPUTODRCD = null;
		l_h_DOODRFLG = null;
		l_h_INPUTODRCDFLG = null;
		l_h_CHECK_STATUS = null;
		l_h_APR_ODR = null;
		l_APPR_REMARKS = null;
		l_l_APPR_REMARKS = null;
		l_l_PROJECT_CD = null;
		l_l_ESTIMATE_NO = null;
		l_l_DETAL_NO = null;
		l_l_ODR_CTL_NO = null;
		l_l_CUST_CD = null;
		l_l_CUST_ITEM_CD = null;
		l_l_ITEM_CD = null;
		l_l_CUST_ITEM_NAME = null;
		l_l_ITEM_NAME = null;
		l_l_ODR_NO = null;
		l_l_ODR_TYP = null;
		l_l_CUST_ODR_NO = null;
		l_l_CUST_CHRG_ORG_CD = null;
		l_l_CUST_CHRG_PSN_CD = null;
		l_l_ODR_ACPT_ORG_CD = null;
		l_l_ODR_ACPT_PSN_CD = null;
		l_l_CURRNCY_CD = null;
		l_l_EXCH_TYP = null;
		l_l_DLV_LOC_CD = null;
		l_l_DLV_LOC_NAME_KANJI = null;
		l_l_ODR_UNIT_PRICE = null;
		l_l_SPCL_PRICE_TYP = null;
		l_l_DEPO_TYP = null;
		l_l_DESINATED_DLV_DATE = null;
		l_l_STD_DESINATED_RCV_DATE = null;
		l_l_ODR_QTY = null;
		l_l_REMAIN_UNCONFIRM_ODR_QTY = null;
		l_l_UNIT_CD = null;
		l_l_UNCONFIRM_ODR_BALANCE = null;
		l_l_ODR_AMOUNT = null;
		l_l_ODR_AMOUNT_EXCH_RATES = null;
		l_l_TRANSPORT_CD = null;
		l_l_TRANSPORT_TYP = null;
		l_l_TAX_APPLY_TYP = null;
		l_l_TAX_CD = null;
		l_l_TAX_CALC_TYP = null;
		l_l_REMARKS = null;
		l_l_ODR_ACPT_DATE = null;
		l_l_SHIP_PLAN_REMAIN_QTY = null;
		l_l_PARTIAL_SHIP_INST_FLG = null;
		l_PART_NAME = null;
		l_l_RSLT_CTL_SEQ_CD = null;
		l_l_UNIT = null;
		l_l_DLV_PLACE_CD = null;
		l_l_UNIT_PRICE = null;
		l_l_CUR_CD = null;
		l_l_SPCL_PRICE_CO = null;
		l_l_CUST_DLV_CD = null;
		l_l_CUST_DLV_KEY_CD = null;
		l_l_FIXED_ODR_NO = null;
		l_l_ALCTED_SEQ_CD = null;
		l_l_ALCTED_UNCONFIRM_ODR_NO = null;
		l_l_ALCTED_UNCONFIRM_ODR_QTY = null;
		l_l_LAST_ANS_DLV_DATE_RCD = null;
		l_l_DESINATED_SHIP_DATE = null;
		l_l_DESINATED_SHIP_QTY = null;
		l_l_REST_SHIP_ODR_QTY = null;
		l_l_CUST_ANAME = null;
		l_l_OWN_ORG_CD = null;
		l_l_OWN_PERSON_CD = null;
		l_l_DETAIL_ROUND_TYP = null;
		l_l_COMPANY_CD = null;
		l_l_DLV_LOC_NAME = null;
		l_l_TRANSPORT_LT = null;
		l_l_DEPO_WH_CD = null;
		l_l_SHIP_WH_CD = null;
		l_h_SHIP_PLANT_CD = null;
		l_l_UNIT_COST = null;
		l_l_EFF_PHASE_IN_DATE = null;
		l_l_STOCK_UNIT = null;
		l_l_UNIT_QTY_TYP = null;
		l_h_MRP_ODR_TYP = null;
		l_COMPANY_CD = null;
		l_CODE = null;
		l_CLASS_CODE = null;
		l_HOME_CUR_CD = null;
		l_BUSINESS_OPR_DATE = null;
		l_PLANT_CD = null;
		l_l_CUR_UNIT = null;
		l_h_PRD_REQ_JOB_ODR_TYP_1 = null;
		l_h_PRD_REQ_JOB_ODR_TYP_2 = null;
		l_JOB_ODR_CD = null;
		l_l_JOB_ODR_CD = null;
		l_l_JOB_ODR_DLV_DATE = null;
		l_JOB_OD_CD = null;
		l_JOB_OD_CD_PREFIX = null;
		l_l_JOB_ODR_SET_FLG = null;
		l_l_JOB_ODR_QTY = null;
		l_l_ALC_GRP_CD = null;
		l_l_ALCD_QTY = null;
		l_OD_CALC_FLG = null;
		l_TAX_CD = null;

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
	 * medKQ0010010�N���X�̕W���R���X�g���N�^
	 */
	public KQ0010010Struct()
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
	public void setStruct(KQ0010010Struct struct)
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
	public void setStructM(KQ0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setl_NO(struct.getl_NO());
			this.setl_ODR_TYP_DN(struct.getl_ODR_TYP_DN());
			this.setl_SPCL_PRICE_TYP_DN(struct.getl_SPCL_PRICE_TYP_DN());
			this.setl_DEPO_TYP_DN(struct.getl_DEPO_TYP_DN());
			this.setODR_TYP(struct.getODR_TYP());
			this.setODR_TYP_name(struct.getODR_TYP_name());
			this.setODR_TYP_val(struct.getODR_TYP_val());
			this.setNO(struct.getNO());
			this.setCUST_ODR_NO(struct.getCUST_ODR_NO());
			this.setCUST_ITEM_CD(struct.getCUST_ITEM_CD());
			this.setCUST_CD(struct.getCUST_CD());
			this.setDLV_LOC_CD(struct.getDLV_LOC_CD());
			this.setDESINATED_DLV_DATE(struct.getDESINATED_DLV_DATE());
			this.setODR_QTY(struct.getODR_QTY());
			this.setODR_UNIT_PRICE(struct.getODR_UNIT_PRICE());
			this.setSPCL_PRICE_TYP(struct.getSPCL_PRICE_TYP());
			this.setSPCL_PRICE_TYP_name(struct.getSPCL_PRICE_TYP_name());
			this.setSPCL_PRICE_TYP_val(struct.getSPCL_PRICE_TYP_val());
			this.setREMARKS(struct.getREMARKS());
			this.setODR_ACPT_DATE(struct.getODR_ACPT_DATE());
			this.seth_BUSINESS_OPR_DATE(struct.geth_BUSINESS_OPR_DATE());
			this.setc_DOODR(struct.getc_DOODR());
			this.setJOB_ODR_QTY(struct.getJOB_ODR_QTY());
			this.setJOB_ODR_DLV_DATE(struct.getJOB_ODR_DLV_DATE());
			this.setALC_GRP_CD(struct.getALC_GRP_CD());
			this.setc_INPUTODRCD(struct.getc_INPUTODRCD());
			this.seth_DOODRFLG(struct.geth_DOODRFLG());
			this.seth_INPUTODRCDFLG(struct.geth_INPUTODRCDFLG());
			this.seth_CHECK_STATUS(struct.geth_CHECK_STATUS());
			this.seth_APR_ODR(struct.geth_APR_ODR());
			this.setAPPR_REMARKS(struct.getAPPR_REMARKS());
			this.setl_APPR_REMARKS(struct.getl_APPR_REMARKS());
			this.setl_PROJECT_CD(struct.getl_PROJECT_CD());
			this.setl_ESTIMATE_NO(struct.getl_ESTIMATE_NO());
			this.setl_DETAL_NO(struct.getl_DETAL_NO());
			this.setl_ODR_CTL_NO(struct.getl_ODR_CTL_NO());
			this.setl_CUST_CD(struct.getl_CUST_CD());
			this.setl_CUST_ITEM_CD(struct.getl_CUST_ITEM_CD());
			this.setl_ITEM_CD(struct.getl_ITEM_CD());
			this.setl_CUST_ITEM_NAME(struct.getl_CUST_ITEM_NAME());
			this.setl_ITEM_NAME(struct.getl_ITEM_NAME());
			this.setl_ODR_NO(struct.getl_ODR_NO());
			this.setl_ODR_TYP(struct.getl_ODR_TYP());
			this.setl_CUST_ODR_NO(struct.getl_CUST_ODR_NO());
			this.setl_CUST_CHRG_ORG_CD(struct.getl_CUST_CHRG_ORG_CD());
			this.setl_CUST_CHRG_PSN_CD(struct.getl_CUST_CHRG_PSN_CD());
			this.setl_ODR_ACPT_ORG_CD(struct.getl_ODR_ACPT_ORG_CD());
			this.setl_ODR_ACPT_PSN_CD(struct.getl_ODR_ACPT_PSN_CD());
			this.setl_CURRNCY_CD(struct.getl_CURRNCY_CD());
			this.setl_EXCH_TYP(struct.getl_EXCH_TYP());
			this.setl_DLV_LOC_CD(struct.getl_DLV_LOC_CD());
			this.setl_DLV_LOC_NAME_KANJI(struct.getl_DLV_LOC_NAME_KANJI());
			this.setl_ODR_UNIT_PRICE(struct.getl_ODR_UNIT_PRICE());
			this.setl_SPCL_PRICE_TYP(struct.getl_SPCL_PRICE_TYP());
			this.setl_DEPO_TYP(struct.getl_DEPO_TYP());
			this.setl_DESINATED_DLV_DATE(struct.getl_DESINATED_DLV_DATE());
			this.setl_STD_DESINATED_RCV_DATE(struct.getl_STD_DESINATED_RCV_DATE());
			this.setl_ODR_QTY(struct.getl_ODR_QTY());
			this.setl_REMAIN_UNCONFIRM_ODR_QTY(struct.getl_REMAIN_UNCONFIRM_ODR_QTY());
			this.setl_UNIT_CD(struct.getl_UNIT_CD());
			this.setl_UNCONFIRM_ODR_BALANCE(struct.getl_UNCONFIRM_ODR_BALANCE());
			this.setl_ODR_AMOUNT(struct.getl_ODR_AMOUNT());
			this.setl_ODR_AMOUNT_EXCH_RATES(struct.getl_ODR_AMOUNT_EXCH_RATES());
			this.setl_TRANSPORT_CD(struct.getl_TRANSPORT_CD());
			this.setl_TRANSPORT_TYP(struct.getl_TRANSPORT_TYP());
			this.setl_TAX_APPLY_TYP(struct.getl_TAX_APPLY_TYP());
			this.setl_TAX_CD(struct.getl_TAX_CD());
			this.setl_TAX_CALC_TYP(struct.getl_TAX_CALC_TYP());
			this.setl_REMARKS(struct.getl_REMARKS());
			this.setl_ODR_ACPT_DATE(struct.getl_ODR_ACPT_DATE());
			this.setl_SHIP_PLAN_REMAIN_QTY(struct.getl_SHIP_PLAN_REMAIN_QTY());
			this.setl_PARTIAL_SHIP_INST_FLG(struct.getl_PARTIAL_SHIP_INST_FLG());
			this.setPART_NAME(struct.getPART_NAME());
			this.setl_RSLT_CTL_SEQ_CD(struct.getl_RSLT_CTL_SEQ_CD());
			this.setl_UNIT(struct.getl_UNIT());
			this.setl_DLV_PLACE_CD(struct.getl_DLV_PLACE_CD());
			this.setl_UNIT_PRICE(struct.getl_UNIT_PRICE());
			this.setl_CUR_CD(struct.getl_CUR_CD());
			this.setl_SPCL_PRICE_CO(struct.getl_SPCL_PRICE_CO());
			this.setl_CUST_DLV_CD(struct.getl_CUST_DLV_CD());
			this.setl_CUST_DLV_KEY_CD(struct.getl_CUST_DLV_KEY_CD());
			this.setl_FIXED_ODR_NO(struct.getl_FIXED_ODR_NO());
			this.setl_ALCTED_SEQ_CD(struct.getl_ALCTED_SEQ_CD());
			this.setl_ALCTED_UNCONFIRM_ODR_NO(struct.getl_ALCTED_UNCONFIRM_ODR_NO());
			this.setl_ALCTED_UNCONFIRM_ODR_QTY(struct.getl_ALCTED_UNCONFIRM_ODR_QTY());
			this.setl_LAST_ANS_DLV_DATE_RCD(struct.getl_LAST_ANS_DLV_DATE_RCD());
			this.setl_DESINATED_SHIP_DATE(struct.getl_DESINATED_SHIP_DATE());
			this.setl_DESINATED_SHIP_QTY(struct.getl_DESINATED_SHIP_QTY());
			this.setl_REST_SHIP_ODR_QTY(struct.getl_REST_SHIP_ODR_QTY());
			this.setl_CUST_ANAME(struct.getl_CUST_ANAME());
			this.setl_OWN_ORG_CD(struct.getl_OWN_ORG_CD());
			this.setl_OWN_PERSON_CD(struct.getl_OWN_PERSON_CD());
			this.setl_DETAIL_ROUND_TYP(struct.getl_DETAIL_ROUND_TYP());
			this.setl_COMPANY_CD(struct.getl_COMPANY_CD());
			this.setl_DLV_LOC_NAME(struct.getl_DLV_LOC_NAME());
			this.setl_TRANSPORT_LT(struct.getl_TRANSPORT_LT());
			this.setl_DEPO_WH_CD(struct.getl_DEPO_WH_CD());
			this.setl_SHIP_WH_CD(struct.getl_SHIP_WH_CD());
			this.seth_SHIP_PLANT_CD(struct.geth_SHIP_PLANT_CD());
			this.setl_UNIT_COST(struct.getl_UNIT_COST());
			this.setl_EFF_PHASE_IN_DATE(struct.getl_EFF_PHASE_IN_DATE());
			this.setl_STOCK_UNIT(struct.getl_STOCK_UNIT());
			this.setl_UNIT_QTY_TYP(struct.getl_UNIT_QTY_TYP());
			this.seth_MRP_ODR_TYP(struct.geth_MRP_ODR_TYP());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setCODE(struct.getCODE());
			this.setCLASS_CODE(struct.getCLASS_CODE());
			this.setHOME_CUR_CD(struct.getHOME_CUR_CD());
			this.setBUSINESS_OPR_DATE(struct.getBUSINESS_OPR_DATE());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setl_CUR_UNIT(struct.getl_CUR_UNIT());
			this.seth_PRD_REQ_JOB_ODR_TYP_1(struct.geth_PRD_REQ_JOB_ODR_TYP_1());
			this.seth_PRD_REQ_JOB_ODR_TYP_2(struct.geth_PRD_REQ_JOB_ODR_TYP_2());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setl_JOB_ODR_CD(struct.getl_JOB_ODR_CD());
			this.setl_JOB_ODR_DLV_DATE(struct.getl_JOB_ODR_DLV_DATE());
			this.setJOB_OD_CD(struct.getJOB_OD_CD());
			this.setJOB_OD_CD_PREFIX(struct.getJOB_OD_CD_PREFIX());
			this.setl_JOB_ODR_SET_FLG(struct.getl_JOB_ODR_SET_FLG());
			this.setl_JOB_ODR_QTY(struct.getl_JOB_ODR_QTY());
			this.setl_ALC_GRP_CD(struct.getl_ALC_GRP_CD());
			this.setl_ALCD_QTY(struct.getl_ALCD_QTY());
			this.setOD_CALC_FLG(struct.getOD_CALC_FLG());
			this.setTAX_CD(struct.getTAX_CD());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(KQ0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_l_NO(struct.getList_l_NO());
			this.setList_l_ODR_TYP_DN(struct.getList_l_ODR_TYP_DN());
			this.setList_l_SPCL_PRICE_TYP_DN(struct.getList_l_SPCL_PRICE_TYP_DN());
			this.setList_l_DEPO_TYP_DN(struct.getList_l_DEPO_TYP_DN());
			this.setList_ODR_TYP(struct.getList_ODR_TYP());
			this.setList_ODR_TYP_name(struct.getList_ODR_TYP_name());
			this.setList_ODR_TYP_val(struct.getList_ODR_TYP_val());
			this.setList_NO(struct.getList_NO());
			this.setList_CUST_ODR_NO(struct.getList_CUST_ODR_NO());
			this.setList_CUST_ITEM_CD(struct.getList_CUST_ITEM_CD());
			this.setList_CUST_CD(struct.getList_CUST_CD());
			this.setList_DLV_LOC_CD(struct.getList_DLV_LOC_CD());
			this.setList_DESINATED_DLV_DATE(struct.getList_DESINATED_DLV_DATE());
			this.setList_ODR_QTY(struct.getList_ODR_QTY());
			this.setList_ODR_UNIT_PRICE(struct.getList_ODR_UNIT_PRICE());
			this.setList_SPCL_PRICE_TYP(struct.getList_SPCL_PRICE_TYP());
			this.setList_SPCL_PRICE_TYP_name(struct.getList_SPCL_PRICE_TYP_name());
			this.setList_SPCL_PRICE_TYP_val(struct.getList_SPCL_PRICE_TYP_val());
			this.setList_REMARKS(struct.getList_REMARKS());
			this.setList_ODR_ACPT_DATE(struct.getList_ODR_ACPT_DATE());
			this.setList_h_BUSINESS_OPR_DATE(struct.getList_h_BUSINESS_OPR_DATE());
			this.setList_c_DOODR(struct.getList_c_DOODR());
			this.setList_JOB_ODR_QTY(struct.getList_JOB_ODR_QTY());
			this.setList_JOB_ODR_DLV_DATE(struct.getList_JOB_ODR_DLV_DATE());
			this.setList_ALC_GRP_CD(struct.getList_ALC_GRP_CD());
			this.setList_c_INPUTODRCD(struct.getList_c_INPUTODRCD());
			this.setList_h_DOODRFLG(struct.getList_h_DOODRFLG());
			this.setList_h_INPUTODRCDFLG(struct.getList_h_INPUTODRCDFLG());
			this.setList_h_CHECK_STATUS(struct.getList_h_CHECK_STATUS());
			this.setList_h_APR_ODR(struct.getList_h_APR_ODR());
			this.setList_APPR_REMARKS(struct.getList_APPR_REMARKS());
			this.setList_l_APPR_REMARKS(struct.getList_l_APPR_REMARKS());
			this.setList_l_PROJECT_CD(struct.getList_l_PROJECT_CD());
			this.setList_l_ESTIMATE_NO(struct.getList_l_ESTIMATE_NO());
			this.setList_l_DETAL_NO(struct.getList_l_DETAL_NO());
			this.setList_l_ODR_CTL_NO(struct.getList_l_ODR_CTL_NO());
			this.setList_l_CUST_CD(struct.getList_l_CUST_CD());
			this.setList_l_CUST_ITEM_CD(struct.getList_l_CUST_ITEM_CD());
			this.setList_l_ITEM_CD(struct.getList_l_ITEM_CD());
			this.setList_l_CUST_ITEM_NAME(struct.getList_l_CUST_ITEM_NAME());
			this.setList_l_ITEM_NAME(struct.getList_l_ITEM_NAME());
			this.setList_l_ODR_NO(struct.getList_l_ODR_NO());
			this.setList_l_ODR_TYP(struct.getList_l_ODR_TYP());
			this.setList_l_CUST_ODR_NO(struct.getList_l_CUST_ODR_NO());
			this.setList_l_CUST_CHRG_ORG_CD(struct.getList_l_CUST_CHRG_ORG_CD());
			this.setList_l_CUST_CHRG_PSN_CD(struct.getList_l_CUST_CHRG_PSN_CD());
			this.setList_l_ODR_ACPT_ORG_CD(struct.getList_l_ODR_ACPT_ORG_CD());
			this.setList_l_ODR_ACPT_PSN_CD(struct.getList_l_ODR_ACPT_PSN_CD());
			this.setList_l_CURRNCY_CD(struct.getList_l_CURRNCY_CD());
			this.setList_l_EXCH_TYP(struct.getList_l_EXCH_TYP());
			this.setList_l_DLV_LOC_CD(struct.getList_l_DLV_LOC_CD());
			this.setList_l_DLV_LOC_NAME_KANJI(struct.getList_l_DLV_LOC_NAME_KANJI());
			this.setList_l_ODR_UNIT_PRICE(struct.getList_l_ODR_UNIT_PRICE());
			this.setList_l_SPCL_PRICE_TYP(struct.getList_l_SPCL_PRICE_TYP());
			this.setList_l_DEPO_TYP(struct.getList_l_DEPO_TYP());
			this.setList_l_DESINATED_DLV_DATE(struct.getList_l_DESINATED_DLV_DATE());
			this.setList_l_STD_DESINATED_RCV_DATE(struct.getList_l_STD_DESINATED_RCV_DATE());
			this.setList_l_ODR_QTY(struct.getList_l_ODR_QTY());
			this.setList_l_REMAIN_UNCONFIRM_ODR_QTY(struct.getList_l_REMAIN_UNCONFIRM_ODR_QTY());
			this.setList_l_UNIT_CD(struct.getList_l_UNIT_CD());
			this.setList_l_UNCONFIRM_ODR_BALANCE(struct.getList_l_UNCONFIRM_ODR_BALANCE());
			this.setList_l_ODR_AMOUNT(struct.getList_l_ODR_AMOUNT());
			this.setList_l_ODR_AMOUNT_EXCH_RATES(struct.getList_l_ODR_AMOUNT_EXCH_RATES());
			this.setList_l_TRANSPORT_CD(struct.getList_l_TRANSPORT_CD());
			this.setList_l_TRANSPORT_TYP(struct.getList_l_TRANSPORT_TYP());
			this.setList_l_TAX_APPLY_TYP(struct.getList_l_TAX_APPLY_TYP());
			this.setList_l_TAX_CD(struct.getList_l_TAX_CD());
			this.setList_l_TAX_CALC_TYP(struct.getList_l_TAX_CALC_TYP());
			this.setList_l_REMARKS(struct.getList_l_REMARKS());
			this.setList_l_ODR_ACPT_DATE(struct.getList_l_ODR_ACPT_DATE());
			this.setList_l_SHIP_PLAN_REMAIN_QTY(struct.getList_l_SHIP_PLAN_REMAIN_QTY());
			this.setList_l_PARTIAL_SHIP_INST_FLG(struct.getList_l_PARTIAL_SHIP_INST_FLG());
			this.setList_PART_NAME(struct.getList_PART_NAME());
			this.setList_l_RSLT_CTL_SEQ_CD(struct.getList_l_RSLT_CTL_SEQ_CD());
			this.setList_l_UNIT(struct.getList_l_UNIT());
			this.setList_l_DLV_PLACE_CD(struct.getList_l_DLV_PLACE_CD());
			this.setList_l_UNIT_PRICE(struct.getList_l_UNIT_PRICE());
			this.setList_l_CUR_CD(struct.getList_l_CUR_CD());
			this.setList_l_SPCL_PRICE_CO(struct.getList_l_SPCL_PRICE_CO());
			this.setList_l_CUST_DLV_CD(struct.getList_l_CUST_DLV_CD());
			this.setList_l_CUST_DLV_KEY_CD(struct.getList_l_CUST_DLV_KEY_CD());
			this.setList_l_FIXED_ODR_NO(struct.getList_l_FIXED_ODR_NO());
			this.setList_l_ALCTED_SEQ_CD(struct.getList_l_ALCTED_SEQ_CD());
			this.setList_l_ALCTED_UNCONFIRM_ODR_NO(struct.getList_l_ALCTED_UNCONFIRM_ODR_NO());
			this.setList_l_ALCTED_UNCONFIRM_ODR_QTY(struct.getList_l_ALCTED_UNCONFIRM_ODR_QTY());
			this.setList_l_LAST_ANS_DLV_DATE_RCD(struct.getList_l_LAST_ANS_DLV_DATE_RCD());
			this.setList_l_DESINATED_SHIP_DATE(struct.getList_l_DESINATED_SHIP_DATE());
			this.setList_l_DESINATED_SHIP_QTY(struct.getList_l_DESINATED_SHIP_QTY());
			this.setList_l_REST_SHIP_ODR_QTY(struct.getList_l_REST_SHIP_ODR_QTY());
			this.setList_l_CUST_ANAME(struct.getList_l_CUST_ANAME());
			this.setList_l_OWN_ORG_CD(struct.getList_l_OWN_ORG_CD());
			this.setList_l_OWN_PERSON_CD(struct.getList_l_OWN_PERSON_CD());
			this.setList_l_DETAIL_ROUND_TYP(struct.getList_l_DETAIL_ROUND_TYP());
			this.setList_l_COMPANY_CD(struct.getList_l_COMPANY_CD());
			this.setList_l_DLV_LOC_NAME(struct.getList_l_DLV_LOC_NAME());
			this.setList_l_TRANSPORT_LT(struct.getList_l_TRANSPORT_LT());
			this.setList_l_DEPO_WH_CD(struct.getList_l_DEPO_WH_CD());
			this.setList_l_SHIP_WH_CD(struct.getList_l_SHIP_WH_CD());
			this.setList_h_SHIP_PLANT_CD(struct.getList_h_SHIP_PLANT_CD());
			this.setList_l_UNIT_COST(struct.getList_l_UNIT_COST());
			this.setList_l_EFF_PHASE_IN_DATE(struct.getList_l_EFF_PHASE_IN_DATE());
			this.setList_l_STOCK_UNIT(struct.getList_l_STOCK_UNIT());
			this.setList_l_UNIT_QTY_TYP(struct.getList_l_UNIT_QTY_TYP());
			this.setList_h_MRP_ODR_TYP(struct.getList_h_MRP_ODR_TYP());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_CODE(struct.getList_CODE());
			this.setList_CLASS_CODE(struct.getList_CLASS_CODE());
			this.setList_HOME_CUR_CD(struct.getList_HOME_CUR_CD());
			this.setList_BUSINESS_OPR_DATE(struct.getList_BUSINESS_OPR_DATE());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_l_CUR_UNIT(struct.getList_l_CUR_UNIT());
			this.setList_h_PRD_REQ_JOB_ODR_TYP_1(struct.getList_h_PRD_REQ_JOB_ODR_TYP_1());
			this.setList_h_PRD_REQ_JOB_ODR_TYP_2(struct.getList_h_PRD_REQ_JOB_ODR_TYP_2());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_l_JOB_ODR_CD(struct.getList_l_JOB_ODR_CD());
			this.setList_l_JOB_ODR_DLV_DATE(struct.getList_l_JOB_ODR_DLV_DATE());
			this.setList_JOB_OD_CD(struct.getList_JOB_OD_CD());
			this.setList_JOB_OD_CD_PREFIX(struct.getList_JOB_OD_CD_PREFIX());
			this.setList_l_JOB_ODR_SET_FLG(struct.getList_l_JOB_ODR_SET_FLG());
			this.setList_l_JOB_ODR_QTY(struct.getList_l_JOB_ODR_QTY());
			this.setList_l_ALC_GRP_CD(struct.getList_l_ALC_GRP_CD());
			this.setList_l_ALCD_QTY(struct.getList_l_ALCD_QTY());
			this.setList_OD_CALC_FLG(struct.getList_OD_CALC_FLG());
			this.setList_TAX_CD(struct.getList_TAX_CD());
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
	// �� 1 �ϐ������l�F i_l_NO


	final static String i_l_NO = null;

	// �� 2 �ϐ������l�F i_l_ODR_TYP_DN


	final static String i_l_ODR_TYP_DN = null;

	// �� 3 �ϐ������l�F i_l_SPCL_PRICE_TYP_DN


	final static String i_l_SPCL_PRICE_TYP_DN = null;

	// �� 4 �ϐ������l�F i_l_DEPO_TYP_DN


	final static String i_l_DEPO_TYP_DN = null;

	// �� 5 �ϐ������l�F i_ODR_TYP


	final static String i_ODR_TYP = null;

	// �� 6 �ϐ������l�F i_ODR_TYP_name


	final static String i_ODR_TYP_name = null;

	// �� 7 �ϐ������l�F i_ODR_TYP_val


	final static String i_ODR_TYP_val = null;

	// �� 8 �ϐ������l�F i_NO


	final static String i_NO = null;

	// �� 9 �ϐ������l�F i_CUST_ODR_NO


	final static String i_CUST_ODR_NO = null;

	// �� 10 �ϐ������l�F i_CUST_ITEM_CD


	final static String i_CUST_ITEM_CD = null;

	// �� 11 �ϐ������l�F i_CUST_CD


	final static String i_CUST_CD = null;

	// �� 12 �ϐ������l�F i_DLV_LOC_CD


	final static String i_DLV_LOC_CD = null;

	// �� 13 �ϐ������l�F i_DESINATED_DLV_DATE


	final static String i_DESINATED_DLV_DATE = null;

	// �� 14 �ϐ������l�F i_ODR_QTY


	final static String i_ODR_QTY = null;

	// �� 15 �ϐ������l�F i_ODR_UNIT_PRICE


	final static String i_ODR_UNIT_PRICE = null;

	// �� 16 �ϐ������l�F i_SPCL_PRICE_TYP


	final static String i_SPCL_PRICE_TYP = null;

	// �� 17 �ϐ������l�F i_SPCL_PRICE_TYP_name


	final static String i_SPCL_PRICE_TYP_name = null;

	// �� 18 �ϐ������l�F i_SPCL_PRICE_TYP_val


	final static String i_SPCL_PRICE_TYP_val = null;

	// �� 19 �ϐ������l�F i_REMARKS


	final static String i_REMARKS = null;

	// �� 20 �ϐ������l�F i_ODR_ACPT_DATE


	final static String i_ODR_ACPT_DATE = null;

	// �� 21 �ϐ������l�F i_h_BUSINESS_OPR_DATE


	final static String i_h_BUSINESS_OPR_DATE = null;

	// �� 22 �ϐ������l�F i_c_DOODR


	final static String i_c_DOODR = null;

	// �� 23 �ϐ������l�F i_JOB_ODR_QTY


	final static String i_JOB_ODR_QTY = null;

	// �� 24 �ϐ������l�F i_JOB_ODR_DLV_DATE


	final static String i_JOB_ODR_DLV_DATE = null;

	// �� 25 �ϐ������l�F i_ALC_GRP_CD


	final static String i_ALC_GRP_CD = null;

	// �� 26 �ϐ������l�F i_c_INPUTODRCD


	final static String i_c_INPUTODRCD = null;

	// �� 27 �ϐ������l�F i_h_DOODRFLG


	final static String i_h_DOODRFLG = null;

	// �� 28 �ϐ������l�F i_h_INPUTODRCDFLG


	final static String i_h_INPUTODRCDFLG = null;

	// �� 29 �ϐ������l�F i_h_CHECK_STATUS


	final static String i_h_CHECK_STATUS = null;

	// �� 30 �ϐ������l�F i_h_APR_ODR


	final static String i_h_APR_ODR = null;

	// �� 31 �ϐ������l�F i_APPR_REMARKS


	final static String i_APPR_REMARKS = null;

	// �� 32 �ϐ������l�F i_l_APPR_REMARKS


	final static String i_l_APPR_REMARKS = null;

	// �� 33 �ϐ������l�F i_l_PROJECT_CD


	final static String i_l_PROJECT_CD = null;

	// �� 34 �ϐ������l�F i_l_ESTIMATE_NO


	final static String i_l_ESTIMATE_NO = null;

	// �� 35 �ϐ������l�F i_l_DETAL_NO


	final static String i_l_DETAL_NO = null;

	// �� 36 �ϐ������l�F i_l_ODR_CTL_NO


	final static String i_l_ODR_CTL_NO = null;

	// �� 37 �ϐ������l�F i_l_CUST_CD


	final static String i_l_CUST_CD = null;

	// �� 38 �ϐ������l�F i_l_CUST_ITEM_CD


	final static String i_l_CUST_ITEM_CD = null;

	// �� 39 �ϐ������l�F i_l_ITEM_CD


	final static String i_l_ITEM_CD = null;

	// �� 40 �ϐ������l�F i_l_CUST_ITEM_NAME


	final static String i_l_CUST_ITEM_NAME = null;

	// �� 41 �ϐ������l�F i_l_ITEM_NAME


	final static String i_l_ITEM_NAME = null;

	// �� 42 �ϐ������l�F i_l_ODR_NO


	final static String i_l_ODR_NO = null;

	// �� 43 �ϐ������l�F i_l_ODR_TYP


	final static String i_l_ODR_TYP = null;

	// �� 44 �ϐ������l�F i_l_CUST_ODR_NO


	final static String i_l_CUST_ODR_NO = null;

	// �� 45 �ϐ������l�F i_l_CUST_CHRG_ORG_CD


	final static String i_l_CUST_CHRG_ORG_CD = null;

	// �� 46 �ϐ������l�F i_l_CUST_CHRG_PSN_CD


	final static String i_l_CUST_CHRG_PSN_CD = null;

	// �� 47 �ϐ������l�F i_l_ODR_ACPT_ORG_CD


	final static String i_l_ODR_ACPT_ORG_CD = null;

	// �� 48 �ϐ������l�F i_l_ODR_ACPT_PSN_CD


	final static String i_l_ODR_ACPT_PSN_CD = null;

	// �� 49 �ϐ������l�F i_l_CURRNCY_CD


	final static String i_l_CURRNCY_CD = null;

	// �� 50 �ϐ������l�F i_l_EXCH_TYP


	final static String i_l_EXCH_TYP = null;

	// �� 51 �ϐ������l�F i_l_DLV_LOC_CD


	final static String i_l_DLV_LOC_CD = null;

	// �� 52 �ϐ������l�F i_l_DLV_LOC_NAME_KANJI


	final static String i_l_DLV_LOC_NAME_KANJI = null;

	// �� 53 �ϐ������l�F i_l_ODR_UNIT_PRICE


	final static String i_l_ODR_UNIT_PRICE = null;

	// �� 54 �ϐ������l�F i_l_SPCL_PRICE_TYP


	final static String i_l_SPCL_PRICE_TYP = null;

	// �� 55 �ϐ������l�F i_l_DEPO_TYP


	final static String i_l_DEPO_TYP = null;

	// �� 56 �ϐ������l�F i_l_DESINATED_DLV_DATE


	final static String i_l_DESINATED_DLV_DATE = null;

	// �� 57 �ϐ������l�F i_l_STD_DESINATED_RCV_DATE


	final static String i_l_STD_DESINATED_RCV_DATE = null;

	// �� 58 �ϐ������l�F i_l_ODR_QTY


	final static String i_l_ODR_QTY = null;

	// �� 59 �ϐ������l�F i_l_REMAIN_UNCONFIRM_ODR_QTY


	final static String i_l_REMAIN_UNCONFIRM_ODR_QTY = null;

	// �� 60 �ϐ������l�F i_l_UNIT_CD


	final static String i_l_UNIT_CD = null;

	// �� 61 �ϐ������l�F i_l_UNCONFIRM_ODR_BALANCE


	final static String i_l_UNCONFIRM_ODR_BALANCE = null;

	// �� 62 �ϐ������l�F i_l_ODR_AMOUNT


	final static String i_l_ODR_AMOUNT = null;

	// �� 63 �ϐ������l�F i_l_ODR_AMOUNT_EXCH_RATES


	final static String i_l_ODR_AMOUNT_EXCH_RATES = null;

	// �� 64 �ϐ������l�F i_l_TRANSPORT_CD


	final static String i_l_TRANSPORT_CD = null;

	// �� 65 �ϐ������l�F i_l_TRANSPORT_TYP


	final static String i_l_TRANSPORT_TYP = null;

	// �� 66 �ϐ������l�F i_l_TAX_APPLY_TYP


	final static String i_l_TAX_APPLY_TYP = null;

	// �� 67 �ϐ������l�F i_l_TAX_CD


	final static String i_l_TAX_CD = null;

	// �� 68 �ϐ������l�F i_l_TAX_CALC_TYP


	final static String i_l_TAX_CALC_TYP = null;

	// �� 69 �ϐ������l�F i_l_REMARKS


	final static String i_l_REMARKS = null;

	// �� 70 �ϐ������l�F i_l_ODR_ACPT_DATE


	final static String i_l_ODR_ACPT_DATE = null;

	// �� 71 �ϐ������l�F i_l_SHIP_PLAN_REMAIN_QTY


	final static String i_l_SHIP_PLAN_REMAIN_QTY = null;

	// �� 72 �ϐ������l�F i_l_PARTIAL_SHIP_INST_FLG


	final static String i_l_PARTIAL_SHIP_INST_FLG = null;

	// �� 73 �ϐ������l�F i_PART_NAME


	final static String i_PART_NAME = null;

	// �� 74 �ϐ������l�F i_l_RSLT_CTL_SEQ_CD


	final static String i_l_RSLT_CTL_SEQ_CD = null;

	// �� 75 �ϐ������l�F i_l_UNIT


	final static String i_l_UNIT = null;

	// �� 76 �ϐ������l�F i_l_DLV_PLACE_CD


	final static String i_l_DLV_PLACE_CD = null;

	// �� 77 �ϐ������l�F i_l_UNIT_PRICE


	final static String i_l_UNIT_PRICE = null;

	// �� 78 �ϐ������l�F i_l_CUR_CD


	final static String i_l_CUR_CD = null;

	// �� 79 �ϐ������l�F i_l_SPCL_PRICE_CO


	final static String i_l_SPCL_PRICE_CO = null;

	// �� 80 �ϐ������l�F i_l_CUST_DLV_CD


	final static String i_l_CUST_DLV_CD = null;

	// �� 81 �ϐ������l�F i_l_CUST_DLV_KEY_CD


	final static String i_l_CUST_DLV_KEY_CD = null;

	// �� 82 �ϐ������l�F i_l_FIXED_ODR_NO


	final static String i_l_FIXED_ODR_NO = null;

	// �� 83 �ϐ������l�F i_l_ALCTED_SEQ_CD


	final static String i_l_ALCTED_SEQ_CD = null;

	// �� 84 �ϐ������l�F i_l_ALCTED_UNCONFIRM_ODR_NO


	final static String i_l_ALCTED_UNCONFIRM_ODR_NO = null;

	// �� 85 �ϐ������l�F i_l_ALCTED_UNCONFIRM_ODR_QTY


	final static String i_l_ALCTED_UNCONFIRM_ODR_QTY = null;

	// �� 86 �ϐ������l�F i_l_LAST_ANS_DLV_DATE_RCD


	final static String i_l_LAST_ANS_DLV_DATE_RCD = null;

	// �� 87 �ϐ������l�F i_l_DESINATED_SHIP_DATE


	final static String i_l_DESINATED_SHIP_DATE = null;

	// �� 88 �ϐ������l�F i_l_DESINATED_SHIP_QTY


	final static String i_l_DESINATED_SHIP_QTY = null;

	// �� 89 �ϐ������l�F i_l_REST_SHIP_ODR_QTY


	final static String i_l_REST_SHIP_ODR_QTY = null;

	// �� 90 �ϐ������l�F i_l_CUST_ANAME


	final static String i_l_CUST_ANAME = null;

	// �� 91 �ϐ������l�F i_l_OWN_ORG_CD


	final static String i_l_OWN_ORG_CD = null;

	// �� 92 �ϐ������l�F i_l_OWN_PERSON_CD


	final static String i_l_OWN_PERSON_CD = null;

	// �� 93 �ϐ������l�F i_l_DETAIL_ROUND_TYP


	final static String i_l_DETAIL_ROUND_TYP = null;

	// �� 94 �ϐ������l�F i_l_COMPANY_CD


	final static String i_l_COMPANY_CD = null;

	// �� 95 �ϐ������l�F i_l_DLV_LOC_NAME


	final static String i_l_DLV_LOC_NAME = null;

	// �� 96 �ϐ������l�F i_l_TRANSPORT_LT


	final static String i_l_TRANSPORT_LT = null;

	// �� 97 �ϐ������l�F i_l_DEPO_WH_CD


	final static String i_l_DEPO_WH_CD = null;

	// �� 98 �ϐ������l�F i_l_SHIP_WH_CD


	final static String i_l_SHIP_WH_CD = null;

	// �� 99 �ϐ������l�F i_h_SHIP_PLANT_CD


	final static String i_h_SHIP_PLANT_CD = null;

	// �� 100 �ϐ������l�F i_l_UNIT_COST


	final static String i_l_UNIT_COST = null;

	// �� 101 �ϐ������l�F i_l_EFF_PHASE_IN_DATE


	final static String i_l_EFF_PHASE_IN_DATE = null;

	// �� 102 �ϐ������l�F i_l_STOCK_UNIT


	final static String i_l_STOCK_UNIT = null;

	// �� 103 �ϐ������l�F i_l_UNIT_QTY_TYP


	final static String i_l_UNIT_QTY_TYP = null;

	// �� 104 �ϐ������l�F i_h_MRP_ODR_TYP


	final static String i_h_MRP_ODR_TYP = null;

	// �� 105 �ϐ������l�F i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// �� 106 �ϐ������l�F i_CODE


	final static String i_CODE = null;

	// �� 107 �ϐ������l�F i_CLASS_CODE


	final static String i_CLASS_CODE = null;

	// �� 108 �ϐ������l�F i_HOME_CUR_CD


	final static String i_HOME_CUR_CD = null;

	// �� 109 �ϐ������l�F i_BUSINESS_OPR_DATE


	final static String i_BUSINESS_OPR_DATE = null;

	// �� 110 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 111 �ϐ������l�F i_l_CUR_UNIT


	final static String i_l_CUR_UNIT = null;

	// �� 112 �ϐ������l�F i_h_PRD_REQ_JOB_ODR_TYP_1


	final static String i_h_PRD_REQ_JOB_ODR_TYP_1 = null;

	// �� 113 �ϐ������l�F i_h_PRD_REQ_JOB_ODR_TYP_2


	final static String i_h_PRD_REQ_JOB_ODR_TYP_2 = null;

	// �� 114 �ϐ������l�F i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// �� 115 �ϐ������l�F i_l_JOB_ODR_CD


	final static String i_l_JOB_ODR_CD = null;

	// �� 116 �ϐ������l�F i_l_JOB_ODR_DLV_DATE


	final static String i_l_JOB_ODR_DLV_DATE = null;

	// �� 117 �ϐ������l�F i_JOB_OD_CD


	final static String i_JOB_OD_CD = null;

	// �� 118 �ϐ������l�F i_JOB_OD_CD_PREFIX


	final static String i_JOB_OD_CD_PREFIX = null;

	// �� 119 �ϐ������l�F i_l_JOB_ODR_SET_FLG


	final static String i_l_JOB_ODR_SET_FLG = null;

	// �� 120 �ϐ������l�F i_l_JOB_ODR_QTY


	final static String i_l_JOB_ODR_QTY = null;

	// �� 121 �ϐ������l�F i_l_ALC_GRP_CD


	final static String i_l_ALC_GRP_CD = null;

	// �� 122 �ϐ������l�F i_l_ALCD_QTY


	final static String i_l_ALCD_QTY = null;

	// �� 123 �ϐ������l�F i_OD_CALC_FLG


	final static String i_OD_CALC_FLG = null;

	// �� 124 �ϐ������l�F i_TAX_CD


	final static String i_TAX_CD = null;

*/

	//{{user_implement_code
		// TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
		// �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
	// �� 1 �ϐ������l�F i_l_NO

	final static String i_l_NO = null;

	// �� 2 �ϐ������l�F i_l_ODR_TYP_DN

	final static String i_l_ODR_TYP_DN = null;

	// �� 3 �ϐ������l�F i_l_SPCL_PRICE_TYP_DN

	final static String i_l_SPCL_PRICE_TYP_DN = null;

	// �� 4 �ϐ������l�F i_l_DEPO_TYP_DN

	final static String i_l_DEPO_TYP_DN = null;

	// �� 5 �ϐ������l�F i_ODR_TYP

	final static String i_ODR_TYP = null;

	// �� 6 �ϐ������l�F i_ODR_TYP_name

	final static String i_ODR_TYP_name = null;

	// �� 7 �ϐ������l�F i_ODR_TYP_val

	final static String i_ODR_TYP_val = null;

	// �� 8 �ϐ������l�F i_NO

	final static String i_NO = null;

	// �� 9 �ϐ������l�F i_CUST_ODR_NO

	final static String i_CUST_ODR_NO = null;

	// �� 10 �ϐ������l�F i_CUST_ITEM_CD

	final static String i_CUST_ITEM_CD = null;

	// �� 11 �ϐ������l�F i_CUST_CD

	final static String i_CUST_CD = null;

	// �� 12 �ϐ������l�F i_DLV_LOC_CD

	final static String i_DLV_LOC_CD = null;

	// �� 13 �ϐ������l�F i_DESINATED_DLV_DATE

	final static String i_DESINATED_DLV_DATE = null;

	// �� 14 �ϐ������l�F i_ODR_QTY

	final static String i_ODR_QTY = null;

	// �� 15 �ϐ������l�F i_ODR_UNIT_PRICE

	final static String i_ODR_UNIT_PRICE = null;

	// �� 16 �ϐ������l�F i_SPCL_PRICE_TYP

	final static String i_SPCL_PRICE_TYP = null;

	// �� 17 �ϐ������l�F i_SPCL_PRICE_TYP_name

	final static String i_SPCL_PRICE_TYP_name = null;

	// �� 18 �ϐ������l�F i_SPCL_PRICE_TYP_val

	final static String i_SPCL_PRICE_TYP_val = null;

	// �� 19 �ϐ������l�F i_REMARKS

	final static String i_REMARKS = null;

	// �� 20 �ϐ������l�F i_ODR_ACPT_DATE

	final static String i_ODR_ACPT_DATE = null;

	// �� 21 �ϐ������l�F i_h_BUSINESS_OPR_DATE

	final static String i_h_BUSINESS_OPR_DATE = null;

	// �� 22 �ϐ������l�F i_c_DOODR

	final static String i_c_DOODR = null;

	// �� 23 �ϐ������l�F i_JOB_ODR_QTY

	final static String i_JOB_ODR_QTY = null;

	// �� 24 �ϐ������l�F i_JOB_ODR_DLV_DATE

	final static String i_JOB_ODR_DLV_DATE = null;

	// �� 25 �ϐ������l�F i_ALC_GRP_CD

	final static String i_ALC_GRP_CD = null;

	// �� 26 �ϐ������l�F i_c_INPUTODRCD

	final static String i_c_INPUTODRCD = null;

	// �� 27 �ϐ������l�F i_l_JOB_ODR_QTY

	final static String i_l_JOB_ODR_QTY = null;

	// �� 28 �ϐ������l�F i_l_JOB_ODR_DLV_DATE

	final static String i_l_JOB_ODR_DLV_DATE = null;

	// �� 29 �ϐ������l�F i_l_ALC_GRP_CD

	final static String i_l_ALC_GRP_CD = null;

	// �� 30 �ϐ������l�F i_h_DOODRFLG

	final static String i_h_DOODRFLG = null;

	// �� 31 �ϐ������l�F i_h_INPUTODRCDFLG

	final static String i_h_INPUTODRCDFLG = null;

	// �� 32 �ϐ������l�F i_h_CHECK_STATUS

	final static String i_h_CHECK_STATUS = null;

	// �� 33 �ϐ������l�F i_l_ODR_CTL_NO

	final static String i_l_ODR_CTL_NO = null;

	// �� 34 �ϐ������l�F i_l_CUST_CD

	final static String i_l_CUST_CD = null;

	// �� 35 �ϐ������l�F i_l_CUST_ITEM_CD

	final static String i_l_CUST_ITEM_CD = null;

	// �� 36 �ϐ������l�F i_l_ITEM_CD

	final static String i_l_ITEM_CD = null;

	// �� 37 �ϐ������l�F i_l_CUST_ITEM_NAME

	final static String i_l_CUST_ITEM_NAME = null;

	// �� 38 �ϐ������l�F i_l_ITEM_NAME

	final static String i_l_ITEM_NAME = null;

	// �� 39 �ϐ������l�F i_l_ODR_NO

	final static String i_l_ODR_NO = null;

	// �� 40 �ϐ������l�F i_l_ODR_TYP

	final static String i_l_ODR_TYP = null;

	// �� 41 �ϐ������l�F i_l_CUST_ODR_NO

	final static String i_l_CUST_ODR_NO = null;

	// �� 42 �ϐ������l�F i_l_CUST_CHRG_ORG_CD

	final static String i_l_CUST_CHRG_ORG_CD = null;

	// �� 43 �ϐ������l�F i_l_CUST_CHRG_PSN_CD

	final static String i_l_CUST_CHRG_PSN_CD = null;

	// �� 44 �ϐ������l�F i_l_ODR_ACPT_ORG_CD

	final static String i_l_ODR_ACPT_ORG_CD = null;

	// �� 45 �ϐ������l�F i_l_ODR_ACPT_PSN_CD

	final static String i_l_ODR_ACPT_PSN_CD = null;

	// �� 46 �ϐ������l�F i_l_CURRNCY_CD

	final static String i_l_CURRNCY_CD = null;

	// �� 47 �ϐ������l�F i_l_EXCH_TYP

	final static String i_l_EXCH_TYP = null;

	// �� 48 �ϐ������l�F i_l_DLV_LOC_CD

	final static String i_l_DLV_LOC_CD = null;

	// �� 49 �ϐ������l�F i_l_DLV_LOC_NAME_KANJI

	final static String i_l_DLV_LOC_NAME_KANJI = null;

	// �� 50 �ϐ������l�F i_l_ODR_UNIT_PRICE

	final static String i_l_ODR_UNIT_PRICE = null;

	// �� 51 �ϐ������l�F i_l_SPCL_PRICE_TYP

	final static String i_l_SPCL_PRICE_TYP = null;

	// �� 52 �ϐ������l�F i_l_DEPO_TYP

	final static String i_l_DEPO_TYP = null;

	// �� 53 �ϐ������l�F i_l_DESINATED_DLV_DATE

	final static String i_l_DESINATED_DLV_DATE = null;

	// �� 54 �ϐ������l�F i_l_STD_DESINATED_RCV_DATE

	final static String i_l_STD_DESINATED_RCV_DATE = null;

	// �� 55 �ϐ������l�F i_l_ODR_QTY

	final static String i_l_ODR_QTY = null;

	// �� 56 �ϐ������l�F i_l_REMAIN_UNCONFIRM_ODR_QTY

	final static String i_l_REMAIN_UNCONFIRM_ODR_QTY = null;

	// �� 57 �ϐ������l�F i_l_UNIT_CD

	final static String i_l_UNIT_CD = null;

	// �� 58 �ϐ������l�F i_l_UNCONFIRM_ODR_BALANCE

	final static String i_l_UNCONFIRM_ODR_BALANCE = null;

	// �� 59 �ϐ������l�F i_l_ODR_AMOUNT

	final static String i_l_ODR_AMOUNT = null;

	// �� 60 �ϐ������l�F i_l_ODR_AMOUNT_EXCH_RATES

	final static String i_l_ODR_AMOUNT_EXCH_RATES = null;

	// �� 61 �ϐ������l�F i_l_TRANSPORT_CD

	final static String i_l_TRANSPORT_CD = null;

	// �� 62 �ϐ������l�F i_l_TRANSPORT_TYP

	final static String i_l_TRANSPORT_TYP = null;

	// �� 63 �ϐ������l�F i_l_TAX_APPLY_TYP

	final static String i_l_TAX_APPLY_TYP = null;

	// �� 64 �ϐ������l�F i_l_TAX_CD

	final static String i_l_TAX_CD = null;

	// �� 65 �ϐ������l�F i_l_TAX_CALC_TYP

	final static String i_l_TAX_CALC_TYP = null;

	// �� 66 �ϐ������l�F i_l_REMARKS

	final static String i_l_REMARKS = null;

	// �� 67 �ϐ������l�F i_l_ODR_ACPT_DATE

	final static String i_l_ODR_ACPT_DATE = null;

	// �� 68 �ϐ������l�F i_l_SHIP_PLAN_REMAIN_QTY

	final static String i_l_SHIP_PLAN_REMAIN_QTY = null;

	// �� 69 �ϐ������l�F i_l_PARTIAL_SHIP_INST_FLG

	final static String i_l_PARTIAL_SHIP_INST_FLG = null;

	// �� 70 �ϐ������l�F i_l_RSLT_CTL_SEQ_CD

	final static String i_l_RSLT_CTL_SEQ_CD = null;

	// �� 71 �ϐ������l�F i_l_UNIT

	final static String i_l_UNIT = null;

	// �� 72 �ϐ������l�F i_l_DLV_PLACE_CD

	final static String i_l_DLV_PLACE_CD = null;

	// �� 73 �ϐ������l�F i_l_UNIT_PRICE

	final static String i_l_UNIT_PRICE = null;

	// �� 74 �ϐ������l�F i_l_CUR_CD

	final static String i_l_CUR_CD = null;

	// �� 75 �ϐ������l�F i_l_SPCL_PRICE_CO

	final static String i_l_SPCL_PRICE_CO = null;

	// �� 76 �ϐ������l�F i_l_CUST_DLV_CD

	final static String i_l_CUST_DLV_CD = null;

	// �� 77 �ϐ������l�F i_l_CUST_DLV_KEY_CD

	final static String i_l_CUST_DLV_KEY_CD = null;

	// �� 78 �ϐ������l�F i_l_FIXED_ODR_NO

	final static String i_l_FIXED_ODR_NO = null;

	// �� 79 �ϐ������l�F i_l_ALCTED_SEQ_CD

	final static String i_l_ALCTED_SEQ_CD = null;

	// �� 80 �ϐ������l�F i_l_ALCTED_UNCONFIRM_ODR_NO

	final static String i_l_ALCTED_UNCONFIRM_ODR_NO = null;

	// �� 81 �ϐ������l�F i_l_ALCTED_UNCONFIRM_ODR_QTY

	final static String i_l_ALCTED_UNCONFIRM_ODR_QTY = null;

	// �� 82 �ϐ������l�F i_l_LAST_ANS_DLV_DATE_RCD

	final static String i_l_LAST_ANS_DLV_DATE_RCD = null;

	// �� 83 �ϐ������l�F i_l_DESINATED_SHIP_DATE

	final static String i_l_DESINATED_SHIP_DATE = null;

	// �� 84 �ϐ������l�F i_l_DESINATED_SHIP_QTY

	final static String i_l_DESINATED_SHIP_QTY = null;

	// �� 85 �ϐ������l�F i_l_REST_SHIP_ODR_QTY

	final static String i_l_REST_SHIP_ODR_QTY = null;

	// �� 86 �ϐ������l�F i_l_CUST_ANAME

	final static String i_l_CUST_ANAME = null;

	// �� 87 �ϐ������l�F i_l_OWN_ORG_CD

	final static String i_l_OWN_ORG_CD = null;

	// �� 88 �ϐ������l�F i_l_OWN_PERSON_CD

	final static String i_l_OWN_PERSON_CD = null;

	// �� 89 �ϐ������l�F i_l_DETAIL_ROUND_TYP

	final static String i_l_DETAIL_ROUND_TYP = null;

	// �� 90 �ϐ������l�F i_l_COMPANY_CD

	final static String i_l_COMPANY_CD = null;

	// �� 91 �ϐ������l�F i_l_DLV_LOC_NAME

	final static String i_l_DLV_LOC_NAME = null;

	// �� 92 �ϐ������l�F i_l_TRANSPORT_LT

	final static String i_l_TRANSPORT_LT = null;

	// �� 93 �ϐ������l�F i_l_DEPO_WH_CD

	final static String i_l_DEPO_WH_CD = null;

	// �� 94 �ϐ������l�F i_l_SHIP_WH_CD

	final static String i_l_SHIP_WH_CD = null;

	// �� 95 �ϐ������l�F i_h_SHIP_PLANT_CD

	final static String i_h_SHIP_PLANT_CD = null;

	// �� 96 �ϐ������l�F i_l_UNIT_COST

	final static String i_l_UNIT_COST = null;

	// �� 97 �ϐ������l�F i_l_EFF_PHASE_IN_DATE

	final static String i_l_EFF_PHASE_IN_DATE = null;

	// �� 98 �ϐ������l�F i_l_STOCK_UNIT

	final static String i_l_STOCK_UNIT = null;

	// �� 99 �ϐ������l�F i_l_UNIT_QTY_TYP

	final static String i_l_UNIT_QTY_TYP = null;

	// �� 100 �ϐ������l�F i_h_MRP_ODR_TYP

	final static String i_h_MRP_ODR_TYP = null;

	// �� 101 �ϐ������l�F i_COMPANY_CD

	final static String i_COMPANY_CD = null;

	// �� 102 �ϐ������l�F i_CODE

	final static String i_CODE = null;

	// �� 103 �ϐ������l�F i_CLASS_CODE

	final static String i_CLASS_CODE = null;

	// �� 104 �ϐ������l�F i_HOME_CUR_CD

	final static String i_HOME_CUR_CD = null;

	// �� 105 �ϐ������l�F i_BUSINESS_OPR_DATE

	final static String i_BUSINESS_OPR_DATE = null;

	// �� 106 �ϐ������l�F i_PLANT_CD

	final static String i_PLANT_CD = null;

	// �� 107 �ϐ������l�F i_l_CUR_UNIT

	final static String i_l_CUR_UNIT = null;

	// �� 108 �ϐ������l�F i_h_PRD_REQ_JOB_ODR_TYP_1

	final static String i_h_PRD_REQ_JOB_ODR_TYP_1 = null;

	// �� 109 �ϐ������l�F i_h_PRD_REQ_JOB_ODR_TYP_2

	final static String i_h_PRD_REQ_JOB_ODR_TYP_2 = null;

	// �� 110 �ϐ������l�F i_JOB_ODR_CD

	final static String i_JOB_ODR_CD = null;

	// �� 111 �ϐ������l�F i_l_JOB_ODR_CD

	final static String i_l_JOB_ODR_CD = null;


	/**
	 * ������
	 *
	 */
	public void initialize()
	{

		clear();

		m_l_NO = i_l_NO;
		m_l_ODR_TYP_DN = i_l_ODR_TYP_DN;
		m_l_SPCL_PRICE_TYP_DN = i_l_SPCL_PRICE_TYP_DN;
		m_l_DEPO_TYP_DN = i_l_DEPO_TYP_DN;
		m_ODR_TYP = i_ODR_TYP;
		m_ODR_TYP_name = i_ODR_TYP_name;
		m_ODR_TYP_val = i_ODR_TYP_val;
		m_NO = i_NO;
		m_CUST_ODR_NO = i_CUST_ODR_NO;
		m_CUST_ITEM_CD = i_CUST_ITEM_CD;
		m_CUST_CD = i_CUST_CD;
		m_DLV_LOC_CD = i_DLV_LOC_CD;
		m_DESINATED_DLV_DATE = i_DESINATED_DLV_DATE;
		m_ODR_QTY = i_ODR_QTY;
		m_ODR_UNIT_PRICE = i_ODR_UNIT_PRICE;
		m_SPCL_PRICE_TYP = i_SPCL_PRICE_TYP;
		m_SPCL_PRICE_TYP_name = i_SPCL_PRICE_TYP_name;
		m_SPCL_PRICE_TYP_val = i_SPCL_PRICE_TYP_val;
		m_REMARKS = i_REMARKS;
		m_ODR_ACPT_DATE = i_ODR_ACPT_DATE;
		m_h_BUSINESS_OPR_DATE = i_h_BUSINESS_OPR_DATE;
		m_c_DOODR = i_c_DOODR;
		m_JOB_ODR_QTY = i_JOB_ODR_QTY;
		m_JOB_ODR_DLV_DATE = i_JOB_ODR_DLV_DATE;
		m_ALC_GRP_CD = i_ALC_GRP_CD;
		m_c_INPUTODRCD = i_c_INPUTODRCD;
		m_l_JOB_ODR_QTY = i_l_JOB_ODR_QTY;
		m_l_JOB_ODR_DLV_DATE = i_l_JOB_ODR_DLV_DATE;
		m_l_ALC_GRP_CD = i_l_ALC_GRP_CD;
		m_h_DOODRFLG = i_h_DOODRFLG;
		m_h_INPUTODRCDFLG = i_h_INPUTODRCDFLG;
		m_h_CHECK_STATUS = i_h_CHECK_STATUS;
		m_l_ODR_CTL_NO = i_l_ODR_CTL_NO;
		m_l_CUST_CD = i_l_CUST_CD;
		m_l_CUST_ITEM_CD = i_l_CUST_ITEM_CD;
		m_l_ITEM_CD = i_l_ITEM_CD;
		m_l_CUST_ITEM_NAME = i_l_CUST_ITEM_NAME;
		m_l_ITEM_NAME = i_l_ITEM_NAME;
		m_l_ODR_NO = i_l_ODR_NO;
		m_l_ODR_TYP = i_l_ODR_TYP;
		m_l_CUST_ODR_NO = i_l_CUST_ODR_NO;
		m_l_CUST_CHRG_ORG_CD = i_l_CUST_CHRG_ORG_CD;
		m_l_CUST_CHRG_PSN_CD = i_l_CUST_CHRG_PSN_CD;
		m_l_ODR_ACPT_ORG_CD = i_l_ODR_ACPT_ORG_CD;
		m_l_ODR_ACPT_PSN_CD = i_l_ODR_ACPT_PSN_CD;
		m_l_CURRNCY_CD = i_l_CURRNCY_CD;
		m_l_EXCH_TYP = i_l_EXCH_TYP;
		m_l_DLV_LOC_CD = i_l_DLV_LOC_CD;
		m_l_DLV_LOC_NAME_KANJI = i_l_DLV_LOC_NAME_KANJI;
		m_l_ODR_UNIT_PRICE = i_l_ODR_UNIT_PRICE;
		m_l_SPCL_PRICE_TYP = i_l_SPCL_PRICE_TYP;
		m_l_DEPO_TYP = i_l_DEPO_TYP;
		m_l_DESINATED_DLV_DATE = i_l_DESINATED_DLV_DATE;
		m_l_STD_DESINATED_RCV_DATE = i_l_STD_DESINATED_RCV_DATE;
		m_l_ODR_QTY = i_l_ODR_QTY;
		m_l_REMAIN_UNCONFIRM_ODR_QTY = i_l_REMAIN_UNCONFIRM_ODR_QTY;
		m_l_UNIT_CD = i_l_UNIT_CD;
		m_l_UNCONFIRM_ODR_BALANCE = i_l_UNCONFIRM_ODR_BALANCE;
		m_l_ODR_AMOUNT = i_l_ODR_AMOUNT;
		m_l_ODR_AMOUNT_EXCH_RATES = i_l_ODR_AMOUNT_EXCH_RATES;
		m_l_TRANSPORT_CD = i_l_TRANSPORT_CD;
		m_l_TRANSPORT_TYP = i_l_TRANSPORT_TYP;
		m_l_TAX_APPLY_TYP = i_l_TAX_APPLY_TYP;
		m_l_TAX_CD = i_l_TAX_CD;
		m_l_TAX_CALC_TYP = i_l_TAX_CALC_TYP;
		m_l_REMARKS = i_l_REMARKS;
		m_l_ODR_ACPT_DATE = i_l_ODR_ACPT_DATE;
		m_l_SHIP_PLAN_REMAIN_QTY = i_l_SHIP_PLAN_REMAIN_QTY;
		m_l_PARTIAL_SHIP_INST_FLG = i_l_PARTIAL_SHIP_INST_FLG;
		m_l_RSLT_CTL_SEQ_CD = i_l_RSLT_CTL_SEQ_CD;
		m_l_UNIT = i_l_UNIT;
		m_l_DLV_PLACE_CD = i_l_DLV_PLACE_CD;
		m_l_UNIT_PRICE = i_l_UNIT_PRICE;
		m_l_CUR_CD = i_l_CUR_CD;
		m_l_SPCL_PRICE_CO = i_l_SPCL_PRICE_CO;
		m_l_CUST_DLV_CD = i_l_CUST_DLV_CD;
		m_l_CUST_DLV_KEY_CD = i_l_CUST_DLV_KEY_CD;
		m_l_FIXED_ODR_NO = i_l_FIXED_ODR_NO;
		m_l_ALCTED_SEQ_CD = i_l_ALCTED_SEQ_CD;
		m_l_ALCTED_UNCONFIRM_ODR_NO = i_l_ALCTED_UNCONFIRM_ODR_NO;
		m_l_ALCTED_UNCONFIRM_ODR_QTY = i_l_ALCTED_UNCONFIRM_ODR_QTY;
		m_l_LAST_ANS_DLV_DATE_RCD = i_l_LAST_ANS_DLV_DATE_RCD;
		m_l_DESINATED_SHIP_DATE = i_l_DESINATED_SHIP_DATE;
		m_l_DESINATED_SHIP_QTY = i_l_DESINATED_SHIP_QTY;
		m_l_REST_SHIP_ODR_QTY = i_l_REST_SHIP_ODR_QTY;
		m_l_CUST_ANAME = i_l_CUST_ANAME;
		m_l_OWN_ORG_CD = i_l_OWN_ORG_CD;
		m_l_OWN_PERSON_CD = i_l_OWN_PERSON_CD;
		m_l_DETAIL_ROUND_TYP = i_l_DETAIL_ROUND_TYP;
		m_l_COMPANY_CD = i_l_COMPANY_CD;
		m_l_DLV_LOC_NAME = i_l_DLV_LOC_NAME;
		m_l_TRANSPORT_LT = i_l_TRANSPORT_LT;
		m_l_DEPO_WH_CD = i_l_DEPO_WH_CD;
		m_l_SHIP_WH_CD = i_l_SHIP_WH_CD;
		m_h_SHIP_PLANT_CD = i_h_SHIP_PLANT_CD;
		m_l_UNIT_COST = i_l_UNIT_COST;
		m_l_EFF_PHASE_IN_DATE = i_l_EFF_PHASE_IN_DATE;
		m_l_STOCK_UNIT = i_l_STOCK_UNIT;
		m_l_UNIT_QTY_TYP = i_l_UNIT_QTY_TYP;
		m_h_MRP_ODR_TYP = i_h_MRP_ODR_TYP;
		m_COMPANY_CD = i_COMPANY_CD;
		m_CODE = i_CODE;
		m_CLASS_CODE = i_CLASS_CODE;
		m_HOME_CUR_CD = i_HOME_CUR_CD;
		m_BUSINESS_OPR_DATE = i_BUSINESS_OPR_DATE;
		m_PLANT_CD = i_PLANT_CD;
		m_l_CUR_UNIT = i_l_CUR_UNIT;
		m_h_PRD_REQ_JOB_ODR_TYP_1 = i_h_PRD_REQ_JOB_ODR_TYP_1;
		m_h_PRD_REQ_JOB_ODR_TYP_2 = i_h_PRD_REQ_JOB_ODR_TYP_2;
		m_JOB_ODR_CD = i_JOB_ODR_CD;
		m_l_JOB_ODR_CD = i_l_JOB_ODR_CD;
	}
		// TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
