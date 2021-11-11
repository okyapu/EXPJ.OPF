/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0010/src/com/nec/jp/orteus/metamorBase/AC0010/AC0010010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0010;

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

public class AC0010010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_rdoPlantTyp */
	public String m_rdoPlantTyp = null;
	/** �� 2 �ϐ��F m_rdoPlantTyp1 */
	public String m_rdoPlantTyp1 = null;
	/** �� 3 �ϐ��F m_rdoPlantTyp2 */
	public String m_rdoPlantTyp2 = null;
	/** �� 4 �ϐ��F m_plantCd */
	public String m_plantCd = null;
	/** �� 5 �ϐ��F m_txtPlantCd */
	public String m_txtPlantCd = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_rdoPlantTyp */
	public List l_rdoPlantTyp = null;

	/** �� 2 List�ϐ��F l_rdoPlantTyp1 */
	public List l_rdoPlantTyp1 = null;

	/** �� 3 List�ϐ��F l_rdoPlantTyp2 */
	public List l_rdoPlantTyp2 = null;

	/** �� 4 List�ϐ��F l_plantCd */
	public List l_plantCd = null;

	/** �� 5 List�ϐ��F l_txtPlantCd */
	public List l_txtPlantCd = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getrdoPlantTyp() { return m_rdoPlantTyp; }
	public String getrdoPlantTyp1() { return m_rdoPlantTyp1; }
	public String getrdoPlantTyp2() { return m_rdoPlantTyp2; }
	public String getplantCd() { return m_plantCd; }
	public String gettxtPlantCd() { return m_txtPlantCd; }

	public List getList_rdoPlantTyp() { return l_rdoPlantTyp; }
	public List getList_rdoPlantTyp1() { return l_rdoPlantTyp1; }
	public List getList_rdoPlantTyp2() { return l_rdoPlantTyp2; }
	public List getList_plantCd() { return l_plantCd; }
	public List getList_txtPlantCd() { return l_txtPlantCd; }

	public void setrdoPlantTyp(String val) { m_rdoPlantTyp = val; }
	public void setrdoPlantTyp1(String val) { m_rdoPlantTyp1 = val; }
	public void setrdoPlantTyp2(String val) { m_rdoPlantTyp2 = val; }
	public void setplantCd(String val) { m_plantCd = val; }
	public void settxtPlantCd(String val) { m_txtPlantCd = val; }


	public void setList_rdoPlantTyp(List list) { l_rdoPlantTyp = list; }
	public void setList_rdoPlantTyp1(List list) { l_rdoPlantTyp1 = list; }
	public void setList_rdoPlantTyp2(List list) { l_rdoPlantTyp2 = list; }
	public void setList_plantCd(List list) { l_plantCd = list; }
	public void setList_txtPlantCd(List list) { l_txtPlantCd = list; }

	public int setL2L_rdoPlantTyp(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoPlantTyp == null) {
			l_rdoPlantTyp = new ArrayList();
		} else {
			l_rdoPlantTyp.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoPlantTyp.add(((AC0010010Struct) list.get(i)).getrdoPlantTyp());
		}
		return size;
	}
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
			l_rdoPlantTyp1.add(((AC0010010Struct) list.get(i)).getrdoPlantTyp1());
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
			l_rdoPlantTyp2.add(((AC0010010Struct) list.get(i)).getrdoPlantTyp2());
		}
		return size;
	}
	public int setL2L_plantCd(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_plantCd == null) {
			l_plantCd = new ArrayList();
		} else {
			l_plantCd.clear();
		}
		for (int i = 0; i < size; i++) {
			l_plantCd.add(((AC0010010Struct) list.get(i)).getplantCd());
		}
		return size;
	}
	public int setL2L_txtPlantCd(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_txtPlantCd == null) {
			l_txtPlantCd = new ArrayList();
		} else {
			l_txtPlantCd.clear();
		}
		for (int i = 0; i < size; i++) {
			l_txtPlantCd.add(((AC0010010Struct) list.get(i)).gettxtPlantCd());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_rdoPlantTyp = null;
		m_rdoPlantTyp1 = null;
		m_rdoPlantTyp2 = null;
		m_plantCd = null;
		m_txtPlantCd = null;

		l_rdoPlantTyp = null;
		l_rdoPlantTyp1 = null;
		l_rdoPlantTyp2 = null;
		l_plantCd = null;
		l_txtPlantCd = null;

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
	 * medAC0010010�N���X�̕W���R���X�g���N�^
	 */
	public AC0010010Struct()
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
	public void setStruct(AC0010010Struct struct)
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
	public void setStructM(AC0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setrdoPlantTyp(struct.getrdoPlantTyp());
			this.setrdoPlantTyp1(struct.getrdoPlantTyp1());
			this.setrdoPlantTyp2(struct.getrdoPlantTyp2());
			this.setplantCd(struct.getplantCd());
			this.settxtPlantCd(struct.gettxtPlantCd());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AC0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_rdoPlantTyp(struct.getList_rdoPlantTyp());
			this.setList_rdoPlantTyp1(struct.getList_rdoPlantTyp1());
			this.setList_rdoPlantTyp2(struct.getList_rdoPlantTyp2());
			this.setList_plantCd(struct.getList_plantCd());
			this.setList_txtPlantCd(struct.getList_txtPlantCd());
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
	// �� 1 �ϐ������l�F i_rdoPlantTyp


	final static String i_rdoPlantTyp = null;

	// �� 2 �ϐ������l�F i_rdoPlantTyp1


	final static String i_rdoPlantTyp1 = null;

	// �� 3 �ϐ������l�F i_rdoPlantTyp2


	final static String i_rdoPlantTyp2 = null;

	// �� 4 �ϐ������l�F i_plantCd


	final static String i_plantCd = null;

	// �� 5 �ϐ������l�F i_txtPlantCd


	final static String i_txtPlantCd = null;

*/

	//{{user_implement_code
         // TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
         // �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
        // �� 1 �ϐ������l�F i_plantCd
        final static String i_plantCd = null;
        // �� 2 �ϐ������l�F i_txtPlantCd
        final static String i_txtPlantCd = null;
        // �� 3 �ϐ������l�F i_rdoPlantTyp
        final static String i_rdoPlantTyp = null;
        // �� 4 �ϐ������l�F i_rdoPlantTyp1
        final static String i_rdoPlantTyp1 = null;
        // �� 5 �ϐ������l�F i_rdoPlantTyp2
        final static String i_rdoPlantTyp2 = null;
       
        /**
         * ������
         *
         */
        public void initialize()
        {
       
         clear();
       
         m_plantCd = i_plantCd;
         m_txtPlantCd = i_txtPlantCd;
         m_rdoPlantTyp = i_rdoPlantTyp;
         m_rdoPlantTyp1 = i_rdoPlantTyp1;
         m_rdoPlantTyp2 = i_rdoPlantTyp2;
        }
       
         // TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
