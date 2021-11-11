/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AH0010/src/com/nec/jp/orteus/metamorBase/AH0010/AH0010010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AH0010;

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

public class AH0010010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 2 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 3 �ϐ��F m_h_RADIO_TYPE */
	public String m_h_RADIO_TYPE = null;
	/** �� 4 �ϐ��F m_r_PLANT_TYPE1 */
	public String m_r_PLANT_TYPE1 = null;
	/** �� 5 �ϐ��F m_r_PLANT_TYPE2 */
	public String m_r_PLANT_TYPE2 = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 2 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 3 List�ϐ��F l_h_RADIO_TYPE */
	public List l_h_RADIO_TYPE = null;

	/** �� 4 List�ϐ��F l_r_PLANT_TYPE1 */
	public List l_r_PLANT_TYPE1 = null;

	/** �� 5 List�ϐ��F l_r_PLANT_TYPE2 */
	public List l_r_PLANT_TYPE2 = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getITEM_CD() { return m_ITEM_CD; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String geth_RADIO_TYPE() { return m_h_RADIO_TYPE; }
	public String getr_PLANT_TYPE1() { return m_r_PLANT_TYPE1; }
	public String getr_PLANT_TYPE2() { return m_r_PLANT_TYPE2; }

	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_h_RADIO_TYPE() { return l_h_RADIO_TYPE; }
	public List getList_r_PLANT_TYPE1() { return l_r_PLANT_TYPE1; }
	public List getList_r_PLANT_TYPE2() { return l_r_PLANT_TYPE2; }

	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void seth_RADIO_TYPE(String val) { m_h_RADIO_TYPE = val; }
	public void setr_PLANT_TYPE1(String val) { m_r_PLANT_TYPE1 = val; }
	public void setr_PLANT_TYPE2(String val) { m_r_PLANT_TYPE2 = val; }


	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_h_RADIO_TYPE(List list) { l_h_RADIO_TYPE = list; }
	public void setList_r_PLANT_TYPE1(List list) { l_r_PLANT_TYPE1 = list; }
	public void setList_r_PLANT_TYPE2(List list) { l_r_PLANT_TYPE2 = list; }

	public int setL2L_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CD == null) {
			l_ITEM_CD = new ArrayList();
		} else {
			l_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CD.add(((AH0010010Struct) list.get(i)).getITEM_CD());
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
			l_PLANT_CD.add(((AH0010010Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_h_RADIO_TYPE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_RADIO_TYPE == null) {
			l_h_RADIO_TYPE = new ArrayList();
		} else {
			l_h_RADIO_TYPE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_RADIO_TYPE.add(((AH0010010Struct) list.get(i)).geth_RADIO_TYPE());
		}
		return size;
	}
	public int setL2L_r_PLANT_TYPE1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r_PLANT_TYPE1 == null) {
			l_r_PLANT_TYPE1 = new ArrayList();
		} else {
			l_r_PLANT_TYPE1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r_PLANT_TYPE1.add(((AH0010010Struct) list.get(i)).getr_PLANT_TYPE1());
		}
		return size;
	}
	public int setL2L_r_PLANT_TYPE2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r_PLANT_TYPE2 == null) {
			l_r_PLANT_TYPE2 = new ArrayList();
		} else {
			l_r_PLANT_TYPE2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r_PLANT_TYPE2.add(((AH0010010Struct) list.get(i)).getr_PLANT_TYPE2());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_ITEM_CD = null;
		m_PLANT_CD = null;
		m_h_RADIO_TYPE = null;
		m_r_PLANT_TYPE1 = null;
		m_r_PLANT_TYPE2 = null;

		l_ITEM_CD = null;
		l_PLANT_CD = null;
		l_h_RADIO_TYPE = null;
		l_r_PLANT_TYPE1 = null;
		l_r_PLANT_TYPE2 = null;

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
	 * medAH0010010�N���X�̕W���R���X�g���N�^
	 */
	public AH0010010Struct()
	{
		//{{user_implement_code_constractor
                 
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
	public void setStruct(AH0010010Struct struct)
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
	public void setStructM(AH0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setITEM_CD(struct.getITEM_CD());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.seth_RADIO_TYPE(struct.geth_RADIO_TYPE());
			this.setr_PLANT_TYPE1(struct.getr_PLANT_TYPE1());
			this.setr_PLANT_TYPE2(struct.getr_PLANT_TYPE2());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AH0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_h_RADIO_TYPE(struct.getList_h_RADIO_TYPE());
			this.setList_r_PLANT_TYPE1(struct.getList_r_PLANT_TYPE1());
			this.setList_r_PLANT_TYPE2(struct.getList_r_PLANT_TYPE2());
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
	// �� 1 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 2 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 3 �ϐ������l�F i_h_RADIO_TYPE


	final static String i_h_RADIO_TYPE = null;

	// �� 4 �ϐ������l�F i_r_PLANT_TYPE1


	final static String i_r_PLANT_TYPE1 = null;

	// �� 5 �ϐ������l�F i_r_PLANT_TYPE2


	final static String i_r_PLANT_TYPE2 = null;

*/

	//{{user_implement_code
        //------------------------------------------------------------------------------
       
        /**
         * ������
         */
        public void init()
        {
         m_h_RADIO_TYPE = "1";
         m_r_PLANT_TYPE1 = null;		// ���W�I�����I��l�i�S�H��j
         m_r_PLANT_TYPE2 = "true";	// ���W�I�����I��l�i���H��j
        }
         
        //------------------------------------------------------------------------------
        //}}user_implement_code

	//////////////////////////////

}
