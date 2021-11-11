/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0090/src/com/nec/jp/orteus/metamorBase/AA0090/AA0090030Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0090;

import com.nec.jp.orteus.xaf.wa.*;

import com.nec.jp.orteus.util.logging.*;

import java.lang.Number.*;
import java.lang.Float;
import java.util.*;
import java.sql.*;
import java.io.*;

//{{user_implement_code_import
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AA0090030Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_BUSINESS_GROUP_VALID_FLG */
	public String m_BUSINESS_GROUP_VALID_FLG = null;
	/** �� 2 �ϐ��F m_LOCALE_name */
	public String m_LOCALE_name = null;
	/** �� 3 �ϐ��F m_LOCALE_val */
	public String m_LOCALE_val = null;
	/** �� 4 �ϐ��F m_NEW_PASSWORD */
	public String m_NEW_PASSWORD = null;
	/** �� 5 �ϐ��F m_APPR_POWER_TYP_name */
	public String m_APPR_POWER_TYP_name = null;
	/** �� 6 �ϐ��F m_APPR_POWER_TYP_val */
	public String m_APPR_POWER_TYP_val = null;
	/** �� 7 �ϐ��F m_APPR_REMARKS */
	public String m_APPR_REMARKS = null;
	/** �� 8 �ϐ��F m_h_APPR_ID */
	public String m_h_APPR_ID = null;
	/** �� 9 �ϐ��F m_h_SCREENMOVE_TYP */
	public String m_h_SCREENMOVE_TYP = null;
	/** �� 10 �ϐ��F m_h_INSERT_ERROR_FLG */
	public String m_h_INSERT_ERROR_FLG = null;
	/** �� 11 �ϐ��F m_h_PASSWORD */
	public String m_h_PASSWORD = null;
	/** �� 12 �ϐ��F m_BUSINESS_GROUP_DISP_FLG */
	public String m_BUSINESS_GROUP_DISP_FLG = null;
	/** �� 13 �ϐ��F m_OWN_PERSON_CD */
	public String m_OWN_PERSON_CD = null;
	/** �� 14 �ϐ��F m_USER_CD */
	public String m_USER_CD = null;
	/** �� 15 �ϐ��F m_USER_NAME */
	public String m_USER_NAME = null;
	/** �� 16 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 17 �ϐ��F m_PASSWORD */
	public String m_PASSWORD = null;
	/** �� 18 �ϐ��F m_ADDRESS */
	public String m_ADDRESS = null;
	/** �� 19 �ϐ��F m_LOCALE */
	public String m_LOCALE = null;
	/** �� 20 �ϐ��F m_APPR_POWER_TYP */
	public String m_APPR_POWER_TYP = null;
	/** �� 21 �ϐ��F m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** �� 22 �ϐ��F m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** �� 23 �ϐ��F m_SECTION_CD */
	public String m_SECTION_CD = null;
	/** �� 24 �ϐ��F m_ORG_NAME */
	public String m_ORG_NAME = null;
	/** �� 25 �ϐ��F m_PASSWORD_CHG_DATE */
	public String m_PASSWORD_CHG_DATE = null;
	/** �� 26 �ϐ��F m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** �� 27 �ϐ��F m_BUSINESS_GROUP_CD */
	public String m_BUSINESS_GROUP_CD = null;
	/** �� 28 �ϐ��F m_BUSINESS_GROUP_NAME */
	public String m_BUSINESS_GROUP_NAME = null;
	/** �� 29 �ϐ��F m_DISPLAY_NAME */
	public String m_DISPLAY_NAME = null;
	/** �� 30 �ϐ��F m_h_APR_USER_MST */
	public String m_h_APR_USER_MST = null;
	/** �� 31 �ϐ��F m_BUSINESS_OPR_DATE */
	public String m_BUSINESS_OPR_DATE = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_BUSINESS_GROUP_VALID_FLG */
	public List l_BUSINESS_GROUP_VALID_FLG = null;

	/** �� 2 List�ϐ��F l_LOCALE_name */
	public List l_LOCALE_name = null;

	/** �� 3 List�ϐ��F l_LOCALE_val */
	public List l_LOCALE_val = null;

	/** �� 4 List�ϐ��F l_NEW_PASSWORD */
	public List l_NEW_PASSWORD = null;

	/** �� 5 List�ϐ��F l_APPR_POWER_TYP_name */
	public List l_APPR_POWER_TYP_name = null;

	/** �� 6 List�ϐ��F l_APPR_POWER_TYP_val */
	public List l_APPR_POWER_TYP_val = null;

	/** �� 7 List�ϐ��F l_APPR_REMARKS */
	public List l_APPR_REMARKS = null;

	/** �� 8 List�ϐ��F l_h_APPR_ID */
	public List l_h_APPR_ID = null;

	/** �� 9 List�ϐ��F l_h_SCREENMOVE_TYP */
	public List l_h_SCREENMOVE_TYP = null;

	/** �� 10 List�ϐ��F l_h_INSERT_ERROR_FLG */
	public List l_h_INSERT_ERROR_FLG = null;

	/** �� 11 List�ϐ��F l_h_PASSWORD */
	public List l_h_PASSWORD = null;

	/** �� 12 List�ϐ��F l_BUSINESS_GROUP_DISP_FLG */
	public List l_BUSINESS_GROUP_DISP_FLG = null;

	/** �� 13 List�ϐ��F l_OWN_PERSON_CD */
	public List l_OWN_PERSON_CD = null;

	/** �� 14 List�ϐ��F l_USER_CD */
	public List l_USER_CD = null;

	/** �� 15 List�ϐ��F l_USER_NAME */
	public List l_USER_NAME = null;

	/** �� 16 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 17 List�ϐ��F l_PASSWORD */
	public List l_PASSWORD = null;

	/** �� 18 List�ϐ��F l_ADDRESS */
	public List l_ADDRESS = null;

	/** �� 19 List�ϐ��F l_LOCALE */
	public List l_LOCALE = null;

	/** �� 20 List�ϐ��F l_APPR_POWER_TYP */
	public List l_APPR_POWER_TYP = null;

	/** �� 21 List�ϐ��F l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** �� 22 List�ϐ��F l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** �� 23 List�ϐ��F l_SECTION_CD */
	public List l_SECTION_CD = null;

	/** �� 24 List�ϐ��F l_ORG_NAME */
	public List l_ORG_NAME = null;

	/** �� 25 List�ϐ��F l_PASSWORD_CHG_DATE */
	public List l_PASSWORD_CHG_DATE = null;

	/** �� 26 List�ϐ��F l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** �� 27 List�ϐ��F l_BUSINESS_GROUP_CD */
	public List l_BUSINESS_GROUP_CD = null;

	/** �� 28 List�ϐ��F l_BUSINESS_GROUP_NAME */
	public List l_BUSINESS_GROUP_NAME = null;

	/** �� 29 List�ϐ��F l_DISPLAY_NAME */
	public List l_DISPLAY_NAME = null;

	/** �� 30 List�ϐ��F l_h_APR_USER_MST */
	public List l_h_APR_USER_MST = null;

	/** �� 31 List�ϐ��F l_BUSINESS_OPR_DATE */
	public List l_BUSINESS_OPR_DATE = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getBUSINESS_GROUP_VALID_FLG() { return m_BUSINESS_GROUP_VALID_FLG; }
	public String getLOCALE_name() { return m_LOCALE_name; }
	public String getLOCALE_val() { return m_LOCALE_val; }
	public String getNEW_PASSWORD() { return m_NEW_PASSWORD; }
	public String getAPPR_POWER_TYP_name() { return m_APPR_POWER_TYP_name; }
	public String getAPPR_POWER_TYP_val() { return m_APPR_POWER_TYP_val; }
	public String getAPPR_REMARKS() { return m_APPR_REMARKS; }
	public String geth_APPR_ID() { return m_h_APPR_ID; }
	public String geth_SCREENMOVE_TYP() { return m_h_SCREENMOVE_TYP; }
	public String geth_INSERT_ERROR_FLG() { return m_h_INSERT_ERROR_FLG; }
	public String geth_PASSWORD() { return m_h_PASSWORD; }
	public String getBUSINESS_GROUP_DISP_FLG() { return m_BUSINESS_GROUP_DISP_FLG; }
	public String getOWN_PERSON_CD() { return m_OWN_PERSON_CD; }
	public String getUSER_CD() { return m_USER_CD; }
	public String getUSER_NAME() { return m_USER_NAME; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getPASSWORD() { return m_PASSWORD; }
	public String getADDRESS() { return m_ADDRESS; }
	public String getLOCALE() { return m_LOCALE; }
	public String getAPPR_POWER_TYP() { return m_APPR_POWER_TYP; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getSECTION_CD() { return m_SECTION_CD; }
	public String getORG_NAME() { return m_ORG_NAME; }
	public String getPASSWORD_CHG_DATE() { return m_PASSWORD_CHG_DATE; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getBUSINESS_GROUP_CD() { return m_BUSINESS_GROUP_CD; }
	public String getBUSINESS_GROUP_NAME() { return m_BUSINESS_GROUP_NAME; }
	public String getDISPLAY_NAME() { return m_DISPLAY_NAME; }
	public String geth_APR_USER_MST() { return m_h_APR_USER_MST; }
	public String getBUSINESS_OPR_DATE() { return m_BUSINESS_OPR_DATE; }

	public List getList_BUSINESS_GROUP_VALID_FLG() { return l_BUSINESS_GROUP_VALID_FLG; }
	public List getList_LOCALE_name() { return l_LOCALE_name; }
	public List getList_LOCALE_val() { return l_LOCALE_val; }
	public List getList_NEW_PASSWORD() { return l_NEW_PASSWORD; }
	public List getList_APPR_POWER_TYP_name() { return l_APPR_POWER_TYP_name; }
	public List getList_APPR_POWER_TYP_val() { return l_APPR_POWER_TYP_val; }
	public List getList_APPR_REMARKS() { return l_APPR_REMARKS; }
	public List getList_h_APPR_ID() { return l_h_APPR_ID; }
	public List getList_h_SCREENMOVE_TYP() { return l_h_SCREENMOVE_TYP; }
	public List getList_h_INSERT_ERROR_FLG() { return l_h_INSERT_ERROR_FLG; }
	public List getList_h_PASSWORD() { return l_h_PASSWORD; }
	public List getList_BUSINESS_GROUP_DISP_FLG() { return l_BUSINESS_GROUP_DISP_FLG; }
	public List getList_OWN_PERSON_CD() { return l_OWN_PERSON_CD; }
	public List getList_USER_CD() { return l_USER_CD; }
	public List getList_USER_NAME() { return l_USER_NAME; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_PASSWORD() { return l_PASSWORD; }
	public List getList_ADDRESS() { return l_ADDRESS; }
	public List getList_LOCALE() { return l_LOCALE; }
	public List getList_APPR_POWER_TYP() { return l_APPR_POWER_TYP; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_SECTION_CD() { return l_SECTION_CD; }
	public List getList_ORG_NAME() { return l_ORG_NAME; }
	public List getList_PASSWORD_CHG_DATE() { return l_PASSWORD_CHG_DATE; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_BUSINESS_GROUP_CD() { return l_BUSINESS_GROUP_CD; }
	public List getList_BUSINESS_GROUP_NAME() { return l_BUSINESS_GROUP_NAME; }
	public List getList_DISPLAY_NAME() { return l_DISPLAY_NAME; }
	public List getList_h_APR_USER_MST() { return l_h_APR_USER_MST; }
	public List getList_BUSINESS_OPR_DATE() { return l_BUSINESS_OPR_DATE; }

	public void setBUSINESS_GROUP_VALID_FLG(String val) { m_BUSINESS_GROUP_VALID_FLG = val; }
	public void setLOCALE_name(String val) { m_LOCALE_name = val; }
	public void setLOCALE_val(String val) { m_LOCALE_val = val; }
	public void setNEW_PASSWORD(String val) { m_NEW_PASSWORD = val; }
	public void setAPPR_POWER_TYP_name(String val) { m_APPR_POWER_TYP_name = val; }
	public void setAPPR_POWER_TYP_val(String val) { m_APPR_POWER_TYP_val = val; }
	public void setAPPR_REMARKS(String val) { m_APPR_REMARKS = val; }
	public void seth_APPR_ID(String val) { m_h_APPR_ID = val; }
	public void seth_SCREENMOVE_TYP(String val) { m_h_SCREENMOVE_TYP = val; }
	public void seth_INSERT_ERROR_FLG(String val) { m_h_INSERT_ERROR_FLG = val; }
	public void seth_PASSWORD(String val) { m_h_PASSWORD = val; }
	public void setBUSINESS_GROUP_DISP_FLG(String val) { m_BUSINESS_GROUP_DISP_FLG = val; }
	public void setOWN_PERSON_CD(String val) { m_OWN_PERSON_CD = val; }
	public void setUSER_CD(String val) { m_USER_CD = val; }
	public void setUSER_NAME(String val) { m_USER_NAME = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setPASSWORD(String val) { m_PASSWORD = val; }
	public void setADDRESS(String val) { m_ADDRESS = val; }
	public void setLOCALE(String val) { m_LOCALE = val; }
	public void setAPPR_POWER_TYP(String val) { m_APPR_POWER_TYP = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setSECTION_CD(String val) { m_SECTION_CD = val; }
	public void setORG_NAME(String val) { m_ORG_NAME = val; }
	public void setPASSWORD_CHG_DATE(String val) { m_PASSWORD_CHG_DATE = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setBUSINESS_GROUP_CD(String val) { m_BUSINESS_GROUP_CD = val; }
	public void setBUSINESS_GROUP_NAME(String val) { m_BUSINESS_GROUP_NAME = val; }
	public void setDISPLAY_NAME(String val) { m_DISPLAY_NAME = val; }
	public void seth_APR_USER_MST(String val) { m_h_APR_USER_MST = val; }
	public void setBUSINESS_OPR_DATE(String val) { m_BUSINESS_OPR_DATE = val; }


	public void setList_BUSINESS_GROUP_VALID_FLG(List list) { l_BUSINESS_GROUP_VALID_FLG = list; }
	public void setList_LOCALE_name(List list) { l_LOCALE_name = list; }
	public void setList_LOCALE_val(List list) { l_LOCALE_val = list; }
	public void setList_NEW_PASSWORD(List list) { l_NEW_PASSWORD = list; }
	public void setList_APPR_POWER_TYP_name(List list) { l_APPR_POWER_TYP_name = list; }
	public void setList_APPR_POWER_TYP_val(List list) { l_APPR_POWER_TYP_val = list; }
	public void setList_APPR_REMARKS(List list) { l_APPR_REMARKS = list; }
	public void setList_h_APPR_ID(List list) { l_h_APPR_ID = list; }
	public void setList_h_SCREENMOVE_TYP(List list) { l_h_SCREENMOVE_TYP = list; }
	public void setList_h_INSERT_ERROR_FLG(List list) { l_h_INSERT_ERROR_FLG = list; }
	public void setList_h_PASSWORD(List list) { l_h_PASSWORD = list; }
	public void setList_BUSINESS_GROUP_DISP_FLG(List list) { l_BUSINESS_GROUP_DISP_FLG = list; }
	public void setList_OWN_PERSON_CD(List list) { l_OWN_PERSON_CD = list; }
	public void setList_USER_CD(List list) { l_USER_CD = list; }
	public void setList_USER_NAME(List list) { l_USER_NAME = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_PASSWORD(List list) { l_PASSWORD = list; }
	public void setList_ADDRESS(List list) { l_ADDRESS = list; }
	public void setList_LOCALE(List list) { l_LOCALE = list; }
	public void setList_APPR_POWER_TYP(List list) { l_APPR_POWER_TYP = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_SECTION_CD(List list) { l_SECTION_CD = list; }
	public void setList_ORG_NAME(List list) { l_ORG_NAME = list; }
	public void setList_PASSWORD_CHG_DATE(List list) { l_PASSWORD_CHG_DATE = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_BUSINESS_GROUP_CD(List list) { l_BUSINESS_GROUP_CD = list; }
	public void setList_BUSINESS_GROUP_NAME(List list) { l_BUSINESS_GROUP_NAME = list; }
	public void setList_DISPLAY_NAME(List list) { l_DISPLAY_NAME = list; }
	public void setList_h_APR_USER_MST(List list) { l_h_APR_USER_MST = list; }
	public void setList_BUSINESS_OPR_DATE(List list) { l_BUSINESS_OPR_DATE = list; }

	public int setL2L_BUSINESS_GROUP_VALID_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BUSINESS_GROUP_VALID_FLG == null) {
			l_BUSINESS_GROUP_VALID_FLG = new ArrayList();
		} else {
			l_BUSINESS_GROUP_VALID_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BUSINESS_GROUP_VALID_FLG.add(((AA0090030Struct) list.get(i)).getBUSINESS_GROUP_VALID_FLG());
		}
		return size;
	}
	public int setL2L_LOCALE_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOCALE_name == null) {
			l_LOCALE_name = new ArrayList();
		} else {
			l_LOCALE_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOCALE_name.add(((AA0090030Struct) list.get(i)).getLOCALE_name());
		}
		return size;
	}
	public int setL2L_LOCALE_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOCALE_val == null) {
			l_LOCALE_val = new ArrayList();
		} else {
			l_LOCALE_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOCALE_val.add(((AA0090030Struct) list.get(i)).getLOCALE_val());
		}
		return size;
	}
	public int setL2L_NEW_PASSWORD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NEW_PASSWORD == null) {
			l_NEW_PASSWORD = new ArrayList();
		} else {
			l_NEW_PASSWORD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NEW_PASSWORD.add(((AA0090030Struct) list.get(i)).getNEW_PASSWORD());
		}
		return size;
	}
	public int setL2L_APPR_POWER_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_APPR_POWER_TYP_name == null) {
			l_APPR_POWER_TYP_name = new ArrayList();
		} else {
			l_APPR_POWER_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_APPR_POWER_TYP_name.add(((AA0090030Struct) list.get(i)).getAPPR_POWER_TYP_name());
		}
		return size;
	}
	public int setL2L_APPR_POWER_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_APPR_POWER_TYP_val == null) {
			l_APPR_POWER_TYP_val = new ArrayList();
		} else {
			l_APPR_POWER_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_APPR_POWER_TYP_val.add(((AA0090030Struct) list.get(i)).getAPPR_POWER_TYP_val());
		}
		return size;
	}
	public int setL2L_APPR_REMARKS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_APPR_REMARKS == null) {
			l_APPR_REMARKS = new ArrayList();
		} else {
			l_APPR_REMARKS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_APPR_REMARKS.add(((AA0090030Struct) list.get(i)).getAPPR_REMARKS());
		}
		return size;
	}
	public int setL2L_h_APPR_ID(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_APPR_ID == null) {
			l_h_APPR_ID = new ArrayList();
		} else {
			l_h_APPR_ID.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_APPR_ID.add(((AA0090030Struct) list.get(i)).geth_APPR_ID());
		}
		return size;
	}
	public int setL2L_h_SCREENMOVE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_SCREENMOVE_TYP == null) {
			l_h_SCREENMOVE_TYP = new ArrayList();
		} else {
			l_h_SCREENMOVE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_SCREENMOVE_TYP.add(((AA0090030Struct) list.get(i)).geth_SCREENMOVE_TYP());
		}
		return size;
	}
	public int setL2L_h_INSERT_ERROR_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_INSERT_ERROR_FLG == null) {
			l_h_INSERT_ERROR_FLG = new ArrayList();
		} else {
			l_h_INSERT_ERROR_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_INSERT_ERROR_FLG.add(((AA0090030Struct) list.get(i)).geth_INSERT_ERROR_FLG());
		}
		return size;
	}
	public int setL2L_h_PASSWORD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PASSWORD == null) {
			l_h_PASSWORD = new ArrayList();
		} else {
			l_h_PASSWORD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PASSWORD.add(((AA0090030Struct) list.get(i)).geth_PASSWORD());
		}
		return size;
	}
	public int setL2L_BUSINESS_GROUP_DISP_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BUSINESS_GROUP_DISP_FLG == null) {
			l_BUSINESS_GROUP_DISP_FLG = new ArrayList();
		} else {
			l_BUSINESS_GROUP_DISP_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BUSINESS_GROUP_DISP_FLG.add(((AA0090030Struct) list.get(i)).getBUSINESS_GROUP_DISP_FLG());
		}
		return size;
	}
	public int setL2L_OWN_PERSON_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OWN_PERSON_CD == null) {
			l_OWN_PERSON_CD = new ArrayList();
		} else {
			l_OWN_PERSON_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OWN_PERSON_CD.add(((AA0090030Struct) list.get(i)).getOWN_PERSON_CD());
		}
		return size;
	}
	public int setL2L_USER_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_USER_CD == null) {
			l_USER_CD = new ArrayList();
		} else {
			l_USER_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_USER_CD.add(((AA0090030Struct) list.get(i)).getUSER_CD());
		}
		return size;
	}
	public int setL2L_USER_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_USER_NAME == null) {
			l_USER_NAME = new ArrayList();
		} else {
			l_USER_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_USER_NAME.add(((AA0090030Struct) list.get(i)).getUSER_NAME());
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
			l_PLANT_CD.add(((AA0090030Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_PASSWORD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PASSWORD == null) {
			l_PASSWORD = new ArrayList();
		} else {
			l_PASSWORD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PASSWORD.add(((AA0090030Struct) list.get(i)).getPASSWORD());
		}
		return size;
	}
	public int setL2L_ADDRESS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ADDRESS == null) {
			l_ADDRESS = new ArrayList();
		} else {
			l_ADDRESS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ADDRESS.add(((AA0090030Struct) list.get(i)).getADDRESS());
		}
		return size;
	}
	public int setL2L_LOCALE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOCALE == null) {
			l_LOCALE = new ArrayList();
		} else {
			l_LOCALE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOCALE.add(((AA0090030Struct) list.get(i)).getLOCALE());
		}
		return size;
	}
	public int setL2L_APPR_POWER_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_APPR_POWER_TYP == null) {
			l_APPR_POWER_TYP = new ArrayList();
		} else {
			l_APPR_POWER_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_APPR_POWER_TYP.add(((AA0090030Struct) list.get(i)).getAPPR_POWER_TYP());
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
			l_MODIFY_COUNT.add(((AA0090030Struct) list.get(i)).getMODIFY_COUNT());
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
			l_PLANT_NAME.add(((AA0090030Struct) list.get(i)).getPLANT_NAME());
		}
		return size;
	}
	public int setL2L_SECTION_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SECTION_CD == null) {
			l_SECTION_CD = new ArrayList();
		} else {
			l_SECTION_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SECTION_CD.add(((AA0090030Struct) list.get(i)).getSECTION_CD());
		}
		return size;
	}
	public int setL2L_ORG_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ORG_NAME == null) {
			l_ORG_NAME = new ArrayList();
		} else {
			l_ORG_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ORG_NAME.add(((AA0090030Struct) list.get(i)).getORG_NAME());
		}
		return size;
	}
	public int setL2L_PASSWORD_CHG_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PASSWORD_CHG_DATE == null) {
			l_PASSWORD_CHG_DATE = new ArrayList();
		} else {
			l_PASSWORD_CHG_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PASSWORD_CHG_DATE.add(((AA0090030Struct) list.get(i)).getPASSWORD_CHG_DATE());
		}
		return size;
	}
	public int setL2L_COMPANY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COMPANY_CD == null) {
			l_COMPANY_CD = new ArrayList();
		} else {
			l_COMPANY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COMPANY_CD.add(((AA0090030Struct) list.get(i)).getCOMPANY_CD());
		}
		return size;
	}
	public int setL2L_BUSINESS_GROUP_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BUSINESS_GROUP_CD == null) {
			l_BUSINESS_GROUP_CD = new ArrayList();
		} else {
			l_BUSINESS_GROUP_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BUSINESS_GROUP_CD.add(((AA0090030Struct) list.get(i)).getBUSINESS_GROUP_CD());
		}
		return size;
	}
	public int setL2L_BUSINESS_GROUP_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BUSINESS_GROUP_NAME == null) {
			l_BUSINESS_GROUP_NAME = new ArrayList();
		} else {
			l_BUSINESS_GROUP_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BUSINESS_GROUP_NAME.add(((AA0090030Struct) list.get(i)).getBUSINESS_GROUP_NAME());
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
			l_DISPLAY_NAME.add(((AA0090030Struct) list.get(i)).getDISPLAY_NAME());
		}
		return size;
	}
	public int setL2L_h_APR_USER_MST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_APR_USER_MST == null) {
			l_h_APR_USER_MST = new ArrayList();
		} else {
			l_h_APR_USER_MST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_APR_USER_MST.add(((AA0090030Struct) list.get(i)).geth_APR_USER_MST());
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
			l_BUSINESS_OPR_DATE.add(((AA0090030Struct) list.get(i)).getBUSINESS_OPR_DATE());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_BUSINESS_GROUP_VALID_FLG = null;
		m_LOCALE_name = null;
		m_LOCALE_val = null;
		m_NEW_PASSWORD = null;
		m_APPR_POWER_TYP_name = null;
		m_APPR_POWER_TYP_val = null;
		m_APPR_REMARKS = null;
		m_h_APPR_ID = null;
		m_h_SCREENMOVE_TYP = null;
		m_h_INSERT_ERROR_FLG = null;
		m_h_PASSWORD = null;
		m_BUSINESS_GROUP_DISP_FLG = null;
		m_OWN_PERSON_CD = null;
		m_USER_CD = null;
		m_USER_NAME = null;
		m_PLANT_CD = null;
		m_PASSWORD = null;
		m_ADDRESS = null;
		m_LOCALE = null;
		m_APPR_POWER_TYP = null;
		m_MODIFY_COUNT = null;
		m_PLANT_NAME = null;
		m_SECTION_CD = null;
		m_ORG_NAME = null;
		m_PASSWORD_CHG_DATE = null;
		m_COMPANY_CD = null;
		m_BUSINESS_GROUP_CD = null;
		m_BUSINESS_GROUP_NAME = null;
		m_DISPLAY_NAME = null;
		m_h_APR_USER_MST = null;
		m_BUSINESS_OPR_DATE = null;

		l_BUSINESS_GROUP_VALID_FLG = null;
		l_LOCALE_name = null;
		l_LOCALE_val = null;
		l_NEW_PASSWORD = null;
		l_APPR_POWER_TYP_name = null;
		l_APPR_POWER_TYP_val = null;
		l_APPR_REMARKS = null;
		l_h_APPR_ID = null;
		l_h_SCREENMOVE_TYP = null;
		l_h_INSERT_ERROR_FLG = null;
		l_h_PASSWORD = null;
		l_BUSINESS_GROUP_DISP_FLG = null;
		l_OWN_PERSON_CD = null;
		l_USER_CD = null;
		l_USER_NAME = null;
		l_PLANT_CD = null;
		l_PASSWORD = null;
		l_ADDRESS = null;
		l_LOCALE = null;
		l_APPR_POWER_TYP = null;
		l_MODIFY_COUNT = null;
		l_PLANT_NAME = null;
		l_SECTION_CD = null;
		l_ORG_NAME = null;
		l_PASSWORD_CHG_DATE = null;
		l_COMPANY_CD = null;
		l_BUSINESS_GROUP_CD = null;
		l_BUSINESS_GROUP_NAME = null;
		l_DISPLAY_NAME = null;
		l_h_APR_USER_MST = null;
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
	 * medAA0090030�N���X�̕W���R���X�g���N�^
	 */
	public AA0090030Struct()
	{
		//{{user_implement_code_constractor
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
	public void setStruct(AA0090030Struct struct)
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
	public void setStructM(AA0090030Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setBUSINESS_GROUP_VALID_FLG(struct.getBUSINESS_GROUP_VALID_FLG());
			this.setLOCALE_name(struct.getLOCALE_name());
			this.setLOCALE_val(struct.getLOCALE_val());
			this.setNEW_PASSWORD(struct.getNEW_PASSWORD());
			this.setAPPR_POWER_TYP_name(struct.getAPPR_POWER_TYP_name());
			this.setAPPR_POWER_TYP_val(struct.getAPPR_POWER_TYP_val());
			this.setAPPR_REMARKS(struct.getAPPR_REMARKS());
			this.seth_APPR_ID(struct.geth_APPR_ID());
			this.seth_SCREENMOVE_TYP(struct.geth_SCREENMOVE_TYP());
			this.seth_INSERT_ERROR_FLG(struct.geth_INSERT_ERROR_FLG());
			this.seth_PASSWORD(struct.geth_PASSWORD());
			this.setBUSINESS_GROUP_DISP_FLG(struct.getBUSINESS_GROUP_DISP_FLG());
			this.setOWN_PERSON_CD(struct.getOWN_PERSON_CD());
			this.setUSER_CD(struct.getUSER_CD());
			this.setUSER_NAME(struct.getUSER_NAME());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setPASSWORD(struct.getPASSWORD());
			this.setADDRESS(struct.getADDRESS());
			this.setLOCALE(struct.getLOCALE());
			this.setAPPR_POWER_TYP(struct.getAPPR_POWER_TYP());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.setSECTION_CD(struct.getSECTION_CD());
			this.setORG_NAME(struct.getORG_NAME());
			this.setPASSWORD_CHG_DATE(struct.getPASSWORD_CHG_DATE());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setBUSINESS_GROUP_CD(struct.getBUSINESS_GROUP_CD());
			this.setBUSINESS_GROUP_NAME(struct.getBUSINESS_GROUP_NAME());
			this.setDISPLAY_NAME(struct.getDISPLAY_NAME());
			this.seth_APR_USER_MST(struct.geth_APR_USER_MST());
			this.setBUSINESS_OPR_DATE(struct.getBUSINESS_OPR_DATE());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AA0090030Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_BUSINESS_GROUP_VALID_FLG(struct.getList_BUSINESS_GROUP_VALID_FLG());
			this.setList_LOCALE_name(struct.getList_LOCALE_name());
			this.setList_LOCALE_val(struct.getList_LOCALE_val());
			this.setList_NEW_PASSWORD(struct.getList_NEW_PASSWORD());
			this.setList_APPR_POWER_TYP_name(struct.getList_APPR_POWER_TYP_name());
			this.setList_APPR_POWER_TYP_val(struct.getList_APPR_POWER_TYP_val());
			this.setList_APPR_REMARKS(struct.getList_APPR_REMARKS());
			this.setList_h_APPR_ID(struct.getList_h_APPR_ID());
			this.setList_h_SCREENMOVE_TYP(struct.getList_h_SCREENMOVE_TYP());
			this.setList_h_INSERT_ERROR_FLG(struct.getList_h_INSERT_ERROR_FLG());
			this.setList_h_PASSWORD(struct.getList_h_PASSWORD());
			this.setList_BUSINESS_GROUP_DISP_FLG(struct.getList_BUSINESS_GROUP_DISP_FLG());
			this.setList_OWN_PERSON_CD(struct.getList_OWN_PERSON_CD());
			this.setList_USER_CD(struct.getList_USER_CD());
			this.setList_USER_NAME(struct.getList_USER_NAME());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_PASSWORD(struct.getList_PASSWORD());
			this.setList_ADDRESS(struct.getList_ADDRESS());
			this.setList_LOCALE(struct.getList_LOCALE());
			this.setList_APPR_POWER_TYP(struct.getList_APPR_POWER_TYP());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_SECTION_CD(struct.getList_SECTION_CD());
			this.setList_ORG_NAME(struct.getList_ORG_NAME());
			this.setList_PASSWORD_CHG_DATE(struct.getList_PASSWORD_CHG_DATE());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_BUSINESS_GROUP_CD(struct.getList_BUSINESS_GROUP_CD());
			this.setList_BUSINESS_GROUP_NAME(struct.getList_BUSINESS_GROUP_NAME());
			this.setList_DISPLAY_NAME(struct.getList_DISPLAY_NAME());
			this.setList_h_APR_USER_MST(struct.getList_h_APR_USER_MST());
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
	// �� 1 �ϐ������l�F i_BUSINESS_GROUP_VALID_FLG


	final static String i_BUSINESS_GROUP_VALID_FLG = null;

	// �� 2 �ϐ������l�F i_LOCALE_name


	final static String i_LOCALE_name = null;

	// �� 3 �ϐ������l�F i_LOCALE_val


	final static String i_LOCALE_val = null;

	// �� 4 �ϐ������l�F i_NEW_PASSWORD


	final static String i_NEW_PASSWORD = null;

	// �� 5 �ϐ������l�F i_APPR_POWER_TYP_name


	final static String i_APPR_POWER_TYP_name = null;

	// �� 6 �ϐ������l�F i_APPR_POWER_TYP_val


	final static String i_APPR_POWER_TYP_val = null;

	// �� 7 �ϐ������l�F i_APPR_REMARKS


	final static String i_APPR_REMARKS = null;

	// �� 8 �ϐ������l�F i_h_APPR_ID


	final static String i_h_APPR_ID = null;

	// �� 9 �ϐ������l�F i_h_SCREENMOVE_TYP


	final static String i_h_SCREENMOVE_TYP = null;

	// �� 10 �ϐ������l�F i_h_INSERT_ERROR_FLG


	final static String i_h_INSERT_ERROR_FLG = null;

	// �� 11 �ϐ������l�F i_h_PASSWORD


	final static String i_h_PASSWORD = null;

	// �� 12 �ϐ������l�F i_BUSINESS_GROUP_DISP_FLG


	final static String i_BUSINESS_GROUP_DISP_FLG = null;

	// �� 13 �ϐ������l�F i_OWN_PERSON_CD


	final static String i_OWN_PERSON_CD = null;

	// �� 14 �ϐ������l�F i_USER_CD


	final static String i_USER_CD = null;

	// �� 15 �ϐ������l�F i_USER_NAME


	final static String i_USER_NAME = null;

	// �� 16 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 17 �ϐ������l�F i_PASSWORD


	final static String i_PASSWORD = null;

	// �� 18 �ϐ������l�F i_ADDRESS


	final static String i_ADDRESS = null;

	// �� 19 �ϐ������l�F i_LOCALE


	final static String i_LOCALE = null;

	// �� 20 �ϐ������l�F i_APPR_POWER_TYP


	final static String i_APPR_POWER_TYP = null;

	// �� 21 �ϐ������l�F i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// �� 22 �ϐ������l�F i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// �� 23 �ϐ������l�F i_SECTION_CD


	final static String i_SECTION_CD = null;

	// �� 24 �ϐ������l�F i_ORG_NAME


	final static String i_ORG_NAME = null;

	// �� 25 �ϐ������l�F i_PASSWORD_CHG_DATE


	final static String i_PASSWORD_CHG_DATE = null;

	// �� 26 �ϐ������l�F i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// �� 27 �ϐ������l�F i_BUSINESS_GROUP_CD


	final static String i_BUSINESS_GROUP_CD = null;

	// �� 28 �ϐ������l�F i_BUSINESS_GROUP_NAME


	final static String i_BUSINESS_GROUP_NAME = null;

	// �� 29 �ϐ������l�F i_DISPLAY_NAME


	final static String i_DISPLAY_NAME = null;

	// �� 30 �ϐ������l�F i_h_APR_USER_MST


	final static String i_h_APR_USER_MST = null;

	// �� 31 �ϐ������l�F i_BUSINESS_OPR_DATE


	final static String i_BUSINESS_OPR_DATE = null;

*/

	//{{user_implement_code
	public void initialize()
	{
		clear();

		m_USER_CD = null;
		m_USER_NAME = null;
		m_PLANT_CD = null;
		m_PASSWORD = null;
		m_ADDRESS = null;
		m_LOCALE = null;
		m_MODIFY_COUNT = null;
		m_COMPANY_CD = null;
		

		l_USER_CD = new ArrayList(0);
		l_USER_NAME = new ArrayList(0);
		l_PLANT_CD = new ArrayList(0);
		l_PASSWORD = new ArrayList(0);
		l_ADDRESS = new ArrayList(0);
		l_LOCALE = new ArrayList(0);
		l_MODIFY_COUNT = new ArrayList(0);
		l_COMPANY_CD = new ArrayList(0);
	}

	public void basicCopy(AA0090030Struct struct)
	{
		if(struct.sUser_ID != null) sUser_ID = new String(struct.sUser_ID);
		if(struct.sOrganization_CD != null) sOrganization_CD = new String(struct.sOrganization_CD);
		if(struct.sSysdate != null) sSysdate = new String(struct.sSysdate);
	}

	/**	
	 * �����̏��̕ێ����郊�X�g�̕ϐ�����w��̏��̃f�[�^���擾	
	 * @param in ���X�g�ێ��̏��	
	 * @param index ����	
	 */	
	public void importData(AA0090030Struct in, int index)	
	{	
		clear();
		if(in.l_USER_CD != null && in.l_USER_CD.size() > index)  m_USER_CD = (String)(in.l_USER_CD.get(index));
		if(in.l_USER_NAME != null && in.l_USER_NAME.size() > index)  m_USER_NAME = (String)(in.l_USER_NAME.get(index));
		if(in.l_PLANT_CD != null && in.l_PLANT_CD.size() > index)  m_PLANT_CD = (String)(in.l_PLANT_CD.get(index));
		if(in.l_PASSWORD != null && in.l_PASSWORD.size() > index)  m_PASSWORD = (String)(in.l_PASSWORD.get(index));
		if(in.l_ADDRESS != null && in.l_ADDRESS.size() > index)  m_ADDRESS = (String)(in.l_ADDRESS.get(index));
		if(in.l_LOCALE != null && in.l_LOCALE.size() > index)  m_LOCALE = (String)(in.l_LOCALE.get(index));
		if(in.l_MODIFY_COUNT != null && in.l_MODIFY_COUNT.size() > index)  m_MODIFY_COUNT = (String)(in.l_MODIFY_COUNT.get(index));
		if(in.l_PLANT_NAME != null && in.l_PLANT_NAME.size() > index)  m_PLANT_NAME = (String)(in.l_PLANT_NAME.get(index));
		if(in.l_COMPANY_CD != null && in.l_COMPANY_CD.size() > index)  m_COMPANY_CD = (String)(in.l_COMPANY_CD.get(index));
		if(in.l_BUSINESS_GROUP_CD != null && in.l_BUSINESS_GROUP_CD.size() > index)  m_BUSINESS_GROUP_CD = (String)(in.l_BUSINESS_GROUP_CD.get(index));
		if(in.l_BUSINESS_GROUP_NAME != null && in.l_BUSINESS_GROUP_NAME.size() > index)  m_BUSINESS_GROUP_NAME = (String)(in.l_BUSINESS_GROUP_NAME.get(index));
		if(in.l_BUSINESS_GROUP_VALID_FLG != null && in.l_BUSINESS_GROUP_VALID_FLG.size() > index)  m_BUSINESS_GROUP_VALID_FLG = (String)(in.l_BUSINESS_GROUP_VALID_FLG.get(index));
		if(in.l_BUSINESS_GROUP_DISP_FLG != null && in.l_BUSINESS_GROUP_DISP_FLG.size() > index)  m_BUSINESS_GROUP_DISP_FLG = (String)(in.l_BUSINESS_GROUP_DISP_FLG.get(index));
		if(in.l_DISPLAY_NAME != null && in.l_DISPLAY_NAME.size() > index)  m_DISPLAY_NAME = (String)(in.l_DISPLAY_NAME.get(index));
		return;
	}	

		
	public void copy(AA0090030Struct struct)
	{
		if(struct.m_USER_CD != null)					{m_USER_CD							=	new String(struct.m_USER_CD);					}
		else											{m_USER_CD							=	null;											}

		if(struct.m_USER_NAME != null)					{m_USER_NAME						=	new String(struct.m_USER_NAME);					}
		else											{m_USER_NAME						=	null;											}

		if(struct.m_PLANT_CD != null)					{m_PLANT_CD							=	new String(struct.m_PLANT_CD);					}
		else											{m_PLANT_CD							=	null;											}

		if(struct.m_PASSWORD != null)					{m_PASSWORD							=	new String(struct.m_PASSWORD);					}
		else											{m_PASSWORD							=	null;											}

		if(struct.m_ADDRESS != null)					{m_ADDRESS							=	new String(struct.m_ADDRESS);					}
		else											{m_ADDRESS							=	null;											}
		
		if(struct.m_LOCALE != null)						{m_LOCALE							=	new String(struct.m_LOCALE);					}
		else											{m_LOCALE							=	null;											}

		if(struct.m_APPR_POWER_TYP != null)             {m_APPR_POWER_TYP                   =   new String(struct.m_APPR_POWER_TYP);            }
		else											{m_APPR_POWER_TYP                   =   null;                                           }
			
		if(struct.m_MODIFY_COUNT != null)				{m_MODIFY_COUNT						=	new String(struct.m_MODIFY_COUNT);				}
		else											{m_MODIFY_COUNT						=	null;											}

		if(struct.m_PLANT_NAME != null)					{m_PLANT_NAME						=	new String(struct.m_PLANT_NAME);				}
		else											{m_PLANT_NAME						=	null;											}

		if(struct.m_COMPANY_CD != null)					{m_COMPANY_CD						=	new String(struct.m_COMPANY_CD);				}
		else											{m_COMPANY_CD						=	null;											}

		if(struct.m_BUSINESS_GROUP_CD != null)			{m_BUSINESS_GROUP_CD				=	new String(struct.m_BUSINESS_GROUP_CD);			}
		else											{m_BUSINESS_GROUP_CD				=	null;											}

		if(struct.m_BUSINESS_GROUP_NAME != null)		{m_BUSINESS_GROUP_NAME				=	new String(struct.m_BUSINESS_GROUP_NAME);		}
		else											{m_BUSINESS_GROUP_NAME				=	null;											}

		if(struct.m_BUSINESS_GROUP_DISP_FLG != null)	{m_BUSINESS_GROUP_DISP_FLG			=	new String(struct.m_BUSINESS_GROUP_DISP_FLG);	}
		else											{m_BUSINESS_GROUP_DISP_FLG			=	null;											}

		if(struct.m_BUSINESS_GROUP_VALID_FLG != null)	{m_BUSINESS_GROUP_VALID_FLG			=	new String(struct.m_BUSINESS_GROUP_VALID_FLG);	}
		else											{m_BUSINESS_GROUP_VALID_FLG			=	null;											}
		
		if(struct.m_DISPLAY_NAME != null)				{m_DISPLAY_NAME						=	new String(struct.m_DISPLAY_NAME);				}
		else											{m_DISPLAY_NAME						=	null;											}
		
		if(struct.m_APPR_REMARKS != null)				{m_APPR_REMARKS						=	new String(struct.m_APPR_REMARKS);				}
		else											{m_APPR_REMARKS						=	null;											}
		
		if(struct.m_SECTION_CD != null)				    {m_SECTION_CD						=	new String(struct.m_SECTION_CD);				}
		else											{m_SECTION_CD						=	null;											}
		
		if(struct.m_PASSWORD_CHG_DATE != null)		    {m_PASSWORD_CHG_DATE				=	new String(struct.m_PASSWORD_CHG_DATE);			}
		else											{m_PASSWORD_CHG_DATE				=	null;											}

		if(struct.m_ORG_NAME != null)		    		{m_ORG_NAME							=	new String(struct.m_ORG_NAME);					}
		else											{m_ORG_NAME							=	null;											}
		
		if(struct.m_h_PASSWORD != null)					{m_h_PASSWORD				    	=	new String(struct.m_h_PASSWORD);				}
		else											{m_h_PASSWORD						=	null;											}
	}
        //}}user_implement_code

	//////////////////////////////

}
