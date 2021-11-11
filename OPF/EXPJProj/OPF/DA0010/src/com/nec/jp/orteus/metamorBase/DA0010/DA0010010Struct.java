/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DA0010/src/com/nec/jp/orteus/metamorBase/DA0010/DA0010010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.DA0010;

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

public class DA0010010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_DispDeleteFlg */
	public String m_DispDeleteFlg = null;
	/** �� 2 �ϐ��F m_OUTSIDE_TYP_name */
	public String m_OUTSIDE_TYP_name = null;
	/** �� 3 �ϐ��F m_OUTSIDE_TYP_val */
	public String m_OUTSIDE_TYP_val = null;
	/** �� 4 �ϐ��F m_STD_COST_UNIT_TYP_name */
	public String m_STD_COST_UNIT_TYP_name = null;
	/** �� 5 �ϐ��F m_STD_COST_UNIT_TYP_val */
	public String m_STD_COST_UNIT_TYP_val = null;
	/** �� 6 �ϐ��F m_l_CS_PROC_CD */
	public String m_l_CS_PROC_CD = null;
	/** �� 7 �ϐ��F m_l_CS_PROC_NAME */
	public String m_l_CS_PROC_NAME = null;
	/** �� 8 �ϐ��F m_l_WS_CD */
	public String m_l_WS_CD = null;
	/** �� 9 �ϐ��F m_l_WS_NAME */
	public String m_l_WS_NAME = null;
	/** �� 10 �ϐ��F m_l_OUTSIDE_TYP_DN */
	public String m_l_OUTSIDE_TYP_DN = null;
	/** �� 11 �ϐ��F m_l_VEND_CD */
	public String m_l_VEND_CD = null;
	/** �� 12 �ϐ��F m_l_VEND_ANAME */
	public String m_l_VEND_ANAME = null;
	/** �� 13 �ϐ��F m_l_MODIFY_COUNT */
	public String m_l_MODIFY_COUNT = null;
	/** �� 14 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 15 �ϐ��F m_w_CS_PROC_CD */
	public String m_w_CS_PROC_CD = null;
	/** �� 16 �ϐ��F m_w_WS_CD */
	public String m_w_WS_CD = null;
	/** �� 17 �ϐ��F m_DEL_FLG */
	public String m_DEL_FLG = null;
	/** �� 18 �ϐ��F m_CS_PROC_CD */
	public String m_CS_PROC_CD = null;
	/** �� 19 �ϐ��F m_CS_PROC_NAME */
	public String m_CS_PROC_NAME = null;
	/** �� 20 �ϐ��F m_WS_CD */
	public String m_WS_CD = null;
	/** �� 21 �ϐ��F m_WS_NAME */
	public String m_WS_NAME = null;
	/** �� 22 �ϐ��F m_OUTSIDE_TYP */
	public String m_OUTSIDE_TYP = null;
	/** �� 23 �ϐ��F m_VEND_CD */
	public String m_VEND_CD = null;
	/** �� 24 �ϐ��F m_VEND_NAME */
	public String m_VEND_NAME = null;
	/** �� 25 �ϐ��F m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** �� 26 �ϐ��F m_ORG_CD */
	public String m_ORG_CD = null;
	/** �� 27 �ϐ��F m_ORG_NAME */
	public String m_ORG_NAME = null;
	/** �� 28 �ϐ��F m_STD_COST_OF_MONTH */
	public String m_STD_COST_OF_MONTH = null;
	/** �� 29 �ϐ��F m_STD_COST_UNIT_TYP */
	public String m_STD_COST_UNIT_TYP = null;
	/** �� 30 �ϐ��F m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** �� 31 �ϐ��F m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** �� 32 �ϐ��F m_l_COUNT */
	public String m_l_COUNT = null;
	/** �� 33 �ϐ��F m_ROW_COUNT */
	public String m_ROW_COUNT = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_DispDeleteFlg */
	public List l_DispDeleteFlg = null;

	/** �� 2 List�ϐ��F l_OUTSIDE_TYP_name */
	public List l_OUTSIDE_TYP_name = null;

	/** �� 3 List�ϐ��F l_OUTSIDE_TYP_val */
	public List l_OUTSIDE_TYP_val = null;

	/** �� 4 List�ϐ��F l_STD_COST_UNIT_TYP_name */
	public List l_STD_COST_UNIT_TYP_name = null;

	/** �� 5 List�ϐ��F l_STD_COST_UNIT_TYP_val */
	public List l_STD_COST_UNIT_TYP_val = null;

	/** �� 6 List�ϐ��F l_l_CS_PROC_CD */
	public List l_l_CS_PROC_CD = null;

	/** �� 7 List�ϐ��F l_l_CS_PROC_NAME */
	public List l_l_CS_PROC_NAME = null;

	/** �� 8 List�ϐ��F l_l_WS_CD */
	public List l_l_WS_CD = null;

	/** �� 9 List�ϐ��F l_l_WS_NAME */
	public List l_l_WS_NAME = null;

	/** �� 10 List�ϐ��F l_l_OUTSIDE_TYP_DN */
	public List l_l_OUTSIDE_TYP_DN = null;

	/** �� 11 List�ϐ��F l_l_VEND_CD */
	public List l_l_VEND_CD = null;

	/** �� 12 List�ϐ��F l_l_VEND_ANAME */
	public List l_l_VEND_ANAME = null;

	/** �� 13 List�ϐ��F l_l_MODIFY_COUNT */
	public List l_l_MODIFY_COUNT = null;

	/** �� 14 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 15 List�ϐ��F l_w_CS_PROC_CD */
	public List l_w_CS_PROC_CD = null;

	/** �� 16 List�ϐ��F l_w_WS_CD */
	public List l_w_WS_CD = null;

	/** �� 17 List�ϐ��F l_DEL_FLG */
	public List l_DEL_FLG = null;

	/** �� 18 List�ϐ��F l_CS_PROC_CD */
	public List l_CS_PROC_CD = null;

	/** �� 19 List�ϐ��F l_CS_PROC_NAME */
	public List l_CS_PROC_NAME = null;

	/** �� 20 List�ϐ��F l_WS_CD */
	public List l_WS_CD = null;

	/** �� 21 List�ϐ��F l_WS_NAME */
	public List l_WS_NAME = null;

	/** �� 22 List�ϐ��F l_OUTSIDE_TYP */
	public List l_OUTSIDE_TYP = null;

	/** �� 23 List�ϐ��F l_VEND_CD */
	public List l_VEND_CD = null;

	/** �� 24 List�ϐ��F l_VEND_NAME */
	public List l_VEND_NAME = null;

	/** �� 25 List�ϐ��F l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** �� 26 List�ϐ��F l_ORG_CD */
	public List l_ORG_CD = null;

	/** �� 27 List�ϐ��F l_ORG_NAME */
	public List l_ORG_NAME = null;

	/** �� 28 List�ϐ��F l_STD_COST_OF_MONTH */
	public List l_STD_COST_OF_MONTH = null;

	/** �� 29 List�ϐ��F l_STD_COST_UNIT_TYP */
	public List l_STD_COST_UNIT_TYP = null;

	/** �� 30 List�ϐ��F l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** �� 31 List�ϐ��F l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** �� 32 List�ϐ��F l_l_COUNT */
	public List l_l_COUNT = null;

	/** �� 33 List�ϐ��F l_ROW_COUNT */
	public List l_ROW_COUNT = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getDispDeleteFlg() { return m_DispDeleteFlg; }
	public String getOUTSIDE_TYP_name() { return m_OUTSIDE_TYP_name; }
	public String getOUTSIDE_TYP_val() { return m_OUTSIDE_TYP_val; }
	public String getSTD_COST_UNIT_TYP_name() { return m_STD_COST_UNIT_TYP_name; }
	public String getSTD_COST_UNIT_TYP_val() { return m_STD_COST_UNIT_TYP_val; }
	public String getl_CS_PROC_CD() { return m_l_CS_PROC_CD; }
	public String getl_CS_PROC_NAME() { return m_l_CS_PROC_NAME; }
	public String getl_WS_CD() { return m_l_WS_CD; }
	public String getl_WS_NAME() { return m_l_WS_NAME; }
	public String getl_OUTSIDE_TYP_DN() { return m_l_OUTSIDE_TYP_DN; }
	public String getl_VEND_CD() { return m_l_VEND_CD; }
	public String getl_VEND_ANAME() { return m_l_VEND_ANAME; }
	public String getl_MODIFY_COUNT() { return m_l_MODIFY_COUNT; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getw_CS_PROC_CD() { return m_w_CS_PROC_CD; }
	public String getw_WS_CD() { return m_w_WS_CD; }
	public String getDEL_FLG() { return m_DEL_FLG; }
	public String getCS_PROC_CD() { return m_CS_PROC_CD; }
	public String getCS_PROC_NAME() { return m_CS_PROC_NAME; }
	public String getWS_CD() { return m_WS_CD; }
	public String getWS_NAME() { return m_WS_NAME; }
	public String getOUTSIDE_TYP() { return m_OUTSIDE_TYP; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getVEND_NAME() { return m_VEND_NAME; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getORG_CD() { return m_ORG_CD; }
	public String getORG_NAME() { return m_ORG_NAME; }
	public String getSTD_COST_OF_MONTH() { return m_STD_COST_OF_MONTH; }
	public String getSTD_COST_UNIT_TYP() { return m_STD_COST_UNIT_TYP; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }

	public List getList_DispDeleteFlg() { return l_DispDeleteFlg; }
	public List getList_OUTSIDE_TYP_name() { return l_OUTSIDE_TYP_name; }
	public List getList_OUTSIDE_TYP_val() { return l_OUTSIDE_TYP_val; }
	public List getList_STD_COST_UNIT_TYP_name() { return l_STD_COST_UNIT_TYP_name; }
	public List getList_STD_COST_UNIT_TYP_val() { return l_STD_COST_UNIT_TYP_val; }
	public List getList_l_CS_PROC_CD() { return l_l_CS_PROC_CD; }
	public List getList_l_CS_PROC_NAME() { return l_l_CS_PROC_NAME; }
	public List getList_l_WS_CD() { return l_l_WS_CD; }
	public List getList_l_WS_NAME() { return l_l_WS_NAME; }
	public List getList_l_OUTSIDE_TYP_DN() { return l_l_OUTSIDE_TYP_DN; }
	public List getList_l_VEND_CD() { return l_l_VEND_CD; }
	public List getList_l_VEND_ANAME() { return l_l_VEND_ANAME; }
	public List getList_l_MODIFY_COUNT() { return l_l_MODIFY_COUNT; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_w_CS_PROC_CD() { return l_w_CS_PROC_CD; }
	public List getList_w_WS_CD() { return l_w_WS_CD; }
	public List getList_DEL_FLG() { return l_DEL_FLG; }
	public List getList_CS_PROC_CD() { return l_CS_PROC_CD; }
	public List getList_CS_PROC_NAME() { return l_CS_PROC_NAME; }
	public List getList_WS_CD() { return l_WS_CD; }
	public List getList_WS_NAME() { return l_WS_NAME; }
	public List getList_OUTSIDE_TYP() { return l_OUTSIDE_TYP; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_VEND_NAME() { return l_VEND_NAME; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_ORG_CD() { return l_ORG_CD; }
	public List getList_ORG_NAME() { return l_ORG_NAME; }
	public List getList_STD_COST_OF_MONTH() { return l_STD_COST_OF_MONTH; }
	public List getList_STD_COST_UNIT_TYP() { return l_STD_COST_UNIT_TYP; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }

	public void setDispDeleteFlg(String val) { m_DispDeleteFlg = val; }
	public void setOUTSIDE_TYP_name(String val) { m_OUTSIDE_TYP_name = val; }
	public void setOUTSIDE_TYP_val(String val) { m_OUTSIDE_TYP_val = val; }
	public void setSTD_COST_UNIT_TYP_name(String val) { m_STD_COST_UNIT_TYP_name = val; }
	public void setSTD_COST_UNIT_TYP_val(String val) { m_STD_COST_UNIT_TYP_val = val; }
	public void setl_CS_PROC_CD(String val) { m_l_CS_PROC_CD = val; }
	public void setl_CS_PROC_NAME(String val) { m_l_CS_PROC_NAME = val; }
	public void setl_WS_CD(String val) { m_l_WS_CD = val; }
	public void setl_WS_NAME(String val) { m_l_WS_NAME = val; }
	public void setl_OUTSIDE_TYP_DN(String val) { m_l_OUTSIDE_TYP_DN = val; }
	public void setl_VEND_CD(String val) { m_l_VEND_CD = val; }
	public void setl_VEND_ANAME(String val) { m_l_VEND_ANAME = val; }
	public void setl_MODIFY_COUNT(String val) { m_l_MODIFY_COUNT = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setw_CS_PROC_CD(String val) { m_w_CS_PROC_CD = val; }
	public void setw_WS_CD(String val) { m_w_WS_CD = val; }
	public void setDEL_FLG(String val) { m_DEL_FLG = val; }
	public void setCS_PROC_CD(String val) { m_CS_PROC_CD = val; }
	public void setCS_PROC_NAME(String val) { m_CS_PROC_NAME = val; }
	public void setWS_CD(String val) { m_WS_CD = val; }
	public void setWS_NAME(String val) { m_WS_NAME = val; }
	public void setOUTSIDE_TYP(String val) { m_OUTSIDE_TYP = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void setVEND_NAME(String val) { m_VEND_NAME = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setORG_CD(String val) { m_ORG_CD = val; }
	public void setORG_NAME(String val) { m_ORG_NAME = val; }
	public void setSTD_COST_OF_MONTH(String val) { m_STD_COST_OF_MONTH = val; }
	public void setSTD_COST_UNIT_TYP(String val) { m_STD_COST_UNIT_TYP = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }


	public void setList_DispDeleteFlg(List list) { l_DispDeleteFlg = list; }
	public void setList_OUTSIDE_TYP_name(List list) { l_OUTSIDE_TYP_name = list; }
	public void setList_OUTSIDE_TYP_val(List list) { l_OUTSIDE_TYP_val = list; }
	public void setList_STD_COST_UNIT_TYP_name(List list) { l_STD_COST_UNIT_TYP_name = list; }
	public void setList_STD_COST_UNIT_TYP_val(List list) { l_STD_COST_UNIT_TYP_val = list; }
	public void setList_l_CS_PROC_CD(List list) { l_l_CS_PROC_CD = list; }
	public void setList_l_CS_PROC_NAME(List list) { l_l_CS_PROC_NAME = list; }
	public void setList_l_WS_CD(List list) { l_l_WS_CD = list; }
	public void setList_l_WS_NAME(List list) { l_l_WS_NAME = list; }
	public void setList_l_OUTSIDE_TYP_DN(List list) { l_l_OUTSIDE_TYP_DN = list; }
	public void setList_l_VEND_CD(List list) { l_l_VEND_CD = list; }
	public void setList_l_VEND_ANAME(List list) { l_l_VEND_ANAME = list; }
	public void setList_l_MODIFY_COUNT(List list) { l_l_MODIFY_COUNT = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_w_CS_PROC_CD(List list) { l_w_CS_PROC_CD = list; }
	public void setList_w_WS_CD(List list) { l_w_WS_CD = list; }
	public void setList_DEL_FLG(List list) { l_DEL_FLG = list; }
	public void setList_CS_PROC_CD(List list) { l_CS_PROC_CD = list; }
	public void setList_CS_PROC_NAME(List list) { l_CS_PROC_NAME = list; }
	public void setList_WS_CD(List list) { l_WS_CD = list; }
	public void setList_WS_NAME(List list) { l_WS_NAME = list; }
	public void setList_OUTSIDE_TYP(List list) { l_OUTSIDE_TYP = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_VEND_NAME(List list) { l_VEND_NAME = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_ORG_CD(List list) { l_ORG_CD = list; }
	public void setList_ORG_NAME(List list) { l_ORG_NAME = list; }
	public void setList_STD_COST_OF_MONTH(List list) { l_STD_COST_OF_MONTH = list; }
	public void setList_STD_COST_UNIT_TYP(List list) { l_STD_COST_UNIT_TYP = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }

	public int setL2L_DispDeleteFlg(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DispDeleteFlg == null) {
			l_DispDeleteFlg = new ArrayList();
		} else {
			l_DispDeleteFlg.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DispDeleteFlg.add(((DA0010010Struct) list.get(i)).getDispDeleteFlg());
		}
		return size;
	}
	public int setL2L_OUTSIDE_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OUTSIDE_TYP_name == null) {
			l_OUTSIDE_TYP_name = new ArrayList();
		} else {
			l_OUTSIDE_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OUTSIDE_TYP_name.add(((DA0010010Struct) list.get(i)).getOUTSIDE_TYP_name());
		}
		return size;
	}
	public int setL2L_OUTSIDE_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OUTSIDE_TYP_val == null) {
			l_OUTSIDE_TYP_val = new ArrayList();
		} else {
			l_OUTSIDE_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OUTSIDE_TYP_val.add(((DA0010010Struct) list.get(i)).getOUTSIDE_TYP_val());
		}
		return size;
	}
	public int setL2L_STD_COST_UNIT_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STD_COST_UNIT_TYP_name == null) {
			l_STD_COST_UNIT_TYP_name = new ArrayList();
		} else {
			l_STD_COST_UNIT_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STD_COST_UNIT_TYP_name.add(((DA0010010Struct) list.get(i)).getSTD_COST_UNIT_TYP_name());
		}
		return size;
	}
	public int setL2L_STD_COST_UNIT_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STD_COST_UNIT_TYP_val == null) {
			l_STD_COST_UNIT_TYP_val = new ArrayList();
		} else {
			l_STD_COST_UNIT_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STD_COST_UNIT_TYP_val.add(((DA0010010Struct) list.get(i)).getSTD_COST_UNIT_TYP_val());
		}
		return size;
	}
	public int setL2L_l_CS_PROC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_CS_PROC_CD == null) {
			l_l_CS_PROC_CD = new ArrayList();
		} else {
			l_l_CS_PROC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_CS_PROC_CD.add(((DA0010010Struct) list.get(i)).getl_CS_PROC_CD());
		}
		return size;
	}
	public int setL2L_l_CS_PROC_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_CS_PROC_NAME == null) {
			l_l_CS_PROC_NAME = new ArrayList();
		} else {
			l_l_CS_PROC_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_CS_PROC_NAME.add(((DA0010010Struct) list.get(i)).getl_CS_PROC_NAME());
		}
		return size;
	}
	public int setL2L_l_WS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_WS_CD == null) {
			l_l_WS_CD = new ArrayList();
		} else {
			l_l_WS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_WS_CD.add(((DA0010010Struct) list.get(i)).getl_WS_CD());
		}
		return size;
	}
	public int setL2L_l_WS_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_WS_NAME == null) {
			l_l_WS_NAME = new ArrayList();
		} else {
			l_l_WS_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_WS_NAME.add(((DA0010010Struct) list.get(i)).getl_WS_NAME());
		}
		return size;
	}
	public int setL2L_l_OUTSIDE_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_OUTSIDE_TYP_DN == null) {
			l_l_OUTSIDE_TYP_DN = new ArrayList();
		} else {
			l_l_OUTSIDE_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_OUTSIDE_TYP_DN.add(((DA0010010Struct) list.get(i)).getl_OUTSIDE_TYP_DN());
		}
		return size;
	}
	public int setL2L_l_VEND_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_VEND_CD == null) {
			l_l_VEND_CD = new ArrayList();
		} else {
			l_l_VEND_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_VEND_CD.add(((DA0010010Struct) list.get(i)).getl_VEND_CD());
		}
		return size;
	}
	public int setL2L_l_VEND_ANAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_VEND_ANAME == null) {
			l_l_VEND_ANAME = new ArrayList();
		} else {
			l_l_VEND_ANAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_VEND_ANAME.add(((DA0010010Struct) list.get(i)).getl_VEND_ANAME());
		}
		return size;
	}
	public int setL2L_l_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_MODIFY_COUNT == null) {
			l_l_MODIFY_COUNT = new ArrayList();
		} else {
			l_l_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_MODIFY_COUNT.add(((DA0010010Struct) list.get(i)).getl_MODIFY_COUNT());
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
			l_PLANT_CD.add(((DA0010010Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_w_CS_PROC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_CS_PROC_CD == null) {
			l_w_CS_PROC_CD = new ArrayList();
		} else {
			l_w_CS_PROC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_CS_PROC_CD.add(((DA0010010Struct) list.get(i)).getw_CS_PROC_CD());
		}
		return size;
	}
	public int setL2L_w_WS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_WS_CD == null) {
			l_w_WS_CD = new ArrayList();
		} else {
			l_w_WS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_WS_CD.add(((DA0010010Struct) list.get(i)).getw_WS_CD());
		}
		return size;
	}
	public int setL2L_DEL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEL_FLG == null) {
			l_DEL_FLG = new ArrayList();
		} else {
			l_DEL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEL_FLG.add(((DA0010010Struct) list.get(i)).getDEL_FLG());
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
			l_CS_PROC_CD.add(((DA0010010Struct) list.get(i)).getCS_PROC_CD());
		}
		return size;
	}
	public int setL2L_CS_PROC_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CS_PROC_NAME == null) {
			l_CS_PROC_NAME = new ArrayList();
		} else {
			l_CS_PROC_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CS_PROC_NAME.add(((DA0010010Struct) list.get(i)).getCS_PROC_NAME());
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
			l_WS_CD.add(((DA0010010Struct) list.get(i)).getWS_CD());
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
			l_WS_NAME.add(((DA0010010Struct) list.get(i)).getWS_NAME());
		}
		return size;
	}
	public int setL2L_OUTSIDE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OUTSIDE_TYP == null) {
			l_OUTSIDE_TYP = new ArrayList();
		} else {
			l_OUTSIDE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OUTSIDE_TYP.add(((DA0010010Struct) list.get(i)).getOUTSIDE_TYP());
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
			l_VEND_CD.add(((DA0010010Struct) list.get(i)).getVEND_CD());
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
			l_VEND_NAME.add(((DA0010010Struct) list.get(i)).getVEND_NAME());
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
			l_COMPANY_CD.add(((DA0010010Struct) list.get(i)).getCOMPANY_CD());
		}
		return size;
	}
	public int setL2L_ORG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ORG_CD == null) {
			l_ORG_CD = new ArrayList();
		} else {
			l_ORG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ORG_CD.add(((DA0010010Struct) list.get(i)).getORG_CD());
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
			l_ORG_NAME.add(((DA0010010Struct) list.get(i)).getORG_NAME());
		}
		return size;
	}
	public int setL2L_STD_COST_OF_MONTH(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STD_COST_OF_MONTH == null) {
			l_STD_COST_OF_MONTH = new ArrayList();
		} else {
			l_STD_COST_OF_MONTH.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STD_COST_OF_MONTH.add(((DA0010010Struct) list.get(i)).getSTD_COST_OF_MONTH());
		}
		return size;
	}
	public int setL2L_STD_COST_UNIT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STD_COST_UNIT_TYP == null) {
			l_STD_COST_UNIT_TYP = new ArrayList();
		} else {
			l_STD_COST_UNIT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STD_COST_UNIT_TYP.add(((DA0010010Struct) list.get(i)).getSTD_COST_UNIT_TYP());
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
			l_MODIFY_COUNT.add(((DA0010010Struct) list.get(i)).getMODIFY_COUNT());
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
			l_PLANT_NAME.add(((DA0010010Struct) list.get(i)).getPLANT_NAME());
		}
		return size;
	}
	public int setL2L_l_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_COUNT == null) {
			l_l_COUNT = new ArrayList();
		} else {
			l_l_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_COUNT.add(((DA0010010Struct) list.get(i)).getl_COUNT());
		}
		return size;
	}
	public int setL2L_ROW_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ROW_COUNT == null) {
			l_ROW_COUNT = new ArrayList();
		} else {
			l_ROW_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ROW_COUNT.add(((DA0010010Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_DispDeleteFlg = null;
		m_OUTSIDE_TYP_name = null;
		m_OUTSIDE_TYP_val = null;
		m_STD_COST_UNIT_TYP_name = null;
		m_STD_COST_UNIT_TYP_val = null;
		m_l_CS_PROC_CD = null;
		m_l_CS_PROC_NAME = null;
		m_l_WS_CD = null;
		m_l_WS_NAME = null;
		m_l_OUTSIDE_TYP_DN = null;
		m_l_VEND_CD = null;
		m_l_VEND_ANAME = null;
		m_l_MODIFY_COUNT = null;
		m_PLANT_CD = null;
		m_w_CS_PROC_CD = null;
		m_w_WS_CD = null;
		m_DEL_FLG = null;
		m_CS_PROC_CD = null;
		m_CS_PROC_NAME = null;
		m_WS_CD = null;
		m_WS_NAME = null;
		m_OUTSIDE_TYP = null;
		m_VEND_CD = null;
		m_VEND_NAME = null;
		m_COMPANY_CD = null;
		m_ORG_CD = null;
		m_ORG_NAME = null;
		m_STD_COST_OF_MONTH = null;
		m_STD_COST_UNIT_TYP = null;
		m_MODIFY_COUNT = null;
		m_PLANT_NAME = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;

		l_DispDeleteFlg = null;
		l_OUTSIDE_TYP_name = null;
		l_OUTSIDE_TYP_val = null;
		l_STD_COST_UNIT_TYP_name = null;
		l_STD_COST_UNIT_TYP_val = null;
		l_l_CS_PROC_CD = null;
		l_l_CS_PROC_NAME = null;
		l_l_WS_CD = null;
		l_l_WS_NAME = null;
		l_l_OUTSIDE_TYP_DN = null;
		l_l_VEND_CD = null;
		l_l_VEND_ANAME = null;
		l_l_MODIFY_COUNT = null;
		l_PLANT_CD = null;
		l_w_CS_PROC_CD = null;
		l_w_WS_CD = null;
		l_DEL_FLG = null;
		l_CS_PROC_CD = null;
		l_CS_PROC_NAME = null;
		l_WS_CD = null;
		l_WS_NAME = null;
		l_OUTSIDE_TYP = null;
		l_VEND_CD = null;
		l_VEND_NAME = null;
		l_COMPANY_CD = null;
		l_ORG_CD = null;
		l_ORG_NAME = null;
		l_STD_COST_OF_MONTH = null;
		l_STD_COST_UNIT_TYP = null;
		l_MODIFY_COUNT = null;
		l_PLANT_NAME = null;
		l_l_COUNT = null;
		l_ROW_COUNT = null;

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
	 * medDA0010010�N���X�̕W���R���X�g���N�^
	 */
	public DA0010010Struct()
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
	public void setStruct(DA0010010Struct struct)
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
	public void setStructM(DA0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setDispDeleteFlg(struct.getDispDeleteFlg());
			this.setOUTSIDE_TYP_name(struct.getOUTSIDE_TYP_name());
			this.setOUTSIDE_TYP_val(struct.getOUTSIDE_TYP_val());
			this.setSTD_COST_UNIT_TYP_name(struct.getSTD_COST_UNIT_TYP_name());
			this.setSTD_COST_UNIT_TYP_val(struct.getSTD_COST_UNIT_TYP_val());
			this.setl_CS_PROC_CD(struct.getl_CS_PROC_CD());
			this.setl_CS_PROC_NAME(struct.getl_CS_PROC_NAME());
			this.setl_WS_CD(struct.getl_WS_CD());
			this.setl_WS_NAME(struct.getl_WS_NAME());
			this.setl_OUTSIDE_TYP_DN(struct.getl_OUTSIDE_TYP_DN());
			this.setl_VEND_CD(struct.getl_VEND_CD());
			this.setl_VEND_ANAME(struct.getl_VEND_ANAME());
			this.setl_MODIFY_COUNT(struct.getl_MODIFY_COUNT());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setw_CS_PROC_CD(struct.getw_CS_PROC_CD());
			this.setw_WS_CD(struct.getw_WS_CD());
			this.setDEL_FLG(struct.getDEL_FLG());
			this.setCS_PROC_CD(struct.getCS_PROC_CD());
			this.setCS_PROC_NAME(struct.getCS_PROC_NAME());
			this.setWS_CD(struct.getWS_CD());
			this.setWS_NAME(struct.getWS_NAME());
			this.setOUTSIDE_TYP(struct.getOUTSIDE_TYP());
			this.setVEND_CD(struct.getVEND_CD());
			this.setVEND_NAME(struct.getVEND_NAME());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setORG_CD(struct.getORG_CD());
			this.setORG_NAME(struct.getORG_NAME());
			this.setSTD_COST_OF_MONTH(struct.getSTD_COST_OF_MONTH());
			this.setSTD_COST_UNIT_TYP(struct.getSTD_COST_UNIT_TYP());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.setl_COUNT(struct.getl_COUNT());
			this.setROW_COUNT(struct.getROW_COUNT());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(DA0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_DispDeleteFlg(struct.getList_DispDeleteFlg());
			this.setList_OUTSIDE_TYP_name(struct.getList_OUTSIDE_TYP_name());
			this.setList_OUTSIDE_TYP_val(struct.getList_OUTSIDE_TYP_val());
			this.setList_STD_COST_UNIT_TYP_name(struct.getList_STD_COST_UNIT_TYP_name());
			this.setList_STD_COST_UNIT_TYP_val(struct.getList_STD_COST_UNIT_TYP_val());
			this.setList_l_CS_PROC_CD(struct.getList_l_CS_PROC_CD());
			this.setList_l_CS_PROC_NAME(struct.getList_l_CS_PROC_NAME());
			this.setList_l_WS_CD(struct.getList_l_WS_CD());
			this.setList_l_WS_NAME(struct.getList_l_WS_NAME());
			this.setList_l_OUTSIDE_TYP_DN(struct.getList_l_OUTSIDE_TYP_DN());
			this.setList_l_VEND_CD(struct.getList_l_VEND_CD());
			this.setList_l_VEND_ANAME(struct.getList_l_VEND_ANAME());
			this.setList_l_MODIFY_COUNT(struct.getList_l_MODIFY_COUNT());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_w_CS_PROC_CD(struct.getList_w_CS_PROC_CD());
			this.setList_w_WS_CD(struct.getList_w_WS_CD());
			this.setList_DEL_FLG(struct.getList_DEL_FLG());
			this.setList_CS_PROC_CD(struct.getList_CS_PROC_CD());
			this.setList_CS_PROC_NAME(struct.getList_CS_PROC_NAME());
			this.setList_WS_CD(struct.getList_WS_CD());
			this.setList_WS_NAME(struct.getList_WS_NAME());
			this.setList_OUTSIDE_TYP(struct.getList_OUTSIDE_TYP());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_VEND_NAME(struct.getList_VEND_NAME());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_ORG_CD(struct.getList_ORG_CD());
			this.setList_ORG_NAME(struct.getList_ORG_NAME());
			this.setList_STD_COST_OF_MONTH(struct.getList_STD_COST_OF_MONTH());
			this.setList_STD_COST_UNIT_TYP(struct.getList_STD_COST_UNIT_TYP());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_l_COUNT(struct.getList_l_COUNT());
			this.setList_ROW_COUNT(struct.getList_ROW_COUNT());
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
	// �� 1 �ϐ������l�F i_DispDeleteFlg


	final static String i_DispDeleteFlg = null;

	// �� 2 �ϐ������l�F i_OUTSIDE_TYP_name


	final static String i_OUTSIDE_TYP_name = null;

	// �� 3 �ϐ������l�F i_OUTSIDE_TYP_val


	final static String i_OUTSIDE_TYP_val = null;

	// �� 4 �ϐ������l�F i_STD_COST_UNIT_TYP_name


	final static String i_STD_COST_UNIT_TYP_name = null;

	// �� 5 �ϐ������l�F i_STD_COST_UNIT_TYP_val


	final static String i_STD_COST_UNIT_TYP_val = null;

	// �� 6 �ϐ������l�F i_l_CS_PROC_CD


	final static String i_l_CS_PROC_CD = null;

	// �� 7 �ϐ������l�F i_l_CS_PROC_NAME


	final static String i_l_CS_PROC_NAME = null;

	// �� 8 �ϐ������l�F i_l_WS_CD


	final static String i_l_WS_CD = null;

	// �� 9 �ϐ������l�F i_l_WS_NAME


	final static String i_l_WS_NAME = null;

	// �� 10 �ϐ������l�F i_l_OUTSIDE_TYP_DN


	final static String i_l_OUTSIDE_TYP_DN = null;

	// �� 11 �ϐ������l�F i_l_VEND_CD


	final static String i_l_VEND_CD = null;

	// �� 12 �ϐ������l�F i_l_VEND_ANAME


	final static String i_l_VEND_ANAME = null;

	// �� 13 �ϐ������l�F i_l_MODIFY_COUNT


	final static String i_l_MODIFY_COUNT = null;

	// �� 14 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 15 �ϐ������l�F i_w_CS_PROC_CD


	final static String i_w_CS_PROC_CD = null;

	// �� 16 �ϐ������l�F i_w_WS_CD


	final static String i_w_WS_CD = null;

	// �� 17 �ϐ������l�F i_DEL_FLG


	final static String i_DEL_FLG = null;

	// �� 18 �ϐ������l�F i_CS_PROC_CD


	final static String i_CS_PROC_CD = null;

	// �� 19 �ϐ������l�F i_CS_PROC_NAME


	final static String i_CS_PROC_NAME = null;

	// �� 20 �ϐ������l�F i_WS_CD


	final static String i_WS_CD = null;

	// �� 21 �ϐ������l�F i_WS_NAME


	final static String i_WS_NAME = null;

	// �� 22 �ϐ������l�F i_OUTSIDE_TYP


	final static String i_OUTSIDE_TYP = null;

	// �� 23 �ϐ������l�F i_VEND_CD


	final static String i_VEND_CD = null;

	// �� 24 �ϐ������l�F i_VEND_NAME


	final static String i_VEND_NAME = null;

	// �� 25 �ϐ������l�F i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// �� 26 �ϐ������l�F i_ORG_CD


	final static String i_ORG_CD = null;

	// �� 27 �ϐ������l�F i_ORG_NAME


	final static String i_ORG_NAME = null;

	// �� 28 �ϐ������l�F i_STD_COST_OF_MONTH


	final static String i_STD_COST_OF_MONTH = null;

	// �� 29 �ϐ������l�F i_STD_COST_UNIT_TYP


	final static String i_STD_COST_UNIT_TYP = null;

	// �� 30 �ϐ������l�F i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// �� 31 �ϐ������l�F i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// �� 32 �ϐ������l�F i_l_COUNT


	final static String i_l_COUNT = null;

	// �� 33 �ϐ������l�F i_ROW_COUNT


	final static String i_ROW_COUNT = null;

*/

	//{{user_implement_code
         // TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
         // �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
        // �� 1 �ϐ������l�F i_l_CS_PROC_CD
        final static String i_l_CS_PROC_CD = null;
        // �� 2 �ϐ������l�F i_l_CS_PROC_NAME
        final static String i_l_CS_PROC_NAME = null;
        // �� 3 �ϐ������l�F i_l_WS_CD
        final static String i_l_WS_CD = null;
        // �� 4 �ϐ������l�F i_l_WS_NAME
        final static String i_l_WS_NAME = null;
        // �� 5 �ϐ������l�F i_l_OUTSIDE_TYP_DN
        final static String i_l_OUTSIDE_TYP_DN = null;
        // �� 6 �ϐ������l�F i_l_VEND_CD
        final static String i_l_VEND_CD = null;
        // �� 7 �ϐ������l�F i_l_VEND_ANAME
        final static String i_l_VEND_ANAME = null;
        // �� 8 �ϐ������l�F i_l_MODIFY_COUNT
        final static String i_l_MODIFY_COUNT = null;
        // �� 9 �ϐ������l�F i_PLANT_CD
        final static String i_PLANT_CD = null;
        // �� 10 �ϐ������l�F i_w_CS_PROC_CD
        final static String i_w_CS_PROC_CD = null;
        // �� 11 �ϐ������l�F i_w_WS_CD
        final static String i_w_WS_CD = null;
        // �� 12 �ϐ������l�F i_DEL_FLG
        final static String i_DEL_FLG = null;
        // �� 13 �ϐ������l�F i_CS_PROC_CD
        final static String i_CS_PROC_CD = null;
        // �� 14 �ϐ������l�F i_CS_PROC_NAME
        final static String i_CS_PROC_NAME = null;
        // �� 15 �ϐ������l�F i_WS_CD
        final static String i_WS_CD = null;
        // �� 16 �ϐ������l�F i_WS_NAME
        final static String i_WS_NAME = null;
        // �� 17 �ϐ������l�F i_OUTSIDE_TYP
        final static String i_OUTSIDE_TYP = null;
        // �� 18 �ϐ������l�F i_VEND_CD
        final static String i_VEND_CD = null;
        // �� 19 �ϐ������l�F i_VEND_NAME
        final static String i_VEND_NAME = null;
        // �� 20 �ϐ������l�F i_ORG_CD
        final static String i_ORG_CD = null;
        // �� 21 �ϐ������l�F i_ORG_NAME
        final static String i_ORG_NAME = null;
        // �� 22 �ϐ������l�F i_STD_COST_OF_MONTH
        final static String i_STD_COST_OF_MONTH = null;
        // �� 23 �ϐ������l�F i_STD_COST_UNIT_TYP
        final static String i_STD_COST_UNIT_TYP = null;
        // �� 24 �ϐ������l�F i_MODIFY_COUNT
        final static String i_MODIFY_COUNT = null;
        // �� 25 �ϐ������l�F i_PLANT_NAME
        final static String i_PLANT_NAME = null;
        // �� 26 �ϐ������l�F i_COMPANY_CD
        final static String i_COMPANY_CD = null;
        // �� 27 �ϐ������l�F i_DispDeleteFlg
        final static String i_DispDeleteFlg = null;
        // �� 28 �ϐ������l�F i_OUTSIDE_TYP_name
        final static String i_OUTSIDE_TYP_name = null;
        // �� 29 �ϐ������l�F i_OUTSIDE_TYP_val
        final static String i_OUTSIDE_TYP_val = null;
        // �� 30 �ϐ������l�F i_STD_COST_UNIT_TYP_name
        final static String i_STD_COST_UNIT_TYP_name = null;
        // �� 31 �ϐ������l�F i_STD_COST_UNIT_TYP_val
        final static String i_STD_COST_UNIT_TYP_val = null;
       
        /**
         * ������
         *
         */
        public void initialize()
        {
       
         clear();
       
         m_l_CS_PROC_CD = i_l_CS_PROC_CD;
         m_l_CS_PROC_NAME = i_l_CS_PROC_NAME;
         m_l_WS_CD = i_l_WS_CD;
         m_l_WS_NAME = i_l_WS_NAME;
         m_l_OUTSIDE_TYP_DN = i_l_OUTSIDE_TYP_DN;
         m_l_VEND_CD = i_l_VEND_CD;
         m_l_VEND_ANAME = i_l_VEND_ANAME;
         m_l_MODIFY_COUNT = i_l_MODIFY_COUNT;
         m_PLANT_CD = i_PLANT_CD;
         m_w_CS_PROC_CD = i_w_CS_PROC_CD;
         m_w_WS_CD = i_w_WS_CD;
         m_DEL_FLG = i_DEL_FLG;
         m_CS_PROC_CD = i_CS_PROC_CD;
         m_CS_PROC_NAME = i_CS_PROC_NAME;
         m_WS_CD = i_WS_CD;
         m_WS_NAME = i_WS_NAME;
         m_OUTSIDE_TYP = i_OUTSIDE_TYP;
         m_VEND_CD = i_VEND_CD;
         m_VEND_NAME = i_VEND_NAME;
         m_ORG_CD = i_ORG_CD;
         m_ORG_NAME = i_ORG_NAME;
         m_STD_COST_OF_MONTH = i_STD_COST_OF_MONTH;
         m_STD_COST_UNIT_TYP = i_STD_COST_UNIT_TYP;
         m_MODIFY_COUNT = i_MODIFY_COUNT;
         m_PLANT_NAME = i_PLANT_NAME;
         m_COMPANY_CD = i_COMPANY_CD;
         m_DispDeleteFlg = i_DispDeleteFlg;
         m_OUTSIDE_TYP_name = i_OUTSIDE_TYP_name;
         m_OUTSIDE_TYP_val = i_OUTSIDE_TYP_val;
         m_STD_COST_UNIT_TYP_name = i_STD_COST_UNIT_TYP_name;
         m_STD_COST_UNIT_TYP_val = i_STD_COST_UNIT_TYP_val;
        }
       
         // TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
