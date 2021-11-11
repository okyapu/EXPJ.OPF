/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AN0040/src/com/nec/jp/orteus/metamorBase/AN0040/AN0040010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AN0040;

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

public class AN0040010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_h_VALUE */
	public String m_h_VALUE = null;
	/** �� 2 �ϐ��F m_h_DESCRIPTION */
	public String m_h_DESCRIPTION = null;
	/** �� 3 �ϐ��F m_h_DESCRIPTION_EN */
	public String m_h_DESCRIPTION_EN = null;
	/** �� 4 �ϐ��F m_l_NAME */
	public String m_l_NAME = null;
	/** �� 5 �ϐ��F m_VALUE */
	public String m_VALUE = null;
	/** �� 6 �ϐ��F m_DESCRIPTION */
	public String m_DESCRIPTION = null;
	/** �� 7 �ϐ��F m_DESCRIPTION_EN */
	public String m_DESCRIPTION_EN = null;
	/** �� 8 �ϐ��F m_h_CHANGEABLE_TYP */
	public String m_h_CHANGEABLE_TYP = null;
	/** �� 9 �ϐ��F m_h_MODIFY_COUNT */
	public String m_h_MODIFY_COUNT = null;
	/** �� 10 �ϐ��F m_s_NAME */
	public String m_s_NAME = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_h_VALUE */
	public List l_h_VALUE = null;

	/** �� 2 List�ϐ��F l_h_DESCRIPTION */
	public List l_h_DESCRIPTION = null;

	/** �� 3 List�ϐ��F l_h_DESCRIPTION_EN */
	public List l_h_DESCRIPTION_EN = null;

	/** �� 4 List�ϐ��F l_l_NAME */
	public List l_l_NAME = null;

	/** �� 5 List�ϐ��F l_VALUE */
	public List l_VALUE = null;

	/** �� 6 List�ϐ��F l_DESCRIPTION */
	public List l_DESCRIPTION = null;

	/** �� 7 List�ϐ��F l_DESCRIPTION_EN */
	public List l_DESCRIPTION_EN = null;

	/** �� 8 List�ϐ��F l_h_CHANGEABLE_TYP */
	public List l_h_CHANGEABLE_TYP = null;

	/** �� 9 List�ϐ��F l_h_MODIFY_COUNT */
	public List l_h_MODIFY_COUNT = null;

	/** �� 10 List�ϐ��F l_s_NAME */
	public List l_s_NAME = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String geth_VALUE() { return m_h_VALUE; }
	public String geth_DESCRIPTION() { return m_h_DESCRIPTION; }
	public String geth_DESCRIPTION_EN() { return m_h_DESCRIPTION_EN; }
	public String getl_NAME() { return m_l_NAME; }
	public String getVALUE() { return m_VALUE; }
	public String getDESCRIPTION() { return m_DESCRIPTION; }
	public String getDESCRIPTION_EN() { return m_DESCRIPTION_EN; }
	public String geth_CHANGEABLE_TYP() { return m_h_CHANGEABLE_TYP; }
	public String geth_MODIFY_COUNT() { return m_h_MODIFY_COUNT; }
	public String gets_NAME() { return m_s_NAME; }

	public List getList_h_VALUE() { return l_h_VALUE; }
	public List getList_h_DESCRIPTION() { return l_h_DESCRIPTION; }
	public List getList_h_DESCRIPTION_EN() { return l_h_DESCRIPTION_EN; }
	public List getList_l_NAME() { return l_l_NAME; }
	public List getList_VALUE() { return l_VALUE; }
	public List getList_DESCRIPTION() { return l_DESCRIPTION; }
	public List getList_DESCRIPTION_EN() { return l_DESCRIPTION_EN; }
	public List getList_h_CHANGEABLE_TYP() { return l_h_CHANGEABLE_TYP; }
	public List getList_h_MODIFY_COUNT() { return l_h_MODIFY_COUNT; }
	public List getList_s_NAME() { return l_s_NAME; }

	public void seth_VALUE(String val) { m_h_VALUE = val; }
	public void seth_DESCRIPTION(String val) { m_h_DESCRIPTION = val; }
	public void seth_DESCRIPTION_EN(String val) { m_h_DESCRIPTION_EN = val; }
	public void setl_NAME(String val) { m_l_NAME = val; }
	public void setVALUE(String val) { m_VALUE = val; }
	public void setDESCRIPTION(String val) { m_DESCRIPTION = val; }
	public void setDESCRIPTION_EN(String val) { m_DESCRIPTION_EN = val; }
	public void seth_CHANGEABLE_TYP(String val) { m_h_CHANGEABLE_TYP = val; }
	public void seth_MODIFY_COUNT(String val) { m_h_MODIFY_COUNT = val; }
	public void sets_NAME(String val) { m_s_NAME = val; }


	public void setList_h_VALUE(List list) { l_h_VALUE = list; }
	public void setList_h_DESCRIPTION(List list) { l_h_DESCRIPTION = list; }
	public void setList_h_DESCRIPTION_EN(List list) { l_h_DESCRIPTION_EN = list; }
	public void setList_l_NAME(List list) { l_l_NAME = list; }
	public void setList_VALUE(List list) { l_VALUE = list; }
	public void setList_DESCRIPTION(List list) { l_DESCRIPTION = list; }
	public void setList_DESCRIPTION_EN(List list) { l_DESCRIPTION_EN = list; }
	public void setList_h_CHANGEABLE_TYP(List list) { l_h_CHANGEABLE_TYP = list; }
	public void setList_h_MODIFY_COUNT(List list) { l_h_MODIFY_COUNT = list; }
	public void setList_s_NAME(List list) { l_s_NAME = list; }

	public int setL2L_h_VALUE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_VALUE == null) {
			l_h_VALUE = new ArrayList();
		} else {
			l_h_VALUE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_VALUE.add(((AN0040010Struct) list.get(i)).geth_VALUE());
		}
		return size;
	}
	public int setL2L_h_DESCRIPTION(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_DESCRIPTION == null) {
			l_h_DESCRIPTION = new ArrayList();
		} else {
			l_h_DESCRIPTION.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_DESCRIPTION.add(((AN0040010Struct) list.get(i)).geth_DESCRIPTION());
		}
		return size;
	}
	public int setL2L_h_DESCRIPTION_EN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_DESCRIPTION_EN == null) {
			l_h_DESCRIPTION_EN = new ArrayList();
		} else {
			l_h_DESCRIPTION_EN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_DESCRIPTION_EN.add(((AN0040010Struct) list.get(i)).geth_DESCRIPTION_EN());
		}
		return size;
	}
	public int setL2L_l_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_NAME == null) {
			l_l_NAME = new ArrayList();
		} else {
			l_l_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_NAME.add(((AN0040010Struct) list.get(i)).getl_NAME());
		}
		return size;
	}
	public int setL2L_VALUE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VALUE == null) {
			l_VALUE = new ArrayList();
		} else {
			l_VALUE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VALUE.add(((AN0040010Struct) list.get(i)).getVALUE());
		}
		return size;
	}
	public int setL2L_DESCRIPTION(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DESCRIPTION == null) {
			l_DESCRIPTION = new ArrayList();
		} else {
			l_DESCRIPTION.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DESCRIPTION.add(((AN0040010Struct) list.get(i)).getDESCRIPTION());
		}
		return size;
	}
	public int setL2L_DESCRIPTION_EN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DESCRIPTION_EN == null) {
			l_DESCRIPTION_EN = new ArrayList();
		} else {
			l_DESCRIPTION_EN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DESCRIPTION_EN.add(((AN0040010Struct) list.get(i)).getDESCRIPTION_EN());
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
			l_h_CHANGEABLE_TYP.add(((AN0040010Struct) list.get(i)).geth_CHANGEABLE_TYP());
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
			l_h_MODIFY_COUNT.add(((AN0040010Struct) list.get(i)).geth_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_s_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_NAME == null) {
			l_s_NAME = new ArrayList();
		} else {
			l_s_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_NAME.add(((AN0040010Struct) list.get(i)).gets_NAME());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_h_VALUE = null;
		m_h_DESCRIPTION = null;
		m_h_DESCRIPTION_EN = null;
		m_l_NAME = null;
		m_VALUE = null;
		m_DESCRIPTION = null;
		m_DESCRIPTION_EN = null;
		m_h_CHANGEABLE_TYP = null;
		m_h_MODIFY_COUNT = null;
		m_s_NAME = null;

		l_h_VALUE = null;
		l_h_DESCRIPTION = null;
		l_h_DESCRIPTION_EN = null;
		l_l_NAME = null;
		l_VALUE = null;
		l_DESCRIPTION = null;
		l_DESCRIPTION_EN = null;
		l_h_CHANGEABLE_TYP = null;
		l_h_MODIFY_COUNT = null;
		l_s_NAME = null;

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
	 * medAN0040010�N���X�̕W���R���X�g���N�^
	 */
	public AN0040010Struct()
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
	public void setStruct(AN0040010Struct struct)
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
	public void setStructM(AN0040010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.seth_VALUE(struct.geth_VALUE());
			this.seth_DESCRIPTION(struct.geth_DESCRIPTION());
			this.seth_DESCRIPTION_EN(struct.geth_DESCRIPTION_EN());
			this.setl_NAME(struct.getl_NAME());
			this.setVALUE(struct.getVALUE());
			this.setDESCRIPTION(struct.getDESCRIPTION());
			this.setDESCRIPTION_EN(struct.getDESCRIPTION_EN());
			this.seth_CHANGEABLE_TYP(struct.geth_CHANGEABLE_TYP());
			this.seth_MODIFY_COUNT(struct.geth_MODIFY_COUNT());
			this.sets_NAME(struct.gets_NAME());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AN0040010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_h_VALUE(struct.getList_h_VALUE());
			this.setList_h_DESCRIPTION(struct.getList_h_DESCRIPTION());
			this.setList_h_DESCRIPTION_EN(struct.getList_h_DESCRIPTION_EN());
			this.setList_l_NAME(struct.getList_l_NAME());
			this.setList_VALUE(struct.getList_VALUE());
			this.setList_DESCRIPTION(struct.getList_DESCRIPTION());
			this.setList_DESCRIPTION_EN(struct.getList_DESCRIPTION_EN());
			this.setList_h_CHANGEABLE_TYP(struct.getList_h_CHANGEABLE_TYP());
			this.setList_h_MODIFY_COUNT(struct.getList_h_MODIFY_COUNT());
			this.setList_s_NAME(struct.getList_s_NAME());
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
	// �� 1 �ϐ������l�F i_h_VALUE


	final static String i_h_VALUE = null;

	// �� 2 �ϐ������l�F i_h_DESCRIPTION


	final static String i_h_DESCRIPTION = null;

	// �� 3 �ϐ������l�F i_h_DESCRIPTION_EN


	final static String i_h_DESCRIPTION_EN = null;

	// �� 4 �ϐ������l�F i_l_NAME


	final static String i_l_NAME = null;

	// �� 5 �ϐ������l�F i_VALUE


	final static String i_VALUE = null;

	// �� 6 �ϐ������l�F i_DESCRIPTION


	final static String i_DESCRIPTION = null;

	// �� 7 �ϐ������l�F i_DESCRIPTION_EN


	final static String i_DESCRIPTION_EN = null;

	// �� 8 �ϐ������l�F i_h_CHANGEABLE_TYP


	final static String i_h_CHANGEABLE_TYP = null;

	// �� 9 �ϐ������l�F i_h_MODIFY_COUNT


	final static String i_h_MODIFY_COUNT = null;

	// �� 10 �ϐ������l�F i_s_NAME


	final static String i_s_NAME = null;

*/

	//{{user_implement_code
         // TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
         // �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
        // �� 1 �ϐ������l�F i_l_NAME
        final static String i_l_NAME = null;
        // �� 2 �ϐ������l�F i_VALUE
        final static String i_VALUE = null;
        // �� 3 �ϐ������l�F i_DESCRIPTION
        final static String i_DESCRIPTION = null;
        // �� 4 �ϐ������l�F i_h_CHANGEABLE_TYP
        final static String i_h_CHANGEABLE_TYP = null;
        // �� 5 �ϐ������l�F i_h_MODIFY_COUNT
        final static String i_h_MODIFY_COUNT = null;
        // �� 6 �ϐ������l�F i_s_NAME
        final static String i_s_NAME = null;
        // �� 7 �ϐ������l�F i_h_VALUE
        final static String i_h_VALUE = null;
        // �� 8 �ϐ������l�F i_h_DESCRIPTION
        final static String i_h_DESCRIPTION = null;
        // �� 9 �ϐ������l�F i_DESCRIPTION_EN
        final static String i_DESCRIPTION_EN = null;
        // �� 10 �ϐ������l�F i_h_DESCRIPTION_EN
        final static String i_h_DESCRIPTION_EN = null;
       
        /**
         * ������
         *
         */
        public void initialize()
        {
       
         clear();
       
         m_l_NAME = i_l_NAME;
         m_VALUE = i_VALUE;
         m_DESCRIPTION = i_DESCRIPTION;
         m_h_CHANGEABLE_TYP = i_h_CHANGEABLE_TYP;
         m_h_MODIFY_COUNT = i_h_MODIFY_COUNT;
         m_s_NAME = i_s_NAME;
         m_h_VALUE = i_h_VALUE;
         m_h_DESCRIPTION = i_h_DESCRIPTION;
         m_DESCRIPTION_EN = i_DESCRIPTION_EN;
         m_h_DESCRIPTION_EN = i_h_DESCRIPTION_EN;
        }
       
         // TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
