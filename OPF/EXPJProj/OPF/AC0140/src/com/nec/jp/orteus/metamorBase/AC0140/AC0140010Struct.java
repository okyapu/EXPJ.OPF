/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0140/src/com/nec/jp/orteus/metamorBase/AC0140/AC0140010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0140;

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

public class AC0140010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_jobOdrCd */
	public String m_jobOdrCd = null;
	/** �� 2 �ϐ��F m_txtjobOdrCd */
	public String m_txtjobOdrCd = null;
	/** �� 3 �ϐ��F m_sysPlantCd */
	public String m_sysPlantCd = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_jobOdrCd */
	public List l_jobOdrCd = null;

	/** �� 2 List�ϐ��F l_txtjobOdrCd */
	public List l_txtjobOdrCd = null;

	/** �� 3 List�ϐ��F l_sysPlantCd */
	public List l_sysPlantCd = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getjobOdrCd() { return m_jobOdrCd; }
	public String gettxtjobOdrCd() { return m_txtjobOdrCd; }
	public String getsysPlantCd() { return m_sysPlantCd; }

	public List getList_jobOdrCd() { return l_jobOdrCd; }
	public List getList_txtjobOdrCd() { return l_txtjobOdrCd; }
	public List getList_sysPlantCd() { return l_sysPlantCd; }

	public void setjobOdrCd(String val) { m_jobOdrCd = val; }
	public void settxtjobOdrCd(String val) { m_txtjobOdrCd = val; }
	public void setsysPlantCd(String val) { m_sysPlantCd = val; }


	public void setList_jobOdrCd(List list) { l_jobOdrCd = list; }
	public void setList_txtjobOdrCd(List list) { l_txtjobOdrCd = list; }
	public void setList_sysPlantCd(List list) { l_sysPlantCd = list; }

	public int setL2L_jobOdrCd(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_jobOdrCd == null) {
			l_jobOdrCd = new ArrayList();
		} else {
			l_jobOdrCd.clear();
		}
		for (int i = 0; i < size; i++) {
			l_jobOdrCd.add(((AC0140010Struct) list.get(i)).getjobOdrCd());
		}
		return size;
	}
	public int setL2L_txtjobOdrCd(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_txtjobOdrCd == null) {
			l_txtjobOdrCd = new ArrayList();
		} else {
			l_txtjobOdrCd.clear();
		}
		for (int i = 0; i < size; i++) {
			l_txtjobOdrCd.add(((AC0140010Struct) list.get(i)).gettxtjobOdrCd());
		}
		return size;
	}
	public int setL2L_sysPlantCd(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sysPlantCd == null) {
			l_sysPlantCd = new ArrayList();
		} else {
			l_sysPlantCd.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sysPlantCd.add(((AC0140010Struct) list.get(i)).getsysPlantCd());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_jobOdrCd = null;
		m_txtjobOdrCd = null;
		m_sysPlantCd = null;

		l_jobOdrCd = null;
		l_txtjobOdrCd = null;
		l_sysPlantCd = null;

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
	 * medAC0140010�N���X�̕W���R���X�g���N�^
	 */
	public AC0140010Struct()
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
	public void setStruct(AC0140010Struct struct)
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
	public void setStructM(AC0140010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setjobOdrCd(struct.getjobOdrCd());
			this.settxtjobOdrCd(struct.gettxtjobOdrCd());
			this.setsysPlantCd(struct.getsysPlantCd());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AC0140010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_jobOdrCd(struct.getList_jobOdrCd());
			this.setList_txtjobOdrCd(struct.getList_txtjobOdrCd());
			this.setList_sysPlantCd(struct.getList_sysPlantCd());
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
	// �� 1 �ϐ������l�F i_jobOdrCd


	final static String i_jobOdrCd = null;

	// �� 2 �ϐ������l�F i_txtjobOdrCd


	final static String i_txtjobOdrCd = null;

	// �� 3 �ϐ������l�F i_sysPlantCd


	final static String i_sysPlantCd = null;

*/

	//{{user_implement_code
         // TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
         // �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
        // �� 1 �ϐ������l�F i_jobOdrCd
        final static String i_jobOdrCd = null;
        // �� 2 �ϐ������l�F i_txtjobOdrCd
        final static String i_txtjobOdrCd = null;

       
        /**
         * ������
         *
         */
        public void initialize()
        {
       
         clear();
       
         m_jobOdrCd = i_jobOdrCd;
         m_txtjobOdrCd = i_txtjobOdrCd;

        }
       
         // TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
