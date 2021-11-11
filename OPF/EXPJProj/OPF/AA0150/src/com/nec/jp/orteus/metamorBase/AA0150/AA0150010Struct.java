/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0150/src/com/nec/jp/orteus/metamorBase/AA0150/AA0150010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0150;

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

public class AA0150010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_rdoInsert */
	public String m_rdoInsert = null;
	/** �� 2 �ϐ��F m_rdoUpdate */
	public String m_rdoUpdate = null;
	/** �� 3 �ϐ��F m_rdoDelete */
	public String m_rdoDelete = null;
	/** �� 4 �ϐ��F m_FileName */
	public String m_FileName = null;
	/** �� 5 �ϐ��F m_DO_CHK */
	public String m_DO_CHK = null;
	/** �� 6 �ϐ��F m_ERROR_IN */
	public String m_ERROR_IN = null;
	/** �� 7 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 8 �ϐ��F m_ERR_CTR_NM */
	public String m_ERR_CTR_NM = null;
	/** �� 9 �ϐ��F m_ERR_INFO */
	public String m_ERR_INFO = null;
	/** �� 10 �ϐ��F m_h_SYORI_KUBUN */
	public String m_h_SYORI_KUBUN = null;
	/** �� 11 �ϐ��F m_h_WH_CD */
	public String m_h_WH_CD = null;
	/** �� 12 �ϐ��F m_CANCEL_FILE */
	public String m_CANCEL_FILE = null;
	/** �� 13 �ϐ��F m_JUDGMENT_TXT */
	public String m_JUDGMENT_TXT = null;
	/** �� 14 �ϐ��F m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** �� 15 �ϐ��F m_ERR_TYP */
	public String m_ERR_TYP = null;
	/** �� 16 �ϐ��F m_w_COLUMN_FLG */
	public String m_w_COLUMN_FLG = null;
	/** �� 17 �ϐ��F m_OUT_ITEM_CD */
	public String m_OUT_ITEM_CD = null;
	/** �� 18 �ϐ��F m_readNAME */
	public String m_readNAME = null;
	/** �� 19 �ϐ��F m_readVALUE */
	public String m_readVALUE = null;
	/** �� 20 �ϐ��F m_DISPLAY_NAME */
	public String m_DISPLAY_NAME = null;
	/** �� 21 �ϐ��F m_setNAME */
	public String m_setNAME = null;
	/** �� 22 �ϐ��F m_setVALUE */
	public String m_setVALUE = null;
	/** �� 23 �ϐ��F m_readSYS_P_NAME */
	public String m_readSYS_P_NAME = null;
	/** �� 24 �ϐ��F m_readSYS_P_VALUE */
	public String m_readSYS_P_VALUE = null;
	/** �� 25 �ϐ��F m_setSYS_P_NAME */
	public String m_setSYS_P_NAME = null;
	/** �� 26 �ϐ��F m_h_ITEM_CD */
	public String m_h_ITEM_CD = null;
	/** �� 27 �ϐ��F m_h_ITEM_NAME */
	public String m_h_ITEM_NAME = null;
	/** �� 28 �ϐ��F m_h_DRAW_CD */
	public String m_h_DRAW_CD = null;
	/** �� 29 �ϐ��F m_h_SPEC */
	public String m_h_SPEC = null;
	/** �� 30 �ϐ��F m_h_HIGH_LEVEL_NO */
	public String m_h_HIGH_LEVEL_NO = null;
	/** �� 31 �ϐ��F m_h_MRP_ODR_TYP */
	public String m_h_MRP_ODR_TYP = null;
	/** �� 32 �ϐ��F m_h_OUTSIDE_TYP */
	public String m_h_OUTSIDE_TYP = null;
	/** �� 33 �ϐ��F m_h_STOCK_UNIT_FLG */
	public String m_h_STOCK_UNIT_FLG = null;
	/** �� 34 �ϐ��F m_h_STOCK_UNIT */
	public String m_h_STOCK_UNIT = null;
	/** �� 35 �ϐ��F m_h_PKG_UNIT */
	public String m_h_PKG_UNIT = null;
	/** �� 36 �ϐ��F m_h_PKG_UNIT_QTY */
	public String m_h_PKG_UNIT_QTY = null;
	/** �� 37 �ϐ��F m_h_UNIT_QTY_TYP */
	public String m_h_UNIT_QTY_TYP = null;
	/** �� 38 �ϐ��F m_h_ODR_LT */
	public String m_h_ODR_LT = null;
	/** �� 39 �ϐ��F m_h_FIXED_LT */
	public String m_h_FIXED_LT = null;
	/** �� 40 �ϐ��F m_h_PROP_LT */
	public String m_h_PROP_LT = null;
	/** �� 41 �ϐ��F m_h_SAFETY_LT */
	public String m_h_SAFETY_LT = null;
	/** �� 42 �ϐ��F m_h_ISSUE_LT */
	public String m_h_ISSUE_LT = null;
	/** �� 43 �ϐ��F m_h_PROP_LOT_SIZE */
	public String m_h_PROP_LOT_SIZE = null;
	/** �� 44 �ϐ��F m_h_ITEM_SPOIL */
	public String m_h_ITEM_SPOIL = null;
	/** �� 45 �ϐ��F m_h_SAFETY_STOCK */
	public String m_h_SAFETY_STOCK = null;
	/** �� 46 �ϐ��F m_h_LOT_SIZING_TYP */
	public String m_h_LOT_SIZING_TYP = null;
	/** �� 47 �ϐ��F m_h_MAX_PERIOD */
	public String m_h_MAX_PERIOD = null;
	/** �� 48 �ϐ��F m_h_MAX_ODR_QTY */
	public String m_h_MAX_ODR_QTY = null;
	/** �� 49 �ϐ��F m_h_ODR_POINT */
	public String m_h_ODR_POINT = null;
	/** �� 50 �ϐ��F m_h_FIXED_ODR_QTY */
	public String m_h_FIXED_ODR_QTY = null;
	/** �� 51 �ϐ��F m_h_MIN_ODR_QTY */
	public String m_h_MIN_ODR_QTY = null;
	/** �� 52 �ϐ��F m_h_MUL_ODR_QTY */
	public String m_h_MUL_ODR_QTY = null;
	/** �� 53 �ϐ��F m_h_ISSUE_TYP */
	public String m_h_ISSUE_TYP = null;
	/** �� 54 �ϐ��F m_h_MPS_FLG */
	public String m_h_MPS_FLG = null;
	/** �� 55 �ϐ��F m_h_ACPT_INSPC_TYP */
	public String m_h_ACPT_INSPC_TYP = null;
	/** �� 56 �ϐ��F m_h_PRODUCT_TYP */
	public String m_h_PRODUCT_TYP = null;
	/** �� 57 �ϐ��F m_h_CLASIFICATION_CD */
	public String m_h_CLASIFICATION_CD = null;
	/** �� 58 �ϐ��F m_h_UNIT_WEIGHT */
	public String m_h_UNIT_WEIGHT = null;
	/** �� 59 �ϐ��F m_h_ABC_TYP */
	public String m_h_ABC_TYP = null;
	/** �� 60 �ϐ��F m_h_OPR_RSLT_TYP */
	public String m_h_OPR_RSLT_TYP = null;
	/** �� 61 �ϐ��F m_h_SPL_ITEM_TYP */
	public String m_h_SPL_ITEM_TYP = null;
	/** �� 62 �ϐ��F m_h_TAX_CD */
	public String m_h_TAX_CD = null;
	/** �� 63 �ϐ��F m_h_CAL_NO */
	public String m_h_CAL_NO = null;
	/** �� 64 �ϐ��F m_h_MANHOUR_TYP */
	public String m_h_MANHOUR_TYP = null;
	/** �� 65 �ϐ��F m_h_DEPO_TYP */
	public String m_h_DEPO_TYP = null;
	/** �� 66 �ϐ��F m_h_LOT_CTRL_FLG */
	public String m_h_LOT_CTRL_FLG = null;
	/** �� 67 �ϐ��F m_h_LOT_NUMBERING_TYP */
	public String m_h_LOT_NUMBERING_TYP = null;
	/** �� 68 �ϐ��F m_h_BEST_BEFORE_YEAR */
	public String m_h_BEST_BEFORE_YEAR = null;
	/** �� 69 �ϐ��F m_h_BEST_BEFORE_MONTH */
	public String m_h_BEST_BEFORE_MONTH = null;
	/** �� 70 �ϐ��F m_h_BEST_BEFORE_DAY */
	public String m_h_BEST_BEFORE_DAY = null;
	/** �� 71 �ϐ��F m_h_DEPT_CD */
	public String m_h_DEPT_CD = null;
	/** �� 72 �ϐ��F m_h_PJ_CD */
	public String m_h_PJ_CD = null;
	/** �� 73 �ϐ��F m_h_SEG_CONTENTS_1 */
	public String m_h_SEG_CONTENTS_1 = null;
	/** �� 74 �ϐ��F m_h_SEG_CONTENTS_2 */
	public String m_h_SEG_CONTENTS_2 = null;
	/** �� 75 �ϐ��F m_h_SEG_CONTENTS_3 */
	public String m_h_SEG_CONTENTS_3 = null;
	/** �� 76 �ϐ��F m_h_SEG_CONTENTS_4 */
	public String m_h_SEG_CONTENTS_4 = null;
	/** �� 77 �ϐ��F m_h_REMARK1 */
	public String m_h_REMARK1 = null;
	/** �� 78 �ϐ��F m_h_REMARK2 */
	public String m_h_REMARK2 = null;
	/** �� 79 �ϐ��F m_h_ITEM_CLASS_01_CD */
	public String m_h_ITEM_CLASS_01_CD = null;
	/** �� 80 �ϐ��F m_h_ITEM_CLASS_02_CD */
	public String m_h_ITEM_CLASS_02_CD = null;
	/** �� 81 �ϐ��F m_h_ITEM_CLASS_03_CD */
	public String m_h_ITEM_CLASS_03_CD = null;
	/** �� 82 �ϐ��F m_h_ITEM_CLASS_04_CD */
	public String m_h_ITEM_CLASS_04_CD = null;
	/** �� 83 �ϐ��F m_h_ITEM_CLASS_05_CD */
	public String m_h_ITEM_CLASS_05_CD = null;
	/** �� 84 �ϐ��F m_h_ITEM_CLASS_06_CD */
	public String m_h_ITEM_CLASS_06_CD = null;
	/** �� 85 �ϐ��F m_h_ITEM_CLASS_07_CD */
	public String m_h_ITEM_CLASS_07_CD = null;
	/** �� 86 �ϐ��F m_h_ITEM_CLASS_08_CD */
	public String m_h_ITEM_CLASS_08_CD = null;
	/** �� 87 �ϐ��F m_h_ITEM_CLASS_09_CD */
	public String m_h_ITEM_CLASS_09_CD = null;
	/** �� 88 �ϐ��F m_h_ITEM_CLASS_10_CD */
	public String m_h_ITEM_CLASS_10_CD = null;
	/** �� 89 �ϐ��F m_h_ITEM_CLASS_11_CD */
	public String m_h_ITEM_CLASS_11_CD = null;
	/** �� 90 �ϐ��F m_h_ITEM_CLASS_12_CD */
	public String m_h_ITEM_CLASS_12_CD = null;
	/** �� 91 �ϐ��F m_readTAX_CD */
	public String m_readTAX_CD = null;
	/** �� 92 �ϐ��F m_setTAXCD */
	public String m_setTAXCD = null;
	/** �� 93 �ϐ��F m_readITEM_CD */
	public String m_readITEM_CD = null;
	/** �� 94 �ϐ��F m_setITEM_CD */
	public String m_setITEM_CD = null;
	/** �� 95 �ϐ��F m_readVEND_CD */
	public String m_readVEND_CD = null;
	/** �� 96 �ϐ��F m_setVEND_CD */
	public String m_setVEND_CD = null;
	/** �� 97 �ϐ��F m_readPLANT_CD */
	public String m_readPLANT_CD = null;
	/** �� 98 �ϐ��F m_readSUM_PROP_LT */
	public Integer m_readSUM_PROP_LT = null;
	/** �� 99 �ϐ��F m_readSUM_FIXED_LT */
	public Integer m_readSUM_FIXED_LT = null;
	/** �� 100 �ϐ��F m_readMRP_ITEM_CD */
	public String m_readMRP_ITEM_CD = null;
	/** �� 101 �ϐ��F m_readMRP_ODR_TYP */
	public Integer m_readMRP_ODR_TYP = null;
	/** �� 102 �ϐ��F m_setMRP_ITEM_CD */
	public String m_setMRP_ITEM_CD = null;
	/** �� 103 �ϐ��F m_readMRP_ODR_ITEM_CD */
	public String m_readMRP_ODR_ITEM_CD = null;
	/** �� 104 �ϐ��F m_setMRP_ODR_ITEM_CD */
	public String m_setMRP_ODR_ITEM_CD = null;
	/** �� 105 �ϐ��F m_C_ITEM_CD */
	public String m_C_ITEM_CD = null;
	/** �� 106 �ϐ��F m_C_ITEM_NAME */
	public String m_C_ITEM_NAME = null;
	/** �� 107 �ϐ��F m_C_DRAW_CD */
	public String m_C_DRAW_CD = null;
	/** �� 108 �ϐ��F m_C_SPEC */
	public String m_C_SPEC = null;
	/** �� 109 �ϐ��F m_C_HIGH_LEVEL_NO */
	public String m_C_HIGH_LEVEL_NO = null;
	/** �� 110 �ϐ��F m_C_MRP_ODR_TYP */
	public String m_C_MRP_ODR_TYP = null;
	/** �� 111 �ϐ��F m_C_OUTSIDE_TYP */
	public String m_C_OUTSIDE_TYP = null;
	/** �� 112 �ϐ��F m_C_STOCK_UNIT_FLG */
	public String m_C_STOCK_UNIT_FLG = null;
	/** �� 113 �ϐ��F m_C_STOCK_UNIT */
	public String m_C_STOCK_UNIT = null;
	/** �� 114 �ϐ��F m_C_PKG_UNIT */
	public String m_C_PKG_UNIT = null;
	/** �� 115 �ϐ��F m_C_PKG_UNIT_QTY */
	public String m_C_PKG_UNIT_QTY = null;
	/** �� 116 �ϐ��F m_C_UNIT_QTY_TYP */
	public String m_C_UNIT_QTY_TYP = null;
	/** �� 117 �ϐ��F m_C_ODR_LT */
	public String m_C_ODR_LT = null;
	/** �� 118 �ϐ��F m_C_FIXED_LT */
	public String m_C_FIXED_LT = null;
	/** �� 119 �ϐ��F m_C_PROP_LT */
	public String m_C_PROP_LT = null;
	/** �� 120 �ϐ��F m_C_SAFETY_LT */
	public String m_C_SAFETY_LT = null;
	/** �� 121 �ϐ��F m_C_ISSUE_LT */
	public String m_C_ISSUE_LT = null;
	/** �� 122 �ϐ��F m_C_PROP_LOT_SIZE */
	public String m_C_PROP_LOT_SIZE = null;
	/** �� 123 �ϐ��F m_C_ITEM_SPOIL */
	public String m_C_ITEM_SPOIL = null;
	/** �� 124 �ϐ��F m_C_SAFETY_STOCK */
	public String m_C_SAFETY_STOCK = null;
	/** �� 125 �ϐ��F m_C_LOT_SIZING_TYP */
	public String m_C_LOT_SIZING_TYP = null;
	/** �� 126 �ϐ��F m_C_MAX_PERIOD */
	public String m_C_MAX_PERIOD = null;
	/** �� 127 �ϐ��F m_C_MAX_ODR_QTY */
	public String m_C_MAX_ODR_QTY = null;
	/** �� 128 �ϐ��F m_C_ODR_POINT */
	public String m_C_ODR_POINT = null;
	/** �� 129 �ϐ��F m_C_FIXED_ODR_QTY */
	public String m_C_FIXED_ODR_QTY = null;
	/** �� 130 �ϐ��F m_C_MIN_ODR_QTY */
	public String m_C_MIN_ODR_QTY = null;
	/** �� 131 �ϐ��F m_C_MUL_ODR_QTY */
	public String m_C_MUL_ODR_QTY = null;
	/** �� 132 �ϐ��F m_C_ISSUE_TYP */
	public String m_C_ISSUE_TYP = null;
	/** �� 133 �ϐ��F m_C_MPS_FLG */
	public String m_C_MPS_FLG = null;
	/** �� 134 �ϐ��F m_C_ACPT_INSPC_TYP */
	public String m_C_ACPT_INSPC_TYP = null;
	/** �� 135 �ϐ��F m_C_PRODUCT_TYP */
	public String m_C_PRODUCT_TYP = null;
	/** �� 136 �ϐ��F m_C_CLASIFICATION_CD */
	public String m_C_CLASIFICATION_CD = null;
	/** �� 137 �ϐ��F m_C_UNIT_WEIGHT */
	public String m_C_UNIT_WEIGHT = null;
	/** �� 138 �ϐ��F m_C_ABC_TYP */
	public String m_C_ABC_TYP = null;
	/** �� 139 �ϐ��F m_C_OPR_RSLT_TYP */
	public String m_C_OPR_RSLT_TYP = null;
	/** �� 140 �ϐ��F m_C_SPL_ITEM_TYP */
	public String m_C_SPL_ITEM_TYP = null;
	/** �� 141 �ϐ��F m_C_TAX_CD */
	public String m_C_TAX_CD = null;
	/** �� 142 �ϐ��F m_C_CAL_NO */
	public String m_C_CAL_NO = null;
	/** �� 143 �ϐ��F m_C_MANHOUR_TYP */
	public String m_C_MANHOUR_TYP = null;
	/** �� 144 �ϐ��F m_C_DEPO_TYP */
	public String m_C_DEPO_TYP = null;
	/** �� 145 �ϐ��F m_C_LOT_CTRL_FLG */
	public String m_C_LOT_CTRL_FLG = null;
	/** �� 146 �ϐ��F m_C_LOT_NUMBERING_TYP */
	public String m_C_LOT_NUMBERING_TYP = null;
	/** �� 147 �ϐ��F m_C_BEST_BEFORE_YEAR */
	public String m_C_BEST_BEFORE_YEAR = null;
	/** �� 148 �ϐ��F m_C_BEST_BEFORE_MONTH */
	public String m_C_BEST_BEFORE_MONTH = null;
	/** �� 149 �ϐ��F m_C_BEST_BEFORE_DAY */
	public String m_C_BEST_BEFORE_DAY = null;
	/** �� 150 �ϐ��F m_C_REMARK1 */
	public String m_C_REMARK1 = null;
	/** �� 151 �ϐ��F m_C_REMARK2 */
	public String m_C_REMARK2 = null;
	/** �� 152 �ϐ��F m_C_ITEM_CLASS_01_CD */
	public String m_C_ITEM_CLASS_01_CD = null;
	/** �� 153 �ϐ��F m_C_ITEM_CLASS_02_CD */
	public String m_C_ITEM_CLASS_02_CD = null;
	/** �� 154 �ϐ��F m_C_ITEM_CLASS_03_CD */
	public String m_C_ITEM_CLASS_03_CD = null;
	/** �� 155 �ϐ��F m_C_ITEM_CLASS_04_CD */
	public String m_C_ITEM_CLASS_04_CD = null;
	/** �� 156 �ϐ��F m_C_ITEM_CLASS_05_CD */
	public String m_C_ITEM_CLASS_05_CD = null;
	/** �� 157 �ϐ��F m_C_ITEM_CLASS_06_CD */
	public String m_C_ITEM_CLASS_06_CD = null;
	/** �� 158 �ϐ��F m_C_ITEM_CLASS_07_CD */
	public String m_C_ITEM_CLASS_07_CD = null;
	/** �� 159 �ϐ��F m_C_ITEM_CLASS_08_CD */
	public String m_C_ITEM_CLASS_08_CD = null;
	/** �� 160 �ϐ��F m_C_ITEM_CLASS_09_CD */
	public String m_C_ITEM_CLASS_09_CD = null;
	/** �� 161 �ϐ��F m_C_ITEM_CLASS_10_CD */
	public String m_C_ITEM_CLASS_10_CD = null;
	/** �� 162 �ϐ��F m_C_ITEM_CLASS_11_CD */
	public String m_C_ITEM_CLASS_11_CD = null;
	/** �� 163 �ϐ��F m_C_ITEM_CLASS_12_CD */
	public String m_C_ITEM_CLASS_12_CD = null;
	/** �� 164 �ϐ��F m_C_DEPT_CD */
	public String m_C_DEPT_CD = null;
	/** �� 165 �ϐ��F m_C_PJ_CD */
	public String m_C_PJ_CD = null;
	/** �� 166 �ϐ��F m_C_SEG_CONTENTS_1 */
	public String m_C_SEG_CONTENTS_1 = null;
	/** �� 167 �ϐ��F m_C_SEG_CONTENTS_2 */
	public String m_C_SEG_CONTENTS_2 = null;
	/** �� 168 �ϐ��F m_C_SEG_CONTENTS_3 */
	public String m_C_SEG_CONTENTS_3 = null;
	/** �� 169 �ϐ��F m_C_SEG_CONTENTS_4 */
	public String m_C_SEG_CONTENTS_4 = null;
	/** �� 170 �ϐ��F m_C_setITEM_CD */
	public String m_C_setITEM_CD = null;
	/** �� 171 �ϐ��F m_readT_OD_ITEM_CD */
	public String m_readT_OD_ITEM_CD = null;
	/** �� 172 �ϐ��F m_setT_OD_ITEM_CD */
	public String m_setT_OD_ITEM_CD = null;
	/** �� 173 �ϐ��F m_readM_PS_ITEM_CD */
	public String m_readM_PS_ITEM_CD = null;
	/** �� 174 �ϐ��F m_setM_PS_ITEM_CD */
	public String m_setM_PS_ITEM_CD = null;
	/** �� 175 �ϐ��F m_readT_ITEM_STOCK_ITEM_CD */
	public String m_readT_ITEM_STOCK_ITEM_CD = null;
	/** �� 176 �ϐ��F m_readT_ITEM_STOCK_STOCK_ON_HAND_QTY */
	public String m_readT_ITEM_STOCK_STOCK_ON_HAND_QTY = null;
	/** �� 177 �ϐ��F m_setT_ITEM_STOCK_ITEM_CD */
	public String m_setT_ITEM_STOCK_ITEM_CD = null;
	/** �� 178 �ϐ��F m_readT_JOB_ODR_CD_ITEM_CD */
	public String m_readT_JOB_ODR_CD_ITEM_CD = null;
	/** �� 179 �ϐ��F m_readT_JOB_ODR_CD_STOCK_ON_HAND_QTY */
	public String m_readT_JOB_ODR_CD_STOCK_ON_HAND_QTY = null;
	/** �� 180 �ϐ��F m_setT_JOB_ODR_CD_ITEM_CD */
	public String m_setT_JOB_ODR_CD_ITEM_CD = null;
	/** �� 181 �ϐ��F m_readT_RLSD_P_ITEM_CD */
	public String m_readT_RLSD_P_ITEM_CD = null;
	/** �� 182 �ϐ��F m_setT_RLSD_P_ITEM_CD */
	public String m_setT_RLSD_P_ITEM_CD = null;
	/** �� 183 �ϐ��F m_readT_WORK_IN_ITEM_CD */
	public String m_readT_WORK_IN_ITEM_CD = null;
	/** �� 184 �ϐ��F m_setT_WORK_IN_ITEM_CD */
	public String m_setT_WORK_IN_ITEM_CD = null;
	/** �� 185 �ϐ��F m_readT_JOB_ODR_ITEM_CD */
	public String m_readT_JOB_ODR_ITEM_CD = null;
	/** �� 186 �ϐ��F m_setT_JOB_ODR_ITEM_CD */
	public String m_setT_JOB_ODR_ITEM_CD = null;
	/** �� 187 �ϐ��F m_readT_OPR_RSLT_ITEM_CD */
	public String m_readT_OPR_RSLT_ITEM_CD = null;
	/** �� 188 �ϐ��F m_setT_OPR_RSLT_ITEM_CD */
	public String m_setT_OPR_RSLT_ITEM_CD = null;
	/** �� 189 �ϐ��F m_setM_WH_ITEM_CD */
	public String m_setM_WH_ITEM_CD = null;
	/** �� 190 �ϐ��F m_setM_WH_WH_CD */
	public String m_setM_WH_WH_CD = null;
	/** �� 191 �ϐ��F m_setM_WH_PLANT_CD */
	public String m_setM_WH_PLANT_CD = null;
	/** �� 192 �ϐ��F m_setM_WH_WH_REF_NO */
	public String m_setM_WH_WH_REF_NO = null;
	/** �� 193 �ϐ��F m_readM_WH_ITEM_CD */
	public String m_readM_WH_ITEM_CD = null;
	/** �� 194 �ϐ��F m_readM_WH_WH_CD */
	public String m_readM_WH_WH_CD = null;
	/** �� 195 �ϐ��F m_readM_CAL_H_CAL_NO */
	public String m_readM_CAL_H_CAL_NO = null;
	/** �� 196 �ϐ��F m_setM_CAL_H_CAL_NO */
	public String m_setM_CAL_H_CAL_NO = null;
	/** �� 197 �ϐ��F m_readCLASS_CD1 */
	public String m_readCLASS_CD1 = null;
	/** �� 198 �ϐ��F m_setCLASS_CD2 */
	public String m_setCLASS_CD2 = null;
	/** �� 199 �ϐ��F m_setCLASS_CD3 */
	public String m_setCLASS_CD3 = null;
	/** �� 200 �ϐ��F m_readM_ITEM_STOCK_UNIT */
	public String m_readM_ITEM_STOCK_UNIT = null;
	/** �� 201 �ϐ��F m_readM_ITEM_LOT_CTRL_FLG */
	public String m_readM_ITEM_LOT_CTRL_FLG = null;
	/** �� 202 �ϐ��F m_readM_ITEM_MRP_ODR_TYP */
	public String m_readM_ITEM_MRP_ODR_TYP = null;
	/** �� 203 �ϐ��F m_setM_ITEM_ITEM_CD */
	public String m_setM_ITEM_ITEM_CD = null;
	/** �� 204 �ϐ��F m_setDISPLAY_NAME */
	public String m_setDISPLAY_NAME = null;
	/** �� 205 �ϐ��F m_VALUE */
	public String m_VALUE = null;
	/** �� 206 �ϐ��F m_DEPT_CD */
	public String m_DEPT_CD = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_rdoInsert */
	public List l_rdoInsert = null;

	/** �� 2 List�ϐ��F l_rdoUpdate */
	public List l_rdoUpdate = null;

	/** �� 3 List�ϐ��F l_rdoDelete */
	public List l_rdoDelete = null;

	/** �� 4 List�ϐ��F l_FileName */
	public List l_FileName = null;

	/** �� 5 List�ϐ��F l_DO_CHK */
	public List l_DO_CHK = null;

	/** �� 6 List�ϐ��F l_ERROR_IN */
	public List l_ERROR_IN = null;

	/** �� 7 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 8 List�ϐ��F l_ERR_CTR_NM */
	public List l_ERR_CTR_NM = null;

	/** �� 9 List�ϐ��F l_ERR_INFO */
	public List l_ERR_INFO = null;

	/** �� 10 List�ϐ��F l_h_SYORI_KUBUN */
	public List l_h_SYORI_KUBUN = null;

	/** �� 11 List�ϐ��F l_h_WH_CD */
	public List l_h_WH_CD = null;

	/** �� 12 List�ϐ��F l_CANCEL_FILE */
	public List l_CANCEL_FILE = null;

	/** �� 13 List�ϐ��F l_JUDGMENT_TXT */
	public List l_JUDGMENT_TXT = null;

	/** �� 14 List�ϐ��F l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** �� 15 List�ϐ��F l_ERR_TYP */
	public List l_ERR_TYP = null;

	/** �� 16 List�ϐ��F l_w_COLUMN_FLG */
	public List l_w_COLUMN_FLG = null;

	/** �� 17 List�ϐ��F l_OUT_ITEM_CD */
	public List l_OUT_ITEM_CD = null;

	/** �� 18 List�ϐ��F l_readNAME */
	public List l_readNAME = null;

	/** �� 19 List�ϐ��F l_readVALUE */
	public List l_readVALUE = null;

	/** �� 20 List�ϐ��F l_DISPLAY_NAME */
	public List l_DISPLAY_NAME = null;

	/** �� 21 List�ϐ��F l_setNAME */
	public List l_setNAME = null;

	/** �� 22 List�ϐ��F l_setVALUE */
	public List l_setVALUE = null;

	/** �� 23 List�ϐ��F l_readSYS_P_NAME */
	public List l_readSYS_P_NAME = null;

	/** �� 24 List�ϐ��F l_readSYS_P_VALUE */
	public List l_readSYS_P_VALUE = null;

	/** �� 25 List�ϐ��F l_setSYS_P_NAME */
	public List l_setSYS_P_NAME = null;

	/** �� 26 List�ϐ��F l_h_ITEM_CD */
	public List l_h_ITEM_CD = null;

	/** �� 27 List�ϐ��F l_h_ITEM_NAME */
	public List l_h_ITEM_NAME = null;

	/** �� 28 List�ϐ��F l_h_DRAW_CD */
	public List l_h_DRAW_CD = null;

	/** �� 29 List�ϐ��F l_h_SPEC */
	public List l_h_SPEC = null;

	/** �� 30 List�ϐ��F l_h_HIGH_LEVEL_NO */
	public List l_h_HIGH_LEVEL_NO = null;

	/** �� 31 List�ϐ��F l_h_MRP_ODR_TYP */
	public List l_h_MRP_ODR_TYP = null;

	/** �� 32 List�ϐ��F l_h_OUTSIDE_TYP */
	public List l_h_OUTSIDE_TYP = null;

	/** �� 33 List�ϐ��F l_h_STOCK_UNIT_FLG */
	public List l_h_STOCK_UNIT_FLG = null;

	/** �� 34 List�ϐ��F l_h_STOCK_UNIT */
	public List l_h_STOCK_UNIT = null;

	/** �� 35 List�ϐ��F l_h_PKG_UNIT */
	public List l_h_PKG_UNIT = null;

	/** �� 36 List�ϐ��F l_h_PKG_UNIT_QTY */
	public List l_h_PKG_UNIT_QTY = null;

	/** �� 37 List�ϐ��F l_h_UNIT_QTY_TYP */
	public List l_h_UNIT_QTY_TYP = null;

	/** �� 38 List�ϐ��F l_h_ODR_LT */
	public List l_h_ODR_LT = null;

	/** �� 39 List�ϐ��F l_h_FIXED_LT */
	public List l_h_FIXED_LT = null;

	/** �� 40 List�ϐ��F l_h_PROP_LT */
	public List l_h_PROP_LT = null;

	/** �� 41 List�ϐ��F l_h_SAFETY_LT */
	public List l_h_SAFETY_LT = null;

	/** �� 42 List�ϐ��F l_h_ISSUE_LT */
	public List l_h_ISSUE_LT = null;

	/** �� 43 List�ϐ��F l_h_PROP_LOT_SIZE */
	public List l_h_PROP_LOT_SIZE = null;

	/** �� 44 List�ϐ��F l_h_ITEM_SPOIL */
	public List l_h_ITEM_SPOIL = null;

	/** �� 45 List�ϐ��F l_h_SAFETY_STOCK */
	public List l_h_SAFETY_STOCK = null;

	/** �� 46 List�ϐ��F l_h_LOT_SIZING_TYP */
	public List l_h_LOT_SIZING_TYP = null;

	/** �� 47 List�ϐ��F l_h_MAX_PERIOD */
	public List l_h_MAX_PERIOD = null;

	/** �� 48 List�ϐ��F l_h_MAX_ODR_QTY */
	public List l_h_MAX_ODR_QTY = null;

	/** �� 49 List�ϐ��F l_h_ODR_POINT */
	public List l_h_ODR_POINT = null;

	/** �� 50 List�ϐ��F l_h_FIXED_ODR_QTY */
	public List l_h_FIXED_ODR_QTY = null;

	/** �� 51 List�ϐ��F l_h_MIN_ODR_QTY */
	public List l_h_MIN_ODR_QTY = null;

	/** �� 52 List�ϐ��F l_h_MUL_ODR_QTY */
	public List l_h_MUL_ODR_QTY = null;

	/** �� 53 List�ϐ��F l_h_ISSUE_TYP */
	public List l_h_ISSUE_TYP = null;

	/** �� 54 List�ϐ��F l_h_MPS_FLG */
	public List l_h_MPS_FLG = null;

	/** �� 55 List�ϐ��F l_h_ACPT_INSPC_TYP */
	public List l_h_ACPT_INSPC_TYP = null;

	/** �� 56 List�ϐ��F l_h_PRODUCT_TYP */
	public List l_h_PRODUCT_TYP = null;

	/** �� 57 List�ϐ��F l_h_CLASIFICATION_CD */
	public List l_h_CLASIFICATION_CD = null;

	/** �� 58 List�ϐ��F l_h_UNIT_WEIGHT */
	public List l_h_UNIT_WEIGHT = null;

	/** �� 59 List�ϐ��F l_h_ABC_TYP */
	public List l_h_ABC_TYP = null;

	/** �� 60 List�ϐ��F l_h_OPR_RSLT_TYP */
	public List l_h_OPR_RSLT_TYP = null;

	/** �� 61 List�ϐ��F l_h_SPL_ITEM_TYP */
	public List l_h_SPL_ITEM_TYP = null;

	/** �� 62 List�ϐ��F l_h_TAX_CD */
	public List l_h_TAX_CD = null;

	/** �� 63 List�ϐ��F l_h_CAL_NO */
	public List l_h_CAL_NO = null;

	/** �� 64 List�ϐ��F l_h_MANHOUR_TYP */
	public List l_h_MANHOUR_TYP = null;

	/** �� 65 List�ϐ��F l_h_DEPO_TYP */
	public List l_h_DEPO_TYP = null;

	/** �� 66 List�ϐ��F l_h_LOT_CTRL_FLG */
	public List l_h_LOT_CTRL_FLG = null;

	/** �� 67 List�ϐ��F l_h_LOT_NUMBERING_TYP */
	public List l_h_LOT_NUMBERING_TYP = null;

	/** �� 68 List�ϐ��F l_h_BEST_BEFORE_YEAR */
	public List l_h_BEST_BEFORE_YEAR = null;

	/** �� 69 List�ϐ��F l_h_BEST_BEFORE_MONTH */
	public List l_h_BEST_BEFORE_MONTH = null;

	/** �� 70 List�ϐ��F l_h_BEST_BEFORE_DAY */
	public List l_h_BEST_BEFORE_DAY = null;

	/** �� 71 List�ϐ��F l_h_DEPT_CD */
	public List l_h_DEPT_CD = null;

	/** �� 72 List�ϐ��F l_h_PJ_CD */
	public List l_h_PJ_CD = null;

	/** �� 73 List�ϐ��F l_h_SEG_CONTENTS_1 */
	public List l_h_SEG_CONTENTS_1 = null;

	/** �� 74 List�ϐ��F l_h_SEG_CONTENTS_2 */
	public List l_h_SEG_CONTENTS_2 = null;

	/** �� 75 List�ϐ��F l_h_SEG_CONTENTS_3 */
	public List l_h_SEG_CONTENTS_3 = null;

	/** �� 76 List�ϐ��F l_h_SEG_CONTENTS_4 */
	public List l_h_SEG_CONTENTS_4 = null;

	/** �� 77 List�ϐ��F l_h_REMARK1 */
	public List l_h_REMARK1 = null;

	/** �� 78 List�ϐ��F l_h_REMARK2 */
	public List l_h_REMARK2 = null;

	/** �� 79 List�ϐ��F l_h_ITEM_CLASS_01_CD */
	public List l_h_ITEM_CLASS_01_CD = null;

	/** �� 80 List�ϐ��F l_h_ITEM_CLASS_02_CD */
	public List l_h_ITEM_CLASS_02_CD = null;

	/** �� 81 List�ϐ��F l_h_ITEM_CLASS_03_CD */
	public List l_h_ITEM_CLASS_03_CD = null;

	/** �� 82 List�ϐ��F l_h_ITEM_CLASS_04_CD */
	public List l_h_ITEM_CLASS_04_CD = null;

	/** �� 83 List�ϐ��F l_h_ITEM_CLASS_05_CD */
	public List l_h_ITEM_CLASS_05_CD = null;

	/** �� 84 List�ϐ��F l_h_ITEM_CLASS_06_CD */
	public List l_h_ITEM_CLASS_06_CD = null;

	/** �� 85 List�ϐ��F l_h_ITEM_CLASS_07_CD */
	public List l_h_ITEM_CLASS_07_CD = null;

	/** �� 86 List�ϐ��F l_h_ITEM_CLASS_08_CD */
	public List l_h_ITEM_CLASS_08_CD = null;

	/** �� 87 List�ϐ��F l_h_ITEM_CLASS_09_CD */
	public List l_h_ITEM_CLASS_09_CD = null;

	/** �� 88 List�ϐ��F l_h_ITEM_CLASS_10_CD */
	public List l_h_ITEM_CLASS_10_CD = null;

	/** �� 89 List�ϐ��F l_h_ITEM_CLASS_11_CD */
	public List l_h_ITEM_CLASS_11_CD = null;

	/** �� 90 List�ϐ��F l_h_ITEM_CLASS_12_CD */
	public List l_h_ITEM_CLASS_12_CD = null;

	/** �� 91 List�ϐ��F l_readTAX_CD */
	public List l_readTAX_CD = null;

	/** �� 92 List�ϐ��F l_setTAXCD */
	public List l_setTAXCD = null;

	/** �� 93 List�ϐ��F l_readITEM_CD */
	public List l_readITEM_CD = null;

	/** �� 94 List�ϐ��F l_setITEM_CD */
	public List l_setITEM_CD = null;

	/** �� 95 List�ϐ��F l_readVEND_CD */
	public List l_readVEND_CD = null;

	/** �� 96 List�ϐ��F l_setVEND_CD */
	public List l_setVEND_CD = null;

	/** �� 97 List�ϐ��F l_readPLANT_CD */
	public List l_readPLANT_CD = null;

	/** �� 98 List�ϐ��F l_readSUM_PROP_LT */
	public List l_readSUM_PROP_LT = null;

	/** �� 99 List�ϐ��F l_readSUM_FIXED_LT */
	public List l_readSUM_FIXED_LT = null;

	/** �� 100 List�ϐ��F l_readMRP_ITEM_CD */
	public List l_readMRP_ITEM_CD = null;

	/** �� 101 List�ϐ��F l_readMRP_ODR_TYP */
	public List l_readMRP_ODR_TYP = null;

	/** �� 102 List�ϐ��F l_setMRP_ITEM_CD */
	public List l_setMRP_ITEM_CD = null;

	/** �� 103 List�ϐ��F l_readMRP_ODR_ITEM_CD */
	public List l_readMRP_ODR_ITEM_CD = null;

	/** �� 104 List�ϐ��F l_setMRP_ODR_ITEM_CD */
	public List l_setMRP_ODR_ITEM_CD = null;

	/** �� 105 List�ϐ��F l_C_ITEM_CD */
	public List l_C_ITEM_CD = null;

	/** �� 106 List�ϐ��F l_C_ITEM_NAME */
	public List l_C_ITEM_NAME = null;

	/** �� 107 List�ϐ��F l_C_DRAW_CD */
	public List l_C_DRAW_CD = null;

	/** �� 108 List�ϐ��F l_C_SPEC */
	public List l_C_SPEC = null;

	/** �� 109 List�ϐ��F l_C_HIGH_LEVEL_NO */
	public List l_C_HIGH_LEVEL_NO = null;

	/** �� 110 List�ϐ��F l_C_MRP_ODR_TYP */
	public List l_C_MRP_ODR_TYP = null;

	/** �� 111 List�ϐ��F l_C_OUTSIDE_TYP */
	public List l_C_OUTSIDE_TYP = null;

	/** �� 112 List�ϐ��F l_C_STOCK_UNIT_FLG */
	public List l_C_STOCK_UNIT_FLG = null;

	/** �� 113 List�ϐ��F l_C_STOCK_UNIT */
	public List l_C_STOCK_UNIT = null;

	/** �� 114 List�ϐ��F l_C_PKG_UNIT */
	public List l_C_PKG_UNIT = null;

	/** �� 115 List�ϐ��F l_C_PKG_UNIT_QTY */
	public List l_C_PKG_UNIT_QTY = null;

	/** �� 116 List�ϐ��F l_C_UNIT_QTY_TYP */
	public List l_C_UNIT_QTY_TYP = null;

	/** �� 117 List�ϐ��F l_C_ODR_LT */
	public List l_C_ODR_LT = null;

	/** �� 118 List�ϐ��F l_C_FIXED_LT */
	public List l_C_FIXED_LT = null;

	/** �� 119 List�ϐ��F l_C_PROP_LT */
	public List l_C_PROP_LT = null;

	/** �� 120 List�ϐ��F l_C_SAFETY_LT */
	public List l_C_SAFETY_LT = null;

	/** �� 121 List�ϐ��F l_C_ISSUE_LT */
	public List l_C_ISSUE_LT = null;

	/** �� 122 List�ϐ��F l_C_PROP_LOT_SIZE */
	public List l_C_PROP_LOT_SIZE = null;

	/** �� 123 List�ϐ��F l_C_ITEM_SPOIL */
	public List l_C_ITEM_SPOIL = null;

	/** �� 124 List�ϐ��F l_C_SAFETY_STOCK */
	public List l_C_SAFETY_STOCK = null;

	/** �� 125 List�ϐ��F l_C_LOT_SIZING_TYP */
	public List l_C_LOT_SIZING_TYP = null;

	/** �� 126 List�ϐ��F l_C_MAX_PERIOD */
	public List l_C_MAX_PERIOD = null;

	/** �� 127 List�ϐ��F l_C_MAX_ODR_QTY */
	public List l_C_MAX_ODR_QTY = null;

	/** �� 128 List�ϐ��F l_C_ODR_POINT */
	public List l_C_ODR_POINT = null;

	/** �� 129 List�ϐ��F l_C_FIXED_ODR_QTY */
	public List l_C_FIXED_ODR_QTY = null;

	/** �� 130 List�ϐ��F l_C_MIN_ODR_QTY */
	public List l_C_MIN_ODR_QTY = null;

	/** �� 131 List�ϐ��F l_C_MUL_ODR_QTY */
	public List l_C_MUL_ODR_QTY = null;

	/** �� 132 List�ϐ��F l_C_ISSUE_TYP */
	public List l_C_ISSUE_TYP = null;

	/** �� 133 List�ϐ��F l_C_MPS_FLG */
	public List l_C_MPS_FLG = null;

	/** �� 134 List�ϐ��F l_C_ACPT_INSPC_TYP */
	public List l_C_ACPT_INSPC_TYP = null;

	/** �� 135 List�ϐ��F l_C_PRODUCT_TYP */
	public List l_C_PRODUCT_TYP = null;

	/** �� 136 List�ϐ��F l_C_CLASIFICATION_CD */
	public List l_C_CLASIFICATION_CD = null;

	/** �� 137 List�ϐ��F l_C_UNIT_WEIGHT */
	public List l_C_UNIT_WEIGHT = null;

	/** �� 138 List�ϐ��F l_C_ABC_TYP */
	public List l_C_ABC_TYP = null;

	/** �� 139 List�ϐ��F l_C_OPR_RSLT_TYP */
	public List l_C_OPR_RSLT_TYP = null;

	/** �� 140 List�ϐ��F l_C_SPL_ITEM_TYP */
	public List l_C_SPL_ITEM_TYP = null;

	/** �� 141 List�ϐ��F l_C_TAX_CD */
	public List l_C_TAX_CD = null;

	/** �� 142 List�ϐ��F l_C_CAL_NO */
	public List l_C_CAL_NO = null;

	/** �� 143 List�ϐ��F l_C_MANHOUR_TYP */
	public List l_C_MANHOUR_TYP = null;

	/** �� 144 List�ϐ��F l_C_DEPO_TYP */
	public List l_C_DEPO_TYP = null;

	/** �� 145 List�ϐ��F l_C_LOT_CTRL_FLG */
	public List l_C_LOT_CTRL_FLG = null;

	/** �� 146 List�ϐ��F l_C_LOT_NUMBERING_TYP */
	public List l_C_LOT_NUMBERING_TYP = null;

	/** �� 147 List�ϐ��F l_C_BEST_BEFORE_YEAR */
	public List l_C_BEST_BEFORE_YEAR = null;

	/** �� 148 List�ϐ��F l_C_BEST_BEFORE_MONTH */
	public List l_C_BEST_BEFORE_MONTH = null;

	/** �� 149 List�ϐ��F l_C_BEST_BEFORE_DAY */
	public List l_C_BEST_BEFORE_DAY = null;

	/** �� 150 List�ϐ��F l_C_REMARK1 */
	public List l_C_REMARK1 = null;

	/** �� 151 List�ϐ��F l_C_REMARK2 */
	public List l_C_REMARK2 = null;

	/** �� 152 List�ϐ��F l_C_ITEM_CLASS_01_CD */
	public List l_C_ITEM_CLASS_01_CD = null;

	/** �� 153 List�ϐ��F l_C_ITEM_CLASS_02_CD */
	public List l_C_ITEM_CLASS_02_CD = null;

	/** �� 154 List�ϐ��F l_C_ITEM_CLASS_03_CD */
	public List l_C_ITEM_CLASS_03_CD = null;

	/** �� 155 List�ϐ��F l_C_ITEM_CLASS_04_CD */
	public List l_C_ITEM_CLASS_04_CD = null;

	/** �� 156 List�ϐ��F l_C_ITEM_CLASS_05_CD */
	public List l_C_ITEM_CLASS_05_CD = null;

	/** �� 157 List�ϐ��F l_C_ITEM_CLASS_06_CD */
	public List l_C_ITEM_CLASS_06_CD = null;

	/** �� 158 List�ϐ��F l_C_ITEM_CLASS_07_CD */
	public List l_C_ITEM_CLASS_07_CD = null;

	/** �� 159 List�ϐ��F l_C_ITEM_CLASS_08_CD */
	public List l_C_ITEM_CLASS_08_CD = null;

	/** �� 160 List�ϐ��F l_C_ITEM_CLASS_09_CD */
	public List l_C_ITEM_CLASS_09_CD = null;

	/** �� 161 List�ϐ��F l_C_ITEM_CLASS_10_CD */
	public List l_C_ITEM_CLASS_10_CD = null;

	/** �� 162 List�ϐ��F l_C_ITEM_CLASS_11_CD */
	public List l_C_ITEM_CLASS_11_CD = null;

	/** �� 163 List�ϐ��F l_C_ITEM_CLASS_12_CD */
	public List l_C_ITEM_CLASS_12_CD = null;

	/** �� 164 List�ϐ��F l_C_DEPT_CD */
	public List l_C_DEPT_CD = null;

	/** �� 165 List�ϐ��F l_C_PJ_CD */
	public List l_C_PJ_CD = null;

	/** �� 166 List�ϐ��F l_C_SEG_CONTENTS_1 */
	public List l_C_SEG_CONTENTS_1 = null;

	/** �� 167 List�ϐ��F l_C_SEG_CONTENTS_2 */
	public List l_C_SEG_CONTENTS_2 = null;

	/** �� 168 List�ϐ��F l_C_SEG_CONTENTS_3 */
	public List l_C_SEG_CONTENTS_3 = null;

	/** �� 169 List�ϐ��F l_C_SEG_CONTENTS_4 */
	public List l_C_SEG_CONTENTS_4 = null;

	/** �� 170 List�ϐ��F l_C_setITEM_CD */
	public List l_C_setITEM_CD = null;

	/** �� 171 List�ϐ��F l_readT_OD_ITEM_CD */
	public List l_readT_OD_ITEM_CD = null;

	/** �� 172 List�ϐ��F l_setT_OD_ITEM_CD */
	public List l_setT_OD_ITEM_CD = null;

	/** �� 173 List�ϐ��F l_readM_PS_ITEM_CD */
	public List l_readM_PS_ITEM_CD = null;

	/** �� 174 List�ϐ��F l_setM_PS_ITEM_CD */
	public List l_setM_PS_ITEM_CD = null;

	/** �� 175 List�ϐ��F l_readT_ITEM_STOCK_ITEM_CD */
	public List l_readT_ITEM_STOCK_ITEM_CD = null;

	/** �� 176 List�ϐ��F l_readT_ITEM_STOCK_STOCK_ON_HAND_QTY */
	public List l_readT_ITEM_STOCK_STOCK_ON_HAND_QTY = null;

	/** �� 177 List�ϐ��F l_setT_ITEM_STOCK_ITEM_CD */
	public List l_setT_ITEM_STOCK_ITEM_CD = null;

	/** �� 178 List�ϐ��F l_readT_JOB_ODR_CD_ITEM_CD */
	public List l_readT_JOB_ODR_CD_ITEM_CD = null;

	/** �� 179 List�ϐ��F l_readT_JOB_ODR_CD_STOCK_ON_HAND_QTY */
	public List l_readT_JOB_ODR_CD_STOCK_ON_HAND_QTY = null;

	/** �� 180 List�ϐ��F l_setT_JOB_ODR_CD_ITEM_CD */
	public List l_setT_JOB_ODR_CD_ITEM_CD = null;

	/** �� 181 List�ϐ��F l_readT_RLSD_P_ITEM_CD */
	public List l_readT_RLSD_P_ITEM_CD = null;

	/** �� 182 List�ϐ��F l_setT_RLSD_P_ITEM_CD */
	public List l_setT_RLSD_P_ITEM_CD = null;

	/** �� 183 List�ϐ��F l_readT_WORK_IN_ITEM_CD */
	public List l_readT_WORK_IN_ITEM_CD = null;

	/** �� 184 List�ϐ��F l_setT_WORK_IN_ITEM_CD */
	public List l_setT_WORK_IN_ITEM_CD = null;

	/** �� 185 List�ϐ��F l_readT_JOB_ODR_ITEM_CD */
	public List l_readT_JOB_ODR_ITEM_CD = null;

	/** �� 186 List�ϐ��F l_setT_JOB_ODR_ITEM_CD */
	public List l_setT_JOB_ODR_ITEM_CD = null;

	/** �� 187 List�ϐ��F l_readT_OPR_RSLT_ITEM_CD */
	public List l_readT_OPR_RSLT_ITEM_CD = null;

	/** �� 188 List�ϐ��F l_setT_OPR_RSLT_ITEM_CD */
	public List l_setT_OPR_RSLT_ITEM_CD = null;

	/** �� 189 List�ϐ��F l_setM_WH_ITEM_CD */
	public List l_setM_WH_ITEM_CD = null;

	/** �� 190 List�ϐ��F l_setM_WH_WH_CD */
	public List l_setM_WH_WH_CD = null;

	/** �� 191 List�ϐ��F l_setM_WH_PLANT_CD */
	public List l_setM_WH_PLANT_CD = null;

	/** �� 192 List�ϐ��F l_setM_WH_WH_REF_NO */
	public List l_setM_WH_WH_REF_NO = null;

	/** �� 193 List�ϐ��F l_readM_WH_ITEM_CD */
	public List l_readM_WH_ITEM_CD = null;

	/** �� 194 List�ϐ��F l_readM_WH_WH_CD */
	public List l_readM_WH_WH_CD = null;

	/** �� 195 List�ϐ��F l_readM_CAL_H_CAL_NO */
	public List l_readM_CAL_H_CAL_NO = null;

	/** �� 196 List�ϐ��F l_setM_CAL_H_CAL_NO */
	public List l_setM_CAL_H_CAL_NO = null;

	/** �� 197 List�ϐ��F l_readCLASS_CD1 */
	public List l_readCLASS_CD1 = null;

	/** �� 198 List�ϐ��F l_setCLASS_CD2 */
	public List l_setCLASS_CD2 = null;

	/** �� 199 List�ϐ��F l_setCLASS_CD3 */
	public List l_setCLASS_CD3 = null;

	/** �� 200 List�ϐ��F l_readM_ITEM_STOCK_UNIT */
	public List l_readM_ITEM_STOCK_UNIT = null;

	/** �� 201 List�ϐ��F l_readM_ITEM_LOT_CTRL_FLG */
	public List l_readM_ITEM_LOT_CTRL_FLG = null;

	/** �� 202 List�ϐ��F l_readM_ITEM_MRP_ODR_TYP */
	public List l_readM_ITEM_MRP_ODR_TYP = null;

	/** �� 203 List�ϐ��F l_setM_ITEM_ITEM_CD */
	public List l_setM_ITEM_ITEM_CD = null;

	/** �� 204 List�ϐ��F l_setDISPLAY_NAME */
	public List l_setDISPLAY_NAME = null;

	/** �� 205 List�ϐ��F l_VALUE */
	public List l_VALUE = null;

	/** �� 206 List�ϐ��F l_DEPT_CD */
	public List l_DEPT_CD = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getrdoInsert() { return m_rdoInsert; }
	public String getrdoUpdate() { return m_rdoUpdate; }
	public String getrdoDelete() { return m_rdoDelete; }
	public String getFileName() { return m_FileName; }
	public String getDO_CHK() { return m_DO_CHK; }
	public String getERROR_IN() { return m_ERROR_IN; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getERR_CTR_NM() { return m_ERR_CTR_NM; }
	public String getERR_INFO() { return m_ERR_INFO; }
	public String geth_SYORI_KUBUN() { return m_h_SYORI_KUBUN; }
	public String geth_WH_CD() { return m_h_WH_CD; }
	public String getCANCEL_FILE() { return m_CANCEL_FILE; }
	public String getJUDGMENT_TXT() { return m_JUDGMENT_TXT; }
	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getERR_TYP() { return m_ERR_TYP; }
	public String getw_COLUMN_FLG() { return m_w_COLUMN_FLG; }
	public String getOUT_ITEM_CD() { return m_OUT_ITEM_CD; }
	public String getreadNAME() { return m_readNAME; }
	public String getreadVALUE() { return m_readVALUE; }
	public String getDISPLAY_NAME() { return m_DISPLAY_NAME; }
	public String getsetNAME() { return m_setNAME; }
	public String getsetVALUE() { return m_setVALUE; }
	public String getreadSYS_P_NAME() { return m_readSYS_P_NAME; }
	public String getreadSYS_P_VALUE() { return m_readSYS_P_VALUE; }
	public String getsetSYS_P_NAME() { return m_setSYS_P_NAME; }
	public String geth_ITEM_CD() { return m_h_ITEM_CD; }
	public String geth_ITEM_NAME() { return m_h_ITEM_NAME; }
	public String geth_DRAW_CD() { return m_h_DRAW_CD; }
	public String geth_SPEC() { return m_h_SPEC; }
	public String geth_HIGH_LEVEL_NO() { return m_h_HIGH_LEVEL_NO; }
	public String geth_MRP_ODR_TYP() { return m_h_MRP_ODR_TYP; }
	public String geth_OUTSIDE_TYP() { return m_h_OUTSIDE_TYP; }
	public String geth_STOCK_UNIT_FLG() { return m_h_STOCK_UNIT_FLG; }
	public String geth_STOCK_UNIT() { return m_h_STOCK_UNIT; }
	public String geth_PKG_UNIT() { return m_h_PKG_UNIT; }
	public String geth_PKG_UNIT_QTY() { return m_h_PKG_UNIT_QTY; }
	public String geth_UNIT_QTY_TYP() { return m_h_UNIT_QTY_TYP; }
	public String geth_ODR_LT() { return m_h_ODR_LT; }
	public String geth_FIXED_LT() { return m_h_FIXED_LT; }
	public String geth_PROP_LT() { return m_h_PROP_LT; }
	public String geth_SAFETY_LT() { return m_h_SAFETY_LT; }
	public String geth_ISSUE_LT() { return m_h_ISSUE_LT; }
	public String geth_PROP_LOT_SIZE() { return m_h_PROP_LOT_SIZE; }
	public String geth_ITEM_SPOIL() { return m_h_ITEM_SPOIL; }
	public String geth_SAFETY_STOCK() { return m_h_SAFETY_STOCK; }
	public String geth_LOT_SIZING_TYP() { return m_h_LOT_SIZING_TYP; }
	public String geth_MAX_PERIOD() { return m_h_MAX_PERIOD; }
	public String geth_MAX_ODR_QTY() { return m_h_MAX_ODR_QTY; }
	public String geth_ODR_POINT() { return m_h_ODR_POINT; }
	public String geth_FIXED_ODR_QTY() { return m_h_FIXED_ODR_QTY; }
	public String geth_MIN_ODR_QTY() { return m_h_MIN_ODR_QTY; }
	public String geth_MUL_ODR_QTY() { return m_h_MUL_ODR_QTY; }
	public String geth_ISSUE_TYP() { return m_h_ISSUE_TYP; }
	public String geth_MPS_FLG() { return m_h_MPS_FLG; }
	public String geth_ACPT_INSPC_TYP() { return m_h_ACPT_INSPC_TYP; }
	public String geth_PRODUCT_TYP() { return m_h_PRODUCT_TYP; }
	public String geth_CLASIFICATION_CD() { return m_h_CLASIFICATION_CD; }
	public String geth_UNIT_WEIGHT() { return m_h_UNIT_WEIGHT; }
	public String geth_ABC_TYP() { return m_h_ABC_TYP; }
	public String geth_OPR_RSLT_TYP() { return m_h_OPR_RSLT_TYP; }
	public String geth_SPL_ITEM_TYP() { return m_h_SPL_ITEM_TYP; }
	public String geth_TAX_CD() { return m_h_TAX_CD; }
	public String geth_CAL_NO() { return m_h_CAL_NO; }
	public String geth_MANHOUR_TYP() { return m_h_MANHOUR_TYP; }
	public String geth_DEPO_TYP() { return m_h_DEPO_TYP; }
	public String geth_LOT_CTRL_FLG() { return m_h_LOT_CTRL_FLG; }
	public String geth_LOT_NUMBERING_TYP() { return m_h_LOT_NUMBERING_TYP; }
	public String geth_BEST_BEFORE_YEAR() { return m_h_BEST_BEFORE_YEAR; }
	public String geth_BEST_BEFORE_MONTH() { return m_h_BEST_BEFORE_MONTH; }
	public String geth_BEST_BEFORE_DAY() { return m_h_BEST_BEFORE_DAY; }
	public String geth_DEPT_CD() { return m_h_DEPT_CD; }
	public String geth_PJ_CD() { return m_h_PJ_CD; }
	public String geth_SEG_CONTENTS_1() { return m_h_SEG_CONTENTS_1; }
	public String geth_SEG_CONTENTS_2() { return m_h_SEG_CONTENTS_2; }
	public String geth_SEG_CONTENTS_3() { return m_h_SEG_CONTENTS_3; }
	public String geth_SEG_CONTENTS_4() { return m_h_SEG_CONTENTS_4; }
	public String geth_REMARK1() { return m_h_REMARK1; }
	public String geth_REMARK2() { return m_h_REMARK2; }
	public String geth_ITEM_CLASS_01_CD() { return m_h_ITEM_CLASS_01_CD; }
	public String geth_ITEM_CLASS_02_CD() { return m_h_ITEM_CLASS_02_CD; }
	public String geth_ITEM_CLASS_03_CD() { return m_h_ITEM_CLASS_03_CD; }
	public String geth_ITEM_CLASS_04_CD() { return m_h_ITEM_CLASS_04_CD; }
	public String geth_ITEM_CLASS_05_CD() { return m_h_ITEM_CLASS_05_CD; }
	public String geth_ITEM_CLASS_06_CD() { return m_h_ITEM_CLASS_06_CD; }
	public String geth_ITEM_CLASS_07_CD() { return m_h_ITEM_CLASS_07_CD; }
	public String geth_ITEM_CLASS_08_CD() { return m_h_ITEM_CLASS_08_CD; }
	public String geth_ITEM_CLASS_09_CD() { return m_h_ITEM_CLASS_09_CD; }
	public String geth_ITEM_CLASS_10_CD() { return m_h_ITEM_CLASS_10_CD; }
	public String geth_ITEM_CLASS_11_CD() { return m_h_ITEM_CLASS_11_CD; }
	public String geth_ITEM_CLASS_12_CD() { return m_h_ITEM_CLASS_12_CD; }
	public String getreadTAX_CD() { return m_readTAX_CD; }
	public String getsetTAXCD() { return m_setTAXCD; }
	public String getreadITEM_CD() { return m_readITEM_CD; }
	public String getsetITEM_CD() { return m_setITEM_CD; }
	public String getreadVEND_CD() { return m_readVEND_CD; }
	public String getsetVEND_CD() { return m_setVEND_CD; }
	public String getreadPLANT_CD() { return m_readPLANT_CD; }
	public Integer getreadSUM_PROP_LT() { return m_readSUM_PROP_LT; }
	public Integer getreadSUM_FIXED_LT() { return m_readSUM_FIXED_LT; }
	public String getreadMRP_ITEM_CD() { return m_readMRP_ITEM_CD; }
	public Integer getreadMRP_ODR_TYP() { return m_readMRP_ODR_TYP; }
	public String getsetMRP_ITEM_CD() { return m_setMRP_ITEM_CD; }
	public String getreadMRP_ODR_ITEM_CD() { return m_readMRP_ODR_ITEM_CD; }
	public String getsetMRP_ODR_ITEM_CD() { return m_setMRP_ODR_ITEM_CD; }
	public String getC_ITEM_CD() { return m_C_ITEM_CD; }
	public String getC_ITEM_NAME() { return m_C_ITEM_NAME; }
	public String getC_DRAW_CD() { return m_C_DRAW_CD; }
	public String getC_SPEC() { return m_C_SPEC; }
	public String getC_HIGH_LEVEL_NO() { return m_C_HIGH_LEVEL_NO; }
	public String getC_MRP_ODR_TYP() { return m_C_MRP_ODR_TYP; }
	public String getC_OUTSIDE_TYP() { return m_C_OUTSIDE_TYP; }
	public String getC_STOCK_UNIT_FLG() { return m_C_STOCK_UNIT_FLG; }
	public String getC_STOCK_UNIT() { return m_C_STOCK_UNIT; }
	public String getC_PKG_UNIT() { return m_C_PKG_UNIT; }
	public String getC_PKG_UNIT_QTY() { return m_C_PKG_UNIT_QTY; }
	public String getC_UNIT_QTY_TYP() { return m_C_UNIT_QTY_TYP; }
	public String getC_ODR_LT() { return m_C_ODR_LT; }
	public String getC_FIXED_LT() { return m_C_FIXED_LT; }
	public String getC_PROP_LT() { return m_C_PROP_LT; }
	public String getC_SAFETY_LT() { return m_C_SAFETY_LT; }
	public String getC_ISSUE_LT() { return m_C_ISSUE_LT; }
	public String getC_PROP_LOT_SIZE() { return m_C_PROP_LOT_SIZE; }
	public String getC_ITEM_SPOIL() { return m_C_ITEM_SPOIL; }
	public String getC_SAFETY_STOCK() { return m_C_SAFETY_STOCK; }
	public String getC_LOT_SIZING_TYP() { return m_C_LOT_SIZING_TYP; }
	public String getC_MAX_PERIOD() { return m_C_MAX_PERIOD; }
	public String getC_MAX_ODR_QTY() { return m_C_MAX_ODR_QTY; }
	public String getC_ODR_POINT() { return m_C_ODR_POINT; }
	public String getC_FIXED_ODR_QTY() { return m_C_FIXED_ODR_QTY; }
	public String getC_MIN_ODR_QTY() { return m_C_MIN_ODR_QTY; }
	public String getC_MUL_ODR_QTY() { return m_C_MUL_ODR_QTY; }
	public String getC_ISSUE_TYP() { return m_C_ISSUE_TYP; }
	public String getC_MPS_FLG() { return m_C_MPS_FLG; }
	public String getC_ACPT_INSPC_TYP() { return m_C_ACPT_INSPC_TYP; }
	public String getC_PRODUCT_TYP() { return m_C_PRODUCT_TYP; }
	public String getC_CLASIFICATION_CD() { return m_C_CLASIFICATION_CD; }
	public String getC_UNIT_WEIGHT() { return m_C_UNIT_WEIGHT; }
	public String getC_ABC_TYP() { return m_C_ABC_TYP; }
	public String getC_OPR_RSLT_TYP() { return m_C_OPR_RSLT_TYP; }
	public String getC_SPL_ITEM_TYP() { return m_C_SPL_ITEM_TYP; }
	public String getC_TAX_CD() { return m_C_TAX_CD; }
	public String getC_CAL_NO() { return m_C_CAL_NO; }
	public String getC_MANHOUR_TYP() { return m_C_MANHOUR_TYP; }
	public String getC_DEPO_TYP() { return m_C_DEPO_TYP; }
	public String getC_LOT_CTRL_FLG() { return m_C_LOT_CTRL_FLG; }
	public String getC_LOT_NUMBERING_TYP() { return m_C_LOT_NUMBERING_TYP; }
	public String getC_BEST_BEFORE_YEAR() { return m_C_BEST_BEFORE_YEAR; }
	public String getC_BEST_BEFORE_MONTH() { return m_C_BEST_BEFORE_MONTH; }
	public String getC_BEST_BEFORE_DAY() { return m_C_BEST_BEFORE_DAY; }
	public String getC_REMARK1() { return m_C_REMARK1; }
	public String getC_REMARK2() { return m_C_REMARK2; }
	public String getC_ITEM_CLASS_01_CD() { return m_C_ITEM_CLASS_01_CD; }
	public String getC_ITEM_CLASS_02_CD() { return m_C_ITEM_CLASS_02_CD; }
	public String getC_ITEM_CLASS_03_CD() { return m_C_ITEM_CLASS_03_CD; }
	public String getC_ITEM_CLASS_04_CD() { return m_C_ITEM_CLASS_04_CD; }
	public String getC_ITEM_CLASS_05_CD() { return m_C_ITEM_CLASS_05_CD; }
	public String getC_ITEM_CLASS_06_CD() { return m_C_ITEM_CLASS_06_CD; }
	public String getC_ITEM_CLASS_07_CD() { return m_C_ITEM_CLASS_07_CD; }
	public String getC_ITEM_CLASS_08_CD() { return m_C_ITEM_CLASS_08_CD; }
	public String getC_ITEM_CLASS_09_CD() { return m_C_ITEM_CLASS_09_CD; }
	public String getC_ITEM_CLASS_10_CD() { return m_C_ITEM_CLASS_10_CD; }
	public String getC_ITEM_CLASS_11_CD() { return m_C_ITEM_CLASS_11_CD; }
	public String getC_ITEM_CLASS_12_CD() { return m_C_ITEM_CLASS_12_CD; }
	public String getC_DEPT_CD() { return m_C_DEPT_CD; }
	public String getC_PJ_CD() { return m_C_PJ_CD; }
	public String getC_SEG_CONTENTS_1() { return m_C_SEG_CONTENTS_1; }
	public String getC_SEG_CONTENTS_2() { return m_C_SEG_CONTENTS_2; }
	public String getC_SEG_CONTENTS_3() { return m_C_SEG_CONTENTS_3; }
	public String getC_SEG_CONTENTS_4() { return m_C_SEG_CONTENTS_4; }
	public String getC_setITEM_CD() { return m_C_setITEM_CD; }
	public String getreadT_OD_ITEM_CD() { return m_readT_OD_ITEM_CD; }
	public String getsetT_OD_ITEM_CD() { return m_setT_OD_ITEM_CD; }
	public String getreadM_PS_ITEM_CD() { return m_readM_PS_ITEM_CD; }
	public String getsetM_PS_ITEM_CD() { return m_setM_PS_ITEM_CD; }
	public String getreadT_ITEM_STOCK_ITEM_CD() { return m_readT_ITEM_STOCK_ITEM_CD; }
	public String getreadT_ITEM_STOCK_STOCK_ON_HAND_QTY() { return m_readT_ITEM_STOCK_STOCK_ON_HAND_QTY; }
	public String getsetT_ITEM_STOCK_ITEM_CD() { return m_setT_ITEM_STOCK_ITEM_CD; }
	public String getreadT_JOB_ODR_CD_ITEM_CD() { return m_readT_JOB_ODR_CD_ITEM_CD; }
	public String getreadT_JOB_ODR_CD_STOCK_ON_HAND_QTY() { return m_readT_JOB_ODR_CD_STOCK_ON_HAND_QTY; }
	public String getsetT_JOB_ODR_CD_ITEM_CD() { return m_setT_JOB_ODR_CD_ITEM_CD; }
	public String getreadT_RLSD_P_ITEM_CD() { return m_readT_RLSD_P_ITEM_CD; }
	public String getsetT_RLSD_P_ITEM_CD() { return m_setT_RLSD_P_ITEM_CD; }
	public String getreadT_WORK_IN_ITEM_CD() { return m_readT_WORK_IN_ITEM_CD; }
	public String getsetT_WORK_IN_ITEM_CD() { return m_setT_WORK_IN_ITEM_CD; }
	public String getreadT_JOB_ODR_ITEM_CD() { return m_readT_JOB_ODR_ITEM_CD; }
	public String getsetT_JOB_ODR_ITEM_CD() { return m_setT_JOB_ODR_ITEM_CD; }
	public String getreadT_OPR_RSLT_ITEM_CD() { return m_readT_OPR_RSLT_ITEM_CD; }
	public String getsetT_OPR_RSLT_ITEM_CD() { return m_setT_OPR_RSLT_ITEM_CD; }
	public String getsetM_WH_ITEM_CD() { return m_setM_WH_ITEM_CD; }
	public String getsetM_WH_WH_CD() { return m_setM_WH_WH_CD; }
	public String getsetM_WH_PLANT_CD() { return m_setM_WH_PLANT_CD; }
	public String getsetM_WH_WH_REF_NO() { return m_setM_WH_WH_REF_NO; }
	public String getreadM_WH_ITEM_CD() { return m_readM_WH_ITEM_CD; }
	public String getreadM_WH_WH_CD() { return m_readM_WH_WH_CD; }
	public String getreadM_CAL_H_CAL_NO() { return m_readM_CAL_H_CAL_NO; }
	public String getsetM_CAL_H_CAL_NO() { return m_setM_CAL_H_CAL_NO; }
	public String getreadCLASS_CD1() { return m_readCLASS_CD1; }
	public String getsetCLASS_CD2() { return m_setCLASS_CD2; }
	public String getsetCLASS_CD3() { return m_setCLASS_CD3; }
	public String getreadM_ITEM_STOCK_UNIT() { return m_readM_ITEM_STOCK_UNIT; }
	public String getreadM_ITEM_LOT_CTRL_FLG() { return m_readM_ITEM_LOT_CTRL_FLG; }
	public String getreadM_ITEM_MRP_ODR_TYP() { return m_readM_ITEM_MRP_ODR_TYP; }
	public String getsetM_ITEM_ITEM_CD() { return m_setM_ITEM_ITEM_CD; }
	public String getsetDISPLAY_NAME() { return m_setDISPLAY_NAME; }
	public String getVALUE() { return m_VALUE; }
	public String getDEPT_CD() { return m_DEPT_CD; }

	public List getList_rdoInsert() { return l_rdoInsert; }
	public List getList_rdoUpdate() { return l_rdoUpdate; }
	public List getList_rdoDelete() { return l_rdoDelete; }
	public List getList_FileName() { return l_FileName; }
	public List getList_DO_CHK() { return l_DO_CHK; }
	public List getList_ERROR_IN() { return l_ERROR_IN; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_ERR_CTR_NM() { return l_ERR_CTR_NM; }
	public List getList_ERR_INFO() { return l_ERR_INFO; }
	public List getList_h_SYORI_KUBUN() { return l_h_SYORI_KUBUN; }
	public List getList_h_WH_CD() { return l_h_WH_CD; }
	public List getList_CANCEL_FILE() { return l_CANCEL_FILE; }
	public List getList_JUDGMENT_TXT() { return l_JUDGMENT_TXT; }
	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_ERR_TYP() { return l_ERR_TYP; }
	public List getList_w_COLUMN_FLG() { return l_w_COLUMN_FLG; }
	public List getList_OUT_ITEM_CD() { return l_OUT_ITEM_CD; }
	public List getList_readNAME() { return l_readNAME; }
	public List getList_readVALUE() { return l_readVALUE; }
	public List getList_DISPLAY_NAME() { return l_DISPLAY_NAME; }
	public List getList_setNAME() { return l_setNAME; }
	public List getList_setVALUE() { return l_setVALUE; }
	public List getList_readSYS_P_NAME() { return l_readSYS_P_NAME; }
	public List getList_readSYS_P_VALUE() { return l_readSYS_P_VALUE; }
	public List getList_setSYS_P_NAME() { return l_setSYS_P_NAME; }
	public List getList_h_ITEM_CD() { return l_h_ITEM_CD; }
	public List getList_h_ITEM_NAME() { return l_h_ITEM_NAME; }
	public List getList_h_DRAW_CD() { return l_h_DRAW_CD; }
	public List getList_h_SPEC() { return l_h_SPEC; }
	public List getList_h_HIGH_LEVEL_NO() { return l_h_HIGH_LEVEL_NO; }
	public List getList_h_MRP_ODR_TYP() { return l_h_MRP_ODR_TYP; }
	public List getList_h_OUTSIDE_TYP() { return l_h_OUTSIDE_TYP; }
	public List getList_h_STOCK_UNIT_FLG() { return l_h_STOCK_UNIT_FLG; }
	public List getList_h_STOCK_UNIT() { return l_h_STOCK_UNIT; }
	public List getList_h_PKG_UNIT() { return l_h_PKG_UNIT; }
	public List getList_h_PKG_UNIT_QTY() { return l_h_PKG_UNIT_QTY; }
	public List getList_h_UNIT_QTY_TYP() { return l_h_UNIT_QTY_TYP; }
	public List getList_h_ODR_LT() { return l_h_ODR_LT; }
	public List getList_h_FIXED_LT() { return l_h_FIXED_LT; }
	public List getList_h_PROP_LT() { return l_h_PROP_LT; }
	public List getList_h_SAFETY_LT() { return l_h_SAFETY_LT; }
	public List getList_h_ISSUE_LT() { return l_h_ISSUE_LT; }
	public List getList_h_PROP_LOT_SIZE() { return l_h_PROP_LOT_SIZE; }
	public List getList_h_ITEM_SPOIL() { return l_h_ITEM_SPOIL; }
	public List getList_h_SAFETY_STOCK() { return l_h_SAFETY_STOCK; }
	public List getList_h_LOT_SIZING_TYP() { return l_h_LOT_SIZING_TYP; }
	public List getList_h_MAX_PERIOD() { return l_h_MAX_PERIOD; }
	public List getList_h_MAX_ODR_QTY() { return l_h_MAX_ODR_QTY; }
	public List getList_h_ODR_POINT() { return l_h_ODR_POINT; }
	public List getList_h_FIXED_ODR_QTY() { return l_h_FIXED_ODR_QTY; }
	public List getList_h_MIN_ODR_QTY() { return l_h_MIN_ODR_QTY; }
	public List getList_h_MUL_ODR_QTY() { return l_h_MUL_ODR_QTY; }
	public List getList_h_ISSUE_TYP() { return l_h_ISSUE_TYP; }
	public List getList_h_MPS_FLG() { return l_h_MPS_FLG; }
	public List getList_h_ACPT_INSPC_TYP() { return l_h_ACPT_INSPC_TYP; }
	public List getList_h_PRODUCT_TYP() { return l_h_PRODUCT_TYP; }
	public List getList_h_CLASIFICATION_CD() { return l_h_CLASIFICATION_CD; }
	public List getList_h_UNIT_WEIGHT() { return l_h_UNIT_WEIGHT; }
	public List getList_h_ABC_TYP() { return l_h_ABC_TYP; }
	public List getList_h_OPR_RSLT_TYP() { return l_h_OPR_RSLT_TYP; }
	public List getList_h_SPL_ITEM_TYP() { return l_h_SPL_ITEM_TYP; }
	public List getList_h_TAX_CD() { return l_h_TAX_CD; }
	public List getList_h_CAL_NO() { return l_h_CAL_NO; }
	public List getList_h_MANHOUR_TYP() { return l_h_MANHOUR_TYP; }
	public List getList_h_DEPO_TYP() { return l_h_DEPO_TYP; }
	public List getList_h_LOT_CTRL_FLG() { return l_h_LOT_CTRL_FLG; }
	public List getList_h_LOT_NUMBERING_TYP() { return l_h_LOT_NUMBERING_TYP; }
	public List getList_h_BEST_BEFORE_YEAR() { return l_h_BEST_BEFORE_YEAR; }
	public List getList_h_BEST_BEFORE_MONTH() { return l_h_BEST_BEFORE_MONTH; }
	public List getList_h_BEST_BEFORE_DAY() { return l_h_BEST_BEFORE_DAY; }
	public List getList_h_DEPT_CD() { return l_h_DEPT_CD; }
	public List getList_h_PJ_CD() { return l_h_PJ_CD; }
	public List getList_h_SEG_CONTENTS_1() { return l_h_SEG_CONTENTS_1; }
	public List getList_h_SEG_CONTENTS_2() { return l_h_SEG_CONTENTS_2; }
	public List getList_h_SEG_CONTENTS_3() { return l_h_SEG_CONTENTS_3; }
	public List getList_h_SEG_CONTENTS_4() { return l_h_SEG_CONTENTS_4; }
	public List getList_h_REMARK1() { return l_h_REMARK1; }
	public List getList_h_REMARK2() { return l_h_REMARK2; }
	public List getList_h_ITEM_CLASS_01_CD() { return l_h_ITEM_CLASS_01_CD; }
	public List getList_h_ITEM_CLASS_02_CD() { return l_h_ITEM_CLASS_02_CD; }
	public List getList_h_ITEM_CLASS_03_CD() { return l_h_ITEM_CLASS_03_CD; }
	public List getList_h_ITEM_CLASS_04_CD() { return l_h_ITEM_CLASS_04_CD; }
	public List getList_h_ITEM_CLASS_05_CD() { return l_h_ITEM_CLASS_05_CD; }
	public List getList_h_ITEM_CLASS_06_CD() { return l_h_ITEM_CLASS_06_CD; }
	public List getList_h_ITEM_CLASS_07_CD() { return l_h_ITEM_CLASS_07_CD; }
	public List getList_h_ITEM_CLASS_08_CD() { return l_h_ITEM_CLASS_08_CD; }
	public List getList_h_ITEM_CLASS_09_CD() { return l_h_ITEM_CLASS_09_CD; }
	public List getList_h_ITEM_CLASS_10_CD() { return l_h_ITEM_CLASS_10_CD; }
	public List getList_h_ITEM_CLASS_11_CD() { return l_h_ITEM_CLASS_11_CD; }
	public List getList_h_ITEM_CLASS_12_CD() { return l_h_ITEM_CLASS_12_CD; }
	public List getList_readTAX_CD() { return l_readTAX_CD; }
	public List getList_setTAXCD() { return l_setTAXCD; }
	public List getList_readITEM_CD() { return l_readITEM_CD; }
	public List getList_setITEM_CD() { return l_setITEM_CD; }
	public List getList_readVEND_CD() { return l_readVEND_CD; }
	public List getList_setVEND_CD() { return l_setVEND_CD; }
	public List getList_readPLANT_CD() { return l_readPLANT_CD; }
	public List getList_readSUM_PROP_LT() { return l_readSUM_PROP_LT; }
	public List getList_readSUM_FIXED_LT() { return l_readSUM_FIXED_LT; }
	public List getList_readMRP_ITEM_CD() { return l_readMRP_ITEM_CD; }
	public List getList_readMRP_ODR_TYP() { return l_readMRP_ODR_TYP; }
	public List getList_setMRP_ITEM_CD() { return l_setMRP_ITEM_CD; }
	public List getList_readMRP_ODR_ITEM_CD() { return l_readMRP_ODR_ITEM_CD; }
	public List getList_setMRP_ODR_ITEM_CD() { return l_setMRP_ODR_ITEM_CD; }
	public List getList_C_ITEM_CD() { return l_C_ITEM_CD; }
	public List getList_C_ITEM_NAME() { return l_C_ITEM_NAME; }
	public List getList_C_DRAW_CD() { return l_C_DRAW_CD; }
	public List getList_C_SPEC() { return l_C_SPEC; }
	public List getList_C_HIGH_LEVEL_NO() { return l_C_HIGH_LEVEL_NO; }
	public List getList_C_MRP_ODR_TYP() { return l_C_MRP_ODR_TYP; }
	public List getList_C_OUTSIDE_TYP() { return l_C_OUTSIDE_TYP; }
	public List getList_C_STOCK_UNIT_FLG() { return l_C_STOCK_UNIT_FLG; }
	public List getList_C_STOCK_UNIT() { return l_C_STOCK_UNIT; }
	public List getList_C_PKG_UNIT() { return l_C_PKG_UNIT; }
	public List getList_C_PKG_UNIT_QTY() { return l_C_PKG_UNIT_QTY; }
	public List getList_C_UNIT_QTY_TYP() { return l_C_UNIT_QTY_TYP; }
	public List getList_C_ODR_LT() { return l_C_ODR_LT; }
	public List getList_C_FIXED_LT() { return l_C_FIXED_LT; }
	public List getList_C_PROP_LT() { return l_C_PROP_LT; }
	public List getList_C_SAFETY_LT() { return l_C_SAFETY_LT; }
	public List getList_C_ISSUE_LT() { return l_C_ISSUE_LT; }
	public List getList_C_PROP_LOT_SIZE() { return l_C_PROP_LOT_SIZE; }
	public List getList_C_ITEM_SPOIL() { return l_C_ITEM_SPOIL; }
	public List getList_C_SAFETY_STOCK() { return l_C_SAFETY_STOCK; }
	public List getList_C_LOT_SIZING_TYP() { return l_C_LOT_SIZING_TYP; }
	public List getList_C_MAX_PERIOD() { return l_C_MAX_PERIOD; }
	public List getList_C_MAX_ODR_QTY() { return l_C_MAX_ODR_QTY; }
	public List getList_C_ODR_POINT() { return l_C_ODR_POINT; }
	public List getList_C_FIXED_ODR_QTY() { return l_C_FIXED_ODR_QTY; }
	public List getList_C_MIN_ODR_QTY() { return l_C_MIN_ODR_QTY; }
	public List getList_C_MUL_ODR_QTY() { return l_C_MUL_ODR_QTY; }
	public List getList_C_ISSUE_TYP() { return l_C_ISSUE_TYP; }
	public List getList_C_MPS_FLG() { return l_C_MPS_FLG; }
	public List getList_C_ACPT_INSPC_TYP() { return l_C_ACPT_INSPC_TYP; }
	public List getList_C_PRODUCT_TYP() { return l_C_PRODUCT_TYP; }
	public List getList_C_CLASIFICATION_CD() { return l_C_CLASIFICATION_CD; }
	public List getList_C_UNIT_WEIGHT() { return l_C_UNIT_WEIGHT; }
	public List getList_C_ABC_TYP() { return l_C_ABC_TYP; }
	public List getList_C_OPR_RSLT_TYP() { return l_C_OPR_RSLT_TYP; }
	public List getList_C_SPL_ITEM_TYP() { return l_C_SPL_ITEM_TYP; }
	public List getList_C_TAX_CD() { return l_C_TAX_CD; }
	public List getList_C_CAL_NO() { return l_C_CAL_NO; }
	public List getList_C_MANHOUR_TYP() { return l_C_MANHOUR_TYP; }
	public List getList_C_DEPO_TYP() { return l_C_DEPO_TYP; }
	public List getList_C_LOT_CTRL_FLG() { return l_C_LOT_CTRL_FLG; }
	public List getList_C_LOT_NUMBERING_TYP() { return l_C_LOT_NUMBERING_TYP; }
	public List getList_C_BEST_BEFORE_YEAR() { return l_C_BEST_BEFORE_YEAR; }
	public List getList_C_BEST_BEFORE_MONTH() { return l_C_BEST_BEFORE_MONTH; }
	public List getList_C_BEST_BEFORE_DAY() { return l_C_BEST_BEFORE_DAY; }
	public List getList_C_REMARK1() { return l_C_REMARK1; }
	public List getList_C_REMARK2() { return l_C_REMARK2; }
	public List getList_C_ITEM_CLASS_01_CD() { return l_C_ITEM_CLASS_01_CD; }
	public List getList_C_ITEM_CLASS_02_CD() { return l_C_ITEM_CLASS_02_CD; }
	public List getList_C_ITEM_CLASS_03_CD() { return l_C_ITEM_CLASS_03_CD; }
	public List getList_C_ITEM_CLASS_04_CD() { return l_C_ITEM_CLASS_04_CD; }
	public List getList_C_ITEM_CLASS_05_CD() { return l_C_ITEM_CLASS_05_CD; }
	public List getList_C_ITEM_CLASS_06_CD() { return l_C_ITEM_CLASS_06_CD; }
	public List getList_C_ITEM_CLASS_07_CD() { return l_C_ITEM_CLASS_07_CD; }
	public List getList_C_ITEM_CLASS_08_CD() { return l_C_ITEM_CLASS_08_CD; }
	public List getList_C_ITEM_CLASS_09_CD() { return l_C_ITEM_CLASS_09_CD; }
	public List getList_C_ITEM_CLASS_10_CD() { return l_C_ITEM_CLASS_10_CD; }
	public List getList_C_ITEM_CLASS_11_CD() { return l_C_ITEM_CLASS_11_CD; }
	public List getList_C_ITEM_CLASS_12_CD() { return l_C_ITEM_CLASS_12_CD; }
	public List getList_C_DEPT_CD() { return l_C_DEPT_CD; }
	public List getList_C_PJ_CD() { return l_C_PJ_CD; }
	public List getList_C_SEG_CONTENTS_1() { return l_C_SEG_CONTENTS_1; }
	public List getList_C_SEG_CONTENTS_2() { return l_C_SEG_CONTENTS_2; }
	public List getList_C_SEG_CONTENTS_3() { return l_C_SEG_CONTENTS_3; }
	public List getList_C_SEG_CONTENTS_4() { return l_C_SEG_CONTENTS_4; }
	public List getList_C_setITEM_CD() { return l_C_setITEM_CD; }
	public List getList_readT_OD_ITEM_CD() { return l_readT_OD_ITEM_CD; }
	public List getList_setT_OD_ITEM_CD() { return l_setT_OD_ITEM_CD; }
	public List getList_readM_PS_ITEM_CD() { return l_readM_PS_ITEM_CD; }
	public List getList_setM_PS_ITEM_CD() { return l_setM_PS_ITEM_CD; }
	public List getList_readT_ITEM_STOCK_ITEM_CD() { return l_readT_ITEM_STOCK_ITEM_CD; }
	public List getList_readT_ITEM_STOCK_STOCK_ON_HAND_QTY() { return l_readT_ITEM_STOCK_STOCK_ON_HAND_QTY; }
	public List getList_setT_ITEM_STOCK_ITEM_CD() { return l_setT_ITEM_STOCK_ITEM_CD; }
	public List getList_readT_JOB_ODR_CD_ITEM_CD() { return l_readT_JOB_ODR_CD_ITEM_CD; }
	public List getList_readT_JOB_ODR_CD_STOCK_ON_HAND_QTY() { return l_readT_JOB_ODR_CD_STOCK_ON_HAND_QTY; }
	public List getList_setT_JOB_ODR_CD_ITEM_CD() { return l_setT_JOB_ODR_CD_ITEM_CD; }
	public List getList_readT_RLSD_P_ITEM_CD() { return l_readT_RLSD_P_ITEM_CD; }
	public List getList_setT_RLSD_P_ITEM_CD() { return l_setT_RLSD_P_ITEM_CD; }
	public List getList_readT_WORK_IN_ITEM_CD() { return l_readT_WORK_IN_ITEM_CD; }
	public List getList_setT_WORK_IN_ITEM_CD() { return l_setT_WORK_IN_ITEM_CD; }
	public List getList_readT_JOB_ODR_ITEM_CD() { return l_readT_JOB_ODR_ITEM_CD; }
	public List getList_setT_JOB_ODR_ITEM_CD() { return l_setT_JOB_ODR_ITEM_CD; }
	public List getList_readT_OPR_RSLT_ITEM_CD() { return l_readT_OPR_RSLT_ITEM_CD; }
	public List getList_setT_OPR_RSLT_ITEM_CD() { return l_setT_OPR_RSLT_ITEM_CD; }
	public List getList_setM_WH_ITEM_CD() { return l_setM_WH_ITEM_CD; }
	public List getList_setM_WH_WH_CD() { return l_setM_WH_WH_CD; }
	public List getList_setM_WH_PLANT_CD() { return l_setM_WH_PLANT_CD; }
	public List getList_setM_WH_WH_REF_NO() { return l_setM_WH_WH_REF_NO; }
	public List getList_readM_WH_ITEM_CD() { return l_readM_WH_ITEM_CD; }
	public List getList_readM_WH_WH_CD() { return l_readM_WH_WH_CD; }
	public List getList_readM_CAL_H_CAL_NO() { return l_readM_CAL_H_CAL_NO; }
	public List getList_setM_CAL_H_CAL_NO() { return l_setM_CAL_H_CAL_NO; }
	public List getList_readCLASS_CD1() { return l_readCLASS_CD1; }
	public List getList_setCLASS_CD2() { return l_setCLASS_CD2; }
	public List getList_setCLASS_CD3() { return l_setCLASS_CD3; }
	public List getList_readM_ITEM_STOCK_UNIT() { return l_readM_ITEM_STOCK_UNIT; }
	public List getList_readM_ITEM_LOT_CTRL_FLG() { return l_readM_ITEM_LOT_CTRL_FLG; }
	public List getList_readM_ITEM_MRP_ODR_TYP() { return l_readM_ITEM_MRP_ODR_TYP; }
	public List getList_setM_ITEM_ITEM_CD() { return l_setM_ITEM_ITEM_CD; }
	public List getList_setDISPLAY_NAME() { return l_setDISPLAY_NAME; }
	public List getList_VALUE() { return l_VALUE; }
	public List getList_DEPT_CD() { return l_DEPT_CD; }

	public void setrdoInsert(String val) { m_rdoInsert = val; }
	public void setrdoUpdate(String val) { m_rdoUpdate = val; }
	public void setrdoDelete(String val) { m_rdoDelete = val; }
	public void setFileName(String val) { m_FileName = val; }
	public void setDO_CHK(String val) { m_DO_CHK = val; }
	public void setERROR_IN(String val) { m_ERROR_IN = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setERR_CTR_NM(String val) { m_ERR_CTR_NM = val; }
	public void setERR_INFO(String val) { m_ERR_INFO = val; }
	public void seth_SYORI_KUBUN(String val) { m_h_SYORI_KUBUN = val; }
	public void seth_WH_CD(String val) { m_h_WH_CD = val; }
	public void setCANCEL_FILE(String val) { m_CANCEL_FILE = val; }
	public void setJUDGMENT_TXT(String val) { m_JUDGMENT_TXT = val; }
	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setERR_TYP(String val) { m_ERR_TYP = val; }
	public void setw_COLUMN_FLG(String val) { m_w_COLUMN_FLG = val; }
	public void setOUT_ITEM_CD(String val) { m_OUT_ITEM_CD = val; }
	public void setreadNAME(String val) { m_readNAME = val; }
	public void setreadVALUE(String val) { m_readVALUE = val; }
	public void setDISPLAY_NAME(String val) { m_DISPLAY_NAME = val; }
	public void setsetNAME(String val) { m_setNAME = val; }
	public void setsetVALUE(String val) { m_setVALUE = val; }
	public void setreadSYS_P_NAME(String val) { m_readSYS_P_NAME = val; }
	public void setreadSYS_P_VALUE(String val) { m_readSYS_P_VALUE = val; }
	public void setsetSYS_P_NAME(String val) { m_setSYS_P_NAME = val; }
	public void seth_ITEM_CD(String val) { m_h_ITEM_CD = val; }
	public void seth_ITEM_NAME(String val) { m_h_ITEM_NAME = val; }
	public void seth_DRAW_CD(String val) { m_h_DRAW_CD = val; }
	public void seth_SPEC(String val) { m_h_SPEC = val; }
	public void seth_HIGH_LEVEL_NO(String val) { m_h_HIGH_LEVEL_NO = val; }
	public void seth_MRP_ODR_TYP(String val) { m_h_MRP_ODR_TYP = val; }
	public void seth_OUTSIDE_TYP(String val) { m_h_OUTSIDE_TYP = val; }
	public void seth_STOCK_UNIT_FLG(String val) { m_h_STOCK_UNIT_FLG = val; }
	public void seth_STOCK_UNIT(String val) { m_h_STOCK_UNIT = val; }
	public void seth_PKG_UNIT(String val) { m_h_PKG_UNIT = val; }
	public void seth_PKG_UNIT_QTY(String val) { m_h_PKG_UNIT_QTY = val; }
	public void seth_UNIT_QTY_TYP(String val) { m_h_UNIT_QTY_TYP = val; }
	public void seth_ODR_LT(String val) { m_h_ODR_LT = val; }
	public void seth_FIXED_LT(String val) { m_h_FIXED_LT = val; }
	public void seth_PROP_LT(String val) { m_h_PROP_LT = val; }
	public void seth_SAFETY_LT(String val) { m_h_SAFETY_LT = val; }
	public void seth_ISSUE_LT(String val) { m_h_ISSUE_LT = val; }
	public void seth_PROP_LOT_SIZE(String val) { m_h_PROP_LOT_SIZE = val; }
	public void seth_ITEM_SPOIL(String val) { m_h_ITEM_SPOIL = val; }
	public void seth_SAFETY_STOCK(String val) { m_h_SAFETY_STOCK = val; }
	public void seth_LOT_SIZING_TYP(String val) { m_h_LOT_SIZING_TYP = val; }
	public void seth_MAX_PERIOD(String val) { m_h_MAX_PERIOD = val; }
	public void seth_MAX_ODR_QTY(String val) { m_h_MAX_ODR_QTY = val; }
	public void seth_ODR_POINT(String val) { m_h_ODR_POINT = val; }
	public void seth_FIXED_ODR_QTY(String val) { m_h_FIXED_ODR_QTY = val; }
	public void seth_MIN_ODR_QTY(String val) { m_h_MIN_ODR_QTY = val; }
	public void seth_MUL_ODR_QTY(String val) { m_h_MUL_ODR_QTY = val; }
	public void seth_ISSUE_TYP(String val) { m_h_ISSUE_TYP = val; }
	public void seth_MPS_FLG(String val) { m_h_MPS_FLG = val; }
	public void seth_ACPT_INSPC_TYP(String val) { m_h_ACPT_INSPC_TYP = val; }
	public void seth_PRODUCT_TYP(String val) { m_h_PRODUCT_TYP = val; }
	public void seth_CLASIFICATION_CD(String val) { m_h_CLASIFICATION_CD = val; }
	public void seth_UNIT_WEIGHT(String val) { m_h_UNIT_WEIGHT = val; }
	public void seth_ABC_TYP(String val) { m_h_ABC_TYP = val; }
	public void seth_OPR_RSLT_TYP(String val) { m_h_OPR_RSLT_TYP = val; }
	public void seth_SPL_ITEM_TYP(String val) { m_h_SPL_ITEM_TYP = val; }
	public void seth_TAX_CD(String val) { m_h_TAX_CD = val; }
	public void seth_CAL_NO(String val) { m_h_CAL_NO = val; }
	public void seth_MANHOUR_TYP(String val) { m_h_MANHOUR_TYP = val; }
	public void seth_DEPO_TYP(String val) { m_h_DEPO_TYP = val; }
	public void seth_LOT_CTRL_FLG(String val) { m_h_LOT_CTRL_FLG = val; }
	public void seth_LOT_NUMBERING_TYP(String val) { m_h_LOT_NUMBERING_TYP = val; }
	public void seth_BEST_BEFORE_YEAR(String val) { m_h_BEST_BEFORE_YEAR = val; }
	public void seth_BEST_BEFORE_MONTH(String val) { m_h_BEST_BEFORE_MONTH = val; }
	public void seth_BEST_BEFORE_DAY(String val) { m_h_BEST_BEFORE_DAY = val; }
	public void seth_DEPT_CD(String val) { m_h_DEPT_CD = val; }
	public void seth_PJ_CD(String val) { m_h_PJ_CD = val; }
	public void seth_SEG_CONTENTS_1(String val) { m_h_SEG_CONTENTS_1 = val; }
	public void seth_SEG_CONTENTS_2(String val) { m_h_SEG_CONTENTS_2 = val; }
	public void seth_SEG_CONTENTS_3(String val) { m_h_SEG_CONTENTS_3 = val; }
	public void seth_SEG_CONTENTS_4(String val) { m_h_SEG_CONTENTS_4 = val; }
	public void seth_REMARK1(String val) { m_h_REMARK1 = val; }
	public void seth_REMARK2(String val) { m_h_REMARK2 = val; }
	public void seth_ITEM_CLASS_01_CD(String val) { m_h_ITEM_CLASS_01_CD = val; }
	public void seth_ITEM_CLASS_02_CD(String val) { m_h_ITEM_CLASS_02_CD = val; }
	public void seth_ITEM_CLASS_03_CD(String val) { m_h_ITEM_CLASS_03_CD = val; }
	public void seth_ITEM_CLASS_04_CD(String val) { m_h_ITEM_CLASS_04_CD = val; }
	public void seth_ITEM_CLASS_05_CD(String val) { m_h_ITEM_CLASS_05_CD = val; }
	public void seth_ITEM_CLASS_06_CD(String val) { m_h_ITEM_CLASS_06_CD = val; }
	public void seth_ITEM_CLASS_07_CD(String val) { m_h_ITEM_CLASS_07_CD = val; }
	public void seth_ITEM_CLASS_08_CD(String val) { m_h_ITEM_CLASS_08_CD = val; }
	public void seth_ITEM_CLASS_09_CD(String val) { m_h_ITEM_CLASS_09_CD = val; }
	public void seth_ITEM_CLASS_10_CD(String val) { m_h_ITEM_CLASS_10_CD = val; }
	public void seth_ITEM_CLASS_11_CD(String val) { m_h_ITEM_CLASS_11_CD = val; }
	public void seth_ITEM_CLASS_12_CD(String val) { m_h_ITEM_CLASS_12_CD = val; }
	public void setreadTAX_CD(String val) { m_readTAX_CD = val; }
	public void setsetTAXCD(String val) { m_setTAXCD = val; }
	public void setreadITEM_CD(String val) { m_readITEM_CD = val; }
	public void setsetITEM_CD(String val) { m_setITEM_CD = val; }
	public void setreadVEND_CD(String val) { m_readVEND_CD = val; }
	public void setsetVEND_CD(String val) { m_setVEND_CD = val; }
	public void setreadPLANT_CD(String val) { m_readPLANT_CD = val; }
	public void setreadSUM_PROP_LT(Integer val) { m_readSUM_PROP_LT = val; }
	public void setreadSUM_FIXED_LT(Integer val) { m_readSUM_FIXED_LT = val; }
	public void setreadMRP_ITEM_CD(String val) { m_readMRP_ITEM_CD = val; }
	public void setreadMRP_ODR_TYP(Integer val) { m_readMRP_ODR_TYP = val; }
	public void setsetMRP_ITEM_CD(String val) { m_setMRP_ITEM_CD = val; }
	public void setreadMRP_ODR_ITEM_CD(String val) { m_readMRP_ODR_ITEM_CD = val; }
	public void setsetMRP_ODR_ITEM_CD(String val) { m_setMRP_ODR_ITEM_CD = val; }
	public void setC_ITEM_CD(String val) { m_C_ITEM_CD = val; }
	public void setC_ITEM_NAME(String val) { m_C_ITEM_NAME = val; }
	public void setC_DRAW_CD(String val) { m_C_DRAW_CD = val; }
	public void setC_SPEC(String val) { m_C_SPEC = val; }
	public void setC_HIGH_LEVEL_NO(String val) { m_C_HIGH_LEVEL_NO = val; }
	public void setC_MRP_ODR_TYP(String val) { m_C_MRP_ODR_TYP = val; }
	public void setC_OUTSIDE_TYP(String val) { m_C_OUTSIDE_TYP = val; }
	public void setC_STOCK_UNIT_FLG(String val) { m_C_STOCK_UNIT_FLG = val; }
	public void setC_STOCK_UNIT(String val) { m_C_STOCK_UNIT = val; }
	public void setC_PKG_UNIT(String val) { m_C_PKG_UNIT = val; }
	public void setC_PKG_UNIT_QTY(String val) { m_C_PKG_UNIT_QTY = val; }
	public void setC_UNIT_QTY_TYP(String val) { m_C_UNIT_QTY_TYP = val; }
	public void setC_ODR_LT(String val) { m_C_ODR_LT = val; }
	public void setC_FIXED_LT(String val) { m_C_FIXED_LT = val; }
	public void setC_PROP_LT(String val) { m_C_PROP_LT = val; }
	public void setC_SAFETY_LT(String val) { m_C_SAFETY_LT = val; }
	public void setC_ISSUE_LT(String val) { m_C_ISSUE_LT = val; }
	public void setC_PROP_LOT_SIZE(String val) { m_C_PROP_LOT_SIZE = val; }
	public void setC_ITEM_SPOIL(String val) { m_C_ITEM_SPOIL = val; }
	public void setC_SAFETY_STOCK(String val) { m_C_SAFETY_STOCK = val; }
	public void setC_LOT_SIZING_TYP(String val) { m_C_LOT_SIZING_TYP = val; }
	public void setC_MAX_PERIOD(String val) { m_C_MAX_PERIOD = val; }
	public void setC_MAX_ODR_QTY(String val) { m_C_MAX_ODR_QTY = val; }
	public void setC_ODR_POINT(String val) { m_C_ODR_POINT = val; }
	public void setC_FIXED_ODR_QTY(String val) { m_C_FIXED_ODR_QTY = val; }
	public void setC_MIN_ODR_QTY(String val) { m_C_MIN_ODR_QTY = val; }
	public void setC_MUL_ODR_QTY(String val) { m_C_MUL_ODR_QTY = val; }
	public void setC_ISSUE_TYP(String val) { m_C_ISSUE_TYP = val; }
	public void setC_MPS_FLG(String val) { m_C_MPS_FLG = val; }
	public void setC_ACPT_INSPC_TYP(String val) { m_C_ACPT_INSPC_TYP = val; }
	public void setC_PRODUCT_TYP(String val) { m_C_PRODUCT_TYP = val; }
	public void setC_CLASIFICATION_CD(String val) { m_C_CLASIFICATION_CD = val; }
	public void setC_UNIT_WEIGHT(String val) { m_C_UNIT_WEIGHT = val; }
	public void setC_ABC_TYP(String val) { m_C_ABC_TYP = val; }
	public void setC_OPR_RSLT_TYP(String val) { m_C_OPR_RSLT_TYP = val; }
	public void setC_SPL_ITEM_TYP(String val) { m_C_SPL_ITEM_TYP = val; }
	public void setC_TAX_CD(String val) { m_C_TAX_CD = val; }
	public void setC_CAL_NO(String val) { m_C_CAL_NO = val; }
	public void setC_MANHOUR_TYP(String val) { m_C_MANHOUR_TYP = val; }
	public void setC_DEPO_TYP(String val) { m_C_DEPO_TYP = val; }
	public void setC_LOT_CTRL_FLG(String val) { m_C_LOT_CTRL_FLG = val; }
	public void setC_LOT_NUMBERING_TYP(String val) { m_C_LOT_NUMBERING_TYP = val; }
	public void setC_BEST_BEFORE_YEAR(String val) { m_C_BEST_BEFORE_YEAR = val; }
	public void setC_BEST_BEFORE_MONTH(String val) { m_C_BEST_BEFORE_MONTH = val; }
	public void setC_BEST_BEFORE_DAY(String val) { m_C_BEST_BEFORE_DAY = val; }
	public void setC_REMARK1(String val) { m_C_REMARK1 = val; }
	public void setC_REMARK2(String val) { m_C_REMARK2 = val; }
	public void setC_ITEM_CLASS_01_CD(String val) { m_C_ITEM_CLASS_01_CD = val; }
	public void setC_ITEM_CLASS_02_CD(String val) { m_C_ITEM_CLASS_02_CD = val; }
	public void setC_ITEM_CLASS_03_CD(String val) { m_C_ITEM_CLASS_03_CD = val; }
	public void setC_ITEM_CLASS_04_CD(String val) { m_C_ITEM_CLASS_04_CD = val; }
	public void setC_ITEM_CLASS_05_CD(String val) { m_C_ITEM_CLASS_05_CD = val; }
	public void setC_ITEM_CLASS_06_CD(String val) { m_C_ITEM_CLASS_06_CD = val; }
	public void setC_ITEM_CLASS_07_CD(String val) { m_C_ITEM_CLASS_07_CD = val; }
	public void setC_ITEM_CLASS_08_CD(String val) { m_C_ITEM_CLASS_08_CD = val; }
	public void setC_ITEM_CLASS_09_CD(String val) { m_C_ITEM_CLASS_09_CD = val; }
	public void setC_ITEM_CLASS_10_CD(String val) { m_C_ITEM_CLASS_10_CD = val; }
	public void setC_ITEM_CLASS_11_CD(String val) { m_C_ITEM_CLASS_11_CD = val; }
	public void setC_ITEM_CLASS_12_CD(String val) { m_C_ITEM_CLASS_12_CD = val; }
	public void setC_DEPT_CD(String val) { m_C_DEPT_CD = val; }
	public void setC_PJ_CD(String val) { m_C_PJ_CD = val; }
	public void setC_SEG_CONTENTS_1(String val) { m_C_SEG_CONTENTS_1 = val; }
	public void setC_SEG_CONTENTS_2(String val) { m_C_SEG_CONTENTS_2 = val; }
	public void setC_SEG_CONTENTS_3(String val) { m_C_SEG_CONTENTS_3 = val; }
	public void setC_SEG_CONTENTS_4(String val) { m_C_SEG_CONTENTS_4 = val; }
	public void setC_setITEM_CD(String val) { m_C_setITEM_CD = val; }
	public void setreadT_OD_ITEM_CD(String val) { m_readT_OD_ITEM_CD = val; }
	public void setsetT_OD_ITEM_CD(String val) { m_setT_OD_ITEM_CD = val; }
	public void setreadM_PS_ITEM_CD(String val) { m_readM_PS_ITEM_CD = val; }
	public void setsetM_PS_ITEM_CD(String val) { m_setM_PS_ITEM_CD = val; }
	public void setreadT_ITEM_STOCK_ITEM_CD(String val) { m_readT_ITEM_STOCK_ITEM_CD = val; }
	public void setreadT_ITEM_STOCK_STOCK_ON_HAND_QTY(String val) { m_readT_ITEM_STOCK_STOCK_ON_HAND_QTY = val; }
	public void setsetT_ITEM_STOCK_ITEM_CD(String val) { m_setT_ITEM_STOCK_ITEM_CD = val; }
	public void setreadT_JOB_ODR_CD_ITEM_CD(String val) { m_readT_JOB_ODR_CD_ITEM_CD = val; }
	public void setreadT_JOB_ODR_CD_STOCK_ON_HAND_QTY(String val) { m_readT_JOB_ODR_CD_STOCK_ON_HAND_QTY = val; }
	public void setsetT_JOB_ODR_CD_ITEM_CD(String val) { m_setT_JOB_ODR_CD_ITEM_CD = val; }
	public void setreadT_RLSD_P_ITEM_CD(String val) { m_readT_RLSD_P_ITEM_CD = val; }
	public void setsetT_RLSD_P_ITEM_CD(String val) { m_setT_RLSD_P_ITEM_CD = val; }
	public void setreadT_WORK_IN_ITEM_CD(String val) { m_readT_WORK_IN_ITEM_CD = val; }
	public void setsetT_WORK_IN_ITEM_CD(String val) { m_setT_WORK_IN_ITEM_CD = val; }
	public void setreadT_JOB_ODR_ITEM_CD(String val) { m_readT_JOB_ODR_ITEM_CD = val; }
	public void setsetT_JOB_ODR_ITEM_CD(String val) { m_setT_JOB_ODR_ITEM_CD = val; }
	public void setreadT_OPR_RSLT_ITEM_CD(String val) { m_readT_OPR_RSLT_ITEM_CD = val; }
	public void setsetT_OPR_RSLT_ITEM_CD(String val) { m_setT_OPR_RSLT_ITEM_CD = val; }
	public void setsetM_WH_ITEM_CD(String val) { m_setM_WH_ITEM_CD = val; }
	public void setsetM_WH_WH_CD(String val) { m_setM_WH_WH_CD = val; }
	public void setsetM_WH_PLANT_CD(String val) { m_setM_WH_PLANT_CD = val; }
	public void setsetM_WH_WH_REF_NO(String val) { m_setM_WH_WH_REF_NO = val; }
	public void setreadM_WH_ITEM_CD(String val) { m_readM_WH_ITEM_CD = val; }
	public void setreadM_WH_WH_CD(String val) { m_readM_WH_WH_CD = val; }
	public void setreadM_CAL_H_CAL_NO(String val) { m_readM_CAL_H_CAL_NO = val; }
	public void setsetM_CAL_H_CAL_NO(String val) { m_setM_CAL_H_CAL_NO = val; }
	public void setreadCLASS_CD1(String val) { m_readCLASS_CD1 = val; }
	public void setsetCLASS_CD2(String val) { m_setCLASS_CD2 = val; }
	public void setsetCLASS_CD3(String val) { m_setCLASS_CD3 = val; }
	public void setreadM_ITEM_STOCK_UNIT(String val) { m_readM_ITEM_STOCK_UNIT = val; }
	public void setreadM_ITEM_LOT_CTRL_FLG(String val) { m_readM_ITEM_LOT_CTRL_FLG = val; }
	public void setreadM_ITEM_MRP_ODR_TYP(String val) { m_readM_ITEM_MRP_ODR_TYP = val; }
	public void setsetM_ITEM_ITEM_CD(String val) { m_setM_ITEM_ITEM_CD = val; }
	public void setsetDISPLAY_NAME(String val) { m_setDISPLAY_NAME = val; }
	public void setVALUE(String val) { m_VALUE = val; }
	public void setDEPT_CD(String val) { m_DEPT_CD = val; }

	public void setreadSUM_PROP_LT(String val) { m_readSUM_PROP_LT = getInteger(val); }
	public void setreadSUM_FIXED_LT(String val) { m_readSUM_FIXED_LT = getInteger(val); }
	public void setreadMRP_ODR_TYP(String val) { m_readMRP_ODR_TYP = getInteger(val); }

	public void setList_rdoInsert(List list) { l_rdoInsert = list; }
	public void setList_rdoUpdate(List list) { l_rdoUpdate = list; }
	public void setList_rdoDelete(List list) { l_rdoDelete = list; }
	public void setList_FileName(List list) { l_FileName = list; }
	public void setList_DO_CHK(List list) { l_DO_CHK = list; }
	public void setList_ERROR_IN(List list) { l_ERROR_IN = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_ERR_CTR_NM(List list) { l_ERR_CTR_NM = list; }
	public void setList_ERR_INFO(List list) { l_ERR_INFO = list; }
	public void setList_h_SYORI_KUBUN(List list) { l_h_SYORI_KUBUN = list; }
	public void setList_h_WH_CD(List list) { l_h_WH_CD = list; }
	public void setList_CANCEL_FILE(List list) { l_CANCEL_FILE = list; }
	public void setList_JUDGMENT_TXT(List list) { l_JUDGMENT_TXT = list; }
	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_ERR_TYP(List list) { l_ERR_TYP = list; }
	public void setList_w_COLUMN_FLG(List list) { l_w_COLUMN_FLG = list; }
	public void setList_OUT_ITEM_CD(List list) { l_OUT_ITEM_CD = list; }
	public void setList_readNAME(List list) { l_readNAME = list; }
	public void setList_readVALUE(List list) { l_readVALUE = list; }
	public void setList_DISPLAY_NAME(List list) { l_DISPLAY_NAME = list; }
	public void setList_setNAME(List list) { l_setNAME = list; }
	public void setList_setVALUE(List list) { l_setVALUE = list; }
	public void setList_readSYS_P_NAME(List list) { l_readSYS_P_NAME = list; }
	public void setList_readSYS_P_VALUE(List list) { l_readSYS_P_VALUE = list; }
	public void setList_setSYS_P_NAME(List list) { l_setSYS_P_NAME = list; }
	public void setList_h_ITEM_CD(List list) { l_h_ITEM_CD = list; }
	public void setList_h_ITEM_NAME(List list) { l_h_ITEM_NAME = list; }
	public void setList_h_DRAW_CD(List list) { l_h_DRAW_CD = list; }
	public void setList_h_SPEC(List list) { l_h_SPEC = list; }
	public void setList_h_HIGH_LEVEL_NO(List list) { l_h_HIGH_LEVEL_NO = list; }
	public void setList_h_MRP_ODR_TYP(List list) { l_h_MRP_ODR_TYP = list; }
	public void setList_h_OUTSIDE_TYP(List list) { l_h_OUTSIDE_TYP = list; }
	public void setList_h_STOCK_UNIT_FLG(List list) { l_h_STOCK_UNIT_FLG = list; }
	public void setList_h_STOCK_UNIT(List list) { l_h_STOCK_UNIT = list; }
	public void setList_h_PKG_UNIT(List list) { l_h_PKG_UNIT = list; }
	public void setList_h_PKG_UNIT_QTY(List list) { l_h_PKG_UNIT_QTY = list; }
	public void setList_h_UNIT_QTY_TYP(List list) { l_h_UNIT_QTY_TYP = list; }
	public void setList_h_ODR_LT(List list) { l_h_ODR_LT = list; }
	public void setList_h_FIXED_LT(List list) { l_h_FIXED_LT = list; }
	public void setList_h_PROP_LT(List list) { l_h_PROP_LT = list; }
	public void setList_h_SAFETY_LT(List list) { l_h_SAFETY_LT = list; }
	public void setList_h_ISSUE_LT(List list) { l_h_ISSUE_LT = list; }
	public void setList_h_PROP_LOT_SIZE(List list) { l_h_PROP_LOT_SIZE = list; }
	public void setList_h_ITEM_SPOIL(List list) { l_h_ITEM_SPOIL = list; }
	public void setList_h_SAFETY_STOCK(List list) { l_h_SAFETY_STOCK = list; }
	public void setList_h_LOT_SIZING_TYP(List list) { l_h_LOT_SIZING_TYP = list; }
	public void setList_h_MAX_PERIOD(List list) { l_h_MAX_PERIOD = list; }
	public void setList_h_MAX_ODR_QTY(List list) { l_h_MAX_ODR_QTY = list; }
	public void setList_h_ODR_POINT(List list) { l_h_ODR_POINT = list; }
	public void setList_h_FIXED_ODR_QTY(List list) { l_h_FIXED_ODR_QTY = list; }
	public void setList_h_MIN_ODR_QTY(List list) { l_h_MIN_ODR_QTY = list; }
	public void setList_h_MUL_ODR_QTY(List list) { l_h_MUL_ODR_QTY = list; }
	public void setList_h_ISSUE_TYP(List list) { l_h_ISSUE_TYP = list; }
	public void setList_h_MPS_FLG(List list) { l_h_MPS_FLG = list; }
	public void setList_h_ACPT_INSPC_TYP(List list) { l_h_ACPT_INSPC_TYP = list; }
	public void setList_h_PRODUCT_TYP(List list) { l_h_PRODUCT_TYP = list; }
	public void setList_h_CLASIFICATION_CD(List list) { l_h_CLASIFICATION_CD = list; }
	public void setList_h_UNIT_WEIGHT(List list) { l_h_UNIT_WEIGHT = list; }
	public void setList_h_ABC_TYP(List list) { l_h_ABC_TYP = list; }
	public void setList_h_OPR_RSLT_TYP(List list) { l_h_OPR_RSLT_TYP = list; }
	public void setList_h_SPL_ITEM_TYP(List list) { l_h_SPL_ITEM_TYP = list; }
	public void setList_h_TAX_CD(List list) { l_h_TAX_CD = list; }
	public void setList_h_CAL_NO(List list) { l_h_CAL_NO = list; }
	public void setList_h_MANHOUR_TYP(List list) { l_h_MANHOUR_TYP = list; }
	public void setList_h_DEPO_TYP(List list) { l_h_DEPO_TYP = list; }
	public void setList_h_LOT_CTRL_FLG(List list) { l_h_LOT_CTRL_FLG = list; }
	public void setList_h_LOT_NUMBERING_TYP(List list) { l_h_LOT_NUMBERING_TYP = list; }
	public void setList_h_BEST_BEFORE_YEAR(List list) { l_h_BEST_BEFORE_YEAR = list; }
	public void setList_h_BEST_BEFORE_MONTH(List list) { l_h_BEST_BEFORE_MONTH = list; }
	public void setList_h_BEST_BEFORE_DAY(List list) { l_h_BEST_BEFORE_DAY = list; }
	public void setList_h_DEPT_CD(List list) { l_h_DEPT_CD = list; }
	public void setList_h_PJ_CD(List list) { l_h_PJ_CD = list; }
	public void setList_h_SEG_CONTENTS_1(List list) { l_h_SEG_CONTENTS_1 = list; }
	public void setList_h_SEG_CONTENTS_2(List list) { l_h_SEG_CONTENTS_2 = list; }
	public void setList_h_SEG_CONTENTS_3(List list) { l_h_SEG_CONTENTS_3 = list; }
	public void setList_h_SEG_CONTENTS_4(List list) { l_h_SEG_CONTENTS_4 = list; }
	public void setList_h_REMARK1(List list) { l_h_REMARK1 = list; }
	public void setList_h_REMARK2(List list) { l_h_REMARK2 = list; }
	public void setList_h_ITEM_CLASS_01_CD(List list) { l_h_ITEM_CLASS_01_CD = list; }
	public void setList_h_ITEM_CLASS_02_CD(List list) { l_h_ITEM_CLASS_02_CD = list; }
	public void setList_h_ITEM_CLASS_03_CD(List list) { l_h_ITEM_CLASS_03_CD = list; }
	public void setList_h_ITEM_CLASS_04_CD(List list) { l_h_ITEM_CLASS_04_CD = list; }
	public void setList_h_ITEM_CLASS_05_CD(List list) { l_h_ITEM_CLASS_05_CD = list; }
	public void setList_h_ITEM_CLASS_06_CD(List list) { l_h_ITEM_CLASS_06_CD = list; }
	public void setList_h_ITEM_CLASS_07_CD(List list) { l_h_ITEM_CLASS_07_CD = list; }
	public void setList_h_ITEM_CLASS_08_CD(List list) { l_h_ITEM_CLASS_08_CD = list; }
	public void setList_h_ITEM_CLASS_09_CD(List list) { l_h_ITEM_CLASS_09_CD = list; }
	public void setList_h_ITEM_CLASS_10_CD(List list) { l_h_ITEM_CLASS_10_CD = list; }
	public void setList_h_ITEM_CLASS_11_CD(List list) { l_h_ITEM_CLASS_11_CD = list; }
	public void setList_h_ITEM_CLASS_12_CD(List list) { l_h_ITEM_CLASS_12_CD = list; }
	public void setList_readTAX_CD(List list) { l_readTAX_CD = list; }
	public void setList_setTAXCD(List list) { l_setTAXCD = list; }
	public void setList_readITEM_CD(List list) { l_readITEM_CD = list; }
	public void setList_setITEM_CD(List list) { l_setITEM_CD = list; }
	public void setList_readVEND_CD(List list) { l_readVEND_CD = list; }
	public void setList_setVEND_CD(List list) { l_setVEND_CD = list; }
	public void setList_readPLANT_CD(List list) { l_readPLANT_CD = list; }
	public void setList_readSUM_PROP_LT(List list) { l_readSUM_PROP_LT = list; }
	public void setList_readSUM_FIXED_LT(List list) { l_readSUM_FIXED_LT = list; }
	public void setList_readMRP_ITEM_CD(List list) { l_readMRP_ITEM_CD = list; }
	public void setList_readMRP_ODR_TYP(List list) { l_readMRP_ODR_TYP = list; }
	public void setList_setMRP_ITEM_CD(List list) { l_setMRP_ITEM_CD = list; }
	public void setList_readMRP_ODR_ITEM_CD(List list) { l_readMRP_ODR_ITEM_CD = list; }
	public void setList_setMRP_ODR_ITEM_CD(List list) { l_setMRP_ODR_ITEM_CD = list; }
	public void setList_C_ITEM_CD(List list) { l_C_ITEM_CD = list; }
	public void setList_C_ITEM_NAME(List list) { l_C_ITEM_NAME = list; }
	public void setList_C_DRAW_CD(List list) { l_C_DRAW_CD = list; }
	public void setList_C_SPEC(List list) { l_C_SPEC = list; }
	public void setList_C_HIGH_LEVEL_NO(List list) { l_C_HIGH_LEVEL_NO = list; }
	public void setList_C_MRP_ODR_TYP(List list) { l_C_MRP_ODR_TYP = list; }
	public void setList_C_OUTSIDE_TYP(List list) { l_C_OUTSIDE_TYP = list; }
	public void setList_C_STOCK_UNIT_FLG(List list) { l_C_STOCK_UNIT_FLG = list; }
	public void setList_C_STOCK_UNIT(List list) { l_C_STOCK_UNIT = list; }
	public void setList_C_PKG_UNIT(List list) { l_C_PKG_UNIT = list; }
	public void setList_C_PKG_UNIT_QTY(List list) { l_C_PKG_UNIT_QTY = list; }
	public void setList_C_UNIT_QTY_TYP(List list) { l_C_UNIT_QTY_TYP = list; }
	public void setList_C_ODR_LT(List list) { l_C_ODR_LT = list; }
	public void setList_C_FIXED_LT(List list) { l_C_FIXED_LT = list; }
	public void setList_C_PROP_LT(List list) { l_C_PROP_LT = list; }
	public void setList_C_SAFETY_LT(List list) { l_C_SAFETY_LT = list; }
	public void setList_C_ISSUE_LT(List list) { l_C_ISSUE_LT = list; }
	public void setList_C_PROP_LOT_SIZE(List list) { l_C_PROP_LOT_SIZE = list; }
	public void setList_C_ITEM_SPOIL(List list) { l_C_ITEM_SPOIL = list; }
	public void setList_C_SAFETY_STOCK(List list) { l_C_SAFETY_STOCK = list; }
	public void setList_C_LOT_SIZING_TYP(List list) { l_C_LOT_SIZING_TYP = list; }
	public void setList_C_MAX_PERIOD(List list) { l_C_MAX_PERIOD = list; }
	public void setList_C_MAX_ODR_QTY(List list) { l_C_MAX_ODR_QTY = list; }
	public void setList_C_ODR_POINT(List list) { l_C_ODR_POINT = list; }
	public void setList_C_FIXED_ODR_QTY(List list) { l_C_FIXED_ODR_QTY = list; }
	public void setList_C_MIN_ODR_QTY(List list) { l_C_MIN_ODR_QTY = list; }
	public void setList_C_MUL_ODR_QTY(List list) { l_C_MUL_ODR_QTY = list; }
	public void setList_C_ISSUE_TYP(List list) { l_C_ISSUE_TYP = list; }
	public void setList_C_MPS_FLG(List list) { l_C_MPS_FLG = list; }
	public void setList_C_ACPT_INSPC_TYP(List list) { l_C_ACPT_INSPC_TYP = list; }
	public void setList_C_PRODUCT_TYP(List list) { l_C_PRODUCT_TYP = list; }
	public void setList_C_CLASIFICATION_CD(List list) { l_C_CLASIFICATION_CD = list; }
	public void setList_C_UNIT_WEIGHT(List list) { l_C_UNIT_WEIGHT = list; }
	public void setList_C_ABC_TYP(List list) { l_C_ABC_TYP = list; }
	public void setList_C_OPR_RSLT_TYP(List list) { l_C_OPR_RSLT_TYP = list; }
	public void setList_C_SPL_ITEM_TYP(List list) { l_C_SPL_ITEM_TYP = list; }
	public void setList_C_TAX_CD(List list) { l_C_TAX_CD = list; }
	public void setList_C_CAL_NO(List list) { l_C_CAL_NO = list; }
	public void setList_C_MANHOUR_TYP(List list) { l_C_MANHOUR_TYP = list; }
	public void setList_C_DEPO_TYP(List list) { l_C_DEPO_TYP = list; }
	public void setList_C_LOT_CTRL_FLG(List list) { l_C_LOT_CTRL_FLG = list; }
	public void setList_C_LOT_NUMBERING_TYP(List list) { l_C_LOT_NUMBERING_TYP = list; }
	public void setList_C_BEST_BEFORE_YEAR(List list) { l_C_BEST_BEFORE_YEAR = list; }
	public void setList_C_BEST_BEFORE_MONTH(List list) { l_C_BEST_BEFORE_MONTH = list; }
	public void setList_C_BEST_BEFORE_DAY(List list) { l_C_BEST_BEFORE_DAY = list; }
	public void setList_C_REMARK1(List list) { l_C_REMARK1 = list; }
	public void setList_C_REMARK2(List list) { l_C_REMARK2 = list; }
	public void setList_C_ITEM_CLASS_01_CD(List list) { l_C_ITEM_CLASS_01_CD = list; }
	public void setList_C_ITEM_CLASS_02_CD(List list) { l_C_ITEM_CLASS_02_CD = list; }
	public void setList_C_ITEM_CLASS_03_CD(List list) { l_C_ITEM_CLASS_03_CD = list; }
	public void setList_C_ITEM_CLASS_04_CD(List list) { l_C_ITEM_CLASS_04_CD = list; }
	public void setList_C_ITEM_CLASS_05_CD(List list) { l_C_ITEM_CLASS_05_CD = list; }
	public void setList_C_ITEM_CLASS_06_CD(List list) { l_C_ITEM_CLASS_06_CD = list; }
	public void setList_C_ITEM_CLASS_07_CD(List list) { l_C_ITEM_CLASS_07_CD = list; }
	public void setList_C_ITEM_CLASS_08_CD(List list) { l_C_ITEM_CLASS_08_CD = list; }
	public void setList_C_ITEM_CLASS_09_CD(List list) { l_C_ITEM_CLASS_09_CD = list; }
	public void setList_C_ITEM_CLASS_10_CD(List list) { l_C_ITEM_CLASS_10_CD = list; }
	public void setList_C_ITEM_CLASS_11_CD(List list) { l_C_ITEM_CLASS_11_CD = list; }
	public void setList_C_ITEM_CLASS_12_CD(List list) { l_C_ITEM_CLASS_12_CD = list; }
	public void setList_C_DEPT_CD(List list) { l_C_DEPT_CD = list; }
	public void setList_C_PJ_CD(List list) { l_C_PJ_CD = list; }
	public void setList_C_SEG_CONTENTS_1(List list) { l_C_SEG_CONTENTS_1 = list; }
	public void setList_C_SEG_CONTENTS_2(List list) { l_C_SEG_CONTENTS_2 = list; }
	public void setList_C_SEG_CONTENTS_3(List list) { l_C_SEG_CONTENTS_3 = list; }
	public void setList_C_SEG_CONTENTS_4(List list) { l_C_SEG_CONTENTS_4 = list; }
	public void setList_C_setITEM_CD(List list) { l_C_setITEM_CD = list; }
	public void setList_readT_OD_ITEM_CD(List list) { l_readT_OD_ITEM_CD = list; }
	public void setList_setT_OD_ITEM_CD(List list) { l_setT_OD_ITEM_CD = list; }
	public void setList_readM_PS_ITEM_CD(List list) { l_readM_PS_ITEM_CD = list; }
	public void setList_setM_PS_ITEM_CD(List list) { l_setM_PS_ITEM_CD = list; }
	public void setList_readT_ITEM_STOCK_ITEM_CD(List list) { l_readT_ITEM_STOCK_ITEM_CD = list; }
	public void setList_readT_ITEM_STOCK_STOCK_ON_HAND_QTY(List list) { l_readT_ITEM_STOCK_STOCK_ON_HAND_QTY = list; }
	public void setList_setT_ITEM_STOCK_ITEM_CD(List list) { l_setT_ITEM_STOCK_ITEM_CD = list; }
	public void setList_readT_JOB_ODR_CD_ITEM_CD(List list) { l_readT_JOB_ODR_CD_ITEM_CD = list; }
	public void setList_readT_JOB_ODR_CD_STOCK_ON_HAND_QTY(List list) { l_readT_JOB_ODR_CD_STOCK_ON_HAND_QTY = list; }
	public void setList_setT_JOB_ODR_CD_ITEM_CD(List list) { l_setT_JOB_ODR_CD_ITEM_CD = list; }
	public void setList_readT_RLSD_P_ITEM_CD(List list) { l_readT_RLSD_P_ITEM_CD = list; }
	public void setList_setT_RLSD_P_ITEM_CD(List list) { l_setT_RLSD_P_ITEM_CD = list; }
	public void setList_readT_WORK_IN_ITEM_CD(List list) { l_readT_WORK_IN_ITEM_CD = list; }
	public void setList_setT_WORK_IN_ITEM_CD(List list) { l_setT_WORK_IN_ITEM_CD = list; }
	public void setList_readT_JOB_ODR_ITEM_CD(List list) { l_readT_JOB_ODR_ITEM_CD = list; }
	public void setList_setT_JOB_ODR_ITEM_CD(List list) { l_setT_JOB_ODR_ITEM_CD = list; }
	public void setList_readT_OPR_RSLT_ITEM_CD(List list) { l_readT_OPR_RSLT_ITEM_CD = list; }
	public void setList_setT_OPR_RSLT_ITEM_CD(List list) { l_setT_OPR_RSLT_ITEM_CD = list; }
	public void setList_setM_WH_ITEM_CD(List list) { l_setM_WH_ITEM_CD = list; }
	public void setList_setM_WH_WH_CD(List list) { l_setM_WH_WH_CD = list; }
	public void setList_setM_WH_PLANT_CD(List list) { l_setM_WH_PLANT_CD = list; }
	public void setList_setM_WH_WH_REF_NO(List list) { l_setM_WH_WH_REF_NO = list; }
	public void setList_readM_WH_ITEM_CD(List list) { l_readM_WH_ITEM_CD = list; }
	public void setList_readM_WH_WH_CD(List list) { l_readM_WH_WH_CD = list; }
	public void setList_readM_CAL_H_CAL_NO(List list) { l_readM_CAL_H_CAL_NO = list; }
	public void setList_setM_CAL_H_CAL_NO(List list) { l_setM_CAL_H_CAL_NO = list; }
	public void setList_readCLASS_CD1(List list) { l_readCLASS_CD1 = list; }
	public void setList_setCLASS_CD2(List list) { l_setCLASS_CD2 = list; }
	public void setList_setCLASS_CD3(List list) { l_setCLASS_CD3 = list; }
	public void setList_readM_ITEM_STOCK_UNIT(List list) { l_readM_ITEM_STOCK_UNIT = list; }
	public void setList_readM_ITEM_LOT_CTRL_FLG(List list) { l_readM_ITEM_LOT_CTRL_FLG = list; }
	public void setList_readM_ITEM_MRP_ODR_TYP(List list) { l_readM_ITEM_MRP_ODR_TYP = list; }
	public void setList_setM_ITEM_ITEM_CD(List list) { l_setM_ITEM_ITEM_CD = list; }
	public void setList_setDISPLAY_NAME(List list) { l_setDISPLAY_NAME = list; }
	public void setList_VALUE(List list) { l_VALUE = list; }
	public void setList_DEPT_CD(List list) { l_DEPT_CD = list; }

	public int setL2L_rdoInsert(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoInsert == null) {
			l_rdoInsert = new ArrayList();
		} else {
			l_rdoInsert.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoInsert.add(((AA0150010Struct) list.get(i)).getrdoInsert());
		}
		return size;
	}
	public int setL2L_rdoUpdate(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoUpdate == null) {
			l_rdoUpdate = new ArrayList();
		} else {
			l_rdoUpdate.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoUpdate.add(((AA0150010Struct) list.get(i)).getrdoUpdate());
		}
		return size;
	}
	public int setL2L_rdoDelete(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_rdoDelete == null) {
			l_rdoDelete = new ArrayList();
		} else {
			l_rdoDelete.clear();
		}
		for (int i = 0; i < size; i++) {
			l_rdoDelete.add(((AA0150010Struct) list.get(i)).getrdoDelete());
		}
		return size;
	}
	public int setL2L_FileName(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FileName == null) {
			l_FileName = new ArrayList();
		} else {
			l_FileName.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FileName.add(((AA0150010Struct) list.get(i)).getFileName());
		}
		return size;
	}
	public int setL2L_DO_CHK(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DO_CHK == null) {
			l_DO_CHK = new ArrayList();
		} else {
			l_DO_CHK.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DO_CHK.add(((AA0150010Struct) list.get(i)).getDO_CHK());
		}
		return size;
	}
	public int setL2L_ERROR_IN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ERROR_IN == null) {
			l_ERROR_IN = new ArrayList();
		} else {
			l_ERROR_IN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ERROR_IN.add(((AA0150010Struct) list.get(i)).getERROR_IN());
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
			l_ITEM_CD.add(((AA0150010Struct) list.get(i)).getITEM_CD());
		}
		return size;
	}
	public int setL2L_ERR_CTR_NM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ERR_CTR_NM == null) {
			l_ERR_CTR_NM = new ArrayList();
		} else {
			l_ERR_CTR_NM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ERR_CTR_NM.add(((AA0150010Struct) list.get(i)).getERR_CTR_NM());
		}
		return size;
	}
	public int setL2L_ERR_INFO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ERR_INFO == null) {
			l_ERR_INFO = new ArrayList();
		} else {
			l_ERR_INFO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ERR_INFO.add(((AA0150010Struct) list.get(i)).getERR_INFO());
		}
		return size;
	}
	public int setL2L_h_SYORI_KUBUN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_SYORI_KUBUN == null) {
			l_h_SYORI_KUBUN = new ArrayList();
		} else {
			l_h_SYORI_KUBUN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_SYORI_KUBUN.add(((AA0150010Struct) list.get(i)).geth_SYORI_KUBUN());
		}
		return size;
	}
	public int setL2L_h_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_WH_CD == null) {
			l_h_WH_CD = new ArrayList();
		} else {
			l_h_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_WH_CD.add(((AA0150010Struct) list.get(i)).geth_WH_CD());
		}
		return size;
	}
	public int setL2L_CANCEL_FILE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CANCEL_FILE == null) {
			l_CANCEL_FILE = new ArrayList();
		} else {
			l_CANCEL_FILE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CANCEL_FILE.add(((AA0150010Struct) list.get(i)).getCANCEL_FILE());
		}
		return size;
	}
	public int setL2L_JUDGMENT_TXT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JUDGMENT_TXT == null) {
			l_JUDGMENT_TXT = new ArrayList();
		} else {
			l_JUDGMENT_TXT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JUDGMENT_TXT.add(((AA0150010Struct) list.get(i)).getJUDGMENT_TXT());
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
			l_DOWNLOAD_FILE.add(((AA0150010Struct) list.get(i)).getDOWNLOAD_FILE());
		}
		return size;
	}
	public int setL2L_ERR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ERR_TYP == null) {
			l_ERR_TYP = new ArrayList();
		} else {
			l_ERR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ERR_TYP.add(((AA0150010Struct) list.get(i)).getERR_TYP());
		}
		return size;
	}
	public int setL2L_w_COLUMN_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_w_COLUMN_FLG == null) {
			l_w_COLUMN_FLG = new ArrayList();
		} else {
			l_w_COLUMN_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_w_COLUMN_FLG.add(((AA0150010Struct) list.get(i)).getw_COLUMN_FLG());
		}
		return size;
	}
	public int setL2L_OUT_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OUT_ITEM_CD == null) {
			l_OUT_ITEM_CD = new ArrayList();
		} else {
			l_OUT_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OUT_ITEM_CD.add(((AA0150010Struct) list.get(i)).getOUT_ITEM_CD());
		}
		return size;
	}
	public int setL2L_readNAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readNAME == null) {
			l_readNAME = new ArrayList();
		} else {
			l_readNAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readNAME.add(((AA0150010Struct) list.get(i)).getreadNAME());
		}
		return size;
	}
	public int setL2L_readVALUE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readVALUE == null) {
			l_readVALUE = new ArrayList();
		} else {
			l_readVALUE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readVALUE.add(((AA0150010Struct) list.get(i)).getreadVALUE());
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
			l_DISPLAY_NAME.add(((AA0150010Struct) list.get(i)).getDISPLAY_NAME());
		}
		return size;
	}
	public int setL2L_setNAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setNAME == null) {
			l_setNAME = new ArrayList();
		} else {
			l_setNAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setNAME.add(((AA0150010Struct) list.get(i)).getsetNAME());
		}
		return size;
	}
	public int setL2L_setVALUE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setVALUE == null) {
			l_setVALUE = new ArrayList();
		} else {
			l_setVALUE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setVALUE.add(((AA0150010Struct) list.get(i)).getsetVALUE());
		}
		return size;
	}
	public int setL2L_readSYS_P_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readSYS_P_NAME == null) {
			l_readSYS_P_NAME = new ArrayList();
		} else {
			l_readSYS_P_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readSYS_P_NAME.add(((AA0150010Struct) list.get(i)).getreadSYS_P_NAME());
		}
		return size;
	}
	public int setL2L_readSYS_P_VALUE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readSYS_P_VALUE == null) {
			l_readSYS_P_VALUE = new ArrayList();
		} else {
			l_readSYS_P_VALUE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readSYS_P_VALUE.add(((AA0150010Struct) list.get(i)).getreadSYS_P_VALUE());
		}
		return size;
	}
	public int setL2L_setSYS_P_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setSYS_P_NAME == null) {
			l_setSYS_P_NAME = new ArrayList();
		} else {
			l_setSYS_P_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setSYS_P_NAME.add(((AA0150010Struct) list.get(i)).getsetSYS_P_NAME());
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
			l_h_ITEM_CD.add(((AA0150010Struct) list.get(i)).geth_ITEM_CD());
		}
		return size;
	}
	public int setL2L_h_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ITEM_NAME == null) {
			l_h_ITEM_NAME = new ArrayList();
		} else {
			l_h_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ITEM_NAME.add(((AA0150010Struct) list.get(i)).geth_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_h_DRAW_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_DRAW_CD == null) {
			l_h_DRAW_CD = new ArrayList();
		} else {
			l_h_DRAW_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_DRAW_CD.add(((AA0150010Struct) list.get(i)).geth_DRAW_CD());
		}
		return size;
	}
	public int setL2L_h_SPEC(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_SPEC == null) {
			l_h_SPEC = new ArrayList();
		} else {
			l_h_SPEC.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_SPEC.add(((AA0150010Struct) list.get(i)).geth_SPEC());
		}
		return size;
	}
	public int setL2L_h_HIGH_LEVEL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_HIGH_LEVEL_NO == null) {
			l_h_HIGH_LEVEL_NO = new ArrayList();
		} else {
			l_h_HIGH_LEVEL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_HIGH_LEVEL_NO.add(((AA0150010Struct) list.get(i)).geth_HIGH_LEVEL_NO());
		}
		return size;
	}
	public int setL2L_h_MRP_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_MRP_ODR_TYP == null) {
			l_h_MRP_ODR_TYP = new ArrayList();
		} else {
			l_h_MRP_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_MRP_ODR_TYP.add(((AA0150010Struct) list.get(i)).geth_MRP_ODR_TYP());
		}
		return size;
	}
	public int setL2L_h_OUTSIDE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_OUTSIDE_TYP == null) {
			l_h_OUTSIDE_TYP = new ArrayList();
		} else {
			l_h_OUTSIDE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_OUTSIDE_TYP.add(((AA0150010Struct) list.get(i)).geth_OUTSIDE_TYP());
		}
		return size;
	}
	public int setL2L_h_STOCK_UNIT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_STOCK_UNIT_FLG == null) {
			l_h_STOCK_UNIT_FLG = new ArrayList();
		} else {
			l_h_STOCK_UNIT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_STOCK_UNIT_FLG.add(((AA0150010Struct) list.get(i)).geth_STOCK_UNIT_FLG());
		}
		return size;
	}
	public int setL2L_h_STOCK_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_STOCK_UNIT == null) {
			l_h_STOCK_UNIT = new ArrayList();
		} else {
			l_h_STOCK_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_STOCK_UNIT.add(((AA0150010Struct) list.get(i)).geth_STOCK_UNIT());
		}
		return size;
	}
	public int setL2L_h_PKG_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PKG_UNIT == null) {
			l_h_PKG_UNIT = new ArrayList();
		} else {
			l_h_PKG_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PKG_UNIT.add(((AA0150010Struct) list.get(i)).geth_PKG_UNIT());
		}
		return size;
	}
	public int setL2L_h_PKG_UNIT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PKG_UNIT_QTY == null) {
			l_h_PKG_UNIT_QTY = new ArrayList();
		} else {
			l_h_PKG_UNIT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PKG_UNIT_QTY.add(((AA0150010Struct) list.get(i)).geth_PKG_UNIT_QTY());
		}
		return size;
	}
	public int setL2L_h_UNIT_QTY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_UNIT_QTY_TYP == null) {
			l_h_UNIT_QTY_TYP = new ArrayList();
		} else {
			l_h_UNIT_QTY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_UNIT_QTY_TYP.add(((AA0150010Struct) list.get(i)).geth_UNIT_QTY_TYP());
		}
		return size;
	}
	public int setL2L_h_ODR_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ODR_LT == null) {
			l_h_ODR_LT = new ArrayList();
		} else {
			l_h_ODR_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ODR_LT.add(((AA0150010Struct) list.get(i)).geth_ODR_LT());
		}
		return size;
	}
	public int setL2L_h_FIXED_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_FIXED_LT == null) {
			l_h_FIXED_LT = new ArrayList();
		} else {
			l_h_FIXED_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_FIXED_LT.add(((AA0150010Struct) list.get(i)).geth_FIXED_LT());
		}
		return size;
	}
	public int setL2L_h_PROP_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PROP_LT == null) {
			l_h_PROP_LT = new ArrayList();
		} else {
			l_h_PROP_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PROP_LT.add(((AA0150010Struct) list.get(i)).geth_PROP_LT());
		}
		return size;
	}
	public int setL2L_h_SAFETY_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_SAFETY_LT == null) {
			l_h_SAFETY_LT = new ArrayList();
		} else {
			l_h_SAFETY_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_SAFETY_LT.add(((AA0150010Struct) list.get(i)).geth_SAFETY_LT());
		}
		return size;
	}
	public int setL2L_h_ISSUE_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ISSUE_LT == null) {
			l_h_ISSUE_LT = new ArrayList();
		} else {
			l_h_ISSUE_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ISSUE_LT.add(((AA0150010Struct) list.get(i)).geth_ISSUE_LT());
		}
		return size;
	}
	public int setL2L_h_PROP_LOT_SIZE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PROP_LOT_SIZE == null) {
			l_h_PROP_LOT_SIZE = new ArrayList();
		} else {
			l_h_PROP_LOT_SIZE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PROP_LOT_SIZE.add(((AA0150010Struct) list.get(i)).geth_PROP_LOT_SIZE());
		}
		return size;
	}
	public int setL2L_h_ITEM_SPOIL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ITEM_SPOIL == null) {
			l_h_ITEM_SPOIL = new ArrayList();
		} else {
			l_h_ITEM_SPOIL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ITEM_SPOIL.add(((AA0150010Struct) list.get(i)).geth_ITEM_SPOIL());
		}
		return size;
	}
	public int setL2L_h_SAFETY_STOCK(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_SAFETY_STOCK == null) {
			l_h_SAFETY_STOCK = new ArrayList();
		} else {
			l_h_SAFETY_STOCK.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_SAFETY_STOCK.add(((AA0150010Struct) list.get(i)).geth_SAFETY_STOCK());
		}
		return size;
	}
	public int setL2L_h_LOT_SIZING_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_LOT_SIZING_TYP == null) {
			l_h_LOT_SIZING_TYP = new ArrayList();
		} else {
			l_h_LOT_SIZING_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_LOT_SIZING_TYP.add(((AA0150010Struct) list.get(i)).geth_LOT_SIZING_TYP());
		}
		return size;
	}
	public int setL2L_h_MAX_PERIOD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_MAX_PERIOD == null) {
			l_h_MAX_PERIOD = new ArrayList();
		} else {
			l_h_MAX_PERIOD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_MAX_PERIOD.add(((AA0150010Struct) list.get(i)).geth_MAX_PERIOD());
		}
		return size;
	}
	public int setL2L_h_MAX_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_MAX_ODR_QTY == null) {
			l_h_MAX_ODR_QTY = new ArrayList();
		} else {
			l_h_MAX_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_MAX_ODR_QTY.add(((AA0150010Struct) list.get(i)).geth_MAX_ODR_QTY());
		}
		return size;
	}
	public int setL2L_h_ODR_POINT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ODR_POINT == null) {
			l_h_ODR_POINT = new ArrayList();
		} else {
			l_h_ODR_POINT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ODR_POINT.add(((AA0150010Struct) list.get(i)).geth_ODR_POINT());
		}
		return size;
	}
	public int setL2L_h_FIXED_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_FIXED_ODR_QTY == null) {
			l_h_FIXED_ODR_QTY = new ArrayList();
		} else {
			l_h_FIXED_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_FIXED_ODR_QTY.add(((AA0150010Struct) list.get(i)).geth_FIXED_ODR_QTY());
		}
		return size;
	}
	public int setL2L_h_MIN_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_MIN_ODR_QTY == null) {
			l_h_MIN_ODR_QTY = new ArrayList();
		} else {
			l_h_MIN_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_MIN_ODR_QTY.add(((AA0150010Struct) list.get(i)).geth_MIN_ODR_QTY());
		}
		return size;
	}
	public int setL2L_h_MUL_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_MUL_ODR_QTY == null) {
			l_h_MUL_ODR_QTY = new ArrayList();
		} else {
			l_h_MUL_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_MUL_ODR_QTY.add(((AA0150010Struct) list.get(i)).geth_MUL_ODR_QTY());
		}
		return size;
	}
	public int setL2L_h_ISSUE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ISSUE_TYP == null) {
			l_h_ISSUE_TYP = new ArrayList();
		} else {
			l_h_ISSUE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ISSUE_TYP.add(((AA0150010Struct) list.get(i)).geth_ISSUE_TYP());
		}
		return size;
	}
	public int setL2L_h_MPS_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_MPS_FLG == null) {
			l_h_MPS_FLG = new ArrayList();
		} else {
			l_h_MPS_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_MPS_FLG.add(((AA0150010Struct) list.get(i)).geth_MPS_FLG());
		}
		return size;
	}
	public int setL2L_h_ACPT_INSPC_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ACPT_INSPC_TYP == null) {
			l_h_ACPT_INSPC_TYP = new ArrayList();
		} else {
			l_h_ACPT_INSPC_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ACPT_INSPC_TYP.add(((AA0150010Struct) list.get(i)).geth_ACPT_INSPC_TYP());
		}
		return size;
	}
	public int setL2L_h_PRODUCT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PRODUCT_TYP == null) {
			l_h_PRODUCT_TYP = new ArrayList();
		} else {
			l_h_PRODUCT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PRODUCT_TYP.add(((AA0150010Struct) list.get(i)).geth_PRODUCT_TYP());
		}
		return size;
	}
	public int setL2L_h_CLASIFICATION_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_CLASIFICATION_CD == null) {
			l_h_CLASIFICATION_CD = new ArrayList();
		} else {
			l_h_CLASIFICATION_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_CLASIFICATION_CD.add(((AA0150010Struct) list.get(i)).geth_CLASIFICATION_CD());
		}
		return size;
	}
	public int setL2L_h_UNIT_WEIGHT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_UNIT_WEIGHT == null) {
			l_h_UNIT_WEIGHT = new ArrayList();
		} else {
			l_h_UNIT_WEIGHT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_UNIT_WEIGHT.add(((AA0150010Struct) list.get(i)).geth_UNIT_WEIGHT());
		}
		return size;
	}
	public int setL2L_h_ABC_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ABC_TYP == null) {
			l_h_ABC_TYP = new ArrayList();
		} else {
			l_h_ABC_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ABC_TYP.add(((AA0150010Struct) list.get(i)).geth_ABC_TYP());
		}
		return size;
	}
	public int setL2L_h_OPR_RSLT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_OPR_RSLT_TYP == null) {
			l_h_OPR_RSLT_TYP = new ArrayList();
		} else {
			l_h_OPR_RSLT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_OPR_RSLT_TYP.add(((AA0150010Struct) list.get(i)).geth_OPR_RSLT_TYP());
		}
		return size;
	}
	public int setL2L_h_SPL_ITEM_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_SPL_ITEM_TYP == null) {
			l_h_SPL_ITEM_TYP = new ArrayList();
		} else {
			l_h_SPL_ITEM_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_SPL_ITEM_TYP.add(((AA0150010Struct) list.get(i)).geth_SPL_ITEM_TYP());
		}
		return size;
	}
	public int setL2L_h_TAX_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_TAX_CD == null) {
			l_h_TAX_CD = new ArrayList();
		} else {
			l_h_TAX_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_TAX_CD.add(((AA0150010Struct) list.get(i)).geth_TAX_CD());
		}
		return size;
	}
	public int setL2L_h_CAL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_CAL_NO == null) {
			l_h_CAL_NO = new ArrayList();
		} else {
			l_h_CAL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_CAL_NO.add(((AA0150010Struct) list.get(i)).geth_CAL_NO());
		}
		return size;
	}
	public int setL2L_h_MANHOUR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_MANHOUR_TYP == null) {
			l_h_MANHOUR_TYP = new ArrayList();
		} else {
			l_h_MANHOUR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_MANHOUR_TYP.add(((AA0150010Struct) list.get(i)).geth_MANHOUR_TYP());
		}
		return size;
	}
	public int setL2L_h_DEPO_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_DEPO_TYP == null) {
			l_h_DEPO_TYP = new ArrayList();
		} else {
			l_h_DEPO_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_DEPO_TYP.add(((AA0150010Struct) list.get(i)).geth_DEPO_TYP());
		}
		return size;
	}
	public int setL2L_h_LOT_CTRL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_LOT_CTRL_FLG == null) {
			l_h_LOT_CTRL_FLG = new ArrayList();
		} else {
			l_h_LOT_CTRL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_LOT_CTRL_FLG.add(((AA0150010Struct) list.get(i)).geth_LOT_CTRL_FLG());
		}
		return size;
	}
	public int setL2L_h_LOT_NUMBERING_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_LOT_NUMBERING_TYP == null) {
			l_h_LOT_NUMBERING_TYP = new ArrayList();
		} else {
			l_h_LOT_NUMBERING_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_LOT_NUMBERING_TYP.add(((AA0150010Struct) list.get(i)).geth_LOT_NUMBERING_TYP());
		}
		return size;
	}
	public int setL2L_h_BEST_BEFORE_YEAR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_BEST_BEFORE_YEAR == null) {
			l_h_BEST_BEFORE_YEAR = new ArrayList();
		} else {
			l_h_BEST_BEFORE_YEAR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_BEST_BEFORE_YEAR.add(((AA0150010Struct) list.get(i)).geth_BEST_BEFORE_YEAR());
		}
		return size;
	}
	public int setL2L_h_BEST_BEFORE_MONTH(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_BEST_BEFORE_MONTH == null) {
			l_h_BEST_BEFORE_MONTH = new ArrayList();
		} else {
			l_h_BEST_BEFORE_MONTH.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_BEST_BEFORE_MONTH.add(((AA0150010Struct) list.get(i)).geth_BEST_BEFORE_MONTH());
		}
		return size;
	}
	public int setL2L_h_BEST_BEFORE_DAY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_BEST_BEFORE_DAY == null) {
			l_h_BEST_BEFORE_DAY = new ArrayList();
		} else {
			l_h_BEST_BEFORE_DAY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_BEST_BEFORE_DAY.add(((AA0150010Struct) list.get(i)).geth_BEST_BEFORE_DAY());
		}
		return size;
	}
	public int setL2L_h_DEPT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_DEPT_CD == null) {
			l_h_DEPT_CD = new ArrayList();
		} else {
			l_h_DEPT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_DEPT_CD.add(((AA0150010Struct) list.get(i)).geth_DEPT_CD());
		}
		return size;
	}
	public int setL2L_h_PJ_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PJ_CD == null) {
			l_h_PJ_CD = new ArrayList();
		} else {
			l_h_PJ_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PJ_CD.add(((AA0150010Struct) list.get(i)).geth_PJ_CD());
		}
		return size;
	}
	public int setL2L_h_SEG_CONTENTS_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_SEG_CONTENTS_1 == null) {
			l_h_SEG_CONTENTS_1 = new ArrayList();
		} else {
			l_h_SEG_CONTENTS_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_SEG_CONTENTS_1.add(((AA0150010Struct) list.get(i)).geth_SEG_CONTENTS_1());
		}
		return size;
	}
	public int setL2L_h_SEG_CONTENTS_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_SEG_CONTENTS_2 == null) {
			l_h_SEG_CONTENTS_2 = new ArrayList();
		} else {
			l_h_SEG_CONTENTS_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_SEG_CONTENTS_2.add(((AA0150010Struct) list.get(i)).geth_SEG_CONTENTS_2());
		}
		return size;
	}
	public int setL2L_h_SEG_CONTENTS_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_SEG_CONTENTS_3 == null) {
			l_h_SEG_CONTENTS_3 = new ArrayList();
		} else {
			l_h_SEG_CONTENTS_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_SEG_CONTENTS_3.add(((AA0150010Struct) list.get(i)).geth_SEG_CONTENTS_3());
		}
		return size;
	}
	public int setL2L_h_SEG_CONTENTS_4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_SEG_CONTENTS_4 == null) {
			l_h_SEG_CONTENTS_4 = new ArrayList();
		} else {
			l_h_SEG_CONTENTS_4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_SEG_CONTENTS_4.add(((AA0150010Struct) list.get(i)).geth_SEG_CONTENTS_4());
		}
		return size;
	}
	public int setL2L_h_REMARK1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_REMARK1 == null) {
			l_h_REMARK1 = new ArrayList();
		} else {
			l_h_REMARK1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_REMARK1.add(((AA0150010Struct) list.get(i)).geth_REMARK1());
		}
		return size;
	}
	public int setL2L_h_REMARK2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_REMARK2 == null) {
			l_h_REMARK2 = new ArrayList();
		} else {
			l_h_REMARK2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_REMARK2.add(((AA0150010Struct) list.get(i)).geth_REMARK2());
		}
		return size;
	}
	public int setL2L_h_ITEM_CLASS_01_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ITEM_CLASS_01_CD == null) {
			l_h_ITEM_CLASS_01_CD = new ArrayList();
		} else {
			l_h_ITEM_CLASS_01_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ITEM_CLASS_01_CD.add(((AA0150010Struct) list.get(i)).geth_ITEM_CLASS_01_CD());
		}
		return size;
	}
	public int setL2L_h_ITEM_CLASS_02_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ITEM_CLASS_02_CD == null) {
			l_h_ITEM_CLASS_02_CD = new ArrayList();
		} else {
			l_h_ITEM_CLASS_02_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ITEM_CLASS_02_CD.add(((AA0150010Struct) list.get(i)).geth_ITEM_CLASS_02_CD());
		}
		return size;
	}
	public int setL2L_h_ITEM_CLASS_03_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ITEM_CLASS_03_CD == null) {
			l_h_ITEM_CLASS_03_CD = new ArrayList();
		} else {
			l_h_ITEM_CLASS_03_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ITEM_CLASS_03_CD.add(((AA0150010Struct) list.get(i)).geth_ITEM_CLASS_03_CD());
		}
		return size;
	}
	public int setL2L_h_ITEM_CLASS_04_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ITEM_CLASS_04_CD == null) {
			l_h_ITEM_CLASS_04_CD = new ArrayList();
		} else {
			l_h_ITEM_CLASS_04_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ITEM_CLASS_04_CD.add(((AA0150010Struct) list.get(i)).geth_ITEM_CLASS_04_CD());
		}
		return size;
	}
	public int setL2L_h_ITEM_CLASS_05_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ITEM_CLASS_05_CD == null) {
			l_h_ITEM_CLASS_05_CD = new ArrayList();
		} else {
			l_h_ITEM_CLASS_05_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ITEM_CLASS_05_CD.add(((AA0150010Struct) list.get(i)).geth_ITEM_CLASS_05_CD());
		}
		return size;
	}
	public int setL2L_h_ITEM_CLASS_06_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ITEM_CLASS_06_CD == null) {
			l_h_ITEM_CLASS_06_CD = new ArrayList();
		} else {
			l_h_ITEM_CLASS_06_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ITEM_CLASS_06_CD.add(((AA0150010Struct) list.get(i)).geth_ITEM_CLASS_06_CD());
		}
		return size;
	}
	public int setL2L_h_ITEM_CLASS_07_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ITEM_CLASS_07_CD == null) {
			l_h_ITEM_CLASS_07_CD = new ArrayList();
		} else {
			l_h_ITEM_CLASS_07_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ITEM_CLASS_07_CD.add(((AA0150010Struct) list.get(i)).geth_ITEM_CLASS_07_CD());
		}
		return size;
	}
	public int setL2L_h_ITEM_CLASS_08_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ITEM_CLASS_08_CD == null) {
			l_h_ITEM_CLASS_08_CD = new ArrayList();
		} else {
			l_h_ITEM_CLASS_08_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ITEM_CLASS_08_CD.add(((AA0150010Struct) list.get(i)).geth_ITEM_CLASS_08_CD());
		}
		return size;
	}
	public int setL2L_h_ITEM_CLASS_09_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ITEM_CLASS_09_CD == null) {
			l_h_ITEM_CLASS_09_CD = new ArrayList();
		} else {
			l_h_ITEM_CLASS_09_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ITEM_CLASS_09_CD.add(((AA0150010Struct) list.get(i)).geth_ITEM_CLASS_09_CD());
		}
		return size;
	}
	public int setL2L_h_ITEM_CLASS_10_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ITEM_CLASS_10_CD == null) {
			l_h_ITEM_CLASS_10_CD = new ArrayList();
		} else {
			l_h_ITEM_CLASS_10_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ITEM_CLASS_10_CD.add(((AA0150010Struct) list.get(i)).geth_ITEM_CLASS_10_CD());
		}
		return size;
	}
	public int setL2L_h_ITEM_CLASS_11_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ITEM_CLASS_11_CD == null) {
			l_h_ITEM_CLASS_11_CD = new ArrayList();
		} else {
			l_h_ITEM_CLASS_11_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ITEM_CLASS_11_CD.add(((AA0150010Struct) list.get(i)).geth_ITEM_CLASS_11_CD());
		}
		return size;
	}
	public int setL2L_h_ITEM_CLASS_12_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ITEM_CLASS_12_CD == null) {
			l_h_ITEM_CLASS_12_CD = new ArrayList();
		} else {
			l_h_ITEM_CLASS_12_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ITEM_CLASS_12_CD.add(((AA0150010Struct) list.get(i)).geth_ITEM_CLASS_12_CD());
		}
		return size;
	}
	public int setL2L_readTAX_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readTAX_CD == null) {
			l_readTAX_CD = new ArrayList();
		} else {
			l_readTAX_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readTAX_CD.add(((AA0150010Struct) list.get(i)).getreadTAX_CD());
		}
		return size;
	}
	public int setL2L_setTAXCD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setTAXCD == null) {
			l_setTAXCD = new ArrayList();
		} else {
			l_setTAXCD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setTAXCD.add(((AA0150010Struct) list.get(i)).getsetTAXCD());
		}
		return size;
	}
	public int setL2L_readITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readITEM_CD == null) {
			l_readITEM_CD = new ArrayList();
		} else {
			l_readITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readITEM_CD.add(((AA0150010Struct) list.get(i)).getreadITEM_CD());
		}
		return size;
	}
	public int setL2L_setITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setITEM_CD == null) {
			l_setITEM_CD = new ArrayList();
		} else {
			l_setITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setITEM_CD.add(((AA0150010Struct) list.get(i)).getsetITEM_CD());
		}
		return size;
	}
	public int setL2L_readVEND_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readVEND_CD == null) {
			l_readVEND_CD = new ArrayList();
		} else {
			l_readVEND_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readVEND_CD.add(((AA0150010Struct) list.get(i)).getreadVEND_CD());
		}
		return size;
	}
	public int setL2L_setVEND_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setVEND_CD == null) {
			l_setVEND_CD = new ArrayList();
		} else {
			l_setVEND_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setVEND_CD.add(((AA0150010Struct) list.get(i)).getsetVEND_CD());
		}
		return size;
	}
	public int setL2L_readPLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readPLANT_CD == null) {
			l_readPLANT_CD = new ArrayList();
		} else {
			l_readPLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readPLANT_CD.add(((AA0150010Struct) list.get(i)).getreadPLANT_CD());
		}
		return size;
	}
	public int setL2L_readSUM_PROP_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readSUM_PROP_LT == null) {
			l_readSUM_PROP_LT = new ArrayList();
		} else {
			l_readSUM_PROP_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readSUM_PROP_LT.add(((AA0150010Struct) list.get(i)).getreadSUM_PROP_LT());
		}
		return size;
	}
	public int setL2L_readSUM_FIXED_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readSUM_FIXED_LT == null) {
			l_readSUM_FIXED_LT = new ArrayList();
		} else {
			l_readSUM_FIXED_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readSUM_FIXED_LT.add(((AA0150010Struct) list.get(i)).getreadSUM_FIXED_LT());
		}
		return size;
	}
	public int setL2L_readMRP_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readMRP_ITEM_CD == null) {
			l_readMRP_ITEM_CD = new ArrayList();
		} else {
			l_readMRP_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readMRP_ITEM_CD.add(((AA0150010Struct) list.get(i)).getreadMRP_ITEM_CD());
		}
		return size;
	}
	public int setL2L_readMRP_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readMRP_ODR_TYP == null) {
			l_readMRP_ODR_TYP = new ArrayList();
		} else {
			l_readMRP_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readMRP_ODR_TYP.add(((AA0150010Struct) list.get(i)).getreadMRP_ODR_TYP());
		}
		return size;
	}
	public int setL2L_setMRP_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setMRP_ITEM_CD == null) {
			l_setMRP_ITEM_CD = new ArrayList();
		} else {
			l_setMRP_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setMRP_ITEM_CD.add(((AA0150010Struct) list.get(i)).getsetMRP_ITEM_CD());
		}
		return size;
	}
	public int setL2L_readMRP_ODR_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readMRP_ODR_ITEM_CD == null) {
			l_readMRP_ODR_ITEM_CD = new ArrayList();
		} else {
			l_readMRP_ODR_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readMRP_ODR_ITEM_CD.add(((AA0150010Struct) list.get(i)).getreadMRP_ODR_ITEM_CD());
		}
		return size;
	}
	public int setL2L_setMRP_ODR_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setMRP_ODR_ITEM_CD == null) {
			l_setMRP_ODR_ITEM_CD = new ArrayList();
		} else {
			l_setMRP_ODR_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setMRP_ODR_ITEM_CD.add(((AA0150010Struct) list.get(i)).getsetMRP_ODR_ITEM_CD());
		}
		return size;
	}
	public int setL2L_C_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_ITEM_CD == null) {
			l_C_ITEM_CD = new ArrayList();
		} else {
			l_C_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_ITEM_CD.add(((AA0150010Struct) list.get(i)).getC_ITEM_CD());
		}
		return size;
	}
	public int setL2L_C_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_ITEM_NAME == null) {
			l_C_ITEM_NAME = new ArrayList();
		} else {
			l_C_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_ITEM_NAME.add(((AA0150010Struct) list.get(i)).getC_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_C_DRAW_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_DRAW_CD == null) {
			l_C_DRAW_CD = new ArrayList();
		} else {
			l_C_DRAW_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_DRAW_CD.add(((AA0150010Struct) list.get(i)).getC_DRAW_CD());
		}
		return size;
	}
	public int setL2L_C_SPEC(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_SPEC == null) {
			l_C_SPEC = new ArrayList();
		} else {
			l_C_SPEC.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_SPEC.add(((AA0150010Struct) list.get(i)).getC_SPEC());
		}
		return size;
	}
	public int setL2L_C_HIGH_LEVEL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_HIGH_LEVEL_NO == null) {
			l_C_HIGH_LEVEL_NO = new ArrayList();
		} else {
			l_C_HIGH_LEVEL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_HIGH_LEVEL_NO.add(((AA0150010Struct) list.get(i)).getC_HIGH_LEVEL_NO());
		}
		return size;
	}
	public int setL2L_C_MRP_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_MRP_ODR_TYP == null) {
			l_C_MRP_ODR_TYP = new ArrayList();
		} else {
			l_C_MRP_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_MRP_ODR_TYP.add(((AA0150010Struct) list.get(i)).getC_MRP_ODR_TYP());
		}
		return size;
	}
	public int setL2L_C_OUTSIDE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_OUTSIDE_TYP == null) {
			l_C_OUTSIDE_TYP = new ArrayList();
		} else {
			l_C_OUTSIDE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_OUTSIDE_TYP.add(((AA0150010Struct) list.get(i)).getC_OUTSIDE_TYP());
		}
		return size;
	}
	public int setL2L_C_STOCK_UNIT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_STOCK_UNIT_FLG == null) {
			l_C_STOCK_UNIT_FLG = new ArrayList();
		} else {
			l_C_STOCK_UNIT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_STOCK_UNIT_FLG.add(((AA0150010Struct) list.get(i)).getC_STOCK_UNIT_FLG());
		}
		return size;
	}
	public int setL2L_C_STOCK_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_STOCK_UNIT == null) {
			l_C_STOCK_UNIT = new ArrayList();
		} else {
			l_C_STOCK_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_STOCK_UNIT.add(((AA0150010Struct) list.get(i)).getC_STOCK_UNIT());
		}
		return size;
	}
	public int setL2L_C_PKG_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_PKG_UNIT == null) {
			l_C_PKG_UNIT = new ArrayList();
		} else {
			l_C_PKG_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_PKG_UNIT.add(((AA0150010Struct) list.get(i)).getC_PKG_UNIT());
		}
		return size;
	}
	public int setL2L_C_PKG_UNIT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_PKG_UNIT_QTY == null) {
			l_C_PKG_UNIT_QTY = new ArrayList();
		} else {
			l_C_PKG_UNIT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_PKG_UNIT_QTY.add(((AA0150010Struct) list.get(i)).getC_PKG_UNIT_QTY());
		}
		return size;
	}
	public int setL2L_C_UNIT_QTY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_UNIT_QTY_TYP == null) {
			l_C_UNIT_QTY_TYP = new ArrayList();
		} else {
			l_C_UNIT_QTY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_UNIT_QTY_TYP.add(((AA0150010Struct) list.get(i)).getC_UNIT_QTY_TYP());
		}
		return size;
	}
	public int setL2L_C_ODR_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_ODR_LT == null) {
			l_C_ODR_LT = new ArrayList();
		} else {
			l_C_ODR_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_ODR_LT.add(((AA0150010Struct) list.get(i)).getC_ODR_LT());
		}
		return size;
	}
	public int setL2L_C_FIXED_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_FIXED_LT == null) {
			l_C_FIXED_LT = new ArrayList();
		} else {
			l_C_FIXED_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_FIXED_LT.add(((AA0150010Struct) list.get(i)).getC_FIXED_LT());
		}
		return size;
	}
	public int setL2L_C_PROP_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_PROP_LT == null) {
			l_C_PROP_LT = new ArrayList();
		} else {
			l_C_PROP_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_PROP_LT.add(((AA0150010Struct) list.get(i)).getC_PROP_LT());
		}
		return size;
	}
	public int setL2L_C_SAFETY_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_SAFETY_LT == null) {
			l_C_SAFETY_LT = new ArrayList();
		} else {
			l_C_SAFETY_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_SAFETY_LT.add(((AA0150010Struct) list.get(i)).getC_SAFETY_LT());
		}
		return size;
	}
	public int setL2L_C_ISSUE_LT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_ISSUE_LT == null) {
			l_C_ISSUE_LT = new ArrayList();
		} else {
			l_C_ISSUE_LT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_ISSUE_LT.add(((AA0150010Struct) list.get(i)).getC_ISSUE_LT());
		}
		return size;
	}
	public int setL2L_C_PROP_LOT_SIZE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_PROP_LOT_SIZE == null) {
			l_C_PROP_LOT_SIZE = new ArrayList();
		} else {
			l_C_PROP_LOT_SIZE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_PROP_LOT_SIZE.add(((AA0150010Struct) list.get(i)).getC_PROP_LOT_SIZE());
		}
		return size;
	}
	public int setL2L_C_ITEM_SPOIL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_ITEM_SPOIL == null) {
			l_C_ITEM_SPOIL = new ArrayList();
		} else {
			l_C_ITEM_SPOIL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_ITEM_SPOIL.add(((AA0150010Struct) list.get(i)).getC_ITEM_SPOIL());
		}
		return size;
	}
	public int setL2L_C_SAFETY_STOCK(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_SAFETY_STOCK == null) {
			l_C_SAFETY_STOCK = new ArrayList();
		} else {
			l_C_SAFETY_STOCK.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_SAFETY_STOCK.add(((AA0150010Struct) list.get(i)).getC_SAFETY_STOCK());
		}
		return size;
	}
	public int setL2L_C_LOT_SIZING_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_LOT_SIZING_TYP == null) {
			l_C_LOT_SIZING_TYP = new ArrayList();
		} else {
			l_C_LOT_SIZING_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_LOT_SIZING_TYP.add(((AA0150010Struct) list.get(i)).getC_LOT_SIZING_TYP());
		}
		return size;
	}
	public int setL2L_C_MAX_PERIOD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_MAX_PERIOD == null) {
			l_C_MAX_PERIOD = new ArrayList();
		} else {
			l_C_MAX_PERIOD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_MAX_PERIOD.add(((AA0150010Struct) list.get(i)).getC_MAX_PERIOD());
		}
		return size;
	}
	public int setL2L_C_MAX_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_MAX_ODR_QTY == null) {
			l_C_MAX_ODR_QTY = new ArrayList();
		} else {
			l_C_MAX_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_MAX_ODR_QTY.add(((AA0150010Struct) list.get(i)).getC_MAX_ODR_QTY());
		}
		return size;
	}
	public int setL2L_C_ODR_POINT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_ODR_POINT == null) {
			l_C_ODR_POINT = new ArrayList();
		} else {
			l_C_ODR_POINT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_ODR_POINT.add(((AA0150010Struct) list.get(i)).getC_ODR_POINT());
		}
		return size;
	}
	public int setL2L_C_FIXED_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_FIXED_ODR_QTY == null) {
			l_C_FIXED_ODR_QTY = new ArrayList();
		} else {
			l_C_FIXED_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_FIXED_ODR_QTY.add(((AA0150010Struct) list.get(i)).getC_FIXED_ODR_QTY());
		}
		return size;
	}
	public int setL2L_C_MIN_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_MIN_ODR_QTY == null) {
			l_C_MIN_ODR_QTY = new ArrayList();
		} else {
			l_C_MIN_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_MIN_ODR_QTY.add(((AA0150010Struct) list.get(i)).getC_MIN_ODR_QTY());
		}
		return size;
	}
	public int setL2L_C_MUL_ODR_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_MUL_ODR_QTY == null) {
			l_C_MUL_ODR_QTY = new ArrayList();
		} else {
			l_C_MUL_ODR_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_MUL_ODR_QTY.add(((AA0150010Struct) list.get(i)).getC_MUL_ODR_QTY());
		}
		return size;
	}
	public int setL2L_C_ISSUE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_ISSUE_TYP == null) {
			l_C_ISSUE_TYP = new ArrayList();
		} else {
			l_C_ISSUE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_ISSUE_TYP.add(((AA0150010Struct) list.get(i)).getC_ISSUE_TYP());
		}
		return size;
	}
	public int setL2L_C_MPS_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_MPS_FLG == null) {
			l_C_MPS_FLG = new ArrayList();
		} else {
			l_C_MPS_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_MPS_FLG.add(((AA0150010Struct) list.get(i)).getC_MPS_FLG());
		}
		return size;
	}
	public int setL2L_C_ACPT_INSPC_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_ACPT_INSPC_TYP == null) {
			l_C_ACPT_INSPC_TYP = new ArrayList();
		} else {
			l_C_ACPT_INSPC_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_ACPT_INSPC_TYP.add(((AA0150010Struct) list.get(i)).getC_ACPT_INSPC_TYP());
		}
		return size;
	}
	public int setL2L_C_PRODUCT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_PRODUCT_TYP == null) {
			l_C_PRODUCT_TYP = new ArrayList();
		} else {
			l_C_PRODUCT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_PRODUCT_TYP.add(((AA0150010Struct) list.get(i)).getC_PRODUCT_TYP());
		}
		return size;
	}
	public int setL2L_C_CLASIFICATION_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_CLASIFICATION_CD == null) {
			l_C_CLASIFICATION_CD = new ArrayList();
		} else {
			l_C_CLASIFICATION_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_CLASIFICATION_CD.add(((AA0150010Struct) list.get(i)).getC_CLASIFICATION_CD());
		}
		return size;
	}
	public int setL2L_C_UNIT_WEIGHT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_UNIT_WEIGHT == null) {
			l_C_UNIT_WEIGHT = new ArrayList();
		} else {
			l_C_UNIT_WEIGHT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_UNIT_WEIGHT.add(((AA0150010Struct) list.get(i)).getC_UNIT_WEIGHT());
		}
		return size;
	}
	public int setL2L_C_ABC_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_ABC_TYP == null) {
			l_C_ABC_TYP = new ArrayList();
		} else {
			l_C_ABC_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_ABC_TYP.add(((AA0150010Struct) list.get(i)).getC_ABC_TYP());
		}
		return size;
	}
	public int setL2L_C_OPR_RSLT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_OPR_RSLT_TYP == null) {
			l_C_OPR_RSLT_TYP = new ArrayList();
		} else {
			l_C_OPR_RSLT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_OPR_RSLT_TYP.add(((AA0150010Struct) list.get(i)).getC_OPR_RSLT_TYP());
		}
		return size;
	}
	public int setL2L_C_SPL_ITEM_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_SPL_ITEM_TYP == null) {
			l_C_SPL_ITEM_TYP = new ArrayList();
		} else {
			l_C_SPL_ITEM_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_SPL_ITEM_TYP.add(((AA0150010Struct) list.get(i)).getC_SPL_ITEM_TYP());
		}
		return size;
	}
	public int setL2L_C_TAX_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_TAX_CD == null) {
			l_C_TAX_CD = new ArrayList();
		} else {
			l_C_TAX_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_TAX_CD.add(((AA0150010Struct) list.get(i)).getC_TAX_CD());
		}
		return size;
	}
	public int setL2L_C_CAL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_CAL_NO == null) {
			l_C_CAL_NO = new ArrayList();
		} else {
			l_C_CAL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_CAL_NO.add(((AA0150010Struct) list.get(i)).getC_CAL_NO());
		}
		return size;
	}
	public int setL2L_C_MANHOUR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_MANHOUR_TYP == null) {
			l_C_MANHOUR_TYP = new ArrayList();
		} else {
			l_C_MANHOUR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_MANHOUR_TYP.add(((AA0150010Struct) list.get(i)).getC_MANHOUR_TYP());
		}
		return size;
	}
	public int setL2L_C_DEPO_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_DEPO_TYP == null) {
			l_C_DEPO_TYP = new ArrayList();
		} else {
			l_C_DEPO_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_DEPO_TYP.add(((AA0150010Struct) list.get(i)).getC_DEPO_TYP());
		}
		return size;
	}
	public int setL2L_C_LOT_CTRL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_LOT_CTRL_FLG == null) {
			l_C_LOT_CTRL_FLG = new ArrayList();
		} else {
			l_C_LOT_CTRL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_LOT_CTRL_FLG.add(((AA0150010Struct) list.get(i)).getC_LOT_CTRL_FLG());
		}
		return size;
	}
	public int setL2L_C_LOT_NUMBERING_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_LOT_NUMBERING_TYP == null) {
			l_C_LOT_NUMBERING_TYP = new ArrayList();
		} else {
			l_C_LOT_NUMBERING_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_LOT_NUMBERING_TYP.add(((AA0150010Struct) list.get(i)).getC_LOT_NUMBERING_TYP());
		}
		return size;
	}
	public int setL2L_C_BEST_BEFORE_YEAR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_BEST_BEFORE_YEAR == null) {
			l_C_BEST_BEFORE_YEAR = new ArrayList();
		} else {
			l_C_BEST_BEFORE_YEAR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_BEST_BEFORE_YEAR.add(((AA0150010Struct) list.get(i)).getC_BEST_BEFORE_YEAR());
		}
		return size;
	}
	public int setL2L_C_BEST_BEFORE_MONTH(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_BEST_BEFORE_MONTH == null) {
			l_C_BEST_BEFORE_MONTH = new ArrayList();
		} else {
			l_C_BEST_BEFORE_MONTH.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_BEST_BEFORE_MONTH.add(((AA0150010Struct) list.get(i)).getC_BEST_BEFORE_MONTH());
		}
		return size;
	}
	public int setL2L_C_BEST_BEFORE_DAY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_BEST_BEFORE_DAY == null) {
			l_C_BEST_BEFORE_DAY = new ArrayList();
		} else {
			l_C_BEST_BEFORE_DAY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_BEST_BEFORE_DAY.add(((AA0150010Struct) list.get(i)).getC_BEST_BEFORE_DAY());
		}
		return size;
	}
	public int setL2L_C_REMARK1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_REMARK1 == null) {
			l_C_REMARK1 = new ArrayList();
		} else {
			l_C_REMARK1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_REMARK1.add(((AA0150010Struct) list.get(i)).getC_REMARK1());
		}
		return size;
	}
	public int setL2L_C_REMARK2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_REMARK2 == null) {
			l_C_REMARK2 = new ArrayList();
		} else {
			l_C_REMARK2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_REMARK2.add(((AA0150010Struct) list.get(i)).getC_REMARK2());
		}
		return size;
	}
	public int setL2L_C_ITEM_CLASS_01_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_ITEM_CLASS_01_CD == null) {
			l_C_ITEM_CLASS_01_CD = new ArrayList();
		} else {
			l_C_ITEM_CLASS_01_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_ITEM_CLASS_01_CD.add(((AA0150010Struct) list.get(i)).getC_ITEM_CLASS_01_CD());
		}
		return size;
	}
	public int setL2L_C_ITEM_CLASS_02_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_ITEM_CLASS_02_CD == null) {
			l_C_ITEM_CLASS_02_CD = new ArrayList();
		} else {
			l_C_ITEM_CLASS_02_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_ITEM_CLASS_02_CD.add(((AA0150010Struct) list.get(i)).getC_ITEM_CLASS_02_CD());
		}
		return size;
	}
	public int setL2L_C_ITEM_CLASS_03_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_ITEM_CLASS_03_CD == null) {
			l_C_ITEM_CLASS_03_CD = new ArrayList();
		} else {
			l_C_ITEM_CLASS_03_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_ITEM_CLASS_03_CD.add(((AA0150010Struct) list.get(i)).getC_ITEM_CLASS_03_CD());
		}
		return size;
	}
	public int setL2L_C_ITEM_CLASS_04_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_ITEM_CLASS_04_CD == null) {
			l_C_ITEM_CLASS_04_CD = new ArrayList();
		} else {
			l_C_ITEM_CLASS_04_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_ITEM_CLASS_04_CD.add(((AA0150010Struct) list.get(i)).getC_ITEM_CLASS_04_CD());
		}
		return size;
	}
	public int setL2L_C_ITEM_CLASS_05_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_ITEM_CLASS_05_CD == null) {
			l_C_ITEM_CLASS_05_CD = new ArrayList();
		} else {
			l_C_ITEM_CLASS_05_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_ITEM_CLASS_05_CD.add(((AA0150010Struct) list.get(i)).getC_ITEM_CLASS_05_CD());
		}
		return size;
	}
	public int setL2L_C_ITEM_CLASS_06_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_ITEM_CLASS_06_CD == null) {
			l_C_ITEM_CLASS_06_CD = new ArrayList();
		} else {
			l_C_ITEM_CLASS_06_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_ITEM_CLASS_06_CD.add(((AA0150010Struct) list.get(i)).getC_ITEM_CLASS_06_CD());
		}
		return size;
	}
	public int setL2L_C_ITEM_CLASS_07_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_ITEM_CLASS_07_CD == null) {
			l_C_ITEM_CLASS_07_CD = new ArrayList();
		} else {
			l_C_ITEM_CLASS_07_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_ITEM_CLASS_07_CD.add(((AA0150010Struct) list.get(i)).getC_ITEM_CLASS_07_CD());
		}
		return size;
	}
	public int setL2L_C_ITEM_CLASS_08_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_ITEM_CLASS_08_CD == null) {
			l_C_ITEM_CLASS_08_CD = new ArrayList();
		} else {
			l_C_ITEM_CLASS_08_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_ITEM_CLASS_08_CD.add(((AA0150010Struct) list.get(i)).getC_ITEM_CLASS_08_CD());
		}
		return size;
	}
	public int setL2L_C_ITEM_CLASS_09_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_ITEM_CLASS_09_CD == null) {
			l_C_ITEM_CLASS_09_CD = new ArrayList();
		} else {
			l_C_ITEM_CLASS_09_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_ITEM_CLASS_09_CD.add(((AA0150010Struct) list.get(i)).getC_ITEM_CLASS_09_CD());
		}
		return size;
	}
	public int setL2L_C_ITEM_CLASS_10_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_ITEM_CLASS_10_CD == null) {
			l_C_ITEM_CLASS_10_CD = new ArrayList();
		} else {
			l_C_ITEM_CLASS_10_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_ITEM_CLASS_10_CD.add(((AA0150010Struct) list.get(i)).getC_ITEM_CLASS_10_CD());
		}
		return size;
	}
	public int setL2L_C_ITEM_CLASS_11_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_ITEM_CLASS_11_CD == null) {
			l_C_ITEM_CLASS_11_CD = new ArrayList();
		} else {
			l_C_ITEM_CLASS_11_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_ITEM_CLASS_11_CD.add(((AA0150010Struct) list.get(i)).getC_ITEM_CLASS_11_CD());
		}
		return size;
	}
	public int setL2L_C_ITEM_CLASS_12_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_ITEM_CLASS_12_CD == null) {
			l_C_ITEM_CLASS_12_CD = new ArrayList();
		} else {
			l_C_ITEM_CLASS_12_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_ITEM_CLASS_12_CD.add(((AA0150010Struct) list.get(i)).getC_ITEM_CLASS_12_CD());
		}
		return size;
	}
	public int setL2L_C_DEPT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_DEPT_CD == null) {
			l_C_DEPT_CD = new ArrayList();
		} else {
			l_C_DEPT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_DEPT_CD.add(((AA0150010Struct) list.get(i)).getC_DEPT_CD());
		}
		return size;
	}
	public int setL2L_C_PJ_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_PJ_CD == null) {
			l_C_PJ_CD = new ArrayList();
		} else {
			l_C_PJ_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_PJ_CD.add(((AA0150010Struct) list.get(i)).getC_PJ_CD());
		}
		return size;
	}
	public int setL2L_C_SEG_CONTENTS_1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_SEG_CONTENTS_1 == null) {
			l_C_SEG_CONTENTS_1 = new ArrayList();
		} else {
			l_C_SEG_CONTENTS_1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_SEG_CONTENTS_1.add(((AA0150010Struct) list.get(i)).getC_SEG_CONTENTS_1());
		}
		return size;
	}
	public int setL2L_C_SEG_CONTENTS_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_SEG_CONTENTS_2 == null) {
			l_C_SEG_CONTENTS_2 = new ArrayList();
		} else {
			l_C_SEG_CONTENTS_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_SEG_CONTENTS_2.add(((AA0150010Struct) list.get(i)).getC_SEG_CONTENTS_2());
		}
		return size;
	}
	public int setL2L_C_SEG_CONTENTS_3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_SEG_CONTENTS_3 == null) {
			l_C_SEG_CONTENTS_3 = new ArrayList();
		} else {
			l_C_SEG_CONTENTS_3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_SEG_CONTENTS_3.add(((AA0150010Struct) list.get(i)).getC_SEG_CONTENTS_3());
		}
		return size;
	}
	public int setL2L_C_SEG_CONTENTS_4(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_SEG_CONTENTS_4 == null) {
			l_C_SEG_CONTENTS_4 = new ArrayList();
		} else {
			l_C_SEG_CONTENTS_4.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_SEG_CONTENTS_4.add(((AA0150010Struct) list.get(i)).getC_SEG_CONTENTS_4());
		}
		return size;
	}
	public int setL2L_C_setITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_C_setITEM_CD == null) {
			l_C_setITEM_CD = new ArrayList();
		} else {
			l_C_setITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_C_setITEM_CD.add(((AA0150010Struct) list.get(i)).getC_setITEM_CD());
		}
		return size;
	}
	public int setL2L_readT_OD_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readT_OD_ITEM_CD == null) {
			l_readT_OD_ITEM_CD = new ArrayList();
		} else {
			l_readT_OD_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readT_OD_ITEM_CD.add(((AA0150010Struct) list.get(i)).getreadT_OD_ITEM_CD());
		}
		return size;
	}
	public int setL2L_setT_OD_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setT_OD_ITEM_CD == null) {
			l_setT_OD_ITEM_CD = new ArrayList();
		} else {
			l_setT_OD_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setT_OD_ITEM_CD.add(((AA0150010Struct) list.get(i)).getsetT_OD_ITEM_CD());
		}
		return size;
	}
	public int setL2L_readM_PS_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readM_PS_ITEM_CD == null) {
			l_readM_PS_ITEM_CD = new ArrayList();
		} else {
			l_readM_PS_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readM_PS_ITEM_CD.add(((AA0150010Struct) list.get(i)).getreadM_PS_ITEM_CD());
		}
		return size;
	}
	public int setL2L_setM_PS_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setM_PS_ITEM_CD == null) {
			l_setM_PS_ITEM_CD = new ArrayList();
		} else {
			l_setM_PS_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setM_PS_ITEM_CD.add(((AA0150010Struct) list.get(i)).getsetM_PS_ITEM_CD());
		}
		return size;
	}
	public int setL2L_readT_ITEM_STOCK_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readT_ITEM_STOCK_ITEM_CD == null) {
			l_readT_ITEM_STOCK_ITEM_CD = new ArrayList();
		} else {
			l_readT_ITEM_STOCK_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readT_ITEM_STOCK_ITEM_CD.add(((AA0150010Struct) list.get(i)).getreadT_ITEM_STOCK_ITEM_CD());
		}
		return size;
	}
	public int setL2L_readT_ITEM_STOCK_STOCK_ON_HAND_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readT_ITEM_STOCK_STOCK_ON_HAND_QTY == null) {
			l_readT_ITEM_STOCK_STOCK_ON_HAND_QTY = new ArrayList();
		} else {
			l_readT_ITEM_STOCK_STOCK_ON_HAND_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readT_ITEM_STOCK_STOCK_ON_HAND_QTY.add(((AA0150010Struct) list.get(i)).getreadT_ITEM_STOCK_STOCK_ON_HAND_QTY());
		}
		return size;
	}
	public int setL2L_setT_ITEM_STOCK_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setT_ITEM_STOCK_ITEM_CD == null) {
			l_setT_ITEM_STOCK_ITEM_CD = new ArrayList();
		} else {
			l_setT_ITEM_STOCK_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setT_ITEM_STOCK_ITEM_CD.add(((AA0150010Struct) list.get(i)).getsetT_ITEM_STOCK_ITEM_CD());
		}
		return size;
	}
	public int setL2L_readT_JOB_ODR_CD_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readT_JOB_ODR_CD_ITEM_CD == null) {
			l_readT_JOB_ODR_CD_ITEM_CD = new ArrayList();
		} else {
			l_readT_JOB_ODR_CD_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readT_JOB_ODR_CD_ITEM_CD.add(((AA0150010Struct) list.get(i)).getreadT_JOB_ODR_CD_ITEM_CD());
		}
		return size;
	}
	public int setL2L_readT_JOB_ODR_CD_STOCK_ON_HAND_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readT_JOB_ODR_CD_STOCK_ON_HAND_QTY == null) {
			l_readT_JOB_ODR_CD_STOCK_ON_HAND_QTY = new ArrayList();
		} else {
			l_readT_JOB_ODR_CD_STOCK_ON_HAND_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readT_JOB_ODR_CD_STOCK_ON_HAND_QTY.add(((AA0150010Struct) list.get(i)).getreadT_JOB_ODR_CD_STOCK_ON_HAND_QTY());
		}
		return size;
	}
	public int setL2L_setT_JOB_ODR_CD_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setT_JOB_ODR_CD_ITEM_CD == null) {
			l_setT_JOB_ODR_CD_ITEM_CD = new ArrayList();
		} else {
			l_setT_JOB_ODR_CD_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setT_JOB_ODR_CD_ITEM_CD.add(((AA0150010Struct) list.get(i)).getsetT_JOB_ODR_CD_ITEM_CD());
		}
		return size;
	}
	public int setL2L_readT_RLSD_P_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readT_RLSD_P_ITEM_CD == null) {
			l_readT_RLSD_P_ITEM_CD = new ArrayList();
		} else {
			l_readT_RLSD_P_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readT_RLSD_P_ITEM_CD.add(((AA0150010Struct) list.get(i)).getreadT_RLSD_P_ITEM_CD());
		}
		return size;
	}
	public int setL2L_setT_RLSD_P_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setT_RLSD_P_ITEM_CD == null) {
			l_setT_RLSD_P_ITEM_CD = new ArrayList();
		} else {
			l_setT_RLSD_P_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setT_RLSD_P_ITEM_CD.add(((AA0150010Struct) list.get(i)).getsetT_RLSD_P_ITEM_CD());
		}
		return size;
	}
	public int setL2L_readT_WORK_IN_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readT_WORK_IN_ITEM_CD == null) {
			l_readT_WORK_IN_ITEM_CD = new ArrayList();
		} else {
			l_readT_WORK_IN_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readT_WORK_IN_ITEM_CD.add(((AA0150010Struct) list.get(i)).getreadT_WORK_IN_ITEM_CD());
		}
		return size;
	}
	public int setL2L_setT_WORK_IN_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setT_WORK_IN_ITEM_CD == null) {
			l_setT_WORK_IN_ITEM_CD = new ArrayList();
		} else {
			l_setT_WORK_IN_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setT_WORK_IN_ITEM_CD.add(((AA0150010Struct) list.get(i)).getsetT_WORK_IN_ITEM_CD());
		}
		return size;
	}
	public int setL2L_readT_JOB_ODR_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readT_JOB_ODR_ITEM_CD == null) {
			l_readT_JOB_ODR_ITEM_CD = new ArrayList();
		} else {
			l_readT_JOB_ODR_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readT_JOB_ODR_ITEM_CD.add(((AA0150010Struct) list.get(i)).getreadT_JOB_ODR_ITEM_CD());
		}
		return size;
	}
	public int setL2L_setT_JOB_ODR_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setT_JOB_ODR_ITEM_CD == null) {
			l_setT_JOB_ODR_ITEM_CD = new ArrayList();
		} else {
			l_setT_JOB_ODR_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setT_JOB_ODR_ITEM_CD.add(((AA0150010Struct) list.get(i)).getsetT_JOB_ODR_ITEM_CD());
		}
		return size;
	}
	public int setL2L_readT_OPR_RSLT_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readT_OPR_RSLT_ITEM_CD == null) {
			l_readT_OPR_RSLT_ITEM_CD = new ArrayList();
		} else {
			l_readT_OPR_RSLT_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readT_OPR_RSLT_ITEM_CD.add(((AA0150010Struct) list.get(i)).getreadT_OPR_RSLT_ITEM_CD());
		}
		return size;
	}
	public int setL2L_setT_OPR_RSLT_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setT_OPR_RSLT_ITEM_CD == null) {
			l_setT_OPR_RSLT_ITEM_CD = new ArrayList();
		} else {
			l_setT_OPR_RSLT_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setT_OPR_RSLT_ITEM_CD.add(((AA0150010Struct) list.get(i)).getsetT_OPR_RSLT_ITEM_CD());
		}
		return size;
	}
	public int setL2L_setM_WH_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setM_WH_ITEM_CD == null) {
			l_setM_WH_ITEM_CD = new ArrayList();
		} else {
			l_setM_WH_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setM_WH_ITEM_CD.add(((AA0150010Struct) list.get(i)).getsetM_WH_ITEM_CD());
		}
		return size;
	}
	public int setL2L_setM_WH_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setM_WH_WH_CD == null) {
			l_setM_WH_WH_CD = new ArrayList();
		} else {
			l_setM_WH_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setM_WH_WH_CD.add(((AA0150010Struct) list.get(i)).getsetM_WH_WH_CD());
		}
		return size;
	}
	public int setL2L_setM_WH_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setM_WH_PLANT_CD == null) {
			l_setM_WH_PLANT_CD = new ArrayList();
		} else {
			l_setM_WH_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setM_WH_PLANT_CD.add(((AA0150010Struct) list.get(i)).getsetM_WH_PLANT_CD());
		}
		return size;
	}
	public int setL2L_setM_WH_WH_REF_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setM_WH_WH_REF_NO == null) {
			l_setM_WH_WH_REF_NO = new ArrayList();
		} else {
			l_setM_WH_WH_REF_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setM_WH_WH_REF_NO.add(((AA0150010Struct) list.get(i)).getsetM_WH_WH_REF_NO());
		}
		return size;
	}
	public int setL2L_readM_WH_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readM_WH_ITEM_CD == null) {
			l_readM_WH_ITEM_CD = new ArrayList();
		} else {
			l_readM_WH_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readM_WH_ITEM_CD.add(((AA0150010Struct) list.get(i)).getreadM_WH_ITEM_CD());
		}
		return size;
	}
	public int setL2L_readM_WH_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readM_WH_WH_CD == null) {
			l_readM_WH_WH_CD = new ArrayList();
		} else {
			l_readM_WH_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readM_WH_WH_CD.add(((AA0150010Struct) list.get(i)).getreadM_WH_WH_CD());
		}
		return size;
	}
	public int setL2L_readM_CAL_H_CAL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readM_CAL_H_CAL_NO == null) {
			l_readM_CAL_H_CAL_NO = new ArrayList();
		} else {
			l_readM_CAL_H_CAL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readM_CAL_H_CAL_NO.add(((AA0150010Struct) list.get(i)).getreadM_CAL_H_CAL_NO());
		}
		return size;
	}
	public int setL2L_setM_CAL_H_CAL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setM_CAL_H_CAL_NO == null) {
			l_setM_CAL_H_CAL_NO = new ArrayList();
		} else {
			l_setM_CAL_H_CAL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setM_CAL_H_CAL_NO.add(((AA0150010Struct) list.get(i)).getsetM_CAL_H_CAL_NO());
		}
		return size;
	}
	public int setL2L_readCLASS_CD1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readCLASS_CD1 == null) {
			l_readCLASS_CD1 = new ArrayList();
		} else {
			l_readCLASS_CD1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readCLASS_CD1.add(((AA0150010Struct) list.get(i)).getreadCLASS_CD1());
		}
		return size;
	}
	public int setL2L_setCLASS_CD2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setCLASS_CD2 == null) {
			l_setCLASS_CD2 = new ArrayList();
		} else {
			l_setCLASS_CD2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setCLASS_CD2.add(((AA0150010Struct) list.get(i)).getsetCLASS_CD2());
		}
		return size;
	}
	public int setL2L_setCLASS_CD3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setCLASS_CD3 == null) {
			l_setCLASS_CD3 = new ArrayList();
		} else {
			l_setCLASS_CD3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setCLASS_CD3.add(((AA0150010Struct) list.get(i)).getsetCLASS_CD3());
		}
		return size;
	}
	public int setL2L_readM_ITEM_STOCK_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readM_ITEM_STOCK_UNIT == null) {
			l_readM_ITEM_STOCK_UNIT = new ArrayList();
		} else {
			l_readM_ITEM_STOCK_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readM_ITEM_STOCK_UNIT.add(((AA0150010Struct) list.get(i)).getreadM_ITEM_STOCK_UNIT());
		}
		return size;
	}
	public int setL2L_readM_ITEM_LOT_CTRL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readM_ITEM_LOT_CTRL_FLG == null) {
			l_readM_ITEM_LOT_CTRL_FLG = new ArrayList();
		} else {
			l_readM_ITEM_LOT_CTRL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readM_ITEM_LOT_CTRL_FLG.add(((AA0150010Struct) list.get(i)).getreadM_ITEM_LOT_CTRL_FLG());
		}
		return size;
	}
	public int setL2L_readM_ITEM_MRP_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_readM_ITEM_MRP_ODR_TYP == null) {
			l_readM_ITEM_MRP_ODR_TYP = new ArrayList();
		} else {
			l_readM_ITEM_MRP_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_readM_ITEM_MRP_ODR_TYP.add(((AA0150010Struct) list.get(i)).getreadM_ITEM_MRP_ODR_TYP());
		}
		return size;
	}
	public int setL2L_setM_ITEM_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setM_ITEM_ITEM_CD == null) {
			l_setM_ITEM_ITEM_CD = new ArrayList();
		} else {
			l_setM_ITEM_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setM_ITEM_ITEM_CD.add(((AA0150010Struct) list.get(i)).getsetM_ITEM_ITEM_CD());
		}
		return size;
	}
	public int setL2L_setDISPLAY_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_setDISPLAY_NAME == null) {
			l_setDISPLAY_NAME = new ArrayList();
		} else {
			l_setDISPLAY_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_setDISPLAY_NAME.add(((AA0150010Struct) list.get(i)).getsetDISPLAY_NAME());
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
			l_VALUE.add(((AA0150010Struct) list.get(i)).getVALUE());
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
			l_DEPT_CD.add(((AA0150010Struct) list.get(i)).getDEPT_CD());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_rdoInsert = null;
		m_rdoUpdate = null;
		m_rdoDelete = null;
		m_FileName = null;
		m_DO_CHK = null;
		m_ERROR_IN = null;
		m_ITEM_CD = null;
		m_ERR_CTR_NM = null;
		m_ERR_INFO = null;
		m_h_SYORI_KUBUN = null;
		m_h_WH_CD = null;
		m_CANCEL_FILE = null;
		m_JUDGMENT_TXT = null;
		m_DOWNLOAD_FILE = null;
		m_ERR_TYP = null;
		m_w_COLUMN_FLG = null;
		m_OUT_ITEM_CD = null;
		m_readNAME = null;
		m_readVALUE = null;
		m_DISPLAY_NAME = null;
		m_setNAME = null;
		m_setVALUE = null;
		m_readSYS_P_NAME = null;
		m_readSYS_P_VALUE = null;
		m_setSYS_P_NAME = null;
		m_h_ITEM_CD = null;
		m_h_ITEM_NAME = null;
		m_h_DRAW_CD = null;
		m_h_SPEC = null;
		m_h_HIGH_LEVEL_NO = null;
		m_h_MRP_ODR_TYP = null;
		m_h_OUTSIDE_TYP = null;
		m_h_STOCK_UNIT_FLG = null;
		m_h_STOCK_UNIT = null;
		m_h_PKG_UNIT = null;
		m_h_PKG_UNIT_QTY = null;
		m_h_UNIT_QTY_TYP = null;
		m_h_ODR_LT = null;
		m_h_FIXED_LT = null;
		m_h_PROP_LT = null;
		m_h_SAFETY_LT = null;
		m_h_ISSUE_LT = null;
		m_h_PROP_LOT_SIZE = null;
		m_h_ITEM_SPOIL = null;
		m_h_SAFETY_STOCK = null;
		m_h_LOT_SIZING_TYP = null;
		m_h_MAX_PERIOD = null;
		m_h_MAX_ODR_QTY = null;
		m_h_ODR_POINT = null;
		m_h_FIXED_ODR_QTY = null;
		m_h_MIN_ODR_QTY = null;
		m_h_MUL_ODR_QTY = null;
		m_h_ISSUE_TYP = null;
		m_h_MPS_FLG = null;
		m_h_ACPT_INSPC_TYP = null;
		m_h_PRODUCT_TYP = null;
		m_h_CLASIFICATION_CD = null;
		m_h_UNIT_WEIGHT = null;
		m_h_ABC_TYP = null;
		m_h_OPR_RSLT_TYP = null;
		m_h_SPL_ITEM_TYP = null;
		m_h_TAX_CD = null;
		m_h_CAL_NO = null;
		m_h_MANHOUR_TYP = null;
		m_h_DEPO_TYP = null;
		m_h_LOT_CTRL_FLG = null;
		m_h_LOT_NUMBERING_TYP = null;
		m_h_BEST_BEFORE_YEAR = null;
		m_h_BEST_BEFORE_MONTH = null;
		m_h_BEST_BEFORE_DAY = null;
		m_h_DEPT_CD = null;
		m_h_PJ_CD = null;
		m_h_SEG_CONTENTS_1 = null;
		m_h_SEG_CONTENTS_2 = null;
		m_h_SEG_CONTENTS_3 = null;
		m_h_SEG_CONTENTS_4 = null;
		m_h_REMARK1 = null;
		m_h_REMARK2 = null;
		m_h_ITEM_CLASS_01_CD = null;
		m_h_ITEM_CLASS_02_CD = null;
		m_h_ITEM_CLASS_03_CD = null;
		m_h_ITEM_CLASS_04_CD = null;
		m_h_ITEM_CLASS_05_CD = null;
		m_h_ITEM_CLASS_06_CD = null;
		m_h_ITEM_CLASS_07_CD = null;
		m_h_ITEM_CLASS_08_CD = null;
		m_h_ITEM_CLASS_09_CD = null;
		m_h_ITEM_CLASS_10_CD = null;
		m_h_ITEM_CLASS_11_CD = null;
		m_h_ITEM_CLASS_12_CD = null;
		m_readTAX_CD = null;
		m_setTAXCD = null;
		m_readITEM_CD = null;
		m_setITEM_CD = null;
		m_readVEND_CD = null;
		m_setVEND_CD = null;
		m_readPLANT_CD = null;
		m_readSUM_PROP_LT = null;
		m_readSUM_FIXED_LT = null;
		m_readMRP_ITEM_CD = null;
		m_readMRP_ODR_TYP = null;
		m_setMRP_ITEM_CD = null;
		m_readMRP_ODR_ITEM_CD = null;
		m_setMRP_ODR_ITEM_CD = null;
		m_C_ITEM_CD = null;
		m_C_ITEM_NAME = null;
		m_C_DRAW_CD = null;
		m_C_SPEC = null;
		m_C_HIGH_LEVEL_NO = null;
		m_C_MRP_ODR_TYP = null;
		m_C_OUTSIDE_TYP = null;
		m_C_STOCK_UNIT_FLG = null;
		m_C_STOCK_UNIT = null;
		m_C_PKG_UNIT = null;
		m_C_PKG_UNIT_QTY = null;
		m_C_UNIT_QTY_TYP = null;
		m_C_ODR_LT = null;
		m_C_FIXED_LT = null;
		m_C_PROP_LT = null;
		m_C_SAFETY_LT = null;
		m_C_ISSUE_LT = null;
		m_C_PROP_LOT_SIZE = null;
		m_C_ITEM_SPOIL = null;
		m_C_SAFETY_STOCK = null;
		m_C_LOT_SIZING_TYP = null;
		m_C_MAX_PERIOD = null;
		m_C_MAX_ODR_QTY = null;
		m_C_ODR_POINT = null;
		m_C_FIXED_ODR_QTY = null;
		m_C_MIN_ODR_QTY = null;
		m_C_MUL_ODR_QTY = null;
		m_C_ISSUE_TYP = null;
		m_C_MPS_FLG = null;
		m_C_ACPT_INSPC_TYP = null;
		m_C_PRODUCT_TYP = null;
		m_C_CLASIFICATION_CD = null;
		m_C_UNIT_WEIGHT = null;
		m_C_ABC_TYP = null;
		m_C_OPR_RSLT_TYP = null;
		m_C_SPL_ITEM_TYP = null;
		m_C_TAX_CD = null;
		m_C_CAL_NO = null;
		m_C_MANHOUR_TYP = null;
		m_C_DEPO_TYP = null;
		m_C_LOT_CTRL_FLG = null;
		m_C_LOT_NUMBERING_TYP = null;
		m_C_BEST_BEFORE_YEAR = null;
		m_C_BEST_BEFORE_MONTH = null;
		m_C_BEST_BEFORE_DAY = null;
		m_C_REMARK1 = null;
		m_C_REMARK2 = null;
		m_C_ITEM_CLASS_01_CD = null;
		m_C_ITEM_CLASS_02_CD = null;
		m_C_ITEM_CLASS_03_CD = null;
		m_C_ITEM_CLASS_04_CD = null;
		m_C_ITEM_CLASS_05_CD = null;
		m_C_ITEM_CLASS_06_CD = null;
		m_C_ITEM_CLASS_07_CD = null;
		m_C_ITEM_CLASS_08_CD = null;
		m_C_ITEM_CLASS_09_CD = null;
		m_C_ITEM_CLASS_10_CD = null;
		m_C_ITEM_CLASS_11_CD = null;
		m_C_ITEM_CLASS_12_CD = null;
		m_C_DEPT_CD = null;
		m_C_PJ_CD = null;
		m_C_SEG_CONTENTS_1 = null;
		m_C_SEG_CONTENTS_2 = null;
		m_C_SEG_CONTENTS_3 = null;
		m_C_SEG_CONTENTS_4 = null;
		m_C_setITEM_CD = null;
		m_readT_OD_ITEM_CD = null;
		m_setT_OD_ITEM_CD = null;
		m_readM_PS_ITEM_CD = null;
		m_setM_PS_ITEM_CD = null;
		m_readT_ITEM_STOCK_ITEM_CD = null;
		m_readT_ITEM_STOCK_STOCK_ON_HAND_QTY = null;
		m_setT_ITEM_STOCK_ITEM_CD = null;
		m_readT_JOB_ODR_CD_ITEM_CD = null;
		m_readT_JOB_ODR_CD_STOCK_ON_HAND_QTY = null;
		m_setT_JOB_ODR_CD_ITEM_CD = null;
		m_readT_RLSD_P_ITEM_CD = null;
		m_setT_RLSD_P_ITEM_CD = null;
		m_readT_WORK_IN_ITEM_CD = null;
		m_setT_WORK_IN_ITEM_CD = null;
		m_readT_JOB_ODR_ITEM_CD = null;
		m_setT_JOB_ODR_ITEM_CD = null;
		m_readT_OPR_RSLT_ITEM_CD = null;
		m_setT_OPR_RSLT_ITEM_CD = null;
		m_setM_WH_ITEM_CD = null;
		m_setM_WH_WH_CD = null;
		m_setM_WH_PLANT_CD = null;
		m_setM_WH_WH_REF_NO = null;
		m_readM_WH_ITEM_CD = null;
		m_readM_WH_WH_CD = null;
		m_readM_CAL_H_CAL_NO = null;
		m_setM_CAL_H_CAL_NO = null;
		m_readCLASS_CD1 = null;
		m_setCLASS_CD2 = null;
		m_setCLASS_CD3 = null;
		m_readM_ITEM_STOCK_UNIT = null;
		m_readM_ITEM_LOT_CTRL_FLG = null;
		m_readM_ITEM_MRP_ODR_TYP = null;
		m_setM_ITEM_ITEM_CD = null;
		m_setDISPLAY_NAME = null;
		m_VALUE = null;
		m_DEPT_CD = null;

		l_rdoInsert = null;
		l_rdoUpdate = null;
		l_rdoDelete = null;
		l_FileName = null;
		l_DO_CHK = null;
		l_ERROR_IN = null;
		l_ITEM_CD = null;
		l_ERR_CTR_NM = null;
		l_ERR_INFO = null;
		l_h_SYORI_KUBUN = null;
		l_h_WH_CD = null;
		l_CANCEL_FILE = null;
		l_JUDGMENT_TXT = null;
		l_DOWNLOAD_FILE = null;
		l_ERR_TYP = null;
		l_w_COLUMN_FLG = null;
		l_OUT_ITEM_CD = null;
		l_readNAME = null;
		l_readVALUE = null;
		l_DISPLAY_NAME = null;
		l_setNAME = null;
		l_setVALUE = null;
		l_readSYS_P_NAME = null;
		l_readSYS_P_VALUE = null;
		l_setSYS_P_NAME = null;
		l_h_ITEM_CD = null;
		l_h_ITEM_NAME = null;
		l_h_DRAW_CD = null;
		l_h_SPEC = null;
		l_h_HIGH_LEVEL_NO = null;
		l_h_MRP_ODR_TYP = null;
		l_h_OUTSIDE_TYP = null;
		l_h_STOCK_UNIT_FLG = null;
		l_h_STOCK_UNIT = null;
		l_h_PKG_UNIT = null;
		l_h_PKG_UNIT_QTY = null;
		l_h_UNIT_QTY_TYP = null;
		l_h_ODR_LT = null;
		l_h_FIXED_LT = null;
		l_h_PROP_LT = null;
		l_h_SAFETY_LT = null;
		l_h_ISSUE_LT = null;
		l_h_PROP_LOT_SIZE = null;
		l_h_ITEM_SPOIL = null;
		l_h_SAFETY_STOCK = null;
		l_h_LOT_SIZING_TYP = null;
		l_h_MAX_PERIOD = null;
		l_h_MAX_ODR_QTY = null;
		l_h_ODR_POINT = null;
		l_h_FIXED_ODR_QTY = null;
		l_h_MIN_ODR_QTY = null;
		l_h_MUL_ODR_QTY = null;
		l_h_ISSUE_TYP = null;
		l_h_MPS_FLG = null;
		l_h_ACPT_INSPC_TYP = null;
		l_h_PRODUCT_TYP = null;
		l_h_CLASIFICATION_CD = null;
		l_h_UNIT_WEIGHT = null;
		l_h_ABC_TYP = null;
		l_h_OPR_RSLT_TYP = null;
		l_h_SPL_ITEM_TYP = null;
		l_h_TAX_CD = null;
		l_h_CAL_NO = null;
		l_h_MANHOUR_TYP = null;
		l_h_DEPO_TYP = null;
		l_h_LOT_CTRL_FLG = null;
		l_h_LOT_NUMBERING_TYP = null;
		l_h_BEST_BEFORE_YEAR = null;
		l_h_BEST_BEFORE_MONTH = null;
		l_h_BEST_BEFORE_DAY = null;
		l_h_DEPT_CD = null;
		l_h_PJ_CD = null;
		l_h_SEG_CONTENTS_1 = null;
		l_h_SEG_CONTENTS_2 = null;
		l_h_SEG_CONTENTS_3 = null;
		l_h_SEG_CONTENTS_4 = null;
		l_h_REMARK1 = null;
		l_h_REMARK2 = null;
		l_h_ITEM_CLASS_01_CD = null;
		l_h_ITEM_CLASS_02_CD = null;
		l_h_ITEM_CLASS_03_CD = null;
		l_h_ITEM_CLASS_04_CD = null;
		l_h_ITEM_CLASS_05_CD = null;
		l_h_ITEM_CLASS_06_CD = null;
		l_h_ITEM_CLASS_07_CD = null;
		l_h_ITEM_CLASS_08_CD = null;
		l_h_ITEM_CLASS_09_CD = null;
		l_h_ITEM_CLASS_10_CD = null;
		l_h_ITEM_CLASS_11_CD = null;
		l_h_ITEM_CLASS_12_CD = null;
		l_readTAX_CD = null;
		l_setTAXCD = null;
		l_readITEM_CD = null;
		l_setITEM_CD = null;
		l_readVEND_CD = null;
		l_setVEND_CD = null;
		l_readPLANT_CD = null;
		l_readSUM_PROP_LT = null;
		l_readSUM_FIXED_LT = null;
		l_readMRP_ITEM_CD = null;
		l_readMRP_ODR_TYP = null;
		l_setMRP_ITEM_CD = null;
		l_readMRP_ODR_ITEM_CD = null;
		l_setMRP_ODR_ITEM_CD = null;
		l_C_ITEM_CD = null;
		l_C_ITEM_NAME = null;
		l_C_DRAW_CD = null;
		l_C_SPEC = null;
		l_C_HIGH_LEVEL_NO = null;
		l_C_MRP_ODR_TYP = null;
		l_C_OUTSIDE_TYP = null;
		l_C_STOCK_UNIT_FLG = null;
		l_C_STOCK_UNIT = null;
		l_C_PKG_UNIT = null;
		l_C_PKG_UNIT_QTY = null;
		l_C_UNIT_QTY_TYP = null;
		l_C_ODR_LT = null;
		l_C_FIXED_LT = null;
		l_C_PROP_LT = null;
		l_C_SAFETY_LT = null;
		l_C_ISSUE_LT = null;
		l_C_PROP_LOT_SIZE = null;
		l_C_ITEM_SPOIL = null;
		l_C_SAFETY_STOCK = null;
		l_C_LOT_SIZING_TYP = null;
		l_C_MAX_PERIOD = null;
		l_C_MAX_ODR_QTY = null;
		l_C_ODR_POINT = null;
		l_C_FIXED_ODR_QTY = null;
		l_C_MIN_ODR_QTY = null;
		l_C_MUL_ODR_QTY = null;
		l_C_ISSUE_TYP = null;
		l_C_MPS_FLG = null;
		l_C_ACPT_INSPC_TYP = null;
		l_C_PRODUCT_TYP = null;
		l_C_CLASIFICATION_CD = null;
		l_C_UNIT_WEIGHT = null;
		l_C_ABC_TYP = null;
		l_C_OPR_RSLT_TYP = null;
		l_C_SPL_ITEM_TYP = null;
		l_C_TAX_CD = null;
		l_C_CAL_NO = null;
		l_C_MANHOUR_TYP = null;
		l_C_DEPO_TYP = null;
		l_C_LOT_CTRL_FLG = null;
		l_C_LOT_NUMBERING_TYP = null;
		l_C_BEST_BEFORE_YEAR = null;
		l_C_BEST_BEFORE_MONTH = null;
		l_C_BEST_BEFORE_DAY = null;
		l_C_REMARK1 = null;
		l_C_REMARK2 = null;
		l_C_ITEM_CLASS_01_CD = null;
		l_C_ITEM_CLASS_02_CD = null;
		l_C_ITEM_CLASS_03_CD = null;
		l_C_ITEM_CLASS_04_CD = null;
		l_C_ITEM_CLASS_05_CD = null;
		l_C_ITEM_CLASS_06_CD = null;
		l_C_ITEM_CLASS_07_CD = null;
		l_C_ITEM_CLASS_08_CD = null;
		l_C_ITEM_CLASS_09_CD = null;
		l_C_ITEM_CLASS_10_CD = null;
		l_C_ITEM_CLASS_11_CD = null;
		l_C_ITEM_CLASS_12_CD = null;
		l_C_DEPT_CD = null;
		l_C_PJ_CD = null;
		l_C_SEG_CONTENTS_1 = null;
		l_C_SEG_CONTENTS_2 = null;
		l_C_SEG_CONTENTS_3 = null;
		l_C_SEG_CONTENTS_4 = null;
		l_C_setITEM_CD = null;
		l_readT_OD_ITEM_CD = null;
		l_setT_OD_ITEM_CD = null;
		l_readM_PS_ITEM_CD = null;
		l_setM_PS_ITEM_CD = null;
		l_readT_ITEM_STOCK_ITEM_CD = null;
		l_readT_ITEM_STOCK_STOCK_ON_HAND_QTY = null;
		l_setT_ITEM_STOCK_ITEM_CD = null;
		l_readT_JOB_ODR_CD_ITEM_CD = null;
		l_readT_JOB_ODR_CD_STOCK_ON_HAND_QTY = null;
		l_setT_JOB_ODR_CD_ITEM_CD = null;
		l_readT_RLSD_P_ITEM_CD = null;
		l_setT_RLSD_P_ITEM_CD = null;
		l_readT_WORK_IN_ITEM_CD = null;
		l_setT_WORK_IN_ITEM_CD = null;
		l_readT_JOB_ODR_ITEM_CD = null;
		l_setT_JOB_ODR_ITEM_CD = null;
		l_readT_OPR_RSLT_ITEM_CD = null;
		l_setT_OPR_RSLT_ITEM_CD = null;
		l_setM_WH_ITEM_CD = null;
		l_setM_WH_WH_CD = null;
		l_setM_WH_PLANT_CD = null;
		l_setM_WH_WH_REF_NO = null;
		l_readM_WH_ITEM_CD = null;
		l_readM_WH_WH_CD = null;
		l_readM_CAL_H_CAL_NO = null;
		l_setM_CAL_H_CAL_NO = null;
		l_readCLASS_CD1 = null;
		l_setCLASS_CD2 = null;
		l_setCLASS_CD3 = null;
		l_readM_ITEM_STOCK_UNIT = null;
		l_readM_ITEM_LOT_CTRL_FLG = null;
		l_readM_ITEM_MRP_ODR_TYP = null;
		l_setM_ITEM_ITEM_CD = null;
		l_setDISPLAY_NAME = null;
		l_VALUE = null;
		l_DEPT_CD = null;

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
	 * medAA0150010�N���X�̕W���R���X�g���N�^
	 */
	public AA0150010Struct()
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
	public void setStruct(AA0150010Struct struct)
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
	public void setStructM(AA0150010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setrdoInsert(struct.getrdoInsert());
			this.setrdoUpdate(struct.getrdoUpdate());
			this.setrdoDelete(struct.getrdoDelete());
			this.setFileName(struct.getFileName());
			this.setDO_CHK(struct.getDO_CHK());
			this.setERROR_IN(struct.getERROR_IN());
			this.setITEM_CD(struct.getITEM_CD());
			this.setERR_CTR_NM(struct.getERR_CTR_NM());
			this.setERR_INFO(struct.getERR_INFO());
			this.seth_SYORI_KUBUN(struct.geth_SYORI_KUBUN());
			this.seth_WH_CD(struct.geth_WH_CD());
			this.setCANCEL_FILE(struct.getCANCEL_FILE());
			this.setJUDGMENT_TXT(struct.getJUDGMENT_TXT());
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setERR_TYP(struct.getERR_TYP());
			this.setw_COLUMN_FLG(struct.getw_COLUMN_FLG());
			this.setOUT_ITEM_CD(struct.getOUT_ITEM_CD());
			this.setreadNAME(struct.getreadNAME());
			this.setreadVALUE(struct.getreadVALUE());
			this.setDISPLAY_NAME(struct.getDISPLAY_NAME());
			this.setsetNAME(struct.getsetNAME());
			this.setsetVALUE(struct.getsetVALUE());
			this.setreadSYS_P_NAME(struct.getreadSYS_P_NAME());
			this.setreadSYS_P_VALUE(struct.getreadSYS_P_VALUE());
			this.setsetSYS_P_NAME(struct.getsetSYS_P_NAME());
			this.seth_ITEM_CD(struct.geth_ITEM_CD());
			this.seth_ITEM_NAME(struct.geth_ITEM_NAME());
			this.seth_DRAW_CD(struct.geth_DRAW_CD());
			this.seth_SPEC(struct.geth_SPEC());
			this.seth_HIGH_LEVEL_NO(struct.geth_HIGH_LEVEL_NO());
			this.seth_MRP_ODR_TYP(struct.geth_MRP_ODR_TYP());
			this.seth_OUTSIDE_TYP(struct.geth_OUTSIDE_TYP());
			this.seth_STOCK_UNIT_FLG(struct.geth_STOCK_UNIT_FLG());
			this.seth_STOCK_UNIT(struct.geth_STOCK_UNIT());
			this.seth_PKG_UNIT(struct.geth_PKG_UNIT());
			this.seth_PKG_UNIT_QTY(struct.geth_PKG_UNIT_QTY());
			this.seth_UNIT_QTY_TYP(struct.geth_UNIT_QTY_TYP());
			this.seth_ODR_LT(struct.geth_ODR_LT());
			this.seth_FIXED_LT(struct.geth_FIXED_LT());
			this.seth_PROP_LT(struct.geth_PROP_LT());
			this.seth_SAFETY_LT(struct.geth_SAFETY_LT());
			this.seth_ISSUE_LT(struct.geth_ISSUE_LT());
			this.seth_PROP_LOT_SIZE(struct.geth_PROP_LOT_SIZE());
			this.seth_ITEM_SPOIL(struct.geth_ITEM_SPOIL());
			this.seth_SAFETY_STOCK(struct.geth_SAFETY_STOCK());
			this.seth_LOT_SIZING_TYP(struct.geth_LOT_SIZING_TYP());
			this.seth_MAX_PERIOD(struct.geth_MAX_PERIOD());
			this.seth_MAX_ODR_QTY(struct.geth_MAX_ODR_QTY());
			this.seth_ODR_POINT(struct.geth_ODR_POINT());
			this.seth_FIXED_ODR_QTY(struct.geth_FIXED_ODR_QTY());
			this.seth_MIN_ODR_QTY(struct.geth_MIN_ODR_QTY());
			this.seth_MUL_ODR_QTY(struct.geth_MUL_ODR_QTY());
			this.seth_ISSUE_TYP(struct.geth_ISSUE_TYP());
			this.seth_MPS_FLG(struct.geth_MPS_FLG());
			this.seth_ACPT_INSPC_TYP(struct.geth_ACPT_INSPC_TYP());
			this.seth_PRODUCT_TYP(struct.geth_PRODUCT_TYP());
			this.seth_CLASIFICATION_CD(struct.geth_CLASIFICATION_CD());
			this.seth_UNIT_WEIGHT(struct.geth_UNIT_WEIGHT());
			this.seth_ABC_TYP(struct.geth_ABC_TYP());
			this.seth_OPR_RSLT_TYP(struct.geth_OPR_RSLT_TYP());
			this.seth_SPL_ITEM_TYP(struct.geth_SPL_ITEM_TYP());
			this.seth_TAX_CD(struct.geth_TAX_CD());
			this.seth_CAL_NO(struct.geth_CAL_NO());
			this.seth_MANHOUR_TYP(struct.geth_MANHOUR_TYP());
			this.seth_DEPO_TYP(struct.geth_DEPO_TYP());
			this.seth_LOT_CTRL_FLG(struct.geth_LOT_CTRL_FLG());
			this.seth_LOT_NUMBERING_TYP(struct.geth_LOT_NUMBERING_TYP());
			this.seth_BEST_BEFORE_YEAR(struct.geth_BEST_BEFORE_YEAR());
			this.seth_BEST_BEFORE_MONTH(struct.geth_BEST_BEFORE_MONTH());
			this.seth_BEST_BEFORE_DAY(struct.geth_BEST_BEFORE_DAY());
			this.seth_DEPT_CD(struct.geth_DEPT_CD());
			this.seth_PJ_CD(struct.geth_PJ_CD());
			this.seth_SEG_CONTENTS_1(struct.geth_SEG_CONTENTS_1());
			this.seth_SEG_CONTENTS_2(struct.geth_SEG_CONTENTS_2());
			this.seth_SEG_CONTENTS_3(struct.geth_SEG_CONTENTS_3());
			this.seth_SEG_CONTENTS_4(struct.geth_SEG_CONTENTS_4());
			this.seth_REMARK1(struct.geth_REMARK1());
			this.seth_REMARK2(struct.geth_REMARK2());
			this.seth_ITEM_CLASS_01_CD(struct.geth_ITEM_CLASS_01_CD());
			this.seth_ITEM_CLASS_02_CD(struct.geth_ITEM_CLASS_02_CD());
			this.seth_ITEM_CLASS_03_CD(struct.geth_ITEM_CLASS_03_CD());
			this.seth_ITEM_CLASS_04_CD(struct.geth_ITEM_CLASS_04_CD());
			this.seth_ITEM_CLASS_05_CD(struct.geth_ITEM_CLASS_05_CD());
			this.seth_ITEM_CLASS_06_CD(struct.geth_ITEM_CLASS_06_CD());
			this.seth_ITEM_CLASS_07_CD(struct.geth_ITEM_CLASS_07_CD());
			this.seth_ITEM_CLASS_08_CD(struct.geth_ITEM_CLASS_08_CD());
			this.seth_ITEM_CLASS_09_CD(struct.geth_ITEM_CLASS_09_CD());
			this.seth_ITEM_CLASS_10_CD(struct.geth_ITEM_CLASS_10_CD());
			this.seth_ITEM_CLASS_11_CD(struct.geth_ITEM_CLASS_11_CD());
			this.seth_ITEM_CLASS_12_CD(struct.geth_ITEM_CLASS_12_CD());
			this.setreadTAX_CD(struct.getreadTAX_CD());
			this.setsetTAXCD(struct.getsetTAXCD());
			this.setreadITEM_CD(struct.getreadITEM_CD());
			this.setsetITEM_CD(struct.getsetITEM_CD());
			this.setreadVEND_CD(struct.getreadVEND_CD());
			this.setsetVEND_CD(struct.getsetVEND_CD());
			this.setreadPLANT_CD(struct.getreadPLANT_CD());
			this.setreadSUM_PROP_LT(struct.getreadSUM_PROP_LT());
			this.setreadSUM_FIXED_LT(struct.getreadSUM_FIXED_LT());
			this.setreadMRP_ITEM_CD(struct.getreadMRP_ITEM_CD());
			this.setreadMRP_ODR_TYP(struct.getreadMRP_ODR_TYP());
			this.setsetMRP_ITEM_CD(struct.getsetMRP_ITEM_CD());
			this.setreadMRP_ODR_ITEM_CD(struct.getreadMRP_ODR_ITEM_CD());
			this.setsetMRP_ODR_ITEM_CD(struct.getsetMRP_ODR_ITEM_CD());
			this.setC_ITEM_CD(struct.getC_ITEM_CD());
			this.setC_ITEM_NAME(struct.getC_ITEM_NAME());
			this.setC_DRAW_CD(struct.getC_DRAW_CD());
			this.setC_SPEC(struct.getC_SPEC());
			this.setC_HIGH_LEVEL_NO(struct.getC_HIGH_LEVEL_NO());
			this.setC_MRP_ODR_TYP(struct.getC_MRP_ODR_TYP());
			this.setC_OUTSIDE_TYP(struct.getC_OUTSIDE_TYP());
			this.setC_STOCK_UNIT_FLG(struct.getC_STOCK_UNIT_FLG());
			this.setC_STOCK_UNIT(struct.getC_STOCK_UNIT());
			this.setC_PKG_UNIT(struct.getC_PKG_UNIT());
			this.setC_PKG_UNIT_QTY(struct.getC_PKG_UNIT_QTY());
			this.setC_UNIT_QTY_TYP(struct.getC_UNIT_QTY_TYP());
			this.setC_ODR_LT(struct.getC_ODR_LT());
			this.setC_FIXED_LT(struct.getC_FIXED_LT());
			this.setC_PROP_LT(struct.getC_PROP_LT());
			this.setC_SAFETY_LT(struct.getC_SAFETY_LT());
			this.setC_ISSUE_LT(struct.getC_ISSUE_LT());
			this.setC_PROP_LOT_SIZE(struct.getC_PROP_LOT_SIZE());
			this.setC_ITEM_SPOIL(struct.getC_ITEM_SPOIL());
			this.setC_SAFETY_STOCK(struct.getC_SAFETY_STOCK());
			this.setC_LOT_SIZING_TYP(struct.getC_LOT_SIZING_TYP());
			this.setC_MAX_PERIOD(struct.getC_MAX_PERIOD());
			this.setC_MAX_ODR_QTY(struct.getC_MAX_ODR_QTY());
			this.setC_ODR_POINT(struct.getC_ODR_POINT());
			this.setC_FIXED_ODR_QTY(struct.getC_FIXED_ODR_QTY());
			this.setC_MIN_ODR_QTY(struct.getC_MIN_ODR_QTY());
			this.setC_MUL_ODR_QTY(struct.getC_MUL_ODR_QTY());
			this.setC_ISSUE_TYP(struct.getC_ISSUE_TYP());
			this.setC_MPS_FLG(struct.getC_MPS_FLG());
			this.setC_ACPT_INSPC_TYP(struct.getC_ACPT_INSPC_TYP());
			this.setC_PRODUCT_TYP(struct.getC_PRODUCT_TYP());
			this.setC_CLASIFICATION_CD(struct.getC_CLASIFICATION_CD());
			this.setC_UNIT_WEIGHT(struct.getC_UNIT_WEIGHT());
			this.setC_ABC_TYP(struct.getC_ABC_TYP());
			this.setC_OPR_RSLT_TYP(struct.getC_OPR_RSLT_TYP());
			this.setC_SPL_ITEM_TYP(struct.getC_SPL_ITEM_TYP());
			this.setC_TAX_CD(struct.getC_TAX_CD());
			this.setC_CAL_NO(struct.getC_CAL_NO());
			this.setC_MANHOUR_TYP(struct.getC_MANHOUR_TYP());
			this.setC_DEPO_TYP(struct.getC_DEPO_TYP());
			this.setC_LOT_CTRL_FLG(struct.getC_LOT_CTRL_FLG());
			this.setC_LOT_NUMBERING_TYP(struct.getC_LOT_NUMBERING_TYP());
			this.setC_BEST_BEFORE_YEAR(struct.getC_BEST_BEFORE_YEAR());
			this.setC_BEST_BEFORE_MONTH(struct.getC_BEST_BEFORE_MONTH());
			this.setC_BEST_BEFORE_DAY(struct.getC_BEST_BEFORE_DAY());
			this.setC_REMARK1(struct.getC_REMARK1());
			this.setC_REMARK2(struct.getC_REMARK2());
			this.setC_ITEM_CLASS_01_CD(struct.getC_ITEM_CLASS_01_CD());
			this.setC_ITEM_CLASS_02_CD(struct.getC_ITEM_CLASS_02_CD());
			this.setC_ITEM_CLASS_03_CD(struct.getC_ITEM_CLASS_03_CD());
			this.setC_ITEM_CLASS_04_CD(struct.getC_ITEM_CLASS_04_CD());
			this.setC_ITEM_CLASS_05_CD(struct.getC_ITEM_CLASS_05_CD());
			this.setC_ITEM_CLASS_06_CD(struct.getC_ITEM_CLASS_06_CD());
			this.setC_ITEM_CLASS_07_CD(struct.getC_ITEM_CLASS_07_CD());
			this.setC_ITEM_CLASS_08_CD(struct.getC_ITEM_CLASS_08_CD());
			this.setC_ITEM_CLASS_09_CD(struct.getC_ITEM_CLASS_09_CD());
			this.setC_ITEM_CLASS_10_CD(struct.getC_ITEM_CLASS_10_CD());
			this.setC_ITEM_CLASS_11_CD(struct.getC_ITEM_CLASS_11_CD());
			this.setC_ITEM_CLASS_12_CD(struct.getC_ITEM_CLASS_12_CD());
			this.setC_DEPT_CD(struct.getC_DEPT_CD());
			this.setC_PJ_CD(struct.getC_PJ_CD());
			this.setC_SEG_CONTENTS_1(struct.getC_SEG_CONTENTS_1());
			this.setC_SEG_CONTENTS_2(struct.getC_SEG_CONTENTS_2());
			this.setC_SEG_CONTENTS_3(struct.getC_SEG_CONTENTS_3());
			this.setC_SEG_CONTENTS_4(struct.getC_SEG_CONTENTS_4());
			this.setC_setITEM_CD(struct.getC_setITEM_CD());
			this.setreadT_OD_ITEM_CD(struct.getreadT_OD_ITEM_CD());
			this.setsetT_OD_ITEM_CD(struct.getsetT_OD_ITEM_CD());
			this.setreadM_PS_ITEM_CD(struct.getreadM_PS_ITEM_CD());
			this.setsetM_PS_ITEM_CD(struct.getsetM_PS_ITEM_CD());
			this.setreadT_ITEM_STOCK_ITEM_CD(struct.getreadT_ITEM_STOCK_ITEM_CD());
			this.setreadT_ITEM_STOCK_STOCK_ON_HAND_QTY(struct.getreadT_ITEM_STOCK_STOCK_ON_HAND_QTY());
			this.setsetT_ITEM_STOCK_ITEM_CD(struct.getsetT_ITEM_STOCK_ITEM_CD());
			this.setreadT_JOB_ODR_CD_ITEM_CD(struct.getreadT_JOB_ODR_CD_ITEM_CD());
			this.setreadT_JOB_ODR_CD_STOCK_ON_HAND_QTY(struct.getreadT_JOB_ODR_CD_STOCK_ON_HAND_QTY());
			this.setsetT_JOB_ODR_CD_ITEM_CD(struct.getsetT_JOB_ODR_CD_ITEM_CD());
			this.setreadT_RLSD_P_ITEM_CD(struct.getreadT_RLSD_P_ITEM_CD());
			this.setsetT_RLSD_P_ITEM_CD(struct.getsetT_RLSD_P_ITEM_CD());
			this.setreadT_WORK_IN_ITEM_CD(struct.getreadT_WORK_IN_ITEM_CD());
			this.setsetT_WORK_IN_ITEM_CD(struct.getsetT_WORK_IN_ITEM_CD());
			this.setreadT_JOB_ODR_ITEM_CD(struct.getreadT_JOB_ODR_ITEM_CD());
			this.setsetT_JOB_ODR_ITEM_CD(struct.getsetT_JOB_ODR_ITEM_CD());
			this.setreadT_OPR_RSLT_ITEM_CD(struct.getreadT_OPR_RSLT_ITEM_CD());
			this.setsetT_OPR_RSLT_ITEM_CD(struct.getsetT_OPR_RSLT_ITEM_CD());
			this.setsetM_WH_ITEM_CD(struct.getsetM_WH_ITEM_CD());
			this.setsetM_WH_WH_CD(struct.getsetM_WH_WH_CD());
			this.setsetM_WH_PLANT_CD(struct.getsetM_WH_PLANT_CD());
			this.setsetM_WH_WH_REF_NO(struct.getsetM_WH_WH_REF_NO());
			this.setreadM_WH_ITEM_CD(struct.getreadM_WH_ITEM_CD());
			this.setreadM_WH_WH_CD(struct.getreadM_WH_WH_CD());
			this.setreadM_CAL_H_CAL_NO(struct.getreadM_CAL_H_CAL_NO());
			this.setsetM_CAL_H_CAL_NO(struct.getsetM_CAL_H_CAL_NO());
			this.setreadCLASS_CD1(struct.getreadCLASS_CD1());
			this.setsetCLASS_CD2(struct.getsetCLASS_CD2());
			this.setsetCLASS_CD3(struct.getsetCLASS_CD3());
			this.setreadM_ITEM_STOCK_UNIT(struct.getreadM_ITEM_STOCK_UNIT());
			this.setreadM_ITEM_LOT_CTRL_FLG(struct.getreadM_ITEM_LOT_CTRL_FLG());
			this.setreadM_ITEM_MRP_ODR_TYP(struct.getreadM_ITEM_MRP_ODR_TYP());
			this.setsetM_ITEM_ITEM_CD(struct.getsetM_ITEM_ITEM_CD());
			this.setsetDISPLAY_NAME(struct.getsetDISPLAY_NAME());
			this.setVALUE(struct.getVALUE());
			this.setDEPT_CD(struct.getDEPT_CD());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AA0150010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_rdoInsert(struct.getList_rdoInsert());
			this.setList_rdoUpdate(struct.getList_rdoUpdate());
			this.setList_rdoDelete(struct.getList_rdoDelete());
			this.setList_FileName(struct.getList_FileName());
			this.setList_DO_CHK(struct.getList_DO_CHK());
			this.setList_ERROR_IN(struct.getList_ERROR_IN());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_ERR_CTR_NM(struct.getList_ERR_CTR_NM());
			this.setList_ERR_INFO(struct.getList_ERR_INFO());
			this.setList_h_SYORI_KUBUN(struct.getList_h_SYORI_KUBUN());
			this.setList_h_WH_CD(struct.getList_h_WH_CD());
			this.setList_CANCEL_FILE(struct.getList_CANCEL_FILE());
			this.setList_JUDGMENT_TXT(struct.getList_JUDGMENT_TXT());
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_ERR_TYP(struct.getList_ERR_TYP());
			this.setList_w_COLUMN_FLG(struct.getList_w_COLUMN_FLG());
			this.setList_OUT_ITEM_CD(struct.getList_OUT_ITEM_CD());
			this.setList_readNAME(struct.getList_readNAME());
			this.setList_readVALUE(struct.getList_readVALUE());
			this.setList_DISPLAY_NAME(struct.getList_DISPLAY_NAME());
			this.setList_setNAME(struct.getList_setNAME());
			this.setList_setVALUE(struct.getList_setVALUE());
			this.setList_readSYS_P_NAME(struct.getList_readSYS_P_NAME());
			this.setList_readSYS_P_VALUE(struct.getList_readSYS_P_VALUE());
			this.setList_setSYS_P_NAME(struct.getList_setSYS_P_NAME());
			this.setList_h_ITEM_CD(struct.getList_h_ITEM_CD());
			this.setList_h_ITEM_NAME(struct.getList_h_ITEM_NAME());
			this.setList_h_DRAW_CD(struct.getList_h_DRAW_CD());
			this.setList_h_SPEC(struct.getList_h_SPEC());
			this.setList_h_HIGH_LEVEL_NO(struct.getList_h_HIGH_LEVEL_NO());
			this.setList_h_MRP_ODR_TYP(struct.getList_h_MRP_ODR_TYP());
			this.setList_h_OUTSIDE_TYP(struct.getList_h_OUTSIDE_TYP());
			this.setList_h_STOCK_UNIT_FLG(struct.getList_h_STOCK_UNIT_FLG());
			this.setList_h_STOCK_UNIT(struct.getList_h_STOCK_UNIT());
			this.setList_h_PKG_UNIT(struct.getList_h_PKG_UNIT());
			this.setList_h_PKG_UNIT_QTY(struct.getList_h_PKG_UNIT_QTY());
			this.setList_h_UNIT_QTY_TYP(struct.getList_h_UNIT_QTY_TYP());
			this.setList_h_ODR_LT(struct.getList_h_ODR_LT());
			this.setList_h_FIXED_LT(struct.getList_h_FIXED_LT());
			this.setList_h_PROP_LT(struct.getList_h_PROP_LT());
			this.setList_h_SAFETY_LT(struct.getList_h_SAFETY_LT());
			this.setList_h_ISSUE_LT(struct.getList_h_ISSUE_LT());
			this.setList_h_PROP_LOT_SIZE(struct.getList_h_PROP_LOT_SIZE());
			this.setList_h_ITEM_SPOIL(struct.getList_h_ITEM_SPOIL());
			this.setList_h_SAFETY_STOCK(struct.getList_h_SAFETY_STOCK());
			this.setList_h_LOT_SIZING_TYP(struct.getList_h_LOT_SIZING_TYP());
			this.setList_h_MAX_PERIOD(struct.getList_h_MAX_PERIOD());
			this.setList_h_MAX_ODR_QTY(struct.getList_h_MAX_ODR_QTY());
			this.setList_h_ODR_POINT(struct.getList_h_ODR_POINT());
			this.setList_h_FIXED_ODR_QTY(struct.getList_h_FIXED_ODR_QTY());
			this.setList_h_MIN_ODR_QTY(struct.getList_h_MIN_ODR_QTY());
			this.setList_h_MUL_ODR_QTY(struct.getList_h_MUL_ODR_QTY());
			this.setList_h_ISSUE_TYP(struct.getList_h_ISSUE_TYP());
			this.setList_h_MPS_FLG(struct.getList_h_MPS_FLG());
			this.setList_h_ACPT_INSPC_TYP(struct.getList_h_ACPT_INSPC_TYP());
			this.setList_h_PRODUCT_TYP(struct.getList_h_PRODUCT_TYP());
			this.setList_h_CLASIFICATION_CD(struct.getList_h_CLASIFICATION_CD());
			this.setList_h_UNIT_WEIGHT(struct.getList_h_UNIT_WEIGHT());
			this.setList_h_ABC_TYP(struct.getList_h_ABC_TYP());
			this.setList_h_OPR_RSLT_TYP(struct.getList_h_OPR_RSLT_TYP());
			this.setList_h_SPL_ITEM_TYP(struct.getList_h_SPL_ITEM_TYP());
			this.setList_h_TAX_CD(struct.getList_h_TAX_CD());
			this.setList_h_CAL_NO(struct.getList_h_CAL_NO());
			this.setList_h_MANHOUR_TYP(struct.getList_h_MANHOUR_TYP());
			this.setList_h_DEPO_TYP(struct.getList_h_DEPO_TYP());
			this.setList_h_LOT_CTRL_FLG(struct.getList_h_LOT_CTRL_FLG());
			this.setList_h_LOT_NUMBERING_TYP(struct.getList_h_LOT_NUMBERING_TYP());
			this.setList_h_BEST_BEFORE_YEAR(struct.getList_h_BEST_BEFORE_YEAR());
			this.setList_h_BEST_BEFORE_MONTH(struct.getList_h_BEST_BEFORE_MONTH());
			this.setList_h_BEST_BEFORE_DAY(struct.getList_h_BEST_BEFORE_DAY());
			this.setList_h_DEPT_CD(struct.getList_h_DEPT_CD());
			this.setList_h_PJ_CD(struct.getList_h_PJ_CD());
			this.setList_h_SEG_CONTENTS_1(struct.getList_h_SEG_CONTENTS_1());
			this.setList_h_SEG_CONTENTS_2(struct.getList_h_SEG_CONTENTS_2());
			this.setList_h_SEG_CONTENTS_3(struct.getList_h_SEG_CONTENTS_3());
			this.setList_h_SEG_CONTENTS_4(struct.getList_h_SEG_CONTENTS_4());
			this.setList_h_REMARK1(struct.getList_h_REMARK1());
			this.setList_h_REMARK2(struct.getList_h_REMARK2());
			this.setList_h_ITEM_CLASS_01_CD(struct.getList_h_ITEM_CLASS_01_CD());
			this.setList_h_ITEM_CLASS_02_CD(struct.getList_h_ITEM_CLASS_02_CD());
			this.setList_h_ITEM_CLASS_03_CD(struct.getList_h_ITEM_CLASS_03_CD());
			this.setList_h_ITEM_CLASS_04_CD(struct.getList_h_ITEM_CLASS_04_CD());
			this.setList_h_ITEM_CLASS_05_CD(struct.getList_h_ITEM_CLASS_05_CD());
			this.setList_h_ITEM_CLASS_06_CD(struct.getList_h_ITEM_CLASS_06_CD());
			this.setList_h_ITEM_CLASS_07_CD(struct.getList_h_ITEM_CLASS_07_CD());
			this.setList_h_ITEM_CLASS_08_CD(struct.getList_h_ITEM_CLASS_08_CD());
			this.setList_h_ITEM_CLASS_09_CD(struct.getList_h_ITEM_CLASS_09_CD());
			this.setList_h_ITEM_CLASS_10_CD(struct.getList_h_ITEM_CLASS_10_CD());
			this.setList_h_ITEM_CLASS_11_CD(struct.getList_h_ITEM_CLASS_11_CD());
			this.setList_h_ITEM_CLASS_12_CD(struct.getList_h_ITEM_CLASS_12_CD());
			this.setList_readTAX_CD(struct.getList_readTAX_CD());
			this.setList_setTAXCD(struct.getList_setTAXCD());
			this.setList_readITEM_CD(struct.getList_readITEM_CD());
			this.setList_setITEM_CD(struct.getList_setITEM_CD());
			this.setList_readVEND_CD(struct.getList_readVEND_CD());
			this.setList_setVEND_CD(struct.getList_setVEND_CD());
			this.setList_readPLANT_CD(struct.getList_readPLANT_CD());
			this.setList_readSUM_PROP_LT(struct.getList_readSUM_PROP_LT());
			this.setList_readSUM_FIXED_LT(struct.getList_readSUM_FIXED_LT());
			this.setList_readMRP_ITEM_CD(struct.getList_readMRP_ITEM_CD());
			this.setList_readMRP_ODR_TYP(struct.getList_readMRP_ODR_TYP());
			this.setList_setMRP_ITEM_CD(struct.getList_setMRP_ITEM_CD());
			this.setList_readMRP_ODR_ITEM_CD(struct.getList_readMRP_ODR_ITEM_CD());
			this.setList_setMRP_ODR_ITEM_CD(struct.getList_setMRP_ODR_ITEM_CD());
			this.setList_C_ITEM_CD(struct.getList_C_ITEM_CD());
			this.setList_C_ITEM_NAME(struct.getList_C_ITEM_NAME());
			this.setList_C_DRAW_CD(struct.getList_C_DRAW_CD());
			this.setList_C_SPEC(struct.getList_C_SPEC());
			this.setList_C_HIGH_LEVEL_NO(struct.getList_C_HIGH_LEVEL_NO());
			this.setList_C_MRP_ODR_TYP(struct.getList_C_MRP_ODR_TYP());
			this.setList_C_OUTSIDE_TYP(struct.getList_C_OUTSIDE_TYP());
			this.setList_C_STOCK_UNIT_FLG(struct.getList_C_STOCK_UNIT_FLG());
			this.setList_C_STOCK_UNIT(struct.getList_C_STOCK_UNIT());
			this.setList_C_PKG_UNIT(struct.getList_C_PKG_UNIT());
			this.setList_C_PKG_UNIT_QTY(struct.getList_C_PKG_UNIT_QTY());
			this.setList_C_UNIT_QTY_TYP(struct.getList_C_UNIT_QTY_TYP());
			this.setList_C_ODR_LT(struct.getList_C_ODR_LT());
			this.setList_C_FIXED_LT(struct.getList_C_FIXED_LT());
			this.setList_C_PROP_LT(struct.getList_C_PROP_LT());
			this.setList_C_SAFETY_LT(struct.getList_C_SAFETY_LT());
			this.setList_C_ISSUE_LT(struct.getList_C_ISSUE_LT());
			this.setList_C_PROP_LOT_SIZE(struct.getList_C_PROP_LOT_SIZE());
			this.setList_C_ITEM_SPOIL(struct.getList_C_ITEM_SPOIL());
			this.setList_C_SAFETY_STOCK(struct.getList_C_SAFETY_STOCK());
			this.setList_C_LOT_SIZING_TYP(struct.getList_C_LOT_SIZING_TYP());
			this.setList_C_MAX_PERIOD(struct.getList_C_MAX_PERIOD());
			this.setList_C_MAX_ODR_QTY(struct.getList_C_MAX_ODR_QTY());
			this.setList_C_ODR_POINT(struct.getList_C_ODR_POINT());
			this.setList_C_FIXED_ODR_QTY(struct.getList_C_FIXED_ODR_QTY());
			this.setList_C_MIN_ODR_QTY(struct.getList_C_MIN_ODR_QTY());
			this.setList_C_MUL_ODR_QTY(struct.getList_C_MUL_ODR_QTY());
			this.setList_C_ISSUE_TYP(struct.getList_C_ISSUE_TYP());
			this.setList_C_MPS_FLG(struct.getList_C_MPS_FLG());
			this.setList_C_ACPT_INSPC_TYP(struct.getList_C_ACPT_INSPC_TYP());
			this.setList_C_PRODUCT_TYP(struct.getList_C_PRODUCT_TYP());
			this.setList_C_CLASIFICATION_CD(struct.getList_C_CLASIFICATION_CD());
			this.setList_C_UNIT_WEIGHT(struct.getList_C_UNIT_WEIGHT());
			this.setList_C_ABC_TYP(struct.getList_C_ABC_TYP());
			this.setList_C_OPR_RSLT_TYP(struct.getList_C_OPR_RSLT_TYP());
			this.setList_C_SPL_ITEM_TYP(struct.getList_C_SPL_ITEM_TYP());
			this.setList_C_TAX_CD(struct.getList_C_TAX_CD());
			this.setList_C_CAL_NO(struct.getList_C_CAL_NO());
			this.setList_C_MANHOUR_TYP(struct.getList_C_MANHOUR_TYP());
			this.setList_C_DEPO_TYP(struct.getList_C_DEPO_TYP());
			this.setList_C_LOT_CTRL_FLG(struct.getList_C_LOT_CTRL_FLG());
			this.setList_C_LOT_NUMBERING_TYP(struct.getList_C_LOT_NUMBERING_TYP());
			this.setList_C_BEST_BEFORE_YEAR(struct.getList_C_BEST_BEFORE_YEAR());
			this.setList_C_BEST_BEFORE_MONTH(struct.getList_C_BEST_BEFORE_MONTH());
			this.setList_C_BEST_BEFORE_DAY(struct.getList_C_BEST_BEFORE_DAY());
			this.setList_C_REMARK1(struct.getList_C_REMARK1());
			this.setList_C_REMARK2(struct.getList_C_REMARK2());
			this.setList_C_ITEM_CLASS_01_CD(struct.getList_C_ITEM_CLASS_01_CD());
			this.setList_C_ITEM_CLASS_02_CD(struct.getList_C_ITEM_CLASS_02_CD());
			this.setList_C_ITEM_CLASS_03_CD(struct.getList_C_ITEM_CLASS_03_CD());
			this.setList_C_ITEM_CLASS_04_CD(struct.getList_C_ITEM_CLASS_04_CD());
			this.setList_C_ITEM_CLASS_05_CD(struct.getList_C_ITEM_CLASS_05_CD());
			this.setList_C_ITEM_CLASS_06_CD(struct.getList_C_ITEM_CLASS_06_CD());
			this.setList_C_ITEM_CLASS_07_CD(struct.getList_C_ITEM_CLASS_07_CD());
			this.setList_C_ITEM_CLASS_08_CD(struct.getList_C_ITEM_CLASS_08_CD());
			this.setList_C_ITEM_CLASS_09_CD(struct.getList_C_ITEM_CLASS_09_CD());
			this.setList_C_ITEM_CLASS_10_CD(struct.getList_C_ITEM_CLASS_10_CD());
			this.setList_C_ITEM_CLASS_11_CD(struct.getList_C_ITEM_CLASS_11_CD());
			this.setList_C_ITEM_CLASS_12_CD(struct.getList_C_ITEM_CLASS_12_CD());
			this.setList_C_DEPT_CD(struct.getList_C_DEPT_CD());
			this.setList_C_PJ_CD(struct.getList_C_PJ_CD());
			this.setList_C_SEG_CONTENTS_1(struct.getList_C_SEG_CONTENTS_1());
			this.setList_C_SEG_CONTENTS_2(struct.getList_C_SEG_CONTENTS_2());
			this.setList_C_SEG_CONTENTS_3(struct.getList_C_SEG_CONTENTS_3());
			this.setList_C_SEG_CONTENTS_4(struct.getList_C_SEG_CONTENTS_4());
			this.setList_C_setITEM_CD(struct.getList_C_setITEM_CD());
			this.setList_readT_OD_ITEM_CD(struct.getList_readT_OD_ITEM_CD());
			this.setList_setT_OD_ITEM_CD(struct.getList_setT_OD_ITEM_CD());
			this.setList_readM_PS_ITEM_CD(struct.getList_readM_PS_ITEM_CD());
			this.setList_setM_PS_ITEM_CD(struct.getList_setM_PS_ITEM_CD());
			this.setList_readT_ITEM_STOCK_ITEM_CD(struct.getList_readT_ITEM_STOCK_ITEM_CD());
			this.setList_readT_ITEM_STOCK_STOCK_ON_HAND_QTY(struct.getList_readT_ITEM_STOCK_STOCK_ON_HAND_QTY());
			this.setList_setT_ITEM_STOCK_ITEM_CD(struct.getList_setT_ITEM_STOCK_ITEM_CD());
			this.setList_readT_JOB_ODR_CD_ITEM_CD(struct.getList_readT_JOB_ODR_CD_ITEM_CD());
			this.setList_readT_JOB_ODR_CD_STOCK_ON_HAND_QTY(struct.getList_readT_JOB_ODR_CD_STOCK_ON_HAND_QTY());
			this.setList_setT_JOB_ODR_CD_ITEM_CD(struct.getList_setT_JOB_ODR_CD_ITEM_CD());
			this.setList_readT_RLSD_P_ITEM_CD(struct.getList_readT_RLSD_P_ITEM_CD());
			this.setList_setT_RLSD_P_ITEM_CD(struct.getList_setT_RLSD_P_ITEM_CD());
			this.setList_readT_WORK_IN_ITEM_CD(struct.getList_readT_WORK_IN_ITEM_CD());
			this.setList_setT_WORK_IN_ITEM_CD(struct.getList_setT_WORK_IN_ITEM_CD());
			this.setList_readT_JOB_ODR_ITEM_CD(struct.getList_readT_JOB_ODR_ITEM_CD());
			this.setList_setT_JOB_ODR_ITEM_CD(struct.getList_setT_JOB_ODR_ITEM_CD());
			this.setList_readT_OPR_RSLT_ITEM_CD(struct.getList_readT_OPR_RSLT_ITEM_CD());
			this.setList_setT_OPR_RSLT_ITEM_CD(struct.getList_setT_OPR_RSLT_ITEM_CD());
			this.setList_setM_WH_ITEM_CD(struct.getList_setM_WH_ITEM_CD());
			this.setList_setM_WH_WH_CD(struct.getList_setM_WH_WH_CD());
			this.setList_setM_WH_PLANT_CD(struct.getList_setM_WH_PLANT_CD());
			this.setList_setM_WH_WH_REF_NO(struct.getList_setM_WH_WH_REF_NO());
			this.setList_readM_WH_ITEM_CD(struct.getList_readM_WH_ITEM_CD());
			this.setList_readM_WH_WH_CD(struct.getList_readM_WH_WH_CD());
			this.setList_readM_CAL_H_CAL_NO(struct.getList_readM_CAL_H_CAL_NO());
			this.setList_setM_CAL_H_CAL_NO(struct.getList_setM_CAL_H_CAL_NO());
			this.setList_readCLASS_CD1(struct.getList_readCLASS_CD1());
			this.setList_setCLASS_CD2(struct.getList_setCLASS_CD2());
			this.setList_setCLASS_CD3(struct.getList_setCLASS_CD3());
			this.setList_readM_ITEM_STOCK_UNIT(struct.getList_readM_ITEM_STOCK_UNIT());
			this.setList_readM_ITEM_LOT_CTRL_FLG(struct.getList_readM_ITEM_LOT_CTRL_FLG());
			this.setList_readM_ITEM_MRP_ODR_TYP(struct.getList_readM_ITEM_MRP_ODR_TYP());
			this.setList_setM_ITEM_ITEM_CD(struct.getList_setM_ITEM_ITEM_CD());
			this.setList_setDISPLAY_NAME(struct.getList_setDISPLAY_NAME());
			this.setList_VALUE(struct.getList_VALUE());
			this.setList_DEPT_CD(struct.getList_DEPT_CD());
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
	// �� 1 �ϐ������l�F i_rdoInsert


	final static String i_rdoInsert = null;

	// �� 2 �ϐ������l�F i_rdoUpdate


	final static String i_rdoUpdate = null;

	// �� 3 �ϐ������l�F i_rdoDelete


	final static String i_rdoDelete = null;

	// �� 4 �ϐ������l�F i_FileName


	final static String i_FileName = null;

	// �� 5 �ϐ������l�F i_DO_CHK


	final static String i_DO_CHK = null;

	// �� 6 �ϐ������l�F i_ERROR_IN


	final static String i_ERROR_IN = null;

	// �� 7 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 8 �ϐ������l�F i_ERR_CTR_NM


	final static String i_ERR_CTR_NM = null;

	// �� 9 �ϐ������l�F i_ERR_INFO


	final static String i_ERR_INFO = null;

	// �� 10 �ϐ������l�F i_h_SYORI_KUBUN


	final static String i_h_SYORI_KUBUN = null;

	// �� 11 �ϐ������l�F i_h_WH_CD


	final static String i_h_WH_CD = null;

	// �� 12 �ϐ������l�F i_CANCEL_FILE


	final static String i_CANCEL_FILE = null;

	// �� 13 �ϐ������l�F i_JUDGMENT_TXT


	final static String i_JUDGMENT_TXT = null;

	// �� 14 �ϐ������l�F i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// �� 15 �ϐ������l�F i_ERR_TYP


	final static String i_ERR_TYP = null;

	// �� 16 �ϐ������l�F i_w_COLUMN_FLG


	final static String i_w_COLUMN_FLG = null;

	// �� 17 �ϐ������l�F i_OUT_ITEM_CD


	final static String i_OUT_ITEM_CD = null;

	// �� 18 �ϐ������l�F i_readNAME


	final static String i_readNAME = null;

	// �� 19 �ϐ������l�F i_readVALUE


	final static String i_readVALUE = null;

	// �� 20 �ϐ������l�F i_DISPLAY_NAME


	final static String i_DISPLAY_NAME = null;

	// �� 21 �ϐ������l�F i_setNAME


	final static String i_setNAME = null;

	// �� 22 �ϐ������l�F i_setVALUE


	final static String i_setVALUE = null;

	// �� 23 �ϐ������l�F i_readSYS_P_NAME


	final static String i_readSYS_P_NAME = null;

	// �� 24 �ϐ������l�F i_readSYS_P_VALUE


	final static String i_readSYS_P_VALUE = null;

	// �� 25 �ϐ������l�F i_setSYS_P_NAME


	final static String i_setSYS_P_NAME = null;

	// �� 26 �ϐ������l�F i_h_ITEM_CD


	final static String i_h_ITEM_CD = null;

	// �� 27 �ϐ������l�F i_h_ITEM_NAME


	final static String i_h_ITEM_NAME = null;

	// �� 28 �ϐ������l�F i_h_DRAW_CD


	final static String i_h_DRAW_CD = null;

	// �� 29 �ϐ������l�F i_h_SPEC


	final static String i_h_SPEC = null;

	// �� 30 �ϐ������l�F i_h_HIGH_LEVEL_NO


	final static String i_h_HIGH_LEVEL_NO = null;

	// �� 31 �ϐ������l�F i_h_MRP_ODR_TYP


	final static String i_h_MRP_ODR_TYP = null;

	// �� 32 �ϐ������l�F i_h_OUTSIDE_TYP


	final static String i_h_OUTSIDE_TYP = null;

	// �� 33 �ϐ������l�F i_h_STOCK_UNIT_FLG


	final static String i_h_STOCK_UNIT_FLG = null;

	// �� 34 �ϐ������l�F i_h_STOCK_UNIT


	final static String i_h_STOCK_UNIT = null;

	// �� 35 �ϐ������l�F i_h_PKG_UNIT


	final static String i_h_PKG_UNIT = null;

	// �� 36 �ϐ������l�F i_h_PKG_UNIT_QTY


	final static String i_h_PKG_UNIT_QTY = null;

	// �� 37 �ϐ������l�F i_h_UNIT_QTY_TYP


	final static String i_h_UNIT_QTY_TYP = null;

	// �� 38 �ϐ������l�F i_h_ODR_LT


	final static String i_h_ODR_LT = null;

	// �� 39 �ϐ������l�F i_h_FIXED_LT


	final static String i_h_FIXED_LT = null;

	// �� 40 �ϐ������l�F i_h_PROP_LT


	final static String i_h_PROP_LT = null;

	// �� 41 �ϐ������l�F i_h_SAFETY_LT


	final static String i_h_SAFETY_LT = null;

	// �� 42 �ϐ������l�F i_h_ISSUE_LT


	final static String i_h_ISSUE_LT = null;

	// �� 43 �ϐ������l�F i_h_PROP_LOT_SIZE


	final static String i_h_PROP_LOT_SIZE = null;

	// �� 44 �ϐ������l�F i_h_ITEM_SPOIL


	final static String i_h_ITEM_SPOIL = null;

	// �� 45 �ϐ������l�F i_h_SAFETY_STOCK


	final static String i_h_SAFETY_STOCK = null;

	// �� 46 �ϐ������l�F i_h_LOT_SIZING_TYP


	final static String i_h_LOT_SIZING_TYP = null;

	// �� 47 �ϐ������l�F i_h_MAX_PERIOD


	final static String i_h_MAX_PERIOD = null;

	// �� 48 �ϐ������l�F i_h_MAX_ODR_QTY


	final static String i_h_MAX_ODR_QTY = null;

	// �� 49 �ϐ������l�F i_h_ODR_POINT


	final static String i_h_ODR_POINT = null;

	// �� 50 �ϐ������l�F i_h_FIXED_ODR_QTY


	final static String i_h_FIXED_ODR_QTY = null;

	// �� 51 �ϐ������l�F i_h_MIN_ODR_QTY


	final static String i_h_MIN_ODR_QTY = null;

	// �� 52 �ϐ������l�F i_h_MUL_ODR_QTY


	final static String i_h_MUL_ODR_QTY = null;

	// �� 53 �ϐ������l�F i_h_ISSUE_TYP


	final static String i_h_ISSUE_TYP = null;

	// �� 54 �ϐ������l�F i_h_MPS_FLG


	final static String i_h_MPS_FLG = null;

	// �� 55 �ϐ������l�F i_h_ACPT_INSPC_TYP


	final static String i_h_ACPT_INSPC_TYP = null;

	// �� 56 �ϐ������l�F i_h_PRODUCT_TYP


	final static String i_h_PRODUCT_TYP = null;

	// �� 57 �ϐ������l�F i_h_CLASIFICATION_CD


	final static String i_h_CLASIFICATION_CD = null;

	// �� 58 �ϐ������l�F i_h_UNIT_WEIGHT


	final static String i_h_UNIT_WEIGHT = null;

	// �� 59 �ϐ������l�F i_h_ABC_TYP


	final static String i_h_ABC_TYP = null;

	// �� 60 �ϐ������l�F i_h_OPR_RSLT_TYP


	final static String i_h_OPR_RSLT_TYP = null;

	// �� 61 �ϐ������l�F i_h_SPL_ITEM_TYP


	final static String i_h_SPL_ITEM_TYP = null;

	// �� 62 �ϐ������l�F i_h_TAX_CD


	final static String i_h_TAX_CD = null;

	// �� 63 �ϐ������l�F i_h_CAL_NO


	final static String i_h_CAL_NO = null;

	// �� 64 �ϐ������l�F i_h_MANHOUR_TYP


	final static String i_h_MANHOUR_TYP = null;

	// �� 65 �ϐ������l�F i_h_DEPO_TYP


	final static String i_h_DEPO_TYP = null;

	// �� 66 �ϐ������l�F i_h_LOT_CTRL_FLG


	final static String i_h_LOT_CTRL_FLG = null;

	// �� 67 �ϐ������l�F i_h_LOT_NUMBERING_TYP


	final static String i_h_LOT_NUMBERING_TYP = null;

	// �� 68 �ϐ������l�F i_h_BEST_BEFORE_YEAR


	final static String i_h_BEST_BEFORE_YEAR = null;

	// �� 69 �ϐ������l�F i_h_BEST_BEFORE_MONTH


	final static String i_h_BEST_BEFORE_MONTH = null;

	// �� 70 �ϐ������l�F i_h_BEST_BEFORE_DAY


	final static String i_h_BEST_BEFORE_DAY = null;

	// �� 71 �ϐ������l�F i_h_DEPT_CD


	final static String i_h_DEPT_CD = null;

	// �� 72 �ϐ������l�F i_h_PJ_CD


	final static String i_h_PJ_CD = null;

	// �� 73 �ϐ������l�F i_h_SEG_CONTENTS_1


	final static String i_h_SEG_CONTENTS_1 = null;

	// �� 74 �ϐ������l�F i_h_SEG_CONTENTS_2


	final static String i_h_SEG_CONTENTS_2 = null;

	// �� 75 �ϐ������l�F i_h_SEG_CONTENTS_3


	final static String i_h_SEG_CONTENTS_3 = null;

	// �� 76 �ϐ������l�F i_h_SEG_CONTENTS_4


	final static String i_h_SEG_CONTENTS_4 = null;

	// �� 77 �ϐ������l�F i_h_REMARK1


	final static String i_h_REMARK1 = null;

	// �� 78 �ϐ������l�F i_h_REMARK2


	final static String i_h_REMARK2 = null;

	// �� 79 �ϐ������l�F i_h_ITEM_CLASS_01_CD


	final static String i_h_ITEM_CLASS_01_CD = null;

	// �� 80 �ϐ������l�F i_h_ITEM_CLASS_02_CD


	final static String i_h_ITEM_CLASS_02_CD = null;

	// �� 81 �ϐ������l�F i_h_ITEM_CLASS_03_CD


	final static String i_h_ITEM_CLASS_03_CD = null;

	// �� 82 �ϐ������l�F i_h_ITEM_CLASS_04_CD


	final static String i_h_ITEM_CLASS_04_CD = null;

	// �� 83 �ϐ������l�F i_h_ITEM_CLASS_05_CD


	final static String i_h_ITEM_CLASS_05_CD = null;

	// �� 84 �ϐ������l�F i_h_ITEM_CLASS_06_CD


	final static String i_h_ITEM_CLASS_06_CD = null;

	// �� 85 �ϐ������l�F i_h_ITEM_CLASS_07_CD


	final static String i_h_ITEM_CLASS_07_CD = null;

	// �� 86 �ϐ������l�F i_h_ITEM_CLASS_08_CD


	final static String i_h_ITEM_CLASS_08_CD = null;

	// �� 87 �ϐ������l�F i_h_ITEM_CLASS_09_CD


	final static String i_h_ITEM_CLASS_09_CD = null;

	// �� 88 �ϐ������l�F i_h_ITEM_CLASS_10_CD


	final static String i_h_ITEM_CLASS_10_CD = null;

	// �� 89 �ϐ������l�F i_h_ITEM_CLASS_11_CD


	final static String i_h_ITEM_CLASS_11_CD = null;

	// �� 90 �ϐ������l�F i_h_ITEM_CLASS_12_CD


	final static String i_h_ITEM_CLASS_12_CD = null;

	// �� 91 �ϐ������l�F i_readTAX_CD


	final static String i_readTAX_CD = null;

	// �� 92 �ϐ������l�F i_setTAXCD


	final static String i_setTAXCD = null;

	// �� 93 �ϐ������l�F i_readITEM_CD


	final static String i_readITEM_CD = null;

	// �� 94 �ϐ������l�F i_setITEM_CD


	final static String i_setITEM_CD = null;

	// �� 95 �ϐ������l�F i_readVEND_CD


	final static String i_readVEND_CD = null;

	// �� 96 �ϐ������l�F i_setVEND_CD


	final static String i_setVEND_CD = null;

	// �� 97 �ϐ������l�F i_readPLANT_CD


	final static String i_readPLANT_CD = null;

	// �� 98 �ϐ������l�F i_readSUM_PROP_LT


	final static Integer i_readSUM_PROP_LT = null;

	// �� 99 �ϐ������l�F i_readSUM_FIXED_LT


	final static Integer i_readSUM_FIXED_LT = null;

	// �� 100 �ϐ������l�F i_readMRP_ITEM_CD


	final static String i_readMRP_ITEM_CD = null;

	// �� 101 �ϐ������l�F i_readMRP_ODR_TYP


	final static Integer i_readMRP_ODR_TYP = null;

	// �� 102 �ϐ������l�F i_setMRP_ITEM_CD


	final static String i_setMRP_ITEM_CD = null;

	// �� 103 �ϐ������l�F i_readMRP_ODR_ITEM_CD


	final static String i_readMRP_ODR_ITEM_CD = null;

	// �� 104 �ϐ������l�F i_setMRP_ODR_ITEM_CD


	final static String i_setMRP_ODR_ITEM_CD = null;

	// �� 105 �ϐ������l�F i_C_ITEM_CD


	final static String i_C_ITEM_CD = null;

	// �� 106 �ϐ������l�F i_C_ITEM_NAME


	final static String i_C_ITEM_NAME = null;

	// �� 107 �ϐ������l�F i_C_DRAW_CD


	final static String i_C_DRAW_CD = null;

	// �� 108 �ϐ������l�F i_C_SPEC


	final static String i_C_SPEC = null;

	// �� 109 �ϐ������l�F i_C_HIGH_LEVEL_NO


	final static String i_C_HIGH_LEVEL_NO = null;

	// �� 110 �ϐ������l�F i_C_MRP_ODR_TYP


	final static String i_C_MRP_ODR_TYP = null;

	// �� 111 �ϐ������l�F i_C_OUTSIDE_TYP


	final static String i_C_OUTSIDE_TYP = null;

	// �� 112 �ϐ������l�F i_C_STOCK_UNIT_FLG


	final static String i_C_STOCK_UNIT_FLG = null;

	// �� 113 �ϐ������l�F i_C_STOCK_UNIT


	final static String i_C_STOCK_UNIT = null;

	// �� 114 �ϐ������l�F i_C_PKG_UNIT


	final static String i_C_PKG_UNIT = null;

	// �� 115 �ϐ������l�F i_C_PKG_UNIT_QTY


	final static String i_C_PKG_UNIT_QTY = null;

	// �� 116 �ϐ������l�F i_C_UNIT_QTY_TYP


	final static String i_C_UNIT_QTY_TYP = null;

	// �� 117 �ϐ������l�F i_C_ODR_LT


	final static String i_C_ODR_LT = null;

	// �� 118 �ϐ������l�F i_C_FIXED_LT


	final static String i_C_FIXED_LT = null;

	// �� 119 �ϐ������l�F i_C_PROP_LT


	final static String i_C_PROP_LT = null;

	// �� 120 �ϐ������l�F i_C_SAFETY_LT


	final static String i_C_SAFETY_LT = null;

	// �� 121 �ϐ������l�F i_C_ISSUE_LT


	final static String i_C_ISSUE_LT = null;

	// �� 122 �ϐ������l�F i_C_PROP_LOT_SIZE


	final static String i_C_PROP_LOT_SIZE = null;

	// �� 123 �ϐ������l�F i_C_ITEM_SPOIL


	final static String i_C_ITEM_SPOIL = null;

	// �� 124 �ϐ������l�F i_C_SAFETY_STOCK


	final static String i_C_SAFETY_STOCK = null;

	// �� 125 �ϐ������l�F i_C_LOT_SIZING_TYP


	final static String i_C_LOT_SIZING_TYP = null;

	// �� 126 �ϐ������l�F i_C_MAX_PERIOD


	final static String i_C_MAX_PERIOD = null;

	// �� 127 �ϐ������l�F i_C_MAX_ODR_QTY


	final static String i_C_MAX_ODR_QTY = null;

	// �� 128 �ϐ������l�F i_C_ODR_POINT


	final static String i_C_ODR_POINT = null;

	// �� 129 �ϐ������l�F i_C_FIXED_ODR_QTY


	final static String i_C_FIXED_ODR_QTY = null;

	// �� 130 �ϐ������l�F i_C_MIN_ODR_QTY


	final static String i_C_MIN_ODR_QTY = null;

	// �� 131 �ϐ������l�F i_C_MUL_ODR_QTY


	final static String i_C_MUL_ODR_QTY = null;

	// �� 132 �ϐ������l�F i_C_ISSUE_TYP


	final static String i_C_ISSUE_TYP = null;

	// �� 133 �ϐ������l�F i_C_MPS_FLG


	final static String i_C_MPS_FLG = null;

	// �� 134 �ϐ������l�F i_C_ACPT_INSPC_TYP


	final static String i_C_ACPT_INSPC_TYP = null;

	// �� 135 �ϐ������l�F i_C_PRODUCT_TYP


	final static String i_C_PRODUCT_TYP = null;

	// �� 136 �ϐ������l�F i_C_CLASIFICATION_CD


	final static String i_C_CLASIFICATION_CD = null;

	// �� 137 �ϐ������l�F i_C_UNIT_WEIGHT


	final static String i_C_UNIT_WEIGHT = null;

	// �� 138 �ϐ������l�F i_C_ABC_TYP


	final static String i_C_ABC_TYP = null;

	// �� 139 �ϐ������l�F i_C_OPR_RSLT_TYP


	final static String i_C_OPR_RSLT_TYP = null;

	// �� 140 �ϐ������l�F i_C_SPL_ITEM_TYP


	final static String i_C_SPL_ITEM_TYP = null;

	// �� 141 �ϐ������l�F i_C_TAX_CD


	final static String i_C_TAX_CD = null;

	// �� 142 �ϐ������l�F i_C_CAL_NO


	final static String i_C_CAL_NO = null;

	// �� 143 �ϐ������l�F i_C_MANHOUR_TYP


	final static String i_C_MANHOUR_TYP = null;

	// �� 144 �ϐ������l�F i_C_DEPO_TYP


	final static String i_C_DEPO_TYP = null;

	// �� 145 �ϐ������l�F i_C_LOT_CTRL_FLG


	final static String i_C_LOT_CTRL_FLG = null;

	// �� 146 �ϐ������l�F i_C_LOT_NUMBERING_TYP


	final static String i_C_LOT_NUMBERING_TYP = null;

	// �� 147 �ϐ������l�F i_C_BEST_BEFORE_YEAR


	final static String i_C_BEST_BEFORE_YEAR = null;

	// �� 148 �ϐ������l�F i_C_BEST_BEFORE_MONTH


	final static String i_C_BEST_BEFORE_MONTH = null;

	// �� 149 �ϐ������l�F i_C_BEST_BEFORE_DAY


	final static String i_C_BEST_BEFORE_DAY = null;

	// �� 150 �ϐ������l�F i_C_REMARK1


	final static String i_C_REMARK1 = null;

	// �� 151 �ϐ������l�F i_C_REMARK2


	final static String i_C_REMARK2 = null;

	// �� 152 �ϐ������l�F i_C_ITEM_CLASS_01_CD


	final static String i_C_ITEM_CLASS_01_CD = null;

	// �� 153 �ϐ������l�F i_C_ITEM_CLASS_02_CD


	final static String i_C_ITEM_CLASS_02_CD = null;

	// �� 154 �ϐ������l�F i_C_ITEM_CLASS_03_CD


	final static String i_C_ITEM_CLASS_03_CD = null;

	// �� 155 �ϐ������l�F i_C_ITEM_CLASS_04_CD


	final static String i_C_ITEM_CLASS_04_CD = null;

	// �� 156 �ϐ������l�F i_C_ITEM_CLASS_05_CD


	final static String i_C_ITEM_CLASS_05_CD = null;

	// �� 157 �ϐ������l�F i_C_ITEM_CLASS_06_CD


	final static String i_C_ITEM_CLASS_06_CD = null;

	// �� 158 �ϐ������l�F i_C_ITEM_CLASS_07_CD


	final static String i_C_ITEM_CLASS_07_CD = null;

	// �� 159 �ϐ������l�F i_C_ITEM_CLASS_08_CD


	final static String i_C_ITEM_CLASS_08_CD = null;

	// �� 160 �ϐ������l�F i_C_ITEM_CLASS_09_CD


	final static String i_C_ITEM_CLASS_09_CD = null;

	// �� 161 �ϐ������l�F i_C_ITEM_CLASS_10_CD


	final static String i_C_ITEM_CLASS_10_CD = null;

	// �� 162 �ϐ������l�F i_C_ITEM_CLASS_11_CD


	final static String i_C_ITEM_CLASS_11_CD = null;

	// �� 163 �ϐ������l�F i_C_ITEM_CLASS_12_CD


	final static String i_C_ITEM_CLASS_12_CD = null;

	// �� 164 �ϐ������l�F i_C_DEPT_CD


	final static String i_C_DEPT_CD = null;

	// �� 165 �ϐ������l�F i_C_PJ_CD


	final static String i_C_PJ_CD = null;

	// �� 166 �ϐ������l�F i_C_SEG_CONTENTS_1


	final static String i_C_SEG_CONTENTS_1 = null;

	// �� 167 �ϐ������l�F i_C_SEG_CONTENTS_2


	final static String i_C_SEG_CONTENTS_2 = null;

	// �� 168 �ϐ������l�F i_C_SEG_CONTENTS_3


	final static String i_C_SEG_CONTENTS_3 = null;

	// �� 169 �ϐ������l�F i_C_SEG_CONTENTS_4


	final static String i_C_SEG_CONTENTS_4 = null;

	// �� 170 �ϐ������l�F i_C_setITEM_CD


	final static String i_C_setITEM_CD = null;

	// �� 171 �ϐ������l�F i_readT_OD_ITEM_CD


	final static String i_readT_OD_ITEM_CD = null;

	// �� 172 �ϐ������l�F i_setT_OD_ITEM_CD


	final static String i_setT_OD_ITEM_CD = null;

	// �� 173 �ϐ������l�F i_readM_PS_ITEM_CD


	final static String i_readM_PS_ITEM_CD = null;

	// �� 174 �ϐ������l�F i_setM_PS_ITEM_CD


	final static String i_setM_PS_ITEM_CD = null;

	// �� 175 �ϐ������l�F i_readT_ITEM_STOCK_ITEM_CD


	final static String i_readT_ITEM_STOCK_ITEM_CD = null;

	// �� 176 �ϐ������l�F i_readT_ITEM_STOCK_STOCK_ON_HAND_QTY


	final static String i_readT_ITEM_STOCK_STOCK_ON_HAND_QTY = null;

	// �� 177 �ϐ������l�F i_setT_ITEM_STOCK_ITEM_CD


	final static String i_setT_ITEM_STOCK_ITEM_CD = null;

	// �� 178 �ϐ������l�F i_readT_JOB_ODR_CD_ITEM_CD


	final static String i_readT_JOB_ODR_CD_ITEM_CD = null;

	// �� 179 �ϐ������l�F i_readT_JOB_ODR_CD_STOCK_ON_HAND_QTY


	final static String i_readT_JOB_ODR_CD_STOCK_ON_HAND_QTY = null;

	// �� 180 �ϐ������l�F i_setT_JOB_ODR_CD_ITEM_CD


	final static String i_setT_JOB_ODR_CD_ITEM_CD = null;

	// �� 181 �ϐ������l�F i_readT_RLSD_P_ITEM_CD


	final static String i_readT_RLSD_P_ITEM_CD = null;

	// �� 182 �ϐ������l�F i_setT_RLSD_P_ITEM_CD


	final static String i_setT_RLSD_P_ITEM_CD = null;

	// �� 183 �ϐ������l�F i_readT_WORK_IN_ITEM_CD


	final static String i_readT_WORK_IN_ITEM_CD = null;

	// �� 184 �ϐ������l�F i_setT_WORK_IN_ITEM_CD


	final static String i_setT_WORK_IN_ITEM_CD = null;

	// �� 185 �ϐ������l�F i_readT_JOB_ODR_ITEM_CD


	final static String i_readT_JOB_ODR_ITEM_CD = null;

	// �� 186 �ϐ������l�F i_setT_JOB_ODR_ITEM_CD


	final static String i_setT_JOB_ODR_ITEM_CD = null;

	// �� 187 �ϐ������l�F i_readT_OPR_RSLT_ITEM_CD


	final static String i_readT_OPR_RSLT_ITEM_CD = null;

	// �� 188 �ϐ������l�F i_setT_OPR_RSLT_ITEM_CD


	final static String i_setT_OPR_RSLT_ITEM_CD = null;

	// �� 189 �ϐ������l�F i_setM_WH_ITEM_CD


	final static String i_setM_WH_ITEM_CD = null;

	// �� 190 �ϐ������l�F i_setM_WH_WH_CD


	final static String i_setM_WH_WH_CD = null;

	// �� 191 �ϐ������l�F i_setM_WH_PLANT_CD


	final static String i_setM_WH_PLANT_CD = null;

	// �� 192 �ϐ������l�F i_setM_WH_WH_REF_NO


	final static String i_setM_WH_WH_REF_NO = null;

	// �� 193 �ϐ������l�F i_readM_WH_ITEM_CD


	final static String i_readM_WH_ITEM_CD = null;

	// �� 194 �ϐ������l�F i_readM_WH_WH_CD


	final static String i_readM_WH_WH_CD = null;

	// �� 195 �ϐ������l�F i_readM_CAL_H_CAL_NO


	final static String i_readM_CAL_H_CAL_NO = null;

	// �� 196 �ϐ������l�F i_setM_CAL_H_CAL_NO


	final static String i_setM_CAL_H_CAL_NO = null;

	// �� 197 �ϐ������l�F i_readCLASS_CD1


	final static String i_readCLASS_CD1 = null;

	// �� 198 �ϐ������l�F i_setCLASS_CD2


	final static String i_setCLASS_CD2 = null;

	// �� 199 �ϐ������l�F i_setCLASS_CD3


	final static String i_setCLASS_CD3 = null;

	// �� 200 �ϐ������l�F i_readM_ITEM_STOCK_UNIT


	final static String i_readM_ITEM_STOCK_UNIT = null;

	// �� 201 �ϐ������l�F i_readM_ITEM_LOT_CTRL_FLG


	final static String i_readM_ITEM_LOT_CTRL_FLG = null;

	// �� 202 �ϐ������l�F i_readM_ITEM_MRP_ODR_TYP


	final static String i_readM_ITEM_MRP_ODR_TYP = null;

	// �� 203 �ϐ������l�F i_setM_ITEM_ITEM_CD


	final static String i_setM_ITEM_ITEM_CD = null;

	// �� 204 �ϐ������l�F i_setDISPLAY_NAME


	final static String i_setDISPLAY_NAME = null;

	// �� 205 �ϐ������l�F i_VALUE


	final static String i_VALUE = null;

	// �� 206 �ϐ������l�F i_DEPT_CD


	final static String i_DEPT_CD = null;

*/

	//{{user_implement_code
        // TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
        // �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
        // �� 1 �ϐ������l�F i_readNAME
        final static String i_readNAME = null;
        // �� 2 �ϐ������l�F i_readVALUE
        final static String i_readVALUE = null;
        // �� 3 �ϐ������l�F i_setNAME
        final static String i_setNAME = null;
        // �� 4 �ϐ������l�F i_setVALUE
        final static String i_setVALUE = null;
        // �� 5 �ϐ������l�F i_readSYS_P_NAME
        final static String i_readSYS_P_NAME = null;
        // �� 6 �ϐ������l�F i_readSYS_P_VALUE
        final static String i_readSYS_P_VALUE = null;
        // �� 7 �ϐ������l�F i_setSYS_P_NAME
        final static String i_setSYS_P_NAME = null;
        // �� 8 �ϐ������l�F i_h_ITEM_CD
        final static String i_h_ITEM_CD = null;
        // �� 9 �ϐ������l�F i_h_ITEM_NAME
        final static String i_h_ITEM_NAME = null;
        // �� 10 �ϐ������l�F i_h_DRAW_CD
        final static String i_h_DRAW_CD = null;
        // �� 11 �ϐ������l�F i_h_SPEC
        final static String i_h_SPEC = null;
        // �� 12 �ϐ������l�F i_h_HIGH_LEVEL_NO
        final static String i_h_HIGH_LEVEL_NO = null;
        // �� 13 �ϐ������l�F i_h_MRP_ODR_TYP
        final static String i_h_MRP_ODR_TYP = null;
        // �� 14 �ϐ������l�F i_h_OUTSIDE_TYP
        final static String i_h_OUTSIDE_TYP = null;
        // �� 15 �ϐ������l�F i_h_STOCK_UNIT_FLG
        final static String i_h_STOCK_UNIT_FLG = null;
        // �� 16 �ϐ������l�F i_h_STOCK_UNIT
        final static String i_h_STOCK_UNIT = null;
        // �� 17 �ϐ������l�F i_h_PKG_UNIT
        final static String i_h_PKG_UNIT = null;
        // �� 18 �ϐ������l�F i_h_PKG_UNIT_QTY
        final static String i_h_PKG_UNIT_QTY = null;
        // �� 19 �ϐ������l�F i_h_UNIT_QTY_TYP
        final static String i_h_UNIT_QTY_TYP = null;
        // �� 20 �ϐ������l�F i_h_ODR_LT
        final static String i_h_ODR_LT = null;
        // �� 21 �ϐ������l�F i_h_FIXED_LT
        final static String i_h_FIXED_LT = null;
        // �� 22 �ϐ������l�F i_h_PROP_LT
        final static String i_h_PROP_LT = null;
        // �� 23 �ϐ������l�F i_h_SAFETY_LT
        final static String i_h_SAFETY_LT = null;
        // �� 24 �ϐ������l�F i_h_ISSUE_LT
        final static String i_h_ISSUE_LT = null;
        // �� 25 �ϐ������l�F i_h_PROP_LOT_SIZE
        final static String i_h_PROP_LOT_SIZE = null;
        // �� 26 �ϐ������l�F i_h_ITEM_SPOIL
        final static String i_h_ITEM_SPOIL = null;
        // �� 27 �ϐ������l�F i_h_SAFETY_STOCK
        final static String i_h_SAFETY_STOCK = null;
        // �� 28 �ϐ������l�F i_h_LOT_SIZING_TYP
        final static String i_h_LOT_SIZING_TYP = null;
        // �� 29 �ϐ������l�F i_h_MAX_PERIOD
        final static String i_h_MAX_PERIOD = null;
        // �� 30 �ϐ������l�F i_h_MAX_ODR_QTY
        final static String i_h_MAX_ODR_QTY = null;
        // �� 31 �ϐ������l�F i_h_ODR_POINT
        final static String i_h_ODR_POINT = null;
        // �� 32 �ϐ������l�F i_h_FIXED_ODR_QTY
        final static String i_h_FIXED_ODR_QTY = null;
        // �� 33 �ϐ������l�F i_h_MIN_ODR_QTY
        final static String i_h_MIN_ODR_QTY = null;
        // �� 34 �ϐ������l�F i_h_MUL_ODR_QTY
        final static String i_h_MUL_ODR_QTY = null;
        // �� 35 �ϐ������l�F i_h_ISSUE_TYP
        final static String i_h_ISSUE_TYP = null;
        // �� 36 �ϐ������l�F i_h_MPS_FLG
        final static String i_h_MPS_FLG = null;
        // �� 37 �ϐ������l�F i_h_ACPT_INSPC_TYP
        final static String i_h_ACPT_INSPC_TYP = null;
        // �� 38 �ϐ������l�F i_h_PRODUCT_TYP
        final static String i_h_PRODUCT_TYP = null;
        // �� 39 �ϐ������l�F i_h_CLASIFICATION_CD
        final static String i_h_CLASIFICATION_CD = null;
        // �� 40 �ϐ������l�F i_h_UNIT_WEIGHT
        final static String i_h_UNIT_WEIGHT = null;
        // �� 41 �ϐ������l�F i_h_ABC_TYP
        final static String i_h_ABC_TYP = null;
        // �� 42 �ϐ������l�F i_h_OPR_RSLT_TYP
        final static String i_h_OPR_RSLT_TYP = null;
        // �� 43 �ϐ������l�F i_h_SPL_ITEM_TYP
        final static String i_h_SPL_ITEM_TYP = null;
        // �� 44 �ϐ������l�F i_h_TAX_CD
        final static String i_h_TAX_CD = null;
        // �� 48 �ϐ������l�F i_h_MATERIAL_TYP
        final static String i_h_MATERIAL_TYP = null;
        // �� 49 �ϐ������l�F i_h_THICKNESS
        final static String i_h_THICKNESS = null;
        // �� 50 �ϐ������l�F i_h_WIDTH
        final static String i_h_WIDTH = null;
        // �� 51 �ϐ������l�F i_h_LENGTH
        final static String i_h_LENGTH = null;
        // �� 52 �ϐ������l�F i_readTAX_CD
        final static String i_readTAX_CD = null;
        // �� 53 �ϐ������l�F i_setTAXCD
        final static String i_setTAXCD = null;
        // �� 54 �ϐ������l�F i_readITEM_CD
        final static String i_readITEM_CD = null;
        // �� 55 �ϐ������l�F i_setITEM_CD
        final static String i_setITEM_CD = null;
        // �� 56 �ϐ������l�F i_readVEND_CD
        final static String i_readVEND_CD = null;
        // �� 57 �ϐ������l�F i_setVEND_CD
        final static String i_setVEND_CD = null;
        // �� 58 �ϐ������l�F i_readPLANT_CD
        final static String i_readPLANT_CD = null;
        // �� 59 �ϐ������l�F i_readSUM_PROP_LT
        final static Integer i_readSUM_PROP_LT = null;
        // �� 60 �ϐ������l�F i_readSUM_FIXED_LT
        final static Integer i_readSUM_FIXED_LT = null;
        // �� 61 �ϐ������l�F i_readMRP_ITEM_CD
        final static String i_readMRP_ITEM_CD = null;
        // �� 62 �ϐ������l�F i_readMRP_ODR_TYP
        final static Integer i_readMRP_ODR_TYP = null;
        // �� 63 �ϐ������l�F i_setMRP_ITEM_CD
        final static String i_setMRP_ITEM_CD = null;
        // �� 64 �ϐ������l�F i_readMRP_ODR_ITEM_CD
        final static String i_readMRP_ODR_ITEM_CD = null;
        // �� 65 �ϐ������l�F i_setMRP_ODR_ITEM_CD
        final static String i_setMRP_ODR_ITEM_CD = null;
        // �� 66 �ϐ������l�F i_rdoInsert
        final static String i_rdoInsert = null;
        // �� 67 �ϐ������l�F i_DO_CHK
        final static String i_DO_CHK = null;
        // �� 68 �ϐ������l�F i_rdoUpdate
        final static String i_rdoUpdate = null;
        // �� 69 �ϐ������l�F i_rdoDelete
        final static String i_rdoDelete = null;
        // �� 70 �ϐ������l�F i_h_SYORI_KUBUN
        final static String i_h_SYORI_KUBUN = null;
        // �� 71 �ϐ������l�F i_DOWNLOAD_FILE
        final static String i_DOWNLOAD_FILE = null;
        // �� 72 �ϐ������l�F i_LINE_INPUT
        //final static String i_LINE_INPUT = null;
        // �� 73 �ϐ������l�F i_FileName
        final static String i_FileName = null;
        // �� 74 �ϐ������l�F i_JUDGTXT
        //final static String i_JUDGTXT = null;
        // �� 75 �ϐ������l�F i_w_COLUMN_FLG
        // �� 76 �ϐ������l�F i_h_CAL_NO
        final static String i_h_CAL_NO = null;
        final static String i_h_MANHOUR_TYP = null;
        final static String i_w_COLUMN_FLG = null;
        final static String i_CANCEL_FILE = null;

        final static String i_C_ITEM_CD = null;
        final static String i_C_ITEM_NAME = null;
        final static String i_C_DRAW_CD = null;
        final static String i_C_SPEC = null;
        final static String i_C_HIGH_LEVEL_NO = null;
        final static String i_C_MRP_ODR_TYP = null;
        final static String i_C_OUTSIDE_TYP = null;
        final static String i_C_STOCK_UNIT_FLG = null;
        final static String i_C_STOCK_UNIT = null;
        final static String i_C_PKG_UNIT = null;
        final static String i_C_PKG_UNIT_QTY = null;
        final static String i_C_UNIT_QTY_TYP = null;
        final static String i_C_ODR_LT = null;
        final static String i_C_FIXED_LT = null;
        final static String i_C_PROP_LT = null;
        final static String i_C_SAFETY_LT = null;
        final static String i_C_ISSUE_LT = null;
        final static String i_C_PROP_LOT_SIZE = null;
        final static String i_C_ITEM_SPOIL = null;
        final static String i_C_SAFETY_STOCK = null;
        final static String i_C_LOT_SIZING_TYP = null;
        final static String i_C_MAX_PERIOD = null;
        final static String i_C_MAX_ODR_QTY = null;
        final static String i_C_ODR_POINT = null;
        final static String i_C_FIXED_ODR_QTY = null;
        final static String i_C_MIN_ODR_QTY = null;
        final static String i_C_MUL_ODR_QTY = null;
        final static String i_C_ISSUE_TYP = null;
        final static String i_C_MPS_FLG = null;
        final static String i_C_ACPT_INSPC_TYP = null;
        final static String i_C_PRODUCT_TYP = null;
        final static String i_C_CLASIFICATION_CD = null;
        final static String i_C_UNIT_WEIGHT = null;
        final static String i_C_ABC_TYP = null;
        final static String i_C_OPR_RSLT_TYP = null;
        final static String i_C_SPL_ITEM_TYP = null;
        final static String i_C_TAX_CD = null;
        final static String i_C_MATERIAL_TYP = null;
        final static String i_C_THICKNESS = null;
        final static String i_C_WIDTH = null;
        final static String i_C_LENGTH = null;
        final static String i_C_setITEM_CD = null;
        final static String i_C_MANHOUR_TYP = null;
        final static String i_readT_OD_ITEM_CD = null;
        final static String i_setT_OD_ITEM_CD = null;
        final static String i_readT_JOB_ODR_ITEM_CD = null;
        final static String i_setT_JOB_ODR_ITEM_CD = null;
        final static String i_readM_PS_ITEM_CD = null;
        final static String i_setM_PS_ITEM_CD = null;
        final static String i_readT_ITEM_STOCK_ITEM_CD = null;
        final static String i_setT_ITEM_STOCK_ITEM_CD = null;
        final static String i_readT_JOB_ODR_CD_ITEM_CD = null;
        final static String i_setT_JOB_ODR_CD_ITEM_CD = null;
        final static String i_readT_OPR_RSLT_ITEM_CD = null;
        final static String i_setT_OPR_RSLT_ITEM_CD = null;
        final static String i_readT_RLSD_P_ITEM_CD = null;
        final static String i_setT_RLSD_P_ITEM_CD = null;
        final static String i_readT_WORK_IN_ITEM_CD = null;
        final static String i_setT_WORK_IN_ITEM_CD = null;
        final static String i_JUDGMENT_TXT = null;
        
        final static String i_h_DEPO_TYP = null;
        final static String i_h_LOT_CTRL_FLG = null;
        final static String i_h_LOT_NUMBERING_TYP = null;
        final static String i_h_BEST_BEFORE_YEAR = null;
        final static String i_h_BEST_BEFORE_MONTH = null;
        final static String i_h_BEST_BEFORE_DAY = null;
//20150803 ADD START BY SYSCOM
    	final static String i_h_DEPT_CD = null;
    	final static String i_h_PJ_CD = null;
    	final static String i_h_SEG_CONTENTS_1 = null;
    	final static String i_h_SEG_CONTENTS_2 = null;
    	final static String i_h_SEG_CONTENTS_3 = null;
    	final static String i_h_SEG_CONTENTS_4 = null;
//20150803 ADD END BY SYSCOM
        final static String i_h_REMARK1 = null;
        final static String i_h_REMARK2 = null;
        final static String i_h_ITEM_CLASS_01_CD = null;
        final static String i_h_ITEM_CLASS_02_CD = null;
        final static String i_h_ITEM_CLASS_03_CD = null;
        final static String i_h_ITEM_CLASS_04_CD = null;
        final static String i_h_ITEM_CLASS_05_CD = null;
        final static String i_h_ITEM_CLASS_06_CD = null;
        final static String i_h_ITEM_CLASS_07_CD = null;
        final static String i_h_ITEM_CLASS_08_CD = null;
        final static String i_h_ITEM_CLASS_09_CD = null;
        final static String i_h_ITEM_CLASS_10_CD = null;
        final static String i_h_ITEM_CLASS_11_CD = null;
        final static String i_h_ITEM_CLASS_12_CD = null;
        final static String i_C_DEPO_TYP = null;
        final static String i_C_LOT_CTRL_FLG = null;
        final static String i_C_LOT_NUMBERING_TYP = null;
        final static String i_C_BEST_BEFORE_YEAR = null;
        final static String i_C_BEST_BEFORE_MONTH = null;
        final static String i_C_BEST_BEFORE_DAY = null;
//20150803 ADD START BY SYSCOM
    	final static String i_C_DEPT_CD = null;
    	final static String i_C_PJ_CD = null;
    	final static String i_C_SEG_CONTENTS_1 = null;
    	final static String i_C_SEG_CONTENTS_2 = null;
    	final static String i_C_SEG_CONTENTS_3 = null;
    	final static String i_C_SEG_CONTENTS_4 = null;
//20150803 ADD END BY SYSCOM
        final static String i_C_REMARK1 = null;
        final static String i_C_REMARK2 = null;
        final static String i_C_ITEM_CLASS_01_CD = null;
        final static String i_C_ITEM_CLASS_02_CD = null;
        final static String i_C_ITEM_CLASS_03_CD = null;
        final static String i_C_ITEM_CLASS_04_CD = null;
        final static String i_C_ITEM_CLASS_05_CD = null;
        final static String i_C_ITEM_CLASS_06_CD = null;
        final static String i_C_ITEM_CLASS_07_CD = null;
        final static String i_C_ITEM_CLASS_08_CD = null;
        final static String i_C_ITEM_CLASS_09_CD = null;
        final static String i_C_ITEM_CLASS_10_CD = null;
        final static String i_C_ITEM_CLASS_11_CD = null;
        final static String i_C_ITEM_CLASS_12_CD = null;  
        final static String i_readCLASS_CD1 = null;
        final static String i_setCLASS_CD2 = null;
        final static String i_setCLASS_CD3 = null;
        final static String i_readM_ITEM_STOCK_UNIT = null;
        final static String i_readM_ITEM_LOT_CTRL_FLG = null;
        final static String i_readM_ITEM_MRP_ODR_TYP = null;
        final static String i_setM_ITEM_ITEM_CD = null;
        final static String i_setDISPLAY_NAME = null;
//20150803 ADD START BY SYSCOM
        final static String i_VALUE = null;
        final static String i_DEPT_CD = null;
//20150803 ADD END BY SYSCOM

        
    /**
     * ������
     *
     */
    public void initialize()
    {
        clear();
        m_readNAME = i_readNAME;
        m_readVALUE = i_readVALUE;
        m_setNAME = i_setNAME;
        m_setVALUE = i_setVALUE;
        m_readSYS_P_NAME = i_readSYS_P_NAME;
        m_readSYS_P_VALUE = i_readSYS_P_VALUE;
        m_setSYS_P_NAME = i_setSYS_P_NAME;
        m_rdoInsert = i_rdoInsert;
        //m_CSV_FILE = i_CSV_FILE;
        //m_ERRLOG_FILE = i_ERRLOG_FILE;
        m_DO_CHK = i_DO_CHK;
        m_rdoUpdate = i_rdoUpdate;
        m_rdoDelete = i_rdoDelete;
        //m_LINE_INPUT = i_LINE_INPUT;
        m_DOWNLOAD_FILE = i_DOWNLOAD_FILE;
        
        m_h_ITEM_CD = i_h_ITEM_CD;
        m_h_ITEM_NAME = i_h_ITEM_NAME;
        m_h_DRAW_CD = i_h_DRAW_CD;
        m_h_SPEC = i_h_SPEC;
        m_h_HIGH_LEVEL_NO = i_h_HIGH_LEVEL_NO;
        m_h_MRP_ODR_TYP = i_h_MRP_ODR_TYP;
        m_h_OUTSIDE_TYP = i_h_OUTSIDE_TYP;
        m_h_STOCK_UNIT_FLG = i_h_STOCK_UNIT_FLG;
        m_h_STOCK_UNIT = i_h_STOCK_UNIT;
        m_h_PKG_UNIT = i_h_PKG_UNIT;
        m_h_PKG_UNIT_QTY = i_h_PKG_UNIT_QTY;
        m_h_UNIT_QTY_TYP = i_h_UNIT_QTY_TYP;
        m_h_ODR_LT = i_h_ODR_LT;
        m_h_FIXED_LT = i_h_FIXED_LT;
        m_h_PROP_LT = i_h_PROP_LT;
        m_h_SAFETY_LT = i_h_SAFETY_LT;
        m_h_ISSUE_LT = i_h_ISSUE_LT;
        m_h_PROP_LOT_SIZE = i_h_PROP_LOT_SIZE;
        m_h_ITEM_SPOIL = i_h_ITEM_SPOIL;
        m_h_SAFETY_STOCK = i_h_SAFETY_STOCK;
        m_h_LOT_SIZING_TYP = i_h_LOT_SIZING_TYP;
        m_h_MAX_PERIOD = i_h_MAX_PERIOD;
        m_h_MAX_ODR_QTY = i_h_MAX_ODR_QTY;
        m_h_ODR_POINT = i_h_ODR_POINT;
        m_h_FIXED_ODR_QTY = i_h_FIXED_ODR_QTY;
        m_h_MIN_ODR_QTY = i_h_MIN_ODR_QTY;
        m_h_MUL_ODR_QTY = i_h_MUL_ODR_QTY;
        m_h_ISSUE_TYP = i_h_ISSUE_TYP;
        m_h_MPS_FLG = i_h_MPS_FLG;
        m_h_ACPT_INSPC_TYP = i_h_ACPT_INSPC_TYP;
        m_h_PRODUCT_TYP = i_h_PRODUCT_TYP;
        m_h_CLASIFICATION_CD = i_h_CLASIFICATION_CD;
        m_h_UNIT_WEIGHT = i_h_UNIT_WEIGHT;
        m_h_ABC_TYP = i_h_ABC_TYP;
        m_h_OPR_RSLT_TYP = i_h_OPR_RSLT_TYP;
        m_h_SPL_ITEM_TYP = i_h_SPL_ITEM_TYP;
        m_h_TAX_CD = i_h_TAX_CD;
        m_h_CAL_NO = i_h_CAL_NO;
        m_h_SYORI_KUBUN = i_h_SYORI_KUBUN;
        m_h_MANHOUR_TYP = i_h_MANHOUR_TYP;
        m_w_COLUMN_FLG = i_w_COLUMN_FLG;
        m_CANCEL_FILE = i_CANCEL_FILE;
        m_C_ITEM_CD = i_C_ITEM_CD;
        m_C_ITEM_NAME = i_C_ITEM_NAME;
        m_C_DRAW_CD = i_C_DRAW_CD;
        m_C_SPEC = i_C_SPEC;
        m_C_HIGH_LEVEL_NO = i_C_HIGH_LEVEL_NO;
        m_C_MRP_ODR_TYP = i_C_MRP_ODR_TYP;
        m_C_OUTSIDE_TYP = i_C_OUTSIDE_TYP;
        m_C_STOCK_UNIT_FLG = i_C_STOCK_UNIT_FLG;
        m_C_STOCK_UNIT = i_C_STOCK_UNIT;
        m_C_PKG_UNIT = i_C_PKG_UNIT;
        m_C_PKG_UNIT_QTY = i_C_PKG_UNIT_QTY;
        m_C_UNIT_QTY_TYP = i_C_UNIT_QTY_TYP;
        m_C_ODR_LT = i_C_ODR_LT;
        m_C_FIXED_LT = i_C_FIXED_LT;
        m_C_PROP_LT = i_C_PROP_LT;
        m_C_SAFETY_LT = i_C_SAFETY_LT;
        m_C_ISSUE_LT = i_C_ISSUE_LT;
        m_C_PROP_LOT_SIZE = i_C_PROP_LOT_SIZE;
        m_C_ITEM_SPOIL = i_C_ITEM_SPOIL;
        m_C_SAFETY_STOCK = i_C_SAFETY_STOCK;
        m_C_LOT_SIZING_TYP = i_C_LOT_SIZING_TYP;
        m_C_MAX_PERIOD = i_C_MAX_PERIOD;
        m_C_MAX_ODR_QTY = i_C_MAX_ODR_QTY;
        m_C_ODR_POINT = i_C_ODR_POINT;
        m_C_FIXED_ODR_QTY = i_C_FIXED_ODR_QTY;
        m_C_MIN_ODR_QTY = i_C_MIN_ODR_QTY;
        m_C_MUL_ODR_QTY = i_C_MUL_ODR_QTY;
        m_C_ISSUE_TYP = i_C_ISSUE_TYP;
        m_C_MPS_FLG = i_C_MPS_FLG;
        m_C_ACPT_INSPC_TYP = i_C_ACPT_INSPC_TYP;
        m_C_PRODUCT_TYP = i_C_PRODUCT_TYP;
        m_C_CLASIFICATION_CD = i_C_CLASIFICATION_CD;
        m_C_UNIT_WEIGHT = i_C_UNIT_WEIGHT;
        m_C_ABC_TYP = i_C_ABC_TYP;
        m_C_OPR_RSLT_TYP = i_C_OPR_RSLT_TYP;
        m_C_SPL_ITEM_TYP = i_C_SPL_ITEM_TYP;
        m_C_TAX_CD = i_C_TAX_CD;
        m_C_setITEM_CD = i_C_setITEM_CD;
        m_C_MANHOUR_TYP = i_C_MANHOUR_TYP;
        m_readT_OD_ITEM_CD = i_readT_OD_ITEM_CD;
        m_setT_OD_ITEM_CD = i_setT_OD_ITEM_CD;
        m_readT_JOB_ODR_ITEM_CD = i_readT_JOB_ODR_ITEM_CD;
        m_setT_JOB_ODR_ITEM_CD = i_setT_JOB_ODR_ITEM_CD;
        m_readM_PS_ITEM_CD = i_readM_PS_ITEM_CD;
        m_setM_PS_ITEM_CD = i_setM_PS_ITEM_CD;
        m_readT_ITEM_STOCK_ITEM_CD = i_readT_ITEM_STOCK_ITEM_CD;
        m_setT_ITEM_STOCK_ITEM_CD = i_setT_ITEM_STOCK_ITEM_CD;
        m_readT_JOB_ODR_CD_ITEM_CD = i_readT_JOB_ODR_CD_ITEM_CD;
        m_setT_JOB_ODR_CD_ITEM_CD = i_setT_JOB_ODR_CD_ITEM_CD;
        m_readT_OPR_RSLT_ITEM_CD = i_readT_OPR_RSLT_ITEM_CD;
        m_setT_OPR_RSLT_ITEM_CD = i_setT_OPR_RSLT_ITEM_CD;
        m_readT_RLSD_P_ITEM_CD = i_readT_RLSD_P_ITEM_CD;
        m_setT_RLSD_P_ITEM_CD = i_setT_RLSD_P_ITEM_CD;
        m_readT_WORK_IN_ITEM_CD = i_readT_WORK_IN_ITEM_CD;
        m_setT_WORK_IN_ITEM_CD = i_setT_WORK_IN_ITEM_CD;
        m_JUDGMENT_TXT = i_JUDGMENT_TXT;
        
        m_h_DEPO_TYP = i_h_DEPO_TYP;
        m_h_LOT_CTRL_FLG = i_h_LOT_CTRL_FLG;
        m_h_LOT_NUMBERING_TYP = i_h_LOT_NUMBERING_TYP;
        m_h_BEST_BEFORE_YEAR = i_h_BEST_BEFORE_YEAR;
        m_h_BEST_BEFORE_MONTH = i_h_BEST_BEFORE_MONTH;
        m_h_BEST_BEFORE_DAY = i_h_BEST_BEFORE_DAY;
//20150803 ADD START BY SYSCOM
    	m_h_DEPT_CD = i_h_DEPT_CD;
    	m_h_PJ_CD = i_h_PJ_CD;
    	m_h_SEG_CONTENTS_1 = i_h_SEG_CONTENTS_1;
    	m_h_SEG_CONTENTS_2 = i_h_SEG_CONTENTS_2;
    	m_h_SEG_CONTENTS_3 = i_h_SEG_CONTENTS_3;
    	m_h_SEG_CONTENTS_4 = i_h_SEG_CONTENTS_4;
//20150803 ADD END BY SYSCOM
        m_h_REMARK1 = i_h_REMARK1;
        m_h_REMARK2 = i_h_REMARK2;
        m_h_ITEM_CLASS_01_CD = i_h_ITEM_CLASS_01_CD;
        m_h_ITEM_CLASS_02_CD = i_h_ITEM_CLASS_02_CD;
        m_h_ITEM_CLASS_03_CD = i_h_ITEM_CLASS_03_CD;
        m_h_ITEM_CLASS_04_CD = i_h_ITEM_CLASS_04_CD;
        m_h_ITEM_CLASS_05_CD = i_h_ITEM_CLASS_05_CD;
        m_h_ITEM_CLASS_06_CD = i_h_ITEM_CLASS_06_CD;
        m_h_ITEM_CLASS_07_CD = i_h_ITEM_CLASS_07_CD;
        m_h_ITEM_CLASS_08_CD = i_h_ITEM_CLASS_08_CD;
        m_h_ITEM_CLASS_09_CD = i_h_ITEM_CLASS_09_CD;
        m_h_ITEM_CLASS_10_CD = i_h_ITEM_CLASS_10_CD;
        m_h_ITEM_CLASS_11_CD = i_h_ITEM_CLASS_11_CD;
        m_h_ITEM_CLASS_12_CD = i_h_ITEM_CLASS_12_CD;
        m_C_DEPO_TYP = i_C_DEPO_TYP;
        m_C_LOT_CTRL_FLG = i_C_LOT_CTRL_FLG;
        m_C_LOT_NUMBERING_TYP = i_C_LOT_NUMBERING_TYP;
        m_C_BEST_BEFORE_YEAR = i_C_BEST_BEFORE_YEAR;
        m_C_BEST_BEFORE_MONTH = i_C_BEST_BEFORE_MONTH;
        m_C_BEST_BEFORE_DAY = i_C_BEST_BEFORE_DAY;
//20150803 ADD START BY SYSCOM
    	m_C_DEPT_CD = i_C_DEPT_CD;
    	m_C_PJ_CD = i_C_PJ_CD;
    	m_C_SEG_CONTENTS_1 = i_C_SEG_CONTENTS_1;
    	m_C_SEG_CONTENTS_2 = i_C_SEG_CONTENTS_2;
    	m_C_SEG_CONTENTS_3 = i_C_SEG_CONTENTS_3;
    	m_C_SEG_CONTENTS_4 = i_C_SEG_CONTENTS_4;
//20150803 ADD END BY SYSCOM
        m_C_REMARK1 = i_C_REMARK1;
        m_C_REMARK2 = i_C_REMARK2;
        m_C_ITEM_CLASS_01_CD = i_C_ITEM_CLASS_01_CD;
        m_C_ITEM_CLASS_02_CD = i_C_ITEM_CLASS_02_CD;
        m_C_ITEM_CLASS_03_CD = i_C_ITEM_CLASS_03_CD;
        m_C_ITEM_CLASS_04_CD = i_C_ITEM_CLASS_04_CD;
        m_C_ITEM_CLASS_05_CD = i_C_ITEM_CLASS_05_CD;
        m_C_ITEM_CLASS_06_CD = i_C_ITEM_CLASS_06_CD;
        m_C_ITEM_CLASS_07_CD = i_C_ITEM_CLASS_07_CD;
        m_C_ITEM_CLASS_08_CD = i_C_ITEM_CLASS_08_CD;
        m_C_ITEM_CLASS_09_CD = i_C_ITEM_CLASS_09_CD;
        m_C_ITEM_CLASS_10_CD = i_C_ITEM_CLASS_10_CD;
        m_C_ITEM_CLASS_11_CD = i_C_ITEM_CLASS_11_CD;
        m_C_ITEM_CLASS_12_CD = i_C_ITEM_CLASS_12_CD;
        m_readCLASS_CD1 = i_readCLASS_CD1;
        m_setCLASS_CD2 = i_setCLASS_CD2;
        m_setCLASS_CD3 = i_setCLASS_CD3;
        m_readM_ITEM_STOCK_UNIT = i_readM_ITEM_STOCK_UNIT;
        m_readM_ITEM_LOT_CTRL_FLG = i_readM_ITEM_LOT_CTRL_FLG;
        m_readM_ITEM_MRP_ODR_TYP = i_readM_ITEM_MRP_ODR_TYP;
        m_setM_ITEM_ITEM_CD = i_setM_ITEM_ITEM_CD;
        m_setDISPLAY_NAME = i_setDISPLAY_NAME;
//20150803 ADD START BY SYSCOM
    	m_VALUE = i_VALUE;
    	m_DEPT_CD = i_VALUE;
//20150803 ADD END BY SYSCOM

    }
    /**
     * �������ϐ��̃R�s�[
     * @param s �R�s�[��
     */
    public void copy(AA0150010Struct s)
    {
        clear();

        if(s.m_readNAME != null) m_readNAME = new String(s.m_readNAME);
        if(s.m_readVALUE != null) m_readVALUE = new String(s.m_readVALUE);
        if(s.m_setNAME != null) m_setNAME = new String(s.m_setNAME);
        if(s.m_setVALUE != null) m_setVALUE = new String(s.m_setVALUE);
        if(s.m_readSYS_P_NAME != null) m_readSYS_P_NAME = new String(s.m_readSYS_P_NAME);
        if(s.m_readSYS_P_VALUE != null) m_readSYS_P_VALUE = new String(s.m_readSYS_P_VALUE);
        if(s.m_setSYS_P_NAME != null) m_setSYS_P_NAME = new String(s.m_setSYS_P_NAME);

        if(s.m_rdoInsert != null) m_rdoInsert = new String(s.m_rdoInsert);
        if(s.m_rdoUpdate != null) m_rdoUpdate = new String(s.m_rdoUpdate);
        if(s.m_rdoDelete != null) m_rdoDelete = new String(s.m_rdoDelete);
        if(s.m_DO_CHK != null) m_DO_CHK = new String(s.m_DO_CHK);
        //if(s.m_LINE_INPUT != null) m_LINE_INPUT = new String(s.m_LINE_INPUT);
        if(s.m_w_COLUMN_FLG != null) m_w_COLUMN_FLG = new String(s.m_w_COLUMN_FLG);
        if(s.m_DOWNLOAD_FILE != null) m_DOWNLOAD_FILE = new String(s.m_DOWNLOAD_FILE);
        if(s.m_h_ITEM_CD != null) m_h_ITEM_CD = new String(s.m_h_ITEM_CD);
        if(s.m_h_ITEM_NAME != null) m_h_ITEM_NAME = new String(s.m_h_ITEM_NAME);
        if(s.m_h_DRAW_CD != null) m_h_DRAW_CD = new String(s.m_h_DRAW_CD);
        if(s.m_h_SPEC != null) m_h_SPEC = new String(s.m_h_SPEC);
        if(s.m_h_HIGH_LEVEL_NO != null) m_h_HIGH_LEVEL_NO = new String(s.m_h_HIGH_LEVEL_NO);
        if(s.m_h_MRP_ODR_TYP != null) m_h_MRP_ODR_TYP = new String(s.m_h_MRP_ODR_TYP);
        if(s.m_h_OUTSIDE_TYP != null) m_h_OUTSIDE_TYP = new String(s.m_h_OUTSIDE_TYP);
        if(s.m_h_STOCK_UNIT_FLG != null) m_h_STOCK_UNIT_FLG = new String(s.m_h_STOCK_UNIT_FLG);
        if(s.m_h_STOCK_UNIT != null) m_h_STOCK_UNIT = new String(s.m_h_STOCK_UNIT);
        if(s.m_h_PKG_UNIT != null) m_h_PKG_UNIT = new String(s.m_h_PKG_UNIT);
        if(s.m_h_PKG_UNIT_QTY != null) m_h_PKG_UNIT_QTY = new String(s.m_h_PKG_UNIT_QTY);
        if(s.m_h_UNIT_QTY_TYP != null) m_h_UNIT_QTY_TYP = new String(s.m_h_UNIT_QTY_TYP);
        if(s.m_h_ODR_LT != null) m_h_ODR_LT = new String(s.m_h_ODR_LT);
        if(s.m_h_FIXED_LT != null) m_h_FIXED_LT = new String(s.m_h_FIXED_LT);
        if(s.m_h_PROP_LT != null) m_h_PROP_LT = new String(s.m_h_PROP_LT);
        if(s.m_h_SAFETY_LT != null) m_h_SAFETY_LT = new String(s.m_h_SAFETY_LT);
        if(s.m_h_ISSUE_LT != null) m_h_ISSUE_LT = new String(s.m_h_ISSUE_LT);
        if(s.m_h_PROP_LOT_SIZE != null) m_h_PROP_LOT_SIZE = new String(s.m_h_PROP_LOT_SIZE);
        if(s.m_h_ITEM_SPOIL != null) m_h_ITEM_SPOIL = new String(s.m_h_ITEM_SPOIL);
        if(s.m_h_SAFETY_STOCK != null) m_h_SAFETY_STOCK = new String(s.m_h_SAFETY_STOCK);
        if(s.m_h_LOT_SIZING_TYP != null) m_h_LOT_SIZING_TYP = new String(s.m_h_LOT_SIZING_TYP);
        if(s.m_h_MAX_PERIOD != null) m_h_MAX_PERIOD = new String(s.m_h_MAX_PERIOD);
        if(s.m_h_MAX_ODR_QTY != null) m_h_MAX_ODR_QTY = new String(s.m_h_MAX_ODR_QTY);
        if(s.m_h_ODR_POINT != null) m_h_ODR_POINT = new String(s.m_h_ODR_POINT);
        if(s.m_h_FIXED_ODR_QTY != null) m_h_FIXED_ODR_QTY = new String(s.m_h_FIXED_ODR_QTY);
        if(s.m_h_MIN_ODR_QTY != null) m_h_MIN_ODR_QTY = new String(s.m_h_MIN_ODR_QTY);
        if(s.m_h_MUL_ODR_QTY != null) m_h_MUL_ODR_QTY = new String(s.m_h_MUL_ODR_QTY);
        if(s.m_h_ISSUE_TYP != null) m_h_ISSUE_TYP = new String(s.m_h_ISSUE_TYP);
        if(s.m_h_MPS_FLG != null) m_h_MPS_FLG = new String(s.m_h_MPS_FLG);
        if(s.m_h_ACPT_INSPC_TYP != null) m_h_ACPT_INSPC_TYP = new String(s.m_h_ACPT_INSPC_TYP);
        if(s.m_h_PRODUCT_TYP != null) m_h_PRODUCT_TYP = new String(s.m_h_PRODUCT_TYP);
        if(s.m_h_CLASIFICATION_CD != null) m_h_CLASIFICATION_CD = new String(s.m_h_CLASIFICATION_CD);
        if(s.m_h_UNIT_WEIGHT != null) m_h_UNIT_WEIGHT = new String(s.m_h_UNIT_WEIGHT);
        if(s.m_h_ABC_TYP != null) m_h_ABC_TYP = new String(s.m_h_ABC_TYP);
        if(s.m_h_OPR_RSLT_TYP != null) m_h_OPR_RSLT_TYP = new String(s.m_h_OPR_RSLT_TYP);
        if(s.m_h_SPL_ITEM_TYP != null) m_h_SPL_ITEM_TYP = new String(s.m_h_SPL_ITEM_TYP);
        if(s.m_h_TAX_CD != null) m_h_TAX_CD = new String(s.m_h_TAX_CD);
        if(s.m_h_CAL_NO != null) m_h_CAL_NO = new String(s.m_h_CAL_NO);
        if(s.m_h_SYORI_KUBUN != null) m_h_SYORI_KUBUN = new String(s.m_h_SYORI_KUBUN);
        if(s.m_h_MANHOUR_TYP != null) m_h_MANHOUR_TYP = new String(s.m_h_MANHOUR_TYP);
        if(s.m_CANCEL_FILE != null) m_CANCEL_FILE = new String(s.m_CANCEL_FILE);
        if(s.m_C_ITEM_CD != null) m_C_ITEM_CD = new String(s.m_C_ITEM_CD);
        if(s.m_C_ITEM_NAME != null) m_C_ITEM_NAME = new String(s.m_C_ITEM_NAME);
        if(s.m_C_DRAW_CD != null) m_C_DRAW_CD = new String(s.m_C_DRAW_CD);
        if(s.m_C_SPEC != null) m_C_SPEC = new String(s.m_C_SPEC);
        if(s.m_C_HIGH_LEVEL_NO != null) m_C_HIGH_LEVEL_NO = new String(s.m_C_HIGH_LEVEL_NO);
        if(s.m_C_MRP_ODR_TYP != null) m_C_MRP_ODR_TYP = new String(s.m_C_MRP_ODR_TYP);
        if(s.m_C_OUTSIDE_TYP != null) m_C_OUTSIDE_TYP = new String(s.m_C_OUTSIDE_TYP);
        if(s.m_C_STOCK_UNIT_FLG != null) m_C_STOCK_UNIT_FLG = new String(s.m_C_STOCK_UNIT_FLG);
        if(s.m_C_STOCK_UNIT != null) m_C_STOCK_UNIT = new String(s.m_C_STOCK_UNIT);
        if(s.m_C_PKG_UNIT != null) m_C_PKG_UNIT = new String(s.m_C_PKG_UNIT);
        if(s.m_C_PKG_UNIT_QTY != null) m_C_PKG_UNIT_QTY = new String(s.m_C_PKG_UNIT_QTY);
        if(s.m_C_UNIT_QTY_TYP != null) m_C_UNIT_QTY_TYP = new String(s.m_C_UNIT_QTY_TYP);
        if(s.m_C_ODR_LT != null) m_C_ODR_LT = new String(s.m_C_ODR_LT);
        if(s.m_C_FIXED_LT != null) m_C_FIXED_LT = new String(s.m_C_FIXED_LT);
        if(s.m_C_PROP_LT != null) m_C_PROP_LT = new String(s.m_C_PROP_LT);
        if(s.m_C_SAFETY_LT != null) m_C_SAFETY_LT = new String(s.m_C_SAFETY_LT);
        if(s.m_C_ISSUE_LT != null) m_C_ISSUE_LT = new String(s.m_C_ISSUE_LT);
        if(s.m_C_PROP_LOT_SIZE != null) m_C_PROP_LOT_SIZE = new String(s.m_C_PROP_LOT_SIZE);
        if(s.m_C_ITEM_SPOIL != null) m_C_ITEM_SPOIL = new String(s.m_C_ITEM_SPOIL);
        if(s.m_C_SAFETY_STOCK != null) m_C_SAFETY_STOCK = new String(s.m_C_SAFETY_STOCK);
        if(s.m_C_LOT_SIZING_TYP != null) m_C_LOT_SIZING_TYP = new String(s.m_C_LOT_SIZING_TYP);
        if(s.m_C_MAX_PERIOD != null) m_C_MAX_PERIOD = new String(s.m_C_MAX_PERIOD);
        if(s.m_C_MAX_ODR_QTY != null) m_C_MAX_ODR_QTY = new String(s.m_C_MAX_ODR_QTY);
        if(s.m_C_ODR_POINT != null) m_C_ODR_POINT = new String(s.m_C_ODR_POINT);
        if(s.m_C_FIXED_ODR_QTY != null) m_C_FIXED_ODR_QTY = new String(s.m_C_FIXED_ODR_QTY);
        if(s.m_C_MIN_ODR_QTY != null) m_C_MIN_ODR_QTY = new String(s.m_C_MIN_ODR_QTY);
        if(s.m_C_MUL_ODR_QTY != null) m_C_MUL_ODR_QTY = new String(s.m_C_MUL_ODR_QTY);
        if(s.m_C_ISSUE_TYP != null) m_C_ISSUE_TYP = new String(s.m_C_ISSUE_TYP);
        if(s.m_C_MPS_FLG != null) m_C_MPS_FLG = new String(s.m_C_MPS_FLG);
        if(s.m_C_ACPT_INSPC_TYP != null) m_C_ACPT_INSPC_TYP = new String(s.m_C_ACPT_INSPC_TYP);
        if(s.m_C_PRODUCT_TYP != null) m_C_PRODUCT_TYP = new String(s.m_C_PRODUCT_TYP);
        if(s.m_C_CLASIFICATION_CD != null) m_C_CLASIFICATION_CD = new String(s.m_C_CLASIFICATION_CD);
        if(s.m_C_UNIT_WEIGHT != null) m_C_UNIT_WEIGHT = new String(s.m_C_UNIT_WEIGHT);
        if(s.m_C_ABC_TYP != null) m_C_ABC_TYP = new String(s.m_C_ABC_TYP);
        if(s.m_C_OPR_RSLT_TYP != null) m_C_OPR_RSLT_TYP = new String(s.m_C_OPR_RSLT_TYP);
        if(s.m_C_SPL_ITEM_TYP != null) m_C_SPL_ITEM_TYP = new String(s.m_C_SPL_ITEM_TYP);
        if(s.m_C_TAX_CD != null) m_C_TAX_CD = new String(s.m_C_TAX_CD);
        if(s.m_C_setITEM_CD != null) m_C_setITEM_CD = new String(s.m_C_setITEM_CD);
        if(s.m_C_MANHOUR_TYP != null) m_C_MANHOUR_TYP = new String(s.m_C_MANHOUR_TYP);
        if(s.m_readT_OD_ITEM_CD != null) m_readT_OD_ITEM_CD = new String(s.m_readT_OD_ITEM_CD);
        if(s.m_setT_OD_ITEM_CD != null) m_setT_OD_ITEM_CD = new String(s.m_setT_OD_ITEM_CD);
        if(s.m_readT_JOB_ODR_ITEM_CD != null) m_readT_JOB_ODR_ITEM_CD = new String(s.m_readT_JOB_ODR_ITEM_CD);
        if(s.m_setT_JOB_ODR_ITEM_CD != null) m_setT_JOB_ODR_ITEM_CD = new String(s.m_setT_JOB_ODR_ITEM_CD);
        if(s.m_readM_PS_ITEM_CD != null) m_readM_PS_ITEM_CD = new String(s.m_readM_PS_ITEM_CD);
        if(s.m_setM_PS_ITEM_CD != null) m_setM_PS_ITEM_CD = new String(s.m_setM_PS_ITEM_CD);
        if(s.m_readT_ITEM_STOCK_ITEM_CD != null) m_readT_ITEM_STOCK_ITEM_CD = new String(s.m_readT_ITEM_STOCK_ITEM_CD);
        if(s.m_setT_ITEM_STOCK_ITEM_CD != null) m_setT_ITEM_STOCK_ITEM_CD = new String(s.m_setT_ITEM_STOCK_ITEM_CD);
        if(s.m_readT_JOB_ODR_CD_ITEM_CD != null) m_readT_JOB_ODR_CD_ITEM_CD = new String(s.m_readT_JOB_ODR_CD_ITEM_CD);
        if(s.m_setT_JOB_ODR_CD_ITEM_CD != null) m_setT_JOB_ODR_CD_ITEM_CD = new String(s.m_setT_JOB_ODR_CD_ITEM_CD);
        if(s.m_readT_OPR_RSLT_ITEM_CD != null) m_readT_OPR_RSLT_ITEM_CD = new String(s.m_readT_OPR_RSLT_ITEM_CD);
        if(s.m_setT_OPR_RSLT_ITEM_CD != null) m_setT_OPR_RSLT_ITEM_CD = new String(s.m_setT_OPR_RSLT_ITEM_CD);
        if(s.m_readT_RLSD_P_ITEM_CD != null) m_readT_RLSD_P_ITEM_CD = new String(s.m_readT_RLSD_P_ITEM_CD);
        if(s.m_setT_RLSD_P_ITEM_CD != null) m_setT_RLSD_P_ITEM_CD = new String(s.m_setT_RLSD_P_ITEM_CD);
        if(s.m_readT_WORK_IN_ITEM_CD != null) m_readT_WORK_IN_ITEM_CD = new String(s.m_readT_WORK_IN_ITEM_CD);
        if(s.m_setT_WORK_IN_ITEM_CD != null) m_setT_WORK_IN_ITEM_CD = new String(s.m_setT_WORK_IN_ITEM_CD);
        if(s.m_JUDGMENT_TXT != null) m_JUDGMENT_TXT = new String(s.m_JUDGMENT_TXT);
   
        if(s.m_h_DEPO_TYP != null) m_h_DEPO_TYP = new String(s.m_h_DEPO_TYP);
        if(s.m_h_LOT_CTRL_FLG != null) m_h_LOT_CTRL_FLG = new String(s.m_h_LOT_CTRL_FLG);
        if(s.m_h_LOT_NUMBERING_TYP != null) m_h_LOT_NUMBERING_TYP = new String(s.m_h_LOT_NUMBERING_TYP);
        if(s.m_h_BEST_BEFORE_YEAR != null) m_h_BEST_BEFORE_YEAR = new String(s.m_h_BEST_BEFORE_YEAR);
        if(s.m_h_BEST_BEFORE_MONTH != null) m_h_BEST_BEFORE_MONTH = new String(s.m_h_BEST_BEFORE_MONTH);
        if(s.m_h_BEST_BEFORE_DAY != null) m_h_BEST_BEFORE_DAY = new String(s.m_h_BEST_BEFORE_DAY);
//20150803 ADD START BY SYSCOM
    	if(s.m_h_DEPT_CD != null) m_h_DEPT_CD = new String(s.m_h_DEPT_CD);
    	if(s.m_h_PJ_CD != null) m_h_PJ_CD = new String(s.m_h_PJ_CD);
    	if(s.m_h_SEG_CONTENTS_1 != null) m_h_SEG_CONTENTS_1 = new String(s.m_h_SEG_CONTENTS_1);
    	if(s.m_h_SEG_CONTENTS_2 != null) m_h_SEG_CONTENTS_2 = new String(s.m_h_SEG_CONTENTS_2);
    	if(s.m_h_SEG_CONTENTS_3 != null) m_h_SEG_CONTENTS_3 = new String(s.m_h_SEG_CONTENTS_3);
    	if(s.m_h_SEG_CONTENTS_4 != null) m_h_SEG_CONTENTS_4 = new String(s.m_h_SEG_CONTENTS_4);
//20150803 ADD END BY SYSCOM
        if(s.m_h_REMARK1 != null) m_h_REMARK1 = new String(s.m_h_REMARK1);
        if(s.m_h_REMARK2 != null) m_h_REMARK2 = new String(s.m_h_REMARK2);
        if(s.m_h_ITEM_CLASS_01_CD != null) m_h_ITEM_CLASS_01_CD = new String(s.m_h_ITEM_CLASS_01_CD);
        if(s.m_h_ITEM_CLASS_02_CD != null) m_h_ITEM_CLASS_02_CD = new String(s.m_h_ITEM_CLASS_02_CD);
        if(s.m_h_ITEM_CLASS_03_CD != null) m_h_ITEM_CLASS_03_CD = new String(s.m_h_ITEM_CLASS_03_CD);
        if(s.m_h_ITEM_CLASS_04_CD != null) m_h_ITEM_CLASS_04_CD = new String(s.m_h_ITEM_CLASS_04_CD);
        if(s.m_h_ITEM_CLASS_05_CD != null) m_h_ITEM_CLASS_05_CD = new String(s.m_h_ITEM_CLASS_05_CD);
        if(s.m_h_ITEM_CLASS_06_CD != null) m_h_ITEM_CLASS_06_CD = new String(s.m_h_ITEM_CLASS_06_CD);
        if(s.m_h_ITEM_CLASS_07_CD != null) m_h_ITEM_CLASS_07_CD = new String(s.m_h_ITEM_CLASS_07_CD);
        if(s.m_h_ITEM_CLASS_08_CD != null) m_h_ITEM_CLASS_08_CD = new String(s.m_h_ITEM_CLASS_08_CD);
        if(s.m_h_ITEM_CLASS_09_CD != null) m_h_ITEM_CLASS_09_CD = new String(s.m_h_ITEM_CLASS_09_CD);
        if(s.m_h_ITEM_CLASS_10_CD != null) m_h_ITEM_CLASS_10_CD = new String(s.m_h_ITEM_CLASS_10_CD);
        if(s.m_h_ITEM_CLASS_11_CD != null) m_h_ITEM_CLASS_11_CD = new String(s.m_h_ITEM_CLASS_11_CD);
        if(s.m_h_ITEM_CLASS_12_CD != null) m_h_ITEM_CLASS_12_CD = new String(s.m_h_ITEM_CLASS_12_CD);   
        if(s.m_C_DEPO_TYP != null) m_C_DEPO_TYP = new String(s.m_C_DEPO_TYP);
        if(s.m_C_LOT_CTRL_FLG != null) m_C_LOT_CTRL_FLG = new String(s.m_C_LOT_CTRL_FLG);
        if(s.m_C_LOT_NUMBERING_TYP != null) m_C_LOT_NUMBERING_TYP = new String(s.m_C_LOT_NUMBERING_TYP);
        if(s.m_C_BEST_BEFORE_YEAR != null) m_C_BEST_BEFORE_YEAR = new String(s.m_C_BEST_BEFORE_YEAR);
        if(s.m_C_BEST_BEFORE_MONTH != null) m_C_BEST_BEFORE_MONTH = new String(s.m_C_BEST_BEFORE_MONTH);
        if(s.m_C_BEST_BEFORE_DAY != null) m_C_BEST_BEFORE_DAY = new String(s.m_C_BEST_BEFORE_DAY);
//20150803 ADD START BY SYSCOM
    	if(s.m_C_DEPT_CD != null) m_C_DEPT_CD = new String(s.m_C_DEPT_CD);
    	if(s.m_C_PJ_CD != null) m_C_PJ_CD = new String(s.m_C_PJ_CD);
    	if(s.m_C_SEG_CONTENTS_1 != null) m_C_SEG_CONTENTS_1 = new String(s.m_C_SEG_CONTENTS_1);
    	if(s.m_C_SEG_CONTENTS_2 != null) m_C_SEG_CONTENTS_2 = new String(s.m_C_SEG_CONTENTS_2);
    	if(s.m_C_SEG_CONTENTS_3 != null) m_C_SEG_CONTENTS_3 = new String(s.m_C_SEG_CONTENTS_3);
    	if(s.m_C_SEG_CONTENTS_4 != null) m_C_SEG_CONTENTS_4 = new String(s.m_C_SEG_CONTENTS_4);
//20150803 ADD END BY SYSCOM
        if(s.m_C_REMARK1 != null) m_C_REMARK1 = new String(s.m_C_REMARK1);
        if(s.m_C_REMARK2 != null) m_C_REMARK2 = new String(s.m_C_REMARK2); 
        if(s.m_C_ITEM_CLASS_01_CD != null) m_C_ITEM_CLASS_01_CD = new String(s.m_C_ITEM_CLASS_01_CD);
        if(s.m_C_ITEM_CLASS_02_CD != null) m_C_ITEM_CLASS_02_CD = new String(s.m_C_ITEM_CLASS_02_CD);
        if(s.m_C_ITEM_CLASS_03_CD != null) m_C_ITEM_CLASS_03_CD = new String(s.m_C_ITEM_CLASS_03_CD);
        if(s.m_C_ITEM_CLASS_04_CD != null) m_C_ITEM_CLASS_04_CD = new String(s.m_C_ITEM_CLASS_04_CD);
        if(s.m_C_ITEM_CLASS_05_CD != null) m_C_ITEM_CLASS_05_CD = new String(s.m_C_ITEM_CLASS_05_CD);
        if(s.m_C_ITEM_CLASS_06_CD != null) m_C_ITEM_CLASS_06_CD = new String(s.m_C_ITEM_CLASS_06_CD);
        if(s.m_C_ITEM_CLASS_07_CD != null) m_C_ITEM_CLASS_07_CD = new String(s.m_C_ITEM_CLASS_07_CD);
        if(s.m_C_ITEM_CLASS_08_CD != null) m_C_ITEM_CLASS_08_CD = new String(s.m_C_ITEM_CLASS_08_CD);
        if(s.m_C_ITEM_CLASS_09_CD != null) m_C_ITEM_CLASS_09_CD = new String(s.m_C_ITEM_CLASS_09_CD);
        if(s.m_C_ITEM_CLASS_10_CD != null) m_C_ITEM_CLASS_10_CD = new String(s.m_C_ITEM_CLASS_10_CD);
        if(s.m_C_ITEM_CLASS_11_CD != null) m_C_ITEM_CLASS_11_CD = new String(s.m_C_ITEM_CLASS_11_CD);
        if(s.m_C_ITEM_CLASS_12_CD != null) m_C_ITEM_CLASS_12_CD = new String(s.m_C_ITEM_CLASS_12_CD);
        if(s.m_readCLASS_CD1 != null) m_readCLASS_CD1 = new String(s.m_readCLASS_CD1);
        if(s.m_setCLASS_CD2 != null) m_setCLASS_CD2 = new String(s.m_setCLASS_CD2);
        if(s.m_setCLASS_CD3 != null) m_setCLASS_CD3 = new String(s.m_setCLASS_CD3);
        if(s.m_readM_ITEM_STOCK_UNIT != null) m_readM_ITEM_STOCK_UNIT = new String(s.m_readM_ITEM_STOCK_UNIT);
        if(s.m_readM_ITEM_LOT_CTRL_FLG != null) m_readM_ITEM_LOT_CTRL_FLG = new String(s.m_readM_ITEM_LOT_CTRL_FLG);
        if(s.m_readM_ITEM_MRP_ODR_TYP != null) m_readM_ITEM_MRP_ODR_TYP = new String(s.m_readM_ITEM_MRP_ODR_TYP);
        if(s.m_setM_ITEM_ITEM_CD != null) m_setM_ITEM_ITEM_CD = new String(s.m_setM_ITEM_ITEM_CD);
        if(s.m_setDISPLAY_NAME != null) m_setDISPLAY_NAME = new String(s.m_setDISPLAY_NAME);
//20150803 ADD START BY SYSCOM
    	if(s.m_VALUE != null) m_VALUE = new String(s.m_VALUE);
        if(s.m_DEPT_CD != null) m_DEPT_CD = new String(s.m_DEPT_CD);
//20150803 ADD END BY SYSCOM

    }

        // TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
