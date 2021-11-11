/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AL0060/src/com/nec/jp/orteus/metamorBase/AL0060/AL0060010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AL0060;

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

public class AL0060010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_LOAD_CALC_FROM */
	public String m_LOAD_CALC_FROM = null;
	/** �� 2 �ϐ��F m_LOAD_CALC_TO */
	public String m_LOAD_CALC_TO = null;
	/** �� 3 �ϐ��F m_h_PLANT_CD */
	public String m_h_PLANT_CD = null;
	/** �� 4 �ϐ��F m_h_LOAD_CALC */
	public String m_h_LOAD_CALC = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_LOAD_CALC_FROM */
	public List l_LOAD_CALC_FROM = null;

	/** �� 2 List�ϐ��F l_LOAD_CALC_TO */
	public List l_LOAD_CALC_TO = null;

	/** �� 3 List�ϐ��F l_h_PLANT_CD */
	public List l_h_PLANT_CD = null;

	/** �� 4 List�ϐ��F l_h_LOAD_CALC */
	public List l_h_LOAD_CALC = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getLOAD_CALC_FROM() { return m_LOAD_CALC_FROM; }
	public String getLOAD_CALC_TO() { return m_LOAD_CALC_TO; }
	public String geth_PLANT_CD() { return m_h_PLANT_CD; }
	public String geth_LOAD_CALC() { return m_h_LOAD_CALC; }

	public List getList_LOAD_CALC_FROM() { return l_LOAD_CALC_FROM; }
	public List getList_LOAD_CALC_TO() { return l_LOAD_CALC_TO; }
	public List getList_h_PLANT_CD() { return l_h_PLANT_CD; }
	public List getList_h_LOAD_CALC() { return l_h_LOAD_CALC; }

	public void setLOAD_CALC_FROM(String val) { m_LOAD_CALC_FROM = val; }
	public void setLOAD_CALC_TO(String val) { m_LOAD_CALC_TO = val; }
	public void seth_PLANT_CD(String val) { m_h_PLANT_CD = val; }
	public void seth_LOAD_CALC(String val) { m_h_LOAD_CALC = val; }


	public void setList_LOAD_CALC_FROM(List list) { l_LOAD_CALC_FROM = list; }
	public void setList_LOAD_CALC_TO(List list) { l_LOAD_CALC_TO = list; }
	public void setList_h_PLANT_CD(List list) { l_h_PLANT_CD = list; }
	public void setList_h_LOAD_CALC(List list) { l_h_LOAD_CALC = list; }

	public int setL2L_LOAD_CALC_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_CALC_FROM == null) {
			l_LOAD_CALC_FROM = new ArrayList();
		} else {
			l_LOAD_CALC_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_CALC_FROM.add(((AL0060010Struct) list.get(i)).getLOAD_CALC_FROM());
		}
		return size;
	}
	public int setL2L_LOAD_CALC_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_CALC_TO == null) {
			l_LOAD_CALC_TO = new ArrayList();
		} else {
			l_LOAD_CALC_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_CALC_TO.add(((AL0060010Struct) list.get(i)).getLOAD_CALC_TO());
		}
		return size;
	}
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
			l_h_PLANT_CD.add(((AL0060010Struct) list.get(i)).geth_PLANT_CD());
		}
		return size;
	}
	public int setL2L_h_LOAD_CALC(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_LOAD_CALC == null) {
			l_h_LOAD_CALC = new ArrayList();
		} else {
			l_h_LOAD_CALC.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_LOAD_CALC.add(((AL0060010Struct) list.get(i)).geth_LOAD_CALC());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_LOAD_CALC_FROM = null;
		m_LOAD_CALC_TO = null;
		m_h_PLANT_CD = null;
		m_h_LOAD_CALC = null;

		l_LOAD_CALC_FROM = null;
		l_LOAD_CALC_TO = null;
		l_h_PLANT_CD = null;
		l_h_LOAD_CALC = null;

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
	 * medAL0060010�N���X�̕W���R���X�g���N�^
	 */
	public AL0060010Struct()
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
	public void setStruct(AL0060010Struct struct)
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
	public void setStructM(AL0060010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setLOAD_CALC_FROM(struct.getLOAD_CALC_FROM());
			this.setLOAD_CALC_TO(struct.getLOAD_CALC_TO());
			this.seth_PLANT_CD(struct.geth_PLANT_CD());
			this.seth_LOAD_CALC(struct.geth_LOAD_CALC());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AL0060010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_LOAD_CALC_FROM(struct.getList_LOAD_CALC_FROM());
			this.setList_LOAD_CALC_TO(struct.getList_LOAD_CALC_TO());
			this.setList_h_PLANT_CD(struct.getList_h_PLANT_CD());
			this.setList_h_LOAD_CALC(struct.getList_h_LOAD_CALC());
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
	// �� 1 �ϐ������l�F i_LOAD_CALC_FROM


	final static String i_LOAD_CALC_FROM = null;

	// �� 2 �ϐ������l�F i_LOAD_CALC_TO


	final static String i_LOAD_CALC_TO = null;

	// �� 3 �ϐ������l�F i_h_PLANT_CD


	final static String i_h_PLANT_CD = null;

	// �� 4 �ϐ������l�F i_h_LOAD_CALC


	final static String i_h_LOAD_CALC = null;

*/

	//{{user_implement_code
        //////////////////////////////
        // �����l��`
       
         // TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
        /** �� 1 �ϐ������l�F i_LOAD_CALC_FROM */
        final static String i_LOAD_CALC_FROM = null;
        /** �� 2 �ϐ������l�F i_LOAD_CALC_TO */
        final static String i_LOAD_CALC_TO = null;
       
        /**
         * ������
         *
         */
        public void initialize()
        {
         m_LOAD_CALC_FROM = i_LOAD_CALC_FROM;
         m_LOAD_CALC_TO = i_LOAD_CALC_TO;
       
         l_LOAD_CALC_FROM = null;
         l_LOAD_CALC_TO = null;
        }
       
         // TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
