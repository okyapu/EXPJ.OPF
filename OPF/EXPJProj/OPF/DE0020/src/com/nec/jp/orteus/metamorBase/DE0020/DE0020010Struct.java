/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DE0020/src/com/nec/jp/orteus/metamorBase/DE0020/DE0020010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.DE0020;

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

public class DE0020010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_M_CS_PROC_PERIOD */
	public String m_M_CS_PROC_PERIOD = null;
	/** �� 2 �ϐ��F m_M_PROC_COST_PERIOD */
	public String m_M_PROC_COST_PERIOD = null;
	/** �� 3 �ϐ��F m_M_CS_PUCH_PERIOD */
	public String m_M_CS_PUCH_PERIOD = null;
	/** �� 4 �ϐ��F m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** �� 5 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 6 �ϐ��F m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** �� 7 �ϐ��F m_c_DeleteMCsProc */
	public String m_c_DeleteMCsProc = null;
	/** �� 8 �ϐ��F m_c_DeleteMProcCost */
	public String m_c_DeleteMProcCost = null;
	/** �� 9 �ϐ��F m_c_DeleteMCsPuch */
	public String m_c_DeleteMCsPuch = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_M_CS_PROC_PERIOD */
	public List l_M_CS_PROC_PERIOD = null;

	/** �� 2 List�ϐ��F l_M_PROC_COST_PERIOD */
	public List l_M_PROC_COST_PERIOD = null;

	/** �� 3 List�ϐ��F l_M_CS_PUCH_PERIOD */
	public List l_M_CS_PUCH_PERIOD = null;

	/** �� 4 List�ϐ��F l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** �� 5 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 6 List�ϐ��F l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** �� 7 List�ϐ��F l_c_DeleteMCsProc */
	public List l_c_DeleteMCsProc = null;

	/** �� 8 List�ϐ��F l_c_DeleteMProcCost */
	public List l_c_DeleteMProcCost = null;

	/** �� 9 List�ϐ��F l_c_DeleteMCsPuch */
	public List l_c_DeleteMCsPuch = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getM_CS_PROC_PERIOD() { return m_M_CS_PROC_PERIOD; }
	public String getM_PROC_COST_PERIOD() { return m_M_PROC_COST_PERIOD; }
	public String getM_CS_PUCH_PERIOD() { return m_M_CS_PUCH_PERIOD; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getc_DeleteMCsProc() { return m_c_DeleteMCsProc; }
	public String getc_DeleteMProcCost() { return m_c_DeleteMProcCost; }
	public String getc_DeleteMCsPuch() { return m_c_DeleteMCsPuch; }

	public List getList_M_CS_PROC_PERIOD() { return l_M_CS_PROC_PERIOD; }
	public List getList_M_PROC_COST_PERIOD() { return l_M_PROC_COST_PERIOD; }
	public List getList_M_CS_PUCH_PERIOD() { return l_M_CS_PUCH_PERIOD; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_c_DeleteMCsProc() { return l_c_DeleteMCsProc; }
	public List getList_c_DeleteMProcCost() { return l_c_DeleteMProcCost; }
	public List getList_c_DeleteMCsPuch() { return l_c_DeleteMCsPuch; }

	public void setM_CS_PROC_PERIOD(String val) { m_M_CS_PROC_PERIOD = val; }
	public void setM_PROC_COST_PERIOD(String val) { m_M_PROC_COST_PERIOD = val; }
	public void setM_CS_PUCH_PERIOD(String val) { m_M_CS_PUCH_PERIOD = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setc_DeleteMCsProc(String val) { m_c_DeleteMCsProc = val; }
	public void setc_DeleteMProcCost(String val) { m_c_DeleteMProcCost = val; }
	public void setc_DeleteMCsPuch(String val) { m_c_DeleteMCsPuch = val; }


	public void setList_M_CS_PROC_PERIOD(List list) { l_M_CS_PROC_PERIOD = list; }
	public void setList_M_PROC_COST_PERIOD(List list) { l_M_PROC_COST_PERIOD = list; }
	public void setList_M_CS_PUCH_PERIOD(List list) { l_M_CS_PUCH_PERIOD = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_c_DeleteMCsProc(List list) { l_c_DeleteMCsProc = list; }
	public void setList_c_DeleteMProcCost(List list) { l_c_DeleteMProcCost = list; }
	public void setList_c_DeleteMCsPuch(List list) { l_c_DeleteMCsPuch = list; }

	public int setL2L_M_CS_PROC_PERIOD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_M_CS_PROC_PERIOD == null) {
			l_M_CS_PROC_PERIOD = new ArrayList();
		} else {
			l_M_CS_PROC_PERIOD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_M_CS_PROC_PERIOD.add(((DE0020010Struct) list.get(i)).getM_CS_PROC_PERIOD());
		}
		return size;
	}
	public int setL2L_M_PROC_COST_PERIOD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_M_PROC_COST_PERIOD == null) {
			l_M_PROC_COST_PERIOD = new ArrayList();
		} else {
			l_M_PROC_COST_PERIOD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_M_PROC_COST_PERIOD.add(((DE0020010Struct) list.get(i)).getM_PROC_COST_PERIOD());
		}
		return size;
	}
	public int setL2L_M_CS_PUCH_PERIOD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_M_CS_PUCH_PERIOD == null) {
			l_M_CS_PUCH_PERIOD = new ArrayList();
		} else {
			l_M_CS_PUCH_PERIOD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_M_CS_PUCH_PERIOD.add(((DE0020010Struct) list.get(i)).getM_CS_PUCH_PERIOD());
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
			l_MODIFY_COUNT.add(((DE0020010Struct) list.get(i)).getMODIFY_COUNT());
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
			l_PLANT_CD.add(((DE0020010Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_PLANT_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PLANT_NAME == null) {
			l_PLANT_NAME = new ArrayList();
		} else {
			l_PLANT_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PLANT_NAME.add(((DE0020010Struct) list.get(i)).getPLANT_NAME());
		}
		return size;
	}
	public int setL2L_c_DeleteMCsProc(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_DeleteMCsProc == null) {
			l_c_DeleteMCsProc = new ArrayList();
		} else {
			l_c_DeleteMCsProc.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_DeleteMCsProc.add(((DE0020010Struct) list.get(i)).getc_DeleteMCsProc());
		}
		return size;
	}
	public int setL2L_c_DeleteMProcCost(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_DeleteMProcCost == null) {
			l_c_DeleteMProcCost = new ArrayList();
		} else {
			l_c_DeleteMProcCost.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_DeleteMProcCost.add(((DE0020010Struct) list.get(i)).getc_DeleteMProcCost());
		}
		return size;
	}
	public int setL2L_c_DeleteMCsPuch(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_DeleteMCsPuch == null) {
			l_c_DeleteMCsPuch = new ArrayList();
		} else {
			l_c_DeleteMCsPuch.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_DeleteMCsPuch.add(((DE0020010Struct) list.get(i)).getc_DeleteMCsPuch());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_M_CS_PROC_PERIOD = null;
		m_M_PROC_COST_PERIOD = null;
		m_M_CS_PUCH_PERIOD = null;
		m_MODIFY_COUNT = null;
		m_PLANT_CD = null;
		m_PLANT_NAME = null;
		m_c_DeleteMCsProc = null;
		m_c_DeleteMProcCost = null;
		m_c_DeleteMCsPuch = null;

		l_M_CS_PROC_PERIOD = null;
		l_M_PROC_COST_PERIOD = null;
		l_M_CS_PUCH_PERIOD = null;
		l_MODIFY_COUNT = null;
		l_PLANT_CD = null;
		l_PLANT_NAME = null;
		l_c_DeleteMCsProc = null;
		l_c_DeleteMProcCost = null;
		l_c_DeleteMCsPuch = null;

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
	 * medDE0020010�N���X�̕W���R���X�g���N�^
	 */
	public DE0020010Struct()
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
	public void setStruct(DE0020010Struct struct)
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
	public void setStructM(DE0020010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setM_CS_PROC_PERIOD(struct.getM_CS_PROC_PERIOD());
			this.setM_PROC_COST_PERIOD(struct.getM_PROC_COST_PERIOD());
			this.setM_CS_PUCH_PERIOD(struct.getM_CS_PUCH_PERIOD());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.setc_DeleteMCsProc(struct.getc_DeleteMCsProc());
			this.setc_DeleteMProcCost(struct.getc_DeleteMProcCost());
			this.setc_DeleteMCsPuch(struct.getc_DeleteMCsPuch());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(DE0020010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_M_CS_PROC_PERIOD(struct.getList_M_CS_PROC_PERIOD());
			this.setList_M_PROC_COST_PERIOD(struct.getList_M_PROC_COST_PERIOD());
			this.setList_M_CS_PUCH_PERIOD(struct.getList_M_CS_PUCH_PERIOD());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_c_DeleteMCsProc(struct.getList_c_DeleteMCsProc());
			this.setList_c_DeleteMProcCost(struct.getList_c_DeleteMProcCost());
			this.setList_c_DeleteMCsPuch(struct.getList_c_DeleteMCsPuch());
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
	// �� 1 �ϐ������l�F i_M_CS_PROC_PERIOD


	final static String i_M_CS_PROC_PERIOD = null;

	// �� 2 �ϐ������l�F i_M_PROC_COST_PERIOD


	final static String i_M_PROC_COST_PERIOD = null;

	// �� 3 �ϐ������l�F i_M_CS_PUCH_PERIOD


	final static String i_M_CS_PUCH_PERIOD = null;

	// �� 4 �ϐ������l�F i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// �� 5 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 6 �ϐ������l�F i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// �� 7 �ϐ������l�F i_c_DeleteMCsProc


	final static String i_c_DeleteMCsProc = null;

	// �� 8 �ϐ������l�F i_c_DeleteMProcCost


	final static String i_c_DeleteMProcCost = null;

	// �� 9 �ϐ������l�F i_c_DeleteMCsPuch


	final static String i_c_DeleteMCsPuch = null;

*/

	//{{user_implement_code
         // TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
         // �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
        // �� 1 �ϐ������l�F i_M_CS_PROC_PERIOD
        final static String i_M_CS_PROC_PERIOD = null;
        // �� 2 �ϐ������l�F i_M_PROC_COST_PERIOD
        final static String i_M_PROC_COST_PERIOD = null;
        // �� 3 �ϐ������l�F i_M_CS_PUCH_PERIOD
        final static String i_M_CS_PUCH_PERIOD = null;
        // �� 4 �ϐ������l�F i_MODIFY_COUNT
        final static String i_MODIFY_COUNT = null;
        // �� 5 �ϐ������l�F i_PLANT_CD
        final static String i_PLANT_CD = null;
        // �� 6 �ϐ������l�F i_PLANT_NAME
        final static String i_PLANT_NAME = null;
        // �� 7 �ϐ������l�F i_c_DeleteMCsProc
        final static String i_c_DeleteMCsProc = null;
        // �� 8 �ϐ������l�F i_c_DeleteMProcCost
        final static String i_c_DeleteMProcCost = null;
        // �� 9 �ϐ������l�F i_c_DeleteMCsPuch
        final static String i_c_DeleteMCsPuch = null;
       
        /**
         * ������
         *
         */
        public void initialize()
        {
       
         clear();
       
         m_M_CS_PROC_PERIOD = i_M_CS_PROC_PERIOD;
         m_M_PROC_COST_PERIOD = i_M_PROC_COST_PERIOD;
         m_M_CS_PUCH_PERIOD = i_M_CS_PUCH_PERIOD;
         m_MODIFY_COUNT = i_MODIFY_COUNT;
         m_PLANT_CD = i_PLANT_CD;
         m_PLANT_NAME = i_PLANT_NAME;
         m_c_DeleteMCsProc = i_c_DeleteMCsProc;
         m_c_DeleteMProcCost = i_c_DeleteMProcCost;
         m_c_DeleteMCsPuch = i_c_DeleteMCsPuch;
        }
       
         // TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
