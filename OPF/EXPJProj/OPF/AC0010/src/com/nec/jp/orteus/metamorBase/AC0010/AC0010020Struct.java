/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0010/src/com/nec/jp/orteus/metamorBase/AC0010/AC0010020Struct.java,v $
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

public class AC0010020Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_PRINT_DATE */
	public String m_PRINT_DATE = null;
	/** �� 2 �ϐ��F m_PAGE_NO */
	public Integer m_PAGE_NO = null;
	/** �� 3 �ϐ��F m_TOTAL_PAGE */
	public Integer m_TOTAL_PAGE = null;
	/** �� 4 �ϐ��F m_c_CHECK3 */
	public String m_c_CHECK3 = null;
	/** �� 5 �ϐ��F m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** �� 6 �ϐ��F m_SUBMIT_BUTTON_TYPE */
	public String m_SUBMIT_BUTTON_TYPE = null;
	/** �� 7 �ϐ��F m_PRINTER_TYPE */
	public String m_PRINTER_TYPE = null;
	/** �� 8 �ϐ��F m_SELECTED_PRINTER */
	public String m_SELECTED_PRINTER = null;
	/** �� 9 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 10 �ϐ��F m_MRP_DATE_FROM */
	public String m_MRP_DATE_FROM = null;
	/** �� 11 �ϐ��F m_MRP_DATE_TO */
	public String m_MRP_DATE_TO = null;
	/** �� 12 �ϐ��F m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** �� 13 �ϐ��F m_ODR_QTY */
	public String m_ODR_QTY = null;
	/** �� 14 �ϐ��F m_IN_PLANT_CD */
	public String m_IN_PLANT_CD = null;
	/** �� 15 �ϐ��F m_IN_MRP_DATE_FROM */
	public String m_IN_MRP_DATE_FROM = null;
	/** �� 16 �ϐ��F m_IN_MRP_DATE_TO */
	public String m_IN_MRP_DATE_TO = null;
	/** �� 17 �ϐ��F m_IN_JOB_ODR_CD */
	public String m_IN_JOB_ODR_CD = null;
	/** �� 18 �ϐ��F m_user_PLANT_CD */
	public String m_user_PLANT_CD = null;
	/** �� 19 �ϐ��F m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** �� 20 �ϐ��F m_OD_NO */
	public String m_OD_NO = null;
	/** �� 21 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 22 �ϐ��F m_MRP_DATE */
	public String m_MRP_DATE = null;
	/** �� 23 �ϐ��F m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** �� 24 �ϐ��F m_JOB_ODR_DETAIL_NO */
	public String m_JOB_ODR_DETAIL_NO = null;
	/** �� 25 �ϐ��F m_JOB_ODR_CANCEL_NO */
	public String m_JOB_ODR_CANCEL_NO = null;
	/** �� 26 �ϐ��F m_DUE_DATE */
	public String m_DUE_DATE = null;
	/** �� 27 �ϐ��F m_PRD_DUE_DATE */
	public String m_PRD_DUE_DATE = null;
	/** �� 28 �ϐ��F m_DM_QTY */
	public String m_DM_QTY = null;
	/** �� 29 �ϐ��F m_MSG */
	public String m_MSG = null;
	/** �� 30 �ϐ��F m_IN_c_CHECK3 */
	public String m_IN_c_CHECK3 = null;
	/** �� 31 �ϐ��F m_BUSINESS_OPR_DATE */
	public String m_BUSINESS_OPR_DATE = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_PRINT_DATE */
	public List l_PRINT_DATE = null;

	/** �� 2 List�ϐ��F l_PAGE_NO */
	public List l_PAGE_NO = null;

	/** �� 3 List�ϐ��F l_TOTAL_PAGE */
	public List l_TOTAL_PAGE = null;

	/** �� 4 List�ϐ��F l_c_CHECK3 */
	public List l_c_CHECK3 = null;

	/** �� 5 List�ϐ��F l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** �� 6 List�ϐ��F l_SUBMIT_BUTTON_TYPE */
	public List l_SUBMIT_BUTTON_TYPE = null;

	/** �� 7 List�ϐ��F l_PRINTER_TYPE */
	public List l_PRINTER_TYPE = null;

	/** �� 8 List�ϐ��F l_SELECTED_PRINTER */
	public List l_SELECTED_PRINTER = null;

	/** �� 9 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 10 List�ϐ��F l_MRP_DATE_FROM */
	public List l_MRP_DATE_FROM = null;

	/** �� 11 List�ϐ��F l_MRP_DATE_TO */
	public List l_MRP_DATE_TO = null;

	/** �� 12 List�ϐ��F l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** �� 13 List�ϐ��F l_ODR_QTY */
	public List l_ODR_QTY = null;

	/** �� 14 List�ϐ��F l_IN_PLANT_CD */
	public List l_IN_PLANT_CD = null;

	/** �� 15 List�ϐ��F l_IN_MRP_DATE_FROM */
	public List l_IN_MRP_DATE_FROM = null;

	/** �� 16 List�ϐ��F l_IN_MRP_DATE_TO */
	public List l_IN_MRP_DATE_TO = null;

	/** �� 17 List�ϐ��F l_IN_JOB_ODR_CD */
	public List l_IN_JOB_ODR_CD = null;

	/** �� 18 List�ϐ��F l_user_PLANT_CD */
	public List l_user_PLANT_CD = null;

	/** �� 19 List�ϐ��F l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** �� 20 List�ϐ��F l_OD_NO */
	public List l_OD_NO = null;

	/** �� 21 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 22 List�ϐ��F l_MRP_DATE */
	public List l_MRP_DATE = null;

	/** �� 23 List�ϐ��F l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** �� 24 List�ϐ��F l_JOB_ODR_DETAIL_NO */
	public List l_JOB_ODR_DETAIL_NO = null;

	/** �� 25 List�ϐ��F l_JOB_ODR_CANCEL_NO */
	public List l_JOB_ODR_CANCEL_NO = null;

	/** �� 26 List�ϐ��F l_DUE_DATE */
	public List l_DUE_DATE = null;

	/** �� 27 List�ϐ��F l_PRD_DUE_DATE */
	public List l_PRD_DUE_DATE = null;

	/** �� 28 List�ϐ��F l_DM_QTY */
	public List l_DM_QTY = null;

	/** �� 29 List�ϐ��F l_MSG */
	public List l_MSG = null;

	/** �� 30 List�ϐ��F l_IN_c_CHECK3 */
	public List l_IN_c_CHECK3 = null;

	/** �� 31 List�ϐ��F l_BUSINESS_OPR_DATE */
	public List l_BUSINESS_OPR_DATE = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getPRINT_DATE() { return m_PRINT_DATE; }
	public Integer getPAGE_NO() { return m_PAGE_NO; }
	public Integer getTOTAL_PAGE() { return m_TOTAL_PAGE; }
	public String getc_CHECK3() { return m_c_CHECK3; }
	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getSUBMIT_BUTTON_TYPE() { return m_SUBMIT_BUTTON_TYPE; }
	public String getPRINTER_TYPE() { return m_PRINTER_TYPE; }
	public String getSELECTED_PRINTER() { return m_SELECTED_PRINTER; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getMRP_DATE_FROM() { return m_MRP_DATE_FROM; }
	public String getMRP_DATE_TO() { return m_MRP_DATE_TO; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getODR_QTY() { return m_ODR_QTY; }
	public String getIN_PLANT_CD() { return m_IN_PLANT_CD; }
	public String getIN_MRP_DATE_FROM() { return m_IN_MRP_DATE_FROM; }
	public String getIN_MRP_DATE_TO() { return m_IN_MRP_DATE_TO; }
	public String getIN_JOB_ODR_CD() { return m_IN_JOB_ODR_CD; }
	public String getuser_PLANT_CD() { return m_user_PLANT_CD; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getOD_NO() { return m_OD_NO; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getMRP_DATE() { return m_MRP_DATE; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getJOB_ODR_DETAIL_NO() { return m_JOB_ODR_DETAIL_NO; }
	public String getJOB_ODR_CANCEL_NO() { return m_JOB_ODR_CANCEL_NO; }
	public String getDUE_DATE() { return m_DUE_DATE; }
	public String getPRD_DUE_DATE() { return m_PRD_DUE_DATE; }
	public String getDM_QTY() { return m_DM_QTY; }
	public String getMSG() { return m_MSG; }
	public String getIN_c_CHECK3() { return m_IN_c_CHECK3; }
	public String getBUSINESS_OPR_DATE() { return m_BUSINESS_OPR_DATE; }

	public List getList_PRINT_DATE() { return l_PRINT_DATE; }
	public List getList_PAGE_NO() { return l_PAGE_NO; }
	public List getList_TOTAL_PAGE() { return l_TOTAL_PAGE; }
	public List getList_c_CHECK3() { return l_c_CHECK3; }
	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_SUBMIT_BUTTON_TYPE() { return l_SUBMIT_BUTTON_TYPE; }
	public List getList_PRINTER_TYPE() { return l_PRINTER_TYPE; }
	public List getList_SELECTED_PRINTER() { return l_SELECTED_PRINTER; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_MRP_DATE_FROM() { return l_MRP_DATE_FROM; }
	public List getList_MRP_DATE_TO() { return l_MRP_DATE_TO; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_ODR_QTY() { return l_ODR_QTY; }
	public List getList_IN_PLANT_CD() { return l_IN_PLANT_CD; }
	public List getList_IN_MRP_DATE_FROM() { return l_IN_MRP_DATE_FROM; }
	public List getList_IN_MRP_DATE_TO() { return l_IN_MRP_DATE_TO; }
	public List getList_IN_JOB_ODR_CD() { return l_IN_JOB_ODR_CD; }
	public List getList_user_PLANT_CD() { return l_user_PLANT_CD; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_OD_NO() { return l_OD_NO; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_MRP_DATE() { return l_MRP_DATE; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_JOB_ODR_DETAIL_NO() { return l_JOB_ODR_DETAIL_NO; }
	public List getList_JOB_ODR_CANCEL_NO() { return l_JOB_ODR_CANCEL_NO; }
	public List getList_DUE_DATE() { return l_DUE_DATE; }
	public List getList_PRD_DUE_DATE() { return l_PRD_DUE_DATE; }
	public List getList_DM_QTY() { return l_DM_QTY; }
	public List getList_MSG() { return l_MSG; }
	public List getList_IN_c_CHECK3() { return l_IN_c_CHECK3; }
	public List getList_BUSINESS_OPR_DATE() { return l_BUSINESS_OPR_DATE; }

	public void setPRINT_DATE(String val) { m_PRINT_DATE = val; }
	public void setPAGE_NO(Integer val) { m_PAGE_NO = val; }
	public void setTOTAL_PAGE(Integer val) { m_TOTAL_PAGE = val; }
	public void setc_CHECK3(String val) { m_c_CHECK3 = val; }
	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setSUBMIT_BUTTON_TYPE(String val) { m_SUBMIT_BUTTON_TYPE = val; }
	public void setPRINTER_TYPE(String val) { m_PRINTER_TYPE = val; }
	public void setSELECTED_PRINTER(String val) { m_SELECTED_PRINTER = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setMRP_DATE_FROM(String val) { m_MRP_DATE_FROM = val; }
	public void setMRP_DATE_TO(String val) { m_MRP_DATE_TO = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setODR_QTY(String val) { m_ODR_QTY = val; }
	public void setIN_PLANT_CD(String val) { m_IN_PLANT_CD = val; }
	public void setIN_MRP_DATE_FROM(String val) { m_IN_MRP_DATE_FROM = val; }
	public void setIN_MRP_DATE_TO(String val) { m_IN_MRP_DATE_TO = val; }
	public void setIN_JOB_ODR_CD(String val) { m_IN_JOB_ODR_CD = val; }
	public void setuser_PLANT_CD(String val) { m_user_PLANT_CD = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setOD_NO(String val) { m_OD_NO = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setMRP_DATE(String val) { m_MRP_DATE = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setJOB_ODR_DETAIL_NO(String val) { m_JOB_ODR_DETAIL_NO = val; }
	public void setJOB_ODR_CANCEL_NO(String val) { m_JOB_ODR_CANCEL_NO = val; }
	public void setDUE_DATE(String val) { m_DUE_DATE = val; }
	public void setPRD_DUE_DATE(String val) { m_PRD_DUE_DATE = val; }
	public void setDM_QTY(String val) { m_DM_QTY = val; }
	public void setMSG(String val) { m_MSG = val; }
	public void setIN_c_CHECK3(String val) { m_IN_c_CHECK3 = val; }
	public void setBUSINESS_OPR_DATE(String val) { m_BUSINESS_OPR_DATE = val; }

	public void setPAGE_NO(String val) { m_PAGE_NO = getInteger(val); }
	public void setTOTAL_PAGE(String val) { m_TOTAL_PAGE = getInteger(val); }

	public void setList_PRINT_DATE(List list) { l_PRINT_DATE = list; }
	public void setList_PAGE_NO(List list) { l_PAGE_NO = list; }
	public void setList_TOTAL_PAGE(List list) { l_TOTAL_PAGE = list; }
	public void setList_c_CHECK3(List list) { l_c_CHECK3 = list; }
	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_SUBMIT_BUTTON_TYPE(List list) { l_SUBMIT_BUTTON_TYPE = list; }
	public void setList_PRINTER_TYPE(List list) { l_PRINTER_TYPE = list; }
	public void setList_SELECTED_PRINTER(List list) { l_SELECTED_PRINTER = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_MRP_DATE_FROM(List list) { l_MRP_DATE_FROM = list; }
	public void setList_MRP_DATE_TO(List list) { l_MRP_DATE_TO = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_ODR_QTY(List list) { l_ODR_QTY = list; }
	public void setList_IN_PLANT_CD(List list) { l_IN_PLANT_CD = list; }
	public void setList_IN_MRP_DATE_FROM(List list) { l_IN_MRP_DATE_FROM = list; }
	public void setList_IN_MRP_DATE_TO(List list) { l_IN_MRP_DATE_TO = list; }
	public void setList_IN_JOB_ODR_CD(List list) { l_IN_JOB_ODR_CD = list; }
	public void setList_user_PLANT_CD(List list) { l_user_PLANT_CD = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_OD_NO(List list) { l_OD_NO = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_MRP_DATE(List list) { l_MRP_DATE = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_JOB_ODR_DETAIL_NO(List list) { l_JOB_ODR_DETAIL_NO = list; }
	public void setList_JOB_ODR_CANCEL_NO(List list) { l_JOB_ODR_CANCEL_NO = list; }
	public void setList_DUE_DATE(List list) { l_DUE_DATE = list; }
	public void setList_PRD_DUE_DATE(List list) { l_PRD_DUE_DATE = list; }
	public void setList_DM_QTY(List list) { l_DM_QTY = list; }
	public void setList_MSG(List list) { l_MSG = list; }
	public void setList_IN_c_CHECK3(List list) { l_IN_c_CHECK3 = list; }
	public void setList_BUSINESS_OPR_DATE(List list) { l_BUSINESS_OPR_DATE = list; }

	public int setL2L_PRINT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRINT_DATE == null) {
			l_PRINT_DATE = new ArrayList();
		} else {
			l_PRINT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRINT_DATE.add(((AC0010020Struct) list.get(i)).getPRINT_DATE());
		}
		return size;
	}
	public int setL2L_PAGE_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PAGE_NO == null) {
			l_PAGE_NO = new ArrayList();
		} else {
			l_PAGE_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PAGE_NO.add(((AC0010020Struct) list.get(i)).getPAGE_NO());
		}
		return size;
	}
	public int setL2L_TOTAL_PAGE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TOTAL_PAGE == null) {
			l_TOTAL_PAGE = new ArrayList();
		} else {
			l_TOTAL_PAGE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TOTAL_PAGE.add(((AC0010020Struct) list.get(i)).getTOTAL_PAGE());
		}
		return size;
	}
	public int setL2L_c_CHECK3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_CHECK3 == null) {
			l_c_CHECK3 = new ArrayList();
		} else {
			l_c_CHECK3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_CHECK3.add(((AC0010020Struct) list.get(i)).getc_CHECK3());
		}
		return size;
	}
	public int setL2L_DOWNLOAD_FILE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DOWNLOAD_FILE == null) {
			l_DOWNLOAD_FILE = new ArrayList();
		} else {
			l_DOWNLOAD_FILE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DOWNLOAD_FILE.add(((AC0010020Struct) list.get(i)).getDOWNLOAD_FILE());
		}
		return size;
	}
	public int setL2L_SUBMIT_BUTTON_TYPE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUBMIT_BUTTON_TYPE == null) {
			l_SUBMIT_BUTTON_TYPE = new ArrayList();
		} else {
			l_SUBMIT_BUTTON_TYPE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUBMIT_BUTTON_TYPE.add(((AC0010020Struct) list.get(i)).getSUBMIT_BUTTON_TYPE());
		}
		return size;
	}
	public int setL2L_PRINTER_TYPE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRINTER_TYPE == null) {
			l_PRINTER_TYPE = new ArrayList();
		} else {
			l_PRINTER_TYPE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRINTER_TYPE.add(((AC0010020Struct) list.get(i)).getPRINTER_TYPE());
		}
		return size;
	}
	public int setL2L_SELECTED_PRINTER(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SELECTED_PRINTER == null) {
			l_SELECTED_PRINTER = new ArrayList();
		} else {
			l_SELECTED_PRINTER.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SELECTED_PRINTER.add(((AC0010020Struct) list.get(i)).getSELECTED_PRINTER());
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
			l_PLANT_CD.add(((AC0010020Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_MRP_DATE_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_DATE_FROM == null) {
			l_MRP_DATE_FROM = new ArrayList();
		} else {
			l_MRP_DATE_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_DATE_FROM.add(((AC0010020Struct) list.get(i)).getMRP_DATE_FROM());
		}
		return size;
	}
	public int setL2L_MRP_DATE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_DATE_TO == null) {
			l_MRP_DATE_TO = new ArrayList();
		} else {
			l_MRP_DATE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_DATE_TO.add(((AC0010020Struct) list.get(i)).getMRP_DATE_TO());
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
			l_ITEM_NAME.add(((AC0010020Struct) list.get(i)).getITEM_NAME());
		}
		return size;
	}
	public int setL2L_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_QTY == null) {
			l_ODR_QTY = new ArrayList();
		} else {
			l_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_QTY.add(((AC0010020Struct) list.get(i)).getODR_QTY());
		}
		return size;
	}
	public int setL2L_IN_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_PLANT_CD == null) {
			l_IN_PLANT_CD = new ArrayList();
		} else {
			l_IN_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_PLANT_CD.add(((AC0010020Struct) list.get(i)).getIN_PLANT_CD());
		}
		return size;
	}
	public int setL2L_IN_MRP_DATE_FROM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_MRP_DATE_FROM == null) {
			l_IN_MRP_DATE_FROM = new ArrayList();
		} else {
			l_IN_MRP_DATE_FROM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_MRP_DATE_FROM.add(((AC0010020Struct) list.get(i)).getIN_MRP_DATE_FROM());
		}
		return size;
	}
	public int setL2L_IN_MRP_DATE_TO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_MRP_DATE_TO == null) {
			l_IN_MRP_DATE_TO = new ArrayList();
		} else {
			l_IN_MRP_DATE_TO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_MRP_DATE_TO.add(((AC0010020Struct) list.get(i)).getIN_MRP_DATE_TO());
		}
		return size;
	}
	public int setL2L_IN_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_JOB_ODR_CD == null) {
			l_IN_JOB_ODR_CD = new ArrayList();
		} else {
			l_IN_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_JOB_ODR_CD.add(((AC0010020Struct) list.get(i)).getIN_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_user_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_user_PLANT_CD == null) {
			l_user_PLANT_CD = new ArrayList();
		} else {
			l_user_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_user_PLANT_CD.add(((AC0010020Struct) list.get(i)).getuser_PLANT_CD());
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
			l_PLANT_NAME.add(((AC0010020Struct) list.get(i)).getPLANT_NAME());
		}
		return size;
	}
	public int setL2L_OD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OD_NO == null) {
			l_OD_NO = new ArrayList();
		} else {
			l_OD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OD_NO.add(((AC0010020Struct) list.get(i)).getOD_NO());
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
			l_ITEM_CD.add(((AC0010020Struct) list.get(i)).getITEM_CD());
		}
		return size;
	}
	public int setL2L_MRP_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_DATE == null) {
			l_MRP_DATE = new ArrayList();
		} else {
			l_MRP_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_DATE.add(((AC0010020Struct) list.get(i)).getMRP_DATE());
		}
		return size;
	}
	public int setL2L_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_CD == null) {
			l_JOB_ODR_CD = new ArrayList();
		} else {
			l_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_CD.add(((AC0010020Struct) list.get(i)).getJOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_JOB_ODR_DETAIL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_DETAIL_NO == null) {
			l_JOB_ODR_DETAIL_NO = new ArrayList();
		} else {
			l_JOB_ODR_DETAIL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_DETAIL_NO.add(((AC0010020Struct) list.get(i)).getJOB_ODR_DETAIL_NO());
		}
		return size;
	}
	public int setL2L_JOB_ODR_CANCEL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_CANCEL_NO == null) {
			l_JOB_ODR_CANCEL_NO = new ArrayList();
		} else {
			l_JOB_ODR_CANCEL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_CANCEL_NO.add(((AC0010020Struct) list.get(i)).getJOB_ODR_CANCEL_NO());
		}
		return size;
	}
	public int setL2L_DUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DUE_DATE == null) {
			l_DUE_DATE = new ArrayList();
		} else {
			l_DUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DUE_DATE.add(((AC0010020Struct) list.get(i)).getDUE_DATE());
		}
		return size;
	}
	public int setL2L_PRD_DUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRD_DUE_DATE == null) {
			l_PRD_DUE_DATE = new ArrayList();
		} else {
			l_PRD_DUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRD_DUE_DATE.add(((AC0010020Struct) list.get(i)).getPRD_DUE_DATE());
		}
		return size;
	}
	public int setL2L_DM_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DM_QTY == null) {
			l_DM_QTY = new ArrayList();
		} else {
			l_DM_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DM_QTY.add(((AC0010020Struct) list.get(i)).getDM_QTY());
		}
		return size;
	}
	public int setL2L_MSG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MSG == null) {
			l_MSG = new ArrayList();
		} else {
			l_MSG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MSG.add(((AC0010020Struct) list.get(i)).getMSG());
		}
		return size;
	}
	public int setL2L_IN_c_CHECK3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_c_CHECK3 == null) {
			l_IN_c_CHECK3 = new ArrayList();
		} else {
			l_IN_c_CHECK3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_c_CHECK3.add(((AC0010020Struct) list.get(i)).getIN_c_CHECK3());
		}
		return size;
	}
	public int setL2L_BUSINESS_OPR_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BUSINESS_OPR_DATE == null) {
			l_BUSINESS_OPR_DATE = new ArrayList();
		} else {
			l_BUSINESS_OPR_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BUSINESS_OPR_DATE.add(((AC0010020Struct) list.get(i)).getBUSINESS_OPR_DATE());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_PRINT_DATE = null;
		m_PAGE_NO = null;
		m_TOTAL_PAGE = null;
		m_c_CHECK3 = null;
		m_DOWNLOAD_FILE = null;
		m_SUBMIT_BUTTON_TYPE = null;
		m_PRINTER_TYPE = null;
		m_SELECTED_PRINTER = null;
		m_PLANT_CD = null;
		m_MRP_DATE_FROM = null;
		m_MRP_DATE_TO = null;
		m_ITEM_NAME = null;
		m_ODR_QTY = null;
		m_IN_PLANT_CD = null;
		m_IN_MRP_DATE_FROM = null;
		m_IN_MRP_DATE_TO = null;
		m_IN_JOB_ODR_CD = null;
		m_user_PLANT_CD = null;
		m_PLANT_NAME = null;
		m_OD_NO = null;
		m_ITEM_CD = null;
		m_MRP_DATE = null;
		m_JOB_ODR_CD = null;
		m_JOB_ODR_DETAIL_NO = null;
		m_JOB_ODR_CANCEL_NO = null;
		m_DUE_DATE = null;
		m_PRD_DUE_DATE = null;
		m_DM_QTY = null;
		m_MSG = null;
		m_IN_c_CHECK3 = null;
		m_BUSINESS_OPR_DATE = null;

		l_PRINT_DATE = null;
		l_PAGE_NO = null;
		l_TOTAL_PAGE = null;
		l_c_CHECK3 = null;
		l_DOWNLOAD_FILE = null;
		l_SUBMIT_BUTTON_TYPE = null;
		l_PRINTER_TYPE = null;
		l_SELECTED_PRINTER = null;
		l_PLANT_CD = null;
		l_MRP_DATE_FROM = null;
		l_MRP_DATE_TO = null;
		l_ITEM_NAME = null;
		l_ODR_QTY = null;
		l_IN_PLANT_CD = null;
		l_IN_MRP_DATE_FROM = null;
		l_IN_MRP_DATE_TO = null;
		l_IN_JOB_ODR_CD = null;
		l_user_PLANT_CD = null;
		l_PLANT_NAME = null;
		l_OD_NO = null;
		l_ITEM_CD = null;
		l_MRP_DATE = null;
		l_JOB_ODR_CD = null;
		l_JOB_ODR_DETAIL_NO = null;
		l_JOB_ODR_CANCEL_NO = null;
		l_DUE_DATE = null;
		l_PRD_DUE_DATE = null;
		l_DM_QTY = null;
		l_MSG = null;
		l_IN_c_CHECK3 = null;
		l_BUSINESS_OPR_DATE = null;

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
	 * medAC0010020�N���X�̕W���R���X�g���N�^
	 */
	public AC0010020Struct()
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
	public void setStruct(AC0010020Struct struct)
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
	public void setStructM(AC0010020Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setPRINT_DATE(struct.getPRINT_DATE());
			this.setPAGE_NO(struct.getPAGE_NO());
			this.setTOTAL_PAGE(struct.getTOTAL_PAGE());
			this.setc_CHECK3(struct.getc_CHECK3());
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setSUBMIT_BUTTON_TYPE(struct.getSUBMIT_BUTTON_TYPE());
			this.setPRINTER_TYPE(struct.getPRINTER_TYPE());
			this.setSELECTED_PRINTER(struct.getSELECTED_PRINTER());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setMRP_DATE_FROM(struct.getMRP_DATE_FROM());
			this.setMRP_DATE_TO(struct.getMRP_DATE_TO());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setODR_QTY(struct.getODR_QTY());
			this.setIN_PLANT_CD(struct.getIN_PLANT_CD());
			this.setIN_MRP_DATE_FROM(struct.getIN_MRP_DATE_FROM());
			this.setIN_MRP_DATE_TO(struct.getIN_MRP_DATE_TO());
			this.setIN_JOB_ODR_CD(struct.getIN_JOB_ODR_CD());
			this.setuser_PLANT_CD(struct.getuser_PLANT_CD());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.setOD_NO(struct.getOD_NO());
			this.setITEM_CD(struct.getITEM_CD());
			this.setMRP_DATE(struct.getMRP_DATE());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setJOB_ODR_DETAIL_NO(struct.getJOB_ODR_DETAIL_NO());
			this.setJOB_ODR_CANCEL_NO(struct.getJOB_ODR_CANCEL_NO());
			this.setDUE_DATE(struct.getDUE_DATE());
			this.setPRD_DUE_DATE(struct.getPRD_DUE_DATE());
			this.setDM_QTY(struct.getDM_QTY());
			this.setMSG(struct.getMSG());
			this.setIN_c_CHECK3(struct.getIN_c_CHECK3());
			this.setBUSINESS_OPR_DATE(struct.getBUSINESS_OPR_DATE());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AC0010020Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_PRINT_DATE(struct.getList_PRINT_DATE());
			this.setList_PAGE_NO(struct.getList_PAGE_NO());
			this.setList_TOTAL_PAGE(struct.getList_TOTAL_PAGE());
			this.setList_c_CHECK3(struct.getList_c_CHECK3());
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_SUBMIT_BUTTON_TYPE(struct.getList_SUBMIT_BUTTON_TYPE());
			this.setList_PRINTER_TYPE(struct.getList_PRINTER_TYPE());
			this.setList_SELECTED_PRINTER(struct.getList_SELECTED_PRINTER());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_MRP_DATE_FROM(struct.getList_MRP_DATE_FROM());
			this.setList_MRP_DATE_TO(struct.getList_MRP_DATE_TO());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_ODR_QTY(struct.getList_ODR_QTY());
			this.setList_IN_PLANT_CD(struct.getList_IN_PLANT_CD());
			this.setList_IN_MRP_DATE_FROM(struct.getList_IN_MRP_DATE_FROM());
			this.setList_IN_MRP_DATE_TO(struct.getList_IN_MRP_DATE_TO());
			this.setList_IN_JOB_ODR_CD(struct.getList_IN_JOB_ODR_CD());
			this.setList_user_PLANT_CD(struct.getList_user_PLANT_CD());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_OD_NO(struct.getList_OD_NO());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_MRP_DATE(struct.getList_MRP_DATE());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_JOB_ODR_DETAIL_NO(struct.getList_JOB_ODR_DETAIL_NO());
			this.setList_JOB_ODR_CANCEL_NO(struct.getList_JOB_ODR_CANCEL_NO());
			this.setList_DUE_DATE(struct.getList_DUE_DATE());
			this.setList_PRD_DUE_DATE(struct.getList_PRD_DUE_DATE());
			this.setList_DM_QTY(struct.getList_DM_QTY());
			this.setList_MSG(struct.getList_MSG());
			this.setList_IN_c_CHECK3(struct.getList_IN_c_CHECK3());
			this.setList_BUSINESS_OPR_DATE(struct.getList_BUSINESS_OPR_DATE());
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
	// �� 1 �ϐ������l�F i_PRINT_DATE


	final static String i_PRINT_DATE = null;

	// �� 2 �ϐ������l�F i_PAGE_NO


	final static Integer i_PAGE_NO = null;

	// �� 3 �ϐ������l�F i_TOTAL_PAGE


	final static Integer i_TOTAL_PAGE = null;

	// �� 4 �ϐ������l�F i_c_CHECK3


	final static String i_c_CHECK3 = null;

	// �� 5 �ϐ������l�F i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// �� 6 �ϐ������l�F i_SUBMIT_BUTTON_TYPE


	final static String i_SUBMIT_BUTTON_TYPE = null;

	// �� 7 �ϐ������l�F i_PRINTER_TYPE


	final static String i_PRINTER_TYPE = null;

	// �� 8 �ϐ������l�F i_SELECTED_PRINTER


	final static String i_SELECTED_PRINTER = null;

	// �� 9 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 10 �ϐ������l�F i_MRP_DATE_FROM


	final static String i_MRP_DATE_FROM = null;

	// �� 11 �ϐ������l�F i_MRP_DATE_TO


	final static String i_MRP_DATE_TO = null;

	// �� 12 �ϐ������l�F i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// �� 13 �ϐ������l�F i_ODR_QTY


	final static String i_ODR_QTY = null;

	// �� 14 �ϐ������l�F i_IN_PLANT_CD


	final static String i_IN_PLANT_CD = null;

	// �� 15 �ϐ������l�F i_IN_MRP_DATE_FROM


	final static String i_IN_MRP_DATE_FROM = null;

	// �� 16 �ϐ������l�F i_IN_MRP_DATE_TO


	final static String i_IN_MRP_DATE_TO = null;

	// �� 17 �ϐ������l�F i_IN_JOB_ODR_CD


	final static String i_IN_JOB_ODR_CD = null;

	// �� 18 �ϐ������l�F i_user_PLANT_CD


	final static String i_user_PLANT_CD = null;

	// �� 19 �ϐ������l�F i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// �� 20 �ϐ������l�F i_OD_NO


	final static String i_OD_NO = null;

	// �� 21 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 22 �ϐ������l�F i_MRP_DATE


	final static String i_MRP_DATE = null;

	// �� 23 �ϐ������l�F i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// �� 24 �ϐ������l�F i_JOB_ODR_DETAIL_NO


	final static String i_JOB_ODR_DETAIL_NO = null;

	// �� 25 �ϐ������l�F i_JOB_ODR_CANCEL_NO


	final static String i_JOB_ODR_CANCEL_NO = null;

	// �� 26 �ϐ������l�F i_DUE_DATE


	final static String i_DUE_DATE = null;

	// �� 27 �ϐ������l�F i_PRD_DUE_DATE


	final static String i_PRD_DUE_DATE = null;

	// �� 28 �ϐ������l�F i_DM_QTY


	final static String i_DM_QTY = null;

	// �� 29 �ϐ������l�F i_MSG


	final static String i_MSG = null;

	// �� 30 �ϐ������l�F i_IN_c_CHECK3


	final static String i_IN_c_CHECK3 = null;

	// �� 31 �ϐ������l�F i_BUSINESS_OPR_DATE


	final static String i_BUSINESS_OPR_DATE = null;

*/

	//{{user_implement_code
         // TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
         // �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
        // �� 1 �ϐ������l�F i_PLANT_CD	
        final static String i_PLANT_CD = null;
        // �� 2 �ϐ������l�F i_MRP_DATE_FROM	
        final static String i_MRP_DATE_FROM = null;
        // �� 3 �ϐ������l�F i_MRP_DATE_TO	
        final static String i_MRP_DATE_TO = null;
        // �� 4 �ϐ������l�F i_JOB_ODR_CD	
        final static String i_JOB_ODR_CD = null;
        // �� 5 �ϐ������l�F i_OD_NO	
        final static String i_OD_NO = null;
        // �� 6 �ϐ������l�F i_ITEM_CD	
        final static String i_ITEM_CD = null;
        // �� 7 �ϐ������l�F i_MRP_DATE	
        final static String i_MRP_DATE = null;
        // �� 8 �ϐ������l�F i_JOB_ODR_DETAIL_NO	
        final static String i_JOB_ODR_DETAIL_NO = null;
        // �� 9 �ϐ������l�F i_JOB_ODR_CANCEL_NO	
        final static String i_JOB_ODR_CANCEL_NO = null;
        // �� 10 �ϐ������l�F i_DUE_DATE	
        final static String i_DUE_DATE = null;
        // �� 11 �ϐ������l�F i_PRD_DUE_DATE	
        final static String i_PRD_DUE_DATE = null;
        // �� 12 �ϐ������l�F i_DM_QTY	
        final static String i_DM_QTY = null;
        // �� 13 �ϐ������l�F i_MSG	
        final static String i_MSG = null;
        // �� 14 �ϐ������l�F i_c_CHECK3	
        final static String i_c_CHECK3 = null;
        // �� 15 �ϐ������l�F i_PLANT_NAME	
        final static String i_PLANT_NAME = null;
        // �� 16 �ϐ������l�F i_BUSINESS_OPR_DATE	
        final static String i_BUSINESS_OPR_DATE = null;
        // �� 17 �ϐ������l�F i_user_PLANT_CD	
        final static String i_user_PLANT_CD = null;
        // �� 18 �ϐ������l�F i_PRINT_DATE	
        final static String i_PRINT_DATE = null;
        // �� 19 �ϐ������l�F i_PAGE_NO	
        final static Integer i_PAGE_NO = null;
        // �� 20 �ϐ������l�F i_TOTAL_PAGE	
        final static Integer i_TOTAL_PAGE = null;
        // �� 21 �ϐ������l�F i_c_CHECK1	
        final static String i_c_CHECK1 = null;
        // �� 22 �ϐ������l�F i_c_CHECK2	
        final static String i_c_CHECK2 = null;
        // �� 23 �ϐ������l�F i_DOWNLOAD_FILE	
        final static String i_DOWNLOAD_FILE = null;
        // �� 24 �ϐ������l�F i_SUBMIT_BUTTON_TYPE	
        final static String i_SUBMIT_BUTTON_TYPE = null;
        // �� 25 �ϐ������l�F i_PRINTER_TYPE	
        final static String i_PRINTER_TYPE = null;
        // �� 26 �ϐ������l�F i_SELECTED_PRINTER	
        final static String i_SELECTED_PRINTER = null;
        // �� 27 �ϐ������l�F i_OD_ALARM_FLG	
        final static String i_OD_ALARM_FLG = null;
       
        /**
         * ������
         *
         */
        public void initialize()
        {
         m_PLANT_CD = i_PLANT_CD;
         m_MRP_DATE_FROM = i_MRP_DATE_FROM;
         m_MRP_DATE_TO = i_MRP_DATE_TO;
         m_JOB_ODR_CD = i_JOB_ODR_CD;
         m_OD_NO = i_OD_NO;
         m_ITEM_CD = i_ITEM_CD;
         m_MRP_DATE = i_MRP_DATE;
         m_JOB_ODR_DETAIL_NO = i_JOB_ODR_DETAIL_NO;
         m_JOB_ODR_CANCEL_NO = i_JOB_ODR_CANCEL_NO;
         m_DUE_DATE = i_DUE_DATE;
         m_PRD_DUE_DATE = i_PRD_DUE_DATE;
         m_DM_QTY = i_DM_QTY;
         m_MSG = i_MSG;
         m_c_CHECK3 = i_c_CHECK3;
         m_PLANT_NAME = i_PLANT_NAME;
         m_BUSINESS_OPR_DATE = i_BUSINESS_OPR_DATE;
         m_user_PLANT_CD = i_user_PLANT_CD;
         m_PRINT_DATE = i_PRINT_DATE;
         m_PAGE_NO = i_PAGE_NO;
         m_TOTAL_PAGE = i_TOTAL_PAGE;
         m_DOWNLOAD_FILE = i_DOWNLOAD_FILE;
         m_SUBMIT_BUTTON_TYPE = i_SUBMIT_BUTTON_TYPE;
         m_PRINTER_TYPE = i_PRINTER_TYPE;
         m_SELECTED_PRINTER = i_SELECTED_PRINTER;
       
         l_PLANT_CD = null;
         l_MRP_DATE_FROM = null;
         l_MRP_DATE_TO = null;
         l_JOB_ODR_CD = null;
         l_OD_NO = null;
         l_ITEM_CD = null;
         l_MRP_DATE = null;
         l_JOB_ODR_DETAIL_NO = null;
         l_JOB_ODR_CANCEL_NO = null;
         l_DUE_DATE = null;
         l_PRD_DUE_DATE = null;
         l_DM_QTY = null;
         l_MSG = null;
         l_c_CHECK3 = null;
         l_PLANT_NAME = null;
         l_BUSINESS_OPR_DATE = null;
         l_user_PLANT_CD = null;
         l_PRINT_DATE = null;
         l_PAGE_NO = null;
         l_TOTAL_PAGE = null;
         l_DOWNLOAD_FILE = null;
         l_SUBMIT_BUTTON_TYPE = null;
         l_PRINTER_TYPE = null;
         l_SELECTED_PRINTER = null;
        }
       
         // TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
