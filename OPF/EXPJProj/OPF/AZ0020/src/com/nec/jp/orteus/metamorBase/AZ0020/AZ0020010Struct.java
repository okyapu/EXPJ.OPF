/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AZ0020/src/com/nec/jp/orteus/metamorBase/AZ0020/AZ0020010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AZ0020;

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

public class AZ0020010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_h_USER_CD */
	public String m_h_USER_CD = null;
	/** �� 2 �ϐ��F m_FROM_BUSINESS_NAME */
	public String m_FROM_BUSINESS_NAME = null;
	/** �� 3 �ϐ��F m_TO_BUSINESS_NAME */
	public String m_TO_BUSINESS_NAME = null;
	/** �� 4 �ϐ��F m_LIST_PLANT_NAME */
	public String m_LIST_PLANT_NAME = null;
	/** �� 5 �ϐ��F m_LIST_TO_BUSINESS_NAME */
	public String m_LIST_TO_BUSINESS_NAME = null;
	/** �� 6 �ϐ��F m_DELETE_FLG */
	public String m_DELETE_FLG = null;
	/** �� 7 �ϐ��F m_MODE_FORM_FROM_NAME */
	public String m_MODE_FORM_FROM_NAME = null;
	/** �� 8 �ϐ��F m_MODE_FORM_TO_NAME */
	public String m_MODE_FORM_TO_NAME = null;
	/** �� 9 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 10 �ϐ��F m_CANCEL_CD */
	public String m_CANCEL_CD = null;
	/** �� 11 �ϐ��F m_CREATE_DATE */
	public String m_CREATE_DATE = null;
	/** �� 12 �ϐ��F m_USER_NAME */
	public String m_USER_NAME = null;
	/** �� 13 �ϐ��F m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** �� 14 �ϐ��F m_USER_CD */
	public String m_USER_CD = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_h_USER_CD */
	public List l_h_USER_CD = null;

	/** �� 2 List�ϐ��F l_FROM_BUSINESS_NAME */
	public List l_FROM_BUSINESS_NAME = null;

	/** �� 3 List�ϐ��F l_TO_BUSINESS_NAME */
	public List l_TO_BUSINESS_NAME = null;

	/** �� 4 List�ϐ��F l_LIST_PLANT_NAME */
	public List l_LIST_PLANT_NAME = null;

	/** �� 5 List�ϐ��F l_LIST_TO_BUSINESS_NAME */
	public List l_LIST_TO_BUSINESS_NAME = null;

	/** �� 6 List�ϐ��F l_DELETE_FLG */
	public List l_DELETE_FLG = null;

	/** �� 7 List�ϐ��F l_MODE_FORM_FROM_NAME */
	public List l_MODE_FORM_FROM_NAME = null;

	/** �� 8 List�ϐ��F l_MODE_FORM_TO_NAME */
	public List l_MODE_FORM_TO_NAME = null;

	/** �� 9 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 10 List�ϐ��F l_CANCEL_CD */
	public List l_CANCEL_CD = null;

	/** �� 11 List�ϐ��F l_CREATE_DATE */
	public List l_CREATE_DATE = null;

	/** �� 12 List�ϐ��F l_USER_NAME */
	public List l_USER_NAME = null;

	/** �� 13 List�ϐ��F l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** �� 14 List�ϐ��F l_USER_CD */
	public List l_USER_CD = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String geth_USER_CD() { return m_h_USER_CD; }
	public String getFROM_BUSINESS_NAME() { return m_FROM_BUSINESS_NAME; }
	public String getTO_BUSINESS_NAME() { return m_TO_BUSINESS_NAME; }
	public String getLIST_PLANT_NAME() { return m_LIST_PLANT_NAME; }
	public String getLIST_TO_BUSINESS_NAME() { return m_LIST_TO_BUSINESS_NAME; }
	public String getDELETE_FLG() { return m_DELETE_FLG; }
	public String getMODE_FORM_FROM_NAME() { return m_MODE_FORM_FROM_NAME; }
	public String getMODE_FORM_TO_NAME() { return m_MODE_FORM_TO_NAME; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getCANCEL_CD() { return m_CANCEL_CD; }
	public String getCREATE_DATE() { return m_CREATE_DATE; }
	public String getUSER_NAME() { return m_USER_NAME; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getUSER_CD() { return m_USER_CD; }

	public List getList_h_USER_CD() { return l_h_USER_CD; }
	public List getList_FROM_BUSINESS_NAME() { return l_FROM_BUSINESS_NAME; }
	public List getList_TO_BUSINESS_NAME() { return l_TO_BUSINESS_NAME; }
	public List getList_LIST_PLANT_NAME() { return l_LIST_PLANT_NAME; }
	public List getList_LIST_TO_BUSINESS_NAME() { return l_LIST_TO_BUSINESS_NAME; }
	public List getList_DELETE_FLG() { return l_DELETE_FLG; }
	public List getList_MODE_FORM_FROM_NAME() { return l_MODE_FORM_FROM_NAME; }
	public List getList_MODE_FORM_TO_NAME() { return l_MODE_FORM_TO_NAME; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_CANCEL_CD() { return l_CANCEL_CD; }
	public List getList_CREATE_DATE() { return l_CREATE_DATE; }
	public List getList_USER_NAME() { return l_USER_NAME; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_USER_CD() { return l_USER_CD; }

	public void seth_USER_CD(String val) { m_h_USER_CD = val; }
	public void setFROM_BUSINESS_NAME(String val) { m_FROM_BUSINESS_NAME = val; }
	public void setTO_BUSINESS_NAME(String val) { m_TO_BUSINESS_NAME = val; }
	public void setLIST_PLANT_NAME(String val) { m_LIST_PLANT_NAME = val; }
	public void setLIST_TO_BUSINESS_NAME(String val) { m_LIST_TO_BUSINESS_NAME = val; }
	public void setDELETE_FLG(String val) { m_DELETE_FLG = val; }
	public void setMODE_FORM_FROM_NAME(String val) { m_MODE_FORM_FROM_NAME = val; }
	public void setMODE_FORM_TO_NAME(String val) { m_MODE_FORM_TO_NAME = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setCANCEL_CD(String val) { m_CANCEL_CD = val; }
	public void setCREATE_DATE(String val) { m_CREATE_DATE = val; }
	public void setUSER_NAME(String val) { m_USER_NAME = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setUSER_CD(String val) { m_USER_CD = val; }


	public void setList_h_USER_CD(List list) { l_h_USER_CD = list; }
	public void setList_FROM_BUSINESS_NAME(List list) { l_FROM_BUSINESS_NAME = list; }
	public void setList_TO_BUSINESS_NAME(List list) { l_TO_BUSINESS_NAME = list; }
	public void setList_LIST_PLANT_NAME(List list) { l_LIST_PLANT_NAME = list; }
	public void setList_LIST_TO_BUSINESS_NAME(List list) { l_LIST_TO_BUSINESS_NAME = list; }
	public void setList_DELETE_FLG(List list) { l_DELETE_FLG = list; }
	public void setList_MODE_FORM_FROM_NAME(List list) { l_MODE_FORM_FROM_NAME = list; }
	public void setList_MODE_FORM_TO_NAME(List list) { l_MODE_FORM_TO_NAME = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_CANCEL_CD(List list) { l_CANCEL_CD = list; }
	public void setList_CREATE_DATE(List list) { l_CREATE_DATE = list; }
	public void setList_USER_NAME(List list) { l_USER_NAME = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_USER_CD(List list) { l_USER_CD = list; }

	public int setL2L_h_USER_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_USER_CD == null) {
			l_h_USER_CD = new ArrayList();
		} else {
			l_h_USER_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_USER_CD.add(((AZ0020010Struct) list.get(i)).geth_USER_CD());
		}
		return size;
	}
	public int setL2L_FROM_BUSINESS_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FROM_BUSINESS_NAME == null) {
			l_FROM_BUSINESS_NAME = new ArrayList();
		} else {
			l_FROM_BUSINESS_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FROM_BUSINESS_NAME.add(((AZ0020010Struct) list.get(i)).getFROM_BUSINESS_NAME());
		}
		return size;
	}
	public int setL2L_TO_BUSINESS_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TO_BUSINESS_NAME == null) {
			l_TO_BUSINESS_NAME = new ArrayList();
		} else {
			l_TO_BUSINESS_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TO_BUSINESS_NAME.add(((AZ0020010Struct) list.get(i)).getTO_BUSINESS_NAME());
		}
		return size;
	}
	public int setL2L_LIST_PLANT_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LIST_PLANT_NAME == null) {
			l_LIST_PLANT_NAME = new ArrayList();
		} else {
			l_LIST_PLANT_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LIST_PLANT_NAME.add(((AZ0020010Struct) list.get(i)).getLIST_PLANT_NAME());
		}
		return size;
	}
	public int setL2L_LIST_TO_BUSINESS_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LIST_TO_BUSINESS_NAME == null) {
			l_LIST_TO_BUSINESS_NAME = new ArrayList();
		} else {
			l_LIST_TO_BUSINESS_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LIST_TO_BUSINESS_NAME.add(((AZ0020010Struct) list.get(i)).getLIST_TO_BUSINESS_NAME());
		}
		return size;
	}
	public int setL2L_DELETE_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DELETE_FLG == null) {
			l_DELETE_FLG = new ArrayList();
		} else {
			l_DELETE_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DELETE_FLG.add(((AZ0020010Struct) list.get(i)).getDELETE_FLG());
		}
		return size;
	}
	public int setL2L_MODE_FORM_FROM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MODE_FORM_FROM_NAME == null) {
			l_MODE_FORM_FROM_NAME = new ArrayList();
		} else {
			l_MODE_FORM_FROM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MODE_FORM_FROM_NAME.add(((AZ0020010Struct) list.get(i)).getMODE_FORM_FROM_NAME());
		}
		return size;
	}
	public int setL2L_MODE_FORM_TO_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MODE_FORM_TO_NAME == null) {
			l_MODE_FORM_TO_NAME = new ArrayList();
		} else {
			l_MODE_FORM_TO_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MODE_FORM_TO_NAME.add(((AZ0020010Struct) list.get(i)).getMODE_FORM_TO_NAME());
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
			l_PLANT_CD.add(((AZ0020010Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_CANCEL_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CANCEL_CD == null) {
			l_CANCEL_CD = new ArrayList();
		} else {
			l_CANCEL_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CANCEL_CD.add(((AZ0020010Struct) list.get(i)).getCANCEL_CD());
		}
		return size;
	}
	public int setL2L_CREATE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CREATE_DATE == null) {
			l_CREATE_DATE = new ArrayList();
		} else {
			l_CREATE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CREATE_DATE.add(((AZ0020010Struct) list.get(i)).getCREATE_DATE());
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
			l_USER_NAME.add(((AZ0020010Struct) list.get(i)).getUSER_NAME());
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
			l_PLANT_NAME.add(((AZ0020010Struct) list.get(i)).getPLANT_NAME());
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
			l_USER_CD.add(((AZ0020010Struct) list.get(i)).getUSER_CD());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_h_USER_CD = null;
		m_FROM_BUSINESS_NAME = null;
		m_TO_BUSINESS_NAME = null;
		m_LIST_PLANT_NAME = null;
		m_LIST_TO_BUSINESS_NAME = null;
		m_DELETE_FLG = null;
		m_MODE_FORM_FROM_NAME = null;
		m_MODE_FORM_TO_NAME = null;
		m_PLANT_CD = null;
		m_CANCEL_CD = null;
		m_CREATE_DATE = null;
		m_USER_NAME = null;
		m_PLANT_NAME = null;
		m_USER_CD = null;

		l_h_USER_CD = null;
		l_FROM_BUSINESS_NAME = null;
		l_TO_BUSINESS_NAME = null;
		l_LIST_PLANT_NAME = null;
		l_LIST_TO_BUSINESS_NAME = null;
		l_DELETE_FLG = null;
		l_MODE_FORM_FROM_NAME = null;
		l_MODE_FORM_TO_NAME = null;
		l_PLANT_CD = null;
		l_CANCEL_CD = null;
		l_CREATE_DATE = null;
		l_USER_NAME = null;
		l_PLANT_NAME = null;
		l_USER_CD = null;

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
	 * medAZ0020010�N���X�̕W���R���X�g���N�^
	 */
	public AZ0020010Struct()
	{
		//{{user_implement_code_constractor
                              l_LIST_PLANT_NAME = new ArrayList();
                              l_PLANT_CD = new ArrayList();
                              l_LIST_TO_BUSINESS_NAME = new ArrayList();
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
	public void setStruct(AZ0020010Struct struct)
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
	public void setStructM(AZ0020010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.seth_USER_CD(struct.geth_USER_CD());
			this.setFROM_BUSINESS_NAME(struct.getFROM_BUSINESS_NAME());
			this.setTO_BUSINESS_NAME(struct.getTO_BUSINESS_NAME());
			this.setLIST_PLANT_NAME(struct.getLIST_PLANT_NAME());
			this.setLIST_TO_BUSINESS_NAME(struct.getLIST_TO_BUSINESS_NAME());
			this.setDELETE_FLG(struct.getDELETE_FLG());
			this.setMODE_FORM_FROM_NAME(struct.getMODE_FORM_FROM_NAME());
			this.setMODE_FORM_TO_NAME(struct.getMODE_FORM_TO_NAME());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setCANCEL_CD(struct.getCANCEL_CD());
			this.setCREATE_DATE(struct.getCREATE_DATE());
			this.setUSER_NAME(struct.getUSER_NAME());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.setUSER_CD(struct.getUSER_CD());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AZ0020010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_h_USER_CD(struct.getList_h_USER_CD());
			this.setList_FROM_BUSINESS_NAME(struct.getList_FROM_BUSINESS_NAME());
			this.setList_TO_BUSINESS_NAME(struct.getList_TO_BUSINESS_NAME());
			this.setList_LIST_PLANT_NAME(struct.getList_LIST_PLANT_NAME());
			this.setList_LIST_TO_BUSINESS_NAME(struct.getList_LIST_TO_BUSINESS_NAME());
			this.setList_DELETE_FLG(struct.getList_DELETE_FLG());
			this.setList_MODE_FORM_FROM_NAME(struct.getList_MODE_FORM_FROM_NAME());
			this.setList_MODE_FORM_TO_NAME(struct.getList_MODE_FORM_TO_NAME());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_CANCEL_CD(struct.getList_CANCEL_CD());
			this.setList_CREATE_DATE(struct.getList_CREATE_DATE());
			this.setList_USER_NAME(struct.getList_USER_NAME());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_USER_CD(struct.getList_USER_CD());
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
	// �� 1 �ϐ������l�F i_h_USER_CD


	final static String i_h_USER_CD = null;

	// �� 2 �ϐ������l�F i_FROM_BUSINESS_NAME


	final static String i_FROM_BUSINESS_NAME = null;

	// �� 3 �ϐ������l�F i_TO_BUSINESS_NAME


	final static String i_TO_BUSINESS_NAME = null;

	// �� 4 �ϐ������l�F i_LIST_PLANT_NAME


	final static String i_LIST_PLANT_NAME = null;

	// �� 5 �ϐ������l�F i_LIST_TO_BUSINESS_NAME


	final static String i_LIST_TO_BUSINESS_NAME = null;

	// �� 6 �ϐ������l�F i_DELETE_FLG


	final static String i_DELETE_FLG = null;

	// �� 7 �ϐ������l�F i_MODE_FORM_FROM_NAME


	final static String i_MODE_FORM_FROM_NAME = null;

	// �� 8 �ϐ������l�F i_MODE_FORM_TO_NAME


	final static String i_MODE_FORM_TO_NAME = null;

	// �� 9 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 10 �ϐ������l�F i_CANCEL_CD


	final static String i_CANCEL_CD = null;

	// �� 11 �ϐ������l�F i_CREATE_DATE


	final static String i_CREATE_DATE = null;

	// �� 12 �ϐ������l�F i_USER_NAME


	final static String i_USER_NAME = null;

	// �� 13 �ϐ������l�F i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// �� 14 �ϐ������l�F i_USER_CD


	final static String i_USER_CD = null;

*/

	//{{user_implement_code
               //------------------------------------------------------------------------------
              
               /**
                * ������
                */
               public void init()
               {
                m_h_USER_CD = "0";
               }
               
               /**
                * �\���p���X�g�Ƀf�[�^���Z�b�g
                * @param struct �ꎞ�ޔ�p���X�g
                */
               public void copy(AZ0020010Struct struct)
               {
                /** �� 1 �ϐ��F m_CANCEL_CD */
                m_CANCEL_CD = struct.m_CANCEL_CD;
                /** �� 2 �ϐ��F m_CREATE_DATE */
                m_CREATE_DATE = struct.m_CREATE_DATE;
                /** �� 3 �ϐ��F m_USER_NAME */
                m_USER_NAME = struct.m_USER_NAME;
                /** �� 4 �ϐ��F m_MODE_FORM_FROM_NAME */
                m_MODE_FORM_FROM_NAME = struct.m_MODE_FORM_FROM_NAME;
                
                for(int i=0; i<struct.l_PLANT_CD.size(); i++) {
                 l_PLANT_CD.add(struct.l_PLANT_CD.get(i));
                }
                
                for(int i=0; i<struct.l_LIST_PLANT_NAME.size(); i++) {
                 l_LIST_PLANT_NAME.add(struct.l_LIST_PLANT_NAME.get(i));
                }
                 
                for(int i=0; i<struct.l_LIST_TO_BUSINESS_NAME.size(); i++) {
                 l_LIST_TO_BUSINESS_NAME.add(struct.l_LIST_TO_BUSINESS_NAME.get(i));
                }
               }
               //------------------------------------------------------------------------------
        //}}user_implement_code

	//////////////////////////////

}
