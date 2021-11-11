/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0030/src/com/nec/jp/orteus/metamorBase/AE0030/AE0030010Struct.java,v $
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
//}}user_implement_code_header

public class AE0030010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_r1_FILTER1 */
	public String m_r1_FILTER1 = null;
	/** �� 2 �ϐ��F m_r2_FILTER1 */
	public String m_r2_FILTER1 = null;
	/** �� 3 �ϐ��F m_r1_FILTER2 */
	public String m_r1_FILTER2 = null;
	/** �� 4 �ϐ��F m_r2_FILTER2 */
	public String m_r2_FILTER2 = null;
	/** �� 5 �ϐ��F m_PUCH_ODR_START_TIME */
	public String m_PUCH_ODR_START_TIME = null;
	/** �� 6 �ϐ��F m_PUCH_ODR_DLV_TIME */
	public String m_PUCH_ODR_DLV_TIME = null;
	/** �� 7 �ϐ��F m_h_APR_PUR_INST */
	public String m_h_APR_PUR_INST = null;
	/** �� 8 �ϐ��F m_h_APPR_POWER_TYP */
	public String m_h_APPR_POWER_TYP = null;
	/** �� 9 �ϐ��F m_l_PUCH_ODR_START_DATE */
	public String m_l_PUCH_ODR_START_DATE = null;
	/** �� 10 �ϐ��F m_l_PUCH_ODR_DLV_DATE */
	public String m_l_PUCH_ODR_DLV_DATE = null;
	/** �� 11 �ϐ��F m_l_VEND_CD */
	public String m_l_VEND_CD = null;
	/** �� 12 �ϐ��F m_l_VEND_ANAME */
	public String m_l_VEND_ANAME = null;
	/** �� 13 �ϐ��F m_l_ITEM_CD */
	public String m_l_ITEM_CD = null;
	/** �� 14 �ϐ��F m_l_ITEM_NAME */
	public String m_l_ITEM_NAME = null;
	/** �� 15 �ϐ��F m_l_PUCH_ODR_QTY */
	public String m_l_PUCH_ODR_QTY = null;
	/** �� 16 �ϐ��F m_l_STOCK_UNIT */
	public String m_l_STOCK_UNIT = null;
	/** �� 17 �ϐ��F m_l_PUCH_ODR_CD */
	public String m_l_PUCH_ODR_CD = null;
	/** �� 18 �ϐ��F m_l_JOB_ODR_CD */
	public String m_l_JOB_ODR_CD = null;
	/** �� 19 �ϐ��F m_l_MODIFY_COUNT */
	public String m_l_MODIFY_COUNT = null;
	/** �� 20 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 21 �ϐ��F m_PUCH_ODR_START_DATE_ALL */
	public String m_PUCH_ODR_START_DATE_ALL = null;
	/** �� 22 �ϐ��F m_PUCH_ODR_DLV_DATE_ALL */
	public String m_PUCH_ODR_DLV_DATE_ALL = null;
	/** �� 23 �ϐ��F m_PUCH_ODR_CD */
	public String m_PUCH_ODR_CD = null;
	/** �� 24 �ϐ��F m_VEND_CD */
	public String m_VEND_CD = null;
	/** �� 25 �ϐ��F m_PUCH_ODR_PERSON */
	public String m_PUCH_ODR_PERSON = null;
	/** �� 26 �ϐ��F m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** �� 27 �ϐ��F m_DIRECT_FLG */
	public String m_DIRECT_FLG = null;
	/** �� 28 �ϐ��F m_OD_NO */
	public String m_OD_NO = null;
	/** �� 29 �ϐ��F m_PUCH_ODR_QTY */
	public String m_PUCH_ODR_QTY = null;
	/** �� 30 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 31 �ϐ��F m_PUCH_ODR_START_DATE */
	public String m_PUCH_ODR_START_DATE = null;
	/** �� 32 �ϐ��F m_PUCH_ODR_DLV_DATE */
	public String m_PUCH_ODR_DLV_DATE = null;
	/** �� 33 �ϐ��F m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** �� 34 �ϐ��F m_RATE_JUDGE_DATE */
	public String m_RATE_JUDGE_DATE = null;
	/** �� 35 �ϐ��F m_EXCH_RATE */
	public String m_EXCH_RATE = null;
	/** �� 36 �ϐ��F m_HOME_CUR_AMOUNT */
	public String m_HOME_CUR_AMOUNT = null;
	/** �� 37 �ϐ��F m_AMOUNT_INCLUDE_TAX */
	public String m_AMOUNT_INCLUDE_TAX = null;
	/** �� 38 �ϐ��F m_PUCH_ODR_INST_DATE */
	public String m_PUCH_ODR_INST_DATE = null;
	/** �� 39 �ϐ��F m_BUSINESS_OPR_DATE */
	public String m_BUSINESS_OPR_DATE = null;
	/** �� 40 �ϐ��F m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** �� 41 �ϐ��F m_VEND_NAME */
	public String m_VEND_NAME = null;
	/** �� 42 �ϐ��F m_USER_NAME */
	public String m_USER_NAME = null;
	/** �� 43 �ϐ��F m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** �� 44 �ϐ��F m_TIME_CTRL */
	public String m_TIME_CTRL = null;
	/** �� 45 �ϐ��F m_APPR_POWER_TYP */
	public String m_APPR_POWER_TYP = null;
	/** �� 46 �ϐ��F m_USER_CD */
	public String m_USER_CD = null;
	/** �� 47 �ϐ��F m_APPR_ID */
	public String m_APPR_ID = null;
	/** �� 48 �ϐ��F m_JF_INSTALL_FLG */
	public String m_JF_INSTALL_FLG = null;
	/** �� 49 �ϐ��F m_l_COUNT */
	public String m_l_COUNT = null;
	/** �� 50 �ϐ��F m_ROW_COUNT */
	public String m_ROW_COUNT = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_r1_FILTER1 */
	public List l_r1_FILTER1 = null;

	/** �� 2 List�ϐ��F l_r2_FILTER1 */
	public List l_r2_FILTER1 = null;

	/** �� 3 List�ϐ��F l_r1_FILTER2 */
	public List l_r1_FILTER2 = null;

	/** �� 4 List�ϐ��F l_r2_FILTER2 */
	public List l_r2_FILTER2 = null;

	/** �� 5 List�ϐ��F l_PUCH_ODR_START_TIME */
	public List l_PUCH_ODR_START_TIME = null;

	/** �� 6 List�ϐ��F l_PUCH_ODR_DLV_TIME */
	public List l_PUCH_ODR_DLV_TIME = null;

	/** �� 7 List�ϐ��F l_h_APR_PUR_INST */
	public List l_h_APR_PUR_INST = null;

	/** �� 8 List�ϐ��F l_h_APPR_POWER_TYP */
	public List l_h_APPR_POWER_TYP = null;

	/** �� 9 List�ϐ��F l_l_PUCH_ODR_START_DATE */
	public List l_l_PUCH_ODR_START_DATE = null;

	/** �� 10 List�ϐ��F l_l_PUCH_ODR_DLV_DATE */
	public List l_l_PUCH_ODR_DLV_DATE = null;

	/** �� 11 List�ϐ��F l_l_VEND_CD */
	public List l_l_VEND_CD = null;

	/** �� 12 List�ϐ��F l_l_VEND_ANAME */
	public List l_l_VEND_ANAME = null;

	/** �� 13 List�ϐ��F l_l_ITEM_CD */
	public List l_l_ITEM_CD = null;

	/** �� 14 List�ϐ��F l_l_ITEM_NAME */
	public List l_l_ITEM_NAME = null;

	/** �� 15 List�ϐ��F l_l_PUCH_ODR_QTY */
	public List l_l_PUCH_ODR_QTY = null;

	/** �� 16 List�ϐ��F l_l_STOCK_UNIT */
	public List l_l_STOCK_UNIT = null;

	/** �� 17 List�ϐ��F l_l_PUCH_ODR_CD */
	public List l_l_PUCH_ODR_CD = null;

	/** �� 18 List�ϐ��F l_l_JOB_ODR_CD */
	public List l_l_JOB_ODR_CD = null;

	/** �� 19 List�ϐ��F l_l_MODIFY_COUNT */
	public List l_l_MODIFY_COUNT = null;

	/** �� 20 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 21 List�ϐ��F l_PUCH_ODR_START_DATE_ALL */
	public List l_PUCH_ODR_START_DATE_ALL = null;

	/** �� 22 List�ϐ��F l_PUCH_ODR_DLV_DATE_ALL */
	public List l_PUCH_ODR_DLV_DATE_ALL = null;

	/** �� 23 List�ϐ��F l_PUCH_ODR_CD */
	public List l_PUCH_ODR_CD = null;

	/** �� 24 List�ϐ��F l_VEND_CD */
	public List l_VEND_CD = null;

	/** �� 25 List�ϐ��F l_PUCH_ODR_PERSON */
	public List l_PUCH_ODR_PERSON = null;

	/** �� 26 List�ϐ��F l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** �� 27 List�ϐ��F l_DIRECT_FLG */
	public List l_DIRECT_FLG = null;

	/** �� 28 List�ϐ��F l_OD_NO */
	public List l_OD_NO = null;

	/** �� 29 List�ϐ��F l_PUCH_ODR_QTY */
	public List l_PUCH_ODR_QTY = null;

	/** �� 30 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 31 List�ϐ��F l_PUCH_ODR_START_DATE */
	public List l_PUCH_ODR_START_DATE = null;

	/** �� 32 List�ϐ��F l_PUCH_ODR_DLV_DATE */
	public List l_PUCH_ODR_DLV_DATE = null;

	/** �� 33 List�ϐ��F l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** �� 34 List�ϐ��F l_RATE_JUDGE_DATE */
	public List l_RATE_JUDGE_DATE = null;

	/** �� 35 List�ϐ��F l_EXCH_RATE */
	public List l_EXCH_RATE = null;

	/** �� 36 List�ϐ��F l_HOME_CUR_AMOUNT */
	public List l_HOME_CUR_AMOUNT = null;

	/** �� 37 List�ϐ��F l_AMOUNT_INCLUDE_TAX */
	public List l_AMOUNT_INCLUDE_TAX = null;

	/** �� 38 List�ϐ��F l_PUCH_ODR_INST_DATE */
	public List l_PUCH_ODR_INST_DATE = null;

	/** �� 39 List�ϐ��F l_BUSINESS_OPR_DATE */
	public List l_BUSINESS_OPR_DATE = null;

	/** �� 40 List�ϐ��F l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** �� 41 List�ϐ��F l_VEND_NAME */
	public List l_VEND_NAME = null;

	/** �� 42 List�ϐ��F l_USER_NAME */
	public List l_USER_NAME = null;

	/** �� 43 List�ϐ��F l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** �� 44 List�ϐ��F l_TIME_CTRL */
	public List l_TIME_CTRL = null;

	/** �� 45 List�ϐ��F l_APPR_POWER_TYP */
	public List l_APPR_POWER_TYP = null;

	/** �� 46 List�ϐ��F l_USER_CD */
	public List l_USER_CD = null;

	/** �� 47 List�ϐ��F l_APPR_ID */
	public List l_APPR_ID = null;

	/** �� 48 List�ϐ��F l_JF_INSTALL_FLG */
	public List l_JF_INSTALL_FLG = null;

	/** �� 49 List�ϐ��F l_l_COUNT */
	public List l_l_COUNT = null;

	/** �� 50 List�ϐ��F l_ROW_COUNT */
	public List l_ROW_COUNT = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getr1_FILTER1() { return m_r1_FILTER1; }
	public String getr2_FILTER1() { return m_r2_FILTER1; }
	public String getr1_FILTER2() { return m_r1_FILTER2; }
	public String getr2_FILTER2() { return m_r2_FILTER2; }
	public String getPUCH_ODR_START_TIME() { return m_PUCH_ODR_START_TIME; }
	public String getPUCH_ODR_DLV_TIME() { return m_PUCH_ODR_DLV_TIME; }
	public String geth_APR_PUR_INST() { return m_h_APR_PUR_INST; }
	public String geth_APPR_POWER_TYP() { return m_h_APPR_POWER_TYP; }
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
	public String getl_MODIFY_COUNT() { return m_l_MODIFY_COUNT; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getPUCH_ODR_START_DATE_ALL() { return m_PUCH_ODR_START_DATE_ALL; }
	public String getPUCH_ODR_DLV_DATE_ALL() { return m_PUCH_ODR_DLV_DATE_ALL; }
	public String getPUCH_ODR_CD() { return m_PUCH_ODR_CD; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getPUCH_ODR_PERSON() { return m_PUCH_ODR_PERSON; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getDIRECT_FLG() { return m_DIRECT_FLG; }
	public String getOD_NO() { return m_OD_NO; }
	public String getPUCH_ODR_QTY() { return m_PUCH_ODR_QTY; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getPUCH_ODR_START_DATE() { return m_PUCH_ODR_START_DATE; }
	public String getPUCH_ODR_DLV_DATE() { return m_PUCH_ODR_DLV_DATE; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getRATE_JUDGE_DATE() { return m_RATE_JUDGE_DATE; }
	public String getEXCH_RATE() { return m_EXCH_RATE; }
	public String getHOME_CUR_AMOUNT() { return m_HOME_CUR_AMOUNT; }
	public String getAMOUNT_INCLUDE_TAX() { return m_AMOUNT_INCLUDE_TAX; }
	public String getPUCH_ODR_INST_DATE() { return m_PUCH_ODR_INST_DATE; }
	public String getBUSINESS_OPR_DATE() { return m_BUSINESS_OPR_DATE; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getVEND_NAME() { return m_VEND_NAME; }
	public String getUSER_NAME() { return m_USER_NAME; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getTIME_CTRL() { return m_TIME_CTRL; }
	public String getAPPR_POWER_TYP() { return m_APPR_POWER_TYP; }
	public String getUSER_CD() { return m_USER_CD; }
	public String getAPPR_ID() { return m_APPR_ID; }
	public String getJF_INSTALL_FLG() { return m_JF_INSTALL_FLG; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }

	public List getList_r1_FILTER1() { return l_r1_FILTER1; }
	public List getList_r2_FILTER1() { return l_r2_FILTER1; }
	public List getList_r1_FILTER2() { return l_r1_FILTER2; }
	public List getList_r2_FILTER2() { return l_r2_FILTER2; }
	public List getList_PUCH_ODR_START_TIME() { return l_PUCH_ODR_START_TIME; }
	public List getList_PUCH_ODR_DLV_TIME() { return l_PUCH_ODR_DLV_TIME; }
	public List getList_h_APR_PUR_INST() { return l_h_APR_PUR_INST; }
	public List getList_h_APPR_POWER_TYP() { return l_h_APPR_POWER_TYP; }
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
	public List getList_l_MODIFY_COUNT() { return l_l_MODIFY_COUNT; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_PUCH_ODR_START_DATE_ALL() { return l_PUCH_ODR_START_DATE_ALL; }
	public List getList_PUCH_ODR_DLV_DATE_ALL() { return l_PUCH_ODR_DLV_DATE_ALL; }
	public List getList_PUCH_ODR_CD() { return l_PUCH_ODR_CD; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_PUCH_ODR_PERSON() { return l_PUCH_ODR_PERSON; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_DIRECT_FLG() { return l_DIRECT_FLG; }
	public List getList_OD_NO() { return l_OD_NO; }
	public List getList_PUCH_ODR_QTY() { return l_PUCH_ODR_QTY; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_PUCH_ODR_START_DATE() { return l_PUCH_ODR_START_DATE; }
	public List getList_PUCH_ODR_DLV_DATE() { return l_PUCH_ODR_DLV_DATE; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_RATE_JUDGE_DATE() { return l_RATE_JUDGE_DATE; }
	public List getList_EXCH_RATE() { return l_EXCH_RATE; }
	public List getList_HOME_CUR_AMOUNT() { return l_HOME_CUR_AMOUNT; }
	public List getList_AMOUNT_INCLUDE_TAX() { return l_AMOUNT_INCLUDE_TAX; }
	public List getList_PUCH_ODR_INST_DATE() { return l_PUCH_ODR_INST_DATE; }
	public List getList_BUSINESS_OPR_DATE() { return l_BUSINESS_OPR_DATE; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_VEND_NAME() { return l_VEND_NAME; }
	public List getList_USER_NAME() { return l_USER_NAME; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_TIME_CTRL() { return l_TIME_CTRL; }
	public List getList_APPR_POWER_TYP() { return l_APPR_POWER_TYP; }
	public List getList_USER_CD() { return l_USER_CD; }
	public List getList_APPR_ID() { return l_APPR_ID; }
	public List getList_JF_INSTALL_FLG() { return l_JF_INSTALL_FLG; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }

	public void setr1_FILTER1(String val) { m_r1_FILTER1 = val; }
	public void setr2_FILTER1(String val) { m_r2_FILTER1 = val; }
	public void setr1_FILTER2(String val) { m_r1_FILTER2 = val; }
	public void setr2_FILTER2(String val) { m_r2_FILTER2 = val; }
	public void setPUCH_ODR_START_TIME(String val) { m_PUCH_ODR_START_TIME = val; }
	public void setPUCH_ODR_DLV_TIME(String val) { m_PUCH_ODR_DLV_TIME = val; }
	public void seth_APR_PUR_INST(String val) { m_h_APR_PUR_INST = val; }
	public void seth_APPR_POWER_TYP(String val) { m_h_APPR_POWER_TYP = val; }
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
	public void setl_MODIFY_COUNT(String val) { m_l_MODIFY_COUNT = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setPUCH_ODR_START_DATE_ALL(String val) { m_PUCH_ODR_START_DATE_ALL = val; }
	public void setPUCH_ODR_DLV_DATE_ALL(String val) { m_PUCH_ODR_DLV_DATE_ALL = val; }
	public void setPUCH_ODR_CD(String val) { m_PUCH_ODR_CD = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void setPUCH_ODR_PERSON(String val) { m_PUCH_ODR_PERSON = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setDIRECT_FLG(String val) { m_DIRECT_FLG = val; }
	public void setOD_NO(String val) { m_OD_NO = val; }
	public void setPUCH_ODR_QTY(String val) { m_PUCH_ODR_QTY = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setPUCH_ODR_START_DATE(String val) { m_PUCH_ODR_START_DATE = val; }
	public void setPUCH_ODR_DLV_DATE(String val) { m_PUCH_ODR_DLV_DATE = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setRATE_JUDGE_DATE(String val) { m_RATE_JUDGE_DATE = val; }
	public void setEXCH_RATE(String val) { m_EXCH_RATE = val; }
	public void setHOME_CUR_AMOUNT(String val) { m_HOME_CUR_AMOUNT = val; }
	public void setAMOUNT_INCLUDE_TAX(String val) { m_AMOUNT_INCLUDE_TAX = val; }
	public void setPUCH_ODR_INST_DATE(String val) { m_PUCH_ODR_INST_DATE = val; }
	public void setBUSINESS_OPR_DATE(String val) { m_BUSINESS_OPR_DATE = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setVEND_NAME(String val) { m_VEND_NAME = val; }
	public void setUSER_NAME(String val) { m_USER_NAME = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setTIME_CTRL(String val) { m_TIME_CTRL = val; }
	public void setAPPR_POWER_TYP(String val) { m_APPR_POWER_TYP = val; }
	public void setUSER_CD(String val) { m_USER_CD = val; }
	public void setAPPR_ID(String val) { m_APPR_ID = val; }
	public void setJF_INSTALL_FLG(String val) { m_JF_INSTALL_FLG = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }


	public void setList_r1_FILTER1(List list) { l_r1_FILTER1 = list; }
	public void setList_r2_FILTER1(List list) { l_r2_FILTER1 = list; }
	public void setList_r1_FILTER2(List list) { l_r1_FILTER2 = list; }
	public void setList_r2_FILTER2(List list) { l_r2_FILTER2 = list; }
	public void setList_PUCH_ODR_START_TIME(List list) { l_PUCH_ODR_START_TIME = list; }
	public void setList_PUCH_ODR_DLV_TIME(List list) { l_PUCH_ODR_DLV_TIME = list; }
	public void setList_h_APR_PUR_INST(List list) { l_h_APR_PUR_INST = list; }
	public void setList_h_APPR_POWER_TYP(List list) { l_h_APPR_POWER_TYP = list; }
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
	public void setList_l_MODIFY_COUNT(List list) { l_l_MODIFY_COUNT = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_PUCH_ODR_START_DATE_ALL(List list) { l_PUCH_ODR_START_DATE_ALL = list; }
	public void setList_PUCH_ODR_DLV_DATE_ALL(List list) { l_PUCH_ODR_DLV_DATE_ALL = list; }
	public void setList_PUCH_ODR_CD(List list) { l_PUCH_ODR_CD = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_PUCH_ODR_PERSON(List list) { l_PUCH_ODR_PERSON = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_DIRECT_FLG(List list) { l_DIRECT_FLG = list; }
	public void setList_OD_NO(List list) { l_OD_NO = list; }
	public void setList_PUCH_ODR_QTY(List list) { l_PUCH_ODR_QTY = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_PUCH_ODR_START_DATE(List list) { l_PUCH_ODR_START_DATE = list; }
	public void setList_PUCH_ODR_DLV_DATE(List list) { l_PUCH_ODR_DLV_DATE = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_RATE_JUDGE_DATE(List list) { l_RATE_JUDGE_DATE = list; }
	public void setList_EXCH_RATE(List list) { l_EXCH_RATE = list; }
	public void setList_HOME_CUR_AMOUNT(List list) { l_HOME_CUR_AMOUNT = list; }
	public void setList_AMOUNT_INCLUDE_TAX(List list) { l_AMOUNT_INCLUDE_TAX = list; }
	public void setList_PUCH_ODR_INST_DATE(List list) { l_PUCH_ODR_INST_DATE = list; }
	public void setList_BUSINESS_OPR_DATE(List list) { l_BUSINESS_OPR_DATE = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_VEND_NAME(List list) { l_VEND_NAME = list; }
	public void setList_USER_NAME(List list) { l_USER_NAME = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_TIME_CTRL(List list) { l_TIME_CTRL = list; }
	public void setList_APPR_POWER_TYP(List list) { l_APPR_POWER_TYP = list; }
	public void setList_USER_CD(List list) { l_USER_CD = list; }
	public void setList_APPR_ID(List list) { l_APPR_ID = list; }
	public void setList_JF_INSTALL_FLG(List list) { l_JF_INSTALL_FLG = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }

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
			l_r1_FILTER1.add(((AE0030010Struct) list.get(i)).getr1_FILTER1());
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
			l_r2_FILTER1.add(((AE0030010Struct) list.get(i)).getr2_FILTER1());
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
			l_r1_FILTER2.add(((AE0030010Struct) list.get(i)).getr1_FILTER2());
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
			l_r2_FILTER2.add(((AE0030010Struct) list.get(i)).getr2_FILTER2());
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
			l_PUCH_ODR_START_TIME.add(((AE0030010Struct) list.get(i)).getPUCH_ODR_START_TIME());
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
			l_PUCH_ODR_DLV_TIME.add(((AE0030010Struct) list.get(i)).getPUCH_ODR_DLV_TIME());
		}
		return size;
	}
	public int setL2L_h_APR_PUR_INST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_APR_PUR_INST == null) {
			l_h_APR_PUR_INST = new ArrayList();
		} else {
			l_h_APR_PUR_INST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_APR_PUR_INST.add(((AE0030010Struct) list.get(i)).geth_APR_PUR_INST());
		}
		return size;
	}
	public int setL2L_h_APPR_POWER_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_APPR_POWER_TYP == null) {
			l_h_APPR_POWER_TYP = new ArrayList();
		} else {
			l_h_APPR_POWER_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_APPR_POWER_TYP.add(((AE0030010Struct) list.get(i)).geth_APPR_POWER_TYP());
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
			l_l_PUCH_ODR_START_DATE.add(((AE0030010Struct) list.get(i)).getl_PUCH_ODR_START_DATE());
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
			l_l_PUCH_ODR_DLV_DATE.add(((AE0030010Struct) list.get(i)).getl_PUCH_ODR_DLV_DATE());
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
			l_l_VEND_CD.add(((AE0030010Struct) list.get(i)).getl_VEND_CD());
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
			l_l_VEND_ANAME.add(((AE0030010Struct) list.get(i)).getl_VEND_ANAME());
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
			l_l_ITEM_CD.add(((AE0030010Struct) list.get(i)).getl_ITEM_CD());
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
			l_l_ITEM_NAME.add(((AE0030010Struct) list.get(i)).getl_ITEM_NAME());
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
			l_l_PUCH_ODR_QTY.add(((AE0030010Struct) list.get(i)).getl_PUCH_ODR_QTY());
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
			l_l_STOCK_UNIT.add(((AE0030010Struct) list.get(i)).getl_STOCK_UNIT());
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
			l_l_PUCH_ODR_CD.add(((AE0030010Struct) list.get(i)).getl_PUCH_ODR_CD());
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
			l_l_JOB_ODR_CD.add(((AE0030010Struct) list.get(i)).getl_JOB_ODR_CD());
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
			l_l_MODIFY_COUNT.add(((AE0030010Struct) list.get(i)).getl_MODIFY_COUNT());
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
			l_PLANT_CD.add(((AE0030010Struct) list.get(i)).getPLANT_CD());
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
			l_PUCH_ODR_START_DATE_ALL.add(((AE0030010Struct) list.get(i)).getPUCH_ODR_START_DATE_ALL());
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
			l_PUCH_ODR_DLV_DATE_ALL.add(((AE0030010Struct) list.get(i)).getPUCH_ODR_DLV_DATE_ALL());
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
			l_PUCH_ODR_CD.add(((AE0030010Struct) list.get(i)).getPUCH_ODR_CD());
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
			l_VEND_CD.add(((AE0030010Struct) list.get(i)).getVEND_CD());
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
			l_PUCH_ODR_PERSON.add(((AE0030010Struct) list.get(i)).getPUCH_ODR_PERSON());
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
			l_JOB_ODR_CD.add(((AE0030010Struct) list.get(i)).getJOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_DIRECT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DIRECT_FLG == null) {
			l_DIRECT_FLG = new ArrayList();
		} else {
			l_DIRECT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DIRECT_FLG.add(((AE0030010Struct) list.get(i)).getDIRECT_FLG());
		}
		return size;
	}
	public int setL2L_OD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OD_NO == null) {
			l_OD_NO = new ArrayList();
		} else {
			l_OD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OD_NO.add(((AE0030010Struct) list.get(i)).getOD_NO());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_QTY == null) {
			l_PUCH_ODR_QTY = new ArrayList();
		} else {
			l_PUCH_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_QTY.add(((AE0030010Struct) list.get(i)).getPUCH_ODR_QTY());
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
			l_ITEM_CD.add(((AE0030010Struct) list.get(i)).getITEM_CD());
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
			l_PUCH_ODR_START_DATE.add(((AE0030010Struct) list.get(i)).getPUCH_ODR_START_DATE());
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
			l_PUCH_ODR_DLV_DATE.add(((AE0030010Struct) list.get(i)).getPUCH_ODR_DLV_DATE());
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
			l_COMPANY_CD.add(((AE0030010Struct) list.get(i)).getCOMPANY_CD());
		}
		return size;
	}
	public int setL2L_RATE_JUDGE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RATE_JUDGE_DATE == null) {
			l_RATE_JUDGE_DATE = new ArrayList();
		} else {
			l_RATE_JUDGE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RATE_JUDGE_DATE.add(((AE0030010Struct) list.get(i)).getRATE_JUDGE_DATE());
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
			l_EXCH_RATE.add(((AE0030010Struct) list.get(i)).getEXCH_RATE());
		}
		return size;
	}
	public int setL2L_HOME_CUR_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HOME_CUR_AMOUNT == null) {
			l_HOME_CUR_AMOUNT = new ArrayList();
		} else {
			l_HOME_CUR_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HOME_CUR_AMOUNT.add(((AE0030010Struct) list.get(i)).getHOME_CUR_AMOUNT());
		}
		return size;
	}
	public int setL2L_AMOUNT_INCLUDE_TAX(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_AMOUNT_INCLUDE_TAX == null) {
			l_AMOUNT_INCLUDE_TAX = new ArrayList();
		} else {
			l_AMOUNT_INCLUDE_TAX.clear();
		}
		for (int i = 0; i < size; i++) {
			l_AMOUNT_INCLUDE_TAX.add(((AE0030010Struct) list.get(i)).getAMOUNT_INCLUDE_TAX());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_INST_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_INST_DATE == null) {
			l_PUCH_ODR_INST_DATE = new ArrayList();
		} else {
			l_PUCH_ODR_INST_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_INST_DATE.add(((AE0030010Struct) list.get(i)).getPUCH_ODR_INST_DATE());
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
			l_BUSINESS_OPR_DATE.add(((AE0030010Struct) list.get(i)).getBUSINESS_OPR_DATE());
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
			l_PLANT_NAME.add(((AE0030010Struct) list.get(i)).getPLANT_NAME());
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
			l_VEND_NAME.add(((AE0030010Struct) list.get(i)).getVEND_NAME());
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
			l_USER_NAME.add(((AE0030010Struct) list.get(i)).getUSER_NAME());
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
			l_MODIFY_COUNT.add(((AE0030010Struct) list.get(i)).getMODIFY_COUNT());
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
			l_TIME_CTRL.add(((AE0030010Struct) list.get(i)).getTIME_CTRL());
		}
		return size;
	}
	public int setL2L_APPR_POWER_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_APPR_POWER_TYP == null) {
			l_APPR_POWER_TYP = new ArrayList();
		} else {
			l_APPR_POWER_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_APPR_POWER_TYP.add(((AE0030010Struct) list.get(i)).getAPPR_POWER_TYP());
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
			l_USER_CD.add(((AE0030010Struct) list.get(i)).getUSER_CD());
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
			l_APPR_ID.add(((AE0030010Struct) list.get(i)).getAPPR_ID());
		}
		return size;
	}
	public int setL2L_JF_INSTALL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JF_INSTALL_FLG == null) {
			l_JF_INSTALL_FLG = new ArrayList();
		} else {
			l_JF_INSTALL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JF_INSTALL_FLG.add(((AE0030010Struct) list.get(i)).getJF_INSTALL_FLG());
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
			l_l_COUNT.add(((AE0030010Struct) list.get(i)).getl_COUNT());
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
			l_ROW_COUNT.add(((AE0030010Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_r1_FILTER1 = null;
		m_r2_FILTER1 = null;
		m_r1_FILTER2 = null;
		m_r2_FILTER2 = null;
		m_PUCH_ODR_START_TIME = null;
		m_PUCH_ODR_DLV_TIME = null;
		m_h_APR_PUR_INST = null;
		m_h_APPR_POWER_TYP = null;
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
		m_l_MODIFY_COUNT = null;
		m_PLANT_CD = null;
		m_PUCH_ODR_START_DATE_ALL = null;
		m_PUCH_ODR_DLV_DATE_ALL = null;
		m_PUCH_ODR_CD = null;
		m_VEND_CD = null;
		m_PUCH_ODR_PERSON = null;
		m_JOB_ODR_CD = null;
		m_DIRECT_FLG = null;
		m_OD_NO = null;
		m_PUCH_ODR_QTY = null;
		m_ITEM_CD = null;
		m_PUCH_ODR_START_DATE = null;
		m_PUCH_ODR_DLV_DATE = null;
		m_COMPANY_CD = null;
		m_RATE_JUDGE_DATE = null;
		m_EXCH_RATE = null;
		m_HOME_CUR_AMOUNT = null;
		m_AMOUNT_INCLUDE_TAX = null;
		m_PUCH_ODR_INST_DATE = null;
		m_BUSINESS_OPR_DATE = null;
		m_PLANT_NAME = null;
		m_VEND_NAME = null;
		m_USER_NAME = null;
		m_MODIFY_COUNT = null;
		m_TIME_CTRL = null;
		m_APPR_POWER_TYP = null;
		m_USER_CD = null;
		m_APPR_ID = null;
		m_JF_INSTALL_FLG = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;

		l_r1_FILTER1 = null;
		l_r2_FILTER1 = null;
		l_r1_FILTER2 = null;
		l_r2_FILTER2 = null;
		l_PUCH_ODR_START_TIME = null;
		l_PUCH_ODR_DLV_TIME = null;
		l_h_APR_PUR_INST = null;
		l_h_APPR_POWER_TYP = null;
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
		l_l_MODIFY_COUNT = null;
		l_PLANT_CD = null;
		l_PUCH_ODR_START_DATE_ALL = null;
		l_PUCH_ODR_DLV_DATE_ALL = null;
		l_PUCH_ODR_CD = null;
		l_VEND_CD = null;
		l_PUCH_ODR_PERSON = null;
		l_JOB_ODR_CD = null;
		l_DIRECT_FLG = null;
		l_OD_NO = null;
		l_PUCH_ODR_QTY = null;
		l_ITEM_CD = null;
		l_PUCH_ODR_START_DATE = null;
		l_PUCH_ODR_DLV_DATE = null;
		l_COMPANY_CD = null;
		l_RATE_JUDGE_DATE = null;
		l_EXCH_RATE = null;
		l_HOME_CUR_AMOUNT = null;
		l_AMOUNT_INCLUDE_TAX = null;
		l_PUCH_ODR_INST_DATE = null;
		l_BUSINESS_OPR_DATE = null;
		l_PLANT_NAME = null;
		l_VEND_NAME = null;
		l_USER_NAME = null;
		l_MODIFY_COUNT = null;
		l_TIME_CTRL = null;
		l_APPR_POWER_TYP = null;
		l_USER_CD = null;
		l_APPR_ID = null;
		l_JF_INSTALL_FLG = null;
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
	 * medAE0030010�N���X�̕W���R���X�g���N�^
	 */
	public AE0030010Struct()
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
	public void setStruct(AE0030010Struct struct)
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
	public void setStructM(AE0030010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setr1_FILTER1(struct.getr1_FILTER1());
			this.setr2_FILTER1(struct.getr2_FILTER1());
			this.setr1_FILTER2(struct.getr1_FILTER2());
			this.setr2_FILTER2(struct.getr2_FILTER2());
			this.setPUCH_ODR_START_TIME(struct.getPUCH_ODR_START_TIME());
			this.setPUCH_ODR_DLV_TIME(struct.getPUCH_ODR_DLV_TIME());
			this.seth_APR_PUR_INST(struct.geth_APR_PUR_INST());
			this.seth_APPR_POWER_TYP(struct.geth_APPR_POWER_TYP());
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
			this.setl_MODIFY_COUNT(struct.getl_MODIFY_COUNT());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setPUCH_ODR_START_DATE_ALL(struct.getPUCH_ODR_START_DATE_ALL());
			this.setPUCH_ODR_DLV_DATE_ALL(struct.getPUCH_ODR_DLV_DATE_ALL());
			this.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());
			this.setVEND_CD(struct.getVEND_CD());
			this.setPUCH_ODR_PERSON(struct.getPUCH_ODR_PERSON());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setDIRECT_FLG(struct.getDIRECT_FLG());
			this.setOD_NO(struct.getOD_NO());
			this.setPUCH_ODR_QTY(struct.getPUCH_ODR_QTY());
			this.setITEM_CD(struct.getITEM_CD());
			this.setPUCH_ODR_START_DATE(struct.getPUCH_ODR_START_DATE());
			this.setPUCH_ODR_DLV_DATE(struct.getPUCH_ODR_DLV_DATE());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setRATE_JUDGE_DATE(struct.getRATE_JUDGE_DATE());
			this.setEXCH_RATE(struct.getEXCH_RATE());
			this.setHOME_CUR_AMOUNT(struct.getHOME_CUR_AMOUNT());
			this.setAMOUNT_INCLUDE_TAX(struct.getAMOUNT_INCLUDE_TAX());
			this.setPUCH_ODR_INST_DATE(struct.getPUCH_ODR_INST_DATE());
			this.setBUSINESS_OPR_DATE(struct.getBUSINESS_OPR_DATE());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.setVEND_NAME(struct.getVEND_NAME());
			this.setUSER_NAME(struct.getUSER_NAME());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setTIME_CTRL(struct.getTIME_CTRL());
			this.setAPPR_POWER_TYP(struct.getAPPR_POWER_TYP());
			this.setUSER_CD(struct.getUSER_CD());
			this.setAPPR_ID(struct.getAPPR_ID());
			this.setJF_INSTALL_FLG(struct.getJF_INSTALL_FLG());
			this.setl_COUNT(struct.getl_COUNT());
			this.setROW_COUNT(struct.getROW_COUNT());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AE0030010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_r1_FILTER1(struct.getList_r1_FILTER1());
			this.setList_r2_FILTER1(struct.getList_r2_FILTER1());
			this.setList_r1_FILTER2(struct.getList_r1_FILTER2());
			this.setList_r2_FILTER2(struct.getList_r2_FILTER2());
			this.setList_PUCH_ODR_START_TIME(struct.getList_PUCH_ODR_START_TIME());
			this.setList_PUCH_ODR_DLV_TIME(struct.getList_PUCH_ODR_DLV_TIME());
			this.setList_h_APR_PUR_INST(struct.getList_h_APR_PUR_INST());
			this.setList_h_APPR_POWER_TYP(struct.getList_h_APPR_POWER_TYP());
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
			this.setList_l_MODIFY_COUNT(struct.getList_l_MODIFY_COUNT());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_PUCH_ODR_START_DATE_ALL(struct.getList_PUCH_ODR_START_DATE_ALL());
			this.setList_PUCH_ODR_DLV_DATE_ALL(struct.getList_PUCH_ODR_DLV_DATE_ALL());
			this.setList_PUCH_ODR_CD(struct.getList_PUCH_ODR_CD());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_PUCH_ODR_PERSON(struct.getList_PUCH_ODR_PERSON());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_DIRECT_FLG(struct.getList_DIRECT_FLG());
			this.setList_OD_NO(struct.getList_OD_NO());
			this.setList_PUCH_ODR_QTY(struct.getList_PUCH_ODR_QTY());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_PUCH_ODR_START_DATE(struct.getList_PUCH_ODR_START_DATE());
			this.setList_PUCH_ODR_DLV_DATE(struct.getList_PUCH_ODR_DLV_DATE());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_RATE_JUDGE_DATE(struct.getList_RATE_JUDGE_DATE());
			this.setList_EXCH_RATE(struct.getList_EXCH_RATE());
			this.setList_HOME_CUR_AMOUNT(struct.getList_HOME_CUR_AMOUNT());
			this.setList_AMOUNT_INCLUDE_TAX(struct.getList_AMOUNT_INCLUDE_TAX());
			this.setList_PUCH_ODR_INST_DATE(struct.getList_PUCH_ODR_INST_DATE());
			this.setList_BUSINESS_OPR_DATE(struct.getList_BUSINESS_OPR_DATE());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_VEND_NAME(struct.getList_VEND_NAME());
			this.setList_USER_NAME(struct.getList_USER_NAME());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_TIME_CTRL(struct.getList_TIME_CTRL());
			this.setList_APPR_POWER_TYP(struct.getList_APPR_POWER_TYP());
			this.setList_USER_CD(struct.getList_USER_CD());
			this.setList_APPR_ID(struct.getList_APPR_ID());
			this.setList_JF_INSTALL_FLG(struct.getList_JF_INSTALL_FLG());
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
	// �� 1 �ϐ������l�F i_r1_FILTER1


	final static String i_r1_FILTER1 = null;

	// �� 2 �ϐ������l�F i_r2_FILTER1


	final static String i_r2_FILTER1 = null;

	// �� 3 �ϐ������l�F i_r1_FILTER2


	final static String i_r1_FILTER2 = null;

	// �� 4 �ϐ������l�F i_r2_FILTER2


	final static String i_r2_FILTER2 = null;

	// �� 5 �ϐ������l�F i_PUCH_ODR_START_TIME


	final static String i_PUCH_ODR_START_TIME = null;

	// �� 6 �ϐ������l�F i_PUCH_ODR_DLV_TIME


	final static String i_PUCH_ODR_DLV_TIME = null;

	// �� 7 �ϐ������l�F i_h_APR_PUR_INST


	final static String i_h_APR_PUR_INST = null;

	// �� 8 �ϐ������l�F i_h_APPR_POWER_TYP


	final static String i_h_APPR_POWER_TYP = null;

	// �� 9 �ϐ������l�F i_l_PUCH_ODR_START_DATE


	final static String i_l_PUCH_ODR_START_DATE = null;

	// �� 10 �ϐ������l�F i_l_PUCH_ODR_DLV_DATE


	final static String i_l_PUCH_ODR_DLV_DATE = null;

	// �� 11 �ϐ������l�F i_l_VEND_CD


	final static String i_l_VEND_CD = null;

	// �� 12 �ϐ������l�F i_l_VEND_ANAME


	final static String i_l_VEND_ANAME = null;

	// �� 13 �ϐ������l�F i_l_ITEM_CD


	final static String i_l_ITEM_CD = null;

	// �� 14 �ϐ������l�F i_l_ITEM_NAME


	final static String i_l_ITEM_NAME = null;

	// �� 15 �ϐ������l�F i_l_PUCH_ODR_QTY


	final static String i_l_PUCH_ODR_QTY = null;

	// �� 16 �ϐ������l�F i_l_STOCK_UNIT


	final static String i_l_STOCK_UNIT = null;

	// �� 17 �ϐ������l�F i_l_PUCH_ODR_CD


	final static String i_l_PUCH_ODR_CD = null;

	// �� 18 �ϐ������l�F i_l_JOB_ODR_CD


	final static String i_l_JOB_ODR_CD = null;

	// �� 19 �ϐ������l�F i_l_MODIFY_COUNT


	final static String i_l_MODIFY_COUNT = null;

	// �� 20 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 21 �ϐ������l�F i_PUCH_ODR_START_DATE_ALL


	final static String i_PUCH_ODR_START_DATE_ALL = null;

	// �� 22 �ϐ������l�F i_PUCH_ODR_DLV_DATE_ALL


	final static String i_PUCH_ODR_DLV_DATE_ALL = null;

	// �� 23 �ϐ������l�F i_PUCH_ODR_CD


	final static String i_PUCH_ODR_CD = null;

	// �� 24 �ϐ������l�F i_VEND_CD


	final static String i_VEND_CD = null;

	// �� 25 �ϐ������l�F i_PUCH_ODR_PERSON


	final static String i_PUCH_ODR_PERSON = null;

	// �� 26 �ϐ������l�F i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// �� 27 �ϐ������l�F i_DIRECT_FLG


	final static String i_DIRECT_FLG = null;

	// �� 28 �ϐ������l�F i_OD_NO


	final static String i_OD_NO = null;

	// �� 29 �ϐ������l�F i_PUCH_ODR_QTY


	final static String i_PUCH_ODR_QTY = null;

	// �� 30 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 31 �ϐ������l�F i_PUCH_ODR_START_DATE


	final static String i_PUCH_ODR_START_DATE = null;

	// �� 32 �ϐ������l�F i_PUCH_ODR_DLV_DATE


	final static String i_PUCH_ODR_DLV_DATE = null;

	// �� 33 �ϐ������l�F i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// �� 34 �ϐ������l�F i_RATE_JUDGE_DATE


	final static String i_RATE_JUDGE_DATE = null;

	// �� 35 �ϐ������l�F i_EXCH_RATE


	final static String i_EXCH_RATE = null;

	// �� 36 �ϐ������l�F i_HOME_CUR_AMOUNT


	final static String i_HOME_CUR_AMOUNT = null;

	// �� 37 �ϐ������l�F i_AMOUNT_INCLUDE_TAX


	final static String i_AMOUNT_INCLUDE_TAX = null;

	// �� 38 �ϐ������l�F i_PUCH_ODR_INST_DATE


	final static String i_PUCH_ODR_INST_DATE = null;

	// �� 39 �ϐ������l�F i_BUSINESS_OPR_DATE


	final static String i_BUSINESS_OPR_DATE = null;

	// �� 40 �ϐ������l�F i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// �� 41 �ϐ������l�F i_VEND_NAME


	final static String i_VEND_NAME = null;

	// �� 42 �ϐ������l�F i_USER_NAME


	final static String i_USER_NAME = null;

	// �� 43 �ϐ������l�F i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// �� 44 �ϐ������l�F i_TIME_CTRL


	final static String i_TIME_CTRL = null;

	// �� 45 �ϐ������l�F i_APPR_POWER_TYP


	final static String i_APPR_POWER_TYP = null;

	// �� 46 �ϐ������l�F i_USER_CD


	final static String i_USER_CD = null;

	// �� 47 �ϐ������l�F i_APPR_ID


	final static String i_APPR_ID = null;

	// �� 48 �ϐ������l�F i_JF_INSTALL_FLG


	final static String i_JF_INSTALL_FLG = null;

	// �� 49 �ϐ������l�F i_l_COUNT


	final static String i_l_COUNT = null;

	// �� 50 �ϐ������l�F i_ROW_COUNT


	final static String i_ROW_COUNT = null;

*/

	//{{user_implement_code
         // TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
         // �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
        // �� 1 �ϐ������l�F i_l_PUCH_ODR_START_DATE
        final static String i_l_PUCH_ODR_START_DATE = null;
        // �� 2 �ϐ������l�F i_l_PUCH_ODR_DLV_DATE
        final static String i_l_PUCH_ODR_DLV_DATE = null;
        // �� 3 �ϐ������l�F i_l_VEND_CD
        final static String i_l_VEND_CD = null;
        // �� 4 �ϐ������l�F i_l_VEND_ANAME
        final static String i_l_VEND_ANAME = null;
        // �� 5 �ϐ������l�F i_l_ITEM_CD
        final static String i_l_ITEM_CD = null;
        // �� 6 �ϐ������l�F i_l_ITEM_NAME
        final static String i_l_ITEM_NAME = null;
        // �� 7 �ϐ������l�F i_l_PUCH_ODR_QTY
        final static String i_l_PUCH_ODR_QTY = null;
        // �� 8 �ϐ������l�F i_l_STOCK_UNIT
        final static String i_l_STOCK_UNIT = null;
        // �� 9 �ϐ������l�F i_l_PUCH_ODR_CD
        final static String i_l_PUCH_ODR_CD = null;
        // �� 10 �ϐ������l�F i_l_JOB_ODR_CD
        final static String i_l_JOB_ODR_CD = null;
        // �� 11 �ϐ������l�F i_l_MODIFY_COUNT
        final static String i_l_MODIFY_COUNT = null;
        // �� 12 �ϐ������l�F i_PLANT_CD
        final static String i_PLANT_CD = null;
        // �� 13 �ϐ������l�F i_PUCH_ODR_START_DATE
        final static String i_PUCH_ODR_START_DATE = null;
        // �� 14 �ϐ������l�F i_PUCH_ODR_DLV_DATE
        final static String i_PUCH_ODR_DLV_DATE = null;
        // �� 15 �ϐ������l�F i_PUCH_ODR_CD
        final static String i_PUCH_ODR_CD = null;
        // �� 16 �ϐ������l�F i_VEND_CD
        final static String i_VEND_CD = null;
        // �� 17 �ϐ������l�F i_PUCH_ODR_PERSON
        final static String i_PUCH_ODR_PERSON = null;
        // �� 18 �ϐ������l�F i_JOB_ODR_CD
        final static String i_JOB_ODR_CD = null;
        // �� 19 �ϐ������l�F i_OD_NO
        final static String i_OD_NO = null;
        // �� 20 �ϐ������l�F i_PUCH_ODR_QTY
        final static String i_PUCH_ODR_QTY = null;
        // �� 21 �ϐ������l�F i_ITEM_CD
        final static String i_ITEM_CD = null;
        // �� 22 �ϐ������l�F i_COMPANY_CD
        final static String i_COMPANY_CD = null;
        // �� 23 �ϐ������l�F i_RATE_JUDGE_DATE
        final static String i_RATE_JUDGE_DATE = null;
        // �� 24 �ϐ������l�F i_EXCH_RATE
        final static String i_EXCH_RATE = null;
        // �� 25 �ϐ������l�F i_HOME_CUR_AMOUNT
        final static String i_HOME_CUR_AMOUNT = null;
        // �� 26 �ϐ������l�F i_AMOUNT_INCLUDE_TAX
        final static String i_AMOUNT_INCLUDE_TAX = null;
        // �� 27 �ϐ������l�F i_PUCH_ODR_INST_DATE
        final static String i_PUCH_ODR_INST_DATE = null;
        // �� 28 �ϐ������l�F i_BUSINESS_OPR_DATE
        final static String i_BUSINESS_OPR_DATE = null;
        // �� 29 �ϐ������l�F i_PLANT_NAME
        final static String i_PLANT_NAME = null;
        // �� 30 �ϐ������l�F i_VEND_NAME
        final static String i_VEND_NAME = null;
        // �� 31 �ϐ������l�F i_USER_NAME
        final static String i_USER_NAME = null;
        // �� 32 �ϐ������l�F i_MODIFY_COUNT
        final static String i_MODIFY_COUNT = null;
        // �� 33 �ϐ������l�F i_r1_FILTER1
        final static String i_r1_FILTER1 = null;
        // �� 34 �ϐ������l�F i_r2_FILTER1
        final static String i_r2_FILTER1 = null;
        // �� 35 �ϐ������l�F i_r1_FILTER2
        final static String i_r1_FILTER2 = null;
        // �� 36 �ϐ������l�F i_r2_FILTER2
        final static String i_r2_FILTER2 = null;
       
        /**
         * ������
         *
         */
        public void initialize()
        {
       
         clear();
       
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
         m_l_MODIFY_COUNT = i_l_MODIFY_COUNT;
         m_PLANT_CD = i_PLANT_CD;
         m_PUCH_ODR_START_DATE = i_PUCH_ODR_START_DATE;
         m_PUCH_ODR_DLV_DATE = i_PUCH_ODR_DLV_DATE;
         m_PUCH_ODR_CD = i_PUCH_ODR_CD;
         m_VEND_CD = i_VEND_CD;
         m_PUCH_ODR_PERSON = i_PUCH_ODR_PERSON;
         m_JOB_ODR_CD = i_JOB_ODR_CD;
         m_OD_NO = i_OD_NO;
         m_PUCH_ODR_QTY = i_PUCH_ODR_QTY;
         m_ITEM_CD = i_ITEM_CD;
         m_COMPANY_CD = i_COMPANY_CD;
         m_RATE_JUDGE_DATE = i_RATE_JUDGE_DATE;
         m_EXCH_RATE = i_EXCH_RATE;
         m_HOME_CUR_AMOUNT = i_HOME_CUR_AMOUNT;
         m_AMOUNT_INCLUDE_TAX = i_AMOUNT_INCLUDE_TAX;
         m_PUCH_ODR_INST_DATE = i_PUCH_ODR_INST_DATE;
         m_BUSINESS_OPR_DATE = i_BUSINESS_OPR_DATE;
         m_PLANT_NAME = i_PLANT_NAME;
         m_VEND_NAME = i_VEND_NAME;
         m_USER_NAME = i_USER_NAME;
         m_MODIFY_COUNT = i_MODIFY_COUNT;
         m_r1_FILTER1 = i_r1_FILTER1;
         m_r2_FILTER1 = i_r2_FILTER1;
         m_r1_FILTER2 = i_r1_FILTER2;
         m_r2_FILTER2 = i_r2_FILTER2;
        }
       
         // TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
