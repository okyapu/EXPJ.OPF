/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DE0010/src/com/nec/jp/orteus/metamorBase/DE0010/DE0010010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.DE0010;

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

public class DE0010010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_BEFORE_HALF_TERM_TYP_DN */
	public String m_BEFORE_HALF_TERM_TYP_DN = null;
	/** �� 2 �ϐ��F m_AFTER_HALF_TERM_TYP_name */
	public String m_AFTER_HALF_TERM_TYP_name = null;
	/** �� 3 �ϐ��F m_AFTER_HALF_TERM_TYP_val */
	public String m_AFTER_HALF_TERM_TYP_val = null;
	/** �� 4 �ϐ��F m_BEFORE_YEAR */
	public String m_BEFORE_YEAR = null;
	/** �� 5 �ϐ��F m_BEFORE_MONTH */
	public String m_BEFORE_MONTH = null;
	/** �� 6 �ϐ��F m_BEFORE_HALF_TERM_TYP */
	public String m_BEFORE_HALF_TERM_TYP = null;
	/** �� 7 �ϐ��F m_BEFORE_TERM */
	public String m_BEFORE_TERM = null;
	/** �� 8 �ϐ��F m_START_MONTH */
	public String m_START_MONTH = null;
	/** �� 9 �ϐ��F m_AFTER_YEAR */
	public String m_AFTER_YEAR = null;
	/** �� 10 �ϐ��F m_AFTER_MONTH */
	public String m_AFTER_MONTH = null;
	/** �� 11 �ϐ��F m_AFTER_HALF_TERM_TYP */
	public String m_AFTER_HALF_TERM_TYP = null;
	/** �� 12 �ϐ��F m_AFTER_TERM */
	public String m_AFTER_TERM = null;
	/** �� 13 �ϐ��F m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** �� 14 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 15 �ϐ��F m_PLANT_NAME */
	public String m_PLANT_NAME = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_BEFORE_HALF_TERM_TYP_DN */
	public List l_BEFORE_HALF_TERM_TYP_DN = null;

	/** �� 2 List�ϐ��F l_AFTER_HALF_TERM_TYP_name */
	public List l_AFTER_HALF_TERM_TYP_name = null;

	/** �� 3 List�ϐ��F l_AFTER_HALF_TERM_TYP_val */
	public List l_AFTER_HALF_TERM_TYP_val = null;

	/** �� 4 List�ϐ��F l_BEFORE_YEAR */
	public List l_BEFORE_YEAR = null;

	/** �� 5 List�ϐ��F l_BEFORE_MONTH */
	public List l_BEFORE_MONTH = null;

	/** �� 6 List�ϐ��F l_BEFORE_HALF_TERM_TYP */
	public List l_BEFORE_HALF_TERM_TYP = null;

	/** �� 7 List�ϐ��F l_BEFORE_TERM */
	public List l_BEFORE_TERM = null;

	/** �� 8 List�ϐ��F l_START_MONTH */
	public List l_START_MONTH = null;

	/** �� 9 List�ϐ��F l_AFTER_YEAR */
	public List l_AFTER_YEAR = null;

	/** �� 10 List�ϐ��F l_AFTER_MONTH */
	public List l_AFTER_MONTH = null;

	/** �� 11 List�ϐ��F l_AFTER_HALF_TERM_TYP */
	public List l_AFTER_HALF_TERM_TYP = null;

	/** �� 12 List�ϐ��F l_AFTER_TERM */
	public List l_AFTER_TERM = null;

	/** �� 13 List�ϐ��F l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** �� 14 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 15 List�ϐ��F l_PLANT_NAME */
	public List l_PLANT_NAME = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getBEFORE_HALF_TERM_TYP_DN() { return m_BEFORE_HALF_TERM_TYP_DN; }
	public String getAFTER_HALF_TERM_TYP_name() { return m_AFTER_HALF_TERM_TYP_name; }
	public String getAFTER_HALF_TERM_TYP_val() { return m_AFTER_HALF_TERM_TYP_val; }
	public String getBEFORE_YEAR() { return m_BEFORE_YEAR; }
	public String getBEFORE_MONTH() { return m_BEFORE_MONTH; }
	public String getBEFORE_HALF_TERM_TYP() { return m_BEFORE_HALF_TERM_TYP; }
	public String getBEFORE_TERM() { return m_BEFORE_TERM; }
	public String getSTART_MONTH() { return m_START_MONTH; }
	public String getAFTER_YEAR() { return m_AFTER_YEAR; }
	public String getAFTER_MONTH() { return m_AFTER_MONTH; }
	public String getAFTER_HALF_TERM_TYP() { return m_AFTER_HALF_TERM_TYP; }
	public String getAFTER_TERM() { return m_AFTER_TERM; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }

	public List getList_BEFORE_HALF_TERM_TYP_DN() { return l_BEFORE_HALF_TERM_TYP_DN; }
	public List getList_AFTER_HALF_TERM_TYP_name() { return l_AFTER_HALF_TERM_TYP_name; }
	public List getList_AFTER_HALF_TERM_TYP_val() { return l_AFTER_HALF_TERM_TYP_val; }
	public List getList_BEFORE_YEAR() { return l_BEFORE_YEAR; }
	public List getList_BEFORE_MONTH() { return l_BEFORE_MONTH; }
	public List getList_BEFORE_HALF_TERM_TYP() { return l_BEFORE_HALF_TERM_TYP; }
	public List getList_BEFORE_TERM() { return l_BEFORE_TERM; }
	public List getList_START_MONTH() { return l_START_MONTH; }
	public List getList_AFTER_YEAR() { return l_AFTER_YEAR; }
	public List getList_AFTER_MONTH() { return l_AFTER_MONTH; }
	public List getList_AFTER_HALF_TERM_TYP() { return l_AFTER_HALF_TERM_TYP; }
	public List getList_AFTER_TERM() { return l_AFTER_TERM; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }

	public void setBEFORE_HALF_TERM_TYP_DN(String val) { m_BEFORE_HALF_TERM_TYP_DN = val; }
	public void setAFTER_HALF_TERM_TYP_name(String val) { m_AFTER_HALF_TERM_TYP_name = val; }
	public void setAFTER_HALF_TERM_TYP_val(String val) { m_AFTER_HALF_TERM_TYP_val = val; }
	public void setBEFORE_YEAR(String val) { m_BEFORE_YEAR = val; }
	public void setBEFORE_MONTH(String val) { m_BEFORE_MONTH = val; }
	public void setBEFORE_HALF_TERM_TYP(String val) { m_BEFORE_HALF_TERM_TYP = val; }
	public void setBEFORE_TERM(String val) { m_BEFORE_TERM = val; }
	public void setSTART_MONTH(String val) { m_START_MONTH = val; }
	public void setAFTER_YEAR(String val) { m_AFTER_YEAR = val; }
	public void setAFTER_MONTH(String val) { m_AFTER_MONTH = val; }
	public void setAFTER_HALF_TERM_TYP(String val) { m_AFTER_HALF_TERM_TYP = val; }
	public void setAFTER_TERM(String val) { m_AFTER_TERM = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }


	public void setList_BEFORE_HALF_TERM_TYP_DN(List list) { l_BEFORE_HALF_TERM_TYP_DN = list; }
	public void setList_AFTER_HALF_TERM_TYP_name(List list) { l_AFTER_HALF_TERM_TYP_name = list; }
	public void setList_AFTER_HALF_TERM_TYP_val(List list) { l_AFTER_HALF_TERM_TYP_val = list; }
	public void setList_BEFORE_YEAR(List list) { l_BEFORE_YEAR = list; }
	public void setList_BEFORE_MONTH(List list) { l_BEFORE_MONTH = list; }
	public void setList_BEFORE_HALF_TERM_TYP(List list) { l_BEFORE_HALF_TERM_TYP = list; }
	public void setList_BEFORE_TERM(List list) { l_BEFORE_TERM = list; }
	public void setList_START_MONTH(List list) { l_START_MONTH = list; }
	public void setList_AFTER_YEAR(List list) { l_AFTER_YEAR = list; }
	public void setList_AFTER_MONTH(List list) { l_AFTER_MONTH = list; }
	public void setList_AFTER_HALF_TERM_TYP(List list) { l_AFTER_HALF_TERM_TYP = list; }
	public void setList_AFTER_TERM(List list) { l_AFTER_TERM = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }

	public int setL2L_BEFORE_HALF_TERM_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BEFORE_HALF_TERM_TYP_DN == null) {
			l_BEFORE_HALF_TERM_TYP_DN = new ArrayList();
		} else {
			l_BEFORE_HALF_TERM_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BEFORE_HALF_TERM_TYP_DN.add(((DE0010010Struct) list.get(i)).getBEFORE_HALF_TERM_TYP_DN());
		}
		return size;
	}
	public int setL2L_AFTER_HALF_TERM_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_AFTER_HALF_TERM_TYP_name == null) {
			l_AFTER_HALF_TERM_TYP_name = new ArrayList();
		} else {
			l_AFTER_HALF_TERM_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_AFTER_HALF_TERM_TYP_name.add(((DE0010010Struct) list.get(i)).getAFTER_HALF_TERM_TYP_name());
		}
		return size;
	}
	public int setL2L_AFTER_HALF_TERM_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_AFTER_HALF_TERM_TYP_val == null) {
			l_AFTER_HALF_TERM_TYP_val = new ArrayList();
		} else {
			l_AFTER_HALF_TERM_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_AFTER_HALF_TERM_TYP_val.add(((DE0010010Struct) list.get(i)).getAFTER_HALF_TERM_TYP_val());
		}
		return size;
	}
	public int setL2L_BEFORE_YEAR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BEFORE_YEAR == null) {
			l_BEFORE_YEAR = new ArrayList();
		} else {
			l_BEFORE_YEAR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BEFORE_YEAR.add(((DE0010010Struct) list.get(i)).getBEFORE_YEAR());
		}
		return size;
	}
	public int setL2L_BEFORE_MONTH(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BEFORE_MONTH == null) {
			l_BEFORE_MONTH = new ArrayList();
		} else {
			l_BEFORE_MONTH.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BEFORE_MONTH.add(((DE0010010Struct) list.get(i)).getBEFORE_MONTH());
		}
		return size;
	}
	public int setL2L_BEFORE_HALF_TERM_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BEFORE_HALF_TERM_TYP == null) {
			l_BEFORE_HALF_TERM_TYP = new ArrayList();
		} else {
			l_BEFORE_HALF_TERM_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BEFORE_HALF_TERM_TYP.add(((DE0010010Struct) list.get(i)).getBEFORE_HALF_TERM_TYP());
		}
		return size;
	}
	public int setL2L_BEFORE_TERM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BEFORE_TERM == null) {
			l_BEFORE_TERM = new ArrayList();
		} else {
			l_BEFORE_TERM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BEFORE_TERM.add(((DE0010010Struct) list.get(i)).getBEFORE_TERM());
		}
		return size;
	}
	public int setL2L_START_MONTH(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_START_MONTH == null) {
			l_START_MONTH = new ArrayList();
		} else {
			l_START_MONTH.clear();
		}
		for (int i = 0; i < size; i++) {
			l_START_MONTH.add(((DE0010010Struct) list.get(i)).getSTART_MONTH());
		}
		return size;
	}
	public int setL2L_AFTER_YEAR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_AFTER_YEAR == null) {
			l_AFTER_YEAR = new ArrayList();
		} else {
			l_AFTER_YEAR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_AFTER_YEAR.add(((DE0010010Struct) list.get(i)).getAFTER_YEAR());
		}
		return size;
	}
	public int setL2L_AFTER_MONTH(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_AFTER_MONTH == null) {
			l_AFTER_MONTH = new ArrayList();
		} else {
			l_AFTER_MONTH.clear();
		}
		for (int i = 0; i < size; i++) {
			l_AFTER_MONTH.add(((DE0010010Struct) list.get(i)).getAFTER_MONTH());
		}
		return size;
	}
	public int setL2L_AFTER_HALF_TERM_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_AFTER_HALF_TERM_TYP == null) {
			l_AFTER_HALF_TERM_TYP = new ArrayList();
		} else {
			l_AFTER_HALF_TERM_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_AFTER_HALF_TERM_TYP.add(((DE0010010Struct) list.get(i)).getAFTER_HALF_TERM_TYP());
		}
		return size;
	}
	public int setL2L_AFTER_TERM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_AFTER_TERM == null) {
			l_AFTER_TERM = new ArrayList();
		} else {
			l_AFTER_TERM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_AFTER_TERM.add(((DE0010010Struct) list.get(i)).getAFTER_TERM());
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
			l_MODIFY_COUNT.add(((DE0010010Struct) list.get(i)).getMODIFY_COUNT());
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
			l_PLANT_CD.add(((DE0010010Struct) list.get(i)).getPLANT_CD());
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
			l_PLANT_NAME.add(((DE0010010Struct) list.get(i)).getPLANT_NAME());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_BEFORE_HALF_TERM_TYP_DN = null;
		m_AFTER_HALF_TERM_TYP_name = null;
		m_AFTER_HALF_TERM_TYP_val = null;
		m_BEFORE_YEAR = null;
		m_BEFORE_MONTH = null;
		m_BEFORE_HALF_TERM_TYP = null;
		m_BEFORE_TERM = null;
		m_START_MONTH = null;
		m_AFTER_YEAR = null;
		m_AFTER_MONTH = null;
		m_AFTER_HALF_TERM_TYP = null;
		m_AFTER_TERM = null;
		m_MODIFY_COUNT = null;
		m_PLANT_CD = null;
		m_PLANT_NAME = null;

		l_BEFORE_HALF_TERM_TYP_DN = null;
		l_AFTER_HALF_TERM_TYP_name = null;
		l_AFTER_HALF_TERM_TYP_val = null;
		l_BEFORE_YEAR = null;
		l_BEFORE_MONTH = null;
		l_BEFORE_HALF_TERM_TYP = null;
		l_BEFORE_TERM = null;
		l_START_MONTH = null;
		l_AFTER_YEAR = null;
		l_AFTER_MONTH = null;
		l_AFTER_HALF_TERM_TYP = null;
		l_AFTER_TERM = null;
		l_MODIFY_COUNT = null;
		l_PLANT_CD = null;
		l_PLANT_NAME = null;

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
	 * medDE0010010�N���X�̕W���R���X�g���N�^
	 */
	public DE0010010Struct()
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
	public void setStruct(DE0010010Struct struct)
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
	public void setStructM(DE0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setBEFORE_HALF_TERM_TYP_DN(struct.getBEFORE_HALF_TERM_TYP_DN());
			this.setAFTER_HALF_TERM_TYP_name(struct.getAFTER_HALF_TERM_TYP_name());
			this.setAFTER_HALF_TERM_TYP_val(struct.getAFTER_HALF_TERM_TYP_val());
			this.setBEFORE_YEAR(struct.getBEFORE_YEAR());
			this.setBEFORE_MONTH(struct.getBEFORE_MONTH());
			this.setBEFORE_HALF_TERM_TYP(struct.getBEFORE_HALF_TERM_TYP());
			this.setBEFORE_TERM(struct.getBEFORE_TERM());
			this.setSTART_MONTH(struct.getSTART_MONTH());
			this.setAFTER_YEAR(struct.getAFTER_YEAR());
			this.setAFTER_MONTH(struct.getAFTER_MONTH());
			this.setAFTER_HALF_TERM_TYP(struct.getAFTER_HALF_TERM_TYP());
			this.setAFTER_TERM(struct.getAFTER_TERM());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setPLANT_NAME(struct.getPLANT_NAME());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(DE0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_BEFORE_HALF_TERM_TYP_DN(struct.getList_BEFORE_HALF_TERM_TYP_DN());
			this.setList_AFTER_HALF_TERM_TYP_name(struct.getList_AFTER_HALF_TERM_TYP_name());
			this.setList_AFTER_HALF_TERM_TYP_val(struct.getList_AFTER_HALF_TERM_TYP_val());
			this.setList_BEFORE_YEAR(struct.getList_BEFORE_YEAR());
			this.setList_BEFORE_MONTH(struct.getList_BEFORE_MONTH());
			this.setList_BEFORE_HALF_TERM_TYP(struct.getList_BEFORE_HALF_TERM_TYP());
			this.setList_BEFORE_TERM(struct.getList_BEFORE_TERM());
			this.setList_START_MONTH(struct.getList_START_MONTH());
			this.setList_AFTER_YEAR(struct.getList_AFTER_YEAR());
			this.setList_AFTER_MONTH(struct.getList_AFTER_MONTH());
			this.setList_AFTER_HALF_TERM_TYP(struct.getList_AFTER_HALF_TERM_TYP());
			this.setList_AFTER_TERM(struct.getList_AFTER_TERM());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
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
	// �� 1 �ϐ������l�F i_BEFORE_HALF_TERM_TYP_DN


	final static String i_BEFORE_HALF_TERM_TYP_DN = null;

	// �� 2 �ϐ������l�F i_AFTER_HALF_TERM_TYP_name


	final static String i_AFTER_HALF_TERM_TYP_name = null;

	// �� 3 �ϐ������l�F i_AFTER_HALF_TERM_TYP_val


	final static String i_AFTER_HALF_TERM_TYP_val = null;

	// �� 4 �ϐ������l�F i_BEFORE_YEAR


	final static String i_BEFORE_YEAR = null;

	// �� 5 �ϐ������l�F i_BEFORE_MONTH


	final static String i_BEFORE_MONTH = null;

	// �� 6 �ϐ������l�F i_BEFORE_HALF_TERM_TYP


	final static String i_BEFORE_HALF_TERM_TYP = null;

	// �� 7 �ϐ������l�F i_BEFORE_TERM


	final static String i_BEFORE_TERM = null;

	// �� 8 �ϐ������l�F i_START_MONTH


	final static String i_START_MONTH = null;

	// �� 9 �ϐ������l�F i_AFTER_YEAR


	final static String i_AFTER_YEAR = null;

	// �� 10 �ϐ������l�F i_AFTER_MONTH


	final static String i_AFTER_MONTH = null;

	// �� 11 �ϐ������l�F i_AFTER_HALF_TERM_TYP


	final static String i_AFTER_HALF_TERM_TYP = null;

	// �� 12 �ϐ������l�F i_AFTER_TERM


	final static String i_AFTER_TERM = null;

	// �� 13 �ϐ������l�F i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// �� 14 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 15 �ϐ������l�F i_PLANT_NAME


	final static String i_PLANT_NAME = null;

*/

	//{{user_implement_code
         // TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
         // �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
        // �� 1 �ϐ������l�F i_BEFORE_YEAR
        final static String i_BEFORE_YEAR = null;
        // �� 2 �ϐ������l�F i_BEFORE_MONTH
        final static String i_BEFORE_MONTH = null;
        // �� 3 �ϐ������l�F i_BEFORE_HALF_TERM_TYP
        final static String i_BEFORE_HALF_TERM_TYP = null;
        // �� 4 �ϐ������l�F i_BEFORE_HALF_TERM_TYP_DN
        final static String i_BEFORE_HALF_TERM_TYP_DN = null;
        // �� 5 �ϐ������l�F i_BEFORE_TERM
        final static String i_BEFORE_TERM = null;
        // �� 6 �ϐ������l�F i_START_MONTH
        final static String i_START_MONTH = null;
        // �� 7 �ϐ������l�F i_AFTER_YEAR
        final static String i_AFTER_YEAR = null;
        // �� 8 �ϐ������l�F i_AFTER_MONTH
        final static String i_AFTER_MONTH = null;
        // �� 9 �ϐ������l�F i_AFTER_HALF_TERM_TYP
        final static String i_AFTER_HALF_TERM_TYP = null;
        // �� 10 �ϐ������l�F i_AFTER_TERM
        final static String i_AFTER_TERM = null;
        // �� 11 �ϐ������l�F i_MODIFY_COUNT
        final static String i_MODIFY_COUNT = null;
        // �� 12 �ϐ������l�F i_PLANT_CD
        final static String i_PLANT_CD = null;
        // �� 13 �ϐ������l�F i_PLANT_NAME
        final static String i_PLANT_NAME = null;
        // �� 14 �ϐ������l�F i_AFTER_HALF_TERM_TYP_name
        final static String i_AFTER_HALF_TERM_TYP_name = null;
        // �� 15 �ϐ������l�F i_AFTER_HALF_TERM_TYP_val
        final static String i_AFTER_HALF_TERM_TYP_val = null;
       
        /**
         * ������
         *
         */
        public void initialize()
        {
       
         clear();
       
         m_BEFORE_YEAR = i_BEFORE_YEAR;
         m_BEFORE_MONTH = i_BEFORE_MONTH;
         m_BEFORE_HALF_TERM_TYP = i_BEFORE_HALF_TERM_TYP;
         m_BEFORE_HALF_TERM_TYP_DN = i_BEFORE_HALF_TERM_TYP_DN;
         m_BEFORE_TERM = i_BEFORE_TERM;
         m_START_MONTH = i_START_MONTH;
         m_AFTER_YEAR = i_AFTER_YEAR;
         m_AFTER_MONTH = i_AFTER_MONTH;
         m_AFTER_HALF_TERM_TYP = i_AFTER_HALF_TERM_TYP;
         m_AFTER_TERM = i_AFTER_TERM;
         m_MODIFY_COUNT = i_MODIFY_COUNT;
         m_PLANT_CD = i_PLANT_CD;
         m_PLANT_NAME = i_PLANT_NAME;
         m_AFTER_HALF_TERM_TYP_name = i_AFTER_HALF_TERM_TYP_name;
         m_AFTER_HALF_TERM_TYP_val = i_AFTER_HALF_TERM_TYP_val;
        }
       
         // TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
