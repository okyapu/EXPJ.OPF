/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0070/src/com/nec/jp/orteus/metamorBase/AC0070/AC0070010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0070;

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

public class AC0070010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_ODR_STS_NAME */
	public String m_ODR_STS_NAME = null;
	/** �� 2 �ϐ��F m_EXTERNAL_PLAN_DEL_NAME */
	public String m_EXTERNAL_PLAN_DEL_NAME = null;
	/** �� 3 �ϐ��F m_UNIT_QTY_NAME */
	public String m_UNIT_QTY_NAME = null;
	/** �� 4 �ϐ��F m_MRP_ODR_NAME */
	public String m_MRP_ODR_NAME = null;
	/** �� 5 �ϐ��F m_OUTSIDE_NAME */
	public String m_OUTSIDE_NAME = null;
	/** �� 6 �ϐ��F m_w_PLAN_CD */
	public String m_w_PLAN_CD = null;
	/** �� 7 �ϐ��F m_w_OUTSIDE_TYP_val */
	public String m_w_OUTSIDE_TYP_val = null;
	/** �� 8 �ϐ��F m_w_OUTSIDE_TYP_name */
	public String m_w_OUTSIDE_TYP_name = null;
	/** �� 9 �ϐ��F m_w_MRP_ODR_TYP_val */
	public String m_w_MRP_ODR_TYP_val = null;
	/** �� 10 �ϐ��F m_w_MRP_ODR_TYP_name */
	public String m_w_MRP_ODR_TYP_name = null;
	/** �� 11 �ϐ��F m_w_UNIT_QTY_TYP_val */
	public String m_w_UNIT_QTY_TYP_val = null;
	/** �� 12 �ϐ��F m_w_UNIT_QTY_TYP_name */
	public String m_w_UNIT_QTY_TYP_name = null;
	/** �� 13 �ϐ��F m_w_ODR_STS_TYP_val */
	public String m_w_ODR_STS_TYP_val = null;
	/** �� 14 �ϐ��F m_w_ODR_STS_TYP_name */
	public String m_w_ODR_STS_TYP_name = null;
	/** �� 15 �ϐ��F m_w_EXTERNAL_PLAN_DEL_FLG_val */
	public String m_w_EXTERNAL_PLAN_DEL_FLG_val = null;
	/** �� 16 �ϐ��F m_w_EXTERNAL_PLAN_DEL_FLG_name */
	public String m_w_EXTERNAL_PLAN_DEL_FLG_name = null;
	/** �� 17 �ϐ��F m_EXTERNAL_LEVEL_NO */
	public String m_EXTERNAL_LEVEL_NO = null;
	/** �� 18 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 19 �ϐ��F m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** �� 20 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 21 �ϐ��F m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** �� 22 �ϐ��F m_ODR_START_DATE */
	public String m_ODR_START_DATE = null;
	/** �� 23 �ϐ��F m_PRD_START_DATE */
	public String m_PRD_START_DATE = null;
	/** �� 24 �ϐ��F m_PRD_DUE_DATE */
	public String m_PRD_DUE_DATE = null;
	/** �� 25 �ϐ��F m_ODR_QTY */
	public String m_ODR_QTY = null;
	/** �� 26 �ϐ��F m_ODR_STS_TYP */
	public String m_ODR_STS_TYP = null;
	/** �� 27 �ϐ��F m_EXTERNAL_PLAN_DEL_FLG */
	public String m_EXTERNAL_PLAN_DEL_FLG = null;
	/** �� 28 �ϐ��F m_DRAW_CD */
	public String m_DRAW_CD = null;
	/** �� 29 �ϐ��F m_SPEC */
	public String m_SPEC = null;
	/** �� 30 �ϐ��F m_UNIT_QTY_TYP */
	public String m_UNIT_QTY_TYP = null;
	/** �� 31 �ϐ��F m_MRP_ODR_TYP */
	public String m_MRP_ODR_TYP = null;
	/** �� 32 �ϐ��F m_OUTSIDE_TYP */
	public String m_OUTSIDE_TYP = null;
	/** �� 33 �ϐ��F m_l_COUNT */
	public String m_l_COUNT = null;
	/** �� 34 �ϐ��F m_ROW_COUNT */
	public String m_ROW_COUNT = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_ODR_STS_NAME */
	public List l_ODR_STS_NAME = null;

	/** �� 2 List�ϐ��F l_EXTERNAL_PLAN_DEL_NAME */
	public List l_EXTERNAL_PLAN_DEL_NAME = null;

	/** �� 3 List�ϐ��F l_UNIT_QTY_NAME */
	public List l_UNIT_QTY_NAME = null;

	/** �� 4 List�ϐ��F l_MRP_ODR_NAME */
	public List l_MRP_ODR_NAME = null;

	/** �� 5 List�ϐ��F l_OUTSIDE_NAME */
	public List l_OUTSIDE_NAME = null;

	/** �� 6 List�ϐ��F l_w_PLAN_CD */
	public List l_w_PLAN_CD = null;

	/** �� 7 List�ϐ��F l_w_OUTSIDE_TYP_val */
	public List l_w_OUTSIDE_TYP_val = null;

	/** �� 8 List�ϐ��F l_w_OUTSIDE_TYP_name */
	public List l_w_OUTSIDE_TYP_name = null;

	/** �� 9 List�ϐ��F l_w_MRP_ODR_TYP_val */
	public List l_w_MRP_ODR_TYP_val = null;

	/** �� 10 List�ϐ��F l_w_MRP_ODR_TYP_name */
	public List l_w_MRP_ODR_TYP_name = null;

	/** �� 11 List�ϐ��F l_w_UNIT_QTY_TYP_val */
	public List l_w_UNIT_QTY_TYP_val = null;

	/** �� 12 List�ϐ��F l_w_UNIT_QTY_TYP_name */
	public List l_w_UNIT_QTY_TYP_name = null;

	/** �� 13 List�ϐ��F l_w_ODR_STS_TYP_val */
	public List l_w_ODR_STS_TYP_val = null;

	/** �� 14 List�ϐ��F l_w_ODR_STS_TYP_name */
	public List l_w_ODR_STS_TYP_name = null;

	/** �� 15 List�ϐ��F l_w_EXTERNAL_PLAN_DEL_FLG_val */
	public List l_w_EXTERNAL_PLAN_DEL_FLG_val = null;

	/** �� 16 List�ϐ��F l_w_EXTERNAL_PLAN_DEL_FLG_name */
	public List l_w_EXTERNAL_PLAN_DEL_FLG_name = null;

	/** �� 17 List�ϐ��F l_EXTERNAL_LEVEL_NO */
	public List l_EXTERNAL_LEVEL_NO = null;

	/** �� 18 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 19 List�ϐ��F l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** �� 20 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 21 List�ϐ��F l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** �� 22 List�ϐ��F l_ODR_START_DATE */
	public List l_ODR_START_DATE = null;

	/** �� 23 List�ϐ��F l_PRD_START_DATE */
	public List l_PRD_START_DATE = null;

	/** �� 24 List�ϐ��F l_PRD_DUE_DATE */
	public List l_PRD_DUE_DATE = null;

	/** �� 25 List�ϐ��F l_ODR_QTY */
	public List l_ODR_QTY = null;

	/** �� 26 List�ϐ��F l_ODR_STS_TYP */
	public List l_ODR_STS_TYP = null;

	/** �� 27 List�ϐ��F l_EXTERNAL_PLAN_DEL_FLG */
	public List l_EXTERNAL_PLAN_DEL_FLG = null;

	/** �� 28 List�ϐ��F l_DRAW_CD */
	public List l_DRAW_CD = null;

	/** �� 29 List�ϐ��F l_SPEC */
	public List l_SPEC = null;

	/** �� 30 List�ϐ��F l_UNIT_QTY_TYP */
	public List l_UNIT_QTY_TYP = null;

	/** �� 31 List�ϐ��F l_MRP_ODR_TYP */
	public List l_MRP_ODR_TYP = null;

	/** �� 32 List�ϐ��F l_OUTSIDE_TYP */
	public List l_OUTSIDE_TYP = null;

	/** �� 33 List�ϐ��F l_l_COUNT */
	public List l_l_COUNT = null;

	/** �� 34 List�ϐ��F l_ROW_COUNT */
	public List l_ROW_COUNT = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getODR_STS_NAME() { return m_ODR_STS_NAME; }
	public String getEXTERNAL_PLAN_DEL_NAME() { return m_EXTERNAL_PLAN_DEL_NAME; }
	public String getUNIT_QTY_NAME() { return m_UNIT_QTY_NAME; }
	public String getMRP_ODR_NAME() { return m_MRP_ODR_NAME; }
	public String getOUTSIDE_NAME() { return m_OUTSIDE_NAME; }
	public String getw_PLAN_CD() { return m_w_PLAN_CD; }
	public String getw_OUTSIDE_TYP_val() { return m_w_OUTSIDE_TYP_val; }
	public String getw_OUTSIDE_TYP_name() { return m_w_OUTSIDE_TYP_name; }
	public String getw_MRP_ODR_TYP_val() { return m_w_MRP_ODR_TYP_val; }
	public String getw_MRP_ODR_TYP_name() { return m_w_MRP_ODR_TYP_name; }
	public String getw_UNIT_QTY_TYP_val() { return m_w_UNIT_QTY_TYP_val; }
	public String getw_UNIT_QTY_TYP_name() { return m_w_UNIT_QTY_TYP_name; }
	public String getw_ODR_STS_TYP_val() { return m_w_ODR_STS_TYP_val; }
	public String getw_ODR_STS_TYP_name() { return m_w_ODR_STS_TYP_name; }
	public String getw_EXTERNAL_PLAN_DEL_FLG_val() { return m_w_EXTERNAL_PLAN_DEL_FLG_val; }
	public String getw_EXTERNAL_PLAN_DEL_FLG_name() { return m_w_EXTERNAL_PLAN_DEL_FLG_name; }
	public String getEXTERNAL_LEVEL_NO() { return m_EXTERNAL_LEVEL_NO; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getODR_START_DATE() { return m_ODR_START_DATE; }
	public String getPRD_START_DATE() { return m_PRD_START_DATE; }
	public String getPRD_DUE_DATE() { return m_PRD_DUE_DATE; }
	public String getODR_QTY() { return m_ODR_QTY; }
	public String getODR_STS_TYP() { return m_ODR_STS_TYP; }
	public String getEXTERNAL_PLAN_DEL_FLG() { return m_EXTERNAL_PLAN_DEL_FLG; }
	public String getDRAW_CD() { return m_DRAW_CD; }
	public String getSPEC() { return m_SPEC; }
	public String getUNIT_QTY_TYP() { return m_UNIT_QTY_TYP; }
	public String getMRP_ODR_TYP() { return m_MRP_ODR_TYP; }
	public String getOUTSIDE_TYP() { return m_OUTSIDE_TYP; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }

	public List getList_ODR_STS_NAME() { return l_ODR_STS_NAME; }
	public List getList_EXTERNAL_PLAN_DEL_NAME() { return l_EXTERNAL_PLAN_DEL_NAME; }
	public List getList_UNIT_QTY_NAME() { return l_UNIT_QTY_NAME; }
	public List getList_MRP_ODR_NAME() { return l_MRP_ODR_NAME; }
	public List getList_OUTSIDE_NAME() { return l_OUTSIDE_NAME; }
	public List getList_w_PLAN_CD() { return l_w_PLAN_CD; }
	public List getList_w_OUTSIDE_TYP_val() { return l_w_OUTSIDE_TYP_val; }
	public List getList_w_OUTSIDE_TYP_name() { return l_w_OUTSIDE_TYP_name; }
	public List getList_w_MRP_ODR_TYP_val() { return l_w_MRP_ODR_TYP_val; }
	public List getList_w_MRP_ODR_TYP_name() { return l_w_MRP_ODR_TYP_name; }
	public List getList_w_UNIT_QTY_TYP_val() { return l_w_UNIT_QTY_TYP_val; }
	public List getList_w_UNIT_QTY_TYP_name() { return l_w_UNIT_QTY_TYP_name; }
	public List getList_w_ODR_STS_TYP_val() { return l_w_ODR_STS_TYP_val; }
	public List getList_w_ODR_STS_TYP_name() { return l_w_ODR_STS_TYP_name; }
	public List getList_w_EXTERNAL_PLAN_DEL_FLG_val() { return l_w_EXTERNAL_PLAN_DEL_FLG_val; }
	public List getList_w_EXTERNAL_PLAN_DEL_FLG_name() { return l_w_EXTERNAL_PLAN_DEL_FLG_name; }
	public List getList_EXTERNAL_LEVEL_NO() { return l_EXTERNAL_LEVEL_NO; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_ODR_START_DATE() { return l_ODR_START_DATE; }
	public List getList_PRD_START_DATE() { return l_PRD_START_DATE; }
	public List getList_PRD_DUE_DATE() { return l_PRD_DUE_DATE; }
	public List getList_ODR_QTY() { return l_ODR_QTY; }
	public List getList_ODR_STS_TYP() { return l_ODR_STS_TYP; }
	public List getList_EXTERNAL_PLAN_DEL_FLG() { return l_EXTERNAL_PLAN_DEL_FLG; }
	public List getList_DRAW_CD() { return l_DRAW_CD; }
	public List getList_SPEC() { return l_SPEC; }
	public List getList_UNIT_QTY_TYP() { return l_UNIT_QTY_TYP; }
	public List getList_MRP_ODR_TYP() { return l_MRP_ODR_TYP; }
	public List getList_OUTSIDE_TYP() { return l_OUTSIDE_TYP; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }

	public void setODR_STS_NAME(String val) { m_ODR_STS_NAME = val; }
	public void setEXTERNAL_PLAN_DEL_NAME(String val) { m_EXTERNAL_PLAN_DEL_NAME = val; }
	public void setUNIT_QTY_NAME(String val) { m_UNIT_QTY_NAME = val; }
	public void setMRP_ODR_NAME(String val) { m_MRP_ODR_NAME = val; }
	public void setOUTSIDE_NAME(String val) { m_OUTSIDE_NAME = val; }
	public void setw_PLAN_CD(String val) { m_w_PLAN_CD = val; }
	public void setw_OUTSIDE_TYP_val(String val) { m_w_OUTSIDE_TYP_val = val; }
	public void setw_OUTSIDE_TYP_name(String val) { m_w_OUTSIDE_TYP_name = val; }
	public void setw_MRP_ODR_TYP_val(String val) { m_w_MRP_ODR_TYP_val = val; }
	public void setw_MRP_ODR_TYP_name(String val) { m_w_MRP_ODR_TYP_name = val; }
	public void setw_UNIT_QTY_TYP_val(String val) { m_w_UNIT_QTY_TYP_val = val; }
	public void setw_UNIT_QTY_TYP_name(String val) { m_w_UNIT_QTY_TYP_name = val; }
	public void setw_ODR_STS_TYP_val(String val) { m_w_ODR_STS_TYP_val = val; }
	public void setw_ODR_STS_TYP_name(String val) { m_w_ODR_STS_TYP_name = val; }
	public void setw_EXTERNAL_PLAN_DEL_FLG_val(String val) { m_w_EXTERNAL_PLAN_DEL_FLG_val = val; }
	public void setw_EXTERNAL_PLAN_DEL_FLG_name(String val) { m_w_EXTERNAL_PLAN_DEL_FLG_name = val; }
	public void setEXTERNAL_LEVEL_NO(String val) { m_EXTERNAL_LEVEL_NO = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setODR_START_DATE(String val) { m_ODR_START_DATE = val; }
	public void setPRD_START_DATE(String val) { m_PRD_START_DATE = val; }
	public void setPRD_DUE_DATE(String val) { m_PRD_DUE_DATE = val; }
	public void setODR_QTY(String val) { m_ODR_QTY = val; }
	public void setODR_STS_TYP(String val) { m_ODR_STS_TYP = val; }
	public void setEXTERNAL_PLAN_DEL_FLG(String val) { m_EXTERNAL_PLAN_DEL_FLG = val; }
	public void setDRAW_CD(String val) { m_DRAW_CD = val; }
	public void setSPEC(String val) { m_SPEC = val; }
	public void setUNIT_QTY_TYP(String val) { m_UNIT_QTY_TYP = val; }
	public void setMRP_ODR_TYP(String val) { m_MRP_ODR_TYP = val; }
	public void setOUTSIDE_TYP(String val) { m_OUTSIDE_TYP = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }


	public void setList_ODR_STS_NAME(List list) { l_ODR_STS_NAME = list; }
	public void setList_EXTERNAL_PLAN_DEL_NAME(List list) { l_EXTERNAL_PLAN_DEL_NAME = list; }
	public void setList_UNIT_QTY_NAME(List list) { l_UNIT_QTY_NAME = list; }
	public void setList_MRP_ODR_NAME(List list) { l_MRP_ODR_NAME = list; }
	public void setList_OUTSIDE_NAME(List list) { l_OUTSIDE_NAME = list; }
	public void setList_w_PLAN_CD(List list) { l_w_PLAN_CD = list; }
	public void setList_w_OUTSIDE_TYP_val(List list) { l_w_OUTSIDE_TYP_val = list; }
	public void setList_w_OUTSIDE_TYP_name(List list) { l_w_OUTSIDE_TYP_name = list; }
	public void setList_w_MRP_ODR_TYP_val(List list) { l_w_MRP_ODR_TYP_val = list; }
	public void setList_w_MRP_ODR_TYP_name(List list) { l_w_MRP_ODR_TYP_name = list; }
	public void setList_w_UNIT_QTY_TYP_val(List list) { l_w_UNIT_QTY_TYP_val = list; }
	public void setList_w_UNIT_QTY_TYP_name(List list) { l_w_UNIT_QTY_TYP_name = list; }
	public void setList_w_ODR_STS_TYP_val(List list) { l_w_ODR_STS_TYP_val = list; }
	public void setList_w_ODR_STS_TYP_name(List list) { l_w_ODR_STS_TYP_name = list; }
	public void setList_w_EXTERNAL_PLAN_DEL_FLG_val(List list) { l_w_EXTERNAL_PLAN_DEL_FLG_val = list; }
	public void setList_w_EXTERNAL_PLAN_DEL_FLG_name(List list) { l_w_EXTERNAL_PLAN_DEL_FLG_name = list; }
	public void setList_EXTERNAL_LEVEL_NO(List list) { l_EXTERNAL_LEVEL_NO = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_ODR_START_DATE(List list) { l_ODR_START_DATE = list; }
	public void setList_PRD_START_DATE(List list) { l_PRD_START_DATE = list; }
	public void setList_PRD_DUE_DATE(List list) { l_PRD_DUE_DATE = list; }
	public void setList_ODR_QTY(List list) { l_ODR_QTY = list; }
	public void setList_ODR_STS_TYP(List list) { l_ODR_STS_TYP = list; }
	public void setList_EXTERNAL_PLAN_DEL_FLG(List list) { l_EXTERNAL_PLAN_DEL_FLG = list; }
	public void setList_DRAW_CD(List list) { l_DRAW_CD = list; }
	public void setList_SPEC(List list) { l_SPEC = list; }
	public void setList_UNIT_QTY_TYP(List list) { l_UNIT_QTY_TYP = list; }
	public void setList_MRP_ODR_TYP(List list) { l_MRP_ODR_TYP = list; }
	public void setList_OUTSIDE_TYP(List list) { l_OUTSIDE_TYP = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }

	public int setL2L_ODR_STS_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_STS_NAME == null) {
			l_ODR_STS_NAME = new ArrayList();
		} else {
			l_ODR_STS_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_STS_NAME.add(((AC0070010Struct) list.get(i)).getODR_STS_NAME());
		}
		return size;
	}
	public int setL2L_EXTERNAL_PLAN_DEL_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXTERNAL_PLAN_DEL_NAME == null) {
			l_EXTERNAL_PLAN_DEL_NAME = new ArrayList();
		} else {
			l_EXTERNAL_PLAN_DEL_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXTERNAL_PLAN_DEL_NAME.add(((AC0070010Struct) list.get(i)).getEXTERNAL_PLAN_DEL_NAME());
		}
		return size;
	}
	public int setL2L_UNIT_QTY_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_QTY_NAME == null) {
			l_UNIT_QTY_NAME = new ArrayList();
		} else {
			l_UNIT_QTY_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_QTY_NAME.add(((AC0070010Struct) list.get(i)).getUNIT_QTY_NAME());
		}
		return size;
	}
	public int setL2L_MRP_ODR_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_ODR_NAME == null) {
			l_MRP_ODR_NAME = new ArrayList();
		} else {
			l_MRP_ODR_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_ODR_NAME.add(((AC0070010Struct) list.get(i)).getMRP_ODR_NAME());
		}
		return size;
	}
	public int setL2L_OUTSIDE_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OUTSIDE_NAME == null) {
			l_OUTSIDE_NAME = new ArrayList();
		} else {
			l_OUTSIDE_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OUTSIDE_NAME.add(((AC0070010Struct) list.get(i)).getOUTSIDE_NAME());
		}
		return size;
	}
	public int setL2L_w_PLAN_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_PLAN_CD == null) {
			l_w_PLAN_CD = new ArrayList();
		} else {
			l_w_PLAN_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_PLAN_CD.add(((AC0070010Struct) list.get(i)).getw_PLAN_CD());
		}
		return size;
	}
	public int setL2L_w_OUTSIDE_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_OUTSIDE_TYP_val == null) {
			l_w_OUTSIDE_TYP_val = new ArrayList();
		} else {
			l_w_OUTSIDE_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_OUTSIDE_TYP_val.add(((AC0070010Struct) list.get(i)).getw_OUTSIDE_TYP_val());
		}
		return size;
	}
	public int setL2L_w_OUTSIDE_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_OUTSIDE_TYP_name == null) {
			l_w_OUTSIDE_TYP_name = new ArrayList();
		} else {
			l_w_OUTSIDE_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_OUTSIDE_TYP_name.add(((AC0070010Struct) list.get(i)).getw_OUTSIDE_TYP_name());
		}
		return size;
	}
	public int setL2L_w_MRP_ODR_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_MRP_ODR_TYP_val == null) {
			l_w_MRP_ODR_TYP_val = new ArrayList();
		} else {
			l_w_MRP_ODR_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_MRP_ODR_TYP_val.add(((AC0070010Struct) list.get(i)).getw_MRP_ODR_TYP_val());
		}
		return size;
	}
	public int setL2L_w_MRP_ODR_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_MRP_ODR_TYP_name == null) {
			l_w_MRP_ODR_TYP_name = new ArrayList();
		} else {
			l_w_MRP_ODR_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_MRP_ODR_TYP_name.add(((AC0070010Struct) list.get(i)).getw_MRP_ODR_TYP_name());
		}
		return size;
	}
	public int setL2L_w_UNIT_QTY_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_UNIT_QTY_TYP_val == null) {
			l_w_UNIT_QTY_TYP_val = new ArrayList();
		} else {
			l_w_UNIT_QTY_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_UNIT_QTY_TYP_val.add(((AC0070010Struct) list.get(i)).getw_UNIT_QTY_TYP_val());
		}
		return size;
	}
	public int setL2L_w_UNIT_QTY_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_UNIT_QTY_TYP_name == null) {
			l_w_UNIT_QTY_TYP_name = new ArrayList();
		} else {
			l_w_UNIT_QTY_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_UNIT_QTY_TYP_name.add(((AC0070010Struct) list.get(i)).getw_UNIT_QTY_TYP_name());
		}
		return size;
	}
	public int setL2L_w_ODR_STS_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_ODR_STS_TYP_val == null) {
			l_w_ODR_STS_TYP_val = new ArrayList();
		} else {
			l_w_ODR_STS_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_ODR_STS_TYP_val.add(((AC0070010Struct) list.get(i)).getw_ODR_STS_TYP_val());
		}
		return size;
	}
	public int setL2L_w_ODR_STS_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_ODR_STS_TYP_name == null) {
			l_w_ODR_STS_TYP_name = new ArrayList();
		} else {
			l_w_ODR_STS_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_ODR_STS_TYP_name.add(((AC0070010Struct) list.get(i)).getw_ODR_STS_TYP_name());
		}
		return size;
	}
	public int setL2L_w_EXTERNAL_PLAN_DEL_FLG_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_EXTERNAL_PLAN_DEL_FLG_val == null) {
			l_w_EXTERNAL_PLAN_DEL_FLG_val = new ArrayList();
		} else {
			l_w_EXTERNAL_PLAN_DEL_FLG_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_EXTERNAL_PLAN_DEL_FLG_val.add(((AC0070010Struct) list.get(i)).getw_EXTERNAL_PLAN_DEL_FLG_val());
		}
		return size;
	}
	public int setL2L_w_EXTERNAL_PLAN_DEL_FLG_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_EXTERNAL_PLAN_DEL_FLG_name == null) {
			l_w_EXTERNAL_PLAN_DEL_FLG_name = new ArrayList();
		} else {
			l_w_EXTERNAL_PLAN_DEL_FLG_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_EXTERNAL_PLAN_DEL_FLG_name.add(((AC0070010Struct) list.get(i)).getw_EXTERNAL_PLAN_DEL_FLG_name());
		}
		return size;
	}
	public int setL2L_EXTERNAL_LEVEL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXTERNAL_LEVEL_NO == null) {
			l_EXTERNAL_LEVEL_NO = new ArrayList();
		} else {
			l_EXTERNAL_LEVEL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXTERNAL_LEVEL_NO.add(((AC0070010Struct) list.get(i)).getEXTERNAL_LEVEL_NO());
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
			l_PLANT_CD.add(((AC0070010Struct) list.get(i)).getPLANT_CD());
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
			l_PLANT_NAME.add(((AC0070010Struct) list.get(i)).getPLANT_NAME());
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
			l_ITEM_CD.add(((AC0070010Struct) list.get(i)).getITEM_CD());
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
			l_ITEM_NAME.add(((AC0070010Struct) list.get(i)).getITEM_NAME());
		}
		return size;
	}
	public int setL2L_ODR_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_START_DATE == null) {
			l_ODR_START_DATE = new ArrayList();
		} else {
			l_ODR_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_START_DATE.add(((AC0070010Struct) list.get(i)).getODR_START_DATE());
		}
		return size;
	}
	public int setL2L_PRD_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRD_START_DATE == null) {
			l_PRD_START_DATE = new ArrayList();
		} else {
			l_PRD_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRD_START_DATE.add(((AC0070010Struct) list.get(i)).getPRD_START_DATE());
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
			l_PRD_DUE_DATE.add(((AC0070010Struct) list.get(i)).getPRD_DUE_DATE());
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
			l_ODR_QTY.add(((AC0070010Struct) list.get(i)).getODR_QTY());
		}
		return size;
	}
	public int setL2L_ODR_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_STS_TYP == null) {
			l_ODR_STS_TYP = new ArrayList();
		} else {
			l_ODR_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_STS_TYP.add(((AC0070010Struct) list.get(i)).getODR_STS_TYP());
		}
		return size;
	}
	public int setL2L_EXTERNAL_PLAN_DEL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXTERNAL_PLAN_DEL_FLG == null) {
			l_EXTERNAL_PLAN_DEL_FLG = new ArrayList();
		} else {
			l_EXTERNAL_PLAN_DEL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXTERNAL_PLAN_DEL_FLG.add(((AC0070010Struct) list.get(i)).getEXTERNAL_PLAN_DEL_FLG());
		}
		return size;
	}
	public int setL2L_DRAW_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DRAW_CD == null) {
			l_DRAW_CD = new ArrayList();
		} else {
			l_DRAW_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DRAW_CD.add(((AC0070010Struct) list.get(i)).getDRAW_CD());
		}
		return size;
	}
	public int setL2L_SPEC(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SPEC == null) {
			l_SPEC = new ArrayList();
		} else {
			l_SPEC.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SPEC.add(((AC0070010Struct) list.get(i)).getSPEC());
		}
		return size;
	}
	public int setL2L_UNIT_QTY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_QTY_TYP == null) {
			l_UNIT_QTY_TYP = new ArrayList();
		} else {
			l_UNIT_QTY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_QTY_TYP.add(((AC0070010Struct) list.get(i)).getUNIT_QTY_TYP());
		}
		return size;
	}
	public int setL2L_MRP_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_ODR_TYP == null) {
			l_MRP_ODR_TYP = new ArrayList();
		} else {
			l_MRP_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_ODR_TYP.add(((AC0070010Struct) list.get(i)).getMRP_ODR_TYP());
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
			l_OUTSIDE_TYP.add(((AC0070010Struct) list.get(i)).getOUTSIDE_TYP());
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
			l_l_COUNT.add(((AC0070010Struct) list.get(i)).getl_COUNT());
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
			l_ROW_COUNT.add(((AC0070010Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_ODR_STS_NAME = null;
		m_EXTERNAL_PLAN_DEL_NAME = null;
		m_UNIT_QTY_NAME = null;
		m_MRP_ODR_NAME = null;
		m_OUTSIDE_NAME = null;
		m_w_PLAN_CD = null;
		m_w_OUTSIDE_TYP_val = null;
		m_w_OUTSIDE_TYP_name = null;
		m_w_MRP_ODR_TYP_val = null;
		m_w_MRP_ODR_TYP_name = null;
		m_w_UNIT_QTY_TYP_val = null;
		m_w_UNIT_QTY_TYP_name = null;
		m_w_ODR_STS_TYP_val = null;
		m_w_ODR_STS_TYP_name = null;
		m_w_EXTERNAL_PLAN_DEL_FLG_val = null;
		m_w_EXTERNAL_PLAN_DEL_FLG_name = null;
		m_EXTERNAL_LEVEL_NO = null;
		m_PLANT_CD = null;
		m_PLANT_NAME = null;
		m_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_ODR_START_DATE = null;
		m_PRD_START_DATE = null;
		m_PRD_DUE_DATE = null;
		m_ODR_QTY = null;
		m_ODR_STS_TYP = null;
		m_EXTERNAL_PLAN_DEL_FLG = null;
		m_DRAW_CD = null;
		m_SPEC = null;
		m_UNIT_QTY_TYP = null;
		m_MRP_ODR_TYP = null;
		m_OUTSIDE_TYP = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;

		l_ODR_STS_NAME = null;
		l_EXTERNAL_PLAN_DEL_NAME = null;
		l_UNIT_QTY_NAME = null;
		l_MRP_ODR_NAME = null;
		l_OUTSIDE_NAME = null;
		l_w_PLAN_CD = null;
		l_w_OUTSIDE_TYP_val = null;
		l_w_OUTSIDE_TYP_name = null;
		l_w_MRP_ODR_TYP_val = null;
		l_w_MRP_ODR_TYP_name = null;
		l_w_UNIT_QTY_TYP_val = null;
		l_w_UNIT_QTY_TYP_name = null;
		l_w_ODR_STS_TYP_val = null;
		l_w_ODR_STS_TYP_name = null;
		l_w_EXTERNAL_PLAN_DEL_FLG_val = null;
		l_w_EXTERNAL_PLAN_DEL_FLG_name = null;
		l_EXTERNAL_LEVEL_NO = null;
		l_PLANT_CD = null;
		l_PLANT_NAME = null;
		l_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_ODR_START_DATE = null;
		l_PRD_START_DATE = null;
		l_PRD_DUE_DATE = null;
		l_ODR_QTY = null;
		l_ODR_STS_TYP = null;
		l_EXTERNAL_PLAN_DEL_FLG = null;
		l_DRAW_CD = null;
		l_SPEC = null;
		l_UNIT_QTY_TYP = null;
		l_MRP_ODR_TYP = null;
		l_OUTSIDE_TYP = null;
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
	 * medAC0070010�N���X�̕W���R���X�g���N�^
	 */
	public AC0070010Struct()
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
	public void setStruct(AC0070010Struct struct)
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
	public void setStructM(AC0070010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setODR_STS_NAME(struct.getODR_STS_NAME());
			this.setEXTERNAL_PLAN_DEL_NAME(struct.getEXTERNAL_PLAN_DEL_NAME());
			this.setUNIT_QTY_NAME(struct.getUNIT_QTY_NAME());
			this.setMRP_ODR_NAME(struct.getMRP_ODR_NAME());
			this.setOUTSIDE_NAME(struct.getOUTSIDE_NAME());
			this.setw_PLAN_CD(struct.getw_PLAN_CD());
			this.setw_OUTSIDE_TYP_val(struct.getw_OUTSIDE_TYP_val());
			this.setw_OUTSIDE_TYP_name(struct.getw_OUTSIDE_TYP_name());
			this.setw_MRP_ODR_TYP_val(struct.getw_MRP_ODR_TYP_val());
			this.setw_MRP_ODR_TYP_name(struct.getw_MRP_ODR_TYP_name());
			this.setw_UNIT_QTY_TYP_val(struct.getw_UNIT_QTY_TYP_val());
			this.setw_UNIT_QTY_TYP_name(struct.getw_UNIT_QTY_TYP_name());
			this.setw_ODR_STS_TYP_val(struct.getw_ODR_STS_TYP_val());
			this.setw_ODR_STS_TYP_name(struct.getw_ODR_STS_TYP_name());
			this.setw_EXTERNAL_PLAN_DEL_FLG_val(struct.getw_EXTERNAL_PLAN_DEL_FLG_val());
			this.setw_EXTERNAL_PLAN_DEL_FLG_name(struct.getw_EXTERNAL_PLAN_DEL_FLG_name());
			this.setEXTERNAL_LEVEL_NO(struct.getEXTERNAL_LEVEL_NO());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.setITEM_CD(struct.getITEM_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setODR_START_DATE(struct.getODR_START_DATE());
			this.setPRD_START_DATE(struct.getPRD_START_DATE());
			this.setPRD_DUE_DATE(struct.getPRD_DUE_DATE());
			this.setODR_QTY(struct.getODR_QTY());
			this.setODR_STS_TYP(struct.getODR_STS_TYP());
			this.setEXTERNAL_PLAN_DEL_FLG(struct.getEXTERNAL_PLAN_DEL_FLG());
			this.setDRAW_CD(struct.getDRAW_CD());
			this.setSPEC(struct.getSPEC());
			this.setUNIT_QTY_TYP(struct.getUNIT_QTY_TYP());
			this.setMRP_ODR_TYP(struct.getMRP_ODR_TYP());
			this.setOUTSIDE_TYP(struct.getOUTSIDE_TYP());
			this.setl_COUNT(struct.getl_COUNT());
			this.setROW_COUNT(struct.getROW_COUNT());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AC0070010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_ODR_STS_NAME(struct.getList_ODR_STS_NAME());
			this.setList_EXTERNAL_PLAN_DEL_NAME(struct.getList_EXTERNAL_PLAN_DEL_NAME());
			this.setList_UNIT_QTY_NAME(struct.getList_UNIT_QTY_NAME());
			this.setList_MRP_ODR_NAME(struct.getList_MRP_ODR_NAME());
			this.setList_OUTSIDE_NAME(struct.getList_OUTSIDE_NAME());
			this.setList_w_PLAN_CD(struct.getList_w_PLAN_CD());
			this.setList_w_OUTSIDE_TYP_val(struct.getList_w_OUTSIDE_TYP_val());
			this.setList_w_OUTSIDE_TYP_name(struct.getList_w_OUTSIDE_TYP_name());
			this.setList_w_MRP_ODR_TYP_val(struct.getList_w_MRP_ODR_TYP_val());
			this.setList_w_MRP_ODR_TYP_name(struct.getList_w_MRP_ODR_TYP_name());
			this.setList_w_UNIT_QTY_TYP_val(struct.getList_w_UNIT_QTY_TYP_val());
			this.setList_w_UNIT_QTY_TYP_name(struct.getList_w_UNIT_QTY_TYP_name());
			this.setList_w_ODR_STS_TYP_val(struct.getList_w_ODR_STS_TYP_val());
			this.setList_w_ODR_STS_TYP_name(struct.getList_w_ODR_STS_TYP_name());
			this.setList_w_EXTERNAL_PLAN_DEL_FLG_val(struct.getList_w_EXTERNAL_PLAN_DEL_FLG_val());
			this.setList_w_EXTERNAL_PLAN_DEL_FLG_name(struct.getList_w_EXTERNAL_PLAN_DEL_FLG_name());
			this.setList_EXTERNAL_LEVEL_NO(struct.getList_EXTERNAL_LEVEL_NO());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_ODR_START_DATE(struct.getList_ODR_START_DATE());
			this.setList_PRD_START_DATE(struct.getList_PRD_START_DATE());
			this.setList_PRD_DUE_DATE(struct.getList_PRD_DUE_DATE());
			this.setList_ODR_QTY(struct.getList_ODR_QTY());
			this.setList_ODR_STS_TYP(struct.getList_ODR_STS_TYP());
			this.setList_EXTERNAL_PLAN_DEL_FLG(struct.getList_EXTERNAL_PLAN_DEL_FLG());
			this.setList_DRAW_CD(struct.getList_DRAW_CD());
			this.setList_SPEC(struct.getList_SPEC());
			this.setList_UNIT_QTY_TYP(struct.getList_UNIT_QTY_TYP());
			this.setList_MRP_ODR_TYP(struct.getList_MRP_ODR_TYP());
			this.setList_OUTSIDE_TYP(struct.getList_OUTSIDE_TYP());
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
	// �� 1 �ϐ������l�F i_ODR_STS_NAME


	final static String i_ODR_STS_NAME = null;

	// �� 2 �ϐ������l�F i_EXTERNAL_PLAN_DEL_NAME


	final static String i_EXTERNAL_PLAN_DEL_NAME = null;

	// �� 3 �ϐ������l�F i_UNIT_QTY_NAME


	final static String i_UNIT_QTY_NAME = null;

	// �� 4 �ϐ������l�F i_MRP_ODR_NAME


	final static String i_MRP_ODR_NAME = null;

	// �� 5 �ϐ������l�F i_OUTSIDE_NAME


	final static String i_OUTSIDE_NAME = null;

	// �� 6 �ϐ������l�F i_w_PLAN_CD


	final static String i_w_PLAN_CD = null;

	// �� 7 �ϐ������l�F i_w_OUTSIDE_TYP_val


	final static String i_w_OUTSIDE_TYP_val = null;

	// �� 8 �ϐ������l�F i_w_OUTSIDE_TYP_name


	final static String i_w_OUTSIDE_TYP_name = null;

	// �� 9 �ϐ������l�F i_w_MRP_ODR_TYP_val


	final static String i_w_MRP_ODR_TYP_val = null;

	// �� 10 �ϐ������l�F i_w_MRP_ODR_TYP_name


	final static String i_w_MRP_ODR_TYP_name = null;

	// �� 11 �ϐ������l�F i_w_UNIT_QTY_TYP_val


	final static String i_w_UNIT_QTY_TYP_val = null;

	// �� 12 �ϐ������l�F i_w_UNIT_QTY_TYP_name


	final static String i_w_UNIT_QTY_TYP_name = null;

	// �� 13 �ϐ������l�F i_w_ODR_STS_TYP_val


	final static String i_w_ODR_STS_TYP_val = null;

	// �� 14 �ϐ������l�F i_w_ODR_STS_TYP_name


	final static String i_w_ODR_STS_TYP_name = null;

	// �� 15 �ϐ������l�F i_w_EXTERNAL_PLAN_DEL_FLG_val


	final static String i_w_EXTERNAL_PLAN_DEL_FLG_val = null;

	// �� 16 �ϐ������l�F i_w_EXTERNAL_PLAN_DEL_FLG_name


	final static String i_w_EXTERNAL_PLAN_DEL_FLG_name = null;

	// �� 17 �ϐ������l�F i_EXTERNAL_LEVEL_NO


	final static String i_EXTERNAL_LEVEL_NO = null;

	// �� 18 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 19 �ϐ������l�F i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// �� 20 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 21 �ϐ������l�F i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// �� 22 �ϐ������l�F i_ODR_START_DATE


	final static String i_ODR_START_DATE = null;

	// �� 23 �ϐ������l�F i_PRD_START_DATE


	final static String i_PRD_START_DATE = null;

	// �� 24 �ϐ������l�F i_PRD_DUE_DATE


	final static String i_PRD_DUE_DATE = null;

	// �� 25 �ϐ������l�F i_ODR_QTY


	final static String i_ODR_QTY = null;

	// �� 26 �ϐ������l�F i_ODR_STS_TYP


	final static String i_ODR_STS_TYP = null;

	// �� 27 �ϐ������l�F i_EXTERNAL_PLAN_DEL_FLG


	final static String i_EXTERNAL_PLAN_DEL_FLG = null;

	// �� 28 �ϐ������l�F i_DRAW_CD


	final static String i_DRAW_CD = null;

	// �� 29 �ϐ������l�F i_SPEC


	final static String i_SPEC = null;

	// �� 30 �ϐ������l�F i_UNIT_QTY_TYP


	final static String i_UNIT_QTY_TYP = null;

	// �� 31 �ϐ������l�F i_MRP_ODR_TYP


	final static String i_MRP_ODR_TYP = null;

	// �� 32 �ϐ������l�F i_OUTSIDE_TYP


	final static String i_OUTSIDE_TYP = null;

	// �� 33 �ϐ������l�F i_l_COUNT


	final static String i_l_COUNT = null;

	// �� 34 �ϐ������l�F i_ROW_COUNT


	final static String i_ROW_COUNT = null;

*/

	//{{user_implement_code
        //------------------------------------------------------------------------------
       
        /**	
         * �������ϐ��̃R�s�[	
         * @param s �R�s�[��	
         */	
        public void copy(AC0070010Struct s)	
        {	
         clear();
         if(s.sUser_ID != null) sUser_ID = new String(s.sUser_ID);
         if(s.sSysdate != null) sSysdate = new String(s.sSysdate);
         if(s.m_PLANT_CD != null) m_PLANT_CD = new String(s.m_PLANT_CD);
         if(s.m_PLANT_NAME != null) m_PLANT_NAME = new String(s.m_PLANT_NAME);
         if(s.m_ITEM_CD != null) m_ITEM_CD = new String(s.m_ITEM_CD);
         if(s.m_ITEM_NAME != null) m_ITEM_NAME = new String(s.m_ITEM_NAME);
         if(s.m_ODR_START_DATE != null) m_ODR_START_DATE = new String(s.m_ODR_START_DATE);
         if(s.m_PRD_START_DATE != null) m_PRD_START_DATE = new String(s.m_PRD_START_DATE);
         if(s.m_PRD_DUE_DATE != null) m_PRD_DUE_DATE = new String(s.m_PRD_DUE_DATE);
         if(s.m_ODR_QTY != null) m_ODR_QTY = new String(s.m_ODR_QTY);
         if(s.m_ODR_STS_TYP != null) m_ODR_STS_TYP = new String(s.m_ODR_STS_TYP);
         if(s.m_EXTERNAL_PLAN_DEL_FLG != null) m_EXTERNAL_PLAN_DEL_FLG = new String(s.m_EXTERNAL_PLAN_DEL_FLG);
         if(s.m_DRAW_CD != null) m_DRAW_CD = new String(s.m_DRAW_CD);
         if(s.m_SPEC != null) m_SPEC = new String(s.m_SPEC);
         if(s.m_UNIT_QTY_TYP != null) m_UNIT_QTY_TYP = new String(s.m_UNIT_QTY_TYP);
         if(s.m_MRP_ODR_TYP != null) m_MRP_ODR_TYP = new String(s.m_MRP_ODR_TYP);
         if(s.m_OUTSIDE_TYP != null) m_OUTSIDE_TYP = new String(s.m_OUTSIDE_TYP);
         if(s.m_w_PLAN_CD != null) m_w_PLAN_CD = new String(s.m_w_PLAN_CD);
         if(s.m_w_OUTSIDE_TYP_val != null) m_w_OUTSIDE_TYP_val = new String(s.m_w_OUTSIDE_TYP_val);
         if(s.m_w_OUTSIDE_TYP_name != null) m_w_OUTSIDE_TYP_name = new String(s.m_w_OUTSIDE_TYP_name);
         if(s.m_w_MRP_ODR_TYP_val != null) m_w_MRP_ODR_TYP_val = new String(s.m_w_MRP_ODR_TYP_val);
         if(s.m_w_MRP_ODR_TYP_name != null) m_w_MRP_ODR_TYP_name = new String(s.m_w_MRP_ODR_TYP_name);
         if(s.m_w_UNIT_QTY_TYP_val != null) m_w_UNIT_QTY_TYP_val = new String(s.m_w_UNIT_QTY_TYP_val);
         if(s.m_w_UNIT_QTY_TYP_name != null) m_w_UNIT_QTY_TYP_name = new String(s.m_w_UNIT_QTY_TYP_name);
         if(s.m_w_ODR_STS_TYP_val != null) m_w_ODR_STS_TYP_val = new String(s.m_w_ODR_STS_TYP_val);
         if(s.m_w_ODR_STS_TYP_name != null) m_w_ODR_STS_TYP_name = new String(s.m_w_ODR_STS_TYP_name);
         if(s.m_w_EXTERNAL_PLAN_DEL_FLG_val != null) m_w_EXTERNAL_PLAN_DEL_FLG_val = new String(s.m_w_EXTERNAL_PLAN_DEL_FLG_val);
         if(s.m_w_EXTERNAL_PLAN_DEL_FLG_name != null) m_w_EXTERNAL_PLAN_DEL_FLG_name = new String(s.m_w_EXTERNAL_PLAN_DEL_FLG_name);	}	
       
        /**
         * �R�s�[�R���X�g���N�^
         */
         public AC0070010Struct(AC0070010Struct struct)
         {
          copy(struct);
         }
       
         /**
          * ������
          * �N���A���K��l�ݒ���s���B
          */
         public void initialize()
         {
          clear();
         return;
         }
       
        //------------------------------------------------------------------------------
        //}}user_implement_code

	//////////////////////////////

}
