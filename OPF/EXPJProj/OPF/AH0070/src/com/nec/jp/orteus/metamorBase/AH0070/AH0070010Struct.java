/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AH0070/src/com/nec/jp/orteus/metamorBase/AH0070/AH0070010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AH0070;

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

public class AH0070010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_w_INV_STS_TYP */
	public String m_w_INV_STS_TYP = null;
	/** �� 2 �ϐ��F m_c_REGULAR_INV_FLG */
	public String m_c_REGULAR_INV_FLG = null;
	/** �� 3 �ϐ��F m_c_CYCLE_INV_FLG */
	public String m_c_CYCLE_INV_FLG = null;
	/** �� 4 �ϐ��F m_c_TEMP_INV_FLG */
	public String m_c_TEMP_INV_FLG = null;
	/** �� 5 �ϐ��F m_h_APR_INV_CTRL */
	public String m_h_APR_INV_CTRL = null;
	/** �� 6 �ϐ��F m_h_APRR_FLG */
	public String m_h_APRR_FLG = null;
	/** �� 7 �ϐ��F m_h_APRR_POWER_TYP */
	public String m_h_APRR_POWER_TYP = null;
	/** �� 8 �ϐ��F m_w_APPR_INV_STS_TYP */
	public String m_w_APPR_INV_STS_TYP = null;
	/** �� 9 �ϐ��F m_INV_DATE */
	public String m_INV_DATE = null;
	/** �� 10 �ϐ��F m_REGULAR_INV_FLG */
	public String m_REGULAR_INV_FLG = null;
	/** �� 11 �ϐ��F m_CYCLE_INV_FLG */
	public String m_CYCLE_INV_FLG = null;
	/** �� 12 �ϐ��F m_TEMP_INV_FLG */
	public String m_TEMP_INV_FLG = null;
	/** �� 13 �ϐ��F m_INV_STS_TYP */
	public String m_INV_STS_TYP = null;
	/** �� 14 �ϐ��F m_INV_START_DATE */
	public String m_INV_START_DATE = null;
	/** �� 15 �ϐ��F m_STOCK_SAVE_DATE */
	public String m_STOCK_SAVE_DATE = null;
	/** �� 16 �ϐ��F m_INV_UPDATED_DATE */
	public String m_INV_UPDATED_DATE = null;
	/** �� 17 �ϐ��F m_INV_COMMENT */
	public String m_INV_COMMENT = null;
	/** �� 18 �ϐ��F m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** �� 19 �ϐ��F m_APPR_FLG */
	public String m_APPR_FLG = null;
	/** �� 20 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 21 �ϐ��F m_SYS_USER_CD */
	public String m_SYS_USER_CD = null;
	/** �� 22 �ϐ��F m_BUSINESS_DATE */
	public String m_BUSINESS_DATE = null;
	/** �� 23 �ϐ��F m_APPR_POWER_TYP */
	public String m_APPR_POWER_TYP = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_w_INV_STS_TYP */
	public List l_w_INV_STS_TYP = null;

	/** �� 2 List�ϐ��F l_c_REGULAR_INV_FLG */
	public List l_c_REGULAR_INV_FLG = null;

	/** �� 3 List�ϐ��F l_c_CYCLE_INV_FLG */
	public List l_c_CYCLE_INV_FLG = null;

	/** �� 4 List�ϐ��F l_c_TEMP_INV_FLG */
	public List l_c_TEMP_INV_FLG = null;

	/** �� 5 List�ϐ��F l_h_APR_INV_CTRL */
	public List l_h_APR_INV_CTRL = null;

	/** �� 6 List�ϐ��F l_h_APRR_FLG */
	public List l_h_APRR_FLG = null;

	/** �� 7 List�ϐ��F l_h_APRR_POWER_TYP */
	public List l_h_APRR_POWER_TYP = null;

	/** �� 8 List�ϐ��F l_w_APPR_INV_STS_TYP */
	public List l_w_APPR_INV_STS_TYP = null;

	/** �� 9 List�ϐ��F l_INV_DATE */
	public List l_INV_DATE = null;

	/** �� 10 List�ϐ��F l_REGULAR_INV_FLG */
	public List l_REGULAR_INV_FLG = null;

	/** �� 11 List�ϐ��F l_CYCLE_INV_FLG */
	public List l_CYCLE_INV_FLG = null;

	/** �� 12 List�ϐ��F l_TEMP_INV_FLG */
	public List l_TEMP_INV_FLG = null;

	/** �� 13 List�ϐ��F l_INV_STS_TYP */
	public List l_INV_STS_TYP = null;

	/** �� 14 List�ϐ��F l_INV_START_DATE */
	public List l_INV_START_DATE = null;

	/** �� 15 List�ϐ��F l_STOCK_SAVE_DATE */
	public List l_STOCK_SAVE_DATE = null;

	/** �� 16 List�ϐ��F l_INV_UPDATED_DATE */
	public List l_INV_UPDATED_DATE = null;

	/** �� 17 List�ϐ��F l_INV_COMMENT */
	public List l_INV_COMMENT = null;

	/** �� 18 List�ϐ��F l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** �� 19 List�ϐ��F l_APPR_FLG */
	public List l_APPR_FLG = null;

	/** �� 20 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 21 List�ϐ��F l_SYS_USER_CD */
	public List l_SYS_USER_CD = null;

	/** �� 22 List�ϐ��F l_BUSINESS_DATE */
	public List l_BUSINESS_DATE = null;

	/** �� 23 List�ϐ��F l_APPR_POWER_TYP */
	public List l_APPR_POWER_TYP = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getw_INV_STS_TYP() { return m_w_INV_STS_TYP; }
	public String getc_REGULAR_INV_FLG() { return m_c_REGULAR_INV_FLG; }
	public String getc_CYCLE_INV_FLG() { return m_c_CYCLE_INV_FLG; }
	public String getc_TEMP_INV_FLG() { return m_c_TEMP_INV_FLG; }
	public String geth_APR_INV_CTRL() { return m_h_APR_INV_CTRL; }
	public String geth_APRR_FLG() { return m_h_APRR_FLG; }
	public String geth_APRR_POWER_TYP() { return m_h_APRR_POWER_TYP; }
	public String getw_APPR_INV_STS_TYP() { return m_w_APPR_INV_STS_TYP; }
	public String getINV_DATE() { return m_INV_DATE; }
	public String getREGULAR_INV_FLG() { return m_REGULAR_INV_FLG; }
	public String getCYCLE_INV_FLG() { return m_CYCLE_INV_FLG; }
	public String getTEMP_INV_FLG() { return m_TEMP_INV_FLG; }
	public String getINV_STS_TYP() { return m_INV_STS_TYP; }
	public String getINV_START_DATE() { return m_INV_START_DATE; }
	public String getSTOCK_SAVE_DATE() { return m_STOCK_SAVE_DATE; }
	public String getINV_UPDATED_DATE() { return m_INV_UPDATED_DATE; }
	public String getINV_COMMENT() { return m_INV_COMMENT; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getAPPR_FLG() { return m_APPR_FLG; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getSYS_USER_CD() { return m_SYS_USER_CD; }
	public String getBUSINESS_DATE() { return m_BUSINESS_DATE; }
	public String getAPPR_POWER_TYP() { return m_APPR_POWER_TYP; }

	public List getList_w_INV_STS_TYP() { return l_w_INV_STS_TYP; }
	public List getList_c_REGULAR_INV_FLG() { return l_c_REGULAR_INV_FLG; }
	public List getList_c_CYCLE_INV_FLG() { return l_c_CYCLE_INV_FLG; }
	public List getList_c_TEMP_INV_FLG() { return l_c_TEMP_INV_FLG; }
	public List getList_h_APR_INV_CTRL() { return l_h_APR_INV_CTRL; }
	public List getList_h_APRR_FLG() { return l_h_APRR_FLG; }
	public List getList_h_APRR_POWER_TYP() { return l_h_APRR_POWER_TYP; }
	public List getList_w_APPR_INV_STS_TYP() { return l_w_APPR_INV_STS_TYP; }
	public List getList_INV_DATE() { return l_INV_DATE; }
	public List getList_REGULAR_INV_FLG() { return l_REGULAR_INV_FLG; }
	public List getList_CYCLE_INV_FLG() { return l_CYCLE_INV_FLG; }
	public List getList_TEMP_INV_FLG() { return l_TEMP_INV_FLG; }
	public List getList_INV_STS_TYP() { return l_INV_STS_TYP; }
	public List getList_INV_START_DATE() { return l_INV_START_DATE; }
	public List getList_STOCK_SAVE_DATE() { return l_STOCK_SAVE_DATE; }
	public List getList_INV_UPDATED_DATE() { return l_INV_UPDATED_DATE; }
	public List getList_INV_COMMENT() { return l_INV_COMMENT; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_APPR_FLG() { return l_APPR_FLG; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_SYS_USER_CD() { return l_SYS_USER_CD; }
	public List getList_BUSINESS_DATE() { return l_BUSINESS_DATE; }
	public List getList_APPR_POWER_TYP() { return l_APPR_POWER_TYP; }

	public void setw_INV_STS_TYP(String val) { m_w_INV_STS_TYP = val; }
	public void setc_REGULAR_INV_FLG(String val) { m_c_REGULAR_INV_FLG = val; }
	public void setc_CYCLE_INV_FLG(String val) { m_c_CYCLE_INV_FLG = val; }
	public void setc_TEMP_INV_FLG(String val) { m_c_TEMP_INV_FLG = val; }
	public void seth_APR_INV_CTRL(String val) { m_h_APR_INV_CTRL = val; }
	public void seth_APRR_FLG(String val) { m_h_APRR_FLG = val; }
	public void seth_APRR_POWER_TYP(String val) { m_h_APRR_POWER_TYP = val; }
	public void setw_APPR_INV_STS_TYP(String val) { m_w_APPR_INV_STS_TYP = val; }
	public void setINV_DATE(String val) { m_INV_DATE = val; }
	public void setREGULAR_INV_FLG(String val) { m_REGULAR_INV_FLG = val; }
	public void setCYCLE_INV_FLG(String val) { m_CYCLE_INV_FLG = val; }
	public void setTEMP_INV_FLG(String val) { m_TEMP_INV_FLG = val; }
	public void setINV_STS_TYP(String val) { m_INV_STS_TYP = val; }
	public void setINV_START_DATE(String val) { m_INV_START_DATE = val; }
	public void setSTOCK_SAVE_DATE(String val) { m_STOCK_SAVE_DATE = val; }
	public void setINV_UPDATED_DATE(String val) { m_INV_UPDATED_DATE = val; }
	public void setINV_COMMENT(String val) { m_INV_COMMENT = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setAPPR_FLG(String val) { m_APPR_FLG = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setSYS_USER_CD(String val) { m_SYS_USER_CD = val; }
	public void setBUSINESS_DATE(String val) { m_BUSINESS_DATE = val; }
	public void setAPPR_POWER_TYP(String val) { m_APPR_POWER_TYP = val; }


	public void setList_w_INV_STS_TYP(List list) { l_w_INV_STS_TYP = list; }
	public void setList_c_REGULAR_INV_FLG(List list) { l_c_REGULAR_INV_FLG = list; }
	public void setList_c_CYCLE_INV_FLG(List list) { l_c_CYCLE_INV_FLG = list; }
	public void setList_c_TEMP_INV_FLG(List list) { l_c_TEMP_INV_FLG = list; }
	public void setList_h_APR_INV_CTRL(List list) { l_h_APR_INV_CTRL = list; }
	public void setList_h_APRR_FLG(List list) { l_h_APRR_FLG = list; }
	public void setList_h_APRR_POWER_TYP(List list) { l_h_APRR_POWER_TYP = list; }
	public void setList_w_APPR_INV_STS_TYP(List list) { l_w_APPR_INV_STS_TYP = list; }
	public void setList_INV_DATE(List list) { l_INV_DATE = list; }
	public void setList_REGULAR_INV_FLG(List list) { l_REGULAR_INV_FLG = list; }
	public void setList_CYCLE_INV_FLG(List list) { l_CYCLE_INV_FLG = list; }
	public void setList_TEMP_INV_FLG(List list) { l_TEMP_INV_FLG = list; }
	public void setList_INV_STS_TYP(List list) { l_INV_STS_TYP = list; }
	public void setList_INV_START_DATE(List list) { l_INV_START_DATE = list; }
	public void setList_STOCK_SAVE_DATE(List list) { l_STOCK_SAVE_DATE = list; }
	public void setList_INV_UPDATED_DATE(List list) { l_INV_UPDATED_DATE = list; }
	public void setList_INV_COMMENT(List list) { l_INV_COMMENT = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_APPR_FLG(List list) { l_APPR_FLG = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_SYS_USER_CD(List list) { l_SYS_USER_CD = list; }
	public void setList_BUSINESS_DATE(List list) { l_BUSINESS_DATE = list; }
	public void setList_APPR_POWER_TYP(List list) { l_APPR_POWER_TYP = list; }

	public int setL2L_w_INV_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_INV_STS_TYP == null) {
			l_w_INV_STS_TYP = new ArrayList();
		} else {
			l_w_INV_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_INV_STS_TYP.add(((AH0070010Struct) list.get(i)).getw_INV_STS_TYP());
		}
		return size;
	}
	public int setL2L_c_REGULAR_INV_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_REGULAR_INV_FLG == null) {
			l_c_REGULAR_INV_FLG = new ArrayList();
		} else {
			l_c_REGULAR_INV_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_REGULAR_INV_FLG.add(((AH0070010Struct) list.get(i)).getc_REGULAR_INV_FLG());
		}
		return size;
	}
	public int setL2L_c_CYCLE_INV_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_CYCLE_INV_FLG == null) {
			l_c_CYCLE_INV_FLG = new ArrayList();
		} else {
			l_c_CYCLE_INV_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_CYCLE_INV_FLG.add(((AH0070010Struct) list.get(i)).getc_CYCLE_INV_FLG());
		}
		return size;
	}
	public int setL2L_c_TEMP_INV_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_TEMP_INV_FLG == null) {
			l_c_TEMP_INV_FLG = new ArrayList();
		} else {
			l_c_TEMP_INV_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_TEMP_INV_FLG.add(((AH0070010Struct) list.get(i)).getc_TEMP_INV_FLG());
		}
		return size;
	}
	public int setL2L_h_APR_INV_CTRL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_APR_INV_CTRL == null) {
			l_h_APR_INV_CTRL = new ArrayList();
		} else {
			l_h_APR_INV_CTRL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_APR_INV_CTRL.add(((AH0070010Struct) list.get(i)).geth_APR_INV_CTRL());
		}
		return size;
	}
	public int setL2L_h_APRR_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_APRR_FLG == null) {
			l_h_APRR_FLG = new ArrayList();
		} else {
			l_h_APRR_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_APRR_FLG.add(((AH0070010Struct) list.get(i)).geth_APRR_FLG());
		}
		return size;
	}
	public int setL2L_h_APRR_POWER_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_APRR_POWER_TYP == null) {
			l_h_APRR_POWER_TYP = new ArrayList();
		} else {
			l_h_APRR_POWER_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_APRR_POWER_TYP.add(((AH0070010Struct) list.get(i)).geth_APRR_POWER_TYP());
		}
		return size;
	}
	public int setL2L_w_APPR_INV_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_APPR_INV_STS_TYP == null) {
			l_w_APPR_INV_STS_TYP = new ArrayList();
		} else {
			l_w_APPR_INV_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_APPR_INV_STS_TYP.add(((AH0070010Struct) list.get(i)).getw_APPR_INV_STS_TYP());
		}
		return size;
	}
	public int setL2L_INV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INV_DATE == null) {
			l_INV_DATE = new ArrayList();
		} else {
			l_INV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INV_DATE.add(((AH0070010Struct) list.get(i)).getINV_DATE());
		}
		return size;
	}
	public int setL2L_REGULAR_INV_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_REGULAR_INV_FLG == null) {
			l_REGULAR_INV_FLG = new ArrayList();
		} else {
			l_REGULAR_INV_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_REGULAR_INV_FLG.add(((AH0070010Struct) list.get(i)).getREGULAR_INV_FLG());
		}
		return size;
	}
	public int setL2L_CYCLE_INV_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CYCLE_INV_FLG == null) {
			l_CYCLE_INV_FLG = new ArrayList();
		} else {
			l_CYCLE_INV_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CYCLE_INV_FLG.add(((AH0070010Struct) list.get(i)).getCYCLE_INV_FLG());
		}
		return size;
	}
	public int setL2L_TEMP_INV_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TEMP_INV_FLG == null) {
			l_TEMP_INV_FLG = new ArrayList();
		} else {
			l_TEMP_INV_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TEMP_INV_FLG.add(((AH0070010Struct) list.get(i)).getTEMP_INV_FLG());
		}
		return size;
	}
	public int setL2L_INV_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INV_STS_TYP == null) {
			l_INV_STS_TYP = new ArrayList();
		} else {
			l_INV_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INV_STS_TYP.add(((AH0070010Struct) list.get(i)).getINV_STS_TYP());
		}
		return size;
	}
	public int setL2L_INV_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INV_START_DATE == null) {
			l_INV_START_DATE = new ArrayList();
		} else {
			l_INV_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INV_START_DATE.add(((AH0070010Struct) list.get(i)).getINV_START_DATE());
		}
		return size;
	}
	public int setL2L_STOCK_SAVE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_SAVE_DATE == null) {
			l_STOCK_SAVE_DATE = new ArrayList();
		} else {
			l_STOCK_SAVE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_SAVE_DATE.add(((AH0070010Struct) list.get(i)).getSTOCK_SAVE_DATE());
		}
		return size;
	}
	public int setL2L_INV_UPDATED_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INV_UPDATED_DATE == null) {
			l_INV_UPDATED_DATE = new ArrayList();
		} else {
			l_INV_UPDATED_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INV_UPDATED_DATE.add(((AH0070010Struct) list.get(i)).getINV_UPDATED_DATE());
		}
		return size;
	}
	public int setL2L_INV_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INV_COMMENT == null) {
			l_INV_COMMENT = new ArrayList();
		} else {
			l_INV_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INV_COMMENT.add(((AH0070010Struct) list.get(i)).getINV_COMMENT());
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
			l_MODIFY_COUNT.add(((AH0070010Struct) list.get(i)).getMODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_APPR_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_APPR_FLG == null) {
			l_APPR_FLG = new ArrayList();
		} else {
			l_APPR_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_APPR_FLG.add(((AH0070010Struct) list.get(i)).getAPPR_FLG());
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
			l_PLANT_CD.add(((AH0070010Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_SYS_USER_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SYS_USER_CD == null) {
			l_SYS_USER_CD = new ArrayList();
		} else {
			l_SYS_USER_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SYS_USER_CD.add(((AH0070010Struct) list.get(i)).getSYS_USER_CD());
		}
		return size;
	}
	public int setL2L_BUSINESS_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BUSINESS_DATE == null) {
			l_BUSINESS_DATE = new ArrayList();
		} else {
			l_BUSINESS_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BUSINESS_DATE.add(((AH0070010Struct) list.get(i)).getBUSINESS_DATE());
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
			l_APPR_POWER_TYP.add(((AH0070010Struct) list.get(i)).getAPPR_POWER_TYP());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_w_INV_STS_TYP = null;
		m_c_REGULAR_INV_FLG = null;
		m_c_CYCLE_INV_FLG = null;
		m_c_TEMP_INV_FLG = null;
		m_h_APR_INV_CTRL = null;
		m_h_APRR_FLG = null;
		m_h_APRR_POWER_TYP = null;
		m_w_APPR_INV_STS_TYP = null;
		m_INV_DATE = null;
		m_REGULAR_INV_FLG = null;
		m_CYCLE_INV_FLG = null;
		m_TEMP_INV_FLG = null;
		m_INV_STS_TYP = null;
		m_INV_START_DATE = null;
		m_STOCK_SAVE_DATE = null;
		m_INV_UPDATED_DATE = null;
		m_INV_COMMENT = null;
		m_MODIFY_COUNT = null;
		m_APPR_FLG = null;
		m_PLANT_CD = null;
		m_SYS_USER_CD = null;
		m_BUSINESS_DATE = null;
		m_APPR_POWER_TYP = null;

		l_w_INV_STS_TYP = null;
		l_c_REGULAR_INV_FLG = null;
		l_c_CYCLE_INV_FLG = null;
		l_c_TEMP_INV_FLG = null;
		l_h_APR_INV_CTRL = null;
		l_h_APRR_FLG = null;
		l_h_APRR_POWER_TYP = null;
		l_w_APPR_INV_STS_TYP = null;
		l_INV_DATE = null;
		l_REGULAR_INV_FLG = null;
		l_CYCLE_INV_FLG = null;
		l_TEMP_INV_FLG = null;
		l_INV_STS_TYP = null;
		l_INV_START_DATE = null;
		l_STOCK_SAVE_DATE = null;
		l_INV_UPDATED_DATE = null;
		l_INV_COMMENT = null;
		l_MODIFY_COUNT = null;
		l_APPR_FLG = null;
		l_PLANT_CD = null;
		l_SYS_USER_CD = null;
		l_BUSINESS_DATE = null;
		l_APPR_POWER_TYP = null;

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
	 * medAH0070010�N���X�̕W���R���X�g���N�^
	 */
	public AH0070010Struct()
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
	public void setStruct(AH0070010Struct struct)
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
	public void setStructM(AH0070010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setw_INV_STS_TYP(struct.getw_INV_STS_TYP());
			this.setc_REGULAR_INV_FLG(struct.getc_REGULAR_INV_FLG());
			this.setc_CYCLE_INV_FLG(struct.getc_CYCLE_INV_FLG());
			this.setc_TEMP_INV_FLG(struct.getc_TEMP_INV_FLG());
			this.seth_APR_INV_CTRL(struct.geth_APR_INV_CTRL());
			this.seth_APRR_FLG(struct.geth_APRR_FLG());
			this.seth_APRR_POWER_TYP(struct.geth_APRR_POWER_TYP());
			this.setw_APPR_INV_STS_TYP(struct.getw_APPR_INV_STS_TYP());
			this.setINV_DATE(struct.getINV_DATE());
			this.setREGULAR_INV_FLG(struct.getREGULAR_INV_FLG());
			this.setCYCLE_INV_FLG(struct.getCYCLE_INV_FLG());
			this.setTEMP_INV_FLG(struct.getTEMP_INV_FLG());
			this.setINV_STS_TYP(struct.getINV_STS_TYP());
			this.setINV_START_DATE(struct.getINV_START_DATE());
			this.setSTOCK_SAVE_DATE(struct.getSTOCK_SAVE_DATE());
			this.setINV_UPDATED_DATE(struct.getINV_UPDATED_DATE());
			this.setINV_COMMENT(struct.getINV_COMMENT());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setAPPR_FLG(struct.getAPPR_FLG());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setSYS_USER_CD(struct.getSYS_USER_CD());
			this.setBUSINESS_DATE(struct.getBUSINESS_DATE());
			this.setAPPR_POWER_TYP(struct.getAPPR_POWER_TYP());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AH0070010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_w_INV_STS_TYP(struct.getList_w_INV_STS_TYP());
			this.setList_c_REGULAR_INV_FLG(struct.getList_c_REGULAR_INV_FLG());
			this.setList_c_CYCLE_INV_FLG(struct.getList_c_CYCLE_INV_FLG());
			this.setList_c_TEMP_INV_FLG(struct.getList_c_TEMP_INV_FLG());
			this.setList_h_APR_INV_CTRL(struct.getList_h_APR_INV_CTRL());
			this.setList_h_APRR_FLG(struct.getList_h_APRR_FLG());
			this.setList_h_APRR_POWER_TYP(struct.getList_h_APRR_POWER_TYP());
			this.setList_w_APPR_INV_STS_TYP(struct.getList_w_APPR_INV_STS_TYP());
			this.setList_INV_DATE(struct.getList_INV_DATE());
			this.setList_REGULAR_INV_FLG(struct.getList_REGULAR_INV_FLG());
			this.setList_CYCLE_INV_FLG(struct.getList_CYCLE_INV_FLG());
			this.setList_TEMP_INV_FLG(struct.getList_TEMP_INV_FLG());
			this.setList_INV_STS_TYP(struct.getList_INV_STS_TYP());
			this.setList_INV_START_DATE(struct.getList_INV_START_DATE());
			this.setList_STOCK_SAVE_DATE(struct.getList_STOCK_SAVE_DATE());
			this.setList_INV_UPDATED_DATE(struct.getList_INV_UPDATED_DATE());
			this.setList_INV_COMMENT(struct.getList_INV_COMMENT());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_APPR_FLG(struct.getList_APPR_FLG());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_SYS_USER_CD(struct.getList_SYS_USER_CD());
			this.setList_BUSINESS_DATE(struct.getList_BUSINESS_DATE());
			this.setList_APPR_POWER_TYP(struct.getList_APPR_POWER_TYP());
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
	// �� 1 �ϐ������l�F i_w_INV_STS_TYP


	final static String i_w_INV_STS_TYP = null;

	// �� 2 �ϐ������l�F i_c_REGULAR_INV_FLG


	final static String i_c_REGULAR_INV_FLG = null;

	// �� 3 �ϐ������l�F i_c_CYCLE_INV_FLG


	final static String i_c_CYCLE_INV_FLG = null;

	// �� 4 �ϐ������l�F i_c_TEMP_INV_FLG


	final static String i_c_TEMP_INV_FLG = null;

	// �� 5 �ϐ������l�F i_h_APR_INV_CTRL


	final static String i_h_APR_INV_CTRL = null;

	// �� 6 �ϐ������l�F i_h_APRR_FLG


	final static String i_h_APRR_FLG = null;

	// �� 7 �ϐ������l�F i_h_APRR_POWER_TYP


	final static String i_h_APRR_POWER_TYP = null;

	// �� 8 �ϐ������l�F i_w_APPR_INV_STS_TYP


	final static String i_w_APPR_INV_STS_TYP = null;

	// �� 9 �ϐ������l�F i_INV_DATE


	final static String i_INV_DATE = null;

	// �� 10 �ϐ������l�F i_REGULAR_INV_FLG


	final static String i_REGULAR_INV_FLG = null;

	// �� 11 �ϐ������l�F i_CYCLE_INV_FLG


	final static String i_CYCLE_INV_FLG = null;

	// �� 12 �ϐ������l�F i_TEMP_INV_FLG


	final static String i_TEMP_INV_FLG = null;

	// �� 13 �ϐ������l�F i_INV_STS_TYP


	final static String i_INV_STS_TYP = null;

	// �� 14 �ϐ������l�F i_INV_START_DATE


	final static String i_INV_START_DATE = null;

	// �� 15 �ϐ������l�F i_STOCK_SAVE_DATE


	final static String i_STOCK_SAVE_DATE = null;

	// �� 16 �ϐ������l�F i_INV_UPDATED_DATE


	final static String i_INV_UPDATED_DATE = null;

	// �� 17 �ϐ������l�F i_INV_COMMENT


	final static String i_INV_COMMENT = null;

	// �� 18 �ϐ������l�F i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// �� 19 �ϐ������l�F i_APPR_FLG


	final static String i_APPR_FLG = null;

	// �� 20 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 21 �ϐ������l�F i_SYS_USER_CD


	final static String i_SYS_USER_CD = null;

	// �� 22 �ϐ������l�F i_BUSINESS_DATE


	final static String i_BUSINESS_DATE = null;

	// �� 23 �ϐ������l�F i_APPR_POWER_TYP


	final static String i_APPR_POWER_TYP = null;

*/

	//{{user_implement_code
        //------------------------------------------------------------------
        /**
         * �e��ʏ����l�ݒ�
         *
         * @param �Ȃ�
         */
        public void initializeParent()
        {
         clear();
        }
       
        /**
         * �������ϐ��̃R�s�[
         * @param s �R�s�[��
         */
        public void copy(AH0070010Struct s)
        {
         clear();
         if(s.m_INV_DATE != null) m_INV_DATE = new String(s.m_INV_DATE);
         if(s.m_REGULAR_INV_FLG != null) m_REGULAR_INV_FLG = new String(s.m_REGULAR_INV_FLG);
         if(s.m_CYCLE_INV_FLG != null) m_CYCLE_INV_FLG = new String(s.m_CYCLE_INV_FLG);
         if(s.m_TEMP_INV_FLG != null) m_TEMP_INV_FLG = new String(s.m_TEMP_INV_FLG);
         if(s.m_INV_STS_TYP != null) m_INV_STS_TYP = new String(s.m_INV_STS_TYP);
         if(s.m_INV_START_DATE != null) m_INV_START_DATE = new String(s.m_INV_START_DATE);
         if(s.m_STOCK_SAVE_DATE != null) m_STOCK_SAVE_DATE = new String(s.m_STOCK_SAVE_DATE);
         if(s.m_INV_UPDATED_DATE != null) m_INV_UPDATED_DATE = new String(s.m_INV_UPDATED_DATE);
         if(s.m_INV_COMMENT != null) m_INV_COMMENT = new String(s.m_INV_COMMENT);
         if(s.m_MODIFY_COUNT != null) m_MODIFY_COUNT = new String(s.m_MODIFY_COUNT);
         if(s.m_PLANT_CD != null) m_PLANT_CD = new String(s.m_PLANT_CD);
         if(s.m_w_INV_STS_TYP != null) m_w_INV_STS_TYP = new String(s.m_w_INV_STS_TYP);
         if(s.m_c_REGULAR_INV_FLG != null) m_c_REGULAR_INV_FLG = new String(s.m_c_REGULAR_INV_FLG);
         if(s.m_c_CYCLE_INV_FLG != null) m_c_CYCLE_INV_FLG = new String(s.m_c_CYCLE_INV_FLG);
         if(s.m_c_TEMP_INV_FLG != null) m_c_TEMP_INV_FLG = new String(s.m_c_TEMP_INV_FLG);
         if(s.m_APPR_FLG != null) m_APPR_FLG = new String(s.m_APPR_FLG);
        }
        //------------------------------------------------------------------
        //}}user_implement_code

	//////////////////////////////

}
