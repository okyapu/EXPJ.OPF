/*
 * $Source: D:/EXPJCVS/EXPJCORE/ejstudioV2/EXPJStudio/tools/framework/expjhtml5/srcgen/rp_pfnd_tbl/StructTempl.vm,v $
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

package com.nec.jp.orteus.metamorBase.AA0010;

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

public class AA0010010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_ISSUE_TYP_name */
	public String m_ISSUE_TYP_name = null;
	/** �� 2 �ϐ��F m_ISSUE_TYP_val */
	public String m_ISSUE_TYP_val = null;
	/** �� 3 �ϐ��F m_OUTSIDE_TYP_name */
	public String m_OUTSIDE_TYP_name = null;
	/** �� 4 �ϐ��F m_OUTSIDE_TYP_val */
	public String m_OUTSIDE_TYP_val = null;
	/** �� 5 �ϐ��F m_STOCK_UNIT_FLG_name */
	public String m_STOCK_UNIT_FLG_name = null;
	/** �� 6 �ϐ��F m_STOCK_UNIT_FLG_val */
	public String m_STOCK_UNIT_FLG_val = null;
	/** �� 7 �ϐ��F m_UNIT_QTY_TYP_name */
	public String m_UNIT_QTY_TYP_name = null;
	/** �� 8 �ϐ��F m_UNIT_QTY_TYP_val */
	public String m_UNIT_QTY_TYP_val = null;
	/** �� 9 �ϐ��F m_MRP_ODR_TYP_name */
	public String m_MRP_ODR_TYP_name = null;
	/** �� 10 �ϐ��F m_MRP_ODR_TYP_val */
	public String m_MRP_ODR_TYP_val = null;
	/** �� 11 �ϐ��F m_ACPT_INSPC_TYP_name */
	public String m_ACPT_INSPC_TYP_name = null;
	/** �� 12 �ϐ��F m_ACPT_INSPC_TYP_val */
	public String m_ACPT_INSPC_TYP_val = null;
	/** �� 13 �ϐ��F m_PRODUCT_TYP_name */
	public String m_PRODUCT_TYP_name = null;
	/** �� 14 �ϐ��F m_PRODUCT_TYP_val */
	public String m_PRODUCT_TYP_val = null;
	/** �� 15 �ϐ��F m_ABC_TYP_name */
	public String m_ABC_TYP_name = null;
	/** �� 16 �ϐ��F m_ABC_TYP_val */
	public String m_ABC_TYP_val = null;
	/** �� 17 �ϐ��F m_OPR_RSLT_TYP_name */
	public String m_OPR_RSLT_TYP_name = null;
	/** �� 18 �ϐ��F m_OPR_RSLT_TYP_val */
	public String m_OPR_RSLT_TYP_val = null;
	/** �� 19 �ϐ��F m_SPL_ITEM_TYP_name */
	public String m_SPL_ITEM_TYP_name = null;
	/** �� 20 �ϐ��F m_SPL_ITEM_TYP_val */
	public String m_SPL_ITEM_TYP_val = null;
	/** �� 21 �ϐ��F m_LOT_SIZING_TYP_name */
	public String m_LOT_SIZING_TYP_name = null;
	/** �� 22 �ϐ��F m_LOT_SIZING_TYP_val */
	public String m_LOT_SIZING_TYP_val = null;
	/** �� 23 �ϐ��F m_MPS_FLG_name */
	public String m_MPS_FLG_name = null;
	/** �� 24 �ϐ��F m_MPS_FLG_val */
	public String m_MPS_FLG_val = null;
	/** �� 25 �ϐ��F m_h_ITEM_CD */
	public String m_h_ITEM_CD = null;
	/** �� 26 �ϐ��F m_STOCK_UNIT_name */
	public String m_STOCK_UNIT_name = null;
	/** �� 27 �ϐ��F m_STOCK_UNIT_val */
	public String m_STOCK_UNIT_val = null;
	/** �� 28 �ϐ��F m_ITEM_CLASS_01_TYP */
	public String m_ITEM_CLASS_01_TYP = null;
	/** �� 29 �ϐ��F m_ITEM_CLASS_01_NAME */
	public String m_ITEM_CLASS_01_NAME = null;
	/** �� 30 �ϐ��F m_ITEM_CLASS_02_TYP */
	public String m_ITEM_CLASS_02_TYP = null;
	/** �� 31 �ϐ��F m_ITEM_CLASS_02_NAME */
	public String m_ITEM_CLASS_02_NAME = null;
	/** �� 32 �ϐ��F m_ITEM_CLASS_03_TYP */
	public String m_ITEM_CLASS_03_TYP = null;
	/** �� 33 �ϐ��F m_ITEM_CLASS_03_NAME */
	public String m_ITEM_CLASS_03_NAME = null;
	/** �� 34 �ϐ��F m_ITEM_CLASS_04_TYP */
	public String m_ITEM_CLASS_04_TYP = null;
	/** �� 35 �ϐ��F m_ITEM_CLASS_04_NAME */
	public String m_ITEM_CLASS_04_NAME = null;
	/** �� 36 �ϐ��F m_ITEM_CLASS_05_TYP */
	public String m_ITEM_CLASS_05_TYP = null;
	/** �� 37 �ϐ��F m_ITEM_CLASS_05_NAME */
	public String m_ITEM_CLASS_05_NAME = null;
	/** �� 38 �ϐ��F m_ITEM_CLASS_06_TYP */
	public String m_ITEM_CLASS_06_TYP = null;
	/** �� 39 �ϐ��F m_ITEM_CLASS_06_NAME */
	public String m_ITEM_CLASS_06_NAME = null;
	/** �� 40 �ϐ��F m_ITEM_CLASS_07_TYP */
	public String m_ITEM_CLASS_07_TYP = null;
	/** �� 41 �ϐ��F m_ITEM_CLASS_07_NAME */
	public String m_ITEM_CLASS_07_NAME = null;
	/** �� 42 �ϐ��F m_ITEM_CLASS_08_TYP */
	public String m_ITEM_CLASS_08_TYP = null;
	/** �� 43 �ϐ��F m_ITEM_CLASS_08_NAME */
	public String m_ITEM_CLASS_08_NAME = null;
	/** �� 44 �ϐ��F m_ITEM_CLASS_09_TYP */
	public String m_ITEM_CLASS_09_TYP = null;
	/** �� 45 �ϐ��F m_ITEM_CLASS_09_NAME */
	public String m_ITEM_CLASS_09_NAME = null;
	/** �� 46 �ϐ��F m_ITEM_CLASS_10_TYP */
	public String m_ITEM_CLASS_10_TYP = null;
	/** �� 47 �ϐ��F m_ITEM_CLASS_10_NAME */
	public String m_ITEM_CLASS_10_NAME = null;
	/** �� 48 �ϐ��F m_ITEM_CLASS_11_TYP */
	public String m_ITEM_CLASS_11_TYP = null;
	/** �� 49 �ϐ��F m_ITEM_CLASS_11_NAME */
	public String m_ITEM_CLASS_11_NAME = null;
	/** �� 50 �ϐ��F m_ITEM_CLASS_12_TYP */
	public String m_ITEM_CLASS_12_TYP = null;
	/** �� 51 �ϐ��F m_ITEM_CLASS_12_NAME */
	public String m_ITEM_CLASS_12_NAME = null;
	/** �� 52 �ϐ��F m_DEPO_TYP_name */
	public String m_DEPO_TYP_name = null;
	/** �� 53 �ϐ��F m_DEPO_TYP_val */
	public String m_DEPO_TYP_val = null;
	/** �� 54 �ϐ��F m_LOT_CTRL_FLG_name */
	public String m_LOT_CTRL_FLG_name = null;
	/** �� 55 �ϐ��F m_LOT_CTRL_FLG_val */
	public String m_LOT_CTRL_FLG_val = null;
	/** �� 56 �ϐ��F m_LOT_NUMBERING_TYP_name */
	public String m_LOT_NUMBERING_TYP_name = null;
	/** �� 57 �ϐ��F m_LOT_NUMBERING_TYP_val */
	public String m_LOT_NUMBERING_TYP_val = null;
	/** �� 58 �ϐ��F m_MANHOUR_TYP_name */
	public String m_MANHOUR_TYP_name = null;
	/** �� 59 �ϐ��F m_MANHOUR_TYP_val */
	public String m_MANHOUR_TYP_val = null;
	/** �� 60 �ϐ��F m_h_APR_ITEM */
	public String m_h_APR_ITEM = null;
	/** �� 61 �ϐ��F m_h_SCREENMOVE_TYP */
	public String m_h_SCREENMOVE_TYP = null;
	/** �� 62 �ϐ��F m_h_APPR_ID */
	public String m_h_APPR_ID = null;
	/** �� 63 �ϐ��F m_APPR_REMARKS */
	public String m_APPR_REMARKS = null;
	/** �� 64 �ϐ��F m_PJ_CD_name */
	public String m_PJ_CD_name = null;
	/** �� 65 �ϐ��F m_PJ_CD_val */
	public String m_PJ_CD_val = null;
	/** �� 66 �ϐ��F m_SEG_CONTENTS1_name */
	public String m_SEG_CONTENTS1_name = null;
	/** �� 67 �ϐ��F m_SEG_CONTENTS1_val */
	public String m_SEG_CONTENTS1_val = null;
	/** �� 68 �ϐ��F m_SEG_CONTENTS2_name */
	public String m_SEG_CONTENTS2_name = null;
	/** �� 69 �ϐ��F m_SEG_CONTENTS2_val */
	public String m_SEG_CONTENTS2_val = null;
	/** �� 70 �ϐ��F m_SEG_CONTENTS3_name */
	public String m_SEG_CONTENTS3_name = null;
	/** �� 71 �ϐ��F m_SEG_CONTENTS3_val */
	public String m_SEG_CONTENTS3_val = null;
	/** �� 72 �ϐ��F m_SEG_CONTENTS4_name */
	public String m_SEG_CONTENTS4_name = null;
	/** �� 73 �ϐ��F m_SEG_CONTENTS4_val */
	public String m_SEG_CONTENTS4_val = null;
	/** �� 74 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 75 �ϐ��F m_SUM_PROP_LT */
	public Integer m_SUM_PROP_LT = null;
	/** �� 76 �ϐ��F m_SUM_FIXED_LT */
	public Integer m_SUM_FIXED_LT = null;
	/** �� 77 �ϐ��F m_LOTCTRLFLG */
	public String m_LOTCTRLFLG = null;
	/** �� 78 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 79 �ϐ��F m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** �� 80 �ϐ��F m_DRAW_CD */
	public String m_DRAW_CD = null;
	/** �� 81 �ϐ��F m_SPEC */
	public String m_SPEC = null;
	/** �� 82 �ϐ��F m_HIGH_LEVEL_NO */
	public String m_HIGH_LEVEL_NO = null;
	/** �� 83 �ϐ��F m_ISSUE_TYP */
	public Integer m_ISSUE_TYP = null;
	/** �� 84 �ϐ��F m_OUTSIDE_TYP */
	public Integer m_OUTSIDE_TYP = null;
	/** �� 85 �ϐ��F m_STOCK_UNIT_FLG */
	public Integer m_STOCK_UNIT_FLG = null;
	/** �� 86 �ϐ��F m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** �� 87 �ϐ��F m_PKG_UNIT */
	public String m_PKG_UNIT = null;
	/** �� 88 �ϐ��F m_PKG_UNIT_QTY */
	public String m_PKG_UNIT_QTY = null;
	/** �� 89 �ϐ��F m_UNIT_QTY_TYP */
	public Integer m_UNIT_QTY_TYP = null;
	/** �� 90 �ϐ��F m_ODR_LT */
	public String m_ODR_LT = null;
	/** �� 91 �ϐ��F m_ISSUE_LT */
	public String m_ISSUE_LT = null;
	/** �� 92 �ϐ��F m_FIXED_LT */
	public String m_FIXED_LT = null;
	/** �� 93 �ϐ��F m_PROP_LOT_SIZE */
	public String m_PROP_LOT_SIZE = null;
	/** �� 94 �ϐ��F m_PROP_LT */
	public String m_PROP_LT = null;
	/** �� 95 �ϐ��F m_ITEM_SPOIL */
	public String m_ITEM_SPOIL = null;
	/** �� 96 �ϐ��F m_SAFETY_LT */
	public String m_SAFETY_LT = null;
	/** �� 97 �ϐ��F m_SAFETY_STOCK */
	public String m_SAFETY_STOCK = null;
	/** �� 98 �ϐ��F m_MRP_ODR_TYP */
	public Integer m_MRP_ODR_TYP = null;
	/** �� 99 �ϐ��F m_LOT_SIZING_TYP */
	public Integer m_LOT_SIZING_TYP = null;
	/** �� 100 �ϐ��F m_MAX_PERIOD */
	public String m_MAX_PERIOD = null;
	/** �� 101 �ϐ��F m_FIXED_ODR_QTY */
	public String m_FIXED_ODR_QTY = null;
	/** �� 102 �ϐ��F m_MAX_ODR_QTY */
	public String m_MAX_ODR_QTY = null;
	/** �� 103 �ϐ��F m_MIN_ODR_QTY */
	public String m_MIN_ODR_QTY = null;
	/** �� 104 �ϐ��F m_ODR_POINT */
	public String m_ODR_POINT = null;
	/** �� 105 �ϐ��F m_MUL_ODR_QTY */
	public String m_MUL_ODR_QTY = null;
	/** �� 106 �ϐ��F m_MPS_FLG */
	public Integer m_MPS_FLG = null;
	/** �� 107 �ϐ��F m_ACPT_INSPC_TYP */
	public Integer m_ACPT_INSPC_TYP = null;
	/** �� 108 �ϐ��F m_PRODUCT_TYP */
	public Integer m_PRODUCT_TYP = null;
	/** �� 109 �ϐ��F m_CLASIFICATION_CD */
	public String m_CLASIFICATION_CD = null;
	/** �� 110 �ϐ��F m_UNIT_WEIGHT */
	public String m_UNIT_WEIGHT = null;
	/** �� 111 �ϐ��F m_ABC_TYP */
	public Integer m_ABC_TYP = null;
	/** �� 112 �ϐ��F m_OPR_RSLT_TYP */
	public Integer m_OPR_RSLT_TYP = null;
	/** �� 113 �ϐ��F m_SPL_ITEM_TYP */
	public Integer m_SPL_ITEM_TYP = null;
	/** �� 114 �ϐ��F m_TAX_CD */
	public String m_TAX_CD = null;
	/** �� 115 �ϐ��F m_TAX_NAME */
	public String m_TAX_NAME = null;
	/** �� 116 �ϐ��F m_CAL_NO */
	public Integer m_CAL_NO = null;
	/** �� 117 �ϐ��F m_CAL_NAME */
	public String m_CAL_NAME = null;
	/** �� 118 �ϐ��F m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** �� 119 �ϐ��F m_ITEM_CLASS_01_CD */
	public String m_ITEM_CLASS_01_CD = null;
	/** �� 120 �ϐ��F m_ITEM_CLASS_02_CD */
	public String m_ITEM_CLASS_02_CD = null;
	/** �� 121 �ϐ��F m_ITEM_CLASS_03_CD */
	public String m_ITEM_CLASS_03_CD = null;
	/** �� 122 �ϐ��F m_ITEM_CLASS_04_CD */
	public String m_ITEM_CLASS_04_CD = null;
	/** �� 123 �ϐ��F m_ITEM_CLASS_05_CD */
	public String m_ITEM_CLASS_05_CD = null;
	/** �� 124 �ϐ��F m_ITEM_CLASS_06_CD */
	public String m_ITEM_CLASS_06_CD = null;
	/** �� 125 �ϐ��F m_ITEM_CLASS_07_CD */
	public String m_ITEM_CLASS_07_CD = null;
	/** �� 126 �ϐ��F m_ITEM_CLASS_08_CD */
	public String m_ITEM_CLASS_08_CD = null;
	/** �� 127 �ϐ��F m_ITEM_CLASS_09_CD */
	public String m_ITEM_CLASS_09_CD = null;
	/** �� 128 �ϐ��F m_ITEM_CLASS_10_CD */
	public String m_ITEM_CLASS_10_CD = null;
	/** �� 129 �ϐ��F m_ITEM_CLASS_11_CD */
	public String m_ITEM_CLASS_11_CD = null;
	/** �� 130 �ϐ��F m_ITEM_CLASS_12_CD */
	public String m_ITEM_CLASS_12_CD = null;
	/** �� 131 �ϐ��F m_DEPO_TYP */
	public Integer m_DEPO_TYP = null;
	/** �� 132 �ϐ��F m_LOT_CTRL_FLG */
	public Integer m_LOT_CTRL_FLG = null;
	/** �� 133 �ϐ��F m_LOT_NUMBERING_TYP */
	public Integer m_LOT_NUMBERING_TYP = null;
	/** �� 134 �ϐ��F m_BEST_BEFORE_YEAR */
	public String m_BEST_BEFORE_YEAR = null;
	/** �� 135 �ϐ��F m_BEST_BEFORE_MONTH */
	public String m_BEST_BEFORE_MONTH = null;
	/** �� 136 �ϐ��F m_BEST_BEFORE_DAY */
	public String m_BEST_BEFORE_DAY = null;
	/** �� 137 �ϐ��F m_REMARK1 */
	public String m_REMARK1 = null;
	/** �� 138 �ϐ��F m_REMARK2 */
	public String m_REMARK2 = null;
	/** �� 139 �ϐ��F m_MANHOUR_TYP */
	public Integer m_MANHOUR_TYP = null;
	/** �� 140 �ϐ��F m_DEPT_CD */
	public String m_DEPT_CD = null;
	/** �� 141 �ϐ��F m_DEPT_NAME */
	public String m_DEPT_NAME = null;
	/** �� 142 �ϐ��F m_PJ_CD */
	public String m_PJ_CD = null;
	/** �� 143 �ϐ��F m_SEG_CONTENTS1 */
	public String m_SEG_CONTENTS1 = null;
	/** �� 144 �ϐ��F m_SEG_CONTENTS2 */
	public String m_SEG_CONTENTS2 = null;
	/** �� 145 �ϐ��F m_SEG_CONTENTS3 */
	public String m_SEG_CONTENTS3 = null;
	/** �� 146 �ϐ��F m_SEG_CONTENTS4 */
	public String m_SEG_CONTENTS4 = null;
	/** �� 147 �ϐ��F m_PUCH_ODR_CD */
	public String m_PUCH_ODR_CD = null;
	/** �� 148 �ϐ��F m_ONEROUS_CONS_NO */
	public String m_ONEROUS_CONS_NO = null;
	/** �� 149 �ϐ��F m_uMRP_ODR_TYP_DISPLAY_NAME */
	public String m_uMRP_ODR_TYP_DISPLAY_NAME = null;
	/** �� 150 �ϐ��F m_uMRP_ODR_TYP_VALUE */
	public String m_uMRP_ODR_TYP_VALUE = null;
	/** �� 151 �ϐ��F m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** �� 152 �ϐ��F m_VALUE */
	public String m_VALUE = null;
	/** �� 153 �ϐ��F m_DISPLAY_NAME */
	public String m_DISPLAY_NAME = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_ISSUE_TYP_name */
	public List l_ISSUE_TYP_name = null;

	/** �� 2 List�ϐ��F l_ISSUE_TYP_val */
	public List l_ISSUE_TYP_val = null;

	/** �� 3 List�ϐ��F l_OUTSIDE_TYP_name */
	public List l_OUTSIDE_TYP_name = null;

	/** �� 4 List�ϐ��F l_OUTSIDE_TYP_val */
	public List l_OUTSIDE_TYP_val = null;

	/** �� 5 List�ϐ��F l_STOCK_UNIT_FLG_name */
	public List l_STOCK_UNIT_FLG_name = null;

	/** �� 6 List�ϐ��F l_STOCK_UNIT_FLG_val */
	public List l_STOCK_UNIT_FLG_val = null;

	/** �� 7 List�ϐ��F l_UNIT_QTY_TYP_name */
	public List l_UNIT_QTY_TYP_name = null;

	/** �� 8 List�ϐ��F l_UNIT_QTY_TYP_val */
	public List l_UNIT_QTY_TYP_val = null;

	/** �� 9 List�ϐ��F l_MRP_ODR_TYP_name */
	public List l_MRP_ODR_TYP_name = null;

	/** �� 10 List�ϐ��F l_MRP_ODR_TYP_val */
	public List l_MRP_ODR_TYP_val = null;

	/** �� 11 List�ϐ��F l_ACPT_INSPC_TYP_name */
	public List l_ACPT_INSPC_TYP_name = null;

	/** �� 12 List�ϐ��F l_ACPT_INSPC_TYP_val */
	public List l_ACPT_INSPC_TYP_val = null;

	/** �� 13 List�ϐ��F l_PRODUCT_TYP_name */
	public List l_PRODUCT_TYP_name = null;

	/** �� 14 List�ϐ��F l_PRODUCT_TYP_val */
	public List l_PRODUCT_TYP_val = null;

	/** �� 15 List�ϐ��F l_ABC_TYP_name */
	public List l_ABC_TYP_name = null;

	/** �� 16 List�ϐ��F l_ABC_TYP_val */
	public List l_ABC_TYP_val = null;

	/** �� 17 List�ϐ��F l_OPR_RSLT_TYP_name */
	public List l_OPR_RSLT_TYP_name = null;

	/** �� 18 List�ϐ��F l_OPR_RSLT_TYP_val */
	public List l_OPR_RSLT_TYP_val = null;

	/** �� 19 List�ϐ��F l_SPL_ITEM_TYP_name */
	public List l_SPL_ITEM_TYP_name = null;

	/** �� 20 List�ϐ��F l_SPL_ITEM_TYP_val */
	public List l_SPL_ITEM_TYP_val = null;

	/** �� 21 List�ϐ��F l_LOT_SIZING_TYP_name */
	public List l_LOT_SIZING_TYP_name = null;

	/** �� 22 List�ϐ��F l_LOT_SIZING_TYP_val */
	public List l_LOT_SIZING_TYP_val = null;

	/** �� 23 List�ϐ��F l_MPS_FLG_name */
	public List l_MPS_FLG_name = null;

	/** �� 24 List�ϐ��F l_MPS_FLG_val */
	public List l_MPS_FLG_val = null;

	/** �� 25 List�ϐ��F l_h_ITEM_CD */
	public List l_h_ITEM_CD = null;

	/** �� 26 List�ϐ��F l_STOCK_UNIT_name */
	public List l_STOCK_UNIT_name = null;

	/** �� 27 List�ϐ��F l_STOCK_UNIT_val */
	public List l_STOCK_UNIT_val = null;

	/** �� 28 List�ϐ��F l_ITEM_CLASS_01_TYP */
	public List l_ITEM_CLASS_01_TYP = null;

	/** �� 29 List�ϐ��F l_ITEM_CLASS_01_NAME */
	public List l_ITEM_CLASS_01_NAME = null;

	/** �� 30 List�ϐ��F l_ITEM_CLASS_02_TYP */
	public List l_ITEM_CLASS_02_TYP = null;

	/** �� 31 List�ϐ��F l_ITEM_CLASS_02_NAME */
	public List l_ITEM_CLASS_02_NAME = null;

	/** �� 32 List�ϐ��F l_ITEM_CLASS_03_TYP */
	public List l_ITEM_CLASS_03_TYP = null;

	/** �� 33 List�ϐ��F l_ITEM_CLASS_03_NAME */
	public List l_ITEM_CLASS_03_NAME = null;

	/** �� 34 List�ϐ��F l_ITEM_CLASS_04_TYP */
	public List l_ITEM_CLASS_04_TYP = null;

	/** �� 35 List�ϐ��F l_ITEM_CLASS_04_NAME */
	public List l_ITEM_CLASS_04_NAME = null;

	/** �� 36 List�ϐ��F l_ITEM_CLASS_05_TYP */
	public List l_ITEM_CLASS_05_TYP = null;

	/** �� 37 List�ϐ��F l_ITEM_CLASS_05_NAME */
	public List l_ITEM_CLASS_05_NAME = null;

	/** �� 38 List�ϐ��F l_ITEM_CLASS_06_TYP */
	public List l_ITEM_CLASS_06_TYP = null;

	/** �� 39 List�ϐ��F l_ITEM_CLASS_06_NAME */
	public List l_ITEM_CLASS_06_NAME = null;

	/** �� 40 List�ϐ��F l_ITEM_CLASS_07_TYP */
	public List l_ITEM_CLASS_07_TYP = null;

	/** �� 41 List�ϐ��F l_ITEM_CLASS_07_NAME */
	public List l_ITEM_CLASS_07_NAME = null;

	/** �� 42 List�ϐ��F l_ITEM_CLASS_08_TYP */
	public List l_ITEM_CLASS_08_TYP = null;

	/** �� 43 List�ϐ��F l_ITEM_CLASS_08_NAME */
	public List l_ITEM_CLASS_08_NAME = null;

	/** �� 44 List�ϐ��F l_ITEM_CLASS_09_TYP */
	public List l_ITEM_CLASS_09_TYP = null;

	/** �� 45 List�ϐ��F l_ITEM_CLASS_09_NAME */
	public List l_ITEM_CLASS_09_NAME = null;

	/** �� 46 List�ϐ��F l_ITEM_CLASS_10_TYP */
	public List l_ITEM_CLASS_10_TYP = null;

	/** �� 47 List�ϐ��F l_ITEM_CLASS_10_NAME */
	public List l_ITEM_CLASS_10_NAME = null;

	/** �� 48 List�ϐ��F l_ITEM_CLASS_11_TYP */
	public List l_ITEM_CLASS_11_TYP = null;

	/** �� 49 List�ϐ��F l_ITEM_CLASS_11_NAME */
	public List l_ITEM_CLASS_11_NAME = null;

	/** �� 50 List�ϐ��F l_ITEM_CLASS_12_TYP */
	public List l_ITEM_CLASS_12_TYP = null;

	/** �� 51 List�ϐ��F l_ITEM_CLASS_12_NAME */
	public List l_ITEM_CLASS_12_NAME = null;

	/** �� 52 List�ϐ��F l_DEPO_TYP_name */
	public List l_DEPO_TYP_name = null;

	/** �� 53 List�ϐ��F l_DEPO_TYP_val */
	public List l_DEPO_TYP_val = null;

	/** �� 54 List�ϐ��F l_LOT_CTRL_FLG_name */
	public List l_LOT_CTRL_FLG_name = null;

	/** �� 55 List�ϐ��F l_LOT_CTRL_FLG_val */
	public List l_LOT_CTRL_FLG_val = null;

	/** �� 56 List�ϐ��F l_LOT_NUMBERING_TYP_name */
	public List l_LOT_NUMBERING_TYP_name = null;

	/** �� 57 List�ϐ��F l_LOT_NUMBERING_TYP_val */
	public List l_LOT_NUMBERING_TYP_val = null;

	/** �� 58 List�ϐ��F l_MANHOUR_TYP_name */
	public List l_MANHOUR_TYP_name = null;

	/** �� 59 List�ϐ��F l_MANHOUR_TYP_val */
	public List l_MANHOUR_TYP_val = null;

	/** �� 60 List�ϐ��F l_h_APR_ITEM */
	public List l_h_APR_ITEM = null;

	/** �� 61 List�ϐ��F l_h_SCREENMOVE_TYP */
	public List l_h_SCREENMOVE_TYP = null;

	/** �� 62 List�ϐ��F l_h_APPR_ID */
	public List l_h_APPR_ID = null;

	/** �� 63 List�ϐ��F l_APPR_REMARKS */
	public List l_APPR_REMARKS = null;

	/** �� 64 List�ϐ��F l_PJ_CD_name */
	public List l_PJ_CD_name = null;

	/** �� 65 List�ϐ��F l_PJ_CD_val */
	public List l_PJ_CD_val = null;

	/** �� 66 List�ϐ��F l_SEG_CONTENTS1_name */
	public List l_SEG_CONTENTS1_name = null;

	/** �� 67 List�ϐ��F l_SEG_CONTENTS1_val */
	public List l_SEG_CONTENTS1_val = null;

	/** �� 68 List�ϐ��F l_SEG_CONTENTS2_name */
	public List l_SEG_CONTENTS2_name = null;

	/** �� 69 List�ϐ��F l_SEG_CONTENTS2_val */
	public List l_SEG_CONTENTS2_val = null;

	/** �� 70 List�ϐ��F l_SEG_CONTENTS3_name */
	public List l_SEG_CONTENTS3_name = null;

	/** �� 71 List�ϐ��F l_SEG_CONTENTS3_val */
	public List l_SEG_CONTENTS3_val = null;

	/** �� 72 List�ϐ��F l_SEG_CONTENTS4_name */
	public List l_SEG_CONTENTS4_name = null;

	/** �� 73 List�ϐ��F l_SEG_CONTENTS4_val */
	public List l_SEG_CONTENTS4_val = null;

	/** �� 74 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 75 List�ϐ��F l_SUM_PROP_LT */
	public List l_SUM_PROP_LT = null;

	/** �� 76 List�ϐ��F l_SUM_FIXED_LT */
	public List l_SUM_FIXED_LT = null;

	/** �� 77 List�ϐ��F l_LOTCTRLFLG */
	public List l_LOTCTRLFLG = null;

	/** �� 78 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 79 List�ϐ��F l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** �� 80 List�ϐ��F l_DRAW_CD */
	public List l_DRAW_CD = null;

	/** �� 81 List�ϐ��F l_SPEC */
	public List l_SPEC = null;

	/** �� 82 List�ϐ��F l_HIGH_LEVEL_NO */
	public List l_HIGH_LEVEL_NO = null;

	/** �� 83 List�ϐ��F l_ISSUE_TYP */
	public List l_ISSUE_TYP = null;

	/** �� 84 List�ϐ��F l_OUTSIDE_TYP */
	public List l_OUTSIDE_TYP = null;

	/** �� 85 List�ϐ��F l_STOCK_UNIT_FLG */
	public List l_STOCK_UNIT_FLG = null;

	/** �� 86 List�ϐ��F l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** �� 87 List�ϐ��F l_PKG_UNIT */
	public List l_PKG_UNIT = null;

	/** �� 88 List�ϐ��F l_PKG_UNIT_QTY */
	public List l_PKG_UNIT_QTY = null;

	/** �� 89 List�ϐ��F l_UNIT_QTY_TYP */
	public List l_UNIT_QTY_TYP = null;

	/** �� 90 List�ϐ��F l_ODR_LT */
	public List l_ODR_LT = null;

	/** �� 91 List�ϐ��F l_ISSUE_LT */
	public List l_ISSUE_LT = null;

	/** �� 92 List�ϐ��F l_FIXED_LT */
	public List l_FIXED_LT = null;

	/** �� 93 List�ϐ��F l_PROP_LOT_SIZE */
	public List l_PROP_LOT_SIZE = null;

	/** �� 94 List�ϐ��F l_PROP_LT */
	public List l_PROP_LT = null;

	/** �� 95 List�ϐ��F l_ITEM_SPOIL */
	public List l_ITEM_SPOIL = null;

	/** �� 96 List�ϐ��F l_SAFETY_LT */
	public List l_SAFETY_LT = null;

	/** �� 97 List�ϐ��F l_SAFETY_STOCK */
	public List l_SAFETY_STOCK = null;

	/** �� 98 List�ϐ��F l_MRP_ODR_TYP */
	public List l_MRP_ODR_TYP = null;

	/** �� 99 List�ϐ��F l_LOT_SIZING_TYP */
	public List l_LOT_SIZING_TYP = null;

	/** �� 100 List�ϐ��F l_MAX_PERIOD */
	public List l_MAX_PERIOD = null;

	/** �� 101 List�ϐ��F l_FIXED_ODR_QTY */
	public List l_FIXED_ODR_QTY = null;

	/** �� 102 List�ϐ��F l_MAX_ODR_QTY */
	public List l_MAX_ODR_QTY = null;

	/** �� 103 List�ϐ��F l_MIN_ODR_QTY */
	public List l_MIN_ODR_QTY = null;

	/** �� 104 List�ϐ��F l_ODR_POINT */
	public List l_ODR_POINT = null;

	/** �� 105 List�ϐ��F l_MUL_ODR_QTY */
	public List l_MUL_ODR_QTY = null;

	/** �� 106 List�ϐ��F l_MPS_FLG */
	public List l_MPS_FLG = null;

	/** �� 107 List�ϐ��F l_ACPT_INSPC_TYP */
	public List l_ACPT_INSPC_TYP = null;

	/** �� 108 List�ϐ��F l_PRODUCT_TYP */
	public List l_PRODUCT_TYP = null;

	/** �� 109 List�ϐ��F l_CLASIFICATION_CD */
	public List l_CLASIFICATION_CD = null;

	/** �� 110 List�ϐ��F l_UNIT_WEIGHT */
	public List l_UNIT_WEIGHT = null;

	/** �� 111 List�ϐ��F l_ABC_TYP */
	public List l_ABC_TYP = null;

	/** �� 112 List�ϐ��F l_OPR_RSLT_TYP */
	public List l_OPR_RSLT_TYP = null;

	/** �� 113 List�ϐ��F l_SPL_ITEM_TYP */
	public List l_SPL_ITEM_TYP = null;

	/** �� 114 List�ϐ��F l_TAX_CD */
	public List l_TAX_CD = null;

	/** �� 115 List�ϐ��F l_TAX_NAME */
	public List l_TAX_NAME = null;

	/** �� 116 List�ϐ��F l_CAL_NO */
	public List l_CAL_NO = null;

	/** �� 117 List�ϐ��F l_CAL_NAME */
	public List l_CAL_NAME = null;

	/** �� 118 List�ϐ��F l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** �� 119 List�ϐ��F l_ITEM_CLASS_01_CD */
	public List l_ITEM_CLASS_01_CD = null;

	/** �� 120 List�ϐ��F l_ITEM_CLASS_02_CD */
	public List l_ITEM_CLASS_02_CD = null;

	/** �� 121 List�ϐ��F l_ITEM_CLASS_03_CD */
	public List l_ITEM_CLASS_03_CD = null;

	/** �� 122 List�ϐ��F l_ITEM_CLASS_04_CD */
	public List l_ITEM_CLASS_04_CD = null;

	/** �� 123 List�ϐ��F l_ITEM_CLASS_05_CD */
	public List l_ITEM_CLASS_05_CD = null;

	/** �� 124 List�ϐ��F l_ITEM_CLASS_06_CD */
	public List l_ITEM_CLASS_06_CD = null;

	/** �� 125 List�ϐ��F l_ITEM_CLASS_07_CD */
	public List l_ITEM_CLASS_07_CD = null;

	/** �� 126 List�ϐ��F l_ITEM_CLASS_08_CD */
	public List l_ITEM_CLASS_08_CD = null;

	/** �� 127 List�ϐ��F l_ITEM_CLASS_09_CD */
	public List l_ITEM_CLASS_09_CD = null;

	/** �� 128 List�ϐ��F l_ITEM_CLASS_10_CD */
	public List l_ITEM_CLASS_10_CD = null;

	/** �� 129 List�ϐ��F l_ITEM_CLASS_11_CD */
	public List l_ITEM_CLASS_11_CD = null;

	/** �� 130 List�ϐ��F l_ITEM_CLASS_12_CD */
	public List l_ITEM_CLASS_12_CD = null;

	/** �� 131 List�ϐ��F l_DEPO_TYP */
	public List l_DEPO_TYP = null;

	/** �� 132 List�ϐ��F l_LOT_CTRL_FLG */
	public List l_LOT_CTRL_FLG = null;

	/** �� 133 List�ϐ��F l_LOT_NUMBERING_TYP */
	public List l_LOT_NUMBERING_TYP = null;

	/** �� 134 List�ϐ��F l_BEST_BEFORE_YEAR */
	public List l_BEST_BEFORE_YEAR = null;

	/** �� 135 List�ϐ��F l_BEST_BEFORE_MONTH */
	public List l_BEST_BEFORE_MONTH = null;

	/** �� 136 List�ϐ��F l_BEST_BEFORE_DAY */
	public List l_BEST_BEFORE_DAY = null;

	/** �� 137 List�ϐ��F l_REMARK1 */
	public List l_REMARK1 = null;

	/** �� 138 List�ϐ��F l_REMARK2 */
	public List l_REMARK2 = null;

	/** �� 139 List�ϐ��F l_MANHOUR_TYP */
	public List l_MANHOUR_TYP = null;

	/** �� 140 List�ϐ��F l_DEPT_CD */
	public List l_DEPT_CD = null;

	/** �� 141 List�ϐ��F l_DEPT_NAME */
	public List l_DEPT_NAME = null;

	/** �� 142 List�ϐ��F l_PJ_CD */
	public List l_PJ_CD = null;

	/** �� 143 List�ϐ��F l_SEG_CONTENTS1 */
	public List l_SEG_CONTENTS1 = null;

	/** �� 144 List�ϐ��F l_SEG_CONTENTS2 */
	public List l_SEG_CONTENTS2 = null;

	/** �� 145 List�ϐ��F l_SEG_CONTENTS3 */
	public List l_SEG_CONTENTS3 = null;

	/** �� 146 List�ϐ��F l_SEG_CONTENTS4 */
	public List l_SEG_CONTENTS4 = null;

	/** �� 147 List�ϐ��F l_PUCH_ODR_CD */
	public List l_PUCH_ODR_CD = null;

	/** �� 148 List�ϐ��F l_ONEROUS_CONS_NO */
	public List l_ONEROUS_CONS_NO = null;

	/** �� 149 List�ϐ��F l_uMRP_ODR_TYP_DISPLAY_NAME */
	public List l_uMRP_ODR_TYP_DISPLAY_NAME = null;

	/** �� 150 List�ϐ��F l_uMRP_ODR_TYP_VALUE */
	public List l_uMRP_ODR_TYP_VALUE = null;

	/** �� 151 List�ϐ��F l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** �� 152 List�ϐ��F l_VALUE */
	public List l_VALUE = null;

	/** �� 153 List�ϐ��F l_DISPLAY_NAME */
	public List l_DISPLAY_NAME = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getISSUE_TYP_name() { return m_ISSUE_TYP_name; }
	public String getISSUE_TYP_val() { return m_ISSUE_TYP_val; }
	public String getOUTSIDE_TYP_name() { return m_OUTSIDE_TYP_name; }
	public String getOUTSIDE_TYP_val() { return m_OUTSIDE_TYP_val; }
	public String getSTOCK_UNIT_FLG_name() { return m_STOCK_UNIT_FLG_name; }
	public String getSTOCK_UNIT_FLG_val() { return m_STOCK_UNIT_FLG_val; }
	public String getUNIT_QTY_TYP_name() { return m_UNIT_QTY_TYP_name; }
	public String getUNIT_QTY_TYP_val() { return m_UNIT_QTY_TYP_val; }
	public String getMRP_ODR_TYP_name() { return m_MRP_ODR_TYP_name; }
	public String getMRP_ODR_TYP_val() { return m_MRP_ODR_TYP_val; }
	public String getACPT_INSPC_TYP_name() { return m_ACPT_INSPC_TYP_name; }
	public String getACPT_INSPC_TYP_val() { return m_ACPT_INSPC_TYP_val; }
	public String getPRODUCT_TYP_name() { return m_PRODUCT_TYP_name; }
	public String getPRODUCT_TYP_val() { return m_PRODUCT_TYP_val; }
	public String getABC_TYP_name() { return m_ABC_TYP_name; }
	public String getABC_TYP_val() { return m_ABC_TYP_val; }
	public String getOPR_RSLT_TYP_name() { return m_OPR_RSLT_TYP_name; }
	public String getOPR_RSLT_TYP_val() { return m_OPR_RSLT_TYP_val; }
	public String getSPL_ITEM_TYP_name() { return m_SPL_ITEM_TYP_name; }
	public String getSPL_ITEM_TYP_val() { return m_SPL_ITEM_TYP_val; }
	public String getLOT_SIZING_TYP_name() { return m_LOT_SIZING_TYP_name; }
	public String getLOT_SIZING_TYP_val() { return m_LOT_SIZING_TYP_val; }
	public String getMPS_FLG_name() { return m_MPS_FLG_name; }
	public String getMPS_FLG_val() { return m_MPS_FLG_val; }
	public String geth_ITEM_CD() { return m_h_ITEM_CD; }
	public String getSTOCK_UNIT_name() { return m_STOCK_UNIT_name; }
	public String getSTOCK_UNIT_val() { return m_STOCK_UNIT_val; }
	public String getITEM_CLASS_01_TYP() { return m_ITEM_CLASS_01_TYP; }
	public String getITEM_CLASS_01_NAME() { return m_ITEM_CLASS_01_NAME; }
	public String getITEM_CLASS_02_TYP() { return m_ITEM_CLASS_02_TYP; }
	public String getITEM_CLASS_02_NAME() { return m_ITEM_CLASS_02_NAME; }
	public String getITEM_CLASS_03_TYP() { return m_ITEM_CLASS_03_TYP; }
	public String getITEM_CLASS_03_NAME() { return m_ITEM_CLASS_03_NAME; }
	public String getITEM_CLASS_04_TYP() { return m_ITEM_CLASS_04_TYP; }
	public String getITEM_CLASS_04_NAME() { return m_ITEM_CLASS_04_NAME; }
	public String getITEM_CLASS_05_TYP() { return m_ITEM_CLASS_05_TYP; }
	public String getITEM_CLASS_05_NAME() { return m_ITEM_CLASS_05_NAME; }
	public String getITEM_CLASS_06_TYP() { return m_ITEM_CLASS_06_TYP; }
	public String getITEM_CLASS_06_NAME() { return m_ITEM_CLASS_06_NAME; }
	public String getITEM_CLASS_07_TYP() { return m_ITEM_CLASS_07_TYP; }
	public String getITEM_CLASS_07_NAME() { return m_ITEM_CLASS_07_NAME; }
	public String getITEM_CLASS_08_TYP() { return m_ITEM_CLASS_08_TYP; }
	public String getITEM_CLASS_08_NAME() { return m_ITEM_CLASS_08_NAME; }
	public String getITEM_CLASS_09_TYP() { return m_ITEM_CLASS_09_TYP; }
	public String getITEM_CLASS_09_NAME() { return m_ITEM_CLASS_09_NAME; }
	public String getITEM_CLASS_10_TYP() { return m_ITEM_CLASS_10_TYP; }
	public String getITEM_CLASS_10_NAME() { return m_ITEM_CLASS_10_NAME; }
	public String getITEM_CLASS_11_TYP() { return m_ITEM_CLASS_11_TYP; }
	public String getITEM_CLASS_11_NAME() { return m_ITEM_CLASS_11_NAME; }
	public String getITEM_CLASS_12_TYP() { return m_ITEM_CLASS_12_TYP; }
	public String getITEM_CLASS_12_NAME() { return m_ITEM_CLASS_12_NAME; }
	public String getDEPO_TYP_name() { return m_DEPO_TYP_name; }
	public String getDEPO_TYP_val() { return m_DEPO_TYP_val; }
	public String getLOT_CTRL_FLG_name() { return m_LOT_CTRL_FLG_name; }
	public String getLOT_CTRL_FLG_val() { return m_LOT_CTRL_FLG_val; }
	public String getLOT_NUMBERING_TYP_name() { return m_LOT_NUMBERING_TYP_name; }
	public String getLOT_NUMBERING_TYP_val() { return m_LOT_NUMBERING_TYP_val; }
	public String getMANHOUR_TYP_name() { return m_MANHOUR_TYP_name; }
	public String getMANHOUR_TYP_val() { return m_MANHOUR_TYP_val; }
	public String geth_APR_ITEM() { return m_h_APR_ITEM; }
	public String geth_SCREENMOVE_TYP() { return m_h_SCREENMOVE_TYP; }
	public String geth_APPR_ID() { return m_h_APPR_ID; }
	public String getAPPR_REMARKS() { return m_APPR_REMARKS; }
	public String getPJ_CD_name() { return m_PJ_CD_name; }
	public String getPJ_CD_val() { return m_PJ_CD_val; }
	public String getSEG_CONTENTS1_name() { return m_SEG_CONTENTS1_name; }
	public String getSEG_CONTENTS1_val() { return m_SEG_CONTENTS1_val; }
	public String getSEG_CONTENTS2_name() { return m_SEG_CONTENTS2_name; }
	public String getSEG_CONTENTS2_val() { return m_SEG_CONTENTS2_val; }
	public String getSEG_CONTENTS3_name() { return m_SEG_CONTENTS3_name; }
	public String getSEG_CONTENTS3_val() { return m_SEG_CONTENTS3_val; }
	public String getSEG_CONTENTS4_name() { return m_SEG_CONTENTS4_name; }
	public String getSEG_CONTENTS4_val() { return m_SEG_CONTENTS4_val; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public Integer getSUM_PROP_LT() { return m_SUM_PROP_LT; }
	public Integer getSUM_FIXED_LT() { return m_SUM_FIXED_LT; }
	public String getLOTCTRLFLG() { return m_LOTCTRLFLG; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getDRAW_CD() { return m_DRAW_CD; }
	public String getSPEC() { return m_SPEC; }
	public String getHIGH_LEVEL_NO() { return m_HIGH_LEVEL_NO; }
	public Integer getISSUE_TYP() { return m_ISSUE_TYP; }
	public Integer getOUTSIDE_TYP() { return m_OUTSIDE_TYP; }
	public Integer getSTOCK_UNIT_FLG() { return m_STOCK_UNIT_FLG; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getPKG_UNIT() { return m_PKG_UNIT; }
	public String getPKG_UNIT_QTY() { return m_PKG_UNIT_QTY; }
	public Integer getUNIT_QTY_TYP() { return m_UNIT_QTY_TYP; }
	public String getODR_LT() { return m_ODR_LT; }
	public String getISSUE_LT() { return m_ISSUE_LT; }
	public String getFIXED_LT() { return m_FIXED_LT; }
	public String getPROP_LOT_SIZE() { return m_PROP_LOT_SIZE; }
	public String getPROP_LT() { return m_PROP_LT; }
	public String getITEM_SPOIL() { return m_ITEM_SPOIL; }
	public String getSAFETY_LT() { return m_SAFETY_LT; }
	public String getSAFETY_STOCK() { return m_SAFETY_STOCK; }
	public Integer getMRP_ODR_TYP() { return m_MRP_ODR_TYP; }
	public Integer getLOT_SIZING_TYP() { return m_LOT_SIZING_TYP; }
	public String getMAX_PERIOD() { return m_MAX_PERIOD; }
	public String getFIXED_ODR_QTY() { return m_FIXED_ODR_QTY; }
	public String getMAX_ODR_QTY() { return m_MAX_ODR_QTY; }
	public String getMIN_ODR_QTY() { return m_MIN_ODR_QTY; }
	public String getODR_POINT() { return m_ODR_POINT; }
	public String getMUL_ODR_QTY() { return m_MUL_ODR_QTY; }
	public Integer getMPS_FLG() { return m_MPS_FLG; }
	public Integer getACPT_INSPC_TYP() { return m_ACPT_INSPC_TYP; }
	public Integer getPRODUCT_TYP() { return m_PRODUCT_TYP; }
	public String getCLASIFICATION_CD() { return m_CLASIFICATION_CD; }
	public String getUNIT_WEIGHT() { return m_UNIT_WEIGHT; }
	public Integer getABC_TYP() { return m_ABC_TYP; }
	public Integer getOPR_RSLT_TYP() { return m_OPR_RSLT_TYP; }
	public Integer getSPL_ITEM_TYP() { return m_SPL_ITEM_TYP; }
	public String getTAX_CD() { return m_TAX_CD; }
	public String getTAX_NAME() { return m_TAX_NAME; }
	public Integer getCAL_NO() { return m_CAL_NO; }
	public String getCAL_NAME() { return m_CAL_NAME; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getITEM_CLASS_01_CD() { return m_ITEM_CLASS_01_CD; }
	public String getITEM_CLASS_02_CD() { return m_ITEM_CLASS_02_CD; }
	public String getITEM_CLASS_03_CD() { return m_ITEM_CLASS_03_CD; }
	public String getITEM_CLASS_04_CD() { return m_ITEM_CLASS_04_CD; }
	public String getITEM_CLASS_05_CD() { return m_ITEM_CLASS_05_CD; }
	public String getITEM_CLASS_06_CD() { return m_ITEM_CLASS_06_CD; }
	public String getITEM_CLASS_07_CD() { return m_ITEM_CLASS_07_CD; }
	public String getITEM_CLASS_08_CD() { return m_ITEM_CLASS_08_CD; }
	public String getITEM_CLASS_09_CD() { return m_ITEM_CLASS_09_CD; }
	public String getITEM_CLASS_10_CD() { return m_ITEM_CLASS_10_CD; }
	public String getITEM_CLASS_11_CD() { return m_ITEM_CLASS_11_CD; }
	public String getITEM_CLASS_12_CD() { return m_ITEM_CLASS_12_CD; }
	public Integer getDEPO_TYP() { return m_DEPO_TYP; }
	public Integer getLOT_CTRL_FLG() { return m_LOT_CTRL_FLG; }
	public Integer getLOT_NUMBERING_TYP() { return m_LOT_NUMBERING_TYP; }
	public String getBEST_BEFORE_YEAR() { return m_BEST_BEFORE_YEAR; }
	public String getBEST_BEFORE_MONTH() { return m_BEST_BEFORE_MONTH; }
	public String getBEST_BEFORE_DAY() { return m_BEST_BEFORE_DAY; }
	public String getREMARK1() { return m_REMARK1; }
	public String getREMARK2() { return m_REMARK2; }
	public Integer getMANHOUR_TYP() { return m_MANHOUR_TYP; }
	public String getDEPT_CD() { return m_DEPT_CD; }
	public String getDEPT_NAME() { return m_DEPT_NAME; }
	public String getPJ_CD() { return m_PJ_CD; }
	public String getSEG_CONTENTS1() { return m_SEG_CONTENTS1; }
	public String getSEG_CONTENTS2() { return m_SEG_CONTENTS2; }
	public String getSEG_CONTENTS3() { return m_SEG_CONTENTS3; }
	public String getSEG_CONTENTS4() { return m_SEG_CONTENTS4; }
	public String getPUCH_ODR_CD() { return m_PUCH_ODR_CD; }
	public String getONEROUS_CONS_NO() { return m_ONEROUS_CONS_NO; }
	public String getuMRP_ODR_TYP_DISPLAY_NAME() { return m_uMRP_ODR_TYP_DISPLAY_NAME; }
	public String getuMRP_ODR_TYP_VALUE() { return m_uMRP_ODR_TYP_VALUE; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getVALUE() { return m_VALUE; }
	public String getDISPLAY_NAME() { return m_DISPLAY_NAME; }

	public List getList_ISSUE_TYP_name() { return l_ISSUE_TYP_name; }
	public List getList_ISSUE_TYP_val() { return l_ISSUE_TYP_val; }
	public List getList_OUTSIDE_TYP_name() { return l_OUTSIDE_TYP_name; }
	public List getList_OUTSIDE_TYP_val() { return l_OUTSIDE_TYP_val; }
	public List getList_STOCK_UNIT_FLG_name() { return l_STOCK_UNIT_FLG_name; }
	public List getList_STOCK_UNIT_FLG_val() { return l_STOCK_UNIT_FLG_val; }
	public List getList_UNIT_QTY_TYP_name() { return l_UNIT_QTY_TYP_name; }
	public List getList_UNIT_QTY_TYP_val() { return l_UNIT_QTY_TYP_val; }
	public List getList_MRP_ODR_TYP_name() { return l_MRP_ODR_TYP_name; }
	public List getList_MRP_ODR_TYP_val() { return l_MRP_ODR_TYP_val; }
	public List getList_ACPT_INSPC_TYP_name() { return l_ACPT_INSPC_TYP_name; }
	public List getList_ACPT_INSPC_TYP_val() { return l_ACPT_INSPC_TYP_val; }
	public List getList_PRODUCT_TYP_name() { return l_PRODUCT_TYP_name; }
	public List getList_PRODUCT_TYP_val() { return l_PRODUCT_TYP_val; }
	public List getList_ABC_TYP_name() { return l_ABC_TYP_name; }
	public List getList_ABC_TYP_val() { return l_ABC_TYP_val; }
	public List getList_OPR_RSLT_TYP_name() { return l_OPR_RSLT_TYP_name; }
	public List getList_OPR_RSLT_TYP_val() { return l_OPR_RSLT_TYP_val; }
	public List getList_SPL_ITEM_TYP_name() { return l_SPL_ITEM_TYP_name; }
	public List getList_SPL_ITEM_TYP_val() { return l_SPL_ITEM_TYP_val; }
	public List getList_LOT_SIZING_TYP_name() { return l_LOT_SIZING_TYP_name; }
	public List getList_LOT_SIZING_TYP_val() { return l_LOT_SIZING_TYP_val; }
	public List getList_MPS_FLG_name() { return l_MPS_FLG_name; }
	public List getList_MPS_FLG_val() { return l_MPS_FLG_val; }
	public List getList_h_ITEM_CD() { return l_h_ITEM_CD; }
	public List getList_STOCK_UNIT_name() { return l_STOCK_UNIT_name; }
	public List getList_STOCK_UNIT_val() { return l_STOCK_UNIT_val; }
	public List getList_ITEM_CLASS_01_TYP() { return l_ITEM_CLASS_01_TYP; }
	public List getList_ITEM_CLASS_01_NAME() { return l_ITEM_CLASS_01_NAME; }
	public List getList_ITEM_CLASS_02_TYP() { return l_ITEM_CLASS_02_TYP; }
	public List getList_ITEM_CLASS_02_NAME() { return l_ITEM_CLASS_02_NAME; }
	public List getList_ITEM_CLASS_03_TYP() { return l_ITEM_CLASS_03_TYP; }
	public List getList_ITEM_CLASS_03_NAME() { return l_ITEM_CLASS_03_NAME; }
	public List getList_ITEM_CLASS_04_TYP() { return l_ITEM_CLASS_04_TYP; }
	public List getList_ITEM_CLASS_04_NAME() { return l_ITEM_CLASS_04_NAME; }
	public List getList_ITEM_CLASS_05_TYP() { return l_ITEM_CLASS_05_TYP; }
	public List getList_ITEM_CLASS_05_NAME() { return l_ITEM_CLASS_05_NAME; }
	public List getList_ITEM_CLASS_06_TYP() { return l_ITEM_CLASS_06_TYP; }
	public List getList_ITEM_CLASS_06_NAME() { return l_ITEM_CLASS_06_NAME; }
	public List getList_ITEM_CLASS_07_TYP() { return l_ITEM_CLASS_07_TYP; }
	public List getList_ITEM_CLASS_07_NAME() { return l_ITEM_CLASS_07_NAME; }
	public List getList_ITEM_CLASS_08_TYP() { return l_ITEM_CLASS_08_TYP; }
	public List getList_ITEM_CLASS_08_NAME() { return l_ITEM_CLASS_08_NAME; }
	public List getList_ITEM_CLASS_09_TYP() { return l_ITEM_CLASS_09_TYP; }
	public List getList_ITEM_CLASS_09_NAME() { return l_ITEM_CLASS_09_NAME; }
	public List getList_ITEM_CLASS_10_TYP() { return l_ITEM_CLASS_10_TYP; }
	public List getList_ITEM_CLASS_10_NAME() { return l_ITEM_CLASS_10_NAME; }
	public List getList_ITEM_CLASS_11_TYP() { return l_ITEM_CLASS_11_TYP; }
	public List getList_ITEM_CLASS_11_NAME() { return l_ITEM_CLASS_11_NAME; }
	public List getList_ITEM_CLASS_12_TYP() { return l_ITEM_CLASS_12_TYP; }
	public List getList_ITEM_CLASS_12_NAME() { return l_ITEM_CLASS_12_NAME; }
	public List getList_DEPO_TYP_name() { return l_DEPO_TYP_name; }
	public List getList_DEPO_TYP_val() { return l_DEPO_TYP_val; }
	public List getList_LOT_CTRL_FLG_name() { return l_LOT_CTRL_FLG_name; }
	public List getList_LOT_CTRL_FLG_val() { return l_LOT_CTRL_FLG_val; }
	public List getList_LOT_NUMBERING_TYP_name() { return l_LOT_NUMBERING_TYP_name; }
	public List getList_LOT_NUMBERING_TYP_val() { return l_LOT_NUMBERING_TYP_val; }
	public List getList_MANHOUR_TYP_name() { return l_MANHOUR_TYP_name; }
	public List getList_MANHOUR_TYP_val() { return l_MANHOUR_TYP_val; }
	public List getList_h_APR_ITEM() { return l_h_APR_ITEM; }
	public List getList_h_SCREENMOVE_TYP() { return l_h_SCREENMOVE_TYP; }
	public List getList_h_APPR_ID() { return l_h_APPR_ID; }
	public List getList_APPR_REMARKS() { return l_APPR_REMARKS; }
	public List getList_PJ_CD_name() { return l_PJ_CD_name; }
	public List getList_PJ_CD_val() { return l_PJ_CD_val; }
	public List getList_SEG_CONTENTS1_name() { return l_SEG_CONTENTS1_name; }
	public List getList_SEG_CONTENTS1_val() { return l_SEG_CONTENTS1_val; }
	public List getList_SEG_CONTENTS2_name() { return l_SEG_CONTENTS2_name; }
	public List getList_SEG_CONTENTS2_val() { return l_SEG_CONTENTS2_val; }
	public List getList_SEG_CONTENTS3_name() { return l_SEG_CONTENTS3_name; }
	public List getList_SEG_CONTENTS3_val() { return l_SEG_CONTENTS3_val; }
	public List getList_SEG_CONTENTS4_name() { return l_SEG_CONTENTS4_name; }
	public List getList_SEG_CONTENTS4_val() { return l_SEG_CONTENTS4_val; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_SUM_PROP_LT() { return l_SUM_PROP_LT; }
	public List getList_SUM_FIXED_LT() { return l_SUM_FIXED_LT; }
	public List getList_LOTCTRLFLG() { return l_LOTCTRLFLG; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_DRAW_CD() { return l_DRAW_CD; }
	public List getList_SPEC() { return l_SPEC; }
	public List getList_HIGH_LEVEL_NO() { return l_HIGH_LEVEL_NO; }
	public List getList_ISSUE_TYP() { return l_ISSUE_TYP; }
	public List getList_OUTSIDE_TYP() { return l_OUTSIDE_TYP; }
	public List getList_STOCK_UNIT_FLG() { return l_STOCK_UNIT_FLG; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_PKG_UNIT() { return l_PKG_UNIT; }
	public List getList_PKG_UNIT_QTY() { return l_PKG_UNIT_QTY; }
	public List getList_UNIT_QTY_TYP() { return l_UNIT_QTY_TYP; }
	public List getList_ODR_LT() { return l_ODR_LT; }
	public List getList_ISSUE_LT() { return l_ISSUE_LT; }
	public List getList_FIXED_LT() { return l_FIXED_LT; }
	public List getList_PROP_LOT_SIZE() { return l_PROP_LOT_SIZE; }
	public List getList_PROP_LT() { return l_PROP_LT; }
	public List getList_ITEM_SPOIL() { return l_ITEM_SPOIL; }
	public List getList_SAFETY_LT() { return l_SAFETY_LT; }
	public List getList_SAFETY_STOCK() { return l_SAFETY_STOCK; }
	public List getList_MRP_ODR_TYP() { return l_MRP_ODR_TYP; }
	public List getList_LOT_SIZING_TYP() { return l_LOT_SIZING_TYP; }
	public List getList_MAX_PERIOD() { return l_MAX_PERIOD; }
	public List getList_FIXED_ODR_QTY() { return l_FIXED_ODR_QTY; }
	public List getList_MAX_ODR_QTY() { return l_MAX_ODR_QTY; }
	public List getList_MIN_ODR_QTY() { return l_MIN_ODR_QTY; }
	public List getList_ODR_POINT() { return l_ODR_POINT; }
	public List getList_MUL_ODR_QTY() { return l_MUL_ODR_QTY; }
	public List getList_MPS_FLG() { return l_MPS_FLG; }
	public List getList_ACPT_INSPC_TYP() { return l_ACPT_INSPC_TYP; }
	public List getList_PRODUCT_TYP() { return l_PRODUCT_TYP; }
	public List getList_CLASIFICATION_CD() { return l_CLASIFICATION_CD; }
	public List getList_UNIT_WEIGHT() { return l_UNIT_WEIGHT; }
	public List getList_ABC_TYP() { return l_ABC_TYP; }
	public List getList_OPR_RSLT_TYP() { return l_OPR_RSLT_TYP; }
	public List getList_SPL_ITEM_TYP() { return l_SPL_ITEM_TYP; }
	public List getList_TAX_CD() { return l_TAX_CD; }
	public List getList_TAX_NAME() { return l_TAX_NAME; }
	public List getList_CAL_NO() { return l_CAL_NO; }
	public List getList_CAL_NAME() { return l_CAL_NAME; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_ITEM_CLASS_01_CD() { return l_ITEM_CLASS_01_CD; }
	public List getList_ITEM_CLASS_02_CD() { return l_ITEM_CLASS_02_CD; }
	public List getList_ITEM_CLASS_03_CD() { return l_ITEM_CLASS_03_CD; }
	public List getList_ITEM_CLASS_04_CD() { return l_ITEM_CLASS_04_CD; }
	public List getList_ITEM_CLASS_05_CD() { return l_ITEM_CLASS_05_CD; }
	public List getList_ITEM_CLASS_06_CD() { return l_ITEM_CLASS_06_CD; }
	public List getList_ITEM_CLASS_07_CD() { return l_ITEM_CLASS_07_CD; }
	public List getList_ITEM_CLASS_08_CD() { return l_ITEM_CLASS_08_CD; }
	public List getList_ITEM_CLASS_09_CD() { return l_ITEM_CLASS_09_CD; }
	public List getList_ITEM_CLASS_10_CD() { return l_ITEM_CLASS_10_CD; }
	public List getList_ITEM_CLASS_11_CD() { return l_ITEM_CLASS_11_CD; }
	public List getList_ITEM_CLASS_12_CD() { return l_ITEM_CLASS_12_CD; }
	public List getList_DEPO_TYP() { return l_DEPO_TYP; }
	public List getList_LOT_CTRL_FLG() { return l_LOT_CTRL_FLG; }
	public List getList_LOT_NUMBERING_TYP() { return l_LOT_NUMBERING_TYP; }
	public List getList_BEST_BEFORE_YEAR() { return l_BEST_BEFORE_YEAR; }
	public List getList_BEST_BEFORE_MONTH() { return l_BEST_BEFORE_MONTH; }
	public List getList_BEST_BEFORE_DAY() { return l_BEST_BEFORE_DAY; }
	public List getList_REMARK1() { return l_REMARK1; }
	public List getList_REMARK2() { return l_REMARK2; }
	public List getList_MANHOUR_TYP() { return l_MANHOUR_TYP; }
	public List getList_DEPT_CD() { return l_DEPT_CD; }
	public List getList_DEPT_NAME() { return l_DEPT_NAME; }
	public List getList_PJ_CD() { return l_PJ_CD; }
	public List getList_SEG_CONTENTS1() { return l_SEG_CONTENTS1; }
	public List getList_SEG_CONTENTS2() { return l_SEG_CONTENTS2; }
	public List getList_SEG_CONTENTS3() { return l_SEG_CONTENTS3; }
	public List getList_SEG_CONTENTS4() { return l_SEG_CONTENTS4; }
	public List getList_PUCH_ODR_CD() { return l_PUCH_ODR_CD; }
	public List getList_ONEROUS_CONS_NO() { return l_ONEROUS_CONS_NO; }
	public List getList_uMRP_ODR_TYP_DISPLAY_NAME() { return l_uMRP_ODR_TYP_DISPLAY_NAME; }
	public List getList_uMRP_ODR_TYP_VALUE() { return l_uMRP_ODR_TYP_VALUE; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_VALUE() { return l_VALUE; }
	public List getList_DISPLAY_NAME() { return l_DISPLAY_NAME; }

	public void setISSUE_TYP_name(String val) { m_ISSUE_TYP_name = val; }
	public void setISSUE_TYP_val(String val) { m_ISSUE_TYP_val = val; }
	public void setOUTSIDE_TYP_name(String val) { m_OUTSIDE_TYP_name = val; }
	public void setOUTSIDE_TYP_val(String val) { m_OUTSIDE_TYP_val = val; }
	public void setSTOCK_UNIT_FLG_name(String val) { m_STOCK_UNIT_FLG_name = val; }
	public void setSTOCK_UNIT_FLG_val(String val) { m_STOCK_UNIT_FLG_val = val; }
	public void setUNIT_QTY_TYP_name(String val) { m_UNIT_QTY_TYP_name = val; }
	public void setUNIT_QTY_TYP_val(String val) { m_UNIT_QTY_TYP_val = val; }
	public void setMRP_ODR_TYP_name(String val) { m_MRP_ODR_TYP_name = val; }
	public void setMRP_ODR_TYP_val(String val) { m_MRP_ODR_TYP_val = val; }
	public void setACPT_INSPC_TYP_name(String val) { m_ACPT_INSPC_TYP_name = val; }
	public void setACPT_INSPC_TYP_val(String val) { m_ACPT_INSPC_TYP_val = val; }
	public void setPRODUCT_TYP_name(String val) { m_PRODUCT_TYP_name = val; }
	public void setPRODUCT_TYP_val(String val) { m_PRODUCT_TYP_val = val; }
	public void setABC_TYP_name(String val) { m_ABC_TYP_name = val; }
	public void setABC_TYP_val(String val) { m_ABC_TYP_val = val; }
	public void setOPR_RSLT_TYP_name(String val) { m_OPR_RSLT_TYP_name = val; }
	public void setOPR_RSLT_TYP_val(String val) { m_OPR_RSLT_TYP_val = val; }
	public void setSPL_ITEM_TYP_name(String val) { m_SPL_ITEM_TYP_name = val; }
	public void setSPL_ITEM_TYP_val(String val) { m_SPL_ITEM_TYP_val = val; }
	public void setLOT_SIZING_TYP_name(String val) { m_LOT_SIZING_TYP_name = val; }
	public void setLOT_SIZING_TYP_val(String val) { m_LOT_SIZING_TYP_val = val; }
	public void setMPS_FLG_name(String val) { m_MPS_FLG_name = val; }
	public void setMPS_FLG_val(String val) { m_MPS_FLG_val = val; }
	public void seth_ITEM_CD(String val) { m_h_ITEM_CD = val; }
	public void setSTOCK_UNIT_name(String val) { m_STOCK_UNIT_name = val; }
	public void setSTOCK_UNIT_val(String val) { m_STOCK_UNIT_val = val; }
	public void setITEM_CLASS_01_TYP(String val) { m_ITEM_CLASS_01_TYP = val; }
	public void setITEM_CLASS_01_NAME(String val) { m_ITEM_CLASS_01_NAME = val; }
	public void setITEM_CLASS_02_TYP(String val) { m_ITEM_CLASS_02_TYP = val; }
	public void setITEM_CLASS_02_NAME(String val) { m_ITEM_CLASS_02_NAME = val; }
	public void setITEM_CLASS_03_TYP(String val) { m_ITEM_CLASS_03_TYP = val; }
	public void setITEM_CLASS_03_NAME(String val) { m_ITEM_CLASS_03_NAME = val; }
	public void setITEM_CLASS_04_TYP(String val) { m_ITEM_CLASS_04_TYP = val; }
	public void setITEM_CLASS_04_NAME(String val) { m_ITEM_CLASS_04_NAME = val; }
	public void setITEM_CLASS_05_TYP(String val) { m_ITEM_CLASS_05_TYP = val; }
	public void setITEM_CLASS_05_NAME(String val) { m_ITEM_CLASS_05_NAME = val; }
	public void setITEM_CLASS_06_TYP(String val) { m_ITEM_CLASS_06_TYP = val; }
	public void setITEM_CLASS_06_NAME(String val) { m_ITEM_CLASS_06_NAME = val; }
	public void setITEM_CLASS_07_TYP(String val) { m_ITEM_CLASS_07_TYP = val; }
	public void setITEM_CLASS_07_NAME(String val) { m_ITEM_CLASS_07_NAME = val; }
	public void setITEM_CLASS_08_TYP(String val) { m_ITEM_CLASS_08_TYP = val; }
	public void setITEM_CLASS_08_NAME(String val) { m_ITEM_CLASS_08_NAME = val; }
	public void setITEM_CLASS_09_TYP(String val) { m_ITEM_CLASS_09_TYP = val; }
	public void setITEM_CLASS_09_NAME(String val) { m_ITEM_CLASS_09_NAME = val; }
	public void setITEM_CLASS_10_TYP(String val) { m_ITEM_CLASS_10_TYP = val; }
	public void setITEM_CLASS_10_NAME(String val) { m_ITEM_CLASS_10_NAME = val; }
	public void setITEM_CLASS_11_TYP(String val) { m_ITEM_CLASS_11_TYP = val; }
	public void setITEM_CLASS_11_NAME(String val) { m_ITEM_CLASS_11_NAME = val; }
	public void setITEM_CLASS_12_TYP(String val) { m_ITEM_CLASS_12_TYP = val; }
	public void setITEM_CLASS_12_NAME(String val) { m_ITEM_CLASS_12_NAME = val; }
	public void setDEPO_TYP_name(String val) { m_DEPO_TYP_name = val; }
	public void setDEPO_TYP_val(String val) { m_DEPO_TYP_val = val; }
	public void setLOT_CTRL_FLG_name(String val) { m_LOT_CTRL_FLG_name = val; }
	public void setLOT_CTRL_FLG_val(String val) { m_LOT_CTRL_FLG_val = val; }
	public void setLOT_NUMBERING_TYP_name(String val) { m_LOT_NUMBERING_TYP_name = val; }
	public void setLOT_NUMBERING_TYP_val(String val) { m_LOT_NUMBERING_TYP_val = val; }
	public void setMANHOUR_TYP_name(String val) { m_MANHOUR_TYP_name = val; }
	public void setMANHOUR_TYP_val(String val) { m_MANHOUR_TYP_val = val; }
	public void seth_APR_ITEM(String val) { m_h_APR_ITEM = val; }
	public void seth_SCREENMOVE_TYP(String val) { m_h_SCREENMOVE_TYP = val; }
	public void seth_APPR_ID(String val) { m_h_APPR_ID = val; }
	public void setAPPR_REMARKS(String val) { m_APPR_REMARKS = val; }
	public void setPJ_CD_name(String val) { m_PJ_CD_name = val; }
	public void setPJ_CD_val(String val) { m_PJ_CD_val = val; }
	public void setSEG_CONTENTS1_name(String val) { m_SEG_CONTENTS1_name = val; }
	public void setSEG_CONTENTS1_val(String val) { m_SEG_CONTENTS1_val = val; }
	public void setSEG_CONTENTS2_name(String val) { m_SEG_CONTENTS2_name = val; }
	public void setSEG_CONTENTS2_val(String val) { m_SEG_CONTENTS2_val = val; }
	public void setSEG_CONTENTS3_name(String val) { m_SEG_CONTENTS3_name = val; }
	public void setSEG_CONTENTS3_val(String val) { m_SEG_CONTENTS3_val = val; }
	public void setSEG_CONTENTS4_name(String val) { m_SEG_CONTENTS4_name = val; }
	public void setSEG_CONTENTS4_val(String val) { m_SEG_CONTENTS4_val = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setSUM_PROP_LT(Integer val) { m_SUM_PROP_LT = val; }
	public void setSUM_FIXED_LT(Integer val) { m_SUM_FIXED_LT = val; }
	public void setLOTCTRLFLG(String val) { m_LOTCTRLFLG = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setDRAW_CD(String val) { m_DRAW_CD = val; }
	public void setSPEC(String val) { m_SPEC = val; }
	public void setHIGH_LEVEL_NO(String val) { m_HIGH_LEVEL_NO = val; }
	public void setISSUE_TYP(Integer val) { m_ISSUE_TYP = val; }
	public void setOUTSIDE_TYP(Integer val) { m_OUTSIDE_TYP = val; }
	public void setSTOCK_UNIT_FLG(Integer val) { m_STOCK_UNIT_FLG = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setPKG_UNIT(String val) { m_PKG_UNIT = val; }
	public void setPKG_UNIT_QTY(String val) { m_PKG_UNIT_QTY = val; }
	public void setUNIT_QTY_TYP(Integer val) { m_UNIT_QTY_TYP = val; }
	public void setODR_LT(String val) { m_ODR_LT = val; }
	public void setISSUE_LT(String val) { m_ISSUE_LT = val; }
	public void setFIXED_LT(String val) { m_FIXED_LT = val; }
	public void setPROP_LOT_SIZE(String val) { m_PROP_LOT_SIZE = val; }
	public void setPROP_LT(String val) { m_PROP_LT = val; }
	public void setITEM_SPOIL(String val) { m_ITEM_SPOIL = val; }
	public void setSAFETY_LT(String val) { m_SAFETY_LT = val; }
	public void setSAFETY_STOCK(String val) { m_SAFETY_STOCK = val; }
	public void setMRP_ODR_TYP(Integer val) { m_MRP_ODR_TYP = val; }
	public void setLOT_SIZING_TYP(Integer val) { m_LOT_SIZING_TYP = val; }
	public void setMAX_PERIOD(String val) { m_MAX_PERIOD = val; }
	public void setFIXED_ODR_QTY(String val) { m_FIXED_ODR_QTY = val; }
	public void setMAX_ODR_QTY(String val) { m_MAX_ODR_QTY = val; }
	public void setMIN_ODR_QTY(String val) { m_MIN_ODR_QTY = val; }
	public void setODR_POINT(String val) { m_ODR_POINT = val; }
	public void setMUL_ODR_QTY(String val) { m_MUL_ODR_QTY = val; }
	public void setMPS_FLG(Integer val) { m_MPS_FLG = val; }
	public void setACPT_INSPC_TYP(Integer val) { m_ACPT_INSPC_TYP = val; }
	public void setPRODUCT_TYP(Integer val) { m_PRODUCT_TYP = val; }
	public void setCLASIFICATION_CD(String val) { m_CLASIFICATION_CD = val; }
	public void setUNIT_WEIGHT(String val) { m_UNIT_WEIGHT = val; }
	public void setABC_TYP(Integer val) { m_ABC_TYP = val; }
	public void setOPR_RSLT_TYP(Integer val) { m_OPR_RSLT_TYP = val; }
	public void setSPL_ITEM_TYP(Integer val) { m_SPL_ITEM_TYP = val; }
	public void setTAX_CD(String val) { m_TAX_CD = val; }
	public void setTAX_NAME(String val) { m_TAX_NAME = val; }
	public void setCAL_NO(Integer val) { m_CAL_NO = val; }
	public void setCAL_NAME(String val) { m_CAL_NAME = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setITEM_CLASS_01_CD(String val) { m_ITEM_CLASS_01_CD = val; }
	public void setITEM_CLASS_02_CD(String val) { m_ITEM_CLASS_02_CD = val; }
	public void setITEM_CLASS_03_CD(String val) { m_ITEM_CLASS_03_CD = val; }
	public void setITEM_CLASS_04_CD(String val) { m_ITEM_CLASS_04_CD = val; }
	public void setITEM_CLASS_05_CD(String val) { m_ITEM_CLASS_05_CD = val; }
	public void setITEM_CLASS_06_CD(String val) { m_ITEM_CLASS_06_CD = val; }
	public void setITEM_CLASS_07_CD(String val) { m_ITEM_CLASS_07_CD = val; }
	public void setITEM_CLASS_08_CD(String val) { m_ITEM_CLASS_08_CD = val; }
	public void setITEM_CLASS_09_CD(String val) { m_ITEM_CLASS_09_CD = val; }
	public void setITEM_CLASS_10_CD(String val) { m_ITEM_CLASS_10_CD = val; }
	public void setITEM_CLASS_11_CD(String val) { m_ITEM_CLASS_11_CD = val; }
	public void setITEM_CLASS_12_CD(String val) { m_ITEM_CLASS_12_CD = val; }
	public void setDEPO_TYP(Integer val) { m_DEPO_TYP = val; }
	public void setLOT_CTRL_FLG(Integer val) { m_LOT_CTRL_FLG = val; }
	public void setLOT_NUMBERING_TYP(Integer val) { m_LOT_NUMBERING_TYP = val; }
	public void setBEST_BEFORE_YEAR(String val) { m_BEST_BEFORE_YEAR = val; }
	public void setBEST_BEFORE_MONTH(String val) { m_BEST_BEFORE_MONTH = val; }
	public void setBEST_BEFORE_DAY(String val) { m_BEST_BEFORE_DAY = val; }
	public void setREMARK1(String val) { m_REMARK1 = val; }
	public void setREMARK2(String val) { m_REMARK2 = val; }
	public void setMANHOUR_TYP(Integer val) { m_MANHOUR_TYP = val; }
	public void setDEPT_CD(String val) { m_DEPT_CD = val; }
	public void setDEPT_NAME(String val) { m_DEPT_NAME = val; }
	public void setPJ_CD(String val) { m_PJ_CD = val; }
	public void setSEG_CONTENTS1(String val) { m_SEG_CONTENTS1 = val; }
	public void setSEG_CONTENTS2(String val) { m_SEG_CONTENTS2 = val; }
	public void setSEG_CONTENTS3(String val) { m_SEG_CONTENTS3 = val; }
	public void setSEG_CONTENTS4(String val) { m_SEG_CONTENTS4 = val; }
	public void setPUCH_ODR_CD(String val) { m_PUCH_ODR_CD = val; }
	public void setONEROUS_CONS_NO(String val) { m_ONEROUS_CONS_NO = val; }
	public void setuMRP_ODR_TYP_DISPLAY_NAME(String val) { m_uMRP_ODR_TYP_DISPLAY_NAME = val; }
	public void setuMRP_ODR_TYP_VALUE(String val) { m_uMRP_ODR_TYP_VALUE = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setVALUE(String val) { m_VALUE = val; }
	public void setDISPLAY_NAME(String val) { m_DISPLAY_NAME = val; }

	public void setSUM_PROP_LT(String val) { m_SUM_PROP_LT = getInteger(val); }
	public void setSUM_FIXED_LT(String val) { m_SUM_FIXED_LT = getInteger(val); }
	public void setISSUE_TYP(String val) { m_ISSUE_TYP = getInteger(val); }
	public void setOUTSIDE_TYP(String val) { m_OUTSIDE_TYP = getInteger(val); }
	public void setSTOCK_UNIT_FLG(String val) { m_STOCK_UNIT_FLG = getInteger(val); }
	public void setUNIT_QTY_TYP(String val) { m_UNIT_QTY_TYP = getInteger(val); }
	public void setMRP_ODR_TYP(String val) { m_MRP_ODR_TYP = getInteger(val); }
	public void setLOT_SIZING_TYP(String val) { m_LOT_SIZING_TYP = getInteger(val); }
	public void setMPS_FLG(String val) { m_MPS_FLG = getInteger(val); }
	public void setACPT_INSPC_TYP(String val) { m_ACPT_INSPC_TYP = getInteger(val); }
	public void setPRODUCT_TYP(String val) { m_PRODUCT_TYP = getInteger(val); }
	public void setABC_TYP(String val) { m_ABC_TYP = getInteger(val); }
	public void setOPR_RSLT_TYP(String val) { m_OPR_RSLT_TYP = getInteger(val); }
	public void setSPL_ITEM_TYP(String val) { m_SPL_ITEM_TYP = getInteger(val); }
	public void setCAL_NO(String val) { m_CAL_NO = getInteger(val); }
	public void setDEPO_TYP(String val) { m_DEPO_TYP = getInteger(val); }
	public void setLOT_CTRL_FLG(String val) { m_LOT_CTRL_FLG = getInteger(val); }
	public void setLOT_NUMBERING_TYP(String val) { m_LOT_NUMBERING_TYP = getInteger(val); }
	public void setMANHOUR_TYP(String val) { m_MANHOUR_TYP = getInteger(val); }

	public void setList_ISSUE_TYP_name(List list) { l_ISSUE_TYP_name = list; }
	public void setList_ISSUE_TYP_val(List list) { l_ISSUE_TYP_val = list; }
	public void setList_OUTSIDE_TYP_name(List list) { l_OUTSIDE_TYP_name = list; }
	public void setList_OUTSIDE_TYP_val(List list) { l_OUTSIDE_TYP_val = list; }
	public void setList_STOCK_UNIT_FLG_name(List list) { l_STOCK_UNIT_FLG_name = list; }
	public void setList_STOCK_UNIT_FLG_val(List list) { l_STOCK_UNIT_FLG_val = list; }
	public void setList_UNIT_QTY_TYP_name(List list) { l_UNIT_QTY_TYP_name = list; }
	public void setList_UNIT_QTY_TYP_val(List list) { l_UNIT_QTY_TYP_val = list; }
	public void setList_MRP_ODR_TYP_name(List list) { l_MRP_ODR_TYP_name = list; }
	public void setList_MRP_ODR_TYP_val(List list) { l_MRP_ODR_TYP_val = list; }
	public void setList_ACPT_INSPC_TYP_name(List list) { l_ACPT_INSPC_TYP_name = list; }
	public void setList_ACPT_INSPC_TYP_val(List list) { l_ACPT_INSPC_TYP_val = list; }
	public void setList_PRODUCT_TYP_name(List list) { l_PRODUCT_TYP_name = list; }
	public void setList_PRODUCT_TYP_val(List list) { l_PRODUCT_TYP_val = list; }
	public void setList_ABC_TYP_name(List list) { l_ABC_TYP_name = list; }
	public void setList_ABC_TYP_val(List list) { l_ABC_TYP_val = list; }
	public void setList_OPR_RSLT_TYP_name(List list) { l_OPR_RSLT_TYP_name = list; }
	public void setList_OPR_RSLT_TYP_val(List list) { l_OPR_RSLT_TYP_val = list; }
	public void setList_SPL_ITEM_TYP_name(List list) { l_SPL_ITEM_TYP_name = list; }
	public void setList_SPL_ITEM_TYP_val(List list) { l_SPL_ITEM_TYP_val = list; }
	public void setList_LOT_SIZING_TYP_name(List list) { l_LOT_SIZING_TYP_name = list; }
	public void setList_LOT_SIZING_TYP_val(List list) { l_LOT_SIZING_TYP_val = list; }
	public void setList_MPS_FLG_name(List list) { l_MPS_FLG_name = list; }
	public void setList_MPS_FLG_val(List list) { l_MPS_FLG_val = list; }
	public void setList_h_ITEM_CD(List list) { l_h_ITEM_CD = list; }
	public void setList_STOCK_UNIT_name(List list) { l_STOCK_UNIT_name = list; }
	public void setList_STOCK_UNIT_val(List list) { l_STOCK_UNIT_val = list; }
	public void setList_ITEM_CLASS_01_TYP(List list) { l_ITEM_CLASS_01_TYP = list; }
	public void setList_ITEM_CLASS_01_NAME(List list) { l_ITEM_CLASS_01_NAME = list; }
	public void setList_ITEM_CLASS_02_TYP(List list) { l_ITEM_CLASS_02_TYP = list; }
	public void setList_ITEM_CLASS_02_NAME(List list) { l_ITEM_CLASS_02_NAME = list; }
	public void setList_ITEM_CLASS_03_TYP(List list) { l_ITEM_CLASS_03_TYP = list; }
	public void setList_ITEM_CLASS_03_NAME(List list) { l_ITEM_CLASS_03_NAME = list; }
	public void setList_ITEM_CLASS_04_TYP(List list) { l_ITEM_CLASS_04_TYP = list; }
	public void setList_ITEM_CLASS_04_NAME(List list) { l_ITEM_CLASS_04_NAME = list; }
	public void setList_ITEM_CLASS_05_TYP(List list) { l_ITEM_CLASS_05_TYP = list; }
	public void setList_ITEM_CLASS_05_NAME(List list) { l_ITEM_CLASS_05_NAME = list; }
	public void setList_ITEM_CLASS_06_TYP(List list) { l_ITEM_CLASS_06_TYP = list; }
	public void setList_ITEM_CLASS_06_NAME(List list) { l_ITEM_CLASS_06_NAME = list; }
	public void setList_ITEM_CLASS_07_TYP(List list) { l_ITEM_CLASS_07_TYP = list; }
	public void setList_ITEM_CLASS_07_NAME(List list) { l_ITEM_CLASS_07_NAME = list; }
	public void setList_ITEM_CLASS_08_TYP(List list) { l_ITEM_CLASS_08_TYP = list; }
	public void setList_ITEM_CLASS_08_NAME(List list) { l_ITEM_CLASS_08_NAME = list; }
	public void setList_ITEM_CLASS_09_TYP(List list) { l_ITEM_CLASS_09_TYP = list; }
	public void setList_ITEM_CLASS_09_NAME(List list) { l_ITEM_CLASS_09_NAME = list; }
	public void setList_ITEM_CLASS_10_TYP(List list) { l_ITEM_CLASS_10_TYP = list; }
	public void setList_ITEM_CLASS_10_NAME(List list) { l_ITEM_CLASS_10_NAME = list; }
	public void setList_ITEM_CLASS_11_TYP(List list) { l_ITEM_CLASS_11_TYP = list; }
	public void setList_ITEM_CLASS_11_NAME(List list) { l_ITEM_CLASS_11_NAME = list; }
	public void setList_ITEM_CLASS_12_TYP(List list) { l_ITEM_CLASS_12_TYP = list; }
	public void setList_ITEM_CLASS_12_NAME(List list) { l_ITEM_CLASS_12_NAME = list; }
	public void setList_DEPO_TYP_name(List list) { l_DEPO_TYP_name = list; }
	public void setList_DEPO_TYP_val(List list) { l_DEPO_TYP_val = list; }
	public void setList_LOT_CTRL_FLG_name(List list) { l_LOT_CTRL_FLG_name = list; }
	public void setList_LOT_CTRL_FLG_val(List list) { l_LOT_CTRL_FLG_val = list; }
	public void setList_LOT_NUMBERING_TYP_name(List list) { l_LOT_NUMBERING_TYP_name = list; }
	public void setList_LOT_NUMBERING_TYP_val(List list) { l_LOT_NUMBERING_TYP_val = list; }
	public void setList_MANHOUR_TYP_name(List list) { l_MANHOUR_TYP_name = list; }
	public void setList_MANHOUR_TYP_val(List list) { l_MANHOUR_TYP_val = list; }
	public void setList_h_APR_ITEM(List list) { l_h_APR_ITEM = list; }
	public void setList_h_SCREENMOVE_TYP(List list) { l_h_SCREENMOVE_TYP = list; }
	public void setList_h_APPR_ID(List list) { l_h_APPR_ID = list; }
	public void setList_APPR_REMARKS(List list) { l_APPR_REMARKS = list; }
	public void setList_PJ_CD_name(List list) { l_PJ_CD_name = list; }
	public void setList_PJ_CD_val(List list) { l_PJ_CD_val = list; }
	public void setList_SEG_CONTENTS1_name(List list) { l_SEG_CONTENTS1_name = list; }
	public void setList_SEG_CONTENTS1_val(List list) { l_SEG_CONTENTS1_val = list; }
	public void setList_SEG_CONTENTS2_name(List list) { l_SEG_CONTENTS2_name = list; }
	public void setList_SEG_CONTENTS2_val(List list) { l_SEG_CONTENTS2_val = list; }
	public void setList_SEG_CONTENTS3_name(List list) { l_SEG_CONTENTS3_name = list; }
	public void setList_SEG_CONTENTS3_val(List list) { l_SEG_CONTENTS3_val = list; }
	public void setList_SEG_CONTENTS4_name(List list) { l_SEG_CONTENTS4_name = list; }
	public void setList_SEG_CONTENTS4_val(List list) { l_SEG_CONTENTS4_val = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_SUM_PROP_LT(List list) { l_SUM_PROP_LT = list; }
	public void setList_SUM_FIXED_LT(List list) { l_SUM_FIXED_LT = list; }
	public void setList_LOTCTRLFLG(List list) { l_LOTCTRLFLG = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_DRAW_CD(List list) { l_DRAW_CD = list; }
	public void setList_SPEC(List list) { l_SPEC = list; }
	public void setList_HIGH_LEVEL_NO(List list) { l_HIGH_LEVEL_NO = list; }
	public void setList_ISSUE_TYP(List list) { l_ISSUE_TYP = list; }
	public void setList_OUTSIDE_TYP(List list) { l_OUTSIDE_TYP = list; }
	public void setList_STOCK_UNIT_FLG(List list) { l_STOCK_UNIT_FLG = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_PKG_UNIT(List list) { l_PKG_UNIT = list; }
	public void setList_PKG_UNIT_QTY(List list) { l_PKG_UNIT_QTY = list; }
	public void setList_UNIT_QTY_TYP(List list) { l_UNIT_QTY_TYP = list; }
	public void setList_ODR_LT(List list) { l_ODR_LT = list; }
	public void setList_ISSUE_LT(List list) { l_ISSUE_LT = list; }
	public void setList_FIXED_LT(List list) { l_FIXED_LT = list; }
	public void setList_PROP_LOT_SIZE(List list) { l_PROP_LOT_SIZE = list; }
	public void setList_PROP_LT(List list) { l_PROP_LT = list; }
	public void setList_ITEM_SPOIL(List list) { l_ITEM_SPOIL = list; }
	public void setList_SAFETY_LT(List list) { l_SAFETY_LT = list; }
	public void setList_SAFETY_STOCK(List list) { l_SAFETY_STOCK = list; }
	public void setList_MRP_ODR_TYP(List list) { l_MRP_ODR_TYP = list; }
	public void setList_LOT_SIZING_TYP(List list) { l_LOT_SIZING_TYP = list; }
	public void setList_MAX_PERIOD(List list) { l_MAX_PERIOD = list; }
	public void setList_FIXED_ODR_QTY(List list) { l_FIXED_ODR_QTY = list; }
	public void setList_MAX_ODR_QTY(List list) { l_MAX_ODR_QTY = list; }
	public void setList_MIN_ODR_QTY(List list) { l_MIN_ODR_QTY = list; }
	public void setList_ODR_POINT(List list) { l_ODR_POINT = list; }
	public void setList_MUL_ODR_QTY(List list) { l_MUL_ODR_QTY = list; }
	public void setList_MPS_FLG(List list) { l_MPS_FLG = list; }
	public void setList_ACPT_INSPC_TYP(List list) { l_ACPT_INSPC_TYP = list; }
	public void setList_PRODUCT_TYP(List list) { l_PRODUCT_TYP = list; }
	public void setList_CLASIFICATION_CD(List list) { l_CLASIFICATION_CD = list; }
	public void setList_UNIT_WEIGHT(List list) { l_UNIT_WEIGHT = list; }
	public void setList_ABC_TYP(List list) { l_ABC_TYP = list; }
	public void setList_OPR_RSLT_TYP(List list) { l_OPR_RSLT_TYP = list; }
	public void setList_SPL_ITEM_TYP(List list) { l_SPL_ITEM_TYP = list; }
	public void setList_TAX_CD(List list) { l_TAX_CD = list; }
	public void setList_TAX_NAME(List list) { l_TAX_NAME = list; }
	public void setList_CAL_NO(List list) { l_CAL_NO = list; }
	public void setList_CAL_NAME(List list) { l_CAL_NAME = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_ITEM_CLASS_01_CD(List list) { l_ITEM_CLASS_01_CD = list; }
	public void setList_ITEM_CLASS_02_CD(List list) { l_ITEM_CLASS_02_CD = list; }
	public void setList_ITEM_CLASS_03_CD(List list) { l_ITEM_CLASS_03_CD = list; }
	public void setList_ITEM_CLASS_04_CD(List list) { l_ITEM_CLASS_04_CD = list; }
	public void setList_ITEM_CLASS_05_CD(List list) { l_ITEM_CLASS_05_CD = list; }
	public void setList_ITEM_CLASS_06_CD(List list) { l_ITEM_CLASS_06_CD = list; }
	public void setList_ITEM_CLASS_07_CD(List list) { l_ITEM_CLASS_07_CD = list; }
	public void setList_ITEM_CLASS_08_CD(List list) { l_ITEM_CLASS_08_CD = list; }
	public void setList_ITEM_CLASS_09_CD(List list) { l_ITEM_CLASS_09_CD = list; }
	public void setList_ITEM_CLASS_10_CD(List list) { l_ITEM_CLASS_10_CD = list; }
	public void setList_ITEM_CLASS_11_CD(List list) { l_ITEM_CLASS_11_CD = list; }
	public void setList_ITEM_CLASS_12_CD(List list) { l_ITEM_CLASS_12_CD = list; }
	public void setList_DEPO_TYP(List list) { l_DEPO_TYP = list; }
	public void setList_LOT_CTRL_FLG(List list) { l_LOT_CTRL_FLG = list; }
	public void setList_LOT_NUMBERING_TYP(List list) { l_LOT_NUMBERING_TYP = list; }
	public void setList_BEST_BEFORE_YEAR(List list) { l_BEST_BEFORE_YEAR = list; }
	public void setList_BEST_BEFORE_MONTH(List list) { l_BEST_BEFORE_MONTH = list; }
	public void setList_BEST_BEFORE_DAY(List list) { l_BEST_BEFORE_DAY = list; }
	public void setList_REMARK1(List list) { l_REMARK1 = list; }
	public void setList_REMARK2(List list) { l_REMARK2 = list; }
	public void setList_MANHOUR_TYP(List list) { l_MANHOUR_TYP = list; }
	public void setList_DEPT_CD(List list) { l_DEPT_CD = list; }
	public void setList_DEPT_NAME(List list) { l_DEPT_NAME = list; }
	public void setList_PJ_CD(List list) { l_PJ_CD = list; }
	public void setList_SEG_CONTENTS1(List list) { l_SEG_CONTENTS1 = list; }
	public void setList_SEG_CONTENTS2(List list) { l_SEG_CONTENTS2 = list; }
	public void setList_SEG_CONTENTS3(List list) { l_SEG_CONTENTS3 = list; }
	public void setList_SEG_CONTENTS4(List list) { l_SEG_CONTENTS4 = list; }
	public void setList_PUCH_ODR_CD(List list) { l_PUCH_ODR_CD = list; }
	public void setList_ONEROUS_CONS_NO(List list) { l_ONEROUS_CONS_NO = list; }
	public void setList_uMRP_ODR_TYP_DISPLAY_NAME(List list) { l_uMRP_ODR_TYP_DISPLAY_NAME = list; }
	public void setList_uMRP_ODR_TYP_VALUE(List list) { l_uMRP_ODR_TYP_VALUE = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_VALUE(List list) { l_VALUE = list; }
	public void setList_DISPLAY_NAME(List list) { l_DISPLAY_NAME = list; }

	public int setL2L_ISSUE_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_TYP_name == null) {
			l_ISSUE_TYP_name = new ArrayList();
		} else {
			l_ISSUE_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_TYP_name.add(((AA0010010Struct) list.get(i)).getISSUE_TYP_name());
		}
		return size;
	}
	public int setL2L_ISSUE_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_TYP_val == null) {
			l_ISSUE_TYP_val = new ArrayList();
		} else {
			l_ISSUE_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_TYP_val.add(((AA0010010Struct) list.get(i)).getISSUE_TYP_val());
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
			l_OUTSIDE_TYP_name.add(((AA0010010Struct) list.get(i)).getOUTSIDE_TYP_name());
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
			l_OUTSIDE_TYP_val.add(((AA0010010Struct) list.get(i)).getOUTSIDE_TYP_val());
		}
		return size;
	}
	public int setL2L_STOCK_UNIT_FLG_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_UNIT_FLG_name == null) {
			l_STOCK_UNIT_FLG_name = new ArrayList();
		} else {
			l_STOCK_UNIT_FLG_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_UNIT_FLG_name.add(((AA0010010Struct) list.get(i)).getSTOCK_UNIT_FLG_name());
		}
		return size;
	}
	public int setL2L_STOCK_UNIT_FLG_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_UNIT_FLG_val == null) {
			l_STOCK_UNIT_FLG_val = new ArrayList();
		} else {
			l_STOCK_UNIT_FLG_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_UNIT_FLG_val.add(((AA0010010Struct) list.get(i)).getSTOCK_UNIT_FLG_val());
		}
		return size;
	}
	public int setL2L_UNIT_QTY_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_QTY_TYP_name == null) {
			l_UNIT_QTY_TYP_name = new ArrayList();
		} else {
			l_UNIT_QTY_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_QTY_TYP_name.add(((AA0010010Struct) list.get(i)).getUNIT_QTY_TYP_name());
		}
		return size;
	}
	public int setL2L_UNIT_QTY_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_QTY_TYP_val == null) {
			l_UNIT_QTY_TYP_val = new ArrayList();
		} else {
			l_UNIT_QTY_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_QTY_TYP_val.add(((AA0010010Struct) list.get(i)).getUNIT_QTY_TYP_val());
		}
		return size;
	}
	public int setL2L_MRP_ODR_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_ODR_TYP_name == null) {
			l_MRP_ODR_TYP_name = new ArrayList();
		} else {
			l_MRP_ODR_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_ODR_TYP_name.add(((AA0010010Struct) list.get(i)).getMRP_ODR_TYP_name());
		}
		return size;
	}
	public int setL2L_MRP_ODR_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_ODR_TYP_val == null) {
			l_MRP_ODR_TYP_val = new ArrayList();
		} else {
			l_MRP_ODR_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_ODR_TYP_val.add(((AA0010010Struct) list.get(i)).getMRP_ODR_TYP_val());
		}
		return size;
	}
	public int setL2L_ACPT_INSPC_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACPT_INSPC_TYP_name == null) {
			l_ACPT_INSPC_TYP_name = new ArrayList();
		} else {
			l_ACPT_INSPC_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACPT_INSPC_TYP_name.add(((AA0010010Struct) list.get(i)).getACPT_INSPC_TYP_name());
		}
		return size;
	}
	public int setL2L_ACPT_INSPC_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACPT_INSPC_TYP_val == null) {
			l_ACPT_INSPC_TYP_val = new ArrayList();
		} else {
			l_ACPT_INSPC_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACPT_INSPC_TYP_val.add(((AA0010010Struct) list.get(i)).getACPT_INSPC_TYP_val());
		}
		return size;
	}
	public int setL2L_PRODUCT_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRODUCT_TYP_name == null) {
			l_PRODUCT_TYP_name = new ArrayList();
		} else {
			l_PRODUCT_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRODUCT_TYP_name.add(((AA0010010Struct) list.get(i)).getPRODUCT_TYP_name());
		}
		return size;
	}
	public int setL2L_PRODUCT_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRODUCT_TYP_val == null) {
			l_PRODUCT_TYP_val = new ArrayList();
		} else {
			l_PRODUCT_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRODUCT_TYP_val.add(((AA0010010Struct) list.get(i)).getPRODUCT_TYP_val());
		}
		return size;
	}
	public int setL2L_ABC_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ABC_TYP_name == null) {
			l_ABC_TYP_name = new ArrayList();
		} else {
			l_ABC_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ABC_TYP_name.add(((AA0010010Struct) list.get(i)).getABC_TYP_name());
		}
		return size;
	}
	public int setL2L_ABC_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ABC_TYP_val == null) {
			l_ABC_TYP_val = new ArrayList();
		} else {
			l_ABC_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ABC_TYP_val.add(((AA0010010Struct) list.get(i)).getABC_TYP_val());
		}
		return size;
	}
	public int setL2L_OPR_RSLT_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_RSLT_TYP_name == null) {
			l_OPR_RSLT_TYP_name = new ArrayList();
		} else {
			l_OPR_RSLT_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_RSLT_TYP_name.add(((AA0010010Struct) list.get(i)).getOPR_RSLT_TYP_name());
		}
		return size;
	}
	public int setL2L_OPR_RSLT_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_RSLT_TYP_val == null) {
			l_OPR_RSLT_TYP_val = new ArrayList();
		} else {
			l_OPR_RSLT_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_RSLT_TYP_val.add(((AA0010010Struct) list.get(i)).getOPR_RSLT_TYP_val());
		}
		return size;
	}
	public int setL2L_SPL_ITEM_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SPL_ITEM_TYP_name == null) {
			l_SPL_ITEM_TYP_name = new ArrayList();
		} else {
			l_SPL_ITEM_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SPL_ITEM_TYP_name.add(((AA0010010Struct) list.get(i)).getSPL_ITEM_TYP_name());
		}
		return size;
	}
	public int setL2L_SPL_ITEM_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SPL_ITEM_TYP_val == null) {
			l_SPL_ITEM_TYP_val = new ArrayList();
		} else {
			l_SPL_ITEM_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SPL_ITEM_TYP_val.add(((AA0010010Struct) list.get(i)).getSPL_ITEM_TYP_val());
		}
		return size;
	}
	public int setL2L_LOT_SIZING_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOT_SIZING_TYP_name == null) {
			l_LOT_SIZING_TYP_name = new ArrayList();
		} else {
			l_LOT_SIZING_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOT_SIZING_TYP_name.add(((AA0010010Struct) list.get(i)).getLOT_SIZING_TYP_name());
		}
		return size;
	}
	public int setL2L_LOT_SIZING_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOT_SIZING_TYP_val == null) {
			l_LOT_SIZING_TYP_val = new ArrayList();
		} else {
			l_LOT_SIZING_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOT_SIZING_TYP_val.add(((AA0010010Struct) list.get(i)).getLOT_SIZING_TYP_val());
		}
		return size;
	}
	public int setL2L_MPS_FLG_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MPS_FLG_name == null) {
			l_MPS_FLG_name = new ArrayList();
		} else {
			l_MPS_FLG_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MPS_FLG_name.add(((AA0010010Struct) list.get(i)).getMPS_FLG_name());
		}
		return size;
	}
	public int setL2L_MPS_FLG_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MPS_FLG_val == null) {
			l_MPS_FLG_val = new ArrayList();
		} else {
			l_MPS_FLG_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MPS_FLG_val.add(((AA0010010Struct) list.get(i)).getMPS_FLG_val());
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
			l_h_ITEM_CD.add(((AA0010010Struct) list.get(i)).geth_ITEM_CD());
		}
		return size;
	}
	public int setL2L_STOCK_UNIT_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_UNIT_name == null) {
			l_STOCK_UNIT_name = new ArrayList();
		} else {
			l_STOCK_UNIT_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_UNIT_name.add(((AA0010010Struct) list.get(i)).getSTOCK_UNIT_name());
		}
		return size;
	}
	public int setL2L_STOCK_UNIT_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_UNIT_val == null) {
			l_STOCK_UNIT_val = new ArrayList();
		} else {
			l_STOCK_UNIT_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_UNIT_val.add(((AA0010010Struct) list.get(i)).getSTOCK_UNIT_val());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_01_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_01_TYP == null) {
			l_ITEM_CLASS_01_TYP = new ArrayList();
		} else {
			l_ITEM_CLASS_01_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_01_TYP.add(((AA0010010Struct) list.get(i)).getITEM_CLASS_01_TYP());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_01_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_01_NAME == null) {
			l_ITEM_CLASS_01_NAME = new ArrayList();
		} else {
			l_ITEM_CLASS_01_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_01_NAME.add(((AA0010010Struct) list.get(i)).getITEM_CLASS_01_NAME());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_02_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_02_TYP == null) {
			l_ITEM_CLASS_02_TYP = new ArrayList();
		} else {
			l_ITEM_CLASS_02_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_02_TYP.add(((AA0010010Struct) list.get(i)).getITEM_CLASS_02_TYP());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_02_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_02_NAME == null) {
			l_ITEM_CLASS_02_NAME = new ArrayList();
		} else {
			l_ITEM_CLASS_02_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_02_NAME.add(((AA0010010Struct) list.get(i)).getITEM_CLASS_02_NAME());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_03_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_03_TYP == null) {
			l_ITEM_CLASS_03_TYP = new ArrayList();
		} else {
			l_ITEM_CLASS_03_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_03_TYP.add(((AA0010010Struct) list.get(i)).getITEM_CLASS_03_TYP());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_03_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_03_NAME == null) {
			l_ITEM_CLASS_03_NAME = new ArrayList();
		} else {
			l_ITEM_CLASS_03_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_03_NAME.add(((AA0010010Struct) list.get(i)).getITEM_CLASS_03_NAME());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_04_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_04_TYP == null) {
			l_ITEM_CLASS_04_TYP = new ArrayList();
		} else {
			l_ITEM_CLASS_04_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_04_TYP.add(((AA0010010Struct) list.get(i)).getITEM_CLASS_04_TYP());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_04_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_04_NAME == null) {
			l_ITEM_CLASS_04_NAME = new ArrayList();
		} else {
			l_ITEM_CLASS_04_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_04_NAME.add(((AA0010010Struct) list.get(i)).getITEM_CLASS_04_NAME());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_05_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_05_TYP == null) {
			l_ITEM_CLASS_05_TYP = new ArrayList();
		} else {
			l_ITEM_CLASS_05_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_05_TYP.add(((AA0010010Struct) list.get(i)).getITEM_CLASS_05_TYP());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_05_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_05_NAME == null) {
			l_ITEM_CLASS_05_NAME = new ArrayList();
		} else {
			l_ITEM_CLASS_05_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_05_NAME.add(((AA0010010Struct) list.get(i)).getITEM_CLASS_05_NAME());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_06_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_06_TYP == null) {
			l_ITEM_CLASS_06_TYP = new ArrayList();
		} else {
			l_ITEM_CLASS_06_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_06_TYP.add(((AA0010010Struct) list.get(i)).getITEM_CLASS_06_TYP());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_06_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_06_NAME == null) {
			l_ITEM_CLASS_06_NAME = new ArrayList();
		} else {
			l_ITEM_CLASS_06_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_06_NAME.add(((AA0010010Struct) list.get(i)).getITEM_CLASS_06_NAME());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_07_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_07_TYP == null) {
			l_ITEM_CLASS_07_TYP = new ArrayList();
		} else {
			l_ITEM_CLASS_07_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_07_TYP.add(((AA0010010Struct) list.get(i)).getITEM_CLASS_07_TYP());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_07_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_07_NAME == null) {
			l_ITEM_CLASS_07_NAME = new ArrayList();
		} else {
			l_ITEM_CLASS_07_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_07_NAME.add(((AA0010010Struct) list.get(i)).getITEM_CLASS_07_NAME());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_08_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_08_TYP == null) {
			l_ITEM_CLASS_08_TYP = new ArrayList();
		} else {
			l_ITEM_CLASS_08_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_08_TYP.add(((AA0010010Struct) list.get(i)).getITEM_CLASS_08_TYP());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_08_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_08_NAME == null) {
			l_ITEM_CLASS_08_NAME = new ArrayList();
		} else {
			l_ITEM_CLASS_08_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_08_NAME.add(((AA0010010Struct) list.get(i)).getITEM_CLASS_08_NAME());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_09_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_09_TYP == null) {
			l_ITEM_CLASS_09_TYP = new ArrayList();
		} else {
			l_ITEM_CLASS_09_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_09_TYP.add(((AA0010010Struct) list.get(i)).getITEM_CLASS_09_TYP());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_09_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_09_NAME == null) {
			l_ITEM_CLASS_09_NAME = new ArrayList();
		} else {
			l_ITEM_CLASS_09_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_09_NAME.add(((AA0010010Struct) list.get(i)).getITEM_CLASS_09_NAME());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_10_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_10_TYP == null) {
			l_ITEM_CLASS_10_TYP = new ArrayList();
		} else {
			l_ITEM_CLASS_10_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_10_TYP.add(((AA0010010Struct) list.get(i)).getITEM_CLASS_10_TYP());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_10_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_10_NAME == null) {
			l_ITEM_CLASS_10_NAME = new ArrayList();
		} else {
			l_ITEM_CLASS_10_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_10_NAME.add(((AA0010010Struct) list.get(i)).getITEM_CLASS_10_NAME());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_11_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_11_TYP == null) {
			l_ITEM_CLASS_11_TYP = new ArrayList();
		} else {
			l_ITEM_CLASS_11_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_11_TYP.add(((AA0010010Struct) list.get(i)).getITEM_CLASS_11_TYP());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_11_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_11_NAME == null) {
			l_ITEM_CLASS_11_NAME = new ArrayList();
		} else {
			l_ITEM_CLASS_11_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_11_NAME.add(((AA0010010Struct) list.get(i)).getITEM_CLASS_11_NAME());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_12_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_12_TYP == null) {
			l_ITEM_CLASS_12_TYP = new ArrayList();
		} else {
			l_ITEM_CLASS_12_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_12_TYP.add(((AA0010010Struct) list.get(i)).getITEM_CLASS_12_TYP());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_12_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_12_NAME == null) {
			l_ITEM_CLASS_12_NAME = new ArrayList();
		} else {
			l_ITEM_CLASS_12_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_12_NAME.add(((AA0010010Struct) list.get(i)).getITEM_CLASS_12_NAME());
		}
		return size;
	}
	public int setL2L_DEPO_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEPO_TYP_name == null) {
			l_DEPO_TYP_name = new ArrayList();
		} else {
			l_DEPO_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEPO_TYP_name.add(((AA0010010Struct) list.get(i)).getDEPO_TYP_name());
		}
		return size;
	}
	public int setL2L_DEPO_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEPO_TYP_val == null) {
			l_DEPO_TYP_val = new ArrayList();
		} else {
			l_DEPO_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEPO_TYP_val.add(((AA0010010Struct) list.get(i)).getDEPO_TYP_val());
		}
		return size;
	}
	public int setL2L_LOT_CTRL_FLG_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOT_CTRL_FLG_name == null) {
			l_LOT_CTRL_FLG_name = new ArrayList();
		} else {
			l_LOT_CTRL_FLG_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOT_CTRL_FLG_name.add(((AA0010010Struct) list.get(i)).getLOT_CTRL_FLG_name());
		}
		return size;
	}
	public int setL2L_LOT_CTRL_FLG_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOT_CTRL_FLG_val == null) {
			l_LOT_CTRL_FLG_val = new ArrayList();
		} else {
			l_LOT_CTRL_FLG_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOT_CTRL_FLG_val.add(((AA0010010Struct) list.get(i)).getLOT_CTRL_FLG_val());
		}
		return size;
	}
	public int setL2L_LOT_NUMBERING_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOT_NUMBERING_TYP_name == null) {
			l_LOT_NUMBERING_TYP_name = new ArrayList();
		} else {
			l_LOT_NUMBERING_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOT_NUMBERING_TYP_name.add(((AA0010010Struct) list.get(i)).getLOT_NUMBERING_TYP_name());
		}
		return size;
	}
	public int setL2L_LOT_NUMBERING_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOT_NUMBERING_TYP_val == null) {
			l_LOT_NUMBERING_TYP_val = new ArrayList();
		} else {
			l_LOT_NUMBERING_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOT_NUMBERING_TYP_val.add(((AA0010010Struct) list.get(i)).getLOT_NUMBERING_TYP_val());
		}
		return size;
	}
	public int setL2L_MANHOUR_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MANHOUR_TYP_name == null) {
			l_MANHOUR_TYP_name = new ArrayList();
		} else {
			l_MANHOUR_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MANHOUR_TYP_name.add(((AA0010010Struct) list.get(i)).getMANHOUR_TYP_name());
		}
		return size;
	}
	public int setL2L_MANHOUR_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MANHOUR_TYP_val == null) {
			l_MANHOUR_TYP_val = new ArrayList();
		} else {
			l_MANHOUR_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MANHOUR_TYP_val.add(((AA0010010Struct) list.get(i)).getMANHOUR_TYP_val());
		}
		return size;
	}
	public int setL2L_h_APR_ITEM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_APR_ITEM == null) {
			l_h_APR_ITEM = new ArrayList();
		} else {
			l_h_APR_ITEM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_APR_ITEM.add(((AA0010010Struct) list.get(i)).geth_APR_ITEM());
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
			l_h_SCREENMOVE_TYP.add(((AA0010010Struct) list.get(i)).geth_SCREENMOVE_TYP());
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
			l_h_APPR_ID.add(((AA0010010Struct) list.get(i)).geth_APPR_ID());
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
			l_APPR_REMARKS.add(((AA0010010Struct) list.get(i)).getAPPR_REMARKS());
		}
		return size;
	}
	public int setL2L_PJ_CD_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PJ_CD_name == null) {
			l_PJ_CD_name = new ArrayList();
		} else {
			l_PJ_CD_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PJ_CD_name.add(((AA0010010Struct) list.get(i)).getPJ_CD_name());
		}
		return size;
	}
	public int setL2L_PJ_CD_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PJ_CD_val == null) {
			l_PJ_CD_val = new ArrayList();
		} else {
			l_PJ_CD_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PJ_CD_val.add(((AA0010010Struct) list.get(i)).getPJ_CD_val());
		}
		return size;
	}
	public int setL2L_SEG_CONTENTS1_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEG_CONTENTS1_name == null) {
			l_SEG_CONTENTS1_name = new ArrayList();
		} else {
			l_SEG_CONTENTS1_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEG_CONTENTS1_name.add(((AA0010010Struct) list.get(i)).getSEG_CONTENTS1_name());
		}
		return size;
	}
	public int setL2L_SEG_CONTENTS1_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEG_CONTENTS1_val == null) {
			l_SEG_CONTENTS1_val = new ArrayList();
		} else {
			l_SEG_CONTENTS1_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEG_CONTENTS1_val.add(((AA0010010Struct) list.get(i)).getSEG_CONTENTS1_val());
		}
		return size;
	}
	public int setL2L_SEG_CONTENTS2_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEG_CONTENTS2_name == null) {
			l_SEG_CONTENTS2_name = new ArrayList();
		} else {
			l_SEG_CONTENTS2_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEG_CONTENTS2_name.add(((AA0010010Struct) list.get(i)).getSEG_CONTENTS2_name());
		}
		return size;
	}
	public int setL2L_SEG_CONTENTS2_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEG_CONTENTS2_val == null) {
			l_SEG_CONTENTS2_val = new ArrayList();
		} else {
			l_SEG_CONTENTS2_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEG_CONTENTS2_val.add(((AA0010010Struct) list.get(i)).getSEG_CONTENTS2_val());
		}
		return size;
	}
	public int setL2L_SEG_CONTENTS3_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEG_CONTENTS3_name == null) {
			l_SEG_CONTENTS3_name = new ArrayList();
		} else {
			l_SEG_CONTENTS3_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEG_CONTENTS3_name.add(((AA0010010Struct) list.get(i)).getSEG_CONTENTS3_name());
		}
		return size;
	}
	public int setL2L_SEG_CONTENTS3_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEG_CONTENTS3_val == null) {
			l_SEG_CONTENTS3_val = new ArrayList();
		} else {
			l_SEG_CONTENTS3_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEG_CONTENTS3_val.add(((AA0010010Struct) list.get(i)).getSEG_CONTENTS3_val());
		}
		return size;
	}
	public int setL2L_SEG_CONTENTS4_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEG_CONTENTS4_name == null) {
			l_SEG_CONTENTS4_name = new ArrayList();
		} else {
			l_SEG_CONTENTS4_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEG_CONTENTS4_name.add(((AA0010010Struct) list.get(i)).getSEG_CONTENTS4_name());
		}
		return size;
	}
	public int setL2L_SEG_CONTENTS4_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEG_CONTENTS4_val == null) {
			l_SEG_CONTENTS4_val = new ArrayList();
		} else {
			l_SEG_CONTENTS4_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEG_CONTENTS4_val.add(((AA0010010Struct) list.get(i)).getSEG_CONTENTS4_val());
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
			l_PLANT_CD.add(((AA0010010Struct) list.get(i)).getPLANT_CD());
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
			l_SUM_PROP_LT.add(((AA0010010Struct) list.get(i)).getSUM_PROP_LT());
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
			l_SUM_FIXED_LT.add(((AA0010010Struct) list.get(i)).getSUM_FIXED_LT());
		}
		return size;
	}
	public int setL2L_LOTCTRLFLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOTCTRLFLG == null) {
			l_LOTCTRLFLG = new ArrayList();
		} else {
			l_LOTCTRLFLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOTCTRLFLG.add(((AA0010010Struct) list.get(i)).getLOTCTRLFLG());
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
			l_ITEM_CD.add(((AA0010010Struct) list.get(i)).getITEM_CD());
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
			l_ITEM_NAME.add(((AA0010010Struct) list.get(i)).getITEM_NAME());
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
			l_DRAW_CD.add(((AA0010010Struct) list.get(i)).getDRAW_CD());
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
			l_SPEC.add(((AA0010010Struct) list.get(i)).getSPEC());
		}
		return size;
	}
	public int setL2L_HIGH_LEVEL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HIGH_LEVEL_NO == null) {
			l_HIGH_LEVEL_NO = new ArrayList();
		} else {
			l_HIGH_LEVEL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HIGH_LEVEL_NO.add(((AA0010010Struct) list.get(i)).getHIGH_LEVEL_NO());
		}
		return size;
	}
	public int setL2L_ISSUE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_TYP == null) {
			l_ISSUE_TYP = new ArrayList();
		} else {
			l_ISSUE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_TYP.add(((AA0010010Struct) list.get(i)).getISSUE_TYP());
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
			l_OUTSIDE_TYP.add(((AA0010010Struct) list.get(i)).getOUTSIDE_TYP());
		}
		return size;
	}
	public int setL2L_STOCK_UNIT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_UNIT_FLG == null) {
			l_STOCK_UNIT_FLG = new ArrayList();
		} else {
			l_STOCK_UNIT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_UNIT_FLG.add(((AA0010010Struct) list.get(i)).getSTOCK_UNIT_FLG());
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
			l_STOCK_UNIT.add(((AA0010010Struct) list.get(i)).getSTOCK_UNIT());
		}
		return size;
	}
	public int setL2L_PKG_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PKG_UNIT == null) {
			l_PKG_UNIT = new ArrayList();
		} else {
			l_PKG_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PKG_UNIT.add(((AA0010010Struct) list.get(i)).getPKG_UNIT());
		}
		return size;
	}
	public int setL2L_PKG_UNIT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PKG_UNIT_QTY == null) {
			l_PKG_UNIT_QTY = new ArrayList();
		} else {
			l_PKG_UNIT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PKG_UNIT_QTY.add(((AA0010010Struct) list.get(i)).getPKG_UNIT_QTY());
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
			l_UNIT_QTY_TYP.add(((AA0010010Struct) list.get(i)).getUNIT_QTY_TYP());
		}
		return size;
	}
	public int setL2L_ODR_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_LT == null) {
			l_ODR_LT = new ArrayList();
		} else {
			l_ODR_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_LT.add(((AA0010010Struct) list.get(i)).getODR_LT());
		}
		return size;
	}
	public int setL2L_ISSUE_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_LT == null) {
			l_ISSUE_LT = new ArrayList();
		} else {
			l_ISSUE_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_LT.add(((AA0010010Struct) list.get(i)).getISSUE_LT());
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
			l_FIXED_LT.add(((AA0010010Struct) list.get(i)).getFIXED_LT());
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
			l_PROP_LOT_SIZE.add(((AA0010010Struct) list.get(i)).getPROP_LOT_SIZE());
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
			l_PROP_LT.add(((AA0010010Struct) list.get(i)).getPROP_LT());
		}
		return size;
	}
	public int setL2L_ITEM_SPOIL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_SPOIL == null) {
			l_ITEM_SPOIL = new ArrayList();
		} else {
			l_ITEM_SPOIL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_SPOIL.add(((AA0010010Struct) list.get(i)).getITEM_SPOIL());
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
			l_SAFETY_LT.add(((AA0010010Struct) list.get(i)).getSAFETY_LT());
		}
		return size;
	}
	public int setL2L_SAFETY_STOCK(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SAFETY_STOCK == null) {
			l_SAFETY_STOCK = new ArrayList();
		} else {
			l_SAFETY_STOCK.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SAFETY_STOCK.add(((AA0010010Struct) list.get(i)).getSAFETY_STOCK());
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
			l_MRP_ODR_TYP.add(((AA0010010Struct) list.get(i)).getMRP_ODR_TYP());
		}
		return size;
	}
	public int setL2L_LOT_SIZING_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOT_SIZING_TYP == null) {
			l_LOT_SIZING_TYP = new ArrayList();
		} else {
			l_LOT_SIZING_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOT_SIZING_TYP.add(((AA0010010Struct) list.get(i)).getLOT_SIZING_TYP());
		}
		return size;
	}
	public int setL2L_MAX_PERIOD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MAX_PERIOD == null) {
			l_MAX_PERIOD = new ArrayList();
		} else {
			l_MAX_PERIOD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MAX_PERIOD.add(((AA0010010Struct) list.get(i)).getMAX_PERIOD());
		}
		return size;
	}
	public int setL2L_FIXED_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FIXED_ODR_QTY == null) {
			l_FIXED_ODR_QTY = new ArrayList();
		} else {
			l_FIXED_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FIXED_ODR_QTY.add(((AA0010010Struct) list.get(i)).getFIXED_ODR_QTY());
		}
		return size;
	}
	public int setL2L_MAX_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MAX_ODR_QTY == null) {
			l_MAX_ODR_QTY = new ArrayList();
		} else {
			l_MAX_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MAX_ODR_QTY.add(((AA0010010Struct) list.get(i)).getMAX_ODR_QTY());
		}
		return size;
	}
	public int setL2L_MIN_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MIN_ODR_QTY == null) {
			l_MIN_ODR_QTY = new ArrayList();
		} else {
			l_MIN_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MIN_ODR_QTY.add(((AA0010010Struct) list.get(i)).getMIN_ODR_QTY());
		}
		return size;
	}
	public int setL2L_ODR_POINT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ODR_POINT == null) {
			l_ODR_POINT = new ArrayList();
		} else {
			l_ODR_POINT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ODR_POINT.add(((AA0010010Struct) list.get(i)).getODR_POINT());
		}
		return size;
	}
	public int setL2L_MUL_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MUL_ODR_QTY == null) {
			l_MUL_ODR_QTY = new ArrayList();
		} else {
			l_MUL_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MUL_ODR_QTY.add(((AA0010010Struct) list.get(i)).getMUL_ODR_QTY());
		}
		return size;
	}
	public int setL2L_MPS_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MPS_FLG == null) {
			l_MPS_FLG = new ArrayList();
		} else {
			l_MPS_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MPS_FLG.add(((AA0010010Struct) list.get(i)).getMPS_FLG());
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
			l_ACPT_INSPC_TYP.add(((AA0010010Struct) list.get(i)).getACPT_INSPC_TYP());
		}
		return size;
	}
	public int setL2L_PRODUCT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRODUCT_TYP == null) {
			l_PRODUCT_TYP = new ArrayList();
		} else {
			l_PRODUCT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRODUCT_TYP.add(((AA0010010Struct) list.get(i)).getPRODUCT_TYP());
		}
		return size;
	}
	public int setL2L_CLASIFICATION_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CLASIFICATION_CD == null) {
			l_CLASIFICATION_CD = new ArrayList();
		} else {
			l_CLASIFICATION_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CLASIFICATION_CD.add(((AA0010010Struct) list.get(i)).getCLASIFICATION_CD());
		}
		return size;
	}
	public int setL2L_UNIT_WEIGHT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_WEIGHT == null) {
			l_UNIT_WEIGHT = new ArrayList();
		} else {
			l_UNIT_WEIGHT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_WEIGHT.add(((AA0010010Struct) list.get(i)).getUNIT_WEIGHT());
		}
		return size;
	}
	public int setL2L_ABC_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ABC_TYP == null) {
			l_ABC_TYP = new ArrayList();
		} else {
			l_ABC_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ABC_TYP.add(((AA0010010Struct) list.get(i)).getABC_TYP());
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
			l_OPR_RSLT_TYP.add(((AA0010010Struct) list.get(i)).getOPR_RSLT_TYP());
		}
		return size;
	}
	public int setL2L_SPL_ITEM_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SPL_ITEM_TYP == null) {
			l_SPL_ITEM_TYP = new ArrayList();
		} else {
			l_SPL_ITEM_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SPL_ITEM_TYP.add(((AA0010010Struct) list.get(i)).getSPL_ITEM_TYP());
		}
		return size;
	}
	public int setL2L_TAX_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_CD == null) {
			l_TAX_CD = new ArrayList();
		} else {
			l_TAX_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_CD.add(((AA0010010Struct) list.get(i)).getTAX_CD());
		}
		return size;
	}
	public int setL2L_TAX_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TAX_NAME == null) {
			l_TAX_NAME = new ArrayList();
		} else {
			l_TAX_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TAX_NAME.add(((AA0010010Struct) list.get(i)).getTAX_NAME());
		}
		return size;
	}
	public int setL2L_CAL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CAL_NO == null) {
			l_CAL_NO = new ArrayList();
		} else {
			l_CAL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CAL_NO.add(((AA0010010Struct) list.get(i)).getCAL_NO());
		}
		return size;
	}
	public int setL2L_CAL_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CAL_NAME == null) {
			l_CAL_NAME = new ArrayList();
		} else {
			l_CAL_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CAL_NAME.add(((AA0010010Struct) list.get(i)).getCAL_NAME());
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
			l_MODIFY_COUNT.add(((AA0010010Struct) list.get(i)).getMODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_01_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_01_CD == null) {
			l_ITEM_CLASS_01_CD = new ArrayList();
		} else {
			l_ITEM_CLASS_01_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_01_CD.add(((AA0010010Struct) list.get(i)).getITEM_CLASS_01_CD());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_02_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_02_CD == null) {
			l_ITEM_CLASS_02_CD = new ArrayList();
		} else {
			l_ITEM_CLASS_02_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_02_CD.add(((AA0010010Struct) list.get(i)).getITEM_CLASS_02_CD());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_03_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_03_CD == null) {
			l_ITEM_CLASS_03_CD = new ArrayList();
		} else {
			l_ITEM_CLASS_03_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_03_CD.add(((AA0010010Struct) list.get(i)).getITEM_CLASS_03_CD());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_04_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_04_CD == null) {
			l_ITEM_CLASS_04_CD = new ArrayList();
		} else {
			l_ITEM_CLASS_04_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_04_CD.add(((AA0010010Struct) list.get(i)).getITEM_CLASS_04_CD());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_05_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_05_CD == null) {
			l_ITEM_CLASS_05_CD = new ArrayList();
		} else {
			l_ITEM_CLASS_05_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_05_CD.add(((AA0010010Struct) list.get(i)).getITEM_CLASS_05_CD());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_06_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_06_CD == null) {
			l_ITEM_CLASS_06_CD = new ArrayList();
		} else {
			l_ITEM_CLASS_06_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_06_CD.add(((AA0010010Struct) list.get(i)).getITEM_CLASS_06_CD());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_07_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_07_CD == null) {
			l_ITEM_CLASS_07_CD = new ArrayList();
		} else {
			l_ITEM_CLASS_07_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_07_CD.add(((AA0010010Struct) list.get(i)).getITEM_CLASS_07_CD());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_08_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_08_CD == null) {
			l_ITEM_CLASS_08_CD = new ArrayList();
		} else {
			l_ITEM_CLASS_08_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_08_CD.add(((AA0010010Struct) list.get(i)).getITEM_CLASS_08_CD());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_09_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_09_CD == null) {
			l_ITEM_CLASS_09_CD = new ArrayList();
		} else {
			l_ITEM_CLASS_09_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_09_CD.add(((AA0010010Struct) list.get(i)).getITEM_CLASS_09_CD());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_10_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_10_CD == null) {
			l_ITEM_CLASS_10_CD = new ArrayList();
		} else {
			l_ITEM_CLASS_10_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_10_CD.add(((AA0010010Struct) list.get(i)).getITEM_CLASS_10_CD());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_11_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_11_CD == null) {
			l_ITEM_CLASS_11_CD = new ArrayList();
		} else {
			l_ITEM_CLASS_11_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_11_CD.add(((AA0010010Struct) list.get(i)).getITEM_CLASS_11_CD());
		}
		return size;
	}
	public int setL2L_ITEM_CLASS_12_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_CLASS_12_CD == null) {
			l_ITEM_CLASS_12_CD = new ArrayList();
		} else {
			l_ITEM_CLASS_12_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_CLASS_12_CD.add(((AA0010010Struct) list.get(i)).getITEM_CLASS_12_CD());
		}
		return size;
	}
	public int setL2L_DEPO_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEPO_TYP == null) {
			l_DEPO_TYP = new ArrayList();
		} else {
			l_DEPO_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEPO_TYP.add(((AA0010010Struct) list.get(i)).getDEPO_TYP());
		}
		return size;
	}
	public int setL2L_LOT_CTRL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOT_CTRL_FLG == null) {
			l_LOT_CTRL_FLG = new ArrayList();
		} else {
			l_LOT_CTRL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOT_CTRL_FLG.add(((AA0010010Struct) list.get(i)).getLOT_CTRL_FLG());
		}
		return size;
	}
	public int setL2L_LOT_NUMBERING_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOT_NUMBERING_TYP == null) {
			l_LOT_NUMBERING_TYP = new ArrayList();
		} else {
			l_LOT_NUMBERING_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOT_NUMBERING_TYP.add(((AA0010010Struct) list.get(i)).getLOT_NUMBERING_TYP());
		}
		return size;
	}
	public int setL2L_BEST_BEFORE_YEAR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BEST_BEFORE_YEAR == null) {
			l_BEST_BEFORE_YEAR = new ArrayList();
		} else {
			l_BEST_BEFORE_YEAR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BEST_BEFORE_YEAR.add(((AA0010010Struct) list.get(i)).getBEST_BEFORE_YEAR());
		}
		return size;
	}
	public int setL2L_BEST_BEFORE_MONTH(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BEST_BEFORE_MONTH == null) {
			l_BEST_BEFORE_MONTH = new ArrayList();
		} else {
			l_BEST_BEFORE_MONTH.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BEST_BEFORE_MONTH.add(((AA0010010Struct) list.get(i)).getBEST_BEFORE_MONTH());
		}
		return size;
	}
	public int setL2L_BEST_BEFORE_DAY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BEST_BEFORE_DAY == null) {
			l_BEST_BEFORE_DAY = new ArrayList();
		} else {
			l_BEST_BEFORE_DAY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BEST_BEFORE_DAY.add(((AA0010010Struct) list.get(i)).getBEST_BEFORE_DAY());
		}
		return size;
	}
	public int setL2L_REMARK1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_REMARK1 == null) {
			l_REMARK1 = new ArrayList();
		} else {
			l_REMARK1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_REMARK1.add(((AA0010010Struct) list.get(i)).getREMARK1());
		}
		return size;
	}
	public int setL2L_REMARK2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_REMARK2 == null) {
			l_REMARK2 = new ArrayList();
		} else {
			l_REMARK2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_REMARK2.add(((AA0010010Struct) list.get(i)).getREMARK2());
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
			l_MANHOUR_TYP.add(((AA0010010Struct) list.get(i)).getMANHOUR_TYP());
		}
		return size;
	}
	public int setL2L_DEPT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEPT_CD == null) {
			l_DEPT_CD = new ArrayList();
		} else {
			l_DEPT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEPT_CD.add(((AA0010010Struct) list.get(i)).getDEPT_CD());
		}
		return size;
	}
	public int setL2L_DEPT_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEPT_NAME == null) {
			l_DEPT_NAME = new ArrayList();
		} else {
			l_DEPT_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEPT_NAME.add(((AA0010010Struct) list.get(i)).getDEPT_NAME());
		}
		return size;
	}
	public int setL2L_PJ_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PJ_CD == null) {
			l_PJ_CD = new ArrayList();
		} else {
			l_PJ_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PJ_CD.add(((AA0010010Struct) list.get(i)).getPJ_CD());
		}
		return size;
	}
	public int setL2L_SEG_CONTENTS1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEG_CONTENTS1 == null) {
			l_SEG_CONTENTS1 = new ArrayList();
		} else {
			l_SEG_CONTENTS1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEG_CONTENTS1.add(((AA0010010Struct) list.get(i)).getSEG_CONTENTS1());
		}
		return size;
	}
	public int setL2L_SEG_CONTENTS2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEG_CONTENTS2 == null) {
			l_SEG_CONTENTS2 = new ArrayList();
		} else {
			l_SEG_CONTENTS2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEG_CONTENTS2.add(((AA0010010Struct) list.get(i)).getSEG_CONTENTS2());
		}
		return size;
	}
	public int setL2L_SEG_CONTENTS3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEG_CONTENTS3 == null) {
			l_SEG_CONTENTS3 = new ArrayList();
		} else {
			l_SEG_CONTENTS3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEG_CONTENTS3.add(((AA0010010Struct) list.get(i)).getSEG_CONTENTS3());
		}
		return size;
	}
	public int setL2L_SEG_CONTENTS4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEG_CONTENTS4 == null) {
			l_SEG_CONTENTS4 = new ArrayList();
		} else {
			l_SEG_CONTENTS4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEG_CONTENTS4.add(((AA0010010Struct) list.get(i)).getSEG_CONTENTS4());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_CD == null) {
			l_PUCH_ODR_CD = new ArrayList();
		} else {
			l_PUCH_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_CD.add(((AA0010010Struct) list.get(i)).getPUCH_ODR_CD());
		}
		return size;
	}
	public int setL2L_ONEROUS_CONS_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ONEROUS_CONS_NO == null) {
			l_ONEROUS_CONS_NO = new ArrayList();
		} else {
			l_ONEROUS_CONS_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ONEROUS_CONS_NO.add(((AA0010010Struct) list.get(i)).getONEROUS_CONS_NO());
		}
		return size;
	}
	public int setL2L_uMRP_ODR_TYP_DISPLAY_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_uMRP_ODR_TYP_DISPLAY_NAME == null) {
			l_uMRP_ODR_TYP_DISPLAY_NAME = new ArrayList();
		} else {
			l_uMRP_ODR_TYP_DISPLAY_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_uMRP_ODR_TYP_DISPLAY_NAME.add(((AA0010010Struct) list.get(i)).getuMRP_ODR_TYP_DISPLAY_NAME());
		}
		return size;
	}
	public int setL2L_uMRP_ODR_TYP_VALUE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_uMRP_ODR_TYP_VALUE == null) {
			l_uMRP_ODR_TYP_VALUE = new ArrayList();
		} else {
			l_uMRP_ODR_TYP_VALUE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_uMRP_ODR_TYP_VALUE.add(((AA0010010Struct) list.get(i)).getuMRP_ODR_TYP_VALUE());
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
			l_COMPANY_CD.add(((AA0010010Struct) list.get(i)).getCOMPANY_CD());
		}
		return size;
	}
	public int setL2L_VALUE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VALUE == null) {
			l_VALUE = new ArrayList();
		} else {
			l_VALUE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VALUE.add(((AA0010010Struct) list.get(i)).getVALUE());
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
			l_DISPLAY_NAME.add(((AA0010010Struct) list.get(i)).getDISPLAY_NAME());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_ISSUE_TYP_name = null;
		m_ISSUE_TYP_val = null;
		m_OUTSIDE_TYP_name = null;
		m_OUTSIDE_TYP_val = null;
		m_STOCK_UNIT_FLG_name = null;
		m_STOCK_UNIT_FLG_val = null;
		m_UNIT_QTY_TYP_name = null;
		m_UNIT_QTY_TYP_val = null;
		m_MRP_ODR_TYP_name = null;
		m_MRP_ODR_TYP_val = null;
		m_ACPT_INSPC_TYP_name = null;
		m_ACPT_INSPC_TYP_val = null;
		m_PRODUCT_TYP_name = null;
		m_PRODUCT_TYP_val = null;
		m_ABC_TYP_name = null;
		m_ABC_TYP_val = null;
		m_OPR_RSLT_TYP_name = null;
		m_OPR_RSLT_TYP_val = null;
		m_SPL_ITEM_TYP_name = null;
		m_SPL_ITEM_TYP_val = null;
		m_LOT_SIZING_TYP_name = null;
		m_LOT_SIZING_TYP_val = null;
		m_MPS_FLG_name = null;
		m_MPS_FLG_val = null;
		m_h_ITEM_CD = null;
		m_STOCK_UNIT_name = null;
		m_STOCK_UNIT_val = null;
		m_ITEM_CLASS_01_TYP = null;
		m_ITEM_CLASS_01_NAME = null;
		m_ITEM_CLASS_02_TYP = null;
		m_ITEM_CLASS_02_NAME = null;
		m_ITEM_CLASS_03_TYP = null;
		m_ITEM_CLASS_03_NAME = null;
		m_ITEM_CLASS_04_TYP = null;
		m_ITEM_CLASS_04_NAME = null;
		m_ITEM_CLASS_05_TYP = null;
		m_ITEM_CLASS_05_NAME = null;
		m_ITEM_CLASS_06_TYP = null;
		m_ITEM_CLASS_06_NAME = null;
		m_ITEM_CLASS_07_TYP = null;
		m_ITEM_CLASS_07_NAME = null;
		m_ITEM_CLASS_08_TYP = null;
		m_ITEM_CLASS_08_NAME = null;
		m_ITEM_CLASS_09_TYP = null;
		m_ITEM_CLASS_09_NAME = null;
		m_ITEM_CLASS_10_TYP = null;
		m_ITEM_CLASS_10_NAME = null;
		m_ITEM_CLASS_11_TYP = null;
		m_ITEM_CLASS_11_NAME = null;
		m_ITEM_CLASS_12_TYP = null;
		m_ITEM_CLASS_12_NAME = null;
		m_DEPO_TYP_name = null;
		m_DEPO_TYP_val = null;
		m_LOT_CTRL_FLG_name = null;
		m_LOT_CTRL_FLG_val = null;
		m_LOT_NUMBERING_TYP_name = null;
		m_LOT_NUMBERING_TYP_val = null;
		m_MANHOUR_TYP_name = null;
		m_MANHOUR_TYP_val = null;
		m_h_APR_ITEM = null;
		m_h_SCREENMOVE_TYP = null;
		m_h_APPR_ID = null;
		m_APPR_REMARKS = null;
		m_PJ_CD_name = null;
		m_PJ_CD_val = null;
		m_SEG_CONTENTS1_name = null;
		m_SEG_CONTENTS1_val = null;
		m_SEG_CONTENTS2_name = null;
		m_SEG_CONTENTS2_val = null;
		m_SEG_CONTENTS3_name = null;
		m_SEG_CONTENTS3_val = null;
		m_SEG_CONTENTS4_name = null;
		m_SEG_CONTENTS4_val = null;
		m_PLANT_CD = null;
		m_SUM_PROP_LT = null;
		m_SUM_FIXED_LT = null;
		m_LOTCTRLFLG = null;
		m_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_DRAW_CD = null;
		m_SPEC = null;
		m_HIGH_LEVEL_NO = null;
		m_ISSUE_TYP = null;
		m_OUTSIDE_TYP = null;
		m_STOCK_UNIT_FLG = null;
		m_STOCK_UNIT = null;
		m_PKG_UNIT = null;
		m_PKG_UNIT_QTY = null;
		m_UNIT_QTY_TYP = null;
		m_ODR_LT = null;
		m_ISSUE_LT = null;
		m_FIXED_LT = null;
		m_PROP_LOT_SIZE = null;
		m_PROP_LT = null;
		m_ITEM_SPOIL = null;
		m_SAFETY_LT = null;
		m_SAFETY_STOCK = null;
		m_MRP_ODR_TYP = null;
		m_LOT_SIZING_TYP = null;
		m_MAX_PERIOD = null;
		m_FIXED_ODR_QTY = null;
		m_MAX_ODR_QTY = null;
		m_MIN_ODR_QTY = null;
		m_ODR_POINT = null;
		m_MUL_ODR_QTY = null;
		m_MPS_FLG = null;
		m_ACPT_INSPC_TYP = null;
		m_PRODUCT_TYP = null;
		m_CLASIFICATION_CD = null;
		m_UNIT_WEIGHT = null;
		m_ABC_TYP = null;
		m_OPR_RSLT_TYP = null;
		m_SPL_ITEM_TYP = null;
		m_TAX_CD = null;
		m_TAX_NAME = null;
		m_CAL_NO = null;
		m_CAL_NAME = null;
		m_MODIFY_COUNT = null;
		m_ITEM_CLASS_01_CD = null;
		m_ITEM_CLASS_02_CD = null;
		m_ITEM_CLASS_03_CD = null;
		m_ITEM_CLASS_04_CD = null;
		m_ITEM_CLASS_05_CD = null;
		m_ITEM_CLASS_06_CD = null;
		m_ITEM_CLASS_07_CD = null;
		m_ITEM_CLASS_08_CD = null;
		m_ITEM_CLASS_09_CD = null;
		m_ITEM_CLASS_10_CD = null;
		m_ITEM_CLASS_11_CD = null;
		m_ITEM_CLASS_12_CD = null;
		m_DEPO_TYP = null;
		m_LOT_CTRL_FLG = null;
		m_LOT_NUMBERING_TYP = null;
		m_BEST_BEFORE_YEAR = null;
		m_BEST_BEFORE_MONTH = null;
		m_BEST_BEFORE_DAY = null;
		m_REMARK1 = null;
		m_REMARK2 = null;
		m_MANHOUR_TYP = null;
		m_DEPT_CD = null;
		m_DEPT_NAME = null;
		m_PJ_CD = null;
		m_SEG_CONTENTS1 = null;
		m_SEG_CONTENTS2 = null;
		m_SEG_CONTENTS3 = null;
		m_SEG_CONTENTS4 = null;
		m_PUCH_ODR_CD = null;
		m_ONEROUS_CONS_NO = null;
		m_uMRP_ODR_TYP_DISPLAY_NAME = null;
		m_uMRP_ODR_TYP_VALUE = null;
		m_COMPANY_CD = null;
		m_VALUE = null;
		m_DISPLAY_NAME = null;

		l_ISSUE_TYP_name = null;
		l_ISSUE_TYP_val = null;
		l_OUTSIDE_TYP_name = null;
		l_OUTSIDE_TYP_val = null;
		l_STOCK_UNIT_FLG_name = null;
		l_STOCK_UNIT_FLG_val = null;
		l_UNIT_QTY_TYP_name = null;
		l_UNIT_QTY_TYP_val = null;
		l_MRP_ODR_TYP_name = null;
		l_MRP_ODR_TYP_val = null;
		l_ACPT_INSPC_TYP_name = null;
		l_ACPT_INSPC_TYP_val = null;
		l_PRODUCT_TYP_name = null;
		l_PRODUCT_TYP_val = null;
		l_ABC_TYP_name = null;
		l_ABC_TYP_val = null;
		l_OPR_RSLT_TYP_name = null;
		l_OPR_RSLT_TYP_val = null;
		l_SPL_ITEM_TYP_name = null;
		l_SPL_ITEM_TYP_val = null;
		l_LOT_SIZING_TYP_name = null;
		l_LOT_SIZING_TYP_val = null;
		l_MPS_FLG_name = null;
		l_MPS_FLG_val = null;
		l_h_ITEM_CD = null;
		l_STOCK_UNIT_name = null;
		l_STOCK_UNIT_val = null;
		l_ITEM_CLASS_01_TYP = null;
		l_ITEM_CLASS_01_NAME = null;
		l_ITEM_CLASS_02_TYP = null;
		l_ITEM_CLASS_02_NAME = null;
		l_ITEM_CLASS_03_TYP = null;
		l_ITEM_CLASS_03_NAME = null;
		l_ITEM_CLASS_04_TYP = null;
		l_ITEM_CLASS_04_NAME = null;
		l_ITEM_CLASS_05_TYP = null;
		l_ITEM_CLASS_05_NAME = null;
		l_ITEM_CLASS_06_TYP = null;
		l_ITEM_CLASS_06_NAME = null;
		l_ITEM_CLASS_07_TYP = null;
		l_ITEM_CLASS_07_NAME = null;
		l_ITEM_CLASS_08_TYP = null;
		l_ITEM_CLASS_08_NAME = null;
		l_ITEM_CLASS_09_TYP = null;
		l_ITEM_CLASS_09_NAME = null;
		l_ITEM_CLASS_10_TYP = null;
		l_ITEM_CLASS_10_NAME = null;
		l_ITEM_CLASS_11_TYP = null;
		l_ITEM_CLASS_11_NAME = null;
		l_ITEM_CLASS_12_TYP = null;
		l_ITEM_CLASS_12_NAME = null;
		l_DEPO_TYP_name = null;
		l_DEPO_TYP_val = null;
		l_LOT_CTRL_FLG_name = null;
		l_LOT_CTRL_FLG_val = null;
		l_LOT_NUMBERING_TYP_name = null;
		l_LOT_NUMBERING_TYP_val = null;
		l_MANHOUR_TYP_name = null;
		l_MANHOUR_TYP_val = null;
		l_h_APR_ITEM = null;
		l_h_SCREENMOVE_TYP = null;
		l_h_APPR_ID = null;
		l_APPR_REMARKS = null;
		l_PJ_CD_name = null;
		l_PJ_CD_val = null;
		l_SEG_CONTENTS1_name = null;
		l_SEG_CONTENTS1_val = null;
		l_SEG_CONTENTS2_name = null;
		l_SEG_CONTENTS2_val = null;
		l_SEG_CONTENTS3_name = null;
		l_SEG_CONTENTS3_val = null;
		l_SEG_CONTENTS4_name = null;
		l_SEG_CONTENTS4_val = null;
		l_PLANT_CD = null;
		l_SUM_PROP_LT = null;
		l_SUM_FIXED_LT = null;
		l_LOTCTRLFLG = null;
		l_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_DRAW_CD = null;
		l_SPEC = null;
		l_HIGH_LEVEL_NO = null;
		l_ISSUE_TYP = null;
		l_OUTSIDE_TYP = null;
		l_STOCK_UNIT_FLG = null;
		l_STOCK_UNIT = null;
		l_PKG_UNIT = null;
		l_PKG_UNIT_QTY = null;
		l_UNIT_QTY_TYP = null;
		l_ODR_LT = null;
		l_ISSUE_LT = null;
		l_FIXED_LT = null;
		l_PROP_LOT_SIZE = null;
		l_PROP_LT = null;
		l_ITEM_SPOIL = null;
		l_SAFETY_LT = null;
		l_SAFETY_STOCK = null;
		l_MRP_ODR_TYP = null;
		l_LOT_SIZING_TYP = null;
		l_MAX_PERIOD = null;
		l_FIXED_ODR_QTY = null;
		l_MAX_ODR_QTY = null;
		l_MIN_ODR_QTY = null;
		l_ODR_POINT = null;
		l_MUL_ODR_QTY = null;
		l_MPS_FLG = null;
		l_ACPT_INSPC_TYP = null;
		l_PRODUCT_TYP = null;
		l_CLASIFICATION_CD = null;
		l_UNIT_WEIGHT = null;
		l_ABC_TYP = null;
		l_OPR_RSLT_TYP = null;
		l_SPL_ITEM_TYP = null;
		l_TAX_CD = null;
		l_TAX_NAME = null;
		l_CAL_NO = null;
		l_CAL_NAME = null;
		l_MODIFY_COUNT = null;
		l_ITEM_CLASS_01_CD = null;
		l_ITEM_CLASS_02_CD = null;
		l_ITEM_CLASS_03_CD = null;
		l_ITEM_CLASS_04_CD = null;
		l_ITEM_CLASS_05_CD = null;
		l_ITEM_CLASS_06_CD = null;
		l_ITEM_CLASS_07_CD = null;
		l_ITEM_CLASS_08_CD = null;
		l_ITEM_CLASS_09_CD = null;
		l_ITEM_CLASS_10_CD = null;
		l_ITEM_CLASS_11_CD = null;
		l_ITEM_CLASS_12_CD = null;
		l_DEPO_TYP = null;
		l_LOT_CTRL_FLG = null;
		l_LOT_NUMBERING_TYP = null;
		l_BEST_BEFORE_YEAR = null;
		l_BEST_BEFORE_MONTH = null;
		l_BEST_BEFORE_DAY = null;
		l_REMARK1 = null;
		l_REMARK2 = null;
		l_MANHOUR_TYP = null;
		l_DEPT_CD = null;
		l_DEPT_NAME = null;
		l_PJ_CD = null;
		l_SEG_CONTENTS1 = null;
		l_SEG_CONTENTS2 = null;
		l_SEG_CONTENTS3 = null;
		l_SEG_CONTENTS4 = null;
		l_PUCH_ODR_CD = null;
		l_ONEROUS_CONS_NO = null;
		l_uMRP_ODR_TYP_DISPLAY_NAME = null;
		l_uMRP_ODR_TYP_VALUE = null;
		l_COMPANY_CD = null;
		l_VALUE = null;
		l_DISPLAY_NAME = null;

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
	 * medAA0010010�N���X�̕W���R���X�g���N�^
	 */
	public AA0010010Struct()
	{
		//{{user_implement_code_constractor
		m_HIGH_LEVEL_NO = AA0010Common._HIGH_LEVEL_NO;
		m_ISSUE_TYP = AA0010Common._ISSUE_TYP;
		m_MRP_ODR_TYP = AA0010Common._MRP_ODR_TYP;
		m_OUTSIDE_TYP = AA0010Common._OUTSIDE_TYP;
		m_STOCK_UNIT_FLG = AA0010Common._STOCK_UNIT_FLG;
		m_PKG_UNIT_QTY = AA0010Common._PKG_UNIT_QTY;
		m_UNIT_QTY_TYP = AA0010Common._UNIT_QTY_TYP;
		m_ODR_LT = AA0010Common._ODR_LT;
		m_FIXED_LT = AA0010Common._FIXED_LT;
		m_PROP_LT = AA0010Common._PROP_LT;
		m_SAFETY_LT = AA0010Common._SAFETY_LT;
		m_ISSUE_LT = AA0010Common._ISSUE_LT;
		m_PROP_LOT_SIZE = AA0010Common._PROP_LOT_SIZE;
		m_ITEM_SPOIL = AA0010Common._ITEM_SPOIL;
		m_SAFETY_STOCK = AA0010Common._SAFETY_STOCK;
		m_LOT_SIZING_TYP = AA0010Common._LOT_SIZING_TYP;
		m_MAX_PERIOD = AA0010Common._MAX_PERIOD;
		m_MAX_ODR_QTY = AA0010Common._MAX_ODR_QTY;
		m_ODR_POINT = AA0010Common._ODR_POINT ;
		m_FIXED_ODR_QTY = AA0010Common._FIXED_ODR_QTY;
		m_MIN_ODR_QTY = AA0010Common._MIN_ODR_QTY;
		m_MUL_ODR_QTY = AA0010Common._MUL_ODR_QTY;
		m_MANHOUR_TYP = AA0010Common._MANHOUR_TYP;
		m_MPS_FLG = AA0010Common._MPS_FLG;
		m_ACPT_INSPC_TYP = AA0010Common._ACPT_INSPC_TYP;
		m_PRODUCT_TYP = AA0010Common._PRODUCT_TYP;
		m_UNIT_WEIGHT = AA0010Common._UNIT_WEIGHT;
		m_ABC_TYP = AA0010Common._ABC_TYP;
		m_OPR_RSLT_TYP = AA0010Common._OPR_RSLT_TYP;
		m_SPL_ITEM_TYP = AA0010Common._SPL_ITEM_TYP;
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
	public void setStruct(AA0010010Struct struct)
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
	public void setStructM(AA0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setISSUE_TYP_name(struct.getISSUE_TYP_name());
			this.setISSUE_TYP_val(struct.getISSUE_TYP_val());
			this.setOUTSIDE_TYP_name(struct.getOUTSIDE_TYP_name());
			this.setOUTSIDE_TYP_val(struct.getOUTSIDE_TYP_val());
			this.setSTOCK_UNIT_FLG_name(struct.getSTOCK_UNIT_FLG_name());
			this.setSTOCK_UNIT_FLG_val(struct.getSTOCK_UNIT_FLG_val());
			this.setUNIT_QTY_TYP_name(struct.getUNIT_QTY_TYP_name());
			this.setUNIT_QTY_TYP_val(struct.getUNIT_QTY_TYP_val());
			this.setMRP_ODR_TYP_name(struct.getMRP_ODR_TYP_name());
			this.setMRP_ODR_TYP_val(struct.getMRP_ODR_TYP_val());
			this.setACPT_INSPC_TYP_name(struct.getACPT_INSPC_TYP_name());
			this.setACPT_INSPC_TYP_val(struct.getACPT_INSPC_TYP_val());
			this.setPRODUCT_TYP_name(struct.getPRODUCT_TYP_name());
			this.setPRODUCT_TYP_val(struct.getPRODUCT_TYP_val());
			this.setABC_TYP_name(struct.getABC_TYP_name());
			this.setABC_TYP_val(struct.getABC_TYP_val());
			this.setOPR_RSLT_TYP_name(struct.getOPR_RSLT_TYP_name());
			this.setOPR_RSLT_TYP_val(struct.getOPR_RSLT_TYP_val());
			this.setSPL_ITEM_TYP_name(struct.getSPL_ITEM_TYP_name());
			this.setSPL_ITEM_TYP_val(struct.getSPL_ITEM_TYP_val());
			this.setLOT_SIZING_TYP_name(struct.getLOT_SIZING_TYP_name());
			this.setLOT_SIZING_TYP_val(struct.getLOT_SIZING_TYP_val());
			this.setMPS_FLG_name(struct.getMPS_FLG_name());
			this.setMPS_FLG_val(struct.getMPS_FLG_val());
			this.seth_ITEM_CD(struct.geth_ITEM_CD());
			this.setSTOCK_UNIT_name(struct.getSTOCK_UNIT_name());
			this.setSTOCK_UNIT_val(struct.getSTOCK_UNIT_val());
			this.setITEM_CLASS_01_TYP(struct.getITEM_CLASS_01_TYP());
			this.setITEM_CLASS_01_NAME(struct.getITEM_CLASS_01_NAME());
			this.setITEM_CLASS_02_TYP(struct.getITEM_CLASS_02_TYP());
			this.setITEM_CLASS_02_NAME(struct.getITEM_CLASS_02_NAME());
			this.setITEM_CLASS_03_TYP(struct.getITEM_CLASS_03_TYP());
			this.setITEM_CLASS_03_NAME(struct.getITEM_CLASS_03_NAME());
			this.setITEM_CLASS_04_TYP(struct.getITEM_CLASS_04_TYP());
			this.setITEM_CLASS_04_NAME(struct.getITEM_CLASS_04_NAME());
			this.setITEM_CLASS_05_TYP(struct.getITEM_CLASS_05_TYP());
			this.setITEM_CLASS_05_NAME(struct.getITEM_CLASS_05_NAME());
			this.setITEM_CLASS_06_TYP(struct.getITEM_CLASS_06_TYP());
			this.setITEM_CLASS_06_NAME(struct.getITEM_CLASS_06_NAME());
			this.setITEM_CLASS_07_TYP(struct.getITEM_CLASS_07_TYP());
			this.setITEM_CLASS_07_NAME(struct.getITEM_CLASS_07_NAME());
			this.setITEM_CLASS_08_TYP(struct.getITEM_CLASS_08_TYP());
			this.setITEM_CLASS_08_NAME(struct.getITEM_CLASS_08_NAME());
			this.setITEM_CLASS_09_TYP(struct.getITEM_CLASS_09_TYP());
			this.setITEM_CLASS_09_NAME(struct.getITEM_CLASS_09_NAME());
			this.setITEM_CLASS_10_TYP(struct.getITEM_CLASS_10_TYP());
			this.setITEM_CLASS_10_NAME(struct.getITEM_CLASS_10_NAME());
			this.setITEM_CLASS_11_TYP(struct.getITEM_CLASS_11_TYP());
			this.setITEM_CLASS_11_NAME(struct.getITEM_CLASS_11_NAME());
			this.setITEM_CLASS_12_TYP(struct.getITEM_CLASS_12_TYP());
			this.setITEM_CLASS_12_NAME(struct.getITEM_CLASS_12_NAME());
			this.setDEPO_TYP_name(struct.getDEPO_TYP_name());
			this.setDEPO_TYP_val(struct.getDEPO_TYP_val());
			this.setLOT_CTRL_FLG_name(struct.getLOT_CTRL_FLG_name());
			this.setLOT_CTRL_FLG_val(struct.getLOT_CTRL_FLG_val());
			this.setLOT_NUMBERING_TYP_name(struct.getLOT_NUMBERING_TYP_name());
			this.setLOT_NUMBERING_TYP_val(struct.getLOT_NUMBERING_TYP_val());
			this.setMANHOUR_TYP_name(struct.getMANHOUR_TYP_name());
			this.setMANHOUR_TYP_val(struct.getMANHOUR_TYP_val());
			this.seth_APR_ITEM(struct.geth_APR_ITEM());
			this.seth_SCREENMOVE_TYP(struct.geth_SCREENMOVE_TYP());
			this.seth_APPR_ID(struct.geth_APPR_ID());
			this.setAPPR_REMARKS(struct.getAPPR_REMARKS());
			this.setPJ_CD_name(struct.getPJ_CD_name());
			this.setPJ_CD_val(struct.getPJ_CD_val());
			this.setSEG_CONTENTS1_name(struct.getSEG_CONTENTS1_name());
			this.setSEG_CONTENTS1_val(struct.getSEG_CONTENTS1_val());
			this.setSEG_CONTENTS2_name(struct.getSEG_CONTENTS2_name());
			this.setSEG_CONTENTS2_val(struct.getSEG_CONTENTS2_val());
			this.setSEG_CONTENTS3_name(struct.getSEG_CONTENTS3_name());
			this.setSEG_CONTENTS3_val(struct.getSEG_CONTENTS3_val());
			this.setSEG_CONTENTS4_name(struct.getSEG_CONTENTS4_name());
			this.setSEG_CONTENTS4_val(struct.getSEG_CONTENTS4_val());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setSUM_PROP_LT(struct.getSUM_PROP_LT());
			this.setSUM_FIXED_LT(struct.getSUM_FIXED_LT());
			this.setLOTCTRLFLG(struct.getLOTCTRLFLG());
			this.setITEM_CD(struct.getITEM_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setDRAW_CD(struct.getDRAW_CD());
			this.setSPEC(struct.getSPEC());
			this.setHIGH_LEVEL_NO(struct.getHIGH_LEVEL_NO());
			this.setISSUE_TYP(struct.getISSUE_TYP());
			this.setOUTSIDE_TYP(struct.getOUTSIDE_TYP());
			this.setSTOCK_UNIT_FLG(struct.getSTOCK_UNIT_FLG());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setPKG_UNIT(struct.getPKG_UNIT());
			this.setPKG_UNIT_QTY(struct.getPKG_UNIT_QTY());
			this.setUNIT_QTY_TYP(struct.getUNIT_QTY_TYP());
			this.setODR_LT(struct.getODR_LT());
			this.setISSUE_LT(struct.getISSUE_LT());
			this.setFIXED_LT(struct.getFIXED_LT());
			this.setPROP_LOT_SIZE(struct.getPROP_LOT_SIZE());
			this.setPROP_LT(struct.getPROP_LT());
			this.setITEM_SPOIL(struct.getITEM_SPOIL());
			this.setSAFETY_LT(struct.getSAFETY_LT());
			this.setSAFETY_STOCK(struct.getSAFETY_STOCK());
			this.setMRP_ODR_TYP(struct.getMRP_ODR_TYP());
			this.setLOT_SIZING_TYP(struct.getLOT_SIZING_TYP());
			this.setMAX_PERIOD(struct.getMAX_PERIOD());
			this.setFIXED_ODR_QTY(struct.getFIXED_ODR_QTY());
			this.setMAX_ODR_QTY(struct.getMAX_ODR_QTY());
			this.setMIN_ODR_QTY(struct.getMIN_ODR_QTY());
			this.setODR_POINT(struct.getODR_POINT());
			this.setMUL_ODR_QTY(struct.getMUL_ODR_QTY());
			this.setMPS_FLG(struct.getMPS_FLG());
			this.setACPT_INSPC_TYP(struct.getACPT_INSPC_TYP());
			this.setPRODUCT_TYP(struct.getPRODUCT_TYP());
			this.setCLASIFICATION_CD(struct.getCLASIFICATION_CD());
			this.setUNIT_WEIGHT(struct.getUNIT_WEIGHT());
			this.setABC_TYP(struct.getABC_TYP());
			this.setOPR_RSLT_TYP(struct.getOPR_RSLT_TYP());
			this.setSPL_ITEM_TYP(struct.getSPL_ITEM_TYP());
			this.setTAX_CD(struct.getTAX_CD());
			this.setTAX_NAME(struct.getTAX_NAME());
			this.setCAL_NO(struct.getCAL_NO());
			this.setCAL_NAME(struct.getCAL_NAME());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setITEM_CLASS_01_CD(struct.getITEM_CLASS_01_CD());
			this.setITEM_CLASS_02_CD(struct.getITEM_CLASS_02_CD());
			this.setITEM_CLASS_03_CD(struct.getITEM_CLASS_03_CD());
			this.setITEM_CLASS_04_CD(struct.getITEM_CLASS_04_CD());
			this.setITEM_CLASS_05_CD(struct.getITEM_CLASS_05_CD());
			this.setITEM_CLASS_06_CD(struct.getITEM_CLASS_06_CD());
			this.setITEM_CLASS_07_CD(struct.getITEM_CLASS_07_CD());
			this.setITEM_CLASS_08_CD(struct.getITEM_CLASS_08_CD());
			this.setITEM_CLASS_09_CD(struct.getITEM_CLASS_09_CD());
			this.setITEM_CLASS_10_CD(struct.getITEM_CLASS_10_CD());
			this.setITEM_CLASS_11_CD(struct.getITEM_CLASS_11_CD());
			this.setITEM_CLASS_12_CD(struct.getITEM_CLASS_12_CD());
			this.setDEPO_TYP(struct.getDEPO_TYP());
			this.setLOT_CTRL_FLG(struct.getLOT_CTRL_FLG());
			this.setLOT_NUMBERING_TYP(struct.getLOT_NUMBERING_TYP());
			this.setBEST_BEFORE_YEAR(struct.getBEST_BEFORE_YEAR());
			this.setBEST_BEFORE_MONTH(struct.getBEST_BEFORE_MONTH());
			this.setBEST_BEFORE_DAY(struct.getBEST_BEFORE_DAY());
			this.setREMARK1(struct.getREMARK1());
			this.setREMARK2(struct.getREMARK2());
			this.setMANHOUR_TYP(struct.getMANHOUR_TYP());
			this.setDEPT_CD(struct.getDEPT_CD());
			this.setDEPT_NAME(struct.getDEPT_NAME());
			this.setPJ_CD(struct.getPJ_CD());
			this.setSEG_CONTENTS1(struct.getSEG_CONTENTS1());
			this.setSEG_CONTENTS2(struct.getSEG_CONTENTS2());
			this.setSEG_CONTENTS3(struct.getSEG_CONTENTS3());
			this.setSEG_CONTENTS4(struct.getSEG_CONTENTS4());
			this.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());
			this.setONEROUS_CONS_NO(struct.getONEROUS_CONS_NO());
			this.setuMRP_ODR_TYP_DISPLAY_NAME(struct.getuMRP_ODR_TYP_DISPLAY_NAME());
			this.setuMRP_ODR_TYP_VALUE(struct.getuMRP_ODR_TYP_VALUE());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setVALUE(struct.getVALUE());
			this.setDISPLAY_NAME(struct.getDISPLAY_NAME());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AA0010010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_ISSUE_TYP_name(struct.getList_ISSUE_TYP_name());
			this.setList_ISSUE_TYP_val(struct.getList_ISSUE_TYP_val());
			this.setList_OUTSIDE_TYP_name(struct.getList_OUTSIDE_TYP_name());
			this.setList_OUTSIDE_TYP_val(struct.getList_OUTSIDE_TYP_val());
			this.setList_STOCK_UNIT_FLG_name(struct.getList_STOCK_UNIT_FLG_name());
			this.setList_STOCK_UNIT_FLG_val(struct.getList_STOCK_UNIT_FLG_val());
			this.setList_UNIT_QTY_TYP_name(struct.getList_UNIT_QTY_TYP_name());
			this.setList_UNIT_QTY_TYP_val(struct.getList_UNIT_QTY_TYP_val());
			this.setList_MRP_ODR_TYP_name(struct.getList_MRP_ODR_TYP_name());
			this.setList_MRP_ODR_TYP_val(struct.getList_MRP_ODR_TYP_val());
			this.setList_ACPT_INSPC_TYP_name(struct.getList_ACPT_INSPC_TYP_name());
			this.setList_ACPT_INSPC_TYP_val(struct.getList_ACPT_INSPC_TYP_val());
			this.setList_PRODUCT_TYP_name(struct.getList_PRODUCT_TYP_name());
			this.setList_PRODUCT_TYP_val(struct.getList_PRODUCT_TYP_val());
			this.setList_ABC_TYP_name(struct.getList_ABC_TYP_name());
			this.setList_ABC_TYP_val(struct.getList_ABC_TYP_val());
			this.setList_OPR_RSLT_TYP_name(struct.getList_OPR_RSLT_TYP_name());
			this.setList_OPR_RSLT_TYP_val(struct.getList_OPR_RSLT_TYP_val());
			this.setList_SPL_ITEM_TYP_name(struct.getList_SPL_ITEM_TYP_name());
			this.setList_SPL_ITEM_TYP_val(struct.getList_SPL_ITEM_TYP_val());
			this.setList_LOT_SIZING_TYP_name(struct.getList_LOT_SIZING_TYP_name());
			this.setList_LOT_SIZING_TYP_val(struct.getList_LOT_SIZING_TYP_val());
			this.setList_MPS_FLG_name(struct.getList_MPS_FLG_name());
			this.setList_MPS_FLG_val(struct.getList_MPS_FLG_val());
			this.setList_h_ITEM_CD(struct.getList_h_ITEM_CD());
			this.setList_STOCK_UNIT_name(struct.getList_STOCK_UNIT_name());
			this.setList_STOCK_UNIT_val(struct.getList_STOCK_UNIT_val());
			this.setList_ITEM_CLASS_01_TYP(struct.getList_ITEM_CLASS_01_TYP());
			this.setList_ITEM_CLASS_01_NAME(struct.getList_ITEM_CLASS_01_NAME());
			this.setList_ITEM_CLASS_02_TYP(struct.getList_ITEM_CLASS_02_TYP());
			this.setList_ITEM_CLASS_02_NAME(struct.getList_ITEM_CLASS_02_NAME());
			this.setList_ITEM_CLASS_03_TYP(struct.getList_ITEM_CLASS_03_TYP());
			this.setList_ITEM_CLASS_03_NAME(struct.getList_ITEM_CLASS_03_NAME());
			this.setList_ITEM_CLASS_04_TYP(struct.getList_ITEM_CLASS_04_TYP());
			this.setList_ITEM_CLASS_04_NAME(struct.getList_ITEM_CLASS_04_NAME());
			this.setList_ITEM_CLASS_05_TYP(struct.getList_ITEM_CLASS_05_TYP());
			this.setList_ITEM_CLASS_05_NAME(struct.getList_ITEM_CLASS_05_NAME());
			this.setList_ITEM_CLASS_06_TYP(struct.getList_ITEM_CLASS_06_TYP());
			this.setList_ITEM_CLASS_06_NAME(struct.getList_ITEM_CLASS_06_NAME());
			this.setList_ITEM_CLASS_07_TYP(struct.getList_ITEM_CLASS_07_TYP());
			this.setList_ITEM_CLASS_07_NAME(struct.getList_ITEM_CLASS_07_NAME());
			this.setList_ITEM_CLASS_08_TYP(struct.getList_ITEM_CLASS_08_TYP());
			this.setList_ITEM_CLASS_08_NAME(struct.getList_ITEM_CLASS_08_NAME());
			this.setList_ITEM_CLASS_09_TYP(struct.getList_ITEM_CLASS_09_TYP());
			this.setList_ITEM_CLASS_09_NAME(struct.getList_ITEM_CLASS_09_NAME());
			this.setList_ITEM_CLASS_10_TYP(struct.getList_ITEM_CLASS_10_TYP());
			this.setList_ITEM_CLASS_10_NAME(struct.getList_ITEM_CLASS_10_NAME());
			this.setList_ITEM_CLASS_11_TYP(struct.getList_ITEM_CLASS_11_TYP());
			this.setList_ITEM_CLASS_11_NAME(struct.getList_ITEM_CLASS_11_NAME());
			this.setList_ITEM_CLASS_12_TYP(struct.getList_ITEM_CLASS_12_TYP());
			this.setList_ITEM_CLASS_12_NAME(struct.getList_ITEM_CLASS_12_NAME());
			this.setList_DEPO_TYP_name(struct.getList_DEPO_TYP_name());
			this.setList_DEPO_TYP_val(struct.getList_DEPO_TYP_val());
			this.setList_LOT_CTRL_FLG_name(struct.getList_LOT_CTRL_FLG_name());
			this.setList_LOT_CTRL_FLG_val(struct.getList_LOT_CTRL_FLG_val());
			this.setList_LOT_NUMBERING_TYP_name(struct.getList_LOT_NUMBERING_TYP_name());
			this.setList_LOT_NUMBERING_TYP_val(struct.getList_LOT_NUMBERING_TYP_val());
			this.setList_MANHOUR_TYP_name(struct.getList_MANHOUR_TYP_name());
			this.setList_MANHOUR_TYP_val(struct.getList_MANHOUR_TYP_val());
			this.setList_h_APR_ITEM(struct.getList_h_APR_ITEM());
			this.setList_h_SCREENMOVE_TYP(struct.getList_h_SCREENMOVE_TYP());
			this.setList_h_APPR_ID(struct.getList_h_APPR_ID());
			this.setList_APPR_REMARKS(struct.getList_APPR_REMARKS());
			this.setList_PJ_CD_name(struct.getList_PJ_CD_name());
			this.setList_PJ_CD_val(struct.getList_PJ_CD_val());
			this.setList_SEG_CONTENTS1_name(struct.getList_SEG_CONTENTS1_name());
			this.setList_SEG_CONTENTS1_val(struct.getList_SEG_CONTENTS1_val());
			this.setList_SEG_CONTENTS2_name(struct.getList_SEG_CONTENTS2_name());
			this.setList_SEG_CONTENTS2_val(struct.getList_SEG_CONTENTS2_val());
			this.setList_SEG_CONTENTS3_name(struct.getList_SEG_CONTENTS3_name());
			this.setList_SEG_CONTENTS3_val(struct.getList_SEG_CONTENTS3_val());
			this.setList_SEG_CONTENTS4_name(struct.getList_SEG_CONTENTS4_name());
			this.setList_SEG_CONTENTS4_val(struct.getList_SEG_CONTENTS4_val());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_SUM_PROP_LT(struct.getList_SUM_PROP_LT());
			this.setList_SUM_FIXED_LT(struct.getList_SUM_FIXED_LT());
			this.setList_LOTCTRLFLG(struct.getList_LOTCTRLFLG());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_DRAW_CD(struct.getList_DRAW_CD());
			this.setList_SPEC(struct.getList_SPEC());
			this.setList_HIGH_LEVEL_NO(struct.getList_HIGH_LEVEL_NO());
			this.setList_ISSUE_TYP(struct.getList_ISSUE_TYP());
			this.setList_OUTSIDE_TYP(struct.getList_OUTSIDE_TYP());
			this.setList_STOCK_UNIT_FLG(struct.getList_STOCK_UNIT_FLG());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_PKG_UNIT(struct.getList_PKG_UNIT());
			this.setList_PKG_UNIT_QTY(struct.getList_PKG_UNIT_QTY());
			this.setList_UNIT_QTY_TYP(struct.getList_UNIT_QTY_TYP());
			this.setList_ODR_LT(struct.getList_ODR_LT());
			this.setList_ISSUE_LT(struct.getList_ISSUE_LT());
			this.setList_FIXED_LT(struct.getList_FIXED_LT());
			this.setList_PROP_LOT_SIZE(struct.getList_PROP_LOT_SIZE());
			this.setList_PROP_LT(struct.getList_PROP_LT());
			this.setList_ITEM_SPOIL(struct.getList_ITEM_SPOIL());
			this.setList_SAFETY_LT(struct.getList_SAFETY_LT());
			this.setList_SAFETY_STOCK(struct.getList_SAFETY_STOCK());
			this.setList_MRP_ODR_TYP(struct.getList_MRP_ODR_TYP());
			this.setList_LOT_SIZING_TYP(struct.getList_LOT_SIZING_TYP());
			this.setList_MAX_PERIOD(struct.getList_MAX_PERIOD());
			this.setList_FIXED_ODR_QTY(struct.getList_FIXED_ODR_QTY());
			this.setList_MAX_ODR_QTY(struct.getList_MAX_ODR_QTY());
			this.setList_MIN_ODR_QTY(struct.getList_MIN_ODR_QTY());
			this.setList_ODR_POINT(struct.getList_ODR_POINT());
			this.setList_MUL_ODR_QTY(struct.getList_MUL_ODR_QTY());
			this.setList_MPS_FLG(struct.getList_MPS_FLG());
			this.setList_ACPT_INSPC_TYP(struct.getList_ACPT_INSPC_TYP());
			this.setList_PRODUCT_TYP(struct.getList_PRODUCT_TYP());
			this.setList_CLASIFICATION_CD(struct.getList_CLASIFICATION_CD());
			this.setList_UNIT_WEIGHT(struct.getList_UNIT_WEIGHT());
			this.setList_ABC_TYP(struct.getList_ABC_TYP());
			this.setList_OPR_RSLT_TYP(struct.getList_OPR_RSLT_TYP());
			this.setList_SPL_ITEM_TYP(struct.getList_SPL_ITEM_TYP());
			this.setList_TAX_CD(struct.getList_TAX_CD());
			this.setList_TAX_NAME(struct.getList_TAX_NAME());
			this.setList_CAL_NO(struct.getList_CAL_NO());
			this.setList_CAL_NAME(struct.getList_CAL_NAME());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_ITEM_CLASS_01_CD(struct.getList_ITEM_CLASS_01_CD());
			this.setList_ITEM_CLASS_02_CD(struct.getList_ITEM_CLASS_02_CD());
			this.setList_ITEM_CLASS_03_CD(struct.getList_ITEM_CLASS_03_CD());
			this.setList_ITEM_CLASS_04_CD(struct.getList_ITEM_CLASS_04_CD());
			this.setList_ITEM_CLASS_05_CD(struct.getList_ITEM_CLASS_05_CD());
			this.setList_ITEM_CLASS_06_CD(struct.getList_ITEM_CLASS_06_CD());
			this.setList_ITEM_CLASS_07_CD(struct.getList_ITEM_CLASS_07_CD());
			this.setList_ITEM_CLASS_08_CD(struct.getList_ITEM_CLASS_08_CD());
			this.setList_ITEM_CLASS_09_CD(struct.getList_ITEM_CLASS_09_CD());
			this.setList_ITEM_CLASS_10_CD(struct.getList_ITEM_CLASS_10_CD());
			this.setList_ITEM_CLASS_11_CD(struct.getList_ITEM_CLASS_11_CD());
			this.setList_ITEM_CLASS_12_CD(struct.getList_ITEM_CLASS_12_CD());
			this.setList_DEPO_TYP(struct.getList_DEPO_TYP());
			this.setList_LOT_CTRL_FLG(struct.getList_LOT_CTRL_FLG());
			this.setList_LOT_NUMBERING_TYP(struct.getList_LOT_NUMBERING_TYP());
			this.setList_BEST_BEFORE_YEAR(struct.getList_BEST_BEFORE_YEAR());
			this.setList_BEST_BEFORE_MONTH(struct.getList_BEST_BEFORE_MONTH());
			this.setList_BEST_BEFORE_DAY(struct.getList_BEST_BEFORE_DAY());
			this.setList_REMARK1(struct.getList_REMARK1());
			this.setList_REMARK2(struct.getList_REMARK2());
			this.setList_MANHOUR_TYP(struct.getList_MANHOUR_TYP());
			this.setList_DEPT_CD(struct.getList_DEPT_CD());
			this.setList_DEPT_NAME(struct.getList_DEPT_NAME());
			this.setList_PJ_CD(struct.getList_PJ_CD());
			this.setList_SEG_CONTENTS1(struct.getList_SEG_CONTENTS1());
			this.setList_SEG_CONTENTS2(struct.getList_SEG_CONTENTS2());
			this.setList_SEG_CONTENTS3(struct.getList_SEG_CONTENTS3());
			this.setList_SEG_CONTENTS4(struct.getList_SEG_CONTENTS4());
			this.setList_PUCH_ODR_CD(struct.getList_PUCH_ODR_CD());
			this.setList_ONEROUS_CONS_NO(struct.getList_ONEROUS_CONS_NO());
			this.setList_uMRP_ODR_TYP_DISPLAY_NAME(struct.getList_uMRP_ODR_TYP_DISPLAY_NAME());
			this.setList_uMRP_ODR_TYP_VALUE(struct.getList_uMRP_ODR_TYP_VALUE());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_VALUE(struct.getList_VALUE());
			this.setList_DISPLAY_NAME(struct.getList_DISPLAY_NAME());
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
	// �� 1 �ϐ������l�F i_ISSUE_TYP_name


	final static String i_ISSUE_TYP_name = null;

	// �� 2 �ϐ������l�F i_ISSUE_TYP_val


	final static String i_ISSUE_TYP_val = null;

	// �� 3 �ϐ������l�F i_OUTSIDE_TYP_name


	final static String i_OUTSIDE_TYP_name = null;

	// �� 4 �ϐ������l�F i_OUTSIDE_TYP_val


	final static String i_OUTSIDE_TYP_val = null;

	// �� 5 �ϐ������l�F i_STOCK_UNIT_FLG_name


	final static String i_STOCK_UNIT_FLG_name = null;

	// �� 6 �ϐ������l�F i_STOCK_UNIT_FLG_val


	final static String i_STOCK_UNIT_FLG_val = null;

	// �� 7 �ϐ������l�F i_UNIT_QTY_TYP_name


	final static String i_UNIT_QTY_TYP_name = null;

	// �� 8 �ϐ������l�F i_UNIT_QTY_TYP_val


	final static String i_UNIT_QTY_TYP_val = null;

	// �� 9 �ϐ������l�F i_MRP_ODR_TYP_name


	final static String i_MRP_ODR_TYP_name = null;

	// �� 10 �ϐ������l�F i_MRP_ODR_TYP_val


	final static String i_MRP_ODR_TYP_val = null;

	// �� 11 �ϐ������l�F i_ACPT_INSPC_TYP_name


	final static String i_ACPT_INSPC_TYP_name = null;

	// �� 12 �ϐ������l�F i_ACPT_INSPC_TYP_val


	final static String i_ACPT_INSPC_TYP_val = null;

	// �� 13 �ϐ������l�F i_PRODUCT_TYP_name


	final static String i_PRODUCT_TYP_name = null;

	// �� 14 �ϐ������l�F i_PRODUCT_TYP_val


	final static String i_PRODUCT_TYP_val = null;

	// �� 15 �ϐ������l�F i_ABC_TYP_name


	final static String i_ABC_TYP_name = null;

	// �� 16 �ϐ������l�F i_ABC_TYP_val


	final static String i_ABC_TYP_val = null;

	// �� 17 �ϐ������l�F i_OPR_RSLT_TYP_name


	final static String i_OPR_RSLT_TYP_name = null;

	// �� 18 �ϐ������l�F i_OPR_RSLT_TYP_val


	final static String i_OPR_RSLT_TYP_val = null;

	// �� 19 �ϐ������l�F i_SPL_ITEM_TYP_name


	final static String i_SPL_ITEM_TYP_name = null;

	// �� 20 �ϐ������l�F i_SPL_ITEM_TYP_val


	final static String i_SPL_ITEM_TYP_val = null;

	// �� 21 �ϐ������l�F i_LOT_SIZING_TYP_name


	final static String i_LOT_SIZING_TYP_name = null;

	// �� 22 �ϐ������l�F i_LOT_SIZING_TYP_val


	final static String i_LOT_SIZING_TYP_val = null;

	// �� 23 �ϐ������l�F i_MPS_FLG_name


	final static String i_MPS_FLG_name = null;

	// �� 24 �ϐ������l�F i_MPS_FLG_val


	final static String i_MPS_FLG_val = null;

	// �� 25 �ϐ������l�F i_h_ITEM_CD


	final static String i_h_ITEM_CD = null;

	// �� 26 �ϐ������l�F i_STOCK_UNIT_name


	final static String i_STOCK_UNIT_name = null;

	// �� 27 �ϐ������l�F i_STOCK_UNIT_val


	final static String i_STOCK_UNIT_val = null;

	// �� 28 �ϐ������l�F i_ITEM_CLASS_01_TYP


	final static String i_ITEM_CLASS_01_TYP = null;

	// �� 29 �ϐ������l�F i_ITEM_CLASS_01_NAME


	final static String i_ITEM_CLASS_01_NAME = null;

	// �� 30 �ϐ������l�F i_ITEM_CLASS_02_TYP


	final static String i_ITEM_CLASS_02_TYP = null;

	// �� 31 �ϐ������l�F i_ITEM_CLASS_02_NAME


	final static String i_ITEM_CLASS_02_NAME = null;

	// �� 32 �ϐ������l�F i_ITEM_CLASS_03_TYP


	final static String i_ITEM_CLASS_03_TYP = null;

	// �� 33 �ϐ������l�F i_ITEM_CLASS_03_NAME


	final static String i_ITEM_CLASS_03_NAME = null;

	// �� 34 �ϐ������l�F i_ITEM_CLASS_04_TYP


	final static String i_ITEM_CLASS_04_TYP = null;

	// �� 35 �ϐ������l�F i_ITEM_CLASS_04_NAME


	final static String i_ITEM_CLASS_04_NAME = null;

	// �� 36 �ϐ������l�F i_ITEM_CLASS_05_TYP


	final static String i_ITEM_CLASS_05_TYP = null;

	// �� 37 �ϐ������l�F i_ITEM_CLASS_05_NAME


	final static String i_ITEM_CLASS_05_NAME = null;

	// �� 38 �ϐ������l�F i_ITEM_CLASS_06_TYP


	final static String i_ITEM_CLASS_06_TYP = null;

	// �� 39 �ϐ������l�F i_ITEM_CLASS_06_NAME


	final static String i_ITEM_CLASS_06_NAME = null;

	// �� 40 �ϐ������l�F i_ITEM_CLASS_07_TYP


	final static String i_ITEM_CLASS_07_TYP = null;

	// �� 41 �ϐ������l�F i_ITEM_CLASS_07_NAME


	final static String i_ITEM_CLASS_07_NAME = null;

	// �� 42 �ϐ������l�F i_ITEM_CLASS_08_TYP


	final static String i_ITEM_CLASS_08_TYP = null;

	// �� 43 �ϐ������l�F i_ITEM_CLASS_08_NAME


	final static String i_ITEM_CLASS_08_NAME = null;

	// �� 44 �ϐ������l�F i_ITEM_CLASS_09_TYP


	final static String i_ITEM_CLASS_09_TYP = null;

	// �� 45 �ϐ������l�F i_ITEM_CLASS_09_NAME


	final static String i_ITEM_CLASS_09_NAME = null;

	// �� 46 �ϐ������l�F i_ITEM_CLASS_10_TYP


	final static String i_ITEM_CLASS_10_TYP = null;

	// �� 47 �ϐ������l�F i_ITEM_CLASS_10_NAME


	final static String i_ITEM_CLASS_10_NAME = null;

	// �� 48 �ϐ������l�F i_ITEM_CLASS_11_TYP


	final static String i_ITEM_CLASS_11_TYP = null;

	// �� 49 �ϐ������l�F i_ITEM_CLASS_11_NAME


	final static String i_ITEM_CLASS_11_NAME = null;

	// �� 50 �ϐ������l�F i_ITEM_CLASS_12_TYP


	final static String i_ITEM_CLASS_12_TYP = null;

	// �� 51 �ϐ������l�F i_ITEM_CLASS_12_NAME


	final static String i_ITEM_CLASS_12_NAME = null;

	// �� 52 �ϐ������l�F i_DEPO_TYP_name


	final static String i_DEPO_TYP_name = null;

	// �� 53 �ϐ������l�F i_DEPO_TYP_val


	final static String i_DEPO_TYP_val = null;

	// �� 54 �ϐ������l�F i_LOT_CTRL_FLG_name


	final static String i_LOT_CTRL_FLG_name = null;

	// �� 55 �ϐ������l�F i_LOT_CTRL_FLG_val


	final static String i_LOT_CTRL_FLG_val = null;

	// �� 56 �ϐ������l�F i_LOT_NUMBERING_TYP_name


	final static String i_LOT_NUMBERING_TYP_name = null;

	// �� 57 �ϐ������l�F i_LOT_NUMBERING_TYP_val


	final static String i_LOT_NUMBERING_TYP_val = null;

	// �� 58 �ϐ������l�F i_MANHOUR_TYP_name


	final static String i_MANHOUR_TYP_name = null;

	// �� 59 �ϐ������l�F i_MANHOUR_TYP_val


	final static String i_MANHOUR_TYP_val = null;

	// �� 60 �ϐ������l�F i_h_APR_ITEM


	final static String i_h_APR_ITEM = null;

	// �� 61 �ϐ������l�F i_h_SCREENMOVE_TYP


	final static String i_h_SCREENMOVE_TYP = null;

	// �� 62 �ϐ������l�F i_h_APPR_ID


	final static String i_h_APPR_ID = null;

	// �� 63 �ϐ������l�F i_APPR_REMARKS


	final static String i_APPR_REMARKS = null;

	// �� 64 �ϐ������l�F i_PJ_CD_name


	final static String i_PJ_CD_name = null;

	// �� 65 �ϐ������l�F i_PJ_CD_val


	final static String i_PJ_CD_val = null;

	// �� 66 �ϐ������l�F i_SEG_CONTENTS1_name


	final static String i_SEG_CONTENTS1_name = null;

	// �� 67 �ϐ������l�F i_SEG_CONTENTS1_val


	final static String i_SEG_CONTENTS1_val = null;

	// �� 68 �ϐ������l�F i_SEG_CONTENTS2_name


	final static String i_SEG_CONTENTS2_name = null;

	// �� 69 �ϐ������l�F i_SEG_CONTENTS2_val


	final static String i_SEG_CONTENTS2_val = null;

	// �� 70 �ϐ������l�F i_SEG_CONTENTS3_name


	final static String i_SEG_CONTENTS3_name = null;

	// �� 71 �ϐ������l�F i_SEG_CONTENTS3_val


	final static String i_SEG_CONTENTS3_val = null;

	// �� 72 �ϐ������l�F i_SEG_CONTENTS4_name


	final static String i_SEG_CONTENTS4_name = null;

	// �� 73 �ϐ������l�F i_SEG_CONTENTS4_val


	final static String i_SEG_CONTENTS4_val = null;

	// �� 74 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 75 �ϐ������l�F i_SUM_PROP_LT


	final static Integer i_SUM_PROP_LT = null;

	// �� 76 �ϐ������l�F i_SUM_FIXED_LT


	final static Integer i_SUM_FIXED_LT = null;

	// �� 77 �ϐ������l�F i_LOTCTRLFLG


	final static String i_LOTCTRLFLG = null;

	// �� 78 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 79 �ϐ������l�F i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// �� 80 �ϐ������l�F i_DRAW_CD


	final static String i_DRAW_CD = null;

	// �� 81 �ϐ������l�F i_SPEC


	final static String i_SPEC = null;

	// �� 82 �ϐ������l�F i_HIGH_LEVEL_NO


	final static String i_HIGH_LEVEL_NO = null;

	// �� 83 �ϐ������l�F i_ISSUE_TYP


	final static Integer i_ISSUE_TYP = null;

	// �� 84 �ϐ������l�F i_OUTSIDE_TYP


	final static Integer i_OUTSIDE_TYP = null;

	// �� 85 �ϐ������l�F i_STOCK_UNIT_FLG


	final static Integer i_STOCK_UNIT_FLG = null;

	// �� 86 �ϐ������l�F i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// �� 87 �ϐ������l�F i_PKG_UNIT


	final static String i_PKG_UNIT = null;

	// �� 88 �ϐ������l�F i_PKG_UNIT_QTY


	final static String i_PKG_UNIT_QTY = null;

	// �� 89 �ϐ������l�F i_UNIT_QTY_TYP


	final static Integer i_UNIT_QTY_TYP = null;

	// �� 90 �ϐ������l�F i_ODR_LT


	final static String i_ODR_LT = null;

	// �� 91 �ϐ������l�F i_ISSUE_LT


	final static String i_ISSUE_LT = null;

	// �� 92 �ϐ������l�F i_FIXED_LT


	final static String i_FIXED_LT = null;

	// �� 93 �ϐ������l�F i_PROP_LOT_SIZE


	final static String i_PROP_LOT_SIZE = null;

	// �� 94 �ϐ������l�F i_PROP_LT


	final static String i_PROP_LT = null;

	// �� 95 �ϐ������l�F i_ITEM_SPOIL


	final static String i_ITEM_SPOIL = null;

	// �� 96 �ϐ������l�F i_SAFETY_LT


	final static String i_SAFETY_LT = null;

	// �� 97 �ϐ������l�F i_SAFETY_STOCK


	final static String i_SAFETY_STOCK = null;

	// �� 98 �ϐ������l�F i_MRP_ODR_TYP


	final static Integer i_MRP_ODR_TYP = null;

	// �� 99 �ϐ������l�F i_LOT_SIZING_TYP


	final static Integer i_LOT_SIZING_TYP = null;

	// �� 100 �ϐ������l�F i_MAX_PERIOD


	final static String i_MAX_PERIOD = null;

	// �� 101 �ϐ������l�F i_FIXED_ODR_QTY


	final static String i_FIXED_ODR_QTY = null;

	// �� 102 �ϐ������l�F i_MAX_ODR_QTY


	final static String i_MAX_ODR_QTY = null;

	// �� 103 �ϐ������l�F i_MIN_ODR_QTY


	final static String i_MIN_ODR_QTY = null;

	// �� 104 �ϐ������l�F i_ODR_POINT


	final static String i_ODR_POINT = null;

	// �� 105 �ϐ������l�F i_MUL_ODR_QTY


	final static String i_MUL_ODR_QTY = null;

	// �� 106 �ϐ������l�F i_MPS_FLG


	final static Integer i_MPS_FLG = null;

	// �� 107 �ϐ������l�F i_ACPT_INSPC_TYP


	final static Integer i_ACPT_INSPC_TYP = null;

	// �� 108 �ϐ������l�F i_PRODUCT_TYP


	final static Integer i_PRODUCT_TYP = null;

	// �� 109 �ϐ������l�F i_CLASIFICATION_CD


	final static String i_CLASIFICATION_CD = null;

	// �� 110 �ϐ������l�F i_UNIT_WEIGHT


	final static String i_UNIT_WEIGHT = null;

	// �� 111 �ϐ������l�F i_ABC_TYP


	final static Integer i_ABC_TYP = null;

	// �� 112 �ϐ������l�F i_OPR_RSLT_TYP


	final static Integer i_OPR_RSLT_TYP = null;

	// �� 113 �ϐ������l�F i_SPL_ITEM_TYP


	final static Integer i_SPL_ITEM_TYP = null;

	// �� 114 �ϐ������l�F i_TAX_CD


	final static String i_TAX_CD = null;

	// �� 115 �ϐ������l�F i_TAX_NAME


	final static String i_TAX_NAME = null;

	// �� 116 �ϐ������l�F i_CAL_NO


	final static Integer i_CAL_NO = null;

	// �� 117 �ϐ������l�F i_CAL_NAME


	final static String i_CAL_NAME = null;

	// �� 118 �ϐ������l�F i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// �� 119 �ϐ������l�F i_ITEM_CLASS_01_CD


	final static String i_ITEM_CLASS_01_CD = null;

	// �� 120 �ϐ������l�F i_ITEM_CLASS_02_CD


	final static String i_ITEM_CLASS_02_CD = null;

	// �� 121 �ϐ������l�F i_ITEM_CLASS_03_CD


	final static String i_ITEM_CLASS_03_CD = null;

	// �� 122 �ϐ������l�F i_ITEM_CLASS_04_CD


	final static String i_ITEM_CLASS_04_CD = null;

	// �� 123 �ϐ������l�F i_ITEM_CLASS_05_CD


	final static String i_ITEM_CLASS_05_CD = null;

	// �� 124 �ϐ������l�F i_ITEM_CLASS_06_CD


	final static String i_ITEM_CLASS_06_CD = null;

	// �� 125 �ϐ������l�F i_ITEM_CLASS_07_CD


	final static String i_ITEM_CLASS_07_CD = null;

	// �� 126 �ϐ������l�F i_ITEM_CLASS_08_CD


	final static String i_ITEM_CLASS_08_CD = null;

	// �� 127 �ϐ������l�F i_ITEM_CLASS_09_CD


	final static String i_ITEM_CLASS_09_CD = null;

	// �� 128 �ϐ������l�F i_ITEM_CLASS_10_CD


	final static String i_ITEM_CLASS_10_CD = null;

	// �� 129 �ϐ������l�F i_ITEM_CLASS_11_CD


	final static String i_ITEM_CLASS_11_CD = null;

	// �� 130 �ϐ������l�F i_ITEM_CLASS_12_CD


	final static String i_ITEM_CLASS_12_CD = null;

	// �� 131 �ϐ������l�F i_DEPO_TYP


	final static Integer i_DEPO_TYP = null;

	// �� 132 �ϐ������l�F i_LOT_CTRL_FLG


	final static Integer i_LOT_CTRL_FLG = null;

	// �� 133 �ϐ������l�F i_LOT_NUMBERING_TYP


	final static Integer i_LOT_NUMBERING_TYP = null;

	// �� 134 �ϐ������l�F i_BEST_BEFORE_YEAR


	final static String i_BEST_BEFORE_YEAR = null;

	// �� 135 �ϐ������l�F i_BEST_BEFORE_MONTH


	final static String i_BEST_BEFORE_MONTH = null;

	// �� 136 �ϐ������l�F i_BEST_BEFORE_DAY


	final static String i_BEST_BEFORE_DAY = null;

	// �� 137 �ϐ������l�F i_REMARK1


	final static String i_REMARK1 = null;

	// �� 138 �ϐ������l�F i_REMARK2


	final static String i_REMARK2 = null;

	// �� 139 �ϐ������l�F i_MANHOUR_TYP


	final static Integer i_MANHOUR_TYP = null;

	// �� 140 �ϐ������l�F i_DEPT_CD


	final static String i_DEPT_CD = null;

	// �� 141 �ϐ������l�F i_DEPT_NAME


	final static String i_DEPT_NAME = null;

	// �� 142 �ϐ������l�F i_PJ_CD


	final static String i_PJ_CD = null;

	// �� 143 �ϐ������l�F i_SEG_CONTENTS1


	final static String i_SEG_CONTENTS1 = null;

	// �� 144 �ϐ������l�F i_SEG_CONTENTS2


	final static String i_SEG_CONTENTS2 = null;

	// �� 145 �ϐ������l�F i_SEG_CONTENTS3


	final static String i_SEG_CONTENTS3 = null;

	// �� 146 �ϐ������l�F i_SEG_CONTENTS4


	final static String i_SEG_CONTENTS4 = null;

	// �� 147 �ϐ������l�F i_PUCH_ODR_CD


	final static String i_PUCH_ODR_CD = null;

	// �� 148 �ϐ������l�F i_ONEROUS_CONS_NO


	final static String i_ONEROUS_CONS_NO = null;

	// �� 149 �ϐ������l�F i_uMRP_ODR_TYP_DISPLAY_NAME


	final static String i_uMRP_ODR_TYP_DISPLAY_NAME = null;

	// �� 150 �ϐ������l�F i_uMRP_ODR_TYP_VALUE


	final static String i_uMRP_ODR_TYP_VALUE = null;

	// �� 151 �ϐ������l�F i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// �� 152 �ϐ������l�F i_VALUE


	final static String i_VALUE = null;

	// �� 153 �ϐ������l�F i_DISPLAY_NAME


	final static String i_DISPLAY_NAME = null;

*/

	//{{user_implement_code

	/**
	 * ������
	 */
	public void init()
	{
		m_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_DRAW_CD = null;
		m_SPEC = null;
		m_HIGH_LEVEL_NO = AA0010Common._HIGH_LEVEL_NO;
		m_ISSUE_TYP = AA0010Common._ISSUE_TYP;
		m_OUTSIDE_TYP = AA0010Common._OUTSIDE_TYP;
		m_STOCK_UNIT_FLG = AA0010Common._STOCK_UNIT_FLG;
		m_STOCK_UNIT = null;
		m_PKG_UNIT = null;
		m_PKG_UNIT_QTY = AA0010Common._PKG_UNIT_QTY;
		m_UNIT_QTY_TYP = AA0010Common._UNIT_QTY_TYP;
		m_ODR_LT = AA0010Common._ODR_LT;
		m_ISSUE_LT = AA0010Common._ISSUE_LT;
		m_FIXED_LT = AA0010Common._FIXED_LT;
		m_PROP_LOT_SIZE = AA0010Common._PROP_LOT_SIZE;
		m_PROP_LT = AA0010Common._PROP_LT;
		m_ITEM_SPOIL = AA0010Common._ITEM_SPOIL;
		m_SAFETY_LT = AA0010Common._SAFETY_LT;
		m_SAFETY_STOCK = AA0010Common._SAFETY_STOCK;
		m_MRP_ODR_TYP = AA0010Common._MRP_ODR_TYP;
		m_LOT_SIZING_TYP = AA0010Common._LOT_SIZING_TYP;
		m_MAX_PERIOD = AA0010Common._MAX_PERIOD;
		m_FIXED_ODR_QTY = AA0010Common._FIXED_ODR_QTY;
		m_MAX_ODR_QTY = AA0010Common._MAX_ODR_QTY;
		m_MIN_ODR_QTY = AA0010Common._MIN_ODR_QTY;
		m_ODR_POINT = AA0010Common._ODR_POINT;
		m_MUL_ODR_QTY = AA0010Common._MUL_ODR_QTY;
// 2008/07/14 SYSCOM ���� ADD START
		m_MANHOUR_TYP = AA0010Common._MANHOUR_TYP;
// 2008/07/14 SYSCOM ���� ADD END
		m_MPS_FLG = AA0010Common._MPS_FLG;
		m_ACPT_INSPC_TYP = AA0010Common._ACPT_INSPC_TYP;
		m_PRODUCT_TYP = AA0010Common._PRODUCT_TYP;
		m_CLASIFICATION_CD = null;
		m_UNIT_WEIGHT = AA0010Common._UNIT_WEIGHT;
		m_ABC_TYP = AA0010Common._ABC_TYP;
		m_OPR_RSLT_TYP = AA0010Common._OPR_RSLT_TYP;
		m_SPL_ITEM_TYP = AA0010Common._SPL_ITEM_TYP;
		m_MODIFY_COUNT = null;
		m_TAX_CD = null;
		m_TAX_NAME = null;
		m_CAL_NO = null;
		m_CAL_NAME = null;
		m_h_ITEM_CD = null;
		m_DEPO_TYP = AA0010Common._DEPO_TYP;
		m_LOT_CTRL_FLG = AA0010Common._LOT_CTRL_FLG;
		m_LOT_NUMBERING_TYP = AA0010Common._LOT_NUMBERING_TYP;	
		m_BEST_BEFORE_YEAR = null;
		m_BEST_BEFORE_MONTH = null;
		m_BEST_BEFORE_DAY = null;
        m_REMARK1 = null;
        m_REMARK2 = null;
		m_ITEM_CLASS_01_CD = null;
		m_ITEM_CLASS_02_CD = null;
		m_ITEM_CLASS_03_CD = null;
		m_ITEM_CLASS_04_CD = null;
		m_ITEM_CLASS_05_CD = null;
		m_ITEM_CLASS_06_CD = null;
		m_ITEM_CLASS_07_CD = null;
		m_ITEM_CLASS_08_CD = null;
		m_ITEM_CLASS_09_CD = null;
		m_ITEM_CLASS_10_CD = null;
		m_ITEM_CLASS_11_CD = null;
		m_ITEM_CLASS_12_CD = null;
		m_ITEM_CLASS_01_NAME = null;
		m_ITEM_CLASS_02_NAME = null;
		m_ITEM_CLASS_03_NAME = null;
		m_ITEM_CLASS_04_NAME = null;
		m_ITEM_CLASS_05_NAME = null;
		m_ITEM_CLASS_06_NAME = null;
		m_ITEM_CLASS_07_NAME = null;
		m_ITEM_CLASS_08_NAME = null;
		m_ITEM_CLASS_09_NAME = null;
		m_ITEM_CLASS_10_NAME = null;
		m_ITEM_CLASS_11_NAME = null;
		m_ITEM_CLASS_12_NAME = null;
		m_APPR_REMARKS = null;
		m_h_SCREENMOVE_TYP = null;
		m_h_APPR_ID = null;
		m_h_APR_ITEM = null;
//20150731 ADD START BY SYSCOM
		m_DEPT_CD = null;
		m_DEPT_NAME = null;
		m_PJ_CD = null;
		m_SEG_CONTENTS1 = null;
		m_SEG_CONTENTS2 = null;
		m_SEG_CONTENTS3 = null;
		m_SEG_CONTENTS4 = null;
//20150731 ADD END BY SYSCOM
	}

	/**
	 * �R�s�[
	 * @param struct �R�s�[�Ώۂ�Struct
	 */
	public void copy(AA0010010Struct struct)
	{
		this.setITEM_CD(struct.getITEM_CD());
		this.setITEM_NAME(struct.getITEM_NAME());
		this.setDRAW_CD(struct.getDRAW_CD());
		this.setSPEC(struct.getSPEC());
		this.setHIGH_LEVEL_NO(struct.getHIGH_LEVEL_NO());
		this.setISSUE_TYP(struct.getISSUE_TYP());
		this.setOUTSIDE_TYP(struct.getOUTSIDE_TYP());
		this.setSTOCK_UNIT_FLG(struct.getSTOCK_UNIT_FLG());
		this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
		this.setPKG_UNIT(struct.getPKG_UNIT());
		this.setPKG_UNIT_QTY(struct.getPKG_UNIT_QTY());
		this.setUNIT_QTY_TYP(struct.getUNIT_QTY_TYP());
		this.setODR_LT(struct.getODR_LT());
		this.setISSUE_LT(struct.getISSUE_LT());
		this.setFIXED_LT(struct.getFIXED_LT());
		this.setPROP_LOT_SIZE(struct.getPROP_LOT_SIZE());
		this.setPROP_LT(struct.getPROP_LT());
		this.setITEM_SPOIL(struct.getITEM_SPOIL());
		this.setSAFETY_LT(struct.getSAFETY_LT());
		this.setSAFETY_STOCK(struct.getSAFETY_STOCK());
		this.setMRP_ODR_TYP(struct.getMRP_ODR_TYP());
		this.setLOT_SIZING_TYP(struct.getLOT_SIZING_TYP());
		this.setMAX_PERIOD(struct.getMAX_PERIOD());
		this.setFIXED_ODR_QTY(struct.getFIXED_ODR_QTY());
		this.setMAX_ODR_QTY(struct.getMAX_ODR_QTY());
		this.setMIN_ODR_QTY(struct.getMIN_ODR_QTY());
		this.setODR_POINT(struct.getODR_POINT());
		this.setMUL_ODR_QTY(struct.getMUL_ODR_QTY());
// 2008/07/14 SYSCOM ���� ADD START
		this.setMANHOUR_TYP(struct.getMANHOUR_TYP());
// 2008/07/14 SYSCOM ���� ADD END
		this.setMPS_FLG(struct.getMPS_FLG());
		this.setACPT_INSPC_TYP(struct.getACPT_INSPC_TYP());
		this.setPRODUCT_TYP(struct.getPRODUCT_TYP());
		this.setCLASIFICATION_CD(struct.getCLASIFICATION_CD());
		this.setUNIT_WEIGHT(struct.getUNIT_WEIGHT());
		this.setABC_TYP(struct.getABC_TYP());
		this.setOPR_RSLT_TYP(struct.getOPR_RSLT_TYP());
		this.setSPL_ITEM_TYP(struct.getSPL_ITEM_TYP());
		this.setTAX_CD(struct.getTAX_CD());
		this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
		this.setTAX_NAME(struct.getTAX_NAME());
		this.setCAL_NO(struct.getCAL_NO());
		this.setCAL_NAME(struct.getCAL_NAME());
		this.seth_ITEM_CD(struct.geth_ITEM_CD());
		this.setDEPO_TYP(struct.getDEPO_TYP());
		this.setLOT_CTRL_FLG(struct.getLOT_CTRL_FLG());
		this.setLOT_NUMBERING_TYP(struct.getLOT_NUMBERING_TYP());
		this.setBEST_BEFORE_YEAR(struct.getBEST_BEFORE_YEAR());
		this.setBEST_BEFORE_MONTH(struct.getBEST_BEFORE_MONTH());
		this.setBEST_BEFORE_DAY(struct.getBEST_BEFORE_DAY());
		this.setREMARK1(struct.getREMARK1());
		this.setREMARK2(struct.getREMARK2());		
		this.setITEM_CLASS_01_CD(struct.getITEM_CLASS_01_CD());
		this.setITEM_CLASS_02_CD(struct.getITEM_CLASS_02_CD());
		this.setITEM_CLASS_03_CD(struct.getITEM_CLASS_03_CD());
		this.setITEM_CLASS_04_CD(struct.getITEM_CLASS_04_CD());
		this.setITEM_CLASS_05_CD(struct.getITEM_CLASS_05_CD());
		this.setITEM_CLASS_06_CD(struct.getITEM_CLASS_06_CD());
		this.setITEM_CLASS_07_CD(struct.getITEM_CLASS_07_CD());
		this.setITEM_CLASS_08_CD(struct.getITEM_CLASS_08_CD());
		this.setITEM_CLASS_09_CD(struct.getITEM_CLASS_09_CD());
		this.setITEM_CLASS_10_CD(struct.getITEM_CLASS_10_CD());
		this.setITEM_CLASS_11_CD(struct.getITEM_CLASS_11_CD());
		this.setITEM_CLASS_12_CD(struct.getITEM_CLASS_12_CD());
	
		this.setITEM_CLASS_01_NAME(struct.getITEM_CLASS_01_NAME());
		this.setITEM_CLASS_02_NAME(struct.getITEM_CLASS_02_NAME());
		this.setITEM_CLASS_03_NAME(struct.getITEM_CLASS_03_NAME());
		this.setITEM_CLASS_04_NAME(struct.getITEM_CLASS_04_NAME());
		this.setITEM_CLASS_05_NAME(struct.getITEM_CLASS_05_NAME());
		this.setITEM_CLASS_06_NAME(struct.getITEM_CLASS_06_NAME());
		this.setITEM_CLASS_07_NAME(struct.getITEM_CLASS_07_NAME());
		this.setITEM_CLASS_08_NAME(struct.getITEM_CLASS_08_NAME());
		this.setITEM_CLASS_09_NAME(struct.getITEM_CLASS_09_NAME());
		this.setITEM_CLASS_10_NAME(struct.getITEM_CLASS_10_NAME());
		this.setITEM_CLASS_11_NAME(struct.getITEM_CLASS_11_NAME());
		this.setITEM_CLASS_12_NAME(struct.getITEM_CLASS_12_NAME());
		
//20150731 ADD START BY SYSCOM
		this.setDEPT_CD(struct.getDEPT_CD());
		this.setDEPT_NAME(struct.getDEPT_NAME());
		this.setPJ_CD(struct.getPJ_CD());
		this.setSEG_CONTENTS1(struct.getSEG_CONTENTS1());
		this.setSEG_CONTENTS2(struct.getSEG_CONTENTS2());
		this.setSEG_CONTENTS3(struct.getSEG_CONTENTS3());
		this.setSEG_CONTENTS4(struct.getSEG_CONTENTS4());
//20150731 ADD END BY SYSCOM
	}


        //}}user_implement_code

	//////////////////////////////

}
