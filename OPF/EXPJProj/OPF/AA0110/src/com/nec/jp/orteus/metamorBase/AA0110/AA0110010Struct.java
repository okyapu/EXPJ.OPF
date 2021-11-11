/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0110/src/com/nec/jp/orteus/metamorBase/AA0110/AA0110010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0110;

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

public class AA0110010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_h_CUR_CD */
	public String m_h_CUR_CD = null;
	/** �� 2 �ϐ��F m_CUR_CD */
	public String m_CUR_CD = null;
	/** �� 3 �ϐ��F m_CUR_UNIT */
	public String m_CUR_UNIT = null;
	/** �� 4 �ϐ��F m_CUR_NAME */
	public String m_CUR_NAME = null;
	/** �� 5 �ϐ��F m_CUR_SYMBOL */
	public String m_CUR_SYMBOL = null;
	/** �� 6 �ϐ��F m_DECIMAL_FIG */
	public String m_DECIMAL_FIG = null;
	/** �� 7 �ϐ��F m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_h_CUR_CD */
	public List l_h_CUR_CD = null;

	/** �� 2 List�ϐ��F l_CUR_CD */
	public List l_CUR_CD = null;

	/** �� 3 List�ϐ��F l_CUR_UNIT */
	public List l_CUR_UNIT = null;

	/** �� 4 List�ϐ��F l_CUR_NAME */
	public List l_CUR_NAME = null;

	/** �� 5 List�ϐ��F l_CUR_SYMBOL */
	public List l_CUR_SYMBOL = null;

	/** �� 6 List�ϐ��F l_DECIMAL_FIG */
	public List l_DECIMAL_FIG = null;

	/** �� 7 List�ϐ��F l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String geth_CUR_CD() { return m_h_CUR_CD; }
	public String getCUR_CD() { return m_CUR_CD; }
	public String getCUR_UNIT() { return m_CUR_UNIT; }
	public String getCUR_NAME() { return m_CUR_NAME; }
	public String getCUR_SYMBOL() { return m_CUR_SYMBOL; }
	public String getDECIMAL_FIG() { return m_DECIMAL_FIG; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }

	public List getList_h_CUR_CD() { return l_h_CUR_CD; }
	public List getList_CUR_CD() { return l_CUR_CD; }
	public List getList_CUR_UNIT() { return l_CUR_UNIT; }
	public List getList_CUR_NAME() { return l_CUR_NAME; }
	public List getList_CUR_SYMBOL() { return l_CUR_SYMBOL; }
	public List getList_DECIMAL_FIG() { return l_DECIMAL_FIG; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }

	public void seth_CUR_CD(String val) { m_h_CUR_CD = val; }
	public void setCUR_CD(String val) { m_CUR_CD = val; }
	public void setCUR_UNIT(String val) { m_CUR_UNIT = val; }
	public void setCUR_NAME(String val) { m_CUR_NAME = val; }
	public void setCUR_SYMBOL(String val) { m_CUR_SYMBOL = val; }
	public void setDECIMAL_FIG(String val) { m_DECIMAL_FIG = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }


	public void setList_h_CUR_CD(List list) { l_h_CUR_CD = list; }
	public void setList_CUR_CD(List list) { l_CUR_CD = list; }
	public void setList_CUR_UNIT(List list) { l_CUR_UNIT = list; }
	public void setList_CUR_NAME(List list) { l_CUR_NAME = list; }
	public void setList_CUR_SYMBOL(List list) { l_CUR_SYMBOL = list; }
	public void setList_DECIMAL_FIG(List list) { l_DECIMAL_FIG = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }

	public int setL2L_h_CUR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_CUR_CD == null) {
			l_h_CUR_CD = new ArrayList();
		} else {
			l_h_CUR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_CUR_CD.add(((AA0110010Struct) list.get(i)).geth_CUR_CD());
		}
		return size;
	}
	public int setL2L_CUR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUR_CD == null) {
			l_CUR_CD = new ArrayList();
		} else {
			l_CUR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUR_CD.add(((AA0110010Struct) list.get(i)).getCUR_CD());
		}
		return size;
	}
	public int setL2L_CUR_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUR_UNIT == null) {
			l_CUR_UNIT = new ArrayList();
		} else {
			l_CUR_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUR_UNIT.add(((AA0110010Struct) list.get(i)).getCUR_UNIT());
		}
		return size;
	}
	public int setL2L_CUR_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUR_NAME == null) {
			l_CUR_NAME = new ArrayList();
		} else {
			l_CUR_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUR_NAME.add(((AA0110010Struct) list.get(i)).getCUR_NAME());
		}
		return size;
	}
	public int setL2L_CUR_SYMBOL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUR_SYMBOL == null) {
			l_CUR_SYMBOL = new ArrayList();
		} else {
			l_CUR_SYMBOL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUR_SYMBOL.add(((AA0110010Struct) list.get(i)).getCUR_SYMBOL());
		}
		return size;
	}
	public int setL2L_DECIMAL_FIG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DECIMAL_FIG == null) {
			l_DECIMAL_FIG = new ArrayList();
		} else {
			l_DECIMAL_FIG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DECIMAL_FIG.add(((AA0110010Struct) list.get(i)).getDECIMAL_FIG());
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
			l_MODIFY_COUNT.add(((AA0110010Struct) list.get(i)).getMODIFY_COUNT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_h_CUR_CD = null;
		m_CUR_CD = null;
		m_CUR_UNIT = null;
		m_CUR_NAME = null;
		m_CUR_SYMBOL = null;
		m_DECIMAL_FIG = null;
		m_MODIFY_COUNT = null;

		l_h_CUR_CD = null;
		l_CUR_CD = null;
		l_CUR_UNIT = null;
		l_CUR_NAME = null;
		l_CUR_SYMBOL = null;
		l_DECIMAL_FIG = null;
		l_MODIFY_COUNT = null;

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
	 * medAA0110010�N���X�̕W���R���X�g���N�^
	 */
	public AA0110010Struct()
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
	public void setStruct(AA0110010Struct struct)
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
	public void setStructM(AA0110010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.seth_CUR_CD(struct.geth_CUR_CD());
			this.setCUR_CD(struct.getCUR_CD());
			this.setCUR_UNIT(struct.getCUR_UNIT());
			this.setCUR_NAME(struct.getCUR_NAME());
			this.setCUR_SYMBOL(struct.getCUR_SYMBOL());
			this.setDECIMAL_FIG(struct.getDECIMAL_FIG());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AA0110010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_h_CUR_CD(struct.getList_h_CUR_CD());
			this.setList_CUR_CD(struct.getList_CUR_CD());
			this.setList_CUR_UNIT(struct.getList_CUR_UNIT());
			this.setList_CUR_NAME(struct.getList_CUR_NAME());
			this.setList_CUR_SYMBOL(struct.getList_CUR_SYMBOL());
			this.setList_DECIMAL_FIG(struct.getList_DECIMAL_FIG());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
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
	// �� 1 �ϐ������l�F i_h_CUR_CD


	final static String i_h_CUR_CD = null;

	// �� 2 �ϐ������l�F i_CUR_CD


	final static String i_CUR_CD = null;

	// �� 3 �ϐ������l�F i_CUR_UNIT


	final static String i_CUR_UNIT = null;

	// �� 4 �ϐ������l�F i_CUR_NAME


	final static String i_CUR_NAME = null;

	// �� 5 �ϐ������l�F i_CUR_SYMBOL


	final static String i_CUR_SYMBOL = null;

	// �� 6 �ϐ������l�F i_DECIMAL_FIG


	final static String i_DECIMAL_FIG = null;

	// �� 7 �ϐ������l�F i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

*/

	//{{user_implement_code
         // TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
         // �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
        // �� 1 �ϐ������l�F i_CUR_CD
        final static String i_CUR_CD = null;
        // �� 2 �ϐ������l�F i_CUR_UNIT
        final static String i_CUR_UNIT = null;
        // �� 3 �ϐ������l�F i_CUR_NAME
        final static String i_CUR_NAME = null;
        // �� 4 �ϐ������l�F i_CUR_SYMBOL
        final static String i_CUR_SYMBOL = null;
        // �� 5 �ϐ������l�F i_DECIMAL_FIG
        final static String i_DECIMAL_FIG = null;
        // �� 6 �ϐ������l�F i_MODIFY_COUNT
        final static String i_MODIFY_COUNT = null;
        // �� 7 �ϐ������l�F i_h_CUR_CD
        final static String i_h_CUR_CD = null;
       
        /**
         * ������
         *
         */
        public void initialize()
        {
       
         clear();
       
         m_CUR_CD = i_CUR_CD;
         m_CUR_UNIT = i_CUR_UNIT;
         m_CUR_NAME = i_CUR_NAME;
         m_CUR_SYMBOL = i_CUR_SYMBOL;
         m_DECIMAL_FIG = i_DECIMAL_FIG;
         m_MODIFY_COUNT = i_MODIFY_COUNT;
         m_h_CUR_CD = i_h_CUR_CD;
        }
       
         // TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
