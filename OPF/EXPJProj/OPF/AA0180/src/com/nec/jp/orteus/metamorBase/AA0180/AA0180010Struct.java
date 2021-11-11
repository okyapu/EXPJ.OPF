/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0180/src/com/nec/jp/orteus/metamorBase/AA0180/AA0180010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0180;

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

public class AA0180010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_Target_ITEM_CD */
	public String m_Target_ITEM_CD = null;
	/** �� 2 �ϐ��F m_DEVELOP_TYP */
	public String m_DEVELOP_TYP = null;
	/** �� 3 �ϐ��F m_InitLevel */
	public String m_InitLevel = null;
	/** �� 4 �ϐ��F m_id */
	public String m_id = null;
	/** �� 5 �ϐ��F m_lvl */
	public String m_lvl = null;
	/** �� 6 �ϐ��F m_parent */
	public String m_parent = null;
	/** �� 7 �ϐ��F m_label */
	public String m_label = null;
	/** �� 8 �ϐ��F m_ctx */
	public String m_ctx = null;
	/** �� 9 �ϐ��F m_maxid */
	public String m_maxid = null;
	/** �� 10 �ϐ��F m_TargetDate */
	public String m_TargetDate = null;
	/** �� 11 �ϐ��F m_h_Target_ITEM_CD */
	public String m_h_Target_ITEM_CD = null;
	/** �� 12 �ϐ��F m_h_TargetDate */
	public String m_h_TargetDate = null;
	/** �� 13 �ϐ��F m_h_DEVELOP_TYP */
	public String m_h_DEVELOP_TYP = null;
	/** �� 14 �ϐ��F m_h_InitLevel */
	public String m_h_InitLevel = null;
	/** �� 15 �ϐ��F m_DEVELOP_TYP_name */
	public String m_DEVELOP_TYP_name = null;
	/** �� 16 �ϐ��F m_DEVELOP_TYP_val */
	public String m_DEVELOP_TYP_val = null;
	/** �� 17 �ϐ��F m_h_ProcTyp */
	public String m_h_ProcTyp = null;
	/** �� 18 �ϐ��F m_h_MaxLevel */
	public String m_h_MaxLevel = null;
	/** �� 19 �ϐ��F m_DET_TYP */
	public String m_DET_TYP = null;
	/** �� 20 �ϐ��F m_Sub2_OUTSIDE_TYP_name */
	public String m_Sub2_OUTSIDE_TYP_name = null;
	/** �� 21 �ϐ��F m_Sub2_OUTSIDE_TYP_val */
	public String m_Sub2_OUTSIDE_TYP_val = null;
	/** �� 22 �ϐ��F m_Sub2_ACPT_INSPC_TYP_name */
	public String m_Sub2_ACPT_INSPC_TYP_name = null;
	/** �� 23 �ϐ��F m_Sub2_ACPT_INSPC_TYP_val */
	public String m_Sub2_ACPT_INSPC_TYP_val = null;
	/** �� 24 �ϐ��F m_h_Sub1Parent_ITEM_CD */
	public String m_h_Sub1Parent_ITEM_CD = null;
	/** �� 25 �ϐ��F m_h_Sub1Comp_ITEM_CD */
	public String m_h_Sub1Comp_ITEM_CD = null;
	/** �� 26 �ϐ��F m_h_Sub1_PS_EDITION */
	public String m_h_Sub1_PS_EDITION = null;
	/** �� 27 �ϐ��F m_Sub1_CONS_TYP_name */
	public String m_Sub1_CONS_TYP_name = null;
	/** �� 28 �ϐ��F m_Sub1_CONS_TYP_val */
	public String m_Sub1_CONS_TYP_val = null;
	/** �� 29 �ϐ��F m_c_Sub1_PS_LT_FLG */
	public String m_c_Sub1_PS_LT_FLG = null;
	/** �� 30 �ϐ��F m_Sub1_COST_UP_TYP_name */
	public String m_Sub1_COST_UP_TYP_name = null;
	/** �� 31 �ϐ��F m_Sub1_COST_UP_TYP_val */
	public String m_Sub1_COST_UP_TYP_val = null;
	/** �� 32 �ϐ��F m_Sub1_MRP_EXP_TYP_name */
	public String m_Sub1_MRP_EXP_TYP_name = null;
	/** �� 33 �ϐ��F m_Sub1_MRP_EXP_TYP_val */
	public String m_Sub1_MRP_EXP_TYP_val = null;
	/** �� 34 �ϐ��F m_h_Target_ITEM_CD2 */
	public String m_h_Target_ITEM_CD2 = null;
	/** �� 35 �ϐ��F m_h_TargetDate2 */
	public String m_h_TargetDate2 = null;
	/** �� 36 �ϐ��F m_h_DEVELOP_TYP2 */
	public String m_h_DEVELOP_TYP2 = null;
	/** �� 37 �ϐ��F m_h_InitLevel2 */
	public String m_h_InitLevel2 = null;
	/** �� 38 �ϐ��F m_h_Sub2_PROC_NO */
	public String m_h_Sub2_PROC_NO = null;
	/** �� 39 �ϐ��F m_FIRST_PROC */
	public String m_FIRST_PROC = null;
	/** �� 40 �ϐ��F m_h_Sub1_PS_UNIT_NUMERATOR */
	public String m_h_Sub1_PS_UNIT_NUMERATOR = null;
	/** �� 41 �ϐ��F m_h_Sub1_PS_UNIT_DENOMINATOR */
	public String m_h_Sub1_PS_UNIT_DENOMINATOR = null;
	/** �� 42 �ϐ��F m_AA0180010tree1 */
	public String m_AA0180010tree1 = null;
	/** �� 43 �ϐ��F m_sub2_STOCK_UNIT_1 */
	public String m_sub2_STOCK_UNIT_1 = null;
	/** �� 44 �ϐ��F m_sub2_STOCK_UNIT_2 */
	public String m_sub2_STOCK_UNIT_2 = null;
	/** �� 45 �ϐ��F m_sub2_STOCK_UNIT_3 */
	public String m_sub2_STOCK_UNIT_3 = null;
	/** �� 46 �ϐ��F m_Det2FIXED_LT_UNIT */
	public String m_Det2FIXED_LT_UNIT = null;
	/** �� 47 �ϐ��F m_Det2PROP_LT_UNIT */
	public String m_Det2PROP_LT_UNIT = null;
	/** �� 48 �ϐ��F m_Det2PROP_LOT_SIZE_UNIT */
	public String m_Det2PROP_LOT_SIZE_UNIT = null;
	/** �� 49 �ϐ��F m_Det2SAFETY_LT_UNIT */
	public String m_Det2SAFETY_LT_UNIT = null;
	/** �� 50 �ϐ��F m_MANHOUR_TYP */
	public String m_MANHOUR_TYP = null;
	/** �� 51 �ϐ��F m_Lower_ITEM_NAME */
	public String m_Lower_ITEM_NAME = null;
	/** �� 52 �ϐ��F m_Lower_STOCK_UNIT */
	public String m_Lower_STOCK_UNIT = null;
	/** �� 53 �ϐ��F m_Lower_ITEM_CD */
	public String m_Lower_ITEM_CD = null;
	/** �� 54 �ϐ��F m_Upper_ITEM_NAME */
	public String m_Upper_ITEM_NAME = null;
	/** �� 55 �ϐ��F m_Upper_ITEM_CD */
	public String m_Upper_ITEM_CD = null;
	/** �� 56 �ϐ��F m_DetParent_ITEM_CD */
	public String m_DetParent_ITEM_CD = null;
	/** �� 57 �ϐ��F m_DetParent_ITEM_NAME */
	public String m_DetParent_ITEM_NAME = null;
	/** �� 58 �ϐ��F m_DetParent_MRP_ODR_TYP */
	public String m_DetParent_MRP_ODR_TYP = null;
	/** �� 59 �ϐ��F m_DetParent_OUTSIDE_TYP */
	public String m_DetParent_OUTSIDE_TYP = null;
	/** �� 60 �ϐ��F m_DetComp_ITEM_CD */
	public String m_DetComp_ITEM_CD = null;
	/** �� 61 �ϐ��F m_DetComp_ITEM_NAME */
	public String m_DetComp_ITEM_NAME = null;
	/** �� 62 �ϐ��F m_DetComp_MRP_ODR_TYP */
	public String m_DetComp_MRP_ODR_TYP = null;
	/** �� 63 �ϐ��F m_DetComp_OUTSIDE_TYP */
	public String m_DetComp_OUTSIDE_TYP = null;
	/** �� 64 �ϐ��F m_Det_MANHOUR_TYP */
	public String m_Det_MANHOUR_TYP = null;
	/** �� 65 �ϐ��F m_Det_PS_EDITION */
	public String m_Det_PS_EDITION = null;
	/** �� 66 �ϐ��F m_Det_PS_UNIT_QTY */
	public String m_Det_PS_UNIT_QTY = null;
	/** �� 67 �ϐ��F m_Det_STOCK_UNIT */
	public String m_Det_STOCK_UNIT = null;
	/** �� 68 �ϐ��F m_Det_EFF_PHASE_IN_DATE */
	public String m_Det_EFF_PHASE_IN_DATE = null;
	/** �� 69 �ϐ��F m_Det_EFF_PHASE_OUT_DATE */
	public String m_Det_EFF_PHASE_OUT_DATE = null;
	/** �� 70 �ϐ��F m_Det_PS_SPOIL */
	public String m_Det_PS_SPOIL = null;
	/** �� 71 �ϐ��F m_Det_CONS_TYP */
	public String m_Det_CONS_TYP = null;
	/** �� 72 �ϐ��F m_Det_PS_LT_FLG */
	public String m_Det_PS_LT_FLG = null;
	/** �� 73 �ϐ��F m_Det_PS_FIXED_LT */
	public String m_Det_PS_FIXED_LT = null;
	/** �� 74 �ϐ��F m_Det_PS_PROP_LT */
	public String m_Det_PS_PROP_LT = null;
	/** �� 75 �ϐ��F m_Det_PS_PROP_LOT_SIZE */
	public String m_Det_PS_PROP_LOT_SIZE = null;
	/** �� 76 �ϐ��F m_Det_PS_REF_NO */
	public String m_Det_PS_REF_NO = null;
	/** �� 77 �ϐ��F m_Det_COST_UP_TYP */
	public String m_Det_COST_UP_TYP = null;
	/** �� 78 �ϐ��F m_Det_MRP_EXP_TYP */
	public String m_Det_MRP_EXP_TYP = null;
	/** �� 79 �ϐ��F m_PS_EDITION */
	public String m_PS_EDITION = null;
	/** �� 80 �ϐ��F m_Sub1Parent_ITEM_NAME */
	public String m_Sub1Parent_ITEM_NAME = null;
	/** �� 81 �ϐ��F m_Sub1Comp_ITEM_NAME */
	public String m_Sub1Comp_ITEM_NAME = null;
	/** �� 82 �ϐ��F m_Sub1_PS_UNIT_NUMERATOR */
	public String m_Sub1_PS_UNIT_NUMERATOR = null;
	/** �� 83 �ϐ��F m_Sub1_PS_UNIT_DENOMINATOR */
	public String m_Sub1_PS_UNIT_DENOMINATOR = null;
	/** �� 84 �ϐ��F m_Sub1_STOCK_UNIT */
	public String m_Sub1_STOCK_UNIT = null;
	/** �� 85 �ϐ��F m_Sub1Comp_STOCK_UNIT */
	public String m_Sub1Comp_STOCK_UNIT = null;
	/** �� 86 �ϐ��F m_Sub1_EFF_PHASE_IN_DATE */
	public String m_Sub1_EFF_PHASE_IN_DATE = null;
	/** �� 87 �ϐ��F m_Sub1_EFF_PHASE_OUT_DATE */
	public String m_Sub1_EFF_PHASE_OUT_DATE = null;
	/** �� 88 �ϐ��F m_Sub1_PS_SPOIL */
	public String m_Sub1_PS_SPOIL = null;
	/** �� 89 �ϐ��F m_Sub1_CONS_TYP */
	public String m_Sub1_CONS_TYP = null;
	/** �� 90 �ϐ��F m_h_Sub1_PS_LT_FLG */
	public String m_h_Sub1_PS_LT_FLG = null;
	/** �� 91 �ϐ��F m_Sub1_PS_FIXED_LT */
	public String m_Sub1_PS_FIXED_LT = null;
	/** �� 92 �ϐ��F m_Sub1_PS_PROP_LT */
	public String m_Sub1_PS_PROP_LT = null;
	/** �� 93 �ϐ��F m_Sub1_PS_PROP_LOT_SIZE */
	public String m_Sub1_PS_PROP_LOT_SIZE = null;
	/** �� 94 �ϐ��F m_Sub1_PS_REF_NO */
	public String m_Sub1_PS_REF_NO = null;
	/** �� 95 �ϐ��F m_Sub1_COST_UP_TYP */
	public String m_Sub1_COST_UP_TYP = null;
	/** �� 96 �ϐ��F m_Sub1_MRP_EXP_TYP */
	public String m_Sub1_MRP_EXP_TYP = null;
	/** �� 97 �ϐ��F m_h_Sub1_MODIFY_COUNT */
	public String m_h_Sub1_MODIFY_COUNT = null;
	/** �� 98 �ϐ��F m_Sub1Parent_ITEM_CD */
	public String m_Sub1Parent_ITEM_CD = null;
	/** �� 99 �ϐ��F m_Sub1Comp_ITEM_CD */
	public String m_Sub1Comp_ITEM_CD = null;
	/** �� 100 �ϐ��F m_Sub1_PS_EDITION */
	public String m_Sub1_PS_EDITION = null;
	/** �� 101 �ϐ��F m_KBN1 */
	public String m_KBN1 = null;
	/** �� 102 �ϐ��F m_KBN2 */
	public String m_KBN2 = null;
	/** �� 103 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 104 �ϐ��F m_PROC_CD */
	public String m_PROC_CD = null;
	/** �� 105 �ϐ��F m_PROC_NO */
	public String m_PROC_NO = null;
	/** �� 106 �ϐ��F m_PROC_NAME */
	public String m_PROC_NAME = null;
	/** �� 107 �ϐ��F m_WS_CD */
	public String m_WS_CD = null;
	/** �� 108 �ϐ��F m_MODIFY_CNT_PROC */
	public String m_MODIFY_CNT_PROC = null;
	/** �� 109 �ϐ��F m_EFF_PHASE_IN_DATE */
	public String m_EFF_PHASE_IN_DATE = null;
	/** �� 110 �ϐ��F m_EFF_PHASE_OUT_DATE */
	public String m_EFF_PHASE_OUT_DATE = null;
	/** �� 111 �ϐ��F m_MODIFY_CNT_ISSUE */
	public String m_MODIFY_CNT_ISSUE = null;
	/** �� 112 �ϐ��F m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** �� 113 �ϐ��F m_PS_REF_NO */
	public String m_PS_REF_NO = null;
	/** �� 114 �ϐ��F m_FIRST_PROC_NO */
	public String m_FIRST_PROC_NO = null;
	/** �� 115 �ϐ��F m_TargetDate_IN */
	public String m_TargetDate_IN = null;
	/** �� 116 �ϐ��F m_TargetDate_OUT */
	public String m_TargetDate_OUT = null;
	/** �� 117 �ϐ��F m_Det2ITEM_CD */
	public String m_Det2ITEM_CD = null;
	/** �� 118 �ϐ��F m_Det2PROC_CD */
	public String m_Det2PROC_CD = null;
	/** �� 119 �ϐ��F m_Det2PROC_NO */
	public String m_Det2PROC_NO = null;
	/** �� 120 �ϐ��F m_Det2PROC_NAME */
	public String m_Det2PROC_NAME = null;
	/** �� 121 �ϐ��F m_Det2WS_CD */
	public String m_Det2WS_CD = null;
	/** �� 122 �ϐ��F m_Det2COMPANY_CD */
	public String m_Det2COMPANY_CD = null;
	/** �� 123 �ϐ��F m_Det2VEND_CD */
	public String m_Det2VEND_CD = null;
	/** �� 124 �ϐ��F m_Det2FIXED_LT */
	public String m_Det2FIXED_LT = null;
	/** �� 125 �ϐ��F m_Det2PROP_LT */
	public String m_Det2PROP_LT = null;
	/** �� 126 �ϐ��F m_Det2SAFETY_LT */
	public String m_Det2SAFETY_LT = null;
	/** �� 127 �ϐ��F m_Det2PROP_LOT_SIZE */
	public String m_Det2PROP_LOT_SIZE = null;
	/** �� 128 �ϐ��F m_Det2SPOIL */
	public String m_Det2SPOIL = null;
	/** �� 129 �ϐ��F m_Det2OUTSIDE_TYP */
	public String m_Det2OUTSIDE_TYP = null;
	/** �� 130 �ϐ��F m_Det2ACPT_INSPC_TYP */
	public String m_Det2ACPT_INSPC_TYP = null;
	/** �� 131 �ϐ��F m_Det2STANDARD_COST */
	public String m_Det2STANDARD_COST = null;
	/** �� 132 �ϐ��F m_Det2ITEM_NAME */
	public String m_Det2ITEM_NAME = null;
	/** �� 133 �ϐ��F m_Det2WS_NAME */
	public String m_Det2WS_NAME = null;
	/** �� 134 �ϐ��F m_Det2VEND_NAME */
	public String m_Det2VEND_NAME = null;
	/** �� 135 �ϐ��F m_Sub2_ITEM_CD */
	public String m_Sub2_ITEM_CD = null;
	/** �� 136 �ϐ��F m_Sub2_PROC_CD */
	public String m_Sub2_PROC_CD = null;
	/** �� 137 �ϐ��F m_Sub2_PROC_NO */
	public String m_Sub2_PROC_NO = null;
	/** �� 138 �ϐ��F m_Sub2_PROC_NAME */
	public String m_Sub2_PROC_NAME = null;
	/** �� 139 �ϐ��F m_Sub2_WS_CD */
	public String m_Sub2_WS_CD = null;
	/** �� 140 �ϐ��F m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** �� 141 �ϐ��F m_Sub2_VEND_CD */
	public String m_Sub2_VEND_CD = null;
	/** �� 142 �ϐ��F m_Sub2_FIXED_LT */
	public String m_Sub2_FIXED_LT = null;
	/** �� 143 �ϐ��F m_Sub2_PROP_LT */
	public String m_Sub2_PROP_LT = null;
	/** �� 144 �ϐ��F m_Sub2_SAFETY_LT */
	public String m_Sub2_SAFETY_LT = null;
	/** �� 145 �ϐ��F m_Sub2_PROP_LOT_SIZE */
	public String m_Sub2_PROP_LOT_SIZE = null;
	/** �� 146 �ϐ��F m_Sub2_SPOIL */
	public String m_Sub2_SPOIL = null;
	/** �� 147 �ϐ��F m_Sub2_OUTSIDE_TYP */
	public String m_Sub2_OUTSIDE_TYP = null;
	/** �� 148 �ϐ��F m_Sub2_ACPT_INSPC_TYP */
	public String m_Sub2_ACPT_INSPC_TYP = null;
	/** �� 149 �ϐ��F m_Sub2_STANDARD_COST */
	public String m_Sub2_STANDARD_COST = null;
	/** �� 150 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 151 �ϐ��F m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** �� 152 �ϐ��F m_DRAW_CD */
	public String m_DRAW_CD = null;
	/** �� 153 �ϐ��F m_SPEC */
	public String m_SPEC = null;
	/** �� 154 �ϐ��F m_MRP_ODR_TYP */
	public Integer m_MRP_ODR_TYP = null;
	/** �� 155 �ϐ��F m_ITEM_OUTSIDE_TYP */
	public Integer m_ITEM_OUTSIDE_TYP = null;
	/** �� 156 �ϐ��F m_OPR_RSLT_TYP */
	public Integer m_OPR_RSLT_TYP = null;
	/** �� 157 �ϐ��F m_ITEM_FIXED_LT */
	public Long m_ITEM_FIXED_LT = null;
	/** �� 158 �ϐ��F m_ITEM_PROP_LT */
	public Long m_ITEM_PROP_LT = null;
	/** �� 159 �ϐ��F m_ITEM_PROP_LOT_SIZE */
	public String m_ITEM_PROP_LOT_SIZE = null;
	/** �� 160 �ϐ��F m_ITEM_ISSUE_LT */
	public Long m_ITEM_ISSUE_LT = null;
	/** �� 161 �ϐ��F m_ITEM_SAFETY_LT */
	public Long m_ITEM_SAFETY_LT = null;
	/** �� 162 �ϐ��F m_UNIT_QTY_TYP */
	public Integer m_UNIT_QTY_TYP = null;
	/** �� 163 �ϐ��F m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** �� 164 �ϐ��F m_VEND_CD */
	public String m_VEND_CD = null;
	/** �� 165 �ϐ��F m_FIXED_LT */
	public String m_FIXED_LT = null;
	/** �� 166 �ϐ��F m_PROP_LT */
	public String m_PROP_LT = null;
	/** �� 167 �ϐ��F m_SAFETY_LT */
	public String m_SAFETY_LT = null;
	/** �� 168 �ϐ��F m_PROP_LOT_SIZE */
	public String m_PROP_LOT_SIZE = null;
	/** �� 169 �ϐ��F m_SPOIL */
	public String m_SPOIL = null;
	/** �� 170 �ϐ��F m_OUTSIDE_TYP */
	public Integer m_OUTSIDE_TYP = null;
	/** �� 171 �ϐ��F m_ACPT_INSPC_TYP */
	public Integer m_ACPT_INSPC_TYP = null;
	/** �� 172 �ϐ��F m_STANDARD_COST */
	public String m_STANDARD_COST = null;
	/** �� 173 �ϐ��F m_UNIT_QTY */
	public String m_UNIT_QTY = null;
	/** �� 174 �ϐ��F m_WORK_TIME */
	public String m_WORK_TIME = null;
	/** �� 175 �ϐ��F m_WS_NAME */
	public String m_WS_NAME = null;
	/** �� 176 �ϐ��F m_VEND_NAME */
	public String m_VEND_NAME = null;
	/** �� 177 �ϐ��F m_h_Sub2_MODIFY_COUNT */
	public String m_h_Sub2_MODIFY_COUNT = null;
	/** �� 178 �ϐ��F m_Sub2_ITEM_NAME */
	public String m_Sub2_ITEM_NAME = null;
	/** �� 179 �ϐ��F m_Sub2_STOCK_UNIT */
	public String m_Sub2_STOCK_UNIT = null;
	/** �� 180 �ϐ��F m_Sub2_WS_NAME */
	public String m_Sub2_WS_NAME = null;
	/** �� 181 �ϐ��F m_Sub2_VEND_NAME */
	public String m_Sub2_VEND_NAME = null;
	/** �� 182 �ϐ��F m_PS_UNIT_DENOMINATOR */
	public String m_PS_UNIT_DENOMINATOR = null;
	/** �� 183 �ϐ��F m_PS_UNIT_NUMERATOR */
	public String m_PS_UNIT_NUMERATOR = null;
	/** �� 184 �ϐ��F m_PARENT_ITEM_CD */
	public String m_PARENT_ITEM_CD = null;
	/** �� 185 �ϐ��F m_COMP_ITEM_CD */
	public String m_COMP_ITEM_CD = null;
	/** �� 186 �ϐ��F m_SUM_FIXED_LT */
	public String m_SUM_FIXED_LT = null;
	/** �� 187 �ϐ��F m_SUM_PROP_LT */
	public String m_SUM_PROP_LT = null;
	/** �� 188 �ϐ��F m_BY_PRODUCT_CD */
	public String m_BY_PRODUCT_CD = null;
	/** �� 189 �ϐ��F m_BUSINESS_OPR_DATE */
	public String m_BUSINESS_OPR_DATE = null;
	/** �� 190 �ϐ��F m_PARAM_RESULT_DATA */
	public String m_PARAM_RESULT_DATA = null;
	/** �� 191 �ϐ��F m_PARAM_INPUT_DATA */
	public String m_PARAM_INPUT_DATA = null;
	/** �� 192 �ϐ��F m_Lower_MANHOUR_TYP */
	public String m_Lower_MANHOUR_TYP = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_Target_ITEM_CD */
	public List l_Target_ITEM_CD = null;

	/** �� 2 List�ϐ��F l_DEVELOP_TYP */
	public List l_DEVELOP_TYP = null;

	/** �� 3 List�ϐ��F l_InitLevel */
	public List l_InitLevel = null;

	/** �� 4 List�ϐ��F l_id */
	public List l_id = null;

	/** �� 5 List�ϐ��F l_lvl */
	public List l_lvl = null;

	/** �� 6 List�ϐ��F l_parent */
	public List l_parent = null;

	/** �� 7 List�ϐ��F l_label */
	public List l_label = null;

	/** �� 8 List�ϐ��F l_ctx */
	public List l_ctx = null;

	/** �� 9 List�ϐ��F l_maxid */
	public List l_maxid = null;

	/** �� 10 List�ϐ��F l_TargetDate */
	public List l_TargetDate = null;

	/** �� 11 List�ϐ��F l_h_Target_ITEM_CD */
	public List l_h_Target_ITEM_CD = null;

	/** �� 12 List�ϐ��F l_h_TargetDate */
	public List l_h_TargetDate = null;

	/** �� 13 List�ϐ��F l_h_DEVELOP_TYP */
	public List l_h_DEVELOP_TYP = null;

	/** �� 14 List�ϐ��F l_h_InitLevel */
	public List l_h_InitLevel = null;

	/** �� 15 List�ϐ��F l_DEVELOP_TYP_name */
	public List l_DEVELOP_TYP_name = null;

	/** �� 16 List�ϐ��F l_DEVELOP_TYP_val */
	public List l_DEVELOP_TYP_val = null;

	/** �� 17 List�ϐ��F l_h_ProcTyp */
	public List l_h_ProcTyp = null;

	/** �� 18 List�ϐ��F l_h_MaxLevel */
	public List l_h_MaxLevel = null;

	/** �� 19 List�ϐ��F l_DET_TYP */
	public List l_DET_TYP = null;

	/** �� 20 List�ϐ��F l_Sub2_OUTSIDE_TYP_name */
	public List l_Sub2_OUTSIDE_TYP_name = null;

	/** �� 21 List�ϐ��F l_Sub2_OUTSIDE_TYP_val */
	public List l_Sub2_OUTSIDE_TYP_val = null;

	/** �� 22 List�ϐ��F l_Sub2_ACPT_INSPC_TYP_name */
	public List l_Sub2_ACPT_INSPC_TYP_name = null;

	/** �� 23 List�ϐ��F l_Sub2_ACPT_INSPC_TYP_val */
	public List l_Sub2_ACPT_INSPC_TYP_val = null;

	/** �� 24 List�ϐ��F l_h_Sub1Parent_ITEM_CD */
	public List l_h_Sub1Parent_ITEM_CD = null;

	/** �� 25 List�ϐ��F l_h_Sub1Comp_ITEM_CD */
	public List l_h_Sub1Comp_ITEM_CD = null;

	/** �� 26 List�ϐ��F l_h_Sub1_PS_EDITION */
	public List l_h_Sub1_PS_EDITION = null;

	/** �� 27 List�ϐ��F l_Sub1_CONS_TYP_name */
	public List l_Sub1_CONS_TYP_name = null;

	/** �� 28 List�ϐ��F l_Sub1_CONS_TYP_val */
	public List l_Sub1_CONS_TYP_val = null;

	/** �� 29 List�ϐ��F l_c_Sub1_PS_LT_FLG */
	public List l_c_Sub1_PS_LT_FLG = null;

	/** �� 30 List�ϐ��F l_Sub1_COST_UP_TYP_name */
	public List l_Sub1_COST_UP_TYP_name = null;

	/** �� 31 List�ϐ��F l_Sub1_COST_UP_TYP_val */
	public List l_Sub1_COST_UP_TYP_val = null;

	/** �� 32 List�ϐ��F l_Sub1_MRP_EXP_TYP_name */
	public List l_Sub1_MRP_EXP_TYP_name = null;

	/** �� 33 List�ϐ��F l_Sub1_MRP_EXP_TYP_val */
	public List l_Sub1_MRP_EXP_TYP_val = null;

	/** �� 34 List�ϐ��F l_h_Target_ITEM_CD2 */
	public List l_h_Target_ITEM_CD2 = null;

	/** �� 35 List�ϐ��F l_h_TargetDate2 */
	public List l_h_TargetDate2 = null;

	/** �� 36 List�ϐ��F l_h_DEVELOP_TYP2 */
	public List l_h_DEVELOP_TYP2 = null;

	/** �� 37 List�ϐ��F l_h_InitLevel2 */
	public List l_h_InitLevel2 = null;

	/** �� 38 List�ϐ��F l_h_Sub2_PROC_NO */
	public List l_h_Sub2_PROC_NO = null;

	/** �� 39 List�ϐ��F l_FIRST_PROC */
	public List l_FIRST_PROC = null;

	/** �� 40 List�ϐ��F l_h_Sub1_PS_UNIT_NUMERATOR */
	public List l_h_Sub1_PS_UNIT_NUMERATOR = null;

	/** �� 41 List�ϐ��F l_h_Sub1_PS_UNIT_DENOMINATOR */
	public List l_h_Sub1_PS_UNIT_DENOMINATOR = null;

	/** �� 42 List�ϐ��F l_AA0180010tree1 */
	public List l_AA0180010tree1 = null;

	/** �� 43 List�ϐ��F l_sub2_STOCK_UNIT_1 */
	public List l_sub2_STOCK_UNIT_1 = null;

	/** �� 44 List�ϐ��F l_sub2_STOCK_UNIT_2 */
	public List l_sub2_STOCK_UNIT_2 = null;

	/** �� 45 List�ϐ��F l_sub2_STOCK_UNIT_3 */
	public List l_sub2_STOCK_UNIT_3 = null;

	/** �� 46 List�ϐ��F l_Det2FIXED_LT_UNIT */
	public List l_Det2FIXED_LT_UNIT = null;

	/** �� 47 List�ϐ��F l_Det2PROP_LT_UNIT */
	public List l_Det2PROP_LT_UNIT = null;

	/** �� 48 List�ϐ��F l_Det2PROP_LOT_SIZE_UNIT */
	public List l_Det2PROP_LOT_SIZE_UNIT = null;

	/** �� 49 List�ϐ��F l_Det2SAFETY_LT_UNIT */
	public List l_Det2SAFETY_LT_UNIT = null;

	/** �� 50 List�ϐ��F l_MANHOUR_TYP */
	public List l_MANHOUR_TYP = null;

	/** �� 51 List�ϐ��F l_Lower_ITEM_NAME */
	public List l_Lower_ITEM_NAME = null;

	/** �� 52 List�ϐ��F l_Lower_STOCK_UNIT */
	public List l_Lower_STOCK_UNIT = null;

	/** �� 53 List�ϐ��F l_Lower_ITEM_CD */
	public List l_Lower_ITEM_CD = null;

	/** �� 54 List�ϐ��F l_Upper_ITEM_NAME */
	public List l_Upper_ITEM_NAME = null;

	/** �� 55 List�ϐ��F l_Upper_ITEM_CD */
	public List l_Upper_ITEM_CD = null;

	/** �� 56 List�ϐ��F l_DetParent_ITEM_CD */
	public List l_DetParent_ITEM_CD = null;

	/** �� 57 List�ϐ��F l_DetParent_ITEM_NAME */
	public List l_DetParent_ITEM_NAME = null;

	/** �� 58 List�ϐ��F l_DetParent_MRP_ODR_TYP */
	public List l_DetParent_MRP_ODR_TYP = null;

	/** �� 59 List�ϐ��F l_DetParent_OUTSIDE_TYP */
	public List l_DetParent_OUTSIDE_TYP = null;

	/** �� 60 List�ϐ��F l_DetComp_ITEM_CD */
	public List l_DetComp_ITEM_CD = null;

	/** �� 61 List�ϐ��F l_DetComp_ITEM_NAME */
	public List l_DetComp_ITEM_NAME = null;

	/** �� 62 List�ϐ��F l_DetComp_MRP_ODR_TYP */
	public List l_DetComp_MRP_ODR_TYP = null;

	/** �� 63 List�ϐ��F l_DetComp_OUTSIDE_TYP */
	public List l_DetComp_OUTSIDE_TYP = null;

	/** �� 64 List�ϐ��F l_Det_MANHOUR_TYP */
	public List l_Det_MANHOUR_TYP = null;

	/** �� 65 List�ϐ��F l_Det_PS_EDITION */
	public List l_Det_PS_EDITION = null;

	/** �� 66 List�ϐ��F l_Det_PS_UNIT_QTY */
	public List l_Det_PS_UNIT_QTY = null;

	/** �� 67 List�ϐ��F l_Det_STOCK_UNIT */
	public List l_Det_STOCK_UNIT = null;

	/** �� 68 List�ϐ��F l_Det_EFF_PHASE_IN_DATE */
	public List l_Det_EFF_PHASE_IN_DATE = null;

	/** �� 69 List�ϐ��F l_Det_EFF_PHASE_OUT_DATE */
	public List l_Det_EFF_PHASE_OUT_DATE = null;

	/** �� 70 List�ϐ��F l_Det_PS_SPOIL */
	public List l_Det_PS_SPOIL = null;

	/** �� 71 List�ϐ��F l_Det_CONS_TYP */
	public List l_Det_CONS_TYP = null;

	/** �� 72 List�ϐ��F l_Det_PS_LT_FLG */
	public List l_Det_PS_LT_FLG = null;

	/** �� 73 List�ϐ��F l_Det_PS_FIXED_LT */
	public List l_Det_PS_FIXED_LT = null;

	/** �� 74 List�ϐ��F l_Det_PS_PROP_LT */
	public List l_Det_PS_PROP_LT = null;

	/** �� 75 List�ϐ��F l_Det_PS_PROP_LOT_SIZE */
	public List l_Det_PS_PROP_LOT_SIZE = null;

	/** �� 76 List�ϐ��F l_Det_PS_REF_NO */
	public List l_Det_PS_REF_NO = null;

	/** �� 77 List�ϐ��F l_Det_COST_UP_TYP */
	public List l_Det_COST_UP_TYP = null;

	/** �� 78 List�ϐ��F l_Det_MRP_EXP_TYP */
	public List l_Det_MRP_EXP_TYP = null;

	/** �� 79 List�ϐ��F l_PS_EDITION */
	public List l_PS_EDITION = null;

	/** �� 80 List�ϐ��F l_Sub1Parent_ITEM_NAME */
	public List l_Sub1Parent_ITEM_NAME = null;

	/** �� 81 List�ϐ��F l_Sub1Comp_ITEM_NAME */
	public List l_Sub1Comp_ITEM_NAME = null;

	/** �� 82 List�ϐ��F l_Sub1_PS_UNIT_NUMERATOR */
	public List l_Sub1_PS_UNIT_NUMERATOR = null;

	/** �� 83 List�ϐ��F l_Sub1_PS_UNIT_DENOMINATOR */
	public List l_Sub1_PS_UNIT_DENOMINATOR = null;

	/** �� 84 List�ϐ��F l_Sub1_STOCK_UNIT */
	public List l_Sub1_STOCK_UNIT = null;

	/** �� 85 List�ϐ��F l_Sub1Comp_STOCK_UNIT */
	public List l_Sub1Comp_STOCK_UNIT = null;

	/** �� 86 List�ϐ��F l_Sub1_EFF_PHASE_IN_DATE */
	public List l_Sub1_EFF_PHASE_IN_DATE = null;

	/** �� 87 List�ϐ��F l_Sub1_EFF_PHASE_OUT_DATE */
	public List l_Sub1_EFF_PHASE_OUT_DATE = null;

	/** �� 88 List�ϐ��F l_Sub1_PS_SPOIL */
	public List l_Sub1_PS_SPOIL = null;

	/** �� 89 List�ϐ��F l_Sub1_CONS_TYP */
	public List l_Sub1_CONS_TYP = null;

	/** �� 90 List�ϐ��F l_h_Sub1_PS_LT_FLG */
	public List l_h_Sub1_PS_LT_FLG = null;

	/** �� 91 List�ϐ��F l_Sub1_PS_FIXED_LT */
	public List l_Sub1_PS_FIXED_LT = null;

	/** �� 92 List�ϐ��F l_Sub1_PS_PROP_LT */
	public List l_Sub1_PS_PROP_LT = null;

	/** �� 93 List�ϐ��F l_Sub1_PS_PROP_LOT_SIZE */
	public List l_Sub1_PS_PROP_LOT_SIZE = null;

	/** �� 94 List�ϐ��F l_Sub1_PS_REF_NO */
	public List l_Sub1_PS_REF_NO = null;

	/** �� 95 List�ϐ��F l_Sub1_COST_UP_TYP */
	public List l_Sub1_COST_UP_TYP = null;

	/** �� 96 List�ϐ��F l_Sub1_MRP_EXP_TYP */
	public List l_Sub1_MRP_EXP_TYP = null;

	/** �� 97 List�ϐ��F l_h_Sub1_MODIFY_COUNT */
	public List l_h_Sub1_MODIFY_COUNT = null;

	/** �� 98 List�ϐ��F l_Sub1Parent_ITEM_CD */
	public List l_Sub1Parent_ITEM_CD = null;

	/** �� 99 List�ϐ��F l_Sub1Comp_ITEM_CD */
	public List l_Sub1Comp_ITEM_CD = null;

	/** �� 100 List�ϐ��F l_Sub1_PS_EDITION */
	public List l_Sub1_PS_EDITION = null;

	/** �� 101 List�ϐ��F l_KBN1 */
	public List l_KBN1 = null;

	/** �� 102 List�ϐ��F l_KBN2 */
	public List l_KBN2 = null;

	/** �� 103 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 104 List�ϐ��F l_PROC_CD */
	public List l_PROC_CD = null;

	/** �� 105 List�ϐ��F l_PROC_NO */
	public List l_PROC_NO = null;

	/** �� 106 List�ϐ��F l_PROC_NAME */
	public List l_PROC_NAME = null;

	/** �� 107 List�ϐ��F l_WS_CD */
	public List l_WS_CD = null;

	/** �� 108 List�ϐ��F l_MODIFY_CNT_PROC */
	public List l_MODIFY_CNT_PROC = null;

	/** �� 109 List�ϐ��F l_EFF_PHASE_IN_DATE */
	public List l_EFF_PHASE_IN_DATE = null;

	/** �� 110 List�ϐ��F l_EFF_PHASE_OUT_DATE */
	public List l_EFF_PHASE_OUT_DATE = null;

	/** �� 111 List�ϐ��F l_MODIFY_CNT_ISSUE */
	public List l_MODIFY_CNT_ISSUE = null;

	/** �� 112 List�ϐ��F l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** �� 113 List�ϐ��F l_PS_REF_NO */
	public List l_PS_REF_NO = null;

	/** �� 114 List�ϐ��F l_FIRST_PROC_NO */
	public List l_FIRST_PROC_NO = null;

	/** �� 115 List�ϐ��F l_TargetDate_IN */
	public List l_TargetDate_IN = null;

	/** �� 116 List�ϐ��F l_TargetDate_OUT */
	public List l_TargetDate_OUT = null;

	/** �� 117 List�ϐ��F l_Det2ITEM_CD */
	public List l_Det2ITEM_CD = null;

	/** �� 118 List�ϐ��F l_Det2PROC_CD */
	public List l_Det2PROC_CD = null;

	/** �� 119 List�ϐ��F l_Det2PROC_NO */
	public List l_Det2PROC_NO = null;

	/** �� 120 List�ϐ��F l_Det2PROC_NAME */
	public List l_Det2PROC_NAME = null;

	/** �� 121 List�ϐ��F l_Det2WS_CD */
	public List l_Det2WS_CD = null;

	/** �� 122 List�ϐ��F l_Det2COMPANY_CD */
	public List l_Det2COMPANY_CD = null;

	/** �� 123 List�ϐ��F l_Det2VEND_CD */
	public List l_Det2VEND_CD = null;

	/** �� 124 List�ϐ��F l_Det2FIXED_LT */
	public List l_Det2FIXED_LT = null;

	/** �� 125 List�ϐ��F l_Det2PROP_LT */
	public List l_Det2PROP_LT = null;

	/** �� 126 List�ϐ��F l_Det2SAFETY_LT */
	public List l_Det2SAFETY_LT = null;

	/** �� 127 List�ϐ��F l_Det2PROP_LOT_SIZE */
	public List l_Det2PROP_LOT_SIZE = null;

	/** �� 128 List�ϐ��F l_Det2SPOIL */
	public List l_Det2SPOIL = null;

	/** �� 129 List�ϐ��F l_Det2OUTSIDE_TYP */
	public List l_Det2OUTSIDE_TYP = null;

	/** �� 130 List�ϐ��F l_Det2ACPT_INSPC_TYP */
	public List l_Det2ACPT_INSPC_TYP = null;

	/** �� 131 List�ϐ��F l_Det2STANDARD_COST */
	public List l_Det2STANDARD_COST = null;

	/** �� 132 List�ϐ��F l_Det2ITEM_NAME */
	public List l_Det2ITEM_NAME = null;

	/** �� 133 List�ϐ��F l_Det2WS_NAME */
	public List l_Det2WS_NAME = null;

	/** �� 134 List�ϐ��F l_Det2VEND_NAME */
	public List l_Det2VEND_NAME = null;

	/** �� 135 List�ϐ��F l_Sub2_ITEM_CD */
	public List l_Sub2_ITEM_CD = null;

	/** �� 136 List�ϐ��F l_Sub2_PROC_CD */
	public List l_Sub2_PROC_CD = null;

	/** �� 137 List�ϐ��F l_Sub2_PROC_NO */
	public List l_Sub2_PROC_NO = null;

	/** �� 138 List�ϐ��F l_Sub2_PROC_NAME */
	public List l_Sub2_PROC_NAME = null;

	/** �� 139 List�ϐ��F l_Sub2_WS_CD */
	public List l_Sub2_WS_CD = null;

	/** �� 140 List�ϐ��F l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** �� 141 List�ϐ��F l_Sub2_VEND_CD */
	public List l_Sub2_VEND_CD = null;

	/** �� 142 List�ϐ��F l_Sub2_FIXED_LT */
	public List l_Sub2_FIXED_LT = null;

	/** �� 143 List�ϐ��F l_Sub2_PROP_LT */
	public List l_Sub2_PROP_LT = null;

	/** �� 144 List�ϐ��F l_Sub2_SAFETY_LT */
	public List l_Sub2_SAFETY_LT = null;

	/** �� 145 List�ϐ��F l_Sub2_PROP_LOT_SIZE */
	public List l_Sub2_PROP_LOT_SIZE = null;

	/** �� 146 List�ϐ��F l_Sub2_SPOIL */
	public List l_Sub2_SPOIL = null;

	/** �� 147 List�ϐ��F l_Sub2_OUTSIDE_TYP */
	public List l_Sub2_OUTSIDE_TYP = null;

	/** �� 148 List�ϐ��F l_Sub2_ACPT_INSPC_TYP */
	public List l_Sub2_ACPT_INSPC_TYP = null;

	/** �� 149 List�ϐ��F l_Sub2_STANDARD_COST */
	public List l_Sub2_STANDARD_COST = null;

	/** �� 150 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 151 List�ϐ��F l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** �� 152 List�ϐ��F l_DRAW_CD */
	public List l_DRAW_CD = null;

	/** �� 153 List�ϐ��F l_SPEC */
	public List l_SPEC = null;

	/** �� 154 List�ϐ��F l_MRP_ODR_TYP */
	public List l_MRP_ODR_TYP = null;

	/** �� 155 List�ϐ��F l_ITEM_OUTSIDE_TYP */
	public List l_ITEM_OUTSIDE_TYP = null;

	/** �� 156 List�ϐ��F l_OPR_RSLT_TYP */
	public List l_OPR_RSLT_TYP = null;

	/** �� 157 List�ϐ��F l_ITEM_FIXED_LT */
	public List l_ITEM_FIXED_LT = null;

	/** �� 158 List�ϐ��F l_ITEM_PROP_LT */
	public List l_ITEM_PROP_LT = null;

	/** �� 159 List�ϐ��F l_ITEM_PROP_LOT_SIZE */
	public List l_ITEM_PROP_LOT_SIZE = null;

	/** �� 160 List�ϐ��F l_ITEM_ISSUE_LT */
	public List l_ITEM_ISSUE_LT = null;

	/** �� 161 List�ϐ��F l_ITEM_SAFETY_LT */
	public List l_ITEM_SAFETY_LT = null;

	/** �� 162 List�ϐ��F l_UNIT_QTY_TYP */
	public List l_UNIT_QTY_TYP = null;

	/** �� 163 List�ϐ��F l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** �� 164 List�ϐ��F l_VEND_CD */
	public List l_VEND_CD = null;

	/** �� 165 List�ϐ��F l_FIXED_LT */
	public List l_FIXED_LT = null;

	/** �� 166 List�ϐ��F l_PROP_LT */
	public List l_PROP_LT = null;

	/** �� 167 List�ϐ��F l_SAFETY_LT */
	public List l_SAFETY_LT = null;

	/** �� 168 List�ϐ��F l_PROP_LOT_SIZE */
	public List l_PROP_LOT_SIZE = null;

	/** �� 169 List�ϐ��F l_SPOIL */
	public List l_SPOIL = null;

	/** �� 170 List�ϐ��F l_OUTSIDE_TYP */
	public List l_OUTSIDE_TYP = null;

	/** �� 171 List�ϐ��F l_ACPT_INSPC_TYP */
	public List l_ACPT_INSPC_TYP = null;

	/** �� 172 List�ϐ��F l_STANDARD_COST */
	public List l_STANDARD_COST = null;

	/** �� 173 List�ϐ��F l_UNIT_QTY */
	public List l_UNIT_QTY = null;

	/** �� 174 List�ϐ��F l_WORK_TIME */
	public List l_WORK_TIME = null;

	/** �� 175 List�ϐ��F l_WS_NAME */
	public List l_WS_NAME = null;

	/** �� 176 List�ϐ��F l_VEND_NAME */
	public List l_VEND_NAME = null;

	/** �� 177 List�ϐ��F l_h_Sub2_MODIFY_COUNT */
	public List l_h_Sub2_MODIFY_COUNT = null;

	/** �� 178 List�ϐ��F l_Sub2_ITEM_NAME */
	public List l_Sub2_ITEM_NAME = null;

	/** �� 179 List�ϐ��F l_Sub2_STOCK_UNIT */
	public List l_Sub2_STOCK_UNIT = null;

	/** �� 180 List�ϐ��F l_Sub2_WS_NAME */
	public List l_Sub2_WS_NAME = null;

	/** �� 181 List�ϐ��F l_Sub2_VEND_NAME */
	public List l_Sub2_VEND_NAME = null;

	/** �� 182 List�ϐ��F l_PS_UNIT_DENOMINATOR */
	public List l_PS_UNIT_DENOMINATOR = null;

	/** �� 183 List�ϐ��F l_PS_UNIT_NUMERATOR */
	public List l_PS_UNIT_NUMERATOR = null;

	/** �� 184 List�ϐ��F l_PARENT_ITEM_CD */
	public List l_PARENT_ITEM_CD = null;

	/** �� 185 List�ϐ��F l_COMP_ITEM_CD */
	public List l_COMP_ITEM_CD = null;

	/** �� 186 List�ϐ��F l_SUM_FIXED_LT */
	public List l_SUM_FIXED_LT = null;

	/** �� 187 List�ϐ��F l_SUM_PROP_LT */
	public List l_SUM_PROP_LT = null;

	/** �� 188 List�ϐ��F l_BY_PRODUCT_CD */
	public List l_BY_PRODUCT_CD = null;

	/** �� 189 List�ϐ��F l_BUSINESS_OPR_DATE */
	public List l_BUSINESS_OPR_DATE = null;

	/** �� 190 List�ϐ��F l_PARAM_RESULT_DATA */
	public List l_PARAM_RESULT_DATA = null;

	/** �� 191 List�ϐ��F l_PARAM_INPUT_DATA */
	public List l_PARAM_INPUT_DATA = null;

	/** �� 192 List�ϐ��F l_Lower_MANHOUR_TYP */
	public List l_Lower_MANHOUR_TYP = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getTarget_ITEM_CD() { return m_Target_ITEM_CD; }
	public String getDEVELOP_TYP() { return m_DEVELOP_TYP; }
	public String getInitLevel() { return m_InitLevel; }
	public String getid() { return m_id; }
	public String getlvl() { return m_lvl; }
	public String getparent() { return m_parent; }
	public String getlabel() { return m_label; }
	public String getctx() { return m_ctx; }
	public String getmaxid() { return m_maxid; }
	public String getTargetDate() { return m_TargetDate; }
	public String geth_Target_ITEM_CD() { return m_h_Target_ITEM_CD; }
	public String geth_TargetDate() { return m_h_TargetDate; }
	public String geth_DEVELOP_TYP() { return m_h_DEVELOP_TYP; }
	public String geth_InitLevel() { return m_h_InitLevel; }
	public String getDEVELOP_TYP_name() { return m_DEVELOP_TYP_name; }
	public String getDEVELOP_TYP_val() { return m_DEVELOP_TYP_val; }
	public String geth_ProcTyp() { return m_h_ProcTyp; }
	public String geth_MaxLevel() { return m_h_MaxLevel; }
	public String getDET_TYP() { return m_DET_TYP; }
	public String getSub2_OUTSIDE_TYP_name() { return m_Sub2_OUTSIDE_TYP_name; }
	public String getSub2_OUTSIDE_TYP_val() { return m_Sub2_OUTSIDE_TYP_val; }
	public String getSub2_ACPT_INSPC_TYP_name() { return m_Sub2_ACPT_INSPC_TYP_name; }
	public String getSub2_ACPT_INSPC_TYP_val() { return m_Sub2_ACPT_INSPC_TYP_val; }
	public String geth_Sub1Parent_ITEM_CD() { return m_h_Sub1Parent_ITEM_CD; }
	public String geth_Sub1Comp_ITEM_CD() { return m_h_Sub1Comp_ITEM_CD; }
	public String geth_Sub1_PS_EDITION() { return m_h_Sub1_PS_EDITION; }
	public String getSub1_CONS_TYP_name() { return m_Sub1_CONS_TYP_name; }
	public String getSub1_CONS_TYP_val() { return m_Sub1_CONS_TYP_val; }
	public String getc_Sub1_PS_LT_FLG() { return m_c_Sub1_PS_LT_FLG; }
	public String getSub1_COST_UP_TYP_name() { return m_Sub1_COST_UP_TYP_name; }
	public String getSub1_COST_UP_TYP_val() { return m_Sub1_COST_UP_TYP_val; }
	public String getSub1_MRP_EXP_TYP_name() { return m_Sub1_MRP_EXP_TYP_name; }
	public String getSub1_MRP_EXP_TYP_val() { return m_Sub1_MRP_EXP_TYP_val; }
	public String geth_Target_ITEM_CD2() { return m_h_Target_ITEM_CD2; }
	public String geth_TargetDate2() { return m_h_TargetDate2; }
	public String geth_DEVELOP_TYP2() { return m_h_DEVELOP_TYP2; }
	public String geth_InitLevel2() { return m_h_InitLevel2; }
	public String geth_Sub2_PROC_NO() { return m_h_Sub2_PROC_NO; }
	public String getFIRST_PROC() { return m_FIRST_PROC; }
	public String geth_Sub1_PS_UNIT_NUMERATOR() { return m_h_Sub1_PS_UNIT_NUMERATOR; }
	public String geth_Sub1_PS_UNIT_DENOMINATOR() { return m_h_Sub1_PS_UNIT_DENOMINATOR; }
	public String getAA0180010tree1() { return m_AA0180010tree1; }
	public String getsub2_STOCK_UNIT_1() { return m_sub2_STOCK_UNIT_1; }
	public String getsub2_STOCK_UNIT_2() { return m_sub2_STOCK_UNIT_2; }
	public String getsub2_STOCK_UNIT_3() { return m_sub2_STOCK_UNIT_3; }
	public String getDet2FIXED_LT_UNIT() { return m_Det2FIXED_LT_UNIT; }
	public String getDet2PROP_LT_UNIT() { return m_Det2PROP_LT_UNIT; }
	public String getDet2PROP_LOT_SIZE_UNIT() { return m_Det2PROP_LOT_SIZE_UNIT; }
	public String getDet2SAFETY_LT_UNIT() { return m_Det2SAFETY_LT_UNIT; }
	public String getMANHOUR_TYP() { return m_MANHOUR_TYP; }
	public String getLower_ITEM_NAME() { return m_Lower_ITEM_NAME; }
	public String getLower_STOCK_UNIT() { return m_Lower_STOCK_UNIT; }
	public String getLower_ITEM_CD() { return m_Lower_ITEM_CD; }
	public String getUpper_ITEM_NAME() { return m_Upper_ITEM_NAME; }
	public String getUpper_ITEM_CD() { return m_Upper_ITEM_CD; }
	public String getDetParent_ITEM_CD() { return m_DetParent_ITEM_CD; }
	public String getDetParent_ITEM_NAME() { return m_DetParent_ITEM_NAME; }
	public String getDetParent_MRP_ODR_TYP() { return m_DetParent_MRP_ODR_TYP; }
	public String getDetParent_OUTSIDE_TYP() { return m_DetParent_OUTSIDE_TYP; }
	public String getDetComp_ITEM_CD() { return m_DetComp_ITEM_CD; }
	public String getDetComp_ITEM_NAME() { return m_DetComp_ITEM_NAME; }
	public String getDetComp_MRP_ODR_TYP() { return m_DetComp_MRP_ODR_TYP; }
	public String getDetComp_OUTSIDE_TYP() { return m_DetComp_OUTSIDE_TYP; }
	public String getDet_MANHOUR_TYP() { return m_Det_MANHOUR_TYP; }
	public String getDet_PS_EDITION() { return m_Det_PS_EDITION; }
	public String getDet_PS_UNIT_QTY() { return m_Det_PS_UNIT_QTY; }
	public String getDet_STOCK_UNIT() { return m_Det_STOCK_UNIT; }
	public String getDet_EFF_PHASE_IN_DATE() { return m_Det_EFF_PHASE_IN_DATE; }
	public String getDet_EFF_PHASE_OUT_DATE() { return m_Det_EFF_PHASE_OUT_DATE; }
	public String getDet_PS_SPOIL() { return m_Det_PS_SPOIL; }
	public String getDet_CONS_TYP() { return m_Det_CONS_TYP; }
	public String getDet_PS_LT_FLG() { return m_Det_PS_LT_FLG; }
	public String getDet_PS_FIXED_LT() { return m_Det_PS_FIXED_LT; }
	public String getDet_PS_PROP_LT() { return m_Det_PS_PROP_LT; }
	public String getDet_PS_PROP_LOT_SIZE() { return m_Det_PS_PROP_LOT_SIZE; }
	public String getDet_PS_REF_NO() { return m_Det_PS_REF_NO; }
	public String getDet_COST_UP_TYP() { return m_Det_COST_UP_TYP; }
	public String getDet_MRP_EXP_TYP() { return m_Det_MRP_EXP_TYP; }
	public String getPS_EDITION() { return m_PS_EDITION; }
	public String getSub1Parent_ITEM_NAME() { return m_Sub1Parent_ITEM_NAME; }
	public String getSub1Comp_ITEM_NAME() { return m_Sub1Comp_ITEM_NAME; }
	public String getSub1_PS_UNIT_NUMERATOR() { return m_Sub1_PS_UNIT_NUMERATOR; }
	public String getSub1_PS_UNIT_DENOMINATOR() { return m_Sub1_PS_UNIT_DENOMINATOR; }
	public String getSub1_STOCK_UNIT() { return m_Sub1_STOCK_UNIT; }
	public String getSub1Comp_STOCK_UNIT() { return m_Sub1Comp_STOCK_UNIT; }
	public String getSub1_EFF_PHASE_IN_DATE() { return m_Sub1_EFF_PHASE_IN_DATE; }
	public String getSub1_EFF_PHASE_OUT_DATE() { return m_Sub1_EFF_PHASE_OUT_DATE; }
	public String getSub1_PS_SPOIL() { return m_Sub1_PS_SPOIL; }
	public String getSub1_CONS_TYP() { return m_Sub1_CONS_TYP; }
	public String geth_Sub1_PS_LT_FLG() { return m_h_Sub1_PS_LT_FLG; }
	public String getSub1_PS_FIXED_LT() { return m_Sub1_PS_FIXED_LT; }
	public String getSub1_PS_PROP_LT() { return m_Sub1_PS_PROP_LT; }
	public String getSub1_PS_PROP_LOT_SIZE() { return m_Sub1_PS_PROP_LOT_SIZE; }
	public String getSub1_PS_REF_NO() { return m_Sub1_PS_REF_NO; }
	public String getSub1_COST_UP_TYP() { return m_Sub1_COST_UP_TYP; }
	public String getSub1_MRP_EXP_TYP() { return m_Sub1_MRP_EXP_TYP; }
	public String geth_Sub1_MODIFY_COUNT() { return m_h_Sub1_MODIFY_COUNT; }
	public String getSub1Parent_ITEM_CD() { return m_Sub1Parent_ITEM_CD; }
	public String getSub1Comp_ITEM_CD() { return m_Sub1Comp_ITEM_CD; }
	public String getSub1_PS_EDITION() { return m_Sub1_PS_EDITION; }
	public String getKBN1() { return m_KBN1; }
	public String getKBN2() { return m_KBN2; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getPROC_CD() { return m_PROC_CD; }
	public String getPROC_NO() { return m_PROC_NO; }
	public String getPROC_NAME() { return m_PROC_NAME; }
	public String getWS_CD() { return m_WS_CD; }
	public String getMODIFY_CNT_PROC() { return m_MODIFY_CNT_PROC; }
	public String getEFF_PHASE_IN_DATE() { return m_EFF_PHASE_IN_DATE; }
	public String getEFF_PHASE_OUT_DATE() { return m_EFF_PHASE_OUT_DATE; }
	public String getMODIFY_CNT_ISSUE() { return m_MODIFY_CNT_ISSUE; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getPS_REF_NO() { return m_PS_REF_NO; }
	public String getFIRST_PROC_NO() { return m_FIRST_PROC_NO; }
	public String getTargetDate_IN() { return m_TargetDate_IN; }
	public String getTargetDate_OUT() { return m_TargetDate_OUT; }
	public String getDet2ITEM_CD() { return m_Det2ITEM_CD; }
	public String getDet2PROC_CD() { return m_Det2PROC_CD; }
	public String getDet2PROC_NO() { return m_Det2PROC_NO; }
	public String getDet2PROC_NAME() { return m_Det2PROC_NAME; }
	public String getDet2WS_CD() { return m_Det2WS_CD; }
	public String getDet2COMPANY_CD() { return m_Det2COMPANY_CD; }
	public String getDet2VEND_CD() { return m_Det2VEND_CD; }
	public String getDet2FIXED_LT() { return m_Det2FIXED_LT; }
	public String getDet2PROP_LT() { return m_Det2PROP_LT; }
	public String getDet2SAFETY_LT() { return m_Det2SAFETY_LT; }
	public String getDet2PROP_LOT_SIZE() { return m_Det2PROP_LOT_SIZE; }
	public String getDet2SPOIL() { return m_Det2SPOIL; }
	public String getDet2OUTSIDE_TYP() { return m_Det2OUTSIDE_TYP; }
	public String getDet2ACPT_INSPC_TYP() { return m_Det2ACPT_INSPC_TYP; }
	public String getDet2STANDARD_COST() { return m_Det2STANDARD_COST; }
	public String getDet2ITEM_NAME() { return m_Det2ITEM_NAME; }
	public String getDet2WS_NAME() { return m_Det2WS_NAME; }
	public String getDet2VEND_NAME() { return m_Det2VEND_NAME; }
	public String getSub2_ITEM_CD() { return m_Sub2_ITEM_CD; }
	public String getSub2_PROC_CD() { return m_Sub2_PROC_CD; }
	public String getSub2_PROC_NO() { return m_Sub2_PROC_NO; }
	public String getSub2_PROC_NAME() { return m_Sub2_PROC_NAME; }
	public String getSub2_WS_CD() { return m_Sub2_WS_CD; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getSub2_VEND_CD() { return m_Sub2_VEND_CD; }
	public String getSub2_FIXED_LT() { return m_Sub2_FIXED_LT; }
	public String getSub2_PROP_LT() { return m_Sub2_PROP_LT; }
	public String getSub2_SAFETY_LT() { return m_Sub2_SAFETY_LT; }
	public String getSub2_PROP_LOT_SIZE() { return m_Sub2_PROP_LOT_SIZE; }
	public String getSub2_SPOIL() { return m_Sub2_SPOIL; }
	public String getSub2_OUTSIDE_TYP() { return m_Sub2_OUTSIDE_TYP; }
	public String getSub2_ACPT_INSPC_TYP() { return m_Sub2_ACPT_INSPC_TYP; }
	public String getSub2_STANDARD_COST() { return m_Sub2_STANDARD_COST; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getDRAW_CD() { return m_DRAW_CD; }
	public String getSPEC() { return m_SPEC; }
	public Integer getMRP_ODR_TYP() { return m_MRP_ODR_TYP; }
	public Integer getITEM_OUTSIDE_TYP() { return m_ITEM_OUTSIDE_TYP; }
	public Integer getOPR_RSLT_TYP() { return m_OPR_RSLT_TYP; }
	public Long getITEM_FIXED_LT() { return m_ITEM_FIXED_LT; }
	public Long getITEM_PROP_LT() { return m_ITEM_PROP_LT; }
	public String getITEM_PROP_LOT_SIZE() { return m_ITEM_PROP_LOT_SIZE; }
	public Long getITEM_ISSUE_LT() { return m_ITEM_ISSUE_LT; }
	public Long getITEM_SAFETY_LT() { return m_ITEM_SAFETY_LT; }
	public Integer getUNIT_QTY_TYP() { return m_UNIT_QTY_TYP; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getFIXED_LT() { return m_FIXED_LT; }
	public String getPROP_LT() { return m_PROP_LT; }
	public String getSAFETY_LT() { return m_SAFETY_LT; }
	public String getPROP_LOT_SIZE() { return m_PROP_LOT_SIZE; }
	public String getSPOIL() { return m_SPOIL; }
	public Integer getOUTSIDE_TYP() { return m_OUTSIDE_TYP; }
	public Integer getACPT_INSPC_TYP() { return m_ACPT_INSPC_TYP; }
	public String getSTANDARD_COST() { return m_STANDARD_COST; }
	public String getUNIT_QTY() { return m_UNIT_QTY; }
	public String getWORK_TIME() { return m_WORK_TIME; }
	public String getWS_NAME() { return m_WS_NAME; }
	public String getVEND_NAME() { return m_VEND_NAME; }
	public String geth_Sub2_MODIFY_COUNT() { return m_h_Sub2_MODIFY_COUNT; }
	public String getSub2_ITEM_NAME() { return m_Sub2_ITEM_NAME; }
	public String getSub2_STOCK_UNIT() { return m_Sub2_STOCK_UNIT; }
	public String getSub2_WS_NAME() { return m_Sub2_WS_NAME; }
	public String getSub2_VEND_NAME() { return m_Sub2_VEND_NAME; }
	public String getPS_UNIT_DENOMINATOR() { return m_PS_UNIT_DENOMINATOR; }
	public String getPS_UNIT_NUMERATOR() { return m_PS_UNIT_NUMERATOR; }
	public String getPARENT_ITEM_CD() { return m_PARENT_ITEM_CD; }
	public String getCOMP_ITEM_CD() { return m_COMP_ITEM_CD; }
	public String getSUM_FIXED_LT() { return m_SUM_FIXED_LT; }
	public String getSUM_PROP_LT() { return m_SUM_PROP_LT; }
	public String getBY_PRODUCT_CD() { return m_BY_PRODUCT_CD; }
	public String getBUSINESS_OPR_DATE() { return m_BUSINESS_OPR_DATE; }
	public String getPARAM_RESULT_DATA() { return m_PARAM_RESULT_DATA; }
	public String getPARAM_INPUT_DATA() { return m_PARAM_INPUT_DATA; }
	public String getLower_MANHOUR_TYP() { return m_Lower_MANHOUR_TYP; }

	public List getList_Target_ITEM_CD() { return l_Target_ITEM_CD; }
	public List getList_DEVELOP_TYP() { return l_DEVELOP_TYP; }
	public List getList_InitLevel() { return l_InitLevel; }
	public List getList_id() { return l_id; }
	public List getList_lvl() { return l_lvl; }
	public List getList_parent() { return l_parent; }
	public List getList_label() { return l_label; }
	public List getList_ctx() { return l_ctx; }
	public List getList_maxid() { return l_maxid; }
	public List getList_TargetDate() { return l_TargetDate; }
	public List getList_h_Target_ITEM_CD() { return l_h_Target_ITEM_CD; }
	public List getList_h_TargetDate() { return l_h_TargetDate; }
	public List getList_h_DEVELOP_TYP() { return l_h_DEVELOP_TYP; }
	public List getList_h_InitLevel() { return l_h_InitLevel; }
	public List getList_DEVELOP_TYP_name() { return l_DEVELOP_TYP_name; }
	public List getList_DEVELOP_TYP_val() { return l_DEVELOP_TYP_val; }
	public List getList_h_ProcTyp() { return l_h_ProcTyp; }
	public List getList_h_MaxLevel() { return l_h_MaxLevel; }
	public List getList_DET_TYP() { return l_DET_TYP; }
	public List getList_Sub2_OUTSIDE_TYP_name() { return l_Sub2_OUTSIDE_TYP_name; }
	public List getList_Sub2_OUTSIDE_TYP_val() { return l_Sub2_OUTSIDE_TYP_val; }
	public List getList_Sub2_ACPT_INSPC_TYP_name() { return l_Sub2_ACPT_INSPC_TYP_name; }
	public List getList_Sub2_ACPT_INSPC_TYP_val() { return l_Sub2_ACPT_INSPC_TYP_val; }
	public List getList_h_Sub1Parent_ITEM_CD() { return l_h_Sub1Parent_ITEM_CD; }
	public List getList_h_Sub1Comp_ITEM_CD() { return l_h_Sub1Comp_ITEM_CD; }
	public List getList_h_Sub1_PS_EDITION() { return l_h_Sub1_PS_EDITION; }
	public List getList_Sub1_CONS_TYP_name() { return l_Sub1_CONS_TYP_name; }
	public List getList_Sub1_CONS_TYP_val() { return l_Sub1_CONS_TYP_val; }
	public List getList_c_Sub1_PS_LT_FLG() { return l_c_Sub1_PS_LT_FLG; }
	public List getList_Sub1_COST_UP_TYP_name() { return l_Sub1_COST_UP_TYP_name; }
	public List getList_Sub1_COST_UP_TYP_val() { return l_Sub1_COST_UP_TYP_val; }
	public List getList_Sub1_MRP_EXP_TYP_name() { return l_Sub1_MRP_EXP_TYP_name; }
	public List getList_Sub1_MRP_EXP_TYP_val() { return l_Sub1_MRP_EXP_TYP_val; }
	public List getList_h_Target_ITEM_CD2() { return l_h_Target_ITEM_CD2; }
	public List getList_h_TargetDate2() { return l_h_TargetDate2; }
	public List getList_h_DEVELOP_TYP2() { return l_h_DEVELOP_TYP2; }
	public List getList_h_InitLevel2() { return l_h_InitLevel2; }
	public List getList_h_Sub2_PROC_NO() { return l_h_Sub2_PROC_NO; }
	public List getList_FIRST_PROC() { return l_FIRST_PROC; }
	public List getList_h_Sub1_PS_UNIT_NUMERATOR() { return l_h_Sub1_PS_UNIT_NUMERATOR; }
	public List getList_h_Sub1_PS_UNIT_DENOMINATOR() { return l_h_Sub1_PS_UNIT_DENOMINATOR; }
	public List getList_AA0180010tree1() { return l_AA0180010tree1; }
	public List getList_sub2_STOCK_UNIT_1() { return l_sub2_STOCK_UNIT_1; }
	public List getList_sub2_STOCK_UNIT_2() { return l_sub2_STOCK_UNIT_2; }
	public List getList_sub2_STOCK_UNIT_3() { return l_sub2_STOCK_UNIT_3; }
	public List getList_Det2FIXED_LT_UNIT() { return l_Det2FIXED_LT_UNIT; }
	public List getList_Det2PROP_LT_UNIT() { return l_Det2PROP_LT_UNIT; }
	public List getList_Det2PROP_LOT_SIZE_UNIT() { return l_Det2PROP_LOT_SIZE_UNIT; }
	public List getList_Det2SAFETY_LT_UNIT() { return l_Det2SAFETY_LT_UNIT; }
	public List getList_MANHOUR_TYP() { return l_MANHOUR_TYP; }
	public List getList_Lower_ITEM_NAME() { return l_Lower_ITEM_NAME; }
	public List getList_Lower_STOCK_UNIT() { return l_Lower_STOCK_UNIT; }
	public List getList_Lower_ITEM_CD() { return l_Lower_ITEM_CD; }
	public List getList_Upper_ITEM_NAME() { return l_Upper_ITEM_NAME; }
	public List getList_Upper_ITEM_CD() { return l_Upper_ITEM_CD; }
	public List getList_DetParent_ITEM_CD() { return l_DetParent_ITEM_CD; }
	public List getList_DetParent_ITEM_NAME() { return l_DetParent_ITEM_NAME; }
	public List getList_DetParent_MRP_ODR_TYP() { return l_DetParent_MRP_ODR_TYP; }
	public List getList_DetParent_OUTSIDE_TYP() { return l_DetParent_OUTSIDE_TYP; }
	public List getList_DetComp_ITEM_CD() { return l_DetComp_ITEM_CD; }
	public List getList_DetComp_ITEM_NAME() { return l_DetComp_ITEM_NAME; }
	public List getList_DetComp_MRP_ODR_TYP() { return l_DetComp_MRP_ODR_TYP; }
	public List getList_DetComp_OUTSIDE_TYP() { return l_DetComp_OUTSIDE_TYP; }
	public List getList_Det_MANHOUR_TYP() { return l_Det_MANHOUR_TYP; }
	public List getList_Det_PS_EDITION() { return l_Det_PS_EDITION; }
	public List getList_Det_PS_UNIT_QTY() { return l_Det_PS_UNIT_QTY; }
	public List getList_Det_STOCK_UNIT() { return l_Det_STOCK_UNIT; }
	public List getList_Det_EFF_PHASE_IN_DATE() { return l_Det_EFF_PHASE_IN_DATE; }
	public List getList_Det_EFF_PHASE_OUT_DATE() { return l_Det_EFF_PHASE_OUT_DATE; }
	public List getList_Det_PS_SPOIL() { return l_Det_PS_SPOIL; }
	public List getList_Det_CONS_TYP() { return l_Det_CONS_TYP; }
	public List getList_Det_PS_LT_FLG() { return l_Det_PS_LT_FLG; }
	public List getList_Det_PS_FIXED_LT() { return l_Det_PS_FIXED_LT; }
	public List getList_Det_PS_PROP_LT() { return l_Det_PS_PROP_LT; }
	public List getList_Det_PS_PROP_LOT_SIZE() { return l_Det_PS_PROP_LOT_SIZE; }
	public List getList_Det_PS_REF_NO() { return l_Det_PS_REF_NO; }
	public List getList_Det_COST_UP_TYP() { return l_Det_COST_UP_TYP; }
	public List getList_Det_MRP_EXP_TYP() { return l_Det_MRP_EXP_TYP; }
	public List getList_PS_EDITION() { return l_PS_EDITION; }
	public List getList_Sub1Parent_ITEM_NAME() { return l_Sub1Parent_ITEM_NAME; }
	public List getList_Sub1Comp_ITEM_NAME() { return l_Sub1Comp_ITEM_NAME; }
	public List getList_Sub1_PS_UNIT_NUMERATOR() { return l_Sub1_PS_UNIT_NUMERATOR; }
	public List getList_Sub1_PS_UNIT_DENOMINATOR() { return l_Sub1_PS_UNIT_DENOMINATOR; }
	public List getList_Sub1_STOCK_UNIT() { return l_Sub1_STOCK_UNIT; }
	public List getList_Sub1Comp_STOCK_UNIT() { return l_Sub1Comp_STOCK_UNIT; }
	public List getList_Sub1_EFF_PHASE_IN_DATE() { return l_Sub1_EFF_PHASE_IN_DATE; }
	public List getList_Sub1_EFF_PHASE_OUT_DATE() { return l_Sub1_EFF_PHASE_OUT_DATE; }
	public List getList_Sub1_PS_SPOIL() { return l_Sub1_PS_SPOIL; }
	public List getList_Sub1_CONS_TYP() { return l_Sub1_CONS_TYP; }
	public List getList_h_Sub1_PS_LT_FLG() { return l_h_Sub1_PS_LT_FLG; }
	public List getList_Sub1_PS_FIXED_LT() { return l_Sub1_PS_FIXED_LT; }
	public List getList_Sub1_PS_PROP_LT() { return l_Sub1_PS_PROP_LT; }
	public List getList_Sub1_PS_PROP_LOT_SIZE() { return l_Sub1_PS_PROP_LOT_SIZE; }
	public List getList_Sub1_PS_REF_NO() { return l_Sub1_PS_REF_NO; }
	public List getList_Sub1_COST_UP_TYP() { return l_Sub1_COST_UP_TYP; }
	public List getList_Sub1_MRP_EXP_TYP() { return l_Sub1_MRP_EXP_TYP; }
	public List getList_h_Sub1_MODIFY_COUNT() { return l_h_Sub1_MODIFY_COUNT; }
	public List getList_Sub1Parent_ITEM_CD() { return l_Sub1Parent_ITEM_CD; }
	public List getList_Sub1Comp_ITEM_CD() { return l_Sub1Comp_ITEM_CD; }
	public List getList_Sub1_PS_EDITION() { return l_Sub1_PS_EDITION; }
	public List getList_KBN1() { return l_KBN1; }
	public List getList_KBN2() { return l_KBN2; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_PROC_CD() { return l_PROC_CD; }
	public List getList_PROC_NO() { return l_PROC_NO; }
	public List getList_PROC_NAME() { return l_PROC_NAME; }
	public List getList_WS_CD() { return l_WS_CD; }
	public List getList_MODIFY_CNT_PROC() { return l_MODIFY_CNT_PROC; }
	public List getList_EFF_PHASE_IN_DATE() { return l_EFF_PHASE_IN_DATE; }
	public List getList_EFF_PHASE_OUT_DATE() { return l_EFF_PHASE_OUT_DATE; }
	public List getList_MODIFY_CNT_ISSUE() { return l_MODIFY_CNT_ISSUE; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_PS_REF_NO() { return l_PS_REF_NO; }
	public List getList_FIRST_PROC_NO() { return l_FIRST_PROC_NO; }
	public List getList_TargetDate_IN() { return l_TargetDate_IN; }
	public List getList_TargetDate_OUT() { return l_TargetDate_OUT; }
	public List getList_Det2ITEM_CD() { return l_Det2ITEM_CD; }
	public List getList_Det2PROC_CD() { return l_Det2PROC_CD; }
	public List getList_Det2PROC_NO() { return l_Det2PROC_NO; }
	public List getList_Det2PROC_NAME() { return l_Det2PROC_NAME; }
	public List getList_Det2WS_CD() { return l_Det2WS_CD; }
	public List getList_Det2COMPANY_CD() { return l_Det2COMPANY_CD; }
	public List getList_Det2VEND_CD() { return l_Det2VEND_CD; }
	public List getList_Det2FIXED_LT() { return l_Det2FIXED_LT; }
	public List getList_Det2PROP_LT() { return l_Det2PROP_LT; }
	public List getList_Det2SAFETY_LT() { return l_Det2SAFETY_LT; }
	public List getList_Det2PROP_LOT_SIZE() { return l_Det2PROP_LOT_SIZE; }
	public List getList_Det2SPOIL() { return l_Det2SPOIL; }
	public List getList_Det2OUTSIDE_TYP() { return l_Det2OUTSIDE_TYP; }
	public List getList_Det2ACPT_INSPC_TYP() { return l_Det2ACPT_INSPC_TYP; }
	public List getList_Det2STANDARD_COST() { return l_Det2STANDARD_COST; }
	public List getList_Det2ITEM_NAME() { return l_Det2ITEM_NAME; }
	public List getList_Det2WS_NAME() { return l_Det2WS_NAME; }
	public List getList_Det2VEND_NAME() { return l_Det2VEND_NAME; }
	public List getList_Sub2_ITEM_CD() { return l_Sub2_ITEM_CD; }
	public List getList_Sub2_PROC_CD() { return l_Sub2_PROC_CD; }
	public List getList_Sub2_PROC_NO() { return l_Sub2_PROC_NO; }
	public List getList_Sub2_PROC_NAME() { return l_Sub2_PROC_NAME; }
	public List getList_Sub2_WS_CD() { return l_Sub2_WS_CD; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_Sub2_VEND_CD() { return l_Sub2_VEND_CD; }
	public List getList_Sub2_FIXED_LT() { return l_Sub2_FIXED_LT; }
	public List getList_Sub2_PROP_LT() { return l_Sub2_PROP_LT; }
	public List getList_Sub2_SAFETY_LT() { return l_Sub2_SAFETY_LT; }
	public List getList_Sub2_PROP_LOT_SIZE() { return l_Sub2_PROP_LOT_SIZE; }
	public List getList_Sub2_SPOIL() { return l_Sub2_SPOIL; }
	public List getList_Sub2_OUTSIDE_TYP() { return l_Sub2_OUTSIDE_TYP; }
	public List getList_Sub2_ACPT_INSPC_TYP() { return l_Sub2_ACPT_INSPC_TYP; }
	public List getList_Sub2_STANDARD_COST() { return l_Sub2_STANDARD_COST; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_DRAW_CD() { return l_DRAW_CD; }
	public List getList_SPEC() { return l_SPEC; }
	public List getList_MRP_ODR_TYP() { return l_MRP_ODR_TYP; }
	public List getList_ITEM_OUTSIDE_TYP() { return l_ITEM_OUTSIDE_TYP; }
	public List getList_OPR_RSLT_TYP() { return l_OPR_RSLT_TYP; }
	public List getList_ITEM_FIXED_LT() { return l_ITEM_FIXED_LT; }
	public List getList_ITEM_PROP_LT() { return l_ITEM_PROP_LT; }
	public List getList_ITEM_PROP_LOT_SIZE() { return l_ITEM_PROP_LOT_SIZE; }
	public List getList_ITEM_ISSUE_LT() { return l_ITEM_ISSUE_LT; }
	public List getList_ITEM_SAFETY_LT() { return l_ITEM_SAFETY_LT; }
	public List getList_UNIT_QTY_TYP() { return l_UNIT_QTY_TYP; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_FIXED_LT() { return l_FIXED_LT; }
	public List getList_PROP_LT() { return l_PROP_LT; }
	public List getList_SAFETY_LT() { return l_SAFETY_LT; }
	public List getList_PROP_LOT_SIZE() { return l_PROP_LOT_SIZE; }
	public List getList_SPOIL() { return l_SPOIL; }
	public List getList_OUTSIDE_TYP() { return l_OUTSIDE_TYP; }
	public List getList_ACPT_INSPC_TYP() { return l_ACPT_INSPC_TYP; }
	public List getList_STANDARD_COST() { return l_STANDARD_COST; }
	public List getList_UNIT_QTY() { return l_UNIT_QTY; }
	public List getList_WORK_TIME() { return l_WORK_TIME; }
	public List getList_WS_NAME() { return l_WS_NAME; }
	public List getList_VEND_NAME() { return l_VEND_NAME; }
	public List getList_h_Sub2_MODIFY_COUNT() { return l_h_Sub2_MODIFY_COUNT; }
	public List getList_Sub2_ITEM_NAME() { return l_Sub2_ITEM_NAME; }
	public List getList_Sub2_STOCK_UNIT() { return l_Sub2_STOCK_UNIT; }
	public List getList_Sub2_WS_NAME() { return l_Sub2_WS_NAME; }
	public List getList_Sub2_VEND_NAME() { return l_Sub2_VEND_NAME; }
	public List getList_PS_UNIT_DENOMINATOR() { return l_PS_UNIT_DENOMINATOR; }
	public List getList_PS_UNIT_NUMERATOR() { return l_PS_UNIT_NUMERATOR; }
	public List getList_PARENT_ITEM_CD() { return l_PARENT_ITEM_CD; }
	public List getList_COMP_ITEM_CD() { return l_COMP_ITEM_CD; }
	public List getList_SUM_FIXED_LT() { return l_SUM_FIXED_LT; }
	public List getList_SUM_PROP_LT() { return l_SUM_PROP_LT; }
	public List getList_BY_PRODUCT_CD() { return l_BY_PRODUCT_CD; }
	public List getList_BUSINESS_OPR_DATE() { return l_BUSINESS_OPR_DATE; }
	public List getList_PARAM_RESULT_DATA() { return l_PARAM_RESULT_DATA; }
	public List getList_PARAM_INPUT_DATA() { return l_PARAM_INPUT_DATA; }
	public List getList_Lower_MANHOUR_TYP() { return l_Lower_MANHOUR_TYP; }

	public void setTarget_ITEM_CD(String val) { m_Target_ITEM_CD = val; }
	public void setDEVELOP_TYP(String val) { m_DEVELOP_TYP = val; }
	public void setInitLevel(String val) { m_InitLevel = val; }
	public void setid(String val) { m_id = val; }
	public void setlvl(String val) { m_lvl = val; }
	public void setparent(String val) { m_parent = val; }
	public void setlabel(String val) { m_label = val; }
	public void setctx(String val) { m_ctx = val; }
	public void setmaxid(String val) { m_maxid = val; }
	public void setTargetDate(String val) { m_TargetDate = val; }
	public void seth_Target_ITEM_CD(String val) { m_h_Target_ITEM_CD = val; }
	public void seth_TargetDate(String val) { m_h_TargetDate = val; }
	public void seth_DEVELOP_TYP(String val) { m_h_DEVELOP_TYP = val; }
	public void seth_InitLevel(String val) { m_h_InitLevel = val; }
	public void setDEVELOP_TYP_name(String val) { m_DEVELOP_TYP_name = val; }
	public void setDEVELOP_TYP_val(String val) { m_DEVELOP_TYP_val = val; }
	public void seth_ProcTyp(String val) { m_h_ProcTyp = val; }
	public void seth_MaxLevel(String val) { m_h_MaxLevel = val; }
	public void setDET_TYP(String val) { m_DET_TYP = val; }
	public void setSub2_OUTSIDE_TYP_name(String val) { m_Sub2_OUTSIDE_TYP_name = val; }
	public void setSub2_OUTSIDE_TYP_val(String val) { m_Sub2_OUTSIDE_TYP_val = val; }
	public void setSub2_ACPT_INSPC_TYP_name(String val) { m_Sub2_ACPT_INSPC_TYP_name = val; }
	public void setSub2_ACPT_INSPC_TYP_val(String val) { m_Sub2_ACPT_INSPC_TYP_val = val; }
	public void seth_Sub1Parent_ITEM_CD(String val) { m_h_Sub1Parent_ITEM_CD = val; }
	public void seth_Sub1Comp_ITEM_CD(String val) { m_h_Sub1Comp_ITEM_CD = val; }
	public void seth_Sub1_PS_EDITION(String val) { m_h_Sub1_PS_EDITION = val; }
	public void setSub1_CONS_TYP_name(String val) { m_Sub1_CONS_TYP_name = val; }
	public void setSub1_CONS_TYP_val(String val) { m_Sub1_CONS_TYP_val = val; }
	public void setc_Sub1_PS_LT_FLG(String val) { m_c_Sub1_PS_LT_FLG = val; }
	public void setSub1_COST_UP_TYP_name(String val) { m_Sub1_COST_UP_TYP_name = val; }
	public void setSub1_COST_UP_TYP_val(String val) { m_Sub1_COST_UP_TYP_val = val; }
	public void setSub1_MRP_EXP_TYP_name(String val) { m_Sub1_MRP_EXP_TYP_name = val; }
	public void setSub1_MRP_EXP_TYP_val(String val) { m_Sub1_MRP_EXP_TYP_val = val; }
	public void seth_Target_ITEM_CD2(String val) { m_h_Target_ITEM_CD2 = val; }
	public void seth_TargetDate2(String val) { m_h_TargetDate2 = val; }
	public void seth_DEVELOP_TYP2(String val) { m_h_DEVELOP_TYP2 = val; }
	public void seth_InitLevel2(String val) { m_h_InitLevel2 = val; }
	public void seth_Sub2_PROC_NO(String val) { m_h_Sub2_PROC_NO = val; }
	public void setFIRST_PROC(String val) { m_FIRST_PROC = val; }
	public void seth_Sub1_PS_UNIT_NUMERATOR(String val) { m_h_Sub1_PS_UNIT_NUMERATOR = val; }
	public void seth_Sub1_PS_UNIT_DENOMINATOR(String val) { m_h_Sub1_PS_UNIT_DENOMINATOR = val; }
	public void setAA0180010tree1(String val) { m_AA0180010tree1 = val; }
	public void setsub2_STOCK_UNIT_1(String val) { m_sub2_STOCK_UNIT_1 = val; }
	public void setsub2_STOCK_UNIT_2(String val) { m_sub2_STOCK_UNIT_2 = val; }
	public void setsub2_STOCK_UNIT_3(String val) { m_sub2_STOCK_UNIT_3 = val; }
	public void setDet2FIXED_LT_UNIT(String val) { m_Det2FIXED_LT_UNIT = val; }
	public void setDet2PROP_LT_UNIT(String val) { m_Det2PROP_LT_UNIT = val; }
	public void setDet2PROP_LOT_SIZE_UNIT(String val) { m_Det2PROP_LOT_SIZE_UNIT = val; }
	public void setDet2SAFETY_LT_UNIT(String val) { m_Det2SAFETY_LT_UNIT = val; }
	public void setMANHOUR_TYP(String val) { m_MANHOUR_TYP = val; }
	public void setLower_ITEM_NAME(String val) { m_Lower_ITEM_NAME = val; }
	public void setLower_STOCK_UNIT(String val) { m_Lower_STOCK_UNIT = val; }
	public void setLower_ITEM_CD(String val) { m_Lower_ITEM_CD = val; }
	public void setUpper_ITEM_NAME(String val) { m_Upper_ITEM_NAME = val; }
	public void setUpper_ITEM_CD(String val) { m_Upper_ITEM_CD = val; }
	public void setDetParent_ITEM_CD(String val) { m_DetParent_ITEM_CD = val; }
	public void setDetParent_ITEM_NAME(String val) { m_DetParent_ITEM_NAME = val; }
	public void setDetParent_MRP_ODR_TYP(String val) { m_DetParent_MRP_ODR_TYP = val; }
	public void setDetParent_OUTSIDE_TYP(String val) { m_DetParent_OUTSIDE_TYP = val; }
	public void setDetComp_ITEM_CD(String val) { m_DetComp_ITEM_CD = val; }
	public void setDetComp_ITEM_NAME(String val) { m_DetComp_ITEM_NAME = val; }
	public void setDetComp_MRP_ODR_TYP(String val) { m_DetComp_MRP_ODR_TYP = val; }
	public void setDetComp_OUTSIDE_TYP(String val) { m_DetComp_OUTSIDE_TYP = val; }
	public void setDet_MANHOUR_TYP(String val) { m_Det_MANHOUR_TYP = val; }
	public void setDet_PS_EDITION(String val) { m_Det_PS_EDITION = val; }
	public void setDet_PS_UNIT_QTY(String val) { m_Det_PS_UNIT_QTY = val; }
	public void setDet_STOCK_UNIT(String val) { m_Det_STOCK_UNIT = val; }
	public void setDet_EFF_PHASE_IN_DATE(String val) { m_Det_EFF_PHASE_IN_DATE = val; }
	public void setDet_EFF_PHASE_OUT_DATE(String val) { m_Det_EFF_PHASE_OUT_DATE = val; }
	public void setDet_PS_SPOIL(String val) { m_Det_PS_SPOIL = val; }
	public void setDet_CONS_TYP(String val) { m_Det_CONS_TYP = val; }
	public void setDet_PS_LT_FLG(String val) { m_Det_PS_LT_FLG = val; }
	public void setDet_PS_FIXED_LT(String val) { m_Det_PS_FIXED_LT = val; }
	public void setDet_PS_PROP_LT(String val) { m_Det_PS_PROP_LT = val; }
	public void setDet_PS_PROP_LOT_SIZE(String val) { m_Det_PS_PROP_LOT_SIZE = val; }
	public void setDet_PS_REF_NO(String val) { m_Det_PS_REF_NO = val; }
	public void setDet_COST_UP_TYP(String val) { m_Det_COST_UP_TYP = val; }
	public void setDet_MRP_EXP_TYP(String val) { m_Det_MRP_EXP_TYP = val; }
	public void setPS_EDITION(String val) { m_PS_EDITION = val; }
	public void setSub1Parent_ITEM_NAME(String val) { m_Sub1Parent_ITEM_NAME = val; }
	public void setSub1Comp_ITEM_NAME(String val) { m_Sub1Comp_ITEM_NAME = val; }
	public void setSub1_PS_UNIT_NUMERATOR(String val) { m_Sub1_PS_UNIT_NUMERATOR = val; }
	public void setSub1_PS_UNIT_DENOMINATOR(String val) { m_Sub1_PS_UNIT_DENOMINATOR = val; }
	public void setSub1_STOCK_UNIT(String val) { m_Sub1_STOCK_UNIT = val; }
	public void setSub1Comp_STOCK_UNIT(String val) { m_Sub1Comp_STOCK_UNIT = val; }
	public void setSub1_EFF_PHASE_IN_DATE(String val) { m_Sub1_EFF_PHASE_IN_DATE = val; }
	public void setSub1_EFF_PHASE_OUT_DATE(String val) { m_Sub1_EFF_PHASE_OUT_DATE = val; }
	public void setSub1_PS_SPOIL(String val) { m_Sub1_PS_SPOIL = val; }
	public void setSub1_CONS_TYP(String val) { m_Sub1_CONS_TYP = val; }
	public void seth_Sub1_PS_LT_FLG(String val) { m_h_Sub1_PS_LT_FLG = val; }
	public void setSub1_PS_FIXED_LT(String val) { m_Sub1_PS_FIXED_LT = val; }
	public void setSub1_PS_PROP_LT(String val) { m_Sub1_PS_PROP_LT = val; }
	public void setSub1_PS_PROP_LOT_SIZE(String val) { m_Sub1_PS_PROP_LOT_SIZE = val; }
	public void setSub1_PS_REF_NO(String val) { m_Sub1_PS_REF_NO = val; }
	public void setSub1_COST_UP_TYP(String val) { m_Sub1_COST_UP_TYP = val; }
	public void setSub1_MRP_EXP_TYP(String val) { m_Sub1_MRP_EXP_TYP = val; }
	public void seth_Sub1_MODIFY_COUNT(String val) { m_h_Sub1_MODIFY_COUNT = val; }
	public void setSub1Parent_ITEM_CD(String val) { m_Sub1Parent_ITEM_CD = val; }
	public void setSub1Comp_ITEM_CD(String val) { m_Sub1Comp_ITEM_CD = val; }
	public void setSub1_PS_EDITION(String val) { m_Sub1_PS_EDITION = val; }
	public void setKBN1(String val) { m_KBN1 = val; }
	public void setKBN2(String val) { m_KBN2 = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setPROC_CD(String val) { m_PROC_CD = val; }
	public void setPROC_NO(String val) { m_PROC_NO = val; }
	public void setPROC_NAME(String val) { m_PROC_NAME = val; }
	public void setWS_CD(String val) { m_WS_CD = val; }
	public void setMODIFY_CNT_PROC(String val) { m_MODIFY_CNT_PROC = val; }
	public void setEFF_PHASE_IN_DATE(String val) { m_EFF_PHASE_IN_DATE = val; }
	public void setEFF_PHASE_OUT_DATE(String val) { m_EFF_PHASE_OUT_DATE = val; }
	public void setMODIFY_CNT_ISSUE(String val) { m_MODIFY_CNT_ISSUE = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setPS_REF_NO(String val) { m_PS_REF_NO = val; }
	public void setFIRST_PROC_NO(String val) { m_FIRST_PROC_NO = val; }
	public void setTargetDate_IN(String val) { m_TargetDate_IN = val; }
	public void setTargetDate_OUT(String val) { m_TargetDate_OUT = val; }
	public void setDet2ITEM_CD(String val) { m_Det2ITEM_CD = val; }
	public void setDet2PROC_CD(String val) { m_Det2PROC_CD = val; }
	public void setDet2PROC_NO(String val) { m_Det2PROC_NO = val; }
	public void setDet2PROC_NAME(String val) { m_Det2PROC_NAME = val; }
	public void setDet2WS_CD(String val) { m_Det2WS_CD = val; }
	public void setDet2COMPANY_CD(String val) { m_Det2COMPANY_CD = val; }
	public void setDet2VEND_CD(String val) { m_Det2VEND_CD = val; }
	public void setDet2FIXED_LT(String val) { m_Det2FIXED_LT = val; }
	public void setDet2PROP_LT(String val) { m_Det2PROP_LT = val; }
	public void setDet2SAFETY_LT(String val) { m_Det2SAFETY_LT = val; }
	public void setDet2PROP_LOT_SIZE(String val) { m_Det2PROP_LOT_SIZE = val; }
	public void setDet2SPOIL(String val) { m_Det2SPOIL = val; }
	public void setDet2OUTSIDE_TYP(String val) { m_Det2OUTSIDE_TYP = val; }
	public void setDet2ACPT_INSPC_TYP(String val) { m_Det2ACPT_INSPC_TYP = val; }
	public void setDet2STANDARD_COST(String val) { m_Det2STANDARD_COST = val; }
	public void setDet2ITEM_NAME(String val) { m_Det2ITEM_NAME = val; }
	public void setDet2WS_NAME(String val) { m_Det2WS_NAME = val; }
	public void setDet2VEND_NAME(String val) { m_Det2VEND_NAME = val; }
	public void setSub2_ITEM_CD(String val) { m_Sub2_ITEM_CD = val; }
	public void setSub2_PROC_CD(String val) { m_Sub2_PROC_CD = val; }
	public void setSub2_PROC_NO(String val) { m_Sub2_PROC_NO = val; }
	public void setSub2_PROC_NAME(String val) { m_Sub2_PROC_NAME = val; }
	public void setSub2_WS_CD(String val) { m_Sub2_WS_CD = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setSub2_VEND_CD(String val) { m_Sub2_VEND_CD = val; }
	public void setSub2_FIXED_LT(String val) { m_Sub2_FIXED_LT = val; }
	public void setSub2_PROP_LT(String val) { m_Sub2_PROP_LT = val; }
	public void setSub2_SAFETY_LT(String val) { m_Sub2_SAFETY_LT = val; }
	public void setSub2_PROP_LOT_SIZE(String val) { m_Sub2_PROP_LOT_SIZE = val; }
	public void setSub2_SPOIL(String val) { m_Sub2_SPOIL = val; }
	public void setSub2_OUTSIDE_TYP(String val) { m_Sub2_OUTSIDE_TYP = val; }
	public void setSub2_ACPT_INSPC_TYP(String val) { m_Sub2_ACPT_INSPC_TYP = val; }
	public void setSub2_STANDARD_COST(String val) { m_Sub2_STANDARD_COST = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setDRAW_CD(String val) { m_DRAW_CD = val; }
	public void setSPEC(String val) { m_SPEC = val; }
	public void setMRP_ODR_TYP(Integer val) { m_MRP_ODR_TYP = val; }
	public void setITEM_OUTSIDE_TYP(Integer val) { m_ITEM_OUTSIDE_TYP = val; }
	public void setOPR_RSLT_TYP(Integer val) { m_OPR_RSLT_TYP = val; }
	public void setITEM_FIXED_LT(Long val) { m_ITEM_FIXED_LT = val; }
	public void setITEM_PROP_LT(Long val) { m_ITEM_PROP_LT = val; }
	public void setITEM_PROP_LOT_SIZE(String val) { m_ITEM_PROP_LOT_SIZE = val; }
	public void setITEM_ISSUE_LT(Long val) { m_ITEM_ISSUE_LT = val; }
	public void setITEM_SAFETY_LT(Long val) { m_ITEM_SAFETY_LT = val; }
	public void setUNIT_QTY_TYP(Integer val) { m_UNIT_QTY_TYP = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void setFIXED_LT(String val) { m_FIXED_LT = val; }
	public void setPROP_LT(String val) { m_PROP_LT = val; }
	public void setSAFETY_LT(String val) { m_SAFETY_LT = val; }
	public void setPROP_LOT_SIZE(String val) { m_PROP_LOT_SIZE = val; }
	public void setSPOIL(String val) { m_SPOIL = val; }
	public void setOUTSIDE_TYP(Integer val) { m_OUTSIDE_TYP = val; }
	public void setACPT_INSPC_TYP(Integer val) { m_ACPT_INSPC_TYP = val; }
	public void setSTANDARD_COST(String val) { m_STANDARD_COST = val; }
	public void setUNIT_QTY(String val) { m_UNIT_QTY = val; }
	public void setWORK_TIME(String val) { m_WORK_TIME = val; }
	public void setWS_NAME(String val) { m_WS_NAME = val; }
	public void setVEND_NAME(String val) { m_VEND_NAME = val; }
	public void seth_Sub2_MODIFY_COUNT(String val) { m_h_Sub2_MODIFY_COUNT = val; }
	public void setSub2_ITEM_NAME(String val) { m_Sub2_ITEM_NAME = val; }
	public void setSub2_STOCK_UNIT(String val) { m_Sub2_STOCK_UNIT = val; }
	public void setSub2_WS_NAME(String val) { m_Sub2_WS_NAME = val; }
	public void setSub2_VEND_NAME(String val) { m_Sub2_VEND_NAME = val; }
	public void setPS_UNIT_DENOMINATOR(String val) { m_PS_UNIT_DENOMINATOR = val; }
	public void setPS_UNIT_NUMERATOR(String val) { m_PS_UNIT_NUMERATOR = val; }
	public void setPARENT_ITEM_CD(String val) { m_PARENT_ITEM_CD = val; }
	public void setCOMP_ITEM_CD(String val) { m_COMP_ITEM_CD = val; }
	public void setSUM_FIXED_LT(String val) { m_SUM_FIXED_LT = val; }
	public void setSUM_PROP_LT(String val) { m_SUM_PROP_LT = val; }
	public void setBY_PRODUCT_CD(String val) { m_BY_PRODUCT_CD = val; }
	public void setBUSINESS_OPR_DATE(String val) { m_BUSINESS_OPR_DATE = val; }
	public void setPARAM_RESULT_DATA(String val) { m_PARAM_RESULT_DATA = val; }
	public void setPARAM_INPUT_DATA(String val) { m_PARAM_INPUT_DATA = val; }
	public void setLower_MANHOUR_TYP(String val) { m_Lower_MANHOUR_TYP = val; }

	public void setMRP_ODR_TYP(String val) { m_MRP_ODR_TYP = getInteger(val); }
	public void setITEM_OUTSIDE_TYP(String val) { m_ITEM_OUTSIDE_TYP = getInteger(val); }
	public void setOPR_RSLT_TYP(String val) { m_OPR_RSLT_TYP = getInteger(val); }
	public void setUNIT_QTY_TYP(String val) { m_UNIT_QTY_TYP = getInteger(val); }
	public void setOUTSIDE_TYP(String val) { m_OUTSIDE_TYP = getInteger(val); }
	public void setACPT_INSPC_TYP(String val) { m_ACPT_INSPC_TYP = getInteger(val); }

	public void setList_Target_ITEM_CD(List list) { l_Target_ITEM_CD = list; }
	public void setList_DEVELOP_TYP(List list) { l_DEVELOP_TYP = list; }
	public void setList_InitLevel(List list) { l_InitLevel = list; }
	public void setList_id(List list) { l_id = list; }
	public void setList_lvl(List list) { l_lvl = list; }
	public void setList_parent(List list) { l_parent = list; }
	public void setList_label(List list) { l_label = list; }
	public void setList_ctx(List list) { l_ctx = list; }
	public void setList_maxid(List list) { l_maxid = list; }
	public void setList_TargetDate(List list) { l_TargetDate = list; }
	public void setList_h_Target_ITEM_CD(List list) { l_h_Target_ITEM_CD = list; }
	public void setList_h_TargetDate(List list) { l_h_TargetDate = list; }
	public void setList_h_DEVELOP_TYP(List list) { l_h_DEVELOP_TYP = list; }
	public void setList_h_InitLevel(List list) { l_h_InitLevel = list; }
	public void setList_DEVELOP_TYP_name(List list) { l_DEVELOP_TYP_name = list; }
	public void setList_DEVELOP_TYP_val(List list) { l_DEVELOP_TYP_val = list; }
	public void setList_h_ProcTyp(List list) { l_h_ProcTyp = list; }
	public void setList_h_MaxLevel(List list) { l_h_MaxLevel = list; }
	public void setList_DET_TYP(List list) { l_DET_TYP = list; }
	public void setList_Sub2_OUTSIDE_TYP_name(List list) { l_Sub2_OUTSIDE_TYP_name = list; }
	public void setList_Sub2_OUTSIDE_TYP_val(List list) { l_Sub2_OUTSIDE_TYP_val = list; }
	public void setList_Sub2_ACPT_INSPC_TYP_name(List list) { l_Sub2_ACPT_INSPC_TYP_name = list; }
	public void setList_Sub2_ACPT_INSPC_TYP_val(List list) { l_Sub2_ACPT_INSPC_TYP_val = list; }
	public void setList_h_Sub1Parent_ITEM_CD(List list) { l_h_Sub1Parent_ITEM_CD = list; }
	public void setList_h_Sub1Comp_ITEM_CD(List list) { l_h_Sub1Comp_ITEM_CD = list; }
	public void setList_h_Sub1_PS_EDITION(List list) { l_h_Sub1_PS_EDITION = list; }
	public void setList_Sub1_CONS_TYP_name(List list) { l_Sub1_CONS_TYP_name = list; }
	public void setList_Sub1_CONS_TYP_val(List list) { l_Sub1_CONS_TYP_val = list; }
	public void setList_c_Sub1_PS_LT_FLG(List list) { l_c_Sub1_PS_LT_FLG = list; }
	public void setList_Sub1_COST_UP_TYP_name(List list) { l_Sub1_COST_UP_TYP_name = list; }
	public void setList_Sub1_COST_UP_TYP_val(List list) { l_Sub1_COST_UP_TYP_val = list; }
	public void setList_Sub1_MRP_EXP_TYP_name(List list) { l_Sub1_MRP_EXP_TYP_name = list; }
	public void setList_Sub1_MRP_EXP_TYP_val(List list) { l_Sub1_MRP_EXP_TYP_val = list; }
	public void setList_h_Target_ITEM_CD2(List list) { l_h_Target_ITEM_CD2 = list; }
	public void setList_h_TargetDate2(List list) { l_h_TargetDate2 = list; }
	public void setList_h_DEVELOP_TYP2(List list) { l_h_DEVELOP_TYP2 = list; }
	public void setList_h_InitLevel2(List list) { l_h_InitLevel2 = list; }
	public void setList_h_Sub2_PROC_NO(List list) { l_h_Sub2_PROC_NO = list; }
	public void setList_FIRST_PROC(List list) { l_FIRST_PROC = list; }
	public void setList_h_Sub1_PS_UNIT_NUMERATOR(List list) { l_h_Sub1_PS_UNIT_NUMERATOR = list; }
	public void setList_h_Sub1_PS_UNIT_DENOMINATOR(List list) { l_h_Sub1_PS_UNIT_DENOMINATOR = list; }
	public void setList_AA0180010tree1(List list) { l_AA0180010tree1 = list; }
	public void setList_sub2_STOCK_UNIT_1(List list) { l_sub2_STOCK_UNIT_1 = list; }
	public void setList_sub2_STOCK_UNIT_2(List list) { l_sub2_STOCK_UNIT_2 = list; }
	public void setList_sub2_STOCK_UNIT_3(List list) { l_sub2_STOCK_UNIT_3 = list; }
	public void setList_Det2FIXED_LT_UNIT(List list) { l_Det2FIXED_LT_UNIT = list; }
	public void setList_Det2PROP_LT_UNIT(List list) { l_Det2PROP_LT_UNIT = list; }
	public void setList_Det2PROP_LOT_SIZE_UNIT(List list) { l_Det2PROP_LOT_SIZE_UNIT = list; }
	public void setList_Det2SAFETY_LT_UNIT(List list) { l_Det2SAFETY_LT_UNIT = list; }
	public void setList_MANHOUR_TYP(List list) { l_MANHOUR_TYP = list; }
	public void setList_Lower_ITEM_NAME(List list) { l_Lower_ITEM_NAME = list; }
	public void setList_Lower_STOCK_UNIT(List list) { l_Lower_STOCK_UNIT = list; }
	public void setList_Lower_ITEM_CD(List list) { l_Lower_ITEM_CD = list; }
	public void setList_Upper_ITEM_NAME(List list) { l_Upper_ITEM_NAME = list; }
	public void setList_Upper_ITEM_CD(List list) { l_Upper_ITEM_CD = list; }
	public void setList_DetParent_ITEM_CD(List list) { l_DetParent_ITEM_CD = list; }
	public void setList_DetParent_ITEM_NAME(List list) { l_DetParent_ITEM_NAME = list; }
	public void setList_DetParent_MRP_ODR_TYP(List list) { l_DetParent_MRP_ODR_TYP = list; }
	public void setList_DetParent_OUTSIDE_TYP(List list) { l_DetParent_OUTSIDE_TYP = list; }
	public void setList_DetComp_ITEM_CD(List list) { l_DetComp_ITEM_CD = list; }
	public void setList_DetComp_ITEM_NAME(List list) { l_DetComp_ITEM_NAME = list; }
	public void setList_DetComp_MRP_ODR_TYP(List list) { l_DetComp_MRP_ODR_TYP = list; }
	public void setList_DetComp_OUTSIDE_TYP(List list) { l_DetComp_OUTSIDE_TYP = list; }
	public void setList_Det_MANHOUR_TYP(List list) { l_Det_MANHOUR_TYP = list; }
	public void setList_Det_PS_EDITION(List list) { l_Det_PS_EDITION = list; }
	public void setList_Det_PS_UNIT_QTY(List list) { l_Det_PS_UNIT_QTY = list; }
	public void setList_Det_STOCK_UNIT(List list) { l_Det_STOCK_UNIT = list; }
	public void setList_Det_EFF_PHASE_IN_DATE(List list) { l_Det_EFF_PHASE_IN_DATE = list; }
	public void setList_Det_EFF_PHASE_OUT_DATE(List list) { l_Det_EFF_PHASE_OUT_DATE = list; }
	public void setList_Det_PS_SPOIL(List list) { l_Det_PS_SPOIL = list; }
	public void setList_Det_CONS_TYP(List list) { l_Det_CONS_TYP = list; }
	public void setList_Det_PS_LT_FLG(List list) { l_Det_PS_LT_FLG = list; }
	public void setList_Det_PS_FIXED_LT(List list) { l_Det_PS_FIXED_LT = list; }
	public void setList_Det_PS_PROP_LT(List list) { l_Det_PS_PROP_LT = list; }
	public void setList_Det_PS_PROP_LOT_SIZE(List list) { l_Det_PS_PROP_LOT_SIZE = list; }
	public void setList_Det_PS_REF_NO(List list) { l_Det_PS_REF_NO = list; }
	public void setList_Det_COST_UP_TYP(List list) { l_Det_COST_UP_TYP = list; }
	public void setList_Det_MRP_EXP_TYP(List list) { l_Det_MRP_EXP_TYP = list; }
	public void setList_PS_EDITION(List list) { l_PS_EDITION = list; }
	public void setList_Sub1Parent_ITEM_NAME(List list) { l_Sub1Parent_ITEM_NAME = list; }
	public void setList_Sub1Comp_ITEM_NAME(List list) { l_Sub1Comp_ITEM_NAME = list; }
	public void setList_Sub1_PS_UNIT_NUMERATOR(List list) { l_Sub1_PS_UNIT_NUMERATOR = list; }
	public void setList_Sub1_PS_UNIT_DENOMINATOR(List list) { l_Sub1_PS_UNIT_DENOMINATOR = list; }
	public void setList_Sub1_STOCK_UNIT(List list) { l_Sub1_STOCK_UNIT = list; }
	public void setList_Sub1Comp_STOCK_UNIT(List list) { l_Sub1Comp_STOCK_UNIT = list; }
	public void setList_Sub1_EFF_PHASE_IN_DATE(List list) { l_Sub1_EFF_PHASE_IN_DATE = list; }
	public void setList_Sub1_EFF_PHASE_OUT_DATE(List list) { l_Sub1_EFF_PHASE_OUT_DATE = list; }
	public void setList_Sub1_PS_SPOIL(List list) { l_Sub1_PS_SPOIL = list; }
	public void setList_Sub1_CONS_TYP(List list) { l_Sub1_CONS_TYP = list; }
	public void setList_h_Sub1_PS_LT_FLG(List list) { l_h_Sub1_PS_LT_FLG = list; }
	public void setList_Sub1_PS_FIXED_LT(List list) { l_Sub1_PS_FIXED_LT = list; }
	public void setList_Sub1_PS_PROP_LT(List list) { l_Sub1_PS_PROP_LT = list; }
	public void setList_Sub1_PS_PROP_LOT_SIZE(List list) { l_Sub1_PS_PROP_LOT_SIZE = list; }
	public void setList_Sub1_PS_REF_NO(List list) { l_Sub1_PS_REF_NO = list; }
	public void setList_Sub1_COST_UP_TYP(List list) { l_Sub1_COST_UP_TYP = list; }
	public void setList_Sub1_MRP_EXP_TYP(List list) { l_Sub1_MRP_EXP_TYP = list; }
	public void setList_h_Sub1_MODIFY_COUNT(List list) { l_h_Sub1_MODIFY_COUNT = list; }
	public void setList_Sub1Parent_ITEM_CD(List list) { l_Sub1Parent_ITEM_CD = list; }
	public void setList_Sub1Comp_ITEM_CD(List list) { l_Sub1Comp_ITEM_CD = list; }
	public void setList_Sub1_PS_EDITION(List list) { l_Sub1_PS_EDITION = list; }
	public void setList_KBN1(List list) { l_KBN1 = list; }
	public void setList_KBN2(List list) { l_KBN2 = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_PROC_CD(List list) { l_PROC_CD = list; }
	public void setList_PROC_NO(List list) { l_PROC_NO = list; }
	public void setList_PROC_NAME(List list) { l_PROC_NAME = list; }
	public void setList_WS_CD(List list) { l_WS_CD = list; }
	public void setList_MODIFY_CNT_PROC(List list) { l_MODIFY_CNT_PROC = list; }
	public void setList_EFF_PHASE_IN_DATE(List list) { l_EFF_PHASE_IN_DATE = list; }
	public void setList_EFF_PHASE_OUT_DATE(List list) { l_EFF_PHASE_OUT_DATE = list; }
	public void setList_MODIFY_CNT_ISSUE(List list) { l_MODIFY_CNT_ISSUE = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_PS_REF_NO(List list) { l_PS_REF_NO = list; }
	public void setList_FIRST_PROC_NO(List list) { l_FIRST_PROC_NO = list; }
	public void setList_TargetDate_IN(List list) { l_TargetDate_IN = list; }
	public void setList_TargetDate_OUT(List list) { l_TargetDate_OUT = list; }
	public void setList_Det2ITEM_CD(List list) { l_Det2ITEM_CD = list; }
	public void setList_Det2PROC_CD(List list) { l_Det2PROC_CD = list; }
	public void setList_Det2PROC_NO(List list) { l_Det2PROC_NO = list; }
	public void setList_Det2PROC_NAME(List list) { l_Det2PROC_NAME = list; }
	public void setList_Det2WS_CD(List list) { l_Det2WS_CD = list; }
	public void setList_Det2COMPANY_CD(List list) { l_Det2COMPANY_CD = list; }
	public void setList_Det2VEND_CD(List list) { l_Det2VEND_CD = list; }
	public void setList_Det2FIXED_LT(List list) { l_Det2FIXED_LT = list; }
	public void setList_Det2PROP_LT(List list) { l_Det2PROP_LT = list; }
	public void setList_Det2SAFETY_LT(List list) { l_Det2SAFETY_LT = list; }
	public void setList_Det2PROP_LOT_SIZE(List list) { l_Det2PROP_LOT_SIZE = list; }
	public void setList_Det2SPOIL(List list) { l_Det2SPOIL = list; }
	public void setList_Det2OUTSIDE_TYP(List list) { l_Det2OUTSIDE_TYP = list; }
	public void setList_Det2ACPT_INSPC_TYP(List list) { l_Det2ACPT_INSPC_TYP = list; }
	public void setList_Det2STANDARD_COST(List list) { l_Det2STANDARD_COST = list; }
	public void setList_Det2ITEM_NAME(List list) { l_Det2ITEM_NAME = list; }
	public void setList_Det2WS_NAME(List list) { l_Det2WS_NAME = list; }
	public void setList_Det2VEND_NAME(List list) { l_Det2VEND_NAME = list; }
	public void setList_Sub2_ITEM_CD(List list) { l_Sub2_ITEM_CD = list; }
	public void setList_Sub2_PROC_CD(List list) { l_Sub2_PROC_CD = list; }
	public void setList_Sub2_PROC_NO(List list) { l_Sub2_PROC_NO = list; }
	public void setList_Sub2_PROC_NAME(List list) { l_Sub2_PROC_NAME = list; }
	public void setList_Sub2_WS_CD(List list) { l_Sub2_WS_CD = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_Sub2_VEND_CD(List list) { l_Sub2_VEND_CD = list; }
	public void setList_Sub2_FIXED_LT(List list) { l_Sub2_FIXED_LT = list; }
	public void setList_Sub2_PROP_LT(List list) { l_Sub2_PROP_LT = list; }
	public void setList_Sub2_SAFETY_LT(List list) { l_Sub2_SAFETY_LT = list; }
	public void setList_Sub2_PROP_LOT_SIZE(List list) { l_Sub2_PROP_LOT_SIZE = list; }
	public void setList_Sub2_SPOIL(List list) { l_Sub2_SPOIL = list; }
	public void setList_Sub2_OUTSIDE_TYP(List list) { l_Sub2_OUTSIDE_TYP = list; }
	public void setList_Sub2_ACPT_INSPC_TYP(List list) { l_Sub2_ACPT_INSPC_TYP = list; }
	public void setList_Sub2_STANDARD_COST(List list) { l_Sub2_STANDARD_COST = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_DRAW_CD(List list) { l_DRAW_CD = list; }
	public void setList_SPEC(List list) { l_SPEC = list; }
	public void setList_MRP_ODR_TYP(List list) { l_MRP_ODR_TYP = list; }
	public void setList_ITEM_OUTSIDE_TYP(List list) { l_ITEM_OUTSIDE_TYP = list; }
	public void setList_OPR_RSLT_TYP(List list) { l_OPR_RSLT_TYP = list; }
	public void setList_ITEM_FIXED_LT(List list) { l_ITEM_FIXED_LT = list; }
	public void setList_ITEM_PROP_LT(List list) { l_ITEM_PROP_LT = list; }
	public void setList_ITEM_PROP_LOT_SIZE(List list) { l_ITEM_PROP_LOT_SIZE = list; }
	public void setList_ITEM_ISSUE_LT(List list) { l_ITEM_ISSUE_LT = list; }
	public void setList_ITEM_SAFETY_LT(List list) { l_ITEM_SAFETY_LT = list; }
	public void setList_UNIT_QTY_TYP(List list) { l_UNIT_QTY_TYP = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_FIXED_LT(List list) { l_FIXED_LT = list; }
	public void setList_PROP_LT(List list) { l_PROP_LT = list; }
	public void setList_SAFETY_LT(List list) { l_SAFETY_LT = list; }
	public void setList_PROP_LOT_SIZE(List list) { l_PROP_LOT_SIZE = list; }
	public void setList_SPOIL(List list) { l_SPOIL = list; }
	public void setList_OUTSIDE_TYP(List list) { l_OUTSIDE_TYP = list; }
	public void setList_ACPT_INSPC_TYP(List list) { l_ACPT_INSPC_TYP = list; }
	public void setList_STANDARD_COST(List list) { l_STANDARD_COST = list; }
	public void setList_UNIT_QTY(List list) { l_UNIT_QTY = list; }
	public void setList_WORK_TIME(List list) { l_WORK_TIME = list; }
	public void setList_WS_NAME(List list) { l_WS_NAME = list; }
	public void setList_VEND_NAME(List list) { l_VEND_NAME = list; }
	public void setList_h_Sub2_MODIFY_COUNT(List list) { l_h_Sub2_MODIFY_COUNT = list; }
	public void setList_Sub2_ITEM_NAME(List list) { l_Sub2_ITEM_NAME = list; }
	public void setList_Sub2_STOCK_UNIT(List list) { l_Sub2_STOCK_UNIT = list; }
	public void setList_Sub2_WS_NAME(List list) { l_Sub2_WS_NAME = list; }
	public void setList_Sub2_VEND_NAME(List list) { l_Sub2_VEND_NAME = list; }
	public void setList_PS_UNIT_DENOMINATOR(List list) { l_PS_UNIT_DENOMINATOR = list; }
	public void setList_PS_UNIT_NUMERATOR(List list) { l_PS_UNIT_NUMERATOR = list; }
	public void setList_PARENT_ITEM_CD(List list) { l_PARENT_ITEM_CD = list; }
	public void setList_COMP_ITEM_CD(List list) { l_COMP_ITEM_CD = list; }
	public void setList_SUM_FIXED_LT(List list) { l_SUM_FIXED_LT = list; }
	public void setList_SUM_PROP_LT(List list) { l_SUM_PROP_LT = list; }
	public void setList_BY_PRODUCT_CD(List list) { l_BY_PRODUCT_CD = list; }
	public void setList_BUSINESS_OPR_DATE(List list) { l_BUSINESS_OPR_DATE = list; }
	public void setList_PARAM_RESULT_DATA(List list) { l_PARAM_RESULT_DATA = list; }
	public void setList_PARAM_INPUT_DATA(List list) { l_PARAM_INPUT_DATA = list; }
	public void setList_Lower_MANHOUR_TYP(List list) { l_Lower_MANHOUR_TYP = list; }

	public int setL2L_Target_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Target_ITEM_CD == null) {
			l_Target_ITEM_CD = new ArrayList();
		} else {
			l_Target_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Target_ITEM_CD.add(((AA0180010Struct) list.get(i)).getTarget_ITEM_CD());
		}
		return size;
	}
	public int setL2L_DEVELOP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEVELOP_TYP == null) {
			l_DEVELOP_TYP = new ArrayList();
		} else {
			l_DEVELOP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEVELOP_TYP.add(((AA0180010Struct) list.get(i)).getDEVELOP_TYP());
		}
		return size;
	}
	public int setL2L_InitLevel(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_InitLevel == null) {
			l_InitLevel = new ArrayList();
		} else {
			l_InitLevel.clear();
		}
		for (int i = 0; i < size; i++) {
			l_InitLevel.add(((AA0180010Struct) list.get(i)).getInitLevel());
		}
		return size;
	}
	public int setL2L_id(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_id == null) {
			l_id = new ArrayList();
		} else {
			l_id.clear();
		}
		for (int i = 0; i < size; i++) {
			l_id.add(((AA0180010Struct) list.get(i)).getid());
		}
		return size;
	}
	public int setL2L_lvl(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_lvl == null) {
			l_lvl = new ArrayList();
		} else {
			l_lvl.clear();
		}
		for (int i = 0; i < size; i++) {
			l_lvl.add(((AA0180010Struct) list.get(i)).getlvl());
		}
		return size;
	}
	public int setL2L_parent(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_parent == null) {
			l_parent = new ArrayList();
		} else {
			l_parent.clear();
		}
		for (int i = 0; i < size; i++) {
			l_parent.add(((AA0180010Struct) list.get(i)).getparent());
		}
		return size;
	}
	public int setL2L_label(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_label == null) {
			l_label = new ArrayList();
		} else {
			l_label.clear();
		}
		for (int i = 0; i < size; i++) {
			l_label.add(((AA0180010Struct) list.get(i)).getlabel());
		}
		return size;
	}
	public int setL2L_ctx(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ctx == null) {
			l_ctx = new ArrayList();
		} else {
			l_ctx.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ctx.add(((AA0180010Struct) list.get(i)).getctx());
		}
		return size;
	}
	public int setL2L_maxid(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_maxid == null) {
			l_maxid = new ArrayList();
		} else {
			l_maxid.clear();
		}
		for (int i = 0; i < size; i++) {
			l_maxid.add(((AA0180010Struct) list.get(i)).getmaxid());
		}
		return size;
	}
	public int setL2L_TargetDate(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TargetDate == null) {
			l_TargetDate = new ArrayList();
		} else {
			l_TargetDate.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TargetDate.add(((AA0180010Struct) list.get(i)).getTargetDate());
		}
		return size;
	}
	public int setL2L_h_Target_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_Target_ITEM_CD == null) {
			l_h_Target_ITEM_CD = new ArrayList();
		} else {
			l_h_Target_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_Target_ITEM_CD.add(((AA0180010Struct) list.get(i)).geth_Target_ITEM_CD());
		}
		return size;
	}
	public int setL2L_h_TargetDate(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_TargetDate == null) {
			l_h_TargetDate = new ArrayList();
		} else {
			l_h_TargetDate.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_TargetDate.add(((AA0180010Struct) list.get(i)).geth_TargetDate());
		}
		return size;
	}
	public int setL2L_h_DEVELOP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_DEVELOP_TYP == null) {
			l_h_DEVELOP_TYP = new ArrayList();
		} else {
			l_h_DEVELOP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_DEVELOP_TYP.add(((AA0180010Struct) list.get(i)).geth_DEVELOP_TYP());
		}
		return size;
	}
	public int setL2L_h_InitLevel(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_InitLevel == null) {
			l_h_InitLevel = new ArrayList();
		} else {
			l_h_InitLevel.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_InitLevel.add(((AA0180010Struct) list.get(i)).geth_InitLevel());
		}
		return size;
	}
	public int setL2L_DEVELOP_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEVELOP_TYP_name == null) {
			l_DEVELOP_TYP_name = new ArrayList();
		} else {
			l_DEVELOP_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEVELOP_TYP_name.add(((AA0180010Struct) list.get(i)).getDEVELOP_TYP_name());
		}
		return size;
	}
	public int setL2L_DEVELOP_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEVELOP_TYP_val == null) {
			l_DEVELOP_TYP_val = new ArrayList();
		} else {
			l_DEVELOP_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEVELOP_TYP_val.add(((AA0180010Struct) list.get(i)).getDEVELOP_TYP_val());
		}
		return size;
	}
	public int setL2L_h_ProcTyp(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ProcTyp == null) {
			l_h_ProcTyp = new ArrayList();
		} else {
			l_h_ProcTyp.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ProcTyp.add(((AA0180010Struct) list.get(i)).geth_ProcTyp());
		}
		return size;
	}
	public int setL2L_h_MaxLevel(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_MaxLevel == null) {
			l_h_MaxLevel = new ArrayList();
		} else {
			l_h_MaxLevel.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_MaxLevel.add(((AA0180010Struct) list.get(i)).geth_MaxLevel());
		}
		return size;
	}
	public int setL2L_DET_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DET_TYP == null) {
			l_DET_TYP = new ArrayList();
		} else {
			l_DET_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DET_TYP.add(((AA0180010Struct) list.get(i)).getDET_TYP());
		}
		return size;
	}
	public int setL2L_Sub2_OUTSIDE_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub2_OUTSIDE_TYP_name == null) {
			l_Sub2_OUTSIDE_TYP_name = new ArrayList();
		} else {
			l_Sub2_OUTSIDE_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub2_OUTSIDE_TYP_name.add(((AA0180010Struct) list.get(i)).getSub2_OUTSIDE_TYP_name());
		}
		return size;
	}
	public int setL2L_Sub2_OUTSIDE_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub2_OUTSIDE_TYP_val == null) {
			l_Sub2_OUTSIDE_TYP_val = new ArrayList();
		} else {
			l_Sub2_OUTSIDE_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub2_OUTSIDE_TYP_val.add(((AA0180010Struct) list.get(i)).getSub2_OUTSIDE_TYP_val());
		}
		return size;
	}
	public int setL2L_Sub2_ACPT_INSPC_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub2_ACPT_INSPC_TYP_name == null) {
			l_Sub2_ACPT_INSPC_TYP_name = new ArrayList();
		} else {
			l_Sub2_ACPT_INSPC_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub2_ACPT_INSPC_TYP_name.add(((AA0180010Struct) list.get(i)).getSub2_ACPT_INSPC_TYP_name());
		}
		return size;
	}
	public int setL2L_Sub2_ACPT_INSPC_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub2_ACPT_INSPC_TYP_val == null) {
			l_Sub2_ACPT_INSPC_TYP_val = new ArrayList();
		} else {
			l_Sub2_ACPT_INSPC_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub2_ACPT_INSPC_TYP_val.add(((AA0180010Struct) list.get(i)).getSub2_ACPT_INSPC_TYP_val());
		}
		return size;
	}
	public int setL2L_h_Sub1Parent_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_Sub1Parent_ITEM_CD == null) {
			l_h_Sub1Parent_ITEM_CD = new ArrayList();
		} else {
			l_h_Sub1Parent_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_Sub1Parent_ITEM_CD.add(((AA0180010Struct) list.get(i)).geth_Sub1Parent_ITEM_CD());
		}
		return size;
	}
	public int setL2L_h_Sub1Comp_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_Sub1Comp_ITEM_CD == null) {
			l_h_Sub1Comp_ITEM_CD = new ArrayList();
		} else {
			l_h_Sub1Comp_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_Sub1Comp_ITEM_CD.add(((AA0180010Struct) list.get(i)).geth_Sub1Comp_ITEM_CD());
		}
		return size;
	}
	public int setL2L_h_Sub1_PS_EDITION(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_Sub1_PS_EDITION == null) {
			l_h_Sub1_PS_EDITION = new ArrayList();
		} else {
			l_h_Sub1_PS_EDITION.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_Sub1_PS_EDITION.add(((AA0180010Struct) list.get(i)).geth_Sub1_PS_EDITION());
		}
		return size;
	}
	public int setL2L_Sub1_CONS_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_CONS_TYP_name == null) {
			l_Sub1_CONS_TYP_name = new ArrayList();
		} else {
			l_Sub1_CONS_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_CONS_TYP_name.add(((AA0180010Struct) list.get(i)).getSub1_CONS_TYP_name());
		}
		return size;
	}
	public int setL2L_Sub1_CONS_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_CONS_TYP_val == null) {
			l_Sub1_CONS_TYP_val = new ArrayList();
		} else {
			l_Sub1_CONS_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_CONS_TYP_val.add(((AA0180010Struct) list.get(i)).getSub1_CONS_TYP_val());
		}
		return size;
	}
	public int setL2L_c_Sub1_PS_LT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_Sub1_PS_LT_FLG == null) {
			l_c_Sub1_PS_LT_FLG = new ArrayList();
		} else {
			l_c_Sub1_PS_LT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_Sub1_PS_LT_FLG.add(((AA0180010Struct) list.get(i)).getc_Sub1_PS_LT_FLG());
		}
		return size;
	}
	public int setL2L_Sub1_COST_UP_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_COST_UP_TYP_name == null) {
			l_Sub1_COST_UP_TYP_name = new ArrayList();
		} else {
			l_Sub1_COST_UP_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_COST_UP_TYP_name.add(((AA0180010Struct) list.get(i)).getSub1_COST_UP_TYP_name());
		}
		return size;
	}
	public int setL2L_Sub1_COST_UP_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_COST_UP_TYP_val == null) {
			l_Sub1_COST_UP_TYP_val = new ArrayList();
		} else {
			l_Sub1_COST_UP_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_COST_UP_TYP_val.add(((AA0180010Struct) list.get(i)).getSub1_COST_UP_TYP_val());
		}
		return size;
	}
	public int setL2L_Sub1_MRP_EXP_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_MRP_EXP_TYP_name == null) {
			l_Sub1_MRP_EXP_TYP_name = new ArrayList();
		} else {
			l_Sub1_MRP_EXP_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_MRP_EXP_TYP_name.add(((AA0180010Struct) list.get(i)).getSub1_MRP_EXP_TYP_name());
		}
		return size;
	}
	public int setL2L_Sub1_MRP_EXP_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_MRP_EXP_TYP_val == null) {
			l_Sub1_MRP_EXP_TYP_val = new ArrayList();
		} else {
			l_Sub1_MRP_EXP_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_MRP_EXP_TYP_val.add(((AA0180010Struct) list.get(i)).getSub1_MRP_EXP_TYP_val());
		}
		return size;
	}
	public int setL2L_h_Target_ITEM_CD2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_Target_ITEM_CD2 == null) {
			l_h_Target_ITEM_CD2 = new ArrayList();
		} else {
			l_h_Target_ITEM_CD2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_Target_ITEM_CD2.add(((AA0180010Struct) list.get(i)).geth_Target_ITEM_CD2());
		}
		return size;
	}
	public int setL2L_h_TargetDate2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_TargetDate2 == null) {
			l_h_TargetDate2 = new ArrayList();
		} else {
			l_h_TargetDate2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_TargetDate2.add(((AA0180010Struct) list.get(i)).geth_TargetDate2());
		}
		return size;
	}
	public int setL2L_h_DEVELOP_TYP2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_DEVELOP_TYP2 == null) {
			l_h_DEVELOP_TYP2 = new ArrayList();
		} else {
			l_h_DEVELOP_TYP2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_DEVELOP_TYP2.add(((AA0180010Struct) list.get(i)).geth_DEVELOP_TYP2());
		}
		return size;
	}
	public int setL2L_h_InitLevel2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_InitLevel2 == null) {
			l_h_InitLevel2 = new ArrayList();
		} else {
			l_h_InitLevel2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_InitLevel2.add(((AA0180010Struct) list.get(i)).geth_InitLevel2());
		}
		return size;
	}
	public int setL2L_h_Sub2_PROC_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_Sub2_PROC_NO == null) {
			l_h_Sub2_PROC_NO = new ArrayList();
		} else {
			l_h_Sub2_PROC_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_Sub2_PROC_NO.add(((AA0180010Struct) list.get(i)).geth_Sub2_PROC_NO());
		}
		return size;
	}
	public int setL2L_FIRST_PROC(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FIRST_PROC == null) {
			l_FIRST_PROC = new ArrayList();
		} else {
			l_FIRST_PROC.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FIRST_PROC.add(((AA0180010Struct) list.get(i)).getFIRST_PROC());
		}
		return size;
	}
	public int setL2L_h_Sub1_PS_UNIT_NUMERATOR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_Sub1_PS_UNIT_NUMERATOR == null) {
			l_h_Sub1_PS_UNIT_NUMERATOR = new ArrayList();
		} else {
			l_h_Sub1_PS_UNIT_NUMERATOR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_Sub1_PS_UNIT_NUMERATOR.add(((AA0180010Struct) list.get(i)).geth_Sub1_PS_UNIT_NUMERATOR());
		}
		return size;
	}
	public int setL2L_h_Sub1_PS_UNIT_DENOMINATOR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_Sub1_PS_UNIT_DENOMINATOR == null) {
			l_h_Sub1_PS_UNIT_DENOMINATOR = new ArrayList();
		} else {
			l_h_Sub1_PS_UNIT_DENOMINATOR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_Sub1_PS_UNIT_DENOMINATOR.add(((AA0180010Struct) list.get(i)).geth_Sub1_PS_UNIT_DENOMINATOR());
		}
		return size;
	}
	public int setL2L_AA0180010tree1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_AA0180010tree1 == null) {
			l_AA0180010tree1 = new ArrayList();
		} else {
			l_AA0180010tree1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_AA0180010tree1.add(((AA0180010Struct) list.get(i)).getAA0180010tree1());
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
			l_sub2_STOCK_UNIT_1.add(((AA0180010Struct) list.get(i)).getsub2_STOCK_UNIT_1());
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
			l_sub2_STOCK_UNIT_2.add(((AA0180010Struct) list.get(i)).getsub2_STOCK_UNIT_2());
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
			l_sub2_STOCK_UNIT_3.add(((AA0180010Struct) list.get(i)).getsub2_STOCK_UNIT_3());
		}
		return size;
	}
	public int setL2L_Det2FIXED_LT_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det2FIXED_LT_UNIT == null) {
			l_Det2FIXED_LT_UNIT = new ArrayList();
		} else {
			l_Det2FIXED_LT_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det2FIXED_LT_UNIT.add(((AA0180010Struct) list.get(i)).getDet2FIXED_LT_UNIT());
		}
		return size;
	}
	public int setL2L_Det2PROP_LT_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det2PROP_LT_UNIT == null) {
			l_Det2PROP_LT_UNIT = new ArrayList();
		} else {
			l_Det2PROP_LT_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det2PROP_LT_UNIT.add(((AA0180010Struct) list.get(i)).getDet2PROP_LT_UNIT());
		}
		return size;
	}
	public int setL2L_Det2PROP_LOT_SIZE_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det2PROP_LOT_SIZE_UNIT == null) {
			l_Det2PROP_LOT_SIZE_UNIT = new ArrayList();
		} else {
			l_Det2PROP_LOT_SIZE_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det2PROP_LOT_SIZE_UNIT.add(((AA0180010Struct) list.get(i)).getDet2PROP_LOT_SIZE_UNIT());
		}
		return size;
	}
	public int setL2L_Det2SAFETY_LT_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det2SAFETY_LT_UNIT == null) {
			l_Det2SAFETY_LT_UNIT = new ArrayList();
		} else {
			l_Det2SAFETY_LT_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det2SAFETY_LT_UNIT.add(((AA0180010Struct) list.get(i)).getDet2SAFETY_LT_UNIT());
		}
		return size;
	}
	public int setL2L_MANHOUR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MANHOUR_TYP == null) {
			l_MANHOUR_TYP = new ArrayList();
		} else {
			l_MANHOUR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MANHOUR_TYP.add(((AA0180010Struct) list.get(i)).getMANHOUR_TYP());
		}
		return size;
	}
	public int setL2L_Lower_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Lower_ITEM_NAME == null) {
			l_Lower_ITEM_NAME = new ArrayList();
		} else {
			l_Lower_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Lower_ITEM_NAME.add(((AA0180010Struct) list.get(i)).getLower_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_Lower_STOCK_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Lower_STOCK_UNIT == null) {
			l_Lower_STOCK_UNIT = new ArrayList();
		} else {
			l_Lower_STOCK_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Lower_STOCK_UNIT.add(((AA0180010Struct) list.get(i)).getLower_STOCK_UNIT());
		}
		return size;
	}
	public int setL2L_Lower_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Lower_ITEM_CD == null) {
			l_Lower_ITEM_CD = new ArrayList();
		} else {
			l_Lower_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Lower_ITEM_CD.add(((AA0180010Struct) list.get(i)).getLower_ITEM_CD());
		}
		return size;
	}
	public int setL2L_Upper_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Upper_ITEM_NAME == null) {
			l_Upper_ITEM_NAME = new ArrayList();
		} else {
			l_Upper_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Upper_ITEM_NAME.add(((AA0180010Struct) list.get(i)).getUpper_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_Upper_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Upper_ITEM_CD == null) {
			l_Upper_ITEM_CD = new ArrayList();
		} else {
			l_Upper_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Upper_ITEM_CD.add(((AA0180010Struct) list.get(i)).getUpper_ITEM_CD());
		}
		return size;
	}
	public int setL2L_DetParent_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DetParent_ITEM_CD == null) {
			l_DetParent_ITEM_CD = new ArrayList();
		} else {
			l_DetParent_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DetParent_ITEM_CD.add(((AA0180010Struct) list.get(i)).getDetParent_ITEM_CD());
		}
		return size;
	}
	public int setL2L_DetParent_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DetParent_ITEM_NAME == null) {
			l_DetParent_ITEM_NAME = new ArrayList();
		} else {
			l_DetParent_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DetParent_ITEM_NAME.add(((AA0180010Struct) list.get(i)).getDetParent_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_DetParent_MRP_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DetParent_MRP_ODR_TYP == null) {
			l_DetParent_MRP_ODR_TYP = new ArrayList();
		} else {
			l_DetParent_MRP_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DetParent_MRP_ODR_TYP.add(((AA0180010Struct) list.get(i)).getDetParent_MRP_ODR_TYP());
		}
		return size;
	}
	public int setL2L_DetParent_OUTSIDE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DetParent_OUTSIDE_TYP == null) {
			l_DetParent_OUTSIDE_TYP = new ArrayList();
		} else {
			l_DetParent_OUTSIDE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DetParent_OUTSIDE_TYP.add(((AA0180010Struct) list.get(i)).getDetParent_OUTSIDE_TYP());
		}
		return size;
	}
	public int setL2L_DetComp_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DetComp_ITEM_CD == null) {
			l_DetComp_ITEM_CD = new ArrayList();
		} else {
			l_DetComp_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DetComp_ITEM_CD.add(((AA0180010Struct) list.get(i)).getDetComp_ITEM_CD());
		}
		return size;
	}
	public int setL2L_DetComp_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DetComp_ITEM_NAME == null) {
			l_DetComp_ITEM_NAME = new ArrayList();
		} else {
			l_DetComp_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DetComp_ITEM_NAME.add(((AA0180010Struct) list.get(i)).getDetComp_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_DetComp_MRP_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DetComp_MRP_ODR_TYP == null) {
			l_DetComp_MRP_ODR_TYP = new ArrayList();
		} else {
			l_DetComp_MRP_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DetComp_MRP_ODR_TYP.add(((AA0180010Struct) list.get(i)).getDetComp_MRP_ODR_TYP());
		}
		return size;
	}
	public int setL2L_DetComp_OUTSIDE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DetComp_OUTSIDE_TYP == null) {
			l_DetComp_OUTSIDE_TYP = new ArrayList();
		} else {
			l_DetComp_OUTSIDE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DetComp_OUTSIDE_TYP.add(((AA0180010Struct) list.get(i)).getDetComp_OUTSIDE_TYP());
		}
		return size;
	}
	public int setL2L_Det_MANHOUR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det_MANHOUR_TYP == null) {
			l_Det_MANHOUR_TYP = new ArrayList();
		} else {
			l_Det_MANHOUR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det_MANHOUR_TYP.add(((AA0180010Struct) list.get(i)).getDet_MANHOUR_TYP());
		}
		return size;
	}
	public int setL2L_Det_PS_EDITION(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det_PS_EDITION == null) {
			l_Det_PS_EDITION = new ArrayList();
		} else {
			l_Det_PS_EDITION.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det_PS_EDITION.add(((AA0180010Struct) list.get(i)).getDet_PS_EDITION());
		}
		return size;
	}
	public int setL2L_Det_PS_UNIT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det_PS_UNIT_QTY == null) {
			l_Det_PS_UNIT_QTY = new ArrayList();
		} else {
			l_Det_PS_UNIT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det_PS_UNIT_QTY.add(((AA0180010Struct) list.get(i)).getDet_PS_UNIT_QTY());
		}
		return size;
	}
	public int setL2L_Det_STOCK_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det_STOCK_UNIT == null) {
			l_Det_STOCK_UNIT = new ArrayList();
		} else {
			l_Det_STOCK_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det_STOCK_UNIT.add(((AA0180010Struct) list.get(i)).getDet_STOCK_UNIT());
		}
		return size;
	}
	public int setL2L_Det_EFF_PHASE_IN_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det_EFF_PHASE_IN_DATE == null) {
			l_Det_EFF_PHASE_IN_DATE = new ArrayList();
		} else {
			l_Det_EFF_PHASE_IN_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det_EFF_PHASE_IN_DATE.add(((AA0180010Struct) list.get(i)).getDet_EFF_PHASE_IN_DATE());
		}
		return size;
	}
	public int setL2L_Det_EFF_PHASE_OUT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det_EFF_PHASE_OUT_DATE == null) {
			l_Det_EFF_PHASE_OUT_DATE = new ArrayList();
		} else {
			l_Det_EFF_PHASE_OUT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det_EFF_PHASE_OUT_DATE.add(((AA0180010Struct) list.get(i)).getDet_EFF_PHASE_OUT_DATE());
		}
		return size;
	}
	public int setL2L_Det_PS_SPOIL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det_PS_SPOIL == null) {
			l_Det_PS_SPOIL = new ArrayList();
		} else {
			l_Det_PS_SPOIL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det_PS_SPOIL.add(((AA0180010Struct) list.get(i)).getDet_PS_SPOIL());
		}
		return size;
	}
	public int setL2L_Det_CONS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det_CONS_TYP == null) {
			l_Det_CONS_TYP = new ArrayList();
		} else {
			l_Det_CONS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det_CONS_TYP.add(((AA0180010Struct) list.get(i)).getDet_CONS_TYP());
		}
		return size;
	}
	public int setL2L_Det_PS_LT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det_PS_LT_FLG == null) {
			l_Det_PS_LT_FLG = new ArrayList();
		} else {
			l_Det_PS_LT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det_PS_LT_FLG.add(((AA0180010Struct) list.get(i)).getDet_PS_LT_FLG());
		}
		return size;
	}
	public int setL2L_Det_PS_FIXED_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det_PS_FIXED_LT == null) {
			l_Det_PS_FIXED_LT = new ArrayList();
		} else {
			l_Det_PS_FIXED_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det_PS_FIXED_LT.add(((AA0180010Struct) list.get(i)).getDet_PS_FIXED_LT());
		}
		return size;
	}
	public int setL2L_Det_PS_PROP_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det_PS_PROP_LT == null) {
			l_Det_PS_PROP_LT = new ArrayList();
		} else {
			l_Det_PS_PROP_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det_PS_PROP_LT.add(((AA0180010Struct) list.get(i)).getDet_PS_PROP_LT());
		}
		return size;
	}
	public int setL2L_Det_PS_PROP_LOT_SIZE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det_PS_PROP_LOT_SIZE == null) {
			l_Det_PS_PROP_LOT_SIZE = new ArrayList();
		} else {
			l_Det_PS_PROP_LOT_SIZE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det_PS_PROP_LOT_SIZE.add(((AA0180010Struct) list.get(i)).getDet_PS_PROP_LOT_SIZE());
		}
		return size;
	}
	public int setL2L_Det_PS_REF_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det_PS_REF_NO == null) {
			l_Det_PS_REF_NO = new ArrayList();
		} else {
			l_Det_PS_REF_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det_PS_REF_NO.add(((AA0180010Struct) list.get(i)).getDet_PS_REF_NO());
		}
		return size;
	}
	public int setL2L_Det_COST_UP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det_COST_UP_TYP == null) {
			l_Det_COST_UP_TYP = new ArrayList();
		} else {
			l_Det_COST_UP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det_COST_UP_TYP.add(((AA0180010Struct) list.get(i)).getDet_COST_UP_TYP());
		}
		return size;
	}
	public int setL2L_Det_MRP_EXP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det_MRP_EXP_TYP == null) {
			l_Det_MRP_EXP_TYP = new ArrayList();
		} else {
			l_Det_MRP_EXP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det_MRP_EXP_TYP.add(((AA0180010Struct) list.get(i)).getDet_MRP_EXP_TYP());
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
			l_PS_EDITION.add(((AA0180010Struct) list.get(i)).getPS_EDITION());
		}
		return size;
	}
	public int setL2L_Sub1Parent_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1Parent_ITEM_NAME == null) {
			l_Sub1Parent_ITEM_NAME = new ArrayList();
		} else {
			l_Sub1Parent_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1Parent_ITEM_NAME.add(((AA0180010Struct) list.get(i)).getSub1Parent_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_Sub1Comp_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1Comp_ITEM_NAME == null) {
			l_Sub1Comp_ITEM_NAME = new ArrayList();
		} else {
			l_Sub1Comp_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1Comp_ITEM_NAME.add(((AA0180010Struct) list.get(i)).getSub1Comp_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_Sub1_PS_UNIT_NUMERATOR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_PS_UNIT_NUMERATOR == null) {
			l_Sub1_PS_UNIT_NUMERATOR = new ArrayList();
		} else {
			l_Sub1_PS_UNIT_NUMERATOR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_PS_UNIT_NUMERATOR.add(((AA0180010Struct) list.get(i)).getSub1_PS_UNIT_NUMERATOR());
		}
		return size;
	}
	public int setL2L_Sub1_PS_UNIT_DENOMINATOR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_PS_UNIT_DENOMINATOR == null) {
			l_Sub1_PS_UNIT_DENOMINATOR = new ArrayList();
		} else {
			l_Sub1_PS_UNIT_DENOMINATOR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_PS_UNIT_DENOMINATOR.add(((AA0180010Struct) list.get(i)).getSub1_PS_UNIT_DENOMINATOR());
		}
		return size;
	}
	public int setL2L_Sub1_STOCK_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_STOCK_UNIT == null) {
			l_Sub1_STOCK_UNIT = new ArrayList();
		} else {
			l_Sub1_STOCK_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_STOCK_UNIT.add(((AA0180010Struct) list.get(i)).getSub1_STOCK_UNIT());
		}
		return size;
	}
	public int setL2L_Sub1Comp_STOCK_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1Comp_STOCK_UNIT == null) {
			l_Sub1Comp_STOCK_UNIT = new ArrayList();
		} else {
			l_Sub1Comp_STOCK_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1Comp_STOCK_UNIT.add(((AA0180010Struct) list.get(i)).getSub1Comp_STOCK_UNIT());
		}
		return size;
	}
	public int setL2L_Sub1_EFF_PHASE_IN_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_EFF_PHASE_IN_DATE == null) {
			l_Sub1_EFF_PHASE_IN_DATE = new ArrayList();
		} else {
			l_Sub1_EFF_PHASE_IN_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_EFF_PHASE_IN_DATE.add(((AA0180010Struct) list.get(i)).getSub1_EFF_PHASE_IN_DATE());
		}
		return size;
	}
	public int setL2L_Sub1_EFF_PHASE_OUT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_EFF_PHASE_OUT_DATE == null) {
			l_Sub1_EFF_PHASE_OUT_DATE = new ArrayList();
		} else {
			l_Sub1_EFF_PHASE_OUT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_EFF_PHASE_OUT_DATE.add(((AA0180010Struct) list.get(i)).getSub1_EFF_PHASE_OUT_DATE());
		}
		return size;
	}
	public int setL2L_Sub1_PS_SPOIL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_PS_SPOIL == null) {
			l_Sub1_PS_SPOIL = new ArrayList();
		} else {
			l_Sub1_PS_SPOIL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_PS_SPOIL.add(((AA0180010Struct) list.get(i)).getSub1_PS_SPOIL());
		}
		return size;
	}
	public int setL2L_Sub1_CONS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_CONS_TYP == null) {
			l_Sub1_CONS_TYP = new ArrayList();
		} else {
			l_Sub1_CONS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_CONS_TYP.add(((AA0180010Struct) list.get(i)).getSub1_CONS_TYP());
		}
		return size;
	}
	public int setL2L_h_Sub1_PS_LT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_Sub1_PS_LT_FLG == null) {
			l_h_Sub1_PS_LT_FLG = new ArrayList();
		} else {
			l_h_Sub1_PS_LT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_Sub1_PS_LT_FLG.add(((AA0180010Struct) list.get(i)).geth_Sub1_PS_LT_FLG());
		}
		return size;
	}
	public int setL2L_Sub1_PS_FIXED_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_PS_FIXED_LT == null) {
			l_Sub1_PS_FIXED_LT = new ArrayList();
		} else {
			l_Sub1_PS_FIXED_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_PS_FIXED_LT.add(((AA0180010Struct) list.get(i)).getSub1_PS_FIXED_LT());
		}
		return size;
	}
	public int setL2L_Sub1_PS_PROP_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_PS_PROP_LT == null) {
			l_Sub1_PS_PROP_LT = new ArrayList();
		} else {
			l_Sub1_PS_PROP_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_PS_PROP_LT.add(((AA0180010Struct) list.get(i)).getSub1_PS_PROP_LT());
		}
		return size;
	}
	public int setL2L_Sub1_PS_PROP_LOT_SIZE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_PS_PROP_LOT_SIZE == null) {
			l_Sub1_PS_PROP_LOT_SIZE = new ArrayList();
		} else {
			l_Sub1_PS_PROP_LOT_SIZE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_PS_PROP_LOT_SIZE.add(((AA0180010Struct) list.get(i)).getSub1_PS_PROP_LOT_SIZE());
		}
		return size;
	}
	public int setL2L_Sub1_PS_REF_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_PS_REF_NO == null) {
			l_Sub1_PS_REF_NO = new ArrayList();
		} else {
			l_Sub1_PS_REF_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_PS_REF_NO.add(((AA0180010Struct) list.get(i)).getSub1_PS_REF_NO());
		}
		return size;
	}
	public int setL2L_Sub1_COST_UP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_COST_UP_TYP == null) {
			l_Sub1_COST_UP_TYP = new ArrayList();
		} else {
			l_Sub1_COST_UP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_COST_UP_TYP.add(((AA0180010Struct) list.get(i)).getSub1_COST_UP_TYP());
		}
		return size;
	}
	public int setL2L_Sub1_MRP_EXP_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_MRP_EXP_TYP == null) {
			l_Sub1_MRP_EXP_TYP = new ArrayList();
		} else {
			l_Sub1_MRP_EXP_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_MRP_EXP_TYP.add(((AA0180010Struct) list.get(i)).getSub1_MRP_EXP_TYP());
		}
		return size;
	}
	public int setL2L_h_Sub1_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_Sub1_MODIFY_COUNT == null) {
			l_h_Sub1_MODIFY_COUNT = new ArrayList();
		} else {
			l_h_Sub1_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_Sub1_MODIFY_COUNT.add(((AA0180010Struct) list.get(i)).geth_Sub1_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_Sub1Parent_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1Parent_ITEM_CD == null) {
			l_Sub1Parent_ITEM_CD = new ArrayList();
		} else {
			l_Sub1Parent_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1Parent_ITEM_CD.add(((AA0180010Struct) list.get(i)).getSub1Parent_ITEM_CD());
		}
		return size;
	}
	public int setL2L_Sub1Comp_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1Comp_ITEM_CD == null) {
			l_Sub1Comp_ITEM_CD = new ArrayList();
		} else {
			l_Sub1Comp_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1Comp_ITEM_CD.add(((AA0180010Struct) list.get(i)).getSub1Comp_ITEM_CD());
		}
		return size;
	}
	public int setL2L_Sub1_PS_EDITION(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub1_PS_EDITION == null) {
			l_Sub1_PS_EDITION = new ArrayList();
		} else {
			l_Sub1_PS_EDITION.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub1_PS_EDITION.add(((AA0180010Struct) list.get(i)).getSub1_PS_EDITION());
		}
		return size;
	}
	public int setL2L_KBN1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_KBN1 == null) {
			l_KBN1 = new ArrayList();
		} else {
			l_KBN1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_KBN1.add(((AA0180010Struct) list.get(i)).getKBN1());
		}
		return size;
	}
	public int setL2L_KBN2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_KBN2 == null) {
			l_KBN2 = new ArrayList();
		} else {
			l_KBN2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_KBN2.add(((AA0180010Struct) list.get(i)).getKBN2());
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
			l_PLANT_CD.add(((AA0180010Struct) list.get(i)).getPLANT_CD());
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
			l_PROC_CD.add(((AA0180010Struct) list.get(i)).getPROC_CD());
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
			l_PROC_NO.add(((AA0180010Struct) list.get(i)).getPROC_NO());
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
			l_PROC_NAME.add(((AA0180010Struct) list.get(i)).getPROC_NAME());
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
			l_WS_CD.add(((AA0180010Struct) list.get(i)).getWS_CD());
		}
		return size;
	}
	public int setL2L_MODIFY_CNT_PROC(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MODIFY_CNT_PROC == null) {
			l_MODIFY_CNT_PROC = new ArrayList();
		} else {
			l_MODIFY_CNT_PROC.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MODIFY_CNT_PROC.add(((AA0180010Struct) list.get(i)).getMODIFY_CNT_PROC());
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
			l_EFF_PHASE_IN_DATE.add(((AA0180010Struct) list.get(i)).getEFF_PHASE_IN_DATE());
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
			l_EFF_PHASE_OUT_DATE.add(((AA0180010Struct) list.get(i)).getEFF_PHASE_OUT_DATE());
		}
		return size;
	}
	public int setL2L_MODIFY_CNT_ISSUE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MODIFY_CNT_ISSUE == null) {
			l_MODIFY_CNT_ISSUE = new ArrayList();
		} else {
			l_MODIFY_CNT_ISSUE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MODIFY_CNT_ISSUE.add(((AA0180010Struct) list.get(i)).getMODIFY_CNT_ISSUE());
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
			l_MODIFY_COUNT.add(((AA0180010Struct) list.get(i)).getMODIFY_COUNT());
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
			l_PS_REF_NO.add(((AA0180010Struct) list.get(i)).getPS_REF_NO());
		}
		return size;
	}
	public int setL2L_FIRST_PROC_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FIRST_PROC_NO == null) {
			l_FIRST_PROC_NO = new ArrayList();
		} else {
			l_FIRST_PROC_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FIRST_PROC_NO.add(((AA0180010Struct) list.get(i)).getFIRST_PROC_NO());
		}
		return size;
	}
	public int setL2L_TargetDate_IN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TargetDate_IN == null) {
			l_TargetDate_IN = new ArrayList();
		} else {
			l_TargetDate_IN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TargetDate_IN.add(((AA0180010Struct) list.get(i)).getTargetDate_IN());
		}
		return size;
	}
	public int setL2L_TargetDate_OUT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TargetDate_OUT == null) {
			l_TargetDate_OUT = new ArrayList();
		} else {
			l_TargetDate_OUT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TargetDate_OUT.add(((AA0180010Struct) list.get(i)).getTargetDate_OUT());
		}
		return size;
	}
	public int setL2L_Det2ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det2ITEM_CD == null) {
			l_Det2ITEM_CD = new ArrayList();
		} else {
			l_Det2ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det2ITEM_CD.add(((AA0180010Struct) list.get(i)).getDet2ITEM_CD());
		}
		return size;
	}
	public int setL2L_Det2PROC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det2PROC_CD == null) {
			l_Det2PROC_CD = new ArrayList();
		} else {
			l_Det2PROC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det2PROC_CD.add(((AA0180010Struct) list.get(i)).getDet2PROC_CD());
		}
		return size;
	}
	public int setL2L_Det2PROC_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det2PROC_NO == null) {
			l_Det2PROC_NO = new ArrayList();
		} else {
			l_Det2PROC_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det2PROC_NO.add(((AA0180010Struct) list.get(i)).getDet2PROC_NO());
		}
		return size;
	}
	public int setL2L_Det2PROC_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det2PROC_NAME == null) {
			l_Det2PROC_NAME = new ArrayList();
		} else {
			l_Det2PROC_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det2PROC_NAME.add(((AA0180010Struct) list.get(i)).getDet2PROC_NAME());
		}
		return size;
	}
	public int setL2L_Det2WS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det2WS_CD == null) {
			l_Det2WS_CD = new ArrayList();
		} else {
			l_Det2WS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det2WS_CD.add(((AA0180010Struct) list.get(i)).getDet2WS_CD());
		}
		return size;
	}
	public int setL2L_Det2COMPANY_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det2COMPANY_CD == null) {
			l_Det2COMPANY_CD = new ArrayList();
		} else {
			l_Det2COMPANY_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det2COMPANY_CD.add(((AA0180010Struct) list.get(i)).getDet2COMPANY_CD());
		}
		return size;
	}
	public int setL2L_Det2VEND_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det2VEND_CD == null) {
			l_Det2VEND_CD = new ArrayList();
		} else {
			l_Det2VEND_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det2VEND_CD.add(((AA0180010Struct) list.get(i)).getDet2VEND_CD());
		}
		return size;
	}
	public int setL2L_Det2FIXED_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det2FIXED_LT == null) {
			l_Det2FIXED_LT = new ArrayList();
		} else {
			l_Det2FIXED_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det2FIXED_LT.add(((AA0180010Struct) list.get(i)).getDet2FIXED_LT());
		}
		return size;
	}
	public int setL2L_Det2PROP_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det2PROP_LT == null) {
			l_Det2PROP_LT = new ArrayList();
		} else {
			l_Det2PROP_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det2PROP_LT.add(((AA0180010Struct) list.get(i)).getDet2PROP_LT());
		}
		return size;
	}
	public int setL2L_Det2SAFETY_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det2SAFETY_LT == null) {
			l_Det2SAFETY_LT = new ArrayList();
		} else {
			l_Det2SAFETY_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det2SAFETY_LT.add(((AA0180010Struct) list.get(i)).getDet2SAFETY_LT());
		}
		return size;
	}
	public int setL2L_Det2PROP_LOT_SIZE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det2PROP_LOT_SIZE == null) {
			l_Det2PROP_LOT_SIZE = new ArrayList();
		} else {
			l_Det2PROP_LOT_SIZE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det2PROP_LOT_SIZE.add(((AA0180010Struct) list.get(i)).getDet2PROP_LOT_SIZE());
		}
		return size;
	}
	public int setL2L_Det2SPOIL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det2SPOIL == null) {
			l_Det2SPOIL = new ArrayList();
		} else {
			l_Det2SPOIL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det2SPOIL.add(((AA0180010Struct) list.get(i)).getDet2SPOIL());
		}
		return size;
	}
	public int setL2L_Det2OUTSIDE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det2OUTSIDE_TYP == null) {
			l_Det2OUTSIDE_TYP = new ArrayList();
		} else {
			l_Det2OUTSIDE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det2OUTSIDE_TYP.add(((AA0180010Struct) list.get(i)).getDet2OUTSIDE_TYP());
		}
		return size;
	}
	public int setL2L_Det2ACPT_INSPC_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det2ACPT_INSPC_TYP == null) {
			l_Det2ACPT_INSPC_TYP = new ArrayList();
		} else {
			l_Det2ACPT_INSPC_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det2ACPT_INSPC_TYP.add(((AA0180010Struct) list.get(i)).getDet2ACPT_INSPC_TYP());
		}
		return size;
	}
	public int setL2L_Det2STANDARD_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det2STANDARD_COST == null) {
			l_Det2STANDARD_COST = new ArrayList();
		} else {
			l_Det2STANDARD_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det2STANDARD_COST.add(((AA0180010Struct) list.get(i)).getDet2STANDARD_COST());
		}
		return size;
	}
	public int setL2L_Det2ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det2ITEM_NAME == null) {
			l_Det2ITEM_NAME = new ArrayList();
		} else {
			l_Det2ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det2ITEM_NAME.add(((AA0180010Struct) list.get(i)).getDet2ITEM_NAME());
		}
		return size;
	}
	public int setL2L_Det2WS_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det2WS_NAME == null) {
			l_Det2WS_NAME = new ArrayList();
		} else {
			l_Det2WS_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det2WS_NAME.add(((AA0180010Struct) list.get(i)).getDet2WS_NAME());
		}
		return size;
	}
	public int setL2L_Det2VEND_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Det2VEND_NAME == null) {
			l_Det2VEND_NAME = new ArrayList();
		} else {
			l_Det2VEND_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Det2VEND_NAME.add(((AA0180010Struct) list.get(i)).getDet2VEND_NAME());
		}
		return size;
	}
	public int setL2L_Sub2_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub2_ITEM_CD == null) {
			l_Sub2_ITEM_CD = new ArrayList();
		} else {
			l_Sub2_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub2_ITEM_CD.add(((AA0180010Struct) list.get(i)).getSub2_ITEM_CD());
		}
		return size;
	}
	public int setL2L_Sub2_PROC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub2_PROC_CD == null) {
			l_Sub2_PROC_CD = new ArrayList();
		} else {
			l_Sub2_PROC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub2_PROC_CD.add(((AA0180010Struct) list.get(i)).getSub2_PROC_CD());
		}
		return size;
	}
	public int setL2L_Sub2_PROC_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub2_PROC_NO == null) {
			l_Sub2_PROC_NO = new ArrayList();
		} else {
			l_Sub2_PROC_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub2_PROC_NO.add(((AA0180010Struct) list.get(i)).getSub2_PROC_NO());
		}
		return size;
	}
	public int setL2L_Sub2_PROC_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub2_PROC_NAME == null) {
			l_Sub2_PROC_NAME = new ArrayList();
		} else {
			l_Sub2_PROC_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub2_PROC_NAME.add(((AA0180010Struct) list.get(i)).getSub2_PROC_NAME());
		}
		return size;
	}
	public int setL2L_Sub2_WS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub2_WS_CD == null) {
			l_Sub2_WS_CD = new ArrayList();
		} else {
			l_Sub2_WS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub2_WS_CD.add(((AA0180010Struct) list.get(i)).getSub2_WS_CD());
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
			l_COMPANY_CD.add(((AA0180010Struct) list.get(i)).getCOMPANY_CD());
		}
		return size;
	}
	public int setL2L_Sub2_VEND_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub2_VEND_CD == null) {
			l_Sub2_VEND_CD = new ArrayList();
		} else {
			l_Sub2_VEND_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub2_VEND_CD.add(((AA0180010Struct) list.get(i)).getSub2_VEND_CD());
		}
		return size;
	}
	public int setL2L_Sub2_FIXED_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub2_FIXED_LT == null) {
			l_Sub2_FIXED_LT = new ArrayList();
		} else {
			l_Sub2_FIXED_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub2_FIXED_LT.add(((AA0180010Struct) list.get(i)).getSub2_FIXED_LT());
		}
		return size;
	}
	public int setL2L_Sub2_PROP_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub2_PROP_LT == null) {
			l_Sub2_PROP_LT = new ArrayList();
		} else {
			l_Sub2_PROP_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub2_PROP_LT.add(((AA0180010Struct) list.get(i)).getSub2_PROP_LT());
		}
		return size;
	}
	public int setL2L_Sub2_SAFETY_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub2_SAFETY_LT == null) {
			l_Sub2_SAFETY_LT = new ArrayList();
		} else {
			l_Sub2_SAFETY_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub2_SAFETY_LT.add(((AA0180010Struct) list.get(i)).getSub2_SAFETY_LT());
		}
		return size;
	}
	public int setL2L_Sub2_PROP_LOT_SIZE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub2_PROP_LOT_SIZE == null) {
			l_Sub2_PROP_LOT_SIZE = new ArrayList();
		} else {
			l_Sub2_PROP_LOT_SIZE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub2_PROP_LOT_SIZE.add(((AA0180010Struct) list.get(i)).getSub2_PROP_LOT_SIZE());
		}
		return size;
	}
	public int setL2L_Sub2_SPOIL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub2_SPOIL == null) {
			l_Sub2_SPOIL = new ArrayList();
		} else {
			l_Sub2_SPOIL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub2_SPOIL.add(((AA0180010Struct) list.get(i)).getSub2_SPOIL());
		}
		return size;
	}
	public int setL2L_Sub2_OUTSIDE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub2_OUTSIDE_TYP == null) {
			l_Sub2_OUTSIDE_TYP = new ArrayList();
		} else {
			l_Sub2_OUTSIDE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub2_OUTSIDE_TYP.add(((AA0180010Struct) list.get(i)).getSub2_OUTSIDE_TYP());
		}
		return size;
	}
	public int setL2L_Sub2_ACPT_INSPC_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub2_ACPT_INSPC_TYP == null) {
			l_Sub2_ACPT_INSPC_TYP = new ArrayList();
		} else {
			l_Sub2_ACPT_INSPC_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub2_ACPT_INSPC_TYP.add(((AA0180010Struct) list.get(i)).getSub2_ACPT_INSPC_TYP());
		}
		return size;
	}
	public int setL2L_Sub2_STANDARD_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub2_STANDARD_COST == null) {
			l_Sub2_STANDARD_COST = new ArrayList();
		} else {
			l_Sub2_STANDARD_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub2_STANDARD_COST.add(((AA0180010Struct) list.get(i)).getSub2_STANDARD_COST());
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
			l_ITEM_CD.add(((AA0180010Struct) list.get(i)).getITEM_CD());
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
			l_ITEM_NAME.add(((AA0180010Struct) list.get(i)).getITEM_NAME());
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
			l_DRAW_CD.add(((AA0180010Struct) list.get(i)).getDRAW_CD());
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
			l_SPEC.add(((AA0180010Struct) list.get(i)).getSPEC());
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
			l_MRP_ODR_TYP.add(((AA0180010Struct) list.get(i)).getMRP_ODR_TYP());
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
			l_ITEM_OUTSIDE_TYP.add(((AA0180010Struct) list.get(i)).getITEM_OUTSIDE_TYP());
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
			l_OPR_RSLT_TYP.add(((AA0180010Struct) list.get(i)).getOPR_RSLT_TYP());
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
			l_ITEM_FIXED_LT.add(((AA0180010Struct) list.get(i)).getITEM_FIXED_LT());
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
			l_ITEM_PROP_LT.add(((AA0180010Struct) list.get(i)).getITEM_PROP_LT());
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
			l_ITEM_PROP_LOT_SIZE.add(((AA0180010Struct) list.get(i)).getITEM_PROP_LOT_SIZE());
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
			l_ITEM_ISSUE_LT.add(((AA0180010Struct) list.get(i)).getITEM_ISSUE_LT());
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
			l_ITEM_SAFETY_LT.add(((AA0180010Struct) list.get(i)).getITEM_SAFETY_LT());
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
			l_UNIT_QTY_TYP.add(((AA0180010Struct) list.get(i)).getUNIT_QTY_TYP());
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
			l_STOCK_UNIT.add(((AA0180010Struct) list.get(i)).getSTOCK_UNIT());
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
			l_VEND_CD.add(((AA0180010Struct) list.get(i)).getVEND_CD());
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
			l_FIXED_LT.add(((AA0180010Struct) list.get(i)).getFIXED_LT());
		}
		return size;
	}
	public int setL2L_PROP_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROP_LT == null) {
			l_PROP_LT = new ArrayList();
		} else {
			l_PROP_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROP_LT.add(((AA0180010Struct) list.get(i)).getPROP_LT());
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
			l_SAFETY_LT.add(((AA0180010Struct) list.get(i)).getSAFETY_LT());
		}
		return size;
	}
	public int setL2L_PROP_LOT_SIZE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROP_LOT_SIZE == null) {
			l_PROP_LOT_SIZE = new ArrayList();
		} else {
			l_PROP_LOT_SIZE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROP_LOT_SIZE.add(((AA0180010Struct) list.get(i)).getPROP_LOT_SIZE());
		}
		return size;
	}
	public int setL2L_SPOIL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SPOIL == null) {
			l_SPOIL = new ArrayList();
		} else {
			l_SPOIL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SPOIL.add(((AA0180010Struct) list.get(i)).getSPOIL());
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
			l_OUTSIDE_TYP.add(((AA0180010Struct) list.get(i)).getOUTSIDE_TYP());
		}
		return size;
	}
	public int setL2L_ACPT_INSPC_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACPT_INSPC_TYP == null) {
			l_ACPT_INSPC_TYP = new ArrayList();
		} else {
			l_ACPT_INSPC_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACPT_INSPC_TYP.add(((AA0180010Struct) list.get(i)).getACPT_INSPC_TYP());
		}
		return size;
	}
	public int setL2L_STANDARD_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STANDARD_COST == null) {
			l_STANDARD_COST = new ArrayList();
		} else {
			l_STANDARD_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STANDARD_COST.add(((AA0180010Struct) list.get(i)).getSTANDARD_COST());
		}
		return size;
	}
	public int setL2L_UNIT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_QTY == null) {
			l_UNIT_QTY = new ArrayList();
		} else {
			l_UNIT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_QTY.add(((AA0180010Struct) list.get(i)).getUNIT_QTY());
		}
		return size;
	}
	public int setL2L_WORK_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WORK_TIME == null) {
			l_WORK_TIME = new ArrayList();
		} else {
			l_WORK_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WORK_TIME.add(((AA0180010Struct) list.get(i)).getWORK_TIME());
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
			l_WS_NAME.add(((AA0180010Struct) list.get(i)).getWS_NAME());
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
			l_VEND_NAME.add(((AA0180010Struct) list.get(i)).getVEND_NAME());
		}
		return size;
	}
	public int setL2L_h_Sub2_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_Sub2_MODIFY_COUNT == null) {
			l_h_Sub2_MODIFY_COUNT = new ArrayList();
		} else {
			l_h_Sub2_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_Sub2_MODIFY_COUNT.add(((AA0180010Struct) list.get(i)).geth_Sub2_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_Sub2_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub2_ITEM_NAME == null) {
			l_Sub2_ITEM_NAME = new ArrayList();
		} else {
			l_Sub2_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub2_ITEM_NAME.add(((AA0180010Struct) list.get(i)).getSub2_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_Sub2_STOCK_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub2_STOCK_UNIT == null) {
			l_Sub2_STOCK_UNIT = new ArrayList();
		} else {
			l_Sub2_STOCK_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub2_STOCK_UNIT.add(((AA0180010Struct) list.get(i)).getSub2_STOCK_UNIT());
		}
		return size;
	}
	public int setL2L_Sub2_WS_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub2_WS_NAME == null) {
			l_Sub2_WS_NAME = new ArrayList();
		} else {
			l_Sub2_WS_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub2_WS_NAME.add(((AA0180010Struct) list.get(i)).getSub2_WS_NAME());
		}
		return size;
	}
	public int setL2L_Sub2_VEND_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Sub2_VEND_NAME == null) {
			l_Sub2_VEND_NAME = new ArrayList();
		} else {
			l_Sub2_VEND_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Sub2_VEND_NAME.add(((AA0180010Struct) list.get(i)).getSub2_VEND_NAME());
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
			l_PS_UNIT_DENOMINATOR.add(((AA0180010Struct) list.get(i)).getPS_UNIT_DENOMINATOR());
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
			l_PS_UNIT_NUMERATOR.add(((AA0180010Struct) list.get(i)).getPS_UNIT_NUMERATOR());
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
			l_PARENT_ITEM_CD.add(((AA0180010Struct) list.get(i)).getPARENT_ITEM_CD());
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
			l_COMP_ITEM_CD.add(((AA0180010Struct) list.get(i)).getCOMP_ITEM_CD());
		}
		return size;
	}
	public int setL2L_SUM_FIXED_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUM_FIXED_LT == null) {
			l_SUM_FIXED_LT = new ArrayList();
		} else {
			l_SUM_FIXED_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUM_FIXED_LT.add(((AA0180010Struct) list.get(i)).getSUM_FIXED_LT());
		}
		return size;
	}
	public int setL2L_SUM_PROP_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUM_PROP_LT == null) {
			l_SUM_PROP_LT = new ArrayList();
		} else {
			l_SUM_PROP_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUM_PROP_LT.add(((AA0180010Struct) list.get(i)).getSUM_PROP_LT());
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
			l_BY_PRODUCT_CD.add(((AA0180010Struct) list.get(i)).getBY_PRODUCT_CD());
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
			l_BUSINESS_OPR_DATE.add(((AA0180010Struct) list.get(i)).getBUSINESS_OPR_DATE());
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
			l_PARAM_RESULT_DATA.add(((AA0180010Struct) list.get(i)).getPARAM_RESULT_DATA());
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
			l_PARAM_INPUT_DATA.add(((AA0180010Struct) list.get(i)).getPARAM_INPUT_DATA());
		}
		return size;
	}
	public int setL2L_Lower_MANHOUR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_Lower_MANHOUR_TYP == null) {
			l_Lower_MANHOUR_TYP = new ArrayList();
		} else {
			l_Lower_MANHOUR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_Lower_MANHOUR_TYP.add(((AA0180010Struct) list.get(i)).getLower_MANHOUR_TYP());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_Target_ITEM_CD = null;
		m_DEVELOP_TYP = null;
		m_InitLevel = null;
		m_id = null;
		m_lvl = null;
		m_parent = null;
		m_label = null;
		m_ctx = null;
		m_maxid = null;
		m_TargetDate = null;
		m_h_Target_ITEM_CD = null;
		m_h_TargetDate = null;
		m_h_DEVELOP_TYP = null;
		m_h_InitLevel = null;
		m_DEVELOP_TYP_name = null;
		m_DEVELOP_TYP_val = null;
		m_h_ProcTyp = null;
		m_h_MaxLevel = null;
		m_DET_TYP = null;
		m_Sub2_OUTSIDE_TYP_name = null;
		m_Sub2_OUTSIDE_TYP_val = null;
		m_Sub2_ACPT_INSPC_TYP_name = null;
		m_Sub2_ACPT_INSPC_TYP_val = null;
		m_h_Sub1Parent_ITEM_CD = null;
		m_h_Sub1Comp_ITEM_CD = null;
		m_h_Sub1_PS_EDITION = null;
		m_Sub1_CONS_TYP_name = null;
		m_Sub1_CONS_TYP_val = null;
		m_c_Sub1_PS_LT_FLG = null;
		m_Sub1_COST_UP_TYP_name = null;
		m_Sub1_COST_UP_TYP_val = null;
		m_Sub1_MRP_EXP_TYP_name = null;
		m_Sub1_MRP_EXP_TYP_val = null;
		m_h_Target_ITEM_CD2 = null;
		m_h_TargetDate2 = null;
		m_h_DEVELOP_TYP2 = null;
		m_h_InitLevel2 = null;
		m_h_Sub2_PROC_NO = null;
		m_FIRST_PROC = null;
		m_h_Sub1_PS_UNIT_NUMERATOR = null;
		m_h_Sub1_PS_UNIT_DENOMINATOR = null;
		m_AA0180010tree1 = null;
		m_sub2_STOCK_UNIT_1 = null;
		m_sub2_STOCK_UNIT_2 = null;
		m_sub2_STOCK_UNIT_3 = null;
		m_Det2FIXED_LT_UNIT = null;
		m_Det2PROP_LT_UNIT = null;
		m_Det2PROP_LOT_SIZE_UNIT = null;
		m_Det2SAFETY_LT_UNIT = null;
		m_MANHOUR_TYP = null;
		m_Lower_ITEM_NAME = null;
		m_Lower_STOCK_UNIT = null;
		m_Lower_ITEM_CD = null;
		m_Upper_ITEM_NAME = null;
		m_Upper_ITEM_CD = null;
		m_DetParent_ITEM_CD = null;
		m_DetParent_ITEM_NAME = null;
		m_DetParent_MRP_ODR_TYP = null;
		m_DetParent_OUTSIDE_TYP = null;
		m_DetComp_ITEM_CD = null;
		m_DetComp_ITEM_NAME = null;
		m_DetComp_MRP_ODR_TYP = null;
		m_DetComp_OUTSIDE_TYP = null;
		m_Det_MANHOUR_TYP = null;
		m_Det_PS_EDITION = null;
		m_Det_PS_UNIT_QTY = null;
		m_Det_STOCK_UNIT = null;
		m_Det_EFF_PHASE_IN_DATE = null;
		m_Det_EFF_PHASE_OUT_DATE = null;
		m_Det_PS_SPOIL = null;
		m_Det_CONS_TYP = null;
		m_Det_PS_LT_FLG = null;
		m_Det_PS_FIXED_LT = null;
		m_Det_PS_PROP_LT = null;
		m_Det_PS_PROP_LOT_SIZE = null;
		m_Det_PS_REF_NO = null;
		m_Det_COST_UP_TYP = null;
		m_Det_MRP_EXP_TYP = null;
		m_PS_EDITION = null;
		m_Sub1Parent_ITEM_NAME = null;
		m_Sub1Comp_ITEM_NAME = null;
		m_Sub1_PS_UNIT_NUMERATOR = null;
		m_Sub1_PS_UNIT_DENOMINATOR = null;
		m_Sub1_STOCK_UNIT = null;
		m_Sub1Comp_STOCK_UNIT = null;
		m_Sub1_EFF_PHASE_IN_DATE = null;
		m_Sub1_EFF_PHASE_OUT_DATE = null;
		m_Sub1_PS_SPOIL = null;
		m_Sub1_CONS_TYP = null;
		m_h_Sub1_PS_LT_FLG = null;
		m_Sub1_PS_FIXED_LT = null;
		m_Sub1_PS_PROP_LT = null;
		m_Sub1_PS_PROP_LOT_SIZE = null;
		m_Sub1_PS_REF_NO = null;
		m_Sub1_COST_UP_TYP = null;
		m_Sub1_MRP_EXP_TYP = null;
		m_h_Sub1_MODIFY_COUNT = null;
		m_Sub1Parent_ITEM_CD = null;
		m_Sub1Comp_ITEM_CD = null;
		m_Sub1_PS_EDITION = null;
		m_KBN1 = null;
		m_KBN2 = null;
		m_PLANT_CD = null;
		m_PROC_CD = null;
		m_PROC_NO = null;
		m_PROC_NAME = null;
		m_WS_CD = null;
		m_MODIFY_CNT_PROC = null;
		m_EFF_PHASE_IN_DATE = null;
		m_EFF_PHASE_OUT_DATE = null;
		m_MODIFY_CNT_ISSUE = null;
		m_MODIFY_COUNT = null;
		m_PS_REF_NO = null;
		m_FIRST_PROC_NO = null;
		m_TargetDate_IN = null;
		m_TargetDate_OUT = null;
		m_Det2ITEM_CD = null;
		m_Det2PROC_CD = null;
		m_Det2PROC_NO = null;
		m_Det2PROC_NAME = null;
		m_Det2WS_CD = null;
		m_Det2COMPANY_CD = null;
		m_Det2VEND_CD = null;
		m_Det2FIXED_LT = null;
		m_Det2PROP_LT = null;
		m_Det2SAFETY_LT = null;
		m_Det2PROP_LOT_SIZE = null;
		m_Det2SPOIL = null;
		m_Det2OUTSIDE_TYP = null;
		m_Det2ACPT_INSPC_TYP = null;
		m_Det2STANDARD_COST = null;
		m_Det2ITEM_NAME = null;
		m_Det2WS_NAME = null;
		m_Det2VEND_NAME = null;
		m_Sub2_ITEM_CD = null;
		m_Sub2_PROC_CD = null;
		m_Sub2_PROC_NO = null;
		m_Sub2_PROC_NAME = null;
		m_Sub2_WS_CD = null;
		m_COMPANY_CD = null;
		m_Sub2_VEND_CD = null;
		m_Sub2_FIXED_LT = null;
		m_Sub2_PROP_LT = null;
		m_Sub2_SAFETY_LT = null;
		m_Sub2_PROP_LOT_SIZE = null;
		m_Sub2_SPOIL = null;
		m_Sub2_OUTSIDE_TYP = null;
		m_Sub2_ACPT_INSPC_TYP = null;
		m_Sub2_STANDARD_COST = null;
		m_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_DRAW_CD = null;
		m_SPEC = null;
		m_MRP_ODR_TYP = null;
		m_ITEM_OUTSIDE_TYP = null;
		m_OPR_RSLT_TYP = null;
		m_ITEM_FIXED_LT = null;
		m_ITEM_PROP_LT = null;
		m_ITEM_PROP_LOT_SIZE = null;
		m_ITEM_ISSUE_LT = null;
		m_ITEM_SAFETY_LT = null;
		m_UNIT_QTY_TYP = null;
		m_STOCK_UNIT = null;
		m_VEND_CD = null;
		m_FIXED_LT = null;
		m_PROP_LT = null;
		m_SAFETY_LT = null;
		m_PROP_LOT_SIZE = null;
		m_SPOIL = null;
		m_OUTSIDE_TYP = null;
		m_ACPT_INSPC_TYP = null;
		m_STANDARD_COST = null;
		m_UNIT_QTY = null;
		m_WORK_TIME = null;
		m_WS_NAME = null;
		m_VEND_NAME = null;
		m_h_Sub2_MODIFY_COUNT = null;
		m_Sub2_ITEM_NAME = null;
		m_Sub2_STOCK_UNIT = null;
		m_Sub2_WS_NAME = null;
		m_Sub2_VEND_NAME = null;
		m_PS_UNIT_DENOMINATOR = null;
		m_PS_UNIT_NUMERATOR = null;
		m_PARENT_ITEM_CD = null;
		m_COMP_ITEM_CD = null;
		m_SUM_FIXED_LT = null;
		m_SUM_PROP_LT = null;
		m_BY_PRODUCT_CD = null;
		m_BUSINESS_OPR_DATE = null;
		m_PARAM_RESULT_DATA = null;
		m_PARAM_INPUT_DATA = null;
		m_Lower_MANHOUR_TYP = null;

		l_Target_ITEM_CD = null;
		l_DEVELOP_TYP = null;
		l_InitLevel = null;
		l_id = null;
		l_lvl = null;
		l_parent = null;
		l_label = null;
		l_ctx = null;
		l_maxid = null;
		l_TargetDate = null;
		l_h_Target_ITEM_CD = null;
		l_h_TargetDate = null;
		l_h_DEVELOP_TYP = null;
		l_h_InitLevel = null;
		l_DEVELOP_TYP_name = null;
		l_DEVELOP_TYP_val = null;
		l_h_ProcTyp = null;
		l_h_MaxLevel = null;
		l_DET_TYP = null;
		l_Sub2_OUTSIDE_TYP_name = null;
		l_Sub2_OUTSIDE_TYP_val = null;
		l_Sub2_ACPT_INSPC_TYP_name = null;
		l_Sub2_ACPT_INSPC_TYP_val = null;
		l_h_Sub1Parent_ITEM_CD = null;
		l_h_Sub1Comp_ITEM_CD = null;
		l_h_Sub1_PS_EDITION = null;
		l_Sub1_CONS_TYP_name = null;
		l_Sub1_CONS_TYP_val = null;
		l_c_Sub1_PS_LT_FLG = null;
		l_Sub1_COST_UP_TYP_name = null;
		l_Sub1_COST_UP_TYP_val = null;
		l_Sub1_MRP_EXP_TYP_name = null;
		l_Sub1_MRP_EXP_TYP_val = null;
		l_h_Target_ITEM_CD2 = null;
		l_h_TargetDate2 = null;
		l_h_DEVELOP_TYP2 = null;
		l_h_InitLevel2 = null;
		l_h_Sub2_PROC_NO = null;
		l_FIRST_PROC = null;
		l_h_Sub1_PS_UNIT_NUMERATOR = null;
		l_h_Sub1_PS_UNIT_DENOMINATOR = null;
		l_AA0180010tree1 = null;
		l_sub2_STOCK_UNIT_1 = null;
		l_sub2_STOCK_UNIT_2 = null;
		l_sub2_STOCK_UNIT_3 = null;
		l_Det2FIXED_LT_UNIT = null;
		l_Det2PROP_LT_UNIT = null;
		l_Det2PROP_LOT_SIZE_UNIT = null;
		l_Det2SAFETY_LT_UNIT = null;
		l_MANHOUR_TYP = null;
		l_Lower_ITEM_NAME = null;
		l_Lower_STOCK_UNIT = null;
		l_Lower_ITEM_CD = null;
		l_Upper_ITEM_NAME = null;
		l_Upper_ITEM_CD = null;
		l_DetParent_ITEM_CD = null;
		l_DetParent_ITEM_NAME = null;
		l_DetParent_MRP_ODR_TYP = null;
		l_DetParent_OUTSIDE_TYP = null;
		l_DetComp_ITEM_CD = null;
		l_DetComp_ITEM_NAME = null;
		l_DetComp_MRP_ODR_TYP = null;
		l_DetComp_OUTSIDE_TYP = null;
		l_Det_MANHOUR_TYP = null;
		l_Det_PS_EDITION = null;
		l_Det_PS_UNIT_QTY = null;
		l_Det_STOCK_UNIT = null;
		l_Det_EFF_PHASE_IN_DATE = null;
		l_Det_EFF_PHASE_OUT_DATE = null;
		l_Det_PS_SPOIL = null;
		l_Det_CONS_TYP = null;
		l_Det_PS_LT_FLG = null;
		l_Det_PS_FIXED_LT = null;
		l_Det_PS_PROP_LT = null;
		l_Det_PS_PROP_LOT_SIZE = null;
		l_Det_PS_REF_NO = null;
		l_Det_COST_UP_TYP = null;
		l_Det_MRP_EXP_TYP = null;
		l_PS_EDITION = null;
		l_Sub1Parent_ITEM_NAME = null;
		l_Sub1Comp_ITEM_NAME = null;
		l_Sub1_PS_UNIT_NUMERATOR = null;
		l_Sub1_PS_UNIT_DENOMINATOR = null;
		l_Sub1_STOCK_UNIT = null;
		l_Sub1Comp_STOCK_UNIT = null;
		l_Sub1_EFF_PHASE_IN_DATE = null;
		l_Sub1_EFF_PHASE_OUT_DATE = null;
		l_Sub1_PS_SPOIL = null;
		l_Sub1_CONS_TYP = null;
		l_h_Sub1_PS_LT_FLG = null;
		l_Sub1_PS_FIXED_LT = null;
		l_Sub1_PS_PROP_LT = null;
		l_Sub1_PS_PROP_LOT_SIZE = null;
		l_Sub1_PS_REF_NO = null;
		l_Sub1_COST_UP_TYP = null;
		l_Sub1_MRP_EXP_TYP = null;
		l_h_Sub1_MODIFY_COUNT = null;
		l_Sub1Parent_ITEM_CD = null;
		l_Sub1Comp_ITEM_CD = null;
		l_Sub1_PS_EDITION = null;
		l_KBN1 = null;
		l_KBN2 = null;
		l_PLANT_CD = null;
		l_PROC_CD = null;
		l_PROC_NO = null;
		l_PROC_NAME = null;
		l_WS_CD = null;
		l_MODIFY_CNT_PROC = null;
		l_EFF_PHASE_IN_DATE = null;
		l_EFF_PHASE_OUT_DATE = null;
		l_MODIFY_CNT_ISSUE = null;
		l_MODIFY_COUNT = null;
		l_PS_REF_NO = null;
		l_FIRST_PROC_NO = null;
		l_TargetDate_IN = null;
		l_TargetDate_OUT = null;
		l_Det2ITEM_CD = null;
		l_Det2PROC_CD = null;
		l_Det2PROC_NO = null;
		l_Det2PROC_NAME = null;
		l_Det2WS_CD = null;
		l_Det2COMPANY_CD = null;
		l_Det2VEND_CD = null;
		l_Det2FIXED_LT = null;
		l_Det2PROP_LT = null;
		l_Det2SAFETY_LT = null;
		l_Det2PROP_LOT_SIZE = null;
		l_Det2SPOIL = null;
		l_Det2OUTSIDE_TYP = null;
		l_Det2ACPT_INSPC_TYP = null;
		l_Det2STANDARD_COST = null;
		l_Det2ITEM_NAME = null;
		l_Det2WS_NAME = null;
		l_Det2VEND_NAME = null;
		l_Sub2_ITEM_CD = null;
		l_Sub2_PROC_CD = null;
		l_Sub2_PROC_NO = null;
		l_Sub2_PROC_NAME = null;
		l_Sub2_WS_CD = null;
		l_COMPANY_CD = null;
		l_Sub2_VEND_CD = null;
		l_Sub2_FIXED_LT = null;
		l_Sub2_PROP_LT = null;
		l_Sub2_SAFETY_LT = null;
		l_Sub2_PROP_LOT_SIZE = null;
		l_Sub2_SPOIL = null;
		l_Sub2_OUTSIDE_TYP = null;
		l_Sub2_ACPT_INSPC_TYP = null;
		l_Sub2_STANDARD_COST = null;
		l_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_DRAW_CD = null;
		l_SPEC = null;
		l_MRP_ODR_TYP = null;
		l_ITEM_OUTSIDE_TYP = null;
		l_OPR_RSLT_TYP = null;
		l_ITEM_FIXED_LT = null;
		l_ITEM_PROP_LT = null;
		l_ITEM_PROP_LOT_SIZE = null;
		l_ITEM_ISSUE_LT = null;
		l_ITEM_SAFETY_LT = null;
		l_UNIT_QTY_TYP = null;
		l_STOCK_UNIT = null;
		l_VEND_CD = null;
		l_FIXED_LT = null;
		l_PROP_LT = null;
		l_SAFETY_LT = null;
		l_PROP_LOT_SIZE = null;
		l_SPOIL = null;
		l_OUTSIDE_TYP = null;
		l_ACPT_INSPC_TYP = null;
		l_STANDARD_COST = null;
		l_UNIT_QTY = null;
		l_WORK_TIME = null;
		l_WS_NAME = null;
		l_VEND_NAME = null;
		l_h_Sub2_MODIFY_COUNT = null;
		l_Sub2_ITEM_NAME = null;
		l_Sub2_STOCK_UNIT = null;
		l_Sub2_WS_NAME = null;
		l_Sub2_VEND_NAME = null;
		l_PS_UNIT_DENOMINATOR = null;
		l_PS_UNIT_NUMERATOR = null;
		l_PARENT_ITEM_CD = null;
		l_COMP_ITEM_CD = null;
		l_SUM_FIXED_LT = null;
		l_SUM_PROP_LT = null;
		l_BY_PRODUCT_CD = null;
		l_BUSINESS_OPR_DATE = null;
		l_PARAM_RESULT_DATA = null;
		l_PARAM_INPUT_DATA = null;
		l_Lower_MANHOUR_TYP = null;

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
	 * medAA0180010�N���X�̕W���R���X�g���N�^
	 */
	public AA0180010Struct()
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
	public void setStruct(AA0180010Struct struct)
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
	public void setStructM(AA0180010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setTarget_ITEM_CD(struct.getTarget_ITEM_CD());
			this.setDEVELOP_TYP(struct.getDEVELOP_TYP());
			this.setInitLevel(struct.getInitLevel());
			this.setid(struct.getid());
			this.setlvl(struct.getlvl());
			this.setparent(struct.getparent());
			this.setlabel(struct.getlabel());
			this.setctx(struct.getctx());
			this.setmaxid(struct.getmaxid());
			this.setTargetDate(struct.getTargetDate());
			this.seth_Target_ITEM_CD(struct.geth_Target_ITEM_CD());
			this.seth_TargetDate(struct.geth_TargetDate());
			this.seth_DEVELOP_TYP(struct.geth_DEVELOP_TYP());
			this.seth_InitLevel(struct.geth_InitLevel());
			this.setDEVELOP_TYP_name(struct.getDEVELOP_TYP_name());
			this.setDEVELOP_TYP_val(struct.getDEVELOP_TYP_val());
			this.seth_ProcTyp(struct.geth_ProcTyp());
			this.seth_MaxLevel(struct.geth_MaxLevel());
			this.setDET_TYP(struct.getDET_TYP());
			this.setSub2_OUTSIDE_TYP_name(struct.getSub2_OUTSIDE_TYP_name());
			this.setSub2_OUTSIDE_TYP_val(struct.getSub2_OUTSIDE_TYP_val());
			this.setSub2_ACPT_INSPC_TYP_name(struct.getSub2_ACPT_INSPC_TYP_name());
			this.setSub2_ACPT_INSPC_TYP_val(struct.getSub2_ACPT_INSPC_TYP_val());
			this.seth_Sub1Parent_ITEM_CD(struct.geth_Sub1Parent_ITEM_CD());
			this.seth_Sub1Comp_ITEM_CD(struct.geth_Sub1Comp_ITEM_CD());
			this.seth_Sub1_PS_EDITION(struct.geth_Sub1_PS_EDITION());
			this.setSub1_CONS_TYP_name(struct.getSub1_CONS_TYP_name());
			this.setSub1_CONS_TYP_val(struct.getSub1_CONS_TYP_val());
			this.setc_Sub1_PS_LT_FLG(struct.getc_Sub1_PS_LT_FLG());
			this.setSub1_COST_UP_TYP_name(struct.getSub1_COST_UP_TYP_name());
			this.setSub1_COST_UP_TYP_val(struct.getSub1_COST_UP_TYP_val());
			this.setSub1_MRP_EXP_TYP_name(struct.getSub1_MRP_EXP_TYP_name());
			this.setSub1_MRP_EXP_TYP_val(struct.getSub1_MRP_EXP_TYP_val());
			this.seth_Target_ITEM_CD2(struct.geth_Target_ITEM_CD2());
			this.seth_TargetDate2(struct.geth_TargetDate2());
			this.seth_DEVELOP_TYP2(struct.geth_DEVELOP_TYP2());
			this.seth_InitLevel2(struct.geth_InitLevel2());
			this.seth_Sub2_PROC_NO(struct.geth_Sub2_PROC_NO());
			this.setFIRST_PROC(struct.getFIRST_PROC());
			this.seth_Sub1_PS_UNIT_NUMERATOR(struct.geth_Sub1_PS_UNIT_NUMERATOR());
			this.seth_Sub1_PS_UNIT_DENOMINATOR(struct.geth_Sub1_PS_UNIT_DENOMINATOR());
			this.setAA0180010tree1(struct.getAA0180010tree1());
			this.setsub2_STOCK_UNIT_1(struct.getsub2_STOCK_UNIT_1());
			this.setsub2_STOCK_UNIT_2(struct.getsub2_STOCK_UNIT_2());
			this.setsub2_STOCK_UNIT_3(struct.getsub2_STOCK_UNIT_3());
			this.setDet2FIXED_LT_UNIT(struct.getDet2FIXED_LT_UNIT());
			this.setDet2PROP_LT_UNIT(struct.getDet2PROP_LT_UNIT());
			this.setDet2PROP_LOT_SIZE_UNIT(struct.getDet2PROP_LOT_SIZE_UNIT());
			this.setDet2SAFETY_LT_UNIT(struct.getDet2SAFETY_LT_UNIT());
			this.setMANHOUR_TYP(struct.getMANHOUR_TYP());
			this.setLower_ITEM_NAME(struct.getLower_ITEM_NAME());
			this.setLower_STOCK_UNIT(struct.getLower_STOCK_UNIT());
			this.setLower_ITEM_CD(struct.getLower_ITEM_CD());
			this.setUpper_ITEM_NAME(struct.getUpper_ITEM_NAME());
			this.setUpper_ITEM_CD(struct.getUpper_ITEM_CD());
			this.setDetParent_ITEM_CD(struct.getDetParent_ITEM_CD());
			this.setDetParent_ITEM_NAME(struct.getDetParent_ITEM_NAME());
			this.setDetParent_MRP_ODR_TYP(struct.getDetParent_MRP_ODR_TYP());
			this.setDetParent_OUTSIDE_TYP(struct.getDetParent_OUTSIDE_TYP());
			this.setDetComp_ITEM_CD(struct.getDetComp_ITEM_CD());
			this.setDetComp_ITEM_NAME(struct.getDetComp_ITEM_NAME());
			this.setDetComp_MRP_ODR_TYP(struct.getDetComp_MRP_ODR_TYP());
			this.setDetComp_OUTSIDE_TYP(struct.getDetComp_OUTSIDE_TYP());
			this.setDet_MANHOUR_TYP(struct.getDet_MANHOUR_TYP());
			this.setDet_PS_EDITION(struct.getDet_PS_EDITION());
			this.setDet_PS_UNIT_QTY(struct.getDet_PS_UNIT_QTY());
			this.setDet_STOCK_UNIT(struct.getDet_STOCK_UNIT());
			this.setDet_EFF_PHASE_IN_DATE(struct.getDet_EFF_PHASE_IN_DATE());
			this.setDet_EFF_PHASE_OUT_DATE(struct.getDet_EFF_PHASE_OUT_DATE());
			this.setDet_PS_SPOIL(struct.getDet_PS_SPOIL());
			this.setDet_CONS_TYP(struct.getDet_CONS_TYP());
			this.setDet_PS_LT_FLG(struct.getDet_PS_LT_FLG());
			this.setDet_PS_FIXED_LT(struct.getDet_PS_FIXED_LT());
			this.setDet_PS_PROP_LT(struct.getDet_PS_PROP_LT());
			this.setDet_PS_PROP_LOT_SIZE(struct.getDet_PS_PROP_LOT_SIZE());
			this.setDet_PS_REF_NO(struct.getDet_PS_REF_NO());
			this.setDet_COST_UP_TYP(struct.getDet_COST_UP_TYP());
			this.setDet_MRP_EXP_TYP(struct.getDet_MRP_EXP_TYP());
			this.setPS_EDITION(struct.getPS_EDITION());
			this.setSub1Parent_ITEM_NAME(struct.getSub1Parent_ITEM_NAME());
			this.setSub1Comp_ITEM_NAME(struct.getSub1Comp_ITEM_NAME());
			this.setSub1_PS_UNIT_NUMERATOR(struct.getSub1_PS_UNIT_NUMERATOR());
			this.setSub1_PS_UNIT_DENOMINATOR(struct.getSub1_PS_UNIT_DENOMINATOR());
			this.setSub1_STOCK_UNIT(struct.getSub1_STOCK_UNIT());
			this.setSub1Comp_STOCK_UNIT(struct.getSub1Comp_STOCK_UNIT());
			this.setSub1_EFF_PHASE_IN_DATE(struct.getSub1_EFF_PHASE_IN_DATE());
			this.setSub1_EFF_PHASE_OUT_DATE(struct.getSub1_EFF_PHASE_OUT_DATE());
			this.setSub1_PS_SPOIL(struct.getSub1_PS_SPOIL());
			this.setSub1_CONS_TYP(struct.getSub1_CONS_TYP());
			this.seth_Sub1_PS_LT_FLG(struct.geth_Sub1_PS_LT_FLG());
			this.setSub1_PS_FIXED_LT(struct.getSub1_PS_FIXED_LT());
			this.setSub1_PS_PROP_LT(struct.getSub1_PS_PROP_LT());
			this.setSub1_PS_PROP_LOT_SIZE(struct.getSub1_PS_PROP_LOT_SIZE());
			this.setSub1_PS_REF_NO(struct.getSub1_PS_REF_NO());
			this.setSub1_COST_UP_TYP(struct.getSub1_COST_UP_TYP());
			this.setSub1_MRP_EXP_TYP(struct.getSub1_MRP_EXP_TYP());
			this.seth_Sub1_MODIFY_COUNT(struct.geth_Sub1_MODIFY_COUNT());
			this.setSub1Parent_ITEM_CD(struct.getSub1Parent_ITEM_CD());
			this.setSub1Comp_ITEM_CD(struct.getSub1Comp_ITEM_CD());
			this.setSub1_PS_EDITION(struct.getSub1_PS_EDITION());
			this.setKBN1(struct.getKBN1());
			this.setKBN2(struct.getKBN2());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setPROC_CD(struct.getPROC_CD());
			this.setPROC_NO(struct.getPROC_NO());
			this.setPROC_NAME(struct.getPROC_NAME());
			this.setWS_CD(struct.getWS_CD());
			this.setMODIFY_CNT_PROC(struct.getMODIFY_CNT_PROC());
			this.setEFF_PHASE_IN_DATE(struct.getEFF_PHASE_IN_DATE());
			this.setEFF_PHASE_OUT_DATE(struct.getEFF_PHASE_OUT_DATE());
			this.setMODIFY_CNT_ISSUE(struct.getMODIFY_CNT_ISSUE());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setPS_REF_NO(struct.getPS_REF_NO());
			this.setFIRST_PROC_NO(struct.getFIRST_PROC_NO());
			this.setTargetDate_IN(struct.getTargetDate_IN());
			this.setTargetDate_OUT(struct.getTargetDate_OUT());
			this.setDet2ITEM_CD(struct.getDet2ITEM_CD());
			this.setDet2PROC_CD(struct.getDet2PROC_CD());
			this.setDet2PROC_NO(struct.getDet2PROC_NO());
			this.setDet2PROC_NAME(struct.getDet2PROC_NAME());
			this.setDet2WS_CD(struct.getDet2WS_CD());
			this.setDet2COMPANY_CD(struct.getDet2COMPANY_CD());
			this.setDet2VEND_CD(struct.getDet2VEND_CD());
			this.setDet2FIXED_LT(struct.getDet2FIXED_LT());
			this.setDet2PROP_LT(struct.getDet2PROP_LT());
			this.setDet2SAFETY_LT(struct.getDet2SAFETY_LT());
			this.setDet2PROP_LOT_SIZE(struct.getDet2PROP_LOT_SIZE());
			this.setDet2SPOIL(struct.getDet2SPOIL());
			this.setDet2OUTSIDE_TYP(struct.getDet2OUTSIDE_TYP());
			this.setDet2ACPT_INSPC_TYP(struct.getDet2ACPT_INSPC_TYP());
			this.setDet2STANDARD_COST(struct.getDet2STANDARD_COST());
			this.setDet2ITEM_NAME(struct.getDet2ITEM_NAME());
			this.setDet2WS_NAME(struct.getDet2WS_NAME());
			this.setDet2VEND_NAME(struct.getDet2VEND_NAME());
			this.setSub2_ITEM_CD(struct.getSub2_ITEM_CD());
			this.setSub2_PROC_CD(struct.getSub2_PROC_CD());
			this.setSub2_PROC_NO(struct.getSub2_PROC_NO());
			this.setSub2_PROC_NAME(struct.getSub2_PROC_NAME());
			this.setSub2_WS_CD(struct.getSub2_WS_CD());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setSub2_VEND_CD(struct.getSub2_VEND_CD());
			this.setSub2_FIXED_LT(struct.getSub2_FIXED_LT());
			this.setSub2_PROP_LT(struct.getSub2_PROP_LT());
			this.setSub2_SAFETY_LT(struct.getSub2_SAFETY_LT());
			this.setSub2_PROP_LOT_SIZE(struct.getSub2_PROP_LOT_SIZE());
			this.setSub2_SPOIL(struct.getSub2_SPOIL());
			this.setSub2_OUTSIDE_TYP(struct.getSub2_OUTSIDE_TYP());
			this.setSub2_ACPT_INSPC_TYP(struct.getSub2_ACPT_INSPC_TYP());
			this.setSub2_STANDARD_COST(struct.getSub2_STANDARD_COST());
			this.setITEM_CD(struct.getITEM_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setDRAW_CD(struct.getDRAW_CD());
			this.setSPEC(struct.getSPEC());
			this.setMRP_ODR_TYP(struct.getMRP_ODR_TYP());
			this.setITEM_OUTSIDE_TYP(struct.getITEM_OUTSIDE_TYP());
			this.setOPR_RSLT_TYP(struct.getOPR_RSLT_TYP());
			this.setITEM_FIXED_LT(struct.getITEM_FIXED_LT());
			this.setITEM_PROP_LT(struct.getITEM_PROP_LT());
			this.setITEM_PROP_LOT_SIZE(struct.getITEM_PROP_LOT_SIZE());
			this.setITEM_ISSUE_LT(struct.getITEM_ISSUE_LT());
			this.setITEM_SAFETY_LT(struct.getITEM_SAFETY_LT());
			this.setUNIT_QTY_TYP(struct.getUNIT_QTY_TYP());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setVEND_CD(struct.getVEND_CD());
			this.setFIXED_LT(struct.getFIXED_LT());
			this.setPROP_LT(struct.getPROP_LT());
			this.setSAFETY_LT(struct.getSAFETY_LT());
			this.setPROP_LOT_SIZE(struct.getPROP_LOT_SIZE());
			this.setSPOIL(struct.getSPOIL());
			this.setOUTSIDE_TYP(struct.getOUTSIDE_TYP());
			this.setACPT_INSPC_TYP(struct.getACPT_INSPC_TYP());
			this.setSTANDARD_COST(struct.getSTANDARD_COST());
			this.setUNIT_QTY(struct.getUNIT_QTY());
			this.setWORK_TIME(struct.getWORK_TIME());
			this.setWS_NAME(struct.getWS_NAME());
			this.setVEND_NAME(struct.getVEND_NAME());
			this.seth_Sub2_MODIFY_COUNT(struct.geth_Sub2_MODIFY_COUNT());
			this.setSub2_ITEM_NAME(struct.getSub2_ITEM_NAME());
			this.setSub2_STOCK_UNIT(struct.getSub2_STOCK_UNIT());
			this.setSub2_WS_NAME(struct.getSub2_WS_NAME());
			this.setSub2_VEND_NAME(struct.getSub2_VEND_NAME());
			this.setPS_UNIT_DENOMINATOR(struct.getPS_UNIT_DENOMINATOR());
			this.setPS_UNIT_NUMERATOR(struct.getPS_UNIT_NUMERATOR());
			this.setPARENT_ITEM_CD(struct.getPARENT_ITEM_CD());
			this.setCOMP_ITEM_CD(struct.getCOMP_ITEM_CD());
			this.setSUM_FIXED_LT(struct.getSUM_FIXED_LT());
			this.setSUM_PROP_LT(struct.getSUM_PROP_LT());
			this.setBY_PRODUCT_CD(struct.getBY_PRODUCT_CD());
			this.setBUSINESS_OPR_DATE(struct.getBUSINESS_OPR_DATE());
			this.setPARAM_RESULT_DATA(struct.getPARAM_RESULT_DATA());
			this.setPARAM_INPUT_DATA(struct.getPARAM_INPUT_DATA());
			this.setLower_MANHOUR_TYP(struct.getLower_MANHOUR_TYP());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AA0180010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_Target_ITEM_CD(struct.getList_Target_ITEM_CD());
			this.setList_DEVELOP_TYP(struct.getList_DEVELOP_TYP());
			this.setList_InitLevel(struct.getList_InitLevel());
			this.setList_id(struct.getList_id());
			this.setList_lvl(struct.getList_lvl());
			this.setList_parent(struct.getList_parent());
			this.setList_label(struct.getList_label());
			this.setList_ctx(struct.getList_ctx());
			this.setList_maxid(struct.getList_maxid());
			this.setList_TargetDate(struct.getList_TargetDate());
			this.setList_h_Target_ITEM_CD(struct.getList_h_Target_ITEM_CD());
			this.setList_h_TargetDate(struct.getList_h_TargetDate());
			this.setList_h_DEVELOP_TYP(struct.getList_h_DEVELOP_TYP());
			this.setList_h_InitLevel(struct.getList_h_InitLevel());
			this.setList_DEVELOP_TYP_name(struct.getList_DEVELOP_TYP_name());
			this.setList_DEVELOP_TYP_val(struct.getList_DEVELOP_TYP_val());
			this.setList_h_ProcTyp(struct.getList_h_ProcTyp());
			this.setList_h_MaxLevel(struct.getList_h_MaxLevel());
			this.setList_DET_TYP(struct.getList_DET_TYP());
			this.setList_Sub2_OUTSIDE_TYP_name(struct.getList_Sub2_OUTSIDE_TYP_name());
			this.setList_Sub2_OUTSIDE_TYP_val(struct.getList_Sub2_OUTSIDE_TYP_val());
			this.setList_Sub2_ACPT_INSPC_TYP_name(struct.getList_Sub2_ACPT_INSPC_TYP_name());
			this.setList_Sub2_ACPT_INSPC_TYP_val(struct.getList_Sub2_ACPT_INSPC_TYP_val());
			this.setList_h_Sub1Parent_ITEM_CD(struct.getList_h_Sub1Parent_ITEM_CD());
			this.setList_h_Sub1Comp_ITEM_CD(struct.getList_h_Sub1Comp_ITEM_CD());
			this.setList_h_Sub1_PS_EDITION(struct.getList_h_Sub1_PS_EDITION());
			this.setList_Sub1_CONS_TYP_name(struct.getList_Sub1_CONS_TYP_name());
			this.setList_Sub1_CONS_TYP_val(struct.getList_Sub1_CONS_TYP_val());
			this.setList_c_Sub1_PS_LT_FLG(struct.getList_c_Sub1_PS_LT_FLG());
			this.setList_Sub1_COST_UP_TYP_name(struct.getList_Sub1_COST_UP_TYP_name());
			this.setList_Sub1_COST_UP_TYP_val(struct.getList_Sub1_COST_UP_TYP_val());
			this.setList_Sub1_MRP_EXP_TYP_name(struct.getList_Sub1_MRP_EXP_TYP_name());
			this.setList_Sub1_MRP_EXP_TYP_val(struct.getList_Sub1_MRP_EXP_TYP_val());
			this.setList_h_Target_ITEM_CD2(struct.getList_h_Target_ITEM_CD2());
			this.setList_h_TargetDate2(struct.getList_h_TargetDate2());
			this.setList_h_DEVELOP_TYP2(struct.getList_h_DEVELOP_TYP2());
			this.setList_h_InitLevel2(struct.getList_h_InitLevel2());
			this.setList_h_Sub2_PROC_NO(struct.getList_h_Sub2_PROC_NO());
			this.setList_FIRST_PROC(struct.getList_FIRST_PROC());
			this.setList_h_Sub1_PS_UNIT_NUMERATOR(struct.getList_h_Sub1_PS_UNIT_NUMERATOR());
			this.setList_h_Sub1_PS_UNIT_DENOMINATOR(struct.getList_h_Sub1_PS_UNIT_DENOMINATOR());
			this.setList_AA0180010tree1(struct.getList_AA0180010tree1());
			this.setList_sub2_STOCK_UNIT_1(struct.getList_sub2_STOCK_UNIT_1());
			this.setList_sub2_STOCK_UNIT_2(struct.getList_sub2_STOCK_UNIT_2());
			this.setList_sub2_STOCK_UNIT_3(struct.getList_sub2_STOCK_UNIT_3());
			this.setList_Det2FIXED_LT_UNIT(struct.getList_Det2FIXED_LT_UNIT());
			this.setList_Det2PROP_LT_UNIT(struct.getList_Det2PROP_LT_UNIT());
			this.setList_Det2PROP_LOT_SIZE_UNIT(struct.getList_Det2PROP_LOT_SIZE_UNIT());
			this.setList_Det2SAFETY_LT_UNIT(struct.getList_Det2SAFETY_LT_UNIT());
			this.setList_MANHOUR_TYP(struct.getList_MANHOUR_TYP());
			this.setList_Lower_ITEM_NAME(struct.getList_Lower_ITEM_NAME());
			this.setList_Lower_STOCK_UNIT(struct.getList_Lower_STOCK_UNIT());
			this.setList_Lower_ITEM_CD(struct.getList_Lower_ITEM_CD());
			this.setList_Upper_ITEM_NAME(struct.getList_Upper_ITEM_NAME());
			this.setList_Upper_ITEM_CD(struct.getList_Upper_ITEM_CD());
			this.setList_DetParent_ITEM_CD(struct.getList_DetParent_ITEM_CD());
			this.setList_DetParent_ITEM_NAME(struct.getList_DetParent_ITEM_NAME());
			this.setList_DetParent_MRP_ODR_TYP(struct.getList_DetParent_MRP_ODR_TYP());
			this.setList_DetParent_OUTSIDE_TYP(struct.getList_DetParent_OUTSIDE_TYP());
			this.setList_DetComp_ITEM_CD(struct.getList_DetComp_ITEM_CD());
			this.setList_DetComp_ITEM_NAME(struct.getList_DetComp_ITEM_NAME());
			this.setList_DetComp_MRP_ODR_TYP(struct.getList_DetComp_MRP_ODR_TYP());
			this.setList_DetComp_OUTSIDE_TYP(struct.getList_DetComp_OUTSIDE_TYP());
			this.setList_Det_MANHOUR_TYP(struct.getList_Det_MANHOUR_TYP());
			this.setList_Det_PS_EDITION(struct.getList_Det_PS_EDITION());
			this.setList_Det_PS_UNIT_QTY(struct.getList_Det_PS_UNIT_QTY());
			this.setList_Det_STOCK_UNIT(struct.getList_Det_STOCK_UNIT());
			this.setList_Det_EFF_PHASE_IN_DATE(struct.getList_Det_EFF_PHASE_IN_DATE());
			this.setList_Det_EFF_PHASE_OUT_DATE(struct.getList_Det_EFF_PHASE_OUT_DATE());
			this.setList_Det_PS_SPOIL(struct.getList_Det_PS_SPOIL());
			this.setList_Det_CONS_TYP(struct.getList_Det_CONS_TYP());
			this.setList_Det_PS_LT_FLG(struct.getList_Det_PS_LT_FLG());
			this.setList_Det_PS_FIXED_LT(struct.getList_Det_PS_FIXED_LT());
			this.setList_Det_PS_PROP_LT(struct.getList_Det_PS_PROP_LT());
			this.setList_Det_PS_PROP_LOT_SIZE(struct.getList_Det_PS_PROP_LOT_SIZE());
			this.setList_Det_PS_REF_NO(struct.getList_Det_PS_REF_NO());
			this.setList_Det_COST_UP_TYP(struct.getList_Det_COST_UP_TYP());
			this.setList_Det_MRP_EXP_TYP(struct.getList_Det_MRP_EXP_TYP());
			this.setList_PS_EDITION(struct.getList_PS_EDITION());
			this.setList_Sub1Parent_ITEM_NAME(struct.getList_Sub1Parent_ITEM_NAME());
			this.setList_Sub1Comp_ITEM_NAME(struct.getList_Sub1Comp_ITEM_NAME());
			this.setList_Sub1_PS_UNIT_NUMERATOR(struct.getList_Sub1_PS_UNIT_NUMERATOR());
			this.setList_Sub1_PS_UNIT_DENOMINATOR(struct.getList_Sub1_PS_UNIT_DENOMINATOR());
			this.setList_Sub1_STOCK_UNIT(struct.getList_Sub1_STOCK_UNIT());
			this.setList_Sub1Comp_STOCK_UNIT(struct.getList_Sub1Comp_STOCK_UNIT());
			this.setList_Sub1_EFF_PHASE_IN_DATE(struct.getList_Sub1_EFF_PHASE_IN_DATE());
			this.setList_Sub1_EFF_PHASE_OUT_DATE(struct.getList_Sub1_EFF_PHASE_OUT_DATE());
			this.setList_Sub1_PS_SPOIL(struct.getList_Sub1_PS_SPOIL());
			this.setList_Sub1_CONS_TYP(struct.getList_Sub1_CONS_TYP());
			this.setList_h_Sub1_PS_LT_FLG(struct.getList_h_Sub1_PS_LT_FLG());
			this.setList_Sub1_PS_FIXED_LT(struct.getList_Sub1_PS_FIXED_LT());
			this.setList_Sub1_PS_PROP_LT(struct.getList_Sub1_PS_PROP_LT());
			this.setList_Sub1_PS_PROP_LOT_SIZE(struct.getList_Sub1_PS_PROP_LOT_SIZE());
			this.setList_Sub1_PS_REF_NO(struct.getList_Sub1_PS_REF_NO());
			this.setList_Sub1_COST_UP_TYP(struct.getList_Sub1_COST_UP_TYP());
			this.setList_Sub1_MRP_EXP_TYP(struct.getList_Sub1_MRP_EXP_TYP());
			this.setList_h_Sub1_MODIFY_COUNT(struct.getList_h_Sub1_MODIFY_COUNT());
			this.setList_Sub1Parent_ITEM_CD(struct.getList_Sub1Parent_ITEM_CD());
			this.setList_Sub1Comp_ITEM_CD(struct.getList_Sub1Comp_ITEM_CD());
			this.setList_Sub1_PS_EDITION(struct.getList_Sub1_PS_EDITION());
			this.setList_KBN1(struct.getList_KBN1());
			this.setList_KBN2(struct.getList_KBN2());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_PROC_CD(struct.getList_PROC_CD());
			this.setList_PROC_NO(struct.getList_PROC_NO());
			this.setList_PROC_NAME(struct.getList_PROC_NAME());
			this.setList_WS_CD(struct.getList_WS_CD());
			this.setList_MODIFY_CNT_PROC(struct.getList_MODIFY_CNT_PROC());
			this.setList_EFF_PHASE_IN_DATE(struct.getList_EFF_PHASE_IN_DATE());
			this.setList_EFF_PHASE_OUT_DATE(struct.getList_EFF_PHASE_OUT_DATE());
			this.setList_MODIFY_CNT_ISSUE(struct.getList_MODIFY_CNT_ISSUE());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_PS_REF_NO(struct.getList_PS_REF_NO());
			this.setList_FIRST_PROC_NO(struct.getList_FIRST_PROC_NO());
			this.setList_TargetDate_IN(struct.getList_TargetDate_IN());
			this.setList_TargetDate_OUT(struct.getList_TargetDate_OUT());
			this.setList_Det2ITEM_CD(struct.getList_Det2ITEM_CD());
			this.setList_Det2PROC_CD(struct.getList_Det2PROC_CD());
			this.setList_Det2PROC_NO(struct.getList_Det2PROC_NO());
			this.setList_Det2PROC_NAME(struct.getList_Det2PROC_NAME());
			this.setList_Det2WS_CD(struct.getList_Det2WS_CD());
			this.setList_Det2COMPANY_CD(struct.getList_Det2COMPANY_CD());
			this.setList_Det2VEND_CD(struct.getList_Det2VEND_CD());
			this.setList_Det2FIXED_LT(struct.getList_Det2FIXED_LT());
			this.setList_Det2PROP_LT(struct.getList_Det2PROP_LT());
			this.setList_Det2SAFETY_LT(struct.getList_Det2SAFETY_LT());
			this.setList_Det2PROP_LOT_SIZE(struct.getList_Det2PROP_LOT_SIZE());
			this.setList_Det2SPOIL(struct.getList_Det2SPOIL());
			this.setList_Det2OUTSIDE_TYP(struct.getList_Det2OUTSIDE_TYP());
			this.setList_Det2ACPT_INSPC_TYP(struct.getList_Det2ACPT_INSPC_TYP());
			this.setList_Det2STANDARD_COST(struct.getList_Det2STANDARD_COST());
			this.setList_Det2ITEM_NAME(struct.getList_Det2ITEM_NAME());
			this.setList_Det2WS_NAME(struct.getList_Det2WS_NAME());
			this.setList_Det2VEND_NAME(struct.getList_Det2VEND_NAME());
			this.setList_Sub2_ITEM_CD(struct.getList_Sub2_ITEM_CD());
			this.setList_Sub2_PROC_CD(struct.getList_Sub2_PROC_CD());
			this.setList_Sub2_PROC_NO(struct.getList_Sub2_PROC_NO());
			this.setList_Sub2_PROC_NAME(struct.getList_Sub2_PROC_NAME());
			this.setList_Sub2_WS_CD(struct.getList_Sub2_WS_CD());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_Sub2_VEND_CD(struct.getList_Sub2_VEND_CD());
			this.setList_Sub2_FIXED_LT(struct.getList_Sub2_FIXED_LT());
			this.setList_Sub2_PROP_LT(struct.getList_Sub2_PROP_LT());
			this.setList_Sub2_SAFETY_LT(struct.getList_Sub2_SAFETY_LT());
			this.setList_Sub2_PROP_LOT_SIZE(struct.getList_Sub2_PROP_LOT_SIZE());
			this.setList_Sub2_SPOIL(struct.getList_Sub2_SPOIL());
			this.setList_Sub2_OUTSIDE_TYP(struct.getList_Sub2_OUTSIDE_TYP());
			this.setList_Sub2_ACPT_INSPC_TYP(struct.getList_Sub2_ACPT_INSPC_TYP());
			this.setList_Sub2_STANDARD_COST(struct.getList_Sub2_STANDARD_COST());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_DRAW_CD(struct.getList_DRAW_CD());
			this.setList_SPEC(struct.getList_SPEC());
			this.setList_MRP_ODR_TYP(struct.getList_MRP_ODR_TYP());
			this.setList_ITEM_OUTSIDE_TYP(struct.getList_ITEM_OUTSIDE_TYP());
			this.setList_OPR_RSLT_TYP(struct.getList_OPR_RSLT_TYP());
			this.setList_ITEM_FIXED_LT(struct.getList_ITEM_FIXED_LT());
			this.setList_ITEM_PROP_LT(struct.getList_ITEM_PROP_LT());
			this.setList_ITEM_PROP_LOT_SIZE(struct.getList_ITEM_PROP_LOT_SIZE());
			this.setList_ITEM_ISSUE_LT(struct.getList_ITEM_ISSUE_LT());
			this.setList_ITEM_SAFETY_LT(struct.getList_ITEM_SAFETY_LT());
			this.setList_UNIT_QTY_TYP(struct.getList_UNIT_QTY_TYP());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_FIXED_LT(struct.getList_FIXED_LT());
			this.setList_PROP_LT(struct.getList_PROP_LT());
			this.setList_SAFETY_LT(struct.getList_SAFETY_LT());
			this.setList_PROP_LOT_SIZE(struct.getList_PROP_LOT_SIZE());
			this.setList_SPOIL(struct.getList_SPOIL());
			this.setList_OUTSIDE_TYP(struct.getList_OUTSIDE_TYP());
			this.setList_ACPT_INSPC_TYP(struct.getList_ACPT_INSPC_TYP());
			this.setList_STANDARD_COST(struct.getList_STANDARD_COST());
			this.setList_UNIT_QTY(struct.getList_UNIT_QTY());
			this.setList_WORK_TIME(struct.getList_WORK_TIME());
			this.setList_WS_NAME(struct.getList_WS_NAME());
			this.setList_VEND_NAME(struct.getList_VEND_NAME());
			this.setList_h_Sub2_MODIFY_COUNT(struct.getList_h_Sub2_MODIFY_COUNT());
			this.setList_Sub2_ITEM_NAME(struct.getList_Sub2_ITEM_NAME());
			this.setList_Sub2_STOCK_UNIT(struct.getList_Sub2_STOCK_UNIT());
			this.setList_Sub2_WS_NAME(struct.getList_Sub2_WS_NAME());
			this.setList_Sub2_VEND_NAME(struct.getList_Sub2_VEND_NAME());
			this.setList_PS_UNIT_DENOMINATOR(struct.getList_PS_UNIT_DENOMINATOR());
			this.setList_PS_UNIT_NUMERATOR(struct.getList_PS_UNIT_NUMERATOR());
			this.setList_PARENT_ITEM_CD(struct.getList_PARENT_ITEM_CD());
			this.setList_COMP_ITEM_CD(struct.getList_COMP_ITEM_CD());
			this.setList_SUM_FIXED_LT(struct.getList_SUM_FIXED_LT());
			this.setList_SUM_PROP_LT(struct.getList_SUM_PROP_LT());
			this.setList_BY_PRODUCT_CD(struct.getList_BY_PRODUCT_CD());
			this.setList_BUSINESS_OPR_DATE(struct.getList_BUSINESS_OPR_DATE());
			this.setList_PARAM_RESULT_DATA(struct.getList_PARAM_RESULT_DATA());
			this.setList_PARAM_INPUT_DATA(struct.getList_PARAM_INPUT_DATA());
			this.setList_Lower_MANHOUR_TYP(struct.getList_Lower_MANHOUR_TYP());
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
	// �� 1 �ϐ������l�F i_Target_ITEM_CD


	final static String i_Target_ITEM_CD = null;

	// �� 2 �ϐ������l�F i_DEVELOP_TYP


	final static String i_DEVELOP_TYP = null;

	// �� 3 �ϐ������l�F i_InitLevel


	final static String i_InitLevel = null;

	// �� 4 �ϐ������l�F i_id


	final static String i_id = null;

	// �� 5 �ϐ������l�F i_lvl


	final static String i_lvl = null;

	// �� 6 �ϐ������l�F i_parent


	final static String i_parent = null;

	// �� 7 �ϐ������l�F i_label


	final static String i_label = null;

	// �� 8 �ϐ������l�F i_ctx


	final static String i_ctx = null;

	// �� 9 �ϐ������l�F i_maxid


	final static String i_maxid = null;

	// �� 10 �ϐ������l�F i_TargetDate


	final static String i_TargetDate = null;

	// �� 11 �ϐ������l�F i_h_Target_ITEM_CD


	final static String i_h_Target_ITEM_CD = null;

	// �� 12 �ϐ������l�F i_h_TargetDate


	final static String i_h_TargetDate = null;

	// �� 13 �ϐ������l�F i_h_DEVELOP_TYP


	final static String i_h_DEVELOP_TYP = null;

	// �� 14 �ϐ������l�F i_h_InitLevel


	final static String i_h_InitLevel = null;

	// �� 15 �ϐ������l�F i_DEVELOP_TYP_name


	final static String i_DEVELOP_TYP_name = null;

	// �� 16 �ϐ������l�F i_DEVELOP_TYP_val


	final static String i_DEVELOP_TYP_val = null;

	// �� 17 �ϐ������l�F i_h_ProcTyp


	final static String i_h_ProcTyp = null;

	// �� 18 �ϐ������l�F i_h_MaxLevel


	final static String i_h_MaxLevel = null;

	// �� 19 �ϐ������l�F i_DET_TYP


	final static String i_DET_TYP = null;

	// �� 20 �ϐ������l�F i_Sub2_OUTSIDE_TYP_name


	final static String i_Sub2_OUTSIDE_TYP_name = null;

	// �� 21 �ϐ������l�F i_Sub2_OUTSIDE_TYP_val


	final static String i_Sub2_OUTSIDE_TYP_val = null;

	// �� 22 �ϐ������l�F i_Sub2_ACPT_INSPC_TYP_name


	final static String i_Sub2_ACPT_INSPC_TYP_name = null;

	// �� 23 �ϐ������l�F i_Sub2_ACPT_INSPC_TYP_val


	final static String i_Sub2_ACPT_INSPC_TYP_val = null;

	// �� 24 �ϐ������l�F i_h_Sub1Parent_ITEM_CD


	final static String i_h_Sub1Parent_ITEM_CD = null;

	// �� 25 �ϐ������l�F i_h_Sub1Comp_ITEM_CD


	final static String i_h_Sub1Comp_ITEM_CD = null;

	// �� 26 �ϐ������l�F i_h_Sub1_PS_EDITION


	final static String i_h_Sub1_PS_EDITION = null;

	// �� 27 �ϐ������l�F i_Sub1_CONS_TYP_name


	final static String i_Sub1_CONS_TYP_name = null;

	// �� 28 �ϐ������l�F i_Sub1_CONS_TYP_val


	final static String i_Sub1_CONS_TYP_val = null;

	// �� 29 �ϐ������l�F i_c_Sub1_PS_LT_FLG


	final static String i_c_Sub1_PS_LT_FLG = null;

	// �� 30 �ϐ������l�F i_Sub1_COST_UP_TYP_name


	final static String i_Sub1_COST_UP_TYP_name = null;

	// �� 31 �ϐ������l�F i_Sub1_COST_UP_TYP_val


	final static String i_Sub1_COST_UP_TYP_val = null;

	// �� 32 �ϐ������l�F i_Sub1_MRP_EXP_TYP_name


	final static String i_Sub1_MRP_EXP_TYP_name = null;

	// �� 33 �ϐ������l�F i_Sub1_MRP_EXP_TYP_val


	final static String i_Sub1_MRP_EXP_TYP_val = null;

	// �� 34 �ϐ������l�F i_h_Target_ITEM_CD2


	final static String i_h_Target_ITEM_CD2 = null;

	// �� 35 �ϐ������l�F i_h_TargetDate2


	final static String i_h_TargetDate2 = null;

	// �� 36 �ϐ������l�F i_h_DEVELOP_TYP2


	final static String i_h_DEVELOP_TYP2 = null;

	// �� 37 �ϐ������l�F i_h_InitLevel2


	final static String i_h_InitLevel2 = null;

	// �� 38 �ϐ������l�F i_h_Sub2_PROC_NO


	final static String i_h_Sub2_PROC_NO = null;

	// �� 39 �ϐ������l�F i_FIRST_PROC


	final static String i_FIRST_PROC = null;

	// �� 40 �ϐ������l�F i_h_Sub1_PS_UNIT_NUMERATOR


	final static String i_h_Sub1_PS_UNIT_NUMERATOR = null;

	// �� 41 �ϐ������l�F i_h_Sub1_PS_UNIT_DENOMINATOR


	final static String i_h_Sub1_PS_UNIT_DENOMINATOR = null;

	// �� 42 �ϐ������l�F i_AA0180010tree1


	final static String i_AA0180010tree1 = null;

	// �� 43 �ϐ������l�F i_sub2_STOCK_UNIT_1


	final static String i_sub2_STOCK_UNIT_1 = null;

	// �� 44 �ϐ������l�F i_sub2_STOCK_UNIT_2


	final static String i_sub2_STOCK_UNIT_2 = null;

	// �� 45 �ϐ������l�F i_sub2_STOCK_UNIT_3


	final static String i_sub2_STOCK_UNIT_3 = null;

	// �� 46 �ϐ������l�F i_Det2FIXED_LT_UNIT


	final static String i_Det2FIXED_LT_UNIT = null;

	// �� 47 �ϐ������l�F i_Det2PROP_LT_UNIT


	final static String i_Det2PROP_LT_UNIT = null;

	// �� 48 �ϐ������l�F i_Det2PROP_LOT_SIZE_UNIT


	final static String i_Det2PROP_LOT_SIZE_UNIT = null;

	// �� 49 �ϐ������l�F i_Det2SAFETY_LT_UNIT


	final static String i_Det2SAFETY_LT_UNIT = null;

	// �� 50 �ϐ������l�F i_MANHOUR_TYP


	final static String i_MANHOUR_TYP = null;

	// �� 51 �ϐ������l�F i_Lower_ITEM_NAME


	final static String i_Lower_ITEM_NAME = null;

	// �� 52 �ϐ������l�F i_Lower_STOCK_UNIT


	final static String i_Lower_STOCK_UNIT = null;

	// �� 53 �ϐ������l�F i_Lower_ITEM_CD


	final static String i_Lower_ITEM_CD = null;

	// �� 54 �ϐ������l�F i_Upper_ITEM_NAME


	final static String i_Upper_ITEM_NAME = null;

	// �� 55 �ϐ������l�F i_Upper_ITEM_CD


	final static String i_Upper_ITEM_CD = null;

	// �� 56 �ϐ������l�F i_DetParent_ITEM_CD


	final static String i_DetParent_ITEM_CD = null;

	// �� 57 �ϐ������l�F i_DetParent_ITEM_NAME


	final static String i_DetParent_ITEM_NAME = null;

	// �� 58 �ϐ������l�F i_DetParent_MRP_ODR_TYP


	final static String i_DetParent_MRP_ODR_TYP = null;

	// �� 59 �ϐ������l�F i_DetParent_OUTSIDE_TYP


	final static String i_DetParent_OUTSIDE_TYP = null;

	// �� 60 �ϐ������l�F i_DetComp_ITEM_CD


	final static String i_DetComp_ITEM_CD = null;

	// �� 61 �ϐ������l�F i_DetComp_ITEM_NAME


	final static String i_DetComp_ITEM_NAME = null;

	// �� 62 �ϐ������l�F i_DetComp_MRP_ODR_TYP


	final static String i_DetComp_MRP_ODR_TYP = null;

	// �� 63 �ϐ������l�F i_DetComp_OUTSIDE_TYP


	final static String i_DetComp_OUTSIDE_TYP = null;

	// �� 64 �ϐ������l�F i_Det_MANHOUR_TYP


	final static String i_Det_MANHOUR_TYP = null;

	// �� 65 �ϐ������l�F i_Det_PS_EDITION


	final static String i_Det_PS_EDITION = null;

	// �� 66 �ϐ������l�F i_Det_PS_UNIT_QTY


	final static String i_Det_PS_UNIT_QTY = null;

	// �� 67 �ϐ������l�F i_Det_STOCK_UNIT


	final static String i_Det_STOCK_UNIT = null;

	// �� 68 �ϐ������l�F i_Det_EFF_PHASE_IN_DATE


	final static String i_Det_EFF_PHASE_IN_DATE = null;

	// �� 69 �ϐ������l�F i_Det_EFF_PHASE_OUT_DATE


	final static String i_Det_EFF_PHASE_OUT_DATE = null;

	// �� 70 �ϐ������l�F i_Det_PS_SPOIL


	final static String i_Det_PS_SPOIL = null;

	// �� 71 �ϐ������l�F i_Det_CONS_TYP


	final static String i_Det_CONS_TYP = null;

	// �� 72 �ϐ������l�F i_Det_PS_LT_FLG


	final static String i_Det_PS_LT_FLG = null;

	// �� 73 �ϐ������l�F i_Det_PS_FIXED_LT


	final static String i_Det_PS_FIXED_LT = null;

	// �� 74 �ϐ������l�F i_Det_PS_PROP_LT


	final static String i_Det_PS_PROP_LT = null;

	// �� 75 �ϐ������l�F i_Det_PS_PROP_LOT_SIZE


	final static String i_Det_PS_PROP_LOT_SIZE = null;

	// �� 76 �ϐ������l�F i_Det_PS_REF_NO


	final static String i_Det_PS_REF_NO = null;

	// �� 77 �ϐ������l�F i_Det_COST_UP_TYP


	final static String i_Det_COST_UP_TYP = null;

	// �� 78 �ϐ������l�F i_Det_MRP_EXP_TYP


	final static String i_Det_MRP_EXP_TYP = null;

	// �� 79 �ϐ������l�F i_PS_EDITION


	final static String i_PS_EDITION = null;

	// �� 80 �ϐ������l�F i_Sub1Parent_ITEM_NAME


	final static String i_Sub1Parent_ITEM_NAME = null;

	// �� 81 �ϐ������l�F i_Sub1Comp_ITEM_NAME


	final static String i_Sub1Comp_ITEM_NAME = null;

	// �� 82 �ϐ������l�F i_Sub1_PS_UNIT_NUMERATOR


	final static String i_Sub1_PS_UNIT_NUMERATOR = null;

	// �� 83 �ϐ������l�F i_Sub1_PS_UNIT_DENOMINATOR


	final static String i_Sub1_PS_UNIT_DENOMINATOR = null;

	// �� 84 �ϐ������l�F i_Sub1_STOCK_UNIT


	final static String i_Sub1_STOCK_UNIT = null;

	// �� 85 �ϐ������l�F i_Sub1Comp_STOCK_UNIT


	final static String i_Sub1Comp_STOCK_UNIT = null;

	// �� 86 �ϐ������l�F i_Sub1_EFF_PHASE_IN_DATE


	final static String i_Sub1_EFF_PHASE_IN_DATE = null;

	// �� 87 �ϐ������l�F i_Sub1_EFF_PHASE_OUT_DATE


	final static String i_Sub1_EFF_PHASE_OUT_DATE = null;

	// �� 88 �ϐ������l�F i_Sub1_PS_SPOIL


	final static String i_Sub1_PS_SPOIL = null;

	// �� 89 �ϐ������l�F i_Sub1_CONS_TYP


	final static String i_Sub1_CONS_TYP = null;

	// �� 90 �ϐ������l�F i_h_Sub1_PS_LT_FLG


	final static String i_h_Sub1_PS_LT_FLG = null;

	// �� 91 �ϐ������l�F i_Sub1_PS_FIXED_LT


	final static String i_Sub1_PS_FIXED_LT = null;

	// �� 92 �ϐ������l�F i_Sub1_PS_PROP_LT


	final static String i_Sub1_PS_PROP_LT = null;

	// �� 93 �ϐ������l�F i_Sub1_PS_PROP_LOT_SIZE


	final static String i_Sub1_PS_PROP_LOT_SIZE = null;

	// �� 94 �ϐ������l�F i_Sub1_PS_REF_NO


	final static String i_Sub1_PS_REF_NO = null;

	// �� 95 �ϐ������l�F i_Sub1_COST_UP_TYP


	final static String i_Sub1_COST_UP_TYP = null;

	// �� 96 �ϐ������l�F i_Sub1_MRP_EXP_TYP


	final static String i_Sub1_MRP_EXP_TYP = null;

	// �� 97 �ϐ������l�F i_h_Sub1_MODIFY_COUNT


	final static String i_h_Sub1_MODIFY_COUNT = null;

	// �� 98 �ϐ������l�F i_Sub1Parent_ITEM_CD


	final static String i_Sub1Parent_ITEM_CD = null;

	// �� 99 �ϐ������l�F i_Sub1Comp_ITEM_CD


	final static String i_Sub1Comp_ITEM_CD = null;

	// �� 100 �ϐ������l�F i_Sub1_PS_EDITION


	final static String i_Sub1_PS_EDITION = null;

	// �� 101 �ϐ������l�F i_KBN1


	final static String i_KBN1 = null;

	// �� 102 �ϐ������l�F i_KBN2


	final static String i_KBN2 = null;

	// �� 103 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 104 �ϐ������l�F i_PROC_CD


	final static String i_PROC_CD = null;

	// �� 105 �ϐ������l�F i_PROC_NO


	final static String i_PROC_NO = null;

	// �� 106 �ϐ������l�F i_PROC_NAME


	final static String i_PROC_NAME = null;

	// �� 107 �ϐ������l�F i_WS_CD


	final static String i_WS_CD = null;

	// �� 108 �ϐ������l�F i_MODIFY_CNT_PROC


	final static String i_MODIFY_CNT_PROC = null;

	// �� 109 �ϐ������l�F i_EFF_PHASE_IN_DATE


	final static String i_EFF_PHASE_IN_DATE = null;

	// �� 110 �ϐ������l�F i_EFF_PHASE_OUT_DATE


	final static String i_EFF_PHASE_OUT_DATE = null;

	// �� 111 �ϐ������l�F i_MODIFY_CNT_ISSUE


	final static String i_MODIFY_CNT_ISSUE = null;

	// �� 112 �ϐ������l�F i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// �� 113 �ϐ������l�F i_PS_REF_NO


	final static String i_PS_REF_NO = null;

	// �� 114 �ϐ������l�F i_FIRST_PROC_NO


	final static String i_FIRST_PROC_NO = null;

	// �� 115 �ϐ������l�F i_TargetDate_IN


	final static String i_TargetDate_IN = null;

	// �� 116 �ϐ������l�F i_TargetDate_OUT


	final static String i_TargetDate_OUT = null;

	// �� 117 �ϐ������l�F i_Det2ITEM_CD


	final static String i_Det2ITEM_CD = null;

	// �� 118 �ϐ������l�F i_Det2PROC_CD


	final static String i_Det2PROC_CD = null;

	// �� 119 �ϐ������l�F i_Det2PROC_NO


	final static String i_Det2PROC_NO = null;

	// �� 120 �ϐ������l�F i_Det2PROC_NAME


	final static String i_Det2PROC_NAME = null;

	// �� 121 �ϐ������l�F i_Det2WS_CD


	final static String i_Det2WS_CD = null;

	// �� 122 �ϐ������l�F i_Det2COMPANY_CD


	final static String i_Det2COMPANY_CD = null;

	// �� 123 �ϐ������l�F i_Det2VEND_CD


	final static String i_Det2VEND_CD = null;

	// �� 124 �ϐ������l�F i_Det2FIXED_LT


	final static String i_Det2FIXED_LT = null;

	// �� 125 �ϐ������l�F i_Det2PROP_LT


	final static String i_Det2PROP_LT = null;

	// �� 126 �ϐ������l�F i_Det2SAFETY_LT


	final static String i_Det2SAFETY_LT = null;

	// �� 127 �ϐ������l�F i_Det2PROP_LOT_SIZE


	final static String i_Det2PROP_LOT_SIZE = null;

	// �� 128 �ϐ������l�F i_Det2SPOIL


	final static String i_Det2SPOIL = null;

	// �� 129 �ϐ������l�F i_Det2OUTSIDE_TYP


	final static String i_Det2OUTSIDE_TYP = null;

	// �� 130 �ϐ������l�F i_Det2ACPT_INSPC_TYP


	final static String i_Det2ACPT_INSPC_TYP = null;

	// �� 131 �ϐ������l�F i_Det2STANDARD_COST


	final static String i_Det2STANDARD_COST = null;

	// �� 132 �ϐ������l�F i_Det2ITEM_NAME


	final static String i_Det2ITEM_NAME = null;

	// �� 133 �ϐ������l�F i_Det2WS_NAME


	final static String i_Det2WS_NAME = null;

	// �� 134 �ϐ������l�F i_Det2VEND_NAME


	final static String i_Det2VEND_NAME = null;

	// �� 135 �ϐ������l�F i_Sub2_ITEM_CD


	final static String i_Sub2_ITEM_CD = null;

	// �� 136 �ϐ������l�F i_Sub2_PROC_CD


	final static String i_Sub2_PROC_CD = null;

	// �� 137 �ϐ������l�F i_Sub2_PROC_NO


	final static String i_Sub2_PROC_NO = null;

	// �� 138 �ϐ������l�F i_Sub2_PROC_NAME


	final static String i_Sub2_PROC_NAME = null;

	// �� 139 �ϐ������l�F i_Sub2_WS_CD


	final static String i_Sub2_WS_CD = null;

	// �� 140 �ϐ������l�F i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// �� 141 �ϐ������l�F i_Sub2_VEND_CD


	final static String i_Sub2_VEND_CD = null;

	// �� 142 �ϐ������l�F i_Sub2_FIXED_LT


	final static String i_Sub2_FIXED_LT = null;

	// �� 143 �ϐ������l�F i_Sub2_PROP_LT


	final static String i_Sub2_PROP_LT = null;

	// �� 144 �ϐ������l�F i_Sub2_SAFETY_LT


	final static String i_Sub2_SAFETY_LT = null;

	// �� 145 �ϐ������l�F i_Sub2_PROP_LOT_SIZE


	final static String i_Sub2_PROP_LOT_SIZE = null;

	// �� 146 �ϐ������l�F i_Sub2_SPOIL


	final static String i_Sub2_SPOIL = null;

	// �� 147 �ϐ������l�F i_Sub2_OUTSIDE_TYP


	final static String i_Sub2_OUTSIDE_TYP = null;

	// �� 148 �ϐ������l�F i_Sub2_ACPT_INSPC_TYP


	final static String i_Sub2_ACPT_INSPC_TYP = null;

	// �� 149 �ϐ������l�F i_Sub2_STANDARD_COST


	final static String i_Sub2_STANDARD_COST = null;

	// �� 150 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 151 �ϐ������l�F i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// �� 152 �ϐ������l�F i_DRAW_CD


	final static String i_DRAW_CD = null;

	// �� 153 �ϐ������l�F i_SPEC


	final static String i_SPEC = null;

	// �� 154 �ϐ������l�F i_MRP_ODR_TYP


	final static Integer i_MRP_ODR_TYP = null;

	// �� 155 �ϐ������l�F i_ITEM_OUTSIDE_TYP


	final static Integer i_ITEM_OUTSIDE_TYP = null;

	// �� 156 �ϐ������l�F i_OPR_RSLT_TYP


	final static Integer i_OPR_RSLT_TYP = null;

	// �� 157 �ϐ������l�F i_ITEM_FIXED_LT


	final static Long i_ITEM_FIXED_LT = null;

	// �� 158 �ϐ������l�F i_ITEM_PROP_LT


	final static Long i_ITEM_PROP_LT = null;

	// �� 159 �ϐ������l�F i_ITEM_PROP_LOT_SIZE


	final static String i_ITEM_PROP_LOT_SIZE = null;

	// �� 160 �ϐ������l�F i_ITEM_ISSUE_LT


	final static Long i_ITEM_ISSUE_LT = null;

	// �� 161 �ϐ������l�F i_ITEM_SAFETY_LT


	final static Long i_ITEM_SAFETY_LT = null;

	// �� 162 �ϐ������l�F i_UNIT_QTY_TYP


	final static Integer i_UNIT_QTY_TYP = null;

	// �� 163 �ϐ������l�F i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// �� 164 �ϐ������l�F i_VEND_CD


	final static String i_VEND_CD = null;

	// �� 165 �ϐ������l�F i_FIXED_LT


	final static String i_FIXED_LT = null;

	// �� 166 �ϐ������l�F i_PROP_LT


	final static String i_PROP_LT = null;

	// �� 167 �ϐ������l�F i_SAFETY_LT


	final static String i_SAFETY_LT = null;

	// �� 168 �ϐ������l�F i_PROP_LOT_SIZE


	final static String i_PROP_LOT_SIZE = null;

	// �� 169 �ϐ������l�F i_SPOIL


	final static String i_SPOIL = null;

	// �� 170 �ϐ������l�F i_OUTSIDE_TYP


	final static Integer i_OUTSIDE_TYP = null;

	// �� 171 �ϐ������l�F i_ACPT_INSPC_TYP


	final static Integer i_ACPT_INSPC_TYP = null;

	// �� 172 �ϐ������l�F i_STANDARD_COST


	final static String i_STANDARD_COST = null;

	// �� 173 �ϐ������l�F i_UNIT_QTY


	final static String i_UNIT_QTY = null;

	// �� 174 �ϐ������l�F i_WORK_TIME


	final static String i_WORK_TIME = null;

	// �� 175 �ϐ������l�F i_WS_NAME


	final static String i_WS_NAME = null;

	// �� 176 �ϐ������l�F i_VEND_NAME


	final static String i_VEND_NAME = null;

	// �� 177 �ϐ������l�F i_h_Sub2_MODIFY_COUNT


	final static String i_h_Sub2_MODIFY_COUNT = null;

	// �� 178 �ϐ������l�F i_Sub2_ITEM_NAME


	final static String i_Sub2_ITEM_NAME = null;

	// �� 179 �ϐ������l�F i_Sub2_STOCK_UNIT


	final static String i_Sub2_STOCK_UNIT = null;

	// �� 180 �ϐ������l�F i_Sub2_WS_NAME


	final static String i_Sub2_WS_NAME = null;

	// �� 181 �ϐ������l�F i_Sub2_VEND_NAME


	final static String i_Sub2_VEND_NAME = null;

	// �� 182 �ϐ������l�F i_PS_UNIT_DENOMINATOR


	final static String i_PS_UNIT_DENOMINATOR = null;

	// �� 183 �ϐ������l�F i_PS_UNIT_NUMERATOR


	final static String i_PS_UNIT_NUMERATOR = null;

	// �� 184 �ϐ������l�F i_PARENT_ITEM_CD


	final static String i_PARENT_ITEM_CD = null;

	// �� 185 �ϐ������l�F i_COMP_ITEM_CD


	final static String i_COMP_ITEM_CD = null;

	// �� 186 �ϐ������l�F i_SUM_FIXED_LT


	final static String i_SUM_FIXED_LT = null;

	// �� 187 �ϐ������l�F i_SUM_PROP_LT


	final static String i_SUM_PROP_LT = null;

	// �� 188 �ϐ������l�F i_BY_PRODUCT_CD


	final static String i_BY_PRODUCT_CD = null;

	// �� 189 �ϐ������l�F i_BUSINESS_OPR_DATE


	final static String i_BUSINESS_OPR_DATE = null;

	// �� 190 �ϐ������l�F i_PARAM_RESULT_DATA


	final static String i_PARAM_RESULT_DATA = null;

	// �� 191 �ϐ������l�F i_PARAM_INPUT_DATA


	final static String i_PARAM_INPUT_DATA = null;

	// �� 192 �ϐ������l�F i_Lower_MANHOUR_TYP


	final static String i_Lower_MANHOUR_TYP = null;

*/

	//{{user_implement_code
       
        // �� 1 �ϐ������l�F i_Lower_ITEM_NAME
        final static String i_Lower_ITEM_NAME = null;
        // �� 2 �ϐ������l�F i_Lower_ITEM_CD
        final static String i_Lower_ITEM_CD = null;
        // �� 3 �ϐ������l�F i_Upper_ITEM_NAME
        final static String i_Upper_ITEM_NAME = null;
        // �� 4 �ϐ������l�F i_Upper_ITEM_CD
        final static String i_Upper_ITEM_CD = null;
        // �� 5 �ϐ������l�F i_DetParent_ITEM_CD
        final static String i_DetParent_ITEM_CD = null;
        // �� 6 �ϐ������l�F i_DetParent_ITEM_NAME
        final static String i_DetParent_ITEM_NAME = null;
        // �� 7 �ϐ������l�F i_DetParent_MRP_ODR_TYP
        final static String i_DetParent_MRP_ODR_TYP = null;
        // �� 8 �ϐ������l�F i_DetParent_OUTSIDE_TYP
        final static String i_DetParent_OUTSIDE_TYP = null;
        // �� 9 �ϐ������l�F i_DetComp_ITEM_CD
        final static String i_DetComp_ITEM_CD = null;
        // �� 10 �ϐ������l�F i_DetComp_ITEM_NAME
        final static String i_DetComp_ITEM_NAME = null;
        // �� 11 �ϐ������l�F i_DetComp_MRP_ODR_TYP
        final static String i_DetComp_MRP_ODR_TYP = null;
        // �� 12 �ϐ������l�F i_DetComp_OUTSIDE_TYP
        final static String i_DetComp_OUTSIDE_TYP = null;
        // �� 13 �ϐ������l�F i_Det_PS_EDITION
        final static String i_Det_PS_EDITION = null;
        // �� 14 �ϐ������l�F i_Det_PS_UNIT_QTY
        final static String i_Det_PS_UNIT_QTY = null;
        // �� 15 �ϐ������l�F i_Det_STOCK_UNIT
        final static String i_Det_STOCK_UNIT = null;
        // �� 16 �ϐ������l�F i_Det_EFF_PHASE_IN_DATE
        final static String i_Det_EFF_PHASE_IN_DATE = null;
        // �� 17 �ϐ������l�F i_Det_EFF_PHASE_OUT_DATE
        final static String i_Det_EFF_PHASE_OUT_DATE = null;
        // �� 18 �ϐ������l�F i_Det_PS_SPOIL
        final static String i_Det_PS_SPOIL = null;
        // �� 19 �ϐ������l�F i_Det_CONS_TYP
        final static String i_Det_CONS_TYP = null;
        // �� 20 �ϐ������l�F i_Det_PS_LT_FLG
        final static String i_Det_PS_LT_FLG = null;
        // �� 21 �ϐ������l�F i_Det_PS_FIXED_LT
        final static String i_Det_PS_FIXED_LT = null;
        // �� 22 �ϐ������l�F i_Det_PS_PROP_LT
        final static String i_Det_PS_PROP_LT = null;
        // �� 23 �ϐ������l�F i_Det_PS_PROP_LOT_SIZE
        final static String i_Det_PS_PROP_LOT_SIZE = null;
        // �� 24 �ϐ������l�F i_Det_PS_REF_NO
        final static String i_Det_PS_REF_NO = null;
        // �� 25 �ϐ������l�F i_Det_COST_UP_TYP
        final static String i_Det_COST_UP_TYP = null;
        // �� 26 �ϐ������l�F i_Det_MRP_EXP_TYP
        final static String i_Det_MRP_EXP_TYP = null;
        // �� 27 �ϐ������l�F i_PS_EDITION
        final static String i_PS_EDITION = null;
        // �� 28 �ϐ������l�F i_Sub1Parent_ITEM_NAME
        final static String i_Sub1Parent_ITEM_NAME = null;
        // �� 29 �ϐ������l�F i_Sub1Comp_ITEM_NAME
        final static String i_Sub1Comp_ITEM_NAME = null;
        // �� 30 �ϐ������l�F i_Sub1_PS_UNIT_NUMERATOR
        final static String i_Sub1_PS_UNIT_NUMERATOR = null;
        // �� 31 �ϐ������l�F i_Sub1_PS_UNIT_DENOMINATOR
        final static String i_Sub1_PS_UNIT_DENOMINATOR = null;
        // �� 32 �ϐ������l�F i_Sub1_STOCK_UNIT
        final static String i_Sub1_STOCK_UNIT = null;
        // �� 33 �ϐ������l�F i_Sub1_EFF_PHASE_IN_DATE
        final static String i_Sub1_EFF_PHASE_IN_DATE = null;
        // �� 34 �ϐ������l�F i_Sub1_EFF_PHASE_OUT_DATE
        final static String i_Sub1_EFF_PHASE_OUT_DATE = null;
        // �� 35 �ϐ������l�F i_Sub1_PS_SPOIL
        final static String i_Sub1_PS_SPOIL = null;
        // �� 36 �ϐ������l�F i_Sub1_CONS_TYP
        final static String i_Sub1_CONS_TYP = null;
        // �� 37 �ϐ������l�F i_h_Sub1_PS_LT_FLG
        final static String i_h_Sub1_PS_LT_FLG = null;
        // �� 38 �ϐ������l�F i_Sub1_PS_FIXED_LT
        final static String i_Sub1_PS_FIXED_LT = null;
        // �� 39 �ϐ������l�F i_Sub1_PS_PROP_LT
        final static String i_Sub1_PS_PROP_LT = null;
        // �� 40 �ϐ������l�F i_Sub1_PS_PROP_LOT_SIZE
        final static String i_Sub1_PS_PROP_LOT_SIZE = null;
        // �� 41 �ϐ������l�F i_Sub1_PS_REF_NO
        final static String i_Sub1_PS_REF_NO = null;
        // �� 42 �ϐ������l�F i_Sub1_COST_UP_TYP
        final static String i_Sub1_COST_UP_TYP = null;
        // �� 43 �ϐ������l�F i_Sub1_MRP_EXP_TYP
        final static String i_Sub1_MRP_EXP_TYP = null;
        // �� 44 �ϐ������l�F i_h_Sub1_MODIFY_COUNT
        final static String i_h_Sub1_MODIFY_COUNT = null;
        // �� 45 �ϐ������l�F i_Sub1Parent_ITEM_CD
        final static String i_Sub1Parent_ITEM_CD = null;
        // �� 46 �ϐ������l�F i_Sub1Comp_ITEM_CD
        final static String i_Sub1Comp_ITEM_CD = null;
        // �� 47 �ϐ������l�F i_Sub1_PS_EDITION
        final static String i_Sub1_PS_EDITION = null;
        // �� 48 �ϐ������l�F i_Target_ITEM_CD
        final static String i_Target_ITEM_CD = null;
        // �� 49 �ϐ������l�F i_DEVELOP_TYP
        final static String i_DEVELOP_TYP = null;
        // �� 50 �ϐ������l�F i_InitLevel
        final static String i_InitLevel = null;
        // �� 51 �ϐ������l�F i_AA0180010tree1
        final static String i_AA0180010tree1 = null;
        // �� 52 �ϐ������l�F i_id
        final static String i_id = null;
        // �� 53 �ϐ������l�F i_lvl
        final static String i_lvl = null;
        // �� 54 �ϐ������l�F i_parent
        final static String i_parent = null;
        // �� 55 �ϐ������l�F i_label
        final static String i_label = null;
        // �� 56 �ϐ������l�F i_ctx
        final static String i_ctx = null;
        // �� 57 �ϐ������l�F i_maxid
        final static String i_maxid = null;
        // �� 58 �ϐ������l�F i_MODIFY_COUNT
        final static String i_MODIFY_COUNT = null;
        // �� 59 �ϐ������l�F i_TargetDate
        final static String i_TargetDate = null;
        // �� 60 �ϐ������l�F i_EFF_PHASE_IN_DATE
        final static String i_EFF_PHASE_IN_DATE = null;
        // �� 61 �ϐ������l�F i_EFF_PHASE_OUT_DATE
        final static String i_EFF_PHASE_OUT_DATE = null;
        // �� 62 �ϐ������l�F i_h_Sub1Parent_ITEM_CD
        final static String i_h_Sub1Parent_ITEM_CD = null;
        // �� 63 �ϐ������l�F i_h_Sub1Comp_ITEM_CD
        final static String i_h_Sub1Comp_ITEM_CD = null;
        // �� 64 �ϐ������l�F i_h_Target_ITEM_CD
        final static String i_h_Target_ITEM_CD = null;
        // �� 65 �ϐ������l�F i_h_TargetDate
        final static String i_h_TargetDate = null;
        // �� 66 �ϐ������l�F i_h_DEVELOP_TYP
        final static String i_h_DEVELOP_TYP = null;
        // �� 67 �ϐ������l�F i_h_InitLevel
        final static String i_h_InitLevel = null;
        // �� 68 �ϐ������l�F i_h_Sub1_PS_EDITION
        final static String i_h_Sub1_PS_EDITION = null;
        // �� 69 �ϐ������l�F i_c_Sub1_PS_LT_FLG
        final static String i_c_Sub1_PS_LT_FLG = null;
        // �� 70 �ϐ������l�F i_h_ProcTyp
        final static String i_h_ProcTyp = null;
        // �� 71 �ϐ������l�F i_h_MaxLevel
        final static String i_h_MaxLevel = null;
        // �� 72 �ϐ������l�F i_PROC_CD
        final static String i_PROC_CD = null;

        /**
         * ������
         *
         */
        public void initialize()
        {
         m_Lower_ITEM_NAME = i_Lower_ITEM_NAME;
         m_Lower_ITEM_CD = i_Lower_ITEM_CD;
         m_Upper_ITEM_NAME = i_Upper_ITEM_NAME;
         m_Upper_ITEM_CD = i_Upper_ITEM_CD;
         m_DetParent_ITEM_CD = i_DetParent_ITEM_CD;
         m_DetParent_ITEM_NAME = i_DetParent_ITEM_NAME;
         m_DetParent_MRP_ODR_TYP = i_DetParent_MRP_ODR_TYP;
         m_DetParent_OUTSIDE_TYP = i_DetParent_OUTSIDE_TYP;
         m_DetComp_ITEM_CD = i_DetComp_ITEM_CD;
         m_DetComp_ITEM_NAME = i_DetComp_ITEM_NAME;
         m_DetComp_MRP_ODR_TYP = i_DetComp_MRP_ODR_TYP;
         m_DetComp_OUTSIDE_TYP = i_DetComp_OUTSIDE_TYP;
         m_Det_PS_EDITION = i_Det_PS_EDITION;
         m_Det_PS_UNIT_QTY = i_Det_PS_UNIT_QTY;
         m_Det_STOCK_UNIT = i_Det_STOCK_UNIT;
         m_Det_EFF_PHASE_IN_DATE = i_Det_EFF_PHASE_IN_DATE;
         m_Det_EFF_PHASE_OUT_DATE = i_Det_EFF_PHASE_OUT_DATE;
         m_Det_PS_SPOIL = i_Det_PS_SPOIL;
         m_Det_CONS_TYP = i_Det_CONS_TYP;
         m_Det_PS_LT_FLG = i_Det_PS_LT_FLG;
         m_Det_PS_FIXED_LT = i_Det_PS_FIXED_LT;
         m_Det_PS_PROP_LT = i_Det_PS_PROP_LT;
         m_Det_PS_PROP_LOT_SIZE = i_Det_PS_PROP_LOT_SIZE;
         m_Det_PS_REF_NO = i_Det_PS_REF_NO;
         m_Det_COST_UP_TYP = i_Det_COST_UP_TYP;
         m_Det_MRP_EXP_TYP = i_Det_MRP_EXP_TYP;
         m_PS_EDITION = i_PS_EDITION;
         m_Sub1Parent_ITEM_NAME = i_Sub1Parent_ITEM_NAME;
         m_Sub1Comp_ITEM_NAME = i_Sub1Comp_ITEM_NAME;
         m_Sub1_PS_UNIT_NUMERATOR = i_Sub1_PS_UNIT_NUMERATOR;
         m_Sub1_PS_UNIT_DENOMINATOR = i_Sub1_PS_UNIT_DENOMINATOR;
         m_Sub1_STOCK_UNIT = i_Sub1_STOCK_UNIT;
         m_Sub1_EFF_PHASE_IN_DATE = i_Sub1_EFF_PHASE_IN_DATE;
         m_Sub1_EFF_PHASE_OUT_DATE = i_Sub1_EFF_PHASE_OUT_DATE;
         m_Sub1_PS_SPOIL = i_Sub1_PS_SPOIL;
         m_Sub1_CONS_TYP = i_Sub1_CONS_TYP;
         m_h_Sub1_PS_LT_FLG = i_h_Sub1_PS_LT_FLG;
         m_Sub1_PS_FIXED_LT = i_Sub1_PS_FIXED_LT;
         m_Sub1_PS_PROP_LT = i_Sub1_PS_PROP_LT;
         m_Sub1_PS_PROP_LOT_SIZE = i_Sub1_PS_PROP_LOT_SIZE;
         m_Sub1_PS_REF_NO = i_Sub1_PS_REF_NO;
         m_Sub1_COST_UP_TYP = i_Sub1_COST_UP_TYP;
         m_Sub1_MRP_EXP_TYP = i_Sub1_MRP_EXP_TYP;
         m_h_Sub1_MODIFY_COUNT = i_h_Sub1_MODIFY_COUNT;
         m_Sub1Parent_ITEM_CD = i_Sub1Parent_ITEM_CD;
         m_Sub1Comp_ITEM_CD = i_Sub1Comp_ITEM_CD;
         m_Sub1_PS_EDITION = i_Sub1_PS_EDITION;
         m_Target_ITEM_CD = i_Target_ITEM_CD;
         m_DEVELOP_TYP = i_DEVELOP_TYP;
         m_InitLevel = i_InitLevel;
         m_AA0180010tree1 = i_AA0180010tree1;
         m_id = i_id;
         m_lvl = i_lvl;
         m_parent = i_parent;
         m_label = i_label;
         m_ctx = i_ctx;
         m_maxid = i_maxid;
         m_MODIFY_COUNT = i_MODIFY_COUNT;
         m_TargetDate = i_TargetDate;
         m_EFF_PHASE_IN_DATE = i_EFF_PHASE_IN_DATE;
         m_EFF_PHASE_OUT_DATE = i_EFF_PHASE_OUT_DATE;
         m_h_Sub1Parent_ITEM_CD = i_h_Sub1Parent_ITEM_CD;
         m_h_Sub1Comp_ITEM_CD = i_h_Sub1Comp_ITEM_CD;
         m_h_Target_ITEM_CD = i_h_Target_ITEM_CD;
         m_h_TargetDate = i_h_TargetDate;
         m_h_DEVELOP_TYP = i_h_DEVELOP_TYP;
         m_h_InitLevel = i_h_InitLevel;
         m_h_Sub1_PS_EDITION = i_h_Sub1_PS_EDITION;
         m_c_Sub1_PS_LT_FLG = i_c_Sub1_PS_LT_FLG;
         m_h_ProcTyp = i_h_ProcTyp;
         m_h_MaxLevel = i_h_MaxLevel;
         m_PROC_CD = i_PROC_CD;
       
         l_Lower_ITEM_NAME = null;
         l_Lower_ITEM_CD = null;
         l_Upper_ITEM_NAME = null;
         l_Upper_ITEM_CD = null;
         l_DetParent_ITEM_CD = null;
         l_DetParent_ITEM_NAME = null;
         l_DetParent_MRP_ODR_TYP = null;
         l_DetParent_OUTSIDE_TYP = null;
         l_DetComp_ITEM_CD = null;
         l_DetComp_ITEM_NAME = null;
         l_DetComp_MRP_ODR_TYP = null;
         l_DetComp_OUTSIDE_TYP = null;
         l_Det_PS_EDITION = null;
         l_Det_PS_UNIT_QTY = null;
         l_Det_STOCK_UNIT = null;
         l_Det_EFF_PHASE_IN_DATE = null;
         l_Det_EFF_PHASE_OUT_DATE = null;
         l_Det_PS_SPOIL = null;
         l_Det_CONS_TYP = null;
         l_Det_PS_LT_FLG = null;
         l_Det_PS_FIXED_LT = null;
         l_Det_PS_PROP_LT = null;
         l_Det_PS_PROP_LOT_SIZE = null;
         l_Det_PS_REF_NO = null;
         l_Det_COST_UP_TYP = null;
         l_Det_MRP_EXP_TYP = null;
         l_PS_EDITION = null;
         l_Sub1Parent_ITEM_NAME = null;
         l_Sub1Comp_ITEM_NAME = null;
         l_Sub1_PS_UNIT_NUMERATOR = null;
         l_Sub1_PS_UNIT_DENOMINATOR = null;
         l_Sub1_STOCK_UNIT = null;
         l_Sub1_EFF_PHASE_IN_DATE = null;
         l_Sub1_EFF_PHASE_OUT_DATE = null;
         l_Sub1_PS_SPOIL = null;
         l_Sub1_CONS_TYP = null;
         l_h_Sub1_PS_LT_FLG = null;
         l_Sub1_PS_FIXED_LT = null;
         l_Sub1_PS_PROP_LT = null;
         l_Sub1_PS_PROP_LOT_SIZE = null;
         l_Sub1_PS_REF_NO = null;
         l_Sub1_COST_UP_TYP = null;
         l_Sub1_MRP_EXP_TYP = null;
         l_h_Sub1_MODIFY_COUNT = null;
         l_Sub1Parent_ITEM_CD = null;
         l_Sub1Comp_ITEM_CD = null;
         l_Sub1_PS_EDITION = null;
         l_Target_ITEM_CD = null;
         l_DEVELOP_TYP = null;
         l_InitLevel = null;
         l_AA0180010tree1 = null;
         l_id = null;
         l_lvl = null;
         l_parent = null;
         l_label = null;
         l_ctx = null;
         l_maxid = null;
         l_MODIFY_COUNT = null;
         l_TargetDate = null;
         l_EFF_PHASE_IN_DATE = null;
         l_EFF_PHASE_OUT_DATE = null;
         l_h_Sub1Parent_ITEM_CD = null;
         l_h_Sub1Comp_ITEM_CD = null;
         l_h_Target_ITEM_CD = null;
         l_h_TargetDate = null;
         l_h_DEVELOP_TYP = null;
         l_h_InitLevel = null;
         l_h_Sub1_PS_EDITION = null;
         l_c_Sub1_PS_LT_FLG = null;
         l_h_ProcTyp = null;
         l_h_MaxLevel = null;
        }
        
//        /**
//         * �R�s�[
//         * @param struct �R�s�[�Ώ�
//         */
//        public void copy(AA0180010Struct struct)
//        {
//         if(struct.m_PLANT_CD != null) m_PLANT_CD = new String(struct.m_PLANT_CD);
//         else m_PLANT_CD = null;
//       
//         if(struct.m_ITEM_CD != null) m_ITEM_CD = new String(struct.m_ITEM_CD);
//         else m_ITEM_CD = null;
//       
//         if(struct.m_h_ITEM_CD != null) m_h_ITEM_CD = new String(struct.m_h_ITEM_CD);
//         else m_h_ITEM_CD = null;
//       
//         if(struct.m_PROC_CD != null) m_PROC_CD = new String(struct.m_PROC_CD);
//         else m_PROC_CD = null;
//       
//         if(struct.m_PROC_NO != null) m_PROC_NO = new String(struct.m_PROC_NO);
//         else m_PROC_NO = null;
//       
//         if(struct.m_PROC_NAME != null) m_PROC_NAME = new String(struct.m_PROC_NAME);
//         else m_PROC_NAME = null;
//       
//         if(struct.m_WS_CD != null) m_WS_CD = new String(struct.m_WS_CD);
//         else m_WS_CD = null;
//       
//         if(struct.m_COMPANY_CD != null) m_COMPANY_CD = new String(struct.m_COMPANY_CD);
//         else m_COMPANY_CD = null;
//       
//         if(struct.m_VEND_CD != null) m_VEND_CD = new String(struct.m_VEND_CD);
//         else m_VEND_CD = null;
//       
//         if(struct.m_FIXED_LT != null) m_FIXED_LT = new String(struct.m_FIXED_LT);
//         else m_FIXED_LT = null;
//       
//         if(struct.m_PROP_LT != null) m_PROP_LT = new String(struct.m_PROP_LT);
//         else m_PROP_LT = null;
//       
//         if(struct.m_SAFETY_LT != null) m_SAFETY_LT = new String(struct.m_SAFETY_LT);
//         else m_SAFETY_LT = null;
//       
//         if(struct.m_PROP_LOT_SIZE != null) m_PROP_LOT_SIZE = new String(struct.m_PROP_LOT_SIZE);
//         else m_PROP_LOT_SIZE = null;
//       
//         if(struct.m_SPOIL != null) m_SPOIL = new String(struct.m_SPOIL);
//         else m_SPOIL = null;
//       
//         if(struct.m_OUTSIDE_TYP != null) m_OUTSIDE_TYP = new Integer((struct.m_OUTSIDE_TYP).intValue());
//         else m_OUTSIDE_TYP = null;
//       
//         if(struct.m_ACPT_INSPC_TYP != null) m_ACPT_INSPC_TYP = new Integer((struct.m_ACPT_INSPC_TYP).intValue());
//         else m_ACPT_INSPC_TYP = null;
//       
//         if(struct.m_STANDARD_COST != null) m_STANDARD_COST = new String(struct.m_STANDARD_COST);
//         else m_STANDARD_COST = null;
//       
//         if(struct.m_MODIFY_COUNT != null) m_MODIFY_COUNT = new String(struct.m_MODIFY_COUNT);
//         else m_MODIFY_COUNT = null;
//       
//         if(struct.m_ITEM_NAME != null) m_ITEM_NAME = new String(struct.m_ITEM_NAME);
//         else m_ITEM_NAME = null;
//       
//         if(struct.m_WS_NAME != null) m_WS_NAME = new String(struct.m_WS_NAME);
//         else m_WS_NAME = null;
//       
//         if(struct.m_VEND_NAME != null) m_VEND_NAME = new String(struct.m_VEND_NAME);
//         else m_VEND_NAME = null;
//       
//         if(struct.m_DRAW_CD != null) m_DRAW_CD = new String(struct.m_DRAW_CD);
//         else m_DRAW_CD = null;
//       
//         if(struct.m_SPEC != null) m_SPEC = new String(struct.m_SPEC);
//         else m_SPEC = null;
//       
//         if(struct.m_MRP_ODR_TYP != null) m_MRP_ODR_TYP = new Integer((struct.m_MRP_ODR_TYP).intValue());
//         else m_MRP_ODR_TYP = null;
//       
//         if(struct.m_ITEM_OUTSIDE_TYP != null) m_ITEM_OUTSIDE_TYP = new Integer((struct.m_ITEM_OUTSIDE_TYP).intValue());
//         else m_ITEM_OUTSIDE_TYP = null;
//       
//         if(struct.m_OPR_RSLT_TYP != null) m_OPR_RSLT_TYP = new Integer((struct.m_OPR_RSLT_TYP).intValue());
//         else m_OPR_RSLT_TYP = null;
//       
//         if(struct.m_ITEM_FIXED_LT != null) m_ITEM_FIXED_LT = new Long((struct.m_ITEM_FIXED_LT).longValue());
//         else m_ITEM_FIXED_LT = null;
//       
//         if(struct.m_ITEM_PROP_LT != null) m_ITEM_PROP_LT = new Long((struct.m_ITEM_PROP_LT).longValue());
//         else m_ITEM_PROP_LT = null;
//       
//         if(struct.m_ITEM_PROP_LOT_SIZE != null) m_ITEM_PROP_LOT_SIZE = new String(struct.m_ITEM_PROP_LOT_SIZE);
//         else m_ITEM_PROP_LOT_SIZE = null;
//       
//         if(struct.m_ITEM_ISSUE_LT != null) m_ITEM_ISSUE_LT = new Long((struct.m_ITEM_ISSUE_LT).longValue());
//         else m_ITEM_ISSUE_LT = null;
//       
//         if(struct.m_ITEM_SAFETY_LT != null) m_ITEM_SAFETY_LT = new Long((struct.m_ITEM_SAFETY_LT).longValue());
//         else m_ITEM_SAFETY_LT = null;
//       
//         if(struct.m_UNIT_QTY_TYP != null) m_UNIT_QTY_TYP = new Integer((struct.m_UNIT_QTY_TYP).intValue());
//         else m_UNIT_QTY_TYP = null;
//       
//         if(struct.m_OUTSIDE_TYP_name != null) m_OUTSIDE_TYP_name = new String(struct.m_OUTSIDE_TYP_name);
//         else m_OUTSIDE_TYP_name = null;
//       
//         if(struct.m_OUTSIDE_TYP_val != null) m_OUTSIDE_TYP_val = new String(struct.m_OUTSIDE_TYP_val);
//         else m_OUTSIDE_TYP_val = null;
//       
//         if(struct.m_VEND_NAME != null) m_VEND_NAME = new String(struct.m_VEND_NAME);
//         else m_VEND_NAME = null;
//       
//         if(struct.m_ACPT_INSPC_TYP_name != null) m_ACPT_INSPC_TYP_name = new String(struct.m_ACPT_INSPC_TYP_name);
//         else m_ACPT_INSPC_TYP_name = null;
//       
//         if(struct.m_ACPT_INSPC_TYP_val != null) m_ACPT_INSPC_TYP_val = new String(struct.m_ACPT_INSPC_TYP_val);
//         else m_ACPT_INSPC_TYP_val = null;
//       
//         if(struct.m_OUTSIDE_NAME != null) m_OUTSIDE_NAME = new String(struct.m_OUTSIDE_NAME);
//         else m_OUTSIDE_NAME = null;
//       
//         if(struct.m_ITEM_MRP_ODR_NAME != null) m_ITEM_MRP_ODR_NAME = new String(struct.m_ITEM_MRP_ODR_NAME);
//         else m_ITEM_MRP_ODR_NAME = null;
//       
//         if(struct.m_ITEM_OUTSIDE_NAME != null) m_ITEM_OUTSIDE_NAME = new String(struct.m_ITEM_OUTSIDE_NAME);
//         else m_ITEM_OUTSIDE_NAME = null;
//       
//         if(struct.m_ITEM_OPR_RSLT_NAME != null) m_ITEM_OPR_RSLT_NAME = new String(struct.m_ITEM_OPR_RSLT_NAME);
//         else m_ITEM_OPR_RSLT_NAME = null;
//       
//         if(struct.m_ACPT_INSPC_NAME != null) m_ACPT_INSPC_NAME = new String(struct.m_ACPT_INSPC_NAME);
//         else m_ACPT_INSPC_NAME = null;
//       
//         if(struct.m_MRP_ODR_TYP_name != null) m_MRP_ODR_TYP_name = new String(struct.m_MRP_ODR_TYP_name);
//         else m_MRP_ODR_TYP_name = null;
//       
//         if(struct.m_MRP_ODR_TYP_val != null) m_MRP_ODR_TYP_val = new String(struct.m_MRP_ODR_TYP_val);
//         else m_ACPT_INSPC_TYP_val = null;
//       
//         if(struct.m_OPR_RSLT_TYP_name != null) m_OPR_RSLT_TYP_name = new String(struct.m_OPR_RSLT_TYP_name);
//         else m_OPR_RSLT_TYP_name = null;
//       
//         if(struct.m_OPR_RSLT_TYP_val != null) m_OPR_RSLT_TYP_val = new String(struct.m_OPR_RSLT_TYP_val);
//         else m_OPR_RSLT_TYP_val = null;
//       
//         if(struct.m_STOCK_UNIT != null) m_STOCK_UNIT = new String(struct.m_STOCK_UNIT);
//         else m_STOCK_UNIT = null;
//        }
//       
//        
//        /**
//         * �R�s�[�R���X�g���N�^
//         * @param struct �R�s�[�Ώ�
//         */
//         public AA0180010Struct(AA0180010Struct struct)
//         {
//          copy(struct);
//         }
       
        //}}user_implement_code

	//////////////////////////////

}
