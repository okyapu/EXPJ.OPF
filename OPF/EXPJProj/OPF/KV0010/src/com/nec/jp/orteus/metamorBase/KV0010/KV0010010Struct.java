/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KV0010/src/com/nec/jp/orteus/metamorBase/KV0010/KV0010010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.KV0010;

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

public class KV0010010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_rdoPlantTyp1 */
	public String m_rdoPlantTyp1 = null;
	/** �� 2 �ϐ��F m_rdoPlantTyp2 */
	public String m_rdoPlantTyp2 = null;
	/** �� 3 �ϐ��F m_rdoPlantTyp3 */
	public String m_rdoPlantTyp3 = null;
	/** �� 4 �ϐ��F m_rdoPlantTyp4 */
	public String m_rdoPlantTyp4 = null;
	/** �� 5 �ϐ��F m_rdoPlantTyp5 */
	public String m_rdoPlantTyp5 = null;
	/** �� 6 �ϐ��F m_g_DIRECT_DLV_FLG */
	public String m_g_DIRECT_DLV_FLG = null;
	/** �� 7 �ϐ��F m_rdoPlantTyp6 */
	public String m_rdoPlantTyp6 = null;
	/** �� 8 �ϐ��F m_rdoPlantTyp7 */
	public String m_rdoPlantTyp7 = null;
	/** �� 9 �ϐ��F m_rdoPlantTyp8 */
	public String m_rdoPlantTyp8 = null;
	/** �� 10 �ϐ��F m_rdoPlantTyp9 */
	public String m_rdoPlantTyp9 = null;
	/** �� 11 �ϐ��F m_my_COMPANY_CD */
	public String m_my_COMPANY_CD = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_rdoPlantTyp1 */
	public List l_rdoPlantTyp1 = null;

	/** �� 2 List�ϐ��F l_rdoPlantTyp2 */
	public List l_rdoPlantTyp2 = null;

	/** �� 3 List�ϐ��F l_rdoPlantTyp3 */
	public List l_rdoPlantTyp3 = null;

	/** �� 4 List�ϐ��F l_rdoPlantTyp4 */
	public List l_rdoPlantTyp4 = null;

	/** �� 5 List�ϐ��F l_rdoPlantTyp5 */
	public List l_rdoPlantTyp5 = null;

	/** �� 6 List�ϐ��F l_g_DIRECT_DLV_FLG */
	public List l_g_DIRECT_DLV_FLG = null;

	/** �� 7 List�ϐ��F l_rdoPlantTyp6 */
	public List l_rdoPlantTyp6 = null;

	/** �� 8 List�ϐ��F l_rdoPlantTyp7 */
	public List l_rdoPlantTyp7 = null;

	/** �� 9 List�ϐ��F l_rdoPlantTyp8 */
	public List l_rdoPlantTyp8 = null;

	/** �� 10 List�ϐ��F l_rdoPlantTyp9 */
	public List l_rdoPlantTyp9 = null;

	/** �� 11 List�ϐ��F l_my_COMPANY_CD */
	public List l_my_COMPANY_CD = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getrdoPlantTyp1() { return m_rdoPlantTyp1; }
	public String getrdoPlantTyp2() { return m_rdoPlantTyp2; }
	public String getrdoPlantTyp3() { return m_rdoPlantTyp3; }
	public String getrdoPlantTyp4() { return m_rdoPlantTyp4; }
	public String getrdoPlantTyp5() { return m_rdoPlantTyp5; }
	public String getg_DIRECT_DLV_FLG() { return m_g_DIRECT_DLV_FLG; }
	public String getrdoPlantTyp6() { return m_rdoPlantTyp6; }
	public String getrdoPlantTyp7() { return m_rdoPlantTyp7; }
	public String getrdoPlantTyp8() { return m_rdoPlantTyp8; }
	public String getrdoPlantTyp9() { return m_rdoPlantTyp9; }
	public String getmy_COMPANY_CD() { return m_my_COMPANY_CD; }

	public List getList_rdoPlantTyp1() { return l_rdoPlantTyp1; }
	public List getList_rdoPlantTyp2() { return l_rdoPlantTyp2; }
	public List getList_rdoPlantTyp3() { return l_rdoPlantTyp3; }
	public List getList_rdoPlantTyp4() { return l_rdoPlantTyp4; }
	public List getList_rdoPlantTyp5() { return l_rdoPlantTyp5; }
	public List getList_g_DIRECT_DLV_FLG() { return l_g_DIRECT_DLV_FLG; }
	public List getList_rdoPlantTyp6() { return l_rdoPlantTyp6; }
	public List getList_rdoPlantTyp7() { return l_rdoPlantTyp7; }
	public List getList_rdoPlantTyp8() { return l_rdoPlantTyp8; }
	public List getList_rdoPlantTyp9() { return l_rdoPlantTyp9; }
	public List getList_my_COMPANY_CD() { return l_my_COMPANY_CD; }

	public void setrdoPlantTyp1(String val) { m_rdoPlantTyp1 = val; }
	public void setrdoPlantTyp2(String val) { m_rdoPlantTyp2 = val; }
	public void setrdoPlantTyp3(String val) { m_rdoPlantTyp3 = val; }
	public void setrdoPlantTyp4(String val) { m_rdoPlantTyp4 = val; }
	public void setrdoPlantTyp5(String val) { m_rdoPlantTyp5 = val; }
	public void setg_DIRECT_DLV_FLG(String val) { m_g_DIRECT_DLV_FLG = val; }
	public void setrdoPlantTyp6(String val) { m_rdoPlantTyp6 = val; }
	public void setrdoPlantTyp7(String val) { m_rdoPlantTyp7 = val; }
	public void setrdoPlantTyp8(String val) { m_rdoPlantTyp8 = val; }
	public void setrdoPlantTyp9(String val) { m_rdoPlantTyp9 = val; }
	public void setmy_COMPANY_CD(String val) { m_my_COMPANY_CD = val; }


	public void setList_rdoPlantTyp1(List list) { l_rdoPlantTyp1 = list; }
	public void setList_rdoPlantTyp2(List list) { l_rdoPlantTyp2 = list; }
	public void setList_rdoPlantTyp3(List list) { l_rdoPlantTyp3 = list; }
	public void setList_rdoPlantTyp4(List list) { l_rdoPlantTyp4 = list; }
	public void setList_rdoPlantTyp5(List list) { l_rdoPlantTyp5 = list; }
	public void setList_g_DIRECT_DLV_FLG(List list) { l_g_DIRECT_DLV_FLG = list; }
	public void setList_rdoPlantTyp6(List list) { l_rdoPlantTyp6 = list; }
	public void setList_rdoPlantTyp7(List list) { l_rdoPlantTyp7 = list; }
	public void setList_rdoPlantTyp8(List list) { l_rdoPlantTyp8 = list; }
	public void setList_rdoPlantTyp9(List list) { l_rdoPlantTyp9 = list; }
	public void setList_my_COMPANY_CD(List list) { l_my_COMPANY_CD = list; }

	public int setL2L_rdoPlantTyp1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoPlantTyp1 == null) {
			l_rdoPlantTyp1 = new ArrayList();
		} else {
			l_rdoPlantTyp1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoPlantTyp1.add(((KV0010010Struct) list.get(i)).getrdoPlantTyp1());
		}
		return size;
	}
	public int setL2L_rdoPlantTyp2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoPlantTyp2 == null) {
			l_rdoPlantTyp2 = new ArrayList();
		} else {
			l_rdoPlantTyp2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoPlantTyp2.add(((KV0010010Struct) list.get(i)).getrdoPlantTyp2());
		}
		return size;
	}
	public int setL2L_rdoPlantTyp3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoPlantTyp3 == null) {
			l_rdoPlantTyp3 = new ArrayList();
		} else {
			l_rdoPlantTyp3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoPlantTyp3.add(((KV0010010Struct) list.get(i)).getrdoPlantTyp3());
		}
		return size;
	}
	public int setL2L_rdoPlantTyp4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoPlantTyp4 == null) {
			l_rdoPlantTyp4 = new ArrayList();
		} else {
			l_rdoPlantTyp4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoPlantTyp4.add(((KV0010010Struct) list.get(i)).getrdoPlantTyp4());
		}
		return size;
	}
	public int setL2L_rdoPlantTyp5(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoPlantTyp5 == null) {
			l_rdoPlantTyp5 = new ArrayList();
		} else {
			l_rdoPlantTyp5.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoPlantTyp5.add(((KV0010010Struct) list.get(i)).getrdoPlantTyp5());
		}
		return size;
	}
	public int setL2L_g_DIRECT_DLV_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_g_DIRECT_DLV_FLG == null) {
			l_g_DIRECT_DLV_FLG = new ArrayList();
		} else {
			l_g_DIRECT_DLV_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_g_DIRECT_DLV_FLG.add(((KV0010010Struct) list.get(i)).getg_DIRECT_DLV_FLG());
		}
		return size;
	}
	public int setL2L_rdoPlantTyp6(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoPlantTyp6 == null) {
			l_rdoPlantTyp6 = new ArrayList();
		} else {
			l_rdoPlantTyp6.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoPlantTyp6.add(((KV0010010Struct) list.get(i)).getrdoPlantTyp6());
		}
		return size;
	}
	public int setL2L_rdoPlantTyp7(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoPlantTyp7 == null) {
			l_rdoPlantTyp7 = new ArrayList();
		} else {
			l_rdoPlantTyp7.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoPlantTyp7.add(((KV0010010Struct) list.get(i)).getrdoPlantTyp7());
		}
		return size;
	}
	public int setL2L_rdoPlantTyp8(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoPlantTyp8 == null) {
			l_rdoPlantTyp8 = new ArrayList();
		} else {
			l_rdoPlantTyp8.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoPlantTyp8.add(((KV0010010Struct) list.get(i)).getrdoPlantTyp8());
		}
		return size;
	}
	public int setL2L_rdoPlantTyp9(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoPlantTyp9 == null) {
			l_rdoPlantTyp9 = new ArrayList();
		} else {
			l_rdoPlantTyp9.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoPlantTyp9.add(((KV0010010Struct) list.get(i)).getrdoPlantTyp9());
		}
		return size;
	}
	public int setL2L_my_COMPANY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_my_COMPANY_CD == null) {
			l_my_COMPANY_CD = new ArrayList();
		} else {
			l_my_COMPANY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_my_COMPANY_CD.add(((KV0010010Struct) list.get(i)).getmy_COMPANY_CD());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_rdoPlantTyp1 = null;
		m_rdoPlantTyp2 = null;
		m_rdoPlantTyp3 = null;
		m_rdoPlantTyp4 = null;
		m_rdoPlantTyp5 = null;
		m_g_DIRECT_DLV_FLG = null;
		m_rdoPlantTyp6 = null;
		m_rdoPlantTyp7 = null;
		m_rdoPlantTyp8 = null;
		m_rdoPlantTyp9 = null;
		m_my_COMPANY_CD = null;

		l_rdoPlantTyp1 = null;
		l_rdoPlantTyp2 = null;
		l_rdoPlantTyp3 = null;
		l_rdoPlantTyp4 = null;
		l_rdoPlantTyp5 = null;
		l_g_DIRECT_DLV_FLG = null;
		l_rdoPlantTyp6 = null;
		l_rdoPlantTyp7 = null;
		l_rdoPlantTyp8 = null;
		l_rdoPlantTyp9 = null;
		l_my_COMPANY_CD = null;

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
	 * medKV0010010�N���X�̕W���R���X�g���N�^
	 */
	public KV0010010Struct()
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
	public void setStruct(KV0010010Struct struct)
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
	public void setStructM(KV0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setrdoPlantTyp1(struct.getrdoPlantTyp1());
			this.setrdoPlantTyp2(struct.getrdoPlantTyp2());
			this.setrdoPlantTyp3(struct.getrdoPlantTyp3());
			this.setrdoPlantTyp4(struct.getrdoPlantTyp4());
			this.setrdoPlantTyp5(struct.getrdoPlantTyp5());
			this.setg_DIRECT_DLV_FLG(struct.getg_DIRECT_DLV_FLG());
			this.setrdoPlantTyp6(struct.getrdoPlantTyp6());
			this.setrdoPlantTyp7(struct.getrdoPlantTyp7());
			this.setrdoPlantTyp8(struct.getrdoPlantTyp8());
			this.setrdoPlantTyp9(struct.getrdoPlantTyp9());
			this.setmy_COMPANY_CD(struct.getmy_COMPANY_CD());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(KV0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_rdoPlantTyp1(struct.getList_rdoPlantTyp1());
			this.setList_rdoPlantTyp2(struct.getList_rdoPlantTyp2());
			this.setList_rdoPlantTyp3(struct.getList_rdoPlantTyp3());
			this.setList_rdoPlantTyp4(struct.getList_rdoPlantTyp4());
			this.setList_rdoPlantTyp5(struct.getList_rdoPlantTyp5());
			this.setList_g_DIRECT_DLV_FLG(struct.getList_g_DIRECT_DLV_FLG());
			this.setList_rdoPlantTyp6(struct.getList_rdoPlantTyp6());
			this.setList_rdoPlantTyp7(struct.getList_rdoPlantTyp7());
			this.setList_rdoPlantTyp8(struct.getList_rdoPlantTyp8());
			this.setList_rdoPlantTyp9(struct.getList_rdoPlantTyp9());
			this.setList_my_COMPANY_CD(struct.getList_my_COMPANY_CD());
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
	// �� 1 �ϐ������l�F i_rdoPlantTyp1


	final static String i_rdoPlantTyp1 = null;

	// �� 2 �ϐ������l�F i_rdoPlantTyp2


	final static String i_rdoPlantTyp2 = null;

	// �� 3 �ϐ������l�F i_rdoPlantTyp3


	final static String i_rdoPlantTyp3 = null;

	// �� 4 �ϐ������l�F i_rdoPlantTyp4


	final static String i_rdoPlantTyp4 = null;

	// �� 5 �ϐ������l�F i_rdoPlantTyp5


	final static String i_rdoPlantTyp5 = null;

	// �� 6 �ϐ������l�F i_g_DIRECT_DLV_FLG


	final static String i_g_DIRECT_DLV_FLG = null;

	// �� 7 �ϐ������l�F i_rdoPlantTyp6


	final static String i_rdoPlantTyp6 = null;

	// �� 8 �ϐ������l�F i_rdoPlantTyp7


	final static String i_rdoPlantTyp7 = null;

	// �� 9 �ϐ������l�F i_rdoPlantTyp8


	final static String i_rdoPlantTyp8 = null;

	// �� 10 �ϐ������l�F i_rdoPlantTyp9


	final static String i_rdoPlantTyp9 = null;

	// �� 11 �ϐ������l�F i_my_COMPANY_CD


	final static String i_my_COMPANY_CD = null;

*/

	//{{user_implement_code
         // TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
         // �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
        // �� 1 �ϐ������l�F i_my_COMPANY_CD
        final static String i_my_COMPANY_CD = null;
        // �� 2 �ϐ������l�F i_rdoPlantTyp1
        final static String i_rdoPlantTyp1 = null;
        // �� 3 �ϐ������l�F i_rdoPlantTyp2
        final static String i_rdoPlantTyp2 = null;
        // �� 4 �ϐ������l�F i_rdoPlantTyp3
        final static String i_rdoPlantTyp3 = null;
        // �� 5 �ϐ������l�F i_rdoPlantTyp4
        final static String i_rdoPlantTyp4 = null;
        // �� 6 �ϐ������l�F i_rdoPlantTyp5
        final static String i_rdoPlantTyp5 = null;
       
        /**
         * ������
         *
         */
        public void initialize()
        {
       
         clear();
       
         m_my_COMPANY_CD = i_my_COMPANY_CD;
         m_rdoPlantTyp1 = i_rdoPlantTyp1;
         m_rdoPlantTyp2 = i_rdoPlantTyp2;
         m_rdoPlantTyp3 = i_rdoPlantTyp3;
         m_rdoPlantTyp4 = i_rdoPlantTyp4;
         m_rdoPlantTyp5 = i_rdoPlantTyp5;
         
        }
       
         // TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
