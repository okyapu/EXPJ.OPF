/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0080/src/com/nec/jp/orteus/metamorBase/AA0080/AA0080010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0080;

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

public class AA0080010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_h_CAL_NO */
	public String m_h_CAL_NO = null;
	/** �� 2 �ϐ��F m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** �� 3 �ϐ��F m_CAL_NO */
	public String m_CAL_NO = null;
	/** �� 4 �ϐ��F m_CAL_NAME */
	public String m_CAL_NAME = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_h_CAL_NO */
	public List l_h_CAL_NO = null;

	/** �� 2 List�ϐ��F l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** �� 3 List�ϐ��F l_CAL_NO */
	public List l_CAL_NO = null;

	/** �� 4 List�ϐ��F l_CAL_NAME */
	public List l_CAL_NAME = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String geth_CAL_NO() { return m_h_CAL_NO; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getCAL_NO() { return m_CAL_NO; }
	public String getCAL_NAME() { return m_CAL_NAME; }

	public List getList_h_CAL_NO() { return l_h_CAL_NO; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_CAL_NO() { return l_CAL_NO; }
	public List getList_CAL_NAME() { return l_CAL_NAME; }

	public void seth_CAL_NO(String val) { m_h_CAL_NO = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setCAL_NO(String val) { m_CAL_NO = val; }
	public void setCAL_NAME(String val) { m_CAL_NAME = val; }


	public void setList_h_CAL_NO(List list) { l_h_CAL_NO = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_CAL_NO(List list) { l_CAL_NO = list; }
	public void setList_CAL_NAME(List list) { l_CAL_NAME = list; }

	public int setL2L_h_CAL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_CAL_NO == null) {
			l_h_CAL_NO = new ArrayList();
		} else {
			l_h_CAL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_CAL_NO.add(((AA0080010Struct) list.get(i)).geth_CAL_NO());
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
			l_MODIFY_COUNT.add(((AA0080010Struct) list.get(i)).getMODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_CAL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CAL_NO == null) {
			l_CAL_NO = new ArrayList();
		} else {
			l_CAL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CAL_NO.add(((AA0080010Struct) list.get(i)).getCAL_NO());
		}
		return size;
	}
	public int setL2L_CAL_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CAL_NAME == null) {
			l_CAL_NAME = new ArrayList();
		} else {
			l_CAL_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CAL_NAME.add(((AA0080010Struct) list.get(i)).getCAL_NAME());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_h_CAL_NO = null;
		m_MODIFY_COUNT = null;
		m_CAL_NO = null;
		m_CAL_NAME = null;

		l_h_CAL_NO = null;
		l_MODIFY_COUNT = null;
		l_CAL_NO = null;
		l_CAL_NAME = null;

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
	 * medAA0080010�N���X�̕W���R���X�g���N�^
	 */
	public AA0080010Struct()
	{
		//{{user_implement_code_constractor
                //---------------------------------------------------------------------
                m_CAL_NO = new String("0");
              
                //---------------------------------------------------------------------
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
	public void setStruct(AA0080010Struct struct)
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
	public void setStructM(AA0080010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.seth_CAL_NO(struct.geth_CAL_NO());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setCAL_NO(struct.getCAL_NO());
			this.setCAL_NAME(struct.getCAL_NAME());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AA0080010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_h_CAL_NO(struct.getList_h_CAL_NO());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_CAL_NO(struct.getList_CAL_NO());
			this.setList_CAL_NAME(struct.getList_CAL_NAME());
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
	// �� 1 �ϐ������l�F i_h_CAL_NO


	final static String i_h_CAL_NO = null;

	// �� 2 �ϐ������l�F i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// �� 3 �ϐ������l�F i_CAL_NO


	final static String i_CAL_NO = null;

	// �� 4 �ϐ������l�F i_CAL_NAME


	final static String i_CAL_NAME = null;

*/

	//{{user_implement_code
       
        /**
         * �R�s�[�R���X�g���N�^
         * @param struct �R�s�[�Ώ�
         */
         public AA0080010Struct(AA0080010Struct struct)
         {
          setStructM(struct);
         }
       
        //}}user_implement_code

	//////////////////////////////

}
