/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AN0090/src/com/nec/jp/orteus/metamorBase/AN0090/AN0090010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AN0090;

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

public class AN0090010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_OD_CALC_FLG */
	public String m_OD_CALC_FLG = null;
	/** �� 2 �ϐ��F m_OD_MNT_FLG */
	public String m_OD_MNT_FLG = null;
	/** �� 3 �ϐ��F m_h_MODIFY_COUNT */
	public String m_h_MODIFY_COUNT = null;
	/** �� 4 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 5 �ϐ��F m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** �� 6 �ϐ��F m_OD_CALC_FLG_name */
	public String m_OD_CALC_FLG_name = null;
	/** �� 7 �ϐ��F m_OD_CALC_FLG_val */
	public String m_OD_CALC_FLG_val = null;
	/** �� 8 �ϐ��F m_OD_MNT_FLG_name */
	public String m_OD_MNT_FLG_name = null;
	/** �� 9 �ϐ��F m_OD_MNT_FLG_val */
	public String m_OD_MNT_FLG_val = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_OD_CALC_FLG */
	public List l_OD_CALC_FLG = null;

	/** �� 2 List�ϐ��F l_OD_MNT_FLG */
	public List l_OD_MNT_FLG = null;

	/** �� 3 List�ϐ��F l_h_MODIFY_COUNT */
	public List l_h_MODIFY_COUNT = null;

	/** �� 4 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 5 List�ϐ��F l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** �� 6 List�ϐ��F l_OD_CALC_FLG_name */
	public List l_OD_CALC_FLG_name = null;

	/** �� 7 List�ϐ��F l_OD_CALC_FLG_val */
	public List l_OD_CALC_FLG_val = null;

	/** �� 8 List�ϐ��F l_OD_MNT_FLG_name */
	public List l_OD_MNT_FLG_name = null;

	/** �� 9 List�ϐ��F l_OD_MNT_FLG_val */
	public List l_OD_MNT_FLG_val = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getOD_CALC_FLG() { return m_OD_CALC_FLG; }
	public String getOD_MNT_FLG() { return m_OD_MNT_FLG; }
	public String geth_MODIFY_COUNT() { return m_h_MODIFY_COUNT; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getOD_CALC_FLG_name() { return m_OD_CALC_FLG_name; }
	public String getOD_CALC_FLG_val() { return m_OD_CALC_FLG_val; }
	public String getOD_MNT_FLG_name() { return m_OD_MNT_FLG_name; }
	public String getOD_MNT_FLG_val() { return m_OD_MNT_FLG_val; }

	public List getList_OD_CALC_FLG() { return l_OD_CALC_FLG; }
	public List getList_OD_MNT_FLG() { return l_OD_MNT_FLG; }
	public List getList_h_MODIFY_COUNT() { return l_h_MODIFY_COUNT; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_OD_CALC_FLG_name() { return l_OD_CALC_FLG_name; }
	public List getList_OD_CALC_FLG_val() { return l_OD_CALC_FLG_val; }
	public List getList_OD_MNT_FLG_name() { return l_OD_MNT_FLG_name; }
	public List getList_OD_MNT_FLG_val() { return l_OD_MNT_FLG_val; }

	public void setOD_CALC_FLG(String val) { m_OD_CALC_FLG = val; }
	public void setOD_MNT_FLG(String val) { m_OD_MNT_FLG = val; }
	public void seth_MODIFY_COUNT(String val) { m_h_MODIFY_COUNT = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setOD_CALC_FLG_name(String val) { m_OD_CALC_FLG_name = val; }
	public void setOD_CALC_FLG_val(String val) { m_OD_CALC_FLG_val = val; }
	public void setOD_MNT_FLG_name(String val) { m_OD_MNT_FLG_name = val; }
	public void setOD_MNT_FLG_val(String val) { m_OD_MNT_FLG_val = val; }


	public void setList_OD_CALC_FLG(List list) { l_OD_CALC_FLG = list; }
	public void setList_OD_MNT_FLG(List list) { l_OD_MNT_FLG = list; }
	public void setList_h_MODIFY_COUNT(List list) { l_h_MODIFY_COUNT = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_OD_CALC_FLG_name(List list) { l_OD_CALC_FLG_name = list; }
	public void setList_OD_CALC_FLG_val(List list) { l_OD_CALC_FLG_val = list; }
	public void setList_OD_MNT_FLG_name(List list) { l_OD_MNT_FLG_name = list; }
	public void setList_OD_MNT_FLG_val(List list) { l_OD_MNT_FLG_val = list; }

	public int setL2L_OD_CALC_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OD_CALC_FLG == null) {
			l_OD_CALC_FLG = new ArrayList();
		} else {
			l_OD_CALC_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OD_CALC_FLG.add(((AN0090010Struct) list.get(i)).getOD_CALC_FLG());
		}
		return size;
	}
	public int setL2L_OD_MNT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OD_MNT_FLG == null) {
			l_OD_MNT_FLG = new ArrayList();
		} else {
			l_OD_MNT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OD_MNT_FLG.add(((AN0090010Struct) list.get(i)).getOD_MNT_FLG());
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
			l_h_MODIFY_COUNT.add(((AN0090010Struct) list.get(i)).geth_MODIFY_COUNT());
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
			l_PLANT_CD.add(((AN0090010Struct) list.get(i)).getPLANT_CD());
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
			l_PLANT_NAME.add(((AN0090010Struct) list.get(i)).getPLANT_NAME());
		}
		return size;
	}
	public int setL2L_OD_CALC_FLG_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OD_CALC_FLG_name == null) {
			l_OD_CALC_FLG_name = new ArrayList();
		} else {
			l_OD_CALC_FLG_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OD_CALC_FLG_name.add(((AN0090010Struct) list.get(i)).getOD_CALC_FLG_name());
		}
		return size;
	}
	public int setL2L_OD_CALC_FLG_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OD_CALC_FLG_val == null) {
			l_OD_CALC_FLG_val = new ArrayList();
		} else {
			l_OD_CALC_FLG_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OD_CALC_FLG_val.add(((AN0090010Struct) list.get(i)).getOD_CALC_FLG_val());
		}
		return size;
	}
	public int setL2L_OD_MNT_FLG_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OD_MNT_FLG_name == null) {
			l_OD_MNT_FLG_name = new ArrayList();
		} else {
			l_OD_MNT_FLG_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OD_MNT_FLG_name.add(((AN0090010Struct) list.get(i)).getOD_MNT_FLG_name());
		}
		return size;
	}
	public int setL2L_OD_MNT_FLG_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OD_MNT_FLG_val == null) {
			l_OD_MNT_FLG_val = new ArrayList();
		} else {
			l_OD_MNT_FLG_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OD_MNT_FLG_val.add(((AN0090010Struct) list.get(i)).getOD_MNT_FLG_val());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_OD_CALC_FLG = null;
		m_OD_MNT_FLG = null;
		m_h_MODIFY_COUNT = null;
		m_PLANT_CD = null;
		m_PLANT_NAME = null;
		m_OD_CALC_FLG_name = null;
		m_OD_CALC_FLG_val = null;
		m_OD_MNT_FLG_name = null;
		m_OD_MNT_FLG_val = null;

		l_OD_CALC_FLG = null;
		l_OD_MNT_FLG = null;
		l_h_MODIFY_COUNT = null;
		l_PLANT_CD = null;
		l_PLANT_NAME = null;
		l_OD_CALC_FLG_name = null;
		l_OD_CALC_FLG_val = null;
		l_OD_MNT_FLG_name = null;
		l_OD_MNT_FLG_val = null;

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
	 * medAN0090010�N���X�̕W���R���X�g���N�^
	 */
	public AN0090010Struct()
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
	public void setStruct(AN0090010Struct struct)
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
	public void setStructM(AN0090010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setOD_CALC_FLG(struct.getOD_CALC_FLG());
			this.setOD_MNT_FLG(struct.getOD_MNT_FLG());
			this.seth_MODIFY_COUNT(struct.geth_MODIFY_COUNT());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.setOD_CALC_FLG_name(struct.getOD_CALC_FLG_name());
			this.setOD_CALC_FLG_val(struct.getOD_CALC_FLG_val());
			this.setOD_MNT_FLG_name(struct.getOD_MNT_FLG_name());
			this.setOD_MNT_FLG_val(struct.getOD_MNT_FLG_val());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AN0090010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_OD_CALC_FLG(struct.getList_OD_CALC_FLG());
			this.setList_OD_MNT_FLG(struct.getList_OD_MNT_FLG());
			this.setList_h_MODIFY_COUNT(struct.getList_h_MODIFY_COUNT());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_OD_CALC_FLG_name(struct.getList_OD_CALC_FLG_name());
			this.setList_OD_CALC_FLG_val(struct.getList_OD_CALC_FLG_val());
			this.setList_OD_MNT_FLG_name(struct.getList_OD_MNT_FLG_name());
			this.setList_OD_MNT_FLG_val(struct.getList_OD_MNT_FLG_val());
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
	// �� 1 �ϐ������l�F i_OD_CALC_FLG


	final static String i_OD_CALC_FLG = null;

	// �� 2 �ϐ������l�F i_OD_MNT_FLG


	final static String i_OD_MNT_FLG = null;

	// �� 3 �ϐ������l�F i_h_MODIFY_COUNT


	final static String i_h_MODIFY_COUNT = null;

	// �� 4 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 5 �ϐ������l�F i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// �� 6 �ϐ������l�F i_OD_CALC_FLG_name


	final static String i_OD_CALC_FLG_name = null;

	// �� 7 �ϐ������l�F i_OD_CALC_FLG_val


	final static String i_OD_CALC_FLG_val = null;

	// �� 8 �ϐ������l�F i_OD_MNT_FLG_name


	final static String i_OD_MNT_FLG_name = null;

	// �� 9 �ϐ������l�F i_OD_MNT_FLG_val


	final static String i_OD_MNT_FLG_val = null;

*/

	//{{user_implement_code
         // TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
         // �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
        // �� 1 �ϐ������l�F i_OD_CALC_FLG
        final static String i_OD_CALC_FLG = null;
        // �� 2 �ϐ������l�F i_OD_MNT_FLG
        final static String i_OD_MNT_FLG = null;
        // �� 3 �ϐ������l�F i_h_MODIFY_COUNT
        final static String i_h_MODIFY_COUNT = null;
        // �� 4 �ϐ������l�F i_PLANT_CD
        final static String i_PLANT_CD = null;
        // �� 5 �ϐ������l�F i_PLANT_NAME
        final static String i_PLANT_NAME = null;
        // �� 6 �ϐ������l�F i_OD_CALC_FLG_name
        final static String i_OD_CALC_FLG_name = null;
        // �� 7 �ϐ������l�F i_OD_CALC_FLG_val
        final static String i_OD_CALC_FLG_val = null;
        // �� 8 �ϐ������l�F i_OD_MNT_FLG_name
        final static String i_OD_MNT_FLG_name = null;
        // �� 9 �ϐ������l�F i_OD_MNT_FLG_val
        final static String i_OD_MNT_FLG_val = null;
       
        /**
         * ������
         *
         */
        public void initialize()
        {
       
         clear();
       
         m_OD_CALC_FLG = i_OD_CALC_FLG;
         m_OD_MNT_FLG = i_OD_MNT_FLG;
         m_h_MODIFY_COUNT = i_h_MODIFY_COUNT;
         m_PLANT_CD = i_PLANT_CD;
         m_PLANT_NAME = i_PLANT_NAME;
         m_OD_CALC_FLG_name = i_OD_CALC_FLG_name;
         m_OD_CALC_FLG_val = i_OD_CALC_FLG_val;
         m_OD_MNT_FLG_name = i_OD_MNT_FLG_name;
         m_OD_MNT_FLG_val = i_OD_MNT_FLG_val;
        }
       
         // TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
