/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0090/src/com/nec/jp/orteus/metamorBase/AE0090/AE0090020Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0090;

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

public class AE0090020Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_PUCH_ODR_START_DATE */
	public String m_PUCH_ODR_START_DATE = null;
	/** �� 2 �ϐ��F m_PUCH_ODR_DLV_DATE */
	public String m_PUCH_ODR_DLV_DATE = null;
	/** �� 3 �ϐ��F m_l_MRP_ODR_TYP_DN */
	public String m_l_MRP_ODR_TYP_DN = null;
	/** �� 4 �ϐ��F m_l_ACPT_INSPC_TYP_DN */
	public String m_l_ACPT_INSPC_TYP_DN = null;
	/** �� 5 �ϐ��F m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** �� 6 �ϐ��F m_c1_WORK_STS_TYP */
	public String m_c1_WORK_STS_TYP = null;
	/** �� 7 �ϐ��F m_c2_WORK_STS_TYP */
	public String m_c2_WORK_STS_TYP = null;
	/** �� 8 �ϐ��F m_c3_WORK_STS_TYP */
	public String m_c3_WORK_STS_TYP = null;
	/** �� 9 �ϐ��F m_c4_WORK_STS_TYP */
	public String m_c4_WORK_STS_TYP = null;
	/** �� 10 �ϐ��F m_c5_WORK_STS_TYP */
	public String m_c5_WORK_STS_TYP = null;
	/** �� 11 �ϐ��F m_c6_WORK_STS_TYP */
	public String m_c6_WORK_STS_TYP = null;
	/** �� 12 �ϐ��F m_c7_WORK_STS_TYP */
	public String m_c7_WORK_STS_TYP = null;
	/** �� 13 �ϐ��F m_c8_WORK_STS_TYP */
	public String m_c8_WORK_STS_TYP = null;
	/** �� 14 �ϐ��F m_l_STATUS_DN */
	public String m_l_STATUS_DN = null;
	/** �� 15 �ϐ��F m_PUCH_ODR_START_TIME */
	public String m_PUCH_ODR_START_TIME = null;
	/** �� 16 �ϐ��F m_PUCH_ODR_DLV_TIME */
	public String m_PUCH_ODR_DLV_TIME = null;
	/** �� 17 �ϐ��F m_l_UNIT_COST_TYP_DN */
	public String m_l_UNIT_COST_TYP_DN = null;
	/** �� 18 �ϐ��F m_l_PUCH_ODR_INST_SLIP_ISS_FLG_DN */
	public String m_l_PUCH_ODR_INST_SLIP_ISS_FLG_DN = null;
	/** �� 19 �ϐ��F m_l_PUCH_ODR_STS_TYP_DN */
	public String m_l_PUCH_ODR_STS_TYP_DN = null;
	/** �� 20 �ϐ��F m_l_INSPC_CMPLT_FLG_DN */
	public String m_l_INSPC_CMPLT_FLG_DN = null;
	/** �� 21 �ϐ��F m_l_SPL_ITEM_TYP_DN */
	public String m_l_SPL_ITEM_TYP_DN = null;
	/** �� 22 �ϐ��F m_l_INV_CTRL_FLG_DN */
	public String m_l_INV_CTRL_FLG_DN = null;
	/** �� 23 �ϐ��F m_l_NON_NO_ITEM_FLG_DN */
	public String m_l_NON_NO_ITEM_FLG_DN = null;
	/** �� 24 �ϐ��F m_l_ODR_CANCEL_SLIP_ISS_FLG_DN */
	public String m_l_ODR_CANCEL_SLIP_ISS_FLG_DN = null;
	/** �� 25 �ϐ��F m_l_PUCH_ODR_CD */
	public String m_l_PUCH_ODR_CD = null;
	/** �� 26 �ϐ��F m_l_PLANT_CD */
	public String m_l_PLANT_CD = null;
	/** �� 27 �ϐ��F m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** �� 28 �ϐ��F m_l_WH_CD */
	public String m_l_WH_CD = null;
	/** �� 29 �ϐ��F m_l_WH_NAME */
	public String m_l_WH_NAME = null;
	/** �� 30 �ϐ��F m_l_ITEM_CD */
	public String m_l_ITEM_CD = null;
	/** �� 31 �ϐ��F m_l_ITEM_NAME */
	public String m_l_ITEM_NAME = null;
	/** �� 32 �ϐ��F m_l_COMPANY_CD */
	public String m_l_COMPANY_CD = null;
	/** �� 33 �ϐ��F m_l_VEND_CD */
	public String m_l_VEND_CD = null;
	/** �� 34 �ϐ��F m_l_VEND_ANAME */
	public String m_l_VEND_ANAME = null;
	/** �� 35 �ϐ��F m_VEND_NAME */
	public String m_VEND_NAME = null;
	/** �� 36 �ϐ��F m_l_PUCH_ODR_PERSON */
	public String m_l_PUCH_ODR_PERSON = null;
	/** �� 37 �ϐ��F m_l_USER_NAME */
	public String m_l_USER_NAME = null;
	/** �� 38 �ϐ��F m_l_PUCH_ODR_START_DATE */
	public String m_l_PUCH_ODR_START_DATE = null;
	/** �� 39 �ϐ��F m_l_PUCH_ODR_DLV_DATE */
	public String m_l_PUCH_ODR_DLV_DATE = null;
	/** �� 40 �ϐ��F m_l_PUCH_ODR_QTY */
	public String m_l_PUCH_ODR_QTY = null;
	/** �� 41 �ϐ��F m_l_STOCK_UNIT */
	public String m_l_STOCK_UNIT = null;
	/** �� 42 �ϐ��F m_l_UNIT_COST_TYP */
	public String m_l_UNIT_COST_TYP = null;
	/** �� 43 �ϐ��F m_l_UNIT_COST */
	public String m_l_UNIT_COST = null;
	/** �� 44 �ϐ��F m_l_PUCH_ODR_AMOUNT */
	public String m_l_PUCH_ODR_AMOUNT = null;
	/** �� 45 �ϐ��F m_l_VEND_CUR_UNIT */
	public String m_l_VEND_CUR_UNIT = null;
	/** �� 46 �ϐ��F m_l_DISC_AMOUNT */
	public String m_l_DISC_AMOUNT = null;
	/** �� 47 �ϐ��F m_l_NET_AMOUNT */
	public String m_l_NET_AMOUNT = null;
	/** �� 48 �ϐ��F m_l_TAX_AMOUNT_1 */
	public String m_l_TAX_AMOUNT_1 = null;
	/** �� 49 �ϐ��F m_l_TAX_AMOUNT_2 */
	public String m_l_TAX_AMOUNT_2 = null;
	/** �� 50 �ϐ��F m_l_TAX_AMOUNT_3 */
	public String m_l_TAX_AMOUNT_3 = null;
	/** �� 51 �ϐ��F m_l_AMOUNT_INCLUDE_TAX */
	public String m_l_AMOUNT_INCLUDE_TAX = null;
	/** �� 52 �ϐ��F m_l_RATE_JUDGE_DATE */
	public String m_l_RATE_JUDGE_DATE = null;
	/** �� 53 �ϐ��F m_l_EXCH_RATE */
	public String m_l_EXCH_RATE = null;
	/** �� 54 �ϐ��F m_l_HOME_CUR_AMOUNT */
	public String m_l_HOME_CUR_AMOUNT = null;
	/** �� 55 �ϐ��F m_l_HOME_CUR_UNIT */
	public String m_l_HOME_CUR_UNIT = null;
	/** �� 56 �ϐ��F m_l_PUCH_ODR_INST_DATE */
	public String m_l_PUCH_ODR_INST_DATE = null;
	/** �� 57 �ϐ��F m_l_PUCH_ODR_INST_SLIP_ISS_FLG */
	public String m_l_PUCH_ODR_INST_SLIP_ISS_FLG = null;
	/** �� 58 �ϐ��F m_l_PUCH_ODR_SLIP_ISS_DATE */
	public String m_l_PUCH_ODR_SLIP_ISS_DATE = null;
	/** �� 59 �ϐ��F m_l_PUCH_ODR_STS_TYP */
	public String m_l_PUCH_ODR_STS_TYP = null;
	/** �� 60 �ϐ��F m_l_INSPC_CMPLT_FLG */
	public String m_l_INSPC_CMPLT_FLG = null;
	/** �� 61 �ϐ��F m_l_INSPC_CMPLT_DATE */
	public String m_l_INSPC_CMPLT_DATE = null;
	/** �� 62 �ϐ��F m_l_CONFIRM_DLV_DATE */
	public String m_l_CONFIRM_DLV_DATE = null;
	/** �� 63 �ϐ��F m_l_SPL_ITEM_TYP */
	public String m_l_SPL_ITEM_TYP = null;
	/** �� 64 �ϐ��F m_l_ACPT_INSPC_TYP */
	public String m_l_ACPT_INSPC_TYP = null;
	/** �� 65 �ϐ��F m_l_INV_CTRL_FLG */
	public String m_l_INV_CTRL_FLG = null;
	/** �� 66 �ϐ��F m_l_WORK_ODR_CD */
	public String m_l_WORK_ODR_CD = null;
	/** �� 67 �ϐ��F m_l_OD_NO */
	public String m_l_OD_NO = null;
	/** �� 68 �ϐ��F m_l_JOB_ODR_CD */
	public String m_l_JOB_ODR_CD = null;
	/** �� 69 �ϐ��F m_l_PUCH_ODR_COMMENT */
	public String m_l_PUCH_ODR_COMMENT = null;
	/** �� 70 �ϐ��F m_l_ODR_CD */
	public String m_l_ODR_CD = null;
	/** �� 71 �ϐ��F m_l_DETAIL_NO */
	public String m_l_DETAIL_NO = null;
	/** �� 72 �ϐ��F m_l_NON_NO_ITEM_FLG */
	public String m_l_NON_NO_ITEM_FLG = null;
	/** �� 73 �ϐ��F m_l_DRAW_CD */
	public String m_l_DRAW_CD = null;
	/** �� 74 �ϐ��F m_l_SPEC */
	public String m_l_SPEC = null;
	/** �� 75 �ϐ��F m_l_MRP_ODR_TYP */
	public String m_l_MRP_ODR_TYP = null;
	/** �� 76 �ϐ��F m_l_ACPT_QTY */
	public String m_l_ACPT_QTY = null;
	/** �� 77 �ϐ��F m_l_ACPT_CMPLT_DATE */
	public String m_l_ACPT_CMPLT_DATE = null;
	/** �� 78 �ϐ��F m_l_INSPECTED_QTY */
	public String m_l_INSPECTED_QTY = null;
	/** �� 79 �ϐ��F m_l_ACCEPTED_QTY */
	public String m_l_ACCEPTED_QTY = null;
	/** �� 80 �ϐ��F m_l_PUCH_ODR_EDI_ISS_DATE */
	public String m_l_PUCH_ODR_EDI_ISS_DATE = null;
	/** �� 81 �ϐ��F m_l_ODR_CANCEL_SLIP_ISS_DATE */
	public String m_l_ODR_CANCEL_SLIP_ISS_DATE = null;
	/** �� 82 �ϐ��F m_l_CONFIRM_DLV_DATE_COMMENT */
	public String m_l_CONFIRM_DLV_DATE_COMMENT = null;
	/** �� 83 �ϐ��F m_l_ODR_CANCEL_SLIP_ISS_FLG */
	public String m_l_ODR_CANCEL_SLIP_ISS_FLG = null;
	/** �� 84 �ϐ��F m_l_ODR_CANCEL_EDI_ISS_DATE */
	public String m_l_ODR_CANCEL_EDI_ISS_DATE = null;
	/** �� 85 �ϐ��F m_l_ODR_CANCEL_CAUSE_CD */
	public String m_l_ODR_CANCEL_CAUSE_CD = null;
	/** �� 86 �ϐ��F m_l_STATUS */
	public String m_l_STATUS = null;
	/** �� 87 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 88 �ϐ��F m_PUCH_ODR_START_DATE_ALL */
	public String m_PUCH_ODR_START_DATE_ALL = null;
	/** �� 89 �ϐ��F m_PUCH_ODR_DLV_DATE_ALL */
	public String m_PUCH_ODR_DLV_DATE_ALL = null;
	/** �� 90 �ϐ��F m_VEND_CD */
	public String m_VEND_CD = null;
	/** �� 91 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 92 �ϐ��F m_PUCH_ODR_CD */
	public String m_PUCH_ODR_CD = null;
	/** �� 93 �ϐ��F m_STATUS1 */
	public String m_STATUS1 = null;
	/** �� 94 �ϐ��F m_STATUS2 */
	public String m_STATUS2 = null;
	/** �� 95 �ϐ��F m_STATUS3 */
	public String m_STATUS3 = null;
	/** �� 96 �ϐ��F m_STATUS4 */
	public String m_STATUS4 = null;
	/** �� 97 �ϐ��F m_STATUS5 */
	public String m_STATUS5 = null;
	/** �� 98 �ϐ��F m_STATUS6 */
	public String m_STATUS6 = null;
	/** �� 99 �ϐ��F m_STATUS7 */
	public String m_STATUS7 = null;
	/** �� 100 �ϐ��F m_STATUS8 */
	public String m_STATUS8 = null;
	/** �� 101 �ϐ��F m_WH_CD */
	public String m_WH_CD = null;
	/** �� 102 �ϐ��F m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** �� 103 �ϐ��F m_PUCH_ODR_PERSON */
	public String m_PUCH_ODR_PERSON = null;
	/** �� 104 �ϐ��F m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** �� 105 �ϐ��F m_OUT_PUCH_ODR_CD */
	public String m_OUT_PUCH_ODR_CD = null;
	/** �� 106 �ϐ��F m_TIME_CTRL */
	public String m_TIME_CTRL = null;
	/** �� 107 �ϐ��F m_WH_NAME */
	public String m_WH_NAME = null;
	/** �� 108 �ϐ��F m_l_COUNT */
	public String m_l_COUNT = null;
	/** �� 109 �ϐ��F m_ROW_COUNT */
	public String m_ROW_COUNT = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_PUCH_ODR_START_DATE */
	public List l_PUCH_ODR_START_DATE = null;

	/** �� 2 List�ϐ��F l_PUCH_ODR_DLV_DATE */
	public List l_PUCH_ODR_DLV_DATE = null;

	/** �� 3 List�ϐ��F l_l_MRP_ODR_TYP_DN */
	public List l_l_MRP_ODR_TYP_DN = null;

	/** �� 4 List�ϐ��F l_l_ACPT_INSPC_TYP_DN */
	public List l_l_ACPT_INSPC_TYP_DN = null;

	/** �� 5 List�ϐ��F l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** �� 6 List�ϐ��F l_c1_WORK_STS_TYP */
	public List l_c1_WORK_STS_TYP = null;

	/** �� 7 List�ϐ��F l_c2_WORK_STS_TYP */
	public List l_c2_WORK_STS_TYP = null;

	/** �� 8 List�ϐ��F l_c3_WORK_STS_TYP */
	public List l_c3_WORK_STS_TYP = null;

	/** �� 9 List�ϐ��F l_c4_WORK_STS_TYP */
	public List l_c4_WORK_STS_TYP = null;

	/** �� 10 List�ϐ��F l_c5_WORK_STS_TYP */
	public List l_c5_WORK_STS_TYP = null;

	/** �� 11 List�ϐ��F l_c6_WORK_STS_TYP */
	public List l_c6_WORK_STS_TYP = null;

	/** �� 12 List�ϐ��F l_c7_WORK_STS_TYP */
	public List l_c7_WORK_STS_TYP = null;

	/** �� 13 List�ϐ��F l_c8_WORK_STS_TYP */
	public List l_c8_WORK_STS_TYP = null;

	/** �� 14 List�ϐ��F l_l_STATUS_DN */
	public List l_l_STATUS_DN = null;

	/** �� 15 List�ϐ��F l_PUCH_ODR_START_TIME */
	public List l_PUCH_ODR_START_TIME = null;

	/** �� 16 List�ϐ��F l_PUCH_ODR_DLV_TIME */
	public List l_PUCH_ODR_DLV_TIME = null;

	/** �� 17 List�ϐ��F l_l_UNIT_COST_TYP_DN */
	public List l_l_UNIT_COST_TYP_DN = null;

	/** �� 18 List�ϐ��F l_l_PUCH_ODR_INST_SLIP_ISS_FLG_DN */
	public List l_l_PUCH_ODR_INST_SLIP_ISS_FLG_DN = null;

	/** �� 19 List�ϐ��F l_l_PUCH_ODR_STS_TYP_DN */
	public List l_l_PUCH_ODR_STS_TYP_DN = null;

	/** �� 20 List�ϐ��F l_l_INSPC_CMPLT_FLG_DN */
	public List l_l_INSPC_CMPLT_FLG_DN = null;

	/** �� 21 List�ϐ��F l_l_SPL_ITEM_TYP_DN */
	public List l_l_SPL_ITEM_TYP_DN = null;

	/** �� 22 List�ϐ��F l_l_INV_CTRL_FLG_DN */
	public List l_l_INV_CTRL_FLG_DN = null;

	/** �� 23 List�ϐ��F l_l_NON_NO_ITEM_FLG_DN */
	public List l_l_NON_NO_ITEM_FLG_DN = null;

	/** �� 24 List�ϐ��F l_l_ODR_CANCEL_SLIP_ISS_FLG_DN */
	public List l_l_ODR_CANCEL_SLIP_ISS_FLG_DN = null;

	/** �� 25 List�ϐ��F l_l_PUCH_ODR_CD */
	public List l_l_PUCH_ODR_CD = null;

	/** �� 26 List�ϐ��F l_l_PLANT_CD */
	public List l_l_PLANT_CD = null;

	/** �� 27 List�ϐ��F l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** �� 28 List�ϐ��F l_l_WH_CD */
	public List l_l_WH_CD = null;

	/** �� 29 List�ϐ��F l_l_WH_NAME */
	public List l_l_WH_NAME = null;

	/** �� 30 List�ϐ��F l_l_ITEM_CD */
	public List l_l_ITEM_CD = null;

	/** �� 31 List�ϐ��F l_l_ITEM_NAME */
	public List l_l_ITEM_NAME = null;

	/** �� 32 List�ϐ��F l_l_COMPANY_CD */
	public List l_l_COMPANY_CD = null;

	/** �� 33 List�ϐ��F l_l_VEND_CD */
	public List l_l_VEND_CD = null;

	/** �� 34 List�ϐ��F l_l_VEND_ANAME */
	public List l_l_VEND_ANAME = null;

	/** �� 35 List�ϐ��F l_VEND_NAME */
	public List l_VEND_NAME = null;

	/** �� 36 List�ϐ��F l_l_PUCH_ODR_PERSON */
	public List l_l_PUCH_ODR_PERSON = null;

	/** �� 37 List�ϐ��F l_l_USER_NAME */
	public List l_l_USER_NAME = null;

	/** �� 38 List�ϐ��F l_l_PUCH_ODR_START_DATE */
	public List l_l_PUCH_ODR_START_DATE = null;

	/** �� 39 List�ϐ��F l_l_PUCH_ODR_DLV_DATE */
	public List l_l_PUCH_ODR_DLV_DATE = null;

	/** �� 40 List�ϐ��F l_l_PUCH_ODR_QTY */
	public List l_l_PUCH_ODR_QTY = null;

	/** �� 41 List�ϐ��F l_l_STOCK_UNIT */
	public List l_l_STOCK_UNIT = null;

	/** �� 42 List�ϐ��F l_l_UNIT_COST_TYP */
	public List l_l_UNIT_COST_TYP = null;

	/** �� 43 List�ϐ��F l_l_UNIT_COST */
	public List l_l_UNIT_COST = null;

	/** �� 44 List�ϐ��F l_l_PUCH_ODR_AMOUNT */
	public List l_l_PUCH_ODR_AMOUNT = null;

	/** �� 45 List�ϐ��F l_l_VEND_CUR_UNIT */
	public List l_l_VEND_CUR_UNIT = null;

	/** �� 46 List�ϐ��F l_l_DISC_AMOUNT */
	public List l_l_DISC_AMOUNT = null;

	/** �� 47 List�ϐ��F l_l_NET_AMOUNT */
	public List l_l_NET_AMOUNT = null;

	/** �� 48 List�ϐ��F l_l_TAX_AMOUNT_1 */
	public List l_l_TAX_AMOUNT_1 = null;

	/** �� 49 List�ϐ��F l_l_TAX_AMOUNT_2 */
	public List l_l_TAX_AMOUNT_2 = null;

	/** �� 50 List�ϐ��F l_l_TAX_AMOUNT_3 */
	public List l_l_TAX_AMOUNT_3 = null;

	/** �� 51 List�ϐ��F l_l_AMOUNT_INCLUDE_TAX */
	public List l_l_AMOUNT_INCLUDE_TAX = null;

	/** �� 52 List�ϐ��F l_l_RATE_JUDGE_DATE */
	public List l_l_RATE_JUDGE_DATE = null;

	/** �� 53 List�ϐ��F l_l_EXCH_RATE */
	public List l_l_EXCH_RATE = null;

	/** �� 54 List�ϐ��F l_l_HOME_CUR_AMOUNT */
	public List l_l_HOME_CUR_AMOUNT = null;

	/** �� 55 List�ϐ��F l_l_HOME_CUR_UNIT */
	public List l_l_HOME_CUR_UNIT = null;

	/** �� 56 List�ϐ��F l_l_PUCH_ODR_INST_DATE */
	public List l_l_PUCH_ODR_INST_DATE = null;

	/** �� 57 List�ϐ��F l_l_PUCH_ODR_INST_SLIP_ISS_FLG */
	public List l_l_PUCH_ODR_INST_SLIP_ISS_FLG = null;

	/** �� 58 List�ϐ��F l_l_PUCH_ODR_SLIP_ISS_DATE */
	public List l_l_PUCH_ODR_SLIP_ISS_DATE = null;

	/** �� 59 List�ϐ��F l_l_PUCH_ODR_STS_TYP */
	public List l_l_PUCH_ODR_STS_TYP = null;

	/** �� 60 List�ϐ��F l_l_INSPC_CMPLT_FLG */
	public List l_l_INSPC_CMPLT_FLG = null;

	/** �� 61 List�ϐ��F l_l_INSPC_CMPLT_DATE */
	public List l_l_INSPC_CMPLT_DATE = null;

	/** �� 62 List�ϐ��F l_l_CONFIRM_DLV_DATE */
	public List l_l_CONFIRM_DLV_DATE = null;

	/** �� 63 List�ϐ��F l_l_SPL_ITEM_TYP */
	public List l_l_SPL_ITEM_TYP = null;

	/** �� 64 List�ϐ��F l_l_ACPT_INSPC_TYP */
	public List l_l_ACPT_INSPC_TYP = null;

	/** �� 65 List�ϐ��F l_l_INV_CTRL_FLG */
	public List l_l_INV_CTRL_FLG = null;

	/** �� 66 List�ϐ��F l_l_WORK_ODR_CD */
	public List l_l_WORK_ODR_CD = null;

	/** �� 67 List�ϐ��F l_l_OD_NO */
	public List l_l_OD_NO = null;

	/** �� 68 List�ϐ��F l_l_JOB_ODR_CD */
	public List l_l_JOB_ODR_CD = null;

	/** �� 69 List�ϐ��F l_l_PUCH_ODR_COMMENT */
	public List l_l_PUCH_ODR_COMMENT = null;

	/** �� 70 List�ϐ��F l_l_ODR_CD */
	public List l_l_ODR_CD = null;

	/** �� 71 List�ϐ��F l_l_DETAIL_NO */
	public List l_l_DETAIL_NO = null;

	/** �� 72 List�ϐ��F l_l_NON_NO_ITEM_FLG */
	public List l_l_NON_NO_ITEM_FLG = null;

	/** �� 73 List�ϐ��F l_l_DRAW_CD */
	public List l_l_DRAW_CD = null;

	/** �� 74 List�ϐ��F l_l_SPEC */
	public List l_l_SPEC = null;

	/** �� 75 List�ϐ��F l_l_MRP_ODR_TYP */
	public List l_l_MRP_ODR_TYP = null;

	/** �� 76 List�ϐ��F l_l_ACPT_QTY */
	public List l_l_ACPT_QTY = null;

	/** �� 77 List�ϐ��F l_l_ACPT_CMPLT_DATE */
	public List l_l_ACPT_CMPLT_DATE = null;

	/** �� 78 List�ϐ��F l_l_INSPECTED_QTY */
	public List l_l_INSPECTED_QTY = null;

	/** �� 79 List�ϐ��F l_l_ACCEPTED_QTY */
	public List l_l_ACCEPTED_QTY = null;

	/** �� 80 List�ϐ��F l_l_PUCH_ODR_EDI_ISS_DATE */
	public List l_l_PUCH_ODR_EDI_ISS_DATE = null;

	/** �� 81 List�ϐ��F l_l_ODR_CANCEL_SLIP_ISS_DATE */
	public List l_l_ODR_CANCEL_SLIP_ISS_DATE = null;

	/** �� 82 List�ϐ��F l_l_CONFIRM_DLV_DATE_COMMENT */
	public List l_l_CONFIRM_DLV_DATE_COMMENT = null;

	/** �� 83 List�ϐ��F l_l_ODR_CANCEL_SLIP_ISS_FLG */
	public List l_l_ODR_CANCEL_SLIP_ISS_FLG = null;

	/** �� 84 List�ϐ��F l_l_ODR_CANCEL_EDI_ISS_DATE */
	public List l_l_ODR_CANCEL_EDI_ISS_DATE = null;

	/** �� 85 List�ϐ��F l_l_ODR_CANCEL_CAUSE_CD */
	public List l_l_ODR_CANCEL_CAUSE_CD = null;

	/** �� 86 List�ϐ��F l_l_STATUS */
	public List l_l_STATUS = null;

	/** �� 87 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 88 List�ϐ��F l_PUCH_ODR_START_DATE_ALL */
	public List l_PUCH_ODR_START_DATE_ALL = null;

	/** �� 89 List�ϐ��F l_PUCH_ODR_DLV_DATE_ALL */
	public List l_PUCH_ODR_DLV_DATE_ALL = null;

	/** �� 90 List�ϐ��F l_VEND_CD */
	public List l_VEND_CD = null;

	/** �� 91 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 92 List�ϐ��F l_PUCH_ODR_CD */
	public List l_PUCH_ODR_CD = null;

	/** �� 93 List�ϐ��F l_STATUS1 */
	public List l_STATUS1 = null;

	/** �� 94 List�ϐ��F l_STATUS2 */
	public List l_STATUS2 = null;

	/** �� 95 List�ϐ��F l_STATUS3 */
	public List l_STATUS3 = null;

	/** �� 96 List�ϐ��F l_STATUS4 */
	public List l_STATUS4 = null;

	/** �� 97 List�ϐ��F l_STATUS5 */
	public List l_STATUS5 = null;

	/** �� 98 List�ϐ��F l_STATUS6 */
	public List l_STATUS6 = null;

	/** �� 99 List�ϐ��F l_STATUS7 */
	public List l_STATUS7 = null;

	/** �� 100 List�ϐ��F l_STATUS8 */
	public List l_STATUS8 = null;

	/** �� 101 List�ϐ��F l_WH_CD */
	public List l_WH_CD = null;

	/** �� 102 List�ϐ��F l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** �� 103 List�ϐ��F l_PUCH_ODR_PERSON */
	public List l_PUCH_ODR_PERSON = null;

	/** �� 104 List�ϐ��F l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** �� 105 List�ϐ��F l_OUT_PUCH_ODR_CD */
	public List l_OUT_PUCH_ODR_CD = null;

	/** �� 106 List�ϐ��F l_TIME_CTRL */
	public List l_TIME_CTRL = null;

	/** �� 107 List�ϐ��F l_WH_NAME */
	public List l_WH_NAME = null;

	/** �� 108 List�ϐ��F l_l_COUNT */
	public List l_l_COUNT = null;

	/** �� 109 List�ϐ��F l_ROW_COUNT */
	public List l_ROW_COUNT = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getPUCH_ODR_START_DATE() { return m_PUCH_ODR_START_DATE; }
	public String getPUCH_ODR_DLV_DATE() { return m_PUCH_ODR_DLV_DATE; }
	public String getl_MRP_ODR_TYP_DN() { return m_l_MRP_ODR_TYP_DN; }
	public String getl_ACPT_INSPC_TYP_DN() { return m_l_ACPT_INSPC_TYP_DN; }
	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getc1_WORK_STS_TYP() { return m_c1_WORK_STS_TYP; }
	public String getc2_WORK_STS_TYP() { return m_c2_WORK_STS_TYP; }
	public String getc3_WORK_STS_TYP() { return m_c3_WORK_STS_TYP; }
	public String getc4_WORK_STS_TYP() { return m_c4_WORK_STS_TYP; }
	public String getc5_WORK_STS_TYP() { return m_c5_WORK_STS_TYP; }
	public String getc6_WORK_STS_TYP() { return m_c6_WORK_STS_TYP; }
	public String getc7_WORK_STS_TYP() { return m_c7_WORK_STS_TYP; }
	public String getc8_WORK_STS_TYP() { return m_c8_WORK_STS_TYP; }
	public String getl_STATUS_DN() { return m_l_STATUS_DN; }
	public String getPUCH_ODR_START_TIME() { return m_PUCH_ODR_START_TIME; }
	public String getPUCH_ODR_DLV_TIME() { return m_PUCH_ODR_DLV_TIME; }
	public String getl_UNIT_COST_TYP_DN() { return m_l_UNIT_COST_TYP_DN; }
	public String getl_PUCH_ODR_INST_SLIP_ISS_FLG_DN() { return m_l_PUCH_ODR_INST_SLIP_ISS_FLG_DN; }
	public String getl_PUCH_ODR_STS_TYP_DN() { return m_l_PUCH_ODR_STS_TYP_DN; }
	public String getl_INSPC_CMPLT_FLG_DN() { return m_l_INSPC_CMPLT_FLG_DN; }
	public String getl_SPL_ITEM_TYP_DN() { return m_l_SPL_ITEM_TYP_DN; }
	public String getl_INV_CTRL_FLG_DN() { return m_l_INV_CTRL_FLG_DN; }
	public String getl_NON_NO_ITEM_FLG_DN() { return m_l_NON_NO_ITEM_FLG_DN; }
	public String getl_ODR_CANCEL_SLIP_ISS_FLG_DN() { return m_l_ODR_CANCEL_SLIP_ISS_FLG_DN; }
	public String getl_PUCH_ODR_CD() { return m_l_PUCH_ODR_CD; }
	public String getl_PLANT_CD() { return m_l_PLANT_CD; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getl_WH_CD() { return m_l_WH_CD; }
	public String getl_WH_NAME() { return m_l_WH_NAME; }
	public String getl_ITEM_CD() { return m_l_ITEM_CD; }
	public String getl_ITEM_NAME() { return m_l_ITEM_NAME; }
	public String getl_COMPANY_CD() { return m_l_COMPANY_CD; }
	public String getl_VEND_CD() { return m_l_VEND_CD; }
	public String getl_VEND_ANAME() { return m_l_VEND_ANAME; }
	public String getVEND_NAME() { return m_VEND_NAME; }
	public String getl_PUCH_ODR_PERSON() { return m_l_PUCH_ODR_PERSON; }
	public String getl_USER_NAME() { return m_l_USER_NAME; }
	public String getl_PUCH_ODR_START_DATE() { return m_l_PUCH_ODR_START_DATE; }
	public String getl_PUCH_ODR_DLV_DATE() { return m_l_PUCH_ODR_DLV_DATE; }
	public String getl_PUCH_ODR_QTY() { return m_l_PUCH_ODR_QTY; }
	public String getl_STOCK_UNIT() { return m_l_STOCK_UNIT; }
	public String getl_UNIT_COST_TYP() { return m_l_UNIT_COST_TYP; }
	public String getl_UNIT_COST() { return m_l_UNIT_COST; }
	public String getl_PUCH_ODR_AMOUNT() { return m_l_PUCH_ODR_AMOUNT; }
	public String getl_VEND_CUR_UNIT() { return m_l_VEND_CUR_UNIT; }
	public String getl_DISC_AMOUNT() { return m_l_DISC_AMOUNT; }
	public String getl_NET_AMOUNT() { return m_l_NET_AMOUNT; }
	public String getl_TAX_AMOUNT_1() { return m_l_TAX_AMOUNT_1; }
	public String getl_TAX_AMOUNT_2() { return m_l_TAX_AMOUNT_2; }
	public String getl_TAX_AMOUNT_3() { return m_l_TAX_AMOUNT_3; }
	public String getl_AMOUNT_INCLUDE_TAX() { return m_l_AMOUNT_INCLUDE_TAX; }
	public String getl_RATE_JUDGE_DATE() { return m_l_RATE_JUDGE_DATE; }
	public String getl_EXCH_RATE() { return m_l_EXCH_RATE; }
	public String getl_HOME_CUR_AMOUNT() { return m_l_HOME_CUR_AMOUNT; }
	public String getl_HOME_CUR_UNIT() { return m_l_HOME_CUR_UNIT; }
	public String getl_PUCH_ODR_INST_DATE() { return m_l_PUCH_ODR_INST_DATE; }
	public String getl_PUCH_ODR_INST_SLIP_ISS_FLG() { return m_l_PUCH_ODR_INST_SLIP_ISS_FLG; }
	public String getl_PUCH_ODR_SLIP_ISS_DATE() { return m_l_PUCH_ODR_SLIP_ISS_DATE; }
	public String getl_PUCH_ODR_STS_TYP() { return m_l_PUCH_ODR_STS_TYP; }
	public String getl_INSPC_CMPLT_FLG() { return m_l_INSPC_CMPLT_FLG; }
	public String getl_INSPC_CMPLT_DATE() { return m_l_INSPC_CMPLT_DATE; }
	public String getl_CONFIRM_DLV_DATE() { return m_l_CONFIRM_DLV_DATE; }
	public String getl_SPL_ITEM_TYP() { return m_l_SPL_ITEM_TYP; }
	public String getl_ACPT_INSPC_TYP() { return m_l_ACPT_INSPC_TYP; }
	public String getl_INV_CTRL_FLG() { return m_l_INV_CTRL_FLG; }
	public String getl_WORK_ODR_CD() { return m_l_WORK_ODR_CD; }
	public String getl_OD_NO() { return m_l_OD_NO; }
	public String getl_JOB_ODR_CD() { return m_l_JOB_ODR_CD; }
	public String getl_PUCH_ODR_COMMENT() { return m_l_PUCH_ODR_COMMENT; }
	public String getl_ODR_CD() { return m_l_ODR_CD; }
	public String getl_DETAIL_NO() { return m_l_DETAIL_NO; }
	public String getl_NON_NO_ITEM_FLG() { return m_l_NON_NO_ITEM_FLG; }
	public String getl_DRAW_CD() { return m_l_DRAW_CD; }
	public String getl_SPEC() { return m_l_SPEC; }
	public String getl_MRP_ODR_TYP() { return m_l_MRP_ODR_TYP; }
	public String getl_ACPT_QTY() { return m_l_ACPT_QTY; }
	public String getl_ACPT_CMPLT_DATE() { return m_l_ACPT_CMPLT_DATE; }
	public String getl_INSPECTED_QTY() { return m_l_INSPECTED_QTY; }
	public String getl_ACCEPTED_QTY() { return m_l_ACCEPTED_QTY; }
	public String getl_PUCH_ODR_EDI_ISS_DATE() { return m_l_PUCH_ODR_EDI_ISS_DATE; }
	public String getl_ODR_CANCEL_SLIP_ISS_DATE() { return m_l_ODR_CANCEL_SLIP_ISS_DATE; }
	public String getl_CONFIRM_DLV_DATE_COMMENT() { return m_l_CONFIRM_DLV_DATE_COMMENT; }
	public String getl_ODR_CANCEL_SLIP_ISS_FLG() { return m_l_ODR_CANCEL_SLIP_ISS_FLG; }
	public String getl_ODR_CANCEL_EDI_ISS_DATE() { return m_l_ODR_CANCEL_EDI_ISS_DATE; }
	public String getl_ODR_CANCEL_CAUSE_CD() { return m_l_ODR_CANCEL_CAUSE_CD; }
	public String getl_STATUS() { return m_l_STATUS; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getPUCH_ODR_START_DATE_ALL() { return m_PUCH_ODR_START_DATE_ALL; }
	public String getPUCH_ODR_DLV_DATE_ALL() { return m_PUCH_ODR_DLV_DATE_ALL; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getPUCH_ODR_CD() { return m_PUCH_ODR_CD; }
	public String getSTATUS1() { return m_STATUS1; }
	public String getSTATUS2() { return m_STATUS2; }
	public String getSTATUS3() { return m_STATUS3; }
	public String getSTATUS4() { return m_STATUS4; }
	public String getSTATUS5() { return m_STATUS5; }
	public String getSTATUS6() { return m_STATUS6; }
	public String getSTATUS7() { return m_STATUS7; }
	public String getSTATUS8() { return m_STATUS8; }
	public String getWH_CD() { return m_WH_CD; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getPUCH_ODR_PERSON() { return m_PUCH_ODR_PERSON; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getOUT_PUCH_ODR_CD() { return m_OUT_PUCH_ODR_CD; }
	public String getTIME_CTRL() { return m_TIME_CTRL; }
	public String getWH_NAME() { return m_WH_NAME; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }

	public List getList_PUCH_ODR_START_DATE() { return l_PUCH_ODR_START_DATE; }
	public List getList_PUCH_ODR_DLV_DATE() { return l_PUCH_ODR_DLV_DATE; }
	public List getList_l_MRP_ODR_TYP_DN() { return l_l_MRP_ODR_TYP_DN; }
	public List getList_l_ACPT_INSPC_TYP_DN() { return l_l_ACPT_INSPC_TYP_DN; }
	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_c1_WORK_STS_TYP() { return l_c1_WORK_STS_TYP; }
	public List getList_c2_WORK_STS_TYP() { return l_c2_WORK_STS_TYP; }
	public List getList_c3_WORK_STS_TYP() { return l_c3_WORK_STS_TYP; }
	public List getList_c4_WORK_STS_TYP() { return l_c4_WORK_STS_TYP; }
	public List getList_c5_WORK_STS_TYP() { return l_c5_WORK_STS_TYP; }
	public List getList_c6_WORK_STS_TYP() { return l_c6_WORK_STS_TYP; }
	public List getList_c7_WORK_STS_TYP() { return l_c7_WORK_STS_TYP; }
	public List getList_c8_WORK_STS_TYP() { return l_c8_WORK_STS_TYP; }
	public List getList_l_STATUS_DN() { return l_l_STATUS_DN; }
	public List getList_PUCH_ODR_START_TIME() { return l_PUCH_ODR_START_TIME; }
	public List getList_PUCH_ODR_DLV_TIME() { return l_PUCH_ODR_DLV_TIME; }
	public List getList_l_UNIT_COST_TYP_DN() { return l_l_UNIT_COST_TYP_DN; }
	public List getList_l_PUCH_ODR_INST_SLIP_ISS_FLG_DN() { return l_l_PUCH_ODR_INST_SLIP_ISS_FLG_DN; }
	public List getList_l_PUCH_ODR_STS_TYP_DN() { return l_l_PUCH_ODR_STS_TYP_DN; }
	public List getList_l_INSPC_CMPLT_FLG_DN() { return l_l_INSPC_CMPLT_FLG_DN; }
	public List getList_l_SPL_ITEM_TYP_DN() { return l_l_SPL_ITEM_TYP_DN; }
	public List getList_l_INV_CTRL_FLG_DN() { return l_l_INV_CTRL_FLG_DN; }
	public List getList_l_NON_NO_ITEM_FLG_DN() { return l_l_NON_NO_ITEM_FLG_DN; }
	public List getList_l_ODR_CANCEL_SLIP_ISS_FLG_DN() { return l_l_ODR_CANCEL_SLIP_ISS_FLG_DN; }
	public List getList_l_PUCH_ODR_CD() { return l_l_PUCH_ODR_CD; }
	public List getList_l_PLANT_CD() { return l_l_PLANT_CD; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_l_WH_CD() { return l_l_WH_CD; }
	public List getList_l_WH_NAME() { return l_l_WH_NAME; }
	public List getList_l_ITEM_CD() { return l_l_ITEM_CD; }
	public List getList_l_ITEM_NAME() { return l_l_ITEM_NAME; }
	public List getList_l_COMPANY_CD() { return l_l_COMPANY_CD; }
	public List getList_l_VEND_CD() { return l_l_VEND_CD; }
	public List getList_l_VEND_ANAME() { return l_l_VEND_ANAME; }
	public List getList_VEND_NAME() { return l_VEND_NAME; }
	public List getList_l_PUCH_ODR_PERSON() { return l_l_PUCH_ODR_PERSON; }
	public List getList_l_USER_NAME() { return l_l_USER_NAME; }
	public List getList_l_PUCH_ODR_START_DATE() { return l_l_PUCH_ODR_START_DATE; }
	public List getList_l_PUCH_ODR_DLV_DATE() { return l_l_PUCH_ODR_DLV_DATE; }
	public List getList_l_PUCH_ODR_QTY() { return l_l_PUCH_ODR_QTY; }
	public List getList_l_STOCK_UNIT() { return l_l_STOCK_UNIT; }
	public List getList_l_UNIT_COST_TYP() { return l_l_UNIT_COST_TYP; }
	public List getList_l_UNIT_COST() { return l_l_UNIT_COST; }
	public List getList_l_PUCH_ODR_AMOUNT() { return l_l_PUCH_ODR_AMOUNT; }
	public List getList_l_VEND_CUR_UNIT() { return l_l_VEND_CUR_UNIT; }
	public List getList_l_DISC_AMOUNT() { return l_l_DISC_AMOUNT; }
	public List getList_l_NET_AMOUNT() { return l_l_NET_AMOUNT; }
	public List getList_l_TAX_AMOUNT_1() { return l_l_TAX_AMOUNT_1; }
	public List getList_l_TAX_AMOUNT_2() { return l_l_TAX_AMOUNT_2; }
	public List getList_l_TAX_AMOUNT_3() { return l_l_TAX_AMOUNT_3; }
	public List getList_l_AMOUNT_INCLUDE_TAX() { return l_l_AMOUNT_INCLUDE_TAX; }
	public List getList_l_RATE_JUDGE_DATE() { return l_l_RATE_JUDGE_DATE; }
	public List getList_l_EXCH_RATE() { return l_l_EXCH_RATE; }
	public List getList_l_HOME_CUR_AMOUNT() { return l_l_HOME_CUR_AMOUNT; }
	public List getList_l_HOME_CUR_UNIT() { return l_l_HOME_CUR_UNIT; }
	public List getList_l_PUCH_ODR_INST_DATE() { return l_l_PUCH_ODR_INST_DATE; }
	public List getList_l_PUCH_ODR_INST_SLIP_ISS_FLG() { return l_l_PUCH_ODR_INST_SLIP_ISS_FLG; }
	public List getList_l_PUCH_ODR_SLIP_ISS_DATE() { return l_l_PUCH_ODR_SLIP_ISS_DATE; }
	public List getList_l_PUCH_ODR_STS_TYP() { return l_l_PUCH_ODR_STS_TYP; }
	public List getList_l_INSPC_CMPLT_FLG() { return l_l_INSPC_CMPLT_FLG; }
	public List getList_l_INSPC_CMPLT_DATE() { return l_l_INSPC_CMPLT_DATE; }
	public List getList_l_CONFIRM_DLV_DATE() { return l_l_CONFIRM_DLV_DATE; }
	public List getList_l_SPL_ITEM_TYP() { return l_l_SPL_ITEM_TYP; }
	public List getList_l_ACPT_INSPC_TYP() { return l_l_ACPT_INSPC_TYP; }
	public List getList_l_INV_CTRL_FLG() { return l_l_INV_CTRL_FLG; }
	public List getList_l_WORK_ODR_CD() { return l_l_WORK_ODR_CD; }
	public List getList_l_OD_NO() { return l_l_OD_NO; }
	public List getList_l_JOB_ODR_CD() { return l_l_JOB_ODR_CD; }
	public List getList_l_PUCH_ODR_COMMENT() { return l_l_PUCH_ODR_COMMENT; }
	public List getList_l_ODR_CD() { return l_l_ODR_CD; }
	public List getList_l_DETAIL_NO() { return l_l_DETAIL_NO; }
	public List getList_l_NON_NO_ITEM_FLG() { return l_l_NON_NO_ITEM_FLG; }
	public List getList_l_DRAW_CD() { return l_l_DRAW_CD; }
	public List getList_l_SPEC() { return l_l_SPEC; }
	public List getList_l_MRP_ODR_TYP() { return l_l_MRP_ODR_TYP; }
	public List getList_l_ACPT_QTY() { return l_l_ACPT_QTY; }
	public List getList_l_ACPT_CMPLT_DATE() { return l_l_ACPT_CMPLT_DATE; }
	public List getList_l_INSPECTED_QTY() { return l_l_INSPECTED_QTY; }
	public List getList_l_ACCEPTED_QTY() { return l_l_ACCEPTED_QTY; }
	public List getList_l_PUCH_ODR_EDI_ISS_DATE() { return l_l_PUCH_ODR_EDI_ISS_DATE; }
	public List getList_l_ODR_CANCEL_SLIP_ISS_DATE() { return l_l_ODR_CANCEL_SLIP_ISS_DATE; }
	public List getList_l_CONFIRM_DLV_DATE_COMMENT() { return l_l_CONFIRM_DLV_DATE_COMMENT; }
	public List getList_l_ODR_CANCEL_SLIP_ISS_FLG() { return l_l_ODR_CANCEL_SLIP_ISS_FLG; }
	public List getList_l_ODR_CANCEL_EDI_ISS_DATE() { return l_l_ODR_CANCEL_EDI_ISS_DATE; }
	public List getList_l_ODR_CANCEL_CAUSE_CD() { return l_l_ODR_CANCEL_CAUSE_CD; }
	public List getList_l_STATUS() { return l_l_STATUS; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_PUCH_ODR_START_DATE_ALL() { return l_PUCH_ODR_START_DATE_ALL; }
	public List getList_PUCH_ODR_DLV_DATE_ALL() { return l_PUCH_ODR_DLV_DATE_ALL; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_PUCH_ODR_CD() { return l_PUCH_ODR_CD; }
	public List getList_STATUS1() { return l_STATUS1; }
	public List getList_STATUS2() { return l_STATUS2; }
	public List getList_STATUS3() { return l_STATUS3; }
	public List getList_STATUS4() { return l_STATUS4; }
	public List getList_STATUS5() { return l_STATUS5; }
	public List getList_STATUS6() { return l_STATUS6; }
	public List getList_STATUS7() { return l_STATUS7; }
	public List getList_STATUS8() { return l_STATUS8; }
	public List getList_WH_CD() { return l_WH_CD; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_PUCH_ODR_PERSON() { return l_PUCH_ODR_PERSON; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_OUT_PUCH_ODR_CD() { return l_OUT_PUCH_ODR_CD; }
	public List getList_TIME_CTRL() { return l_TIME_CTRL; }
	public List getList_WH_NAME() { return l_WH_NAME; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }

	public void setPUCH_ODR_START_DATE(String val) { m_PUCH_ODR_START_DATE = val; }
	public void setPUCH_ODR_DLV_DATE(String val) { m_PUCH_ODR_DLV_DATE = val; }
	public void setl_MRP_ODR_TYP_DN(String val) { m_l_MRP_ODR_TYP_DN = val; }
	public void setl_ACPT_INSPC_TYP_DN(String val) { m_l_ACPT_INSPC_TYP_DN = val; }
	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setc1_WORK_STS_TYP(String val) { m_c1_WORK_STS_TYP = val; }
	public void setc2_WORK_STS_TYP(String val) { m_c2_WORK_STS_TYP = val; }
	public void setc3_WORK_STS_TYP(String val) { m_c3_WORK_STS_TYP = val; }
	public void setc4_WORK_STS_TYP(String val) { m_c4_WORK_STS_TYP = val; }
	public void setc5_WORK_STS_TYP(String val) { m_c5_WORK_STS_TYP = val; }
	public void setc6_WORK_STS_TYP(String val) { m_c6_WORK_STS_TYP = val; }
	public void setc7_WORK_STS_TYP(String val) { m_c7_WORK_STS_TYP = val; }
	public void setc8_WORK_STS_TYP(String val) { m_c8_WORK_STS_TYP = val; }
	public void setl_STATUS_DN(String val) { m_l_STATUS_DN = val; }
	public void setPUCH_ODR_START_TIME(String val) { m_PUCH_ODR_START_TIME = val; }
	public void setPUCH_ODR_DLV_TIME(String val) { m_PUCH_ODR_DLV_TIME = val; }
	public void setl_UNIT_COST_TYP_DN(String val) { m_l_UNIT_COST_TYP_DN = val; }
	public void setl_PUCH_ODR_INST_SLIP_ISS_FLG_DN(String val) { m_l_PUCH_ODR_INST_SLIP_ISS_FLG_DN = val; }
	public void setl_PUCH_ODR_STS_TYP_DN(String val) { m_l_PUCH_ODR_STS_TYP_DN = val; }
	public void setl_INSPC_CMPLT_FLG_DN(String val) { m_l_INSPC_CMPLT_FLG_DN = val; }
	public void setl_SPL_ITEM_TYP_DN(String val) { m_l_SPL_ITEM_TYP_DN = val; }
	public void setl_INV_CTRL_FLG_DN(String val) { m_l_INV_CTRL_FLG_DN = val; }
	public void setl_NON_NO_ITEM_FLG_DN(String val) { m_l_NON_NO_ITEM_FLG_DN = val; }
	public void setl_ODR_CANCEL_SLIP_ISS_FLG_DN(String val) { m_l_ODR_CANCEL_SLIP_ISS_FLG_DN = val; }
	public void setl_PUCH_ODR_CD(String val) { m_l_PUCH_ODR_CD = val; }
	public void setl_PLANT_CD(String val) { m_l_PLANT_CD = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setl_WH_CD(String val) { m_l_WH_CD = val; }
	public void setl_WH_NAME(String val) { m_l_WH_NAME = val; }
	public void setl_ITEM_CD(String val) { m_l_ITEM_CD = val; }
	public void setl_ITEM_NAME(String val) { m_l_ITEM_NAME = val; }
	public void setl_COMPANY_CD(String val) { m_l_COMPANY_CD = val; }
	public void setl_VEND_CD(String val) { m_l_VEND_CD = val; }
	public void setl_VEND_ANAME(String val) { m_l_VEND_ANAME = val; }
	public void setVEND_NAME(String val) { m_VEND_NAME = val; }
	public void setl_PUCH_ODR_PERSON(String val) { m_l_PUCH_ODR_PERSON = val; }
	public void setl_USER_NAME(String val) { m_l_USER_NAME = val; }
	public void setl_PUCH_ODR_START_DATE(String val) { m_l_PUCH_ODR_START_DATE = val; }
	public void setl_PUCH_ODR_DLV_DATE(String val) { m_l_PUCH_ODR_DLV_DATE = val; }
	public void setl_PUCH_ODR_QTY(String val) { m_l_PUCH_ODR_QTY = val; }
	public void setl_STOCK_UNIT(String val) { m_l_STOCK_UNIT = val; }
	public void setl_UNIT_COST_TYP(String val) { m_l_UNIT_COST_TYP = val; }
	public void setl_UNIT_COST(String val) { m_l_UNIT_COST = val; }
	public void setl_PUCH_ODR_AMOUNT(String val) { m_l_PUCH_ODR_AMOUNT = val; }
	public void setl_VEND_CUR_UNIT(String val) { m_l_VEND_CUR_UNIT = val; }
	public void setl_DISC_AMOUNT(String val) { m_l_DISC_AMOUNT = val; }
	public void setl_NET_AMOUNT(String val) { m_l_NET_AMOUNT = val; }
	public void setl_TAX_AMOUNT_1(String val) { m_l_TAX_AMOUNT_1 = val; }
	public void setl_TAX_AMOUNT_2(String val) { m_l_TAX_AMOUNT_2 = val; }
	public void setl_TAX_AMOUNT_3(String val) { m_l_TAX_AMOUNT_3 = val; }
	public void setl_AMOUNT_INCLUDE_TAX(String val) { m_l_AMOUNT_INCLUDE_TAX = val; }
	public void setl_RATE_JUDGE_DATE(String val) { m_l_RATE_JUDGE_DATE = val; }
	public void setl_EXCH_RATE(String val) { m_l_EXCH_RATE = val; }
	public void setl_HOME_CUR_AMOUNT(String val) { m_l_HOME_CUR_AMOUNT = val; }
	public void setl_HOME_CUR_UNIT(String val) { m_l_HOME_CUR_UNIT = val; }
	public void setl_PUCH_ODR_INST_DATE(String val) { m_l_PUCH_ODR_INST_DATE = val; }
	public void setl_PUCH_ODR_INST_SLIP_ISS_FLG(String val) { m_l_PUCH_ODR_INST_SLIP_ISS_FLG = val; }
	public void setl_PUCH_ODR_SLIP_ISS_DATE(String val) { m_l_PUCH_ODR_SLIP_ISS_DATE = val; }
	public void setl_PUCH_ODR_STS_TYP(String val) { m_l_PUCH_ODR_STS_TYP = val; }
	public void setl_INSPC_CMPLT_FLG(String val) { m_l_INSPC_CMPLT_FLG = val; }
	public void setl_INSPC_CMPLT_DATE(String val) { m_l_INSPC_CMPLT_DATE = val; }
	public void setl_CONFIRM_DLV_DATE(String val) { m_l_CONFIRM_DLV_DATE = val; }
	public void setl_SPL_ITEM_TYP(String val) { m_l_SPL_ITEM_TYP = val; }
	public void setl_ACPT_INSPC_TYP(String val) { m_l_ACPT_INSPC_TYP = val; }
	public void setl_INV_CTRL_FLG(String val) { m_l_INV_CTRL_FLG = val; }
	public void setl_WORK_ODR_CD(String val) { m_l_WORK_ODR_CD = val; }
	public void setl_OD_NO(String val) { m_l_OD_NO = val; }
	public void setl_JOB_ODR_CD(String val) { m_l_JOB_ODR_CD = val; }
	public void setl_PUCH_ODR_COMMENT(String val) { m_l_PUCH_ODR_COMMENT = val; }
	public void setl_ODR_CD(String val) { m_l_ODR_CD = val; }
	public void setl_DETAIL_NO(String val) { m_l_DETAIL_NO = val; }
	public void setl_NON_NO_ITEM_FLG(String val) { m_l_NON_NO_ITEM_FLG = val; }
	public void setl_DRAW_CD(String val) { m_l_DRAW_CD = val; }
	public void setl_SPEC(String val) { m_l_SPEC = val; }
	public void setl_MRP_ODR_TYP(String val) { m_l_MRP_ODR_TYP = val; }
	public void setl_ACPT_QTY(String val) { m_l_ACPT_QTY = val; }
	public void setl_ACPT_CMPLT_DATE(String val) { m_l_ACPT_CMPLT_DATE = val; }
	public void setl_INSPECTED_QTY(String val) { m_l_INSPECTED_QTY = val; }
	public void setl_ACCEPTED_QTY(String val) { m_l_ACCEPTED_QTY = val; }
	public void setl_PUCH_ODR_EDI_ISS_DATE(String val) { m_l_PUCH_ODR_EDI_ISS_DATE = val; }
	public void setl_ODR_CANCEL_SLIP_ISS_DATE(String val) { m_l_ODR_CANCEL_SLIP_ISS_DATE = val; }
	public void setl_CONFIRM_DLV_DATE_COMMENT(String val) { m_l_CONFIRM_DLV_DATE_COMMENT = val; }
	public void setl_ODR_CANCEL_SLIP_ISS_FLG(String val) { m_l_ODR_CANCEL_SLIP_ISS_FLG = val; }
	public void setl_ODR_CANCEL_EDI_ISS_DATE(String val) { m_l_ODR_CANCEL_EDI_ISS_DATE = val; }
	public void setl_ODR_CANCEL_CAUSE_CD(String val) { m_l_ODR_CANCEL_CAUSE_CD = val; }
	public void setl_STATUS(String val) { m_l_STATUS = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setPUCH_ODR_START_DATE_ALL(String val) { m_PUCH_ODR_START_DATE_ALL = val; }
	public void setPUCH_ODR_DLV_DATE_ALL(String val) { m_PUCH_ODR_DLV_DATE_ALL = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setPUCH_ODR_CD(String val) { m_PUCH_ODR_CD = val; }
	public void setSTATUS1(String val) { m_STATUS1 = val; }
	public void setSTATUS2(String val) { m_STATUS2 = val; }
	public void setSTATUS3(String val) { m_STATUS3 = val; }
	public void setSTATUS4(String val) { m_STATUS4 = val; }
	public void setSTATUS5(String val) { m_STATUS5 = val; }
	public void setSTATUS6(String val) { m_STATUS6 = val; }
	public void setSTATUS7(String val) { m_STATUS7 = val; }
	public void setSTATUS8(String val) { m_STATUS8 = val; }
	public void setWH_CD(String val) { m_WH_CD = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setPUCH_ODR_PERSON(String val) { m_PUCH_ODR_PERSON = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setOUT_PUCH_ODR_CD(String val) { m_OUT_PUCH_ODR_CD = val; }
	public void setTIME_CTRL(String val) { m_TIME_CTRL = val; }
	public void setWH_NAME(String val) { m_WH_NAME = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }


	public void setList_PUCH_ODR_START_DATE(List list) { l_PUCH_ODR_START_DATE = list; }
	public void setList_PUCH_ODR_DLV_DATE(List list) { l_PUCH_ODR_DLV_DATE = list; }
	public void setList_l_MRP_ODR_TYP_DN(List list) { l_l_MRP_ODR_TYP_DN = list; }
	public void setList_l_ACPT_INSPC_TYP_DN(List list) { l_l_ACPT_INSPC_TYP_DN = list; }
	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_c1_WORK_STS_TYP(List list) { l_c1_WORK_STS_TYP = list; }
	public void setList_c2_WORK_STS_TYP(List list) { l_c2_WORK_STS_TYP = list; }
	public void setList_c3_WORK_STS_TYP(List list) { l_c3_WORK_STS_TYP = list; }
	public void setList_c4_WORK_STS_TYP(List list) { l_c4_WORK_STS_TYP = list; }
	public void setList_c5_WORK_STS_TYP(List list) { l_c5_WORK_STS_TYP = list; }
	public void setList_c6_WORK_STS_TYP(List list) { l_c6_WORK_STS_TYP = list; }
	public void setList_c7_WORK_STS_TYP(List list) { l_c7_WORK_STS_TYP = list; }
	public void setList_c8_WORK_STS_TYP(List list) { l_c8_WORK_STS_TYP = list; }
	public void setList_l_STATUS_DN(List list) { l_l_STATUS_DN = list; }
	public void setList_PUCH_ODR_START_TIME(List list) { l_PUCH_ODR_START_TIME = list; }
	public void setList_PUCH_ODR_DLV_TIME(List list) { l_PUCH_ODR_DLV_TIME = list; }
	public void setList_l_UNIT_COST_TYP_DN(List list) { l_l_UNIT_COST_TYP_DN = list; }
	public void setList_l_PUCH_ODR_INST_SLIP_ISS_FLG_DN(List list) { l_l_PUCH_ODR_INST_SLIP_ISS_FLG_DN = list; }
	public void setList_l_PUCH_ODR_STS_TYP_DN(List list) { l_l_PUCH_ODR_STS_TYP_DN = list; }
	public void setList_l_INSPC_CMPLT_FLG_DN(List list) { l_l_INSPC_CMPLT_FLG_DN = list; }
	public void setList_l_SPL_ITEM_TYP_DN(List list) { l_l_SPL_ITEM_TYP_DN = list; }
	public void setList_l_INV_CTRL_FLG_DN(List list) { l_l_INV_CTRL_FLG_DN = list; }
	public void setList_l_NON_NO_ITEM_FLG_DN(List list) { l_l_NON_NO_ITEM_FLG_DN = list; }
	public void setList_l_ODR_CANCEL_SLIP_ISS_FLG_DN(List list) { l_l_ODR_CANCEL_SLIP_ISS_FLG_DN = list; }
	public void setList_l_PUCH_ODR_CD(List list) { l_l_PUCH_ODR_CD = list; }
	public void setList_l_PLANT_CD(List list) { l_l_PLANT_CD = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_l_WH_CD(List list) { l_l_WH_CD = list; }
	public void setList_l_WH_NAME(List list) { l_l_WH_NAME = list; }
	public void setList_l_ITEM_CD(List list) { l_l_ITEM_CD = list; }
	public void setList_l_ITEM_NAME(List list) { l_l_ITEM_NAME = list; }
	public void setList_l_COMPANY_CD(List list) { l_l_COMPANY_CD = list; }
	public void setList_l_VEND_CD(List list) { l_l_VEND_CD = list; }
	public void setList_l_VEND_ANAME(List list) { l_l_VEND_ANAME = list; }
	public void setList_VEND_NAME(List list) { l_VEND_NAME = list; }
	public void setList_l_PUCH_ODR_PERSON(List list) { l_l_PUCH_ODR_PERSON = list; }
	public void setList_l_USER_NAME(List list) { l_l_USER_NAME = list; }
	public void setList_l_PUCH_ODR_START_DATE(List list) { l_l_PUCH_ODR_START_DATE = list; }
	public void setList_l_PUCH_ODR_DLV_DATE(List list) { l_l_PUCH_ODR_DLV_DATE = list; }
	public void setList_l_PUCH_ODR_QTY(List list) { l_l_PUCH_ODR_QTY = list; }
	public void setList_l_STOCK_UNIT(List list) { l_l_STOCK_UNIT = list; }
	public void setList_l_UNIT_COST_TYP(List list) { l_l_UNIT_COST_TYP = list; }
	public void setList_l_UNIT_COST(List list) { l_l_UNIT_COST = list; }
	public void setList_l_PUCH_ODR_AMOUNT(List list) { l_l_PUCH_ODR_AMOUNT = list; }
	public void setList_l_VEND_CUR_UNIT(List list) { l_l_VEND_CUR_UNIT = list; }
	public void setList_l_DISC_AMOUNT(List list) { l_l_DISC_AMOUNT = list; }
	public void setList_l_NET_AMOUNT(List list) { l_l_NET_AMOUNT = list; }
	public void setList_l_TAX_AMOUNT_1(List list) { l_l_TAX_AMOUNT_1 = list; }
	public void setList_l_TAX_AMOUNT_2(List list) { l_l_TAX_AMOUNT_2 = list; }
	public void setList_l_TAX_AMOUNT_3(List list) { l_l_TAX_AMOUNT_3 = list; }
	public void setList_l_AMOUNT_INCLUDE_TAX(List list) { l_l_AMOUNT_INCLUDE_TAX = list; }
	public void setList_l_RATE_JUDGE_DATE(List list) { l_l_RATE_JUDGE_DATE = list; }
	public void setList_l_EXCH_RATE(List list) { l_l_EXCH_RATE = list; }
	public void setList_l_HOME_CUR_AMOUNT(List list) { l_l_HOME_CUR_AMOUNT = list; }
	public void setList_l_HOME_CUR_UNIT(List list) { l_l_HOME_CUR_UNIT = list; }
	public void setList_l_PUCH_ODR_INST_DATE(List list) { l_l_PUCH_ODR_INST_DATE = list; }
	public void setList_l_PUCH_ODR_INST_SLIP_ISS_FLG(List list) { l_l_PUCH_ODR_INST_SLIP_ISS_FLG = list; }
	public void setList_l_PUCH_ODR_SLIP_ISS_DATE(List list) { l_l_PUCH_ODR_SLIP_ISS_DATE = list; }
	public void setList_l_PUCH_ODR_STS_TYP(List list) { l_l_PUCH_ODR_STS_TYP = list; }
	public void setList_l_INSPC_CMPLT_FLG(List list) { l_l_INSPC_CMPLT_FLG = list; }
	public void setList_l_INSPC_CMPLT_DATE(List list) { l_l_INSPC_CMPLT_DATE = list; }
	public void setList_l_CONFIRM_DLV_DATE(List list) { l_l_CONFIRM_DLV_DATE = list; }
	public void setList_l_SPL_ITEM_TYP(List list) { l_l_SPL_ITEM_TYP = list; }
	public void setList_l_ACPT_INSPC_TYP(List list) { l_l_ACPT_INSPC_TYP = list; }
	public void setList_l_INV_CTRL_FLG(List list) { l_l_INV_CTRL_FLG = list; }
	public void setList_l_WORK_ODR_CD(List list) { l_l_WORK_ODR_CD = list; }
	public void setList_l_OD_NO(List list) { l_l_OD_NO = list; }
	public void setList_l_JOB_ODR_CD(List list) { l_l_JOB_ODR_CD = list; }
	public void setList_l_PUCH_ODR_COMMENT(List list) { l_l_PUCH_ODR_COMMENT = list; }
	public void setList_l_ODR_CD(List list) { l_l_ODR_CD = list; }
	public void setList_l_DETAIL_NO(List list) { l_l_DETAIL_NO = list; }
	public void setList_l_NON_NO_ITEM_FLG(List list) { l_l_NON_NO_ITEM_FLG = list; }
	public void setList_l_DRAW_CD(List list) { l_l_DRAW_CD = list; }
	public void setList_l_SPEC(List list) { l_l_SPEC = list; }
	public void setList_l_MRP_ODR_TYP(List list) { l_l_MRP_ODR_TYP = list; }
	public void setList_l_ACPT_QTY(List list) { l_l_ACPT_QTY = list; }
	public void setList_l_ACPT_CMPLT_DATE(List list) { l_l_ACPT_CMPLT_DATE = list; }
	public void setList_l_INSPECTED_QTY(List list) { l_l_INSPECTED_QTY = list; }
	public void setList_l_ACCEPTED_QTY(List list) { l_l_ACCEPTED_QTY = list; }
	public void setList_l_PUCH_ODR_EDI_ISS_DATE(List list) { l_l_PUCH_ODR_EDI_ISS_DATE = list; }
	public void setList_l_ODR_CANCEL_SLIP_ISS_DATE(List list) { l_l_ODR_CANCEL_SLIP_ISS_DATE = list; }
	public void setList_l_CONFIRM_DLV_DATE_COMMENT(List list) { l_l_CONFIRM_DLV_DATE_COMMENT = list; }
	public void setList_l_ODR_CANCEL_SLIP_ISS_FLG(List list) { l_l_ODR_CANCEL_SLIP_ISS_FLG = list; }
	public void setList_l_ODR_CANCEL_EDI_ISS_DATE(List list) { l_l_ODR_CANCEL_EDI_ISS_DATE = list; }
	public void setList_l_ODR_CANCEL_CAUSE_CD(List list) { l_l_ODR_CANCEL_CAUSE_CD = list; }
	public void setList_l_STATUS(List list) { l_l_STATUS = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_PUCH_ODR_START_DATE_ALL(List list) { l_PUCH_ODR_START_DATE_ALL = list; }
	public void setList_PUCH_ODR_DLV_DATE_ALL(List list) { l_PUCH_ODR_DLV_DATE_ALL = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_PUCH_ODR_CD(List list) { l_PUCH_ODR_CD = list; }
	public void setList_STATUS1(List list) { l_STATUS1 = list; }
	public void setList_STATUS2(List list) { l_STATUS2 = list; }
	public void setList_STATUS3(List list) { l_STATUS3 = list; }
	public void setList_STATUS4(List list) { l_STATUS4 = list; }
	public void setList_STATUS5(List list) { l_STATUS5 = list; }
	public void setList_STATUS6(List list) { l_STATUS6 = list; }
	public void setList_STATUS7(List list) { l_STATUS7 = list; }
	public void setList_STATUS8(List list) { l_STATUS8 = list; }
	public void setList_WH_CD(List list) { l_WH_CD = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_PUCH_ODR_PERSON(List list) { l_PUCH_ODR_PERSON = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_OUT_PUCH_ODR_CD(List list) { l_OUT_PUCH_ODR_CD = list; }
	public void setList_TIME_CTRL(List list) { l_TIME_CTRL = list; }
	public void setList_WH_NAME(List list) { l_WH_NAME = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }

	public int setL2L_PUCH_ODR_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_START_DATE == null) {
			l_PUCH_ODR_START_DATE = new ArrayList();
		} else {
			l_PUCH_ODR_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_START_DATE.add(((AE0090020Struct) list.get(i)).getPUCH_ODR_START_DATE());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_DLV_DATE == null) {
			l_PUCH_ODR_DLV_DATE = new ArrayList();
		} else {
			l_PUCH_ODR_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_DLV_DATE.add(((AE0090020Struct) list.get(i)).getPUCH_ODR_DLV_DATE());
		}
		return size;
	}
	public int setL2L_l_MRP_ODR_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_MRP_ODR_TYP_DN == null) {
			l_l_MRP_ODR_TYP_DN = new ArrayList();
		} else {
			l_l_MRP_ODR_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_MRP_ODR_TYP_DN.add(((AE0090020Struct) list.get(i)).getl_MRP_ODR_TYP_DN());
		}
		return size;
	}
	public int setL2L_l_ACPT_INSPC_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ACPT_INSPC_TYP_DN == null) {
			l_l_ACPT_INSPC_TYP_DN = new ArrayList();
		} else {
			l_l_ACPT_INSPC_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ACPT_INSPC_TYP_DN.add(((AE0090020Struct) list.get(i)).getl_ACPT_INSPC_TYP_DN());
		}
		return size;
	}
	public int setL2L_DOWNLOAD_FILE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DOWNLOAD_FILE == null) {
			l_DOWNLOAD_FILE = new ArrayList();
		} else {
			l_DOWNLOAD_FILE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DOWNLOAD_FILE.add(((AE0090020Struct) list.get(i)).getDOWNLOAD_FILE());
		}
		return size;
	}
	public int setL2L_c1_WORK_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c1_WORK_STS_TYP == null) {
			l_c1_WORK_STS_TYP = new ArrayList();
		} else {
			l_c1_WORK_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c1_WORK_STS_TYP.add(((AE0090020Struct) list.get(i)).getc1_WORK_STS_TYP());
		}
		return size;
	}
	public int setL2L_c2_WORK_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c2_WORK_STS_TYP == null) {
			l_c2_WORK_STS_TYP = new ArrayList();
		} else {
			l_c2_WORK_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c2_WORK_STS_TYP.add(((AE0090020Struct) list.get(i)).getc2_WORK_STS_TYP());
		}
		return size;
	}
	public int setL2L_c3_WORK_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c3_WORK_STS_TYP == null) {
			l_c3_WORK_STS_TYP = new ArrayList();
		} else {
			l_c3_WORK_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c3_WORK_STS_TYP.add(((AE0090020Struct) list.get(i)).getc3_WORK_STS_TYP());
		}
		return size;
	}
	public int setL2L_c4_WORK_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c4_WORK_STS_TYP == null) {
			l_c4_WORK_STS_TYP = new ArrayList();
		} else {
			l_c4_WORK_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c4_WORK_STS_TYP.add(((AE0090020Struct) list.get(i)).getc4_WORK_STS_TYP());
		}
		return size;
	}
	public int setL2L_c5_WORK_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c5_WORK_STS_TYP == null) {
			l_c5_WORK_STS_TYP = new ArrayList();
		} else {
			l_c5_WORK_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c5_WORK_STS_TYP.add(((AE0090020Struct) list.get(i)).getc5_WORK_STS_TYP());
		}
		return size;
	}
	public int setL2L_c6_WORK_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c6_WORK_STS_TYP == null) {
			l_c6_WORK_STS_TYP = new ArrayList();
		} else {
			l_c6_WORK_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c6_WORK_STS_TYP.add(((AE0090020Struct) list.get(i)).getc6_WORK_STS_TYP());
		}
		return size;
	}
	public int setL2L_c7_WORK_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c7_WORK_STS_TYP == null) {
			l_c7_WORK_STS_TYP = new ArrayList();
		} else {
			l_c7_WORK_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c7_WORK_STS_TYP.add(((AE0090020Struct) list.get(i)).getc7_WORK_STS_TYP());
		}
		return size;
	}
	public int setL2L_c8_WORK_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c8_WORK_STS_TYP == null) {
			l_c8_WORK_STS_TYP = new ArrayList();
		} else {
			l_c8_WORK_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c8_WORK_STS_TYP.add(((AE0090020Struct) list.get(i)).getc8_WORK_STS_TYP());
		}
		return size;
	}
	public int setL2L_l_STATUS_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_STATUS_DN == null) {
			l_l_STATUS_DN = new ArrayList();
		} else {
			l_l_STATUS_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_STATUS_DN.add(((AE0090020Struct) list.get(i)).getl_STATUS_DN());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_START_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_START_TIME == null) {
			l_PUCH_ODR_START_TIME = new ArrayList();
		} else {
			l_PUCH_ODR_START_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_START_TIME.add(((AE0090020Struct) list.get(i)).getPUCH_ODR_START_TIME());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_DLV_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_DLV_TIME == null) {
			l_PUCH_ODR_DLV_TIME = new ArrayList();
		} else {
			l_PUCH_ODR_DLV_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_DLV_TIME.add(((AE0090020Struct) list.get(i)).getPUCH_ODR_DLV_TIME());
		}
		return size;
	}
	public int setL2L_l_UNIT_COST_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_UNIT_COST_TYP_DN == null) {
			l_l_UNIT_COST_TYP_DN = new ArrayList();
		} else {
			l_l_UNIT_COST_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_UNIT_COST_TYP_DN.add(((AE0090020Struct) list.get(i)).getl_UNIT_COST_TYP_DN());
		}
		return size;
	}
	public int setL2L_l_PUCH_ODR_INST_SLIP_ISS_FLG_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PUCH_ODR_INST_SLIP_ISS_FLG_DN == null) {
			l_l_PUCH_ODR_INST_SLIP_ISS_FLG_DN = new ArrayList();
		} else {
			l_l_PUCH_ODR_INST_SLIP_ISS_FLG_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PUCH_ODR_INST_SLIP_ISS_FLG_DN.add(((AE0090020Struct) list.get(i)).getl_PUCH_ODR_INST_SLIP_ISS_FLG_DN());
		}
		return size;
	}
	public int setL2L_l_PUCH_ODR_STS_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PUCH_ODR_STS_TYP_DN == null) {
			l_l_PUCH_ODR_STS_TYP_DN = new ArrayList();
		} else {
			l_l_PUCH_ODR_STS_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PUCH_ODR_STS_TYP_DN.add(((AE0090020Struct) list.get(i)).getl_PUCH_ODR_STS_TYP_DN());
		}
		return size;
	}
	public int setL2L_l_INSPC_CMPLT_FLG_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_INSPC_CMPLT_FLG_DN == null) {
			l_l_INSPC_CMPLT_FLG_DN = new ArrayList();
		} else {
			l_l_INSPC_CMPLT_FLG_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_INSPC_CMPLT_FLG_DN.add(((AE0090020Struct) list.get(i)).getl_INSPC_CMPLT_FLG_DN());
		}
		return size;
	}
	public int setL2L_l_SPL_ITEM_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SPL_ITEM_TYP_DN == null) {
			l_l_SPL_ITEM_TYP_DN = new ArrayList();
		} else {
			l_l_SPL_ITEM_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SPL_ITEM_TYP_DN.add(((AE0090020Struct) list.get(i)).getl_SPL_ITEM_TYP_DN());
		}
		return size;
	}
	public int setL2L_l_INV_CTRL_FLG_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_INV_CTRL_FLG_DN == null) {
			l_l_INV_CTRL_FLG_DN = new ArrayList();
		} else {
			l_l_INV_CTRL_FLG_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_INV_CTRL_FLG_DN.add(((AE0090020Struct) list.get(i)).getl_INV_CTRL_FLG_DN());
		}
		return size;
	}
	public int setL2L_l_NON_NO_ITEM_FLG_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_NON_NO_ITEM_FLG_DN == null) {
			l_l_NON_NO_ITEM_FLG_DN = new ArrayList();
		} else {
			l_l_NON_NO_ITEM_FLG_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_NON_NO_ITEM_FLG_DN.add(((AE0090020Struct) list.get(i)).getl_NON_NO_ITEM_FLG_DN());
		}
		return size;
	}
	public int setL2L_l_ODR_CANCEL_SLIP_ISS_FLG_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ODR_CANCEL_SLIP_ISS_FLG_DN == null) {
			l_l_ODR_CANCEL_SLIP_ISS_FLG_DN = new ArrayList();
		} else {
			l_l_ODR_CANCEL_SLIP_ISS_FLG_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ODR_CANCEL_SLIP_ISS_FLG_DN.add(((AE0090020Struct) list.get(i)).getl_ODR_CANCEL_SLIP_ISS_FLG_DN());
		}
		return size;
	}
	public int setL2L_l_PUCH_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PUCH_ODR_CD == null) {
			l_l_PUCH_ODR_CD = new ArrayList();
		} else {
			l_l_PUCH_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PUCH_ODR_CD.add(((AE0090020Struct) list.get(i)).getl_PUCH_ODR_CD());
		}
		return size;
	}
	public int setL2L_l_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PLANT_CD == null) {
			l_l_PLANT_CD = new ArrayList();
		} else {
			l_l_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PLANT_CD.add(((AE0090020Struct) list.get(i)).getl_PLANT_CD());
		}
		return size;
	}
	public int setL2L_PLANT_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PLANT_NAME == null) {
			l_PLANT_NAME = new ArrayList();
		} else {
			l_PLANT_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PLANT_NAME.add(((AE0090020Struct) list.get(i)).getPLANT_NAME());
		}
		return size;
	}
	public int setL2L_l_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_WH_CD == null) {
			l_l_WH_CD = new ArrayList();
		} else {
			l_l_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_WH_CD.add(((AE0090020Struct) list.get(i)).getl_WH_CD());
		}
		return size;
	}
	public int setL2L_l_WH_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_WH_NAME == null) {
			l_l_WH_NAME = new ArrayList();
		} else {
			l_l_WH_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_WH_NAME.add(((AE0090020Struct) list.get(i)).getl_WH_NAME());
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
			l_l_ITEM_CD.add(((AE0090020Struct) list.get(i)).getl_ITEM_CD());
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
			l_l_ITEM_NAME.add(((AE0090020Struct) list.get(i)).getl_ITEM_NAME());
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
			l_l_COMPANY_CD.add(((AE0090020Struct) list.get(i)).getl_COMPANY_CD());
		}
		return size;
	}
	public int setL2L_l_VEND_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_VEND_CD == null) {
			l_l_VEND_CD = new ArrayList();
		} else {
			l_l_VEND_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_VEND_CD.add(((AE0090020Struct) list.get(i)).getl_VEND_CD());
		}
		return size;
	}
	public int setL2L_l_VEND_ANAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_VEND_ANAME == null) {
			l_l_VEND_ANAME = new ArrayList();
		} else {
			l_l_VEND_ANAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_VEND_ANAME.add(((AE0090020Struct) list.get(i)).getl_VEND_ANAME());
		}
		return size;
	}
	public int setL2L_VEND_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_NAME == null) {
			l_VEND_NAME = new ArrayList();
		} else {
			l_VEND_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_NAME.add(((AE0090020Struct) list.get(i)).getVEND_NAME());
		}
		return size;
	}
	public int setL2L_l_PUCH_ODR_PERSON(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PUCH_ODR_PERSON == null) {
			l_l_PUCH_ODR_PERSON = new ArrayList();
		} else {
			l_l_PUCH_ODR_PERSON.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PUCH_ODR_PERSON.add(((AE0090020Struct) list.get(i)).getl_PUCH_ODR_PERSON());
		}
		return size;
	}
	public int setL2L_l_USER_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_USER_NAME == null) {
			l_l_USER_NAME = new ArrayList();
		} else {
			l_l_USER_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_USER_NAME.add(((AE0090020Struct) list.get(i)).getl_USER_NAME());
		}
		return size;
	}
	public int setL2L_l_PUCH_ODR_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PUCH_ODR_START_DATE == null) {
			l_l_PUCH_ODR_START_DATE = new ArrayList();
		} else {
			l_l_PUCH_ODR_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PUCH_ODR_START_DATE.add(((AE0090020Struct) list.get(i)).getl_PUCH_ODR_START_DATE());
		}
		return size;
	}
	public int setL2L_l_PUCH_ODR_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PUCH_ODR_DLV_DATE == null) {
			l_l_PUCH_ODR_DLV_DATE = new ArrayList();
		} else {
			l_l_PUCH_ODR_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PUCH_ODR_DLV_DATE.add(((AE0090020Struct) list.get(i)).getl_PUCH_ODR_DLV_DATE());
		}
		return size;
	}
	public int setL2L_l_PUCH_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PUCH_ODR_QTY == null) {
			l_l_PUCH_ODR_QTY = new ArrayList();
		} else {
			l_l_PUCH_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PUCH_ODR_QTY.add(((AE0090020Struct) list.get(i)).getl_PUCH_ODR_QTY());
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
			l_l_STOCK_UNIT.add(((AE0090020Struct) list.get(i)).getl_STOCK_UNIT());
		}
		return size;
	}
	public int setL2L_l_UNIT_COST_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_UNIT_COST_TYP == null) {
			l_l_UNIT_COST_TYP = new ArrayList();
		} else {
			l_l_UNIT_COST_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_UNIT_COST_TYP.add(((AE0090020Struct) list.get(i)).getl_UNIT_COST_TYP());
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
			l_l_UNIT_COST.add(((AE0090020Struct) list.get(i)).getl_UNIT_COST());
		}
		return size;
	}
	public int setL2L_l_PUCH_ODR_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PUCH_ODR_AMOUNT == null) {
			l_l_PUCH_ODR_AMOUNT = new ArrayList();
		} else {
			l_l_PUCH_ODR_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PUCH_ODR_AMOUNT.add(((AE0090020Struct) list.get(i)).getl_PUCH_ODR_AMOUNT());
		}
		return size;
	}
	public int setL2L_l_VEND_CUR_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_VEND_CUR_UNIT == null) {
			l_l_VEND_CUR_UNIT = new ArrayList();
		} else {
			l_l_VEND_CUR_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_VEND_CUR_UNIT.add(((AE0090020Struct) list.get(i)).getl_VEND_CUR_UNIT());
		}
		return size;
	}
	public int setL2L_l_DISC_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DISC_AMOUNT == null) {
			l_l_DISC_AMOUNT = new ArrayList();
		} else {
			l_l_DISC_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DISC_AMOUNT.add(((AE0090020Struct) list.get(i)).getl_DISC_AMOUNT());
		}
		return size;
	}
	public int setL2L_l_NET_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_NET_AMOUNT == null) {
			l_l_NET_AMOUNT = new ArrayList();
		} else {
			l_l_NET_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_NET_AMOUNT.add(((AE0090020Struct) list.get(i)).getl_NET_AMOUNT());
		}
		return size;
	}
	public int setL2L_l_TAX_AMOUNT_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_TAX_AMOUNT_1 == null) {
			l_l_TAX_AMOUNT_1 = new ArrayList();
		} else {
			l_l_TAX_AMOUNT_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_TAX_AMOUNT_1.add(((AE0090020Struct) list.get(i)).getl_TAX_AMOUNT_1());
		}
		return size;
	}
	public int setL2L_l_TAX_AMOUNT_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_TAX_AMOUNT_2 == null) {
			l_l_TAX_AMOUNT_2 = new ArrayList();
		} else {
			l_l_TAX_AMOUNT_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_TAX_AMOUNT_2.add(((AE0090020Struct) list.get(i)).getl_TAX_AMOUNT_2());
		}
		return size;
	}
	public int setL2L_l_TAX_AMOUNT_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_TAX_AMOUNT_3 == null) {
			l_l_TAX_AMOUNT_3 = new ArrayList();
		} else {
			l_l_TAX_AMOUNT_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_TAX_AMOUNT_3.add(((AE0090020Struct) list.get(i)).getl_TAX_AMOUNT_3());
		}
		return size;
	}
	public int setL2L_l_AMOUNT_INCLUDE_TAX(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_AMOUNT_INCLUDE_TAX == null) {
			l_l_AMOUNT_INCLUDE_TAX = new ArrayList();
		} else {
			l_l_AMOUNT_INCLUDE_TAX.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_AMOUNT_INCLUDE_TAX.add(((AE0090020Struct) list.get(i)).getl_AMOUNT_INCLUDE_TAX());
		}
		return size;
	}
	public int setL2L_l_RATE_JUDGE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_RATE_JUDGE_DATE == null) {
			l_l_RATE_JUDGE_DATE = new ArrayList();
		} else {
			l_l_RATE_JUDGE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_RATE_JUDGE_DATE.add(((AE0090020Struct) list.get(i)).getl_RATE_JUDGE_DATE());
		}
		return size;
	}
	public int setL2L_l_EXCH_RATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_EXCH_RATE == null) {
			l_l_EXCH_RATE = new ArrayList();
		} else {
			l_l_EXCH_RATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_EXCH_RATE.add(((AE0090020Struct) list.get(i)).getl_EXCH_RATE());
		}
		return size;
	}
	public int setL2L_l_HOME_CUR_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_HOME_CUR_AMOUNT == null) {
			l_l_HOME_CUR_AMOUNT = new ArrayList();
		} else {
			l_l_HOME_CUR_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_HOME_CUR_AMOUNT.add(((AE0090020Struct) list.get(i)).getl_HOME_CUR_AMOUNT());
		}
		return size;
	}
	public int setL2L_l_HOME_CUR_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_HOME_CUR_UNIT == null) {
			l_l_HOME_CUR_UNIT = new ArrayList();
		} else {
			l_l_HOME_CUR_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_HOME_CUR_UNIT.add(((AE0090020Struct) list.get(i)).getl_HOME_CUR_UNIT());
		}
		return size;
	}
	public int setL2L_l_PUCH_ODR_INST_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PUCH_ODR_INST_DATE == null) {
			l_l_PUCH_ODR_INST_DATE = new ArrayList();
		} else {
			l_l_PUCH_ODR_INST_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PUCH_ODR_INST_DATE.add(((AE0090020Struct) list.get(i)).getl_PUCH_ODR_INST_DATE());
		}
		return size;
	}
	public int setL2L_l_PUCH_ODR_INST_SLIP_ISS_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PUCH_ODR_INST_SLIP_ISS_FLG == null) {
			l_l_PUCH_ODR_INST_SLIP_ISS_FLG = new ArrayList();
		} else {
			l_l_PUCH_ODR_INST_SLIP_ISS_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PUCH_ODR_INST_SLIP_ISS_FLG.add(((AE0090020Struct) list.get(i)).getl_PUCH_ODR_INST_SLIP_ISS_FLG());
		}
		return size;
	}
	public int setL2L_l_PUCH_ODR_SLIP_ISS_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PUCH_ODR_SLIP_ISS_DATE == null) {
			l_l_PUCH_ODR_SLIP_ISS_DATE = new ArrayList();
		} else {
			l_l_PUCH_ODR_SLIP_ISS_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PUCH_ODR_SLIP_ISS_DATE.add(((AE0090020Struct) list.get(i)).getl_PUCH_ODR_SLIP_ISS_DATE());
		}
		return size;
	}
	public int setL2L_l_PUCH_ODR_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PUCH_ODR_STS_TYP == null) {
			l_l_PUCH_ODR_STS_TYP = new ArrayList();
		} else {
			l_l_PUCH_ODR_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PUCH_ODR_STS_TYP.add(((AE0090020Struct) list.get(i)).getl_PUCH_ODR_STS_TYP());
		}
		return size;
	}
	public int setL2L_l_INSPC_CMPLT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_INSPC_CMPLT_FLG == null) {
			l_l_INSPC_CMPLT_FLG = new ArrayList();
		} else {
			l_l_INSPC_CMPLT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_INSPC_CMPLT_FLG.add(((AE0090020Struct) list.get(i)).getl_INSPC_CMPLT_FLG());
		}
		return size;
	}
	public int setL2L_l_INSPC_CMPLT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_INSPC_CMPLT_DATE == null) {
			l_l_INSPC_CMPLT_DATE = new ArrayList();
		} else {
			l_l_INSPC_CMPLT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_INSPC_CMPLT_DATE.add(((AE0090020Struct) list.get(i)).getl_INSPC_CMPLT_DATE());
		}
		return size;
	}
	public int setL2L_l_CONFIRM_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_CONFIRM_DLV_DATE == null) {
			l_l_CONFIRM_DLV_DATE = new ArrayList();
		} else {
			l_l_CONFIRM_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_CONFIRM_DLV_DATE.add(((AE0090020Struct) list.get(i)).getl_CONFIRM_DLV_DATE());
		}
		return size;
	}
	public int setL2L_l_SPL_ITEM_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SPL_ITEM_TYP == null) {
			l_l_SPL_ITEM_TYP = new ArrayList();
		} else {
			l_l_SPL_ITEM_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SPL_ITEM_TYP.add(((AE0090020Struct) list.get(i)).getl_SPL_ITEM_TYP());
		}
		return size;
	}
	public int setL2L_l_ACPT_INSPC_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ACPT_INSPC_TYP == null) {
			l_l_ACPT_INSPC_TYP = new ArrayList();
		} else {
			l_l_ACPT_INSPC_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ACPT_INSPC_TYP.add(((AE0090020Struct) list.get(i)).getl_ACPT_INSPC_TYP());
		}
		return size;
	}
	public int setL2L_l_INV_CTRL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_INV_CTRL_FLG == null) {
			l_l_INV_CTRL_FLG = new ArrayList();
		} else {
			l_l_INV_CTRL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_INV_CTRL_FLG.add(((AE0090020Struct) list.get(i)).getl_INV_CTRL_FLG());
		}
		return size;
	}
	public int setL2L_l_WORK_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_WORK_ODR_CD == null) {
			l_l_WORK_ODR_CD = new ArrayList();
		} else {
			l_l_WORK_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_WORK_ODR_CD.add(((AE0090020Struct) list.get(i)).getl_WORK_ODR_CD());
		}
		return size;
	}
	public int setL2L_l_OD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OD_NO == null) {
			l_l_OD_NO = new ArrayList();
		} else {
			l_l_OD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OD_NO.add(((AE0090020Struct) list.get(i)).getl_OD_NO());
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
			l_l_JOB_ODR_CD.add(((AE0090020Struct) list.get(i)).getl_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_l_PUCH_ODR_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PUCH_ODR_COMMENT == null) {
			l_l_PUCH_ODR_COMMENT = new ArrayList();
		} else {
			l_l_PUCH_ODR_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PUCH_ODR_COMMENT.add(((AE0090020Struct) list.get(i)).getl_PUCH_ODR_COMMENT());
		}
		return size;
	}
	public int setL2L_l_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ODR_CD == null) {
			l_l_ODR_CD = new ArrayList();
		} else {
			l_l_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ODR_CD.add(((AE0090020Struct) list.get(i)).getl_ODR_CD());
		}
		return size;
	}
	public int setL2L_l_DETAIL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DETAIL_NO == null) {
			l_l_DETAIL_NO = new ArrayList();
		} else {
			l_l_DETAIL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DETAIL_NO.add(((AE0090020Struct) list.get(i)).getl_DETAIL_NO());
		}
		return size;
	}
	public int setL2L_l_NON_NO_ITEM_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_NON_NO_ITEM_FLG == null) {
			l_l_NON_NO_ITEM_FLG = new ArrayList();
		} else {
			l_l_NON_NO_ITEM_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_NON_NO_ITEM_FLG.add(((AE0090020Struct) list.get(i)).getl_NON_NO_ITEM_FLG());
		}
		return size;
	}
	public int setL2L_l_DRAW_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DRAW_CD == null) {
			l_l_DRAW_CD = new ArrayList();
		} else {
			l_l_DRAW_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DRAW_CD.add(((AE0090020Struct) list.get(i)).getl_DRAW_CD());
		}
		return size;
	}
	public int setL2L_l_SPEC(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_SPEC == null) {
			l_l_SPEC = new ArrayList();
		} else {
			l_l_SPEC.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_SPEC.add(((AE0090020Struct) list.get(i)).getl_SPEC());
		}
		return size;
	}
	public int setL2L_l_MRP_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_MRP_ODR_TYP == null) {
			l_l_MRP_ODR_TYP = new ArrayList();
		} else {
			l_l_MRP_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_MRP_ODR_TYP.add(((AE0090020Struct) list.get(i)).getl_MRP_ODR_TYP());
		}
		return size;
	}
	public int setL2L_l_ACPT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ACPT_QTY == null) {
			l_l_ACPT_QTY = new ArrayList();
		} else {
			l_l_ACPT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ACPT_QTY.add(((AE0090020Struct) list.get(i)).getl_ACPT_QTY());
		}
		return size;
	}
	public int setL2L_l_ACPT_CMPLT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ACPT_CMPLT_DATE == null) {
			l_l_ACPT_CMPLT_DATE = new ArrayList();
		} else {
			l_l_ACPT_CMPLT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ACPT_CMPLT_DATE.add(((AE0090020Struct) list.get(i)).getl_ACPT_CMPLT_DATE());
		}
		return size;
	}
	public int setL2L_l_INSPECTED_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_INSPECTED_QTY == null) {
			l_l_INSPECTED_QTY = new ArrayList();
		} else {
			l_l_INSPECTED_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_INSPECTED_QTY.add(((AE0090020Struct) list.get(i)).getl_INSPECTED_QTY());
		}
		return size;
	}
	public int setL2L_l_ACCEPTED_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ACCEPTED_QTY == null) {
			l_l_ACCEPTED_QTY = new ArrayList();
		} else {
			l_l_ACCEPTED_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ACCEPTED_QTY.add(((AE0090020Struct) list.get(i)).getl_ACCEPTED_QTY());
		}
		return size;
	}
	public int setL2L_l_PUCH_ODR_EDI_ISS_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PUCH_ODR_EDI_ISS_DATE == null) {
			l_l_PUCH_ODR_EDI_ISS_DATE = new ArrayList();
		} else {
			l_l_PUCH_ODR_EDI_ISS_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PUCH_ODR_EDI_ISS_DATE.add(((AE0090020Struct) list.get(i)).getl_PUCH_ODR_EDI_ISS_DATE());
		}
		return size;
	}
	public int setL2L_l_ODR_CANCEL_SLIP_ISS_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ODR_CANCEL_SLIP_ISS_DATE == null) {
			l_l_ODR_CANCEL_SLIP_ISS_DATE = new ArrayList();
		} else {
			l_l_ODR_CANCEL_SLIP_ISS_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ODR_CANCEL_SLIP_ISS_DATE.add(((AE0090020Struct) list.get(i)).getl_ODR_CANCEL_SLIP_ISS_DATE());
		}
		return size;
	}
	public int setL2L_l_CONFIRM_DLV_DATE_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_CONFIRM_DLV_DATE_COMMENT == null) {
			l_l_CONFIRM_DLV_DATE_COMMENT = new ArrayList();
		} else {
			l_l_CONFIRM_DLV_DATE_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_CONFIRM_DLV_DATE_COMMENT.add(((AE0090020Struct) list.get(i)).getl_CONFIRM_DLV_DATE_COMMENT());
		}
		return size;
	}
	public int setL2L_l_ODR_CANCEL_SLIP_ISS_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ODR_CANCEL_SLIP_ISS_FLG == null) {
			l_l_ODR_CANCEL_SLIP_ISS_FLG = new ArrayList();
		} else {
			l_l_ODR_CANCEL_SLIP_ISS_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ODR_CANCEL_SLIP_ISS_FLG.add(((AE0090020Struct) list.get(i)).getl_ODR_CANCEL_SLIP_ISS_FLG());
		}
		return size;
	}
	public int setL2L_l_ODR_CANCEL_EDI_ISS_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ODR_CANCEL_EDI_ISS_DATE == null) {
			l_l_ODR_CANCEL_EDI_ISS_DATE = new ArrayList();
		} else {
			l_l_ODR_CANCEL_EDI_ISS_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ODR_CANCEL_EDI_ISS_DATE.add(((AE0090020Struct) list.get(i)).getl_ODR_CANCEL_EDI_ISS_DATE());
		}
		return size;
	}
	public int setL2L_l_ODR_CANCEL_CAUSE_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ODR_CANCEL_CAUSE_CD == null) {
			l_l_ODR_CANCEL_CAUSE_CD = new ArrayList();
		} else {
			l_l_ODR_CANCEL_CAUSE_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ODR_CANCEL_CAUSE_CD.add(((AE0090020Struct) list.get(i)).getl_ODR_CANCEL_CAUSE_CD());
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
			l_l_STATUS.add(((AE0090020Struct) list.get(i)).getl_STATUS());
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
			l_PLANT_CD.add(((AE0090020Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_START_DATE_ALL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_START_DATE_ALL == null) {
			l_PUCH_ODR_START_DATE_ALL = new ArrayList();
		} else {
			l_PUCH_ODR_START_DATE_ALL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_START_DATE_ALL.add(((AE0090020Struct) list.get(i)).getPUCH_ODR_START_DATE_ALL());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_DLV_DATE_ALL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_DLV_DATE_ALL == null) {
			l_PUCH_ODR_DLV_DATE_ALL = new ArrayList();
		} else {
			l_PUCH_ODR_DLV_DATE_ALL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_DLV_DATE_ALL.add(((AE0090020Struct) list.get(i)).getPUCH_ODR_DLV_DATE_ALL());
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
			l_VEND_CD.add(((AE0090020Struct) list.get(i)).getVEND_CD());
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
			l_ITEM_CD.add(((AE0090020Struct) list.get(i)).getITEM_CD());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_CD == null) {
			l_PUCH_ODR_CD = new ArrayList();
		} else {
			l_PUCH_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_CD.add(((AE0090020Struct) list.get(i)).getPUCH_ODR_CD());
		}
		return size;
	}
	public int setL2L_STATUS1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STATUS1 == null) {
			l_STATUS1 = new ArrayList();
		} else {
			l_STATUS1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STATUS1.add(((AE0090020Struct) list.get(i)).getSTATUS1());
		}
		return size;
	}
	public int setL2L_STATUS2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STATUS2 == null) {
			l_STATUS2 = new ArrayList();
		} else {
			l_STATUS2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STATUS2.add(((AE0090020Struct) list.get(i)).getSTATUS2());
		}
		return size;
	}
	public int setL2L_STATUS3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STATUS3 == null) {
			l_STATUS3 = new ArrayList();
		} else {
			l_STATUS3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STATUS3.add(((AE0090020Struct) list.get(i)).getSTATUS3());
		}
		return size;
	}
	public int setL2L_STATUS4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STATUS4 == null) {
			l_STATUS4 = new ArrayList();
		} else {
			l_STATUS4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STATUS4.add(((AE0090020Struct) list.get(i)).getSTATUS4());
		}
		return size;
	}
	public int setL2L_STATUS5(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STATUS5 == null) {
			l_STATUS5 = new ArrayList();
		} else {
			l_STATUS5.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STATUS5.add(((AE0090020Struct) list.get(i)).getSTATUS5());
		}
		return size;
	}
	public int setL2L_STATUS6(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STATUS6 == null) {
			l_STATUS6 = new ArrayList();
		} else {
			l_STATUS6.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STATUS6.add(((AE0090020Struct) list.get(i)).getSTATUS6());
		}
		return size;
	}
	public int setL2L_STATUS7(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STATUS7 == null) {
			l_STATUS7 = new ArrayList();
		} else {
			l_STATUS7.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STATUS7.add(((AE0090020Struct) list.get(i)).getSTATUS7());
		}
		return size;
	}
	public int setL2L_STATUS8(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STATUS8 == null) {
			l_STATUS8 = new ArrayList();
		} else {
			l_STATUS8.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STATUS8.add(((AE0090020Struct) list.get(i)).getSTATUS8());
		}
		return size;
	}
	public int setL2L_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WH_CD == null) {
			l_WH_CD = new ArrayList();
		} else {
			l_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WH_CD.add(((AE0090020Struct) list.get(i)).getWH_CD());
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
			l_JOB_ODR_CD.add(((AE0090020Struct) list.get(i)).getJOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_PERSON(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_PERSON == null) {
			l_PUCH_ODR_PERSON = new ArrayList();
		} else {
			l_PUCH_ODR_PERSON.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_PERSON.add(((AE0090020Struct) list.get(i)).getPUCH_ODR_PERSON());
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
			l_ITEM_NAME.add(((AE0090020Struct) list.get(i)).getITEM_NAME());
		}
		return size;
	}
	public int setL2L_OUT_PUCH_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OUT_PUCH_ODR_CD == null) {
			l_OUT_PUCH_ODR_CD = new ArrayList();
		} else {
			l_OUT_PUCH_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OUT_PUCH_ODR_CD.add(((AE0090020Struct) list.get(i)).getOUT_PUCH_ODR_CD());
		}
		return size;
	}
	public int setL2L_TIME_CTRL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TIME_CTRL == null) {
			l_TIME_CTRL = new ArrayList();
		} else {
			l_TIME_CTRL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TIME_CTRL.add(((AE0090020Struct) list.get(i)).getTIME_CTRL());
		}
		return size;
	}
	public int setL2L_WH_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WH_NAME == null) {
			l_WH_NAME = new ArrayList();
		} else {
			l_WH_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WH_NAME.add(((AE0090020Struct) list.get(i)).getWH_NAME());
		}
		return size;
	}
	public int setL2L_l_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_COUNT == null) {
			l_l_COUNT = new ArrayList();
		} else {
			l_l_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_COUNT.add(((AE0090020Struct) list.get(i)).getl_COUNT());
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
			l_ROW_COUNT.add(((AE0090020Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_PUCH_ODR_START_DATE = null;
		m_PUCH_ODR_DLV_DATE = null;
		m_l_MRP_ODR_TYP_DN = null;
		m_l_ACPT_INSPC_TYP_DN = null;
		m_DOWNLOAD_FILE = null;
		m_c1_WORK_STS_TYP = null;
		m_c2_WORK_STS_TYP = null;
		m_c3_WORK_STS_TYP = null;
		m_c4_WORK_STS_TYP = null;
		m_c5_WORK_STS_TYP = null;
		m_c6_WORK_STS_TYP = null;
		m_c7_WORK_STS_TYP = null;
		m_c8_WORK_STS_TYP = null;
		m_l_STATUS_DN = null;
		m_PUCH_ODR_START_TIME = null;
		m_PUCH_ODR_DLV_TIME = null;
		m_l_UNIT_COST_TYP_DN = null;
		m_l_PUCH_ODR_INST_SLIP_ISS_FLG_DN = null;
		m_l_PUCH_ODR_STS_TYP_DN = null;
		m_l_INSPC_CMPLT_FLG_DN = null;
		m_l_SPL_ITEM_TYP_DN = null;
		m_l_INV_CTRL_FLG_DN = null;
		m_l_NON_NO_ITEM_FLG_DN = null;
		m_l_ODR_CANCEL_SLIP_ISS_FLG_DN = null;
		m_l_PUCH_ODR_CD = null;
		m_l_PLANT_CD = null;
		m_PLANT_NAME = null;
		m_l_WH_CD = null;
		m_l_WH_NAME = null;
		m_l_ITEM_CD = null;
		m_l_ITEM_NAME = null;
		m_l_COMPANY_CD = null;
		m_l_VEND_CD = null;
		m_l_VEND_ANAME = null;
		m_VEND_NAME = null;
		m_l_PUCH_ODR_PERSON = null;
		m_l_USER_NAME = null;
		m_l_PUCH_ODR_START_DATE = null;
		m_l_PUCH_ODR_DLV_DATE = null;
		m_l_PUCH_ODR_QTY = null;
		m_l_STOCK_UNIT = null;
		m_l_UNIT_COST_TYP = null;
		m_l_UNIT_COST = null;
		m_l_PUCH_ODR_AMOUNT = null;
		m_l_VEND_CUR_UNIT = null;
		m_l_DISC_AMOUNT = null;
		m_l_NET_AMOUNT = null;
		m_l_TAX_AMOUNT_1 = null;
		m_l_TAX_AMOUNT_2 = null;
		m_l_TAX_AMOUNT_3 = null;
		m_l_AMOUNT_INCLUDE_TAX = null;
		m_l_RATE_JUDGE_DATE = null;
		m_l_EXCH_RATE = null;
		m_l_HOME_CUR_AMOUNT = null;
		m_l_HOME_CUR_UNIT = null;
		m_l_PUCH_ODR_INST_DATE = null;
		m_l_PUCH_ODR_INST_SLIP_ISS_FLG = null;
		m_l_PUCH_ODR_SLIP_ISS_DATE = null;
		m_l_PUCH_ODR_STS_TYP = null;
		m_l_INSPC_CMPLT_FLG = null;
		m_l_INSPC_CMPLT_DATE = null;
		m_l_CONFIRM_DLV_DATE = null;
		m_l_SPL_ITEM_TYP = null;
		m_l_ACPT_INSPC_TYP = null;
		m_l_INV_CTRL_FLG = null;
		m_l_WORK_ODR_CD = null;
		m_l_OD_NO = null;
		m_l_JOB_ODR_CD = null;
		m_l_PUCH_ODR_COMMENT = null;
		m_l_ODR_CD = null;
		m_l_DETAIL_NO = null;
		m_l_NON_NO_ITEM_FLG = null;
		m_l_DRAW_CD = null;
		m_l_SPEC = null;
		m_l_MRP_ODR_TYP = null;
		m_l_ACPT_QTY = null;
		m_l_ACPT_CMPLT_DATE = null;
		m_l_INSPECTED_QTY = null;
		m_l_ACCEPTED_QTY = null;
		m_l_PUCH_ODR_EDI_ISS_DATE = null;
		m_l_ODR_CANCEL_SLIP_ISS_DATE = null;
		m_l_CONFIRM_DLV_DATE_COMMENT = null;
		m_l_ODR_CANCEL_SLIP_ISS_FLG = null;
		m_l_ODR_CANCEL_EDI_ISS_DATE = null;
		m_l_ODR_CANCEL_CAUSE_CD = null;
		m_l_STATUS = null;
		m_PLANT_CD = null;
		m_PUCH_ODR_START_DATE_ALL = null;
		m_PUCH_ODR_DLV_DATE_ALL = null;
		m_VEND_CD = null;
		m_ITEM_CD = null;
		m_PUCH_ODR_CD = null;
		m_STATUS1 = null;
		m_STATUS2 = null;
		m_STATUS3 = null;
		m_STATUS4 = null;
		m_STATUS5 = null;
		m_STATUS6 = null;
		m_STATUS7 = null;
		m_STATUS8 = null;
		m_WH_CD = null;
		m_JOB_ODR_CD = null;
		m_PUCH_ODR_PERSON = null;
		m_ITEM_NAME = null;
		m_OUT_PUCH_ODR_CD = null;
		m_TIME_CTRL = null;
		m_WH_NAME = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;

		l_PUCH_ODR_START_DATE = null;
		l_PUCH_ODR_DLV_DATE = null;
		l_l_MRP_ODR_TYP_DN = null;
		l_l_ACPT_INSPC_TYP_DN = null;
		l_DOWNLOAD_FILE = null;
		l_c1_WORK_STS_TYP = null;
		l_c2_WORK_STS_TYP = null;
		l_c3_WORK_STS_TYP = null;
		l_c4_WORK_STS_TYP = null;
		l_c5_WORK_STS_TYP = null;
		l_c6_WORK_STS_TYP = null;
		l_c7_WORK_STS_TYP = null;
		l_c8_WORK_STS_TYP = null;
		l_l_STATUS_DN = null;
		l_PUCH_ODR_START_TIME = null;
		l_PUCH_ODR_DLV_TIME = null;
		l_l_UNIT_COST_TYP_DN = null;
		l_l_PUCH_ODR_INST_SLIP_ISS_FLG_DN = null;
		l_l_PUCH_ODR_STS_TYP_DN = null;
		l_l_INSPC_CMPLT_FLG_DN = null;
		l_l_SPL_ITEM_TYP_DN = null;
		l_l_INV_CTRL_FLG_DN = null;
		l_l_NON_NO_ITEM_FLG_DN = null;
		l_l_ODR_CANCEL_SLIP_ISS_FLG_DN = null;
		l_l_PUCH_ODR_CD = null;
		l_l_PLANT_CD = null;
		l_PLANT_NAME = null;
		l_l_WH_CD = null;
		l_l_WH_NAME = null;
		l_l_ITEM_CD = null;
		l_l_ITEM_NAME = null;
		l_l_COMPANY_CD = null;
		l_l_VEND_CD = null;
		l_l_VEND_ANAME = null;
		l_VEND_NAME = null;
		l_l_PUCH_ODR_PERSON = null;
		l_l_USER_NAME = null;
		l_l_PUCH_ODR_START_DATE = null;
		l_l_PUCH_ODR_DLV_DATE = null;
		l_l_PUCH_ODR_QTY = null;
		l_l_STOCK_UNIT = null;
		l_l_UNIT_COST_TYP = null;
		l_l_UNIT_COST = null;
		l_l_PUCH_ODR_AMOUNT = null;
		l_l_VEND_CUR_UNIT = null;
		l_l_DISC_AMOUNT = null;
		l_l_NET_AMOUNT = null;
		l_l_TAX_AMOUNT_1 = null;
		l_l_TAX_AMOUNT_2 = null;
		l_l_TAX_AMOUNT_3 = null;
		l_l_AMOUNT_INCLUDE_TAX = null;
		l_l_RATE_JUDGE_DATE = null;
		l_l_EXCH_RATE = null;
		l_l_HOME_CUR_AMOUNT = null;
		l_l_HOME_CUR_UNIT = null;
		l_l_PUCH_ODR_INST_DATE = null;
		l_l_PUCH_ODR_INST_SLIP_ISS_FLG = null;
		l_l_PUCH_ODR_SLIP_ISS_DATE = null;
		l_l_PUCH_ODR_STS_TYP = null;
		l_l_INSPC_CMPLT_FLG = null;
		l_l_INSPC_CMPLT_DATE = null;
		l_l_CONFIRM_DLV_DATE = null;
		l_l_SPL_ITEM_TYP = null;
		l_l_ACPT_INSPC_TYP = null;
		l_l_INV_CTRL_FLG = null;
		l_l_WORK_ODR_CD = null;
		l_l_OD_NO = null;
		l_l_JOB_ODR_CD = null;
		l_l_PUCH_ODR_COMMENT = null;
		l_l_ODR_CD = null;
		l_l_DETAIL_NO = null;
		l_l_NON_NO_ITEM_FLG = null;
		l_l_DRAW_CD = null;
		l_l_SPEC = null;
		l_l_MRP_ODR_TYP = null;
		l_l_ACPT_QTY = null;
		l_l_ACPT_CMPLT_DATE = null;
		l_l_INSPECTED_QTY = null;
		l_l_ACCEPTED_QTY = null;
		l_l_PUCH_ODR_EDI_ISS_DATE = null;
		l_l_ODR_CANCEL_SLIP_ISS_DATE = null;
		l_l_CONFIRM_DLV_DATE_COMMENT = null;
		l_l_ODR_CANCEL_SLIP_ISS_FLG = null;
		l_l_ODR_CANCEL_EDI_ISS_DATE = null;
		l_l_ODR_CANCEL_CAUSE_CD = null;
		l_l_STATUS = null;
		l_PLANT_CD = null;
		l_PUCH_ODR_START_DATE_ALL = null;
		l_PUCH_ODR_DLV_DATE_ALL = null;
		l_VEND_CD = null;
		l_ITEM_CD = null;
		l_PUCH_ODR_CD = null;
		l_STATUS1 = null;
		l_STATUS2 = null;
		l_STATUS3 = null;
		l_STATUS4 = null;
		l_STATUS5 = null;
		l_STATUS6 = null;
		l_STATUS7 = null;
		l_STATUS8 = null;
		l_WH_CD = null;
		l_JOB_ODR_CD = null;
		l_PUCH_ODR_PERSON = null;
		l_ITEM_NAME = null;
		l_OUT_PUCH_ODR_CD = null;
		l_TIME_CTRL = null;
		l_WH_NAME = null;
		l_l_COUNT = null;
		l_ROW_COUNT = null;

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
	 * medAE0090020�N���X�̕W���R���X�g���N�^
	 */
	public AE0090020Struct()
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
	public void setStruct(AE0090020Struct struct)
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
	public void setStructM(AE0090020Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setPUCH_ODR_START_DATE(struct.getPUCH_ODR_START_DATE());
			this.setPUCH_ODR_DLV_DATE(struct.getPUCH_ODR_DLV_DATE());
			this.setl_MRP_ODR_TYP_DN(struct.getl_MRP_ODR_TYP_DN());
			this.setl_ACPT_INSPC_TYP_DN(struct.getl_ACPT_INSPC_TYP_DN());
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setc1_WORK_STS_TYP(struct.getc1_WORK_STS_TYP());
			this.setc2_WORK_STS_TYP(struct.getc2_WORK_STS_TYP());
			this.setc3_WORK_STS_TYP(struct.getc3_WORK_STS_TYP());
			this.setc4_WORK_STS_TYP(struct.getc4_WORK_STS_TYP());
			this.setc5_WORK_STS_TYP(struct.getc5_WORK_STS_TYP());
			this.setc6_WORK_STS_TYP(struct.getc6_WORK_STS_TYP());
			this.setc7_WORK_STS_TYP(struct.getc7_WORK_STS_TYP());
			this.setc8_WORK_STS_TYP(struct.getc8_WORK_STS_TYP());
			this.setl_STATUS_DN(struct.getl_STATUS_DN());
			this.setPUCH_ODR_START_TIME(struct.getPUCH_ODR_START_TIME());
			this.setPUCH_ODR_DLV_TIME(struct.getPUCH_ODR_DLV_TIME());
			this.setl_UNIT_COST_TYP_DN(struct.getl_UNIT_COST_TYP_DN());
			this.setl_PUCH_ODR_INST_SLIP_ISS_FLG_DN(struct.getl_PUCH_ODR_INST_SLIP_ISS_FLG_DN());
			this.setl_PUCH_ODR_STS_TYP_DN(struct.getl_PUCH_ODR_STS_TYP_DN());
			this.setl_INSPC_CMPLT_FLG_DN(struct.getl_INSPC_CMPLT_FLG_DN());
			this.setl_SPL_ITEM_TYP_DN(struct.getl_SPL_ITEM_TYP_DN());
			this.setl_INV_CTRL_FLG_DN(struct.getl_INV_CTRL_FLG_DN());
			this.setl_NON_NO_ITEM_FLG_DN(struct.getl_NON_NO_ITEM_FLG_DN());
			this.setl_ODR_CANCEL_SLIP_ISS_FLG_DN(struct.getl_ODR_CANCEL_SLIP_ISS_FLG_DN());
			this.setl_PUCH_ODR_CD(struct.getl_PUCH_ODR_CD());
			this.setl_PLANT_CD(struct.getl_PLANT_CD());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.setl_WH_CD(struct.getl_WH_CD());
			this.setl_WH_NAME(struct.getl_WH_NAME());
			this.setl_ITEM_CD(struct.getl_ITEM_CD());
			this.setl_ITEM_NAME(struct.getl_ITEM_NAME());
			this.setl_COMPANY_CD(struct.getl_COMPANY_CD());
			this.setl_VEND_CD(struct.getl_VEND_CD());
			this.setl_VEND_ANAME(struct.getl_VEND_ANAME());
			this.setVEND_NAME(struct.getVEND_NAME());
			this.setl_PUCH_ODR_PERSON(struct.getl_PUCH_ODR_PERSON());
			this.setl_USER_NAME(struct.getl_USER_NAME());
			this.setl_PUCH_ODR_START_DATE(struct.getl_PUCH_ODR_START_DATE());
			this.setl_PUCH_ODR_DLV_DATE(struct.getl_PUCH_ODR_DLV_DATE());
			this.setl_PUCH_ODR_QTY(struct.getl_PUCH_ODR_QTY());
			this.setl_STOCK_UNIT(struct.getl_STOCK_UNIT());
			this.setl_UNIT_COST_TYP(struct.getl_UNIT_COST_TYP());
			this.setl_UNIT_COST(struct.getl_UNIT_COST());
			this.setl_PUCH_ODR_AMOUNT(struct.getl_PUCH_ODR_AMOUNT());
			this.setl_VEND_CUR_UNIT(struct.getl_VEND_CUR_UNIT());
			this.setl_DISC_AMOUNT(struct.getl_DISC_AMOUNT());
			this.setl_NET_AMOUNT(struct.getl_NET_AMOUNT());
			this.setl_TAX_AMOUNT_1(struct.getl_TAX_AMOUNT_1());
			this.setl_TAX_AMOUNT_2(struct.getl_TAX_AMOUNT_2());
			this.setl_TAX_AMOUNT_3(struct.getl_TAX_AMOUNT_3());
			this.setl_AMOUNT_INCLUDE_TAX(struct.getl_AMOUNT_INCLUDE_TAX());
			this.setl_RATE_JUDGE_DATE(struct.getl_RATE_JUDGE_DATE());
			this.setl_EXCH_RATE(struct.getl_EXCH_RATE());
			this.setl_HOME_CUR_AMOUNT(struct.getl_HOME_CUR_AMOUNT());
			this.setl_HOME_CUR_UNIT(struct.getl_HOME_CUR_UNIT());
			this.setl_PUCH_ODR_INST_DATE(struct.getl_PUCH_ODR_INST_DATE());
			this.setl_PUCH_ODR_INST_SLIP_ISS_FLG(struct.getl_PUCH_ODR_INST_SLIP_ISS_FLG());
			this.setl_PUCH_ODR_SLIP_ISS_DATE(struct.getl_PUCH_ODR_SLIP_ISS_DATE());
			this.setl_PUCH_ODR_STS_TYP(struct.getl_PUCH_ODR_STS_TYP());
			this.setl_INSPC_CMPLT_FLG(struct.getl_INSPC_CMPLT_FLG());
			this.setl_INSPC_CMPLT_DATE(struct.getl_INSPC_CMPLT_DATE());
			this.setl_CONFIRM_DLV_DATE(struct.getl_CONFIRM_DLV_DATE());
			this.setl_SPL_ITEM_TYP(struct.getl_SPL_ITEM_TYP());
			this.setl_ACPT_INSPC_TYP(struct.getl_ACPT_INSPC_TYP());
			this.setl_INV_CTRL_FLG(struct.getl_INV_CTRL_FLG());
			this.setl_WORK_ODR_CD(struct.getl_WORK_ODR_CD());
			this.setl_OD_NO(struct.getl_OD_NO());
			this.setl_JOB_ODR_CD(struct.getl_JOB_ODR_CD());
			this.setl_PUCH_ODR_COMMENT(struct.getl_PUCH_ODR_COMMENT());
			this.setl_ODR_CD(struct.getl_ODR_CD());
			this.setl_DETAIL_NO(struct.getl_DETAIL_NO());
			this.setl_NON_NO_ITEM_FLG(struct.getl_NON_NO_ITEM_FLG());
			this.setl_DRAW_CD(struct.getl_DRAW_CD());
			this.setl_SPEC(struct.getl_SPEC());
			this.setl_MRP_ODR_TYP(struct.getl_MRP_ODR_TYP());
			this.setl_ACPT_QTY(struct.getl_ACPT_QTY());
			this.setl_ACPT_CMPLT_DATE(struct.getl_ACPT_CMPLT_DATE());
			this.setl_INSPECTED_QTY(struct.getl_INSPECTED_QTY());
			this.setl_ACCEPTED_QTY(struct.getl_ACCEPTED_QTY());
			this.setl_PUCH_ODR_EDI_ISS_DATE(struct.getl_PUCH_ODR_EDI_ISS_DATE());
			this.setl_ODR_CANCEL_SLIP_ISS_DATE(struct.getl_ODR_CANCEL_SLIP_ISS_DATE());
			this.setl_CONFIRM_DLV_DATE_COMMENT(struct.getl_CONFIRM_DLV_DATE_COMMENT());
			this.setl_ODR_CANCEL_SLIP_ISS_FLG(struct.getl_ODR_CANCEL_SLIP_ISS_FLG());
			this.setl_ODR_CANCEL_EDI_ISS_DATE(struct.getl_ODR_CANCEL_EDI_ISS_DATE());
			this.setl_ODR_CANCEL_CAUSE_CD(struct.getl_ODR_CANCEL_CAUSE_CD());
			this.setl_STATUS(struct.getl_STATUS());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setPUCH_ODR_START_DATE_ALL(struct.getPUCH_ODR_START_DATE_ALL());
			this.setPUCH_ODR_DLV_DATE_ALL(struct.getPUCH_ODR_DLV_DATE_ALL());
			this.setVEND_CD(struct.getVEND_CD());
			this.setITEM_CD(struct.getITEM_CD());
			this.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());
			this.setSTATUS1(struct.getSTATUS1());
			this.setSTATUS2(struct.getSTATUS2());
			this.setSTATUS3(struct.getSTATUS3());
			this.setSTATUS4(struct.getSTATUS4());
			this.setSTATUS5(struct.getSTATUS5());
			this.setSTATUS6(struct.getSTATUS6());
			this.setSTATUS7(struct.getSTATUS7());
			this.setSTATUS8(struct.getSTATUS8());
			this.setWH_CD(struct.getWH_CD());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setPUCH_ODR_PERSON(struct.getPUCH_ODR_PERSON());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setOUT_PUCH_ODR_CD(struct.getOUT_PUCH_ODR_CD());
			this.setTIME_CTRL(struct.getTIME_CTRL());
			this.setWH_NAME(struct.getWH_NAME());
			this.setl_COUNT(struct.getl_COUNT());
			this.setROW_COUNT(struct.getROW_COUNT());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AE0090020Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_PUCH_ODR_START_DATE(struct.getList_PUCH_ODR_START_DATE());
			this.setList_PUCH_ODR_DLV_DATE(struct.getList_PUCH_ODR_DLV_DATE());
			this.setList_l_MRP_ODR_TYP_DN(struct.getList_l_MRP_ODR_TYP_DN());
			this.setList_l_ACPT_INSPC_TYP_DN(struct.getList_l_ACPT_INSPC_TYP_DN());
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_c1_WORK_STS_TYP(struct.getList_c1_WORK_STS_TYP());
			this.setList_c2_WORK_STS_TYP(struct.getList_c2_WORK_STS_TYP());
			this.setList_c3_WORK_STS_TYP(struct.getList_c3_WORK_STS_TYP());
			this.setList_c4_WORK_STS_TYP(struct.getList_c4_WORK_STS_TYP());
			this.setList_c5_WORK_STS_TYP(struct.getList_c5_WORK_STS_TYP());
			this.setList_c6_WORK_STS_TYP(struct.getList_c6_WORK_STS_TYP());
			this.setList_c7_WORK_STS_TYP(struct.getList_c7_WORK_STS_TYP());
			this.setList_c8_WORK_STS_TYP(struct.getList_c8_WORK_STS_TYP());
			this.setList_l_STATUS_DN(struct.getList_l_STATUS_DN());
			this.setList_PUCH_ODR_START_TIME(struct.getList_PUCH_ODR_START_TIME());
			this.setList_PUCH_ODR_DLV_TIME(struct.getList_PUCH_ODR_DLV_TIME());
			this.setList_l_UNIT_COST_TYP_DN(struct.getList_l_UNIT_COST_TYP_DN());
			this.setList_l_PUCH_ODR_INST_SLIP_ISS_FLG_DN(struct.getList_l_PUCH_ODR_INST_SLIP_ISS_FLG_DN());
			this.setList_l_PUCH_ODR_STS_TYP_DN(struct.getList_l_PUCH_ODR_STS_TYP_DN());
			this.setList_l_INSPC_CMPLT_FLG_DN(struct.getList_l_INSPC_CMPLT_FLG_DN());
			this.setList_l_SPL_ITEM_TYP_DN(struct.getList_l_SPL_ITEM_TYP_DN());
			this.setList_l_INV_CTRL_FLG_DN(struct.getList_l_INV_CTRL_FLG_DN());
			this.setList_l_NON_NO_ITEM_FLG_DN(struct.getList_l_NON_NO_ITEM_FLG_DN());
			this.setList_l_ODR_CANCEL_SLIP_ISS_FLG_DN(struct.getList_l_ODR_CANCEL_SLIP_ISS_FLG_DN());
			this.setList_l_PUCH_ODR_CD(struct.getList_l_PUCH_ODR_CD());
			this.setList_l_PLANT_CD(struct.getList_l_PLANT_CD());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_l_WH_CD(struct.getList_l_WH_CD());
			this.setList_l_WH_NAME(struct.getList_l_WH_NAME());
			this.setList_l_ITEM_CD(struct.getList_l_ITEM_CD());
			this.setList_l_ITEM_NAME(struct.getList_l_ITEM_NAME());
			this.setList_l_COMPANY_CD(struct.getList_l_COMPANY_CD());
			this.setList_l_VEND_CD(struct.getList_l_VEND_CD());
			this.setList_l_VEND_ANAME(struct.getList_l_VEND_ANAME());
			this.setList_VEND_NAME(struct.getList_VEND_NAME());
			this.setList_l_PUCH_ODR_PERSON(struct.getList_l_PUCH_ODR_PERSON());
			this.setList_l_USER_NAME(struct.getList_l_USER_NAME());
			this.setList_l_PUCH_ODR_START_DATE(struct.getList_l_PUCH_ODR_START_DATE());
			this.setList_l_PUCH_ODR_DLV_DATE(struct.getList_l_PUCH_ODR_DLV_DATE());
			this.setList_l_PUCH_ODR_QTY(struct.getList_l_PUCH_ODR_QTY());
			this.setList_l_STOCK_UNIT(struct.getList_l_STOCK_UNIT());
			this.setList_l_UNIT_COST_TYP(struct.getList_l_UNIT_COST_TYP());
			this.setList_l_UNIT_COST(struct.getList_l_UNIT_COST());
			this.setList_l_PUCH_ODR_AMOUNT(struct.getList_l_PUCH_ODR_AMOUNT());
			this.setList_l_VEND_CUR_UNIT(struct.getList_l_VEND_CUR_UNIT());
			this.setList_l_DISC_AMOUNT(struct.getList_l_DISC_AMOUNT());
			this.setList_l_NET_AMOUNT(struct.getList_l_NET_AMOUNT());
			this.setList_l_TAX_AMOUNT_1(struct.getList_l_TAX_AMOUNT_1());
			this.setList_l_TAX_AMOUNT_2(struct.getList_l_TAX_AMOUNT_2());
			this.setList_l_TAX_AMOUNT_3(struct.getList_l_TAX_AMOUNT_3());
			this.setList_l_AMOUNT_INCLUDE_TAX(struct.getList_l_AMOUNT_INCLUDE_TAX());
			this.setList_l_RATE_JUDGE_DATE(struct.getList_l_RATE_JUDGE_DATE());
			this.setList_l_EXCH_RATE(struct.getList_l_EXCH_RATE());
			this.setList_l_HOME_CUR_AMOUNT(struct.getList_l_HOME_CUR_AMOUNT());
			this.setList_l_HOME_CUR_UNIT(struct.getList_l_HOME_CUR_UNIT());
			this.setList_l_PUCH_ODR_INST_DATE(struct.getList_l_PUCH_ODR_INST_DATE());
			this.setList_l_PUCH_ODR_INST_SLIP_ISS_FLG(struct.getList_l_PUCH_ODR_INST_SLIP_ISS_FLG());
			this.setList_l_PUCH_ODR_SLIP_ISS_DATE(struct.getList_l_PUCH_ODR_SLIP_ISS_DATE());
			this.setList_l_PUCH_ODR_STS_TYP(struct.getList_l_PUCH_ODR_STS_TYP());
			this.setList_l_INSPC_CMPLT_FLG(struct.getList_l_INSPC_CMPLT_FLG());
			this.setList_l_INSPC_CMPLT_DATE(struct.getList_l_INSPC_CMPLT_DATE());
			this.setList_l_CONFIRM_DLV_DATE(struct.getList_l_CONFIRM_DLV_DATE());
			this.setList_l_SPL_ITEM_TYP(struct.getList_l_SPL_ITEM_TYP());
			this.setList_l_ACPT_INSPC_TYP(struct.getList_l_ACPT_INSPC_TYP());
			this.setList_l_INV_CTRL_FLG(struct.getList_l_INV_CTRL_FLG());
			this.setList_l_WORK_ODR_CD(struct.getList_l_WORK_ODR_CD());
			this.setList_l_OD_NO(struct.getList_l_OD_NO());
			this.setList_l_JOB_ODR_CD(struct.getList_l_JOB_ODR_CD());
			this.setList_l_PUCH_ODR_COMMENT(struct.getList_l_PUCH_ODR_COMMENT());
			this.setList_l_ODR_CD(struct.getList_l_ODR_CD());
			this.setList_l_DETAIL_NO(struct.getList_l_DETAIL_NO());
			this.setList_l_NON_NO_ITEM_FLG(struct.getList_l_NON_NO_ITEM_FLG());
			this.setList_l_DRAW_CD(struct.getList_l_DRAW_CD());
			this.setList_l_SPEC(struct.getList_l_SPEC());
			this.setList_l_MRP_ODR_TYP(struct.getList_l_MRP_ODR_TYP());
			this.setList_l_ACPT_QTY(struct.getList_l_ACPT_QTY());
			this.setList_l_ACPT_CMPLT_DATE(struct.getList_l_ACPT_CMPLT_DATE());
			this.setList_l_INSPECTED_QTY(struct.getList_l_INSPECTED_QTY());
			this.setList_l_ACCEPTED_QTY(struct.getList_l_ACCEPTED_QTY());
			this.setList_l_PUCH_ODR_EDI_ISS_DATE(struct.getList_l_PUCH_ODR_EDI_ISS_DATE());
			this.setList_l_ODR_CANCEL_SLIP_ISS_DATE(struct.getList_l_ODR_CANCEL_SLIP_ISS_DATE());
			this.setList_l_CONFIRM_DLV_DATE_COMMENT(struct.getList_l_CONFIRM_DLV_DATE_COMMENT());
			this.setList_l_ODR_CANCEL_SLIP_ISS_FLG(struct.getList_l_ODR_CANCEL_SLIP_ISS_FLG());
			this.setList_l_ODR_CANCEL_EDI_ISS_DATE(struct.getList_l_ODR_CANCEL_EDI_ISS_DATE());
			this.setList_l_ODR_CANCEL_CAUSE_CD(struct.getList_l_ODR_CANCEL_CAUSE_CD());
			this.setList_l_STATUS(struct.getList_l_STATUS());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_PUCH_ODR_START_DATE_ALL(struct.getList_PUCH_ODR_START_DATE_ALL());
			this.setList_PUCH_ODR_DLV_DATE_ALL(struct.getList_PUCH_ODR_DLV_DATE_ALL());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_PUCH_ODR_CD(struct.getList_PUCH_ODR_CD());
			this.setList_STATUS1(struct.getList_STATUS1());
			this.setList_STATUS2(struct.getList_STATUS2());
			this.setList_STATUS3(struct.getList_STATUS3());
			this.setList_STATUS4(struct.getList_STATUS4());
			this.setList_STATUS5(struct.getList_STATUS5());
			this.setList_STATUS6(struct.getList_STATUS6());
			this.setList_STATUS7(struct.getList_STATUS7());
			this.setList_STATUS8(struct.getList_STATUS8());
			this.setList_WH_CD(struct.getList_WH_CD());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_PUCH_ODR_PERSON(struct.getList_PUCH_ODR_PERSON());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_OUT_PUCH_ODR_CD(struct.getList_OUT_PUCH_ODR_CD());
			this.setList_TIME_CTRL(struct.getList_TIME_CTRL());
			this.setList_WH_NAME(struct.getList_WH_NAME());
			this.setList_l_COUNT(struct.getList_l_COUNT());
			this.setList_ROW_COUNT(struct.getList_ROW_COUNT());
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
	// �� 1 �ϐ������l�F i_PUCH_ODR_START_DATE


	final static String i_PUCH_ODR_START_DATE = null;

	// �� 2 �ϐ������l�F i_PUCH_ODR_DLV_DATE


	final static String i_PUCH_ODR_DLV_DATE = null;

	// �� 3 �ϐ������l�F i_l_MRP_ODR_TYP_DN


	final static String i_l_MRP_ODR_TYP_DN = null;

	// �� 4 �ϐ������l�F i_l_ACPT_INSPC_TYP_DN


	final static String i_l_ACPT_INSPC_TYP_DN = null;

	// �� 5 �ϐ������l�F i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// �� 6 �ϐ������l�F i_c1_WORK_STS_TYP


	final static String i_c1_WORK_STS_TYP = null;

	// �� 7 �ϐ������l�F i_c2_WORK_STS_TYP


	final static String i_c2_WORK_STS_TYP = null;

	// �� 8 �ϐ������l�F i_c3_WORK_STS_TYP


	final static String i_c3_WORK_STS_TYP = null;

	// �� 9 �ϐ������l�F i_c4_WORK_STS_TYP


	final static String i_c4_WORK_STS_TYP = null;

	// �� 10 �ϐ������l�F i_c5_WORK_STS_TYP


	final static String i_c5_WORK_STS_TYP = null;

	// �� 11 �ϐ������l�F i_c6_WORK_STS_TYP


	final static String i_c6_WORK_STS_TYP = null;

	// �� 12 �ϐ������l�F i_c7_WORK_STS_TYP


	final static String i_c7_WORK_STS_TYP = null;

	// �� 13 �ϐ������l�F i_c8_WORK_STS_TYP


	final static String i_c8_WORK_STS_TYP = null;

	// �� 14 �ϐ������l�F i_l_STATUS_DN


	final static String i_l_STATUS_DN = null;

	// �� 15 �ϐ������l�F i_PUCH_ODR_START_TIME


	final static String i_PUCH_ODR_START_TIME = null;

	// �� 16 �ϐ������l�F i_PUCH_ODR_DLV_TIME


	final static String i_PUCH_ODR_DLV_TIME = null;

	// �� 17 �ϐ������l�F i_l_UNIT_COST_TYP_DN


	final static String i_l_UNIT_COST_TYP_DN = null;

	// �� 18 �ϐ������l�F i_l_PUCH_ODR_INST_SLIP_ISS_FLG_DN


	final static String i_l_PUCH_ODR_INST_SLIP_ISS_FLG_DN = null;

	// �� 19 �ϐ������l�F i_l_PUCH_ODR_STS_TYP_DN


	final static String i_l_PUCH_ODR_STS_TYP_DN = null;

	// �� 20 �ϐ������l�F i_l_INSPC_CMPLT_FLG_DN


	final static String i_l_INSPC_CMPLT_FLG_DN = null;

	// �� 21 �ϐ������l�F i_l_SPL_ITEM_TYP_DN


	final static String i_l_SPL_ITEM_TYP_DN = null;

	// �� 22 �ϐ������l�F i_l_INV_CTRL_FLG_DN


	final static String i_l_INV_CTRL_FLG_DN = null;

	// �� 23 �ϐ������l�F i_l_NON_NO_ITEM_FLG_DN


	final static String i_l_NON_NO_ITEM_FLG_DN = null;

	// �� 24 �ϐ������l�F i_l_ODR_CANCEL_SLIP_ISS_FLG_DN


	final static String i_l_ODR_CANCEL_SLIP_ISS_FLG_DN = null;

	// �� 25 �ϐ������l�F i_l_PUCH_ODR_CD


	final static String i_l_PUCH_ODR_CD = null;

	// �� 26 �ϐ������l�F i_l_PLANT_CD


	final static String i_l_PLANT_CD = null;

	// �� 27 �ϐ������l�F i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// �� 28 �ϐ������l�F i_l_WH_CD


	final static String i_l_WH_CD = null;

	// �� 29 �ϐ������l�F i_l_WH_NAME


	final static String i_l_WH_NAME = null;

	// �� 30 �ϐ������l�F i_l_ITEM_CD


	final static String i_l_ITEM_CD = null;

	// �� 31 �ϐ������l�F i_l_ITEM_NAME


	final static String i_l_ITEM_NAME = null;

	// �� 32 �ϐ������l�F i_l_COMPANY_CD


	final static String i_l_COMPANY_CD = null;

	// �� 33 �ϐ������l�F i_l_VEND_CD


	final static String i_l_VEND_CD = null;

	// �� 34 �ϐ������l�F i_l_VEND_ANAME


	final static String i_l_VEND_ANAME = null;

	// �� 35 �ϐ������l�F i_VEND_NAME


	final static String i_VEND_NAME = null;

	// �� 36 �ϐ������l�F i_l_PUCH_ODR_PERSON


	final static String i_l_PUCH_ODR_PERSON = null;

	// �� 37 �ϐ������l�F i_l_USER_NAME


	final static String i_l_USER_NAME = null;

	// �� 38 �ϐ������l�F i_l_PUCH_ODR_START_DATE


	final static String i_l_PUCH_ODR_START_DATE = null;

	// �� 39 �ϐ������l�F i_l_PUCH_ODR_DLV_DATE


	final static String i_l_PUCH_ODR_DLV_DATE = null;

	// �� 40 �ϐ������l�F i_l_PUCH_ODR_QTY


	final static String i_l_PUCH_ODR_QTY = null;

	// �� 41 �ϐ������l�F i_l_STOCK_UNIT


	final static String i_l_STOCK_UNIT = null;

	// �� 42 �ϐ������l�F i_l_UNIT_COST_TYP


	final static String i_l_UNIT_COST_TYP = null;

	// �� 43 �ϐ������l�F i_l_UNIT_COST


	final static String i_l_UNIT_COST = null;

	// �� 44 �ϐ������l�F i_l_PUCH_ODR_AMOUNT


	final static String i_l_PUCH_ODR_AMOUNT = null;

	// �� 45 �ϐ������l�F i_l_VEND_CUR_UNIT


	final static String i_l_VEND_CUR_UNIT = null;

	// �� 46 �ϐ������l�F i_l_DISC_AMOUNT


	final static String i_l_DISC_AMOUNT = null;

	// �� 47 �ϐ������l�F i_l_NET_AMOUNT


	final static String i_l_NET_AMOUNT = null;

	// �� 48 �ϐ������l�F i_l_TAX_AMOUNT_1


	final static String i_l_TAX_AMOUNT_1 = null;

	// �� 49 �ϐ������l�F i_l_TAX_AMOUNT_2


	final static String i_l_TAX_AMOUNT_2 = null;

	// �� 50 �ϐ������l�F i_l_TAX_AMOUNT_3


	final static String i_l_TAX_AMOUNT_3 = null;

	// �� 51 �ϐ������l�F i_l_AMOUNT_INCLUDE_TAX


	final static String i_l_AMOUNT_INCLUDE_TAX = null;

	// �� 52 �ϐ������l�F i_l_RATE_JUDGE_DATE


	final static String i_l_RATE_JUDGE_DATE = null;

	// �� 53 �ϐ������l�F i_l_EXCH_RATE


	final static String i_l_EXCH_RATE = null;

	// �� 54 �ϐ������l�F i_l_HOME_CUR_AMOUNT


	final static String i_l_HOME_CUR_AMOUNT = null;

	// �� 55 �ϐ������l�F i_l_HOME_CUR_UNIT


	final static String i_l_HOME_CUR_UNIT = null;

	// �� 56 �ϐ������l�F i_l_PUCH_ODR_INST_DATE


	final static String i_l_PUCH_ODR_INST_DATE = null;

	// �� 57 �ϐ������l�F i_l_PUCH_ODR_INST_SLIP_ISS_FLG


	final static String i_l_PUCH_ODR_INST_SLIP_ISS_FLG = null;

	// �� 58 �ϐ������l�F i_l_PUCH_ODR_SLIP_ISS_DATE


	final static String i_l_PUCH_ODR_SLIP_ISS_DATE = null;

	// �� 59 �ϐ������l�F i_l_PUCH_ODR_STS_TYP


	final static String i_l_PUCH_ODR_STS_TYP = null;

	// �� 60 �ϐ������l�F i_l_INSPC_CMPLT_FLG


	final static String i_l_INSPC_CMPLT_FLG = null;

	// �� 61 �ϐ������l�F i_l_INSPC_CMPLT_DATE


	final static String i_l_INSPC_CMPLT_DATE = null;

	// �� 62 �ϐ������l�F i_l_CONFIRM_DLV_DATE


	final static String i_l_CONFIRM_DLV_DATE = null;

	// �� 63 �ϐ������l�F i_l_SPL_ITEM_TYP


	final static String i_l_SPL_ITEM_TYP = null;

	// �� 64 �ϐ������l�F i_l_ACPT_INSPC_TYP


	final static String i_l_ACPT_INSPC_TYP = null;

	// �� 65 �ϐ������l�F i_l_INV_CTRL_FLG


	final static String i_l_INV_CTRL_FLG = null;

	// �� 66 �ϐ������l�F i_l_WORK_ODR_CD


	final static String i_l_WORK_ODR_CD = null;

	// �� 67 �ϐ������l�F i_l_OD_NO


	final static String i_l_OD_NO = null;

	// �� 68 �ϐ������l�F i_l_JOB_ODR_CD


	final static String i_l_JOB_ODR_CD = null;

	// �� 69 �ϐ������l�F i_l_PUCH_ODR_COMMENT


	final static String i_l_PUCH_ODR_COMMENT = null;

	// �� 70 �ϐ������l�F i_l_ODR_CD


	final static String i_l_ODR_CD = null;

	// �� 71 �ϐ������l�F i_l_DETAIL_NO


	final static String i_l_DETAIL_NO = null;

	// �� 72 �ϐ������l�F i_l_NON_NO_ITEM_FLG


	final static String i_l_NON_NO_ITEM_FLG = null;

	// �� 73 �ϐ������l�F i_l_DRAW_CD


	final static String i_l_DRAW_CD = null;

	// �� 74 �ϐ������l�F i_l_SPEC


	final static String i_l_SPEC = null;

	// �� 75 �ϐ������l�F i_l_MRP_ODR_TYP


	final static String i_l_MRP_ODR_TYP = null;

	// �� 76 �ϐ������l�F i_l_ACPT_QTY


	final static String i_l_ACPT_QTY = null;

	// �� 77 �ϐ������l�F i_l_ACPT_CMPLT_DATE


	final static String i_l_ACPT_CMPLT_DATE = null;

	// �� 78 �ϐ������l�F i_l_INSPECTED_QTY


	final static String i_l_INSPECTED_QTY = null;

	// �� 79 �ϐ������l�F i_l_ACCEPTED_QTY


	final static String i_l_ACCEPTED_QTY = null;

	// �� 80 �ϐ������l�F i_l_PUCH_ODR_EDI_ISS_DATE


	final static String i_l_PUCH_ODR_EDI_ISS_DATE = null;

	// �� 81 �ϐ������l�F i_l_ODR_CANCEL_SLIP_ISS_DATE


	final static String i_l_ODR_CANCEL_SLIP_ISS_DATE = null;

	// �� 82 �ϐ������l�F i_l_CONFIRM_DLV_DATE_COMMENT


	final static String i_l_CONFIRM_DLV_DATE_COMMENT = null;

	// �� 83 �ϐ������l�F i_l_ODR_CANCEL_SLIP_ISS_FLG


	final static String i_l_ODR_CANCEL_SLIP_ISS_FLG = null;

	// �� 84 �ϐ������l�F i_l_ODR_CANCEL_EDI_ISS_DATE


	final static String i_l_ODR_CANCEL_EDI_ISS_DATE = null;

	// �� 85 �ϐ������l�F i_l_ODR_CANCEL_CAUSE_CD


	final static String i_l_ODR_CANCEL_CAUSE_CD = null;

	// �� 86 �ϐ������l�F i_l_STATUS


	final static String i_l_STATUS = null;

	// �� 87 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 88 �ϐ������l�F i_PUCH_ODR_START_DATE_ALL


	final static String i_PUCH_ODR_START_DATE_ALL = null;

	// �� 89 �ϐ������l�F i_PUCH_ODR_DLV_DATE_ALL


	final static String i_PUCH_ODR_DLV_DATE_ALL = null;

	// �� 90 �ϐ������l�F i_VEND_CD


	final static String i_VEND_CD = null;

	// �� 91 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 92 �ϐ������l�F i_PUCH_ODR_CD


	final static String i_PUCH_ODR_CD = null;

	// �� 93 �ϐ������l�F i_STATUS1


	final static String i_STATUS1 = null;

	// �� 94 �ϐ������l�F i_STATUS2


	final static String i_STATUS2 = null;

	// �� 95 �ϐ������l�F i_STATUS3


	final static String i_STATUS3 = null;

	// �� 96 �ϐ������l�F i_STATUS4


	final static String i_STATUS4 = null;

	// �� 97 �ϐ������l�F i_STATUS5


	final static String i_STATUS5 = null;

	// �� 98 �ϐ������l�F i_STATUS6


	final static String i_STATUS6 = null;

	// �� 99 �ϐ������l�F i_STATUS7


	final static String i_STATUS7 = null;

	// �� 100 �ϐ������l�F i_STATUS8


	final static String i_STATUS8 = null;

	// �� 101 �ϐ������l�F i_WH_CD


	final static String i_WH_CD = null;

	// �� 102 �ϐ������l�F i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// �� 103 �ϐ������l�F i_PUCH_ODR_PERSON


	final static String i_PUCH_ODR_PERSON = null;

	// �� 104 �ϐ������l�F i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// �� 105 �ϐ������l�F i_OUT_PUCH_ODR_CD


	final static String i_OUT_PUCH_ODR_CD = null;

	// �� 106 �ϐ������l�F i_TIME_CTRL


	final static String i_TIME_CTRL = null;

	// �� 107 �ϐ������l�F i_WH_NAME


	final static String i_WH_NAME = null;

	// �� 108 �ϐ������l�F i_l_COUNT


	final static String i_l_COUNT = null;

	// �� 109 �ϐ������l�F i_ROW_COUNT


	final static String i_ROW_COUNT = null;

*/

	//{{user_implement_code
		// TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
		// �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
	// �� 1 �ϐ������l�F i_l_PUCH_ODR_CD
	final static String i_l_PUCH_ODR_CD = null;
	// �� 2 �ϐ������l�F i_l_PLANT_CD
	final static String i_l_PLANT_CD = null;
	// �� 3 �ϐ������l�F i_PLANT_NAME
	final static String i_PLANT_NAME = null;
	// �� 4 �ϐ������l�F i_l_WH_CD
	final static String i_l_WH_CD = null;
	// �� 5 �ϐ������l�F i_l_WH_NAME
	final static String i_l_WH_NAME = null;
	// �� 6 �ϐ������l�F i_l_ITEM_CD
	final static String i_l_ITEM_CD = null;
	// �� 7 �ϐ������l�F i_l_ITEM_NAME
	final static String i_l_ITEM_NAME = null;
	// �� 8 �ϐ������l�F i_l_COMPANY_CD
	final static String i_l_COMPANY_CD = null;
	// �� 9 �ϐ������l�F i_l_VEND_CD
	final static String i_l_VEND_CD = null;
	// �� 10 �ϐ������l�F i_l_VEND_ANAME
	final static String i_l_VEND_ANAME = null;
	// �� 11 �ϐ������l�F i_VEND_NAME
	final static String i_VEND_NAME = null;
	// �� 12 �ϐ������l�F i_l_PUCH_ODR_PERSON
	final static String i_l_PUCH_ODR_PERSON = null;
	// �� 13 �ϐ������l�F i_l_USER_NAME
	final static String i_l_USER_NAME = null;
	// �� 14 �ϐ������l�F i_l_PUCH_ODR_START_DATE
	final static String i_l_PUCH_ODR_START_DATE = null;
	// �� 15 �ϐ������l�F i_l_PUCH_ODR_DLV_DATE
	final static String i_l_PUCH_ODR_DLV_DATE = null;
	// �� 16 �ϐ������l�F i_l_PUCH_ODR_QTY
	final static String i_l_PUCH_ODR_QTY = null;
	// �� 17 �ϐ������l�F i_l_STOCK_UNIT
	final static String i_l_STOCK_UNIT = null;
	// �� 18 �ϐ������l�F i_l_UNIT_COST_TYP
	final static String i_l_UNIT_COST_TYP = null;
	// �� 19 �ϐ������l�F i_l_UNIT_COST_TYP_DN
	final static String i_l_UNIT_COST_TYP_DN = null;
	// �� 20 �ϐ������l�F i_l_UNIT_COST
	final static String i_l_UNIT_COST = null;
	// �� 21 �ϐ������l�F i_l_PUCH_ODR_AMOUNT
	final static String i_l_PUCH_ODR_AMOUNT = null;
	// �� 22 �ϐ������l�F i_l_VEND_CUR_UNIT
	final static String i_l_VEND_CUR_UNIT = null;
	// �� 23 �ϐ������l�F i_l_DISC_AMOUNT
	final static String i_l_DISC_AMOUNT = null;
	// �� 24 �ϐ������l�F i_l_NET_AMOUNT
	final static String i_l_NET_AMOUNT = null;
	// �� 25 �ϐ������l�F i_l_TAX_AMOUNT_1
	final static String i_l_TAX_AMOUNT_1 = null;
	// �� 26 �ϐ������l�F i_l_TAX_AMOUNT_2
	final static String i_l_TAX_AMOUNT_2 = null;
	// �� 27 �ϐ������l�F i_l_TAX_AMOUNT_3
	final static String i_l_TAX_AMOUNT_3 = null;
	// �� 28 �ϐ������l�F i_l_AMOUNT_INCLUDE_TAX
	final static String i_l_AMOUNT_INCLUDE_TAX = null;
	// �� 29 �ϐ������l�F i_l_RATE_JUDGE_DATE
	final static String i_l_RATE_JUDGE_DATE = null;
	// �� 30 �ϐ������l�F i_l_EXCH_RATE
	final static String i_l_EXCH_RATE = null;
	// �� 31 �ϐ������l�F i_l_HOME_CUR_AMOUNT
	final static String i_l_HOME_CUR_AMOUNT = null;
	// �� 32 �ϐ������l�F i_l_HOME_CUR_UNIT
	final static String i_l_HOME_CUR_UNIT = null;
	// �� 33 �ϐ������l�F i_l_PUCH_ODR_INST_DATE
	final static String i_l_PUCH_ODR_INST_DATE = null;
	// �� 34 �ϐ������l�F i_l_PUCH_ODR_INST_SLIP_ISS_FLG
	final static String i_l_PUCH_ODR_INST_SLIP_ISS_FLG = null;
	// �� 35 �ϐ������l�F i_l_PUCH_ODR_INST_SLIP_ISS_FLG_DN
	final static String i_l_PUCH_ODR_INST_SLIP_ISS_FLG_DN = null;
	// �� 36 �ϐ������l�F i_l_PUCH_ODR_SLIP_ISS_DATE
	final static String i_l_PUCH_ODR_SLIP_ISS_DATE = null;
	// �� 37 �ϐ������l�F i_l_PUCH_ODR_STS_TYP
	final static String i_l_PUCH_ODR_STS_TYP = null;
	// �� 38 �ϐ������l�F i_l_PUCH_ODR_STS_TYP_DN
	final static String i_l_PUCH_ODR_STS_TYP_DN = null;
	// �� 39 �ϐ������l�F i_l_INSPC_CMPLT_FLG
	final static String i_l_INSPC_CMPLT_FLG = null;
	// �� 40 �ϐ������l�F i_l_INSPC_CMPLT_FLG_DN
	final static String i_l_INSPC_CMPLT_FLG_DN = null;
	// �� 41 �ϐ������l�F i_l_INSPC_CMPLT_DATE
	final static String i_l_INSPC_CMPLT_DATE = null;
	// �� 42 �ϐ������l�F i_l_CONFIRM_DLV_DATE
	final static String i_l_CONFIRM_DLV_DATE = null;
	// �� 43 �ϐ������l�F i_l_SPL_ITEM_TYP
	final static String i_l_SPL_ITEM_TYP = null;
	// �� 44 �ϐ������l�F i_l_SPL_ITEM_TYP_DN
	final static String i_l_SPL_ITEM_TYP_DN = null;
	// �� 45 �ϐ������l�F i_l_ACPT_INSPC_TYP
	final static String i_l_ACPT_INSPC_TYP = null;
	// �� 46 �ϐ������l�F i_l_ACPT_INSPC_TYP_DN
	final static String i_l_ACPT_INSPC_TYP_DN = null;
	// �� 47 �ϐ������l�F i_l_INV_CTRL_FLG
	final static String i_l_INV_CTRL_FLG = null;
	// �� 48 �ϐ������l�F i_l_INV_CTRL_FLG_DN
	final static String i_l_INV_CTRL_FLG_DN = null;
	// �� 49 �ϐ������l�F i_l_WORK_ODR_CD
	final static String i_l_WORK_ODR_CD = null;
	// �� 50 �ϐ������l�F i_l_OD_NO
	final static String i_l_OD_NO = null;
	// �� 51 �ϐ������l�F i_l_JOB_ODR_CD
	final static String i_l_JOB_ODR_CD = null;
	// �� 52 �ϐ������l�F i_l_PUCH_ODR_COMMENT
	final static String i_l_PUCH_ODR_COMMENT = null;
	// �� 53 �ϐ������l�F i_l_ODR_CD
	final static String i_l_ODR_CD = null;
	// �� 54 �ϐ������l�F i_l_DETAIL_NO
	final static String i_l_DETAIL_NO = null;
	// �� 55 �ϐ������l�F i_l_NON_NO_ITEM_FLG
	final static String i_l_NON_NO_ITEM_FLG = null;
	// �� 56 �ϐ������l�F i_l_NON_NO_ITEM_FLG_DN
	final static String i_l_NON_NO_ITEM_FLG_DN = null;
	// �� 57 �ϐ������l�F i_l_DRAW_CD
	final static String i_l_DRAW_CD = null;
	// �� 58 �ϐ������l�F i_l_SPEC
	final static String i_l_SPEC = null;
	// �� 59 �ϐ������l�F i_l_MRP_ODR_TYP
	final static String i_l_MRP_ODR_TYP = null;
	// �� 60 �ϐ������l�F i_l_MRP_ODR_TYP_DN
	final static String i_l_MRP_ODR_TYP_DN = null;
	// �� 61 �ϐ������l�F i_l_ACPT_QTY
	final static String i_l_ACPT_QTY = null;
	// �� 62 �ϐ������l�F i_l_ACPT_CMPLT_DATE
	final static String i_l_ACPT_CMPLT_DATE = null;
	// �� 63 �ϐ������l�F i_l_INSPECTED_QTY
	final static String i_l_INSPECTED_QTY = null;
	// �� 64 �ϐ������l�F i_l_ACCEPTED_QTY
	final static String i_l_ACCEPTED_QTY = null;
	// �� 65 �ϐ������l�F i_l_PUCH_ODR_EDI_ISS_DATE
	final static String i_l_PUCH_ODR_EDI_ISS_DATE = null;
	// �� 66 �ϐ������l�F i_PLANT_CD
	final static String i_PLANT_CD = null;
	// �� 67 �ϐ������l�F i_PUCH_ODR_START_DATE
	final static String i_PUCH_ODR_START_DATE = null;
	// �� 68 �ϐ������l�F i_PUCH_ODR_DLV_DATE
	final static String i_PUCH_ODR_DLV_DATE = null;
	// �� 69 �ϐ������l�F i_VEND_CD
	final static String i_VEND_CD = null;
	// �� 70 �ϐ������l�F i_PUCH_ODR_STS_TYP
	final static String i_PUCH_ODR_STS_TYP = null;
	// �� 71 �ϐ������l�F i_r_PUCH_ODR_STS_TYP
	final static String i_r_PUCH_ODR_STS_TYP = null;
	// �� 72 �ϐ������l�F i_r2_PUCH_ODR_STS_TYP
	final static String i_r2_PUCH_ODR_STS_TYP = null;
	// �� 73 �ϐ������l�F i_DOWNLOAD_FILE
	final static String i_DOWNLOAD_FILE = null;

	/**
	 * ������
	 *
	 */
	public void initialize()
	{

		clear();

		m_l_PUCH_ODR_CD = i_l_PUCH_ODR_CD;
		m_l_PLANT_CD = i_l_PLANT_CD;
		m_PLANT_NAME = i_PLANT_NAME;
		m_l_WH_CD = i_l_WH_CD;
		m_l_WH_NAME = i_l_WH_NAME;
		m_l_ITEM_CD = i_l_ITEM_CD;
		m_l_ITEM_NAME = i_l_ITEM_NAME;
		m_l_COMPANY_CD = i_l_COMPANY_CD;
		m_l_VEND_CD = i_l_VEND_CD;
		m_l_VEND_ANAME = i_l_VEND_ANAME;
		m_VEND_NAME = i_VEND_NAME;
		m_l_PUCH_ODR_PERSON = i_l_PUCH_ODR_PERSON;
		m_l_USER_NAME = i_l_USER_NAME;
		m_l_PUCH_ODR_START_DATE = i_l_PUCH_ODR_START_DATE;
		m_l_PUCH_ODR_DLV_DATE = i_l_PUCH_ODR_DLV_DATE;
		m_l_PUCH_ODR_QTY = i_l_PUCH_ODR_QTY;
		m_l_STOCK_UNIT = i_l_STOCK_UNIT;
		m_l_UNIT_COST_TYP = i_l_UNIT_COST_TYP;
		m_l_UNIT_COST_TYP_DN = i_l_UNIT_COST_TYP_DN;
		m_l_UNIT_COST = i_l_UNIT_COST;
		m_l_PUCH_ODR_AMOUNT = i_l_PUCH_ODR_AMOUNT;
		m_l_VEND_CUR_UNIT = i_l_VEND_CUR_UNIT;
		m_l_DISC_AMOUNT = i_l_DISC_AMOUNT;
		m_l_NET_AMOUNT = i_l_NET_AMOUNT;
		m_l_TAX_AMOUNT_1 = i_l_TAX_AMOUNT_1;
		m_l_TAX_AMOUNT_2 = i_l_TAX_AMOUNT_2;
		m_l_TAX_AMOUNT_3 = i_l_TAX_AMOUNT_3;
		m_l_AMOUNT_INCLUDE_TAX = i_l_AMOUNT_INCLUDE_TAX;
		m_l_RATE_JUDGE_DATE = i_l_RATE_JUDGE_DATE;
		m_l_EXCH_RATE = i_l_EXCH_RATE;
		m_l_HOME_CUR_AMOUNT = i_l_HOME_CUR_AMOUNT;
		m_l_HOME_CUR_UNIT = i_l_HOME_CUR_UNIT;
		m_l_PUCH_ODR_INST_DATE = i_l_PUCH_ODR_INST_DATE;
		m_l_PUCH_ODR_INST_SLIP_ISS_FLG = i_l_PUCH_ODR_INST_SLIP_ISS_FLG;
		m_l_PUCH_ODR_INST_SLIP_ISS_FLG_DN = i_l_PUCH_ODR_INST_SLIP_ISS_FLG_DN;
		m_l_PUCH_ODR_SLIP_ISS_DATE = i_l_PUCH_ODR_SLIP_ISS_DATE;
		m_l_PUCH_ODR_STS_TYP = i_l_PUCH_ODR_STS_TYP;
		m_l_PUCH_ODR_STS_TYP_DN = i_l_PUCH_ODR_STS_TYP_DN;
		m_l_INSPC_CMPLT_FLG = i_l_INSPC_CMPLT_FLG;
		m_l_INSPC_CMPLT_FLG_DN = i_l_INSPC_CMPLT_FLG_DN;
		m_l_INSPC_CMPLT_DATE = i_l_INSPC_CMPLT_DATE;
		m_l_CONFIRM_DLV_DATE = i_l_CONFIRM_DLV_DATE;
		m_l_SPL_ITEM_TYP = i_l_SPL_ITEM_TYP;
		m_l_SPL_ITEM_TYP_DN = i_l_SPL_ITEM_TYP_DN;
		m_l_ACPT_INSPC_TYP = i_l_ACPT_INSPC_TYP;
		m_l_ACPT_INSPC_TYP_DN = i_l_ACPT_INSPC_TYP_DN;
		m_l_INV_CTRL_FLG = i_l_INV_CTRL_FLG;
		m_l_INV_CTRL_FLG_DN = i_l_INV_CTRL_FLG_DN;
		m_l_WORK_ODR_CD = i_l_WORK_ODR_CD;
		m_l_OD_NO = i_l_OD_NO;
		m_l_JOB_ODR_CD = i_l_JOB_ODR_CD;
		m_l_PUCH_ODR_COMMENT = i_l_PUCH_ODR_COMMENT;
		m_l_ODR_CD = i_l_ODR_CD;
//		m_l_DETAIL_NO = i_l_DETAIL_NO;
		m_l_NON_NO_ITEM_FLG = i_l_NON_NO_ITEM_FLG;
		m_l_NON_NO_ITEM_FLG_DN = i_l_NON_NO_ITEM_FLG_DN;
		m_l_DRAW_CD = i_l_DRAW_CD;
		m_l_SPEC = i_l_SPEC;
		m_l_MRP_ODR_TYP = i_l_MRP_ODR_TYP;
		m_l_MRP_ODR_TYP_DN = i_l_MRP_ODR_TYP_DN;
		m_l_ACPT_QTY = i_l_ACPT_QTY;
		m_l_ACPT_CMPLT_DATE = i_l_ACPT_CMPLT_DATE;
		m_l_INSPECTED_QTY = i_l_INSPECTED_QTY;
		m_l_ACCEPTED_QTY = i_l_ACCEPTED_QTY;
		m_l_PUCH_ODR_EDI_ISS_DATE = i_l_PUCH_ODR_EDI_ISS_DATE;
		m_PLANT_CD = i_PLANT_CD;
		m_PUCH_ODR_START_DATE = i_PUCH_ODR_START_DATE;
		m_PUCH_ODR_DLV_DATE = i_PUCH_ODR_DLV_DATE;
		m_VEND_CD = i_VEND_CD;
//		m_PUCH_ODR_STS_TYP = i_PUCH_ODR_STS_TYP;
//		m_r_PUCH_ODR_STS_TYP = i_r_PUCH_ODR_STS_TYP;
//		m_r2_PUCH_ODR_STS_TYP = i_r2_PUCH_ODR_STS_TYP;
		m_DOWNLOAD_FILE = i_DOWNLOAD_FILE;
	}

		// TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
