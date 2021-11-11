/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0180/src/com/nec/jp/orteus/metamorBase/AA0180/AA0180030Struct.java,v $
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

public class AA0180030Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_h_Fr_ITEM_CD */
	public String m_h_Fr_ITEM_CD = null;
	/** �� 2 �ϐ��F m_TargetDate */
	public String m_TargetDate = null;
	/** �� 3 �ϐ��F m_h_TargetDate */
	public String m_h_TargetDate = null;
	/** �� 4 �ϐ��F m_FrParent_ITEM_CD */
	public String m_FrParent_ITEM_CD = null;
	/** �� 5 �ϐ��F m_FrParent_PS_EDITION */
	public String m_FrParent_PS_EDITION = null;
	/** �� 6 �ϐ��F m_FrParent_ITEM_NAME */
	public String m_FrParent_ITEM_NAME = null;
	/** �� 7 �ϐ��F m_FrParent_EFF_PHASE_IN_DATE */
	public String m_FrParent_EFF_PHASE_IN_DATE = null;
	/** �� 8 �ϐ��F m_FrParent_EFF_PHASE_OUT_DATE */
	public String m_FrParent_EFF_PHASE_OUT_DATE = null;
	/** �� 9 �ϐ��F m_h_FrParent_MODIFY_COUNT */
	public String m_h_FrParent_MODIFY_COUNT = null;
	/** �� 10 �ϐ��F m_FrComp_ITEM_CD */
	public String m_FrComp_ITEM_CD = null;
	/** �� 11 �ϐ��F m_FrComp_PS_EDITION */
	public String m_FrComp_PS_EDITION = null;
	/** �� 12 �ϐ��F m_FrComp_ITEM_NAME */
	public String m_FrComp_ITEM_NAME = null;
	/** �� 13 �ϐ��F m_FrComp_EFF_PHASE_IN_DATE */
	public String m_FrComp_EFF_PHASE_IN_DATE = null;
	/** �� 14 �ϐ��F m_FrComp_EFF_PHASE_OUT_DATE */
	public String m_FrComp_EFF_PHASE_OUT_DATE = null;
	/** �� 15 �ϐ��F m_h_FrComp_MODIFY_COUNT */
	public String m_h_FrComp_MODIFY_COUNT = null;
	/** �� 16 �ϐ��F m_Fr_ITEM_NAME */
	public String m_Fr_ITEM_NAME = null;
	/** �� 17 �ϐ��F m_Fr_ITEM_CD */
	public String m_Fr_ITEM_CD = null;
	/** �� 18 �ϐ��F m_To_ITEM_NAME */
	public String m_To_ITEM_NAME = null;
	/** �� 19 �ϐ��F m_To_ITEM_CD */
	public String m_To_ITEM_CD = null;
	/** �� 20 �ϐ��F m_ReplaceDate */
	public String m_ReplaceDate = null;
	/** �� 21 �ϐ��F m_h_PLANT_CD */
	public String m_h_PLANT_CD = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_h_Fr_ITEM_CD */
	public List l_h_Fr_ITEM_CD = null;

	/** �� 2 List�ϐ��F l_TargetDate */
	public List l_TargetDate = null;

	/** �� 3 List�ϐ��F l_h_TargetDate */
	public List l_h_TargetDate = null;

	/** �� 4 List�ϐ��F l_FrParent_ITEM_CD */
	public List l_FrParent_ITEM_CD = null;

	/** �� 5 List�ϐ��F l_FrParent_PS_EDITION */
	public List l_FrParent_PS_EDITION = null;

	/** �� 6 List�ϐ��F l_FrParent_ITEM_NAME */
	public List l_FrParent_ITEM_NAME = null;

	/** �� 7 List�ϐ��F l_FrParent_EFF_PHASE_IN_DATE */
	public List l_FrParent_EFF_PHASE_IN_DATE = null;

	/** �� 8 List�ϐ��F l_FrParent_EFF_PHASE_OUT_DATE */
	public List l_FrParent_EFF_PHASE_OUT_DATE = null;

	/** �� 9 List�ϐ��F l_h_FrParent_MODIFY_COUNT */
	public List l_h_FrParent_MODIFY_COUNT = null;

	/** �� 10 List�ϐ��F l_FrComp_ITEM_CD */
	public List l_FrComp_ITEM_CD = null;

	/** �� 11 List�ϐ��F l_FrComp_PS_EDITION */
	public List l_FrComp_PS_EDITION = null;

	/** �� 12 List�ϐ��F l_FrComp_ITEM_NAME */
	public List l_FrComp_ITEM_NAME = null;

	/** �� 13 List�ϐ��F l_FrComp_EFF_PHASE_IN_DATE */
	public List l_FrComp_EFF_PHASE_IN_DATE = null;

	/** �� 14 List�ϐ��F l_FrComp_EFF_PHASE_OUT_DATE */
	public List l_FrComp_EFF_PHASE_OUT_DATE = null;

	/** �� 15 List�ϐ��F l_h_FrComp_MODIFY_COUNT */
	public List l_h_FrComp_MODIFY_COUNT = null;

	/** �� 16 List�ϐ��F l_Fr_ITEM_NAME */
	public List l_Fr_ITEM_NAME = null;

	/** �� 17 List�ϐ��F l_Fr_ITEM_CD */
	public List l_Fr_ITEM_CD = null;

	/** �� 18 List�ϐ��F l_To_ITEM_NAME */
	public List l_To_ITEM_NAME = null;

	/** �� 19 List�ϐ��F l_To_ITEM_CD */
	public List l_To_ITEM_CD = null;

	/** �� 20 List�ϐ��F l_ReplaceDate */
	public List l_ReplaceDate = null;

	/** �� 21 List�ϐ��F l_h_PLANT_CD */
	public List l_h_PLANT_CD = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String geth_Fr_ITEM_CD() { return m_h_Fr_ITEM_CD; }
	public String getTargetDate() { return m_TargetDate; }
	public String geth_TargetDate() { return m_h_TargetDate; }
	public String getFrParent_ITEM_CD() { return m_FrParent_ITEM_CD; }
	public String getFrParent_PS_EDITION() { return m_FrParent_PS_EDITION; }
	public String getFrParent_ITEM_NAME() { return m_FrParent_ITEM_NAME; }
	public String getFrParent_EFF_PHASE_IN_DATE() { return m_FrParent_EFF_PHASE_IN_DATE; }
	public String getFrParent_EFF_PHASE_OUT_DATE() { return m_FrParent_EFF_PHASE_OUT_DATE; }
	public String geth_FrParent_MODIFY_COUNT() { return m_h_FrParent_MODIFY_COUNT; }
	public String getFrComp_ITEM_CD() { return m_FrComp_ITEM_CD; }
	public String getFrComp_PS_EDITION() { return m_FrComp_PS_EDITION; }
	public String getFrComp_ITEM_NAME() { return m_FrComp_ITEM_NAME; }
	public String getFrComp_EFF_PHASE_IN_DATE() { return m_FrComp_EFF_PHASE_IN_DATE; }
	public String getFrComp_EFF_PHASE_OUT_DATE() { return m_FrComp_EFF_PHASE_OUT_DATE; }
	public String geth_FrComp_MODIFY_COUNT() { return m_h_FrComp_MODIFY_COUNT; }
	public String getFr_ITEM_NAME() { return m_Fr_ITEM_NAME; }
	public String getFr_ITEM_CD() { return m_Fr_ITEM_CD; }
	public String getTo_ITEM_NAME() { return m_To_ITEM_NAME; }
	public String getTo_ITEM_CD() { return m_To_ITEM_CD; }
	public String getReplaceDate() { return m_ReplaceDate; }
	public String geth_PLANT_CD() { return m_h_PLANT_CD; }

	public List getList_h_Fr_ITEM_CD() { return l_h_Fr_ITEM_CD; }
	public List getList_TargetDate() { return l_TargetDate; }
	public List getList_h_TargetDate() { return l_h_TargetDate; }
	public List getList_FrParent_ITEM_CD() { return l_FrParent_ITEM_CD; }
	public List getList_FrParent_PS_EDITION() { return l_FrParent_PS_EDITION; }
	public List getList_FrParent_ITEM_NAME() { return l_FrParent_ITEM_NAME; }
	public List getList_FrParent_EFF_PHASE_IN_DATE() { return l_FrParent_EFF_PHASE_IN_DATE; }
	public List getList_FrParent_EFF_PHASE_OUT_DATE() { return l_FrParent_EFF_PHASE_OUT_DATE; }
	public List getList_h_FrParent_MODIFY_COUNT() { return l_h_FrParent_MODIFY_COUNT; }
	public List getList_FrComp_ITEM_CD() { return l_FrComp_ITEM_CD; }
	public List getList_FrComp_PS_EDITION() { return l_FrComp_PS_EDITION; }
	public List getList_FrComp_ITEM_NAME() { return l_FrComp_ITEM_NAME; }
	public List getList_FrComp_EFF_PHASE_IN_DATE() { return l_FrComp_EFF_PHASE_IN_DATE; }
	public List getList_FrComp_EFF_PHASE_OUT_DATE() { return l_FrComp_EFF_PHASE_OUT_DATE; }
	public List getList_h_FrComp_MODIFY_COUNT() { return l_h_FrComp_MODIFY_COUNT; }
	public List getList_Fr_ITEM_NAME() { return l_Fr_ITEM_NAME; }
	public List getList_Fr_ITEM_CD() { return l_Fr_ITEM_CD; }
	public List getList_To_ITEM_NAME() { return l_To_ITEM_NAME; }
	public List getList_To_ITEM_CD() { return l_To_ITEM_CD; }
	public List getList_ReplaceDate() { return l_ReplaceDate; }
	public List getList_h_PLANT_CD() { return l_h_PLANT_CD; }

	public void seth_Fr_ITEM_CD(String val) { m_h_Fr_ITEM_CD = val; }
	public void setTargetDate(String val) { m_TargetDate = val; }
	public void seth_TargetDate(String val) { m_h_TargetDate = val; }
	public void setFrParent_ITEM_CD(String val) { m_FrParent_ITEM_CD = val; }
	public void setFrParent_PS_EDITION(String val) { m_FrParent_PS_EDITION = val; }
	public void setFrParent_ITEM_NAME(String val) { m_FrParent_ITEM_NAME = val; }
	public void setFrParent_EFF_PHASE_IN_DATE(String val) { m_FrParent_EFF_PHASE_IN_DATE = val; }
	public void setFrParent_EFF_PHASE_OUT_DATE(String val) { m_FrParent_EFF_PHASE_OUT_DATE = val; }
	public void seth_FrParent_MODIFY_COUNT(String val) { m_h_FrParent_MODIFY_COUNT = val; }
	public void setFrComp_ITEM_CD(String val) { m_FrComp_ITEM_CD = val; }
	public void setFrComp_PS_EDITION(String val) { m_FrComp_PS_EDITION = val; }
	public void setFrComp_ITEM_NAME(String val) { m_FrComp_ITEM_NAME = val; }
	public void setFrComp_EFF_PHASE_IN_DATE(String val) { m_FrComp_EFF_PHASE_IN_DATE = val; }
	public void setFrComp_EFF_PHASE_OUT_DATE(String val) { m_FrComp_EFF_PHASE_OUT_DATE = val; }
	public void seth_FrComp_MODIFY_COUNT(String val) { m_h_FrComp_MODIFY_COUNT = val; }
	public void setFr_ITEM_NAME(String val) { m_Fr_ITEM_NAME = val; }
	public void setFr_ITEM_CD(String val) { m_Fr_ITEM_CD = val; }
	public void setTo_ITEM_NAME(String val) { m_To_ITEM_NAME = val; }
	public void setTo_ITEM_CD(String val) { m_To_ITEM_CD = val; }
	public void setReplaceDate(String val) { m_ReplaceDate = val; }
	public void seth_PLANT_CD(String val) { m_h_PLANT_CD = val; }


	public void setList_h_Fr_ITEM_CD(List list) { l_h_Fr_ITEM_CD = list; }
	public void setList_TargetDate(List list) { l_TargetDate = list; }
	public void setList_h_TargetDate(List list) { l_h_TargetDate = list; }
	public void setList_FrParent_ITEM_CD(List list) { l_FrParent_ITEM_CD = list; }
	public void setList_FrParent_PS_EDITION(List list) { l_FrParent_PS_EDITION = list; }
	public void setList_FrParent_ITEM_NAME(List list) { l_FrParent_ITEM_NAME = list; }
	public void setList_FrParent_EFF_PHASE_IN_DATE(List list) { l_FrParent_EFF_PHASE_IN_DATE = list; }
	public void setList_FrParent_EFF_PHASE_OUT_DATE(List list) { l_FrParent_EFF_PHASE_OUT_DATE = list; }
	public void setList_h_FrParent_MODIFY_COUNT(List list) { l_h_FrParent_MODIFY_COUNT = list; }
	public void setList_FrComp_ITEM_CD(List list) { l_FrComp_ITEM_CD = list; }
	public void setList_FrComp_PS_EDITION(List list) { l_FrComp_PS_EDITION = list; }
	public void setList_FrComp_ITEM_NAME(List list) { l_FrComp_ITEM_NAME = list; }
	public void setList_FrComp_EFF_PHASE_IN_DATE(List list) { l_FrComp_EFF_PHASE_IN_DATE = list; }
	public void setList_FrComp_EFF_PHASE_OUT_DATE(List list) { l_FrComp_EFF_PHASE_OUT_DATE = list; }
	public void setList_h_FrComp_MODIFY_COUNT(List list) { l_h_FrComp_MODIFY_COUNT = list; }
	public void setList_Fr_ITEM_NAME(List list) { l_Fr_ITEM_NAME = list; }
	public void setList_Fr_ITEM_CD(List list) { l_Fr_ITEM_CD = list; }
	public void setList_To_ITEM_NAME(List list) { l_To_ITEM_NAME = list; }
	public void setList_To_ITEM_CD(List list) { l_To_ITEM_CD = list; }
	public void setList_ReplaceDate(List list) { l_ReplaceDate = list; }
	public void setList_h_PLANT_CD(List list) { l_h_PLANT_CD = list; }

	public int setL2L_h_Fr_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_Fr_ITEM_CD == null) {
			l_h_Fr_ITEM_CD = new ArrayList();
		} else {
			l_h_Fr_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_Fr_ITEM_CD.add(((AA0180030Struct) list.get(i)).geth_Fr_ITEM_CD());
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
			l_TargetDate.add(((AA0180030Struct) list.get(i)).getTargetDate());
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
			l_h_TargetDate.add(((AA0180030Struct) list.get(i)).geth_TargetDate());
		}
		return size;
	}
	public int setL2L_FrParent_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FrParent_ITEM_CD == null) {
			l_FrParent_ITEM_CD = new ArrayList();
		} else {
			l_FrParent_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FrParent_ITEM_CD.add(((AA0180030Struct) list.get(i)).getFrParent_ITEM_CD());
		}
		return size;
	}
	public int setL2L_FrParent_PS_EDITION(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FrParent_PS_EDITION == null) {
			l_FrParent_PS_EDITION = new ArrayList();
		} else {
			l_FrParent_PS_EDITION.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FrParent_PS_EDITION.add(((AA0180030Struct) list.get(i)).getFrParent_PS_EDITION());
		}
		return size;
	}
	public int setL2L_FrParent_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FrParent_ITEM_NAME == null) {
			l_FrParent_ITEM_NAME = new ArrayList();
		} else {
			l_FrParent_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FrParent_ITEM_NAME.add(((AA0180030Struct) list.get(i)).getFrParent_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_FrParent_EFF_PHASE_IN_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FrParent_EFF_PHASE_IN_DATE == null) {
			l_FrParent_EFF_PHASE_IN_DATE = new ArrayList();
		} else {
			l_FrParent_EFF_PHASE_IN_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FrParent_EFF_PHASE_IN_DATE.add(((AA0180030Struct) list.get(i)).getFrParent_EFF_PHASE_IN_DATE());
		}
		return size;
	}
	public int setL2L_FrParent_EFF_PHASE_OUT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FrParent_EFF_PHASE_OUT_DATE == null) {
			l_FrParent_EFF_PHASE_OUT_DATE = new ArrayList();
		} else {
			l_FrParent_EFF_PHASE_OUT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FrParent_EFF_PHASE_OUT_DATE.add(((AA0180030Struct) list.get(i)).getFrParent_EFF_PHASE_OUT_DATE());
		}
		return size;
	}
	public int setL2L_h_FrParent_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_FrParent_MODIFY_COUNT == null) {
			l_h_FrParent_MODIFY_COUNT = new ArrayList();
		} else {
			l_h_FrParent_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_FrParent_MODIFY_COUNT.add(((AA0180030Struct) list.get(i)).geth_FrParent_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_FrComp_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FrComp_ITEM_CD == null) {
			l_FrComp_ITEM_CD = new ArrayList();
		} else {
			l_FrComp_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FrComp_ITEM_CD.add(((AA0180030Struct) list.get(i)).getFrComp_ITEM_CD());
		}
		return size;
	}
	public int setL2L_FrComp_PS_EDITION(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FrComp_PS_EDITION == null) {
			l_FrComp_PS_EDITION = new ArrayList();
		} else {
			l_FrComp_PS_EDITION.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FrComp_PS_EDITION.add(((AA0180030Struct) list.get(i)).getFrComp_PS_EDITION());
		}
		return size;
	}
	public int setL2L_FrComp_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FrComp_ITEM_NAME == null) {
			l_FrComp_ITEM_NAME = new ArrayList();
		} else {
			l_FrComp_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FrComp_ITEM_NAME.add(((AA0180030Struct) list.get(i)).getFrComp_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_FrComp_EFF_PHASE_IN_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FrComp_EFF_PHASE_IN_DATE == null) {
			l_FrComp_EFF_PHASE_IN_DATE = new ArrayList();
		} else {
			l_FrComp_EFF_PHASE_IN_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FrComp_EFF_PHASE_IN_DATE.add(((AA0180030Struct) list.get(i)).getFrComp_EFF_PHASE_IN_DATE());
		}
		return size;
	}
	public int setL2L_FrComp_EFF_PHASE_OUT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FrComp_EFF_PHASE_OUT_DATE == null) {
			l_FrComp_EFF_PHASE_OUT_DATE = new ArrayList();
		} else {
			l_FrComp_EFF_PHASE_OUT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FrComp_EFF_PHASE_OUT_DATE.add(((AA0180030Struct) list.get(i)).getFrComp_EFF_PHASE_OUT_DATE());
		}
		return size;
	}
	public int setL2L_h_FrComp_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_FrComp_MODIFY_COUNT == null) {
			l_h_FrComp_MODIFY_COUNT = new ArrayList();
		} else {
			l_h_FrComp_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_FrComp_MODIFY_COUNT.add(((AA0180030Struct) list.get(i)).geth_FrComp_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_Fr_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Fr_ITEM_NAME == null) {
			l_Fr_ITEM_NAME = new ArrayList();
		} else {
			l_Fr_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Fr_ITEM_NAME.add(((AA0180030Struct) list.get(i)).getFr_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_Fr_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Fr_ITEM_CD == null) {
			l_Fr_ITEM_CD = new ArrayList();
		} else {
			l_Fr_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Fr_ITEM_CD.add(((AA0180030Struct) list.get(i)).getFr_ITEM_CD());
		}
		return size;
	}
	public int setL2L_To_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_To_ITEM_NAME == null) {
			l_To_ITEM_NAME = new ArrayList();
		} else {
			l_To_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_To_ITEM_NAME.add(((AA0180030Struct) list.get(i)).getTo_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_To_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_To_ITEM_CD == null) {
			l_To_ITEM_CD = new ArrayList();
		} else {
			l_To_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_To_ITEM_CD.add(((AA0180030Struct) list.get(i)).getTo_ITEM_CD());
		}
		return size;
	}
	public int setL2L_ReplaceDate(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ReplaceDate == null) {
			l_ReplaceDate = new ArrayList();
		} else {
			l_ReplaceDate.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ReplaceDate.add(((AA0180030Struct) list.get(i)).getReplaceDate());
		}
		return size;
	}
	public int setL2L_h_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PLANT_CD == null) {
			l_h_PLANT_CD = new ArrayList();
		} else {
			l_h_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PLANT_CD.add(((AA0180030Struct) list.get(i)).geth_PLANT_CD());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_h_Fr_ITEM_CD = null;
		m_TargetDate = null;
		m_h_TargetDate = null;
		m_FrParent_ITEM_CD = null;
		m_FrParent_PS_EDITION = null;
		m_FrParent_ITEM_NAME = null;
		m_FrParent_EFF_PHASE_IN_DATE = null;
		m_FrParent_EFF_PHASE_OUT_DATE = null;
		m_h_FrParent_MODIFY_COUNT = null;
		m_FrComp_ITEM_CD = null;
		m_FrComp_PS_EDITION = null;
		m_FrComp_ITEM_NAME = null;
		m_FrComp_EFF_PHASE_IN_DATE = null;
		m_FrComp_EFF_PHASE_OUT_DATE = null;
		m_h_FrComp_MODIFY_COUNT = null;
		m_Fr_ITEM_NAME = null;
		m_Fr_ITEM_CD = null;
		m_To_ITEM_NAME = null;
		m_To_ITEM_CD = null;
		m_ReplaceDate = null;
		m_h_PLANT_CD = null;

		l_h_Fr_ITEM_CD = null;
		l_TargetDate = null;
		l_h_TargetDate = null;
		l_FrParent_ITEM_CD = null;
		l_FrParent_PS_EDITION = null;
		l_FrParent_ITEM_NAME = null;
		l_FrParent_EFF_PHASE_IN_DATE = null;
		l_FrParent_EFF_PHASE_OUT_DATE = null;
		l_h_FrParent_MODIFY_COUNT = null;
		l_FrComp_ITEM_CD = null;
		l_FrComp_PS_EDITION = null;
		l_FrComp_ITEM_NAME = null;
		l_FrComp_EFF_PHASE_IN_DATE = null;
		l_FrComp_EFF_PHASE_OUT_DATE = null;
		l_h_FrComp_MODIFY_COUNT = null;
		l_Fr_ITEM_NAME = null;
		l_Fr_ITEM_CD = null;
		l_To_ITEM_NAME = null;
		l_To_ITEM_CD = null;
		l_ReplaceDate = null;
		l_h_PLANT_CD = null;

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
	 * medAA0180030�N���X�̕W���R���X�g���N�^
	 */
	public AA0180030Struct()
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
	public void setStruct(AA0180030Struct struct)
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
	public void setStructM(AA0180030Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.seth_Fr_ITEM_CD(struct.geth_Fr_ITEM_CD());
			this.setTargetDate(struct.getTargetDate());
			this.seth_TargetDate(struct.geth_TargetDate());
			this.setFrParent_ITEM_CD(struct.getFrParent_ITEM_CD());
			this.setFrParent_PS_EDITION(struct.getFrParent_PS_EDITION());
			this.setFrParent_ITEM_NAME(struct.getFrParent_ITEM_NAME());
			this.setFrParent_EFF_PHASE_IN_DATE(struct.getFrParent_EFF_PHASE_IN_DATE());
			this.setFrParent_EFF_PHASE_OUT_DATE(struct.getFrParent_EFF_PHASE_OUT_DATE());
			this.seth_FrParent_MODIFY_COUNT(struct.geth_FrParent_MODIFY_COUNT());
			this.setFrComp_ITEM_CD(struct.getFrComp_ITEM_CD());
			this.setFrComp_PS_EDITION(struct.getFrComp_PS_EDITION());
			this.setFrComp_ITEM_NAME(struct.getFrComp_ITEM_NAME());
			this.setFrComp_EFF_PHASE_IN_DATE(struct.getFrComp_EFF_PHASE_IN_DATE());
			this.setFrComp_EFF_PHASE_OUT_DATE(struct.getFrComp_EFF_PHASE_OUT_DATE());
			this.seth_FrComp_MODIFY_COUNT(struct.geth_FrComp_MODIFY_COUNT());
			this.setFr_ITEM_NAME(struct.getFr_ITEM_NAME());
			this.setFr_ITEM_CD(struct.getFr_ITEM_CD());
			this.setTo_ITEM_NAME(struct.getTo_ITEM_NAME());
			this.setTo_ITEM_CD(struct.getTo_ITEM_CD());
			this.setReplaceDate(struct.getReplaceDate());
			this.seth_PLANT_CD(struct.geth_PLANT_CD());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AA0180030Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_h_Fr_ITEM_CD(struct.getList_h_Fr_ITEM_CD());
			this.setList_TargetDate(struct.getList_TargetDate());
			this.setList_h_TargetDate(struct.getList_h_TargetDate());
			this.setList_FrParent_ITEM_CD(struct.getList_FrParent_ITEM_CD());
			this.setList_FrParent_PS_EDITION(struct.getList_FrParent_PS_EDITION());
			this.setList_FrParent_ITEM_NAME(struct.getList_FrParent_ITEM_NAME());
			this.setList_FrParent_EFF_PHASE_IN_DATE(struct.getList_FrParent_EFF_PHASE_IN_DATE());
			this.setList_FrParent_EFF_PHASE_OUT_DATE(struct.getList_FrParent_EFF_PHASE_OUT_DATE());
			this.setList_h_FrParent_MODIFY_COUNT(struct.getList_h_FrParent_MODIFY_COUNT());
			this.setList_FrComp_ITEM_CD(struct.getList_FrComp_ITEM_CD());
			this.setList_FrComp_PS_EDITION(struct.getList_FrComp_PS_EDITION());
			this.setList_FrComp_ITEM_NAME(struct.getList_FrComp_ITEM_NAME());
			this.setList_FrComp_EFF_PHASE_IN_DATE(struct.getList_FrComp_EFF_PHASE_IN_DATE());
			this.setList_FrComp_EFF_PHASE_OUT_DATE(struct.getList_FrComp_EFF_PHASE_OUT_DATE());
			this.setList_h_FrComp_MODIFY_COUNT(struct.getList_h_FrComp_MODIFY_COUNT());
			this.setList_Fr_ITEM_NAME(struct.getList_Fr_ITEM_NAME());
			this.setList_Fr_ITEM_CD(struct.getList_Fr_ITEM_CD());
			this.setList_To_ITEM_NAME(struct.getList_To_ITEM_NAME());
			this.setList_To_ITEM_CD(struct.getList_To_ITEM_CD());
			this.setList_ReplaceDate(struct.getList_ReplaceDate());
			this.setList_h_PLANT_CD(struct.getList_h_PLANT_CD());
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
	// �� 1 �ϐ������l�F i_h_Fr_ITEM_CD


	final static String i_h_Fr_ITEM_CD = null;

	// �� 2 �ϐ������l�F i_TargetDate


	final static String i_TargetDate = null;

	// �� 3 �ϐ������l�F i_h_TargetDate


	final static String i_h_TargetDate = null;

	// �� 4 �ϐ������l�F i_FrParent_ITEM_CD


	final static String i_FrParent_ITEM_CD = null;

	// �� 5 �ϐ������l�F i_FrParent_PS_EDITION


	final static String i_FrParent_PS_EDITION = null;

	// �� 6 �ϐ������l�F i_FrParent_ITEM_NAME


	final static String i_FrParent_ITEM_NAME = null;

	// �� 7 �ϐ������l�F i_FrParent_EFF_PHASE_IN_DATE


	final static String i_FrParent_EFF_PHASE_IN_DATE = null;

	// �� 8 �ϐ������l�F i_FrParent_EFF_PHASE_OUT_DATE


	final static String i_FrParent_EFF_PHASE_OUT_DATE = null;

	// �� 9 �ϐ������l�F i_h_FrParent_MODIFY_COUNT


	final static String i_h_FrParent_MODIFY_COUNT = null;

	// �� 10 �ϐ������l�F i_FrComp_ITEM_CD


	final static String i_FrComp_ITEM_CD = null;

	// �� 11 �ϐ������l�F i_FrComp_PS_EDITION


	final static String i_FrComp_PS_EDITION = null;

	// �� 12 �ϐ������l�F i_FrComp_ITEM_NAME


	final static String i_FrComp_ITEM_NAME = null;

	// �� 13 �ϐ������l�F i_FrComp_EFF_PHASE_IN_DATE


	final static String i_FrComp_EFF_PHASE_IN_DATE = null;

	// �� 14 �ϐ������l�F i_FrComp_EFF_PHASE_OUT_DATE


	final static String i_FrComp_EFF_PHASE_OUT_DATE = null;

	// �� 15 �ϐ������l�F i_h_FrComp_MODIFY_COUNT


	final static String i_h_FrComp_MODIFY_COUNT = null;

	// �� 16 �ϐ������l�F i_Fr_ITEM_NAME


	final static String i_Fr_ITEM_NAME = null;

	// �� 17 �ϐ������l�F i_Fr_ITEM_CD


	final static String i_Fr_ITEM_CD = null;

	// �� 18 �ϐ������l�F i_To_ITEM_NAME


	final static String i_To_ITEM_NAME = null;

	// �� 19 �ϐ������l�F i_To_ITEM_CD


	final static String i_To_ITEM_CD = null;

	// �� 20 �ϐ������l�F i_ReplaceDate


	final static String i_ReplaceDate = null;

	// �� 21 �ϐ������l�F i_h_PLANT_CD


	final static String i_h_PLANT_CD = null;

*/

	//{{user_implement_code
       
        // �� 1 �ϐ������l�F i_Fr_ITEM_NAME
        final static String i_Fr_ITEM_NAME = null;
        // �� 2 �ϐ������l�F i_Fr_ITEM_CD
        final static String i_Fr_ITEM_CD = null;
        // �� 3 �ϐ������l�F i_To_ITEM_NAME
        final static String i_To_ITEM_NAME = null;
        // �� 4 �ϐ������l�F i_To_ITEM_CD
        final static String i_To_ITEM_CD = null;
        // �� 5 �ϐ������l�F i_h_Fr_ITEM_CD
        final static String i_h_Fr_ITEM_CD = null;
        // �� 6 �ϐ������l�F i_TargetDate
        final static String i_TargetDate = null;
        // �� 7 �ϐ������l�F i_h_TargetDate
        final static String i_h_TargetDate = null;
        // �� 8 �ϐ������l�F i_FrParent_ITEM_CD
        final static String i_FrParent_ITEM_CD = null;
        // �� 9 �ϐ������l�F i_FrParent_PS_EDITION
        final static String i_FrParent_PS_EDITION = null;
        // �� 10 �ϐ������l�F i_FrParent_ITEM_NAME
        final static String i_FrParent_ITEM_NAME = null;
        // �� 11 �ϐ������l�F i_FrParent_EFF_PHASE_IN_DATE
        final static String i_FrParent_EFF_PHASE_IN_DATE = null;
        // �� 12 �ϐ������l�F i_FrParent_EFF_PHASE_OUT_DATE
        final static String i_FrParent_EFF_PHASE_OUT_DATE = null;
        // �� 13 �ϐ������l�F i_h_FrParent_MODIFY_COUNT
        final static String i_h_FrParent_MODIFY_COUNT = null;
        // �� 14 �ϐ������l�F i_FrComp_ITEM_CD
        final static String i_FrComp_ITEM_CD = null;
        // �� 15 �ϐ������l�F i_FrComp_PS_EDITION
        final static String i_FrComp_PS_EDITION = null;
        // �� 16 �ϐ������l�F i_FrComp_ITEM_NAME
        final static String i_FrComp_ITEM_NAME = null;
        // �� 17 �ϐ������l�F i_FrComp_EFF_PHASE_IN_DATE
        final static String i_FrComp_EFF_PHASE_IN_DATE = null;
        // �� 18 �ϐ������l�F i_FrComp_EFF_PHASE_OUT_DATE
        final static String i_FrComp_EFF_PHASE_OUT_DATE = null;
        // �� 19 �ϐ������l�F i_h_FrComp_MODIFY_COUNT
        final static String i_h_FrComp_MODIFY_COUNT = null;
        // �� 20 �ϐ������l�F i_ReplaceDate
        final static String i_ReplaceDate = null;
       
        /**
         * ������
         *
         */
        public void initialize()
        {
         m_Fr_ITEM_NAME = i_Fr_ITEM_NAME;
         m_Fr_ITEM_CD = i_Fr_ITEM_CD;
         m_To_ITEM_NAME = i_To_ITEM_NAME;
         m_To_ITEM_CD = i_To_ITEM_CD;
         m_h_Fr_ITEM_CD = i_h_Fr_ITEM_CD;
         m_TargetDate = i_TargetDate;
         m_h_TargetDate = i_h_TargetDate;
         m_FrParent_ITEM_CD = i_FrParent_ITEM_CD;
         m_FrParent_PS_EDITION = i_FrParent_PS_EDITION;
         m_FrParent_ITEM_NAME = i_FrParent_ITEM_NAME;
         m_FrParent_EFF_PHASE_IN_DATE = i_FrParent_EFF_PHASE_IN_DATE;
         m_FrParent_EFF_PHASE_OUT_DATE = i_FrParent_EFF_PHASE_OUT_DATE;
         m_h_FrParent_MODIFY_COUNT = i_h_FrParent_MODIFY_COUNT;
         m_FrComp_ITEM_CD = i_FrComp_ITEM_CD;
         m_FrComp_PS_EDITION = i_FrComp_PS_EDITION;
         m_FrComp_ITEM_NAME = i_FrComp_ITEM_NAME;
         m_FrComp_EFF_PHASE_IN_DATE = i_FrComp_EFF_PHASE_IN_DATE;
         m_FrComp_EFF_PHASE_OUT_DATE = i_FrComp_EFF_PHASE_OUT_DATE;
         m_h_FrComp_MODIFY_COUNT = i_h_FrComp_MODIFY_COUNT;
         m_ReplaceDate = i_ReplaceDate;
       
         l_Fr_ITEM_NAME = null;
         l_Fr_ITEM_CD = null;
         l_To_ITEM_NAME = null;
         l_To_ITEM_CD = null;
         l_h_Fr_ITEM_CD = null;
         l_TargetDate = null;
         l_h_TargetDate = null;
         l_FrParent_ITEM_CD = null;
         l_FrParent_PS_EDITION = null;
         l_FrParent_ITEM_NAME = null;
         l_FrParent_EFF_PHASE_IN_DATE = null;
         l_FrParent_EFF_PHASE_OUT_DATE = null;
         l_h_FrParent_MODIFY_COUNT = null;
         l_FrComp_ITEM_CD = null;
         l_FrComp_PS_EDITION = null;
         l_FrComp_ITEM_NAME = null;
         l_FrComp_EFF_PHASE_IN_DATE = null;
         l_FrComp_EFF_PHASE_OUT_DATE = null;
         l_h_FrComp_MODIFY_COUNT = null;
         l_ReplaceDate = null;
        }
       
         // TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
