/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AN0060/src/com/nec/jp/orteus/metamorBase/AN0060/AN0060010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AN0060;

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

public class AN0060010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_rowSelected */
	public String m_rowSelected = null;
	/** �� 2 �ϐ��F m_l_VALUE */
	public String m_l_VALUE = null;
	/** �� 3 �ϐ��F m_l_DISPLAY_NAME */
	public String m_l_DISPLAY_NAME = null;
	/** �� 4 �ϐ��F m_l_h_DISPLAY_NAME */
	public String m_l_h_DISPLAY_NAME = null;
	/** �� 5 �ϐ��F m_l_h_CHANGEABLE_TYP */
	public String m_l_h_CHANGEABLE_TYP = null;
	/** �� 6 �ϐ��F m_l_h_MODIFY_COUNT */
	public String m_l_h_MODIFY_COUNT = null;
	/** �� 7 �ϐ��F m_TYPE_CD */
	public String m_TYPE_CD = null;
	/** �� 8 �ϐ��F m_TYPE_NAME */
	public String m_TYPE_NAME = null;
	/** �� 9 �ϐ��F m_h_TYPE_NAME */
	public String m_h_TYPE_NAME = null;
	/** �� 10 �ϐ��F m_h_INSERTABLE_TYP */
	public String m_h_INSERTABLE_TYP = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_rowSelected */
	public List l_rowSelected = null;

	/** �� 2 List�ϐ��F l_l_VALUE */
	public List l_l_VALUE = null;

	/** �� 3 List�ϐ��F l_l_DISPLAY_NAME */
	public List l_l_DISPLAY_NAME = null;

	/** �� 4 List�ϐ��F l_l_h_DISPLAY_NAME */
	public List l_l_h_DISPLAY_NAME = null;

	/** �� 5 List�ϐ��F l_l_h_CHANGEABLE_TYP */
	public List l_l_h_CHANGEABLE_TYP = null;

	/** �� 6 List�ϐ��F l_l_h_MODIFY_COUNT */
	public List l_l_h_MODIFY_COUNT = null;

	/** �� 7 List�ϐ��F l_TYPE_CD */
	public List l_TYPE_CD = null;

	/** �� 8 List�ϐ��F l_TYPE_NAME */
	public List l_TYPE_NAME = null;

	/** �� 9 List�ϐ��F l_h_TYPE_NAME */
	public List l_h_TYPE_NAME = null;

	/** �� 10 List�ϐ��F l_h_INSERTABLE_TYP */
	public List l_h_INSERTABLE_TYP = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getrowSelected() { return m_rowSelected; }
	public String getl_VALUE() { return m_l_VALUE; }
	public String getl_DISPLAY_NAME() { return m_l_DISPLAY_NAME; }
	public String getl_h_DISPLAY_NAME() { return m_l_h_DISPLAY_NAME; }
	public String getl_h_CHANGEABLE_TYP() { return m_l_h_CHANGEABLE_TYP; }
	public String getl_h_MODIFY_COUNT() { return m_l_h_MODIFY_COUNT; }
	public String getTYPE_CD() { return m_TYPE_CD; }
	public String getTYPE_NAME() { return m_TYPE_NAME; }
	public String geth_TYPE_NAME() { return m_h_TYPE_NAME; }
	public String geth_INSERTABLE_TYP() { return m_h_INSERTABLE_TYP; }

	public List getList_rowSelected() { return l_rowSelected; }
	public List getList_l_VALUE() { return l_l_VALUE; }
	public List getList_l_DISPLAY_NAME() { return l_l_DISPLAY_NAME; }
	public List getList_l_h_DISPLAY_NAME() { return l_l_h_DISPLAY_NAME; }
	public List getList_l_h_CHANGEABLE_TYP() { return l_l_h_CHANGEABLE_TYP; }
	public List getList_l_h_MODIFY_COUNT() { return l_l_h_MODIFY_COUNT; }
	public List getList_TYPE_CD() { return l_TYPE_CD; }
	public List getList_TYPE_NAME() { return l_TYPE_NAME; }
	public List getList_h_TYPE_NAME() { return l_h_TYPE_NAME; }
	public List getList_h_INSERTABLE_TYP() { return l_h_INSERTABLE_TYP; }

	public void setrowSelected(String val) { m_rowSelected = val; }
	public void setl_VALUE(String val) { m_l_VALUE = val; }
	public void setl_DISPLAY_NAME(String val) { m_l_DISPLAY_NAME = val; }
	public void setl_h_DISPLAY_NAME(String val) { m_l_h_DISPLAY_NAME = val; }
	public void setl_h_CHANGEABLE_TYP(String val) { m_l_h_CHANGEABLE_TYP = val; }
	public void setl_h_MODIFY_COUNT(String val) { m_l_h_MODIFY_COUNT = val; }
	public void setTYPE_CD(String val) { m_TYPE_CD = val; }
	public void setTYPE_NAME(String val) { m_TYPE_NAME = val; }
	public void seth_TYPE_NAME(String val) { m_h_TYPE_NAME = val; }
	public void seth_INSERTABLE_TYP(String val) { m_h_INSERTABLE_TYP = val; }


	public void setList_rowSelected(List list) { l_rowSelected = list; }
	public void setList_l_VALUE(List list) { l_l_VALUE = list; }
	public void setList_l_DISPLAY_NAME(List list) { l_l_DISPLAY_NAME = list; }
	public void setList_l_h_DISPLAY_NAME(List list) { l_l_h_DISPLAY_NAME = list; }
	public void setList_l_h_CHANGEABLE_TYP(List list) { l_l_h_CHANGEABLE_TYP = list; }
	public void setList_l_h_MODIFY_COUNT(List list) { l_l_h_MODIFY_COUNT = list; }
	public void setList_TYPE_CD(List list) { l_TYPE_CD = list; }
	public void setList_TYPE_NAME(List list) { l_TYPE_NAME = list; }
	public void setList_h_TYPE_NAME(List list) { l_h_TYPE_NAME = list; }
	public void setList_h_INSERTABLE_TYP(List list) { l_h_INSERTABLE_TYP = list; }

	public int setL2L_rowSelected(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rowSelected == null) {
			l_rowSelected = new ArrayList();
		} else {
			l_rowSelected.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rowSelected.add(((AN0060010Struct) list.get(i)).getrowSelected());
		}
		return size;
	}
	public int setL2L_l_VALUE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_VALUE == null) {
			l_l_VALUE = new ArrayList();
		} else {
			l_l_VALUE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_VALUE.add(((AN0060010Struct) list.get(i)).getl_VALUE());
		}
		return size;
	}
	public int setL2L_l_DISPLAY_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DISPLAY_NAME == null) {
			l_l_DISPLAY_NAME = new ArrayList();
		} else {
			l_l_DISPLAY_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DISPLAY_NAME.add(((AN0060010Struct) list.get(i)).getl_DISPLAY_NAME());
		}
		return size;
	}
	public int setL2L_l_h_DISPLAY_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_h_DISPLAY_NAME == null) {
			l_l_h_DISPLAY_NAME = new ArrayList();
		} else {
			l_l_h_DISPLAY_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_h_DISPLAY_NAME.add(((AN0060010Struct) list.get(i)).getl_h_DISPLAY_NAME());
		}
		return size;
	}
	public int setL2L_l_h_CHANGEABLE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_h_CHANGEABLE_TYP == null) {
			l_l_h_CHANGEABLE_TYP = new ArrayList();
		} else {
			l_l_h_CHANGEABLE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_h_CHANGEABLE_TYP.add(((AN0060010Struct) list.get(i)).getl_h_CHANGEABLE_TYP());
		}
		return size;
	}
	public int setL2L_l_h_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_h_MODIFY_COUNT == null) {
			l_l_h_MODIFY_COUNT = new ArrayList();
		} else {
			l_l_h_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_h_MODIFY_COUNT.add(((AN0060010Struct) list.get(i)).getl_h_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_TYPE_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TYPE_CD == null) {
			l_TYPE_CD = new ArrayList();
		} else {
			l_TYPE_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TYPE_CD.add(((AN0060010Struct) list.get(i)).getTYPE_CD());
		}
		return size;
	}
	public int setL2L_TYPE_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TYPE_NAME == null) {
			l_TYPE_NAME = new ArrayList();
		} else {
			l_TYPE_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TYPE_NAME.add(((AN0060010Struct) list.get(i)).getTYPE_NAME());
		}
		return size;
	}
	public int setL2L_h_TYPE_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_TYPE_NAME == null) {
			l_h_TYPE_NAME = new ArrayList();
		} else {
			l_h_TYPE_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_TYPE_NAME.add(((AN0060010Struct) list.get(i)).geth_TYPE_NAME());
		}
		return size;
	}
	public int setL2L_h_INSERTABLE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_INSERTABLE_TYP == null) {
			l_h_INSERTABLE_TYP = new ArrayList();
		} else {
			l_h_INSERTABLE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_INSERTABLE_TYP.add(((AN0060010Struct) list.get(i)).geth_INSERTABLE_TYP());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_rowSelected = null;
		m_l_VALUE = null;
		m_l_DISPLAY_NAME = null;
		m_l_h_DISPLAY_NAME = null;
		m_l_h_CHANGEABLE_TYP = null;
		m_l_h_MODIFY_COUNT = null;
		m_TYPE_CD = null;
		m_TYPE_NAME = null;
		m_h_TYPE_NAME = null;
		m_h_INSERTABLE_TYP = null;

		l_rowSelected = null;
		l_l_VALUE = null;
		l_l_DISPLAY_NAME = null;
		l_l_h_DISPLAY_NAME = null;
		l_l_h_CHANGEABLE_TYP = null;
		l_l_h_MODIFY_COUNT = null;
		l_TYPE_CD = null;
		l_TYPE_NAME = null;
		l_h_TYPE_NAME = null;
		l_h_INSERTABLE_TYP = null;

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
	 * medAN0060010�N���X�̕W���R���X�g���N�^
	 */
	public AN0060010Struct()
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
	public void setStruct(AN0060010Struct struct)
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
	public void setStructM(AN0060010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setrowSelected(struct.getrowSelected());
			this.setl_VALUE(struct.getl_VALUE());
			this.setl_DISPLAY_NAME(struct.getl_DISPLAY_NAME());
			this.setl_h_DISPLAY_NAME(struct.getl_h_DISPLAY_NAME());
			this.setl_h_CHANGEABLE_TYP(struct.getl_h_CHANGEABLE_TYP());
			this.setl_h_MODIFY_COUNT(struct.getl_h_MODIFY_COUNT());
			this.setTYPE_CD(struct.getTYPE_CD());
			this.setTYPE_NAME(struct.getTYPE_NAME());
			this.seth_TYPE_NAME(struct.geth_TYPE_NAME());
			this.seth_INSERTABLE_TYP(struct.geth_INSERTABLE_TYP());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AN0060010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_rowSelected(struct.getList_rowSelected());
			this.setList_l_VALUE(struct.getList_l_VALUE());
			this.setList_l_DISPLAY_NAME(struct.getList_l_DISPLAY_NAME());
			this.setList_l_h_DISPLAY_NAME(struct.getList_l_h_DISPLAY_NAME());
			this.setList_l_h_CHANGEABLE_TYP(struct.getList_l_h_CHANGEABLE_TYP());
			this.setList_l_h_MODIFY_COUNT(struct.getList_l_h_MODIFY_COUNT());
			this.setList_TYPE_CD(struct.getList_TYPE_CD());
			this.setList_TYPE_NAME(struct.getList_TYPE_NAME());
			this.setList_h_TYPE_NAME(struct.getList_h_TYPE_NAME());
			this.setList_h_INSERTABLE_TYP(struct.getList_h_INSERTABLE_TYP());
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
	// �� 1 �ϐ������l�F i_rowSelected


	final static String i_rowSelected = null;

	// �� 2 �ϐ������l�F i_l_VALUE


	final static String i_l_VALUE = null;

	// �� 3 �ϐ������l�F i_l_DISPLAY_NAME


	final static String i_l_DISPLAY_NAME = null;

	// �� 4 �ϐ������l�F i_l_h_DISPLAY_NAME


	final static String i_l_h_DISPLAY_NAME = null;

	// �� 5 �ϐ������l�F i_l_h_CHANGEABLE_TYP


	final static String i_l_h_CHANGEABLE_TYP = null;

	// �� 6 �ϐ������l�F i_l_h_MODIFY_COUNT


	final static String i_l_h_MODIFY_COUNT = null;

	// �� 7 �ϐ������l�F i_TYPE_CD


	final static String i_TYPE_CD = null;

	// �� 8 �ϐ������l�F i_TYPE_NAME


	final static String i_TYPE_NAME = null;

	// �� 9 �ϐ������l�F i_h_TYPE_NAME


	final static String i_h_TYPE_NAME = null;

	// �� 10 �ϐ������l�F i_h_INSERTABLE_TYP


	final static String i_h_INSERTABLE_TYP = null;

*/

	//{{user_implement_code
       
        // �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
        // �� 1 �ϐ������l�F i_l_VALUE
        final static String i_l_VALUE = null;
        // �� 2 �ϐ������l�F i_l_DISPLAY_NAME
        final static String i_l_DISPLAY_NAME = null;
        // �� 3 �ϐ������l�F i_l_h_DISPLAY_NAME
        final static String i_l_h_DISPLAY_NAME = null;
        // �� 4 �ϐ������l�F i_l_h_CHANGEABLE_TYP
        final static String i_l_h_CHANGEABLE_TYP = null;
        // �� 5 �ϐ������l�F i_l_h_MODIFY_COUNT
        final static String i_l_h_MODIFY_COUNT = null;
        // �� 6 �ϐ������l�F i_TYPE_CD
        final static String i_TYPE_CD = null;
        // �� 7 �ϐ������l�F i_TYPE_NAME
        final static String i_TYPE_NAME = null;
        // �� 8 �ϐ������l�F i_h_TYPE_NAME
        final static String i_h_TYPE_NAME = null;
        // �� 9 �ϐ������l�F i_h_INSERTABLE_TYP
        final static String i_h_INSERTABLE_TYP = null;
        // �� 10 �ϐ������l�F i_rowSelected
        final static String i_rowSelected = null;
       
        /**
         * ������
         *
         */
        public void initialize()
        {
       
         clear();
       
         m_l_VALUE = i_l_VALUE;
         m_l_DISPLAY_NAME = i_l_DISPLAY_NAME;
         m_l_h_DISPLAY_NAME = i_l_h_DISPLAY_NAME;
         m_l_h_CHANGEABLE_TYP = i_l_h_CHANGEABLE_TYP;
         m_l_h_MODIFY_COUNT = i_l_h_MODIFY_COUNT;
         m_TYPE_CD = i_TYPE_CD;
         m_TYPE_NAME = i_TYPE_NAME;
         m_h_TYPE_NAME = i_h_TYPE_NAME;
         m_h_INSERTABLE_TYP = i_h_INSERTABLE_TYP;
         m_rowSelected = i_rowSelected;
        }
       
         // TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
