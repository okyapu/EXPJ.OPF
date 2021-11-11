/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0030/src/com/nec/jp/orteus/metamorBase/AE0030/AE0030020Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0030;

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
 * CLASS     : AE0030020Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: li-lu $
 * @version $Revision: 1.21 $ $Date: 2014/12/29 11:12:27 $
 *
 */
//}}user_implement_code_header

public class AE0030020Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_ReOutputFlag */
	public String m_ReOutputFlag = null;
	/** �� 2 �ϐ��F m_PUCH_ODR_START_DATE */
	public String m_PUCH_ODR_START_DATE = null;
	/** �� 3 �ϐ��F m_PUCH_ODR_DLV_DATE */
	public String m_PUCH_ODR_DLV_DATE = null;
	/** �� 4 �ϐ��F m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** �� 5 �ϐ��F m_r1_FILTER1 */
	public String m_r1_FILTER1 = null;
	/** �� 6 �ϐ��F m_r2_FILTER1 */
	public String m_r2_FILTER1 = null;
	/** �� 7 �ϐ��F m_r1_FILTER2 */
	public String m_r1_FILTER2 = null;
	/** �� 8 �ϐ��F m_r2_FILTER2 */
	public String m_r2_FILTER2 = null;
	/** �� 9 �ϐ��F m_PUCH_ODR_START_TIME */
	public String m_PUCH_ODR_START_TIME = null;
	/** �� 10 �ϐ��F m_PUCH_ODR_DLV_TIME */
	public String m_PUCH_ODR_DLV_TIME = null;
	/** �� 11 �ϐ��F m_r1_FILTER3 */
	public String m_r1_FILTER3 = null;
	/** �� 12 �ϐ��F m_r2_FILTER3 */
	public String m_r2_FILTER3 = null;
	/** �� 13 �ϐ��F m_l_PUCH_ODR_START_DATE */
	public String m_l_PUCH_ODR_START_DATE = null;
	/** �� 14 �ϐ��F m_l_PUCH_ODR_DLV_DATE */
	public String m_l_PUCH_ODR_DLV_DATE = null;
	/** �� 15 �ϐ��F m_l_VEND_CD */
	public String m_l_VEND_CD = null;
	/** �� 16 �ϐ��F m_l_VEND_ANAME */
	public String m_l_VEND_ANAME = null;
	/** �� 17 �ϐ��F m_l_ITEM_CD */
	public String m_l_ITEM_CD = null;
	/** �� 18 �ϐ��F m_l_ITEM_NAME */
	public String m_l_ITEM_NAME = null;
	/** �� 19 �ϐ��F m_l_PUCH_ODR_QTY */
	public String m_l_PUCH_ODR_QTY = null;
	/** �� 20 �ϐ��F m_l_STOCK_UNIT */
	public String m_l_STOCK_UNIT = null;
	/** �� 21 �ϐ��F m_l_PUCH_ODR_CD */
	public String m_l_PUCH_ODR_CD = null;
	/** �� 22 �ϐ��F m_l_JOB_ODR_CD */
	public String m_l_JOB_ODR_CD = null;
	/** �� 23 �ϐ��F m_l_PUCH_ODR_SLIP_ISS_DATE */
	public String m_l_PUCH_ODR_SLIP_ISS_DATE = null;
	/** �� 24 �ϐ��F m_l_MODIFY_COUNT */
	public String m_l_MODIFY_COUNT = null;
	/** �� 25 �ϐ��F m_l_PUCH_ODR_INST_SLIP_ISS_FLG */
	public String m_l_PUCH_ODR_INST_SLIP_ISS_FLG = null;
	/** �� 26 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 27 �ϐ��F m_PUCH_ODR_START_DATE_ALL */
	public String m_PUCH_ODR_START_DATE_ALL = null;
	/** �� 28 �ϐ��F m_PUCH_ODR_DLV_DATE_ALL */
	public String m_PUCH_ODR_DLV_DATE_ALL = null;
	/** �� 29 �ϐ��F m_PUCH_ODR_CD */
	public String m_PUCH_ODR_CD = null;
	/** �� 30 �ϐ��F m_VEND_CD */
	public String m_VEND_CD = null;
	/** �� 31 �ϐ��F m_PUCH_ODR_PERSON */
	public String m_PUCH_ODR_PERSON = null;
	/** �� 32 �ϐ��F m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** �� 33 �ϐ��F m_PUCH_ODR_INST_SLIP_ISS_FLG */
	public String m_PUCH_ODR_INST_SLIP_ISS_FLG = null;
	/** �� 34 �ϐ��F m_ODR_FORM_FLG */
	public String m_ODR_FORM_FLG = null;
	/** �� 35 �ϐ��F m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** �� 36 �ϐ��F m_VEND_NAME */
	public String m_VEND_NAME = null;
	/** �� 37 �ϐ��F m_USER_NAME */
	public String m_USER_NAME = null;
	/** �� 38 �ϐ��F m_T_RLSD_PUCH_ODR__PUCH_ODR_CD */
	public String m_T_RLSD_PUCH_ODR__PUCH_ODR_CD = null;
	/** �� 39 �ϐ��F m_SYS_DATE_CTRL__BUSINESS_OPR_DATE */
	public String m_SYS_DATE_CTRL__BUSINESS_OPR_DATE = null;
	/** �� 40 �ϐ��F m_M_VEND_CTRL__VEND_NAME */
	public String m_M_VEND_CTRL__VEND_NAME = null;
	/** �� 41 �ϐ��F m_M_VEND_CTRL__ZIP_CD */
	public String m_M_VEND_CTRL__ZIP_CD = null;
	/** �� 42 �ϐ��F m_M_VEND_CTRL__ADDRESS_1 */
	public String m_M_VEND_CTRL__ADDRESS_1 = null;
	/** �� 43 �ϐ��F m_M_VEND_CTRL__ADDRESS_2 */
	public String m_M_VEND_CTRL__ADDRESS_2 = null;
	/** �� 44 �ϐ��F m_M_VEND_CTRL__VEND_ORG */
	public String m_M_VEND_CTRL__VEND_ORG = null;
	/** �� 45 �ϐ��F m_M_VEND_CTRL__VEND_PERSON */
	public String m_M_VEND_CTRL__VEND_PERSON = null;
	/** �� 46 �ϐ��F m_M_VEND_CTRL__TEL */
	public String m_M_VEND_CTRL__TEL = null;
	/** �� 47 �ϐ��F m_M_VEND_CTRL__FAX */
	public String m_M_VEND_CTRL__FAX = null;
	/** �� 48 �ϐ��F m_T_RLSD_PUCH_ODR__ITEM_CD */
	public String m_T_RLSD_PUCH_ODR__ITEM_CD = null;
	/** �� 49 �ϐ��F m_M_ITEM__ITEM_NAME */
	public String m_M_ITEM__ITEM_NAME = null;
	/** �� 50 �ϐ��F m_T_OD__JOB_ODR_CD */
	public String m_T_OD__JOB_ODR_CD = null;
	/** �� 51 �ϐ��F m_T_RLSD_PUCH_ODR__PUCH_ODR_QTY */
	public String m_T_RLSD_PUCH_ODR__PUCH_ODR_QTY = null;
	/** �� 52 �ϐ��F m_M_ITEM__STOCK_UNIT */
	public String m_M_ITEM__STOCK_UNIT = null;
	/** �� 53 �ϐ��F m_PKG_QTY */
	public String m_PKG_QTY = null;
	/** �� 54 �ϐ��F m_PKG_ODD_QTY */
	public String m_PKG_ODD_QTY = null;
	/** �� 55 �ϐ��F m_M_ITEM__PKG_UNIT */
	public String m_M_ITEM__PKG_UNIT = null;
	/** �� 56 �ϐ��F m_M_ITEM__STOCK_UNIT2 */
	public String m_M_ITEM__STOCK_UNIT2 = null;
	/** �� 57 �ϐ��F m_T_RLSD_PUCH_ODR__PUCH_ODR_DLV_DA */
	public String m_T_RLSD_PUCH_ODR__PUCH_ODR_DLV_DA = null;
	/** �� 58 �ϐ��F m_T_RLSD_PUCH_ODR__UNIT_COST */
	public String m_T_RLSD_PUCH_ODR__UNIT_COST = null;
	/** �� 59 �ϐ��F m_M_CUR__VEND_CUR_UNIT */
	public String m_M_CUR__VEND_CUR_UNIT = null;
	/** �� 60 �ϐ��F m_T_RLSD_PUCH_ODR__PUCH_ODR_AMOUNT */
	public String m_T_RLSD_PUCH_ODR__PUCH_ODR_AMOUNT = null;
	/** �� 61 �ϐ��F m_T_RLSD_PUCH_ODR__DISC_AMOUNT */
	public String m_T_RLSD_PUCH_ODR__DISC_AMOUNT = null;
	/** �� 62 �ϐ��F m_T_RLSD_PUCH_ODR__NET_AMOUNT */
	public String m_T_RLSD_PUCH_ODR__NET_AMOUNT = null;
	/** �� 63 �ϐ��F m_TAX_AMOUNT */
	public String m_TAX_AMOUNT = null;
	/** �� 64 �ϐ��F m_T_RLSD_PUCH_ODR__AMOUNT_INCLUDE_ */
	public String m_T_RLSD_PUCH_ODR__AMOUNT_INCLUDE_ = null;
	/** �� 65 �ϐ��F m_T_RLSD_PUCH_ODR__HOME_CUR_AMOUNT */
	public String m_T_RLSD_PUCH_ODR__HOME_CUR_AMOUNT = null;
	/** �� 66 �ϐ��F m_M_CUR__HOME_CUR_UNIT */
	public String m_M_CUR__HOME_CUR_UNIT = null;
	/** �� 67 �ϐ��F m_M_CUR__CUR_NAME */
	public String m_M_CUR__CUR_NAME = null;
	/** �� 68 �ϐ��F m_SYS_TYPE_VALUE__DISPLAY_NAME */
	public String m_SYS_TYPE_VALUE__DISPLAY_NAME = null;
	/** �� 69 �ϐ��F m_T_RLSD_PUCH_ODR__RATE_JUDGE_DATE */
	public String m_T_RLSD_PUCH_ODR__RATE_JUDGE_DATE = null;
	/** �� 70 �ϐ��F m_T_RLSD_PUCH_ODR__EXCH_RATE */
	public String m_T_RLSD_PUCH_ODR__EXCH_RATE = null;
	/** �� 71 �ϐ��F m_T_RLSD_PUCH_ODR__PROCESSING_COST */
	public String m_T_RLSD_PUCH_ODR__PROCESSING_COST = null;
	/** �� 72 �ϐ��F m_T_RLSD_PUCH_ODR__MATERIAL_COST */
	public String m_T_RLSD_PUCH_ODR__MATERIAL_COST = null;
	/** �� 73 �ϐ��F m_T_RLSD_PUCH_ODR__OTHER_OVERHEADS */
	public String m_T_RLSD_PUCH_ODR__OTHER_OVERHEADS = null;
	/** �� 74 �ϐ��F m_T_RLSD_PUCH_ODR__PUCH_ODR_COMMEN */
	public String m_T_RLSD_PUCH_ODR__PUCH_ODR_COMMEN = null;
	/** �� 75 �ϐ��F m_M_PLANT__PLANT_NAME */
	public String m_M_PLANT__PLANT_NAME = null;
	/** �� 76 �ϐ��F m_M_WH__WH_NAME */
	public String m_M_WH__WH_NAME = null;
	/** �� 77 �ϐ��F m_M_PLANT__ZIP_CD */
	public String m_M_PLANT__ZIP_CD = null;
	/** �� 78 �ϐ��F m_M_PLANT__ADDRESS_1 */
	public String m_M_PLANT__ADDRESS_1 = null;
	/** �� 79 �ϐ��F m_M_PLANT__ADDRESS_2 */
	public String m_M_PLANT__ADDRESS_2 = null;
	/** �� 80 �ϐ��F m_M_PLANT__TEL */
	public String m_M_PLANT__TEL = null;
	/** �� 81 �ϐ��F m_USER_MST__USER_NAME */
	public String m_USER_MST__USER_NAME = null;
	/** �� 82 �ϐ��F m_PUCH_ODR_SLIP_ISS_DATE */
	public String m_PUCH_ODR_SLIP_ISS_DATE = null;
	/** �� 83 �ϐ��F m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** �� 84 �ϐ��F m_TIME_CTRL */
	public String m_TIME_CTRL = null;
	/** �� 85 �ϐ��F m_l_COUNT */
	public String m_l_COUNT = null;
	/** �� 86 �ϐ��F m_ROW_COUNT */
	public String m_ROW_COUNT = null;
	/** �� 87 �ϐ��F m_work_busDate */
	public String m_work_busDate = null;
	/** �� 88 �ϐ��F m_work_ISS_DATE */
	public String m_work_ISS_DATE = null;
	/** �� 89 �ϐ��F m_PARTIAL_DELIV_SLIP_ISS_FLG */
	public String m_PARTIAL_DELIV_SLIP_ISS_FLG = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_ReOutputFlag */
	public List l_ReOutputFlag = null;

	/** �� 2 List�ϐ��F l_PUCH_ODR_START_DATE */
	public List l_PUCH_ODR_START_DATE = null;

	/** �� 3 List�ϐ��F l_PUCH_ODR_DLV_DATE */
	public List l_PUCH_ODR_DLV_DATE = null;

	/** �� 4 List�ϐ��F l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** �� 5 List�ϐ��F l_r1_FILTER1 */
	public List l_r1_FILTER1 = null;

	/** �� 6 List�ϐ��F l_r2_FILTER1 */
	public List l_r2_FILTER1 = null;

	/** �� 7 List�ϐ��F l_r1_FILTER2 */
	public List l_r1_FILTER2 = null;

	/** �� 8 List�ϐ��F l_r2_FILTER2 */
	public List l_r2_FILTER2 = null;

	/** �� 9 List�ϐ��F l_PUCH_ODR_START_TIME */
	public List l_PUCH_ODR_START_TIME = null;

	/** �� 10 List�ϐ��F l_PUCH_ODR_DLV_TIME */
	public List l_PUCH_ODR_DLV_TIME = null;

	/** �� 11 List�ϐ��F l_r1_FILTER3 */
	public List l_r1_FILTER3 = null;

	/** �� 12 List�ϐ��F l_r2_FILTER3 */
	public List l_r2_FILTER3 = null;

	/** �� 13 List�ϐ��F l_l_PUCH_ODR_START_DATE */
	public List l_l_PUCH_ODR_START_DATE = null;

	/** �� 14 List�ϐ��F l_l_PUCH_ODR_DLV_DATE */
	public List l_l_PUCH_ODR_DLV_DATE = null;

	/** �� 15 List�ϐ��F l_l_VEND_CD */
	public List l_l_VEND_CD = null;

	/** �� 16 List�ϐ��F l_l_VEND_ANAME */
	public List l_l_VEND_ANAME = null;

	/** �� 17 List�ϐ��F l_l_ITEM_CD */
	public List l_l_ITEM_CD = null;

	/** �� 18 List�ϐ��F l_l_ITEM_NAME */
	public List l_l_ITEM_NAME = null;

	/** �� 19 List�ϐ��F l_l_PUCH_ODR_QTY */
	public List l_l_PUCH_ODR_QTY = null;

	/** �� 20 List�ϐ��F l_l_STOCK_UNIT */
	public List l_l_STOCK_UNIT = null;

	/** �� 21 List�ϐ��F l_l_PUCH_ODR_CD */
	public List l_l_PUCH_ODR_CD = null;

	/** �� 22 List�ϐ��F l_l_JOB_ODR_CD */
	public List l_l_JOB_ODR_CD = null;

	/** �� 23 List�ϐ��F l_l_PUCH_ODR_SLIP_ISS_DATE */
	public List l_l_PUCH_ODR_SLIP_ISS_DATE = null;

	/** �� 24 List�ϐ��F l_l_MODIFY_COUNT */
	public List l_l_MODIFY_COUNT = null;

	/** �� 25 List�ϐ��F l_l_PUCH_ODR_INST_SLIP_ISS_FLG */
	public List l_l_PUCH_ODR_INST_SLIP_ISS_FLG = null;

	/** �� 26 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 27 List�ϐ��F l_PUCH_ODR_START_DATE_ALL */
	public List l_PUCH_ODR_START_DATE_ALL = null;

	/** �� 28 List�ϐ��F l_PUCH_ODR_DLV_DATE_ALL */
	public List l_PUCH_ODR_DLV_DATE_ALL = null;

	/** �� 29 List�ϐ��F l_PUCH_ODR_CD */
	public List l_PUCH_ODR_CD = null;

	/** �� 30 List�ϐ��F l_VEND_CD */
	public List l_VEND_CD = null;

	/** �� 31 List�ϐ��F l_PUCH_ODR_PERSON */
	public List l_PUCH_ODR_PERSON = null;

	/** �� 32 List�ϐ��F l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** �� 33 List�ϐ��F l_PUCH_ODR_INST_SLIP_ISS_FLG */
	public List l_PUCH_ODR_INST_SLIP_ISS_FLG = null;

	/** �� 34 List�ϐ��F l_ODR_FORM_FLG */
	public List l_ODR_FORM_FLG = null;

	/** �� 35 List�ϐ��F l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** �� 36 List�ϐ��F l_VEND_NAME */
	public List l_VEND_NAME = null;

	/** �� 37 List�ϐ��F l_USER_NAME */
	public List l_USER_NAME = null;

	/** �� 38 List�ϐ��F l_T_RLSD_PUCH_ODR__PUCH_ODR_CD */
	public List l_T_RLSD_PUCH_ODR__PUCH_ODR_CD = null;

	/** �� 39 List�ϐ��F l_SYS_DATE_CTRL__BUSINESS_OPR_DATE */
	public List l_SYS_DATE_CTRL__BUSINESS_OPR_DATE = null;

	/** �� 40 List�ϐ��F l_M_VEND_CTRL__VEND_NAME */
	public List l_M_VEND_CTRL__VEND_NAME = null;

	/** �� 41 List�ϐ��F l_M_VEND_CTRL__ZIP_CD */
	public List l_M_VEND_CTRL__ZIP_CD = null;

	/** �� 42 List�ϐ��F l_M_VEND_CTRL__ADDRESS_1 */
	public List l_M_VEND_CTRL__ADDRESS_1 = null;

	/** �� 43 List�ϐ��F l_M_VEND_CTRL__ADDRESS_2 */
	public List l_M_VEND_CTRL__ADDRESS_2 = null;

	/** �� 44 List�ϐ��F l_M_VEND_CTRL__VEND_ORG */
	public List l_M_VEND_CTRL__VEND_ORG = null;

	/** �� 45 List�ϐ��F l_M_VEND_CTRL__VEND_PERSON */
	public List l_M_VEND_CTRL__VEND_PERSON = null;

	/** �� 46 List�ϐ��F l_M_VEND_CTRL__TEL */
	public List l_M_VEND_CTRL__TEL = null;

	/** �� 47 List�ϐ��F l_M_VEND_CTRL__FAX */
	public List l_M_VEND_CTRL__FAX = null;

	/** �� 48 List�ϐ��F l_T_RLSD_PUCH_ODR__ITEM_CD */
	public List l_T_RLSD_PUCH_ODR__ITEM_CD = null;

	/** �� 49 List�ϐ��F l_M_ITEM__ITEM_NAME */
	public List l_M_ITEM__ITEM_NAME = null;

	/** �� 50 List�ϐ��F l_T_OD__JOB_ODR_CD */
	public List l_T_OD__JOB_ODR_CD = null;

	/** �� 51 List�ϐ��F l_T_RLSD_PUCH_ODR__PUCH_ODR_QTY */
	public List l_T_RLSD_PUCH_ODR__PUCH_ODR_QTY = null;

	/** �� 52 List�ϐ��F l_M_ITEM__STOCK_UNIT */
	public List l_M_ITEM__STOCK_UNIT = null;

	/** �� 53 List�ϐ��F l_PKG_QTY */
	public List l_PKG_QTY = null;

	/** �� 54 List�ϐ��F l_PKG_ODD_QTY */
	public List l_PKG_ODD_QTY = null;

	/** �� 55 List�ϐ��F l_M_ITEM__PKG_UNIT */
	public List l_M_ITEM__PKG_UNIT = null;

	/** �� 56 List�ϐ��F l_M_ITEM__STOCK_UNIT2 */
	public List l_M_ITEM__STOCK_UNIT2 = null;

	/** �� 57 List�ϐ��F l_T_RLSD_PUCH_ODR__PUCH_ODR_DLV_DA */
	public List l_T_RLSD_PUCH_ODR__PUCH_ODR_DLV_DA = null;

	/** �� 58 List�ϐ��F l_T_RLSD_PUCH_ODR__UNIT_COST */
	public List l_T_RLSD_PUCH_ODR__UNIT_COST = null;

	/** �� 59 List�ϐ��F l_M_CUR__VEND_CUR_UNIT */
	public List l_M_CUR__VEND_CUR_UNIT = null;

	/** �� 60 List�ϐ��F l_T_RLSD_PUCH_ODR__PUCH_ODR_AMOUNT */
	public List l_T_RLSD_PUCH_ODR__PUCH_ODR_AMOUNT = null;

	/** �� 61 List�ϐ��F l_T_RLSD_PUCH_ODR__DISC_AMOUNT */
	public List l_T_RLSD_PUCH_ODR__DISC_AMOUNT = null;

	/** �� 62 List�ϐ��F l_T_RLSD_PUCH_ODR__NET_AMOUNT */
	public List l_T_RLSD_PUCH_ODR__NET_AMOUNT = null;

	/** �� 63 List�ϐ��F l_TAX_AMOUNT */
	public List l_TAX_AMOUNT = null;

	/** �� 64 List�ϐ��F l_T_RLSD_PUCH_ODR__AMOUNT_INCLUDE_ */
	public List l_T_RLSD_PUCH_ODR__AMOUNT_INCLUDE_ = null;

	/** �� 65 List�ϐ��F l_T_RLSD_PUCH_ODR__HOME_CUR_AMOUNT */
	public List l_T_RLSD_PUCH_ODR__HOME_CUR_AMOUNT = null;

	/** �� 66 List�ϐ��F l_M_CUR__HOME_CUR_UNIT */
	public List l_M_CUR__HOME_CUR_UNIT = null;

	/** �� 67 List�ϐ��F l_M_CUR__CUR_NAME */
	public List l_M_CUR__CUR_NAME = null;

	/** �� 68 List�ϐ��F l_SYS_TYPE_VALUE__DISPLAY_NAME */
	public List l_SYS_TYPE_VALUE__DISPLAY_NAME = null;

	/** �� 69 List�ϐ��F l_T_RLSD_PUCH_ODR__RATE_JUDGE_DATE */
	public List l_T_RLSD_PUCH_ODR__RATE_JUDGE_DATE = null;

	/** �� 70 List�ϐ��F l_T_RLSD_PUCH_ODR__EXCH_RATE */
	public List l_T_RLSD_PUCH_ODR__EXCH_RATE = null;

	/** �� 71 List�ϐ��F l_T_RLSD_PUCH_ODR__PROCESSING_COST */
	public List l_T_RLSD_PUCH_ODR__PROCESSING_COST = null;

	/** �� 72 List�ϐ��F l_T_RLSD_PUCH_ODR__MATERIAL_COST */
	public List l_T_RLSD_PUCH_ODR__MATERIAL_COST = null;

	/** �� 73 List�ϐ��F l_T_RLSD_PUCH_ODR__OTHER_OVERHEADS */
	public List l_T_RLSD_PUCH_ODR__OTHER_OVERHEADS = null;

	/** �� 74 List�ϐ��F l_T_RLSD_PUCH_ODR__PUCH_ODR_COMMEN */
	public List l_T_RLSD_PUCH_ODR__PUCH_ODR_COMMEN = null;

	/** �� 75 List�ϐ��F l_M_PLANT__PLANT_NAME */
	public List l_M_PLANT__PLANT_NAME = null;

	/** �� 76 List�ϐ��F l_M_WH__WH_NAME */
	public List l_M_WH__WH_NAME = null;

	/** �� 77 List�ϐ��F l_M_PLANT__ZIP_CD */
	public List l_M_PLANT__ZIP_CD = null;

	/** �� 78 List�ϐ��F l_M_PLANT__ADDRESS_1 */
	public List l_M_PLANT__ADDRESS_1 = null;

	/** �� 79 List�ϐ��F l_M_PLANT__ADDRESS_2 */
	public List l_M_PLANT__ADDRESS_2 = null;

	/** �� 80 List�ϐ��F l_M_PLANT__TEL */
	public List l_M_PLANT__TEL = null;

	/** �� 81 List�ϐ��F l_USER_MST__USER_NAME */
	public List l_USER_MST__USER_NAME = null;

	/** �� 82 List�ϐ��F l_PUCH_ODR_SLIP_ISS_DATE */
	public List l_PUCH_ODR_SLIP_ISS_DATE = null;

	/** �� 83 List�ϐ��F l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** �� 84 List�ϐ��F l_TIME_CTRL */
	public List l_TIME_CTRL = null;

	/** �� 85 List�ϐ��F l_l_COUNT */
	public List l_l_COUNT = null;

	/** �� 86 List�ϐ��F l_ROW_COUNT */
	public List l_ROW_COUNT = null;

	/** �� 87 List�ϐ��F l_work_busDate */
	public List l_work_busDate = null;

	/** �� 88 List�ϐ��F l_work_ISS_DATE */
	public List l_work_ISS_DATE = null;

	/** �� 89 List�ϐ��F l_PARTIAL_DELIV_SLIP_ISS_FLG */
	public List l_PARTIAL_DELIV_SLIP_ISS_FLG = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getReOutputFlag() { return m_ReOutputFlag; }
	public String getPUCH_ODR_START_DATE() { return m_PUCH_ODR_START_DATE; }
	public String getPUCH_ODR_DLV_DATE() { return m_PUCH_ODR_DLV_DATE; }
	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getr1_FILTER1() { return m_r1_FILTER1; }
	public String getr2_FILTER1() { return m_r2_FILTER1; }
	public String getr1_FILTER2() { return m_r1_FILTER2; }
	public String getr2_FILTER2() { return m_r2_FILTER2; }
	public String getPUCH_ODR_START_TIME() { return m_PUCH_ODR_START_TIME; }
	public String getPUCH_ODR_DLV_TIME() { return m_PUCH_ODR_DLV_TIME; }
	public String getr1_FILTER3() { return m_r1_FILTER3; }
	public String getr2_FILTER3() { return m_r2_FILTER3; }
	public String getl_PUCH_ODR_START_DATE() { return m_l_PUCH_ODR_START_DATE; }
	public String getl_PUCH_ODR_DLV_DATE() { return m_l_PUCH_ODR_DLV_DATE; }
	public String getl_VEND_CD() { return m_l_VEND_CD; }
	public String getl_VEND_ANAME() { return m_l_VEND_ANAME; }
	public String getl_ITEM_CD() { return m_l_ITEM_CD; }
	public String getl_ITEM_NAME() { return m_l_ITEM_NAME; }
	public String getl_PUCH_ODR_QTY() { return m_l_PUCH_ODR_QTY; }
	public String getl_STOCK_UNIT() { return m_l_STOCK_UNIT; }
	public String getl_PUCH_ODR_CD() { return m_l_PUCH_ODR_CD; }
	public String getl_JOB_ODR_CD() { return m_l_JOB_ODR_CD; }
	public String getl_PUCH_ODR_SLIP_ISS_DATE() { return m_l_PUCH_ODR_SLIP_ISS_DATE; }
	public String getl_MODIFY_COUNT() { return m_l_MODIFY_COUNT; }
	public String getl_PUCH_ODR_INST_SLIP_ISS_FLG() { return m_l_PUCH_ODR_INST_SLIP_ISS_FLG; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getPUCH_ODR_START_DATE_ALL() { return m_PUCH_ODR_START_DATE_ALL; }
	public String getPUCH_ODR_DLV_DATE_ALL() { return m_PUCH_ODR_DLV_DATE_ALL; }
	public String getPUCH_ODR_CD() { return m_PUCH_ODR_CD; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getPUCH_ODR_PERSON() { return m_PUCH_ODR_PERSON; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getPUCH_ODR_INST_SLIP_ISS_FLG() { return m_PUCH_ODR_INST_SLIP_ISS_FLG; }
	public String getODR_FORM_FLG() { return m_ODR_FORM_FLG; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getVEND_NAME() { return m_VEND_NAME; }
	public String getUSER_NAME() { return m_USER_NAME; }
	public String getT_RLSD_PUCH_ODR__PUCH_ODR_CD() { return m_T_RLSD_PUCH_ODR__PUCH_ODR_CD; }
	public String getSYS_DATE_CTRL__BUSINESS_OPR_DATE() { return m_SYS_DATE_CTRL__BUSINESS_OPR_DATE; }
	public String getM_VEND_CTRL__VEND_NAME() { return m_M_VEND_CTRL__VEND_NAME; }
	public String getM_VEND_CTRL__ZIP_CD() { return m_M_VEND_CTRL__ZIP_CD; }
	public String getM_VEND_CTRL__ADDRESS_1() { return m_M_VEND_CTRL__ADDRESS_1; }
	public String getM_VEND_CTRL__ADDRESS_2() { return m_M_VEND_CTRL__ADDRESS_2; }
	public String getM_VEND_CTRL__VEND_ORG() { return m_M_VEND_CTRL__VEND_ORG; }
	public String getM_VEND_CTRL__VEND_PERSON() { return m_M_VEND_CTRL__VEND_PERSON; }
	public String getM_VEND_CTRL__TEL() { return m_M_VEND_CTRL__TEL; }
	public String getM_VEND_CTRL__FAX() { return m_M_VEND_CTRL__FAX; }
	public String getT_RLSD_PUCH_ODR__ITEM_CD() { return m_T_RLSD_PUCH_ODR__ITEM_CD; }
	public String getM_ITEM__ITEM_NAME() { return m_M_ITEM__ITEM_NAME; }
	public String getT_OD__JOB_ODR_CD() { return m_T_OD__JOB_ODR_CD; }
	public String getT_RLSD_PUCH_ODR__PUCH_ODR_QTY() { return m_T_RLSD_PUCH_ODR__PUCH_ODR_QTY; }
	public String getM_ITEM__STOCK_UNIT() { return m_M_ITEM__STOCK_UNIT; }
	public String getPKG_QTY() { return m_PKG_QTY; }
	public String getPKG_ODD_QTY() { return m_PKG_ODD_QTY; }
	public String getM_ITEM__PKG_UNIT() { return m_M_ITEM__PKG_UNIT; }
	public String getM_ITEM__STOCK_UNIT2() { return m_M_ITEM__STOCK_UNIT2; }
	public String getT_RLSD_PUCH_ODR__PUCH_ODR_DLV_DA() { return m_T_RLSD_PUCH_ODR__PUCH_ODR_DLV_DA; }
	public String getT_RLSD_PUCH_ODR__UNIT_COST() { return m_T_RLSD_PUCH_ODR__UNIT_COST; }
	public String getM_CUR__VEND_CUR_UNIT() { return m_M_CUR__VEND_CUR_UNIT; }
	public String getT_RLSD_PUCH_ODR__PUCH_ODR_AMOUNT() { return m_T_RLSD_PUCH_ODR__PUCH_ODR_AMOUNT; }
	public String getT_RLSD_PUCH_ODR__DISC_AMOUNT() { return m_T_RLSD_PUCH_ODR__DISC_AMOUNT; }
	public String getT_RLSD_PUCH_ODR__NET_AMOUNT() { return m_T_RLSD_PUCH_ODR__NET_AMOUNT; }
	public String getTAX_AMOUNT() { return m_TAX_AMOUNT; }
	public String getT_RLSD_PUCH_ODR__AMOUNT_INCLUDE_() { return m_T_RLSD_PUCH_ODR__AMOUNT_INCLUDE_; }
	public String getT_RLSD_PUCH_ODR__HOME_CUR_AMOUNT() { return m_T_RLSD_PUCH_ODR__HOME_CUR_AMOUNT; }
	public String getM_CUR__HOME_CUR_UNIT() { return m_M_CUR__HOME_CUR_UNIT; }
	public String getM_CUR__CUR_NAME() { return m_M_CUR__CUR_NAME; }
	public String getSYS_TYPE_VALUE__DISPLAY_NAME() { return m_SYS_TYPE_VALUE__DISPLAY_NAME; }
	public String getT_RLSD_PUCH_ODR__RATE_JUDGE_DATE() { return m_T_RLSD_PUCH_ODR__RATE_JUDGE_DATE; }
	public String getT_RLSD_PUCH_ODR__EXCH_RATE() { return m_T_RLSD_PUCH_ODR__EXCH_RATE; }
	public String getT_RLSD_PUCH_ODR__PROCESSING_COST() { return m_T_RLSD_PUCH_ODR__PROCESSING_COST; }
	public String getT_RLSD_PUCH_ODR__MATERIAL_COST() { return m_T_RLSD_PUCH_ODR__MATERIAL_COST; }
	public String getT_RLSD_PUCH_ODR__OTHER_OVERHEADS() { return m_T_RLSD_PUCH_ODR__OTHER_OVERHEADS; }
	public String getT_RLSD_PUCH_ODR__PUCH_ODR_COMMEN() { return m_T_RLSD_PUCH_ODR__PUCH_ODR_COMMEN; }
	public String getM_PLANT__PLANT_NAME() { return m_M_PLANT__PLANT_NAME; }
	public String getM_WH__WH_NAME() { return m_M_WH__WH_NAME; }
	public String getM_PLANT__ZIP_CD() { return m_M_PLANT__ZIP_CD; }
	public String getM_PLANT__ADDRESS_1() { return m_M_PLANT__ADDRESS_1; }
	public String getM_PLANT__ADDRESS_2() { return m_M_PLANT__ADDRESS_2; }
	public String getM_PLANT__TEL() { return m_M_PLANT__TEL; }
	public String getUSER_MST__USER_NAME() { return m_USER_MST__USER_NAME; }
	public String getPUCH_ODR_SLIP_ISS_DATE() { return m_PUCH_ODR_SLIP_ISS_DATE; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getTIME_CTRL() { return m_TIME_CTRL; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }
	public String getwork_busDate() { return m_work_busDate; }
	public String getwork_ISS_DATE() { return m_work_ISS_DATE; }
	public String getPARTIAL_DELIV_SLIP_ISS_FLG() { return m_PARTIAL_DELIV_SLIP_ISS_FLG; }

	public List getList_ReOutputFlag() { return l_ReOutputFlag; }
	public List getList_PUCH_ODR_START_DATE() { return l_PUCH_ODR_START_DATE; }
	public List getList_PUCH_ODR_DLV_DATE() { return l_PUCH_ODR_DLV_DATE; }
	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_r1_FILTER1() { return l_r1_FILTER1; }
	public List getList_r2_FILTER1() { return l_r2_FILTER1; }
	public List getList_r1_FILTER2() { return l_r1_FILTER2; }
	public List getList_r2_FILTER2() { return l_r2_FILTER2; }
	public List getList_PUCH_ODR_START_TIME() { return l_PUCH_ODR_START_TIME; }
	public List getList_PUCH_ODR_DLV_TIME() { return l_PUCH_ODR_DLV_TIME; }
	public List getList_r1_FILTER3() { return l_r1_FILTER3; }
	public List getList_r2_FILTER3() { return l_r2_FILTER3; }
	public List getList_l_PUCH_ODR_START_DATE() { return l_l_PUCH_ODR_START_DATE; }
	public List getList_l_PUCH_ODR_DLV_DATE() { return l_l_PUCH_ODR_DLV_DATE; }
	public List getList_l_VEND_CD() { return l_l_VEND_CD; }
	public List getList_l_VEND_ANAME() { return l_l_VEND_ANAME; }
	public List getList_l_ITEM_CD() { return l_l_ITEM_CD; }
	public List getList_l_ITEM_NAME() { return l_l_ITEM_NAME; }
	public List getList_l_PUCH_ODR_QTY() { return l_l_PUCH_ODR_QTY; }
	public List getList_l_STOCK_UNIT() { return l_l_STOCK_UNIT; }
	public List getList_l_PUCH_ODR_CD() { return l_l_PUCH_ODR_CD; }
	public List getList_l_JOB_ODR_CD() { return l_l_JOB_ODR_CD; }
	public List getList_l_PUCH_ODR_SLIP_ISS_DATE() { return l_l_PUCH_ODR_SLIP_ISS_DATE; }
	public List getList_l_MODIFY_COUNT() { return l_l_MODIFY_COUNT; }
	public List getList_l_PUCH_ODR_INST_SLIP_ISS_FLG() { return l_l_PUCH_ODR_INST_SLIP_ISS_FLG; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_PUCH_ODR_START_DATE_ALL() { return l_PUCH_ODR_START_DATE_ALL; }
	public List getList_PUCH_ODR_DLV_DATE_ALL() { return l_PUCH_ODR_DLV_DATE_ALL; }
	public List getList_PUCH_ODR_CD() { return l_PUCH_ODR_CD; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_PUCH_ODR_PERSON() { return l_PUCH_ODR_PERSON; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_PUCH_ODR_INST_SLIP_ISS_FLG() { return l_PUCH_ODR_INST_SLIP_ISS_FLG; }
	public List getList_ODR_FORM_FLG() { return l_ODR_FORM_FLG; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_VEND_NAME() { return l_VEND_NAME; }
	public List getList_USER_NAME() { return l_USER_NAME; }
	public List getList_T_RLSD_PUCH_ODR__PUCH_ODR_CD() { return l_T_RLSD_PUCH_ODR__PUCH_ODR_CD; }
	public List getList_SYS_DATE_CTRL__BUSINESS_OPR_DATE() { return l_SYS_DATE_CTRL__BUSINESS_OPR_DATE; }
	public List getList_M_VEND_CTRL__VEND_NAME() { return l_M_VEND_CTRL__VEND_NAME; }
	public List getList_M_VEND_CTRL__ZIP_CD() { return l_M_VEND_CTRL__ZIP_CD; }
	public List getList_M_VEND_CTRL__ADDRESS_1() { return l_M_VEND_CTRL__ADDRESS_1; }
	public List getList_M_VEND_CTRL__ADDRESS_2() { return l_M_VEND_CTRL__ADDRESS_2; }
	public List getList_M_VEND_CTRL__VEND_ORG() { return l_M_VEND_CTRL__VEND_ORG; }
	public List getList_M_VEND_CTRL__VEND_PERSON() { return l_M_VEND_CTRL__VEND_PERSON; }
	public List getList_M_VEND_CTRL__TEL() { return l_M_VEND_CTRL__TEL; }
	public List getList_M_VEND_CTRL__FAX() { return l_M_VEND_CTRL__FAX; }
	public List getList_T_RLSD_PUCH_ODR__ITEM_CD() { return l_T_RLSD_PUCH_ODR__ITEM_CD; }
	public List getList_M_ITEM__ITEM_NAME() { return l_M_ITEM__ITEM_NAME; }
	public List getList_T_OD__JOB_ODR_CD() { return l_T_OD__JOB_ODR_CD; }
	public List getList_T_RLSD_PUCH_ODR__PUCH_ODR_QTY() { return l_T_RLSD_PUCH_ODR__PUCH_ODR_QTY; }
	public List getList_M_ITEM__STOCK_UNIT() { return l_M_ITEM__STOCK_UNIT; }
	public List getList_PKG_QTY() { return l_PKG_QTY; }
	public List getList_PKG_ODD_QTY() { return l_PKG_ODD_QTY; }
	public List getList_M_ITEM__PKG_UNIT() { return l_M_ITEM__PKG_UNIT; }
	public List getList_M_ITEM__STOCK_UNIT2() { return l_M_ITEM__STOCK_UNIT2; }
	public List getList_T_RLSD_PUCH_ODR__PUCH_ODR_DLV_DA() { return l_T_RLSD_PUCH_ODR__PUCH_ODR_DLV_DA; }
	public List getList_T_RLSD_PUCH_ODR__UNIT_COST() { return l_T_RLSD_PUCH_ODR__UNIT_COST; }
	public List getList_M_CUR__VEND_CUR_UNIT() { return l_M_CUR__VEND_CUR_UNIT; }
	public List getList_T_RLSD_PUCH_ODR__PUCH_ODR_AMOUNT() { return l_T_RLSD_PUCH_ODR__PUCH_ODR_AMOUNT; }
	public List getList_T_RLSD_PUCH_ODR__DISC_AMOUNT() { return l_T_RLSD_PUCH_ODR__DISC_AMOUNT; }
	public List getList_T_RLSD_PUCH_ODR__NET_AMOUNT() { return l_T_RLSD_PUCH_ODR__NET_AMOUNT; }
	public List getList_TAX_AMOUNT() { return l_TAX_AMOUNT; }
	public List getList_T_RLSD_PUCH_ODR__AMOUNT_INCLUDE_() { return l_T_RLSD_PUCH_ODR__AMOUNT_INCLUDE_; }
	public List getList_T_RLSD_PUCH_ODR__HOME_CUR_AMOUNT() { return l_T_RLSD_PUCH_ODR__HOME_CUR_AMOUNT; }
	public List getList_M_CUR__HOME_CUR_UNIT() { return l_M_CUR__HOME_CUR_UNIT; }
	public List getList_M_CUR__CUR_NAME() { return l_M_CUR__CUR_NAME; }
	public List getList_SYS_TYPE_VALUE__DISPLAY_NAME() { return l_SYS_TYPE_VALUE__DISPLAY_NAME; }
	public List getList_T_RLSD_PUCH_ODR__RATE_JUDGE_DATE() { return l_T_RLSD_PUCH_ODR__RATE_JUDGE_DATE; }
	public List getList_T_RLSD_PUCH_ODR__EXCH_RATE() { return l_T_RLSD_PUCH_ODR__EXCH_RATE; }
	public List getList_T_RLSD_PUCH_ODR__PROCESSING_COST() { return l_T_RLSD_PUCH_ODR__PROCESSING_COST; }
	public List getList_T_RLSD_PUCH_ODR__MATERIAL_COST() { return l_T_RLSD_PUCH_ODR__MATERIAL_COST; }
	public List getList_T_RLSD_PUCH_ODR__OTHER_OVERHEADS() { return l_T_RLSD_PUCH_ODR__OTHER_OVERHEADS; }
	public List getList_T_RLSD_PUCH_ODR__PUCH_ODR_COMMEN() { return l_T_RLSD_PUCH_ODR__PUCH_ODR_COMMEN; }
	public List getList_M_PLANT__PLANT_NAME() { return l_M_PLANT__PLANT_NAME; }
	public List getList_M_WH__WH_NAME() { return l_M_WH__WH_NAME; }
	public List getList_M_PLANT__ZIP_CD() { return l_M_PLANT__ZIP_CD; }
	public List getList_M_PLANT__ADDRESS_1() { return l_M_PLANT__ADDRESS_1; }
	public List getList_M_PLANT__ADDRESS_2() { return l_M_PLANT__ADDRESS_2; }
	public List getList_M_PLANT__TEL() { return l_M_PLANT__TEL; }
	public List getList_USER_MST__USER_NAME() { return l_USER_MST__USER_NAME; }
	public List getList_PUCH_ODR_SLIP_ISS_DATE() { return l_PUCH_ODR_SLIP_ISS_DATE; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_TIME_CTRL() { return l_TIME_CTRL; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }
	public List getList_work_busDate() { return l_work_busDate; }
	public List getList_work_ISS_DATE() { return l_work_ISS_DATE; }
	public List getList_PARTIAL_DELIV_SLIP_ISS_FLG() { return l_PARTIAL_DELIV_SLIP_ISS_FLG; }

	public void setReOutputFlag(String val) { m_ReOutputFlag = val; }
	public void setPUCH_ODR_START_DATE(String val) { m_PUCH_ODR_START_DATE = val; }
	public void setPUCH_ODR_DLV_DATE(String val) { m_PUCH_ODR_DLV_DATE = val; }
	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setr1_FILTER1(String val) { m_r1_FILTER1 = val; }
	public void setr2_FILTER1(String val) { m_r2_FILTER1 = val; }
	public void setr1_FILTER2(String val) { m_r1_FILTER2 = val; }
	public void setr2_FILTER2(String val) { m_r2_FILTER2 = val; }
	public void setPUCH_ODR_START_TIME(String val) { m_PUCH_ODR_START_TIME = val; }
	public void setPUCH_ODR_DLV_TIME(String val) { m_PUCH_ODR_DLV_TIME = val; }
	public void setr1_FILTER3(String val) { m_r1_FILTER3 = val; }
	public void setr2_FILTER3(String val) { m_r2_FILTER3 = val; }
	public void setl_PUCH_ODR_START_DATE(String val) { m_l_PUCH_ODR_START_DATE = val; }
	public void setl_PUCH_ODR_DLV_DATE(String val) { m_l_PUCH_ODR_DLV_DATE = val; }
	public void setl_VEND_CD(String val) { m_l_VEND_CD = val; }
	public void setl_VEND_ANAME(String val) { m_l_VEND_ANAME = val; }
	public void setl_ITEM_CD(String val) { m_l_ITEM_CD = val; }
	public void setl_ITEM_NAME(String val) { m_l_ITEM_NAME = val; }
	public void setl_PUCH_ODR_QTY(String val) { m_l_PUCH_ODR_QTY = val; }
	public void setl_STOCK_UNIT(String val) { m_l_STOCK_UNIT = val; }
	public void setl_PUCH_ODR_CD(String val) { m_l_PUCH_ODR_CD = val; }
	public void setl_JOB_ODR_CD(String val) { m_l_JOB_ODR_CD = val; }
	public void setl_PUCH_ODR_SLIP_ISS_DATE(String val) { m_l_PUCH_ODR_SLIP_ISS_DATE = val; }
	public void setl_MODIFY_COUNT(String val) { m_l_MODIFY_COUNT = val; }
	public void setl_PUCH_ODR_INST_SLIP_ISS_FLG(String val) { m_l_PUCH_ODR_INST_SLIP_ISS_FLG = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setPUCH_ODR_START_DATE_ALL(String val) { m_PUCH_ODR_START_DATE_ALL = val; }
	public void setPUCH_ODR_DLV_DATE_ALL(String val) { m_PUCH_ODR_DLV_DATE_ALL = val; }
	public void setPUCH_ODR_CD(String val) { m_PUCH_ODR_CD = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void setPUCH_ODR_PERSON(String val) { m_PUCH_ODR_PERSON = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setPUCH_ODR_INST_SLIP_ISS_FLG(String val) { m_PUCH_ODR_INST_SLIP_ISS_FLG = val; }
	public void setODR_FORM_FLG(String val) { m_ODR_FORM_FLG = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setVEND_NAME(String val) { m_VEND_NAME = val; }
	public void setUSER_NAME(String val) { m_USER_NAME = val; }
	public void setT_RLSD_PUCH_ODR__PUCH_ODR_CD(String val) { m_T_RLSD_PUCH_ODR__PUCH_ODR_CD = val; }
	public void setSYS_DATE_CTRL__BUSINESS_OPR_DATE(String val) { m_SYS_DATE_CTRL__BUSINESS_OPR_DATE = val; }
	public void setM_VEND_CTRL__VEND_NAME(String val) { m_M_VEND_CTRL__VEND_NAME = val; }
	public void setM_VEND_CTRL__ZIP_CD(String val) { m_M_VEND_CTRL__ZIP_CD = val; }
	public void setM_VEND_CTRL__ADDRESS_1(String val) { m_M_VEND_CTRL__ADDRESS_1 = val; }
	public void setM_VEND_CTRL__ADDRESS_2(String val) { m_M_VEND_CTRL__ADDRESS_2 = val; }
	public void setM_VEND_CTRL__VEND_ORG(String val) { m_M_VEND_CTRL__VEND_ORG = val; }
	public void setM_VEND_CTRL__VEND_PERSON(String val) { m_M_VEND_CTRL__VEND_PERSON = val; }
	public void setM_VEND_CTRL__TEL(String val) { m_M_VEND_CTRL__TEL = val; }
	public void setM_VEND_CTRL__FAX(String val) { m_M_VEND_CTRL__FAX = val; }
	public void setT_RLSD_PUCH_ODR__ITEM_CD(String val) { m_T_RLSD_PUCH_ODR__ITEM_CD = val; }
	public void setM_ITEM__ITEM_NAME(String val) { m_M_ITEM__ITEM_NAME = val; }
	public void setT_OD__JOB_ODR_CD(String val) { m_T_OD__JOB_ODR_CD = val; }
	public void setT_RLSD_PUCH_ODR__PUCH_ODR_QTY(String val) { m_T_RLSD_PUCH_ODR__PUCH_ODR_QTY = val; }
	public void setM_ITEM__STOCK_UNIT(String val) { m_M_ITEM__STOCK_UNIT = val; }
	public void setPKG_QTY(String val) { m_PKG_QTY = val; }
	public void setPKG_ODD_QTY(String val) { m_PKG_ODD_QTY = val; }
	public void setM_ITEM__PKG_UNIT(String val) { m_M_ITEM__PKG_UNIT = val; }
	public void setM_ITEM__STOCK_UNIT2(String val) { m_M_ITEM__STOCK_UNIT2 = val; }
	public void setT_RLSD_PUCH_ODR__PUCH_ODR_DLV_DA(String val) { m_T_RLSD_PUCH_ODR__PUCH_ODR_DLV_DA = val; }
	public void setT_RLSD_PUCH_ODR__UNIT_COST(String val) { m_T_RLSD_PUCH_ODR__UNIT_COST = val; }
	public void setM_CUR__VEND_CUR_UNIT(String val) { m_M_CUR__VEND_CUR_UNIT = val; }
	public void setT_RLSD_PUCH_ODR__PUCH_ODR_AMOUNT(String val) { m_T_RLSD_PUCH_ODR__PUCH_ODR_AMOUNT = val; }
	public void setT_RLSD_PUCH_ODR__DISC_AMOUNT(String val) { m_T_RLSD_PUCH_ODR__DISC_AMOUNT = val; }
	public void setT_RLSD_PUCH_ODR__NET_AMOUNT(String val) { m_T_RLSD_PUCH_ODR__NET_AMOUNT = val; }
	public void setTAX_AMOUNT(String val) { m_TAX_AMOUNT = val; }
	public void setT_RLSD_PUCH_ODR__AMOUNT_INCLUDE_(String val) { m_T_RLSD_PUCH_ODR__AMOUNT_INCLUDE_ = val; }
	public void setT_RLSD_PUCH_ODR__HOME_CUR_AMOUNT(String val) { m_T_RLSD_PUCH_ODR__HOME_CUR_AMOUNT = val; }
	public void setM_CUR__HOME_CUR_UNIT(String val) { m_M_CUR__HOME_CUR_UNIT = val; }
	public void setM_CUR__CUR_NAME(String val) { m_M_CUR__CUR_NAME = val; }
	public void setSYS_TYPE_VALUE__DISPLAY_NAME(String val) { m_SYS_TYPE_VALUE__DISPLAY_NAME = val; }
	public void setT_RLSD_PUCH_ODR__RATE_JUDGE_DATE(String val) { m_T_RLSD_PUCH_ODR__RATE_JUDGE_DATE = val; }
	public void setT_RLSD_PUCH_ODR__EXCH_RATE(String val) { m_T_RLSD_PUCH_ODR__EXCH_RATE = val; }
	public void setT_RLSD_PUCH_ODR__PROCESSING_COST(String val) { m_T_RLSD_PUCH_ODR__PROCESSING_COST = val; }
	public void setT_RLSD_PUCH_ODR__MATERIAL_COST(String val) { m_T_RLSD_PUCH_ODR__MATERIAL_COST = val; }
	public void setT_RLSD_PUCH_ODR__OTHER_OVERHEADS(String val) { m_T_RLSD_PUCH_ODR__OTHER_OVERHEADS = val; }
	public void setT_RLSD_PUCH_ODR__PUCH_ODR_COMMEN(String val) { m_T_RLSD_PUCH_ODR__PUCH_ODR_COMMEN = val; }
	public void setM_PLANT__PLANT_NAME(String val) { m_M_PLANT__PLANT_NAME = val; }
	public void setM_WH__WH_NAME(String val) { m_M_WH__WH_NAME = val; }
	public void setM_PLANT__ZIP_CD(String val) { m_M_PLANT__ZIP_CD = val; }
	public void setM_PLANT__ADDRESS_1(String val) { m_M_PLANT__ADDRESS_1 = val; }
	public void setM_PLANT__ADDRESS_2(String val) { m_M_PLANT__ADDRESS_2 = val; }
	public void setM_PLANT__TEL(String val) { m_M_PLANT__TEL = val; }
	public void setUSER_MST__USER_NAME(String val) { m_USER_MST__USER_NAME = val; }
	public void setPUCH_ODR_SLIP_ISS_DATE(String val) { m_PUCH_ODR_SLIP_ISS_DATE = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setTIME_CTRL(String val) { m_TIME_CTRL = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }
	public void setwork_busDate(String val) { m_work_busDate = val; }
	public void setwork_ISS_DATE(String val) { m_work_ISS_DATE = val; }
	public void setPARTIAL_DELIV_SLIP_ISS_FLG(String val) { m_PARTIAL_DELIV_SLIP_ISS_FLG = val; }


	public void setList_ReOutputFlag(List list) { l_ReOutputFlag = list; }
	public void setList_PUCH_ODR_START_DATE(List list) { l_PUCH_ODR_START_DATE = list; }
	public void setList_PUCH_ODR_DLV_DATE(List list) { l_PUCH_ODR_DLV_DATE = list; }
	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_r1_FILTER1(List list) { l_r1_FILTER1 = list; }
	public void setList_r2_FILTER1(List list) { l_r2_FILTER1 = list; }
	public void setList_r1_FILTER2(List list) { l_r1_FILTER2 = list; }
	public void setList_r2_FILTER2(List list) { l_r2_FILTER2 = list; }
	public void setList_PUCH_ODR_START_TIME(List list) { l_PUCH_ODR_START_TIME = list; }
	public void setList_PUCH_ODR_DLV_TIME(List list) { l_PUCH_ODR_DLV_TIME = list; }
	public void setList_r1_FILTER3(List list) { l_r1_FILTER3 = list; }
	public void setList_r2_FILTER3(List list) { l_r2_FILTER3 = list; }
	public void setList_l_PUCH_ODR_START_DATE(List list) { l_l_PUCH_ODR_START_DATE = list; }
	public void setList_l_PUCH_ODR_DLV_DATE(List list) { l_l_PUCH_ODR_DLV_DATE = list; }
	public void setList_l_VEND_CD(List list) { l_l_VEND_CD = list; }
	public void setList_l_VEND_ANAME(List list) { l_l_VEND_ANAME = list; }
	public void setList_l_ITEM_CD(List list) { l_l_ITEM_CD = list; }
	public void setList_l_ITEM_NAME(List list) { l_l_ITEM_NAME = list; }
	public void setList_l_PUCH_ODR_QTY(List list) { l_l_PUCH_ODR_QTY = list; }
	public void setList_l_STOCK_UNIT(List list) { l_l_STOCK_UNIT = list; }
	public void setList_l_PUCH_ODR_CD(List list) { l_l_PUCH_ODR_CD = list; }
	public void setList_l_JOB_ODR_CD(List list) { l_l_JOB_ODR_CD = list; }
	public void setList_l_PUCH_ODR_SLIP_ISS_DATE(List list) { l_l_PUCH_ODR_SLIP_ISS_DATE = list; }
	public void setList_l_MODIFY_COUNT(List list) { l_l_MODIFY_COUNT = list; }
	public void setList_l_PUCH_ODR_INST_SLIP_ISS_FLG(List list) { l_l_PUCH_ODR_INST_SLIP_ISS_FLG = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_PUCH_ODR_START_DATE_ALL(List list) { l_PUCH_ODR_START_DATE_ALL = list; }
	public void setList_PUCH_ODR_DLV_DATE_ALL(List list) { l_PUCH_ODR_DLV_DATE_ALL = list; }
	public void setList_PUCH_ODR_CD(List list) { l_PUCH_ODR_CD = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_PUCH_ODR_PERSON(List list) { l_PUCH_ODR_PERSON = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_PUCH_ODR_INST_SLIP_ISS_FLG(List list) { l_PUCH_ODR_INST_SLIP_ISS_FLG = list; }
	public void setList_ODR_FORM_FLG(List list) { l_ODR_FORM_FLG = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_VEND_NAME(List list) { l_VEND_NAME = list; }
	public void setList_USER_NAME(List list) { l_USER_NAME = list; }
	public void setList_T_RLSD_PUCH_ODR__PUCH_ODR_CD(List list) { l_T_RLSD_PUCH_ODR__PUCH_ODR_CD = list; }
	public void setList_SYS_DATE_CTRL__BUSINESS_OPR_DATE(List list) { l_SYS_DATE_CTRL__BUSINESS_OPR_DATE = list; }
	public void setList_M_VEND_CTRL__VEND_NAME(List list) { l_M_VEND_CTRL__VEND_NAME = list; }
	public void setList_M_VEND_CTRL__ZIP_CD(List list) { l_M_VEND_CTRL__ZIP_CD = list; }
	public void setList_M_VEND_CTRL__ADDRESS_1(List list) { l_M_VEND_CTRL__ADDRESS_1 = list; }
	public void setList_M_VEND_CTRL__ADDRESS_2(List list) { l_M_VEND_CTRL__ADDRESS_2 = list; }
	public void setList_M_VEND_CTRL__VEND_ORG(List list) { l_M_VEND_CTRL__VEND_ORG = list; }
	public void setList_M_VEND_CTRL__VEND_PERSON(List list) { l_M_VEND_CTRL__VEND_PERSON = list; }
	public void setList_M_VEND_CTRL__TEL(List list) { l_M_VEND_CTRL__TEL = list; }
	public void setList_M_VEND_CTRL__FAX(List list) { l_M_VEND_CTRL__FAX = list; }
	public void setList_T_RLSD_PUCH_ODR__ITEM_CD(List list) { l_T_RLSD_PUCH_ODR__ITEM_CD = list; }
	public void setList_M_ITEM__ITEM_NAME(List list) { l_M_ITEM__ITEM_NAME = list; }
	public void setList_T_OD__JOB_ODR_CD(List list) { l_T_OD__JOB_ODR_CD = list; }
	public void setList_T_RLSD_PUCH_ODR__PUCH_ODR_QTY(List list) { l_T_RLSD_PUCH_ODR__PUCH_ODR_QTY = list; }
	public void setList_M_ITEM__STOCK_UNIT(List list) { l_M_ITEM__STOCK_UNIT = list; }
	public void setList_PKG_QTY(List list) { l_PKG_QTY = list; }
	public void setList_PKG_ODD_QTY(List list) { l_PKG_ODD_QTY = list; }
	public void setList_M_ITEM__PKG_UNIT(List list) { l_M_ITEM__PKG_UNIT = list; }
	public void setList_M_ITEM__STOCK_UNIT2(List list) { l_M_ITEM__STOCK_UNIT2 = list; }
	public void setList_T_RLSD_PUCH_ODR__PUCH_ODR_DLV_DA(List list) { l_T_RLSD_PUCH_ODR__PUCH_ODR_DLV_DA = list; }
	public void setList_T_RLSD_PUCH_ODR__UNIT_COST(List list) { l_T_RLSD_PUCH_ODR__UNIT_COST = list; }
	public void setList_M_CUR__VEND_CUR_UNIT(List list) { l_M_CUR__VEND_CUR_UNIT = list; }
	public void setList_T_RLSD_PUCH_ODR__PUCH_ODR_AMOUNT(List list) { l_T_RLSD_PUCH_ODR__PUCH_ODR_AMOUNT = list; }
	public void setList_T_RLSD_PUCH_ODR__DISC_AMOUNT(List list) { l_T_RLSD_PUCH_ODR__DISC_AMOUNT = list; }
	public void setList_T_RLSD_PUCH_ODR__NET_AMOUNT(List list) { l_T_RLSD_PUCH_ODR__NET_AMOUNT = list; }
	public void setList_TAX_AMOUNT(List list) { l_TAX_AMOUNT = list; }
	public void setList_T_RLSD_PUCH_ODR__AMOUNT_INCLUDE_(List list) { l_T_RLSD_PUCH_ODR__AMOUNT_INCLUDE_ = list; }
	public void setList_T_RLSD_PUCH_ODR__HOME_CUR_AMOUNT(List list) { l_T_RLSD_PUCH_ODR__HOME_CUR_AMOUNT = list; }
	public void setList_M_CUR__HOME_CUR_UNIT(List list) { l_M_CUR__HOME_CUR_UNIT = list; }
	public void setList_M_CUR__CUR_NAME(List list) { l_M_CUR__CUR_NAME = list; }
	public void setList_SYS_TYPE_VALUE__DISPLAY_NAME(List list) { l_SYS_TYPE_VALUE__DISPLAY_NAME = list; }
	public void setList_T_RLSD_PUCH_ODR__RATE_JUDGE_DATE(List list) { l_T_RLSD_PUCH_ODR__RATE_JUDGE_DATE = list; }
	public void setList_T_RLSD_PUCH_ODR__EXCH_RATE(List list) { l_T_RLSD_PUCH_ODR__EXCH_RATE = list; }
	public void setList_T_RLSD_PUCH_ODR__PROCESSING_COST(List list) { l_T_RLSD_PUCH_ODR__PROCESSING_COST = list; }
	public void setList_T_RLSD_PUCH_ODR__MATERIAL_COST(List list) { l_T_RLSD_PUCH_ODR__MATERIAL_COST = list; }
	public void setList_T_RLSD_PUCH_ODR__OTHER_OVERHEADS(List list) { l_T_RLSD_PUCH_ODR__OTHER_OVERHEADS = list; }
	public void setList_T_RLSD_PUCH_ODR__PUCH_ODR_COMMEN(List list) { l_T_RLSD_PUCH_ODR__PUCH_ODR_COMMEN = list; }
	public void setList_M_PLANT__PLANT_NAME(List list) { l_M_PLANT__PLANT_NAME = list; }
	public void setList_M_WH__WH_NAME(List list) { l_M_WH__WH_NAME = list; }
	public void setList_M_PLANT__ZIP_CD(List list) { l_M_PLANT__ZIP_CD = list; }
	public void setList_M_PLANT__ADDRESS_1(List list) { l_M_PLANT__ADDRESS_1 = list; }
	public void setList_M_PLANT__ADDRESS_2(List list) { l_M_PLANT__ADDRESS_2 = list; }
	public void setList_M_PLANT__TEL(List list) { l_M_PLANT__TEL = list; }
	public void setList_USER_MST__USER_NAME(List list) { l_USER_MST__USER_NAME = list; }
	public void setList_PUCH_ODR_SLIP_ISS_DATE(List list) { l_PUCH_ODR_SLIP_ISS_DATE = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_TIME_CTRL(List list) { l_TIME_CTRL = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }
	public void setList_work_busDate(List list) { l_work_busDate = list; }
	public void setList_work_ISS_DATE(List list) { l_work_ISS_DATE = list; }
	public void setList_PARTIAL_DELIV_SLIP_ISS_FLG(List list) { l_PARTIAL_DELIV_SLIP_ISS_FLG = list; }

	public int setL2L_ReOutputFlag(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ReOutputFlag == null) {
			l_ReOutputFlag = new ArrayList();
		} else {
			l_ReOutputFlag.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ReOutputFlag.add(((AE0030020Struct) list.get(i)).getReOutputFlag());
		}
		return size;
	}
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
			l_PUCH_ODR_START_DATE.add(((AE0030020Struct) list.get(i)).getPUCH_ODR_START_DATE());
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
			l_PUCH_ODR_DLV_DATE.add(((AE0030020Struct) list.get(i)).getPUCH_ODR_DLV_DATE());
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
			l_DOWNLOAD_FILE.add(((AE0030020Struct) list.get(i)).getDOWNLOAD_FILE());
		}
		return size;
	}
	public int setL2L_r1_FILTER1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r1_FILTER1 == null) {
			l_r1_FILTER1 = new ArrayList();
		} else {
			l_r1_FILTER1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r1_FILTER1.add(((AE0030020Struct) list.get(i)).getr1_FILTER1());
		}
		return size;
	}
	public int setL2L_r2_FILTER1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r2_FILTER1 == null) {
			l_r2_FILTER1 = new ArrayList();
		} else {
			l_r2_FILTER1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r2_FILTER1.add(((AE0030020Struct) list.get(i)).getr2_FILTER1());
		}
		return size;
	}
	public int setL2L_r1_FILTER2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r1_FILTER2 == null) {
			l_r1_FILTER2 = new ArrayList();
		} else {
			l_r1_FILTER2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r1_FILTER2.add(((AE0030020Struct) list.get(i)).getr1_FILTER2());
		}
		return size;
	}
	public int setL2L_r2_FILTER2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r2_FILTER2 == null) {
			l_r2_FILTER2 = new ArrayList();
		} else {
			l_r2_FILTER2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r2_FILTER2.add(((AE0030020Struct) list.get(i)).getr2_FILTER2());
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
			l_PUCH_ODR_START_TIME.add(((AE0030020Struct) list.get(i)).getPUCH_ODR_START_TIME());
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
			l_PUCH_ODR_DLV_TIME.add(((AE0030020Struct) list.get(i)).getPUCH_ODR_DLV_TIME());
		}
		return size;
	}
	public int setL2L_r1_FILTER3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r1_FILTER3 == null) {
			l_r1_FILTER3 = new ArrayList();
		} else {
			l_r1_FILTER3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r1_FILTER3.add(((AE0030020Struct) list.get(i)).getr1_FILTER3());
		}
		return size;
	}
	public int setL2L_r2_FILTER3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r2_FILTER3 == null) {
			l_r2_FILTER3 = new ArrayList();
		} else {
			l_r2_FILTER3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r2_FILTER3.add(((AE0030020Struct) list.get(i)).getr2_FILTER3());
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
			l_l_PUCH_ODR_START_DATE.add(((AE0030020Struct) list.get(i)).getl_PUCH_ODR_START_DATE());
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
			l_l_PUCH_ODR_DLV_DATE.add(((AE0030020Struct) list.get(i)).getl_PUCH_ODR_DLV_DATE());
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
			l_l_VEND_CD.add(((AE0030020Struct) list.get(i)).getl_VEND_CD());
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
			l_l_VEND_ANAME.add(((AE0030020Struct) list.get(i)).getl_VEND_ANAME());
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
			l_l_ITEM_CD.add(((AE0030020Struct) list.get(i)).getl_ITEM_CD());
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
			l_l_ITEM_NAME.add(((AE0030020Struct) list.get(i)).getl_ITEM_NAME());
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
			l_l_PUCH_ODR_QTY.add(((AE0030020Struct) list.get(i)).getl_PUCH_ODR_QTY());
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
			l_l_STOCK_UNIT.add(((AE0030020Struct) list.get(i)).getl_STOCK_UNIT());
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
			l_l_PUCH_ODR_CD.add(((AE0030020Struct) list.get(i)).getl_PUCH_ODR_CD());
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
			l_l_JOB_ODR_CD.add(((AE0030020Struct) list.get(i)).getl_JOB_ODR_CD());
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
			l_l_PUCH_ODR_SLIP_ISS_DATE.add(((AE0030020Struct) list.get(i)).getl_PUCH_ODR_SLIP_ISS_DATE());
		}
		return size;
	}
	public int setL2L_l_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_MODIFY_COUNT == null) {
			l_l_MODIFY_COUNT = new ArrayList();
		} else {
			l_l_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_MODIFY_COUNT.add(((AE0030020Struct) list.get(i)).getl_MODIFY_COUNT());
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
			l_l_PUCH_ODR_INST_SLIP_ISS_FLG.add(((AE0030020Struct) list.get(i)).getl_PUCH_ODR_INST_SLIP_ISS_FLG());
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
			l_PLANT_CD.add(((AE0030020Struct) list.get(i)).getPLANT_CD());
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
			l_PUCH_ODR_START_DATE_ALL.add(((AE0030020Struct) list.get(i)).getPUCH_ODR_START_DATE_ALL());
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
			l_PUCH_ODR_DLV_DATE_ALL.add(((AE0030020Struct) list.get(i)).getPUCH_ODR_DLV_DATE_ALL());
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
			l_PUCH_ODR_CD.add(((AE0030020Struct) list.get(i)).getPUCH_ODR_CD());
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
			l_VEND_CD.add(((AE0030020Struct) list.get(i)).getVEND_CD());
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
			l_PUCH_ODR_PERSON.add(((AE0030020Struct) list.get(i)).getPUCH_ODR_PERSON());
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
			l_JOB_ODR_CD.add(((AE0030020Struct) list.get(i)).getJOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_INST_SLIP_ISS_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_INST_SLIP_ISS_FLG == null) {
			l_PUCH_ODR_INST_SLIP_ISS_FLG = new ArrayList();
		} else {
			l_PUCH_ODR_INST_SLIP_ISS_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_INST_SLIP_ISS_FLG.add(((AE0030020Struct) list.get(i)).getPUCH_ODR_INST_SLIP_ISS_FLG());
		}
		return size;
	}
	public int setL2L_ODR_FORM_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_FORM_FLG == null) {
			l_ODR_FORM_FLG = new ArrayList();
		} else {
			l_ODR_FORM_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_FORM_FLG.add(((AE0030020Struct) list.get(i)).getODR_FORM_FLG());
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
			l_PLANT_NAME.add(((AE0030020Struct) list.get(i)).getPLANT_NAME());
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
			l_VEND_NAME.add(((AE0030020Struct) list.get(i)).getVEND_NAME());
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
			l_USER_NAME.add(((AE0030020Struct) list.get(i)).getUSER_NAME());
		}
		return size;
	}
	public int setL2L_T_RLSD_PUCH_ODR__PUCH_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_RLSD_PUCH_ODR__PUCH_ODR_CD == null) {
			l_T_RLSD_PUCH_ODR__PUCH_ODR_CD = new ArrayList();
		} else {
			l_T_RLSD_PUCH_ODR__PUCH_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_RLSD_PUCH_ODR__PUCH_ODR_CD.add(((AE0030020Struct) list.get(i)).getT_RLSD_PUCH_ODR__PUCH_ODR_CD());
		}
		return size;
	}
	public int setL2L_SYS_DATE_CTRL__BUSINESS_OPR_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SYS_DATE_CTRL__BUSINESS_OPR_DATE == null) {
			l_SYS_DATE_CTRL__BUSINESS_OPR_DATE = new ArrayList();
		} else {
			l_SYS_DATE_CTRL__BUSINESS_OPR_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SYS_DATE_CTRL__BUSINESS_OPR_DATE.add(((AE0030020Struct) list.get(i)).getSYS_DATE_CTRL__BUSINESS_OPR_DATE());
		}
		return size;
	}
	public int setL2L_M_VEND_CTRL__VEND_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_M_VEND_CTRL__VEND_NAME == null) {
			l_M_VEND_CTRL__VEND_NAME = new ArrayList();
		} else {
			l_M_VEND_CTRL__VEND_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_M_VEND_CTRL__VEND_NAME.add(((AE0030020Struct) list.get(i)).getM_VEND_CTRL__VEND_NAME());
		}
		return size;
	}
	public int setL2L_M_VEND_CTRL__ZIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_M_VEND_CTRL__ZIP_CD == null) {
			l_M_VEND_CTRL__ZIP_CD = new ArrayList();
		} else {
			l_M_VEND_CTRL__ZIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_M_VEND_CTRL__ZIP_CD.add(((AE0030020Struct) list.get(i)).getM_VEND_CTRL__ZIP_CD());
		}
		return size;
	}
	public int setL2L_M_VEND_CTRL__ADDRESS_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_M_VEND_CTRL__ADDRESS_1 == null) {
			l_M_VEND_CTRL__ADDRESS_1 = new ArrayList();
		} else {
			l_M_VEND_CTRL__ADDRESS_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_M_VEND_CTRL__ADDRESS_1.add(((AE0030020Struct) list.get(i)).getM_VEND_CTRL__ADDRESS_1());
		}
		return size;
	}
	public int setL2L_M_VEND_CTRL__ADDRESS_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_M_VEND_CTRL__ADDRESS_2 == null) {
			l_M_VEND_CTRL__ADDRESS_2 = new ArrayList();
		} else {
			l_M_VEND_CTRL__ADDRESS_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_M_VEND_CTRL__ADDRESS_2.add(((AE0030020Struct) list.get(i)).getM_VEND_CTRL__ADDRESS_2());
		}
		return size;
	}
	public int setL2L_M_VEND_CTRL__VEND_ORG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_M_VEND_CTRL__VEND_ORG == null) {
			l_M_VEND_CTRL__VEND_ORG = new ArrayList();
		} else {
			l_M_VEND_CTRL__VEND_ORG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_M_VEND_CTRL__VEND_ORG.add(((AE0030020Struct) list.get(i)).getM_VEND_CTRL__VEND_ORG());
		}
		return size;
	}
	public int setL2L_M_VEND_CTRL__VEND_PERSON(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_M_VEND_CTRL__VEND_PERSON == null) {
			l_M_VEND_CTRL__VEND_PERSON = new ArrayList();
		} else {
			l_M_VEND_CTRL__VEND_PERSON.clear();
		}
		for (int i = 0; i < size; i++) {
			l_M_VEND_CTRL__VEND_PERSON.add(((AE0030020Struct) list.get(i)).getM_VEND_CTRL__VEND_PERSON());
		}
		return size;
	}
	public int setL2L_M_VEND_CTRL__TEL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_M_VEND_CTRL__TEL == null) {
			l_M_VEND_CTRL__TEL = new ArrayList();
		} else {
			l_M_VEND_CTRL__TEL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_M_VEND_CTRL__TEL.add(((AE0030020Struct) list.get(i)).getM_VEND_CTRL__TEL());
		}
		return size;
	}
	public int setL2L_M_VEND_CTRL__FAX(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_M_VEND_CTRL__FAX == null) {
			l_M_VEND_CTRL__FAX = new ArrayList();
		} else {
			l_M_VEND_CTRL__FAX.clear();
		}
		for (int i = 0; i < size; i++) {
			l_M_VEND_CTRL__FAX.add(((AE0030020Struct) list.get(i)).getM_VEND_CTRL__FAX());
		}
		return size;
	}
	public int setL2L_T_RLSD_PUCH_ODR__ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_RLSD_PUCH_ODR__ITEM_CD == null) {
			l_T_RLSD_PUCH_ODR__ITEM_CD = new ArrayList();
		} else {
			l_T_RLSD_PUCH_ODR__ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_RLSD_PUCH_ODR__ITEM_CD.add(((AE0030020Struct) list.get(i)).getT_RLSD_PUCH_ODR__ITEM_CD());
		}
		return size;
	}
	public int setL2L_M_ITEM__ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_M_ITEM__ITEM_NAME == null) {
			l_M_ITEM__ITEM_NAME = new ArrayList();
		} else {
			l_M_ITEM__ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_M_ITEM__ITEM_NAME.add(((AE0030020Struct) list.get(i)).getM_ITEM__ITEM_NAME());
		}
		return size;
	}
	public int setL2L_T_OD__JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_OD__JOB_ODR_CD == null) {
			l_T_OD__JOB_ODR_CD = new ArrayList();
		} else {
			l_T_OD__JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_OD__JOB_ODR_CD.add(((AE0030020Struct) list.get(i)).getT_OD__JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_T_RLSD_PUCH_ODR__PUCH_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_RLSD_PUCH_ODR__PUCH_ODR_QTY == null) {
			l_T_RLSD_PUCH_ODR__PUCH_ODR_QTY = new ArrayList();
		} else {
			l_T_RLSD_PUCH_ODR__PUCH_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_RLSD_PUCH_ODR__PUCH_ODR_QTY.add(((AE0030020Struct) list.get(i)).getT_RLSD_PUCH_ODR__PUCH_ODR_QTY());
		}
		return size;
	}
	public int setL2L_M_ITEM__STOCK_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_M_ITEM__STOCK_UNIT == null) {
			l_M_ITEM__STOCK_UNIT = new ArrayList();
		} else {
			l_M_ITEM__STOCK_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_M_ITEM__STOCK_UNIT.add(((AE0030020Struct) list.get(i)).getM_ITEM__STOCK_UNIT());
		}
		return size;
	}
	public int setL2L_PKG_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PKG_QTY == null) {
			l_PKG_QTY = new ArrayList();
		} else {
			l_PKG_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PKG_QTY.add(((AE0030020Struct) list.get(i)).getPKG_QTY());
		}
		return size;
	}
	public int setL2L_PKG_ODD_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PKG_ODD_QTY == null) {
			l_PKG_ODD_QTY = new ArrayList();
		} else {
			l_PKG_ODD_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PKG_ODD_QTY.add(((AE0030020Struct) list.get(i)).getPKG_ODD_QTY());
		}
		return size;
	}
	public int setL2L_M_ITEM__PKG_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_M_ITEM__PKG_UNIT == null) {
			l_M_ITEM__PKG_UNIT = new ArrayList();
		} else {
			l_M_ITEM__PKG_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_M_ITEM__PKG_UNIT.add(((AE0030020Struct) list.get(i)).getM_ITEM__PKG_UNIT());
		}
		return size;
	}
	public int setL2L_M_ITEM__STOCK_UNIT2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_M_ITEM__STOCK_UNIT2 == null) {
			l_M_ITEM__STOCK_UNIT2 = new ArrayList();
		} else {
			l_M_ITEM__STOCK_UNIT2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_M_ITEM__STOCK_UNIT2.add(((AE0030020Struct) list.get(i)).getM_ITEM__STOCK_UNIT2());
		}
		return size;
	}
	public int setL2L_T_RLSD_PUCH_ODR__PUCH_ODR_DLV_DA(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_RLSD_PUCH_ODR__PUCH_ODR_DLV_DA == null) {
			l_T_RLSD_PUCH_ODR__PUCH_ODR_DLV_DA = new ArrayList();
		} else {
			l_T_RLSD_PUCH_ODR__PUCH_ODR_DLV_DA.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_RLSD_PUCH_ODR__PUCH_ODR_DLV_DA.add(((AE0030020Struct) list.get(i)).getT_RLSD_PUCH_ODR__PUCH_ODR_DLV_DA());
		}
		return size;
	}
	public int setL2L_T_RLSD_PUCH_ODR__UNIT_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_RLSD_PUCH_ODR__UNIT_COST == null) {
			l_T_RLSD_PUCH_ODR__UNIT_COST = new ArrayList();
		} else {
			l_T_RLSD_PUCH_ODR__UNIT_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_RLSD_PUCH_ODR__UNIT_COST.add(((AE0030020Struct) list.get(i)).getT_RLSD_PUCH_ODR__UNIT_COST());
		}
		return size;
	}
	public int setL2L_M_CUR__VEND_CUR_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_M_CUR__VEND_CUR_UNIT == null) {
			l_M_CUR__VEND_CUR_UNIT = new ArrayList();
		} else {
			l_M_CUR__VEND_CUR_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_M_CUR__VEND_CUR_UNIT.add(((AE0030020Struct) list.get(i)).getM_CUR__VEND_CUR_UNIT());
		}
		return size;
	}
	public int setL2L_T_RLSD_PUCH_ODR__PUCH_ODR_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_RLSD_PUCH_ODR__PUCH_ODR_AMOUNT == null) {
			l_T_RLSD_PUCH_ODR__PUCH_ODR_AMOUNT = new ArrayList();
		} else {
			l_T_RLSD_PUCH_ODR__PUCH_ODR_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_RLSD_PUCH_ODR__PUCH_ODR_AMOUNT.add(((AE0030020Struct) list.get(i)).getT_RLSD_PUCH_ODR__PUCH_ODR_AMOUNT());
		}
		return size;
	}
	public int setL2L_T_RLSD_PUCH_ODR__DISC_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_RLSD_PUCH_ODR__DISC_AMOUNT == null) {
			l_T_RLSD_PUCH_ODR__DISC_AMOUNT = new ArrayList();
		} else {
			l_T_RLSD_PUCH_ODR__DISC_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_RLSD_PUCH_ODR__DISC_AMOUNT.add(((AE0030020Struct) list.get(i)).getT_RLSD_PUCH_ODR__DISC_AMOUNT());
		}
		return size;
	}
	public int setL2L_T_RLSD_PUCH_ODR__NET_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_RLSD_PUCH_ODR__NET_AMOUNT == null) {
			l_T_RLSD_PUCH_ODR__NET_AMOUNT = new ArrayList();
		} else {
			l_T_RLSD_PUCH_ODR__NET_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_RLSD_PUCH_ODR__NET_AMOUNT.add(((AE0030020Struct) list.get(i)).getT_RLSD_PUCH_ODR__NET_AMOUNT());
		}
		return size;
	}
	public int setL2L_TAX_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_AMOUNT == null) {
			l_TAX_AMOUNT = new ArrayList();
		} else {
			l_TAX_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_AMOUNT.add(((AE0030020Struct) list.get(i)).getTAX_AMOUNT());
		}
		return size;
	}
	public int setL2L_T_RLSD_PUCH_ODR__AMOUNT_INCLUDE_(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_RLSD_PUCH_ODR__AMOUNT_INCLUDE_ == null) {
			l_T_RLSD_PUCH_ODR__AMOUNT_INCLUDE_ = new ArrayList();
		} else {
			l_T_RLSD_PUCH_ODR__AMOUNT_INCLUDE_.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_RLSD_PUCH_ODR__AMOUNT_INCLUDE_.add(((AE0030020Struct) list.get(i)).getT_RLSD_PUCH_ODR__AMOUNT_INCLUDE_());
		}
		return size;
	}
	public int setL2L_T_RLSD_PUCH_ODR__HOME_CUR_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_RLSD_PUCH_ODR__HOME_CUR_AMOUNT == null) {
			l_T_RLSD_PUCH_ODR__HOME_CUR_AMOUNT = new ArrayList();
		} else {
			l_T_RLSD_PUCH_ODR__HOME_CUR_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_RLSD_PUCH_ODR__HOME_CUR_AMOUNT.add(((AE0030020Struct) list.get(i)).getT_RLSD_PUCH_ODR__HOME_CUR_AMOUNT());
		}
		return size;
	}
	public int setL2L_M_CUR__HOME_CUR_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_M_CUR__HOME_CUR_UNIT == null) {
			l_M_CUR__HOME_CUR_UNIT = new ArrayList();
		} else {
			l_M_CUR__HOME_CUR_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_M_CUR__HOME_CUR_UNIT.add(((AE0030020Struct) list.get(i)).getM_CUR__HOME_CUR_UNIT());
		}
		return size;
	}
	public int setL2L_M_CUR__CUR_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_M_CUR__CUR_NAME == null) {
			l_M_CUR__CUR_NAME = new ArrayList();
		} else {
			l_M_CUR__CUR_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_M_CUR__CUR_NAME.add(((AE0030020Struct) list.get(i)).getM_CUR__CUR_NAME());
		}
		return size;
	}
	public int setL2L_SYS_TYPE_VALUE__DISPLAY_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SYS_TYPE_VALUE__DISPLAY_NAME == null) {
			l_SYS_TYPE_VALUE__DISPLAY_NAME = new ArrayList();
		} else {
			l_SYS_TYPE_VALUE__DISPLAY_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SYS_TYPE_VALUE__DISPLAY_NAME.add(((AE0030020Struct) list.get(i)).getSYS_TYPE_VALUE__DISPLAY_NAME());
		}
		return size;
	}
	public int setL2L_T_RLSD_PUCH_ODR__RATE_JUDGE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_RLSD_PUCH_ODR__RATE_JUDGE_DATE == null) {
			l_T_RLSD_PUCH_ODR__RATE_JUDGE_DATE = new ArrayList();
		} else {
			l_T_RLSD_PUCH_ODR__RATE_JUDGE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_RLSD_PUCH_ODR__RATE_JUDGE_DATE.add(((AE0030020Struct) list.get(i)).getT_RLSD_PUCH_ODR__RATE_JUDGE_DATE());
		}
		return size;
	}
	public int setL2L_T_RLSD_PUCH_ODR__EXCH_RATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_RLSD_PUCH_ODR__EXCH_RATE == null) {
			l_T_RLSD_PUCH_ODR__EXCH_RATE = new ArrayList();
		} else {
			l_T_RLSD_PUCH_ODR__EXCH_RATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_RLSD_PUCH_ODR__EXCH_RATE.add(((AE0030020Struct) list.get(i)).getT_RLSD_PUCH_ODR__EXCH_RATE());
		}
		return size;
	}
	public int setL2L_T_RLSD_PUCH_ODR__PROCESSING_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_RLSD_PUCH_ODR__PROCESSING_COST == null) {
			l_T_RLSD_PUCH_ODR__PROCESSING_COST = new ArrayList();
		} else {
			l_T_RLSD_PUCH_ODR__PROCESSING_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_RLSD_PUCH_ODR__PROCESSING_COST.add(((AE0030020Struct) list.get(i)).getT_RLSD_PUCH_ODR__PROCESSING_COST());
		}
		return size;
	}
	public int setL2L_T_RLSD_PUCH_ODR__MATERIAL_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_RLSD_PUCH_ODR__MATERIAL_COST == null) {
			l_T_RLSD_PUCH_ODR__MATERIAL_COST = new ArrayList();
		} else {
			l_T_RLSD_PUCH_ODR__MATERIAL_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_RLSD_PUCH_ODR__MATERIAL_COST.add(((AE0030020Struct) list.get(i)).getT_RLSD_PUCH_ODR__MATERIAL_COST());
		}
		return size;
	}
	public int setL2L_T_RLSD_PUCH_ODR__OTHER_OVERHEADS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_RLSD_PUCH_ODR__OTHER_OVERHEADS == null) {
			l_T_RLSD_PUCH_ODR__OTHER_OVERHEADS = new ArrayList();
		} else {
			l_T_RLSD_PUCH_ODR__OTHER_OVERHEADS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_RLSD_PUCH_ODR__OTHER_OVERHEADS.add(((AE0030020Struct) list.get(i)).getT_RLSD_PUCH_ODR__OTHER_OVERHEADS());
		}
		return size;
	}
	public int setL2L_T_RLSD_PUCH_ODR__PUCH_ODR_COMMEN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_T_RLSD_PUCH_ODR__PUCH_ODR_COMMEN == null) {
			l_T_RLSD_PUCH_ODR__PUCH_ODR_COMMEN = new ArrayList();
		} else {
			l_T_RLSD_PUCH_ODR__PUCH_ODR_COMMEN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_T_RLSD_PUCH_ODR__PUCH_ODR_COMMEN.add(((AE0030020Struct) list.get(i)).getT_RLSD_PUCH_ODR__PUCH_ODR_COMMEN());
		}
		return size;
	}
	public int setL2L_M_PLANT__PLANT_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_M_PLANT__PLANT_NAME == null) {
			l_M_PLANT__PLANT_NAME = new ArrayList();
		} else {
			l_M_PLANT__PLANT_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_M_PLANT__PLANT_NAME.add(((AE0030020Struct) list.get(i)).getM_PLANT__PLANT_NAME());
		}
		return size;
	}
	public int setL2L_M_WH__WH_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_M_WH__WH_NAME == null) {
			l_M_WH__WH_NAME = new ArrayList();
		} else {
			l_M_WH__WH_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_M_WH__WH_NAME.add(((AE0030020Struct) list.get(i)).getM_WH__WH_NAME());
		}
		return size;
	}
	public int setL2L_M_PLANT__ZIP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_M_PLANT__ZIP_CD == null) {
			l_M_PLANT__ZIP_CD = new ArrayList();
		} else {
			l_M_PLANT__ZIP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_M_PLANT__ZIP_CD.add(((AE0030020Struct) list.get(i)).getM_PLANT__ZIP_CD());
		}
		return size;
	}
	public int setL2L_M_PLANT__ADDRESS_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_M_PLANT__ADDRESS_1 == null) {
			l_M_PLANT__ADDRESS_1 = new ArrayList();
		} else {
			l_M_PLANT__ADDRESS_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_M_PLANT__ADDRESS_1.add(((AE0030020Struct) list.get(i)).getM_PLANT__ADDRESS_1());
		}
		return size;
	}
	public int setL2L_M_PLANT__ADDRESS_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_M_PLANT__ADDRESS_2 == null) {
			l_M_PLANT__ADDRESS_2 = new ArrayList();
		} else {
			l_M_PLANT__ADDRESS_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_M_PLANT__ADDRESS_2.add(((AE0030020Struct) list.get(i)).getM_PLANT__ADDRESS_2());
		}
		return size;
	}
	public int setL2L_M_PLANT__TEL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_M_PLANT__TEL == null) {
			l_M_PLANT__TEL = new ArrayList();
		} else {
			l_M_PLANT__TEL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_M_PLANT__TEL.add(((AE0030020Struct) list.get(i)).getM_PLANT__TEL());
		}
		return size;
	}
	public int setL2L_USER_MST__USER_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_USER_MST__USER_NAME == null) {
			l_USER_MST__USER_NAME = new ArrayList();
		} else {
			l_USER_MST__USER_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_USER_MST__USER_NAME.add(((AE0030020Struct) list.get(i)).getUSER_MST__USER_NAME());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_SLIP_ISS_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_SLIP_ISS_DATE == null) {
			l_PUCH_ODR_SLIP_ISS_DATE = new ArrayList();
		} else {
			l_PUCH_ODR_SLIP_ISS_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_SLIP_ISS_DATE.add(((AE0030020Struct) list.get(i)).getPUCH_ODR_SLIP_ISS_DATE());
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
			l_MODIFY_COUNT.add(((AE0030020Struct) list.get(i)).getMODIFY_COUNT());
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
			l_TIME_CTRL.add(((AE0030020Struct) list.get(i)).getTIME_CTRL());
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
			l_l_COUNT.add(((AE0030020Struct) list.get(i)).getl_COUNT());
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
			l_ROW_COUNT.add(((AE0030020Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}
	public int setL2L_work_busDate(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_work_busDate == null) {
			l_work_busDate = new ArrayList();
		} else {
			l_work_busDate.clear();
		}
		for (int i = 0; i < size; i++) {
			l_work_busDate.add(((AE0030020Struct) list.get(i)).getwork_busDate());
		}
		return size;
	}
	public int setL2L_work_ISS_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_work_ISS_DATE == null) {
			l_work_ISS_DATE = new ArrayList();
		} else {
			l_work_ISS_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_work_ISS_DATE.add(((AE0030020Struct) list.get(i)).getwork_ISS_DATE());
		}
		return size;
	}
	public int setL2L_PARTIAL_DELIV_SLIP_ISS_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PARTIAL_DELIV_SLIP_ISS_FLG == null) {
			l_PARTIAL_DELIV_SLIP_ISS_FLG = new ArrayList();
		} else {
			l_PARTIAL_DELIV_SLIP_ISS_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PARTIAL_DELIV_SLIP_ISS_FLG.add(((AE0030020Struct) list.get(i)).getPARTIAL_DELIV_SLIP_ISS_FLG());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_ReOutputFlag = null;
		m_PUCH_ODR_START_DATE = null;
		m_PUCH_ODR_DLV_DATE = null;
		m_DOWNLOAD_FILE = null;
		m_r1_FILTER1 = null;
		m_r2_FILTER1 = null;
		m_r1_FILTER2 = null;
		m_r2_FILTER2 = null;
		m_PUCH_ODR_START_TIME = null;
		m_PUCH_ODR_DLV_TIME = null;
		m_r1_FILTER3 = null;
		m_r2_FILTER3 = null;
		m_l_PUCH_ODR_START_DATE = null;
		m_l_PUCH_ODR_DLV_DATE = null;
		m_l_VEND_CD = null;
		m_l_VEND_ANAME = null;
		m_l_ITEM_CD = null;
		m_l_ITEM_NAME = null;
		m_l_PUCH_ODR_QTY = null;
		m_l_STOCK_UNIT = null;
		m_l_PUCH_ODR_CD = null;
		m_l_JOB_ODR_CD = null;
		m_l_PUCH_ODR_SLIP_ISS_DATE = null;
		m_l_MODIFY_COUNT = null;
		m_l_PUCH_ODR_INST_SLIP_ISS_FLG = null;
		m_PLANT_CD = null;
		m_PUCH_ODR_START_DATE_ALL = null;
		m_PUCH_ODR_DLV_DATE_ALL = null;
		m_PUCH_ODR_CD = null;
		m_VEND_CD = null;
		m_PUCH_ODR_PERSON = null;
		m_JOB_ODR_CD = null;
		m_PUCH_ODR_INST_SLIP_ISS_FLG = null;
		m_ODR_FORM_FLG = null;
		m_PLANT_NAME = null;
		m_VEND_NAME = null;
		m_USER_NAME = null;
		m_T_RLSD_PUCH_ODR__PUCH_ODR_CD = null;
		m_SYS_DATE_CTRL__BUSINESS_OPR_DATE = null;
		m_M_VEND_CTRL__VEND_NAME = null;
		m_M_VEND_CTRL__ZIP_CD = null;
		m_M_VEND_CTRL__ADDRESS_1 = null;
		m_M_VEND_CTRL__ADDRESS_2 = null;
		m_M_VEND_CTRL__VEND_ORG = null;
		m_M_VEND_CTRL__VEND_PERSON = null;
		m_M_VEND_CTRL__TEL = null;
		m_M_VEND_CTRL__FAX = null;
		m_T_RLSD_PUCH_ODR__ITEM_CD = null;
		m_M_ITEM__ITEM_NAME = null;
		m_T_OD__JOB_ODR_CD = null;
		m_T_RLSD_PUCH_ODR__PUCH_ODR_QTY = null;
		m_M_ITEM__STOCK_UNIT = null;
		m_PKG_QTY = null;
		m_PKG_ODD_QTY = null;
		m_M_ITEM__PKG_UNIT = null;
		m_M_ITEM__STOCK_UNIT2 = null;
		m_T_RLSD_PUCH_ODR__PUCH_ODR_DLV_DA = null;
		m_T_RLSD_PUCH_ODR__UNIT_COST = null;
		m_M_CUR__VEND_CUR_UNIT = null;
		m_T_RLSD_PUCH_ODR__PUCH_ODR_AMOUNT = null;
		m_T_RLSD_PUCH_ODR__DISC_AMOUNT = null;
		m_T_RLSD_PUCH_ODR__NET_AMOUNT = null;
		m_TAX_AMOUNT = null;
		m_T_RLSD_PUCH_ODR__AMOUNT_INCLUDE_ = null;
		m_T_RLSD_PUCH_ODR__HOME_CUR_AMOUNT = null;
		m_M_CUR__HOME_CUR_UNIT = null;
		m_M_CUR__CUR_NAME = null;
		m_SYS_TYPE_VALUE__DISPLAY_NAME = null;
		m_T_RLSD_PUCH_ODR__RATE_JUDGE_DATE = null;
		m_T_RLSD_PUCH_ODR__EXCH_RATE = null;
		m_T_RLSD_PUCH_ODR__PROCESSING_COST = null;
		m_T_RLSD_PUCH_ODR__MATERIAL_COST = null;
		m_T_RLSD_PUCH_ODR__OTHER_OVERHEADS = null;
		m_T_RLSD_PUCH_ODR__PUCH_ODR_COMMEN = null;
		m_M_PLANT__PLANT_NAME = null;
		m_M_WH__WH_NAME = null;
		m_M_PLANT__ZIP_CD = null;
		m_M_PLANT__ADDRESS_1 = null;
		m_M_PLANT__ADDRESS_2 = null;
		m_M_PLANT__TEL = null;
		m_USER_MST__USER_NAME = null;
		m_PUCH_ODR_SLIP_ISS_DATE = null;
		m_MODIFY_COUNT = null;
		m_TIME_CTRL = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;
		m_work_busDate = null;
		m_work_ISS_DATE = null;
		m_PARTIAL_DELIV_SLIP_ISS_FLG = null;

		l_ReOutputFlag = null;
		l_PUCH_ODR_START_DATE = null;
		l_PUCH_ODR_DLV_DATE = null;
		l_DOWNLOAD_FILE = null;
		l_r1_FILTER1 = null;
		l_r2_FILTER1 = null;
		l_r1_FILTER2 = null;
		l_r2_FILTER2 = null;
		l_PUCH_ODR_START_TIME = null;
		l_PUCH_ODR_DLV_TIME = null;
		l_r1_FILTER3 = null;
		l_r2_FILTER3 = null;
		l_l_PUCH_ODR_START_DATE = null;
		l_l_PUCH_ODR_DLV_DATE = null;
		l_l_VEND_CD = null;
		l_l_VEND_ANAME = null;
		l_l_ITEM_CD = null;
		l_l_ITEM_NAME = null;
		l_l_PUCH_ODR_QTY = null;
		l_l_STOCK_UNIT = null;
		l_l_PUCH_ODR_CD = null;
		l_l_JOB_ODR_CD = null;
		l_l_PUCH_ODR_SLIP_ISS_DATE = null;
		l_l_MODIFY_COUNT = null;
		l_l_PUCH_ODR_INST_SLIP_ISS_FLG = null;
		l_PLANT_CD = null;
		l_PUCH_ODR_START_DATE_ALL = null;
		l_PUCH_ODR_DLV_DATE_ALL = null;
		l_PUCH_ODR_CD = null;
		l_VEND_CD = null;
		l_PUCH_ODR_PERSON = null;
		l_JOB_ODR_CD = null;
		l_PUCH_ODR_INST_SLIP_ISS_FLG = null;
		l_ODR_FORM_FLG = null;
		l_PLANT_NAME = null;
		l_VEND_NAME = null;
		l_USER_NAME = null;
		l_T_RLSD_PUCH_ODR__PUCH_ODR_CD = null;
		l_SYS_DATE_CTRL__BUSINESS_OPR_DATE = null;
		l_M_VEND_CTRL__VEND_NAME = null;
		l_M_VEND_CTRL__ZIP_CD = null;
		l_M_VEND_CTRL__ADDRESS_1 = null;
		l_M_VEND_CTRL__ADDRESS_2 = null;
		l_M_VEND_CTRL__VEND_ORG = null;
		l_M_VEND_CTRL__VEND_PERSON = null;
		l_M_VEND_CTRL__TEL = null;
		l_M_VEND_CTRL__FAX = null;
		l_T_RLSD_PUCH_ODR__ITEM_CD = null;
		l_M_ITEM__ITEM_NAME = null;
		l_T_OD__JOB_ODR_CD = null;
		l_T_RLSD_PUCH_ODR__PUCH_ODR_QTY = null;
		l_M_ITEM__STOCK_UNIT = null;
		l_PKG_QTY = null;
		l_PKG_ODD_QTY = null;
		l_M_ITEM__PKG_UNIT = null;
		l_M_ITEM__STOCK_UNIT2 = null;
		l_T_RLSD_PUCH_ODR__PUCH_ODR_DLV_DA = null;
		l_T_RLSD_PUCH_ODR__UNIT_COST = null;
		l_M_CUR__VEND_CUR_UNIT = null;
		l_T_RLSD_PUCH_ODR__PUCH_ODR_AMOUNT = null;
		l_T_RLSD_PUCH_ODR__DISC_AMOUNT = null;
		l_T_RLSD_PUCH_ODR__NET_AMOUNT = null;
		l_TAX_AMOUNT = null;
		l_T_RLSD_PUCH_ODR__AMOUNT_INCLUDE_ = null;
		l_T_RLSD_PUCH_ODR__HOME_CUR_AMOUNT = null;
		l_M_CUR__HOME_CUR_UNIT = null;
		l_M_CUR__CUR_NAME = null;
		l_SYS_TYPE_VALUE__DISPLAY_NAME = null;
		l_T_RLSD_PUCH_ODR__RATE_JUDGE_DATE = null;
		l_T_RLSD_PUCH_ODR__EXCH_RATE = null;
		l_T_RLSD_PUCH_ODR__PROCESSING_COST = null;
		l_T_RLSD_PUCH_ODR__MATERIAL_COST = null;
		l_T_RLSD_PUCH_ODR__OTHER_OVERHEADS = null;
		l_T_RLSD_PUCH_ODR__PUCH_ODR_COMMEN = null;
		l_M_PLANT__PLANT_NAME = null;
		l_M_WH__WH_NAME = null;
		l_M_PLANT__ZIP_CD = null;
		l_M_PLANT__ADDRESS_1 = null;
		l_M_PLANT__ADDRESS_2 = null;
		l_M_PLANT__TEL = null;
		l_USER_MST__USER_NAME = null;
		l_PUCH_ODR_SLIP_ISS_DATE = null;
		l_MODIFY_COUNT = null;
		l_TIME_CTRL = null;
		l_l_COUNT = null;
		l_ROW_COUNT = null;
		l_work_busDate = null;
		l_work_ISS_DATE = null;
		l_PARTIAL_DELIV_SLIP_ISS_FLG = null;

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
	 * medAE0030020�N���X�̕W���R���X�g���N�^
	 */
	public AE0030020Struct()
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
	public void setStruct(AE0030020Struct struct)
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
	public void setStructM(AE0030020Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setReOutputFlag(struct.getReOutputFlag());
			this.setPUCH_ODR_START_DATE(struct.getPUCH_ODR_START_DATE());
			this.setPUCH_ODR_DLV_DATE(struct.getPUCH_ODR_DLV_DATE());
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setr1_FILTER1(struct.getr1_FILTER1());
			this.setr2_FILTER1(struct.getr2_FILTER1());
			this.setr1_FILTER2(struct.getr1_FILTER2());
			this.setr2_FILTER2(struct.getr2_FILTER2());
			this.setPUCH_ODR_START_TIME(struct.getPUCH_ODR_START_TIME());
			this.setPUCH_ODR_DLV_TIME(struct.getPUCH_ODR_DLV_TIME());
			this.setr1_FILTER3(struct.getr1_FILTER3());
			this.setr2_FILTER3(struct.getr2_FILTER3());
			this.setl_PUCH_ODR_START_DATE(struct.getl_PUCH_ODR_START_DATE());
			this.setl_PUCH_ODR_DLV_DATE(struct.getl_PUCH_ODR_DLV_DATE());
			this.setl_VEND_CD(struct.getl_VEND_CD());
			this.setl_VEND_ANAME(struct.getl_VEND_ANAME());
			this.setl_ITEM_CD(struct.getl_ITEM_CD());
			this.setl_ITEM_NAME(struct.getl_ITEM_NAME());
			this.setl_PUCH_ODR_QTY(struct.getl_PUCH_ODR_QTY());
			this.setl_STOCK_UNIT(struct.getl_STOCK_UNIT());
			this.setl_PUCH_ODR_CD(struct.getl_PUCH_ODR_CD());
			this.setl_JOB_ODR_CD(struct.getl_JOB_ODR_CD());
			this.setl_PUCH_ODR_SLIP_ISS_DATE(struct.getl_PUCH_ODR_SLIP_ISS_DATE());
			this.setl_MODIFY_COUNT(struct.getl_MODIFY_COUNT());
			this.setl_PUCH_ODR_INST_SLIP_ISS_FLG(struct.getl_PUCH_ODR_INST_SLIP_ISS_FLG());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setPUCH_ODR_START_DATE_ALL(struct.getPUCH_ODR_START_DATE_ALL());
			this.setPUCH_ODR_DLV_DATE_ALL(struct.getPUCH_ODR_DLV_DATE_ALL());
			this.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());
			this.setVEND_CD(struct.getVEND_CD());
			this.setPUCH_ODR_PERSON(struct.getPUCH_ODR_PERSON());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setPUCH_ODR_INST_SLIP_ISS_FLG(struct.getPUCH_ODR_INST_SLIP_ISS_FLG());
			this.setODR_FORM_FLG(struct.getODR_FORM_FLG());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.setVEND_NAME(struct.getVEND_NAME());
			this.setUSER_NAME(struct.getUSER_NAME());
			this.setT_RLSD_PUCH_ODR__PUCH_ODR_CD(struct.getT_RLSD_PUCH_ODR__PUCH_ODR_CD());
			this.setSYS_DATE_CTRL__BUSINESS_OPR_DATE(struct.getSYS_DATE_CTRL__BUSINESS_OPR_DATE());
			this.setM_VEND_CTRL__VEND_NAME(struct.getM_VEND_CTRL__VEND_NAME());
			this.setM_VEND_CTRL__ZIP_CD(struct.getM_VEND_CTRL__ZIP_CD());
			this.setM_VEND_CTRL__ADDRESS_1(struct.getM_VEND_CTRL__ADDRESS_1());
			this.setM_VEND_CTRL__ADDRESS_2(struct.getM_VEND_CTRL__ADDRESS_2());
			this.setM_VEND_CTRL__VEND_ORG(struct.getM_VEND_CTRL__VEND_ORG());
			this.setM_VEND_CTRL__VEND_PERSON(struct.getM_VEND_CTRL__VEND_PERSON());
			this.setM_VEND_CTRL__TEL(struct.getM_VEND_CTRL__TEL());
			this.setM_VEND_CTRL__FAX(struct.getM_VEND_CTRL__FAX());
			this.setT_RLSD_PUCH_ODR__ITEM_CD(struct.getT_RLSD_PUCH_ODR__ITEM_CD());
			this.setM_ITEM__ITEM_NAME(struct.getM_ITEM__ITEM_NAME());
			this.setT_OD__JOB_ODR_CD(struct.getT_OD__JOB_ODR_CD());
			this.setT_RLSD_PUCH_ODR__PUCH_ODR_QTY(struct.getT_RLSD_PUCH_ODR__PUCH_ODR_QTY());
			this.setM_ITEM__STOCK_UNIT(struct.getM_ITEM__STOCK_UNIT());
			this.setPKG_QTY(struct.getPKG_QTY());
			this.setPKG_ODD_QTY(struct.getPKG_ODD_QTY());
			this.setM_ITEM__PKG_UNIT(struct.getM_ITEM__PKG_UNIT());
			this.setM_ITEM__STOCK_UNIT2(struct.getM_ITEM__STOCK_UNIT2());
			this.setT_RLSD_PUCH_ODR__PUCH_ODR_DLV_DA(struct.getT_RLSD_PUCH_ODR__PUCH_ODR_DLV_DA());
			this.setT_RLSD_PUCH_ODR__UNIT_COST(struct.getT_RLSD_PUCH_ODR__UNIT_COST());
			this.setM_CUR__VEND_CUR_UNIT(struct.getM_CUR__VEND_CUR_UNIT());
			this.setT_RLSD_PUCH_ODR__PUCH_ODR_AMOUNT(struct.getT_RLSD_PUCH_ODR__PUCH_ODR_AMOUNT());
			this.setT_RLSD_PUCH_ODR__DISC_AMOUNT(struct.getT_RLSD_PUCH_ODR__DISC_AMOUNT());
			this.setT_RLSD_PUCH_ODR__NET_AMOUNT(struct.getT_RLSD_PUCH_ODR__NET_AMOUNT());
			this.setTAX_AMOUNT(struct.getTAX_AMOUNT());
			this.setT_RLSD_PUCH_ODR__AMOUNT_INCLUDE_(struct.getT_RLSD_PUCH_ODR__AMOUNT_INCLUDE_());
			this.setT_RLSD_PUCH_ODR__HOME_CUR_AMOUNT(struct.getT_RLSD_PUCH_ODR__HOME_CUR_AMOUNT());
			this.setM_CUR__HOME_CUR_UNIT(struct.getM_CUR__HOME_CUR_UNIT());
			this.setM_CUR__CUR_NAME(struct.getM_CUR__CUR_NAME());
			this.setSYS_TYPE_VALUE__DISPLAY_NAME(struct.getSYS_TYPE_VALUE__DISPLAY_NAME());
			this.setT_RLSD_PUCH_ODR__RATE_JUDGE_DATE(struct.getT_RLSD_PUCH_ODR__RATE_JUDGE_DATE());
			this.setT_RLSD_PUCH_ODR__EXCH_RATE(struct.getT_RLSD_PUCH_ODR__EXCH_RATE());
			this.setT_RLSD_PUCH_ODR__PROCESSING_COST(struct.getT_RLSD_PUCH_ODR__PROCESSING_COST());
			this.setT_RLSD_PUCH_ODR__MATERIAL_COST(struct.getT_RLSD_PUCH_ODR__MATERIAL_COST());
			this.setT_RLSD_PUCH_ODR__OTHER_OVERHEADS(struct.getT_RLSD_PUCH_ODR__OTHER_OVERHEADS());
			this.setT_RLSD_PUCH_ODR__PUCH_ODR_COMMEN(struct.getT_RLSD_PUCH_ODR__PUCH_ODR_COMMEN());
			this.setM_PLANT__PLANT_NAME(struct.getM_PLANT__PLANT_NAME());
			this.setM_WH__WH_NAME(struct.getM_WH__WH_NAME());
			this.setM_PLANT__ZIP_CD(struct.getM_PLANT__ZIP_CD());
			this.setM_PLANT__ADDRESS_1(struct.getM_PLANT__ADDRESS_1());
			this.setM_PLANT__ADDRESS_2(struct.getM_PLANT__ADDRESS_2());
			this.setM_PLANT__TEL(struct.getM_PLANT__TEL());
			this.setUSER_MST__USER_NAME(struct.getUSER_MST__USER_NAME());
			this.setPUCH_ODR_SLIP_ISS_DATE(struct.getPUCH_ODR_SLIP_ISS_DATE());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setTIME_CTRL(struct.getTIME_CTRL());
			this.setl_COUNT(struct.getl_COUNT());
			this.setROW_COUNT(struct.getROW_COUNT());
			this.setwork_busDate(struct.getwork_busDate());
			this.setwork_ISS_DATE(struct.getwork_ISS_DATE());
			this.setPARTIAL_DELIV_SLIP_ISS_FLG(struct.getPARTIAL_DELIV_SLIP_ISS_FLG());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AE0030020Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_ReOutputFlag(struct.getList_ReOutputFlag());
			this.setList_PUCH_ODR_START_DATE(struct.getList_PUCH_ODR_START_DATE());
			this.setList_PUCH_ODR_DLV_DATE(struct.getList_PUCH_ODR_DLV_DATE());
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_r1_FILTER1(struct.getList_r1_FILTER1());
			this.setList_r2_FILTER1(struct.getList_r2_FILTER1());
			this.setList_r1_FILTER2(struct.getList_r1_FILTER2());
			this.setList_r2_FILTER2(struct.getList_r2_FILTER2());
			this.setList_PUCH_ODR_START_TIME(struct.getList_PUCH_ODR_START_TIME());
			this.setList_PUCH_ODR_DLV_TIME(struct.getList_PUCH_ODR_DLV_TIME());
			this.setList_r1_FILTER3(struct.getList_r1_FILTER3());
			this.setList_r2_FILTER3(struct.getList_r2_FILTER3());
			this.setList_l_PUCH_ODR_START_DATE(struct.getList_l_PUCH_ODR_START_DATE());
			this.setList_l_PUCH_ODR_DLV_DATE(struct.getList_l_PUCH_ODR_DLV_DATE());
			this.setList_l_VEND_CD(struct.getList_l_VEND_CD());
			this.setList_l_VEND_ANAME(struct.getList_l_VEND_ANAME());
			this.setList_l_ITEM_CD(struct.getList_l_ITEM_CD());
			this.setList_l_ITEM_NAME(struct.getList_l_ITEM_NAME());
			this.setList_l_PUCH_ODR_QTY(struct.getList_l_PUCH_ODR_QTY());
			this.setList_l_STOCK_UNIT(struct.getList_l_STOCK_UNIT());
			this.setList_l_PUCH_ODR_CD(struct.getList_l_PUCH_ODR_CD());
			this.setList_l_JOB_ODR_CD(struct.getList_l_JOB_ODR_CD());
			this.setList_l_PUCH_ODR_SLIP_ISS_DATE(struct.getList_l_PUCH_ODR_SLIP_ISS_DATE());
			this.setList_l_MODIFY_COUNT(struct.getList_l_MODIFY_COUNT());
			this.setList_l_PUCH_ODR_INST_SLIP_ISS_FLG(struct.getList_l_PUCH_ODR_INST_SLIP_ISS_FLG());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_PUCH_ODR_START_DATE_ALL(struct.getList_PUCH_ODR_START_DATE_ALL());
			this.setList_PUCH_ODR_DLV_DATE_ALL(struct.getList_PUCH_ODR_DLV_DATE_ALL());
			this.setList_PUCH_ODR_CD(struct.getList_PUCH_ODR_CD());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_PUCH_ODR_PERSON(struct.getList_PUCH_ODR_PERSON());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_PUCH_ODR_INST_SLIP_ISS_FLG(struct.getList_PUCH_ODR_INST_SLIP_ISS_FLG());
			this.setList_ODR_FORM_FLG(struct.getList_ODR_FORM_FLG());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_VEND_NAME(struct.getList_VEND_NAME());
			this.setList_USER_NAME(struct.getList_USER_NAME());
			this.setList_T_RLSD_PUCH_ODR__PUCH_ODR_CD(struct.getList_T_RLSD_PUCH_ODR__PUCH_ODR_CD());
			this.setList_SYS_DATE_CTRL__BUSINESS_OPR_DATE(struct.getList_SYS_DATE_CTRL__BUSINESS_OPR_DATE());
			this.setList_M_VEND_CTRL__VEND_NAME(struct.getList_M_VEND_CTRL__VEND_NAME());
			this.setList_M_VEND_CTRL__ZIP_CD(struct.getList_M_VEND_CTRL__ZIP_CD());
			this.setList_M_VEND_CTRL__ADDRESS_1(struct.getList_M_VEND_CTRL__ADDRESS_1());
			this.setList_M_VEND_CTRL__ADDRESS_2(struct.getList_M_VEND_CTRL__ADDRESS_2());
			this.setList_M_VEND_CTRL__VEND_ORG(struct.getList_M_VEND_CTRL__VEND_ORG());
			this.setList_M_VEND_CTRL__VEND_PERSON(struct.getList_M_VEND_CTRL__VEND_PERSON());
			this.setList_M_VEND_CTRL__TEL(struct.getList_M_VEND_CTRL__TEL());
			this.setList_M_VEND_CTRL__FAX(struct.getList_M_VEND_CTRL__FAX());
			this.setList_T_RLSD_PUCH_ODR__ITEM_CD(struct.getList_T_RLSD_PUCH_ODR__ITEM_CD());
			this.setList_M_ITEM__ITEM_NAME(struct.getList_M_ITEM__ITEM_NAME());
			this.setList_T_OD__JOB_ODR_CD(struct.getList_T_OD__JOB_ODR_CD());
			this.setList_T_RLSD_PUCH_ODR__PUCH_ODR_QTY(struct.getList_T_RLSD_PUCH_ODR__PUCH_ODR_QTY());
			this.setList_M_ITEM__STOCK_UNIT(struct.getList_M_ITEM__STOCK_UNIT());
			this.setList_PKG_QTY(struct.getList_PKG_QTY());
			this.setList_PKG_ODD_QTY(struct.getList_PKG_ODD_QTY());
			this.setList_M_ITEM__PKG_UNIT(struct.getList_M_ITEM__PKG_UNIT());
			this.setList_M_ITEM__STOCK_UNIT2(struct.getList_M_ITEM__STOCK_UNIT2());
			this.setList_T_RLSD_PUCH_ODR__PUCH_ODR_DLV_DA(struct.getList_T_RLSD_PUCH_ODR__PUCH_ODR_DLV_DA());
			this.setList_T_RLSD_PUCH_ODR__UNIT_COST(struct.getList_T_RLSD_PUCH_ODR__UNIT_COST());
			this.setList_M_CUR__VEND_CUR_UNIT(struct.getList_M_CUR__VEND_CUR_UNIT());
			this.setList_T_RLSD_PUCH_ODR__PUCH_ODR_AMOUNT(struct.getList_T_RLSD_PUCH_ODR__PUCH_ODR_AMOUNT());
			this.setList_T_RLSD_PUCH_ODR__DISC_AMOUNT(struct.getList_T_RLSD_PUCH_ODR__DISC_AMOUNT());
			this.setList_T_RLSD_PUCH_ODR__NET_AMOUNT(struct.getList_T_RLSD_PUCH_ODR__NET_AMOUNT());
			this.setList_TAX_AMOUNT(struct.getList_TAX_AMOUNT());
			this.setList_T_RLSD_PUCH_ODR__AMOUNT_INCLUDE_(struct.getList_T_RLSD_PUCH_ODR__AMOUNT_INCLUDE_());
			this.setList_T_RLSD_PUCH_ODR__HOME_CUR_AMOUNT(struct.getList_T_RLSD_PUCH_ODR__HOME_CUR_AMOUNT());
			this.setList_M_CUR__HOME_CUR_UNIT(struct.getList_M_CUR__HOME_CUR_UNIT());
			this.setList_M_CUR__CUR_NAME(struct.getList_M_CUR__CUR_NAME());
			this.setList_SYS_TYPE_VALUE__DISPLAY_NAME(struct.getList_SYS_TYPE_VALUE__DISPLAY_NAME());
			this.setList_T_RLSD_PUCH_ODR__RATE_JUDGE_DATE(struct.getList_T_RLSD_PUCH_ODR__RATE_JUDGE_DATE());
			this.setList_T_RLSD_PUCH_ODR__EXCH_RATE(struct.getList_T_RLSD_PUCH_ODR__EXCH_RATE());
			this.setList_T_RLSD_PUCH_ODR__PROCESSING_COST(struct.getList_T_RLSD_PUCH_ODR__PROCESSING_COST());
			this.setList_T_RLSD_PUCH_ODR__MATERIAL_COST(struct.getList_T_RLSD_PUCH_ODR__MATERIAL_COST());
			this.setList_T_RLSD_PUCH_ODR__OTHER_OVERHEADS(struct.getList_T_RLSD_PUCH_ODR__OTHER_OVERHEADS());
			this.setList_T_RLSD_PUCH_ODR__PUCH_ODR_COMMEN(struct.getList_T_RLSD_PUCH_ODR__PUCH_ODR_COMMEN());
			this.setList_M_PLANT__PLANT_NAME(struct.getList_M_PLANT__PLANT_NAME());
			this.setList_M_WH__WH_NAME(struct.getList_M_WH__WH_NAME());
			this.setList_M_PLANT__ZIP_CD(struct.getList_M_PLANT__ZIP_CD());
			this.setList_M_PLANT__ADDRESS_1(struct.getList_M_PLANT__ADDRESS_1());
			this.setList_M_PLANT__ADDRESS_2(struct.getList_M_PLANT__ADDRESS_2());
			this.setList_M_PLANT__TEL(struct.getList_M_PLANT__TEL());
			this.setList_USER_MST__USER_NAME(struct.getList_USER_MST__USER_NAME());
			this.setList_PUCH_ODR_SLIP_ISS_DATE(struct.getList_PUCH_ODR_SLIP_ISS_DATE());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_TIME_CTRL(struct.getList_TIME_CTRL());
			this.setList_l_COUNT(struct.getList_l_COUNT());
			this.setList_ROW_COUNT(struct.getList_ROW_COUNT());
			this.setList_work_busDate(struct.getList_work_busDate());
			this.setList_work_ISS_DATE(struct.getList_work_ISS_DATE());
			this.setList_PARTIAL_DELIV_SLIP_ISS_FLG(struct.getList_PARTIAL_DELIV_SLIP_ISS_FLG());
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
	// �� 1 �ϐ������l�F i_ReOutputFlag


	final static String i_ReOutputFlag = null;

	// �� 2 �ϐ������l�F i_PUCH_ODR_START_DATE


	final static String i_PUCH_ODR_START_DATE = null;

	// �� 3 �ϐ������l�F i_PUCH_ODR_DLV_DATE


	final static String i_PUCH_ODR_DLV_DATE = null;

	// �� 4 �ϐ������l�F i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// �� 5 �ϐ������l�F i_r1_FILTER1


	final static String i_r1_FILTER1 = null;

	// �� 6 �ϐ������l�F i_r2_FILTER1


	final static String i_r2_FILTER1 = null;

	// �� 7 �ϐ������l�F i_r1_FILTER2


	final static String i_r1_FILTER2 = null;

	// �� 8 �ϐ������l�F i_r2_FILTER2


	final static String i_r2_FILTER2 = null;

	// �� 9 �ϐ������l�F i_PUCH_ODR_START_TIME


	final static String i_PUCH_ODR_START_TIME = null;

	// �� 10 �ϐ������l�F i_PUCH_ODR_DLV_TIME


	final static String i_PUCH_ODR_DLV_TIME = null;

	// �� 11 �ϐ������l�F i_r1_FILTER3


	final static String i_r1_FILTER3 = null;

	// �� 12 �ϐ������l�F i_r2_FILTER3


	final static String i_r2_FILTER3 = null;

	// �� 13 �ϐ������l�F i_l_PUCH_ODR_START_DATE


	final static String i_l_PUCH_ODR_START_DATE = null;

	// �� 14 �ϐ������l�F i_l_PUCH_ODR_DLV_DATE


	final static String i_l_PUCH_ODR_DLV_DATE = null;

	// �� 15 �ϐ������l�F i_l_VEND_CD


	final static String i_l_VEND_CD = null;

	// �� 16 �ϐ������l�F i_l_VEND_ANAME


	final static String i_l_VEND_ANAME = null;

	// �� 17 �ϐ������l�F i_l_ITEM_CD


	final static String i_l_ITEM_CD = null;

	// �� 18 �ϐ������l�F i_l_ITEM_NAME


	final static String i_l_ITEM_NAME = null;

	// �� 19 �ϐ������l�F i_l_PUCH_ODR_QTY


	final static String i_l_PUCH_ODR_QTY = null;

	// �� 20 �ϐ������l�F i_l_STOCK_UNIT


	final static String i_l_STOCK_UNIT = null;

	// �� 21 �ϐ������l�F i_l_PUCH_ODR_CD


	final static String i_l_PUCH_ODR_CD = null;

	// �� 22 �ϐ������l�F i_l_JOB_ODR_CD


	final static String i_l_JOB_ODR_CD = null;

	// �� 23 �ϐ������l�F i_l_PUCH_ODR_SLIP_ISS_DATE


	final static String i_l_PUCH_ODR_SLIP_ISS_DATE = null;

	// �� 24 �ϐ������l�F i_l_MODIFY_COUNT


	final static String i_l_MODIFY_COUNT = null;

	// �� 25 �ϐ������l�F i_l_PUCH_ODR_INST_SLIP_ISS_FLG


	final static String i_l_PUCH_ODR_INST_SLIP_ISS_FLG = null;

	// �� 26 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 27 �ϐ������l�F i_PUCH_ODR_START_DATE_ALL


	final static String i_PUCH_ODR_START_DATE_ALL = null;

	// �� 28 �ϐ������l�F i_PUCH_ODR_DLV_DATE_ALL


	final static String i_PUCH_ODR_DLV_DATE_ALL = null;

	// �� 29 �ϐ������l�F i_PUCH_ODR_CD


	final static String i_PUCH_ODR_CD = null;

	// �� 30 �ϐ������l�F i_VEND_CD


	final static String i_VEND_CD = null;

	// �� 31 �ϐ������l�F i_PUCH_ODR_PERSON


	final static String i_PUCH_ODR_PERSON = null;

	// �� 32 �ϐ������l�F i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// �� 33 �ϐ������l�F i_PUCH_ODR_INST_SLIP_ISS_FLG


	final static String i_PUCH_ODR_INST_SLIP_ISS_FLG = null;

	// �� 34 �ϐ������l�F i_ODR_FORM_FLG


	final static String i_ODR_FORM_FLG = null;

	// �� 35 �ϐ������l�F i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// �� 36 �ϐ������l�F i_VEND_NAME


	final static String i_VEND_NAME = null;

	// �� 37 �ϐ������l�F i_USER_NAME


	final static String i_USER_NAME = null;

	// �� 38 �ϐ������l�F i_T_RLSD_PUCH_ODR__PUCH_ODR_CD


	final static String i_T_RLSD_PUCH_ODR__PUCH_ODR_CD = null;

	// �� 39 �ϐ������l�F i_SYS_DATE_CTRL__BUSINESS_OPR_DATE


	final static String i_SYS_DATE_CTRL__BUSINESS_OPR_DATE = null;

	// �� 40 �ϐ������l�F i_M_VEND_CTRL__VEND_NAME


	final static String i_M_VEND_CTRL__VEND_NAME = null;

	// �� 41 �ϐ������l�F i_M_VEND_CTRL__ZIP_CD


	final static String i_M_VEND_CTRL__ZIP_CD = null;

	// �� 42 �ϐ������l�F i_M_VEND_CTRL__ADDRESS_1


	final static String i_M_VEND_CTRL__ADDRESS_1 = null;

	// �� 43 �ϐ������l�F i_M_VEND_CTRL__ADDRESS_2


	final static String i_M_VEND_CTRL__ADDRESS_2 = null;

	// �� 44 �ϐ������l�F i_M_VEND_CTRL__VEND_ORG


	final static String i_M_VEND_CTRL__VEND_ORG = null;

	// �� 45 �ϐ������l�F i_M_VEND_CTRL__VEND_PERSON


	final static String i_M_VEND_CTRL__VEND_PERSON = null;

	// �� 46 �ϐ������l�F i_M_VEND_CTRL__TEL


	final static String i_M_VEND_CTRL__TEL = null;

	// �� 47 �ϐ������l�F i_M_VEND_CTRL__FAX


	final static String i_M_VEND_CTRL__FAX = null;

	// �� 48 �ϐ������l�F i_T_RLSD_PUCH_ODR__ITEM_CD


	final static String i_T_RLSD_PUCH_ODR__ITEM_CD = null;

	// �� 49 �ϐ������l�F i_M_ITEM__ITEM_NAME


	final static String i_M_ITEM__ITEM_NAME = null;

	// �� 50 �ϐ������l�F i_T_OD__JOB_ODR_CD


	final static String i_T_OD__JOB_ODR_CD = null;

	// �� 51 �ϐ������l�F i_T_RLSD_PUCH_ODR__PUCH_ODR_QTY


	final static String i_T_RLSD_PUCH_ODR__PUCH_ODR_QTY = null;

	// �� 52 �ϐ������l�F i_M_ITEM__STOCK_UNIT


	final static String i_M_ITEM__STOCK_UNIT = null;

	// �� 53 �ϐ������l�F i_PKG_QTY


	final static String i_PKG_QTY = null;

	// �� 54 �ϐ������l�F i_PKG_ODD_QTY


	final static String i_PKG_ODD_QTY = null;

	// �� 55 �ϐ������l�F i_M_ITEM__PKG_UNIT


	final static String i_M_ITEM__PKG_UNIT = null;

	// �� 56 �ϐ������l�F i_M_ITEM__STOCK_UNIT2


	final static String i_M_ITEM__STOCK_UNIT2 = null;

	// �� 57 �ϐ������l�F i_T_RLSD_PUCH_ODR__PUCH_ODR_DLV_DA


	final static String i_T_RLSD_PUCH_ODR__PUCH_ODR_DLV_DA = null;

	// �� 58 �ϐ������l�F i_T_RLSD_PUCH_ODR__UNIT_COST


	final static String i_T_RLSD_PUCH_ODR__UNIT_COST = null;

	// �� 59 �ϐ������l�F i_M_CUR__VEND_CUR_UNIT


	final static String i_M_CUR__VEND_CUR_UNIT = null;

	// �� 60 �ϐ������l�F i_T_RLSD_PUCH_ODR__PUCH_ODR_AMOUNT


	final static String i_T_RLSD_PUCH_ODR__PUCH_ODR_AMOUNT = null;

	// �� 61 �ϐ������l�F i_T_RLSD_PUCH_ODR__DISC_AMOUNT


	final static String i_T_RLSD_PUCH_ODR__DISC_AMOUNT = null;

	// �� 62 �ϐ������l�F i_T_RLSD_PUCH_ODR__NET_AMOUNT


	final static String i_T_RLSD_PUCH_ODR__NET_AMOUNT = null;

	// �� 63 �ϐ������l�F i_TAX_AMOUNT


	final static String i_TAX_AMOUNT = null;

	// �� 64 �ϐ������l�F i_T_RLSD_PUCH_ODR__AMOUNT_INCLUDE_


	final static String i_T_RLSD_PUCH_ODR__AMOUNT_INCLUDE_ = null;

	// �� 65 �ϐ������l�F i_T_RLSD_PUCH_ODR__HOME_CUR_AMOUNT


	final static String i_T_RLSD_PUCH_ODR__HOME_CUR_AMOUNT = null;

	// �� 66 �ϐ������l�F i_M_CUR__HOME_CUR_UNIT


	final static String i_M_CUR__HOME_CUR_UNIT = null;

	// �� 67 �ϐ������l�F i_M_CUR__CUR_NAME


	final static String i_M_CUR__CUR_NAME = null;

	// �� 68 �ϐ������l�F i_SYS_TYPE_VALUE__DISPLAY_NAME


	final static String i_SYS_TYPE_VALUE__DISPLAY_NAME = null;

	// �� 69 �ϐ������l�F i_T_RLSD_PUCH_ODR__RATE_JUDGE_DATE


	final static String i_T_RLSD_PUCH_ODR__RATE_JUDGE_DATE = null;

	// �� 70 �ϐ������l�F i_T_RLSD_PUCH_ODR__EXCH_RATE


	final static String i_T_RLSD_PUCH_ODR__EXCH_RATE = null;

	// �� 71 �ϐ������l�F i_T_RLSD_PUCH_ODR__PROCESSING_COST


	final static String i_T_RLSD_PUCH_ODR__PROCESSING_COST = null;

	// �� 72 �ϐ������l�F i_T_RLSD_PUCH_ODR__MATERIAL_COST


	final static String i_T_RLSD_PUCH_ODR__MATERIAL_COST = null;

	// �� 73 �ϐ������l�F i_T_RLSD_PUCH_ODR__OTHER_OVERHEADS


	final static String i_T_RLSD_PUCH_ODR__OTHER_OVERHEADS = null;

	// �� 74 �ϐ������l�F i_T_RLSD_PUCH_ODR__PUCH_ODR_COMMEN


	final static String i_T_RLSD_PUCH_ODR__PUCH_ODR_COMMEN = null;

	// �� 75 �ϐ������l�F i_M_PLANT__PLANT_NAME


	final static String i_M_PLANT__PLANT_NAME = null;

	// �� 76 �ϐ������l�F i_M_WH__WH_NAME


	final static String i_M_WH__WH_NAME = null;

	// �� 77 �ϐ������l�F i_M_PLANT__ZIP_CD


	final static String i_M_PLANT__ZIP_CD = null;

	// �� 78 �ϐ������l�F i_M_PLANT__ADDRESS_1


	final static String i_M_PLANT__ADDRESS_1 = null;

	// �� 79 �ϐ������l�F i_M_PLANT__ADDRESS_2


	final static String i_M_PLANT__ADDRESS_2 = null;

	// �� 80 �ϐ������l�F i_M_PLANT__TEL


	final static String i_M_PLANT__TEL = null;

	// �� 81 �ϐ������l�F i_USER_MST__USER_NAME


	final static String i_USER_MST__USER_NAME = null;

	// �� 82 �ϐ������l�F i_PUCH_ODR_SLIP_ISS_DATE


	final static String i_PUCH_ODR_SLIP_ISS_DATE = null;

	// �� 83 �ϐ������l�F i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// �� 84 �ϐ������l�F i_TIME_CTRL


	final static String i_TIME_CTRL = null;

	// �� 85 �ϐ������l�F i_l_COUNT


	final static String i_l_COUNT = null;

	// �� 86 �ϐ������l�F i_ROW_COUNT


	final static String i_ROW_COUNT = null;

	// �� 87 �ϐ������l�F i_work_busDate


	final static String i_work_busDate = null;

	// �� 88 �ϐ������l�F i_work_ISS_DATE


	final static String i_work_ISS_DATE = null;

	// �� 89 �ϐ������l�F i_PARTIAL_DELIV_SLIP_ISS_FLG


	final static String i_PARTIAL_DELIV_SLIP_ISS_FLG = null;

*/

	//{{user_implement_code
		// TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
		// �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
	// �� 1 �ϐ������l�F i_ReOutputFlag

	final static String i_ReOutputFlag = null;

	// �� 2 �ϐ������l�F i_PUCH_ODR_START_DATE

	final static String i_PUCH_ODR_START_DATE = null;

	// �� 3 �ϐ������l�F i_PUCH_ODR_DLV_DATE

	final static String i_PUCH_ODR_DLV_DATE = null;

	// �� 4 �ϐ������l�F i_DOWNLOAD_FILE

	final static String i_DOWNLOAD_FILE = null;

	// �� 5 �ϐ������l�F i_r1_FILTER1

	final static String i_r1_FILTER1 = null;

	// �� 6 �ϐ������l�F i_r2_FILTER1

	final static String i_r2_FILTER1 = null;

	// �� 7 �ϐ������l�F i_r1_FILTER2

	final static String i_r1_FILTER2 = null;

	// �� 8 �ϐ������l�F i_r2_FILTER2

	final static String i_r2_FILTER2 = null;

	// �� 9 �ϐ������l�F i_PUCH_ODR_START_TIME

	final static String i_PUCH_ODR_START_TIME = null;

	// �� 10 �ϐ������l�F i_PUCH_ODR_DLV_TIME

	final static String i_PUCH_ODR_DLV_TIME = null;

	// �� 11 �ϐ������l�F i_r1_FILTER3

	final static String i_r1_FILTER3 = null;

	// �� 12 �ϐ������l�F i_r2_FILTER3

	final static String i_r2_FILTER3 = null;

	// �� 13 �ϐ������l�F i_l_PUCH_ODR_START_DATE

	final static String i_l_PUCH_ODR_START_DATE = null;

	// �� 14 �ϐ������l�F i_l_PUCH_ODR_DLV_DATE

	final static String i_l_PUCH_ODR_DLV_DATE = null;

	// �� 15 �ϐ������l�F i_l_VEND_CD

	final static String i_l_VEND_CD = null;

	// �� 16 �ϐ������l�F i_l_VEND_ANAME

	final static String i_l_VEND_ANAME = null;

	// �� 17 �ϐ������l�F i_l_ITEM_CD

	final static String i_l_ITEM_CD = null;

	// �� 18 �ϐ������l�F i_l_ITEM_NAME

	final static String i_l_ITEM_NAME = null;

	// �� 19 �ϐ������l�F i_l_PUCH_ODR_QTY

	final static String i_l_PUCH_ODR_QTY = null;

	// �� 20 �ϐ������l�F i_l_STOCK_UNIT

	final static String i_l_STOCK_UNIT = null;

	// �� 21 �ϐ������l�F i_l_PUCH_ODR_CD

	final static String i_l_PUCH_ODR_CD = null;

	// �� 22 �ϐ������l�F i_l_JOB_ODR_CD

	final static String i_l_JOB_ODR_CD = null;

	// �� 23 �ϐ������l�F i_l_PUCH_ODR_SLIP_ISS_DATE

	final static String i_l_PUCH_ODR_SLIP_ISS_DATE = null;

	// �� 24 �ϐ������l�F i_l_MODIFY_COUNT

	final static String i_l_MODIFY_COUNT = null;

	// �� 25 �ϐ������l�F i_PLANT_CD

	final static String i_PLANT_CD = null;

	// �� 26 �ϐ������l�F i_PUCH_ODR_START_DATE_ALL

	final static String i_PUCH_ODR_START_DATE_ALL = null;

	// �� 27 �ϐ������l�F i_PUCH_ODR_DLV_DATE_ALL

	final static String i_PUCH_ODR_DLV_DATE_ALL = null;

	// �� 28 �ϐ������l�F i_PUCH_ODR_CD

	final static String i_PUCH_ODR_CD = null;

	// �� 29 �ϐ������l�F i_VEND_CD

	final static String i_VEND_CD = null;

	// �� 30 �ϐ������l�F i_PUCH_ODR_PERSON

	final static String i_PUCH_ODR_PERSON = null;

	// �� 31 �ϐ������l�F i_JOB_ODR_CD

	final static String i_JOB_ODR_CD = null;

	// �� 32 �ϐ������l�F i_PUCH_ODR_INST_SLIP_ISS_FLG

	final static String i_PUCH_ODR_INST_SLIP_ISS_FLG = null;

	// �� 33 �ϐ������l�F i_ODR_FORM_FLG

	final static String i_ODR_FORM_FLG = null;

	// �� 34 �ϐ������l�F i_PLANT_NAME

	final static String i_PLANT_NAME = null;

	// �� 35 �ϐ������l�F i_VEND_NAME

	final static String i_VEND_NAME = null;

	// �� 36 �ϐ������l�F i_USER_NAME

	final static String i_USER_NAME = null;

	// �� 37 �ϐ������l�F i_T_RLSD_PUCH_ODR__PUCH_ODR_CD

	final static String i_T_RLSD_PUCH_ODR__PUCH_ODR_CD = null;

	// �� 38 �ϐ������l�F i_SYS_DATE_CTRL__BUSINESS_OPR_DATE

	final static String i_SYS_DATE_CTRL__BUSINESS_OPR_DATE = null;

	// �� 39 �ϐ������l�F i_M_VEND_CTRL__VEND_NAME

	final static String i_M_VEND_CTRL__VEND_NAME = null;

	// �� 40 �ϐ������l�F i_M_VEND_CTRL__ZIP_CD

	final static String i_M_VEND_CTRL__ZIP_CD = null;

	// �� 41 �ϐ������l�F i_M_VEND_CTRL__ADDRESS_1

	final static String i_M_VEND_CTRL__ADDRESS_1 = null;

	// �� 42 �ϐ������l�F i_M_VEND_CTRL__ADDRESS_2

	final static String i_M_VEND_CTRL__ADDRESS_2 = null;

	// �� 43 �ϐ������l�F i_M_VEND_CTRL__VEND_ORG

	final static String i_M_VEND_CTRL__VEND_ORG = null;

	// �� 44 �ϐ������l�F i_M_VEND_CTRL__VEND_PERSON

	final static String i_M_VEND_CTRL__VEND_PERSON = null;

	// �� 45 �ϐ������l�F i_M_VEND_CTRL__TEL

	final static String i_M_VEND_CTRL__TEL = null;

	// �� 46 �ϐ������l�F i_M_VEND_CTRL__FAX

	final static String i_M_VEND_CTRL__FAX = null;

	// �� 47 �ϐ������l�F i_T_RLSD_PUCH_ODR__ITEM_CD

	final static String i_T_RLSD_PUCH_ODR__ITEM_CD = null;

	// �� 48 �ϐ������l�F i_M_ITEM__ITEM_NAME

	final static String i_M_ITEM__ITEM_NAME = null;

	// �� 49 �ϐ������l�F i_T_OD__JOB_ODR_CD

	final static String i_T_OD__JOB_ODR_CD = null;

	// �� 50 �ϐ������l�F i_T_RLSD_PUCH_ODR__PUCH_ODR_QTY

	final static String i_T_RLSD_PUCH_ODR__PUCH_ODR_QTY = null;

	// �� 51 �ϐ������l�F i_M_ITEM__STOCK_UNIT

	final static String i_M_ITEM__STOCK_UNIT = null;

	// �� 52 �ϐ������l�F i_PKG_QTY

	final static String i_PKG_QTY = null;

	// �� 53 �ϐ������l�F i_PKG_ODD_QTY

	final static String i_PKG_ODD_QTY = null;

	// �� 54 �ϐ������l�F i_M_ITEM__PKG_UNIT

	final static String i_M_ITEM__PKG_UNIT = null;

	// �� 55 �ϐ������l�F i_M_ITEM__STOCK_UNIT2

	final static String i_M_ITEM__STOCK_UNIT2 = null;

	// �� 56 �ϐ������l�F i_T_RLSD_PUCH_ODR__PUCH_ODR_DLV_DA

	final static String i_T_RLSD_PUCH_ODR__PUCH_ODR_DLV_DA = null;

	// �� 57 �ϐ������l�F i_T_RLSD_PUCH_ODR__UNIT_COST

	final static String i_T_RLSD_PUCH_ODR__UNIT_COST = null;

	// �� 58 �ϐ������l�F i_M_CUR__VEND_CUR_UNIT

	final static String i_M_CUR__VEND_CUR_UNIT = null;

	// �� 59 �ϐ������l�F i_T_RLSD_PUCH_ODR__PUCH_ODR_AMOUNT

	final static String i_T_RLSD_PUCH_ODR__PUCH_ODR_AMOUNT = null;

	// �� 60 �ϐ������l�F i_T_RLSD_PUCH_ODR__DISC_AMOUNT

	final static String i_T_RLSD_PUCH_ODR__DISC_AMOUNT = null;

	// �� 61 �ϐ������l�F i_T_RLSD_PUCH_ODR__NET_AMOUNT

	final static String i_T_RLSD_PUCH_ODR__NET_AMOUNT = null;

	// �� 62 �ϐ������l�F i_TAX_AMOUNT

	final static String i_TAX_AMOUNT = null;

	// �� 63 �ϐ������l�F i_T_RLSD_PUCH_ODR__AMOUNT_INCLUDE_

	final static String i_T_RLSD_PUCH_ODR__AMOUNT_INCLUDE_ = null;

	// �� 64 �ϐ������l�F i_T_RLSD_PUCH_ODR__HOME_CUR_AMOUNT

	final static String i_T_RLSD_PUCH_ODR__HOME_CUR_AMOUNT = null;

	// �� 65 �ϐ������l�F i_M_CUR__HOME_CUR_UNIT

	final static String i_M_CUR__HOME_CUR_UNIT = null;

	// �� 66 �ϐ������l�F i_M_CUR__CUR_NAME

	final static String i_M_CUR__CUR_NAME = null;

	// �� 67 �ϐ������l�F i_SYS_TYPE_VALUE__DISPLAY_NAME

	final static String i_SYS_TYPE_VALUE__DISPLAY_NAME = null;

	// �� 68 �ϐ������l�F i_T_RLSD_PUCH_ODR__RATE_JUDGE_DATE

	final static String i_T_RLSD_PUCH_ODR__RATE_JUDGE_DATE = null;

	// �� 69 �ϐ������l�F i_T_RLSD_PUCH_ODR__EXCH_RATE

	final static String i_T_RLSD_PUCH_ODR__EXCH_RATE = null;

	// �� 70 �ϐ������l�F i_T_RLSD_PUCH_ODR__PROCESSING_COST

	final static String i_T_RLSD_PUCH_ODR__PROCESSING_COST = null;

	// �� 71 �ϐ������l�F i_T_RLSD_PUCH_ODR__MATERIAL_COST

	final static String i_T_RLSD_PUCH_ODR__MATERIAL_COST = null;

	// �� 72 �ϐ������l�F i_T_RLSD_PUCH_ODR__OTHER_OVERHEADS

	final static String i_T_RLSD_PUCH_ODR__OTHER_OVERHEADS = null;

	// �� 73 �ϐ������l�F i_T_RLSD_PUCH_ODR__PUCH_ODR_COMMEN

	final static String i_T_RLSD_PUCH_ODR__PUCH_ODR_COMMEN = null;

	// �� 74 �ϐ������l�F i_M_PLANT__PLANT_NAME

	final static String i_M_PLANT__PLANT_NAME = null;

	// �� 75 �ϐ������l�F i_M_WH__WH_NAME

	final static String i_M_WH__WH_NAME = null;

	// �� 76 �ϐ������l�F i_M_PLANT__ZIP_CD

	final static String i_M_PLANT__ZIP_CD = null;

	// �� 77 �ϐ������l�F i_M_PLANT__ADDRESS_1

	final static String i_M_PLANT__ADDRESS_1 = null;

	// �� 78 �ϐ������l�F i_M_PLANT__ADDRESS_2

	final static String i_M_PLANT__ADDRESS_2 = null;

	// �� 79 �ϐ������l�F i_M_PLANT__TEL

	final static String i_M_PLANT__TEL = null;

	// �� 80 �ϐ������l�F i_USER_MST__USER_NAME

	final static String i_USER_MST__USER_NAME = null;

	// �� 81 �ϐ������l�F i_PUCH_ODR_SLIP_ISS_DATE

	final static String i_PUCH_ODR_SLIP_ISS_DATE = null;

	// �� 82 �ϐ������l�F i_MODIFY_COUNT

	final static String i_MODIFY_COUNT = null;

	// �� 83 �ϐ������l�F i_TIME_CTRL

	final static String i_TIME_CTRL = null;

	// �� 84 �ϐ������l�F i_l_COUNT

	final static String i_l_COUNT = null;

	// �� 85 �ϐ������l�F i_ROW_COUNT

	final static String i_ROW_COUNT = null;

	// �� 86 �ϐ������l�F i_work_busDate

	final static String i_work_busDate = null;

	// �� 87 �ϐ������l�F i_work_ISS_DATE

	final static String i_work_ISS_DATE = null;

	// �� 88 �ϐ������l�F i_PARTIAL_DELIV_SLIP_ISS_FLG

	final static String i_PARTIAL_DELIV_SLIP_ISS_FLG = null;


	/**
	 * ������
	 *
	 */
	public void initialize()
	{

		clear();

		m_ReOutputFlag = i_ReOutputFlag;
		m_PUCH_ODR_START_DATE = i_PUCH_ODR_START_DATE;
		m_PUCH_ODR_DLV_DATE = i_PUCH_ODR_DLV_DATE;
		m_DOWNLOAD_FILE = i_DOWNLOAD_FILE;
		m_r1_FILTER1 = i_r1_FILTER1;
		m_r2_FILTER1 = i_r2_FILTER1;
		m_r1_FILTER2 = i_r1_FILTER2;
		m_r2_FILTER2 = i_r2_FILTER2;
		m_PUCH_ODR_START_TIME = i_PUCH_ODR_START_TIME;
		m_PUCH_ODR_DLV_TIME = i_PUCH_ODR_DLV_TIME;
		m_r1_FILTER3 = i_r1_FILTER3;
		m_r2_FILTER3 = i_r2_FILTER3;
		m_l_PUCH_ODR_START_DATE = i_l_PUCH_ODR_START_DATE;
		m_l_PUCH_ODR_DLV_DATE = i_l_PUCH_ODR_DLV_DATE;
		m_l_VEND_CD = i_l_VEND_CD;
		m_l_VEND_ANAME = i_l_VEND_ANAME;
		m_l_ITEM_CD = i_l_ITEM_CD;
		m_l_ITEM_NAME = i_l_ITEM_NAME;
		m_l_PUCH_ODR_QTY = i_l_PUCH_ODR_QTY;
		m_l_STOCK_UNIT = i_l_STOCK_UNIT;
		m_l_PUCH_ODR_CD = i_l_PUCH_ODR_CD;
		m_l_JOB_ODR_CD = i_l_JOB_ODR_CD;
		m_l_PUCH_ODR_SLIP_ISS_DATE = i_l_PUCH_ODR_SLIP_ISS_DATE;
		m_l_MODIFY_COUNT = i_l_MODIFY_COUNT;
		m_PLANT_CD = i_PLANT_CD;
		m_PUCH_ODR_START_DATE_ALL = i_PUCH_ODR_START_DATE_ALL;
		m_PUCH_ODR_DLV_DATE_ALL = i_PUCH_ODR_DLV_DATE_ALL;
		m_PUCH_ODR_CD = i_PUCH_ODR_CD;
		m_VEND_CD = i_VEND_CD;
		m_PUCH_ODR_PERSON = i_PUCH_ODR_PERSON;
		m_JOB_ODR_CD = i_JOB_ODR_CD;
		m_PUCH_ODR_INST_SLIP_ISS_FLG = i_PUCH_ODR_INST_SLIP_ISS_FLG;
		m_ODR_FORM_FLG = i_ODR_FORM_FLG;
		m_PLANT_NAME = i_PLANT_NAME;
		m_VEND_NAME = i_VEND_NAME;
		m_USER_NAME = i_USER_NAME;
		m_T_RLSD_PUCH_ODR__PUCH_ODR_CD = i_T_RLSD_PUCH_ODR__PUCH_ODR_CD;
		m_SYS_DATE_CTRL__BUSINESS_OPR_DATE = i_SYS_DATE_CTRL__BUSINESS_OPR_DATE;
		m_M_VEND_CTRL__VEND_NAME = i_M_VEND_CTRL__VEND_NAME;
		m_M_VEND_CTRL__ZIP_CD = i_M_VEND_CTRL__ZIP_CD;
		m_M_VEND_CTRL__ADDRESS_1 = i_M_VEND_CTRL__ADDRESS_1;
		m_M_VEND_CTRL__ADDRESS_2 = i_M_VEND_CTRL__ADDRESS_2;
		m_M_VEND_CTRL__VEND_ORG = i_M_VEND_CTRL__VEND_ORG;
		m_M_VEND_CTRL__VEND_PERSON = i_M_VEND_CTRL__VEND_PERSON;
		m_M_VEND_CTRL__TEL = i_M_VEND_CTRL__TEL;
		m_M_VEND_CTRL__FAX = i_M_VEND_CTRL__FAX;
		m_T_RLSD_PUCH_ODR__ITEM_CD = i_T_RLSD_PUCH_ODR__ITEM_CD;
		m_M_ITEM__ITEM_NAME = i_M_ITEM__ITEM_NAME;
		m_T_OD__JOB_ODR_CD = i_T_OD__JOB_ODR_CD;
		m_T_RLSD_PUCH_ODR__PUCH_ODR_QTY = i_T_RLSD_PUCH_ODR__PUCH_ODR_QTY;
		m_M_ITEM__STOCK_UNIT = i_M_ITEM__STOCK_UNIT;
		m_PKG_QTY = i_PKG_QTY;
		m_PKG_ODD_QTY = i_PKG_ODD_QTY;
		m_M_ITEM__PKG_UNIT = i_M_ITEM__PKG_UNIT;
		m_M_ITEM__STOCK_UNIT2 = i_M_ITEM__STOCK_UNIT2;
		m_T_RLSD_PUCH_ODR__PUCH_ODR_DLV_DA = i_T_RLSD_PUCH_ODR__PUCH_ODR_DLV_DA;
		m_T_RLSD_PUCH_ODR__UNIT_COST = i_T_RLSD_PUCH_ODR__UNIT_COST;
		m_M_CUR__VEND_CUR_UNIT = i_M_CUR__VEND_CUR_UNIT;
		m_T_RLSD_PUCH_ODR__PUCH_ODR_AMOUNT = i_T_RLSD_PUCH_ODR__PUCH_ODR_AMOUNT;
		m_T_RLSD_PUCH_ODR__DISC_AMOUNT = i_T_RLSD_PUCH_ODR__DISC_AMOUNT;
		m_T_RLSD_PUCH_ODR__NET_AMOUNT = i_T_RLSD_PUCH_ODR__NET_AMOUNT;
		m_TAX_AMOUNT = i_TAX_AMOUNT;
		m_T_RLSD_PUCH_ODR__AMOUNT_INCLUDE_ = i_T_RLSD_PUCH_ODR__AMOUNT_INCLUDE_;
		m_T_RLSD_PUCH_ODR__HOME_CUR_AMOUNT = i_T_RLSD_PUCH_ODR__HOME_CUR_AMOUNT;
		m_M_CUR__HOME_CUR_UNIT = i_M_CUR__HOME_CUR_UNIT;
		m_M_CUR__CUR_NAME = i_M_CUR__CUR_NAME;
		m_SYS_TYPE_VALUE__DISPLAY_NAME = i_SYS_TYPE_VALUE__DISPLAY_NAME;
		m_T_RLSD_PUCH_ODR__RATE_JUDGE_DATE = i_T_RLSD_PUCH_ODR__RATE_JUDGE_DATE;
		m_T_RLSD_PUCH_ODR__EXCH_RATE = i_T_RLSD_PUCH_ODR__EXCH_RATE;
		m_T_RLSD_PUCH_ODR__PROCESSING_COST = i_T_RLSD_PUCH_ODR__PROCESSING_COST;
		m_T_RLSD_PUCH_ODR__MATERIAL_COST = i_T_RLSD_PUCH_ODR__MATERIAL_COST;
		m_T_RLSD_PUCH_ODR__OTHER_OVERHEADS = i_T_RLSD_PUCH_ODR__OTHER_OVERHEADS;
		m_T_RLSD_PUCH_ODR__PUCH_ODR_COMMEN = i_T_RLSD_PUCH_ODR__PUCH_ODR_COMMEN;
		m_M_PLANT__PLANT_NAME = i_M_PLANT__PLANT_NAME;
		m_M_WH__WH_NAME = i_M_WH__WH_NAME;
		m_M_PLANT__ZIP_CD = i_M_PLANT__ZIP_CD;
		m_M_PLANT__ADDRESS_1 = i_M_PLANT__ADDRESS_1;
		m_M_PLANT__ADDRESS_2 = i_M_PLANT__ADDRESS_2;
		m_M_PLANT__TEL = i_M_PLANT__TEL;
		m_USER_MST__USER_NAME = i_USER_MST__USER_NAME;
		m_PUCH_ODR_SLIP_ISS_DATE = i_PUCH_ODR_SLIP_ISS_DATE;
		m_MODIFY_COUNT = i_MODIFY_COUNT;
		m_TIME_CTRL = i_TIME_CTRL;
		m_l_COUNT = i_l_COUNT;
		m_ROW_COUNT = i_ROW_COUNT;
		m_work_busDate = i_work_busDate;
		m_work_ISS_DATE = i_work_ISS_DATE;
		m_PARTIAL_DELIV_SLIP_ISS_FLG = i_PARTIAL_DELIV_SLIP_ISS_FLG;
	}
		// TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
