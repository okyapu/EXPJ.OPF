/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0060/src/com/nec/jp/orteus/metamorBase/AA0060/AA0060010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0060;

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

public class AA0060010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_CLASS_NAME_FLAG */
	public String m_CLASS_NAME_FLAG = null;
	/** �� 2 �ϐ��F m_h_WS_CLASS_01_CD */
	public String m_h_WS_CLASS_01_CD = null;
	/** �� 3 �ϐ��F m_w_PLANT_CD */
	public String m_w_PLANT_CD = null;
	/** �� 4 �ϐ��F m_WS_CD */
	public String m_WS_CD = null;
	/** �� 5 �ϐ��F m_h_WS_CD */
	public String m_h_WS_CD = null;
	/** �� 6 �ϐ��F m_WS_NAME */
	public String m_WS_NAME = null;
	/** �� 7 �ϐ��F m_WS_TEL */
	public String m_WS_TEL = null;
	/** �� 8 �ϐ��F m_WS_PERSON */
	public String m_WS_PERSON = null;
	/** �� 9 �ϐ��F m_WH_CD */
	public String m_WH_CD = null;
	/** �� 10 �ϐ��F m_SUB_WS_CD */
	public String m_SUB_WS_CD = null;
	/** �� 11 �ϐ��F m_MODIFY_COUNT */
	public Integer m_MODIFY_COUNT = null;
	/** �� 12 �ϐ��F m_SUB_WS_NAME */
	public String m_SUB_WS_NAME = null;
	/** �� 13 �ϐ��F m_WH_NAME */
	public String m_WH_NAME = null;
	/** �� 14 �ϐ��F m_WH_TYP */
	public String m_WH_TYP = null;
	/** �� 15 �ϐ��F m_CLASS_NAME */
	public String m_CLASS_NAME = null;
	/** �� 16 �ϐ��F m_WS_CLASS_01_CD */
	public String m_WS_CLASS_01_CD = null;
	/** �� 17 �ϐ��F m_h_MODIFY_COUNT */
	public String m_h_MODIFY_COUNT = null;
	/** �� 18 �ϐ��F m_WS_CLASS_01_NAME */
	public String m_WS_CLASS_01_NAME = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_CLASS_NAME_FLAG */
	public List l_CLASS_NAME_FLAG = null;

	/** �� 2 List�ϐ��F l_h_WS_CLASS_01_CD */
	public List l_h_WS_CLASS_01_CD = null;

	/** �� 3 List�ϐ��F l_w_PLANT_CD */
	public List l_w_PLANT_CD = null;

	/** �� 4 List�ϐ��F l_WS_CD */
	public List l_WS_CD = null;

	/** �� 5 List�ϐ��F l_h_WS_CD */
	public List l_h_WS_CD = null;

	/** �� 6 List�ϐ��F l_WS_NAME */
	public List l_WS_NAME = null;

	/** �� 7 List�ϐ��F l_WS_TEL */
	public List l_WS_TEL = null;

	/** �� 8 List�ϐ��F l_WS_PERSON */
	public List l_WS_PERSON = null;

	/** �� 9 List�ϐ��F l_WH_CD */
	public List l_WH_CD = null;

	/** �� 10 List�ϐ��F l_SUB_WS_CD */
	public List l_SUB_WS_CD = null;

	/** �� 11 List�ϐ��F l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** �� 12 List�ϐ��F l_SUB_WS_NAME */
	public List l_SUB_WS_NAME = null;

	/** �� 13 List�ϐ��F l_WH_NAME */
	public List l_WH_NAME = null;

	/** �� 14 List�ϐ��F l_WH_TYP */
	public List l_WH_TYP = null;

	/** �� 15 List�ϐ��F l_CLASS_NAME */
	public List l_CLASS_NAME = null;

	/** �� 16 List�ϐ��F l_WS_CLASS_01_CD */
	public List l_WS_CLASS_01_CD = null;

	/** �� 17 List�ϐ��F l_h_MODIFY_COUNT */
	public List l_h_MODIFY_COUNT = null;

	/** �� 18 List�ϐ��F l_WS_CLASS_01_NAME */
	public List l_WS_CLASS_01_NAME = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getCLASS_NAME_FLAG() { return m_CLASS_NAME_FLAG; }
	public String geth_WS_CLASS_01_CD() { return m_h_WS_CLASS_01_CD; }
	public String getw_PLANT_CD() { return m_w_PLANT_CD; }
	public String getWS_CD() { return m_WS_CD; }
	public String geth_WS_CD() { return m_h_WS_CD; }
	public String getWS_NAME() { return m_WS_NAME; }
	public String getWS_TEL() { return m_WS_TEL; }
	public String getWS_PERSON() { return m_WS_PERSON; }
	public String getWH_CD() { return m_WH_CD; }
	public String getSUB_WS_CD() { return m_SUB_WS_CD; }
	public Integer getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getSUB_WS_NAME() { return m_SUB_WS_NAME; }
	public String getWH_NAME() { return m_WH_NAME; }
	public String getWH_TYP() { return m_WH_TYP; }
	public String getCLASS_NAME() { return m_CLASS_NAME; }
	public String getWS_CLASS_01_CD() { return m_WS_CLASS_01_CD; }
	public String geth_MODIFY_COUNT() { return m_h_MODIFY_COUNT; }
	public String getWS_CLASS_01_NAME() { return m_WS_CLASS_01_NAME; }

	public List getList_CLASS_NAME_FLAG() { return l_CLASS_NAME_FLAG; }
	public List getList_h_WS_CLASS_01_CD() { return l_h_WS_CLASS_01_CD; }
	public List getList_w_PLANT_CD() { return l_w_PLANT_CD; }
	public List getList_WS_CD() { return l_WS_CD; }
	public List getList_h_WS_CD() { return l_h_WS_CD; }
	public List getList_WS_NAME() { return l_WS_NAME; }
	public List getList_WS_TEL() { return l_WS_TEL; }
	public List getList_WS_PERSON() { return l_WS_PERSON; }
	public List getList_WH_CD() { return l_WH_CD; }
	public List getList_SUB_WS_CD() { return l_SUB_WS_CD; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_SUB_WS_NAME() { return l_SUB_WS_NAME; }
	public List getList_WH_NAME() { return l_WH_NAME; }
	public List getList_WH_TYP() { return l_WH_TYP; }
	public List getList_CLASS_NAME() { return l_CLASS_NAME; }
	public List getList_WS_CLASS_01_CD() { return l_WS_CLASS_01_CD; }
	public List getList_h_MODIFY_COUNT() { return l_h_MODIFY_COUNT; }
	public List getList_WS_CLASS_01_NAME() { return l_WS_CLASS_01_NAME; }

	public void setCLASS_NAME_FLAG(String val) { m_CLASS_NAME_FLAG = val; }
	public void seth_WS_CLASS_01_CD(String val) { m_h_WS_CLASS_01_CD = val; }
	public void setw_PLANT_CD(String val) { m_w_PLANT_CD = val; }
	public void setWS_CD(String val) { m_WS_CD = val; }
	public void seth_WS_CD(String val) { m_h_WS_CD = val; }
	public void setWS_NAME(String val) { m_WS_NAME = val; }
	public void setWS_TEL(String val) { m_WS_TEL = val; }
	public void setWS_PERSON(String val) { m_WS_PERSON = val; }
	public void setWH_CD(String val) { m_WH_CD = val; }
	public void setSUB_WS_CD(String val) { m_SUB_WS_CD = val; }
	public void setMODIFY_COUNT(Integer val) { m_MODIFY_COUNT = val; }
	public void setSUB_WS_NAME(String val) { m_SUB_WS_NAME = val; }
	public void setWH_NAME(String val) { m_WH_NAME = val; }
	public void setWH_TYP(String val) { m_WH_TYP = val; }
	public void setCLASS_NAME(String val) { m_CLASS_NAME = val; }
	public void setWS_CLASS_01_CD(String val) { m_WS_CLASS_01_CD = val; }
	public void seth_MODIFY_COUNT(String val) { m_h_MODIFY_COUNT = val; }
	public void setWS_CLASS_01_NAME(String val) { m_WS_CLASS_01_NAME = val; }

	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = getInteger(val); }

	public void setList_CLASS_NAME_FLAG(List list) { l_CLASS_NAME_FLAG = list; }
	public void setList_h_WS_CLASS_01_CD(List list) { l_h_WS_CLASS_01_CD = list; }
	public void setList_w_PLANT_CD(List list) { l_w_PLANT_CD = list; }
	public void setList_WS_CD(List list) { l_WS_CD = list; }
	public void setList_h_WS_CD(List list) { l_h_WS_CD = list; }
	public void setList_WS_NAME(List list) { l_WS_NAME = list; }
	public void setList_WS_TEL(List list) { l_WS_TEL = list; }
	public void setList_WS_PERSON(List list) { l_WS_PERSON = list; }
	public void setList_WH_CD(List list) { l_WH_CD = list; }
	public void setList_SUB_WS_CD(List list) { l_SUB_WS_CD = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_SUB_WS_NAME(List list) { l_SUB_WS_NAME = list; }
	public void setList_WH_NAME(List list) { l_WH_NAME = list; }
	public void setList_WH_TYP(List list) { l_WH_TYP = list; }
	public void setList_CLASS_NAME(List list) { l_CLASS_NAME = list; }
	public void setList_WS_CLASS_01_CD(List list) { l_WS_CLASS_01_CD = list; }
	public void setList_h_MODIFY_COUNT(List list) { l_h_MODIFY_COUNT = list; }
	public void setList_WS_CLASS_01_NAME(List list) { l_WS_CLASS_01_NAME = list; }

	public int setL2L_CLASS_NAME_FLAG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CLASS_NAME_FLAG == null) {
			l_CLASS_NAME_FLAG = new ArrayList();
		} else {
			l_CLASS_NAME_FLAG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CLASS_NAME_FLAG.add(((AA0060010Struct) list.get(i)).getCLASS_NAME_FLAG());
		}
		return size;
	}
	public int setL2L_h_WS_CLASS_01_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_WS_CLASS_01_CD == null) {
			l_h_WS_CLASS_01_CD = new ArrayList();
		} else {
			l_h_WS_CLASS_01_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_WS_CLASS_01_CD.add(((AA0060010Struct) list.get(i)).geth_WS_CLASS_01_CD());
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
			l_w_PLANT_CD.add(((AA0060010Struct) list.get(i)).getw_PLANT_CD());
		}
		return size;
	}
	public int setL2L_WS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WS_CD == null) {
			l_WS_CD = new ArrayList();
		} else {
			l_WS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WS_CD.add(((AA0060010Struct) list.get(i)).getWS_CD());
		}
		return size;
	}
	public int setL2L_h_WS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_WS_CD == null) {
			l_h_WS_CD = new ArrayList();
		} else {
			l_h_WS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_WS_CD.add(((AA0060010Struct) list.get(i)).geth_WS_CD());
		}
		return size;
	}
	public int setL2L_WS_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WS_NAME == null) {
			l_WS_NAME = new ArrayList();
		} else {
			l_WS_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WS_NAME.add(((AA0060010Struct) list.get(i)).getWS_NAME());
		}
		return size;
	}
	public int setL2L_WS_TEL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WS_TEL == null) {
			l_WS_TEL = new ArrayList();
		} else {
			l_WS_TEL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WS_TEL.add(((AA0060010Struct) list.get(i)).getWS_TEL());
		}
		return size;
	}
	public int setL2L_WS_PERSON(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WS_PERSON == null) {
			l_WS_PERSON = new ArrayList();
		} else {
			l_WS_PERSON.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WS_PERSON.add(((AA0060010Struct) list.get(i)).getWS_PERSON());
		}
		return size;
	}
	public int setL2L_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WH_CD == null) {
			l_WH_CD = new ArrayList();
		} else {
			l_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WH_CD.add(((AA0060010Struct) list.get(i)).getWH_CD());
		}
		return size;
	}
	public int setL2L_SUB_WS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUB_WS_CD == null) {
			l_SUB_WS_CD = new ArrayList();
		} else {
			l_SUB_WS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUB_WS_CD.add(((AA0060010Struct) list.get(i)).getSUB_WS_CD());
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
			l_MODIFY_COUNT.add(((AA0060010Struct) list.get(i)).getMODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_SUB_WS_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUB_WS_NAME == null) {
			l_SUB_WS_NAME = new ArrayList();
		} else {
			l_SUB_WS_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUB_WS_NAME.add(((AA0060010Struct) list.get(i)).getSUB_WS_NAME());
		}
		return size;
	}
	public int setL2L_WH_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WH_NAME == null) {
			l_WH_NAME = new ArrayList();
		} else {
			l_WH_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WH_NAME.add(((AA0060010Struct) list.get(i)).getWH_NAME());
		}
		return size;
	}
	public int setL2L_WH_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WH_TYP == null) {
			l_WH_TYP = new ArrayList();
		} else {
			l_WH_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WH_TYP.add(((AA0060010Struct) list.get(i)).getWH_TYP());
		}
		return size;
	}
	public int setL2L_CLASS_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CLASS_NAME == null) {
			l_CLASS_NAME = new ArrayList();
		} else {
			l_CLASS_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CLASS_NAME.add(((AA0060010Struct) list.get(i)).getCLASS_NAME());
		}
		return size;
	}
	public int setL2L_WS_CLASS_01_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WS_CLASS_01_CD == null) {
			l_WS_CLASS_01_CD = new ArrayList();
		} else {
			l_WS_CLASS_01_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WS_CLASS_01_CD.add(((AA0060010Struct) list.get(i)).getWS_CLASS_01_CD());
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
			l_h_MODIFY_COUNT.add(((AA0060010Struct) list.get(i)).geth_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_WS_CLASS_01_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WS_CLASS_01_NAME == null) {
			l_WS_CLASS_01_NAME = new ArrayList();
		} else {
			l_WS_CLASS_01_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WS_CLASS_01_NAME.add(((AA0060010Struct) list.get(i)).getWS_CLASS_01_NAME());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_CLASS_NAME_FLAG = null;
		m_h_WS_CLASS_01_CD = null;
		m_w_PLANT_CD = null;
		m_WS_CD = null;
		m_h_WS_CD = null;
		m_WS_NAME = null;
		m_WS_TEL = null;
		m_WS_PERSON = null;
		m_WH_CD = null;
		m_SUB_WS_CD = null;
		m_MODIFY_COUNT = null;
		m_SUB_WS_NAME = null;
		m_WH_NAME = null;
		m_WH_TYP = null;
		m_CLASS_NAME = null;
		m_WS_CLASS_01_CD = null;
		m_h_MODIFY_COUNT = null;
		m_WS_CLASS_01_NAME = null;

		l_CLASS_NAME_FLAG = null;
		l_h_WS_CLASS_01_CD = null;
		l_w_PLANT_CD = null;
		l_WS_CD = null;
		l_h_WS_CD = null;
		l_WS_NAME = null;
		l_WS_TEL = null;
		l_WS_PERSON = null;
		l_WH_CD = null;
		l_SUB_WS_CD = null;
		l_MODIFY_COUNT = null;
		l_SUB_WS_NAME = null;
		l_WH_NAME = null;
		l_WH_TYP = null;
		l_CLASS_NAME = null;
		l_WS_CLASS_01_CD = null;
		l_h_MODIFY_COUNT = null;
		l_WS_CLASS_01_NAME = null;

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
	 * medAA0060010�N���X�̕W���R���X�g���N�^
	 */
	public AA0060010Struct()
	{
		//{{user_implement_code_constractor
			//------------------------------------------------------------------
			initialize();
			//------------------------------------------------------------------
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
	public void setStruct(AA0060010Struct struct)
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
	public void setStructM(AA0060010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setCLASS_NAME_FLAG(struct.getCLASS_NAME_FLAG());
			this.seth_WS_CLASS_01_CD(struct.geth_WS_CLASS_01_CD());
			this.setw_PLANT_CD(struct.getw_PLANT_CD());
			this.setWS_CD(struct.getWS_CD());
			this.seth_WS_CD(struct.geth_WS_CD());
			this.setWS_NAME(struct.getWS_NAME());
			this.setWS_TEL(struct.getWS_TEL());
			this.setWS_PERSON(struct.getWS_PERSON());
			this.setWH_CD(struct.getWH_CD());
			this.setSUB_WS_CD(struct.getSUB_WS_CD());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setSUB_WS_NAME(struct.getSUB_WS_NAME());
			this.setWH_NAME(struct.getWH_NAME());
			this.setWH_TYP(struct.getWH_TYP());
			this.setCLASS_NAME(struct.getCLASS_NAME());
			this.setWS_CLASS_01_CD(struct.getWS_CLASS_01_CD());
			this.seth_MODIFY_COUNT(struct.geth_MODIFY_COUNT());
			this.setWS_CLASS_01_NAME(struct.getWS_CLASS_01_NAME());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AA0060010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_CLASS_NAME_FLAG(struct.getList_CLASS_NAME_FLAG());
			this.setList_h_WS_CLASS_01_CD(struct.getList_h_WS_CLASS_01_CD());
			this.setList_w_PLANT_CD(struct.getList_w_PLANT_CD());
			this.setList_WS_CD(struct.getList_WS_CD());
			this.setList_h_WS_CD(struct.getList_h_WS_CD());
			this.setList_WS_NAME(struct.getList_WS_NAME());
			this.setList_WS_TEL(struct.getList_WS_TEL());
			this.setList_WS_PERSON(struct.getList_WS_PERSON());
			this.setList_WH_CD(struct.getList_WH_CD());
			this.setList_SUB_WS_CD(struct.getList_SUB_WS_CD());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_SUB_WS_NAME(struct.getList_SUB_WS_NAME());
			this.setList_WH_NAME(struct.getList_WH_NAME());
			this.setList_WH_TYP(struct.getList_WH_TYP());
			this.setList_CLASS_NAME(struct.getList_CLASS_NAME());
			this.setList_WS_CLASS_01_CD(struct.getList_WS_CLASS_01_CD());
			this.setList_h_MODIFY_COUNT(struct.getList_h_MODIFY_COUNT());
			this.setList_WS_CLASS_01_NAME(struct.getList_WS_CLASS_01_NAME());
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
	// �� 1 �ϐ������l�F i_CLASS_NAME_FLAG


	final static String i_CLASS_NAME_FLAG = null;

	// �� 2 �ϐ������l�F i_h_WS_CLASS_01_CD


	final static String i_h_WS_CLASS_01_CD = null;

	// �� 3 �ϐ������l�F i_w_PLANT_CD


	final static String i_w_PLANT_CD = null;

	// �� 4 �ϐ������l�F i_WS_CD


	final static String i_WS_CD = null;

	// �� 5 �ϐ������l�F i_h_WS_CD


	final static String i_h_WS_CD = null;

	// �� 6 �ϐ������l�F i_WS_NAME


	final static String i_WS_NAME = null;

	// �� 7 �ϐ������l�F i_WS_TEL


	final static String i_WS_TEL = null;

	// �� 8 �ϐ������l�F i_WS_PERSON


	final static String i_WS_PERSON = null;

	// �� 9 �ϐ������l�F i_WH_CD


	final static String i_WH_CD = null;

	// �� 10 �ϐ������l�F i_SUB_WS_CD


	final static String i_SUB_WS_CD = null;

	// �� 11 �ϐ������l�F i_MODIFY_COUNT


	final static Integer i_MODIFY_COUNT = null;

	// �� 12 �ϐ������l�F i_SUB_WS_NAME


	final static String i_SUB_WS_NAME = null;

	// �� 13 �ϐ������l�F i_WH_NAME


	final static String i_WH_NAME = null;

	// �� 14 �ϐ������l�F i_WH_TYP


	final static String i_WH_TYP = null;

	// �� 15 �ϐ������l�F i_CLASS_NAME


	final static String i_CLASS_NAME = null;

	// �� 16 �ϐ������l�F i_WS_CLASS_01_CD


	final static String i_WS_CLASS_01_CD = null;

	// �� 17 �ϐ������l�F i_h_MODIFY_COUNT


	final static String i_h_MODIFY_COUNT = null;

	// �� 18 �ϐ������l�F i_WS_CLASS_01_NAME


	final static String i_WS_CLASS_01_NAME = null;

*/

	//{{user_implement_code
	/**
	 * ������
	 */
	public void initialize()
	{
		m_WS_CD = null;
		m_h_WS_CD = null;
		m_WS_NAME = null;
		m_WS_TEL = null;
		m_WS_PERSON = null;
		m_WH_CD = null;
		m_SUB_WS_CD = null;
		m_MODIFY_COUNT = new Integer(0);
		m_SUB_WS_NAME = null;
		m_WH_NAME = null;
		m_w_PLANT_CD = null;
		m_WH_TYP = null;
		// Add Anken Start 20140307 wang-tt
		m_WS_CLASS_01_CD = null;
		m_WS_CLASS_01_NAME = null;
		// Add Anken End   20140307 wang-tt

		l_WS_CD = new ArrayList(0);
		l_WS_NAME = new ArrayList(0);
		l_WS_TEL = new ArrayList(0);
		l_WS_PERSON = new ArrayList(0);
		l_WH_CD = new ArrayList(0);
		l_SUB_WS_CD = new ArrayList(0);
		l_MODIFY_COUNT = new ArrayList(0);
		l_SUB_WS_NAME = new ArrayList(0);
		l_WH_NAME = new ArrayList(0);
		l_w_PLANT_CD = new ArrayList(0);
		l_WH_TYP = new ArrayList(0);
		// Add Anken Start 20140307 wang-tt
		l_WS_CLASS_01_CD = null;
		l_WS_CLASS_01_NAME = null;
		// Add Anken End   20140307 wang-tt
	}

	/**
	 * �R�s�[
	 */
	public void copy(AA0060010Struct struct)
	{
		clear();
		if(struct.m_WS_CD != null) m_WS_CD = new String(struct.m_WS_CD);
		if(struct.m_h_WS_CD != null) m_h_WS_CD = new String(struct.m_h_WS_CD);
		if(struct.m_WS_NAME != null) m_WS_NAME = new String(struct.m_WS_NAME);
		if(struct.m_WS_TEL != null) m_WS_TEL = new String(struct.m_WS_TEL);
		if(struct.m_WS_PERSON != null) m_WS_PERSON = new String(struct.m_WS_PERSON);
		if(struct.m_WH_CD != null) m_WH_CD = new String(struct.m_WH_CD);
		if(struct.m_SUB_WS_CD != null) m_SUB_WS_CD = new String(struct.m_SUB_WS_CD);
		if(struct.m_MODIFY_COUNT != null) m_MODIFY_COUNT = new Integer(struct.m_MODIFY_COUNT.intValue());
		if(struct.m_SUB_WS_NAME != null) m_SUB_WS_NAME = new String(struct.m_SUB_WS_NAME);
		if(struct.m_WH_NAME != null) m_WH_NAME = new String(struct.m_WH_NAME);
		if(struct.m_w_PLANT_CD != null) m_w_PLANT_CD = new String(struct.m_w_PLANT_CD);
		if(struct.m_WH_TYP != null) m_WH_TYP = new String(struct.m_WH_TYP);
	}


	/**
	 * �R�s�[�R���X�g���N�^
	 */
	 public AA0060010Struct(AA0060010Struct struct)
	 {
	 	copy(struct);
	 }

	//------------------------------------------------------------------------------
        //}}user_implement_code

	//////////////////////////////

}
