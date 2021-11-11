/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AN0010/src/com/nec/jp/orteus/metamorBase/AN0010/AN0010010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AN0010;

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

public class AN0010010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_l_PROGRAM_CD */
	public String m_l_PROGRAM_CD = null;
	/** �� 2 �ϐ��F m_l_PROGRAM_NAME */
	public String m_l_PROGRAM_NAME = null;
	/** �� 3 �ϐ��F m_TARGET_PLANT_TYP */
	public String m_TARGET_PLANT_TYP = null;
	/** �� 4 �ϐ��F m_h_CHANGEABLE_TYP */
	public String m_h_CHANGEABLE_TYP = null;
	/** �� 5 �ϐ��F m_h_MODIFY_COUNT */
	public String m_h_MODIFY_COUNT = null;
	/** �� 6 �ϐ��F m_h_TARGET_PLANT_TYP2 */
	public String m_h_TARGET_PLANT_TYP2 = null;
	/** �� 7 �ϐ��F m_h_MODIFY_COUNT2 */
	public String m_h_MODIFY_COUNT2 = null;
	/** �� 8 �ϐ��F m_PROGRAM_CD */
	public String m_PROGRAM_CD = null;
	/** �� 9 �ϐ��F m_PROGRAM_NAME */
	public String m_PROGRAM_NAME = null;
	/** �� 10 �ϐ��F m_h_TARGET_PLANT_TYP */
	public String m_h_TARGET_PLANT_TYP = null;
	/** �� 11 �ϐ��F m_TARGET_PLANT_TYP_name */
	public String m_TARGET_PLANT_TYP_name = null;
	/** �� 12 �ϐ��F m_TARGET_PLANT_TYP_val */
	public String m_TARGET_PLANT_TYP_val = null;
	/** �� 13 �ϐ��F m_h_PROGRAM_CD */
	public String m_h_PROGRAM_CD = null;
	/** �� 14 �ϐ��F m_h_ExistSysBusinessLock */
	public String m_h_ExistSysBusinessLock = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_l_PROGRAM_CD */
	public List l_l_PROGRAM_CD = null;

	/** �� 2 List�ϐ��F l_l_PROGRAM_NAME */
	public List l_l_PROGRAM_NAME = null;

	/** �� 3 List�ϐ��F l_TARGET_PLANT_TYP */
	public List l_TARGET_PLANT_TYP = null;

	/** �� 4 List�ϐ��F l_h_CHANGEABLE_TYP */
	public List l_h_CHANGEABLE_TYP = null;

	/** �� 5 List�ϐ��F l_h_MODIFY_COUNT */
	public List l_h_MODIFY_COUNT = null;

	/** �� 6 List�ϐ��F l_h_TARGET_PLANT_TYP2 */
	public List l_h_TARGET_PLANT_TYP2 = null;

	/** �� 7 List�ϐ��F l_h_MODIFY_COUNT2 */
	public List l_h_MODIFY_COUNT2 = null;

	/** �� 8 List�ϐ��F l_PROGRAM_CD */
	public List l_PROGRAM_CD = null;

	/** �� 9 List�ϐ��F l_PROGRAM_NAME */
	public List l_PROGRAM_NAME = null;

	/** �� 10 List�ϐ��F l_h_TARGET_PLANT_TYP */
	public List l_h_TARGET_PLANT_TYP = null;

	/** �� 11 List�ϐ��F l_TARGET_PLANT_TYP_name */
	public List l_TARGET_PLANT_TYP_name = null;

	/** �� 12 List�ϐ��F l_TARGET_PLANT_TYP_val */
	public List l_TARGET_PLANT_TYP_val = null;

	/** �� 13 List�ϐ��F l_h_PROGRAM_CD */
	public List l_h_PROGRAM_CD = null;

	/** �� 14 List�ϐ��F l_h_ExistSysBusinessLock */
	public List l_h_ExistSysBusinessLock = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getl_PROGRAM_CD() { return m_l_PROGRAM_CD; }
	public String getl_PROGRAM_NAME() { return m_l_PROGRAM_NAME; }
	public String getTARGET_PLANT_TYP() { return m_TARGET_PLANT_TYP; }
	public String geth_CHANGEABLE_TYP() { return m_h_CHANGEABLE_TYP; }
	public String geth_MODIFY_COUNT() { return m_h_MODIFY_COUNT; }
	public String geth_TARGET_PLANT_TYP2() { return m_h_TARGET_PLANT_TYP2; }
	public String geth_MODIFY_COUNT2() { return m_h_MODIFY_COUNT2; }
	public String getPROGRAM_CD() { return m_PROGRAM_CD; }
	public String getPROGRAM_NAME() { return m_PROGRAM_NAME; }
	public String geth_TARGET_PLANT_TYP() { return m_h_TARGET_PLANT_TYP; }
	public String getTARGET_PLANT_TYP_name() { return m_TARGET_PLANT_TYP_name; }
	public String getTARGET_PLANT_TYP_val() { return m_TARGET_PLANT_TYP_val; }
	public String geth_PROGRAM_CD() { return m_h_PROGRAM_CD; }
	public String geth_ExistSysBusinessLock() { return m_h_ExistSysBusinessLock; }

	public List getList_l_PROGRAM_CD() { return l_l_PROGRAM_CD; }
	public List getList_l_PROGRAM_NAME() { return l_l_PROGRAM_NAME; }
	public List getList_TARGET_PLANT_TYP() { return l_TARGET_PLANT_TYP; }
	public List getList_h_CHANGEABLE_TYP() { return l_h_CHANGEABLE_TYP; }
	public List getList_h_MODIFY_COUNT() { return l_h_MODIFY_COUNT; }
	public List getList_h_TARGET_PLANT_TYP2() { return l_h_TARGET_PLANT_TYP2; }
	public List getList_h_MODIFY_COUNT2() { return l_h_MODIFY_COUNT2; }
	public List getList_PROGRAM_CD() { return l_PROGRAM_CD; }
	public List getList_PROGRAM_NAME() { return l_PROGRAM_NAME; }
	public List getList_h_TARGET_PLANT_TYP() { return l_h_TARGET_PLANT_TYP; }
	public List getList_TARGET_PLANT_TYP_name() { return l_TARGET_PLANT_TYP_name; }
	public List getList_TARGET_PLANT_TYP_val() { return l_TARGET_PLANT_TYP_val; }
	public List getList_h_PROGRAM_CD() { return l_h_PROGRAM_CD; }
	public List getList_h_ExistSysBusinessLock() { return l_h_ExistSysBusinessLock; }

	public void setl_PROGRAM_CD(String val) { m_l_PROGRAM_CD = val; }
	public void setl_PROGRAM_NAME(String val) { m_l_PROGRAM_NAME = val; }
	public void setTARGET_PLANT_TYP(String val) { m_TARGET_PLANT_TYP = val; }
	public void seth_CHANGEABLE_TYP(String val) { m_h_CHANGEABLE_TYP = val; }
	public void seth_MODIFY_COUNT(String val) { m_h_MODIFY_COUNT = val; }
	public void seth_TARGET_PLANT_TYP2(String val) { m_h_TARGET_PLANT_TYP2 = val; }
	public void seth_MODIFY_COUNT2(String val) { m_h_MODIFY_COUNT2 = val; }
	public void setPROGRAM_CD(String val) { m_PROGRAM_CD = val; }
	public void setPROGRAM_NAME(String val) { m_PROGRAM_NAME = val; }
	public void seth_TARGET_PLANT_TYP(String val) { m_h_TARGET_PLANT_TYP = val; }
	public void setTARGET_PLANT_TYP_name(String val) { m_TARGET_PLANT_TYP_name = val; }
	public void setTARGET_PLANT_TYP_val(String val) { m_TARGET_PLANT_TYP_val = val; }
	public void seth_PROGRAM_CD(String val) { m_h_PROGRAM_CD = val; }
	public void seth_ExistSysBusinessLock(String val) { m_h_ExistSysBusinessLock = val; }


	public void setList_l_PROGRAM_CD(List list) { l_l_PROGRAM_CD = list; }
	public void setList_l_PROGRAM_NAME(List list) { l_l_PROGRAM_NAME = list; }
	public void setList_TARGET_PLANT_TYP(List list) { l_TARGET_PLANT_TYP = list; }
	public void setList_h_CHANGEABLE_TYP(List list) { l_h_CHANGEABLE_TYP = list; }
	public void setList_h_MODIFY_COUNT(List list) { l_h_MODIFY_COUNT = list; }
	public void setList_h_TARGET_PLANT_TYP2(List list) { l_h_TARGET_PLANT_TYP2 = list; }
	public void setList_h_MODIFY_COUNT2(List list) { l_h_MODIFY_COUNT2 = list; }
	public void setList_PROGRAM_CD(List list) { l_PROGRAM_CD = list; }
	public void setList_PROGRAM_NAME(List list) { l_PROGRAM_NAME = list; }
	public void setList_h_TARGET_PLANT_TYP(List list) { l_h_TARGET_PLANT_TYP = list; }
	public void setList_TARGET_PLANT_TYP_name(List list) { l_TARGET_PLANT_TYP_name = list; }
	public void setList_TARGET_PLANT_TYP_val(List list) { l_TARGET_PLANT_TYP_val = list; }
	public void setList_h_PROGRAM_CD(List list) { l_h_PROGRAM_CD = list; }
	public void setList_h_ExistSysBusinessLock(List list) { l_h_ExistSysBusinessLock = list; }

	public int setL2L_l_PROGRAM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PROGRAM_CD == null) {
			l_l_PROGRAM_CD = new ArrayList();
		} else {
			l_l_PROGRAM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PROGRAM_CD.add(((AN0010010Struct) list.get(i)).getl_PROGRAM_CD());
		}
		return size;
	}
	public int setL2L_l_PROGRAM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PROGRAM_NAME == null) {
			l_l_PROGRAM_NAME = new ArrayList();
		} else {
			l_l_PROGRAM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PROGRAM_NAME.add(((AN0010010Struct) list.get(i)).getl_PROGRAM_NAME());
		}
		return size;
	}
	public int setL2L_TARGET_PLANT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TARGET_PLANT_TYP == null) {
			l_TARGET_PLANT_TYP = new ArrayList();
		} else {
			l_TARGET_PLANT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TARGET_PLANT_TYP.add(((AN0010010Struct) list.get(i)).getTARGET_PLANT_TYP());
		}
		return size;
	}
	public int setL2L_h_CHANGEABLE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_CHANGEABLE_TYP == null) {
			l_h_CHANGEABLE_TYP = new ArrayList();
		} else {
			l_h_CHANGEABLE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_CHANGEABLE_TYP.add(((AN0010010Struct) list.get(i)).geth_CHANGEABLE_TYP());
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
			l_h_MODIFY_COUNT.add(((AN0010010Struct) list.get(i)).geth_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_h_TARGET_PLANT_TYP2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_TARGET_PLANT_TYP2 == null) {
			l_h_TARGET_PLANT_TYP2 = new ArrayList();
		} else {
			l_h_TARGET_PLANT_TYP2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_TARGET_PLANT_TYP2.add(((AN0010010Struct) list.get(i)).geth_TARGET_PLANT_TYP2());
		}
		return size;
	}
	public int setL2L_h_MODIFY_COUNT2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_MODIFY_COUNT2 == null) {
			l_h_MODIFY_COUNT2 = new ArrayList();
		} else {
			l_h_MODIFY_COUNT2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_MODIFY_COUNT2.add(((AN0010010Struct) list.get(i)).geth_MODIFY_COUNT2());
		}
		return size;
	}
	public int setL2L_PROGRAM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROGRAM_CD == null) {
			l_PROGRAM_CD = new ArrayList();
		} else {
			l_PROGRAM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROGRAM_CD.add(((AN0010010Struct) list.get(i)).getPROGRAM_CD());
		}
		return size;
	}
	public int setL2L_PROGRAM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROGRAM_NAME == null) {
			l_PROGRAM_NAME = new ArrayList();
		} else {
			l_PROGRAM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROGRAM_NAME.add(((AN0010010Struct) list.get(i)).getPROGRAM_NAME());
		}
		return size;
	}
	public int setL2L_h_TARGET_PLANT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_TARGET_PLANT_TYP == null) {
			l_h_TARGET_PLANT_TYP = new ArrayList();
		} else {
			l_h_TARGET_PLANT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_TARGET_PLANT_TYP.add(((AN0010010Struct) list.get(i)).geth_TARGET_PLANT_TYP());
		}
		return size;
	}
	public int setL2L_TARGET_PLANT_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TARGET_PLANT_TYP_name == null) {
			l_TARGET_PLANT_TYP_name = new ArrayList();
		} else {
			l_TARGET_PLANT_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TARGET_PLANT_TYP_name.add(((AN0010010Struct) list.get(i)).getTARGET_PLANT_TYP_name());
		}
		return size;
	}
	public int setL2L_TARGET_PLANT_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TARGET_PLANT_TYP_val == null) {
			l_TARGET_PLANT_TYP_val = new ArrayList();
		} else {
			l_TARGET_PLANT_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TARGET_PLANT_TYP_val.add(((AN0010010Struct) list.get(i)).getTARGET_PLANT_TYP_val());
		}
		return size;
	}
	public int setL2L_h_PROGRAM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PROGRAM_CD == null) {
			l_h_PROGRAM_CD = new ArrayList();
		} else {
			l_h_PROGRAM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PROGRAM_CD.add(((AN0010010Struct) list.get(i)).geth_PROGRAM_CD());
		}
		return size;
	}
	public int setL2L_h_ExistSysBusinessLock(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ExistSysBusinessLock == null) {
			l_h_ExistSysBusinessLock = new ArrayList();
		} else {
			l_h_ExistSysBusinessLock.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ExistSysBusinessLock.add(((AN0010010Struct) list.get(i)).geth_ExistSysBusinessLock());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_l_PROGRAM_CD = null;
		m_l_PROGRAM_NAME = null;
		m_TARGET_PLANT_TYP = null;
		m_h_CHANGEABLE_TYP = null;
		m_h_MODIFY_COUNT = null;
		m_h_TARGET_PLANT_TYP2 = null;
		m_h_MODIFY_COUNT2 = null;
		m_PROGRAM_CD = null;
		m_PROGRAM_NAME = null;
		m_h_TARGET_PLANT_TYP = null;
		m_TARGET_PLANT_TYP_name = null;
		m_TARGET_PLANT_TYP_val = null;
		m_h_PROGRAM_CD = null;
		m_h_ExistSysBusinessLock = null;

		l_l_PROGRAM_CD = null;
		l_l_PROGRAM_NAME = null;
		l_TARGET_PLANT_TYP = null;
		l_h_CHANGEABLE_TYP = null;
		l_h_MODIFY_COUNT = null;
		l_h_TARGET_PLANT_TYP2 = null;
		l_h_MODIFY_COUNT2 = null;
		l_PROGRAM_CD = null;
		l_PROGRAM_NAME = null;
		l_h_TARGET_PLANT_TYP = null;
		l_TARGET_PLANT_TYP_name = null;
		l_TARGET_PLANT_TYP_val = null;
		l_h_PROGRAM_CD = null;
		l_h_ExistSysBusinessLock = null;

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
	 * medAN0010010�N���X�̕W���R���X�g���N�^
	 */
	public AN0010010Struct()
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
	public void setStruct(AN0010010Struct struct)
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
	public void setStructM(AN0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setl_PROGRAM_CD(struct.getl_PROGRAM_CD());
			this.setl_PROGRAM_NAME(struct.getl_PROGRAM_NAME());
			this.setTARGET_PLANT_TYP(struct.getTARGET_PLANT_TYP());
			this.seth_CHANGEABLE_TYP(struct.geth_CHANGEABLE_TYP());
			this.seth_MODIFY_COUNT(struct.geth_MODIFY_COUNT());
			this.seth_TARGET_PLANT_TYP2(struct.geth_TARGET_PLANT_TYP2());
			this.seth_MODIFY_COUNT2(struct.geth_MODIFY_COUNT2());
			this.setPROGRAM_CD(struct.getPROGRAM_CD());
			this.setPROGRAM_NAME(struct.getPROGRAM_NAME());
			this.seth_TARGET_PLANT_TYP(struct.geth_TARGET_PLANT_TYP());
			this.setTARGET_PLANT_TYP_name(struct.getTARGET_PLANT_TYP_name());
			this.setTARGET_PLANT_TYP_val(struct.getTARGET_PLANT_TYP_val());
			this.seth_PROGRAM_CD(struct.geth_PROGRAM_CD());
			this.seth_ExistSysBusinessLock(struct.geth_ExistSysBusinessLock());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AN0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_l_PROGRAM_CD(struct.getList_l_PROGRAM_CD());
			this.setList_l_PROGRAM_NAME(struct.getList_l_PROGRAM_NAME());
			this.setList_TARGET_PLANT_TYP(struct.getList_TARGET_PLANT_TYP());
			this.setList_h_CHANGEABLE_TYP(struct.getList_h_CHANGEABLE_TYP());
			this.setList_h_MODIFY_COUNT(struct.getList_h_MODIFY_COUNT());
			this.setList_h_TARGET_PLANT_TYP2(struct.getList_h_TARGET_PLANT_TYP2());
			this.setList_h_MODIFY_COUNT2(struct.getList_h_MODIFY_COUNT2());
			this.setList_PROGRAM_CD(struct.getList_PROGRAM_CD());
			this.setList_PROGRAM_NAME(struct.getList_PROGRAM_NAME());
			this.setList_h_TARGET_PLANT_TYP(struct.getList_h_TARGET_PLANT_TYP());
			this.setList_TARGET_PLANT_TYP_name(struct.getList_TARGET_PLANT_TYP_name());
			this.setList_TARGET_PLANT_TYP_val(struct.getList_TARGET_PLANT_TYP_val());
			this.setList_h_PROGRAM_CD(struct.getList_h_PROGRAM_CD());
			this.setList_h_ExistSysBusinessLock(struct.getList_h_ExistSysBusinessLock());
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
	// �� 1 �ϐ������l�F i_l_PROGRAM_CD


	final static String i_l_PROGRAM_CD = null;

	// �� 2 �ϐ������l�F i_l_PROGRAM_NAME


	final static String i_l_PROGRAM_NAME = null;

	// �� 3 �ϐ������l�F i_TARGET_PLANT_TYP


	final static String i_TARGET_PLANT_TYP = null;

	// �� 4 �ϐ������l�F i_h_CHANGEABLE_TYP


	final static String i_h_CHANGEABLE_TYP = null;

	// �� 5 �ϐ������l�F i_h_MODIFY_COUNT


	final static String i_h_MODIFY_COUNT = null;

	// �� 6 �ϐ������l�F i_h_TARGET_PLANT_TYP2


	final static String i_h_TARGET_PLANT_TYP2 = null;

	// �� 7 �ϐ������l�F i_h_MODIFY_COUNT2


	final static String i_h_MODIFY_COUNT2 = null;

	// �� 8 �ϐ������l�F i_PROGRAM_CD


	final static String i_PROGRAM_CD = null;

	// �� 9 �ϐ������l�F i_PROGRAM_NAME


	final static String i_PROGRAM_NAME = null;

	// �� 10 �ϐ������l�F i_h_TARGET_PLANT_TYP


	final static String i_h_TARGET_PLANT_TYP = null;

	// �� 11 �ϐ������l�F i_TARGET_PLANT_TYP_name


	final static String i_TARGET_PLANT_TYP_name = null;

	// �� 12 �ϐ������l�F i_TARGET_PLANT_TYP_val


	final static String i_TARGET_PLANT_TYP_val = null;

	// �� 13 �ϐ������l�F i_h_PROGRAM_CD


	final static String i_h_PROGRAM_CD = null;

	// �� 14 �ϐ������l�F i_h_ExistSysBusinessLock


	final static String i_h_ExistSysBusinessLock = null;

*/

	//{{user_implement_code
       
        // �� 1 �ϐ������l�F i_PROGRAM_CD
        final static String i_PROGRAM_CD = null;
        // �� 2 �ϐ������l�F i_PROGRAM_NAME
        final static String i_PROGRAM_NAME = null;
        // �� 3 �ϐ������l�F i_l_PROGRAM_CD
        final static String i_l_PROGRAM_CD = null;
        // �� 4 �ϐ������l�F i_l_PROGRAM_NAME
        final static String i_l_PROGRAM_NAME = null;
        // �� 5 �ϐ������l�F i_TARGET_PLANT_TYP
        final static String i_TARGET_PLANT_TYP = null;
        // �� 6 �ϐ������l�F i_h_CHANGEABLE_TYP
        final static String i_h_CHANGEABLE_TYP = null;
        // �� 7 �ϐ������l�F i_h_TARGET_PLANT_TYP
        final static String i_h_TARGET_PLANT_TYP = null;
        // �� 8 �ϐ������l�F i_h_TARGET_PLANT_TYP2
        final static String i_h_TARGET_PLANT_TYP2 = null;
        // �� 9 �ϐ������l�F i_h_MODIFY_COUNT
        final static String i_h_MODIFY_COUNT = null;
        // �� 10 �ϐ������l�F i_h_MODIFY_COUNT2
        final static String i_h_MODIFY_COUNT2 = null;
        // �� 11 �ϐ������l�F i_h_PROGRAM_CD
        final static String i_h_PROGRAM_CD = null;
        // �� 12 �ϐ������l�F i_h_ExistSysBusinessLock
        final static String i_h_ExistSysBusinessLock = null;
       
        /**
         * ������
         *
         */
        public void initialize()
        {
         m_PROGRAM_CD = i_PROGRAM_CD;
         m_h_PROGRAM_CD = i_h_PROGRAM_CD;
         m_PROGRAM_NAME = i_PROGRAM_NAME;
         m_l_PROGRAM_CD = i_l_PROGRAM_CD;
         m_l_PROGRAM_NAME = i_l_PROGRAM_NAME;
         m_TARGET_PLANT_TYP = i_TARGET_PLANT_TYP;
         m_h_CHANGEABLE_TYP = i_h_CHANGEABLE_TYP;
         m_h_TARGET_PLANT_TYP = i_h_TARGET_PLANT_TYP;
         m_h_TARGET_PLANT_TYP2 = i_h_TARGET_PLANT_TYP2;
         m_h_MODIFY_COUNT = i_h_MODIFY_COUNT;
         m_h_MODIFY_COUNT2 = i_h_MODIFY_COUNT2;
         m_h_ExistSysBusinessLock = i_h_ExistSysBusinessLock;
       
         l_PROGRAM_CD = null;
         l_h_PROGRAM_CD = null;
         l_PROGRAM_NAME = null;
         l_l_PROGRAM_CD = null;
         l_l_PROGRAM_NAME = null;
         l_TARGET_PLANT_TYP = null;
         l_h_CHANGEABLE_TYP = null;
         l_h_TARGET_PLANT_TYP = null;
         l_h_TARGET_PLANT_TYP2 = null;
         l_h_MODIFY_COUNT = null;
         l_h_MODIFY_COUNT2 = null;
        }
       
         // TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
