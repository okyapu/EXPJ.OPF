/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0180/src/com/nec/jp/orteus/metamorBase/AA0180/AA0180020Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0180;

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

public class AA0180020Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_ToUp_ITEM_NAME */
	public String m_ToUp_ITEM_NAME = null;
	/** �� 2 �ϐ��F m_TargetDate */
	public String m_TargetDate = null;
	/** �� 3 �ϐ��F m_DEVELOP_TYP */
	public String m_DEVELOP_TYP = null;
	/** �� 4 �ϐ��F m_Fr_PS_EDITION */
	public String m_Fr_PS_EDITION = null;
	/** �� 5 �ϐ��F m_Fr_EFF_PHASE_IN_DATE */
	public String m_Fr_EFF_PHASE_IN_DATE = null;
	/** �� 6 �ϐ��F m_Fr_EFF_PHASE_OUT_DATE */
	public String m_Fr_EFF_PHASE_OUT_DATE = null;
	/** �� 7 �ϐ��F m_h_Fr_MODIFY_COUNT */
	public String m_h_Fr_MODIFY_COUNT = null;
	/** �� 8 �ϐ��F m_ToLo_ITEM_CD */
	public String m_ToLo_ITEM_CD = null;
	/** �� 9 �ϐ��F m_To_PS_EDITION */
	public String m_To_PS_EDITION = null;
	/** �� 10 �ϐ��F m_ToLo_ITEM_NAME */
	public String m_ToLo_ITEM_NAME = null;
	/** �� 11 �ϐ��F m_To_EFF_PHASE_IN_DATE */
	public String m_To_EFF_PHASE_IN_DATE = null;
	/** �� 12 �ϐ��F m_To_EFF_PHASE_OUT_DATE */
	public String m_To_EFF_PHASE_OUT_DATE = null;
	/** �� 13 �ϐ��F m_h_FrUp_ITEM_CD */
	public String m_h_FrUp_ITEM_CD = null;
	/** �� 14 �ϐ��F m_h_ToUp_ITEM_CD */
	public String m_h_ToUp_ITEM_CD = null;
	/** �� 15 �ϐ��F m_h_TargetDate */
	public String m_h_TargetDate = null;
	/** �� 16 �ϐ��F m_h_DEVELOP_TYP */
	public String m_h_DEVELOP_TYP = null;
	/** �� 17 �ϐ��F m_DEVELOP_TYP_name */
	public String m_DEVELOP_TYP_name = null;
	/** �� 18 �ϐ��F m_DEVELOP_TYP_val */
	public String m_DEVELOP_TYP_val = null;
	/** �� 19 �ϐ��F m_FrUp_ITEM_NAME */
	public String m_FrUp_ITEM_NAME = null;
	/** �� 20 �ϐ��F m_FrUp_ITEM_CD */
	public String m_FrUp_ITEM_CD = null;
	/** �� 21 �ϐ��F m_FrLo_ITEM_CD */
	public String m_FrLo_ITEM_CD = null;
	/** �� 22 �ϐ��F m_ToUp_ITEM_CD */
	public String m_ToUp_ITEM_CD = null;
	/** �� 23 �ϐ��F m_FrLo_ITEM_NAME */
	public String m_FrLo_ITEM_NAME = null;
	/** �� 24 �ϐ��F m_CK_ITEM_CD */
	public String m_CK_ITEM_CD = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_ToUp_ITEM_NAME */
	public List l_ToUp_ITEM_NAME = null;

	/** �� 2 List�ϐ��F l_TargetDate */
	public List l_TargetDate = null;

	/** �� 3 List�ϐ��F l_DEVELOP_TYP */
	public List l_DEVELOP_TYP = null;

	/** �� 4 List�ϐ��F l_Fr_PS_EDITION */
	public List l_Fr_PS_EDITION = null;

	/** �� 5 List�ϐ��F l_Fr_EFF_PHASE_IN_DATE */
	public List l_Fr_EFF_PHASE_IN_DATE = null;

	/** �� 6 List�ϐ��F l_Fr_EFF_PHASE_OUT_DATE */
	public List l_Fr_EFF_PHASE_OUT_DATE = null;

	/** �� 7 List�ϐ��F l_h_Fr_MODIFY_COUNT */
	public List l_h_Fr_MODIFY_COUNT = null;

	/** �� 8 List�ϐ��F l_ToLo_ITEM_CD */
	public List l_ToLo_ITEM_CD = null;

	/** �� 9 List�ϐ��F l_To_PS_EDITION */
	public List l_To_PS_EDITION = null;

	/** �� 10 List�ϐ��F l_ToLo_ITEM_NAME */
	public List l_ToLo_ITEM_NAME = null;

	/** �� 11 List�ϐ��F l_To_EFF_PHASE_IN_DATE */
	public List l_To_EFF_PHASE_IN_DATE = null;

	/** �� 12 List�ϐ��F l_To_EFF_PHASE_OUT_DATE */
	public List l_To_EFF_PHASE_OUT_DATE = null;

	/** �� 13 List�ϐ��F l_h_FrUp_ITEM_CD */
	public List l_h_FrUp_ITEM_CD = null;

	/** �� 14 List�ϐ��F l_h_ToUp_ITEM_CD */
	public List l_h_ToUp_ITEM_CD = null;

	/** �� 15 List�ϐ��F l_h_TargetDate */
	public List l_h_TargetDate = null;

	/** �� 16 List�ϐ��F l_h_DEVELOP_TYP */
	public List l_h_DEVELOP_TYP = null;

	/** �� 17 List�ϐ��F l_DEVELOP_TYP_name */
	public List l_DEVELOP_TYP_name = null;

	/** �� 18 List�ϐ��F l_DEVELOP_TYP_val */
	public List l_DEVELOP_TYP_val = null;

	/** �� 19 List�ϐ��F l_FrUp_ITEM_NAME */
	public List l_FrUp_ITEM_NAME = null;

	/** �� 20 List�ϐ��F l_FrUp_ITEM_CD */
	public List l_FrUp_ITEM_CD = null;

	/** �� 21 List�ϐ��F l_FrLo_ITEM_CD */
	public List l_FrLo_ITEM_CD = null;

	/** �� 22 List�ϐ��F l_ToUp_ITEM_CD */
	public List l_ToUp_ITEM_CD = null;

	/** �� 23 List�ϐ��F l_FrLo_ITEM_NAME */
	public List l_FrLo_ITEM_NAME = null;

	/** �� 24 List�ϐ��F l_CK_ITEM_CD */
	public List l_CK_ITEM_CD = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getToUp_ITEM_NAME() { return m_ToUp_ITEM_NAME; }
	public String getTargetDate() { return m_TargetDate; }
	public String getDEVELOP_TYP() { return m_DEVELOP_TYP; }
	public String getFr_PS_EDITION() { return m_Fr_PS_EDITION; }
	public String getFr_EFF_PHASE_IN_DATE() { return m_Fr_EFF_PHASE_IN_DATE; }
	public String getFr_EFF_PHASE_OUT_DATE() { return m_Fr_EFF_PHASE_OUT_DATE; }
	public String geth_Fr_MODIFY_COUNT() { return m_h_Fr_MODIFY_COUNT; }
	public String getToLo_ITEM_CD() { return m_ToLo_ITEM_CD; }
	public String getTo_PS_EDITION() { return m_To_PS_EDITION; }
	public String getToLo_ITEM_NAME() { return m_ToLo_ITEM_NAME; }
	public String getTo_EFF_PHASE_IN_DATE() { return m_To_EFF_PHASE_IN_DATE; }
	public String getTo_EFF_PHASE_OUT_DATE() { return m_To_EFF_PHASE_OUT_DATE; }
	public String geth_FrUp_ITEM_CD() { return m_h_FrUp_ITEM_CD; }
	public String geth_ToUp_ITEM_CD() { return m_h_ToUp_ITEM_CD; }
	public String geth_TargetDate() { return m_h_TargetDate; }
	public String geth_DEVELOP_TYP() { return m_h_DEVELOP_TYP; }
	public String getDEVELOP_TYP_name() { return m_DEVELOP_TYP_name; }
	public String getDEVELOP_TYP_val() { return m_DEVELOP_TYP_val; }
	public String getFrUp_ITEM_NAME() { return m_FrUp_ITEM_NAME; }
	public String getFrUp_ITEM_CD() { return m_FrUp_ITEM_CD; }
	public String getFrLo_ITEM_CD() { return m_FrLo_ITEM_CD; }
	public String getToUp_ITEM_CD() { return m_ToUp_ITEM_CD; }
	public String getFrLo_ITEM_NAME() { return m_FrLo_ITEM_NAME; }
	public String getCK_ITEM_CD() { return m_CK_ITEM_CD; }

	public List getList_ToUp_ITEM_NAME() { return l_ToUp_ITEM_NAME; }
	public List getList_TargetDate() { return l_TargetDate; }
	public List getList_DEVELOP_TYP() { return l_DEVELOP_TYP; }
	public List getList_Fr_PS_EDITION() { return l_Fr_PS_EDITION; }
	public List getList_Fr_EFF_PHASE_IN_DATE() { return l_Fr_EFF_PHASE_IN_DATE; }
	public List getList_Fr_EFF_PHASE_OUT_DATE() { return l_Fr_EFF_PHASE_OUT_DATE; }
	public List getList_h_Fr_MODIFY_COUNT() { return l_h_Fr_MODIFY_COUNT; }
	public List getList_ToLo_ITEM_CD() { return l_ToLo_ITEM_CD; }
	public List getList_To_PS_EDITION() { return l_To_PS_EDITION; }
	public List getList_ToLo_ITEM_NAME() { return l_ToLo_ITEM_NAME; }
	public List getList_To_EFF_PHASE_IN_DATE() { return l_To_EFF_PHASE_IN_DATE; }
	public List getList_To_EFF_PHASE_OUT_DATE() { return l_To_EFF_PHASE_OUT_DATE; }
	public List getList_h_FrUp_ITEM_CD() { return l_h_FrUp_ITEM_CD; }
	public List getList_h_ToUp_ITEM_CD() { return l_h_ToUp_ITEM_CD; }
	public List getList_h_TargetDate() { return l_h_TargetDate; }
	public List getList_h_DEVELOP_TYP() { return l_h_DEVELOP_TYP; }
	public List getList_DEVELOP_TYP_name() { return l_DEVELOP_TYP_name; }
	public List getList_DEVELOP_TYP_val() { return l_DEVELOP_TYP_val; }
	public List getList_FrUp_ITEM_NAME() { return l_FrUp_ITEM_NAME; }
	public List getList_FrUp_ITEM_CD() { return l_FrUp_ITEM_CD; }
	public List getList_FrLo_ITEM_CD() { return l_FrLo_ITEM_CD; }
	public List getList_ToUp_ITEM_CD() { return l_ToUp_ITEM_CD; }
	public List getList_FrLo_ITEM_NAME() { return l_FrLo_ITEM_NAME; }
	public List getList_CK_ITEM_CD() { return l_CK_ITEM_CD; }

	public void setToUp_ITEM_NAME(String val) { m_ToUp_ITEM_NAME = val; }
	public void setTargetDate(String val) { m_TargetDate = val; }
	public void setDEVELOP_TYP(String val) { m_DEVELOP_TYP = val; }
	public void setFr_PS_EDITION(String val) { m_Fr_PS_EDITION = val; }
	public void setFr_EFF_PHASE_IN_DATE(String val) { m_Fr_EFF_PHASE_IN_DATE = val; }
	public void setFr_EFF_PHASE_OUT_DATE(String val) { m_Fr_EFF_PHASE_OUT_DATE = val; }
	public void seth_Fr_MODIFY_COUNT(String val) { m_h_Fr_MODIFY_COUNT = val; }
	public void setToLo_ITEM_CD(String val) { m_ToLo_ITEM_CD = val; }
	public void setTo_PS_EDITION(String val) { m_To_PS_EDITION = val; }
	public void setToLo_ITEM_NAME(String val) { m_ToLo_ITEM_NAME = val; }
	public void setTo_EFF_PHASE_IN_DATE(String val) { m_To_EFF_PHASE_IN_DATE = val; }
	public void setTo_EFF_PHASE_OUT_DATE(String val) { m_To_EFF_PHASE_OUT_DATE = val; }
	public void seth_FrUp_ITEM_CD(String val) { m_h_FrUp_ITEM_CD = val; }
	public void seth_ToUp_ITEM_CD(String val) { m_h_ToUp_ITEM_CD = val; }
	public void seth_TargetDate(String val) { m_h_TargetDate = val; }
	public void seth_DEVELOP_TYP(String val) { m_h_DEVELOP_TYP = val; }
	public void setDEVELOP_TYP_name(String val) { m_DEVELOP_TYP_name = val; }
	public void setDEVELOP_TYP_val(String val) { m_DEVELOP_TYP_val = val; }
	public void setFrUp_ITEM_NAME(String val) { m_FrUp_ITEM_NAME = val; }
	public void setFrUp_ITEM_CD(String val) { m_FrUp_ITEM_CD = val; }
	public void setFrLo_ITEM_CD(String val) { m_FrLo_ITEM_CD = val; }
	public void setToUp_ITEM_CD(String val) { m_ToUp_ITEM_CD = val; }
	public void setFrLo_ITEM_NAME(String val) { m_FrLo_ITEM_NAME = val; }
	public void setCK_ITEM_CD(String val) { m_CK_ITEM_CD = val; }


	public void setList_ToUp_ITEM_NAME(List list) { l_ToUp_ITEM_NAME = list; }
	public void setList_TargetDate(List list) { l_TargetDate = list; }
	public void setList_DEVELOP_TYP(List list) { l_DEVELOP_TYP = list; }
	public void setList_Fr_PS_EDITION(List list) { l_Fr_PS_EDITION = list; }
	public void setList_Fr_EFF_PHASE_IN_DATE(List list) { l_Fr_EFF_PHASE_IN_DATE = list; }
	public void setList_Fr_EFF_PHASE_OUT_DATE(List list) { l_Fr_EFF_PHASE_OUT_DATE = list; }
	public void setList_h_Fr_MODIFY_COUNT(List list) { l_h_Fr_MODIFY_COUNT = list; }
	public void setList_ToLo_ITEM_CD(List list) { l_ToLo_ITEM_CD = list; }
	public void setList_To_PS_EDITION(List list) { l_To_PS_EDITION = list; }
	public void setList_ToLo_ITEM_NAME(List list) { l_ToLo_ITEM_NAME = list; }
	public void setList_To_EFF_PHASE_IN_DATE(List list) { l_To_EFF_PHASE_IN_DATE = list; }
	public void setList_To_EFF_PHASE_OUT_DATE(List list) { l_To_EFF_PHASE_OUT_DATE = list; }
	public void setList_h_FrUp_ITEM_CD(List list) { l_h_FrUp_ITEM_CD = list; }
	public void setList_h_ToUp_ITEM_CD(List list) { l_h_ToUp_ITEM_CD = list; }
	public void setList_h_TargetDate(List list) { l_h_TargetDate = list; }
	public void setList_h_DEVELOP_TYP(List list) { l_h_DEVELOP_TYP = list; }
	public void setList_DEVELOP_TYP_name(List list) { l_DEVELOP_TYP_name = list; }
	public void setList_DEVELOP_TYP_val(List list) { l_DEVELOP_TYP_val = list; }
	public void setList_FrUp_ITEM_NAME(List list) { l_FrUp_ITEM_NAME = list; }
	public void setList_FrUp_ITEM_CD(List list) { l_FrUp_ITEM_CD = list; }
	public void setList_FrLo_ITEM_CD(List list) { l_FrLo_ITEM_CD = list; }
	public void setList_ToUp_ITEM_CD(List list) { l_ToUp_ITEM_CD = list; }
	public void setList_FrLo_ITEM_NAME(List list) { l_FrLo_ITEM_NAME = list; }
	public void setList_CK_ITEM_CD(List list) { l_CK_ITEM_CD = list; }

	public int setL2L_ToUp_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ToUp_ITEM_NAME == null) {
			l_ToUp_ITEM_NAME = new ArrayList();
		} else {
			l_ToUp_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ToUp_ITEM_NAME.add(((AA0180020Struct) list.get(i)).getToUp_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_TargetDate(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TargetDate == null) {
			l_TargetDate = new ArrayList();
		} else {
			l_TargetDate.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TargetDate.add(((AA0180020Struct) list.get(i)).getTargetDate());
		}
		return size;
	}
	public int setL2L_DEVELOP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEVELOP_TYP == null) {
			l_DEVELOP_TYP = new ArrayList();
		} else {
			l_DEVELOP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEVELOP_TYP.add(((AA0180020Struct) list.get(i)).getDEVELOP_TYP());
		}
		return size;
	}
	public int setL2L_Fr_PS_EDITION(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Fr_PS_EDITION == null) {
			l_Fr_PS_EDITION = new ArrayList();
		} else {
			l_Fr_PS_EDITION.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Fr_PS_EDITION.add(((AA0180020Struct) list.get(i)).getFr_PS_EDITION());
		}
		return size;
	}
	public int setL2L_Fr_EFF_PHASE_IN_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Fr_EFF_PHASE_IN_DATE == null) {
			l_Fr_EFF_PHASE_IN_DATE = new ArrayList();
		} else {
			l_Fr_EFF_PHASE_IN_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Fr_EFF_PHASE_IN_DATE.add(((AA0180020Struct) list.get(i)).getFr_EFF_PHASE_IN_DATE());
		}
		return size;
	}
	public int setL2L_Fr_EFF_PHASE_OUT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Fr_EFF_PHASE_OUT_DATE == null) {
			l_Fr_EFF_PHASE_OUT_DATE = new ArrayList();
		} else {
			l_Fr_EFF_PHASE_OUT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Fr_EFF_PHASE_OUT_DATE.add(((AA0180020Struct) list.get(i)).getFr_EFF_PHASE_OUT_DATE());
		}
		return size;
	}
	public int setL2L_h_Fr_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_Fr_MODIFY_COUNT == null) {
			l_h_Fr_MODIFY_COUNT = new ArrayList();
		} else {
			l_h_Fr_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_Fr_MODIFY_COUNT.add(((AA0180020Struct) list.get(i)).geth_Fr_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_ToLo_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ToLo_ITEM_CD == null) {
			l_ToLo_ITEM_CD = new ArrayList();
		} else {
			l_ToLo_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ToLo_ITEM_CD.add(((AA0180020Struct) list.get(i)).getToLo_ITEM_CD());
		}
		return size;
	}
	public int setL2L_To_PS_EDITION(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_To_PS_EDITION == null) {
			l_To_PS_EDITION = new ArrayList();
		} else {
			l_To_PS_EDITION.clear();
		}
		for (int i = 0; i < size; i++) {
			l_To_PS_EDITION.add(((AA0180020Struct) list.get(i)).getTo_PS_EDITION());
		}
		return size;
	}
	public int setL2L_ToLo_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ToLo_ITEM_NAME == null) {
			l_ToLo_ITEM_NAME = new ArrayList();
		} else {
			l_ToLo_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ToLo_ITEM_NAME.add(((AA0180020Struct) list.get(i)).getToLo_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_To_EFF_PHASE_IN_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_To_EFF_PHASE_IN_DATE == null) {
			l_To_EFF_PHASE_IN_DATE = new ArrayList();
		} else {
			l_To_EFF_PHASE_IN_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_To_EFF_PHASE_IN_DATE.add(((AA0180020Struct) list.get(i)).getTo_EFF_PHASE_IN_DATE());
		}
		return size;
	}
	public int setL2L_To_EFF_PHASE_OUT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_To_EFF_PHASE_OUT_DATE == null) {
			l_To_EFF_PHASE_OUT_DATE = new ArrayList();
		} else {
			l_To_EFF_PHASE_OUT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_To_EFF_PHASE_OUT_DATE.add(((AA0180020Struct) list.get(i)).getTo_EFF_PHASE_OUT_DATE());
		}
		return size;
	}
	public int setL2L_h_FrUp_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_FrUp_ITEM_CD == null) {
			l_h_FrUp_ITEM_CD = new ArrayList();
		} else {
			l_h_FrUp_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_FrUp_ITEM_CD.add(((AA0180020Struct) list.get(i)).geth_FrUp_ITEM_CD());
		}
		return size;
	}
	public int setL2L_h_ToUp_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ToUp_ITEM_CD == null) {
			l_h_ToUp_ITEM_CD = new ArrayList();
		} else {
			l_h_ToUp_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ToUp_ITEM_CD.add(((AA0180020Struct) list.get(i)).geth_ToUp_ITEM_CD());
		}
		return size;
	}
	public int setL2L_h_TargetDate(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_TargetDate == null) {
			l_h_TargetDate = new ArrayList();
		} else {
			l_h_TargetDate.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_TargetDate.add(((AA0180020Struct) list.get(i)).geth_TargetDate());
		}
		return size;
	}
	public int setL2L_h_DEVELOP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_DEVELOP_TYP == null) {
			l_h_DEVELOP_TYP = new ArrayList();
		} else {
			l_h_DEVELOP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_DEVELOP_TYP.add(((AA0180020Struct) list.get(i)).geth_DEVELOP_TYP());
		}
		return size;
	}
	public int setL2L_DEVELOP_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEVELOP_TYP_name == null) {
			l_DEVELOP_TYP_name = new ArrayList();
		} else {
			l_DEVELOP_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEVELOP_TYP_name.add(((AA0180020Struct) list.get(i)).getDEVELOP_TYP_name());
		}
		return size;
	}
	public int setL2L_DEVELOP_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEVELOP_TYP_val == null) {
			l_DEVELOP_TYP_val = new ArrayList();
		} else {
			l_DEVELOP_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEVELOP_TYP_val.add(((AA0180020Struct) list.get(i)).getDEVELOP_TYP_val());
		}
		return size;
	}
	public int setL2L_FrUp_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FrUp_ITEM_NAME == null) {
			l_FrUp_ITEM_NAME = new ArrayList();
		} else {
			l_FrUp_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FrUp_ITEM_NAME.add(((AA0180020Struct) list.get(i)).getFrUp_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_FrUp_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FrUp_ITEM_CD == null) {
			l_FrUp_ITEM_CD = new ArrayList();
		} else {
			l_FrUp_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FrUp_ITEM_CD.add(((AA0180020Struct) list.get(i)).getFrUp_ITEM_CD());
		}
		return size;
	}
	public int setL2L_FrLo_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FrLo_ITEM_CD == null) {
			l_FrLo_ITEM_CD = new ArrayList();
		} else {
			l_FrLo_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FrLo_ITEM_CD.add(((AA0180020Struct) list.get(i)).getFrLo_ITEM_CD());
		}
		return size;
	}
	public int setL2L_ToUp_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ToUp_ITEM_CD == null) {
			l_ToUp_ITEM_CD = new ArrayList();
		} else {
			l_ToUp_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ToUp_ITEM_CD.add(((AA0180020Struct) list.get(i)).getToUp_ITEM_CD());
		}
		return size;
	}
	public int setL2L_FrLo_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FrLo_ITEM_NAME == null) {
			l_FrLo_ITEM_NAME = new ArrayList();
		} else {
			l_FrLo_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FrLo_ITEM_NAME.add(((AA0180020Struct) list.get(i)).getFrLo_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_CK_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CK_ITEM_CD == null) {
			l_CK_ITEM_CD = new ArrayList();
		} else {
			l_CK_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CK_ITEM_CD.add(((AA0180020Struct) list.get(i)).getCK_ITEM_CD());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_ToUp_ITEM_NAME = null;
		m_TargetDate = null;
		m_DEVELOP_TYP = null;
		m_Fr_PS_EDITION = null;
		m_Fr_EFF_PHASE_IN_DATE = null;
		m_Fr_EFF_PHASE_OUT_DATE = null;
		m_h_Fr_MODIFY_COUNT = null;
		m_ToLo_ITEM_CD = null;
		m_To_PS_EDITION = null;
		m_ToLo_ITEM_NAME = null;
		m_To_EFF_PHASE_IN_DATE = null;
		m_To_EFF_PHASE_OUT_DATE = null;
		m_h_FrUp_ITEM_CD = null;
		m_h_ToUp_ITEM_CD = null;
		m_h_TargetDate = null;
		m_h_DEVELOP_TYP = null;
		m_DEVELOP_TYP_name = null;
		m_DEVELOP_TYP_val = null;
		m_FrUp_ITEM_NAME = null;
		m_FrUp_ITEM_CD = null;
		m_FrLo_ITEM_CD = null;
		m_ToUp_ITEM_CD = null;
		m_FrLo_ITEM_NAME = null;
		m_CK_ITEM_CD = null;

		l_ToUp_ITEM_NAME = null;
		l_TargetDate = null;
		l_DEVELOP_TYP = null;
		l_Fr_PS_EDITION = null;
		l_Fr_EFF_PHASE_IN_DATE = null;
		l_Fr_EFF_PHASE_OUT_DATE = null;
		l_h_Fr_MODIFY_COUNT = null;
		l_ToLo_ITEM_CD = null;
		l_To_PS_EDITION = null;
		l_ToLo_ITEM_NAME = null;
		l_To_EFF_PHASE_IN_DATE = null;
		l_To_EFF_PHASE_OUT_DATE = null;
		l_h_FrUp_ITEM_CD = null;
		l_h_ToUp_ITEM_CD = null;
		l_h_TargetDate = null;
		l_h_DEVELOP_TYP = null;
		l_DEVELOP_TYP_name = null;
		l_DEVELOP_TYP_val = null;
		l_FrUp_ITEM_NAME = null;
		l_FrUp_ITEM_CD = null;
		l_FrLo_ITEM_CD = null;
		l_ToUp_ITEM_CD = null;
		l_FrLo_ITEM_NAME = null;
		l_CK_ITEM_CD = null;

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
	 * medAA0180020�N���X�̕W���R���X�g���N�^
	 */
	public AA0180020Struct()
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
	public void setStruct(AA0180020Struct struct)
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
	public void setStructM(AA0180020Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setToUp_ITEM_NAME(struct.getToUp_ITEM_NAME());
			this.setTargetDate(struct.getTargetDate());
			this.setDEVELOP_TYP(struct.getDEVELOP_TYP());
			this.setFr_PS_EDITION(struct.getFr_PS_EDITION());
			this.setFr_EFF_PHASE_IN_DATE(struct.getFr_EFF_PHASE_IN_DATE());
			this.setFr_EFF_PHASE_OUT_DATE(struct.getFr_EFF_PHASE_OUT_DATE());
			this.seth_Fr_MODIFY_COUNT(struct.geth_Fr_MODIFY_COUNT());
			this.setToLo_ITEM_CD(struct.getToLo_ITEM_CD());
			this.setTo_PS_EDITION(struct.getTo_PS_EDITION());
			this.setToLo_ITEM_NAME(struct.getToLo_ITEM_NAME());
			this.setTo_EFF_PHASE_IN_DATE(struct.getTo_EFF_PHASE_IN_DATE());
			this.setTo_EFF_PHASE_OUT_DATE(struct.getTo_EFF_PHASE_OUT_DATE());
			this.seth_FrUp_ITEM_CD(struct.geth_FrUp_ITEM_CD());
			this.seth_ToUp_ITEM_CD(struct.geth_ToUp_ITEM_CD());
			this.seth_TargetDate(struct.geth_TargetDate());
			this.seth_DEVELOP_TYP(struct.geth_DEVELOP_TYP());
			this.setDEVELOP_TYP_name(struct.getDEVELOP_TYP_name());
			this.setDEVELOP_TYP_val(struct.getDEVELOP_TYP_val());
			this.setFrUp_ITEM_NAME(struct.getFrUp_ITEM_NAME());
			this.setFrUp_ITEM_CD(struct.getFrUp_ITEM_CD());
			this.setFrLo_ITEM_CD(struct.getFrLo_ITEM_CD());
			this.setToUp_ITEM_CD(struct.getToUp_ITEM_CD());
			this.setFrLo_ITEM_NAME(struct.getFrLo_ITEM_NAME());
			this.setCK_ITEM_CD(struct.getCK_ITEM_CD());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AA0180020Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_ToUp_ITEM_NAME(struct.getList_ToUp_ITEM_NAME());
			this.setList_TargetDate(struct.getList_TargetDate());
			this.setList_DEVELOP_TYP(struct.getList_DEVELOP_TYP());
			this.setList_Fr_PS_EDITION(struct.getList_Fr_PS_EDITION());
			this.setList_Fr_EFF_PHASE_IN_DATE(struct.getList_Fr_EFF_PHASE_IN_DATE());
			this.setList_Fr_EFF_PHASE_OUT_DATE(struct.getList_Fr_EFF_PHASE_OUT_DATE());
			this.setList_h_Fr_MODIFY_COUNT(struct.getList_h_Fr_MODIFY_COUNT());
			this.setList_ToLo_ITEM_CD(struct.getList_ToLo_ITEM_CD());
			this.setList_To_PS_EDITION(struct.getList_To_PS_EDITION());
			this.setList_ToLo_ITEM_NAME(struct.getList_ToLo_ITEM_NAME());
			this.setList_To_EFF_PHASE_IN_DATE(struct.getList_To_EFF_PHASE_IN_DATE());
			this.setList_To_EFF_PHASE_OUT_DATE(struct.getList_To_EFF_PHASE_OUT_DATE());
			this.setList_h_FrUp_ITEM_CD(struct.getList_h_FrUp_ITEM_CD());
			this.setList_h_ToUp_ITEM_CD(struct.getList_h_ToUp_ITEM_CD());
			this.setList_h_TargetDate(struct.getList_h_TargetDate());
			this.setList_h_DEVELOP_TYP(struct.getList_h_DEVELOP_TYP());
			this.setList_DEVELOP_TYP_name(struct.getList_DEVELOP_TYP_name());
			this.setList_DEVELOP_TYP_val(struct.getList_DEVELOP_TYP_val());
			this.setList_FrUp_ITEM_NAME(struct.getList_FrUp_ITEM_NAME());
			this.setList_FrUp_ITEM_CD(struct.getList_FrUp_ITEM_CD());
			this.setList_FrLo_ITEM_CD(struct.getList_FrLo_ITEM_CD());
			this.setList_ToUp_ITEM_CD(struct.getList_ToUp_ITEM_CD());
			this.setList_FrLo_ITEM_NAME(struct.getList_FrLo_ITEM_NAME());
			this.setList_CK_ITEM_CD(struct.getList_CK_ITEM_CD());
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
	// �� 1 �ϐ������l�F i_ToUp_ITEM_NAME


	final static String i_ToUp_ITEM_NAME = null;

	// �� 2 �ϐ������l�F i_TargetDate


	final static String i_TargetDate = null;

	// �� 3 �ϐ������l�F i_DEVELOP_TYP


	final static String i_DEVELOP_TYP = null;

	// �� 4 �ϐ������l�F i_Fr_PS_EDITION


	final static String i_Fr_PS_EDITION = null;

	// �� 5 �ϐ������l�F i_Fr_EFF_PHASE_IN_DATE


	final static String i_Fr_EFF_PHASE_IN_DATE = null;

	// �� 6 �ϐ������l�F i_Fr_EFF_PHASE_OUT_DATE


	final static String i_Fr_EFF_PHASE_OUT_DATE = null;

	// �� 7 �ϐ������l�F i_h_Fr_MODIFY_COUNT


	final static String i_h_Fr_MODIFY_COUNT = null;

	// �� 8 �ϐ������l�F i_ToLo_ITEM_CD


	final static String i_ToLo_ITEM_CD = null;

	// �� 9 �ϐ������l�F i_To_PS_EDITION


	final static String i_To_PS_EDITION = null;

	// �� 10 �ϐ������l�F i_ToLo_ITEM_NAME


	final static String i_ToLo_ITEM_NAME = null;

	// �� 11 �ϐ������l�F i_To_EFF_PHASE_IN_DATE


	final static String i_To_EFF_PHASE_IN_DATE = null;

	// �� 12 �ϐ������l�F i_To_EFF_PHASE_OUT_DATE


	final static String i_To_EFF_PHASE_OUT_DATE = null;

	// �� 13 �ϐ������l�F i_h_FrUp_ITEM_CD


	final static String i_h_FrUp_ITEM_CD = null;

	// �� 14 �ϐ������l�F i_h_ToUp_ITEM_CD


	final static String i_h_ToUp_ITEM_CD = null;

	// �� 15 �ϐ������l�F i_h_TargetDate


	final static String i_h_TargetDate = null;

	// �� 16 �ϐ������l�F i_h_DEVELOP_TYP


	final static String i_h_DEVELOP_TYP = null;

	// �� 17 �ϐ������l�F i_DEVELOP_TYP_name


	final static String i_DEVELOP_TYP_name = null;

	// �� 18 �ϐ������l�F i_DEVELOP_TYP_val


	final static String i_DEVELOP_TYP_val = null;

	// �� 19 �ϐ������l�F i_FrUp_ITEM_NAME


	final static String i_FrUp_ITEM_NAME = null;

	// �� 20 �ϐ������l�F i_FrUp_ITEM_CD


	final static String i_FrUp_ITEM_CD = null;

	// �� 21 �ϐ������l�F i_FrLo_ITEM_CD


	final static String i_FrLo_ITEM_CD = null;

	// �� 22 �ϐ������l�F i_ToUp_ITEM_CD


	final static String i_ToUp_ITEM_CD = null;

	// �� 23 �ϐ������l�F i_FrLo_ITEM_NAME


	final static String i_FrLo_ITEM_NAME = null;

	// �� 24 �ϐ������l�F i_CK_ITEM_CD


	final static String i_CK_ITEM_CD = null;

*/

	//{{user_implement_code
       
        // �� 1 �ϐ������l�F i_FrUp_ITEM_NAME
        final static String i_FrUp_ITEM_NAME = null;
        // �� 2 �ϐ������l�F i_FrUp_ITEM_CD
        final static String i_FrUp_ITEM_CD = null;
        // �� 3 �ϐ������l�F i_FrLo_ITEM_CD
        final static String i_FrLo_ITEM_CD = null;
        // �� 4 �ϐ������l�F i_ToUp_ITEM_CD
        final static String i_ToUp_ITEM_CD = null;
        // �� 5 �ϐ������l�F i_FrLo_ITEM_NAME
        final static String i_FrLo_ITEM_NAME = null;
        // �� 6 �ϐ������l�F i_ToUp_ITEM_NAME
        final static String i_ToUp_ITEM_NAME = null;
        // �� 7 �ϐ������l�F i_TargetDate
        final static String i_TargetDate = null;
        // �� 8 �ϐ������l�F i_DEVELOP_TYP
        final static String i_DEVELOP_TYP = null;
        // �� 9 �ϐ������l�F i_Fr_PS_EDITION
        final static String i_Fr_PS_EDITION = null;
        // �� 10 �ϐ������l�F i_Fr_EFF_PHASE_IN_DATE
        final static String i_Fr_EFF_PHASE_IN_DATE = null;
        // �� 11 �ϐ������l�F i_Fr_EFF_PHASE_OUT_DATE
        final static String i_Fr_EFF_PHASE_OUT_DATE = null;
        // �� 12 �ϐ������l�F i_h_Fr_MODIFY_COUNT
        final static String i_h_Fr_MODIFY_COUNT = null;
        // �� 13 �ϐ������l�F i_ToLo_ITEM_CD
        final static String i_ToLo_ITEM_CD = null;
        // �� 14 �ϐ������l�F i_To_PS_EDITION
        final static String i_To_PS_EDITION = null;
        // �� 15 �ϐ������l�F i_ToLo_ITEM_NAME
        final static String i_ToLo_ITEM_NAME = null;
        // �� 16 �ϐ������l�F i_To_EFF_PHASE_IN_DATE
        final static String i_To_EFF_PHASE_IN_DATE = null;
        // �� 17 �ϐ������l�F i_To_EFF_PHASE_OUT_DATE
        final static String i_To_EFF_PHASE_OUT_DATE = null;
        // �� 18 �ϐ������l�F i_h_FrUp_ITEM_CD
        final static String i_h_FrUp_ITEM_CD = null;
        // �� 19 �ϐ������l�F i_h_ToUp_ITEM_CD
        final static String i_h_ToUp_ITEM_CD = null;
        // �� 20 �ϐ������l�F i_h_TargetDate
        final static String i_h_TargetDate = null;
        // �� 21 �ϐ������l�F i_h_DEVELOP_TYP
        final static String i_h_DEVELOP_TYP = null;
       
        /**
         * ������
         *
         */
        public void initialize()
        {
         m_FrUp_ITEM_NAME = i_FrUp_ITEM_NAME;
         m_FrUp_ITEM_CD = i_FrUp_ITEM_CD;
         m_FrLo_ITEM_CD = i_FrLo_ITEM_CD;
         m_ToUp_ITEM_CD = i_ToUp_ITEM_CD;
         m_FrLo_ITEM_NAME = i_FrLo_ITEM_NAME;
         m_ToUp_ITEM_NAME = i_ToUp_ITEM_NAME;
         m_TargetDate = i_TargetDate;
         m_DEVELOP_TYP = i_DEVELOP_TYP;
         m_Fr_PS_EDITION = i_Fr_PS_EDITION;
         m_Fr_EFF_PHASE_IN_DATE = i_Fr_EFF_PHASE_IN_DATE;
         m_Fr_EFF_PHASE_OUT_DATE = i_Fr_EFF_PHASE_OUT_DATE;
         m_h_Fr_MODIFY_COUNT = i_h_Fr_MODIFY_COUNT;
         m_ToLo_ITEM_CD = i_ToLo_ITEM_CD;
         m_To_PS_EDITION = i_To_PS_EDITION;
         m_ToLo_ITEM_NAME = i_ToLo_ITEM_NAME;
         m_To_EFF_PHASE_IN_DATE = i_To_EFF_PHASE_IN_DATE;
         m_To_EFF_PHASE_OUT_DATE = i_To_EFF_PHASE_OUT_DATE;
         m_h_FrUp_ITEM_CD = i_h_FrUp_ITEM_CD;
         m_h_ToUp_ITEM_CD = i_h_ToUp_ITEM_CD;
         m_h_TargetDate = i_h_TargetDate;
         m_h_DEVELOP_TYP = i_h_DEVELOP_TYP;
       
         l_FrUp_ITEM_NAME = null;
         l_FrUp_ITEM_CD = null;
         l_FrLo_ITEM_CD = null;
         l_ToUp_ITEM_CD = null;
         l_FrLo_ITEM_NAME = null;
         l_ToUp_ITEM_NAME = null;
         l_TargetDate = null;
         l_DEVELOP_TYP = null;
         l_Fr_PS_EDITION = null;
         l_Fr_EFF_PHASE_IN_DATE = null;
         l_Fr_EFF_PHASE_OUT_DATE = null;
         l_h_Fr_MODIFY_COUNT = null;
         l_ToLo_ITEM_CD = null;
         l_To_PS_EDITION = null;
         l_ToLo_ITEM_NAME = null;
         l_To_EFF_PHASE_IN_DATE = null;
         l_To_EFF_PHASE_OUT_DATE = null;
         l_h_FrUp_ITEM_CD = null;
         l_h_ToUp_ITEM_CD = null;
         l_h_TargetDate = null;
         l_h_DEVELOP_TYP = null;
        }
       
        //}}user_implement_code

	//////////////////////////////

}
