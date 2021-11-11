/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0080/src/com/nec/jp/orteus/metamorBase/AC0080/AC0080010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0080;

import com.nec.jp.orteus.xaf.wa.*;

import com.nec.jp.orteus.util.logging.*;

import java.lang.Number.*;
import java.lang.Float;
import java.util.*;
import java.sql.*;
import java.io.*;

//{{user_implement_code_import
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AC0080010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_w_DATE_FROM */
	public String m_w_DATE_FROM = null;
	/** �� 2 �ϐ��F m_w_DATE_TO */
	public String m_w_DATE_TO = null;
	/** �� 3 �ϐ��F m_w_OD_TYP */
	public String m_w_OD_TYP = null;
	/** �� 4 �ϐ��F m_w_OD_TYP_name */
	public String m_w_OD_TYP_name = null;
	/** �� 5 �ϐ��F m_w_OD_TYP_val */
	public String m_w_OD_TYP_val = null;
	/** �� 6 �ϐ��F m_OD_TYP */
	public String m_OD_TYP = null;
	/** �� 7 �ϐ��F m_OUTSIDE_TYP */
	public String m_OUTSIDE_TYP = null;
	/** �� 8 �ϐ��F m_h_DEMAND_FLG */
	public String m_h_DEMAND_FLG = null;
	/** �� 9 �ϐ��F m_ODR_DM_QTY */
	public String m_ODR_DM_QTY = null;
	/** �� 10 �ϐ��F m_h_ODR_DMD_TYP */
	public String m_h_ODR_DMD_TYP = null;
	/** �� 11 �ϐ��F m_w_STS_TYP */
	public String m_w_STS_TYP = null;
	/** �� 12 �ϐ��F m_c_UN_CONNECT_DEMAND */
	public String m_c_UN_CONNECT_DEMAND = null;
	/** �� 13 �ϐ��F m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** �� 14 �ϐ��F m_w_TIME_FROM */
	public String m_w_TIME_FROM = null;
	/** �� 15 �ϐ��F m_w_TIME_TO */
	public String m_w_TIME_TO = null;
	/** �� 16 �ϐ��F m_s_MIN_CAL_DATE */
	public String m_s_MIN_CAL_DATE = null;
	/** �� 17 �ϐ��F m_s_MAX_CAL_DATE */
	public String m_s_MAX_CAL_DATE = null;
	/** �� 18 �ϐ��F m_s_PLANT_CD */
	public String m_s_PLANT_CD = null;
	/** �� 19 �ϐ��F m_s_OD_TYP */
	public String m_s_OD_TYP = null;
	/** �� 20 �ϐ��F m_OD_TYP_name */
	public String m_OD_TYP_name = null;
	/** �� 21 �ϐ��F m_OD_TYP_val */
	public String m_OD_TYP_val = null;
	/** �� 22 �ϐ��F m_s_OUTSIDE_TYP */
	public String m_s_OUTSIDE_TYP = null;
	/** �� 23 �ϐ��F m_OUTSIDE_TYP_name */
	public String m_OUTSIDE_TYP_name = null;
	/** �� 24 �ϐ��F m_OUTSIDE_TYP_val */
	public String m_OUTSIDE_TYP_val = null;
	/** �� 25 �ϐ��F m_s_BUSINESS_DATE */
	public String m_s_BUSINESS_DATE = null;
	/** �� 26 �ϐ��F m_s_UN_CONNECT_DEMAND */
	public String m_s_UN_CONNECT_DEMAND = null;
	/** �� 27 �ϐ��F m_s_ODR_DMD_TYP1 */
	public String m_s_ODR_DMD_TYP1 = null;
	/** �� 28 �ϐ��F m_s_ODR_DMD_TYP2 */
	public String m_s_ODR_DMD_TYP2 = null;
	/** �� 29 �ϐ��F m_w_ODR_STS_TYP */
	public String m_w_ODR_STS_TYP = null;
	/** �� 30 �ϐ��F m_w_DM_STS_TYP */
	public String m_w_DM_STS_TYP = null;
	/** �� 31 �ϐ��F m_ODR_STS_TYP_name */
	public String m_ODR_STS_TYP_name = null;
	/** �� 32 �ϐ��F m_ODR_STS_TYP_val */
	public String m_ODR_STS_TYP_val = null;
	/** �� 33 �ϐ��F m_DM_STS_TYP_name */
	public String m_DM_STS_TYP_name = null;
	/** �� 34 �ϐ��F m_DM_STS_TYP_val */
	public String m_DM_STS_TYP_val = null;
	/** �� 35 �ϐ��F m_h_OD_NO */
	public String m_h_OD_NO = null;
	/** �� 36 �ϐ��F m_h_PARENT_OD_NO */
	public String m_h_PARENT_OD_NO = null;
	/** �� 37 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 38 �ϐ��F m_PRD_DUE_DATE */
	public String m_PRD_DUE_DATE = null;
	/** �� 39 �ϐ��F m_ODR_QTY */
	public String m_ODR_QTY = null;
	/** �� 40 �ϐ��F m_DM_QTY */
	public String m_DM_QTY = null;
	/** �� 41 �ϐ��F m_EXTERNAL_PLAN_CD */
	public String m_EXTERNAL_PLAN_CD = null;
	/** �� 42 �ϐ��F m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** �� 43 �ϐ��F m_EX_MODIFY_COUNT */
	public String m_EX_MODIFY_COUNT = null;
	/** �� 44 �ϐ��F m_OD_MODIFY_COUNT */
	public String m_OD_MODIFY_COUNT = null;
	/** �� 45 �ϐ��F m_w_ITEM_CD */
	public String m_w_ITEM_CD = null;
	/** �� 46 �ϐ��F m_w_PLANT_CD */
	public String m_w_PLANT_CD = null;
	/** �� 47 �ϐ��F m_w_DATE_FROM_ALL */
	public String m_w_DATE_FROM_ALL = null;
	/** �� 48 �ϐ��F m_w_DATE_TO_ALL */
	public String m_w_DATE_TO_ALL = null;
	/** �� 49 �ϐ��F m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** �� 50 �ϐ��F m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** �� 51 �ϐ��F m_TIME_CTRL */
	public String m_TIME_CTRL = null;
	/** �� 52 �ϐ��F m_l_COUNT */
	public String m_l_COUNT = null;
	/** �� 53 �ϐ��F m_ROW_COUNT */
	public String m_ROW_COUNT = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_w_DATE_FROM */
	public List l_w_DATE_FROM = null;

	/** �� 2 List�ϐ��F l_w_DATE_TO */
	public List l_w_DATE_TO = null;

	/** �� 3 List�ϐ��F l_w_OD_TYP */
	public List l_w_OD_TYP = null;

	/** �� 4 List�ϐ��F l_w_OD_TYP_name */
	public List l_w_OD_TYP_name = null;

	/** �� 5 List�ϐ��F l_w_OD_TYP_val */
	public List l_w_OD_TYP_val = null;

	/** �� 6 List�ϐ��F l_OD_TYP */
	public List l_OD_TYP = null;

	/** �� 7 List�ϐ��F l_OUTSIDE_TYP */
	public List l_OUTSIDE_TYP = null;

	/** �� 8 List�ϐ��F l_h_DEMAND_FLG */
	public List l_h_DEMAND_FLG = null;

	/** �� 9 List�ϐ��F l_ODR_DM_QTY */
	public List l_ODR_DM_QTY = null;

	/** �� 10 List�ϐ��F l_h_ODR_DMD_TYP */
	public List l_h_ODR_DMD_TYP = null;

	/** �� 11 List�ϐ��F l_w_STS_TYP */
	public List l_w_STS_TYP = null;

	/** �� 12 List�ϐ��F l_c_UN_CONNECT_DEMAND */
	public List l_c_UN_CONNECT_DEMAND = null;

	/** �� 13 List�ϐ��F l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** �� 14 List�ϐ��F l_w_TIME_FROM */
	public List l_w_TIME_FROM = null;

	/** �� 15 List�ϐ��F l_w_TIME_TO */
	public List l_w_TIME_TO = null;

	/** �� 16 List�ϐ��F l_s_MIN_CAL_DATE */
	public List l_s_MIN_CAL_DATE = null;

	/** �� 17 List�ϐ��F l_s_MAX_CAL_DATE */
	public List l_s_MAX_CAL_DATE = null;

	/** �� 18 List�ϐ��F l_s_PLANT_CD */
	public List l_s_PLANT_CD = null;

	/** �� 19 List�ϐ��F l_s_OD_TYP */
	public List l_s_OD_TYP = null;

	/** �� 20 List�ϐ��F l_OD_TYP_name */
	public List l_OD_TYP_name = null;

	/** �� 21 List�ϐ��F l_OD_TYP_val */
	public List l_OD_TYP_val = null;

	/** �� 22 List�ϐ��F l_s_OUTSIDE_TYP */
	public List l_s_OUTSIDE_TYP = null;

	/** �� 23 List�ϐ��F l_OUTSIDE_TYP_name */
	public List l_OUTSIDE_TYP_name = null;

	/** �� 24 List�ϐ��F l_OUTSIDE_TYP_val */
	public List l_OUTSIDE_TYP_val = null;

	/** �� 25 List�ϐ��F l_s_BUSINESS_DATE */
	public List l_s_BUSINESS_DATE = null;

	/** �� 26 List�ϐ��F l_s_UN_CONNECT_DEMAND */
	public List l_s_UN_CONNECT_DEMAND = null;

	/** �� 27 List�ϐ��F l_s_ODR_DMD_TYP1 */
	public List l_s_ODR_DMD_TYP1 = null;

	/** �� 28 List�ϐ��F l_s_ODR_DMD_TYP2 */
	public List l_s_ODR_DMD_TYP2 = null;

	/** �� 29 List�ϐ��F l_w_ODR_STS_TYP */
	public List l_w_ODR_STS_TYP = null;

	/** �� 30 List�ϐ��F l_w_DM_STS_TYP */
	public List l_w_DM_STS_TYP = null;

	/** �� 31 List�ϐ��F l_ODR_STS_TYP_name */
	public List l_ODR_STS_TYP_name = null;

	/** �� 32 List�ϐ��F l_ODR_STS_TYP_val */
	public List l_ODR_STS_TYP_val = null;

	/** �� 33 List�ϐ��F l_DM_STS_TYP_name */
	public List l_DM_STS_TYP_name = null;

	/** �� 34 List�ϐ��F l_DM_STS_TYP_val */
	public List l_DM_STS_TYP_val = null;

	/** �� 35 List�ϐ��F l_h_OD_NO */
	public List l_h_OD_NO = null;

	/** �� 36 List�ϐ��F l_h_PARENT_OD_NO */
	public List l_h_PARENT_OD_NO = null;

	/** �� 37 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 38 List�ϐ��F l_PRD_DUE_DATE */
	public List l_PRD_DUE_DATE = null;

	/** �� 39 List�ϐ��F l_ODR_QTY */
	public List l_ODR_QTY = null;

	/** �� 40 List�ϐ��F l_DM_QTY */
	public List l_DM_QTY = null;

	/** �� 41 List�ϐ��F l_EXTERNAL_PLAN_CD */
	public List l_EXTERNAL_PLAN_CD = null;

	/** �� 42 List�ϐ��F l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** �� 43 List�ϐ��F l_EX_MODIFY_COUNT */
	public List l_EX_MODIFY_COUNT = null;

	/** �� 44 List�ϐ��F l_OD_MODIFY_COUNT */
	public List l_OD_MODIFY_COUNT = null;

	/** �� 45 List�ϐ��F l_w_ITEM_CD */
	public List l_w_ITEM_CD = null;

	/** �� 46 List�ϐ��F l_w_PLANT_CD */
	public List l_w_PLANT_CD = null;

	/** �� 47 List�ϐ��F l_w_DATE_FROM_ALL */
	public List l_w_DATE_FROM_ALL = null;

	/** �� 48 List�ϐ��F l_w_DATE_TO_ALL */
	public List l_w_DATE_TO_ALL = null;

	/** �� 49 List�ϐ��F l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** �� 50 List�ϐ��F l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** �� 51 List�ϐ��F l_TIME_CTRL */
	public List l_TIME_CTRL = null;

	/** �� 52 List�ϐ��F l_l_COUNT */
	public List l_l_COUNT = null;

	/** �� 53 List�ϐ��F l_ROW_COUNT */
	public List l_ROW_COUNT = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getw_DATE_FROM() { return m_w_DATE_FROM; }
	public String getw_DATE_TO() { return m_w_DATE_TO; }
	public String getw_OD_TYP() { return m_w_OD_TYP; }
	public String getw_OD_TYP_name() { return m_w_OD_TYP_name; }
	public String getw_OD_TYP_val() { return m_w_OD_TYP_val; }
	public String getOD_TYP() { return m_OD_TYP; }
	public String getOUTSIDE_TYP() { return m_OUTSIDE_TYP; }
	public String geth_DEMAND_FLG() { return m_h_DEMAND_FLG; }
	public String getODR_DM_QTY() { return m_ODR_DM_QTY; }
	public String geth_ODR_DMD_TYP() { return m_h_ODR_DMD_TYP; }
	public String getw_STS_TYP() { return m_w_STS_TYP; }
	public String getc_UN_CONNECT_DEMAND() { return m_c_UN_CONNECT_DEMAND; }
	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getw_TIME_FROM() { return m_w_TIME_FROM; }
	public String getw_TIME_TO() { return m_w_TIME_TO; }
	public String gets_MIN_CAL_DATE() { return m_s_MIN_CAL_DATE; }
	public String gets_MAX_CAL_DATE() { return m_s_MAX_CAL_DATE; }
	public String gets_PLANT_CD() { return m_s_PLANT_CD; }
	public String gets_OD_TYP() { return m_s_OD_TYP; }
	public String getOD_TYP_name() { return m_OD_TYP_name; }
	public String getOD_TYP_val() { return m_OD_TYP_val; }
	public String gets_OUTSIDE_TYP() { return m_s_OUTSIDE_TYP; }
	public String getOUTSIDE_TYP_name() { return m_OUTSIDE_TYP_name; }
	public String getOUTSIDE_TYP_val() { return m_OUTSIDE_TYP_val; }
	public String gets_BUSINESS_DATE() { return m_s_BUSINESS_DATE; }
	public String gets_UN_CONNECT_DEMAND() { return m_s_UN_CONNECT_DEMAND; }
	public String gets_ODR_DMD_TYP1() { return m_s_ODR_DMD_TYP1; }
	public String gets_ODR_DMD_TYP2() { return m_s_ODR_DMD_TYP2; }
	public String getw_ODR_STS_TYP() { return m_w_ODR_STS_TYP; }
	public String getw_DM_STS_TYP() { return m_w_DM_STS_TYP; }
	public String getODR_STS_TYP_name() { return m_ODR_STS_TYP_name; }
	public String getODR_STS_TYP_val() { return m_ODR_STS_TYP_val; }
	public String getDM_STS_TYP_name() { return m_DM_STS_TYP_name; }
	public String getDM_STS_TYP_val() { return m_DM_STS_TYP_val; }
	public String geth_OD_NO() { return m_h_OD_NO; }
	public String geth_PARENT_OD_NO() { return m_h_PARENT_OD_NO; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getPRD_DUE_DATE() { return m_PRD_DUE_DATE; }
	public String getODR_QTY() { return m_ODR_QTY; }
	public String getDM_QTY() { return m_DM_QTY; }
	public String getEXTERNAL_PLAN_CD() { return m_EXTERNAL_PLAN_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getEX_MODIFY_COUNT() { return m_EX_MODIFY_COUNT; }
	public String getOD_MODIFY_COUNT() { return m_OD_MODIFY_COUNT; }
	public String getw_ITEM_CD() { return m_w_ITEM_CD; }
	public String getw_PLANT_CD() { return m_w_PLANT_CD; }
	public String getw_DATE_FROM_ALL() { return m_w_DATE_FROM_ALL; }
	public String getw_DATE_TO_ALL() { return m_w_DATE_TO_ALL; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getTIME_CTRL() { return m_TIME_CTRL; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }

	public List getList_w_DATE_FROM() { return l_w_DATE_FROM; }
	public List getList_w_DATE_TO() { return l_w_DATE_TO; }
	public List getList_w_OD_TYP() { return l_w_OD_TYP; }
	public List getList_w_OD_TYP_name() { return l_w_OD_TYP_name; }
	public List getList_w_OD_TYP_val() { return l_w_OD_TYP_val; }
	public List getList_OD_TYP() { return l_OD_TYP; }
	public List getList_OUTSIDE_TYP() { return l_OUTSIDE_TYP; }
	public List getList_h_DEMAND_FLG() { return l_h_DEMAND_FLG; }
	public List getList_ODR_DM_QTY() { return l_ODR_DM_QTY; }
	public List getList_h_ODR_DMD_TYP() { return l_h_ODR_DMD_TYP; }
	public List getList_w_STS_TYP() { return l_w_STS_TYP; }
	public List getList_c_UN_CONNECT_DEMAND() { return l_c_UN_CONNECT_DEMAND; }
	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_w_TIME_FROM() { return l_w_TIME_FROM; }
	public List getList_w_TIME_TO() { return l_w_TIME_TO; }
	public List getList_s_MIN_CAL_DATE() { return l_s_MIN_CAL_DATE; }
	public List getList_s_MAX_CAL_DATE() { return l_s_MAX_CAL_DATE; }
	public List getList_s_PLANT_CD() { return l_s_PLANT_CD; }
	public List getList_s_OD_TYP() { return l_s_OD_TYP; }
	public List getList_OD_TYP_name() { return l_OD_TYP_name; }
	public List getList_OD_TYP_val() { return l_OD_TYP_val; }
	public List getList_s_OUTSIDE_TYP() { return l_s_OUTSIDE_TYP; }
	public List getList_OUTSIDE_TYP_name() { return l_OUTSIDE_TYP_name; }
	public List getList_OUTSIDE_TYP_val() { return l_OUTSIDE_TYP_val; }
	public List getList_s_BUSINESS_DATE() { return l_s_BUSINESS_DATE; }
	public List getList_s_UN_CONNECT_DEMAND() { return l_s_UN_CONNECT_DEMAND; }
	public List getList_s_ODR_DMD_TYP1() { return l_s_ODR_DMD_TYP1; }
	public List getList_s_ODR_DMD_TYP2() { return l_s_ODR_DMD_TYP2; }
	public List getList_w_ODR_STS_TYP() { return l_w_ODR_STS_TYP; }
	public List getList_w_DM_STS_TYP() { return l_w_DM_STS_TYP; }
	public List getList_ODR_STS_TYP_name() { return l_ODR_STS_TYP_name; }
	public List getList_ODR_STS_TYP_val() { return l_ODR_STS_TYP_val; }
	public List getList_DM_STS_TYP_name() { return l_DM_STS_TYP_name; }
	public List getList_DM_STS_TYP_val() { return l_DM_STS_TYP_val; }
	public List getList_h_OD_NO() { return l_h_OD_NO; }
	public List getList_h_PARENT_OD_NO() { return l_h_PARENT_OD_NO; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_PRD_DUE_DATE() { return l_PRD_DUE_DATE; }
	public List getList_ODR_QTY() { return l_ODR_QTY; }
	public List getList_DM_QTY() { return l_DM_QTY; }
	public List getList_EXTERNAL_PLAN_CD() { return l_EXTERNAL_PLAN_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_EX_MODIFY_COUNT() { return l_EX_MODIFY_COUNT; }
	public List getList_OD_MODIFY_COUNT() { return l_OD_MODIFY_COUNT; }
	public List getList_w_ITEM_CD() { return l_w_ITEM_CD; }
	public List getList_w_PLANT_CD() { return l_w_PLANT_CD; }
	public List getList_w_DATE_FROM_ALL() { return l_w_DATE_FROM_ALL; }
	public List getList_w_DATE_TO_ALL() { return l_w_DATE_TO_ALL; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_TIME_CTRL() { return l_TIME_CTRL; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }

	public void setw_DATE_FROM(String val) { m_w_DATE_FROM = val; }
	public void setw_DATE_TO(String val) { m_w_DATE_TO = val; }
	public void setw_OD_TYP(String val) { m_w_OD_TYP = val; }
	public void setw_OD_TYP_name(String val) { m_w_OD_TYP_name = val; }
	public void setw_OD_TYP_val(String val) { m_w_OD_TYP_val = val; }
	public void setOD_TYP(String val) { m_OD_TYP = val; }
	public void setOUTSIDE_TYP(String val) { m_OUTSIDE_TYP = val; }
	public void seth_DEMAND_FLG(String val) { m_h_DEMAND_FLG = val; }
	public void setODR_DM_QTY(String val) { m_ODR_DM_QTY = val; }
	public void seth_ODR_DMD_TYP(String val) { m_h_ODR_DMD_TYP = val; }
	public void setw_STS_TYP(String val) { m_w_STS_TYP = val; }
	public void setc_UN_CONNECT_DEMAND(String val) { m_c_UN_CONNECT_DEMAND = val; }
	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setw_TIME_FROM(String val) { m_w_TIME_FROM = val; }
	public void setw_TIME_TO(String val) { m_w_TIME_TO = val; }
	public void sets_MIN_CAL_DATE(String val) { m_s_MIN_CAL_DATE = val; }
	public void sets_MAX_CAL_DATE(String val) { m_s_MAX_CAL_DATE = val; }
	public void sets_PLANT_CD(String val) { m_s_PLANT_CD = val; }
	public void sets_OD_TYP(String val) { m_s_OD_TYP = val; }
	public void setOD_TYP_name(String val) { m_OD_TYP_name = val; }
	public void setOD_TYP_val(String val) { m_OD_TYP_val = val; }
	public void sets_OUTSIDE_TYP(String val) { m_s_OUTSIDE_TYP = val; }
	public void setOUTSIDE_TYP_name(String val) { m_OUTSIDE_TYP_name = val; }
	public void setOUTSIDE_TYP_val(String val) { m_OUTSIDE_TYP_val = val; }
	public void sets_BUSINESS_DATE(String val) { m_s_BUSINESS_DATE = val; }
	public void sets_UN_CONNECT_DEMAND(String val) { m_s_UN_CONNECT_DEMAND = val; }
	public void sets_ODR_DMD_TYP1(String val) { m_s_ODR_DMD_TYP1 = val; }
	public void sets_ODR_DMD_TYP2(String val) { m_s_ODR_DMD_TYP2 = val; }
	public void setw_ODR_STS_TYP(String val) { m_w_ODR_STS_TYP = val; }
	public void setw_DM_STS_TYP(String val) { m_w_DM_STS_TYP = val; }
	public void setODR_STS_TYP_name(String val) { m_ODR_STS_TYP_name = val; }
	public void setODR_STS_TYP_val(String val) { m_ODR_STS_TYP_val = val; }
	public void setDM_STS_TYP_name(String val) { m_DM_STS_TYP_name = val; }
	public void setDM_STS_TYP_val(String val) { m_DM_STS_TYP_val = val; }
	public void seth_OD_NO(String val) { m_h_OD_NO = val; }
	public void seth_PARENT_OD_NO(String val) { m_h_PARENT_OD_NO = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setPRD_DUE_DATE(String val) { m_PRD_DUE_DATE = val; }
	public void setODR_QTY(String val) { m_ODR_QTY = val; }
	public void setDM_QTY(String val) { m_DM_QTY = val; }
	public void setEXTERNAL_PLAN_CD(String val) { m_EXTERNAL_PLAN_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setEX_MODIFY_COUNT(String val) { m_EX_MODIFY_COUNT = val; }
	public void setOD_MODIFY_COUNT(String val) { m_OD_MODIFY_COUNT = val; }
	public void setw_ITEM_CD(String val) { m_w_ITEM_CD = val; }
	public void setw_PLANT_CD(String val) { m_w_PLANT_CD = val; }
	public void setw_DATE_FROM_ALL(String val) { m_w_DATE_FROM_ALL = val; }
	public void setw_DATE_TO_ALL(String val) { m_w_DATE_TO_ALL = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setTIME_CTRL(String val) { m_TIME_CTRL = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }


	public void setList_w_DATE_FROM(List list) { l_w_DATE_FROM = list; }
	public void setList_w_DATE_TO(List list) { l_w_DATE_TO = list; }
	public void setList_w_OD_TYP(List list) { l_w_OD_TYP = list; }
	public void setList_w_OD_TYP_name(List list) { l_w_OD_TYP_name = list; }
	public void setList_w_OD_TYP_val(List list) { l_w_OD_TYP_val = list; }
	public void setList_OD_TYP(List list) { l_OD_TYP = list; }
	public void setList_OUTSIDE_TYP(List list) { l_OUTSIDE_TYP = list; }
	public void setList_h_DEMAND_FLG(List list) { l_h_DEMAND_FLG = list; }
	public void setList_ODR_DM_QTY(List list) { l_ODR_DM_QTY = list; }
	public void setList_h_ODR_DMD_TYP(List list) { l_h_ODR_DMD_TYP = list; }
	public void setList_w_STS_TYP(List list) { l_w_STS_TYP = list; }
	public void setList_c_UN_CONNECT_DEMAND(List list) { l_c_UN_CONNECT_DEMAND = list; }
	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_w_TIME_FROM(List list) { l_w_TIME_FROM = list; }
	public void setList_w_TIME_TO(List list) { l_w_TIME_TO = list; }
	public void setList_s_MIN_CAL_DATE(List list) { l_s_MIN_CAL_DATE = list; }
	public void setList_s_MAX_CAL_DATE(List list) { l_s_MAX_CAL_DATE = list; }
	public void setList_s_PLANT_CD(List list) { l_s_PLANT_CD = list; }
	public void setList_s_OD_TYP(List list) { l_s_OD_TYP = list; }
	public void setList_OD_TYP_name(List list) { l_OD_TYP_name = list; }
	public void setList_OD_TYP_val(List list) { l_OD_TYP_val = list; }
	public void setList_s_OUTSIDE_TYP(List list) { l_s_OUTSIDE_TYP = list; }
	public void setList_OUTSIDE_TYP_name(List list) { l_OUTSIDE_TYP_name = list; }
	public void setList_OUTSIDE_TYP_val(List list) { l_OUTSIDE_TYP_val = list; }
	public void setList_s_BUSINESS_DATE(List list) { l_s_BUSINESS_DATE = list; }
	public void setList_s_UN_CONNECT_DEMAND(List list) { l_s_UN_CONNECT_DEMAND = list; }
	public void setList_s_ODR_DMD_TYP1(List list) { l_s_ODR_DMD_TYP1 = list; }
	public void setList_s_ODR_DMD_TYP2(List list) { l_s_ODR_DMD_TYP2 = list; }
	public void setList_w_ODR_STS_TYP(List list) { l_w_ODR_STS_TYP = list; }
	public void setList_w_DM_STS_TYP(List list) { l_w_DM_STS_TYP = list; }
	public void setList_ODR_STS_TYP_name(List list) { l_ODR_STS_TYP_name = list; }
	public void setList_ODR_STS_TYP_val(List list) { l_ODR_STS_TYP_val = list; }
	public void setList_DM_STS_TYP_name(List list) { l_DM_STS_TYP_name = list; }
	public void setList_DM_STS_TYP_val(List list) { l_DM_STS_TYP_val = list; }
	public void setList_h_OD_NO(List list) { l_h_OD_NO = list; }
	public void setList_h_PARENT_OD_NO(List list) { l_h_PARENT_OD_NO = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_PRD_DUE_DATE(List list) { l_PRD_DUE_DATE = list; }
	public void setList_ODR_QTY(List list) { l_ODR_QTY = list; }
	public void setList_DM_QTY(List list) { l_DM_QTY = list; }
	public void setList_EXTERNAL_PLAN_CD(List list) { l_EXTERNAL_PLAN_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_EX_MODIFY_COUNT(List list) { l_EX_MODIFY_COUNT = list; }
	public void setList_OD_MODIFY_COUNT(List list) { l_OD_MODIFY_COUNT = list; }
	public void setList_w_ITEM_CD(List list) { l_w_ITEM_CD = list; }
	public void setList_w_PLANT_CD(List list) { l_w_PLANT_CD = list; }
	public void setList_w_DATE_FROM_ALL(List list) { l_w_DATE_FROM_ALL = list; }
	public void setList_w_DATE_TO_ALL(List list) { l_w_DATE_TO_ALL = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_TIME_CTRL(List list) { l_TIME_CTRL = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }

	public int setL2L_w_DATE_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_DATE_FROM == null) {
			l_w_DATE_FROM = new ArrayList();
		} else {
			l_w_DATE_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_DATE_FROM.add(((AC0080010Struct) list.get(i)).getw_DATE_FROM());
		}
		return size;
	}
	public int setL2L_w_DATE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_DATE_TO == null) {
			l_w_DATE_TO = new ArrayList();
		} else {
			l_w_DATE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_DATE_TO.add(((AC0080010Struct) list.get(i)).getw_DATE_TO());
		}
		return size;
	}
	public int setL2L_w_OD_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_OD_TYP == null) {
			l_w_OD_TYP = new ArrayList();
		} else {
			l_w_OD_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_OD_TYP.add(((AC0080010Struct) list.get(i)).getw_OD_TYP());
		}
		return size;
	}
	public int setL2L_w_OD_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_OD_TYP_name == null) {
			l_w_OD_TYP_name = new ArrayList();
		} else {
			l_w_OD_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_OD_TYP_name.add(((AC0080010Struct) list.get(i)).getw_OD_TYP_name());
		}
		return size;
	}
	public int setL2L_w_OD_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_OD_TYP_val == null) {
			l_w_OD_TYP_val = new ArrayList();
		} else {
			l_w_OD_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_OD_TYP_val.add(((AC0080010Struct) list.get(i)).getw_OD_TYP_val());
		}
		return size;
	}
	public int setL2L_OD_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OD_TYP == null) {
			l_OD_TYP = new ArrayList();
		} else {
			l_OD_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OD_TYP.add(((AC0080010Struct) list.get(i)).getOD_TYP());
		}
		return size;
	}
	public int setL2L_OUTSIDE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OUTSIDE_TYP == null) {
			l_OUTSIDE_TYP = new ArrayList();
		} else {
			l_OUTSIDE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OUTSIDE_TYP.add(((AC0080010Struct) list.get(i)).getOUTSIDE_TYP());
		}
		return size;
	}
	public int setL2L_h_DEMAND_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_DEMAND_FLG == null) {
			l_h_DEMAND_FLG = new ArrayList();
		} else {
			l_h_DEMAND_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_DEMAND_FLG.add(((AC0080010Struct) list.get(i)).geth_DEMAND_FLG());
		}
		return size;
	}
	public int setL2L_ODR_DM_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_DM_QTY == null) {
			l_ODR_DM_QTY = new ArrayList();
		} else {
			l_ODR_DM_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_DM_QTY.add(((AC0080010Struct) list.get(i)).getODR_DM_QTY());
		}
		return size;
	}
	public int setL2L_h_ODR_DMD_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ODR_DMD_TYP == null) {
			l_h_ODR_DMD_TYP = new ArrayList();
		} else {
			l_h_ODR_DMD_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ODR_DMD_TYP.add(((AC0080010Struct) list.get(i)).geth_ODR_DMD_TYP());
		}
		return size;
	}
	public int setL2L_w_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_STS_TYP == null) {
			l_w_STS_TYP = new ArrayList();
		} else {
			l_w_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_STS_TYP.add(((AC0080010Struct) list.get(i)).getw_STS_TYP());
		}
		return size;
	}
	public int setL2L_c_UN_CONNECT_DEMAND(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_UN_CONNECT_DEMAND == null) {
			l_c_UN_CONNECT_DEMAND = new ArrayList();
		} else {
			l_c_UN_CONNECT_DEMAND.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_UN_CONNECT_DEMAND.add(((AC0080010Struct) list.get(i)).getc_UN_CONNECT_DEMAND());
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
			l_DOWNLOAD_FILE.add(((AC0080010Struct) list.get(i)).getDOWNLOAD_FILE());
		}
		return size;
	}
	public int setL2L_w_TIME_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_TIME_FROM == null) {
			l_w_TIME_FROM = new ArrayList();
		} else {
			l_w_TIME_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_TIME_FROM.add(((AC0080010Struct) list.get(i)).getw_TIME_FROM());
		}
		return size;
	}
	public int setL2L_w_TIME_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_TIME_TO == null) {
			l_w_TIME_TO = new ArrayList();
		} else {
			l_w_TIME_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_TIME_TO.add(((AC0080010Struct) list.get(i)).getw_TIME_TO());
		}
		return size;
	}
	public int setL2L_s_MIN_CAL_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_MIN_CAL_DATE == null) {
			l_s_MIN_CAL_DATE = new ArrayList();
		} else {
			l_s_MIN_CAL_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_MIN_CAL_DATE.add(((AC0080010Struct) list.get(i)).gets_MIN_CAL_DATE());
		}
		return size;
	}
	public int setL2L_s_MAX_CAL_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_MAX_CAL_DATE == null) {
			l_s_MAX_CAL_DATE = new ArrayList();
		} else {
			l_s_MAX_CAL_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_MAX_CAL_DATE.add(((AC0080010Struct) list.get(i)).gets_MAX_CAL_DATE());
		}
		return size;
	}
	public int setL2L_s_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_PLANT_CD == null) {
			l_s_PLANT_CD = new ArrayList();
		} else {
			l_s_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_PLANT_CD.add(((AC0080010Struct) list.get(i)).gets_PLANT_CD());
		}
		return size;
	}
	public int setL2L_s_OD_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_OD_TYP == null) {
			l_s_OD_TYP = new ArrayList();
		} else {
			l_s_OD_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_OD_TYP.add(((AC0080010Struct) list.get(i)).gets_OD_TYP());
		}
		return size;
	}
	public int setL2L_OD_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OD_TYP_name == null) {
			l_OD_TYP_name = new ArrayList();
		} else {
			l_OD_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OD_TYP_name.add(((AC0080010Struct) list.get(i)).getOD_TYP_name());
		}
		return size;
	}
	public int setL2L_OD_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OD_TYP_val == null) {
			l_OD_TYP_val = new ArrayList();
		} else {
			l_OD_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OD_TYP_val.add(((AC0080010Struct) list.get(i)).getOD_TYP_val());
		}
		return size;
	}
	public int setL2L_s_OUTSIDE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_OUTSIDE_TYP == null) {
			l_s_OUTSIDE_TYP = new ArrayList();
		} else {
			l_s_OUTSIDE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_OUTSIDE_TYP.add(((AC0080010Struct) list.get(i)).gets_OUTSIDE_TYP());
		}
		return size;
	}
	public int setL2L_OUTSIDE_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OUTSIDE_TYP_name == null) {
			l_OUTSIDE_TYP_name = new ArrayList();
		} else {
			l_OUTSIDE_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OUTSIDE_TYP_name.add(((AC0080010Struct) list.get(i)).getOUTSIDE_TYP_name());
		}
		return size;
	}
	public int setL2L_OUTSIDE_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OUTSIDE_TYP_val == null) {
			l_OUTSIDE_TYP_val = new ArrayList();
		} else {
			l_OUTSIDE_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OUTSIDE_TYP_val.add(((AC0080010Struct) list.get(i)).getOUTSIDE_TYP_val());
		}
		return size;
	}
	public int setL2L_s_BUSINESS_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_BUSINESS_DATE == null) {
			l_s_BUSINESS_DATE = new ArrayList();
		} else {
			l_s_BUSINESS_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_BUSINESS_DATE.add(((AC0080010Struct) list.get(i)).gets_BUSINESS_DATE());
		}
		return size;
	}
	public int setL2L_s_UN_CONNECT_DEMAND(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_UN_CONNECT_DEMAND == null) {
			l_s_UN_CONNECT_DEMAND = new ArrayList();
		} else {
			l_s_UN_CONNECT_DEMAND.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_UN_CONNECT_DEMAND.add(((AC0080010Struct) list.get(i)).gets_UN_CONNECT_DEMAND());
		}
		return size;
	}
	public int setL2L_s_ODR_DMD_TYP1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_ODR_DMD_TYP1 == null) {
			l_s_ODR_DMD_TYP1 = new ArrayList();
		} else {
			l_s_ODR_DMD_TYP1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_ODR_DMD_TYP1.add(((AC0080010Struct) list.get(i)).gets_ODR_DMD_TYP1());
		}
		return size;
	}
	public int setL2L_s_ODR_DMD_TYP2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_ODR_DMD_TYP2 == null) {
			l_s_ODR_DMD_TYP2 = new ArrayList();
		} else {
			l_s_ODR_DMD_TYP2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_ODR_DMD_TYP2.add(((AC0080010Struct) list.get(i)).gets_ODR_DMD_TYP2());
		}
		return size;
	}
	public int setL2L_w_ODR_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_ODR_STS_TYP == null) {
			l_w_ODR_STS_TYP = new ArrayList();
		} else {
			l_w_ODR_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_ODR_STS_TYP.add(((AC0080010Struct) list.get(i)).getw_ODR_STS_TYP());
		}
		return size;
	}
	public int setL2L_w_DM_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_DM_STS_TYP == null) {
			l_w_DM_STS_TYP = new ArrayList();
		} else {
			l_w_DM_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_DM_STS_TYP.add(((AC0080010Struct) list.get(i)).getw_DM_STS_TYP());
		}
		return size;
	}
	public int setL2L_ODR_STS_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_STS_TYP_name == null) {
			l_ODR_STS_TYP_name = new ArrayList();
		} else {
			l_ODR_STS_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_STS_TYP_name.add(((AC0080010Struct) list.get(i)).getODR_STS_TYP_name());
		}
		return size;
	}
	public int setL2L_ODR_STS_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_STS_TYP_val == null) {
			l_ODR_STS_TYP_val = new ArrayList();
		} else {
			l_ODR_STS_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_STS_TYP_val.add(((AC0080010Struct) list.get(i)).getODR_STS_TYP_val());
		}
		return size;
	}
	public int setL2L_DM_STS_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DM_STS_TYP_name == null) {
			l_DM_STS_TYP_name = new ArrayList();
		} else {
			l_DM_STS_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DM_STS_TYP_name.add(((AC0080010Struct) list.get(i)).getDM_STS_TYP_name());
		}
		return size;
	}
	public int setL2L_DM_STS_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DM_STS_TYP_val == null) {
			l_DM_STS_TYP_val = new ArrayList();
		} else {
			l_DM_STS_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DM_STS_TYP_val.add(((AC0080010Struct) list.get(i)).getDM_STS_TYP_val());
		}
		return size;
	}
	public int setL2L_h_OD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_OD_NO == null) {
			l_h_OD_NO = new ArrayList();
		} else {
			l_h_OD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_OD_NO.add(((AC0080010Struct) list.get(i)).geth_OD_NO());
		}
		return size;
	}
	public int setL2L_h_PARENT_OD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PARENT_OD_NO == null) {
			l_h_PARENT_OD_NO = new ArrayList();
		} else {
			l_h_PARENT_OD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PARENT_OD_NO.add(((AC0080010Struct) list.get(i)).geth_PARENT_OD_NO());
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
			l_ITEM_CD.add(((AC0080010Struct) list.get(i)).getITEM_CD());
		}
		return size;
	}
	public int setL2L_PRD_DUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRD_DUE_DATE == null) {
			l_PRD_DUE_DATE = new ArrayList();
		} else {
			l_PRD_DUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRD_DUE_DATE.add(((AC0080010Struct) list.get(i)).getPRD_DUE_DATE());
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
			l_ODR_QTY.add(((AC0080010Struct) list.get(i)).getODR_QTY());
		}
		return size;
	}
	public int setL2L_DM_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DM_QTY == null) {
			l_DM_QTY = new ArrayList();
		} else {
			l_DM_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DM_QTY.add(((AC0080010Struct) list.get(i)).getDM_QTY());
		}
		return size;
	}
	public int setL2L_EXTERNAL_PLAN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXTERNAL_PLAN_CD == null) {
			l_EXTERNAL_PLAN_CD = new ArrayList();
		} else {
			l_EXTERNAL_PLAN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXTERNAL_PLAN_CD.add(((AC0080010Struct) list.get(i)).getEXTERNAL_PLAN_CD());
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
			l_ITEM_NAME.add(((AC0080010Struct) list.get(i)).getITEM_NAME());
		}
		return size;
	}
	public int setL2L_EX_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EX_MODIFY_COUNT == null) {
			l_EX_MODIFY_COUNT = new ArrayList();
		} else {
			l_EX_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EX_MODIFY_COUNT.add(((AC0080010Struct) list.get(i)).getEX_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_OD_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OD_MODIFY_COUNT == null) {
			l_OD_MODIFY_COUNT = new ArrayList();
		} else {
			l_OD_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OD_MODIFY_COUNT.add(((AC0080010Struct) list.get(i)).getOD_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_w_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_ITEM_CD == null) {
			l_w_ITEM_CD = new ArrayList();
		} else {
			l_w_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_ITEM_CD.add(((AC0080010Struct) list.get(i)).getw_ITEM_CD());
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
			l_w_PLANT_CD.add(((AC0080010Struct) list.get(i)).getw_PLANT_CD());
		}
		return size;
	}
	public int setL2L_w_DATE_FROM_ALL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_DATE_FROM_ALL == null) {
			l_w_DATE_FROM_ALL = new ArrayList();
		} else {
			l_w_DATE_FROM_ALL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_DATE_FROM_ALL.add(((AC0080010Struct) list.get(i)).getw_DATE_FROM_ALL());
		}
		return size;
	}
	public int setL2L_w_DATE_TO_ALL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_DATE_TO_ALL == null) {
			l_w_DATE_TO_ALL = new ArrayList();
		} else {
			l_w_DATE_TO_ALL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_DATE_TO_ALL.add(((AC0080010Struct) list.get(i)).getw_DATE_TO_ALL());
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
			l_PLANT_NAME.add(((AC0080010Struct) list.get(i)).getPLANT_NAME());
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
			l_MODIFY_COUNT.add(((AC0080010Struct) list.get(i)).getMODIFY_COUNT());
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
			l_TIME_CTRL.add(((AC0080010Struct) list.get(i)).getTIME_CTRL());
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
			l_l_COUNT.add(((AC0080010Struct) list.get(i)).getl_COUNT());
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
			l_ROW_COUNT.add(((AC0080010Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_w_DATE_FROM = null;
		m_w_DATE_TO = null;
		m_w_OD_TYP = null;
		m_w_OD_TYP_name = null;
		m_w_OD_TYP_val = null;
		m_OD_TYP = null;
		m_OUTSIDE_TYP = null;
		m_h_DEMAND_FLG = null;
		m_ODR_DM_QTY = null;
		m_h_ODR_DMD_TYP = null;
		m_w_STS_TYP = null;
		m_c_UN_CONNECT_DEMAND = null;
		m_DOWNLOAD_FILE = null;
		m_w_TIME_FROM = null;
		m_w_TIME_TO = null;
		m_s_MIN_CAL_DATE = null;
		m_s_MAX_CAL_DATE = null;
		m_s_PLANT_CD = null;
		m_s_OD_TYP = null;
		m_OD_TYP_name = null;
		m_OD_TYP_val = null;
		m_s_OUTSIDE_TYP = null;
		m_OUTSIDE_TYP_name = null;
		m_OUTSIDE_TYP_val = null;
		m_s_BUSINESS_DATE = null;
		m_s_UN_CONNECT_DEMAND = null;
		m_s_ODR_DMD_TYP1 = null;
		m_s_ODR_DMD_TYP2 = null;
		m_w_ODR_STS_TYP = null;
		m_w_DM_STS_TYP = null;
		m_ODR_STS_TYP_name = null;
		m_ODR_STS_TYP_val = null;
		m_DM_STS_TYP_name = null;
		m_DM_STS_TYP_val = null;
		m_h_OD_NO = null;
		m_h_PARENT_OD_NO = null;
		m_ITEM_CD = null;
		m_PRD_DUE_DATE = null;
		m_ODR_QTY = null;
		m_DM_QTY = null;
		m_EXTERNAL_PLAN_CD = null;
		m_ITEM_NAME = null;
		m_EX_MODIFY_COUNT = null;
		m_OD_MODIFY_COUNT = null;
		m_w_ITEM_CD = null;
		m_w_PLANT_CD = null;
		m_w_DATE_FROM_ALL = null;
		m_w_DATE_TO_ALL = null;
		m_PLANT_NAME = null;
		m_MODIFY_COUNT = null;
		m_TIME_CTRL = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;

		l_w_DATE_FROM = null;
		l_w_DATE_TO = null;
		l_w_OD_TYP = null;
		l_w_OD_TYP_name = null;
		l_w_OD_TYP_val = null;
		l_OD_TYP = null;
		l_OUTSIDE_TYP = null;
		l_h_DEMAND_FLG = null;
		l_ODR_DM_QTY = null;
		l_h_ODR_DMD_TYP = null;
		l_w_STS_TYP = null;
		l_c_UN_CONNECT_DEMAND = null;
		l_DOWNLOAD_FILE = null;
		l_w_TIME_FROM = null;
		l_w_TIME_TO = null;
		l_s_MIN_CAL_DATE = null;
		l_s_MAX_CAL_DATE = null;
		l_s_PLANT_CD = null;
		l_s_OD_TYP = null;
		l_OD_TYP_name = null;
		l_OD_TYP_val = null;
		l_s_OUTSIDE_TYP = null;
		l_OUTSIDE_TYP_name = null;
		l_OUTSIDE_TYP_val = null;
		l_s_BUSINESS_DATE = null;
		l_s_UN_CONNECT_DEMAND = null;
		l_s_ODR_DMD_TYP1 = null;
		l_s_ODR_DMD_TYP2 = null;
		l_w_ODR_STS_TYP = null;
		l_w_DM_STS_TYP = null;
		l_ODR_STS_TYP_name = null;
		l_ODR_STS_TYP_val = null;
		l_DM_STS_TYP_name = null;
		l_DM_STS_TYP_val = null;
		l_h_OD_NO = null;
		l_h_PARENT_OD_NO = null;
		l_ITEM_CD = null;
		l_PRD_DUE_DATE = null;
		l_ODR_QTY = null;
		l_DM_QTY = null;
		l_EXTERNAL_PLAN_CD = null;
		l_ITEM_NAME = null;
		l_EX_MODIFY_COUNT = null;
		l_OD_MODIFY_COUNT = null;
		l_w_ITEM_CD = null;
		l_w_PLANT_CD = null;
		l_w_DATE_FROM_ALL = null;
		l_w_DATE_TO_ALL = null;
		l_PLANT_NAME = null;
		l_MODIFY_COUNT = null;
		l_TIME_CTRL = null;
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
	 * medAC0080010�N���X�̕W���R���X�g���N�^
	 */
	public AC0080010Struct()
	{
		//{{user_implement_code_constractor
                 
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
	public void setStruct(AC0080010Struct struct)
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
	public void setStructM(AC0080010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setw_DATE_FROM(struct.getw_DATE_FROM());
			this.setw_DATE_TO(struct.getw_DATE_TO());
			this.setw_OD_TYP(struct.getw_OD_TYP());
			this.setw_OD_TYP_name(struct.getw_OD_TYP_name());
			this.setw_OD_TYP_val(struct.getw_OD_TYP_val());
			this.setOD_TYP(struct.getOD_TYP());
			this.setOUTSIDE_TYP(struct.getOUTSIDE_TYP());
			this.seth_DEMAND_FLG(struct.geth_DEMAND_FLG());
			this.setODR_DM_QTY(struct.getODR_DM_QTY());
			this.seth_ODR_DMD_TYP(struct.geth_ODR_DMD_TYP());
			this.setw_STS_TYP(struct.getw_STS_TYP());
			this.setc_UN_CONNECT_DEMAND(struct.getc_UN_CONNECT_DEMAND());
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setw_TIME_FROM(struct.getw_TIME_FROM());
			this.setw_TIME_TO(struct.getw_TIME_TO());
			this.sets_MIN_CAL_DATE(struct.gets_MIN_CAL_DATE());
			this.sets_MAX_CAL_DATE(struct.gets_MAX_CAL_DATE());
			this.sets_PLANT_CD(struct.gets_PLANT_CD());
			this.sets_OD_TYP(struct.gets_OD_TYP());
			this.setOD_TYP_name(struct.getOD_TYP_name());
			this.setOD_TYP_val(struct.getOD_TYP_val());
			this.sets_OUTSIDE_TYP(struct.gets_OUTSIDE_TYP());
			this.setOUTSIDE_TYP_name(struct.getOUTSIDE_TYP_name());
			this.setOUTSIDE_TYP_val(struct.getOUTSIDE_TYP_val());
			this.sets_BUSINESS_DATE(struct.gets_BUSINESS_DATE());
			this.sets_UN_CONNECT_DEMAND(struct.gets_UN_CONNECT_DEMAND());
			this.sets_ODR_DMD_TYP1(struct.gets_ODR_DMD_TYP1());
			this.sets_ODR_DMD_TYP2(struct.gets_ODR_DMD_TYP2());
			this.setw_ODR_STS_TYP(struct.getw_ODR_STS_TYP());
			this.setw_DM_STS_TYP(struct.getw_DM_STS_TYP());
			this.setODR_STS_TYP_name(struct.getODR_STS_TYP_name());
			this.setODR_STS_TYP_val(struct.getODR_STS_TYP_val());
			this.setDM_STS_TYP_name(struct.getDM_STS_TYP_name());
			this.setDM_STS_TYP_val(struct.getDM_STS_TYP_val());
			this.seth_OD_NO(struct.geth_OD_NO());
			this.seth_PARENT_OD_NO(struct.geth_PARENT_OD_NO());
			this.setITEM_CD(struct.getITEM_CD());
			this.setPRD_DUE_DATE(struct.getPRD_DUE_DATE());
			this.setODR_QTY(struct.getODR_QTY());
			this.setDM_QTY(struct.getDM_QTY());
			this.setEXTERNAL_PLAN_CD(struct.getEXTERNAL_PLAN_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setEX_MODIFY_COUNT(struct.getEX_MODIFY_COUNT());
			this.setOD_MODIFY_COUNT(struct.getOD_MODIFY_COUNT());
			this.setw_ITEM_CD(struct.getw_ITEM_CD());
			this.setw_PLANT_CD(struct.getw_PLANT_CD());
			this.setw_DATE_FROM_ALL(struct.getw_DATE_FROM_ALL());
			this.setw_DATE_TO_ALL(struct.getw_DATE_TO_ALL());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setTIME_CTRL(struct.getTIME_CTRL());
			this.setl_COUNT(struct.getl_COUNT());
			this.setROW_COUNT(struct.getROW_COUNT());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AC0080010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_w_DATE_FROM(struct.getList_w_DATE_FROM());
			this.setList_w_DATE_TO(struct.getList_w_DATE_TO());
			this.setList_w_OD_TYP(struct.getList_w_OD_TYP());
			this.setList_w_OD_TYP_name(struct.getList_w_OD_TYP_name());
			this.setList_w_OD_TYP_val(struct.getList_w_OD_TYP_val());
			this.setList_OD_TYP(struct.getList_OD_TYP());
			this.setList_OUTSIDE_TYP(struct.getList_OUTSIDE_TYP());
			this.setList_h_DEMAND_FLG(struct.getList_h_DEMAND_FLG());
			this.setList_ODR_DM_QTY(struct.getList_ODR_DM_QTY());
			this.setList_h_ODR_DMD_TYP(struct.getList_h_ODR_DMD_TYP());
			this.setList_w_STS_TYP(struct.getList_w_STS_TYP());
			this.setList_c_UN_CONNECT_DEMAND(struct.getList_c_UN_CONNECT_DEMAND());
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_w_TIME_FROM(struct.getList_w_TIME_FROM());
			this.setList_w_TIME_TO(struct.getList_w_TIME_TO());
			this.setList_s_MIN_CAL_DATE(struct.getList_s_MIN_CAL_DATE());
			this.setList_s_MAX_CAL_DATE(struct.getList_s_MAX_CAL_DATE());
			this.setList_s_PLANT_CD(struct.getList_s_PLANT_CD());
			this.setList_s_OD_TYP(struct.getList_s_OD_TYP());
			this.setList_OD_TYP_name(struct.getList_OD_TYP_name());
			this.setList_OD_TYP_val(struct.getList_OD_TYP_val());
			this.setList_s_OUTSIDE_TYP(struct.getList_s_OUTSIDE_TYP());
			this.setList_OUTSIDE_TYP_name(struct.getList_OUTSIDE_TYP_name());
			this.setList_OUTSIDE_TYP_val(struct.getList_OUTSIDE_TYP_val());
			this.setList_s_BUSINESS_DATE(struct.getList_s_BUSINESS_DATE());
			this.setList_s_UN_CONNECT_DEMAND(struct.getList_s_UN_CONNECT_DEMAND());
			this.setList_s_ODR_DMD_TYP1(struct.getList_s_ODR_DMD_TYP1());
			this.setList_s_ODR_DMD_TYP2(struct.getList_s_ODR_DMD_TYP2());
			this.setList_w_ODR_STS_TYP(struct.getList_w_ODR_STS_TYP());
			this.setList_w_DM_STS_TYP(struct.getList_w_DM_STS_TYP());
			this.setList_ODR_STS_TYP_name(struct.getList_ODR_STS_TYP_name());
			this.setList_ODR_STS_TYP_val(struct.getList_ODR_STS_TYP_val());
			this.setList_DM_STS_TYP_name(struct.getList_DM_STS_TYP_name());
			this.setList_DM_STS_TYP_val(struct.getList_DM_STS_TYP_val());
			this.setList_h_OD_NO(struct.getList_h_OD_NO());
			this.setList_h_PARENT_OD_NO(struct.getList_h_PARENT_OD_NO());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_PRD_DUE_DATE(struct.getList_PRD_DUE_DATE());
			this.setList_ODR_QTY(struct.getList_ODR_QTY());
			this.setList_DM_QTY(struct.getList_DM_QTY());
			this.setList_EXTERNAL_PLAN_CD(struct.getList_EXTERNAL_PLAN_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_EX_MODIFY_COUNT(struct.getList_EX_MODIFY_COUNT());
			this.setList_OD_MODIFY_COUNT(struct.getList_OD_MODIFY_COUNT());
			this.setList_w_ITEM_CD(struct.getList_w_ITEM_CD());
			this.setList_w_PLANT_CD(struct.getList_w_PLANT_CD());
			this.setList_w_DATE_FROM_ALL(struct.getList_w_DATE_FROM_ALL());
			this.setList_w_DATE_TO_ALL(struct.getList_w_DATE_TO_ALL());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_TIME_CTRL(struct.getList_TIME_CTRL());
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
	// �� 1 �ϐ������l�F i_w_DATE_FROM


	final static String i_w_DATE_FROM = null;

	// �� 2 �ϐ������l�F i_w_DATE_TO


	final static String i_w_DATE_TO = null;

	// �� 3 �ϐ������l�F i_w_OD_TYP


	final static String i_w_OD_TYP = null;

	// �� 4 �ϐ������l�F i_w_OD_TYP_name


	final static String i_w_OD_TYP_name = null;

	// �� 5 �ϐ������l�F i_w_OD_TYP_val


	final static String i_w_OD_TYP_val = null;

	// �� 6 �ϐ������l�F i_OD_TYP


	final static String i_OD_TYP = null;

	// �� 7 �ϐ������l�F i_OUTSIDE_TYP


	final static String i_OUTSIDE_TYP = null;

	// �� 8 �ϐ������l�F i_h_DEMAND_FLG


	final static String i_h_DEMAND_FLG = null;

	// �� 9 �ϐ������l�F i_ODR_DM_QTY


	final static String i_ODR_DM_QTY = null;

	// �� 10 �ϐ������l�F i_h_ODR_DMD_TYP


	final static String i_h_ODR_DMD_TYP = null;

	// �� 11 �ϐ������l�F i_w_STS_TYP


	final static String i_w_STS_TYP = null;

	// �� 12 �ϐ������l�F i_c_UN_CONNECT_DEMAND


	final static String i_c_UN_CONNECT_DEMAND = null;

	// �� 13 �ϐ������l�F i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// �� 14 �ϐ������l�F i_w_TIME_FROM


	final static String i_w_TIME_FROM = null;

	// �� 15 �ϐ������l�F i_w_TIME_TO


	final static String i_w_TIME_TO = null;

	// �� 16 �ϐ������l�F i_s_MIN_CAL_DATE


	final static String i_s_MIN_CAL_DATE = null;

	// �� 17 �ϐ������l�F i_s_MAX_CAL_DATE


	final static String i_s_MAX_CAL_DATE = null;

	// �� 18 �ϐ������l�F i_s_PLANT_CD


	final static String i_s_PLANT_CD = null;

	// �� 19 �ϐ������l�F i_s_OD_TYP


	final static String i_s_OD_TYP = null;

	// �� 20 �ϐ������l�F i_OD_TYP_name


	final static String i_OD_TYP_name = null;

	// �� 21 �ϐ������l�F i_OD_TYP_val


	final static String i_OD_TYP_val = null;

	// �� 22 �ϐ������l�F i_s_OUTSIDE_TYP


	final static String i_s_OUTSIDE_TYP = null;

	// �� 23 �ϐ������l�F i_OUTSIDE_TYP_name


	final static String i_OUTSIDE_TYP_name = null;

	// �� 24 �ϐ������l�F i_OUTSIDE_TYP_val


	final static String i_OUTSIDE_TYP_val = null;

	// �� 25 �ϐ������l�F i_s_BUSINESS_DATE


	final static String i_s_BUSINESS_DATE = null;

	// �� 26 �ϐ������l�F i_s_UN_CONNECT_DEMAND


	final static String i_s_UN_CONNECT_DEMAND = null;

	// �� 27 �ϐ������l�F i_s_ODR_DMD_TYP1


	final static String i_s_ODR_DMD_TYP1 = null;

	// �� 28 �ϐ������l�F i_s_ODR_DMD_TYP2


	final static String i_s_ODR_DMD_TYP2 = null;

	// �� 29 �ϐ������l�F i_w_ODR_STS_TYP


	final static String i_w_ODR_STS_TYP = null;

	// �� 30 �ϐ������l�F i_w_DM_STS_TYP


	final static String i_w_DM_STS_TYP = null;

	// �� 31 �ϐ������l�F i_ODR_STS_TYP_name


	final static String i_ODR_STS_TYP_name = null;

	// �� 32 �ϐ������l�F i_ODR_STS_TYP_val


	final static String i_ODR_STS_TYP_val = null;

	// �� 33 �ϐ������l�F i_DM_STS_TYP_name


	final static String i_DM_STS_TYP_name = null;

	// �� 34 �ϐ������l�F i_DM_STS_TYP_val


	final static String i_DM_STS_TYP_val = null;

	// �� 35 �ϐ������l�F i_h_OD_NO


	final static String i_h_OD_NO = null;

	// �� 36 �ϐ������l�F i_h_PARENT_OD_NO


	final static String i_h_PARENT_OD_NO = null;

	// �� 37 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 38 �ϐ������l�F i_PRD_DUE_DATE


	final static String i_PRD_DUE_DATE = null;

	// �� 39 �ϐ������l�F i_ODR_QTY


	final static String i_ODR_QTY = null;

	// �� 40 �ϐ������l�F i_DM_QTY


	final static String i_DM_QTY = null;

	// �� 41 �ϐ������l�F i_EXTERNAL_PLAN_CD


	final static String i_EXTERNAL_PLAN_CD = null;

	// �� 42 �ϐ������l�F i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// �� 43 �ϐ������l�F i_EX_MODIFY_COUNT


	final static String i_EX_MODIFY_COUNT = null;

	// �� 44 �ϐ������l�F i_OD_MODIFY_COUNT


	final static String i_OD_MODIFY_COUNT = null;

	// �� 45 �ϐ������l�F i_w_ITEM_CD


	final static String i_w_ITEM_CD = null;

	// �� 46 �ϐ������l�F i_w_PLANT_CD


	final static String i_w_PLANT_CD = null;

	// �� 47 �ϐ������l�F i_w_DATE_FROM_ALL


	final static String i_w_DATE_FROM_ALL = null;

	// �� 48 �ϐ������l�F i_w_DATE_TO_ALL


	final static String i_w_DATE_TO_ALL = null;

	// �� 49 �ϐ������l�F i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// �� 50 �ϐ������l�F i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// �� 51 �ϐ������l�F i_TIME_CTRL


	final static String i_TIME_CTRL = null;

	// �� 52 �ϐ������l�F i_l_COUNT


	final static String i_l_COUNT = null;

	// �� 53 �ϐ������l�F i_ROW_COUNT


	final static String i_ROW_COUNT = null;

*/

	//{{user_implement_code
           //---------------------------------------------------------------------
       
        /**
         * ������
         */
        public void init()
        {
         m_w_OD_TYP = new String("1");
         m_h_ODR_DMD_TYP = new String("1");
         m_h_DEMAND_FLG = new String("0");
        }
       
        /**	
         * �������ϐ��̃R�s�[	
         * @param s �R�s�[��	
         */	
        public void copy(AC0080010Struct s)	
        {	
         clear();
         if(s.sUser_ID != null) sUser_ID = new String(s.sUser_ID);
         if(s.sSysdate != null) sSysdate = new String(s.sSysdate);
         if(s.m_h_OD_NO != null) m_h_OD_NO = new String(s.m_h_OD_NO);
         if(s.m_h_PARENT_OD_NO != null) m_h_PARENT_OD_NO = new String(s.m_h_PARENT_OD_NO);
         if(s.m_ITEM_CD != null) m_ITEM_CD = new String(s.m_ITEM_CD);
         if(s.m_PRD_DUE_DATE != null) m_PRD_DUE_DATE = new String(s.m_PRD_DUE_DATE);
         if(s.m_ODR_QTY != null) m_ODR_QTY = new String(s.m_ODR_QTY);
         if(s.m_DM_QTY != null) m_DM_QTY = new String(s.m_DM_QTY);
         if(s.m_s_OD_TYP != null) m_s_OD_TYP = new String(s.m_s_OD_TYP);
         if(s.m_s_OUTSIDE_TYP != null) m_s_OUTSIDE_TYP = new String(s.m_s_OUTSIDE_TYP);
         if(s.m_w_ODR_STS_TYP != null) m_w_ODR_STS_TYP = new String(s.m_w_ODR_STS_TYP);
         if(s.m_w_DM_STS_TYP != null) m_w_DM_STS_TYP = new String(s.m_w_DM_STS_TYP);
         if(s.m_EXTERNAL_PLAN_CD != null) m_EXTERNAL_PLAN_CD = new String(s.m_EXTERNAL_PLAN_CD);
         if(s.m_ITEM_NAME != null) m_ITEM_NAME = new String(s.m_ITEM_NAME);
         if(s.m_w_ITEM_CD != null) m_w_ITEM_CD = new String(s.m_w_ITEM_CD);
         if(s.m_w_PLANT_CD != null) m_w_PLANT_CD = new String(s.m_w_PLANT_CD);
         if(s.m_s_ODR_DMD_TYP1 != null) m_s_ODR_DMD_TYP1 = new String(s.m_s_ODR_DMD_TYP1);
         if(s.m_s_ODR_DMD_TYP2 != null) m_s_ODR_DMD_TYP2 = new String(s.m_s_ODR_DMD_TYP2);
         if(s.m_w_DATE_FROM != null) m_w_DATE_FROM = new String(s.m_w_DATE_FROM);
         if(s.m_w_DATE_TO != null) m_w_DATE_TO = new String(s.m_w_DATE_TO);
         if(s.m_s_UN_CONNECT_DEMAND != null) m_s_UN_CONNECT_DEMAND = new String(s.m_s_UN_CONNECT_DEMAND);
         if(s.m_EX_MODIFY_COUNT != null) m_EX_MODIFY_COUNT = new String(s.m_EX_MODIFY_COUNT);
         if(s.m_OD_MODIFY_COUNT != null) m_OD_MODIFY_COUNT = new String(s.m_OD_MODIFY_COUNT);
         if(s.m_s_PLANT_CD != null) m_s_PLANT_CD = new String(s.m_s_PLANT_CD);
         if(s.m_PLANT_NAME != null) m_PLANT_NAME = new String(s.m_PLANT_NAME);
         if(s.m_s_MIN_CAL_DATE != null) m_s_MIN_CAL_DATE = new String(s.m_s_MIN_CAL_DATE);
         if(s.m_s_MAX_CAL_DATE != null) m_s_MAX_CAL_DATE = new String(s.m_s_MAX_CAL_DATE);
         if(s.m_s_BUSINESS_DATE != null) m_s_BUSINESS_DATE = new String(s.m_s_BUSINESS_DATE);
         if(s.m_MODIFY_COUNT != null) m_MODIFY_COUNT = new String(s.m_MODIFY_COUNT);
         if(s.m_w_OD_TYP != null) m_w_OD_TYP = new String(s.m_w_OD_TYP);
         if(s.m_w_OD_TYP_name != null) m_w_OD_TYP_name = new String(s.m_w_OD_TYP_name);
         if(s.m_w_OD_TYP_val != null) m_w_OD_TYP_val = new String(s.m_w_OD_TYP_val);
         if(s.m_OD_TYP != null) m_OD_TYP = new String(s.m_OD_TYP);
         if(s.m_OUTSIDE_TYP != null) m_OUTSIDE_TYP = new String(s.m_OUTSIDE_TYP);
         if(s.m_h_DEMAND_FLG != null) m_h_DEMAND_FLG = new String(s.m_h_DEMAND_FLG);
         if(s.m_ODR_DM_QTY != null) m_ODR_DM_QTY = new String(s.m_ODR_DM_QTY);
         if(s.m_h_ODR_DMD_TYP != null) m_h_ODR_DMD_TYP = new String(s.m_h_ODR_DMD_TYP);
         if(s.m_w_STS_TYP != null) m_w_STS_TYP = new String(s.m_w_STS_TYP);
         if(s.m_c_UN_CONNECT_DEMAND != null) m_c_UN_CONNECT_DEMAND = new String(s.m_c_UN_CONNECT_DEMAND);
         if(s.m_DOWNLOAD_FILE != null) m_DOWNLOAD_FILE = new String(s.m_DOWNLOAD_FILE);
         if(s.m_OD_TYP_name != null) m_OD_TYP_name = new String(s.m_OD_TYP_name);
         if(s.m_OD_TYP_val != null) m_OD_TYP_val = new String(s.m_OD_TYP_val);
         if(s.m_OUTSIDE_TYP_name != null) m_OUTSIDE_TYP_name = new String(s.m_OUTSIDE_TYP_name);
         if(s.m_OUTSIDE_TYP_val != null) m_OUTSIDE_TYP_val = new String(s.m_OUTSIDE_TYP_val);
         if(s.m_ODR_STS_TYP_name != null) m_ODR_STS_TYP_name = new String(s.m_ODR_STS_TYP_name);
         if(s.m_ODR_STS_TYP_val != null) m_ODR_STS_TYP_val = new String(s.m_ODR_STS_TYP_val);
         if(s.m_DM_STS_TYP_name != null) m_DM_STS_TYP_name = new String(s.m_DM_STS_TYP_name);
         if(s.m_DM_STS_TYP_val != null) m_DM_STS_TYP_val = new String(s.m_DM_STS_TYP_val);
        }	
       
        /**	
         * �����̏��̕ێ����郊�X�g�̕ϐ�����w��̏��̃f�[�^���擾	
         * @param in ���X�g�ێ��̏��	
         * @param index ����	
         */	
        public void importData(AC0080010Struct in, int index)	
        {	
         clear();
         if(in.l_h_OD_NO != null && in.l_h_OD_NO.size() > index)  m_h_OD_NO = (String)(in.l_h_OD_NO.get(index));
         if(in.l_h_PARENT_OD_NO != null && in.l_h_PARENT_OD_NO.size() > index)  m_h_PARENT_OD_NO = (String)(in.l_h_PARENT_OD_NO.get(index));
         if(in.l_ITEM_CD != null && in.l_ITEM_CD.size() > index)  m_ITEM_CD = (String)(in.l_ITEM_CD.get(index));
         if(in.l_PRD_DUE_DATE != null && in.l_PRD_DUE_DATE.size() > index)  m_PRD_DUE_DATE = (String)(in.l_PRD_DUE_DATE.get(index));
         if(in.l_ODR_QTY != null && in.l_ODR_QTY.size() > index)  m_ODR_QTY = (String)(in.l_ODR_QTY.get(index));
         if(in.l_DM_QTY != null && in.l_DM_QTY.size() > index)  m_DM_QTY = (String)(in.l_DM_QTY.get(index));
         if(in.l_s_OD_TYP != null && in.l_s_OD_TYP.size() > index)  m_s_OD_TYP = (String)(in.l_s_OD_TYP.get(index));
         if(in.l_s_OUTSIDE_TYP != null && in.l_s_OUTSIDE_TYP.size() > index)  m_s_OUTSIDE_TYP = (String)(in.l_s_OUTSIDE_TYP.get(index));
         if(in.l_w_ODR_STS_TYP != null && in.l_w_ODR_STS_TYP.size() > index)  m_w_ODR_STS_TYP = (String)(in.l_w_ODR_STS_TYP.get(index));
         if(in.l_w_DM_STS_TYP != null && in.l_w_DM_STS_TYP.size() > index)  m_w_DM_STS_TYP = (String)(in.l_w_DM_STS_TYP.get(index));
         if(in.l_EXTERNAL_PLAN_CD != null && in.l_EXTERNAL_PLAN_CD.size() > index)  m_EXTERNAL_PLAN_CD = (String)(in.l_EXTERNAL_PLAN_CD.get(index));
         if(in.l_ITEM_NAME != null && in.l_ITEM_NAME.size() > index)  m_ITEM_NAME = (String)(in.l_ITEM_NAME.get(index));
         if(in.l_w_ITEM_CD != null && in.l_w_ITEM_CD.size() > index)  m_w_ITEM_CD = (String)(in.l_w_ITEM_CD.get(index));
         if(in.l_w_PLANT_CD != null && in.l_w_PLANT_CD.size() > index)  m_w_PLANT_CD = (String)(in.l_w_PLANT_CD.get(index));
         if(in.l_s_ODR_DMD_TYP1 != null && in.l_s_ODR_DMD_TYP1.size() > index)  m_s_ODR_DMD_TYP1 = (String)(in.l_s_ODR_DMD_TYP1.get(index));
         if(in.l_s_ODR_DMD_TYP2 != null && in.l_s_ODR_DMD_TYP2.size() > index)  m_s_ODR_DMD_TYP2 = (String)(in.l_s_ODR_DMD_TYP2.get(index));
         if(in.l_w_DATE_FROM != null && in.l_w_DATE_FROM.size() > index)  m_w_DATE_FROM = (String)(in.l_w_DATE_FROM.get(index));
         if(in.l_w_DATE_TO != null && in.l_w_DATE_TO.size() > index)  m_w_DATE_TO = (String)(in.l_w_DATE_TO.get(index));
         if(in.l_s_UN_CONNECT_DEMAND != null && in.l_s_UN_CONNECT_DEMAND.size() > index)  m_s_UN_CONNECT_DEMAND = (String)(in.l_s_UN_CONNECT_DEMAND.get(index));
         if(in.l_EX_MODIFY_COUNT != null && in.l_EX_MODIFY_COUNT.size() > index)  m_EX_MODIFY_COUNT = (String)(in.l_EX_MODIFY_COUNT.get(index));
         if(in.l_OD_MODIFY_COUNT != null && in.l_OD_MODIFY_COUNT.size() > index)  m_OD_MODIFY_COUNT = (String)(in.l_OD_MODIFY_COUNT.get(index));
         if(in.l_s_PLANT_CD != null && in.l_s_PLANT_CD.size() > index)  m_s_PLANT_CD = (String)(in.l_s_PLANT_CD.get(index));
         if(in.l_PLANT_NAME != null && in.l_PLANT_NAME.size() > index)  m_PLANT_NAME = (String)(in.l_PLANT_NAME.get(index));
         if(in.l_s_MIN_CAL_DATE != null && in.l_s_MIN_CAL_DATE.size() > index)  m_s_MIN_CAL_DATE = (String)(in.l_s_MIN_CAL_DATE.get(index));
         if(in.l_s_MAX_CAL_DATE != null && in.l_s_MAX_CAL_DATE.size() > index)  m_s_MAX_CAL_DATE = (String)(in.l_s_MAX_CAL_DATE.get(index));
         if(in.l_s_BUSINESS_DATE != null && in.l_s_BUSINESS_DATE.size() > index)  m_s_BUSINESS_DATE = (String)(in.l_s_BUSINESS_DATE.get(index));
         if(in.l_MODIFY_COUNT != null && in.l_MODIFY_COUNT.size() > index)  m_MODIFY_COUNT = (String)(in.l_MODIFY_COUNT.get(index));
         if(in.l_w_OD_TYP != null && in.l_w_OD_TYP.size() > index)  m_w_OD_TYP = (String)(in.l_w_OD_TYP.get(index));
         if(in.l_w_OD_TYP_name != null && in.l_w_OD_TYP_name.size() > index)  m_w_OD_TYP_name = (String)(in.l_w_OD_TYP_name.get(index));
         if(in.l_w_OD_TYP_val != null && in.l_w_OD_TYP_val.size() > index)  m_w_OD_TYP_val = (String)(in.l_w_OD_TYP_val.get(index));
         if(in.l_OD_TYP != null && in.l_OD_TYP.size() > index)  m_OD_TYP = (String)(in.l_OD_TYP.get(index));
         if(in.l_OUTSIDE_TYP != null && in.l_OUTSIDE_TYP.size() > index)  m_OUTSIDE_TYP = (String)(in.l_OUTSIDE_TYP.get(index));
         if(in.l_h_DEMAND_FLG != null && in.l_h_DEMAND_FLG.size() > index)  m_h_DEMAND_FLG = (String)(in.l_h_DEMAND_FLG.get(index));
         if(in.l_ODR_DM_QTY != null && in.l_ODR_DM_QTY.size() > index)  m_ODR_DM_QTY = (String)(in.l_ODR_DM_QTY.get(index));
         if(in.l_h_ODR_DMD_TYP != null && in.l_h_ODR_DMD_TYP.size() > index)  m_h_ODR_DMD_TYP = (String)(in.l_h_ODR_DMD_TYP.get(index));
         if(in.l_w_STS_TYP != null && in.l_w_STS_TYP.size() > index)  m_w_STS_TYP = (String)(in.l_w_STS_TYP.get(index));
         if(in.l_c_UN_CONNECT_DEMAND != null && in.l_c_UN_CONNECT_DEMAND.size() > index)  m_c_UN_CONNECT_DEMAND = (String)(in.l_c_UN_CONNECT_DEMAND.get(index));
         if(in.l_DOWNLOAD_FILE != null && in.l_DOWNLOAD_FILE.size() > index)  m_DOWNLOAD_FILE = (String)(in.l_DOWNLOAD_FILE.get(index));
         if(in.l_OD_TYP_name != null && in.l_OD_TYP_name.size() > index)  m_OD_TYP_name = (String)(in.l_OD_TYP_name.get(index));
         if(in.l_OD_TYP_val != null && in.l_OD_TYP_val.size() > index)  m_OD_TYP_val = (String)(in.l_OD_TYP_val.get(index));
         if(in.l_OUTSIDE_TYP_name != null && in.l_OUTSIDE_TYP_name.size() > index)  m_OUTSIDE_TYP_name = (String)(in.l_OUTSIDE_TYP_name.get(index));
         if(in.l_OUTSIDE_TYP_val != null && in.l_OUTSIDE_TYP_val.size() > index)  m_OUTSIDE_TYP_val = (String)(in.l_OUTSIDE_TYP_val.get(index));
         if(in.l_ODR_STS_TYP_name != null && in.l_ODR_STS_TYP_name.size() > index)  m_ODR_STS_TYP_name = (String)(in.l_ODR_STS_TYP_name.get(index));
         if(in.l_ODR_STS_TYP_val != null && in.l_ODR_STS_TYP_val.size() > index)  m_ODR_STS_TYP_val = (String)(in.l_ODR_STS_TYP_val.get(index));
         if(in.l_DM_STS_TYP_name != null && in.l_DM_STS_TYP_name.size() > index)  m_DM_STS_TYP_name = (String)(in.l_DM_STS_TYP_name.get(index));
         if(in.l_DM_STS_TYP_val != null && in.l_DM_STS_TYP_val.size() > index)  m_DM_STS_TYP_val = (String)(in.l_DM_STS_TYP_val.get(index));
         return;
        }	
       
         
         /**
          * �R�s�[�R���X�g���N�^
          * @param struct �R�s�[�Ώ�
          */
          public AC0080010Struct(AC0080010Struct struct)
          {
            copy(struct);
          }
       
        //---------------------------------------------------------------------
        //}}user_implement_code

	//////////////////////////////

}
