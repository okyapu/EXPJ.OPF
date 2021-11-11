/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0020/src/com/nec/jp/orteus/metamorBase/AA0020/AA0020030Struct.java,v $
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

public class AA0020030Struct extends DataStruct
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
	/** �� 6 �ϐ��F m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** �� 7 �ϐ��F m_in_DEVELOP_TYP */
	public String m_in_DEVELOP_TYP = null;
	/** �� 8 �ϐ��F m_in_ITEM_CD */
	public String m_in_ITEM_CD = null;
	/** �� 9 �ϐ��F m_PRINT_DATE */
	public String m_PRINT_DATE = null;
	/** �� 10 �ϐ��F m_PRINT_TIME */
	public String m_PRINT_TIME = null;
	/** �� 11 �ϐ��F m_in_ITEM_NAME */
	public String m_in_ITEM_NAME = null;
	/** �� 12 �ϐ��F m_in_TARGET_DATE */
	public String m_in_TARGET_DATE = null;
	/** �� 13 �ϐ��F m_in_LEVEL */
	public String m_in_LEVEL = null;
	/** �� 14 �ϐ��F m_CURRENT_PAGE */
	public String m_CURRENT_PAGE = null;
	/** �� 15 �ϐ��F m_TOTAL_PAGE */
	public String m_TOTAL_PAGE = null;
	/** �� 16 �ϐ��F m_LEVEL */
	public String m_LEVEL = null;
	/** �� 17 �ϐ��F m_COST_UP_TYP */
	public String m_COST_UP_TYP = null;
	/** �� 18 �ϐ��F m_MRP_EXP_TYP */
	public String m_MRP_EXP_TYP = null;
	/** �� 19 �ϐ��F m_CONS_TYP */
	public String m_CONS_TYP = null;
	/** �� 20 �ϐ��F m_in_DEVELOP_TYP_flg */
	public String m_in_DEVELOP_TYP_flg = null;
	/** �� 21 �ϐ��F m_in_ITEM_CD_flg */
	public String m_in_ITEM_CD_flg = null;
	/** �� 22 �ϐ��F m_in_ITEM_NAME_flg */
	public String m_in_ITEM_NAME_flg = null;
	/** �� 23 �ϐ��F m_in_TARGET_DATE_flg */
	public String m_in_TARGET_DATE_flg = null;
	/** �� 24 �ϐ��F m_in_LEVEL_flg */
	public String m_in_LEVEL_flg = null;
	/** �� 25 �ϐ��F m_PARENT_MRP_ODR_TYP */
	public String m_PARENT_MRP_ODR_TYP = null;
	/** �� 26 �ϐ��F m_MRP_ODR_TYP */
	public String m_MRP_ODR_TYP = null;
	/** �� 27 �ϐ��F m_PARENT_OUTSIDE_TYP */
	public String m_PARENT_OUTSIDE_TYP = null;
	/** �� 28 �ϐ��F m_OUTSIDE_TYP */
	public String m_OUTSIDE_TYP = null;
	/** �� 29 �ϐ��F m_NO */
	public Integer m_NO = null;
	/** �� 30 �ϐ��F m_sysUser */
	public String m_sysUser = null;
	/** �� 31 �ϐ��F m_sysDateTime */
	public String m_sysDateTime = null;
	/** �� 32 �ϐ��F m_PRINT_SQL_NO */
	public Integer m_PRINT_SQL_NO = null;
	/** �� 33 �ϐ��F m_str_CONS_TYP */
	public String m_str_CONS_TYP = null;
	/** �� 34 �ϐ��F m_str_PS_LT_FLG */
	public String m_str_PS_LT_FLG = null;
	/** �� 35 �ϐ��F m_str_COST_UP_TYP */
	public String m_str_COST_UP_TYP = null;
	/** �� 36 �ϐ��F m_str_MRP_EXP_TYP */
	public String m_str_MRP_EXP_TYP = null;
	/** �� 37 �ϐ��F m_strNO */
	public String m_strNO = null;
	/** �� 38 �ϐ��F m_PARENT_ITEM_CD */
	public String m_PARENT_ITEM_CD = null;
	/** �� 39 �ϐ��F m_PARENT_ITEM_NAME */
	public String m_PARENT_ITEM_NAME = null;
	/** �� 40 �ϐ��F m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** �� 41 �ϐ��F m_w_TARGET_ITEM_CD */
	public String m_w_TARGET_ITEM_CD = null;
	/** �� 42 �ϐ��F m_COMP_ITEM_CD */
	public String m_COMP_ITEM_CD = null;
	/** �� 43 �ϐ��F m_PS_EDITION */
	public String m_PS_EDITION = null;
	/** �� 44 �ϐ��F m_PS_UNIT_DENOMINATOR */
	public String m_PS_UNIT_DENOMINATOR = null;
	/** �� 45 �ϐ��F m_PS_UNIT_NUMERATOR */
	public String m_PS_UNIT_NUMERATOR = null;
	/** �� 46 �ϐ��F m_EFF_PHASE_IN_DATE */
	public String m_EFF_PHASE_IN_DATE = null;
	/** �� 47 �ϐ��F m_EFF_PHASE_OUT_DATE */
	public String m_EFF_PHASE_OUT_DATE = null;
	/** �� 48 �ϐ��F m_PS_SPOIL */
	public String m_PS_SPOIL = null;
	/** �� 49 �ϐ��F m_s_CONS_TYP */
	public Integer m_s_CONS_TYP = null;
	/** �� 50 �ϐ��F m_PS_LT_FLG */
	public Integer m_PS_LT_FLG = null;
	/** �� 51 �ϐ��F m_PS_FIXED_LT */
	public String m_PS_FIXED_LT = null;
	/** �� 52 �ϐ��F m_PS_PROP_LT */
	public String m_PS_PROP_LT = null;
	/** �� 53 �ϐ��F m_PS_PROP_LOT_SIZE */
	public String m_PS_PROP_LOT_SIZE = null;
	/** �� 54 �ϐ��F m_PS_REF_NO */
	public String m_PS_REF_NO = null;
	/** �� 55 �ϐ��F m_s_COST_UP_TYP */
	public Integer m_s_COST_UP_TYP = null;
	/** �� 56 �ϐ��F m_s_MRP_EXP_TYP */
	public Integer m_s_MRP_EXP_TYP = null;
	/** �� 57 �ϐ��F m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** �� 58 �ϐ��F m_COMP_ITEM_NAME */
	public String m_COMP_ITEM_NAME = null;

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

	/** �� 6 List�ϐ��F l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** �� 7 List�ϐ��F l_in_DEVELOP_TYP */
	public List l_in_DEVELOP_TYP = null;

	/** �� 8 List�ϐ��F l_in_ITEM_CD */
	public List l_in_ITEM_CD = null;

	/** �� 9 List�ϐ��F l_PRINT_DATE */
	public List l_PRINT_DATE = null;

	/** �� 10 List�ϐ��F l_PRINT_TIME */
	public List l_PRINT_TIME = null;

	/** �� 11 List�ϐ��F l_in_ITEM_NAME */
	public List l_in_ITEM_NAME = null;

	/** �� 12 List�ϐ��F l_in_TARGET_DATE */
	public List l_in_TARGET_DATE = null;

	/** �� 13 List�ϐ��F l_in_LEVEL */
	public List l_in_LEVEL = null;

	/** �� 14 List�ϐ��F l_CURRENT_PAGE */
	public List l_CURRENT_PAGE = null;

	/** �� 15 List�ϐ��F l_TOTAL_PAGE */
	public List l_TOTAL_PAGE = null;

	/** �� 16 List�ϐ��F l_LEVEL */
	public List l_LEVEL = null;

	/** �� 17 List�ϐ��F l_COST_UP_TYP */
	public List l_COST_UP_TYP = null;

	/** �� 18 List�ϐ��F l_MRP_EXP_TYP */
	public List l_MRP_EXP_TYP = null;

	/** �� 19 List�ϐ��F l_CONS_TYP */
	public List l_CONS_TYP = null;

	/** �� 20 List�ϐ��F l_in_DEVELOP_TYP_flg */
	public List l_in_DEVELOP_TYP_flg = null;

	/** �� 21 List�ϐ��F l_in_ITEM_CD_flg */
	public List l_in_ITEM_CD_flg = null;

	/** �� 22 List�ϐ��F l_in_ITEM_NAME_flg */
	public List l_in_ITEM_NAME_flg = null;

	/** �� 23 List�ϐ��F l_in_TARGET_DATE_flg */
	public List l_in_TARGET_DATE_flg = null;

	/** �� 24 List�ϐ��F l_in_LEVEL_flg */
	public List l_in_LEVEL_flg = null;

	/** �� 25 List�ϐ��F l_PARENT_MRP_ODR_TYP */
	public List l_PARENT_MRP_ODR_TYP = null;

	/** �� 26 List�ϐ��F l_MRP_ODR_TYP */
	public List l_MRP_ODR_TYP = null;

	/** �� 27 List�ϐ��F l_PARENT_OUTSIDE_TYP */
	public List l_PARENT_OUTSIDE_TYP = null;

	/** �� 28 List�ϐ��F l_OUTSIDE_TYP */
	public List l_OUTSIDE_TYP = null;

	/** �� 29 List�ϐ��F l_NO */
	public List l_NO = null;

	/** �� 30 List�ϐ��F l_sysUser */
	public List l_sysUser = null;

	/** �� 31 List�ϐ��F l_sysDateTime */
	public List l_sysDateTime = null;

	/** �� 32 List�ϐ��F l_PRINT_SQL_NO */
	public List l_PRINT_SQL_NO = null;

	/** �� 33 List�ϐ��F l_str_CONS_TYP */
	public List l_str_CONS_TYP = null;

	/** �� 34 List�ϐ��F l_str_PS_LT_FLG */
	public List l_str_PS_LT_FLG = null;

	/** �� 35 List�ϐ��F l_str_COST_UP_TYP */
	public List l_str_COST_UP_TYP = null;

	/** �� 36 List�ϐ��F l_str_MRP_EXP_TYP */
	public List l_str_MRP_EXP_TYP = null;

	/** �� 37 List�ϐ��F l_strNO */
	public List l_strNO = null;

	/** �� 38 List�ϐ��F l_PARENT_ITEM_CD */
	public List l_PARENT_ITEM_CD = null;

	/** �� 39 List�ϐ��F l_PARENT_ITEM_NAME */
	public List l_PARENT_ITEM_NAME = null;

	/** �� 40 List�ϐ��F l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** �� 41 List�ϐ��F l_w_TARGET_ITEM_CD */
	public List l_w_TARGET_ITEM_CD = null;

	/** �� 42 List�ϐ��F l_COMP_ITEM_CD */
	public List l_COMP_ITEM_CD = null;

	/** �� 43 List�ϐ��F l_PS_EDITION */
	public List l_PS_EDITION = null;

	/** �� 44 List�ϐ��F l_PS_UNIT_DENOMINATOR */
	public List l_PS_UNIT_DENOMINATOR = null;

	/** �� 45 List�ϐ��F l_PS_UNIT_NUMERATOR */
	public List l_PS_UNIT_NUMERATOR = null;

	/** �� 46 List�ϐ��F l_EFF_PHASE_IN_DATE */
	public List l_EFF_PHASE_IN_DATE = null;

	/** �� 47 List�ϐ��F l_EFF_PHASE_OUT_DATE */
	public List l_EFF_PHASE_OUT_DATE = null;

	/** �� 48 List�ϐ��F l_PS_SPOIL */
	public List l_PS_SPOIL = null;

	/** �� 49 List�ϐ��F l_s_CONS_TYP */
	public List l_s_CONS_TYP = null;

	/** �� 50 List�ϐ��F l_PS_LT_FLG */
	public List l_PS_LT_FLG = null;

	/** �� 51 List�ϐ��F l_PS_FIXED_LT */
	public List l_PS_FIXED_LT = null;

	/** �� 52 List�ϐ��F l_PS_PROP_LT */
	public List l_PS_PROP_LT = null;

	/** �� 53 List�ϐ��F l_PS_PROP_LOT_SIZE */
	public List l_PS_PROP_LOT_SIZE = null;

	/** �� 54 List�ϐ��F l_PS_REF_NO */
	public List l_PS_REF_NO = null;

	/** �� 55 List�ϐ��F l_s_COST_UP_TYP */
	public List l_s_COST_UP_TYP = null;

	/** �� 56 List�ϐ��F l_s_MRP_EXP_TYP */
	public List l_s_MRP_EXP_TYP = null;

	/** �� 57 List�ϐ��F l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** �� 58 List�ϐ��F l_COMP_ITEM_NAME */
	public List l_COMP_ITEM_NAME = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getw_TARGET_DATE() { return m_w_TARGET_DATE; }
	public Integer gets_DEVELOP_TYP() { return m_s_DEVELOP_TYP; }
	public String gets_DEVELOP_TYP_name() { return m_s_DEVELOP_TYP_name; }
	public String gets_DEVELOP_TYP_val() { return m_s_DEVELOP_TYP_val; }
	public String getw_LEVEL() { return m_w_LEVEL; }
	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getin_DEVELOP_TYP() { return m_in_DEVELOP_TYP; }
	public String getin_ITEM_CD() { return m_in_ITEM_CD; }
	public String getPRINT_DATE() { return m_PRINT_DATE; }
	public String getPRINT_TIME() { return m_PRINT_TIME; }
	public String getin_ITEM_NAME() { return m_in_ITEM_NAME; }
	public String getin_TARGET_DATE() { return m_in_TARGET_DATE; }
	public String getin_LEVEL() { return m_in_LEVEL; }
	public String getCURRENT_PAGE() { return m_CURRENT_PAGE; }
	public String getTOTAL_PAGE() { return m_TOTAL_PAGE; }
	public String getLEVEL() { return m_LEVEL; }
	public String getCOST_UP_TYP() { return m_COST_UP_TYP; }
	public String getMRP_EXP_TYP() { return m_MRP_EXP_TYP; }
	public String getCONS_TYP() { return m_CONS_TYP; }
	public String getin_DEVELOP_TYP_flg() { return m_in_DEVELOP_TYP_flg; }
	public String getin_ITEM_CD_flg() { return m_in_ITEM_CD_flg; }
	public String getin_ITEM_NAME_flg() { return m_in_ITEM_NAME_flg; }
	public String getin_TARGET_DATE_flg() { return m_in_TARGET_DATE_flg; }
	public String getin_LEVEL_flg() { return m_in_LEVEL_flg; }
	public String getPARENT_MRP_ODR_TYP() { return m_PARENT_MRP_ODR_TYP; }
	public String getMRP_ODR_TYP() { return m_MRP_ODR_TYP; }
	public String getPARENT_OUTSIDE_TYP() { return m_PARENT_OUTSIDE_TYP; }
	public String getOUTSIDE_TYP() { return m_OUTSIDE_TYP; }
	public Integer getNO() { return m_NO; }
	public String getsysUser() { return m_sysUser; }
	public String getsysDateTime() { return m_sysDateTime; }
	public Integer getPRINT_SQL_NO() { return m_PRINT_SQL_NO; }
	public String getstr_CONS_TYP() { return m_str_CONS_TYP; }
	public String getstr_PS_LT_FLG() { return m_str_PS_LT_FLG; }
	public String getstr_COST_UP_TYP() { return m_str_COST_UP_TYP; }
	public String getstr_MRP_EXP_TYP() { return m_str_MRP_EXP_TYP; }
	public String getstrNO() { return m_strNO; }
	public String getPARENT_ITEM_CD() { return m_PARENT_ITEM_CD; }
	public String getPARENT_ITEM_NAME() { return m_PARENT_ITEM_NAME; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getw_TARGET_ITEM_CD() { return m_w_TARGET_ITEM_CD; }
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
	public String getCOMP_ITEM_NAME() { return m_COMP_ITEM_NAME; }

	public List getList_w_TARGET_DATE() { return l_w_TARGET_DATE; }
	public List getList_s_DEVELOP_TYP() { return l_s_DEVELOP_TYP; }
	public List getList_s_DEVELOP_TYP_name() { return l_s_DEVELOP_TYP_name; }
	public List getList_s_DEVELOP_TYP_val() { return l_s_DEVELOP_TYP_val; }
	public List getList_w_LEVEL() { return l_w_LEVEL; }
	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_in_DEVELOP_TYP() { return l_in_DEVELOP_TYP; }
	public List getList_in_ITEM_CD() { return l_in_ITEM_CD; }
	public List getList_PRINT_DATE() { return l_PRINT_DATE; }
	public List getList_PRINT_TIME() { return l_PRINT_TIME; }
	public List getList_in_ITEM_NAME() { return l_in_ITEM_NAME; }
	public List getList_in_TARGET_DATE() { return l_in_TARGET_DATE; }
	public List getList_in_LEVEL() { return l_in_LEVEL; }
	public List getList_CURRENT_PAGE() { return l_CURRENT_PAGE; }
	public List getList_TOTAL_PAGE() { return l_TOTAL_PAGE; }
	public List getList_LEVEL() { return l_LEVEL; }
	public List getList_COST_UP_TYP() { return l_COST_UP_TYP; }
	public List getList_MRP_EXP_TYP() { return l_MRP_EXP_TYP; }
	public List getList_CONS_TYP() { return l_CONS_TYP; }
	public List getList_in_DEVELOP_TYP_flg() { return l_in_DEVELOP_TYP_flg; }
	public List getList_in_ITEM_CD_flg() { return l_in_ITEM_CD_flg; }
	public List getList_in_ITEM_NAME_flg() { return l_in_ITEM_NAME_flg; }
	public List getList_in_TARGET_DATE_flg() { return l_in_TARGET_DATE_flg; }
	public List getList_in_LEVEL_flg() { return l_in_LEVEL_flg; }
	public List getList_PARENT_MRP_ODR_TYP() { return l_PARENT_MRP_ODR_TYP; }
	public List getList_MRP_ODR_TYP() { return l_MRP_ODR_TYP; }
	public List getList_PARENT_OUTSIDE_TYP() { return l_PARENT_OUTSIDE_TYP; }
	public List getList_OUTSIDE_TYP() { return l_OUTSIDE_TYP; }
	public List getList_NO() { return l_NO; }
	public List getList_sysUser() { return l_sysUser; }
	public List getList_sysDateTime() { return l_sysDateTime; }
	public List getList_PRINT_SQL_NO() { return l_PRINT_SQL_NO; }
	public List getList_str_CONS_TYP() { return l_str_CONS_TYP; }
	public List getList_str_PS_LT_FLG() { return l_str_PS_LT_FLG; }
	public List getList_str_COST_UP_TYP() { return l_str_COST_UP_TYP; }
	public List getList_str_MRP_EXP_TYP() { return l_str_MRP_EXP_TYP; }
	public List getList_strNO() { return l_strNO; }
	public List getList_PARENT_ITEM_CD() { return l_PARENT_ITEM_CD; }
	public List getList_PARENT_ITEM_NAME() { return l_PARENT_ITEM_NAME; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_w_TARGET_ITEM_CD() { return l_w_TARGET_ITEM_CD; }
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
	public List getList_COMP_ITEM_NAME() { return l_COMP_ITEM_NAME; }

	public void setw_TARGET_DATE(String val) { m_w_TARGET_DATE = val; }
	public void sets_DEVELOP_TYP(Integer val) { m_s_DEVELOP_TYP = val; }
	public void sets_DEVELOP_TYP_name(String val) { m_s_DEVELOP_TYP_name = val; }
	public void sets_DEVELOP_TYP_val(String val) { m_s_DEVELOP_TYP_val = val; }
	public void setw_LEVEL(String val) { m_w_LEVEL = val; }
	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setin_DEVELOP_TYP(String val) { m_in_DEVELOP_TYP = val; }
	public void setin_ITEM_CD(String val) { m_in_ITEM_CD = val; }
	public void setPRINT_DATE(String val) { m_PRINT_DATE = val; }
	public void setPRINT_TIME(String val) { m_PRINT_TIME = val; }
	public void setin_ITEM_NAME(String val) { m_in_ITEM_NAME = val; }
	public void setin_TARGET_DATE(String val) { m_in_TARGET_DATE = val; }
	public void setin_LEVEL(String val) { m_in_LEVEL = val; }
	public void setCURRENT_PAGE(String val) { m_CURRENT_PAGE = val; }
	public void setTOTAL_PAGE(String val) { m_TOTAL_PAGE = val; }
	public void setLEVEL(String val) { m_LEVEL = val; }
	public void setCOST_UP_TYP(String val) { m_COST_UP_TYP = val; }
	public void setMRP_EXP_TYP(String val) { m_MRP_EXP_TYP = val; }
	public void setCONS_TYP(String val) { m_CONS_TYP = val; }
	public void setin_DEVELOP_TYP_flg(String val) { m_in_DEVELOP_TYP_flg = val; }
	public void setin_ITEM_CD_flg(String val) { m_in_ITEM_CD_flg = val; }
	public void setin_ITEM_NAME_flg(String val) { m_in_ITEM_NAME_flg = val; }
	public void setin_TARGET_DATE_flg(String val) { m_in_TARGET_DATE_flg = val; }
	public void setin_LEVEL_flg(String val) { m_in_LEVEL_flg = val; }
	public void setPARENT_MRP_ODR_TYP(String val) { m_PARENT_MRP_ODR_TYP = val; }
	public void setMRP_ODR_TYP(String val) { m_MRP_ODR_TYP = val; }
	public void setPARENT_OUTSIDE_TYP(String val) { m_PARENT_OUTSIDE_TYP = val; }
	public void setOUTSIDE_TYP(String val) { m_OUTSIDE_TYP = val; }
	public void setNO(Integer val) { m_NO = val; }
	public void setsysUser(String val) { m_sysUser = val; }
	public void setsysDateTime(String val) { m_sysDateTime = val; }
	public void setPRINT_SQL_NO(Integer val) { m_PRINT_SQL_NO = val; }
	public void setstr_CONS_TYP(String val) { m_str_CONS_TYP = val; }
	public void setstr_PS_LT_FLG(String val) { m_str_PS_LT_FLG = val; }
	public void setstr_COST_UP_TYP(String val) { m_str_COST_UP_TYP = val; }
	public void setstr_MRP_EXP_TYP(String val) { m_str_MRP_EXP_TYP = val; }
	public void setstrNO(String val) { m_strNO = val; }
	public void setPARENT_ITEM_CD(String val) { m_PARENT_ITEM_CD = val; }
	public void setPARENT_ITEM_NAME(String val) { m_PARENT_ITEM_NAME = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setw_TARGET_ITEM_CD(String val) { m_w_TARGET_ITEM_CD = val; }
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
	public void setCOMP_ITEM_NAME(String val) { m_COMP_ITEM_NAME = val; }

	public void sets_DEVELOP_TYP(String val) { m_s_DEVELOP_TYP = getInteger(val); }
	public void setNO(String val) { m_NO = getInteger(val); }
	public void setPRINT_SQL_NO(String val) { m_PRINT_SQL_NO = getInteger(val); }
	public void sets_CONS_TYP(String val) { m_s_CONS_TYP = getInteger(val); }
	public void setPS_LT_FLG(String val) { m_PS_LT_FLG = getInteger(val); }
	public void sets_COST_UP_TYP(String val) { m_s_COST_UP_TYP = getInteger(val); }
	public void sets_MRP_EXP_TYP(String val) { m_s_MRP_EXP_TYP = getInteger(val); }

	public void setList_w_TARGET_DATE(List list) { l_w_TARGET_DATE = list; }
	public void setList_s_DEVELOP_TYP(List list) { l_s_DEVELOP_TYP = list; }
	public void setList_s_DEVELOP_TYP_name(List list) { l_s_DEVELOP_TYP_name = list; }
	public void setList_s_DEVELOP_TYP_val(List list) { l_s_DEVELOP_TYP_val = list; }
	public void setList_w_LEVEL(List list) { l_w_LEVEL = list; }
	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_in_DEVELOP_TYP(List list) { l_in_DEVELOP_TYP = list; }
	public void setList_in_ITEM_CD(List list) { l_in_ITEM_CD = list; }
	public void setList_PRINT_DATE(List list) { l_PRINT_DATE = list; }
	public void setList_PRINT_TIME(List list) { l_PRINT_TIME = list; }
	public void setList_in_ITEM_NAME(List list) { l_in_ITEM_NAME = list; }
	public void setList_in_TARGET_DATE(List list) { l_in_TARGET_DATE = list; }
	public void setList_in_LEVEL(List list) { l_in_LEVEL = list; }
	public void setList_CURRENT_PAGE(List list) { l_CURRENT_PAGE = list; }
	public void setList_TOTAL_PAGE(List list) { l_TOTAL_PAGE = list; }
	public void setList_LEVEL(List list) { l_LEVEL = list; }
	public void setList_COST_UP_TYP(List list) { l_COST_UP_TYP = list; }
	public void setList_MRP_EXP_TYP(List list) { l_MRP_EXP_TYP = list; }
	public void setList_CONS_TYP(List list) { l_CONS_TYP = list; }
	public void setList_in_DEVELOP_TYP_flg(List list) { l_in_DEVELOP_TYP_flg = list; }
	public void setList_in_ITEM_CD_flg(List list) { l_in_ITEM_CD_flg = list; }
	public void setList_in_ITEM_NAME_flg(List list) { l_in_ITEM_NAME_flg = list; }
	public void setList_in_TARGET_DATE_flg(List list) { l_in_TARGET_DATE_flg = list; }
	public void setList_in_LEVEL_flg(List list) { l_in_LEVEL_flg = list; }
	public void setList_PARENT_MRP_ODR_TYP(List list) { l_PARENT_MRP_ODR_TYP = list; }
	public void setList_MRP_ODR_TYP(List list) { l_MRP_ODR_TYP = list; }
	public void setList_PARENT_OUTSIDE_TYP(List list) { l_PARENT_OUTSIDE_TYP = list; }
	public void setList_OUTSIDE_TYP(List list) { l_OUTSIDE_TYP = list; }
	public void setList_NO(List list) { l_NO = list; }
	public void setList_sysUser(List list) { l_sysUser = list; }
	public void setList_sysDateTime(List list) { l_sysDateTime = list; }
	public void setList_PRINT_SQL_NO(List list) { l_PRINT_SQL_NO = list; }
	public void setList_str_CONS_TYP(List list) { l_str_CONS_TYP = list; }
	public void setList_str_PS_LT_FLG(List list) { l_str_PS_LT_FLG = list; }
	public void setList_str_COST_UP_TYP(List list) { l_str_COST_UP_TYP = list; }
	public void setList_str_MRP_EXP_TYP(List list) { l_str_MRP_EXP_TYP = list; }
	public void setList_strNO(List list) { l_strNO = list; }
	public void setList_PARENT_ITEM_CD(List list) { l_PARENT_ITEM_CD = list; }
	public void setList_PARENT_ITEM_NAME(List list) { l_PARENT_ITEM_NAME = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_w_TARGET_ITEM_CD(List list) { l_w_TARGET_ITEM_CD = list; }
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
	public void setList_COMP_ITEM_NAME(List list) { l_COMP_ITEM_NAME = list; }

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
			l_w_TARGET_DATE.add(((AA0020030Struct) list.get(i)).getw_TARGET_DATE());
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
			l_s_DEVELOP_TYP.add(((AA0020030Struct) list.get(i)).gets_DEVELOP_TYP());
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
			l_s_DEVELOP_TYP_name.add(((AA0020030Struct) list.get(i)).gets_DEVELOP_TYP_name());
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
			l_s_DEVELOP_TYP_val.add(((AA0020030Struct) list.get(i)).gets_DEVELOP_TYP_val());
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
			l_w_LEVEL.add(((AA0020030Struct) list.get(i)).getw_LEVEL());
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
			l_DOWNLOAD_FILE.add(((AA0020030Struct) list.get(i)).getDOWNLOAD_FILE());
		}
		return size;
	}
	public int setL2L_in_DEVELOP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_DEVELOP_TYP == null) {
			l_in_DEVELOP_TYP = new ArrayList();
		} else {
			l_in_DEVELOP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_DEVELOP_TYP.add(((AA0020030Struct) list.get(i)).getin_DEVELOP_TYP());
		}
		return size;
	}
	public int setL2L_in_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_ITEM_CD == null) {
			l_in_ITEM_CD = new ArrayList();
		} else {
			l_in_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_ITEM_CD.add(((AA0020030Struct) list.get(i)).getin_ITEM_CD());
		}
		return size;
	}
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
			l_PRINT_DATE.add(((AA0020030Struct) list.get(i)).getPRINT_DATE());
		}
		return size;
	}
	public int setL2L_PRINT_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRINT_TIME == null) {
			l_PRINT_TIME = new ArrayList();
		} else {
			l_PRINT_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRINT_TIME.add(((AA0020030Struct) list.get(i)).getPRINT_TIME());
		}
		return size;
	}
	public int setL2L_in_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_ITEM_NAME == null) {
			l_in_ITEM_NAME = new ArrayList();
		} else {
			l_in_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_ITEM_NAME.add(((AA0020030Struct) list.get(i)).getin_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_in_TARGET_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_TARGET_DATE == null) {
			l_in_TARGET_DATE = new ArrayList();
		} else {
			l_in_TARGET_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_TARGET_DATE.add(((AA0020030Struct) list.get(i)).getin_TARGET_DATE());
		}
		return size;
	}
	public int setL2L_in_LEVEL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_LEVEL == null) {
			l_in_LEVEL = new ArrayList();
		} else {
			l_in_LEVEL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_LEVEL.add(((AA0020030Struct) list.get(i)).getin_LEVEL());
		}
		return size;
	}
	public int setL2L_CURRENT_PAGE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CURRENT_PAGE == null) {
			l_CURRENT_PAGE = new ArrayList();
		} else {
			l_CURRENT_PAGE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CURRENT_PAGE.add(((AA0020030Struct) list.get(i)).getCURRENT_PAGE());
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
			l_TOTAL_PAGE.add(((AA0020030Struct) list.get(i)).getTOTAL_PAGE());
		}
		return size;
	}
	public int setL2L_LEVEL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LEVEL == null) {
			l_LEVEL = new ArrayList();
		} else {
			l_LEVEL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LEVEL.add(((AA0020030Struct) list.get(i)).getLEVEL());
		}
		return size;
	}
	public int setL2L_COST_UP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COST_UP_TYP == null) {
			l_COST_UP_TYP = new ArrayList();
		} else {
			l_COST_UP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COST_UP_TYP.add(((AA0020030Struct) list.get(i)).getCOST_UP_TYP());
		}
		return size;
	}
	public int setL2L_MRP_EXP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_EXP_TYP == null) {
			l_MRP_EXP_TYP = new ArrayList();
		} else {
			l_MRP_EXP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_EXP_TYP.add(((AA0020030Struct) list.get(i)).getMRP_EXP_TYP());
		}
		return size;
	}
	public int setL2L_CONS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CONS_TYP == null) {
			l_CONS_TYP = new ArrayList();
		} else {
			l_CONS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CONS_TYP.add(((AA0020030Struct) list.get(i)).getCONS_TYP());
		}
		return size;
	}
	public int setL2L_in_DEVELOP_TYP_flg(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_DEVELOP_TYP_flg == null) {
			l_in_DEVELOP_TYP_flg = new ArrayList();
		} else {
			l_in_DEVELOP_TYP_flg.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_DEVELOP_TYP_flg.add(((AA0020030Struct) list.get(i)).getin_DEVELOP_TYP_flg());
		}
		return size;
	}
	public int setL2L_in_ITEM_CD_flg(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_ITEM_CD_flg == null) {
			l_in_ITEM_CD_flg = new ArrayList();
		} else {
			l_in_ITEM_CD_flg.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_ITEM_CD_flg.add(((AA0020030Struct) list.get(i)).getin_ITEM_CD_flg());
		}
		return size;
	}
	public int setL2L_in_ITEM_NAME_flg(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_ITEM_NAME_flg == null) {
			l_in_ITEM_NAME_flg = new ArrayList();
		} else {
			l_in_ITEM_NAME_flg.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_ITEM_NAME_flg.add(((AA0020030Struct) list.get(i)).getin_ITEM_NAME_flg());
		}
		return size;
	}
	public int setL2L_in_TARGET_DATE_flg(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_TARGET_DATE_flg == null) {
			l_in_TARGET_DATE_flg = new ArrayList();
		} else {
			l_in_TARGET_DATE_flg.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_TARGET_DATE_flg.add(((AA0020030Struct) list.get(i)).getin_TARGET_DATE_flg());
		}
		return size;
	}
	public int setL2L_in_LEVEL_flg(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_in_LEVEL_flg == null) {
			l_in_LEVEL_flg = new ArrayList();
		} else {
			l_in_LEVEL_flg.clear();
		}
		for (int i = 0; i < size; i++) {
			l_in_LEVEL_flg.add(((AA0020030Struct) list.get(i)).getin_LEVEL_flg());
		}
		return size;
	}
	public int setL2L_PARENT_MRP_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PARENT_MRP_ODR_TYP == null) {
			l_PARENT_MRP_ODR_TYP = new ArrayList();
		} else {
			l_PARENT_MRP_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PARENT_MRP_ODR_TYP.add(((AA0020030Struct) list.get(i)).getPARENT_MRP_ODR_TYP());
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
			l_MRP_ODR_TYP.add(((AA0020030Struct) list.get(i)).getMRP_ODR_TYP());
		}
		return size;
	}
	public int setL2L_PARENT_OUTSIDE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PARENT_OUTSIDE_TYP == null) {
			l_PARENT_OUTSIDE_TYP = new ArrayList();
		} else {
			l_PARENT_OUTSIDE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PARENT_OUTSIDE_TYP.add(((AA0020030Struct) list.get(i)).getPARENT_OUTSIDE_TYP());
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
			l_OUTSIDE_TYP.add(((AA0020030Struct) list.get(i)).getOUTSIDE_TYP());
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
			l_NO.add(((AA0020030Struct) list.get(i)).getNO());
		}
		return size;
	}
	public int setL2L_sysUser(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sysUser == null) {
			l_sysUser = new ArrayList();
		} else {
			l_sysUser.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sysUser.add(((AA0020030Struct) list.get(i)).getsysUser());
		}
		return size;
	}
	public int setL2L_sysDateTime(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sysDateTime == null) {
			l_sysDateTime = new ArrayList();
		} else {
			l_sysDateTime.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sysDateTime.add(((AA0020030Struct) list.get(i)).getsysDateTime());
		}
		return size;
	}
	public int setL2L_PRINT_SQL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRINT_SQL_NO == null) {
			l_PRINT_SQL_NO = new ArrayList();
		} else {
			l_PRINT_SQL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRINT_SQL_NO.add(((AA0020030Struct) list.get(i)).getPRINT_SQL_NO());
		}
		return size;
	}
	public int setL2L_str_CONS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_str_CONS_TYP == null) {
			l_str_CONS_TYP = new ArrayList();
		} else {
			l_str_CONS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_str_CONS_TYP.add(((AA0020030Struct) list.get(i)).getstr_CONS_TYP());
		}
		return size;
	}
	public int setL2L_str_PS_LT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_str_PS_LT_FLG == null) {
			l_str_PS_LT_FLG = new ArrayList();
		} else {
			l_str_PS_LT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_str_PS_LT_FLG.add(((AA0020030Struct) list.get(i)).getstr_PS_LT_FLG());
		}
		return size;
	}
	public int setL2L_str_COST_UP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_str_COST_UP_TYP == null) {
			l_str_COST_UP_TYP = new ArrayList();
		} else {
			l_str_COST_UP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_str_COST_UP_TYP.add(((AA0020030Struct) list.get(i)).getstr_COST_UP_TYP());
		}
		return size;
	}
	public int setL2L_str_MRP_EXP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_str_MRP_EXP_TYP == null) {
			l_str_MRP_EXP_TYP = new ArrayList();
		} else {
			l_str_MRP_EXP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_str_MRP_EXP_TYP.add(((AA0020030Struct) list.get(i)).getstr_MRP_EXP_TYP());
		}
		return size;
	}
	public int setL2L_strNO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_strNO == null) {
			l_strNO = new ArrayList();
		} else {
			l_strNO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_strNO.add(((AA0020030Struct) list.get(i)).getstrNO());
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
			l_PARENT_ITEM_CD.add(((AA0020030Struct) list.get(i)).getPARENT_ITEM_CD());
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
			l_PARENT_ITEM_NAME.add(((AA0020030Struct) list.get(i)).getPARENT_ITEM_NAME());
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
			l_STOCK_UNIT.add(((AA0020030Struct) list.get(i)).getSTOCK_UNIT());
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
			l_w_TARGET_ITEM_CD.add(((AA0020030Struct) list.get(i)).getw_TARGET_ITEM_CD());
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
			l_COMP_ITEM_CD.add(((AA0020030Struct) list.get(i)).getCOMP_ITEM_CD());
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
			l_PS_EDITION.add(((AA0020030Struct) list.get(i)).getPS_EDITION());
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
			l_PS_UNIT_DENOMINATOR.add(((AA0020030Struct) list.get(i)).getPS_UNIT_DENOMINATOR());
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
			l_PS_UNIT_NUMERATOR.add(((AA0020030Struct) list.get(i)).getPS_UNIT_NUMERATOR());
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
			l_EFF_PHASE_IN_DATE.add(((AA0020030Struct) list.get(i)).getEFF_PHASE_IN_DATE());
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
			l_EFF_PHASE_OUT_DATE.add(((AA0020030Struct) list.get(i)).getEFF_PHASE_OUT_DATE());
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
			l_PS_SPOIL.add(((AA0020030Struct) list.get(i)).getPS_SPOIL());
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
			l_s_CONS_TYP.add(((AA0020030Struct) list.get(i)).gets_CONS_TYP());
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
			l_PS_LT_FLG.add(((AA0020030Struct) list.get(i)).getPS_LT_FLG());
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
			l_PS_FIXED_LT.add(((AA0020030Struct) list.get(i)).getPS_FIXED_LT());
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
			l_PS_PROP_LT.add(((AA0020030Struct) list.get(i)).getPS_PROP_LT());
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
			l_PS_PROP_LOT_SIZE.add(((AA0020030Struct) list.get(i)).getPS_PROP_LOT_SIZE());
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
			l_PS_REF_NO.add(((AA0020030Struct) list.get(i)).getPS_REF_NO());
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
			l_s_COST_UP_TYP.add(((AA0020030Struct) list.get(i)).gets_COST_UP_TYP());
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
			l_s_MRP_EXP_TYP.add(((AA0020030Struct) list.get(i)).gets_MRP_EXP_TYP());
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
			l_MODIFY_COUNT.add(((AA0020030Struct) list.get(i)).getMODIFY_COUNT());
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
			l_COMP_ITEM_NAME.add(((AA0020030Struct) list.get(i)).getCOMP_ITEM_NAME());
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
		m_DOWNLOAD_FILE = null;
		m_in_DEVELOP_TYP = null;
		m_in_ITEM_CD = null;
		m_PRINT_DATE = null;
		m_PRINT_TIME = null;
		m_in_ITEM_NAME = null;
		m_in_TARGET_DATE = null;
		m_in_LEVEL = null;
		m_CURRENT_PAGE = null;
		m_TOTAL_PAGE = null;
		m_LEVEL = null;
		m_COST_UP_TYP = null;
		m_MRP_EXP_TYP = null;
		m_CONS_TYP = null;
		m_in_DEVELOP_TYP_flg = null;
		m_in_ITEM_CD_flg = null;
		m_in_ITEM_NAME_flg = null;
		m_in_TARGET_DATE_flg = null;
		m_in_LEVEL_flg = null;
		m_PARENT_MRP_ODR_TYP = null;
		m_MRP_ODR_TYP = null;
		m_PARENT_OUTSIDE_TYP = null;
		m_OUTSIDE_TYP = null;
		m_NO = null;
		m_sysUser = null;
		m_sysDateTime = null;
		m_PRINT_SQL_NO = null;
		m_str_CONS_TYP = null;
		m_str_PS_LT_FLG = null;
		m_str_COST_UP_TYP = null;
		m_str_MRP_EXP_TYP = null;
		m_strNO = null;
		m_PARENT_ITEM_CD = null;
		m_PARENT_ITEM_NAME = null;
		m_STOCK_UNIT = null;
		m_w_TARGET_ITEM_CD = null;
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
		m_COMP_ITEM_NAME = null;

		l_w_TARGET_DATE = null;
		l_s_DEVELOP_TYP = null;
		l_s_DEVELOP_TYP_name = null;
		l_s_DEVELOP_TYP_val = null;
		l_w_LEVEL = null;
		l_DOWNLOAD_FILE = null;
		l_in_DEVELOP_TYP = null;
		l_in_ITEM_CD = null;
		l_PRINT_DATE = null;
		l_PRINT_TIME = null;
		l_in_ITEM_NAME = null;
		l_in_TARGET_DATE = null;
		l_in_LEVEL = null;
		l_CURRENT_PAGE = null;
		l_TOTAL_PAGE = null;
		l_LEVEL = null;
		l_COST_UP_TYP = null;
		l_MRP_EXP_TYP = null;
		l_CONS_TYP = null;
		l_in_DEVELOP_TYP_flg = null;
		l_in_ITEM_CD_flg = null;
		l_in_ITEM_NAME_flg = null;
		l_in_TARGET_DATE_flg = null;
		l_in_LEVEL_flg = null;
		l_PARENT_MRP_ODR_TYP = null;
		l_MRP_ODR_TYP = null;
		l_PARENT_OUTSIDE_TYP = null;
		l_OUTSIDE_TYP = null;
		l_NO = null;
		l_sysUser = null;
		l_sysDateTime = null;
		l_PRINT_SQL_NO = null;
		l_str_CONS_TYP = null;
		l_str_PS_LT_FLG = null;
		l_str_COST_UP_TYP = null;
		l_str_MRP_EXP_TYP = null;
		l_strNO = null;
		l_PARENT_ITEM_CD = null;
		l_PARENT_ITEM_NAME = null;
		l_STOCK_UNIT = null;
		l_w_TARGET_ITEM_CD = null;
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
		l_COMP_ITEM_NAME = null;

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
	 * medAA0020030�N���X�̕W���R���X�g���N�^
	 */
	public AA0020030Struct()
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
	public void setStruct(AA0020030Struct struct)
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
	public void setStructM(AA0020030Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setw_TARGET_DATE(struct.getw_TARGET_DATE());
			this.sets_DEVELOP_TYP(struct.gets_DEVELOP_TYP());
			this.sets_DEVELOP_TYP_name(struct.gets_DEVELOP_TYP_name());
			this.sets_DEVELOP_TYP_val(struct.gets_DEVELOP_TYP_val());
			this.setw_LEVEL(struct.getw_LEVEL());
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setin_DEVELOP_TYP(struct.getin_DEVELOP_TYP());
			this.setin_ITEM_CD(struct.getin_ITEM_CD());
			this.setPRINT_DATE(struct.getPRINT_DATE());
			this.setPRINT_TIME(struct.getPRINT_TIME());
			this.setin_ITEM_NAME(struct.getin_ITEM_NAME());
			this.setin_TARGET_DATE(struct.getin_TARGET_DATE());
			this.setin_LEVEL(struct.getin_LEVEL());
			this.setCURRENT_PAGE(struct.getCURRENT_PAGE());
			this.setTOTAL_PAGE(struct.getTOTAL_PAGE());
			this.setLEVEL(struct.getLEVEL());
			this.setCOST_UP_TYP(struct.getCOST_UP_TYP());
			this.setMRP_EXP_TYP(struct.getMRP_EXP_TYP());
			this.setCONS_TYP(struct.getCONS_TYP());
			this.setin_DEVELOP_TYP_flg(struct.getin_DEVELOP_TYP_flg());
			this.setin_ITEM_CD_flg(struct.getin_ITEM_CD_flg());
			this.setin_ITEM_NAME_flg(struct.getin_ITEM_NAME_flg());
			this.setin_TARGET_DATE_flg(struct.getin_TARGET_DATE_flg());
			this.setin_LEVEL_flg(struct.getin_LEVEL_flg());
			this.setPARENT_MRP_ODR_TYP(struct.getPARENT_MRP_ODR_TYP());
			this.setMRP_ODR_TYP(struct.getMRP_ODR_TYP());
			this.setPARENT_OUTSIDE_TYP(struct.getPARENT_OUTSIDE_TYP());
			this.setOUTSIDE_TYP(struct.getOUTSIDE_TYP());
			this.setNO(struct.getNO());
			this.setsysUser(struct.getsysUser());
			this.setsysDateTime(struct.getsysDateTime());
			this.setPRINT_SQL_NO(struct.getPRINT_SQL_NO());
			this.setstr_CONS_TYP(struct.getstr_CONS_TYP());
			this.setstr_PS_LT_FLG(struct.getstr_PS_LT_FLG());
			this.setstr_COST_UP_TYP(struct.getstr_COST_UP_TYP());
			this.setstr_MRP_EXP_TYP(struct.getstr_MRP_EXP_TYP());
			this.setstrNO(struct.getstrNO());
			this.setPARENT_ITEM_CD(struct.getPARENT_ITEM_CD());
			this.setPARENT_ITEM_NAME(struct.getPARENT_ITEM_NAME());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setw_TARGET_ITEM_CD(struct.getw_TARGET_ITEM_CD());
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
			this.setCOMP_ITEM_NAME(struct.getCOMP_ITEM_NAME());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AA0020030Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_w_TARGET_DATE(struct.getList_w_TARGET_DATE());
			this.setList_s_DEVELOP_TYP(struct.getList_s_DEVELOP_TYP());
			this.setList_s_DEVELOP_TYP_name(struct.getList_s_DEVELOP_TYP_name());
			this.setList_s_DEVELOP_TYP_val(struct.getList_s_DEVELOP_TYP_val());
			this.setList_w_LEVEL(struct.getList_w_LEVEL());
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_in_DEVELOP_TYP(struct.getList_in_DEVELOP_TYP());
			this.setList_in_ITEM_CD(struct.getList_in_ITEM_CD());
			this.setList_PRINT_DATE(struct.getList_PRINT_DATE());
			this.setList_PRINT_TIME(struct.getList_PRINT_TIME());
			this.setList_in_ITEM_NAME(struct.getList_in_ITEM_NAME());
			this.setList_in_TARGET_DATE(struct.getList_in_TARGET_DATE());
			this.setList_in_LEVEL(struct.getList_in_LEVEL());
			this.setList_CURRENT_PAGE(struct.getList_CURRENT_PAGE());
			this.setList_TOTAL_PAGE(struct.getList_TOTAL_PAGE());
			this.setList_LEVEL(struct.getList_LEVEL());
			this.setList_COST_UP_TYP(struct.getList_COST_UP_TYP());
			this.setList_MRP_EXP_TYP(struct.getList_MRP_EXP_TYP());
			this.setList_CONS_TYP(struct.getList_CONS_TYP());
			this.setList_in_DEVELOP_TYP_flg(struct.getList_in_DEVELOP_TYP_flg());
			this.setList_in_ITEM_CD_flg(struct.getList_in_ITEM_CD_flg());
			this.setList_in_ITEM_NAME_flg(struct.getList_in_ITEM_NAME_flg());
			this.setList_in_TARGET_DATE_flg(struct.getList_in_TARGET_DATE_flg());
			this.setList_in_LEVEL_flg(struct.getList_in_LEVEL_flg());
			this.setList_PARENT_MRP_ODR_TYP(struct.getList_PARENT_MRP_ODR_TYP());
			this.setList_MRP_ODR_TYP(struct.getList_MRP_ODR_TYP());
			this.setList_PARENT_OUTSIDE_TYP(struct.getList_PARENT_OUTSIDE_TYP());
			this.setList_OUTSIDE_TYP(struct.getList_OUTSIDE_TYP());
			this.setList_NO(struct.getList_NO());
			this.setList_sysUser(struct.getList_sysUser());
			this.setList_sysDateTime(struct.getList_sysDateTime());
			this.setList_PRINT_SQL_NO(struct.getList_PRINT_SQL_NO());
			this.setList_str_CONS_TYP(struct.getList_str_CONS_TYP());
			this.setList_str_PS_LT_FLG(struct.getList_str_PS_LT_FLG());
			this.setList_str_COST_UP_TYP(struct.getList_str_COST_UP_TYP());
			this.setList_str_MRP_EXP_TYP(struct.getList_str_MRP_EXP_TYP());
			this.setList_strNO(struct.getList_strNO());
			this.setList_PARENT_ITEM_CD(struct.getList_PARENT_ITEM_CD());
			this.setList_PARENT_ITEM_NAME(struct.getList_PARENT_ITEM_NAME());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_w_TARGET_ITEM_CD(struct.getList_w_TARGET_ITEM_CD());
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
			this.setList_COMP_ITEM_NAME(struct.getList_COMP_ITEM_NAME());
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

	// �� 6 �ϐ������l�F i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// �� 7 �ϐ������l�F i_in_DEVELOP_TYP


	final static String i_in_DEVELOP_TYP = null;

	// �� 8 �ϐ������l�F i_in_ITEM_CD


	final static String i_in_ITEM_CD = null;

	// �� 9 �ϐ������l�F i_PRINT_DATE


	final static String i_PRINT_DATE = null;

	// �� 10 �ϐ������l�F i_PRINT_TIME


	final static String i_PRINT_TIME = null;

	// �� 11 �ϐ������l�F i_in_ITEM_NAME


	final static String i_in_ITEM_NAME = null;

	// �� 12 �ϐ������l�F i_in_TARGET_DATE


	final static String i_in_TARGET_DATE = null;

	// �� 13 �ϐ������l�F i_in_LEVEL


	final static String i_in_LEVEL = null;

	// �� 14 �ϐ������l�F i_CURRENT_PAGE


	final static String i_CURRENT_PAGE = null;

	// �� 15 �ϐ������l�F i_TOTAL_PAGE


	final static String i_TOTAL_PAGE = null;

	// �� 16 �ϐ������l�F i_LEVEL


	final static String i_LEVEL = null;

	// �� 17 �ϐ������l�F i_COST_UP_TYP


	final static String i_COST_UP_TYP = null;

	// �� 18 �ϐ������l�F i_MRP_EXP_TYP


	final static String i_MRP_EXP_TYP = null;

	// �� 19 �ϐ������l�F i_CONS_TYP


	final static String i_CONS_TYP = null;

	// �� 20 �ϐ������l�F i_in_DEVELOP_TYP_flg


	final static String i_in_DEVELOP_TYP_flg = null;

	// �� 21 �ϐ������l�F i_in_ITEM_CD_flg


	final static String i_in_ITEM_CD_flg = null;

	// �� 22 �ϐ������l�F i_in_ITEM_NAME_flg


	final static String i_in_ITEM_NAME_flg = null;

	// �� 23 �ϐ������l�F i_in_TARGET_DATE_flg


	final static String i_in_TARGET_DATE_flg = null;

	// �� 24 �ϐ������l�F i_in_LEVEL_flg


	final static String i_in_LEVEL_flg = null;

	// �� 25 �ϐ������l�F i_PARENT_MRP_ODR_TYP


	final static String i_PARENT_MRP_ODR_TYP = null;

	// �� 26 �ϐ������l�F i_MRP_ODR_TYP


	final static String i_MRP_ODR_TYP = null;

	// �� 27 �ϐ������l�F i_PARENT_OUTSIDE_TYP


	final static String i_PARENT_OUTSIDE_TYP = null;

	// �� 28 �ϐ������l�F i_OUTSIDE_TYP


	final static String i_OUTSIDE_TYP = null;

	// �� 29 �ϐ������l�F i_NO


	final static Integer i_NO = null;

	// �� 30 �ϐ������l�F i_sysUser


	final static String i_sysUser = null;

	// �� 31 �ϐ������l�F i_sysDateTime


	final static String i_sysDateTime = null;

	// �� 32 �ϐ������l�F i_PRINT_SQL_NO


	final static Integer i_PRINT_SQL_NO = null;

	// �� 33 �ϐ������l�F i_str_CONS_TYP


	final static String i_str_CONS_TYP = null;

	// �� 34 �ϐ������l�F i_str_PS_LT_FLG


	final static String i_str_PS_LT_FLG = null;

	// �� 35 �ϐ������l�F i_str_COST_UP_TYP


	final static String i_str_COST_UP_TYP = null;

	// �� 36 �ϐ������l�F i_str_MRP_EXP_TYP


	final static String i_str_MRP_EXP_TYP = null;

	// �� 37 �ϐ������l�F i_strNO


	final static String i_strNO = null;

	// �� 38 �ϐ������l�F i_PARENT_ITEM_CD


	final static String i_PARENT_ITEM_CD = null;

	// �� 39 �ϐ������l�F i_PARENT_ITEM_NAME


	final static String i_PARENT_ITEM_NAME = null;

	// �� 40 �ϐ������l�F i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// �� 41 �ϐ������l�F i_w_TARGET_ITEM_CD


	final static String i_w_TARGET_ITEM_CD = null;

	// �� 42 �ϐ������l�F i_COMP_ITEM_CD


	final static String i_COMP_ITEM_CD = null;

	// �� 43 �ϐ������l�F i_PS_EDITION


	final static String i_PS_EDITION = null;

	// �� 44 �ϐ������l�F i_PS_UNIT_DENOMINATOR


	final static String i_PS_UNIT_DENOMINATOR = null;

	// �� 45 �ϐ������l�F i_PS_UNIT_NUMERATOR


	final static String i_PS_UNIT_NUMERATOR = null;

	// �� 46 �ϐ������l�F i_EFF_PHASE_IN_DATE


	final static String i_EFF_PHASE_IN_DATE = null;

	// �� 47 �ϐ������l�F i_EFF_PHASE_OUT_DATE


	final static String i_EFF_PHASE_OUT_DATE = null;

	// �� 48 �ϐ������l�F i_PS_SPOIL


	final static String i_PS_SPOIL = null;

	// �� 49 �ϐ������l�F i_s_CONS_TYP


	final static Integer i_s_CONS_TYP = null;

	// �� 50 �ϐ������l�F i_PS_LT_FLG


	final static Integer i_PS_LT_FLG = null;

	// �� 51 �ϐ������l�F i_PS_FIXED_LT


	final static String i_PS_FIXED_LT = null;

	// �� 52 �ϐ������l�F i_PS_PROP_LT


	final static String i_PS_PROP_LT = null;

	// �� 53 �ϐ������l�F i_PS_PROP_LOT_SIZE


	final static String i_PS_PROP_LOT_SIZE = null;

	// �� 54 �ϐ������l�F i_PS_REF_NO


	final static String i_PS_REF_NO = null;

	// �� 55 �ϐ������l�F i_s_COST_UP_TYP


	final static Integer i_s_COST_UP_TYP = null;

	// �� 56 �ϐ������l�F i_s_MRP_EXP_TYP


	final static Integer i_s_MRP_EXP_TYP = null;

	// �� 57 �ϐ������l�F i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// �� 58 �ϐ������l�F i_COMP_ITEM_NAME


	final static String i_COMP_ITEM_NAME = null;

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
        public void copy(AA0020030Struct s)	
        {
         clear();
         if(s.m_PARENT_ITEM_CD != null) m_PARENT_ITEM_CD = new String(s.m_PARENT_ITEM_CD);
         if(s.m_PARENT_ITEM_NAME != null) m_PARENT_ITEM_NAME = new String(s.m_PARENT_ITEM_NAME);
         if(s.m_STOCK_UNIT != null) m_STOCK_UNIT = new String(s.m_STOCK_UNIT);
         if(s.m_w_TARGET_ITEM_CD != null) m_w_TARGET_ITEM_CD = new String(s.m_w_TARGET_ITEM_CD);
         if(s.m_COMP_ITEM_CD != null) m_COMP_ITEM_CD = new String(s.m_COMP_ITEM_CD);
         if(s.m_PS_EDITION != null) m_PS_EDITION = new String(s.m_PS_EDITION);
         if(s.m_PS_UNIT_DENOMINATOR != null) m_PS_UNIT_DENOMINATOR = new String(s.m_PS_UNIT_DENOMINATOR);
         if(s.m_PS_UNIT_NUMERATOR != null) m_PS_UNIT_NUMERATOR = new String(s.m_PS_UNIT_NUMERATOR);
         if(s.m_EFF_PHASE_IN_DATE != null) m_EFF_PHASE_IN_DATE = new String(s.m_EFF_PHASE_IN_DATE);
         if(s.m_EFF_PHASE_OUT_DATE != null) m_EFF_PHASE_OUT_DATE = new String(s.m_EFF_PHASE_OUT_DATE);
         if(s.m_PS_SPOIL != null) m_PS_SPOIL = new String(s.m_PS_SPOIL);
         if(s.m_s_CONS_TYP != null) m_s_CONS_TYP = new Integer(s.m_s_CONS_TYP.intValue());
         if(s.m_PS_LT_FLG != null) m_PS_LT_FLG = new Integer(s.m_PS_LT_FLG.intValue());
         if(s.m_PS_FIXED_LT != null) m_PS_FIXED_LT = new String(s.m_PS_FIXED_LT);
         if(s.m_PS_PROP_LT != null) m_PS_PROP_LT = new String(s.m_PS_PROP_LT);
         if(s.m_PS_PROP_LOT_SIZE != null) m_PS_PROP_LOT_SIZE = new String(s.m_PS_PROP_LOT_SIZE);
         if(s.m_PS_REF_NO != null) m_PS_REF_NO = new String(s.m_PS_REF_NO);
         if(s.m_s_COST_UP_TYP != null) m_s_COST_UP_TYP = new Integer(s.m_s_COST_UP_TYP.intValue());
         if(s.m_s_MRP_EXP_TYP != null) m_s_MRP_EXP_TYP = new Integer(s.m_s_MRP_EXP_TYP.intValue());
         if(s.m_MODIFY_COUNT != null) m_MODIFY_COUNT = new String(s.m_MODIFY_COUNT);
         if(s.m_COMP_ITEM_NAME != null) m_COMP_ITEM_NAME = new String(s.m_COMP_ITEM_NAME);
         if(s.m_PARENT_MRP_ODR_TYP != null) m_PARENT_MRP_ODR_TYP = new String(s.m_PARENT_MRP_ODR_TYP);
         if(s.m_MRP_ODR_TYP != null) m_MRP_ODR_TYP = new String(s.m_MRP_ODR_TYP);
         if(s.m_PARENT_OUTSIDE_TYP != null) m_PARENT_OUTSIDE_TYP = new String(s.m_PARENT_OUTSIDE_TYP);
         if(s.m_OUTSIDE_TYP != null) m_OUTSIDE_TYP = new String(s.m_OUTSIDE_TYP);
         if(s.m_w_TARGET_DATE != null) m_w_TARGET_DATE = new String(s.m_w_TARGET_DATE);
         if(s.m_s_DEVELOP_TYP != null) m_s_DEVELOP_TYP = new Integer(s.m_s_DEVELOP_TYP.intValue());
         if(s.m_s_DEVELOP_TYP_name != null) m_s_DEVELOP_TYP_name = new String(s.m_s_DEVELOP_TYP_name);
         if(s.m_s_DEVELOP_TYP_val != null) m_s_DEVELOP_TYP_val = new String(s.m_s_DEVELOP_TYP_val);
         if(s.m_w_LEVEL != null) m_w_LEVEL = new String(s.m_w_LEVEL);
         if(s.m_DOWNLOAD_FILE != null) m_DOWNLOAD_FILE = new String(s.m_DOWNLOAD_FILE);
         if(s.m_NO != null) m_NO = new Integer(s.m_NO.intValue());
        }
        //------------------------------------------------------------------
        //}}user_implement_code

	//////////////////////////////

}
