/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KA0040/src/com/nec/jp/orteus/metamorBase/KA0040/KA0040010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.KA0040;

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

public class KA0040010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_p_UNIT_COST_TYP_name */
	public String m_p_UNIT_COST_TYP_name = null;
	/** �� 2 �ϐ��F m_p_UNIT_COST_TYP_val */
	public Integer m_p_UNIT_COST_TYP_val = null;
	/** �� 3 �ϐ��F m_p_UNIT_COST_NAME */
	public String m_p_UNIT_COST_NAME = null;
	/** �� 4 �ϐ��F m_h_SCREENMOVE_TYP */
	public String m_h_SCREENMOVE_TYP = null;
	/** �� 5 �ϐ��F m_h_APPR_ID */
	public String m_h_APPR_ID = null;
	/** �� 6 �ϐ��F m_p_APPR_REMARKS */
	public String m_p_APPR_REMARKS = null;
	/** �� 7 �ϐ��F m_h_APR_UNIT_COST */
	public String m_h_APR_UNIT_COST = null;
	/** �� 8 �ϐ��F m_w_PLANT_CD */
	public String m_w_PLANT_CD = null;
	/** �� 9 �ϐ��F m_w_REC_COUNT */
	public Integer m_w_REC_COUNT = null;
	/** �� 10 �ϐ��F m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** �� 11 �ϐ��F m_CUST_CD */
	public String m_CUST_CD = null;
	/** �� 12 �ϐ��F m_CUST_NAME */
	public String m_CUST_NAME = null;
	/** �� 13 �ϐ��F m_CUR_CD */
	public String m_CUR_CD = null;
	/** �� 14 �ϐ��F m_PRICE_ROUND_TYP */
	public String m_PRICE_ROUND_TYP = null;
	/** �� 15 �ϐ��F m_CUR_NAME */
	public String m_CUR_NAME = null;
	/** �� 16 �ϐ��F m_DECIMAL_FIG */
	public String m_DECIMAL_FIG = null;
	/** �� 17 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 18 �ϐ��F m_p_UNIT_COST */
	public String m_p_UNIT_COST = null;
	/** �� 19 �ϐ��F m_p_UNIT_COST_TYP */
	public Integer m_p_UNIT_COST_TYP = null;
	/** �� 20 �ϐ��F m_p_EFF_PHASE_IN_DATE */
	public String m_p_EFF_PHASE_IN_DATE = null;
	/** �� 21 �ϐ��F m_w_MODIFY_COUNT */
	public String m_w_MODIFY_COUNT = null;
	/** �� 22 �ϐ��F m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** �� 23 �ϐ��F m_p_VALUE */
	public String m_p_VALUE = null;
	/** �� 24 �ϐ��F m_p_NAME */
	public String m_p_NAME = null;
	/** �� 25 �ϐ��F m_p_BUSINESS_DATE */
	public String m_p_BUSINESS_DATE = null;
	/** �� 26 �ϐ��F m_p_CODE */
	public String m_p_CODE = null;
	/** �� 27 �ϐ��F m_p_CLASS_CODE */
	public String m_p_CLASS_CODE = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_p_UNIT_COST_TYP_name */
	public List l_p_UNIT_COST_TYP_name = null;

	/** �� 2 List�ϐ��F l_p_UNIT_COST_TYP_val */
	public List l_p_UNIT_COST_TYP_val = null;

	/** �� 3 List�ϐ��F l_p_UNIT_COST_NAME */
	public List l_p_UNIT_COST_NAME = null;

	/** �� 4 List�ϐ��F l_h_SCREENMOVE_TYP */
	public List l_h_SCREENMOVE_TYP = null;

	/** �� 5 List�ϐ��F l_h_APPR_ID */
	public List l_h_APPR_ID = null;

	/** �� 6 List�ϐ��F l_p_APPR_REMARKS */
	public List l_p_APPR_REMARKS = null;

	/** �� 7 List�ϐ��F l_h_APR_UNIT_COST */
	public List l_h_APR_UNIT_COST = null;

	/** �� 8 List�ϐ��F l_w_PLANT_CD */
	public List l_w_PLANT_CD = null;

	/** �� 9 List�ϐ��F l_w_REC_COUNT */
	public List l_w_REC_COUNT = null;

	/** �� 10 List�ϐ��F l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** �� 11 List�ϐ��F l_CUST_CD */
	public List l_CUST_CD = null;

	/** �� 12 List�ϐ��F l_CUST_NAME */
	public List l_CUST_NAME = null;

	/** �� 13 List�ϐ��F l_CUR_CD */
	public List l_CUR_CD = null;

	/** �� 14 List�ϐ��F l_PRICE_ROUND_TYP */
	public List l_PRICE_ROUND_TYP = null;

	/** �� 15 List�ϐ��F l_CUR_NAME */
	public List l_CUR_NAME = null;

	/** �� 16 List�ϐ��F l_DECIMAL_FIG */
	public List l_DECIMAL_FIG = null;

	/** �� 17 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 18 List�ϐ��F l_p_UNIT_COST */
	public List l_p_UNIT_COST = null;

	/** �� 19 List�ϐ��F l_p_UNIT_COST_TYP */
	public List l_p_UNIT_COST_TYP = null;

	/** �� 20 List�ϐ��F l_p_EFF_PHASE_IN_DATE */
	public List l_p_EFF_PHASE_IN_DATE = null;

	/** �� 21 List�ϐ��F l_w_MODIFY_COUNT */
	public List l_w_MODIFY_COUNT = null;

	/** �� 22 List�ϐ��F l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** �� 23 List�ϐ��F l_p_VALUE */
	public List l_p_VALUE = null;

	/** �� 24 List�ϐ��F l_p_NAME */
	public List l_p_NAME = null;

	/** �� 25 List�ϐ��F l_p_BUSINESS_DATE */
	public List l_p_BUSINESS_DATE = null;

	/** �� 26 List�ϐ��F l_p_CODE */
	public List l_p_CODE = null;

	/** �� 27 List�ϐ��F l_p_CLASS_CODE */
	public List l_p_CLASS_CODE = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getp_UNIT_COST_TYP_name() { return m_p_UNIT_COST_TYP_name; }
	public Integer getp_UNIT_COST_TYP_val() { return m_p_UNIT_COST_TYP_val; }
	public String getp_UNIT_COST_NAME() { return m_p_UNIT_COST_NAME; }
	public String geth_SCREENMOVE_TYP() { return m_h_SCREENMOVE_TYP; }
	public String geth_APPR_ID() { return m_h_APPR_ID; }
	public String getp_APPR_REMARKS() { return m_p_APPR_REMARKS; }
	public String geth_APR_UNIT_COST() { return m_h_APR_UNIT_COST; }
	public String getw_PLANT_CD() { return m_w_PLANT_CD; }
	public Integer getw_REC_COUNT() { return m_w_REC_COUNT; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getCUST_CD() { return m_CUST_CD; }
	public String getCUST_NAME() { return m_CUST_NAME; }
	public String getCUR_CD() { return m_CUR_CD; }
	public String getPRICE_ROUND_TYP() { return m_PRICE_ROUND_TYP; }
	public String getCUR_NAME() { return m_CUR_NAME; }
	public String getDECIMAL_FIG() { return m_DECIMAL_FIG; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getp_UNIT_COST() { return m_p_UNIT_COST; }
	public Integer getp_UNIT_COST_TYP() { return m_p_UNIT_COST_TYP; }
	public String getp_EFF_PHASE_IN_DATE() { return m_p_EFF_PHASE_IN_DATE; }
	public String getw_MODIFY_COUNT() { return m_w_MODIFY_COUNT; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getp_VALUE() { return m_p_VALUE; }
	public String getp_NAME() { return m_p_NAME; }
	public String getp_BUSINESS_DATE() { return m_p_BUSINESS_DATE; }
	public String getp_CODE() { return m_p_CODE; }
	public String getp_CLASS_CODE() { return m_p_CLASS_CODE; }

	public List getList_p_UNIT_COST_TYP_name() { return l_p_UNIT_COST_TYP_name; }
	public List getList_p_UNIT_COST_TYP_val() { return l_p_UNIT_COST_TYP_val; }
	public List getList_p_UNIT_COST_NAME() { return l_p_UNIT_COST_NAME; }
	public List getList_h_SCREENMOVE_TYP() { return l_h_SCREENMOVE_TYP; }
	public List getList_h_APPR_ID() { return l_h_APPR_ID; }
	public List getList_p_APPR_REMARKS() { return l_p_APPR_REMARKS; }
	public List getList_h_APR_UNIT_COST() { return l_h_APR_UNIT_COST; }
	public List getList_w_PLANT_CD() { return l_w_PLANT_CD; }
	public List getList_w_REC_COUNT() { return l_w_REC_COUNT; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_CUST_CD() { return l_CUST_CD; }
	public List getList_CUST_NAME() { return l_CUST_NAME; }
	public List getList_CUR_CD() { return l_CUR_CD; }
	public List getList_PRICE_ROUND_TYP() { return l_PRICE_ROUND_TYP; }
	public List getList_CUR_NAME() { return l_CUR_NAME; }
	public List getList_DECIMAL_FIG() { return l_DECIMAL_FIG; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_p_UNIT_COST() { return l_p_UNIT_COST; }
	public List getList_p_UNIT_COST_TYP() { return l_p_UNIT_COST_TYP; }
	public List getList_p_EFF_PHASE_IN_DATE() { return l_p_EFF_PHASE_IN_DATE; }
	public List getList_w_MODIFY_COUNT() { return l_w_MODIFY_COUNT; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_p_VALUE() { return l_p_VALUE; }
	public List getList_p_NAME() { return l_p_NAME; }
	public List getList_p_BUSINESS_DATE() { return l_p_BUSINESS_DATE; }
	public List getList_p_CODE() { return l_p_CODE; }
	public List getList_p_CLASS_CODE() { return l_p_CLASS_CODE; }

	public void setp_UNIT_COST_TYP_name(String val) { m_p_UNIT_COST_TYP_name = val; }
	public void setp_UNIT_COST_TYP_val(Integer val) { m_p_UNIT_COST_TYP_val = val; }
	public void setp_UNIT_COST_NAME(String val) { m_p_UNIT_COST_NAME = val; }
	public void seth_SCREENMOVE_TYP(String val) { m_h_SCREENMOVE_TYP = val; }
	public void seth_APPR_ID(String val) { m_h_APPR_ID = val; }
	public void setp_APPR_REMARKS(String val) { m_p_APPR_REMARKS = val; }
	public void seth_APR_UNIT_COST(String val) { m_h_APR_UNIT_COST = val; }
	public void setw_PLANT_CD(String val) { m_w_PLANT_CD = val; }
	public void setw_REC_COUNT(Integer val) { m_w_REC_COUNT = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setCUST_CD(String val) { m_CUST_CD = val; }
	public void setCUST_NAME(String val) { m_CUST_NAME = val; }
	public void setCUR_CD(String val) { m_CUR_CD = val; }
	public void setPRICE_ROUND_TYP(String val) { m_PRICE_ROUND_TYP = val; }
	public void setCUR_NAME(String val) { m_CUR_NAME = val; }
	public void setDECIMAL_FIG(String val) { m_DECIMAL_FIG = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setp_UNIT_COST(String val) { m_p_UNIT_COST = val; }
	public void setp_UNIT_COST_TYP(Integer val) { m_p_UNIT_COST_TYP = val; }
	public void setp_EFF_PHASE_IN_DATE(String val) { m_p_EFF_PHASE_IN_DATE = val; }
	public void setw_MODIFY_COUNT(String val) { m_w_MODIFY_COUNT = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setp_VALUE(String val) { m_p_VALUE = val; }
	public void setp_NAME(String val) { m_p_NAME = val; }
	public void setp_BUSINESS_DATE(String val) { m_p_BUSINESS_DATE = val; }
	public void setp_CODE(String val) { m_p_CODE = val; }
	public void setp_CLASS_CODE(String val) { m_p_CLASS_CODE = val; }

	public void setp_UNIT_COST_TYP_val(String val) { m_p_UNIT_COST_TYP_val = getInteger(val); }
	public void setw_REC_COUNT(String val) { m_w_REC_COUNT = getInteger(val); }
	public void setp_UNIT_COST_TYP(String val) { m_p_UNIT_COST_TYP = getInteger(val); }

	public void setList_p_UNIT_COST_TYP_name(List list) { l_p_UNIT_COST_TYP_name = list; }
	public void setList_p_UNIT_COST_TYP_val(List list) { l_p_UNIT_COST_TYP_val = list; }
	public void setList_p_UNIT_COST_NAME(List list) { l_p_UNIT_COST_NAME = list; }
	public void setList_h_SCREENMOVE_TYP(List list) { l_h_SCREENMOVE_TYP = list; }
	public void setList_h_APPR_ID(List list) { l_h_APPR_ID = list; }
	public void setList_p_APPR_REMARKS(List list) { l_p_APPR_REMARKS = list; }
	public void setList_h_APR_UNIT_COST(List list) { l_h_APR_UNIT_COST = list; }
	public void setList_w_PLANT_CD(List list) { l_w_PLANT_CD = list; }
	public void setList_w_REC_COUNT(List list) { l_w_REC_COUNT = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_CUST_CD(List list) { l_CUST_CD = list; }
	public void setList_CUST_NAME(List list) { l_CUST_NAME = list; }
	public void setList_CUR_CD(List list) { l_CUR_CD = list; }
	public void setList_PRICE_ROUND_TYP(List list) { l_PRICE_ROUND_TYP = list; }
	public void setList_CUR_NAME(List list) { l_CUR_NAME = list; }
	public void setList_DECIMAL_FIG(List list) { l_DECIMAL_FIG = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_p_UNIT_COST(List list) { l_p_UNIT_COST = list; }
	public void setList_p_UNIT_COST_TYP(List list) { l_p_UNIT_COST_TYP = list; }
	public void setList_p_EFF_PHASE_IN_DATE(List list) { l_p_EFF_PHASE_IN_DATE = list; }
	public void setList_w_MODIFY_COUNT(List list) { l_w_MODIFY_COUNT = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_p_VALUE(List list) { l_p_VALUE = list; }
	public void setList_p_NAME(List list) { l_p_NAME = list; }
	public void setList_p_BUSINESS_DATE(List list) { l_p_BUSINESS_DATE = list; }
	public void setList_p_CODE(List list) { l_p_CODE = list; }
	public void setList_p_CLASS_CODE(List list) { l_p_CLASS_CODE = list; }

	public int setL2L_p_UNIT_COST_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_p_UNIT_COST_TYP_name == null) {
			l_p_UNIT_COST_TYP_name = new ArrayList();
		} else {
			l_p_UNIT_COST_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_p_UNIT_COST_TYP_name.add(((KA0040010Struct) list.get(i)).getp_UNIT_COST_TYP_name());
		}
		return size;
	}
	public int setL2L_p_UNIT_COST_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_p_UNIT_COST_TYP_val == null) {
			l_p_UNIT_COST_TYP_val = new ArrayList();
		} else {
			l_p_UNIT_COST_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_p_UNIT_COST_TYP_val.add(((KA0040010Struct) list.get(i)).getp_UNIT_COST_TYP_val());
		}
		return size;
	}
	public int setL2L_p_UNIT_COST_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_p_UNIT_COST_NAME == null) {
			l_p_UNIT_COST_NAME = new ArrayList();
		} else {
			l_p_UNIT_COST_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_p_UNIT_COST_NAME.add(((KA0040010Struct) list.get(i)).getp_UNIT_COST_NAME());
		}
		return size;
	}
	public int setL2L_h_SCREENMOVE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_SCREENMOVE_TYP == null) {
			l_h_SCREENMOVE_TYP = new ArrayList();
		} else {
			l_h_SCREENMOVE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_SCREENMOVE_TYP.add(((KA0040010Struct) list.get(i)).geth_SCREENMOVE_TYP());
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
			l_h_APPR_ID.add(((KA0040010Struct) list.get(i)).geth_APPR_ID());
		}
		return size;
	}
	public int setL2L_p_APPR_REMARKS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_p_APPR_REMARKS == null) {
			l_p_APPR_REMARKS = new ArrayList();
		} else {
			l_p_APPR_REMARKS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_p_APPR_REMARKS.add(((KA0040010Struct) list.get(i)).getp_APPR_REMARKS());
		}
		return size;
	}
	public int setL2L_h_APR_UNIT_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_APR_UNIT_COST == null) {
			l_h_APR_UNIT_COST = new ArrayList();
		} else {
			l_h_APR_UNIT_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_APR_UNIT_COST.add(((KA0040010Struct) list.get(i)).geth_APR_UNIT_COST());
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
			l_w_PLANT_CD.add(((KA0040010Struct) list.get(i)).getw_PLANT_CD());
		}
		return size;
	}
	public int setL2L_w_REC_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_REC_COUNT == null) {
			l_w_REC_COUNT = new ArrayList();
		} else {
			l_w_REC_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_REC_COUNT.add(((KA0040010Struct) list.get(i)).getw_REC_COUNT());
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
			l_COMPANY_CD.add(((KA0040010Struct) list.get(i)).getCOMPANY_CD());
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
			l_CUST_CD.add(((KA0040010Struct) list.get(i)).getCUST_CD());
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
			l_CUST_NAME.add(((KA0040010Struct) list.get(i)).getCUST_NAME());
		}
		return size;
	}
	public int setL2L_CUR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUR_CD == null) {
			l_CUR_CD = new ArrayList();
		} else {
			l_CUR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUR_CD.add(((KA0040010Struct) list.get(i)).getCUR_CD());
		}
		return size;
	}
	public int setL2L_PRICE_ROUND_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRICE_ROUND_TYP == null) {
			l_PRICE_ROUND_TYP = new ArrayList();
		} else {
			l_PRICE_ROUND_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRICE_ROUND_TYP.add(((KA0040010Struct) list.get(i)).getPRICE_ROUND_TYP());
		}
		return size;
	}
	public int setL2L_CUR_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUR_NAME == null) {
			l_CUR_NAME = new ArrayList();
		} else {
			l_CUR_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUR_NAME.add(((KA0040010Struct) list.get(i)).getCUR_NAME());
		}
		return size;
	}
	public int setL2L_DECIMAL_FIG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DECIMAL_FIG == null) {
			l_DECIMAL_FIG = new ArrayList();
		} else {
			l_DECIMAL_FIG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DECIMAL_FIG.add(((KA0040010Struct) list.get(i)).getDECIMAL_FIG());
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
			l_ITEM_CD.add(((KA0040010Struct) list.get(i)).getITEM_CD());
		}
		return size;
	}
	public int setL2L_p_UNIT_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_p_UNIT_COST == null) {
			l_p_UNIT_COST = new ArrayList();
		} else {
			l_p_UNIT_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_p_UNIT_COST.add(((KA0040010Struct) list.get(i)).getp_UNIT_COST());
		}
		return size;
	}
	public int setL2L_p_UNIT_COST_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_p_UNIT_COST_TYP == null) {
			l_p_UNIT_COST_TYP = new ArrayList();
		} else {
			l_p_UNIT_COST_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_p_UNIT_COST_TYP.add(((KA0040010Struct) list.get(i)).getp_UNIT_COST_TYP());
		}
		return size;
	}
	public int setL2L_p_EFF_PHASE_IN_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_p_EFF_PHASE_IN_DATE == null) {
			l_p_EFF_PHASE_IN_DATE = new ArrayList();
		} else {
			l_p_EFF_PHASE_IN_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_p_EFF_PHASE_IN_DATE.add(((KA0040010Struct) list.get(i)).getp_EFF_PHASE_IN_DATE());
		}
		return size;
	}
	public int setL2L_w_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_MODIFY_COUNT == null) {
			l_w_MODIFY_COUNT = new ArrayList();
		} else {
			l_w_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_MODIFY_COUNT.add(((KA0040010Struct) list.get(i)).getw_MODIFY_COUNT());
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
			l_ITEM_NAME.add(((KA0040010Struct) list.get(i)).getITEM_NAME());
		}
		return size;
	}
	public int setL2L_p_VALUE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_p_VALUE == null) {
			l_p_VALUE = new ArrayList();
		} else {
			l_p_VALUE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_p_VALUE.add(((KA0040010Struct) list.get(i)).getp_VALUE());
		}
		return size;
	}
	public int setL2L_p_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_p_NAME == null) {
			l_p_NAME = new ArrayList();
		} else {
			l_p_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_p_NAME.add(((KA0040010Struct) list.get(i)).getp_NAME());
		}
		return size;
	}
	public int setL2L_p_BUSINESS_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_p_BUSINESS_DATE == null) {
			l_p_BUSINESS_DATE = new ArrayList();
		} else {
			l_p_BUSINESS_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_p_BUSINESS_DATE.add(((KA0040010Struct) list.get(i)).getp_BUSINESS_DATE());
		}
		return size;
	}
	public int setL2L_p_CODE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_p_CODE == null) {
			l_p_CODE = new ArrayList();
		} else {
			l_p_CODE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_p_CODE.add(((KA0040010Struct) list.get(i)).getp_CODE());
		}
		return size;
	}
	public int setL2L_p_CLASS_CODE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_p_CLASS_CODE == null) {
			l_p_CLASS_CODE = new ArrayList();
		} else {
			l_p_CLASS_CODE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_p_CLASS_CODE.add(((KA0040010Struct) list.get(i)).getp_CLASS_CODE());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_p_UNIT_COST_TYP_name = null;
		m_p_UNIT_COST_TYP_val = null;
		m_p_UNIT_COST_NAME = null;
		m_h_SCREENMOVE_TYP = null;
		m_h_APPR_ID = null;
		m_p_APPR_REMARKS = null;
		m_h_APR_UNIT_COST = null;
		m_w_PLANT_CD = null;
		m_w_REC_COUNT = null;
		m_COMPANY_CD = null;
		m_CUST_CD = null;
		m_CUST_NAME = null;
		m_CUR_CD = null;
		m_PRICE_ROUND_TYP = null;
		m_CUR_NAME = null;
		m_DECIMAL_FIG = null;
		m_ITEM_CD = null;
		m_p_UNIT_COST = null;
		m_p_UNIT_COST_TYP = null;
		m_p_EFF_PHASE_IN_DATE = null;
		m_w_MODIFY_COUNT = null;
		m_ITEM_NAME = null;
		m_p_VALUE = null;
		m_p_NAME = null;
		m_p_BUSINESS_DATE = null;
		m_p_CODE = null;
		m_p_CLASS_CODE = null;

		l_p_UNIT_COST_TYP_name = null;
		l_p_UNIT_COST_TYP_val = null;
		l_p_UNIT_COST_NAME = null;
		l_h_SCREENMOVE_TYP = null;
		l_h_APPR_ID = null;
		l_p_APPR_REMARKS = null;
		l_h_APR_UNIT_COST = null;
		l_w_PLANT_CD = null;
		l_w_REC_COUNT = null;
		l_COMPANY_CD = null;
		l_CUST_CD = null;
		l_CUST_NAME = null;
		l_CUR_CD = null;
		l_PRICE_ROUND_TYP = null;
		l_CUR_NAME = null;
		l_DECIMAL_FIG = null;
		l_ITEM_CD = null;
		l_p_UNIT_COST = null;
		l_p_UNIT_COST_TYP = null;
		l_p_EFF_PHASE_IN_DATE = null;
		l_w_MODIFY_COUNT = null;
		l_ITEM_NAME = null;
		l_p_VALUE = null;
		l_p_NAME = null;
		l_p_BUSINESS_DATE = null;
		l_p_CODE = null;
		l_p_CLASS_CODE = null;

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
	 * medKA0040010�N���X�̕W���R���X�g���N�^
	 */
	public KA0040010Struct()
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
	public void setStruct(KA0040010Struct struct)
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
	public void setStructM(KA0040010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setp_UNIT_COST_TYP_name(struct.getp_UNIT_COST_TYP_name());
			this.setp_UNIT_COST_TYP_val(struct.getp_UNIT_COST_TYP_val());
			this.setp_UNIT_COST_NAME(struct.getp_UNIT_COST_NAME());
			this.seth_SCREENMOVE_TYP(struct.geth_SCREENMOVE_TYP());
			this.seth_APPR_ID(struct.geth_APPR_ID());
			this.setp_APPR_REMARKS(struct.getp_APPR_REMARKS());
			this.seth_APR_UNIT_COST(struct.geth_APR_UNIT_COST());
			this.setw_PLANT_CD(struct.getw_PLANT_CD());
			this.setw_REC_COUNT(struct.getw_REC_COUNT());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setCUST_CD(struct.getCUST_CD());
			this.setCUST_NAME(struct.getCUST_NAME());
			this.setCUR_CD(struct.getCUR_CD());
			this.setPRICE_ROUND_TYP(struct.getPRICE_ROUND_TYP());
			this.setCUR_NAME(struct.getCUR_NAME());
			this.setDECIMAL_FIG(struct.getDECIMAL_FIG());
			this.setITEM_CD(struct.getITEM_CD());
			this.setp_UNIT_COST(struct.getp_UNIT_COST());
			this.setp_UNIT_COST_TYP(struct.getp_UNIT_COST_TYP());
			this.setp_EFF_PHASE_IN_DATE(struct.getp_EFF_PHASE_IN_DATE());
			this.setw_MODIFY_COUNT(struct.getw_MODIFY_COUNT());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setp_VALUE(struct.getp_VALUE());
			this.setp_NAME(struct.getp_NAME());
			this.setp_BUSINESS_DATE(struct.getp_BUSINESS_DATE());
			this.setp_CODE(struct.getp_CODE());
			this.setp_CLASS_CODE(struct.getp_CLASS_CODE());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(KA0040010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_p_UNIT_COST_TYP_name(struct.getList_p_UNIT_COST_TYP_name());
			this.setList_p_UNIT_COST_TYP_val(struct.getList_p_UNIT_COST_TYP_val());
			this.setList_p_UNIT_COST_NAME(struct.getList_p_UNIT_COST_NAME());
			this.setList_h_SCREENMOVE_TYP(struct.getList_h_SCREENMOVE_TYP());
			this.setList_h_APPR_ID(struct.getList_h_APPR_ID());
			this.setList_p_APPR_REMARKS(struct.getList_p_APPR_REMARKS());
			this.setList_h_APR_UNIT_COST(struct.getList_h_APR_UNIT_COST());
			this.setList_w_PLANT_CD(struct.getList_w_PLANT_CD());
			this.setList_w_REC_COUNT(struct.getList_w_REC_COUNT());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_CUST_CD(struct.getList_CUST_CD());
			this.setList_CUST_NAME(struct.getList_CUST_NAME());
			this.setList_CUR_CD(struct.getList_CUR_CD());
			this.setList_PRICE_ROUND_TYP(struct.getList_PRICE_ROUND_TYP());
			this.setList_CUR_NAME(struct.getList_CUR_NAME());
			this.setList_DECIMAL_FIG(struct.getList_DECIMAL_FIG());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_p_UNIT_COST(struct.getList_p_UNIT_COST());
			this.setList_p_UNIT_COST_TYP(struct.getList_p_UNIT_COST_TYP());
			this.setList_p_EFF_PHASE_IN_DATE(struct.getList_p_EFF_PHASE_IN_DATE());
			this.setList_w_MODIFY_COUNT(struct.getList_w_MODIFY_COUNT());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_p_VALUE(struct.getList_p_VALUE());
			this.setList_p_NAME(struct.getList_p_NAME());
			this.setList_p_BUSINESS_DATE(struct.getList_p_BUSINESS_DATE());
			this.setList_p_CODE(struct.getList_p_CODE());
			this.setList_p_CLASS_CODE(struct.getList_p_CLASS_CODE());
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
	// �� 1 �ϐ������l�F i_p_UNIT_COST_TYP_name


	final static String i_p_UNIT_COST_TYP_name = null;

	// �� 2 �ϐ������l�F i_p_UNIT_COST_TYP_val


	final static Integer i_p_UNIT_COST_TYP_val = null;

	// �� 3 �ϐ������l�F i_p_UNIT_COST_NAME


	final static String i_p_UNIT_COST_NAME = null;

	// �� 4 �ϐ������l�F i_h_SCREENMOVE_TYP


	final static String i_h_SCREENMOVE_TYP = null;

	// �� 5 �ϐ������l�F i_h_APPR_ID


	final static String i_h_APPR_ID = null;

	// �� 6 �ϐ������l�F i_p_APPR_REMARKS


	final static String i_p_APPR_REMARKS = null;

	// �� 7 �ϐ������l�F i_h_APR_UNIT_COST


	final static String i_h_APR_UNIT_COST = null;

	// �� 8 �ϐ������l�F i_w_PLANT_CD


	final static String i_w_PLANT_CD = null;

	// �� 9 �ϐ������l�F i_w_REC_COUNT


	final static Integer i_w_REC_COUNT = null;

	// �� 10 �ϐ������l�F i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// �� 11 �ϐ������l�F i_CUST_CD


	final static String i_CUST_CD = null;

	// �� 12 �ϐ������l�F i_CUST_NAME


	final static String i_CUST_NAME = null;

	// �� 13 �ϐ������l�F i_CUR_CD


	final static String i_CUR_CD = null;

	// �� 14 �ϐ������l�F i_PRICE_ROUND_TYP


	final static String i_PRICE_ROUND_TYP = null;

	// �� 15 �ϐ������l�F i_CUR_NAME


	final static String i_CUR_NAME = null;

	// �� 16 �ϐ������l�F i_DECIMAL_FIG


	final static String i_DECIMAL_FIG = null;

	// �� 17 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 18 �ϐ������l�F i_p_UNIT_COST


	final static String i_p_UNIT_COST = null;

	// �� 19 �ϐ������l�F i_p_UNIT_COST_TYP


	final static Integer i_p_UNIT_COST_TYP = null;

	// �� 20 �ϐ������l�F i_p_EFF_PHASE_IN_DATE


	final static String i_p_EFF_PHASE_IN_DATE = null;

	// �� 21 �ϐ������l�F i_w_MODIFY_COUNT


	final static String i_w_MODIFY_COUNT = null;

	// �� 22 �ϐ������l�F i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// �� 23 �ϐ������l�F i_p_VALUE


	final static String i_p_VALUE = null;

	// �� 24 �ϐ������l�F i_p_NAME


	final static String i_p_NAME = null;

	// �� 25 �ϐ������l�F i_p_BUSINESS_DATE


	final static String i_p_BUSINESS_DATE = null;

	// �� 26 �ϐ������l�F i_p_CODE


	final static String i_p_CODE = null;

	// �� 27 �ϐ������l�F i_p_CLASS_CODE


	final static String i_p_CLASS_CODE = null;

*/

	//{{user_implement_code
         // TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
         // �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
        // �� 1 �ϐ������l�F i_COMPANY_CD
        final static String i_COMPANY_CD = null;
        // �� 2 �ϐ������l�F i_CUST_CD
        final static String i_CUST_CD = null;
        // �� 3 �ϐ������l�F i_CUST_NAME
        final static String i_CUST_NAME = null;
        // �� 4 �ϐ������l�F i_CUR_CD
        final static String i_CUR_CD = null;
        // �� 5 �ϐ������l�F i_PRICE_ROUND_TYP
        final static String i_PRICE_ROUND_TYP = null;
        // �� 6 �ϐ������l�F i_CUR_NAME
        final static String i_CUR_NAME = null;
        // �� 7 �ϐ������l�F i_DECIMAL_FIG
        final static String i_DECIMAL_FIG = null;
        // �� 8 �ϐ������l�F i_ITEM_CD
        final static String i_ITEM_CD = null;
        // �� 9 �ϐ������l�F i_p_UNIT_COST
        final static String i_p_UNIT_COST = null;
        // �� 10 �ϐ������l�F i_p_UNIT_COST_TYP
        final static Integer i_p_UNIT_COST_TYP = null;
        // �� 11 �ϐ������l�F i_p_EFF_PHASE_IN_DATE
        final static String i_p_EFF_PHASE_IN_DATE = null;
        // �� 12 �ϐ������l�F i_w_MODIFY_COUNT
        final static String i_w_MODIFY_COUNT = null;
        // �� 13 �ϐ������l�F i_w_REC_COUNT
        final static Integer i_w_REC_COUNT = null;
        // �� 14 �ϐ������l�F i_ITEM_NAME
        final static String i_ITEM_NAME = null;
        // �� 15 �ϐ������l�F i_p_UNIT_COST_TYP_name
        final static String i_p_UNIT_COST_TYP_name = null;
        // �� 16 �ϐ������l�F i_p_UNIT_COST_TYP_val
        final static Integer i_p_UNIT_COST_TYP_val = null;
        // �� 17 �ϐ������l�F i_p_UNIT_COST_NAME
        final static String i_p_UNIT_COST_NAME = null;
        // �� 18 �ϐ������l�F i_w_PLANT_CD
        final static String i_w_PLANT_CD = null;
       
        /**
         * ������
         *
         */
        public void initialize()
        {
       
         m_COMPANY_CD = i_COMPANY_CD;
         m_CUST_CD = i_CUST_CD;
         m_CUST_NAME = i_CUST_NAME;
         m_CUR_CD = i_CUR_CD;
         m_PRICE_ROUND_TYP = i_PRICE_ROUND_TYP;
         m_CUR_NAME = i_CUR_NAME;
         m_DECIMAL_FIG = i_DECIMAL_FIG;
         m_ITEM_CD = i_ITEM_CD;
         m_p_UNIT_COST = i_p_UNIT_COST;
         m_p_UNIT_COST_TYP = i_p_UNIT_COST_TYP;
         m_p_EFF_PHASE_IN_DATE = i_p_EFF_PHASE_IN_DATE;
         m_w_MODIFY_COUNT = i_w_MODIFY_COUNT;
         m_w_REC_COUNT = i_w_REC_COUNT;
         m_ITEM_NAME = i_ITEM_NAME;
         m_p_UNIT_COST_NAME = i_p_UNIT_COST_NAME;
         m_w_PLANT_CD = i_w_PLANT_CD;
        }
       
        public void copy(KA0040010Struct struct){
       
         if(struct.m_COMPANY_CD != null){ 
          m_COMPANY_CD = new String(struct.m_COMPANY_CD);
         }
       
         if(struct.m_ITEM_CD != null){ 
          m_ITEM_CD = new String(struct.m_ITEM_CD);
         }
       
         if(struct.m_ITEM_NAME != null){ 
          m_ITEM_NAME = new String(struct.m_ITEM_NAME);
         }
       
         if(struct.m_p_UNIT_COST_TYP != null){
             m_p_UNIT_COST_TYP = new Integer(struct.m_p_UNIT_COST_TYP.intValue());
         }
       
         if(struct.m_CUST_CD != null){ 
          m_CUST_CD = new String(struct.m_CUST_CD);
         }
       
         if(struct.m_CUST_NAME != null){ 
          m_CUST_NAME = new String(struct.m_CUST_NAME);
         }
       
         if(struct.m_p_EFF_PHASE_IN_DATE != null){ 
          m_p_EFF_PHASE_IN_DATE = new String(struct.m_p_EFF_PHASE_IN_DATE);
         }
       
         if(struct.m_p_UNIT_COST != null){ 
          m_p_UNIT_COST = new String(struct.m_p_UNIT_COST);
         }
       
         if(struct.m_w_MODIFY_COUNT != null){ 
          m_w_MODIFY_COUNT = new String(struct.m_w_MODIFY_COUNT);
         }
       
         if(struct.m_CUR_CD != null){ 
          m_CUR_CD = new String(struct.m_CUR_CD);
         }
         
         if(struct.m_CUR_NAME != null){ 
          m_CUR_NAME = new String(struct.m_CUR_NAME);
         }
         if(struct.m_h_APR_UNIT_COST != null){
        	 m_h_APR_UNIT_COST = new String(struct.m_h_APR_UNIT_COST);
         }
         if(struct.m_h_APPR_ID != null){
        	 m_h_APPR_ID = new String(struct.m_h_APPR_ID);
         }
         if(struct.m_h_SCREENMOVE_TYP != null){
        	 m_h_SCREENMOVE_TYP = new String(struct.m_h_SCREENMOVE_TYP);
         }
         }
        public void keycopy(KA0040010Struct struct){
       
         if(struct.m_COMPANY_CD != null){ 
          m_COMPANY_CD = new String(struct.m_COMPANY_CD);
         }else{
          m_COMPANY_CD = null;
         }
       
         if(struct.m_ITEM_CD != null){ 
          m_ITEM_CD = new String(struct.m_ITEM_CD);
         }else{
          m_ITEM_CD = null;
         }
       
         if(struct.m_CUST_CD != null){ 
          m_CUST_CD = new String(struct.m_CUST_CD);
         }else{
          m_CUST_CD = null;
         }
         if(struct.m_h_APR_UNIT_COST != null){
        	 m_h_APR_UNIT_COST = new String(struct.m_h_APR_UNIT_COST);
         }else{
        	 m_h_APR_UNIT_COST = null;
         }
         if(struct.m_h_APPR_ID != null){
        	 m_h_APPR_ID = new String(struct.m_h_APPR_ID);
         }else{
        	 m_h_APPR_ID = null;
         }
         if(struct.m_h_SCREENMOVE_TYP != null){
        	 m_h_SCREENMOVE_TYP = new String(struct.m_h_SCREENMOVE_TYP);
         }else{
        	 m_h_SCREENMOVE_TYP = null;
         }
         if(struct.m_p_EFF_PHASE_IN_DATE != null){
        	 m_p_EFF_PHASE_IN_DATE = new String(struct.m_p_EFF_PHASE_IN_DATE);
         }else{
        	 m_p_EFF_PHASE_IN_DATE = null;
         }
         }
        //------------------------------------------------------------------
        //}}user_implement_code

	//////////////////////////////

}
