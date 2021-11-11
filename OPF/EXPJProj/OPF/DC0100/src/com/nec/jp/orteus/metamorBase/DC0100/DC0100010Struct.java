/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DC0100/src/com/nec/jp/orteus/metamorBase/DC0100/DC0100010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.DC0100;

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
 * CLASS     : DC0100010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.6 $ $Date: 2014/11/05 07:23:38 $
 *
 */
//}}user_implement_code_header

public class DC0100010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_HALF_TERM_TYP_name */
	public String m_HALF_TERM_TYP_name = null;
	/** �� 2 �ϐ��F m_HALF_TERM_TYP_val */
	public String m_HALF_TERM_TYP_val = null;
	/** �� 3 �ϐ��F m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** �� 4 �ϐ��F m_c_ReOut */
	public String m_c_ReOut = null;
	/** �� 5 �ϐ��F m_c_DC0010B001 */
	public String m_c_DC0010B001 = null;
	/** �� 6 �ϐ��F m_c_DC0020B001 */
	public String m_c_DC0020B001 = null;
	/** �� 7 �ϐ��F m_DC0010B001_0_COUNT */
	public String m_DC0010B001_0_COUNT = null;
	/** �� 8 �ϐ��F m_DC0010B001_1_COUNT */
	public String m_DC0010B001_1_COUNT = null;
	/** �� 9 �ϐ��F m_DC0020B001_0_COUNT */
	public String m_DC0020B001_0_COUNT = null;
	/** �� 10 �ϐ��F m_DC0020B001_1_COUNT */
	public String m_DC0020B001_1_COUNT = null;
	/** �� 11 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 12 �ϐ��F m_YEAR */
	public String m_YEAR = null;
	/** �� 13 �ϐ��F m_HALF_TERM_TYP */
	public String m_HALF_TERM_TYP = null;
	/** �� 14 �ϐ��F m_CURRENT_YEAR */
	public String m_CURRENT_YEAR = null;
	/** �� 15 �ϐ��F m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** �� 16 �ϐ��F m_HALF_TERM_TYP_DN */
	public String m_HALF_TERM_TYP_DN = null;
	/** �� 17 �ϐ��F m_CS_CALC_PROC_NO_DN */
	public String m_CS_CALC_PROC_NO_DN = null;
	/** �� 18 �ϐ��F m_CS_CALC_ERROR_CD */
	public String m_CS_CALC_ERROR_CD = null;
	/** �� 19 �ϐ��F m_ROOT_ITEM_CD */
	public String m_ROOT_ITEM_CD = null;
	/** �� 20 �ϐ��F m_PARENT_ITEM_CD */
	public String m_PARENT_ITEM_CD = null;
	/** �� 21 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 22 �ϐ��F m_CS_PROC_CD */
	public String m_CS_PROC_CD = null;
	/** �� 23 �ϐ��F m_PROC_COST_CLS_CD */
	public String m_PROC_COST_CLS_CD = null;
	/** �� 24 �ϐ��F m_PS_EDITION */
	public String m_PS_EDITION = null;
	/** �� 25 �ϐ��F m_MESSAGE_CD */
	public String m_MESSAGE_CD = null;
	/** �� 26 �ϐ��F m_MESSAGE */
	public String m_MESSAGE = null;
	/** �� 27 �ϐ��F m_REMARKS */
	public String m_REMARKS = null;
	/** �� 28 �ϐ��F m_LIST_ISS_FLG */
	public String m_LIST_ISS_FLG = null;
	/** �� 29 �ϐ��F m_CREATED_DATE */
	public String m_CREATED_DATE = null;
	/** �� 30 �ϐ��F m_CREATED_BY */
	public String m_CREATED_BY = null;
	/** �� 31 �ϐ��F m_CS_CALC_PROC_NO_1 */
	public String m_CS_CALC_PROC_NO_1 = null;
	/** �� 32 �ϐ��F m_CS_CALC_PROC_NO_2 */
	public String m_CS_CALC_PROC_NO_2 = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_HALF_TERM_TYP_name */
	public List l_HALF_TERM_TYP_name = null;

	/** �� 2 List�ϐ��F l_HALF_TERM_TYP_val */
	public List l_HALF_TERM_TYP_val = null;

	/** �� 3 List�ϐ��F l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** �� 4 List�ϐ��F l_c_ReOut */
	public List l_c_ReOut = null;

	/** �� 5 List�ϐ��F l_c_DC0010B001 */
	public List l_c_DC0010B001 = null;

	/** �� 6 List�ϐ��F l_c_DC0020B001 */
	public List l_c_DC0020B001 = null;

	/** �� 7 List�ϐ��F l_DC0010B001_0_COUNT */
	public List l_DC0010B001_0_COUNT = null;

	/** �� 8 List�ϐ��F l_DC0010B001_1_COUNT */
	public List l_DC0010B001_1_COUNT = null;

	/** �� 9 List�ϐ��F l_DC0020B001_0_COUNT */
	public List l_DC0020B001_0_COUNT = null;

	/** �� 10 List�ϐ��F l_DC0020B001_1_COUNT */
	public List l_DC0020B001_1_COUNT = null;

	/** �� 11 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 12 List�ϐ��F l_YEAR */
	public List l_YEAR = null;

	/** �� 13 List�ϐ��F l_HALF_TERM_TYP */
	public List l_HALF_TERM_TYP = null;

	/** �� 14 List�ϐ��F l_CURRENT_YEAR */
	public List l_CURRENT_YEAR = null;

	/** �� 15 List�ϐ��F l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** �� 16 List�ϐ��F l_HALF_TERM_TYP_DN */
	public List l_HALF_TERM_TYP_DN = null;

	/** �� 17 List�ϐ��F l_CS_CALC_PROC_NO_DN */
	public List l_CS_CALC_PROC_NO_DN = null;

	/** �� 18 List�ϐ��F l_CS_CALC_ERROR_CD */
	public List l_CS_CALC_ERROR_CD = null;

	/** �� 19 List�ϐ��F l_ROOT_ITEM_CD */
	public List l_ROOT_ITEM_CD = null;

	/** �� 20 List�ϐ��F l_PARENT_ITEM_CD */
	public List l_PARENT_ITEM_CD = null;

	/** �� 21 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 22 List�ϐ��F l_CS_PROC_CD */
	public List l_CS_PROC_CD = null;

	/** �� 23 List�ϐ��F l_PROC_COST_CLS_CD */
	public List l_PROC_COST_CLS_CD = null;

	/** �� 24 List�ϐ��F l_PS_EDITION */
	public List l_PS_EDITION = null;

	/** �� 25 List�ϐ��F l_MESSAGE_CD */
	public List l_MESSAGE_CD = null;

	/** �� 26 List�ϐ��F l_MESSAGE */
	public List l_MESSAGE = null;

	/** �� 27 List�ϐ��F l_REMARKS */
	public List l_REMARKS = null;

	/** �� 28 List�ϐ��F l_LIST_ISS_FLG */
	public List l_LIST_ISS_FLG = null;

	/** �� 29 List�ϐ��F l_CREATED_DATE */
	public List l_CREATED_DATE = null;

	/** �� 30 List�ϐ��F l_CREATED_BY */
	public List l_CREATED_BY = null;

	/** �� 31 List�ϐ��F l_CS_CALC_PROC_NO_1 */
	public List l_CS_CALC_PROC_NO_1 = null;

	/** �� 32 List�ϐ��F l_CS_CALC_PROC_NO_2 */
	public List l_CS_CALC_PROC_NO_2 = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getHALF_TERM_TYP_name() { return m_HALF_TERM_TYP_name; }
	public String getHALF_TERM_TYP_val() { return m_HALF_TERM_TYP_val; }
	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getc_ReOut() { return m_c_ReOut; }
	public String getc_DC0010B001() { return m_c_DC0010B001; }
	public String getc_DC0020B001() { return m_c_DC0020B001; }
	public String getDC0010B001_0_COUNT() { return m_DC0010B001_0_COUNT; }
	public String getDC0010B001_1_COUNT() { return m_DC0010B001_1_COUNT; }
	public String getDC0020B001_0_COUNT() { return m_DC0020B001_0_COUNT; }
	public String getDC0020B001_1_COUNT() { return m_DC0020B001_1_COUNT; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getYEAR() { return m_YEAR; }
	public String getHALF_TERM_TYP() { return m_HALF_TERM_TYP; }
	public String getCURRENT_YEAR() { return m_CURRENT_YEAR; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getHALF_TERM_TYP_DN() { return m_HALF_TERM_TYP_DN; }
	public String getCS_CALC_PROC_NO_DN() { return m_CS_CALC_PROC_NO_DN; }
	public String getCS_CALC_ERROR_CD() { return m_CS_CALC_ERROR_CD; }
	public String getROOT_ITEM_CD() { return m_ROOT_ITEM_CD; }
	public String getPARENT_ITEM_CD() { return m_PARENT_ITEM_CD; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getCS_PROC_CD() { return m_CS_PROC_CD; }
	public String getPROC_COST_CLS_CD() { return m_PROC_COST_CLS_CD; }
	public String getPS_EDITION() { return m_PS_EDITION; }
	public String getMESSAGE_CD() { return m_MESSAGE_CD; }
	public String getMESSAGE() { return m_MESSAGE; }
	public String getREMARKS() { return m_REMARKS; }
	public String getLIST_ISS_FLG() { return m_LIST_ISS_FLG; }
	public String getCREATED_DATE() { return m_CREATED_DATE; }
	public String getCREATED_BY() { return m_CREATED_BY; }
	public String getCS_CALC_PROC_NO_1() { return m_CS_CALC_PROC_NO_1; }
	public String getCS_CALC_PROC_NO_2() { return m_CS_CALC_PROC_NO_2; }

	public List getList_HALF_TERM_TYP_name() { return l_HALF_TERM_TYP_name; }
	public List getList_HALF_TERM_TYP_val() { return l_HALF_TERM_TYP_val; }
	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_c_ReOut() { return l_c_ReOut; }
	public List getList_c_DC0010B001() { return l_c_DC0010B001; }
	public List getList_c_DC0020B001() { return l_c_DC0020B001; }
	public List getList_DC0010B001_0_COUNT() { return l_DC0010B001_0_COUNT; }
	public List getList_DC0010B001_1_COUNT() { return l_DC0010B001_1_COUNT; }
	public List getList_DC0020B001_0_COUNT() { return l_DC0020B001_0_COUNT; }
	public List getList_DC0020B001_1_COUNT() { return l_DC0020B001_1_COUNT; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_YEAR() { return l_YEAR; }
	public List getList_HALF_TERM_TYP() { return l_HALF_TERM_TYP; }
	public List getList_CURRENT_YEAR() { return l_CURRENT_YEAR; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_HALF_TERM_TYP_DN() { return l_HALF_TERM_TYP_DN; }
	public List getList_CS_CALC_PROC_NO_DN() { return l_CS_CALC_PROC_NO_DN; }
	public List getList_CS_CALC_ERROR_CD() { return l_CS_CALC_ERROR_CD; }
	public List getList_ROOT_ITEM_CD() { return l_ROOT_ITEM_CD; }
	public List getList_PARENT_ITEM_CD() { return l_PARENT_ITEM_CD; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_CS_PROC_CD() { return l_CS_PROC_CD; }
	public List getList_PROC_COST_CLS_CD() { return l_PROC_COST_CLS_CD; }
	public List getList_PS_EDITION() { return l_PS_EDITION; }
	public List getList_MESSAGE_CD() { return l_MESSAGE_CD; }
	public List getList_MESSAGE() { return l_MESSAGE; }
	public List getList_REMARKS() { return l_REMARKS; }
	public List getList_LIST_ISS_FLG() { return l_LIST_ISS_FLG; }
	public List getList_CREATED_DATE() { return l_CREATED_DATE; }
	public List getList_CREATED_BY() { return l_CREATED_BY; }
	public List getList_CS_CALC_PROC_NO_1() { return l_CS_CALC_PROC_NO_1; }
	public List getList_CS_CALC_PROC_NO_2() { return l_CS_CALC_PROC_NO_2; }

	public void setHALF_TERM_TYP_name(String val) { m_HALF_TERM_TYP_name = val; }
	public void setHALF_TERM_TYP_val(String val) { m_HALF_TERM_TYP_val = val; }
	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setc_ReOut(String val) { m_c_ReOut = val; }
	public void setc_DC0010B001(String val) { m_c_DC0010B001 = val; }
	public void setc_DC0020B001(String val) { m_c_DC0020B001 = val; }
	public void setDC0010B001_0_COUNT(String val) { m_DC0010B001_0_COUNT = val; }
	public void setDC0010B001_1_COUNT(String val) { m_DC0010B001_1_COUNT = val; }
	public void setDC0020B001_0_COUNT(String val) { m_DC0020B001_0_COUNT = val; }
	public void setDC0020B001_1_COUNT(String val) { m_DC0020B001_1_COUNT = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setYEAR(String val) { m_YEAR = val; }
	public void setHALF_TERM_TYP(String val) { m_HALF_TERM_TYP = val; }
	public void setCURRENT_YEAR(String val) { m_CURRENT_YEAR = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setHALF_TERM_TYP_DN(String val) { m_HALF_TERM_TYP_DN = val; }
	public void setCS_CALC_PROC_NO_DN(String val) { m_CS_CALC_PROC_NO_DN = val; }
	public void setCS_CALC_ERROR_CD(String val) { m_CS_CALC_ERROR_CD = val; }
	public void setROOT_ITEM_CD(String val) { m_ROOT_ITEM_CD = val; }
	public void setPARENT_ITEM_CD(String val) { m_PARENT_ITEM_CD = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setCS_PROC_CD(String val) { m_CS_PROC_CD = val; }
	public void setPROC_COST_CLS_CD(String val) { m_PROC_COST_CLS_CD = val; }
	public void setPS_EDITION(String val) { m_PS_EDITION = val; }
	public void setMESSAGE_CD(String val) { m_MESSAGE_CD = val; }
	public void setMESSAGE(String val) { m_MESSAGE = val; }
	public void setREMARKS(String val) { m_REMARKS = val; }
	public void setLIST_ISS_FLG(String val) { m_LIST_ISS_FLG = val; }
	public void setCREATED_DATE(String val) { m_CREATED_DATE = val; }
	public void setCREATED_BY(String val) { m_CREATED_BY = val; }
	public void setCS_CALC_PROC_NO_1(String val) { m_CS_CALC_PROC_NO_1 = val; }
	public void setCS_CALC_PROC_NO_2(String val) { m_CS_CALC_PROC_NO_2 = val; }


	public void setList_HALF_TERM_TYP_name(List list) { l_HALF_TERM_TYP_name = list; }
	public void setList_HALF_TERM_TYP_val(List list) { l_HALF_TERM_TYP_val = list; }
	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_c_ReOut(List list) { l_c_ReOut = list; }
	public void setList_c_DC0010B001(List list) { l_c_DC0010B001 = list; }
	public void setList_c_DC0020B001(List list) { l_c_DC0020B001 = list; }
	public void setList_DC0010B001_0_COUNT(List list) { l_DC0010B001_0_COUNT = list; }
	public void setList_DC0010B001_1_COUNT(List list) { l_DC0010B001_1_COUNT = list; }
	public void setList_DC0020B001_0_COUNT(List list) { l_DC0020B001_0_COUNT = list; }
	public void setList_DC0020B001_1_COUNT(List list) { l_DC0020B001_1_COUNT = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_YEAR(List list) { l_YEAR = list; }
	public void setList_HALF_TERM_TYP(List list) { l_HALF_TERM_TYP = list; }
	public void setList_CURRENT_YEAR(List list) { l_CURRENT_YEAR = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_HALF_TERM_TYP_DN(List list) { l_HALF_TERM_TYP_DN = list; }
	public void setList_CS_CALC_PROC_NO_DN(List list) { l_CS_CALC_PROC_NO_DN = list; }
	public void setList_CS_CALC_ERROR_CD(List list) { l_CS_CALC_ERROR_CD = list; }
	public void setList_ROOT_ITEM_CD(List list) { l_ROOT_ITEM_CD = list; }
	public void setList_PARENT_ITEM_CD(List list) { l_PARENT_ITEM_CD = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_CS_PROC_CD(List list) { l_CS_PROC_CD = list; }
	public void setList_PROC_COST_CLS_CD(List list) { l_PROC_COST_CLS_CD = list; }
	public void setList_PS_EDITION(List list) { l_PS_EDITION = list; }
	public void setList_MESSAGE_CD(List list) { l_MESSAGE_CD = list; }
	public void setList_MESSAGE(List list) { l_MESSAGE = list; }
	public void setList_REMARKS(List list) { l_REMARKS = list; }
	public void setList_LIST_ISS_FLG(List list) { l_LIST_ISS_FLG = list; }
	public void setList_CREATED_DATE(List list) { l_CREATED_DATE = list; }
	public void setList_CREATED_BY(List list) { l_CREATED_BY = list; }
	public void setList_CS_CALC_PROC_NO_1(List list) { l_CS_CALC_PROC_NO_1 = list; }
	public void setList_CS_CALC_PROC_NO_2(List list) { l_CS_CALC_PROC_NO_2 = list; }

	public int setL2L_HALF_TERM_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HALF_TERM_TYP_name == null) {
			l_HALF_TERM_TYP_name = new ArrayList();
		} else {
			l_HALF_TERM_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HALF_TERM_TYP_name.add(((DC0100010Struct) list.get(i)).getHALF_TERM_TYP_name());
		}
		return size;
	}
	public int setL2L_HALF_TERM_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HALF_TERM_TYP_val == null) {
			l_HALF_TERM_TYP_val = new ArrayList();
		} else {
			l_HALF_TERM_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HALF_TERM_TYP_val.add(((DC0100010Struct) list.get(i)).getHALF_TERM_TYP_val());
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
			l_DOWNLOAD_FILE.add(((DC0100010Struct) list.get(i)).getDOWNLOAD_FILE());
		}
		return size;
	}
	public int setL2L_c_ReOut(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_ReOut == null) {
			l_c_ReOut = new ArrayList();
		} else {
			l_c_ReOut.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_ReOut.add(((DC0100010Struct) list.get(i)).getc_ReOut());
		}
		return size;
	}
	public int setL2L_c_DC0010B001(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_DC0010B001 == null) {
			l_c_DC0010B001 = new ArrayList();
		} else {
			l_c_DC0010B001.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_DC0010B001.add(((DC0100010Struct) list.get(i)).getc_DC0010B001());
		}
		return size;
	}
	public int setL2L_c_DC0020B001(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_DC0020B001 == null) {
			l_c_DC0020B001 = new ArrayList();
		} else {
			l_c_DC0020B001.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_DC0020B001.add(((DC0100010Struct) list.get(i)).getc_DC0020B001());
		}
		return size;
	}
	public int setL2L_DC0010B001_0_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DC0010B001_0_COUNT == null) {
			l_DC0010B001_0_COUNT = new ArrayList();
		} else {
			l_DC0010B001_0_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DC0010B001_0_COUNT.add(((DC0100010Struct) list.get(i)).getDC0010B001_0_COUNT());
		}
		return size;
	}
	public int setL2L_DC0010B001_1_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DC0010B001_1_COUNT == null) {
			l_DC0010B001_1_COUNT = new ArrayList();
		} else {
			l_DC0010B001_1_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DC0010B001_1_COUNT.add(((DC0100010Struct) list.get(i)).getDC0010B001_1_COUNT());
		}
		return size;
	}
	public int setL2L_DC0020B001_0_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DC0020B001_0_COUNT == null) {
			l_DC0020B001_0_COUNT = new ArrayList();
		} else {
			l_DC0020B001_0_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DC0020B001_0_COUNT.add(((DC0100010Struct) list.get(i)).getDC0020B001_0_COUNT());
		}
		return size;
	}
	public int setL2L_DC0020B001_1_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DC0020B001_1_COUNT == null) {
			l_DC0020B001_1_COUNT = new ArrayList();
		} else {
			l_DC0020B001_1_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DC0020B001_1_COUNT.add(((DC0100010Struct) list.get(i)).getDC0020B001_1_COUNT());
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
			l_PLANT_CD.add(((DC0100010Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_YEAR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_YEAR == null) {
			l_YEAR = new ArrayList();
		} else {
			l_YEAR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_YEAR.add(((DC0100010Struct) list.get(i)).getYEAR());
		}
		return size;
	}
	public int setL2L_HALF_TERM_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HALF_TERM_TYP == null) {
			l_HALF_TERM_TYP = new ArrayList();
		} else {
			l_HALF_TERM_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HALF_TERM_TYP.add(((DC0100010Struct) list.get(i)).getHALF_TERM_TYP());
		}
		return size;
	}
	public int setL2L_CURRENT_YEAR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CURRENT_YEAR == null) {
			l_CURRENT_YEAR = new ArrayList();
		} else {
			l_CURRENT_YEAR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CURRENT_YEAR.add(((DC0100010Struct) list.get(i)).getCURRENT_YEAR());
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
			l_PLANT_NAME.add(((DC0100010Struct) list.get(i)).getPLANT_NAME());
		}
		return size;
	}
	public int setL2L_HALF_TERM_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HALF_TERM_TYP_DN == null) {
			l_HALF_TERM_TYP_DN = new ArrayList();
		} else {
			l_HALF_TERM_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HALF_TERM_TYP_DN.add(((DC0100010Struct) list.get(i)).getHALF_TERM_TYP_DN());
		}
		return size;
	}
	public int setL2L_CS_CALC_PROC_NO_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CS_CALC_PROC_NO_DN == null) {
			l_CS_CALC_PROC_NO_DN = new ArrayList();
		} else {
			l_CS_CALC_PROC_NO_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CS_CALC_PROC_NO_DN.add(((DC0100010Struct) list.get(i)).getCS_CALC_PROC_NO_DN());
		}
		return size;
	}
	public int setL2L_CS_CALC_ERROR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CS_CALC_ERROR_CD == null) {
			l_CS_CALC_ERROR_CD = new ArrayList();
		} else {
			l_CS_CALC_ERROR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CS_CALC_ERROR_CD.add(((DC0100010Struct) list.get(i)).getCS_CALC_ERROR_CD());
		}
		return size;
	}
	public int setL2L_ROOT_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ROOT_ITEM_CD == null) {
			l_ROOT_ITEM_CD = new ArrayList();
		} else {
			l_ROOT_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ROOT_ITEM_CD.add(((DC0100010Struct) list.get(i)).getROOT_ITEM_CD());
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
			l_PARENT_ITEM_CD.add(((DC0100010Struct) list.get(i)).getPARENT_ITEM_CD());
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
			l_ITEM_CD.add(((DC0100010Struct) list.get(i)).getITEM_CD());
		}
		return size;
	}
	public int setL2L_CS_PROC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CS_PROC_CD == null) {
			l_CS_PROC_CD = new ArrayList();
		} else {
			l_CS_PROC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CS_PROC_CD.add(((DC0100010Struct) list.get(i)).getCS_PROC_CD());
		}
		return size;
	}
	public int setL2L_PROC_COST_CLS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_CLS_CD == null) {
			l_PROC_COST_CLS_CD = new ArrayList();
		} else {
			l_PROC_COST_CLS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_CLS_CD.add(((DC0100010Struct) list.get(i)).getPROC_COST_CLS_CD());
		}
		return size;
	}
	public int setL2L_PS_EDITION(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PS_EDITION == null) {
			l_PS_EDITION = new ArrayList();
		} else {
			l_PS_EDITION.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PS_EDITION.add(((DC0100010Struct) list.get(i)).getPS_EDITION());
		}
		return size;
	}
	public int setL2L_MESSAGE_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MESSAGE_CD == null) {
			l_MESSAGE_CD = new ArrayList();
		} else {
			l_MESSAGE_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MESSAGE_CD.add(((DC0100010Struct) list.get(i)).getMESSAGE_CD());
		}
		return size;
	}
	public int setL2L_MESSAGE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MESSAGE == null) {
			l_MESSAGE = new ArrayList();
		} else {
			l_MESSAGE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MESSAGE.add(((DC0100010Struct) list.get(i)).getMESSAGE());
		}
		return size;
	}
	public int setL2L_REMARKS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_REMARKS == null) {
			l_REMARKS = new ArrayList();
		} else {
			l_REMARKS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_REMARKS.add(((DC0100010Struct) list.get(i)).getREMARKS());
		}
		return size;
	}
	public int setL2L_LIST_ISS_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LIST_ISS_FLG == null) {
			l_LIST_ISS_FLG = new ArrayList();
		} else {
			l_LIST_ISS_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LIST_ISS_FLG.add(((DC0100010Struct) list.get(i)).getLIST_ISS_FLG());
		}
		return size;
	}
	public int setL2L_CREATED_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CREATED_DATE == null) {
			l_CREATED_DATE = new ArrayList();
		} else {
			l_CREATED_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CREATED_DATE.add(((DC0100010Struct) list.get(i)).getCREATED_DATE());
		}
		return size;
	}
	public int setL2L_CREATED_BY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CREATED_BY == null) {
			l_CREATED_BY = new ArrayList();
		} else {
			l_CREATED_BY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CREATED_BY.add(((DC0100010Struct) list.get(i)).getCREATED_BY());
		}
		return size;
	}
	public int setL2L_CS_CALC_PROC_NO_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CS_CALC_PROC_NO_1 == null) {
			l_CS_CALC_PROC_NO_1 = new ArrayList();
		} else {
			l_CS_CALC_PROC_NO_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CS_CALC_PROC_NO_1.add(((DC0100010Struct) list.get(i)).getCS_CALC_PROC_NO_1());
		}
		return size;
	}
	public int setL2L_CS_CALC_PROC_NO_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CS_CALC_PROC_NO_2 == null) {
			l_CS_CALC_PROC_NO_2 = new ArrayList();
		} else {
			l_CS_CALC_PROC_NO_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CS_CALC_PROC_NO_2.add(((DC0100010Struct) list.get(i)).getCS_CALC_PROC_NO_2());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_HALF_TERM_TYP_name = null;
		m_HALF_TERM_TYP_val = null;
		m_DOWNLOAD_FILE = null;
		m_c_ReOut = null;
		m_c_DC0010B001 = null;
		m_c_DC0020B001 = null;
		m_DC0010B001_0_COUNT = null;
		m_DC0010B001_1_COUNT = null;
		m_DC0020B001_0_COUNT = null;
		m_DC0020B001_1_COUNT = null;
		m_PLANT_CD = null;
		m_YEAR = null;
		m_HALF_TERM_TYP = null;
		m_CURRENT_YEAR = null;
		m_PLANT_NAME = null;
		m_HALF_TERM_TYP_DN = null;
		m_CS_CALC_PROC_NO_DN = null;
		m_CS_CALC_ERROR_CD = null;
		m_ROOT_ITEM_CD = null;
		m_PARENT_ITEM_CD = null;
		m_ITEM_CD = null;
		m_CS_PROC_CD = null;
		m_PROC_COST_CLS_CD = null;
		m_PS_EDITION = null;
		m_MESSAGE_CD = null;
		m_MESSAGE = null;
		m_REMARKS = null;
		m_LIST_ISS_FLG = null;
		m_CREATED_DATE = null;
		m_CREATED_BY = null;
		m_CS_CALC_PROC_NO_1 = null;
		m_CS_CALC_PROC_NO_2 = null;

		l_HALF_TERM_TYP_name = null;
		l_HALF_TERM_TYP_val = null;
		l_DOWNLOAD_FILE = null;
		l_c_ReOut = null;
		l_c_DC0010B001 = null;
		l_c_DC0020B001 = null;
		l_DC0010B001_0_COUNT = null;
		l_DC0010B001_1_COUNT = null;
		l_DC0020B001_0_COUNT = null;
		l_DC0020B001_1_COUNT = null;
		l_PLANT_CD = null;
		l_YEAR = null;
		l_HALF_TERM_TYP = null;
		l_CURRENT_YEAR = null;
		l_PLANT_NAME = null;
		l_HALF_TERM_TYP_DN = null;
		l_CS_CALC_PROC_NO_DN = null;
		l_CS_CALC_ERROR_CD = null;
		l_ROOT_ITEM_CD = null;
		l_PARENT_ITEM_CD = null;
		l_ITEM_CD = null;
		l_CS_PROC_CD = null;
		l_PROC_COST_CLS_CD = null;
		l_PS_EDITION = null;
		l_MESSAGE_CD = null;
		l_MESSAGE = null;
		l_REMARKS = null;
		l_LIST_ISS_FLG = null;
		l_CREATED_DATE = null;
		l_CREATED_BY = null;
		l_CS_CALC_PROC_NO_1 = null;
		l_CS_CALC_PROC_NO_2 = null;

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
	 * medDC0100010�N���X�̕W���R���X�g���N�^
	 */
	public DC0100010Struct()
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
	public void setStruct(DC0100010Struct struct)
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
	public void setStructM(DC0100010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setHALF_TERM_TYP_name(struct.getHALF_TERM_TYP_name());
			this.setHALF_TERM_TYP_val(struct.getHALF_TERM_TYP_val());
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setc_ReOut(struct.getc_ReOut());
			this.setc_DC0010B001(struct.getc_DC0010B001());
			this.setc_DC0020B001(struct.getc_DC0020B001());
			this.setDC0010B001_0_COUNT(struct.getDC0010B001_0_COUNT());
			this.setDC0010B001_1_COUNT(struct.getDC0010B001_1_COUNT());
			this.setDC0020B001_0_COUNT(struct.getDC0020B001_0_COUNT());
			this.setDC0020B001_1_COUNT(struct.getDC0020B001_1_COUNT());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setYEAR(struct.getYEAR());
			this.setHALF_TERM_TYP(struct.getHALF_TERM_TYP());
			this.setCURRENT_YEAR(struct.getCURRENT_YEAR());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.setHALF_TERM_TYP_DN(struct.getHALF_TERM_TYP_DN());
			this.setCS_CALC_PROC_NO_DN(struct.getCS_CALC_PROC_NO_DN());
			this.setCS_CALC_ERROR_CD(struct.getCS_CALC_ERROR_CD());
			this.setROOT_ITEM_CD(struct.getROOT_ITEM_CD());
			this.setPARENT_ITEM_CD(struct.getPARENT_ITEM_CD());
			this.setITEM_CD(struct.getITEM_CD());
			this.setCS_PROC_CD(struct.getCS_PROC_CD());
			this.setPROC_COST_CLS_CD(struct.getPROC_COST_CLS_CD());
			this.setPS_EDITION(struct.getPS_EDITION());
			this.setMESSAGE_CD(struct.getMESSAGE_CD());
			this.setMESSAGE(struct.getMESSAGE());
			this.setREMARKS(struct.getREMARKS());
			this.setLIST_ISS_FLG(struct.getLIST_ISS_FLG());
			this.setCREATED_DATE(struct.getCREATED_DATE());
			this.setCREATED_BY(struct.getCREATED_BY());
			this.setCS_CALC_PROC_NO_1(struct.getCS_CALC_PROC_NO_1());
			this.setCS_CALC_PROC_NO_2(struct.getCS_CALC_PROC_NO_2());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(DC0100010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_HALF_TERM_TYP_name(struct.getList_HALF_TERM_TYP_name());
			this.setList_HALF_TERM_TYP_val(struct.getList_HALF_TERM_TYP_val());
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_c_ReOut(struct.getList_c_ReOut());
			this.setList_c_DC0010B001(struct.getList_c_DC0010B001());
			this.setList_c_DC0020B001(struct.getList_c_DC0020B001());
			this.setList_DC0010B001_0_COUNT(struct.getList_DC0010B001_0_COUNT());
			this.setList_DC0010B001_1_COUNT(struct.getList_DC0010B001_1_COUNT());
			this.setList_DC0020B001_0_COUNT(struct.getList_DC0020B001_0_COUNT());
			this.setList_DC0020B001_1_COUNT(struct.getList_DC0020B001_1_COUNT());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_YEAR(struct.getList_YEAR());
			this.setList_HALF_TERM_TYP(struct.getList_HALF_TERM_TYP());
			this.setList_CURRENT_YEAR(struct.getList_CURRENT_YEAR());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_HALF_TERM_TYP_DN(struct.getList_HALF_TERM_TYP_DN());
			this.setList_CS_CALC_PROC_NO_DN(struct.getList_CS_CALC_PROC_NO_DN());
			this.setList_CS_CALC_ERROR_CD(struct.getList_CS_CALC_ERROR_CD());
			this.setList_ROOT_ITEM_CD(struct.getList_ROOT_ITEM_CD());
			this.setList_PARENT_ITEM_CD(struct.getList_PARENT_ITEM_CD());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_CS_PROC_CD(struct.getList_CS_PROC_CD());
			this.setList_PROC_COST_CLS_CD(struct.getList_PROC_COST_CLS_CD());
			this.setList_PS_EDITION(struct.getList_PS_EDITION());
			this.setList_MESSAGE_CD(struct.getList_MESSAGE_CD());
			this.setList_MESSAGE(struct.getList_MESSAGE());
			this.setList_REMARKS(struct.getList_REMARKS());
			this.setList_LIST_ISS_FLG(struct.getList_LIST_ISS_FLG());
			this.setList_CREATED_DATE(struct.getList_CREATED_DATE());
			this.setList_CREATED_BY(struct.getList_CREATED_BY());
			this.setList_CS_CALC_PROC_NO_1(struct.getList_CS_CALC_PROC_NO_1());
			this.setList_CS_CALC_PROC_NO_2(struct.getList_CS_CALC_PROC_NO_2());
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
	// �� 1 �ϐ������l�F i_HALF_TERM_TYP_name


	final static String i_HALF_TERM_TYP_name = null;

	// �� 2 �ϐ������l�F i_HALF_TERM_TYP_val


	final static String i_HALF_TERM_TYP_val = null;

	// �� 3 �ϐ������l�F i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// �� 4 �ϐ������l�F i_c_ReOut


	final static String i_c_ReOut = null;

	// �� 5 �ϐ������l�F i_c_DC0010B001


	final static String i_c_DC0010B001 = null;

	// �� 6 �ϐ������l�F i_c_DC0020B001


	final static String i_c_DC0020B001 = null;

	// �� 7 �ϐ������l�F i_DC0010B001_0_COUNT


	final static String i_DC0010B001_0_COUNT = null;

	// �� 8 �ϐ������l�F i_DC0010B001_1_COUNT


	final static String i_DC0010B001_1_COUNT = null;

	// �� 9 �ϐ������l�F i_DC0020B001_0_COUNT


	final static String i_DC0020B001_0_COUNT = null;

	// �� 10 �ϐ������l�F i_DC0020B001_1_COUNT


	final static String i_DC0020B001_1_COUNT = null;

	// �� 11 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 12 �ϐ������l�F i_YEAR


	final static String i_YEAR = null;

	// �� 13 �ϐ������l�F i_HALF_TERM_TYP


	final static String i_HALF_TERM_TYP = null;

	// �� 14 �ϐ������l�F i_CURRENT_YEAR


	final static String i_CURRENT_YEAR = null;

	// �� 15 �ϐ������l�F i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// �� 16 �ϐ������l�F i_HALF_TERM_TYP_DN


	final static String i_HALF_TERM_TYP_DN = null;

	// �� 17 �ϐ������l�F i_CS_CALC_PROC_NO_DN


	final static String i_CS_CALC_PROC_NO_DN = null;

	// �� 18 �ϐ������l�F i_CS_CALC_ERROR_CD


	final static String i_CS_CALC_ERROR_CD = null;

	// �� 19 �ϐ������l�F i_ROOT_ITEM_CD


	final static String i_ROOT_ITEM_CD = null;

	// �� 20 �ϐ������l�F i_PARENT_ITEM_CD


	final static String i_PARENT_ITEM_CD = null;

	// �� 21 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 22 �ϐ������l�F i_CS_PROC_CD


	final static String i_CS_PROC_CD = null;

	// �� 23 �ϐ������l�F i_PROC_COST_CLS_CD


	final static String i_PROC_COST_CLS_CD = null;

	// �� 24 �ϐ������l�F i_PS_EDITION


	final static String i_PS_EDITION = null;

	// �� 25 �ϐ������l�F i_MESSAGE_CD


	final static String i_MESSAGE_CD = null;

	// �� 26 �ϐ������l�F i_MESSAGE


	final static String i_MESSAGE = null;

	// �� 27 �ϐ������l�F i_REMARKS


	final static String i_REMARKS = null;

	// �� 28 �ϐ������l�F i_LIST_ISS_FLG


	final static String i_LIST_ISS_FLG = null;

	// �� 29 �ϐ������l�F i_CREATED_DATE


	final static String i_CREATED_DATE = null;

	// �� 30 �ϐ������l�F i_CREATED_BY


	final static String i_CREATED_BY = null;

	// �� 31 �ϐ������l�F i_CS_CALC_PROC_NO_1


	final static String i_CS_CALC_PROC_NO_1 = null;

	// �� 32 �ϐ������l�F i_CS_CALC_PROC_NO_2


	final static String i_CS_CALC_PROC_NO_2 = null;

*/

	//{{user_implement_code
		// TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
		// �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
	// �� 1 �ϐ������l�F i_HALF_TERM_TYP_name

	final static String i_HALF_TERM_TYP_name = null;

	// �� 2 �ϐ������l�F i_HALF_TERM_TYP_val

	final static String i_HALF_TERM_TYP_val = null;

	// �� 3 �ϐ������l�F i_DOWNLOAD_FILE

	final static String i_DOWNLOAD_FILE = null;

	// �� 4 �ϐ������l�F i_c_ReOut

	final static String i_c_ReOut = null;

	// �� 5 �ϐ������l�F i_c_DC0010B001

	final static String i_c_DC0010B001 = null;

	// �� 6 �ϐ������l�F i_c_DC0020B001

	final static String i_c_DC0020B001 = null;

	// �� 7 �ϐ������l�F i_DC0010B001_0_COUNT

	final static String i_DC0010B001_0_COUNT = null;

	// �� 8 �ϐ������l�F i_DC0010B001_1_COUNT

	final static String i_DC0010B001_1_COUNT = null;

	// �� 9 �ϐ������l�F i_DC0020B001_0_COUNT

	final static String i_DC0020B001_0_COUNT = null;

	// �� 10 �ϐ������l�F i_DC0020B001_1_COUNT

	final static String i_DC0020B001_1_COUNT = null;

	// �� 11 �ϐ������l�F i_PLANT_CD

	final static String i_PLANT_CD = null;

	// �� 12 �ϐ������l�F i_YEAR

	final static String i_YEAR = null;

	// �� 13 �ϐ������l�F i_HALF_TERM_TYP

	final static String i_HALF_TERM_TYP = null;

	// �� 14 �ϐ������l�F i_CURRENT_YEAR

	final static String i_CURRENT_YEAR = null;

	// �� 15 �ϐ������l�F i_PLANT_NAME

	final static String i_PLANT_NAME = null;

	// �� 16 �ϐ������l�F i_HALF_TERM_TYP_DN

	final static String i_HALF_TERM_TYP_DN = null;

	// �� 17 �ϐ������l�F i_CS_CALC_PROC_NO_DN

	final static String i_CS_CALC_PROC_NO_DN = null;

	// �� 18 �ϐ������l�F i_CS_CALC_ERROR_CD

	final static String i_CS_CALC_ERROR_CD = null;

	// �� 19 �ϐ������l�F i_ROOT_ITEM_CD

	final static String i_ROOT_ITEM_CD = null;

	// �� 20 �ϐ������l�F i_PARENT_ITEM_CD

	final static String i_PARENT_ITEM_CD = null;

	// �� 21 �ϐ������l�F i_ITEM_CD

	final static String i_ITEM_CD = null;

	// �� 22 �ϐ������l�F i_CS_PROC_CD

	final static String i_CS_PROC_CD = null;

	// �� 23 �ϐ������l�F i_PROC_COST_CLS_CD

	final static String i_PROC_COST_CLS_CD = null;

	// �� 24 �ϐ������l�F i_PS_EDITION

	final static String i_PS_EDITION = null;

	// �� 25 �ϐ������l�F i_MESSAGE_CD

	final static String i_MESSAGE_CD = null;

	// �� 26 �ϐ������l�F i_MESSAGE

	final static String i_MESSAGE = null;

	// �� 27 �ϐ������l�F i_REMARKS

	final static String i_REMARKS = null;

	// �� 28 �ϐ������l�F i_LIST_ISS_FLG

	final static String i_LIST_ISS_FLG = null;

	// �� 29 �ϐ������l�F i_CREATED_DATE

	final static String i_CREATED_DATE = null;

	// �� 30 �ϐ������l�F i_CREATED_BY

	final static String i_CREATED_BY = null;

	// �� 31 �ϐ������l�F i_CS_CALC_PROC_NO_1

	final static String i_CS_CALC_PROC_NO_1 = null;

	// �� 32 �ϐ������l�F i_CS_CALC_PROC_NO_2

	final static String i_CS_CALC_PROC_NO_2 = null;


	/**
	 * ������
	 *
	 */
	public void initialize()
	{

		clear();

		m_HALF_TERM_TYP_name = i_HALF_TERM_TYP_name;
		m_HALF_TERM_TYP_val = i_HALF_TERM_TYP_val;
		m_DOWNLOAD_FILE = i_DOWNLOAD_FILE;
		m_c_ReOut = i_c_ReOut;
		m_c_DC0010B001 = i_c_DC0010B001;
		m_c_DC0020B001 = i_c_DC0020B001;
		m_DC0010B001_0_COUNT = i_DC0010B001_0_COUNT;
		m_DC0010B001_1_COUNT = i_DC0010B001_1_COUNT;
		m_DC0020B001_0_COUNT = i_DC0020B001_0_COUNT;
		m_DC0020B001_1_COUNT = i_DC0020B001_1_COUNT;
		m_PLANT_CD = i_PLANT_CD;
		m_YEAR = i_YEAR;
		m_HALF_TERM_TYP = i_HALF_TERM_TYP;
		m_CURRENT_YEAR = i_CURRENT_YEAR;
		m_PLANT_NAME = i_PLANT_NAME;
		m_HALF_TERM_TYP_DN = i_HALF_TERM_TYP_DN;
		m_CS_CALC_PROC_NO_DN = i_CS_CALC_PROC_NO_DN;
		m_CS_CALC_ERROR_CD = i_CS_CALC_ERROR_CD;
		m_ROOT_ITEM_CD = i_ROOT_ITEM_CD;
		m_PARENT_ITEM_CD = i_PARENT_ITEM_CD;
		m_ITEM_CD = i_ITEM_CD;
		m_CS_PROC_CD = i_CS_PROC_CD;
		m_PROC_COST_CLS_CD = i_PROC_COST_CLS_CD;
		m_PS_EDITION = i_PS_EDITION;
		m_MESSAGE_CD = i_MESSAGE_CD;
		m_MESSAGE = i_MESSAGE;
		m_REMARKS = i_REMARKS;
		m_LIST_ISS_FLG = i_LIST_ISS_FLG;
		m_CREATED_DATE = i_CREATED_DATE;
		m_CREATED_BY = i_CREATED_BY;
		m_CS_CALC_PROC_NO_1 = i_CS_CALC_PROC_NO_1;
		m_CS_CALC_PROC_NO_2 = i_CS_CALC_PROC_NO_2;
	}
		// TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
