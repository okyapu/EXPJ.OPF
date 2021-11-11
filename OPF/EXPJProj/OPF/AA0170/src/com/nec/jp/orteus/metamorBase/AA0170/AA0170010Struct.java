/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0170/src/com/nec/jp/orteus/metamorBase/AA0170/AA0170010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0170;

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

public class AA0170010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_sub2_OUTSIDE_TYP_name */
	public String m_sub2_OUTSIDE_TYP_name = null;
	/** �� 2 �ϐ��F m_sub2_OUTSIDE_TYP_val */
	public String m_sub2_OUTSIDE_TYP_val = null;
	/** �� 3 �ϐ��F m_sub2_ACPT_INSPC_TYP_name */
	public String m_sub2_ACPT_INSPC_TYP_name = null;
	/** �� 4 �ϐ��F m_sub2_ACPT_INSPC_TYP_val */
	public String m_sub2_ACPT_INSPC_TYP_val = null;
	/** �� 5 �ϐ��F m_main_TARGET_ITEM_CD */
	public String m_main_TARGET_ITEM_CD = null;
	/** �� 6 �ϐ��F m_main_DEVELOP_TYP */
	public String m_main_DEVELOP_TYP = null;
	/** �� 7 �ϐ��F m_main_DEVELOP_TYP_name */
	public String m_main_DEVELOP_TYP_name = null;
	/** �� 8 �ϐ��F m_main_DEVELOP_TYP_val */
	public String m_main_DEVELOP_TYP_val = null;
	/** �� 9 �ϐ��F m_main_TARGET_DATE */
	public String m_main_TARGET_DATE = null;
	/** �� 10 �ϐ��F m_main_LEVEL */
	public String m_main_LEVEL = null;
	/** �� 11 �ϐ��F m_ps_NO */
	public String m_ps_NO = null;
	/** �� 12 �ϐ��F m_ps_CONS_NAME */
	public String m_ps_CONS_NAME = null;
	/** �� 13 �ϐ��F m_ps_PS_LT_NAME */
	public String m_ps_PS_LT_NAME = null;
	/** �� 14 �ϐ��F m_ps_COST_UP_NAME */
	public String m_ps_COST_UP_NAME = null;
	/** �� 15 �ϐ��F m_ps_MRP_EXP_NAME */
	public String m_ps_MRP_EXP_NAME = null;
	/** �� 16 �ϐ��F m_pr_OUTSIDE_NAME */
	public String m_pr_OUTSIDE_NAME = null;
	/** �� 17 �ϐ��F m_pr_ACPT_INSPC_NAME */
	public String m_pr_ACPT_INSPC_NAME = null;
	/** �� 18 �ϐ��F m_sub1_PARENT_ITEM_NAME */
	public String m_sub1_PARENT_ITEM_NAME = null;
	/** �� 19 �ϐ��F m_sub1_DEVELOP_TYP */
	public String m_sub1_DEVELOP_TYP = null;
	/** �� 20 �ϐ��F m_sub1_COMP_ITEM_NAME */
	public String m_sub1_COMP_ITEM_NAME = null;
	/** �� 21 �ϐ��F m_sub1_MODIFY_COUNT */
	public String m_sub1_MODIFY_COUNT = null;
	/** �� 22 �ϐ��F m_sub1_STOCK_UNIT */
	public String m_sub1_STOCK_UNIT = null;
	/** �� 23 �ϐ��F m_sub1_CONS_TYP_name */
	public String m_sub1_CONS_TYP_name = null;
	/** �� 24 �ϐ��F m_sub1_CONS_TYP_val */
	public String m_sub1_CONS_TYP_val = null;
	/** �� 25 �ϐ��F m_sub1_PS_LT_CHECK */
	public String m_sub1_PS_LT_CHECK = null;
	/** �� 26 �ϐ��F m_sub1_COST_UP_TYP_name */
	public String m_sub1_COST_UP_TYP_name = null;
	/** �� 27 �ϐ��F m_sub1_COST_UP_TYP_val */
	public String m_sub1_COST_UP_TYP_val = null;
	/** �� 28 �ϐ��F m_sub1_MRP_EXP_TYP_name */
	public String m_sub1_MRP_EXP_TYP_name = null;
	/** �� 29 �ϐ��F m_sub1_MRP_EXP_TYP_val */
	public String m_sub1_MRP_EXP_TYP_val = null;
	/** �� 30 �ϐ��F m_sub1_TARGET_ITEM_CD */
	public String m_sub1_TARGET_ITEM_CD = null;
	/** �� 31 �ϐ��F m_sub1_LEVEL */
	public String m_sub1_LEVEL = null;
	/** �� 32 �ϐ��F m_sub1_TARGET_DATE */
	public String m_sub1_TARGET_DATE = null;
	/** �� 33 �ϐ��F m_pr_PS_EDITION */
	public String m_pr_PS_EDITION = null;
	/** �� 34 �ϐ��F m_hidden_ITEM_NAME */
	public String m_hidden_ITEM_NAME = null;
	/** �� 35 �ϐ��F m_sub2_STATUS */
	public String m_sub2_STATUS = null;
	/** �� 36 �ϐ��F m_FIRST_PROC_FLG */
	public String m_FIRST_PROC_FLG = null;
	/** �� 37 �ϐ��F m_sub1_h_PS_UNIT_NUMERATOR */
	public String m_sub1_h_PS_UNIT_NUMERATOR = null;
	/** �� 38 �ϐ��F m_sub1_h_PS_UNIT_DENOMINATOR */
	public String m_sub1_h_PS_UNIT_DENOMINATOR = null;
	/** �� 39 �ϐ��F m_sub2_STOCK_UNIT_1 */
	public String m_sub2_STOCK_UNIT_1 = null;
	/** �� 40 �ϐ��F m_sub2_STOCK_UNIT_2 */
	public String m_sub2_STOCK_UNIT_2 = null;
	/** �� 41 �ϐ��F m_sub2_STOCK_UNIT_3 */
	public String m_sub2_STOCK_UNIT_3 = null;
	/** �� 42 �ϐ��F m_ps_COMP_MANHOUR_NAME */
	public String m_ps_COMP_MANHOUR_NAME = null;
	/** �� 43 �ϐ��F m_ps_PARENT_ITEM_CD */
	public String m_ps_PARENT_ITEM_CD = null;
	/** �� 44 �ϐ��F m_ps_COMP_ITEM_CD */
	public String m_ps_COMP_ITEM_CD = null;
	/** �� 45 �ϐ��F m_ps_PS_EDITION */
	public String m_ps_PS_EDITION = null;
	/** �� 46 �ϐ��F m_ps_PS_UNIT_DENOMINATOR */
	public String m_ps_PS_UNIT_DENOMINATOR = null;
	/** �� 47 �ϐ��F m_ps_PS_UNIT_NUMERATOR */
	public String m_ps_PS_UNIT_NUMERATOR = null;
	/** �� 48 �ϐ��F m_ps_EFF_PHASE_IN_DATE */
	public String m_ps_EFF_PHASE_IN_DATE = null;
	/** �� 49 �ϐ��F m_ps_EFF_PHASE_OUT_DATE */
	public String m_ps_EFF_PHASE_OUT_DATE = null;
	/** �� 50 �ϐ��F m_ps_PS_SPOIL */
	public String m_ps_PS_SPOIL = null;
	/** �� 51 �ϐ��F m_ps_CONS_TYP */
	public String m_ps_CONS_TYP = null;
	/** �� 52 �ϐ��F m_ps_PS_LT_FLG */
	public String m_ps_PS_LT_FLG = null;
	/** �� 53 �ϐ��F m_ps_PS_FIXED_LT */
	public String m_ps_PS_FIXED_LT = null;
	/** �� 54 �ϐ��F m_ps_PS_PROP_LT */
	public String m_ps_PS_PROP_LT = null;
	/** �� 55 �ϐ��F m_ps_PS_PROP_LOT_SIZE */
	public String m_ps_PS_PROP_LOT_SIZE = null;
	/** �� 56 �ϐ��F m_ps_PS_REF_NO */
	public String m_ps_PS_REF_NO = null;
	/** �� 57 �ϐ��F m_ps_COST_UP_TYP */
	public String m_ps_COST_UP_TYP = null;
	/** �� 58 �ϐ��F m_ps_MRP_EXP_TYP */
	public String m_ps_MRP_EXP_TYP = null;
	/** �� 59 �ϐ��F m_ps_MODIFY_COUNT */
	public String m_ps_MODIFY_COUNT = null;
	/** �� 60 �ϐ��F m_ps_PARENT_ITEM_NAME */
	public String m_ps_PARENT_ITEM_NAME = null;
	/** �� 61 �ϐ��F m_ps_COMP_ITEM_NAME */
	public String m_ps_COMP_ITEM_NAME = null;
	/** �� 62 �ϐ��F m_ps_STOCK_UNIT */
	public String m_ps_STOCK_UNIT = null;
	/** �� 63 �ϐ��F m_ps_COMP_MANHOUR_TYP */
	public String m_ps_COMP_MANHOUR_TYP = null;
	/** �� 64 �ϐ��F m_ps_PARENT_MANHOUR_TYP */
	public String m_ps_PARENT_MANHOUR_TYP = null;
	/** �� 65 �ϐ��F m_PARENT_ITEM_CD */
	public String m_PARENT_ITEM_CD = null;
	/** �� 66 �ϐ��F m_COMP_ITEM_CD */
	public String m_COMP_ITEM_CD = null;
	/** �� 67 �ϐ��F m_EFF_PHASE_IN_DATE */
	public String m_EFF_PHASE_IN_DATE = null;
	/** �� 68 �ϐ��F m_EFF_PHASE_OUT_DATE */
	public String m_EFF_PHASE_OUT_DATE = null;
	/** �� 69 �ϐ��F m_sub1_PARENT_ITEM_CD */
	public String m_sub1_PARENT_ITEM_CD = null;
	/** �� 70 �ϐ��F m_sub1_COMP_ITEM_CD */
	public String m_sub1_COMP_ITEM_CD = null;
	/** �� 71 �ϐ��F m_sub1_PS_EDITION */
	public String m_sub1_PS_EDITION = null;
	/** �� 72 �ϐ��F m_sub1_PS_UNIT_DENOMINATOR */
	public String m_sub1_PS_UNIT_DENOMINATOR = null;
	/** �� 73 �ϐ��F m_sub1_PS_UNIT_NUMERATOR */
	public String m_sub1_PS_UNIT_NUMERATOR = null;
	/** �� 74 �ϐ��F m_sub1_EFF_PHASE_IN_DATE */
	public String m_sub1_EFF_PHASE_IN_DATE = null;
	/** �� 75 �ϐ��F m_sub1_EFF_PHASE_OUT_DATE */
	public String m_sub1_EFF_PHASE_OUT_DATE = null;
	/** �� 76 �ϐ��F m_sub1_PS_SPOIL */
	public String m_sub1_PS_SPOIL = null;
	/** �� 77 �ϐ��F m_sub1_CONS_TYP */
	public String m_sub1_CONS_TYP = null;
	/** �� 78 �ϐ��F m_sub1_PS_LT_FLG */
	public String m_sub1_PS_LT_FLG = null;
	/** �� 79 �ϐ��F m_sub1_PS_FIXED_LT */
	public String m_sub1_PS_FIXED_LT = null;
	/** �� 80 �ϐ��F m_sub1_PS_PROP_LT */
	public String m_sub1_PS_PROP_LT = null;
	/** �� 81 �ϐ��F m_sub1_PS_PROP_LOT_SIZE */
	public String m_sub1_PS_PROP_LOT_SIZE = null;
	/** �� 82 �ϐ��F m_sub1_PS_REF_NO */
	public String m_sub1_PS_REF_NO = null;
	/** �� 83 �ϐ��F m_sub1_COST_UP_TYP */
	public String m_sub1_COST_UP_TYP = null;
	/** �� 84 �ϐ��F m_sub1_MRP_EXP_TYP */
	public String m_sub1_MRP_EXP_TYP = null;
	/** �� 85 �ϐ��F m_SEQ_NO */
	public String m_SEQ_NO = null;
	/** �� 86 �ϐ��F m_PS_EDITION */
	public String m_PS_EDITION = null;
	/** �� 87 �ϐ��F m_ACCESS_TYP */
	public String m_ACCESS_TYP = null;
	/** �� 88 �ϐ��F m_CMPLT_FLG */
	public String m_CMPLT_FLG = null;
	/** �� 89 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 90 �ϐ��F m_MRP_ODR_TYP */
	public Integer m_MRP_ODR_TYP = null;
	/** �� 91 �ϐ��F m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** �� 92 �ϐ��F m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** �� 93 �ϐ��F m_DRAW_CD */
	public String m_DRAW_CD = null;
	/** �� 94 �ϐ��F m_SPEC */
	public String m_SPEC = null;
	/** �� 95 �ϐ��F m_ITEM_OUTSIDE_TYP */
	public Integer m_ITEM_OUTSIDE_TYP = null;
	/** �� 96 �ϐ��F m_OPR_RSLT_TYP */
	public Integer m_OPR_RSLT_TYP = null;
	/** �� 97 �ϐ��F m_ITEM_FIXED_LT */
	public Long m_ITEM_FIXED_LT = null;
	/** �� 98 �ϐ��F m_ITEM_PROP_LT */
	public Long m_ITEM_PROP_LT = null;
	/** �� 99 �ϐ��F m_ITEM_PROP_LOT_SIZE */
	public String m_ITEM_PROP_LOT_SIZE = null;
	/** �� 100 �ϐ��F m_ITEM_ISSUE_LT */
	public Long m_ITEM_ISSUE_LT = null;
	/** �� 101 �ϐ��F m_ITEM_SAFETY_LT */
	public Long m_ITEM_SAFETY_LT = null;
	/** �� 102 �ϐ��F m_UNIT_QTY_TYP */
	public Integer m_UNIT_QTY_TYP = null;
	/** �� 103 �ϐ��F m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** �� 104 �ϐ��F m_w_TARGET_ITEM_CD */
	public String m_w_TARGET_ITEM_CD = null;
	/** �� 105 �ϐ��F m_pr_PLANT_CD */
	public String m_pr_PLANT_CD = null;
	/** �� 106 �ϐ��F m_pr_ITEM_CD */
	public String m_pr_ITEM_CD = null;
	/** �� 107 �ϐ��F m_pr_PROC_CD */
	public String m_pr_PROC_CD = null;
	/** �� 108 �ϐ��F m_pr_PROC_NO */
	public String m_pr_PROC_NO = null;
	/** �� 109 �ϐ��F m_pr_PROC_NAME */
	public String m_pr_PROC_NAME = null;
	/** �� 110 �ϐ��F m_pr_WS_CD */
	public String m_pr_WS_CD = null;
	/** �� 111 �ϐ��F m_pr_COMPANY_CD */
	public String m_pr_COMPANY_CD = null;
	/** �� 112 �ϐ��F m_pr_VEND_CD */
	public String m_pr_VEND_CD = null;
	/** �� 113 �ϐ��F m_pr_FIXED_LT */
	public String m_pr_FIXED_LT = null;
	/** �� 114 �ϐ��F m_pr_PROP_LT */
	public String m_pr_PROP_LT = null;
	/** �� 115 �ϐ��F m_pr_SAFETY_LT */
	public String m_pr_SAFETY_LT = null;
	/** �� 116 �ϐ��F m_pr_PROP_LOT_SIZE */
	public String m_pr_PROP_LOT_SIZE = null;
	/** �� 117 �ϐ��F m_pr_SPOIL */
	public String m_pr_SPOIL = null;
	/** �� 118 �ϐ��F m_pr_OUTSIDE_TYP */
	public String m_pr_OUTSIDE_TYP = null;
	/** �� 119 �ϐ��F m_pr_ACPT_INSPC_TYP */
	public String m_pr_ACPT_INSPC_TYP = null;
	/** �� 120 �ϐ��F m_pr_STANDARD_COST */
	public String m_pr_STANDARD_COST = null;
	/** �� 121 �ϐ��F m_pr_MODIFY_COUNT */
	public String m_pr_MODIFY_COUNT = null;
	/** �� 122 �ϐ��F m_pr_UNIT_QTY */
	public String m_pr_UNIT_QTY = null;
	/** �� 123 �ϐ��F m_pr_WORK_TIME */
	public String m_pr_WORK_TIME = null;
	/** �� 124 �ϐ��F m_pr_ITEM_NAME */
	public String m_pr_ITEM_NAME = null;
	/** �� 125 �ϐ��F m_pr_WS_NAME */
	public String m_pr_WS_NAME = null;
	/** �� 126 �ϐ��F m_pr_VEND_NAME */
	public String m_pr_VEND_NAME = null;
	/** �� 127 �ϐ��F m_pr_STOCK_UNIT */
	public String m_pr_STOCK_UNIT = null;
	/** �� 128 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 129 �ϐ��F m_hidden_ITEM_CD */
	public String m_hidden_ITEM_CD = null;
	/** �� 130 �ϐ��F m_PROC_CD */
	public String m_PROC_CD = null;
	/** �� 131 �ϐ��F m_sub2_PLANT_CD */
	public String m_sub2_PLANT_CD = null;
	/** �� 132 �ϐ��F m_sub2_ITEM_CD */
	public String m_sub2_ITEM_CD = null;
	/** �� 133 �ϐ��F m_sub2_PROC_CD */
	public String m_sub2_PROC_CD = null;
	/** �� 134 �ϐ��F m_sub2_PROC_NO */
	public String m_sub2_PROC_NO = null;
	/** �� 135 �ϐ��F m_sub2_PROC_NAME */
	public String m_sub2_PROC_NAME = null;
	/** �� 136 �ϐ��F m_sub2_WS_CD */
	public String m_sub2_WS_CD = null;
	/** �� 137 �ϐ��F m_sub2_COMPANY_CD */
	public String m_sub2_COMPANY_CD = null;
	/** �� 138 �ϐ��F m_sub2_VEND_CD */
	public String m_sub2_VEND_CD = null;
	/** �� 139 �ϐ��F m_sub2_FIXED_LT */
	public String m_sub2_FIXED_LT = null;
	/** �� 140 �ϐ��F m_sub2_PROP_LT */
	public String m_sub2_PROP_LT = null;
	/** �� 141 �ϐ��F m_sub2_SAFETY_LT */
	public String m_sub2_SAFETY_LT = null;
	/** �� 142 �ϐ��F m_sub2_PROP_LOT_SIZE */
	public String m_sub2_PROP_LOT_SIZE = null;
	/** �� 143 �ϐ��F m_sub2_SPOIL */
	public String m_sub2_SPOIL = null;
	/** �� 144 �ϐ��F m_sub2_OUTSIDE_TYP */
	public String m_sub2_OUTSIDE_TYP = null;
	/** �� 145 �ϐ��F m_sub2_ACPT_INSPC_TYP */
	public String m_sub2_ACPT_INSPC_TYP = null;
	/** �� 146 �ϐ��F m_sub2_STANDARD_COST */
	public String m_sub2_STANDARD_COST = null;
	/** �� 147 �ϐ��F m_sub2_UNIT_QTY */
	public String m_sub2_UNIT_QTY = null;
	/** �� 148 �ϐ��F m_sub2_WORK_TIME */
	public String m_sub2_WORK_TIME = null;
	/** �� 149 �ϐ��F m_sub2_MODIFY_COUNT */
	public String m_sub2_MODIFY_COUNT = null;
	/** �� 150 �ϐ��F m_sub2_ITEM_NAME */
	public String m_sub2_ITEM_NAME = null;
	/** �� 151 �ϐ��F m_sub2_WS_NAME */
	public String m_sub2_WS_NAME = null;
	/** �� 152 �ϐ��F m_sub2_VEND_NAME */
	public String m_sub2_VEND_NAME = null;
	/** �� 153 �ϐ��F m_sub2_STOCK_UNIT */
	public String m_sub2_STOCK_UNIT = null;
	/** �� 154 �ϐ��F m_sub2_MANHOUR_TYP */
	public String m_sub2_MANHOUR_TYP = null;
	/** �� 155 �ϐ��F m_WS_CD */
	public String m_WS_CD = null;
	/** �� 156 �ϐ��F m_VEND_CD */
	public String m_VEND_CD = null;
	/** �� 157 �ϐ��F m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** �� 158 �ϐ��F m_PROC_NO */
	public String m_PROC_NO = null;
	/** �� 159 �ϐ��F m_PS_UNIT_DENOMINATOR */
	public String m_PS_UNIT_DENOMINATOR = null;
	/** �� 160 �ϐ��F m_PS_UNIT_NUMERATOR */
	public String m_PS_UNIT_NUMERATOR = null;
	/** �� 161 �ϐ��F m_BY_PRODUCT_CD */
	public String m_BY_PRODUCT_CD = null;
	/** �� 162 �ϐ��F m_BUSINESS_OPR_DATE */
	public String m_BUSINESS_OPR_DATE = null;
	/** �� 163 �ϐ��F m_PARAM_RESULT_DATA */
	public String m_PARAM_RESULT_DATA = null;
	/** �� 164 �ϐ��F m_PARAM_INPUT_DATA */
	public String m_PARAM_INPUT_DATA = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_sub2_OUTSIDE_TYP_name */
	public List l_sub2_OUTSIDE_TYP_name = null;

	/** �� 2 List�ϐ��F l_sub2_OUTSIDE_TYP_val */
	public List l_sub2_OUTSIDE_TYP_val = null;

	/** �� 3 List�ϐ��F l_sub2_ACPT_INSPC_TYP_name */
	public List l_sub2_ACPT_INSPC_TYP_name = null;

	/** �� 4 List�ϐ��F l_sub2_ACPT_INSPC_TYP_val */
	public List l_sub2_ACPT_INSPC_TYP_val = null;

	/** �� 5 List�ϐ��F l_main_TARGET_ITEM_CD */
	public List l_main_TARGET_ITEM_CD = null;

	/** �� 6 List�ϐ��F l_main_DEVELOP_TYP */
	public List l_main_DEVELOP_TYP = null;

	/** �� 7 List�ϐ��F l_main_DEVELOP_TYP_name */
	public List l_main_DEVELOP_TYP_name = null;

	/** �� 8 List�ϐ��F l_main_DEVELOP_TYP_val */
	public List l_main_DEVELOP_TYP_val = null;

	/** �� 9 List�ϐ��F l_main_TARGET_DATE */
	public List l_main_TARGET_DATE = null;

	/** �� 10 List�ϐ��F l_main_LEVEL */
	public List l_main_LEVEL = null;

	/** �� 11 List�ϐ��F l_ps_NO */
	public List l_ps_NO = null;

	/** �� 12 List�ϐ��F l_ps_CONS_NAME */
	public List l_ps_CONS_NAME = null;

	/** �� 13 List�ϐ��F l_ps_PS_LT_NAME */
	public List l_ps_PS_LT_NAME = null;

	/** �� 14 List�ϐ��F l_ps_COST_UP_NAME */
	public List l_ps_COST_UP_NAME = null;

	/** �� 15 List�ϐ��F l_ps_MRP_EXP_NAME */
	public List l_ps_MRP_EXP_NAME = null;

	/** �� 16 List�ϐ��F l_pr_OUTSIDE_NAME */
	public List l_pr_OUTSIDE_NAME = null;

	/** �� 17 List�ϐ��F l_pr_ACPT_INSPC_NAME */
	public List l_pr_ACPT_INSPC_NAME = null;

	/** �� 18 List�ϐ��F l_sub1_PARENT_ITEM_NAME */
	public List l_sub1_PARENT_ITEM_NAME = null;

	/** �� 19 List�ϐ��F l_sub1_DEVELOP_TYP */
	public List l_sub1_DEVELOP_TYP = null;

	/** �� 20 List�ϐ��F l_sub1_COMP_ITEM_NAME */
	public List l_sub1_COMP_ITEM_NAME = null;

	/** �� 21 List�ϐ��F l_sub1_MODIFY_COUNT */
	public List l_sub1_MODIFY_COUNT = null;

	/** �� 22 List�ϐ��F l_sub1_STOCK_UNIT */
	public List l_sub1_STOCK_UNIT = null;

	/** �� 23 List�ϐ��F l_sub1_CONS_TYP_name */
	public List l_sub1_CONS_TYP_name = null;

	/** �� 24 List�ϐ��F l_sub1_CONS_TYP_val */
	public List l_sub1_CONS_TYP_val = null;

	/** �� 25 List�ϐ��F l_sub1_PS_LT_CHECK */
	public List l_sub1_PS_LT_CHECK = null;

	/** �� 26 List�ϐ��F l_sub1_COST_UP_TYP_name */
	public List l_sub1_COST_UP_TYP_name = null;

	/** �� 27 List�ϐ��F l_sub1_COST_UP_TYP_val */
	public List l_sub1_COST_UP_TYP_val = null;

	/** �� 28 List�ϐ��F l_sub1_MRP_EXP_TYP_name */
	public List l_sub1_MRP_EXP_TYP_name = null;

	/** �� 29 List�ϐ��F l_sub1_MRP_EXP_TYP_val */
	public List l_sub1_MRP_EXP_TYP_val = null;

	/** �� 30 List�ϐ��F l_sub1_TARGET_ITEM_CD */
	public List l_sub1_TARGET_ITEM_CD = null;

	/** �� 31 List�ϐ��F l_sub1_LEVEL */
	public List l_sub1_LEVEL = null;

	/** �� 32 List�ϐ��F l_sub1_TARGET_DATE */
	public List l_sub1_TARGET_DATE = null;

	/** �� 33 List�ϐ��F l_pr_PS_EDITION */
	public List l_pr_PS_EDITION = null;

	/** �� 34 List�ϐ��F l_hidden_ITEM_NAME */
	public List l_hidden_ITEM_NAME = null;

	/** �� 35 List�ϐ��F l_sub2_STATUS */
	public List l_sub2_STATUS = null;

	/** �� 36 List�ϐ��F l_FIRST_PROC_FLG */
	public List l_FIRST_PROC_FLG = null;

	/** �� 37 List�ϐ��F l_sub1_h_PS_UNIT_NUMERATOR */
	public List l_sub1_h_PS_UNIT_NUMERATOR = null;

	/** �� 38 List�ϐ��F l_sub1_h_PS_UNIT_DENOMINATOR */
	public List l_sub1_h_PS_UNIT_DENOMINATOR = null;

	/** �� 39 List�ϐ��F l_sub2_STOCK_UNIT_1 */
	public List l_sub2_STOCK_UNIT_1 = null;

	/** �� 40 List�ϐ��F l_sub2_STOCK_UNIT_2 */
	public List l_sub2_STOCK_UNIT_2 = null;

	/** �� 41 List�ϐ��F l_sub2_STOCK_UNIT_3 */
	public List l_sub2_STOCK_UNIT_3 = null;

	/** �� 42 List�ϐ��F l_ps_COMP_MANHOUR_NAME */
	public List l_ps_COMP_MANHOUR_NAME = null;

	/** �� 43 List�ϐ��F l_ps_PARENT_ITEM_CD */
	public List l_ps_PARENT_ITEM_CD = null;

	/** �� 44 List�ϐ��F l_ps_COMP_ITEM_CD */
	public List l_ps_COMP_ITEM_CD = null;

	/** �� 45 List�ϐ��F l_ps_PS_EDITION */
	public List l_ps_PS_EDITION = null;

	/** �� 46 List�ϐ��F l_ps_PS_UNIT_DENOMINATOR */
	public List l_ps_PS_UNIT_DENOMINATOR = null;

	/** �� 47 List�ϐ��F l_ps_PS_UNIT_NUMERATOR */
	public List l_ps_PS_UNIT_NUMERATOR = null;

	/** �� 48 List�ϐ��F l_ps_EFF_PHASE_IN_DATE */
	public List l_ps_EFF_PHASE_IN_DATE = null;

	/** �� 49 List�ϐ��F l_ps_EFF_PHASE_OUT_DATE */
	public List l_ps_EFF_PHASE_OUT_DATE = null;

	/** �� 50 List�ϐ��F l_ps_PS_SPOIL */
	public List l_ps_PS_SPOIL = null;

	/** �� 51 List�ϐ��F l_ps_CONS_TYP */
	public List l_ps_CONS_TYP = null;

	/** �� 52 List�ϐ��F l_ps_PS_LT_FLG */
	public List l_ps_PS_LT_FLG = null;

	/** �� 53 List�ϐ��F l_ps_PS_FIXED_LT */
	public List l_ps_PS_FIXED_LT = null;

	/** �� 54 List�ϐ��F l_ps_PS_PROP_LT */
	public List l_ps_PS_PROP_LT = null;

	/** �� 55 List�ϐ��F l_ps_PS_PROP_LOT_SIZE */
	public List l_ps_PS_PROP_LOT_SIZE = null;

	/** �� 56 List�ϐ��F l_ps_PS_REF_NO */
	public List l_ps_PS_REF_NO = null;

	/** �� 57 List�ϐ��F l_ps_COST_UP_TYP */
	public List l_ps_COST_UP_TYP = null;

	/** �� 58 List�ϐ��F l_ps_MRP_EXP_TYP */
	public List l_ps_MRP_EXP_TYP = null;

	/** �� 59 List�ϐ��F l_ps_MODIFY_COUNT */
	public List l_ps_MODIFY_COUNT = null;

	/** �� 60 List�ϐ��F l_ps_PARENT_ITEM_NAME */
	public List l_ps_PARENT_ITEM_NAME = null;

	/** �� 61 List�ϐ��F l_ps_COMP_ITEM_NAME */
	public List l_ps_COMP_ITEM_NAME = null;

	/** �� 62 List�ϐ��F l_ps_STOCK_UNIT */
	public List l_ps_STOCK_UNIT = null;

	/** �� 63 List�ϐ��F l_ps_COMP_MANHOUR_TYP */
	public List l_ps_COMP_MANHOUR_TYP = null;

	/** �� 64 List�ϐ��F l_ps_PARENT_MANHOUR_TYP */
	public List l_ps_PARENT_MANHOUR_TYP = null;

	/** �� 65 List�ϐ��F l_PARENT_ITEM_CD */
	public List l_PARENT_ITEM_CD = null;

	/** �� 66 List�ϐ��F l_COMP_ITEM_CD */
	public List l_COMP_ITEM_CD = null;

	/** �� 67 List�ϐ��F l_EFF_PHASE_IN_DATE */
	public List l_EFF_PHASE_IN_DATE = null;

	/** �� 68 List�ϐ��F l_EFF_PHASE_OUT_DATE */
	public List l_EFF_PHASE_OUT_DATE = null;

	/** �� 69 List�ϐ��F l_sub1_PARENT_ITEM_CD */
	public List l_sub1_PARENT_ITEM_CD = null;

	/** �� 70 List�ϐ��F l_sub1_COMP_ITEM_CD */
	public List l_sub1_COMP_ITEM_CD = null;

	/** �� 71 List�ϐ��F l_sub1_PS_EDITION */
	public List l_sub1_PS_EDITION = null;

	/** �� 72 List�ϐ��F l_sub1_PS_UNIT_DENOMINATOR */
	public List l_sub1_PS_UNIT_DENOMINATOR = null;

	/** �� 73 List�ϐ��F l_sub1_PS_UNIT_NUMERATOR */
	public List l_sub1_PS_UNIT_NUMERATOR = null;

	/** �� 74 List�ϐ��F l_sub1_EFF_PHASE_IN_DATE */
	public List l_sub1_EFF_PHASE_IN_DATE = null;

	/** �� 75 List�ϐ��F l_sub1_EFF_PHASE_OUT_DATE */
	public List l_sub1_EFF_PHASE_OUT_DATE = null;

	/** �� 76 List�ϐ��F l_sub1_PS_SPOIL */
	public List l_sub1_PS_SPOIL = null;

	/** �� 77 List�ϐ��F l_sub1_CONS_TYP */
	public List l_sub1_CONS_TYP = null;

	/** �� 78 List�ϐ��F l_sub1_PS_LT_FLG */
	public List l_sub1_PS_LT_FLG = null;

	/** �� 79 List�ϐ��F l_sub1_PS_FIXED_LT */
	public List l_sub1_PS_FIXED_LT = null;

	/** �� 80 List�ϐ��F l_sub1_PS_PROP_LT */
	public List l_sub1_PS_PROP_LT = null;

	/** �� 81 List�ϐ��F l_sub1_PS_PROP_LOT_SIZE */
	public List l_sub1_PS_PROP_LOT_SIZE = null;

	/** �� 82 List�ϐ��F l_sub1_PS_REF_NO */
	public List l_sub1_PS_REF_NO = null;

	/** �� 83 List�ϐ��F l_sub1_COST_UP_TYP */
	public List l_sub1_COST_UP_TYP = null;

	/** �� 84 List�ϐ��F l_sub1_MRP_EXP_TYP */
	public List l_sub1_MRP_EXP_TYP = null;

	/** �� 85 List�ϐ��F l_SEQ_NO */
	public List l_SEQ_NO = null;

	/** �� 86 List�ϐ��F l_PS_EDITION */
	public List l_PS_EDITION = null;

	/** �� 87 List�ϐ��F l_ACCESS_TYP */
	public List l_ACCESS_TYP = null;

	/** �� 88 List�ϐ��F l_CMPLT_FLG */
	public List l_CMPLT_FLG = null;

	/** �� 89 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 90 List�ϐ��F l_MRP_ODR_TYP */
	public List l_MRP_ODR_TYP = null;

	/** �� 91 List�ϐ��F l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** �� 92 List�ϐ��F l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** �� 93 List�ϐ��F l_DRAW_CD */
	public List l_DRAW_CD = null;

	/** �� 94 List�ϐ��F l_SPEC */
	public List l_SPEC = null;

	/** �� 95 List�ϐ��F l_ITEM_OUTSIDE_TYP */
	public List l_ITEM_OUTSIDE_TYP = null;

	/** �� 96 List�ϐ��F l_OPR_RSLT_TYP */
	public List l_OPR_RSLT_TYP = null;

	/** �� 97 List�ϐ��F l_ITEM_FIXED_LT */
	public List l_ITEM_FIXED_LT = null;

	/** �� 98 List�ϐ��F l_ITEM_PROP_LT */
	public List l_ITEM_PROP_LT = null;

	/** �� 99 List�ϐ��F l_ITEM_PROP_LOT_SIZE */
	public List l_ITEM_PROP_LOT_SIZE = null;

	/** �� 100 List�ϐ��F l_ITEM_ISSUE_LT */
	public List l_ITEM_ISSUE_LT = null;

	/** �� 101 List�ϐ��F l_ITEM_SAFETY_LT */
	public List l_ITEM_SAFETY_LT = null;

	/** �� 102 List�ϐ��F l_UNIT_QTY_TYP */
	public List l_UNIT_QTY_TYP = null;

	/** �� 103 List�ϐ��F l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** �� 104 List�ϐ��F l_w_TARGET_ITEM_CD */
	public List l_w_TARGET_ITEM_CD = null;

	/** �� 105 List�ϐ��F l_pr_PLANT_CD */
	public List l_pr_PLANT_CD = null;

	/** �� 106 List�ϐ��F l_pr_ITEM_CD */
	public List l_pr_ITEM_CD = null;

	/** �� 107 List�ϐ��F l_pr_PROC_CD */
	public List l_pr_PROC_CD = null;

	/** �� 108 List�ϐ��F l_pr_PROC_NO */
	public List l_pr_PROC_NO = null;

	/** �� 109 List�ϐ��F l_pr_PROC_NAME */
	public List l_pr_PROC_NAME = null;

	/** �� 110 List�ϐ��F l_pr_WS_CD */
	public List l_pr_WS_CD = null;

	/** �� 111 List�ϐ��F l_pr_COMPANY_CD */
	public List l_pr_COMPANY_CD = null;

	/** �� 112 List�ϐ��F l_pr_VEND_CD */
	public List l_pr_VEND_CD = null;

	/** �� 113 List�ϐ��F l_pr_FIXED_LT */
	public List l_pr_FIXED_LT = null;

	/** �� 114 List�ϐ��F l_pr_PROP_LT */
	public List l_pr_PROP_LT = null;

	/** �� 115 List�ϐ��F l_pr_SAFETY_LT */
	public List l_pr_SAFETY_LT = null;

	/** �� 116 List�ϐ��F l_pr_PROP_LOT_SIZE */
	public List l_pr_PROP_LOT_SIZE = null;

	/** �� 117 List�ϐ��F l_pr_SPOIL */
	public List l_pr_SPOIL = null;

	/** �� 118 List�ϐ��F l_pr_OUTSIDE_TYP */
	public List l_pr_OUTSIDE_TYP = null;

	/** �� 119 List�ϐ��F l_pr_ACPT_INSPC_TYP */
	public List l_pr_ACPT_INSPC_TYP = null;

	/** �� 120 List�ϐ��F l_pr_STANDARD_COST */
	public List l_pr_STANDARD_COST = null;

	/** �� 121 List�ϐ��F l_pr_MODIFY_COUNT */
	public List l_pr_MODIFY_COUNT = null;

	/** �� 122 List�ϐ��F l_pr_UNIT_QTY */
	public List l_pr_UNIT_QTY = null;

	/** �� 123 List�ϐ��F l_pr_WORK_TIME */
	public List l_pr_WORK_TIME = null;

	/** �� 124 List�ϐ��F l_pr_ITEM_NAME */
	public List l_pr_ITEM_NAME = null;

	/** �� 125 List�ϐ��F l_pr_WS_NAME */
	public List l_pr_WS_NAME = null;

	/** �� 126 List�ϐ��F l_pr_VEND_NAME */
	public List l_pr_VEND_NAME = null;

	/** �� 127 List�ϐ��F l_pr_STOCK_UNIT */
	public List l_pr_STOCK_UNIT = null;

	/** �� 128 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 129 List�ϐ��F l_hidden_ITEM_CD */
	public List l_hidden_ITEM_CD = null;

	/** �� 130 List�ϐ��F l_PROC_CD */
	public List l_PROC_CD = null;

	/** �� 131 List�ϐ��F l_sub2_PLANT_CD */
	public List l_sub2_PLANT_CD = null;

	/** �� 132 List�ϐ��F l_sub2_ITEM_CD */
	public List l_sub2_ITEM_CD = null;

	/** �� 133 List�ϐ��F l_sub2_PROC_CD */
	public List l_sub2_PROC_CD = null;

	/** �� 134 List�ϐ��F l_sub2_PROC_NO */
	public List l_sub2_PROC_NO = null;

	/** �� 135 List�ϐ��F l_sub2_PROC_NAME */
	public List l_sub2_PROC_NAME = null;

	/** �� 136 List�ϐ��F l_sub2_WS_CD */
	public List l_sub2_WS_CD = null;

	/** �� 137 List�ϐ��F l_sub2_COMPANY_CD */
	public List l_sub2_COMPANY_CD = null;

	/** �� 138 List�ϐ��F l_sub2_VEND_CD */
	public List l_sub2_VEND_CD = null;

	/** �� 139 List�ϐ��F l_sub2_FIXED_LT */
	public List l_sub2_FIXED_LT = null;

	/** �� 140 List�ϐ��F l_sub2_PROP_LT */
	public List l_sub2_PROP_LT = null;

	/** �� 141 List�ϐ��F l_sub2_SAFETY_LT */
	public List l_sub2_SAFETY_LT = null;

	/** �� 142 List�ϐ��F l_sub2_PROP_LOT_SIZE */
	public List l_sub2_PROP_LOT_SIZE = null;

	/** �� 143 List�ϐ��F l_sub2_SPOIL */
	public List l_sub2_SPOIL = null;

	/** �� 144 List�ϐ��F l_sub2_OUTSIDE_TYP */
	public List l_sub2_OUTSIDE_TYP = null;

	/** �� 145 List�ϐ��F l_sub2_ACPT_INSPC_TYP */
	public List l_sub2_ACPT_INSPC_TYP = null;

	/** �� 146 List�ϐ��F l_sub2_STANDARD_COST */
	public List l_sub2_STANDARD_COST = null;

	/** �� 147 List�ϐ��F l_sub2_UNIT_QTY */
	public List l_sub2_UNIT_QTY = null;

	/** �� 148 List�ϐ��F l_sub2_WORK_TIME */
	public List l_sub2_WORK_TIME = null;

	/** �� 149 List�ϐ��F l_sub2_MODIFY_COUNT */
	public List l_sub2_MODIFY_COUNT = null;

	/** �� 150 List�ϐ��F l_sub2_ITEM_NAME */
	public List l_sub2_ITEM_NAME = null;

	/** �� 151 List�ϐ��F l_sub2_WS_NAME */
	public List l_sub2_WS_NAME = null;

	/** �� 152 List�ϐ��F l_sub2_VEND_NAME */
	public List l_sub2_VEND_NAME = null;

	/** �� 153 List�ϐ��F l_sub2_STOCK_UNIT */
	public List l_sub2_STOCK_UNIT = null;

	/** �� 154 List�ϐ��F l_sub2_MANHOUR_TYP */
	public List l_sub2_MANHOUR_TYP = null;

	/** �� 155 List�ϐ��F l_WS_CD */
	public List l_WS_CD = null;

	/** �� 156 List�ϐ��F l_VEND_CD */
	public List l_VEND_CD = null;

	/** �� 157 List�ϐ��F l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** �� 158 List�ϐ��F l_PROC_NO */
	public List l_PROC_NO = null;

	/** �� 159 List�ϐ��F l_PS_UNIT_DENOMINATOR */
	public List l_PS_UNIT_DENOMINATOR = null;

	/** �� 160 List�ϐ��F l_PS_UNIT_NUMERATOR */
	public List l_PS_UNIT_NUMERATOR = null;

	/** �� 161 List�ϐ��F l_BY_PRODUCT_CD */
	public List l_BY_PRODUCT_CD = null;

	/** �� 162 List�ϐ��F l_BUSINESS_OPR_DATE */
	public List l_BUSINESS_OPR_DATE = null;

	/** �� 163 List�ϐ��F l_PARAM_RESULT_DATA */
	public List l_PARAM_RESULT_DATA = null;

	/** �� 164 List�ϐ��F l_PARAM_INPUT_DATA */
	public List l_PARAM_INPUT_DATA = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getsub2_OUTSIDE_TYP_name() { return m_sub2_OUTSIDE_TYP_name; }
	public String getsub2_OUTSIDE_TYP_val() { return m_sub2_OUTSIDE_TYP_val; }
	public String getsub2_ACPT_INSPC_TYP_name() { return m_sub2_ACPT_INSPC_TYP_name; }
	public String getsub2_ACPT_INSPC_TYP_val() { return m_sub2_ACPT_INSPC_TYP_val; }
	public String getmain_TARGET_ITEM_CD() { return m_main_TARGET_ITEM_CD; }
	public String getmain_DEVELOP_TYP() { return m_main_DEVELOP_TYP; }
	public String getmain_DEVELOP_TYP_name() { return m_main_DEVELOP_TYP_name; }
	public String getmain_DEVELOP_TYP_val() { return m_main_DEVELOP_TYP_val; }
	public String getmain_TARGET_DATE() { return m_main_TARGET_DATE; }
	public String getmain_LEVEL() { return m_main_LEVEL; }
	public String getps_NO() { return m_ps_NO; }
	public String getps_CONS_NAME() { return m_ps_CONS_NAME; }
	public String getps_PS_LT_NAME() { return m_ps_PS_LT_NAME; }
	public String getps_COST_UP_NAME() { return m_ps_COST_UP_NAME; }
	public String getps_MRP_EXP_NAME() { return m_ps_MRP_EXP_NAME; }
	public String getpr_OUTSIDE_NAME() { return m_pr_OUTSIDE_NAME; }
	public String getpr_ACPT_INSPC_NAME() { return m_pr_ACPT_INSPC_NAME; }
	public String getsub1_PARENT_ITEM_NAME() { return m_sub1_PARENT_ITEM_NAME; }
	public String getsub1_DEVELOP_TYP() { return m_sub1_DEVELOP_TYP; }
	public String getsub1_COMP_ITEM_NAME() { return m_sub1_COMP_ITEM_NAME; }
	public String getsub1_MODIFY_COUNT() { return m_sub1_MODIFY_COUNT; }
	public String getsub1_STOCK_UNIT() { return m_sub1_STOCK_UNIT; }
	public String getsub1_CONS_TYP_name() { return m_sub1_CONS_TYP_name; }
	public String getsub1_CONS_TYP_val() { return m_sub1_CONS_TYP_val; }
	public String getsub1_PS_LT_CHECK() { return m_sub1_PS_LT_CHECK; }
	public String getsub1_COST_UP_TYP_name() { return m_sub1_COST_UP_TYP_name; }
	public String getsub1_COST_UP_TYP_val() { return m_sub1_COST_UP_TYP_val; }
	public String getsub1_MRP_EXP_TYP_name() { return m_sub1_MRP_EXP_TYP_name; }
	public String getsub1_MRP_EXP_TYP_val() { return m_sub1_MRP_EXP_TYP_val; }
	public String getsub1_TARGET_ITEM_CD() { return m_sub1_TARGET_ITEM_CD; }
	public String getsub1_LEVEL() { return m_sub1_LEVEL; }
	public String getsub1_TARGET_DATE() { return m_sub1_TARGET_DATE; }
	public String getpr_PS_EDITION() { return m_pr_PS_EDITION; }
	public String gethidden_ITEM_NAME() { return m_hidden_ITEM_NAME; }
	public String getsub2_STATUS() { return m_sub2_STATUS; }
	public String getFIRST_PROC_FLG() { return m_FIRST_PROC_FLG; }
	public String getsub1_h_PS_UNIT_NUMERATOR() { return m_sub1_h_PS_UNIT_NUMERATOR; }
	public String getsub1_h_PS_UNIT_DENOMINATOR() { return m_sub1_h_PS_UNIT_DENOMINATOR; }
	public String getsub2_STOCK_UNIT_1() { return m_sub2_STOCK_UNIT_1; }
	public String getsub2_STOCK_UNIT_2() { return m_sub2_STOCK_UNIT_2; }
	public String getsub2_STOCK_UNIT_3() { return m_sub2_STOCK_UNIT_3; }
	public String getps_COMP_MANHOUR_NAME() { return m_ps_COMP_MANHOUR_NAME; }
	public String getps_PARENT_ITEM_CD() { return m_ps_PARENT_ITEM_CD; }
	public String getps_COMP_ITEM_CD() { return m_ps_COMP_ITEM_CD; }
	public String getps_PS_EDITION() { return m_ps_PS_EDITION; }
	public String getps_PS_UNIT_DENOMINATOR() { return m_ps_PS_UNIT_DENOMINATOR; }
	public String getps_PS_UNIT_NUMERATOR() { return m_ps_PS_UNIT_NUMERATOR; }
	public String getps_EFF_PHASE_IN_DATE() { return m_ps_EFF_PHASE_IN_DATE; }
	public String getps_EFF_PHASE_OUT_DATE() { return m_ps_EFF_PHASE_OUT_DATE; }
	public String getps_PS_SPOIL() { return m_ps_PS_SPOIL; }
	public String getps_CONS_TYP() { return m_ps_CONS_TYP; }
	public String getps_PS_LT_FLG() { return m_ps_PS_LT_FLG; }
	public String getps_PS_FIXED_LT() { return m_ps_PS_FIXED_LT; }
	public String getps_PS_PROP_LT() { return m_ps_PS_PROP_LT; }
	public String getps_PS_PROP_LOT_SIZE() { return m_ps_PS_PROP_LOT_SIZE; }
	public String getps_PS_REF_NO() { return m_ps_PS_REF_NO; }
	public String getps_COST_UP_TYP() { return m_ps_COST_UP_TYP; }
	public String getps_MRP_EXP_TYP() { return m_ps_MRP_EXP_TYP; }
	public String getps_MODIFY_COUNT() { return m_ps_MODIFY_COUNT; }
	public String getps_PARENT_ITEM_NAME() { return m_ps_PARENT_ITEM_NAME; }
	public String getps_COMP_ITEM_NAME() { return m_ps_COMP_ITEM_NAME; }
	public String getps_STOCK_UNIT() { return m_ps_STOCK_UNIT; }
	public String getps_COMP_MANHOUR_TYP() { return m_ps_COMP_MANHOUR_TYP; }
	public String getps_PARENT_MANHOUR_TYP() { return m_ps_PARENT_MANHOUR_TYP; }
	public String getPARENT_ITEM_CD() { return m_PARENT_ITEM_CD; }
	public String getCOMP_ITEM_CD() { return m_COMP_ITEM_CD; }
	public String getEFF_PHASE_IN_DATE() { return m_EFF_PHASE_IN_DATE; }
	public String getEFF_PHASE_OUT_DATE() { return m_EFF_PHASE_OUT_DATE; }
	public String getsub1_PARENT_ITEM_CD() { return m_sub1_PARENT_ITEM_CD; }
	public String getsub1_COMP_ITEM_CD() { return m_sub1_COMP_ITEM_CD; }
	public String getsub1_PS_EDITION() { return m_sub1_PS_EDITION; }
	public String getsub1_PS_UNIT_DENOMINATOR() { return m_sub1_PS_UNIT_DENOMINATOR; }
	public String getsub1_PS_UNIT_NUMERATOR() { return m_sub1_PS_UNIT_NUMERATOR; }
	public String getsub1_EFF_PHASE_IN_DATE() { return m_sub1_EFF_PHASE_IN_DATE; }
	public String getsub1_EFF_PHASE_OUT_DATE() { return m_sub1_EFF_PHASE_OUT_DATE; }
	public String getsub1_PS_SPOIL() { return m_sub1_PS_SPOIL; }
	public String getsub1_CONS_TYP() { return m_sub1_CONS_TYP; }
	public String getsub1_PS_LT_FLG() { return m_sub1_PS_LT_FLG; }
	public String getsub1_PS_FIXED_LT() { return m_sub1_PS_FIXED_LT; }
	public String getsub1_PS_PROP_LT() { return m_sub1_PS_PROP_LT; }
	public String getsub1_PS_PROP_LOT_SIZE() { return m_sub1_PS_PROP_LOT_SIZE; }
	public String getsub1_PS_REF_NO() { return m_sub1_PS_REF_NO; }
	public String getsub1_COST_UP_TYP() { return m_sub1_COST_UP_TYP; }
	public String getsub1_MRP_EXP_TYP() { return m_sub1_MRP_EXP_TYP; }
	public String getSEQ_NO() { return m_SEQ_NO; }
	public String getPS_EDITION() { return m_PS_EDITION; }
	public String getACCESS_TYP() { return m_ACCESS_TYP; }
	public String getCMPLT_FLG() { return m_CMPLT_FLG; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public Integer getMRP_ODR_TYP() { return m_MRP_ODR_TYP; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getDRAW_CD() { return m_DRAW_CD; }
	public String getSPEC() { return m_SPEC; }
	public Integer getITEM_OUTSIDE_TYP() { return m_ITEM_OUTSIDE_TYP; }
	public Integer getOPR_RSLT_TYP() { return m_OPR_RSLT_TYP; }
	public Long getITEM_FIXED_LT() { return m_ITEM_FIXED_LT; }
	public Long getITEM_PROP_LT() { return m_ITEM_PROP_LT; }
	public String getITEM_PROP_LOT_SIZE() { return m_ITEM_PROP_LOT_SIZE; }
	public Long getITEM_ISSUE_LT() { return m_ITEM_ISSUE_LT; }
	public Long getITEM_SAFETY_LT() { return m_ITEM_SAFETY_LT; }
	public Integer getUNIT_QTY_TYP() { return m_UNIT_QTY_TYP; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getw_TARGET_ITEM_CD() { return m_w_TARGET_ITEM_CD; }
	public String getpr_PLANT_CD() { return m_pr_PLANT_CD; }
	public String getpr_ITEM_CD() { return m_pr_ITEM_CD; }
	public String getpr_PROC_CD() { return m_pr_PROC_CD; }
	public String getpr_PROC_NO() { return m_pr_PROC_NO; }
	public String getpr_PROC_NAME() { return m_pr_PROC_NAME; }
	public String getpr_WS_CD() { return m_pr_WS_CD; }
	public String getpr_COMPANY_CD() { return m_pr_COMPANY_CD; }
	public String getpr_VEND_CD() { return m_pr_VEND_CD; }
	public String getpr_FIXED_LT() { return m_pr_FIXED_LT; }
	public String getpr_PROP_LT() { return m_pr_PROP_LT; }
	public String getpr_SAFETY_LT() { return m_pr_SAFETY_LT; }
	public String getpr_PROP_LOT_SIZE() { return m_pr_PROP_LOT_SIZE; }
	public String getpr_SPOIL() { return m_pr_SPOIL; }
	public String getpr_OUTSIDE_TYP() { return m_pr_OUTSIDE_TYP; }
	public String getpr_ACPT_INSPC_TYP() { return m_pr_ACPT_INSPC_TYP; }
	public String getpr_STANDARD_COST() { return m_pr_STANDARD_COST; }
	public String getpr_MODIFY_COUNT() { return m_pr_MODIFY_COUNT; }
	public String getpr_UNIT_QTY() { return m_pr_UNIT_QTY; }
	public String getpr_WORK_TIME() { return m_pr_WORK_TIME; }
	public String getpr_ITEM_NAME() { return m_pr_ITEM_NAME; }
	public String getpr_WS_NAME() { return m_pr_WS_NAME; }
	public String getpr_VEND_NAME() { return m_pr_VEND_NAME; }
	public String getpr_STOCK_UNIT() { return m_pr_STOCK_UNIT; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String gethidden_ITEM_CD() { return m_hidden_ITEM_CD; }
	public String getPROC_CD() { return m_PROC_CD; }
	public String getsub2_PLANT_CD() { return m_sub2_PLANT_CD; }
	public String getsub2_ITEM_CD() { return m_sub2_ITEM_CD; }
	public String getsub2_PROC_CD() { return m_sub2_PROC_CD; }
	public String getsub2_PROC_NO() { return m_sub2_PROC_NO; }
	public String getsub2_PROC_NAME() { return m_sub2_PROC_NAME; }
	public String getsub2_WS_CD() { return m_sub2_WS_CD; }
	public String getsub2_COMPANY_CD() { return m_sub2_COMPANY_CD; }
	public String getsub2_VEND_CD() { return m_sub2_VEND_CD; }
	public String getsub2_FIXED_LT() { return m_sub2_FIXED_LT; }
	public String getsub2_PROP_LT() { return m_sub2_PROP_LT; }
	public String getsub2_SAFETY_LT() { return m_sub2_SAFETY_LT; }
	public String getsub2_PROP_LOT_SIZE() { return m_sub2_PROP_LOT_SIZE; }
	public String getsub2_SPOIL() { return m_sub2_SPOIL; }
	public String getsub2_OUTSIDE_TYP() { return m_sub2_OUTSIDE_TYP; }
	public String getsub2_ACPT_INSPC_TYP() { return m_sub2_ACPT_INSPC_TYP; }
	public String getsub2_STANDARD_COST() { return m_sub2_STANDARD_COST; }
	public String getsub2_UNIT_QTY() { return m_sub2_UNIT_QTY; }
	public String getsub2_WORK_TIME() { return m_sub2_WORK_TIME; }
	public String getsub2_MODIFY_COUNT() { return m_sub2_MODIFY_COUNT; }
	public String getsub2_ITEM_NAME() { return m_sub2_ITEM_NAME; }
	public String getsub2_WS_NAME() { return m_sub2_WS_NAME; }
	public String getsub2_VEND_NAME() { return m_sub2_VEND_NAME; }
	public String getsub2_STOCK_UNIT() { return m_sub2_STOCK_UNIT; }
	public String getsub2_MANHOUR_TYP() { return m_sub2_MANHOUR_TYP; }
	public String getWS_CD() { return m_WS_CD; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getPROC_NO() { return m_PROC_NO; }
	public String getPS_UNIT_DENOMINATOR() { return m_PS_UNIT_DENOMINATOR; }
	public String getPS_UNIT_NUMERATOR() { return m_PS_UNIT_NUMERATOR; }
	public String getBY_PRODUCT_CD() { return m_BY_PRODUCT_CD; }
	public String getBUSINESS_OPR_DATE() { return m_BUSINESS_OPR_DATE; }
	public String getPARAM_RESULT_DATA() { return m_PARAM_RESULT_DATA; }
	public String getPARAM_INPUT_DATA() { return m_PARAM_INPUT_DATA; }

	public List getList_sub2_OUTSIDE_TYP_name() { return l_sub2_OUTSIDE_TYP_name; }
	public List getList_sub2_OUTSIDE_TYP_val() { return l_sub2_OUTSIDE_TYP_val; }
	public List getList_sub2_ACPT_INSPC_TYP_name() { return l_sub2_ACPT_INSPC_TYP_name; }
	public List getList_sub2_ACPT_INSPC_TYP_val() { return l_sub2_ACPT_INSPC_TYP_val; }
	public List getList_main_TARGET_ITEM_CD() { return l_main_TARGET_ITEM_CD; }
	public List getList_main_DEVELOP_TYP() { return l_main_DEVELOP_TYP; }
	public List getList_main_DEVELOP_TYP_name() { return l_main_DEVELOP_TYP_name; }
	public List getList_main_DEVELOP_TYP_val() { return l_main_DEVELOP_TYP_val; }
	public List getList_main_TARGET_DATE() { return l_main_TARGET_DATE; }
	public List getList_main_LEVEL() { return l_main_LEVEL; }
	public List getList_ps_NO() { return l_ps_NO; }
	public List getList_ps_CONS_NAME() { return l_ps_CONS_NAME; }
	public List getList_ps_PS_LT_NAME() { return l_ps_PS_LT_NAME; }
	public List getList_ps_COST_UP_NAME() { return l_ps_COST_UP_NAME; }
	public List getList_ps_MRP_EXP_NAME() { return l_ps_MRP_EXP_NAME; }
	public List getList_pr_OUTSIDE_NAME() { return l_pr_OUTSIDE_NAME; }
	public List getList_pr_ACPT_INSPC_NAME() { return l_pr_ACPT_INSPC_NAME; }
	public List getList_sub1_PARENT_ITEM_NAME() { return l_sub1_PARENT_ITEM_NAME; }
	public List getList_sub1_DEVELOP_TYP() { return l_sub1_DEVELOP_TYP; }
	public List getList_sub1_COMP_ITEM_NAME() { return l_sub1_COMP_ITEM_NAME; }
	public List getList_sub1_MODIFY_COUNT() { return l_sub1_MODIFY_COUNT; }
	public List getList_sub1_STOCK_UNIT() { return l_sub1_STOCK_UNIT; }
	public List getList_sub1_CONS_TYP_name() { return l_sub1_CONS_TYP_name; }
	public List getList_sub1_CONS_TYP_val() { return l_sub1_CONS_TYP_val; }
	public List getList_sub1_PS_LT_CHECK() { return l_sub1_PS_LT_CHECK; }
	public List getList_sub1_COST_UP_TYP_name() { return l_sub1_COST_UP_TYP_name; }
	public List getList_sub1_COST_UP_TYP_val() { return l_sub1_COST_UP_TYP_val; }
	public List getList_sub1_MRP_EXP_TYP_name() { return l_sub1_MRP_EXP_TYP_name; }
	public List getList_sub1_MRP_EXP_TYP_val() { return l_sub1_MRP_EXP_TYP_val; }
	public List getList_sub1_TARGET_ITEM_CD() { return l_sub1_TARGET_ITEM_CD; }
	public List getList_sub1_LEVEL() { return l_sub1_LEVEL; }
	public List getList_sub1_TARGET_DATE() { return l_sub1_TARGET_DATE; }
	public List getList_pr_PS_EDITION() { return l_pr_PS_EDITION; }
	public List getList_hidden_ITEM_NAME() { return l_hidden_ITEM_NAME; }
	public List getList_sub2_STATUS() { return l_sub2_STATUS; }
	public List getList_FIRST_PROC_FLG() { return l_FIRST_PROC_FLG; }
	public List getList_sub1_h_PS_UNIT_NUMERATOR() { return l_sub1_h_PS_UNIT_NUMERATOR; }
	public List getList_sub1_h_PS_UNIT_DENOMINATOR() { return l_sub1_h_PS_UNIT_DENOMINATOR; }
	public List getList_sub2_STOCK_UNIT_1() { return l_sub2_STOCK_UNIT_1; }
	public List getList_sub2_STOCK_UNIT_2() { return l_sub2_STOCK_UNIT_2; }
	public List getList_sub2_STOCK_UNIT_3() { return l_sub2_STOCK_UNIT_3; }
	public List getList_ps_COMP_MANHOUR_NAME() { return l_ps_COMP_MANHOUR_NAME; }
	public List getList_ps_PARENT_ITEM_CD() { return l_ps_PARENT_ITEM_CD; }
	public List getList_ps_COMP_ITEM_CD() { return l_ps_COMP_ITEM_CD; }
	public List getList_ps_PS_EDITION() { return l_ps_PS_EDITION; }
	public List getList_ps_PS_UNIT_DENOMINATOR() { return l_ps_PS_UNIT_DENOMINATOR; }
	public List getList_ps_PS_UNIT_NUMERATOR() { return l_ps_PS_UNIT_NUMERATOR; }
	public List getList_ps_EFF_PHASE_IN_DATE() { return l_ps_EFF_PHASE_IN_DATE; }
	public List getList_ps_EFF_PHASE_OUT_DATE() { return l_ps_EFF_PHASE_OUT_DATE; }
	public List getList_ps_PS_SPOIL() { return l_ps_PS_SPOIL; }
	public List getList_ps_CONS_TYP() { return l_ps_CONS_TYP; }
	public List getList_ps_PS_LT_FLG() { return l_ps_PS_LT_FLG; }
	public List getList_ps_PS_FIXED_LT() { return l_ps_PS_FIXED_LT; }
	public List getList_ps_PS_PROP_LT() { return l_ps_PS_PROP_LT; }
	public List getList_ps_PS_PROP_LOT_SIZE() { return l_ps_PS_PROP_LOT_SIZE; }
	public List getList_ps_PS_REF_NO() { return l_ps_PS_REF_NO; }
	public List getList_ps_COST_UP_TYP() { return l_ps_COST_UP_TYP; }
	public List getList_ps_MRP_EXP_TYP() { return l_ps_MRP_EXP_TYP; }
	public List getList_ps_MODIFY_COUNT() { return l_ps_MODIFY_COUNT; }
	public List getList_ps_PARENT_ITEM_NAME() { return l_ps_PARENT_ITEM_NAME; }
	public List getList_ps_COMP_ITEM_NAME() { return l_ps_COMP_ITEM_NAME; }
	public List getList_ps_STOCK_UNIT() { return l_ps_STOCK_UNIT; }
	public List getList_ps_COMP_MANHOUR_TYP() { return l_ps_COMP_MANHOUR_TYP; }
	public List getList_ps_PARENT_MANHOUR_TYP() { return l_ps_PARENT_MANHOUR_TYP; }
	public List getList_PARENT_ITEM_CD() { return l_PARENT_ITEM_CD; }
	public List getList_COMP_ITEM_CD() { return l_COMP_ITEM_CD; }
	public List getList_EFF_PHASE_IN_DATE() { return l_EFF_PHASE_IN_DATE; }
	public List getList_EFF_PHASE_OUT_DATE() { return l_EFF_PHASE_OUT_DATE; }
	public List getList_sub1_PARENT_ITEM_CD() { return l_sub1_PARENT_ITEM_CD; }
	public List getList_sub1_COMP_ITEM_CD() { return l_sub1_COMP_ITEM_CD; }
	public List getList_sub1_PS_EDITION() { return l_sub1_PS_EDITION; }
	public List getList_sub1_PS_UNIT_DENOMINATOR() { return l_sub1_PS_UNIT_DENOMINATOR; }
	public List getList_sub1_PS_UNIT_NUMERATOR() { return l_sub1_PS_UNIT_NUMERATOR; }
	public List getList_sub1_EFF_PHASE_IN_DATE() { return l_sub1_EFF_PHASE_IN_DATE; }
	public List getList_sub1_EFF_PHASE_OUT_DATE() { return l_sub1_EFF_PHASE_OUT_DATE; }
	public List getList_sub1_PS_SPOIL() { return l_sub1_PS_SPOIL; }
	public List getList_sub1_CONS_TYP() { return l_sub1_CONS_TYP; }
	public List getList_sub1_PS_LT_FLG() { return l_sub1_PS_LT_FLG; }
	public List getList_sub1_PS_FIXED_LT() { return l_sub1_PS_FIXED_LT; }
	public List getList_sub1_PS_PROP_LT() { return l_sub1_PS_PROP_LT; }
	public List getList_sub1_PS_PROP_LOT_SIZE() { return l_sub1_PS_PROP_LOT_SIZE; }
	public List getList_sub1_PS_REF_NO() { return l_sub1_PS_REF_NO; }
	public List getList_sub1_COST_UP_TYP() { return l_sub1_COST_UP_TYP; }
	public List getList_sub1_MRP_EXP_TYP() { return l_sub1_MRP_EXP_TYP; }
	public List getList_SEQ_NO() { return l_SEQ_NO; }
	public List getList_PS_EDITION() { return l_PS_EDITION; }
	public List getList_ACCESS_TYP() { return l_ACCESS_TYP; }
	public List getList_CMPLT_FLG() { return l_CMPLT_FLG; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_MRP_ODR_TYP() { return l_MRP_ODR_TYP; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_DRAW_CD() { return l_DRAW_CD; }
	public List getList_SPEC() { return l_SPEC; }
	public List getList_ITEM_OUTSIDE_TYP() { return l_ITEM_OUTSIDE_TYP; }
	public List getList_OPR_RSLT_TYP() { return l_OPR_RSLT_TYP; }
	public List getList_ITEM_FIXED_LT() { return l_ITEM_FIXED_LT; }
	public List getList_ITEM_PROP_LT() { return l_ITEM_PROP_LT; }
	public List getList_ITEM_PROP_LOT_SIZE() { return l_ITEM_PROP_LOT_SIZE; }
	public List getList_ITEM_ISSUE_LT() { return l_ITEM_ISSUE_LT; }
	public List getList_ITEM_SAFETY_LT() { return l_ITEM_SAFETY_LT; }
	public List getList_UNIT_QTY_TYP() { return l_UNIT_QTY_TYP; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_w_TARGET_ITEM_CD() { return l_w_TARGET_ITEM_CD; }
	public List getList_pr_PLANT_CD() { return l_pr_PLANT_CD; }
	public List getList_pr_ITEM_CD() { return l_pr_ITEM_CD; }
	public List getList_pr_PROC_CD() { return l_pr_PROC_CD; }
	public List getList_pr_PROC_NO() { return l_pr_PROC_NO; }
	public List getList_pr_PROC_NAME() { return l_pr_PROC_NAME; }
	public List getList_pr_WS_CD() { return l_pr_WS_CD; }
	public List getList_pr_COMPANY_CD() { return l_pr_COMPANY_CD; }
	public List getList_pr_VEND_CD() { return l_pr_VEND_CD; }
	public List getList_pr_FIXED_LT() { return l_pr_FIXED_LT; }
	public List getList_pr_PROP_LT() { return l_pr_PROP_LT; }
	public List getList_pr_SAFETY_LT() { return l_pr_SAFETY_LT; }
	public List getList_pr_PROP_LOT_SIZE() { return l_pr_PROP_LOT_SIZE; }
	public List getList_pr_SPOIL() { return l_pr_SPOIL; }
	public List getList_pr_OUTSIDE_TYP() { return l_pr_OUTSIDE_TYP; }
	public List getList_pr_ACPT_INSPC_TYP() { return l_pr_ACPT_INSPC_TYP; }
	public List getList_pr_STANDARD_COST() { return l_pr_STANDARD_COST; }
	public List getList_pr_MODIFY_COUNT() { return l_pr_MODIFY_COUNT; }
	public List getList_pr_UNIT_QTY() { return l_pr_UNIT_QTY; }
	public List getList_pr_WORK_TIME() { return l_pr_WORK_TIME; }
	public List getList_pr_ITEM_NAME() { return l_pr_ITEM_NAME; }
	public List getList_pr_WS_NAME() { return l_pr_WS_NAME; }
	public List getList_pr_VEND_NAME() { return l_pr_VEND_NAME; }
	public List getList_pr_STOCK_UNIT() { return l_pr_STOCK_UNIT; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_hidden_ITEM_CD() { return l_hidden_ITEM_CD; }
	public List getList_PROC_CD() { return l_PROC_CD; }
	public List getList_sub2_PLANT_CD() { return l_sub2_PLANT_CD; }
	public List getList_sub2_ITEM_CD() { return l_sub2_ITEM_CD; }
	public List getList_sub2_PROC_CD() { return l_sub2_PROC_CD; }
	public List getList_sub2_PROC_NO() { return l_sub2_PROC_NO; }
	public List getList_sub2_PROC_NAME() { return l_sub2_PROC_NAME; }
	public List getList_sub2_WS_CD() { return l_sub2_WS_CD; }
	public List getList_sub2_COMPANY_CD() { return l_sub2_COMPANY_CD; }
	public List getList_sub2_VEND_CD() { return l_sub2_VEND_CD; }
	public List getList_sub2_FIXED_LT() { return l_sub2_FIXED_LT; }
	public List getList_sub2_PROP_LT() { return l_sub2_PROP_LT; }
	public List getList_sub2_SAFETY_LT() { return l_sub2_SAFETY_LT; }
	public List getList_sub2_PROP_LOT_SIZE() { return l_sub2_PROP_LOT_SIZE; }
	public List getList_sub2_SPOIL() { return l_sub2_SPOIL; }
	public List getList_sub2_OUTSIDE_TYP() { return l_sub2_OUTSIDE_TYP; }
	public List getList_sub2_ACPT_INSPC_TYP() { return l_sub2_ACPT_INSPC_TYP; }
	public List getList_sub2_STANDARD_COST() { return l_sub2_STANDARD_COST; }
	public List getList_sub2_UNIT_QTY() { return l_sub2_UNIT_QTY; }
	public List getList_sub2_WORK_TIME() { return l_sub2_WORK_TIME; }
	public List getList_sub2_MODIFY_COUNT() { return l_sub2_MODIFY_COUNT; }
	public List getList_sub2_ITEM_NAME() { return l_sub2_ITEM_NAME; }
	public List getList_sub2_WS_NAME() { return l_sub2_WS_NAME; }
	public List getList_sub2_VEND_NAME() { return l_sub2_VEND_NAME; }
	public List getList_sub2_STOCK_UNIT() { return l_sub2_STOCK_UNIT; }
	public List getList_sub2_MANHOUR_TYP() { return l_sub2_MANHOUR_TYP; }
	public List getList_WS_CD() { return l_WS_CD; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_PROC_NO() { return l_PROC_NO; }
	public List getList_PS_UNIT_DENOMINATOR() { return l_PS_UNIT_DENOMINATOR; }
	public List getList_PS_UNIT_NUMERATOR() { return l_PS_UNIT_NUMERATOR; }
	public List getList_BY_PRODUCT_CD() { return l_BY_PRODUCT_CD; }
	public List getList_BUSINESS_OPR_DATE() { return l_BUSINESS_OPR_DATE; }
	public List getList_PARAM_RESULT_DATA() { return l_PARAM_RESULT_DATA; }
	public List getList_PARAM_INPUT_DATA() { return l_PARAM_INPUT_DATA; }

	public void setsub2_OUTSIDE_TYP_name(String val) { m_sub2_OUTSIDE_TYP_name = val; }
	public void setsub2_OUTSIDE_TYP_val(String val) { m_sub2_OUTSIDE_TYP_val = val; }
	public void setsub2_ACPT_INSPC_TYP_name(String val) { m_sub2_ACPT_INSPC_TYP_name = val; }
	public void setsub2_ACPT_INSPC_TYP_val(String val) { m_sub2_ACPT_INSPC_TYP_val = val; }
	public void setmain_TARGET_ITEM_CD(String val) { m_main_TARGET_ITEM_CD = val; }
	public void setmain_DEVELOP_TYP(String val) { m_main_DEVELOP_TYP = val; }
	public void setmain_DEVELOP_TYP_name(String val) { m_main_DEVELOP_TYP_name = val; }
	public void setmain_DEVELOP_TYP_val(String val) { m_main_DEVELOP_TYP_val = val; }
	public void setmain_TARGET_DATE(String val) { m_main_TARGET_DATE = val; }
	public void setmain_LEVEL(String val) { m_main_LEVEL = val; }
	public void setps_NO(String val) { m_ps_NO = val; }
	public void setps_CONS_NAME(String val) { m_ps_CONS_NAME = val; }
	public void setps_PS_LT_NAME(String val) { m_ps_PS_LT_NAME = val; }
	public void setps_COST_UP_NAME(String val) { m_ps_COST_UP_NAME = val; }
	public void setps_MRP_EXP_NAME(String val) { m_ps_MRP_EXP_NAME = val; }
	public void setpr_OUTSIDE_NAME(String val) { m_pr_OUTSIDE_NAME = val; }
	public void setpr_ACPT_INSPC_NAME(String val) { m_pr_ACPT_INSPC_NAME = val; }
	public void setsub1_PARENT_ITEM_NAME(String val) { m_sub1_PARENT_ITEM_NAME = val; }
	public void setsub1_DEVELOP_TYP(String val) { m_sub1_DEVELOP_TYP = val; }
	public void setsub1_COMP_ITEM_NAME(String val) { m_sub1_COMP_ITEM_NAME = val; }
	public void setsub1_MODIFY_COUNT(String val) { m_sub1_MODIFY_COUNT = val; }
	public void setsub1_STOCK_UNIT(String val) { m_sub1_STOCK_UNIT = val; }
	public void setsub1_CONS_TYP_name(String val) { m_sub1_CONS_TYP_name = val; }
	public void setsub1_CONS_TYP_val(String val) { m_sub1_CONS_TYP_val = val; }
	public void setsub1_PS_LT_CHECK(String val) { m_sub1_PS_LT_CHECK = val; }
	public void setsub1_COST_UP_TYP_name(String val) { m_sub1_COST_UP_TYP_name = val; }
	public void setsub1_COST_UP_TYP_val(String val) { m_sub1_COST_UP_TYP_val = val; }
	public void setsub1_MRP_EXP_TYP_name(String val) { m_sub1_MRP_EXP_TYP_name = val; }
	public void setsub1_MRP_EXP_TYP_val(String val) { m_sub1_MRP_EXP_TYP_val = val; }
	public void setsub1_TARGET_ITEM_CD(String val) { m_sub1_TARGET_ITEM_CD = val; }
	public void setsub1_LEVEL(String val) { m_sub1_LEVEL = val; }
	public void setsub1_TARGET_DATE(String val) { m_sub1_TARGET_DATE = val; }
	public void setpr_PS_EDITION(String val) { m_pr_PS_EDITION = val; }
	public void sethidden_ITEM_NAME(String val) { m_hidden_ITEM_NAME = val; }
	public void setsub2_STATUS(String val) { m_sub2_STATUS = val; }
	public void setFIRST_PROC_FLG(String val) { m_FIRST_PROC_FLG = val; }
	public void setsub1_h_PS_UNIT_NUMERATOR(String val) { m_sub1_h_PS_UNIT_NUMERATOR = val; }
	public void setsub1_h_PS_UNIT_DENOMINATOR(String val) { m_sub1_h_PS_UNIT_DENOMINATOR = val; }
	public void setsub2_STOCK_UNIT_1(String val) { m_sub2_STOCK_UNIT_1 = val; }
	public void setsub2_STOCK_UNIT_2(String val) { m_sub2_STOCK_UNIT_2 = val; }
	public void setsub2_STOCK_UNIT_3(String val) { m_sub2_STOCK_UNIT_3 = val; }
	public void setps_COMP_MANHOUR_NAME(String val) { m_ps_COMP_MANHOUR_NAME = val; }
	public void setps_PARENT_ITEM_CD(String val) { m_ps_PARENT_ITEM_CD = val; }
	public void setps_COMP_ITEM_CD(String val) { m_ps_COMP_ITEM_CD = val; }
	public void setps_PS_EDITION(String val) { m_ps_PS_EDITION = val; }
	public void setps_PS_UNIT_DENOMINATOR(String val) { m_ps_PS_UNIT_DENOMINATOR = val; }
	public void setps_PS_UNIT_NUMERATOR(String val) { m_ps_PS_UNIT_NUMERATOR = val; }
	public void setps_EFF_PHASE_IN_DATE(String val) { m_ps_EFF_PHASE_IN_DATE = val; }
	public void setps_EFF_PHASE_OUT_DATE(String val) { m_ps_EFF_PHASE_OUT_DATE = val; }
	public void setps_PS_SPOIL(String val) { m_ps_PS_SPOIL = val; }
	public void setps_CONS_TYP(String val) { m_ps_CONS_TYP = val; }
	public void setps_PS_LT_FLG(String val) { m_ps_PS_LT_FLG = val; }
	public void setps_PS_FIXED_LT(String val) { m_ps_PS_FIXED_LT = val; }
	public void setps_PS_PROP_LT(String val) { m_ps_PS_PROP_LT = val; }
	public void setps_PS_PROP_LOT_SIZE(String val) { m_ps_PS_PROP_LOT_SIZE = val; }
	public void setps_PS_REF_NO(String val) { m_ps_PS_REF_NO = val; }
	public void setps_COST_UP_TYP(String val) { m_ps_COST_UP_TYP = val; }
	public void setps_MRP_EXP_TYP(String val) { m_ps_MRP_EXP_TYP = val; }
	public void setps_MODIFY_COUNT(String val) { m_ps_MODIFY_COUNT = val; }
	public void setps_PARENT_ITEM_NAME(String val) { m_ps_PARENT_ITEM_NAME = val; }
	public void setps_COMP_ITEM_NAME(String val) { m_ps_COMP_ITEM_NAME = val; }
	public void setps_STOCK_UNIT(String val) { m_ps_STOCK_UNIT = val; }
	public void setps_COMP_MANHOUR_TYP(String val) { m_ps_COMP_MANHOUR_TYP = val; }
	public void setps_PARENT_MANHOUR_TYP(String val) { m_ps_PARENT_MANHOUR_TYP = val; }
	public void setPARENT_ITEM_CD(String val) { m_PARENT_ITEM_CD = val; }
	public void setCOMP_ITEM_CD(String val) { m_COMP_ITEM_CD = val; }
	public void setEFF_PHASE_IN_DATE(String val) { m_EFF_PHASE_IN_DATE = val; }
	public void setEFF_PHASE_OUT_DATE(String val) { m_EFF_PHASE_OUT_DATE = val; }
	public void setsub1_PARENT_ITEM_CD(String val) { m_sub1_PARENT_ITEM_CD = val; }
	public void setsub1_COMP_ITEM_CD(String val) { m_sub1_COMP_ITEM_CD = val; }
	public void setsub1_PS_EDITION(String val) { m_sub1_PS_EDITION = val; }
	public void setsub1_PS_UNIT_DENOMINATOR(String val) { m_sub1_PS_UNIT_DENOMINATOR = val; }
	public void setsub1_PS_UNIT_NUMERATOR(String val) { m_sub1_PS_UNIT_NUMERATOR = val; }
	public void setsub1_EFF_PHASE_IN_DATE(String val) { m_sub1_EFF_PHASE_IN_DATE = val; }
	public void setsub1_EFF_PHASE_OUT_DATE(String val) { m_sub1_EFF_PHASE_OUT_DATE = val; }
	public void setsub1_PS_SPOIL(String val) { m_sub1_PS_SPOIL = val; }
	public void setsub1_CONS_TYP(String val) { m_sub1_CONS_TYP = val; }
	public void setsub1_PS_LT_FLG(String val) { m_sub1_PS_LT_FLG = val; }
	public void setsub1_PS_FIXED_LT(String val) { m_sub1_PS_FIXED_LT = val; }
	public void setsub1_PS_PROP_LT(String val) { m_sub1_PS_PROP_LT = val; }
	public void setsub1_PS_PROP_LOT_SIZE(String val) { m_sub1_PS_PROP_LOT_SIZE = val; }
	public void setsub1_PS_REF_NO(String val) { m_sub1_PS_REF_NO = val; }
	public void setsub1_COST_UP_TYP(String val) { m_sub1_COST_UP_TYP = val; }
	public void setsub1_MRP_EXP_TYP(String val) { m_sub1_MRP_EXP_TYP = val; }
	public void setSEQ_NO(String val) { m_SEQ_NO = val; }
	public void setPS_EDITION(String val) { m_PS_EDITION = val; }
	public void setACCESS_TYP(String val) { m_ACCESS_TYP = val; }
	public void setCMPLT_FLG(String val) { m_CMPLT_FLG = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setMRP_ODR_TYP(Integer val) { m_MRP_ODR_TYP = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setDRAW_CD(String val) { m_DRAW_CD = val; }
	public void setSPEC(String val) { m_SPEC = val; }
	public void setITEM_OUTSIDE_TYP(Integer val) { m_ITEM_OUTSIDE_TYP = val; }
	public void setOPR_RSLT_TYP(Integer val) { m_OPR_RSLT_TYP = val; }
	public void setITEM_FIXED_LT(Long val) { m_ITEM_FIXED_LT = val; }
	public void setITEM_PROP_LT(Long val) { m_ITEM_PROP_LT = val; }
	public void setITEM_PROP_LOT_SIZE(String val) { m_ITEM_PROP_LOT_SIZE = val; }
	public void setITEM_ISSUE_LT(Long val) { m_ITEM_ISSUE_LT = val; }
	public void setITEM_SAFETY_LT(Long val) { m_ITEM_SAFETY_LT = val; }
	public void setUNIT_QTY_TYP(Integer val) { m_UNIT_QTY_TYP = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setw_TARGET_ITEM_CD(String val) { m_w_TARGET_ITEM_CD = val; }
	public void setpr_PLANT_CD(String val) { m_pr_PLANT_CD = val; }
	public void setpr_ITEM_CD(String val) { m_pr_ITEM_CD = val; }
	public void setpr_PROC_CD(String val) { m_pr_PROC_CD = val; }
	public void setpr_PROC_NO(String val) { m_pr_PROC_NO = val; }
	public void setpr_PROC_NAME(String val) { m_pr_PROC_NAME = val; }
	public void setpr_WS_CD(String val) { m_pr_WS_CD = val; }
	public void setpr_COMPANY_CD(String val) { m_pr_COMPANY_CD = val; }
	public void setpr_VEND_CD(String val) { m_pr_VEND_CD = val; }
	public void setpr_FIXED_LT(String val) { m_pr_FIXED_LT = val; }
	public void setpr_PROP_LT(String val) { m_pr_PROP_LT = val; }
	public void setpr_SAFETY_LT(String val) { m_pr_SAFETY_LT = val; }
	public void setpr_PROP_LOT_SIZE(String val) { m_pr_PROP_LOT_SIZE = val; }
	public void setpr_SPOIL(String val) { m_pr_SPOIL = val; }
	public void setpr_OUTSIDE_TYP(String val) { m_pr_OUTSIDE_TYP = val; }
	public void setpr_ACPT_INSPC_TYP(String val) { m_pr_ACPT_INSPC_TYP = val; }
	public void setpr_STANDARD_COST(String val) { m_pr_STANDARD_COST = val; }
	public void setpr_MODIFY_COUNT(String val) { m_pr_MODIFY_COUNT = val; }
	public void setpr_UNIT_QTY(String val) { m_pr_UNIT_QTY = val; }
	public void setpr_WORK_TIME(String val) { m_pr_WORK_TIME = val; }
	public void setpr_ITEM_NAME(String val) { m_pr_ITEM_NAME = val; }
	public void setpr_WS_NAME(String val) { m_pr_WS_NAME = val; }
	public void setpr_VEND_NAME(String val) { m_pr_VEND_NAME = val; }
	public void setpr_STOCK_UNIT(String val) { m_pr_STOCK_UNIT = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void sethidden_ITEM_CD(String val) { m_hidden_ITEM_CD = val; }
	public void setPROC_CD(String val) { m_PROC_CD = val; }
	public void setsub2_PLANT_CD(String val) { m_sub2_PLANT_CD = val; }
	public void setsub2_ITEM_CD(String val) { m_sub2_ITEM_CD = val; }
	public void setsub2_PROC_CD(String val) { m_sub2_PROC_CD = val; }
	public void setsub2_PROC_NO(String val) { m_sub2_PROC_NO = val; }
	public void setsub2_PROC_NAME(String val) { m_sub2_PROC_NAME = val; }
	public void setsub2_WS_CD(String val) { m_sub2_WS_CD = val; }
	public void setsub2_COMPANY_CD(String val) { m_sub2_COMPANY_CD = val; }
	public void setsub2_VEND_CD(String val) { m_sub2_VEND_CD = val; }
	public void setsub2_FIXED_LT(String val) { m_sub2_FIXED_LT = val; }
	public void setsub2_PROP_LT(String val) { m_sub2_PROP_LT = val; }
	public void setsub2_SAFETY_LT(String val) { m_sub2_SAFETY_LT = val; }
	public void setsub2_PROP_LOT_SIZE(String val) { m_sub2_PROP_LOT_SIZE = val; }
	public void setsub2_SPOIL(String val) { m_sub2_SPOIL = val; }
	public void setsub2_OUTSIDE_TYP(String val) { m_sub2_OUTSIDE_TYP = val; }
	public void setsub2_ACPT_INSPC_TYP(String val) { m_sub2_ACPT_INSPC_TYP = val; }
	public void setsub2_STANDARD_COST(String val) { m_sub2_STANDARD_COST = val; }
	public void setsub2_UNIT_QTY(String val) { m_sub2_UNIT_QTY = val; }
	public void setsub2_WORK_TIME(String val) { m_sub2_WORK_TIME = val; }
	public void setsub2_MODIFY_COUNT(String val) { m_sub2_MODIFY_COUNT = val; }
	public void setsub2_ITEM_NAME(String val) { m_sub2_ITEM_NAME = val; }
	public void setsub2_WS_NAME(String val) { m_sub2_WS_NAME = val; }
	public void setsub2_VEND_NAME(String val) { m_sub2_VEND_NAME = val; }
	public void setsub2_STOCK_UNIT(String val) { m_sub2_STOCK_UNIT = val; }
	public void setsub2_MANHOUR_TYP(String val) { m_sub2_MANHOUR_TYP = val; }
	public void setWS_CD(String val) { m_WS_CD = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setPROC_NO(String val) { m_PROC_NO = val; }
	public void setPS_UNIT_DENOMINATOR(String val) { m_PS_UNIT_DENOMINATOR = val; }
	public void setPS_UNIT_NUMERATOR(String val) { m_PS_UNIT_NUMERATOR = val; }
	public void setBY_PRODUCT_CD(String val) { m_BY_PRODUCT_CD = val; }
	public void setBUSINESS_OPR_DATE(String val) { m_BUSINESS_OPR_DATE = val; }
	public void setPARAM_RESULT_DATA(String val) { m_PARAM_RESULT_DATA = val; }
	public void setPARAM_INPUT_DATA(String val) { m_PARAM_INPUT_DATA = val; }

	public void setMRP_ODR_TYP(String val) { m_MRP_ODR_TYP = getInteger(val); }
	public void setITEM_OUTSIDE_TYP(String val) { m_ITEM_OUTSIDE_TYP = getInteger(val); }
	public void setOPR_RSLT_TYP(String val) { m_OPR_RSLT_TYP = getInteger(val); }
	public void setUNIT_QTY_TYP(String val) { m_UNIT_QTY_TYP = getInteger(val); }

	public void setList_sub2_OUTSIDE_TYP_name(List list) { l_sub2_OUTSIDE_TYP_name = list; }
	public void setList_sub2_OUTSIDE_TYP_val(List list) { l_sub2_OUTSIDE_TYP_val = list; }
	public void setList_sub2_ACPT_INSPC_TYP_name(List list) { l_sub2_ACPT_INSPC_TYP_name = list; }
	public void setList_sub2_ACPT_INSPC_TYP_val(List list) { l_sub2_ACPT_INSPC_TYP_val = list; }
	public void setList_main_TARGET_ITEM_CD(List list) { l_main_TARGET_ITEM_CD = list; }
	public void setList_main_DEVELOP_TYP(List list) { l_main_DEVELOP_TYP = list; }
	public void setList_main_DEVELOP_TYP_name(List list) { l_main_DEVELOP_TYP_name = list; }
	public void setList_main_DEVELOP_TYP_val(List list) { l_main_DEVELOP_TYP_val = list; }
	public void setList_main_TARGET_DATE(List list) { l_main_TARGET_DATE = list; }
	public void setList_main_LEVEL(List list) { l_main_LEVEL = list; }
	public void setList_ps_NO(List list) { l_ps_NO = list; }
	public void setList_ps_CONS_NAME(List list) { l_ps_CONS_NAME = list; }
	public void setList_ps_PS_LT_NAME(List list) { l_ps_PS_LT_NAME = list; }
	public void setList_ps_COST_UP_NAME(List list) { l_ps_COST_UP_NAME = list; }
	public void setList_ps_MRP_EXP_NAME(List list) { l_ps_MRP_EXP_NAME = list; }
	public void setList_pr_OUTSIDE_NAME(List list) { l_pr_OUTSIDE_NAME = list; }
	public void setList_pr_ACPT_INSPC_NAME(List list) { l_pr_ACPT_INSPC_NAME = list; }
	public void setList_sub1_PARENT_ITEM_NAME(List list) { l_sub1_PARENT_ITEM_NAME = list; }
	public void setList_sub1_DEVELOP_TYP(List list) { l_sub1_DEVELOP_TYP = list; }
	public void setList_sub1_COMP_ITEM_NAME(List list) { l_sub1_COMP_ITEM_NAME = list; }
	public void setList_sub1_MODIFY_COUNT(List list) { l_sub1_MODIFY_COUNT = list; }
	public void setList_sub1_STOCK_UNIT(List list) { l_sub1_STOCK_UNIT = list; }
	public void setList_sub1_CONS_TYP_name(List list) { l_sub1_CONS_TYP_name = list; }
	public void setList_sub1_CONS_TYP_val(List list) { l_sub1_CONS_TYP_val = list; }
	public void setList_sub1_PS_LT_CHECK(List list) { l_sub1_PS_LT_CHECK = list; }
	public void setList_sub1_COST_UP_TYP_name(List list) { l_sub1_COST_UP_TYP_name = list; }
	public void setList_sub1_COST_UP_TYP_val(List list) { l_sub1_COST_UP_TYP_val = list; }
	public void setList_sub1_MRP_EXP_TYP_name(List list) { l_sub1_MRP_EXP_TYP_name = list; }
	public void setList_sub1_MRP_EXP_TYP_val(List list) { l_sub1_MRP_EXP_TYP_val = list; }
	public void setList_sub1_TARGET_ITEM_CD(List list) { l_sub1_TARGET_ITEM_CD = list; }
	public void setList_sub1_LEVEL(List list) { l_sub1_LEVEL = list; }
	public void setList_sub1_TARGET_DATE(List list) { l_sub1_TARGET_DATE = list; }
	public void setList_pr_PS_EDITION(List list) { l_pr_PS_EDITION = list; }
	public void setList_hidden_ITEM_NAME(List list) { l_hidden_ITEM_NAME = list; }
	public void setList_sub2_STATUS(List list) { l_sub2_STATUS = list; }
	public void setList_FIRST_PROC_FLG(List list) { l_FIRST_PROC_FLG = list; }
	public void setList_sub1_h_PS_UNIT_NUMERATOR(List list) { l_sub1_h_PS_UNIT_NUMERATOR = list; }
	public void setList_sub1_h_PS_UNIT_DENOMINATOR(List list) { l_sub1_h_PS_UNIT_DENOMINATOR = list; }
	public void setList_sub2_STOCK_UNIT_1(List list) { l_sub2_STOCK_UNIT_1 = list; }
	public void setList_sub2_STOCK_UNIT_2(List list) { l_sub2_STOCK_UNIT_2 = list; }
	public void setList_sub2_STOCK_UNIT_3(List list) { l_sub2_STOCK_UNIT_3 = list; }
	public void setList_ps_COMP_MANHOUR_NAME(List list) { l_ps_COMP_MANHOUR_NAME = list; }
	public void setList_ps_PARENT_ITEM_CD(List list) { l_ps_PARENT_ITEM_CD = list; }
	public void setList_ps_COMP_ITEM_CD(List list) { l_ps_COMP_ITEM_CD = list; }
	public void setList_ps_PS_EDITION(List list) { l_ps_PS_EDITION = list; }
	public void setList_ps_PS_UNIT_DENOMINATOR(List list) { l_ps_PS_UNIT_DENOMINATOR = list; }
	public void setList_ps_PS_UNIT_NUMERATOR(List list) { l_ps_PS_UNIT_NUMERATOR = list; }
	public void setList_ps_EFF_PHASE_IN_DATE(List list) { l_ps_EFF_PHASE_IN_DATE = list; }
	public void setList_ps_EFF_PHASE_OUT_DATE(List list) { l_ps_EFF_PHASE_OUT_DATE = list; }
	public void setList_ps_PS_SPOIL(List list) { l_ps_PS_SPOIL = list; }
	public void setList_ps_CONS_TYP(List list) { l_ps_CONS_TYP = list; }
	public void setList_ps_PS_LT_FLG(List list) { l_ps_PS_LT_FLG = list; }
	public void setList_ps_PS_FIXED_LT(List list) { l_ps_PS_FIXED_LT = list; }
	public void setList_ps_PS_PROP_LT(List list) { l_ps_PS_PROP_LT = list; }
	public void setList_ps_PS_PROP_LOT_SIZE(List list) { l_ps_PS_PROP_LOT_SIZE = list; }
	public void setList_ps_PS_REF_NO(List list) { l_ps_PS_REF_NO = list; }
	public void setList_ps_COST_UP_TYP(List list) { l_ps_COST_UP_TYP = list; }
	public void setList_ps_MRP_EXP_TYP(List list) { l_ps_MRP_EXP_TYP = list; }
	public void setList_ps_MODIFY_COUNT(List list) { l_ps_MODIFY_COUNT = list; }
	public void setList_ps_PARENT_ITEM_NAME(List list) { l_ps_PARENT_ITEM_NAME = list; }
	public void setList_ps_COMP_ITEM_NAME(List list) { l_ps_COMP_ITEM_NAME = list; }
	public void setList_ps_STOCK_UNIT(List list) { l_ps_STOCK_UNIT = list; }
	public void setList_ps_COMP_MANHOUR_TYP(List list) { l_ps_COMP_MANHOUR_TYP = list; }
	public void setList_ps_PARENT_MANHOUR_TYP(List list) { l_ps_PARENT_MANHOUR_TYP = list; }
	public void setList_PARENT_ITEM_CD(List list) { l_PARENT_ITEM_CD = list; }
	public void setList_COMP_ITEM_CD(List list) { l_COMP_ITEM_CD = list; }
	public void setList_EFF_PHASE_IN_DATE(List list) { l_EFF_PHASE_IN_DATE = list; }
	public void setList_EFF_PHASE_OUT_DATE(List list) { l_EFF_PHASE_OUT_DATE = list; }
	public void setList_sub1_PARENT_ITEM_CD(List list) { l_sub1_PARENT_ITEM_CD = list; }
	public void setList_sub1_COMP_ITEM_CD(List list) { l_sub1_COMP_ITEM_CD = list; }
	public void setList_sub1_PS_EDITION(List list) { l_sub1_PS_EDITION = list; }
	public void setList_sub1_PS_UNIT_DENOMINATOR(List list) { l_sub1_PS_UNIT_DENOMINATOR = list; }
	public void setList_sub1_PS_UNIT_NUMERATOR(List list) { l_sub1_PS_UNIT_NUMERATOR = list; }
	public void setList_sub1_EFF_PHASE_IN_DATE(List list) { l_sub1_EFF_PHASE_IN_DATE = list; }
	public void setList_sub1_EFF_PHASE_OUT_DATE(List list) { l_sub1_EFF_PHASE_OUT_DATE = list; }
	public void setList_sub1_PS_SPOIL(List list) { l_sub1_PS_SPOIL = list; }
	public void setList_sub1_CONS_TYP(List list) { l_sub1_CONS_TYP = list; }
	public void setList_sub1_PS_LT_FLG(List list) { l_sub1_PS_LT_FLG = list; }
	public void setList_sub1_PS_FIXED_LT(List list) { l_sub1_PS_FIXED_LT = list; }
	public void setList_sub1_PS_PROP_LT(List list) { l_sub1_PS_PROP_LT = list; }
	public void setList_sub1_PS_PROP_LOT_SIZE(List list) { l_sub1_PS_PROP_LOT_SIZE = list; }
	public void setList_sub1_PS_REF_NO(List list) { l_sub1_PS_REF_NO = list; }
	public void setList_sub1_COST_UP_TYP(List list) { l_sub1_COST_UP_TYP = list; }
	public void setList_sub1_MRP_EXP_TYP(List list) { l_sub1_MRP_EXP_TYP = list; }
	public void setList_SEQ_NO(List list) { l_SEQ_NO = list; }
	public void setList_PS_EDITION(List list) { l_PS_EDITION = list; }
	public void setList_ACCESS_TYP(List list) { l_ACCESS_TYP = list; }
	public void setList_CMPLT_FLG(List list) { l_CMPLT_FLG = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_MRP_ODR_TYP(List list) { l_MRP_ODR_TYP = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_DRAW_CD(List list) { l_DRAW_CD = list; }
	public void setList_SPEC(List list) { l_SPEC = list; }
	public void setList_ITEM_OUTSIDE_TYP(List list) { l_ITEM_OUTSIDE_TYP = list; }
	public void setList_OPR_RSLT_TYP(List list) { l_OPR_RSLT_TYP = list; }
	public void setList_ITEM_FIXED_LT(List list) { l_ITEM_FIXED_LT = list; }
	public void setList_ITEM_PROP_LT(List list) { l_ITEM_PROP_LT = list; }
	public void setList_ITEM_PROP_LOT_SIZE(List list) { l_ITEM_PROP_LOT_SIZE = list; }
	public void setList_ITEM_ISSUE_LT(List list) { l_ITEM_ISSUE_LT = list; }
	public void setList_ITEM_SAFETY_LT(List list) { l_ITEM_SAFETY_LT = list; }
	public void setList_UNIT_QTY_TYP(List list) { l_UNIT_QTY_TYP = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_w_TARGET_ITEM_CD(List list) { l_w_TARGET_ITEM_CD = list; }
	public void setList_pr_PLANT_CD(List list) { l_pr_PLANT_CD = list; }
	public void setList_pr_ITEM_CD(List list) { l_pr_ITEM_CD = list; }
	public void setList_pr_PROC_CD(List list) { l_pr_PROC_CD = list; }
	public void setList_pr_PROC_NO(List list) { l_pr_PROC_NO = list; }
	public void setList_pr_PROC_NAME(List list) { l_pr_PROC_NAME = list; }
	public void setList_pr_WS_CD(List list) { l_pr_WS_CD = list; }
	public void setList_pr_COMPANY_CD(List list) { l_pr_COMPANY_CD = list; }
	public void setList_pr_VEND_CD(List list) { l_pr_VEND_CD = list; }
	public void setList_pr_FIXED_LT(List list) { l_pr_FIXED_LT = list; }
	public void setList_pr_PROP_LT(List list) { l_pr_PROP_LT = list; }
	public void setList_pr_SAFETY_LT(List list) { l_pr_SAFETY_LT = list; }
	public void setList_pr_PROP_LOT_SIZE(List list) { l_pr_PROP_LOT_SIZE = list; }
	public void setList_pr_SPOIL(List list) { l_pr_SPOIL = list; }
	public void setList_pr_OUTSIDE_TYP(List list) { l_pr_OUTSIDE_TYP = list; }
	public void setList_pr_ACPT_INSPC_TYP(List list) { l_pr_ACPT_INSPC_TYP = list; }
	public void setList_pr_STANDARD_COST(List list) { l_pr_STANDARD_COST = list; }
	public void setList_pr_MODIFY_COUNT(List list) { l_pr_MODIFY_COUNT = list; }
	public void setList_pr_UNIT_QTY(List list) { l_pr_UNIT_QTY = list; }
	public void setList_pr_WORK_TIME(List list) { l_pr_WORK_TIME = list; }
	public void setList_pr_ITEM_NAME(List list) { l_pr_ITEM_NAME = list; }
	public void setList_pr_WS_NAME(List list) { l_pr_WS_NAME = list; }
	public void setList_pr_VEND_NAME(List list) { l_pr_VEND_NAME = list; }
	public void setList_pr_STOCK_UNIT(List list) { l_pr_STOCK_UNIT = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_hidden_ITEM_CD(List list) { l_hidden_ITEM_CD = list; }
	public void setList_PROC_CD(List list) { l_PROC_CD = list; }
	public void setList_sub2_PLANT_CD(List list) { l_sub2_PLANT_CD = list; }
	public void setList_sub2_ITEM_CD(List list) { l_sub2_ITEM_CD = list; }
	public void setList_sub2_PROC_CD(List list) { l_sub2_PROC_CD = list; }
	public void setList_sub2_PROC_NO(List list) { l_sub2_PROC_NO = list; }
	public void setList_sub2_PROC_NAME(List list) { l_sub2_PROC_NAME = list; }
	public void setList_sub2_WS_CD(List list) { l_sub2_WS_CD = list; }
	public void setList_sub2_COMPANY_CD(List list) { l_sub2_COMPANY_CD = list; }
	public void setList_sub2_VEND_CD(List list) { l_sub2_VEND_CD = list; }
	public void setList_sub2_FIXED_LT(List list) { l_sub2_FIXED_LT = list; }
	public void setList_sub2_PROP_LT(List list) { l_sub2_PROP_LT = list; }
	public void setList_sub2_SAFETY_LT(List list) { l_sub2_SAFETY_LT = list; }
	public void setList_sub2_PROP_LOT_SIZE(List list) { l_sub2_PROP_LOT_SIZE = list; }
	public void setList_sub2_SPOIL(List list) { l_sub2_SPOIL = list; }
	public void setList_sub2_OUTSIDE_TYP(List list) { l_sub2_OUTSIDE_TYP = list; }
	public void setList_sub2_ACPT_INSPC_TYP(List list) { l_sub2_ACPT_INSPC_TYP = list; }
	public void setList_sub2_STANDARD_COST(List list) { l_sub2_STANDARD_COST = list; }
	public void setList_sub2_UNIT_QTY(List list) { l_sub2_UNIT_QTY = list; }
	public void setList_sub2_WORK_TIME(List list) { l_sub2_WORK_TIME = list; }
	public void setList_sub2_MODIFY_COUNT(List list) { l_sub2_MODIFY_COUNT = list; }
	public void setList_sub2_ITEM_NAME(List list) { l_sub2_ITEM_NAME = list; }
	public void setList_sub2_WS_NAME(List list) { l_sub2_WS_NAME = list; }
	public void setList_sub2_VEND_NAME(List list) { l_sub2_VEND_NAME = list; }
	public void setList_sub2_STOCK_UNIT(List list) { l_sub2_STOCK_UNIT = list; }
	public void setList_sub2_MANHOUR_TYP(List list) { l_sub2_MANHOUR_TYP = list; }
	public void setList_WS_CD(List list) { l_WS_CD = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_PROC_NO(List list) { l_PROC_NO = list; }
	public void setList_PS_UNIT_DENOMINATOR(List list) { l_PS_UNIT_DENOMINATOR = list; }
	public void setList_PS_UNIT_NUMERATOR(List list) { l_PS_UNIT_NUMERATOR = list; }
	public void setList_BY_PRODUCT_CD(List list) { l_BY_PRODUCT_CD = list; }
	public void setList_BUSINESS_OPR_DATE(List list) { l_BUSINESS_OPR_DATE = list; }
	public void setList_PARAM_RESULT_DATA(List list) { l_PARAM_RESULT_DATA = list; }
	public void setList_PARAM_INPUT_DATA(List list) { l_PARAM_INPUT_DATA = list; }

	public int setL2L_sub2_OUTSIDE_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub2_OUTSIDE_TYP_name == null) {
			l_sub2_OUTSIDE_TYP_name = new ArrayList();
		} else {
			l_sub2_OUTSIDE_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub2_OUTSIDE_TYP_name.add(((AA0170010Struct) list.get(i)).getsub2_OUTSIDE_TYP_name());
		}
		return size;
	}
	public int setL2L_sub2_OUTSIDE_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub2_OUTSIDE_TYP_val == null) {
			l_sub2_OUTSIDE_TYP_val = new ArrayList();
		} else {
			l_sub2_OUTSIDE_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub2_OUTSIDE_TYP_val.add(((AA0170010Struct) list.get(i)).getsub2_OUTSIDE_TYP_val());
		}
		return size;
	}
	public int setL2L_sub2_ACPT_INSPC_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub2_ACPT_INSPC_TYP_name == null) {
			l_sub2_ACPT_INSPC_TYP_name = new ArrayList();
		} else {
			l_sub2_ACPT_INSPC_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub2_ACPT_INSPC_TYP_name.add(((AA0170010Struct) list.get(i)).getsub2_ACPT_INSPC_TYP_name());
		}
		return size;
	}
	public int setL2L_sub2_ACPT_INSPC_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub2_ACPT_INSPC_TYP_val == null) {
			l_sub2_ACPT_INSPC_TYP_val = new ArrayList();
		} else {
			l_sub2_ACPT_INSPC_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub2_ACPT_INSPC_TYP_val.add(((AA0170010Struct) list.get(i)).getsub2_ACPT_INSPC_TYP_val());
		}
		return size;
	}
	public int setL2L_main_TARGET_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_main_TARGET_ITEM_CD == null) {
			l_main_TARGET_ITEM_CD = new ArrayList();
		} else {
			l_main_TARGET_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_main_TARGET_ITEM_CD.add(((AA0170010Struct) list.get(i)).getmain_TARGET_ITEM_CD());
		}
		return size;
	}
	public int setL2L_main_DEVELOP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_main_DEVELOP_TYP == null) {
			l_main_DEVELOP_TYP = new ArrayList();
		} else {
			l_main_DEVELOP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_main_DEVELOP_TYP.add(((AA0170010Struct) list.get(i)).getmain_DEVELOP_TYP());
		}
		return size;
	}
	public int setL2L_main_DEVELOP_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_main_DEVELOP_TYP_name == null) {
			l_main_DEVELOP_TYP_name = new ArrayList();
		} else {
			l_main_DEVELOP_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_main_DEVELOP_TYP_name.add(((AA0170010Struct) list.get(i)).getmain_DEVELOP_TYP_name());
		}
		return size;
	}
	public int setL2L_main_DEVELOP_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_main_DEVELOP_TYP_val == null) {
			l_main_DEVELOP_TYP_val = new ArrayList();
		} else {
			l_main_DEVELOP_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_main_DEVELOP_TYP_val.add(((AA0170010Struct) list.get(i)).getmain_DEVELOP_TYP_val());
		}
		return size;
	}
	public int setL2L_main_TARGET_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_main_TARGET_DATE == null) {
			l_main_TARGET_DATE = new ArrayList();
		} else {
			l_main_TARGET_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_main_TARGET_DATE.add(((AA0170010Struct) list.get(i)).getmain_TARGET_DATE());
		}
		return size;
	}
	public int setL2L_main_LEVEL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_main_LEVEL == null) {
			l_main_LEVEL = new ArrayList();
		} else {
			l_main_LEVEL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_main_LEVEL.add(((AA0170010Struct) list.get(i)).getmain_LEVEL());
		}
		return size;
	}
	public int setL2L_ps_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ps_NO == null) {
			l_ps_NO = new ArrayList();
		} else {
			l_ps_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ps_NO.add(((AA0170010Struct) list.get(i)).getps_NO());
		}
		return size;
	}
	public int setL2L_ps_CONS_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ps_CONS_NAME == null) {
			l_ps_CONS_NAME = new ArrayList();
		} else {
			l_ps_CONS_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ps_CONS_NAME.add(((AA0170010Struct) list.get(i)).getps_CONS_NAME());
		}
		return size;
	}
	public int setL2L_ps_PS_LT_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ps_PS_LT_NAME == null) {
			l_ps_PS_LT_NAME = new ArrayList();
		} else {
			l_ps_PS_LT_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ps_PS_LT_NAME.add(((AA0170010Struct) list.get(i)).getps_PS_LT_NAME());
		}
		return size;
	}
	public int setL2L_ps_COST_UP_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ps_COST_UP_NAME == null) {
			l_ps_COST_UP_NAME = new ArrayList();
		} else {
			l_ps_COST_UP_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ps_COST_UP_NAME.add(((AA0170010Struct) list.get(i)).getps_COST_UP_NAME());
		}
		return size;
	}
	public int setL2L_ps_MRP_EXP_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ps_MRP_EXP_NAME == null) {
			l_ps_MRP_EXP_NAME = new ArrayList();
		} else {
			l_ps_MRP_EXP_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ps_MRP_EXP_NAME.add(((AA0170010Struct) list.get(i)).getps_MRP_EXP_NAME());
		}
		return size;
	}
	public int setL2L_pr_OUTSIDE_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_pr_OUTSIDE_NAME == null) {
			l_pr_OUTSIDE_NAME = new ArrayList();
		} else {
			l_pr_OUTSIDE_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_pr_OUTSIDE_NAME.add(((AA0170010Struct) list.get(i)).getpr_OUTSIDE_NAME());
		}
		return size;
	}
	public int setL2L_pr_ACPT_INSPC_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_pr_ACPT_INSPC_NAME == null) {
			l_pr_ACPT_INSPC_NAME = new ArrayList();
		} else {
			l_pr_ACPT_INSPC_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_pr_ACPT_INSPC_NAME.add(((AA0170010Struct) list.get(i)).getpr_ACPT_INSPC_NAME());
		}
		return size;
	}
	public int setL2L_sub1_PARENT_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1_PARENT_ITEM_NAME == null) {
			l_sub1_PARENT_ITEM_NAME = new ArrayList();
		} else {
			l_sub1_PARENT_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1_PARENT_ITEM_NAME.add(((AA0170010Struct) list.get(i)).getsub1_PARENT_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_sub1_DEVELOP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1_DEVELOP_TYP == null) {
			l_sub1_DEVELOP_TYP = new ArrayList();
		} else {
			l_sub1_DEVELOP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1_DEVELOP_TYP.add(((AA0170010Struct) list.get(i)).getsub1_DEVELOP_TYP());
		}
		return size;
	}
	public int setL2L_sub1_COMP_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1_COMP_ITEM_NAME == null) {
			l_sub1_COMP_ITEM_NAME = new ArrayList();
		} else {
			l_sub1_COMP_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1_COMP_ITEM_NAME.add(((AA0170010Struct) list.get(i)).getsub1_COMP_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_sub1_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1_MODIFY_COUNT == null) {
			l_sub1_MODIFY_COUNT = new ArrayList();
		} else {
			l_sub1_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1_MODIFY_COUNT.add(((AA0170010Struct) list.get(i)).getsub1_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_sub1_STOCK_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1_STOCK_UNIT == null) {
			l_sub1_STOCK_UNIT = new ArrayList();
		} else {
			l_sub1_STOCK_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1_STOCK_UNIT.add(((AA0170010Struct) list.get(i)).getsub1_STOCK_UNIT());
		}
		return size;
	}
	public int setL2L_sub1_CONS_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1_CONS_TYP_name == null) {
			l_sub1_CONS_TYP_name = new ArrayList();
		} else {
			l_sub1_CONS_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1_CONS_TYP_name.add(((AA0170010Struct) list.get(i)).getsub1_CONS_TYP_name());
		}
		return size;
	}
	public int setL2L_sub1_CONS_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1_CONS_TYP_val == null) {
			l_sub1_CONS_TYP_val = new ArrayList();
		} else {
			l_sub1_CONS_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1_CONS_TYP_val.add(((AA0170010Struct) list.get(i)).getsub1_CONS_TYP_val());
		}
		return size;
	}
	public int setL2L_sub1_PS_LT_CHECK(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1_PS_LT_CHECK == null) {
			l_sub1_PS_LT_CHECK = new ArrayList();
		} else {
			l_sub1_PS_LT_CHECK.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1_PS_LT_CHECK.add(((AA0170010Struct) list.get(i)).getsub1_PS_LT_CHECK());
		}
		return size;
	}
	public int setL2L_sub1_COST_UP_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1_COST_UP_TYP_name == null) {
			l_sub1_COST_UP_TYP_name = new ArrayList();
		} else {
			l_sub1_COST_UP_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1_COST_UP_TYP_name.add(((AA0170010Struct) list.get(i)).getsub1_COST_UP_TYP_name());
		}
		return size;
	}
	public int setL2L_sub1_COST_UP_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1_COST_UP_TYP_val == null) {
			l_sub1_COST_UP_TYP_val = new ArrayList();
		} else {
			l_sub1_COST_UP_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1_COST_UP_TYP_val.add(((AA0170010Struct) list.get(i)).getsub1_COST_UP_TYP_val());
		}
		return size;
	}
	public int setL2L_sub1_MRP_EXP_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1_MRP_EXP_TYP_name == null) {
			l_sub1_MRP_EXP_TYP_name = new ArrayList();
		} else {
			l_sub1_MRP_EXP_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1_MRP_EXP_TYP_name.add(((AA0170010Struct) list.get(i)).getsub1_MRP_EXP_TYP_name());
		}
		return size;
	}
	public int setL2L_sub1_MRP_EXP_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1_MRP_EXP_TYP_val == null) {
			l_sub1_MRP_EXP_TYP_val = new ArrayList();
		} else {
			l_sub1_MRP_EXP_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1_MRP_EXP_TYP_val.add(((AA0170010Struct) list.get(i)).getsub1_MRP_EXP_TYP_val());
		}
		return size;
	}
	public int setL2L_sub1_TARGET_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1_TARGET_ITEM_CD == null) {
			l_sub1_TARGET_ITEM_CD = new ArrayList();
		} else {
			l_sub1_TARGET_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1_TARGET_ITEM_CD.add(((AA0170010Struct) list.get(i)).getsub1_TARGET_ITEM_CD());
		}
		return size;
	}
	public int setL2L_sub1_LEVEL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1_LEVEL == null) {
			l_sub1_LEVEL = new ArrayList();
		} else {
			l_sub1_LEVEL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1_LEVEL.add(((AA0170010Struct) list.get(i)).getsub1_LEVEL());
		}
		return size;
	}
	public int setL2L_sub1_TARGET_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1_TARGET_DATE == null) {
			l_sub1_TARGET_DATE = new ArrayList();
		} else {
			l_sub1_TARGET_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1_TARGET_DATE.add(((AA0170010Struct) list.get(i)).getsub1_TARGET_DATE());
		}
		return size;
	}
	public int setL2L_pr_PS_EDITION(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_pr_PS_EDITION == null) {
			l_pr_PS_EDITION = new ArrayList();
		} else {
			l_pr_PS_EDITION.clear();
		}
		for (int i = 0; i < size; i++) {
			l_pr_PS_EDITION.add(((AA0170010Struct) list.get(i)).getpr_PS_EDITION());
		}
		return size;
	}
	public int setL2L_hidden_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_hidden_ITEM_NAME == null) {
			l_hidden_ITEM_NAME = new ArrayList();
		} else {
			l_hidden_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_hidden_ITEM_NAME.add(((AA0170010Struct) list.get(i)).gethidden_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_sub2_STATUS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub2_STATUS == null) {
			l_sub2_STATUS = new ArrayList();
		} else {
			l_sub2_STATUS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub2_STATUS.add(((AA0170010Struct) list.get(i)).getsub2_STATUS());
		}
		return size;
	}
	public int setL2L_FIRST_PROC_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FIRST_PROC_FLG == null) {
			l_FIRST_PROC_FLG = new ArrayList();
		} else {
			l_FIRST_PROC_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FIRST_PROC_FLG.add(((AA0170010Struct) list.get(i)).getFIRST_PROC_FLG());
		}
		return size;
	}
	public int setL2L_sub1_h_PS_UNIT_NUMERATOR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1_h_PS_UNIT_NUMERATOR == null) {
			l_sub1_h_PS_UNIT_NUMERATOR = new ArrayList();
		} else {
			l_sub1_h_PS_UNIT_NUMERATOR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1_h_PS_UNIT_NUMERATOR.add(((AA0170010Struct) list.get(i)).getsub1_h_PS_UNIT_NUMERATOR());
		}
		return size;
	}
	public int setL2L_sub1_h_PS_UNIT_DENOMINATOR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1_h_PS_UNIT_DENOMINATOR == null) {
			l_sub1_h_PS_UNIT_DENOMINATOR = new ArrayList();
		} else {
			l_sub1_h_PS_UNIT_DENOMINATOR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1_h_PS_UNIT_DENOMINATOR.add(((AA0170010Struct) list.get(i)).getsub1_h_PS_UNIT_DENOMINATOR());
		}
		return size;
	}
	public int setL2L_sub2_STOCK_UNIT_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub2_STOCK_UNIT_1 == null) {
			l_sub2_STOCK_UNIT_1 = new ArrayList();
		} else {
			l_sub2_STOCK_UNIT_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub2_STOCK_UNIT_1.add(((AA0170010Struct) list.get(i)).getsub2_STOCK_UNIT_1());
		}
		return size;
	}
	public int setL2L_sub2_STOCK_UNIT_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub2_STOCK_UNIT_2 == null) {
			l_sub2_STOCK_UNIT_2 = new ArrayList();
		} else {
			l_sub2_STOCK_UNIT_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub2_STOCK_UNIT_2.add(((AA0170010Struct) list.get(i)).getsub2_STOCK_UNIT_2());
		}
		return size;
	}
	public int setL2L_sub2_STOCK_UNIT_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub2_STOCK_UNIT_3 == null) {
			l_sub2_STOCK_UNIT_3 = new ArrayList();
		} else {
			l_sub2_STOCK_UNIT_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub2_STOCK_UNIT_3.add(((AA0170010Struct) list.get(i)).getsub2_STOCK_UNIT_3());
		}
		return size;
	}
	public int setL2L_ps_COMP_MANHOUR_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ps_COMP_MANHOUR_NAME == null) {
			l_ps_COMP_MANHOUR_NAME = new ArrayList();
		} else {
			l_ps_COMP_MANHOUR_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ps_COMP_MANHOUR_NAME.add(((AA0170010Struct) list.get(i)).getps_COMP_MANHOUR_NAME());
		}
		return size;
	}
	public int setL2L_ps_PARENT_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ps_PARENT_ITEM_CD == null) {
			l_ps_PARENT_ITEM_CD = new ArrayList();
		} else {
			l_ps_PARENT_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ps_PARENT_ITEM_CD.add(((AA0170010Struct) list.get(i)).getps_PARENT_ITEM_CD());
		}
		return size;
	}
	public int setL2L_ps_COMP_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ps_COMP_ITEM_CD == null) {
			l_ps_COMP_ITEM_CD = new ArrayList();
		} else {
			l_ps_COMP_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ps_COMP_ITEM_CD.add(((AA0170010Struct) list.get(i)).getps_COMP_ITEM_CD());
		}
		return size;
	}
	public int setL2L_ps_PS_EDITION(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ps_PS_EDITION == null) {
			l_ps_PS_EDITION = new ArrayList();
		} else {
			l_ps_PS_EDITION.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ps_PS_EDITION.add(((AA0170010Struct) list.get(i)).getps_PS_EDITION());
		}
		return size;
	}
	public int setL2L_ps_PS_UNIT_DENOMINATOR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ps_PS_UNIT_DENOMINATOR == null) {
			l_ps_PS_UNIT_DENOMINATOR = new ArrayList();
		} else {
			l_ps_PS_UNIT_DENOMINATOR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ps_PS_UNIT_DENOMINATOR.add(((AA0170010Struct) list.get(i)).getps_PS_UNIT_DENOMINATOR());
		}
		return size;
	}
	public int setL2L_ps_PS_UNIT_NUMERATOR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ps_PS_UNIT_NUMERATOR == null) {
			l_ps_PS_UNIT_NUMERATOR = new ArrayList();
		} else {
			l_ps_PS_UNIT_NUMERATOR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ps_PS_UNIT_NUMERATOR.add(((AA0170010Struct) list.get(i)).getps_PS_UNIT_NUMERATOR());
		}
		return size;
	}
	public int setL2L_ps_EFF_PHASE_IN_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ps_EFF_PHASE_IN_DATE == null) {
			l_ps_EFF_PHASE_IN_DATE = new ArrayList();
		} else {
			l_ps_EFF_PHASE_IN_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ps_EFF_PHASE_IN_DATE.add(((AA0170010Struct) list.get(i)).getps_EFF_PHASE_IN_DATE());
		}
		return size;
	}
	public int setL2L_ps_EFF_PHASE_OUT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ps_EFF_PHASE_OUT_DATE == null) {
			l_ps_EFF_PHASE_OUT_DATE = new ArrayList();
		} else {
			l_ps_EFF_PHASE_OUT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ps_EFF_PHASE_OUT_DATE.add(((AA0170010Struct) list.get(i)).getps_EFF_PHASE_OUT_DATE());
		}
		return size;
	}
	public int setL2L_ps_PS_SPOIL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ps_PS_SPOIL == null) {
			l_ps_PS_SPOIL = new ArrayList();
		} else {
			l_ps_PS_SPOIL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ps_PS_SPOIL.add(((AA0170010Struct) list.get(i)).getps_PS_SPOIL());
		}
		return size;
	}
	public int setL2L_ps_CONS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ps_CONS_TYP == null) {
			l_ps_CONS_TYP = new ArrayList();
		} else {
			l_ps_CONS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ps_CONS_TYP.add(((AA0170010Struct) list.get(i)).getps_CONS_TYP());
		}
		return size;
	}
	public int setL2L_ps_PS_LT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ps_PS_LT_FLG == null) {
			l_ps_PS_LT_FLG = new ArrayList();
		} else {
			l_ps_PS_LT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ps_PS_LT_FLG.add(((AA0170010Struct) list.get(i)).getps_PS_LT_FLG());
		}
		return size;
	}
	public int setL2L_ps_PS_FIXED_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ps_PS_FIXED_LT == null) {
			l_ps_PS_FIXED_LT = new ArrayList();
		} else {
			l_ps_PS_FIXED_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ps_PS_FIXED_LT.add(((AA0170010Struct) list.get(i)).getps_PS_FIXED_LT());
		}
		return size;
	}
	public int setL2L_ps_PS_PROP_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ps_PS_PROP_LT == null) {
			l_ps_PS_PROP_LT = new ArrayList();
		} else {
			l_ps_PS_PROP_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ps_PS_PROP_LT.add(((AA0170010Struct) list.get(i)).getps_PS_PROP_LT());
		}
		return size;
	}
	public int setL2L_ps_PS_PROP_LOT_SIZE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ps_PS_PROP_LOT_SIZE == null) {
			l_ps_PS_PROP_LOT_SIZE = new ArrayList();
		} else {
			l_ps_PS_PROP_LOT_SIZE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ps_PS_PROP_LOT_SIZE.add(((AA0170010Struct) list.get(i)).getps_PS_PROP_LOT_SIZE());
		}
		return size;
	}
	public int setL2L_ps_PS_REF_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ps_PS_REF_NO == null) {
			l_ps_PS_REF_NO = new ArrayList();
		} else {
			l_ps_PS_REF_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ps_PS_REF_NO.add(((AA0170010Struct) list.get(i)).getps_PS_REF_NO());
		}
		return size;
	}
	public int setL2L_ps_COST_UP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ps_COST_UP_TYP == null) {
			l_ps_COST_UP_TYP = new ArrayList();
		} else {
			l_ps_COST_UP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ps_COST_UP_TYP.add(((AA0170010Struct) list.get(i)).getps_COST_UP_TYP());
		}
		return size;
	}
	public int setL2L_ps_MRP_EXP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ps_MRP_EXP_TYP == null) {
			l_ps_MRP_EXP_TYP = new ArrayList();
		} else {
			l_ps_MRP_EXP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ps_MRP_EXP_TYP.add(((AA0170010Struct) list.get(i)).getps_MRP_EXP_TYP());
		}
		return size;
	}
	public int setL2L_ps_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ps_MODIFY_COUNT == null) {
			l_ps_MODIFY_COUNT = new ArrayList();
		} else {
			l_ps_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ps_MODIFY_COUNT.add(((AA0170010Struct) list.get(i)).getps_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_ps_PARENT_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ps_PARENT_ITEM_NAME == null) {
			l_ps_PARENT_ITEM_NAME = new ArrayList();
		} else {
			l_ps_PARENT_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ps_PARENT_ITEM_NAME.add(((AA0170010Struct) list.get(i)).getps_PARENT_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_ps_COMP_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ps_COMP_ITEM_NAME == null) {
			l_ps_COMP_ITEM_NAME = new ArrayList();
		} else {
			l_ps_COMP_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ps_COMP_ITEM_NAME.add(((AA0170010Struct) list.get(i)).getps_COMP_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_ps_STOCK_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ps_STOCK_UNIT == null) {
			l_ps_STOCK_UNIT = new ArrayList();
		} else {
			l_ps_STOCK_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ps_STOCK_UNIT.add(((AA0170010Struct) list.get(i)).getps_STOCK_UNIT());
		}
		return size;
	}
	public int setL2L_ps_COMP_MANHOUR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ps_COMP_MANHOUR_TYP == null) {
			l_ps_COMP_MANHOUR_TYP = new ArrayList();
		} else {
			l_ps_COMP_MANHOUR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ps_COMP_MANHOUR_TYP.add(((AA0170010Struct) list.get(i)).getps_COMP_MANHOUR_TYP());
		}
		return size;
	}
	public int setL2L_ps_PARENT_MANHOUR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ps_PARENT_MANHOUR_TYP == null) {
			l_ps_PARENT_MANHOUR_TYP = new ArrayList();
		} else {
			l_ps_PARENT_MANHOUR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ps_PARENT_MANHOUR_TYP.add(((AA0170010Struct) list.get(i)).getps_PARENT_MANHOUR_TYP());
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
			l_PARENT_ITEM_CD.add(((AA0170010Struct) list.get(i)).getPARENT_ITEM_CD());
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
			l_COMP_ITEM_CD.add(((AA0170010Struct) list.get(i)).getCOMP_ITEM_CD());
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
			l_EFF_PHASE_IN_DATE.add(((AA0170010Struct) list.get(i)).getEFF_PHASE_IN_DATE());
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
			l_EFF_PHASE_OUT_DATE.add(((AA0170010Struct) list.get(i)).getEFF_PHASE_OUT_DATE());
		}
		return size;
	}
	public int setL2L_sub1_PARENT_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1_PARENT_ITEM_CD == null) {
			l_sub1_PARENT_ITEM_CD = new ArrayList();
		} else {
			l_sub1_PARENT_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1_PARENT_ITEM_CD.add(((AA0170010Struct) list.get(i)).getsub1_PARENT_ITEM_CD());
		}
		return size;
	}
	public int setL2L_sub1_COMP_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1_COMP_ITEM_CD == null) {
			l_sub1_COMP_ITEM_CD = new ArrayList();
		} else {
			l_sub1_COMP_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1_COMP_ITEM_CD.add(((AA0170010Struct) list.get(i)).getsub1_COMP_ITEM_CD());
		}
		return size;
	}
	public int setL2L_sub1_PS_EDITION(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1_PS_EDITION == null) {
			l_sub1_PS_EDITION = new ArrayList();
		} else {
			l_sub1_PS_EDITION.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1_PS_EDITION.add(((AA0170010Struct) list.get(i)).getsub1_PS_EDITION());
		}
		return size;
	}
	public int setL2L_sub1_PS_UNIT_DENOMINATOR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1_PS_UNIT_DENOMINATOR == null) {
			l_sub1_PS_UNIT_DENOMINATOR = new ArrayList();
		} else {
			l_sub1_PS_UNIT_DENOMINATOR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1_PS_UNIT_DENOMINATOR.add(((AA0170010Struct) list.get(i)).getsub1_PS_UNIT_DENOMINATOR());
		}
		return size;
	}
	public int setL2L_sub1_PS_UNIT_NUMERATOR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1_PS_UNIT_NUMERATOR == null) {
			l_sub1_PS_UNIT_NUMERATOR = new ArrayList();
		} else {
			l_sub1_PS_UNIT_NUMERATOR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1_PS_UNIT_NUMERATOR.add(((AA0170010Struct) list.get(i)).getsub1_PS_UNIT_NUMERATOR());
		}
		return size;
	}
	public int setL2L_sub1_EFF_PHASE_IN_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1_EFF_PHASE_IN_DATE == null) {
			l_sub1_EFF_PHASE_IN_DATE = new ArrayList();
		} else {
			l_sub1_EFF_PHASE_IN_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1_EFF_PHASE_IN_DATE.add(((AA0170010Struct) list.get(i)).getsub1_EFF_PHASE_IN_DATE());
		}
		return size;
	}
	public int setL2L_sub1_EFF_PHASE_OUT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1_EFF_PHASE_OUT_DATE == null) {
			l_sub1_EFF_PHASE_OUT_DATE = new ArrayList();
		} else {
			l_sub1_EFF_PHASE_OUT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1_EFF_PHASE_OUT_DATE.add(((AA0170010Struct) list.get(i)).getsub1_EFF_PHASE_OUT_DATE());
		}
		return size;
	}
	public int setL2L_sub1_PS_SPOIL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1_PS_SPOIL == null) {
			l_sub1_PS_SPOIL = new ArrayList();
		} else {
			l_sub1_PS_SPOIL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1_PS_SPOIL.add(((AA0170010Struct) list.get(i)).getsub1_PS_SPOIL());
		}
		return size;
	}
	public int setL2L_sub1_CONS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1_CONS_TYP == null) {
			l_sub1_CONS_TYP = new ArrayList();
		} else {
			l_sub1_CONS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1_CONS_TYP.add(((AA0170010Struct) list.get(i)).getsub1_CONS_TYP());
		}
		return size;
	}
	public int setL2L_sub1_PS_LT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1_PS_LT_FLG == null) {
			l_sub1_PS_LT_FLG = new ArrayList();
		} else {
			l_sub1_PS_LT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1_PS_LT_FLG.add(((AA0170010Struct) list.get(i)).getsub1_PS_LT_FLG());
		}
		return size;
	}
	public int setL2L_sub1_PS_FIXED_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1_PS_FIXED_LT == null) {
			l_sub1_PS_FIXED_LT = new ArrayList();
		} else {
			l_sub1_PS_FIXED_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1_PS_FIXED_LT.add(((AA0170010Struct) list.get(i)).getsub1_PS_FIXED_LT());
		}
		return size;
	}
	public int setL2L_sub1_PS_PROP_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1_PS_PROP_LT == null) {
			l_sub1_PS_PROP_LT = new ArrayList();
		} else {
			l_sub1_PS_PROP_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1_PS_PROP_LT.add(((AA0170010Struct) list.get(i)).getsub1_PS_PROP_LT());
		}
		return size;
	}
	public int setL2L_sub1_PS_PROP_LOT_SIZE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1_PS_PROP_LOT_SIZE == null) {
			l_sub1_PS_PROP_LOT_SIZE = new ArrayList();
		} else {
			l_sub1_PS_PROP_LOT_SIZE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1_PS_PROP_LOT_SIZE.add(((AA0170010Struct) list.get(i)).getsub1_PS_PROP_LOT_SIZE());
		}
		return size;
	}
	public int setL2L_sub1_PS_REF_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1_PS_REF_NO == null) {
			l_sub1_PS_REF_NO = new ArrayList();
		} else {
			l_sub1_PS_REF_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1_PS_REF_NO.add(((AA0170010Struct) list.get(i)).getsub1_PS_REF_NO());
		}
		return size;
	}
	public int setL2L_sub1_COST_UP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1_COST_UP_TYP == null) {
			l_sub1_COST_UP_TYP = new ArrayList();
		} else {
			l_sub1_COST_UP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1_COST_UP_TYP.add(((AA0170010Struct) list.get(i)).getsub1_COST_UP_TYP());
		}
		return size;
	}
	public int setL2L_sub1_MRP_EXP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub1_MRP_EXP_TYP == null) {
			l_sub1_MRP_EXP_TYP = new ArrayList();
		} else {
			l_sub1_MRP_EXP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub1_MRP_EXP_TYP.add(((AA0170010Struct) list.get(i)).getsub1_MRP_EXP_TYP());
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
			l_SEQ_NO.add(((AA0170010Struct) list.get(i)).getSEQ_NO());
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
			l_PS_EDITION.add(((AA0170010Struct) list.get(i)).getPS_EDITION());
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
			l_ACCESS_TYP.add(((AA0170010Struct) list.get(i)).getACCESS_TYP());
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
			l_CMPLT_FLG.add(((AA0170010Struct) list.get(i)).getCMPLT_FLG());
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
			l_ITEM_CD.add(((AA0170010Struct) list.get(i)).getITEM_CD());
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
			l_MRP_ODR_TYP.add(((AA0170010Struct) list.get(i)).getMRP_ODR_TYP());
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
			l_MODIFY_COUNT.add(((AA0170010Struct) list.get(i)).getMODIFY_COUNT());
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
			l_ITEM_NAME.add(((AA0170010Struct) list.get(i)).getITEM_NAME());
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
			l_DRAW_CD.add(((AA0170010Struct) list.get(i)).getDRAW_CD());
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
			l_SPEC.add(((AA0170010Struct) list.get(i)).getSPEC());
		}
		return size;
	}
	public int setL2L_ITEM_OUTSIDE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_OUTSIDE_TYP == null) {
			l_ITEM_OUTSIDE_TYP = new ArrayList();
		} else {
			l_ITEM_OUTSIDE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_OUTSIDE_TYP.add(((AA0170010Struct) list.get(i)).getITEM_OUTSIDE_TYP());
		}
		return size;
	}
	public int setL2L_OPR_RSLT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_RSLT_TYP == null) {
			l_OPR_RSLT_TYP = new ArrayList();
		} else {
			l_OPR_RSLT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_RSLT_TYP.add(((AA0170010Struct) list.get(i)).getOPR_RSLT_TYP());
		}
		return size;
	}
	public int setL2L_ITEM_FIXED_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_FIXED_LT == null) {
			l_ITEM_FIXED_LT = new ArrayList();
		} else {
			l_ITEM_FIXED_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_FIXED_LT.add(((AA0170010Struct) list.get(i)).getITEM_FIXED_LT());
		}
		return size;
	}
	public int setL2L_ITEM_PROP_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_PROP_LT == null) {
			l_ITEM_PROP_LT = new ArrayList();
		} else {
			l_ITEM_PROP_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_PROP_LT.add(((AA0170010Struct) list.get(i)).getITEM_PROP_LT());
		}
		return size;
	}
	public int setL2L_ITEM_PROP_LOT_SIZE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_PROP_LOT_SIZE == null) {
			l_ITEM_PROP_LOT_SIZE = new ArrayList();
		} else {
			l_ITEM_PROP_LOT_SIZE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_PROP_LOT_SIZE.add(((AA0170010Struct) list.get(i)).getITEM_PROP_LOT_SIZE());
		}
		return size;
	}
	public int setL2L_ITEM_ISSUE_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_ISSUE_LT == null) {
			l_ITEM_ISSUE_LT = new ArrayList();
		} else {
			l_ITEM_ISSUE_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_ISSUE_LT.add(((AA0170010Struct) list.get(i)).getITEM_ISSUE_LT());
		}
		return size;
	}
	public int setL2L_ITEM_SAFETY_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_SAFETY_LT == null) {
			l_ITEM_SAFETY_LT = new ArrayList();
		} else {
			l_ITEM_SAFETY_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_SAFETY_LT.add(((AA0170010Struct) list.get(i)).getITEM_SAFETY_LT());
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
			l_UNIT_QTY_TYP.add(((AA0170010Struct) list.get(i)).getUNIT_QTY_TYP());
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
			l_STOCK_UNIT.add(((AA0170010Struct) list.get(i)).getSTOCK_UNIT());
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
			l_w_TARGET_ITEM_CD.add(((AA0170010Struct) list.get(i)).getw_TARGET_ITEM_CD());
		}
		return size;
	}
	public int setL2L_pr_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_pr_PLANT_CD == null) {
			l_pr_PLANT_CD = new ArrayList();
		} else {
			l_pr_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_pr_PLANT_CD.add(((AA0170010Struct) list.get(i)).getpr_PLANT_CD());
		}
		return size;
	}
	public int setL2L_pr_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_pr_ITEM_CD == null) {
			l_pr_ITEM_CD = new ArrayList();
		} else {
			l_pr_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_pr_ITEM_CD.add(((AA0170010Struct) list.get(i)).getpr_ITEM_CD());
		}
		return size;
	}
	public int setL2L_pr_PROC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_pr_PROC_CD == null) {
			l_pr_PROC_CD = new ArrayList();
		} else {
			l_pr_PROC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_pr_PROC_CD.add(((AA0170010Struct) list.get(i)).getpr_PROC_CD());
		}
		return size;
	}
	public int setL2L_pr_PROC_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_pr_PROC_NO == null) {
			l_pr_PROC_NO = new ArrayList();
		} else {
			l_pr_PROC_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_pr_PROC_NO.add(((AA0170010Struct) list.get(i)).getpr_PROC_NO());
		}
		return size;
	}
	public int setL2L_pr_PROC_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_pr_PROC_NAME == null) {
			l_pr_PROC_NAME = new ArrayList();
		} else {
			l_pr_PROC_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_pr_PROC_NAME.add(((AA0170010Struct) list.get(i)).getpr_PROC_NAME());
		}
		return size;
	}
	public int setL2L_pr_WS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_pr_WS_CD == null) {
			l_pr_WS_CD = new ArrayList();
		} else {
			l_pr_WS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_pr_WS_CD.add(((AA0170010Struct) list.get(i)).getpr_WS_CD());
		}
		return size;
	}
	public int setL2L_pr_COMPANY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_pr_COMPANY_CD == null) {
			l_pr_COMPANY_CD = new ArrayList();
		} else {
			l_pr_COMPANY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_pr_COMPANY_CD.add(((AA0170010Struct) list.get(i)).getpr_COMPANY_CD());
		}
		return size;
	}
	public int setL2L_pr_VEND_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_pr_VEND_CD == null) {
			l_pr_VEND_CD = new ArrayList();
		} else {
			l_pr_VEND_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_pr_VEND_CD.add(((AA0170010Struct) list.get(i)).getpr_VEND_CD());
		}
		return size;
	}
	public int setL2L_pr_FIXED_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_pr_FIXED_LT == null) {
			l_pr_FIXED_LT = new ArrayList();
		} else {
			l_pr_FIXED_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_pr_FIXED_LT.add(((AA0170010Struct) list.get(i)).getpr_FIXED_LT());
		}
		return size;
	}
	public int setL2L_pr_PROP_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_pr_PROP_LT == null) {
			l_pr_PROP_LT = new ArrayList();
		} else {
			l_pr_PROP_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_pr_PROP_LT.add(((AA0170010Struct) list.get(i)).getpr_PROP_LT());
		}
		return size;
	}
	public int setL2L_pr_SAFETY_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_pr_SAFETY_LT == null) {
			l_pr_SAFETY_LT = new ArrayList();
		} else {
			l_pr_SAFETY_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_pr_SAFETY_LT.add(((AA0170010Struct) list.get(i)).getpr_SAFETY_LT());
		}
		return size;
	}
	public int setL2L_pr_PROP_LOT_SIZE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_pr_PROP_LOT_SIZE == null) {
			l_pr_PROP_LOT_SIZE = new ArrayList();
		} else {
			l_pr_PROP_LOT_SIZE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_pr_PROP_LOT_SIZE.add(((AA0170010Struct) list.get(i)).getpr_PROP_LOT_SIZE());
		}
		return size;
	}
	public int setL2L_pr_SPOIL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_pr_SPOIL == null) {
			l_pr_SPOIL = new ArrayList();
		} else {
			l_pr_SPOIL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_pr_SPOIL.add(((AA0170010Struct) list.get(i)).getpr_SPOIL());
		}
		return size;
	}
	public int setL2L_pr_OUTSIDE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_pr_OUTSIDE_TYP == null) {
			l_pr_OUTSIDE_TYP = new ArrayList();
		} else {
			l_pr_OUTSIDE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_pr_OUTSIDE_TYP.add(((AA0170010Struct) list.get(i)).getpr_OUTSIDE_TYP());
		}
		return size;
	}
	public int setL2L_pr_ACPT_INSPC_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_pr_ACPT_INSPC_TYP == null) {
			l_pr_ACPT_INSPC_TYP = new ArrayList();
		} else {
			l_pr_ACPT_INSPC_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_pr_ACPT_INSPC_TYP.add(((AA0170010Struct) list.get(i)).getpr_ACPT_INSPC_TYP());
		}
		return size;
	}
	public int setL2L_pr_STANDARD_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_pr_STANDARD_COST == null) {
			l_pr_STANDARD_COST = new ArrayList();
		} else {
			l_pr_STANDARD_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_pr_STANDARD_COST.add(((AA0170010Struct) list.get(i)).getpr_STANDARD_COST());
		}
		return size;
	}
	public int setL2L_pr_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_pr_MODIFY_COUNT == null) {
			l_pr_MODIFY_COUNT = new ArrayList();
		} else {
			l_pr_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_pr_MODIFY_COUNT.add(((AA0170010Struct) list.get(i)).getpr_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_pr_UNIT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_pr_UNIT_QTY == null) {
			l_pr_UNIT_QTY = new ArrayList();
		} else {
			l_pr_UNIT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_pr_UNIT_QTY.add(((AA0170010Struct) list.get(i)).getpr_UNIT_QTY());
		}
		return size;
	}
	public int setL2L_pr_WORK_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_pr_WORK_TIME == null) {
			l_pr_WORK_TIME = new ArrayList();
		} else {
			l_pr_WORK_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_pr_WORK_TIME.add(((AA0170010Struct) list.get(i)).getpr_WORK_TIME());
		}
		return size;
	}
	public int setL2L_pr_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_pr_ITEM_NAME == null) {
			l_pr_ITEM_NAME = new ArrayList();
		} else {
			l_pr_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_pr_ITEM_NAME.add(((AA0170010Struct) list.get(i)).getpr_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_pr_WS_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_pr_WS_NAME == null) {
			l_pr_WS_NAME = new ArrayList();
		} else {
			l_pr_WS_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_pr_WS_NAME.add(((AA0170010Struct) list.get(i)).getpr_WS_NAME());
		}
		return size;
	}
	public int setL2L_pr_VEND_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_pr_VEND_NAME == null) {
			l_pr_VEND_NAME = new ArrayList();
		} else {
			l_pr_VEND_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_pr_VEND_NAME.add(((AA0170010Struct) list.get(i)).getpr_VEND_NAME());
		}
		return size;
	}
	public int setL2L_pr_STOCK_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_pr_STOCK_UNIT == null) {
			l_pr_STOCK_UNIT = new ArrayList();
		} else {
			l_pr_STOCK_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_pr_STOCK_UNIT.add(((AA0170010Struct) list.get(i)).getpr_STOCK_UNIT());
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
			l_PLANT_CD.add(((AA0170010Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_hidden_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_hidden_ITEM_CD == null) {
			l_hidden_ITEM_CD = new ArrayList();
		} else {
			l_hidden_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_hidden_ITEM_CD.add(((AA0170010Struct) list.get(i)).gethidden_ITEM_CD());
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
			l_PROC_CD.add(((AA0170010Struct) list.get(i)).getPROC_CD());
		}
		return size;
	}
	public int setL2L_sub2_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub2_PLANT_CD == null) {
			l_sub2_PLANT_CD = new ArrayList();
		} else {
			l_sub2_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub2_PLANT_CD.add(((AA0170010Struct) list.get(i)).getsub2_PLANT_CD());
		}
		return size;
	}
	public int setL2L_sub2_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub2_ITEM_CD == null) {
			l_sub2_ITEM_CD = new ArrayList();
		} else {
			l_sub2_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub2_ITEM_CD.add(((AA0170010Struct) list.get(i)).getsub2_ITEM_CD());
		}
		return size;
	}
	public int setL2L_sub2_PROC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub2_PROC_CD == null) {
			l_sub2_PROC_CD = new ArrayList();
		} else {
			l_sub2_PROC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub2_PROC_CD.add(((AA0170010Struct) list.get(i)).getsub2_PROC_CD());
		}
		return size;
	}
	public int setL2L_sub2_PROC_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub2_PROC_NO == null) {
			l_sub2_PROC_NO = new ArrayList();
		} else {
			l_sub2_PROC_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub2_PROC_NO.add(((AA0170010Struct) list.get(i)).getsub2_PROC_NO());
		}
		return size;
	}
	public int setL2L_sub2_PROC_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub2_PROC_NAME == null) {
			l_sub2_PROC_NAME = new ArrayList();
		} else {
			l_sub2_PROC_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub2_PROC_NAME.add(((AA0170010Struct) list.get(i)).getsub2_PROC_NAME());
		}
		return size;
	}
	public int setL2L_sub2_WS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub2_WS_CD == null) {
			l_sub2_WS_CD = new ArrayList();
		} else {
			l_sub2_WS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub2_WS_CD.add(((AA0170010Struct) list.get(i)).getsub2_WS_CD());
		}
		return size;
	}
	public int setL2L_sub2_COMPANY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub2_COMPANY_CD == null) {
			l_sub2_COMPANY_CD = new ArrayList();
		} else {
			l_sub2_COMPANY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub2_COMPANY_CD.add(((AA0170010Struct) list.get(i)).getsub2_COMPANY_CD());
		}
		return size;
	}
	public int setL2L_sub2_VEND_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub2_VEND_CD == null) {
			l_sub2_VEND_CD = new ArrayList();
		} else {
			l_sub2_VEND_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub2_VEND_CD.add(((AA0170010Struct) list.get(i)).getsub2_VEND_CD());
		}
		return size;
	}
	public int setL2L_sub2_FIXED_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub2_FIXED_LT == null) {
			l_sub2_FIXED_LT = new ArrayList();
		} else {
			l_sub2_FIXED_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub2_FIXED_LT.add(((AA0170010Struct) list.get(i)).getsub2_FIXED_LT());
		}
		return size;
	}
	public int setL2L_sub2_PROP_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub2_PROP_LT == null) {
			l_sub2_PROP_LT = new ArrayList();
		} else {
			l_sub2_PROP_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub2_PROP_LT.add(((AA0170010Struct) list.get(i)).getsub2_PROP_LT());
		}
		return size;
	}
	public int setL2L_sub2_SAFETY_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub2_SAFETY_LT == null) {
			l_sub2_SAFETY_LT = new ArrayList();
		} else {
			l_sub2_SAFETY_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub2_SAFETY_LT.add(((AA0170010Struct) list.get(i)).getsub2_SAFETY_LT());
		}
		return size;
	}
	public int setL2L_sub2_PROP_LOT_SIZE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub2_PROP_LOT_SIZE == null) {
			l_sub2_PROP_LOT_SIZE = new ArrayList();
		} else {
			l_sub2_PROP_LOT_SIZE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub2_PROP_LOT_SIZE.add(((AA0170010Struct) list.get(i)).getsub2_PROP_LOT_SIZE());
		}
		return size;
	}
	public int setL2L_sub2_SPOIL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub2_SPOIL == null) {
			l_sub2_SPOIL = new ArrayList();
		} else {
			l_sub2_SPOIL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub2_SPOIL.add(((AA0170010Struct) list.get(i)).getsub2_SPOIL());
		}
		return size;
	}
	public int setL2L_sub2_OUTSIDE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub2_OUTSIDE_TYP == null) {
			l_sub2_OUTSIDE_TYP = new ArrayList();
		} else {
			l_sub2_OUTSIDE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub2_OUTSIDE_TYP.add(((AA0170010Struct) list.get(i)).getsub2_OUTSIDE_TYP());
		}
		return size;
	}
	public int setL2L_sub2_ACPT_INSPC_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub2_ACPT_INSPC_TYP == null) {
			l_sub2_ACPT_INSPC_TYP = new ArrayList();
		} else {
			l_sub2_ACPT_INSPC_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub2_ACPT_INSPC_TYP.add(((AA0170010Struct) list.get(i)).getsub2_ACPT_INSPC_TYP());
		}
		return size;
	}
	public int setL2L_sub2_STANDARD_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub2_STANDARD_COST == null) {
			l_sub2_STANDARD_COST = new ArrayList();
		} else {
			l_sub2_STANDARD_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub2_STANDARD_COST.add(((AA0170010Struct) list.get(i)).getsub2_STANDARD_COST());
		}
		return size;
	}
	public int setL2L_sub2_UNIT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub2_UNIT_QTY == null) {
			l_sub2_UNIT_QTY = new ArrayList();
		} else {
			l_sub2_UNIT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub2_UNIT_QTY.add(((AA0170010Struct) list.get(i)).getsub2_UNIT_QTY());
		}
		return size;
	}
	public int setL2L_sub2_WORK_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub2_WORK_TIME == null) {
			l_sub2_WORK_TIME = new ArrayList();
		} else {
			l_sub2_WORK_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub2_WORK_TIME.add(((AA0170010Struct) list.get(i)).getsub2_WORK_TIME());
		}
		return size;
	}
	public int setL2L_sub2_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub2_MODIFY_COUNT == null) {
			l_sub2_MODIFY_COUNT = new ArrayList();
		} else {
			l_sub2_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub2_MODIFY_COUNT.add(((AA0170010Struct) list.get(i)).getsub2_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_sub2_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub2_ITEM_NAME == null) {
			l_sub2_ITEM_NAME = new ArrayList();
		} else {
			l_sub2_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub2_ITEM_NAME.add(((AA0170010Struct) list.get(i)).getsub2_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_sub2_WS_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub2_WS_NAME == null) {
			l_sub2_WS_NAME = new ArrayList();
		} else {
			l_sub2_WS_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub2_WS_NAME.add(((AA0170010Struct) list.get(i)).getsub2_WS_NAME());
		}
		return size;
	}
	public int setL2L_sub2_VEND_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub2_VEND_NAME == null) {
			l_sub2_VEND_NAME = new ArrayList();
		} else {
			l_sub2_VEND_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub2_VEND_NAME.add(((AA0170010Struct) list.get(i)).getsub2_VEND_NAME());
		}
		return size;
	}
	public int setL2L_sub2_STOCK_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub2_STOCK_UNIT == null) {
			l_sub2_STOCK_UNIT = new ArrayList();
		} else {
			l_sub2_STOCK_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub2_STOCK_UNIT.add(((AA0170010Struct) list.get(i)).getsub2_STOCK_UNIT());
		}
		return size;
	}
	public int setL2L_sub2_MANHOUR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_sub2_MANHOUR_TYP == null) {
			l_sub2_MANHOUR_TYP = new ArrayList();
		} else {
			l_sub2_MANHOUR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_sub2_MANHOUR_TYP.add(((AA0170010Struct) list.get(i)).getsub2_MANHOUR_TYP());
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
			l_WS_CD.add(((AA0170010Struct) list.get(i)).getWS_CD());
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
			l_VEND_CD.add(((AA0170010Struct) list.get(i)).getVEND_CD());
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
			l_COMPANY_CD.add(((AA0170010Struct) list.get(i)).getCOMPANY_CD());
		}
		return size;
	}
	public int setL2L_PROC_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_NO == null) {
			l_PROC_NO = new ArrayList();
		} else {
			l_PROC_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_NO.add(((AA0170010Struct) list.get(i)).getPROC_NO());
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
			l_PS_UNIT_DENOMINATOR.add(((AA0170010Struct) list.get(i)).getPS_UNIT_DENOMINATOR());
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
			l_PS_UNIT_NUMERATOR.add(((AA0170010Struct) list.get(i)).getPS_UNIT_NUMERATOR());
		}
		return size;
	}
	public int setL2L_BY_PRODUCT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BY_PRODUCT_CD == null) {
			l_BY_PRODUCT_CD = new ArrayList();
		} else {
			l_BY_PRODUCT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BY_PRODUCT_CD.add(((AA0170010Struct) list.get(i)).getBY_PRODUCT_CD());
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
			l_BUSINESS_OPR_DATE.add(((AA0170010Struct) list.get(i)).getBUSINESS_OPR_DATE());
		}
		return size;
	}
	public int setL2L_PARAM_RESULT_DATA(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PARAM_RESULT_DATA == null) {
			l_PARAM_RESULT_DATA = new ArrayList();
		} else {
			l_PARAM_RESULT_DATA.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PARAM_RESULT_DATA.add(((AA0170010Struct) list.get(i)).getPARAM_RESULT_DATA());
		}
		return size;
	}
	public int setL2L_PARAM_INPUT_DATA(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PARAM_INPUT_DATA == null) {
			l_PARAM_INPUT_DATA = new ArrayList();
		} else {
			l_PARAM_INPUT_DATA.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PARAM_INPUT_DATA.add(((AA0170010Struct) list.get(i)).getPARAM_INPUT_DATA());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_sub2_OUTSIDE_TYP_name = null;
		m_sub2_OUTSIDE_TYP_val = null;
		m_sub2_ACPT_INSPC_TYP_name = null;
		m_sub2_ACPT_INSPC_TYP_val = null;
		m_main_TARGET_ITEM_CD = null;
		m_main_DEVELOP_TYP = null;
		m_main_DEVELOP_TYP_name = null;
		m_main_DEVELOP_TYP_val = null;
		m_main_TARGET_DATE = null;
		m_main_LEVEL = null;
		m_ps_NO = null;
		m_ps_CONS_NAME = null;
		m_ps_PS_LT_NAME = null;
		m_ps_COST_UP_NAME = null;
		m_ps_MRP_EXP_NAME = null;
		m_pr_OUTSIDE_NAME = null;
		m_pr_ACPT_INSPC_NAME = null;
		m_sub1_PARENT_ITEM_NAME = null;
		m_sub1_DEVELOP_TYP = null;
		m_sub1_COMP_ITEM_NAME = null;
		m_sub1_MODIFY_COUNT = null;
		m_sub1_STOCK_UNIT = null;
		m_sub1_CONS_TYP_name = null;
		m_sub1_CONS_TYP_val = null;
		m_sub1_PS_LT_CHECK = null;
		m_sub1_COST_UP_TYP_name = null;
		m_sub1_COST_UP_TYP_val = null;
		m_sub1_MRP_EXP_TYP_name = null;
		m_sub1_MRP_EXP_TYP_val = null;
		m_sub1_TARGET_ITEM_CD = null;
		m_sub1_LEVEL = null;
		m_sub1_TARGET_DATE = null;
		m_pr_PS_EDITION = null;
		m_hidden_ITEM_NAME = null;
		m_sub2_STATUS = null;
		m_FIRST_PROC_FLG = null;
		m_sub1_h_PS_UNIT_NUMERATOR = null;
		m_sub1_h_PS_UNIT_DENOMINATOR = null;
		m_sub2_STOCK_UNIT_1 = null;
		m_sub2_STOCK_UNIT_2 = null;
		m_sub2_STOCK_UNIT_3 = null;
		m_ps_COMP_MANHOUR_NAME = null;
		m_ps_PARENT_ITEM_CD = null;
		m_ps_COMP_ITEM_CD = null;
		m_ps_PS_EDITION = null;
		m_ps_PS_UNIT_DENOMINATOR = null;
		m_ps_PS_UNIT_NUMERATOR = null;
		m_ps_EFF_PHASE_IN_DATE = null;
		m_ps_EFF_PHASE_OUT_DATE = null;
		m_ps_PS_SPOIL = null;
		m_ps_CONS_TYP = null;
		m_ps_PS_LT_FLG = null;
		m_ps_PS_FIXED_LT = null;
		m_ps_PS_PROP_LT = null;
		m_ps_PS_PROP_LOT_SIZE = null;
		m_ps_PS_REF_NO = null;
		m_ps_COST_UP_TYP = null;
		m_ps_MRP_EXP_TYP = null;
		m_ps_MODIFY_COUNT = null;
		m_ps_PARENT_ITEM_NAME = null;
		m_ps_COMP_ITEM_NAME = null;
		m_ps_STOCK_UNIT = null;
		m_ps_COMP_MANHOUR_TYP = null;
		m_ps_PARENT_MANHOUR_TYP = null;
		m_PARENT_ITEM_CD = null;
		m_COMP_ITEM_CD = null;
		m_EFF_PHASE_IN_DATE = null;
		m_EFF_PHASE_OUT_DATE = null;
		m_sub1_PARENT_ITEM_CD = null;
		m_sub1_COMP_ITEM_CD = null;
		m_sub1_PS_EDITION = null;
		m_sub1_PS_UNIT_DENOMINATOR = null;
		m_sub1_PS_UNIT_NUMERATOR = null;
		m_sub1_EFF_PHASE_IN_DATE = null;
		m_sub1_EFF_PHASE_OUT_DATE = null;
		m_sub1_PS_SPOIL = null;
		m_sub1_CONS_TYP = null;
		m_sub1_PS_LT_FLG = null;
		m_sub1_PS_FIXED_LT = null;
		m_sub1_PS_PROP_LT = null;
		m_sub1_PS_PROP_LOT_SIZE = null;
		m_sub1_PS_REF_NO = null;
		m_sub1_COST_UP_TYP = null;
		m_sub1_MRP_EXP_TYP = null;
		m_SEQ_NO = null;
		m_PS_EDITION = null;
		m_ACCESS_TYP = null;
		m_CMPLT_FLG = null;
		m_ITEM_CD = null;
		m_MRP_ODR_TYP = null;
		m_MODIFY_COUNT = null;
		m_ITEM_NAME = null;
		m_DRAW_CD = null;
		m_SPEC = null;
		m_ITEM_OUTSIDE_TYP = null;
		m_OPR_RSLT_TYP = null;
		m_ITEM_FIXED_LT = null;
		m_ITEM_PROP_LT = null;
		m_ITEM_PROP_LOT_SIZE = null;
		m_ITEM_ISSUE_LT = null;
		m_ITEM_SAFETY_LT = null;
		m_UNIT_QTY_TYP = null;
		m_STOCK_UNIT = null;
		m_w_TARGET_ITEM_CD = null;
		m_pr_PLANT_CD = null;
		m_pr_ITEM_CD = null;
		m_pr_PROC_CD = null;
		m_pr_PROC_NO = null;
		m_pr_PROC_NAME = null;
		m_pr_WS_CD = null;
		m_pr_COMPANY_CD = null;
		m_pr_VEND_CD = null;
		m_pr_FIXED_LT = null;
		m_pr_PROP_LT = null;
		m_pr_SAFETY_LT = null;
		m_pr_PROP_LOT_SIZE = null;
		m_pr_SPOIL = null;
		m_pr_OUTSIDE_TYP = null;
		m_pr_ACPT_INSPC_TYP = null;
		m_pr_STANDARD_COST = null;
		m_pr_MODIFY_COUNT = null;
		m_pr_UNIT_QTY = null;
		m_pr_WORK_TIME = null;
		m_pr_ITEM_NAME = null;
		m_pr_WS_NAME = null;
		m_pr_VEND_NAME = null;
		m_pr_STOCK_UNIT = null;
		m_PLANT_CD = null;
		m_hidden_ITEM_CD = null;
		m_PROC_CD = null;
		m_sub2_PLANT_CD = null;
		m_sub2_ITEM_CD = null;
		m_sub2_PROC_CD = null;
		m_sub2_PROC_NO = null;
		m_sub2_PROC_NAME = null;
		m_sub2_WS_CD = null;
		m_sub2_COMPANY_CD = null;
		m_sub2_VEND_CD = null;
		m_sub2_FIXED_LT = null;
		m_sub2_PROP_LT = null;
		m_sub2_SAFETY_LT = null;
		m_sub2_PROP_LOT_SIZE = null;
		m_sub2_SPOIL = null;
		m_sub2_OUTSIDE_TYP = null;
		m_sub2_ACPT_INSPC_TYP = null;
		m_sub2_STANDARD_COST = null;
		m_sub2_UNIT_QTY = null;
		m_sub2_WORK_TIME = null;
		m_sub2_MODIFY_COUNT = null;
		m_sub2_ITEM_NAME = null;
		m_sub2_WS_NAME = null;
		m_sub2_VEND_NAME = null;
		m_sub2_STOCK_UNIT = null;
		m_sub2_MANHOUR_TYP = null;
		m_WS_CD = null;
		m_VEND_CD = null;
		m_COMPANY_CD = null;
		m_PROC_NO = null;
		m_PS_UNIT_DENOMINATOR = null;
		m_PS_UNIT_NUMERATOR = null;
		m_BY_PRODUCT_CD = null;
		m_BUSINESS_OPR_DATE = null;
		m_PARAM_RESULT_DATA = null;
		m_PARAM_INPUT_DATA = null;

		l_sub2_OUTSIDE_TYP_name = null;
		l_sub2_OUTSIDE_TYP_val = null;
		l_sub2_ACPT_INSPC_TYP_name = null;
		l_sub2_ACPT_INSPC_TYP_val = null;
		l_main_TARGET_ITEM_CD = null;
		l_main_DEVELOP_TYP = null;
		l_main_DEVELOP_TYP_name = null;
		l_main_DEVELOP_TYP_val = null;
		l_main_TARGET_DATE = null;
		l_main_LEVEL = null;
		l_ps_NO = null;
		l_ps_CONS_NAME = null;
		l_ps_PS_LT_NAME = null;
		l_ps_COST_UP_NAME = null;
		l_ps_MRP_EXP_NAME = null;
		l_pr_OUTSIDE_NAME = null;
		l_pr_ACPT_INSPC_NAME = null;
		l_sub1_PARENT_ITEM_NAME = null;
		l_sub1_DEVELOP_TYP = null;
		l_sub1_COMP_ITEM_NAME = null;
		l_sub1_MODIFY_COUNT = null;
		l_sub1_STOCK_UNIT = null;
		l_sub1_CONS_TYP_name = null;
		l_sub1_CONS_TYP_val = null;
		l_sub1_PS_LT_CHECK = null;
		l_sub1_COST_UP_TYP_name = null;
		l_sub1_COST_UP_TYP_val = null;
		l_sub1_MRP_EXP_TYP_name = null;
		l_sub1_MRP_EXP_TYP_val = null;
		l_sub1_TARGET_ITEM_CD = null;
		l_sub1_LEVEL = null;
		l_sub1_TARGET_DATE = null;
		l_pr_PS_EDITION = null;
		l_hidden_ITEM_NAME = null;
		l_sub2_STATUS = null;
		l_FIRST_PROC_FLG = null;
		l_sub1_h_PS_UNIT_NUMERATOR = null;
		l_sub1_h_PS_UNIT_DENOMINATOR = null;
		l_sub2_STOCK_UNIT_1 = null;
		l_sub2_STOCK_UNIT_2 = null;
		l_sub2_STOCK_UNIT_3 = null;
		l_ps_COMP_MANHOUR_NAME = null;
		l_ps_PARENT_ITEM_CD = null;
		l_ps_COMP_ITEM_CD = null;
		l_ps_PS_EDITION = null;
		l_ps_PS_UNIT_DENOMINATOR = null;
		l_ps_PS_UNIT_NUMERATOR = null;
		l_ps_EFF_PHASE_IN_DATE = null;
		l_ps_EFF_PHASE_OUT_DATE = null;
		l_ps_PS_SPOIL = null;
		l_ps_CONS_TYP = null;
		l_ps_PS_LT_FLG = null;
		l_ps_PS_FIXED_LT = null;
		l_ps_PS_PROP_LT = null;
		l_ps_PS_PROP_LOT_SIZE = null;
		l_ps_PS_REF_NO = null;
		l_ps_COST_UP_TYP = null;
		l_ps_MRP_EXP_TYP = null;
		l_ps_MODIFY_COUNT = null;
		l_ps_PARENT_ITEM_NAME = null;
		l_ps_COMP_ITEM_NAME = null;
		l_ps_STOCK_UNIT = null;
		l_ps_COMP_MANHOUR_TYP = null;
		l_ps_PARENT_MANHOUR_TYP = null;
		l_PARENT_ITEM_CD = null;
		l_COMP_ITEM_CD = null;
		l_EFF_PHASE_IN_DATE = null;
		l_EFF_PHASE_OUT_DATE = null;
		l_sub1_PARENT_ITEM_CD = null;
		l_sub1_COMP_ITEM_CD = null;
		l_sub1_PS_EDITION = null;
		l_sub1_PS_UNIT_DENOMINATOR = null;
		l_sub1_PS_UNIT_NUMERATOR = null;
		l_sub1_EFF_PHASE_IN_DATE = null;
		l_sub1_EFF_PHASE_OUT_DATE = null;
		l_sub1_PS_SPOIL = null;
		l_sub1_CONS_TYP = null;
		l_sub1_PS_LT_FLG = null;
		l_sub1_PS_FIXED_LT = null;
		l_sub1_PS_PROP_LT = null;
		l_sub1_PS_PROP_LOT_SIZE = null;
		l_sub1_PS_REF_NO = null;
		l_sub1_COST_UP_TYP = null;
		l_sub1_MRP_EXP_TYP = null;
		l_SEQ_NO = null;
		l_PS_EDITION = null;
		l_ACCESS_TYP = null;
		l_CMPLT_FLG = null;
		l_ITEM_CD = null;
		l_MRP_ODR_TYP = null;
		l_MODIFY_COUNT = null;
		l_ITEM_NAME = null;
		l_DRAW_CD = null;
		l_SPEC = null;
		l_ITEM_OUTSIDE_TYP = null;
		l_OPR_RSLT_TYP = null;
		l_ITEM_FIXED_LT = null;
		l_ITEM_PROP_LT = null;
		l_ITEM_PROP_LOT_SIZE = null;
		l_ITEM_ISSUE_LT = null;
		l_ITEM_SAFETY_LT = null;
		l_UNIT_QTY_TYP = null;
		l_STOCK_UNIT = null;
		l_w_TARGET_ITEM_CD = null;
		l_pr_PLANT_CD = null;
		l_pr_ITEM_CD = null;
		l_pr_PROC_CD = null;
		l_pr_PROC_NO = null;
		l_pr_PROC_NAME = null;
		l_pr_WS_CD = null;
		l_pr_COMPANY_CD = null;
		l_pr_VEND_CD = null;
		l_pr_FIXED_LT = null;
		l_pr_PROP_LT = null;
		l_pr_SAFETY_LT = null;
		l_pr_PROP_LOT_SIZE = null;
		l_pr_SPOIL = null;
		l_pr_OUTSIDE_TYP = null;
		l_pr_ACPT_INSPC_TYP = null;
		l_pr_STANDARD_COST = null;
		l_pr_MODIFY_COUNT = null;
		l_pr_UNIT_QTY = null;
		l_pr_WORK_TIME = null;
		l_pr_ITEM_NAME = null;
		l_pr_WS_NAME = null;
		l_pr_VEND_NAME = null;
		l_pr_STOCK_UNIT = null;
		l_PLANT_CD = null;
		l_hidden_ITEM_CD = null;
		l_PROC_CD = null;
		l_sub2_PLANT_CD = null;
		l_sub2_ITEM_CD = null;
		l_sub2_PROC_CD = null;
		l_sub2_PROC_NO = null;
		l_sub2_PROC_NAME = null;
		l_sub2_WS_CD = null;
		l_sub2_COMPANY_CD = null;
		l_sub2_VEND_CD = null;
		l_sub2_FIXED_LT = null;
		l_sub2_PROP_LT = null;
		l_sub2_SAFETY_LT = null;
		l_sub2_PROP_LOT_SIZE = null;
		l_sub2_SPOIL = null;
		l_sub2_OUTSIDE_TYP = null;
		l_sub2_ACPT_INSPC_TYP = null;
		l_sub2_STANDARD_COST = null;
		l_sub2_UNIT_QTY = null;
		l_sub2_WORK_TIME = null;
		l_sub2_MODIFY_COUNT = null;
		l_sub2_ITEM_NAME = null;
		l_sub2_WS_NAME = null;
		l_sub2_VEND_NAME = null;
		l_sub2_STOCK_UNIT = null;
		l_sub2_MANHOUR_TYP = null;
		l_WS_CD = null;
		l_VEND_CD = null;
		l_COMPANY_CD = null;
		l_PROC_NO = null;
		l_PS_UNIT_DENOMINATOR = null;
		l_PS_UNIT_NUMERATOR = null;
		l_BY_PRODUCT_CD = null;
		l_BUSINESS_OPR_DATE = null;
		l_PARAM_RESULT_DATA = null;
		l_PARAM_INPUT_DATA = null;

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
	 * medAA0170010�N���X�̕W���R���X�g���N�^
	 */
	public AA0170010Struct()
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
	public void setStruct(AA0170010Struct struct)
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
	public void setStructM(AA0170010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setsub2_OUTSIDE_TYP_name(struct.getsub2_OUTSIDE_TYP_name());
			this.setsub2_OUTSIDE_TYP_val(struct.getsub2_OUTSIDE_TYP_val());
			this.setsub2_ACPT_INSPC_TYP_name(struct.getsub2_ACPT_INSPC_TYP_name());
			this.setsub2_ACPT_INSPC_TYP_val(struct.getsub2_ACPT_INSPC_TYP_val());
			this.setmain_TARGET_ITEM_CD(struct.getmain_TARGET_ITEM_CD());
			this.setmain_DEVELOP_TYP(struct.getmain_DEVELOP_TYP());
			this.setmain_DEVELOP_TYP_name(struct.getmain_DEVELOP_TYP_name());
			this.setmain_DEVELOP_TYP_val(struct.getmain_DEVELOP_TYP_val());
			this.setmain_TARGET_DATE(struct.getmain_TARGET_DATE());
			this.setmain_LEVEL(struct.getmain_LEVEL());
			this.setps_NO(struct.getps_NO());
			this.setps_CONS_NAME(struct.getps_CONS_NAME());
			this.setps_PS_LT_NAME(struct.getps_PS_LT_NAME());
			this.setps_COST_UP_NAME(struct.getps_COST_UP_NAME());
			this.setps_MRP_EXP_NAME(struct.getps_MRP_EXP_NAME());
			this.setpr_OUTSIDE_NAME(struct.getpr_OUTSIDE_NAME());
			this.setpr_ACPT_INSPC_NAME(struct.getpr_ACPT_INSPC_NAME());
			this.setsub1_PARENT_ITEM_NAME(struct.getsub1_PARENT_ITEM_NAME());
			this.setsub1_DEVELOP_TYP(struct.getsub1_DEVELOP_TYP());
			this.setsub1_COMP_ITEM_NAME(struct.getsub1_COMP_ITEM_NAME());
			this.setsub1_MODIFY_COUNT(struct.getsub1_MODIFY_COUNT());
			this.setsub1_STOCK_UNIT(struct.getsub1_STOCK_UNIT());
			this.setsub1_CONS_TYP_name(struct.getsub1_CONS_TYP_name());
			this.setsub1_CONS_TYP_val(struct.getsub1_CONS_TYP_val());
			this.setsub1_PS_LT_CHECK(struct.getsub1_PS_LT_CHECK());
			this.setsub1_COST_UP_TYP_name(struct.getsub1_COST_UP_TYP_name());
			this.setsub1_COST_UP_TYP_val(struct.getsub1_COST_UP_TYP_val());
			this.setsub1_MRP_EXP_TYP_name(struct.getsub1_MRP_EXP_TYP_name());
			this.setsub1_MRP_EXP_TYP_val(struct.getsub1_MRP_EXP_TYP_val());
			this.setsub1_TARGET_ITEM_CD(struct.getsub1_TARGET_ITEM_CD());
			this.setsub1_LEVEL(struct.getsub1_LEVEL());
			this.setsub1_TARGET_DATE(struct.getsub1_TARGET_DATE());
			this.setpr_PS_EDITION(struct.getpr_PS_EDITION());
			this.sethidden_ITEM_NAME(struct.gethidden_ITEM_NAME());
			this.setsub2_STATUS(struct.getsub2_STATUS());
			this.setFIRST_PROC_FLG(struct.getFIRST_PROC_FLG());
			this.setsub1_h_PS_UNIT_NUMERATOR(struct.getsub1_h_PS_UNIT_NUMERATOR());
			this.setsub1_h_PS_UNIT_DENOMINATOR(struct.getsub1_h_PS_UNIT_DENOMINATOR());
			this.setsub2_STOCK_UNIT_1(struct.getsub2_STOCK_UNIT_1());
			this.setsub2_STOCK_UNIT_2(struct.getsub2_STOCK_UNIT_2());
			this.setsub2_STOCK_UNIT_3(struct.getsub2_STOCK_UNIT_3());
			this.setps_COMP_MANHOUR_NAME(struct.getps_COMP_MANHOUR_NAME());
			this.setps_PARENT_ITEM_CD(struct.getps_PARENT_ITEM_CD());
			this.setps_COMP_ITEM_CD(struct.getps_COMP_ITEM_CD());
			this.setps_PS_EDITION(struct.getps_PS_EDITION());
			this.setps_PS_UNIT_DENOMINATOR(struct.getps_PS_UNIT_DENOMINATOR());
			this.setps_PS_UNIT_NUMERATOR(struct.getps_PS_UNIT_NUMERATOR());
			this.setps_EFF_PHASE_IN_DATE(struct.getps_EFF_PHASE_IN_DATE());
			this.setps_EFF_PHASE_OUT_DATE(struct.getps_EFF_PHASE_OUT_DATE());
			this.setps_PS_SPOIL(struct.getps_PS_SPOIL());
			this.setps_CONS_TYP(struct.getps_CONS_TYP());
			this.setps_PS_LT_FLG(struct.getps_PS_LT_FLG());
			this.setps_PS_FIXED_LT(struct.getps_PS_FIXED_LT());
			this.setps_PS_PROP_LT(struct.getps_PS_PROP_LT());
			this.setps_PS_PROP_LOT_SIZE(struct.getps_PS_PROP_LOT_SIZE());
			this.setps_PS_REF_NO(struct.getps_PS_REF_NO());
			this.setps_COST_UP_TYP(struct.getps_COST_UP_TYP());
			this.setps_MRP_EXP_TYP(struct.getps_MRP_EXP_TYP());
			this.setps_MODIFY_COUNT(struct.getps_MODIFY_COUNT());
			this.setps_PARENT_ITEM_NAME(struct.getps_PARENT_ITEM_NAME());
			this.setps_COMP_ITEM_NAME(struct.getps_COMP_ITEM_NAME());
			this.setps_STOCK_UNIT(struct.getps_STOCK_UNIT());
			this.setps_COMP_MANHOUR_TYP(struct.getps_COMP_MANHOUR_TYP());
			this.setps_PARENT_MANHOUR_TYP(struct.getps_PARENT_MANHOUR_TYP());
			this.setPARENT_ITEM_CD(struct.getPARENT_ITEM_CD());
			this.setCOMP_ITEM_CD(struct.getCOMP_ITEM_CD());
			this.setEFF_PHASE_IN_DATE(struct.getEFF_PHASE_IN_DATE());
			this.setEFF_PHASE_OUT_DATE(struct.getEFF_PHASE_OUT_DATE());
			this.setsub1_PARENT_ITEM_CD(struct.getsub1_PARENT_ITEM_CD());
			this.setsub1_COMP_ITEM_CD(struct.getsub1_COMP_ITEM_CD());
			this.setsub1_PS_EDITION(struct.getsub1_PS_EDITION());
			this.setsub1_PS_UNIT_DENOMINATOR(struct.getsub1_PS_UNIT_DENOMINATOR());
			this.setsub1_PS_UNIT_NUMERATOR(struct.getsub1_PS_UNIT_NUMERATOR());
			this.setsub1_EFF_PHASE_IN_DATE(struct.getsub1_EFF_PHASE_IN_DATE());
			this.setsub1_EFF_PHASE_OUT_DATE(struct.getsub1_EFF_PHASE_OUT_DATE());
			this.setsub1_PS_SPOIL(struct.getsub1_PS_SPOIL());
			this.setsub1_CONS_TYP(struct.getsub1_CONS_TYP());
			this.setsub1_PS_LT_FLG(struct.getsub1_PS_LT_FLG());
			this.setsub1_PS_FIXED_LT(struct.getsub1_PS_FIXED_LT());
			this.setsub1_PS_PROP_LT(struct.getsub1_PS_PROP_LT());
			this.setsub1_PS_PROP_LOT_SIZE(struct.getsub1_PS_PROP_LOT_SIZE());
			this.setsub1_PS_REF_NO(struct.getsub1_PS_REF_NO());
			this.setsub1_COST_UP_TYP(struct.getsub1_COST_UP_TYP());
			this.setsub1_MRP_EXP_TYP(struct.getsub1_MRP_EXP_TYP());
			this.setSEQ_NO(struct.getSEQ_NO());
			this.setPS_EDITION(struct.getPS_EDITION());
			this.setACCESS_TYP(struct.getACCESS_TYP());
			this.setCMPLT_FLG(struct.getCMPLT_FLG());
			this.setITEM_CD(struct.getITEM_CD());
			this.setMRP_ODR_TYP(struct.getMRP_ODR_TYP());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setDRAW_CD(struct.getDRAW_CD());
			this.setSPEC(struct.getSPEC());
			this.setITEM_OUTSIDE_TYP(struct.getITEM_OUTSIDE_TYP());
			this.setOPR_RSLT_TYP(struct.getOPR_RSLT_TYP());
			this.setITEM_FIXED_LT(struct.getITEM_FIXED_LT());
			this.setITEM_PROP_LT(struct.getITEM_PROP_LT());
			this.setITEM_PROP_LOT_SIZE(struct.getITEM_PROP_LOT_SIZE());
			this.setITEM_ISSUE_LT(struct.getITEM_ISSUE_LT());
			this.setITEM_SAFETY_LT(struct.getITEM_SAFETY_LT());
			this.setUNIT_QTY_TYP(struct.getUNIT_QTY_TYP());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setw_TARGET_ITEM_CD(struct.getw_TARGET_ITEM_CD());
			this.setpr_PLANT_CD(struct.getpr_PLANT_CD());
			this.setpr_ITEM_CD(struct.getpr_ITEM_CD());
			this.setpr_PROC_CD(struct.getpr_PROC_CD());
			this.setpr_PROC_NO(struct.getpr_PROC_NO());
			this.setpr_PROC_NAME(struct.getpr_PROC_NAME());
			this.setpr_WS_CD(struct.getpr_WS_CD());
			this.setpr_COMPANY_CD(struct.getpr_COMPANY_CD());
			this.setpr_VEND_CD(struct.getpr_VEND_CD());
			this.setpr_FIXED_LT(struct.getpr_FIXED_LT());
			this.setpr_PROP_LT(struct.getpr_PROP_LT());
			this.setpr_SAFETY_LT(struct.getpr_SAFETY_LT());
			this.setpr_PROP_LOT_SIZE(struct.getpr_PROP_LOT_SIZE());
			this.setpr_SPOIL(struct.getpr_SPOIL());
			this.setpr_OUTSIDE_TYP(struct.getpr_OUTSIDE_TYP());
			this.setpr_ACPT_INSPC_TYP(struct.getpr_ACPT_INSPC_TYP());
			this.setpr_STANDARD_COST(struct.getpr_STANDARD_COST());
			this.setpr_MODIFY_COUNT(struct.getpr_MODIFY_COUNT());
			this.setpr_UNIT_QTY(struct.getpr_UNIT_QTY());
			this.setpr_WORK_TIME(struct.getpr_WORK_TIME());
			this.setpr_ITEM_NAME(struct.getpr_ITEM_NAME());
			this.setpr_WS_NAME(struct.getpr_WS_NAME());
			this.setpr_VEND_NAME(struct.getpr_VEND_NAME());
			this.setpr_STOCK_UNIT(struct.getpr_STOCK_UNIT());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.sethidden_ITEM_CD(struct.gethidden_ITEM_CD());
			this.setPROC_CD(struct.getPROC_CD());
			this.setsub2_PLANT_CD(struct.getsub2_PLANT_CD());
			this.setsub2_ITEM_CD(struct.getsub2_ITEM_CD());
			this.setsub2_PROC_CD(struct.getsub2_PROC_CD());
			this.setsub2_PROC_NO(struct.getsub2_PROC_NO());
			this.setsub2_PROC_NAME(struct.getsub2_PROC_NAME());
			this.setsub2_WS_CD(struct.getsub2_WS_CD());
			this.setsub2_COMPANY_CD(struct.getsub2_COMPANY_CD());
			this.setsub2_VEND_CD(struct.getsub2_VEND_CD());
			this.setsub2_FIXED_LT(struct.getsub2_FIXED_LT());
			this.setsub2_PROP_LT(struct.getsub2_PROP_LT());
			this.setsub2_SAFETY_LT(struct.getsub2_SAFETY_LT());
			this.setsub2_PROP_LOT_SIZE(struct.getsub2_PROP_LOT_SIZE());
			this.setsub2_SPOIL(struct.getsub2_SPOIL());
			this.setsub2_OUTSIDE_TYP(struct.getsub2_OUTSIDE_TYP());
			this.setsub2_ACPT_INSPC_TYP(struct.getsub2_ACPT_INSPC_TYP());
			this.setsub2_STANDARD_COST(struct.getsub2_STANDARD_COST());
			this.setsub2_UNIT_QTY(struct.getsub2_UNIT_QTY());
			this.setsub2_WORK_TIME(struct.getsub2_WORK_TIME());
			this.setsub2_MODIFY_COUNT(struct.getsub2_MODIFY_COUNT());
			this.setsub2_ITEM_NAME(struct.getsub2_ITEM_NAME());
			this.setsub2_WS_NAME(struct.getsub2_WS_NAME());
			this.setsub2_VEND_NAME(struct.getsub2_VEND_NAME());
			this.setsub2_STOCK_UNIT(struct.getsub2_STOCK_UNIT());
			this.setsub2_MANHOUR_TYP(struct.getsub2_MANHOUR_TYP());
			this.setWS_CD(struct.getWS_CD());
			this.setVEND_CD(struct.getVEND_CD());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setPROC_NO(struct.getPROC_NO());
			this.setPS_UNIT_DENOMINATOR(struct.getPS_UNIT_DENOMINATOR());
			this.setPS_UNIT_NUMERATOR(struct.getPS_UNIT_NUMERATOR());
			this.setBY_PRODUCT_CD(struct.getBY_PRODUCT_CD());
			this.setBUSINESS_OPR_DATE(struct.getBUSINESS_OPR_DATE());
			this.setPARAM_RESULT_DATA(struct.getPARAM_RESULT_DATA());
			this.setPARAM_INPUT_DATA(struct.getPARAM_INPUT_DATA());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AA0170010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_sub2_OUTSIDE_TYP_name(struct.getList_sub2_OUTSIDE_TYP_name());
			this.setList_sub2_OUTSIDE_TYP_val(struct.getList_sub2_OUTSIDE_TYP_val());
			this.setList_sub2_ACPT_INSPC_TYP_name(struct.getList_sub2_ACPT_INSPC_TYP_name());
			this.setList_sub2_ACPT_INSPC_TYP_val(struct.getList_sub2_ACPT_INSPC_TYP_val());
			this.setList_main_TARGET_ITEM_CD(struct.getList_main_TARGET_ITEM_CD());
			this.setList_main_DEVELOP_TYP(struct.getList_main_DEVELOP_TYP());
			this.setList_main_DEVELOP_TYP_name(struct.getList_main_DEVELOP_TYP_name());
			this.setList_main_DEVELOP_TYP_val(struct.getList_main_DEVELOP_TYP_val());
			this.setList_main_TARGET_DATE(struct.getList_main_TARGET_DATE());
			this.setList_main_LEVEL(struct.getList_main_LEVEL());
			this.setList_ps_NO(struct.getList_ps_NO());
			this.setList_ps_CONS_NAME(struct.getList_ps_CONS_NAME());
			this.setList_ps_PS_LT_NAME(struct.getList_ps_PS_LT_NAME());
			this.setList_ps_COST_UP_NAME(struct.getList_ps_COST_UP_NAME());
			this.setList_ps_MRP_EXP_NAME(struct.getList_ps_MRP_EXP_NAME());
			this.setList_pr_OUTSIDE_NAME(struct.getList_pr_OUTSIDE_NAME());
			this.setList_pr_ACPT_INSPC_NAME(struct.getList_pr_ACPT_INSPC_NAME());
			this.setList_sub1_PARENT_ITEM_NAME(struct.getList_sub1_PARENT_ITEM_NAME());
			this.setList_sub1_DEVELOP_TYP(struct.getList_sub1_DEVELOP_TYP());
			this.setList_sub1_COMP_ITEM_NAME(struct.getList_sub1_COMP_ITEM_NAME());
			this.setList_sub1_MODIFY_COUNT(struct.getList_sub1_MODIFY_COUNT());
			this.setList_sub1_STOCK_UNIT(struct.getList_sub1_STOCK_UNIT());
			this.setList_sub1_CONS_TYP_name(struct.getList_sub1_CONS_TYP_name());
			this.setList_sub1_CONS_TYP_val(struct.getList_sub1_CONS_TYP_val());
			this.setList_sub1_PS_LT_CHECK(struct.getList_sub1_PS_LT_CHECK());
			this.setList_sub1_COST_UP_TYP_name(struct.getList_sub1_COST_UP_TYP_name());
			this.setList_sub1_COST_UP_TYP_val(struct.getList_sub1_COST_UP_TYP_val());
			this.setList_sub1_MRP_EXP_TYP_name(struct.getList_sub1_MRP_EXP_TYP_name());
			this.setList_sub1_MRP_EXP_TYP_val(struct.getList_sub1_MRP_EXP_TYP_val());
			this.setList_sub1_TARGET_ITEM_CD(struct.getList_sub1_TARGET_ITEM_CD());
			this.setList_sub1_LEVEL(struct.getList_sub1_LEVEL());
			this.setList_sub1_TARGET_DATE(struct.getList_sub1_TARGET_DATE());
			this.setList_pr_PS_EDITION(struct.getList_pr_PS_EDITION());
			this.setList_hidden_ITEM_NAME(struct.getList_hidden_ITEM_NAME());
			this.setList_sub2_STATUS(struct.getList_sub2_STATUS());
			this.setList_FIRST_PROC_FLG(struct.getList_FIRST_PROC_FLG());
			this.setList_sub1_h_PS_UNIT_NUMERATOR(struct.getList_sub1_h_PS_UNIT_NUMERATOR());
			this.setList_sub1_h_PS_UNIT_DENOMINATOR(struct.getList_sub1_h_PS_UNIT_DENOMINATOR());
			this.setList_sub2_STOCK_UNIT_1(struct.getList_sub2_STOCK_UNIT_1());
			this.setList_sub2_STOCK_UNIT_2(struct.getList_sub2_STOCK_UNIT_2());
			this.setList_sub2_STOCK_UNIT_3(struct.getList_sub2_STOCK_UNIT_3());
			this.setList_ps_COMP_MANHOUR_NAME(struct.getList_ps_COMP_MANHOUR_NAME());
			this.setList_ps_PARENT_ITEM_CD(struct.getList_ps_PARENT_ITEM_CD());
			this.setList_ps_COMP_ITEM_CD(struct.getList_ps_COMP_ITEM_CD());
			this.setList_ps_PS_EDITION(struct.getList_ps_PS_EDITION());
			this.setList_ps_PS_UNIT_DENOMINATOR(struct.getList_ps_PS_UNIT_DENOMINATOR());
			this.setList_ps_PS_UNIT_NUMERATOR(struct.getList_ps_PS_UNIT_NUMERATOR());
			this.setList_ps_EFF_PHASE_IN_DATE(struct.getList_ps_EFF_PHASE_IN_DATE());
			this.setList_ps_EFF_PHASE_OUT_DATE(struct.getList_ps_EFF_PHASE_OUT_DATE());
			this.setList_ps_PS_SPOIL(struct.getList_ps_PS_SPOIL());
			this.setList_ps_CONS_TYP(struct.getList_ps_CONS_TYP());
			this.setList_ps_PS_LT_FLG(struct.getList_ps_PS_LT_FLG());
			this.setList_ps_PS_FIXED_LT(struct.getList_ps_PS_FIXED_LT());
			this.setList_ps_PS_PROP_LT(struct.getList_ps_PS_PROP_LT());
			this.setList_ps_PS_PROP_LOT_SIZE(struct.getList_ps_PS_PROP_LOT_SIZE());
			this.setList_ps_PS_REF_NO(struct.getList_ps_PS_REF_NO());
			this.setList_ps_COST_UP_TYP(struct.getList_ps_COST_UP_TYP());
			this.setList_ps_MRP_EXP_TYP(struct.getList_ps_MRP_EXP_TYP());
			this.setList_ps_MODIFY_COUNT(struct.getList_ps_MODIFY_COUNT());
			this.setList_ps_PARENT_ITEM_NAME(struct.getList_ps_PARENT_ITEM_NAME());
			this.setList_ps_COMP_ITEM_NAME(struct.getList_ps_COMP_ITEM_NAME());
			this.setList_ps_STOCK_UNIT(struct.getList_ps_STOCK_UNIT());
			this.setList_ps_COMP_MANHOUR_TYP(struct.getList_ps_COMP_MANHOUR_TYP());
			this.setList_ps_PARENT_MANHOUR_TYP(struct.getList_ps_PARENT_MANHOUR_TYP());
			this.setList_PARENT_ITEM_CD(struct.getList_PARENT_ITEM_CD());
			this.setList_COMP_ITEM_CD(struct.getList_COMP_ITEM_CD());
			this.setList_EFF_PHASE_IN_DATE(struct.getList_EFF_PHASE_IN_DATE());
			this.setList_EFF_PHASE_OUT_DATE(struct.getList_EFF_PHASE_OUT_DATE());
			this.setList_sub1_PARENT_ITEM_CD(struct.getList_sub1_PARENT_ITEM_CD());
			this.setList_sub1_COMP_ITEM_CD(struct.getList_sub1_COMP_ITEM_CD());
			this.setList_sub1_PS_EDITION(struct.getList_sub1_PS_EDITION());
			this.setList_sub1_PS_UNIT_DENOMINATOR(struct.getList_sub1_PS_UNIT_DENOMINATOR());
			this.setList_sub1_PS_UNIT_NUMERATOR(struct.getList_sub1_PS_UNIT_NUMERATOR());
			this.setList_sub1_EFF_PHASE_IN_DATE(struct.getList_sub1_EFF_PHASE_IN_DATE());
			this.setList_sub1_EFF_PHASE_OUT_DATE(struct.getList_sub1_EFF_PHASE_OUT_DATE());
			this.setList_sub1_PS_SPOIL(struct.getList_sub1_PS_SPOIL());
			this.setList_sub1_CONS_TYP(struct.getList_sub1_CONS_TYP());
			this.setList_sub1_PS_LT_FLG(struct.getList_sub1_PS_LT_FLG());
			this.setList_sub1_PS_FIXED_LT(struct.getList_sub1_PS_FIXED_LT());
			this.setList_sub1_PS_PROP_LT(struct.getList_sub1_PS_PROP_LT());
			this.setList_sub1_PS_PROP_LOT_SIZE(struct.getList_sub1_PS_PROP_LOT_SIZE());
			this.setList_sub1_PS_REF_NO(struct.getList_sub1_PS_REF_NO());
			this.setList_sub1_COST_UP_TYP(struct.getList_sub1_COST_UP_TYP());
			this.setList_sub1_MRP_EXP_TYP(struct.getList_sub1_MRP_EXP_TYP());
			this.setList_SEQ_NO(struct.getList_SEQ_NO());
			this.setList_PS_EDITION(struct.getList_PS_EDITION());
			this.setList_ACCESS_TYP(struct.getList_ACCESS_TYP());
			this.setList_CMPLT_FLG(struct.getList_CMPLT_FLG());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_MRP_ODR_TYP(struct.getList_MRP_ODR_TYP());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_DRAW_CD(struct.getList_DRAW_CD());
			this.setList_SPEC(struct.getList_SPEC());
			this.setList_ITEM_OUTSIDE_TYP(struct.getList_ITEM_OUTSIDE_TYP());
			this.setList_OPR_RSLT_TYP(struct.getList_OPR_RSLT_TYP());
			this.setList_ITEM_FIXED_LT(struct.getList_ITEM_FIXED_LT());
			this.setList_ITEM_PROP_LT(struct.getList_ITEM_PROP_LT());
			this.setList_ITEM_PROP_LOT_SIZE(struct.getList_ITEM_PROP_LOT_SIZE());
			this.setList_ITEM_ISSUE_LT(struct.getList_ITEM_ISSUE_LT());
			this.setList_ITEM_SAFETY_LT(struct.getList_ITEM_SAFETY_LT());
			this.setList_UNIT_QTY_TYP(struct.getList_UNIT_QTY_TYP());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_w_TARGET_ITEM_CD(struct.getList_w_TARGET_ITEM_CD());
			this.setList_pr_PLANT_CD(struct.getList_pr_PLANT_CD());
			this.setList_pr_ITEM_CD(struct.getList_pr_ITEM_CD());
			this.setList_pr_PROC_CD(struct.getList_pr_PROC_CD());
			this.setList_pr_PROC_NO(struct.getList_pr_PROC_NO());
			this.setList_pr_PROC_NAME(struct.getList_pr_PROC_NAME());
			this.setList_pr_WS_CD(struct.getList_pr_WS_CD());
			this.setList_pr_COMPANY_CD(struct.getList_pr_COMPANY_CD());
			this.setList_pr_VEND_CD(struct.getList_pr_VEND_CD());
			this.setList_pr_FIXED_LT(struct.getList_pr_FIXED_LT());
			this.setList_pr_PROP_LT(struct.getList_pr_PROP_LT());
			this.setList_pr_SAFETY_LT(struct.getList_pr_SAFETY_LT());
			this.setList_pr_PROP_LOT_SIZE(struct.getList_pr_PROP_LOT_SIZE());
			this.setList_pr_SPOIL(struct.getList_pr_SPOIL());
			this.setList_pr_OUTSIDE_TYP(struct.getList_pr_OUTSIDE_TYP());
			this.setList_pr_ACPT_INSPC_TYP(struct.getList_pr_ACPT_INSPC_TYP());
			this.setList_pr_STANDARD_COST(struct.getList_pr_STANDARD_COST());
			this.setList_pr_MODIFY_COUNT(struct.getList_pr_MODIFY_COUNT());
			this.setList_pr_UNIT_QTY(struct.getList_pr_UNIT_QTY());
			this.setList_pr_WORK_TIME(struct.getList_pr_WORK_TIME());
			this.setList_pr_ITEM_NAME(struct.getList_pr_ITEM_NAME());
			this.setList_pr_WS_NAME(struct.getList_pr_WS_NAME());
			this.setList_pr_VEND_NAME(struct.getList_pr_VEND_NAME());
			this.setList_pr_STOCK_UNIT(struct.getList_pr_STOCK_UNIT());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_hidden_ITEM_CD(struct.getList_hidden_ITEM_CD());
			this.setList_PROC_CD(struct.getList_PROC_CD());
			this.setList_sub2_PLANT_CD(struct.getList_sub2_PLANT_CD());
			this.setList_sub2_ITEM_CD(struct.getList_sub2_ITEM_CD());
			this.setList_sub2_PROC_CD(struct.getList_sub2_PROC_CD());
			this.setList_sub2_PROC_NO(struct.getList_sub2_PROC_NO());
			this.setList_sub2_PROC_NAME(struct.getList_sub2_PROC_NAME());
			this.setList_sub2_WS_CD(struct.getList_sub2_WS_CD());
			this.setList_sub2_COMPANY_CD(struct.getList_sub2_COMPANY_CD());
			this.setList_sub2_VEND_CD(struct.getList_sub2_VEND_CD());
			this.setList_sub2_FIXED_LT(struct.getList_sub2_FIXED_LT());
			this.setList_sub2_PROP_LT(struct.getList_sub2_PROP_LT());
			this.setList_sub2_SAFETY_LT(struct.getList_sub2_SAFETY_LT());
			this.setList_sub2_PROP_LOT_SIZE(struct.getList_sub2_PROP_LOT_SIZE());
			this.setList_sub2_SPOIL(struct.getList_sub2_SPOIL());
			this.setList_sub2_OUTSIDE_TYP(struct.getList_sub2_OUTSIDE_TYP());
			this.setList_sub2_ACPT_INSPC_TYP(struct.getList_sub2_ACPT_INSPC_TYP());
			this.setList_sub2_STANDARD_COST(struct.getList_sub2_STANDARD_COST());
			this.setList_sub2_UNIT_QTY(struct.getList_sub2_UNIT_QTY());
			this.setList_sub2_WORK_TIME(struct.getList_sub2_WORK_TIME());
			this.setList_sub2_MODIFY_COUNT(struct.getList_sub2_MODIFY_COUNT());
			this.setList_sub2_ITEM_NAME(struct.getList_sub2_ITEM_NAME());
			this.setList_sub2_WS_NAME(struct.getList_sub2_WS_NAME());
			this.setList_sub2_VEND_NAME(struct.getList_sub2_VEND_NAME());
			this.setList_sub2_STOCK_UNIT(struct.getList_sub2_STOCK_UNIT());
			this.setList_sub2_MANHOUR_TYP(struct.getList_sub2_MANHOUR_TYP());
			this.setList_WS_CD(struct.getList_WS_CD());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_PROC_NO(struct.getList_PROC_NO());
			this.setList_PS_UNIT_DENOMINATOR(struct.getList_PS_UNIT_DENOMINATOR());
			this.setList_PS_UNIT_NUMERATOR(struct.getList_PS_UNIT_NUMERATOR());
			this.setList_BY_PRODUCT_CD(struct.getList_BY_PRODUCT_CD());
			this.setList_BUSINESS_OPR_DATE(struct.getList_BUSINESS_OPR_DATE());
			this.setList_PARAM_RESULT_DATA(struct.getList_PARAM_RESULT_DATA());
			this.setList_PARAM_INPUT_DATA(struct.getList_PARAM_INPUT_DATA());
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
	// �� 1 �ϐ������l�F i_sub2_OUTSIDE_TYP_name


	final static String i_sub2_OUTSIDE_TYP_name = null;

	// �� 2 �ϐ������l�F i_sub2_OUTSIDE_TYP_val


	final static String i_sub2_OUTSIDE_TYP_val = null;

	// �� 3 �ϐ������l�F i_sub2_ACPT_INSPC_TYP_name


	final static String i_sub2_ACPT_INSPC_TYP_name = null;

	// �� 4 �ϐ������l�F i_sub2_ACPT_INSPC_TYP_val


	final static String i_sub2_ACPT_INSPC_TYP_val = null;

	// �� 5 �ϐ������l�F i_main_TARGET_ITEM_CD


	final static String i_main_TARGET_ITEM_CD = null;

	// �� 6 �ϐ������l�F i_main_DEVELOP_TYP


	final static String i_main_DEVELOP_TYP = null;

	// �� 7 �ϐ������l�F i_main_DEVELOP_TYP_name


	final static String i_main_DEVELOP_TYP_name = null;

	// �� 8 �ϐ������l�F i_main_DEVELOP_TYP_val


	final static String i_main_DEVELOP_TYP_val = null;

	// �� 9 �ϐ������l�F i_main_TARGET_DATE


	final static String i_main_TARGET_DATE = null;

	// �� 10 �ϐ������l�F i_main_LEVEL


	final static String i_main_LEVEL = null;

	// �� 11 �ϐ������l�F i_ps_NO


	final static String i_ps_NO = null;

	// �� 12 �ϐ������l�F i_ps_CONS_NAME


	final static String i_ps_CONS_NAME = null;

	// �� 13 �ϐ������l�F i_ps_PS_LT_NAME


	final static String i_ps_PS_LT_NAME = null;

	// �� 14 �ϐ������l�F i_ps_COST_UP_NAME


	final static String i_ps_COST_UP_NAME = null;

	// �� 15 �ϐ������l�F i_ps_MRP_EXP_NAME


	final static String i_ps_MRP_EXP_NAME = null;

	// �� 16 �ϐ������l�F i_pr_OUTSIDE_NAME


	final static String i_pr_OUTSIDE_NAME = null;

	// �� 17 �ϐ������l�F i_pr_ACPT_INSPC_NAME


	final static String i_pr_ACPT_INSPC_NAME = null;

	// �� 18 �ϐ������l�F i_sub1_PARENT_ITEM_NAME


	final static String i_sub1_PARENT_ITEM_NAME = null;

	// �� 19 �ϐ������l�F i_sub1_DEVELOP_TYP


	final static String i_sub1_DEVELOP_TYP = null;

	// �� 20 �ϐ������l�F i_sub1_COMP_ITEM_NAME


	final static String i_sub1_COMP_ITEM_NAME = null;

	// �� 21 �ϐ������l�F i_sub1_MODIFY_COUNT


	final static String i_sub1_MODIFY_COUNT = null;

	// �� 22 �ϐ������l�F i_sub1_STOCK_UNIT


	final static String i_sub1_STOCK_UNIT = null;

	// �� 23 �ϐ������l�F i_sub1_CONS_TYP_name


	final static String i_sub1_CONS_TYP_name = null;

	// �� 24 �ϐ������l�F i_sub1_CONS_TYP_val


	final static String i_sub1_CONS_TYP_val = null;

	// �� 25 �ϐ������l�F i_sub1_PS_LT_CHECK


	final static String i_sub1_PS_LT_CHECK = null;

	// �� 26 �ϐ������l�F i_sub1_COST_UP_TYP_name


	final static String i_sub1_COST_UP_TYP_name = null;

	// �� 27 �ϐ������l�F i_sub1_COST_UP_TYP_val


	final static String i_sub1_COST_UP_TYP_val = null;

	// �� 28 �ϐ������l�F i_sub1_MRP_EXP_TYP_name


	final static String i_sub1_MRP_EXP_TYP_name = null;

	// �� 29 �ϐ������l�F i_sub1_MRP_EXP_TYP_val


	final static String i_sub1_MRP_EXP_TYP_val = null;

	// �� 30 �ϐ������l�F i_sub1_TARGET_ITEM_CD


	final static String i_sub1_TARGET_ITEM_CD = null;

	// �� 31 �ϐ������l�F i_sub1_LEVEL


	final static String i_sub1_LEVEL = null;

	// �� 32 �ϐ������l�F i_sub1_TARGET_DATE


	final static String i_sub1_TARGET_DATE = null;

	// �� 33 �ϐ������l�F i_pr_PS_EDITION


	final static String i_pr_PS_EDITION = null;

	// �� 34 �ϐ������l�F i_hidden_ITEM_NAME


	final static String i_hidden_ITEM_NAME = null;

	// �� 35 �ϐ������l�F i_sub2_STATUS


	final static String i_sub2_STATUS = null;

	// �� 36 �ϐ������l�F i_FIRST_PROC_FLG


	final static String i_FIRST_PROC_FLG = null;

	// �� 37 �ϐ������l�F i_sub1_h_PS_UNIT_NUMERATOR


	final static String i_sub1_h_PS_UNIT_NUMERATOR = null;

	// �� 38 �ϐ������l�F i_sub1_h_PS_UNIT_DENOMINATOR


	final static String i_sub1_h_PS_UNIT_DENOMINATOR = null;

	// �� 39 �ϐ������l�F i_sub2_STOCK_UNIT_1


	final static String i_sub2_STOCK_UNIT_1 = null;

	// �� 40 �ϐ������l�F i_sub2_STOCK_UNIT_2


	final static String i_sub2_STOCK_UNIT_2 = null;

	// �� 41 �ϐ������l�F i_sub2_STOCK_UNIT_3


	final static String i_sub2_STOCK_UNIT_3 = null;

	// �� 42 �ϐ������l�F i_ps_COMP_MANHOUR_NAME


	final static String i_ps_COMP_MANHOUR_NAME = null;

	// �� 43 �ϐ������l�F i_ps_PARENT_ITEM_CD


	final static String i_ps_PARENT_ITEM_CD = null;

	// �� 44 �ϐ������l�F i_ps_COMP_ITEM_CD


	final static String i_ps_COMP_ITEM_CD = null;

	// �� 45 �ϐ������l�F i_ps_PS_EDITION


	final static String i_ps_PS_EDITION = null;

	// �� 46 �ϐ������l�F i_ps_PS_UNIT_DENOMINATOR


	final static String i_ps_PS_UNIT_DENOMINATOR = null;

	// �� 47 �ϐ������l�F i_ps_PS_UNIT_NUMERATOR


	final static String i_ps_PS_UNIT_NUMERATOR = null;

	// �� 48 �ϐ������l�F i_ps_EFF_PHASE_IN_DATE


	final static String i_ps_EFF_PHASE_IN_DATE = null;

	// �� 49 �ϐ������l�F i_ps_EFF_PHASE_OUT_DATE


	final static String i_ps_EFF_PHASE_OUT_DATE = null;

	// �� 50 �ϐ������l�F i_ps_PS_SPOIL


	final static String i_ps_PS_SPOIL = null;

	// �� 51 �ϐ������l�F i_ps_CONS_TYP


	final static String i_ps_CONS_TYP = null;

	// �� 52 �ϐ������l�F i_ps_PS_LT_FLG


	final static String i_ps_PS_LT_FLG = null;

	// �� 53 �ϐ������l�F i_ps_PS_FIXED_LT


	final static String i_ps_PS_FIXED_LT = null;

	// �� 54 �ϐ������l�F i_ps_PS_PROP_LT


	final static String i_ps_PS_PROP_LT = null;

	// �� 55 �ϐ������l�F i_ps_PS_PROP_LOT_SIZE


	final static String i_ps_PS_PROP_LOT_SIZE = null;

	// �� 56 �ϐ������l�F i_ps_PS_REF_NO


	final static String i_ps_PS_REF_NO = null;

	// �� 57 �ϐ������l�F i_ps_COST_UP_TYP


	final static String i_ps_COST_UP_TYP = null;

	// �� 58 �ϐ������l�F i_ps_MRP_EXP_TYP


	final static String i_ps_MRP_EXP_TYP = null;

	// �� 59 �ϐ������l�F i_ps_MODIFY_COUNT


	final static String i_ps_MODIFY_COUNT = null;

	// �� 60 �ϐ������l�F i_ps_PARENT_ITEM_NAME


	final static String i_ps_PARENT_ITEM_NAME = null;

	// �� 61 �ϐ������l�F i_ps_COMP_ITEM_NAME


	final static String i_ps_COMP_ITEM_NAME = null;

	// �� 62 �ϐ������l�F i_ps_STOCK_UNIT


	final static String i_ps_STOCK_UNIT = null;

	// �� 63 �ϐ������l�F i_ps_COMP_MANHOUR_TYP


	final static String i_ps_COMP_MANHOUR_TYP = null;

	// �� 64 �ϐ������l�F i_ps_PARENT_MANHOUR_TYP


	final static String i_ps_PARENT_MANHOUR_TYP = null;

	// �� 65 �ϐ������l�F i_PARENT_ITEM_CD


	final static String i_PARENT_ITEM_CD = null;

	// �� 66 �ϐ������l�F i_COMP_ITEM_CD


	final static String i_COMP_ITEM_CD = null;

	// �� 67 �ϐ������l�F i_EFF_PHASE_IN_DATE


	final static String i_EFF_PHASE_IN_DATE = null;

	// �� 68 �ϐ������l�F i_EFF_PHASE_OUT_DATE


	final static String i_EFF_PHASE_OUT_DATE = null;

	// �� 69 �ϐ������l�F i_sub1_PARENT_ITEM_CD


	final static String i_sub1_PARENT_ITEM_CD = null;

	// �� 70 �ϐ������l�F i_sub1_COMP_ITEM_CD


	final static String i_sub1_COMP_ITEM_CD = null;

	// �� 71 �ϐ������l�F i_sub1_PS_EDITION


	final static String i_sub1_PS_EDITION = null;

	// �� 72 �ϐ������l�F i_sub1_PS_UNIT_DENOMINATOR


	final static String i_sub1_PS_UNIT_DENOMINATOR = null;

	// �� 73 �ϐ������l�F i_sub1_PS_UNIT_NUMERATOR


	final static String i_sub1_PS_UNIT_NUMERATOR = null;

	// �� 74 �ϐ������l�F i_sub1_EFF_PHASE_IN_DATE


	final static String i_sub1_EFF_PHASE_IN_DATE = null;

	// �� 75 �ϐ������l�F i_sub1_EFF_PHASE_OUT_DATE


	final static String i_sub1_EFF_PHASE_OUT_DATE = null;

	// �� 76 �ϐ������l�F i_sub1_PS_SPOIL


	final static String i_sub1_PS_SPOIL = null;

	// �� 77 �ϐ������l�F i_sub1_CONS_TYP


	final static String i_sub1_CONS_TYP = null;

	// �� 78 �ϐ������l�F i_sub1_PS_LT_FLG


	final static String i_sub1_PS_LT_FLG = null;

	// �� 79 �ϐ������l�F i_sub1_PS_FIXED_LT


	final static String i_sub1_PS_FIXED_LT = null;

	// �� 80 �ϐ������l�F i_sub1_PS_PROP_LT


	final static String i_sub1_PS_PROP_LT = null;

	// �� 81 �ϐ������l�F i_sub1_PS_PROP_LOT_SIZE


	final static String i_sub1_PS_PROP_LOT_SIZE = null;

	// �� 82 �ϐ������l�F i_sub1_PS_REF_NO


	final static String i_sub1_PS_REF_NO = null;

	// �� 83 �ϐ������l�F i_sub1_COST_UP_TYP


	final static String i_sub1_COST_UP_TYP = null;

	// �� 84 �ϐ������l�F i_sub1_MRP_EXP_TYP


	final static String i_sub1_MRP_EXP_TYP = null;

	// �� 85 �ϐ������l�F i_SEQ_NO


	final static String i_SEQ_NO = null;

	// �� 86 �ϐ������l�F i_PS_EDITION


	final static String i_PS_EDITION = null;

	// �� 87 �ϐ������l�F i_ACCESS_TYP


	final static String i_ACCESS_TYP = null;

	// �� 88 �ϐ������l�F i_CMPLT_FLG


	final static String i_CMPLT_FLG = null;

	// �� 89 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 90 �ϐ������l�F i_MRP_ODR_TYP


	final static Integer i_MRP_ODR_TYP = null;

	// �� 91 �ϐ������l�F i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// �� 92 �ϐ������l�F i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// �� 93 �ϐ������l�F i_DRAW_CD


	final static String i_DRAW_CD = null;

	// �� 94 �ϐ������l�F i_SPEC


	final static String i_SPEC = null;

	// �� 95 �ϐ������l�F i_ITEM_OUTSIDE_TYP


	final static Integer i_ITEM_OUTSIDE_TYP = null;

	// �� 96 �ϐ������l�F i_OPR_RSLT_TYP


	final static Integer i_OPR_RSLT_TYP = null;

	// �� 97 �ϐ������l�F i_ITEM_FIXED_LT


	final static Long i_ITEM_FIXED_LT = null;

	// �� 98 �ϐ������l�F i_ITEM_PROP_LT


	final static Long i_ITEM_PROP_LT = null;

	// �� 99 �ϐ������l�F i_ITEM_PROP_LOT_SIZE


	final static String i_ITEM_PROP_LOT_SIZE = null;

	// �� 100 �ϐ������l�F i_ITEM_ISSUE_LT


	final static Long i_ITEM_ISSUE_LT = null;

	// �� 101 �ϐ������l�F i_ITEM_SAFETY_LT


	final static Long i_ITEM_SAFETY_LT = null;

	// �� 102 �ϐ������l�F i_UNIT_QTY_TYP


	final static Integer i_UNIT_QTY_TYP = null;

	// �� 103 �ϐ������l�F i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// �� 104 �ϐ������l�F i_w_TARGET_ITEM_CD


	final static String i_w_TARGET_ITEM_CD = null;

	// �� 105 �ϐ������l�F i_pr_PLANT_CD


	final static String i_pr_PLANT_CD = null;

	// �� 106 �ϐ������l�F i_pr_ITEM_CD


	final static String i_pr_ITEM_CD = null;

	// �� 107 �ϐ������l�F i_pr_PROC_CD


	final static String i_pr_PROC_CD = null;

	// �� 108 �ϐ������l�F i_pr_PROC_NO


	final static String i_pr_PROC_NO = null;

	// �� 109 �ϐ������l�F i_pr_PROC_NAME


	final static String i_pr_PROC_NAME = null;

	// �� 110 �ϐ������l�F i_pr_WS_CD


	final static String i_pr_WS_CD = null;

	// �� 111 �ϐ������l�F i_pr_COMPANY_CD


	final static String i_pr_COMPANY_CD = null;

	// �� 112 �ϐ������l�F i_pr_VEND_CD


	final static String i_pr_VEND_CD = null;

	// �� 113 �ϐ������l�F i_pr_FIXED_LT


	final static String i_pr_FIXED_LT = null;

	// �� 114 �ϐ������l�F i_pr_PROP_LT


	final static String i_pr_PROP_LT = null;

	// �� 115 �ϐ������l�F i_pr_SAFETY_LT


	final static String i_pr_SAFETY_LT = null;

	// �� 116 �ϐ������l�F i_pr_PROP_LOT_SIZE


	final static String i_pr_PROP_LOT_SIZE = null;

	// �� 117 �ϐ������l�F i_pr_SPOIL


	final static String i_pr_SPOIL = null;

	// �� 118 �ϐ������l�F i_pr_OUTSIDE_TYP


	final static String i_pr_OUTSIDE_TYP = null;

	// �� 119 �ϐ������l�F i_pr_ACPT_INSPC_TYP


	final static String i_pr_ACPT_INSPC_TYP = null;

	// �� 120 �ϐ������l�F i_pr_STANDARD_COST


	final static String i_pr_STANDARD_COST = null;

	// �� 121 �ϐ������l�F i_pr_MODIFY_COUNT


	final static String i_pr_MODIFY_COUNT = null;

	// �� 122 �ϐ������l�F i_pr_UNIT_QTY


	final static String i_pr_UNIT_QTY = null;

	// �� 123 �ϐ������l�F i_pr_WORK_TIME


	final static String i_pr_WORK_TIME = null;

	// �� 124 �ϐ������l�F i_pr_ITEM_NAME


	final static String i_pr_ITEM_NAME = null;

	// �� 125 �ϐ������l�F i_pr_WS_NAME


	final static String i_pr_WS_NAME = null;

	// �� 126 �ϐ������l�F i_pr_VEND_NAME


	final static String i_pr_VEND_NAME = null;

	// �� 127 �ϐ������l�F i_pr_STOCK_UNIT


	final static String i_pr_STOCK_UNIT = null;

	// �� 128 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 129 �ϐ������l�F i_hidden_ITEM_CD


	final static String i_hidden_ITEM_CD = null;

	// �� 130 �ϐ������l�F i_PROC_CD


	final static String i_PROC_CD = null;

	// �� 131 �ϐ������l�F i_sub2_PLANT_CD


	final static String i_sub2_PLANT_CD = null;

	// �� 132 �ϐ������l�F i_sub2_ITEM_CD


	final static String i_sub2_ITEM_CD = null;

	// �� 133 �ϐ������l�F i_sub2_PROC_CD


	final static String i_sub2_PROC_CD = null;

	// �� 134 �ϐ������l�F i_sub2_PROC_NO


	final static String i_sub2_PROC_NO = null;

	// �� 135 �ϐ������l�F i_sub2_PROC_NAME


	final static String i_sub2_PROC_NAME = null;

	// �� 136 �ϐ������l�F i_sub2_WS_CD


	final static String i_sub2_WS_CD = null;

	// �� 137 �ϐ������l�F i_sub2_COMPANY_CD


	final static String i_sub2_COMPANY_CD = null;

	// �� 138 �ϐ������l�F i_sub2_VEND_CD


	final static String i_sub2_VEND_CD = null;

	// �� 139 �ϐ������l�F i_sub2_FIXED_LT


	final static String i_sub2_FIXED_LT = null;

	// �� 140 �ϐ������l�F i_sub2_PROP_LT


	final static String i_sub2_PROP_LT = null;

	// �� 141 �ϐ������l�F i_sub2_SAFETY_LT


	final static String i_sub2_SAFETY_LT = null;

	// �� 142 �ϐ������l�F i_sub2_PROP_LOT_SIZE


	final static String i_sub2_PROP_LOT_SIZE = null;

	// �� 143 �ϐ������l�F i_sub2_SPOIL


	final static String i_sub2_SPOIL = null;

	// �� 144 �ϐ������l�F i_sub2_OUTSIDE_TYP


	final static String i_sub2_OUTSIDE_TYP = null;

	// �� 145 �ϐ������l�F i_sub2_ACPT_INSPC_TYP


	final static String i_sub2_ACPT_INSPC_TYP = null;

	// �� 146 �ϐ������l�F i_sub2_STANDARD_COST


	final static String i_sub2_STANDARD_COST = null;

	// �� 147 �ϐ������l�F i_sub2_UNIT_QTY


	final static String i_sub2_UNIT_QTY = null;

	// �� 148 �ϐ������l�F i_sub2_WORK_TIME


	final static String i_sub2_WORK_TIME = null;

	// �� 149 �ϐ������l�F i_sub2_MODIFY_COUNT


	final static String i_sub2_MODIFY_COUNT = null;

	// �� 150 �ϐ������l�F i_sub2_ITEM_NAME


	final static String i_sub2_ITEM_NAME = null;

	// �� 151 �ϐ������l�F i_sub2_WS_NAME


	final static String i_sub2_WS_NAME = null;

	// �� 152 �ϐ������l�F i_sub2_VEND_NAME


	final static String i_sub2_VEND_NAME = null;

	// �� 153 �ϐ������l�F i_sub2_STOCK_UNIT


	final static String i_sub2_STOCK_UNIT = null;

	// �� 154 �ϐ������l�F i_sub2_MANHOUR_TYP


	final static String i_sub2_MANHOUR_TYP = null;

	// �� 155 �ϐ������l�F i_WS_CD


	final static String i_WS_CD = null;

	// �� 156 �ϐ������l�F i_VEND_CD


	final static String i_VEND_CD = null;

	// �� 157 �ϐ������l�F i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// �� 158 �ϐ������l�F i_PROC_NO


	final static String i_PROC_NO = null;

	// �� 159 �ϐ������l�F i_PS_UNIT_DENOMINATOR


	final static String i_PS_UNIT_DENOMINATOR = null;

	// �� 160 �ϐ������l�F i_PS_UNIT_NUMERATOR


	final static String i_PS_UNIT_NUMERATOR = null;

	// �� 161 �ϐ������l�F i_BY_PRODUCT_CD


	final static String i_BY_PRODUCT_CD = null;

	// �� 162 �ϐ������l�F i_BUSINESS_OPR_DATE


	final static String i_BUSINESS_OPR_DATE = null;

	// �� 163 �ϐ������l�F i_PARAM_RESULT_DATA


	final static String i_PARAM_RESULT_DATA = null;

	// �� 164 �ϐ������l�F i_PARAM_INPUT_DATA


	final static String i_PARAM_INPUT_DATA = null;

*/

	//{{user_implement_code
       

	/**
	 * �R�s�[
	 */
    public void copy(AA0170010Struct struct) {

    	// �Ώەi�ڔԍ�
	    if (struct.m_main_TARGET_ITEM_CD != null) {
	    	m_main_TARGET_ITEM_CD = new String(struct.m_main_TARGET_ITEM_CD);
	    } else {
	    	m_main_TARGET_ITEM_CD = null;
	    }
	    // �W�J�敪
	    if (struct.m_main_DEVELOP_TYP != null) {
	    	m_main_DEVELOP_TYP = new String(struct.m_main_DEVELOP_TYP);
	    } else {
	    	m_main_DEVELOP_TYP = null;
	    }
	    // �W�J�敪
	    if (struct.m_ps_NO != null) {
	    	m_ps_NO = new String(struct.m_ps_NO);
	    } else {
	    	m_ps_NO = null;
	    }
	    // �Ώۓ��t
	    if (struct.m_main_TARGET_DATE != null) {
	    	m_main_TARGET_DATE = new String(struct.m_main_TARGET_DATE);
	    } else {
	    	m_main_TARGET_DATE = null;
	    }
	    // �����W�J���x��
	    if (struct.m_main_LEVEL != null) {
	    	m_main_LEVEL = new String(struct.m_main_LEVEL);
	    } else {
	    	m_main_LEVEL = null;
	    }
	    // �s�Ǎ����̐��i�\���O���b�h�i�ڔԍ�
	    if (struct.m_hidden_ITEM_CD != null) {
	    	m_hidden_ITEM_CD = new String(struct.m_hidden_ITEM_CD);
	    } else {
	    	m_hidden_ITEM_CD = null;
	    }
	    // �s�Ǎ����̐��i�\���O���b�h�i�ږ�
	    if (struct.m_hidden_ITEM_NAME != null) {
	    	m_hidden_ITEM_NAME = new String(struct.m_hidden_ITEM_NAME);
	    } else {
	    	m_hidden_ITEM_NAME = null;
	    }
	    // ���i�\���O���b�h�i�ڔԍ�
	    if (struct.m_ps_PARENT_ITEM_CD != null) {
	    	m_ps_PARENT_ITEM_CD = new String(struct.m_ps_PARENT_ITEM_CD);
	    } else {
	    	m_ps_PARENT_ITEM_CD = null;
	    }
	    // ���i�\���O���b�h�i�ږ�
	    if (struct.m_ps_PARENT_ITEM_NAME != null) {
	    	m_ps_PARENT_ITEM_NAME = new String(struct.m_ps_PARENT_ITEM_NAME);
	    } else {
	    	m_ps_PARENT_ITEM_NAME = null;
	    }
	    // ���i�\���O���b�h�\���i�ڔԍ�
	    if (struct.m_ps_COMP_ITEM_CD != null) {
	    	m_ps_COMP_ITEM_CD = new String(struct.m_ps_COMP_ITEM_CD);
	    } else {
	    	m_ps_COMP_ITEM_CD = null;
	    }
	    // ���i�\���O���b�h�\���i�ږ�
	    if (struct.m_ps_COMP_ITEM_NAME != null) {
	    	m_ps_COMP_ITEM_NAME = new String(struct.m_ps_COMP_ITEM_NAME);
	    } else {
	    	m_ps_COMP_ITEM_NAME = null;
	    }
	    // ���i�\���O���b�h���i�\���Ő�
	    if (struct.m_ps_PS_EDITION != null) {
	    	m_ps_PS_EDITION = new String(struct.m_ps_PS_EDITION);
	    } else {
	    	m_ps_PS_EDITION = null;
	    }
	    // ��ƌn��O���b�h�i�ڕʍ�ƃR�[�h
	    if (struct.m_pr_PROC_CD != null) {
	    	m_pr_PROC_CD = new String(struct.m_pr_PROC_CD);
	    } else {
	    	m_pr_PROC_CD = null;
	    }
	    // ��ƌn��O���b�h���i�\���Ő�
	    if (struct.m_pr_PS_EDITION != null) {
	    	m_pr_PS_EDITION = new String(struct.m_pr_PS_EDITION);
	    } else {
	    	m_pr_PS_EDITION = null;
	    }
    }    
	/**
	 * �R�s�[�R���X�g���N�^
	 */
    public AA0170010Struct(AA0170010Struct struct) {
		copy(struct);
	}
    
    /**
     * ������
     * �N���A���K��l�ݒ���s���B
     */
    public void initialize() {
    	clear();
    	// ���C�����
    	m_ps_PS_EDITION             = AA0170Common._PS_EDITION;
    	m_ps_PS_UNIT_DENOMINATOR    = AA0170Common._PS_UNIT_DENOMINATOR;
    	m_ps_PS_UNIT_NUMERATOR      = AA0170Common._PS_UNIT_NUMERATOR;
    	m_ps_CONS_TYP               = AA0170Common._CONS_TYP;
    	m_ps_PS_LT_FLG              = AA0170Common._PS_LT_FLG;
    	m_ps_COST_UP_TYP            = AA0170Common._COST_UP_TYP;
    	m_ps_MRP_EXP_TYP            = AA0170Common._MRP_EXP_TYP;
    	m_ps_PS_SPOIL               = AA0170Common._PS_SPOIL;
    	m_ps_PS_FIXED_LT            = AA0170Common._PS_FIXED_LT;
    	m_ps_PS_PROP_LT             = AA0170Common._PS_PROP_LT;
    	m_ps_PS_PROP_LOT_SIZE       = AA0170Common._PS_PROP_LOT_SIZE;
    	
    	// �T�u�P���
    	/** ���i�\���P�ʐ����� */
    	m_sub1_PS_UNIT_DENOMINATOR  = AA0170Common._PS_UNIT_DENOMINATOR;
    	
    	/** ���i�\���P�ʐ����q */
    	m_sub1_PS_UNIT_NUMERATOR    = AA0170Common._PS_UNIT_NUMERATOR;
    	
    	/** �\���d���� */
    	m_sub1_PS_SPOIL             = AA0170Common._PS_SPOIL;
    	
    	/** ���i�\���Œ蕪���[�h�^�C�� */
    	m_sub1_PS_FIXED_LT          = AA0170Common._PS_FIXED_LT;
    	
    	/** ���i�\����ᕪ���[�h�^�C�� */
    	m_sub1_PS_PROP_LT           = AA0170Common._PS_PROP_LT;
    	
    	/** ���i�\����ᕪ���b�g�T�C�Y */
    	m_sub1_PS_PROP_LOT_SIZE     = AA0170Common._PS_PROP_LOT_SIZE;
    	
    	
    	// �T�u�Q���
    	/** ��ƌn��Œ蕪���[�h�^�C�� */
    	m_sub2_FIXED_LT             = AA0170Common._PR_FIXED_LT;
    	
    	/** ��ƌn���ᕪ���[�h�^�C�� */
    	m_sub2_PROP_LT              = AA0170Common._PR_PROP_LT;

    	/** ��ƌn����S���� */
    	m_sub2_SAFETY_LT            = AA0170Common._PR_SAFETY_LT;
    	
    	/** ��ƌn���ᕪ���b�g�T�C�Y */
    	m_sub2_PROP_LOT_SIZE        = AA0170Common._PR_PROP_LOT_SIZE;

    	/** ��ƌn��d���� */
    	m_sub2_SPOIL                = AA0170Common._PR_SPOIL;

    	/** ��ƌn����O��敪 */
    	m_sub2_OUTSIDE_TYP          = AA0170Common._PR_OUTSIDE_TYP;

    	/** ��ƌn���������敪 */
    	m_sub2_ACPT_INSPC_TYP       = AA0170Common._PR_ACPT_INSPC_TYP;

    	/** �W���H�� */
    	m_sub2_STANDARD_COST        = AA0170Common._PR_STANDARD_COST;

    	
    	return;
    }
       
        //}}user_implement_code

	//////////////////////////////

}
