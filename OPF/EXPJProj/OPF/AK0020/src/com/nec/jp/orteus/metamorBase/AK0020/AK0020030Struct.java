/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AK0020/src/com/nec/jp/orteus/metamorBase/AK0020/AK0020030Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AK0020;

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
/**
 * CLASS     : AK0020030Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.5 $ $Date: 2016/05/23 08:27:46 $
 *
 */
//}}user_implement_code_header

public class AK0020030Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_FINAL_MONTHLY_PROC_EXEC_DATE */
	public String m_FINAL_MONTHLY_PROC_EXEC_DATE = null;
	/** �� 2 �ϐ��F m_SYSDATE */
	public String m_SYSDATE = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_FINAL_MONTHLY_PROC_EXEC_DATE */
	public List l_FINAL_MONTHLY_PROC_EXEC_DATE = null;

	/** �� 2 List�ϐ��F l_SYSDATE */
	public List l_SYSDATE = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getFINAL_MONTHLY_PROC_EXEC_DATE() { return m_FINAL_MONTHLY_PROC_EXEC_DATE; }
	public String getSYSDATE() { return m_SYSDATE; }

	public List getList_FINAL_MONTHLY_PROC_EXEC_DATE() { return l_FINAL_MONTHLY_PROC_EXEC_DATE; }
	public List getList_SYSDATE() { return l_SYSDATE; }

	public void setFINAL_MONTHLY_PROC_EXEC_DATE(String val) { m_FINAL_MONTHLY_PROC_EXEC_DATE = val; }
	public void setSYSDATE(String val) { m_SYSDATE = val; }


	public void setList_FINAL_MONTHLY_PROC_EXEC_DATE(List list) { l_FINAL_MONTHLY_PROC_EXEC_DATE = list; }
	public void setList_SYSDATE(List list) { l_SYSDATE = list; }

	public int setL2L_FINAL_MONTHLY_PROC_EXEC_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FINAL_MONTHLY_PROC_EXEC_DATE == null) {
			l_FINAL_MONTHLY_PROC_EXEC_DATE = new ArrayList();
		} else {
			l_FINAL_MONTHLY_PROC_EXEC_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FINAL_MONTHLY_PROC_EXEC_DATE.add(((AK0020030Struct) list.get(i)).getFINAL_MONTHLY_PROC_EXEC_DATE());
		}
		return size;
	}
	public int setL2L_SYSDATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SYSDATE == null) {
			l_SYSDATE = new ArrayList();
		} else {
			l_SYSDATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SYSDATE.add(((AK0020030Struct) list.get(i)).getSYSDATE());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_FINAL_MONTHLY_PROC_EXEC_DATE = null;
		m_SYSDATE = null;

		l_FINAL_MONTHLY_PROC_EXEC_DATE = null;
		l_SYSDATE = null;

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
	 * medAK0020030�N���X�̕W���R���X�g���N�^
	 */
	public AK0020030Struct()
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
	public void setStruct(AK0020030Struct struct)
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
	public void setStructM(AK0020030Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setFINAL_MONTHLY_PROC_EXEC_DATE(struct.getFINAL_MONTHLY_PROC_EXEC_DATE());
			this.setSYSDATE(struct.getSYSDATE());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AK0020030Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_FINAL_MONTHLY_PROC_EXEC_DATE(struct.getList_FINAL_MONTHLY_PROC_EXEC_DATE());
			this.setList_SYSDATE(struct.getList_SYSDATE());
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
	// �� 1 �ϐ������l�F i_FINAL_MONTHLY_PROC_EXEC_DATE


	final static String i_FINAL_MONTHLY_PROC_EXEC_DATE = null;

	// �� 2 �ϐ������l�F i_SYSDATE


	final static String i_SYSDATE = null;

*/

	//{{user_implement_code
		// TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
		// �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
	// �� 1 �ϐ������l�F i_FINAL_MONTHLY_PROC_EXEC_DATE

	final static String i_FINAL_MONTHLY_PROC_EXEC_DATE = null;

	// �� 2 �ϐ������l�F i_SYSDATE

	final static String i_SYSDATE = null;


	/**
	 * ������
	 *
	 */
	public void initialize()
	{

		clear();

		m_FINAL_MONTHLY_PROC_EXEC_DATE = i_FINAL_MONTHLY_PROC_EXEC_DATE;
		m_SYSDATE = i_SYSDATE;
	}
		// TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}