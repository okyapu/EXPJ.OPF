/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DE0030/src/com/nec/jp/orteus/metamorBase/DE0030/DE0030010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.DE0030;

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

public class DE0030010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** �� 2 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 3 �ϐ��F m_CS_MAST_IF_PERIOD */
	public String m_CS_MAST_IF_PERIOD = null;
	/** �� 4 �ϐ��F m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** �� 5 �ϐ��F m_COST_TYP */
	public String m_COST_TYP = null;
	/** �� 6 �ϐ��F m_COST_TYP_name */
	public String m_COST_TYP_name = null;
	/** �� 7 �ϐ��F m_COST_TYP_val */
	public String m_COST_TYP_val = null;
	/** �� 8 �ϐ��F m_c_DeleteItemCsProcIf */
	public String m_c_DeleteItemCsProcIf = null;
	/** �� 9 �ϐ��F m_c_DeleteProcCostIf */
	public String m_c_DeleteProcCostIf = null;
	/** �� 10 �ϐ��F m_c_DeleteCsPuchIf */
	public String m_c_DeleteCsPuchIf = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** �� 2 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 3 List�ϐ��F l_CS_MAST_IF_PERIOD */
	public List l_CS_MAST_IF_PERIOD = null;

	/** �� 4 List�ϐ��F l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** �� 5 List�ϐ��F l_COST_TYP */
	public List l_COST_TYP = null;

	/** �� 6 List�ϐ��F l_COST_TYP_name */
	public List l_COST_TYP_name = null;

	/** �� 7 List�ϐ��F l_COST_TYP_val */
	public List l_COST_TYP_val = null;

	/** �� 8 List�ϐ��F l_c_DeleteItemCsProcIf */
	public List l_c_DeleteItemCsProcIf = null;

	/** �� 9 List�ϐ��F l_c_DeleteProcCostIf */
	public List l_c_DeleteProcCostIf = null;

	/** �� 10 List�ϐ��F l_c_DeleteCsPuchIf */
	public List l_c_DeleteCsPuchIf = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getCS_MAST_IF_PERIOD() { return m_CS_MAST_IF_PERIOD; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getCOST_TYP() { return m_COST_TYP; }
	public String getCOST_TYP_name() { return m_COST_TYP_name; }
	public String getCOST_TYP_val() { return m_COST_TYP_val; }
	public String getc_DeleteItemCsProcIf() { return m_c_DeleteItemCsProcIf; }
	public String getc_DeleteProcCostIf() { return m_c_DeleteProcCostIf; }
	public String getc_DeleteCsPuchIf() { return m_c_DeleteCsPuchIf; }

	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_CS_MAST_IF_PERIOD() { return l_CS_MAST_IF_PERIOD; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_COST_TYP() { return l_COST_TYP; }
	public List getList_COST_TYP_name() { return l_COST_TYP_name; }
	public List getList_COST_TYP_val() { return l_COST_TYP_val; }
	public List getList_c_DeleteItemCsProcIf() { return l_c_DeleteItemCsProcIf; }
	public List getList_c_DeleteProcCostIf() { return l_c_DeleteProcCostIf; }
	public List getList_c_DeleteCsPuchIf() { return l_c_DeleteCsPuchIf; }

	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setCS_MAST_IF_PERIOD(String val) { m_CS_MAST_IF_PERIOD = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setCOST_TYP(String val) { m_COST_TYP = val; }
	public void setCOST_TYP_name(String val) { m_COST_TYP_name = val; }
	public void setCOST_TYP_val(String val) { m_COST_TYP_val = val; }
	public void setc_DeleteItemCsProcIf(String val) { m_c_DeleteItemCsProcIf = val; }
	public void setc_DeleteProcCostIf(String val) { m_c_DeleteProcCostIf = val; }
	public void setc_DeleteCsPuchIf(String val) { m_c_DeleteCsPuchIf = val; }


	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_CS_MAST_IF_PERIOD(List list) { l_CS_MAST_IF_PERIOD = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_COST_TYP(List list) { l_COST_TYP = list; }
	public void setList_COST_TYP_name(List list) { l_COST_TYP_name = list; }
	public void setList_COST_TYP_val(List list) { l_COST_TYP_val = list; }
	public void setList_c_DeleteItemCsProcIf(List list) { l_c_DeleteItemCsProcIf = list; }
	public void setList_c_DeleteProcCostIf(List list) { l_c_DeleteProcCostIf = list; }
	public void setList_c_DeleteCsPuchIf(List list) { l_c_DeleteCsPuchIf = list; }

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
			l_PLANT_NAME.add(((DE0030010Struct) list.get(i)).getPLANT_NAME());
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
			l_PLANT_CD.add(((DE0030010Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_CS_MAST_IF_PERIOD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CS_MAST_IF_PERIOD == null) {
			l_CS_MAST_IF_PERIOD = new ArrayList();
		} else {
			l_CS_MAST_IF_PERIOD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CS_MAST_IF_PERIOD.add(((DE0030010Struct) list.get(i)).getCS_MAST_IF_PERIOD());
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
			l_MODIFY_COUNT.add(((DE0030010Struct) list.get(i)).getMODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_COST_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COST_TYP == null) {
			l_COST_TYP = new ArrayList();
		} else {
			l_COST_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COST_TYP.add(((DE0030010Struct) list.get(i)).getCOST_TYP());
		}
		return size;
	}
	public int setL2L_COST_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COST_TYP_name == null) {
			l_COST_TYP_name = new ArrayList();
		} else {
			l_COST_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COST_TYP_name.add(((DE0030010Struct) list.get(i)).getCOST_TYP_name());
		}
		return size;
	}
	public int setL2L_COST_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COST_TYP_val == null) {
			l_COST_TYP_val = new ArrayList();
		} else {
			l_COST_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COST_TYP_val.add(((DE0030010Struct) list.get(i)).getCOST_TYP_val());
		}
		return size;
	}
	public int setL2L_c_DeleteItemCsProcIf(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_DeleteItemCsProcIf == null) {
			l_c_DeleteItemCsProcIf = new ArrayList();
		} else {
			l_c_DeleteItemCsProcIf.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_DeleteItemCsProcIf.add(((DE0030010Struct) list.get(i)).getc_DeleteItemCsProcIf());
		}
		return size;
	}
	public int setL2L_c_DeleteProcCostIf(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_DeleteProcCostIf == null) {
			l_c_DeleteProcCostIf = new ArrayList();
		} else {
			l_c_DeleteProcCostIf.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_DeleteProcCostIf.add(((DE0030010Struct) list.get(i)).getc_DeleteProcCostIf());
		}
		return size;
	}
	public int setL2L_c_DeleteCsPuchIf(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_DeleteCsPuchIf == null) {
			l_c_DeleteCsPuchIf = new ArrayList();
		} else {
			l_c_DeleteCsPuchIf.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_DeleteCsPuchIf.add(((DE0030010Struct) list.get(i)).getc_DeleteCsPuchIf());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_PLANT_NAME = null;
		m_PLANT_CD = null;
		m_CS_MAST_IF_PERIOD = null;
		m_MODIFY_COUNT = null;
		m_COST_TYP = null;
		m_COST_TYP_name = null;
		m_COST_TYP_val = null;
		m_c_DeleteItemCsProcIf = null;
		m_c_DeleteProcCostIf = null;
		m_c_DeleteCsPuchIf = null;

		l_PLANT_NAME = null;
		l_PLANT_CD = null;
		l_CS_MAST_IF_PERIOD = null;
		l_MODIFY_COUNT = null;
		l_COST_TYP = null;
		l_COST_TYP_name = null;
		l_COST_TYP_val = null;
		l_c_DeleteItemCsProcIf = null;
		l_c_DeleteProcCostIf = null;
		l_c_DeleteCsPuchIf = null;

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
	 * medDE0030010�N���X�̕W���R���X�g���N�^
	 */
	public DE0030010Struct()
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
	public void setStruct(DE0030010Struct struct)
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
	public void setStructM(DE0030010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setCS_MAST_IF_PERIOD(struct.getCS_MAST_IF_PERIOD());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setCOST_TYP(struct.getCOST_TYP());
			this.setCOST_TYP_name(struct.getCOST_TYP_name());
			this.setCOST_TYP_val(struct.getCOST_TYP_val());
			this.setc_DeleteItemCsProcIf(struct.getc_DeleteItemCsProcIf());
			this.setc_DeleteProcCostIf(struct.getc_DeleteProcCostIf());
			this.setc_DeleteCsPuchIf(struct.getc_DeleteCsPuchIf());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(DE0030010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_CS_MAST_IF_PERIOD(struct.getList_CS_MAST_IF_PERIOD());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_COST_TYP(struct.getList_COST_TYP());
			this.setList_COST_TYP_name(struct.getList_COST_TYP_name());
			this.setList_COST_TYP_val(struct.getList_COST_TYP_val());
			this.setList_c_DeleteItemCsProcIf(struct.getList_c_DeleteItemCsProcIf());
			this.setList_c_DeleteProcCostIf(struct.getList_c_DeleteProcCostIf());
			this.setList_c_DeleteCsPuchIf(struct.getList_c_DeleteCsPuchIf());
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
	// �� 1 �ϐ������l�F i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// �� 2 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 3 �ϐ������l�F i_CS_MAST_IF_PERIOD


	final static String i_CS_MAST_IF_PERIOD = null;

	// �� 4 �ϐ������l�F i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// �� 5 �ϐ������l�F i_COST_TYP


	final static String i_COST_TYP = null;

	// �� 6 �ϐ������l�F i_COST_TYP_name


	final static String i_COST_TYP_name = null;

	// �� 7 �ϐ������l�F i_COST_TYP_val


	final static String i_COST_TYP_val = null;

	// �� 8 �ϐ������l�F i_c_DeleteItemCsProcIf


	final static String i_c_DeleteItemCsProcIf = null;

	// �� 9 �ϐ������l�F i_c_DeleteProcCostIf


	final static String i_c_DeleteProcCostIf = null;

	// �� 10 �ϐ������l�F i_c_DeleteCsPuchIf


	final static String i_c_DeleteCsPuchIf = null;

*/

	//{{user_implement_code
         // TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
         // �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
        // �� 1 �ϐ������l�F i_PLANT_NAME
        final static String i_PLANT_NAME = null;
        // �� 2 �ϐ������l�F i_PLANT_CD
        final static String i_PLANT_CD = null;
        // �� 3 �ϐ������l�F i_CS_MAST_IF_PERIOD
        final static String i_CS_MAST_IF_PERIOD = null;
        // �� 4 �ϐ������l�F i_MODIFY_COUNT
        final static String i_MODIFY_COUNT = null;
        // �� 5 �ϐ������l�F i_COST_TYP
        final static String i_COST_TYP = null;
        // �� 6 �ϐ������l�F i_COST_TYP_name
        final static String i_COST_TYP_name = null;
        // �� 7 �ϐ������l�F i_COST_TYP_val
        final static String i_COST_TYP_val = null;
        // �� 8 �ϐ������l�F i_c_DeleteItemCsProcIf
        final static String i_c_DeleteItemCsProcIf = null;
        // �� 9 �ϐ������l�F i_c_DeleteProcCostIf
        final static String i_c_DeleteProcCostIf = null;
        // �� 10 �ϐ������l�F i_c_DeleteCsPuchIf
        final static String i_c_DeleteCsPuchIf = null;
       
        /**
         * ������
         *
         */
        public void initialize()
        {
       
         clear();
       
         m_PLANT_NAME = i_PLANT_NAME;
         m_PLANT_CD = i_PLANT_CD;
         m_CS_MAST_IF_PERIOD = i_CS_MAST_IF_PERIOD;
         m_MODIFY_COUNT = i_MODIFY_COUNT;
         m_COST_TYP = i_COST_TYP;
         m_COST_TYP_name = i_COST_TYP_name;
         m_COST_TYP_val = i_COST_TYP_val;
         m_c_DeleteItemCsProcIf = i_c_DeleteItemCsProcIf;
         m_c_DeleteProcCostIf = i_c_DeleteProcCostIf;
         m_c_DeleteCsPuchIf = i_c_DeleteCsPuchIf;
        }
       
         // TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
