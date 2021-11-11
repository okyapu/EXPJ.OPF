/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KU0010/src/com/nec/jp/orteus/metamorBase/KU0010/KU0010010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.KU0010;

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

public class KU0010010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_g_PART_DLV_SEQ_NO */
	public String m_g_PART_DLV_SEQ_NO = null;
	/** �� 2 �ϐ��F m_g_DIRECT_DLV_FLG */
	public String m_g_DIRECT_DLV_FLG = null;
	/** �� 3 �ϐ��F m_g_REST_SHIP_ODR_QTY */
	public String m_g_REST_SHIP_ODR_QTY = null;
	/** �� 4 �ϐ��F m_g_CUST_ANAME */
	public String m_g_CUST_ANAME = null;
	/** �� 5 �ϐ��F m_g_ITEM_CD */
	public String m_g_ITEM_CD = null;
	/** �� 6 �ϐ��F m_k_MODE */
	public String m_k_MODE = null;
	/** �� 7 �ϐ��F m_h_RESULT */
	public String m_h_RESULT = null;
	/** �� 8 �ϐ��F m_h_REST_SHIP_ODR_QTY */
	public String m_h_REST_SHIP_ODR_QTY = null;
	/** �� 9 �ϐ��F m_h_CUST_ANAME */
	public String m_h_CUST_ANAME = null;
	/** �� 10 �ϐ��F m_h_CUST_ITEM_CD */
	public String m_h_CUST_ITEM_CD = null;
	/** �� 11 �ϐ��F m_h_ITEM_CD */
	public String m_h_ITEM_CD = null;
	/** �� 12 �ϐ��F m_h_AP_SECRTY_TYP */
	public String m_h_AP_SECRTY_TYP = null;
	/** �� 13 �ϐ��F m_h_MODIFY_CNT */
	public String m_h_MODIFY_CNT = null;
	/** �� 14 �ϐ��F m_r_SEL_PTN1 */
	public String m_r_SEL_PTN1 = null;
	/** �� 15 �ϐ��F m_r_SEL_PTN2 */
	public String m_r_SEL_PTN2 = null;
	/** �� 16 �ϐ��F m_g_ODR_NO */
	public String m_g_ODR_NO = null;
	/** �� 17 �ϐ��F m_g_SLIP_CD */
	public String m_g_SLIP_CD = null;
	/** �� 18 �ϐ��F m_g_DESINATED_SHIP_DATE */
	public String m_g_DESINATED_SHIP_DATE = null;
	/** �� 19 �ϐ��F m_g_REST_SHIP_ODR_QTY2 */
	public String m_g_REST_SHIP_ODR_QTY2 = null;
	/** �� 20 �ϐ��F m_g_WH_CD */
	public String m_g_WH_CD = null;
	/** �� 21 �ϐ��F m_h_PARTIAL_SHIP_INST_FLG */
	public String m_h_PARTIAL_SHIP_INST_FLG = null;
	/** �� 22 �ϐ��F m_g_STOCK_UNIT */
	public String m_g_STOCK_UNIT = null;
	/** �� 23 �ϐ��F m_g_STOCK_UNIT2 */
	public String m_g_STOCK_UNIT2 = null;
	/** �� 24 �ϐ��F m_g_WH_NAME */
	public String m_g_WH_NAME = null;
	/** �� 25 �ϐ��F m_g_CUST_CD */
	public String m_g_CUST_CD = null;
	/** �� 26 �ϐ��F m_g_CUST_ITEM_NAME */
	public String m_g_CUST_ITEM_NAME = null;
	/** �� 27 �ϐ��F m_g_ITEM_NAME */
	public String m_g_ITEM_NAME = null;
	/** �� 28 �ϐ��F m_g_CUST_ODR_NO */
	public String m_g_CUST_ODR_NO = null;
	/** �� 29 �ϐ��F m_c_JOB_ODR_CD */
	public String m_c_JOB_ODR_CD = null;
	/** �� 30 �ϐ��F m_h_MRP_ODR_TYP */
	public String m_h_MRP_ODR_TYP = null;
	/** �� 31 �ϐ��F m_h_JOB_ODR_CD */
	public String m_h_JOB_ODR_CD = null;
	/** �� 32 �ϐ��F m_tMRP_ODR_TYP */
	public String m_tMRP_ODR_TYP = null;
	/** �� 33 �ϐ��F m_chkisWhCd_IN_JOBODRCD */
	public String m_chkisWhCd_IN_JOBODRCD = null;
	/** �� 34 �ϐ��F m_strCOMPANY_CD */
	public String m_strCOMPANY_CD = null;
	/** �� 35 �ϐ��F m_strUSER_NAME */
	public String m_strUSER_NAME = null;
	/** �� 36 �ϐ��F m_strPLANT_CD */
	public String m_strPLANT_CD = null;
	/** �� 37 �ϐ��F m_strSECTION_CD */
	public String m_strSECTION_CD = null;
	/** �� 38 �ϐ��F m_strPLANT_NAME */
	public String m_strPLANT_NAME = null;
	/** �� 39 �ϐ��F m_strPLANT_ANAME */
	public String m_strPLANT_ANAME = null;
	/** �� 40 �ϐ��F m_strCAL_NO */
	public Double m_strCAL_NO = null;
	/** �� 41 �ϐ��F m_strUSER_CD */
	public String m_strUSER_CD = null;
	/** �� 42 �ϐ��F m_strBUSINESS_OPR_DATE */
	public String m_strBUSINESS_OPR_DATE = null;
	/** �� 43 �ϐ��F m_strMAX_DISPLAY_ROWNUM */
	public Double m_strMAX_DISPLAY_ROWNUM = null;
	/** �� 44 �ϐ��F m_tAnsDlvDate_ODR_NO */
	public String m_tAnsDlvDate_ODR_NO = null;
	/** �� 45 �ϐ��F m_tAnsDlvDate_PART_DLV_SEQ_NO */
	public String m_tAnsDlvDate_PART_DLV_SEQ_NO = null;
	/** �� 46 �ϐ��F m_tAnsDlvDate_DESINATED_SHIP_DATE */
	public String m_tAnsDlvDate_DESINATED_SHIP_DATE = null;
	/** �� 47 �ϐ��F m_tOdrODR_CTL_NO */
	public String m_tOdrODR_CTL_NO = null;
	/** �� 48 �ϐ��F m_tOdrCtl_CUST_ITEM_CD */
	public String m_tOdrCtl_CUST_ITEM_CD = null;
	/** �� 49 �ϐ��F m_tOdrCtl_ITEM_CD */
	public String m_tOdrCtl_ITEM_CD = null;
	/** �� 50 �ϐ��F m_mCust_CUST_ANAME */
	public String m_mCust_CUST_ANAME = null;
	/** �� 51 �ϐ��F m_tAnsDlvDate_REST_SHIP_ODR_QTY */
	public String m_tAnsDlvDate_REST_SHIP_ODR_QTY = null;
	/** �� 52 �ϐ��F m_tOdr_TRANSPORT_TYP */
	public String m_tOdr_TRANSPORT_TYP = null;
	/** �� 53 �ϐ��F m_tOdr_ODR_UNIT_PRICE */
	public String m_tOdr_ODR_UNIT_PRICE = null;
	/** �� 54 �ϐ��F m_tOdr_SPCL_PRICE_TYP */
	public String m_tOdr_SPCL_PRICE_TYP = null;
	/** �� 55 �ϐ��F m_tOdrCtl_CUST_CD */
	public String m_tOdrCtl_CUST_CD = null;
	/** �� 56 �ϐ��F m_tOdr_PARTIAL_SHIP_INST_FLG */
	public String m_tOdr_PARTIAL_SHIP_INST_FLG = null;
	/** �� 57 �ϐ��F m_tAnsDlvDate_MODIFY_COUNT */
	public String m_tAnsDlvDate_MODIFY_COUNT = null;
	/** �� 58 �ϐ��F m_tITEM_NAME */
	public String m_tITEM_NAME = null;
	/** �� 59 �ϐ��F m_tSTOCK_UNIT */
	public String m_tSTOCK_UNIT = null;
	/** �� 60 �ϐ��F m_tUNIT_QTY_TYP */
	public String m_tUNIT_QTY_TYP = null;
	/** �� 61 �ϐ��F m_tWH_NAME */
	public String m_tWH_NAME = null;
	/** �� 62 �ϐ��F m_tSHIP_WH_CD */
	public String m_tSHIP_WH_CD = null;
	/** �� 63 �ϐ��F m_tCUST_CD */
	public String m_tCUST_CD = null;
	/** �� 64 �ϐ��F m_tCUST_ITEM_NAME */
	public String m_tCUST_ITEM_NAME = null;
	/** �� 65 �ϐ��F m_tCUST_ODR_NO */
	public String m_tCUST_ODR_NO = null;
	/** �� 66 �ϐ��F m_g_JOB_ODR_CD */
	public String m_g_JOB_ODR_CD = null;
	/** �� 67 �ϐ��F m_sysMyCompany_IN_COMPANYCD */
	public String m_sysMyCompany_IN_COMPANYCD = null;
	/** �� 68 �ϐ��F m_tAnsDlvDate_IN_ODRNO */
	public String m_tAnsDlvDate_IN_ODRNO = null;
	/** �� 69 �ϐ��F m_tAnsDlvDate_IN_PARTDLVSEQNO */
	public String m_tAnsDlvDate_IN_PARTDLVSEQNO = null;
	/** �� 70 �ϐ��F m_up_tAnsDlvDate_DESINATED_SHIP_DATE */
	public String m_up_tAnsDlvDate_DESINATED_SHIP_DATE = null;
	/** �� 71 �ϐ��F m_up_tAnsDlvDate_REST_SHIP_ODR_QTY */
	public String m_up_tAnsDlvDate_REST_SHIP_ODR_QTY = null;
	/** �� 72 �ϐ��F m_up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG */
	public String m_up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG = null;
	/** �� 73 �ϐ��F m_up_tAnsDlvDate_IN_ODRNO */
	public String m_up_tAnsDlvDate_IN_ODRNO = null;
	/** �� 74 �ϐ��F m_up_tAnsDlvDate_IN_PARTDLVSEQNO */
	public String m_up_tAnsDlvDate_IN_PARTDLVSEQNO = null;
	/** �� 75 �ϐ��F m_tShipOdr_ODR_NO */
	public String m_tShipOdr_ODR_NO = null;
	/** �� 76 �ϐ��F m_tShipOdr_PART_DLV_SEQ_NO */
	public String m_tShipOdr_PART_DLV_SEQ_NO = null;
	/** �� 77 �ϐ��F m_tShipOdr_SLIP_CD */
	public String m_tShipOdr_SLIP_CD = null;
	/** �� 78 �ϐ��F m_tShipOdr_DESINATED_SHIP_DATE */
	public String m_tShipOdr_DESINATED_SHIP_DATE = null;
	/** �� 79 �ϐ��F m_tShipOdr_SHIP_QTY */
	public String m_tShipOdr_SHIP_QTY = null;
	/** �� 80 �ϐ��F m_tShipOdr_ALLCT_WH_CD */
	public String m_tShipOdr_ALLCT_WH_CD = null;
	/** �� 81 �ϐ��F m_tShipOdr_CUST_NAME */
	public String m_tShipOdr_CUST_NAME = null;
	/** �� 82 �ϐ��F m_tShipOdr_CUST_ITEM_CD */
	public String m_tShipOdr_CUST_ITEM_CD = null;
	/** �� 83 �ϐ��F m_tShipOdr_ITEM_CD */
	public String m_tShipOdr_ITEM_CD = null;
	/** �� 84 �ϐ��F m_tShipOdr_JOB_ODR_CD */
	public String m_tShipOdr_JOB_ODR_CD = null;
	/** �� 85 �ϐ��F m_tShipOdrAnsDlvDate_REST_SHIP_ODR_QTY */
	public String m_tShipOdrAnsDlvDate_REST_SHIP_ODR_QTY = null;
	/** �� 86 �ϐ��F m_tShipOdr_DEL_FLG */
	public String m_tShipOdr_DEL_FLG = null;
	/** �� 87 �ϐ��F m_tShipOdr_DIRECT_DLV_FLG */
	public String m_tShipOdr_DIRECT_DLV_FLG = null;
	/** �� 88 �ϐ��F m_tShipOdr_TRANSPORT_TYP */
	public String m_tShipOdr_TRANSPORT_TYP = null;
	/** �� 89 �ϐ��F m_tShipOdr_MODIFY_COUNT */
	public String m_tShipOdr_MODIFY_COUNT = null;
	/** �� 90 �ϐ��F m_tDEPO_TRANSFER_PROC_FLG */
	public String m_tDEPO_TRANSFER_PROC_FLG = null;
	/** �� 91 �ϐ��F m_tShipOdr_IN_SLIPCD */
	public String m_tShipOdr_IN_SLIPCD = null;
	/** �� 92 �ϐ��F m_in_tShipOdr_ODR_NO */
	public String m_in_tShipOdr_ODR_NO = null;
	/** �� 93 �ϐ��F m_in_tShipOdr_PART_DLV_SEQ_NO */
	public String m_in_tShipOdr_PART_DLV_SEQ_NO = null;
	/** �� 94 �ϐ��F m_in_tShipOdr_SLIP_CD */
	public String m_in_tShipOdr_SLIP_CD = null;
	/** �� 95 �ϐ��F m_in_tShipOdr_ITEM_CD */
	public String m_in_tShipOdr_ITEM_CD = null;
	/** �� 96 �ϐ��F m_in_tShipOdr_CUST_ITEM_CD */
	public String m_in_tShipOdr_CUST_ITEM_CD = null;
	/** �� 97 �ϐ��F m_in_tShipOdr_CUST_ODR_NO */
	public String m_in_tShipOdr_CUST_ODR_NO = null;
	/** �� 98 �ϐ��F m_in_tShipOdr_CUST_CD */
	public String m_in_tShipOdr_CUST_CD = null;
	/** �� 99 �ϐ��F m_in_tShipOdr_CUST_NAME */
	public String m_in_tShipOdr_CUST_NAME = null;
	/** �� 100 �ϐ��F m_in_tShipOdr_SHIP_ODR_ISS_PSN_CD */
	public String m_in_tShipOdr_SHIP_ODR_ISS_PSN_CD = null;
	/** �� 101 �ϐ��F m_in_tShipOdr_DLV_LOC_CD */
	public String m_in_tShipOdr_DLV_LOC_CD = null;
	/** �� 102 �ϐ��F m_in_tShipOdr_DESINATED_SHIP_DATE */
	public String m_in_tShipOdr_DESINATED_SHIP_DATE = null;
	/** �� 103 �ϐ��F m_in_tShipOdr_SHIP_QTY */
	public String m_in_tShipOdr_SHIP_QTY = null;
	/** �� 104 �ϐ��F m_in_tShipOdr_UNIT_PRICE */
	public String m_in_tShipOdr_UNIT_PRICE = null;
	/** �� 105 �ϐ��F m_in_tShipOdr_SHIP_ODR_AMOUNT */
	public Double m_in_tShipOdr_SHIP_ODR_AMOUNT = null;
	/** �� 106 �ϐ��F m_in_tShipOdr_CURRNCY_CD */
	public String m_in_tShipOdr_CURRNCY_CD = null;
	/** �� 107 �ϐ��F m_in_tShipOdr_PKG_UNIT_QTY */
	public String m_in_tShipOdr_PKG_UNIT_QTY = null;
	/** �� 108 �ϐ��F m_in_tShipOdr_REMARKS */
	public String m_in_tShipOdr_REMARKS = null;
	/** �� 109 �ϐ��F m_in_tShipOdr_ALLCT_WH_CD */
	public String m_in_tShipOdr_ALLCT_WH_CD = null;
	/** �� 110 �ϐ��F m_in_tShipOdr_DEPO_TYP */
	public String m_in_tShipOdr_DEPO_TYP = null;
	/** �� 111 �ϐ��F m_in_tShipOdr_ENTRY_TYP */
	public String m_in_tShipOdr_ENTRY_TYP = null;
	/** �� 112 �ϐ��F m_in_tShipOdr_PRINT_FLG */
	public String m_in_tShipOdr_PRINT_FLG = null;
	/** �� 113 �ϐ��F m_in_tShipOdr_SHP_CMPLT_FLG */
	public String m_in_tShipOdr_SHP_CMPLT_FLG = null;
	/** �� 114 �ϐ��F m_in_tShipOdr_DEL_FLG */
	public String m_in_tShipOdr_DEL_FLG = null;
	/** �� 115 �ϐ��F m_in_tShipOdr_TRANSPORT_CD */
	public String m_in_tShipOdr_TRANSPORT_CD = null;
	/** �� 116 �ϐ��F m_in_tShipOdr_DIRECT_DLV_FLG */
	public String m_in_tShipOdr_DIRECT_DLV_FLG = null;
	/** �� 117 �ϐ��F m_in_tShipOdr_CUST_CHRG_PSN_CD */
	public String m_in_tShipOdr_CUST_CHRG_PSN_CD = null;
	/** �� 118 �ϐ��F m_in_tShipOdr_UNIT_CD */
	public String m_in_tShipOdr_UNIT_CD = null;
	/** �� 119 �ϐ��F m_in_tShipOdr_SCDL_DLV_DATE */
	public String m_in_tShipOdr_SCDL_DLV_DATE = null;
	/** �� 120 �ϐ��F m_in_tShipOdr_TRANSFER_WH_CD */
	public String m_in_tShipOdr_TRANSFER_WH_CD = null;
	/** �� 121 �ϐ��F m_in_tShipOdr_DLV_KEY_NO */
	public String m_in_tShipOdr_DLV_KEY_NO = null;
	/** �� 122 �ϐ��F m_in_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES */
	public Double m_in_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES = null;
	/** �� 123 �ϐ��F m_in_tShipOdr_SHIP_ODR_NO */
	public String m_in_tShipOdr_SHIP_ODR_NO = null;
	/** �� 124 �ϐ��F m_in_tShipOdr_JOB_ODR_CD */
	public String m_in_tShipOdr_JOB_ODR_CD = null;
	/** �� 125 �ϐ��F m_del_tShipOdr_IN_SLIPCD */
	public String m_del_tShipOdr_IN_SLIPCD = null;
	/** �� 126 �ϐ��F m_tOdr_ODR_NO */
	public String m_tOdr_ODR_NO = null;
	/** �� 127 �ϐ��F m_tOdr_ODR_TYP */
	public String m_tOdr_ODR_TYP = null;
	/** �� 128 �ϐ��F m_tOdr_ODR_CTL_NO */
	public String m_tOdr_ODR_CTL_NO = null;
	/** �� 129 �ϐ��F m_tOdr_CUST_ODR_NO */
	public String m_tOdr_CUST_ODR_NO = null;
	/** �� 130 �ϐ��F m_tOdr_CUST_CHRG_ORG_CD */
	public String m_tOdr_CUST_CHRG_ORG_CD = null;
	/** �� 131 �ϐ��F m_tOdr_CUST_CHRG_PSN_CD */
	public String m_tOdr_CUST_CHRG_PSN_CD = null;
	/** �� 132 �ϐ��F m_tOdr_ODR_ACPT_ORG_CD */
	public String m_tOdr_ODR_ACPT_ORG_CD = null;
	/** �� 133 �ϐ��F m_tOdr_ODR_ACPT_PSN_CD */
	public String m_tOdr_ODR_ACPT_PSN_CD = null;
	/** �� 134 �ϐ��F m_tOdr_CURRNCY_CD */
	public String m_tOdr_CURRNCY_CD = null;
	/** �� 135 �ϐ��F m_tOdr_EXCH_TYP */
	public String m_tOdr_EXCH_TYP = null;
	/** �� 136 �ϐ��F m_tOdr_DLV_LOC_CD */
	public String m_tOdr_DLV_LOC_CD = null;
	/** �� 137 �ϐ��F m_tOdr_DLV_LOC_CD_EIAJ */
	public String m_tOdr_DLV_LOC_CD_EIAJ = null;
	/** �� 138 �ϐ��F m_tOdr_DLV_LOC_NAME */
	public String m_tOdr_DLV_LOC_NAME = null;
	/** �� 139 �ϐ��F m_tOdr_DLV_LOC_NAME_KANJI */
	public String m_tOdr_DLV_LOC_NAME_KANJI = null;
	/** �� 140 �ϐ��F m_tOdr_PRD_ODR_PLACE_CD */
	public String m_tOdr_PRD_ODR_PLACE_CD = null;
	/** �� 141 �ϐ��F m_tOdr_PART_DLV_COUNT */
	public String m_tOdr_PART_DLV_COUNT = null;
	/** �� 142 �ϐ��F m_tOdr_DEPO_TYP */
	public String m_tOdr_DEPO_TYP = null;
	/** �� 143 �ϐ��F m_tOdr_DESINATED_DLV_DATE */
	public String m_tOdr_DESINATED_DLV_DATE = null;
	/** �� 144 �ϐ��F m_tOdr_STD_DESINATED_RCV_DATE */
	public String m_tOdr_STD_DESINATED_RCV_DATE = null;
	/** �� 145 �ϐ��F m_tOdr_ODR_QTY */
	public String m_tOdr_ODR_QTY = null;
	/** �� 146 �ϐ��F m_tOdr_REMAIN_UNCONFIRM_ODR_QTY */
	public String m_tOdr_REMAIN_UNCONFIRM_ODR_QTY = null;
	/** �� 147 �ϐ��F m_tOdr_CANCELED_UNCONFIRM_ODR_QTY */
	public String m_tOdr_CANCELED_UNCONFIRM_ODR_QTY = null;
	/** �� 148 �ϐ��F m_tOdr_UNIT_CD */
	public String m_tOdr_UNIT_CD = null;
	/** �� 149 �ϐ��F m_tOdr_UNCONFIRM_ODR_BALANCE */
	public String m_tOdr_UNCONFIRM_ODR_BALANCE = null;
	/** �� 150 �ϐ��F m_tOdr_ODR_AMOUNT */
	public String m_tOdr_ODR_AMOUNT = null;
	/** �� 151 �ϐ��F m_tOdr_ODR_AMOUNT_EXCH_RATES */
	public String m_tOdr_ODR_AMOUNT_EXCH_RATES = null;
	/** �� 152 �ϐ��F m_tOdr_TOTAL_SHIP_QTY */
	public String m_tOdr_TOTAL_SHIP_QTY = null;
	/** �� 153 �ϐ��F m_tOdr_SHIP_AMOUNT */
	public String m_tOdr_SHIP_AMOUNT = null;
	/** �� 154 �ϐ��F m_tOdr_SHIP_AMOUNT_EXCH_RATES */
	public String m_tOdr_SHIP_AMOUNT_EXCH_RATES = null;
	/** �� 155 �ϐ��F m_tOdr_RETURN_PRICE */
	public String m_tOdr_RETURN_PRICE = null;
	/** �� 156 �ϐ��F m_tOdr_RETURN_QTY */
	public String m_tOdr_RETURN_QTY = null;
	/** �� 157 �ϐ��F m_tOdr_RETURN_AMOUNT */
	public String m_tOdr_RETURN_AMOUNT = null;
	/** �� 158 �ϐ��F m_tOdr_RETURN_AMOUNT_EXCH_RATES */
	public String m_tOdr_RETURN_AMOUNT_EXCH_RATES = null;
	/** �� 159 �ϐ��F m_tOdr_ODR_CMPLT_FLG */
	public String m_tOdr_ODR_CMPLT_FLG = null;
	/** �� 160 �ϐ��F m_tOdr_ODR_CMPLT_DATE */
	public String m_tOdr_ODR_CMPLT_DATE = null;
	/** �� 161 �ϐ��F m_tOdr_CUS_DLV_CD */
	public String m_tOdr_CUS_DLV_CD = null;
	/** �� 162 �ϐ��F m_tOdr_CUS_DLV_KEY_CD */
	public String m_tOdr_CUS_DLV_KEY_CD = null;
	/** �� 163 �ϐ��F m_tOdr_PART_NAME */
	public String m_tOdr_PART_NAME = null;
	/** �� 164 �ϐ��F m_tOdr_PKG_UNIT */
	public String m_tOdr_PKG_UNIT = null;
	/** �� 165 �ϐ��F m_tOdr_SLIP_PRICE_PRINT_TYP */
	public String m_tOdr_SLIP_PRICE_PRINT_TYP = null;
	/** �� 166 �ϐ��F m_tOdr_INSPC_TYP */
	public String m_tOdr_INSPC_TYP = null;
	/** �� 167 �ϐ��F m_tOdr_CLIENT_REMARK */
	public String m_tOdr_CLIENT_REMARK = null;
	/** �� 168 �ϐ��F m_tOdr_CLIENT_REMARK_KANJI */
	public String m_tOdr_CLIENT_REMARK_KANJI = null;
	/** �� 169 �ϐ��F m_tOdr_CLIENT_BARCODE_INF */
	public String m_tOdr_CLIENT_BARCODE_INF = null;
	/** �� 170 �ϐ��F m_tOdr_TRANSPORT_CD */
	public String m_tOdr_TRANSPORT_CD = null;
	/** �� 171 �ϐ��F m_tOdr_TAX_APPLY_TYP */
	public String m_tOdr_TAX_APPLY_TYP = null;
	/** �� 172 �ϐ��F m_tOdr_TAX_CD */
	public String m_tOdr_TAX_CD = null;
	/** �� 173 �ϐ��F m_tOdr_TAX_CALC_TYP */
	public String m_tOdr_TAX_CALC_TYP = null;
	/** �� 174 �ϐ��F m_tOdr_REMARKS */
	public String m_tOdr_REMARKS = null;
	/** �� 175 �ϐ��F m_tOdr_ODR_ACPT_DATE */
	public String m_tOdr_ODR_ACPT_DATE = null;
	/** �� 176 �ϐ��F m_tOdr_SHIP_PLAN_REMAIN_QTY */
	public String m_tOdr_SHIP_PLAN_REMAIN_QTY = null;
	/** �� 177 �ϐ��F m_tOdr_SHIP_PLAN_CMPLT_FLG */
	public String m_tOdr_SHIP_PLAN_CMPLT_FLG = null;
	/** �� 178 �ϐ��F m_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG */
	public String m_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG = null;
	/** �� 179 �ϐ��F m_tOdr_IF_CTL_NO */
	public String m_tOdr_IF_CTL_NO = null;
	/** �� 180 �ϐ��F m_tOdr_ENTRY_TYP */
	public String m_tOdr_ENTRY_TYP = null;
	/** �� 181 �ϐ��F m_tOdr_BUYER_NAME */
	public String m_tOdr_BUYER_NAME = null;
	/** �� 182 �ϐ��F m_tOdr_PUCH_ODR_QTY_TOTAL */
	public String m_tOdr_PUCH_ODR_QTY_TOTAL = null;
	/** �� 183 �ϐ��F m_tOdr_UNIT_CD_ORG */
	public String m_tOdr_UNIT_CD_ORG = null;
	/** �� 184 �ϐ��F m_tOdr_SHIP_CNT */
	public String m_tOdr_SHIP_CNT = null;
	/** �� 185 �ϐ��F m_tOdr_CUR_CD */
	public String m_tOdr_CUR_CD = null;
	/** �� 186 �ϐ��F m_tOdr_EXCH_TYP_R */
	public String m_tOdr_EXCH_TYP_R = null;
	/** �� 187 �ϐ��F m_tOdr_IN_ODRNO */
	public String m_tOdr_IN_ODRNO = null;
	/** �� 188 �ϐ��F m_uptOdr_PART_DLV_COUNT */
	public String m_uptOdr_PART_DLV_COUNT = null;
	/** �� 189 �ϐ��F m_uptOdr_IN_ODRNO */
	public String m_uptOdr_IN_ODRNO = null;
	/** �� 190 �ϐ��F m_mItem_ITEM_CD */
	public String m_mItem_ITEM_CD = null;
	/** �� 191 �ϐ��F m_mItem_ITEM_NAME */
	public String m_mItem_ITEM_NAME = null;
	/** �� 192 �ϐ��F m_mItem_PRODUCT_TYP */
	public String m_mItem_PRODUCT_TYP = null;
	/** �� 193 �ϐ��F m_mItem_MRP_ODR_TYP */
	public String m_mItem_MRP_ODR_TYP = null;
	/** �� 194 �ϐ��F m_mItem_DRAW_CD */
	public String m_mItem_DRAW_CD = null;
	/** �� 195 �ϐ��F m_mItem_SPEC */
	public String m_mItem_SPEC = null;
	/** �� 196 �ϐ��F m_mItem_HIGH_LEVEL_NO */
	public String m_mItem_HIGH_LEVEL_NO = null;
	/** �� 197 �ϐ��F m_mItem_OUTSIDE_TYP */
	public String m_mItem_OUTSIDE_TYP = null;
	/** �� 198 �ϐ��F m_mItem_STOCK_UNIT_FLG */
	public String m_mItem_STOCK_UNIT_FLG = null;
	/** �� 199 �ϐ��F m_mItem_STOCK_UNIT */
	public String m_mItem_STOCK_UNIT = null;
	/** �� 200 �ϐ��F m_mItem_PKG_UNIT */
	public String m_mItem_PKG_UNIT = null;
	/** �� 201 �ϐ��F m_mItem_PKG_UNIT_QTY */
	public String m_mItem_PKG_UNIT_QTY = null;
	/** �� 202 �ϐ��F m_mItem_UNIT_QTY_TYP */
	public String m_mItem_UNIT_QTY_TYP = null;
	/** �� 203 �ϐ��F m_mItem_ODR_LT */
	public String m_mItem_ODR_LT = null;
	/** �� 204 �ϐ��F m_mItem_FIXED_LT */
	public String m_mItem_FIXED_LT = null;
	/** �� 205 �ϐ��F m_mItem_PROP_LT */
	public String m_mItem_PROP_LT = null;
	/** �� 206 �ϐ��F m_mItem_SAFETY_LT */
	public String m_mItem_SAFETY_LT = null;
	/** �� 207 �ϐ��F m_mItem_ISSUE_LT */
	public String m_mItem_ISSUE_LT = null;
	/** �� 208 �ϐ��F m_mItem_PROP_LOT_SIZE */
	public String m_mItem_PROP_LOT_SIZE = null;
	/** �� 209 �ϐ��F m_mItem_ITEM_SPOIL */
	public String m_mItem_ITEM_SPOIL = null;
	/** �� 210 �ϐ��F m_mItem_SAFETY_STOCK */
	public String m_mItem_SAFETY_STOCK = null;
	/** �� 211 �ϐ��F m_mItem_LOT_SIZING_TYP */
	public String m_mItem_LOT_SIZING_TYP = null;
	/** �� 212 �ϐ��F m_mItem_MAX_PERIOD */
	public String m_mItem_MAX_PERIOD = null;
	/** �� 213 �ϐ��F m_mItem_MAX_ODR_QTY */
	public String m_mItem_MAX_ODR_QTY = null;
	/** �� 214 �ϐ��F m_mItem_ODR_POINT */
	public String m_mItem_ODR_POINT = null;
	/** �� 215 �ϐ��F m_mItem_FIXED_ODR_QTY */
	public String m_mItem_FIXED_ODR_QTY = null;
	/** �� 216 �ϐ��F m_mItem_MIN_ODR_QTY */
	public String m_mItem_MIN_ODR_QTY = null;
	/** �� 217 �ϐ��F m_mItem_MUL_ODR_QTY */
	public String m_mItem_MUL_ODR_QTY = null;
	/** �� 218 �ϐ��F m_mItem_ISSUE_TYP */
	public String m_mItem_ISSUE_TYP = null;
	/** �� 219 �ϐ��F m_mItem_MPS_FLG */
	public String m_mItem_MPS_FLG = null;
	/** �� 220 �ϐ��F m_mItem_ACPT_INSPC_TYP */
	public String m_mItem_ACPT_INSPC_TYP = null;
	/** �� 221 �ϐ��F m_mItem_CLASIFICATION_CD */
	public String m_mItem_CLASIFICATION_CD = null;
	/** �� 222 �ϐ��F m_mItem_UNIT_WEIGHT */
	public String m_mItem_UNIT_WEIGHT = null;
	/** �� 223 �ϐ��F m_mItem_ABC_TYP */
	public String m_mItem_ABC_TYP = null;
	/** �� 224 �ϐ��F m_mItem_OPR_RSLT_TYP */
	public String m_mItem_OPR_RSLT_TYP = null;
	/** �� 225 �ϐ��F m_mItem_SPL_ITEM_TYP */
	public String m_mItem_SPL_ITEM_TYP = null;
	/** �� 226 �ϐ��F m_mItem_TAX_CD */
	public String m_mItem_TAX_CD = null;
	/** �� 227 �ϐ��F m_mItem_IN_ITEMCD */
	public String m_mItem_IN_ITEMCD = null;
	/** �� 228 �ϐ��F m_tOdrCtl_ODR_CTL_NO */
	public String m_tOdrCtl_ODR_CTL_NO = null;
	/** �� 229 �ϐ��F m_tOdrCtl_CUST_ITEM_NAME */
	public String m_tOdrCtl_CUST_ITEM_NAME = null;
	/** �� 230 �ϐ��F m_tOdrCtl_ITEM_NAME */
	public String m_tOdrCtl_ITEM_NAME = null;
	/** �� 231 �ϐ��F m_tOdrCtl_IN_ODRCTLNO */
	public String m_tOdrCtl_IN_ODRCTLNO = null;
	/** �� 232 �ϐ��F m_in_tShipSlip_SLIP_CD */
	public String m_in_tShipSlip_SLIP_CD = null;
	/** �� 233 �ϐ��F m_in_tShipSlip_ITEM_CD */
	public String m_in_tShipSlip_ITEM_CD = null;
	/** �� 234 �ϐ��F m_in_tShipSlip_CUST_ITEM_CD */
	public String m_in_tShipSlip_CUST_ITEM_CD = null;
	/** �� 235 �ϐ��F m_in_tShipSlip_PART_NAME */
	public String m_in_tShipSlip_PART_NAME = null;
	/** �� 236 �ϐ��F m_in_tShipSlip_CUST_ODR_NO */
	public String m_in_tShipSlip_CUST_ODR_NO = null;
	/** �� 237 �ϐ��F m_in_tShipSlip_CUST_CD */
	public String m_in_tShipSlip_CUST_CD = null;
	/** �� 238 �ϐ��F m_in_tShipSlip_CUST_NAME */
	public String m_in_tShipSlip_CUST_NAME = null;
	/** �� 239 �ϐ��F m_in_tShipSlip_DLV_LOC_CD */
	public String m_in_tShipSlip_DLV_LOC_CD = null;
	/** �� 240 �ϐ��F m_in_tShipSlip_DLV_LOC_NAME_KANJI */
	public String m_in_tShipSlip_DLV_LOC_NAME_KANJI = null;
	/** �� 241 �ϐ��F m_in_tShipSlip_CUS_DLV_KEY_CD */
	public String m_in_tShipSlip_CUS_DLV_KEY_CD = null;
	/** �� 242 �ϐ��F m_in_tShipSlip_DESINATED_SHIP_DATE */
	public String m_in_tShipSlip_DESINATED_SHIP_DATE = null;
	/** �� 243 �ϐ��F m_in_tShipSlip_DESINATED_DLV_DATE */
	public String m_in_tShipSlip_DESINATED_DLV_DATE = null;
	/** �� 244 �ϐ��F m_in_tShipSlip_SCDL_DLV_DATE */
	public String m_in_tShipSlip_SCDL_DLV_DATE = null;
	/** �� 245 �ϐ��F m_in_tShipSlip_SHIP_ODR_QTY */
	public String m_in_tShipSlip_SHIP_ODR_QTY = null;
	/** �� 246 �ϐ��F m_in_tShipSlip_UNIT_CD */
	public String m_in_tShipSlip_UNIT_CD = null;
	/** �� 247 �ϐ��F m_in_tShipSlip_UNIT_PRICE */
	public String m_in_tShipSlip_UNIT_PRICE = null;
	/** �� 248 �ϐ��F m_in_tShipSlip_SHIP_ODR_AMOUNT */
	public String m_in_tShipSlip_SHIP_ODR_AMOUNT = null;
	/** �� 249 �ϐ��F m_in_tShipSlip_TAX_AMOUNT */
	public String m_in_tShipSlip_TAX_AMOUNT = null;
	/** �� 250 �ϐ��F m_in_tShipSlip_INSPC_TYP */
	public String m_in_tShipSlip_INSPC_TYP = null;
	/** �� 251 �ϐ��F m_in_tShipSlip_CLIENT_REMARK_KANJI */
	public String m_in_tShipSlip_CLIENT_REMARK_KANJI = null;
	/** �� 252 �ϐ��F m_in_tShipSlip_CLIENT_BARCODE_INF */
	public String m_in_tShipSlip_CLIENT_BARCODE_INF = null;
	/** �� 253 �ϐ��F m_in_tShipSlip_PRINT_FLG */
	public String m_in_tShipSlip_PRINT_FLG = null;
	/** �� 254 �ϐ��F m_in_tShipSlip_DEL_FLG */
	public String m_in_tShipSlip_DEL_FLG = null;
	/** �� 255 �ϐ��F m_in_tShipSlip_BUYER_NAME */
	public String m_in_tShipSlip_BUYER_NAME = null;
	/** �� 256 �ϐ��F m_in_tShipSlip_PUCH_ODR_QTY_TOTAL */
	public String m_in_tShipSlip_PUCH_ODR_QTY_TOTAL = null;
	/** �� 257 �ϐ��F m_in_tShipSlip_DLV_ODR_QTY */
	public String m_in_tShipSlip_DLV_ODR_QTY = null;
	/** �� 258 �ϐ��F m_in_tShipSlip_SHIP_ODR_AMOUNT_TAX */
	public String m_in_tShipSlip_SHIP_ODR_AMOUNT_TAX = null;
	/** �� 259 �ϐ��F m_in_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT */
	public String m_in_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT = null;
	/** �� 260 �ϐ��F m_in_tShipSlip_INTERNAL_TAX_SALES_AMOUNT */
	public String m_in_tShipSlip_INTERNAL_TAX_SALES_AMOUNT = null;
	/** �� 261 �ϐ��F m_in_tShipSlip_TAXFREE_SALES_AMOUNT */
	public String m_in_tShipSlip_TAXFREE_SALES_AMOUNT = null;
	/** �� 262 �ϐ��F m_in_tShipSlip_TAX_CREDIT_SALES_AMOUNT */
	public String m_in_tShipSlip_TAX_CREDIT_SALES_AMOUNT = null;
	/** �� 263 �ϐ��F m_in_tShipSlip_EXTERNAL_TAX_AMOUNT */
	public String m_in_tShipSlip_EXTERNAL_TAX_AMOUNT = null;
	/** �� 264 �ϐ��F m_in_tShipSlip_INTERNAL_TAX_AMOUNT */
	public String m_in_tShipSlip_INTERNAL_TAX_AMOUNT = null;
	/** �� 265 �ϐ��F m_in_tShipSlip_TAX_AMOUNT_1 */
	public String m_in_tShipSlip_TAX_AMOUNT_1 = null;
	/** �� 266 �ϐ��F m_in_tShipSlip_TAX_AMOUNT_2 */
	public String m_in_tShipSlip_TAX_AMOUNT_2 = null;
	/** �� 267 �ϐ��F m_in_tShipSlip_TAX_AMOUNT_3 */
	public String m_in_tShipSlip_TAX_AMOUNT_3 = null;
	/** �� 268 �ϐ��F m_in_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT */
	public String m_in_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;
	/** �� 269 �ϐ��F m_del_tShipSlip_IN_SLIPCD */
	public String m_del_tShipSlip_IN_SLIPCD = null;
	/** �� 270 �ϐ��F m_mCustBase_COMPANY_CD */
	public String m_mCustBase_COMPANY_CD = null;
	/** �� 271 �ϐ��F m_mCustBase_CUST_CD */
	public String m_mCustBase_CUST_CD = null;
	/** �� 272 �ϐ��F m_mCustBase_DLV_LOC_CD */
	public String m_mCustBase_DLV_LOC_CD = null;
	/** �� 273 �ϐ��F m_mCustBase_DLV_LOC_NAME */
	public String m_mCustBase_DLV_LOC_NAME = null;
	/** �� 274 �ϐ��F m_mCustBase_DLV_LOC_KNAME */
	public String m_mCustBase_DLV_LOC_KNAME = null;
	/** �� 275 �ϐ��F m_mCustBase_DLV_LOC_ENAME */
	public String m_mCustBase_DLV_LOC_ENAME = null;
	/** �� 276 �ϐ��F m_mCustBase_ZIP_CD */
	public String m_mCustBase_ZIP_CD = null;
	/** �� 277 �ϐ��F m_mCustBase_ADDRESS_1 */
	public String m_mCustBase_ADDRESS_1 = null;
	/** �� 278 �ϐ��F m_mCustBase_ADDRESS_2 */
	public String m_mCustBase_ADDRESS_2 = null;
	/** �� 279 �ϐ��F m_mCustBase_ADDRESS_K_1 */
	public String m_mCustBase_ADDRESS_K_1 = null;
	/** �� 280 �ϐ��F m_mCustBase_ADDRESS_K_2 */
	public String m_mCustBase_ADDRESS_K_2 = null;
	/** �� 281 �ϐ��F m_mCustBase_TEL */
	public String m_mCustBase_TEL = null;
	/** �� 282 �ϐ��F m_mCustBase_FAX */
	public String m_mCustBase_FAX = null;
	/** �� 283 �ϐ��F m_mCustBase_SHIP_WH_CD */
	public String m_mCustBase_SHIP_WH_CD = null;
	/** �� 284 �ϐ��F m_mCustBase_TRANSPORT_CD */
	public String m_mCustBase_TRANSPORT_CD = null;
	/** �� 285 �ϐ��F m_mCustBase_TRANSPORT_NAME */
	public String m_mCustBase_TRANSPORT_NAME = null;
	/** �� 286 �ϐ��F m_mCustBase_TRANSPORT_LT */
	public String m_mCustBase_TRANSPORT_LT = null;
	/** �� 287 �ϐ��F m_mCustBase_CAL_NO */
	public String m_mCustBase_CAL_NO = null;
	/** �� 288 �ϐ��F m_mCustBase_TRANSPORT_TYP */
	public String m_mCustBase_TRANSPORT_TYP = null;
	/** �� 289 �ϐ��F m_mCustBase_DLV_START_TIME */
	public String m_mCustBase_DLV_START_TIME = null;
	/** �� 290 �ϐ��F m_mCustBase_DLV_END_TIME */
	public String m_mCustBase_DLV_END_TIME = null;
	/** �� 291 �ϐ��F m_mCustBase_AREA_CLASS_TYP1 */
	public String m_mCustBase_AREA_CLASS_TYP1 = null;
	/** �� 292 �ϐ��F m_mCustBase_AREA_CLASS_1 */
	public String m_mCustBase_AREA_CLASS_1 = null;
	/** �� 293 �ϐ��F m_mCustBase_AREA_CLASS_TYP2 */
	public String m_mCustBase_AREA_CLASS_TYP2 = null;
	/** �� 294 �ϐ��F m_mCustBase_AREA_CLASS_2 */
	public String m_mCustBase_AREA_CLASS_2 = null;
	/** �� 295 �ϐ��F m_mCustBase_AREA_CLASS_TYP3 */
	public String m_mCustBase_AREA_CLASS_TYP3 = null;
	/** �� 296 �ϐ��F m_mCustBase_AREA_CLASS_3 */
	public String m_mCustBase_AREA_CLASS_3 = null;
	/** �� 297 �ϐ��F m_mCustBase_REMARKS_1 */
	public String m_mCustBase_REMARKS_1 = null;
	/** �� 298 �ϐ��F m_mCustBase_REMARKS_2 */
	public String m_mCustBase_REMARKS_2 = null;
	/** �� 299 �ϐ��F m_mCustBase_REMARKS_3 */
	public String m_mCustBase_REMARKS_3 = null;
	/** �� 300 �ϐ��F m_mCustBase_DEPO_WH_CD */
	public String m_mCustBase_DEPO_WH_CD = null;
	/** �� 301 �ϐ��F m_mCustBase_IN_COMPANYCD */
	public String m_mCustBase_IN_COMPANYCD = null;
	/** �� 302 �ϐ��F m_mCustBase_IN_CUSTCD */
	public String m_mCustBase_IN_CUSTCD = null;
	/** �� 303 �ϐ��F m_mCustBase_IN_DLVLOCCD */
	public String m_mCustBase_IN_DLVLOCCD = null;
	/** �� 304 �ϐ��F m_mCust_COMPANY_CD */
	public String m_mCust_COMPANY_CD = null;
	/** �� 305 �ϐ��F m_mCust_CUST_CD */
	public String m_mCust_CUST_CD = null;
	/** �� 306 �ϐ��F m_mCust_CUST_NAME */
	public String m_mCust_CUST_NAME = null;
	/** �� 307 �ϐ��F m_mCust_CUST_KNAME */
	public String m_mCust_CUST_KNAME = null;
	/** �� 308 �ϐ��F m_mCust_OWN_ORG_CD */
	public String m_mCust_OWN_ORG_CD = null;
	/** �� 309 �ϐ��F m_mCust_OWN_PERSON_CD */
	public String m_mCust_OWN_PERSON_CD = null;
	/** �� 310 �ϐ��F m_mCust_CUR_CD */
	public String m_mCust_CUR_CD = null;
	/** �� 311 �ϐ��F m_mCust_EXCH_TYP */
	public String m_mCust_EXCH_TYP = null;
	/** �� 312 �ϐ��F m_mCust_TAX_APPLY_TYP */
	public String m_mCust_TAX_APPLY_TYP = null;
	/** �� 313 �ϐ��F m_mCust_TAX_CD */
	public String m_mCust_TAX_CD = null;
	/** �� 314 �ϐ��F m_mCust_TAX_CALC_TYP */
	public String m_mCust_TAX_CALC_TYP = null;
	/** �� 315 �ϐ��F m_mCust_PRICE_ROUND_TYP */
	public String m_mCust_PRICE_ROUND_TYP = null;
	/** �� 316 �ϐ��F m_mCust_DETAIL_ROUND_TYP */
	public String m_mCust_DETAIL_ROUND_TYP = null;
	/** �� 317 �ϐ��F m_mCust_UNCONFIRM_ODR_EFF_PRIOD */
	public String m_mCust_UNCONFIRM_ODR_EFF_PRIOD = null;
	/** �� 318 �ϐ��F m_mCust_UNCONFIRM_ODR_EFF_TERM_FLG */
	public String m_mCust_UNCONFIRM_ODR_EFF_TERM_FLG = null;
	/** �� 319 �ϐ��F m_mCust_EDI_CUST_VEND_CD */
	public String m_mCust_EDI_CUST_VEND_CD = null;
	/** �� 320 �ϐ��F m_mCust_PARTIAL_SHIP_INST_FLG */
	public String m_mCust_PARTIAL_SHIP_INST_FLG = null;
	/** �� 321 �ϐ��F m_mCust_DEPO_TYP */
	public String m_mCust_DEPO_TYP = null;
	/** �� 322 �ϐ��F m_mCust_INSPC_ACPT_TYP */
	public String m_mCust_INSPC_ACPT_TYP = null;
	/** �� 323 �ϐ��F m_mCust_IN_COMPANYCD */
	public String m_mCust_IN_COMPANYCD = null;
	/** �� 324 �ϐ��F m_mCust_IN_CUSTCD */
	public String m_mCust_IN_CUSTCD = null;
	/** �� 325 �ϐ��F m_tori_tAnsDlvDate_REST_SHIP_ODR_QTY */
	public String m_tori_tAnsDlvDate_REST_SHIP_ODR_QTY = null;
	/** �� 326 �ϐ��F m_tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG */
	public String m_tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG = null;
	/** �� 327 �ϐ��F m_tori_tAnsDlvDate_IN_ODRNO */
	public String m_tori_tAnsDlvDate_IN_ODRNO = null;
	/** �� 328 �ϐ��F m_tori_tAnsDlvDate_IN_PARTDLVSEQNO */
	public String m_tori_tAnsDlvDate_IN_PARTDLVSEQNO = null;
	/** �� 329 �ϐ��F m_chkisWhCd_WH_CD */
	public String m_chkisWhCd_WH_CD = null;
	/** �� 330 �ϐ��F m_chkisWhCd_WH_TYP */
	public String m_chkisWhCd_WH_TYP = null;
	/** �� 331 �ϐ��F m_chkisWhCd_ITEM_CD */
	public String m_chkisWhCd_ITEM_CD = null;
	/** �� 332 �ϐ��F m_chkisWhCd_PBL_SHIP_QTY */
	public String m_chkisWhCd_PBL_SHIP_QTY = null;
	/** �� 333 �ϐ��F m_chkisWhCd_IN_ITEMCD */
	public String m_chkisWhCd_IN_ITEMCD = null;
	/** �� 334 �ϐ��F m_chkisWhCd_IN_WHCD */
	public String m_chkisWhCd_IN_WHCD = null;
	/** �� 335 �ϐ��F m_mUnitCost_UNIT_COST */
	public String m_mUnitCost_UNIT_COST = null;
	/** �� 336 �ϐ��F m_mUnitCost_EFF_PHASE_IN_DATE */
	public String m_mUnitCost_EFF_PHASE_IN_DATE = null;
	/** �� 337 �ϐ��F m_mUnitCost_IN_COMPANYCD */
	public String m_mUnitCost_IN_COMPANYCD = null;
	/** �� 338 �ϐ��F m_mUnitCost_IN_CUSTCD */
	public String m_mUnitCost_IN_CUSTCD = null;
	/** �� 339 �ϐ��F m_mUnitCost_IN_ITEMCD */
	public String m_mUnitCost_IN_ITEMCD = null;
	/** �� 340 �ϐ��F m_mUnitCost_IN_EFFPHASEINDATE */
	public String m_mUnitCost_IN_EFFPHASEINDATE = null;
	/** �� 341 �ϐ��F m_mWhWH_CD */
	public String m_mWhWH_CD = null;
	/** �� 342 �ϐ��F m_mWhWH_NAME */
	public String m_mWhWH_NAME = null;
	/** �� 343 �ϐ��F m_strTaxTAX_KBN */
	public String m_strTaxTAX_KBN = null;
	/** �� 344 �ϐ��F m_strTaxOLD_TAX_1 */
	public String m_strTaxOLD_TAX_1 = null;
	/** �� 345 �ϐ��F m_strTaxOLD_TAX_2 */
	public String m_strTaxOLD_TAX_2 = null;
	/** �� 346 �ϐ��F m_strTaxOLD_TAX_3 */
	public String m_strTaxOLD_TAX_3 = null;
	/** �� 347 �ϐ��F m_strTaxNEW_TAX_1 */
	public String m_strTaxNEW_TAX_1 = null;
	/** �� 348 �ϐ��F m_strTaxNEW_TAX_2 */
	public String m_strTaxNEW_TAX_2 = null;
	/** �� 349 �ϐ��F m_strTaxNEW_TAX_3 */
	public String m_strTaxNEW_TAX_3 = null;
	/** �� 350 �ϐ��F m_strTaxSTART_DATE */
	public String m_strTaxSTART_DATE = null;
	/** �� 351 �ϐ��F m_strTaxROUND_TYP */
	public String m_strTaxROUND_TYP = null;
	/** �� 352 �ϐ��F m_strTaxIN_COMPANYCD */
	public String m_strTaxIN_COMPANYCD = null;
	/** �� 353 �ϐ��F m_strTaxIN_CUSTCD */
	public String m_strTaxIN_CUSTCD = null;
	/** �� 354 �ϐ��F m_g_CUST_ITEM_CD */
	public String m_g_CUST_ITEM_CD = null;
	/** �� 355 �ϐ��F m_strYotaku_WH_CD */
	public String m_strYotaku_WH_CD = null;
	/** �� 356 �ϐ��F m_strYotaku_IN_WH_TYP */
	public String m_strYotaku_IN_WH_TYP = null;
	/** �� 357 �ϐ��F m_strSYUKA_LT */
	public String m_strSYUKA_LT = null;
	/** �� 358 �ϐ��F m_chkisinWhCd_WH_CD */
	public String m_chkisinWhCd_WH_CD = null;
	/** �� 359 �ϐ��F m_chkisinWhCd_WH_TYP */
	public String m_chkisinWhCd_WH_TYP = null;
	/** �� 360 �ϐ��F m_chkisinWhCd_WH_NAME */
	public String m_chkisinWhCd_WH_NAME = null;
	/** �� 361 �ϐ��F m_chkis_IN_WHCD */
	public String m_chkis_IN_WHCD = null;
	/** �� 362 �ϐ��F m_uptOdr_SHIP_CNT */
	public String m_uptOdr_SHIP_CNT = null;
	/** �� 363 �ϐ��F m_tHOLIDAY_FLG */
	public String m_tHOLIDAY_FLG = null;
	/** �� 364 �ϐ��F m_tWH_CD */
	public String m_tWH_CD = null;
	/** �� 365 �ϐ��F m_tCAL_DATE */
	public String m_tCAL_DATE = null;
	/** �� 366 �ϐ��F m_tDECIMAL_FIG */
	public String m_tDECIMAL_FIG = null;
	/** �� 367 �ϐ��F m_tCUR_CD */
	public String m_tCUR_CD = null;
	/** �� 368 �ϐ��F m_chkisWhCd_JOB_ODR_CD */
	public String m_chkisWhCd_JOB_ODR_CD = null;
	/** �� 369 �ϐ��F m_serTJobOdr_JOB_ODR_CD */
	public String m_serTJobOdr_JOB_ODR_CD = null;
	/** �� 370 �ϐ��F m_serTJobOdr_ITEM_CD */
	public String m_serTJobOdr_ITEM_CD = null;
	/** �� 371 �ϐ��F m_tUnShipList_ACPT_ODR_CD */
	public String m_tUnShipList_ACPT_ODR_CD = null;
	/** �� 372 �ϐ��F m_tUnShipList_PART_DLV_SEQ_NO */
	public String m_tUnShipList_PART_DLV_SEQ_NO = null;
	/** �� 373 �ϐ��F m_strTAX_CD */
	public String m_strTAX_CD = null;
	/** �� 374 �ϐ��F m_selMODIFY_COUNT */
	public String m_selMODIFY_COUNT = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_g_PART_DLV_SEQ_NO */
	public List l_g_PART_DLV_SEQ_NO = null;

	/** �� 2 List�ϐ��F l_g_DIRECT_DLV_FLG */
	public List l_g_DIRECT_DLV_FLG = null;

	/** �� 3 List�ϐ��F l_g_REST_SHIP_ODR_QTY */
	public List l_g_REST_SHIP_ODR_QTY = null;

	/** �� 4 List�ϐ��F l_g_CUST_ANAME */
	public List l_g_CUST_ANAME = null;

	/** �� 5 List�ϐ��F l_g_ITEM_CD */
	public List l_g_ITEM_CD = null;

	/** �� 6 List�ϐ��F l_k_MODE */
	public List l_k_MODE = null;

	/** �� 7 List�ϐ��F l_h_RESULT */
	public List l_h_RESULT = null;

	/** �� 8 List�ϐ��F l_h_REST_SHIP_ODR_QTY */
	public List l_h_REST_SHIP_ODR_QTY = null;

	/** �� 9 List�ϐ��F l_h_CUST_ANAME */
	public List l_h_CUST_ANAME = null;

	/** �� 10 List�ϐ��F l_h_CUST_ITEM_CD */
	public List l_h_CUST_ITEM_CD = null;

	/** �� 11 List�ϐ��F l_h_ITEM_CD */
	public List l_h_ITEM_CD = null;

	/** �� 12 List�ϐ��F l_h_AP_SECRTY_TYP */
	public List l_h_AP_SECRTY_TYP = null;

	/** �� 13 List�ϐ��F l_h_MODIFY_CNT */
	public List l_h_MODIFY_CNT = null;

	/** �� 14 List�ϐ��F l_r_SEL_PTN1 */
	public List l_r_SEL_PTN1 = null;

	/** �� 15 List�ϐ��F l_r_SEL_PTN2 */
	public List l_r_SEL_PTN2 = null;

	/** �� 16 List�ϐ��F l_g_ODR_NO */
	public List l_g_ODR_NO = null;

	/** �� 17 List�ϐ��F l_g_SLIP_CD */
	public List l_g_SLIP_CD = null;

	/** �� 18 List�ϐ��F l_g_DESINATED_SHIP_DATE */
	public List l_g_DESINATED_SHIP_DATE = null;

	/** �� 19 List�ϐ��F l_g_REST_SHIP_ODR_QTY2 */
	public List l_g_REST_SHIP_ODR_QTY2 = null;

	/** �� 20 List�ϐ��F l_g_WH_CD */
	public List l_g_WH_CD = null;

	/** �� 21 List�ϐ��F l_h_PARTIAL_SHIP_INST_FLG */
	public List l_h_PARTIAL_SHIP_INST_FLG = null;

	/** �� 22 List�ϐ��F l_g_STOCK_UNIT */
	public List l_g_STOCK_UNIT = null;

	/** �� 23 List�ϐ��F l_g_STOCK_UNIT2 */
	public List l_g_STOCK_UNIT2 = null;

	/** �� 24 List�ϐ��F l_g_WH_NAME */
	public List l_g_WH_NAME = null;

	/** �� 25 List�ϐ��F l_g_CUST_CD */
	public List l_g_CUST_CD = null;

	/** �� 26 List�ϐ��F l_g_CUST_ITEM_NAME */
	public List l_g_CUST_ITEM_NAME = null;

	/** �� 27 List�ϐ��F l_g_ITEM_NAME */
	public List l_g_ITEM_NAME = null;

	/** �� 28 List�ϐ��F l_g_CUST_ODR_NO */
	public List l_g_CUST_ODR_NO = null;

	/** �� 29 List�ϐ��F l_c_JOB_ODR_CD */
	public List l_c_JOB_ODR_CD = null;

	/** �� 30 List�ϐ��F l_h_MRP_ODR_TYP */
	public List l_h_MRP_ODR_TYP = null;

	/** �� 31 List�ϐ��F l_h_JOB_ODR_CD */
	public List l_h_JOB_ODR_CD = null;

	/** �� 32 List�ϐ��F l_tMRP_ODR_TYP */
	public List l_tMRP_ODR_TYP = null;

	/** �� 33 List�ϐ��F l_chkisWhCd_IN_JOBODRCD */
	public List l_chkisWhCd_IN_JOBODRCD = null;

	/** �� 34 List�ϐ��F l_strCOMPANY_CD */
	public List l_strCOMPANY_CD = null;

	/** �� 35 List�ϐ��F l_strUSER_NAME */
	public List l_strUSER_NAME = null;

	/** �� 36 List�ϐ��F l_strPLANT_CD */
	public List l_strPLANT_CD = null;

	/** �� 37 List�ϐ��F l_strSECTION_CD */
	public List l_strSECTION_CD = null;

	/** �� 38 List�ϐ��F l_strPLANT_NAME */
	public List l_strPLANT_NAME = null;

	/** �� 39 List�ϐ��F l_strPLANT_ANAME */
	public List l_strPLANT_ANAME = null;

	/** �� 40 List�ϐ��F l_strCAL_NO */
	public List l_strCAL_NO = null;

	/** �� 41 List�ϐ��F l_strUSER_CD */
	public List l_strUSER_CD = null;

	/** �� 42 List�ϐ��F l_strBUSINESS_OPR_DATE */
	public List l_strBUSINESS_OPR_DATE = null;

	/** �� 43 List�ϐ��F l_strMAX_DISPLAY_ROWNUM */
	public List l_strMAX_DISPLAY_ROWNUM = null;

	/** �� 44 List�ϐ��F l_tAnsDlvDate_ODR_NO */
	public List l_tAnsDlvDate_ODR_NO = null;

	/** �� 45 List�ϐ��F l_tAnsDlvDate_PART_DLV_SEQ_NO */
	public List l_tAnsDlvDate_PART_DLV_SEQ_NO = null;

	/** �� 46 List�ϐ��F l_tAnsDlvDate_DESINATED_SHIP_DATE */
	public List l_tAnsDlvDate_DESINATED_SHIP_DATE = null;

	/** �� 47 List�ϐ��F l_tOdrODR_CTL_NO */
	public List l_tOdrODR_CTL_NO = null;

	/** �� 48 List�ϐ��F l_tOdrCtl_CUST_ITEM_CD */
	public List l_tOdrCtl_CUST_ITEM_CD = null;

	/** �� 49 List�ϐ��F l_tOdrCtl_ITEM_CD */
	public List l_tOdrCtl_ITEM_CD = null;

	/** �� 50 List�ϐ��F l_mCust_CUST_ANAME */
	public List l_mCust_CUST_ANAME = null;

	/** �� 51 List�ϐ��F l_tAnsDlvDate_REST_SHIP_ODR_QTY */
	public List l_tAnsDlvDate_REST_SHIP_ODR_QTY = null;

	/** �� 52 List�ϐ��F l_tOdr_TRANSPORT_TYP */
	public List l_tOdr_TRANSPORT_TYP = null;

	/** �� 53 List�ϐ��F l_tOdr_ODR_UNIT_PRICE */
	public List l_tOdr_ODR_UNIT_PRICE = null;

	/** �� 54 List�ϐ��F l_tOdr_SPCL_PRICE_TYP */
	public List l_tOdr_SPCL_PRICE_TYP = null;

	/** �� 55 List�ϐ��F l_tOdrCtl_CUST_CD */
	public List l_tOdrCtl_CUST_CD = null;

	/** �� 56 List�ϐ��F l_tOdr_PARTIAL_SHIP_INST_FLG */
	public List l_tOdr_PARTIAL_SHIP_INST_FLG = null;

	/** �� 57 List�ϐ��F l_tAnsDlvDate_MODIFY_COUNT */
	public List l_tAnsDlvDate_MODIFY_COUNT = null;

	/** �� 58 List�ϐ��F l_tITEM_NAME */
	public List l_tITEM_NAME = null;

	/** �� 59 List�ϐ��F l_tSTOCK_UNIT */
	public List l_tSTOCK_UNIT = null;

	/** �� 60 List�ϐ��F l_tUNIT_QTY_TYP */
	public List l_tUNIT_QTY_TYP = null;

	/** �� 61 List�ϐ��F l_tWH_NAME */
	public List l_tWH_NAME = null;

	/** �� 62 List�ϐ��F l_tSHIP_WH_CD */
	public List l_tSHIP_WH_CD = null;

	/** �� 63 List�ϐ��F l_tCUST_CD */
	public List l_tCUST_CD = null;

	/** �� 64 List�ϐ��F l_tCUST_ITEM_NAME */
	public List l_tCUST_ITEM_NAME = null;

	/** �� 65 List�ϐ��F l_tCUST_ODR_NO */
	public List l_tCUST_ODR_NO = null;

	/** �� 66 List�ϐ��F l_g_JOB_ODR_CD */
	public List l_g_JOB_ODR_CD = null;

	/** �� 67 List�ϐ��F l_sysMyCompany_IN_COMPANYCD */
	public List l_sysMyCompany_IN_COMPANYCD = null;

	/** �� 68 List�ϐ��F l_tAnsDlvDate_IN_ODRNO */
	public List l_tAnsDlvDate_IN_ODRNO = null;

	/** �� 69 List�ϐ��F l_tAnsDlvDate_IN_PARTDLVSEQNO */
	public List l_tAnsDlvDate_IN_PARTDLVSEQNO = null;

	/** �� 70 List�ϐ��F l_up_tAnsDlvDate_DESINATED_SHIP_DATE */
	public List l_up_tAnsDlvDate_DESINATED_SHIP_DATE = null;

	/** �� 71 List�ϐ��F l_up_tAnsDlvDate_REST_SHIP_ODR_QTY */
	public List l_up_tAnsDlvDate_REST_SHIP_ODR_QTY = null;

	/** �� 72 List�ϐ��F l_up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG */
	public List l_up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG = null;

	/** �� 73 List�ϐ��F l_up_tAnsDlvDate_IN_ODRNO */
	public List l_up_tAnsDlvDate_IN_ODRNO = null;

	/** �� 74 List�ϐ��F l_up_tAnsDlvDate_IN_PARTDLVSEQNO */
	public List l_up_tAnsDlvDate_IN_PARTDLVSEQNO = null;

	/** �� 75 List�ϐ��F l_tShipOdr_ODR_NO */
	public List l_tShipOdr_ODR_NO = null;

	/** �� 76 List�ϐ��F l_tShipOdr_PART_DLV_SEQ_NO */
	public List l_tShipOdr_PART_DLV_SEQ_NO = null;

	/** �� 77 List�ϐ��F l_tShipOdr_SLIP_CD */
	public List l_tShipOdr_SLIP_CD = null;

	/** �� 78 List�ϐ��F l_tShipOdr_DESINATED_SHIP_DATE */
	public List l_tShipOdr_DESINATED_SHIP_DATE = null;

	/** �� 79 List�ϐ��F l_tShipOdr_SHIP_QTY */
	public List l_tShipOdr_SHIP_QTY = null;

	/** �� 80 List�ϐ��F l_tShipOdr_ALLCT_WH_CD */
	public List l_tShipOdr_ALLCT_WH_CD = null;

	/** �� 81 List�ϐ��F l_tShipOdr_CUST_NAME */
	public List l_tShipOdr_CUST_NAME = null;

	/** �� 82 List�ϐ��F l_tShipOdr_CUST_ITEM_CD */
	public List l_tShipOdr_CUST_ITEM_CD = null;

	/** �� 83 List�ϐ��F l_tShipOdr_ITEM_CD */
	public List l_tShipOdr_ITEM_CD = null;

	/** �� 84 List�ϐ��F l_tShipOdr_JOB_ODR_CD */
	public List l_tShipOdr_JOB_ODR_CD = null;

	/** �� 85 List�ϐ��F l_tShipOdrAnsDlvDate_REST_SHIP_ODR_QTY */
	public List l_tShipOdrAnsDlvDate_REST_SHIP_ODR_QTY = null;

	/** �� 86 List�ϐ��F l_tShipOdr_DEL_FLG */
	public List l_tShipOdr_DEL_FLG = null;

	/** �� 87 List�ϐ��F l_tShipOdr_DIRECT_DLV_FLG */
	public List l_tShipOdr_DIRECT_DLV_FLG = null;

	/** �� 88 List�ϐ��F l_tShipOdr_TRANSPORT_TYP */
	public List l_tShipOdr_TRANSPORT_TYP = null;

	/** �� 89 List�ϐ��F l_tShipOdr_MODIFY_COUNT */
	public List l_tShipOdr_MODIFY_COUNT = null;

	/** �� 90 List�ϐ��F l_tDEPO_TRANSFER_PROC_FLG */
	public List l_tDEPO_TRANSFER_PROC_FLG = null;

	/** �� 91 List�ϐ��F l_tShipOdr_IN_SLIPCD */
	public List l_tShipOdr_IN_SLIPCD = null;

	/** �� 92 List�ϐ��F l_in_tShipOdr_ODR_NO */
	public List l_in_tShipOdr_ODR_NO = null;

	/** �� 93 List�ϐ��F l_in_tShipOdr_PART_DLV_SEQ_NO */
	public List l_in_tShipOdr_PART_DLV_SEQ_NO = null;

	/** �� 94 List�ϐ��F l_in_tShipOdr_SLIP_CD */
	public List l_in_tShipOdr_SLIP_CD = null;

	/** �� 95 List�ϐ��F l_in_tShipOdr_ITEM_CD */
	public List l_in_tShipOdr_ITEM_CD = null;

	/** �� 96 List�ϐ��F l_in_tShipOdr_CUST_ITEM_CD */
	public List l_in_tShipOdr_CUST_ITEM_CD = null;

	/** �� 97 List�ϐ��F l_in_tShipOdr_CUST_ODR_NO */
	public List l_in_tShipOdr_CUST_ODR_NO = null;

	/** �� 98 List�ϐ��F l_in_tShipOdr_CUST_CD */
	public List l_in_tShipOdr_CUST_CD = null;

	/** �� 99 List�ϐ��F l_in_tShipOdr_CUST_NAME */
	public List l_in_tShipOdr_CUST_NAME = null;

	/** �� 100 List�ϐ��F l_in_tShipOdr_SHIP_ODR_ISS_PSN_CD */
	public List l_in_tShipOdr_SHIP_ODR_ISS_PSN_CD = null;

	/** �� 101 List�ϐ��F l_in_tShipOdr_DLV_LOC_CD */
	public List l_in_tShipOdr_DLV_LOC_CD = null;

	/** �� 102 List�ϐ��F l_in_tShipOdr_DESINATED_SHIP_DATE */
	public List l_in_tShipOdr_DESINATED_SHIP_DATE = null;

	/** �� 103 List�ϐ��F l_in_tShipOdr_SHIP_QTY */
	public List l_in_tShipOdr_SHIP_QTY = null;

	/** �� 104 List�ϐ��F l_in_tShipOdr_UNIT_PRICE */
	public List l_in_tShipOdr_UNIT_PRICE = null;

	/** �� 105 List�ϐ��F l_in_tShipOdr_SHIP_ODR_AMOUNT */
	public List l_in_tShipOdr_SHIP_ODR_AMOUNT = null;

	/** �� 106 List�ϐ��F l_in_tShipOdr_CURRNCY_CD */
	public List l_in_tShipOdr_CURRNCY_CD = null;

	/** �� 107 List�ϐ��F l_in_tShipOdr_PKG_UNIT_QTY */
	public List l_in_tShipOdr_PKG_UNIT_QTY = null;

	/** �� 108 List�ϐ��F l_in_tShipOdr_REMARKS */
	public List l_in_tShipOdr_REMARKS = null;

	/** �� 109 List�ϐ��F l_in_tShipOdr_ALLCT_WH_CD */
	public List l_in_tShipOdr_ALLCT_WH_CD = null;

	/** �� 110 List�ϐ��F l_in_tShipOdr_DEPO_TYP */
	public List l_in_tShipOdr_DEPO_TYP = null;

	/** �� 111 List�ϐ��F l_in_tShipOdr_ENTRY_TYP */
	public List l_in_tShipOdr_ENTRY_TYP = null;

	/** �� 112 List�ϐ��F l_in_tShipOdr_PRINT_FLG */
	public List l_in_tShipOdr_PRINT_FLG = null;

	/** �� 113 List�ϐ��F l_in_tShipOdr_SHP_CMPLT_FLG */
	public List l_in_tShipOdr_SHP_CMPLT_FLG = null;

	/** �� 114 List�ϐ��F l_in_tShipOdr_DEL_FLG */
	public List l_in_tShipOdr_DEL_FLG = null;

	/** �� 115 List�ϐ��F l_in_tShipOdr_TRANSPORT_CD */
	public List l_in_tShipOdr_TRANSPORT_CD = null;

	/** �� 116 List�ϐ��F l_in_tShipOdr_DIRECT_DLV_FLG */
	public List l_in_tShipOdr_DIRECT_DLV_FLG = null;

	/** �� 117 List�ϐ��F l_in_tShipOdr_CUST_CHRG_PSN_CD */
	public List l_in_tShipOdr_CUST_CHRG_PSN_CD = null;

	/** �� 118 List�ϐ��F l_in_tShipOdr_UNIT_CD */
	public List l_in_tShipOdr_UNIT_CD = null;

	/** �� 119 List�ϐ��F l_in_tShipOdr_SCDL_DLV_DATE */
	public List l_in_tShipOdr_SCDL_DLV_DATE = null;

	/** �� 120 List�ϐ��F l_in_tShipOdr_TRANSFER_WH_CD */
	public List l_in_tShipOdr_TRANSFER_WH_CD = null;

	/** �� 121 List�ϐ��F l_in_tShipOdr_DLV_KEY_NO */
	public List l_in_tShipOdr_DLV_KEY_NO = null;

	/** �� 122 List�ϐ��F l_in_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES */
	public List l_in_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES = null;

	/** �� 123 List�ϐ��F l_in_tShipOdr_SHIP_ODR_NO */
	public List l_in_tShipOdr_SHIP_ODR_NO = null;

	/** �� 124 List�ϐ��F l_in_tShipOdr_JOB_ODR_CD */
	public List l_in_tShipOdr_JOB_ODR_CD = null;

	/** �� 125 List�ϐ��F l_del_tShipOdr_IN_SLIPCD */
	public List l_del_tShipOdr_IN_SLIPCD = null;

	/** �� 126 List�ϐ��F l_tOdr_ODR_NO */
	public List l_tOdr_ODR_NO = null;

	/** �� 127 List�ϐ��F l_tOdr_ODR_TYP */
	public List l_tOdr_ODR_TYP = null;

	/** �� 128 List�ϐ��F l_tOdr_ODR_CTL_NO */
	public List l_tOdr_ODR_CTL_NO = null;

	/** �� 129 List�ϐ��F l_tOdr_CUST_ODR_NO */
	public List l_tOdr_CUST_ODR_NO = null;

	/** �� 130 List�ϐ��F l_tOdr_CUST_CHRG_ORG_CD */
	public List l_tOdr_CUST_CHRG_ORG_CD = null;

	/** �� 131 List�ϐ��F l_tOdr_CUST_CHRG_PSN_CD */
	public List l_tOdr_CUST_CHRG_PSN_CD = null;

	/** �� 132 List�ϐ��F l_tOdr_ODR_ACPT_ORG_CD */
	public List l_tOdr_ODR_ACPT_ORG_CD = null;

	/** �� 133 List�ϐ��F l_tOdr_ODR_ACPT_PSN_CD */
	public List l_tOdr_ODR_ACPT_PSN_CD = null;

	/** �� 134 List�ϐ��F l_tOdr_CURRNCY_CD */
	public List l_tOdr_CURRNCY_CD = null;

	/** �� 135 List�ϐ��F l_tOdr_EXCH_TYP */
	public List l_tOdr_EXCH_TYP = null;

	/** �� 136 List�ϐ��F l_tOdr_DLV_LOC_CD */
	public List l_tOdr_DLV_LOC_CD = null;

	/** �� 137 List�ϐ��F l_tOdr_DLV_LOC_CD_EIAJ */
	public List l_tOdr_DLV_LOC_CD_EIAJ = null;

	/** �� 138 List�ϐ��F l_tOdr_DLV_LOC_NAME */
	public List l_tOdr_DLV_LOC_NAME = null;

	/** �� 139 List�ϐ��F l_tOdr_DLV_LOC_NAME_KANJI */
	public List l_tOdr_DLV_LOC_NAME_KANJI = null;

	/** �� 140 List�ϐ��F l_tOdr_PRD_ODR_PLACE_CD */
	public List l_tOdr_PRD_ODR_PLACE_CD = null;

	/** �� 141 List�ϐ��F l_tOdr_PART_DLV_COUNT */
	public List l_tOdr_PART_DLV_COUNT = null;

	/** �� 142 List�ϐ��F l_tOdr_DEPO_TYP */
	public List l_tOdr_DEPO_TYP = null;

	/** �� 143 List�ϐ��F l_tOdr_DESINATED_DLV_DATE */
	public List l_tOdr_DESINATED_DLV_DATE = null;

	/** �� 144 List�ϐ��F l_tOdr_STD_DESINATED_RCV_DATE */
	public List l_tOdr_STD_DESINATED_RCV_DATE = null;

	/** �� 145 List�ϐ��F l_tOdr_ODR_QTY */
	public List l_tOdr_ODR_QTY = null;

	/** �� 146 List�ϐ��F l_tOdr_REMAIN_UNCONFIRM_ODR_QTY */
	public List l_tOdr_REMAIN_UNCONFIRM_ODR_QTY = null;

	/** �� 147 List�ϐ��F l_tOdr_CANCELED_UNCONFIRM_ODR_QTY */
	public List l_tOdr_CANCELED_UNCONFIRM_ODR_QTY = null;

	/** �� 148 List�ϐ��F l_tOdr_UNIT_CD */
	public List l_tOdr_UNIT_CD = null;

	/** �� 149 List�ϐ��F l_tOdr_UNCONFIRM_ODR_BALANCE */
	public List l_tOdr_UNCONFIRM_ODR_BALANCE = null;

	/** �� 150 List�ϐ��F l_tOdr_ODR_AMOUNT */
	public List l_tOdr_ODR_AMOUNT = null;

	/** �� 151 List�ϐ��F l_tOdr_ODR_AMOUNT_EXCH_RATES */
	public List l_tOdr_ODR_AMOUNT_EXCH_RATES = null;

	/** �� 152 List�ϐ��F l_tOdr_TOTAL_SHIP_QTY */
	public List l_tOdr_TOTAL_SHIP_QTY = null;

	/** �� 153 List�ϐ��F l_tOdr_SHIP_AMOUNT */
	public List l_tOdr_SHIP_AMOUNT = null;

	/** �� 154 List�ϐ��F l_tOdr_SHIP_AMOUNT_EXCH_RATES */
	public List l_tOdr_SHIP_AMOUNT_EXCH_RATES = null;

	/** �� 155 List�ϐ��F l_tOdr_RETURN_PRICE */
	public List l_tOdr_RETURN_PRICE = null;

	/** �� 156 List�ϐ��F l_tOdr_RETURN_QTY */
	public List l_tOdr_RETURN_QTY = null;

	/** �� 157 List�ϐ��F l_tOdr_RETURN_AMOUNT */
	public List l_tOdr_RETURN_AMOUNT = null;

	/** �� 158 List�ϐ��F l_tOdr_RETURN_AMOUNT_EXCH_RATES */
	public List l_tOdr_RETURN_AMOUNT_EXCH_RATES = null;

	/** �� 159 List�ϐ��F l_tOdr_ODR_CMPLT_FLG */
	public List l_tOdr_ODR_CMPLT_FLG = null;

	/** �� 160 List�ϐ��F l_tOdr_ODR_CMPLT_DATE */
	public List l_tOdr_ODR_CMPLT_DATE = null;

	/** �� 161 List�ϐ��F l_tOdr_CUS_DLV_CD */
	public List l_tOdr_CUS_DLV_CD = null;

	/** �� 162 List�ϐ��F l_tOdr_CUS_DLV_KEY_CD */
	public List l_tOdr_CUS_DLV_KEY_CD = null;

	/** �� 163 List�ϐ��F l_tOdr_PART_NAME */
	public List l_tOdr_PART_NAME = null;

	/** �� 164 List�ϐ��F l_tOdr_PKG_UNIT */
	public List l_tOdr_PKG_UNIT = null;

	/** �� 165 List�ϐ��F l_tOdr_SLIP_PRICE_PRINT_TYP */
	public List l_tOdr_SLIP_PRICE_PRINT_TYP = null;

	/** �� 166 List�ϐ��F l_tOdr_INSPC_TYP */
	public List l_tOdr_INSPC_TYP = null;

	/** �� 167 List�ϐ��F l_tOdr_CLIENT_REMARK */
	public List l_tOdr_CLIENT_REMARK = null;

	/** �� 168 List�ϐ��F l_tOdr_CLIENT_REMARK_KANJI */
	public List l_tOdr_CLIENT_REMARK_KANJI = null;

	/** �� 169 List�ϐ��F l_tOdr_CLIENT_BARCODE_INF */
	public List l_tOdr_CLIENT_BARCODE_INF = null;

	/** �� 170 List�ϐ��F l_tOdr_TRANSPORT_CD */
	public List l_tOdr_TRANSPORT_CD = null;

	/** �� 171 List�ϐ��F l_tOdr_TAX_APPLY_TYP */
	public List l_tOdr_TAX_APPLY_TYP = null;

	/** �� 172 List�ϐ��F l_tOdr_TAX_CD */
	public List l_tOdr_TAX_CD = null;

	/** �� 173 List�ϐ��F l_tOdr_TAX_CALC_TYP */
	public List l_tOdr_TAX_CALC_TYP = null;

	/** �� 174 List�ϐ��F l_tOdr_REMARKS */
	public List l_tOdr_REMARKS = null;

	/** �� 175 List�ϐ��F l_tOdr_ODR_ACPT_DATE */
	public List l_tOdr_ODR_ACPT_DATE = null;

	/** �� 176 List�ϐ��F l_tOdr_SHIP_PLAN_REMAIN_QTY */
	public List l_tOdr_SHIP_PLAN_REMAIN_QTY = null;

	/** �� 177 List�ϐ��F l_tOdr_SHIP_PLAN_CMPLT_FLG */
	public List l_tOdr_SHIP_PLAN_CMPLT_FLG = null;

	/** �� 178 List�ϐ��F l_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG */
	public List l_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG = null;

	/** �� 179 List�ϐ��F l_tOdr_IF_CTL_NO */
	public List l_tOdr_IF_CTL_NO = null;

	/** �� 180 List�ϐ��F l_tOdr_ENTRY_TYP */
	public List l_tOdr_ENTRY_TYP = null;

	/** �� 181 List�ϐ��F l_tOdr_BUYER_NAME */
	public List l_tOdr_BUYER_NAME = null;

	/** �� 182 List�ϐ��F l_tOdr_PUCH_ODR_QTY_TOTAL */
	public List l_tOdr_PUCH_ODR_QTY_TOTAL = null;

	/** �� 183 List�ϐ��F l_tOdr_UNIT_CD_ORG */
	public List l_tOdr_UNIT_CD_ORG = null;

	/** �� 184 List�ϐ��F l_tOdr_SHIP_CNT */
	public List l_tOdr_SHIP_CNT = null;

	/** �� 185 List�ϐ��F l_tOdr_CUR_CD */
	public List l_tOdr_CUR_CD = null;

	/** �� 186 List�ϐ��F l_tOdr_EXCH_TYP_R */
	public List l_tOdr_EXCH_TYP_R = null;

	/** �� 187 List�ϐ��F l_tOdr_IN_ODRNO */
	public List l_tOdr_IN_ODRNO = null;

	/** �� 188 List�ϐ��F l_uptOdr_PART_DLV_COUNT */
	public List l_uptOdr_PART_DLV_COUNT = null;

	/** �� 189 List�ϐ��F l_uptOdr_IN_ODRNO */
	public List l_uptOdr_IN_ODRNO = null;

	/** �� 190 List�ϐ��F l_mItem_ITEM_CD */
	public List l_mItem_ITEM_CD = null;

	/** �� 191 List�ϐ��F l_mItem_ITEM_NAME */
	public List l_mItem_ITEM_NAME = null;

	/** �� 192 List�ϐ��F l_mItem_PRODUCT_TYP */
	public List l_mItem_PRODUCT_TYP = null;

	/** �� 193 List�ϐ��F l_mItem_MRP_ODR_TYP */
	public List l_mItem_MRP_ODR_TYP = null;

	/** �� 194 List�ϐ��F l_mItem_DRAW_CD */
	public List l_mItem_DRAW_CD = null;

	/** �� 195 List�ϐ��F l_mItem_SPEC */
	public List l_mItem_SPEC = null;

	/** �� 196 List�ϐ��F l_mItem_HIGH_LEVEL_NO */
	public List l_mItem_HIGH_LEVEL_NO = null;

	/** �� 197 List�ϐ��F l_mItem_OUTSIDE_TYP */
	public List l_mItem_OUTSIDE_TYP = null;

	/** �� 198 List�ϐ��F l_mItem_STOCK_UNIT_FLG */
	public List l_mItem_STOCK_UNIT_FLG = null;

	/** �� 199 List�ϐ��F l_mItem_STOCK_UNIT */
	public List l_mItem_STOCK_UNIT = null;

	/** �� 200 List�ϐ��F l_mItem_PKG_UNIT */
	public List l_mItem_PKG_UNIT = null;

	/** �� 201 List�ϐ��F l_mItem_PKG_UNIT_QTY */
	public List l_mItem_PKG_UNIT_QTY = null;

	/** �� 202 List�ϐ��F l_mItem_UNIT_QTY_TYP */
	public List l_mItem_UNIT_QTY_TYP = null;

	/** �� 203 List�ϐ��F l_mItem_ODR_LT */
	public List l_mItem_ODR_LT = null;

	/** �� 204 List�ϐ��F l_mItem_FIXED_LT */
	public List l_mItem_FIXED_LT = null;

	/** �� 205 List�ϐ��F l_mItem_PROP_LT */
	public List l_mItem_PROP_LT = null;

	/** �� 206 List�ϐ��F l_mItem_SAFETY_LT */
	public List l_mItem_SAFETY_LT = null;

	/** �� 207 List�ϐ��F l_mItem_ISSUE_LT */
	public List l_mItem_ISSUE_LT = null;

	/** �� 208 List�ϐ��F l_mItem_PROP_LOT_SIZE */
	public List l_mItem_PROP_LOT_SIZE = null;

	/** �� 209 List�ϐ��F l_mItem_ITEM_SPOIL */
	public List l_mItem_ITEM_SPOIL = null;

	/** �� 210 List�ϐ��F l_mItem_SAFETY_STOCK */
	public List l_mItem_SAFETY_STOCK = null;

	/** �� 211 List�ϐ��F l_mItem_LOT_SIZING_TYP */
	public List l_mItem_LOT_SIZING_TYP = null;

	/** �� 212 List�ϐ��F l_mItem_MAX_PERIOD */
	public List l_mItem_MAX_PERIOD = null;

	/** �� 213 List�ϐ��F l_mItem_MAX_ODR_QTY */
	public List l_mItem_MAX_ODR_QTY = null;

	/** �� 214 List�ϐ��F l_mItem_ODR_POINT */
	public List l_mItem_ODR_POINT = null;

	/** �� 215 List�ϐ��F l_mItem_FIXED_ODR_QTY */
	public List l_mItem_FIXED_ODR_QTY = null;

	/** �� 216 List�ϐ��F l_mItem_MIN_ODR_QTY */
	public List l_mItem_MIN_ODR_QTY = null;

	/** �� 217 List�ϐ��F l_mItem_MUL_ODR_QTY */
	public List l_mItem_MUL_ODR_QTY = null;

	/** �� 218 List�ϐ��F l_mItem_ISSUE_TYP */
	public List l_mItem_ISSUE_TYP = null;

	/** �� 219 List�ϐ��F l_mItem_MPS_FLG */
	public List l_mItem_MPS_FLG = null;

	/** �� 220 List�ϐ��F l_mItem_ACPT_INSPC_TYP */
	public List l_mItem_ACPT_INSPC_TYP = null;

	/** �� 221 List�ϐ��F l_mItem_CLASIFICATION_CD */
	public List l_mItem_CLASIFICATION_CD = null;

	/** �� 222 List�ϐ��F l_mItem_UNIT_WEIGHT */
	public List l_mItem_UNIT_WEIGHT = null;

	/** �� 223 List�ϐ��F l_mItem_ABC_TYP */
	public List l_mItem_ABC_TYP = null;

	/** �� 224 List�ϐ��F l_mItem_OPR_RSLT_TYP */
	public List l_mItem_OPR_RSLT_TYP = null;

	/** �� 225 List�ϐ��F l_mItem_SPL_ITEM_TYP */
	public List l_mItem_SPL_ITEM_TYP = null;

	/** �� 226 List�ϐ��F l_mItem_TAX_CD */
	public List l_mItem_TAX_CD = null;

	/** �� 227 List�ϐ��F l_mItem_IN_ITEMCD */
	public List l_mItem_IN_ITEMCD = null;

	/** �� 228 List�ϐ��F l_tOdrCtl_ODR_CTL_NO */
	public List l_tOdrCtl_ODR_CTL_NO = null;

	/** �� 229 List�ϐ��F l_tOdrCtl_CUST_ITEM_NAME */
	public List l_tOdrCtl_CUST_ITEM_NAME = null;

	/** �� 230 List�ϐ��F l_tOdrCtl_ITEM_NAME */
	public List l_tOdrCtl_ITEM_NAME = null;

	/** �� 231 List�ϐ��F l_tOdrCtl_IN_ODRCTLNO */
	public List l_tOdrCtl_IN_ODRCTLNO = null;

	/** �� 232 List�ϐ��F l_in_tShipSlip_SLIP_CD */
	public List l_in_tShipSlip_SLIP_CD = null;

	/** �� 233 List�ϐ��F l_in_tShipSlip_ITEM_CD */
	public List l_in_tShipSlip_ITEM_CD = null;

	/** �� 234 List�ϐ��F l_in_tShipSlip_CUST_ITEM_CD */
	public List l_in_tShipSlip_CUST_ITEM_CD = null;

	/** �� 235 List�ϐ��F l_in_tShipSlip_PART_NAME */
	public List l_in_tShipSlip_PART_NAME = null;

	/** �� 236 List�ϐ��F l_in_tShipSlip_CUST_ODR_NO */
	public List l_in_tShipSlip_CUST_ODR_NO = null;

	/** �� 237 List�ϐ��F l_in_tShipSlip_CUST_CD */
	public List l_in_tShipSlip_CUST_CD = null;

	/** �� 238 List�ϐ��F l_in_tShipSlip_CUST_NAME */
	public List l_in_tShipSlip_CUST_NAME = null;

	/** �� 239 List�ϐ��F l_in_tShipSlip_DLV_LOC_CD */
	public List l_in_tShipSlip_DLV_LOC_CD = null;

	/** �� 240 List�ϐ��F l_in_tShipSlip_DLV_LOC_NAME_KANJI */
	public List l_in_tShipSlip_DLV_LOC_NAME_KANJI = null;

	/** �� 241 List�ϐ��F l_in_tShipSlip_CUS_DLV_KEY_CD */
	public List l_in_tShipSlip_CUS_DLV_KEY_CD = null;

	/** �� 242 List�ϐ��F l_in_tShipSlip_DESINATED_SHIP_DATE */
	public List l_in_tShipSlip_DESINATED_SHIP_DATE = null;

	/** �� 243 List�ϐ��F l_in_tShipSlip_DESINATED_DLV_DATE */
	public List l_in_tShipSlip_DESINATED_DLV_DATE = null;

	/** �� 244 List�ϐ��F l_in_tShipSlip_SCDL_DLV_DATE */
	public List l_in_tShipSlip_SCDL_DLV_DATE = null;

	/** �� 245 List�ϐ��F l_in_tShipSlip_SHIP_ODR_QTY */
	public List l_in_tShipSlip_SHIP_ODR_QTY = null;

	/** �� 246 List�ϐ��F l_in_tShipSlip_UNIT_CD */
	public List l_in_tShipSlip_UNIT_CD = null;

	/** �� 247 List�ϐ��F l_in_tShipSlip_UNIT_PRICE */
	public List l_in_tShipSlip_UNIT_PRICE = null;

	/** �� 248 List�ϐ��F l_in_tShipSlip_SHIP_ODR_AMOUNT */
	public List l_in_tShipSlip_SHIP_ODR_AMOUNT = null;

	/** �� 249 List�ϐ��F l_in_tShipSlip_TAX_AMOUNT */
	public List l_in_tShipSlip_TAX_AMOUNT = null;

	/** �� 250 List�ϐ��F l_in_tShipSlip_INSPC_TYP */
	public List l_in_tShipSlip_INSPC_TYP = null;

	/** �� 251 List�ϐ��F l_in_tShipSlip_CLIENT_REMARK_KANJI */
	public List l_in_tShipSlip_CLIENT_REMARK_KANJI = null;

	/** �� 252 List�ϐ��F l_in_tShipSlip_CLIENT_BARCODE_INF */
	public List l_in_tShipSlip_CLIENT_BARCODE_INF = null;

	/** �� 253 List�ϐ��F l_in_tShipSlip_PRINT_FLG */
	public List l_in_tShipSlip_PRINT_FLG = null;

	/** �� 254 List�ϐ��F l_in_tShipSlip_DEL_FLG */
	public List l_in_tShipSlip_DEL_FLG = null;

	/** �� 255 List�ϐ��F l_in_tShipSlip_BUYER_NAME */
	public List l_in_tShipSlip_BUYER_NAME = null;

	/** �� 256 List�ϐ��F l_in_tShipSlip_PUCH_ODR_QTY_TOTAL */
	public List l_in_tShipSlip_PUCH_ODR_QTY_TOTAL = null;

	/** �� 257 List�ϐ��F l_in_tShipSlip_DLV_ODR_QTY */
	public List l_in_tShipSlip_DLV_ODR_QTY = null;

	/** �� 258 List�ϐ��F l_in_tShipSlip_SHIP_ODR_AMOUNT_TAX */
	public List l_in_tShipSlip_SHIP_ODR_AMOUNT_TAX = null;

	/** �� 259 List�ϐ��F l_in_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT */
	public List l_in_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT = null;

	/** �� 260 List�ϐ��F l_in_tShipSlip_INTERNAL_TAX_SALES_AMOUNT */
	public List l_in_tShipSlip_INTERNAL_TAX_SALES_AMOUNT = null;

	/** �� 261 List�ϐ��F l_in_tShipSlip_TAXFREE_SALES_AMOUNT */
	public List l_in_tShipSlip_TAXFREE_SALES_AMOUNT = null;

	/** �� 262 List�ϐ��F l_in_tShipSlip_TAX_CREDIT_SALES_AMOUNT */
	public List l_in_tShipSlip_TAX_CREDIT_SALES_AMOUNT = null;

	/** �� 263 List�ϐ��F l_in_tShipSlip_EXTERNAL_TAX_AMOUNT */
	public List l_in_tShipSlip_EXTERNAL_TAX_AMOUNT = null;

	/** �� 264 List�ϐ��F l_in_tShipSlip_INTERNAL_TAX_AMOUNT */
	public List l_in_tShipSlip_INTERNAL_TAX_AMOUNT = null;

	/** �� 265 List�ϐ��F l_in_tShipSlip_TAX_AMOUNT_1 */
	public List l_in_tShipSlip_TAX_AMOUNT_1 = null;

	/** �� 266 List�ϐ��F l_in_tShipSlip_TAX_AMOUNT_2 */
	public List l_in_tShipSlip_TAX_AMOUNT_2 = null;

	/** �� 267 List�ϐ��F l_in_tShipSlip_TAX_AMOUNT_3 */
	public List l_in_tShipSlip_TAX_AMOUNT_3 = null;

	/** �� 268 List�ϐ��F l_in_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT */
	public List l_in_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;

	/** �� 269 List�ϐ��F l_del_tShipSlip_IN_SLIPCD */
	public List l_del_tShipSlip_IN_SLIPCD = null;

	/** �� 270 List�ϐ��F l_mCustBase_COMPANY_CD */
	public List l_mCustBase_COMPANY_CD = null;

	/** �� 271 List�ϐ��F l_mCustBase_CUST_CD */
	public List l_mCustBase_CUST_CD = null;

	/** �� 272 List�ϐ��F l_mCustBase_DLV_LOC_CD */
	public List l_mCustBase_DLV_LOC_CD = null;

	/** �� 273 List�ϐ��F l_mCustBase_DLV_LOC_NAME */
	public List l_mCustBase_DLV_LOC_NAME = null;

	/** �� 274 List�ϐ��F l_mCustBase_DLV_LOC_KNAME */
	public List l_mCustBase_DLV_LOC_KNAME = null;

	/** �� 275 List�ϐ��F l_mCustBase_DLV_LOC_ENAME */
	public List l_mCustBase_DLV_LOC_ENAME = null;

	/** �� 276 List�ϐ��F l_mCustBase_ZIP_CD */
	public List l_mCustBase_ZIP_CD = null;

	/** �� 277 List�ϐ��F l_mCustBase_ADDRESS_1 */
	public List l_mCustBase_ADDRESS_1 = null;

	/** �� 278 List�ϐ��F l_mCustBase_ADDRESS_2 */
	public List l_mCustBase_ADDRESS_2 = null;

	/** �� 279 List�ϐ��F l_mCustBase_ADDRESS_K_1 */
	public List l_mCustBase_ADDRESS_K_1 = null;

	/** �� 280 List�ϐ��F l_mCustBase_ADDRESS_K_2 */
	public List l_mCustBase_ADDRESS_K_2 = null;

	/** �� 281 List�ϐ��F l_mCustBase_TEL */
	public List l_mCustBase_TEL = null;

	/** �� 282 List�ϐ��F l_mCustBase_FAX */
	public List l_mCustBase_FAX = null;

	/** �� 283 List�ϐ��F l_mCustBase_SHIP_WH_CD */
	public List l_mCustBase_SHIP_WH_CD = null;

	/** �� 284 List�ϐ��F l_mCustBase_TRANSPORT_CD */
	public List l_mCustBase_TRANSPORT_CD = null;

	/** �� 285 List�ϐ��F l_mCustBase_TRANSPORT_NAME */
	public List l_mCustBase_TRANSPORT_NAME = null;

	/** �� 286 List�ϐ��F l_mCustBase_TRANSPORT_LT */
	public List l_mCustBase_TRANSPORT_LT = null;

	/** �� 287 List�ϐ��F l_mCustBase_CAL_NO */
	public List l_mCustBase_CAL_NO = null;

	/** �� 288 List�ϐ��F l_mCustBase_TRANSPORT_TYP */
	public List l_mCustBase_TRANSPORT_TYP = null;

	/** �� 289 List�ϐ��F l_mCustBase_DLV_START_TIME */
	public List l_mCustBase_DLV_START_TIME = null;

	/** �� 290 List�ϐ��F l_mCustBase_DLV_END_TIME */
	public List l_mCustBase_DLV_END_TIME = null;

	/** �� 291 List�ϐ��F l_mCustBase_AREA_CLASS_TYP1 */
	public List l_mCustBase_AREA_CLASS_TYP1 = null;

	/** �� 292 List�ϐ��F l_mCustBase_AREA_CLASS_1 */
	public List l_mCustBase_AREA_CLASS_1 = null;

	/** �� 293 List�ϐ��F l_mCustBase_AREA_CLASS_TYP2 */
	public List l_mCustBase_AREA_CLASS_TYP2 = null;

	/** �� 294 List�ϐ��F l_mCustBase_AREA_CLASS_2 */
	public List l_mCustBase_AREA_CLASS_2 = null;

	/** �� 295 List�ϐ��F l_mCustBase_AREA_CLASS_TYP3 */
	public List l_mCustBase_AREA_CLASS_TYP3 = null;

	/** �� 296 List�ϐ��F l_mCustBase_AREA_CLASS_3 */
	public List l_mCustBase_AREA_CLASS_3 = null;

	/** �� 297 List�ϐ��F l_mCustBase_REMARKS_1 */
	public List l_mCustBase_REMARKS_1 = null;

	/** �� 298 List�ϐ��F l_mCustBase_REMARKS_2 */
	public List l_mCustBase_REMARKS_2 = null;

	/** �� 299 List�ϐ��F l_mCustBase_REMARKS_3 */
	public List l_mCustBase_REMARKS_3 = null;

	/** �� 300 List�ϐ��F l_mCustBase_DEPO_WH_CD */
	public List l_mCustBase_DEPO_WH_CD = null;

	/** �� 301 List�ϐ��F l_mCustBase_IN_COMPANYCD */
	public List l_mCustBase_IN_COMPANYCD = null;

	/** �� 302 List�ϐ��F l_mCustBase_IN_CUSTCD */
	public List l_mCustBase_IN_CUSTCD = null;

	/** �� 303 List�ϐ��F l_mCustBase_IN_DLVLOCCD */
	public List l_mCustBase_IN_DLVLOCCD = null;

	/** �� 304 List�ϐ��F l_mCust_COMPANY_CD */
	public List l_mCust_COMPANY_CD = null;

	/** �� 305 List�ϐ��F l_mCust_CUST_CD */
	public List l_mCust_CUST_CD = null;

	/** �� 306 List�ϐ��F l_mCust_CUST_NAME */
	public List l_mCust_CUST_NAME = null;

	/** �� 307 List�ϐ��F l_mCust_CUST_KNAME */
	public List l_mCust_CUST_KNAME = null;

	/** �� 308 List�ϐ��F l_mCust_OWN_ORG_CD */
	public List l_mCust_OWN_ORG_CD = null;

	/** �� 309 List�ϐ��F l_mCust_OWN_PERSON_CD */
	public List l_mCust_OWN_PERSON_CD = null;

	/** �� 310 List�ϐ��F l_mCust_CUR_CD */
	public List l_mCust_CUR_CD = null;

	/** �� 311 List�ϐ��F l_mCust_EXCH_TYP */
	public List l_mCust_EXCH_TYP = null;

	/** �� 312 List�ϐ��F l_mCust_TAX_APPLY_TYP */
	public List l_mCust_TAX_APPLY_TYP = null;

	/** �� 313 List�ϐ��F l_mCust_TAX_CD */
	public List l_mCust_TAX_CD = null;

	/** �� 314 List�ϐ��F l_mCust_TAX_CALC_TYP */
	public List l_mCust_TAX_CALC_TYP = null;

	/** �� 315 List�ϐ��F l_mCust_PRICE_ROUND_TYP */
	public List l_mCust_PRICE_ROUND_TYP = null;

	/** �� 316 List�ϐ��F l_mCust_DETAIL_ROUND_TYP */
	public List l_mCust_DETAIL_ROUND_TYP = null;

	/** �� 317 List�ϐ��F l_mCust_UNCONFIRM_ODR_EFF_PRIOD */
	public List l_mCust_UNCONFIRM_ODR_EFF_PRIOD = null;

	/** �� 318 List�ϐ��F l_mCust_UNCONFIRM_ODR_EFF_TERM_FLG */
	public List l_mCust_UNCONFIRM_ODR_EFF_TERM_FLG = null;

	/** �� 319 List�ϐ��F l_mCust_EDI_CUST_VEND_CD */
	public List l_mCust_EDI_CUST_VEND_CD = null;

	/** �� 320 List�ϐ��F l_mCust_PARTIAL_SHIP_INST_FLG */
	public List l_mCust_PARTIAL_SHIP_INST_FLG = null;

	/** �� 321 List�ϐ��F l_mCust_DEPO_TYP */
	public List l_mCust_DEPO_TYP = null;

	/** �� 322 List�ϐ��F l_mCust_INSPC_ACPT_TYP */
	public List l_mCust_INSPC_ACPT_TYP = null;

	/** �� 323 List�ϐ��F l_mCust_IN_COMPANYCD */
	public List l_mCust_IN_COMPANYCD = null;

	/** �� 324 List�ϐ��F l_mCust_IN_CUSTCD */
	public List l_mCust_IN_CUSTCD = null;

	/** �� 325 List�ϐ��F l_tori_tAnsDlvDate_REST_SHIP_ODR_QTY */
	public List l_tori_tAnsDlvDate_REST_SHIP_ODR_QTY = null;

	/** �� 326 List�ϐ��F l_tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG */
	public List l_tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG = null;

	/** �� 327 List�ϐ��F l_tori_tAnsDlvDate_IN_ODRNO */
	public List l_tori_tAnsDlvDate_IN_ODRNO = null;

	/** �� 328 List�ϐ��F l_tori_tAnsDlvDate_IN_PARTDLVSEQNO */
	public List l_tori_tAnsDlvDate_IN_PARTDLVSEQNO = null;

	/** �� 329 List�ϐ��F l_chkisWhCd_WH_CD */
	public List l_chkisWhCd_WH_CD = null;

	/** �� 330 List�ϐ��F l_chkisWhCd_WH_TYP */
	public List l_chkisWhCd_WH_TYP = null;

	/** �� 331 List�ϐ��F l_chkisWhCd_ITEM_CD */
	public List l_chkisWhCd_ITEM_CD = null;

	/** �� 332 List�ϐ��F l_chkisWhCd_PBL_SHIP_QTY */
	public List l_chkisWhCd_PBL_SHIP_QTY = null;

	/** �� 333 List�ϐ��F l_chkisWhCd_IN_ITEMCD */
	public List l_chkisWhCd_IN_ITEMCD = null;

	/** �� 334 List�ϐ��F l_chkisWhCd_IN_WHCD */
	public List l_chkisWhCd_IN_WHCD = null;

	/** �� 335 List�ϐ��F l_mUnitCost_UNIT_COST */
	public List l_mUnitCost_UNIT_COST = null;

	/** �� 336 List�ϐ��F l_mUnitCost_EFF_PHASE_IN_DATE */
	public List l_mUnitCost_EFF_PHASE_IN_DATE = null;

	/** �� 337 List�ϐ��F l_mUnitCost_IN_COMPANYCD */
	public List l_mUnitCost_IN_COMPANYCD = null;

	/** �� 338 List�ϐ��F l_mUnitCost_IN_CUSTCD */
	public List l_mUnitCost_IN_CUSTCD = null;

	/** �� 339 List�ϐ��F l_mUnitCost_IN_ITEMCD */
	public List l_mUnitCost_IN_ITEMCD = null;

	/** �� 340 List�ϐ��F l_mUnitCost_IN_EFFPHASEINDATE */
	public List l_mUnitCost_IN_EFFPHASEINDATE = null;

	/** �� 341 List�ϐ��F l_mWhWH_CD */
	public List l_mWhWH_CD = null;

	/** �� 342 List�ϐ��F l_mWhWH_NAME */
	public List l_mWhWH_NAME = null;

	/** �� 343 List�ϐ��F l_strTaxTAX_KBN */
	public List l_strTaxTAX_KBN = null;

	/** �� 344 List�ϐ��F l_strTaxOLD_TAX_1 */
	public List l_strTaxOLD_TAX_1 = null;

	/** �� 345 List�ϐ��F l_strTaxOLD_TAX_2 */
	public List l_strTaxOLD_TAX_2 = null;

	/** �� 346 List�ϐ��F l_strTaxOLD_TAX_3 */
	public List l_strTaxOLD_TAX_3 = null;

	/** �� 347 List�ϐ��F l_strTaxNEW_TAX_1 */
	public List l_strTaxNEW_TAX_1 = null;

	/** �� 348 List�ϐ��F l_strTaxNEW_TAX_2 */
	public List l_strTaxNEW_TAX_2 = null;

	/** �� 349 List�ϐ��F l_strTaxNEW_TAX_3 */
	public List l_strTaxNEW_TAX_3 = null;

	/** �� 350 List�ϐ��F l_strTaxSTART_DATE */
	public List l_strTaxSTART_DATE = null;

	/** �� 351 List�ϐ��F l_strTaxROUND_TYP */
	public List l_strTaxROUND_TYP = null;

	/** �� 352 List�ϐ��F l_strTaxIN_COMPANYCD */
	public List l_strTaxIN_COMPANYCD = null;

	/** �� 353 List�ϐ��F l_strTaxIN_CUSTCD */
	public List l_strTaxIN_CUSTCD = null;

	/** �� 354 List�ϐ��F l_g_CUST_ITEM_CD */
	public List l_g_CUST_ITEM_CD = null;

	/** �� 355 List�ϐ��F l_strYotaku_WH_CD */
	public List l_strYotaku_WH_CD = null;

	/** �� 356 List�ϐ��F l_strYotaku_IN_WH_TYP */
	public List l_strYotaku_IN_WH_TYP = null;

	/** �� 357 List�ϐ��F l_strSYUKA_LT */
	public List l_strSYUKA_LT = null;

	/** �� 358 List�ϐ��F l_chkisinWhCd_WH_CD */
	public List l_chkisinWhCd_WH_CD = null;

	/** �� 359 List�ϐ��F l_chkisinWhCd_WH_TYP */
	public List l_chkisinWhCd_WH_TYP = null;

	/** �� 360 List�ϐ��F l_chkisinWhCd_WH_NAME */
	public List l_chkisinWhCd_WH_NAME = null;

	/** �� 361 List�ϐ��F l_chkis_IN_WHCD */
	public List l_chkis_IN_WHCD = null;

	/** �� 362 List�ϐ��F l_uptOdr_SHIP_CNT */
	public List l_uptOdr_SHIP_CNT = null;

	/** �� 363 List�ϐ��F l_tHOLIDAY_FLG */
	public List l_tHOLIDAY_FLG = null;

	/** �� 364 List�ϐ��F l_tWH_CD */
	public List l_tWH_CD = null;

	/** �� 365 List�ϐ��F l_tCAL_DATE */
	public List l_tCAL_DATE = null;

	/** �� 366 List�ϐ��F l_tDECIMAL_FIG */
	public List l_tDECIMAL_FIG = null;

	/** �� 367 List�ϐ��F l_tCUR_CD */
	public List l_tCUR_CD = null;

	/** �� 368 List�ϐ��F l_chkisWhCd_JOB_ODR_CD */
	public List l_chkisWhCd_JOB_ODR_CD = null;

	/** �� 369 List�ϐ��F l_serTJobOdr_JOB_ODR_CD */
	public List l_serTJobOdr_JOB_ODR_CD = null;

	/** �� 370 List�ϐ��F l_serTJobOdr_ITEM_CD */
	public List l_serTJobOdr_ITEM_CD = null;

	/** �� 371 List�ϐ��F l_tUnShipList_ACPT_ODR_CD */
	public List l_tUnShipList_ACPT_ODR_CD = null;

	/** �� 372 List�ϐ��F l_tUnShipList_PART_DLV_SEQ_NO */
	public List l_tUnShipList_PART_DLV_SEQ_NO = null;

	/** �� 373 List�ϐ��F l_strTAX_CD */
	public List l_strTAX_CD = null;

	/** �� 374 List�ϐ��F l_selMODIFY_COUNT */
	public List l_selMODIFY_COUNT = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getg_PART_DLV_SEQ_NO() { return m_g_PART_DLV_SEQ_NO; }
	public String getg_DIRECT_DLV_FLG() { return m_g_DIRECT_DLV_FLG; }
	public String getg_REST_SHIP_ODR_QTY() { return m_g_REST_SHIP_ODR_QTY; }
	public String getg_CUST_ANAME() { return m_g_CUST_ANAME; }
	public String getg_ITEM_CD() { return m_g_ITEM_CD; }
	public String getk_MODE() { return m_k_MODE; }
	public String geth_RESULT() { return m_h_RESULT; }
	public String geth_REST_SHIP_ODR_QTY() { return m_h_REST_SHIP_ODR_QTY; }
	public String geth_CUST_ANAME() { return m_h_CUST_ANAME; }
	public String geth_CUST_ITEM_CD() { return m_h_CUST_ITEM_CD; }
	public String geth_ITEM_CD() { return m_h_ITEM_CD; }
	public String geth_AP_SECRTY_TYP() { return m_h_AP_SECRTY_TYP; }
	public String geth_MODIFY_CNT() { return m_h_MODIFY_CNT; }
	public String getr_SEL_PTN1() { return m_r_SEL_PTN1; }
	public String getr_SEL_PTN2() { return m_r_SEL_PTN2; }
	public String getg_ODR_NO() { return m_g_ODR_NO; }
	public String getg_SLIP_CD() { return m_g_SLIP_CD; }
	public String getg_DESINATED_SHIP_DATE() { return m_g_DESINATED_SHIP_DATE; }
	public String getg_REST_SHIP_ODR_QTY2() { return m_g_REST_SHIP_ODR_QTY2; }
	public String getg_WH_CD() { return m_g_WH_CD; }
	public String geth_PARTIAL_SHIP_INST_FLG() { return m_h_PARTIAL_SHIP_INST_FLG; }
	public String getg_STOCK_UNIT() { return m_g_STOCK_UNIT; }
	public String getg_STOCK_UNIT2() { return m_g_STOCK_UNIT2; }
	public String getg_WH_NAME() { return m_g_WH_NAME; }
	public String getg_CUST_CD() { return m_g_CUST_CD; }
	public String getg_CUST_ITEM_NAME() { return m_g_CUST_ITEM_NAME; }
	public String getg_ITEM_NAME() { return m_g_ITEM_NAME; }
	public String getg_CUST_ODR_NO() { return m_g_CUST_ODR_NO; }
	public String getc_JOB_ODR_CD() { return m_c_JOB_ODR_CD; }
	public String geth_MRP_ODR_TYP() { return m_h_MRP_ODR_TYP; }
	public String geth_JOB_ODR_CD() { return m_h_JOB_ODR_CD; }
	public String gettMRP_ODR_TYP() { return m_tMRP_ODR_TYP; }
	public String getchkisWhCd_IN_JOBODRCD() { return m_chkisWhCd_IN_JOBODRCD; }
	public String getstrCOMPANY_CD() { return m_strCOMPANY_CD; }
	public String getstrUSER_NAME() { return m_strUSER_NAME; }
	public String getstrPLANT_CD() { return m_strPLANT_CD; }
	public String getstrSECTION_CD() { return m_strSECTION_CD; }
	public String getstrPLANT_NAME() { return m_strPLANT_NAME; }
	public String getstrPLANT_ANAME() { return m_strPLANT_ANAME; }
	public Double getstrCAL_NO() { return m_strCAL_NO; }
	public String getstrUSER_CD() { return m_strUSER_CD; }
	public String getstrBUSINESS_OPR_DATE() { return m_strBUSINESS_OPR_DATE; }
	public Double getstrMAX_DISPLAY_ROWNUM() { return m_strMAX_DISPLAY_ROWNUM; }
	public String gettAnsDlvDate_ODR_NO() { return m_tAnsDlvDate_ODR_NO; }
	public String gettAnsDlvDate_PART_DLV_SEQ_NO() { return m_tAnsDlvDate_PART_DLV_SEQ_NO; }
	public String gettAnsDlvDate_DESINATED_SHIP_DATE() { return m_tAnsDlvDate_DESINATED_SHIP_DATE; }
	public String gettOdrODR_CTL_NO() { return m_tOdrODR_CTL_NO; }
	public String gettOdrCtl_CUST_ITEM_CD() { return m_tOdrCtl_CUST_ITEM_CD; }
	public String gettOdrCtl_ITEM_CD() { return m_tOdrCtl_ITEM_CD; }
	public String getmCust_CUST_ANAME() { return m_mCust_CUST_ANAME; }
	public String gettAnsDlvDate_REST_SHIP_ODR_QTY() { return m_tAnsDlvDate_REST_SHIP_ODR_QTY; }
	public String gettOdr_TRANSPORT_TYP() { return m_tOdr_TRANSPORT_TYP; }
	public String gettOdr_ODR_UNIT_PRICE() { return m_tOdr_ODR_UNIT_PRICE; }
	public String gettOdr_SPCL_PRICE_TYP() { return m_tOdr_SPCL_PRICE_TYP; }
	public String gettOdrCtl_CUST_CD() { return m_tOdrCtl_CUST_CD; }
	public String gettOdr_PARTIAL_SHIP_INST_FLG() { return m_tOdr_PARTIAL_SHIP_INST_FLG; }
	public String gettAnsDlvDate_MODIFY_COUNT() { return m_tAnsDlvDate_MODIFY_COUNT; }
	public String gettITEM_NAME() { return m_tITEM_NAME; }
	public String gettSTOCK_UNIT() { return m_tSTOCK_UNIT; }
	public String gettUNIT_QTY_TYP() { return m_tUNIT_QTY_TYP; }
	public String gettWH_NAME() { return m_tWH_NAME; }
	public String gettSHIP_WH_CD() { return m_tSHIP_WH_CD; }
	public String gettCUST_CD() { return m_tCUST_CD; }
	public String gettCUST_ITEM_NAME() { return m_tCUST_ITEM_NAME; }
	public String gettCUST_ODR_NO() { return m_tCUST_ODR_NO; }
	public String getg_JOB_ODR_CD() { return m_g_JOB_ODR_CD; }
	public String getsysMyCompany_IN_COMPANYCD() { return m_sysMyCompany_IN_COMPANYCD; }
	public String gettAnsDlvDate_IN_ODRNO() { return m_tAnsDlvDate_IN_ODRNO; }
	public String gettAnsDlvDate_IN_PARTDLVSEQNO() { return m_tAnsDlvDate_IN_PARTDLVSEQNO; }
	public String getup_tAnsDlvDate_DESINATED_SHIP_DATE() { return m_up_tAnsDlvDate_DESINATED_SHIP_DATE; }
	public String getup_tAnsDlvDate_REST_SHIP_ODR_QTY() { return m_up_tAnsDlvDate_REST_SHIP_ODR_QTY; }
	public String getup_tAnsDlvDate_SHIP_ODR_CMPLT_FLG() { return m_up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG; }
	public String getup_tAnsDlvDate_IN_ODRNO() { return m_up_tAnsDlvDate_IN_ODRNO; }
	public String getup_tAnsDlvDate_IN_PARTDLVSEQNO() { return m_up_tAnsDlvDate_IN_PARTDLVSEQNO; }
	public String gettShipOdr_ODR_NO() { return m_tShipOdr_ODR_NO; }
	public String gettShipOdr_PART_DLV_SEQ_NO() { return m_tShipOdr_PART_DLV_SEQ_NO; }
	public String gettShipOdr_SLIP_CD() { return m_tShipOdr_SLIP_CD; }
	public String gettShipOdr_DESINATED_SHIP_DATE() { return m_tShipOdr_DESINATED_SHIP_DATE; }
	public String gettShipOdr_SHIP_QTY() { return m_tShipOdr_SHIP_QTY; }
	public String gettShipOdr_ALLCT_WH_CD() { return m_tShipOdr_ALLCT_WH_CD; }
	public String gettShipOdr_CUST_NAME() { return m_tShipOdr_CUST_NAME; }
	public String gettShipOdr_CUST_ITEM_CD() { return m_tShipOdr_CUST_ITEM_CD; }
	public String gettShipOdr_ITEM_CD() { return m_tShipOdr_ITEM_CD; }
	public String gettShipOdr_JOB_ODR_CD() { return m_tShipOdr_JOB_ODR_CD; }
	public String gettShipOdrAnsDlvDate_REST_SHIP_ODR_QTY() { return m_tShipOdrAnsDlvDate_REST_SHIP_ODR_QTY; }
	public String gettShipOdr_DEL_FLG() { return m_tShipOdr_DEL_FLG; }
	public String gettShipOdr_DIRECT_DLV_FLG() { return m_tShipOdr_DIRECT_DLV_FLG; }
	public String gettShipOdr_TRANSPORT_TYP() { return m_tShipOdr_TRANSPORT_TYP; }
	public String gettShipOdr_MODIFY_COUNT() { return m_tShipOdr_MODIFY_COUNT; }
	public String gettDEPO_TRANSFER_PROC_FLG() { return m_tDEPO_TRANSFER_PROC_FLG; }
	public String gettShipOdr_IN_SLIPCD() { return m_tShipOdr_IN_SLIPCD; }
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
	public String gettOdr_TAX_APPLY_TYP() { return m_tOdr_TAX_APPLY_TYP; }
	public String gettOdr_TAX_CD() { return m_tOdr_TAX_CD; }
	public String gettOdr_TAX_CALC_TYP() { return m_tOdr_TAX_CALC_TYP; }
	public String gettOdr_REMARKS() { return m_tOdr_REMARKS; }
	public String gettOdr_ODR_ACPT_DATE() { return m_tOdr_ODR_ACPT_DATE; }
	public String gettOdr_SHIP_PLAN_REMAIN_QTY() { return m_tOdr_SHIP_PLAN_REMAIN_QTY; }
	public String gettOdr_SHIP_PLAN_CMPLT_FLG() { return m_tOdr_SHIP_PLAN_CMPLT_FLG; }
	public String gettOdr_UNCONFIRMED_ODR_EFF_OVR_FLG() { return m_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG; }
	public String gettOdr_IF_CTL_NO() { return m_tOdr_IF_CTL_NO; }
	public String gettOdr_ENTRY_TYP() { return m_tOdr_ENTRY_TYP; }
	public String gettOdr_BUYER_NAME() { return m_tOdr_BUYER_NAME; }
	public String gettOdr_PUCH_ODR_QTY_TOTAL() { return m_tOdr_PUCH_ODR_QTY_TOTAL; }
	public String gettOdr_UNIT_CD_ORG() { return m_tOdr_UNIT_CD_ORG; }
	public String gettOdr_SHIP_CNT() { return m_tOdr_SHIP_CNT; }
	public String gettOdr_CUR_CD() { return m_tOdr_CUR_CD; }
	public String gettOdr_EXCH_TYP_R() { return m_tOdr_EXCH_TYP_R; }
	public String gettOdr_IN_ODRNO() { return m_tOdr_IN_ODRNO; }
	public String getuptOdr_PART_DLV_COUNT() { return m_uptOdr_PART_DLV_COUNT; }
	public String getuptOdr_IN_ODRNO() { return m_uptOdr_IN_ODRNO; }
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
	public String gettOdrCtl_ODR_CTL_NO() { return m_tOdrCtl_ODR_CTL_NO; }
	public String gettOdrCtl_CUST_ITEM_NAME() { return m_tOdrCtl_CUST_ITEM_NAME; }
	public String gettOdrCtl_ITEM_NAME() { return m_tOdrCtl_ITEM_NAME; }
	public String gettOdrCtl_IN_ODRCTLNO() { return m_tOdrCtl_IN_ODRCTLNO; }
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
	public String gettori_tAnsDlvDate_REST_SHIP_ODR_QTY() { return m_tori_tAnsDlvDate_REST_SHIP_ODR_QTY; }
	public String gettori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG() { return m_tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG; }
	public String gettori_tAnsDlvDate_IN_ODRNO() { return m_tori_tAnsDlvDate_IN_ODRNO; }
	public String gettori_tAnsDlvDate_IN_PARTDLVSEQNO() { return m_tori_tAnsDlvDate_IN_PARTDLVSEQNO; }
	public String getchkisWhCd_WH_CD() { return m_chkisWhCd_WH_CD; }
	public String getchkisWhCd_WH_TYP() { return m_chkisWhCd_WH_TYP; }
	public String getchkisWhCd_ITEM_CD() { return m_chkisWhCd_ITEM_CD; }
	public String getchkisWhCd_PBL_SHIP_QTY() { return m_chkisWhCd_PBL_SHIP_QTY; }
	public String getchkisWhCd_IN_ITEMCD() { return m_chkisWhCd_IN_ITEMCD; }
	public String getchkisWhCd_IN_WHCD() { return m_chkisWhCd_IN_WHCD; }
	public String getmUnitCost_UNIT_COST() { return m_mUnitCost_UNIT_COST; }
	public String getmUnitCost_EFF_PHASE_IN_DATE() { return m_mUnitCost_EFF_PHASE_IN_DATE; }
	public String getmUnitCost_IN_COMPANYCD() { return m_mUnitCost_IN_COMPANYCD; }
	public String getmUnitCost_IN_CUSTCD() { return m_mUnitCost_IN_CUSTCD; }
	public String getmUnitCost_IN_ITEMCD() { return m_mUnitCost_IN_ITEMCD; }
	public String getmUnitCost_IN_EFFPHASEINDATE() { return m_mUnitCost_IN_EFFPHASEINDATE; }
	public String getmWhWH_CD() { return m_mWhWH_CD; }
	public String getmWhWH_NAME() { return m_mWhWH_NAME; }
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
	public String getg_CUST_ITEM_CD() { return m_g_CUST_ITEM_CD; }
	public String getstrYotaku_WH_CD() { return m_strYotaku_WH_CD; }
	public String getstrYotaku_IN_WH_TYP() { return m_strYotaku_IN_WH_TYP; }
	public String getstrSYUKA_LT() { return m_strSYUKA_LT; }
	public String getchkisinWhCd_WH_CD() { return m_chkisinWhCd_WH_CD; }
	public String getchkisinWhCd_WH_TYP() { return m_chkisinWhCd_WH_TYP; }
	public String getchkisinWhCd_WH_NAME() { return m_chkisinWhCd_WH_NAME; }
	public String getchkis_IN_WHCD() { return m_chkis_IN_WHCD; }
	public String getuptOdr_SHIP_CNT() { return m_uptOdr_SHIP_CNT; }
	public String gettHOLIDAY_FLG() { return m_tHOLIDAY_FLG; }
	public String gettWH_CD() { return m_tWH_CD; }
	public String gettCAL_DATE() { return m_tCAL_DATE; }
	public String gettDECIMAL_FIG() { return m_tDECIMAL_FIG; }
	public String gettCUR_CD() { return m_tCUR_CD; }
	public String getchkisWhCd_JOB_ODR_CD() { return m_chkisWhCd_JOB_ODR_CD; }
	public String getserTJobOdr_JOB_ODR_CD() { return m_serTJobOdr_JOB_ODR_CD; }
	public String getserTJobOdr_ITEM_CD() { return m_serTJobOdr_ITEM_CD; }
	public String gettUnShipList_ACPT_ODR_CD() { return m_tUnShipList_ACPT_ODR_CD; }
	public String gettUnShipList_PART_DLV_SEQ_NO() { return m_tUnShipList_PART_DLV_SEQ_NO; }
	public String getstrTAX_CD() { return m_strTAX_CD; }
	public String getselMODIFY_COUNT() { return m_selMODIFY_COUNT; }

	public List getList_g_PART_DLV_SEQ_NO() { return l_g_PART_DLV_SEQ_NO; }
	public List getList_g_DIRECT_DLV_FLG() { return l_g_DIRECT_DLV_FLG; }
	public List getList_g_REST_SHIP_ODR_QTY() { return l_g_REST_SHIP_ODR_QTY; }
	public List getList_g_CUST_ANAME() { return l_g_CUST_ANAME; }
	public List getList_g_ITEM_CD() { return l_g_ITEM_CD; }
	public List getList_k_MODE() { return l_k_MODE; }
	public List getList_h_RESULT() { return l_h_RESULT; }
	public List getList_h_REST_SHIP_ODR_QTY() { return l_h_REST_SHIP_ODR_QTY; }
	public List getList_h_CUST_ANAME() { return l_h_CUST_ANAME; }
	public List getList_h_CUST_ITEM_CD() { return l_h_CUST_ITEM_CD; }
	public List getList_h_ITEM_CD() { return l_h_ITEM_CD; }
	public List getList_h_AP_SECRTY_TYP() { return l_h_AP_SECRTY_TYP; }
	public List getList_h_MODIFY_CNT() { return l_h_MODIFY_CNT; }
	public List getList_r_SEL_PTN1() { return l_r_SEL_PTN1; }
	public List getList_r_SEL_PTN2() { return l_r_SEL_PTN2; }
	public List getList_g_ODR_NO() { return l_g_ODR_NO; }
	public List getList_g_SLIP_CD() { return l_g_SLIP_CD; }
	public List getList_g_DESINATED_SHIP_DATE() { return l_g_DESINATED_SHIP_DATE; }
	public List getList_g_REST_SHIP_ODR_QTY2() { return l_g_REST_SHIP_ODR_QTY2; }
	public List getList_g_WH_CD() { return l_g_WH_CD; }
	public List getList_h_PARTIAL_SHIP_INST_FLG() { return l_h_PARTIAL_SHIP_INST_FLG; }
	public List getList_g_STOCK_UNIT() { return l_g_STOCK_UNIT; }
	public List getList_g_STOCK_UNIT2() { return l_g_STOCK_UNIT2; }
	public List getList_g_WH_NAME() { return l_g_WH_NAME; }
	public List getList_g_CUST_CD() { return l_g_CUST_CD; }
	public List getList_g_CUST_ITEM_NAME() { return l_g_CUST_ITEM_NAME; }
	public List getList_g_ITEM_NAME() { return l_g_ITEM_NAME; }
	public List getList_g_CUST_ODR_NO() { return l_g_CUST_ODR_NO; }
	public List getList_c_JOB_ODR_CD() { return l_c_JOB_ODR_CD; }
	public List getList_h_MRP_ODR_TYP() { return l_h_MRP_ODR_TYP; }
	public List getList_h_JOB_ODR_CD() { return l_h_JOB_ODR_CD; }
	public List getList_tMRP_ODR_TYP() { return l_tMRP_ODR_TYP; }
	public List getList_chkisWhCd_IN_JOBODRCD() { return l_chkisWhCd_IN_JOBODRCD; }
	public List getList_strCOMPANY_CD() { return l_strCOMPANY_CD; }
	public List getList_strUSER_NAME() { return l_strUSER_NAME; }
	public List getList_strPLANT_CD() { return l_strPLANT_CD; }
	public List getList_strSECTION_CD() { return l_strSECTION_CD; }
	public List getList_strPLANT_NAME() { return l_strPLANT_NAME; }
	public List getList_strPLANT_ANAME() { return l_strPLANT_ANAME; }
	public List getList_strCAL_NO() { return l_strCAL_NO; }
	public List getList_strUSER_CD() { return l_strUSER_CD; }
	public List getList_strBUSINESS_OPR_DATE() { return l_strBUSINESS_OPR_DATE; }
	public List getList_strMAX_DISPLAY_ROWNUM() { return l_strMAX_DISPLAY_ROWNUM; }
	public List getList_tAnsDlvDate_ODR_NO() { return l_tAnsDlvDate_ODR_NO; }
	public List getList_tAnsDlvDate_PART_DLV_SEQ_NO() { return l_tAnsDlvDate_PART_DLV_SEQ_NO; }
	public List getList_tAnsDlvDate_DESINATED_SHIP_DATE() { return l_tAnsDlvDate_DESINATED_SHIP_DATE; }
	public List getList_tOdrODR_CTL_NO() { return l_tOdrODR_CTL_NO; }
	public List getList_tOdrCtl_CUST_ITEM_CD() { return l_tOdrCtl_CUST_ITEM_CD; }
	public List getList_tOdrCtl_ITEM_CD() { return l_tOdrCtl_ITEM_CD; }
	public List getList_mCust_CUST_ANAME() { return l_mCust_CUST_ANAME; }
	public List getList_tAnsDlvDate_REST_SHIP_ODR_QTY() { return l_tAnsDlvDate_REST_SHIP_ODR_QTY; }
	public List getList_tOdr_TRANSPORT_TYP() { return l_tOdr_TRANSPORT_TYP; }
	public List getList_tOdr_ODR_UNIT_PRICE() { return l_tOdr_ODR_UNIT_PRICE; }
	public List getList_tOdr_SPCL_PRICE_TYP() { return l_tOdr_SPCL_PRICE_TYP; }
	public List getList_tOdrCtl_CUST_CD() { return l_tOdrCtl_CUST_CD; }
	public List getList_tOdr_PARTIAL_SHIP_INST_FLG() { return l_tOdr_PARTIAL_SHIP_INST_FLG; }
	public List getList_tAnsDlvDate_MODIFY_COUNT() { return l_tAnsDlvDate_MODIFY_COUNT; }
	public List getList_tITEM_NAME() { return l_tITEM_NAME; }
	public List getList_tSTOCK_UNIT() { return l_tSTOCK_UNIT; }
	public List getList_tUNIT_QTY_TYP() { return l_tUNIT_QTY_TYP; }
	public List getList_tWH_NAME() { return l_tWH_NAME; }
	public List getList_tSHIP_WH_CD() { return l_tSHIP_WH_CD; }
	public List getList_tCUST_CD() { return l_tCUST_CD; }
	public List getList_tCUST_ITEM_NAME() { return l_tCUST_ITEM_NAME; }
	public List getList_tCUST_ODR_NO() { return l_tCUST_ODR_NO; }
	public List getList_g_JOB_ODR_CD() { return l_g_JOB_ODR_CD; }
	public List getList_sysMyCompany_IN_COMPANYCD() { return l_sysMyCompany_IN_COMPANYCD; }
	public List getList_tAnsDlvDate_IN_ODRNO() { return l_tAnsDlvDate_IN_ODRNO; }
	public List getList_tAnsDlvDate_IN_PARTDLVSEQNO() { return l_tAnsDlvDate_IN_PARTDLVSEQNO; }
	public List getList_up_tAnsDlvDate_DESINATED_SHIP_DATE() { return l_up_tAnsDlvDate_DESINATED_SHIP_DATE; }
	public List getList_up_tAnsDlvDate_REST_SHIP_ODR_QTY() { return l_up_tAnsDlvDate_REST_SHIP_ODR_QTY; }
	public List getList_up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG() { return l_up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG; }
	public List getList_up_tAnsDlvDate_IN_ODRNO() { return l_up_tAnsDlvDate_IN_ODRNO; }
	public List getList_up_tAnsDlvDate_IN_PARTDLVSEQNO() { return l_up_tAnsDlvDate_IN_PARTDLVSEQNO; }
	public List getList_tShipOdr_ODR_NO() { return l_tShipOdr_ODR_NO; }
	public List getList_tShipOdr_PART_DLV_SEQ_NO() { return l_tShipOdr_PART_DLV_SEQ_NO; }
	public List getList_tShipOdr_SLIP_CD() { return l_tShipOdr_SLIP_CD; }
	public List getList_tShipOdr_DESINATED_SHIP_DATE() { return l_tShipOdr_DESINATED_SHIP_DATE; }
	public List getList_tShipOdr_SHIP_QTY() { return l_tShipOdr_SHIP_QTY; }
	public List getList_tShipOdr_ALLCT_WH_CD() { return l_tShipOdr_ALLCT_WH_CD; }
	public List getList_tShipOdr_CUST_NAME() { return l_tShipOdr_CUST_NAME; }
	public List getList_tShipOdr_CUST_ITEM_CD() { return l_tShipOdr_CUST_ITEM_CD; }
	public List getList_tShipOdr_ITEM_CD() { return l_tShipOdr_ITEM_CD; }
	public List getList_tShipOdr_JOB_ODR_CD() { return l_tShipOdr_JOB_ODR_CD; }
	public List getList_tShipOdrAnsDlvDate_REST_SHIP_ODR_QTY() { return l_tShipOdrAnsDlvDate_REST_SHIP_ODR_QTY; }
	public List getList_tShipOdr_DEL_FLG() { return l_tShipOdr_DEL_FLG; }
	public List getList_tShipOdr_DIRECT_DLV_FLG() { return l_tShipOdr_DIRECT_DLV_FLG; }
	public List getList_tShipOdr_TRANSPORT_TYP() { return l_tShipOdr_TRANSPORT_TYP; }
	public List getList_tShipOdr_MODIFY_COUNT() { return l_tShipOdr_MODIFY_COUNT; }
	public List getList_tDEPO_TRANSFER_PROC_FLG() { return l_tDEPO_TRANSFER_PROC_FLG; }
	public List getList_tShipOdr_IN_SLIPCD() { return l_tShipOdr_IN_SLIPCD; }
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
	public List getList_tOdr_TAX_APPLY_TYP() { return l_tOdr_TAX_APPLY_TYP; }
	public List getList_tOdr_TAX_CD() { return l_tOdr_TAX_CD; }
	public List getList_tOdr_TAX_CALC_TYP() { return l_tOdr_TAX_CALC_TYP; }
	public List getList_tOdr_REMARKS() { return l_tOdr_REMARKS; }
	public List getList_tOdr_ODR_ACPT_DATE() { return l_tOdr_ODR_ACPT_DATE; }
	public List getList_tOdr_SHIP_PLAN_REMAIN_QTY() { return l_tOdr_SHIP_PLAN_REMAIN_QTY; }
	public List getList_tOdr_SHIP_PLAN_CMPLT_FLG() { return l_tOdr_SHIP_PLAN_CMPLT_FLG; }
	public List getList_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG() { return l_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG; }
	public List getList_tOdr_IF_CTL_NO() { return l_tOdr_IF_CTL_NO; }
	public List getList_tOdr_ENTRY_TYP() { return l_tOdr_ENTRY_TYP; }
	public List getList_tOdr_BUYER_NAME() { return l_tOdr_BUYER_NAME; }
	public List getList_tOdr_PUCH_ODR_QTY_TOTAL() { return l_tOdr_PUCH_ODR_QTY_TOTAL; }
	public List getList_tOdr_UNIT_CD_ORG() { return l_tOdr_UNIT_CD_ORG; }
	public List getList_tOdr_SHIP_CNT() { return l_tOdr_SHIP_CNT; }
	public List getList_tOdr_CUR_CD() { return l_tOdr_CUR_CD; }
	public List getList_tOdr_EXCH_TYP_R() { return l_tOdr_EXCH_TYP_R; }
	public List getList_tOdr_IN_ODRNO() { return l_tOdr_IN_ODRNO; }
	public List getList_uptOdr_PART_DLV_COUNT() { return l_uptOdr_PART_DLV_COUNT; }
	public List getList_uptOdr_IN_ODRNO() { return l_uptOdr_IN_ODRNO; }
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
	public List getList_tOdrCtl_ODR_CTL_NO() { return l_tOdrCtl_ODR_CTL_NO; }
	public List getList_tOdrCtl_CUST_ITEM_NAME() { return l_tOdrCtl_CUST_ITEM_NAME; }
	public List getList_tOdrCtl_ITEM_NAME() { return l_tOdrCtl_ITEM_NAME; }
	public List getList_tOdrCtl_IN_ODRCTLNO() { return l_tOdrCtl_IN_ODRCTLNO; }
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
	public List getList_tori_tAnsDlvDate_REST_SHIP_ODR_QTY() { return l_tori_tAnsDlvDate_REST_SHIP_ODR_QTY; }
	public List getList_tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG() { return l_tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG; }
	public List getList_tori_tAnsDlvDate_IN_ODRNO() { return l_tori_tAnsDlvDate_IN_ODRNO; }
	public List getList_tori_tAnsDlvDate_IN_PARTDLVSEQNO() { return l_tori_tAnsDlvDate_IN_PARTDLVSEQNO; }
	public List getList_chkisWhCd_WH_CD() { return l_chkisWhCd_WH_CD; }
	public List getList_chkisWhCd_WH_TYP() { return l_chkisWhCd_WH_TYP; }
	public List getList_chkisWhCd_ITEM_CD() { return l_chkisWhCd_ITEM_CD; }
	public List getList_chkisWhCd_PBL_SHIP_QTY() { return l_chkisWhCd_PBL_SHIP_QTY; }
	public List getList_chkisWhCd_IN_ITEMCD() { return l_chkisWhCd_IN_ITEMCD; }
	public List getList_chkisWhCd_IN_WHCD() { return l_chkisWhCd_IN_WHCD; }
	public List getList_mUnitCost_UNIT_COST() { return l_mUnitCost_UNIT_COST; }
	public List getList_mUnitCost_EFF_PHASE_IN_DATE() { return l_mUnitCost_EFF_PHASE_IN_DATE; }
	public List getList_mUnitCost_IN_COMPANYCD() { return l_mUnitCost_IN_COMPANYCD; }
	public List getList_mUnitCost_IN_CUSTCD() { return l_mUnitCost_IN_CUSTCD; }
	public List getList_mUnitCost_IN_ITEMCD() { return l_mUnitCost_IN_ITEMCD; }
	public List getList_mUnitCost_IN_EFFPHASEINDATE() { return l_mUnitCost_IN_EFFPHASEINDATE; }
	public List getList_mWhWH_CD() { return l_mWhWH_CD; }
	public List getList_mWhWH_NAME() { return l_mWhWH_NAME; }
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
	public List getList_g_CUST_ITEM_CD() { return l_g_CUST_ITEM_CD; }
	public List getList_strYotaku_WH_CD() { return l_strYotaku_WH_CD; }
	public List getList_strYotaku_IN_WH_TYP() { return l_strYotaku_IN_WH_TYP; }
	public List getList_strSYUKA_LT() { return l_strSYUKA_LT; }
	public List getList_chkisinWhCd_WH_CD() { return l_chkisinWhCd_WH_CD; }
	public List getList_chkisinWhCd_WH_TYP() { return l_chkisinWhCd_WH_TYP; }
	public List getList_chkisinWhCd_WH_NAME() { return l_chkisinWhCd_WH_NAME; }
	public List getList_chkis_IN_WHCD() { return l_chkis_IN_WHCD; }
	public List getList_uptOdr_SHIP_CNT() { return l_uptOdr_SHIP_CNT; }
	public List getList_tHOLIDAY_FLG() { return l_tHOLIDAY_FLG; }
	public List getList_tWH_CD() { return l_tWH_CD; }
	public List getList_tCAL_DATE() { return l_tCAL_DATE; }
	public List getList_tDECIMAL_FIG() { return l_tDECIMAL_FIG; }
	public List getList_tCUR_CD() { return l_tCUR_CD; }
	public List getList_chkisWhCd_JOB_ODR_CD() { return l_chkisWhCd_JOB_ODR_CD; }
	public List getList_serTJobOdr_JOB_ODR_CD() { return l_serTJobOdr_JOB_ODR_CD; }
	public List getList_serTJobOdr_ITEM_CD() { return l_serTJobOdr_ITEM_CD; }
	public List getList_tUnShipList_ACPT_ODR_CD() { return l_tUnShipList_ACPT_ODR_CD; }
	public List getList_tUnShipList_PART_DLV_SEQ_NO() { return l_tUnShipList_PART_DLV_SEQ_NO; }
	public List getList_strTAX_CD() { return l_strTAX_CD; }
	public List getList_selMODIFY_COUNT() { return l_selMODIFY_COUNT; }

	public void setg_PART_DLV_SEQ_NO(String val) { m_g_PART_DLV_SEQ_NO = val; }
	public void setg_DIRECT_DLV_FLG(String val) { m_g_DIRECT_DLV_FLG = val; }
	public void setg_REST_SHIP_ODR_QTY(String val) { m_g_REST_SHIP_ODR_QTY = val; }
	public void setg_CUST_ANAME(String val) { m_g_CUST_ANAME = val; }
	public void setg_ITEM_CD(String val) { m_g_ITEM_CD = val; }
	public void setk_MODE(String val) { m_k_MODE = val; }
	public void seth_RESULT(String val) { m_h_RESULT = val; }
	public void seth_REST_SHIP_ODR_QTY(String val) { m_h_REST_SHIP_ODR_QTY = val; }
	public void seth_CUST_ANAME(String val) { m_h_CUST_ANAME = val; }
	public void seth_CUST_ITEM_CD(String val) { m_h_CUST_ITEM_CD = val; }
	public void seth_ITEM_CD(String val) { m_h_ITEM_CD = val; }
	public void seth_AP_SECRTY_TYP(String val) { m_h_AP_SECRTY_TYP = val; }
	public void seth_MODIFY_CNT(String val) { m_h_MODIFY_CNT = val; }
	public void setr_SEL_PTN1(String val) { m_r_SEL_PTN1 = val; }
	public void setr_SEL_PTN2(String val) { m_r_SEL_PTN2 = val; }
	public void setg_ODR_NO(String val) { m_g_ODR_NO = val; }
	public void setg_SLIP_CD(String val) { m_g_SLIP_CD = val; }
	public void setg_DESINATED_SHIP_DATE(String val) { m_g_DESINATED_SHIP_DATE = val; }
	public void setg_REST_SHIP_ODR_QTY2(String val) { m_g_REST_SHIP_ODR_QTY2 = val; }
	public void setg_WH_CD(String val) { m_g_WH_CD = val; }
	public void seth_PARTIAL_SHIP_INST_FLG(String val) { m_h_PARTIAL_SHIP_INST_FLG = val; }
	public void setg_STOCK_UNIT(String val) { m_g_STOCK_UNIT = val; }
	public void setg_STOCK_UNIT2(String val) { m_g_STOCK_UNIT2 = val; }
	public void setg_WH_NAME(String val) { m_g_WH_NAME = val; }
	public void setg_CUST_CD(String val) { m_g_CUST_CD = val; }
	public void setg_CUST_ITEM_NAME(String val) { m_g_CUST_ITEM_NAME = val; }
	public void setg_ITEM_NAME(String val) { m_g_ITEM_NAME = val; }
	public void setg_CUST_ODR_NO(String val) { m_g_CUST_ODR_NO = val; }
	public void setc_JOB_ODR_CD(String val) { m_c_JOB_ODR_CD = val; }
	public void seth_MRP_ODR_TYP(String val) { m_h_MRP_ODR_TYP = val; }
	public void seth_JOB_ODR_CD(String val) { m_h_JOB_ODR_CD = val; }
	public void settMRP_ODR_TYP(String val) { m_tMRP_ODR_TYP = val; }
	public void setchkisWhCd_IN_JOBODRCD(String val) { m_chkisWhCd_IN_JOBODRCD = val; }
	public void setstrCOMPANY_CD(String val) { m_strCOMPANY_CD = val; }
	public void setstrUSER_NAME(String val) { m_strUSER_NAME = val; }
	public void setstrPLANT_CD(String val) { m_strPLANT_CD = val; }
	public void setstrSECTION_CD(String val) { m_strSECTION_CD = val; }
	public void setstrPLANT_NAME(String val) { m_strPLANT_NAME = val; }
	public void setstrPLANT_ANAME(String val) { m_strPLANT_ANAME = val; }
	public void setstrCAL_NO(Double val) { m_strCAL_NO = val; }
	public void setstrUSER_CD(String val) { m_strUSER_CD = val; }
	public void setstrBUSINESS_OPR_DATE(String val) { m_strBUSINESS_OPR_DATE = val; }
	public void setstrMAX_DISPLAY_ROWNUM(Double val) { m_strMAX_DISPLAY_ROWNUM = val; }
	public void settAnsDlvDate_ODR_NO(String val) { m_tAnsDlvDate_ODR_NO = val; }
	public void settAnsDlvDate_PART_DLV_SEQ_NO(String val) { m_tAnsDlvDate_PART_DLV_SEQ_NO = val; }
	public void settAnsDlvDate_DESINATED_SHIP_DATE(String val) { m_tAnsDlvDate_DESINATED_SHIP_DATE = val; }
	public void settOdrODR_CTL_NO(String val) { m_tOdrODR_CTL_NO = val; }
	public void settOdrCtl_CUST_ITEM_CD(String val) { m_tOdrCtl_CUST_ITEM_CD = val; }
	public void settOdrCtl_ITEM_CD(String val) { m_tOdrCtl_ITEM_CD = val; }
	public void setmCust_CUST_ANAME(String val) { m_mCust_CUST_ANAME = val; }
	public void settAnsDlvDate_REST_SHIP_ODR_QTY(String val) { m_tAnsDlvDate_REST_SHIP_ODR_QTY = val; }
	public void settOdr_TRANSPORT_TYP(String val) { m_tOdr_TRANSPORT_TYP = val; }
	public void settOdr_ODR_UNIT_PRICE(String val) { m_tOdr_ODR_UNIT_PRICE = val; }
	public void settOdr_SPCL_PRICE_TYP(String val) { m_tOdr_SPCL_PRICE_TYP = val; }
	public void settOdrCtl_CUST_CD(String val) { m_tOdrCtl_CUST_CD = val; }
	public void settOdr_PARTIAL_SHIP_INST_FLG(String val) { m_tOdr_PARTIAL_SHIP_INST_FLG = val; }
	public void settAnsDlvDate_MODIFY_COUNT(String val) { m_tAnsDlvDate_MODIFY_COUNT = val; }
	public void settITEM_NAME(String val) { m_tITEM_NAME = val; }
	public void settSTOCK_UNIT(String val) { m_tSTOCK_UNIT = val; }
	public void settUNIT_QTY_TYP(String val) { m_tUNIT_QTY_TYP = val; }
	public void settWH_NAME(String val) { m_tWH_NAME = val; }
	public void settSHIP_WH_CD(String val) { m_tSHIP_WH_CD = val; }
	public void settCUST_CD(String val) { m_tCUST_CD = val; }
	public void settCUST_ITEM_NAME(String val) { m_tCUST_ITEM_NAME = val; }
	public void settCUST_ODR_NO(String val) { m_tCUST_ODR_NO = val; }
	public void setg_JOB_ODR_CD(String val) { m_g_JOB_ODR_CD = val; }
	public void setsysMyCompany_IN_COMPANYCD(String val) { m_sysMyCompany_IN_COMPANYCD = val; }
	public void settAnsDlvDate_IN_ODRNO(String val) { m_tAnsDlvDate_IN_ODRNO = val; }
	public void settAnsDlvDate_IN_PARTDLVSEQNO(String val) { m_tAnsDlvDate_IN_PARTDLVSEQNO = val; }
	public void setup_tAnsDlvDate_DESINATED_SHIP_DATE(String val) { m_up_tAnsDlvDate_DESINATED_SHIP_DATE = val; }
	public void setup_tAnsDlvDate_REST_SHIP_ODR_QTY(String val) { m_up_tAnsDlvDate_REST_SHIP_ODR_QTY = val; }
	public void setup_tAnsDlvDate_SHIP_ODR_CMPLT_FLG(String val) { m_up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG = val; }
	public void setup_tAnsDlvDate_IN_ODRNO(String val) { m_up_tAnsDlvDate_IN_ODRNO = val; }
	public void setup_tAnsDlvDate_IN_PARTDLVSEQNO(String val) { m_up_tAnsDlvDate_IN_PARTDLVSEQNO = val; }
	public void settShipOdr_ODR_NO(String val) { m_tShipOdr_ODR_NO = val; }
	public void settShipOdr_PART_DLV_SEQ_NO(String val) { m_tShipOdr_PART_DLV_SEQ_NO = val; }
	public void settShipOdr_SLIP_CD(String val) { m_tShipOdr_SLIP_CD = val; }
	public void settShipOdr_DESINATED_SHIP_DATE(String val) { m_tShipOdr_DESINATED_SHIP_DATE = val; }
	public void settShipOdr_SHIP_QTY(String val) { m_tShipOdr_SHIP_QTY = val; }
	public void settShipOdr_ALLCT_WH_CD(String val) { m_tShipOdr_ALLCT_WH_CD = val; }
	public void settShipOdr_CUST_NAME(String val) { m_tShipOdr_CUST_NAME = val; }
	public void settShipOdr_CUST_ITEM_CD(String val) { m_tShipOdr_CUST_ITEM_CD = val; }
	public void settShipOdr_ITEM_CD(String val) { m_tShipOdr_ITEM_CD = val; }
	public void settShipOdr_JOB_ODR_CD(String val) { m_tShipOdr_JOB_ODR_CD = val; }
	public void settShipOdrAnsDlvDate_REST_SHIP_ODR_QTY(String val) { m_tShipOdrAnsDlvDate_REST_SHIP_ODR_QTY = val; }
	public void settShipOdr_DEL_FLG(String val) { m_tShipOdr_DEL_FLG = val; }
	public void settShipOdr_DIRECT_DLV_FLG(String val) { m_tShipOdr_DIRECT_DLV_FLG = val; }
	public void settShipOdr_TRANSPORT_TYP(String val) { m_tShipOdr_TRANSPORT_TYP = val; }
	public void settShipOdr_MODIFY_COUNT(String val) { m_tShipOdr_MODIFY_COUNT = val; }
	public void settDEPO_TRANSFER_PROC_FLG(String val) { m_tDEPO_TRANSFER_PROC_FLG = val; }
	public void settShipOdr_IN_SLIPCD(String val) { m_tShipOdr_IN_SLIPCD = val; }
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
	public void settOdr_TAX_APPLY_TYP(String val) { m_tOdr_TAX_APPLY_TYP = val; }
	public void settOdr_TAX_CD(String val) { m_tOdr_TAX_CD = val; }
	public void settOdr_TAX_CALC_TYP(String val) { m_tOdr_TAX_CALC_TYP = val; }
	public void settOdr_REMARKS(String val) { m_tOdr_REMARKS = val; }
	public void settOdr_ODR_ACPT_DATE(String val) { m_tOdr_ODR_ACPT_DATE = val; }
	public void settOdr_SHIP_PLAN_REMAIN_QTY(String val) { m_tOdr_SHIP_PLAN_REMAIN_QTY = val; }
	public void settOdr_SHIP_PLAN_CMPLT_FLG(String val) { m_tOdr_SHIP_PLAN_CMPLT_FLG = val; }
	public void settOdr_UNCONFIRMED_ODR_EFF_OVR_FLG(String val) { m_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG = val; }
	public void settOdr_IF_CTL_NO(String val) { m_tOdr_IF_CTL_NO = val; }
	public void settOdr_ENTRY_TYP(String val) { m_tOdr_ENTRY_TYP = val; }
	public void settOdr_BUYER_NAME(String val) { m_tOdr_BUYER_NAME = val; }
	public void settOdr_PUCH_ODR_QTY_TOTAL(String val) { m_tOdr_PUCH_ODR_QTY_TOTAL = val; }
	public void settOdr_UNIT_CD_ORG(String val) { m_tOdr_UNIT_CD_ORG = val; }
	public void settOdr_SHIP_CNT(String val) { m_tOdr_SHIP_CNT = val; }
	public void settOdr_CUR_CD(String val) { m_tOdr_CUR_CD = val; }
	public void settOdr_EXCH_TYP_R(String val) { m_tOdr_EXCH_TYP_R = val; }
	public void settOdr_IN_ODRNO(String val) { m_tOdr_IN_ODRNO = val; }
	public void setuptOdr_PART_DLV_COUNT(String val) { m_uptOdr_PART_DLV_COUNT = val; }
	public void setuptOdr_IN_ODRNO(String val) { m_uptOdr_IN_ODRNO = val; }
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
	public void settOdrCtl_ODR_CTL_NO(String val) { m_tOdrCtl_ODR_CTL_NO = val; }
	public void settOdrCtl_CUST_ITEM_NAME(String val) { m_tOdrCtl_CUST_ITEM_NAME = val; }
	public void settOdrCtl_ITEM_NAME(String val) { m_tOdrCtl_ITEM_NAME = val; }
	public void settOdrCtl_IN_ODRCTLNO(String val) { m_tOdrCtl_IN_ODRCTLNO = val; }
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
	public void settori_tAnsDlvDate_REST_SHIP_ODR_QTY(String val) { m_tori_tAnsDlvDate_REST_SHIP_ODR_QTY = val; }
	public void settori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG(String val) { m_tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG = val; }
	public void settori_tAnsDlvDate_IN_ODRNO(String val) { m_tori_tAnsDlvDate_IN_ODRNO = val; }
	public void settori_tAnsDlvDate_IN_PARTDLVSEQNO(String val) { m_tori_tAnsDlvDate_IN_PARTDLVSEQNO = val; }
	public void setchkisWhCd_WH_CD(String val) { m_chkisWhCd_WH_CD = val; }
	public void setchkisWhCd_WH_TYP(String val) { m_chkisWhCd_WH_TYP = val; }
	public void setchkisWhCd_ITEM_CD(String val) { m_chkisWhCd_ITEM_CD = val; }
	public void setchkisWhCd_PBL_SHIP_QTY(String val) { m_chkisWhCd_PBL_SHIP_QTY = val; }
	public void setchkisWhCd_IN_ITEMCD(String val) { m_chkisWhCd_IN_ITEMCD = val; }
	public void setchkisWhCd_IN_WHCD(String val) { m_chkisWhCd_IN_WHCD = val; }
	public void setmUnitCost_UNIT_COST(String val) { m_mUnitCost_UNIT_COST = val; }
	public void setmUnitCost_EFF_PHASE_IN_DATE(String val) { m_mUnitCost_EFF_PHASE_IN_DATE = val; }
	public void setmUnitCost_IN_COMPANYCD(String val) { m_mUnitCost_IN_COMPANYCD = val; }
	public void setmUnitCost_IN_CUSTCD(String val) { m_mUnitCost_IN_CUSTCD = val; }
	public void setmUnitCost_IN_ITEMCD(String val) { m_mUnitCost_IN_ITEMCD = val; }
	public void setmUnitCost_IN_EFFPHASEINDATE(String val) { m_mUnitCost_IN_EFFPHASEINDATE = val; }
	public void setmWhWH_CD(String val) { m_mWhWH_CD = val; }
	public void setmWhWH_NAME(String val) { m_mWhWH_NAME = val; }
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
	public void setg_CUST_ITEM_CD(String val) { m_g_CUST_ITEM_CD = val; }
	public void setstrYotaku_WH_CD(String val) { m_strYotaku_WH_CD = val; }
	public void setstrYotaku_IN_WH_TYP(String val) { m_strYotaku_IN_WH_TYP = val; }
	public void setstrSYUKA_LT(String val) { m_strSYUKA_LT = val; }
	public void setchkisinWhCd_WH_CD(String val) { m_chkisinWhCd_WH_CD = val; }
	public void setchkisinWhCd_WH_TYP(String val) { m_chkisinWhCd_WH_TYP = val; }
	public void setchkisinWhCd_WH_NAME(String val) { m_chkisinWhCd_WH_NAME = val; }
	public void setchkis_IN_WHCD(String val) { m_chkis_IN_WHCD = val; }
	public void setuptOdr_SHIP_CNT(String val) { m_uptOdr_SHIP_CNT = val; }
	public void settHOLIDAY_FLG(String val) { m_tHOLIDAY_FLG = val; }
	public void settWH_CD(String val) { m_tWH_CD = val; }
	public void settCAL_DATE(String val) { m_tCAL_DATE = val; }
	public void settDECIMAL_FIG(String val) { m_tDECIMAL_FIG = val; }
	public void settCUR_CD(String val) { m_tCUR_CD = val; }
	public void setchkisWhCd_JOB_ODR_CD(String val) { m_chkisWhCd_JOB_ODR_CD = val; }
	public void setserTJobOdr_JOB_ODR_CD(String val) { m_serTJobOdr_JOB_ODR_CD = val; }
	public void setserTJobOdr_ITEM_CD(String val) { m_serTJobOdr_ITEM_CD = val; }
	public void settUnShipList_ACPT_ODR_CD(String val) { m_tUnShipList_ACPT_ODR_CD = val; }
	public void settUnShipList_PART_DLV_SEQ_NO(String val) { m_tUnShipList_PART_DLV_SEQ_NO = val; }
	public void setstrTAX_CD(String val) { m_strTAX_CD = val; }
	public void setselMODIFY_COUNT(String val) { m_selMODIFY_COUNT = val; }


	public void setList_g_PART_DLV_SEQ_NO(List list) { l_g_PART_DLV_SEQ_NO = list; }
	public void setList_g_DIRECT_DLV_FLG(List list) { l_g_DIRECT_DLV_FLG = list; }
	public void setList_g_REST_SHIP_ODR_QTY(List list) { l_g_REST_SHIP_ODR_QTY = list; }
	public void setList_g_CUST_ANAME(List list) { l_g_CUST_ANAME = list; }
	public void setList_g_ITEM_CD(List list) { l_g_ITEM_CD = list; }
	public void setList_k_MODE(List list) { l_k_MODE = list; }
	public void setList_h_RESULT(List list) { l_h_RESULT = list; }
	public void setList_h_REST_SHIP_ODR_QTY(List list) { l_h_REST_SHIP_ODR_QTY = list; }
	public void setList_h_CUST_ANAME(List list) { l_h_CUST_ANAME = list; }
	public void setList_h_CUST_ITEM_CD(List list) { l_h_CUST_ITEM_CD = list; }
	public void setList_h_ITEM_CD(List list) { l_h_ITEM_CD = list; }
	public void setList_h_AP_SECRTY_TYP(List list) { l_h_AP_SECRTY_TYP = list; }
	public void setList_h_MODIFY_CNT(List list) { l_h_MODIFY_CNT = list; }
	public void setList_r_SEL_PTN1(List list) { l_r_SEL_PTN1 = list; }
	public void setList_r_SEL_PTN2(List list) { l_r_SEL_PTN2 = list; }
	public void setList_g_ODR_NO(List list) { l_g_ODR_NO = list; }
	public void setList_g_SLIP_CD(List list) { l_g_SLIP_CD = list; }
	public void setList_g_DESINATED_SHIP_DATE(List list) { l_g_DESINATED_SHIP_DATE = list; }
	public void setList_g_REST_SHIP_ODR_QTY2(List list) { l_g_REST_SHIP_ODR_QTY2 = list; }
	public void setList_g_WH_CD(List list) { l_g_WH_CD = list; }
	public void setList_h_PARTIAL_SHIP_INST_FLG(List list) { l_h_PARTIAL_SHIP_INST_FLG = list; }
	public void setList_g_STOCK_UNIT(List list) { l_g_STOCK_UNIT = list; }
	public void setList_g_STOCK_UNIT2(List list) { l_g_STOCK_UNIT2 = list; }
	public void setList_g_WH_NAME(List list) { l_g_WH_NAME = list; }
	public void setList_g_CUST_CD(List list) { l_g_CUST_CD = list; }
	public void setList_g_CUST_ITEM_NAME(List list) { l_g_CUST_ITEM_NAME = list; }
	public void setList_g_ITEM_NAME(List list) { l_g_ITEM_NAME = list; }
	public void setList_g_CUST_ODR_NO(List list) { l_g_CUST_ODR_NO = list; }
	public void setList_c_JOB_ODR_CD(List list) { l_c_JOB_ODR_CD = list; }
	public void setList_h_MRP_ODR_TYP(List list) { l_h_MRP_ODR_TYP = list; }
	public void setList_h_JOB_ODR_CD(List list) { l_h_JOB_ODR_CD = list; }
	public void setList_tMRP_ODR_TYP(List list) { l_tMRP_ODR_TYP = list; }
	public void setList_chkisWhCd_IN_JOBODRCD(List list) { l_chkisWhCd_IN_JOBODRCD = list; }
	public void setList_strCOMPANY_CD(List list) { l_strCOMPANY_CD = list; }
	public void setList_strUSER_NAME(List list) { l_strUSER_NAME = list; }
	public void setList_strPLANT_CD(List list) { l_strPLANT_CD = list; }
	public void setList_strSECTION_CD(List list) { l_strSECTION_CD = list; }
	public void setList_strPLANT_NAME(List list) { l_strPLANT_NAME = list; }
	public void setList_strPLANT_ANAME(List list) { l_strPLANT_ANAME = list; }
	public void setList_strCAL_NO(List list) { l_strCAL_NO = list; }
	public void setList_strUSER_CD(List list) { l_strUSER_CD = list; }
	public void setList_strBUSINESS_OPR_DATE(List list) { l_strBUSINESS_OPR_DATE = list; }
	public void setList_strMAX_DISPLAY_ROWNUM(List list) { l_strMAX_DISPLAY_ROWNUM = list; }
	public void setList_tAnsDlvDate_ODR_NO(List list) { l_tAnsDlvDate_ODR_NO = list; }
	public void setList_tAnsDlvDate_PART_DLV_SEQ_NO(List list) { l_tAnsDlvDate_PART_DLV_SEQ_NO = list; }
	public void setList_tAnsDlvDate_DESINATED_SHIP_DATE(List list) { l_tAnsDlvDate_DESINATED_SHIP_DATE = list; }
	public void setList_tOdrODR_CTL_NO(List list) { l_tOdrODR_CTL_NO = list; }
	public void setList_tOdrCtl_CUST_ITEM_CD(List list) { l_tOdrCtl_CUST_ITEM_CD = list; }
	public void setList_tOdrCtl_ITEM_CD(List list) { l_tOdrCtl_ITEM_CD = list; }
	public void setList_mCust_CUST_ANAME(List list) { l_mCust_CUST_ANAME = list; }
	public void setList_tAnsDlvDate_REST_SHIP_ODR_QTY(List list) { l_tAnsDlvDate_REST_SHIP_ODR_QTY = list; }
	public void setList_tOdr_TRANSPORT_TYP(List list) { l_tOdr_TRANSPORT_TYP = list; }
	public void setList_tOdr_ODR_UNIT_PRICE(List list) { l_tOdr_ODR_UNIT_PRICE = list; }
	public void setList_tOdr_SPCL_PRICE_TYP(List list) { l_tOdr_SPCL_PRICE_TYP = list; }
	public void setList_tOdrCtl_CUST_CD(List list) { l_tOdrCtl_CUST_CD = list; }
	public void setList_tOdr_PARTIAL_SHIP_INST_FLG(List list) { l_tOdr_PARTIAL_SHIP_INST_FLG = list; }
	public void setList_tAnsDlvDate_MODIFY_COUNT(List list) { l_tAnsDlvDate_MODIFY_COUNT = list; }
	public void setList_tITEM_NAME(List list) { l_tITEM_NAME = list; }
	public void setList_tSTOCK_UNIT(List list) { l_tSTOCK_UNIT = list; }
	public void setList_tUNIT_QTY_TYP(List list) { l_tUNIT_QTY_TYP = list; }
	public void setList_tWH_NAME(List list) { l_tWH_NAME = list; }
	public void setList_tSHIP_WH_CD(List list) { l_tSHIP_WH_CD = list; }
	public void setList_tCUST_CD(List list) { l_tCUST_CD = list; }
	public void setList_tCUST_ITEM_NAME(List list) { l_tCUST_ITEM_NAME = list; }
	public void setList_tCUST_ODR_NO(List list) { l_tCUST_ODR_NO = list; }
	public void setList_g_JOB_ODR_CD(List list) { l_g_JOB_ODR_CD = list; }
	public void setList_sysMyCompany_IN_COMPANYCD(List list) { l_sysMyCompany_IN_COMPANYCD = list; }
	public void setList_tAnsDlvDate_IN_ODRNO(List list) { l_tAnsDlvDate_IN_ODRNO = list; }
	public void setList_tAnsDlvDate_IN_PARTDLVSEQNO(List list) { l_tAnsDlvDate_IN_PARTDLVSEQNO = list; }
	public void setList_up_tAnsDlvDate_DESINATED_SHIP_DATE(List list) { l_up_tAnsDlvDate_DESINATED_SHIP_DATE = list; }
	public void setList_up_tAnsDlvDate_REST_SHIP_ODR_QTY(List list) { l_up_tAnsDlvDate_REST_SHIP_ODR_QTY = list; }
	public void setList_up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG(List list) { l_up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG = list; }
	public void setList_up_tAnsDlvDate_IN_ODRNO(List list) { l_up_tAnsDlvDate_IN_ODRNO = list; }
	public void setList_up_tAnsDlvDate_IN_PARTDLVSEQNO(List list) { l_up_tAnsDlvDate_IN_PARTDLVSEQNO = list; }
	public void setList_tShipOdr_ODR_NO(List list) { l_tShipOdr_ODR_NO = list; }
	public void setList_tShipOdr_PART_DLV_SEQ_NO(List list) { l_tShipOdr_PART_DLV_SEQ_NO = list; }
	public void setList_tShipOdr_SLIP_CD(List list) { l_tShipOdr_SLIP_CD = list; }
	public void setList_tShipOdr_DESINATED_SHIP_DATE(List list) { l_tShipOdr_DESINATED_SHIP_DATE = list; }
	public void setList_tShipOdr_SHIP_QTY(List list) { l_tShipOdr_SHIP_QTY = list; }
	public void setList_tShipOdr_ALLCT_WH_CD(List list) { l_tShipOdr_ALLCT_WH_CD = list; }
	public void setList_tShipOdr_CUST_NAME(List list) { l_tShipOdr_CUST_NAME = list; }
	public void setList_tShipOdr_CUST_ITEM_CD(List list) { l_tShipOdr_CUST_ITEM_CD = list; }
	public void setList_tShipOdr_ITEM_CD(List list) { l_tShipOdr_ITEM_CD = list; }
	public void setList_tShipOdr_JOB_ODR_CD(List list) { l_tShipOdr_JOB_ODR_CD = list; }
	public void setList_tShipOdrAnsDlvDate_REST_SHIP_ODR_QTY(List list) { l_tShipOdrAnsDlvDate_REST_SHIP_ODR_QTY = list; }
	public void setList_tShipOdr_DEL_FLG(List list) { l_tShipOdr_DEL_FLG = list; }
	public void setList_tShipOdr_DIRECT_DLV_FLG(List list) { l_tShipOdr_DIRECT_DLV_FLG = list; }
	public void setList_tShipOdr_TRANSPORT_TYP(List list) { l_tShipOdr_TRANSPORT_TYP = list; }
	public void setList_tShipOdr_MODIFY_COUNT(List list) { l_tShipOdr_MODIFY_COUNT = list; }
	public void setList_tDEPO_TRANSFER_PROC_FLG(List list) { l_tDEPO_TRANSFER_PROC_FLG = list; }
	public void setList_tShipOdr_IN_SLIPCD(List list) { l_tShipOdr_IN_SLIPCD = list; }
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
	public void setList_tOdr_TAX_APPLY_TYP(List list) { l_tOdr_TAX_APPLY_TYP = list; }
	public void setList_tOdr_TAX_CD(List list) { l_tOdr_TAX_CD = list; }
	public void setList_tOdr_TAX_CALC_TYP(List list) { l_tOdr_TAX_CALC_TYP = list; }
	public void setList_tOdr_REMARKS(List list) { l_tOdr_REMARKS = list; }
	public void setList_tOdr_ODR_ACPT_DATE(List list) { l_tOdr_ODR_ACPT_DATE = list; }
	public void setList_tOdr_SHIP_PLAN_REMAIN_QTY(List list) { l_tOdr_SHIP_PLAN_REMAIN_QTY = list; }
	public void setList_tOdr_SHIP_PLAN_CMPLT_FLG(List list) { l_tOdr_SHIP_PLAN_CMPLT_FLG = list; }
	public void setList_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG(List list) { l_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG = list; }
	public void setList_tOdr_IF_CTL_NO(List list) { l_tOdr_IF_CTL_NO = list; }
	public void setList_tOdr_ENTRY_TYP(List list) { l_tOdr_ENTRY_TYP = list; }
	public void setList_tOdr_BUYER_NAME(List list) { l_tOdr_BUYER_NAME = list; }
	public void setList_tOdr_PUCH_ODR_QTY_TOTAL(List list) { l_tOdr_PUCH_ODR_QTY_TOTAL = list; }
	public void setList_tOdr_UNIT_CD_ORG(List list) { l_tOdr_UNIT_CD_ORG = list; }
	public void setList_tOdr_SHIP_CNT(List list) { l_tOdr_SHIP_CNT = list; }
	public void setList_tOdr_CUR_CD(List list) { l_tOdr_CUR_CD = list; }
	public void setList_tOdr_EXCH_TYP_R(List list) { l_tOdr_EXCH_TYP_R = list; }
	public void setList_tOdr_IN_ODRNO(List list) { l_tOdr_IN_ODRNO = list; }
	public void setList_uptOdr_PART_DLV_COUNT(List list) { l_uptOdr_PART_DLV_COUNT = list; }
	public void setList_uptOdr_IN_ODRNO(List list) { l_uptOdr_IN_ODRNO = list; }
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
	public void setList_tOdrCtl_ODR_CTL_NO(List list) { l_tOdrCtl_ODR_CTL_NO = list; }
	public void setList_tOdrCtl_CUST_ITEM_NAME(List list) { l_tOdrCtl_CUST_ITEM_NAME = list; }
	public void setList_tOdrCtl_ITEM_NAME(List list) { l_tOdrCtl_ITEM_NAME = list; }
	public void setList_tOdrCtl_IN_ODRCTLNO(List list) { l_tOdrCtl_IN_ODRCTLNO = list; }
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
	public void setList_tori_tAnsDlvDate_REST_SHIP_ODR_QTY(List list) { l_tori_tAnsDlvDate_REST_SHIP_ODR_QTY = list; }
	public void setList_tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG(List list) { l_tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG = list; }
	public void setList_tori_tAnsDlvDate_IN_ODRNO(List list) { l_tori_tAnsDlvDate_IN_ODRNO = list; }
	public void setList_tori_tAnsDlvDate_IN_PARTDLVSEQNO(List list) { l_tori_tAnsDlvDate_IN_PARTDLVSEQNO = list; }
	public void setList_chkisWhCd_WH_CD(List list) { l_chkisWhCd_WH_CD = list; }
	public void setList_chkisWhCd_WH_TYP(List list) { l_chkisWhCd_WH_TYP = list; }
	public void setList_chkisWhCd_ITEM_CD(List list) { l_chkisWhCd_ITEM_CD = list; }
	public void setList_chkisWhCd_PBL_SHIP_QTY(List list) { l_chkisWhCd_PBL_SHIP_QTY = list; }
	public void setList_chkisWhCd_IN_ITEMCD(List list) { l_chkisWhCd_IN_ITEMCD = list; }
	public void setList_chkisWhCd_IN_WHCD(List list) { l_chkisWhCd_IN_WHCD = list; }
	public void setList_mUnitCost_UNIT_COST(List list) { l_mUnitCost_UNIT_COST = list; }
	public void setList_mUnitCost_EFF_PHASE_IN_DATE(List list) { l_mUnitCost_EFF_PHASE_IN_DATE = list; }
	public void setList_mUnitCost_IN_COMPANYCD(List list) { l_mUnitCost_IN_COMPANYCD = list; }
	public void setList_mUnitCost_IN_CUSTCD(List list) { l_mUnitCost_IN_CUSTCD = list; }
	public void setList_mUnitCost_IN_ITEMCD(List list) { l_mUnitCost_IN_ITEMCD = list; }
	public void setList_mUnitCost_IN_EFFPHASEINDATE(List list) { l_mUnitCost_IN_EFFPHASEINDATE = list; }
	public void setList_mWhWH_CD(List list) { l_mWhWH_CD = list; }
	public void setList_mWhWH_NAME(List list) { l_mWhWH_NAME = list; }
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
	public void setList_g_CUST_ITEM_CD(List list) { l_g_CUST_ITEM_CD = list; }
	public void setList_strYotaku_WH_CD(List list) { l_strYotaku_WH_CD = list; }
	public void setList_strYotaku_IN_WH_TYP(List list) { l_strYotaku_IN_WH_TYP = list; }
	public void setList_strSYUKA_LT(List list) { l_strSYUKA_LT = list; }
	public void setList_chkisinWhCd_WH_CD(List list) { l_chkisinWhCd_WH_CD = list; }
	public void setList_chkisinWhCd_WH_TYP(List list) { l_chkisinWhCd_WH_TYP = list; }
	public void setList_chkisinWhCd_WH_NAME(List list) { l_chkisinWhCd_WH_NAME = list; }
	public void setList_chkis_IN_WHCD(List list) { l_chkis_IN_WHCD = list; }
	public void setList_uptOdr_SHIP_CNT(List list) { l_uptOdr_SHIP_CNT = list; }
	public void setList_tHOLIDAY_FLG(List list) { l_tHOLIDAY_FLG = list; }
	public void setList_tWH_CD(List list) { l_tWH_CD = list; }
	public void setList_tCAL_DATE(List list) { l_tCAL_DATE = list; }
	public void setList_tDECIMAL_FIG(List list) { l_tDECIMAL_FIG = list; }
	public void setList_tCUR_CD(List list) { l_tCUR_CD = list; }
	public void setList_chkisWhCd_JOB_ODR_CD(List list) { l_chkisWhCd_JOB_ODR_CD = list; }
	public void setList_serTJobOdr_JOB_ODR_CD(List list) { l_serTJobOdr_JOB_ODR_CD = list; }
	public void setList_serTJobOdr_ITEM_CD(List list) { l_serTJobOdr_ITEM_CD = list; }
	public void setList_tUnShipList_ACPT_ODR_CD(List list) { l_tUnShipList_ACPT_ODR_CD = list; }
	public void setList_tUnShipList_PART_DLV_SEQ_NO(List list) { l_tUnShipList_PART_DLV_SEQ_NO = list; }
	public void setList_strTAX_CD(List list) { l_strTAX_CD = list; }
	public void setList_selMODIFY_COUNT(List list) { l_selMODIFY_COUNT = list; }

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
			l_g_PART_DLV_SEQ_NO.add(((KU0010010Struct) list.get(i)).getg_PART_DLV_SEQ_NO());
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
			l_g_DIRECT_DLV_FLG.add(((KU0010010Struct) list.get(i)).getg_DIRECT_DLV_FLG());
		}
		return size;
	}
	public int setL2L_g_REST_SHIP_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_g_REST_SHIP_ODR_QTY == null) {
			l_g_REST_SHIP_ODR_QTY = new ArrayList();
		} else {
			l_g_REST_SHIP_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_g_REST_SHIP_ODR_QTY.add(((KU0010010Struct) list.get(i)).getg_REST_SHIP_ODR_QTY());
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
			l_g_CUST_ANAME.add(((KU0010010Struct) list.get(i)).getg_CUST_ANAME());
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
			l_g_ITEM_CD.add(((KU0010010Struct) list.get(i)).getg_ITEM_CD());
		}
		return size;
	}
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
			l_k_MODE.add(((KU0010010Struct) list.get(i)).getk_MODE());
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
			l_h_RESULT.add(((KU0010010Struct) list.get(i)).geth_RESULT());
		}
		return size;
	}
	public int setL2L_h_REST_SHIP_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_REST_SHIP_ODR_QTY == null) {
			l_h_REST_SHIP_ODR_QTY = new ArrayList();
		} else {
			l_h_REST_SHIP_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_REST_SHIP_ODR_QTY.add(((KU0010010Struct) list.get(i)).geth_REST_SHIP_ODR_QTY());
		}
		return size;
	}
	public int setL2L_h_CUST_ANAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_CUST_ANAME == null) {
			l_h_CUST_ANAME = new ArrayList();
		} else {
			l_h_CUST_ANAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_CUST_ANAME.add(((KU0010010Struct) list.get(i)).geth_CUST_ANAME());
		}
		return size;
	}
	public int setL2L_h_CUST_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_CUST_ITEM_CD == null) {
			l_h_CUST_ITEM_CD = new ArrayList();
		} else {
			l_h_CUST_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_CUST_ITEM_CD.add(((KU0010010Struct) list.get(i)).geth_CUST_ITEM_CD());
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
			l_h_ITEM_CD.add(((KU0010010Struct) list.get(i)).geth_ITEM_CD());
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
			l_h_AP_SECRTY_TYP.add(((KU0010010Struct) list.get(i)).geth_AP_SECRTY_TYP());
		}
		return size;
	}
	public int setL2L_h_MODIFY_CNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_MODIFY_CNT == null) {
			l_h_MODIFY_CNT = new ArrayList();
		} else {
			l_h_MODIFY_CNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_MODIFY_CNT.add(((KU0010010Struct) list.get(i)).geth_MODIFY_CNT());
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
			l_r_SEL_PTN1.add(((KU0010010Struct) list.get(i)).getr_SEL_PTN1());
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
			l_r_SEL_PTN2.add(((KU0010010Struct) list.get(i)).getr_SEL_PTN2());
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
			l_g_ODR_NO.add(((KU0010010Struct) list.get(i)).getg_ODR_NO());
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
			l_g_SLIP_CD.add(((KU0010010Struct) list.get(i)).getg_SLIP_CD());
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
			l_g_DESINATED_SHIP_DATE.add(((KU0010010Struct) list.get(i)).getg_DESINATED_SHIP_DATE());
		}
		return size;
	}
	public int setL2L_g_REST_SHIP_ODR_QTY2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_g_REST_SHIP_ODR_QTY2 == null) {
			l_g_REST_SHIP_ODR_QTY2 = new ArrayList();
		} else {
			l_g_REST_SHIP_ODR_QTY2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_g_REST_SHIP_ODR_QTY2.add(((KU0010010Struct) list.get(i)).getg_REST_SHIP_ODR_QTY2());
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
			l_g_WH_CD.add(((KU0010010Struct) list.get(i)).getg_WH_CD());
		}
		return size;
	}
	public int setL2L_h_PARTIAL_SHIP_INST_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PARTIAL_SHIP_INST_FLG == null) {
			l_h_PARTIAL_SHIP_INST_FLG = new ArrayList();
		} else {
			l_h_PARTIAL_SHIP_INST_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PARTIAL_SHIP_INST_FLG.add(((KU0010010Struct) list.get(i)).geth_PARTIAL_SHIP_INST_FLG());
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
			l_g_STOCK_UNIT.add(((KU0010010Struct) list.get(i)).getg_STOCK_UNIT());
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
			l_g_STOCK_UNIT2.add(((KU0010010Struct) list.get(i)).getg_STOCK_UNIT2());
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
			l_g_WH_NAME.add(((KU0010010Struct) list.get(i)).getg_WH_NAME());
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
			l_g_CUST_CD.add(((KU0010010Struct) list.get(i)).getg_CUST_CD());
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
			l_g_CUST_ITEM_NAME.add(((KU0010010Struct) list.get(i)).getg_CUST_ITEM_NAME());
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
			l_g_ITEM_NAME.add(((KU0010010Struct) list.get(i)).getg_ITEM_NAME());
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
			l_g_CUST_ODR_NO.add(((KU0010010Struct) list.get(i)).getg_CUST_ODR_NO());
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
			l_c_JOB_ODR_CD.add(((KU0010010Struct) list.get(i)).getc_JOB_ODR_CD());
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
			l_h_MRP_ODR_TYP.add(((KU0010010Struct) list.get(i)).geth_MRP_ODR_TYP());
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
			l_h_JOB_ODR_CD.add(((KU0010010Struct) list.get(i)).geth_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_tMRP_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tMRP_ODR_TYP == null) {
			l_tMRP_ODR_TYP = new ArrayList();
		} else {
			l_tMRP_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tMRP_ODR_TYP.add(((KU0010010Struct) list.get(i)).gettMRP_ODR_TYP());
		}
		return size;
	}
	public int setL2L_chkisWhCd_IN_JOBODRCD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_chkisWhCd_IN_JOBODRCD == null) {
			l_chkisWhCd_IN_JOBODRCD = new ArrayList();
		} else {
			l_chkisWhCd_IN_JOBODRCD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_chkisWhCd_IN_JOBODRCD.add(((KU0010010Struct) list.get(i)).getchkisWhCd_IN_JOBODRCD());
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
			l_strCOMPANY_CD.add(((KU0010010Struct) list.get(i)).getstrCOMPANY_CD());
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
			l_strUSER_NAME.add(((KU0010010Struct) list.get(i)).getstrUSER_NAME());
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
			l_strPLANT_CD.add(((KU0010010Struct) list.get(i)).getstrPLANT_CD());
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
			l_strSECTION_CD.add(((KU0010010Struct) list.get(i)).getstrSECTION_CD());
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
			l_strPLANT_NAME.add(((KU0010010Struct) list.get(i)).getstrPLANT_NAME());
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
			l_strPLANT_ANAME.add(((KU0010010Struct) list.get(i)).getstrPLANT_ANAME());
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
			l_strCAL_NO.add(((KU0010010Struct) list.get(i)).getstrCAL_NO());
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
			l_strUSER_CD.add(((KU0010010Struct) list.get(i)).getstrUSER_CD());
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
			l_strBUSINESS_OPR_DATE.add(((KU0010010Struct) list.get(i)).getstrBUSINESS_OPR_DATE());
		}
		return size;
	}
	public int setL2L_strMAX_DISPLAY_ROWNUM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strMAX_DISPLAY_ROWNUM == null) {
			l_strMAX_DISPLAY_ROWNUM = new ArrayList();
		} else {
			l_strMAX_DISPLAY_ROWNUM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strMAX_DISPLAY_ROWNUM.add(((KU0010010Struct) list.get(i)).getstrMAX_DISPLAY_ROWNUM());
		}
		return size;
	}
	public int setL2L_tAnsDlvDate_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tAnsDlvDate_ODR_NO == null) {
			l_tAnsDlvDate_ODR_NO = new ArrayList();
		} else {
			l_tAnsDlvDate_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tAnsDlvDate_ODR_NO.add(((KU0010010Struct) list.get(i)).gettAnsDlvDate_ODR_NO());
		}
		return size;
	}
	public int setL2L_tAnsDlvDate_PART_DLV_SEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tAnsDlvDate_PART_DLV_SEQ_NO == null) {
			l_tAnsDlvDate_PART_DLV_SEQ_NO = new ArrayList();
		} else {
			l_tAnsDlvDate_PART_DLV_SEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tAnsDlvDate_PART_DLV_SEQ_NO.add(((KU0010010Struct) list.get(i)).gettAnsDlvDate_PART_DLV_SEQ_NO());
		}
		return size;
	}
	public int setL2L_tAnsDlvDate_DESINATED_SHIP_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tAnsDlvDate_DESINATED_SHIP_DATE == null) {
			l_tAnsDlvDate_DESINATED_SHIP_DATE = new ArrayList();
		} else {
			l_tAnsDlvDate_DESINATED_SHIP_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tAnsDlvDate_DESINATED_SHIP_DATE.add(((KU0010010Struct) list.get(i)).gettAnsDlvDate_DESINATED_SHIP_DATE());
		}
		return size;
	}
	public int setL2L_tOdrODR_CTL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdrODR_CTL_NO == null) {
			l_tOdrODR_CTL_NO = new ArrayList();
		} else {
			l_tOdrODR_CTL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdrODR_CTL_NO.add(((KU0010010Struct) list.get(i)).gettOdrODR_CTL_NO());
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
			l_tOdrCtl_CUST_ITEM_CD.add(((KU0010010Struct) list.get(i)).gettOdrCtl_CUST_ITEM_CD());
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
			l_tOdrCtl_ITEM_CD.add(((KU0010010Struct) list.get(i)).gettOdrCtl_ITEM_CD());
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
			l_mCust_CUST_ANAME.add(((KU0010010Struct) list.get(i)).getmCust_CUST_ANAME());
		}
		return size;
	}
	public int setL2L_tAnsDlvDate_REST_SHIP_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tAnsDlvDate_REST_SHIP_ODR_QTY == null) {
			l_tAnsDlvDate_REST_SHIP_ODR_QTY = new ArrayList();
		} else {
			l_tAnsDlvDate_REST_SHIP_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tAnsDlvDate_REST_SHIP_ODR_QTY.add(((KU0010010Struct) list.get(i)).gettAnsDlvDate_REST_SHIP_ODR_QTY());
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
			l_tOdr_TRANSPORT_TYP.add(((KU0010010Struct) list.get(i)).gettOdr_TRANSPORT_TYP());
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
			l_tOdr_ODR_UNIT_PRICE.add(((KU0010010Struct) list.get(i)).gettOdr_ODR_UNIT_PRICE());
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
			l_tOdr_SPCL_PRICE_TYP.add(((KU0010010Struct) list.get(i)).gettOdr_SPCL_PRICE_TYP());
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
			l_tOdrCtl_CUST_CD.add(((KU0010010Struct) list.get(i)).gettOdrCtl_CUST_CD());
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
			l_tOdr_PARTIAL_SHIP_INST_FLG.add(((KU0010010Struct) list.get(i)).gettOdr_PARTIAL_SHIP_INST_FLG());
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
			l_tAnsDlvDate_MODIFY_COUNT.add(((KU0010010Struct) list.get(i)).gettAnsDlvDate_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_tITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tITEM_NAME == null) {
			l_tITEM_NAME = new ArrayList();
		} else {
			l_tITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tITEM_NAME.add(((KU0010010Struct) list.get(i)).gettITEM_NAME());
		}
		return size;
	}
	public int setL2L_tSTOCK_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tSTOCK_UNIT == null) {
			l_tSTOCK_UNIT = new ArrayList();
		} else {
			l_tSTOCK_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tSTOCK_UNIT.add(((KU0010010Struct) list.get(i)).gettSTOCK_UNIT());
		}
		return size;
	}
	public int setL2L_tUNIT_QTY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tUNIT_QTY_TYP == null) {
			l_tUNIT_QTY_TYP = new ArrayList();
		} else {
			l_tUNIT_QTY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tUNIT_QTY_TYP.add(((KU0010010Struct) list.get(i)).gettUNIT_QTY_TYP());
		}
		return size;
	}
	public int setL2L_tWH_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tWH_NAME == null) {
			l_tWH_NAME = new ArrayList();
		} else {
			l_tWH_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tWH_NAME.add(((KU0010010Struct) list.get(i)).gettWH_NAME());
		}
		return size;
	}
	public int setL2L_tSHIP_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tSHIP_WH_CD == null) {
			l_tSHIP_WH_CD = new ArrayList();
		} else {
			l_tSHIP_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tSHIP_WH_CD.add(((KU0010010Struct) list.get(i)).gettSHIP_WH_CD());
		}
		return size;
	}
	public int setL2L_tCUST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tCUST_CD == null) {
			l_tCUST_CD = new ArrayList();
		} else {
			l_tCUST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tCUST_CD.add(((KU0010010Struct) list.get(i)).gettCUST_CD());
		}
		return size;
	}
	public int setL2L_tCUST_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tCUST_ITEM_NAME == null) {
			l_tCUST_ITEM_NAME = new ArrayList();
		} else {
			l_tCUST_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tCUST_ITEM_NAME.add(((KU0010010Struct) list.get(i)).gettCUST_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_tCUST_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tCUST_ODR_NO == null) {
			l_tCUST_ODR_NO = new ArrayList();
		} else {
			l_tCUST_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tCUST_ODR_NO.add(((KU0010010Struct) list.get(i)).gettCUST_ODR_NO());
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
			l_g_JOB_ODR_CD.add(((KU0010010Struct) list.get(i)).getg_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_sysMyCompany_IN_COMPANYCD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sysMyCompany_IN_COMPANYCD == null) {
			l_sysMyCompany_IN_COMPANYCD = new ArrayList();
		} else {
			l_sysMyCompany_IN_COMPANYCD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sysMyCompany_IN_COMPANYCD.add(((KU0010010Struct) list.get(i)).getsysMyCompany_IN_COMPANYCD());
		}
		return size;
	}
	public int setL2L_tAnsDlvDate_IN_ODRNO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tAnsDlvDate_IN_ODRNO == null) {
			l_tAnsDlvDate_IN_ODRNO = new ArrayList();
		} else {
			l_tAnsDlvDate_IN_ODRNO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tAnsDlvDate_IN_ODRNO.add(((KU0010010Struct) list.get(i)).gettAnsDlvDate_IN_ODRNO());
		}
		return size;
	}
	public int setL2L_tAnsDlvDate_IN_PARTDLVSEQNO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tAnsDlvDate_IN_PARTDLVSEQNO == null) {
			l_tAnsDlvDate_IN_PARTDLVSEQNO = new ArrayList();
		} else {
			l_tAnsDlvDate_IN_PARTDLVSEQNO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tAnsDlvDate_IN_PARTDLVSEQNO.add(((KU0010010Struct) list.get(i)).gettAnsDlvDate_IN_PARTDLVSEQNO());
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
			l_up_tAnsDlvDate_DESINATED_SHIP_DATE.add(((KU0010010Struct) list.get(i)).getup_tAnsDlvDate_DESINATED_SHIP_DATE());
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
			l_up_tAnsDlvDate_REST_SHIP_ODR_QTY.add(((KU0010010Struct) list.get(i)).getup_tAnsDlvDate_REST_SHIP_ODR_QTY());
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
			l_up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG.add(((KU0010010Struct) list.get(i)).getup_tAnsDlvDate_SHIP_ODR_CMPLT_FLG());
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
			l_up_tAnsDlvDate_IN_ODRNO.add(((KU0010010Struct) list.get(i)).getup_tAnsDlvDate_IN_ODRNO());
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
			l_up_tAnsDlvDate_IN_PARTDLVSEQNO.add(((KU0010010Struct) list.get(i)).getup_tAnsDlvDate_IN_PARTDLVSEQNO());
		}
		return size;
	}
	public int setL2L_tShipOdr_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tShipOdr_ODR_NO == null) {
			l_tShipOdr_ODR_NO = new ArrayList();
		} else {
			l_tShipOdr_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tShipOdr_ODR_NO.add(((KU0010010Struct) list.get(i)).gettShipOdr_ODR_NO());
		}
		return size;
	}
	public int setL2L_tShipOdr_PART_DLV_SEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tShipOdr_PART_DLV_SEQ_NO == null) {
			l_tShipOdr_PART_DLV_SEQ_NO = new ArrayList();
		} else {
			l_tShipOdr_PART_DLV_SEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tShipOdr_PART_DLV_SEQ_NO.add(((KU0010010Struct) list.get(i)).gettShipOdr_PART_DLV_SEQ_NO());
		}
		return size;
	}
	public int setL2L_tShipOdr_SLIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tShipOdr_SLIP_CD == null) {
			l_tShipOdr_SLIP_CD = new ArrayList();
		} else {
			l_tShipOdr_SLIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tShipOdr_SLIP_CD.add(((KU0010010Struct) list.get(i)).gettShipOdr_SLIP_CD());
		}
		return size;
	}
	public int setL2L_tShipOdr_DESINATED_SHIP_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tShipOdr_DESINATED_SHIP_DATE == null) {
			l_tShipOdr_DESINATED_SHIP_DATE = new ArrayList();
		} else {
			l_tShipOdr_DESINATED_SHIP_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tShipOdr_DESINATED_SHIP_DATE.add(((KU0010010Struct) list.get(i)).gettShipOdr_DESINATED_SHIP_DATE());
		}
		return size;
	}
	public int setL2L_tShipOdr_SHIP_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tShipOdr_SHIP_QTY == null) {
			l_tShipOdr_SHIP_QTY = new ArrayList();
		} else {
			l_tShipOdr_SHIP_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tShipOdr_SHIP_QTY.add(((KU0010010Struct) list.get(i)).gettShipOdr_SHIP_QTY());
		}
		return size;
	}
	public int setL2L_tShipOdr_ALLCT_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tShipOdr_ALLCT_WH_CD == null) {
			l_tShipOdr_ALLCT_WH_CD = new ArrayList();
		} else {
			l_tShipOdr_ALLCT_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tShipOdr_ALLCT_WH_CD.add(((KU0010010Struct) list.get(i)).gettShipOdr_ALLCT_WH_CD());
		}
		return size;
	}
	public int setL2L_tShipOdr_CUST_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tShipOdr_CUST_NAME == null) {
			l_tShipOdr_CUST_NAME = new ArrayList();
		} else {
			l_tShipOdr_CUST_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tShipOdr_CUST_NAME.add(((KU0010010Struct) list.get(i)).gettShipOdr_CUST_NAME());
		}
		return size;
	}
	public int setL2L_tShipOdr_CUST_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tShipOdr_CUST_ITEM_CD == null) {
			l_tShipOdr_CUST_ITEM_CD = new ArrayList();
		} else {
			l_tShipOdr_CUST_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tShipOdr_CUST_ITEM_CD.add(((KU0010010Struct) list.get(i)).gettShipOdr_CUST_ITEM_CD());
		}
		return size;
	}
	public int setL2L_tShipOdr_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tShipOdr_ITEM_CD == null) {
			l_tShipOdr_ITEM_CD = new ArrayList();
		} else {
			l_tShipOdr_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tShipOdr_ITEM_CD.add(((KU0010010Struct) list.get(i)).gettShipOdr_ITEM_CD());
		}
		return size;
	}
	public int setL2L_tShipOdr_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tShipOdr_JOB_ODR_CD == null) {
			l_tShipOdr_JOB_ODR_CD = new ArrayList();
		} else {
			l_tShipOdr_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tShipOdr_JOB_ODR_CD.add(((KU0010010Struct) list.get(i)).gettShipOdr_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_tShipOdrAnsDlvDate_REST_SHIP_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tShipOdrAnsDlvDate_REST_SHIP_ODR_QTY == null) {
			l_tShipOdrAnsDlvDate_REST_SHIP_ODR_QTY = new ArrayList();
		} else {
			l_tShipOdrAnsDlvDate_REST_SHIP_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tShipOdrAnsDlvDate_REST_SHIP_ODR_QTY.add(((KU0010010Struct) list.get(i)).gettShipOdrAnsDlvDate_REST_SHIP_ODR_QTY());
		}
		return size;
	}
	public int setL2L_tShipOdr_DEL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tShipOdr_DEL_FLG == null) {
			l_tShipOdr_DEL_FLG = new ArrayList();
		} else {
			l_tShipOdr_DEL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tShipOdr_DEL_FLG.add(((KU0010010Struct) list.get(i)).gettShipOdr_DEL_FLG());
		}
		return size;
	}
	public int setL2L_tShipOdr_DIRECT_DLV_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tShipOdr_DIRECT_DLV_FLG == null) {
			l_tShipOdr_DIRECT_DLV_FLG = new ArrayList();
		} else {
			l_tShipOdr_DIRECT_DLV_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tShipOdr_DIRECT_DLV_FLG.add(((KU0010010Struct) list.get(i)).gettShipOdr_DIRECT_DLV_FLG());
		}
		return size;
	}
	public int setL2L_tShipOdr_TRANSPORT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tShipOdr_TRANSPORT_TYP == null) {
			l_tShipOdr_TRANSPORT_TYP = new ArrayList();
		} else {
			l_tShipOdr_TRANSPORT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tShipOdr_TRANSPORT_TYP.add(((KU0010010Struct) list.get(i)).gettShipOdr_TRANSPORT_TYP());
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
			l_tShipOdr_MODIFY_COUNT.add(((KU0010010Struct) list.get(i)).gettShipOdr_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_tDEPO_TRANSFER_PROC_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tDEPO_TRANSFER_PROC_FLG == null) {
			l_tDEPO_TRANSFER_PROC_FLG = new ArrayList();
		} else {
			l_tDEPO_TRANSFER_PROC_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tDEPO_TRANSFER_PROC_FLG.add(((KU0010010Struct) list.get(i)).gettDEPO_TRANSFER_PROC_FLG());
		}
		return size;
	}
	public int setL2L_tShipOdr_IN_SLIPCD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tShipOdr_IN_SLIPCD == null) {
			l_tShipOdr_IN_SLIPCD = new ArrayList();
		} else {
			l_tShipOdr_IN_SLIPCD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tShipOdr_IN_SLIPCD.add(((KU0010010Struct) list.get(i)).gettShipOdr_IN_SLIPCD());
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
			l_in_tShipOdr_ODR_NO.add(((KU0010010Struct) list.get(i)).getin_tShipOdr_ODR_NO());
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
			l_in_tShipOdr_PART_DLV_SEQ_NO.add(((KU0010010Struct) list.get(i)).getin_tShipOdr_PART_DLV_SEQ_NO());
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
			l_in_tShipOdr_SLIP_CD.add(((KU0010010Struct) list.get(i)).getin_tShipOdr_SLIP_CD());
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
			l_in_tShipOdr_ITEM_CD.add(((KU0010010Struct) list.get(i)).getin_tShipOdr_ITEM_CD());
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
			l_in_tShipOdr_CUST_ITEM_CD.add(((KU0010010Struct) list.get(i)).getin_tShipOdr_CUST_ITEM_CD());
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
			l_in_tShipOdr_CUST_ODR_NO.add(((KU0010010Struct) list.get(i)).getin_tShipOdr_CUST_ODR_NO());
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
			l_in_tShipOdr_CUST_CD.add(((KU0010010Struct) list.get(i)).getin_tShipOdr_CUST_CD());
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
			l_in_tShipOdr_CUST_NAME.add(((KU0010010Struct) list.get(i)).getin_tShipOdr_CUST_NAME());
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
			l_in_tShipOdr_SHIP_ODR_ISS_PSN_CD.add(((KU0010010Struct) list.get(i)).getin_tShipOdr_SHIP_ODR_ISS_PSN_CD());
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
			l_in_tShipOdr_DLV_LOC_CD.add(((KU0010010Struct) list.get(i)).getin_tShipOdr_DLV_LOC_CD());
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
			l_in_tShipOdr_DESINATED_SHIP_DATE.add(((KU0010010Struct) list.get(i)).getin_tShipOdr_DESINATED_SHIP_DATE());
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
			l_in_tShipOdr_SHIP_QTY.add(((KU0010010Struct) list.get(i)).getin_tShipOdr_SHIP_QTY());
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
			l_in_tShipOdr_UNIT_PRICE.add(((KU0010010Struct) list.get(i)).getin_tShipOdr_UNIT_PRICE());
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
			l_in_tShipOdr_SHIP_ODR_AMOUNT.add(((KU0010010Struct) list.get(i)).getin_tShipOdr_SHIP_ODR_AMOUNT());
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
			l_in_tShipOdr_CURRNCY_CD.add(((KU0010010Struct) list.get(i)).getin_tShipOdr_CURRNCY_CD());
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
			l_in_tShipOdr_PKG_UNIT_QTY.add(((KU0010010Struct) list.get(i)).getin_tShipOdr_PKG_UNIT_QTY());
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
			l_in_tShipOdr_REMARKS.add(((KU0010010Struct) list.get(i)).getin_tShipOdr_REMARKS());
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
			l_in_tShipOdr_ALLCT_WH_CD.add(((KU0010010Struct) list.get(i)).getin_tShipOdr_ALLCT_WH_CD());
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
			l_in_tShipOdr_DEPO_TYP.add(((KU0010010Struct) list.get(i)).getin_tShipOdr_DEPO_TYP());
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
			l_in_tShipOdr_ENTRY_TYP.add(((KU0010010Struct) list.get(i)).getin_tShipOdr_ENTRY_TYP());
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
			l_in_tShipOdr_PRINT_FLG.add(((KU0010010Struct) list.get(i)).getin_tShipOdr_PRINT_FLG());
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
			l_in_tShipOdr_SHP_CMPLT_FLG.add(((KU0010010Struct) list.get(i)).getin_tShipOdr_SHP_CMPLT_FLG());
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
			l_in_tShipOdr_DEL_FLG.add(((KU0010010Struct) list.get(i)).getin_tShipOdr_DEL_FLG());
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
			l_in_tShipOdr_TRANSPORT_CD.add(((KU0010010Struct) list.get(i)).getin_tShipOdr_TRANSPORT_CD());
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
			l_in_tShipOdr_DIRECT_DLV_FLG.add(((KU0010010Struct) list.get(i)).getin_tShipOdr_DIRECT_DLV_FLG());
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
			l_in_tShipOdr_CUST_CHRG_PSN_CD.add(((KU0010010Struct) list.get(i)).getin_tShipOdr_CUST_CHRG_PSN_CD());
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
			l_in_tShipOdr_UNIT_CD.add(((KU0010010Struct) list.get(i)).getin_tShipOdr_UNIT_CD());
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
			l_in_tShipOdr_SCDL_DLV_DATE.add(((KU0010010Struct) list.get(i)).getin_tShipOdr_SCDL_DLV_DATE());
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
			l_in_tShipOdr_TRANSFER_WH_CD.add(((KU0010010Struct) list.get(i)).getin_tShipOdr_TRANSFER_WH_CD());
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
			l_in_tShipOdr_DLV_KEY_NO.add(((KU0010010Struct) list.get(i)).getin_tShipOdr_DLV_KEY_NO());
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
			l_in_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES.add(((KU0010010Struct) list.get(i)).getin_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES());
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
			l_in_tShipOdr_SHIP_ODR_NO.add(((KU0010010Struct) list.get(i)).getin_tShipOdr_SHIP_ODR_NO());
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
			l_in_tShipOdr_JOB_ODR_CD.add(((KU0010010Struct) list.get(i)).getin_tShipOdr_JOB_ODR_CD());
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
			l_del_tShipOdr_IN_SLIPCD.add(((KU0010010Struct) list.get(i)).getdel_tShipOdr_IN_SLIPCD());
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
			l_tOdr_ODR_NO.add(((KU0010010Struct) list.get(i)).gettOdr_ODR_NO());
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
			l_tOdr_ODR_TYP.add(((KU0010010Struct) list.get(i)).gettOdr_ODR_TYP());
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
			l_tOdr_ODR_CTL_NO.add(((KU0010010Struct) list.get(i)).gettOdr_ODR_CTL_NO());
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
			l_tOdr_CUST_ODR_NO.add(((KU0010010Struct) list.get(i)).gettOdr_CUST_ODR_NO());
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
			l_tOdr_CUST_CHRG_ORG_CD.add(((KU0010010Struct) list.get(i)).gettOdr_CUST_CHRG_ORG_CD());
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
			l_tOdr_CUST_CHRG_PSN_CD.add(((KU0010010Struct) list.get(i)).gettOdr_CUST_CHRG_PSN_CD());
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
			l_tOdr_ODR_ACPT_ORG_CD.add(((KU0010010Struct) list.get(i)).gettOdr_ODR_ACPT_ORG_CD());
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
			l_tOdr_ODR_ACPT_PSN_CD.add(((KU0010010Struct) list.get(i)).gettOdr_ODR_ACPT_PSN_CD());
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
			l_tOdr_CURRNCY_CD.add(((KU0010010Struct) list.get(i)).gettOdr_CURRNCY_CD());
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
			l_tOdr_EXCH_TYP.add(((KU0010010Struct) list.get(i)).gettOdr_EXCH_TYP());
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
			l_tOdr_DLV_LOC_CD.add(((KU0010010Struct) list.get(i)).gettOdr_DLV_LOC_CD());
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
			l_tOdr_DLV_LOC_CD_EIAJ.add(((KU0010010Struct) list.get(i)).gettOdr_DLV_LOC_CD_EIAJ());
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
			l_tOdr_DLV_LOC_NAME.add(((KU0010010Struct) list.get(i)).gettOdr_DLV_LOC_NAME());
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
			l_tOdr_DLV_LOC_NAME_KANJI.add(((KU0010010Struct) list.get(i)).gettOdr_DLV_LOC_NAME_KANJI());
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
			l_tOdr_PRD_ODR_PLACE_CD.add(((KU0010010Struct) list.get(i)).gettOdr_PRD_ODR_PLACE_CD());
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
			l_tOdr_PART_DLV_COUNT.add(((KU0010010Struct) list.get(i)).gettOdr_PART_DLV_COUNT());
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
			l_tOdr_DEPO_TYP.add(((KU0010010Struct) list.get(i)).gettOdr_DEPO_TYP());
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
			l_tOdr_DESINATED_DLV_DATE.add(((KU0010010Struct) list.get(i)).gettOdr_DESINATED_DLV_DATE());
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
			l_tOdr_STD_DESINATED_RCV_DATE.add(((KU0010010Struct) list.get(i)).gettOdr_STD_DESINATED_RCV_DATE());
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
			l_tOdr_ODR_QTY.add(((KU0010010Struct) list.get(i)).gettOdr_ODR_QTY());
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
			l_tOdr_REMAIN_UNCONFIRM_ODR_QTY.add(((KU0010010Struct) list.get(i)).gettOdr_REMAIN_UNCONFIRM_ODR_QTY());
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
			l_tOdr_CANCELED_UNCONFIRM_ODR_QTY.add(((KU0010010Struct) list.get(i)).gettOdr_CANCELED_UNCONFIRM_ODR_QTY());
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
			l_tOdr_UNIT_CD.add(((KU0010010Struct) list.get(i)).gettOdr_UNIT_CD());
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
			l_tOdr_UNCONFIRM_ODR_BALANCE.add(((KU0010010Struct) list.get(i)).gettOdr_UNCONFIRM_ODR_BALANCE());
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
			l_tOdr_ODR_AMOUNT.add(((KU0010010Struct) list.get(i)).gettOdr_ODR_AMOUNT());
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
			l_tOdr_ODR_AMOUNT_EXCH_RATES.add(((KU0010010Struct) list.get(i)).gettOdr_ODR_AMOUNT_EXCH_RATES());
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
			l_tOdr_TOTAL_SHIP_QTY.add(((KU0010010Struct) list.get(i)).gettOdr_TOTAL_SHIP_QTY());
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
			l_tOdr_SHIP_AMOUNT.add(((KU0010010Struct) list.get(i)).gettOdr_SHIP_AMOUNT());
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
			l_tOdr_SHIP_AMOUNT_EXCH_RATES.add(((KU0010010Struct) list.get(i)).gettOdr_SHIP_AMOUNT_EXCH_RATES());
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
			l_tOdr_RETURN_PRICE.add(((KU0010010Struct) list.get(i)).gettOdr_RETURN_PRICE());
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
			l_tOdr_RETURN_QTY.add(((KU0010010Struct) list.get(i)).gettOdr_RETURN_QTY());
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
			l_tOdr_RETURN_AMOUNT.add(((KU0010010Struct) list.get(i)).gettOdr_RETURN_AMOUNT());
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
			l_tOdr_RETURN_AMOUNT_EXCH_RATES.add(((KU0010010Struct) list.get(i)).gettOdr_RETURN_AMOUNT_EXCH_RATES());
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
			l_tOdr_ODR_CMPLT_FLG.add(((KU0010010Struct) list.get(i)).gettOdr_ODR_CMPLT_FLG());
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
			l_tOdr_ODR_CMPLT_DATE.add(((KU0010010Struct) list.get(i)).gettOdr_ODR_CMPLT_DATE());
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
			l_tOdr_CUS_DLV_CD.add(((KU0010010Struct) list.get(i)).gettOdr_CUS_DLV_CD());
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
			l_tOdr_CUS_DLV_KEY_CD.add(((KU0010010Struct) list.get(i)).gettOdr_CUS_DLV_KEY_CD());
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
			l_tOdr_PART_NAME.add(((KU0010010Struct) list.get(i)).gettOdr_PART_NAME());
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
			l_tOdr_PKG_UNIT.add(((KU0010010Struct) list.get(i)).gettOdr_PKG_UNIT());
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
			l_tOdr_SLIP_PRICE_PRINT_TYP.add(((KU0010010Struct) list.get(i)).gettOdr_SLIP_PRICE_PRINT_TYP());
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
			l_tOdr_INSPC_TYP.add(((KU0010010Struct) list.get(i)).gettOdr_INSPC_TYP());
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
			l_tOdr_CLIENT_REMARK.add(((KU0010010Struct) list.get(i)).gettOdr_CLIENT_REMARK());
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
			l_tOdr_CLIENT_REMARK_KANJI.add(((KU0010010Struct) list.get(i)).gettOdr_CLIENT_REMARK_KANJI());
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
			l_tOdr_CLIENT_BARCODE_INF.add(((KU0010010Struct) list.get(i)).gettOdr_CLIENT_BARCODE_INF());
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
			l_tOdr_TRANSPORT_CD.add(((KU0010010Struct) list.get(i)).gettOdr_TRANSPORT_CD());
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
			l_tOdr_TAX_APPLY_TYP.add(((KU0010010Struct) list.get(i)).gettOdr_TAX_APPLY_TYP());
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
			l_tOdr_TAX_CD.add(((KU0010010Struct) list.get(i)).gettOdr_TAX_CD());
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
			l_tOdr_TAX_CALC_TYP.add(((KU0010010Struct) list.get(i)).gettOdr_TAX_CALC_TYP());
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
			l_tOdr_REMARKS.add(((KU0010010Struct) list.get(i)).gettOdr_REMARKS());
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
			l_tOdr_ODR_ACPT_DATE.add(((KU0010010Struct) list.get(i)).gettOdr_ODR_ACPT_DATE());
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
			l_tOdr_SHIP_PLAN_REMAIN_QTY.add(((KU0010010Struct) list.get(i)).gettOdr_SHIP_PLAN_REMAIN_QTY());
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
			l_tOdr_SHIP_PLAN_CMPLT_FLG.add(((KU0010010Struct) list.get(i)).gettOdr_SHIP_PLAN_CMPLT_FLG());
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
			l_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG.add(((KU0010010Struct) list.get(i)).gettOdr_UNCONFIRMED_ODR_EFF_OVR_FLG());
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
			l_tOdr_IF_CTL_NO.add(((KU0010010Struct) list.get(i)).gettOdr_IF_CTL_NO());
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
			l_tOdr_ENTRY_TYP.add(((KU0010010Struct) list.get(i)).gettOdr_ENTRY_TYP());
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
			l_tOdr_BUYER_NAME.add(((KU0010010Struct) list.get(i)).gettOdr_BUYER_NAME());
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
			l_tOdr_PUCH_ODR_QTY_TOTAL.add(((KU0010010Struct) list.get(i)).gettOdr_PUCH_ODR_QTY_TOTAL());
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
			l_tOdr_UNIT_CD_ORG.add(((KU0010010Struct) list.get(i)).gettOdr_UNIT_CD_ORG());
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
			l_tOdr_SHIP_CNT.add(((KU0010010Struct) list.get(i)).gettOdr_SHIP_CNT());
		}
		return size;
	}
	public int setL2L_tOdr_CUR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_CUR_CD == null) {
			l_tOdr_CUR_CD = new ArrayList();
		} else {
			l_tOdr_CUR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_CUR_CD.add(((KU0010010Struct) list.get(i)).gettOdr_CUR_CD());
		}
		return size;
	}
	public int setL2L_tOdr_EXCH_TYP_R(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_tOdr_EXCH_TYP_R == null) {
			l_tOdr_EXCH_TYP_R = new ArrayList();
		} else {
			l_tOdr_EXCH_TYP_R.clear();
		}
		for (int i = 0; i < size; i++) {
			l_tOdr_EXCH_TYP_R.add(((KU0010010Struct) list.get(i)).gettOdr_EXCH_TYP_R());
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
			l_tOdr_IN_ODRNO.add(((KU0010010Struct) list.get(i)).gettOdr_IN_ODRNO());
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
			l_uptOdr_PART_DLV_COUNT.add(((KU0010010Struct) list.get(i)).getuptOdr_PART_DLV_COUNT());
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
			l_uptOdr_IN_ODRNO.add(((KU0010010Struct) list.get(i)).getuptOdr_IN_ODRNO());
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
			l_mItem_ITEM_CD.add(((KU0010010Struct) list.get(i)).getmItem_ITEM_CD());
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
			l_mItem_ITEM_NAME.add(((KU0010010Struct) list.get(i)).getmItem_ITEM_NAME());
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
			l_mItem_PRODUCT_TYP.add(((KU0010010Struct) list.get(i)).getmItem_PRODUCT_TYP());
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
			l_mItem_MRP_ODR_TYP.add(((KU0010010Struct) list.get(i)).getmItem_MRP_ODR_TYP());
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
			l_mItem_DRAW_CD.add(((KU0010010Struct) list.get(i)).getmItem_DRAW_CD());
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
			l_mItem_SPEC.add(((KU0010010Struct) list.get(i)).getmItem_SPEC());
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
			l_mItem_HIGH_LEVEL_NO.add(((KU0010010Struct) list.get(i)).getmItem_HIGH_LEVEL_NO());
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
			l_mItem_OUTSIDE_TYP.add(((KU0010010Struct) list.get(i)).getmItem_OUTSIDE_TYP());
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
			l_mItem_STOCK_UNIT_FLG.add(((KU0010010Struct) list.get(i)).getmItem_STOCK_UNIT_FLG());
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
			l_mItem_STOCK_UNIT.add(((KU0010010Struct) list.get(i)).getmItem_STOCK_UNIT());
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
			l_mItem_PKG_UNIT.add(((KU0010010Struct) list.get(i)).getmItem_PKG_UNIT());
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
			l_mItem_PKG_UNIT_QTY.add(((KU0010010Struct) list.get(i)).getmItem_PKG_UNIT_QTY());
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
			l_mItem_UNIT_QTY_TYP.add(((KU0010010Struct) list.get(i)).getmItem_UNIT_QTY_TYP());
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
			l_mItem_ODR_LT.add(((KU0010010Struct) list.get(i)).getmItem_ODR_LT());
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
			l_mItem_FIXED_LT.add(((KU0010010Struct) list.get(i)).getmItem_FIXED_LT());
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
			l_mItem_PROP_LT.add(((KU0010010Struct) list.get(i)).getmItem_PROP_LT());
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
			l_mItem_SAFETY_LT.add(((KU0010010Struct) list.get(i)).getmItem_SAFETY_LT());
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
			l_mItem_ISSUE_LT.add(((KU0010010Struct) list.get(i)).getmItem_ISSUE_LT());
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
			l_mItem_PROP_LOT_SIZE.add(((KU0010010Struct) list.get(i)).getmItem_PROP_LOT_SIZE());
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
			l_mItem_ITEM_SPOIL.add(((KU0010010Struct) list.get(i)).getmItem_ITEM_SPOIL());
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
			l_mItem_SAFETY_STOCK.add(((KU0010010Struct) list.get(i)).getmItem_SAFETY_STOCK());
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
			l_mItem_LOT_SIZING_TYP.add(((KU0010010Struct) list.get(i)).getmItem_LOT_SIZING_TYP());
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
			l_mItem_MAX_PERIOD.add(((KU0010010Struct) list.get(i)).getmItem_MAX_PERIOD());
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
			l_mItem_MAX_ODR_QTY.add(((KU0010010Struct) list.get(i)).getmItem_MAX_ODR_QTY());
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
			l_mItem_ODR_POINT.add(((KU0010010Struct) list.get(i)).getmItem_ODR_POINT());
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
			l_mItem_FIXED_ODR_QTY.add(((KU0010010Struct) list.get(i)).getmItem_FIXED_ODR_QTY());
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
			l_mItem_MIN_ODR_QTY.add(((KU0010010Struct) list.get(i)).getmItem_MIN_ODR_QTY());
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
			l_mItem_MUL_ODR_QTY.add(((KU0010010Struct) list.get(i)).getmItem_MUL_ODR_QTY());
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
			l_mItem_ISSUE_TYP.add(((KU0010010Struct) list.get(i)).getmItem_ISSUE_TYP());
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
			l_mItem_MPS_FLG.add(((KU0010010Struct) list.get(i)).getmItem_MPS_FLG());
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
			l_mItem_ACPT_INSPC_TYP.add(((KU0010010Struct) list.get(i)).getmItem_ACPT_INSPC_TYP());
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
			l_mItem_CLASIFICATION_CD.add(((KU0010010Struct) list.get(i)).getmItem_CLASIFICATION_CD());
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
			l_mItem_UNIT_WEIGHT.add(((KU0010010Struct) list.get(i)).getmItem_UNIT_WEIGHT());
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
			l_mItem_ABC_TYP.add(((KU0010010Struct) list.get(i)).getmItem_ABC_TYP());
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
			l_mItem_OPR_RSLT_TYP.add(((KU0010010Struct) list.get(i)).getmItem_OPR_RSLT_TYP());
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
			l_mItem_SPL_ITEM_TYP.add(((KU0010010Struct) list.get(i)).getmItem_SPL_ITEM_TYP());
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
			l_mItem_TAX_CD.add(((KU0010010Struct) list.get(i)).getmItem_TAX_CD());
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
			l_mItem_IN_ITEMCD.add(((KU0010010Struct) list.get(i)).getmItem_IN_ITEMCD());
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
			l_tOdrCtl_ODR_CTL_NO.add(((KU0010010Struct) list.get(i)).gettOdrCtl_ODR_CTL_NO());
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
			l_tOdrCtl_CUST_ITEM_NAME.add(((KU0010010Struct) list.get(i)).gettOdrCtl_CUST_ITEM_NAME());
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
			l_tOdrCtl_ITEM_NAME.add(((KU0010010Struct) list.get(i)).gettOdrCtl_ITEM_NAME());
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
			l_tOdrCtl_IN_ODRCTLNO.add(((KU0010010Struct) list.get(i)).gettOdrCtl_IN_ODRCTLNO());
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
			l_in_tShipSlip_SLIP_CD.add(((KU0010010Struct) list.get(i)).getin_tShipSlip_SLIP_CD());
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
			l_in_tShipSlip_ITEM_CD.add(((KU0010010Struct) list.get(i)).getin_tShipSlip_ITEM_CD());
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
			l_in_tShipSlip_CUST_ITEM_CD.add(((KU0010010Struct) list.get(i)).getin_tShipSlip_CUST_ITEM_CD());
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
			l_in_tShipSlip_PART_NAME.add(((KU0010010Struct) list.get(i)).getin_tShipSlip_PART_NAME());
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
			l_in_tShipSlip_CUST_ODR_NO.add(((KU0010010Struct) list.get(i)).getin_tShipSlip_CUST_ODR_NO());
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
			l_in_tShipSlip_CUST_CD.add(((KU0010010Struct) list.get(i)).getin_tShipSlip_CUST_CD());
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
			l_in_tShipSlip_CUST_NAME.add(((KU0010010Struct) list.get(i)).getin_tShipSlip_CUST_NAME());
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
			l_in_tShipSlip_DLV_LOC_CD.add(((KU0010010Struct) list.get(i)).getin_tShipSlip_DLV_LOC_CD());
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
			l_in_tShipSlip_DLV_LOC_NAME_KANJI.add(((KU0010010Struct) list.get(i)).getin_tShipSlip_DLV_LOC_NAME_KANJI());
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
			l_in_tShipSlip_CUS_DLV_KEY_CD.add(((KU0010010Struct) list.get(i)).getin_tShipSlip_CUS_DLV_KEY_CD());
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
			l_in_tShipSlip_DESINATED_SHIP_DATE.add(((KU0010010Struct) list.get(i)).getin_tShipSlip_DESINATED_SHIP_DATE());
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
			l_in_tShipSlip_DESINATED_DLV_DATE.add(((KU0010010Struct) list.get(i)).getin_tShipSlip_DESINATED_DLV_DATE());
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
			l_in_tShipSlip_SCDL_DLV_DATE.add(((KU0010010Struct) list.get(i)).getin_tShipSlip_SCDL_DLV_DATE());
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
			l_in_tShipSlip_SHIP_ODR_QTY.add(((KU0010010Struct) list.get(i)).getin_tShipSlip_SHIP_ODR_QTY());
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
			l_in_tShipSlip_UNIT_CD.add(((KU0010010Struct) list.get(i)).getin_tShipSlip_UNIT_CD());
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
			l_in_tShipSlip_UNIT_PRICE.add(((KU0010010Struct) list.get(i)).getin_tShipSlip_UNIT_PRICE());
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
			l_in_tShipSlip_SHIP_ODR_AMOUNT.add(((KU0010010Struct) list.get(i)).getin_tShipSlip_SHIP_ODR_AMOUNT());
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
			l_in_tShipSlip_TAX_AMOUNT.add(((KU0010010Struct) list.get(i)).getin_tShipSlip_TAX_AMOUNT());
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
			l_in_tShipSlip_INSPC_TYP.add(((KU0010010Struct) list.get(i)).getin_tShipSlip_INSPC_TYP());
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
			l_in_tShipSlip_CLIENT_REMARK_KANJI.add(((KU0010010Struct) list.get(i)).getin_tShipSlip_CLIENT_REMARK_KANJI());
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
			l_in_tShipSlip_CLIENT_BARCODE_INF.add(((KU0010010Struct) list.get(i)).getin_tShipSlip_CLIENT_BARCODE_INF());
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
			l_in_tShipSlip_PRINT_FLG.add(((KU0010010Struct) list.get(i)).getin_tShipSlip_PRINT_FLG());
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
			l_in_tShipSlip_DEL_FLG.add(((KU0010010Struct) list.get(i)).getin_tShipSlip_DEL_FLG());
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
			l_in_tShipSlip_BUYER_NAME.add(((KU0010010Struct) list.get(i)).getin_tShipSlip_BUYER_NAME());
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
			l_in_tShipSlip_PUCH_ODR_QTY_TOTAL.add(((KU0010010Struct) list.get(i)).getin_tShipSlip_PUCH_ODR_QTY_TOTAL());
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
			l_in_tShipSlip_DLV_ODR_QTY.add(((KU0010010Struct) list.get(i)).getin_tShipSlip_DLV_ODR_QTY());
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
			l_in_tShipSlip_SHIP_ODR_AMOUNT_TAX.add(((KU0010010Struct) list.get(i)).getin_tShipSlip_SHIP_ODR_AMOUNT_TAX());
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
			l_in_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT.add(((KU0010010Struct) list.get(i)).getin_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT());
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
			l_in_tShipSlip_INTERNAL_TAX_SALES_AMOUNT.add(((KU0010010Struct) list.get(i)).getin_tShipSlip_INTERNAL_TAX_SALES_AMOUNT());
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
			l_in_tShipSlip_TAXFREE_SALES_AMOUNT.add(((KU0010010Struct) list.get(i)).getin_tShipSlip_TAXFREE_SALES_AMOUNT());
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
			l_in_tShipSlip_TAX_CREDIT_SALES_AMOUNT.add(((KU0010010Struct) list.get(i)).getin_tShipSlip_TAX_CREDIT_SALES_AMOUNT());
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
			l_in_tShipSlip_EXTERNAL_TAX_AMOUNT.add(((KU0010010Struct) list.get(i)).getin_tShipSlip_EXTERNAL_TAX_AMOUNT());
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
			l_in_tShipSlip_INTERNAL_TAX_AMOUNT.add(((KU0010010Struct) list.get(i)).getin_tShipSlip_INTERNAL_TAX_AMOUNT());
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
			l_in_tShipSlip_TAX_AMOUNT_1.add(((KU0010010Struct) list.get(i)).getin_tShipSlip_TAX_AMOUNT_1());
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
			l_in_tShipSlip_TAX_AMOUNT_2.add(((KU0010010Struct) list.get(i)).getin_tShipSlip_TAX_AMOUNT_2());
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
			l_in_tShipSlip_TAX_AMOUNT_3.add(((KU0010010Struct) list.get(i)).getin_tShipSlip_TAX_AMOUNT_3());
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
			l_in_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT.add(((KU0010010Struct) list.get(i)).getin_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT());
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
			l_del_tShipSlip_IN_SLIPCD.add(((KU0010010Struct) list.get(i)).getdel_tShipSlip_IN_SLIPCD());
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
			l_mCustBase_COMPANY_CD.add(((KU0010010Struct) list.get(i)).getmCustBase_COMPANY_CD());
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
			l_mCustBase_CUST_CD.add(((KU0010010Struct) list.get(i)).getmCustBase_CUST_CD());
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
			l_mCustBase_DLV_LOC_CD.add(((KU0010010Struct) list.get(i)).getmCustBase_DLV_LOC_CD());
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
			l_mCustBase_DLV_LOC_NAME.add(((KU0010010Struct) list.get(i)).getmCustBase_DLV_LOC_NAME());
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
			l_mCustBase_DLV_LOC_KNAME.add(((KU0010010Struct) list.get(i)).getmCustBase_DLV_LOC_KNAME());
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
			l_mCustBase_DLV_LOC_ENAME.add(((KU0010010Struct) list.get(i)).getmCustBase_DLV_LOC_ENAME());
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
			l_mCustBase_ZIP_CD.add(((KU0010010Struct) list.get(i)).getmCustBase_ZIP_CD());
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
			l_mCustBase_ADDRESS_1.add(((KU0010010Struct) list.get(i)).getmCustBase_ADDRESS_1());
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
			l_mCustBase_ADDRESS_2.add(((KU0010010Struct) list.get(i)).getmCustBase_ADDRESS_2());
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
			l_mCustBase_ADDRESS_K_1.add(((KU0010010Struct) list.get(i)).getmCustBase_ADDRESS_K_1());
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
			l_mCustBase_ADDRESS_K_2.add(((KU0010010Struct) list.get(i)).getmCustBase_ADDRESS_K_2());
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
			l_mCustBase_TEL.add(((KU0010010Struct) list.get(i)).getmCustBase_TEL());
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
			l_mCustBase_FAX.add(((KU0010010Struct) list.get(i)).getmCustBase_FAX());
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
			l_mCustBase_SHIP_WH_CD.add(((KU0010010Struct) list.get(i)).getmCustBase_SHIP_WH_CD());
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
			l_mCustBase_TRANSPORT_CD.add(((KU0010010Struct) list.get(i)).getmCustBase_TRANSPORT_CD());
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
			l_mCustBase_TRANSPORT_NAME.add(((KU0010010Struct) list.get(i)).getmCustBase_TRANSPORT_NAME());
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
			l_mCustBase_TRANSPORT_LT.add(((KU0010010Struct) list.get(i)).getmCustBase_TRANSPORT_LT());
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
			l_mCustBase_CAL_NO.add(((KU0010010Struct) list.get(i)).getmCustBase_CAL_NO());
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
			l_mCustBase_TRANSPORT_TYP.add(((KU0010010Struct) list.get(i)).getmCustBase_TRANSPORT_TYP());
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
			l_mCustBase_DLV_START_TIME.add(((KU0010010Struct) list.get(i)).getmCustBase_DLV_START_TIME());
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
			l_mCustBase_DLV_END_TIME.add(((KU0010010Struct) list.get(i)).getmCustBase_DLV_END_TIME());
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
			l_mCustBase_AREA_CLASS_TYP1.add(((KU0010010Struct) list.get(i)).getmCustBase_AREA_CLASS_TYP1());
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
			l_mCustBase_AREA_CLASS_1.add(((KU0010010Struct) list.get(i)).getmCustBase_AREA_CLASS_1());
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
			l_mCustBase_AREA_CLASS_TYP2.add(((KU0010010Struct) list.get(i)).getmCustBase_AREA_CLASS_TYP2());
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
			l_mCustBase_AREA_CLASS_2.add(((KU0010010Struct) list.get(i)).getmCustBase_AREA_CLASS_2());
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
			l_mCustBase_AREA_CLASS_TYP3.add(((KU0010010Struct) list.get(i)).getmCustBase_AREA_CLASS_TYP3());
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
			l_mCustBase_AREA_CLASS_3.add(((KU0010010Struct) list.get(i)).getmCustBase_AREA_CLASS_3());
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
			l_mCustBase_REMARKS_1.add(((KU0010010Struct) list.get(i)).getmCustBase_REMARKS_1());
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
			l_mCustBase_REMARKS_2.add(((KU0010010Struct) list.get(i)).getmCustBase_REMARKS_2());
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
			l_mCustBase_REMARKS_3.add(((KU0010010Struct) list.get(i)).getmCustBase_REMARKS_3());
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
			l_mCustBase_DEPO_WH_CD.add(((KU0010010Struct) list.get(i)).getmCustBase_DEPO_WH_CD());
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
			l_mCustBase_IN_COMPANYCD.add(((KU0010010Struct) list.get(i)).getmCustBase_IN_COMPANYCD());
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
			l_mCustBase_IN_CUSTCD.add(((KU0010010Struct) list.get(i)).getmCustBase_IN_CUSTCD());
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
			l_mCustBase_IN_DLVLOCCD.add(((KU0010010Struct) list.get(i)).getmCustBase_IN_DLVLOCCD());
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
			l_mCust_COMPANY_CD.add(((KU0010010Struct) list.get(i)).getmCust_COMPANY_CD());
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
			l_mCust_CUST_CD.add(((KU0010010Struct) list.get(i)).getmCust_CUST_CD());
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
			l_mCust_CUST_NAME.add(((KU0010010Struct) list.get(i)).getmCust_CUST_NAME());
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
			l_mCust_CUST_KNAME.add(((KU0010010Struct) list.get(i)).getmCust_CUST_KNAME());
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
			l_mCust_OWN_ORG_CD.add(((KU0010010Struct) list.get(i)).getmCust_OWN_ORG_CD());
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
			l_mCust_OWN_PERSON_CD.add(((KU0010010Struct) list.get(i)).getmCust_OWN_PERSON_CD());
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
			l_mCust_CUR_CD.add(((KU0010010Struct) list.get(i)).getmCust_CUR_CD());
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
			l_mCust_EXCH_TYP.add(((KU0010010Struct) list.get(i)).getmCust_EXCH_TYP());
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
			l_mCust_TAX_APPLY_TYP.add(((KU0010010Struct) list.get(i)).getmCust_TAX_APPLY_TYP());
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
			l_mCust_TAX_CD.add(((KU0010010Struct) list.get(i)).getmCust_TAX_CD());
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
			l_mCust_TAX_CALC_TYP.add(((KU0010010Struct) list.get(i)).getmCust_TAX_CALC_TYP());
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
			l_mCust_PRICE_ROUND_TYP.add(((KU0010010Struct) list.get(i)).getmCust_PRICE_ROUND_TYP());
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
			l_mCust_DETAIL_ROUND_TYP.add(((KU0010010Struct) list.get(i)).getmCust_DETAIL_ROUND_TYP());
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
			l_mCust_UNCONFIRM_ODR_EFF_PRIOD.add(((KU0010010Struct) list.get(i)).getmCust_UNCONFIRM_ODR_EFF_PRIOD());
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
			l_mCust_UNCONFIRM_ODR_EFF_TERM_FLG.add(((KU0010010Struct) list.get(i)).getmCust_UNCONFIRM_ODR_EFF_TERM_FLG());
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
			l_mCust_EDI_CUST_VEND_CD.add(((KU0010010Struct) list.get(i)).getmCust_EDI_CUST_VEND_CD());
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
			l_mCust_PARTIAL_SHIP_INST_FLG.add(((KU0010010Struct) list.get(i)).getmCust_PARTIAL_SHIP_INST_FLG());
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
			l_mCust_DEPO_TYP.add(((KU0010010Struct) list.get(i)).getmCust_DEPO_TYP());
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
			l_mCust_INSPC_ACPT_TYP.add(((KU0010010Struct) list.get(i)).getmCust_INSPC_ACPT_TYP());
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
			l_mCust_IN_COMPANYCD.add(((KU0010010Struct) list.get(i)).getmCust_IN_COMPANYCD());
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
			l_mCust_IN_CUSTCD.add(((KU0010010Struct) list.get(i)).getmCust_IN_CUSTCD());
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
			l_tori_tAnsDlvDate_REST_SHIP_ODR_QTY.add(((KU0010010Struct) list.get(i)).gettori_tAnsDlvDate_REST_SHIP_ODR_QTY());
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
			l_tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG.add(((KU0010010Struct) list.get(i)).gettori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG());
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
			l_tori_tAnsDlvDate_IN_ODRNO.add(((KU0010010Struct) list.get(i)).gettori_tAnsDlvDate_IN_ODRNO());
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
			l_tori_tAnsDlvDate_IN_PARTDLVSEQNO.add(((KU0010010Struct) list.get(i)).gettori_tAnsDlvDate_IN_PARTDLVSEQNO());
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
			l_chkisWhCd_WH_CD.add(((KU0010010Struct) list.get(i)).getchkisWhCd_WH_CD());
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
			l_chkisWhCd_WH_TYP.add(((KU0010010Struct) list.get(i)).getchkisWhCd_WH_TYP());
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
			l_chkisWhCd_ITEM_CD.add(((KU0010010Struct) list.get(i)).getchkisWhCd_ITEM_CD());
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
			l_chkisWhCd_PBL_SHIP_QTY.add(((KU0010010Struct) list.get(i)).getchkisWhCd_PBL_SHIP_QTY());
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
			l_chkisWhCd_IN_ITEMCD.add(((KU0010010Struct) list.get(i)).getchkisWhCd_IN_ITEMCD());
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
			l_chkisWhCd_IN_WHCD.add(((KU0010010Struct) list.get(i)).getchkisWhCd_IN_WHCD());
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
			l_mUnitCost_UNIT_COST.add(((KU0010010Struct) list.get(i)).getmUnitCost_UNIT_COST());
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
			l_mUnitCost_EFF_PHASE_IN_DATE.add(((KU0010010Struct) list.get(i)).getmUnitCost_EFF_PHASE_IN_DATE());
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
			l_mUnitCost_IN_COMPANYCD.add(((KU0010010Struct) list.get(i)).getmUnitCost_IN_COMPANYCD());
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
			l_mUnitCost_IN_CUSTCD.add(((KU0010010Struct) list.get(i)).getmUnitCost_IN_CUSTCD());
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
			l_mUnitCost_IN_ITEMCD.add(((KU0010010Struct) list.get(i)).getmUnitCost_IN_ITEMCD());
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
			l_mUnitCost_IN_EFFPHASEINDATE.add(((KU0010010Struct) list.get(i)).getmUnitCost_IN_EFFPHASEINDATE());
		}
		return size;
	}
	public int setL2L_mWhWH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mWhWH_CD == null) {
			l_mWhWH_CD = new ArrayList();
		} else {
			l_mWhWH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mWhWH_CD.add(((KU0010010Struct) list.get(i)).getmWhWH_CD());
		}
		return size;
	}
	public int setL2L_mWhWH_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_mWhWH_NAME == null) {
			l_mWhWH_NAME = new ArrayList();
		} else {
			l_mWhWH_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_mWhWH_NAME.add(((KU0010010Struct) list.get(i)).getmWhWH_NAME());
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
			l_strTaxTAX_KBN.add(((KU0010010Struct) list.get(i)).getstrTaxTAX_KBN());
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
			l_strTaxOLD_TAX_1.add(((KU0010010Struct) list.get(i)).getstrTaxOLD_TAX_1());
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
			l_strTaxOLD_TAX_2.add(((KU0010010Struct) list.get(i)).getstrTaxOLD_TAX_2());
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
			l_strTaxOLD_TAX_3.add(((KU0010010Struct) list.get(i)).getstrTaxOLD_TAX_3());
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
			l_strTaxNEW_TAX_1.add(((KU0010010Struct) list.get(i)).getstrTaxNEW_TAX_1());
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
			l_strTaxNEW_TAX_2.add(((KU0010010Struct) list.get(i)).getstrTaxNEW_TAX_2());
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
			l_strTaxNEW_TAX_3.add(((KU0010010Struct) list.get(i)).getstrTaxNEW_TAX_3());
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
			l_strTaxSTART_DATE.add(((KU0010010Struct) list.get(i)).getstrTaxSTART_DATE());
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
			l_strTaxROUND_TYP.add(((KU0010010Struct) list.get(i)).getstrTaxROUND_TYP());
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
			l_strTaxIN_COMPANYCD.add(((KU0010010Struct) list.get(i)).getstrTaxIN_COMPANYCD());
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
			l_strTaxIN_CUSTCD.add(((KU0010010Struct) list.get(i)).getstrTaxIN_CUSTCD());
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
			l_g_CUST_ITEM_CD.add(((KU0010010Struct) list.get(i)).getg_CUST_ITEM_CD());
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
			l_strYotaku_WH_CD.add(((KU0010010Struct) list.get(i)).getstrYotaku_WH_CD());
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
			l_strYotaku_IN_WH_TYP.add(((KU0010010Struct) list.get(i)).getstrYotaku_IN_WH_TYP());
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
			l_strSYUKA_LT.add(((KU0010010Struct) list.get(i)).getstrSYUKA_LT());
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
			l_chkisinWhCd_WH_CD.add(((KU0010010Struct) list.get(i)).getchkisinWhCd_WH_CD());
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
			l_chkisinWhCd_WH_TYP.add(((KU0010010Struct) list.get(i)).getchkisinWhCd_WH_TYP());
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
			l_chkisinWhCd_WH_NAME.add(((KU0010010Struct) list.get(i)).getchkisinWhCd_WH_NAME());
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
			l_chkis_IN_WHCD.add(((KU0010010Struct) list.get(i)).getchkis_IN_WHCD());
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
			l_uptOdr_SHIP_CNT.add(((KU0010010Struct) list.get(i)).getuptOdr_SHIP_CNT());
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
			l_tHOLIDAY_FLG.add(((KU0010010Struct) list.get(i)).gettHOLIDAY_FLG());
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
			l_tWH_CD.add(((KU0010010Struct) list.get(i)).gettWH_CD());
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
			l_tCAL_DATE.add(((KU0010010Struct) list.get(i)).gettCAL_DATE());
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
			l_tDECIMAL_FIG.add(((KU0010010Struct) list.get(i)).gettDECIMAL_FIG());
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
			l_tCUR_CD.add(((KU0010010Struct) list.get(i)).gettCUR_CD());
		}
		return size;
	}
	public int setL2L_chkisWhCd_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_chkisWhCd_JOB_ODR_CD == null) {
			l_chkisWhCd_JOB_ODR_CD = new ArrayList();
		} else {
			l_chkisWhCd_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_chkisWhCd_JOB_ODR_CD.add(((KU0010010Struct) list.get(i)).getchkisWhCd_JOB_ODR_CD());
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
			l_serTJobOdr_JOB_ODR_CD.add(((KU0010010Struct) list.get(i)).getserTJobOdr_JOB_ODR_CD());
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
			l_serTJobOdr_ITEM_CD.add(((KU0010010Struct) list.get(i)).getserTJobOdr_ITEM_CD());
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
			l_tUnShipList_ACPT_ODR_CD.add(((KU0010010Struct) list.get(i)).gettUnShipList_ACPT_ODR_CD());
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
			l_tUnShipList_PART_DLV_SEQ_NO.add(((KU0010010Struct) list.get(i)).gettUnShipList_PART_DLV_SEQ_NO());
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
			l_strTAX_CD.add(((KU0010010Struct) list.get(i)).getstrTAX_CD());
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
			l_selMODIFY_COUNT.add(((KU0010010Struct) list.get(i)).getselMODIFY_COUNT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_g_PART_DLV_SEQ_NO = null;
		m_g_DIRECT_DLV_FLG = null;
		m_g_REST_SHIP_ODR_QTY = null;
		m_g_CUST_ANAME = null;
		m_g_ITEM_CD = null;
		m_k_MODE = null;
		m_h_RESULT = null;
		m_h_REST_SHIP_ODR_QTY = null;
		m_h_CUST_ANAME = null;
		m_h_CUST_ITEM_CD = null;
		m_h_ITEM_CD = null;
		m_h_AP_SECRTY_TYP = null;
		m_h_MODIFY_CNT = null;
		m_r_SEL_PTN1 = null;
		m_r_SEL_PTN2 = null;
		m_g_ODR_NO = null;
		m_g_SLIP_CD = null;
		m_g_DESINATED_SHIP_DATE = null;
		m_g_REST_SHIP_ODR_QTY2 = null;
		m_g_WH_CD = null;
		m_h_PARTIAL_SHIP_INST_FLG = null;
		m_g_STOCK_UNIT = null;
		m_g_STOCK_UNIT2 = null;
		m_g_WH_NAME = null;
		m_g_CUST_CD = null;
		m_g_CUST_ITEM_NAME = null;
		m_g_ITEM_NAME = null;
		m_g_CUST_ODR_NO = null;
		m_c_JOB_ODR_CD = null;
		m_h_MRP_ODR_TYP = null;
		m_h_JOB_ODR_CD = null;
		m_tMRP_ODR_TYP = null;
		m_chkisWhCd_IN_JOBODRCD = null;
		m_strCOMPANY_CD = null;
		m_strUSER_NAME = null;
		m_strPLANT_CD = null;
		m_strSECTION_CD = null;
		m_strPLANT_NAME = null;
		m_strPLANT_ANAME = null;
		m_strCAL_NO = null;
		m_strUSER_CD = null;
		m_strBUSINESS_OPR_DATE = null;
		m_strMAX_DISPLAY_ROWNUM = null;
		m_tAnsDlvDate_ODR_NO = null;
		m_tAnsDlvDate_PART_DLV_SEQ_NO = null;
		m_tAnsDlvDate_DESINATED_SHIP_DATE = null;
		m_tOdrODR_CTL_NO = null;
		m_tOdrCtl_CUST_ITEM_CD = null;
		m_tOdrCtl_ITEM_CD = null;
		m_mCust_CUST_ANAME = null;
		m_tAnsDlvDate_REST_SHIP_ODR_QTY = null;
		m_tOdr_TRANSPORT_TYP = null;
		m_tOdr_ODR_UNIT_PRICE = null;
		m_tOdr_SPCL_PRICE_TYP = null;
		m_tOdrCtl_CUST_CD = null;
		m_tOdr_PARTIAL_SHIP_INST_FLG = null;
		m_tAnsDlvDate_MODIFY_COUNT = null;
		m_tITEM_NAME = null;
		m_tSTOCK_UNIT = null;
		m_tUNIT_QTY_TYP = null;
		m_tWH_NAME = null;
		m_tSHIP_WH_CD = null;
		m_tCUST_CD = null;
		m_tCUST_ITEM_NAME = null;
		m_tCUST_ODR_NO = null;
		m_g_JOB_ODR_CD = null;
		m_sysMyCompany_IN_COMPANYCD = null;
		m_tAnsDlvDate_IN_ODRNO = null;
		m_tAnsDlvDate_IN_PARTDLVSEQNO = null;
		m_up_tAnsDlvDate_DESINATED_SHIP_DATE = null;
		m_up_tAnsDlvDate_REST_SHIP_ODR_QTY = null;
		m_up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG = null;
		m_up_tAnsDlvDate_IN_ODRNO = null;
		m_up_tAnsDlvDate_IN_PARTDLVSEQNO = null;
		m_tShipOdr_ODR_NO = null;
		m_tShipOdr_PART_DLV_SEQ_NO = null;
		m_tShipOdr_SLIP_CD = null;
		m_tShipOdr_DESINATED_SHIP_DATE = null;
		m_tShipOdr_SHIP_QTY = null;
		m_tShipOdr_ALLCT_WH_CD = null;
		m_tShipOdr_CUST_NAME = null;
		m_tShipOdr_CUST_ITEM_CD = null;
		m_tShipOdr_ITEM_CD = null;
		m_tShipOdr_JOB_ODR_CD = null;
		m_tShipOdrAnsDlvDate_REST_SHIP_ODR_QTY = null;
		m_tShipOdr_DEL_FLG = null;
		m_tShipOdr_DIRECT_DLV_FLG = null;
		m_tShipOdr_TRANSPORT_TYP = null;
		m_tShipOdr_MODIFY_COUNT = null;
		m_tDEPO_TRANSFER_PROC_FLG = null;
		m_tShipOdr_IN_SLIPCD = null;
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
		m_tOdr_TAX_APPLY_TYP = null;
		m_tOdr_TAX_CD = null;
		m_tOdr_TAX_CALC_TYP = null;
		m_tOdr_REMARKS = null;
		m_tOdr_ODR_ACPT_DATE = null;
		m_tOdr_SHIP_PLAN_REMAIN_QTY = null;
		m_tOdr_SHIP_PLAN_CMPLT_FLG = null;
		m_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG = null;
		m_tOdr_IF_CTL_NO = null;
		m_tOdr_ENTRY_TYP = null;
		m_tOdr_BUYER_NAME = null;
		m_tOdr_PUCH_ODR_QTY_TOTAL = null;
		m_tOdr_UNIT_CD_ORG = null;
		m_tOdr_SHIP_CNT = null;
		m_tOdr_CUR_CD = null;
		m_tOdr_EXCH_TYP_R = null;
		m_tOdr_IN_ODRNO = null;
		m_uptOdr_PART_DLV_COUNT = null;
		m_uptOdr_IN_ODRNO = null;
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
		m_tOdrCtl_ODR_CTL_NO = null;
		m_tOdrCtl_CUST_ITEM_NAME = null;
		m_tOdrCtl_ITEM_NAME = null;
		m_tOdrCtl_IN_ODRCTLNO = null;
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
		m_tori_tAnsDlvDate_REST_SHIP_ODR_QTY = null;
		m_tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG = null;
		m_tori_tAnsDlvDate_IN_ODRNO = null;
		m_tori_tAnsDlvDate_IN_PARTDLVSEQNO = null;
		m_chkisWhCd_WH_CD = null;
		m_chkisWhCd_WH_TYP = null;
		m_chkisWhCd_ITEM_CD = null;
		m_chkisWhCd_PBL_SHIP_QTY = null;
		m_chkisWhCd_IN_ITEMCD = null;
		m_chkisWhCd_IN_WHCD = null;
		m_mUnitCost_UNIT_COST = null;
		m_mUnitCost_EFF_PHASE_IN_DATE = null;
		m_mUnitCost_IN_COMPANYCD = null;
		m_mUnitCost_IN_CUSTCD = null;
		m_mUnitCost_IN_ITEMCD = null;
		m_mUnitCost_IN_EFFPHASEINDATE = null;
		m_mWhWH_CD = null;
		m_mWhWH_NAME = null;
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
		m_g_CUST_ITEM_CD = null;
		m_strYotaku_WH_CD = null;
		m_strYotaku_IN_WH_TYP = null;
		m_strSYUKA_LT = null;
		m_chkisinWhCd_WH_CD = null;
		m_chkisinWhCd_WH_TYP = null;
		m_chkisinWhCd_WH_NAME = null;
		m_chkis_IN_WHCD = null;
		m_uptOdr_SHIP_CNT = null;
		m_tHOLIDAY_FLG = null;
		m_tWH_CD = null;
		m_tCAL_DATE = null;
		m_tDECIMAL_FIG = null;
		m_tCUR_CD = null;
		m_chkisWhCd_JOB_ODR_CD = null;
		m_serTJobOdr_JOB_ODR_CD = null;
		m_serTJobOdr_ITEM_CD = null;
		m_tUnShipList_ACPT_ODR_CD = null;
		m_tUnShipList_PART_DLV_SEQ_NO = null;
		m_strTAX_CD = null;
		m_selMODIFY_COUNT = null;

		l_g_PART_DLV_SEQ_NO = null;
		l_g_DIRECT_DLV_FLG = null;
		l_g_REST_SHIP_ODR_QTY = null;
		l_g_CUST_ANAME = null;
		l_g_ITEM_CD = null;
		l_k_MODE = null;
		l_h_RESULT = null;
		l_h_REST_SHIP_ODR_QTY = null;
		l_h_CUST_ANAME = null;
		l_h_CUST_ITEM_CD = null;
		l_h_ITEM_CD = null;
		l_h_AP_SECRTY_TYP = null;
		l_h_MODIFY_CNT = null;
		l_r_SEL_PTN1 = null;
		l_r_SEL_PTN2 = null;
		l_g_ODR_NO = null;
		l_g_SLIP_CD = null;
		l_g_DESINATED_SHIP_DATE = null;
		l_g_REST_SHIP_ODR_QTY2 = null;
		l_g_WH_CD = null;
		l_h_PARTIAL_SHIP_INST_FLG = null;
		l_g_STOCK_UNIT = null;
		l_g_STOCK_UNIT2 = null;
		l_g_WH_NAME = null;
		l_g_CUST_CD = null;
		l_g_CUST_ITEM_NAME = null;
		l_g_ITEM_NAME = null;
		l_g_CUST_ODR_NO = null;
		l_c_JOB_ODR_CD = null;
		l_h_MRP_ODR_TYP = null;
		l_h_JOB_ODR_CD = null;
		l_tMRP_ODR_TYP = null;
		l_chkisWhCd_IN_JOBODRCD = null;
		l_strCOMPANY_CD = null;
		l_strUSER_NAME = null;
		l_strPLANT_CD = null;
		l_strSECTION_CD = null;
		l_strPLANT_NAME = null;
		l_strPLANT_ANAME = null;
		l_strCAL_NO = null;
		l_strUSER_CD = null;
		l_strBUSINESS_OPR_DATE = null;
		l_strMAX_DISPLAY_ROWNUM = null;
		l_tAnsDlvDate_ODR_NO = null;
		l_tAnsDlvDate_PART_DLV_SEQ_NO = null;
		l_tAnsDlvDate_DESINATED_SHIP_DATE = null;
		l_tOdrODR_CTL_NO = null;
		l_tOdrCtl_CUST_ITEM_CD = null;
		l_tOdrCtl_ITEM_CD = null;
		l_mCust_CUST_ANAME = null;
		l_tAnsDlvDate_REST_SHIP_ODR_QTY = null;
		l_tOdr_TRANSPORT_TYP = null;
		l_tOdr_ODR_UNIT_PRICE = null;
		l_tOdr_SPCL_PRICE_TYP = null;
		l_tOdrCtl_CUST_CD = null;
		l_tOdr_PARTIAL_SHIP_INST_FLG = null;
		l_tAnsDlvDate_MODIFY_COUNT = null;
		l_tITEM_NAME = null;
		l_tSTOCK_UNIT = null;
		l_tUNIT_QTY_TYP = null;
		l_tWH_NAME = null;
		l_tSHIP_WH_CD = null;
		l_tCUST_CD = null;
		l_tCUST_ITEM_NAME = null;
		l_tCUST_ODR_NO = null;
		l_g_JOB_ODR_CD = null;
		l_sysMyCompany_IN_COMPANYCD = null;
		l_tAnsDlvDate_IN_ODRNO = null;
		l_tAnsDlvDate_IN_PARTDLVSEQNO = null;
		l_up_tAnsDlvDate_DESINATED_SHIP_DATE = null;
		l_up_tAnsDlvDate_REST_SHIP_ODR_QTY = null;
		l_up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG = null;
		l_up_tAnsDlvDate_IN_ODRNO = null;
		l_up_tAnsDlvDate_IN_PARTDLVSEQNO = null;
		l_tShipOdr_ODR_NO = null;
		l_tShipOdr_PART_DLV_SEQ_NO = null;
		l_tShipOdr_SLIP_CD = null;
		l_tShipOdr_DESINATED_SHIP_DATE = null;
		l_tShipOdr_SHIP_QTY = null;
		l_tShipOdr_ALLCT_WH_CD = null;
		l_tShipOdr_CUST_NAME = null;
		l_tShipOdr_CUST_ITEM_CD = null;
		l_tShipOdr_ITEM_CD = null;
		l_tShipOdr_JOB_ODR_CD = null;
		l_tShipOdrAnsDlvDate_REST_SHIP_ODR_QTY = null;
		l_tShipOdr_DEL_FLG = null;
		l_tShipOdr_DIRECT_DLV_FLG = null;
		l_tShipOdr_TRANSPORT_TYP = null;
		l_tShipOdr_MODIFY_COUNT = null;
		l_tDEPO_TRANSFER_PROC_FLG = null;
		l_tShipOdr_IN_SLIPCD = null;
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
		l_tOdr_TAX_APPLY_TYP = null;
		l_tOdr_TAX_CD = null;
		l_tOdr_TAX_CALC_TYP = null;
		l_tOdr_REMARKS = null;
		l_tOdr_ODR_ACPT_DATE = null;
		l_tOdr_SHIP_PLAN_REMAIN_QTY = null;
		l_tOdr_SHIP_PLAN_CMPLT_FLG = null;
		l_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG = null;
		l_tOdr_IF_CTL_NO = null;
		l_tOdr_ENTRY_TYP = null;
		l_tOdr_BUYER_NAME = null;
		l_tOdr_PUCH_ODR_QTY_TOTAL = null;
		l_tOdr_UNIT_CD_ORG = null;
		l_tOdr_SHIP_CNT = null;
		l_tOdr_CUR_CD = null;
		l_tOdr_EXCH_TYP_R = null;
		l_tOdr_IN_ODRNO = null;
		l_uptOdr_PART_DLV_COUNT = null;
		l_uptOdr_IN_ODRNO = null;
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
		l_tOdrCtl_ODR_CTL_NO = null;
		l_tOdrCtl_CUST_ITEM_NAME = null;
		l_tOdrCtl_ITEM_NAME = null;
		l_tOdrCtl_IN_ODRCTLNO = null;
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
		l_tori_tAnsDlvDate_REST_SHIP_ODR_QTY = null;
		l_tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG = null;
		l_tori_tAnsDlvDate_IN_ODRNO = null;
		l_tori_tAnsDlvDate_IN_PARTDLVSEQNO = null;
		l_chkisWhCd_WH_CD = null;
		l_chkisWhCd_WH_TYP = null;
		l_chkisWhCd_ITEM_CD = null;
		l_chkisWhCd_PBL_SHIP_QTY = null;
		l_chkisWhCd_IN_ITEMCD = null;
		l_chkisWhCd_IN_WHCD = null;
		l_mUnitCost_UNIT_COST = null;
		l_mUnitCost_EFF_PHASE_IN_DATE = null;
		l_mUnitCost_IN_COMPANYCD = null;
		l_mUnitCost_IN_CUSTCD = null;
		l_mUnitCost_IN_ITEMCD = null;
		l_mUnitCost_IN_EFFPHASEINDATE = null;
		l_mWhWH_CD = null;
		l_mWhWH_NAME = null;
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
		l_g_CUST_ITEM_CD = null;
		l_strYotaku_WH_CD = null;
		l_strYotaku_IN_WH_TYP = null;
		l_strSYUKA_LT = null;
		l_chkisinWhCd_WH_CD = null;
		l_chkisinWhCd_WH_TYP = null;
		l_chkisinWhCd_WH_NAME = null;
		l_chkis_IN_WHCD = null;
		l_uptOdr_SHIP_CNT = null;
		l_tHOLIDAY_FLG = null;
		l_tWH_CD = null;
		l_tCAL_DATE = null;
		l_tDECIMAL_FIG = null;
		l_tCUR_CD = null;
		l_chkisWhCd_JOB_ODR_CD = null;
		l_serTJobOdr_JOB_ODR_CD = null;
		l_serTJobOdr_ITEM_CD = null;
		l_tUnShipList_ACPT_ODR_CD = null;
		l_tUnShipList_PART_DLV_SEQ_NO = null;
		l_strTAX_CD = null;
		l_selMODIFY_COUNT = null;

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
	 * medKU0010010�N���X�̕W���R���X�g���N�^
	 */
	public KU0010010Struct()
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
	public void setStruct(KU0010010Struct struct)
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
	public void setStructM(KU0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setg_PART_DLV_SEQ_NO(struct.getg_PART_DLV_SEQ_NO());
			this.setg_DIRECT_DLV_FLG(struct.getg_DIRECT_DLV_FLG());
			this.setg_REST_SHIP_ODR_QTY(struct.getg_REST_SHIP_ODR_QTY());
			this.setg_CUST_ANAME(struct.getg_CUST_ANAME());
			this.setg_ITEM_CD(struct.getg_ITEM_CD());
			this.setk_MODE(struct.getk_MODE());
			this.seth_RESULT(struct.geth_RESULT());
			this.seth_REST_SHIP_ODR_QTY(struct.geth_REST_SHIP_ODR_QTY());
			this.seth_CUST_ANAME(struct.geth_CUST_ANAME());
			this.seth_CUST_ITEM_CD(struct.geth_CUST_ITEM_CD());
			this.seth_ITEM_CD(struct.geth_ITEM_CD());
			this.seth_AP_SECRTY_TYP(struct.geth_AP_SECRTY_TYP());
			this.seth_MODIFY_CNT(struct.geth_MODIFY_CNT());
			this.setr_SEL_PTN1(struct.getr_SEL_PTN1());
			this.setr_SEL_PTN2(struct.getr_SEL_PTN2());
			this.setg_ODR_NO(struct.getg_ODR_NO());
			this.setg_SLIP_CD(struct.getg_SLIP_CD());
			this.setg_DESINATED_SHIP_DATE(struct.getg_DESINATED_SHIP_DATE());
			this.setg_REST_SHIP_ODR_QTY2(struct.getg_REST_SHIP_ODR_QTY2());
			this.setg_WH_CD(struct.getg_WH_CD());
			this.seth_PARTIAL_SHIP_INST_FLG(struct.geth_PARTIAL_SHIP_INST_FLG());
			this.setg_STOCK_UNIT(struct.getg_STOCK_UNIT());
			this.setg_STOCK_UNIT2(struct.getg_STOCK_UNIT2());
			this.setg_WH_NAME(struct.getg_WH_NAME());
			this.setg_CUST_CD(struct.getg_CUST_CD());
			this.setg_CUST_ITEM_NAME(struct.getg_CUST_ITEM_NAME());
			this.setg_ITEM_NAME(struct.getg_ITEM_NAME());
			this.setg_CUST_ODR_NO(struct.getg_CUST_ODR_NO());
			this.setc_JOB_ODR_CD(struct.getc_JOB_ODR_CD());
			this.seth_MRP_ODR_TYP(struct.geth_MRP_ODR_TYP());
			this.seth_JOB_ODR_CD(struct.geth_JOB_ODR_CD());
			this.settMRP_ODR_TYP(struct.gettMRP_ODR_TYP());
			this.setchkisWhCd_IN_JOBODRCD(struct.getchkisWhCd_IN_JOBODRCD());
			this.setstrCOMPANY_CD(struct.getstrCOMPANY_CD());
			this.setstrUSER_NAME(struct.getstrUSER_NAME());
			this.setstrPLANT_CD(struct.getstrPLANT_CD());
			this.setstrSECTION_CD(struct.getstrSECTION_CD());
			this.setstrPLANT_NAME(struct.getstrPLANT_NAME());
			this.setstrPLANT_ANAME(struct.getstrPLANT_ANAME());
			this.setstrCAL_NO(struct.getstrCAL_NO());
			this.setstrUSER_CD(struct.getstrUSER_CD());
			this.setstrBUSINESS_OPR_DATE(struct.getstrBUSINESS_OPR_DATE());
			this.setstrMAX_DISPLAY_ROWNUM(struct.getstrMAX_DISPLAY_ROWNUM());
			this.settAnsDlvDate_ODR_NO(struct.gettAnsDlvDate_ODR_NO());
			this.settAnsDlvDate_PART_DLV_SEQ_NO(struct.gettAnsDlvDate_PART_DLV_SEQ_NO());
			this.settAnsDlvDate_DESINATED_SHIP_DATE(struct.gettAnsDlvDate_DESINATED_SHIP_DATE());
			this.settOdrODR_CTL_NO(struct.gettOdrODR_CTL_NO());
			this.settOdrCtl_CUST_ITEM_CD(struct.gettOdrCtl_CUST_ITEM_CD());
			this.settOdrCtl_ITEM_CD(struct.gettOdrCtl_ITEM_CD());
			this.setmCust_CUST_ANAME(struct.getmCust_CUST_ANAME());
			this.settAnsDlvDate_REST_SHIP_ODR_QTY(struct.gettAnsDlvDate_REST_SHIP_ODR_QTY());
			this.settOdr_TRANSPORT_TYP(struct.gettOdr_TRANSPORT_TYP());
			this.settOdr_ODR_UNIT_PRICE(struct.gettOdr_ODR_UNIT_PRICE());
			this.settOdr_SPCL_PRICE_TYP(struct.gettOdr_SPCL_PRICE_TYP());
			this.settOdrCtl_CUST_CD(struct.gettOdrCtl_CUST_CD());
			this.settOdr_PARTIAL_SHIP_INST_FLG(struct.gettOdr_PARTIAL_SHIP_INST_FLG());
			this.settAnsDlvDate_MODIFY_COUNT(struct.gettAnsDlvDate_MODIFY_COUNT());
			this.settITEM_NAME(struct.gettITEM_NAME());
			this.settSTOCK_UNIT(struct.gettSTOCK_UNIT());
			this.settUNIT_QTY_TYP(struct.gettUNIT_QTY_TYP());
			this.settWH_NAME(struct.gettWH_NAME());
			this.settSHIP_WH_CD(struct.gettSHIP_WH_CD());
			this.settCUST_CD(struct.gettCUST_CD());
			this.settCUST_ITEM_NAME(struct.gettCUST_ITEM_NAME());
			this.settCUST_ODR_NO(struct.gettCUST_ODR_NO());
			this.setg_JOB_ODR_CD(struct.getg_JOB_ODR_CD());
			this.setsysMyCompany_IN_COMPANYCD(struct.getsysMyCompany_IN_COMPANYCD());
			this.settAnsDlvDate_IN_ODRNO(struct.gettAnsDlvDate_IN_ODRNO());
			this.settAnsDlvDate_IN_PARTDLVSEQNO(struct.gettAnsDlvDate_IN_PARTDLVSEQNO());
			this.setup_tAnsDlvDate_DESINATED_SHIP_DATE(struct.getup_tAnsDlvDate_DESINATED_SHIP_DATE());
			this.setup_tAnsDlvDate_REST_SHIP_ODR_QTY(struct.getup_tAnsDlvDate_REST_SHIP_ODR_QTY());
			this.setup_tAnsDlvDate_SHIP_ODR_CMPLT_FLG(struct.getup_tAnsDlvDate_SHIP_ODR_CMPLT_FLG());
			this.setup_tAnsDlvDate_IN_ODRNO(struct.getup_tAnsDlvDate_IN_ODRNO());
			this.setup_tAnsDlvDate_IN_PARTDLVSEQNO(struct.getup_tAnsDlvDate_IN_PARTDLVSEQNO());
			this.settShipOdr_ODR_NO(struct.gettShipOdr_ODR_NO());
			this.settShipOdr_PART_DLV_SEQ_NO(struct.gettShipOdr_PART_DLV_SEQ_NO());
			this.settShipOdr_SLIP_CD(struct.gettShipOdr_SLIP_CD());
			this.settShipOdr_DESINATED_SHIP_DATE(struct.gettShipOdr_DESINATED_SHIP_DATE());
			this.settShipOdr_SHIP_QTY(struct.gettShipOdr_SHIP_QTY());
			this.settShipOdr_ALLCT_WH_CD(struct.gettShipOdr_ALLCT_WH_CD());
			this.settShipOdr_CUST_NAME(struct.gettShipOdr_CUST_NAME());
			this.settShipOdr_CUST_ITEM_CD(struct.gettShipOdr_CUST_ITEM_CD());
			this.settShipOdr_ITEM_CD(struct.gettShipOdr_ITEM_CD());
			this.settShipOdr_JOB_ODR_CD(struct.gettShipOdr_JOB_ODR_CD());
			this.settShipOdrAnsDlvDate_REST_SHIP_ODR_QTY(struct.gettShipOdrAnsDlvDate_REST_SHIP_ODR_QTY());
			this.settShipOdr_DEL_FLG(struct.gettShipOdr_DEL_FLG());
			this.settShipOdr_DIRECT_DLV_FLG(struct.gettShipOdr_DIRECT_DLV_FLG());
			this.settShipOdr_TRANSPORT_TYP(struct.gettShipOdr_TRANSPORT_TYP());
			this.settShipOdr_MODIFY_COUNT(struct.gettShipOdr_MODIFY_COUNT());
			this.settDEPO_TRANSFER_PROC_FLG(struct.gettDEPO_TRANSFER_PROC_FLG());
			this.settShipOdr_IN_SLIPCD(struct.gettShipOdr_IN_SLIPCD());
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
			this.settOdr_TAX_APPLY_TYP(struct.gettOdr_TAX_APPLY_TYP());
			this.settOdr_TAX_CD(struct.gettOdr_TAX_CD());
			this.settOdr_TAX_CALC_TYP(struct.gettOdr_TAX_CALC_TYP());
			this.settOdr_REMARKS(struct.gettOdr_REMARKS());
			this.settOdr_ODR_ACPT_DATE(struct.gettOdr_ODR_ACPT_DATE());
			this.settOdr_SHIP_PLAN_REMAIN_QTY(struct.gettOdr_SHIP_PLAN_REMAIN_QTY());
			this.settOdr_SHIP_PLAN_CMPLT_FLG(struct.gettOdr_SHIP_PLAN_CMPLT_FLG());
			this.settOdr_UNCONFIRMED_ODR_EFF_OVR_FLG(struct.gettOdr_UNCONFIRMED_ODR_EFF_OVR_FLG());
			this.settOdr_IF_CTL_NO(struct.gettOdr_IF_CTL_NO());
			this.settOdr_ENTRY_TYP(struct.gettOdr_ENTRY_TYP());
			this.settOdr_BUYER_NAME(struct.gettOdr_BUYER_NAME());
			this.settOdr_PUCH_ODR_QTY_TOTAL(struct.gettOdr_PUCH_ODR_QTY_TOTAL());
			this.settOdr_UNIT_CD_ORG(struct.gettOdr_UNIT_CD_ORG());
			this.settOdr_SHIP_CNT(struct.gettOdr_SHIP_CNT());
			this.settOdr_CUR_CD(struct.gettOdr_CUR_CD());
			this.settOdr_EXCH_TYP_R(struct.gettOdr_EXCH_TYP_R());
			this.settOdr_IN_ODRNO(struct.gettOdr_IN_ODRNO());
			this.setuptOdr_PART_DLV_COUNT(struct.getuptOdr_PART_DLV_COUNT());
			this.setuptOdr_IN_ODRNO(struct.getuptOdr_IN_ODRNO());
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
			this.settOdrCtl_ODR_CTL_NO(struct.gettOdrCtl_ODR_CTL_NO());
			this.settOdrCtl_CUST_ITEM_NAME(struct.gettOdrCtl_CUST_ITEM_NAME());
			this.settOdrCtl_ITEM_NAME(struct.gettOdrCtl_ITEM_NAME());
			this.settOdrCtl_IN_ODRCTLNO(struct.gettOdrCtl_IN_ODRCTLNO());
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
			this.settori_tAnsDlvDate_REST_SHIP_ODR_QTY(struct.gettori_tAnsDlvDate_REST_SHIP_ODR_QTY());
			this.settori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG(struct.gettori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG());
			this.settori_tAnsDlvDate_IN_ODRNO(struct.gettori_tAnsDlvDate_IN_ODRNO());
			this.settori_tAnsDlvDate_IN_PARTDLVSEQNO(struct.gettori_tAnsDlvDate_IN_PARTDLVSEQNO());
			this.setchkisWhCd_WH_CD(struct.getchkisWhCd_WH_CD());
			this.setchkisWhCd_WH_TYP(struct.getchkisWhCd_WH_TYP());
			this.setchkisWhCd_ITEM_CD(struct.getchkisWhCd_ITEM_CD());
			this.setchkisWhCd_PBL_SHIP_QTY(struct.getchkisWhCd_PBL_SHIP_QTY());
			this.setchkisWhCd_IN_ITEMCD(struct.getchkisWhCd_IN_ITEMCD());
			this.setchkisWhCd_IN_WHCD(struct.getchkisWhCd_IN_WHCD());
			this.setmUnitCost_UNIT_COST(struct.getmUnitCost_UNIT_COST());
			this.setmUnitCost_EFF_PHASE_IN_DATE(struct.getmUnitCost_EFF_PHASE_IN_DATE());
			this.setmUnitCost_IN_COMPANYCD(struct.getmUnitCost_IN_COMPANYCD());
			this.setmUnitCost_IN_CUSTCD(struct.getmUnitCost_IN_CUSTCD());
			this.setmUnitCost_IN_ITEMCD(struct.getmUnitCost_IN_ITEMCD());
			this.setmUnitCost_IN_EFFPHASEINDATE(struct.getmUnitCost_IN_EFFPHASEINDATE());
			this.setmWhWH_CD(struct.getmWhWH_CD());
			this.setmWhWH_NAME(struct.getmWhWH_NAME());
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
			this.setg_CUST_ITEM_CD(struct.getg_CUST_ITEM_CD());
			this.setstrYotaku_WH_CD(struct.getstrYotaku_WH_CD());
			this.setstrYotaku_IN_WH_TYP(struct.getstrYotaku_IN_WH_TYP());
			this.setstrSYUKA_LT(struct.getstrSYUKA_LT());
			this.setchkisinWhCd_WH_CD(struct.getchkisinWhCd_WH_CD());
			this.setchkisinWhCd_WH_TYP(struct.getchkisinWhCd_WH_TYP());
			this.setchkisinWhCd_WH_NAME(struct.getchkisinWhCd_WH_NAME());
			this.setchkis_IN_WHCD(struct.getchkis_IN_WHCD());
			this.setuptOdr_SHIP_CNT(struct.getuptOdr_SHIP_CNT());
			this.settHOLIDAY_FLG(struct.gettHOLIDAY_FLG());
			this.settWH_CD(struct.gettWH_CD());
			this.settCAL_DATE(struct.gettCAL_DATE());
			this.settDECIMAL_FIG(struct.gettDECIMAL_FIG());
			this.settCUR_CD(struct.gettCUR_CD());
			this.setchkisWhCd_JOB_ODR_CD(struct.getchkisWhCd_JOB_ODR_CD());
			this.setserTJobOdr_JOB_ODR_CD(struct.getserTJobOdr_JOB_ODR_CD());
			this.setserTJobOdr_ITEM_CD(struct.getserTJobOdr_ITEM_CD());
			this.settUnShipList_ACPT_ODR_CD(struct.gettUnShipList_ACPT_ODR_CD());
			this.settUnShipList_PART_DLV_SEQ_NO(struct.gettUnShipList_PART_DLV_SEQ_NO());
			this.setstrTAX_CD(struct.getstrTAX_CD());
			this.setselMODIFY_COUNT(struct.getselMODIFY_COUNT());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(KU0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_g_PART_DLV_SEQ_NO(struct.getList_g_PART_DLV_SEQ_NO());
			this.setList_g_DIRECT_DLV_FLG(struct.getList_g_DIRECT_DLV_FLG());
			this.setList_g_REST_SHIP_ODR_QTY(struct.getList_g_REST_SHIP_ODR_QTY());
			this.setList_g_CUST_ANAME(struct.getList_g_CUST_ANAME());
			this.setList_g_ITEM_CD(struct.getList_g_ITEM_CD());
			this.setList_k_MODE(struct.getList_k_MODE());
			this.setList_h_RESULT(struct.getList_h_RESULT());
			this.setList_h_REST_SHIP_ODR_QTY(struct.getList_h_REST_SHIP_ODR_QTY());
			this.setList_h_CUST_ANAME(struct.getList_h_CUST_ANAME());
			this.setList_h_CUST_ITEM_CD(struct.getList_h_CUST_ITEM_CD());
			this.setList_h_ITEM_CD(struct.getList_h_ITEM_CD());
			this.setList_h_AP_SECRTY_TYP(struct.getList_h_AP_SECRTY_TYP());
			this.setList_h_MODIFY_CNT(struct.getList_h_MODIFY_CNT());
			this.setList_r_SEL_PTN1(struct.getList_r_SEL_PTN1());
			this.setList_r_SEL_PTN2(struct.getList_r_SEL_PTN2());
			this.setList_g_ODR_NO(struct.getList_g_ODR_NO());
			this.setList_g_SLIP_CD(struct.getList_g_SLIP_CD());
			this.setList_g_DESINATED_SHIP_DATE(struct.getList_g_DESINATED_SHIP_DATE());
			this.setList_g_REST_SHIP_ODR_QTY2(struct.getList_g_REST_SHIP_ODR_QTY2());
			this.setList_g_WH_CD(struct.getList_g_WH_CD());
			this.setList_h_PARTIAL_SHIP_INST_FLG(struct.getList_h_PARTIAL_SHIP_INST_FLG());
			this.setList_g_STOCK_UNIT(struct.getList_g_STOCK_UNIT());
			this.setList_g_STOCK_UNIT2(struct.getList_g_STOCK_UNIT2());
			this.setList_g_WH_NAME(struct.getList_g_WH_NAME());
			this.setList_g_CUST_CD(struct.getList_g_CUST_CD());
			this.setList_g_CUST_ITEM_NAME(struct.getList_g_CUST_ITEM_NAME());
			this.setList_g_ITEM_NAME(struct.getList_g_ITEM_NAME());
			this.setList_g_CUST_ODR_NO(struct.getList_g_CUST_ODR_NO());
			this.setList_c_JOB_ODR_CD(struct.getList_c_JOB_ODR_CD());
			this.setList_h_MRP_ODR_TYP(struct.getList_h_MRP_ODR_TYP());
			this.setList_h_JOB_ODR_CD(struct.getList_h_JOB_ODR_CD());
			this.setList_tMRP_ODR_TYP(struct.getList_tMRP_ODR_TYP());
			this.setList_chkisWhCd_IN_JOBODRCD(struct.getList_chkisWhCd_IN_JOBODRCD());
			this.setList_strCOMPANY_CD(struct.getList_strCOMPANY_CD());
			this.setList_strUSER_NAME(struct.getList_strUSER_NAME());
			this.setList_strPLANT_CD(struct.getList_strPLANT_CD());
			this.setList_strSECTION_CD(struct.getList_strSECTION_CD());
			this.setList_strPLANT_NAME(struct.getList_strPLANT_NAME());
			this.setList_strPLANT_ANAME(struct.getList_strPLANT_ANAME());
			this.setList_strCAL_NO(struct.getList_strCAL_NO());
			this.setList_strUSER_CD(struct.getList_strUSER_CD());
			this.setList_strBUSINESS_OPR_DATE(struct.getList_strBUSINESS_OPR_DATE());
			this.setList_strMAX_DISPLAY_ROWNUM(struct.getList_strMAX_DISPLAY_ROWNUM());
			this.setList_tAnsDlvDate_ODR_NO(struct.getList_tAnsDlvDate_ODR_NO());
			this.setList_tAnsDlvDate_PART_DLV_SEQ_NO(struct.getList_tAnsDlvDate_PART_DLV_SEQ_NO());
			this.setList_tAnsDlvDate_DESINATED_SHIP_DATE(struct.getList_tAnsDlvDate_DESINATED_SHIP_DATE());
			this.setList_tOdrODR_CTL_NO(struct.getList_tOdrODR_CTL_NO());
			this.setList_tOdrCtl_CUST_ITEM_CD(struct.getList_tOdrCtl_CUST_ITEM_CD());
			this.setList_tOdrCtl_ITEM_CD(struct.getList_tOdrCtl_ITEM_CD());
			this.setList_mCust_CUST_ANAME(struct.getList_mCust_CUST_ANAME());
			this.setList_tAnsDlvDate_REST_SHIP_ODR_QTY(struct.getList_tAnsDlvDate_REST_SHIP_ODR_QTY());
			this.setList_tOdr_TRANSPORT_TYP(struct.getList_tOdr_TRANSPORT_TYP());
			this.setList_tOdr_ODR_UNIT_PRICE(struct.getList_tOdr_ODR_UNIT_PRICE());
			this.setList_tOdr_SPCL_PRICE_TYP(struct.getList_tOdr_SPCL_PRICE_TYP());
			this.setList_tOdrCtl_CUST_CD(struct.getList_tOdrCtl_CUST_CD());
			this.setList_tOdr_PARTIAL_SHIP_INST_FLG(struct.getList_tOdr_PARTIAL_SHIP_INST_FLG());
			this.setList_tAnsDlvDate_MODIFY_COUNT(struct.getList_tAnsDlvDate_MODIFY_COUNT());
			this.setList_tITEM_NAME(struct.getList_tITEM_NAME());
			this.setList_tSTOCK_UNIT(struct.getList_tSTOCK_UNIT());
			this.setList_tUNIT_QTY_TYP(struct.getList_tUNIT_QTY_TYP());
			this.setList_tWH_NAME(struct.getList_tWH_NAME());
			this.setList_tSHIP_WH_CD(struct.getList_tSHIP_WH_CD());
			this.setList_tCUST_CD(struct.getList_tCUST_CD());
			this.setList_tCUST_ITEM_NAME(struct.getList_tCUST_ITEM_NAME());
			this.setList_tCUST_ODR_NO(struct.getList_tCUST_ODR_NO());
			this.setList_g_JOB_ODR_CD(struct.getList_g_JOB_ODR_CD());
			this.setList_sysMyCompany_IN_COMPANYCD(struct.getList_sysMyCompany_IN_COMPANYCD());
			this.setList_tAnsDlvDate_IN_ODRNO(struct.getList_tAnsDlvDate_IN_ODRNO());
			this.setList_tAnsDlvDate_IN_PARTDLVSEQNO(struct.getList_tAnsDlvDate_IN_PARTDLVSEQNO());
			this.setList_up_tAnsDlvDate_DESINATED_SHIP_DATE(struct.getList_up_tAnsDlvDate_DESINATED_SHIP_DATE());
			this.setList_up_tAnsDlvDate_REST_SHIP_ODR_QTY(struct.getList_up_tAnsDlvDate_REST_SHIP_ODR_QTY());
			this.setList_up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG(struct.getList_up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG());
			this.setList_up_tAnsDlvDate_IN_ODRNO(struct.getList_up_tAnsDlvDate_IN_ODRNO());
			this.setList_up_tAnsDlvDate_IN_PARTDLVSEQNO(struct.getList_up_tAnsDlvDate_IN_PARTDLVSEQNO());
			this.setList_tShipOdr_ODR_NO(struct.getList_tShipOdr_ODR_NO());
			this.setList_tShipOdr_PART_DLV_SEQ_NO(struct.getList_tShipOdr_PART_DLV_SEQ_NO());
			this.setList_tShipOdr_SLIP_CD(struct.getList_tShipOdr_SLIP_CD());
			this.setList_tShipOdr_DESINATED_SHIP_DATE(struct.getList_tShipOdr_DESINATED_SHIP_DATE());
			this.setList_tShipOdr_SHIP_QTY(struct.getList_tShipOdr_SHIP_QTY());
			this.setList_tShipOdr_ALLCT_WH_CD(struct.getList_tShipOdr_ALLCT_WH_CD());
			this.setList_tShipOdr_CUST_NAME(struct.getList_tShipOdr_CUST_NAME());
			this.setList_tShipOdr_CUST_ITEM_CD(struct.getList_tShipOdr_CUST_ITEM_CD());
			this.setList_tShipOdr_ITEM_CD(struct.getList_tShipOdr_ITEM_CD());
			this.setList_tShipOdr_JOB_ODR_CD(struct.getList_tShipOdr_JOB_ODR_CD());
			this.setList_tShipOdrAnsDlvDate_REST_SHIP_ODR_QTY(struct.getList_tShipOdrAnsDlvDate_REST_SHIP_ODR_QTY());
			this.setList_tShipOdr_DEL_FLG(struct.getList_tShipOdr_DEL_FLG());
			this.setList_tShipOdr_DIRECT_DLV_FLG(struct.getList_tShipOdr_DIRECT_DLV_FLG());
			this.setList_tShipOdr_TRANSPORT_TYP(struct.getList_tShipOdr_TRANSPORT_TYP());
			this.setList_tShipOdr_MODIFY_COUNT(struct.getList_tShipOdr_MODIFY_COUNT());
			this.setList_tDEPO_TRANSFER_PROC_FLG(struct.getList_tDEPO_TRANSFER_PROC_FLG());
			this.setList_tShipOdr_IN_SLIPCD(struct.getList_tShipOdr_IN_SLIPCD());
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
			this.setList_tOdr_TAX_APPLY_TYP(struct.getList_tOdr_TAX_APPLY_TYP());
			this.setList_tOdr_TAX_CD(struct.getList_tOdr_TAX_CD());
			this.setList_tOdr_TAX_CALC_TYP(struct.getList_tOdr_TAX_CALC_TYP());
			this.setList_tOdr_REMARKS(struct.getList_tOdr_REMARKS());
			this.setList_tOdr_ODR_ACPT_DATE(struct.getList_tOdr_ODR_ACPT_DATE());
			this.setList_tOdr_SHIP_PLAN_REMAIN_QTY(struct.getList_tOdr_SHIP_PLAN_REMAIN_QTY());
			this.setList_tOdr_SHIP_PLAN_CMPLT_FLG(struct.getList_tOdr_SHIP_PLAN_CMPLT_FLG());
			this.setList_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG(struct.getList_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG());
			this.setList_tOdr_IF_CTL_NO(struct.getList_tOdr_IF_CTL_NO());
			this.setList_tOdr_ENTRY_TYP(struct.getList_tOdr_ENTRY_TYP());
			this.setList_tOdr_BUYER_NAME(struct.getList_tOdr_BUYER_NAME());
			this.setList_tOdr_PUCH_ODR_QTY_TOTAL(struct.getList_tOdr_PUCH_ODR_QTY_TOTAL());
			this.setList_tOdr_UNIT_CD_ORG(struct.getList_tOdr_UNIT_CD_ORG());
			this.setList_tOdr_SHIP_CNT(struct.getList_tOdr_SHIP_CNT());
			this.setList_tOdr_CUR_CD(struct.getList_tOdr_CUR_CD());
			this.setList_tOdr_EXCH_TYP_R(struct.getList_tOdr_EXCH_TYP_R());
			this.setList_tOdr_IN_ODRNO(struct.getList_tOdr_IN_ODRNO());
			this.setList_uptOdr_PART_DLV_COUNT(struct.getList_uptOdr_PART_DLV_COUNT());
			this.setList_uptOdr_IN_ODRNO(struct.getList_uptOdr_IN_ODRNO());
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
			this.setList_tOdrCtl_ODR_CTL_NO(struct.getList_tOdrCtl_ODR_CTL_NO());
			this.setList_tOdrCtl_CUST_ITEM_NAME(struct.getList_tOdrCtl_CUST_ITEM_NAME());
			this.setList_tOdrCtl_ITEM_NAME(struct.getList_tOdrCtl_ITEM_NAME());
			this.setList_tOdrCtl_IN_ODRCTLNO(struct.getList_tOdrCtl_IN_ODRCTLNO());
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
			this.setList_tori_tAnsDlvDate_REST_SHIP_ODR_QTY(struct.getList_tori_tAnsDlvDate_REST_SHIP_ODR_QTY());
			this.setList_tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG(struct.getList_tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG());
			this.setList_tori_tAnsDlvDate_IN_ODRNO(struct.getList_tori_tAnsDlvDate_IN_ODRNO());
			this.setList_tori_tAnsDlvDate_IN_PARTDLVSEQNO(struct.getList_tori_tAnsDlvDate_IN_PARTDLVSEQNO());
			this.setList_chkisWhCd_WH_CD(struct.getList_chkisWhCd_WH_CD());
			this.setList_chkisWhCd_WH_TYP(struct.getList_chkisWhCd_WH_TYP());
			this.setList_chkisWhCd_ITEM_CD(struct.getList_chkisWhCd_ITEM_CD());
			this.setList_chkisWhCd_PBL_SHIP_QTY(struct.getList_chkisWhCd_PBL_SHIP_QTY());
			this.setList_chkisWhCd_IN_ITEMCD(struct.getList_chkisWhCd_IN_ITEMCD());
			this.setList_chkisWhCd_IN_WHCD(struct.getList_chkisWhCd_IN_WHCD());
			this.setList_mUnitCost_UNIT_COST(struct.getList_mUnitCost_UNIT_COST());
			this.setList_mUnitCost_EFF_PHASE_IN_DATE(struct.getList_mUnitCost_EFF_PHASE_IN_DATE());
			this.setList_mUnitCost_IN_COMPANYCD(struct.getList_mUnitCost_IN_COMPANYCD());
			this.setList_mUnitCost_IN_CUSTCD(struct.getList_mUnitCost_IN_CUSTCD());
			this.setList_mUnitCost_IN_ITEMCD(struct.getList_mUnitCost_IN_ITEMCD());
			this.setList_mUnitCost_IN_EFFPHASEINDATE(struct.getList_mUnitCost_IN_EFFPHASEINDATE());
			this.setList_mWhWH_CD(struct.getList_mWhWH_CD());
			this.setList_mWhWH_NAME(struct.getList_mWhWH_NAME());
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
			this.setList_g_CUST_ITEM_CD(struct.getList_g_CUST_ITEM_CD());
			this.setList_strYotaku_WH_CD(struct.getList_strYotaku_WH_CD());
			this.setList_strYotaku_IN_WH_TYP(struct.getList_strYotaku_IN_WH_TYP());
			this.setList_strSYUKA_LT(struct.getList_strSYUKA_LT());
			this.setList_chkisinWhCd_WH_CD(struct.getList_chkisinWhCd_WH_CD());
			this.setList_chkisinWhCd_WH_TYP(struct.getList_chkisinWhCd_WH_TYP());
			this.setList_chkisinWhCd_WH_NAME(struct.getList_chkisinWhCd_WH_NAME());
			this.setList_chkis_IN_WHCD(struct.getList_chkis_IN_WHCD());
			this.setList_uptOdr_SHIP_CNT(struct.getList_uptOdr_SHIP_CNT());
			this.setList_tHOLIDAY_FLG(struct.getList_tHOLIDAY_FLG());
			this.setList_tWH_CD(struct.getList_tWH_CD());
			this.setList_tCAL_DATE(struct.getList_tCAL_DATE());
			this.setList_tDECIMAL_FIG(struct.getList_tDECIMAL_FIG());
			this.setList_tCUR_CD(struct.getList_tCUR_CD());
			this.setList_chkisWhCd_JOB_ODR_CD(struct.getList_chkisWhCd_JOB_ODR_CD());
			this.setList_serTJobOdr_JOB_ODR_CD(struct.getList_serTJobOdr_JOB_ODR_CD());
			this.setList_serTJobOdr_ITEM_CD(struct.getList_serTJobOdr_ITEM_CD());
			this.setList_tUnShipList_ACPT_ODR_CD(struct.getList_tUnShipList_ACPT_ODR_CD());
			this.setList_tUnShipList_PART_DLV_SEQ_NO(struct.getList_tUnShipList_PART_DLV_SEQ_NO());
			this.setList_strTAX_CD(struct.getList_strTAX_CD());
			this.setList_selMODIFY_COUNT(struct.getList_selMODIFY_COUNT());
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
	// �� 1 �ϐ������l�F i_g_PART_DLV_SEQ_NO


	final static String i_g_PART_DLV_SEQ_NO = null;

	// �� 2 �ϐ������l�F i_g_DIRECT_DLV_FLG


	final static String i_g_DIRECT_DLV_FLG = null;

	// �� 3 �ϐ������l�F i_g_REST_SHIP_ODR_QTY


	final static String i_g_REST_SHIP_ODR_QTY = null;

	// �� 4 �ϐ������l�F i_g_CUST_ANAME


	final static String i_g_CUST_ANAME = null;

	// �� 5 �ϐ������l�F i_g_ITEM_CD


	final static String i_g_ITEM_CD = null;

	// �� 6 �ϐ������l�F i_k_MODE


	final static String i_k_MODE = null;

	// �� 7 �ϐ������l�F i_h_RESULT


	final static String i_h_RESULT = null;

	// �� 8 �ϐ������l�F i_h_REST_SHIP_ODR_QTY


	final static String i_h_REST_SHIP_ODR_QTY = null;

	// �� 9 �ϐ������l�F i_h_CUST_ANAME


	final static String i_h_CUST_ANAME = null;

	// �� 10 �ϐ������l�F i_h_CUST_ITEM_CD


	final static String i_h_CUST_ITEM_CD = null;

	// �� 11 �ϐ������l�F i_h_ITEM_CD


	final static String i_h_ITEM_CD = null;

	// �� 12 �ϐ������l�F i_h_AP_SECRTY_TYP


	final static String i_h_AP_SECRTY_TYP = null;

	// �� 13 �ϐ������l�F i_h_MODIFY_CNT


	final static String i_h_MODIFY_CNT = null;

	// �� 14 �ϐ������l�F i_r_SEL_PTN1


	final static String i_r_SEL_PTN1 = null;

	// �� 15 �ϐ������l�F i_r_SEL_PTN2


	final static String i_r_SEL_PTN2 = null;

	// �� 16 �ϐ������l�F i_g_ODR_NO


	final static String i_g_ODR_NO = null;

	// �� 17 �ϐ������l�F i_g_SLIP_CD


	final static String i_g_SLIP_CD = null;

	// �� 18 �ϐ������l�F i_g_DESINATED_SHIP_DATE


	final static String i_g_DESINATED_SHIP_DATE = null;

	// �� 19 �ϐ������l�F i_g_REST_SHIP_ODR_QTY2


	final static String i_g_REST_SHIP_ODR_QTY2 = null;

	// �� 20 �ϐ������l�F i_g_WH_CD


	final static String i_g_WH_CD = null;

	// �� 21 �ϐ������l�F i_h_PARTIAL_SHIP_INST_FLG


	final static String i_h_PARTIAL_SHIP_INST_FLG = null;

	// �� 22 �ϐ������l�F i_g_STOCK_UNIT


	final static String i_g_STOCK_UNIT = null;

	// �� 23 �ϐ������l�F i_g_STOCK_UNIT2


	final static String i_g_STOCK_UNIT2 = null;

	// �� 24 �ϐ������l�F i_g_WH_NAME


	final static String i_g_WH_NAME = null;

	// �� 25 �ϐ������l�F i_g_CUST_CD


	final static String i_g_CUST_CD = null;

	// �� 26 �ϐ������l�F i_g_CUST_ITEM_NAME


	final static String i_g_CUST_ITEM_NAME = null;

	// �� 27 �ϐ������l�F i_g_ITEM_NAME


	final static String i_g_ITEM_NAME = null;

	// �� 28 �ϐ������l�F i_g_CUST_ODR_NO


	final static String i_g_CUST_ODR_NO = null;

	// �� 29 �ϐ������l�F i_c_JOB_ODR_CD


	final static String i_c_JOB_ODR_CD = null;

	// �� 30 �ϐ������l�F i_h_MRP_ODR_TYP


	final static String i_h_MRP_ODR_TYP = null;

	// �� 31 �ϐ������l�F i_h_JOB_ODR_CD


	final static String i_h_JOB_ODR_CD = null;

	// �� 32 �ϐ������l�F i_tMRP_ODR_TYP


	final static String i_tMRP_ODR_TYP = null;

	// �� 33 �ϐ������l�F i_chkisWhCd_IN_JOBODRCD


	final static String i_chkisWhCd_IN_JOBODRCD = null;

	// �� 34 �ϐ������l�F i_strCOMPANY_CD


	final static String i_strCOMPANY_CD = null;

	// �� 35 �ϐ������l�F i_strUSER_NAME


	final static String i_strUSER_NAME = null;

	// �� 36 �ϐ������l�F i_strPLANT_CD


	final static String i_strPLANT_CD = null;

	// �� 37 �ϐ������l�F i_strSECTION_CD


	final static String i_strSECTION_CD = null;

	// �� 38 �ϐ������l�F i_strPLANT_NAME


	final static String i_strPLANT_NAME = null;

	// �� 39 �ϐ������l�F i_strPLANT_ANAME


	final static String i_strPLANT_ANAME = null;

	// �� 40 �ϐ������l�F i_strCAL_NO


	final static Double i_strCAL_NO = null;

	// �� 41 �ϐ������l�F i_strUSER_CD


	final static String i_strUSER_CD = null;

	// �� 42 �ϐ������l�F i_strBUSINESS_OPR_DATE


	final static String i_strBUSINESS_OPR_DATE = null;

	// �� 43 �ϐ������l�F i_strMAX_DISPLAY_ROWNUM


	final static Double i_strMAX_DISPLAY_ROWNUM = null;

	// �� 44 �ϐ������l�F i_tAnsDlvDate_ODR_NO


	final static String i_tAnsDlvDate_ODR_NO = null;

	// �� 45 �ϐ������l�F i_tAnsDlvDate_PART_DLV_SEQ_NO


	final static String i_tAnsDlvDate_PART_DLV_SEQ_NO = null;

	// �� 46 �ϐ������l�F i_tAnsDlvDate_DESINATED_SHIP_DATE


	final static String i_tAnsDlvDate_DESINATED_SHIP_DATE = null;

	// �� 47 �ϐ������l�F i_tOdrODR_CTL_NO


	final static String i_tOdrODR_CTL_NO = null;

	// �� 48 �ϐ������l�F i_tOdrCtl_CUST_ITEM_CD


	final static String i_tOdrCtl_CUST_ITEM_CD = null;

	// �� 49 �ϐ������l�F i_tOdrCtl_ITEM_CD


	final static String i_tOdrCtl_ITEM_CD = null;

	// �� 50 �ϐ������l�F i_mCust_CUST_ANAME


	final static String i_mCust_CUST_ANAME = null;

	// �� 51 �ϐ������l�F i_tAnsDlvDate_REST_SHIP_ODR_QTY


	final static String i_tAnsDlvDate_REST_SHIP_ODR_QTY = null;

	// �� 52 �ϐ������l�F i_tOdr_TRANSPORT_TYP


	final static String i_tOdr_TRANSPORT_TYP = null;

	// �� 53 �ϐ������l�F i_tOdr_ODR_UNIT_PRICE


	final static String i_tOdr_ODR_UNIT_PRICE = null;

	// �� 54 �ϐ������l�F i_tOdr_SPCL_PRICE_TYP


	final static String i_tOdr_SPCL_PRICE_TYP = null;

	// �� 55 �ϐ������l�F i_tOdrCtl_CUST_CD


	final static String i_tOdrCtl_CUST_CD = null;

	// �� 56 �ϐ������l�F i_tOdr_PARTIAL_SHIP_INST_FLG


	final static String i_tOdr_PARTIAL_SHIP_INST_FLG = null;

	// �� 57 �ϐ������l�F i_tAnsDlvDate_MODIFY_COUNT


	final static String i_tAnsDlvDate_MODIFY_COUNT = null;

	// �� 58 �ϐ������l�F i_tITEM_NAME


	final static String i_tITEM_NAME = null;

	// �� 59 �ϐ������l�F i_tSTOCK_UNIT


	final static String i_tSTOCK_UNIT = null;

	// �� 60 �ϐ������l�F i_tUNIT_QTY_TYP


	final static String i_tUNIT_QTY_TYP = null;

	// �� 61 �ϐ������l�F i_tWH_NAME


	final static String i_tWH_NAME = null;

	// �� 62 �ϐ������l�F i_tSHIP_WH_CD


	final static String i_tSHIP_WH_CD = null;

	// �� 63 �ϐ������l�F i_tCUST_CD


	final static String i_tCUST_CD = null;

	// �� 64 �ϐ������l�F i_tCUST_ITEM_NAME


	final static String i_tCUST_ITEM_NAME = null;

	// �� 65 �ϐ������l�F i_tCUST_ODR_NO


	final static String i_tCUST_ODR_NO = null;

	// �� 66 �ϐ������l�F i_g_JOB_ODR_CD


	final static String i_g_JOB_ODR_CD = null;

	// �� 67 �ϐ������l�F i_sysMyCompany_IN_COMPANYCD


	final static String i_sysMyCompany_IN_COMPANYCD = null;

	// �� 68 �ϐ������l�F i_tAnsDlvDate_IN_ODRNO


	final static String i_tAnsDlvDate_IN_ODRNO = null;

	// �� 69 �ϐ������l�F i_tAnsDlvDate_IN_PARTDLVSEQNO


	final static String i_tAnsDlvDate_IN_PARTDLVSEQNO = null;

	// �� 70 �ϐ������l�F i_up_tAnsDlvDate_DESINATED_SHIP_DATE


	final static String i_up_tAnsDlvDate_DESINATED_SHIP_DATE = null;

	// �� 71 �ϐ������l�F i_up_tAnsDlvDate_REST_SHIP_ODR_QTY


	final static String i_up_tAnsDlvDate_REST_SHIP_ODR_QTY = null;

	// �� 72 �ϐ������l�F i_up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG


	final static String i_up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG = null;

	// �� 73 �ϐ������l�F i_up_tAnsDlvDate_IN_ODRNO


	final static String i_up_tAnsDlvDate_IN_ODRNO = null;

	// �� 74 �ϐ������l�F i_up_tAnsDlvDate_IN_PARTDLVSEQNO


	final static String i_up_tAnsDlvDate_IN_PARTDLVSEQNO = null;

	// �� 75 �ϐ������l�F i_tShipOdr_ODR_NO


	final static String i_tShipOdr_ODR_NO = null;

	// �� 76 �ϐ������l�F i_tShipOdr_PART_DLV_SEQ_NO


	final static String i_tShipOdr_PART_DLV_SEQ_NO = null;

	// �� 77 �ϐ������l�F i_tShipOdr_SLIP_CD


	final static String i_tShipOdr_SLIP_CD = null;

	// �� 78 �ϐ������l�F i_tShipOdr_DESINATED_SHIP_DATE


	final static String i_tShipOdr_DESINATED_SHIP_DATE = null;

	// �� 79 �ϐ������l�F i_tShipOdr_SHIP_QTY


	final static String i_tShipOdr_SHIP_QTY = null;

	// �� 80 �ϐ������l�F i_tShipOdr_ALLCT_WH_CD


	final static String i_tShipOdr_ALLCT_WH_CD = null;

	// �� 81 �ϐ������l�F i_tShipOdr_CUST_NAME


	final static String i_tShipOdr_CUST_NAME = null;

	// �� 82 �ϐ������l�F i_tShipOdr_CUST_ITEM_CD


	final static String i_tShipOdr_CUST_ITEM_CD = null;

	// �� 83 �ϐ������l�F i_tShipOdr_ITEM_CD


	final static String i_tShipOdr_ITEM_CD = null;

	// �� 84 �ϐ������l�F i_tShipOdr_JOB_ODR_CD


	final static String i_tShipOdr_JOB_ODR_CD = null;

	// �� 85 �ϐ������l�F i_tShipOdrAnsDlvDate_REST_SHIP_ODR_QTY


	final static String i_tShipOdrAnsDlvDate_REST_SHIP_ODR_QTY = null;

	// �� 86 �ϐ������l�F i_tShipOdr_DEL_FLG


	final static String i_tShipOdr_DEL_FLG = null;

	// �� 87 �ϐ������l�F i_tShipOdr_DIRECT_DLV_FLG


	final static String i_tShipOdr_DIRECT_DLV_FLG = null;

	// �� 88 �ϐ������l�F i_tShipOdr_TRANSPORT_TYP


	final static String i_tShipOdr_TRANSPORT_TYP = null;

	// �� 89 �ϐ������l�F i_tShipOdr_MODIFY_COUNT


	final static String i_tShipOdr_MODIFY_COUNT = null;

	// �� 90 �ϐ������l�F i_tDEPO_TRANSFER_PROC_FLG


	final static String i_tDEPO_TRANSFER_PROC_FLG = null;

	// �� 91 �ϐ������l�F i_tShipOdr_IN_SLIPCD


	final static String i_tShipOdr_IN_SLIPCD = null;

	// �� 92 �ϐ������l�F i_in_tShipOdr_ODR_NO


	final static String i_in_tShipOdr_ODR_NO = null;

	// �� 93 �ϐ������l�F i_in_tShipOdr_PART_DLV_SEQ_NO


	final static String i_in_tShipOdr_PART_DLV_SEQ_NO = null;

	// �� 94 �ϐ������l�F i_in_tShipOdr_SLIP_CD


	final static String i_in_tShipOdr_SLIP_CD = null;

	// �� 95 �ϐ������l�F i_in_tShipOdr_ITEM_CD


	final static String i_in_tShipOdr_ITEM_CD = null;

	// �� 96 �ϐ������l�F i_in_tShipOdr_CUST_ITEM_CD


	final static String i_in_tShipOdr_CUST_ITEM_CD = null;

	// �� 97 �ϐ������l�F i_in_tShipOdr_CUST_ODR_NO


	final static String i_in_tShipOdr_CUST_ODR_NO = null;

	// �� 98 �ϐ������l�F i_in_tShipOdr_CUST_CD


	final static String i_in_tShipOdr_CUST_CD = null;

	// �� 99 �ϐ������l�F i_in_tShipOdr_CUST_NAME


	final static String i_in_tShipOdr_CUST_NAME = null;

	// �� 100 �ϐ������l�F i_in_tShipOdr_SHIP_ODR_ISS_PSN_CD


	final static String i_in_tShipOdr_SHIP_ODR_ISS_PSN_CD = null;

	// �� 101 �ϐ������l�F i_in_tShipOdr_DLV_LOC_CD


	final static String i_in_tShipOdr_DLV_LOC_CD = null;

	// �� 102 �ϐ������l�F i_in_tShipOdr_DESINATED_SHIP_DATE


	final static String i_in_tShipOdr_DESINATED_SHIP_DATE = null;

	// �� 103 �ϐ������l�F i_in_tShipOdr_SHIP_QTY


	final static String i_in_tShipOdr_SHIP_QTY = null;

	// �� 104 �ϐ������l�F i_in_tShipOdr_UNIT_PRICE


	final static String i_in_tShipOdr_UNIT_PRICE = null;

	// �� 105 �ϐ������l�F i_in_tShipOdr_SHIP_ODR_AMOUNT


	final static Double i_in_tShipOdr_SHIP_ODR_AMOUNT = null;

	// �� 106 �ϐ������l�F i_in_tShipOdr_CURRNCY_CD


	final static String i_in_tShipOdr_CURRNCY_CD = null;

	// �� 107 �ϐ������l�F i_in_tShipOdr_PKG_UNIT_QTY


	final static String i_in_tShipOdr_PKG_UNIT_QTY = null;

	// �� 108 �ϐ������l�F i_in_tShipOdr_REMARKS


	final static String i_in_tShipOdr_REMARKS = null;

	// �� 109 �ϐ������l�F i_in_tShipOdr_ALLCT_WH_CD


	final static String i_in_tShipOdr_ALLCT_WH_CD = null;

	// �� 110 �ϐ������l�F i_in_tShipOdr_DEPO_TYP


	final static String i_in_tShipOdr_DEPO_TYP = null;

	// �� 111 �ϐ������l�F i_in_tShipOdr_ENTRY_TYP


	final static String i_in_tShipOdr_ENTRY_TYP = null;

	// �� 112 �ϐ������l�F i_in_tShipOdr_PRINT_FLG


	final static String i_in_tShipOdr_PRINT_FLG = null;

	// �� 113 �ϐ������l�F i_in_tShipOdr_SHP_CMPLT_FLG


	final static String i_in_tShipOdr_SHP_CMPLT_FLG = null;

	// �� 114 �ϐ������l�F i_in_tShipOdr_DEL_FLG


	final static String i_in_tShipOdr_DEL_FLG = null;

	// �� 115 �ϐ������l�F i_in_tShipOdr_TRANSPORT_CD


	final static String i_in_tShipOdr_TRANSPORT_CD = null;

	// �� 116 �ϐ������l�F i_in_tShipOdr_DIRECT_DLV_FLG


	final static String i_in_tShipOdr_DIRECT_DLV_FLG = null;

	// �� 117 �ϐ������l�F i_in_tShipOdr_CUST_CHRG_PSN_CD


	final static String i_in_tShipOdr_CUST_CHRG_PSN_CD = null;

	// �� 118 �ϐ������l�F i_in_tShipOdr_UNIT_CD


	final static String i_in_tShipOdr_UNIT_CD = null;

	// �� 119 �ϐ������l�F i_in_tShipOdr_SCDL_DLV_DATE


	final static String i_in_tShipOdr_SCDL_DLV_DATE = null;

	// �� 120 �ϐ������l�F i_in_tShipOdr_TRANSFER_WH_CD


	final static String i_in_tShipOdr_TRANSFER_WH_CD = null;

	// �� 121 �ϐ������l�F i_in_tShipOdr_DLV_KEY_NO


	final static String i_in_tShipOdr_DLV_KEY_NO = null;

	// �� 122 �ϐ������l�F i_in_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES


	final static Double i_in_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES = null;

	// �� 123 �ϐ������l�F i_in_tShipOdr_SHIP_ODR_NO


	final static String i_in_tShipOdr_SHIP_ODR_NO = null;

	// �� 124 �ϐ������l�F i_in_tShipOdr_JOB_ODR_CD


	final static String i_in_tShipOdr_JOB_ODR_CD = null;

	// �� 125 �ϐ������l�F i_del_tShipOdr_IN_SLIPCD


	final static String i_del_tShipOdr_IN_SLIPCD = null;

	// �� 126 �ϐ������l�F i_tOdr_ODR_NO


	final static String i_tOdr_ODR_NO = null;

	// �� 127 �ϐ������l�F i_tOdr_ODR_TYP


	final static String i_tOdr_ODR_TYP = null;

	// �� 128 �ϐ������l�F i_tOdr_ODR_CTL_NO


	final static String i_tOdr_ODR_CTL_NO = null;

	// �� 129 �ϐ������l�F i_tOdr_CUST_ODR_NO


	final static String i_tOdr_CUST_ODR_NO = null;

	// �� 130 �ϐ������l�F i_tOdr_CUST_CHRG_ORG_CD


	final static String i_tOdr_CUST_CHRG_ORG_CD = null;

	// �� 131 �ϐ������l�F i_tOdr_CUST_CHRG_PSN_CD


	final static String i_tOdr_CUST_CHRG_PSN_CD = null;

	// �� 132 �ϐ������l�F i_tOdr_ODR_ACPT_ORG_CD


	final static String i_tOdr_ODR_ACPT_ORG_CD = null;

	// �� 133 �ϐ������l�F i_tOdr_ODR_ACPT_PSN_CD


	final static String i_tOdr_ODR_ACPT_PSN_CD = null;

	// �� 134 �ϐ������l�F i_tOdr_CURRNCY_CD


	final static String i_tOdr_CURRNCY_CD = null;

	// �� 135 �ϐ������l�F i_tOdr_EXCH_TYP


	final static String i_tOdr_EXCH_TYP = null;

	// �� 136 �ϐ������l�F i_tOdr_DLV_LOC_CD


	final static String i_tOdr_DLV_LOC_CD = null;

	// �� 137 �ϐ������l�F i_tOdr_DLV_LOC_CD_EIAJ


	final static String i_tOdr_DLV_LOC_CD_EIAJ = null;

	// �� 138 �ϐ������l�F i_tOdr_DLV_LOC_NAME


	final static String i_tOdr_DLV_LOC_NAME = null;

	// �� 139 �ϐ������l�F i_tOdr_DLV_LOC_NAME_KANJI


	final static String i_tOdr_DLV_LOC_NAME_KANJI = null;

	// �� 140 �ϐ������l�F i_tOdr_PRD_ODR_PLACE_CD


	final static String i_tOdr_PRD_ODR_PLACE_CD = null;

	// �� 141 �ϐ������l�F i_tOdr_PART_DLV_COUNT


	final static String i_tOdr_PART_DLV_COUNT = null;

	// �� 142 �ϐ������l�F i_tOdr_DEPO_TYP


	final static String i_tOdr_DEPO_TYP = null;

	// �� 143 �ϐ������l�F i_tOdr_DESINATED_DLV_DATE


	final static String i_tOdr_DESINATED_DLV_DATE = null;

	// �� 144 �ϐ������l�F i_tOdr_STD_DESINATED_RCV_DATE


	final static String i_tOdr_STD_DESINATED_RCV_DATE = null;

	// �� 145 �ϐ������l�F i_tOdr_ODR_QTY


	final static String i_tOdr_ODR_QTY = null;

	// �� 146 �ϐ������l�F i_tOdr_REMAIN_UNCONFIRM_ODR_QTY


	final static String i_tOdr_REMAIN_UNCONFIRM_ODR_QTY = null;

	// �� 147 �ϐ������l�F i_tOdr_CANCELED_UNCONFIRM_ODR_QTY


	final static String i_tOdr_CANCELED_UNCONFIRM_ODR_QTY = null;

	// �� 148 �ϐ������l�F i_tOdr_UNIT_CD


	final static String i_tOdr_UNIT_CD = null;

	// �� 149 �ϐ������l�F i_tOdr_UNCONFIRM_ODR_BALANCE


	final static String i_tOdr_UNCONFIRM_ODR_BALANCE = null;

	// �� 150 �ϐ������l�F i_tOdr_ODR_AMOUNT


	final static String i_tOdr_ODR_AMOUNT = null;

	// �� 151 �ϐ������l�F i_tOdr_ODR_AMOUNT_EXCH_RATES


	final static String i_tOdr_ODR_AMOUNT_EXCH_RATES = null;

	// �� 152 �ϐ������l�F i_tOdr_TOTAL_SHIP_QTY


	final static String i_tOdr_TOTAL_SHIP_QTY = null;

	// �� 153 �ϐ������l�F i_tOdr_SHIP_AMOUNT


	final static String i_tOdr_SHIP_AMOUNT = null;

	// �� 154 �ϐ������l�F i_tOdr_SHIP_AMOUNT_EXCH_RATES


	final static String i_tOdr_SHIP_AMOUNT_EXCH_RATES = null;

	// �� 155 �ϐ������l�F i_tOdr_RETURN_PRICE


	final static String i_tOdr_RETURN_PRICE = null;

	// �� 156 �ϐ������l�F i_tOdr_RETURN_QTY


	final static String i_tOdr_RETURN_QTY = null;

	// �� 157 �ϐ������l�F i_tOdr_RETURN_AMOUNT


	final static String i_tOdr_RETURN_AMOUNT = null;

	// �� 158 �ϐ������l�F i_tOdr_RETURN_AMOUNT_EXCH_RATES


	final static String i_tOdr_RETURN_AMOUNT_EXCH_RATES = null;

	// �� 159 �ϐ������l�F i_tOdr_ODR_CMPLT_FLG


	final static String i_tOdr_ODR_CMPLT_FLG = null;

	// �� 160 �ϐ������l�F i_tOdr_ODR_CMPLT_DATE


	final static String i_tOdr_ODR_CMPLT_DATE = null;

	// �� 161 �ϐ������l�F i_tOdr_CUS_DLV_CD


	final static String i_tOdr_CUS_DLV_CD = null;

	// �� 162 �ϐ������l�F i_tOdr_CUS_DLV_KEY_CD


	final static String i_tOdr_CUS_DLV_KEY_CD = null;

	// �� 163 �ϐ������l�F i_tOdr_PART_NAME


	final static String i_tOdr_PART_NAME = null;

	// �� 164 �ϐ������l�F i_tOdr_PKG_UNIT


	final static String i_tOdr_PKG_UNIT = null;

	// �� 165 �ϐ������l�F i_tOdr_SLIP_PRICE_PRINT_TYP


	final static String i_tOdr_SLIP_PRICE_PRINT_TYP = null;

	// �� 166 �ϐ������l�F i_tOdr_INSPC_TYP


	final static String i_tOdr_INSPC_TYP = null;

	// �� 167 �ϐ������l�F i_tOdr_CLIENT_REMARK


	final static String i_tOdr_CLIENT_REMARK = null;

	// �� 168 �ϐ������l�F i_tOdr_CLIENT_REMARK_KANJI


	final static String i_tOdr_CLIENT_REMARK_KANJI = null;

	// �� 169 �ϐ������l�F i_tOdr_CLIENT_BARCODE_INF


	final static String i_tOdr_CLIENT_BARCODE_INF = null;

	// �� 170 �ϐ������l�F i_tOdr_TRANSPORT_CD


	final static String i_tOdr_TRANSPORT_CD = null;

	// �� 171 �ϐ������l�F i_tOdr_TAX_APPLY_TYP


	final static String i_tOdr_TAX_APPLY_TYP = null;

	// �� 172 �ϐ������l�F i_tOdr_TAX_CD


	final static String i_tOdr_TAX_CD = null;

	// �� 173 �ϐ������l�F i_tOdr_TAX_CALC_TYP


	final static String i_tOdr_TAX_CALC_TYP = null;

	// �� 174 �ϐ������l�F i_tOdr_REMARKS


	final static String i_tOdr_REMARKS = null;

	// �� 175 �ϐ������l�F i_tOdr_ODR_ACPT_DATE


	final static String i_tOdr_ODR_ACPT_DATE = null;

	// �� 176 �ϐ������l�F i_tOdr_SHIP_PLAN_REMAIN_QTY


	final static String i_tOdr_SHIP_PLAN_REMAIN_QTY = null;

	// �� 177 �ϐ������l�F i_tOdr_SHIP_PLAN_CMPLT_FLG


	final static String i_tOdr_SHIP_PLAN_CMPLT_FLG = null;

	// �� 178 �ϐ������l�F i_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG


	final static String i_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG = null;

	// �� 179 �ϐ������l�F i_tOdr_IF_CTL_NO


	final static String i_tOdr_IF_CTL_NO = null;

	// �� 180 �ϐ������l�F i_tOdr_ENTRY_TYP


	final static String i_tOdr_ENTRY_TYP = null;

	// �� 181 �ϐ������l�F i_tOdr_BUYER_NAME


	final static String i_tOdr_BUYER_NAME = null;

	// �� 182 �ϐ������l�F i_tOdr_PUCH_ODR_QTY_TOTAL


	final static String i_tOdr_PUCH_ODR_QTY_TOTAL = null;

	// �� 183 �ϐ������l�F i_tOdr_UNIT_CD_ORG


	final static String i_tOdr_UNIT_CD_ORG = null;

	// �� 184 �ϐ������l�F i_tOdr_SHIP_CNT


	final static String i_tOdr_SHIP_CNT = null;

	// �� 185 �ϐ������l�F i_tOdr_CUR_CD


	final static String i_tOdr_CUR_CD = null;

	// �� 186 �ϐ������l�F i_tOdr_EXCH_TYP_R


	final static String i_tOdr_EXCH_TYP_R = null;

	// �� 187 �ϐ������l�F i_tOdr_IN_ODRNO


	final static String i_tOdr_IN_ODRNO = null;

	// �� 188 �ϐ������l�F i_uptOdr_PART_DLV_COUNT


	final static String i_uptOdr_PART_DLV_COUNT = null;

	// �� 189 �ϐ������l�F i_uptOdr_IN_ODRNO


	final static String i_uptOdr_IN_ODRNO = null;

	// �� 190 �ϐ������l�F i_mItem_ITEM_CD


	final static String i_mItem_ITEM_CD = null;

	// �� 191 �ϐ������l�F i_mItem_ITEM_NAME


	final static String i_mItem_ITEM_NAME = null;

	// �� 192 �ϐ������l�F i_mItem_PRODUCT_TYP


	final static String i_mItem_PRODUCT_TYP = null;

	// �� 193 �ϐ������l�F i_mItem_MRP_ODR_TYP


	final static String i_mItem_MRP_ODR_TYP = null;

	// �� 194 �ϐ������l�F i_mItem_DRAW_CD


	final static String i_mItem_DRAW_CD = null;

	// �� 195 �ϐ������l�F i_mItem_SPEC


	final static String i_mItem_SPEC = null;

	// �� 196 �ϐ������l�F i_mItem_HIGH_LEVEL_NO


	final static String i_mItem_HIGH_LEVEL_NO = null;

	// �� 197 �ϐ������l�F i_mItem_OUTSIDE_TYP


	final static String i_mItem_OUTSIDE_TYP = null;

	// �� 198 �ϐ������l�F i_mItem_STOCK_UNIT_FLG


	final static String i_mItem_STOCK_UNIT_FLG = null;

	// �� 199 �ϐ������l�F i_mItem_STOCK_UNIT


	final static String i_mItem_STOCK_UNIT = null;

	// �� 200 �ϐ������l�F i_mItem_PKG_UNIT


	final static String i_mItem_PKG_UNIT = null;

	// �� 201 �ϐ������l�F i_mItem_PKG_UNIT_QTY


	final static String i_mItem_PKG_UNIT_QTY = null;

	// �� 202 �ϐ������l�F i_mItem_UNIT_QTY_TYP


	final static String i_mItem_UNIT_QTY_TYP = null;

	// �� 203 �ϐ������l�F i_mItem_ODR_LT


	final static String i_mItem_ODR_LT = null;

	// �� 204 �ϐ������l�F i_mItem_FIXED_LT


	final static String i_mItem_FIXED_LT = null;

	// �� 205 �ϐ������l�F i_mItem_PROP_LT


	final static String i_mItem_PROP_LT = null;

	// �� 206 �ϐ������l�F i_mItem_SAFETY_LT


	final static String i_mItem_SAFETY_LT = null;

	// �� 207 �ϐ������l�F i_mItem_ISSUE_LT


	final static String i_mItem_ISSUE_LT = null;

	// �� 208 �ϐ������l�F i_mItem_PROP_LOT_SIZE


	final static String i_mItem_PROP_LOT_SIZE = null;

	// �� 209 �ϐ������l�F i_mItem_ITEM_SPOIL


	final static String i_mItem_ITEM_SPOIL = null;

	// �� 210 �ϐ������l�F i_mItem_SAFETY_STOCK


	final static String i_mItem_SAFETY_STOCK = null;

	// �� 211 �ϐ������l�F i_mItem_LOT_SIZING_TYP


	final static String i_mItem_LOT_SIZING_TYP = null;

	// �� 212 �ϐ������l�F i_mItem_MAX_PERIOD


	final static String i_mItem_MAX_PERIOD = null;

	// �� 213 �ϐ������l�F i_mItem_MAX_ODR_QTY


	final static String i_mItem_MAX_ODR_QTY = null;

	// �� 214 �ϐ������l�F i_mItem_ODR_POINT


	final static String i_mItem_ODR_POINT = null;

	// �� 215 �ϐ������l�F i_mItem_FIXED_ODR_QTY


	final static String i_mItem_FIXED_ODR_QTY = null;

	// �� 216 �ϐ������l�F i_mItem_MIN_ODR_QTY


	final static String i_mItem_MIN_ODR_QTY = null;

	// �� 217 �ϐ������l�F i_mItem_MUL_ODR_QTY


	final static String i_mItem_MUL_ODR_QTY = null;

	// �� 218 �ϐ������l�F i_mItem_ISSUE_TYP


	final static String i_mItem_ISSUE_TYP = null;

	// �� 219 �ϐ������l�F i_mItem_MPS_FLG


	final static String i_mItem_MPS_FLG = null;

	// �� 220 �ϐ������l�F i_mItem_ACPT_INSPC_TYP


	final static String i_mItem_ACPT_INSPC_TYP = null;

	// �� 221 �ϐ������l�F i_mItem_CLASIFICATION_CD


	final static String i_mItem_CLASIFICATION_CD = null;

	// �� 222 �ϐ������l�F i_mItem_UNIT_WEIGHT


	final static String i_mItem_UNIT_WEIGHT = null;

	// �� 223 �ϐ������l�F i_mItem_ABC_TYP


	final static String i_mItem_ABC_TYP = null;

	// �� 224 �ϐ������l�F i_mItem_OPR_RSLT_TYP


	final static String i_mItem_OPR_RSLT_TYP = null;

	// �� 225 �ϐ������l�F i_mItem_SPL_ITEM_TYP


	final static String i_mItem_SPL_ITEM_TYP = null;

	// �� 226 �ϐ������l�F i_mItem_TAX_CD


	final static String i_mItem_TAX_CD = null;

	// �� 227 �ϐ������l�F i_mItem_IN_ITEMCD


	final static String i_mItem_IN_ITEMCD = null;

	// �� 228 �ϐ������l�F i_tOdrCtl_ODR_CTL_NO


	final static String i_tOdrCtl_ODR_CTL_NO = null;

	// �� 229 �ϐ������l�F i_tOdrCtl_CUST_ITEM_NAME


	final static String i_tOdrCtl_CUST_ITEM_NAME = null;

	// �� 230 �ϐ������l�F i_tOdrCtl_ITEM_NAME


	final static String i_tOdrCtl_ITEM_NAME = null;

	// �� 231 �ϐ������l�F i_tOdrCtl_IN_ODRCTLNO


	final static String i_tOdrCtl_IN_ODRCTLNO = null;

	// �� 232 �ϐ������l�F i_in_tShipSlip_SLIP_CD


	final static String i_in_tShipSlip_SLIP_CD = null;

	// �� 233 �ϐ������l�F i_in_tShipSlip_ITEM_CD


	final static String i_in_tShipSlip_ITEM_CD = null;

	// �� 234 �ϐ������l�F i_in_tShipSlip_CUST_ITEM_CD


	final static String i_in_tShipSlip_CUST_ITEM_CD = null;

	// �� 235 �ϐ������l�F i_in_tShipSlip_PART_NAME


	final static String i_in_tShipSlip_PART_NAME = null;

	// �� 236 �ϐ������l�F i_in_tShipSlip_CUST_ODR_NO


	final static String i_in_tShipSlip_CUST_ODR_NO = null;

	// �� 237 �ϐ������l�F i_in_tShipSlip_CUST_CD


	final static String i_in_tShipSlip_CUST_CD = null;

	// �� 238 �ϐ������l�F i_in_tShipSlip_CUST_NAME


	final static String i_in_tShipSlip_CUST_NAME = null;

	// �� 239 �ϐ������l�F i_in_tShipSlip_DLV_LOC_CD


	final static String i_in_tShipSlip_DLV_LOC_CD = null;

	// �� 240 �ϐ������l�F i_in_tShipSlip_DLV_LOC_NAME_KANJI


	final static String i_in_tShipSlip_DLV_LOC_NAME_KANJI = null;

	// �� 241 �ϐ������l�F i_in_tShipSlip_CUS_DLV_KEY_CD


	final static String i_in_tShipSlip_CUS_DLV_KEY_CD = null;

	// �� 242 �ϐ������l�F i_in_tShipSlip_DESINATED_SHIP_DATE


	final static String i_in_tShipSlip_DESINATED_SHIP_DATE = null;

	// �� 243 �ϐ������l�F i_in_tShipSlip_DESINATED_DLV_DATE


	final static String i_in_tShipSlip_DESINATED_DLV_DATE = null;

	// �� 244 �ϐ������l�F i_in_tShipSlip_SCDL_DLV_DATE


	final static String i_in_tShipSlip_SCDL_DLV_DATE = null;

	// �� 245 �ϐ������l�F i_in_tShipSlip_SHIP_ODR_QTY


	final static String i_in_tShipSlip_SHIP_ODR_QTY = null;

	// �� 246 �ϐ������l�F i_in_tShipSlip_UNIT_CD


	final static String i_in_tShipSlip_UNIT_CD = null;

	// �� 247 �ϐ������l�F i_in_tShipSlip_UNIT_PRICE


	final static String i_in_tShipSlip_UNIT_PRICE = null;

	// �� 248 �ϐ������l�F i_in_tShipSlip_SHIP_ODR_AMOUNT


	final static String i_in_tShipSlip_SHIP_ODR_AMOUNT = null;

	// �� 249 �ϐ������l�F i_in_tShipSlip_TAX_AMOUNT


	final static String i_in_tShipSlip_TAX_AMOUNT = null;

	// �� 250 �ϐ������l�F i_in_tShipSlip_INSPC_TYP


	final static String i_in_tShipSlip_INSPC_TYP = null;

	// �� 251 �ϐ������l�F i_in_tShipSlip_CLIENT_REMARK_KANJI


	final static String i_in_tShipSlip_CLIENT_REMARK_KANJI = null;

	// �� 252 �ϐ������l�F i_in_tShipSlip_CLIENT_BARCODE_INF


	final static String i_in_tShipSlip_CLIENT_BARCODE_INF = null;

	// �� 253 �ϐ������l�F i_in_tShipSlip_PRINT_FLG


	final static String i_in_tShipSlip_PRINT_FLG = null;

	// �� 254 �ϐ������l�F i_in_tShipSlip_DEL_FLG


	final static String i_in_tShipSlip_DEL_FLG = null;

	// �� 255 �ϐ������l�F i_in_tShipSlip_BUYER_NAME


	final static String i_in_tShipSlip_BUYER_NAME = null;

	// �� 256 �ϐ������l�F i_in_tShipSlip_PUCH_ODR_QTY_TOTAL


	final static String i_in_tShipSlip_PUCH_ODR_QTY_TOTAL = null;

	// �� 257 �ϐ������l�F i_in_tShipSlip_DLV_ODR_QTY


	final static String i_in_tShipSlip_DLV_ODR_QTY = null;

	// �� 258 �ϐ������l�F i_in_tShipSlip_SHIP_ODR_AMOUNT_TAX


	final static String i_in_tShipSlip_SHIP_ODR_AMOUNT_TAX = null;

	// �� 259 �ϐ������l�F i_in_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT


	final static String i_in_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT = null;

	// �� 260 �ϐ������l�F i_in_tShipSlip_INTERNAL_TAX_SALES_AMOUNT


	final static String i_in_tShipSlip_INTERNAL_TAX_SALES_AMOUNT = null;

	// �� 261 �ϐ������l�F i_in_tShipSlip_TAXFREE_SALES_AMOUNT


	final static String i_in_tShipSlip_TAXFREE_SALES_AMOUNT = null;

	// �� 262 �ϐ������l�F i_in_tShipSlip_TAX_CREDIT_SALES_AMOUNT


	final static String i_in_tShipSlip_TAX_CREDIT_SALES_AMOUNT = null;

	// �� 263 �ϐ������l�F i_in_tShipSlip_EXTERNAL_TAX_AMOUNT


	final static String i_in_tShipSlip_EXTERNAL_TAX_AMOUNT = null;

	// �� 264 �ϐ������l�F i_in_tShipSlip_INTERNAL_TAX_AMOUNT


	final static String i_in_tShipSlip_INTERNAL_TAX_AMOUNT = null;

	// �� 265 �ϐ������l�F i_in_tShipSlip_TAX_AMOUNT_1


	final static String i_in_tShipSlip_TAX_AMOUNT_1 = null;

	// �� 266 �ϐ������l�F i_in_tShipSlip_TAX_AMOUNT_2


	final static String i_in_tShipSlip_TAX_AMOUNT_2 = null;

	// �� 267 �ϐ������l�F i_in_tShipSlip_TAX_AMOUNT_3


	final static String i_in_tShipSlip_TAX_AMOUNT_3 = null;

	// �� 268 �ϐ������l�F i_in_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT


	final static String i_in_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT = null;

	// �� 269 �ϐ������l�F i_del_tShipSlip_IN_SLIPCD


	final static String i_del_tShipSlip_IN_SLIPCD = null;

	// �� 270 �ϐ������l�F i_mCustBase_COMPANY_CD


	final static String i_mCustBase_COMPANY_CD = null;

	// �� 271 �ϐ������l�F i_mCustBase_CUST_CD


	final static String i_mCustBase_CUST_CD = null;

	// �� 272 �ϐ������l�F i_mCustBase_DLV_LOC_CD


	final static String i_mCustBase_DLV_LOC_CD = null;

	// �� 273 �ϐ������l�F i_mCustBase_DLV_LOC_NAME


	final static String i_mCustBase_DLV_LOC_NAME = null;

	// �� 274 �ϐ������l�F i_mCustBase_DLV_LOC_KNAME


	final static String i_mCustBase_DLV_LOC_KNAME = null;

	// �� 275 �ϐ������l�F i_mCustBase_DLV_LOC_ENAME


	final static String i_mCustBase_DLV_LOC_ENAME = null;

	// �� 276 �ϐ������l�F i_mCustBase_ZIP_CD


	final static String i_mCustBase_ZIP_CD = null;

	// �� 277 �ϐ������l�F i_mCustBase_ADDRESS_1


	final static String i_mCustBase_ADDRESS_1 = null;

	// �� 278 �ϐ������l�F i_mCustBase_ADDRESS_2


	final static String i_mCustBase_ADDRESS_2 = null;

	// �� 279 �ϐ������l�F i_mCustBase_ADDRESS_K_1


	final static String i_mCustBase_ADDRESS_K_1 = null;

	// �� 280 �ϐ������l�F i_mCustBase_ADDRESS_K_2


	final static String i_mCustBase_ADDRESS_K_2 = null;

	// �� 281 �ϐ������l�F i_mCustBase_TEL


	final static String i_mCustBase_TEL = null;

	// �� 282 �ϐ������l�F i_mCustBase_FAX


	final static String i_mCustBase_FAX = null;

	// �� 283 �ϐ������l�F i_mCustBase_SHIP_WH_CD


	final static String i_mCustBase_SHIP_WH_CD = null;

	// �� 284 �ϐ������l�F i_mCustBase_TRANSPORT_CD


	final static String i_mCustBase_TRANSPORT_CD = null;

	// �� 285 �ϐ������l�F i_mCustBase_TRANSPORT_NAME


	final static String i_mCustBase_TRANSPORT_NAME = null;

	// �� 286 �ϐ������l�F i_mCustBase_TRANSPORT_LT


	final static String i_mCustBase_TRANSPORT_LT = null;

	// �� 287 �ϐ������l�F i_mCustBase_CAL_NO


	final static String i_mCustBase_CAL_NO = null;

	// �� 288 �ϐ������l�F i_mCustBase_TRANSPORT_TYP


	final static String i_mCustBase_TRANSPORT_TYP = null;

	// �� 289 �ϐ������l�F i_mCustBase_DLV_START_TIME


	final static String i_mCustBase_DLV_START_TIME = null;

	// �� 290 �ϐ������l�F i_mCustBase_DLV_END_TIME


	final static String i_mCustBase_DLV_END_TIME = null;

	// �� 291 �ϐ������l�F i_mCustBase_AREA_CLASS_TYP1


	final static String i_mCustBase_AREA_CLASS_TYP1 = null;

	// �� 292 �ϐ������l�F i_mCustBase_AREA_CLASS_1


	final static String i_mCustBase_AREA_CLASS_1 = null;

	// �� 293 �ϐ������l�F i_mCustBase_AREA_CLASS_TYP2


	final static String i_mCustBase_AREA_CLASS_TYP2 = null;

	// �� 294 �ϐ������l�F i_mCustBase_AREA_CLASS_2


	final static String i_mCustBase_AREA_CLASS_2 = null;

	// �� 295 �ϐ������l�F i_mCustBase_AREA_CLASS_TYP3


	final static String i_mCustBase_AREA_CLASS_TYP3 = null;

	// �� 296 �ϐ������l�F i_mCustBase_AREA_CLASS_3


	final static String i_mCustBase_AREA_CLASS_3 = null;

	// �� 297 �ϐ������l�F i_mCustBase_REMARKS_1


	final static String i_mCustBase_REMARKS_1 = null;

	// �� 298 �ϐ������l�F i_mCustBase_REMARKS_2


	final static String i_mCustBase_REMARKS_2 = null;

	// �� 299 �ϐ������l�F i_mCustBase_REMARKS_3


	final static String i_mCustBase_REMARKS_3 = null;

	// �� 300 �ϐ������l�F i_mCustBase_DEPO_WH_CD


	final static String i_mCustBase_DEPO_WH_CD = null;

	// �� 301 �ϐ������l�F i_mCustBase_IN_COMPANYCD


	final static String i_mCustBase_IN_COMPANYCD = null;

	// �� 302 �ϐ������l�F i_mCustBase_IN_CUSTCD


	final static String i_mCustBase_IN_CUSTCD = null;

	// �� 303 �ϐ������l�F i_mCustBase_IN_DLVLOCCD


	final static String i_mCustBase_IN_DLVLOCCD = null;

	// �� 304 �ϐ������l�F i_mCust_COMPANY_CD


	final static String i_mCust_COMPANY_CD = null;

	// �� 305 �ϐ������l�F i_mCust_CUST_CD


	final static String i_mCust_CUST_CD = null;

	// �� 306 �ϐ������l�F i_mCust_CUST_NAME


	final static String i_mCust_CUST_NAME = null;

	// �� 307 �ϐ������l�F i_mCust_CUST_KNAME


	final static String i_mCust_CUST_KNAME = null;

	// �� 308 �ϐ������l�F i_mCust_OWN_ORG_CD


	final static String i_mCust_OWN_ORG_CD = null;

	// �� 309 �ϐ������l�F i_mCust_OWN_PERSON_CD


	final static String i_mCust_OWN_PERSON_CD = null;

	// �� 310 �ϐ������l�F i_mCust_CUR_CD


	final static String i_mCust_CUR_CD = null;

	// �� 311 �ϐ������l�F i_mCust_EXCH_TYP


	final static String i_mCust_EXCH_TYP = null;

	// �� 312 �ϐ������l�F i_mCust_TAX_APPLY_TYP


	final static String i_mCust_TAX_APPLY_TYP = null;

	// �� 313 �ϐ������l�F i_mCust_TAX_CD


	final static String i_mCust_TAX_CD = null;

	// �� 314 �ϐ������l�F i_mCust_TAX_CALC_TYP


	final static String i_mCust_TAX_CALC_TYP = null;

	// �� 315 �ϐ������l�F i_mCust_PRICE_ROUND_TYP


	final static String i_mCust_PRICE_ROUND_TYP = null;

	// �� 316 �ϐ������l�F i_mCust_DETAIL_ROUND_TYP


	final static String i_mCust_DETAIL_ROUND_TYP = null;

	// �� 317 �ϐ������l�F i_mCust_UNCONFIRM_ODR_EFF_PRIOD


	final static String i_mCust_UNCONFIRM_ODR_EFF_PRIOD = null;

	// �� 318 �ϐ������l�F i_mCust_UNCONFIRM_ODR_EFF_TERM_FLG


	final static String i_mCust_UNCONFIRM_ODR_EFF_TERM_FLG = null;

	// �� 319 �ϐ������l�F i_mCust_EDI_CUST_VEND_CD


	final static String i_mCust_EDI_CUST_VEND_CD = null;

	// �� 320 �ϐ������l�F i_mCust_PARTIAL_SHIP_INST_FLG


	final static String i_mCust_PARTIAL_SHIP_INST_FLG = null;

	// �� 321 �ϐ������l�F i_mCust_DEPO_TYP


	final static String i_mCust_DEPO_TYP = null;

	// �� 322 �ϐ������l�F i_mCust_INSPC_ACPT_TYP


	final static String i_mCust_INSPC_ACPT_TYP = null;

	// �� 323 �ϐ������l�F i_mCust_IN_COMPANYCD


	final static String i_mCust_IN_COMPANYCD = null;

	// �� 324 �ϐ������l�F i_mCust_IN_CUSTCD


	final static String i_mCust_IN_CUSTCD = null;

	// �� 325 �ϐ������l�F i_tori_tAnsDlvDate_REST_SHIP_ODR_QTY


	final static String i_tori_tAnsDlvDate_REST_SHIP_ODR_QTY = null;

	// �� 326 �ϐ������l�F i_tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG


	final static String i_tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG = null;

	// �� 327 �ϐ������l�F i_tori_tAnsDlvDate_IN_ODRNO


	final static String i_tori_tAnsDlvDate_IN_ODRNO = null;

	// �� 328 �ϐ������l�F i_tori_tAnsDlvDate_IN_PARTDLVSEQNO


	final static String i_tori_tAnsDlvDate_IN_PARTDLVSEQNO = null;

	// �� 329 �ϐ������l�F i_chkisWhCd_WH_CD


	final static String i_chkisWhCd_WH_CD = null;

	// �� 330 �ϐ������l�F i_chkisWhCd_WH_TYP


	final static String i_chkisWhCd_WH_TYP = null;

	// �� 331 �ϐ������l�F i_chkisWhCd_ITEM_CD


	final static String i_chkisWhCd_ITEM_CD = null;

	// �� 332 �ϐ������l�F i_chkisWhCd_PBL_SHIP_QTY


	final static String i_chkisWhCd_PBL_SHIP_QTY = null;

	// �� 333 �ϐ������l�F i_chkisWhCd_IN_ITEMCD


	final static String i_chkisWhCd_IN_ITEMCD = null;

	// �� 334 �ϐ������l�F i_chkisWhCd_IN_WHCD


	final static String i_chkisWhCd_IN_WHCD = null;

	// �� 335 �ϐ������l�F i_mUnitCost_UNIT_COST


	final static String i_mUnitCost_UNIT_COST = null;

	// �� 336 �ϐ������l�F i_mUnitCost_EFF_PHASE_IN_DATE


	final static String i_mUnitCost_EFF_PHASE_IN_DATE = null;

	// �� 337 �ϐ������l�F i_mUnitCost_IN_COMPANYCD


	final static String i_mUnitCost_IN_COMPANYCD = null;

	// �� 338 �ϐ������l�F i_mUnitCost_IN_CUSTCD


	final static String i_mUnitCost_IN_CUSTCD = null;

	// �� 339 �ϐ������l�F i_mUnitCost_IN_ITEMCD


	final static String i_mUnitCost_IN_ITEMCD = null;

	// �� 340 �ϐ������l�F i_mUnitCost_IN_EFFPHASEINDATE


	final static String i_mUnitCost_IN_EFFPHASEINDATE = null;

	// �� 341 �ϐ������l�F i_mWhWH_CD


	final static String i_mWhWH_CD = null;

	// �� 342 �ϐ������l�F i_mWhWH_NAME


	final static String i_mWhWH_NAME = null;

	// �� 343 �ϐ������l�F i_strTaxTAX_KBN


	final static String i_strTaxTAX_KBN = null;

	// �� 344 �ϐ������l�F i_strTaxOLD_TAX_1


	final static String i_strTaxOLD_TAX_1 = null;

	// �� 345 �ϐ������l�F i_strTaxOLD_TAX_2


	final static String i_strTaxOLD_TAX_2 = null;

	// �� 346 �ϐ������l�F i_strTaxOLD_TAX_3


	final static String i_strTaxOLD_TAX_3 = null;

	// �� 347 �ϐ������l�F i_strTaxNEW_TAX_1


	final static String i_strTaxNEW_TAX_1 = null;

	// �� 348 �ϐ������l�F i_strTaxNEW_TAX_2


	final static String i_strTaxNEW_TAX_2 = null;

	// �� 349 �ϐ������l�F i_strTaxNEW_TAX_3


	final static String i_strTaxNEW_TAX_3 = null;

	// �� 350 �ϐ������l�F i_strTaxSTART_DATE


	final static String i_strTaxSTART_DATE = null;

	// �� 351 �ϐ������l�F i_strTaxROUND_TYP


	final static String i_strTaxROUND_TYP = null;

	// �� 352 �ϐ������l�F i_strTaxIN_COMPANYCD


	final static String i_strTaxIN_COMPANYCD = null;

	// �� 353 �ϐ������l�F i_strTaxIN_CUSTCD


	final static String i_strTaxIN_CUSTCD = null;

	// �� 354 �ϐ������l�F i_g_CUST_ITEM_CD


	final static String i_g_CUST_ITEM_CD = null;

	// �� 355 �ϐ������l�F i_strYotaku_WH_CD


	final static String i_strYotaku_WH_CD = null;

	// �� 356 �ϐ������l�F i_strYotaku_IN_WH_TYP


	final static String i_strYotaku_IN_WH_TYP = null;

	// �� 357 �ϐ������l�F i_strSYUKA_LT


	final static String i_strSYUKA_LT = null;

	// �� 358 �ϐ������l�F i_chkisinWhCd_WH_CD


	final static String i_chkisinWhCd_WH_CD = null;

	// �� 359 �ϐ������l�F i_chkisinWhCd_WH_TYP


	final static String i_chkisinWhCd_WH_TYP = null;

	// �� 360 �ϐ������l�F i_chkisinWhCd_WH_NAME


	final static String i_chkisinWhCd_WH_NAME = null;

	// �� 361 �ϐ������l�F i_chkis_IN_WHCD


	final static String i_chkis_IN_WHCD = null;

	// �� 362 �ϐ������l�F i_uptOdr_SHIP_CNT


	final static String i_uptOdr_SHIP_CNT = null;

	// �� 363 �ϐ������l�F i_tHOLIDAY_FLG


	final static String i_tHOLIDAY_FLG = null;

	// �� 364 �ϐ������l�F i_tWH_CD


	final static String i_tWH_CD = null;

	// �� 365 �ϐ������l�F i_tCAL_DATE


	final static String i_tCAL_DATE = null;

	// �� 366 �ϐ������l�F i_tDECIMAL_FIG


	final static String i_tDECIMAL_FIG = null;

	// �� 367 �ϐ������l�F i_tCUR_CD


	final static String i_tCUR_CD = null;

	// �� 368 �ϐ������l�F i_chkisWhCd_JOB_ODR_CD


	final static String i_chkisWhCd_JOB_ODR_CD = null;

	// �� 369 �ϐ������l�F i_serTJobOdr_JOB_ODR_CD


	final static String i_serTJobOdr_JOB_ODR_CD = null;

	// �� 370 �ϐ������l�F i_serTJobOdr_ITEM_CD


	final static String i_serTJobOdr_ITEM_CD = null;

	// �� 371 �ϐ������l�F i_tUnShipList_ACPT_ODR_CD


	final static String i_tUnShipList_ACPT_ODR_CD = null;

	// �� 372 �ϐ������l�F i_tUnShipList_PART_DLV_SEQ_NO


	final static String i_tUnShipList_PART_DLV_SEQ_NO = null;

	// �� 373 �ϐ������l�F i_strTAX_CD


	final static String i_strTAX_CD = null;

	// �� 374 �ϐ������l�F i_selMODIFY_COUNT


	final static String i_selMODIFY_COUNT = null;

*/

	//{{user_implement_code
		// TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
		// �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
	// �� 1 �ϐ������l�F i_strCOMPANY_CD
	final static String i_strCOMPANY_CD = null;
	// �� 2 �ϐ������l�F i_strUSER_NAME
	final static String i_strUSER_NAME = null;
	// �� 3 �ϐ������l�F i_strPLANT_CD
	final static String i_strPLANT_CD = null;
	// �� 4 �ϐ������l�F i_strSECTION_CD
	final static String i_strSECTION_CD = null;
	// �� 5 �ϐ������l�F i_strPLANT_NAME
	final static String i_strPLANT_NAME = null;
	// �� 6 �ϐ������l�F i_strPLANT_ANAME
	final static String i_strPLANT_ANAME = null;
	// �� 7 �ϐ������l�F i_strCAL_NO
	final static Double i_strCAL_NO = null;
	// �� 8 �ϐ������l�F i_strUSER_CD
	final static String i_strUSER_CD = null;
	// �� 9 �ϐ������l�F i_strBUSINESS_OPR_DATE
	final static String i_strBUSINESS_OPR_DATE = null;
	// �� 10 �ϐ������l�F i_strMAX_DISPLAY_ROWNUM
	final static Double i_strMAX_DISPLAY_ROWNUM = null;
	// �� 11 �ϐ������l�F i_tAnsDlvDate_ODR_NO
	final static String i_tAnsDlvDate_ODR_NO = null;
	// �� 12 �ϐ������l�F i_tAnsDlvDate_PART_DLV_SEQ_NO
	final static String i_tAnsDlvDate_PART_DLV_SEQ_NO = null;
	// �� 13 �ϐ������l�F i_tAnsDlvDate_DESINATED_SHIP_DATE
	final static String i_tAnsDlvDate_DESINATED_SHIP_DATE = null;
	// �� 14 �ϐ������l�F i_tOdrODR_CTL_NO
	final static String i_tOdrODR_CTL_NO = null;
	// �� 15 �ϐ������l�F i_tOdrCtl_CUST_ITEM_CD
	final static String i_tOdrCtl_CUST_ITEM_CD = null;
	// �� 16 �ϐ������l�F i_tOdrCtl_ITEM_CD
	final static String i_tOdrCtl_ITEM_CD = null;
	// �� 17 �ϐ������l�F i_mCust_CUST_ANAME
	final static String i_mCust_CUST_ANAME = null;
	// �� 18 �ϐ������l�F i_tAnsDlvDate_REST_SHIP_ODR_QTY
	final static String i_tAnsDlvDate_REST_SHIP_ODR_QTY = null;
	// �� 19 �ϐ������l�F i_tOdr_TRANSPORT_TYP
	final static String i_tOdr_TRANSPORT_TYP = null;
	// �� 20 �ϐ������l�F i_tOdr_ODR_UNIT_PRICE
	final static String i_tOdr_ODR_UNIT_PRICE = null;
	// �� 21 �ϐ������l�F i_tOdr_SPCL_PRICE_TYP
	final static String i_tOdr_SPCL_PRICE_TYP = null;
	// �� 22 �ϐ������l�F i_tOdrCtl_CUST_CD
	final static String i_tOdrCtl_CUST_CD = null;
	// �� 23 �ϐ������l�F i_tOdr_PARTIAL_SHIP_INST_FLG
	final static String i_tOdr_PARTIAL_SHIP_INST_FLG = null;
	// �� 24 �ϐ������l�F i_tAnsDlvDate_MODIFY_COUNT
	final static String i_tAnsDlvDate_MODIFY_COUNT = null;
	// �� 25 �ϐ������l�F i_sysMyCompany_IN_COMPANYCD
	final static String i_sysMyCompany_IN_COMPANYCD = null;
	// �� 26 �ϐ������l�F i_tAnsDlvDate_IN_ODRNO
	final static String i_tAnsDlvDate_IN_ODRNO = null;
	// �� 27 �ϐ������l�F i_tAnsDlvDate_IN_PARTDLVSEQNO
	final static String i_tAnsDlvDate_IN_PARTDLVSEQNO = null;
	// �� 28 �ϐ������l�F i_up_tAnsDlvDate_DESINATED_SHIP_DATE
	final static String i_up_tAnsDlvDate_DESINATED_SHIP_DATE = null;
	// �� 29 �ϐ������l�F i_up_tAnsDlvDate_REST_SHIP_ODR_QTY
	final static String i_up_tAnsDlvDate_REST_SHIP_ODR_QTY = null;
	// �� 30 �ϐ������l�F i_up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG
	final static String i_up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG = null;
	// �� 31 �ϐ������l�F i_up_tAnsDlvDate_IN_ODRNO
	final static String i_up_tAnsDlvDate_IN_ODRNO = null;
	// �� 32 �ϐ������l�F i_up_tAnsDlvDate_IN_PARTDLVSEQNO
	final static String i_up_tAnsDlvDate_IN_PARTDLVSEQNO = null;
	// �� 33 �ϐ������l�F i_tShipOdr_ODR_NO
	final static String i_tShipOdr_ODR_NO = null;
	// �� 34 �ϐ������l�F i_tShipOdr_PART_DLV_SEQ_NO
	final static String i_tShipOdr_PART_DLV_SEQ_NO = null;
	// �� 35 �ϐ������l�F i_tShipOdr_SLIP_CD
	final static String i_tShipOdr_SLIP_CD = null;
	// �� 36 �ϐ������l�F i_tShipOdr_DESINATED_SHIP_DATE
	final static String i_tShipOdr_DESINATED_SHIP_DATE = null;
	// �� 37 �ϐ������l�F i_tShipOdr_SHIP_QTY
	final static String i_tShipOdr_SHIP_QTY = null;
	// �� 38 �ϐ������l�F i_tShipOdr_ALLCT_WH_CD
	final static String i_tShipOdr_ALLCT_WH_CD = null;
	// �� 39 �ϐ������l�F i_tShipOdr_CUST_NAME
	final static String i_tShipOdr_CUST_NAME = null;
	// �� 40 �ϐ������l�F i_tShipOdr_CUST_ITEM_CD
	final static String i_tShipOdr_CUST_ITEM_CD = null;
	// �� 41 �ϐ������l�F i_tShipOdr_ITEM_CD
	final static String i_tShipOdr_ITEM_CD = null;
	// �� 42 �ϐ������l�F i_tShipOdrAnsDlvDate_REST_SHIP_ODR_QTY
	final static String i_tShipOdrAnsDlvDate_REST_SHIP_ODR_QTY = null;
	// �� 43 �ϐ������l�F i_tShipOdr_DEL_FLG
	final static String i_tShipOdr_DEL_FLG = null;
	// �� 44 �ϐ������l�F i_tShipOdr_DIRECT_DLV_FLG
	final static String i_tShipOdr_DIRECT_DLV_FLG = null;
	// �� 45 �ϐ������l�F i_tShipOdr_TRANSPORT_TYP
	final static String i_tShipOdr_TRANSPORT_TYP = null;
	// �� 46 �ϐ������l�F i_tShipOdr_MODIFY_COUNT
	final static String i_tShipOdr_MODIFY_COUNT = null;
	// �� 47 �ϐ������l�F i_tShipOdr_IN_SLIPCD
	final static String i_tShipOdr_IN_SLIPCD = null;
	// �� 48 �ϐ������l�F i_in_tShipOdr_ODR_NO
	final static String i_in_tShipOdr_ODR_NO = null;
	// �� 49 �ϐ������l�F i_in_tShipOdr_PART_DLV_SEQ_NO
	final static String i_in_tShipOdr_PART_DLV_SEQ_NO = null;
	// �� 50 �ϐ������l�F i_in_tShipOdr_SLIP_CD
	final static String i_in_tShipOdr_SLIP_CD = null;
	// �� 51 �ϐ������l�F i_in_tShipOdr_ITEM_CD
	final static String i_in_tShipOdr_ITEM_CD = null;
	// �� 52 �ϐ������l�F i_in_tShipOdr_CUST_ITEM_CD
	final static String i_in_tShipOdr_CUST_ITEM_CD = null;
	// �� 53 �ϐ������l�F i_in_tShipOdr_CUST_ODR_NO
	final static String i_in_tShipOdr_CUST_ODR_NO = null;
	// �� 54 �ϐ������l�F i_in_tShipOdr_CUST_CD
	final static String i_in_tShipOdr_CUST_CD = null;
	// �� 55 �ϐ������l�F i_in_tShipOdr_CUST_NAME
	final static String i_in_tShipOdr_CUST_NAME = null;
	// �� 56 �ϐ������l�F i_in_tShipOdr_SHIP_ODR_ISS_PSN_CD
	final static String i_in_tShipOdr_SHIP_ODR_ISS_PSN_CD = null;
	// �� 57 �ϐ������l�F i_in_tShipOdr_DLV_LOC_CD
	final static String i_in_tShipOdr_DLV_LOC_CD = null;
	// �� 58 �ϐ������l�F i_in_tShipOdr_DESINATED_SHIP_DATE
	final static String i_in_tShipOdr_DESINATED_SHIP_DATE = null;
	// �� 59 �ϐ������l�F i_in_tShipOdr_SHIP_QTY
	final static String i_in_tShipOdr_SHIP_QTY = null;
	// �� 60 �ϐ������l�F i_in_tShipOdr_UNIT_PRICE
	final static String i_in_tShipOdr_UNIT_PRICE = null;
	// �� 61 �ϐ������l�F i_in_tShipOdr_SHIP_ODR_AMOUNT
	final static Double i_in_tShipOdr_SHIP_ODR_AMOUNT = null;
	// �� 62 �ϐ������l�F i_in_tShipOdr_CURRNCY_CD
	final static String i_in_tShipOdr_CURRNCY_CD = null;
	// �� 63 �ϐ������l�F i_in_tShipOdr_PKG_UNIT_QTY
	final static String i_in_tShipOdr_PKG_UNIT_QTY = null;
	// �� 64 �ϐ������l�F i_in_tShipOdr_CASE_QTY
	final static String i_in_tShipOdr_CASE_QTY = null;
	// �� 65 �ϐ������l�F i_in_tShipOdr_REST_QTY
	final static String i_in_tShipOdr_REST_QTY = null;
	// �� 66 �ϐ������l�F i_in_tShipOdr_TOTAL_CASE_QTY
	final static String i_in_tShipOdr_TOTAL_CASE_QTY = null;
	// �� 67 �ϐ������l�F i_in_tShipOdr_REMARKS
	final static String i_in_tShipOdr_REMARKS = null;
	// �� 68 �ϐ������l�F i_in_tShipOdr_ALLCT_WH_CD
	final static String i_in_tShipOdr_ALLCT_WH_CD = null;
	// �� 69 �ϐ������l�F i_in_tShipOdr_DEPO_TYP
	final static String i_in_tShipOdr_DEPO_TYP = null;
	// �� 70 �ϐ������l�F i_in_tShipOdr_ENTRY_TYP
	final static String i_in_tShipOdr_ENTRY_TYP = null;
	// �� 71 �ϐ������l�F i_in_tShipOdr_PRINT_FLG
	final static String i_in_tShipOdr_PRINT_FLG = null;
	// �� 72 �ϐ������l�F i_in_tShipOdr_SHP_CMPLT_FLG
	final static String i_in_tShipOdr_SHP_CMPLT_FLG = null;
	// �� 73 �ϐ������l�F i_in_tShipOdr_DEL_FLG
	final static String i_in_tShipOdr_DEL_FLG = null;
	// �� 74 �ϐ������l�F i_in_tShipOdr_TRANSPORT_CD
	final static String i_in_tShipOdr_TRANSPORT_CD = null;
	// �� 75 �ϐ������l�F i_in_tShipOdr_TRANSPORT_TYP
	final static String i_in_tShipOdr_TRANSPORT_TYP = null;
	// �� 76 �ϐ������l�F i_in_tShipOdr_DIRECT_DLV_FLG
	final static String i_in_tShipOdr_DIRECT_DLV_FLG = null;
	// �� 77 �ϐ������l�F i_in_tShipOdr_CUST_CHRG_PSN_CD
	final static String i_in_tShipOdr_CUST_CHRG_PSN_CD = null;
	// �� 78 �ϐ������l�F i_in_tShipOdr_UNIT_CD
	final static String i_in_tShipOdr_UNIT_CD = null;
	// �� 79 �ϐ������l�F i_in_tShipOdr_SCDL_DLV_DATE
	final static String i_in_tShipOdr_SCDL_DLV_DATE = null;
	// �� 80 �ϐ������l�F i_in_tShipOdr_TRANSFER_WH_CD
	final static String i_in_tShipOdr_TRANSFER_WH_CD = null;
	// �� 81 �ϐ������l�F i_in_tShipOdr_DLV_KEY_NO
	final static String i_in_tShipOdr_DLV_KEY_NO = null;
	// �� 82 �ϐ������l�F i_in_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES
	final static Double i_in_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES = null;
	// �� 83 �ϐ������l�F i_del_tShipOdr_IN_SLIPCD
	final static String i_del_tShipOdr_IN_SLIPCD = null;
	// �� 84 �ϐ������l�F i_seqShipSlipCd
	final static String i_seqShipSlipCd = null;
	// �� 85 �ϐ������l�F i_tOdr_ODR_NO
	final static String i_tOdr_ODR_NO = null;
	// �� 86 �ϐ������l�F i_tOdr_ODR_TYP
	final static String i_tOdr_ODR_TYP = null;
	// �� 87 �ϐ������l�F i_tOdr_ODR_CTL_NO
	final static String i_tOdr_ODR_CTL_NO = null;
	// �� 88 �ϐ������l�F i_tOdr_CUST_ODR_NO
	final static String i_tOdr_CUST_ODR_NO = null;
	// �� 89 �ϐ������l�F i_tOdr_CUST_CHRG_ORG_CD
	final static String i_tOdr_CUST_CHRG_ORG_CD = null;
	// �� 90 �ϐ������l�F i_tOdr_CUST_CHRG_PSN_CD
	final static String i_tOdr_CUST_CHRG_PSN_CD = null;
	// �� 91 �ϐ������l�F i_tOdr_ODR_ACPT_ORG_CD
	final static String i_tOdr_ODR_ACPT_ORG_CD = null;
	// �� 92 �ϐ������l�F i_tOdr_ODR_ACPT_PSN_CD
	final static String i_tOdr_ODR_ACPT_PSN_CD = null;
	// �� 93 �ϐ������l�F i_tOdr_CURRNCY_CD
	final static String i_tOdr_CURRNCY_CD = null;
	// �� 94 �ϐ������l�F i_tOdr_EXCH_TYP
	final static String i_tOdr_EXCH_TYP = null;
	// �� 95 �ϐ������l�F i_tOdr_DLV_LOC_CD
	final static String i_tOdr_DLV_LOC_CD = null;
	// �� 96 �ϐ������l�F i_tOdr_DLV_LOC_CD_EIAJ
	final static String i_tOdr_DLV_LOC_CD_EIAJ = null;
	// �� 97 �ϐ������l�F i_tOdr_DLV_LOC_NAME
	final static String i_tOdr_DLV_LOC_NAME = null;
	// �� 98 �ϐ������l�F i_tOdr_DLV_LOC_NAME_KANJI
	final static String i_tOdr_DLV_LOC_NAME_KANJI = null;
	// �� 99 �ϐ������l�F i_tOdr_PRD_ODR_PLACE_CD
	final static String i_tOdr_PRD_ODR_PLACE_CD = null;
	// �� 100 �ϐ������l�F i_tOdr_PART_DLV_COUNT
	final static String i_tOdr_PART_DLV_COUNT = null;
	// �� 101 �ϐ������l�F i_tOdr_DEPO_TYP
	final static String i_tOdr_DEPO_TYP = null;
	// �� 102 �ϐ������l�F i_tOdr_DESINATED_DLV_DATE
	final static String i_tOdr_DESINATED_DLV_DATE = null;
	// �� 103 �ϐ������l�F i_tOdr_STD_DESINATED_RCV_DATE
	final static String i_tOdr_STD_DESINATED_RCV_DATE = null;
	// �� 104 �ϐ������l�F i_tOdr_ODR_QTY
	final static String i_tOdr_ODR_QTY = null;
	// �� 105 �ϐ������l�F i_tOdr_REMAIN_UNCONFIRM_ODR_QTY
	final static String i_tOdr_REMAIN_UNCONFIRM_ODR_QTY = null;
	// �� 106 �ϐ������l�F i_tOdr_CANCELED_UNCONFIRM_ODR_QTY
	final static String i_tOdr_CANCELED_UNCONFIRM_ODR_QTY = null;
	// �� 107 �ϐ������l�F i_tOdr_UNIT_CD
	final static String i_tOdr_UNIT_CD = null;
	// �� 108 �ϐ������l�F i_tOdr_UNCONFIRM_ODR_BALANCE
	final static String i_tOdr_UNCONFIRM_ODR_BALANCE = null;
	// �� 109 �ϐ������l�F i_tOdr_ODR_AMOUNT
	final static String i_tOdr_ODR_AMOUNT = null;
	// �� 110 �ϐ������l�F i_tOdr_ODR_AMOUNT_EXCH_RATES
	final static String i_tOdr_ODR_AMOUNT_EXCH_RATES = null;
	// �� 111 �ϐ������l�F i_tOdr_TOTAL_SHIP_QTY
	final static String i_tOdr_TOTAL_SHIP_QTY = null;
	// �� 112 �ϐ������l�F i_tOdr_SHIP_AMOUNT
	final static String i_tOdr_SHIP_AMOUNT = null;
	// �� 113 �ϐ������l�F i_tOdr_SHIP_AMOUNT_EXCH_RATES
	final static String i_tOdr_SHIP_AMOUNT_EXCH_RATES = null;
	// �� 114 �ϐ������l�F i_tOdr_RETURN_PRICE
	final static String i_tOdr_RETURN_PRICE = null;
	// �� 115 �ϐ������l�F i_tOdr_RETURN_QTY
	final static String i_tOdr_RETURN_QTY = null;
	// �� 116 �ϐ������l�F i_tOdr_RETURN_AMOUNT
	final static String i_tOdr_RETURN_AMOUNT = null;
	// �� 117 �ϐ������l�F i_tOdr_RETURN_AMOUNT_EXCH_RATES
	final static String i_tOdr_RETURN_AMOUNT_EXCH_RATES = null;
	// �� 118 �ϐ������l�F i_tOdr_ODR_CMPLT_FLG
	final static String i_tOdr_ODR_CMPLT_FLG = null;
	// �� 119 �ϐ������l�F i_tOdr_ODR_CMPLT_DATE
	final static String i_tOdr_ODR_CMPLT_DATE = null;
	// �� 120 �ϐ������l�F i_tOdr_CUS_DLV_CD
	final static String i_tOdr_CUS_DLV_CD = null;
	// �� 121 �ϐ������l�F i_tOdr_CUS_DLV_KEY_CD
	final static String i_tOdr_CUS_DLV_KEY_CD = null;
	// �� 122 �ϐ������l�F i_tOdr_PART_NAME
	final static String i_tOdr_PART_NAME = null;
	// �� 123 �ϐ������l�F i_tOdr_PKG_UNIT
	final static String i_tOdr_PKG_UNIT = null;
	// �� 124 �ϐ������l�F i_tOdr_SLIP_PRICE_PRINT_TYP
	final static String i_tOdr_SLIP_PRICE_PRINT_TYP = null;
	// �� 125 �ϐ������l�F i_tOdr_INSPC_TYP
	final static String i_tOdr_INSPC_TYP = null;
	// �� 126 �ϐ������l�F i_tOdr_CLIENT_REMARK
	final static String i_tOdr_CLIENT_REMARK = null;
	// �� 127 �ϐ������l�F i_tOdr_CLIENT_REMARK_KANJI
	final static String i_tOdr_CLIENT_REMARK_KANJI = null;
	// �� 128 �ϐ������l�F i_tOdr_CLIENT_BARCODE_INF
	final static String i_tOdr_CLIENT_BARCODE_INF = null;
	// �� 129 �ϐ������l�F i_tOdr_TRANSPORT_CD
	final static String i_tOdr_TRANSPORT_CD = null;
	// �� 130 �ϐ������l�F i_tOdr_TAX_APPLY_TYP
	final static String i_tOdr_TAX_APPLY_TYP = null;
	// �� 131 �ϐ������l�F i_tOdr_TAX_CD
	final static String i_tOdr_TAX_CD = null;
	// �� 132 �ϐ������l�F i_tOdr_TAX_CALC_TYP
	final static String i_tOdr_TAX_CALC_TYP = null;
	// �� 133 �ϐ������l�F i_tOdr_REMARKS
	final static String i_tOdr_REMARKS = null;
	// �� 134 �ϐ������l�F i_tOdr_ODR_ACPT_DATE
	final static String i_tOdr_ODR_ACPT_DATE = null;
	// �� 135 �ϐ������l�F i_tOdr_SHIP_PLAN_REMAIN_QTY
	final static String i_tOdr_SHIP_PLAN_REMAIN_QTY = null;
	// �� 136 �ϐ������l�F i_tOdr_SHIP_PLAN_CMPLT_FLG
	final static String i_tOdr_SHIP_PLAN_CMPLT_FLG = null;
	// �� 137 �ϐ������l�F i_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG
	final static String i_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG = null;
	// �� 138 �ϐ������l�F i_tOdr_IF_CTL_NO
	final static String i_tOdr_IF_CTL_NO = null;
	// �� 139 �ϐ������l�F i_tOdr_ENTRY_TYP
	final static String i_tOdr_ENTRY_TYP = null;
	// �� 140 �ϐ������l�F i_tOdr_BUYER_NAME
	final static String i_tOdr_BUYER_NAME = null;
	// �� 141 �ϐ������l�F i_tOdr_PUCH_ODR_QTY_TOTAL
	final static String i_tOdr_PUCH_ODR_QTY_TOTAL = null;
	// �� 142 �ϐ������l�F i_tOdr_UNIT_CD_ORG
	final static String i_tOdr_UNIT_CD_ORG = null;
	// �� 143 �ϐ������l�F i_tOdr_SHIP_CNT
	final static String i_tOdr_SHIP_CNT = null;
	// �� 144 �ϐ������l�F i_tOdr_IN_ODRNO
	final static String i_tOdr_IN_ODRNO = null;
	// �� 145 �ϐ������l�F i_uptOdr_SHIP_CNT
	final static String i_uptOdr_SHIP_CNT = null;
	// �� 146 �ϐ������l�F i_uptOdr_IN_ODRNO
	final static String i_uptOdr_IN_ODRNO = null;
	// �� 147 �ϐ������l�F i_mItem_ITEM_CD
	final static String i_mItem_ITEM_CD = null;
	// �� 148 �ϐ������l�F i_mItem_ITEM_NAME
	final static String i_mItem_ITEM_NAME = null;
	// �� 149 �ϐ������l�F i_mItem_PRODUCT_TYP
	final static String i_mItem_PRODUCT_TYP = null;
	// �� 150 �ϐ������l�F i_mItem_MRP_ODR_TYP
	final static String i_mItem_MRP_ODR_TYP = null;
	// �� 151 �ϐ������l�F i_mItem_DRAW_CD
	final static String i_mItem_DRAW_CD = null;
	// �� 152 �ϐ������l�F i_mItem_SPEC
	final static String i_mItem_SPEC = null;
	// �� 153 �ϐ������l�F i_mItem_HIGH_LEVEL_NO
	final static String i_mItem_HIGH_LEVEL_NO = null;
	// �� 154 �ϐ������l�F i_mItem_OUTSIDE_TYP
	final static String i_mItem_OUTSIDE_TYP = null;
	// �� 155 �ϐ������l�F i_mItem_STOCK_UNIT_FLG
	final static String i_mItem_STOCK_UNIT_FLG = null;
	// �� 156 �ϐ������l�F i_mItem_STOCK_UNIT
	final static String i_mItem_STOCK_UNIT = null;
	// �� 157 �ϐ������l�F i_mItem_PKG_UNIT
	final static String i_mItem_PKG_UNIT = null;
	// �� 158 �ϐ������l�F i_mItem_PKG_UNIT_QTY
	final static String i_mItem_PKG_UNIT_QTY = null;
	// �� 159 �ϐ������l�F i_mItem_UNIT_QTY_TYP
	final static String i_mItem_UNIT_QTY_TYP = null;
	// �� 160 �ϐ������l�F i_mItem_ODR_LT
	final static String i_mItem_ODR_LT = null;
	// �� 161 �ϐ������l�F i_mItem_FIXED_LT
	final static String i_mItem_FIXED_LT = null;
	// �� 162 �ϐ������l�F i_mItem_PROP_LT
	final static String i_mItem_PROP_LT = null;
	// �� 163 �ϐ������l�F i_mItem_SAFETY_LT
	final static String i_mItem_SAFETY_LT = null;
	// �� 164 �ϐ������l�F i_mItem_ISSUE_LT
	final static String i_mItem_ISSUE_LT = null;
	// �� 165 �ϐ������l�F i_mItem_PROP_LOT_SIZE
	final static String i_mItem_PROP_LOT_SIZE = null;
	// �� 166 �ϐ������l�F i_mItem_ITEM_SPOIL
	final static String i_mItem_ITEM_SPOIL = null;
	// �� 167 �ϐ������l�F i_mItem_SAFETY_STOCK
	final static String i_mItem_SAFETY_STOCK = null;
	// �� 168 �ϐ������l�F i_mItem_LOT_SIZING_TYP
	final static String i_mItem_LOT_SIZING_TYP = null;
	// �� 169 �ϐ������l�F i_mItem_MAX_PERIOD
	final static String i_mItem_MAX_PERIOD = null;
	// �� 170 �ϐ������l�F i_mItem_MAX_ODR_QTY
	final static String i_mItem_MAX_ODR_QTY = null;
	// �� 171 �ϐ������l�F i_mItem_ODR_POINT
	final static String i_mItem_ODR_POINT = null;
	// �� 172 �ϐ������l�F i_mItem_FIXED_ODR_QTY
	final static String i_mItem_FIXED_ODR_QTY = null;
	// �� 173 �ϐ������l�F i_mItem_MIN_ODR_QTY
	final static String i_mItem_MIN_ODR_QTY = null;
	// �� 174 �ϐ������l�F i_mItem_MUL_ODR_QTY
	final static String i_mItem_MUL_ODR_QTY = null;
	// �� 175 �ϐ������l�F i_mItem_ISSUE_TYP
	final static String i_mItem_ISSUE_TYP = null;
	// �� 176 �ϐ������l�F i_mItem_MPS_FLG
	final static String i_mItem_MPS_FLG = null;
	// �� 177 �ϐ������l�F i_mItem_ACPT_INSPC_TYP
	final static String i_mItem_ACPT_INSPC_TYP = null;
	// �� 178 �ϐ������l�F i_mItem_CLASIFICATION_CD
	final static String i_mItem_CLASIFICATION_CD = null;
	// �� 179 �ϐ������l�F i_mItem_UNIT_WEIGHT
	final static String i_mItem_UNIT_WEIGHT = null;
	// �� 180 �ϐ������l�F i_mItem_ABC_TYP
	final static String i_mItem_ABC_TYP = null;
	// �� 181 �ϐ������l�F i_mItem_OPR_RSLT_TYP
	final static String i_mItem_OPR_RSLT_TYP = null;
	// �� 182 �ϐ������l�F i_mItem_SPL_ITEM_TYP
	final static String i_mItem_SPL_ITEM_TYP = null;
	// �� 183 �ϐ������l�F i_mItem_TAX_CD
	final static String i_mItem_TAX_CD = null;
	// �� 184 �ϐ������l�F i_mItem_IN_ITEMCD
	final static String i_mItem_IN_ITEMCD = null;
	// �� 185 �ϐ������l�F i_tOdrCtl_ODR_CTL_NO
	final static String i_tOdrCtl_ODR_CTL_NO = null;
	// �� 186 �ϐ������l�F i_tOdrCtl_CUST_ITEM_NAME
	final static String i_tOdrCtl_CUST_ITEM_NAME = null;
	// �� 187 �ϐ������l�F i_tOdrCtl_ITEM_NAME
	final static String i_tOdrCtl_ITEM_NAME = null;
	// �� 188 �ϐ������l�F i_tOdrCtl_IN_ODRCTLNO
	final static String i_tOdrCtl_IN_ODRCTLNO = null;
	// �� 189 �ϐ������l�F i_in_tShipSlip_SLIP_CD
	final static String i_in_tShipSlip_SLIP_CD = null;
	// �� 190 �ϐ������l�F i_in_tShipSlip_ITEM_CD
	final static String i_in_tShipSlip_ITEM_CD = null;
	// �� 191 �ϐ������l�F i_in_tShipSlip_CUST_ITEM_CD
	final static String i_in_tShipSlip_CUST_ITEM_CD = null;
	// �� 192 �ϐ������l�F i_in_tShipSlip_PART_NAME
	final static String i_in_tShipSlip_PART_NAME = null;
	// �� 193 �ϐ������l�F i_in_tShipSlip_CUST_ODR_NO
	final static String i_in_tShipSlip_CUST_ODR_NO = null;
	// �� 194 �ϐ������l�F i_in_tShipSlip_CUST_CD
	final static String i_in_tShipSlip_CUST_CD = null;
	// �� 195 �ϐ������l�F i_in_tShipSlip_CUST_NAME
	final static String i_in_tShipSlip_CUST_NAME = null;
	// �� 196 �ϐ������l�F i_in_tShipSlip_DLV_LOC_CD
	final static String i_in_tShipSlip_DLV_LOC_CD = null;
	// �� 197 �ϐ������l�F i_in_tShipSlip_DLV_LOC_NAME_KANJI
	final static String i_in_tShipSlip_DLV_LOC_NAME_KANJI = null;
	// �� 198 �ϐ������l�F i_in_tShipSlip_SHIP_ODR_ISS_PSN_NAME
	final static String i_in_tShipSlip_SHIP_ODR_ISS_PSN_NAME = null;
	// �� 199 �ϐ������l�F i_in_tShipSlip_CUS_DLV_CD
	final static String i_in_tShipSlip_CUS_DLV_CD = null;
	// �� 200 �ϐ������l�F i_in_tShipSlip_CUS_DLV_KEY_CD
	final static String i_in_tShipSlip_CUS_DLV_KEY_CD = null;
	// �� 201 �ϐ������l�F i_in_tShipSlip_TRANSPORT_CD
	final static String i_in_tShipSlip_TRANSPORT_CD = null;
	// �� 202 �ϐ������l�F i_in_tShipSlip_TRANSPORT_TYP
	final static String i_in_tShipSlip_TRANSPORT_TYP = null;
	// �� 203 �ϐ������l�F i_in_tShipSlip_DESINATED_SHIP_DATE
	final static String i_in_tShipSlip_DESINATED_SHIP_DATE = null;
	// �� 204 �ϐ������l�F i_in_tShipSlip_DESINATED_DLV_DATE
	final static String i_in_tShipSlip_DESINATED_DLV_DATE = null;
	// �� 205 �ϐ������l�F i_in_tShipSlip_SCDL_DLV_DATE
	final static String i_in_tShipSlip_SCDL_DLV_DATE = null;
	// �� 206 �ϐ������l�F i_in_tShipSlip_SHIP_ODR_QTY
	final static String i_in_tShipSlip_SHIP_ODR_QTY = null;
	// �� 207 �ϐ������l�F i_in_tShipSlip_UNIT_CD
	final static String i_in_tShipSlip_UNIT_CD = null;
	// �� 208 �ϐ������l�F i_in_tShipSlip_UNIT_PRICE
	final static String i_in_tShipSlip_UNIT_PRICE = null;
	// �� 209 �ϐ������l�F i_in_tShipSlip_SHIP_ODR_AMOUNT
	final static String i_in_tShipSlip_SHIP_ODR_AMOUNT = null;
	// �� 210 �ϐ������l�F i_in_tShipSlip_TAX_AMOUNT
	final static String i_in_tShipSlip_TAX_AMOUNT = null;
	// �� 211 �ϐ������l�F i_in_tShipSlip_CURRNCY_CD
	final static String i_in_tShipSlip_CURRNCY_CD = null;
	// �� 212 �ϐ������l�F i_in_tShipSlip_INSPC_TYP
	final static String i_in_tShipSlip_INSPC_TYP = null;
	// �� 213 �ϐ������l�F i_in_tShipSlip_CLIENT_REMARK_KANJI
	final static String i_in_tShipSlip_CLIENT_REMARK_KANJI = null;
	// �� 214 �ϐ������l�F i_in_tShipSlip_CLIENT_BARCODE_INF
	final static String i_in_tShipSlip_CLIENT_BARCODE_INF = null;
	// �� 215 �ϐ������l�F i_in_tShipSlip_PKG_UNIT_QTY
	final static String i_in_tShipSlip_PKG_UNIT_QTY = null;
	// �� 216 �ϐ������l�F i_in_tShipSlip_CASE_QTY
	final static String i_in_tShipSlip_CASE_QTY = null;
	// �� 217 �ϐ������l�F i_in_tShipSlip_REST_QTY
	final static String i_in_tShipSlip_REST_QTY = null;
	// �� 218 �ϐ������l�F i_in_tShipSlip_TOTAL_CASE_QTY
	final static String i_in_tShipSlip_TOTAL_CASE_QTY = null;
	// �� 219 �ϐ������l�F i_in_tShipSlip_TOTAL_WEIGHT
	final static String i_in_tShipSlip_TOTAL_WEIGHT = null;
	// �� 220 �ϐ������l�F i_in_tShipSlip_ALLCT_WH_CD
	final static String i_in_tShipSlip_ALLCT_WH_CD = null;
	// �� 221 �ϐ������l�F i_in_tShipSlip_PRINT_FLG
	final static String i_in_tShipSlip_PRINT_FLG = null;
	// �� 222 �ϐ������l�F i_in_tShipSlip_DEL_FLG
	final static String i_in_tShipSlip_DEL_FLG = null;
	// �� 223 �ϐ������l�F i_in_tShipSlip_BUYER_NAME
	final static String i_in_tShipSlip_BUYER_NAME = null;
	// �� 224 �ϐ������l�F i_in_tShipSlip_PUCH_ODR_QTY_TOTAL
	final static String i_in_tShipSlip_PUCH_ODR_QTY_TOTAL = null;
	// �� 225 �ϐ������l�F i_in_tShipSlip_DLV_ODR_QTY
	final static String i_in_tShipSlip_DLV_ODR_QTY = null;
	// �� 226 �ϐ������l�F i_in_tShipSlip_SHIP_ODR_AMOUNT_TAX
	final static String i_in_tShipSlip_SHIP_ODR_AMOUNT_TAX = null;
	// �� 227 �ϐ������l�F i_in_tShipSlip_SHIP_ODR_AMOUNT_EXCH_RATES
	final static String i_in_tShipSlip_SHIP_ODR_AMOUNT_EXCH_RATES = null;
	// �� 228 �ϐ������l�F i_del_tShipSlip_IN_SLIPCD
	final static String i_del_tShipSlip_IN_SLIPCD = null;
	// �� 229 �ϐ������l�F i_mCustBase_COMPANY_CD
	final static String i_mCustBase_COMPANY_CD = null;
	// �� 230 �ϐ������l�F i_mCustBase_CUST_CD
	final static String i_mCustBase_CUST_CD = null;
	// �� 231 �ϐ������l�F i_mCustBase_DLV_LOC_CD
	final static String i_mCustBase_DLV_LOC_CD = null;
	// �� 232 �ϐ������l�F i_mCustBase_DLV_LOC_NAME
	final static String i_mCustBase_DLV_LOC_NAME = null;
	// �� 233 �ϐ������l�F i_mCustBase_DLV_LOC_KNAME
	final static String i_mCustBase_DLV_LOC_KNAME = null;
	// �� 234 �ϐ������l�F i_mCustBase_DLV_LOC_ENAME
	final static String i_mCustBase_DLV_LOC_ENAME = null;
	// �� 235 �ϐ������l�F i_mCustBase_ZIP_CD
	final static String i_mCustBase_ZIP_CD = null;
	// �� 236 �ϐ������l�F i_mCustBase_ADDRESS_1
	final static String i_mCustBase_ADDRESS_1 = null;
	// �� 237 �ϐ������l�F i_mCustBase_ADDRESS_2
	final static String i_mCustBase_ADDRESS_2 = null;
	// �� 238 �ϐ������l�F i_mCustBase_ADDRESS_K_1
	final static String i_mCustBase_ADDRESS_K_1 = null;
	// �� 239 �ϐ������l�F i_mCustBase_ADDRESS_K_2
	final static String i_mCustBase_ADDRESS_K_2 = null;
	// �� 240 �ϐ������l�F i_mCustBase_TEL
	final static String i_mCustBase_TEL = null;
	// �� 241 �ϐ������l�F i_mCustBase_FAX
	final static String i_mCustBase_FAX = null;
	// �� 242 �ϐ������l�F i_mCustBase_SHIP_WH_CD
	final static String i_mCustBase_SHIP_WH_CD = null;
	// �� 243 �ϐ������l�F i_mCustBase_TRANSPORT_CD
	final static String i_mCustBase_TRANSPORT_CD = null;
	// �� 244 �ϐ������l�F i_mCustBase_TRANSPORT_NAME
	final static String i_mCustBase_TRANSPORT_NAME = null;
	// �� 245 �ϐ������l�F i_mCustBase_TRANSPORT_LT
	final static String i_mCustBase_TRANSPORT_LT = null;
	// �� 246 �ϐ������l�F i_mCustBase_CAL_NO
	final static String i_mCustBase_CAL_NO = null;
	// �� 247 �ϐ������l�F i_mCustBase_TRANSPORT_TYP
	final static String i_mCustBase_TRANSPORT_TYP = null;
	// �� 248 �ϐ������l�F i_mCustBase_DLV_START_TIME
	final static String i_mCustBase_DLV_START_TIME = null;
	// �� 249 �ϐ������l�F i_mCustBase_DLV_END_TIME
	final static String i_mCustBase_DLV_END_TIME = null;
	// �� 250 �ϐ������l�F i_mCustBase_AREA_CLASS_TYP1
	final static String i_mCustBase_AREA_CLASS_TYP1 = null;
	// �� 251 �ϐ������l�F i_mCustBase_AREA_CLASS_1
	final static String i_mCustBase_AREA_CLASS_1 = null;
	// �� 252 �ϐ������l�F i_mCustBase_AREA_CLASS_TYP2
	final static String i_mCustBase_AREA_CLASS_TYP2 = null;
	// �� 253 �ϐ������l�F i_mCustBase_AREA_CLASS_2
	final static String i_mCustBase_AREA_CLASS_2 = null;
	// �� 254 �ϐ������l�F i_mCustBase_AREA_CLASS_TYP3
	final static String i_mCustBase_AREA_CLASS_TYP3 = null;
	// �� 255 �ϐ������l�F i_mCustBase_AREA_CLASS_3
	final static String i_mCustBase_AREA_CLASS_3 = null;
	// �� 256 �ϐ������l�F i_mCustBase_REMARKS_1
	final static String i_mCustBase_REMARKS_1 = null;
	// �� 257 �ϐ������l�F i_mCustBase_REMARKS_2
	final static String i_mCustBase_REMARKS_2 = null;
	// �� 258 �ϐ������l�F i_mCustBase_REMARKS_3
	final static String i_mCustBase_REMARKS_3 = null;
	// �� 259 �ϐ������l�F i_mCustBase_DEL_FLG
	final static String i_mCustBase_DEL_FLG = null;
	// �� 260 �ϐ������l�F i_mCustBase_DEPO_WH_CD
	final static String i_mCustBase_DEPO_WH_CD = null;
	// �� 261 �ϐ������l�F i_mCustBase_IN_COMPANYCD
	final static String i_mCustBase_IN_COMPANYCD = null;
	// �� 262 �ϐ������l�F i_mCustBase_IN_CUSTCD
	final static String i_mCustBase_IN_CUSTCD = null;
	// �� 263 �ϐ������l�F i_mCustBase_IN_DLVLOCCD
	final static String i_mCustBase_IN_DLVLOCCD = null;
	// �� 264 �ϐ������l�F i_mCust_COMPANY_CD
	final static String i_mCust_COMPANY_CD = null;
	// �� 265 �ϐ������l�F i_mCust_CUST_CD
	final static String i_mCust_CUST_CD = null;
	// �� 266 �ϐ������l�F i_mCust_CUST_NAME
	final static String i_mCust_CUST_NAME = null;
	// �� 267 �ϐ������l�F i_mCust_CUST_KNAME
	final static String i_mCust_CUST_KNAME = null;
	// �� 268 �ϐ������l�F i_mCust_OWN_ORG_CD
	final static String i_mCust_OWN_ORG_CD = null;
	// �� 269 �ϐ������l�F i_mCust_OWN_PERSON_CD
	final static String i_mCust_OWN_PERSON_CD = null;
	// �� 270 �ϐ������l�F i_mCust_CUR_CD
	final static String i_mCust_CUR_CD = null;
	// �� 271 �ϐ������l�F i_mCust_EXCH_TYP
	final static String i_mCust_EXCH_TYP = null;
	// �� 272 �ϐ������l�F i_mCust_TAX_APPLY_TYP
	final static String i_mCust_TAX_APPLY_TYP = null;
	// �� 273 �ϐ������l�F i_mCust_TAX_CD
	final static String i_mCust_TAX_CD = null;
	// �� 274 �ϐ������l�F i_mCust_TAX_CALC_TYP
	final static String i_mCust_TAX_CALC_TYP = null;
	// �� 275 �ϐ������l�F i_mCust_PRICE_ROUND_TYP
	final static String i_mCust_PRICE_ROUND_TYP = null;
	// �� 276 �ϐ������l�F i_mCust_DETAIL_ROUND_TYP
	final static String i_mCust_DETAIL_ROUND_TYP = null;
	// �� 277 �ϐ������l�F i_mCust_UNCONFIRM_ODR_EFF_PRIOD
	final static String i_mCust_UNCONFIRM_ODR_EFF_PRIOD = null;
	// �� 278 �ϐ������l�F i_mCust_UNCONFIRM_ODR_EFF_TERM_FLG
	final static String i_mCust_UNCONFIRM_ODR_EFF_TERM_FLG = null;
	// �� 279 �ϐ������l�F i_mCust_EDI_CUST_VEND_CD
	final static String i_mCust_EDI_CUST_VEND_CD = null;
	// �� 280 �ϐ������l�F i_mCust_PARTIAL_SHIP_INST_FLG
	final static String i_mCust_PARTIAL_SHIP_INST_FLG = null;
	// �� 281 �ϐ������l�F i_mCust_DEPO_TYP
	final static String i_mCust_DEPO_TYP = null;
	// �� 282 �ϐ������l�F i_mCust_INSPC_ACPT_TYP
	final static String i_mCust_INSPC_ACPT_TYP = null;
	// �� 283 �ϐ������l�F i_mCust_IN_COMPANYCD
	final static String i_mCust_IN_COMPANYCD = null;
	// �� 284 �ϐ������l�F i_mCust_IN_CUSTCD
	final static String i_mCust_IN_CUSTCD = null;
	// �� 285 �ϐ������l�F i_tori_tAnsDlvDate_REST_SHIP_ODR_QTY
	final static String i_tori_tAnsDlvDate_REST_SHIP_ODR_QTY = null;
	// �� 286 �ϐ������l�F i_tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG
	final static String i_tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG = null;
	// �� 287 �ϐ������l�F i_tori_tAnsDlvDate_IN_ODRNO
	final static String i_tori_tAnsDlvDate_IN_ODRNO = null;
	// �� 288 �ϐ������l�F i_tori_tAnsDlvDate_IN_PARTDLVSEQNO
	final static String i_tori_tAnsDlvDate_IN_PARTDLVSEQNO = null;
	// �� 289 �ϐ������l�F i_chkisWhCd_WH_CD
	final static String i_chkisWhCd_WH_CD = null;
	// �� 290 �ϐ������l�F i_chkisWhCd_WH_TYP
	final static String i_chkisWhCd_WH_TYP = null;
	// �� 291 �ϐ������l�F i_chkisWhCd_ITEM_CD
	final static String i_chkisWhCd_ITEM_CD = null;
	// �� 292 �ϐ������l�F i_chkisWhCd_PBL_SHIP_QTY
	final static String i_chkisWhCd_PBL_SHIP_QTY = null;
	// �� 293 �ϐ������l�F i_chkisWhCd_IN_ITEMCD
	final static String i_chkisWhCd_IN_ITEMCD = null;
	// �� 294 �ϐ������l�F i_chkisWhCd_IN_WHCD
	final static String i_chkisWhCd_IN_WHCD = null;
	// �� 295 �ϐ������l�F i_mUnitCost_UNIT_COST
	final static String i_mUnitCost_UNIT_COST = null;
	// �� 296 �ϐ������l�F i_mUnitCost_EFF_PHASE_IN_DATE
	final static String i_mUnitCost_EFF_PHASE_IN_DATE = null;
	// �� 297 �ϐ������l�F i_mUnitCost_IN_COMPANYCD
	final static String i_mUnitCost_IN_COMPANYCD = null;
	// �� 298 �ϐ������l�F i_mUnitCost_IN_CUSTCD
	final static String i_mUnitCost_IN_CUSTCD = null;
	// �� 299 �ϐ������l�F i_mUnitCost_IN_ITEMCD
	final static String i_mUnitCost_IN_ITEMCD = null;
	// �� 300 �ϐ������l�F i_mUnitCost_IN_EFFPHASEINDATE
	final static String i_mUnitCost_IN_EFFPHASEINDATE = null;
	// �� 301 �ϐ������l�F i_mWhWH_CD
	final static String i_mWhWH_CD = null;
	// �� 302 �ϐ������l�F i_mWhWH_NAME
	final static String i_mWhWH_NAME = null;
	// �� 303 �ϐ������l�F i_strTaxTAX_KBN
	final static String i_strTaxTAX_KBN = null;
	// �� 304 �ϐ������l�F i_strTaxOLD_TAX
	final static String i_strTaxOLD_TAX = null;
	// �� 305 �ϐ������l�F i_strTaxNEW_TAX
	final static String i_strTaxNEW_TAX = null;
	// �� 306 �ϐ������l�F i_strTaxSTART_DATE
	final static String i_strTaxSTART_DATE = null;
	// �� 307 �ϐ������l�F i_strTaxROUND_TYP
	final static String i_strTaxROUND_TYP = null;
	// �� 308 �ϐ������l�F i_strTaxIN_COMPANYCD
	final static String i_strTaxIN_COMPANYCD = null;
	// �� 309 �ϐ������l�F i_strTaxIN_CUSTCD
	final static String i_strTaxIN_CUSTCD = null;
	// �� 310 �ϐ������l�F i_g_CUST_ITEM_CD
	final static String i_g_CUST_ITEM_CD = null;
	// �� 311 �ϐ������l�F i_strYotaku_WH_CD
	final static String i_strYotaku_WH_CD = null;
	// �� 312 �ϐ������l�F i_strYotaku_IN_WH_TYP
	final static String i_strYotaku_IN_WH_TYP = null;
	// �� 313 �ϐ������l�F i_strSYUKA_LT
	final static String i_strSYUKA_LT = null;
	// �� 314 �ϐ������l�F i_chkisinWhCd_WH_CD
	final static String i_chkisinWhCd_WH_CD = null;
	// �� 315 �ϐ������l�F i_chkisinWhCd_WH_TYP
	final static String i_chkisinWhCd_WH_TYP = null;
	// �� 316 �ϐ������l�F i_chkis_IN_WHCD
	final static String i_chkis_IN_WHCD = null;
	// �� 317 �ϐ������l�F i_g_PART_DLV_SEQ_NO
	final static String i_g_PART_DLV_SEQ_NO = null;
	// �� 318 �ϐ������l�F i_g_DIRECT_DLV_FLG
	final static String i_g_DIRECT_DLV_FLG = null;
	// �� 319 �ϐ������l�F i_g_REST_SHIP_ODR_QTY
	final static String i_g_REST_SHIP_ODR_QTY = null;
	// �� 320 �ϐ������l�F i_g_CUST_ANAME
	final static String i_g_CUST_ANAME = null;
	// �� 321 �ϐ������l�F i_g_ITEM_CD
	final static String i_g_ITEM_CD = null;
	// �� 322 �ϐ������l�F i_k_MODE
	final static String i_k_MODE = null;
	// �� 323 �ϐ������l�F i_h_RESULT
	final static String i_h_RESULT = null;
	// �� 324 �ϐ������l�F i_h_REST_SHIP_ODR_QTY
	final static String i_h_REST_SHIP_ODR_QTY = null;
	// �� 325 �ϐ������l�F i_h_CUST_ANAME
	final static String i_h_CUST_ANAME = null;
	// �� 326 �ϐ������l�F i_h_CUST_ITEM_CD
	final static String i_h_CUST_ITEM_CD = null;
	// �� 327 �ϐ������l�F i_h_ITEM_CD
	final static String i_h_ITEM_CD = null;
	// �� 328 �ϐ������l�F i_h_AP_SECRTY_TYP
	final static String i_h_AP_SECRTY_TYP = null;
	// �� 329 �ϐ������l�F i_h_MODIFY_CNT
	final static String i_h_MODIFY_CNT = null;
	// �� 330 �ϐ������l�F i_r_SEL_PTN1
	final static String i_r_SEL_PTN1 = null;
	// �� 331 �ϐ������l�F i_r_SEL_PTN2
	final static String i_r_SEL_PTN2 = null;
	// �� 332 �ϐ������l�F i_g_ODR_NO
	final static String i_g_ODR_NO = null;
	// �� 333 �ϐ������l�F i_g_SLIP_CD
	final static String i_g_SLIP_CD = null;
	// �� 334 �ϐ������l�F i_g_DESINATED_SHIP_DATE
	final static String i_g_DESINATED_SHIP_DATE = null;
	// �� 335 �ϐ������l�F i_g_REST_SHIP_ODR_QTY2
	final static String i_g_REST_SHIP_ODR_QTY2 = null;
	// �� 336 �ϐ������l�F i_g_WH_CD
	final static String i_g_WH_CD = null;

	/**
	 * ������
	 *
	 */
	public void initialize()
	{

		clear();

		m_strCOMPANY_CD = i_strCOMPANY_CD;
		m_strUSER_NAME = i_strUSER_NAME;
		m_strPLANT_CD = i_strPLANT_CD;
		m_strSECTION_CD = i_strSECTION_CD;
		m_strPLANT_NAME = i_strPLANT_NAME;
		m_strPLANT_ANAME = i_strPLANT_ANAME;
		m_strCAL_NO = i_strCAL_NO;
		m_strUSER_CD = i_strUSER_CD;
		m_strBUSINESS_OPR_DATE = i_strBUSINESS_OPR_DATE;
		m_strMAX_DISPLAY_ROWNUM = i_strMAX_DISPLAY_ROWNUM;
		m_tAnsDlvDate_ODR_NO = i_tAnsDlvDate_ODR_NO;
		m_tAnsDlvDate_PART_DLV_SEQ_NO = i_tAnsDlvDate_PART_DLV_SEQ_NO;
		m_tAnsDlvDate_DESINATED_SHIP_DATE = i_tAnsDlvDate_DESINATED_SHIP_DATE;
		m_tOdrODR_CTL_NO = i_tOdrODR_CTL_NO;
		m_tOdrCtl_CUST_ITEM_CD = i_tOdrCtl_CUST_ITEM_CD;
		m_tOdrCtl_ITEM_CD = i_tOdrCtl_ITEM_CD;
		m_mCust_CUST_ANAME = i_mCust_CUST_ANAME;
		m_tAnsDlvDate_REST_SHIP_ODR_QTY = i_tAnsDlvDate_REST_SHIP_ODR_QTY;
		m_tOdr_TRANSPORT_TYP = i_tOdr_TRANSPORT_TYP;
		m_tOdr_ODR_UNIT_PRICE = i_tOdr_ODR_UNIT_PRICE;
		m_tOdr_SPCL_PRICE_TYP = i_tOdr_SPCL_PRICE_TYP;
		m_tOdrCtl_CUST_CD = i_tOdrCtl_CUST_CD;
		m_tOdr_PARTIAL_SHIP_INST_FLG = i_tOdr_PARTIAL_SHIP_INST_FLG;
		m_tAnsDlvDate_MODIFY_COUNT = i_tAnsDlvDate_MODIFY_COUNT;
		m_sysMyCompany_IN_COMPANYCD = i_sysMyCompany_IN_COMPANYCD;
		m_tAnsDlvDate_IN_ODRNO = i_tAnsDlvDate_IN_ODRNO;
		m_tAnsDlvDate_IN_PARTDLVSEQNO = i_tAnsDlvDate_IN_PARTDLVSEQNO;
		m_up_tAnsDlvDate_DESINATED_SHIP_DATE = i_up_tAnsDlvDate_DESINATED_SHIP_DATE;
		m_up_tAnsDlvDate_REST_SHIP_ODR_QTY = i_up_tAnsDlvDate_REST_SHIP_ODR_QTY;
		m_up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG = i_up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG;
		m_up_tAnsDlvDate_IN_ODRNO = i_up_tAnsDlvDate_IN_ODRNO;
		m_up_tAnsDlvDate_IN_PARTDLVSEQNO = i_up_tAnsDlvDate_IN_PARTDLVSEQNO;
		m_tShipOdr_ODR_NO = i_tShipOdr_ODR_NO;
		m_tShipOdr_PART_DLV_SEQ_NO = i_tShipOdr_PART_DLV_SEQ_NO;
		m_tShipOdr_SLIP_CD = i_tShipOdr_SLIP_CD;
		m_tShipOdr_DESINATED_SHIP_DATE = i_tShipOdr_DESINATED_SHIP_DATE;
		m_tShipOdr_SHIP_QTY = i_tShipOdr_SHIP_QTY;
		m_tShipOdr_ALLCT_WH_CD = i_tShipOdr_ALLCT_WH_CD;
		m_tShipOdr_CUST_NAME = i_tShipOdr_CUST_NAME;
		m_tShipOdr_CUST_ITEM_CD = i_tShipOdr_CUST_ITEM_CD;
		m_tShipOdr_ITEM_CD = i_tShipOdr_ITEM_CD;
		m_tShipOdrAnsDlvDate_REST_SHIP_ODR_QTY = i_tShipOdrAnsDlvDate_REST_SHIP_ODR_QTY;
		m_tShipOdr_DEL_FLG = i_tShipOdr_DEL_FLG;
		m_tShipOdr_DIRECT_DLV_FLG = i_tShipOdr_DIRECT_DLV_FLG;
		m_tShipOdr_TRANSPORT_TYP = i_tShipOdr_TRANSPORT_TYP;
		m_tShipOdr_MODIFY_COUNT = i_tShipOdr_MODIFY_COUNT;
		m_tShipOdr_IN_SLIPCD = i_tShipOdr_IN_SLIPCD;
		m_in_tShipOdr_ODR_NO = i_in_tShipOdr_ODR_NO;
		m_in_tShipOdr_PART_DLV_SEQ_NO = i_in_tShipOdr_PART_DLV_SEQ_NO;
		m_in_tShipOdr_SLIP_CD = i_in_tShipOdr_SLIP_CD;
		m_in_tShipOdr_ITEM_CD = i_in_tShipOdr_ITEM_CD;
		m_in_tShipOdr_CUST_ITEM_CD = i_in_tShipOdr_CUST_ITEM_CD;
		m_in_tShipOdr_CUST_ODR_NO = i_in_tShipOdr_CUST_ODR_NO;
		m_in_tShipOdr_CUST_CD = i_in_tShipOdr_CUST_CD;
		m_in_tShipOdr_CUST_NAME = i_in_tShipOdr_CUST_NAME;
		m_in_tShipOdr_SHIP_ODR_ISS_PSN_CD = i_in_tShipOdr_SHIP_ODR_ISS_PSN_CD;
		m_in_tShipOdr_DLV_LOC_CD = i_in_tShipOdr_DLV_LOC_CD;
		m_in_tShipOdr_DESINATED_SHIP_DATE = i_in_tShipOdr_DESINATED_SHIP_DATE;
		m_in_tShipOdr_SHIP_QTY = i_in_tShipOdr_SHIP_QTY;
		m_in_tShipOdr_UNIT_PRICE = i_in_tShipOdr_UNIT_PRICE;
		m_in_tShipOdr_SHIP_ODR_AMOUNT = i_in_tShipOdr_SHIP_ODR_AMOUNT;
		m_in_tShipOdr_CURRNCY_CD = i_in_tShipOdr_CURRNCY_CD;
		m_in_tShipOdr_PKG_UNIT_QTY = i_in_tShipOdr_PKG_UNIT_QTY;
		m_in_tShipOdr_REMARKS = i_in_tShipOdr_REMARKS;
		m_in_tShipOdr_ALLCT_WH_CD = i_in_tShipOdr_ALLCT_WH_CD;
		m_in_tShipOdr_DEPO_TYP = i_in_tShipOdr_DEPO_TYP;
		m_in_tShipOdr_ENTRY_TYP = i_in_tShipOdr_ENTRY_TYP;
		m_in_tShipOdr_PRINT_FLG = i_in_tShipOdr_PRINT_FLG;
		m_in_tShipOdr_SHP_CMPLT_FLG = i_in_tShipOdr_SHP_CMPLT_FLG;
		m_in_tShipOdr_DEL_FLG = i_in_tShipOdr_DEL_FLG;
		m_in_tShipOdr_TRANSPORT_CD = i_in_tShipOdr_TRANSPORT_CD;
		m_in_tShipOdr_DIRECT_DLV_FLG = i_in_tShipOdr_DIRECT_DLV_FLG;
		m_in_tShipOdr_CUST_CHRG_PSN_CD = i_in_tShipOdr_CUST_CHRG_PSN_CD;
		m_in_tShipOdr_UNIT_CD = i_in_tShipOdr_UNIT_CD;
		m_in_tShipOdr_SCDL_DLV_DATE = i_in_tShipOdr_SCDL_DLV_DATE;
		m_in_tShipOdr_TRANSFER_WH_CD = i_in_tShipOdr_TRANSFER_WH_CD;
		m_in_tShipOdr_DLV_KEY_NO = i_in_tShipOdr_DLV_KEY_NO;
		m_in_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES = i_in_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES;
		m_del_tShipOdr_IN_SLIPCD = i_del_tShipOdr_IN_SLIPCD;
		m_tOdr_ODR_NO = i_tOdr_ODR_NO;
		m_tOdr_ODR_TYP = i_tOdr_ODR_TYP;
		m_tOdr_ODR_CTL_NO = i_tOdr_ODR_CTL_NO;
		m_tOdr_CUST_ODR_NO = i_tOdr_CUST_ODR_NO;
		m_tOdr_CUST_CHRG_ORG_CD = i_tOdr_CUST_CHRG_ORG_CD;
		m_tOdr_CUST_CHRG_PSN_CD = i_tOdr_CUST_CHRG_PSN_CD;
		m_tOdr_ODR_ACPT_ORG_CD = i_tOdr_ODR_ACPT_ORG_CD;
		m_tOdr_ODR_ACPT_PSN_CD = i_tOdr_ODR_ACPT_PSN_CD;
		m_tOdr_CURRNCY_CD = i_tOdr_CURRNCY_CD;
		m_tOdr_EXCH_TYP = i_tOdr_EXCH_TYP;
		m_tOdr_DLV_LOC_CD = i_tOdr_DLV_LOC_CD;
		m_tOdr_DLV_LOC_CD_EIAJ = i_tOdr_DLV_LOC_CD_EIAJ;
		m_tOdr_DLV_LOC_NAME = i_tOdr_DLV_LOC_NAME;
		m_tOdr_DLV_LOC_NAME_KANJI = i_tOdr_DLV_LOC_NAME_KANJI;
		m_tOdr_PRD_ODR_PLACE_CD = i_tOdr_PRD_ODR_PLACE_CD;
		m_tOdr_PART_DLV_COUNT = i_tOdr_PART_DLV_COUNT;
		m_tOdr_DEPO_TYP = i_tOdr_DEPO_TYP;
		m_tOdr_DESINATED_DLV_DATE = i_tOdr_DESINATED_DLV_DATE;
		m_tOdr_STD_DESINATED_RCV_DATE = i_tOdr_STD_DESINATED_RCV_DATE;
		m_tOdr_ODR_QTY = i_tOdr_ODR_QTY;
		m_tOdr_REMAIN_UNCONFIRM_ODR_QTY = i_tOdr_REMAIN_UNCONFIRM_ODR_QTY;
		m_tOdr_CANCELED_UNCONFIRM_ODR_QTY = i_tOdr_CANCELED_UNCONFIRM_ODR_QTY;
		m_tOdr_UNIT_CD = i_tOdr_UNIT_CD;
		m_tOdr_UNCONFIRM_ODR_BALANCE = i_tOdr_UNCONFIRM_ODR_BALANCE;
		m_tOdr_ODR_AMOUNT = i_tOdr_ODR_AMOUNT;
		m_tOdr_ODR_AMOUNT_EXCH_RATES = i_tOdr_ODR_AMOUNT_EXCH_RATES;
		m_tOdr_TOTAL_SHIP_QTY = i_tOdr_TOTAL_SHIP_QTY;
		m_tOdr_SHIP_AMOUNT = i_tOdr_SHIP_AMOUNT;
		m_tOdr_SHIP_AMOUNT_EXCH_RATES = i_tOdr_SHIP_AMOUNT_EXCH_RATES;
		m_tOdr_RETURN_PRICE = i_tOdr_RETURN_PRICE;
		m_tOdr_RETURN_QTY = i_tOdr_RETURN_QTY;
		m_tOdr_RETURN_AMOUNT = i_tOdr_RETURN_AMOUNT;
		m_tOdr_RETURN_AMOUNT_EXCH_RATES = i_tOdr_RETURN_AMOUNT_EXCH_RATES;
		m_tOdr_ODR_CMPLT_FLG = i_tOdr_ODR_CMPLT_FLG;
		m_tOdr_ODR_CMPLT_DATE = i_tOdr_ODR_CMPLT_DATE;
		m_tOdr_CUS_DLV_CD = i_tOdr_CUS_DLV_CD;
		m_tOdr_CUS_DLV_KEY_CD = i_tOdr_CUS_DLV_KEY_CD;
		m_tOdr_PART_NAME = i_tOdr_PART_NAME;
		m_tOdr_PKG_UNIT = i_tOdr_PKG_UNIT;
		m_tOdr_SLIP_PRICE_PRINT_TYP = i_tOdr_SLIP_PRICE_PRINT_TYP;
		m_tOdr_INSPC_TYP = i_tOdr_INSPC_TYP;
		m_tOdr_CLIENT_REMARK = i_tOdr_CLIENT_REMARK;
		m_tOdr_CLIENT_REMARK_KANJI = i_tOdr_CLIENT_REMARK_KANJI;
		m_tOdr_CLIENT_BARCODE_INF = i_tOdr_CLIENT_BARCODE_INF;
		m_tOdr_TRANSPORT_CD = i_tOdr_TRANSPORT_CD;
		m_tOdr_TAX_APPLY_TYP = i_tOdr_TAX_APPLY_TYP;
		m_tOdr_TAX_CD = i_tOdr_TAX_CD;
		m_tOdr_TAX_CALC_TYP = i_tOdr_TAX_CALC_TYP;
		m_tOdr_REMARKS = i_tOdr_REMARKS;
		m_tOdr_ODR_ACPT_DATE = i_tOdr_ODR_ACPT_DATE;
		m_tOdr_SHIP_PLAN_REMAIN_QTY = i_tOdr_SHIP_PLAN_REMAIN_QTY;
		m_tOdr_SHIP_PLAN_CMPLT_FLG = i_tOdr_SHIP_PLAN_CMPLT_FLG;
		m_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG = i_tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG;
		m_tOdr_IF_CTL_NO = i_tOdr_IF_CTL_NO;
		m_tOdr_ENTRY_TYP = i_tOdr_ENTRY_TYP;
		m_tOdr_BUYER_NAME = i_tOdr_BUYER_NAME;
		m_tOdr_PUCH_ODR_QTY_TOTAL = i_tOdr_PUCH_ODR_QTY_TOTAL;
		m_tOdr_UNIT_CD_ORG = i_tOdr_UNIT_CD_ORG;
		m_tOdr_SHIP_CNT = i_tOdr_SHIP_CNT;
		m_tOdr_IN_ODRNO = i_tOdr_IN_ODRNO;
		m_uptOdr_SHIP_CNT = i_uptOdr_SHIP_CNT;
		m_uptOdr_IN_ODRNO = i_uptOdr_IN_ODRNO;
		m_mItem_ITEM_CD = i_mItem_ITEM_CD;
		m_mItem_ITEM_NAME = i_mItem_ITEM_NAME;
		m_mItem_PRODUCT_TYP = i_mItem_PRODUCT_TYP;
		m_mItem_MRP_ODR_TYP = i_mItem_MRP_ODR_TYP;
		m_mItem_DRAW_CD = i_mItem_DRAW_CD;
		m_mItem_SPEC = i_mItem_SPEC;
		m_mItem_HIGH_LEVEL_NO = i_mItem_HIGH_LEVEL_NO;
		m_mItem_OUTSIDE_TYP = i_mItem_OUTSIDE_TYP;
		m_mItem_STOCK_UNIT_FLG = i_mItem_STOCK_UNIT_FLG;
		m_mItem_STOCK_UNIT = i_mItem_STOCK_UNIT;
		m_mItem_PKG_UNIT = i_mItem_PKG_UNIT;
		m_mItem_PKG_UNIT_QTY = i_mItem_PKG_UNIT_QTY;
		m_mItem_UNIT_QTY_TYP = i_mItem_UNIT_QTY_TYP;
		m_mItem_ODR_LT = i_mItem_ODR_LT;
		m_mItem_FIXED_LT = i_mItem_FIXED_LT;
		m_mItem_PROP_LT = i_mItem_PROP_LT;
		m_mItem_SAFETY_LT = i_mItem_SAFETY_LT;
		m_mItem_ISSUE_LT = i_mItem_ISSUE_LT;
		m_mItem_PROP_LOT_SIZE = i_mItem_PROP_LOT_SIZE;
		m_mItem_ITEM_SPOIL = i_mItem_ITEM_SPOIL;
		m_mItem_SAFETY_STOCK = i_mItem_SAFETY_STOCK;
		m_mItem_LOT_SIZING_TYP = i_mItem_LOT_SIZING_TYP;
		m_mItem_MAX_PERIOD = i_mItem_MAX_PERIOD;
		m_mItem_MAX_ODR_QTY = i_mItem_MAX_ODR_QTY;
		m_mItem_ODR_POINT = i_mItem_ODR_POINT;
		m_mItem_FIXED_ODR_QTY = i_mItem_FIXED_ODR_QTY;
		m_mItem_MIN_ODR_QTY = i_mItem_MIN_ODR_QTY;
		m_mItem_MUL_ODR_QTY = i_mItem_MUL_ODR_QTY;
		m_mItem_ISSUE_TYP = i_mItem_ISSUE_TYP;
		m_mItem_MPS_FLG = i_mItem_MPS_FLG;
		m_mItem_ACPT_INSPC_TYP = i_mItem_ACPT_INSPC_TYP;
		m_mItem_CLASIFICATION_CD = i_mItem_CLASIFICATION_CD;
		m_mItem_UNIT_WEIGHT = i_mItem_UNIT_WEIGHT;
		m_mItem_ABC_TYP = i_mItem_ABC_TYP;
		m_mItem_OPR_RSLT_TYP = i_mItem_OPR_RSLT_TYP;
		m_mItem_SPL_ITEM_TYP = i_mItem_SPL_ITEM_TYP;
		m_mItem_TAX_CD = i_mItem_TAX_CD;
		m_mItem_IN_ITEMCD = i_mItem_IN_ITEMCD;
		m_tOdrCtl_ODR_CTL_NO = i_tOdrCtl_ODR_CTL_NO;
		m_tOdrCtl_CUST_ITEM_NAME = i_tOdrCtl_CUST_ITEM_NAME;
		m_tOdrCtl_ITEM_NAME = i_tOdrCtl_ITEM_NAME;
		m_tOdrCtl_IN_ODRCTLNO = i_tOdrCtl_IN_ODRCTLNO;
		m_in_tShipSlip_SLIP_CD = i_in_tShipSlip_SLIP_CD;
		m_in_tShipSlip_ITEM_CD = i_in_tShipSlip_ITEM_CD;
		m_in_tShipSlip_CUST_ITEM_CD = i_in_tShipSlip_CUST_ITEM_CD;
		m_in_tShipSlip_PART_NAME = i_in_tShipSlip_PART_NAME;
		m_in_tShipSlip_CUST_ODR_NO = i_in_tShipSlip_CUST_ODR_NO;
		m_in_tShipSlip_CUST_CD = i_in_tShipSlip_CUST_CD;
		m_in_tShipSlip_CUST_NAME = i_in_tShipSlip_CUST_NAME;
		m_in_tShipSlip_DLV_LOC_CD = i_in_tShipSlip_DLV_LOC_CD;
		m_in_tShipSlip_DLV_LOC_NAME_KANJI = i_in_tShipSlip_DLV_LOC_NAME_KANJI;
//		m_in_tShipSlip_SHIP_ODR_ISS_PSN_NAME = i_in_tShipSlip_SHIP_ODR_ISS_PSN_NAME;
//		m_in_tShipSlip_CUS_DLV_CD = i_in_tShipSlip_CUS_DLV_CD;
		m_in_tShipSlip_CUS_DLV_KEY_CD = i_in_tShipSlip_CUS_DLV_KEY_CD;
//		m_in_tShipSlip_TRANSPORT_CD = i_in_tShipSlip_TRANSPORT_CD;
//		m_in_tShipSlip_TRANSPORT_TYP = i_in_tShipSlip_TRANSPORT_TYP;
		m_in_tShipSlip_DESINATED_SHIP_DATE = i_in_tShipSlip_DESINATED_SHIP_DATE;
		m_in_tShipSlip_DESINATED_DLV_DATE = i_in_tShipSlip_DESINATED_DLV_DATE;
		m_in_tShipSlip_SCDL_DLV_DATE = i_in_tShipSlip_SCDL_DLV_DATE;
		m_in_tShipSlip_SHIP_ODR_QTY = i_in_tShipSlip_SHIP_ODR_QTY;
		m_in_tShipSlip_UNIT_CD = i_in_tShipSlip_UNIT_CD;
		m_in_tShipSlip_UNIT_PRICE = i_in_tShipSlip_UNIT_PRICE;
		m_in_tShipSlip_SHIP_ODR_AMOUNT = i_in_tShipSlip_SHIP_ODR_AMOUNT;
		m_in_tShipSlip_TAX_AMOUNT = i_in_tShipSlip_TAX_AMOUNT;
//		m_in_tShipSlip_CURRNCY_CD = i_in_tShipSlip_CURRNCY_CD;
		m_in_tShipSlip_INSPC_TYP = i_in_tShipSlip_INSPC_TYP;
		m_in_tShipSlip_CLIENT_REMARK_KANJI = i_in_tShipSlip_CLIENT_REMARK_KANJI;
		m_in_tShipSlip_CLIENT_BARCODE_INF = i_in_tShipSlip_CLIENT_BARCODE_INF;
//		m_in_tShipSlip_PKG_UNIT_QTY = i_in_tShipSlip_PKG_UNIT_QTY;
//		m_in_tShipSlip_CASE_QTY = i_in_tShipSlip_CASE_QTY;
//		m_in_tShipSlip_REST_QTY = i_in_tShipSlip_REST_QTY;
//		m_in_tShipSlip_TOTAL_CASE_QTY = i_in_tShipSlip_TOTAL_CASE_QTY;
//		m_in_tShipSlip_TOTAL_WEIGHT = i_in_tShipSlip_TOTAL_WEIGHT;
//		m_in_tShipSlip_ALLCT_WH_CD = i_in_tShipSlip_ALLCT_WH_CD;
		m_in_tShipSlip_PRINT_FLG = i_in_tShipSlip_PRINT_FLG;
		m_in_tShipSlip_DEL_FLG = i_in_tShipSlip_DEL_FLG;
		m_in_tShipSlip_BUYER_NAME = i_in_tShipSlip_BUYER_NAME;
		m_in_tShipSlip_PUCH_ODR_QTY_TOTAL = i_in_tShipSlip_PUCH_ODR_QTY_TOTAL;
		m_in_tShipSlip_DLV_ODR_QTY = i_in_tShipSlip_DLV_ODR_QTY;
		m_in_tShipSlip_SHIP_ODR_AMOUNT_TAX = i_in_tShipSlip_SHIP_ODR_AMOUNT_TAX;
//		m_in_tShipSlip_SHIP_ODR_AMOUNT_EXCH_RATES = i_in_tShipSlip_SHIP_ODR_AMOUNT_EXCH_RATES;
		m_del_tShipSlip_IN_SLIPCD = i_del_tShipSlip_IN_SLIPCD;
		m_mCustBase_COMPANY_CD = i_mCustBase_COMPANY_CD;
		m_mCustBase_CUST_CD = i_mCustBase_CUST_CD;
		m_mCustBase_DLV_LOC_CD = i_mCustBase_DLV_LOC_CD;
		m_mCustBase_DLV_LOC_NAME = i_mCustBase_DLV_LOC_NAME;
		m_mCustBase_DLV_LOC_KNAME = i_mCustBase_DLV_LOC_KNAME;
		m_mCustBase_DLV_LOC_ENAME = i_mCustBase_DLV_LOC_ENAME;
		m_mCustBase_ZIP_CD = i_mCustBase_ZIP_CD;
		m_mCustBase_ADDRESS_1 = i_mCustBase_ADDRESS_1;
		m_mCustBase_ADDRESS_2 = i_mCustBase_ADDRESS_2;
		m_mCustBase_ADDRESS_K_1 = i_mCustBase_ADDRESS_K_1;
		m_mCustBase_ADDRESS_K_2 = i_mCustBase_ADDRESS_K_2;
		m_mCustBase_TEL = i_mCustBase_TEL;
		m_mCustBase_FAX = i_mCustBase_FAX;
		m_mCustBase_SHIP_WH_CD = i_mCustBase_SHIP_WH_CD;
		m_mCustBase_TRANSPORT_CD = i_mCustBase_TRANSPORT_CD;
		m_mCustBase_TRANSPORT_NAME = i_mCustBase_TRANSPORT_NAME;
		m_mCustBase_TRANSPORT_LT = i_mCustBase_TRANSPORT_LT;
		m_mCustBase_CAL_NO = i_mCustBase_CAL_NO;
		m_mCustBase_TRANSPORT_TYP = i_mCustBase_TRANSPORT_TYP;
		m_mCustBase_DLV_START_TIME = i_mCustBase_DLV_START_TIME;
		m_mCustBase_DLV_END_TIME = i_mCustBase_DLV_END_TIME;
		m_mCustBase_AREA_CLASS_TYP1 = i_mCustBase_AREA_CLASS_TYP1;
		m_mCustBase_AREA_CLASS_1 = i_mCustBase_AREA_CLASS_1;
		m_mCustBase_AREA_CLASS_TYP2 = i_mCustBase_AREA_CLASS_TYP2;
		m_mCustBase_AREA_CLASS_2 = i_mCustBase_AREA_CLASS_2;
		m_mCustBase_AREA_CLASS_TYP3 = i_mCustBase_AREA_CLASS_TYP3;
		m_mCustBase_AREA_CLASS_3 = i_mCustBase_AREA_CLASS_3;
		m_mCustBase_REMARKS_1 = i_mCustBase_REMARKS_1;
		m_mCustBase_REMARKS_2 = i_mCustBase_REMARKS_2;
		m_mCustBase_REMARKS_3 = i_mCustBase_REMARKS_3;
		m_mCustBase_DEPO_WH_CD = i_mCustBase_DEPO_WH_CD;
		m_mCustBase_IN_COMPANYCD = i_mCustBase_IN_COMPANYCD;
		m_mCustBase_IN_CUSTCD = i_mCustBase_IN_CUSTCD;
		m_mCustBase_IN_DLVLOCCD = i_mCustBase_IN_DLVLOCCD;
		m_mCust_COMPANY_CD = i_mCust_COMPANY_CD;
		m_mCust_CUST_CD = i_mCust_CUST_CD;
		m_mCust_CUST_NAME = i_mCust_CUST_NAME;
		m_mCust_CUST_KNAME = i_mCust_CUST_KNAME;
		m_mCust_OWN_ORG_CD = i_mCust_OWN_ORG_CD;
		m_mCust_OWN_PERSON_CD = i_mCust_OWN_PERSON_CD;
		m_mCust_CUR_CD = i_mCust_CUR_CD;
		m_mCust_EXCH_TYP = i_mCust_EXCH_TYP;
		m_mCust_TAX_APPLY_TYP = i_mCust_TAX_APPLY_TYP;
		m_mCust_TAX_CD = i_mCust_TAX_CD;
		m_mCust_TAX_CALC_TYP = i_mCust_TAX_CALC_TYP;
		m_mCust_PRICE_ROUND_TYP = i_mCust_PRICE_ROUND_TYP;
		m_mCust_DETAIL_ROUND_TYP = i_mCust_DETAIL_ROUND_TYP;
		m_mCust_UNCONFIRM_ODR_EFF_PRIOD = i_mCust_UNCONFIRM_ODR_EFF_PRIOD;
		m_mCust_UNCONFIRM_ODR_EFF_TERM_FLG = i_mCust_UNCONFIRM_ODR_EFF_TERM_FLG;
		m_mCust_EDI_CUST_VEND_CD = i_mCust_EDI_CUST_VEND_CD;
		m_mCust_PARTIAL_SHIP_INST_FLG = i_mCust_PARTIAL_SHIP_INST_FLG;
		m_mCust_DEPO_TYP = i_mCust_DEPO_TYP;
		m_mCust_INSPC_ACPT_TYP = i_mCust_INSPC_ACPT_TYP;
		m_mCust_IN_COMPANYCD = i_mCust_IN_COMPANYCD;
		m_mCust_IN_CUSTCD = i_mCust_IN_CUSTCD;
		m_tori_tAnsDlvDate_REST_SHIP_ODR_QTY = i_tori_tAnsDlvDate_REST_SHIP_ODR_QTY;
		m_tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG = i_tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG;
		m_tori_tAnsDlvDate_IN_ODRNO = i_tori_tAnsDlvDate_IN_ODRNO;
		m_tori_tAnsDlvDate_IN_PARTDLVSEQNO = i_tori_tAnsDlvDate_IN_PARTDLVSEQNO;
		m_chkisWhCd_WH_CD = i_chkisWhCd_WH_CD;
		m_chkisWhCd_WH_TYP = i_chkisWhCd_WH_TYP;
		m_chkisWhCd_ITEM_CD = i_chkisWhCd_ITEM_CD;
		m_chkisWhCd_PBL_SHIP_QTY = i_chkisWhCd_PBL_SHIP_QTY;
		m_chkisWhCd_IN_ITEMCD = i_chkisWhCd_IN_ITEMCD;
		m_chkisWhCd_IN_WHCD = i_chkisWhCd_IN_WHCD;
		m_mUnitCost_UNIT_COST = i_mUnitCost_UNIT_COST;
		m_mUnitCost_EFF_PHASE_IN_DATE = i_mUnitCost_EFF_PHASE_IN_DATE;
		m_mUnitCost_IN_COMPANYCD = i_mUnitCost_IN_COMPANYCD;
		m_mUnitCost_IN_CUSTCD = i_mUnitCost_IN_CUSTCD;
		m_mUnitCost_IN_ITEMCD = i_mUnitCost_IN_ITEMCD;
		m_mUnitCost_IN_EFFPHASEINDATE = i_mUnitCost_IN_EFFPHASEINDATE;
		m_mWhWH_CD = i_mWhWH_CD;
		m_mWhWH_NAME = i_mWhWH_NAME;
		m_strTaxTAX_KBN = i_strTaxTAX_KBN;
		m_strTaxSTART_DATE = i_strTaxSTART_DATE;
		m_strTaxROUND_TYP = i_strTaxROUND_TYP;
		m_strTaxIN_COMPANYCD = i_strTaxIN_COMPANYCD;
		m_strTaxIN_CUSTCD = i_strTaxIN_CUSTCD;
		m_g_CUST_ITEM_CD = i_g_CUST_ITEM_CD;
		m_strYotaku_WH_CD = i_strYotaku_WH_CD;
		m_strYotaku_IN_WH_TYP = i_strYotaku_IN_WH_TYP;
		m_strSYUKA_LT = i_strSYUKA_LT;
		m_chkisinWhCd_WH_CD = i_chkisinWhCd_WH_CD;
		m_chkisinWhCd_WH_TYP = i_chkisinWhCd_WH_TYP;
		m_chkis_IN_WHCD = i_chkis_IN_WHCD;
		m_g_PART_DLV_SEQ_NO = i_g_PART_DLV_SEQ_NO;
		m_g_DIRECT_DLV_FLG = i_g_DIRECT_DLV_FLG;
		m_g_REST_SHIP_ODR_QTY = i_g_REST_SHIP_ODR_QTY;
		m_g_CUST_ANAME = i_g_CUST_ANAME;
		m_g_ITEM_CD = i_g_ITEM_CD;
		m_k_MODE = i_k_MODE;
		m_h_RESULT = i_h_RESULT;
		m_h_REST_SHIP_ODR_QTY = i_h_REST_SHIP_ODR_QTY;
		m_h_CUST_ANAME = i_h_CUST_ANAME;
		m_h_CUST_ITEM_CD = i_h_CUST_ITEM_CD;
		m_h_ITEM_CD = i_h_ITEM_CD;
		m_h_AP_SECRTY_TYP = i_h_AP_SECRTY_TYP;
		m_h_MODIFY_CNT = i_h_MODIFY_CNT;
		m_r_SEL_PTN1 = i_r_SEL_PTN1;
		m_r_SEL_PTN2 = i_r_SEL_PTN2;
		m_g_ODR_NO = i_g_ODR_NO;
		m_g_SLIP_CD = i_g_SLIP_CD;
		m_g_DESINATED_SHIP_DATE = i_g_DESINATED_SHIP_DATE;
		m_g_REST_SHIP_ODR_QTY2 = i_g_REST_SHIP_ODR_QTY2;
		m_g_WH_CD = i_g_WH_CD;
	}

		// TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B

	public void add2L_g_ODR_NO(Object obj) {
		if (l_g_ODR_NO == null) {
			l_g_ODR_NO = new ArrayList();
		} 
		l_g_ODR_NO.add(obj);
		return;
	}

	public void add2L_g_PART_DLV_SEQ_NO(Object obj) {
		if (l_g_PART_DLV_SEQ_NO == null) {
			l_g_PART_DLV_SEQ_NO = new ArrayList();
		} 
		l_g_PART_DLV_SEQ_NO.add(obj);
		return;
	}

	public void add2L_g_SLIP_CD(Object obj) {
		if (l_g_SLIP_CD == null) {
			l_g_SLIP_CD = new ArrayList();
		} 
		l_g_SLIP_CD.add(obj);
		return;
	}

        //}}user_implement_code

	//////////////////////////////

}
