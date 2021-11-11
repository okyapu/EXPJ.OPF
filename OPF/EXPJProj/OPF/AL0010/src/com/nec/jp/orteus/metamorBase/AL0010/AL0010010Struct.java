/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AL0010/src/com/nec/jp/orteus/metamorBase/AL0010/AL0010010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AL0010;

import com.nec.jp.orteus.xaf.wa.*;

import com.nec.jp.orteus.util.logging.*;

import java.lang.Number.*;
import java.lang.Float;
import java.util.*;
import java.sql.*;
import java.io.*;

//{{user_implement_code_import
 // TODO: ������import�p�b�P�[�W���L�q���Ă�������
 //$Id: AL0010010Struct.java,v 1.4 2011/01/28 11:17:40 shao-guangfeng Exp $
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AL0010010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_h_PLANT_CD */
	public String m_h_PLANT_CD = null;
	/** �� 2 �ϐ��F m_NECK_PROC_CD */
	public String m_NECK_PROC_CD = null;
	/** �� 3 �ϐ��F m_NECK_PROC_NAME */
	public String m_NECK_PROC_NAME = null;
	/** �� 4 �ϐ��F m_NECK_PROC_CAPA */
	public String m_NECK_PROC_CAPA = null;
	/** �� 5 �ϐ��F m_NECK_PROC_CAPA_UNIT */
	public String m_NECK_PROC_CAPA_UNIT = null;
	/** �� 6 �ϐ��F m_NECK_PROC_CAPA_RATE */
	public String m_NECK_PROC_CAPA_RATE = null;
	/** �� 7 �ϐ��F m_NECK_PROC_SHIFT */
	public String m_NECK_PROC_SHIFT = null;
	/** �� 8 �ϐ��F m_h_MODIFY_COUNT */
	public String m_h_MODIFY_COUNT = null;
	/** �� 9 �ϐ��F m_ExistFlag */
	public String m_ExistFlag = null;
	/** �� 10 �ϐ��F m_h_NECK_PROC_CD */
	public String m_h_NECK_PROC_CD = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_h_PLANT_CD */
	public List l_h_PLANT_CD = null;

	/** �� 2 List�ϐ��F l_NECK_PROC_CD */
	public List l_NECK_PROC_CD = null;

	/** �� 3 List�ϐ��F l_NECK_PROC_NAME */
	public List l_NECK_PROC_NAME = null;

	/** �� 4 List�ϐ��F l_NECK_PROC_CAPA */
	public List l_NECK_PROC_CAPA = null;

	/** �� 5 List�ϐ��F l_NECK_PROC_CAPA_UNIT */
	public List l_NECK_PROC_CAPA_UNIT = null;

	/** �� 6 List�ϐ��F l_NECK_PROC_CAPA_RATE */
	public List l_NECK_PROC_CAPA_RATE = null;

	/** �� 7 List�ϐ��F l_NECK_PROC_SHIFT */
	public List l_NECK_PROC_SHIFT = null;

	/** �� 8 List�ϐ��F l_h_MODIFY_COUNT */
	public List l_h_MODIFY_COUNT = null;

	/** �� 9 List�ϐ��F l_ExistFlag */
	public List l_ExistFlag = null;

	/** �� 10 List�ϐ��F l_h_NECK_PROC_CD */
	public List l_h_NECK_PROC_CD = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String geth_PLANT_CD() { return m_h_PLANT_CD; }
	public String getNECK_PROC_CD() { return m_NECK_PROC_CD; }
	public String getNECK_PROC_NAME() { return m_NECK_PROC_NAME; }
	public String getNECK_PROC_CAPA() { return m_NECK_PROC_CAPA; }
	public String getNECK_PROC_CAPA_UNIT() { return m_NECK_PROC_CAPA_UNIT; }
	public String getNECK_PROC_CAPA_RATE() { return m_NECK_PROC_CAPA_RATE; }
	public String getNECK_PROC_SHIFT() { return m_NECK_PROC_SHIFT; }
	public String geth_MODIFY_COUNT() { return m_h_MODIFY_COUNT; }
	public String getExistFlag() { return m_ExistFlag; }
	public String geth_NECK_PROC_CD() { return m_h_NECK_PROC_CD; }

	public List getList_h_PLANT_CD() { return l_h_PLANT_CD; }
	public List getList_NECK_PROC_CD() { return l_NECK_PROC_CD; }
	public List getList_NECK_PROC_NAME() { return l_NECK_PROC_NAME; }
	public List getList_NECK_PROC_CAPA() { return l_NECK_PROC_CAPA; }
	public List getList_NECK_PROC_CAPA_UNIT() { return l_NECK_PROC_CAPA_UNIT; }
	public List getList_NECK_PROC_CAPA_RATE() { return l_NECK_PROC_CAPA_RATE; }
	public List getList_NECK_PROC_SHIFT() { return l_NECK_PROC_SHIFT; }
	public List getList_h_MODIFY_COUNT() { return l_h_MODIFY_COUNT; }
	public List getList_ExistFlag() { return l_ExistFlag; }
	public List getList_h_NECK_PROC_CD() { return l_h_NECK_PROC_CD; }

	public void seth_PLANT_CD(String val) { m_h_PLANT_CD = val; }
	public void setNECK_PROC_CD(String val) { m_NECK_PROC_CD = val; }
	public void setNECK_PROC_NAME(String val) { m_NECK_PROC_NAME = val; }
	public void setNECK_PROC_CAPA(String val) { m_NECK_PROC_CAPA = val; }
	public void setNECK_PROC_CAPA_UNIT(String val) { m_NECK_PROC_CAPA_UNIT = val; }
	public void setNECK_PROC_CAPA_RATE(String val) { m_NECK_PROC_CAPA_RATE = val; }
	public void setNECK_PROC_SHIFT(String val) { m_NECK_PROC_SHIFT = val; }
	public void seth_MODIFY_COUNT(String val) { m_h_MODIFY_COUNT = val; }
	public void setExistFlag(String val) { m_ExistFlag = val; }
	public void seth_NECK_PROC_CD(String val) { m_h_NECK_PROC_CD = val; }


	public void setList_h_PLANT_CD(List list) { l_h_PLANT_CD = list; }
	public void setList_NECK_PROC_CD(List list) { l_NECK_PROC_CD = list; }
	public void setList_NECK_PROC_NAME(List list) { l_NECK_PROC_NAME = list; }
	public void setList_NECK_PROC_CAPA(List list) { l_NECK_PROC_CAPA = list; }
	public void setList_NECK_PROC_CAPA_UNIT(List list) { l_NECK_PROC_CAPA_UNIT = list; }
	public void setList_NECK_PROC_CAPA_RATE(List list) { l_NECK_PROC_CAPA_RATE = list; }
	public void setList_NECK_PROC_SHIFT(List list) { l_NECK_PROC_SHIFT = list; }
	public void setList_h_MODIFY_COUNT(List list) { l_h_MODIFY_COUNT = list; }
	public void setList_ExistFlag(List list) { l_ExistFlag = list; }
	public void setList_h_NECK_PROC_CD(List list) { l_h_NECK_PROC_CD = list; }

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
			l_h_PLANT_CD.add(((AL0010010Struct) list.get(i)).geth_PLANT_CD());
		}
		return size;
	}
	public int setL2L_NECK_PROC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NECK_PROC_CD == null) {
			l_NECK_PROC_CD = new ArrayList();
		} else {
			l_NECK_PROC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NECK_PROC_CD.add(((AL0010010Struct) list.get(i)).getNECK_PROC_CD());
		}
		return size;
	}
	public int setL2L_NECK_PROC_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NECK_PROC_NAME == null) {
			l_NECK_PROC_NAME = new ArrayList();
		} else {
			l_NECK_PROC_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NECK_PROC_NAME.add(((AL0010010Struct) list.get(i)).getNECK_PROC_NAME());
		}
		return size;
	}
	public int setL2L_NECK_PROC_CAPA(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NECK_PROC_CAPA == null) {
			l_NECK_PROC_CAPA = new ArrayList();
		} else {
			l_NECK_PROC_CAPA.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NECK_PROC_CAPA.add(((AL0010010Struct) list.get(i)).getNECK_PROC_CAPA());
		}
		return size;
	}
	public int setL2L_NECK_PROC_CAPA_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NECK_PROC_CAPA_UNIT == null) {
			l_NECK_PROC_CAPA_UNIT = new ArrayList();
		} else {
			l_NECK_PROC_CAPA_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NECK_PROC_CAPA_UNIT.add(((AL0010010Struct) list.get(i)).getNECK_PROC_CAPA_UNIT());
		}
		return size;
	}
	public int setL2L_NECK_PROC_CAPA_RATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NECK_PROC_CAPA_RATE == null) {
			l_NECK_PROC_CAPA_RATE = new ArrayList();
		} else {
			l_NECK_PROC_CAPA_RATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NECK_PROC_CAPA_RATE.add(((AL0010010Struct) list.get(i)).getNECK_PROC_CAPA_RATE());
		}
		return size;
	}
	public int setL2L_NECK_PROC_SHIFT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NECK_PROC_SHIFT == null) {
			l_NECK_PROC_SHIFT = new ArrayList();
		} else {
			l_NECK_PROC_SHIFT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NECK_PROC_SHIFT.add(((AL0010010Struct) list.get(i)).getNECK_PROC_SHIFT());
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
			l_h_MODIFY_COUNT.add(((AL0010010Struct) list.get(i)).geth_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_ExistFlag(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ExistFlag == null) {
			l_ExistFlag = new ArrayList();
		} else {
			l_ExistFlag.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ExistFlag.add(((AL0010010Struct) list.get(i)).getExistFlag());
		}
		return size;
	}
	public int setL2L_h_NECK_PROC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_NECK_PROC_CD == null) {
			l_h_NECK_PROC_CD = new ArrayList();
		} else {
			l_h_NECK_PROC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_NECK_PROC_CD.add(((AL0010010Struct) list.get(i)).geth_NECK_PROC_CD());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_h_PLANT_CD = null;
		m_NECK_PROC_CD = null;
		m_NECK_PROC_NAME = null;
		m_NECK_PROC_CAPA = null;
		m_NECK_PROC_CAPA_UNIT = null;
		m_NECK_PROC_CAPA_RATE = null;
		m_NECK_PROC_SHIFT = null;
		m_h_MODIFY_COUNT = null;
		m_ExistFlag = null;
		m_h_NECK_PROC_CD = null;

		l_h_PLANT_CD = null;
		l_NECK_PROC_CD = null;
		l_NECK_PROC_NAME = null;
		l_NECK_PROC_CAPA = null;
		l_NECK_PROC_CAPA_UNIT = null;
		l_NECK_PROC_CAPA_RATE = null;
		l_NECK_PROC_SHIFT = null;
		l_h_MODIFY_COUNT = null;
		l_ExistFlag = null;
		l_h_NECK_PROC_CD = null;

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
	 * medAL0010010�N���X�̕W���R���X�g���N�^
	 */
	public AL0010010Struct()
	{
		//{{user_implement_code_constractor
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
	public void setStruct(AL0010010Struct struct)
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
	public void setStructM(AL0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.seth_PLANT_CD(struct.geth_PLANT_CD());
			this.setNECK_PROC_CD(struct.getNECK_PROC_CD());
			this.setNECK_PROC_NAME(struct.getNECK_PROC_NAME());
			this.setNECK_PROC_CAPA(struct.getNECK_PROC_CAPA());
			this.setNECK_PROC_CAPA_UNIT(struct.getNECK_PROC_CAPA_UNIT());
			this.setNECK_PROC_CAPA_RATE(struct.getNECK_PROC_CAPA_RATE());
			this.setNECK_PROC_SHIFT(struct.getNECK_PROC_SHIFT());
			this.seth_MODIFY_COUNT(struct.geth_MODIFY_COUNT());
			this.setExistFlag(struct.getExistFlag());
			this.seth_NECK_PROC_CD(struct.geth_NECK_PROC_CD());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AL0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_h_PLANT_CD(struct.getList_h_PLANT_CD());
			this.setList_NECK_PROC_CD(struct.getList_NECK_PROC_CD());
			this.setList_NECK_PROC_NAME(struct.getList_NECK_PROC_NAME());
			this.setList_NECK_PROC_CAPA(struct.getList_NECK_PROC_CAPA());
			this.setList_NECK_PROC_CAPA_UNIT(struct.getList_NECK_PROC_CAPA_UNIT());
			this.setList_NECK_PROC_CAPA_RATE(struct.getList_NECK_PROC_CAPA_RATE());
			this.setList_NECK_PROC_SHIFT(struct.getList_NECK_PROC_SHIFT());
			this.setList_h_MODIFY_COUNT(struct.getList_h_MODIFY_COUNT());
			this.setList_ExistFlag(struct.getList_ExistFlag());
			this.setList_h_NECK_PROC_CD(struct.getList_h_NECK_PROC_CD());
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
	// �� 1 �ϐ������l�F i_h_PLANT_CD


	final static String i_h_PLANT_CD = null;

	// �� 2 �ϐ������l�F i_NECK_PROC_CD


	final static String i_NECK_PROC_CD = null;

	// �� 3 �ϐ������l�F i_NECK_PROC_NAME


	final static String i_NECK_PROC_NAME = null;

	// �� 4 �ϐ������l�F i_NECK_PROC_CAPA


	final static String i_NECK_PROC_CAPA = null;

	// �� 5 �ϐ������l�F i_NECK_PROC_CAPA_UNIT


	final static String i_NECK_PROC_CAPA_UNIT = null;

	// �� 6 �ϐ������l�F i_NECK_PROC_CAPA_RATE


	final static String i_NECK_PROC_CAPA_RATE = null;

	// �� 7 �ϐ������l�F i_NECK_PROC_SHIFT


	final static String i_NECK_PROC_SHIFT = null;

	// �� 8 �ϐ������l�F i_h_MODIFY_COUNT


	final static String i_h_MODIFY_COUNT = null;

	// �� 9 �ϐ������l�F i_ExistFlag


	final static String i_ExistFlag = null;

	// �� 10 �ϐ������l�F i_h_NECK_PROC_CD


	final static String i_h_NECK_PROC_CD = null;

*/

	//{{user_implement_code
         // TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
