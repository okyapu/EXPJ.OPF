/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AN0020/src/com/nec/jp/orteus/metamorBase/AN0020/AN0020010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AN0020;

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

public class AN0020010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_CHART_NAME */
	public String m_CHART_NAME = null;
	/** �� 2 �ϐ��F m_CHART_TYP */
	public String m_CHART_TYP = null;
	/** �� 3 �ϐ��F m_DIMENSION_TYP */
	public String m_DIMENSION_TYP = null;
	/** �� 4 �ϐ��F m_MAX_SCALE_RATE */
	public String m_MAX_SCALE_RATE = null;
	/** �� 5 �ϐ��F m_SCALE_STEP */
	public String m_SCALE_STEP = null;
	/** �� 6 �ϐ��F m_HIGH_LOAD */
	public String m_HIGH_LOAD = null;
	/** �� 7 �ϐ��F m_MIDDLE_LOAD */
	public String m_MIDDLE_LOAD = null;
	/** �� 8 �ϐ��F m_LOW_LOAD */
	public String m_LOW_LOAD = null;
	/** �� 9 �ϐ��F m_BACKGROUNDCOLOR_R */
	public String m_BACKGROUNDCOLOR_R = null;
	/** �� 10 �ϐ��F m_BACKGROUNDCOLOR_G */
	public String m_BACKGROUNDCOLOR_G = null;
	/** �� 11 �ϐ��F m_BACKGROUNDCOLOR_B */
	public String m_BACKGROUNDCOLOR_B = null;
	/** �� 12 �ϐ��F m_CHART_COLOR0_R */
	public String m_CHART_COLOR0_R = null;
	/** �� 13 �ϐ��F m_CHART_COLOR0_G */
	public String m_CHART_COLOR0_G = null;
	/** �� 14 �ϐ��F m_CHART_COLOR0_B */
	public String m_CHART_COLOR0_B = null;
	/** �� 15 �ϐ��F m_CHART_COLOR1_R */
	public String m_CHART_COLOR1_R = null;
	/** �� 16 �ϐ��F m_CHART_COLOR1_G */
	public String m_CHART_COLOR1_G = null;
	/** �� 17 �ϐ��F m_CHART_COLOR1_B */
	public String m_CHART_COLOR1_B = null;
	/** �� 18 �ϐ��F m_CHART_COLOR2_R */
	public String m_CHART_COLOR2_R = null;
	/** �� 19 �ϐ��F m_CHART_COLOR2_G */
	public String m_CHART_COLOR2_G = null;
	/** �� 20 �ϐ��F m_CHART_COLOR2_B */
	public String m_CHART_COLOR2_B = null;
	/** �� 21 �ϐ��F m_CHART_COLOR9_R */
	public String m_CHART_COLOR9_R = null;
	/** �� 22 �ϐ��F m_CHART_COLOR9_G */
	public String m_CHART_COLOR9_G = null;
	/** �� 23 �ϐ��F m_CHART_COLOR9_B */
	public String m_CHART_COLOR9_B = null;
	/** �� 24 �ϐ��F m_HIGH_LOAD_COLOR_R */
	public String m_HIGH_LOAD_COLOR_R = null;
	/** �� 25 �ϐ��F m_HIGH_LOAD_COLOR_G */
	public String m_HIGH_LOAD_COLOR_G = null;
	/** �� 26 �ϐ��F m_HIGH_LOAD_COLOR_B */
	public String m_HIGH_LOAD_COLOR_B = null;
	/** �� 27 �ϐ��F m_MIDDLE_LOAD_COLOR_R */
	public String m_MIDDLE_LOAD_COLOR_R = null;
	/** �� 28 �ϐ��F m_MIDDLE_LOAD_COLOR_G */
	public String m_MIDDLE_LOAD_COLOR_G = null;
	/** �� 29 �ϐ��F m_MIDDLE_LOAD_COLOR_B */
	public String m_MIDDLE_LOAD_COLOR_B = null;
	/** �� 30 �ϐ��F m_LOW_LOAD_COLOR_R */
	public String m_LOW_LOAD_COLOR_R = null;
	/** �� 31 �ϐ��F m_LOW_LOAD_COLOR_G */
	public String m_LOW_LOAD_COLOR_G = null;
	/** �� 32 �ϐ��F m_LOW_LOAD_COLOR_B */
	public String m_LOW_LOAD_COLOR_B = null;
	/** �� 33 �ϐ��F m_h_MODIFY_COUNT */
	public String m_h_MODIFY_COUNT = null;
	/** �� 34 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 35 �ϐ��F m_CHART_CD */
	public String m_CHART_CD = null;
	/** �� 36 �ϐ��F m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** �� 37 �ϐ��F m_CHART_TYP_name */
	public String m_CHART_TYP_name = null;
	/** �� 38 �ϐ��F m_CHART_TYP_val */
	public String m_CHART_TYP_val = null;
	/** �� 39 �ϐ��F m_DIMENSION_TYP_name */
	public String m_DIMENSION_TYP_name = null;
	/** �� 40 �ϐ��F m_DIMENSION_TYP_val */
	public String m_DIMENSION_TYP_val = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_CHART_NAME */
	public List l_CHART_NAME = null;

	/** �� 2 List�ϐ��F l_CHART_TYP */
	public List l_CHART_TYP = null;

	/** �� 3 List�ϐ��F l_DIMENSION_TYP */
	public List l_DIMENSION_TYP = null;

	/** �� 4 List�ϐ��F l_MAX_SCALE_RATE */
	public List l_MAX_SCALE_RATE = null;

	/** �� 5 List�ϐ��F l_SCALE_STEP */
	public List l_SCALE_STEP = null;

	/** �� 6 List�ϐ��F l_HIGH_LOAD */
	public List l_HIGH_LOAD = null;

	/** �� 7 List�ϐ��F l_MIDDLE_LOAD */
	public List l_MIDDLE_LOAD = null;

	/** �� 8 List�ϐ��F l_LOW_LOAD */
	public List l_LOW_LOAD = null;

	/** �� 9 List�ϐ��F l_BACKGROUNDCOLOR_R */
	public List l_BACKGROUNDCOLOR_R = null;

	/** �� 10 List�ϐ��F l_BACKGROUNDCOLOR_G */
	public List l_BACKGROUNDCOLOR_G = null;

	/** �� 11 List�ϐ��F l_BACKGROUNDCOLOR_B */
	public List l_BACKGROUNDCOLOR_B = null;

	/** �� 12 List�ϐ��F l_CHART_COLOR0_R */
	public List l_CHART_COLOR0_R = null;

	/** �� 13 List�ϐ��F l_CHART_COLOR0_G */
	public List l_CHART_COLOR0_G = null;

	/** �� 14 List�ϐ��F l_CHART_COLOR0_B */
	public List l_CHART_COLOR0_B = null;

	/** �� 15 List�ϐ��F l_CHART_COLOR1_R */
	public List l_CHART_COLOR1_R = null;

	/** �� 16 List�ϐ��F l_CHART_COLOR1_G */
	public List l_CHART_COLOR1_G = null;

	/** �� 17 List�ϐ��F l_CHART_COLOR1_B */
	public List l_CHART_COLOR1_B = null;

	/** �� 18 List�ϐ��F l_CHART_COLOR2_R */
	public List l_CHART_COLOR2_R = null;

	/** �� 19 List�ϐ��F l_CHART_COLOR2_G */
	public List l_CHART_COLOR2_G = null;

	/** �� 20 List�ϐ��F l_CHART_COLOR2_B */
	public List l_CHART_COLOR2_B = null;

	/** �� 21 List�ϐ��F l_CHART_COLOR9_R */
	public List l_CHART_COLOR9_R = null;

	/** �� 22 List�ϐ��F l_CHART_COLOR9_G */
	public List l_CHART_COLOR9_G = null;

	/** �� 23 List�ϐ��F l_CHART_COLOR9_B */
	public List l_CHART_COLOR9_B = null;

	/** �� 24 List�ϐ��F l_HIGH_LOAD_COLOR_R */
	public List l_HIGH_LOAD_COLOR_R = null;

	/** �� 25 List�ϐ��F l_HIGH_LOAD_COLOR_G */
	public List l_HIGH_LOAD_COLOR_G = null;

	/** �� 26 List�ϐ��F l_HIGH_LOAD_COLOR_B */
	public List l_HIGH_LOAD_COLOR_B = null;

	/** �� 27 List�ϐ��F l_MIDDLE_LOAD_COLOR_R */
	public List l_MIDDLE_LOAD_COLOR_R = null;

	/** �� 28 List�ϐ��F l_MIDDLE_LOAD_COLOR_G */
	public List l_MIDDLE_LOAD_COLOR_G = null;

	/** �� 29 List�ϐ��F l_MIDDLE_LOAD_COLOR_B */
	public List l_MIDDLE_LOAD_COLOR_B = null;

	/** �� 30 List�ϐ��F l_LOW_LOAD_COLOR_R */
	public List l_LOW_LOAD_COLOR_R = null;

	/** �� 31 List�ϐ��F l_LOW_LOAD_COLOR_G */
	public List l_LOW_LOAD_COLOR_G = null;

	/** �� 32 List�ϐ��F l_LOW_LOAD_COLOR_B */
	public List l_LOW_LOAD_COLOR_B = null;

	/** �� 33 List�ϐ��F l_h_MODIFY_COUNT */
	public List l_h_MODIFY_COUNT = null;

	/** �� 34 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 35 List�ϐ��F l_CHART_CD */
	public List l_CHART_CD = null;

	/** �� 36 List�ϐ��F l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** �� 37 List�ϐ��F l_CHART_TYP_name */
	public List l_CHART_TYP_name = null;

	/** �� 38 List�ϐ��F l_CHART_TYP_val */
	public List l_CHART_TYP_val = null;

	/** �� 39 List�ϐ��F l_DIMENSION_TYP_name */
	public List l_DIMENSION_TYP_name = null;

	/** �� 40 List�ϐ��F l_DIMENSION_TYP_val */
	public List l_DIMENSION_TYP_val = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getCHART_NAME() { return m_CHART_NAME; }
	public String getCHART_TYP() { return m_CHART_TYP; }
	public String getDIMENSION_TYP() { return m_DIMENSION_TYP; }
	public String getMAX_SCALE_RATE() { return m_MAX_SCALE_RATE; }
	public String getSCALE_STEP() { return m_SCALE_STEP; }
	public String getHIGH_LOAD() { return m_HIGH_LOAD; }
	public String getMIDDLE_LOAD() { return m_MIDDLE_LOAD; }
	public String getLOW_LOAD() { return m_LOW_LOAD; }
	public String getBACKGROUNDCOLOR_R() { return m_BACKGROUNDCOLOR_R; }
	public String getBACKGROUNDCOLOR_G() { return m_BACKGROUNDCOLOR_G; }
	public String getBACKGROUNDCOLOR_B() { return m_BACKGROUNDCOLOR_B; }
	public String getCHART_COLOR0_R() { return m_CHART_COLOR0_R; }
	public String getCHART_COLOR0_G() { return m_CHART_COLOR0_G; }
	public String getCHART_COLOR0_B() { return m_CHART_COLOR0_B; }
	public String getCHART_COLOR1_R() { return m_CHART_COLOR1_R; }
	public String getCHART_COLOR1_G() { return m_CHART_COLOR1_G; }
	public String getCHART_COLOR1_B() { return m_CHART_COLOR1_B; }
	public String getCHART_COLOR2_R() { return m_CHART_COLOR2_R; }
	public String getCHART_COLOR2_G() { return m_CHART_COLOR2_G; }
	public String getCHART_COLOR2_B() { return m_CHART_COLOR2_B; }
	public String getCHART_COLOR9_R() { return m_CHART_COLOR9_R; }
	public String getCHART_COLOR9_G() { return m_CHART_COLOR9_G; }
	public String getCHART_COLOR9_B() { return m_CHART_COLOR9_B; }
	public String getHIGH_LOAD_COLOR_R() { return m_HIGH_LOAD_COLOR_R; }
	public String getHIGH_LOAD_COLOR_G() { return m_HIGH_LOAD_COLOR_G; }
	public String getHIGH_LOAD_COLOR_B() { return m_HIGH_LOAD_COLOR_B; }
	public String getMIDDLE_LOAD_COLOR_R() { return m_MIDDLE_LOAD_COLOR_R; }
	public String getMIDDLE_LOAD_COLOR_G() { return m_MIDDLE_LOAD_COLOR_G; }
	public String getMIDDLE_LOAD_COLOR_B() { return m_MIDDLE_LOAD_COLOR_B; }
	public String getLOW_LOAD_COLOR_R() { return m_LOW_LOAD_COLOR_R; }
	public String getLOW_LOAD_COLOR_G() { return m_LOW_LOAD_COLOR_G; }
	public String getLOW_LOAD_COLOR_B() { return m_LOW_LOAD_COLOR_B; }
	public String geth_MODIFY_COUNT() { return m_h_MODIFY_COUNT; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getCHART_CD() { return m_CHART_CD; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getCHART_TYP_name() { return m_CHART_TYP_name; }
	public String getCHART_TYP_val() { return m_CHART_TYP_val; }
	public String getDIMENSION_TYP_name() { return m_DIMENSION_TYP_name; }
	public String getDIMENSION_TYP_val() { return m_DIMENSION_TYP_val; }

	public List getList_CHART_NAME() { return l_CHART_NAME; }
	public List getList_CHART_TYP() { return l_CHART_TYP; }
	public List getList_DIMENSION_TYP() { return l_DIMENSION_TYP; }
	public List getList_MAX_SCALE_RATE() { return l_MAX_SCALE_RATE; }
	public List getList_SCALE_STEP() { return l_SCALE_STEP; }
	public List getList_HIGH_LOAD() { return l_HIGH_LOAD; }
	public List getList_MIDDLE_LOAD() { return l_MIDDLE_LOAD; }
	public List getList_LOW_LOAD() { return l_LOW_LOAD; }
	public List getList_BACKGROUNDCOLOR_R() { return l_BACKGROUNDCOLOR_R; }
	public List getList_BACKGROUNDCOLOR_G() { return l_BACKGROUNDCOLOR_G; }
	public List getList_BACKGROUNDCOLOR_B() { return l_BACKGROUNDCOLOR_B; }
	public List getList_CHART_COLOR0_R() { return l_CHART_COLOR0_R; }
	public List getList_CHART_COLOR0_G() { return l_CHART_COLOR0_G; }
	public List getList_CHART_COLOR0_B() { return l_CHART_COLOR0_B; }
	public List getList_CHART_COLOR1_R() { return l_CHART_COLOR1_R; }
	public List getList_CHART_COLOR1_G() { return l_CHART_COLOR1_G; }
	public List getList_CHART_COLOR1_B() { return l_CHART_COLOR1_B; }
	public List getList_CHART_COLOR2_R() { return l_CHART_COLOR2_R; }
	public List getList_CHART_COLOR2_G() { return l_CHART_COLOR2_G; }
	public List getList_CHART_COLOR2_B() { return l_CHART_COLOR2_B; }
	public List getList_CHART_COLOR9_R() { return l_CHART_COLOR9_R; }
	public List getList_CHART_COLOR9_G() { return l_CHART_COLOR9_G; }
	public List getList_CHART_COLOR9_B() { return l_CHART_COLOR9_B; }
	public List getList_HIGH_LOAD_COLOR_R() { return l_HIGH_LOAD_COLOR_R; }
	public List getList_HIGH_LOAD_COLOR_G() { return l_HIGH_LOAD_COLOR_G; }
	public List getList_HIGH_LOAD_COLOR_B() { return l_HIGH_LOAD_COLOR_B; }
	public List getList_MIDDLE_LOAD_COLOR_R() { return l_MIDDLE_LOAD_COLOR_R; }
	public List getList_MIDDLE_LOAD_COLOR_G() { return l_MIDDLE_LOAD_COLOR_G; }
	public List getList_MIDDLE_LOAD_COLOR_B() { return l_MIDDLE_LOAD_COLOR_B; }
	public List getList_LOW_LOAD_COLOR_R() { return l_LOW_LOAD_COLOR_R; }
	public List getList_LOW_LOAD_COLOR_G() { return l_LOW_LOAD_COLOR_G; }
	public List getList_LOW_LOAD_COLOR_B() { return l_LOW_LOAD_COLOR_B; }
	public List getList_h_MODIFY_COUNT() { return l_h_MODIFY_COUNT; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_CHART_CD() { return l_CHART_CD; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_CHART_TYP_name() { return l_CHART_TYP_name; }
	public List getList_CHART_TYP_val() { return l_CHART_TYP_val; }
	public List getList_DIMENSION_TYP_name() { return l_DIMENSION_TYP_name; }
	public List getList_DIMENSION_TYP_val() { return l_DIMENSION_TYP_val; }

	public void setCHART_NAME(String val) { m_CHART_NAME = val; }
	public void setCHART_TYP(String val) { m_CHART_TYP = val; }
	public void setDIMENSION_TYP(String val) { m_DIMENSION_TYP = val; }
	public void setMAX_SCALE_RATE(String val) { m_MAX_SCALE_RATE = val; }
	public void setSCALE_STEP(String val) { m_SCALE_STEP = val; }
	public void setHIGH_LOAD(String val) { m_HIGH_LOAD = val; }
	public void setMIDDLE_LOAD(String val) { m_MIDDLE_LOAD = val; }
	public void setLOW_LOAD(String val) { m_LOW_LOAD = val; }
	public void setBACKGROUNDCOLOR_R(String val) { m_BACKGROUNDCOLOR_R = val; }
	public void setBACKGROUNDCOLOR_G(String val) { m_BACKGROUNDCOLOR_G = val; }
	public void setBACKGROUNDCOLOR_B(String val) { m_BACKGROUNDCOLOR_B = val; }
	public void setCHART_COLOR0_R(String val) { m_CHART_COLOR0_R = val; }
	public void setCHART_COLOR0_G(String val) { m_CHART_COLOR0_G = val; }
	public void setCHART_COLOR0_B(String val) { m_CHART_COLOR0_B = val; }
	public void setCHART_COLOR1_R(String val) { m_CHART_COLOR1_R = val; }
	public void setCHART_COLOR1_G(String val) { m_CHART_COLOR1_G = val; }
	public void setCHART_COLOR1_B(String val) { m_CHART_COLOR1_B = val; }
	public void setCHART_COLOR2_R(String val) { m_CHART_COLOR2_R = val; }
	public void setCHART_COLOR2_G(String val) { m_CHART_COLOR2_G = val; }
	public void setCHART_COLOR2_B(String val) { m_CHART_COLOR2_B = val; }
	public void setCHART_COLOR9_R(String val) { m_CHART_COLOR9_R = val; }
	public void setCHART_COLOR9_G(String val) { m_CHART_COLOR9_G = val; }
	public void setCHART_COLOR9_B(String val) { m_CHART_COLOR9_B = val; }
	public void setHIGH_LOAD_COLOR_R(String val) { m_HIGH_LOAD_COLOR_R = val; }
	public void setHIGH_LOAD_COLOR_G(String val) { m_HIGH_LOAD_COLOR_G = val; }
	public void setHIGH_LOAD_COLOR_B(String val) { m_HIGH_LOAD_COLOR_B = val; }
	public void setMIDDLE_LOAD_COLOR_R(String val) { m_MIDDLE_LOAD_COLOR_R = val; }
	public void setMIDDLE_LOAD_COLOR_G(String val) { m_MIDDLE_LOAD_COLOR_G = val; }
	public void setMIDDLE_LOAD_COLOR_B(String val) { m_MIDDLE_LOAD_COLOR_B = val; }
	public void setLOW_LOAD_COLOR_R(String val) { m_LOW_LOAD_COLOR_R = val; }
	public void setLOW_LOAD_COLOR_G(String val) { m_LOW_LOAD_COLOR_G = val; }
	public void setLOW_LOAD_COLOR_B(String val) { m_LOW_LOAD_COLOR_B = val; }
	public void seth_MODIFY_COUNT(String val) { m_h_MODIFY_COUNT = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setCHART_CD(String val) { m_CHART_CD = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setCHART_TYP_name(String val) { m_CHART_TYP_name = val; }
	public void setCHART_TYP_val(String val) { m_CHART_TYP_val = val; }
	public void setDIMENSION_TYP_name(String val) { m_DIMENSION_TYP_name = val; }
	public void setDIMENSION_TYP_val(String val) { m_DIMENSION_TYP_val = val; }


	public void setList_CHART_NAME(List list) { l_CHART_NAME = list; }
	public void setList_CHART_TYP(List list) { l_CHART_TYP = list; }
	public void setList_DIMENSION_TYP(List list) { l_DIMENSION_TYP = list; }
	public void setList_MAX_SCALE_RATE(List list) { l_MAX_SCALE_RATE = list; }
	public void setList_SCALE_STEP(List list) { l_SCALE_STEP = list; }
	public void setList_HIGH_LOAD(List list) { l_HIGH_LOAD = list; }
	public void setList_MIDDLE_LOAD(List list) { l_MIDDLE_LOAD = list; }
	public void setList_LOW_LOAD(List list) { l_LOW_LOAD = list; }
	public void setList_BACKGROUNDCOLOR_R(List list) { l_BACKGROUNDCOLOR_R = list; }
	public void setList_BACKGROUNDCOLOR_G(List list) { l_BACKGROUNDCOLOR_G = list; }
	public void setList_BACKGROUNDCOLOR_B(List list) { l_BACKGROUNDCOLOR_B = list; }
	public void setList_CHART_COLOR0_R(List list) { l_CHART_COLOR0_R = list; }
	public void setList_CHART_COLOR0_G(List list) { l_CHART_COLOR0_G = list; }
	public void setList_CHART_COLOR0_B(List list) { l_CHART_COLOR0_B = list; }
	public void setList_CHART_COLOR1_R(List list) { l_CHART_COLOR1_R = list; }
	public void setList_CHART_COLOR1_G(List list) { l_CHART_COLOR1_G = list; }
	public void setList_CHART_COLOR1_B(List list) { l_CHART_COLOR1_B = list; }
	public void setList_CHART_COLOR2_R(List list) { l_CHART_COLOR2_R = list; }
	public void setList_CHART_COLOR2_G(List list) { l_CHART_COLOR2_G = list; }
	public void setList_CHART_COLOR2_B(List list) { l_CHART_COLOR2_B = list; }
	public void setList_CHART_COLOR9_R(List list) { l_CHART_COLOR9_R = list; }
	public void setList_CHART_COLOR9_G(List list) { l_CHART_COLOR9_G = list; }
	public void setList_CHART_COLOR9_B(List list) { l_CHART_COLOR9_B = list; }
	public void setList_HIGH_LOAD_COLOR_R(List list) { l_HIGH_LOAD_COLOR_R = list; }
	public void setList_HIGH_LOAD_COLOR_G(List list) { l_HIGH_LOAD_COLOR_G = list; }
	public void setList_HIGH_LOAD_COLOR_B(List list) { l_HIGH_LOAD_COLOR_B = list; }
	public void setList_MIDDLE_LOAD_COLOR_R(List list) { l_MIDDLE_LOAD_COLOR_R = list; }
	public void setList_MIDDLE_LOAD_COLOR_G(List list) { l_MIDDLE_LOAD_COLOR_G = list; }
	public void setList_MIDDLE_LOAD_COLOR_B(List list) { l_MIDDLE_LOAD_COLOR_B = list; }
	public void setList_LOW_LOAD_COLOR_R(List list) { l_LOW_LOAD_COLOR_R = list; }
	public void setList_LOW_LOAD_COLOR_G(List list) { l_LOW_LOAD_COLOR_G = list; }
	public void setList_LOW_LOAD_COLOR_B(List list) { l_LOW_LOAD_COLOR_B = list; }
	public void setList_h_MODIFY_COUNT(List list) { l_h_MODIFY_COUNT = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_CHART_CD(List list) { l_CHART_CD = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_CHART_TYP_name(List list) { l_CHART_TYP_name = list; }
	public void setList_CHART_TYP_val(List list) { l_CHART_TYP_val = list; }
	public void setList_DIMENSION_TYP_name(List list) { l_DIMENSION_TYP_name = list; }
	public void setList_DIMENSION_TYP_val(List list) { l_DIMENSION_TYP_val = list; }

	public int setL2L_CHART_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CHART_NAME == null) {
			l_CHART_NAME = new ArrayList();
		} else {
			l_CHART_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CHART_NAME.add(((AN0020010Struct) list.get(i)).getCHART_NAME());
		}
		return size;
	}
	public int setL2L_CHART_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CHART_TYP == null) {
			l_CHART_TYP = new ArrayList();
		} else {
			l_CHART_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CHART_TYP.add(((AN0020010Struct) list.get(i)).getCHART_TYP());
		}
		return size;
	}
	public int setL2L_DIMENSION_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DIMENSION_TYP == null) {
			l_DIMENSION_TYP = new ArrayList();
		} else {
			l_DIMENSION_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DIMENSION_TYP.add(((AN0020010Struct) list.get(i)).getDIMENSION_TYP());
		}
		return size;
	}
	public int setL2L_MAX_SCALE_RATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MAX_SCALE_RATE == null) {
			l_MAX_SCALE_RATE = new ArrayList();
		} else {
			l_MAX_SCALE_RATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MAX_SCALE_RATE.add(((AN0020010Struct) list.get(i)).getMAX_SCALE_RATE());
		}
		return size;
	}
	public int setL2L_SCALE_STEP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SCALE_STEP == null) {
			l_SCALE_STEP = new ArrayList();
		} else {
			l_SCALE_STEP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SCALE_STEP.add(((AN0020010Struct) list.get(i)).getSCALE_STEP());
		}
		return size;
	}
	public int setL2L_HIGH_LOAD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HIGH_LOAD == null) {
			l_HIGH_LOAD = new ArrayList();
		} else {
			l_HIGH_LOAD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HIGH_LOAD.add(((AN0020010Struct) list.get(i)).getHIGH_LOAD());
		}
		return size;
	}
	public int setL2L_MIDDLE_LOAD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MIDDLE_LOAD == null) {
			l_MIDDLE_LOAD = new ArrayList();
		} else {
			l_MIDDLE_LOAD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MIDDLE_LOAD.add(((AN0020010Struct) list.get(i)).getMIDDLE_LOAD());
		}
		return size;
	}
	public int setL2L_LOW_LOAD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOW_LOAD == null) {
			l_LOW_LOAD = new ArrayList();
		} else {
			l_LOW_LOAD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOW_LOAD.add(((AN0020010Struct) list.get(i)).getLOW_LOAD());
		}
		return size;
	}
	public int setL2L_BACKGROUNDCOLOR_R(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BACKGROUNDCOLOR_R == null) {
			l_BACKGROUNDCOLOR_R = new ArrayList();
		} else {
			l_BACKGROUNDCOLOR_R.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BACKGROUNDCOLOR_R.add(((AN0020010Struct) list.get(i)).getBACKGROUNDCOLOR_R());
		}
		return size;
	}
	public int setL2L_BACKGROUNDCOLOR_G(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BACKGROUNDCOLOR_G == null) {
			l_BACKGROUNDCOLOR_G = new ArrayList();
		} else {
			l_BACKGROUNDCOLOR_G.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BACKGROUNDCOLOR_G.add(((AN0020010Struct) list.get(i)).getBACKGROUNDCOLOR_G());
		}
		return size;
	}
	public int setL2L_BACKGROUNDCOLOR_B(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BACKGROUNDCOLOR_B == null) {
			l_BACKGROUNDCOLOR_B = new ArrayList();
		} else {
			l_BACKGROUNDCOLOR_B.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BACKGROUNDCOLOR_B.add(((AN0020010Struct) list.get(i)).getBACKGROUNDCOLOR_B());
		}
		return size;
	}
	public int setL2L_CHART_COLOR0_R(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CHART_COLOR0_R == null) {
			l_CHART_COLOR0_R = new ArrayList();
		} else {
			l_CHART_COLOR0_R.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CHART_COLOR0_R.add(((AN0020010Struct) list.get(i)).getCHART_COLOR0_R());
		}
		return size;
	}
	public int setL2L_CHART_COLOR0_G(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CHART_COLOR0_G == null) {
			l_CHART_COLOR0_G = new ArrayList();
		} else {
			l_CHART_COLOR0_G.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CHART_COLOR0_G.add(((AN0020010Struct) list.get(i)).getCHART_COLOR0_G());
		}
		return size;
	}
	public int setL2L_CHART_COLOR0_B(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CHART_COLOR0_B == null) {
			l_CHART_COLOR0_B = new ArrayList();
		} else {
			l_CHART_COLOR0_B.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CHART_COLOR0_B.add(((AN0020010Struct) list.get(i)).getCHART_COLOR0_B());
		}
		return size;
	}
	public int setL2L_CHART_COLOR1_R(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CHART_COLOR1_R == null) {
			l_CHART_COLOR1_R = new ArrayList();
		} else {
			l_CHART_COLOR1_R.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CHART_COLOR1_R.add(((AN0020010Struct) list.get(i)).getCHART_COLOR1_R());
		}
		return size;
	}
	public int setL2L_CHART_COLOR1_G(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CHART_COLOR1_G == null) {
			l_CHART_COLOR1_G = new ArrayList();
		} else {
			l_CHART_COLOR1_G.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CHART_COLOR1_G.add(((AN0020010Struct) list.get(i)).getCHART_COLOR1_G());
		}
		return size;
	}
	public int setL2L_CHART_COLOR1_B(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CHART_COLOR1_B == null) {
			l_CHART_COLOR1_B = new ArrayList();
		} else {
			l_CHART_COLOR1_B.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CHART_COLOR1_B.add(((AN0020010Struct) list.get(i)).getCHART_COLOR1_B());
		}
		return size;
	}
	public int setL2L_CHART_COLOR2_R(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CHART_COLOR2_R == null) {
			l_CHART_COLOR2_R = new ArrayList();
		} else {
			l_CHART_COLOR2_R.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CHART_COLOR2_R.add(((AN0020010Struct) list.get(i)).getCHART_COLOR2_R());
		}
		return size;
	}
	public int setL2L_CHART_COLOR2_G(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CHART_COLOR2_G == null) {
			l_CHART_COLOR2_G = new ArrayList();
		} else {
			l_CHART_COLOR2_G.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CHART_COLOR2_G.add(((AN0020010Struct) list.get(i)).getCHART_COLOR2_G());
		}
		return size;
	}
	public int setL2L_CHART_COLOR2_B(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CHART_COLOR2_B == null) {
			l_CHART_COLOR2_B = new ArrayList();
		} else {
			l_CHART_COLOR2_B.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CHART_COLOR2_B.add(((AN0020010Struct) list.get(i)).getCHART_COLOR2_B());
		}
		return size;
	}
	public int setL2L_CHART_COLOR9_R(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CHART_COLOR9_R == null) {
			l_CHART_COLOR9_R = new ArrayList();
		} else {
			l_CHART_COLOR9_R.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CHART_COLOR9_R.add(((AN0020010Struct) list.get(i)).getCHART_COLOR9_R());
		}
		return size;
	}
	public int setL2L_CHART_COLOR9_G(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CHART_COLOR9_G == null) {
			l_CHART_COLOR9_G = new ArrayList();
		} else {
			l_CHART_COLOR9_G.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CHART_COLOR9_G.add(((AN0020010Struct) list.get(i)).getCHART_COLOR9_G());
		}
		return size;
	}
	public int setL2L_CHART_COLOR9_B(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CHART_COLOR9_B == null) {
			l_CHART_COLOR9_B = new ArrayList();
		} else {
			l_CHART_COLOR9_B.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CHART_COLOR9_B.add(((AN0020010Struct) list.get(i)).getCHART_COLOR9_B());
		}
		return size;
	}
	public int setL2L_HIGH_LOAD_COLOR_R(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HIGH_LOAD_COLOR_R == null) {
			l_HIGH_LOAD_COLOR_R = new ArrayList();
		} else {
			l_HIGH_LOAD_COLOR_R.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HIGH_LOAD_COLOR_R.add(((AN0020010Struct) list.get(i)).getHIGH_LOAD_COLOR_R());
		}
		return size;
	}
	public int setL2L_HIGH_LOAD_COLOR_G(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HIGH_LOAD_COLOR_G == null) {
			l_HIGH_LOAD_COLOR_G = new ArrayList();
		} else {
			l_HIGH_LOAD_COLOR_G.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HIGH_LOAD_COLOR_G.add(((AN0020010Struct) list.get(i)).getHIGH_LOAD_COLOR_G());
		}
		return size;
	}
	public int setL2L_HIGH_LOAD_COLOR_B(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HIGH_LOAD_COLOR_B == null) {
			l_HIGH_LOAD_COLOR_B = new ArrayList();
		} else {
			l_HIGH_LOAD_COLOR_B.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HIGH_LOAD_COLOR_B.add(((AN0020010Struct) list.get(i)).getHIGH_LOAD_COLOR_B());
		}
		return size;
	}
	public int setL2L_MIDDLE_LOAD_COLOR_R(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MIDDLE_LOAD_COLOR_R == null) {
			l_MIDDLE_LOAD_COLOR_R = new ArrayList();
		} else {
			l_MIDDLE_LOAD_COLOR_R.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MIDDLE_LOAD_COLOR_R.add(((AN0020010Struct) list.get(i)).getMIDDLE_LOAD_COLOR_R());
		}
		return size;
	}
	public int setL2L_MIDDLE_LOAD_COLOR_G(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MIDDLE_LOAD_COLOR_G == null) {
			l_MIDDLE_LOAD_COLOR_G = new ArrayList();
		} else {
			l_MIDDLE_LOAD_COLOR_G.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MIDDLE_LOAD_COLOR_G.add(((AN0020010Struct) list.get(i)).getMIDDLE_LOAD_COLOR_G());
		}
		return size;
	}
	public int setL2L_MIDDLE_LOAD_COLOR_B(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MIDDLE_LOAD_COLOR_B == null) {
			l_MIDDLE_LOAD_COLOR_B = new ArrayList();
		} else {
			l_MIDDLE_LOAD_COLOR_B.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MIDDLE_LOAD_COLOR_B.add(((AN0020010Struct) list.get(i)).getMIDDLE_LOAD_COLOR_B());
		}
		return size;
	}
	public int setL2L_LOW_LOAD_COLOR_R(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOW_LOAD_COLOR_R == null) {
			l_LOW_LOAD_COLOR_R = new ArrayList();
		} else {
			l_LOW_LOAD_COLOR_R.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOW_LOAD_COLOR_R.add(((AN0020010Struct) list.get(i)).getLOW_LOAD_COLOR_R());
		}
		return size;
	}
	public int setL2L_LOW_LOAD_COLOR_G(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOW_LOAD_COLOR_G == null) {
			l_LOW_LOAD_COLOR_G = new ArrayList();
		} else {
			l_LOW_LOAD_COLOR_G.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOW_LOAD_COLOR_G.add(((AN0020010Struct) list.get(i)).getLOW_LOAD_COLOR_G());
		}
		return size;
	}
	public int setL2L_LOW_LOAD_COLOR_B(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOW_LOAD_COLOR_B == null) {
			l_LOW_LOAD_COLOR_B = new ArrayList();
		} else {
			l_LOW_LOAD_COLOR_B.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOW_LOAD_COLOR_B.add(((AN0020010Struct) list.get(i)).getLOW_LOAD_COLOR_B());
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
			l_h_MODIFY_COUNT.add(((AN0020010Struct) list.get(i)).geth_MODIFY_COUNT());
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
			l_PLANT_CD.add(((AN0020010Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_CHART_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CHART_CD == null) {
			l_CHART_CD = new ArrayList();
		} else {
			l_CHART_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CHART_CD.add(((AN0020010Struct) list.get(i)).getCHART_CD());
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
			l_PLANT_NAME.add(((AN0020010Struct) list.get(i)).getPLANT_NAME());
		}
		return size;
	}
	public int setL2L_CHART_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CHART_TYP_name == null) {
			l_CHART_TYP_name = new ArrayList();
		} else {
			l_CHART_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CHART_TYP_name.add(((AN0020010Struct) list.get(i)).getCHART_TYP_name());
		}
		return size;
	}
	public int setL2L_CHART_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CHART_TYP_val == null) {
			l_CHART_TYP_val = new ArrayList();
		} else {
			l_CHART_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CHART_TYP_val.add(((AN0020010Struct) list.get(i)).getCHART_TYP_val());
		}
		return size;
	}
	public int setL2L_DIMENSION_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DIMENSION_TYP_name == null) {
			l_DIMENSION_TYP_name = new ArrayList();
		} else {
			l_DIMENSION_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DIMENSION_TYP_name.add(((AN0020010Struct) list.get(i)).getDIMENSION_TYP_name());
		}
		return size;
	}
	public int setL2L_DIMENSION_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DIMENSION_TYP_val == null) {
			l_DIMENSION_TYP_val = new ArrayList();
		} else {
			l_DIMENSION_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DIMENSION_TYP_val.add(((AN0020010Struct) list.get(i)).getDIMENSION_TYP_val());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_CHART_NAME = null;
		m_CHART_TYP = null;
		m_DIMENSION_TYP = null;
		m_MAX_SCALE_RATE = null;
		m_SCALE_STEP = null;
		m_HIGH_LOAD = null;
		m_MIDDLE_LOAD = null;
		m_LOW_LOAD = null;
		m_BACKGROUNDCOLOR_R = null;
		m_BACKGROUNDCOLOR_G = null;
		m_BACKGROUNDCOLOR_B = null;
		m_CHART_COLOR0_R = null;
		m_CHART_COLOR0_G = null;
		m_CHART_COLOR0_B = null;
		m_CHART_COLOR1_R = null;
		m_CHART_COLOR1_G = null;
		m_CHART_COLOR1_B = null;
		m_CHART_COLOR2_R = null;
		m_CHART_COLOR2_G = null;
		m_CHART_COLOR2_B = null;
		m_CHART_COLOR9_R = null;
		m_CHART_COLOR9_G = null;
		m_CHART_COLOR9_B = null;
		m_HIGH_LOAD_COLOR_R = null;
		m_HIGH_LOAD_COLOR_G = null;
		m_HIGH_LOAD_COLOR_B = null;
		m_MIDDLE_LOAD_COLOR_R = null;
		m_MIDDLE_LOAD_COLOR_G = null;
		m_MIDDLE_LOAD_COLOR_B = null;
		m_LOW_LOAD_COLOR_R = null;
		m_LOW_LOAD_COLOR_G = null;
		m_LOW_LOAD_COLOR_B = null;
		m_h_MODIFY_COUNT = null;
		m_PLANT_CD = null;
		m_CHART_CD = null;
		m_PLANT_NAME = null;
		m_CHART_TYP_name = null;
		m_CHART_TYP_val = null;
		m_DIMENSION_TYP_name = null;
		m_DIMENSION_TYP_val = null;

		l_CHART_NAME = null;
		l_CHART_TYP = null;
		l_DIMENSION_TYP = null;
		l_MAX_SCALE_RATE = null;
		l_SCALE_STEP = null;
		l_HIGH_LOAD = null;
		l_MIDDLE_LOAD = null;
		l_LOW_LOAD = null;
		l_BACKGROUNDCOLOR_R = null;
		l_BACKGROUNDCOLOR_G = null;
		l_BACKGROUNDCOLOR_B = null;
		l_CHART_COLOR0_R = null;
		l_CHART_COLOR0_G = null;
		l_CHART_COLOR0_B = null;
		l_CHART_COLOR1_R = null;
		l_CHART_COLOR1_G = null;
		l_CHART_COLOR1_B = null;
		l_CHART_COLOR2_R = null;
		l_CHART_COLOR2_G = null;
		l_CHART_COLOR2_B = null;
		l_CHART_COLOR9_R = null;
		l_CHART_COLOR9_G = null;
		l_CHART_COLOR9_B = null;
		l_HIGH_LOAD_COLOR_R = null;
		l_HIGH_LOAD_COLOR_G = null;
		l_HIGH_LOAD_COLOR_B = null;
		l_MIDDLE_LOAD_COLOR_R = null;
		l_MIDDLE_LOAD_COLOR_G = null;
		l_MIDDLE_LOAD_COLOR_B = null;
		l_LOW_LOAD_COLOR_R = null;
		l_LOW_LOAD_COLOR_G = null;
		l_LOW_LOAD_COLOR_B = null;
		l_h_MODIFY_COUNT = null;
		l_PLANT_CD = null;
		l_CHART_CD = null;
		l_PLANT_NAME = null;
		l_CHART_TYP_name = null;
		l_CHART_TYP_val = null;
		l_DIMENSION_TYP_name = null;
		l_DIMENSION_TYP_val = null;

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
	 * medAN0020010�N���X�̕W���R���X�g���N�^
	 */
	public AN0020010Struct()
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
	public void setStruct(AN0020010Struct struct)
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
	public void setStructM(AN0020010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setCHART_NAME(struct.getCHART_NAME());
			this.setCHART_TYP(struct.getCHART_TYP());
			this.setDIMENSION_TYP(struct.getDIMENSION_TYP());
			this.setMAX_SCALE_RATE(struct.getMAX_SCALE_RATE());
			this.setSCALE_STEP(struct.getSCALE_STEP());
			this.setHIGH_LOAD(struct.getHIGH_LOAD());
			this.setMIDDLE_LOAD(struct.getMIDDLE_LOAD());
			this.setLOW_LOAD(struct.getLOW_LOAD());
			this.setBACKGROUNDCOLOR_R(struct.getBACKGROUNDCOLOR_R());
			this.setBACKGROUNDCOLOR_G(struct.getBACKGROUNDCOLOR_G());
			this.setBACKGROUNDCOLOR_B(struct.getBACKGROUNDCOLOR_B());
			this.setCHART_COLOR0_R(struct.getCHART_COLOR0_R());
			this.setCHART_COLOR0_G(struct.getCHART_COLOR0_G());
			this.setCHART_COLOR0_B(struct.getCHART_COLOR0_B());
			this.setCHART_COLOR1_R(struct.getCHART_COLOR1_R());
			this.setCHART_COLOR1_G(struct.getCHART_COLOR1_G());
			this.setCHART_COLOR1_B(struct.getCHART_COLOR1_B());
			this.setCHART_COLOR2_R(struct.getCHART_COLOR2_R());
			this.setCHART_COLOR2_G(struct.getCHART_COLOR2_G());
			this.setCHART_COLOR2_B(struct.getCHART_COLOR2_B());
			this.setCHART_COLOR9_R(struct.getCHART_COLOR9_R());
			this.setCHART_COLOR9_G(struct.getCHART_COLOR9_G());
			this.setCHART_COLOR9_B(struct.getCHART_COLOR9_B());
			this.setHIGH_LOAD_COLOR_R(struct.getHIGH_LOAD_COLOR_R());
			this.setHIGH_LOAD_COLOR_G(struct.getHIGH_LOAD_COLOR_G());
			this.setHIGH_LOAD_COLOR_B(struct.getHIGH_LOAD_COLOR_B());
			this.setMIDDLE_LOAD_COLOR_R(struct.getMIDDLE_LOAD_COLOR_R());
			this.setMIDDLE_LOAD_COLOR_G(struct.getMIDDLE_LOAD_COLOR_G());
			this.setMIDDLE_LOAD_COLOR_B(struct.getMIDDLE_LOAD_COLOR_B());
			this.setLOW_LOAD_COLOR_R(struct.getLOW_LOAD_COLOR_R());
			this.setLOW_LOAD_COLOR_G(struct.getLOW_LOAD_COLOR_G());
			this.setLOW_LOAD_COLOR_B(struct.getLOW_LOAD_COLOR_B());
			this.seth_MODIFY_COUNT(struct.geth_MODIFY_COUNT());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setCHART_CD(struct.getCHART_CD());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.setCHART_TYP_name(struct.getCHART_TYP_name());
			this.setCHART_TYP_val(struct.getCHART_TYP_val());
			this.setDIMENSION_TYP_name(struct.getDIMENSION_TYP_name());
			this.setDIMENSION_TYP_val(struct.getDIMENSION_TYP_val());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AN0020010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_CHART_NAME(struct.getList_CHART_NAME());
			this.setList_CHART_TYP(struct.getList_CHART_TYP());
			this.setList_DIMENSION_TYP(struct.getList_DIMENSION_TYP());
			this.setList_MAX_SCALE_RATE(struct.getList_MAX_SCALE_RATE());
			this.setList_SCALE_STEP(struct.getList_SCALE_STEP());
			this.setList_HIGH_LOAD(struct.getList_HIGH_LOAD());
			this.setList_MIDDLE_LOAD(struct.getList_MIDDLE_LOAD());
			this.setList_LOW_LOAD(struct.getList_LOW_LOAD());
			this.setList_BACKGROUNDCOLOR_R(struct.getList_BACKGROUNDCOLOR_R());
			this.setList_BACKGROUNDCOLOR_G(struct.getList_BACKGROUNDCOLOR_G());
			this.setList_BACKGROUNDCOLOR_B(struct.getList_BACKGROUNDCOLOR_B());
			this.setList_CHART_COLOR0_R(struct.getList_CHART_COLOR0_R());
			this.setList_CHART_COLOR0_G(struct.getList_CHART_COLOR0_G());
			this.setList_CHART_COLOR0_B(struct.getList_CHART_COLOR0_B());
			this.setList_CHART_COLOR1_R(struct.getList_CHART_COLOR1_R());
			this.setList_CHART_COLOR1_G(struct.getList_CHART_COLOR1_G());
			this.setList_CHART_COLOR1_B(struct.getList_CHART_COLOR1_B());
			this.setList_CHART_COLOR2_R(struct.getList_CHART_COLOR2_R());
			this.setList_CHART_COLOR2_G(struct.getList_CHART_COLOR2_G());
			this.setList_CHART_COLOR2_B(struct.getList_CHART_COLOR2_B());
			this.setList_CHART_COLOR9_R(struct.getList_CHART_COLOR9_R());
			this.setList_CHART_COLOR9_G(struct.getList_CHART_COLOR9_G());
			this.setList_CHART_COLOR9_B(struct.getList_CHART_COLOR9_B());
			this.setList_HIGH_LOAD_COLOR_R(struct.getList_HIGH_LOAD_COLOR_R());
			this.setList_HIGH_LOAD_COLOR_G(struct.getList_HIGH_LOAD_COLOR_G());
			this.setList_HIGH_LOAD_COLOR_B(struct.getList_HIGH_LOAD_COLOR_B());
			this.setList_MIDDLE_LOAD_COLOR_R(struct.getList_MIDDLE_LOAD_COLOR_R());
			this.setList_MIDDLE_LOAD_COLOR_G(struct.getList_MIDDLE_LOAD_COLOR_G());
			this.setList_MIDDLE_LOAD_COLOR_B(struct.getList_MIDDLE_LOAD_COLOR_B());
			this.setList_LOW_LOAD_COLOR_R(struct.getList_LOW_LOAD_COLOR_R());
			this.setList_LOW_LOAD_COLOR_G(struct.getList_LOW_LOAD_COLOR_G());
			this.setList_LOW_LOAD_COLOR_B(struct.getList_LOW_LOAD_COLOR_B());
			this.setList_h_MODIFY_COUNT(struct.getList_h_MODIFY_COUNT());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_CHART_CD(struct.getList_CHART_CD());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_CHART_TYP_name(struct.getList_CHART_TYP_name());
			this.setList_CHART_TYP_val(struct.getList_CHART_TYP_val());
			this.setList_DIMENSION_TYP_name(struct.getList_DIMENSION_TYP_name());
			this.setList_DIMENSION_TYP_val(struct.getList_DIMENSION_TYP_val());
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
	// �� 1 �ϐ������l�F i_CHART_NAME


	final static String i_CHART_NAME = null;

	// �� 2 �ϐ������l�F i_CHART_TYP


	final static String i_CHART_TYP = null;

	// �� 3 �ϐ������l�F i_DIMENSION_TYP


	final static String i_DIMENSION_TYP = null;

	// �� 4 �ϐ������l�F i_MAX_SCALE_RATE


	final static String i_MAX_SCALE_RATE = null;

	// �� 5 �ϐ������l�F i_SCALE_STEP


	final static String i_SCALE_STEP = null;

	// �� 6 �ϐ������l�F i_HIGH_LOAD


	final static String i_HIGH_LOAD = null;

	// �� 7 �ϐ������l�F i_MIDDLE_LOAD


	final static String i_MIDDLE_LOAD = null;

	// �� 8 �ϐ������l�F i_LOW_LOAD


	final static String i_LOW_LOAD = null;

	// �� 9 �ϐ������l�F i_BACKGROUNDCOLOR_R


	final static String i_BACKGROUNDCOLOR_R = null;

	// �� 10 �ϐ������l�F i_BACKGROUNDCOLOR_G


	final static String i_BACKGROUNDCOLOR_G = null;

	// �� 11 �ϐ������l�F i_BACKGROUNDCOLOR_B


	final static String i_BACKGROUNDCOLOR_B = null;

	// �� 12 �ϐ������l�F i_CHART_COLOR0_R


	final static String i_CHART_COLOR0_R = null;

	// �� 13 �ϐ������l�F i_CHART_COLOR0_G


	final static String i_CHART_COLOR0_G = null;

	// �� 14 �ϐ������l�F i_CHART_COLOR0_B


	final static String i_CHART_COLOR0_B = null;

	// �� 15 �ϐ������l�F i_CHART_COLOR1_R


	final static String i_CHART_COLOR1_R = null;

	// �� 16 �ϐ������l�F i_CHART_COLOR1_G


	final static String i_CHART_COLOR1_G = null;

	// �� 17 �ϐ������l�F i_CHART_COLOR1_B


	final static String i_CHART_COLOR1_B = null;

	// �� 18 �ϐ������l�F i_CHART_COLOR2_R


	final static String i_CHART_COLOR2_R = null;

	// �� 19 �ϐ������l�F i_CHART_COLOR2_G


	final static String i_CHART_COLOR2_G = null;

	// �� 20 �ϐ������l�F i_CHART_COLOR2_B


	final static String i_CHART_COLOR2_B = null;

	// �� 21 �ϐ������l�F i_CHART_COLOR9_R


	final static String i_CHART_COLOR9_R = null;

	// �� 22 �ϐ������l�F i_CHART_COLOR9_G


	final static String i_CHART_COLOR9_G = null;

	// �� 23 �ϐ������l�F i_CHART_COLOR9_B


	final static String i_CHART_COLOR9_B = null;

	// �� 24 �ϐ������l�F i_HIGH_LOAD_COLOR_R


	final static String i_HIGH_LOAD_COLOR_R = null;

	// �� 25 �ϐ������l�F i_HIGH_LOAD_COLOR_G


	final static String i_HIGH_LOAD_COLOR_G = null;

	// �� 26 �ϐ������l�F i_HIGH_LOAD_COLOR_B


	final static String i_HIGH_LOAD_COLOR_B = null;

	// �� 27 �ϐ������l�F i_MIDDLE_LOAD_COLOR_R


	final static String i_MIDDLE_LOAD_COLOR_R = null;

	// �� 28 �ϐ������l�F i_MIDDLE_LOAD_COLOR_G


	final static String i_MIDDLE_LOAD_COLOR_G = null;

	// �� 29 �ϐ������l�F i_MIDDLE_LOAD_COLOR_B


	final static String i_MIDDLE_LOAD_COLOR_B = null;

	// �� 30 �ϐ������l�F i_LOW_LOAD_COLOR_R


	final static String i_LOW_LOAD_COLOR_R = null;

	// �� 31 �ϐ������l�F i_LOW_LOAD_COLOR_G


	final static String i_LOW_LOAD_COLOR_G = null;

	// �� 32 �ϐ������l�F i_LOW_LOAD_COLOR_B


	final static String i_LOW_LOAD_COLOR_B = null;

	// �� 33 �ϐ������l�F i_h_MODIFY_COUNT


	final static String i_h_MODIFY_COUNT = null;

	// �� 34 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 35 �ϐ������l�F i_CHART_CD


	final static String i_CHART_CD = null;

	// �� 36 �ϐ������l�F i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// �� 37 �ϐ������l�F i_CHART_TYP_name


	final static String i_CHART_TYP_name = null;

	// �� 38 �ϐ������l�F i_CHART_TYP_val


	final static String i_CHART_TYP_val = null;

	// �� 39 �ϐ������l�F i_DIMENSION_TYP_name


	final static String i_DIMENSION_TYP_name = null;

	// �� 40 �ϐ������l�F i_DIMENSION_TYP_val


	final static String i_DIMENSION_TYP_val = null;

*/

	//{{user_implement_code
       
        // �� 1 �ϐ������l�F i_PLANT_CD
        final static String i_PLANT_CD = null;
        // �� 2 �ϐ������l�F i_CHART_CD
        final static String i_CHART_CD = null;
        // �� 3 �ϐ������l�F i_CHART_NAME
        final static String i_CHART_NAME = null;
        // �� 4 �ϐ������l�F i_CHART_TYP
        final static String i_CHART_TYP = null;
        // �� 5 �ϐ������l�F i_DIMENSION_TYP
        final static String i_DIMENSION_TYP = null;
        // �� 6 �ϐ������l�F i_MAX_SCALE_RATE
        final static String i_MAX_SCALE_RATE = null;
        // �� 7 �ϐ������l�F i_SCALE_STEP
        final static String i_SCALE_STEP = null;
        // �� 8 �ϐ������l�F i_HIGH_LOAD
        final static String i_HIGH_LOAD = null;
        // �� 9 �ϐ������l�F i_MIDDLE_LOAD
        final static String i_MIDDLE_LOAD = null;
        // �� 10 �ϐ������l�F i_LOW_LOAD
        final static String i_LOW_LOAD = null;
        // �� 11 �ϐ������l�F i_BACKGROUNDCOLOR_R
        final static String i_BACKGROUNDCOLOR_R = null;
        // �� 12 �ϐ������l�F i_BACKGROUNDCOLOR_G
        final static String i_BACKGROUNDCOLOR_G = null;
        // �� 13 �ϐ������l�F i_BACKGROUNDCOLOR_B
        final static String i_BACKGROUNDCOLOR_B = null;
        // �� 14 �ϐ������l�F i_CHART_COLOR0_R
        final static String i_CHART_COLOR0_R = null;
        // �� 15 �ϐ������l�F i_CHART_COLOR0_G
        final static String i_CHART_COLOR0_G = null;
        // �� 16 �ϐ������l�F i_CHART_COLOR0_B
        final static String i_CHART_COLOR0_B = null;
        // �� 17 �ϐ������l�F i_CHART_COLOR1_R
        final static String i_CHART_COLOR1_R = null;
        // �� 18 �ϐ������l�F i_CHART_COLOR1_G
        final static String i_CHART_COLOR1_G = null;
        // �� 19 �ϐ������l�F i_CHART_COLOR1_B
        final static String i_CHART_COLOR1_B = null;
        // �� 20 �ϐ������l�F i_CHART_COLOR2_R
        final static String i_CHART_COLOR2_R = null;
        // �� 21 �ϐ������l�F i_CHART_COLOR2_G
        final static String i_CHART_COLOR2_G = null;
        // �� 22 �ϐ������l�F i_CHART_COLOR2_B
        final static String i_CHART_COLOR2_B = null;
        // �� 23 �ϐ������l�F i_CHART_COLOR9_R
        final static String i_CHART_COLOR9_R = null;
        // �� 24 �ϐ������l�F i_CHART_COLOR9_G
        final static String i_CHART_COLOR9_G = null;
        // �� 25 �ϐ������l�F i_CHART_COLOR9_B
        final static String i_CHART_COLOR9_B = null;
        // �� 26 �ϐ������l�F i_HIGH_LOAD_COLOR_R
        final static String i_HIGH_LOAD_COLOR_R = null;
        // �� 27 �ϐ������l�F i_HIGH_LOAD_COLOR_G
        final static String i_HIGH_LOAD_COLOR_G = null;
        // �� 28 �ϐ������l�F i_HIGH_LOAD_COLOR_B
        final static String i_HIGH_LOAD_COLOR_B = null;
        // �� 29 �ϐ������l�F i_MIDDLE_LOAD_COLOR_R
        final static String i_MIDDLE_LOAD_COLOR_R = null;
        // �� 30 �ϐ������l�F i_MIDDLE_LOAD_COLOR_G
        final static String i_MIDDLE_LOAD_COLOR_G = null;
        // �� 31 �ϐ������l�F i_MIDDLE_LOAD_COLOR_B
        final static String i_MIDDLE_LOAD_COLOR_B = null;
        // �� 32 �ϐ������l�F i_LOW_LOAD_COLOR_R
        final static String i_LOW_LOAD_COLOR_R = null;
        // �� 33 �ϐ������l�F i_LOW_LOAD_COLOR_G
        final static String i_LOW_LOAD_COLOR_G = null;
        // �� 34 �ϐ������l�F i_LOW_LOAD_COLOR_B
        final static String i_LOW_LOAD_COLOR_B = null;
        // �� 35 �ϐ������l�F i_PLANT_NAME
        final static String i_PLANT_NAME = null;
       
        /**
         * ������
         *
         */
        public void initialize()
        {
         m_PLANT_CD = i_PLANT_CD;
         m_CHART_CD = i_CHART_CD;
         m_CHART_NAME = i_CHART_NAME;
         m_CHART_TYP = i_CHART_TYP;
         m_DIMENSION_TYP = i_DIMENSION_TYP;
         m_MAX_SCALE_RATE = i_MAX_SCALE_RATE;
         m_SCALE_STEP = i_SCALE_STEP;
         m_HIGH_LOAD = i_HIGH_LOAD;
         m_MIDDLE_LOAD = i_MIDDLE_LOAD;
         m_LOW_LOAD = i_LOW_LOAD;
         m_BACKGROUNDCOLOR_R = i_BACKGROUNDCOLOR_R;
         m_BACKGROUNDCOLOR_G = i_BACKGROUNDCOLOR_G;
         m_BACKGROUNDCOLOR_B = i_BACKGROUNDCOLOR_B;
         m_CHART_COLOR0_R = i_CHART_COLOR0_R;
         m_CHART_COLOR0_G = i_CHART_COLOR0_G;
         m_CHART_COLOR0_B = i_CHART_COLOR0_B;
         m_CHART_COLOR1_R = i_CHART_COLOR1_R;
         m_CHART_COLOR1_G = i_CHART_COLOR1_G;
         m_CHART_COLOR1_B = i_CHART_COLOR1_B;
         m_CHART_COLOR2_R = i_CHART_COLOR2_R;
         m_CHART_COLOR2_G = i_CHART_COLOR2_G;
         m_CHART_COLOR2_B = i_CHART_COLOR2_B;
         m_CHART_COLOR9_R = i_CHART_COLOR9_R;
         m_CHART_COLOR9_G = i_CHART_COLOR9_G;
         m_CHART_COLOR9_B = i_CHART_COLOR9_B;
         m_HIGH_LOAD_COLOR_R = i_HIGH_LOAD_COLOR_R;
         m_HIGH_LOAD_COLOR_G = i_HIGH_LOAD_COLOR_G;
         m_HIGH_LOAD_COLOR_B = i_HIGH_LOAD_COLOR_B;
         m_MIDDLE_LOAD_COLOR_R = i_MIDDLE_LOAD_COLOR_R;
         m_MIDDLE_LOAD_COLOR_G = i_MIDDLE_LOAD_COLOR_G;
         m_MIDDLE_LOAD_COLOR_B = i_MIDDLE_LOAD_COLOR_B;
         m_LOW_LOAD_COLOR_R = i_LOW_LOAD_COLOR_R;
         m_LOW_LOAD_COLOR_G = i_LOW_LOAD_COLOR_G;
         m_LOW_LOAD_COLOR_B = i_LOW_LOAD_COLOR_B;
         m_PLANT_NAME = i_PLANT_NAME;
       
         l_PLANT_CD = null;
         l_CHART_CD = null;
         l_CHART_NAME = null;
         l_CHART_TYP = null;
         l_DIMENSION_TYP = null;
         l_MAX_SCALE_RATE = null;
         l_SCALE_STEP = null;
         l_HIGH_LOAD = null;
         l_MIDDLE_LOAD = null;
         l_LOW_LOAD = null;
         l_BACKGROUNDCOLOR_R = null;
         l_BACKGROUNDCOLOR_G = null;
         l_BACKGROUNDCOLOR_B = null;
         l_CHART_COLOR0_R = null;
         l_CHART_COLOR0_G = null;
         l_CHART_COLOR0_B = null;
         l_CHART_COLOR1_R = null;
         l_CHART_COLOR1_G = null;
         l_CHART_COLOR1_B = null;
         l_CHART_COLOR2_R = null;
         l_CHART_COLOR2_G = null;
         l_CHART_COLOR2_B = null;
         l_CHART_COLOR9_R = null;
         l_CHART_COLOR9_G = null;
         l_CHART_COLOR9_B = null;
         l_HIGH_LOAD_COLOR_R = null;
         l_HIGH_LOAD_COLOR_G = null;
         l_HIGH_LOAD_COLOR_B = null;
         l_MIDDLE_LOAD_COLOR_R = null;
         l_MIDDLE_LOAD_COLOR_G = null;
         l_MIDDLE_LOAD_COLOR_B = null;
         l_LOW_LOAD_COLOR_R = null;
         l_LOW_LOAD_COLOR_G = null;
         l_LOW_LOAD_COLOR_B = null;
         l_PLANT_NAME = null;
        }
       
        /**
         * Struct�̕ҏW�̈�̕���
         * @param fromStruct �R�s�[��Struct
         */
        public void copyStructEditArea(AN0020010Struct fromStruct)
        {
         setCHART_NAME(fromStruct.getCHART_NAME());
         setCHART_TYP(fromStruct.getCHART_TYP());
         setDIMENSION_TYP(fromStruct.getDIMENSION_TYP());
         setMAX_SCALE_RATE(fromStruct.getMAX_SCALE_RATE());
         setSCALE_STEP(fromStruct.getSCALE_STEP());
         setHIGH_LOAD(fromStruct.getHIGH_LOAD());
         setMIDDLE_LOAD(fromStruct.getMIDDLE_LOAD());
         setLOW_LOAD(fromStruct.getLOW_LOAD());
         setBACKGROUNDCOLOR_R(fromStruct.getBACKGROUNDCOLOR_R());
         setBACKGROUNDCOLOR_G(fromStruct.getBACKGROUNDCOLOR_G());
         setBACKGROUNDCOLOR_B(fromStruct.getBACKGROUNDCOLOR_B());
         setCHART_COLOR0_R(fromStruct.getCHART_COLOR0_R());
         setCHART_COLOR0_G(fromStruct.getCHART_COLOR0_G());
         setCHART_COLOR0_B(fromStruct.getCHART_COLOR0_B());
         setCHART_COLOR1_R(fromStruct.getCHART_COLOR1_R());
         setCHART_COLOR1_G(fromStruct.getCHART_COLOR1_G());
         setCHART_COLOR1_B(fromStruct.getCHART_COLOR1_B());
         setCHART_COLOR2_R(fromStruct.getCHART_COLOR2_R());
         setCHART_COLOR2_G(fromStruct.getCHART_COLOR2_G());
         setCHART_COLOR2_B(fromStruct.getCHART_COLOR2_B());
         setCHART_COLOR9_R(fromStruct.getCHART_COLOR9_R());
         setCHART_COLOR9_G(fromStruct.getCHART_COLOR9_G());
         setCHART_COLOR9_B(fromStruct.getCHART_COLOR9_B());
         setHIGH_LOAD_COLOR_R(fromStruct.getHIGH_LOAD_COLOR_R());
         setHIGH_LOAD_COLOR_G(fromStruct.getHIGH_LOAD_COLOR_G());
         setHIGH_LOAD_COLOR_B(fromStruct.getHIGH_LOAD_COLOR_B());
         setMIDDLE_LOAD_COLOR_R(fromStruct.getMIDDLE_LOAD_COLOR_R());
         setMIDDLE_LOAD_COLOR_G(fromStruct.getMIDDLE_LOAD_COLOR_G());
         setMIDDLE_LOAD_COLOR_B(fromStruct.getMIDDLE_LOAD_COLOR_B());
         setLOW_LOAD_COLOR_R(fromStruct.getLOW_LOAD_COLOR_R());
         setLOW_LOAD_COLOR_G(fromStruct.getLOW_LOAD_COLOR_G());
         setLOW_LOAD_COLOR_B(fromStruct.getLOW_LOAD_COLOR_B());
         seth_MODIFY_COUNT(fromStruct.geth_MODIFY_COUNT());
        }
       
        //}}user_implement_code

	//////////////////////////////

}
