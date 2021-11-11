/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KQ0010/src/com/nec/jp/orteus/metamorBase/KQ0010/KQ0010020Struct.java,v $
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
//}}user_implement_code_header

public class KQ0010020Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_SPCL_PRICE_TYP_name */
	public String m_SPCL_PRICE_TYP_name = null;
	/** �� 2 �ϐ��F m_SPCL_PRICE_TYP_val */
	public String m_SPCL_PRICE_TYP_val = null;
	/** �� 3 �ϐ��F m_h_ODR_QTY */
	public String m_h_ODR_QTY = null;
	/** �� 4 �ϐ��F m_h_DESINATED_DLV_DATE */
	public String m_h_DESINATED_DLV_DATE = null;
	/** �� 5 �ϐ��F m_h_SPCL_PRICE_TYP */
	public String m_h_SPCL_PRICE_TYP = null;
	/** �� 6 �ϐ��F m_h_CUS_DLV_KEY_CD */
	public String m_h_CUS_DLV_KEY_CD = null;
	/** �� 7 �ϐ��F m_h_CUS_DLV_CD */
	public String m_h_CUS_DLV_CD = null;
	/** �� 8 �ϐ��F m_h_DLV_LOC_CD */
	public String m_h_DLV_LOC_CD = null;
	/** �� 9 �ϐ��F m_APPR_REMARKS */
	public String m_APPR_REMARKS = null;
	/** �� 10 �ϐ��F m_h_APR_ODR */
	public String m_h_APR_ODR = null;
	/** �� 11 �ϐ��F m_ODR_UNIT_PRICE */
	public String m_ODR_UNIT_PRICE = null;
	/** �� 12 �ϐ��F m_SPCL_PRICE_TYP */
	public String m_SPCL_PRICE_TYP = null;
	/** �� 13 �ϐ��F m_DESINATED_DLV_DATE */
	public String m_DESINATED_DLV_DATE = null;
	/** �� 14 �ϐ��F m_STD_DESINATED_RCV_DATE */
	public String m_STD_DESINATED_RCV_DATE = null;
	/** �� 15 �ϐ��F m_ODR_QTY */
	public String m_ODR_QTY = null;
	/** �� 16 �ϐ��F m_UNCONFIRM_ODR_BALANCE */
	public Double m_UNCONFIRM_ODR_BALANCE = null;
	/** �� 17 �ϐ��F m_ODR_AMOUNT */
	public Double m_ODR_AMOUNT = null;
	/** �� 18 �ϐ��F m_ODR_AMOUNT_EXCH_RATES */
	public Double m_ODR_AMOUNT_EXCH_RATES = null;
	/** �� 19 �ϐ��F m_CUS_DLV_CD */
	public String m_CUS_DLV_CD = null;
	/** �� 20 �ϐ��F m_CUS_DLV_KEY_CD */
	public String m_CUS_DLV_KEY_CD = null;
	/** �� 21 �ϐ��F m_h_REMAIN_UNCONFIRM_ODR_QTY */
	public String m_h_REMAIN_UNCONFIRM_ODR_QTY = null;
	/** �� 22 �ϐ��F m_CANCELED_UNCONFIRM_ODR_QTY */
	public String m_CANCELED_UNCONFIRM_ODR_QTY = null;
	/** �� 23 �ϐ��F m_h_SHIP_PLAN_REMAIN_QTY */
	public String m_h_SHIP_PLAN_REMAIN_QTY = null;
	/** �� 24 �ϐ��F m_SHIP_PLAN_CMPLT_FLG */
	public String m_SHIP_PLAN_CMPLT_FLG = null;
	/** �� 25 �ϐ��F m_PUCH_ODR_QTY_TOTAL */
	public String m_PUCH_ODR_QTY_TOTAL = null;
	/** �� 26 �ϐ��F m_REMARKS */
	public String m_REMARKS = null;
	/** �� 27 �ϐ��F m_DLV_LOC_CD */
	public String m_DLV_LOC_CD = null;
	/** �� 28 �ϐ��F m_DLV_LOC_NAME_KANJI */
	public String m_DLV_LOC_NAME_KANJI = null;
	/** �� 29 �ϐ��F m_CUST_ODR_NO */
	public String m_CUST_ODR_NO = null;
	/** �� 30 �ϐ��F m_h_ODR_NO */
	public String m_h_ODR_NO = null;
	/** �� 31 �ϐ��F m_RSLT_CTL_SEQ_CD */
	public String m_RSLT_CTL_SEQ_CD = null;
	/** �� 32 �ϐ��F m_ODR_CTL_NO */
	public String m_ODR_CTL_NO = null;
	/** �� 33 �ϐ��F m_h_ODR_TYP */
	public String m_h_ODR_TYP = null;
	/** �� 34 �ϐ��F m_CUST_CD */
	public String m_CUST_CD = null;
	/** �� 35 �ϐ��F m_CUST_ITEM_CD */
	public String m_CUST_ITEM_CD = null;
	/** �� 36 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 37 �ϐ��F m_UNIT_CD */
	public String m_UNIT_CD = null;
	/** �� 38 �ϐ��F m_CURRNCY_CD */
	public String m_CURRNCY_CD = null;
	/** �� 39 �ϐ��F m_DEPO_TYP */
	public String m_DEPO_TYP = null;
	/** �� 40 �ϐ��F m_CUST_CHRG_PSN_CD */
	public String m_CUST_CHRG_PSN_CD = null;
	/** �� 41 �ϐ��F m_ODR_ACPT_PSN_CD */
	public String m_ODR_ACPT_PSN_CD = null;
	/** �� 42 �ϐ��F m_ODR_ACPT_DATE */
	public String m_ODR_ACPT_DATE = null;
	/** �� 43 �ϐ��F m_fkgnALCTED_UNCONFIRM_ODR_NO */
	public String m_fkgnALCTED_UNCONFIRM_ODR_NO = null;
	/** �� 44 �ϐ��F m_fkgnALCTED_UNCONFIRM_ODR_QTY */
	public Double m_fkgnALCTED_UNCONFIRM_ODR_QTY = null;
	/** �� 45 �ϐ��F m_fkgnALCTED_SEQ_CD */
	public String m_fkgnALCTED_SEQ_CD = null;
	/** �� 46 �ϐ��F m_fkgnREMAIN_UNCONFIRM_ODR_QTY */
	public Double m_fkgnREMAIN_UNCONFIRM_ODR_QTY = null;
	/** �� 47 �ϐ��F m_fkgnODR_UNIT_PRICE */
	public Double m_fkgnODR_UNIT_PRICE = null;
	/** �� 48 �ϐ��F m_fkgnCURRNCY_CD */
	public String m_fkgnCURRNCY_CD = null;
	/** �� 49 �ϐ��F m_fkgnODR_QTY */
	public Double m_fkgnODR_QTY = null;
	/** �� 50 �ϐ��F m_fkgnODR_TYP */
	public String m_fkgnODR_TYP = null;
	/** �� 51 �ϐ��F m_fkgnFIXED_ODR_NO */
	public String m_fkgnFIXED_ODR_NO = null;
	/** �� 52 �ϐ��F m_fkgnDEL_FLG */
	public String m_fkgnDEL_FLG = null;
	/** �� 53 �ϐ��F m_fkgnUNCONFIRM_ODR_BALANCE */
	public Double m_fkgnUNCONFIRM_ODR_BALANCE = null;
	/** �� 54 �ϐ��F m_fkgnODR_NO */
	public String m_fkgnODR_NO = null;
	/** �� 55 �ϐ��F m_IF_CTL_NO */
	public String m_IF_CTL_NO = null;
	/** �� 56 �ϐ��F m_UNIT_NAME */
	public String m_UNIT_NAME = null;
	/** �� 57 �ϐ��F m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** �� 58 �ϐ��F m_CUST_ANAME */
	public String m_CUST_ANAME = null;
	/** �� 59 �ϐ��F m_EXCH_TYP */
	public String m_EXCH_TYP = null;
	/** �� 60 �ϐ��F m_DETAIL_ROUND_TYP */
	public String m_DETAIL_ROUND_TYP = null;
	/** �� 61 �ϐ��F m_CUST_ITEM_NAME */
	public String m_CUST_ITEM_NAME = null;
	/** �� 62 �ϐ��F m_ODR_TYP */
	public String m_ODR_TYP = null;
	/** �� 63 �ϐ��F m_CUST_CHRG_PSN_NAME */
	public String m_CUST_CHRG_PSN_NAME = null;
	/** �� 64 �ϐ��F m_CUST_CHRG_ORG_CD */
	public String m_CUST_CHRG_ORG_CD = null;
	/** �� 65 �ϐ��F m_CUST_CHRG_ORG_NAME */
	public String m_CUST_CHRG_ORG_NAME = null;
	/** �� 66 �ϐ��F m_h_MODIFY_COUNT */
	public String m_h_MODIFY_COUNT = null;
	/** �� 67 �ϐ��F m_h_ANS_DLV_DATE_EXIST_FLG */
	public String m_h_ANS_DLV_DATE_EXIST_FLG = null;
	/** �� 68 �ϐ��F m_h_T_SHIP_ODR_EXIST_FLG */
	public String m_h_T_SHIP_ODR_EXIST_FLG = null;
	/** �� 69 �ϐ��F m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** �� 70 �ϐ��F m_PKG_UNIT */
	public String m_PKG_UNIT = null;
	/** �� 71 �ϐ��F m_UNIT_QTY_TYP */
	public String m_UNIT_QTY_TYP = null;
	/** �� 72 �ϐ��F m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** �� 73 �ϐ��F m_h_ODR_UNIT_PRICE */
	public String m_h_ODR_UNIT_PRICE = null;
	/** �� 74 �ϐ��F m_h_BUSINESS_OPR_DATE */
	public String m_h_BUSINESS_OPR_DATE = null;
	/** �� 75 �ϐ��F m_DLV_LOC_NAME */
	public String m_DLV_LOC_NAME = null;
	/** �� 76 �ϐ��F m_ODR_NO */
	public String m_ODR_NO = null;
	/** �� 77 �ϐ��F m_REMAIN_UNCONFIRM_ODR_QTY */
	public String m_REMAIN_UNCONFIRM_ODR_QTY = null;
	/** �� 78 �ϐ��F m_BUSINESS_OPR_DATE */
	public String m_BUSINESS_OPR_DATE = null;
	/** �� 79 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 80 �ϐ��F m_CODE */
	public String m_CODE = null;
	/** �� 81 �ϐ��F m_CLASS_CODE */
	public String m_CLASS_CODE = null;
	/** �� 82 �ϐ��F m_MAX_ALCTED_SEQ_CD */
	public Double m_MAX_ALCTED_SEQ_CD = null;
	/** �� 83 �ϐ��F m_MAX_ODR_NO */
	public String m_MAX_ODR_NO = null;
	/** �� 84 �ϐ��F m_h_ALCTED_UNCONFIRM_ODR_QTY */
	public String m_h_ALCTED_UNCONFIRM_ODR_QTY = null;
	/** �� 85 �ϐ��F m_IN_ODR_NO */
	public String m_IN_ODR_NO = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_SPCL_PRICE_TYP_name */
	public List l_SPCL_PRICE_TYP_name = null;

	/** �� 2 List�ϐ��F l_SPCL_PRICE_TYP_val */
	public List l_SPCL_PRICE_TYP_val = null;

	/** �� 3 List�ϐ��F l_h_ODR_QTY */
	public List l_h_ODR_QTY = null;

	/** �� 4 List�ϐ��F l_h_DESINATED_DLV_DATE */
	public List l_h_DESINATED_DLV_DATE = null;

	/** �� 5 List�ϐ��F l_h_SPCL_PRICE_TYP */
	public List l_h_SPCL_PRICE_TYP = null;

	/** �� 6 List�ϐ��F l_h_CUS_DLV_KEY_CD */
	public List l_h_CUS_DLV_KEY_CD = null;

	/** �� 7 List�ϐ��F l_h_CUS_DLV_CD */
	public List l_h_CUS_DLV_CD = null;

	/** �� 8 List�ϐ��F l_h_DLV_LOC_CD */
	public List l_h_DLV_LOC_CD = null;

	/** �� 9 List�ϐ��F l_APPR_REMARKS */
	public List l_APPR_REMARKS = null;

	/** �� 10 List�ϐ��F l_h_APR_ODR */
	public List l_h_APR_ODR = null;

	/** �� 11 List�ϐ��F l_ODR_UNIT_PRICE */
	public List l_ODR_UNIT_PRICE = null;

	/** �� 12 List�ϐ��F l_SPCL_PRICE_TYP */
	public List l_SPCL_PRICE_TYP = null;

	/** �� 13 List�ϐ��F l_DESINATED_DLV_DATE */
	public List l_DESINATED_DLV_DATE = null;

	/** �� 14 List�ϐ��F l_STD_DESINATED_RCV_DATE */
	public List l_STD_DESINATED_RCV_DATE = null;

	/** �� 15 List�ϐ��F l_ODR_QTY */
	public List l_ODR_QTY = null;

	/** �� 16 List�ϐ��F l_UNCONFIRM_ODR_BALANCE */
	public List l_UNCONFIRM_ODR_BALANCE = null;

	/** �� 17 List�ϐ��F l_ODR_AMOUNT */
	public List l_ODR_AMOUNT = null;

	/** �� 18 List�ϐ��F l_ODR_AMOUNT_EXCH_RATES */
	public List l_ODR_AMOUNT_EXCH_RATES = null;

	/** �� 19 List�ϐ��F l_CUS_DLV_CD */
	public List l_CUS_DLV_CD = null;

	/** �� 20 List�ϐ��F l_CUS_DLV_KEY_CD */
	public List l_CUS_DLV_KEY_CD = null;

	/** �� 21 List�ϐ��F l_h_REMAIN_UNCONFIRM_ODR_QTY */
	public List l_h_REMAIN_UNCONFIRM_ODR_QTY = null;

	/** �� 22 List�ϐ��F l_CANCELED_UNCONFIRM_ODR_QTY */
	public List l_CANCELED_UNCONFIRM_ODR_QTY = null;

	/** �� 23 List�ϐ��F l_h_SHIP_PLAN_REMAIN_QTY */
	public List l_h_SHIP_PLAN_REMAIN_QTY = null;

	/** �� 24 List�ϐ��F l_SHIP_PLAN_CMPLT_FLG */
	public List l_SHIP_PLAN_CMPLT_FLG = null;

	/** �� 25 List�ϐ��F l_PUCH_ODR_QTY_TOTAL */
	public List l_PUCH_ODR_QTY_TOTAL = null;

	/** �� 26 List�ϐ��F l_REMARKS */
	public List l_REMARKS = null;

	/** �� 27 List�ϐ��F l_DLV_LOC_CD */
	public List l_DLV_LOC_CD = null;

	/** �� 28 List�ϐ��F l_DLV_LOC_NAME_KANJI */
	public List l_DLV_LOC_NAME_KANJI = null;

	/** �� 29 List�ϐ��F l_CUST_ODR_NO */
	public List l_CUST_ODR_NO = null;

	/** �� 30 List�ϐ��F l_h_ODR_NO */
	public List l_h_ODR_NO = null;

	/** �� 31 List�ϐ��F l_RSLT_CTL_SEQ_CD */
	public List l_RSLT_CTL_SEQ_CD = null;

	/** �� 32 List�ϐ��F l_ODR_CTL_NO */
	public List l_ODR_CTL_NO = null;

	/** �� 33 List�ϐ��F l_h_ODR_TYP */
	public List l_h_ODR_TYP = null;

	/** �� 34 List�ϐ��F l_CUST_CD */
	public List l_CUST_CD = null;

	/** �� 35 List�ϐ��F l_CUST_ITEM_CD */
	public List l_CUST_ITEM_CD = null;

	/** �� 36 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 37 List�ϐ��F l_UNIT_CD */
	public List l_UNIT_CD = null;

	/** �� 38 List�ϐ��F l_CURRNCY_CD */
	public List l_CURRNCY_CD = null;

	/** �� 39 List�ϐ��F l_DEPO_TYP */
	public List l_DEPO_TYP = null;

	/** �� 40 List�ϐ��F l_CUST_CHRG_PSN_CD */
	public List l_CUST_CHRG_PSN_CD = null;

	/** �� 41 List�ϐ��F l_ODR_ACPT_PSN_CD */
	public List l_ODR_ACPT_PSN_CD = null;

	/** �� 42 List�ϐ��F l_ODR_ACPT_DATE */
	public List l_ODR_ACPT_DATE = null;

	/** �� 43 List�ϐ��F l_fkgnALCTED_UNCONFIRM_ODR_NO */
	public List l_fkgnALCTED_UNCONFIRM_ODR_NO = null;

	/** �� 44 List�ϐ��F l_fkgnALCTED_UNCONFIRM_ODR_QTY */
	public List l_fkgnALCTED_UNCONFIRM_ODR_QTY = null;

	/** �� 45 List�ϐ��F l_fkgnALCTED_SEQ_CD */
	public List l_fkgnALCTED_SEQ_CD = null;

	/** �� 46 List�ϐ��F l_fkgnREMAIN_UNCONFIRM_ODR_QTY */
	public List l_fkgnREMAIN_UNCONFIRM_ODR_QTY = null;

	/** �� 47 List�ϐ��F l_fkgnODR_UNIT_PRICE */
	public List l_fkgnODR_UNIT_PRICE = null;

	/** �� 48 List�ϐ��F l_fkgnCURRNCY_CD */
	public List l_fkgnCURRNCY_CD = null;

	/** �� 49 List�ϐ��F l_fkgnODR_QTY */
	public List l_fkgnODR_QTY = null;

	/** �� 50 List�ϐ��F l_fkgnODR_TYP */
	public List l_fkgnODR_TYP = null;

	/** �� 51 List�ϐ��F l_fkgnFIXED_ODR_NO */
	public List l_fkgnFIXED_ODR_NO = null;

	/** �� 52 List�ϐ��F l_fkgnDEL_FLG */
	public List l_fkgnDEL_FLG = null;

	/** �� 53 List�ϐ��F l_fkgnUNCONFIRM_ODR_BALANCE */
	public List l_fkgnUNCONFIRM_ODR_BALANCE = null;

	/** �� 54 List�ϐ��F l_fkgnODR_NO */
	public List l_fkgnODR_NO = null;

	/** �� 55 List�ϐ��F l_IF_CTL_NO */
	public List l_IF_CTL_NO = null;

	/** �� 56 List�ϐ��F l_UNIT_NAME */
	public List l_UNIT_NAME = null;

	/** �� 57 List�ϐ��F l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** �� 58 List�ϐ��F l_CUST_ANAME */
	public List l_CUST_ANAME = null;

	/** �� 59 List�ϐ��F l_EXCH_TYP */
	public List l_EXCH_TYP = null;

	/** �� 60 List�ϐ��F l_DETAIL_ROUND_TYP */
	public List l_DETAIL_ROUND_TYP = null;

	/** �� 61 List�ϐ��F l_CUST_ITEM_NAME */
	public List l_CUST_ITEM_NAME = null;

	/** �� 62 List�ϐ��F l_ODR_TYP */
	public List l_ODR_TYP = null;

	/** �� 63 List�ϐ��F l_CUST_CHRG_PSN_NAME */
	public List l_CUST_CHRG_PSN_NAME = null;

	/** �� 64 List�ϐ��F l_CUST_CHRG_ORG_CD */
	public List l_CUST_CHRG_ORG_CD = null;

	/** �� 65 List�ϐ��F l_CUST_CHRG_ORG_NAME */
	public List l_CUST_CHRG_ORG_NAME = null;

	/** �� 66 List�ϐ��F l_h_MODIFY_COUNT */
	public List l_h_MODIFY_COUNT = null;

	/** �� 67 List�ϐ��F l_h_ANS_DLV_DATE_EXIST_FLG */
	public List l_h_ANS_DLV_DATE_EXIST_FLG = null;

	/** �� 68 List�ϐ��F l_h_T_SHIP_ODR_EXIST_FLG */
	public List l_h_T_SHIP_ODR_EXIST_FLG = null;

	/** �� 69 List�ϐ��F l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** �� 70 List�ϐ��F l_PKG_UNIT */
	public List l_PKG_UNIT = null;

	/** �� 71 List�ϐ��F l_UNIT_QTY_TYP */
	public List l_UNIT_QTY_TYP = null;

	/** �� 72 List�ϐ��F l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** �� 73 List�ϐ��F l_h_ODR_UNIT_PRICE */
	public List l_h_ODR_UNIT_PRICE = null;

	/** �� 74 List�ϐ��F l_h_BUSINESS_OPR_DATE */
	public List l_h_BUSINESS_OPR_DATE = null;

	/** �� 75 List�ϐ��F l_DLV_LOC_NAME */
	public List l_DLV_LOC_NAME = null;

	/** �� 76 List�ϐ��F l_ODR_NO */
	public List l_ODR_NO = null;

	/** �� 77 List�ϐ��F l_REMAIN_UNCONFIRM_ODR_QTY */
	public List l_REMAIN_UNCONFIRM_ODR_QTY = null;

	/** �� 78 List�ϐ��F l_BUSINESS_OPR_DATE */
	public List l_BUSINESS_OPR_DATE = null;

	/** �� 79 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 80 List�ϐ��F l_CODE */
	public List l_CODE = null;

	/** �� 81 List�ϐ��F l_CLASS_CODE */
	public List l_CLASS_CODE = null;

	/** �� 82 List�ϐ��F l_MAX_ALCTED_SEQ_CD */
	public List l_MAX_ALCTED_SEQ_CD = null;

	/** �� 83 List�ϐ��F l_MAX_ODR_NO */
	public List l_MAX_ODR_NO = null;

	/** �� 84 List�ϐ��F l_h_ALCTED_UNCONFIRM_ODR_QTY */
	public List l_h_ALCTED_UNCONFIRM_ODR_QTY = null;

	/** �� 85 List�ϐ��F l_IN_ODR_NO */
	public List l_IN_ODR_NO = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getSPCL_PRICE_TYP_name() { return m_SPCL_PRICE_TYP_name; }
	public String getSPCL_PRICE_TYP_val() { return m_SPCL_PRICE_TYP_val; }
	public String geth_ODR_QTY() { return m_h_ODR_QTY; }
	public String geth_DESINATED_DLV_DATE() { return m_h_DESINATED_DLV_DATE; }
	public String geth_SPCL_PRICE_TYP() { return m_h_SPCL_PRICE_TYP; }
	public String geth_CUS_DLV_KEY_CD() { return m_h_CUS_DLV_KEY_CD; }
	public String geth_CUS_DLV_CD() { return m_h_CUS_DLV_CD; }
	public String geth_DLV_LOC_CD() { return m_h_DLV_LOC_CD; }
	public String getAPPR_REMARKS() { return m_APPR_REMARKS; }
	public String geth_APR_ODR() { return m_h_APR_ODR; }
	public String getODR_UNIT_PRICE() { return m_ODR_UNIT_PRICE; }
	public String getSPCL_PRICE_TYP() { return m_SPCL_PRICE_TYP; }
	public String getDESINATED_DLV_DATE() { return m_DESINATED_DLV_DATE; }
	public String getSTD_DESINATED_RCV_DATE() { return m_STD_DESINATED_RCV_DATE; }
	public String getODR_QTY() { return m_ODR_QTY; }
	public Double getUNCONFIRM_ODR_BALANCE() { return m_UNCONFIRM_ODR_BALANCE; }
	public Double getODR_AMOUNT() { return m_ODR_AMOUNT; }
	public Double getODR_AMOUNT_EXCH_RATES() { return m_ODR_AMOUNT_EXCH_RATES; }
	public String getCUS_DLV_CD() { return m_CUS_DLV_CD; }
	public String getCUS_DLV_KEY_CD() { return m_CUS_DLV_KEY_CD; }
	public String geth_REMAIN_UNCONFIRM_ODR_QTY() { return m_h_REMAIN_UNCONFIRM_ODR_QTY; }
	public String getCANCELED_UNCONFIRM_ODR_QTY() { return m_CANCELED_UNCONFIRM_ODR_QTY; }
	public String geth_SHIP_PLAN_REMAIN_QTY() { return m_h_SHIP_PLAN_REMAIN_QTY; }
	public String getSHIP_PLAN_CMPLT_FLG() { return m_SHIP_PLAN_CMPLT_FLG; }
	public String getPUCH_ODR_QTY_TOTAL() { return m_PUCH_ODR_QTY_TOTAL; }
	public String getREMARKS() { return m_REMARKS; }
	public String getDLV_LOC_CD() { return m_DLV_LOC_CD; }
	public String getDLV_LOC_NAME_KANJI() { return m_DLV_LOC_NAME_KANJI; }
	public String getCUST_ODR_NO() { return m_CUST_ODR_NO; }
	public String geth_ODR_NO() { return m_h_ODR_NO; }
	public String getRSLT_CTL_SEQ_CD() { return m_RSLT_CTL_SEQ_CD; }
	public String getODR_CTL_NO() { return m_ODR_CTL_NO; }
	public String geth_ODR_TYP() { return m_h_ODR_TYP; }
	public String getCUST_CD() { return m_CUST_CD; }
	public String getCUST_ITEM_CD() { return m_CUST_ITEM_CD; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getUNIT_CD() { return m_UNIT_CD; }
	public String getCURRNCY_CD() { return m_CURRNCY_CD; }
	public String getDEPO_TYP() { return m_DEPO_TYP; }
	public String getCUST_CHRG_PSN_CD() { return m_CUST_CHRG_PSN_CD; }
	public String getODR_ACPT_PSN_CD() { return m_ODR_ACPT_PSN_CD; }
	public String getODR_ACPT_DATE() { return m_ODR_ACPT_DATE; }
	public String getfkgnALCTED_UNCONFIRM_ODR_NO() { return m_fkgnALCTED_UNCONFIRM_ODR_NO; }
	public Double getfkgnALCTED_UNCONFIRM_ODR_QTY() { return m_fkgnALCTED_UNCONFIRM_ODR_QTY; }
	public String getfkgnALCTED_SEQ_CD() { return m_fkgnALCTED_SEQ_CD; }
	public Double getfkgnREMAIN_UNCONFIRM_ODR_QTY() { return m_fkgnREMAIN_UNCONFIRM_ODR_QTY; }
	public Double getfkgnODR_UNIT_PRICE() { return m_fkgnODR_UNIT_PRICE; }
	public String getfkgnCURRNCY_CD() { return m_fkgnCURRNCY_CD; }
	public Double getfkgnODR_QTY() { return m_fkgnODR_QTY; }
	public String getfkgnODR_TYP() { return m_fkgnODR_TYP; }
	public String getfkgnFIXED_ODR_NO() { return m_fkgnFIXED_ODR_NO; }
	public String getfkgnDEL_FLG() { return m_fkgnDEL_FLG; }
	public Double getfkgnUNCONFIRM_ODR_BALANCE() { return m_fkgnUNCONFIRM_ODR_BALANCE; }
	public String getfkgnODR_NO() { return m_fkgnODR_NO; }
	public String getIF_CTL_NO() { return m_IF_CTL_NO; }
	public String getUNIT_NAME() { return m_UNIT_NAME; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getCUST_ANAME() { return m_CUST_ANAME; }
	public String getEXCH_TYP() { return m_EXCH_TYP; }
	public String getDETAIL_ROUND_TYP() { return m_DETAIL_ROUND_TYP; }
	public String getCUST_ITEM_NAME() { return m_CUST_ITEM_NAME; }
	public String getODR_TYP() { return m_ODR_TYP; }
	public String getCUST_CHRG_PSN_NAME() { return m_CUST_CHRG_PSN_NAME; }
	public String getCUST_CHRG_ORG_CD() { return m_CUST_CHRG_ORG_CD; }
	public String getCUST_CHRG_ORG_NAME() { return m_CUST_CHRG_ORG_NAME; }
	public String geth_MODIFY_COUNT() { return m_h_MODIFY_COUNT; }
	public String geth_ANS_DLV_DATE_EXIST_FLG() { return m_h_ANS_DLV_DATE_EXIST_FLG; }
	public String geth_T_SHIP_ODR_EXIST_FLG() { return m_h_T_SHIP_ODR_EXIST_FLG; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getPKG_UNIT() { return m_PKG_UNIT; }
	public String getUNIT_QTY_TYP() { return m_UNIT_QTY_TYP; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String geth_ODR_UNIT_PRICE() { return m_h_ODR_UNIT_PRICE; }
	public String geth_BUSINESS_OPR_DATE() { return m_h_BUSINESS_OPR_DATE; }
	public String getDLV_LOC_NAME() { return m_DLV_LOC_NAME; }
	public String getODR_NO() { return m_ODR_NO; }
	public String getREMAIN_UNCONFIRM_ODR_QTY() { return m_REMAIN_UNCONFIRM_ODR_QTY; }
	public String getBUSINESS_OPR_DATE() { return m_BUSINESS_OPR_DATE; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getCODE() { return m_CODE; }
	public String getCLASS_CODE() { return m_CLASS_CODE; }
	public Double getMAX_ALCTED_SEQ_CD() { return m_MAX_ALCTED_SEQ_CD; }
	public String getMAX_ODR_NO() { return m_MAX_ODR_NO; }
	public String geth_ALCTED_UNCONFIRM_ODR_QTY() { return m_h_ALCTED_UNCONFIRM_ODR_QTY; }
	public String getIN_ODR_NO() { return m_IN_ODR_NO; }

	public List getList_SPCL_PRICE_TYP_name() { return l_SPCL_PRICE_TYP_name; }
	public List getList_SPCL_PRICE_TYP_val() { return l_SPCL_PRICE_TYP_val; }
	public List getList_h_ODR_QTY() { return l_h_ODR_QTY; }
	public List getList_h_DESINATED_DLV_DATE() { return l_h_DESINATED_DLV_DATE; }
	public List getList_h_SPCL_PRICE_TYP() { return l_h_SPCL_PRICE_TYP; }
	public List getList_h_CUS_DLV_KEY_CD() { return l_h_CUS_DLV_KEY_CD; }
	public List getList_h_CUS_DLV_CD() { return l_h_CUS_DLV_CD; }
	public List getList_h_DLV_LOC_CD() { return l_h_DLV_LOC_CD; }
	public List getList_APPR_REMARKS() { return l_APPR_REMARKS; }
	public List getList_h_APR_ODR() { return l_h_APR_ODR; }
	public List getList_ODR_UNIT_PRICE() { return l_ODR_UNIT_PRICE; }
	public List getList_SPCL_PRICE_TYP() { return l_SPCL_PRICE_TYP; }
	public List getList_DESINATED_DLV_DATE() { return l_DESINATED_DLV_DATE; }
	public List getList_STD_DESINATED_RCV_DATE() { return l_STD_DESINATED_RCV_DATE; }
	public List getList_ODR_QTY() { return l_ODR_QTY; }
	public List getList_UNCONFIRM_ODR_BALANCE() { return l_UNCONFIRM_ODR_BALANCE; }
	public List getList_ODR_AMOUNT() { return l_ODR_AMOUNT; }
	public List getList_ODR_AMOUNT_EXCH_RATES() { return l_ODR_AMOUNT_EXCH_RATES; }
	public List getList_CUS_DLV_CD() { return l_CUS_DLV_CD; }
	public List getList_CUS_DLV_KEY_CD() { return l_CUS_DLV_KEY_CD; }
	public List getList_h_REMAIN_UNCONFIRM_ODR_QTY() { return l_h_REMAIN_UNCONFIRM_ODR_QTY; }
	public List getList_CANCELED_UNCONFIRM_ODR_QTY() { return l_CANCELED_UNCONFIRM_ODR_QTY; }
	public List getList_h_SHIP_PLAN_REMAIN_QTY() { return l_h_SHIP_PLAN_REMAIN_QTY; }
	public List getList_SHIP_PLAN_CMPLT_FLG() { return l_SHIP_PLAN_CMPLT_FLG; }
	public List getList_PUCH_ODR_QTY_TOTAL() { return l_PUCH_ODR_QTY_TOTAL; }
	public List getList_REMARKS() { return l_REMARKS; }
	public List getList_DLV_LOC_CD() { return l_DLV_LOC_CD; }
	public List getList_DLV_LOC_NAME_KANJI() { return l_DLV_LOC_NAME_KANJI; }
	public List getList_CUST_ODR_NO() { return l_CUST_ODR_NO; }
	public List getList_h_ODR_NO() { return l_h_ODR_NO; }
	public List getList_RSLT_CTL_SEQ_CD() { return l_RSLT_CTL_SEQ_CD; }
	public List getList_ODR_CTL_NO() { return l_ODR_CTL_NO; }
	public List getList_h_ODR_TYP() { return l_h_ODR_TYP; }
	public List getList_CUST_CD() { return l_CUST_CD; }
	public List getList_CUST_ITEM_CD() { return l_CUST_ITEM_CD; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_UNIT_CD() { return l_UNIT_CD; }
	public List getList_CURRNCY_CD() { return l_CURRNCY_CD; }
	public List getList_DEPO_TYP() { return l_DEPO_TYP; }
	public List getList_CUST_CHRG_PSN_CD() { return l_CUST_CHRG_PSN_CD; }
	public List getList_ODR_ACPT_PSN_CD() { return l_ODR_ACPT_PSN_CD; }
	public List getList_ODR_ACPT_DATE() { return l_ODR_ACPT_DATE; }
	public List getList_fkgnALCTED_UNCONFIRM_ODR_NO() { return l_fkgnALCTED_UNCONFIRM_ODR_NO; }
	public List getList_fkgnALCTED_UNCONFIRM_ODR_QTY() { return l_fkgnALCTED_UNCONFIRM_ODR_QTY; }
	public List getList_fkgnALCTED_SEQ_CD() { return l_fkgnALCTED_SEQ_CD; }
	public List getList_fkgnREMAIN_UNCONFIRM_ODR_QTY() { return l_fkgnREMAIN_UNCONFIRM_ODR_QTY; }
	public List getList_fkgnODR_UNIT_PRICE() { return l_fkgnODR_UNIT_PRICE; }
	public List getList_fkgnCURRNCY_CD() { return l_fkgnCURRNCY_CD; }
	public List getList_fkgnODR_QTY() { return l_fkgnODR_QTY; }
	public List getList_fkgnODR_TYP() { return l_fkgnODR_TYP; }
	public List getList_fkgnFIXED_ODR_NO() { return l_fkgnFIXED_ODR_NO; }
	public List getList_fkgnDEL_FLG() { return l_fkgnDEL_FLG; }
	public List getList_fkgnUNCONFIRM_ODR_BALANCE() { return l_fkgnUNCONFIRM_ODR_BALANCE; }
	public List getList_fkgnODR_NO() { return l_fkgnODR_NO; }
	public List getList_IF_CTL_NO() { return l_IF_CTL_NO; }
	public List getList_UNIT_NAME() { return l_UNIT_NAME; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_CUST_ANAME() { return l_CUST_ANAME; }
	public List getList_EXCH_TYP() { return l_EXCH_TYP; }
	public List getList_DETAIL_ROUND_TYP() { return l_DETAIL_ROUND_TYP; }
	public List getList_CUST_ITEM_NAME() { return l_CUST_ITEM_NAME; }
	public List getList_ODR_TYP() { return l_ODR_TYP; }
	public List getList_CUST_CHRG_PSN_NAME() { return l_CUST_CHRG_PSN_NAME; }
	public List getList_CUST_CHRG_ORG_CD() { return l_CUST_CHRG_ORG_CD; }
	public List getList_CUST_CHRG_ORG_NAME() { return l_CUST_CHRG_ORG_NAME; }
	public List getList_h_MODIFY_COUNT() { return l_h_MODIFY_COUNT; }
	public List getList_h_ANS_DLV_DATE_EXIST_FLG() { return l_h_ANS_DLV_DATE_EXIST_FLG; }
	public List getList_h_T_SHIP_ODR_EXIST_FLG() { return l_h_T_SHIP_ODR_EXIST_FLG; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_PKG_UNIT() { return l_PKG_UNIT; }
	public List getList_UNIT_QTY_TYP() { return l_UNIT_QTY_TYP; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_h_ODR_UNIT_PRICE() { return l_h_ODR_UNIT_PRICE; }
	public List getList_h_BUSINESS_OPR_DATE() { return l_h_BUSINESS_OPR_DATE; }
	public List getList_DLV_LOC_NAME() { return l_DLV_LOC_NAME; }
	public List getList_ODR_NO() { return l_ODR_NO; }
	public List getList_REMAIN_UNCONFIRM_ODR_QTY() { return l_REMAIN_UNCONFIRM_ODR_QTY; }
	public List getList_BUSINESS_OPR_DATE() { return l_BUSINESS_OPR_DATE; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_CODE() { return l_CODE; }
	public List getList_CLASS_CODE() { return l_CLASS_CODE; }
	public List getList_MAX_ALCTED_SEQ_CD() { return l_MAX_ALCTED_SEQ_CD; }
	public List getList_MAX_ODR_NO() { return l_MAX_ODR_NO; }
	public List getList_h_ALCTED_UNCONFIRM_ODR_QTY() { return l_h_ALCTED_UNCONFIRM_ODR_QTY; }
	public List getList_IN_ODR_NO() { return l_IN_ODR_NO; }

	public void setSPCL_PRICE_TYP_name(String val) { m_SPCL_PRICE_TYP_name = val; }
	public void setSPCL_PRICE_TYP_val(String val) { m_SPCL_PRICE_TYP_val = val; }
	public void seth_ODR_QTY(String val) { m_h_ODR_QTY = val; }
	public void seth_DESINATED_DLV_DATE(String val) { m_h_DESINATED_DLV_DATE = val; }
	public void seth_SPCL_PRICE_TYP(String val) { m_h_SPCL_PRICE_TYP = val; }
	public void seth_CUS_DLV_KEY_CD(String val) { m_h_CUS_DLV_KEY_CD = val; }
	public void seth_CUS_DLV_CD(String val) { m_h_CUS_DLV_CD = val; }
	public void seth_DLV_LOC_CD(String val) { m_h_DLV_LOC_CD = val; }
	public void setAPPR_REMARKS(String val) { m_APPR_REMARKS = val; }
	public void seth_APR_ODR(String val) { m_h_APR_ODR = val; }
	public void setODR_UNIT_PRICE(String val) { m_ODR_UNIT_PRICE = val; }
	public void setSPCL_PRICE_TYP(String val) { m_SPCL_PRICE_TYP = val; }
	public void setDESINATED_DLV_DATE(String val) { m_DESINATED_DLV_DATE = val; }
	public void setSTD_DESINATED_RCV_DATE(String val) { m_STD_DESINATED_RCV_DATE = val; }
	public void setODR_QTY(String val) { m_ODR_QTY = val; }
	public void setUNCONFIRM_ODR_BALANCE(Double val) { m_UNCONFIRM_ODR_BALANCE = val; }
	public void setODR_AMOUNT(Double val) { m_ODR_AMOUNT = val; }
	public void setODR_AMOUNT_EXCH_RATES(Double val) { m_ODR_AMOUNT_EXCH_RATES = val; }
	public void setCUS_DLV_CD(String val) { m_CUS_DLV_CD = val; }
	public void setCUS_DLV_KEY_CD(String val) { m_CUS_DLV_KEY_CD = val; }
	public void seth_REMAIN_UNCONFIRM_ODR_QTY(String val) { m_h_REMAIN_UNCONFIRM_ODR_QTY = val; }
	public void setCANCELED_UNCONFIRM_ODR_QTY(String val) { m_CANCELED_UNCONFIRM_ODR_QTY = val; }
	public void seth_SHIP_PLAN_REMAIN_QTY(String val) { m_h_SHIP_PLAN_REMAIN_QTY = val; }
	public void setSHIP_PLAN_CMPLT_FLG(String val) { m_SHIP_PLAN_CMPLT_FLG = val; }
	public void setPUCH_ODR_QTY_TOTAL(String val) { m_PUCH_ODR_QTY_TOTAL = val; }
	public void setREMARKS(String val) { m_REMARKS = val; }
	public void setDLV_LOC_CD(String val) { m_DLV_LOC_CD = val; }
	public void setDLV_LOC_NAME_KANJI(String val) { m_DLV_LOC_NAME_KANJI = val; }
	public void setCUST_ODR_NO(String val) { m_CUST_ODR_NO = val; }
	public void seth_ODR_NO(String val) { m_h_ODR_NO = val; }
	public void setRSLT_CTL_SEQ_CD(String val) { m_RSLT_CTL_SEQ_CD = val; }
	public void setODR_CTL_NO(String val) { m_ODR_CTL_NO = val; }
	public void seth_ODR_TYP(String val) { m_h_ODR_TYP = val; }
	public void setCUST_CD(String val) { m_CUST_CD = val; }
	public void setCUST_ITEM_CD(String val) { m_CUST_ITEM_CD = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setUNIT_CD(String val) { m_UNIT_CD = val; }
	public void setCURRNCY_CD(String val) { m_CURRNCY_CD = val; }
	public void setDEPO_TYP(String val) { m_DEPO_TYP = val; }
	public void setCUST_CHRG_PSN_CD(String val) { m_CUST_CHRG_PSN_CD = val; }
	public void setODR_ACPT_PSN_CD(String val) { m_ODR_ACPT_PSN_CD = val; }
	public void setODR_ACPT_DATE(String val) { m_ODR_ACPT_DATE = val; }
	public void setfkgnALCTED_UNCONFIRM_ODR_NO(String val) { m_fkgnALCTED_UNCONFIRM_ODR_NO = val; }
	public void setfkgnALCTED_UNCONFIRM_ODR_QTY(Double val) { m_fkgnALCTED_UNCONFIRM_ODR_QTY = val; }
	public void setfkgnALCTED_SEQ_CD(String val) { m_fkgnALCTED_SEQ_CD = val; }
	public void setfkgnREMAIN_UNCONFIRM_ODR_QTY(Double val) { m_fkgnREMAIN_UNCONFIRM_ODR_QTY = val; }
	public void setfkgnODR_UNIT_PRICE(Double val) { m_fkgnODR_UNIT_PRICE = val; }
	public void setfkgnCURRNCY_CD(String val) { m_fkgnCURRNCY_CD = val; }
	public void setfkgnODR_QTY(Double val) { m_fkgnODR_QTY = val; }
	public void setfkgnODR_TYP(String val) { m_fkgnODR_TYP = val; }
	public void setfkgnFIXED_ODR_NO(String val) { m_fkgnFIXED_ODR_NO = val; }
	public void setfkgnDEL_FLG(String val) { m_fkgnDEL_FLG = val; }
	public void setfkgnUNCONFIRM_ODR_BALANCE(Double val) { m_fkgnUNCONFIRM_ODR_BALANCE = val; }
	public void setfkgnODR_NO(String val) { m_fkgnODR_NO = val; }
	public void setIF_CTL_NO(String val) { m_IF_CTL_NO = val; }
	public void setUNIT_NAME(String val) { m_UNIT_NAME = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setCUST_ANAME(String val) { m_CUST_ANAME = val; }
	public void setEXCH_TYP(String val) { m_EXCH_TYP = val; }
	public void setDETAIL_ROUND_TYP(String val) { m_DETAIL_ROUND_TYP = val; }
	public void setCUST_ITEM_NAME(String val) { m_CUST_ITEM_NAME = val; }
	public void setODR_TYP(String val) { m_ODR_TYP = val; }
	public void setCUST_CHRG_PSN_NAME(String val) { m_CUST_CHRG_PSN_NAME = val; }
	public void setCUST_CHRG_ORG_CD(String val) { m_CUST_CHRG_ORG_CD = val; }
	public void setCUST_CHRG_ORG_NAME(String val) { m_CUST_CHRG_ORG_NAME = val; }
	public void seth_MODIFY_COUNT(String val) { m_h_MODIFY_COUNT = val; }
	public void seth_ANS_DLV_DATE_EXIST_FLG(String val) { m_h_ANS_DLV_DATE_EXIST_FLG = val; }
	public void seth_T_SHIP_ODR_EXIST_FLG(String val) { m_h_T_SHIP_ODR_EXIST_FLG = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setPKG_UNIT(String val) { m_PKG_UNIT = val; }
	public void setUNIT_QTY_TYP(String val) { m_UNIT_QTY_TYP = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void seth_ODR_UNIT_PRICE(String val) { m_h_ODR_UNIT_PRICE = val; }
	public void seth_BUSINESS_OPR_DATE(String val) { m_h_BUSINESS_OPR_DATE = val; }
	public void setDLV_LOC_NAME(String val) { m_DLV_LOC_NAME = val; }
	public void setODR_NO(String val) { m_ODR_NO = val; }
	public void setREMAIN_UNCONFIRM_ODR_QTY(String val) { m_REMAIN_UNCONFIRM_ODR_QTY = val; }
	public void setBUSINESS_OPR_DATE(String val) { m_BUSINESS_OPR_DATE = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setCODE(String val) { m_CODE = val; }
	public void setCLASS_CODE(String val) { m_CLASS_CODE = val; }
	public void setMAX_ALCTED_SEQ_CD(Double val) { m_MAX_ALCTED_SEQ_CD = val; }
	public void setMAX_ODR_NO(String val) { m_MAX_ODR_NO = val; }
	public void seth_ALCTED_UNCONFIRM_ODR_QTY(String val) { m_h_ALCTED_UNCONFIRM_ODR_QTY = val; }
	public void setIN_ODR_NO(String val) { m_IN_ODR_NO = val; }


	public void setList_SPCL_PRICE_TYP_name(List list) { l_SPCL_PRICE_TYP_name = list; }
	public void setList_SPCL_PRICE_TYP_val(List list) { l_SPCL_PRICE_TYP_val = list; }
	public void setList_h_ODR_QTY(List list) { l_h_ODR_QTY = list; }
	public void setList_h_DESINATED_DLV_DATE(List list) { l_h_DESINATED_DLV_DATE = list; }
	public void setList_h_SPCL_PRICE_TYP(List list) { l_h_SPCL_PRICE_TYP = list; }
	public void setList_h_CUS_DLV_KEY_CD(List list) { l_h_CUS_DLV_KEY_CD = list; }
	public void setList_h_CUS_DLV_CD(List list) { l_h_CUS_DLV_CD = list; }
	public void setList_h_DLV_LOC_CD(List list) { l_h_DLV_LOC_CD = list; }
	public void setList_APPR_REMARKS(List list) { l_APPR_REMARKS = list; }
	public void setList_h_APR_ODR(List list) { l_h_APR_ODR = list; }
	public void setList_ODR_UNIT_PRICE(List list) { l_ODR_UNIT_PRICE = list; }
	public void setList_SPCL_PRICE_TYP(List list) { l_SPCL_PRICE_TYP = list; }
	public void setList_DESINATED_DLV_DATE(List list) { l_DESINATED_DLV_DATE = list; }
	public void setList_STD_DESINATED_RCV_DATE(List list) { l_STD_DESINATED_RCV_DATE = list; }
	public void setList_ODR_QTY(List list) { l_ODR_QTY = list; }
	public void setList_UNCONFIRM_ODR_BALANCE(List list) { l_UNCONFIRM_ODR_BALANCE = list; }
	public void setList_ODR_AMOUNT(List list) { l_ODR_AMOUNT = list; }
	public void setList_ODR_AMOUNT_EXCH_RATES(List list) { l_ODR_AMOUNT_EXCH_RATES = list; }
	public void setList_CUS_DLV_CD(List list) { l_CUS_DLV_CD = list; }
	public void setList_CUS_DLV_KEY_CD(List list) { l_CUS_DLV_KEY_CD = list; }
	public void setList_h_REMAIN_UNCONFIRM_ODR_QTY(List list) { l_h_REMAIN_UNCONFIRM_ODR_QTY = list; }
	public void setList_CANCELED_UNCONFIRM_ODR_QTY(List list) { l_CANCELED_UNCONFIRM_ODR_QTY = list; }
	public void setList_h_SHIP_PLAN_REMAIN_QTY(List list) { l_h_SHIP_PLAN_REMAIN_QTY = list; }
	public void setList_SHIP_PLAN_CMPLT_FLG(List list) { l_SHIP_PLAN_CMPLT_FLG = list; }
	public void setList_PUCH_ODR_QTY_TOTAL(List list) { l_PUCH_ODR_QTY_TOTAL = list; }
	public void setList_REMARKS(List list) { l_REMARKS = list; }
	public void setList_DLV_LOC_CD(List list) { l_DLV_LOC_CD = list; }
	public void setList_DLV_LOC_NAME_KANJI(List list) { l_DLV_LOC_NAME_KANJI = list; }
	public void setList_CUST_ODR_NO(List list) { l_CUST_ODR_NO = list; }
	public void setList_h_ODR_NO(List list) { l_h_ODR_NO = list; }
	public void setList_RSLT_CTL_SEQ_CD(List list) { l_RSLT_CTL_SEQ_CD = list; }
	public void setList_ODR_CTL_NO(List list) { l_ODR_CTL_NO = list; }
	public void setList_h_ODR_TYP(List list) { l_h_ODR_TYP = list; }
	public void setList_CUST_CD(List list) { l_CUST_CD = list; }
	public void setList_CUST_ITEM_CD(List list) { l_CUST_ITEM_CD = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_UNIT_CD(List list) { l_UNIT_CD = list; }
	public void setList_CURRNCY_CD(List list) { l_CURRNCY_CD = list; }
	public void setList_DEPO_TYP(List list) { l_DEPO_TYP = list; }
	public void setList_CUST_CHRG_PSN_CD(List list) { l_CUST_CHRG_PSN_CD = list; }
	public void setList_ODR_ACPT_PSN_CD(List list) { l_ODR_ACPT_PSN_CD = list; }
	public void setList_ODR_ACPT_DATE(List list) { l_ODR_ACPT_DATE = list; }
	public void setList_fkgnALCTED_UNCONFIRM_ODR_NO(List list) { l_fkgnALCTED_UNCONFIRM_ODR_NO = list; }
	public void setList_fkgnALCTED_UNCONFIRM_ODR_QTY(List list) { l_fkgnALCTED_UNCONFIRM_ODR_QTY = list; }
	public void setList_fkgnALCTED_SEQ_CD(List list) { l_fkgnALCTED_SEQ_CD = list; }
	public void setList_fkgnREMAIN_UNCONFIRM_ODR_QTY(List list) { l_fkgnREMAIN_UNCONFIRM_ODR_QTY = list; }
	public void setList_fkgnODR_UNIT_PRICE(List list) { l_fkgnODR_UNIT_PRICE = list; }
	public void setList_fkgnCURRNCY_CD(List list) { l_fkgnCURRNCY_CD = list; }
	public void setList_fkgnODR_QTY(List list) { l_fkgnODR_QTY = list; }
	public void setList_fkgnODR_TYP(List list) { l_fkgnODR_TYP = list; }
	public void setList_fkgnFIXED_ODR_NO(List list) { l_fkgnFIXED_ODR_NO = list; }
	public void setList_fkgnDEL_FLG(List list) { l_fkgnDEL_FLG = list; }
	public void setList_fkgnUNCONFIRM_ODR_BALANCE(List list) { l_fkgnUNCONFIRM_ODR_BALANCE = list; }
	public void setList_fkgnODR_NO(List list) { l_fkgnODR_NO = list; }
	public void setList_IF_CTL_NO(List list) { l_IF_CTL_NO = list; }
	public void setList_UNIT_NAME(List list) { l_UNIT_NAME = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_CUST_ANAME(List list) { l_CUST_ANAME = list; }
	public void setList_EXCH_TYP(List list) { l_EXCH_TYP = list; }
	public void setList_DETAIL_ROUND_TYP(List list) { l_DETAIL_ROUND_TYP = list; }
	public void setList_CUST_ITEM_NAME(List list) { l_CUST_ITEM_NAME = list; }
	public void setList_ODR_TYP(List list) { l_ODR_TYP = list; }
	public void setList_CUST_CHRG_PSN_NAME(List list) { l_CUST_CHRG_PSN_NAME = list; }
	public void setList_CUST_CHRG_ORG_CD(List list) { l_CUST_CHRG_ORG_CD = list; }
	public void setList_CUST_CHRG_ORG_NAME(List list) { l_CUST_CHRG_ORG_NAME = list; }
	public void setList_h_MODIFY_COUNT(List list) { l_h_MODIFY_COUNT = list; }
	public void setList_h_ANS_DLV_DATE_EXIST_FLG(List list) { l_h_ANS_DLV_DATE_EXIST_FLG = list; }
	public void setList_h_T_SHIP_ODR_EXIST_FLG(List list) { l_h_T_SHIP_ODR_EXIST_FLG = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_PKG_UNIT(List list) { l_PKG_UNIT = list; }
	public void setList_UNIT_QTY_TYP(List list) { l_UNIT_QTY_TYP = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_h_ODR_UNIT_PRICE(List list) { l_h_ODR_UNIT_PRICE = list; }
	public void setList_h_BUSINESS_OPR_DATE(List list) { l_h_BUSINESS_OPR_DATE = list; }
	public void setList_DLV_LOC_NAME(List list) { l_DLV_LOC_NAME = list; }
	public void setList_ODR_NO(List list) { l_ODR_NO = list; }
	public void setList_REMAIN_UNCONFIRM_ODR_QTY(List list) { l_REMAIN_UNCONFIRM_ODR_QTY = list; }
	public void setList_BUSINESS_OPR_DATE(List list) { l_BUSINESS_OPR_DATE = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_CODE(List list) { l_CODE = list; }
	public void setList_CLASS_CODE(List list) { l_CLASS_CODE = list; }
	public void setList_MAX_ALCTED_SEQ_CD(List list) { l_MAX_ALCTED_SEQ_CD = list; }
	public void setList_MAX_ODR_NO(List list) { l_MAX_ODR_NO = list; }
	public void setList_h_ALCTED_UNCONFIRM_ODR_QTY(List list) { l_h_ALCTED_UNCONFIRM_ODR_QTY = list; }
	public void setList_IN_ODR_NO(List list) { l_IN_ODR_NO = list; }

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
			l_SPCL_PRICE_TYP_name.add(((KQ0010020Struct) list.get(i)).getSPCL_PRICE_TYP_name());
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
			l_SPCL_PRICE_TYP_val.add(((KQ0010020Struct) list.get(i)).getSPCL_PRICE_TYP_val());
		}
		return size;
	}
	public int setL2L_h_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ODR_QTY == null) {
			l_h_ODR_QTY = new ArrayList();
		} else {
			l_h_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ODR_QTY.add(((KQ0010020Struct) list.get(i)).geth_ODR_QTY());
		}
		return size;
	}
	public int setL2L_h_DESINATED_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_DESINATED_DLV_DATE == null) {
			l_h_DESINATED_DLV_DATE = new ArrayList();
		} else {
			l_h_DESINATED_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_DESINATED_DLV_DATE.add(((KQ0010020Struct) list.get(i)).geth_DESINATED_DLV_DATE());
		}
		return size;
	}
	public int setL2L_h_SPCL_PRICE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_SPCL_PRICE_TYP == null) {
			l_h_SPCL_PRICE_TYP = new ArrayList();
		} else {
			l_h_SPCL_PRICE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_SPCL_PRICE_TYP.add(((KQ0010020Struct) list.get(i)).geth_SPCL_PRICE_TYP());
		}
		return size;
	}
	public int setL2L_h_CUS_DLV_KEY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_CUS_DLV_KEY_CD == null) {
			l_h_CUS_DLV_KEY_CD = new ArrayList();
		} else {
			l_h_CUS_DLV_KEY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_CUS_DLV_KEY_CD.add(((KQ0010020Struct) list.get(i)).geth_CUS_DLV_KEY_CD());
		}
		return size;
	}
	public int setL2L_h_CUS_DLV_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_CUS_DLV_CD == null) {
			l_h_CUS_DLV_CD = new ArrayList();
		} else {
			l_h_CUS_DLV_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_CUS_DLV_CD.add(((KQ0010020Struct) list.get(i)).geth_CUS_DLV_CD());
		}
		return size;
	}
	public int setL2L_h_DLV_LOC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_DLV_LOC_CD == null) {
			l_h_DLV_LOC_CD = new ArrayList();
		} else {
			l_h_DLV_LOC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_DLV_LOC_CD.add(((KQ0010020Struct) list.get(i)).geth_DLV_LOC_CD());
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
			l_APPR_REMARKS.add(((KQ0010020Struct) list.get(i)).getAPPR_REMARKS());
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
			l_h_APR_ODR.add(((KQ0010020Struct) list.get(i)).geth_APR_ODR());
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
			l_ODR_UNIT_PRICE.add(((KQ0010020Struct) list.get(i)).getODR_UNIT_PRICE());
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
			l_SPCL_PRICE_TYP.add(((KQ0010020Struct) list.get(i)).getSPCL_PRICE_TYP());
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
			l_DESINATED_DLV_DATE.add(((KQ0010020Struct) list.get(i)).getDESINATED_DLV_DATE());
		}
		return size;
	}
	public int setL2L_STD_DESINATED_RCV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STD_DESINATED_RCV_DATE == null) {
			l_STD_DESINATED_RCV_DATE = new ArrayList();
		} else {
			l_STD_DESINATED_RCV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STD_DESINATED_RCV_DATE.add(((KQ0010020Struct) list.get(i)).getSTD_DESINATED_RCV_DATE());
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
			l_ODR_QTY.add(((KQ0010020Struct) list.get(i)).getODR_QTY());
		}
		return size;
	}
	public int setL2L_UNCONFIRM_ODR_BALANCE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNCONFIRM_ODR_BALANCE == null) {
			l_UNCONFIRM_ODR_BALANCE = new ArrayList();
		} else {
			l_UNCONFIRM_ODR_BALANCE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNCONFIRM_ODR_BALANCE.add(((KQ0010020Struct) list.get(i)).getUNCONFIRM_ODR_BALANCE());
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
			l_ODR_AMOUNT.add(((KQ0010020Struct) list.get(i)).getODR_AMOUNT());
		}
		return size;
	}
	public int setL2L_ODR_AMOUNT_EXCH_RATES(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_AMOUNT_EXCH_RATES == null) {
			l_ODR_AMOUNT_EXCH_RATES = new ArrayList();
		} else {
			l_ODR_AMOUNT_EXCH_RATES.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_AMOUNT_EXCH_RATES.add(((KQ0010020Struct) list.get(i)).getODR_AMOUNT_EXCH_RATES());
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
			l_CUS_DLV_CD.add(((KQ0010020Struct) list.get(i)).getCUS_DLV_CD());
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
			l_CUS_DLV_KEY_CD.add(((KQ0010020Struct) list.get(i)).getCUS_DLV_KEY_CD());
		}
		return size;
	}
	public int setL2L_h_REMAIN_UNCONFIRM_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_REMAIN_UNCONFIRM_ODR_QTY == null) {
			l_h_REMAIN_UNCONFIRM_ODR_QTY = new ArrayList();
		} else {
			l_h_REMAIN_UNCONFIRM_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_REMAIN_UNCONFIRM_ODR_QTY.add(((KQ0010020Struct) list.get(i)).geth_REMAIN_UNCONFIRM_ODR_QTY());
		}
		return size;
	}
	public int setL2L_CANCELED_UNCONFIRM_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CANCELED_UNCONFIRM_ODR_QTY == null) {
			l_CANCELED_UNCONFIRM_ODR_QTY = new ArrayList();
		} else {
			l_CANCELED_UNCONFIRM_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CANCELED_UNCONFIRM_ODR_QTY.add(((KQ0010020Struct) list.get(i)).getCANCELED_UNCONFIRM_ODR_QTY());
		}
		return size;
	}
	public int setL2L_h_SHIP_PLAN_REMAIN_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_SHIP_PLAN_REMAIN_QTY == null) {
			l_h_SHIP_PLAN_REMAIN_QTY = new ArrayList();
		} else {
			l_h_SHIP_PLAN_REMAIN_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_SHIP_PLAN_REMAIN_QTY.add(((KQ0010020Struct) list.get(i)).geth_SHIP_PLAN_REMAIN_QTY());
		}
		return size;
	}
	public int setL2L_SHIP_PLAN_CMPLT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SHIP_PLAN_CMPLT_FLG == null) {
			l_SHIP_PLAN_CMPLT_FLG = new ArrayList();
		} else {
			l_SHIP_PLAN_CMPLT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SHIP_PLAN_CMPLT_FLG.add(((KQ0010020Struct) list.get(i)).getSHIP_PLAN_CMPLT_FLG());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_QTY_TOTAL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_QTY_TOTAL == null) {
			l_PUCH_ODR_QTY_TOTAL = new ArrayList();
		} else {
			l_PUCH_ODR_QTY_TOTAL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_QTY_TOTAL.add(((KQ0010020Struct) list.get(i)).getPUCH_ODR_QTY_TOTAL());
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
			l_REMARKS.add(((KQ0010020Struct) list.get(i)).getREMARKS());
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
			l_DLV_LOC_CD.add(((KQ0010020Struct) list.get(i)).getDLV_LOC_CD());
		}
		return size;
	}
	public int setL2L_DLV_LOC_NAME_KANJI(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DLV_LOC_NAME_KANJI == null) {
			l_DLV_LOC_NAME_KANJI = new ArrayList();
		} else {
			l_DLV_LOC_NAME_KANJI.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DLV_LOC_NAME_KANJI.add(((KQ0010020Struct) list.get(i)).getDLV_LOC_NAME_KANJI());
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
			l_CUST_ODR_NO.add(((KQ0010020Struct) list.get(i)).getCUST_ODR_NO());
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
			l_h_ODR_NO.add(((KQ0010020Struct) list.get(i)).geth_ODR_NO());
		}
		return size;
	}
	public int setL2L_RSLT_CTL_SEQ_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RSLT_CTL_SEQ_CD == null) {
			l_RSLT_CTL_SEQ_CD = new ArrayList();
		} else {
			l_RSLT_CTL_SEQ_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RSLT_CTL_SEQ_CD.add(((KQ0010020Struct) list.get(i)).getRSLT_CTL_SEQ_CD());
		}
		return size;
	}
	public int setL2L_ODR_CTL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_CTL_NO == null) {
			l_ODR_CTL_NO = new ArrayList();
		} else {
			l_ODR_CTL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_CTL_NO.add(((KQ0010020Struct) list.get(i)).getODR_CTL_NO());
		}
		return size;
	}
	public int setL2L_h_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ODR_TYP == null) {
			l_h_ODR_TYP = new ArrayList();
		} else {
			l_h_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ODR_TYP.add(((KQ0010020Struct) list.get(i)).geth_ODR_TYP());
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
			l_CUST_CD.add(((KQ0010020Struct) list.get(i)).getCUST_CD());
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
			l_CUST_ITEM_CD.add(((KQ0010020Struct) list.get(i)).getCUST_ITEM_CD());
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
			l_ITEM_CD.add(((KQ0010020Struct) list.get(i)).getITEM_CD());
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
			l_UNIT_CD.add(((KQ0010020Struct) list.get(i)).getUNIT_CD());
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
			l_CURRNCY_CD.add(((KQ0010020Struct) list.get(i)).getCURRNCY_CD());
		}
		return size;
	}
	public int setL2L_DEPO_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEPO_TYP == null) {
			l_DEPO_TYP = new ArrayList();
		} else {
			l_DEPO_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEPO_TYP.add(((KQ0010020Struct) list.get(i)).getDEPO_TYP());
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
			l_CUST_CHRG_PSN_CD.add(((KQ0010020Struct) list.get(i)).getCUST_CHRG_PSN_CD());
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
			l_ODR_ACPT_PSN_CD.add(((KQ0010020Struct) list.get(i)).getODR_ACPT_PSN_CD());
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
			l_ODR_ACPT_DATE.add(((KQ0010020Struct) list.get(i)).getODR_ACPT_DATE());
		}
		return size;
	}
	public int setL2L_fkgnALCTED_UNCONFIRM_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_fkgnALCTED_UNCONFIRM_ODR_NO == null) {
			l_fkgnALCTED_UNCONFIRM_ODR_NO = new ArrayList();
		} else {
			l_fkgnALCTED_UNCONFIRM_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_fkgnALCTED_UNCONFIRM_ODR_NO.add(((KQ0010020Struct) list.get(i)).getfkgnALCTED_UNCONFIRM_ODR_NO());
		}
		return size;
	}
	public int setL2L_fkgnALCTED_UNCONFIRM_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_fkgnALCTED_UNCONFIRM_ODR_QTY == null) {
			l_fkgnALCTED_UNCONFIRM_ODR_QTY = new ArrayList();
		} else {
			l_fkgnALCTED_UNCONFIRM_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_fkgnALCTED_UNCONFIRM_ODR_QTY.add(((KQ0010020Struct) list.get(i)).getfkgnALCTED_UNCONFIRM_ODR_QTY());
		}
		return size;
	}
	public int setL2L_fkgnALCTED_SEQ_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_fkgnALCTED_SEQ_CD == null) {
			l_fkgnALCTED_SEQ_CD = new ArrayList();
		} else {
			l_fkgnALCTED_SEQ_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_fkgnALCTED_SEQ_CD.add(((KQ0010020Struct) list.get(i)).getfkgnALCTED_SEQ_CD());
		}
		return size;
	}
	public int setL2L_fkgnREMAIN_UNCONFIRM_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_fkgnREMAIN_UNCONFIRM_ODR_QTY == null) {
			l_fkgnREMAIN_UNCONFIRM_ODR_QTY = new ArrayList();
		} else {
			l_fkgnREMAIN_UNCONFIRM_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_fkgnREMAIN_UNCONFIRM_ODR_QTY.add(((KQ0010020Struct) list.get(i)).getfkgnREMAIN_UNCONFIRM_ODR_QTY());
		}
		return size;
	}
	public int setL2L_fkgnODR_UNIT_PRICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_fkgnODR_UNIT_PRICE == null) {
			l_fkgnODR_UNIT_PRICE = new ArrayList();
		} else {
			l_fkgnODR_UNIT_PRICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_fkgnODR_UNIT_PRICE.add(((KQ0010020Struct) list.get(i)).getfkgnODR_UNIT_PRICE());
		}
		return size;
	}
	public int setL2L_fkgnCURRNCY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_fkgnCURRNCY_CD == null) {
			l_fkgnCURRNCY_CD = new ArrayList();
		} else {
			l_fkgnCURRNCY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_fkgnCURRNCY_CD.add(((KQ0010020Struct) list.get(i)).getfkgnCURRNCY_CD());
		}
		return size;
	}
	public int setL2L_fkgnODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_fkgnODR_QTY == null) {
			l_fkgnODR_QTY = new ArrayList();
		} else {
			l_fkgnODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_fkgnODR_QTY.add(((KQ0010020Struct) list.get(i)).getfkgnODR_QTY());
		}
		return size;
	}
	public int setL2L_fkgnODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_fkgnODR_TYP == null) {
			l_fkgnODR_TYP = new ArrayList();
		} else {
			l_fkgnODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_fkgnODR_TYP.add(((KQ0010020Struct) list.get(i)).getfkgnODR_TYP());
		}
		return size;
	}
	public int setL2L_fkgnFIXED_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_fkgnFIXED_ODR_NO == null) {
			l_fkgnFIXED_ODR_NO = new ArrayList();
		} else {
			l_fkgnFIXED_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_fkgnFIXED_ODR_NO.add(((KQ0010020Struct) list.get(i)).getfkgnFIXED_ODR_NO());
		}
		return size;
	}
	public int setL2L_fkgnDEL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_fkgnDEL_FLG == null) {
			l_fkgnDEL_FLG = new ArrayList();
		} else {
			l_fkgnDEL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_fkgnDEL_FLG.add(((KQ0010020Struct) list.get(i)).getfkgnDEL_FLG());
		}
		return size;
	}
	public int setL2L_fkgnUNCONFIRM_ODR_BALANCE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_fkgnUNCONFIRM_ODR_BALANCE == null) {
			l_fkgnUNCONFIRM_ODR_BALANCE = new ArrayList();
		} else {
			l_fkgnUNCONFIRM_ODR_BALANCE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_fkgnUNCONFIRM_ODR_BALANCE.add(((KQ0010020Struct) list.get(i)).getfkgnUNCONFIRM_ODR_BALANCE());
		}
		return size;
	}
	public int setL2L_fkgnODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_fkgnODR_NO == null) {
			l_fkgnODR_NO = new ArrayList();
		} else {
			l_fkgnODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_fkgnODR_NO.add(((KQ0010020Struct) list.get(i)).getfkgnODR_NO());
		}
		return size;
	}
	public int setL2L_IF_CTL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IF_CTL_NO == null) {
			l_IF_CTL_NO = new ArrayList();
		} else {
			l_IF_CTL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IF_CTL_NO.add(((KQ0010020Struct) list.get(i)).getIF_CTL_NO());
		}
		return size;
	}
	public int setL2L_UNIT_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_NAME == null) {
			l_UNIT_NAME = new ArrayList();
		} else {
			l_UNIT_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_NAME.add(((KQ0010020Struct) list.get(i)).getUNIT_NAME());
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
			l_ITEM_NAME.add(((KQ0010020Struct) list.get(i)).getITEM_NAME());
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
			l_CUST_ANAME.add(((KQ0010020Struct) list.get(i)).getCUST_ANAME());
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
			l_EXCH_TYP.add(((KQ0010020Struct) list.get(i)).getEXCH_TYP());
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
			l_DETAIL_ROUND_TYP.add(((KQ0010020Struct) list.get(i)).getDETAIL_ROUND_TYP());
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
			l_CUST_ITEM_NAME.add(((KQ0010020Struct) list.get(i)).getCUST_ITEM_NAME());
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
			l_ODR_TYP.add(((KQ0010020Struct) list.get(i)).getODR_TYP());
		}
		return size;
	}
	public int setL2L_CUST_CHRG_PSN_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_CHRG_PSN_NAME == null) {
			l_CUST_CHRG_PSN_NAME = new ArrayList();
		} else {
			l_CUST_CHRG_PSN_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_CHRG_PSN_NAME.add(((KQ0010020Struct) list.get(i)).getCUST_CHRG_PSN_NAME());
		}
		return size;
	}
	public int setL2L_CUST_CHRG_ORG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_CHRG_ORG_CD == null) {
			l_CUST_CHRG_ORG_CD = new ArrayList();
		} else {
			l_CUST_CHRG_ORG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_CHRG_ORG_CD.add(((KQ0010020Struct) list.get(i)).getCUST_CHRG_ORG_CD());
		}
		return size;
	}
	public int setL2L_CUST_CHRG_ORG_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUST_CHRG_ORG_NAME == null) {
			l_CUST_CHRG_ORG_NAME = new ArrayList();
		} else {
			l_CUST_CHRG_ORG_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUST_CHRG_ORG_NAME.add(((KQ0010020Struct) list.get(i)).getCUST_CHRG_ORG_NAME());
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
			l_h_MODIFY_COUNT.add(((KQ0010020Struct) list.get(i)).geth_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_h_ANS_DLV_DATE_EXIST_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ANS_DLV_DATE_EXIST_FLG == null) {
			l_h_ANS_DLV_DATE_EXIST_FLG = new ArrayList();
		} else {
			l_h_ANS_DLV_DATE_EXIST_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ANS_DLV_DATE_EXIST_FLG.add(((KQ0010020Struct) list.get(i)).geth_ANS_DLV_DATE_EXIST_FLG());
		}
		return size;
	}
	public int setL2L_h_T_SHIP_ODR_EXIST_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_T_SHIP_ODR_EXIST_FLG == null) {
			l_h_T_SHIP_ODR_EXIST_FLG = new ArrayList();
		} else {
			l_h_T_SHIP_ODR_EXIST_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_T_SHIP_ODR_EXIST_FLG.add(((KQ0010020Struct) list.get(i)).geth_T_SHIP_ODR_EXIST_FLG());
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
			l_STOCK_UNIT.add(((KQ0010020Struct) list.get(i)).getSTOCK_UNIT());
		}
		return size;
	}
	public int setL2L_PKG_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PKG_UNIT == null) {
			l_PKG_UNIT = new ArrayList();
		} else {
			l_PKG_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PKG_UNIT.add(((KQ0010020Struct) list.get(i)).getPKG_UNIT());
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
			l_UNIT_QTY_TYP.add(((KQ0010020Struct) list.get(i)).getUNIT_QTY_TYP());
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
			l_COMPANY_CD.add(((KQ0010020Struct) list.get(i)).getCOMPANY_CD());
		}
		return size;
	}
	public int setL2L_h_ODR_UNIT_PRICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ODR_UNIT_PRICE == null) {
			l_h_ODR_UNIT_PRICE = new ArrayList();
		} else {
			l_h_ODR_UNIT_PRICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ODR_UNIT_PRICE.add(((KQ0010020Struct) list.get(i)).geth_ODR_UNIT_PRICE());
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
			l_h_BUSINESS_OPR_DATE.add(((KQ0010020Struct) list.get(i)).geth_BUSINESS_OPR_DATE());
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
			l_DLV_LOC_NAME.add(((KQ0010020Struct) list.get(i)).getDLV_LOC_NAME());
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
			l_ODR_NO.add(((KQ0010020Struct) list.get(i)).getODR_NO());
		}
		return size;
	}
	public int setL2L_REMAIN_UNCONFIRM_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_REMAIN_UNCONFIRM_ODR_QTY == null) {
			l_REMAIN_UNCONFIRM_ODR_QTY = new ArrayList();
		} else {
			l_REMAIN_UNCONFIRM_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_REMAIN_UNCONFIRM_ODR_QTY.add(((KQ0010020Struct) list.get(i)).getREMAIN_UNCONFIRM_ODR_QTY());
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
			l_BUSINESS_OPR_DATE.add(((KQ0010020Struct) list.get(i)).getBUSINESS_OPR_DATE());
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
			l_PLANT_CD.add(((KQ0010020Struct) list.get(i)).getPLANT_CD());
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
			l_CODE.add(((KQ0010020Struct) list.get(i)).getCODE());
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
			l_CLASS_CODE.add(((KQ0010020Struct) list.get(i)).getCLASS_CODE());
		}
		return size;
	}
	public int setL2L_MAX_ALCTED_SEQ_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MAX_ALCTED_SEQ_CD == null) {
			l_MAX_ALCTED_SEQ_CD = new ArrayList();
		} else {
			l_MAX_ALCTED_SEQ_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MAX_ALCTED_SEQ_CD.add(((KQ0010020Struct) list.get(i)).getMAX_ALCTED_SEQ_CD());
		}
		return size;
	}
	public int setL2L_MAX_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MAX_ODR_NO == null) {
			l_MAX_ODR_NO = new ArrayList();
		} else {
			l_MAX_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MAX_ODR_NO.add(((KQ0010020Struct) list.get(i)).getMAX_ODR_NO());
		}
		return size;
	}
	public int setL2L_h_ALCTED_UNCONFIRM_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ALCTED_UNCONFIRM_ODR_QTY == null) {
			l_h_ALCTED_UNCONFIRM_ODR_QTY = new ArrayList();
		} else {
			l_h_ALCTED_UNCONFIRM_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ALCTED_UNCONFIRM_ODR_QTY.add(((KQ0010020Struct) list.get(i)).geth_ALCTED_UNCONFIRM_ODR_QTY());
		}
		return size;
	}
	public int setL2L_IN_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_ODR_NO == null) {
			l_IN_ODR_NO = new ArrayList();
		} else {
			l_IN_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_ODR_NO.add(((KQ0010020Struct) list.get(i)).getIN_ODR_NO());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_SPCL_PRICE_TYP_name = null;
		m_SPCL_PRICE_TYP_val = null;
		m_h_ODR_QTY = null;
		m_h_DESINATED_DLV_DATE = null;
		m_h_SPCL_PRICE_TYP = null;
		m_h_CUS_DLV_KEY_CD = null;
		m_h_CUS_DLV_CD = null;
		m_h_DLV_LOC_CD = null;
		m_APPR_REMARKS = null;
		m_h_APR_ODR = null;
		m_ODR_UNIT_PRICE = null;
		m_SPCL_PRICE_TYP = null;
		m_DESINATED_DLV_DATE = null;
		m_STD_DESINATED_RCV_DATE = null;
		m_ODR_QTY = null;
		m_UNCONFIRM_ODR_BALANCE = null;
		m_ODR_AMOUNT = null;
		m_ODR_AMOUNT_EXCH_RATES = null;
		m_CUS_DLV_CD = null;
		m_CUS_DLV_KEY_CD = null;
		m_h_REMAIN_UNCONFIRM_ODR_QTY = null;
		m_CANCELED_UNCONFIRM_ODR_QTY = null;
		m_h_SHIP_PLAN_REMAIN_QTY = null;
		m_SHIP_PLAN_CMPLT_FLG = null;
		m_PUCH_ODR_QTY_TOTAL = null;
		m_REMARKS = null;
		m_DLV_LOC_CD = null;
		m_DLV_LOC_NAME_KANJI = null;
		m_CUST_ODR_NO = null;
		m_h_ODR_NO = null;
		m_RSLT_CTL_SEQ_CD = null;
		m_ODR_CTL_NO = null;
		m_h_ODR_TYP = null;
		m_CUST_CD = null;
		m_CUST_ITEM_CD = null;
		m_ITEM_CD = null;
		m_UNIT_CD = null;
		m_CURRNCY_CD = null;
		m_DEPO_TYP = null;
		m_CUST_CHRG_PSN_CD = null;
		m_ODR_ACPT_PSN_CD = null;
		m_ODR_ACPT_DATE = null;
		m_fkgnALCTED_UNCONFIRM_ODR_NO = null;
		m_fkgnALCTED_UNCONFIRM_ODR_QTY = null;
		m_fkgnALCTED_SEQ_CD = null;
		m_fkgnREMAIN_UNCONFIRM_ODR_QTY = null;
		m_fkgnODR_UNIT_PRICE = null;
		m_fkgnCURRNCY_CD = null;
		m_fkgnODR_QTY = null;
		m_fkgnODR_TYP = null;
		m_fkgnFIXED_ODR_NO = null;
		m_fkgnDEL_FLG = null;
		m_fkgnUNCONFIRM_ODR_BALANCE = null;
		m_fkgnODR_NO = null;
		m_IF_CTL_NO = null;
		m_UNIT_NAME = null;
		m_ITEM_NAME = null;
		m_CUST_ANAME = null;
		m_EXCH_TYP = null;
		m_DETAIL_ROUND_TYP = null;
		m_CUST_ITEM_NAME = null;
		m_ODR_TYP = null;
		m_CUST_CHRG_PSN_NAME = null;
		m_CUST_CHRG_ORG_CD = null;
		m_CUST_CHRG_ORG_NAME = null;
		m_h_MODIFY_COUNT = null;
		m_h_ANS_DLV_DATE_EXIST_FLG = null;
		m_h_T_SHIP_ODR_EXIST_FLG = null;
		m_STOCK_UNIT = null;
		m_PKG_UNIT = null;
		m_UNIT_QTY_TYP = null;
		m_COMPANY_CD = null;
		m_h_ODR_UNIT_PRICE = null;
		m_h_BUSINESS_OPR_DATE = null;
		m_DLV_LOC_NAME = null;
		m_ODR_NO = null;
		m_REMAIN_UNCONFIRM_ODR_QTY = null;
		m_BUSINESS_OPR_DATE = null;
		m_PLANT_CD = null;
		m_CODE = null;
		m_CLASS_CODE = null;
		m_MAX_ALCTED_SEQ_CD = null;
		m_MAX_ODR_NO = null;
		m_h_ALCTED_UNCONFIRM_ODR_QTY = null;
		m_IN_ODR_NO = null;

		l_SPCL_PRICE_TYP_name = null;
		l_SPCL_PRICE_TYP_val = null;
		l_h_ODR_QTY = null;
		l_h_DESINATED_DLV_DATE = null;
		l_h_SPCL_PRICE_TYP = null;
		l_h_CUS_DLV_KEY_CD = null;
		l_h_CUS_DLV_CD = null;
		l_h_DLV_LOC_CD = null;
		l_APPR_REMARKS = null;
		l_h_APR_ODR = null;
		l_ODR_UNIT_PRICE = null;
		l_SPCL_PRICE_TYP = null;
		l_DESINATED_DLV_DATE = null;
		l_STD_DESINATED_RCV_DATE = null;
		l_ODR_QTY = null;
		l_UNCONFIRM_ODR_BALANCE = null;
		l_ODR_AMOUNT = null;
		l_ODR_AMOUNT_EXCH_RATES = null;
		l_CUS_DLV_CD = null;
		l_CUS_DLV_KEY_CD = null;
		l_h_REMAIN_UNCONFIRM_ODR_QTY = null;
		l_CANCELED_UNCONFIRM_ODR_QTY = null;
		l_h_SHIP_PLAN_REMAIN_QTY = null;
		l_SHIP_PLAN_CMPLT_FLG = null;
		l_PUCH_ODR_QTY_TOTAL = null;
		l_REMARKS = null;
		l_DLV_LOC_CD = null;
		l_DLV_LOC_NAME_KANJI = null;
		l_CUST_ODR_NO = null;
		l_h_ODR_NO = null;
		l_RSLT_CTL_SEQ_CD = null;
		l_ODR_CTL_NO = null;
		l_h_ODR_TYP = null;
		l_CUST_CD = null;
		l_CUST_ITEM_CD = null;
		l_ITEM_CD = null;
		l_UNIT_CD = null;
		l_CURRNCY_CD = null;
		l_DEPO_TYP = null;
		l_CUST_CHRG_PSN_CD = null;
		l_ODR_ACPT_PSN_CD = null;
		l_ODR_ACPT_DATE = null;
		l_fkgnALCTED_UNCONFIRM_ODR_NO = null;
		l_fkgnALCTED_UNCONFIRM_ODR_QTY = null;
		l_fkgnALCTED_SEQ_CD = null;
		l_fkgnREMAIN_UNCONFIRM_ODR_QTY = null;
		l_fkgnODR_UNIT_PRICE = null;
		l_fkgnCURRNCY_CD = null;
		l_fkgnODR_QTY = null;
		l_fkgnODR_TYP = null;
		l_fkgnFIXED_ODR_NO = null;
		l_fkgnDEL_FLG = null;
		l_fkgnUNCONFIRM_ODR_BALANCE = null;
		l_fkgnODR_NO = null;
		l_IF_CTL_NO = null;
		l_UNIT_NAME = null;
		l_ITEM_NAME = null;
		l_CUST_ANAME = null;
		l_EXCH_TYP = null;
		l_DETAIL_ROUND_TYP = null;
		l_CUST_ITEM_NAME = null;
		l_ODR_TYP = null;
		l_CUST_CHRG_PSN_NAME = null;
		l_CUST_CHRG_ORG_CD = null;
		l_CUST_CHRG_ORG_NAME = null;
		l_h_MODIFY_COUNT = null;
		l_h_ANS_DLV_DATE_EXIST_FLG = null;
		l_h_T_SHIP_ODR_EXIST_FLG = null;
		l_STOCK_UNIT = null;
		l_PKG_UNIT = null;
		l_UNIT_QTY_TYP = null;
		l_COMPANY_CD = null;
		l_h_ODR_UNIT_PRICE = null;
		l_h_BUSINESS_OPR_DATE = null;
		l_DLV_LOC_NAME = null;
		l_ODR_NO = null;
		l_REMAIN_UNCONFIRM_ODR_QTY = null;
		l_BUSINESS_OPR_DATE = null;
		l_PLANT_CD = null;
		l_CODE = null;
		l_CLASS_CODE = null;
		l_MAX_ALCTED_SEQ_CD = null;
		l_MAX_ODR_NO = null;
		l_h_ALCTED_UNCONFIRM_ODR_QTY = null;
		l_IN_ODR_NO = null;

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
	 * medKQ0010020�N���X�̕W���R���X�g���N�^
	 */
	public KQ0010020Struct()
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
	public void setStruct(KQ0010020Struct struct)
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
	public void setStructM(KQ0010020Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setSPCL_PRICE_TYP_name(struct.getSPCL_PRICE_TYP_name());
			this.setSPCL_PRICE_TYP_val(struct.getSPCL_PRICE_TYP_val());
			this.seth_ODR_QTY(struct.geth_ODR_QTY());
			this.seth_DESINATED_DLV_DATE(struct.geth_DESINATED_DLV_DATE());
			this.seth_SPCL_PRICE_TYP(struct.geth_SPCL_PRICE_TYP());
			this.seth_CUS_DLV_KEY_CD(struct.geth_CUS_DLV_KEY_CD());
			this.seth_CUS_DLV_CD(struct.geth_CUS_DLV_CD());
			this.seth_DLV_LOC_CD(struct.geth_DLV_LOC_CD());
			this.setAPPR_REMARKS(struct.getAPPR_REMARKS());
			this.seth_APR_ODR(struct.geth_APR_ODR());
			this.setODR_UNIT_PRICE(struct.getODR_UNIT_PRICE());
			this.setSPCL_PRICE_TYP(struct.getSPCL_PRICE_TYP());
			this.setDESINATED_DLV_DATE(struct.getDESINATED_DLV_DATE());
			this.setSTD_DESINATED_RCV_DATE(struct.getSTD_DESINATED_RCV_DATE());
			this.setODR_QTY(struct.getODR_QTY());
			this.setUNCONFIRM_ODR_BALANCE(struct.getUNCONFIRM_ODR_BALANCE());
			this.setODR_AMOUNT(struct.getODR_AMOUNT());
			this.setODR_AMOUNT_EXCH_RATES(struct.getODR_AMOUNT_EXCH_RATES());
			this.setCUS_DLV_CD(struct.getCUS_DLV_CD());
			this.setCUS_DLV_KEY_CD(struct.getCUS_DLV_KEY_CD());
			this.seth_REMAIN_UNCONFIRM_ODR_QTY(struct.geth_REMAIN_UNCONFIRM_ODR_QTY());
			this.setCANCELED_UNCONFIRM_ODR_QTY(struct.getCANCELED_UNCONFIRM_ODR_QTY());
			this.seth_SHIP_PLAN_REMAIN_QTY(struct.geth_SHIP_PLAN_REMAIN_QTY());
			this.setSHIP_PLAN_CMPLT_FLG(struct.getSHIP_PLAN_CMPLT_FLG());
			this.setPUCH_ODR_QTY_TOTAL(struct.getPUCH_ODR_QTY_TOTAL());
			this.setREMARKS(struct.getREMARKS());
			this.setDLV_LOC_CD(struct.getDLV_LOC_CD());
			this.setDLV_LOC_NAME_KANJI(struct.getDLV_LOC_NAME_KANJI());
			this.setCUST_ODR_NO(struct.getCUST_ODR_NO());
			this.seth_ODR_NO(struct.geth_ODR_NO());
			this.setRSLT_CTL_SEQ_CD(struct.getRSLT_CTL_SEQ_CD());
			this.setODR_CTL_NO(struct.getODR_CTL_NO());
			this.seth_ODR_TYP(struct.geth_ODR_TYP());
			this.setCUST_CD(struct.getCUST_CD());
			this.setCUST_ITEM_CD(struct.getCUST_ITEM_CD());
			this.setITEM_CD(struct.getITEM_CD());
			this.setUNIT_CD(struct.getUNIT_CD());
			this.setCURRNCY_CD(struct.getCURRNCY_CD());
			this.setDEPO_TYP(struct.getDEPO_TYP());
			this.setCUST_CHRG_PSN_CD(struct.getCUST_CHRG_PSN_CD());
			this.setODR_ACPT_PSN_CD(struct.getODR_ACPT_PSN_CD());
			this.setODR_ACPT_DATE(struct.getODR_ACPT_DATE());
			this.setfkgnALCTED_UNCONFIRM_ODR_NO(struct.getfkgnALCTED_UNCONFIRM_ODR_NO());
			this.setfkgnALCTED_UNCONFIRM_ODR_QTY(struct.getfkgnALCTED_UNCONFIRM_ODR_QTY());
			this.setfkgnALCTED_SEQ_CD(struct.getfkgnALCTED_SEQ_CD());
			this.setfkgnREMAIN_UNCONFIRM_ODR_QTY(struct.getfkgnREMAIN_UNCONFIRM_ODR_QTY());
			this.setfkgnODR_UNIT_PRICE(struct.getfkgnODR_UNIT_PRICE());
			this.setfkgnCURRNCY_CD(struct.getfkgnCURRNCY_CD());
			this.setfkgnODR_QTY(struct.getfkgnODR_QTY());
			this.setfkgnODR_TYP(struct.getfkgnODR_TYP());
			this.setfkgnFIXED_ODR_NO(struct.getfkgnFIXED_ODR_NO());
			this.setfkgnDEL_FLG(struct.getfkgnDEL_FLG());
			this.setfkgnUNCONFIRM_ODR_BALANCE(struct.getfkgnUNCONFIRM_ODR_BALANCE());
			this.setfkgnODR_NO(struct.getfkgnODR_NO());
			this.setIF_CTL_NO(struct.getIF_CTL_NO());
			this.setUNIT_NAME(struct.getUNIT_NAME());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setCUST_ANAME(struct.getCUST_ANAME());
			this.setEXCH_TYP(struct.getEXCH_TYP());
			this.setDETAIL_ROUND_TYP(struct.getDETAIL_ROUND_TYP());
			this.setCUST_ITEM_NAME(struct.getCUST_ITEM_NAME());
			this.setODR_TYP(struct.getODR_TYP());
			this.setCUST_CHRG_PSN_NAME(struct.getCUST_CHRG_PSN_NAME());
			this.setCUST_CHRG_ORG_CD(struct.getCUST_CHRG_ORG_CD());
			this.setCUST_CHRG_ORG_NAME(struct.getCUST_CHRG_ORG_NAME());
			this.seth_MODIFY_COUNT(struct.geth_MODIFY_COUNT());
			this.seth_ANS_DLV_DATE_EXIST_FLG(struct.geth_ANS_DLV_DATE_EXIST_FLG());
			this.seth_T_SHIP_ODR_EXIST_FLG(struct.geth_T_SHIP_ODR_EXIST_FLG());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setPKG_UNIT(struct.getPKG_UNIT());
			this.setUNIT_QTY_TYP(struct.getUNIT_QTY_TYP());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.seth_ODR_UNIT_PRICE(struct.geth_ODR_UNIT_PRICE());
			this.seth_BUSINESS_OPR_DATE(struct.geth_BUSINESS_OPR_DATE());
			this.setDLV_LOC_NAME(struct.getDLV_LOC_NAME());
			this.setODR_NO(struct.getODR_NO());
			this.setREMAIN_UNCONFIRM_ODR_QTY(struct.getREMAIN_UNCONFIRM_ODR_QTY());
			this.setBUSINESS_OPR_DATE(struct.getBUSINESS_OPR_DATE());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setCODE(struct.getCODE());
			this.setCLASS_CODE(struct.getCLASS_CODE());
			this.setMAX_ALCTED_SEQ_CD(struct.getMAX_ALCTED_SEQ_CD());
			this.setMAX_ODR_NO(struct.getMAX_ODR_NO());
			this.seth_ALCTED_UNCONFIRM_ODR_QTY(struct.geth_ALCTED_UNCONFIRM_ODR_QTY());
			this.setIN_ODR_NO(struct.getIN_ODR_NO());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(KQ0010020Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_SPCL_PRICE_TYP_name(struct.getList_SPCL_PRICE_TYP_name());
			this.setList_SPCL_PRICE_TYP_val(struct.getList_SPCL_PRICE_TYP_val());
			this.setList_h_ODR_QTY(struct.getList_h_ODR_QTY());
			this.setList_h_DESINATED_DLV_DATE(struct.getList_h_DESINATED_DLV_DATE());
			this.setList_h_SPCL_PRICE_TYP(struct.getList_h_SPCL_PRICE_TYP());
			this.setList_h_CUS_DLV_KEY_CD(struct.getList_h_CUS_DLV_KEY_CD());
			this.setList_h_CUS_DLV_CD(struct.getList_h_CUS_DLV_CD());
			this.setList_h_DLV_LOC_CD(struct.getList_h_DLV_LOC_CD());
			this.setList_APPR_REMARKS(struct.getList_APPR_REMARKS());
			this.setList_h_APR_ODR(struct.getList_h_APR_ODR());
			this.setList_ODR_UNIT_PRICE(struct.getList_ODR_UNIT_PRICE());
			this.setList_SPCL_PRICE_TYP(struct.getList_SPCL_PRICE_TYP());
			this.setList_DESINATED_DLV_DATE(struct.getList_DESINATED_DLV_DATE());
			this.setList_STD_DESINATED_RCV_DATE(struct.getList_STD_DESINATED_RCV_DATE());
			this.setList_ODR_QTY(struct.getList_ODR_QTY());
			this.setList_UNCONFIRM_ODR_BALANCE(struct.getList_UNCONFIRM_ODR_BALANCE());
			this.setList_ODR_AMOUNT(struct.getList_ODR_AMOUNT());
			this.setList_ODR_AMOUNT_EXCH_RATES(struct.getList_ODR_AMOUNT_EXCH_RATES());
			this.setList_CUS_DLV_CD(struct.getList_CUS_DLV_CD());
			this.setList_CUS_DLV_KEY_CD(struct.getList_CUS_DLV_KEY_CD());
			this.setList_h_REMAIN_UNCONFIRM_ODR_QTY(struct.getList_h_REMAIN_UNCONFIRM_ODR_QTY());
			this.setList_CANCELED_UNCONFIRM_ODR_QTY(struct.getList_CANCELED_UNCONFIRM_ODR_QTY());
			this.setList_h_SHIP_PLAN_REMAIN_QTY(struct.getList_h_SHIP_PLAN_REMAIN_QTY());
			this.setList_SHIP_PLAN_CMPLT_FLG(struct.getList_SHIP_PLAN_CMPLT_FLG());
			this.setList_PUCH_ODR_QTY_TOTAL(struct.getList_PUCH_ODR_QTY_TOTAL());
			this.setList_REMARKS(struct.getList_REMARKS());
			this.setList_DLV_LOC_CD(struct.getList_DLV_LOC_CD());
			this.setList_DLV_LOC_NAME_KANJI(struct.getList_DLV_LOC_NAME_KANJI());
			this.setList_CUST_ODR_NO(struct.getList_CUST_ODR_NO());
			this.setList_h_ODR_NO(struct.getList_h_ODR_NO());
			this.setList_RSLT_CTL_SEQ_CD(struct.getList_RSLT_CTL_SEQ_CD());
			this.setList_ODR_CTL_NO(struct.getList_ODR_CTL_NO());
			this.setList_h_ODR_TYP(struct.getList_h_ODR_TYP());
			this.setList_CUST_CD(struct.getList_CUST_CD());
			this.setList_CUST_ITEM_CD(struct.getList_CUST_ITEM_CD());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_UNIT_CD(struct.getList_UNIT_CD());
			this.setList_CURRNCY_CD(struct.getList_CURRNCY_CD());
			this.setList_DEPO_TYP(struct.getList_DEPO_TYP());
			this.setList_CUST_CHRG_PSN_CD(struct.getList_CUST_CHRG_PSN_CD());
			this.setList_ODR_ACPT_PSN_CD(struct.getList_ODR_ACPT_PSN_CD());
			this.setList_ODR_ACPT_DATE(struct.getList_ODR_ACPT_DATE());
			this.setList_fkgnALCTED_UNCONFIRM_ODR_NO(struct.getList_fkgnALCTED_UNCONFIRM_ODR_NO());
			this.setList_fkgnALCTED_UNCONFIRM_ODR_QTY(struct.getList_fkgnALCTED_UNCONFIRM_ODR_QTY());
			this.setList_fkgnALCTED_SEQ_CD(struct.getList_fkgnALCTED_SEQ_CD());
			this.setList_fkgnREMAIN_UNCONFIRM_ODR_QTY(struct.getList_fkgnREMAIN_UNCONFIRM_ODR_QTY());
			this.setList_fkgnODR_UNIT_PRICE(struct.getList_fkgnODR_UNIT_PRICE());
			this.setList_fkgnCURRNCY_CD(struct.getList_fkgnCURRNCY_CD());
			this.setList_fkgnODR_QTY(struct.getList_fkgnODR_QTY());
			this.setList_fkgnODR_TYP(struct.getList_fkgnODR_TYP());
			this.setList_fkgnFIXED_ODR_NO(struct.getList_fkgnFIXED_ODR_NO());
			this.setList_fkgnDEL_FLG(struct.getList_fkgnDEL_FLG());
			this.setList_fkgnUNCONFIRM_ODR_BALANCE(struct.getList_fkgnUNCONFIRM_ODR_BALANCE());
			this.setList_fkgnODR_NO(struct.getList_fkgnODR_NO());
			this.setList_IF_CTL_NO(struct.getList_IF_CTL_NO());
			this.setList_UNIT_NAME(struct.getList_UNIT_NAME());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_CUST_ANAME(struct.getList_CUST_ANAME());
			this.setList_EXCH_TYP(struct.getList_EXCH_TYP());
			this.setList_DETAIL_ROUND_TYP(struct.getList_DETAIL_ROUND_TYP());
			this.setList_CUST_ITEM_NAME(struct.getList_CUST_ITEM_NAME());
			this.setList_ODR_TYP(struct.getList_ODR_TYP());
			this.setList_CUST_CHRG_PSN_NAME(struct.getList_CUST_CHRG_PSN_NAME());
			this.setList_CUST_CHRG_ORG_CD(struct.getList_CUST_CHRG_ORG_CD());
			this.setList_CUST_CHRG_ORG_NAME(struct.getList_CUST_CHRG_ORG_NAME());
			this.setList_h_MODIFY_COUNT(struct.getList_h_MODIFY_COUNT());
			this.setList_h_ANS_DLV_DATE_EXIST_FLG(struct.getList_h_ANS_DLV_DATE_EXIST_FLG());
			this.setList_h_T_SHIP_ODR_EXIST_FLG(struct.getList_h_T_SHIP_ODR_EXIST_FLG());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_PKG_UNIT(struct.getList_PKG_UNIT());
			this.setList_UNIT_QTY_TYP(struct.getList_UNIT_QTY_TYP());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_h_ODR_UNIT_PRICE(struct.getList_h_ODR_UNIT_PRICE());
			this.setList_h_BUSINESS_OPR_DATE(struct.getList_h_BUSINESS_OPR_DATE());
			this.setList_DLV_LOC_NAME(struct.getList_DLV_LOC_NAME());
			this.setList_ODR_NO(struct.getList_ODR_NO());
			this.setList_REMAIN_UNCONFIRM_ODR_QTY(struct.getList_REMAIN_UNCONFIRM_ODR_QTY());
			this.setList_BUSINESS_OPR_DATE(struct.getList_BUSINESS_OPR_DATE());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_CODE(struct.getList_CODE());
			this.setList_CLASS_CODE(struct.getList_CLASS_CODE());
			this.setList_MAX_ALCTED_SEQ_CD(struct.getList_MAX_ALCTED_SEQ_CD());
			this.setList_MAX_ODR_NO(struct.getList_MAX_ODR_NO());
			this.setList_h_ALCTED_UNCONFIRM_ODR_QTY(struct.getList_h_ALCTED_UNCONFIRM_ODR_QTY());
			this.setList_IN_ODR_NO(struct.getList_IN_ODR_NO());
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
	// �� 1 �ϐ������l�F i_SPCL_PRICE_TYP_name


	final static String i_SPCL_PRICE_TYP_name = null;

	// �� 2 �ϐ������l�F i_SPCL_PRICE_TYP_val


	final static String i_SPCL_PRICE_TYP_val = null;

	// �� 3 �ϐ������l�F i_h_ODR_QTY


	final static String i_h_ODR_QTY = null;

	// �� 4 �ϐ������l�F i_h_DESINATED_DLV_DATE


	final static String i_h_DESINATED_DLV_DATE = null;

	// �� 5 �ϐ������l�F i_h_SPCL_PRICE_TYP


	final static String i_h_SPCL_PRICE_TYP = null;

	// �� 6 �ϐ������l�F i_h_CUS_DLV_KEY_CD


	final static String i_h_CUS_DLV_KEY_CD = null;

	// �� 7 �ϐ������l�F i_h_CUS_DLV_CD


	final static String i_h_CUS_DLV_CD = null;

	// �� 8 �ϐ������l�F i_h_DLV_LOC_CD


	final static String i_h_DLV_LOC_CD = null;

	// �� 9 �ϐ������l�F i_APPR_REMARKS


	final static String i_APPR_REMARKS = null;

	// �� 10 �ϐ������l�F i_h_APR_ODR


	final static String i_h_APR_ODR = null;

	// �� 11 �ϐ������l�F i_ODR_UNIT_PRICE


	final static String i_ODR_UNIT_PRICE = null;

	// �� 12 �ϐ������l�F i_SPCL_PRICE_TYP


	final static String i_SPCL_PRICE_TYP = null;

	// �� 13 �ϐ������l�F i_DESINATED_DLV_DATE


	final static String i_DESINATED_DLV_DATE = null;

	// �� 14 �ϐ������l�F i_STD_DESINATED_RCV_DATE


	final static String i_STD_DESINATED_RCV_DATE = null;

	// �� 15 �ϐ������l�F i_ODR_QTY


	final static String i_ODR_QTY = null;

	// �� 16 �ϐ������l�F i_UNCONFIRM_ODR_BALANCE


	final static Double i_UNCONFIRM_ODR_BALANCE = null;

	// �� 17 �ϐ������l�F i_ODR_AMOUNT


	final static Double i_ODR_AMOUNT = null;

	// �� 18 �ϐ������l�F i_ODR_AMOUNT_EXCH_RATES


	final static Double i_ODR_AMOUNT_EXCH_RATES = null;

	// �� 19 �ϐ������l�F i_CUS_DLV_CD


	final static String i_CUS_DLV_CD = null;

	// �� 20 �ϐ������l�F i_CUS_DLV_KEY_CD


	final static String i_CUS_DLV_KEY_CD = null;

	// �� 21 �ϐ������l�F i_h_REMAIN_UNCONFIRM_ODR_QTY


	final static String i_h_REMAIN_UNCONFIRM_ODR_QTY = null;

	// �� 22 �ϐ������l�F i_CANCELED_UNCONFIRM_ODR_QTY


	final static String i_CANCELED_UNCONFIRM_ODR_QTY = null;

	// �� 23 �ϐ������l�F i_h_SHIP_PLAN_REMAIN_QTY


	final static String i_h_SHIP_PLAN_REMAIN_QTY = null;

	// �� 24 �ϐ������l�F i_SHIP_PLAN_CMPLT_FLG


	final static String i_SHIP_PLAN_CMPLT_FLG = null;

	// �� 25 �ϐ������l�F i_PUCH_ODR_QTY_TOTAL


	final static String i_PUCH_ODR_QTY_TOTAL = null;

	// �� 26 �ϐ������l�F i_REMARKS


	final static String i_REMARKS = null;

	// �� 27 �ϐ������l�F i_DLV_LOC_CD


	final static String i_DLV_LOC_CD = null;

	// �� 28 �ϐ������l�F i_DLV_LOC_NAME_KANJI


	final static String i_DLV_LOC_NAME_KANJI = null;

	// �� 29 �ϐ������l�F i_CUST_ODR_NO


	final static String i_CUST_ODR_NO = null;

	// �� 30 �ϐ������l�F i_h_ODR_NO


	final static String i_h_ODR_NO = null;

	// �� 31 �ϐ������l�F i_RSLT_CTL_SEQ_CD


	final static String i_RSLT_CTL_SEQ_CD = null;

	// �� 32 �ϐ������l�F i_ODR_CTL_NO


	final static String i_ODR_CTL_NO = null;

	// �� 33 �ϐ������l�F i_h_ODR_TYP


	final static String i_h_ODR_TYP = null;

	// �� 34 �ϐ������l�F i_CUST_CD


	final static String i_CUST_CD = null;

	// �� 35 �ϐ������l�F i_CUST_ITEM_CD


	final static String i_CUST_ITEM_CD = null;

	// �� 36 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 37 �ϐ������l�F i_UNIT_CD


	final static String i_UNIT_CD = null;

	// �� 38 �ϐ������l�F i_CURRNCY_CD


	final static String i_CURRNCY_CD = null;

	// �� 39 �ϐ������l�F i_DEPO_TYP


	final static String i_DEPO_TYP = null;

	// �� 40 �ϐ������l�F i_CUST_CHRG_PSN_CD


	final static String i_CUST_CHRG_PSN_CD = null;

	// �� 41 �ϐ������l�F i_ODR_ACPT_PSN_CD


	final static String i_ODR_ACPT_PSN_CD = null;

	// �� 42 �ϐ������l�F i_ODR_ACPT_DATE


	final static String i_ODR_ACPT_DATE = null;

	// �� 43 �ϐ������l�F i_fkgnALCTED_UNCONFIRM_ODR_NO


	final static String i_fkgnALCTED_UNCONFIRM_ODR_NO = null;

	// �� 44 �ϐ������l�F i_fkgnALCTED_UNCONFIRM_ODR_QTY


	final static Double i_fkgnALCTED_UNCONFIRM_ODR_QTY = null;

	// �� 45 �ϐ������l�F i_fkgnALCTED_SEQ_CD


	final static String i_fkgnALCTED_SEQ_CD = null;

	// �� 46 �ϐ������l�F i_fkgnREMAIN_UNCONFIRM_ODR_QTY


	final static Double i_fkgnREMAIN_UNCONFIRM_ODR_QTY = null;

	// �� 47 �ϐ������l�F i_fkgnODR_UNIT_PRICE


	final static Double i_fkgnODR_UNIT_PRICE = null;

	// �� 48 �ϐ������l�F i_fkgnCURRNCY_CD


	final static String i_fkgnCURRNCY_CD = null;

	// �� 49 �ϐ������l�F i_fkgnODR_QTY


	final static Double i_fkgnODR_QTY = null;

	// �� 50 �ϐ������l�F i_fkgnODR_TYP


	final static String i_fkgnODR_TYP = null;

	// �� 51 �ϐ������l�F i_fkgnFIXED_ODR_NO


	final static String i_fkgnFIXED_ODR_NO = null;

	// �� 52 �ϐ������l�F i_fkgnDEL_FLG


	final static String i_fkgnDEL_FLG = null;

	// �� 53 �ϐ������l�F i_fkgnUNCONFIRM_ODR_BALANCE


	final static Double i_fkgnUNCONFIRM_ODR_BALANCE = null;

	// �� 54 �ϐ������l�F i_fkgnODR_NO


	final static String i_fkgnODR_NO = null;

	// �� 55 �ϐ������l�F i_IF_CTL_NO


	final static String i_IF_CTL_NO = null;

	// �� 56 �ϐ������l�F i_UNIT_NAME


	final static String i_UNIT_NAME = null;

	// �� 57 �ϐ������l�F i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// �� 58 �ϐ������l�F i_CUST_ANAME


	final static String i_CUST_ANAME = null;

	// �� 59 �ϐ������l�F i_EXCH_TYP


	final static String i_EXCH_TYP = null;

	// �� 60 �ϐ������l�F i_DETAIL_ROUND_TYP


	final static String i_DETAIL_ROUND_TYP = null;

	// �� 61 �ϐ������l�F i_CUST_ITEM_NAME


	final static String i_CUST_ITEM_NAME = null;

	// �� 62 �ϐ������l�F i_ODR_TYP


	final static String i_ODR_TYP = null;

	// �� 63 �ϐ������l�F i_CUST_CHRG_PSN_NAME


	final static String i_CUST_CHRG_PSN_NAME = null;

	// �� 64 �ϐ������l�F i_CUST_CHRG_ORG_CD


	final static String i_CUST_CHRG_ORG_CD = null;

	// �� 65 �ϐ������l�F i_CUST_CHRG_ORG_NAME


	final static String i_CUST_CHRG_ORG_NAME = null;

	// �� 66 �ϐ������l�F i_h_MODIFY_COUNT


	final static String i_h_MODIFY_COUNT = null;

	// �� 67 �ϐ������l�F i_h_ANS_DLV_DATE_EXIST_FLG


	final static String i_h_ANS_DLV_DATE_EXIST_FLG = null;

	// �� 68 �ϐ������l�F i_h_T_SHIP_ODR_EXIST_FLG


	final static String i_h_T_SHIP_ODR_EXIST_FLG = null;

	// �� 69 �ϐ������l�F i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// �� 70 �ϐ������l�F i_PKG_UNIT


	final static String i_PKG_UNIT = null;

	// �� 71 �ϐ������l�F i_UNIT_QTY_TYP


	final static String i_UNIT_QTY_TYP = null;

	// �� 72 �ϐ������l�F i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// �� 73 �ϐ������l�F i_h_ODR_UNIT_PRICE


	final static String i_h_ODR_UNIT_PRICE = null;

	// �� 74 �ϐ������l�F i_h_BUSINESS_OPR_DATE


	final static String i_h_BUSINESS_OPR_DATE = null;

	// �� 75 �ϐ������l�F i_DLV_LOC_NAME


	final static String i_DLV_LOC_NAME = null;

	// �� 76 �ϐ������l�F i_ODR_NO


	final static String i_ODR_NO = null;

	// �� 77 �ϐ������l�F i_REMAIN_UNCONFIRM_ODR_QTY


	final static String i_REMAIN_UNCONFIRM_ODR_QTY = null;

	// �� 78 �ϐ������l�F i_BUSINESS_OPR_DATE


	final static String i_BUSINESS_OPR_DATE = null;

	// �� 79 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 80 �ϐ������l�F i_CODE


	final static String i_CODE = null;

	// �� 81 �ϐ������l�F i_CLASS_CODE


	final static String i_CLASS_CODE = null;

	// �� 82 �ϐ������l�F i_MAX_ALCTED_SEQ_CD


	final static Double i_MAX_ALCTED_SEQ_CD = null;

	// �� 83 �ϐ������l�F i_MAX_ODR_NO


	final static String i_MAX_ODR_NO = null;

	// �� 84 �ϐ������l�F i_h_ALCTED_UNCONFIRM_ODR_QTY


	final static String i_h_ALCTED_UNCONFIRM_ODR_QTY = null;

	// �� 85 �ϐ������l�F i_IN_ODR_NO


	final static String i_IN_ODR_NO = null;

*/

	//{{user_implement_code
		// TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
		// �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
	// �� 1 �ϐ������l�F i_updODR_UNIT_PRICE
	final static Double i_updODR_UNIT_PRICE = null;
	// �� 2 �ϐ������l�F i_updSPCL_PRICE_TYP
	final static String i_updSPCL_PRICE_TYP = null;
	// �� 3 �ϐ������l�F i_updDEPO_TYP
	final static String i_updDEPO_TYP = null;
	// �� 4 �ϐ������l�F i_updDESINATED_DLV_DATE
	final static String i_updDESINATED_DLV_DATE = null;
	// �� 5 �ϐ������l�F i_updSTD_DESINATED_RCV_DATE
	final static String i_updSTD_DESINATED_RCV_DATE = null;
	// �� 6 �ϐ������l�F i_updODR_QTY
	final static Double i_updODR_QTY = null;
	// �� 7 �ϐ������l�F i_updUNIT_CD
	final static String i_updUNIT_CD = null;
	// �� 8 �ϐ������l�F i_updUNCONFIRM_ODR_BALANCE
	final static Double i_updUNCONFIRM_ODR_BALANCE = null;
	// �� 9 �ϐ������l�F i_updODR_AMOUNT
	final static Double i_updODR_AMOUNT = null;
	// �� 10 �ϐ������l�F i_updODR_AMOUNT_EXCH_RATES
	final static Double i_updODR_AMOUNT_EXCH_RATES = null;
	// �� 11 �ϐ������l�F i_updCUS_DLV_CD
	final static String i_updCUS_DLV_CD = null;
	// �� 12 �ϐ������l�F i_updCUS_DLV_KEY_CD
	final static String i_updCUS_DLV_KEY_CD = null;
	// �� 13 �ϐ������l�F i_updREMAIN_UNCONFIRM_ODR_QTY
	final static Double i_updREMAIN_UNCONFIRM_ODR_QTY = null;
	// �� 14 �ϐ������l�F i_updCANCELED_UNCONFIRM_ODR_QTY
	final static Double i_updCANCELED_UNCONFIRM_ODR_QTY = null;
	// �� 15 �ϐ������l�F i_updSHIP_PLAN_REMAIN_QTY
	final static Double i_updSHIP_PLAN_REMAIN_QTY = null;
	// �� 16 �ϐ������l�F i_updSHIP_PLAN_CMPLT_FLG
	final static String i_updSHIP_PLAN_CMPLT_FLG = null;
	// �� 17 �ϐ������l�F i_updPUCH_ODR_QTY_TOTAL
	final static Double i_updPUCH_ODR_QTY_TOTAL = null;
	// �� 18 �ϐ������l�F i_updODR_NO
	final static String i_updODR_NO = null;
	// �� 19 �ϐ������l�F i_hisRSLT_CTL_SEQ_CD
	final static Double i_hisRSLT_CTL_SEQ_CD = null;
	// �� 20 �ϐ������l�F i_hisODR_CTL_NO
	final static String i_hisODR_CTL_NO = null;
	// �� 21 �ϐ������l�F i_hisODR_NO
	final static String i_hisODR_NO = null;
	// �� 22 �ϐ������l�F i_hisCUST_ODR_NO
	final static String i_hisCUST_ODR_NO = null;
	// �� 23 �ϐ������l�F i_hisODR_TYP
	final static String i_hisODR_TYP = null;
	// �� 24 �ϐ������l�F i_hisCUST_CD
	final static String i_hisCUST_CD = null;
	// �� 25 �ϐ������l�F i_hisCUST_ITEM_CD
	final static String i_hisCUST_ITEM_CD = null;
	// �� 26 �ϐ������l�F i_hisITEM_CD
	final static String i_hisITEM_CD = null;
	// �� 27 �ϐ������l�F i_hisDESINATED_DLV_DATE
	final static String i_hisDESINATED_DLV_DATE = null;
	// �� 28 �ϐ������l�F i_hisODR_QTY
	final static Double i_hisODR_QTY = null;
	// �� 29 �ϐ������l�F i_hisUNIT_CD
	final static String i_hisUNIT_CD = null;
	// �� 30 �ϐ������l�F i_hisDLV_LOC_CD
	final static String i_hisDLV_LOC_CD = null;
	// �� 31 �ϐ������l�F i_hisODR_UNIT_PRICE
	final static Double i_hisODR_UNIT_PRICE = null;
	// �� 32 �ϐ������l�F i_hisCURRNCY_CD
	final static String i_hisCURRNCY_CD = null;
	// �� 33 �ϐ������l�F i_hisSPCL_PRICE_TYP
	final static String i_hisSPCL_PRICE_TYP = null;
	// �� 34 �ϐ������l�F i_hisDEPO_TYP
	final static String i_hisDEPO_TYP = null;
	// �� 35 �ϐ������l�F i_hisCUS_DLV_CD
	final static String i_hisCUS_DLV_CD = null;
	// �� 36 �ϐ������l�F i_hisCUS_DLV_KEY_CD
	final static String i_hisCUS_DLV_KEY_CD = null;
	// �� 37 �ϐ������l�F i_hisREMARKS
	final static String i_hisREMARKS = null;
	// �� 38 �ϐ������l�F i_hisCUST_CHRG_PSN_CD
	final static String i_hisCUST_CHRG_PSN_CD = null;
	// �� 39 �ϐ������l�F i_hisODR_ACPT_PSN_CD
	final static String i_hisODR_ACPT_PSN_CD = null;
	// �� 40 �ϐ������l�F i_hisODR_ACPT_DATE
	final static String i_hisODR_ACPT_DATE = null;
	// �� 41 �ϐ������l�F i_strCUST_ANAME
	final static String i_strCUST_ANAME = null;
	// �� 42 �ϐ������l�F i_strCOMPANY_CD
	final static String i_strCOMPANY_CD = null;
	// �� 43 �ϐ������l�F i_strCUR_CD
	final static String i_strCUR_CD = null;
	// �� 44 �ϐ������l�F i_strOWN_ORG_CD
	final static String i_strOWN_ORG_CD = null;
	// �� 45 �ϐ������l�F i_strOWN_PERSON_CD
	final static String i_strOWN_PERSON_CD = null;
	// �� 46 �ϐ������l�F i_strDEPO_TYP
	final static String i_strDEPO_TYP = null;
	// �� 47 �ϐ������l�F i_strPARTIAL_SHIP_INST_FLG
	final static String i_strPARTIAL_SHIP_INST_FLG = null;
	// �� 48 �ϐ������l�F i_strEXCH_TYP
	final static Double i_strEXCH_TYP = null;
	// �� 49 �ϐ������l�F i_strTAX_APPLY_TYP
	final static String i_strTAX_APPLY_TYP = null;
	// �� 50 �ϐ������l�F i_strTAX_CD
	final static String i_strTAX_CD = null;
	// �� 51 �ϐ������l�F i_strTAX_CALC_TYP
	final static String i_strTAX_CALC_TYP = null;
	// �� 52 �ϐ������l�F i_strUNCONFIRM_ODR_EFF_PRIOD
	final static Double i_strUNCONFIRM_ODR_EFF_PRIOD = null;
	// �� 53 �ϐ������l�F i_strUNCONFIRM_ODR_EFF_TERM_FLG
	final static String i_strUNCONFIRM_ODR_EFF_TERM_FLG = null;
	// �� 54 �ϐ������l�F i_strROUND_TYP
	final static String i_strROUND_TYP = null;
	// �� 55 �ϐ������l�F i_strCUST_CD
	final static String i_strCUST_CD = null;
	// �� 56 �ϐ������l�F i_strCUR_NAME
	final static String i_strCUR_NAME = null;
	// �� 57 �ϐ������l�F i_strDLV_LOC_CD
	final static String i_strDLV_LOC_CD = null;
	// �� 58 �ϐ������l�F i_strTRANSPORT_LT
	final static Double i_strTRANSPORT_LT = null;
	// �� 59 �ϐ������l�F i_strTRANSPORT_CD
	final static String i_strTRANSPORT_CD = null;
	// �� 60 �ϐ������l�F i_strCAL_NO
	final static Double i_strCAL_NO = null;
	// �� 61 �ϐ������l�F i_strTRANSPORT_TYP
	final static String i_strTRANSPORT_TYP = null;
	// �� 62 �ϐ������l�F i_strDLV_LOC_NAME
	final static String i_strDLV_LOC_NAME = null;
	// �� 63 �ϐ������l�F i_strEXCH_RATE
	final static Double i_strEXCH_RATE = null;
	// �� 64 �ϐ������l�F i_strCompareEXCH_DATE
	final static String i_strCompareEXCH_DATE = null;
	// �� 65 �ϐ������l�F i_strSTOCK_UNIT
	final static String i_strSTOCK_UNIT = null;
	// �� 66 �ϐ������l�F i_strITEM_NAME
	final static String i_strITEM_NAME = null;
	// �� 67 �ϐ������l�F i_strOUTSIDE_TYP
	final static Double i_strOUTSIDE_TYP = null;
	// �� 68 �ϐ������l�F i_strITEM_CD
	final static String i_strITEM_CD = null;
	// �� 69 �ϐ������l�F i_strUSER_NAME
	final static String i_strUSER_NAME = null;
	// �� 70 �ϐ������l�F i_strPLANT_CD
	final static String i_strPLANT_CD = null;
	// �� 71 �ϐ������l�F i_strSECTION_CD
	final static String i_strSECTION_CD = null;
	// �� 72 �ϐ������l�F i_strORG_CD
	final static String i_strORG_CD = null;
	// �� 73 �ϐ������l�F i_strORG_NAME
	final static String i_strORG_NAME = null;
	// �� 74 �ϐ������l�F i_strORG_ANAME
	final static String i_strORG_ANAME = null;
	// �� 75 �ϐ������l�F i_strUSER_CD
	final static String i_strUSER_CD = null;
	// �� 76 �ϐ������l�F i_strBUSINESS_OPR_DATE
	final static String i_strBUSINESS_OPR_DATE = null;
	// �� 77 �ϐ������l�F i_strUNIT_PRICE
	final static Double i_strUNIT_PRICE = null;
	// �� 78 �ϐ������l�F i_strEFF_PHASE_IN_DATE
	final static String i_strEFF_PHASE_IN_DATE = null;
	// �� 79 �ϐ������l�F i_sysCODE
	final static String i_sysCODE = null;
	// �� 80 �ϐ������l�F i_sysCLASS
	final static String i_sysCLASS = null;
	// �� 81 �ϐ������l�F i_strRSLT_CTL_SEQ_CD
	final static Double i_strRSLT_CTL_SEQ_CD = null;
	// �� 82 �ϐ������l�F i_h_ODR_NO
	final static String i_h_ODR_NO = null;
	// �� 83 �ϐ������l�F i_ANS_DLV_DATE_EXIST_FLG
	final static String i_ANS_DLV_DATE_EXIST_FLG = null;
	// �� 84 �ϐ������l�F i_T_SHIP_ODR_EXIST_FLG
	final static String i_T_SHIP_ODR_EXIST_FLG = null;
	// �� 85 �ϐ������l�F i_h_ODR_TYP
	final static String i_h_ODR_TYP = null;
	// �� 86 �ϐ������l�F i_ODR_CTL_NO
	final static String i_ODR_CTL_NO = null;
	// �� 87 �ϐ������l�F i_CUST_CD
	final static String i_CUST_CD = null;
	// �� 88 �ϐ������l�F i_CUST_ITEM_CD
	final static String i_CUST_ITEM_CD = null;
	// �� 89 �ϐ������l�F i_ITEM_CD
	final static String i_ITEM_CD = null;
	// �� 90 �ϐ������l�F i_CUST_ODR_NO
	final static String i_CUST_ODR_NO = null;
	// �� 91 �ϐ������l�F i_DESINATED_DLV_DATE
	final static String i_DESINATED_DLV_DATE = null;
	// �� 92 �ϐ������l�F i_ODR_QTY
	final static String i_ODR_QTY = null;
	// �� 93 �ϐ������l�F i_REMAIN_UNCONFIRM_ODR_QTY
	final static String i_REMAIN_UNCONFIRM_ODR_QTY = null;
	// �� 94 �ϐ������l�F i_v_REMAIN_UNCONFIRM_ODR_QTY
	final static String i_v_REMAIN_UNCONFIRM_ODR_QTY = null;
	// �� 95 �ϐ������l�F i_ODR_UNIT_PRICE
	final static String i_ODR_UNIT_PRICE = null;
	// �� 96 �ϐ������l�F i_UNIT_CD
	final static String i_UNIT_CD = null;
	// �� 97 �ϐ������l�F i_CURRNCY_CD
	final static String i_CURRNCY_CD = null;
	// �� 98 �ϐ������l�F i_SPCL_PRICE_TYP
	final static String i_SPCL_PRICE_TYP = null;
	// �� 99 �ϐ������l�F i_CUS_DLV_KEY_CD
	final static String i_CUS_DLV_KEY_CD = null;
	// �� 100 �ϐ������l�F i_CUS_DLV_CD
	final static String i_CUS_DLV_CD = null;
	// �� 101 �ϐ������l�F i_DEPO_TYP
	final static String i_DEPO_TYP = null;
	// �� 102 �ϐ������l�F i_ODR_NO
	final static String i_ODR_NO = null;
	// �� 103 �ϐ������l�F i_h_MODIFY_COUNT
	final static String i_h_MODIFY_COUNT = null;
	// �� 104 �ϐ������l�F i_PRD_ODR_PLACE_CD
	final static String i_PRD_ODR_PLACE_CD = null;
	// �� 105 �ϐ������l�F i_STD_DESINATED_RCV_DATE
	final static String i_STD_DESINATED_RCV_DATE = null;
	// �� 106 �ϐ������l�F i_CANCELED_UNCONFIRM_ODR_QTY
	final static String i_CANCELED_UNCONFIRM_ODR_QTY = null;
	// �� 107 �ϐ������l�F i_UNCONFIRM_ODR_BALANCE
	final static String i_UNCONFIRM_ODR_BALANCE = null;
	// �� 108 �ϐ������l�F i_ODR_AMOUNT
	final static String i_ODR_AMOUNT = null;
	// �� 109 �ϐ������l�F i_ODR_AMOUNT_EXCH_RATES
	final static String i_ODR_AMOUNT_EXCH_RATES = null;
	// �� 110 �ϐ������l�F i_REMARKS
	final static String i_REMARKS = null;
	// �� 111 �ϐ������l�F i_CUST_CHRG_PSN_CD
	final static String i_CUST_CHRG_PSN_CD = null;
	// �� 112 �ϐ������l�F i_ODR_ACPT_PSN_CD
	final static String i_ODR_ACPT_PSN_CD = null;
	// �� 113 �ϐ������l�F i_ODR_ACPT_DATE
	final static String i_ODR_ACPT_DATE = null;
	// �� 114 �ϐ������l�F i_DLV_LOC_CD
	final static String i_DLV_LOC_CD = null;
	// �� 115 �ϐ������l�F i_SHIP_PLAN_REMAIN_QTY
	final static Double i_SHIP_PLAN_REMAIN_QTY = null;
	// �� 116 �ϐ������l�F i_SHIP_PLAN_CMPLT_FLG
	final static String i_SHIP_PLAN_CMPLT_FLG = null;
	// �� 117 �ϐ������l�F i_PUCH_ODR_QTY_TOTAL
	final static Double i_PUCH_ODR_QTY_TOTAL = null;
	// �� 118 �ϐ������l�F i_IF_CTL_NO
	final static Double i_IF_CTL_NO = null;
	// �� 119 �ϐ������l�F i_check_ODR_NO
	final static String i_check_ODR_NO = null;
	// �� 120 �ϐ������l�F i_w_CUST_CD
	final static String i_w_CUST_CD = null;
	// �� 121 �ϐ������l�F i_w_CUST_ITEM_CD
	final static String i_w_CUST_ITEM_CD = null;
	// �� 122 �ϐ������l�F i_w_PSN_CD
	final static String i_w_PSN_CD = null;
	// �� 123 �ϐ������l�F i_w_CUST_ODR_NO
	final static String i_w_CUST_ODR_NO = null;
	// �� 124 �ϐ������l�F i_w_DESINATED_DLV_DATE_from
	final static String i_w_DESINATED_DLV_DATE_from = null;
	// �� 125 �ϐ������l�F i_w_DESINATED_DLV_DATE_to
	final static String i_w_DESINATED_DLV_DATE_to = null;
	// �� 126 �ϐ������l�F i_w_ODR_ACPT_DATE_from
	final static String i_w_ODR_ACPT_DATE_from = null;
	// �� 127 �ϐ������l�F i_w_ODR_ACPT_DATE_to
	final static String i_w_ODR_ACPT_DATE_to = null;
	// �� 128 �ϐ������l�F i_fkgnALCTED_UNCONFIRM_ODR_NO
	final static String i_fkgnALCTED_UNCONFIRM_ODR_NO = null;
	// �� 129 �ϐ������l�F i_fkgnALCTED_UNCONFIRM_ODR_QTY
	final static Double i_fkgnALCTED_UNCONFIRM_ODR_QTY = null;
	// �� 130 �ϐ������l�F i_fkgnALCTED_SEQ_CD
	final static Double i_fkgnALCTED_SEQ_CD = null;
	// �� 131 �ϐ������l�F i_fkgnREMAIN_UNCONFIRM_ODR_QTY
	final static Double i_fkgnREMAIN_UNCONFIRM_ODR_QTY = null;
	// �� 132 �ϐ������l�F i_fkgnODR_UNIT_PRICE
	final static Double i_fkgnODR_UNIT_PRICE = null;
	// �� 133 �ϐ������l�F i_fkgnCURRNCY_CD
	final static String i_fkgnCURRNCY_CD = null;
	// �� 134 �ϐ������l�F i_fkgnODR_QTY
	final static Double i_fkgnODR_QTY = null;
	// �� 135 �ϐ������l�F i_fkgnODR_TYP
	final static String i_fkgnODR_TYP = null;
	// �� 136 �ϐ������l�F i_fkgnFIXED_ODR_NO
	final static String i_fkgnFIXED_ODR_NO = null;
	// �� 137 �ϐ������l�F i_fkgnDEL_FLG
	final static String i_fkgnDEL_FLG = null;
	// �� 138 �ϐ������l�F i_fkgnUNCONFIRM_ODR_BALANCE
	final static Double i_fkgnUNCONFIRM_ODR_BALANCE = null;
	// �� 139 �ϐ������l�F i_fkgnODR_NO
	final static String i_fkgnODR_NO = null;
	// �� 140 �ϐ������l�F i_sysHomeCurCd
	final static String i_sysHomeCurCd = null;
	// �� 141 �ϐ������l�F i_ITEM_NAME
	final static String i_ITEM_NAME = null;
	// �� 142 �ϐ������l�F i_CUST_ANAME
	final static String i_CUST_ANAME = null;
	// �� 143 �ϐ������l�F i_ODR_TYP
	final static String i_ODR_TYP = null;
	// �� 144 �ϐ������l�F i_IN_ODR_NO
	final static String i_IN_ODR_NO = null;
	// �� 145 �ϐ������l�F i_SPCL_PRICE_TYP_name
	final static String i_SPCL_PRICE_TYP_name = null;
	// �� 146 �ϐ������l�F i_SPCL_PRICE_TYP_val
	final static String i_SPCL_PRICE_TYP_val = null;
	// �� 147 �ϐ������l�F i_UNIT_NAME
	final static String i_UNIT_NAME = null;
	// �� 148 �ϐ������l�F i_UNIT_CD_name
	final static String i_UNIT_CD_name = null;
	// �� 149 �ϐ������l�F i_UNIT_CD_val
	final static String i_UNIT_CD_val = null;
	// �� 150 �ϐ������l�F i_CURRNCY_CD_name
	final static String i_CURRNCY_CD_name = null;
	// �� 151 �ϐ������l�F i_CURRNCY_CD_val
	final static String i_CURRNCY_CD_val = null;

	/**
	 * ������
	 *
	 */
	public void initialize()
	{
		m_ODR_QTY = null;
		m_h_ODR_QTY = null;
		m_DESINATED_DLV_DATE = null;
		m_h_DESINATED_DLV_DATE = null;
		m_SPCL_PRICE_TYP = null;
		m_h_SPCL_PRICE_TYP = null;
		m_ODR_UNIT_PRICE = null;
		m_h_ODR_UNIT_PRICE = null;
		m_CUS_DLV_KEY_CD = null;
		m_h_CUS_DLV_KEY_CD = null;
		m_CUS_DLV_CD = null;
		m_h_CUS_DLV_CD = null;
		m_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_CUST_CD = null;
		m_CUST_ANAME = null;
		m_CUST_ITEM_CD = null;
		m_CUST_ODR_NO = null;
		m_ODR_TYP = null;
		m_h_ODR_TYP = null;
		m_h_REMAIN_UNCONFIRM_ODR_QTY = null;
		m_h_SHIP_PLAN_REMAIN_QTY = null;
		m_h_ODR_TYP = null;
		m_h_MODIFY_COUNT = null;
		m_h_ANS_DLV_DATE_EXIST_FLG = null;
		m_h_T_SHIP_ODR_EXIST_FLG = null;
		m_DLV_LOC_CD = null;
		m_DLV_LOC_NAME_KANJI = null;
		m_h_DLV_LOC_CD = null;

	}

		// TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
