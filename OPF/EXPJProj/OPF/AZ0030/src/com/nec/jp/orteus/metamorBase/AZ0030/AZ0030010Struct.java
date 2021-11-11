/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AZ0030/src/com/nec/jp/orteus/metamorBase/AZ0030/AZ0030010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AZ0030;

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

public class AZ0030010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_FROM_DATE */
	public String m_FROM_DATE = null;
	/** �� 2 �ϐ��F m_h_FROM_TIME */
	public String m_h_FROM_TIME = null;
	/** �� 3 �ϐ��F m_s_FROM_TIME */
	public String m_s_FROM_TIME = null;
	/** �� 4 �ϐ��F m_s_FROM_TIME_name */
	public String m_s_FROM_TIME_name = null;
	/** �� 5 �ϐ��F m_s_FROM_TIME_val */
	public String m_s_FROM_TIME_val = null;
	/** �� 6 �ϐ��F m_TO_DATE */
	public String m_TO_DATE = null;
	/** �� 7 �ϐ��F m_s_TO_TIME */
	public String m_s_TO_TIME = null;
	/** �� 8 �ϐ��F m_s_TO_TIME_name */
	public String m_s_TO_TIME_name = null;
	/** �� 9 �ϐ��F m_s_TO_TIME_val */
	public String m_s_TO_TIME_val = null;
	/** �� 10 �ϐ��F m_h_TO_TIME */
	public String m_h_TO_TIME = null;
	/** �� 11 �ϐ��F m_h_plant_flg */
	public Integer m_h_plant_flg = null;
	/** �� 12 �ϐ��F m_h_own_flg */
	public Integer m_h_own_flg = null;
	/** �� 13 �ϐ��F m_h_sort_flg */
	public Integer m_h_sort_flg = null;
	/** �� 14 �ϐ��F m_h_detail_flg */
	public Integer m_h_detail_flg = null;
	/** �� 15 �ϐ��F m_w_BUSINESS_NAME */
	public String m_w_BUSINESS_NAME = null;
	/** �� 16 �ϐ��F m_w_DATA_STRING */
	public String m_w_DATA_STRING = null;
	/** �� 17 �ϐ��F m_r_PLANT_ALL */
	public String m_r_PLANT_ALL = null;
	/** �� 18 �ϐ��F m_r_PLANT */
	public String m_r_PLANT = null;
	/** �� 19 �ϐ��F m_c_OWN */
	public String m_c_OWN = null;
	/** �� 20 �ϐ��F m_r_SORT_NEW */
	public String m_r_SORT_NEW = null;
	/** �� 21 �ϐ��F m_r_SORT_OLD */
	public String m_r_SORT_OLD = null;
	/** �� 22 �ϐ��F m_h_PLAN_TYP */
	public String m_h_PLAN_TYP = null;
	/** �� 23 �ϐ��F m_w_confirm_flg */
	public Integer m_w_confirm_flg = null;
	/** �� 24 �ϐ��F m_w_FROM_DATE */
	public String m_w_FROM_DATE = null;
	/** �� 25 �ϐ��F m_w_TO_DATE */
	public String m_w_TO_DATE = null;
	/** �� 26 �ϐ��F m_CONFIRM_DATE */
	public String m_CONFIRM_DATE = null;
	/** �� 27 �ϐ��F m_LOG_CD */
	public String m_LOG_CD = null;
	/** �� 28 �ϐ��F m_CREATED_DATE */
	public String m_CREATED_DATE = null;
	/** �� 29 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 30 �ϐ��F m_BUSINESS_NAME */
	public String m_BUSINESS_NAME = null;
	/** �� 31 �ϐ��F m_USER_CD */
	public String m_USER_CD = null;
	/** �� 32 �ϐ��F m_MSG */
	public String m_MSG = null;
	/** �� 33 �ϐ��F m_DATA_STRING */
	public String m_DATA_STRING = null;
	/** �� 34 �ϐ��F m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** �� 35 �ϐ��F m_USER_NAME */
	public String m_USER_NAME = null;
	/** �� 36 �ϐ��F m_w_LOG_CD */
	public String m_w_LOG_CD = null;
	/** �� 37 �ϐ��F m_l_COUNT */
	public String m_l_COUNT = null;
	/** �� 38 �ϐ��F m_ROW_COUNT */
	public String m_ROW_COUNT = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_FROM_DATE */
	public List l_FROM_DATE = null;

	/** �� 2 List�ϐ��F l_h_FROM_TIME */
	public List l_h_FROM_TIME = null;

	/** �� 3 List�ϐ��F l_s_FROM_TIME */
	public List l_s_FROM_TIME = null;

	/** �� 4 List�ϐ��F l_s_FROM_TIME_name */
	public List l_s_FROM_TIME_name = null;

	/** �� 5 List�ϐ��F l_s_FROM_TIME_val */
	public List l_s_FROM_TIME_val = null;

	/** �� 6 List�ϐ��F l_TO_DATE */
	public List l_TO_DATE = null;

	/** �� 7 List�ϐ��F l_s_TO_TIME */
	public List l_s_TO_TIME = null;

	/** �� 8 List�ϐ��F l_s_TO_TIME_name */
	public List l_s_TO_TIME_name = null;

	/** �� 9 List�ϐ��F l_s_TO_TIME_val */
	public List l_s_TO_TIME_val = null;

	/** �� 10 List�ϐ��F l_h_TO_TIME */
	public List l_h_TO_TIME = null;

	/** �� 11 List�ϐ��F l_h_plant_flg */
	public List l_h_plant_flg = null;

	/** �� 12 List�ϐ��F l_h_own_flg */
	public List l_h_own_flg = null;

	/** �� 13 List�ϐ��F l_h_sort_flg */
	public List l_h_sort_flg = null;

	/** �� 14 List�ϐ��F l_h_detail_flg */
	public List l_h_detail_flg = null;

	/** �� 15 List�ϐ��F l_w_BUSINESS_NAME */
	public List l_w_BUSINESS_NAME = null;

	/** �� 16 List�ϐ��F l_w_DATA_STRING */
	public List l_w_DATA_STRING = null;

	/** �� 17 List�ϐ��F l_r_PLANT_ALL */
	public List l_r_PLANT_ALL = null;

	/** �� 18 List�ϐ��F l_r_PLANT */
	public List l_r_PLANT = null;

	/** �� 19 List�ϐ��F l_c_OWN */
	public List l_c_OWN = null;

	/** �� 20 List�ϐ��F l_r_SORT_NEW */
	public List l_r_SORT_NEW = null;

	/** �� 21 List�ϐ��F l_r_SORT_OLD */
	public List l_r_SORT_OLD = null;

	/** �� 22 List�ϐ��F l_h_PLAN_TYP */
	public List l_h_PLAN_TYP = null;

	/** �� 23 List�ϐ��F l_w_confirm_flg */
	public List l_w_confirm_flg = null;

	/** �� 24 List�ϐ��F l_w_FROM_DATE */
	public List l_w_FROM_DATE = null;

	/** �� 25 List�ϐ��F l_w_TO_DATE */
	public List l_w_TO_DATE = null;

	/** �� 26 List�ϐ��F l_CONFIRM_DATE */
	public List l_CONFIRM_DATE = null;

	/** �� 27 List�ϐ��F l_LOG_CD */
	public List l_LOG_CD = null;

	/** �� 28 List�ϐ��F l_CREATED_DATE */
	public List l_CREATED_DATE = null;

	/** �� 29 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 30 List�ϐ��F l_BUSINESS_NAME */
	public List l_BUSINESS_NAME = null;

	/** �� 31 List�ϐ��F l_USER_CD */
	public List l_USER_CD = null;

	/** �� 32 List�ϐ��F l_MSG */
	public List l_MSG = null;

	/** �� 33 List�ϐ��F l_DATA_STRING */
	public List l_DATA_STRING = null;

	/** �� 34 List�ϐ��F l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** �� 35 List�ϐ��F l_USER_NAME */
	public List l_USER_NAME = null;

	/** �� 36 List�ϐ��F l_w_LOG_CD */
	public List l_w_LOG_CD = null;

	/** �� 37 List�ϐ��F l_l_COUNT */
	public List l_l_COUNT = null;

	/** �� 38 List�ϐ��F l_ROW_COUNT */
	public List l_ROW_COUNT = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getFROM_DATE() { return m_FROM_DATE; }
	public String geth_FROM_TIME() { return m_h_FROM_TIME; }
	public String gets_FROM_TIME() { return m_s_FROM_TIME; }
	public String gets_FROM_TIME_name() { return m_s_FROM_TIME_name; }
	public String gets_FROM_TIME_val() { return m_s_FROM_TIME_val; }
	public String getTO_DATE() { return m_TO_DATE; }
	public String gets_TO_TIME() { return m_s_TO_TIME; }
	public String gets_TO_TIME_name() { return m_s_TO_TIME_name; }
	public String gets_TO_TIME_val() { return m_s_TO_TIME_val; }
	public String geth_TO_TIME() { return m_h_TO_TIME; }
	public Integer geth_plant_flg() { return m_h_plant_flg; }
	public Integer geth_own_flg() { return m_h_own_flg; }
	public Integer geth_sort_flg() { return m_h_sort_flg; }
	public Integer geth_detail_flg() { return m_h_detail_flg; }
	public String getw_BUSINESS_NAME() { return m_w_BUSINESS_NAME; }
	public String getw_DATA_STRING() { return m_w_DATA_STRING; }
	public String getr_PLANT_ALL() { return m_r_PLANT_ALL; }
	public String getr_PLANT() { return m_r_PLANT; }
	public String getc_OWN() { return m_c_OWN; }
	public String getr_SORT_NEW() { return m_r_SORT_NEW; }
	public String getr_SORT_OLD() { return m_r_SORT_OLD; }
	public String geth_PLAN_TYP() { return m_h_PLAN_TYP; }
	public Integer getw_confirm_flg() { return m_w_confirm_flg; }
	public String getw_FROM_DATE() { return m_w_FROM_DATE; }
	public String getw_TO_DATE() { return m_w_TO_DATE; }
	public String getCONFIRM_DATE() { return m_CONFIRM_DATE; }
	public String getLOG_CD() { return m_LOG_CD; }
	public String getCREATED_DATE() { return m_CREATED_DATE; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getBUSINESS_NAME() { return m_BUSINESS_NAME; }
	public String getUSER_CD() { return m_USER_CD; }
	public String getMSG() { return m_MSG; }
	public String getDATA_STRING() { return m_DATA_STRING; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getUSER_NAME() { return m_USER_NAME; }
	public String getw_LOG_CD() { return m_w_LOG_CD; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }

	public List getList_FROM_DATE() { return l_FROM_DATE; }
	public List getList_h_FROM_TIME() { return l_h_FROM_TIME; }
	public List getList_s_FROM_TIME() { return l_s_FROM_TIME; }
	public List getList_s_FROM_TIME_name() { return l_s_FROM_TIME_name; }
	public List getList_s_FROM_TIME_val() { return l_s_FROM_TIME_val; }
	public List getList_TO_DATE() { return l_TO_DATE; }
	public List getList_s_TO_TIME() { return l_s_TO_TIME; }
	public List getList_s_TO_TIME_name() { return l_s_TO_TIME_name; }
	public List getList_s_TO_TIME_val() { return l_s_TO_TIME_val; }
	public List getList_h_TO_TIME() { return l_h_TO_TIME; }
	public List getList_h_plant_flg() { return l_h_plant_flg; }
	public List getList_h_own_flg() { return l_h_own_flg; }
	public List getList_h_sort_flg() { return l_h_sort_flg; }
	public List getList_h_detail_flg() { return l_h_detail_flg; }
	public List getList_w_BUSINESS_NAME() { return l_w_BUSINESS_NAME; }
	public List getList_w_DATA_STRING() { return l_w_DATA_STRING; }
	public List getList_r_PLANT_ALL() { return l_r_PLANT_ALL; }
	public List getList_r_PLANT() { return l_r_PLANT; }
	public List getList_c_OWN() { return l_c_OWN; }
	public List getList_r_SORT_NEW() { return l_r_SORT_NEW; }
	public List getList_r_SORT_OLD() { return l_r_SORT_OLD; }
	public List getList_h_PLAN_TYP() { return l_h_PLAN_TYP; }
	public List getList_w_confirm_flg() { return l_w_confirm_flg; }
	public List getList_w_FROM_DATE() { return l_w_FROM_DATE; }
	public List getList_w_TO_DATE() { return l_w_TO_DATE; }
	public List getList_CONFIRM_DATE() { return l_CONFIRM_DATE; }
	public List getList_LOG_CD() { return l_LOG_CD; }
	public List getList_CREATED_DATE() { return l_CREATED_DATE; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_BUSINESS_NAME() { return l_BUSINESS_NAME; }
	public List getList_USER_CD() { return l_USER_CD; }
	public List getList_MSG() { return l_MSG; }
	public List getList_DATA_STRING() { return l_DATA_STRING; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_USER_NAME() { return l_USER_NAME; }
	public List getList_w_LOG_CD() { return l_w_LOG_CD; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }

	public void setFROM_DATE(String val) { m_FROM_DATE = val; }
	public void seth_FROM_TIME(String val) { m_h_FROM_TIME = val; }
	public void sets_FROM_TIME(String val) { m_s_FROM_TIME = val; }
	public void sets_FROM_TIME_name(String val) { m_s_FROM_TIME_name = val; }
	public void sets_FROM_TIME_val(String val) { m_s_FROM_TIME_val = val; }
	public void setTO_DATE(String val) { m_TO_DATE = val; }
	public void sets_TO_TIME(String val) { m_s_TO_TIME = val; }
	public void sets_TO_TIME_name(String val) { m_s_TO_TIME_name = val; }
	public void sets_TO_TIME_val(String val) { m_s_TO_TIME_val = val; }
	public void seth_TO_TIME(String val) { m_h_TO_TIME = val; }
	public void seth_plant_flg(Integer val) { m_h_plant_flg = val; }
	public void seth_own_flg(Integer val) { m_h_own_flg = val; }
	public void seth_sort_flg(Integer val) { m_h_sort_flg = val; }
	public void seth_detail_flg(Integer val) { m_h_detail_flg = val; }
	public void setw_BUSINESS_NAME(String val) { m_w_BUSINESS_NAME = val; }
	public void setw_DATA_STRING(String val) { m_w_DATA_STRING = val; }
	public void setr_PLANT_ALL(String val) { m_r_PLANT_ALL = val; }
	public void setr_PLANT(String val) { m_r_PLANT = val; }
	public void setc_OWN(String val) { m_c_OWN = val; }
	public void setr_SORT_NEW(String val) { m_r_SORT_NEW = val; }
	public void setr_SORT_OLD(String val) { m_r_SORT_OLD = val; }
	public void seth_PLAN_TYP(String val) { m_h_PLAN_TYP = val; }
	public void setw_confirm_flg(Integer val) { m_w_confirm_flg = val; }
	public void setw_FROM_DATE(String val) { m_w_FROM_DATE = val; }
	public void setw_TO_DATE(String val) { m_w_TO_DATE = val; }
	public void setCONFIRM_DATE(String val) { m_CONFIRM_DATE = val; }
	public void setLOG_CD(String val) { m_LOG_CD = val; }
	public void setCREATED_DATE(String val) { m_CREATED_DATE = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setBUSINESS_NAME(String val) { m_BUSINESS_NAME = val; }
	public void setUSER_CD(String val) { m_USER_CD = val; }
	public void setMSG(String val) { m_MSG = val; }
	public void setDATA_STRING(String val) { m_DATA_STRING = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setUSER_NAME(String val) { m_USER_NAME = val; }
	public void setw_LOG_CD(String val) { m_w_LOG_CD = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }

	public void seth_plant_flg(String val) { m_h_plant_flg = getInteger(val); }
	public void seth_own_flg(String val) { m_h_own_flg = getInteger(val); }
	public void seth_sort_flg(String val) { m_h_sort_flg = getInteger(val); }
	public void seth_detail_flg(String val) { m_h_detail_flg = getInteger(val); }
	public void setw_confirm_flg(String val) { m_w_confirm_flg = getInteger(val); }

	public void setList_FROM_DATE(List list) { l_FROM_DATE = list; }
	public void setList_h_FROM_TIME(List list) { l_h_FROM_TIME = list; }
	public void setList_s_FROM_TIME(List list) { l_s_FROM_TIME = list; }
	public void setList_s_FROM_TIME_name(List list) { l_s_FROM_TIME_name = list; }
	public void setList_s_FROM_TIME_val(List list) { l_s_FROM_TIME_val = list; }
	public void setList_TO_DATE(List list) { l_TO_DATE = list; }
	public void setList_s_TO_TIME(List list) { l_s_TO_TIME = list; }
	public void setList_s_TO_TIME_name(List list) { l_s_TO_TIME_name = list; }
	public void setList_s_TO_TIME_val(List list) { l_s_TO_TIME_val = list; }
	public void setList_h_TO_TIME(List list) { l_h_TO_TIME = list; }
	public void setList_h_plant_flg(List list) { l_h_plant_flg = list; }
	public void setList_h_own_flg(List list) { l_h_own_flg = list; }
	public void setList_h_sort_flg(List list) { l_h_sort_flg = list; }
	public void setList_h_detail_flg(List list) { l_h_detail_flg = list; }
	public void setList_w_BUSINESS_NAME(List list) { l_w_BUSINESS_NAME = list; }
	public void setList_w_DATA_STRING(List list) { l_w_DATA_STRING = list; }
	public void setList_r_PLANT_ALL(List list) { l_r_PLANT_ALL = list; }
	public void setList_r_PLANT(List list) { l_r_PLANT = list; }
	public void setList_c_OWN(List list) { l_c_OWN = list; }
	public void setList_r_SORT_NEW(List list) { l_r_SORT_NEW = list; }
	public void setList_r_SORT_OLD(List list) { l_r_SORT_OLD = list; }
	public void setList_h_PLAN_TYP(List list) { l_h_PLAN_TYP = list; }
	public void setList_w_confirm_flg(List list) { l_w_confirm_flg = list; }
	public void setList_w_FROM_DATE(List list) { l_w_FROM_DATE = list; }
	public void setList_w_TO_DATE(List list) { l_w_TO_DATE = list; }
	public void setList_CONFIRM_DATE(List list) { l_CONFIRM_DATE = list; }
	public void setList_LOG_CD(List list) { l_LOG_CD = list; }
	public void setList_CREATED_DATE(List list) { l_CREATED_DATE = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_BUSINESS_NAME(List list) { l_BUSINESS_NAME = list; }
	public void setList_USER_CD(List list) { l_USER_CD = list; }
	public void setList_MSG(List list) { l_MSG = list; }
	public void setList_DATA_STRING(List list) { l_DATA_STRING = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_USER_NAME(List list) { l_USER_NAME = list; }
	public void setList_w_LOG_CD(List list) { l_w_LOG_CD = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }

	public int setL2L_FROM_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FROM_DATE == null) {
			l_FROM_DATE = new ArrayList();
		} else {
			l_FROM_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FROM_DATE.add(((AZ0030010Struct) list.get(i)).getFROM_DATE());
		}
		return size;
	}
	public int setL2L_h_FROM_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_FROM_TIME == null) {
			l_h_FROM_TIME = new ArrayList();
		} else {
			l_h_FROM_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_FROM_TIME.add(((AZ0030010Struct) list.get(i)).geth_FROM_TIME());
		}
		return size;
	}
	public int setL2L_s_FROM_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_FROM_TIME == null) {
			l_s_FROM_TIME = new ArrayList();
		} else {
			l_s_FROM_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_FROM_TIME.add(((AZ0030010Struct) list.get(i)).gets_FROM_TIME());
		}
		return size;
	}
	public int setL2L_s_FROM_TIME_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_FROM_TIME_name == null) {
			l_s_FROM_TIME_name = new ArrayList();
		} else {
			l_s_FROM_TIME_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_FROM_TIME_name.add(((AZ0030010Struct) list.get(i)).gets_FROM_TIME_name());
		}
		return size;
	}
	public int setL2L_s_FROM_TIME_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_FROM_TIME_val == null) {
			l_s_FROM_TIME_val = new ArrayList();
		} else {
			l_s_FROM_TIME_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_FROM_TIME_val.add(((AZ0030010Struct) list.get(i)).gets_FROM_TIME_val());
		}
		return size;
	}
	public int setL2L_TO_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TO_DATE == null) {
			l_TO_DATE = new ArrayList();
		} else {
			l_TO_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TO_DATE.add(((AZ0030010Struct) list.get(i)).getTO_DATE());
		}
		return size;
	}
	public int setL2L_s_TO_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_TO_TIME == null) {
			l_s_TO_TIME = new ArrayList();
		} else {
			l_s_TO_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_TO_TIME.add(((AZ0030010Struct) list.get(i)).gets_TO_TIME());
		}
		return size;
	}
	public int setL2L_s_TO_TIME_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_TO_TIME_name == null) {
			l_s_TO_TIME_name = new ArrayList();
		} else {
			l_s_TO_TIME_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_TO_TIME_name.add(((AZ0030010Struct) list.get(i)).gets_TO_TIME_name());
		}
		return size;
	}
	public int setL2L_s_TO_TIME_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_TO_TIME_val == null) {
			l_s_TO_TIME_val = new ArrayList();
		} else {
			l_s_TO_TIME_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_TO_TIME_val.add(((AZ0030010Struct) list.get(i)).gets_TO_TIME_val());
		}
		return size;
	}
	public int setL2L_h_TO_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_TO_TIME == null) {
			l_h_TO_TIME = new ArrayList();
		} else {
			l_h_TO_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_TO_TIME.add(((AZ0030010Struct) list.get(i)).geth_TO_TIME());
		}
		return size;
	}
	public int setL2L_h_plant_flg(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_plant_flg == null) {
			l_h_plant_flg = new ArrayList();
		} else {
			l_h_plant_flg.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_plant_flg.add(((AZ0030010Struct) list.get(i)).geth_plant_flg());
		}
		return size;
	}
	public int setL2L_h_own_flg(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_own_flg == null) {
			l_h_own_flg = new ArrayList();
		} else {
			l_h_own_flg.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_own_flg.add(((AZ0030010Struct) list.get(i)).geth_own_flg());
		}
		return size;
	}
	public int setL2L_h_sort_flg(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_sort_flg == null) {
			l_h_sort_flg = new ArrayList();
		} else {
			l_h_sort_flg.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_sort_flg.add(((AZ0030010Struct) list.get(i)).geth_sort_flg());
		}
		return size;
	}
	public int setL2L_h_detail_flg(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_detail_flg == null) {
			l_h_detail_flg = new ArrayList();
		} else {
			l_h_detail_flg.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_detail_flg.add(((AZ0030010Struct) list.get(i)).geth_detail_flg());
		}
		return size;
	}
	public int setL2L_w_BUSINESS_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_BUSINESS_NAME == null) {
			l_w_BUSINESS_NAME = new ArrayList();
		} else {
			l_w_BUSINESS_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_BUSINESS_NAME.add(((AZ0030010Struct) list.get(i)).getw_BUSINESS_NAME());
		}
		return size;
	}
	public int setL2L_w_DATA_STRING(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_DATA_STRING == null) {
			l_w_DATA_STRING = new ArrayList();
		} else {
			l_w_DATA_STRING.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_DATA_STRING.add(((AZ0030010Struct) list.get(i)).getw_DATA_STRING());
		}
		return size;
	}
	public int setL2L_r_PLANT_ALL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r_PLANT_ALL == null) {
			l_r_PLANT_ALL = new ArrayList();
		} else {
			l_r_PLANT_ALL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r_PLANT_ALL.add(((AZ0030010Struct) list.get(i)).getr_PLANT_ALL());
		}
		return size;
	}
	public int setL2L_r_PLANT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r_PLANT == null) {
			l_r_PLANT = new ArrayList();
		} else {
			l_r_PLANT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r_PLANT.add(((AZ0030010Struct) list.get(i)).getr_PLANT());
		}
		return size;
	}
	public int setL2L_c_OWN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_OWN == null) {
			l_c_OWN = new ArrayList();
		} else {
			l_c_OWN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_OWN.add(((AZ0030010Struct) list.get(i)).getc_OWN());
		}
		return size;
	}
	public int setL2L_r_SORT_NEW(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r_SORT_NEW == null) {
			l_r_SORT_NEW = new ArrayList();
		} else {
			l_r_SORT_NEW.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r_SORT_NEW.add(((AZ0030010Struct) list.get(i)).getr_SORT_NEW());
		}
		return size;
	}
	public int setL2L_r_SORT_OLD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r_SORT_OLD == null) {
			l_r_SORT_OLD = new ArrayList();
		} else {
			l_r_SORT_OLD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r_SORT_OLD.add(((AZ0030010Struct) list.get(i)).getr_SORT_OLD());
		}
		return size;
	}
	public int setL2L_h_PLAN_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PLAN_TYP == null) {
			l_h_PLAN_TYP = new ArrayList();
		} else {
			l_h_PLAN_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PLAN_TYP.add(((AZ0030010Struct) list.get(i)).geth_PLAN_TYP());
		}
		return size;
	}
	public int setL2L_w_confirm_flg(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_confirm_flg == null) {
			l_w_confirm_flg = new ArrayList();
		} else {
			l_w_confirm_flg.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_confirm_flg.add(((AZ0030010Struct) list.get(i)).getw_confirm_flg());
		}
		return size;
	}
	public int setL2L_w_FROM_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_FROM_DATE == null) {
			l_w_FROM_DATE = new ArrayList();
		} else {
			l_w_FROM_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_FROM_DATE.add(((AZ0030010Struct) list.get(i)).getw_FROM_DATE());
		}
		return size;
	}
	public int setL2L_w_TO_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_TO_DATE == null) {
			l_w_TO_DATE = new ArrayList();
		} else {
			l_w_TO_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_TO_DATE.add(((AZ0030010Struct) list.get(i)).getw_TO_DATE());
		}
		return size;
	}
	public int setL2L_CONFIRM_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CONFIRM_DATE == null) {
			l_CONFIRM_DATE = new ArrayList();
		} else {
			l_CONFIRM_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CONFIRM_DATE.add(((AZ0030010Struct) list.get(i)).getCONFIRM_DATE());
		}
		return size;
	}
	public int setL2L_LOG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOG_CD == null) {
			l_LOG_CD = new ArrayList();
		} else {
			l_LOG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOG_CD.add(((AZ0030010Struct) list.get(i)).getLOG_CD());
		}
		return size;
	}
	public int setL2L_CREATED_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CREATED_DATE == null) {
			l_CREATED_DATE = new ArrayList();
		} else {
			l_CREATED_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CREATED_DATE.add(((AZ0030010Struct) list.get(i)).getCREATED_DATE());
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
			l_PLANT_CD.add(((AZ0030010Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_BUSINESS_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BUSINESS_NAME == null) {
			l_BUSINESS_NAME = new ArrayList();
		} else {
			l_BUSINESS_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BUSINESS_NAME.add(((AZ0030010Struct) list.get(i)).getBUSINESS_NAME());
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
			l_USER_CD.add(((AZ0030010Struct) list.get(i)).getUSER_CD());
		}
		return size;
	}
	public int setL2L_MSG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MSG == null) {
			l_MSG = new ArrayList();
		} else {
			l_MSG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MSG.add(((AZ0030010Struct) list.get(i)).getMSG());
		}
		return size;
	}
	public int setL2L_DATA_STRING(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DATA_STRING == null) {
			l_DATA_STRING = new ArrayList();
		} else {
			l_DATA_STRING.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DATA_STRING.add(((AZ0030010Struct) list.get(i)).getDATA_STRING());
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
			l_PLANT_NAME.add(((AZ0030010Struct) list.get(i)).getPLANT_NAME());
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
			l_USER_NAME.add(((AZ0030010Struct) list.get(i)).getUSER_NAME());
		}
		return size;
	}
	public int setL2L_w_LOG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_LOG_CD == null) {
			l_w_LOG_CD = new ArrayList();
		} else {
			l_w_LOG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_LOG_CD.add(((AZ0030010Struct) list.get(i)).getw_LOG_CD());
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
			l_l_COUNT.add(((AZ0030010Struct) list.get(i)).getl_COUNT());
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
			l_ROW_COUNT.add(((AZ0030010Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_FROM_DATE = null;
		m_h_FROM_TIME = null;
		m_s_FROM_TIME = null;
		m_s_FROM_TIME_name = null;
		m_s_FROM_TIME_val = null;
		m_TO_DATE = null;
		m_s_TO_TIME = null;
		m_s_TO_TIME_name = null;
		m_s_TO_TIME_val = null;
		m_h_TO_TIME = null;
		m_h_plant_flg = null;
		m_h_own_flg = null;
		m_h_sort_flg = null;
		m_h_detail_flg = null;
		m_w_BUSINESS_NAME = null;
		m_w_DATA_STRING = null;
		m_r_PLANT_ALL = null;
		m_r_PLANT = null;
		m_c_OWN = null;
		m_r_SORT_NEW = null;
		m_r_SORT_OLD = null;
		m_h_PLAN_TYP = null;
		m_w_confirm_flg = null;
		m_w_FROM_DATE = null;
		m_w_TO_DATE = null;
		m_CONFIRM_DATE = null;
		m_LOG_CD = null;
		m_CREATED_DATE = null;
		m_PLANT_CD = null;
		m_BUSINESS_NAME = null;
		m_USER_CD = null;
		m_MSG = null;
		m_DATA_STRING = null;
		m_PLANT_NAME = null;
		m_USER_NAME = null;
		m_w_LOG_CD = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;

		l_FROM_DATE = null;
		l_h_FROM_TIME = null;
		l_s_FROM_TIME = null;
		l_s_FROM_TIME_name = null;
		l_s_FROM_TIME_val = null;
		l_TO_DATE = null;
		l_s_TO_TIME = null;
		l_s_TO_TIME_name = null;
		l_s_TO_TIME_val = null;
		l_h_TO_TIME = null;
		l_h_plant_flg = null;
		l_h_own_flg = null;
		l_h_sort_flg = null;
		l_h_detail_flg = null;
		l_w_BUSINESS_NAME = null;
		l_w_DATA_STRING = null;
		l_r_PLANT_ALL = null;
		l_r_PLANT = null;
		l_c_OWN = null;
		l_r_SORT_NEW = null;
		l_r_SORT_OLD = null;
		l_h_PLAN_TYP = null;
		l_w_confirm_flg = null;
		l_w_FROM_DATE = null;
		l_w_TO_DATE = null;
		l_CONFIRM_DATE = null;
		l_LOG_CD = null;
		l_CREATED_DATE = null;
		l_PLANT_CD = null;
		l_BUSINESS_NAME = null;
		l_USER_CD = null;
		l_MSG = null;
		l_DATA_STRING = null;
		l_PLANT_NAME = null;
		l_USER_NAME = null;
		l_w_LOG_CD = null;
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
	 * medAZ0030010�N���X�̕W���R���X�g���N�^
	 */
	public AZ0030010Struct()
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
	public void setStruct(AZ0030010Struct struct)
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
	public void setStructM(AZ0030010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setFROM_DATE(struct.getFROM_DATE());
			this.seth_FROM_TIME(struct.geth_FROM_TIME());
			this.sets_FROM_TIME(struct.gets_FROM_TIME());
			this.sets_FROM_TIME_name(struct.gets_FROM_TIME_name());
			this.sets_FROM_TIME_val(struct.gets_FROM_TIME_val());
			this.setTO_DATE(struct.getTO_DATE());
			this.sets_TO_TIME(struct.gets_TO_TIME());
			this.sets_TO_TIME_name(struct.gets_TO_TIME_name());
			this.sets_TO_TIME_val(struct.gets_TO_TIME_val());
			this.seth_TO_TIME(struct.geth_TO_TIME());
			this.seth_plant_flg(struct.geth_plant_flg());
			this.seth_own_flg(struct.geth_own_flg());
			this.seth_sort_flg(struct.geth_sort_flg());
			this.seth_detail_flg(struct.geth_detail_flg());
			this.setw_BUSINESS_NAME(struct.getw_BUSINESS_NAME());
			this.setw_DATA_STRING(struct.getw_DATA_STRING());
			this.setr_PLANT_ALL(struct.getr_PLANT_ALL());
			this.setr_PLANT(struct.getr_PLANT());
			this.setc_OWN(struct.getc_OWN());
			this.setr_SORT_NEW(struct.getr_SORT_NEW());
			this.setr_SORT_OLD(struct.getr_SORT_OLD());
			this.seth_PLAN_TYP(struct.geth_PLAN_TYP());
			this.setw_confirm_flg(struct.getw_confirm_flg());
			this.setw_FROM_DATE(struct.getw_FROM_DATE());
			this.setw_TO_DATE(struct.getw_TO_DATE());
			this.setCONFIRM_DATE(struct.getCONFIRM_DATE());
			this.setLOG_CD(struct.getLOG_CD());
			this.setCREATED_DATE(struct.getCREATED_DATE());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setBUSINESS_NAME(struct.getBUSINESS_NAME());
			this.setUSER_CD(struct.getUSER_CD());
			this.setMSG(struct.getMSG());
			this.setDATA_STRING(struct.getDATA_STRING());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.setUSER_NAME(struct.getUSER_NAME());
			this.setw_LOG_CD(struct.getw_LOG_CD());
			this.setl_COUNT(struct.getl_COUNT());
			this.setROW_COUNT(struct.getROW_COUNT());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AZ0030010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_FROM_DATE(struct.getList_FROM_DATE());
			this.setList_h_FROM_TIME(struct.getList_h_FROM_TIME());
			this.setList_s_FROM_TIME(struct.getList_s_FROM_TIME());
			this.setList_s_FROM_TIME_name(struct.getList_s_FROM_TIME_name());
			this.setList_s_FROM_TIME_val(struct.getList_s_FROM_TIME_val());
			this.setList_TO_DATE(struct.getList_TO_DATE());
			this.setList_s_TO_TIME(struct.getList_s_TO_TIME());
			this.setList_s_TO_TIME_name(struct.getList_s_TO_TIME_name());
			this.setList_s_TO_TIME_val(struct.getList_s_TO_TIME_val());
			this.setList_h_TO_TIME(struct.getList_h_TO_TIME());
			this.setList_h_plant_flg(struct.getList_h_plant_flg());
			this.setList_h_own_flg(struct.getList_h_own_flg());
			this.setList_h_sort_flg(struct.getList_h_sort_flg());
			this.setList_h_detail_flg(struct.getList_h_detail_flg());
			this.setList_w_BUSINESS_NAME(struct.getList_w_BUSINESS_NAME());
			this.setList_w_DATA_STRING(struct.getList_w_DATA_STRING());
			this.setList_r_PLANT_ALL(struct.getList_r_PLANT_ALL());
			this.setList_r_PLANT(struct.getList_r_PLANT());
			this.setList_c_OWN(struct.getList_c_OWN());
			this.setList_r_SORT_NEW(struct.getList_r_SORT_NEW());
			this.setList_r_SORT_OLD(struct.getList_r_SORT_OLD());
			this.setList_h_PLAN_TYP(struct.getList_h_PLAN_TYP());
			this.setList_w_confirm_flg(struct.getList_w_confirm_flg());
			this.setList_w_FROM_DATE(struct.getList_w_FROM_DATE());
			this.setList_w_TO_DATE(struct.getList_w_TO_DATE());
			this.setList_CONFIRM_DATE(struct.getList_CONFIRM_DATE());
			this.setList_LOG_CD(struct.getList_LOG_CD());
			this.setList_CREATED_DATE(struct.getList_CREATED_DATE());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_BUSINESS_NAME(struct.getList_BUSINESS_NAME());
			this.setList_USER_CD(struct.getList_USER_CD());
			this.setList_MSG(struct.getList_MSG());
			this.setList_DATA_STRING(struct.getList_DATA_STRING());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_USER_NAME(struct.getList_USER_NAME());
			this.setList_w_LOG_CD(struct.getList_w_LOG_CD());
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
	// �� 1 �ϐ������l�F i_FROM_DATE


	final static String i_FROM_DATE = null;

	// �� 2 �ϐ������l�F i_h_FROM_TIME


	final static String i_h_FROM_TIME = null;

	// �� 3 �ϐ������l�F i_s_FROM_TIME


	final static String i_s_FROM_TIME = null;

	// �� 4 �ϐ������l�F i_s_FROM_TIME_name


	final static String i_s_FROM_TIME_name = null;

	// �� 5 �ϐ������l�F i_s_FROM_TIME_val


	final static String i_s_FROM_TIME_val = null;

	// �� 6 �ϐ������l�F i_TO_DATE


	final static String i_TO_DATE = null;

	// �� 7 �ϐ������l�F i_s_TO_TIME


	final static String i_s_TO_TIME = null;

	// �� 8 �ϐ������l�F i_s_TO_TIME_name


	final static String i_s_TO_TIME_name = null;

	// �� 9 �ϐ������l�F i_s_TO_TIME_val


	final static String i_s_TO_TIME_val = null;

	// �� 10 �ϐ������l�F i_h_TO_TIME


	final static String i_h_TO_TIME = null;

	// �� 11 �ϐ������l�F i_h_plant_flg


	final static Integer i_h_plant_flg = null;

	// �� 12 �ϐ������l�F i_h_own_flg


	final static Integer i_h_own_flg = null;

	// �� 13 �ϐ������l�F i_h_sort_flg


	final static Integer i_h_sort_flg = null;

	// �� 14 �ϐ������l�F i_h_detail_flg


	final static Integer i_h_detail_flg = null;

	// �� 15 �ϐ������l�F i_w_BUSINESS_NAME


	final static String i_w_BUSINESS_NAME = null;

	// �� 16 �ϐ������l�F i_w_DATA_STRING


	final static String i_w_DATA_STRING = null;

	// �� 17 �ϐ������l�F i_r_PLANT_ALL


	final static String i_r_PLANT_ALL = null;

	// �� 18 �ϐ������l�F i_r_PLANT


	final static String i_r_PLANT = null;

	// �� 19 �ϐ������l�F i_c_OWN


	final static String i_c_OWN = null;

	// �� 20 �ϐ������l�F i_r_SORT_NEW


	final static String i_r_SORT_NEW = null;

	// �� 21 �ϐ������l�F i_r_SORT_OLD


	final static String i_r_SORT_OLD = null;

	// �� 22 �ϐ������l�F i_h_PLAN_TYP


	final static String i_h_PLAN_TYP = null;

	// �� 23 �ϐ������l�F i_w_confirm_flg


	final static Integer i_w_confirm_flg = null;

	// �� 24 �ϐ������l�F i_w_FROM_DATE


	final static String i_w_FROM_DATE = null;

	// �� 25 �ϐ������l�F i_w_TO_DATE


	final static String i_w_TO_DATE = null;

	// �� 26 �ϐ������l�F i_CONFIRM_DATE


	final static String i_CONFIRM_DATE = null;

	// �� 27 �ϐ������l�F i_LOG_CD


	final static String i_LOG_CD = null;

	// �� 28 �ϐ������l�F i_CREATED_DATE


	final static String i_CREATED_DATE = null;

	// �� 29 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 30 �ϐ������l�F i_BUSINESS_NAME


	final static String i_BUSINESS_NAME = null;

	// �� 31 �ϐ������l�F i_USER_CD


	final static String i_USER_CD = null;

	// �� 32 �ϐ������l�F i_MSG


	final static String i_MSG = null;

	// �� 33 �ϐ������l�F i_DATA_STRING


	final static String i_DATA_STRING = null;

	// �� 34 �ϐ������l�F i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// �� 35 �ϐ������l�F i_USER_NAME


	final static String i_USER_NAME = null;

	// �� 36 �ϐ������l�F i_w_LOG_CD


	final static String i_w_LOG_CD = null;

	// �� 37 �ϐ������l�F i_l_COUNT


	final static String i_l_COUNT = null;

	// �� 38 �ϐ������l�F i_ROW_COUNT


	final static String i_ROW_COUNT = null;

*/

	//{{user_implement_code
        //------------------------------------------------------------------
       
        /**
         * ������
         */
        public void initialize()
        {
         clear();
       
         m_s_FROM_TIME = "0";
         m_s_TO_TIME = "23";
         m_h_plant_flg =  new Integer(1);
         m_h_own_flg =  new Integer(0);
         m_h_sort_flg =  new Integer(0);
         m_h_detail_flg =  new Integer(0);
         m_w_confirm_flg = new Integer(0);
        }
         
        /**	
         * �����̏��̕ێ����郊�X�g�̕ϐ�����w��̏��̃f�[�^���擾	
         * @param in ���X�g�ێ��̏��	
         * @param index ����	
         */	
        public void importData(AZ0030010Struct in, int index)	
        {	
         clear();
         if(in.l_CONFIRM_DATE != null && in.l_CONFIRM_DATE.size() > index)  m_CONFIRM_DATE = (String)(in.l_CONFIRM_DATE.get(index));
         if(in.l_LOG_CD != null && in.l_LOG_CD.size() > index)  m_LOG_CD = (String)(in.l_LOG_CD.get(index));
         if(in.l_CREATED_DATE != null && in.l_CREATED_DATE.size() > index)  m_CREATED_DATE = (String)(in.l_CREATED_DATE.get(index));
         if(in.l_PLANT_CD != null && in.l_PLANT_CD.size() > index)  m_PLANT_CD = (String)(in.l_PLANT_CD.get(index));
         if(in.l_BUSINESS_NAME != null && in.l_BUSINESS_NAME.size() > index)  m_BUSINESS_NAME = (String)(in.l_BUSINESS_NAME.get(index));
         if(in.l_USER_CD != null && in.l_USER_CD.size() > index)  m_USER_CD = (String)(in.l_USER_CD.get(index));
         if(in.l_MSG != null && in.l_MSG.size() > index)  m_MSG = (String)(in.l_MSG.get(index));
         if(in.l_DATA_STRING != null && in.l_DATA_STRING.size() > index)  m_DATA_STRING = (String)(in.l_DATA_STRING.get(index));
         if(in.l_PLANT_NAME != null && in.l_PLANT_NAME.size() > index)  m_PLANT_NAME = (String)(in.l_PLANT_NAME.get(index));
         if(in.l_USER_NAME != null && in.l_USER_NAME.size() > index)  m_USER_NAME = (String)(in.l_USER_NAME.get(index));
         if(in.l_w_FROM_DATE != null && in.l_w_FROM_DATE.size() > index)  m_w_FROM_DATE = (String)(in.l_w_FROM_DATE.get(index));
         if(in.l_w_TO_DATE != null && in.l_w_TO_DATE.size() > index)  m_w_TO_DATE = (String)(in.l_w_TO_DATE.get(index));
         if(in.l_FROM_DATE != null && in.l_FROM_DATE.size() > index)  m_FROM_DATE = (String)(in.l_FROM_DATE.get(index));
         if(in.l_h_FROM_TIME != null && in.l_h_FROM_TIME.size() > index)  m_h_FROM_TIME = (String)(in.l_h_FROM_TIME.get(index));
         if(in.l_s_FROM_TIME != null && in.l_s_FROM_TIME.size() > index)  m_s_FROM_TIME = (String)(in.l_s_FROM_TIME.get(index));
         if(in.l_s_FROM_TIME_name != null && in.l_s_FROM_TIME_name.size() > index)  m_s_FROM_TIME_name = (String)(in.l_s_FROM_TIME_name.get(index));
         if(in.l_s_FROM_TIME_val != null && in.l_s_FROM_TIME_val.size() > index)  m_s_FROM_TIME_val = (String)(in.l_s_FROM_TIME_val.get(index));
         if(in.l_TO_DATE != null && in.l_TO_DATE.size() > index)  m_TO_DATE = (String)(in.l_TO_DATE.get(index));
         if(in.l_s_TO_TIME != null && in.l_s_TO_TIME.size() > index)  m_s_TO_TIME = (String)(in.l_s_TO_TIME.get(index));
         if(in.l_s_TO_TIME_name != null && in.l_s_TO_TIME_name.size() > index)  m_s_TO_TIME_name = (String)(in.l_s_TO_TIME_name.get(index));
         if(in.l_s_TO_TIME_val != null && in.l_s_TO_TIME_val.size() > index)  m_s_TO_TIME_val = (String)(in.l_s_TO_TIME_val.get(index));
         if(in.l_h_TO_TIME != null && in.l_h_TO_TIME.size() > index)  m_h_TO_TIME = (String)(in.l_h_TO_TIME.get(index));
         if(in.l_w_BUSINESS_NAME != null && in.l_w_BUSINESS_NAME.size() > index)  m_w_BUSINESS_NAME = (String)(in.l_w_BUSINESS_NAME.get(index));
         if(in.l_w_DATA_STRING != null && in.l_w_DATA_STRING.size() > index)  m_w_DATA_STRING = (String)(in.l_w_DATA_STRING.get(index));
         if(in.l_r_PLANT_ALL != null && in.l_r_PLANT_ALL.size() > index)  m_r_PLANT_ALL = (String)(in.l_r_PLANT_ALL.get(index));
         if(in.l_r_PLANT != null && in.l_r_PLANT.size() > index)  m_r_PLANT = (String)(in.l_r_PLANT.get(index));
         if(in.l_c_OWN != null && in.l_c_OWN.size() > index)  m_c_OWN = (String)(in.l_c_OWN.get(index));
         if(in.l_r_SORT_NEW != null && in.l_r_SORT_NEW.size() > index)  m_r_SORT_NEW = (String)(in.l_r_SORT_NEW.get(index));
         if(in.l_r_SORT_OLD != null && in.l_r_SORT_OLD.size() > index)  m_r_SORT_OLD = (String)(in.l_r_SORT_OLD.get(index));
         return;
        }	
         
        /**	
         * �������ϐ��̃R�s�[	
         * @param s �R�s�[��	
         */	
        public void copy(AZ0030010Struct s)	
        {	
         clear();
         if(s.sUser_ID != null) sUser_ID = new String(s.sUser_ID);
         if(s.sSysdate != null) sSysdate = new String(s.sSysdate);
         if(s.m_CONFIRM_DATE != null) m_CONFIRM_DATE = new String(s.m_CONFIRM_DATE);
         if(s.m_LOG_CD != null) m_LOG_CD = new String(s.m_LOG_CD);
         if(s.m_CREATED_DATE != null) m_CREATED_DATE = new String(s.m_CREATED_DATE);
         if(s.m_PLANT_CD != null) m_PLANT_CD = new String(s.m_PLANT_CD);
         if(s.m_BUSINESS_NAME != null) m_BUSINESS_NAME = new String(s.m_BUSINESS_NAME);
         if(s.m_USER_CD != null) m_USER_CD = new String(s.m_USER_CD);
         if(s.m_MSG != null) m_MSG = new String(s.m_MSG);
         if(s.m_DATA_STRING != null) m_DATA_STRING = new String(s.m_DATA_STRING);
         if(s.m_PLANT_NAME != null) m_PLANT_NAME = new String(s.m_PLANT_NAME);
         if(s.m_USER_NAME != null) m_USER_NAME = new String(s.m_USER_NAME);
         if(s.m_w_FROM_DATE != null) m_w_FROM_DATE = new String(s.m_w_FROM_DATE);
         if(s.m_w_TO_DATE != null) m_w_TO_DATE = new String(s.m_w_TO_DATE);
         if(s.m_FROM_DATE != null) m_FROM_DATE = new String(s.m_FROM_DATE);
         if(s.m_h_FROM_TIME != null) m_h_FROM_TIME = new String(s.m_h_FROM_TIME);
         if(s.m_s_FROM_TIME != null) m_s_FROM_TIME = new String(s.m_s_FROM_TIME);
         if(s.m_s_FROM_TIME_name != null) m_s_FROM_TIME_name = new String(s.m_s_FROM_TIME_name);
         if(s.m_s_FROM_TIME_val != null) m_s_FROM_TIME_val = new String(s.m_s_FROM_TIME_val);
         if(s.m_TO_DATE != null) m_TO_DATE = new String(s.m_TO_DATE);
         if(s.m_s_TO_TIME != null) m_s_TO_TIME = new String(s.m_s_TO_TIME);
         if(s.m_s_TO_TIME_name != null) m_s_TO_TIME_name = new String(s.m_s_TO_TIME_name);
         if(s.m_s_TO_TIME_val != null) m_s_TO_TIME_val = new String(s.m_s_TO_TIME_val);
         if(s.m_h_TO_TIME != null) m_h_TO_TIME = new String(s.m_h_TO_TIME);
         if(s.m_h_plant_flg != null) m_h_plant_flg = new Integer(s.m_h_plant_flg.intValue());
         if(s.m_h_own_flg != null) m_h_own_flg = new Integer(s.m_h_own_flg.intValue());
         if(s.m_h_sort_flg != null) m_h_sort_flg = new Integer(s.m_h_sort_flg.intValue());
         if(s.m_h_detail_flg != null) m_h_detail_flg = new Integer(s.m_h_detail_flg.intValue());
         if(s.m_w_BUSINESS_NAME != null) m_w_BUSINESS_NAME = new String(s.m_w_BUSINESS_NAME);
         if(s.m_w_DATA_STRING != null) m_w_DATA_STRING = new String(s.m_w_DATA_STRING);
         if(s.m_r_PLANT_ALL != null) m_r_PLANT_ALL = new String(s.m_r_PLANT_ALL);
         if(s.m_r_PLANT != null) m_r_PLANT = new String(s.m_r_PLANT);
         if(s.m_c_OWN != null) m_c_OWN = new String(s.m_c_OWN);
         if(s.m_r_SORT_NEW != null) m_r_SORT_NEW = new String(s.m_r_SORT_NEW);
         if(s.m_r_SORT_OLD != null) m_r_SORT_OLD = new String(s.m_r_SORT_OLD);
         if(s.m_h_PLAN_TYP != null) m_h_PLAN_TYP = new String(s.m_h_PLAN_TYP);
         if(s.m_w_confirm_flg != null) m_w_confirm_flg = new Integer(s.m_w_confirm_flg.intValue());
        }	
       
         
        //------------------------------------------------------------------
        //}}user_implement_code

	//////////////////////////////

}
