/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0020/src/com/nec/jp/orteus/metamorBase/AA0020/AA0020010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0020;

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

public class AA0020010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_w_TARGET_DATE */
	public String m_w_TARGET_DATE = null;
	/** �� 2 �ϐ��F m_s_DEVELOP_TYP */
	public Integer m_s_DEVELOP_TYP = null;
	/** �� 3 �ϐ��F m_s_DEVELOP_TYP_name */
	public String m_s_DEVELOP_TYP_name = null;
	/** �� 4 �ϐ��F m_s_DEVELOP_TYP_val */
	public String m_s_DEVELOP_TYP_val = null;
	/** �� 5 �ϐ��F m_w_LEVEL */
	public String m_w_LEVEL = null;
	/** �� 6 �ϐ��F m_NO */
	public Integer m_NO = null;
	/** �� 7 �ϐ��F m_s_CONS_TYP_name */
	public String m_s_CONS_TYP_name = null;
	/** �� 8 �ϐ��F m_s_CONS_TYP_val */
	public String m_s_CONS_TYP_val = null;
	/** �� 9 �ϐ��F m_s_COST_UP_TYP_name */
	public String m_s_COST_UP_TYP_name = null;
	/** �� 10 �ϐ��F m_s_COST_UP_TYP_val */
	public String m_s_COST_UP_TYP_val = null;
	/** �� 11 �ϐ��F m_s_MRP_EXP_TYP_name */
	public String m_s_MRP_EXP_TYP_name = null;
	/** �� 12 �ϐ��F m_s_MRP_EXP_TYP_val */
	public String m_s_MRP_EXP_TYP_val = null;
	/** �� 13 �ϐ��F m_s_CONS_NAME */
	public String m_s_CONS_NAME = null;
	/** �� 14 �ϐ��F m_PS_LT_NAME */
	public String m_PS_LT_NAME = null;
	/** �� 15 �ϐ��F m_COST_UP_NAME */
	public String m_COST_UP_NAME = null;
	/** �� 16 �ϐ��F m_MRP_EXP_NAME */
	public String m_MRP_EXP_NAME = null;
	/** �� 17 �ϐ��F m_PS_LT_CHECK */
	public String m_PS_LT_CHECK = null;
	/** �� 18 �ϐ��F m_COMP_MANHOUR_NAME */
	public String m_COMP_MANHOUR_NAME = null;
	/** �� 19 �ϐ��F m_PARENT_ITEM_CD */
	public String m_PARENT_ITEM_CD = null;
	/** �� 20 �ϐ��F m_COMP_ITEM_CD */
	public String m_COMP_ITEM_CD = null;
	/** �� 21 �ϐ��F m_PS_EDITION */
	public String m_PS_EDITION = null;
	/** �� 22 �ϐ��F m_PS_UNIT_DENOMINATOR */
	public String m_PS_UNIT_DENOMINATOR = null;
	/** �� 23 �ϐ��F m_PS_UNIT_NUMERATOR */
	public String m_PS_UNIT_NUMERATOR = null;
	/** �� 24 �ϐ��F m_EFF_PHASE_IN_DATE */
	public String m_EFF_PHASE_IN_DATE = null;
	/** �� 25 �ϐ��F m_EFF_PHASE_OUT_DATE */
	public String m_EFF_PHASE_OUT_DATE = null;
	/** �� 26 �ϐ��F m_PS_SPOIL */
	public String m_PS_SPOIL = null;
	/** �� 27 �ϐ��F m_s_CONS_TYP */
	public Integer m_s_CONS_TYP = null;
	/** �� 28 �ϐ��F m_PS_LT_FLG */
	public Integer m_PS_LT_FLG = null;
	/** �� 29 �ϐ��F m_PS_FIXED_LT */
	public String m_PS_FIXED_LT = null;
	/** �� 30 �ϐ��F m_PS_PROP_LT */
	public String m_PS_PROP_LT = null;
	/** �� 31 �ϐ��F m_PS_PROP_LOT_SIZE */
	public String m_PS_PROP_LOT_SIZE = null;
	/** �� 32 �ϐ��F m_PS_REF_NO */
	public String m_PS_REF_NO = null;
	/** �� 33 �ϐ��F m_s_COST_UP_TYP */
	public Integer m_s_COST_UP_TYP = null;
	/** �� 34 �ϐ��F m_s_MRP_EXP_TYP */
	public Integer m_s_MRP_EXP_TYP = null;
	/** �� 35 �ϐ��F m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** �� 36 �ϐ��F m_PARENT_ITEM_NAME */
	public String m_PARENT_ITEM_NAME = null;
	/** �� 37 �ϐ��F m_COMP_ITEM_NAME */
	public String m_COMP_ITEM_NAME = null;
	/** �� 38 �ϐ��F m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** �� 39 �ϐ��F m_COMP_MANHOUR_TYP */
	public String m_COMP_MANHOUR_TYP = null;
	/** �� 40 �ϐ��F m_SEQ_NO */
	public Long m_SEQ_NO = null;
	/** �� 41 �ϐ��F m_ACCESS_TYP */
	public Integer m_ACCESS_TYP = null;
	/** �� 42 �ϐ��F m_CMPLT_FLG */
	public Integer m_CMPLT_FLG = null;
	/** �� 43 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 44 �ϐ��F m_MRP_ODR_TYP */
	public Integer m_MRP_ODR_TYP = null;
	/** �� 45 �ϐ��F m_w_TARGET_ITEM_CD */
	public String m_w_TARGET_ITEM_CD = null;
	/** �� 46 �ϐ��F m_P_VALUE */
	public String m_P_VALUE = null;
	/** �� 47 �ϐ��F m_P_NAME */
	public String m_P_NAME = null;
	/** �� 48 �ϐ��F m_P_PLANT_CD */
	public String m_P_PLANT_CD = null;
	/** �� 49 �ϐ��F m_P_USER_CD */
	public String m_P_USER_CD = null;
	/** �� 50 �ϐ��F m_P_BUSINESS_DATE */
	public String m_P_BUSINESS_DATE = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_w_TARGET_DATE */
	public List l_w_TARGET_DATE = null;

	/** �� 2 List�ϐ��F l_s_DEVELOP_TYP */
	public List l_s_DEVELOP_TYP = null;

	/** �� 3 List�ϐ��F l_s_DEVELOP_TYP_name */
	public List l_s_DEVELOP_TYP_name = null;

	/** �� 4 List�ϐ��F l_s_DEVELOP_TYP_val */
	public List l_s_DEVELOP_TYP_val = null;

	/** �� 5 List�ϐ��F l_w_LEVEL */
	public List l_w_LEVEL = null;

	/** �� 6 List�ϐ��F l_NO */
	public List l_NO = null;

	/** �� 7 List�ϐ��F l_s_CONS_TYP_name */
	public List l_s_CONS_TYP_name = null;

	/** �� 8 List�ϐ��F l_s_CONS_TYP_val */
	public List l_s_CONS_TYP_val = null;

	/** �� 9 List�ϐ��F l_s_COST_UP_TYP_name */
	public List l_s_COST_UP_TYP_name = null;

	/** �� 10 List�ϐ��F l_s_COST_UP_TYP_val */
	public List l_s_COST_UP_TYP_val = null;

	/** �� 11 List�ϐ��F l_s_MRP_EXP_TYP_name */
	public List l_s_MRP_EXP_TYP_name = null;

	/** �� 12 List�ϐ��F l_s_MRP_EXP_TYP_val */
	public List l_s_MRP_EXP_TYP_val = null;

	/** �� 13 List�ϐ��F l_s_CONS_NAME */
	public List l_s_CONS_NAME = null;

	/** �� 14 List�ϐ��F l_PS_LT_NAME */
	public List l_PS_LT_NAME = null;

	/** �� 15 List�ϐ��F l_COST_UP_NAME */
	public List l_COST_UP_NAME = null;

	/** �� 16 List�ϐ��F l_MRP_EXP_NAME */
	public List l_MRP_EXP_NAME = null;

	/** �� 17 List�ϐ��F l_PS_LT_CHECK */
	public List l_PS_LT_CHECK = null;

	/** �� 18 List�ϐ��F l_COMP_MANHOUR_NAME */
	public List l_COMP_MANHOUR_NAME = null;

	/** �� 19 List�ϐ��F l_PARENT_ITEM_CD */
	public List l_PARENT_ITEM_CD = null;

	/** �� 20 List�ϐ��F l_COMP_ITEM_CD */
	public List l_COMP_ITEM_CD = null;

	/** �� 21 List�ϐ��F l_PS_EDITION */
	public List l_PS_EDITION = null;

	/** �� 22 List�ϐ��F l_PS_UNIT_DENOMINATOR */
	public List l_PS_UNIT_DENOMINATOR = null;

	/** �� 23 List�ϐ��F l_PS_UNIT_NUMERATOR */
	public List l_PS_UNIT_NUMERATOR = null;

	/** �� 24 List�ϐ��F l_EFF_PHASE_IN_DATE */
	public List l_EFF_PHASE_IN_DATE = null;

	/** �� 25 List�ϐ��F l_EFF_PHASE_OUT_DATE */
	public List l_EFF_PHASE_OUT_DATE = null;

	/** �� 26 List�ϐ��F l_PS_SPOIL */
	public List l_PS_SPOIL = null;

	/** �� 27 List�ϐ��F l_s_CONS_TYP */
	public List l_s_CONS_TYP = null;

	/** �� 28 List�ϐ��F l_PS_LT_FLG */
	public List l_PS_LT_FLG = null;

	/** �� 29 List�ϐ��F l_PS_FIXED_LT */
	public List l_PS_FIXED_LT = null;

	/** �� 30 List�ϐ��F l_PS_PROP_LT */
	public List l_PS_PROP_LT = null;

	/** �� 31 List�ϐ��F l_PS_PROP_LOT_SIZE */
	public List l_PS_PROP_LOT_SIZE = null;

	/** �� 32 List�ϐ��F l_PS_REF_NO */
	public List l_PS_REF_NO = null;

	/** �� 33 List�ϐ��F l_s_COST_UP_TYP */
	public List l_s_COST_UP_TYP = null;

	/** �� 34 List�ϐ��F l_s_MRP_EXP_TYP */
	public List l_s_MRP_EXP_TYP = null;

	/** �� 35 List�ϐ��F l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** �� 36 List�ϐ��F l_PARENT_ITEM_NAME */
	public List l_PARENT_ITEM_NAME = null;

	/** �� 37 List�ϐ��F l_COMP_ITEM_NAME */
	public List l_COMP_ITEM_NAME = null;

	/** �� 38 List�ϐ��F l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** �� 39 List�ϐ��F l_COMP_MANHOUR_TYP */
	public List l_COMP_MANHOUR_TYP = null;

	/** �� 40 List�ϐ��F l_SEQ_NO */
	public List l_SEQ_NO = null;

	/** �� 41 List�ϐ��F l_ACCESS_TYP */
	public List l_ACCESS_TYP = null;

	/** �� 42 List�ϐ��F l_CMPLT_FLG */
	public List l_CMPLT_FLG = null;

	/** �� 43 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 44 List�ϐ��F l_MRP_ODR_TYP */
	public List l_MRP_ODR_TYP = null;

	/** �� 45 List�ϐ��F l_w_TARGET_ITEM_CD */
	public List l_w_TARGET_ITEM_CD = null;

	/** �� 46 List�ϐ��F l_P_VALUE */
	public List l_P_VALUE = null;

	/** �� 47 List�ϐ��F l_P_NAME */
	public List l_P_NAME = null;

	/** �� 48 List�ϐ��F l_P_PLANT_CD */
	public List l_P_PLANT_CD = null;

	/** �� 49 List�ϐ��F l_P_USER_CD */
	public List l_P_USER_CD = null;

	/** �� 50 List�ϐ��F l_P_BUSINESS_DATE */
	public List l_P_BUSINESS_DATE = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getw_TARGET_DATE() { return m_w_TARGET_DATE; }
	public Integer gets_DEVELOP_TYP() { return m_s_DEVELOP_TYP; }
	public String gets_DEVELOP_TYP_name() { return m_s_DEVELOP_TYP_name; }
	public String gets_DEVELOP_TYP_val() { return m_s_DEVELOP_TYP_val; }
	public String getw_LEVEL() { return m_w_LEVEL; }
	public Integer getNO() { return m_NO; }
	public String gets_CONS_TYP_name() { return m_s_CONS_TYP_name; }
	public String gets_CONS_TYP_val() { return m_s_CONS_TYP_val; }
	public String gets_COST_UP_TYP_name() { return m_s_COST_UP_TYP_name; }
	public String gets_COST_UP_TYP_val() { return m_s_COST_UP_TYP_val; }
	public String gets_MRP_EXP_TYP_name() { return m_s_MRP_EXP_TYP_name; }
	public String gets_MRP_EXP_TYP_val() { return m_s_MRP_EXP_TYP_val; }
	public String gets_CONS_NAME() { return m_s_CONS_NAME; }
	public String getPS_LT_NAME() { return m_PS_LT_NAME; }
	public String getCOST_UP_NAME() { return m_COST_UP_NAME; }
	public String getMRP_EXP_NAME() { return m_MRP_EXP_NAME; }
	public String getPS_LT_CHECK() { return m_PS_LT_CHECK; }
	public String getCOMP_MANHOUR_NAME() { return m_COMP_MANHOUR_NAME; }
	public String getPARENT_ITEM_CD() { return m_PARENT_ITEM_CD; }
	public String getCOMP_ITEM_CD() { return m_COMP_ITEM_CD; }
	public String getPS_EDITION() { return m_PS_EDITION; }
	public String getPS_UNIT_DENOMINATOR() { return m_PS_UNIT_DENOMINATOR; }
	public String getPS_UNIT_NUMERATOR() { return m_PS_UNIT_NUMERATOR; }
	public String getEFF_PHASE_IN_DATE() { return m_EFF_PHASE_IN_DATE; }
	public String getEFF_PHASE_OUT_DATE() { return m_EFF_PHASE_OUT_DATE; }
	public String getPS_SPOIL() { return m_PS_SPOIL; }
	public Integer gets_CONS_TYP() { return m_s_CONS_TYP; }
	public Integer getPS_LT_FLG() { return m_PS_LT_FLG; }
	public String getPS_FIXED_LT() { return m_PS_FIXED_LT; }
	public String getPS_PROP_LT() { return m_PS_PROP_LT; }
	public String getPS_PROP_LOT_SIZE() { return m_PS_PROP_LOT_SIZE; }
	public String getPS_REF_NO() { return m_PS_REF_NO; }
	public Integer gets_COST_UP_TYP() { return m_s_COST_UP_TYP; }
	public Integer gets_MRP_EXP_TYP() { return m_s_MRP_EXP_TYP; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getPARENT_ITEM_NAME() { return m_PARENT_ITEM_NAME; }
	public String getCOMP_ITEM_NAME() { return m_COMP_ITEM_NAME; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getCOMP_MANHOUR_TYP() { return m_COMP_MANHOUR_TYP; }
	public Long getSEQ_NO() { return m_SEQ_NO; }
	public Integer getACCESS_TYP() { return m_ACCESS_TYP; }
	public Integer getCMPLT_FLG() { return m_CMPLT_FLG; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public Integer getMRP_ODR_TYP() { return m_MRP_ODR_TYP; }
	public String getw_TARGET_ITEM_CD() { return m_w_TARGET_ITEM_CD; }
	public String getP_VALUE() { return m_P_VALUE; }
	public String getP_NAME() { return m_P_NAME; }
	public String getP_PLANT_CD() { return m_P_PLANT_CD; }
	public String getP_USER_CD() { return m_P_USER_CD; }
	public String getP_BUSINESS_DATE() { return m_P_BUSINESS_DATE; }

	public List getList_w_TARGET_DATE() { return l_w_TARGET_DATE; }
	public List getList_s_DEVELOP_TYP() { return l_s_DEVELOP_TYP; }
	public List getList_s_DEVELOP_TYP_name() { return l_s_DEVELOP_TYP_name; }
	public List getList_s_DEVELOP_TYP_val() { return l_s_DEVELOP_TYP_val; }
	public List getList_w_LEVEL() { return l_w_LEVEL; }
	public List getList_NO() { return l_NO; }
	public List getList_s_CONS_TYP_name() { return l_s_CONS_TYP_name; }
	public List getList_s_CONS_TYP_val() { return l_s_CONS_TYP_val; }
	public List getList_s_COST_UP_TYP_name() { return l_s_COST_UP_TYP_name; }
	public List getList_s_COST_UP_TYP_val() { return l_s_COST_UP_TYP_val; }
	public List getList_s_MRP_EXP_TYP_name() { return l_s_MRP_EXP_TYP_name; }
	public List getList_s_MRP_EXP_TYP_val() { return l_s_MRP_EXP_TYP_val; }
	public List getList_s_CONS_NAME() { return l_s_CONS_NAME; }
	public List getList_PS_LT_NAME() { return l_PS_LT_NAME; }
	public List getList_COST_UP_NAME() { return l_COST_UP_NAME; }
	public List getList_MRP_EXP_NAME() { return l_MRP_EXP_NAME; }
	public List getList_PS_LT_CHECK() { return l_PS_LT_CHECK; }
	public List getList_COMP_MANHOUR_NAME() { return l_COMP_MANHOUR_NAME; }
	public List getList_PARENT_ITEM_CD() { return l_PARENT_ITEM_CD; }
	public List getList_COMP_ITEM_CD() { return l_COMP_ITEM_CD; }
	public List getList_PS_EDITION() { return l_PS_EDITION; }
	public List getList_PS_UNIT_DENOMINATOR() { return l_PS_UNIT_DENOMINATOR; }
	public List getList_PS_UNIT_NUMERATOR() { return l_PS_UNIT_NUMERATOR; }
	public List getList_EFF_PHASE_IN_DATE() { return l_EFF_PHASE_IN_DATE; }
	public List getList_EFF_PHASE_OUT_DATE() { return l_EFF_PHASE_OUT_DATE; }
	public List getList_PS_SPOIL() { return l_PS_SPOIL; }
	public List getList_s_CONS_TYP() { return l_s_CONS_TYP; }
	public List getList_PS_LT_FLG() { return l_PS_LT_FLG; }
	public List getList_PS_FIXED_LT() { return l_PS_FIXED_LT; }
	public List getList_PS_PROP_LT() { return l_PS_PROP_LT; }
	public List getList_PS_PROP_LOT_SIZE() { return l_PS_PROP_LOT_SIZE; }
	public List getList_PS_REF_NO() { return l_PS_REF_NO; }
	public List getList_s_COST_UP_TYP() { return l_s_COST_UP_TYP; }
	public List getList_s_MRP_EXP_TYP() { return l_s_MRP_EXP_TYP; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_PARENT_ITEM_NAME() { return l_PARENT_ITEM_NAME; }
	public List getList_COMP_ITEM_NAME() { return l_COMP_ITEM_NAME; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_COMP_MANHOUR_TYP() { return l_COMP_MANHOUR_TYP; }
	public List getList_SEQ_NO() { return l_SEQ_NO; }
	public List getList_ACCESS_TYP() { return l_ACCESS_TYP; }
	public List getList_CMPLT_FLG() { return l_CMPLT_FLG; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_MRP_ODR_TYP() { return l_MRP_ODR_TYP; }
	public List getList_w_TARGET_ITEM_CD() { return l_w_TARGET_ITEM_CD; }
	public List getList_P_VALUE() { return l_P_VALUE; }
	public List getList_P_NAME() { return l_P_NAME; }
	public List getList_P_PLANT_CD() { return l_P_PLANT_CD; }
	public List getList_P_USER_CD() { return l_P_USER_CD; }
	public List getList_P_BUSINESS_DATE() { return l_P_BUSINESS_DATE; }

	public void setw_TARGET_DATE(String val) { m_w_TARGET_DATE = val; }
	public void sets_DEVELOP_TYP(Integer val) { m_s_DEVELOP_TYP = val; }
	public void sets_DEVELOP_TYP_name(String val) { m_s_DEVELOP_TYP_name = val; }
	public void sets_DEVELOP_TYP_val(String val) { m_s_DEVELOP_TYP_val = val; }
	public void setw_LEVEL(String val) { m_w_LEVEL = val; }
	public void setNO(Integer val) { m_NO = val; }
	public void sets_CONS_TYP_name(String val) { m_s_CONS_TYP_name = val; }
	public void sets_CONS_TYP_val(String val) { m_s_CONS_TYP_val = val; }
	public void sets_COST_UP_TYP_name(String val) { m_s_COST_UP_TYP_name = val; }
	public void sets_COST_UP_TYP_val(String val) { m_s_COST_UP_TYP_val = val; }
	public void sets_MRP_EXP_TYP_name(String val) { m_s_MRP_EXP_TYP_name = val; }
	public void sets_MRP_EXP_TYP_val(String val) { m_s_MRP_EXP_TYP_val = val; }
	public void sets_CONS_NAME(String val) { m_s_CONS_NAME = val; }
	public void setPS_LT_NAME(String val) { m_PS_LT_NAME = val; }
	public void setCOST_UP_NAME(String val) { m_COST_UP_NAME = val; }
	public void setMRP_EXP_NAME(String val) { m_MRP_EXP_NAME = val; }
	public void setPS_LT_CHECK(String val) { m_PS_LT_CHECK = val; }
	public void setCOMP_MANHOUR_NAME(String val) { m_COMP_MANHOUR_NAME = val; }
	public void setPARENT_ITEM_CD(String val) { m_PARENT_ITEM_CD = val; }
	public void setCOMP_ITEM_CD(String val) { m_COMP_ITEM_CD = val; }
	public void setPS_EDITION(String val) { m_PS_EDITION = val; }
	public void setPS_UNIT_DENOMINATOR(String val) { m_PS_UNIT_DENOMINATOR = val; }
	public void setPS_UNIT_NUMERATOR(String val) { m_PS_UNIT_NUMERATOR = val; }
	public void setEFF_PHASE_IN_DATE(String val) { m_EFF_PHASE_IN_DATE = val; }
	public void setEFF_PHASE_OUT_DATE(String val) { m_EFF_PHASE_OUT_DATE = val; }
	public void setPS_SPOIL(String val) { m_PS_SPOIL = val; }
	public void sets_CONS_TYP(Integer val) { m_s_CONS_TYP = val; }
	public void setPS_LT_FLG(Integer val) { m_PS_LT_FLG = val; }
	public void setPS_FIXED_LT(String val) { m_PS_FIXED_LT = val; }
	public void setPS_PROP_LT(String val) { m_PS_PROP_LT = val; }
	public void setPS_PROP_LOT_SIZE(String val) { m_PS_PROP_LOT_SIZE = val; }
	public void setPS_REF_NO(String val) { m_PS_REF_NO = val; }
	public void sets_COST_UP_TYP(Integer val) { m_s_COST_UP_TYP = val; }
	public void sets_MRP_EXP_TYP(Integer val) { m_s_MRP_EXP_TYP = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setPARENT_ITEM_NAME(String val) { m_PARENT_ITEM_NAME = val; }
	public void setCOMP_ITEM_NAME(String val) { m_COMP_ITEM_NAME = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setCOMP_MANHOUR_TYP(String val) { m_COMP_MANHOUR_TYP = val; }
	public void setSEQ_NO(Long val) { m_SEQ_NO = val; }
	public void setACCESS_TYP(Integer val) { m_ACCESS_TYP = val; }
	public void setCMPLT_FLG(Integer val) { m_CMPLT_FLG = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setMRP_ODR_TYP(Integer val) { m_MRP_ODR_TYP = val; }
	public void setw_TARGET_ITEM_CD(String val) { m_w_TARGET_ITEM_CD = val; }
	public void setP_VALUE(String val) { m_P_VALUE = val; }
	public void setP_NAME(String val) { m_P_NAME = val; }
	public void setP_PLANT_CD(String val) { m_P_PLANT_CD = val; }
	public void setP_USER_CD(String val) { m_P_USER_CD = val; }
	public void setP_BUSINESS_DATE(String val) { m_P_BUSINESS_DATE = val; }

	public void sets_DEVELOP_TYP(String val) { m_s_DEVELOP_TYP = getInteger(val); }
	public void setNO(String val) { m_NO = getInteger(val); }
	public void sets_CONS_TYP(String val) { m_s_CONS_TYP = getInteger(val); }
	public void setPS_LT_FLG(String val) { m_PS_LT_FLG = getInteger(val); }
	public void sets_COST_UP_TYP(String val) { m_s_COST_UP_TYP = getInteger(val); }
	public void sets_MRP_EXP_TYP(String val) { m_s_MRP_EXP_TYP = getInteger(val); }
	public void setACCESS_TYP(String val) { m_ACCESS_TYP = getInteger(val); }
	public void setCMPLT_FLG(String val) { m_CMPLT_FLG = getInteger(val); }
	public void setMRP_ODR_TYP(String val) { m_MRP_ODR_TYP = getInteger(val); }

	public void setList_w_TARGET_DATE(List list) { l_w_TARGET_DATE = list; }
	public void setList_s_DEVELOP_TYP(List list) { l_s_DEVELOP_TYP = list; }
	public void setList_s_DEVELOP_TYP_name(List list) { l_s_DEVELOP_TYP_name = list; }
	public void setList_s_DEVELOP_TYP_val(List list) { l_s_DEVELOP_TYP_val = list; }
	public void setList_w_LEVEL(List list) { l_w_LEVEL = list; }
	public void setList_NO(List list) { l_NO = list; }
	public void setList_s_CONS_TYP_name(List list) { l_s_CONS_TYP_name = list; }
	public void setList_s_CONS_TYP_val(List list) { l_s_CONS_TYP_val = list; }
	public void setList_s_COST_UP_TYP_name(List list) { l_s_COST_UP_TYP_name = list; }
	public void setList_s_COST_UP_TYP_val(List list) { l_s_COST_UP_TYP_val = list; }
	public void setList_s_MRP_EXP_TYP_name(List list) { l_s_MRP_EXP_TYP_name = list; }
	public void setList_s_MRP_EXP_TYP_val(List list) { l_s_MRP_EXP_TYP_val = list; }
	public void setList_s_CONS_NAME(List list) { l_s_CONS_NAME = list; }
	public void setList_PS_LT_NAME(List list) { l_PS_LT_NAME = list; }
	public void setList_COST_UP_NAME(List list) { l_COST_UP_NAME = list; }
	public void setList_MRP_EXP_NAME(List list) { l_MRP_EXP_NAME = list; }
	public void setList_PS_LT_CHECK(List list) { l_PS_LT_CHECK = list; }
	public void setList_COMP_MANHOUR_NAME(List list) { l_COMP_MANHOUR_NAME = list; }
	public void setList_PARENT_ITEM_CD(List list) { l_PARENT_ITEM_CD = list; }
	public void setList_COMP_ITEM_CD(List list) { l_COMP_ITEM_CD = list; }
	public void setList_PS_EDITION(List list) { l_PS_EDITION = list; }
	public void setList_PS_UNIT_DENOMINATOR(List list) { l_PS_UNIT_DENOMINATOR = list; }
	public void setList_PS_UNIT_NUMERATOR(List list) { l_PS_UNIT_NUMERATOR = list; }
	public void setList_EFF_PHASE_IN_DATE(List list) { l_EFF_PHASE_IN_DATE = list; }
	public void setList_EFF_PHASE_OUT_DATE(List list) { l_EFF_PHASE_OUT_DATE = list; }
	public void setList_PS_SPOIL(List list) { l_PS_SPOIL = list; }
	public void setList_s_CONS_TYP(List list) { l_s_CONS_TYP = list; }
	public void setList_PS_LT_FLG(List list) { l_PS_LT_FLG = list; }
	public void setList_PS_FIXED_LT(List list) { l_PS_FIXED_LT = list; }
	public void setList_PS_PROP_LT(List list) { l_PS_PROP_LT = list; }
	public void setList_PS_PROP_LOT_SIZE(List list) { l_PS_PROP_LOT_SIZE = list; }
	public void setList_PS_REF_NO(List list) { l_PS_REF_NO = list; }
	public void setList_s_COST_UP_TYP(List list) { l_s_COST_UP_TYP = list; }
	public void setList_s_MRP_EXP_TYP(List list) { l_s_MRP_EXP_TYP = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_PARENT_ITEM_NAME(List list) { l_PARENT_ITEM_NAME = list; }
	public void setList_COMP_ITEM_NAME(List list) { l_COMP_ITEM_NAME = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_COMP_MANHOUR_TYP(List list) { l_COMP_MANHOUR_TYP = list; }
	public void setList_SEQ_NO(List list) { l_SEQ_NO = list; }
	public void setList_ACCESS_TYP(List list) { l_ACCESS_TYP = list; }
	public void setList_CMPLT_FLG(List list) { l_CMPLT_FLG = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_MRP_ODR_TYP(List list) { l_MRP_ODR_TYP = list; }
	public void setList_w_TARGET_ITEM_CD(List list) { l_w_TARGET_ITEM_CD = list; }
	public void setList_P_VALUE(List list) { l_P_VALUE = list; }
	public void setList_P_NAME(List list) { l_P_NAME = list; }
	public void setList_P_PLANT_CD(List list) { l_P_PLANT_CD = list; }
	public void setList_P_USER_CD(List list) { l_P_USER_CD = list; }
	public void setList_P_BUSINESS_DATE(List list) { l_P_BUSINESS_DATE = list; }

	public int setL2L_w_TARGET_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_TARGET_DATE == null) {
			l_w_TARGET_DATE = new ArrayList();
		} else {
			l_w_TARGET_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_TARGET_DATE.add(((AA0020010Struct) list.get(i)).getw_TARGET_DATE());
		}
		return size;
	}
	public int setL2L_s_DEVELOP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_DEVELOP_TYP == null) {
			l_s_DEVELOP_TYP = new ArrayList();
		} else {
			l_s_DEVELOP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_DEVELOP_TYP.add(((AA0020010Struct) list.get(i)).gets_DEVELOP_TYP());
		}
		return size;
	}
	public int setL2L_s_DEVELOP_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_DEVELOP_TYP_name == null) {
			l_s_DEVELOP_TYP_name = new ArrayList();
		} else {
			l_s_DEVELOP_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_DEVELOP_TYP_name.add(((AA0020010Struct) list.get(i)).gets_DEVELOP_TYP_name());
		}
		return size;
	}
	public int setL2L_s_DEVELOP_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_DEVELOP_TYP_val == null) {
			l_s_DEVELOP_TYP_val = new ArrayList();
		} else {
			l_s_DEVELOP_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_DEVELOP_TYP_val.add(((AA0020010Struct) list.get(i)).gets_DEVELOP_TYP_val());
		}
		return size;
	}
	public int setL2L_w_LEVEL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_LEVEL == null) {
			l_w_LEVEL = new ArrayList();
		} else {
			l_w_LEVEL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_LEVEL.add(((AA0020010Struct) list.get(i)).getw_LEVEL());
		}
		return size;
	}
	public int setL2L_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NO == null) {
			l_NO = new ArrayList();
		} else {
			l_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NO.add(((AA0020010Struct) list.get(i)).getNO());
		}
		return size;
	}
	public int setL2L_s_CONS_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_CONS_TYP_name == null) {
			l_s_CONS_TYP_name = new ArrayList();
		} else {
			l_s_CONS_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_CONS_TYP_name.add(((AA0020010Struct) list.get(i)).gets_CONS_TYP_name());
		}
		return size;
	}
	public int setL2L_s_CONS_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_CONS_TYP_val == null) {
			l_s_CONS_TYP_val = new ArrayList();
		} else {
			l_s_CONS_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_CONS_TYP_val.add(((AA0020010Struct) list.get(i)).gets_CONS_TYP_val());
		}
		return size;
	}
	public int setL2L_s_COST_UP_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_COST_UP_TYP_name == null) {
			l_s_COST_UP_TYP_name = new ArrayList();
		} else {
			l_s_COST_UP_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_COST_UP_TYP_name.add(((AA0020010Struct) list.get(i)).gets_COST_UP_TYP_name());
		}
		return size;
	}
	public int setL2L_s_COST_UP_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_COST_UP_TYP_val == null) {
			l_s_COST_UP_TYP_val = new ArrayList();
		} else {
			l_s_COST_UP_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_COST_UP_TYP_val.add(((AA0020010Struct) list.get(i)).gets_COST_UP_TYP_val());
		}
		return size;
	}
	public int setL2L_s_MRP_EXP_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_MRP_EXP_TYP_name == null) {
			l_s_MRP_EXP_TYP_name = new ArrayList();
		} else {
			l_s_MRP_EXP_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_MRP_EXP_TYP_name.add(((AA0020010Struct) list.get(i)).gets_MRP_EXP_TYP_name());
		}
		return size;
	}
	public int setL2L_s_MRP_EXP_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_MRP_EXP_TYP_val == null) {
			l_s_MRP_EXP_TYP_val = new ArrayList();
		} else {
			l_s_MRP_EXP_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_MRP_EXP_TYP_val.add(((AA0020010Struct) list.get(i)).gets_MRP_EXP_TYP_val());
		}
		return size;
	}
	public int setL2L_s_CONS_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_CONS_NAME == null) {
			l_s_CONS_NAME = new ArrayList();
		} else {
			l_s_CONS_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_CONS_NAME.add(((AA0020010Struct) list.get(i)).gets_CONS_NAME());
		}
		return size;
	}
	public int setL2L_PS_LT_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PS_LT_NAME == null) {
			l_PS_LT_NAME = new ArrayList();
		} else {
			l_PS_LT_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PS_LT_NAME.add(((AA0020010Struct) list.get(i)).getPS_LT_NAME());
		}
		return size;
	}
	public int setL2L_COST_UP_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COST_UP_NAME == null) {
			l_COST_UP_NAME = new ArrayList();
		} else {
			l_COST_UP_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COST_UP_NAME.add(((AA0020010Struct) list.get(i)).getCOST_UP_NAME());
		}
		return size;
	}
	public int setL2L_MRP_EXP_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_EXP_NAME == null) {
			l_MRP_EXP_NAME = new ArrayList();
		} else {
			l_MRP_EXP_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_EXP_NAME.add(((AA0020010Struct) list.get(i)).getMRP_EXP_NAME());
		}
		return size;
	}
	public int setL2L_PS_LT_CHECK(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PS_LT_CHECK == null) {
			l_PS_LT_CHECK = new ArrayList();
		} else {
			l_PS_LT_CHECK.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PS_LT_CHECK.add(((AA0020010Struct) list.get(i)).getPS_LT_CHECK());
		}
		return size;
	}
	public int setL2L_COMP_MANHOUR_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COMP_MANHOUR_NAME == null) {
			l_COMP_MANHOUR_NAME = new ArrayList();
		} else {
			l_COMP_MANHOUR_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COMP_MANHOUR_NAME.add(((AA0020010Struct) list.get(i)).getCOMP_MANHOUR_NAME());
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
			l_PARENT_ITEM_CD.add(((AA0020010Struct) list.get(i)).getPARENT_ITEM_CD());
		}
		return size;
	}
	public int setL2L_COMP_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COMP_ITEM_CD == null) {
			l_COMP_ITEM_CD = new ArrayList();
		} else {
			l_COMP_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COMP_ITEM_CD.add(((AA0020010Struct) list.get(i)).getCOMP_ITEM_CD());
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
			l_PS_EDITION.add(((AA0020010Struct) list.get(i)).getPS_EDITION());
		}
		return size;
	}
	public int setL2L_PS_UNIT_DENOMINATOR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PS_UNIT_DENOMINATOR == null) {
			l_PS_UNIT_DENOMINATOR = new ArrayList();
		} else {
			l_PS_UNIT_DENOMINATOR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PS_UNIT_DENOMINATOR.add(((AA0020010Struct) list.get(i)).getPS_UNIT_DENOMINATOR());
		}
		return size;
	}
	public int setL2L_PS_UNIT_NUMERATOR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PS_UNIT_NUMERATOR == null) {
			l_PS_UNIT_NUMERATOR = new ArrayList();
		} else {
			l_PS_UNIT_NUMERATOR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PS_UNIT_NUMERATOR.add(((AA0020010Struct) list.get(i)).getPS_UNIT_NUMERATOR());
		}
		return size;
	}
	public int setL2L_EFF_PHASE_IN_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EFF_PHASE_IN_DATE == null) {
			l_EFF_PHASE_IN_DATE = new ArrayList();
		} else {
			l_EFF_PHASE_IN_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EFF_PHASE_IN_DATE.add(((AA0020010Struct) list.get(i)).getEFF_PHASE_IN_DATE());
		}
		return size;
	}
	public int setL2L_EFF_PHASE_OUT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EFF_PHASE_OUT_DATE == null) {
			l_EFF_PHASE_OUT_DATE = new ArrayList();
		} else {
			l_EFF_PHASE_OUT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EFF_PHASE_OUT_DATE.add(((AA0020010Struct) list.get(i)).getEFF_PHASE_OUT_DATE());
		}
		return size;
	}
	public int setL2L_PS_SPOIL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PS_SPOIL == null) {
			l_PS_SPOIL = new ArrayList();
		} else {
			l_PS_SPOIL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PS_SPOIL.add(((AA0020010Struct) list.get(i)).getPS_SPOIL());
		}
		return size;
	}
	public int setL2L_s_CONS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_CONS_TYP == null) {
			l_s_CONS_TYP = new ArrayList();
		} else {
			l_s_CONS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_CONS_TYP.add(((AA0020010Struct) list.get(i)).gets_CONS_TYP());
		}
		return size;
	}
	public int setL2L_PS_LT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PS_LT_FLG == null) {
			l_PS_LT_FLG = new ArrayList();
		} else {
			l_PS_LT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PS_LT_FLG.add(((AA0020010Struct) list.get(i)).getPS_LT_FLG());
		}
		return size;
	}
	public int setL2L_PS_FIXED_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PS_FIXED_LT == null) {
			l_PS_FIXED_LT = new ArrayList();
		} else {
			l_PS_FIXED_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PS_FIXED_LT.add(((AA0020010Struct) list.get(i)).getPS_FIXED_LT());
		}
		return size;
	}
	public int setL2L_PS_PROP_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PS_PROP_LT == null) {
			l_PS_PROP_LT = new ArrayList();
		} else {
			l_PS_PROP_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PS_PROP_LT.add(((AA0020010Struct) list.get(i)).getPS_PROP_LT());
		}
		return size;
	}
	public int setL2L_PS_PROP_LOT_SIZE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PS_PROP_LOT_SIZE == null) {
			l_PS_PROP_LOT_SIZE = new ArrayList();
		} else {
			l_PS_PROP_LOT_SIZE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PS_PROP_LOT_SIZE.add(((AA0020010Struct) list.get(i)).getPS_PROP_LOT_SIZE());
		}
		return size;
	}
	public int setL2L_PS_REF_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PS_REF_NO == null) {
			l_PS_REF_NO = new ArrayList();
		} else {
			l_PS_REF_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PS_REF_NO.add(((AA0020010Struct) list.get(i)).getPS_REF_NO());
		}
		return size;
	}
	public int setL2L_s_COST_UP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_COST_UP_TYP == null) {
			l_s_COST_UP_TYP = new ArrayList();
		} else {
			l_s_COST_UP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_COST_UP_TYP.add(((AA0020010Struct) list.get(i)).gets_COST_UP_TYP());
		}
		return size;
	}
	public int setL2L_s_MRP_EXP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_s_MRP_EXP_TYP == null) {
			l_s_MRP_EXP_TYP = new ArrayList();
		} else {
			l_s_MRP_EXP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_s_MRP_EXP_TYP.add(((AA0020010Struct) list.get(i)).gets_MRP_EXP_TYP());
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
			l_MODIFY_COUNT.add(((AA0020010Struct) list.get(i)).getMODIFY_COUNT());
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
			l_PARENT_ITEM_NAME.add(((AA0020010Struct) list.get(i)).getPARENT_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_COMP_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COMP_ITEM_NAME == null) {
			l_COMP_ITEM_NAME = new ArrayList();
		} else {
			l_COMP_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COMP_ITEM_NAME.add(((AA0020010Struct) list.get(i)).getCOMP_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_STOCK_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_UNIT == null) {
			l_STOCK_UNIT = new ArrayList();
		} else {
			l_STOCK_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_UNIT.add(((AA0020010Struct) list.get(i)).getSTOCK_UNIT());
		}
		return size;
	}
	public int setL2L_COMP_MANHOUR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COMP_MANHOUR_TYP == null) {
			l_COMP_MANHOUR_TYP = new ArrayList();
		} else {
			l_COMP_MANHOUR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COMP_MANHOUR_TYP.add(((AA0020010Struct) list.get(i)).getCOMP_MANHOUR_TYP());
		}
		return size;
	}
	public int setL2L_SEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEQ_NO == null) {
			l_SEQ_NO = new ArrayList();
		} else {
			l_SEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEQ_NO.add(((AA0020010Struct) list.get(i)).getSEQ_NO());
		}
		return size;
	}
	public int setL2L_ACCESS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACCESS_TYP == null) {
			l_ACCESS_TYP = new ArrayList();
		} else {
			l_ACCESS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACCESS_TYP.add(((AA0020010Struct) list.get(i)).getACCESS_TYP());
		}
		return size;
	}
	public int setL2L_CMPLT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CMPLT_FLG == null) {
			l_CMPLT_FLG = new ArrayList();
		} else {
			l_CMPLT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CMPLT_FLG.add(((AA0020010Struct) list.get(i)).getCMPLT_FLG());
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
			l_ITEM_CD.add(((AA0020010Struct) list.get(i)).getITEM_CD());
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
			l_MRP_ODR_TYP.add(((AA0020010Struct) list.get(i)).getMRP_ODR_TYP());
		}
		return size;
	}
	public int setL2L_w_TARGET_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_TARGET_ITEM_CD == null) {
			l_w_TARGET_ITEM_CD = new ArrayList();
		} else {
			l_w_TARGET_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_TARGET_ITEM_CD.add(((AA0020010Struct) list.get(i)).getw_TARGET_ITEM_CD());
		}
		return size;
	}
	public int setL2L_P_VALUE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_P_VALUE == null) {
			l_P_VALUE = new ArrayList();
		} else {
			l_P_VALUE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_P_VALUE.add(((AA0020010Struct) list.get(i)).getP_VALUE());
		}
		return size;
	}
	public int setL2L_P_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_P_NAME == null) {
			l_P_NAME = new ArrayList();
		} else {
			l_P_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_P_NAME.add(((AA0020010Struct) list.get(i)).getP_NAME());
		}
		return size;
	}
	public int setL2L_P_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_P_PLANT_CD == null) {
			l_P_PLANT_CD = new ArrayList();
		} else {
			l_P_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_P_PLANT_CD.add(((AA0020010Struct) list.get(i)).getP_PLANT_CD());
		}
		return size;
	}
	public int setL2L_P_USER_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_P_USER_CD == null) {
			l_P_USER_CD = new ArrayList();
		} else {
			l_P_USER_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_P_USER_CD.add(((AA0020010Struct) list.get(i)).getP_USER_CD());
		}
		return size;
	}
	public int setL2L_P_BUSINESS_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_P_BUSINESS_DATE == null) {
			l_P_BUSINESS_DATE = new ArrayList();
		} else {
			l_P_BUSINESS_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_P_BUSINESS_DATE.add(((AA0020010Struct) list.get(i)).getP_BUSINESS_DATE());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_w_TARGET_DATE = null;
		m_s_DEVELOP_TYP = null;
		m_s_DEVELOP_TYP_name = null;
		m_s_DEVELOP_TYP_val = null;
		m_w_LEVEL = null;
		m_NO = null;
		m_s_CONS_TYP_name = null;
		m_s_CONS_TYP_val = null;
		m_s_COST_UP_TYP_name = null;
		m_s_COST_UP_TYP_val = null;
		m_s_MRP_EXP_TYP_name = null;
		m_s_MRP_EXP_TYP_val = null;
		m_s_CONS_NAME = null;
		m_PS_LT_NAME = null;
		m_COST_UP_NAME = null;
		m_MRP_EXP_NAME = null;
		m_PS_LT_CHECK = null;
		m_COMP_MANHOUR_NAME = null;
		m_PARENT_ITEM_CD = null;
		m_COMP_ITEM_CD = null;
		m_PS_EDITION = null;
		m_PS_UNIT_DENOMINATOR = null;
		m_PS_UNIT_NUMERATOR = null;
		m_EFF_PHASE_IN_DATE = null;
		m_EFF_PHASE_OUT_DATE = null;
		m_PS_SPOIL = null;
		m_s_CONS_TYP = null;
		m_PS_LT_FLG = null;
		m_PS_FIXED_LT = null;
		m_PS_PROP_LT = null;
		m_PS_PROP_LOT_SIZE = null;
		m_PS_REF_NO = null;
		m_s_COST_UP_TYP = null;
		m_s_MRP_EXP_TYP = null;
		m_MODIFY_COUNT = null;
		m_PARENT_ITEM_NAME = null;
		m_COMP_ITEM_NAME = null;
		m_STOCK_UNIT = null;
		m_COMP_MANHOUR_TYP = null;
		m_SEQ_NO = null;
		m_ACCESS_TYP = null;
		m_CMPLT_FLG = null;
		m_ITEM_CD = null;
		m_MRP_ODR_TYP = null;
		m_w_TARGET_ITEM_CD = null;
		m_P_VALUE = null;
		m_P_NAME = null;
		m_P_PLANT_CD = null;
		m_P_USER_CD = null;
		m_P_BUSINESS_DATE = null;

		l_w_TARGET_DATE = null;
		l_s_DEVELOP_TYP = null;
		l_s_DEVELOP_TYP_name = null;
		l_s_DEVELOP_TYP_val = null;
		l_w_LEVEL = null;
		l_NO = null;
		l_s_CONS_TYP_name = null;
		l_s_CONS_TYP_val = null;
		l_s_COST_UP_TYP_name = null;
		l_s_COST_UP_TYP_val = null;
		l_s_MRP_EXP_TYP_name = null;
		l_s_MRP_EXP_TYP_val = null;
		l_s_CONS_NAME = null;
		l_PS_LT_NAME = null;
		l_COST_UP_NAME = null;
		l_MRP_EXP_NAME = null;
		l_PS_LT_CHECK = null;
		l_COMP_MANHOUR_NAME = null;
		l_PARENT_ITEM_CD = null;
		l_COMP_ITEM_CD = null;
		l_PS_EDITION = null;
		l_PS_UNIT_DENOMINATOR = null;
		l_PS_UNIT_NUMERATOR = null;
		l_EFF_PHASE_IN_DATE = null;
		l_EFF_PHASE_OUT_DATE = null;
		l_PS_SPOIL = null;
		l_s_CONS_TYP = null;
		l_PS_LT_FLG = null;
		l_PS_FIXED_LT = null;
		l_PS_PROP_LT = null;
		l_PS_PROP_LOT_SIZE = null;
		l_PS_REF_NO = null;
		l_s_COST_UP_TYP = null;
		l_s_MRP_EXP_TYP = null;
		l_MODIFY_COUNT = null;
		l_PARENT_ITEM_NAME = null;
		l_COMP_ITEM_NAME = null;
		l_STOCK_UNIT = null;
		l_COMP_MANHOUR_TYP = null;
		l_SEQ_NO = null;
		l_ACCESS_TYP = null;
		l_CMPLT_FLG = null;
		l_ITEM_CD = null;
		l_MRP_ODR_TYP = null;
		l_w_TARGET_ITEM_CD = null;
		l_P_VALUE = null;
		l_P_NAME = null;
		l_P_PLANT_CD = null;
		l_P_USER_CD = null;
		l_P_BUSINESS_DATE = null;

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
	 * medAA0020010�N���X�̕W���R���X�g���N�^
	 */
	public AA0020010Struct()
	{
		//{{user_implement_code_constractor
                //------------------------------------------------------------------------------
                initialize();
                //------------------------------------------------------------------------------
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
	public void setStruct(AA0020010Struct struct)
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
	public void setStructM(AA0020010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setw_TARGET_DATE(struct.getw_TARGET_DATE());
			this.sets_DEVELOP_TYP(struct.gets_DEVELOP_TYP());
			this.sets_DEVELOP_TYP_name(struct.gets_DEVELOP_TYP_name());
			this.sets_DEVELOP_TYP_val(struct.gets_DEVELOP_TYP_val());
			this.setw_LEVEL(struct.getw_LEVEL());
			this.setNO(struct.getNO());
			this.sets_CONS_TYP_name(struct.gets_CONS_TYP_name());
			this.sets_CONS_TYP_val(struct.gets_CONS_TYP_val());
			this.sets_COST_UP_TYP_name(struct.gets_COST_UP_TYP_name());
			this.sets_COST_UP_TYP_val(struct.gets_COST_UP_TYP_val());
			this.sets_MRP_EXP_TYP_name(struct.gets_MRP_EXP_TYP_name());
			this.sets_MRP_EXP_TYP_val(struct.gets_MRP_EXP_TYP_val());
			this.sets_CONS_NAME(struct.gets_CONS_NAME());
			this.setPS_LT_NAME(struct.getPS_LT_NAME());
			this.setCOST_UP_NAME(struct.getCOST_UP_NAME());
			this.setMRP_EXP_NAME(struct.getMRP_EXP_NAME());
			this.setPS_LT_CHECK(struct.getPS_LT_CHECK());
			this.setCOMP_MANHOUR_NAME(struct.getCOMP_MANHOUR_NAME());
			this.setPARENT_ITEM_CD(struct.getPARENT_ITEM_CD());
			this.setCOMP_ITEM_CD(struct.getCOMP_ITEM_CD());
			this.setPS_EDITION(struct.getPS_EDITION());
			this.setPS_UNIT_DENOMINATOR(struct.getPS_UNIT_DENOMINATOR());
			this.setPS_UNIT_NUMERATOR(struct.getPS_UNIT_NUMERATOR());
			this.setEFF_PHASE_IN_DATE(struct.getEFF_PHASE_IN_DATE());
			this.setEFF_PHASE_OUT_DATE(struct.getEFF_PHASE_OUT_DATE());
			this.setPS_SPOIL(struct.getPS_SPOIL());
			this.sets_CONS_TYP(struct.gets_CONS_TYP());
			this.setPS_LT_FLG(struct.getPS_LT_FLG());
			this.setPS_FIXED_LT(struct.getPS_FIXED_LT());
			this.setPS_PROP_LT(struct.getPS_PROP_LT());
			this.setPS_PROP_LOT_SIZE(struct.getPS_PROP_LOT_SIZE());
			this.setPS_REF_NO(struct.getPS_REF_NO());
			this.sets_COST_UP_TYP(struct.gets_COST_UP_TYP());
			this.sets_MRP_EXP_TYP(struct.gets_MRP_EXP_TYP());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setPARENT_ITEM_NAME(struct.getPARENT_ITEM_NAME());
			this.setCOMP_ITEM_NAME(struct.getCOMP_ITEM_NAME());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setCOMP_MANHOUR_TYP(struct.getCOMP_MANHOUR_TYP());
			this.setSEQ_NO(struct.getSEQ_NO());
			this.setACCESS_TYP(struct.getACCESS_TYP());
			this.setCMPLT_FLG(struct.getCMPLT_FLG());
			this.setITEM_CD(struct.getITEM_CD());
			this.setMRP_ODR_TYP(struct.getMRP_ODR_TYP());
			this.setw_TARGET_ITEM_CD(struct.getw_TARGET_ITEM_CD());
			this.setP_VALUE(struct.getP_VALUE());
			this.setP_NAME(struct.getP_NAME());
			this.setP_PLANT_CD(struct.getP_PLANT_CD());
			this.setP_USER_CD(struct.getP_USER_CD());
			this.setP_BUSINESS_DATE(struct.getP_BUSINESS_DATE());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AA0020010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_w_TARGET_DATE(struct.getList_w_TARGET_DATE());
			this.setList_s_DEVELOP_TYP(struct.getList_s_DEVELOP_TYP());
			this.setList_s_DEVELOP_TYP_name(struct.getList_s_DEVELOP_TYP_name());
			this.setList_s_DEVELOP_TYP_val(struct.getList_s_DEVELOP_TYP_val());
			this.setList_w_LEVEL(struct.getList_w_LEVEL());
			this.setList_NO(struct.getList_NO());
			this.setList_s_CONS_TYP_name(struct.getList_s_CONS_TYP_name());
			this.setList_s_CONS_TYP_val(struct.getList_s_CONS_TYP_val());
			this.setList_s_COST_UP_TYP_name(struct.getList_s_COST_UP_TYP_name());
			this.setList_s_COST_UP_TYP_val(struct.getList_s_COST_UP_TYP_val());
			this.setList_s_MRP_EXP_TYP_name(struct.getList_s_MRP_EXP_TYP_name());
			this.setList_s_MRP_EXP_TYP_val(struct.getList_s_MRP_EXP_TYP_val());
			this.setList_s_CONS_NAME(struct.getList_s_CONS_NAME());
			this.setList_PS_LT_NAME(struct.getList_PS_LT_NAME());
			this.setList_COST_UP_NAME(struct.getList_COST_UP_NAME());
			this.setList_MRP_EXP_NAME(struct.getList_MRP_EXP_NAME());
			this.setList_PS_LT_CHECK(struct.getList_PS_LT_CHECK());
			this.setList_COMP_MANHOUR_NAME(struct.getList_COMP_MANHOUR_NAME());
			this.setList_PARENT_ITEM_CD(struct.getList_PARENT_ITEM_CD());
			this.setList_COMP_ITEM_CD(struct.getList_COMP_ITEM_CD());
			this.setList_PS_EDITION(struct.getList_PS_EDITION());
			this.setList_PS_UNIT_DENOMINATOR(struct.getList_PS_UNIT_DENOMINATOR());
			this.setList_PS_UNIT_NUMERATOR(struct.getList_PS_UNIT_NUMERATOR());
			this.setList_EFF_PHASE_IN_DATE(struct.getList_EFF_PHASE_IN_DATE());
			this.setList_EFF_PHASE_OUT_DATE(struct.getList_EFF_PHASE_OUT_DATE());
			this.setList_PS_SPOIL(struct.getList_PS_SPOIL());
			this.setList_s_CONS_TYP(struct.getList_s_CONS_TYP());
			this.setList_PS_LT_FLG(struct.getList_PS_LT_FLG());
			this.setList_PS_FIXED_LT(struct.getList_PS_FIXED_LT());
			this.setList_PS_PROP_LT(struct.getList_PS_PROP_LT());
			this.setList_PS_PROP_LOT_SIZE(struct.getList_PS_PROP_LOT_SIZE());
			this.setList_PS_REF_NO(struct.getList_PS_REF_NO());
			this.setList_s_COST_UP_TYP(struct.getList_s_COST_UP_TYP());
			this.setList_s_MRP_EXP_TYP(struct.getList_s_MRP_EXP_TYP());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_PARENT_ITEM_NAME(struct.getList_PARENT_ITEM_NAME());
			this.setList_COMP_ITEM_NAME(struct.getList_COMP_ITEM_NAME());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_COMP_MANHOUR_TYP(struct.getList_COMP_MANHOUR_TYP());
			this.setList_SEQ_NO(struct.getList_SEQ_NO());
			this.setList_ACCESS_TYP(struct.getList_ACCESS_TYP());
			this.setList_CMPLT_FLG(struct.getList_CMPLT_FLG());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_MRP_ODR_TYP(struct.getList_MRP_ODR_TYP());
			this.setList_w_TARGET_ITEM_CD(struct.getList_w_TARGET_ITEM_CD());
			this.setList_P_VALUE(struct.getList_P_VALUE());
			this.setList_P_NAME(struct.getList_P_NAME());
			this.setList_P_PLANT_CD(struct.getList_P_PLANT_CD());
			this.setList_P_USER_CD(struct.getList_P_USER_CD());
			this.setList_P_BUSINESS_DATE(struct.getList_P_BUSINESS_DATE());
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
	// �� 1 �ϐ������l�F i_w_TARGET_DATE


	final static String i_w_TARGET_DATE = null;

	// �� 2 �ϐ������l�F i_s_DEVELOP_TYP


	final static Integer i_s_DEVELOP_TYP = null;

	// �� 3 �ϐ������l�F i_s_DEVELOP_TYP_name


	final static String i_s_DEVELOP_TYP_name = null;

	// �� 4 �ϐ������l�F i_s_DEVELOP_TYP_val


	final static String i_s_DEVELOP_TYP_val = null;

	// �� 5 �ϐ������l�F i_w_LEVEL


	final static String i_w_LEVEL = null;

	// �� 6 �ϐ������l�F i_NO


	final static Integer i_NO = null;

	// �� 7 �ϐ������l�F i_s_CONS_TYP_name


	final static String i_s_CONS_TYP_name = null;

	// �� 8 �ϐ������l�F i_s_CONS_TYP_val


	final static String i_s_CONS_TYP_val = null;

	// �� 9 �ϐ������l�F i_s_COST_UP_TYP_name


	final static String i_s_COST_UP_TYP_name = null;

	// �� 10 �ϐ������l�F i_s_COST_UP_TYP_val


	final static String i_s_COST_UP_TYP_val = null;

	// �� 11 �ϐ������l�F i_s_MRP_EXP_TYP_name


	final static String i_s_MRP_EXP_TYP_name = null;

	// �� 12 �ϐ������l�F i_s_MRP_EXP_TYP_val


	final static String i_s_MRP_EXP_TYP_val = null;

	// �� 13 �ϐ������l�F i_s_CONS_NAME


	final static String i_s_CONS_NAME = null;

	// �� 14 �ϐ������l�F i_PS_LT_NAME


	final static String i_PS_LT_NAME = null;

	// �� 15 �ϐ������l�F i_COST_UP_NAME


	final static String i_COST_UP_NAME = null;

	// �� 16 �ϐ������l�F i_MRP_EXP_NAME


	final static String i_MRP_EXP_NAME = null;

	// �� 17 �ϐ������l�F i_PS_LT_CHECK


	final static String i_PS_LT_CHECK = null;

	// �� 18 �ϐ������l�F i_COMP_MANHOUR_NAME


	final static String i_COMP_MANHOUR_NAME = null;

	// �� 19 �ϐ������l�F i_PARENT_ITEM_CD


	final static String i_PARENT_ITEM_CD = null;

	// �� 20 �ϐ������l�F i_COMP_ITEM_CD


	final static String i_COMP_ITEM_CD = null;

	// �� 21 �ϐ������l�F i_PS_EDITION


	final static String i_PS_EDITION = null;

	// �� 22 �ϐ������l�F i_PS_UNIT_DENOMINATOR


	final static String i_PS_UNIT_DENOMINATOR = null;

	// �� 23 �ϐ������l�F i_PS_UNIT_NUMERATOR


	final static String i_PS_UNIT_NUMERATOR = null;

	// �� 24 �ϐ������l�F i_EFF_PHASE_IN_DATE


	final static String i_EFF_PHASE_IN_DATE = null;

	// �� 25 �ϐ������l�F i_EFF_PHASE_OUT_DATE


	final static String i_EFF_PHASE_OUT_DATE = null;

	// �� 26 �ϐ������l�F i_PS_SPOIL


	final static String i_PS_SPOIL = null;

	// �� 27 �ϐ������l�F i_s_CONS_TYP


	final static Integer i_s_CONS_TYP = null;

	// �� 28 �ϐ������l�F i_PS_LT_FLG


	final static Integer i_PS_LT_FLG = null;

	// �� 29 �ϐ������l�F i_PS_FIXED_LT


	final static String i_PS_FIXED_LT = null;

	// �� 30 �ϐ������l�F i_PS_PROP_LT


	final static String i_PS_PROP_LT = null;

	// �� 31 �ϐ������l�F i_PS_PROP_LOT_SIZE


	final static String i_PS_PROP_LOT_SIZE = null;

	// �� 32 �ϐ������l�F i_PS_REF_NO


	final static String i_PS_REF_NO = null;

	// �� 33 �ϐ������l�F i_s_COST_UP_TYP


	final static Integer i_s_COST_UP_TYP = null;

	// �� 34 �ϐ������l�F i_s_MRP_EXP_TYP


	final static Integer i_s_MRP_EXP_TYP = null;

	// �� 35 �ϐ������l�F i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// �� 36 �ϐ������l�F i_PARENT_ITEM_NAME


	final static String i_PARENT_ITEM_NAME = null;

	// �� 37 �ϐ������l�F i_COMP_ITEM_NAME


	final static String i_COMP_ITEM_NAME = null;

	// �� 38 �ϐ������l�F i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// �� 39 �ϐ������l�F i_COMP_MANHOUR_TYP


	final static String i_COMP_MANHOUR_TYP = null;

	// �� 40 �ϐ������l�F i_SEQ_NO


	final static Long i_SEQ_NO = null;

	// �� 41 �ϐ������l�F i_ACCESS_TYP


	final static Integer i_ACCESS_TYP = null;

	// �� 42 �ϐ������l�F i_CMPLT_FLG


	final static Integer i_CMPLT_FLG = null;

	// �� 43 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 44 �ϐ������l�F i_MRP_ODR_TYP


	final static Integer i_MRP_ODR_TYP = null;

	// �� 45 �ϐ������l�F i_w_TARGET_ITEM_CD


	final static String i_w_TARGET_ITEM_CD = null;

	// �� 46 �ϐ������l�F i_P_VALUE


	final static String i_P_VALUE = null;

	// �� 47 �ϐ������l�F i_P_NAME


	final static String i_P_NAME = null;

	// �� 48 �ϐ������l�F i_P_PLANT_CD


	final static String i_P_PLANT_CD = null;

	// �� 49 �ϐ������l�F i_P_USER_CD


	final static String i_P_USER_CD = null;

	// �� 50 �ϐ������l�F i_P_BUSINESS_DATE


	final static String i_P_BUSINESS_DATE = null;

*/

	//{{user_implement_code
       
        //------------------------------------------------------------------------------
       
        /**
         * �R�s�[
         */
        public void copy(AA0020010Struct struct)
        {
         if(struct.m_ITEM_CD != null) m_ITEM_CD = new String(struct.m_ITEM_CD);
         else m_ITEM_CD = null;
       
         if(struct.m_PARENT_ITEM_CD != null) m_PARENT_ITEM_CD = new String(struct.m_PARENT_ITEM_CD);
         else m_PARENT_ITEM_CD = null;
       
         if(struct.m_COMP_ITEM_CD != null) m_COMP_ITEM_CD = new String(struct.m_COMP_ITEM_CD);
         else m_COMP_ITEM_CD = null;
       
         if(struct.m_PS_EDITION != null) m_PS_EDITION = new String(struct.m_PS_EDITION);
         else m_PS_EDITION = null;
       
         if(struct.m_PS_UNIT_DENOMINATOR != null) m_PS_UNIT_DENOMINATOR = new String(struct.m_PS_UNIT_DENOMINATOR);
         else m_PS_UNIT_DENOMINATOR = null;
       
         if(struct.m_PS_UNIT_NUMERATOR != null) m_PS_UNIT_NUMERATOR = new String(struct.m_PS_UNIT_NUMERATOR);
         else m_PS_UNIT_NUMERATOR = null;
       
         if(struct.m_EFF_PHASE_IN_DATE != null) m_EFF_PHASE_IN_DATE = new String(struct.m_EFF_PHASE_IN_DATE);
         else m_EFF_PHASE_IN_DATE = null;
       
         if(struct.m_EFF_PHASE_OUT_DATE != null) m_EFF_PHASE_OUT_DATE = new String(struct.m_EFF_PHASE_OUT_DATE);
         else m_EFF_PHASE_OUT_DATE = null;
       
         if(struct.m_PS_SPOIL != null) m_PS_SPOIL = new String(struct.m_PS_SPOIL);
         else m_PS_SPOIL = null;
       
         if(struct.m_s_CONS_TYP != null) m_s_CONS_TYP = new Integer(struct.m_s_CONS_TYP.intValue());
         else m_s_CONS_TYP = null;
       
         if(struct.m_PS_LT_FLG != null) m_PS_LT_FLG = new Integer(struct.m_PS_LT_FLG.intValue());
         else m_PS_LT_FLG = null;
       
         if(struct.m_PS_FIXED_LT != null) m_PS_FIXED_LT = new String(struct.m_PS_FIXED_LT);
         else m_PS_FIXED_LT = null;
       
         if(struct.m_PS_PROP_LT != null) m_PS_PROP_LT = new String(struct.m_PS_PROP_LT);
         else m_PS_PROP_LT = null;
       
         if(struct.m_PS_PROP_LOT_SIZE != null) m_PS_PROP_LOT_SIZE = new String(struct.m_PS_PROP_LOT_SIZE);
         else m_PS_PROP_LOT_SIZE = null;
       
         if(struct.m_PS_REF_NO != null) m_PS_REF_NO = new String(struct.m_PS_REF_NO);
         else m_PS_REF_NO = null;
       
         if(struct.m_s_COST_UP_TYP != null) m_s_COST_UP_TYP = new Integer(struct.m_s_COST_UP_TYP.intValue());
         else m_s_COST_UP_TYP = null;
       
         if(struct.m_s_MRP_EXP_TYP != null) m_s_MRP_EXP_TYP = new Integer(struct.m_s_MRP_EXP_TYP.intValue());
         else m_s_MRP_EXP_TYP = null;
       
         if(struct.m_MODIFY_COUNT != null) m_MODIFY_COUNT = new String(struct.m_MODIFY_COUNT);
         else m_MODIFY_COUNT = null;
       
         if(struct.m_PARENT_ITEM_NAME != null) m_PARENT_ITEM_NAME = new String(struct.m_PARENT_ITEM_NAME);
         else m_PARENT_ITEM_NAME = null;
       
         if(struct.m_COMP_ITEM_NAME != null) m_COMP_ITEM_NAME = new String(struct.m_COMP_ITEM_NAME);
         else m_COMP_ITEM_NAME = null;
       
         if(struct.m_STOCK_UNIT != null) m_STOCK_UNIT = new String(struct.m_STOCK_UNIT);
         else m_STOCK_UNIT = null;
       
         if(struct.m_w_TARGET_ITEM_CD != null) m_w_TARGET_ITEM_CD = new String(struct.m_w_TARGET_ITEM_CD);
         else m_w_TARGET_ITEM_CD = null;
       
         if(struct.m_w_TARGET_DATE != null) m_w_TARGET_DATE = new String(struct.m_w_TARGET_DATE);
         else m_w_TARGET_DATE = null;
       
         if(struct.m_s_DEVELOP_TYP != null) m_s_DEVELOP_TYP = new Integer(struct.m_s_DEVELOP_TYP.intValue());
         else m_s_DEVELOP_TYP = null;
       
         if(struct.m_s_DEVELOP_TYP_name != null) m_s_DEVELOP_TYP_name = new String(struct.m_s_DEVELOP_TYP_name);
         else m_s_DEVELOP_TYP_name = null;
       
         if(struct.m_s_DEVELOP_TYP_val != null) m_s_DEVELOP_TYP_val = new String(struct.m_s_DEVELOP_TYP_val);
         else m_s_DEVELOP_TYP_val = null;
       
         if(struct.m_w_LEVEL != null) m_w_LEVEL = new String(struct.m_w_LEVEL);
         else m_w_LEVEL = null;
       
         if(struct.m_s_CONS_TYP_name != null) m_s_CONS_TYP_name = new String(struct.m_s_CONS_TYP_name);
         else m_s_CONS_TYP_name = null;
       
         if(struct.m_s_CONS_TYP_val != null) m_s_CONS_TYP_val = new String(struct.m_s_CONS_TYP_val);
         else m_s_CONS_TYP_val = null;
       
         if(struct.m_s_COST_UP_TYP_name != null) m_s_COST_UP_TYP_name = new String(struct.m_s_COST_UP_TYP_name);
         else m_s_COST_UP_TYP_name = null;
       
         if(struct.m_s_COST_UP_TYP_val != null) m_s_COST_UP_TYP_val = new String(struct.m_s_COST_UP_TYP_val);
         else m_s_COST_UP_TYP_val = null;
       
         if(struct.m_s_MRP_EXP_TYP_name != null) m_s_MRP_EXP_TYP_name = new String(struct.m_s_MRP_EXP_TYP_name);
         else m_s_MRP_EXP_TYP_name = null;
       
         if(struct.m_s_MRP_EXP_TYP_val != null) m_s_MRP_EXP_TYP_val = new String(struct.m_s_MRP_EXP_TYP_val);
         else m_s_MRP_EXP_TYP_val = null;
       
         if(struct.m_SEQ_NO != null) m_SEQ_NO = new Long(struct.m_SEQ_NO.longValue());
         else m_SEQ_NO = null;
       
         if(struct.m_ACCESS_TYP != null) m_ACCESS_TYP = new Integer(struct.m_ACCESS_TYP.intValue());
         else m_ACCESS_TYP = null;
       
         if(struct.m_CMPLT_FLG != null) m_CMPLT_FLG = new Integer(struct.m_CMPLT_FLG.intValue());
         else m_CMPLT_FLG = null;
       
         if(struct.m_MRP_ODR_TYP != null) m_MRP_ODR_TYP = new Integer(struct.m_MRP_ODR_TYP.intValue());
         else m_MRP_ODR_TYP = null;
       
         if(struct.m_NO != null) m_NO = new Integer(struct.m_NO.intValue());
         else m_NO = null;    
        }
       
       
        /**
         * �R�s�[�R���X�g���N�^
         */
         public AA0020010Struct(AA0020010Struct struct)
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
         m_PS_EDITION = AA0020Common._PS_EDITION;
         m_PS_UNIT_DENOMINATOR = AA0020Common._PS_UNIT_DENOMINATOR;
         m_PS_UNIT_NUMERATOR = AA0020Common._PS_UNIT_NUMERATOR;
         m_s_CONS_TYP = AA0020Common._CONS_TYP;
         m_PS_LT_FLG = AA0020Common._PS_LT_FLG;
         m_s_COST_UP_TYP = AA0020Common._COST_UP_TYP;
         m_s_MRP_EXP_TYP = AA0020Common._MRP_EXP_TYP;
         m_PS_SPOIL = AA0020Common._PS_SPOIL;
         m_PS_FIXED_LT = AA0020Common._PS_FIXED_LT;
         m_PS_PROP_LT = AA0020Common._PS_PROP_LT;
         m_PS_PROP_LOT_SIZE = AA0020Common._PS_PROP_LOT_SIZE;
         return;
         }
       
        //------------------------------------------------------------------------------
       
        //}}user_implement_code

	//////////////////////////////

}
