/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KQ0010/src/com/nec/jp/orteus/metamorBase/KQ0010/KQ0010030Struct.java,v $
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
 * CLASS     : KQ0010030Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: geng-jia $
 * @version $Revision: 1.10 $ $Date: 2015/12/03 08:12:32 $
 *
 */
//}}user_implement_code_header

public class KQ0010030Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_r1_FILTER1 */
	public String m_r1_FILTER1 = null;
	/** �� 2 �ϐ��F m_r2_FILTER1 */
	public String m_r2_FILTER1 = null;
	/** �� 3 �ϐ��F m_r3_FILTER1 */
	public String m_r3_FILTER1 = null;
	/** �� 4 �ϐ��F m_h_SELECT_TYP */
	public String m_h_SELECT_TYP = null;
	/** �� 5 �ϐ��F m_h_REQUEST_APPR_SAME */
	public String m_h_REQUEST_APPR_SAME = null;
	/** �� 6 �ϐ��F m_RESERVE_CAUSE */
	public String m_RESERVE_CAUSE = null;
	/** �� 7 �ϐ��F m_l_PROC_TYP_VALUE */
	public String m_l_PROC_TYP_VALUE = null;
	/** �� 8 �ϐ��F m_l_ODR_TYP_DN */
	public String m_l_ODR_TYP_DN = null;
	/** �� 9 �ϐ��F m_l_ODR_TYP */
	public String m_l_ODR_TYP = null;
	/** �� 10 �ϐ��F m_l_CUST_ODR_NO */
	public String m_l_CUST_ODR_NO = null;
	/** �� 11 �ϐ��F m_l_CUST_ITEM_CD */
	public String m_l_CUST_ITEM_CD = null;
	/** �� 12 �ϐ��F m_l_ITEM_CD */
	public String m_l_ITEM_CD = null;
	/** �� 13 �ϐ��F m_l_CUST_CD */
	public String m_l_CUST_CD = null;
	/** �� 14 �ϐ��F m_l_CUST_ANAME */
	public String m_l_CUST_ANAME = null;
	/** �� 15 �ϐ��F m_l_DESINATED_DLV_DATE */
	public String m_l_DESINATED_DLV_DATE = null;
	/** �� 16 �ϐ��F m_l_ODR_QTY */
	public String m_l_ODR_QTY = null;
	/** �� 17 �ϐ��F m_l_UNIT_CD */
	public String m_l_UNIT_CD = null;
	/** �� 18 �ϐ��F m_l_ODR_UNIT_PRICE */
	public String m_l_ODR_UNIT_PRICE = null;
	/** �� 19 �ϐ��F m_l_CUR_UNIT */
	public String m_l_CUR_UNIT = null;
	/** �� 20 �ϐ��F m_l_SPCL_PRICE_TYP_DN */
	public String m_l_SPCL_PRICE_TYP_DN = null;
	/** �� 21 �ϐ��F m_l_SPCL_PRICE_TYP */
	public String m_l_SPCL_PRICE_TYP = null;
	/** �� 22 �ϐ��F m_l_DLV_LOC_CD */
	public String m_l_DLV_LOC_CD = null;
	/** �� 23 �ϐ��F m_l_DLV_LOC_NAME */
	public String m_l_DLV_LOC_NAME = null;
	/** �� 24 �ϐ��F m_l_DEPO_TYP_DN */
	public String m_l_DEPO_TYP_DN = null;
	/** �� 25 �ϐ��F m_l_DEPO_TYP */
	public String m_l_DEPO_TYP = null;
	/** �� 26 �ϐ��F m_l_CUST_ITEM_NAME */
	public String m_l_CUST_ITEM_NAME = null;
	/** �� 27 �ϐ��F m_l_ITEM_NAME */
	public String m_l_ITEM_NAME = null;
	/** �� 28 �ϐ��F m_l_ODR_ACPT_DATE */
	public String m_l_ODR_ACPT_DATE = null;
	/** �� 29 �ϐ��F m_l_JOB_ODR_CD */
	public String m_l_JOB_ODR_CD = null;
	/** �� 30 �ϐ��F m_l_JOB_ODR_QTY */
	public String m_l_JOB_ODR_QTY = null;
	/** �� 31 �ϐ��F m_l_JOB_ODR_DLV_DATE */
	public String m_l_JOB_ODR_DLV_DATE = null;
	/** �� 32 �ϐ��F m_l_ALC_GRP_CD */
	public String m_l_ALC_GRP_CD = null;
	/** �� 33 �ϐ��F m_l_REMARKS */
	public String m_l_REMARKS = null;
	/** �� 34 �ϐ��F m_l_CUS_DLV_KEY_CD */
	public String m_l_CUS_DLV_KEY_CD = null;
	/** �� 35 �ϐ��F m_l_CUS_DLV_CD */
	public String m_l_CUS_DLV_CD = null;
	/** �� 36 �ϐ��F m_d_NEW_CUST_ODR_NO */
	public String m_d_NEW_CUST_ODR_NO = null;
	/** �� 37 �ϐ��F m_d_CUST_ODR_NO_CHANGE */
	public String m_d_CUST_ODR_NO_CHANGE = null;
	/** �� 38 �ϐ��F m_d_NEW_CUST_CD */
	public String m_d_NEW_CUST_CD = null;
	/** �� 39 �ϐ��F m_d_CUST_CD_CHANGE */
	public String m_d_CUST_CD_CHANGE = null;
	/** �� 40 �ϐ��F m_d_NEW_CUST_ITEM_CD */
	public String m_d_NEW_CUST_ITEM_CD = null;
	/** �� 41 �ϐ��F m_d_CUST_ITEM_CD_CHANGE */
	public String m_d_CUST_ITEM_CD_CHANGE = null;
	/** �� 42 �ϐ��F m_d_DLV_LOC_CD_CHANGE */
	public String m_d_DLV_LOC_CD_CHANGE = null;
	/** �� 43 �ϐ��F m_d_NEW_ODR_QTY */
	public String m_d_NEW_ODR_QTY = null;
	/** �� 44 �ϐ��F m_d_ODR_QTY_CHANGE */
	public String m_d_ODR_QTY_CHANGE = null;
	/** �� 45 �ϐ��F m_d_NEW_DESINATED_DLV_DATE */
	public String m_d_NEW_DESINATED_DLV_DATE = null;
	/** �� 46 �ϐ��F m_d_DESINATED_DLV_DATE_CHANGE */
	public String m_d_DESINATED_DLV_DATE_CHANGE = null;
	/** �� 47 �ϐ��F m_d_NEW_SPCL_PRICE_TYP */
	public String m_d_NEW_SPCL_PRICE_TYP = null;
	/** �� 48 �ϐ��F m_d_SPCL_PRICE_TYP_CHANGE */
	public String m_d_SPCL_PRICE_TYP_CHANGE = null;
	/** �� 49 �ϐ��F m_d_NEW_ODR_UNIT_PRICE */
	public String m_d_NEW_ODR_UNIT_PRICE = null;
	/** �� 50 �ϐ��F m_d_ODR_UNIT_PRICE_CHANGE */
	public String m_d_ODR_UNIT_PRICE_CHANGE = null;
	/** �� 51 �ϐ��F m_d_NEW_DLV_LOC_CD */
	public String m_d_NEW_DLV_LOC_CD = null;
	/** �� 52 �ϐ��F m_d_NEW_REMARKS */
	public String m_d_NEW_REMARKS = null;
	/** �� 53 �ϐ��F m_d_REMARKS_CHANGE */
	public String m_d_REMARKS_CHANGE = null;
	/** �� 54 �ϐ��F m_d_NEW_ODR_NO */
	public String m_d_NEW_ODR_NO = null;
	/** �� 55 �ϐ��F m_d_ODR_NO_CHANGE */
	public String m_d_ODR_NO_CHANGE = null;
	/** �� 56 �ϐ��F m_d_NEW_ODR_TYP */
	public String m_d_NEW_ODR_TYP = null;
	/** �� 57 �ϐ��F m_d_ODR_TYP_CHANGE */
	public String m_d_ODR_TYP_CHANGE = null;
	/** �� 58 �ϐ��F m_l_STATUS_NAME */
	public String m_l_STATUS_NAME = null;
	/** �� 59 �ϐ��F m_l_PROJECT_CD */
	public String m_l_PROJECT_CD = null;
	/** �� 60 �ϐ��F m_l_ESTIMATE_NO */
	public String m_l_ESTIMATE_NO = null;
	/** �� 61 �ϐ��F m_l_DETAL_NO */
	public String m_l_DETAL_NO = null;
	/** �� 62 �ϐ��F m_l_ESTIMATE_TYPE */
	public String m_l_ESTIMATE_TYPE = null;
	/** �� 63 �ϐ��F m_l_h_ESTIMATE_TYPE */
	public String m_l_h_ESTIMATE_TYPE = null;
	/** �� 64 �ϐ��F m_l_OWN_PERSON_CD */
	public String m_l_OWN_PERSON_CD = null;
	/** �� 65 �ϐ��F m_l_OWN_ORG_CD */
	public String m_l_OWN_ORG_CD = null;
	/** �� 66 �ϐ��F m_l_ORGN_ODR_NO */
	public String m_l_ORGN_ODR_NO = null;
	/** �� 67 �ϐ��F m_l_ADD_ODR_FLG */
	public String m_l_ADD_ODR_FLG = null;
	/** �� 68 �ϐ��F m_l_h_ODR_TYP */
	public String m_l_h_ODR_TYP = null;
	/** �� 69 �ϐ��F m_l_h_DEPO_TYP */
	public String m_l_h_DEPO_TYP = null;
	/** �� 70 �ϐ��F m_h_APPR_POWER_TYP */
	public String m_h_APPR_POWER_TYP = null;
	/** �� 71 �ϐ��F m_LOGIN_USER_CD */
	public String m_LOGIN_USER_CD = null;
	/** �� 72 �ϐ��F m_h_APPR_ID */
	public String m_h_APPR_ID = null;
	/** �� 73 �ϐ��F m_h_SCREEN_URL */
	public String m_h_SCREEN_URL = null;
	/** �� 74 �ϐ��F m_h_STATUS */
	public String m_h_STATUS = null;
	/** �� 75 �ϐ��F m_h_PROC_TYP */
	public String m_h_PROC_TYP = null;
	/** �� 76 �ϐ��F m_l_REQUEST_BY */
	public String m_l_REQUEST_BY = null;
	/** �� 77 �ϐ��F m_l_REQUEST_BY_NAME */
	public String m_l_REQUEST_BY_NAME = null;
	/** �� 78 �ϐ��F m_l_REQUEST_DATE */
	public String m_l_REQUEST_DATE = null;
	/** �� 79 �ϐ��F m_l_APPR_REMARKS */
	public String m_l_APPR_REMARKS = null;
	/** �� 80 �ϐ��F m_l_RESERVE_CAUSE */
	public String m_l_RESERVE_CAUSE = null;
	/** �� 81 �ϐ��F m_h_MODIFY_COUNT */
	public String m_h_MODIFY_COUNT = null;
	/** �� 82 �ϐ��F m_START_DATE */
	public String m_START_DATE = null;
	/** �� 83 �ϐ��F m_END_DATE */
	public String m_END_DATE = null;
	/** �� 84 �ϐ��F m_CUST_CD */
	public String m_CUST_CD = null;
	/** �� 85 �ϐ��F m_FIELD_NAME */
	public String m_FIELD_NAME = null;
	/** �� 86 �ϐ��F m_FIELD_VALUE */
	public String m_FIELD_VALUE = null;
	/** �� 87 �ϐ��F m_FIELD_FLG */
	public String m_FIELD_FLG = null;
	/** �� 88 �ϐ��F m_d_OLD_ODR_NO */
	public String m_d_OLD_ODR_NO = null;
	/** �� 89 �ϐ��F m_d_OLD_ODR_TYP */
	public String m_d_OLD_ODR_TYP = null;
	/** �� 90 �ϐ��F m_d_OLD_CUST_ODR_NO */
	public String m_d_OLD_CUST_ODR_NO = null;
	/** �� 91 �ϐ��F m_d_OLD_CUST_CD */
	public String m_d_OLD_CUST_CD = null;
	/** �� 92 �ϐ��F m_d_OLD_CUST_ITEM_CD */
	public String m_d_OLD_CUST_ITEM_CD = null;
	/** �� 93 �ϐ��F m_d_OLD_DLV_LOC_CD */
	public String m_d_OLD_DLV_LOC_CD = null;
	/** �� 94 �ϐ��F m_d_OLD_ODR_QTY */
	public String m_d_OLD_ODR_QTY = null;
	/** �� 95 �ϐ��F m_d_OLD_DESINATED_DLV_DATE */
	public String m_d_OLD_DESINATED_DLV_DATE = null;
	/** �� 96 �ϐ��F m_d_OLD_SPCL_PRICE_TYP */
	public String m_d_OLD_SPCL_PRICE_TYP = null;
	/** �� 97 �ϐ��F m_d_OLD_ODR_UNIT_PRICE */
	public String m_d_OLD_ODR_UNIT_PRICE = null;
	/** �� 98 �ϐ��F m_d_OLD_REMARKS */
	public String m_d_OLD_REMARKS = null;
	/** �� 99 �ϐ��F m_h_ODR_NO */
	public String m_h_ODR_NO = null;
	/** �� 100 �ϐ��F m_l_COUNT */
	public String m_l_COUNT = null;
	/** �� 101 �ϐ��F m_ROW_COUNT */
	public String m_ROW_COUNT = null;
	/** �� 102 �ϐ��F m_l_ODR_CMPLT_FLG */
	public String m_l_ODR_CMPLT_FLG = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_r1_FILTER1 */
	public List l_r1_FILTER1 = null;

	/** �� 2 List�ϐ��F l_r2_FILTER1 */
	public List l_r2_FILTER1 = null;

	/** �� 3 List�ϐ��F l_r3_FILTER1 */
	public List l_r3_FILTER1 = null;

	/** �� 4 List�ϐ��F l_h_SELECT_TYP */
	public List l_h_SELECT_TYP = null;

	/** �� 5 List�ϐ��F l_h_REQUEST_APPR_SAME */
	public List l_h_REQUEST_APPR_SAME = null;

	/** �� 6 List�ϐ��F l_RESERVE_CAUSE */
	public List l_RESERVE_CAUSE = null;

	/** �� 7 List�ϐ��F l_l_PROC_TYP_VALUE */
	public List l_l_PROC_TYP_VALUE = null;

	/** �� 8 List�ϐ��F l_l_ODR_TYP_DN */
	public List l_l_ODR_TYP_DN = null;

	/** �� 9 List�ϐ��F l_l_ODR_TYP */
	public List l_l_ODR_TYP = null;

	/** �� 10 List�ϐ��F l_l_CUST_ODR_NO */
	public List l_l_CUST_ODR_NO = null;

	/** �� 11 List�ϐ��F l_l_CUST_ITEM_CD */
	public List l_l_CUST_ITEM_CD = null;

	/** �� 12 List�ϐ��F l_l_ITEM_CD */
	public List l_l_ITEM_CD = null;

	/** �� 13 List�ϐ��F l_l_CUST_CD */
	public List l_l_CUST_CD = null;

	/** �� 14 List�ϐ��F l_l_CUST_ANAME */
	public List l_l_CUST_ANAME = null;

	/** �� 15 List�ϐ��F l_l_DESINATED_DLV_DATE */
	public List l_l_DESINATED_DLV_DATE = null;

	/** �� 16 List�ϐ��F l_l_ODR_QTY */
	public List l_l_ODR_QTY = null;

	/** �� 17 List�ϐ��F l_l_UNIT_CD */
	public List l_l_UNIT_CD = null;

	/** �� 18 List�ϐ��F l_l_ODR_UNIT_PRICE */
	public List l_l_ODR_UNIT_PRICE = null;

	/** �� 19 List�ϐ��F l_l_CUR_UNIT */
	public List l_l_CUR_UNIT = null;

	/** �� 20 List�ϐ��F l_l_SPCL_PRICE_TYP_DN */
	public List l_l_SPCL_PRICE_TYP_DN = null;

	/** �� 21 List�ϐ��F l_l_SPCL_PRICE_TYP */
	public List l_l_SPCL_PRICE_TYP = null;

	/** �� 22 List�ϐ��F l_l_DLV_LOC_CD */
	public List l_l_DLV_LOC_CD = null;

	/** �� 23 List�ϐ��F l_l_DLV_LOC_NAME */
	public List l_l_DLV_LOC_NAME = null;

	/** �� 24 List�ϐ��F l_l_DEPO_TYP_DN */
	public List l_l_DEPO_TYP_DN = null;

	/** �� 25 List�ϐ��F l_l_DEPO_TYP */
	public List l_l_DEPO_TYP = null;

	/** �� 26 List�ϐ��F l_l_CUST_ITEM_NAME */
	public List l_l_CUST_ITEM_NAME = null;

	/** �� 27 List�ϐ��F l_l_ITEM_NAME */
	public List l_l_ITEM_NAME = null;

	/** �� 28 List�ϐ��F l_l_ODR_ACPT_DATE */
	public List l_l_ODR_ACPT_DATE = null;

	/** �� 29 List�ϐ��F l_l_JOB_ODR_CD */
	public List l_l_JOB_ODR_CD = null;

	/** �� 30 List�ϐ��F l_l_JOB_ODR_QTY */
	public List l_l_JOB_ODR_QTY = null;

	/** �� 31 List�ϐ��F l_l_JOB_ODR_DLV_DATE */
	public List l_l_JOB_ODR_DLV_DATE = null;

	/** �� 32 List�ϐ��F l_l_ALC_GRP_CD */
	public List l_l_ALC_GRP_CD = null;

	/** �� 33 List�ϐ��F l_l_REMARKS */
	public List l_l_REMARKS = null;

	/** �� 34 List�ϐ��F l_l_CUS_DLV_KEY_CD */
	public List l_l_CUS_DLV_KEY_CD = null;

	/** �� 35 List�ϐ��F l_l_CUS_DLV_CD */
	public List l_l_CUS_DLV_CD = null;

	/** �� 36 List�ϐ��F l_d_NEW_CUST_ODR_NO */
	public List l_d_NEW_CUST_ODR_NO = null;

	/** �� 37 List�ϐ��F l_d_CUST_ODR_NO_CHANGE */
	public List l_d_CUST_ODR_NO_CHANGE = null;

	/** �� 38 List�ϐ��F l_d_NEW_CUST_CD */
	public List l_d_NEW_CUST_CD = null;

	/** �� 39 List�ϐ��F l_d_CUST_CD_CHANGE */
	public List l_d_CUST_CD_CHANGE = null;

	/** �� 40 List�ϐ��F l_d_NEW_CUST_ITEM_CD */
	public List l_d_NEW_CUST_ITEM_CD = null;

	/** �� 41 List�ϐ��F l_d_CUST_ITEM_CD_CHANGE */
	public List l_d_CUST_ITEM_CD_CHANGE = null;

	/** �� 42 List�ϐ��F l_d_DLV_LOC_CD_CHANGE */
	public List l_d_DLV_LOC_CD_CHANGE = null;

	/** �� 43 List�ϐ��F l_d_NEW_ODR_QTY */
	public List l_d_NEW_ODR_QTY = null;

	/** �� 44 List�ϐ��F l_d_ODR_QTY_CHANGE */
	public List l_d_ODR_QTY_CHANGE = null;

	/** �� 45 List�ϐ��F l_d_NEW_DESINATED_DLV_DATE */
	public List l_d_NEW_DESINATED_DLV_DATE = null;

	/** �� 46 List�ϐ��F l_d_DESINATED_DLV_DATE_CHANGE */
	public List l_d_DESINATED_DLV_DATE_CHANGE = null;

	/** �� 47 List�ϐ��F l_d_NEW_SPCL_PRICE_TYP */
	public List l_d_NEW_SPCL_PRICE_TYP = null;

	/** �� 48 List�ϐ��F l_d_SPCL_PRICE_TYP_CHANGE */
	public List l_d_SPCL_PRICE_TYP_CHANGE = null;

	/** �� 49 List�ϐ��F l_d_NEW_ODR_UNIT_PRICE */
	public List l_d_NEW_ODR_UNIT_PRICE = null;

	/** �� 50 List�ϐ��F l_d_ODR_UNIT_PRICE_CHANGE */
	public List l_d_ODR_UNIT_PRICE_CHANGE = null;

	/** �� 51 List�ϐ��F l_d_NEW_DLV_LOC_CD */
	public List l_d_NEW_DLV_LOC_CD = null;

	/** �� 52 List�ϐ��F l_d_NEW_REMARKS */
	public List l_d_NEW_REMARKS = null;

	/** �� 53 List�ϐ��F l_d_REMARKS_CHANGE */
	public List l_d_REMARKS_CHANGE = null;

	/** �� 54 List�ϐ��F l_d_NEW_ODR_NO */
	public List l_d_NEW_ODR_NO = null;

	/** �� 55 List�ϐ��F l_d_ODR_NO_CHANGE */
	public List l_d_ODR_NO_CHANGE = null;

	/** �� 56 List�ϐ��F l_d_NEW_ODR_TYP */
	public List l_d_NEW_ODR_TYP = null;

	/** �� 57 List�ϐ��F l_d_ODR_TYP_CHANGE */
	public List l_d_ODR_TYP_CHANGE = null;

	/** �� 58 List�ϐ��F l_l_STATUS_NAME */
	public List l_l_STATUS_NAME = null;

	/** �� 59 List�ϐ��F l_l_PROJECT_CD */
	public List l_l_PROJECT_CD = null;

	/** �� 60 List�ϐ��F l_l_ESTIMATE_NO */
	public List l_l_ESTIMATE_NO = null;

	/** �� 61 List�ϐ��F l_l_DETAL_NO */
	public List l_l_DETAL_NO = null;

	/** �� 62 List�ϐ��F l_l_ESTIMATE_TYPE */
	public List l_l_ESTIMATE_TYPE = null;

	/** �� 63 List�ϐ��F l_l_h_ESTIMATE_TYPE */
	public List l_l_h_ESTIMATE_TYPE = null;

	/** �� 64 List�ϐ��F l_l_OWN_PERSON_CD */
	public List l_l_OWN_PERSON_CD = null;

	/** �� 65 List�ϐ��F l_l_OWN_ORG_CD */
	public List l_l_OWN_ORG_CD = null;

	/** �� 66 List�ϐ��F l_l_ORGN_ODR_NO */
	public List l_l_ORGN_ODR_NO = null;

	/** �� 67 List�ϐ��F l_l_ADD_ODR_FLG */
	public List l_l_ADD_ODR_FLG = null;

	/** �� 68 List�ϐ��F l_l_h_ODR_TYP */
	public List l_l_h_ODR_TYP = null;

	/** �� 69 List�ϐ��F l_l_h_DEPO_TYP */
	public List l_l_h_DEPO_TYP = null;

	/** �� 70 List�ϐ��F l_h_APPR_POWER_TYP */
	public List l_h_APPR_POWER_TYP = null;

	/** �� 71 List�ϐ��F l_LOGIN_USER_CD */
	public List l_LOGIN_USER_CD = null;

	/** �� 72 List�ϐ��F l_h_APPR_ID */
	public List l_h_APPR_ID = null;

	/** �� 73 List�ϐ��F l_h_SCREEN_URL */
	public List l_h_SCREEN_URL = null;

	/** �� 74 List�ϐ��F l_h_STATUS */
	public List l_h_STATUS = null;

	/** �� 75 List�ϐ��F l_h_PROC_TYP */
	public List l_h_PROC_TYP = null;

	/** �� 76 List�ϐ��F l_l_REQUEST_BY */
	public List l_l_REQUEST_BY = null;

	/** �� 77 List�ϐ��F l_l_REQUEST_BY_NAME */
	public List l_l_REQUEST_BY_NAME = null;

	/** �� 78 List�ϐ��F l_l_REQUEST_DATE */
	public List l_l_REQUEST_DATE = null;

	/** �� 79 List�ϐ��F l_l_APPR_REMARKS */
	public List l_l_APPR_REMARKS = null;

	/** �� 80 List�ϐ��F l_l_RESERVE_CAUSE */
	public List l_l_RESERVE_CAUSE = null;

	/** �� 81 List�ϐ��F l_h_MODIFY_COUNT */
	public List l_h_MODIFY_COUNT = null;

	/** �� 82 List�ϐ��F l_START_DATE */
	public List l_START_DATE = null;

	/** �� 83 List�ϐ��F l_END_DATE */
	public List l_END_DATE = null;

	/** �� 84 List�ϐ��F l_CUST_CD */
	public List l_CUST_CD = null;

	/** �� 85 List�ϐ��F l_FIELD_NAME */
	public List l_FIELD_NAME = null;

	/** �� 86 List�ϐ��F l_FIELD_VALUE */
	public List l_FIELD_VALUE = null;

	/** �� 87 List�ϐ��F l_FIELD_FLG */
	public List l_FIELD_FLG = null;

	/** �� 88 List�ϐ��F l_d_OLD_ODR_NO */
	public List l_d_OLD_ODR_NO = null;

	/** �� 89 List�ϐ��F l_d_OLD_ODR_TYP */
	public List l_d_OLD_ODR_TYP = null;

	/** �� 90 List�ϐ��F l_d_OLD_CUST_ODR_NO */
	public List l_d_OLD_CUST_ODR_NO = null;

	/** �� 91 List�ϐ��F l_d_OLD_CUST_CD */
	public List l_d_OLD_CUST_CD = null;

	/** �� 92 List�ϐ��F l_d_OLD_CUST_ITEM_CD */
	public List l_d_OLD_CUST_ITEM_CD = null;

	/** �� 93 List�ϐ��F l_d_OLD_DLV_LOC_CD */
	public List l_d_OLD_DLV_LOC_CD = null;

	/** �� 94 List�ϐ��F l_d_OLD_ODR_QTY */
	public List l_d_OLD_ODR_QTY = null;

	/** �� 95 List�ϐ��F l_d_OLD_DESINATED_DLV_DATE */
	public List l_d_OLD_DESINATED_DLV_DATE = null;

	/** �� 96 List�ϐ��F l_d_OLD_SPCL_PRICE_TYP */
	public List l_d_OLD_SPCL_PRICE_TYP = null;

	/** �� 97 List�ϐ��F l_d_OLD_ODR_UNIT_PRICE */
	public List l_d_OLD_ODR_UNIT_PRICE = null;

	/** �� 98 List�ϐ��F l_d_OLD_REMARKS */
	public List l_d_OLD_REMARKS = null;

	/** �� 99 List�ϐ��F l_h_ODR_NO */
	public List l_h_ODR_NO = null;

	/** �� 100 List�ϐ��F l_l_COUNT */
	public List l_l_COUNT = null;

	/** �� 101 List�ϐ��F l_ROW_COUNT */
	public List l_ROW_COUNT = null;

	/** �� 102 List�ϐ��F l_l_ODR_CMPLT_FLG */
	public List l_l_ODR_CMPLT_FLG = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getr1_FILTER1() { return m_r1_FILTER1; }
	public String getr2_FILTER1() { return m_r2_FILTER1; }
	public String getr3_FILTER1() { return m_r3_FILTER1; }
	public String geth_SELECT_TYP() { return m_h_SELECT_TYP; }
	public String geth_REQUEST_APPR_SAME() { return m_h_REQUEST_APPR_SAME; }
	public String getRESERVE_CAUSE() { return m_RESERVE_CAUSE; }
	public String getl_PROC_TYP_VALUE() { return m_l_PROC_TYP_VALUE; }
	public String getl_ODR_TYP_DN() { return m_l_ODR_TYP_DN; }
	public String getl_ODR_TYP() { return m_l_ODR_TYP; }
	public String getl_CUST_ODR_NO() { return m_l_CUST_ODR_NO; }
	public String getl_CUST_ITEM_CD() { return m_l_CUST_ITEM_CD; }
	public String getl_ITEM_CD() { return m_l_ITEM_CD; }
	public String getl_CUST_CD() { return m_l_CUST_CD; }
	public String getl_CUST_ANAME() { return m_l_CUST_ANAME; }
	public String getl_DESINATED_DLV_DATE() { return m_l_DESINATED_DLV_DATE; }
	public String getl_ODR_QTY() { return m_l_ODR_QTY; }
	public String getl_UNIT_CD() { return m_l_UNIT_CD; }
	public String getl_ODR_UNIT_PRICE() { return m_l_ODR_UNIT_PRICE; }
	public String getl_CUR_UNIT() { return m_l_CUR_UNIT; }
	public String getl_SPCL_PRICE_TYP_DN() { return m_l_SPCL_PRICE_TYP_DN; }
	public String getl_SPCL_PRICE_TYP() { return m_l_SPCL_PRICE_TYP; }
	public String getl_DLV_LOC_CD() { return m_l_DLV_LOC_CD; }
	public String getl_DLV_LOC_NAME() { return m_l_DLV_LOC_NAME; }
	public String getl_DEPO_TYP_DN() { return m_l_DEPO_TYP_DN; }
	public String getl_DEPO_TYP() { return m_l_DEPO_TYP; }
	public String getl_CUST_ITEM_NAME() { return m_l_CUST_ITEM_NAME; }
	public String getl_ITEM_NAME() { return m_l_ITEM_NAME; }
	public String getl_ODR_ACPT_DATE() { return m_l_ODR_ACPT_DATE; }
	public String getl_JOB_ODR_CD() { return m_l_JOB_ODR_CD; }
	public String getl_JOB_ODR_QTY() { return m_l_JOB_ODR_QTY; }
	public String getl_JOB_ODR_DLV_DATE() { return m_l_JOB_ODR_DLV_DATE; }
	public String getl_ALC_GRP_CD() { return m_l_ALC_GRP_CD; }
	public String getl_REMARKS() { return m_l_REMARKS; }
	public String getl_CUS_DLV_KEY_CD() { return m_l_CUS_DLV_KEY_CD; }
	public String getl_CUS_DLV_CD() { return m_l_CUS_DLV_CD; }
	public String getd_NEW_CUST_ODR_NO() { return m_d_NEW_CUST_ODR_NO; }
	public String getd_CUST_ODR_NO_CHANGE() { return m_d_CUST_ODR_NO_CHANGE; }
	public String getd_NEW_CUST_CD() { return m_d_NEW_CUST_CD; }
	public String getd_CUST_CD_CHANGE() { return m_d_CUST_CD_CHANGE; }
	public String getd_NEW_CUST_ITEM_CD() { return m_d_NEW_CUST_ITEM_CD; }
	public String getd_CUST_ITEM_CD_CHANGE() { return m_d_CUST_ITEM_CD_CHANGE; }
	public String getd_DLV_LOC_CD_CHANGE() { return m_d_DLV_LOC_CD_CHANGE; }
	public String getd_NEW_ODR_QTY() { return m_d_NEW_ODR_QTY; }
	public String getd_ODR_QTY_CHANGE() { return m_d_ODR_QTY_CHANGE; }
	public String getd_NEW_DESINATED_DLV_DATE() { return m_d_NEW_DESINATED_DLV_DATE; }
	public String getd_DESINATED_DLV_DATE_CHANGE() { return m_d_DESINATED_DLV_DATE_CHANGE; }
	public String getd_NEW_SPCL_PRICE_TYP() { return m_d_NEW_SPCL_PRICE_TYP; }
	public String getd_SPCL_PRICE_TYP_CHANGE() { return m_d_SPCL_PRICE_TYP_CHANGE; }
	public String getd_NEW_ODR_UNIT_PRICE() { return m_d_NEW_ODR_UNIT_PRICE; }
	public String getd_ODR_UNIT_PRICE_CHANGE() { return m_d_ODR_UNIT_PRICE_CHANGE; }
	public String getd_NEW_DLV_LOC_CD() { return m_d_NEW_DLV_LOC_CD; }
	public String getd_NEW_REMARKS() { return m_d_NEW_REMARKS; }
	public String getd_REMARKS_CHANGE() { return m_d_REMARKS_CHANGE; }
	public String getd_NEW_ODR_NO() { return m_d_NEW_ODR_NO; }
	public String getd_ODR_NO_CHANGE() { return m_d_ODR_NO_CHANGE; }
	public String getd_NEW_ODR_TYP() { return m_d_NEW_ODR_TYP; }
	public String getd_ODR_TYP_CHANGE() { return m_d_ODR_TYP_CHANGE; }
	public String getl_STATUS_NAME() { return m_l_STATUS_NAME; }
	public String getl_PROJECT_CD() { return m_l_PROJECT_CD; }
	public String getl_ESTIMATE_NO() { return m_l_ESTIMATE_NO; }
	public String getl_DETAL_NO() { return m_l_DETAL_NO; }
	public String getl_ESTIMATE_TYPE() { return m_l_ESTIMATE_TYPE; }
	public String getl_h_ESTIMATE_TYPE() { return m_l_h_ESTIMATE_TYPE; }
	public String getl_OWN_PERSON_CD() { return m_l_OWN_PERSON_CD; }
	public String getl_OWN_ORG_CD() { return m_l_OWN_ORG_CD; }
	public String getl_ORGN_ODR_NO() { return m_l_ORGN_ODR_NO; }
	public String getl_ADD_ODR_FLG() { return m_l_ADD_ODR_FLG; }
	public String getl_h_ODR_TYP() { return m_l_h_ODR_TYP; }
	public String getl_h_DEPO_TYP() { return m_l_h_DEPO_TYP; }
	public String geth_APPR_POWER_TYP() { return m_h_APPR_POWER_TYP; }
	public String getLOGIN_USER_CD() { return m_LOGIN_USER_CD; }
	public String geth_APPR_ID() { return m_h_APPR_ID; }
	public String geth_SCREEN_URL() { return m_h_SCREEN_URL; }
	public String geth_STATUS() { return m_h_STATUS; }
	public String geth_PROC_TYP() { return m_h_PROC_TYP; }
	public String getl_REQUEST_BY() { return m_l_REQUEST_BY; }
	public String getl_REQUEST_BY_NAME() { return m_l_REQUEST_BY_NAME; }
	public String getl_REQUEST_DATE() { return m_l_REQUEST_DATE; }
	public String getl_APPR_REMARKS() { return m_l_APPR_REMARKS; }
	public String getl_RESERVE_CAUSE() { return m_l_RESERVE_CAUSE; }
	public String geth_MODIFY_COUNT() { return m_h_MODIFY_COUNT; }
	public String getSTART_DATE() { return m_START_DATE; }
	public String getEND_DATE() { return m_END_DATE; }
	public String getCUST_CD() { return m_CUST_CD; }
	public String getFIELD_NAME() { return m_FIELD_NAME; }
	public String getFIELD_VALUE() { return m_FIELD_VALUE; }
	public String getFIELD_FLG() { return m_FIELD_FLG; }
	public String getd_OLD_ODR_NO() { return m_d_OLD_ODR_NO; }
	public String getd_OLD_ODR_TYP() { return m_d_OLD_ODR_TYP; }
	public String getd_OLD_CUST_ODR_NO() { return m_d_OLD_CUST_ODR_NO; }
	public String getd_OLD_CUST_CD() { return m_d_OLD_CUST_CD; }
	public String getd_OLD_CUST_ITEM_CD() { return m_d_OLD_CUST_ITEM_CD; }
	public String getd_OLD_DLV_LOC_CD() { return m_d_OLD_DLV_LOC_CD; }
	public String getd_OLD_ODR_QTY() { return m_d_OLD_ODR_QTY; }
	public String getd_OLD_DESINATED_DLV_DATE() { return m_d_OLD_DESINATED_DLV_DATE; }
	public String getd_OLD_SPCL_PRICE_TYP() { return m_d_OLD_SPCL_PRICE_TYP; }
	public String getd_OLD_ODR_UNIT_PRICE() { return m_d_OLD_ODR_UNIT_PRICE; }
	public String getd_OLD_REMARKS() { return m_d_OLD_REMARKS; }
	public String geth_ODR_NO() { return m_h_ODR_NO; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }
	public String getl_ODR_CMPLT_FLG() { return m_l_ODR_CMPLT_FLG; }

	public List getList_r1_FILTER1() { return l_r1_FILTER1; }
	public List getList_r2_FILTER1() { return l_r2_FILTER1; }
	public List getList_r3_FILTER1() { return l_r3_FILTER1; }
	public List getList_h_SELECT_TYP() { return l_h_SELECT_TYP; }
	public List getList_h_REQUEST_APPR_SAME() { return l_h_REQUEST_APPR_SAME; }
	public List getList_RESERVE_CAUSE() { return l_RESERVE_CAUSE; }
	public List getList_l_PROC_TYP_VALUE() { return l_l_PROC_TYP_VALUE; }
	public List getList_l_ODR_TYP_DN() { return l_l_ODR_TYP_DN; }
	public List getList_l_ODR_TYP() { return l_l_ODR_TYP; }
	public List getList_l_CUST_ODR_NO() { return l_l_CUST_ODR_NO; }
	public List getList_l_CUST_ITEM_CD() { return l_l_CUST_ITEM_CD; }
	public List getList_l_ITEM_CD() { return l_l_ITEM_CD; }
	public List getList_l_CUST_CD() { return l_l_CUST_CD; }
	public List getList_l_CUST_ANAME() { return l_l_CUST_ANAME; }
	public List getList_l_DESINATED_DLV_DATE() { return l_l_DESINATED_DLV_DATE; }
	public List getList_l_ODR_QTY() { return l_l_ODR_QTY; }
	public List getList_l_UNIT_CD() { return l_l_UNIT_CD; }
	public List getList_l_ODR_UNIT_PRICE() { return l_l_ODR_UNIT_PRICE; }
	public List getList_l_CUR_UNIT() { return l_l_CUR_UNIT; }
	public List getList_l_SPCL_PRICE_TYP_DN() { return l_l_SPCL_PRICE_TYP_DN; }
	public List getList_l_SPCL_PRICE_TYP() { return l_l_SPCL_PRICE_TYP; }
	public List getList_l_DLV_LOC_CD() { return l_l_DLV_LOC_CD; }
	public List getList_l_DLV_LOC_NAME() { return l_l_DLV_LOC_NAME; }
	public List getList_l_DEPO_TYP_DN() { return l_l_DEPO_TYP_DN; }
	public List getList_l_DEPO_TYP() { return l_l_DEPO_TYP; }
	public List getList_l_CUST_ITEM_NAME() { return l_l_CUST_ITEM_NAME; }
	public List getList_l_ITEM_NAME() { return l_l_ITEM_NAME; }
	public List getList_l_ODR_ACPT_DATE() { return l_l_ODR_ACPT_DATE; }
	public List getList_l_JOB_ODR_CD() { return l_l_JOB_ODR_CD; }
	public List getList_l_JOB_ODR_QTY() { return l_l_JOB_ODR_QTY; }
	public List getList_l_JOB_ODR_DLV_DATE() { return l_l_JOB_ODR_DLV_DATE; }
	public List getList_l_ALC_GRP_CD() { return l_l_ALC_GRP_CD; }
	public List getList_l_REMARKS() { return l_l_REMARKS; }
	public List getList_l_CUS_DLV_KEY_CD() { return l_l_CUS_DLV_KEY_CD; }
	public List getList_l_CUS_DLV_CD() { return l_l_CUS_DLV_CD; }
	public List getList_d_NEW_CUST_ODR_NO() { return l_d_NEW_CUST_ODR_NO; }
	public List getList_d_CUST_ODR_NO_CHANGE() { return l_d_CUST_ODR_NO_CHANGE; }
	public List getList_d_NEW_CUST_CD() { return l_d_NEW_CUST_CD; }
	public List getList_d_CUST_CD_CHANGE() { return l_d_CUST_CD_CHANGE; }
	public List getList_d_NEW_CUST_ITEM_CD() { return l_d_NEW_CUST_ITEM_CD; }
	public List getList_d_CUST_ITEM_CD_CHANGE() { return l_d_CUST_ITEM_CD_CHANGE; }
	public List getList_d_DLV_LOC_CD_CHANGE() { return l_d_DLV_LOC_CD_CHANGE; }
	public List getList_d_NEW_ODR_QTY() { return l_d_NEW_ODR_QTY; }
	public List getList_d_ODR_QTY_CHANGE() { return l_d_ODR_QTY_CHANGE; }
	public List getList_d_NEW_DESINATED_DLV_DATE() { return l_d_NEW_DESINATED_DLV_DATE; }
	public List getList_d_DESINATED_DLV_DATE_CHANGE() { return l_d_DESINATED_DLV_DATE_CHANGE; }
	public List getList_d_NEW_SPCL_PRICE_TYP() { return l_d_NEW_SPCL_PRICE_TYP; }
	public List getList_d_SPCL_PRICE_TYP_CHANGE() { return l_d_SPCL_PRICE_TYP_CHANGE; }
	public List getList_d_NEW_ODR_UNIT_PRICE() { return l_d_NEW_ODR_UNIT_PRICE; }
	public List getList_d_ODR_UNIT_PRICE_CHANGE() { return l_d_ODR_UNIT_PRICE_CHANGE; }
	public List getList_d_NEW_DLV_LOC_CD() { return l_d_NEW_DLV_LOC_CD; }
	public List getList_d_NEW_REMARKS() { return l_d_NEW_REMARKS; }
	public List getList_d_REMARKS_CHANGE() { return l_d_REMARKS_CHANGE; }
	public List getList_d_NEW_ODR_NO() { return l_d_NEW_ODR_NO; }
	public List getList_d_ODR_NO_CHANGE() { return l_d_ODR_NO_CHANGE; }
	public List getList_d_NEW_ODR_TYP() { return l_d_NEW_ODR_TYP; }
	public List getList_d_ODR_TYP_CHANGE() { return l_d_ODR_TYP_CHANGE; }
	public List getList_l_STATUS_NAME() { return l_l_STATUS_NAME; }
	public List getList_l_PROJECT_CD() { return l_l_PROJECT_CD; }
	public List getList_l_ESTIMATE_NO() { return l_l_ESTIMATE_NO; }
	public List getList_l_DETAL_NO() { return l_l_DETAL_NO; }
	public List getList_l_ESTIMATE_TYPE() { return l_l_ESTIMATE_TYPE; }
	public List getList_l_h_ESTIMATE_TYPE() { return l_l_h_ESTIMATE_TYPE; }
	public List getList_l_OWN_PERSON_CD() { return l_l_OWN_PERSON_CD; }
	public List getList_l_OWN_ORG_CD() { return l_l_OWN_ORG_CD; }
	public List getList_l_ORGN_ODR_NO() { return l_l_ORGN_ODR_NO; }
	public List getList_l_ADD_ODR_FLG() { return l_l_ADD_ODR_FLG; }
	public List getList_l_h_ODR_TYP() { return l_l_h_ODR_TYP; }
	public List getList_l_h_DEPO_TYP() { return l_l_h_DEPO_TYP; }
	public List getList_h_APPR_POWER_TYP() { return l_h_APPR_POWER_TYP; }
	public List getList_LOGIN_USER_CD() { return l_LOGIN_USER_CD; }
	public List getList_h_APPR_ID() { return l_h_APPR_ID; }
	public List getList_h_SCREEN_URL() { return l_h_SCREEN_URL; }
	public List getList_h_STATUS() { return l_h_STATUS; }
	public List getList_h_PROC_TYP() { return l_h_PROC_TYP; }
	public List getList_l_REQUEST_BY() { return l_l_REQUEST_BY; }
	public List getList_l_REQUEST_BY_NAME() { return l_l_REQUEST_BY_NAME; }
	public List getList_l_REQUEST_DATE() { return l_l_REQUEST_DATE; }
	public List getList_l_APPR_REMARKS() { return l_l_APPR_REMARKS; }
	public List getList_l_RESERVE_CAUSE() { return l_l_RESERVE_CAUSE; }
	public List getList_h_MODIFY_COUNT() { return l_h_MODIFY_COUNT; }
	public List getList_START_DATE() { return l_START_DATE; }
	public List getList_END_DATE() { return l_END_DATE; }
	public List getList_CUST_CD() { return l_CUST_CD; }
	public List getList_FIELD_NAME() { return l_FIELD_NAME; }
	public List getList_FIELD_VALUE() { return l_FIELD_VALUE; }
	public List getList_FIELD_FLG() { return l_FIELD_FLG; }
	public List getList_d_OLD_ODR_NO() { return l_d_OLD_ODR_NO; }
	public List getList_d_OLD_ODR_TYP() { return l_d_OLD_ODR_TYP; }
	public List getList_d_OLD_CUST_ODR_NO() { return l_d_OLD_CUST_ODR_NO; }
	public List getList_d_OLD_CUST_CD() { return l_d_OLD_CUST_CD; }
	public List getList_d_OLD_CUST_ITEM_CD() { return l_d_OLD_CUST_ITEM_CD; }
	public List getList_d_OLD_DLV_LOC_CD() { return l_d_OLD_DLV_LOC_CD; }
	public List getList_d_OLD_ODR_QTY() { return l_d_OLD_ODR_QTY; }
	public List getList_d_OLD_DESINATED_DLV_DATE() { return l_d_OLD_DESINATED_DLV_DATE; }
	public List getList_d_OLD_SPCL_PRICE_TYP() { return l_d_OLD_SPCL_PRICE_TYP; }
	public List getList_d_OLD_ODR_UNIT_PRICE() { return l_d_OLD_ODR_UNIT_PRICE; }
	public List getList_d_OLD_REMARKS() { return l_d_OLD_REMARKS; }
	public List getList_h_ODR_NO() { return l_h_ODR_NO; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }
	public List getList_l_ODR_CMPLT_FLG() { return l_l_ODR_CMPLT_FLG; }

	public void setr1_FILTER1(String val) { m_r1_FILTER1 = val; }
	public void setr2_FILTER1(String val) { m_r2_FILTER1 = val; }
	public void setr3_FILTER1(String val) { m_r3_FILTER1 = val; }
	public void seth_SELECT_TYP(String val) { m_h_SELECT_TYP = val; }
	public void seth_REQUEST_APPR_SAME(String val) { m_h_REQUEST_APPR_SAME = val; }
	public void setRESERVE_CAUSE(String val) { m_RESERVE_CAUSE = val; }
	public void setl_PROC_TYP_VALUE(String val) { m_l_PROC_TYP_VALUE = val; }
	public void setl_ODR_TYP_DN(String val) { m_l_ODR_TYP_DN = val; }
	public void setl_ODR_TYP(String val) { m_l_ODR_TYP = val; }
	public void setl_CUST_ODR_NO(String val) { m_l_CUST_ODR_NO = val; }
	public void setl_CUST_ITEM_CD(String val) { m_l_CUST_ITEM_CD = val; }
	public void setl_ITEM_CD(String val) { m_l_ITEM_CD = val; }
	public void setl_CUST_CD(String val) { m_l_CUST_CD = val; }
	public void setl_CUST_ANAME(String val) { m_l_CUST_ANAME = val; }
	public void setl_DESINATED_DLV_DATE(String val) { m_l_DESINATED_DLV_DATE = val; }
	public void setl_ODR_QTY(String val) { m_l_ODR_QTY = val; }
	public void setl_UNIT_CD(String val) { m_l_UNIT_CD = val; }
	public void setl_ODR_UNIT_PRICE(String val) { m_l_ODR_UNIT_PRICE = val; }
	public void setl_CUR_UNIT(String val) { m_l_CUR_UNIT = val; }
	public void setl_SPCL_PRICE_TYP_DN(String val) { m_l_SPCL_PRICE_TYP_DN = val; }
	public void setl_SPCL_PRICE_TYP(String val) { m_l_SPCL_PRICE_TYP = val; }
	public void setl_DLV_LOC_CD(String val) { m_l_DLV_LOC_CD = val; }
	public void setl_DLV_LOC_NAME(String val) { m_l_DLV_LOC_NAME = val; }
	public void setl_DEPO_TYP_DN(String val) { m_l_DEPO_TYP_DN = val; }
	public void setl_DEPO_TYP(String val) { m_l_DEPO_TYP = val; }
	public void setl_CUST_ITEM_NAME(String val) { m_l_CUST_ITEM_NAME = val; }
	public void setl_ITEM_NAME(String val) { m_l_ITEM_NAME = val; }
	public void setl_ODR_ACPT_DATE(String val) { m_l_ODR_ACPT_DATE = val; }
	public void setl_JOB_ODR_CD(String val) { m_l_JOB_ODR_CD = val; }
	public void setl_JOB_ODR_QTY(String val) { m_l_JOB_ODR_QTY = val; }
	public void setl_JOB_ODR_DLV_DATE(String val) { m_l_JOB_ODR_DLV_DATE = val; }
	public void setl_ALC_GRP_CD(String val) { m_l_ALC_GRP_CD = val; }
	public void setl_REMARKS(String val) { m_l_REMARKS = val; }
	public void setl_CUS_DLV_KEY_CD(String val) { m_l_CUS_DLV_KEY_CD = val; }
	public void setl_CUS_DLV_CD(String val) { m_l_CUS_DLV_CD = val; }
	public void setd_NEW_CUST_ODR_NO(String val) { m_d_NEW_CUST_ODR_NO = val; }
	public void setd_CUST_ODR_NO_CHANGE(String val) { m_d_CUST_ODR_NO_CHANGE = val; }
	public void setd_NEW_CUST_CD(String val) { m_d_NEW_CUST_CD = val; }
	public void setd_CUST_CD_CHANGE(String val) { m_d_CUST_CD_CHANGE = val; }
	public void setd_NEW_CUST_ITEM_CD(String val) { m_d_NEW_CUST_ITEM_CD = val; }
	public void setd_CUST_ITEM_CD_CHANGE(String val) { m_d_CUST_ITEM_CD_CHANGE = val; }
	public void setd_DLV_LOC_CD_CHANGE(String val) { m_d_DLV_LOC_CD_CHANGE = val; }
	public void setd_NEW_ODR_QTY(String val) { m_d_NEW_ODR_QTY = val; }
	public void setd_ODR_QTY_CHANGE(String val) { m_d_ODR_QTY_CHANGE = val; }
	public void setd_NEW_DESINATED_DLV_DATE(String val) { m_d_NEW_DESINATED_DLV_DATE = val; }
	public void setd_DESINATED_DLV_DATE_CHANGE(String val) { m_d_DESINATED_DLV_DATE_CHANGE = val; }
	public void setd_NEW_SPCL_PRICE_TYP(String val) { m_d_NEW_SPCL_PRICE_TYP = val; }
	public void setd_SPCL_PRICE_TYP_CHANGE(String val) { m_d_SPCL_PRICE_TYP_CHANGE = val; }
	public void setd_NEW_ODR_UNIT_PRICE(String val) { m_d_NEW_ODR_UNIT_PRICE = val; }
	public void setd_ODR_UNIT_PRICE_CHANGE(String val) { m_d_ODR_UNIT_PRICE_CHANGE = val; }
	public void setd_NEW_DLV_LOC_CD(String val) { m_d_NEW_DLV_LOC_CD = val; }
	public void setd_NEW_REMARKS(String val) { m_d_NEW_REMARKS = val; }
	public void setd_REMARKS_CHANGE(String val) { m_d_REMARKS_CHANGE = val; }
	public void setd_NEW_ODR_NO(String val) { m_d_NEW_ODR_NO = val; }
	public void setd_ODR_NO_CHANGE(String val) { m_d_ODR_NO_CHANGE = val; }
	public void setd_NEW_ODR_TYP(String val) { m_d_NEW_ODR_TYP = val; }
	public void setd_ODR_TYP_CHANGE(String val) { m_d_ODR_TYP_CHANGE = val; }
	public void setl_STATUS_NAME(String val) { m_l_STATUS_NAME = val; }
	public void setl_PROJECT_CD(String val) { m_l_PROJECT_CD = val; }
	public void setl_ESTIMATE_NO(String val) { m_l_ESTIMATE_NO = val; }
	public void setl_DETAL_NO(String val) { m_l_DETAL_NO = val; }
	public void setl_ESTIMATE_TYPE(String val) { m_l_ESTIMATE_TYPE = val; }
	public void setl_h_ESTIMATE_TYPE(String val) { m_l_h_ESTIMATE_TYPE = val; }
	public void setl_OWN_PERSON_CD(String val) { m_l_OWN_PERSON_CD = val; }
	public void setl_OWN_ORG_CD(String val) { m_l_OWN_ORG_CD = val; }
	public void setl_ORGN_ODR_NO(String val) { m_l_ORGN_ODR_NO = val; }
	public void setl_ADD_ODR_FLG(String val) { m_l_ADD_ODR_FLG = val; }
	public void setl_h_ODR_TYP(String val) { m_l_h_ODR_TYP = val; }
	public void setl_h_DEPO_TYP(String val) { m_l_h_DEPO_TYP = val; }
	public void seth_APPR_POWER_TYP(String val) { m_h_APPR_POWER_TYP = val; }
	public void setLOGIN_USER_CD(String val) { m_LOGIN_USER_CD = val; }
	public void seth_APPR_ID(String val) { m_h_APPR_ID = val; }
	public void seth_SCREEN_URL(String val) { m_h_SCREEN_URL = val; }
	public void seth_STATUS(String val) { m_h_STATUS = val; }
	public void seth_PROC_TYP(String val) { m_h_PROC_TYP = val; }
	public void setl_REQUEST_BY(String val) { m_l_REQUEST_BY = val; }
	public void setl_REQUEST_BY_NAME(String val) { m_l_REQUEST_BY_NAME = val; }
	public void setl_REQUEST_DATE(String val) { m_l_REQUEST_DATE = val; }
	public void setl_APPR_REMARKS(String val) { m_l_APPR_REMARKS = val; }
	public void setl_RESERVE_CAUSE(String val) { m_l_RESERVE_CAUSE = val; }
	public void seth_MODIFY_COUNT(String val) { m_h_MODIFY_COUNT = val; }
	public void setSTART_DATE(String val) { m_START_DATE = val; }
	public void setEND_DATE(String val) { m_END_DATE = val; }
	public void setCUST_CD(String val) { m_CUST_CD = val; }
	public void setFIELD_NAME(String val) { m_FIELD_NAME = val; }
	public void setFIELD_VALUE(String val) { m_FIELD_VALUE = val; }
	public void setFIELD_FLG(String val) { m_FIELD_FLG = val; }
	public void setd_OLD_ODR_NO(String val) { m_d_OLD_ODR_NO = val; }
	public void setd_OLD_ODR_TYP(String val) { m_d_OLD_ODR_TYP = val; }
	public void setd_OLD_CUST_ODR_NO(String val) { m_d_OLD_CUST_ODR_NO = val; }
	public void setd_OLD_CUST_CD(String val) { m_d_OLD_CUST_CD = val; }
	public void setd_OLD_CUST_ITEM_CD(String val) { m_d_OLD_CUST_ITEM_CD = val; }
	public void setd_OLD_DLV_LOC_CD(String val) { m_d_OLD_DLV_LOC_CD = val; }
	public void setd_OLD_ODR_QTY(String val) { m_d_OLD_ODR_QTY = val; }
	public void setd_OLD_DESINATED_DLV_DATE(String val) { m_d_OLD_DESINATED_DLV_DATE = val; }
	public void setd_OLD_SPCL_PRICE_TYP(String val) { m_d_OLD_SPCL_PRICE_TYP = val; }
	public void setd_OLD_ODR_UNIT_PRICE(String val) { m_d_OLD_ODR_UNIT_PRICE = val; }
	public void setd_OLD_REMARKS(String val) { m_d_OLD_REMARKS = val; }
	public void seth_ODR_NO(String val) { m_h_ODR_NO = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }
	public void setl_ODR_CMPLT_FLG(String val) { m_l_ODR_CMPLT_FLG = val; }


	public void setList_r1_FILTER1(List list) { l_r1_FILTER1 = list; }
	public void setList_r2_FILTER1(List list) { l_r2_FILTER1 = list; }
	public void setList_r3_FILTER1(List list) { l_r3_FILTER1 = list; }
	public void setList_h_SELECT_TYP(List list) { l_h_SELECT_TYP = list; }
	public void setList_h_REQUEST_APPR_SAME(List list) { l_h_REQUEST_APPR_SAME = list; }
	public void setList_RESERVE_CAUSE(List list) { l_RESERVE_CAUSE = list; }
	public void setList_l_PROC_TYP_VALUE(List list) { l_l_PROC_TYP_VALUE = list; }
	public void setList_l_ODR_TYP_DN(List list) { l_l_ODR_TYP_DN = list; }
	public void setList_l_ODR_TYP(List list) { l_l_ODR_TYP = list; }
	public void setList_l_CUST_ODR_NO(List list) { l_l_CUST_ODR_NO = list; }
	public void setList_l_CUST_ITEM_CD(List list) { l_l_CUST_ITEM_CD = list; }
	public void setList_l_ITEM_CD(List list) { l_l_ITEM_CD = list; }
	public void setList_l_CUST_CD(List list) { l_l_CUST_CD = list; }
	public void setList_l_CUST_ANAME(List list) { l_l_CUST_ANAME = list; }
	public void setList_l_DESINATED_DLV_DATE(List list) { l_l_DESINATED_DLV_DATE = list; }
	public void setList_l_ODR_QTY(List list) { l_l_ODR_QTY = list; }
	public void setList_l_UNIT_CD(List list) { l_l_UNIT_CD = list; }
	public void setList_l_ODR_UNIT_PRICE(List list) { l_l_ODR_UNIT_PRICE = list; }
	public void setList_l_CUR_UNIT(List list) { l_l_CUR_UNIT = list; }
	public void setList_l_SPCL_PRICE_TYP_DN(List list) { l_l_SPCL_PRICE_TYP_DN = list; }
	public void setList_l_SPCL_PRICE_TYP(List list) { l_l_SPCL_PRICE_TYP = list; }
	public void setList_l_DLV_LOC_CD(List list) { l_l_DLV_LOC_CD = list; }
	public void setList_l_DLV_LOC_NAME(List list) { l_l_DLV_LOC_NAME = list; }
	public void setList_l_DEPO_TYP_DN(List list) { l_l_DEPO_TYP_DN = list; }
	public void setList_l_DEPO_TYP(List list) { l_l_DEPO_TYP = list; }
	public void setList_l_CUST_ITEM_NAME(List list) { l_l_CUST_ITEM_NAME = list; }
	public void setList_l_ITEM_NAME(List list) { l_l_ITEM_NAME = list; }
	public void setList_l_ODR_ACPT_DATE(List list) { l_l_ODR_ACPT_DATE = list; }
	public void setList_l_JOB_ODR_CD(List list) { l_l_JOB_ODR_CD = list; }
	public void setList_l_JOB_ODR_QTY(List list) { l_l_JOB_ODR_QTY = list; }
	public void setList_l_JOB_ODR_DLV_DATE(List list) { l_l_JOB_ODR_DLV_DATE = list; }
	public void setList_l_ALC_GRP_CD(List list) { l_l_ALC_GRP_CD = list; }
	public void setList_l_REMARKS(List list) { l_l_REMARKS = list; }
	public void setList_l_CUS_DLV_KEY_CD(List list) { l_l_CUS_DLV_KEY_CD = list; }
	public void setList_l_CUS_DLV_CD(List list) { l_l_CUS_DLV_CD = list; }
	public void setList_d_NEW_CUST_ODR_NO(List list) { l_d_NEW_CUST_ODR_NO = list; }
	public void setList_d_CUST_ODR_NO_CHANGE(List list) { l_d_CUST_ODR_NO_CHANGE = list; }
	public void setList_d_NEW_CUST_CD(List list) { l_d_NEW_CUST_CD = list; }
	public void setList_d_CUST_CD_CHANGE(List list) { l_d_CUST_CD_CHANGE = list; }
	public void setList_d_NEW_CUST_ITEM_CD(List list) { l_d_NEW_CUST_ITEM_CD = list; }
	public void setList_d_CUST_ITEM_CD_CHANGE(List list) { l_d_CUST_ITEM_CD_CHANGE = list; }
	public void setList_d_DLV_LOC_CD_CHANGE(List list) { l_d_DLV_LOC_CD_CHANGE = list; }
	public void setList_d_NEW_ODR_QTY(List list) { l_d_NEW_ODR_QTY = list; }
	public void setList_d_ODR_QTY_CHANGE(List list) { l_d_ODR_QTY_CHANGE = list; }
	public void setList_d_NEW_DESINATED_DLV_DATE(List list) { l_d_NEW_DESINATED_DLV_DATE = list; }
	public void setList_d_DESINATED_DLV_DATE_CHANGE(List list) { l_d_DESINATED_DLV_DATE_CHANGE = list; }
	public void setList_d_NEW_SPCL_PRICE_TYP(List list) { l_d_NEW_SPCL_PRICE_TYP = list; }
	public void setList_d_SPCL_PRICE_TYP_CHANGE(List list) { l_d_SPCL_PRICE_TYP_CHANGE = list; }
	public void setList_d_NEW_ODR_UNIT_PRICE(List list) { l_d_NEW_ODR_UNIT_PRICE = list; }
	public void setList_d_ODR_UNIT_PRICE_CHANGE(List list) { l_d_ODR_UNIT_PRICE_CHANGE = list; }
	public void setList_d_NEW_DLV_LOC_CD(List list) { l_d_NEW_DLV_LOC_CD = list; }
	public void setList_d_NEW_REMARKS(List list) { l_d_NEW_REMARKS = list; }
	public void setList_d_REMARKS_CHANGE(List list) { l_d_REMARKS_CHANGE = list; }
	public void setList_d_NEW_ODR_NO(List list) { l_d_NEW_ODR_NO = list; }
	public void setList_d_ODR_NO_CHANGE(List list) { l_d_ODR_NO_CHANGE = list; }
	public void setList_d_NEW_ODR_TYP(List list) { l_d_NEW_ODR_TYP = list; }
	public void setList_d_ODR_TYP_CHANGE(List list) { l_d_ODR_TYP_CHANGE = list; }
	public void setList_l_STATUS_NAME(List list) { l_l_STATUS_NAME = list; }
	public void setList_l_PROJECT_CD(List list) { l_l_PROJECT_CD = list; }
	public void setList_l_ESTIMATE_NO(List list) { l_l_ESTIMATE_NO = list; }
	public void setList_l_DETAL_NO(List list) { l_l_DETAL_NO = list; }
	public void setList_l_ESTIMATE_TYPE(List list) { l_l_ESTIMATE_TYPE = list; }
	public void setList_l_h_ESTIMATE_TYPE(List list) { l_l_h_ESTIMATE_TYPE = list; }
	public void setList_l_OWN_PERSON_CD(List list) { l_l_OWN_PERSON_CD = list; }
	public void setList_l_OWN_ORG_CD(List list) { l_l_OWN_ORG_CD = list; }
	public void setList_l_ORGN_ODR_NO(List list) { l_l_ORGN_ODR_NO = list; }
	public void setList_l_ADD_ODR_FLG(List list) { l_l_ADD_ODR_FLG = list; }
	public void setList_l_h_ODR_TYP(List list) { l_l_h_ODR_TYP = list; }
	public void setList_l_h_DEPO_TYP(List list) { l_l_h_DEPO_TYP = list; }
	public void setList_h_APPR_POWER_TYP(List list) { l_h_APPR_POWER_TYP = list; }
	public void setList_LOGIN_USER_CD(List list) { l_LOGIN_USER_CD = list; }
	public void setList_h_APPR_ID(List list) { l_h_APPR_ID = list; }
	public void setList_h_SCREEN_URL(List list) { l_h_SCREEN_URL = list; }
	public void setList_h_STATUS(List list) { l_h_STATUS = list; }
	public void setList_h_PROC_TYP(List list) { l_h_PROC_TYP = list; }
	public void setList_l_REQUEST_BY(List list) { l_l_REQUEST_BY = list; }
	public void setList_l_REQUEST_BY_NAME(List list) { l_l_REQUEST_BY_NAME = list; }
	public void setList_l_REQUEST_DATE(List list) { l_l_REQUEST_DATE = list; }
	public void setList_l_APPR_REMARKS(List list) { l_l_APPR_REMARKS = list; }
	public void setList_l_RESERVE_CAUSE(List list) { l_l_RESERVE_CAUSE = list; }
	public void setList_h_MODIFY_COUNT(List list) { l_h_MODIFY_COUNT = list; }
	public void setList_START_DATE(List list) { l_START_DATE = list; }
	public void setList_END_DATE(List list) { l_END_DATE = list; }
	public void setList_CUST_CD(List list) { l_CUST_CD = list; }
	public void setList_FIELD_NAME(List list) { l_FIELD_NAME = list; }
	public void setList_FIELD_VALUE(List list) { l_FIELD_VALUE = list; }
	public void setList_FIELD_FLG(List list) { l_FIELD_FLG = list; }
	public void setList_d_OLD_ODR_NO(List list) { l_d_OLD_ODR_NO = list; }
	public void setList_d_OLD_ODR_TYP(List list) { l_d_OLD_ODR_TYP = list; }
	public void setList_d_OLD_CUST_ODR_NO(List list) { l_d_OLD_CUST_ODR_NO = list; }
	public void setList_d_OLD_CUST_CD(List list) { l_d_OLD_CUST_CD = list; }
	public void setList_d_OLD_CUST_ITEM_CD(List list) { l_d_OLD_CUST_ITEM_CD = list; }
	public void setList_d_OLD_DLV_LOC_CD(List list) { l_d_OLD_DLV_LOC_CD = list; }
	public void setList_d_OLD_ODR_QTY(List list) { l_d_OLD_ODR_QTY = list; }
	public void setList_d_OLD_DESINATED_DLV_DATE(List list) { l_d_OLD_DESINATED_DLV_DATE = list; }
	public void setList_d_OLD_SPCL_PRICE_TYP(List list) { l_d_OLD_SPCL_PRICE_TYP = list; }
	public void setList_d_OLD_ODR_UNIT_PRICE(List list) { l_d_OLD_ODR_UNIT_PRICE = list; }
	public void setList_d_OLD_REMARKS(List list) { l_d_OLD_REMARKS = list; }
	public void setList_h_ODR_NO(List list) { l_h_ODR_NO = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }
	public void setList_l_ODR_CMPLT_FLG(List list) { l_l_ODR_CMPLT_FLG = list; }

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
			l_r1_FILTER1.add(((KQ0010030Struct) list.get(i)).getr1_FILTER1());
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
			l_r2_FILTER1.add(((KQ0010030Struct) list.get(i)).getr2_FILTER1());
		}
		return size;
	}
	public int setL2L_r3_FILTER1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r3_FILTER1 == null) {
			l_r3_FILTER1 = new ArrayList();
		} else {
			l_r3_FILTER1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r3_FILTER1.add(((KQ0010030Struct) list.get(i)).getr3_FILTER1());
		}
		return size;
	}
	public int setL2L_h_SELECT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_SELECT_TYP == null) {
			l_h_SELECT_TYP = new ArrayList();
		} else {
			l_h_SELECT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_SELECT_TYP.add(((KQ0010030Struct) list.get(i)).geth_SELECT_TYP());
		}
		return size;
	}
	public int setL2L_h_REQUEST_APPR_SAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_REQUEST_APPR_SAME == null) {
			l_h_REQUEST_APPR_SAME = new ArrayList();
		} else {
			l_h_REQUEST_APPR_SAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_REQUEST_APPR_SAME.add(((KQ0010030Struct) list.get(i)).geth_REQUEST_APPR_SAME());
		}
		return size;
	}
	public int setL2L_RESERVE_CAUSE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RESERVE_CAUSE == null) {
			l_RESERVE_CAUSE = new ArrayList();
		} else {
			l_RESERVE_CAUSE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RESERVE_CAUSE.add(((KQ0010030Struct) list.get(i)).getRESERVE_CAUSE());
		}
		return size;
	}
	public int setL2L_l_PROC_TYP_VALUE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PROC_TYP_VALUE == null) {
			l_l_PROC_TYP_VALUE = new ArrayList();
		} else {
			l_l_PROC_TYP_VALUE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PROC_TYP_VALUE.add(((KQ0010030Struct) list.get(i)).getl_PROC_TYP_VALUE());
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
			l_l_ODR_TYP_DN.add(((KQ0010030Struct) list.get(i)).getl_ODR_TYP_DN());
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
			l_l_ODR_TYP.add(((KQ0010030Struct) list.get(i)).getl_ODR_TYP());
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
			l_l_CUST_ODR_NO.add(((KQ0010030Struct) list.get(i)).getl_CUST_ODR_NO());
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
			l_l_CUST_ITEM_CD.add(((KQ0010030Struct) list.get(i)).getl_CUST_ITEM_CD());
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
			l_l_ITEM_CD.add(((KQ0010030Struct) list.get(i)).getl_ITEM_CD());
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
			l_l_CUST_CD.add(((KQ0010030Struct) list.get(i)).getl_CUST_CD());
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
			l_l_CUST_ANAME.add(((KQ0010030Struct) list.get(i)).getl_CUST_ANAME());
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
			l_l_DESINATED_DLV_DATE.add(((KQ0010030Struct) list.get(i)).getl_DESINATED_DLV_DATE());
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
			l_l_ODR_QTY.add(((KQ0010030Struct) list.get(i)).getl_ODR_QTY());
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
			l_l_UNIT_CD.add(((KQ0010030Struct) list.get(i)).getl_UNIT_CD());
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
			l_l_ODR_UNIT_PRICE.add(((KQ0010030Struct) list.get(i)).getl_ODR_UNIT_PRICE());
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
			l_l_CUR_UNIT.add(((KQ0010030Struct) list.get(i)).getl_CUR_UNIT());
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
			l_l_SPCL_PRICE_TYP_DN.add(((KQ0010030Struct) list.get(i)).getl_SPCL_PRICE_TYP_DN());
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
			l_l_SPCL_PRICE_TYP.add(((KQ0010030Struct) list.get(i)).getl_SPCL_PRICE_TYP());
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
			l_l_DLV_LOC_CD.add(((KQ0010030Struct) list.get(i)).getl_DLV_LOC_CD());
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
			l_l_DLV_LOC_NAME.add(((KQ0010030Struct) list.get(i)).getl_DLV_LOC_NAME());
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
			l_l_DEPO_TYP_DN.add(((KQ0010030Struct) list.get(i)).getl_DEPO_TYP_DN());
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
			l_l_DEPO_TYP.add(((KQ0010030Struct) list.get(i)).getl_DEPO_TYP());
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
			l_l_CUST_ITEM_NAME.add(((KQ0010030Struct) list.get(i)).getl_CUST_ITEM_NAME());
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
			l_l_ITEM_NAME.add(((KQ0010030Struct) list.get(i)).getl_ITEM_NAME());
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
			l_l_ODR_ACPT_DATE.add(((KQ0010030Struct) list.get(i)).getl_ODR_ACPT_DATE());
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
			l_l_JOB_ODR_CD.add(((KQ0010030Struct) list.get(i)).getl_JOB_ODR_CD());
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
			l_l_JOB_ODR_QTY.add(((KQ0010030Struct) list.get(i)).getl_JOB_ODR_QTY());
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
			l_l_JOB_ODR_DLV_DATE.add(((KQ0010030Struct) list.get(i)).getl_JOB_ODR_DLV_DATE());
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
			l_l_ALC_GRP_CD.add(((KQ0010030Struct) list.get(i)).getl_ALC_GRP_CD());
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
			l_l_REMARKS.add(((KQ0010030Struct) list.get(i)).getl_REMARKS());
		}
		return size;
	}
	public int setL2L_l_CUS_DLV_KEY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_CUS_DLV_KEY_CD == null) {
			l_l_CUS_DLV_KEY_CD = new ArrayList();
		} else {
			l_l_CUS_DLV_KEY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_CUS_DLV_KEY_CD.add(((KQ0010030Struct) list.get(i)).getl_CUS_DLV_KEY_CD());
		}
		return size;
	}
	public int setL2L_l_CUS_DLV_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_CUS_DLV_CD == null) {
			l_l_CUS_DLV_CD = new ArrayList();
		} else {
			l_l_CUS_DLV_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_CUS_DLV_CD.add(((KQ0010030Struct) list.get(i)).getl_CUS_DLV_CD());
		}
		return size;
	}
	public int setL2L_d_NEW_CUST_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_d_NEW_CUST_ODR_NO == null) {
			l_d_NEW_CUST_ODR_NO = new ArrayList();
		} else {
			l_d_NEW_CUST_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_d_NEW_CUST_ODR_NO.add(((KQ0010030Struct) list.get(i)).getd_NEW_CUST_ODR_NO());
		}
		return size;
	}
	public int setL2L_d_CUST_ODR_NO_CHANGE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_d_CUST_ODR_NO_CHANGE == null) {
			l_d_CUST_ODR_NO_CHANGE = new ArrayList();
		} else {
			l_d_CUST_ODR_NO_CHANGE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_d_CUST_ODR_NO_CHANGE.add(((KQ0010030Struct) list.get(i)).getd_CUST_ODR_NO_CHANGE());
		}
		return size;
	}
	public int setL2L_d_NEW_CUST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_d_NEW_CUST_CD == null) {
			l_d_NEW_CUST_CD = new ArrayList();
		} else {
			l_d_NEW_CUST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_d_NEW_CUST_CD.add(((KQ0010030Struct) list.get(i)).getd_NEW_CUST_CD());
		}
		return size;
	}
	public int setL2L_d_CUST_CD_CHANGE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_d_CUST_CD_CHANGE == null) {
			l_d_CUST_CD_CHANGE = new ArrayList();
		} else {
			l_d_CUST_CD_CHANGE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_d_CUST_CD_CHANGE.add(((KQ0010030Struct) list.get(i)).getd_CUST_CD_CHANGE());
		}
		return size;
	}
	public int setL2L_d_NEW_CUST_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_d_NEW_CUST_ITEM_CD == null) {
			l_d_NEW_CUST_ITEM_CD = new ArrayList();
		} else {
			l_d_NEW_CUST_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_d_NEW_CUST_ITEM_CD.add(((KQ0010030Struct) list.get(i)).getd_NEW_CUST_ITEM_CD());
		}
		return size;
	}
	public int setL2L_d_CUST_ITEM_CD_CHANGE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_d_CUST_ITEM_CD_CHANGE == null) {
			l_d_CUST_ITEM_CD_CHANGE = new ArrayList();
		} else {
			l_d_CUST_ITEM_CD_CHANGE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_d_CUST_ITEM_CD_CHANGE.add(((KQ0010030Struct) list.get(i)).getd_CUST_ITEM_CD_CHANGE());
		}
		return size;
	}
	public int setL2L_d_DLV_LOC_CD_CHANGE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_d_DLV_LOC_CD_CHANGE == null) {
			l_d_DLV_LOC_CD_CHANGE = new ArrayList();
		} else {
			l_d_DLV_LOC_CD_CHANGE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_d_DLV_LOC_CD_CHANGE.add(((KQ0010030Struct) list.get(i)).getd_DLV_LOC_CD_CHANGE());
		}
		return size;
	}
	public int setL2L_d_NEW_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_d_NEW_ODR_QTY == null) {
			l_d_NEW_ODR_QTY = new ArrayList();
		} else {
			l_d_NEW_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_d_NEW_ODR_QTY.add(((KQ0010030Struct) list.get(i)).getd_NEW_ODR_QTY());
		}
		return size;
	}
	public int setL2L_d_ODR_QTY_CHANGE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_d_ODR_QTY_CHANGE == null) {
			l_d_ODR_QTY_CHANGE = new ArrayList();
		} else {
			l_d_ODR_QTY_CHANGE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_d_ODR_QTY_CHANGE.add(((KQ0010030Struct) list.get(i)).getd_ODR_QTY_CHANGE());
		}
		return size;
	}
	public int setL2L_d_NEW_DESINATED_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_d_NEW_DESINATED_DLV_DATE == null) {
			l_d_NEW_DESINATED_DLV_DATE = new ArrayList();
		} else {
			l_d_NEW_DESINATED_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_d_NEW_DESINATED_DLV_DATE.add(((KQ0010030Struct) list.get(i)).getd_NEW_DESINATED_DLV_DATE());
		}
		return size;
	}
	public int setL2L_d_DESINATED_DLV_DATE_CHANGE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_d_DESINATED_DLV_DATE_CHANGE == null) {
			l_d_DESINATED_DLV_DATE_CHANGE = new ArrayList();
		} else {
			l_d_DESINATED_DLV_DATE_CHANGE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_d_DESINATED_DLV_DATE_CHANGE.add(((KQ0010030Struct) list.get(i)).getd_DESINATED_DLV_DATE_CHANGE());
		}
		return size;
	}
	public int setL2L_d_NEW_SPCL_PRICE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_d_NEW_SPCL_PRICE_TYP == null) {
			l_d_NEW_SPCL_PRICE_TYP = new ArrayList();
		} else {
			l_d_NEW_SPCL_PRICE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_d_NEW_SPCL_PRICE_TYP.add(((KQ0010030Struct) list.get(i)).getd_NEW_SPCL_PRICE_TYP());
		}
		return size;
	}
	public int setL2L_d_SPCL_PRICE_TYP_CHANGE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_d_SPCL_PRICE_TYP_CHANGE == null) {
			l_d_SPCL_PRICE_TYP_CHANGE = new ArrayList();
		} else {
			l_d_SPCL_PRICE_TYP_CHANGE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_d_SPCL_PRICE_TYP_CHANGE.add(((KQ0010030Struct) list.get(i)).getd_SPCL_PRICE_TYP_CHANGE());
		}
		return size;
	}
	public int setL2L_d_NEW_ODR_UNIT_PRICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_d_NEW_ODR_UNIT_PRICE == null) {
			l_d_NEW_ODR_UNIT_PRICE = new ArrayList();
		} else {
			l_d_NEW_ODR_UNIT_PRICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_d_NEW_ODR_UNIT_PRICE.add(((KQ0010030Struct) list.get(i)).getd_NEW_ODR_UNIT_PRICE());
		}
		return size;
	}
	public int setL2L_d_ODR_UNIT_PRICE_CHANGE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_d_ODR_UNIT_PRICE_CHANGE == null) {
			l_d_ODR_UNIT_PRICE_CHANGE = new ArrayList();
		} else {
			l_d_ODR_UNIT_PRICE_CHANGE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_d_ODR_UNIT_PRICE_CHANGE.add(((KQ0010030Struct) list.get(i)).getd_ODR_UNIT_PRICE_CHANGE());
		}
		return size;
	}
	public int setL2L_d_NEW_DLV_LOC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_d_NEW_DLV_LOC_CD == null) {
			l_d_NEW_DLV_LOC_CD = new ArrayList();
		} else {
			l_d_NEW_DLV_LOC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_d_NEW_DLV_LOC_CD.add(((KQ0010030Struct) list.get(i)).getd_NEW_DLV_LOC_CD());
		}
		return size;
	}
	public int setL2L_d_NEW_REMARKS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_d_NEW_REMARKS == null) {
			l_d_NEW_REMARKS = new ArrayList();
		} else {
			l_d_NEW_REMARKS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_d_NEW_REMARKS.add(((KQ0010030Struct) list.get(i)).getd_NEW_REMARKS());
		}
		return size;
	}
	public int setL2L_d_REMARKS_CHANGE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_d_REMARKS_CHANGE == null) {
			l_d_REMARKS_CHANGE = new ArrayList();
		} else {
			l_d_REMARKS_CHANGE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_d_REMARKS_CHANGE.add(((KQ0010030Struct) list.get(i)).getd_REMARKS_CHANGE());
		}
		return size;
	}
	public int setL2L_d_NEW_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_d_NEW_ODR_NO == null) {
			l_d_NEW_ODR_NO = new ArrayList();
		} else {
			l_d_NEW_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_d_NEW_ODR_NO.add(((KQ0010030Struct) list.get(i)).getd_NEW_ODR_NO());
		}
		return size;
	}
	public int setL2L_d_ODR_NO_CHANGE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_d_ODR_NO_CHANGE == null) {
			l_d_ODR_NO_CHANGE = new ArrayList();
		} else {
			l_d_ODR_NO_CHANGE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_d_ODR_NO_CHANGE.add(((KQ0010030Struct) list.get(i)).getd_ODR_NO_CHANGE());
		}
		return size;
	}
	public int setL2L_d_NEW_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_d_NEW_ODR_TYP == null) {
			l_d_NEW_ODR_TYP = new ArrayList();
		} else {
			l_d_NEW_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_d_NEW_ODR_TYP.add(((KQ0010030Struct) list.get(i)).getd_NEW_ODR_TYP());
		}
		return size;
	}
	public int setL2L_d_ODR_TYP_CHANGE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_d_ODR_TYP_CHANGE == null) {
			l_d_ODR_TYP_CHANGE = new ArrayList();
		} else {
			l_d_ODR_TYP_CHANGE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_d_ODR_TYP_CHANGE.add(((KQ0010030Struct) list.get(i)).getd_ODR_TYP_CHANGE());
		}
		return size;
	}
	public int setL2L_l_STATUS_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_STATUS_NAME == null) {
			l_l_STATUS_NAME = new ArrayList();
		} else {
			l_l_STATUS_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_STATUS_NAME.add(((KQ0010030Struct) list.get(i)).getl_STATUS_NAME());
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
			l_l_PROJECT_CD.add(((KQ0010030Struct) list.get(i)).getl_PROJECT_CD());
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
			l_l_ESTIMATE_NO.add(((KQ0010030Struct) list.get(i)).getl_ESTIMATE_NO());
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
			l_l_DETAL_NO.add(((KQ0010030Struct) list.get(i)).getl_DETAL_NO());
		}
		return size;
	}
	public int setL2L_l_ESTIMATE_TYPE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ESTIMATE_TYPE == null) {
			l_l_ESTIMATE_TYPE = new ArrayList();
		} else {
			l_l_ESTIMATE_TYPE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ESTIMATE_TYPE.add(((KQ0010030Struct) list.get(i)).getl_ESTIMATE_TYPE());
		}
		return size;
	}
	public int setL2L_l_h_ESTIMATE_TYPE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_h_ESTIMATE_TYPE == null) {
			l_l_h_ESTIMATE_TYPE = new ArrayList();
		} else {
			l_l_h_ESTIMATE_TYPE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_h_ESTIMATE_TYPE.add(((KQ0010030Struct) list.get(i)).getl_h_ESTIMATE_TYPE());
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
			l_l_OWN_PERSON_CD.add(((KQ0010030Struct) list.get(i)).getl_OWN_PERSON_CD());
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
			l_l_OWN_ORG_CD.add(((KQ0010030Struct) list.get(i)).getl_OWN_ORG_CD());
		}
		return size;
	}
	public int setL2L_l_ORGN_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ORGN_ODR_NO == null) {
			l_l_ORGN_ODR_NO = new ArrayList();
		} else {
			l_l_ORGN_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ORGN_ODR_NO.add(((KQ0010030Struct) list.get(i)).getl_ORGN_ODR_NO());
		}
		return size;
	}
	public int setL2L_l_ADD_ODR_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ADD_ODR_FLG == null) {
			l_l_ADD_ODR_FLG = new ArrayList();
		} else {
			l_l_ADD_ODR_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ADD_ODR_FLG.add(((KQ0010030Struct) list.get(i)).getl_ADD_ODR_FLG());
		}
		return size;
	}
	public int setL2L_l_h_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_h_ODR_TYP == null) {
			l_l_h_ODR_TYP = new ArrayList();
		} else {
			l_l_h_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_h_ODR_TYP.add(((KQ0010030Struct) list.get(i)).getl_h_ODR_TYP());
		}
		return size;
	}
	public int setL2L_l_h_DEPO_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_h_DEPO_TYP == null) {
			l_l_h_DEPO_TYP = new ArrayList();
		} else {
			l_l_h_DEPO_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_h_DEPO_TYP.add(((KQ0010030Struct) list.get(i)).getl_h_DEPO_TYP());
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
			l_h_APPR_POWER_TYP.add(((KQ0010030Struct) list.get(i)).geth_APPR_POWER_TYP());
		}
		return size;
	}
	public int setL2L_LOGIN_USER_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOGIN_USER_CD == null) {
			l_LOGIN_USER_CD = new ArrayList();
		} else {
			l_LOGIN_USER_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOGIN_USER_CD.add(((KQ0010030Struct) list.get(i)).getLOGIN_USER_CD());
		}
		return size;
	}
	public int setL2L_h_APPR_ID(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_APPR_ID == null) {
			l_h_APPR_ID = new ArrayList();
		} else {
			l_h_APPR_ID.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_APPR_ID.add(((KQ0010030Struct) list.get(i)).geth_APPR_ID());
		}
		return size;
	}
	public int setL2L_h_SCREEN_URL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_SCREEN_URL == null) {
			l_h_SCREEN_URL = new ArrayList();
		} else {
			l_h_SCREEN_URL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_SCREEN_URL.add(((KQ0010030Struct) list.get(i)).geth_SCREEN_URL());
		}
		return size;
	}
	public int setL2L_h_STATUS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_STATUS == null) {
			l_h_STATUS = new ArrayList();
		} else {
			l_h_STATUS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_STATUS.add(((KQ0010030Struct) list.get(i)).geth_STATUS());
		}
		return size;
	}
	public int setL2L_h_PROC_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PROC_TYP == null) {
			l_h_PROC_TYP = new ArrayList();
		} else {
			l_h_PROC_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PROC_TYP.add(((KQ0010030Struct) list.get(i)).geth_PROC_TYP());
		}
		return size;
	}
	public int setL2L_l_REQUEST_BY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_REQUEST_BY == null) {
			l_l_REQUEST_BY = new ArrayList();
		} else {
			l_l_REQUEST_BY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_REQUEST_BY.add(((KQ0010030Struct) list.get(i)).getl_REQUEST_BY());
		}
		return size;
	}
	public int setL2L_l_REQUEST_BY_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_REQUEST_BY_NAME == null) {
			l_l_REQUEST_BY_NAME = new ArrayList();
		} else {
			l_l_REQUEST_BY_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_REQUEST_BY_NAME.add(((KQ0010030Struct) list.get(i)).getl_REQUEST_BY_NAME());
		}
		return size;
	}
	public int setL2L_l_REQUEST_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_REQUEST_DATE == null) {
			l_l_REQUEST_DATE = new ArrayList();
		} else {
			l_l_REQUEST_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_REQUEST_DATE.add(((KQ0010030Struct) list.get(i)).getl_REQUEST_DATE());
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
			l_l_APPR_REMARKS.add(((KQ0010030Struct) list.get(i)).getl_APPR_REMARKS());
		}
		return size;
	}
	public int setL2L_l_RESERVE_CAUSE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_RESERVE_CAUSE == null) {
			l_l_RESERVE_CAUSE = new ArrayList();
		} else {
			l_l_RESERVE_CAUSE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_RESERVE_CAUSE.add(((KQ0010030Struct) list.get(i)).getl_RESERVE_CAUSE());
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
			l_h_MODIFY_COUNT.add(((KQ0010030Struct) list.get(i)).geth_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_START_DATE == null) {
			l_START_DATE = new ArrayList();
		} else {
			l_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_START_DATE.add(((KQ0010030Struct) list.get(i)).getSTART_DATE());
		}
		return size;
	}
	public int setL2L_END_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_END_DATE == null) {
			l_END_DATE = new ArrayList();
		} else {
			l_END_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_END_DATE.add(((KQ0010030Struct) list.get(i)).getEND_DATE());
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
			l_CUST_CD.add(((KQ0010030Struct) list.get(i)).getCUST_CD());
		}
		return size;
	}
	public int setL2L_FIELD_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FIELD_NAME == null) {
			l_FIELD_NAME = new ArrayList();
		} else {
			l_FIELD_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FIELD_NAME.add(((KQ0010030Struct) list.get(i)).getFIELD_NAME());
		}
		return size;
	}
	public int setL2L_FIELD_VALUE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FIELD_VALUE == null) {
			l_FIELD_VALUE = new ArrayList();
		} else {
			l_FIELD_VALUE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FIELD_VALUE.add(((KQ0010030Struct) list.get(i)).getFIELD_VALUE());
		}
		return size;
	}
	public int setL2L_FIELD_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FIELD_FLG == null) {
			l_FIELD_FLG = new ArrayList();
		} else {
			l_FIELD_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FIELD_FLG.add(((KQ0010030Struct) list.get(i)).getFIELD_FLG());
		}
		return size;
	}
	public int setL2L_d_OLD_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_d_OLD_ODR_NO == null) {
			l_d_OLD_ODR_NO = new ArrayList();
		} else {
			l_d_OLD_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_d_OLD_ODR_NO.add(((KQ0010030Struct) list.get(i)).getd_OLD_ODR_NO());
		}
		return size;
	}
	public int setL2L_d_OLD_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_d_OLD_ODR_TYP == null) {
			l_d_OLD_ODR_TYP = new ArrayList();
		} else {
			l_d_OLD_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_d_OLD_ODR_TYP.add(((KQ0010030Struct) list.get(i)).getd_OLD_ODR_TYP());
		}
		return size;
	}
	public int setL2L_d_OLD_CUST_ODR_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_d_OLD_CUST_ODR_NO == null) {
			l_d_OLD_CUST_ODR_NO = new ArrayList();
		} else {
			l_d_OLD_CUST_ODR_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_d_OLD_CUST_ODR_NO.add(((KQ0010030Struct) list.get(i)).getd_OLD_CUST_ODR_NO());
		}
		return size;
	}
	public int setL2L_d_OLD_CUST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_d_OLD_CUST_CD == null) {
			l_d_OLD_CUST_CD = new ArrayList();
		} else {
			l_d_OLD_CUST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_d_OLD_CUST_CD.add(((KQ0010030Struct) list.get(i)).getd_OLD_CUST_CD());
		}
		return size;
	}
	public int setL2L_d_OLD_CUST_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_d_OLD_CUST_ITEM_CD == null) {
			l_d_OLD_CUST_ITEM_CD = new ArrayList();
		} else {
			l_d_OLD_CUST_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_d_OLD_CUST_ITEM_CD.add(((KQ0010030Struct) list.get(i)).getd_OLD_CUST_ITEM_CD());
		}
		return size;
	}
	public int setL2L_d_OLD_DLV_LOC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_d_OLD_DLV_LOC_CD == null) {
			l_d_OLD_DLV_LOC_CD = new ArrayList();
		} else {
			l_d_OLD_DLV_LOC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_d_OLD_DLV_LOC_CD.add(((KQ0010030Struct) list.get(i)).getd_OLD_DLV_LOC_CD());
		}
		return size;
	}
	public int setL2L_d_OLD_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_d_OLD_ODR_QTY == null) {
			l_d_OLD_ODR_QTY = new ArrayList();
		} else {
			l_d_OLD_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_d_OLD_ODR_QTY.add(((KQ0010030Struct) list.get(i)).getd_OLD_ODR_QTY());
		}
		return size;
	}
	public int setL2L_d_OLD_DESINATED_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_d_OLD_DESINATED_DLV_DATE == null) {
			l_d_OLD_DESINATED_DLV_DATE = new ArrayList();
		} else {
			l_d_OLD_DESINATED_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_d_OLD_DESINATED_DLV_DATE.add(((KQ0010030Struct) list.get(i)).getd_OLD_DESINATED_DLV_DATE());
		}
		return size;
	}
	public int setL2L_d_OLD_SPCL_PRICE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_d_OLD_SPCL_PRICE_TYP == null) {
			l_d_OLD_SPCL_PRICE_TYP = new ArrayList();
		} else {
			l_d_OLD_SPCL_PRICE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_d_OLD_SPCL_PRICE_TYP.add(((KQ0010030Struct) list.get(i)).getd_OLD_SPCL_PRICE_TYP());
		}
		return size;
	}
	public int setL2L_d_OLD_ODR_UNIT_PRICE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_d_OLD_ODR_UNIT_PRICE == null) {
			l_d_OLD_ODR_UNIT_PRICE = new ArrayList();
		} else {
			l_d_OLD_ODR_UNIT_PRICE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_d_OLD_ODR_UNIT_PRICE.add(((KQ0010030Struct) list.get(i)).getd_OLD_ODR_UNIT_PRICE());
		}
		return size;
	}
	public int setL2L_d_OLD_REMARKS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_d_OLD_REMARKS == null) {
			l_d_OLD_REMARKS = new ArrayList();
		} else {
			l_d_OLD_REMARKS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_d_OLD_REMARKS.add(((KQ0010030Struct) list.get(i)).getd_OLD_REMARKS());
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
			l_h_ODR_NO.add(((KQ0010030Struct) list.get(i)).geth_ODR_NO());
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
			l_l_COUNT.add(((KQ0010030Struct) list.get(i)).getl_COUNT());
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
			l_ROW_COUNT.add(((KQ0010030Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}
	public int setL2L_l_ODR_CMPLT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ODR_CMPLT_FLG == null) {
			l_l_ODR_CMPLT_FLG = new ArrayList();
		} else {
			l_l_ODR_CMPLT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ODR_CMPLT_FLG.add(((KQ0010030Struct) list.get(i)).getl_ODR_CMPLT_FLG());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_r1_FILTER1 = null;
		m_r2_FILTER1 = null;
		m_r3_FILTER1 = null;
		m_h_SELECT_TYP = null;
		m_h_REQUEST_APPR_SAME = null;
		m_RESERVE_CAUSE = null;
		m_l_PROC_TYP_VALUE = null;
		m_l_ODR_TYP_DN = null;
		m_l_ODR_TYP = null;
		m_l_CUST_ODR_NO = null;
		m_l_CUST_ITEM_CD = null;
		m_l_ITEM_CD = null;
		m_l_CUST_CD = null;
		m_l_CUST_ANAME = null;
		m_l_DESINATED_DLV_DATE = null;
		m_l_ODR_QTY = null;
		m_l_UNIT_CD = null;
		m_l_ODR_UNIT_PRICE = null;
		m_l_CUR_UNIT = null;
		m_l_SPCL_PRICE_TYP_DN = null;
		m_l_SPCL_PRICE_TYP = null;
		m_l_DLV_LOC_CD = null;
		m_l_DLV_LOC_NAME = null;
		m_l_DEPO_TYP_DN = null;
		m_l_DEPO_TYP = null;
		m_l_CUST_ITEM_NAME = null;
		m_l_ITEM_NAME = null;
		m_l_ODR_ACPT_DATE = null;
		m_l_JOB_ODR_CD = null;
		m_l_JOB_ODR_QTY = null;
		m_l_JOB_ODR_DLV_DATE = null;
		m_l_ALC_GRP_CD = null;
		m_l_REMARKS = null;
		m_l_CUS_DLV_KEY_CD = null;
		m_l_CUS_DLV_CD = null;
		m_d_NEW_CUST_ODR_NO = null;
		m_d_CUST_ODR_NO_CHANGE = null;
		m_d_NEW_CUST_CD = null;
		m_d_CUST_CD_CHANGE = null;
		m_d_NEW_CUST_ITEM_CD = null;
		m_d_CUST_ITEM_CD_CHANGE = null;
		m_d_DLV_LOC_CD_CHANGE = null;
		m_d_NEW_ODR_QTY = null;
		m_d_ODR_QTY_CHANGE = null;
		m_d_NEW_DESINATED_DLV_DATE = null;
		m_d_DESINATED_DLV_DATE_CHANGE = null;
		m_d_NEW_SPCL_PRICE_TYP = null;
		m_d_SPCL_PRICE_TYP_CHANGE = null;
		m_d_NEW_ODR_UNIT_PRICE = null;
		m_d_ODR_UNIT_PRICE_CHANGE = null;
		m_d_NEW_DLV_LOC_CD = null;
		m_d_NEW_REMARKS = null;
		m_d_REMARKS_CHANGE = null;
		m_d_NEW_ODR_NO = null;
		m_d_ODR_NO_CHANGE = null;
		m_d_NEW_ODR_TYP = null;
		m_d_ODR_TYP_CHANGE = null;
		m_l_STATUS_NAME = null;
		m_l_PROJECT_CD = null;
		m_l_ESTIMATE_NO = null;
		m_l_DETAL_NO = null;
		m_l_ESTIMATE_TYPE = null;
		m_l_h_ESTIMATE_TYPE = null;
		m_l_OWN_PERSON_CD = null;
		m_l_OWN_ORG_CD = null;
		m_l_ORGN_ODR_NO = null;
		m_l_ADD_ODR_FLG = null;
		m_l_h_ODR_TYP = null;
		m_l_h_DEPO_TYP = null;
		m_h_APPR_POWER_TYP = null;
		m_LOGIN_USER_CD = null;
		m_h_APPR_ID = null;
		m_h_SCREEN_URL = null;
		m_h_STATUS = null;
		m_h_PROC_TYP = null;
		m_l_REQUEST_BY = null;
		m_l_REQUEST_BY_NAME = null;
		m_l_REQUEST_DATE = null;
		m_l_APPR_REMARKS = null;
		m_l_RESERVE_CAUSE = null;
		m_h_MODIFY_COUNT = null;
		m_START_DATE = null;
		m_END_DATE = null;
		m_CUST_CD = null;
		m_FIELD_NAME = null;
		m_FIELD_VALUE = null;
		m_FIELD_FLG = null;
		m_d_OLD_ODR_NO = null;
		m_d_OLD_ODR_TYP = null;
		m_d_OLD_CUST_ODR_NO = null;
		m_d_OLD_CUST_CD = null;
		m_d_OLD_CUST_ITEM_CD = null;
		m_d_OLD_DLV_LOC_CD = null;
		m_d_OLD_ODR_QTY = null;
		m_d_OLD_DESINATED_DLV_DATE = null;
		m_d_OLD_SPCL_PRICE_TYP = null;
		m_d_OLD_ODR_UNIT_PRICE = null;
		m_d_OLD_REMARKS = null;
		m_h_ODR_NO = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;
		m_l_ODR_CMPLT_FLG = null;

		l_r1_FILTER1 = null;
		l_r2_FILTER1 = null;
		l_r3_FILTER1 = null;
		l_h_SELECT_TYP = null;
		l_h_REQUEST_APPR_SAME = null;
		l_RESERVE_CAUSE = null;
		l_l_PROC_TYP_VALUE = null;
		l_l_ODR_TYP_DN = null;
		l_l_ODR_TYP = null;
		l_l_CUST_ODR_NO = null;
		l_l_CUST_ITEM_CD = null;
		l_l_ITEM_CD = null;
		l_l_CUST_CD = null;
		l_l_CUST_ANAME = null;
		l_l_DESINATED_DLV_DATE = null;
		l_l_ODR_QTY = null;
		l_l_UNIT_CD = null;
		l_l_ODR_UNIT_PRICE = null;
		l_l_CUR_UNIT = null;
		l_l_SPCL_PRICE_TYP_DN = null;
		l_l_SPCL_PRICE_TYP = null;
		l_l_DLV_LOC_CD = null;
		l_l_DLV_LOC_NAME = null;
		l_l_DEPO_TYP_DN = null;
		l_l_DEPO_TYP = null;
		l_l_CUST_ITEM_NAME = null;
		l_l_ITEM_NAME = null;
		l_l_ODR_ACPT_DATE = null;
		l_l_JOB_ODR_CD = null;
		l_l_JOB_ODR_QTY = null;
		l_l_JOB_ODR_DLV_DATE = null;
		l_l_ALC_GRP_CD = null;
		l_l_REMARKS = null;
		l_l_CUS_DLV_KEY_CD = null;
		l_l_CUS_DLV_CD = null;
		l_d_NEW_CUST_ODR_NO = null;
		l_d_CUST_ODR_NO_CHANGE = null;
		l_d_NEW_CUST_CD = null;
		l_d_CUST_CD_CHANGE = null;
		l_d_NEW_CUST_ITEM_CD = null;
		l_d_CUST_ITEM_CD_CHANGE = null;
		l_d_DLV_LOC_CD_CHANGE = null;
		l_d_NEW_ODR_QTY = null;
		l_d_ODR_QTY_CHANGE = null;
		l_d_NEW_DESINATED_DLV_DATE = null;
		l_d_DESINATED_DLV_DATE_CHANGE = null;
		l_d_NEW_SPCL_PRICE_TYP = null;
		l_d_SPCL_PRICE_TYP_CHANGE = null;
		l_d_NEW_ODR_UNIT_PRICE = null;
		l_d_ODR_UNIT_PRICE_CHANGE = null;
		l_d_NEW_DLV_LOC_CD = null;
		l_d_NEW_REMARKS = null;
		l_d_REMARKS_CHANGE = null;
		l_d_NEW_ODR_NO = null;
		l_d_ODR_NO_CHANGE = null;
		l_d_NEW_ODR_TYP = null;
		l_d_ODR_TYP_CHANGE = null;
		l_l_STATUS_NAME = null;
		l_l_PROJECT_CD = null;
		l_l_ESTIMATE_NO = null;
		l_l_DETAL_NO = null;
		l_l_ESTIMATE_TYPE = null;
		l_l_h_ESTIMATE_TYPE = null;
		l_l_OWN_PERSON_CD = null;
		l_l_OWN_ORG_CD = null;
		l_l_ORGN_ODR_NO = null;
		l_l_ADD_ODR_FLG = null;
		l_l_h_ODR_TYP = null;
		l_l_h_DEPO_TYP = null;
		l_h_APPR_POWER_TYP = null;
		l_LOGIN_USER_CD = null;
		l_h_APPR_ID = null;
		l_h_SCREEN_URL = null;
		l_h_STATUS = null;
		l_h_PROC_TYP = null;
		l_l_REQUEST_BY = null;
		l_l_REQUEST_BY_NAME = null;
		l_l_REQUEST_DATE = null;
		l_l_APPR_REMARKS = null;
		l_l_RESERVE_CAUSE = null;
		l_h_MODIFY_COUNT = null;
		l_START_DATE = null;
		l_END_DATE = null;
		l_CUST_CD = null;
		l_FIELD_NAME = null;
		l_FIELD_VALUE = null;
		l_FIELD_FLG = null;
		l_d_OLD_ODR_NO = null;
		l_d_OLD_ODR_TYP = null;
		l_d_OLD_CUST_ODR_NO = null;
		l_d_OLD_CUST_CD = null;
		l_d_OLD_CUST_ITEM_CD = null;
		l_d_OLD_DLV_LOC_CD = null;
		l_d_OLD_ODR_QTY = null;
		l_d_OLD_DESINATED_DLV_DATE = null;
		l_d_OLD_SPCL_PRICE_TYP = null;
		l_d_OLD_ODR_UNIT_PRICE = null;
		l_d_OLD_REMARKS = null;
		l_h_ODR_NO = null;
		l_l_COUNT = null;
		l_ROW_COUNT = null;
		l_l_ODR_CMPLT_FLG = null;

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
	 * medKQ0010030�N���X�̕W���R���X�g���N�^
	 */
	public KQ0010030Struct()
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
	public void setStruct(KQ0010030Struct struct)
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
	public void setStructM(KQ0010030Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setr1_FILTER1(struct.getr1_FILTER1());
			this.setr2_FILTER1(struct.getr2_FILTER1());
			this.setr3_FILTER1(struct.getr3_FILTER1());
			this.seth_SELECT_TYP(struct.geth_SELECT_TYP());
			this.seth_REQUEST_APPR_SAME(struct.geth_REQUEST_APPR_SAME());
			this.setRESERVE_CAUSE(struct.getRESERVE_CAUSE());
			this.setl_PROC_TYP_VALUE(struct.getl_PROC_TYP_VALUE());
			this.setl_ODR_TYP_DN(struct.getl_ODR_TYP_DN());
			this.setl_ODR_TYP(struct.getl_ODR_TYP());
			this.setl_CUST_ODR_NO(struct.getl_CUST_ODR_NO());
			this.setl_CUST_ITEM_CD(struct.getl_CUST_ITEM_CD());
			this.setl_ITEM_CD(struct.getl_ITEM_CD());
			this.setl_CUST_CD(struct.getl_CUST_CD());
			this.setl_CUST_ANAME(struct.getl_CUST_ANAME());
			this.setl_DESINATED_DLV_DATE(struct.getl_DESINATED_DLV_DATE());
			this.setl_ODR_QTY(struct.getl_ODR_QTY());
			this.setl_UNIT_CD(struct.getl_UNIT_CD());
			this.setl_ODR_UNIT_PRICE(struct.getl_ODR_UNIT_PRICE());
			this.setl_CUR_UNIT(struct.getl_CUR_UNIT());
			this.setl_SPCL_PRICE_TYP_DN(struct.getl_SPCL_PRICE_TYP_DN());
			this.setl_SPCL_PRICE_TYP(struct.getl_SPCL_PRICE_TYP());
			this.setl_DLV_LOC_CD(struct.getl_DLV_LOC_CD());
			this.setl_DLV_LOC_NAME(struct.getl_DLV_LOC_NAME());
			this.setl_DEPO_TYP_DN(struct.getl_DEPO_TYP_DN());
			this.setl_DEPO_TYP(struct.getl_DEPO_TYP());
			this.setl_CUST_ITEM_NAME(struct.getl_CUST_ITEM_NAME());
			this.setl_ITEM_NAME(struct.getl_ITEM_NAME());
			this.setl_ODR_ACPT_DATE(struct.getl_ODR_ACPT_DATE());
			this.setl_JOB_ODR_CD(struct.getl_JOB_ODR_CD());
			this.setl_JOB_ODR_QTY(struct.getl_JOB_ODR_QTY());
			this.setl_JOB_ODR_DLV_DATE(struct.getl_JOB_ODR_DLV_DATE());
			this.setl_ALC_GRP_CD(struct.getl_ALC_GRP_CD());
			this.setl_REMARKS(struct.getl_REMARKS());
			this.setl_CUS_DLV_KEY_CD(struct.getl_CUS_DLV_KEY_CD());
			this.setl_CUS_DLV_CD(struct.getl_CUS_DLV_CD());
			this.setd_NEW_CUST_ODR_NO(struct.getd_NEW_CUST_ODR_NO());
			this.setd_CUST_ODR_NO_CHANGE(struct.getd_CUST_ODR_NO_CHANGE());
			this.setd_NEW_CUST_CD(struct.getd_NEW_CUST_CD());
			this.setd_CUST_CD_CHANGE(struct.getd_CUST_CD_CHANGE());
			this.setd_NEW_CUST_ITEM_CD(struct.getd_NEW_CUST_ITEM_CD());
			this.setd_CUST_ITEM_CD_CHANGE(struct.getd_CUST_ITEM_CD_CHANGE());
			this.setd_DLV_LOC_CD_CHANGE(struct.getd_DLV_LOC_CD_CHANGE());
			this.setd_NEW_ODR_QTY(struct.getd_NEW_ODR_QTY());
			this.setd_ODR_QTY_CHANGE(struct.getd_ODR_QTY_CHANGE());
			this.setd_NEW_DESINATED_DLV_DATE(struct.getd_NEW_DESINATED_DLV_DATE());
			this.setd_DESINATED_DLV_DATE_CHANGE(struct.getd_DESINATED_DLV_DATE_CHANGE());
			this.setd_NEW_SPCL_PRICE_TYP(struct.getd_NEW_SPCL_PRICE_TYP());
			this.setd_SPCL_PRICE_TYP_CHANGE(struct.getd_SPCL_PRICE_TYP_CHANGE());
			this.setd_NEW_ODR_UNIT_PRICE(struct.getd_NEW_ODR_UNIT_PRICE());
			this.setd_ODR_UNIT_PRICE_CHANGE(struct.getd_ODR_UNIT_PRICE_CHANGE());
			this.setd_NEW_DLV_LOC_CD(struct.getd_NEW_DLV_LOC_CD());
			this.setd_NEW_REMARKS(struct.getd_NEW_REMARKS());
			this.setd_REMARKS_CHANGE(struct.getd_REMARKS_CHANGE());
			this.setd_NEW_ODR_NO(struct.getd_NEW_ODR_NO());
			this.setd_ODR_NO_CHANGE(struct.getd_ODR_NO_CHANGE());
			this.setd_NEW_ODR_TYP(struct.getd_NEW_ODR_TYP());
			this.setd_ODR_TYP_CHANGE(struct.getd_ODR_TYP_CHANGE());
			this.setl_STATUS_NAME(struct.getl_STATUS_NAME());
			this.setl_PROJECT_CD(struct.getl_PROJECT_CD());
			this.setl_ESTIMATE_NO(struct.getl_ESTIMATE_NO());
			this.setl_DETAL_NO(struct.getl_DETAL_NO());
			this.setl_ESTIMATE_TYPE(struct.getl_ESTIMATE_TYPE());
			this.setl_h_ESTIMATE_TYPE(struct.getl_h_ESTIMATE_TYPE());
			this.setl_OWN_PERSON_CD(struct.getl_OWN_PERSON_CD());
			this.setl_OWN_ORG_CD(struct.getl_OWN_ORG_CD());
			this.setl_ORGN_ODR_NO(struct.getl_ORGN_ODR_NO());
			this.setl_ADD_ODR_FLG(struct.getl_ADD_ODR_FLG());
			this.setl_h_ODR_TYP(struct.getl_h_ODR_TYP());
			this.setl_h_DEPO_TYP(struct.getl_h_DEPO_TYP());
			this.seth_APPR_POWER_TYP(struct.geth_APPR_POWER_TYP());
			this.setLOGIN_USER_CD(struct.getLOGIN_USER_CD());
			this.seth_APPR_ID(struct.geth_APPR_ID());
			this.seth_SCREEN_URL(struct.geth_SCREEN_URL());
			this.seth_STATUS(struct.geth_STATUS());
			this.seth_PROC_TYP(struct.geth_PROC_TYP());
			this.setl_REQUEST_BY(struct.getl_REQUEST_BY());
			this.setl_REQUEST_BY_NAME(struct.getl_REQUEST_BY_NAME());
			this.setl_REQUEST_DATE(struct.getl_REQUEST_DATE());
			this.setl_APPR_REMARKS(struct.getl_APPR_REMARKS());
			this.setl_RESERVE_CAUSE(struct.getl_RESERVE_CAUSE());
			this.seth_MODIFY_COUNT(struct.geth_MODIFY_COUNT());
			this.setSTART_DATE(struct.getSTART_DATE());
			this.setEND_DATE(struct.getEND_DATE());
			this.setCUST_CD(struct.getCUST_CD());
			this.setFIELD_NAME(struct.getFIELD_NAME());
			this.setFIELD_VALUE(struct.getFIELD_VALUE());
			this.setFIELD_FLG(struct.getFIELD_FLG());
			this.setd_OLD_ODR_NO(struct.getd_OLD_ODR_NO());
			this.setd_OLD_ODR_TYP(struct.getd_OLD_ODR_TYP());
			this.setd_OLD_CUST_ODR_NO(struct.getd_OLD_CUST_ODR_NO());
			this.setd_OLD_CUST_CD(struct.getd_OLD_CUST_CD());
			this.setd_OLD_CUST_ITEM_CD(struct.getd_OLD_CUST_ITEM_CD());
			this.setd_OLD_DLV_LOC_CD(struct.getd_OLD_DLV_LOC_CD());
			this.setd_OLD_ODR_QTY(struct.getd_OLD_ODR_QTY());
			this.setd_OLD_DESINATED_DLV_DATE(struct.getd_OLD_DESINATED_DLV_DATE());
			this.setd_OLD_SPCL_PRICE_TYP(struct.getd_OLD_SPCL_PRICE_TYP());
			this.setd_OLD_ODR_UNIT_PRICE(struct.getd_OLD_ODR_UNIT_PRICE());
			this.setd_OLD_REMARKS(struct.getd_OLD_REMARKS());
			this.seth_ODR_NO(struct.geth_ODR_NO());
			this.setl_COUNT(struct.getl_COUNT());
			this.setROW_COUNT(struct.getROW_COUNT());
			this.setl_ODR_CMPLT_FLG(struct.getl_ODR_CMPLT_FLG());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(KQ0010030Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_r1_FILTER1(struct.getList_r1_FILTER1());
			this.setList_r2_FILTER1(struct.getList_r2_FILTER1());
			this.setList_r3_FILTER1(struct.getList_r3_FILTER1());
			this.setList_h_SELECT_TYP(struct.getList_h_SELECT_TYP());
			this.setList_h_REQUEST_APPR_SAME(struct.getList_h_REQUEST_APPR_SAME());
			this.setList_RESERVE_CAUSE(struct.getList_RESERVE_CAUSE());
			this.setList_l_PROC_TYP_VALUE(struct.getList_l_PROC_TYP_VALUE());
			this.setList_l_ODR_TYP_DN(struct.getList_l_ODR_TYP_DN());
			this.setList_l_ODR_TYP(struct.getList_l_ODR_TYP());
			this.setList_l_CUST_ODR_NO(struct.getList_l_CUST_ODR_NO());
			this.setList_l_CUST_ITEM_CD(struct.getList_l_CUST_ITEM_CD());
			this.setList_l_ITEM_CD(struct.getList_l_ITEM_CD());
			this.setList_l_CUST_CD(struct.getList_l_CUST_CD());
			this.setList_l_CUST_ANAME(struct.getList_l_CUST_ANAME());
			this.setList_l_DESINATED_DLV_DATE(struct.getList_l_DESINATED_DLV_DATE());
			this.setList_l_ODR_QTY(struct.getList_l_ODR_QTY());
			this.setList_l_UNIT_CD(struct.getList_l_UNIT_CD());
			this.setList_l_ODR_UNIT_PRICE(struct.getList_l_ODR_UNIT_PRICE());
			this.setList_l_CUR_UNIT(struct.getList_l_CUR_UNIT());
			this.setList_l_SPCL_PRICE_TYP_DN(struct.getList_l_SPCL_PRICE_TYP_DN());
			this.setList_l_SPCL_PRICE_TYP(struct.getList_l_SPCL_PRICE_TYP());
			this.setList_l_DLV_LOC_CD(struct.getList_l_DLV_LOC_CD());
			this.setList_l_DLV_LOC_NAME(struct.getList_l_DLV_LOC_NAME());
			this.setList_l_DEPO_TYP_DN(struct.getList_l_DEPO_TYP_DN());
			this.setList_l_DEPO_TYP(struct.getList_l_DEPO_TYP());
			this.setList_l_CUST_ITEM_NAME(struct.getList_l_CUST_ITEM_NAME());
			this.setList_l_ITEM_NAME(struct.getList_l_ITEM_NAME());
			this.setList_l_ODR_ACPT_DATE(struct.getList_l_ODR_ACPT_DATE());
			this.setList_l_JOB_ODR_CD(struct.getList_l_JOB_ODR_CD());
			this.setList_l_JOB_ODR_QTY(struct.getList_l_JOB_ODR_QTY());
			this.setList_l_JOB_ODR_DLV_DATE(struct.getList_l_JOB_ODR_DLV_DATE());
			this.setList_l_ALC_GRP_CD(struct.getList_l_ALC_GRP_CD());
			this.setList_l_REMARKS(struct.getList_l_REMARKS());
			this.setList_l_CUS_DLV_KEY_CD(struct.getList_l_CUS_DLV_KEY_CD());
			this.setList_l_CUS_DLV_CD(struct.getList_l_CUS_DLV_CD());
			this.setList_d_NEW_CUST_ODR_NO(struct.getList_d_NEW_CUST_ODR_NO());
			this.setList_d_CUST_ODR_NO_CHANGE(struct.getList_d_CUST_ODR_NO_CHANGE());
			this.setList_d_NEW_CUST_CD(struct.getList_d_NEW_CUST_CD());
			this.setList_d_CUST_CD_CHANGE(struct.getList_d_CUST_CD_CHANGE());
			this.setList_d_NEW_CUST_ITEM_CD(struct.getList_d_NEW_CUST_ITEM_CD());
			this.setList_d_CUST_ITEM_CD_CHANGE(struct.getList_d_CUST_ITEM_CD_CHANGE());
			this.setList_d_DLV_LOC_CD_CHANGE(struct.getList_d_DLV_LOC_CD_CHANGE());
			this.setList_d_NEW_ODR_QTY(struct.getList_d_NEW_ODR_QTY());
			this.setList_d_ODR_QTY_CHANGE(struct.getList_d_ODR_QTY_CHANGE());
			this.setList_d_NEW_DESINATED_DLV_DATE(struct.getList_d_NEW_DESINATED_DLV_DATE());
			this.setList_d_DESINATED_DLV_DATE_CHANGE(struct.getList_d_DESINATED_DLV_DATE_CHANGE());
			this.setList_d_NEW_SPCL_PRICE_TYP(struct.getList_d_NEW_SPCL_PRICE_TYP());
			this.setList_d_SPCL_PRICE_TYP_CHANGE(struct.getList_d_SPCL_PRICE_TYP_CHANGE());
			this.setList_d_NEW_ODR_UNIT_PRICE(struct.getList_d_NEW_ODR_UNIT_PRICE());
			this.setList_d_ODR_UNIT_PRICE_CHANGE(struct.getList_d_ODR_UNIT_PRICE_CHANGE());
			this.setList_d_NEW_DLV_LOC_CD(struct.getList_d_NEW_DLV_LOC_CD());
			this.setList_d_NEW_REMARKS(struct.getList_d_NEW_REMARKS());
			this.setList_d_REMARKS_CHANGE(struct.getList_d_REMARKS_CHANGE());
			this.setList_d_NEW_ODR_NO(struct.getList_d_NEW_ODR_NO());
			this.setList_d_ODR_NO_CHANGE(struct.getList_d_ODR_NO_CHANGE());
			this.setList_d_NEW_ODR_TYP(struct.getList_d_NEW_ODR_TYP());
			this.setList_d_ODR_TYP_CHANGE(struct.getList_d_ODR_TYP_CHANGE());
			this.setList_l_STATUS_NAME(struct.getList_l_STATUS_NAME());
			this.setList_l_PROJECT_CD(struct.getList_l_PROJECT_CD());
			this.setList_l_ESTIMATE_NO(struct.getList_l_ESTIMATE_NO());
			this.setList_l_DETAL_NO(struct.getList_l_DETAL_NO());
			this.setList_l_ESTIMATE_TYPE(struct.getList_l_ESTIMATE_TYPE());
			this.setList_l_h_ESTIMATE_TYPE(struct.getList_l_h_ESTIMATE_TYPE());
			this.setList_l_OWN_PERSON_CD(struct.getList_l_OWN_PERSON_CD());
			this.setList_l_OWN_ORG_CD(struct.getList_l_OWN_ORG_CD());
			this.setList_l_ORGN_ODR_NO(struct.getList_l_ORGN_ODR_NO());
			this.setList_l_ADD_ODR_FLG(struct.getList_l_ADD_ODR_FLG());
			this.setList_l_h_ODR_TYP(struct.getList_l_h_ODR_TYP());
			this.setList_l_h_DEPO_TYP(struct.getList_l_h_DEPO_TYP());
			this.setList_h_APPR_POWER_TYP(struct.getList_h_APPR_POWER_TYP());
			this.setList_LOGIN_USER_CD(struct.getList_LOGIN_USER_CD());
			this.setList_h_APPR_ID(struct.getList_h_APPR_ID());
			this.setList_h_SCREEN_URL(struct.getList_h_SCREEN_URL());
			this.setList_h_STATUS(struct.getList_h_STATUS());
			this.setList_h_PROC_TYP(struct.getList_h_PROC_TYP());
			this.setList_l_REQUEST_BY(struct.getList_l_REQUEST_BY());
			this.setList_l_REQUEST_BY_NAME(struct.getList_l_REQUEST_BY_NAME());
			this.setList_l_REQUEST_DATE(struct.getList_l_REQUEST_DATE());
			this.setList_l_APPR_REMARKS(struct.getList_l_APPR_REMARKS());
			this.setList_l_RESERVE_CAUSE(struct.getList_l_RESERVE_CAUSE());
			this.setList_h_MODIFY_COUNT(struct.getList_h_MODIFY_COUNT());
			this.setList_START_DATE(struct.getList_START_DATE());
			this.setList_END_DATE(struct.getList_END_DATE());
			this.setList_CUST_CD(struct.getList_CUST_CD());
			this.setList_FIELD_NAME(struct.getList_FIELD_NAME());
			this.setList_FIELD_VALUE(struct.getList_FIELD_VALUE());
			this.setList_FIELD_FLG(struct.getList_FIELD_FLG());
			this.setList_d_OLD_ODR_NO(struct.getList_d_OLD_ODR_NO());
			this.setList_d_OLD_ODR_TYP(struct.getList_d_OLD_ODR_TYP());
			this.setList_d_OLD_CUST_ODR_NO(struct.getList_d_OLD_CUST_ODR_NO());
			this.setList_d_OLD_CUST_CD(struct.getList_d_OLD_CUST_CD());
			this.setList_d_OLD_CUST_ITEM_CD(struct.getList_d_OLD_CUST_ITEM_CD());
			this.setList_d_OLD_DLV_LOC_CD(struct.getList_d_OLD_DLV_LOC_CD());
			this.setList_d_OLD_ODR_QTY(struct.getList_d_OLD_ODR_QTY());
			this.setList_d_OLD_DESINATED_DLV_DATE(struct.getList_d_OLD_DESINATED_DLV_DATE());
			this.setList_d_OLD_SPCL_PRICE_TYP(struct.getList_d_OLD_SPCL_PRICE_TYP());
			this.setList_d_OLD_ODR_UNIT_PRICE(struct.getList_d_OLD_ODR_UNIT_PRICE());
			this.setList_d_OLD_REMARKS(struct.getList_d_OLD_REMARKS());
			this.setList_h_ODR_NO(struct.getList_h_ODR_NO());
			this.setList_l_COUNT(struct.getList_l_COUNT());
			this.setList_ROW_COUNT(struct.getList_ROW_COUNT());
			this.setList_l_ODR_CMPLT_FLG(struct.getList_l_ODR_CMPLT_FLG());
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

	// �� 3 �ϐ������l�F i_r3_FILTER1


	final static String i_r3_FILTER1 = null;

	// �� 4 �ϐ������l�F i_h_SELECT_TYP


	final static String i_h_SELECT_TYP = null;

	// �� 5 �ϐ������l�F i_h_REQUEST_APPR_SAME


	final static String i_h_REQUEST_APPR_SAME = null;

	// �� 6 �ϐ������l�F i_RESERVE_CAUSE


	final static String i_RESERVE_CAUSE = null;

	// �� 7 �ϐ������l�F i_l_PROC_TYP_VALUE


	final static String i_l_PROC_TYP_VALUE = null;

	// �� 8 �ϐ������l�F i_l_ODR_TYP_DN


	final static String i_l_ODR_TYP_DN = null;

	// �� 9 �ϐ������l�F i_l_ODR_TYP


	final static String i_l_ODR_TYP = null;

	// �� 10 �ϐ������l�F i_l_CUST_ODR_NO


	final static String i_l_CUST_ODR_NO = null;

	// �� 11 �ϐ������l�F i_l_CUST_ITEM_CD


	final static String i_l_CUST_ITEM_CD = null;

	// �� 12 �ϐ������l�F i_l_ITEM_CD


	final static String i_l_ITEM_CD = null;

	// �� 13 �ϐ������l�F i_l_CUST_CD


	final static String i_l_CUST_CD = null;

	// �� 14 �ϐ������l�F i_l_CUST_ANAME


	final static String i_l_CUST_ANAME = null;

	// �� 15 �ϐ������l�F i_l_DESINATED_DLV_DATE


	final static String i_l_DESINATED_DLV_DATE = null;

	// �� 16 �ϐ������l�F i_l_ODR_QTY


	final static String i_l_ODR_QTY = null;

	// �� 17 �ϐ������l�F i_l_UNIT_CD


	final static String i_l_UNIT_CD = null;

	// �� 18 �ϐ������l�F i_l_ODR_UNIT_PRICE


	final static String i_l_ODR_UNIT_PRICE = null;

	// �� 19 �ϐ������l�F i_l_CUR_UNIT


	final static String i_l_CUR_UNIT = null;

	// �� 20 �ϐ������l�F i_l_SPCL_PRICE_TYP_DN


	final static String i_l_SPCL_PRICE_TYP_DN = null;

	// �� 21 �ϐ������l�F i_l_SPCL_PRICE_TYP


	final static String i_l_SPCL_PRICE_TYP = null;

	// �� 22 �ϐ������l�F i_l_DLV_LOC_CD


	final static String i_l_DLV_LOC_CD = null;

	// �� 23 �ϐ������l�F i_l_DLV_LOC_NAME


	final static String i_l_DLV_LOC_NAME = null;

	// �� 24 �ϐ������l�F i_l_DEPO_TYP_DN


	final static String i_l_DEPO_TYP_DN = null;

	// �� 25 �ϐ������l�F i_l_DEPO_TYP


	final static String i_l_DEPO_TYP = null;

	// �� 26 �ϐ������l�F i_l_CUST_ITEM_NAME


	final static String i_l_CUST_ITEM_NAME = null;

	// �� 27 �ϐ������l�F i_l_ITEM_NAME


	final static String i_l_ITEM_NAME = null;

	// �� 28 �ϐ������l�F i_l_ODR_ACPT_DATE


	final static String i_l_ODR_ACPT_DATE = null;

	// �� 29 �ϐ������l�F i_l_JOB_ODR_CD


	final static String i_l_JOB_ODR_CD = null;

	// �� 30 �ϐ������l�F i_l_JOB_ODR_QTY


	final static String i_l_JOB_ODR_QTY = null;

	// �� 31 �ϐ������l�F i_l_JOB_ODR_DLV_DATE


	final static String i_l_JOB_ODR_DLV_DATE = null;

	// �� 32 �ϐ������l�F i_l_ALC_GRP_CD


	final static String i_l_ALC_GRP_CD = null;

	// �� 33 �ϐ������l�F i_l_REMARKS


	final static String i_l_REMARKS = null;

	// �� 34 �ϐ������l�F i_l_CUS_DLV_KEY_CD


	final static String i_l_CUS_DLV_KEY_CD = null;

	// �� 35 �ϐ������l�F i_l_CUS_DLV_CD


	final static String i_l_CUS_DLV_CD = null;

	// �� 36 �ϐ������l�F i_d_NEW_CUST_ODR_NO


	final static String i_d_NEW_CUST_ODR_NO = null;

	// �� 37 �ϐ������l�F i_d_CUST_ODR_NO_CHANGE


	final static String i_d_CUST_ODR_NO_CHANGE = null;

	// �� 38 �ϐ������l�F i_d_NEW_CUST_CD


	final static String i_d_NEW_CUST_CD = null;

	// �� 39 �ϐ������l�F i_d_CUST_CD_CHANGE


	final static String i_d_CUST_CD_CHANGE = null;

	// �� 40 �ϐ������l�F i_d_NEW_CUST_ITEM_CD


	final static String i_d_NEW_CUST_ITEM_CD = null;

	// �� 41 �ϐ������l�F i_d_CUST_ITEM_CD_CHANGE


	final static String i_d_CUST_ITEM_CD_CHANGE = null;

	// �� 42 �ϐ������l�F i_d_DLV_LOC_CD_CHANGE


	final static String i_d_DLV_LOC_CD_CHANGE = null;

	// �� 43 �ϐ������l�F i_d_NEW_ODR_QTY


	final static String i_d_NEW_ODR_QTY = null;

	// �� 44 �ϐ������l�F i_d_ODR_QTY_CHANGE


	final static String i_d_ODR_QTY_CHANGE = null;

	// �� 45 �ϐ������l�F i_d_NEW_DESINATED_DLV_DATE


	final static String i_d_NEW_DESINATED_DLV_DATE = null;

	// �� 46 �ϐ������l�F i_d_DESINATED_DLV_DATE_CHANGE


	final static String i_d_DESINATED_DLV_DATE_CHANGE = null;

	// �� 47 �ϐ������l�F i_d_NEW_SPCL_PRICE_TYP


	final static String i_d_NEW_SPCL_PRICE_TYP = null;

	// �� 48 �ϐ������l�F i_d_SPCL_PRICE_TYP_CHANGE


	final static String i_d_SPCL_PRICE_TYP_CHANGE = null;

	// �� 49 �ϐ������l�F i_d_NEW_ODR_UNIT_PRICE


	final static String i_d_NEW_ODR_UNIT_PRICE = null;

	// �� 50 �ϐ������l�F i_d_ODR_UNIT_PRICE_CHANGE


	final static String i_d_ODR_UNIT_PRICE_CHANGE = null;

	// �� 51 �ϐ������l�F i_d_NEW_DLV_LOC_CD


	final static String i_d_NEW_DLV_LOC_CD = null;

	// �� 52 �ϐ������l�F i_d_NEW_REMARKS


	final static String i_d_NEW_REMARKS = null;

	// �� 53 �ϐ������l�F i_d_REMARKS_CHANGE


	final static String i_d_REMARKS_CHANGE = null;

	// �� 54 �ϐ������l�F i_d_NEW_ODR_NO


	final static String i_d_NEW_ODR_NO = null;

	// �� 55 �ϐ������l�F i_d_ODR_NO_CHANGE


	final static String i_d_ODR_NO_CHANGE = null;

	// �� 56 �ϐ������l�F i_d_NEW_ODR_TYP


	final static String i_d_NEW_ODR_TYP = null;

	// �� 57 �ϐ������l�F i_d_ODR_TYP_CHANGE


	final static String i_d_ODR_TYP_CHANGE = null;

	// �� 58 �ϐ������l�F i_l_STATUS_NAME


	final static String i_l_STATUS_NAME = null;

	// �� 59 �ϐ������l�F i_l_PROJECT_CD


	final static String i_l_PROJECT_CD = null;

	// �� 60 �ϐ������l�F i_l_ESTIMATE_NO


	final static String i_l_ESTIMATE_NO = null;

	// �� 61 �ϐ������l�F i_l_DETAL_NO


	final static String i_l_DETAL_NO = null;

	// �� 62 �ϐ������l�F i_l_ESTIMATE_TYPE


	final static String i_l_ESTIMATE_TYPE = null;

	// �� 63 �ϐ������l�F i_l_h_ESTIMATE_TYPE


	final static String i_l_h_ESTIMATE_TYPE = null;

	// �� 64 �ϐ������l�F i_l_OWN_PERSON_CD


	final static String i_l_OWN_PERSON_CD = null;

	// �� 65 �ϐ������l�F i_l_OWN_ORG_CD


	final static String i_l_OWN_ORG_CD = null;

	// �� 66 �ϐ������l�F i_l_ORGN_ODR_NO


	final static String i_l_ORGN_ODR_NO = null;

	// �� 67 �ϐ������l�F i_l_ADD_ODR_FLG


	final static String i_l_ADD_ODR_FLG = null;

	// �� 68 �ϐ������l�F i_l_h_ODR_TYP


	final static String i_l_h_ODR_TYP = null;

	// �� 69 �ϐ������l�F i_l_h_DEPO_TYP


	final static String i_l_h_DEPO_TYP = null;

	// �� 70 �ϐ������l�F i_h_APPR_POWER_TYP


	final static String i_h_APPR_POWER_TYP = null;

	// �� 71 �ϐ������l�F i_LOGIN_USER_CD


	final static String i_LOGIN_USER_CD = null;

	// �� 72 �ϐ������l�F i_h_APPR_ID


	final static String i_h_APPR_ID = null;

	// �� 73 �ϐ������l�F i_h_SCREEN_URL


	final static String i_h_SCREEN_URL = null;

	// �� 74 �ϐ������l�F i_h_STATUS


	final static String i_h_STATUS = null;

	// �� 75 �ϐ������l�F i_h_PROC_TYP


	final static String i_h_PROC_TYP = null;

	// �� 76 �ϐ������l�F i_l_REQUEST_BY


	final static String i_l_REQUEST_BY = null;

	// �� 77 �ϐ������l�F i_l_REQUEST_BY_NAME


	final static String i_l_REQUEST_BY_NAME = null;

	// �� 78 �ϐ������l�F i_l_REQUEST_DATE


	final static String i_l_REQUEST_DATE = null;

	// �� 79 �ϐ������l�F i_l_APPR_REMARKS


	final static String i_l_APPR_REMARKS = null;

	// �� 80 �ϐ������l�F i_l_RESERVE_CAUSE


	final static String i_l_RESERVE_CAUSE = null;

	// �� 81 �ϐ������l�F i_h_MODIFY_COUNT


	final static String i_h_MODIFY_COUNT = null;

	// �� 82 �ϐ������l�F i_START_DATE


	final static String i_START_DATE = null;

	// �� 83 �ϐ������l�F i_END_DATE


	final static String i_END_DATE = null;

	// �� 84 �ϐ������l�F i_CUST_CD


	final static String i_CUST_CD = null;

	// �� 85 �ϐ������l�F i_FIELD_NAME


	final static String i_FIELD_NAME = null;

	// �� 86 �ϐ������l�F i_FIELD_VALUE


	final static String i_FIELD_VALUE = null;

	// �� 87 �ϐ������l�F i_FIELD_FLG


	final static String i_FIELD_FLG = null;

	// �� 88 �ϐ������l�F i_d_OLD_ODR_NO


	final static String i_d_OLD_ODR_NO = null;

	// �� 89 �ϐ������l�F i_d_OLD_ODR_TYP


	final static String i_d_OLD_ODR_TYP = null;

	// �� 90 �ϐ������l�F i_d_OLD_CUST_ODR_NO


	final static String i_d_OLD_CUST_ODR_NO = null;

	// �� 91 �ϐ������l�F i_d_OLD_CUST_CD


	final static String i_d_OLD_CUST_CD = null;

	// �� 92 �ϐ������l�F i_d_OLD_CUST_ITEM_CD


	final static String i_d_OLD_CUST_ITEM_CD = null;

	// �� 93 �ϐ������l�F i_d_OLD_DLV_LOC_CD


	final static String i_d_OLD_DLV_LOC_CD = null;

	// �� 94 �ϐ������l�F i_d_OLD_ODR_QTY


	final static String i_d_OLD_ODR_QTY = null;

	// �� 95 �ϐ������l�F i_d_OLD_DESINATED_DLV_DATE


	final static String i_d_OLD_DESINATED_DLV_DATE = null;

	// �� 96 �ϐ������l�F i_d_OLD_SPCL_PRICE_TYP


	final static String i_d_OLD_SPCL_PRICE_TYP = null;

	// �� 97 �ϐ������l�F i_d_OLD_ODR_UNIT_PRICE


	final static String i_d_OLD_ODR_UNIT_PRICE = null;

	// �� 98 �ϐ������l�F i_d_OLD_REMARKS


	final static String i_d_OLD_REMARKS = null;

	// �� 99 �ϐ������l�F i_h_ODR_NO


	final static String i_h_ODR_NO = null;

	// �� 100 �ϐ������l�F i_l_COUNT


	final static String i_l_COUNT = null;

	// �� 101 �ϐ������l�F i_ROW_COUNT


	final static String i_ROW_COUNT = null;

	// �� 102 �ϐ������l�F i_l_ODR_CMPLT_FLG


	final static String i_l_ODR_CMPLT_FLG = null;

*/

	//{{user_implement_code
		// TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
		// �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
	// �� 1 �ϐ������l�F i_r1_FILTER1

	final static String i_r1_FILTER1 = null;

	// �� 2 �ϐ������l�F i_r2_FILTER1

	final static String i_r2_FILTER1 = null;

	// �� 3 �ϐ������l�F i_r3_FILTER1

	final static String i_r3_FILTER1 = null;

	// �� 4 �ϐ������l�F i_h_SELECT_TYP

	final static String i_h_SELECT_TYP = null;

	// �� 5 �ϐ������l�F i_h_REQUEST_APPR_SAME

	final static String i_h_REQUEST_APPR_SAME = null;

	// �� 6 �ϐ������l�F i_CUST_CD

	final static String i_CUST_CD = null;

	// �� 7 �ϐ������l�F i_CUST_NAME

	final static String i_CUST_NAME = null;

	// �� 8 �ϐ������l�F i_START_DATE

	final static String i_START_DATE = null;

	// �� 9 �ϐ������l�F i_END_DATE

	final static String i_END_DATE = null;

	// �� 10 �ϐ������l�F i_RESERVE_CAUSE

	final static String i_RESERVE_CAUSE = null;

	// �� 11 �ϐ������l�F i_l_PROC_TYP_VALUE

	final static String i_l_PROC_TYP_VALUE = null;

	// �� 12 �ϐ������l�F i_h_PROC_TYP

	final static String i_h_PROC_TYP = null;

	// �� 13 �ϐ������l�F i_l_REQUEST_BY_NAME

	final static String i_l_REQUEST_BY_NAME = null;

	// �� 14 �ϐ������l�F i_l_REQUEST_DATE

	final static String i_l_REQUEST_DATE = null;

	// �� 15 �ϐ������l�F i_l_APPR_REMARKS

	final static String i_l_APPR_REMARKS = null;

	// �� 16 �ϐ������l�F i_l_RESERVE_CAUSE

	final static String i_l_RESERVE_CAUSE = null;

	// �� 17 �ϐ������l�F i_l_ODR_TYP_DN

	final static String i_l_ODR_TYP_DN = null;

	// �� 18 �ϐ������l�F i_l_ODR_TYP

	final static String i_l_ODR_TYP = null;

	// �� 19 �ϐ������l�F i_l_CUST_ODR_NO

	final static String i_l_CUST_ODR_NO = null;

	// �� 20 �ϐ������l�F i_l_CUST_ITEM_CD

	final static String i_l_CUST_ITEM_CD = null;

	// �� 21 �ϐ������l�F i_l_ITEM_CD

	final static String i_l_ITEM_CD = null;

	// �� 22 �ϐ������l�F i_l_CUST_CD

	final static String i_l_CUST_CD = null;

	// �� 23 �ϐ������l�F i_l_CUST_ANAME

	final static String i_l_CUST_ANAME = null;

	// �� 24 �ϐ������l�F i_l_DESINATED_DLV_DATE

	final static String i_l_DESINATED_DLV_DATE = null;

	// �� 25 �ϐ������l�F i_l_ODR_QTY

	final static String i_l_ODR_QTY = null;

	// �� 26 �ϐ������l�F i_l_UNIT_CD

	final static String i_l_UNIT_CD = null;

	// �� 27 �ϐ������l�F i_l_ODR_UNIT_PRICE

	final static String i_l_ODR_UNIT_PRICE = null;

	// �� 28 �ϐ������l�F i_l_CUR_UNIT

	final static String i_l_CUR_UNIT = null;

	// �� 29 �ϐ������l�F i_l_SPCL_PRICE_TYP_DN

	final static String i_l_SPCL_PRICE_TYP_DN = null;

	// �� 30 �ϐ������l�F i_l_SPCL_PRICE_TYP

	final static String i_l_SPCL_PRICE_TYP = null;

	// �� 31 �ϐ������l�F i_l_DLV_LOC_CD

	final static String i_l_DLV_LOC_CD = null;

	// �� 32 �ϐ������l�F i_l_DLV_LOC_NAME

	final static String i_l_DLV_LOC_NAME = null;

	// �� 33 �ϐ������l�F i_l_DEPO_TYP_DN

	final static String i_l_DEPO_TYP_DN = null;

	// �� 34 �ϐ������l�F i_l_DEPO_TYP

	final static String i_l_DEPO_TYP = null;

	// �� 35 �ϐ������l�F i_l_CUST_ITEM_NAME

	final static String i_l_CUST_ITEM_NAME = null;

	// �� 36 �ϐ������l�F i_l_ITEM_NAME

	final static String i_l_ITEM_NAME = null;

	// �� 37 �ϐ������l�F i_l_ODR_ACPT_DATE

	final static String i_l_ODR_ACPT_DATE = null;

	// �� 38 �ϐ������l�F i_l_JOB_ODR_CD

	final static String i_l_JOB_ODR_CD = null;

	// �� 39 �ϐ������l�F i_l_JOB_ODR_QTY

	final static String i_l_JOB_ODR_QTY = null;

	// �� 40 �ϐ������l�F i_l_JOB_ODR_DLV_DATE

	final static String i_l_JOB_ODR_DLV_DATE = null;

	// �� 41 �ϐ������l�F i_l_ALC_GRP_CD

	final static String i_l_ALC_GRP_CD = null;

	// �� 42 �ϐ������l�F i_l_REMARKS

	final static String i_l_REMARKS = null;

	// �� 43 �ϐ������l�F i_l_CUS_DLV_KEY_CD

	final static String i_l_CUS_DLV_KEY_CD = null;

	// �� 44 �ϐ������l�F i_l_CUS_DLV_CD

	final static String i_l_CUS_DLV_CD = null;

	// �� 45 �ϐ������l�F i_d_OLD_IN_ODR_NO

	final static String i_d_OLD_IN_ODR_NO = null;

	// �� 46 �ϐ������l�F i_d_NEW_IN_ODR_NO

	final static String i_d_NEW_IN_ODR_NO = null;

	// �� 47 �ϐ������l�F i_d_IN_ODR_NO_CHANGE

	final static String i_d_IN_ODR_NO_CHANGE = null;

	// �� 48 �ϐ������l�F i_d_OLD_CUST_ODR_NO

	final static String i_d_OLD_CUST_ODR_NO = null;

	// �� 49 �ϐ������l�F i_d_NEW_CUST_ODR_NO

	final static String i_d_NEW_CUST_ODR_NO = null;

	// �� 50 �ϐ������l�F i_d_CUST_ODR_NO_CHANGE

	final static String i_d_CUST_ODR_NO_CHANGE = null;

	// �� 51 �ϐ������l�F i_d_OLD_CUST_CD

	final static String i_d_OLD_CUST_CD = null;

	// �� 52 �ϐ������l�F i_d_NEW_CUST_CD

	final static String i_d_NEW_CUST_CD = null;

	// �� 53 �ϐ������l�F i_d_CUST_CD_CHANGE

	final static String i_d_CUST_CD_CHANGE = null;

	// �� 54 �ϐ������l�F i_d_OLD_CUST_ITEM_CD

	final static String i_d_OLD_CUST_ITEM_CD = null;

	// �� 55 �ϐ������l�F i_d_NEW_CUST_ITEM_CD

	final static String i_d_NEW_CUST_ITEM_CD = null;

	// �� 56 �ϐ������l�F i_d_CUST_ITEM_CD_CHANGE

	final static String i_d_CUST_ITEM_CD_CHANGE = null;

	// �� 57 �ϐ������l�F i_d_DLV_LOC_CD

	final static String i_d_DLV_LOC_CD = null;

	// �� 58 �ϐ������l�F i_d_DLV_LOC_CD_CHANGE

	final static String i_d_DLV_LOC_CD_CHANGE = null;

	// �� 59 �ϐ������l�F i_d_OLD_ODR_QTY

	final static String i_d_OLD_ODR_QTY = null;

	// �� 60 �ϐ������l�F i_d_NEW_ODR_QTY

	final static String i_d_NEW_ODR_QTY = null;

	// �� 61 �ϐ������l�F i_d_ODR_QTY_CHANGE

	final static String i_d_ODR_QTY_CHANGE = null;

	// �� 62 �ϐ������l�F i_d_OLD_DESINATED_DLV_DATE

	final static String i_d_OLD_DESINATED_DLV_DATE = null;

	// �� 63 �ϐ������l�F i_d_NEW_DESINATED_DLV_DATE

	final static String i_d_NEW_DESINATED_DLV_DATE = null;

	// �� 64 �ϐ������l�F i_d_DESINATED_DLV_DATE_CHANGE

	final static String i_d_DESINATED_DLV_DATE_CHANGE = null;

	// �� 65 �ϐ������l�F i_d_OLD_SPCL_PRICE_TYP

	final static String i_d_OLD_SPCL_PRICE_TYP = null;

	// �� 66 �ϐ������l�F i_d_NEW_SPCL_PRICE_TYP

	final static String i_d_NEW_SPCL_PRICE_TYP = null;

	// �� 67 �ϐ������l�F i_d_SPCL_PRICE_TYP_CHANGE

	final static String i_d_SPCL_PRICE_TYP_CHANGE = null;

	// �� 68 �ϐ������l�F i_d_OLD_ODR_UNIT_PRICE

	final static String i_d_OLD_ODR_UNIT_PRICE = null;

	// �� 69 �ϐ������l�F i_d_NEW_ODR_UNIT_PRICE

	final static String i_d_NEW_ODR_UNIT_PRICE = null;

	// �� 70 �ϐ������l�F i_d_ODR_UNIT_PRICE_CHANGE

	final static String i_d_ODR_UNIT_PRICE_CHANGE = null;

	// �� 71 �ϐ������l�F i_d_OLD_DLV_LOC_CD

	final static String i_d_OLD_DLV_LOC_CD = null;

	// �� 72 �ϐ������l�F i_d_NEW_DLV_LOC_CD

	final static String i_d_NEW_DLV_LOC_CD = null;

	// �� 73 �ϐ������l�F i_d_OLD_REMARKS

	final static String i_d_OLD_REMARKS = null;

	// �� 74 �ϐ������l�F i_d_NEW_REMARKS

	final static String i_d_NEW_REMARKS = null;

	// �� 75 �ϐ������l�F i_d_REMARKS_CHANGE

	final static String i_d_REMARKS_CHANGE = null;

	// �� 76 �ϐ������l�F i_h_APPR_POWER_TYP

	final static String i_h_APPR_POWER_TYP = null;

	// �� 77 �ϐ������l�F i_USER_CD

	final static String i_USER_CD = null;


	/**
	 * ������
	 *
	 */
	public void initialize()
	{

		clear();

		m_r1_FILTER1 = i_r1_FILTER1;
		m_r2_FILTER1 = i_r2_FILTER1;
		m_r3_FILTER1 = i_r3_FILTER1;
		m_h_SELECT_TYP = i_h_SELECT_TYP;
		m_h_REQUEST_APPR_SAME = i_h_REQUEST_APPR_SAME;
		m_CUST_CD = i_CUST_CD;
		m_START_DATE = i_START_DATE;
		m_END_DATE = i_END_DATE;
		m_RESERVE_CAUSE = i_RESERVE_CAUSE;
		m_l_PROC_TYP_VALUE = i_l_PROC_TYP_VALUE;
		m_h_PROC_TYP = i_h_PROC_TYP;
		m_l_REQUEST_BY_NAME = i_l_REQUEST_BY_NAME;
		m_l_REQUEST_DATE = i_l_REQUEST_DATE;
		m_l_APPR_REMARKS = i_l_APPR_REMARKS;
		m_l_RESERVE_CAUSE = i_l_RESERVE_CAUSE;
		m_l_ODR_TYP_DN = i_l_ODR_TYP_DN;
		m_l_ODR_TYP = i_l_ODR_TYP;
		m_l_CUST_ODR_NO = i_l_CUST_ODR_NO;
		m_l_CUST_ITEM_CD = i_l_CUST_ITEM_CD;
		m_l_ITEM_CD = i_l_ITEM_CD;
		m_l_CUST_CD = i_l_CUST_CD;
		m_l_CUST_ANAME = i_l_CUST_ANAME;
		m_l_DESINATED_DLV_DATE = i_l_DESINATED_DLV_DATE;
		m_l_ODR_QTY = i_l_ODR_QTY;
		m_l_UNIT_CD = i_l_UNIT_CD;
		m_l_ODR_UNIT_PRICE = i_l_ODR_UNIT_PRICE;
		m_l_CUR_UNIT = i_l_CUR_UNIT;
		m_l_SPCL_PRICE_TYP_DN = i_l_SPCL_PRICE_TYP_DN;
		m_l_SPCL_PRICE_TYP = i_l_SPCL_PRICE_TYP;
		m_l_DLV_LOC_CD = i_l_DLV_LOC_CD;
		m_l_DLV_LOC_NAME = i_l_DLV_LOC_NAME;
		m_l_DEPO_TYP_DN = i_l_DEPO_TYP_DN;
		m_l_DEPO_TYP = i_l_DEPO_TYP;
		m_l_CUST_ITEM_NAME = i_l_CUST_ITEM_NAME;
		m_l_ITEM_NAME = i_l_ITEM_NAME;
		m_l_ODR_ACPT_DATE = i_l_ODR_ACPT_DATE;
		m_l_JOB_ODR_CD = i_l_JOB_ODR_CD;
		m_l_JOB_ODR_QTY = i_l_JOB_ODR_QTY;
		m_l_JOB_ODR_DLV_DATE = i_l_JOB_ODR_DLV_DATE;
		m_l_ALC_GRP_CD = i_l_ALC_GRP_CD;
		m_l_REMARKS = i_l_REMARKS;
		m_l_CUS_DLV_KEY_CD = i_l_CUS_DLV_KEY_CD;
		m_l_CUS_DLV_CD = i_l_CUS_DLV_CD;
		m_d_OLD_CUST_ODR_NO = i_d_OLD_CUST_ODR_NO;
		m_d_NEW_CUST_ODR_NO = i_d_NEW_CUST_ODR_NO;
		m_d_CUST_ODR_NO_CHANGE = i_d_CUST_ODR_NO_CHANGE;
		m_d_OLD_CUST_CD = i_d_OLD_CUST_CD;
		m_d_NEW_CUST_CD = i_d_NEW_CUST_CD;
		m_d_CUST_CD_CHANGE = i_d_CUST_CD_CHANGE;
		m_d_OLD_CUST_ITEM_CD = i_d_OLD_CUST_ITEM_CD;
		m_d_NEW_CUST_ITEM_CD = i_d_NEW_CUST_ITEM_CD;
		m_d_CUST_ITEM_CD_CHANGE = i_d_CUST_ITEM_CD_CHANGE;
		m_d_DLV_LOC_CD_CHANGE = i_d_DLV_LOC_CD_CHANGE;
		m_d_OLD_ODR_QTY = i_d_OLD_ODR_QTY;
		m_d_NEW_ODR_QTY = i_d_NEW_ODR_QTY;
		m_d_ODR_QTY_CHANGE = i_d_ODR_QTY_CHANGE;
		m_d_OLD_DESINATED_DLV_DATE = i_d_OLD_DESINATED_DLV_DATE;
		m_d_NEW_DESINATED_DLV_DATE = i_d_NEW_DESINATED_DLV_DATE;
		m_d_DESINATED_DLV_DATE_CHANGE = i_d_DESINATED_DLV_DATE_CHANGE;
		m_d_OLD_SPCL_PRICE_TYP = i_d_OLD_SPCL_PRICE_TYP;
		m_d_NEW_SPCL_PRICE_TYP = i_d_NEW_SPCL_PRICE_TYP;
		m_d_SPCL_PRICE_TYP_CHANGE = i_d_SPCL_PRICE_TYP_CHANGE;
		m_d_OLD_ODR_UNIT_PRICE = i_d_OLD_ODR_UNIT_PRICE;
		m_d_NEW_ODR_UNIT_PRICE = i_d_NEW_ODR_UNIT_PRICE;
		m_d_ODR_UNIT_PRICE_CHANGE = i_d_ODR_UNIT_PRICE_CHANGE;
		m_d_OLD_DLV_LOC_CD = i_d_OLD_DLV_LOC_CD;
		m_d_NEW_DLV_LOC_CD = i_d_NEW_DLV_LOC_CD;
		m_d_OLD_REMARKS = i_d_OLD_REMARKS;
		m_d_NEW_REMARKS = i_d_NEW_REMARKS;
		m_d_REMARKS_CHANGE = i_d_REMARKS_CHANGE;
		m_h_APPR_POWER_TYP = i_h_APPR_POWER_TYP;
	}
		// TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
