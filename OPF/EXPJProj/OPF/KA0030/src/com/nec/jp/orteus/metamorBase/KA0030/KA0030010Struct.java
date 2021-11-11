/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KA0030/src/com/nec/jp/orteus/metamorBase/KA0030/KA0030010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.KA0030;

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

public class KA0030010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_h_RESULT */
	public String m_h_RESULT = null;
	/** �� 2 �ϐ��F m_k_MODE */
	public String m_k_MODE = null;
	/** �� 3 �ϐ��F m_DEPO_TYP_name */
	public String m_DEPO_TYP_name = null;
	/** �� 4 �ϐ��F m_DEPO_TYP_val */
	public String m_DEPO_TYP_val = null;
	/** �� 5 �ϐ��F m_h_DEPO_TYP */
	public Double m_h_DEPO_TYP = null;
	/** �� 6 �ϐ��F m_strCOMPANY_CD */
	public String m_strCOMPANY_CD = null;
	/** �� 7 �ϐ��F m_CUST_CD */
	public String m_CUST_CD = null;
	/** �� 8 �ϐ��F m_CUST_ITEM_CD */
	public String m_CUST_ITEM_CD = null;
	/** �� 9 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 10 �ϐ��F m_CUST_ITEM_NAME */
	public String m_CUST_ITEM_NAME = null;
	/** �� 11 �ϐ��F m_SALES_DEPT_CD */
	public String m_SALES_DEPT_CD = null;
	/** �� 12 �ϐ��F m_NOTE1 */
	public String m_NOTE1 = null;
	/** �� 13 �ϐ��F m_NOTE2 */
	public String m_NOTE2 = null;
	/** �� 14 �ϐ��F m_DEPO_TYP */
	public String m_DEPO_TYP = null;
	/** �� 15 �ϐ��F m_TAX_CD */
	public String m_TAX_CD = null;
	/** �� 16 �ϐ��F m_h_MODIFY_COUNT */
	public String m_h_MODIFY_COUNT = null;
	/** �� 17 �ϐ��F m_CUST_NAME */
	public String m_CUST_NAME = null;
	/** �� 18 �ϐ��F m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** �� 19 �ϐ��F m_ORG_NAME */
	public String m_ORG_NAME = null;
	/** �� 20 �ϐ��F m_TAX_NAME */
	public String m_TAX_NAME = null;
	/** �� 21 �ϐ��F m_ch_ITEM_CD */
	public String m_ch_ITEM_CD = null;
	/** �� 22 �ϐ��F m_MRP_ODR_TYP */
	public String m_MRP_ODR_TYP = null;
	/** �� 23 �ϐ��F m_chM_ORG_CD */
	public String m_chM_ORG_CD = null;
	/** �� 24 �ϐ��F m_chITEM_CD */
	public String m_chITEM_CD = null;
	/** �� 25 �ϐ��F m_chCUST_CD */
	public String m_chCUST_CD = null;
	/** �� 26 �ϐ��F m_PURPOSE_val */
	public String m_PURPOSE_val = null;
	/** �� 27 �ϐ��F m_PURPOSE_name */
	public String m_PURPOSE_name = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_h_RESULT */
	public List l_h_RESULT = null;

	/** �� 2 List�ϐ��F l_k_MODE */
	public List l_k_MODE = null;

	/** �� 3 List�ϐ��F l_DEPO_TYP_name */
	public List l_DEPO_TYP_name = null;

	/** �� 4 List�ϐ��F l_DEPO_TYP_val */
	public List l_DEPO_TYP_val = null;

	/** �� 5 List�ϐ��F l_h_DEPO_TYP */
	public List l_h_DEPO_TYP = null;

	/** �� 6 List�ϐ��F l_strCOMPANY_CD */
	public List l_strCOMPANY_CD = null;

	/** �� 7 List�ϐ��F l_CUST_CD */
	public List l_CUST_CD = null;

	/** �� 8 List�ϐ��F l_CUST_ITEM_CD */
	public List l_CUST_ITEM_CD = null;

	/** �� 9 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 10 List�ϐ��F l_CUST_ITEM_NAME */
	public List l_CUST_ITEM_NAME = null;

	/** �� 11 List�ϐ��F l_SALES_DEPT_CD */
	public List l_SALES_DEPT_CD = null;

	/** �� 12 List�ϐ��F l_NOTE1 */
	public List l_NOTE1 = null;

	/** �� 13 List�ϐ��F l_NOTE2 */
	public List l_NOTE2 = null;

	/** �� 14 List�ϐ��F l_DEPO_TYP */
	public List l_DEPO_TYP = null;

	/** �� 15 List�ϐ��F l_TAX_CD */
	public List l_TAX_CD = null;

	/** �� 16 List�ϐ��F l_h_MODIFY_COUNT */
	public List l_h_MODIFY_COUNT = null;

	/** �� 17 List�ϐ��F l_CUST_NAME */
	public List l_CUST_NAME = null;

	/** �� 18 List�ϐ��F l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** �� 19 List�ϐ��F l_ORG_NAME */
	public List l_ORG_NAME = null;

	/** �� 20 List�ϐ��F l_TAX_NAME */
	public List l_TAX_NAME = null;

	/** �� 21 List�ϐ��F l_ch_ITEM_CD */
	public List l_ch_ITEM_CD = null;

	/** �� 22 List�ϐ��F l_MRP_ODR_TYP */
	public List l_MRP_ODR_TYP = null;

	/** �� 23 List�ϐ��F l_chM_ORG_CD */
	public List l_chM_ORG_CD = null;

	/** �� 24 List�ϐ��F l_chITEM_CD */
	public List l_chITEM_CD = null;

	/** �� 25 List�ϐ��F l_chCUST_CD */
	public List l_chCUST_CD = null;

	/** �� 26 List�ϐ��F l_PURPOSE_val */
	public List l_PURPOSE_val = null;

	/** �� 27 List�ϐ��F l_PURPOSE_name */
	public List l_PURPOSE_name = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String geth_RESULT() { return m_h_RESULT; }
	public String getk_MODE() { return m_k_MODE; }
	public String getDEPO_TYP_name() { return m_DEPO_TYP_name; }
	public String getDEPO_TYP_val() { return m_DEPO_TYP_val; }
	public Double geth_DEPO_TYP() { return m_h_DEPO_TYP; }
	public String getstrCOMPANY_CD() { return m_strCOMPANY_CD; }
	public String getCUST_CD() { return m_CUST_CD; }
	public String getCUST_ITEM_CD() { return m_CUST_ITEM_CD; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getCUST_ITEM_NAME() { return m_CUST_ITEM_NAME; }
	public String getSALES_DEPT_CD() { return m_SALES_DEPT_CD; }
	public String getNOTE1() { return m_NOTE1; }
	public String getNOTE2() { return m_NOTE2; }
	public String getDEPO_TYP() { return m_DEPO_TYP; }
	public String getTAX_CD() { return m_TAX_CD; }
	public String geth_MODIFY_COUNT() { return m_h_MODIFY_COUNT; }
	public String getCUST_NAME() { return m_CUST_NAME; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getORG_NAME() { return m_ORG_NAME; }
	public String getTAX_NAME() { return m_TAX_NAME; }
	public String getch_ITEM_CD() { return m_ch_ITEM_CD; }
	public String getMRP_ODR_TYP() { return m_MRP_ODR_TYP; }
	public String getchM_ORG_CD() { return m_chM_ORG_CD; }
	public String getchITEM_CD() { return m_chITEM_CD; }
	public String getchCUST_CD() { return m_chCUST_CD; }
	public String getPURPOSE_val() { return m_PURPOSE_val; }
	public String getPURPOSE_name() { return m_PURPOSE_name; }

	public List getList_h_RESULT() { return l_h_RESULT; }
	public List getList_k_MODE() { return l_k_MODE; }
	public List getList_DEPO_TYP_name() { return l_DEPO_TYP_name; }
	public List getList_DEPO_TYP_val() { return l_DEPO_TYP_val; }
	public List getList_h_DEPO_TYP() { return l_h_DEPO_TYP; }
	public List getList_strCOMPANY_CD() { return l_strCOMPANY_CD; }
	public List getList_CUST_CD() { return l_CUST_CD; }
	public List getList_CUST_ITEM_CD() { return l_CUST_ITEM_CD; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_CUST_ITEM_NAME() { return l_CUST_ITEM_NAME; }
	public List getList_SALES_DEPT_CD() { return l_SALES_DEPT_CD; }
	public List getList_NOTE1() { return l_NOTE1; }
	public List getList_NOTE2() { return l_NOTE2; }
	public List getList_DEPO_TYP() { return l_DEPO_TYP; }
	public List getList_TAX_CD() { return l_TAX_CD; }
	public List getList_h_MODIFY_COUNT() { return l_h_MODIFY_COUNT; }
	public List getList_CUST_NAME() { return l_CUST_NAME; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_ORG_NAME() { return l_ORG_NAME; }
	public List getList_TAX_NAME() { return l_TAX_NAME; }
	public List getList_ch_ITEM_CD() { return l_ch_ITEM_CD; }
	public List getList_MRP_ODR_TYP() { return l_MRP_ODR_TYP; }
	public List getList_chM_ORG_CD() { return l_chM_ORG_CD; }
	public List getList_chITEM_CD() { return l_chITEM_CD; }
	public List getList_chCUST_CD() { return l_chCUST_CD; }
	public List getList_PURPOSE_val() { return l_PURPOSE_val; }
	public List getList_PURPOSE_name() { return l_PURPOSE_name; }

	public void seth_RESULT(String val) { m_h_RESULT = val; }
	public void setk_MODE(String val) { m_k_MODE = val; }
	public void setDEPO_TYP_name(String val) { m_DEPO_TYP_name = val; }
	public void setDEPO_TYP_val(String val) { m_DEPO_TYP_val = val; }
	public void seth_DEPO_TYP(Double val) { m_h_DEPO_TYP = val; }
	public void setstrCOMPANY_CD(String val) { m_strCOMPANY_CD = val; }
	public void setCUST_CD(String val) { m_CUST_CD = val; }
	public void setCUST_ITEM_CD(String val) { m_CUST_ITEM_CD = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setCUST_ITEM_NAME(String val) { m_CUST_ITEM_NAME = val; }
	public void setSALES_DEPT_CD(String val) { m_SALES_DEPT_CD = val; }
	public void setNOTE1(String val) { m_NOTE1 = val; }
	public void setNOTE2(String val) { m_NOTE2 = val; }
	public void setDEPO_TYP(String val) { m_DEPO_TYP = val; }
	public void setTAX_CD(String val) { m_TAX_CD = val; }
	public void seth_MODIFY_COUNT(String val) { m_h_MODIFY_COUNT = val; }
	public void setCUST_NAME(String val) { m_CUST_NAME = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setORG_NAME(String val) { m_ORG_NAME = val; }
	public void setTAX_NAME(String val) { m_TAX_NAME = val; }
	public void setch_ITEM_CD(String val) { m_ch_ITEM_CD = val; }
	public void setMRP_ODR_TYP(String val) { m_MRP_ODR_TYP = val; }
	public void setchM_ORG_CD(String val) { m_chM_ORG_CD = val; }
	public void setchITEM_CD(String val) { m_chITEM_CD = val; }
	public void setchCUST_CD(String val) { m_chCUST_CD = val; }
	public void setPURPOSE_val(String val) { m_PURPOSE_val = val; }
	public void setPURPOSE_name(String val) { m_PURPOSE_name = val; }


	public void setList_h_RESULT(List list) { l_h_RESULT = list; }
	public void setList_k_MODE(List list) { l_k_MODE = list; }
	public void setList_DEPO_TYP_name(List list) { l_DEPO_TYP_name = list; }
	public void setList_DEPO_TYP_val(List list) { l_DEPO_TYP_val = list; }
	public void setList_h_DEPO_TYP(List list) { l_h_DEPO_TYP = list; }
	public void setList_strCOMPANY_CD(List list) { l_strCOMPANY_CD = list; }
	public void setList_CUST_CD(List list) { l_CUST_CD = list; }
	public void setList_CUST_ITEM_CD(List list) { l_CUST_ITEM_CD = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_CUST_ITEM_NAME(List list) { l_CUST_ITEM_NAME = list; }
	public void setList_SALES_DEPT_CD(List list) { l_SALES_DEPT_CD = list; }
	public void setList_NOTE1(List list) { l_NOTE1 = list; }
	public void setList_NOTE2(List list) { l_NOTE2 = list; }
	public void setList_DEPO_TYP(List list) { l_DEPO_TYP = list; }
	public void setList_TAX_CD(List list) { l_TAX_CD = list; }
	public void setList_h_MODIFY_COUNT(List list) { l_h_MODIFY_COUNT = list; }
	public void setList_CUST_NAME(List list) { l_CUST_NAME = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_ORG_NAME(List list) { l_ORG_NAME = list; }
	public void setList_TAX_NAME(List list) { l_TAX_NAME = list; }
	public void setList_ch_ITEM_CD(List list) { l_ch_ITEM_CD = list; }
	public void setList_MRP_ODR_TYP(List list) { l_MRP_ODR_TYP = list; }
	public void setList_chM_ORG_CD(List list) { l_chM_ORG_CD = list; }
	public void setList_chITEM_CD(List list) { l_chITEM_CD = list; }
	public void setList_chCUST_CD(List list) { l_chCUST_CD = list; }
	public void setList_PURPOSE_val(List list) { l_PURPOSE_val = list; }
	public void setList_PURPOSE_name(List list) { l_PURPOSE_name = list; }

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
			l_h_RESULT.add(((KA0030010Struct) list.get(i)).geth_RESULT());
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
			l_k_MODE.add(((KA0030010Struct) list.get(i)).getk_MODE());
		}
		return size;
	}
	public int setL2L_DEPO_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEPO_TYP_name == null) {
			l_DEPO_TYP_name = new ArrayList();
		} else {
			l_DEPO_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEPO_TYP_name.add(((KA0030010Struct) list.get(i)).getDEPO_TYP_name());
		}
		return size;
	}
	public int setL2L_DEPO_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEPO_TYP_val == null) {
			l_DEPO_TYP_val = new ArrayList();
		} else {
			l_DEPO_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEPO_TYP_val.add(((KA0030010Struct) list.get(i)).getDEPO_TYP_val());
		}
		return size;
	}
	public int setL2L_h_DEPO_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_DEPO_TYP == null) {
			l_h_DEPO_TYP = new ArrayList();
		} else {
			l_h_DEPO_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_DEPO_TYP.add(((KA0030010Struct) list.get(i)).geth_DEPO_TYP());
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
			l_strCOMPANY_CD.add(((KA0030010Struct) list.get(i)).getstrCOMPANY_CD());
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
			l_CUST_CD.add(((KA0030010Struct) list.get(i)).getCUST_CD());
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
			l_CUST_ITEM_CD.add(((KA0030010Struct) list.get(i)).getCUST_ITEM_CD());
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
			l_ITEM_CD.add(((KA0030010Struct) list.get(i)).getITEM_CD());
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
			l_CUST_ITEM_NAME.add(((KA0030010Struct) list.get(i)).getCUST_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_SALES_DEPT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SALES_DEPT_CD == null) {
			l_SALES_DEPT_CD = new ArrayList();
		} else {
			l_SALES_DEPT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SALES_DEPT_CD.add(((KA0030010Struct) list.get(i)).getSALES_DEPT_CD());
		}
		return size;
	}
	public int setL2L_NOTE1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NOTE1 == null) {
			l_NOTE1 = new ArrayList();
		} else {
			l_NOTE1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NOTE1.add(((KA0030010Struct) list.get(i)).getNOTE1());
		}
		return size;
	}
	public int setL2L_NOTE2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NOTE2 == null) {
			l_NOTE2 = new ArrayList();
		} else {
			l_NOTE2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NOTE2.add(((KA0030010Struct) list.get(i)).getNOTE2());
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
			l_DEPO_TYP.add(((KA0030010Struct) list.get(i)).getDEPO_TYP());
		}
		return size;
	}
	public int setL2L_TAX_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_CD == null) {
			l_TAX_CD = new ArrayList();
		} else {
			l_TAX_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_CD.add(((KA0030010Struct) list.get(i)).getTAX_CD());
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
			l_h_MODIFY_COUNT.add(((KA0030010Struct) list.get(i)).geth_MODIFY_COUNT());
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
			l_CUST_NAME.add(((KA0030010Struct) list.get(i)).getCUST_NAME());
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
			l_ITEM_NAME.add(((KA0030010Struct) list.get(i)).getITEM_NAME());
		}
		return size;
	}
	public int setL2L_ORG_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ORG_NAME == null) {
			l_ORG_NAME = new ArrayList();
		} else {
			l_ORG_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ORG_NAME.add(((KA0030010Struct) list.get(i)).getORG_NAME());
		}
		return size;
	}
	public int setL2L_TAX_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_NAME == null) {
			l_TAX_NAME = new ArrayList();
		} else {
			l_TAX_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_NAME.add(((KA0030010Struct) list.get(i)).getTAX_NAME());
		}
		return size;
	}
	public int setL2L_ch_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ch_ITEM_CD == null) {
			l_ch_ITEM_CD = new ArrayList();
		} else {
			l_ch_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ch_ITEM_CD.add(((KA0030010Struct) list.get(i)).getch_ITEM_CD());
		}
		return size;
	}
	public int setL2L_MRP_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_ODR_TYP == null) {
			l_MRP_ODR_TYP = new ArrayList();
		} else {
			l_MRP_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_ODR_TYP.add(((KA0030010Struct) list.get(i)).getMRP_ODR_TYP());
		}
		return size;
	}
	public int setL2L_chM_ORG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_chM_ORG_CD == null) {
			l_chM_ORG_CD = new ArrayList();
		} else {
			l_chM_ORG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_chM_ORG_CD.add(((KA0030010Struct) list.get(i)).getchM_ORG_CD());
		}
		return size;
	}
	public int setL2L_chITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_chITEM_CD == null) {
			l_chITEM_CD = new ArrayList();
		} else {
			l_chITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_chITEM_CD.add(((KA0030010Struct) list.get(i)).getchITEM_CD());
		}
		return size;
	}
	public int setL2L_chCUST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_chCUST_CD == null) {
			l_chCUST_CD = new ArrayList();
		} else {
			l_chCUST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_chCUST_CD.add(((KA0030010Struct) list.get(i)).getchCUST_CD());
		}
		return size;
	}
	public int setL2L_PURPOSE_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PURPOSE_val == null) {
			l_PURPOSE_val = new ArrayList();
		} else {
			l_PURPOSE_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PURPOSE_val.add(((KA0030010Struct) list.get(i)).getPURPOSE_val());
		}
		return size;
	}
	public int setL2L_PURPOSE_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PURPOSE_name == null) {
			l_PURPOSE_name = new ArrayList();
		} else {
			l_PURPOSE_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PURPOSE_name.add(((KA0030010Struct) list.get(i)).getPURPOSE_name());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_h_RESULT = null;
		m_k_MODE = null;
		m_DEPO_TYP_name = null;
		m_DEPO_TYP_val = null;
		m_h_DEPO_TYP = null;
		m_strCOMPANY_CD = null;
		m_CUST_CD = null;
		m_CUST_ITEM_CD = null;
		m_ITEM_CD = null;
		m_CUST_ITEM_NAME = null;
		m_SALES_DEPT_CD = null;
		m_NOTE1 = null;
		m_NOTE2 = null;
		m_DEPO_TYP = null;
		m_TAX_CD = null;
		m_h_MODIFY_COUNT = null;
		m_CUST_NAME = null;
		m_ITEM_NAME = null;
		m_ORG_NAME = null;
		m_TAX_NAME = null;
		m_ch_ITEM_CD = null;
		m_MRP_ODR_TYP = null;
		m_chM_ORG_CD = null;
		m_chITEM_CD = null;
		m_chCUST_CD = null;
		m_PURPOSE_val = null;
		m_PURPOSE_name = null;

		l_h_RESULT = null;
		l_k_MODE = null;
		l_DEPO_TYP_name = null;
		l_DEPO_TYP_val = null;
		l_h_DEPO_TYP = null;
		l_strCOMPANY_CD = null;
		l_CUST_CD = null;
		l_CUST_ITEM_CD = null;
		l_ITEM_CD = null;
		l_CUST_ITEM_NAME = null;
		l_SALES_DEPT_CD = null;
		l_NOTE1 = null;
		l_NOTE2 = null;
		l_DEPO_TYP = null;
		l_TAX_CD = null;
		l_h_MODIFY_COUNT = null;
		l_CUST_NAME = null;
		l_ITEM_NAME = null;
		l_ORG_NAME = null;
		l_TAX_NAME = null;
		l_ch_ITEM_CD = null;
		l_MRP_ODR_TYP = null;
		l_chM_ORG_CD = null;
		l_chITEM_CD = null;
		l_chCUST_CD = null;
		l_PURPOSE_val = null;
		l_PURPOSE_name = null;

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
	 * medKA0030010�N���X�̕W���R���X�g���N�^
	 */
	public KA0030010Struct()
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
	public void setStruct(KA0030010Struct struct)
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
	public void setStructM(KA0030010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.seth_RESULT(struct.geth_RESULT());
			this.setk_MODE(struct.getk_MODE());
			this.setDEPO_TYP_name(struct.getDEPO_TYP_name());
			this.setDEPO_TYP_val(struct.getDEPO_TYP_val());
			this.seth_DEPO_TYP(struct.geth_DEPO_TYP());
			this.setstrCOMPANY_CD(struct.getstrCOMPANY_CD());
			this.setCUST_CD(struct.getCUST_CD());
			this.setCUST_ITEM_CD(struct.getCUST_ITEM_CD());
			this.setITEM_CD(struct.getITEM_CD());
			this.setCUST_ITEM_NAME(struct.getCUST_ITEM_NAME());
			this.setSALES_DEPT_CD(struct.getSALES_DEPT_CD());
			this.setNOTE1(struct.getNOTE1());
			this.setNOTE2(struct.getNOTE2());
			this.setDEPO_TYP(struct.getDEPO_TYP());
			this.setTAX_CD(struct.getTAX_CD());
			this.seth_MODIFY_COUNT(struct.geth_MODIFY_COUNT());
			this.setCUST_NAME(struct.getCUST_NAME());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setORG_NAME(struct.getORG_NAME());
			this.setTAX_NAME(struct.getTAX_NAME());
			this.setch_ITEM_CD(struct.getch_ITEM_CD());
			this.setMRP_ODR_TYP(struct.getMRP_ODR_TYP());
			this.setchM_ORG_CD(struct.getchM_ORG_CD());
			this.setchITEM_CD(struct.getchITEM_CD());
			this.setchCUST_CD(struct.getchCUST_CD());
			this.setPURPOSE_val(struct.getPURPOSE_val());
			this.setPURPOSE_name(struct.getPURPOSE_name());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(KA0030010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_h_RESULT(struct.getList_h_RESULT());
			this.setList_k_MODE(struct.getList_k_MODE());
			this.setList_DEPO_TYP_name(struct.getList_DEPO_TYP_name());
			this.setList_DEPO_TYP_val(struct.getList_DEPO_TYP_val());
			this.setList_h_DEPO_TYP(struct.getList_h_DEPO_TYP());
			this.setList_strCOMPANY_CD(struct.getList_strCOMPANY_CD());
			this.setList_CUST_CD(struct.getList_CUST_CD());
			this.setList_CUST_ITEM_CD(struct.getList_CUST_ITEM_CD());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_CUST_ITEM_NAME(struct.getList_CUST_ITEM_NAME());
			this.setList_SALES_DEPT_CD(struct.getList_SALES_DEPT_CD());
			this.setList_NOTE1(struct.getList_NOTE1());
			this.setList_NOTE2(struct.getList_NOTE2());
			this.setList_DEPO_TYP(struct.getList_DEPO_TYP());
			this.setList_TAX_CD(struct.getList_TAX_CD());
			this.setList_h_MODIFY_COUNT(struct.getList_h_MODIFY_COUNT());
			this.setList_CUST_NAME(struct.getList_CUST_NAME());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_ORG_NAME(struct.getList_ORG_NAME());
			this.setList_TAX_NAME(struct.getList_TAX_NAME());
			this.setList_ch_ITEM_CD(struct.getList_ch_ITEM_CD());
			this.setList_MRP_ODR_TYP(struct.getList_MRP_ODR_TYP());
			this.setList_chM_ORG_CD(struct.getList_chM_ORG_CD());
			this.setList_chITEM_CD(struct.getList_chITEM_CD());
			this.setList_chCUST_CD(struct.getList_chCUST_CD());
			this.setList_PURPOSE_val(struct.getList_PURPOSE_val());
			this.setList_PURPOSE_name(struct.getList_PURPOSE_name());
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
	// �� 1 �ϐ������l�F i_h_RESULT


	final static String i_h_RESULT = null;

	// �� 2 �ϐ������l�F i_k_MODE


	final static String i_k_MODE = null;

	// �� 3 �ϐ������l�F i_DEPO_TYP_name


	final static String i_DEPO_TYP_name = null;

	// �� 4 �ϐ������l�F i_DEPO_TYP_val


	final static String i_DEPO_TYP_val = null;

	// �� 5 �ϐ������l�F i_h_DEPO_TYP


	final static Double i_h_DEPO_TYP = null;

	// �� 6 �ϐ������l�F i_strCOMPANY_CD


	final static String i_strCOMPANY_CD = null;

	// �� 7 �ϐ������l�F i_CUST_CD


	final static String i_CUST_CD = null;

	// �� 8 �ϐ������l�F i_CUST_ITEM_CD


	final static String i_CUST_ITEM_CD = null;

	// �� 9 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 10 �ϐ������l�F i_CUST_ITEM_NAME


	final static String i_CUST_ITEM_NAME = null;

	// �� 11 �ϐ������l�F i_SALES_DEPT_CD


	final static String i_SALES_DEPT_CD = null;

	// �� 12 �ϐ������l�F i_NOTE1


	final static String i_NOTE1 = null;

	// �� 13 �ϐ������l�F i_NOTE2


	final static String i_NOTE2 = null;

	// �� 14 �ϐ������l�F i_DEPO_TYP


	final static String i_DEPO_TYP = null;

	// �� 15 �ϐ������l�F i_TAX_CD


	final static String i_TAX_CD = null;

	// �� 16 �ϐ������l�F i_h_MODIFY_COUNT


	final static String i_h_MODIFY_COUNT = null;

	// �� 17 �ϐ������l�F i_CUST_NAME


	final static String i_CUST_NAME = null;

	// �� 18 �ϐ������l�F i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// �� 19 �ϐ������l�F i_ORG_NAME


	final static String i_ORG_NAME = null;

	// �� 20 �ϐ������l�F i_TAX_NAME


	final static String i_TAX_NAME = null;

	// �� 21 �ϐ������l�F i_ch_ITEM_CD


	final static String i_ch_ITEM_CD = null;

	// �� 22 �ϐ������l�F i_MRP_ODR_TYP


	final static String i_MRP_ODR_TYP = null;

	// �� 23 �ϐ������l�F i_chM_ORG_CD


	final static String i_chM_ORG_CD = null;

	// �� 24 �ϐ������l�F i_chITEM_CD


	final static String i_chITEM_CD = null;

	// �� 25 �ϐ������l�F i_chCUST_CD


	final static String i_chCUST_CD = null;

	// �� 26 �ϐ������l�F i_PURPOSE_val


	final static String i_PURPOSE_val = null;

	// �� 27 �ϐ������l�F i_PURPOSE_name


	final static String i_PURPOSE_name = null;

*/

	//{{user_implement_code
         // TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
         // �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
        // �� 1 �ϐ������l�F i_strCOMPANY_CD
        final static String i_strCOMPANY_CD = null;
        // �� 2 �ϐ������l�F i_CUST_CD
        final static String i_CUST_CD = null;
        // �� 3 �ϐ������l�F i_CUST_ITEM_CD
        final static String i_CUST_ITEM_CD = null;
        // �� 4 �ϐ������l�F i_ITEM_CD
        final static String i_ITEM_CD = null;
        // �� 5 �ϐ������l�F i_CUST_ITEM_NAME
        final static String i_CUST_ITEM_NAME = null;
        // �� 6 �ϐ������l�F i_SALES_DEPT_CD
        final static String i_SALES_DEPT_CD = null;
        // �� 7 �ϐ������l�F i_ODR_ACPT_COND_TERM
        //final static String i_ODR_ACPT_COND_TERM = null;
        // �� 8 �ϐ������l�F i_NOTE1
        final static String i_NOTE1 = null;
        // �� 9 �ϐ������l�F i_NOTE2
        final static String i_NOTE2 = null;
        // �� 10 �ϐ������l�F i_TAX_CD
        final static String i_TAX_CD = null;
        // �� 11 �ϐ������l�F i_h_MODIFY_COUNT
        final static String i_h_MODIFY_COUNT = null;
        // �� 12 �ϐ������l�F i_ch_ITEM_CD
        final static String i_ch_ITEM_CD = null;
        // �� 13 �ϐ������l�F i_chM_ORG_CD
        final static String i_chM_ORG_CD = null;
        // �� 14 �ϐ������l�F i_chITEM_CD
        final static String i_chITEM_CD = null;
        // �� 15 �ϐ������l�F i_chCUST_CD
        final static String i_chCUST_CD = null;
        // �� 16 �ϐ������l�F i_PURPOSE_val
        final static String i_PURPOSE_val = null;
        // �� 17 �ϐ������l�F i_PURPOSE_name
        final static String i_PURPOSE_name = null;
        // �� 18 �ϐ������l�F i_h_RESULT
        final static String i_h_RESULT = null;
        // �� 19 �ϐ������l�F i_k_MODE
        final static String i_k_MODE = null;
       
           // �� 20 �ϐ������l�F i_DEPO_TYP
           final static String i_DEPO_TYP = new String("10");
       
        /**
         * ������
         *
         */
        public void initialize()
        {
       
         clear();
       
         m_strCOMPANY_CD = i_strCOMPANY_CD;
         m_CUST_CD = i_CUST_CD;
         m_CUST_ITEM_CD = i_CUST_ITEM_CD;
         m_ITEM_CD = i_ITEM_CD;
         m_CUST_ITEM_NAME = i_CUST_ITEM_NAME;
         m_SALES_DEPT_CD = i_SALES_DEPT_CD;
         //m_ODR_ACPT_COND_TERM = i_ODR_ACPT_COND_TERM;
         m_NOTE1 = i_NOTE1;
         m_NOTE2 = i_NOTE2;
         m_TAX_CD = i_TAX_CD;
         m_h_MODIFY_COUNT = i_h_MODIFY_COUNT;
         m_ch_ITEM_CD = i_ch_ITEM_CD;
         m_chM_ORG_CD = i_chM_ORG_CD;
         m_chITEM_CD = i_chITEM_CD;
         m_chCUST_CD = i_chCUST_CD;
         m_PURPOSE_val = i_PURPOSE_val;
         m_PURPOSE_name = i_PURPOSE_name;
         m_h_RESULT = i_h_RESULT;
         m_k_MODE = i_k_MODE;
               m_DEPO_TYP = i_DEPO_TYP;
       
               m_CUST_NAME = null;
               m_ITEM_NAME = null;
               m_ORG_NAME = null;
               m_TAX_NAME = null;
        }
       
        public void copy(KA0030010Struct s)
        {
         clear();
               if(s.m_ITEM_CD  != null)  m_ITEM_CD  = new String(s.m_ITEM_CD );
               if(s.m_CUST_CD  != null)  m_CUST_CD  = new String(s.m_CUST_CD );
               if(s.m_CUST_ITEM_CD  != null)  m_CUST_ITEM_CD  = new String(s.m_CUST_ITEM_CD );
               if(s.m_CUST_ITEM_NAME  != null)  m_CUST_ITEM_NAME  = new String(s.m_CUST_ITEM_NAME );
               if(s.m_SALES_DEPT_CD  != null)  m_SALES_DEPT_CD  = new String(s.m_SALES_DEPT_CD );
               //if(s.m_ODR_ACPT_COND_TERM  != null)  m_ODR_ACPT_COND_TERM  = new String(s.m_ODR_ACPT_COND_TERM );
               if(s.m_NOTE1  != null)  m_NOTE1  = new String(s.m_NOTE1 );
               if(s.m_TAX_CD  != null)  m_TAX_CD  = new String(s.m_TAX_CD );
               if(s.m_NOTE2  != null)  m_NOTE2  = new String(s.m_NOTE2 );
               if(s.m_h_RESULT  != null)  m_h_RESULT  = new String(s.m_h_RESULT );
               if(s.m_k_MODE  != null)  m_k_MODE  = new String(s.m_k_MODE );
               if(s.m_PURPOSE_name  != null)  m_PURPOSE_name  = new String(s.m_PURPOSE_name );
               if(s.m_PURPOSE_val  != null)  m_PURPOSE_val  = new String(s.m_PURPOSE_val );
               if(s.m_strCOMPANY_CD  != null)  m_strCOMPANY_CD  = new String(s.m_strCOMPANY_CD );
               if(s.m_h_MODIFY_COUNT  != null)  m_h_MODIFY_COUNT  = new String(s.m_h_MODIFY_COUNT );
               if(s.m_DEPO_TYP != null) m_DEPO_TYP = new String(s.m_DEPO_TYP );
       
               if(s.m_CUST_NAME != null) m_CUST_NAME = new String(s.m_CUST_NAME );
               if(s.m_ITEM_NAME != null) m_ITEM_NAME = new String(s.m_ITEM_NAME );
               if(s.m_ORG_NAME != null) m_ORG_NAME = new String(s.m_ORG_NAME );
               if(s.m_TAX_NAME != null) m_TAX_NAME = new String(s.m_TAX_NAME );
        }
       
         // TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
