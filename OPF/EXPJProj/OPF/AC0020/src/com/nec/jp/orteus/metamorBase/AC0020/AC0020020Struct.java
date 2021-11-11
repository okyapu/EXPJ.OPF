/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0020/src/com/nec/jp/orteus/metamorBase/AC0020/AC0020020Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0020;

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

public class AC0020020Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_txtEntryDate */
	public String m_txtEntryDate = null;
	/** �� 2 �ϐ��F m_rdoOutsideTyp1 */
	public String m_rdoOutsideTyp1 = null;
	/** �� 3 �ϐ��F m_rdoOutsideTyp2 */
	public String m_rdoOutsideTyp2 = null;
	/** �� 4 �ϐ��F m_rdoOutsideTyp3 */
	public String m_rdoOutsideTyp3 = null;
	/** �� 5 �ϐ��F m_rdoEntry1Typ1 */
	public String m_rdoEntry1Typ1 = null;
	/** �� 6 �ϐ��F m_rdoEntry1Typ2 */
	public String m_rdoEntry1Typ2 = null;
	/** �� 7 �ϐ��F m_rdoEntry1Typ3 */
	public String m_rdoEntry1Typ3 = null;
	/** �� 8 �ϐ��F m_rdoOutsideTyp */
	public String m_rdoOutsideTyp = null;
	/** �� 9 �ϐ��F m_rdoEntry1Typ */
	public String m_rdoEntry1Typ = null;
	/** �� 10 �ϐ��F m_txtEntryTime */
	public String m_txtEntryTime = null;
	/** �� 11 �ϐ��F m_hdnBusinessOprDate */
	public String m_hdnBusinessOprDate = null;
	/** �� 12 �ϐ��F m_plantCd */
	public String m_plantCd = null;
	/** �� 13 �ϐ��F m_TIME_CTRL */
	public String m_TIME_CTRL = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_txtEntryDate */
	public List l_txtEntryDate = null;

	/** �� 2 List�ϐ��F l_rdoOutsideTyp1 */
	public List l_rdoOutsideTyp1 = null;

	/** �� 3 List�ϐ��F l_rdoOutsideTyp2 */
	public List l_rdoOutsideTyp2 = null;

	/** �� 4 List�ϐ��F l_rdoOutsideTyp3 */
	public List l_rdoOutsideTyp3 = null;

	/** �� 5 List�ϐ��F l_rdoEntry1Typ1 */
	public List l_rdoEntry1Typ1 = null;

	/** �� 6 List�ϐ��F l_rdoEntry1Typ2 */
	public List l_rdoEntry1Typ2 = null;

	/** �� 7 List�ϐ��F l_rdoEntry1Typ3 */
	public List l_rdoEntry1Typ3 = null;

	/** �� 8 List�ϐ��F l_rdoOutsideTyp */
	public List l_rdoOutsideTyp = null;

	/** �� 9 List�ϐ��F l_rdoEntry1Typ */
	public List l_rdoEntry1Typ = null;

	/** �� 10 List�ϐ��F l_txtEntryTime */
	public List l_txtEntryTime = null;

	/** �� 11 List�ϐ��F l_hdnBusinessOprDate */
	public List l_hdnBusinessOprDate = null;

	/** �� 12 List�ϐ��F l_plantCd */
	public List l_plantCd = null;

	/** �� 13 List�ϐ��F l_TIME_CTRL */
	public List l_TIME_CTRL = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String gettxtEntryDate() { return m_txtEntryDate; }
	public String getrdoOutsideTyp1() { return m_rdoOutsideTyp1; }
	public String getrdoOutsideTyp2() { return m_rdoOutsideTyp2; }
	public String getrdoOutsideTyp3() { return m_rdoOutsideTyp3; }
	public String getrdoEntry1Typ1() { return m_rdoEntry1Typ1; }
	public String getrdoEntry1Typ2() { return m_rdoEntry1Typ2; }
	public String getrdoEntry1Typ3() { return m_rdoEntry1Typ3; }
	public String getrdoOutsideTyp() { return m_rdoOutsideTyp; }
	public String getrdoEntry1Typ() { return m_rdoEntry1Typ; }
	public String gettxtEntryTime() { return m_txtEntryTime; }
	public String gethdnBusinessOprDate() { return m_hdnBusinessOprDate; }
	public String getplantCd() { return m_plantCd; }
	public String getTIME_CTRL() { return m_TIME_CTRL; }

	public List getList_txtEntryDate() { return l_txtEntryDate; }
	public List getList_rdoOutsideTyp1() { return l_rdoOutsideTyp1; }
	public List getList_rdoOutsideTyp2() { return l_rdoOutsideTyp2; }
	public List getList_rdoOutsideTyp3() { return l_rdoOutsideTyp3; }
	public List getList_rdoEntry1Typ1() { return l_rdoEntry1Typ1; }
	public List getList_rdoEntry1Typ2() { return l_rdoEntry1Typ2; }
	public List getList_rdoEntry1Typ3() { return l_rdoEntry1Typ3; }
	public List getList_rdoOutsideTyp() { return l_rdoOutsideTyp; }
	public List getList_rdoEntry1Typ() { return l_rdoEntry1Typ; }
	public List getList_txtEntryTime() { return l_txtEntryTime; }
	public List getList_hdnBusinessOprDate() { return l_hdnBusinessOprDate; }
	public List getList_plantCd() { return l_plantCd; }
	public List getList_TIME_CTRL() { return l_TIME_CTRL; }

	public void settxtEntryDate(String val) { m_txtEntryDate = val; }
	public void setrdoOutsideTyp1(String val) { m_rdoOutsideTyp1 = val; }
	public void setrdoOutsideTyp2(String val) { m_rdoOutsideTyp2 = val; }
	public void setrdoOutsideTyp3(String val) { m_rdoOutsideTyp3 = val; }
	public void setrdoEntry1Typ1(String val) { m_rdoEntry1Typ1 = val; }
	public void setrdoEntry1Typ2(String val) { m_rdoEntry1Typ2 = val; }
	public void setrdoEntry1Typ3(String val) { m_rdoEntry1Typ3 = val; }
	public void setrdoOutsideTyp(String val) { m_rdoOutsideTyp = val; }
	public void setrdoEntry1Typ(String val) { m_rdoEntry1Typ = val; }
	public void settxtEntryTime(String val) { m_txtEntryTime = val; }
	public void sethdnBusinessOprDate(String val) { m_hdnBusinessOprDate = val; }
	public void setplantCd(String val) { m_plantCd = val; }
	public void setTIME_CTRL(String val) { m_TIME_CTRL = val; }


	public void setList_txtEntryDate(List list) { l_txtEntryDate = list; }
	public void setList_rdoOutsideTyp1(List list) { l_rdoOutsideTyp1 = list; }
	public void setList_rdoOutsideTyp2(List list) { l_rdoOutsideTyp2 = list; }
	public void setList_rdoOutsideTyp3(List list) { l_rdoOutsideTyp3 = list; }
	public void setList_rdoEntry1Typ1(List list) { l_rdoEntry1Typ1 = list; }
	public void setList_rdoEntry1Typ2(List list) { l_rdoEntry1Typ2 = list; }
	public void setList_rdoEntry1Typ3(List list) { l_rdoEntry1Typ3 = list; }
	public void setList_rdoOutsideTyp(List list) { l_rdoOutsideTyp = list; }
	public void setList_rdoEntry1Typ(List list) { l_rdoEntry1Typ = list; }
	public void setList_txtEntryTime(List list) { l_txtEntryTime = list; }
	public void setList_hdnBusinessOprDate(List list) { l_hdnBusinessOprDate = list; }
	public void setList_plantCd(List list) { l_plantCd = list; }
	public void setList_TIME_CTRL(List list) { l_TIME_CTRL = list; }

	public int setL2L_txtEntryDate(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_txtEntryDate == null) {
			l_txtEntryDate = new ArrayList();
		} else {
			l_txtEntryDate.clear();
		}
		for (int i = 0; i < size; i++) {
			l_txtEntryDate.add(((AC0020020Struct) list.get(i)).gettxtEntryDate());
		}
		return size;
	}
	public int setL2L_rdoOutsideTyp1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoOutsideTyp1 == null) {
			l_rdoOutsideTyp1 = new ArrayList();
		} else {
			l_rdoOutsideTyp1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoOutsideTyp1.add(((AC0020020Struct) list.get(i)).getrdoOutsideTyp1());
		}
		return size;
	}
	public int setL2L_rdoOutsideTyp2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoOutsideTyp2 == null) {
			l_rdoOutsideTyp2 = new ArrayList();
		} else {
			l_rdoOutsideTyp2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoOutsideTyp2.add(((AC0020020Struct) list.get(i)).getrdoOutsideTyp2());
		}
		return size;
	}
	public int setL2L_rdoOutsideTyp3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoOutsideTyp3 == null) {
			l_rdoOutsideTyp3 = new ArrayList();
		} else {
			l_rdoOutsideTyp3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoOutsideTyp3.add(((AC0020020Struct) list.get(i)).getrdoOutsideTyp3());
		}
		return size;
	}
	public int setL2L_rdoEntry1Typ1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoEntry1Typ1 == null) {
			l_rdoEntry1Typ1 = new ArrayList();
		} else {
			l_rdoEntry1Typ1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoEntry1Typ1.add(((AC0020020Struct) list.get(i)).getrdoEntry1Typ1());
		}
		return size;
	}
	public int setL2L_rdoEntry1Typ2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoEntry1Typ2 == null) {
			l_rdoEntry1Typ2 = new ArrayList();
		} else {
			l_rdoEntry1Typ2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoEntry1Typ2.add(((AC0020020Struct) list.get(i)).getrdoEntry1Typ2());
		}
		return size;
	}
	public int setL2L_rdoEntry1Typ3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoEntry1Typ3 == null) {
			l_rdoEntry1Typ3 = new ArrayList();
		} else {
			l_rdoEntry1Typ3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoEntry1Typ3.add(((AC0020020Struct) list.get(i)).getrdoEntry1Typ3());
		}
		return size;
	}
	public int setL2L_rdoOutsideTyp(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoOutsideTyp == null) {
			l_rdoOutsideTyp = new ArrayList();
		} else {
			l_rdoOutsideTyp.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoOutsideTyp.add(((AC0020020Struct) list.get(i)).getrdoOutsideTyp());
		}
		return size;
	}
	public int setL2L_rdoEntry1Typ(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoEntry1Typ == null) {
			l_rdoEntry1Typ = new ArrayList();
		} else {
			l_rdoEntry1Typ.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoEntry1Typ.add(((AC0020020Struct) list.get(i)).getrdoEntry1Typ());
		}
		return size;
	}
	public int setL2L_txtEntryTime(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_txtEntryTime == null) {
			l_txtEntryTime = new ArrayList();
		} else {
			l_txtEntryTime.clear();
		}
		for (int i = 0; i < size; i++) {
			l_txtEntryTime.add(((AC0020020Struct) list.get(i)).gettxtEntryTime());
		}
		return size;
	}
	public int setL2L_hdnBusinessOprDate(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_hdnBusinessOprDate == null) {
			l_hdnBusinessOprDate = new ArrayList();
		} else {
			l_hdnBusinessOprDate.clear();
		}
		for (int i = 0; i < size; i++) {
			l_hdnBusinessOprDate.add(((AC0020020Struct) list.get(i)).gethdnBusinessOprDate());
		}
		return size;
	}
	public int setL2L_plantCd(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_plantCd == null) {
			l_plantCd = new ArrayList();
		} else {
			l_plantCd.clear();
		}
		for (int i = 0; i < size; i++) {
			l_plantCd.add(((AC0020020Struct) list.get(i)).getplantCd());
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
			l_TIME_CTRL.add(((AC0020020Struct) list.get(i)).getTIME_CTRL());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_txtEntryDate = null;
		m_rdoOutsideTyp1 = null;
		m_rdoOutsideTyp2 = null;
		m_rdoOutsideTyp3 = null;
		m_rdoEntry1Typ1 = null;
		m_rdoEntry1Typ2 = null;
		m_rdoEntry1Typ3 = null;
		m_rdoOutsideTyp = null;
		m_rdoEntry1Typ = null;
		m_txtEntryTime = null;
		m_hdnBusinessOprDate = null;
		m_plantCd = null;
		m_TIME_CTRL = null;

		l_txtEntryDate = null;
		l_rdoOutsideTyp1 = null;
		l_rdoOutsideTyp2 = null;
		l_rdoOutsideTyp3 = null;
		l_rdoEntry1Typ1 = null;
		l_rdoEntry1Typ2 = null;
		l_rdoEntry1Typ3 = null;
		l_rdoOutsideTyp = null;
		l_rdoEntry1Typ = null;
		l_txtEntryTime = null;
		l_hdnBusinessOprDate = null;
		l_plantCd = null;
		l_TIME_CTRL = null;

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
	 * medAC0020020�N���X�̕W���R���X�g���N�^
	 */
	public AC0020020Struct()
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
	public void setStruct(AC0020020Struct struct)
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
	public void setStructM(AC0020020Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.settxtEntryDate(struct.gettxtEntryDate());
			this.setrdoOutsideTyp1(struct.getrdoOutsideTyp1());
			this.setrdoOutsideTyp2(struct.getrdoOutsideTyp2());
			this.setrdoOutsideTyp3(struct.getrdoOutsideTyp3());
			this.setrdoEntry1Typ1(struct.getrdoEntry1Typ1());
			this.setrdoEntry1Typ2(struct.getrdoEntry1Typ2());
			this.setrdoEntry1Typ3(struct.getrdoEntry1Typ3());
			this.setrdoOutsideTyp(struct.getrdoOutsideTyp());
			this.setrdoEntry1Typ(struct.getrdoEntry1Typ());
			this.settxtEntryTime(struct.gettxtEntryTime());
			this.sethdnBusinessOprDate(struct.gethdnBusinessOprDate());
			this.setplantCd(struct.getplantCd());
			this.setTIME_CTRL(struct.getTIME_CTRL());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AC0020020Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_txtEntryDate(struct.getList_txtEntryDate());
			this.setList_rdoOutsideTyp1(struct.getList_rdoOutsideTyp1());
			this.setList_rdoOutsideTyp2(struct.getList_rdoOutsideTyp2());
			this.setList_rdoOutsideTyp3(struct.getList_rdoOutsideTyp3());
			this.setList_rdoEntry1Typ1(struct.getList_rdoEntry1Typ1());
			this.setList_rdoEntry1Typ2(struct.getList_rdoEntry1Typ2());
			this.setList_rdoEntry1Typ3(struct.getList_rdoEntry1Typ3());
			this.setList_rdoOutsideTyp(struct.getList_rdoOutsideTyp());
			this.setList_rdoEntry1Typ(struct.getList_rdoEntry1Typ());
			this.setList_txtEntryTime(struct.getList_txtEntryTime());
			this.setList_hdnBusinessOprDate(struct.getList_hdnBusinessOprDate());
			this.setList_plantCd(struct.getList_plantCd());
			this.setList_TIME_CTRL(struct.getList_TIME_CTRL());
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
	// �� 1 �ϐ������l�F i_txtEntryDate


	final static String i_txtEntryDate = null;

	// �� 2 �ϐ������l�F i_rdoOutsideTyp1


	final static String i_rdoOutsideTyp1 = null;

	// �� 3 �ϐ������l�F i_rdoOutsideTyp2


	final static String i_rdoOutsideTyp2 = null;

	// �� 4 �ϐ������l�F i_rdoOutsideTyp3


	final static String i_rdoOutsideTyp3 = null;

	// �� 5 �ϐ������l�F i_rdoEntry1Typ1


	final static String i_rdoEntry1Typ1 = null;

	// �� 6 �ϐ������l�F i_rdoEntry1Typ2


	final static String i_rdoEntry1Typ2 = null;

	// �� 7 �ϐ������l�F i_rdoEntry1Typ3


	final static String i_rdoEntry1Typ3 = null;

	// �� 8 �ϐ������l�F i_rdoOutsideTyp


	final static String i_rdoOutsideTyp = null;

	// �� 9 �ϐ������l�F i_rdoEntry1Typ


	final static String i_rdoEntry1Typ = null;

	// �� 10 �ϐ������l�F i_txtEntryTime


	final static String i_txtEntryTime = null;

	// �� 11 �ϐ������l�F i_hdnBusinessOprDate


	final static String i_hdnBusinessOprDate = null;

	// �� 12 �ϐ������l�F i_plantCd


	final static String i_plantCd = null;

	// �� 13 �ϐ������l�F i_TIME_CTRL


	final static String i_TIME_CTRL = null;

*/

	//{{user_implement_code
         // TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
         // �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
        // �� 1 �ϐ������l�F i_hdnBusinessOprDate
        final static String i_hdnBusinessOprDate = null;
        // �� 2 �ϐ������l�F i_plantCd
        final static String i_plantCd = null;
        // �� 3 �ϐ������l�F i_txtEntryDate
        final static String i_txtEntryDate = null;
        // �� 5 �ϐ������l�F i_rdoOutsideTyp1
        final static String i_rdoOutsideTyp1 = null;
        // �� 6 �ϐ������l�F i_rdoOutsideTyp2
        final static String i_rdoOutsideTyp2 = null;
        // �� 7 �ϐ������l�F i_rdoOutsideTyp3
        final static String i_rdoOutsideTyp3 = null;
        // �� 8 �ϐ������l�F i_rdoEntry1Typ1
        final static String i_rdoEntry1Typ1 = null;
        // �� 9 �ϐ������l�F i_rdoEntry2Typ1
        //final static String i_rdoEntry2Typ1 = null;
        // �� 10 �ϐ������l�F i_rdoEntry1Typ2
        final static String i_rdoEntry1Typ2 = null;
        // �� 11 �ϐ������l�F i_rdoEntry2Typ2
        //final static String i_rdoEntry2Typ2 = null;
        // �� 12 �ϐ������l�F i_rdoEntry1Typ3
        final static String i_rdoEntry1Typ3 = null;
        // �� 13 �ϐ������l�F i_rdoEntry2Typ3
        //final static String i_rdoEntry2Typ3 = null;
        // �� 14 �ϐ������l�F i_rdoEntry2Typ4
        //final static String i_rdoEntry2Typ4 = null;
        // �� 15 �ϐ������l�F i_rdoOutsideTyp
        final static String i_rdoOutsideTyp = null;
        // �� 16 �ϐ������l�F i_rdoEntry1Typ
        final static String i_rdoEntry1Typ = null;
       
        /**
         * ������
         *
         */
        public void initialize()
        {
       
         clear();
       
         m_hdnBusinessOprDate = i_hdnBusinessOprDate;
         m_plantCd = i_plantCd;
         m_txtEntryDate = i_txtEntryDate;
         m_rdoOutsideTyp = i_rdoOutsideTyp;
         m_rdoOutsideTyp1 = i_rdoOutsideTyp1;
         m_rdoOutsideTyp2 = i_rdoOutsideTyp2;
         m_rdoOutsideTyp3 = i_rdoOutsideTyp3;
         m_rdoEntry1Typ = i_rdoEntry1Typ;
         m_rdoEntry1Typ1 = i_rdoEntry1Typ1;
         m_rdoEntry1Typ2 = i_rdoEntry1Typ2;
         m_rdoEntry1Typ3 = i_rdoEntry1Typ3;
        }
       
         // TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
