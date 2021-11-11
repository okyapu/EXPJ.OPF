/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0030/src/com/nec/jp/orteus/metamorBase/AD0030/AD0030010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0030;

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

public class AD0030010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_OPR_INST_START_DATE */
	public String m_OPR_INST_START_DATE = null;
	/** �� 2 �ϐ��F m_r1_MODE */
	public String m_r1_MODE = null;
	/** �� 3 �ϐ��F m_PRD_DUE_DATE */
	public String m_PRD_DUE_DATE = null;
	/** �� 4 �ϐ��F m_r2_MODE */
	public String m_r2_MODE = null;
	/** �� 5 �ϐ��F m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** �� 6 �ϐ��F m_c_JOB_ODR_CD */
	public String m_c_JOB_ODR_CD = null;
	/** �� 7 �ϐ��F m_OPR_INST_START_TIME */
	public String m_OPR_INST_START_TIME = null;
	/** �� 8 �ϐ��F m_PRD_DUE_TIME */
	public String m_PRD_DUE_TIME = null;
	/** �� 9 �ϐ��F m_TIME_CTRL */
	public String m_TIME_CTRL = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_OPR_INST_START_DATE */
	public List l_OPR_INST_START_DATE = null;

	/** �� 2 List�ϐ��F l_r1_MODE */
	public List l_r1_MODE = null;

	/** �� 3 List�ϐ��F l_PRD_DUE_DATE */
	public List l_PRD_DUE_DATE = null;

	/** �� 4 List�ϐ��F l_r2_MODE */
	public List l_r2_MODE = null;

	/** �� 5 List�ϐ��F l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** �� 6 List�ϐ��F l_c_JOB_ODR_CD */
	public List l_c_JOB_ODR_CD = null;

	/** �� 7 List�ϐ��F l_OPR_INST_START_TIME */
	public List l_OPR_INST_START_TIME = null;

	/** �� 8 List�ϐ��F l_PRD_DUE_TIME */
	public List l_PRD_DUE_TIME = null;

	/** �� 9 List�ϐ��F l_TIME_CTRL */
	public List l_TIME_CTRL = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getOPR_INST_START_DATE() { return m_OPR_INST_START_DATE; }
	public String getr1_MODE() { return m_r1_MODE; }
	public String getPRD_DUE_DATE() { return m_PRD_DUE_DATE; }
	public String getr2_MODE() { return m_r2_MODE; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getc_JOB_ODR_CD() { return m_c_JOB_ODR_CD; }
	public String getOPR_INST_START_TIME() { return m_OPR_INST_START_TIME; }
	public String getPRD_DUE_TIME() { return m_PRD_DUE_TIME; }
	public String getTIME_CTRL() { return m_TIME_CTRL; }

	public List getList_OPR_INST_START_DATE() { return l_OPR_INST_START_DATE; }
	public List getList_r1_MODE() { return l_r1_MODE; }
	public List getList_PRD_DUE_DATE() { return l_PRD_DUE_DATE; }
	public List getList_r2_MODE() { return l_r2_MODE; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_c_JOB_ODR_CD() { return l_c_JOB_ODR_CD; }
	public List getList_OPR_INST_START_TIME() { return l_OPR_INST_START_TIME; }
	public List getList_PRD_DUE_TIME() { return l_PRD_DUE_TIME; }
	public List getList_TIME_CTRL() { return l_TIME_CTRL; }

	public void setOPR_INST_START_DATE(String val) { m_OPR_INST_START_DATE = val; }
	public void setr1_MODE(String val) { m_r1_MODE = val; }
	public void setPRD_DUE_DATE(String val) { m_PRD_DUE_DATE = val; }
	public void setr2_MODE(String val) { m_r2_MODE = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setc_JOB_ODR_CD(String val) { m_c_JOB_ODR_CD = val; }
	public void setOPR_INST_START_TIME(String val) { m_OPR_INST_START_TIME = val; }
	public void setPRD_DUE_TIME(String val) { m_PRD_DUE_TIME = val; }
	public void setTIME_CTRL(String val) { m_TIME_CTRL = val; }


	public void setList_OPR_INST_START_DATE(List list) { l_OPR_INST_START_DATE = list; }
	public void setList_r1_MODE(List list) { l_r1_MODE = list; }
	public void setList_PRD_DUE_DATE(List list) { l_PRD_DUE_DATE = list; }
	public void setList_r2_MODE(List list) { l_r2_MODE = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_c_JOB_ODR_CD(List list) { l_c_JOB_ODR_CD = list; }
	public void setList_OPR_INST_START_TIME(List list) { l_OPR_INST_START_TIME = list; }
	public void setList_PRD_DUE_TIME(List list) { l_PRD_DUE_TIME = list; }
	public void setList_TIME_CTRL(List list) { l_TIME_CTRL = list; }

	public int setL2L_OPR_INST_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_INST_START_DATE == null) {
			l_OPR_INST_START_DATE = new ArrayList();
		} else {
			l_OPR_INST_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_INST_START_DATE.add(((AD0030010Struct) list.get(i)).getOPR_INST_START_DATE());
		}
		return size;
	}
	public int setL2L_r1_MODE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r1_MODE == null) {
			l_r1_MODE = new ArrayList();
		} else {
			l_r1_MODE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r1_MODE.add(((AD0030010Struct) list.get(i)).getr1_MODE());
		}
		return size;
	}
	public int setL2L_PRD_DUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRD_DUE_DATE == null) {
			l_PRD_DUE_DATE = new ArrayList();
		} else {
			l_PRD_DUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRD_DUE_DATE.add(((AD0030010Struct) list.get(i)).getPRD_DUE_DATE());
		}
		return size;
	}
	public int setL2L_r2_MODE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r2_MODE == null) {
			l_r2_MODE = new ArrayList();
		} else {
			l_r2_MODE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r2_MODE.add(((AD0030010Struct) list.get(i)).getr2_MODE());
		}
		return size;
	}
	public int setL2L_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_CD == null) {
			l_JOB_ODR_CD = new ArrayList();
		} else {
			l_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_CD.add(((AD0030010Struct) list.get(i)).getJOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_c_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_JOB_ODR_CD == null) {
			l_c_JOB_ODR_CD = new ArrayList();
		} else {
			l_c_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_JOB_ODR_CD.add(((AD0030010Struct) list.get(i)).getc_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_OPR_INST_START_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_INST_START_TIME == null) {
			l_OPR_INST_START_TIME = new ArrayList();
		} else {
			l_OPR_INST_START_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_INST_START_TIME.add(((AD0030010Struct) list.get(i)).getOPR_INST_START_TIME());
		}
		return size;
	}
	public int setL2L_PRD_DUE_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRD_DUE_TIME == null) {
			l_PRD_DUE_TIME = new ArrayList();
		} else {
			l_PRD_DUE_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRD_DUE_TIME.add(((AD0030010Struct) list.get(i)).getPRD_DUE_TIME());
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
			l_TIME_CTRL.add(((AD0030010Struct) list.get(i)).getTIME_CTRL());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_OPR_INST_START_DATE = null;
		m_r1_MODE = null;
		m_PRD_DUE_DATE = null;
		m_r2_MODE = null;
		m_JOB_ODR_CD = null;
		m_c_JOB_ODR_CD = null;
		m_OPR_INST_START_TIME = null;
		m_PRD_DUE_TIME = null;
		m_TIME_CTRL = null;

		l_OPR_INST_START_DATE = null;
		l_r1_MODE = null;
		l_PRD_DUE_DATE = null;
		l_r2_MODE = null;
		l_JOB_ODR_CD = null;
		l_c_JOB_ODR_CD = null;
		l_OPR_INST_START_TIME = null;
		l_PRD_DUE_TIME = null;
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
	 * medAD0030010�N���X�̕W���R���X�g���N�^
	 */
	public AD0030010Struct()
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
	public void setStruct(AD0030010Struct struct)
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
	public void setStructM(AD0030010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setOPR_INST_START_DATE(struct.getOPR_INST_START_DATE());
			this.setr1_MODE(struct.getr1_MODE());
			this.setPRD_DUE_DATE(struct.getPRD_DUE_DATE());
			this.setr2_MODE(struct.getr2_MODE());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setc_JOB_ODR_CD(struct.getc_JOB_ODR_CD());
			this.setOPR_INST_START_TIME(struct.getOPR_INST_START_TIME());
			this.setPRD_DUE_TIME(struct.getPRD_DUE_TIME());
			this.setTIME_CTRL(struct.getTIME_CTRL());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AD0030010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_OPR_INST_START_DATE(struct.getList_OPR_INST_START_DATE());
			this.setList_r1_MODE(struct.getList_r1_MODE());
			this.setList_PRD_DUE_DATE(struct.getList_PRD_DUE_DATE());
			this.setList_r2_MODE(struct.getList_r2_MODE());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_c_JOB_ODR_CD(struct.getList_c_JOB_ODR_CD());
			this.setList_OPR_INST_START_TIME(struct.getList_OPR_INST_START_TIME());
			this.setList_PRD_DUE_TIME(struct.getList_PRD_DUE_TIME());
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
	// �� 1 �ϐ������l�F i_OPR_INST_START_DATE


	final static String i_OPR_INST_START_DATE = null;

	// �� 2 �ϐ������l�F i_r1_MODE


	final static String i_r1_MODE = null;

	// �� 3 �ϐ������l�F i_PRD_DUE_DATE


	final static String i_PRD_DUE_DATE = null;

	// �� 4 �ϐ������l�F i_r2_MODE


	final static String i_r2_MODE = null;

	// �� 5 �ϐ������l�F i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// �� 6 �ϐ������l�F i_c_JOB_ODR_CD


	final static String i_c_JOB_ODR_CD = null;

	// �� 7 �ϐ������l�F i_OPR_INST_START_TIME


	final static String i_OPR_INST_START_TIME = null;

	// �� 8 �ϐ������l�F i_PRD_DUE_TIME


	final static String i_PRD_DUE_TIME = null;

	// �� 9 �ϐ������l�F i_TIME_CTRL


	final static String i_TIME_CTRL = null;

*/

	//{{user_implement_code
		// TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
		// �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
	// �� 1 �ϐ������l�F i_OPR_INST_START_DATE
	final static String i_OPR_INST_START_DATE = null;
	// �� 2 �ϐ������l�F i_r1_MODE
	final static String i_r1_MODE = null;
	// �� 3 �ϐ������l�F i_PRD_DUE_DATE
	final static String i_PRD_DUE_DATE = null;
	// �� 4 �ϐ������l�F i_r2_MODE
	final static String i_r2_MODE = null;
	// �� 5 �ϐ������l�F i_JOB_ODR_CD
	final static String i_JOB_ODR_CD = null;
	// �� 6 �ϐ������l�F i_c_JOB_ODR_CD
	final static String i_c_JOB_ODR_CD = null;

	/**
	 * ������
	 *
	 */
	public void initialize()
	{

		clear();

		m_OPR_INST_START_DATE = i_OPR_INST_START_DATE;
		m_r1_MODE = i_r1_MODE;
		m_PRD_DUE_DATE = i_PRD_DUE_DATE;
		m_r2_MODE = i_r2_MODE;
		m_JOB_ODR_CD = i_JOB_ODR_CD;
		m_c_JOB_ODR_CD = i_c_JOB_ODR_CD;
	}

		// TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
