/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0140/src/com/nec/jp/orteus/metamorBase/AA0140/AA0140010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0140;

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
 * CLASS     : AA0140010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: chenjunhua268 $
 * @version $Revision: 1.5 $ $Date: 2012/10/25 07:48:14 $
 *
 */
//}}user_implement_code_header

public class AA0140010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** �� 2 �ϐ��F m_w_ITEM_CD */
	public String m_w_ITEM_CD = null;
	/** �� 3 �ϐ��F m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** �� 4 �ϐ��F m_w_PLANT_CD */
	public String m_w_PLANT_CD = null;
	/** �� 5 �ϐ��F m_PUCH_PRIORITY_REF_NO */
	public String m_PUCH_PRIORITY_REF_NO = null;
	/** �� 6 �ϐ��F m_VEND_CD */
	public String m_VEND_CD = null;
	/** �� 7 �ϐ��F m_PUCH_SIZE */
	public String m_PUCH_SIZE = null;
	/** �� 8 �ϐ��F m_UNIT_COST */
	public String m_UNIT_COST = null;
	/** �� 9 �ϐ��F m_CUR_UNIT */
	public String m_CUR_UNIT = null;
	/** �� 10 �ϐ��F m_PROCESSING_COST */
	public String m_PROCESSING_COST = null;
	/** �� 11 �ϐ��F m_MATERIAL_COST */
	public String m_MATERIAL_COST = null;
	/** �� 12 �ϐ��F m_OTHER_OVERHEADS */
	public String m_OTHER_OVERHEADS = null;
	/** �� 13 �ϐ��F m_EFF_PHASE_IN_DATE */
	public String m_EFF_PHASE_IN_DATE = null;
	/** �� 14 �ϐ��F m_VEND_NAME */
	public String m_VEND_NAME = null;
	/** �� 15 �ϐ��F m_DISPLAY_NAME */
	public String m_DISPLAY_NAME = null;
	/** �� 16 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 17 �ϐ��F m_l_COUNT */
	public String m_l_COUNT = null;
	/** �� 18 �ϐ��F m_ROW_COUNT */
	public String m_ROW_COUNT = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** �� 2 List�ϐ��F l_w_ITEM_CD */
	public List l_w_ITEM_CD = null;

	/** �� 3 List�ϐ��F l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** �� 4 List�ϐ��F l_w_PLANT_CD */
	public List l_w_PLANT_CD = null;

	/** �� 5 List�ϐ��F l_PUCH_PRIORITY_REF_NO */
	public List l_PUCH_PRIORITY_REF_NO = null;

	/** �� 6 List�ϐ��F l_VEND_CD */
	public List l_VEND_CD = null;

	/** �� 7 List�ϐ��F l_PUCH_SIZE */
	public List l_PUCH_SIZE = null;

	/** �� 8 List�ϐ��F l_UNIT_COST */
	public List l_UNIT_COST = null;

	/** �� 9 List�ϐ��F l_CUR_UNIT */
	public List l_CUR_UNIT = null;

	/** �� 10 List�ϐ��F l_PROCESSING_COST */
	public List l_PROCESSING_COST = null;

	/** �� 11 List�ϐ��F l_MATERIAL_COST */
	public List l_MATERIAL_COST = null;

	/** �� 12 List�ϐ��F l_OTHER_OVERHEADS */
	public List l_OTHER_OVERHEADS = null;

	/** �� 13 List�ϐ��F l_EFF_PHASE_IN_DATE */
	public List l_EFF_PHASE_IN_DATE = null;

	/** �� 14 List�ϐ��F l_VEND_NAME */
	public List l_VEND_NAME = null;

	/** �� 15 List�ϐ��F l_DISPLAY_NAME */
	public List l_DISPLAY_NAME = null;

	/** �� 16 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 17 List�ϐ��F l_l_COUNT */
	public List l_l_COUNT = null;

	/** �� 18 List�ϐ��F l_ROW_COUNT */
	public List l_ROW_COUNT = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getw_ITEM_CD() { return m_w_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getw_PLANT_CD() { return m_w_PLANT_CD; }
	public String getPUCH_PRIORITY_REF_NO() { return m_PUCH_PRIORITY_REF_NO; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getPUCH_SIZE() { return m_PUCH_SIZE; }
	public String getUNIT_COST() { return m_UNIT_COST; }
	public String getCUR_UNIT() { return m_CUR_UNIT; }
	public String getPROCESSING_COST() { return m_PROCESSING_COST; }
	public String getMATERIAL_COST() { return m_MATERIAL_COST; }
	public String getOTHER_OVERHEADS() { return m_OTHER_OVERHEADS; }
	public String getEFF_PHASE_IN_DATE() { return m_EFF_PHASE_IN_DATE; }
	public String getVEND_NAME() { return m_VEND_NAME; }
	public String getDISPLAY_NAME() { return m_DISPLAY_NAME; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }

	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_w_ITEM_CD() { return l_w_ITEM_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_w_PLANT_CD() { return l_w_PLANT_CD; }
	public List getList_PUCH_PRIORITY_REF_NO() { return l_PUCH_PRIORITY_REF_NO; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_PUCH_SIZE() { return l_PUCH_SIZE; }
	public List getList_UNIT_COST() { return l_UNIT_COST; }
	public List getList_CUR_UNIT() { return l_CUR_UNIT; }
	public List getList_PROCESSING_COST() { return l_PROCESSING_COST; }
	public List getList_MATERIAL_COST() { return l_MATERIAL_COST; }
	public List getList_OTHER_OVERHEADS() { return l_OTHER_OVERHEADS; }
	public List getList_EFF_PHASE_IN_DATE() { return l_EFF_PHASE_IN_DATE; }
	public List getList_VEND_NAME() { return l_VEND_NAME; }
	public List getList_DISPLAY_NAME() { return l_DISPLAY_NAME; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }

	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setw_ITEM_CD(String val) { m_w_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setw_PLANT_CD(String val) { m_w_PLANT_CD = val; }
	public void setPUCH_PRIORITY_REF_NO(String val) { m_PUCH_PRIORITY_REF_NO = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void setPUCH_SIZE(String val) { m_PUCH_SIZE = val; }
	public void setUNIT_COST(String val) { m_UNIT_COST = val; }
	public void setCUR_UNIT(String val) { m_CUR_UNIT = val; }
	public void setPROCESSING_COST(String val) { m_PROCESSING_COST = val; }
	public void setMATERIAL_COST(String val) { m_MATERIAL_COST = val; }
	public void setOTHER_OVERHEADS(String val) { m_OTHER_OVERHEADS = val; }
	public void setEFF_PHASE_IN_DATE(String val) { m_EFF_PHASE_IN_DATE = val; }
	public void setVEND_NAME(String val) { m_VEND_NAME = val; }
	public void setDISPLAY_NAME(String val) { m_DISPLAY_NAME = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }


	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_w_ITEM_CD(List list) { l_w_ITEM_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_w_PLANT_CD(List list) { l_w_PLANT_CD = list; }
	public void setList_PUCH_PRIORITY_REF_NO(List list) { l_PUCH_PRIORITY_REF_NO = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_PUCH_SIZE(List list) { l_PUCH_SIZE = list; }
	public void setList_UNIT_COST(List list) { l_UNIT_COST = list; }
	public void setList_CUR_UNIT(List list) { l_CUR_UNIT = list; }
	public void setList_PROCESSING_COST(List list) { l_PROCESSING_COST = list; }
	public void setList_MATERIAL_COST(List list) { l_MATERIAL_COST = list; }
	public void setList_OTHER_OVERHEADS(List list) { l_OTHER_OVERHEADS = list; }
	public void setList_EFF_PHASE_IN_DATE(List list) { l_EFF_PHASE_IN_DATE = list; }
	public void setList_VEND_NAME(List list) { l_VEND_NAME = list; }
	public void setList_DISPLAY_NAME(List list) { l_DISPLAY_NAME = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }

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
			l_DOWNLOAD_FILE.add(((AA0140010Struct) list.get(i)).getDOWNLOAD_FILE());
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
			l_w_ITEM_CD.add(((AA0140010Struct) list.get(i)).getw_ITEM_CD());
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
			l_ITEM_NAME.add(((AA0140010Struct) list.get(i)).getITEM_NAME());
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
			l_w_PLANT_CD.add(((AA0140010Struct) list.get(i)).getw_PLANT_CD());
		}
		return size;
	}
	public int setL2L_PUCH_PRIORITY_REF_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_PRIORITY_REF_NO == null) {
			l_PUCH_PRIORITY_REF_NO = new ArrayList();
		} else {
			l_PUCH_PRIORITY_REF_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_PRIORITY_REF_NO.add(((AA0140010Struct) list.get(i)).getPUCH_PRIORITY_REF_NO());
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
			l_VEND_CD.add(((AA0140010Struct) list.get(i)).getVEND_CD());
		}
		return size;
	}
	public int setL2L_PUCH_SIZE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_SIZE == null) {
			l_PUCH_SIZE = new ArrayList();
		} else {
			l_PUCH_SIZE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_SIZE.add(((AA0140010Struct) list.get(i)).getPUCH_SIZE());
		}
		return size;
	}
	public int setL2L_UNIT_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_COST == null) {
			l_UNIT_COST = new ArrayList();
		} else {
			l_UNIT_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_COST.add(((AA0140010Struct) list.get(i)).getUNIT_COST());
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
			l_CUR_UNIT.add(((AA0140010Struct) list.get(i)).getCUR_UNIT());
		}
		return size;
	}
	public int setL2L_PROCESSING_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROCESSING_COST == null) {
			l_PROCESSING_COST = new ArrayList();
		} else {
			l_PROCESSING_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROCESSING_COST.add(((AA0140010Struct) list.get(i)).getPROCESSING_COST());
		}
		return size;
	}
	public int setL2L_MATERIAL_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MATERIAL_COST == null) {
			l_MATERIAL_COST = new ArrayList();
		} else {
			l_MATERIAL_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MATERIAL_COST.add(((AA0140010Struct) list.get(i)).getMATERIAL_COST());
		}
		return size;
	}
	public int setL2L_OTHER_OVERHEADS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OTHER_OVERHEADS == null) {
			l_OTHER_OVERHEADS = new ArrayList();
		} else {
			l_OTHER_OVERHEADS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OTHER_OVERHEADS.add(((AA0140010Struct) list.get(i)).getOTHER_OVERHEADS());
		}
		return size;
	}
	public int setL2L_EFF_PHASE_IN_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EFF_PHASE_IN_DATE == null) {
			l_EFF_PHASE_IN_DATE = new ArrayList();
		} else {
			l_EFF_PHASE_IN_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EFF_PHASE_IN_DATE.add(((AA0140010Struct) list.get(i)).getEFF_PHASE_IN_DATE());
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
			l_VEND_NAME.add(((AA0140010Struct) list.get(i)).getVEND_NAME());
		}
		return size;
	}
	public int setL2L_DISPLAY_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DISPLAY_NAME == null) {
			l_DISPLAY_NAME = new ArrayList();
		} else {
			l_DISPLAY_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DISPLAY_NAME.add(((AA0140010Struct) list.get(i)).getDISPLAY_NAME());
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
			l_ITEM_CD.add(((AA0140010Struct) list.get(i)).getITEM_CD());
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
			l_l_COUNT.add(((AA0140010Struct) list.get(i)).getl_COUNT());
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
			l_ROW_COUNT.add(((AA0140010Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_DOWNLOAD_FILE = null;
		m_w_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_w_PLANT_CD = null;
		m_PUCH_PRIORITY_REF_NO = null;
		m_VEND_CD = null;
		m_PUCH_SIZE = null;
		m_UNIT_COST = null;
		m_CUR_UNIT = null;
		m_PROCESSING_COST = null;
		m_MATERIAL_COST = null;
		m_OTHER_OVERHEADS = null;
		m_EFF_PHASE_IN_DATE = null;
		m_VEND_NAME = null;
		m_DISPLAY_NAME = null;
		m_ITEM_CD = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;

		l_DOWNLOAD_FILE = null;
		l_w_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_w_PLANT_CD = null;
		l_PUCH_PRIORITY_REF_NO = null;
		l_VEND_CD = null;
		l_PUCH_SIZE = null;
		l_UNIT_COST = null;
		l_CUR_UNIT = null;
		l_PROCESSING_COST = null;
		l_MATERIAL_COST = null;
		l_OTHER_OVERHEADS = null;
		l_EFF_PHASE_IN_DATE = null;
		l_VEND_NAME = null;
		l_DISPLAY_NAME = null;
		l_ITEM_CD = null;
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
	 * medAA0140010�N���X�̕W���R���X�g���N�^
	 */
	public AA0140010Struct()
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
	public void setStruct(AA0140010Struct struct)
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
	public void setStructM(AA0140010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setw_ITEM_CD(struct.getw_ITEM_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setw_PLANT_CD(struct.getw_PLANT_CD());
			this.setPUCH_PRIORITY_REF_NO(struct.getPUCH_PRIORITY_REF_NO());
			this.setVEND_CD(struct.getVEND_CD());
			this.setPUCH_SIZE(struct.getPUCH_SIZE());
			this.setUNIT_COST(struct.getUNIT_COST());
			this.setCUR_UNIT(struct.getCUR_UNIT());
			this.setPROCESSING_COST(struct.getPROCESSING_COST());
			this.setMATERIAL_COST(struct.getMATERIAL_COST());
			this.setOTHER_OVERHEADS(struct.getOTHER_OVERHEADS());
			this.setEFF_PHASE_IN_DATE(struct.getEFF_PHASE_IN_DATE());
			this.setVEND_NAME(struct.getVEND_NAME());
			this.setDISPLAY_NAME(struct.getDISPLAY_NAME());
			this.setITEM_CD(struct.getITEM_CD());
			this.setl_COUNT(struct.getl_COUNT());
			this.setROW_COUNT(struct.getROW_COUNT());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AA0140010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_w_ITEM_CD(struct.getList_w_ITEM_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_w_PLANT_CD(struct.getList_w_PLANT_CD());
			this.setList_PUCH_PRIORITY_REF_NO(struct.getList_PUCH_PRIORITY_REF_NO());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_PUCH_SIZE(struct.getList_PUCH_SIZE());
			this.setList_UNIT_COST(struct.getList_UNIT_COST());
			this.setList_CUR_UNIT(struct.getList_CUR_UNIT());
			this.setList_PROCESSING_COST(struct.getList_PROCESSING_COST());
			this.setList_MATERIAL_COST(struct.getList_MATERIAL_COST());
			this.setList_OTHER_OVERHEADS(struct.getList_OTHER_OVERHEADS());
			this.setList_EFF_PHASE_IN_DATE(struct.getList_EFF_PHASE_IN_DATE());
			this.setList_VEND_NAME(struct.getList_VEND_NAME());
			this.setList_DISPLAY_NAME(struct.getList_DISPLAY_NAME());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
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
	// �� 1 �ϐ������l�F i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// �� 2 �ϐ������l�F i_w_ITEM_CD


	final static String i_w_ITEM_CD = null;

	// �� 3 �ϐ������l�F i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// �� 4 �ϐ������l�F i_w_PLANT_CD


	final static String i_w_PLANT_CD = null;

	// �� 5 �ϐ������l�F i_PUCH_PRIORITY_REF_NO


	final static String i_PUCH_PRIORITY_REF_NO = null;

	// �� 6 �ϐ������l�F i_VEND_CD


	final static String i_VEND_CD = null;

	// �� 7 �ϐ������l�F i_PUCH_SIZE


	final static String i_PUCH_SIZE = null;

	// �� 8 �ϐ������l�F i_UNIT_COST


	final static String i_UNIT_COST = null;

	// �� 9 �ϐ������l�F i_CUR_UNIT


	final static String i_CUR_UNIT = null;

	// �� 10 �ϐ������l�F i_PROCESSING_COST


	final static String i_PROCESSING_COST = null;

	// �� 11 �ϐ������l�F i_MATERIAL_COST


	final static String i_MATERIAL_COST = null;

	// �� 12 �ϐ������l�F i_OTHER_OVERHEADS


	final static String i_OTHER_OVERHEADS = null;

	// �� 13 �ϐ������l�F i_EFF_PHASE_IN_DATE


	final static String i_EFF_PHASE_IN_DATE = null;

	// �� 14 �ϐ������l�F i_VEND_NAME


	final static String i_VEND_NAME = null;

	// �� 15 �ϐ������l�F i_DISPLAY_NAME


	final static String i_DISPLAY_NAME = null;

	// �� 16 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 17 �ϐ������l�F i_l_COUNT


	final static String i_l_COUNT = null;

	// �� 18 �ϐ������l�F i_ROW_COUNT


	final static String i_ROW_COUNT = null;

*/

	//{{user_implement_code
		// TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
		// �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
	// �� 1 �ϐ������l�F i_DOWNLOAD_FILE

	final static String i_DOWNLOAD_FILE = null;

	// �� 2 �ϐ������l�F i_w_ITEM_CD

	final static String i_w_ITEM_CD = null;

	// �� 3 �ϐ������l�F i_w_PLANT_CD

	final static String i_w_PLANT_CD = null;

	// �� 4 �ϐ������l�F i_ITEM_NAME

	final static String i_ITEM_NAME = null;

	// �� 5 �ϐ������l�F i_PUCH_PRIORITY_REF_NO

	final static String i_PUCH_PRIORITY_REF_NO = null;

	// �� 6 �ϐ������l�F i_VEND_CD

	final static String i_VEND_CD = null;

	// �� 7 �ϐ������l�F i_PUCH_SIZE

	final static String i_PUCH_SIZE = null;

	// �� 8 �ϐ������l�F i_UNIT_COST

	final static String i_UNIT_COST = null;

	// �� 9 �ϐ������l�F i_EFF_PHASE_IN_DATE

	final static String i_EFF_PHASE_IN_DATE = null;

	// �� 10 �ϐ������l�F i_VEND_NAME

	final static String i_VEND_NAME = null;

	// �� 11 �ϐ������l�F i_DISPLAY_NAME

	final static String i_DISPLAY_NAME = null;

	// �� 12 �ϐ������l�F i_ITEM_CD

	final static String i_ITEM_CD = null;


	/**
	 * ������
	 *
	 */
	public void initialize()
	{

		clear();

		m_DOWNLOAD_FILE = i_DOWNLOAD_FILE;
		m_w_ITEM_CD = i_w_ITEM_CD;
		m_w_PLANT_CD = i_w_PLANT_CD;
		m_ITEM_NAME = i_ITEM_NAME;
		m_PUCH_PRIORITY_REF_NO = i_PUCH_PRIORITY_REF_NO;
		m_VEND_CD = i_VEND_CD;
		m_PUCH_SIZE = i_PUCH_SIZE;
		m_UNIT_COST = i_UNIT_COST;
		m_EFF_PHASE_IN_DATE = i_EFF_PHASE_IN_DATE;
		m_VEND_NAME = i_VEND_NAME;
		m_DISPLAY_NAME = i_DISPLAY_NAME;
		m_ITEM_CD = i_ITEM_CD;
	}
		// TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
