/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AK0030/src/com/nec/jp/orteus/metamorBase/AK0030/AK0030010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AK0030;

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

public class AK0030010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_PRD_REQ_START_DATE */
	public String m_PRD_REQ_START_DATE = null;
	/** �� 2 �ϐ��F m_ITEM_CONV_END_DATE */
	public String m_ITEM_CONV_END_DATE = null;
	/** �� 3 �ϐ��F m_MRP_DM_END_DATE */
	public String m_MRP_DM_END_DATE = null;
	/** �� 4 �ϐ��F m_SHIP_CONV_END_DATE */
	public String m_SHIP_CONV_END_DATE = null;
	/** �� 5 �ϐ��F m_STOCK_ISSUE_END_DATE */
	public String m_STOCK_ISSUE_END_DATE = null;
	/** �� 6 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 7 �ϐ��F m_r1_MODE */
	public String m_r1_MODE = null;
	/** �� 8 �ϐ��F m_r2_MODE */
	public String m_r2_MODE = null;
	/** �� 9 �ϐ��F m_r3_MODE */
	public String m_r3_MODE = null;
	/** �� 10 �ϐ��F m_r4_MODE */
	public String m_r4_MODE = null;
	/** �� 11 �ϐ��F m_h_MODE */
	public String m_h_MODE = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_PRD_REQ_START_DATE */
	public List l_PRD_REQ_START_DATE = null;

	/** �� 2 List�ϐ��F l_ITEM_CONV_END_DATE */
	public List l_ITEM_CONV_END_DATE = null;

	/** �� 3 List�ϐ��F l_MRP_DM_END_DATE */
	public List l_MRP_DM_END_DATE = null;

	/** �� 4 List�ϐ��F l_SHIP_CONV_END_DATE */
	public List l_SHIP_CONV_END_DATE = null;

	/** �� 5 List�ϐ��F l_STOCK_ISSUE_END_DATE */
	public List l_STOCK_ISSUE_END_DATE = null;

	/** �� 6 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 7 List�ϐ��F l_r1_MODE */
	public List l_r1_MODE = null;

	/** �� 8 List�ϐ��F l_r2_MODE */
	public List l_r2_MODE = null;

	/** �� 9 List�ϐ��F l_r3_MODE */
	public List l_r3_MODE = null;

	/** �� 10 List�ϐ��F l_r4_MODE */
	public List l_r4_MODE = null;

	/** �� 11 List�ϐ��F l_h_MODE */
	public List l_h_MODE = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getPRD_REQ_START_DATE() { return m_PRD_REQ_START_DATE; }
	public String getITEM_CONV_END_DATE() { return m_ITEM_CONV_END_DATE; }
	public String getMRP_DM_END_DATE() { return m_MRP_DM_END_DATE; }
	public String getSHIP_CONV_END_DATE() { return m_SHIP_CONV_END_DATE; }
	public String getSTOCK_ISSUE_END_DATE() { return m_STOCK_ISSUE_END_DATE; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getr1_MODE() { return m_r1_MODE; }
	public String getr2_MODE() { return m_r2_MODE; }
	public String getr3_MODE() { return m_r3_MODE; }
	public String getr4_MODE() { return m_r4_MODE; }
	public String geth_MODE() { return m_h_MODE; }

	public List getList_PRD_REQ_START_DATE() { return l_PRD_REQ_START_DATE; }
	public List getList_ITEM_CONV_END_DATE() { return l_ITEM_CONV_END_DATE; }
	public List getList_MRP_DM_END_DATE() { return l_MRP_DM_END_DATE; }
	public List getList_SHIP_CONV_END_DATE() { return l_SHIP_CONV_END_DATE; }
	public List getList_STOCK_ISSUE_END_DATE() { return l_STOCK_ISSUE_END_DATE; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_r1_MODE() { return l_r1_MODE; }
	public List getList_r2_MODE() { return l_r2_MODE; }
	public List getList_r3_MODE() { return l_r3_MODE; }
	public List getList_r4_MODE() { return l_r4_MODE; }
	public List getList_h_MODE() { return l_h_MODE; }

	public void setPRD_REQ_START_DATE(String val) { m_PRD_REQ_START_DATE = val; }
	public void setITEM_CONV_END_DATE(String val) { m_ITEM_CONV_END_DATE = val; }
	public void setMRP_DM_END_DATE(String val) { m_MRP_DM_END_DATE = val; }
	public void setSHIP_CONV_END_DATE(String val) { m_SHIP_CONV_END_DATE = val; }
	public void setSTOCK_ISSUE_END_DATE(String val) { m_STOCK_ISSUE_END_DATE = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setr1_MODE(String val) { m_r1_MODE = val; }
	public void setr2_MODE(String val) { m_r2_MODE = val; }
	public void setr3_MODE(String val) { m_r3_MODE = val; }
	public void setr4_MODE(String val) { m_r4_MODE = val; }
	public void seth_MODE(String val) { m_h_MODE = val; }


	public void setList_PRD_REQ_START_DATE(List list) { l_PRD_REQ_START_DATE = list; }
	public void setList_ITEM_CONV_END_DATE(List list) { l_ITEM_CONV_END_DATE = list; }
	public void setList_MRP_DM_END_DATE(List list) { l_MRP_DM_END_DATE = list; }
	public void setList_SHIP_CONV_END_DATE(List list) { l_SHIP_CONV_END_DATE = list; }
	public void setList_STOCK_ISSUE_END_DATE(List list) { l_STOCK_ISSUE_END_DATE = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_r1_MODE(List list) { l_r1_MODE = list; }
	public void setList_r2_MODE(List list) { l_r2_MODE = list; }
	public void setList_r3_MODE(List list) { l_r3_MODE = list; }
	public void setList_r4_MODE(List list) { l_r4_MODE = list; }
	public void setList_h_MODE(List list) { l_h_MODE = list; }

	public int setL2L_PRD_REQ_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRD_REQ_START_DATE == null) {
			l_PRD_REQ_START_DATE = new ArrayList();
		} else {
			l_PRD_REQ_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRD_REQ_START_DATE.add(((AK0030010Struct) list.get(i)).getPRD_REQ_START_DATE());
		}
		return size;
	}
	public int setL2L_ITEM_CONV_END_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CONV_END_DATE == null) {
			l_ITEM_CONV_END_DATE = new ArrayList();
		} else {
			l_ITEM_CONV_END_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CONV_END_DATE.add(((AK0030010Struct) list.get(i)).getITEM_CONV_END_DATE());
		}
		return size;
	}
	public int setL2L_MRP_DM_END_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_DM_END_DATE == null) {
			l_MRP_DM_END_DATE = new ArrayList();
		} else {
			l_MRP_DM_END_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_DM_END_DATE.add(((AK0030010Struct) list.get(i)).getMRP_DM_END_DATE());
		}
		return size;
	}
	public int setL2L_SHIP_CONV_END_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SHIP_CONV_END_DATE == null) {
			l_SHIP_CONV_END_DATE = new ArrayList();
		} else {
			l_SHIP_CONV_END_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SHIP_CONV_END_DATE.add(((AK0030010Struct) list.get(i)).getSHIP_CONV_END_DATE());
		}
		return size;
	}
	public int setL2L_STOCK_ISSUE_END_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_ISSUE_END_DATE == null) {
			l_STOCK_ISSUE_END_DATE = new ArrayList();
		} else {
			l_STOCK_ISSUE_END_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_ISSUE_END_DATE.add(((AK0030010Struct) list.get(i)).getSTOCK_ISSUE_END_DATE());
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
			l_PLANT_CD.add(((AK0030010Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_r1_MODE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r1_MODE == null) {
			l_r1_MODE = new ArrayList();
		} else {
			l_r1_MODE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r1_MODE.add(((AK0030010Struct) list.get(i)).getr1_MODE());
		}
		return size;
	}
	public int setL2L_r2_MODE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r2_MODE == null) {
			l_r2_MODE = new ArrayList();
		} else {
			l_r2_MODE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r2_MODE.add(((AK0030010Struct) list.get(i)).getr2_MODE());
		}
		return size;
	}
	public int setL2L_r3_MODE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r3_MODE == null) {
			l_r3_MODE = new ArrayList();
		} else {
			l_r3_MODE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r3_MODE.add(((AK0030010Struct) list.get(i)).getr3_MODE());
		}
		return size;
	}
	public int setL2L_r4_MODE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r4_MODE == null) {
			l_r4_MODE = new ArrayList();
		} else {
			l_r4_MODE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r4_MODE.add(((AK0030010Struct) list.get(i)).getr4_MODE());
		}
		return size;
	}
	public int setL2L_h_MODE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_MODE == null) {
			l_h_MODE = new ArrayList();
		} else {
			l_h_MODE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_MODE.add(((AK0030010Struct) list.get(i)).geth_MODE());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_PRD_REQ_START_DATE = null;
		m_ITEM_CONV_END_DATE = null;
		m_MRP_DM_END_DATE = null;
		m_SHIP_CONV_END_DATE = null;
		m_STOCK_ISSUE_END_DATE = null;
		m_PLANT_CD = null;
		m_r1_MODE = null;
		m_r2_MODE = null;
		m_r3_MODE = null;
		m_r4_MODE = null;
		m_h_MODE = null;

		l_PRD_REQ_START_DATE = null;
		l_ITEM_CONV_END_DATE = null;
		l_MRP_DM_END_DATE = null;
		l_SHIP_CONV_END_DATE = null;
		l_STOCK_ISSUE_END_DATE = null;
		l_PLANT_CD = null;
		l_r1_MODE = null;
		l_r2_MODE = null;
		l_r3_MODE = null;
		l_r4_MODE = null;
		l_h_MODE = null;

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
	 * medAK0030010�N���X�̕W���R���X�g���N�^
	 */
	public AK0030010Struct()
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
	public void setStruct(AK0030010Struct struct)
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
	public void setStructM(AK0030010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setPRD_REQ_START_DATE(struct.getPRD_REQ_START_DATE());
			this.setITEM_CONV_END_DATE(struct.getITEM_CONV_END_DATE());
			this.setMRP_DM_END_DATE(struct.getMRP_DM_END_DATE());
			this.setSHIP_CONV_END_DATE(struct.getSHIP_CONV_END_DATE());
			this.setSTOCK_ISSUE_END_DATE(struct.getSTOCK_ISSUE_END_DATE());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setr1_MODE(struct.getr1_MODE());
			this.setr2_MODE(struct.getr2_MODE());
			this.setr3_MODE(struct.getr3_MODE());
			this.setr4_MODE(struct.getr4_MODE());
			this.seth_MODE(struct.geth_MODE());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AK0030010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_PRD_REQ_START_DATE(struct.getList_PRD_REQ_START_DATE());
			this.setList_ITEM_CONV_END_DATE(struct.getList_ITEM_CONV_END_DATE());
			this.setList_MRP_DM_END_DATE(struct.getList_MRP_DM_END_DATE());
			this.setList_SHIP_CONV_END_DATE(struct.getList_SHIP_CONV_END_DATE());
			this.setList_STOCK_ISSUE_END_DATE(struct.getList_STOCK_ISSUE_END_DATE());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_r1_MODE(struct.getList_r1_MODE());
			this.setList_r2_MODE(struct.getList_r2_MODE());
			this.setList_r3_MODE(struct.getList_r3_MODE());
			this.setList_r4_MODE(struct.getList_r4_MODE());
			this.setList_h_MODE(struct.getList_h_MODE());
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
	// �� 1 �ϐ������l�F i_PRD_REQ_START_DATE


	final static String i_PRD_REQ_START_DATE = null;

	// �� 2 �ϐ������l�F i_ITEM_CONV_END_DATE


	final static String i_ITEM_CONV_END_DATE = null;

	// �� 3 �ϐ������l�F i_MRP_DM_END_DATE


	final static String i_MRP_DM_END_DATE = null;

	// �� 4 �ϐ������l�F i_SHIP_CONV_END_DATE


	final static String i_SHIP_CONV_END_DATE = null;

	// �� 5 �ϐ������l�F i_STOCK_ISSUE_END_DATE


	final static String i_STOCK_ISSUE_END_DATE = null;

	// �� 6 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 7 �ϐ������l�F i_r1_MODE


	final static String i_r1_MODE = null;

	// �� 8 �ϐ������l�F i_r2_MODE


	final static String i_r2_MODE = null;

	// �� 9 �ϐ������l�F i_r3_MODE


	final static String i_r3_MODE = null;

	// �� 10 �ϐ������l�F i_r4_MODE


	final static String i_r4_MODE = null;

	// �� 11 �ϐ������l�F i_h_MODE


	final static String i_h_MODE = null;

*/

	//{{user_implement_code
         // TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
         // �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
        // �� 1 �ϐ������l�F i_PRD_REQ_START_DATE
        final static String i_PRD_REQ_START_DATE = null;
        // �� 2 �ϐ������l�F i_ITEM_CONV_END_DATE
        final static String i_ITEM_CONV_END_DATE = null;
        // �� 3 �ϐ������l�F i_MRP_DM_END_DATE
        final static String i_MRP_DM_END_DATE = null;
        // �� 4 �ϐ������l�F i_SHIP_CONV_END_DATE
        final static String i_SHIP_CONV_END_DATE = null;
        // �� 5 �ϐ������l�F i_STOCK_ISSUE_END_DATE
        final static String i_STOCK_ISSUE_END_DATE = null;
        // �� 6 �ϐ������l�F i_PLANT_CD
        final static String i_PLANT_CD = null;
        // �� 7 �ϐ������l�F i_r1_MODE
        final static String i_r1_MODE = null;
        // �� 8 �ϐ������l�F i_r2_MODE
        final static String i_r2_MODE = null;
        // �� 9 �ϐ������l�F i_r3_MODE
        final static String i_r3_MODE = null;
        // �� 10 �ϐ������l�F i_r4_MODE
        final static String i_r4_MODE = null;
        // �� 11 �ϐ������l�F i_h_MODE
        final static String i_h_MODE = null;
       
        /**
         * ������
         *
         */
        public void initialize()
        {
       
         clear();
       
         m_PRD_REQ_START_DATE = i_PRD_REQ_START_DATE;
         m_ITEM_CONV_END_DATE = i_ITEM_CONV_END_DATE;
         m_MRP_DM_END_DATE = i_MRP_DM_END_DATE;
         m_SHIP_CONV_END_DATE = i_SHIP_CONV_END_DATE;
         m_STOCK_ISSUE_END_DATE = i_STOCK_ISSUE_END_DATE;
         m_PLANT_CD = i_PLANT_CD;
         m_r1_MODE = i_r1_MODE;
         m_r2_MODE = i_r2_MODE;
         m_r3_MODE = i_r3_MODE;
         m_r4_MODE = i_r4_MODE;
         m_h_MODE = i_h_MODE;
        }
       
         // TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
