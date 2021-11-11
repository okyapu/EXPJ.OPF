/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AN0030/src/com/nec/jp/orteus/metamorBase/AN0030/AN0030010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AN0030;

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

public class AN0030010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_h_MNT_PERIOD */
	public String m_h_MNT_PERIOD = null;
	/** �� 2 �ϐ��F m_DISPLAY_NAME */
	public String m_DISPLAY_NAME = null;
	/** �� 3 �ϐ��F m_h_MNT_DATA_TYP */
	public String m_h_MNT_DATA_TYP = null;
	/** �� 4 �ϐ��F m_MNT_PERIOD */
	public String m_MNT_PERIOD = null;
	/** �� 5 �ϐ��F m_h_MODIFY_COUNT */
	public String m_h_MODIFY_COUNT = null;
	/** �� 6 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 7 �ϐ��F m_PLANT_NAME */
	public String m_PLANT_NAME = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_h_MNT_PERIOD */
	public List l_h_MNT_PERIOD = null;

	/** �� 2 List�ϐ��F l_DISPLAY_NAME */
	public List l_DISPLAY_NAME = null;

	/** �� 3 List�ϐ��F l_h_MNT_DATA_TYP */
	public List l_h_MNT_DATA_TYP = null;

	/** �� 4 List�ϐ��F l_MNT_PERIOD */
	public List l_MNT_PERIOD = null;

	/** �� 5 List�ϐ��F l_h_MODIFY_COUNT */
	public List l_h_MODIFY_COUNT = null;

	/** �� 6 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 7 List�ϐ��F l_PLANT_NAME */
	public List l_PLANT_NAME = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String geth_MNT_PERIOD() { return m_h_MNT_PERIOD; }
	public String getDISPLAY_NAME() { return m_DISPLAY_NAME; }
	public String geth_MNT_DATA_TYP() { return m_h_MNT_DATA_TYP; }
	public String getMNT_PERIOD() { return m_MNT_PERIOD; }
	public String geth_MODIFY_COUNT() { return m_h_MODIFY_COUNT; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }

	public List getList_h_MNT_PERIOD() { return l_h_MNT_PERIOD; }
	public List getList_DISPLAY_NAME() { return l_DISPLAY_NAME; }
	public List getList_h_MNT_DATA_TYP() { return l_h_MNT_DATA_TYP; }
	public List getList_MNT_PERIOD() { return l_MNT_PERIOD; }
	public List getList_h_MODIFY_COUNT() { return l_h_MODIFY_COUNT; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }

	public void seth_MNT_PERIOD(String val) { m_h_MNT_PERIOD = val; }
	public void setDISPLAY_NAME(String val) { m_DISPLAY_NAME = val; }
	public void seth_MNT_DATA_TYP(String val) { m_h_MNT_DATA_TYP = val; }
	public void setMNT_PERIOD(String val) { m_MNT_PERIOD = val; }
	public void seth_MODIFY_COUNT(String val) { m_h_MODIFY_COUNT = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }


	public void setList_h_MNT_PERIOD(List list) { l_h_MNT_PERIOD = list; }
	public void setList_DISPLAY_NAME(List list) { l_DISPLAY_NAME = list; }
	public void setList_h_MNT_DATA_TYP(List list) { l_h_MNT_DATA_TYP = list; }
	public void setList_MNT_PERIOD(List list) { l_MNT_PERIOD = list; }
	public void setList_h_MODIFY_COUNT(List list) { l_h_MODIFY_COUNT = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }

	public int setL2L_h_MNT_PERIOD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_MNT_PERIOD == null) {
			l_h_MNT_PERIOD = new ArrayList();
		} else {
			l_h_MNT_PERIOD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_MNT_PERIOD.add(((AN0030010Struct) list.get(i)).geth_MNT_PERIOD());
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
			l_DISPLAY_NAME.add(((AN0030010Struct) list.get(i)).getDISPLAY_NAME());
		}
		return size;
	}
	public int setL2L_h_MNT_DATA_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_MNT_DATA_TYP == null) {
			l_h_MNT_DATA_TYP = new ArrayList();
		} else {
			l_h_MNT_DATA_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_MNT_DATA_TYP.add(((AN0030010Struct) list.get(i)).geth_MNT_DATA_TYP());
		}
		return size;
	}
	public int setL2L_MNT_PERIOD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MNT_PERIOD == null) {
			l_MNT_PERIOD = new ArrayList();
		} else {
			l_MNT_PERIOD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MNT_PERIOD.add(((AN0030010Struct) list.get(i)).getMNT_PERIOD());
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
			l_h_MODIFY_COUNT.add(((AN0030010Struct) list.get(i)).geth_MODIFY_COUNT());
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
			l_PLANT_CD.add(((AN0030010Struct) list.get(i)).getPLANT_CD());
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
			l_PLANT_NAME.add(((AN0030010Struct) list.get(i)).getPLANT_NAME());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_h_MNT_PERIOD = null;
		m_DISPLAY_NAME = null;
		m_h_MNT_DATA_TYP = null;
		m_MNT_PERIOD = null;
		m_h_MODIFY_COUNT = null;
		m_PLANT_CD = null;
		m_PLANT_NAME = null;

		l_h_MNT_PERIOD = null;
		l_DISPLAY_NAME = null;
		l_h_MNT_DATA_TYP = null;
		l_MNT_PERIOD = null;
		l_h_MODIFY_COUNT = null;
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
	 * medAN0030010�N���X�̕W���R���X�g���N�^
	 */
	public AN0030010Struct()
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
	public void setStruct(AN0030010Struct struct)
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
	public void setStructM(AN0030010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.seth_MNT_PERIOD(struct.geth_MNT_PERIOD());
			this.setDISPLAY_NAME(struct.getDISPLAY_NAME());
			this.seth_MNT_DATA_TYP(struct.geth_MNT_DATA_TYP());
			this.setMNT_PERIOD(struct.getMNT_PERIOD());
			this.seth_MODIFY_COUNT(struct.geth_MODIFY_COUNT());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setPLANT_NAME(struct.getPLANT_NAME());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AN0030010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_h_MNT_PERIOD(struct.getList_h_MNT_PERIOD());
			this.setList_DISPLAY_NAME(struct.getList_DISPLAY_NAME());
			this.setList_h_MNT_DATA_TYP(struct.getList_h_MNT_DATA_TYP());
			this.setList_MNT_PERIOD(struct.getList_MNT_PERIOD());
			this.setList_h_MODIFY_COUNT(struct.getList_h_MODIFY_COUNT());
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
	// �� 1 �ϐ������l�F i_h_MNT_PERIOD


	final static String i_h_MNT_PERIOD = null;

	// �� 2 �ϐ������l�F i_DISPLAY_NAME


	final static String i_DISPLAY_NAME = null;

	// �� 3 �ϐ������l�F i_h_MNT_DATA_TYP


	final static String i_h_MNT_DATA_TYP = null;

	// �� 4 �ϐ������l�F i_MNT_PERIOD


	final static String i_MNT_PERIOD = null;

	// �� 5 �ϐ������l�F i_h_MODIFY_COUNT


	final static String i_h_MODIFY_COUNT = null;

	// �� 6 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 7 �ϐ������l�F i_PLANT_NAME


	final static String i_PLANT_NAME = null;

*/

	//{{user_implement_code
       
        // �� 1 �ϐ������l�F i_h_MNT_DATA_TYP
        final static String i_h_MNT_DATA_TYP = null;
        // �� 2 �ϐ������l�F i_MNT_PERIOD
        final static String i_MNT_PERIOD = null;
        // �� 3 �ϐ������l�F i_h_MODIFY_COUNT
        final static String i_h_MODIFY_COUNT = null;
        // �� 4 �ϐ������l�F i_DISPLAY_NAME
        final static String i_DISPLAY_NAME = null;
        // �� 5 �ϐ������l�F i_h_MNT_PERIOD
        final static String i_h_MNT_PERIOD = null;
        // �� 6 �ϐ������l�F i_PLANT_NAME
        final static String i_PLANT_NAME = null;
       
       
        /**
         * ������
         *
         */
        public void initialize()
        {
         m_h_MNT_DATA_TYP = i_h_MNT_DATA_TYP;
         m_MNT_PERIOD = i_MNT_PERIOD;
         m_h_MODIFY_COUNT = i_h_MODIFY_COUNT;
         m_DISPLAY_NAME = i_DISPLAY_NAME;
         m_h_MNT_PERIOD = i_h_MNT_PERIOD;
         m_PLANT_NAME = i_PLANT_NAME;
       
         l_h_MNT_DATA_TYP = null;
         l_MNT_PERIOD = null;
         l_h_MODIFY_COUNT = null;
         l_DISPLAY_NAME = null;
         l_PLANT_CD = null;
         l_PLANT_NAME = null;
         l_h_MNT_PERIOD = null;
        }
       
         // TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
