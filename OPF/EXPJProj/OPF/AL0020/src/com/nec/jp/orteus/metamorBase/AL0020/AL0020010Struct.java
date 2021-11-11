/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AL0020/src/com/nec/jp/orteus/metamorBase/AL0020/AL0020010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AL0020;

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

public class AL0020010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_LOAD_ASSIGN_TYP_name */
	public String m_LOAD_ASSIGN_TYP_name = null;
	/** �� 2 �ϐ��F m_LOAD_ASSIGN_TYP_val */
	public String m_LOAD_ASSIGN_TYP_val = null;
	/** �� 3 �ϐ��F m_h_ITEM_CD */
	public String m_h_ITEM_CD = null;
	/** �� 4 �ϐ��F m_h_NECK_PROC_CD */
	public String m_h_NECK_PROC_CD = null;
	/** �� 5 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 6 �ϐ��F m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** �� 7 �ϐ��F m_NECK_PROC_CD */
	public String m_NECK_PROC_CD = null;
	/** �� 8 �ϐ��F m_PROC_START_IDLE_DATE */
	public String m_PROC_START_IDLE_DATE = null;
	/** �� 9 �ϐ��F m_UNIT_LOAD */
	public String m_UNIT_LOAD = null;
	/** �� 10 �ϐ��F m_NECK_PROC_LT */
	public String m_NECK_PROC_LT = null;
	/** �� 11 �ϐ��F m_LOAD_ASSIGN_TYP */
	public String m_LOAD_ASSIGN_TYP = null;
	/** �� 12 �ϐ��F m_NECK_PROC_NAME */
	public String m_NECK_PROC_NAME = null;
	/** �� 13 �ϐ��F m_det_NECK_PROC_CAPA */
	public String m_det_NECK_PROC_CAPA = null;
	/** �� 14 �ϐ��F m_det_NECK_PROC_CAPA_UNIT */
	public String m_det_NECK_PROC_CAPA_UNIT = null;
	/** �� 15 �ϐ��F m_det_MRP_ODR_TYP */
	public String m_det_MRP_ODR_TYP = null;
	/** �� 16 �ϐ��F m_det_OUTSIDE_TYP */
	public String m_det_OUTSIDE_TYP = null;
	/** �� 17 �ϐ��F m_det_ODR_LT */
	public String m_det_ODR_LT = null;
	/** �� 18 �ϐ��F m_det_FIXED_LT */
	public String m_det_FIXED_LT = null;
	/** �� 19 �ϐ��F m_det_SAFETY_LT */
	public String m_det_SAFETY_LT = null;
	/** �� 20 �ϐ��F m_det_ISSUE_LT */
	public String m_det_ISSUE_LT = null;
	/** �� 21 �ϐ��F m_PROC_CD */
	public String m_PROC_CD = null;
	/** �� 22 �ϐ��F m_PROC_NAME */
	public String m_PROC_NAME = null;
	/** �� 23 �ϐ��F m_WS_CD */
	public String m_WS_CD = null;
	/** �� 24 �ϐ��F m_OUTSIDE_TYP */
	public String m_OUTSIDE_TYP = null;
	/** �� 25 �ϐ��F m_FIXED_LT */
	public String m_FIXED_LT = null;
	/** �� 26 �ϐ��F m_SAFETY_LT */
	public String m_SAFETY_LT = null;
	/** �� 27 �ϐ��F m_h_MODIFY_COUNT */
	public String m_h_MODIFY_COUNT = null;
	/** �� 28 �ϐ��F m_h_PLANT_CD */
	public String m_h_PLANT_CD = null;
	/** �� 29 �ϐ��F m_CNT */
	public String m_CNT = null;
	/** �� 30 �ϐ��F m_CNT_ITEM_CD */
	public String m_CNT_ITEM_CD = null;
	/** �� 31 �ϐ��F m_CNT_NECK_PROC_CD */
	public String m_CNT_NECK_PROC_CD = null;
	/** �� 32 �ϐ��F m_check_T_LOAD_CD */
	public String m_check_T_LOAD_CD = null;
	/** �� 33 �ϐ��F m_check_SIM_LOAD_CD */
	public String m_check_SIM_LOAD_CD = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_LOAD_ASSIGN_TYP_name */
	public List l_LOAD_ASSIGN_TYP_name = null;

	/** �� 2 List�ϐ��F l_LOAD_ASSIGN_TYP_val */
	public List l_LOAD_ASSIGN_TYP_val = null;

	/** �� 3 List�ϐ��F l_h_ITEM_CD */
	public List l_h_ITEM_CD = null;

	/** �� 4 List�ϐ��F l_h_NECK_PROC_CD */
	public List l_h_NECK_PROC_CD = null;

	/** �� 5 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 6 List�ϐ��F l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** �� 7 List�ϐ��F l_NECK_PROC_CD */
	public List l_NECK_PROC_CD = null;

	/** �� 8 List�ϐ��F l_PROC_START_IDLE_DATE */
	public List l_PROC_START_IDLE_DATE = null;

	/** �� 9 List�ϐ��F l_UNIT_LOAD */
	public List l_UNIT_LOAD = null;

	/** �� 10 List�ϐ��F l_NECK_PROC_LT */
	public List l_NECK_PROC_LT = null;

	/** �� 11 List�ϐ��F l_LOAD_ASSIGN_TYP */
	public List l_LOAD_ASSIGN_TYP = null;

	/** �� 12 List�ϐ��F l_NECK_PROC_NAME */
	public List l_NECK_PROC_NAME = null;

	/** �� 13 List�ϐ��F l_det_NECK_PROC_CAPA */
	public List l_det_NECK_PROC_CAPA = null;

	/** �� 14 List�ϐ��F l_det_NECK_PROC_CAPA_UNIT */
	public List l_det_NECK_PROC_CAPA_UNIT = null;

	/** �� 15 List�ϐ��F l_det_MRP_ODR_TYP */
	public List l_det_MRP_ODR_TYP = null;

	/** �� 16 List�ϐ��F l_det_OUTSIDE_TYP */
	public List l_det_OUTSIDE_TYP = null;

	/** �� 17 List�ϐ��F l_det_ODR_LT */
	public List l_det_ODR_LT = null;

	/** �� 18 List�ϐ��F l_det_FIXED_LT */
	public List l_det_FIXED_LT = null;

	/** �� 19 List�ϐ��F l_det_SAFETY_LT */
	public List l_det_SAFETY_LT = null;

	/** �� 20 List�ϐ��F l_det_ISSUE_LT */
	public List l_det_ISSUE_LT = null;

	/** �� 21 List�ϐ��F l_PROC_CD */
	public List l_PROC_CD = null;

	/** �� 22 List�ϐ��F l_PROC_NAME */
	public List l_PROC_NAME = null;

	/** �� 23 List�ϐ��F l_WS_CD */
	public List l_WS_CD = null;

	/** �� 24 List�ϐ��F l_OUTSIDE_TYP */
	public List l_OUTSIDE_TYP = null;

	/** �� 25 List�ϐ��F l_FIXED_LT */
	public List l_FIXED_LT = null;

	/** �� 26 List�ϐ��F l_SAFETY_LT */
	public List l_SAFETY_LT = null;

	/** �� 27 List�ϐ��F l_h_MODIFY_COUNT */
	public List l_h_MODIFY_COUNT = null;

	/** �� 28 List�ϐ��F l_h_PLANT_CD */
	public List l_h_PLANT_CD = null;

	/** �� 29 List�ϐ��F l_CNT */
	public List l_CNT = null;

	/** �� 30 List�ϐ��F l_CNT_ITEM_CD */
	public List l_CNT_ITEM_CD = null;

	/** �� 31 List�ϐ��F l_CNT_NECK_PROC_CD */
	public List l_CNT_NECK_PROC_CD = null;

	/** �� 32 List�ϐ��F l_check_T_LOAD_CD */
	public List l_check_T_LOAD_CD = null;

	/** �� 33 List�ϐ��F l_check_SIM_LOAD_CD */
	public List l_check_SIM_LOAD_CD = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getLOAD_ASSIGN_TYP_name() { return m_LOAD_ASSIGN_TYP_name; }
	public String getLOAD_ASSIGN_TYP_val() { return m_LOAD_ASSIGN_TYP_val; }
	public String geth_ITEM_CD() { return m_h_ITEM_CD; }
	public String geth_NECK_PROC_CD() { return m_h_NECK_PROC_CD; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getNECK_PROC_CD() { return m_NECK_PROC_CD; }
	public String getPROC_START_IDLE_DATE() { return m_PROC_START_IDLE_DATE; }
	public String getUNIT_LOAD() { return m_UNIT_LOAD; }
	public String getNECK_PROC_LT() { return m_NECK_PROC_LT; }
	public String getLOAD_ASSIGN_TYP() { return m_LOAD_ASSIGN_TYP; }
	public String getNECK_PROC_NAME() { return m_NECK_PROC_NAME; }
	public String getdet_NECK_PROC_CAPA() { return m_det_NECK_PROC_CAPA; }
	public String getdet_NECK_PROC_CAPA_UNIT() { return m_det_NECK_PROC_CAPA_UNIT; }
	public String getdet_MRP_ODR_TYP() { return m_det_MRP_ODR_TYP; }
	public String getdet_OUTSIDE_TYP() { return m_det_OUTSIDE_TYP; }
	public String getdet_ODR_LT() { return m_det_ODR_LT; }
	public String getdet_FIXED_LT() { return m_det_FIXED_LT; }
	public String getdet_SAFETY_LT() { return m_det_SAFETY_LT; }
	public String getdet_ISSUE_LT() { return m_det_ISSUE_LT; }
	public String getPROC_CD() { return m_PROC_CD; }
	public String getPROC_NAME() { return m_PROC_NAME; }
	public String getWS_CD() { return m_WS_CD; }
	public String getOUTSIDE_TYP() { return m_OUTSIDE_TYP; }
	public String getFIXED_LT() { return m_FIXED_LT; }
	public String getSAFETY_LT() { return m_SAFETY_LT; }
	public String geth_MODIFY_COUNT() { return m_h_MODIFY_COUNT; }
	public String geth_PLANT_CD() { return m_h_PLANT_CD; }
	public String getCNT() { return m_CNT; }
	public String getCNT_ITEM_CD() { return m_CNT_ITEM_CD; }
	public String getCNT_NECK_PROC_CD() { return m_CNT_NECK_PROC_CD; }
	public String getcheck_T_LOAD_CD() { return m_check_T_LOAD_CD; }
	public String getcheck_SIM_LOAD_CD() { return m_check_SIM_LOAD_CD; }

	public List getList_LOAD_ASSIGN_TYP_name() { return l_LOAD_ASSIGN_TYP_name; }
	public List getList_LOAD_ASSIGN_TYP_val() { return l_LOAD_ASSIGN_TYP_val; }
	public List getList_h_ITEM_CD() { return l_h_ITEM_CD; }
	public List getList_h_NECK_PROC_CD() { return l_h_NECK_PROC_CD; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_NECK_PROC_CD() { return l_NECK_PROC_CD; }
	public List getList_PROC_START_IDLE_DATE() { return l_PROC_START_IDLE_DATE; }
	public List getList_UNIT_LOAD() { return l_UNIT_LOAD; }
	public List getList_NECK_PROC_LT() { return l_NECK_PROC_LT; }
	public List getList_LOAD_ASSIGN_TYP() { return l_LOAD_ASSIGN_TYP; }
	public List getList_NECK_PROC_NAME() { return l_NECK_PROC_NAME; }
	public List getList_det_NECK_PROC_CAPA() { return l_det_NECK_PROC_CAPA; }
	public List getList_det_NECK_PROC_CAPA_UNIT() { return l_det_NECK_PROC_CAPA_UNIT; }
	public List getList_det_MRP_ODR_TYP() { return l_det_MRP_ODR_TYP; }
	public List getList_det_OUTSIDE_TYP() { return l_det_OUTSIDE_TYP; }
	public List getList_det_ODR_LT() { return l_det_ODR_LT; }
	public List getList_det_FIXED_LT() { return l_det_FIXED_LT; }
	public List getList_det_SAFETY_LT() { return l_det_SAFETY_LT; }
	public List getList_det_ISSUE_LT() { return l_det_ISSUE_LT; }
	public List getList_PROC_CD() { return l_PROC_CD; }
	public List getList_PROC_NAME() { return l_PROC_NAME; }
	public List getList_WS_CD() { return l_WS_CD; }
	public List getList_OUTSIDE_TYP() { return l_OUTSIDE_TYP; }
	public List getList_FIXED_LT() { return l_FIXED_LT; }
	public List getList_SAFETY_LT() { return l_SAFETY_LT; }
	public List getList_h_MODIFY_COUNT() { return l_h_MODIFY_COUNT; }
	public List getList_h_PLANT_CD() { return l_h_PLANT_CD; }
	public List getList_CNT() { return l_CNT; }
	public List getList_CNT_ITEM_CD() { return l_CNT_ITEM_CD; }
	public List getList_CNT_NECK_PROC_CD() { return l_CNT_NECK_PROC_CD; }
	public List getList_check_T_LOAD_CD() { return l_check_T_LOAD_CD; }
	public List getList_check_SIM_LOAD_CD() { return l_check_SIM_LOAD_CD; }

	public void setLOAD_ASSIGN_TYP_name(String val) { m_LOAD_ASSIGN_TYP_name = val; }
	public void setLOAD_ASSIGN_TYP_val(String val) { m_LOAD_ASSIGN_TYP_val = val; }
	public void seth_ITEM_CD(String val) { m_h_ITEM_CD = val; }
	public void seth_NECK_PROC_CD(String val) { m_h_NECK_PROC_CD = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setNECK_PROC_CD(String val) { m_NECK_PROC_CD = val; }
	public void setPROC_START_IDLE_DATE(String val) { m_PROC_START_IDLE_DATE = val; }
	public void setUNIT_LOAD(String val) { m_UNIT_LOAD = val; }
	public void setNECK_PROC_LT(String val) { m_NECK_PROC_LT = val; }
	public void setLOAD_ASSIGN_TYP(String val) { m_LOAD_ASSIGN_TYP = val; }
	public void setNECK_PROC_NAME(String val) { m_NECK_PROC_NAME = val; }
	public void setdet_NECK_PROC_CAPA(String val) { m_det_NECK_PROC_CAPA = val; }
	public void setdet_NECK_PROC_CAPA_UNIT(String val) { m_det_NECK_PROC_CAPA_UNIT = val; }
	public void setdet_MRP_ODR_TYP(String val) { m_det_MRP_ODR_TYP = val; }
	public void setdet_OUTSIDE_TYP(String val) { m_det_OUTSIDE_TYP = val; }
	public void setdet_ODR_LT(String val) { m_det_ODR_LT = val; }
	public void setdet_FIXED_LT(String val) { m_det_FIXED_LT = val; }
	public void setdet_SAFETY_LT(String val) { m_det_SAFETY_LT = val; }
	public void setdet_ISSUE_LT(String val) { m_det_ISSUE_LT = val; }
	public void setPROC_CD(String val) { m_PROC_CD = val; }
	public void setPROC_NAME(String val) { m_PROC_NAME = val; }
	public void setWS_CD(String val) { m_WS_CD = val; }
	public void setOUTSIDE_TYP(String val) { m_OUTSIDE_TYP = val; }
	public void setFIXED_LT(String val) { m_FIXED_LT = val; }
	public void setSAFETY_LT(String val) { m_SAFETY_LT = val; }
	public void seth_MODIFY_COUNT(String val) { m_h_MODIFY_COUNT = val; }
	public void seth_PLANT_CD(String val) { m_h_PLANT_CD = val; }
	public void setCNT(String val) { m_CNT = val; }
	public void setCNT_ITEM_CD(String val) { m_CNT_ITEM_CD = val; }
	public void setCNT_NECK_PROC_CD(String val) { m_CNT_NECK_PROC_CD = val; }
	public void setcheck_T_LOAD_CD(String val) { m_check_T_LOAD_CD = val; }
	public void setcheck_SIM_LOAD_CD(String val) { m_check_SIM_LOAD_CD = val; }


	public void setList_LOAD_ASSIGN_TYP_name(List list) { l_LOAD_ASSIGN_TYP_name = list; }
	public void setList_LOAD_ASSIGN_TYP_val(List list) { l_LOAD_ASSIGN_TYP_val = list; }
	public void setList_h_ITEM_CD(List list) { l_h_ITEM_CD = list; }
	public void setList_h_NECK_PROC_CD(List list) { l_h_NECK_PROC_CD = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_NECK_PROC_CD(List list) { l_NECK_PROC_CD = list; }
	public void setList_PROC_START_IDLE_DATE(List list) { l_PROC_START_IDLE_DATE = list; }
	public void setList_UNIT_LOAD(List list) { l_UNIT_LOAD = list; }
	public void setList_NECK_PROC_LT(List list) { l_NECK_PROC_LT = list; }
	public void setList_LOAD_ASSIGN_TYP(List list) { l_LOAD_ASSIGN_TYP = list; }
	public void setList_NECK_PROC_NAME(List list) { l_NECK_PROC_NAME = list; }
	public void setList_det_NECK_PROC_CAPA(List list) { l_det_NECK_PROC_CAPA = list; }
	public void setList_det_NECK_PROC_CAPA_UNIT(List list) { l_det_NECK_PROC_CAPA_UNIT = list; }
	public void setList_det_MRP_ODR_TYP(List list) { l_det_MRP_ODR_TYP = list; }
	public void setList_det_OUTSIDE_TYP(List list) { l_det_OUTSIDE_TYP = list; }
	public void setList_det_ODR_LT(List list) { l_det_ODR_LT = list; }
	public void setList_det_FIXED_LT(List list) { l_det_FIXED_LT = list; }
	public void setList_det_SAFETY_LT(List list) { l_det_SAFETY_LT = list; }
	public void setList_det_ISSUE_LT(List list) { l_det_ISSUE_LT = list; }
	public void setList_PROC_CD(List list) { l_PROC_CD = list; }
	public void setList_PROC_NAME(List list) { l_PROC_NAME = list; }
	public void setList_WS_CD(List list) { l_WS_CD = list; }
	public void setList_OUTSIDE_TYP(List list) { l_OUTSIDE_TYP = list; }
	public void setList_FIXED_LT(List list) { l_FIXED_LT = list; }
	public void setList_SAFETY_LT(List list) { l_SAFETY_LT = list; }
	public void setList_h_MODIFY_COUNT(List list) { l_h_MODIFY_COUNT = list; }
	public void setList_h_PLANT_CD(List list) { l_h_PLANT_CD = list; }
	public void setList_CNT(List list) { l_CNT = list; }
	public void setList_CNT_ITEM_CD(List list) { l_CNT_ITEM_CD = list; }
	public void setList_CNT_NECK_PROC_CD(List list) { l_CNT_NECK_PROC_CD = list; }
	public void setList_check_T_LOAD_CD(List list) { l_check_T_LOAD_CD = list; }
	public void setList_check_SIM_LOAD_CD(List list) { l_check_SIM_LOAD_CD = list; }

	public int setL2L_LOAD_ASSIGN_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_ASSIGN_TYP_name == null) {
			l_LOAD_ASSIGN_TYP_name = new ArrayList();
		} else {
			l_LOAD_ASSIGN_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_ASSIGN_TYP_name.add(((AL0020010Struct) list.get(i)).getLOAD_ASSIGN_TYP_name());
		}
		return size;
	}
	public int setL2L_LOAD_ASSIGN_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_ASSIGN_TYP_val == null) {
			l_LOAD_ASSIGN_TYP_val = new ArrayList();
		} else {
			l_LOAD_ASSIGN_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_ASSIGN_TYP_val.add(((AL0020010Struct) list.get(i)).getLOAD_ASSIGN_TYP_val());
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
			l_h_ITEM_CD.add(((AL0020010Struct) list.get(i)).geth_ITEM_CD());
		}
		return size;
	}
	public int setL2L_h_NECK_PROC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_NECK_PROC_CD == null) {
			l_h_NECK_PROC_CD = new ArrayList();
		} else {
			l_h_NECK_PROC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_NECK_PROC_CD.add(((AL0020010Struct) list.get(i)).geth_NECK_PROC_CD());
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
			l_ITEM_CD.add(((AL0020010Struct) list.get(i)).getITEM_CD());
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
			l_ITEM_NAME.add(((AL0020010Struct) list.get(i)).getITEM_NAME());
		}
		return size;
	}
	public int setL2L_NECK_PROC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NECK_PROC_CD == null) {
			l_NECK_PROC_CD = new ArrayList();
		} else {
			l_NECK_PROC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NECK_PROC_CD.add(((AL0020010Struct) list.get(i)).getNECK_PROC_CD());
		}
		return size;
	}
	public int setL2L_PROC_START_IDLE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_START_IDLE_DATE == null) {
			l_PROC_START_IDLE_DATE = new ArrayList();
		} else {
			l_PROC_START_IDLE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_START_IDLE_DATE.add(((AL0020010Struct) list.get(i)).getPROC_START_IDLE_DATE());
		}
		return size;
	}
	public int setL2L_UNIT_LOAD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_LOAD == null) {
			l_UNIT_LOAD = new ArrayList();
		} else {
			l_UNIT_LOAD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_LOAD.add(((AL0020010Struct) list.get(i)).getUNIT_LOAD());
		}
		return size;
	}
	public int setL2L_NECK_PROC_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NECK_PROC_LT == null) {
			l_NECK_PROC_LT = new ArrayList();
		} else {
			l_NECK_PROC_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NECK_PROC_LT.add(((AL0020010Struct) list.get(i)).getNECK_PROC_LT());
		}
		return size;
	}
	public int setL2L_LOAD_ASSIGN_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOAD_ASSIGN_TYP == null) {
			l_LOAD_ASSIGN_TYP = new ArrayList();
		} else {
			l_LOAD_ASSIGN_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOAD_ASSIGN_TYP.add(((AL0020010Struct) list.get(i)).getLOAD_ASSIGN_TYP());
		}
		return size;
	}
	public int setL2L_NECK_PROC_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NECK_PROC_NAME == null) {
			l_NECK_PROC_NAME = new ArrayList();
		} else {
			l_NECK_PROC_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NECK_PROC_NAME.add(((AL0020010Struct) list.get(i)).getNECK_PROC_NAME());
		}
		return size;
	}
	public int setL2L_det_NECK_PROC_CAPA(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_det_NECK_PROC_CAPA == null) {
			l_det_NECK_PROC_CAPA = new ArrayList();
		} else {
			l_det_NECK_PROC_CAPA.clear();
		}
		for (int i = 0; i < size; i++) {
			l_det_NECK_PROC_CAPA.add(((AL0020010Struct) list.get(i)).getdet_NECK_PROC_CAPA());
		}
		return size;
	}
	public int setL2L_det_NECK_PROC_CAPA_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_det_NECK_PROC_CAPA_UNIT == null) {
			l_det_NECK_PROC_CAPA_UNIT = new ArrayList();
		} else {
			l_det_NECK_PROC_CAPA_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_det_NECK_PROC_CAPA_UNIT.add(((AL0020010Struct) list.get(i)).getdet_NECK_PROC_CAPA_UNIT());
		}
		return size;
	}
	public int setL2L_det_MRP_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_det_MRP_ODR_TYP == null) {
			l_det_MRP_ODR_TYP = new ArrayList();
		} else {
			l_det_MRP_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_det_MRP_ODR_TYP.add(((AL0020010Struct) list.get(i)).getdet_MRP_ODR_TYP());
		}
		return size;
	}
	public int setL2L_det_OUTSIDE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_det_OUTSIDE_TYP == null) {
			l_det_OUTSIDE_TYP = new ArrayList();
		} else {
			l_det_OUTSIDE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_det_OUTSIDE_TYP.add(((AL0020010Struct) list.get(i)).getdet_OUTSIDE_TYP());
		}
		return size;
	}
	public int setL2L_det_ODR_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_det_ODR_LT == null) {
			l_det_ODR_LT = new ArrayList();
		} else {
			l_det_ODR_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_det_ODR_LT.add(((AL0020010Struct) list.get(i)).getdet_ODR_LT());
		}
		return size;
	}
	public int setL2L_det_FIXED_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_det_FIXED_LT == null) {
			l_det_FIXED_LT = new ArrayList();
		} else {
			l_det_FIXED_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_det_FIXED_LT.add(((AL0020010Struct) list.get(i)).getdet_FIXED_LT());
		}
		return size;
	}
	public int setL2L_det_SAFETY_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_det_SAFETY_LT == null) {
			l_det_SAFETY_LT = new ArrayList();
		} else {
			l_det_SAFETY_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_det_SAFETY_LT.add(((AL0020010Struct) list.get(i)).getdet_SAFETY_LT());
		}
		return size;
	}
	public int setL2L_det_ISSUE_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_det_ISSUE_LT == null) {
			l_det_ISSUE_LT = new ArrayList();
		} else {
			l_det_ISSUE_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_det_ISSUE_LT.add(((AL0020010Struct) list.get(i)).getdet_ISSUE_LT());
		}
		return size;
	}
	public int setL2L_PROC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_CD == null) {
			l_PROC_CD = new ArrayList();
		} else {
			l_PROC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_CD.add(((AL0020010Struct) list.get(i)).getPROC_CD());
		}
		return size;
	}
	public int setL2L_PROC_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_NAME == null) {
			l_PROC_NAME = new ArrayList();
		} else {
			l_PROC_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_NAME.add(((AL0020010Struct) list.get(i)).getPROC_NAME());
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
			l_WS_CD.add(((AL0020010Struct) list.get(i)).getWS_CD());
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
			l_OUTSIDE_TYP.add(((AL0020010Struct) list.get(i)).getOUTSIDE_TYP());
		}
		return size;
	}
	public int setL2L_FIXED_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FIXED_LT == null) {
			l_FIXED_LT = new ArrayList();
		} else {
			l_FIXED_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FIXED_LT.add(((AL0020010Struct) list.get(i)).getFIXED_LT());
		}
		return size;
	}
	public int setL2L_SAFETY_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SAFETY_LT == null) {
			l_SAFETY_LT = new ArrayList();
		} else {
			l_SAFETY_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SAFETY_LT.add(((AL0020010Struct) list.get(i)).getSAFETY_LT());
		}
		return size;
	}
	public int setL2L_h_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_MODIFY_COUNT == null) {
			l_h_MODIFY_COUNT = new ArrayList();
		} else {
			l_h_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_MODIFY_COUNT.add(((AL0020010Struct) list.get(i)).geth_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_h_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PLANT_CD == null) {
			l_h_PLANT_CD = new ArrayList();
		} else {
			l_h_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PLANT_CD.add(((AL0020010Struct) list.get(i)).geth_PLANT_CD());
		}
		return size;
	}
	public int setL2L_CNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CNT == null) {
			l_CNT = new ArrayList();
		} else {
			l_CNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CNT.add(((AL0020010Struct) list.get(i)).getCNT());
		}
		return size;
	}
	public int setL2L_CNT_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CNT_ITEM_CD == null) {
			l_CNT_ITEM_CD = new ArrayList();
		} else {
			l_CNT_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CNT_ITEM_CD.add(((AL0020010Struct) list.get(i)).getCNT_ITEM_CD());
		}
		return size;
	}
	public int setL2L_CNT_NECK_PROC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CNT_NECK_PROC_CD == null) {
			l_CNT_NECK_PROC_CD = new ArrayList();
		} else {
			l_CNT_NECK_PROC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CNT_NECK_PROC_CD.add(((AL0020010Struct) list.get(i)).getCNT_NECK_PROC_CD());
		}
		return size;
	}
	public int setL2L_check_T_LOAD_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_check_T_LOAD_CD == null) {
			l_check_T_LOAD_CD = new ArrayList();
		} else {
			l_check_T_LOAD_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_check_T_LOAD_CD.add(((AL0020010Struct) list.get(i)).getcheck_T_LOAD_CD());
		}
		return size;
	}
	public int setL2L_check_SIM_LOAD_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_check_SIM_LOAD_CD == null) {
			l_check_SIM_LOAD_CD = new ArrayList();
		} else {
			l_check_SIM_LOAD_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_check_SIM_LOAD_CD.add(((AL0020010Struct) list.get(i)).getcheck_SIM_LOAD_CD());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_LOAD_ASSIGN_TYP_name = null;
		m_LOAD_ASSIGN_TYP_val = null;
		m_h_ITEM_CD = null;
		m_h_NECK_PROC_CD = null;
		m_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_NECK_PROC_CD = null;
		m_PROC_START_IDLE_DATE = null;
		m_UNIT_LOAD = null;
		m_NECK_PROC_LT = null;
		m_LOAD_ASSIGN_TYP = null;
		m_NECK_PROC_NAME = null;
		m_det_NECK_PROC_CAPA = null;
		m_det_NECK_PROC_CAPA_UNIT = null;
		m_det_MRP_ODR_TYP = null;
		m_det_OUTSIDE_TYP = null;
		m_det_ODR_LT = null;
		m_det_FIXED_LT = null;
		m_det_SAFETY_LT = null;
		m_det_ISSUE_LT = null;
		m_PROC_CD = null;
		m_PROC_NAME = null;
		m_WS_CD = null;
		m_OUTSIDE_TYP = null;
		m_FIXED_LT = null;
		m_SAFETY_LT = null;
		m_h_MODIFY_COUNT = null;
		m_h_PLANT_CD = null;
		m_CNT = null;
		m_CNT_ITEM_CD = null;
		m_CNT_NECK_PROC_CD = null;
		m_check_T_LOAD_CD = null;
		m_check_SIM_LOAD_CD = null;

		l_LOAD_ASSIGN_TYP_name = null;
		l_LOAD_ASSIGN_TYP_val = null;
		l_h_ITEM_CD = null;
		l_h_NECK_PROC_CD = null;
		l_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_NECK_PROC_CD = null;
		l_PROC_START_IDLE_DATE = null;
		l_UNIT_LOAD = null;
		l_NECK_PROC_LT = null;
		l_LOAD_ASSIGN_TYP = null;
		l_NECK_PROC_NAME = null;
		l_det_NECK_PROC_CAPA = null;
		l_det_NECK_PROC_CAPA_UNIT = null;
		l_det_MRP_ODR_TYP = null;
		l_det_OUTSIDE_TYP = null;
		l_det_ODR_LT = null;
		l_det_FIXED_LT = null;
		l_det_SAFETY_LT = null;
		l_det_ISSUE_LT = null;
		l_PROC_CD = null;
		l_PROC_NAME = null;
		l_WS_CD = null;
		l_OUTSIDE_TYP = null;
		l_FIXED_LT = null;
		l_SAFETY_LT = null;
		l_h_MODIFY_COUNT = null;
		l_h_PLANT_CD = null;
		l_CNT = null;
		l_CNT_ITEM_CD = null;
		l_CNT_NECK_PROC_CD = null;
		l_check_T_LOAD_CD = null;
		l_check_SIM_LOAD_CD = null;

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
	 * medAL0020010�N���X�̕W���R���X�g���N�^
	 */
	public AL0020010Struct()
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
	public void setStruct(AL0020010Struct struct)
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
	public void setStructM(AL0020010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setLOAD_ASSIGN_TYP_name(struct.getLOAD_ASSIGN_TYP_name());
			this.setLOAD_ASSIGN_TYP_val(struct.getLOAD_ASSIGN_TYP_val());
			this.seth_ITEM_CD(struct.geth_ITEM_CD());
			this.seth_NECK_PROC_CD(struct.geth_NECK_PROC_CD());
			this.setITEM_CD(struct.getITEM_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setNECK_PROC_CD(struct.getNECK_PROC_CD());
			this.setPROC_START_IDLE_DATE(struct.getPROC_START_IDLE_DATE());
			this.setUNIT_LOAD(struct.getUNIT_LOAD());
			this.setNECK_PROC_LT(struct.getNECK_PROC_LT());
			this.setLOAD_ASSIGN_TYP(struct.getLOAD_ASSIGN_TYP());
			this.setNECK_PROC_NAME(struct.getNECK_PROC_NAME());
			this.setdet_NECK_PROC_CAPA(struct.getdet_NECK_PROC_CAPA());
			this.setdet_NECK_PROC_CAPA_UNIT(struct.getdet_NECK_PROC_CAPA_UNIT());
			this.setdet_MRP_ODR_TYP(struct.getdet_MRP_ODR_TYP());
			this.setdet_OUTSIDE_TYP(struct.getdet_OUTSIDE_TYP());
			this.setdet_ODR_LT(struct.getdet_ODR_LT());
			this.setdet_FIXED_LT(struct.getdet_FIXED_LT());
			this.setdet_SAFETY_LT(struct.getdet_SAFETY_LT());
			this.setdet_ISSUE_LT(struct.getdet_ISSUE_LT());
			this.setPROC_CD(struct.getPROC_CD());
			this.setPROC_NAME(struct.getPROC_NAME());
			this.setWS_CD(struct.getWS_CD());
			this.setOUTSIDE_TYP(struct.getOUTSIDE_TYP());
			this.setFIXED_LT(struct.getFIXED_LT());
			this.setSAFETY_LT(struct.getSAFETY_LT());
			this.seth_MODIFY_COUNT(struct.geth_MODIFY_COUNT());
			this.seth_PLANT_CD(struct.geth_PLANT_CD());
			this.setCNT(struct.getCNT());
			this.setCNT_ITEM_CD(struct.getCNT_ITEM_CD());
			this.setCNT_NECK_PROC_CD(struct.getCNT_NECK_PROC_CD());
			this.setcheck_T_LOAD_CD(struct.getcheck_T_LOAD_CD());
			this.setcheck_SIM_LOAD_CD(struct.getcheck_SIM_LOAD_CD());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AL0020010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_LOAD_ASSIGN_TYP_name(struct.getList_LOAD_ASSIGN_TYP_name());
			this.setList_LOAD_ASSIGN_TYP_val(struct.getList_LOAD_ASSIGN_TYP_val());
			this.setList_h_ITEM_CD(struct.getList_h_ITEM_CD());
			this.setList_h_NECK_PROC_CD(struct.getList_h_NECK_PROC_CD());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_NECK_PROC_CD(struct.getList_NECK_PROC_CD());
			this.setList_PROC_START_IDLE_DATE(struct.getList_PROC_START_IDLE_DATE());
			this.setList_UNIT_LOAD(struct.getList_UNIT_LOAD());
			this.setList_NECK_PROC_LT(struct.getList_NECK_PROC_LT());
			this.setList_LOAD_ASSIGN_TYP(struct.getList_LOAD_ASSIGN_TYP());
			this.setList_NECK_PROC_NAME(struct.getList_NECK_PROC_NAME());
			this.setList_det_NECK_PROC_CAPA(struct.getList_det_NECK_PROC_CAPA());
			this.setList_det_NECK_PROC_CAPA_UNIT(struct.getList_det_NECK_PROC_CAPA_UNIT());
			this.setList_det_MRP_ODR_TYP(struct.getList_det_MRP_ODR_TYP());
			this.setList_det_OUTSIDE_TYP(struct.getList_det_OUTSIDE_TYP());
			this.setList_det_ODR_LT(struct.getList_det_ODR_LT());
			this.setList_det_FIXED_LT(struct.getList_det_FIXED_LT());
			this.setList_det_SAFETY_LT(struct.getList_det_SAFETY_LT());
			this.setList_det_ISSUE_LT(struct.getList_det_ISSUE_LT());
			this.setList_PROC_CD(struct.getList_PROC_CD());
			this.setList_PROC_NAME(struct.getList_PROC_NAME());
			this.setList_WS_CD(struct.getList_WS_CD());
			this.setList_OUTSIDE_TYP(struct.getList_OUTSIDE_TYP());
			this.setList_FIXED_LT(struct.getList_FIXED_LT());
			this.setList_SAFETY_LT(struct.getList_SAFETY_LT());
			this.setList_h_MODIFY_COUNT(struct.getList_h_MODIFY_COUNT());
			this.setList_h_PLANT_CD(struct.getList_h_PLANT_CD());
			this.setList_CNT(struct.getList_CNT());
			this.setList_CNT_ITEM_CD(struct.getList_CNT_ITEM_CD());
			this.setList_CNT_NECK_PROC_CD(struct.getList_CNT_NECK_PROC_CD());
			this.setList_check_T_LOAD_CD(struct.getList_check_T_LOAD_CD());
			this.setList_check_SIM_LOAD_CD(struct.getList_check_SIM_LOAD_CD());
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
	// �� 1 �ϐ������l�F i_LOAD_ASSIGN_TYP_name


	final static String i_LOAD_ASSIGN_TYP_name = null;

	// �� 2 �ϐ������l�F i_LOAD_ASSIGN_TYP_val


	final static String i_LOAD_ASSIGN_TYP_val = null;

	// �� 3 �ϐ������l�F i_h_ITEM_CD


	final static String i_h_ITEM_CD = null;

	// �� 4 �ϐ������l�F i_h_NECK_PROC_CD


	final static String i_h_NECK_PROC_CD = null;

	// �� 5 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 6 �ϐ������l�F i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// �� 7 �ϐ������l�F i_NECK_PROC_CD


	final static String i_NECK_PROC_CD = null;

	// �� 8 �ϐ������l�F i_PROC_START_IDLE_DATE


	final static String i_PROC_START_IDLE_DATE = null;

	// �� 9 �ϐ������l�F i_UNIT_LOAD


	final static String i_UNIT_LOAD = null;

	// �� 10 �ϐ������l�F i_NECK_PROC_LT


	final static String i_NECK_PROC_LT = null;

	// �� 11 �ϐ������l�F i_LOAD_ASSIGN_TYP


	final static String i_LOAD_ASSIGN_TYP = null;

	// �� 12 �ϐ������l�F i_NECK_PROC_NAME


	final static String i_NECK_PROC_NAME = null;

	// �� 13 �ϐ������l�F i_det_NECK_PROC_CAPA


	final static String i_det_NECK_PROC_CAPA = null;

	// �� 14 �ϐ������l�F i_det_NECK_PROC_CAPA_UNIT


	final static String i_det_NECK_PROC_CAPA_UNIT = null;

	// �� 15 �ϐ������l�F i_det_MRP_ODR_TYP


	final static String i_det_MRP_ODR_TYP = null;

	// �� 16 �ϐ������l�F i_det_OUTSIDE_TYP


	final static String i_det_OUTSIDE_TYP = null;

	// �� 17 �ϐ������l�F i_det_ODR_LT


	final static String i_det_ODR_LT = null;

	// �� 18 �ϐ������l�F i_det_FIXED_LT


	final static String i_det_FIXED_LT = null;

	// �� 19 �ϐ������l�F i_det_SAFETY_LT


	final static String i_det_SAFETY_LT = null;

	// �� 20 �ϐ������l�F i_det_ISSUE_LT


	final static String i_det_ISSUE_LT = null;

	// �� 21 �ϐ������l�F i_PROC_CD


	final static String i_PROC_CD = null;

	// �� 22 �ϐ������l�F i_PROC_NAME


	final static String i_PROC_NAME = null;

	// �� 23 �ϐ������l�F i_WS_CD


	final static String i_WS_CD = null;

	// �� 24 �ϐ������l�F i_OUTSIDE_TYP


	final static String i_OUTSIDE_TYP = null;

	// �� 25 �ϐ������l�F i_FIXED_LT


	final static String i_FIXED_LT = null;

	// �� 26 �ϐ������l�F i_SAFETY_LT


	final static String i_SAFETY_LT = null;

	// �� 27 �ϐ������l�F i_h_MODIFY_COUNT


	final static String i_h_MODIFY_COUNT = null;

	// �� 28 �ϐ������l�F i_h_PLANT_CD


	final static String i_h_PLANT_CD = null;

	// �� 29 �ϐ������l�F i_CNT


	final static String i_CNT = null;

	// �� 30 �ϐ������l�F i_CNT_ITEM_CD


	final static String i_CNT_ITEM_CD = null;

	// �� 31 �ϐ������l�F i_CNT_NECK_PROC_CD


	final static String i_CNT_NECK_PROC_CD = null;

	// �� 32 �ϐ������l�F i_check_T_LOAD_CD


	final static String i_check_T_LOAD_CD = null;

	// �� 33 �ϐ������l�F i_check_SIM_LOAD_CD


	final static String i_check_SIM_LOAD_CD = null;

*/

	//{{user_implement_code
         // TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
         // �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
        // �� 1 �ϐ������l�F i_ITEM_CD
         final static String i_ITEM_CD = null;
        // �� 2 �ϐ������l�F i_ITEM_NAME
         final static String i_ITEM_NAME = null;
        // �� 3 �ϐ������l�F i_NECK_PROC_CD
         final static String i_NECK_PROC_CD = null;
        // �� 4 �ϐ������l�F i_PROC_START_IDLE_DATE
         final static String i_PROC_START_IDLE_DATE = null;
        // �� 5 �ϐ������l�F i_UNIT_LOAD
         final static String i_UNIT_LOAD = "0";
        // �� 6 �ϐ������l�F i_NECK_PROC_LT
         final static String i_NECK_PROC_LT = "0";
        // �� 7 �ϐ������l�F i_LOAD_ASSIGN_TYP
         final static String i_LOAD_ASSIGN_TYP = null;
        // �� 8 �ϐ������l�F i_NECK_PROC_NAME
         final static String i_NECK_PROC_NAME = null;
        // �� 9 �ϐ������l�F i_det_NECK_PROC_CAPA
         final static String i_det_NECK_PROC_CAPA = "0.0";
        // �� 10 �ϐ������l�F i_det_NECK_PROC_CAPA_UNIT
         final static String i_det_NECK_PROC_CAPA_UNIT = null;
        // �� 11 �ϐ������l�F i_det_MRP_ODR_TYP
         final static String i_det_MRP_ODR_TYP = null;
        // �� 12 �ϐ������l�F i_det_OUTSIDE_TYP
         final static String i_det_OUTSIDE_TYP = null;
        // �� 13 �ϐ������l�F i_det_ODR_LT
         final static String i_det_ODR_LT = "0";
        // �� 14 �ϐ������l�F i_det_FIXED_LT
         final static String i_det_FIXED_LT = "0";
        // �� 15 �ϐ������l�F i_det_SAFETY_LT
         final static String i_det_SAFETY_LT = "0";
        // �� 16 �ϐ������l�F i_det_ISSUE_LT
         final static String i_det_ISSUE_LT = "0";
        // �� 17 �ϐ������l�F i_PROC_CD
         final static String i_PROC_CD = null;
        // �� 18 �ϐ������l�F i_PROC_NAME
         final static String i_PROC_NAME = null;
        // �� 19 �ϐ������l�F i_WS_CD
         final static String i_WS_CD = null;
        // �� 20 �ϐ������l�F i_OUTSIDE_TYP
         final static String i_OUTSIDE_TYP = null;
        // �� 21 �ϐ������l�F i_FIXED_LT
         final static String i_FIXED_LT = "0";
        // �� 22 �ϐ������l�F i_SAFETY_LT
         final static String i_SAFETY_LT = "0";
        // �� 23 �ϐ������l�F i_h_MODIFY_COUNT
         final static String i_h_MODIFY_COUNT = null;
        // �� 24 �ϐ������l�F i_h_PLANT_CD
         final static String i_h_PLANT_CD = null;
        // �� 25 �ϐ������l�F i_CNT
         final static String i_CNT = null;
        // �� 26 �ϐ������l�F i_CNT_ITEM_CD
         final static String i_CNT_ITEM_CD = null;
        // �� 27 �ϐ������l�F i_CNT_NECK_PROC_CD
         final static String i_CNT_NECK_PROC_CD = null;
        // �� 28 �ϐ������l�F i_check_T_LOAD_CD
         final static String i_check_T_LOAD_CD = null;
        // �� 29 �ϐ������l�F i_check_SIM_LOAD_CD
         final static String i_check_SIM_LOAD_CD = null;
        // �� 30 �ϐ������l�F i_LOAD_ASSIGN_TYP_name
         final static String i_LOAD_ASSIGN_TYP_name = null;
        // �� 31 �ϐ������l�F i_LOAD_ASSIGN_TYP_val
         final static String i_LOAD_ASSIGN_TYP_val = null;
        // �� 32 �ϐ������l�F i_h_ITEM_CD
        final static String i_h_ITEM_CD = null;
        // �� 33 �ϐ������l�F i_h_NECK_PROC_CD
        final static String i_h_NECK_PROC_CD = null;
       
        /**
         * ������
         *
         */
        public void initialize()
        {
         m_ITEM_CD = i_ITEM_CD;
         m_ITEM_NAME = i_ITEM_NAME;
         m_NECK_PROC_CD = i_NECK_PROC_CD;
         m_PROC_START_IDLE_DATE = i_PROC_START_IDLE_DATE;
         m_UNIT_LOAD = i_UNIT_LOAD;
         m_NECK_PROC_LT = i_NECK_PROC_LT;
         m_LOAD_ASSIGN_TYP = i_LOAD_ASSIGN_TYP;
         m_NECK_PROC_NAME = i_NECK_PROC_NAME;
         m_det_NECK_PROC_CAPA = i_det_NECK_PROC_CAPA;
         m_det_NECK_PROC_CAPA_UNIT = i_det_NECK_PROC_CAPA_UNIT;
         m_det_MRP_ODR_TYP = i_det_MRP_ODR_TYP;
         m_det_OUTSIDE_TYP = i_det_OUTSIDE_TYP;
         m_det_ODR_LT = i_det_ODR_LT;
         m_det_FIXED_LT = i_det_FIXED_LT;
         m_det_SAFETY_LT = i_det_SAFETY_LT;
         m_det_ISSUE_LT = i_det_ISSUE_LT;
         m_PROC_CD = i_PROC_CD;
         m_PROC_NAME = i_PROC_NAME;
         m_WS_CD = i_WS_CD;
         m_OUTSIDE_TYP = i_OUTSIDE_TYP;
         m_FIXED_LT = i_FIXED_LT;
         m_SAFETY_LT = i_SAFETY_LT;
         m_h_MODIFY_COUNT = i_h_MODIFY_COUNT;
         m_h_PLANT_CD = i_h_PLANT_CD;
         m_CNT = i_CNT;
         m_CNT_ITEM_CD = i_CNT_ITEM_CD;
         m_CNT_NECK_PROC_CD = i_CNT_NECK_PROC_CD;
         m_check_T_LOAD_CD = i_check_T_LOAD_CD;
         m_check_SIM_LOAD_CD = i_check_SIM_LOAD_CD;
            m_h_ITEM_CD = i_h_ITEM_CD;
         m_h_NECK_PROC_CD = i_h_NECK_PROC_CD;
       
         l_ITEM_CD = null;
         l_ITEM_NAME = null;
         l_NECK_PROC_CD = null;
         l_PROC_START_IDLE_DATE = null;
         l_UNIT_LOAD = null;
         l_NECK_PROC_LT = null;
         l_LOAD_ASSIGN_TYP = null;
         l_NECK_PROC_NAME = null;
         l_det_NECK_PROC_CAPA = null;
         l_det_NECK_PROC_CAPA_UNIT = null;
         l_det_MRP_ODR_TYP = null;
         l_det_OUTSIDE_TYP = null;
         l_det_ODR_LT = null;
         l_det_FIXED_LT = null;
         l_det_SAFETY_LT = null;
         l_det_ISSUE_LT = null;
         l_PROC_CD = null;
         l_PROC_NAME = null;
         l_WS_CD = null;
         l_OUTSIDE_TYP = null;
         l_FIXED_LT = null;
         l_SAFETY_LT = null;
         l_h_MODIFY_COUNT = null;
         l_h_PLANT_CD = null;
         l_CNT = null;
         l_CNT_ITEM_CD = null;
         l_CNT_NECK_PROC_CD = null;
         l_check_T_LOAD_CD = null;
         l_check_SIM_LOAD_CD = null;
         l_h_ITEM_CD = null;
         l_h_NECK_PROC_CD = null;
        }
       
         // TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
