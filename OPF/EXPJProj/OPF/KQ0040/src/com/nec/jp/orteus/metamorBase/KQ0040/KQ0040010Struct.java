/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KQ0040/src/com/nec/jp/orteus/metamorBase/KQ0040/KQ0040010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.KQ0040;

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

public class KQ0040010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_CHECK_1 */
	public String m_CHECK_1 = null;
	/** �� 2 �ϐ��F m_CHECK_2 */
	public String m_CHECK_2 = null;
	/** �� 3 �ϐ��F m_CHECK_4 */
	public String m_CHECK_4 = null;
	/** �� 4 �ϐ��F m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** �� 5 �ϐ��F m_CHECK_PRO_ODR */
	public String m_CHECK_PRO_ODR = null;
	/** �� 6 �ϐ��F m_w_BUSINESS_OPR_DATE */
	public String m_w_BUSINESS_OPR_DATE = null;
	/** �� 7 �ϐ��F m_w_PLANT_CD */
	public String m_w_PLANT_CD = null;
	/** �� 8 �ϐ��F m_w_COMPANY_CD */
	public String m_w_COMPANY_CD = null;
	/** �� 9 �ϐ��F m_IN_PRO_ODR */
	public String m_IN_PRO_ODR = null;
	/** �� 10 �ϐ��F m_ODR_TYP */
	public String m_ODR_TYP = null;
	/** �� 11 �ϐ��F m_CUST_ODR_NO */
	public String m_CUST_ODR_NO = null;
	/** �� 12 �ϐ��F m_CUST_CD */
	public String m_CUST_CD = null;
	/** �� 13 �ϐ��F m_CUST_NAME */
	public String m_CUST_NAME = null;
	/** �� 14 �ϐ��F m_CUST_ITEM_CD */
	public String m_CUST_ITEM_CD = null;
	/** �� 15 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 16 �ϐ��F m_CUST_CHRG_PSN_CD */
	public String m_CUST_CHRG_PSN_CD = null;
	/** �� 17 �ϐ��F m_ODR_ACPT_PSN_CD */
	public String m_ODR_ACPT_PSN_CD = null;
	/** �� 18 �ϐ��F m_DESINATED_DLV_DATE */
	public String m_DESINATED_DLV_DATE = null;
	/** �� 19 �ϐ��F m_ODR_QTY */
	public String m_ODR_QTY = null;
	/** �� 20 �ϐ��F m_UNIT_NAME */
	public String m_UNIT_NAME = null;
	/** �� 21 �ϐ��F m_ODR_UNIT_PRICE */
	public String m_ODR_UNIT_PRICE = null;
	/** �� 22 �ϐ��F m_ODR_AMOUNT */
	public String m_ODR_AMOUNT = null;
	/** �� 23 �ϐ��F m_REMAIN_UNCONFIRM_ODR_QTY */
	public String m_REMAIN_UNCONFIRM_ODR_QTY = null;
	/** �� 24 �ϐ��F m_UNCONFIRM_ODR_BALANCE */
	public String m_UNCONFIRM_ODR_BALANCE = null;
	/** �� 25 �ϐ��F m_UNCONFIRM_ODR_QTY */
	public String m_UNCONFIRM_ODR_QTY = null;
	/** �� 26 �ϐ��F m_UNCONFIRM_ODR_AMOUNT */
	public String m_UNCONFIRM_ODR_AMOUNT = null;
	/** �� 27 �ϐ��F m_DEPO_TYP */
	public String m_DEPO_TYP = null;
	/** �� 28 �ϐ��F m_UNCONFIRMED_ODR_EFF_OVR_FLG */
	public String m_UNCONFIRMED_ODR_EFF_OVR_FLG = null;
	/** �� 29 �ϐ��F m_ODR_NO */
	public String m_ODR_NO = null;
	/** �� 30 �ϐ��F m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** �� 31 �ϐ��F m_ODR_ACPT_DATE */
	public String m_ODR_ACPT_DATE = null;
	/** �� 32 �ϐ��F m_CURRNCY_CD */
	public String m_CURRNCY_CD = null;
	/** �� 33 �ϐ��F m_CUR_UNIT */
	public String m_CUR_UNIT = null;
	/** �� 34 �ϐ��F m_EXCH_TYP */
	public String m_EXCH_TYP = null;
	/** �� 35 �ϐ��F m_ROUND_TYP */
	public String m_ROUND_TYP = null;
	/** �� 36 �ϐ��F m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** �� 37 �ϐ��F m_CUST_ITEM_NAME */
	public String m_CUST_ITEM_NAME = null;
	/** �� 38 �ϐ��F m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** �� 39 �ϐ��F m_PROJECT_CD */
	public String m_PROJECT_CD = null;
	/** �� 40 �ϐ��F m_ESTIMATE_NO */
	public String m_ESTIMATE_NO = null;
	/** �� 41 �ϐ��F m_DETAL_NO */
	public String m_DETAL_NO = null;
	/** �� 42 �ϐ��F m_PRO_FLG */
	public String m_PRO_FLG = null;
	/** �� 43 �ϐ��F m_IN_CUST_CD */
	public String m_IN_CUST_CD = null;
	/** �� 44 �ϐ��F m_IN_CUST_ITEM_CD */
	public String m_IN_CUST_ITEM_CD = null;
	/** �� 45 �ϐ��F m_IN_CUST_CHRG_PSN_CD */
	public String m_IN_CUST_CHRG_PSN_CD = null;
	/** �� 46 �ϐ��F m_IN_CUST_ODR_NO */
	public String m_IN_CUST_ODR_NO = null;
	/** �� 47 �ϐ��F m_FROM_DESINATED_DLV_DATE */
	public String m_FROM_DESINATED_DLV_DATE = null;
	/** �� 48 �ϐ��F m_TO_DESINATED_DLV_DATE */
	public String m_TO_DESINATED_DLV_DATE = null;
	/** �� 49 �ϐ��F m_FROM_ODR_ACPT_DATE */
	public String m_FROM_ODR_ACPT_DATE = null;
	/** �� 50 �ϐ��F m_TO_ODR_ACPT_DATE */
	public String m_TO_ODR_ACPT_DATE = null;
	/** �� 51 �ϐ��F m_IN_ODR_TYP_1 */
	public String m_IN_ODR_TYP_1 = null;
	/** �� 52 �ϐ��F m_IN_ODR_TYP_2 */
	public String m_IN_ODR_TYP_2 = null;
	/** �� 53 �ϐ��F m_IN_ODR_TYP_3 */
	public String m_IN_ODR_TYP_3 = null;
	/** �� 54 �ϐ��F m_IN_COMPANY_CD */
	public String m_IN_COMPANY_CD = null;
	/** �� 55 �ϐ��F m_IN_BUSINESS_OPR_DATE */
	public String m_IN_BUSINESS_OPR_DATE = null;
	/** �� 56 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 57 �ϐ��F m_l_COUNT */
	public String m_l_COUNT = null;
	/** �� 58 �ϐ��F m_ROW_COUNT */
	public String m_ROW_COUNT = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_CHECK_1 */
	public List l_CHECK_1 = null;

	/** �� 2 List�ϐ��F l_CHECK_2 */
	public List l_CHECK_2 = null;

	/** �� 3 List�ϐ��F l_CHECK_4 */
	public List l_CHECK_4 = null;

	/** �� 4 List�ϐ��F l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** �� 5 List�ϐ��F l_CHECK_PRO_ODR */
	public List l_CHECK_PRO_ODR = null;

	/** �� 6 List�ϐ��F l_w_BUSINESS_OPR_DATE */
	public List l_w_BUSINESS_OPR_DATE = null;

	/** �� 7 List�ϐ��F l_w_PLANT_CD */
	public List l_w_PLANT_CD = null;

	/** �� 8 List�ϐ��F l_w_COMPANY_CD */
	public List l_w_COMPANY_CD = null;

	/** �� 9 List�ϐ��F l_IN_PRO_ODR */
	public List l_IN_PRO_ODR = null;

	/** �� 10 List�ϐ��F l_ODR_TYP */
	public List l_ODR_TYP = null;

	/** �� 11 List�ϐ��F l_CUST_ODR_NO */
	public List l_CUST_ODR_NO = null;

	/** �� 12 List�ϐ��F l_CUST_CD */
	public List l_CUST_CD = null;

	/** �� 13 List�ϐ��F l_CUST_NAME */
	public List l_CUST_NAME = null;

	/** �� 14 List�ϐ��F l_CUST_ITEM_CD */
	public List l_CUST_ITEM_CD = null;

	/** �� 15 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 16 List�ϐ��F l_CUST_CHRG_PSN_CD */
	public List l_CUST_CHRG_PSN_CD = null;

	/** �� 17 List�ϐ��F l_ODR_ACPT_PSN_CD */
	public List l_ODR_ACPT_PSN_CD = null;

	/** �� 18 List�ϐ��F l_DESINATED_DLV_DATE */
	public List l_DESINATED_DLV_DATE = null;

	/** �� 19 List�ϐ��F l_ODR_QTY */
	public List l_ODR_QTY = null;

	/** �� 20 List�ϐ��F l_UNIT_NAME */
	public List l_UNIT_NAME = null;

	/** �� 21 List�ϐ��F l_ODR_UNIT_PRICE */
	public List l_ODR_UNIT_PRICE = null;

	/** �� 22 List�ϐ��F l_ODR_AMOUNT */
	public List l_ODR_AMOUNT = null;

	/** �� 23 List�ϐ��F l_REMAIN_UNCONFIRM_ODR_QTY */
	public List l_REMAIN_UNCONFIRM_ODR_QTY = null;

	/** �� 24 List�ϐ��F l_UNCONFIRM_ODR_BALANCE */
	public List l_UNCONFIRM_ODR_BALANCE = null;

	/** �� 25 List�ϐ��F l_UNCONFIRM_ODR_QTY */
	public List l_UNCONFIRM_ODR_QTY = null;

	/** �� 26 List�ϐ��F l_UNCONFIRM_ODR_AMOUNT */
	public List l_UNCONFIRM_ODR_AMOUNT = null;

	/** �� 27 List�ϐ��F l_DEPO_TYP */
	public List l_DEPO_TYP = null;

	/** �� 28 List�ϐ��F l_UNCONFIRMED_ODR_EFF_OVR_FLG */
	public List l_UNCONFIRMED_ODR_EFF_OVR_FLG = null;

	/** �� 29 List�ϐ��F l_ODR_NO */
	public List l_ODR_NO = null;

	/** �� 30 List�ϐ��F l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** �� 31 List�ϐ��F l_ODR_ACPT_DATE */
	public List l_ODR_ACPT_DATE = null;

	/** �� 32 List�ϐ��F l_CURRNCY_CD */
	public List l_CURRNCY_CD = null;

	/** �� 33 List�ϐ��F l_CUR_UNIT */
	public List l_CUR_UNIT = null;

	/** �� 34 List�ϐ��F l_EXCH_TYP */
	public List l_EXCH_TYP = null;

	/** �� 35 List�ϐ��F l_ROUND_TYP */
	public List l_ROUND_TYP = null;

	/** �� 36 List�ϐ��F l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** �� 37 List�ϐ��F l_CUST_ITEM_NAME */
	public List l_CUST_ITEM_NAME = null;

	/** �� 38 List�ϐ��F l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** �� 39 List�ϐ��F l_PROJECT_CD */
	public List l_PROJECT_CD = null;

	/** �� 40 List�ϐ��F l_ESTIMATE_NO */
	public List l_ESTIMATE_NO = null;

	/** �� 41 List�ϐ��F l_DETAL_NO */
	public List l_DETAL_NO = null;

	/** �� 42 List�ϐ��F l_PRO_FLG */
	public List l_PRO_FLG = null;

	/** �� 43 List�ϐ��F l_IN_CUST_CD */
	public List l_IN_CUST_CD = null;

	/** �� 44 List�ϐ��F l_IN_CUST_ITEM_CD */
	public List l_IN_CUST_ITEM_CD = null;

	/** �� 45 List�ϐ��F l_IN_CUST_CHRG_PSN_CD */
	public List l_IN_CUST_CHRG_PSN_CD = null;

	/** �� 46 List�ϐ��F l_IN_CUST_ODR_NO */
	public List l_IN_CUST_ODR_NO = null;

	/** �� 47 List�ϐ��F l_FROM_DESINATED_DLV_DATE */
	public List l_FROM_DESINATED_DLV_DATE = null;

	/** �� 48 List�ϐ��F l_TO_DESINATED_DLV_DATE */
	public List l_TO_DESINATED_DLV_DATE = null;

	/** �� 49 List�ϐ��F l_FROM_ODR_ACPT_DATE */
	public List l_FROM_ODR_ACPT_DATE = null;

	/** �� 50 List�ϐ��F l_TO_ODR_ACPT_DATE */
	public List l_TO_ODR_ACPT_DATE = null;

	/** �� 51 List�ϐ��F l_IN_ODR_TYP_1 */
	public List l_IN_ODR_TYP_1 = null;

	/** �� 52 List�ϐ��F l_IN_ODR_TYP_2 */
	public List l_IN_ODR_TYP_2 = null;

	/** �� 53 List�ϐ��F l_IN_ODR_TYP_3 */
	public List l_IN_ODR_TYP_3 = null;

	/** �� 54 List�ϐ��F l_IN_COMPANY_CD */
	public List l_IN_COMPANY_CD = null;

	/** �� 55 List�ϐ��F l_IN_BUSINESS_OPR_DATE */
	public List l_IN_BUSINESS_OPR_DATE = null;

	/** �� 56 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 57 List�ϐ��F l_l_COUNT */
	public List l_l_COUNT = null;

	/** �� 58 List�ϐ��F l_ROW_COUNT */
	public List l_ROW_COUNT = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getCHECK_1() { return m_CHECK_1; }
	public String getCHECK_2() { return m_CHECK_2; }
	public String getCHECK_4() { return m_CHECK_4; }
	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getCHECK_PRO_ODR() { return m_CHECK_PRO_ODR; }
	public String getw_BUSINESS_OPR_DATE() { return m_w_BUSINESS_OPR_DATE; }
	public String getw_PLANT_CD() { return m_w_PLANT_CD; }
	public String getw_COMPANY_CD() { return m_w_COMPANY_CD; }
	public String getIN_PRO_ODR() { return m_IN_PRO_ODR; }
	public String getODR_TYP() { return m_ODR_TYP; }
	public String getCUST_ODR_NO() { return m_CUST_ODR_NO; }
	public String getCUST_CD() { return m_CUST_CD; }
	public String getCUST_NAME() { return m_CUST_NAME; }
	public String getCUST_ITEM_CD() { return m_CUST_ITEM_CD; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getCUST_CHRG_PSN_CD() { return m_CUST_CHRG_PSN_CD; }
	public String getODR_ACPT_PSN_CD() { return m_ODR_ACPT_PSN_CD; }
	public String getDESINATED_DLV_DATE() { return m_DESINATED_DLV_DATE; }
	public String getODR_QTY() { return m_ODR_QTY; }
	public String getUNIT_NAME() { return m_UNIT_NAME; }
	public String getODR_UNIT_PRICE() { return m_ODR_UNIT_PRICE; }
	public String getODR_AMOUNT() { return m_ODR_AMOUNT; }
	public String getREMAIN_UNCONFIRM_ODR_QTY() { return m_REMAIN_UNCONFIRM_ODR_QTY; }
	public String getUNCONFIRM_ODR_BALANCE() { return m_UNCONFIRM_ODR_BALANCE; }
	public String getUNCONFIRM_ODR_QTY() { return m_UNCONFIRM_ODR_QTY; }
	public String getUNCONFIRM_ODR_AMOUNT() { return m_UNCONFIRM_ODR_AMOUNT; }
	public String getDEPO_TYP() { return m_DEPO_TYP; }
	public String getUNCONFIRMED_ODR_EFF_OVR_FLG() { return m_UNCONFIRMED_ODR_EFF_OVR_FLG; }
	public String getODR_NO() { return m_ODR_NO; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getODR_ACPT_DATE() { return m_ODR_ACPT_DATE; }
	public String getCURRNCY_CD() { return m_CURRNCY_CD; }
	public String getCUR_UNIT() { return m_CUR_UNIT; }
	public String getEXCH_TYP() { return m_EXCH_TYP; }
	public String getROUND_TYP() { return m_ROUND_TYP; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getCUST_ITEM_NAME() { return m_CUST_ITEM_NAME; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getPROJECT_CD() { return m_PROJECT_CD; }
	public String getESTIMATE_NO() { return m_ESTIMATE_NO; }
	public String getDETAL_NO() { return m_DETAL_NO; }
	public String getPRO_FLG() { return m_PRO_FLG; }
	public String getIN_CUST_CD() { return m_IN_CUST_CD; }
	public String getIN_CUST_ITEM_CD() { return m_IN_CUST_ITEM_CD; }
	public String getIN_CUST_CHRG_PSN_CD() { return m_IN_CUST_CHRG_PSN_CD; }
	public String getIN_CUST_ODR_NO() { return m_IN_CUST_ODR_NO; }
	public String getFROM_DESINATED_DLV_DATE() { return m_FROM_DESINATED_DLV_DATE; }
	public String getTO_DESINATED_DLV_DATE() { return m_TO_DESINATED_DLV_DATE; }
	public String getFROM_ODR_ACPT_DATE() { return m_FROM_ODR_ACPT_DATE; }
	public String getTO_ODR_ACPT_DATE() { return m_TO_ODR_ACPT_DATE; }
	public String getIN_ODR_TYP_1() { return m_IN_ODR_TYP_1; }
	public String getIN_ODR_TYP_2() { return m_IN_ODR_TYP_2; }
	public String getIN_ODR_TYP_3() { return m_IN_ODR_TYP_3; }
	public String getIN_COMPANY_CD() { return m_IN_COMPANY_CD; }
	public String getIN_BUSINESS_OPR_DATE() { return m_IN_BUSINESS_OPR_DATE; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }

	public List getList_CHECK_1() { return l_CHECK_1; }
	public List getList_CHECK_2() { return l_CHECK_2; }
	public List getList_CHECK_4() { return l_CHECK_4; }
	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_CHECK_PRO_ODR() { return l_CHECK_PRO_ODR; }
	public List getList_w_BUSINESS_OPR_DATE() { return l_w_BUSINESS_OPR_DATE; }
	public List getList_w_PLANT_CD() { return l_w_PLANT_CD; }
	public List getList_w_COMPANY_CD() { return l_w_COMPANY_CD; }
	public List getList_IN_PRO_ODR() { return l_IN_PRO_ODR; }
	public List getList_ODR_TYP() { return l_ODR_TYP; }
	public List getList_CUST_ODR_NO() { return l_CUST_ODR_NO; }
	public List getList_CUST_CD() { return l_CUST_CD; }
	public List getList_CUST_NAME() { return l_CUST_NAME; }
	public List getList_CUST_ITEM_CD() { return l_CUST_ITEM_CD; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_CUST_CHRG_PSN_CD() { return l_CUST_CHRG_PSN_CD; }
	public List getList_ODR_ACPT_PSN_CD() { return l_ODR_ACPT_PSN_CD; }
	public List getList_DESINATED_DLV_DATE() { return l_DESINATED_DLV_DATE; }
	public List getList_ODR_QTY() { return l_ODR_QTY; }
	public List getList_UNIT_NAME() { return l_UNIT_NAME; }
	public List getList_ODR_UNIT_PRICE() { return l_ODR_UNIT_PRICE; }
	public List getList_ODR_AMOUNT() { return l_ODR_AMOUNT; }
	public List getList_REMAIN_UNCONFIRM_ODR_QTY() { return l_REMAIN_UNCONFIRM_ODR_QTY; }
	public List getList_UNCONFIRM_ODR_BALANCE() { return l_UNCONFIRM_ODR_BALANCE; }
	public List getList_UNCONFIRM_ODR_QTY() { return l_UNCONFIRM_ODR_QTY; }
	public List getList_UNCONFIRM_ODR_AMOUNT() { return l_UNCONFIRM_ODR_AMOUNT; }
	public List getList_DEPO_TYP() { return l_DEPO_TYP; }
	public List getList_UNCONFIRMED_ODR_EFF_OVR_FLG() { return l_UNCONFIRMED_ODR_EFF_OVR_FLG; }
	public List getList_ODR_NO() { return l_ODR_NO; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_ODR_ACPT_DATE() { return l_ODR_ACPT_DATE; }
	public List getList_CURRNCY_CD() { return l_CURRNCY_CD; }
	public List getList_CUR_UNIT() { return l_CUR_UNIT; }
	public List getList_EXCH_TYP() { return l_EXCH_TYP; }
	public List getList_ROUND_TYP() { return l_ROUND_TYP; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_CUST_ITEM_NAME() { return l_CUST_ITEM_NAME; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_PROJECT_CD() { return l_PROJECT_CD; }
	public List getList_ESTIMATE_NO() { return l_ESTIMATE_NO; }
	public List getList_DETAL_NO() { return l_DETAL_NO; }
	public List getList_PRO_FLG() { return l_PRO_FLG; }
	public List getList_IN_CUST_CD() { return l_IN_CUST_CD; }
	public List getList_IN_CUST_ITEM_CD() { return l_IN_CUST_ITEM_CD; }
	public List getList_IN_CUST_CHRG_PSN_CD() { return l_IN_CUST_CHRG_PSN_CD; }
	public List getList_IN_CUST_ODR_NO() { return l_IN_CUST_ODR_NO; }
	public List getList_FROM_DESINATED_DLV_DATE() { return l_FROM_DESINATED_DLV_DATE; }
	public List getList_TO_DESINATED_DLV_DATE() { return l_TO_DESINATED_DLV_DATE; }
	public List getList_FROM_ODR_ACPT_DATE() { return l_FROM_ODR_ACPT_DATE; }
	public List getList_TO_ODR_ACPT_DATE() { return l_TO_ODR_ACPT_DATE; }
	public List getList_IN_ODR_TYP_1() { return l_IN_ODR_TYP_1; }
	public List getList_IN_ODR_TYP_2() { return l_IN_ODR_TYP_2; }
	public List getList_IN_ODR_TYP_3() { return l_IN_ODR_TYP_3; }
	public List getList_IN_COMPANY_CD() { return l_IN_COMPANY_CD; }
	public List getList_IN_BUSINESS_OPR_DATE() { return l_IN_BUSINESS_OPR_DATE; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }

	public void setCHECK_1(String val) { m_CHECK_1 = val; }
	public void setCHECK_2(String val) { m_CHECK_2 = val; }
	public void setCHECK_4(String val) { m_CHECK_4 = val; }
	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setCHECK_PRO_ODR(String val) { m_CHECK_PRO_ODR = val; }
	public void setw_BUSINESS_OPR_DATE(String val) { m_w_BUSINESS_OPR_DATE = val; }
	public void setw_PLANT_CD(String val) { m_w_PLANT_CD = val; }
	public void setw_COMPANY_CD(String val) { m_w_COMPANY_CD = val; }
	public void setIN_PRO_ODR(String val) { m_IN_PRO_ODR = val; }
	public void setODR_TYP(String val) { m_ODR_TYP = val; }
	public void setCUST_ODR_NO(String val) { m_CUST_ODR_NO = val; }
	public void setCUST_CD(String val) { m_CUST_CD = val; }
	public void setCUST_NAME(String val) { m_CUST_NAME = val; }
	public void setCUST_ITEM_CD(String val) { m_CUST_ITEM_CD = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setCUST_CHRG_PSN_CD(String val) { m_CUST_CHRG_PSN_CD = val; }
	public void setODR_ACPT_PSN_CD(String val) { m_ODR_ACPT_PSN_CD = val; }
	public void setDESINATED_DLV_DATE(String val) { m_DESINATED_DLV_DATE = val; }
	public void setODR_QTY(String val) { m_ODR_QTY = val; }
	public void setUNIT_NAME(String val) { m_UNIT_NAME = val; }
	public void setODR_UNIT_PRICE(String val) { m_ODR_UNIT_PRICE = val; }
	public void setODR_AMOUNT(String val) { m_ODR_AMOUNT = val; }
	public void setREMAIN_UNCONFIRM_ODR_QTY(String val) { m_REMAIN_UNCONFIRM_ODR_QTY = val; }
	public void setUNCONFIRM_ODR_BALANCE(String val) { m_UNCONFIRM_ODR_BALANCE = val; }
	public void setUNCONFIRM_ODR_QTY(String val) { m_UNCONFIRM_ODR_QTY = val; }
	public void setUNCONFIRM_ODR_AMOUNT(String val) { m_UNCONFIRM_ODR_AMOUNT = val; }
	public void setDEPO_TYP(String val) { m_DEPO_TYP = val; }
	public void setUNCONFIRMED_ODR_EFF_OVR_FLG(String val) { m_UNCONFIRMED_ODR_EFF_OVR_FLG = val; }
	public void setODR_NO(String val) { m_ODR_NO = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setODR_ACPT_DATE(String val) { m_ODR_ACPT_DATE = val; }
	public void setCURRNCY_CD(String val) { m_CURRNCY_CD = val; }
	public void setCUR_UNIT(String val) { m_CUR_UNIT = val; }
	public void setEXCH_TYP(String val) { m_EXCH_TYP = val; }
	public void setROUND_TYP(String val) { m_ROUND_TYP = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setCUST_ITEM_NAME(String val) { m_CUST_ITEM_NAME = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setPROJECT_CD(String val) { m_PROJECT_CD = val; }
	public void setESTIMATE_NO(String val) { m_ESTIMATE_NO = val; }
	public void setDETAL_NO(String val) { m_DETAL_NO = val; }
	public void setPRO_FLG(String val) { m_PRO_FLG = val; }
	public void setIN_CUST_CD(String val) { m_IN_CUST_CD = val; }
	public void setIN_CUST_ITEM_CD(String val) { m_IN_CUST_ITEM_CD = val; }
	public void setIN_CUST_CHRG_PSN_CD(String val) { m_IN_CUST_CHRG_PSN_CD = val; }
	public void setIN_CUST_ODR_NO(String val) { m_IN_CUST_ODR_NO = val; }
	public void setFROM_DESINATED_DLV_DATE(String val) { m_FROM_DESINATED_DLV_DATE = val; }
	public void setTO_DESINATED_DLV_DATE(String val) { m_TO_DESINATED_DLV_DATE = val; }
	public void setFROM_ODR_ACPT_DATE(String val) { m_FROM_ODR_ACPT_DATE = val; }
	public void setTO_ODR_ACPT_DATE(String val) { m_TO_ODR_ACPT_DATE = val; }
	public void setIN_ODR_TYP_1(String val) { m_IN_ODR_TYP_1 = val; }
	public void setIN_ODR_TYP_2(String val) { m_IN_ODR_TYP_2 = val; }
	public void setIN_ODR_TYP_3(String val) { m_IN_ODR_TYP_3 = val; }
	public void setIN_COMPANY_CD(String val) { m_IN_COMPANY_CD = val; }
	public void setIN_BUSINESS_OPR_DATE(String val) { m_IN_BUSINESS_OPR_DATE = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }


	public void setList_CHECK_1(List list) { l_CHECK_1 = list; }
	public void setList_CHECK_2(List list) { l_CHECK_2 = list; }
	public void setList_CHECK_4(List list) { l_CHECK_4 = list; }
	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_CHECK_PRO_ODR(List list) { l_CHECK_PRO_ODR = list; }
	public void setList_w_BUSINESS_OPR_DATE(List list) { l_w_BUSINESS_OPR_DATE = list; }
	public void setList_w_PLANT_CD(List list) { l_w_PLANT_CD = list; }
	public void setList_w_COMPANY_CD(List list) { l_w_COMPANY_CD = list; }
	public void setList_IN_PRO_ODR(List list) { l_IN_PRO_ODR = list; }
	public void setList_ODR_TYP(List list) { l_ODR_TYP = list; }
	public void setList_CUST_ODR_NO(List list) { l_CUST_ODR_NO = list; }
	public void setList_CUST_CD(List list) { l_CUST_CD = list; }
	public void setList_CUST_NAME(List list) { l_CUST_NAME = list; }
	public void setList_CUST_ITEM_CD(List list) { l_CUST_ITEM_CD = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_CUST_CHRG_PSN_CD(List list) { l_CUST_CHRG_PSN_CD = list; }
	public void setList_ODR_ACPT_PSN_CD(List list) { l_ODR_ACPT_PSN_CD = list; }
	public void setList_DESINATED_DLV_DATE(List list) { l_DESINATED_DLV_DATE = list; }
	public void setList_ODR_QTY(List list) { l_ODR_QTY = list; }
	public void setList_UNIT_NAME(List list) { l_UNIT_NAME = list; }
	public void setList_ODR_UNIT_PRICE(List list) { l_ODR_UNIT_PRICE = list; }
	public void setList_ODR_AMOUNT(List list) { l_ODR_AMOUNT = list; }
	public void setList_REMAIN_UNCONFIRM_ODR_QTY(List list) { l_REMAIN_UNCONFIRM_ODR_QTY = list; }
	public void setList_UNCONFIRM_ODR_BALANCE(List list) { l_UNCONFIRM_ODR_BALANCE = list; }
	public void setList_UNCONFIRM_ODR_QTY(List list) { l_UNCONFIRM_ODR_QTY = list; }
	public void setList_UNCONFIRM_ODR_AMOUNT(List list) { l_UNCONFIRM_ODR_AMOUNT = list; }
	public void setList_DEPO_TYP(List list) { l_DEPO_TYP = list; }
	public void setList_UNCONFIRMED_ODR_EFF_OVR_FLG(List list) { l_UNCONFIRMED_ODR_EFF_OVR_FLG = list; }
	public void setList_ODR_NO(List list) { l_ODR_NO = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_ODR_ACPT_DATE(List list) { l_ODR_ACPT_DATE = list; }
	public void setList_CURRNCY_CD(List list) { l_CURRNCY_CD = list; }
	public void setList_CUR_UNIT(List list) { l_CUR_UNIT = list; }
	public void setList_EXCH_TYP(List list) { l_EXCH_TYP = list; }
	public void setList_ROUND_TYP(List list) { l_ROUND_TYP = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_CUST_ITEM_NAME(List list) { l_CUST_ITEM_NAME = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_PROJECT_CD(List list) { l_PROJECT_CD = list; }
	public void setList_ESTIMATE_NO(List list) { l_ESTIMATE_NO = list; }
	public void setList_DETAL_NO(List list) { l_DETAL_NO = list; }
	public void setList_PRO_FLG(List list) { l_PRO_FLG = list; }
	public void setList_IN_CUST_CD(List list) { l_IN_CUST_CD = list; }
	public void setList_IN_CUST_ITEM_CD(List list) { l_IN_CUST_ITEM_CD = list; }
	public void setList_IN_CUST_CHRG_PSN_CD(List list) { l_IN_CUST_CHRG_PSN_CD = list; }
	public void setList_IN_CUST_ODR_NO(List list) { l_IN_CUST_ODR_NO = list; }
	public void setList_FROM_DESINATED_DLV_DATE(List list) { l_FROM_DESINATED_DLV_DATE = list; }
	public void setList_TO_DESINATED_DLV_DATE(List list) { l_TO_DESINATED_DLV_DATE = list; }
	public void setList_FROM_ODR_ACPT_DATE(List list) { l_FROM_ODR_ACPT_DATE = list; }
	public void setList_TO_ODR_ACPT_DATE(List list) { l_TO_ODR_ACPT_DATE = list; }
	public void setList_IN_ODR_TYP_1(List list) { l_IN_ODR_TYP_1 = list; }
	public void setList_IN_ODR_TYP_2(List list) { l_IN_ODR_TYP_2 = list; }
	public void setList_IN_ODR_TYP_3(List list) { l_IN_ODR_TYP_3 = list; }
	public void setList_IN_COMPANY_CD(List list) { l_IN_COMPANY_CD = list; }
	public void setList_IN_BUSINESS_OPR_DATE(List list) { l_IN_BUSINESS_OPR_DATE = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }

	public int setL2L_CHECK_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CHECK_1 == null) {
			l_CHECK_1 = new ArrayList();
		} else {
			l_CHECK_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CHECK_1.add(((KQ0040010Struct) list.get(i)).getCHECK_1());
		}
		return size;
	}
	public int setL2L_CHECK_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CHECK_2 == null) {
			l_CHECK_2 = new ArrayList();
		} else {
			l_CHECK_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CHECK_2.add(((KQ0040010Struct) list.get(i)).getCHECK_2());
		}
		return size;
	}
	public int setL2L_CHECK_4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CHECK_4 == null) {
			l_CHECK_4 = new ArrayList();
		} else {
			l_CHECK_4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CHECK_4.add(((KQ0040010Struct) list.get(i)).getCHECK_4());
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
			l_DOWNLOAD_FILE.add(((KQ0040010Struct) list.get(i)).getDOWNLOAD_FILE());
		}
		return size;
	}
	public int setL2L_CHECK_PRO_ODR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CHECK_PRO_ODR == null) {
			l_CHECK_PRO_ODR = new ArrayList();
		} else {
			l_CHECK_PRO_ODR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CHECK_PRO_ODR.add(((KQ0040010Struct) list.get(i)).getCHECK_PRO_ODR());
		}
		return size;
	}
	public int setL2L_w_BUSINESS_OPR_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_BUSINESS_OPR_DATE == null) {
			l_w_BUSINESS_OPR_DATE = new ArrayList();
		} else {
			l_w_BUSINESS_OPR_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_BUSINESS_OPR_DATE.add(((KQ0040010Struct) list.get(i)).getw_BUSINESS_OPR_DATE());
		}
		return size;
	}
	public int setL2L_w_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_PLANT_CD == null) {
			l_w_PLANT_CD = new ArrayList();
		} else {
			l_w_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_PLANT_CD.add(((KQ0040010Struct) list.get(i)).getw_PLANT_CD());
		}
		return size;
	}
	public int setL2L_w_COMPANY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_COMPANY_CD == null) {
			l_w_COMPANY_CD = new ArrayList();
		} else {
			l_w_COMPANY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_COMPANY_CD.add(((KQ0040010Struct) list.get(i)).getw_COMPANY_CD());
		}
		return size;
	}
	public int setL2L_IN_PRO_ODR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_PRO_ODR == null) {
			l_IN_PRO_ODR = new ArrayList();
		} else {
			l_IN_PRO_ODR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_PRO_ODR.add(((KQ0040010Struct) list.get(i)).getIN_PRO_ODR());
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
			l_ODR_TYP.add(((KQ0040010Struct) list.get(i)).getODR_TYP());
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
			l_CUST_ODR_NO.add(((KQ0040010Struct) list.get(i)).getCUST_ODR_NO());
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
			l_CUST_CD.add(((KQ0040010Struct) list.get(i)).getCUST_CD());
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
			l_CUST_NAME.add(((KQ0040010Struct) list.get(i)).getCUST_NAME());
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
			l_CUST_ITEM_CD.add(((KQ0040010Struct) list.get(i)).getCUST_ITEM_CD());
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
			l_ITEM_CD.add(((KQ0040010Struct) list.get(i)).getITEM_CD());
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
			l_CUST_CHRG_PSN_CD.add(((KQ0040010Struct) list.get(i)).getCUST_CHRG_PSN_CD());
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
			l_ODR_ACPT_PSN_CD.add(((KQ0040010Struct) list.get(i)).getODR_ACPT_PSN_CD());
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
			l_DESINATED_DLV_DATE.add(((KQ0040010Struct) list.get(i)).getDESINATED_DLV_DATE());
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
			l_ODR_QTY.add(((KQ0040010Struct) list.get(i)).getODR_QTY());
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
			l_UNIT_NAME.add(((KQ0040010Struct) list.get(i)).getUNIT_NAME());
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
			l_ODR_UNIT_PRICE.add(((KQ0040010Struct) list.get(i)).getODR_UNIT_PRICE());
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
			l_ODR_AMOUNT.add(((KQ0040010Struct) list.get(i)).getODR_AMOUNT());
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
			l_REMAIN_UNCONFIRM_ODR_QTY.add(((KQ0040010Struct) list.get(i)).getREMAIN_UNCONFIRM_ODR_QTY());
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
			l_UNCONFIRM_ODR_BALANCE.add(((KQ0040010Struct) list.get(i)).getUNCONFIRM_ODR_BALANCE());
		}
		return size;
	}
	public int setL2L_UNCONFIRM_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNCONFIRM_ODR_QTY == null) {
			l_UNCONFIRM_ODR_QTY = new ArrayList();
		} else {
			l_UNCONFIRM_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNCONFIRM_ODR_QTY.add(((KQ0040010Struct) list.get(i)).getUNCONFIRM_ODR_QTY());
		}
		return size;
	}
	public int setL2L_UNCONFIRM_ODR_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNCONFIRM_ODR_AMOUNT == null) {
			l_UNCONFIRM_ODR_AMOUNT = new ArrayList();
		} else {
			l_UNCONFIRM_ODR_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNCONFIRM_ODR_AMOUNT.add(((KQ0040010Struct) list.get(i)).getUNCONFIRM_ODR_AMOUNT());
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
			l_DEPO_TYP.add(((KQ0040010Struct) list.get(i)).getDEPO_TYP());
		}
		return size;
	}
	public int setL2L_UNCONFIRMED_ODR_EFF_OVR_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNCONFIRMED_ODR_EFF_OVR_FLG == null) {
			l_UNCONFIRMED_ODR_EFF_OVR_FLG = new ArrayList();
		} else {
			l_UNCONFIRMED_ODR_EFF_OVR_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNCONFIRMED_ODR_EFF_OVR_FLG.add(((KQ0040010Struct) list.get(i)).getUNCONFIRMED_ODR_EFF_OVR_FLG());
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
			l_ODR_NO.add(((KQ0040010Struct) list.get(i)).getODR_NO());
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
			l_MODIFY_COUNT.add(((KQ0040010Struct) list.get(i)).getMODIFY_COUNT());
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
			l_ODR_ACPT_DATE.add(((KQ0040010Struct) list.get(i)).getODR_ACPT_DATE());
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
			l_CURRNCY_CD.add(((KQ0040010Struct) list.get(i)).getCURRNCY_CD());
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
			l_CUR_UNIT.add(((KQ0040010Struct) list.get(i)).getCUR_UNIT());
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
			l_EXCH_TYP.add(((KQ0040010Struct) list.get(i)).getEXCH_TYP());
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
			l_ROUND_TYP.add(((KQ0040010Struct) list.get(i)).getROUND_TYP());
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
			l_ITEM_NAME.add(((KQ0040010Struct) list.get(i)).getITEM_NAME());
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
			l_CUST_ITEM_NAME.add(((KQ0040010Struct) list.get(i)).getCUST_ITEM_NAME());
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
			l_JOB_ODR_CD.add(((KQ0040010Struct) list.get(i)).getJOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_PROJECT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROJECT_CD == null) {
			l_PROJECT_CD = new ArrayList();
		} else {
			l_PROJECT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROJECT_CD.add(((KQ0040010Struct) list.get(i)).getPROJECT_CD());
		}
		return size;
	}
	public int setL2L_ESTIMATE_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ESTIMATE_NO == null) {
			l_ESTIMATE_NO = new ArrayList();
		} else {
			l_ESTIMATE_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ESTIMATE_NO.add(((KQ0040010Struct) list.get(i)).getESTIMATE_NO());
		}
		return size;
	}
	public int setL2L_DETAL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DETAL_NO == null) {
			l_DETAL_NO = new ArrayList();
		} else {
			l_DETAL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DETAL_NO.add(((KQ0040010Struct) list.get(i)).getDETAL_NO());
		}
		return size;
	}
	public int setL2L_PRO_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRO_FLG == null) {
			l_PRO_FLG = new ArrayList();
		} else {
			l_PRO_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRO_FLG.add(((KQ0040010Struct) list.get(i)).getPRO_FLG());
		}
		return size;
	}
	public int setL2L_IN_CUST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_CUST_CD == null) {
			l_IN_CUST_CD = new ArrayList();
		} else {
			l_IN_CUST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_CUST_CD.add(((KQ0040010Struct) list.get(i)).getIN_CUST_CD());
		}
		return size;
	}
	public int setL2L_IN_CUST_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_CUST_ITEM_CD == null) {
			l_IN_CUST_ITEM_CD = new ArrayList();
		} else {
			l_IN_CUST_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_CUST_ITEM_CD.add(((KQ0040010Struct) list.get(i)).getIN_CUST_ITEM_CD());
		}
		return size;
	}
	public int setL2L_IN_CUST_CHRG_PSN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_CUST_CHRG_PSN_CD == null) {
			l_IN_CUST_CHRG_PSN_CD = new ArrayList();
		} else {
			l_IN_CUST_CHRG_PSN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_CUST_CHRG_PSN_CD.add(((KQ0040010Struct) list.get(i)).getIN_CUST_CHRG_PSN_CD());
		}
		return size;
	}
	public int setL2L_IN_CUST_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_CUST_ODR_NO == null) {
			l_IN_CUST_ODR_NO = new ArrayList();
		} else {
			l_IN_CUST_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_CUST_ODR_NO.add(((KQ0040010Struct) list.get(i)).getIN_CUST_ODR_NO());
		}
		return size;
	}
	public int setL2L_FROM_DESINATED_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FROM_DESINATED_DLV_DATE == null) {
			l_FROM_DESINATED_DLV_DATE = new ArrayList();
		} else {
			l_FROM_DESINATED_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FROM_DESINATED_DLV_DATE.add(((KQ0040010Struct) list.get(i)).getFROM_DESINATED_DLV_DATE());
		}
		return size;
	}
	public int setL2L_TO_DESINATED_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TO_DESINATED_DLV_DATE == null) {
			l_TO_DESINATED_DLV_DATE = new ArrayList();
		} else {
			l_TO_DESINATED_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TO_DESINATED_DLV_DATE.add(((KQ0040010Struct) list.get(i)).getTO_DESINATED_DLV_DATE());
		}
		return size;
	}
	public int setL2L_FROM_ODR_ACPT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FROM_ODR_ACPT_DATE == null) {
			l_FROM_ODR_ACPT_DATE = new ArrayList();
		} else {
			l_FROM_ODR_ACPT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FROM_ODR_ACPT_DATE.add(((KQ0040010Struct) list.get(i)).getFROM_ODR_ACPT_DATE());
		}
		return size;
	}
	public int setL2L_TO_ODR_ACPT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TO_ODR_ACPT_DATE == null) {
			l_TO_ODR_ACPT_DATE = new ArrayList();
		} else {
			l_TO_ODR_ACPT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TO_ODR_ACPT_DATE.add(((KQ0040010Struct) list.get(i)).getTO_ODR_ACPT_DATE());
		}
		return size;
	}
	public int setL2L_IN_ODR_TYP_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_ODR_TYP_1 == null) {
			l_IN_ODR_TYP_1 = new ArrayList();
		} else {
			l_IN_ODR_TYP_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_ODR_TYP_1.add(((KQ0040010Struct) list.get(i)).getIN_ODR_TYP_1());
		}
		return size;
	}
	public int setL2L_IN_ODR_TYP_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_ODR_TYP_2 == null) {
			l_IN_ODR_TYP_2 = new ArrayList();
		} else {
			l_IN_ODR_TYP_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_ODR_TYP_2.add(((KQ0040010Struct) list.get(i)).getIN_ODR_TYP_2());
		}
		return size;
	}
	public int setL2L_IN_ODR_TYP_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_ODR_TYP_3 == null) {
			l_IN_ODR_TYP_3 = new ArrayList();
		} else {
			l_IN_ODR_TYP_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_ODR_TYP_3.add(((KQ0040010Struct) list.get(i)).getIN_ODR_TYP_3());
		}
		return size;
	}
	public int setL2L_IN_COMPANY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_COMPANY_CD == null) {
			l_IN_COMPANY_CD = new ArrayList();
		} else {
			l_IN_COMPANY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_COMPANY_CD.add(((KQ0040010Struct) list.get(i)).getIN_COMPANY_CD());
		}
		return size;
	}
	public int setL2L_IN_BUSINESS_OPR_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_BUSINESS_OPR_DATE == null) {
			l_IN_BUSINESS_OPR_DATE = new ArrayList();
		} else {
			l_IN_BUSINESS_OPR_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_BUSINESS_OPR_DATE.add(((KQ0040010Struct) list.get(i)).getIN_BUSINESS_OPR_DATE());
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
			l_PLANT_CD.add(((KQ0040010Struct) list.get(i)).getPLANT_CD());
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
			l_l_COUNT.add(((KQ0040010Struct) list.get(i)).getl_COUNT());
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
			l_ROW_COUNT.add(((KQ0040010Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_CHECK_1 = null;
		m_CHECK_2 = null;
		m_CHECK_4 = null;
		m_DOWNLOAD_FILE = null;
		m_CHECK_PRO_ODR = null;
		m_w_BUSINESS_OPR_DATE = null;
		m_w_PLANT_CD = null;
		m_w_COMPANY_CD = null;
		m_IN_PRO_ODR = null;
		m_ODR_TYP = null;
		m_CUST_ODR_NO = null;
		m_CUST_CD = null;
		m_CUST_NAME = null;
		m_CUST_ITEM_CD = null;
		m_ITEM_CD = null;
		m_CUST_CHRG_PSN_CD = null;
		m_ODR_ACPT_PSN_CD = null;
		m_DESINATED_DLV_DATE = null;
		m_ODR_QTY = null;
		m_UNIT_NAME = null;
		m_ODR_UNIT_PRICE = null;
		m_ODR_AMOUNT = null;
		m_REMAIN_UNCONFIRM_ODR_QTY = null;
		m_UNCONFIRM_ODR_BALANCE = null;
		m_UNCONFIRM_ODR_QTY = null;
		m_UNCONFIRM_ODR_AMOUNT = null;
		m_DEPO_TYP = null;
		m_UNCONFIRMED_ODR_EFF_OVR_FLG = null;
		m_ODR_NO = null;
		m_MODIFY_COUNT = null;
		m_ODR_ACPT_DATE = null;
		m_CURRNCY_CD = null;
		m_CUR_UNIT = null;
		m_EXCH_TYP = null;
		m_ROUND_TYP = null;
		m_ITEM_NAME = null;
		m_CUST_ITEM_NAME = null;
		m_JOB_ODR_CD = null;
		m_PROJECT_CD = null;
		m_ESTIMATE_NO = null;
		m_DETAL_NO = null;
		m_PRO_FLG = null;
		m_IN_CUST_CD = null;
		m_IN_CUST_ITEM_CD = null;
		m_IN_CUST_CHRG_PSN_CD = null;
		m_IN_CUST_ODR_NO = null;
		m_FROM_DESINATED_DLV_DATE = null;
		m_TO_DESINATED_DLV_DATE = null;
		m_FROM_ODR_ACPT_DATE = null;
		m_TO_ODR_ACPT_DATE = null;
		m_IN_ODR_TYP_1 = null;
		m_IN_ODR_TYP_2 = null;
		m_IN_ODR_TYP_3 = null;
		m_IN_COMPANY_CD = null;
		m_IN_BUSINESS_OPR_DATE = null;
		m_PLANT_CD = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;

		l_CHECK_1 = null;
		l_CHECK_2 = null;
		l_CHECK_4 = null;
		l_DOWNLOAD_FILE = null;
		l_CHECK_PRO_ODR = null;
		l_w_BUSINESS_OPR_DATE = null;
		l_w_PLANT_CD = null;
		l_w_COMPANY_CD = null;
		l_IN_PRO_ODR = null;
		l_ODR_TYP = null;
		l_CUST_ODR_NO = null;
		l_CUST_CD = null;
		l_CUST_NAME = null;
		l_CUST_ITEM_CD = null;
		l_ITEM_CD = null;
		l_CUST_CHRG_PSN_CD = null;
		l_ODR_ACPT_PSN_CD = null;
		l_DESINATED_DLV_DATE = null;
		l_ODR_QTY = null;
		l_UNIT_NAME = null;
		l_ODR_UNIT_PRICE = null;
		l_ODR_AMOUNT = null;
		l_REMAIN_UNCONFIRM_ODR_QTY = null;
		l_UNCONFIRM_ODR_BALANCE = null;
		l_UNCONFIRM_ODR_QTY = null;
		l_UNCONFIRM_ODR_AMOUNT = null;
		l_DEPO_TYP = null;
		l_UNCONFIRMED_ODR_EFF_OVR_FLG = null;
		l_ODR_NO = null;
		l_MODIFY_COUNT = null;
		l_ODR_ACPT_DATE = null;
		l_CURRNCY_CD = null;
		l_CUR_UNIT = null;
		l_EXCH_TYP = null;
		l_ROUND_TYP = null;
		l_ITEM_NAME = null;
		l_CUST_ITEM_NAME = null;
		l_JOB_ODR_CD = null;
		l_PROJECT_CD = null;
		l_ESTIMATE_NO = null;
		l_DETAL_NO = null;
		l_PRO_FLG = null;
		l_IN_CUST_CD = null;
		l_IN_CUST_ITEM_CD = null;
		l_IN_CUST_CHRG_PSN_CD = null;
		l_IN_CUST_ODR_NO = null;
		l_FROM_DESINATED_DLV_DATE = null;
		l_TO_DESINATED_DLV_DATE = null;
		l_FROM_ODR_ACPT_DATE = null;
		l_TO_ODR_ACPT_DATE = null;
		l_IN_ODR_TYP_1 = null;
		l_IN_ODR_TYP_2 = null;
		l_IN_ODR_TYP_3 = null;
		l_IN_COMPANY_CD = null;
		l_IN_BUSINESS_OPR_DATE = null;
		l_PLANT_CD = null;
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
	 * medKQ0040010�N���X�̕W���R���X�g���N�^
	 */
	public KQ0040010Struct()
	{
		//{{user_implement_code_constractor
                 // TODO: �����ɏ����������L�q���Ă�������
                initialize();
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
	public void setStruct(KQ0040010Struct struct)
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
	public void setStructM(KQ0040010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setCHECK_1(struct.getCHECK_1());
			this.setCHECK_2(struct.getCHECK_2());
			this.setCHECK_4(struct.getCHECK_4());
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setCHECK_PRO_ODR(struct.getCHECK_PRO_ODR());
			this.setw_BUSINESS_OPR_DATE(struct.getw_BUSINESS_OPR_DATE());
			this.setw_PLANT_CD(struct.getw_PLANT_CD());
			this.setw_COMPANY_CD(struct.getw_COMPANY_CD());
			this.setIN_PRO_ODR(struct.getIN_PRO_ODR());
			this.setODR_TYP(struct.getODR_TYP());
			this.setCUST_ODR_NO(struct.getCUST_ODR_NO());
			this.setCUST_CD(struct.getCUST_CD());
			this.setCUST_NAME(struct.getCUST_NAME());
			this.setCUST_ITEM_CD(struct.getCUST_ITEM_CD());
			this.setITEM_CD(struct.getITEM_CD());
			this.setCUST_CHRG_PSN_CD(struct.getCUST_CHRG_PSN_CD());
			this.setODR_ACPT_PSN_CD(struct.getODR_ACPT_PSN_CD());
			this.setDESINATED_DLV_DATE(struct.getDESINATED_DLV_DATE());
			this.setODR_QTY(struct.getODR_QTY());
			this.setUNIT_NAME(struct.getUNIT_NAME());
			this.setODR_UNIT_PRICE(struct.getODR_UNIT_PRICE());
			this.setODR_AMOUNT(struct.getODR_AMOUNT());
			this.setREMAIN_UNCONFIRM_ODR_QTY(struct.getREMAIN_UNCONFIRM_ODR_QTY());
			this.setUNCONFIRM_ODR_BALANCE(struct.getUNCONFIRM_ODR_BALANCE());
			this.setUNCONFIRM_ODR_QTY(struct.getUNCONFIRM_ODR_QTY());
			this.setUNCONFIRM_ODR_AMOUNT(struct.getUNCONFIRM_ODR_AMOUNT());
			this.setDEPO_TYP(struct.getDEPO_TYP());
			this.setUNCONFIRMED_ODR_EFF_OVR_FLG(struct.getUNCONFIRMED_ODR_EFF_OVR_FLG());
			this.setODR_NO(struct.getODR_NO());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setODR_ACPT_DATE(struct.getODR_ACPT_DATE());
			this.setCURRNCY_CD(struct.getCURRNCY_CD());
			this.setCUR_UNIT(struct.getCUR_UNIT());
			this.setEXCH_TYP(struct.getEXCH_TYP());
			this.setROUND_TYP(struct.getROUND_TYP());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setCUST_ITEM_NAME(struct.getCUST_ITEM_NAME());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setPROJECT_CD(struct.getPROJECT_CD());
			this.setESTIMATE_NO(struct.getESTIMATE_NO());
			this.setDETAL_NO(struct.getDETAL_NO());
			this.setPRO_FLG(struct.getPRO_FLG());
			this.setIN_CUST_CD(struct.getIN_CUST_CD());
			this.setIN_CUST_ITEM_CD(struct.getIN_CUST_ITEM_CD());
			this.setIN_CUST_CHRG_PSN_CD(struct.getIN_CUST_CHRG_PSN_CD());
			this.setIN_CUST_ODR_NO(struct.getIN_CUST_ODR_NO());
			this.setFROM_DESINATED_DLV_DATE(struct.getFROM_DESINATED_DLV_DATE());
			this.setTO_DESINATED_DLV_DATE(struct.getTO_DESINATED_DLV_DATE());
			this.setFROM_ODR_ACPT_DATE(struct.getFROM_ODR_ACPT_DATE());
			this.setTO_ODR_ACPT_DATE(struct.getTO_ODR_ACPT_DATE());
			this.setIN_ODR_TYP_1(struct.getIN_ODR_TYP_1());
			this.setIN_ODR_TYP_2(struct.getIN_ODR_TYP_2());
			this.setIN_ODR_TYP_3(struct.getIN_ODR_TYP_3());
			this.setIN_COMPANY_CD(struct.getIN_COMPANY_CD());
			this.setIN_BUSINESS_OPR_DATE(struct.getIN_BUSINESS_OPR_DATE());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setl_COUNT(struct.getl_COUNT());
			this.setROW_COUNT(struct.getROW_COUNT());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(KQ0040010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_CHECK_1(struct.getList_CHECK_1());
			this.setList_CHECK_2(struct.getList_CHECK_2());
			this.setList_CHECK_4(struct.getList_CHECK_4());
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_CHECK_PRO_ODR(struct.getList_CHECK_PRO_ODR());
			this.setList_w_BUSINESS_OPR_DATE(struct.getList_w_BUSINESS_OPR_DATE());
			this.setList_w_PLANT_CD(struct.getList_w_PLANT_CD());
			this.setList_w_COMPANY_CD(struct.getList_w_COMPANY_CD());
			this.setList_IN_PRO_ODR(struct.getList_IN_PRO_ODR());
			this.setList_ODR_TYP(struct.getList_ODR_TYP());
			this.setList_CUST_ODR_NO(struct.getList_CUST_ODR_NO());
			this.setList_CUST_CD(struct.getList_CUST_CD());
			this.setList_CUST_NAME(struct.getList_CUST_NAME());
			this.setList_CUST_ITEM_CD(struct.getList_CUST_ITEM_CD());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_CUST_CHRG_PSN_CD(struct.getList_CUST_CHRG_PSN_CD());
			this.setList_ODR_ACPT_PSN_CD(struct.getList_ODR_ACPT_PSN_CD());
			this.setList_DESINATED_DLV_DATE(struct.getList_DESINATED_DLV_DATE());
			this.setList_ODR_QTY(struct.getList_ODR_QTY());
			this.setList_UNIT_NAME(struct.getList_UNIT_NAME());
			this.setList_ODR_UNIT_PRICE(struct.getList_ODR_UNIT_PRICE());
			this.setList_ODR_AMOUNT(struct.getList_ODR_AMOUNT());
			this.setList_REMAIN_UNCONFIRM_ODR_QTY(struct.getList_REMAIN_UNCONFIRM_ODR_QTY());
			this.setList_UNCONFIRM_ODR_BALANCE(struct.getList_UNCONFIRM_ODR_BALANCE());
			this.setList_UNCONFIRM_ODR_QTY(struct.getList_UNCONFIRM_ODR_QTY());
			this.setList_UNCONFIRM_ODR_AMOUNT(struct.getList_UNCONFIRM_ODR_AMOUNT());
			this.setList_DEPO_TYP(struct.getList_DEPO_TYP());
			this.setList_UNCONFIRMED_ODR_EFF_OVR_FLG(struct.getList_UNCONFIRMED_ODR_EFF_OVR_FLG());
			this.setList_ODR_NO(struct.getList_ODR_NO());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_ODR_ACPT_DATE(struct.getList_ODR_ACPT_DATE());
			this.setList_CURRNCY_CD(struct.getList_CURRNCY_CD());
			this.setList_CUR_UNIT(struct.getList_CUR_UNIT());
			this.setList_EXCH_TYP(struct.getList_EXCH_TYP());
			this.setList_ROUND_TYP(struct.getList_ROUND_TYP());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_CUST_ITEM_NAME(struct.getList_CUST_ITEM_NAME());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_PROJECT_CD(struct.getList_PROJECT_CD());
			this.setList_ESTIMATE_NO(struct.getList_ESTIMATE_NO());
			this.setList_DETAL_NO(struct.getList_DETAL_NO());
			this.setList_PRO_FLG(struct.getList_PRO_FLG());
			this.setList_IN_CUST_CD(struct.getList_IN_CUST_CD());
			this.setList_IN_CUST_ITEM_CD(struct.getList_IN_CUST_ITEM_CD());
			this.setList_IN_CUST_CHRG_PSN_CD(struct.getList_IN_CUST_CHRG_PSN_CD());
			this.setList_IN_CUST_ODR_NO(struct.getList_IN_CUST_ODR_NO());
			this.setList_FROM_DESINATED_DLV_DATE(struct.getList_FROM_DESINATED_DLV_DATE());
			this.setList_TO_DESINATED_DLV_DATE(struct.getList_TO_DESINATED_DLV_DATE());
			this.setList_FROM_ODR_ACPT_DATE(struct.getList_FROM_ODR_ACPT_DATE());
			this.setList_TO_ODR_ACPT_DATE(struct.getList_TO_ODR_ACPT_DATE());
			this.setList_IN_ODR_TYP_1(struct.getList_IN_ODR_TYP_1());
			this.setList_IN_ODR_TYP_2(struct.getList_IN_ODR_TYP_2());
			this.setList_IN_ODR_TYP_3(struct.getList_IN_ODR_TYP_3());
			this.setList_IN_COMPANY_CD(struct.getList_IN_COMPANY_CD());
			this.setList_IN_BUSINESS_OPR_DATE(struct.getList_IN_BUSINESS_OPR_DATE());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
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
	// �� 1 �ϐ������l�F i_CHECK_1


	final static String i_CHECK_1 = null;

	// �� 2 �ϐ������l�F i_CHECK_2


	final static String i_CHECK_2 = null;

	// �� 3 �ϐ������l�F i_CHECK_4


	final static String i_CHECK_4 = null;

	// �� 4 �ϐ������l�F i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// �� 5 �ϐ������l�F i_CHECK_PRO_ODR


	final static String i_CHECK_PRO_ODR = null;

	// �� 6 �ϐ������l�F i_w_BUSINESS_OPR_DATE


	final static String i_w_BUSINESS_OPR_DATE = null;

	// �� 7 �ϐ������l�F i_w_PLANT_CD


	final static String i_w_PLANT_CD = null;

	// �� 8 �ϐ������l�F i_w_COMPANY_CD


	final static String i_w_COMPANY_CD = null;

	// �� 9 �ϐ������l�F i_IN_PRO_ODR


	final static String i_IN_PRO_ODR = null;

	// �� 10 �ϐ������l�F i_ODR_TYP


	final static String i_ODR_TYP = null;

	// �� 11 �ϐ������l�F i_CUST_ODR_NO


	final static String i_CUST_ODR_NO = null;

	// �� 12 �ϐ������l�F i_CUST_CD


	final static String i_CUST_CD = null;

	// �� 13 �ϐ������l�F i_CUST_NAME


	final static String i_CUST_NAME = null;

	// �� 14 �ϐ������l�F i_CUST_ITEM_CD


	final static String i_CUST_ITEM_CD = null;

	// �� 15 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 16 �ϐ������l�F i_CUST_CHRG_PSN_CD


	final static String i_CUST_CHRG_PSN_CD = null;

	// �� 17 �ϐ������l�F i_ODR_ACPT_PSN_CD


	final static String i_ODR_ACPT_PSN_CD = null;

	// �� 18 �ϐ������l�F i_DESINATED_DLV_DATE


	final static String i_DESINATED_DLV_DATE = null;

	// �� 19 �ϐ������l�F i_ODR_QTY


	final static String i_ODR_QTY = null;

	// �� 20 �ϐ������l�F i_UNIT_NAME


	final static String i_UNIT_NAME = null;

	// �� 21 �ϐ������l�F i_ODR_UNIT_PRICE


	final static String i_ODR_UNIT_PRICE = null;

	// �� 22 �ϐ������l�F i_ODR_AMOUNT


	final static String i_ODR_AMOUNT = null;

	// �� 23 �ϐ������l�F i_REMAIN_UNCONFIRM_ODR_QTY


	final static String i_REMAIN_UNCONFIRM_ODR_QTY = null;

	// �� 24 �ϐ������l�F i_UNCONFIRM_ODR_BALANCE


	final static String i_UNCONFIRM_ODR_BALANCE = null;

	// �� 25 �ϐ������l�F i_UNCONFIRM_ODR_QTY


	final static String i_UNCONFIRM_ODR_QTY = null;

	// �� 26 �ϐ������l�F i_UNCONFIRM_ODR_AMOUNT


	final static String i_UNCONFIRM_ODR_AMOUNT = null;

	// �� 27 �ϐ������l�F i_DEPO_TYP


	final static String i_DEPO_TYP = null;

	// �� 28 �ϐ������l�F i_UNCONFIRMED_ODR_EFF_OVR_FLG


	final static String i_UNCONFIRMED_ODR_EFF_OVR_FLG = null;

	// �� 29 �ϐ������l�F i_ODR_NO


	final static String i_ODR_NO = null;

	// �� 30 �ϐ������l�F i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// �� 31 �ϐ������l�F i_ODR_ACPT_DATE


	final static String i_ODR_ACPT_DATE = null;

	// �� 32 �ϐ������l�F i_CURRNCY_CD


	final static String i_CURRNCY_CD = null;

	// �� 33 �ϐ������l�F i_CUR_UNIT


	final static String i_CUR_UNIT = null;

	// �� 34 �ϐ������l�F i_EXCH_TYP


	final static String i_EXCH_TYP = null;

	// �� 35 �ϐ������l�F i_ROUND_TYP


	final static String i_ROUND_TYP = null;

	// �� 36 �ϐ������l�F i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// �� 37 �ϐ������l�F i_CUST_ITEM_NAME


	final static String i_CUST_ITEM_NAME = null;

	// �� 38 �ϐ������l�F i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// �� 39 �ϐ������l�F i_PROJECT_CD


	final static String i_PROJECT_CD = null;

	// �� 40 �ϐ������l�F i_ESTIMATE_NO


	final static String i_ESTIMATE_NO = null;

	// �� 41 �ϐ������l�F i_DETAL_NO


	final static String i_DETAL_NO = null;

	// �� 42 �ϐ������l�F i_PRO_FLG


	final static String i_PRO_FLG = null;

	// �� 43 �ϐ������l�F i_IN_CUST_CD


	final static String i_IN_CUST_CD = null;

	// �� 44 �ϐ������l�F i_IN_CUST_ITEM_CD


	final static String i_IN_CUST_ITEM_CD = null;

	// �� 45 �ϐ������l�F i_IN_CUST_CHRG_PSN_CD


	final static String i_IN_CUST_CHRG_PSN_CD = null;

	// �� 46 �ϐ������l�F i_IN_CUST_ODR_NO


	final static String i_IN_CUST_ODR_NO = null;

	// �� 47 �ϐ������l�F i_FROM_DESINATED_DLV_DATE


	final static String i_FROM_DESINATED_DLV_DATE = null;

	// �� 48 �ϐ������l�F i_TO_DESINATED_DLV_DATE


	final static String i_TO_DESINATED_DLV_DATE = null;

	// �� 49 �ϐ������l�F i_FROM_ODR_ACPT_DATE


	final static String i_FROM_ODR_ACPT_DATE = null;

	// �� 50 �ϐ������l�F i_TO_ODR_ACPT_DATE


	final static String i_TO_ODR_ACPT_DATE = null;

	// �� 51 �ϐ������l�F i_IN_ODR_TYP_1


	final static String i_IN_ODR_TYP_1 = null;

	// �� 52 �ϐ������l�F i_IN_ODR_TYP_2


	final static String i_IN_ODR_TYP_2 = null;

	// �� 53 �ϐ������l�F i_IN_ODR_TYP_3


	final static String i_IN_ODR_TYP_3 = null;

	// �� 54 �ϐ������l�F i_IN_COMPANY_CD


	final static String i_IN_COMPANY_CD = null;

	// �� 55 �ϐ������l�F i_IN_BUSINESS_OPR_DATE


	final static String i_IN_BUSINESS_OPR_DATE = null;

	// �� 56 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 57 �ϐ������l�F i_l_COUNT


	final static String i_l_COUNT = null;

	// �� 58 �ϐ������l�F i_ROW_COUNT


	final static String i_ROW_COUNT = null;

*/

	//{{user_implement_code
         // TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        // �� 1 �ϐ������l�F i_ODR_TYP
        final static String i_ODR_TYP = null;
        
        /**
         * ������
         *
         */
        public void initialize()
        {
         m_ODR_TYP = i_ODR_TYP;
       
         l_ODR_TYP = null;
        }
        //}}user_implement_code

	//////////////////////////////

}
