/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AF0120/src/com/nec/jp/orteus/metamorBase/AF0120/AF0120010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AF0120;

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
 * CLASS     : AF0120010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: zhou-kehong $
 * @version $Revision: 1.3 $ $Date: 2014/12/22 02:55:05 $
 *
 */
//}}user_implement_code_header

public class AF0120010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_MSG_CONTEXT_NO */
	public String m_MSG_CONTEXT_NO = null;
	/** �� 2 �ϐ��F m_MSG_BUSINESS_CD */
	public String m_MSG_BUSINESS_CD = null;
	/** �� 3 �ϐ��F m_h_ITEM_CD */
	public String m_h_ITEM_CD = null;
	/** �� 4 �ϐ��F m_l_PUCH_ODR_CD */
	public String m_l_PUCH_ODR_CD = null;
	/** �� 5 �ϐ��F m_ITEM_CD_VIEW */
	public String m_ITEM_CD_VIEW = null;
	/** �� 6 �ϐ��F m_PUCH_ODR_QTY */
	public String m_PUCH_ODR_QTY = null;
	/** �� 7 �ϐ��F m_SUM_ACPT_QTY */
	public String m_SUM_ACPT_QTY = null;
	/** �� 8 �ϐ��F m_SRCS */
	public String m_SRCS = null;
	/** �� 9 �ϐ��F m_PUCH_ODR_DLV_DATE */
	public String m_PUCH_ODR_DLV_DATE = null;
	/** �� 10 �ϐ��F m_VEND_ITEM_CD */
	public String m_VEND_ITEM_CD = null;
	/** �� 11 �ϐ��F m_VEND_CD */
	public String m_VEND_CD = null;
	/** �� 12 �ϐ��F m_VEND_NAME */
	public String m_VEND_NAME = null;
	/** �� 13 �ϐ��F m_PUCH_ODR_STS_NAME */
	public String m_PUCH_ODR_STS_NAME = null;
	/** �� 14 �ϐ��F m_PUCH_ODR_STS_TYP */
	public String m_PUCH_ODR_STS_TYP = null;
	/** �� 15 �ϐ��F m_WH_NAME */
	public String m_WH_NAME = null;
	/** �� 16 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 17 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 18 �ϐ��F m_DISPLAY_NAME */
	public String m_DISPLAY_NAME = null;
	/** �� 19 �ϐ��F m_PARENT_ITEM_CD */
	public String m_PARENT_ITEM_CD = null;
	/** �� 20 �ϐ��F m_PARENT_ITEM_NAME */
	public String m_PARENT_ITEM_NAME = null;
	/** �� 21 �ϐ��F m_PUCH_ODR_START_DATE */
	public String m_PUCH_ODR_START_DATE = null;
	/** �� 22 �ϐ��F m_WORK_IN_PROC_CD */
	public String m_WORK_IN_PROC_CD = null;
	/** �� 23 �ϐ��F m_WS_CD */
	public String m_WS_CD = null;
	/** �� 24 �ϐ��F m_WS_NAME */
	public String m_WS_NAME = null;
	/** �� 25 �ϐ��F m_OPR_INST_CD */
	public String m_OPR_INST_CD = null;
	/** �� 26 �ϐ��F m_WORK_ODR_CD */
	public String m_WORK_ODR_CD = null;
	/** �� 27 �ϐ��F m_LOGIN_USER_COMPANY_CD */
	public String m_LOGIN_USER_COMPANY_CD = null;
	/** �� 28 �ϐ��F m_userCD */
	public String m_userCD = null;
	/** �� 29 �ϐ��F m_ITEM_NAME */
	public String m_ITEM_NAME = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_MSG_CONTEXT_NO */
	public List l_MSG_CONTEXT_NO = null;

	/** �� 2 List�ϐ��F l_MSG_BUSINESS_CD */
	public List l_MSG_BUSINESS_CD = null;

	/** �� 3 List�ϐ��F l_h_ITEM_CD */
	public List l_h_ITEM_CD = null;

	/** �� 4 List�ϐ��F l_l_PUCH_ODR_CD */
	public List l_l_PUCH_ODR_CD = null;

	/** �� 5 List�ϐ��F l_ITEM_CD_VIEW */
	public List l_ITEM_CD_VIEW = null;

	/** �� 6 List�ϐ��F l_PUCH_ODR_QTY */
	public List l_PUCH_ODR_QTY = null;

	/** �� 7 List�ϐ��F l_SUM_ACPT_QTY */
	public List l_SUM_ACPT_QTY = null;

	/** �� 8 List�ϐ��F l_SRCS */
	public List l_SRCS = null;

	/** �� 9 List�ϐ��F l_PUCH_ODR_DLV_DATE */
	public List l_PUCH_ODR_DLV_DATE = null;

	/** �� 10 List�ϐ��F l_VEND_ITEM_CD */
	public List l_VEND_ITEM_CD = null;

	/** �� 11 List�ϐ��F l_VEND_CD */
	public List l_VEND_CD = null;

	/** �� 12 List�ϐ��F l_VEND_NAME */
	public List l_VEND_NAME = null;

	/** �� 13 List�ϐ��F l_PUCH_ODR_STS_NAME */
	public List l_PUCH_ODR_STS_NAME = null;

	/** �� 14 List�ϐ��F l_PUCH_ODR_STS_TYP */
	public List l_PUCH_ODR_STS_TYP = null;

	/** �� 15 List�ϐ��F l_WH_NAME */
	public List l_WH_NAME = null;

	/** �� 16 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 17 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 18 List�ϐ��F l_DISPLAY_NAME */
	public List l_DISPLAY_NAME = null;

	/** �� 19 List�ϐ��F l_PARENT_ITEM_CD */
	public List l_PARENT_ITEM_CD = null;

	/** �� 20 List�ϐ��F l_PARENT_ITEM_NAME */
	public List l_PARENT_ITEM_NAME = null;

	/** �� 21 List�ϐ��F l_PUCH_ODR_START_DATE */
	public List l_PUCH_ODR_START_DATE = null;

	/** �� 22 List�ϐ��F l_WORK_IN_PROC_CD */
	public List l_WORK_IN_PROC_CD = null;

	/** �� 23 List�ϐ��F l_WS_CD */
	public List l_WS_CD = null;

	/** �� 24 List�ϐ��F l_WS_NAME */
	public List l_WS_NAME = null;

	/** �� 25 List�ϐ��F l_OPR_INST_CD */
	public List l_OPR_INST_CD = null;

	/** �� 26 List�ϐ��F l_WORK_ODR_CD */
	public List l_WORK_ODR_CD = null;

	/** �� 27 List�ϐ��F l_LOGIN_USER_COMPANY_CD */
	public List l_LOGIN_USER_COMPANY_CD = null;

	/** �� 28 List�ϐ��F l_userCD */
	public List l_userCD = null;

	/** �� 29 List�ϐ��F l_ITEM_NAME */
	public List l_ITEM_NAME = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getMSG_CONTEXT_NO() { return m_MSG_CONTEXT_NO; }
	public String getMSG_BUSINESS_CD() { return m_MSG_BUSINESS_CD; }
	public String geth_ITEM_CD() { return m_h_ITEM_CD; }
	public String getl_PUCH_ODR_CD() { return m_l_PUCH_ODR_CD; }
	public String getITEM_CD_VIEW() { return m_ITEM_CD_VIEW; }
	public String getPUCH_ODR_QTY() { return m_PUCH_ODR_QTY; }
	public String getSUM_ACPT_QTY() { return m_SUM_ACPT_QTY; }
	public String getSRCS() { return m_SRCS; }
	public String getPUCH_ODR_DLV_DATE() { return m_PUCH_ODR_DLV_DATE; }
	public String getVEND_ITEM_CD() { return m_VEND_ITEM_CD; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getVEND_NAME() { return m_VEND_NAME; }
	public String getPUCH_ODR_STS_NAME() { return m_PUCH_ODR_STS_NAME; }
	public String getPUCH_ODR_STS_TYP() { return m_PUCH_ODR_STS_TYP; }
	public String getWH_NAME() { return m_WH_NAME; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getDISPLAY_NAME() { return m_DISPLAY_NAME; }
	public String getPARENT_ITEM_CD() { return m_PARENT_ITEM_CD; }
	public String getPARENT_ITEM_NAME() { return m_PARENT_ITEM_NAME; }
	public String getPUCH_ODR_START_DATE() { return m_PUCH_ODR_START_DATE; }
	public String getWORK_IN_PROC_CD() { return m_WORK_IN_PROC_CD; }
	public String getWS_CD() { return m_WS_CD; }
	public String getWS_NAME() { return m_WS_NAME; }
	public String getOPR_INST_CD() { return m_OPR_INST_CD; }
	public String getWORK_ODR_CD() { return m_WORK_ODR_CD; }
	public String getLOGIN_USER_COMPANY_CD() { return m_LOGIN_USER_COMPANY_CD; }
	public String getuserCD() { return m_userCD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }

	public List getList_MSG_CONTEXT_NO() { return l_MSG_CONTEXT_NO; }
	public List getList_MSG_BUSINESS_CD() { return l_MSG_BUSINESS_CD; }
	public List getList_h_ITEM_CD() { return l_h_ITEM_CD; }
	public List getList_l_PUCH_ODR_CD() { return l_l_PUCH_ODR_CD; }
	public List getList_ITEM_CD_VIEW() { return l_ITEM_CD_VIEW; }
	public List getList_PUCH_ODR_QTY() { return l_PUCH_ODR_QTY; }
	public List getList_SUM_ACPT_QTY() { return l_SUM_ACPT_QTY; }
	public List getList_SRCS() { return l_SRCS; }
	public List getList_PUCH_ODR_DLV_DATE() { return l_PUCH_ODR_DLV_DATE; }
	public List getList_VEND_ITEM_CD() { return l_VEND_ITEM_CD; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_VEND_NAME() { return l_VEND_NAME; }
	public List getList_PUCH_ODR_STS_NAME() { return l_PUCH_ODR_STS_NAME; }
	public List getList_PUCH_ODR_STS_TYP() { return l_PUCH_ODR_STS_TYP; }
	public List getList_WH_NAME() { return l_WH_NAME; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_DISPLAY_NAME() { return l_DISPLAY_NAME; }
	public List getList_PARENT_ITEM_CD() { return l_PARENT_ITEM_CD; }
	public List getList_PARENT_ITEM_NAME() { return l_PARENT_ITEM_NAME; }
	public List getList_PUCH_ODR_START_DATE() { return l_PUCH_ODR_START_DATE; }
	public List getList_WORK_IN_PROC_CD() { return l_WORK_IN_PROC_CD; }
	public List getList_WS_CD() { return l_WS_CD; }
	public List getList_WS_NAME() { return l_WS_NAME; }
	public List getList_OPR_INST_CD() { return l_OPR_INST_CD; }
	public List getList_WORK_ODR_CD() { return l_WORK_ODR_CD; }
	public List getList_LOGIN_USER_COMPANY_CD() { return l_LOGIN_USER_COMPANY_CD; }
	public List getList_userCD() { return l_userCD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }

	public void setMSG_CONTEXT_NO(String val) { m_MSG_CONTEXT_NO = val; }
	public void setMSG_BUSINESS_CD(String val) { m_MSG_BUSINESS_CD = val; }
	public void seth_ITEM_CD(String val) { m_h_ITEM_CD = val; }
	public void setl_PUCH_ODR_CD(String val) { m_l_PUCH_ODR_CD = val; }
	public void setITEM_CD_VIEW(String val) { m_ITEM_CD_VIEW = val; }
	public void setPUCH_ODR_QTY(String val) { m_PUCH_ODR_QTY = val; }
	public void setSUM_ACPT_QTY(String val) { m_SUM_ACPT_QTY = val; }
	public void setSRCS(String val) { m_SRCS = val; }
	public void setPUCH_ODR_DLV_DATE(String val) { m_PUCH_ODR_DLV_DATE = val; }
	public void setVEND_ITEM_CD(String val) { m_VEND_ITEM_CD = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void setVEND_NAME(String val) { m_VEND_NAME = val; }
	public void setPUCH_ODR_STS_NAME(String val) { m_PUCH_ODR_STS_NAME = val; }
	public void setPUCH_ODR_STS_TYP(String val) { m_PUCH_ODR_STS_TYP = val; }
	public void setWH_NAME(String val) { m_WH_NAME = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setDISPLAY_NAME(String val) { m_DISPLAY_NAME = val; }
	public void setPARENT_ITEM_CD(String val) { m_PARENT_ITEM_CD = val; }
	public void setPARENT_ITEM_NAME(String val) { m_PARENT_ITEM_NAME = val; }
	public void setPUCH_ODR_START_DATE(String val) { m_PUCH_ODR_START_DATE = val; }
	public void setWORK_IN_PROC_CD(String val) { m_WORK_IN_PROC_CD = val; }
	public void setWS_CD(String val) { m_WS_CD = val; }
	public void setWS_NAME(String val) { m_WS_NAME = val; }
	public void setOPR_INST_CD(String val) { m_OPR_INST_CD = val; }
	public void setWORK_ODR_CD(String val) { m_WORK_ODR_CD = val; }
	public void setLOGIN_USER_COMPANY_CD(String val) { m_LOGIN_USER_COMPANY_CD = val; }
	public void setuserCD(String val) { m_userCD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }


	public void setList_MSG_CONTEXT_NO(List list) { l_MSG_CONTEXT_NO = list; }
	public void setList_MSG_BUSINESS_CD(List list) { l_MSG_BUSINESS_CD = list; }
	public void setList_h_ITEM_CD(List list) { l_h_ITEM_CD = list; }
	public void setList_l_PUCH_ODR_CD(List list) { l_l_PUCH_ODR_CD = list; }
	public void setList_ITEM_CD_VIEW(List list) { l_ITEM_CD_VIEW = list; }
	public void setList_PUCH_ODR_QTY(List list) { l_PUCH_ODR_QTY = list; }
	public void setList_SUM_ACPT_QTY(List list) { l_SUM_ACPT_QTY = list; }
	public void setList_SRCS(List list) { l_SRCS = list; }
	public void setList_PUCH_ODR_DLV_DATE(List list) { l_PUCH_ODR_DLV_DATE = list; }
	public void setList_VEND_ITEM_CD(List list) { l_VEND_ITEM_CD = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_VEND_NAME(List list) { l_VEND_NAME = list; }
	public void setList_PUCH_ODR_STS_NAME(List list) { l_PUCH_ODR_STS_NAME = list; }
	public void setList_PUCH_ODR_STS_TYP(List list) { l_PUCH_ODR_STS_TYP = list; }
	public void setList_WH_NAME(List list) { l_WH_NAME = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_DISPLAY_NAME(List list) { l_DISPLAY_NAME = list; }
	public void setList_PARENT_ITEM_CD(List list) { l_PARENT_ITEM_CD = list; }
	public void setList_PARENT_ITEM_NAME(List list) { l_PARENT_ITEM_NAME = list; }
	public void setList_PUCH_ODR_START_DATE(List list) { l_PUCH_ODR_START_DATE = list; }
	public void setList_WORK_IN_PROC_CD(List list) { l_WORK_IN_PROC_CD = list; }
	public void setList_WS_CD(List list) { l_WS_CD = list; }
	public void setList_WS_NAME(List list) { l_WS_NAME = list; }
	public void setList_OPR_INST_CD(List list) { l_OPR_INST_CD = list; }
	public void setList_WORK_ODR_CD(List list) { l_WORK_ODR_CD = list; }
	public void setList_LOGIN_USER_COMPANY_CD(List list) { l_LOGIN_USER_COMPANY_CD = list; }
	public void setList_userCD(List list) { l_userCD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }

	public int setL2L_MSG_CONTEXT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MSG_CONTEXT_NO == null) {
			l_MSG_CONTEXT_NO = new ArrayList();
		} else {
			l_MSG_CONTEXT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MSG_CONTEXT_NO.add(((AF0120010Struct) list.get(i)).getMSG_CONTEXT_NO());
		}
		return size;
	}
	public int setL2L_MSG_BUSINESS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MSG_BUSINESS_CD == null) {
			l_MSG_BUSINESS_CD = new ArrayList();
		} else {
			l_MSG_BUSINESS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MSG_BUSINESS_CD.add(((AF0120010Struct) list.get(i)).getMSG_BUSINESS_CD());
		}
		return size;
	}
	public int setL2L_h_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ITEM_CD == null) {
			l_h_ITEM_CD = new ArrayList();
		} else {
			l_h_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ITEM_CD.add(((AF0120010Struct) list.get(i)).geth_ITEM_CD());
		}
		return size;
	}
	public int setL2L_l_PUCH_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PUCH_ODR_CD == null) {
			l_l_PUCH_ODR_CD = new ArrayList();
		} else {
			l_l_PUCH_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PUCH_ODR_CD.add(((AF0120010Struct) list.get(i)).getl_PUCH_ODR_CD());
		}
		return size;
	}
	public int setL2L_ITEM_CD_VIEW(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CD_VIEW == null) {
			l_ITEM_CD_VIEW = new ArrayList();
		} else {
			l_ITEM_CD_VIEW.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CD_VIEW.add(((AF0120010Struct) list.get(i)).getITEM_CD_VIEW());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_QTY == null) {
			l_PUCH_ODR_QTY = new ArrayList();
		} else {
			l_PUCH_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_QTY.add(((AF0120010Struct) list.get(i)).getPUCH_ODR_QTY());
		}
		return size;
	}
	public int setL2L_SUM_ACPT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUM_ACPT_QTY == null) {
			l_SUM_ACPT_QTY = new ArrayList();
		} else {
			l_SUM_ACPT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUM_ACPT_QTY.add(((AF0120010Struct) list.get(i)).getSUM_ACPT_QTY());
		}
		return size;
	}
	public int setL2L_SRCS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SRCS == null) {
			l_SRCS = new ArrayList();
		} else {
			l_SRCS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SRCS.add(((AF0120010Struct) list.get(i)).getSRCS());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_DLV_DATE == null) {
			l_PUCH_ODR_DLV_DATE = new ArrayList();
		} else {
			l_PUCH_ODR_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_DLV_DATE.add(((AF0120010Struct) list.get(i)).getPUCH_ODR_DLV_DATE());
		}
		return size;
	}
	public int setL2L_VEND_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_ITEM_CD == null) {
			l_VEND_ITEM_CD = new ArrayList();
		} else {
			l_VEND_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_ITEM_CD.add(((AF0120010Struct) list.get(i)).getVEND_ITEM_CD());
		}
		return size;
	}
	public int setL2L_VEND_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_CD == null) {
			l_VEND_CD = new ArrayList();
		} else {
			l_VEND_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_CD.add(((AF0120010Struct) list.get(i)).getVEND_CD());
		}
		return size;
	}
	public int setL2L_VEND_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_NAME == null) {
			l_VEND_NAME = new ArrayList();
		} else {
			l_VEND_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_NAME.add(((AF0120010Struct) list.get(i)).getVEND_NAME());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_STS_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_STS_NAME == null) {
			l_PUCH_ODR_STS_NAME = new ArrayList();
		} else {
			l_PUCH_ODR_STS_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_STS_NAME.add(((AF0120010Struct) list.get(i)).getPUCH_ODR_STS_NAME());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_STS_TYP == null) {
			l_PUCH_ODR_STS_TYP = new ArrayList();
		} else {
			l_PUCH_ODR_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_STS_TYP.add(((AF0120010Struct) list.get(i)).getPUCH_ODR_STS_TYP());
		}
		return size;
	}
	public int setL2L_WH_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WH_NAME == null) {
			l_WH_NAME = new ArrayList();
		} else {
			l_WH_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WH_NAME.add(((AF0120010Struct) list.get(i)).getWH_NAME());
		}
		return size;
	}
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
			l_ITEM_CD.add(((AF0120010Struct) list.get(i)).getITEM_CD());
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
			l_PLANT_CD.add(((AF0120010Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_DISPLAY_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DISPLAY_NAME == null) {
			l_DISPLAY_NAME = new ArrayList();
		} else {
			l_DISPLAY_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DISPLAY_NAME.add(((AF0120010Struct) list.get(i)).getDISPLAY_NAME());
		}
		return size;
	}
	public int setL2L_PARENT_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PARENT_ITEM_CD == null) {
			l_PARENT_ITEM_CD = new ArrayList();
		} else {
			l_PARENT_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PARENT_ITEM_CD.add(((AF0120010Struct) list.get(i)).getPARENT_ITEM_CD());
		}
		return size;
	}
	public int setL2L_PARENT_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PARENT_ITEM_NAME == null) {
			l_PARENT_ITEM_NAME = new ArrayList();
		} else {
			l_PARENT_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PARENT_ITEM_NAME.add(((AF0120010Struct) list.get(i)).getPARENT_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_START_DATE == null) {
			l_PUCH_ODR_START_DATE = new ArrayList();
		} else {
			l_PUCH_ODR_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_START_DATE.add(((AF0120010Struct) list.get(i)).getPUCH_ODR_START_DATE());
		}
		return size;
	}
	public int setL2L_WORK_IN_PROC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WORK_IN_PROC_CD == null) {
			l_WORK_IN_PROC_CD = new ArrayList();
		} else {
			l_WORK_IN_PROC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WORK_IN_PROC_CD.add(((AF0120010Struct) list.get(i)).getWORK_IN_PROC_CD());
		}
		return size;
	}
	public int setL2L_WS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WS_CD == null) {
			l_WS_CD = new ArrayList();
		} else {
			l_WS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WS_CD.add(((AF0120010Struct) list.get(i)).getWS_CD());
		}
		return size;
	}
	public int setL2L_WS_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WS_NAME == null) {
			l_WS_NAME = new ArrayList();
		} else {
			l_WS_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WS_NAME.add(((AF0120010Struct) list.get(i)).getWS_NAME());
		}
		return size;
	}
	public int setL2L_OPR_INST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_INST_CD == null) {
			l_OPR_INST_CD = new ArrayList();
		} else {
			l_OPR_INST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_INST_CD.add(((AF0120010Struct) list.get(i)).getOPR_INST_CD());
		}
		return size;
	}
	public int setL2L_WORK_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WORK_ODR_CD == null) {
			l_WORK_ODR_CD = new ArrayList();
		} else {
			l_WORK_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WORK_ODR_CD.add(((AF0120010Struct) list.get(i)).getWORK_ODR_CD());
		}
		return size;
	}
	public int setL2L_LOGIN_USER_COMPANY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOGIN_USER_COMPANY_CD == null) {
			l_LOGIN_USER_COMPANY_CD = new ArrayList();
		} else {
			l_LOGIN_USER_COMPANY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOGIN_USER_COMPANY_CD.add(((AF0120010Struct) list.get(i)).getLOGIN_USER_COMPANY_CD());
		}
		return size;
	}
	public int setL2L_userCD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_userCD == null) {
			l_userCD = new ArrayList();
		} else {
			l_userCD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_userCD.add(((AF0120010Struct) list.get(i)).getuserCD());
		}
		return size;
	}
	public int setL2L_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_NAME == null) {
			l_ITEM_NAME = new ArrayList();
		} else {
			l_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_NAME.add(((AF0120010Struct) list.get(i)).getITEM_NAME());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_MSG_CONTEXT_NO = null;
		m_MSG_BUSINESS_CD = null;
		m_h_ITEM_CD = null;
		m_l_PUCH_ODR_CD = null;
		m_ITEM_CD_VIEW = null;
		m_PUCH_ODR_QTY = null;
		m_SUM_ACPT_QTY = null;
		m_SRCS = null;
		m_PUCH_ODR_DLV_DATE = null;
		m_VEND_ITEM_CD = null;
		m_VEND_CD = null;
		m_VEND_NAME = null;
		m_PUCH_ODR_STS_NAME = null;
		m_PUCH_ODR_STS_TYP = null;
		m_WH_NAME = null;
		m_ITEM_CD = null;
		m_PLANT_CD = null;
		m_DISPLAY_NAME = null;
		m_PARENT_ITEM_CD = null;
		m_PARENT_ITEM_NAME = null;
		m_PUCH_ODR_START_DATE = null;
		m_WORK_IN_PROC_CD = null;
		m_WS_CD = null;
		m_WS_NAME = null;
		m_OPR_INST_CD = null;
		m_WORK_ODR_CD = null;
		m_LOGIN_USER_COMPANY_CD = null;
		m_userCD = null;
		m_ITEM_NAME = null;

		l_MSG_CONTEXT_NO = null;
		l_MSG_BUSINESS_CD = null;
		l_h_ITEM_CD = null;
		l_l_PUCH_ODR_CD = null;
		l_ITEM_CD_VIEW = null;
		l_PUCH_ODR_QTY = null;
		l_SUM_ACPT_QTY = null;
		l_SRCS = null;
		l_PUCH_ODR_DLV_DATE = null;
		l_VEND_ITEM_CD = null;
		l_VEND_CD = null;
		l_VEND_NAME = null;
		l_PUCH_ODR_STS_NAME = null;
		l_PUCH_ODR_STS_TYP = null;
		l_WH_NAME = null;
		l_ITEM_CD = null;
		l_PLANT_CD = null;
		l_DISPLAY_NAME = null;
		l_PARENT_ITEM_CD = null;
		l_PARENT_ITEM_NAME = null;
		l_PUCH_ODR_START_DATE = null;
		l_WORK_IN_PROC_CD = null;
		l_WS_CD = null;
		l_WS_NAME = null;
		l_OPR_INST_CD = null;
		l_WORK_ODR_CD = null;
		l_LOGIN_USER_COMPANY_CD = null;
		l_userCD = null;
		l_ITEM_NAME = null;

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
	 * medAF0120010�N���X�̕W���R���X�g���N�^
	 */
	public AF0120010Struct()
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
	public void setStruct(AF0120010Struct struct)
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
	public void setStructM(AF0120010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setMSG_CONTEXT_NO(struct.getMSG_CONTEXT_NO());
			this.setMSG_BUSINESS_CD(struct.getMSG_BUSINESS_CD());
			this.seth_ITEM_CD(struct.geth_ITEM_CD());
			this.setl_PUCH_ODR_CD(struct.getl_PUCH_ODR_CD());
			this.setITEM_CD_VIEW(struct.getITEM_CD_VIEW());
			this.setPUCH_ODR_QTY(struct.getPUCH_ODR_QTY());
			this.setSUM_ACPT_QTY(struct.getSUM_ACPT_QTY());
			this.setSRCS(struct.getSRCS());
			this.setPUCH_ODR_DLV_DATE(struct.getPUCH_ODR_DLV_DATE());
			this.setVEND_ITEM_CD(struct.getVEND_ITEM_CD());
			this.setVEND_CD(struct.getVEND_CD());
			this.setVEND_NAME(struct.getVEND_NAME());
			this.setPUCH_ODR_STS_NAME(struct.getPUCH_ODR_STS_NAME());
			this.setPUCH_ODR_STS_TYP(struct.getPUCH_ODR_STS_TYP());
			this.setWH_NAME(struct.getWH_NAME());
			this.setITEM_CD(struct.getITEM_CD());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setDISPLAY_NAME(struct.getDISPLAY_NAME());
			this.setPARENT_ITEM_CD(struct.getPARENT_ITEM_CD());
			this.setPARENT_ITEM_NAME(struct.getPARENT_ITEM_NAME());
			this.setPUCH_ODR_START_DATE(struct.getPUCH_ODR_START_DATE());
			this.setWORK_IN_PROC_CD(struct.getWORK_IN_PROC_CD());
			this.setWS_CD(struct.getWS_CD());
			this.setWS_NAME(struct.getWS_NAME());
			this.setOPR_INST_CD(struct.getOPR_INST_CD());
			this.setWORK_ODR_CD(struct.getWORK_ODR_CD());
			this.setLOGIN_USER_COMPANY_CD(struct.getLOGIN_USER_COMPANY_CD());
			this.setuserCD(struct.getuserCD());
			this.setITEM_NAME(struct.getITEM_NAME());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AF0120010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_MSG_CONTEXT_NO(struct.getList_MSG_CONTEXT_NO());
			this.setList_MSG_BUSINESS_CD(struct.getList_MSG_BUSINESS_CD());
			this.setList_h_ITEM_CD(struct.getList_h_ITEM_CD());
			this.setList_l_PUCH_ODR_CD(struct.getList_l_PUCH_ODR_CD());
			this.setList_ITEM_CD_VIEW(struct.getList_ITEM_CD_VIEW());
			this.setList_PUCH_ODR_QTY(struct.getList_PUCH_ODR_QTY());
			this.setList_SUM_ACPT_QTY(struct.getList_SUM_ACPT_QTY());
			this.setList_SRCS(struct.getList_SRCS());
			this.setList_PUCH_ODR_DLV_DATE(struct.getList_PUCH_ODR_DLV_DATE());
			this.setList_VEND_ITEM_CD(struct.getList_VEND_ITEM_CD());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_VEND_NAME(struct.getList_VEND_NAME());
			this.setList_PUCH_ODR_STS_NAME(struct.getList_PUCH_ODR_STS_NAME());
			this.setList_PUCH_ODR_STS_TYP(struct.getList_PUCH_ODR_STS_TYP());
			this.setList_WH_NAME(struct.getList_WH_NAME());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_DISPLAY_NAME(struct.getList_DISPLAY_NAME());
			this.setList_PARENT_ITEM_CD(struct.getList_PARENT_ITEM_CD());
			this.setList_PARENT_ITEM_NAME(struct.getList_PARENT_ITEM_NAME());
			this.setList_PUCH_ODR_START_DATE(struct.getList_PUCH_ODR_START_DATE());
			this.setList_WORK_IN_PROC_CD(struct.getList_WORK_IN_PROC_CD());
			this.setList_WS_CD(struct.getList_WS_CD());
			this.setList_WS_NAME(struct.getList_WS_NAME());
			this.setList_OPR_INST_CD(struct.getList_OPR_INST_CD());
			this.setList_WORK_ODR_CD(struct.getList_WORK_ODR_CD());
			this.setList_LOGIN_USER_COMPANY_CD(struct.getList_LOGIN_USER_COMPANY_CD());
			this.setList_userCD(struct.getList_userCD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
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
	// �� 1 �ϐ������l�F i_MSG_CONTEXT_NO


	final static String i_MSG_CONTEXT_NO = null;

	// �� 2 �ϐ������l�F i_MSG_BUSINESS_CD


	final static String i_MSG_BUSINESS_CD = null;

	// �� 3 �ϐ������l�F i_h_ITEM_CD


	final static String i_h_ITEM_CD = null;

	// �� 4 �ϐ������l�F i_l_PUCH_ODR_CD


	final static String i_l_PUCH_ODR_CD = null;

	// �� 5 �ϐ������l�F i_ITEM_CD_VIEW


	final static String i_ITEM_CD_VIEW = null;

	// �� 6 �ϐ������l�F i_PUCH_ODR_QTY


	final static String i_PUCH_ODR_QTY = null;

	// �� 7 �ϐ������l�F i_SUM_ACPT_QTY


	final static String i_SUM_ACPT_QTY = null;

	// �� 8 �ϐ������l�F i_SRCS


	final static String i_SRCS = null;

	// �� 9 �ϐ������l�F i_PUCH_ODR_DLV_DATE


	final static String i_PUCH_ODR_DLV_DATE = null;

	// �� 10 �ϐ������l�F i_VEND_ITEM_CD


	final static String i_VEND_ITEM_CD = null;

	// �� 11 �ϐ������l�F i_VEND_CD


	final static String i_VEND_CD = null;

	// �� 12 �ϐ������l�F i_VEND_NAME


	final static String i_VEND_NAME = null;

	// �� 13 �ϐ������l�F i_PUCH_ODR_STS_NAME


	final static String i_PUCH_ODR_STS_NAME = null;

	// �� 14 �ϐ������l�F i_PUCH_ODR_STS_TYP


	final static String i_PUCH_ODR_STS_TYP = null;

	// �� 15 �ϐ������l�F i_WH_NAME


	final static String i_WH_NAME = null;

	// �� 16 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 17 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 18 �ϐ������l�F i_DISPLAY_NAME


	final static String i_DISPLAY_NAME = null;

	// �� 19 �ϐ������l�F i_PARENT_ITEM_CD


	final static String i_PARENT_ITEM_CD = null;

	// �� 20 �ϐ������l�F i_PARENT_ITEM_NAME


	final static String i_PARENT_ITEM_NAME = null;

	// �� 21 �ϐ������l�F i_PUCH_ODR_START_DATE


	final static String i_PUCH_ODR_START_DATE = null;

	// �� 22 �ϐ������l�F i_WORK_IN_PROC_CD


	final static String i_WORK_IN_PROC_CD = null;

	// �� 23 �ϐ������l�F i_WS_CD


	final static String i_WS_CD = null;

	// �� 24 �ϐ������l�F i_WS_NAME


	final static String i_WS_NAME = null;

	// �� 25 �ϐ������l�F i_OPR_INST_CD


	final static String i_OPR_INST_CD = null;

	// �� 26 �ϐ������l�F i_WORK_ODR_CD


	final static String i_WORK_ODR_CD = null;

	// �� 27 �ϐ������l�F i_LOGIN_USER_COMPANY_CD


	final static String i_LOGIN_USER_COMPANY_CD = null;

	// �� 28 �ϐ������l�F i_userCD


	final static String i_userCD = null;

	// �� 29 �ϐ������l�F i_ITEM_NAME


	final static String i_ITEM_NAME = null;

*/

	//{{user_implement_code
		// TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
		// �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
	// �� 1 �ϐ������l�F i_PUCH_ODR_CD

	final static String i_PUCH_ODR_CD = null;

	// �� 2 �ϐ������l�F i_ITEM_CD_VIEW

	final static String i_ITEM_CD_VIEW = null;

	// �� 3 �ϐ������l�F i_PUCH_ODR_QTY

	final static String i_PUCH_ODR_QTY = null;

	// �� 4 �ϐ������l�F i_SUM_ACPT_QTY

	final static String i_SUM_ACPT_QTY = null;

	// �� 5 �ϐ������l�F i_SRCS

	final static String i_SRCS = null;

	// �� 6 �ϐ������l�F i_PUCH_ODR_DLV_DATE

	final static String i_PUCH_ODR_DLV_DATE = null;

	// �� 7 �ϐ������l�F i_CONFIRM_DLV_DATE

	final static String i_CONFIRM_DLV_DATE = null;

	// �� 8 �ϐ������l�F i_VEND_ITEM_CD

	final static String i_VEND_ITEM_CD = null;

	// �� 9 �ϐ������l�F i_VEND_CD

	final static String i_VEND_CD = null;

	// �� 10 �ϐ������l�F i_VEND_NAME

	final static String i_VEND_NAME = null;

	// �� 11 �ϐ������l�F i_ITEM_CD

	final static String i_ITEM_CD = null;

	// �� 12 �ϐ������l�F i_DISPLAY_NAME

	final static String i_DISPLAY_NAME = null;

	// �� 13 �ϐ������l�F i_PARENT_ITEM_CD

	final static String i_PARENT_ITEM_CD = null;

	// �� 14 �ϐ������l�F i_PUCH_ODR_START_DATE

	final static String i_PUCH_ODR_START_DATE = null;

	// �� 15 �ϐ������l�F i_WORK_IN_PROC_CD

	final static String i_WORK_IN_PROC_CD = null;

	// �� 16 �ϐ������l�F i_LOGIN_USER_COMPANY_CD

	final static String i_LOGIN_USER_COMPANY_CD = null;

	// �� 17 �ϐ������l�F i_userCD

	final static String i_userCD = null;

	// �� 18 �ϐ������l�F i_ITEM_NAME

	final static String i_ITEM_NAME = null;


	/**
	 * ������
	 *
	 */
	public void initialize()
	{

		clear();

		m_l_PUCH_ODR_CD = i_PUCH_ODR_CD;
		m_ITEM_CD_VIEW = i_ITEM_CD_VIEW;
		m_PUCH_ODR_QTY = i_PUCH_ODR_QTY;
		m_SUM_ACPT_QTY = i_SUM_ACPT_QTY;
		m_SRCS = i_SRCS;
		m_PUCH_ODR_DLV_DATE = i_PUCH_ODR_DLV_DATE;
		m_VEND_ITEM_CD = i_VEND_ITEM_CD;
		m_VEND_CD = i_VEND_CD;
		m_VEND_NAME = i_VEND_NAME;
		m_ITEM_CD = i_ITEM_CD;
		m_DISPLAY_NAME = i_DISPLAY_NAME;
		m_PARENT_ITEM_CD = i_PARENT_ITEM_CD;
		m_PUCH_ODR_START_DATE = i_PUCH_ODR_START_DATE;
		m_WORK_IN_PROC_CD = i_WORK_IN_PROC_CD;
		m_LOGIN_USER_COMPANY_CD = i_LOGIN_USER_COMPANY_CD;
		m_userCD = i_userCD;
		m_ITEM_NAME = i_ITEM_NAME;
	}
		// TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
