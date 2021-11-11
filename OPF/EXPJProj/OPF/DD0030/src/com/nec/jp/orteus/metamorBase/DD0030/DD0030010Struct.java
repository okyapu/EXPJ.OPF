/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DD0030/src/com/nec/jp/orteus/metamorBase/DD0030/DD0030010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.DD0030;

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
/**
 * CLASS     : DD0030010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.9 $ $Date: 2014/11/05 07:25:01 $
 *
 */
//}}user_implement_code_header

public class DD0030010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_HALF_TERM_TYP_name */
	public String m_HALF_TERM_TYP_name = null;
	/** �� 2 �ϐ��F m_HALF_TERM_TYP_val */
	public String m_HALF_TERM_TYP_val = null;
	/** �� 3 �ϐ��F m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** �� 4 �ϐ��F m_COST_TYP_DN */
	public String m_COST_TYP_DN = null;
	/** �� 5 �ϐ��F m_OUTSIDE_TYP_DN */
	public String m_OUTSIDE_TYP_DN = null;
	/** �� 6 �ϐ��F m_PROC_OUTSIDE_TYP_DN */
	public String m_PROC_OUTSIDE_TYP_DN = null;
	/** �� 7 �ϐ��F m_DMY_ITEM_FLG_DN */
	public String m_DMY_ITEM_FLG_DN = null;
	/** �� 8 �ϐ��F m_VOLUNT_SPL_FLG_DN */
	public String m_VOLUNT_SPL_FLG_DN = null;
	/** �� 9 �ϐ��F m_COST_UP_TYP_DN */
	public String m_COST_UP_TYP_DN = null;
	/** �� 10 �ϐ��F m_ONEROUS_CONS_FLG_DN */
	public String m_ONEROUS_CONS_FLG_DN = null;
	/** �� 11 �ϐ��F m_UPPER_ITEM_FLG_DN */
	public String m_UPPER_ITEM_FLG_DN = null;
	/** �� 12 �ϐ��F m_LOWER_ITEM_FLG_DN */
	public String m_LOWER_ITEM_FLG_DN = null;
	/** �� 13 �ϐ��F m_COST_EXCLUDE_FLG_DN */
	public String m_COST_EXCLUDE_FLG_DN = null;
	/** �� 14 �ϐ��F m_l_ROOT_ITEM_CD */
	public String m_l_ROOT_ITEM_CD = null;
	/** �� 15 �ϐ��F m_l_ROOT_ITEM_NAME */
	public String m_l_ROOT_ITEM_NAME = null;
	/** �� 16 �ϐ��F m_l_CLASIFICATION_CD */
	public String m_l_CLASIFICATION_CD = null;
	/** �� 17 �ϐ��F m_l_CS_PROC_CD */
	public String m_l_CS_PROC_CD = null;
	/** �� 18 �ϐ��F m_l_CS_PROC_NAME */
	public String m_l_CS_PROC_NAME = null;
	/** �� 19 �ϐ��F m_l_NECESSARY_QTY */
	public String m_l_NECESSARY_QTY = null;
	/** �� 20 �ϐ��F m_l_STOCK_UNIT */
	public String m_l_STOCK_UNIT = null;
	/** �� 21 �ϐ��F m_l_ITEM_INPUT_RATIO */
	public String m_l_ITEM_INPUT_RATIO = null;
	/** �� 22 �ϐ��F m_l_HOME_CUR_UNIT */
	public String m_l_HOME_CUR_UNIT = null;
	/** �� 23 �ϐ��F m_l_TOTAL_COST */
	public String m_l_TOTAL_COST = null;
	/** �� 24 �ϐ��F m_l_TOTAL_MATR_COST */
	public String m_l_TOTAL_MATR_COST = null;
	/** �� 25 �ϐ��F m_l_TOTAL_SBCNT_MATR_COST */
	public String m_l_TOTAL_SBCNT_MATR_COST = null;
	/** �� 26 �ϐ��F m_l_TOTAL_PROC_COST_SUM_ALL */
	public String m_l_TOTAL_PROC_COST_SUM_ALL = null;
	/** �� 27 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 28 �ϐ��F m_YEAR */
	public String m_YEAR = null;
	/** �� 29 �ϐ��F m_HALF_TERM_TYP */
	public String m_HALF_TERM_TYP = null;
	/** �� 30 �ϐ��F m_ROOT_ITEM_CD */
	public String m_ROOT_ITEM_CD = null;
	/** �� 31 �ϐ��F m_CLASIFICATION_CD */
	public String m_CLASIFICATION_CD = null;
	/** �� 32 �ϐ��F m_COST_TYP */
	public String m_COST_TYP = null;
	/** �� 33 �ϐ��F m_PLANT_NAME */
	public String m_PLANT_NAME = null;
	/** �� 34 �ϐ��F m_ROOT_ITEM_NAME */
	public String m_ROOT_ITEM_NAME = null;
	/** �� 35 �ϐ��F m_PARENT_ITEM_CD */
	public String m_PARENT_ITEM_CD = null;
	/** �� 36 �ϐ��F m_PARENT_ITEM_NAME */
	public String m_PARENT_ITEM_NAME = null;
	/** �� 37 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 38 �ϐ��F m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** �� 39 �ϐ��F m_PS_EDITION */
	public String m_PS_EDITION = null;
	/** �� 40 �ϐ��F m_COST_STATEMENT_NO */
	public String m_COST_STATEMENT_NO = null;
	/** �� 41 �ϐ��F m_CS_PROC_CD */
	public String m_CS_PROC_CD = null;
	/** �� 42 �ϐ��F m_CS_PROC_NAME */
	public String m_CS_PROC_NAME = null;
	/** �� 43 �ϐ��F m_WS_CD */
	public String m_WS_CD = null;
	/** �� 44 �ϐ��F m_WS_NAME */
	public String m_WS_NAME = null;
	/** �� 45 �ϐ��F m_ORG_CD */
	public String m_ORG_CD = null;
	/** �� 46 �ϐ��F m_ORG_NAME */
	public String m_ORG_NAME = null;
	/** �� 47 �ϐ��F m_NECESSARY_QTY */
	public String m_NECESSARY_QTY = null;
	/** �� 48 �ϐ��F m_PS_INPUT_RATIO */
	public String m_PS_INPUT_RATIO = null;
	/** �� 49 �ϐ��F m_ITEM_INPUT_RATIO */
	public String m_ITEM_INPUT_RATIO = null;
	/** �� 50 �ϐ��F m_TOTAL_COST */
	public String m_TOTAL_COST = null;
	/** �� 51 �ϐ��F m_OWN_MATR_COST */
	public String m_OWN_MATR_COST = null;
	/** �� 52 �ϐ��F m_UNDER_MATR_COST */
	public String m_UNDER_MATR_COST = null;
	/** �� 53 �ϐ��F m_TOTAL_MATR_COST */
	public String m_TOTAL_MATR_COST = null;
	/** �� 54 �ϐ��F m_OWN_SBCNT_MATR_COST */
	public String m_OWN_SBCNT_MATR_COST = null;
	/** �� 55 �ϐ��F m_UNDER_SBCNT_MATR_COST */
	public String m_UNDER_SBCNT_MATR_COST = null;
	/** �� 56 �ϐ��F m_TOTAL_SBCNT_MATR_COST */
	public String m_TOTAL_SBCNT_MATR_COST = null;
	/** �� 57 �ϐ��F m_OWN_PROC_COST_SUM_ALL */
	public String m_OWN_PROC_COST_SUM_ALL = null;
	/** �� 58 �ϐ��F m_UNDER_PROC_COST_SUM_ALL */
	public String m_UNDER_PROC_COST_SUM_ALL = null;
	/** �� 59 �ϐ��F m_TOTAL_PROC_COST_SUM_ALL */
	public String m_TOTAL_PROC_COST_SUM_ALL = null;
	/** �� 60 �ϐ��F m_HOME_CUR_UNIT */
	public String m_HOME_CUR_UNIT = null;
	/** �� 61 �ϐ��F m_EFF_PHASE_IN_DATE */
	public String m_EFF_PHASE_IN_DATE = null;
	/** �� 62 �ϐ��F m_EFF_PHASE_OUT_DATE */
	public String m_EFF_PHASE_OUT_DATE = null;
	/** �� 63 �ϐ��F m_PS_UNIT_DENOMINATOR */
	public String m_PS_UNIT_DENOMINATOR = null;
	/** �� 64 �ϐ��F m_PS_UNIT_NUMERATOR */
	public String m_PS_UNIT_NUMERATOR = null;
	/** �� 65 �ϐ��F m_PARENT_COST_STATEMENT_NO */
	public String m_PARENT_COST_STATEMENT_NO = null;
	/** �� 66 �ϐ��F m_PARENT_ITEM_STOCK_UNIT */
	public String m_PARENT_ITEM_STOCK_UNIT = null;
	/** �� 67 �ϐ��F m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** �� 68 �ϐ��F m_OUTSIDE_TYP */
	public String m_OUTSIDE_TYP = null;
	/** �� 69 �ϐ��F m_PROC_OUTSIDE_TYP */
	public String m_PROC_OUTSIDE_TYP = null;
	/** �� 70 �ϐ��F m_DMY_ITEM_FLG */
	public String m_DMY_ITEM_FLG = null;
	/** �� 71 �ϐ��F m_VOLUNT_SPL_FLG */
	public String m_VOLUNT_SPL_FLG = null;
	/** �� 72 �ϐ��F m_COST_UP_TYP */
	public String m_COST_UP_TYP = null;
	/** �� 73 �ϐ��F m_ONEROUS_CONS_FLG */
	public String m_ONEROUS_CONS_FLG = null;
	/** �� 74 �ϐ��F m_UP_LEVEL_NO */
	public String m_UP_LEVEL_NO = null;
	/** �� 75 �ϐ��F m_UPPER_ITEM_FLG */
	public String m_UPPER_ITEM_FLG = null;
	/** �� 76 �ϐ��F m_LOWER_ITEM_FLG */
	public String m_LOWER_ITEM_FLG = null;
	/** �� 77 �ϐ��F m_COST_EXCLUDE_FLG */
	public String m_COST_EXCLUDE_FLG = null;
	/** �� 78 �ϐ��F m_CREATED_DATE */
	public String m_CREATED_DATE = null;
	/** �� 79 �ϐ��F m_CREATED_BY */
	public String m_CREATED_BY = null;
	/** �� 80 �ϐ��F m_CREATED_PRG_NM */
	public String m_CREATED_PRG_NM = null;
	/** �� 81 �ϐ��F m_UPDATED_DATE */
	public String m_UPDATED_DATE = null;
	/** �� 82 �ϐ��F m_UPDATED_BY */
	public String m_UPDATED_BY = null;
	/** �� 83 �ϐ��F m_UPDATED_PRG_NM */
	public String m_UPDATED_PRG_NM = null;
	/** �� 84 �ϐ��F m_PROC_COST_CLS_CD */
	public String m_PROC_COST_CLS_CD = null;
	/** �� 85 �ϐ��F m_PROC_COST_CLS_NAME */
	public String m_PROC_COST_CLS_NAME = null;
	/** �� 86 �ϐ��F m_PROC_COST_UNIT_QTY */
	public String m_PROC_COST_UNIT_QTY = null;
	/** �� 87 �ϐ��F m_PROC_COST_UNIT_QTY_UNIT */
	public String m_PROC_COST_UNIT_QTY_UNIT = null;
	/** �� 88 �ϐ��F m_OWN_PROC_COST_01 */
	public String m_OWN_PROC_COST_01 = null;
	/** �� 89 �ϐ��F m_OWN_PROC_COST_02 */
	public String m_OWN_PROC_COST_02 = null;
	/** �� 90 �ϐ��F m_OWN_PROC_COST_03 */
	public String m_OWN_PROC_COST_03 = null;
	/** �� 91 �ϐ��F m_OWN_PROC_COST_04 */
	public String m_OWN_PROC_COST_04 = null;
	/** �� 92 �ϐ��F m_OWN_PROC_COST_05 */
	public String m_OWN_PROC_COST_05 = null;
	/** �� 93 �ϐ��F m_OWN_PROC_COST_06 */
	public String m_OWN_PROC_COST_06 = null;
	/** �� 94 �ϐ��F m_OWN_PROC_COST_07 */
	public String m_OWN_PROC_COST_07 = null;
	/** �� 95 �ϐ��F m_OWN_PROC_COST_08 */
	public String m_OWN_PROC_COST_08 = null;
	/** �� 96 �ϐ��F m_OWN_PROC_COST_09 */
	public String m_OWN_PROC_COST_09 = null;
	/** �� 97 �ϐ��F m_OWN_PROC_COST_10 */
	public String m_OWN_PROC_COST_10 = null;
	/** �� 98 �ϐ��F m_OWN_PROC_COST_11 */
	public String m_OWN_PROC_COST_11 = null;
	/** �� 99 �ϐ��F m_OWN_PROC_COST_12 */
	public String m_OWN_PROC_COST_12 = null;
	/** �� 100 �ϐ��F m_OWN_PROC_COST_SUM */
	public String m_OWN_PROC_COST_SUM = null;
	/** �� 101 �ϐ��F m_UNDER_PROC_COST_01 */
	public String m_UNDER_PROC_COST_01 = null;
	/** �� 102 �ϐ��F m_UNDER_PROC_COST_02 */
	public String m_UNDER_PROC_COST_02 = null;
	/** �� 103 �ϐ��F m_UNDER_PROC_COST_03 */
	public String m_UNDER_PROC_COST_03 = null;
	/** �� 104 �ϐ��F m_UNDER_PROC_COST_04 */
	public String m_UNDER_PROC_COST_04 = null;
	/** �� 105 �ϐ��F m_UNDER_PROC_COST_05 */
	public String m_UNDER_PROC_COST_05 = null;
	/** �� 106 �ϐ��F m_UNDER_PROC_COST_06 */
	public String m_UNDER_PROC_COST_06 = null;
	/** �� 107 �ϐ��F m_UNDER_PROC_COST_07 */
	public String m_UNDER_PROC_COST_07 = null;
	/** �� 108 �ϐ��F m_UNDER_PROC_COST_08 */
	public String m_UNDER_PROC_COST_08 = null;
	/** �� 109 �ϐ��F m_UNDER_PROC_COST_09 */
	public String m_UNDER_PROC_COST_09 = null;
	/** �� 110 �ϐ��F m_UNDER_PROC_COST_10 */
	public String m_UNDER_PROC_COST_10 = null;
	/** �� 111 �ϐ��F m_UNDER_PROC_COST_11 */
	public String m_UNDER_PROC_COST_11 = null;
	/** �� 112 �ϐ��F m_UNDER_PROC_COST_12 */
	public String m_UNDER_PROC_COST_12 = null;
	/** �� 113 �ϐ��F m_UNDER_PROC_COST_SUM */
	public String m_UNDER_PROC_COST_SUM = null;
	/** �� 114 �ϐ��F m_TOTAL_PROC_COST_01 */
	public String m_TOTAL_PROC_COST_01 = null;
	/** �� 115 �ϐ��F m_TOTAL_PROC_COST_02 */
	public String m_TOTAL_PROC_COST_02 = null;
	/** �� 116 �ϐ��F m_TOTAL_PROC_COST_03 */
	public String m_TOTAL_PROC_COST_03 = null;
	/** �� 117 �ϐ��F m_TOTAL_PROC_COST_04 */
	public String m_TOTAL_PROC_COST_04 = null;
	/** �� 118 �ϐ��F m_TOTAL_PROC_COST_05 */
	public String m_TOTAL_PROC_COST_05 = null;
	/** �� 119 �ϐ��F m_TOTAL_PROC_COST_06 */
	public String m_TOTAL_PROC_COST_06 = null;
	/** �� 120 �ϐ��F m_TOTAL_PROC_COST_07 */
	public String m_TOTAL_PROC_COST_07 = null;
	/** �� 121 �ϐ��F m_TOTAL_PROC_COST_08 */
	public String m_TOTAL_PROC_COST_08 = null;
	/** �� 122 �ϐ��F m_TOTAL_PROC_COST_09 */
	public String m_TOTAL_PROC_COST_09 = null;
	/** �� 123 �ϐ��F m_TOTAL_PROC_COST_10 */
	public String m_TOTAL_PROC_COST_10 = null;
	/** �� 124 �ϐ��F m_TOTAL_PROC_COST_11 */
	public String m_TOTAL_PROC_COST_11 = null;
	/** �� 125 �ϐ��F m_TOTAL_PROC_COST_12 */
	public String m_TOTAL_PROC_COST_12 = null;
	/** �� 126 �ϐ��F m_TOTAL_PROC_COST_SUM */
	public String m_TOTAL_PROC_COST_SUM = null;
	/** �� 127 �ϐ��F m_PROC_COST_01_NAME */
	public String m_PROC_COST_01_NAME = null;
	/** �� 128 �ϐ��F m_PROC_COST_02_NAME */
	public String m_PROC_COST_02_NAME = null;
	/** �� 129 �ϐ��F m_PROC_COST_03_NAME */
	public String m_PROC_COST_03_NAME = null;
	/** �� 130 �ϐ��F m_PROC_COST_04_NAME */
	public String m_PROC_COST_04_NAME = null;
	/** �� 131 �ϐ��F m_PROC_COST_05_NAME */
	public String m_PROC_COST_05_NAME = null;
	/** �� 132 �ϐ��F m_PROC_COST_06_NAME */
	public String m_PROC_COST_06_NAME = null;
	/** �� 133 �ϐ��F m_PROC_COST_07_NAME */
	public String m_PROC_COST_07_NAME = null;
	/** �� 134 �ϐ��F m_PROC_COST_08_NAME */
	public String m_PROC_COST_08_NAME = null;
	/** �� 135 �ϐ��F m_PROC_COST_09_NAME */
	public String m_PROC_COST_09_NAME = null;
	/** �� 136 �ϐ��F m_PROC_COST_10_NAME */
	public String m_PROC_COST_10_NAME = null;
	/** �� 137 �ϐ��F m_PROC_COST_11_NAME */
	public String m_PROC_COST_11_NAME = null;
	/** �� 138 �ϐ��F m_PROC_COST_12_NAME */
	public String m_PROC_COST_12_NAME = null;
	/** �� 139 �ϐ��F m_HALF_TERM_TYP_DN */
	public String m_HALF_TERM_TYP_DN = null;
	/** �� 140 �ϐ��F m_PUCH_ITEM_CD */
	public String m_PUCH_ITEM_CD = null;
	/** �� 141 �ϐ��F m_PUCH_CS_PROC_CD */
	public String m_PUCH_CS_PROC_CD = null;
	/** �� 142 �ϐ��F m_VEND_CD */
	public String m_VEND_CD = null;
	/** �� 143 �ϐ��F m_UNIT_COST */
	public String m_UNIT_COST = null;
	/** �� 144 �ϐ��F m_UNIT_COST_TYP_DN */
	public String m_UNIT_COST_TYP_DN = null;
	/** �� 145 �ϐ��F m_CUR_UNIT */
	public String m_CUR_UNIT = null;
	/** �� 146 �ϐ��F m_EXCH_RATE */
	public String m_EXCH_RATE = null;
	/** �� 147 �ϐ��F m_HOME_CUR_UNIT_COST */
	public String m_HOME_CUR_UNIT_COST = null;
	/** �� 148 �ϐ��F m_PUCH_UNIT_QTY */
	public String m_PUCH_UNIT_QTY = null;
	/** �� 149 �ϐ��F m_SUB_VEND_CD */
	public String m_SUB_VEND_CD = null;
	/** �� 150 �ϐ��F m_SUB_UNIT_COST */
	public String m_SUB_UNIT_COST = null;
	/** �� 151 �ϐ��F m_SUB_UNIT_COST_TYP_DN */
	public String m_SUB_UNIT_COST_TYP_DN = null;
	/** �� 152 �ϐ��F m_SUB_CUR_UNIT */
	public String m_SUB_CUR_UNIT = null;
	/** �� 153 �ϐ��F m_SUB_EXCH_RATE */
	public String m_SUB_EXCH_RATE = null;
	/** �� 154 �ϐ��F m_SUB_HOME_CUR_UNIT_COST */
	public String m_SUB_HOME_CUR_UNIT_COST = null;
	/** �� 155 �ϐ��F m_SUB_PUCH_UNIT_QTY */
	public String m_SUB_PUCH_UNIT_QTY = null;
	/** �� 156 �ϐ��F m_PUCH_STOCK_UNIT */
	public String m_PUCH_STOCK_UNIT = null;
	/** �� 157 �ϐ��F m_UNIT_COST_ACCEPT_TYP_DN */
	public String m_UNIT_COST_ACCEPT_TYP_DN = null;
	/** �� 158 �ϐ��F m_CS_PUCH_TYP_DN */
	public String m_CS_PUCH_TYP_DN = null;
	/** �� 159 �ϐ��F m_PROC_VEND_CD */
	public String m_PROC_VEND_CD = null;
	/** �� 160 �ϐ��F m_PROC_ORG_CD */
	public String m_PROC_ORG_CD = null;
	/** �� 161 �ϐ��F m_PUCH_UNIT_COST */
	public String m_PUCH_UNIT_COST = null;
	/** �� 162 �ϐ��F m_PUCH_PUCH_UNIT_QTY */
	public String m_PUCH_PUCH_UNIT_QTY = null;
	/** �� 163 �ϐ��F m_SBCNT_UNIT_COST */
	public String m_SBCNT_UNIT_COST = null;
	/** �� 164 �ϐ��F m_SBCNT_PUCH_UNIT_QTY */
	public String m_SBCNT_PUCH_UNIT_QTY = null;
	/** �� 165 �ϐ��F m_PROC_COST_01 */
	public String m_PROC_COST_01 = null;
	/** �� 166 �ϐ��F m_PROC_COST_02 */
	public String m_PROC_COST_02 = null;
	/** �� 167 �ϐ��F m_PROC_COST_03 */
	public String m_PROC_COST_03 = null;
	/** �� 168 �ϐ��F m_PROC_COST_04 */
	public String m_PROC_COST_04 = null;
	/** �� 169 �ϐ��F m_PROC_COST_05 */
	public String m_PROC_COST_05 = null;
	/** �� 170 �ϐ��F m_PROC_COST_06 */
	public String m_PROC_COST_06 = null;
	/** �� 171 �ϐ��F m_PROC_COST_07 */
	public String m_PROC_COST_07 = null;
	/** �� 172 �ϐ��F m_PROC_COST_08 */
	public String m_PROC_COST_08 = null;
	/** �� 173 �ϐ��F m_PROC_COST_09 */
	public String m_PROC_COST_09 = null;
	/** �� 174 �ϐ��F m_PROC_COST_10 */
	public String m_PROC_COST_10 = null;
	/** �� 175 �ϐ��F m_PROC_COST_11 */
	public String m_PROC_COST_11 = null;
	/** �� 176 �ϐ��F m_PROC_COST_12 */
	public String m_PROC_COST_12 = null;
	/** �� 177 �ϐ��F m_PROC_COST_STOCK_UNIT */
	public String m_PROC_COST_STOCK_UNIT = null;
	/** �� 178 �ϐ��F m_CS_PUCH_TYP_VALUE */
	public String m_CS_PUCH_TYP_VALUE = null;
	/** �� 179 �ϐ��F m_CURRENT_YEAR */
	public String m_CURRENT_YEAR = null;
	/** �� 180 �ϐ��F m_l_COUNT */
	public String m_l_COUNT = null;
	/** �� 181 �ϐ��F m_ROW_COUNT */
	public String m_ROW_COUNT = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_HALF_TERM_TYP_name */
	public List l_HALF_TERM_TYP_name = null;

	/** �� 2 List�ϐ��F l_HALF_TERM_TYP_val */
	public List l_HALF_TERM_TYP_val = null;

	/** �� 3 List�ϐ��F l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** �� 4 List�ϐ��F l_COST_TYP_DN */
	public List l_COST_TYP_DN = null;

	/** �� 5 List�ϐ��F l_OUTSIDE_TYP_DN */
	public List l_OUTSIDE_TYP_DN = null;

	/** �� 6 List�ϐ��F l_PROC_OUTSIDE_TYP_DN */
	public List l_PROC_OUTSIDE_TYP_DN = null;

	/** �� 7 List�ϐ��F l_DMY_ITEM_FLG_DN */
	public List l_DMY_ITEM_FLG_DN = null;

	/** �� 8 List�ϐ��F l_VOLUNT_SPL_FLG_DN */
	public List l_VOLUNT_SPL_FLG_DN = null;

	/** �� 9 List�ϐ��F l_COST_UP_TYP_DN */
	public List l_COST_UP_TYP_DN = null;

	/** �� 10 List�ϐ��F l_ONEROUS_CONS_FLG_DN */
	public List l_ONEROUS_CONS_FLG_DN = null;

	/** �� 11 List�ϐ��F l_UPPER_ITEM_FLG_DN */
	public List l_UPPER_ITEM_FLG_DN = null;

	/** �� 12 List�ϐ��F l_LOWER_ITEM_FLG_DN */
	public List l_LOWER_ITEM_FLG_DN = null;

	/** �� 13 List�ϐ��F l_COST_EXCLUDE_FLG_DN */
	public List l_COST_EXCLUDE_FLG_DN = null;

	/** �� 14 List�ϐ��F l_l_ROOT_ITEM_CD */
	public List l_l_ROOT_ITEM_CD = null;

	/** �� 15 List�ϐ��F l_l_ROOT_ITEM_NAME */
	public List l_l_ROOT_ITEM_NAME = null;

	/** �� 16 List�ϐ��F l_l_CLASIFICATION_CD */
	public List l_l_CLASIFICATION_CD = null;

	/** �� 17 List�ϐ��F l_l_CS_PROC_CD */
	public List l_l_CS_PROC_CD = null;

	/** �� 18 List�ϐ��F l_l_CS_PROC_NAME */
	public List l_l_CS_PROC_NAME = null;

	/** �� 19 List�ϐ��F l_l_NECESSARY_QTY */
	public List l_l_NECESSARY_QTY = null;

	/** �� 20 List�ϐ��F l_l_STOCK_UNIT */
	public List l_l_STOCK_UNIT = null;

	/** �� 21 List�ϐ��F l_l_ITEM_INPUT_RATIO */
	public List l_l_ITEM_INPUT_RATIO = null;

	/** �� 22 List�ϐ��F l_l_HOME_CUR_UNIT */
	public List l_l_HOME_CUR_UNIT = null;

	/** �� 23 List�ϐ��F l_l_TOTAL_COST */
	public List l_l_TOTAL_COST = null;

	/** �� 24 List�ϐ��F l_l_TOTAL_MATR_COST */
	public List l_l_TOTAL_MATR_COST = null;

	/** �� 25 List�ϐ��F l_l_TOTAL_SBCNT_MATR_COST */
	public List l_l_TOTAL_SBCNT_MATR_COST = null;

	/** �� 26 List�ϐ��F l_l_TOTAL_PROC_COST_SUM_ALL */
	public List l_l_TOTAL_PROC_COST_SUM_ALL = null;

	/** �� 27 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 28 List�ϐ��F l_YEAR */
	public List l_YEAR = null;

	/** �� 29 List�ϐ��F l_HALF_TERM_TYP */
	public List l_HALF_TERM_TYP = null;

	/** �� 30 List�ϐ��F l_ROOT_ITEM_CD */
	public List l_ROOT_ITEM_CD = null;

	/** �� 31 List�ϐ��F l_CLASIFICATION_CD */
	public List l_CLASIFICATION_CD = null;

	/** �� 32 List�ϐ��F l_COST_TYP */
	public List l_COST_TYP = null;

	/** �� 33 List�ϐ��F l_PLANT_NAME */
	public List l_PLANT_NAME = null;

	/** �� 34 List�ϐ��F l_ROOT_ITEM_NAME */
	public List l_ROOT_ITEM_NAME = null;

	/** �� 35 List�ϐ��F l_PARENT_ITEM_CD */
	public List l_PARENT_ITEM_CD = null;

	/** �� 36 List�ϐ��F l_PARENT_ITEM_NAME */
	public List l_PARENT_ITEM_NAME = null;

	/** �� 37 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 38 List�ϐ��F l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** �� 39 List�ϐ��F l_PS_EDITION */
	public List l_PS_EDITION = null;

	/** �� 40 List�ϐ��F l_COST_STATEMENT_NO */
	public List l_COST_STATEMENT_NO = null;

	/** �� 41 List�ϐ��F l_CS_PROC_CD */
	public List l_CS_PROC_CD = null;

	/** �� 42 List�ϐ��F l_CS_PROC_NAME */
	public List l_CS_PROC_NAME = null;

	/** �� 43 List�ϐ��F l_WS_CD */
	public List l_WS_CD = null;

	/** �� 44 List�ϐ��F l_WS_NAME */
	public List l_WS_NAME = null;

	/** �� 45 List�ϐ��F l_ORG_CD */
	public List l_ORG_CD = null;

	/** �� 46 List�ϐ��F l_ORG_NAME */
	public List l_ORG_NAME = null;

	/** �� 47 List�ϐ��F l_NECESSARY_QTY */
	public List l_NECESSARY_QTY = null;

	/** �� 48 List�ϐ��F l_PS_INPUT_RATIO */
	public List l_PS_INPUT_RATIO = null;

	/** �� 49 List�ϐ��F l_ITEM_INPUT_RATIO */
	public List l_ITEM_INPUT_RATIO = null;

	/** �� 50 List�ϐ��F l_TOTAL_COST */
	public List l_TOTAL_COST = null;

	/** �� 51 List�ϐ��F l_OWN_MATR_COST */
	public List l_OWN_MATR_COST = null;

	/** �� 52 List�ϐ��F l_UNDER_MATR_COST */
	public List l_UNDER_MATR_COST = null;

	/** �� 53 List�ϐ��F l_TOTAL_MATR_COST */
	public List l_TOTAL_MATR_COST = null;

	/** �� 54 List�ϐ��F l_OWN_SBCNT_MATR_COST */
	public List l_OWN_SBCNT_MATR_COST = null;

	/** �� 55 List�ϐ��F l_UNDER_SBCNT_MATR_COST */
	public List l_UNDER_SBCNT_MATR_COST = null;

	/** �� 56 List�ϐ��F l_TOTAL_SBCNT_MATR_COST */
	public List l_TOTAL_SBCNT_MATR_COST = null;

	/** �� 57 List�ϐ��F l_OWN_PROC_COST_SUM_ALL */
	public List l_OWN_PROC_COST_SUM_ALL = null;

	/** �� 58 List�ϐ��F l_UNDER_PROC_COST_SUM_ALL */
	public List l_UNDER_PROC_COST_SUM_ALL = null;

	/** �� 59 List�ϐ��F l_TOTAL_PROC_COST_SUM_ALL */
	public List l_TOTAL_PROC_COST_SUM_ALL = null;

	/** �� 60 List�ϐ��F l_HOME_CUR_UNIT */
	public List l_HOME_CUR_UNIT = null;

	/** �� 61 List�ϐ��F l_EFF_PHASE_IN_DATE */
	public List l_EFF_PHASE_IN_DATE = null;

	/** �� 62 List�ϐ��F l_EFF_PHASE_OUT_DATE */
	public List l_EFF_PHASE_OUT_DATE = null;

	/** �� 63 List�ϐ��F l_PS_UNIT_DENOMINATOR */
	public List l_PS_UNIT_DENOMINATOR = null;

	/** �� 64 List�ϐ��F l_PS_UNIT_NUMERATOR */
	public List l_PS_UNIT_NUMERATOR = null;

	/** �� 65 List�ϐ��F l_PARENT_COST_STATEMENT_NO */
	public List l_PARENT_COST_STATEMENT_NO = null;

	/** �� 66 List�ϐ��F l_PARENT_ITEM_STOCK_UNIT */
	public List l_PARENT_ITEM_STOCK_UNIT = null;

	/** �� 67 List�ϐ��F l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** �� 68 List�ϐ��F l_OUTSIDE_TYP */
	public List l_OUTSIDE_TYP = null;

	/** �� 69 List�ϐ��F l_PROC_OUTSIDE_TYP */
	public List l_PROC_OUTSIDE_TYP = null;

	/** �� 70 List�ϐ��F l_DMY_ITEM_FLG */
	public List l_DMY_ITEM_FLG = null;

	/** �� 71 List�ϐ��F l_VOLUNT_SPL_FLG */
	public List l_VOLUNT_SPL_FLG = null;

	/** �� 72 List�ϐ��F l_COST_UP_TYP */
	public List l_COST_UP_TYP = null;

	/** �� 73 List�ϐ��F l_ONEROUS_CONS_FLG */
	public List l_ONEROUS_CONS_FLG = null;

	/** �� 74 List�ϐ��F l_UP_LEVEL_NO */
	public List l_UP_LEVEL_NO = null;

	/** �� 75 List�ϐ��F l_UPPER_ITEM_FLG */
	public List l_UPPER_ITEM_FLG = null;

	/** �� 76 List�ϐ��F l_LOWER_ITEM_FLG */
	public List l_LOWER_ITEM_FLG = null;

	/** �� 77 List�ϐ��F l_COST_EXCLUDE_FLG */
	public List l_COST_EXCLUDE_FLG = null;

	/** �� 78 List�ϐ��F l_CREATED_DATE */
	public List l_CREATED_DATE = null;

	/** �� 79 List�ϐ��F l_CREATED_BY */
	public List l_CREATED_BY = null;

	/** �� 80 List�ϐ��F l_CREATED_PRG_NM */
	public List l_CREATED_PRG_NM = null;

	/** �� 81 List�ϐ��F l_UPDATED_DATE */
	public List l_UPDATED_DATE = null;

	/** �� 82 List�ϐ��F l_UPDATED_BY */
	public List l_UPDATED_BY = null;

	/** �� 83 List�ϐ��F l_UPDATED_PRG_NM */
	public List l_UPDATED_PRG_NM = null;

	/** �� 84 List�ϐ��F l_PROC_COST_CLS_CD */
	public List l_PROC_COST_CLS_CD = null;

	/** �� 85 List�ϐ��F l_PROC_COST_CLS_NAME */
	public List l_PROC_COST_CLS_NAME = null;

	/** �� 86 List�ϐ��F l_PROC_COST_UNIT_QTY */
	public List l_PROC_COST_UNIT_QTY = null;

	/** �� 87 List�ϐ��F l_PROC_COST_UNIT_QTY_UNIT */
	public List l_PROC_COST_UNIT_QTY_UNIT = null;

	/** �� 88 List�ϐ��F l_OWN_PROC_COST_01 */
	public List l_OWN_PROC_COST_01 = null;

	/** �� 89 List�ϐ��F l_OWN_PROC_COST_02 */
	public List l_OWN_PROC_COST_02 = null;

	/** �� 90 List�ϐ��F l_OWN_PROC_COST_03 */
	public List l_OWN_PROC_COST_03 = null;

	/** �� 91 List�ϐ��F l_OWN_PROC_COST_04 */
	public List l_OWN_PROC_COST_04 = null;

	/** �� 92 List�ϐ��F l_OWN_PROC_COST_05 */
	public List l_OWN_PROC_COST_05 = null;

	/** �� 93 List�ϐ��F l_OWN_PROC_COST_06 */
	public List l_OWN_PROC_COST_06 = null;

	/** �� 94 List�ϐ��F l_OWN_PROC_COST_07 */
	public List l_OWN_PROC_COST_07 = null;

	/** �� 95 List�ϐ��F l_OWN_PROC_COST_08 */
	public List l_OWN_PROC_COST_08 = null;

	/** �� 96 List�ϐ��F l_OWN_PROC_COST_09 */
	public List l_OWN_PROC_COST_09 = null;

	/** �� 97 List�ϐ��F l_OWN_PROC_COST_10 */
	public List l_OWN_PROC_COST_10 = null;

	/** �� 98 List�ϐ��F l_OWN_PROC_COST_11 */
	public List l_OWN_PROC_COST_11 = null;

	/** �� 99 List�ϐ��F l_OWN_PROC_COST_12 */
	public List l_OWN_PROC_COST_12 = null;

	/** �� 100 List�ϐ��F l_OWN_PROC_COST_SUM */
	public List l_OWN_PROC_COST_SUM = null;

	/** �� 101 List�ϐ��F l_UNDER_PROC_COST_01 */
	public List l_UNDER_PROC_COST_01 = null;

	/** �� 102 List�ϐ��F l_UNDER_PROC_COST_02 */
	public List l_UNDER_PROC_COST_02 = null;

	/** �� 103 List�ϐ��F l_UNDER_PROC_COST_03 */
	public List l_UNDER_PROC_COST_03 = null;

	/** �� 104 List�ϐ��F l_UNDER_PROC_COST_04 */
	public List l_UNDER_PROC_COST_04 = null;

	/** �� 105 List�ϐ��F l_UNDER_PROC_COST_05 */
	public List l_UNDER_PROC_COST_05 = null;

	/** �� 106 List�ϐ��F l_UNDER_PROC_COST_06 */
	public List l_UNDER_PROC_COST_06 = null;

	/** �� 107 List�ϐ��F l_UNDER_PROC_COST_07 */
	public List l_UNDER_PROC_COST_07 = null;

	/** �� 108 List�ϐ��F l_UNDER_PROC_COST_08 */
	public List l_UNDER_PROC_COST_08 = null;

	/** �� 109 List�ϐ��F l_UNDER_PROC_COST_09 */
	public List l_UNDER_PROC_COST_09 = null;

	/** �� 110 List�ϐ��F l_UNDER_PROC_COST_10 */
	public List l_UNDER_PROC_COST_10 = null;

	/** �� 111 List�ϐ��F l_UNDER_PROC_COST_11 */
	public List l_UNDER_PROC_COST_11 = null;

	/** �� 112 List�ϐ��F l_UNDER_PROC_COST_12 */
	public List l_UNDER_PROC_COST_12 = null;

	/** �� 113 List�ϐ��F l_UNDER_PROC_COST_SUM */
	public List l_UNDER_PROC_COST_SUM = null;

	/** �� 114 List�ϐ��F l_TOTAL_PROC_COST_01 */
	public List l_TOTAL_PROC_COST_01 = null;

	/** �� 115 List�ϐ��F l_TOTAL_PROC_COST_02 */
	public List l_TOTAL_PROC_COST_02 = null;

	/** �� 116 List�ϐ��F l_TOTAL_PROC_COST_03 */
	public List l_TOTAL_PROC_COST_03 = null;

	/** �� 117 List�ϐ��F l_TOTAL_PROC_COST_04 */
	public List l_TOTAL_PROC_COST_04 = null;

	/** �� 118 List�ϐ��F l_TOTAL_PROC_COST_05 */
	public List l_TOTAL_PROC_COST_05 = null;

	/** �� 119 List�ϐ��F l_TOTAL_PROC_COST_06 */
	public List l_TOTAL_PROC_COST_06 = null;

	/** �� 120 List�ϐ��F l_TOTAL_PROC_COST_07 */
	public List l_TOTAL_PROC_COST_07 = null;

	/** �� 121 List�ϐ��F l_TOTAL_PROC_COST_08 */
	public List l_TOTAL_PROC_COST_08 = null;

	/** �� 122 List�ϐ��F l_TOTAL_PROC_COST_09 */
	public List l_TOTAL_PROC_COST_09 = null;

	/** �� 123 List�ϐ��F l_TOTAL_PROC_COST_10 */
	public List l_TOTAL_PROC_COST_10 = null;

	/** �� 124 List�ϐ��F l_TOTAL_PROC_COST_11 */
	public List l_TOTAL_PROC_COST_11 = null;

	/** �� 125 List�ϐ��F l_TOTAL_PROC_COST_12 */
	public List l_TOTAL_PROC_COST_12 = null;

	/** �� 126 List�ϐ��F l_TOTAL_PROC_COST_SUM */
	public List l_TOTAL_PROC_COST_SUM = null;

	/** �� 127 List�ϐ��F l_PROC_COST_01_NAME */
	public List l_PROC_COST_01_NAME = null;

	/** �� 128 List�ϐ��F l_PROC_COST_02_NAME */
	public List l_PROC_COST_02_NAME = null;

	/** �� 129 List�ϐ��F l_PROC_COST_03_NAME */
	public List l_PROC_COST_03_NAME = null;

	/** �� 130 List�ϐ��F l_PROC_COST_04_NAME */
	public List l_PROC_COST_04_NAME = null;

	/** �� 131 List�ϐ��F l_PROC_COST_05_NAME */
	public List l_PROC_COST_05_NAME = null;

	/** �� 132 List�ϐ��F l_PROC_COST_06_NAME */
	public List l_PROC_COST_06_NAME = null;

	/** �� 133 List�ϐ��F l_PROC_COST_07_NAME */
	public List l_PROC_COST_07_NAME = null;

	/** �� 134 List�ϐ��F l_PROC_COST_08_NAME */
	public List l_PROC_COST_08_NAME = null;

	/** �� 135 List�ϐ��F l_PROC_COST_09_NAME */
	public List l_PROC_COST_09_NAME = null;

	/** �� 136 List�ϐ��F l_PROC_COST_10_NAME */
	public List l_PROC_COST_10_NAME = null;

	/** �� 137 List�ϐ��F l_PROC_COST_11_NAME */
	public List l_PROC_COST_11_NAME = null;

	/** �� 138 List�ϐ��F l_PROC_COST_12_NAME */
	public List l_PROC_COST_12_NAME = null;

	/** �� 139 List�ϐ��F l_HALF_TERM_TYP_DN */
	public List l_HALF_TERM_TYP_DN = null;

	/** �� 140 List�ϐ��F l_PUCH_ITEM_CD */
	public List l_PUCH_ITEM_CD = null;

	/** �� 141 List�ϐ��F l_PUCH_CS_PROC_CD */
	public List l_PUCH_CS_PROC_CD = null;

	/** �� 142 List�ϐ��F l_VEND_CD */
	public List l_VEND_CD = null;

	/** �� 143 List�ϐ��F l_UNIT_COST */
	public List l_UNIT_COST = null;

	/** �� 144 List�ϐ��F l_UNIT_COST_TYP_DN */
	public List l_UNIT_COST_TYP_DN = null;

	/** �� 145 List�ϐ��F l_CUR_UNIT */
	public List l_CUR_UNIT = null;

	/** �� 146 List�ϐ��F l_EXCH_RATE */
	public List l_EXCH_RATE = null;

	/** �� 147 List�ϐ��F l_HOME_CUR_UNIT_COST */
	public List l_HOME_CUR_UNIT_COST = null;

	/** �� 148 List�ϐ��F l_PUCH_UNIT_QTY */
	public List l_PUCH_UNIT_QTY = null;

	/** �� 149 List�ϐ��F l_SUB_VEND_CD */
	public List l_SUB_VEND_CD = null;

	/** �� 150 List�ϐ��F l_SUB_UNIT_COST */
	public List l_SUB_UNIT_COST = null;

	/** �� 151 List�ϐ��F l_SUB_UNIT_COST_TYP_DN */
	public List l_SUB_UNIT_COST_TYP_DN = null;

	/** �� 152 List�ϐ��F l_SUB_CUR_UNIT */
	public List l_SUB_CUR_UNIT = null;

	/** �� 153 List�ϐ��F l_SUB_EXCH_RATE */
	public List l_SUB_EXCH_RATE = null;

	/** �� 154 List�ϐ��F l_SUB_HOME_CUR_UNIT_COST */
	public List l_SUB_HOME_CUR_UNIT_COST = null;

	/** �� 155 List�ϐ��F l_SUB_PUCH_UNIT_QTY */
	public List l_SUB_PUCH_UNIT_QTY = null;

	/** �� 156 List�ϐ��F l_PUCH_STOCK_UNIT */
	public List l_PUCH_STOCK_UNIT = null;

	/** �� 157 List�ϐ��F l_UNIT_COST_ACCEPT_TYP_DN */
	public List l_UNIT_COST_ACCEPT_TYP_DN = null;

	/** �� 158 List�ϐ��F l_CS_PUCH_TYP_DN */
	public List l_CS_PUCH_TYP_DN = null;

	/** �� 159 List�ϐ��F l_PROC_VEND_CD */
	public List l_PROC_VEND_CD = null;

	/** �� 160 List�ϐ��F l_PROC_ORG_CD */
	public List l_PROC_ORG_CD = null;

	/** �� 161 List�ϐ��F l_PUCH_UNIT_COST */
	public List l_PUCH_UNIT_COST = null;

	/** �� 162 List�ϐ��F l_PUCH_PUCH_UNIT_QTY */
	public List l_PUCH_PUCH_UNIT_QTY = null;

	/** �� 163 List�ϐ��F l_SBCNT_UNIT_COST */
	public List l_SBCNT_UNIT_COST = null;

	/** �� 164 List�ϐ��F l_SBCNT_PUCH_UNIT_QTY */
	public List l_SBCNT_PUCH_UNIT_QTY = null;

	/** �� 165 List�ϐ��F l_PROC_COST_01 */
	public List l_PROC_COST_01 = null;

	/** �� 166 List�ϐ��F l_PROC_COST_02 */
	public List l_PROC_COST_02 = null;

	/** �� 167 List�ϐ��F l_PROC_COST_03 */
	public List l_PROC_COST_03 = null;

	/** �� 168 List�ϐ��F l_PROC_COST_04 */
	public List l_PROC_COST_04 = null;

	/** �� 169 List�ϐ��F l_PROC_COST_05 */
	public List l_PROC_COST_05 = null;

	/** �� 170 List�ϐ��F l_PROC_COST_06 */
	public List l_PROC_COST_06 = null;

	/** �� 171 List�ϐ��F l_PROC_COST_07 */
	public List l_PROC_COST_07 = null;

	/** �� 172 List�ϐ��F l_PROC_COST_08 */
	public List l_PROC_COST_08 = null;

	/** �� 173 List�ϐ��F l_PROC_COST_09 */
	public List l_PROC_COST_09 = null;

	/** �� 174 List�ϐ��F l_PROC_COST_10 */
	public List l_PROC_COST_10 = null;

	/** �� 175 List�ϐ��F l_PROC_COST_11 */
	public List l_PROC_COST_11 = null;

	/** �� 176 List�ϐ��F l_PROC_COST_12 */
	public List l_PROC_COST_12 = null;

	/** �� 177 List�ϐ��F l_PROC_COST_STOCK_UNIT */
	public List l_PROC_COST_STOCK_UNIT = null;

	/** �� 178 List�ϐ��F l_CS_PUCH_TYP_VALUE */
	public List l_CS_PUCH_TYP_VALUE = null;

	/** �� 179 List�ϐ��F l_CURRENT_YEAR */
	public List l_CURRENT_YEAR = null;

	/** �� 180 List�ϐ��F l_l_COUNT */
	public List l_l_COUNT = null;

	/** �� 181 List�ϐ��F l_ROW_COUNT */
	public List l_ROW_COUNT = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getHALF_TERM_TYP_name() { return m_HALF_TERM_TYP_name; }
	public String getHALF_TERM_TYP_val() { return m_HALF_TERM_TYP_val; }
	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String getCOST_TYP_DN() { return m_COST_TYP_DN; }
	public String getOUTSIDE_TYP_DN() { return m_OUTSIDE_TYP_DN; }
	public String getPROC_OUTSIDE_TYP_DN() { return m_PROC_OUTSIDE_TYP_DN; }
	public String getDMY_ITEM_FLG_DN() { return m_DMY_ITEM_FLG_DN; }
	public String getVOLUNT_SPL_FLG_DN() { return m_VOLUNT_SPL_FLG_DN; }
	public String getCOST_UP_TYP_DN() { return m_COST_UP_TYP_DN; }
	public String getONEROUS_CONS_FLG_DN() { return m_ONEROUS_CONS_FLG_DN; }
	public String getUPPER_ITEM_FLG_DN() { return m_UPPER_ITEM_FLG_DN; }
	public String getLOWER_ITEM_FLG_DN() { return m_LOWER_ITEM_FLG_DN; }
	public String getCOST_EXCLUDE_FLG_DN() { return m_COST_EXCLUDE_FLG_DN; }
	public String getl_ROOT_ITEM_CD() { return m_l_ROOT_ITEM_CD; }
	public String getl_ROOT_ITEM_NAME() { return m_l_ROOT_ITEM_NAME; }
	public String getl_CLASIFICATION_CD() { return m_l_CLASIFICATION_CD; }
	public String getl_CS_PROC_CD() { return m_l_CS_PROC_CD; }
	public String getl_CS_PROC_NAME() { return m_l_CS_PROC_NAME; }
	public String getl_NECESSARY_QTY() { return m_l_NECESSARY_QTY; }
	public String getl_STOCK_UNIT() { return m_l_STOCK_UNIT; }
	public String getl_ITEM_INPUT_RATIO() { return m_l_ITEM_INPUT_RATIO; }
	public String getl_HOME_CUR_UNIT() { return m_l_HOME_CUR_UNIT; }
	public String getl_TOTAL_COST() { return m_l_TOTAL_COST; }
	public String getl_TOTAL_MATR_COST() { return m_l_TOTAL_MATR_COST; }
	public String getl_TOTAL_SBCNT_MATR_COST() { return m_l_TOTAL_SBCNT_MATR_COST; }
	public String getl_TOTAL_PROC_COST_SUM_ALL() { return m_l_TOTAL_PROC_COST_SUM_ALL; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getYEAR() { return m_YEAR; }
	public String getHALF_TERM_TYP() { return m_HALF_TERM_TYP; }
	public String getROOT_ITEM_CD() { return m_ROOT_ITEM_CD; }
	public String getCLASIFICATION_CD() { return m_CLASIFICATION_CD; }
	public String getCOST_TYP() { return m_COST_TYP; }
	public String getPLANT_NAME() { return m_PLANT_NAME; }
	public String getROOT_ITEM_NAME() { return m_ROOT_ITEM_NAME; }
	public String getPARENT_ITEM_CD() { return m_PARENT_ITEM_CD; }
	public String getPARENT_ITEM_NAME() { return m_PARENT_ITEM_NAME; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getPS_EDITION() { return m_PS_EDITION; }
	public String getCOST_STATEMENT_NO() { return m_COST_STATEMENT_NO; }
	public String getCS_PROC_CD() { return m_CS_PROC_CD; }
	public String getCS_PROC_NAME() { return m_CS_PROC_NAME; }
	public String getWS_CD() { return m_WS_CD; }
	public String getWS_NAME() { return m_WS_NAME; }
	public String getORG_CD() { return m_ORG_CD; }
	public String getORG_NAME() { return m_ORG_NAME; }
	public String getNECESSARY_QTY() { return m_NECESSARY_QTY; }
	public String getPS_INPUT_RATIO() { return m_PS_INPUT_RATIO; }
	public String getITEM_INPUT_RATIO() { return m_ITEM_INPUT_RATIO; }
	public String getTOTAL_COST() { return m_TOTAL_COST; }
	public String getOWN_MATR_COST() { return m_OWN_MATR_COST; }
	public String getUNDER_MATR_COST() { return m_UNDER_MATR_COST; }
	public String getTOTAL_MATR_COST() { return m_TOTAL_MATR_COST; }
	public String getOWN_SBCNT_MATR_COST() { return m_OWN_SBCNT_MATR_COST; }
	public String getUNDER_SBCNT_MATR_COST() { return m_UNDER_SBCNT_MATR_COST; }
	public String getTOTAL_SBCNT_MATR_COST() { return m_TOTAL_SBCNT_MATR_COST; }
	public String getOWN_PROC_COST_SUM_ALL() { return m_OWN_PROC_COST_SUM_ALL; }
	public String getUNDER_PROC_COST_SUM_ALL() { return m_UNDER_PROC_COST_SUM_ALL; }
	public String getTOTAL_PROC_COST_SUM_ALL() { return m_TOTAL_PROC_COST_SUM_ALL; }
	public String getHOME_CUR_UNIT() { return m_HOME_CUR_UNIT; }
	public String getEFF_PHASE_IN_DATE() { return m_EFF_PHASE_IN_DATE; }
	public String getEFF_PHASE_OUT_DATE() { return m_EFF_PHASE_OUT_DATE; }
	public String getPS_UNIT_DENOMINATOR() { return m_PS_UNIT_DENOMINATOR; }
	public String getPS_UNIT_NUMERATOR() { return m_PS_UNIT_NUMERATOR; }
	public String getPARENT_COST_STATEMENT_NO() { return m_PARENT_COST_STATEMENT_NO; }
	public String getPARENT_ITEM_STOCK_UNIT() { return m_PARENT_ITEM_STOCK_UNIT; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getOUTSIDE_TYP() { return m_OUTSIDE_TYP; }
	public String getPROC_OUTSIDE_TYP() { return m_PROC_OUTSIDE_TYP; }
	public String getDMY_ITEM_FLG() { return m_DMY_ITEM_FLG; }
	public String getVOLUNT_SPL_FLG() { return m_VOLUNT_SPL_FLG; }
	public String getCOST_UP_TYP() { return m_COST_UP_TYP; }
	public String getONEROUS_CONS_FLG() { return m_ONEROUS_CONS_FLG; }
	public String getUP_LEVEL_NO() { return m_UP_LEVEL_NO; }
	public String getUPPER_ITEM_FLG() { return m_UPPER_ITEM_FLG; }
	public String getLOWER_ITEM_FLG() { return m_LOWER_ITEM_FLG; }
	public String getCOST_EXCLUDE_FLG() { return m_COST_EXCLUDE_FLG; }
	public String getCREATED_DATE() { return m_CREATED_DATE; }
	public String getCREATED_BY() { return m_CREATED_BY; }
	public String getCREATED_PRG_NM() { return m_CREATED_PRG_NM; }
	public String getUPDATED_DATE() { return m_UPDATED_DATE; }
	public String getUPDATED_BY() { return m_UPDATED_BY; }
	public String getUPDATED_PRG_NM() { return m_UPDATED_PRG_NM; }
	public String getPROC_COST_CLS_CD() { return m_PROC_COST_CLS_CD; }
	public String getPROC_COST_CLS_NAME() { return m_PROC_COST_CLS_NAME; }
	public String getPROC_COST_UNIT_QTY() { return m_PROC_COST_UNIT_QTY; }
	public String getPROC_COST_UNIT_QTY_UNIT() { return m_PROC_COST_UNIT_QTY_UNIT; }
	public String getOWN_PROC_COST_01() { return m_OWN_PROC_COST_01; }
	public String getOWN_PROC_COST_02() { return m_OWN_PROC_COST_02; }
	public String getOWN_PROC_COST_03() { return m_OWN_PROC_COST_03; }
	public String getOWN_PROC_COST_04() { return m_OWN_PROC_COST_04; }
	public String getOWN_PROC_COST_05() { return m_OWN_PROC_COST_05; }
	public String getOWN_PROC_COST_06() { return m_OWN_PROC_COST_06; }
	public String getOWN_PROC_COST_07() { return m_OWN_PROC_COST_07; }
	public String getOWN_PROC_COST_08() { return m_OWN_PROC_COST_08; }
	public String getOWN_PROC_COST_09() { return m_OWN_PROC_COST_09; }
	public String getOWN_PROC_COST_10() { return m_OWN_PROC_COST_10; }
	public String getOWN_PROC_COST_11() { return m_OWN_PROC_COST_11; }
	public String getOWN_PROC_COST_12() { return m_OWN_PROC_COST_12; }
	public String getOWN_PROC_COST_SUM() { return m_OWN_PROC_COST_SUM; }
	public String getUNDER_PROC_COST_01() { return m_UNDER_PROC_COST_01; }
	public String getUNDER_PROC_COST_02() { return m_UNDER_PROC_COST_02; }
	public String getUNDER_PROC_COST_03() { return m_UNDER_PROC_COST_03; }
	public String getUNDER_PROC_COST_04() { return m_UNDER_PROC_COST_04; }
	public String getUNDER_PROC_COST_05() { return m_UNDER_PROC_COST_05; }
	public String getUNDER_PROC_COST_06() { return m_UNDER_PROC_COST_06; }
	public String getUNDER_PROC_COST_07() { return m_UNDER_PROC_COST_07; }
	public String getUNDER_PROC_COST_08() { return m_UNDER_PROC_COST_08; }
	public String getUNDER_PROC_COST_09() { return m_UNDER_PROC_COST_09; }
	public String getUNDER_PROC_COST_10() { return m_UNDER_PROC_COST_10; }
	public String getUNDER_PROC_COST_11() { return m_UNDER_PROC_COST_11; }
	public String getUNDER_PROC_COST_12() { return m_UNDER_PROC_COST_12; }
	public String getUNDER_PROC_COST_SUM() { return m_UNDER_PROC_COST_SUM; }
	public String getTOTAL_PROC_COST_01() { return m_TOTAL_PROC_COST_01; }
	public String getTOTAL_PROC_COST_02() { return m_TOTAL_PROC_COST_02; }
	public String getTOTAL_PROC_COST_03() { return m_TOTAL_PROC_COST_03; }
	public String getTOTAL_PROC_COST_04() { return m_TOTAL_PROC_COST_04; }
	public String getTOTAL_PROC_COST_05() { return m_TOTAL_PROC_COST_05; }
	public String getTOTAL_PROC_COST_06() { return m_TOTAL_PROC_COST_06; }
	public String getTOTAL_PROC_COST_07() { return m_TOTAL_PROC_COST_07; }
	public String getTOTAL_PROC_COST_08() { return m_TOTAL_PROC_COST_08; }
	public String getTOTAL_PROC_COST_09() { return m_TOTAL_PROC_COST_09; }
	public String getTOTAL_PROC_COST_10() { return m_TOTAL_PROC_COST_10; }
	public String getTOTAL_PROC_COST_11() { return m_TOTAL_PROC_COST_11; }
	public String getTOTAL_PROC_COST_12() { return m_TOTAL_PROC_COST_12; }
	public String getTOTAL_PROC_COST_SUM() { return m_TOTAL_PROC_COST_SUM; }
	public String getPROC_COST_01_NAME() { return m_PROC_COST_01_NAME; }
	public String getPROC_COST_02_NAME() { return m_PROC_COST_02_NAME; }
	public String getPROC_COST_03_NAME() { return m_PROC_COST_03_NAME; }
	public String getPROC_COST_04_NAME() { return m_PROC_COST_04_NAME; }
	public String getPROC_COST_05_NAME() { return m_PROC_COST_05_NAME; }
	public String getPROC_COST_06_NAME() { return m_PROC_COST_06_NAME; }
	public String getPROC_COST_07_NAME() { return m_PROC_COST_07_NAME; }
	public String getPROC_COST_08_NAME() { return m_PROC_COST_08_NAME; }
	public String getPROC_COST_09_NAME() { return m_PROC_COST_09_NAME; }
	public String getPROC_COST_10_NAME() { return m_PROC_COST_10_NAME; }
	public String getPROC_COST_11_NAME() { return m_PROC_COST_11_NAME; }
	public String getPROC_COST_12_NAME() { return m_PROC_COST_12_NAME; }
	public String getHALF_TERM_TYP_DN() { return m_HALF_TERM_TYP_DN; }
	public String getPUCH_ITEM_CD() { return m_PUCH_ITEM_CD; }
	public String getPUCH_CS_PROC_CD() { return m_PUCH_CS_PROC_CD; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getUNIT_COST() { return m_UNIT_COST; }
	public String getUNIT_COST_TYP_DN() { return m_UNIT_COST_TYP_DN; }
	public String getCUR_UNIT() { return m_CUR_UNIT; }
	public String getEXCH_RATE() { return m_EXCH_RATE; }
	public String getHOME_CUR_UNIT_COST() { return m_HOME_CUR_UNIT_COST; }
	public String getPUCH_UNIT_QTY() { return m_PUCH_UNIT_QTY; }
	public String getSUB_VEND_CD() { return m_SUB_VEND_CD; }
	public String getSUB_UNIT_COST() { return m_SUB_UNIT_COST; }
	public String getSUB_UNIT_COST_TYP_DN() { return m_SUB_UNIT_COST_TYP_DN; }
	public String getSUB_CUR_UNIT() { return m_SUB_CUR_UNIT; }
	public String getSUB_EXCH_RATE() { return m_SUB_EXCH_RATE; }
	public String getSUB_HOME_CUR_UNIT_COST() { return m_SUB_HOME_CUR_UNIT_COST; }
	public String getSUB_PUCH_UNIT_QTY() { return m_SUB_PUCH_UNIT_QTY; }
	public String getPUCH_STOCK_UNIT() { return m_PUCH_STOCK_UNIT; }
	public String getUNIT_COST_ACCEPT_TYP_DN() { return m_UNIT_COST_ACCEPT_TYP_DN; }
	public String getCS_PUCH_TYP_DN() { return m_CS_PUCH_TYP_DN; }
	public String getPROC_VEND_CD() { return m_PROC_VEND_CD; }
	public String getPROC_ORG_CD() { return m_PROC_ORG_CD; }
	public String getPUCH_UNIT_COST() { return m_PUCH_UNIT_COST; }
	public String getPUCH_PUCH_UNIT_QTY() { return m_PUCH_PUCH_UNIT_QTY; }
	public String getSBCNT_UNIT_COST() { return m_SBCNT_UNIT_COST; }
	public String getSBCNT_PUCH_UNIT_QTY() { return m_SBCNT_PUCH_UNIT_QTY; }
	public String getPROC_COST_01() { return m_PROC_COST_01; }
	public String getPROC_COST_02() { return m_PROC_COST_02; }
	public String getPROC_COST_03() { return m_PROC_COST_03; }
	public String getPROC_COST_04() { return m_PROC_COST_04; }
	public String getPROC_COST_05() { return m_PROC_COST_05; }
	public String getPROC_COST_06() { return m_PROC_COST_06; }
	public String getPROC_COST_07() { return m_PROC_COST_07; }
	public String getPROC_COST_08() { return m_PROC_COST_08; }
	public String getPROC_COST_09() { return m_PROC_COST_09; }
	public String getPROC_COST_10() { return m_PROC_COST_10; }
	public String getPROC_COST_11() { return m_PROC_COST_11; }
	public String getPROC_COST_12() { return m_PROC_COST_12; }
	public String getPROC_COST_STOCK_UNIT() { return m_PROC_COST_STOCK_UNIT; }
	public String getCS_PUCH_TYP_VALUE() { return m_CS_PUCH_TYP_VALUE; }
	public String getCURRENT_YEAR() { return m_CURRENT_YEAR; }
	public String getl_COUNT() { return m_l_COUNT; }
	public String getROW_COUNT() { return m_ROW_COUNT; }

	public List getList_HALF_TERM_TYP_name() { return l_HALF_TERM_TYP_name; }
	public List getList_HALF_TERM_TYP_val() { return l_HALF_TERM_TYP_val; }
	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_COST_TYP_DN() { return l_COST_TYP_DN; }
	public List getList_OUTSIDE_TYP_DN() { return l_OUTSIDE_TYP_DN; }
	public List getList_PROC_OUTSIDE_TYP_DN() { return l_PROC_OUTSIDE_TYP_DN; }
	public List getList_DMY_ITEM_FLG_DN() { return l_DMY_ITEM_FLG_DN; }
	public List getList_VOLUNT_SPL_FLG_DN() { return l_VOLUNT_SPL_FLG_DN; }
	public List getList_COST_UP_TYP_DN() { return l_COST_UP_TYP_DN; }
	public List getList_ONEROUS_CONS_FLG_DN() { return l_ONEROUS_CONS_FLG_DN; }
	public List getList_UPPER_ITEM_FLG_DN() { return l_UPPER_ITEM_FLG_DN; }
	public List getList_LOWER_ITEM_FLG_DN() { return l_LOWER_ITEM_FLG_DN; }
	public List getList_COST_EXCLUDE_FLG_DN() { return l_COST_EXCLUDE_FLG_DN; }
	public List getList_l_ROOT_ITEM_CD() { return l_l_ROOT_ITEM_CD; }
	public List getList_l_ROOT_ITEM_NAME() { return l_l_ROOT_ITEM_NAME; }
	public List getList_l_CLASIFICATION_CD() { return l_l_CLASIFICATION_CD; }
	public List getList_l_CS_PROC_CD() { return l_l_CS_PROC_CD; }
	public List getList_l_CS_PROC_NAME() { return l_l_CS_PROC_NAME; }
	public List getList_l_NECESSARY_QTY() { return l_l_NECESSARY_QTY; }
	public List getList_l_STOCK_UNIT() { return l_l_STOCK_UNIT; }
	public List getList_l_ITEM_INPUT_RATIO() { return l_l_ITEM_INPUT_RATIO; }
	public List getList_l_HOME_CUR_UNIT() { return l_l_HOME_CUR_UNIT; }
	public List getList_l_TOTAL_COST() { return l_l_TOTAL_COST; }
	public List getList_l_TOTAL_MATR_COST() { return l_l_TOTAL_MATR_COST; }
	public List getList_l_TOTAL_SBCNT_MATR_COST() { return l_l_TOTAL_SBCNT_MATR_COST; }
	public List getList_l_TOTAL_PROC_COST_SUM_ALL() { return l_l_TOTAL_PROC_COST_SUM_ALL; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_YEAR() { return l_YEAR; }
	public List getList_HALF_TERM_TYP() { return l_HALF_TERM_TYP; }
	public List getList_ROOT_ITEM_CD() { return l_ROOT_ITEM_CD; }
	public List getList_CLASIFICATION_CD() { return l_CLASIFICATION_CD; }
	public List getList_COST_TYP() { return l_COST_TYP; }
	public List getList_PLANT_NAME() { return l_PLANT_NAME; }
	public List getList_ROOT_ITEM_NAME() { return l_ROOT_ITEM_NAME; }
	public List getList_PARENT_ITEM_CD() { return l_PARENT_ITEM_CD; }
	public List getList_PARENT_ITEM_NAME() { return l_PARENT_ITEM_NAME; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_PS_EDITION() { return l_PS_EDITION; }
	public List getList_COST_STATEMENT_NO() { return l_COST_STATEMENT_NO; }
	public List getList_CS_PROC_CD() { return l_CS_PROC_CD; }
	public List getList_CS_PROC_NAME() { return l_CS_PROC_NAME; }
	public List getList_WS_CD() { return l_WS_CD; }
	public List getList_WS_NAME() { return l_WS_NAME; }
	public List getList_ORG_CD() { return l_ORG_CD; }
	public List getList_ORG_NAME() { return l_ORG_NAME; }
	public List getList_NECESSARY_QTY() { return l_NECESSARY_QTY; }
	public List getList_PS_INPUT_RATIO() { return l_PS_INPUT_RATIO; }
	public List getList_ITEM_INPUT_RATIO() { return l_ITEM_INPUT_RATIO; }
	public List getList_TOTAL_COST() { return l_TOTAL_COST; }
	public List getList_OWN_MATR_COST() { return l_OWN_MATR_COST; }
	public List getList_UNDER_MATR_COST() { return l_UNDER_MATR_COST; }
	public List getList_TOTAL_MATR_COST() { return l_TOTAL_MATR_COST; }
	public List getList_OWN_SBCNT_MATR_COST() { return l_OWN_SBCNT_MATR_COST; }
	public List getList_UNDER_SBCNT_MATR_COST() { return l_UNDER_SBCNT_MATR_COST; }
	public List getList_TOTAL_SBCNT_MATR_COST() { return l_TOTAL_SBCNT_MATR_COST; }
	public List getList_OWN_PROC_COST_SUM_ALL() { return l_OWN_PROC_COST_SUM_ALL; }
	public List getList_UNDER_PROC_COST_SUM_ALL() { return l_UNDER_PROC_COST_SUM_ALL; }
	public List getList_TOTAL_PROC_COST_SUM_ALL() { return l_TOTAL_PROC_COST_SUM_ALL; }
	public List getList_HOME_CUR_UNIT() { return l_HOME_CUR_UNIT; }
	public List getList_EFF_PHASE_IN_DATE() { return l_EFF_PHASE_IN_DATE; }
	public List getList_EFF_PHASE_OUT_DATE() { return l_EFF_PHASE_OUT_DATE; }
	public List getList_PS_UNIT_DENOMINATOR() { return l_PS_UNIT_DENOMINATOR; }
	public List getList_PS_UNIT_NUMERATOR() { return l_PS_UNIT_NUMERATOR; }
	public List getList_PARENT_COST_STATEMENT_NO() { return l_PARENT_COST_STATEMENT_NO; }
	public List getList_PARENT_ITEM_STOCK_UNIT() { return l_PARENT_ITEM_STOCK_UNIT; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_OUTSIDE_TYP() { return l_OUTSIDE_TYP; }
	public List getList_PROC_OUTSIDE_TYP() { return l_PROC_OUTSIDE_TYP; }
	public List getList_DMY_ITEM_FLG() { return l_DMY_ITEM_FLG; }
	public List getList_VOLUNT_SPL_FLG() { return l_VOLUNT_SPL_FLG; }
	public List getList_COST_UP_TYP() { return l_COST_UP_TYP; }
	public List getList_ONEROUS_CONS_FLG() { return l_ONEROUS_CONS_FLG; }
	public List getList_UP_LEVEL_NO() { return l_UP_LEVEL_NO; }
	public List getList_UPPER_ITEM_FLG() { return l_UPPER_ITEM_FLG; }
	public List getList_LOWER_ITEM_FLG() { return l_LOWER_ITEM_FLG; }
	public List getList_COST_EXCLUDE_FLG() { return l_COST_EXCLUDE_FLG; }
	public List getList_CREATED_DATE() { return l_CREATED_DATE; }
	public List getList_CREATED_BY() { return l_CREATED_BY; }
	public List getList_CREATED_PRG_NM() { return l_CREATED_PRG_NM; }
	public List getList_UPDATED_DATE() { return l_UPDATED_DATE; }
	public List getList_UPDATED_BY() { return l_UPDATED_BY; }
	public List getList_UPDATED_PRG_NM() { return l_UPDATED_PRG_NM; }
	public List getList_PROC_COST_CLS_CD() { return l_PROC_COST_CLS_CD; }
	public List getList_PROC_COST_CLS_NAME() { return l_PROC_COST_CLS_NAME; }
	public List getList_PROC_COST_UNIT_QTY() { return l_PROC_COST_UNIT_QTY; }
	public List getList_PROC_COST_UNIT_QTY_UNIT() { return l_PROC_COST_UNIT_QTY_UNIT; }
	public List getList_OWN_PROC_COST_01() { return l_OWN_PROC_COST_01; }
	public List getList_OWN_PROC_COST_02() { return l_OWN_PROC_COST_02; }
	public List getList_OWN_PROC_COST_03() { return l_OWN_PROC_COST_03; }
	public List getList_OWN_PROC_COST_04() { return l_OWN_PROC_COST_04; }
	public List getList_OWN_PROC_COST_05() { return l_OWN_PROC_COST_05; }
	public List getList_OWN_PROC_COST_06() { return l_OWN_PROC_COST_06; }
	public List getList_OWN_PROC_COST_07() { return l_OWN_PROC_COST_07; }
	public List getList_OWN_PROC_COST_08() { return l_OWN_PROC_COST_08; }
	public List getList_OWN_PROC_COST_09() { return l_OWN_PROC_COST_09; }
	public List getList_OWN_PROC_COST_10() { return l_OWN_PROC_COST_10; }
	public List getList_OWN_PROC_COST_11() { return l_OWN_PROC_COST_11; }
	public List getList_OWN_PROC_COST_12() { return l_OWN_PROC_COST_12; }
	public List getList_OWN_PROC_COST_SUM() { return l_OWN_PROC_COST_SUM; }
	public List getList_UNDER_PROC_COST_01() { return l_UNDER_PROC_COST_01; }
	public List getList_UNDER_PROC_COST_02() { return l_UNDER_PROC_COST_02; }
	public List getList_UNDER_PROC_COST_03() { return l_UNDER_PROC_COST_03; }
	public List getList_UNDER_PROC_COST_04() { return l_UNDER_PROC_COST_04; }
	public List getList_UNDER_PROC_COST_05() { return l_UNDER_PROC_COST_05; }
	public List getList_UNDER_PROC_COST_06() { return l_UNDER_PROC_COST_06; }
	public List getList_UNDER_PROC_COST_07() { return l_UNDER_PROC_COST_07; }
	public List getList_UNDER_PROC_COST_08() { return l_UNDER_PROC_COST_08; }
	public List getList_UNDER_PROC_COST_09() { return l_UNDER_PROC_COST_09; }
	public List getList_UNDER_PROC_COST_10() { return l_UNDER_PROC_COST_10; }
	public List getList_UNDER_PROC_COST_11() { return l_UNDER_PROC_COST_11; }
	public List getList_UNDER_PROC_COST_12() { return l_UNDER_PROC_COST_12; }
	public List getList_UNDER_PROC_COST_SUM() { return l_UNDER_PROC_COST_SUM; }
	public List getList_TOTAL_PROC_COST_01() { return l_TOTAL_PROC_COST_01; }
	public List getList_TOTAL_PROC_COST_02() { return l_TOTAL_PROC_COST_02; }
	public List getList_TOTAL_PROC_COST_03() { return l_TOTAL_PROC_COST_03; }
	public List getList_TOTAL_PROC_COST_04() { return l_TOTAL_PROC_COST_04; }
	public List getList_TOTAL_PROC_COST_05() { return l_TOTAL_PROC_COST_05; }
	public List getList_TOTAL_PROC_COST_06() { return l_TOTAL_PROC_COST_06; }
	public List getList_TOTAL_PROC_COST_07() { return l_TOTAL_PROC_COST_07; }
	public List getList_TOTAL_PROC_COST_08() { return l_TOTAL_PROC_COST_08; }
	public List getList_TOTAL_PROC_COST_09() { return l_TOTAL_PROC_COST_09; }
	public List getList_TOTAL_PROC_COST_10() { return l_TOTAL_PROC_COST_10; }
	public List getList_TOTAL_PROC_COST_11() { return l_TOTAL_PROC_COST_11; }
	public List getList_TOTAL_PROC_COST_12() { return l_TOTAL_PROC_COST_12; }
	public List getList_TOTAL_PROC_COST_SUM() { return l_TOTAL_PROC_COST_SUM; }
	public List getList_PROC_COST_01_NAME() { return l_PROC_COST_01_NAME; }
	public List getList_PROC_COST_02_NAME() { return l_PROC_COST_02_NAME; }
	public List getList_PROC_COST_03_NAME() { return l_PROC_COST_03_NAME; }
	public List getList_PROC_COST_04_NAME() { return l_PROC_COST_04_NAME; }
	public List getList_PROC_COST_05_NAME() { return l_PROC_COST_05_NAME; }
	public List getList_PROC_COST_06_NAME() { return l_PROC_COST_06_NAME; }
	public List getList_PROC_COST_07_NAME() { return l_PROC_COST_07_NAME; }
	public List getList_PROC_COST_08_NAME() { return l_PROC_COST_08_NAME; }
	public List getList_PROC_COST_09_NAME() { return l_PROC_COST_09_NAME; }
	public List getList_PROC_COST_10_NAME() { return l_PROC_COST_10_NAME; }
	public List getList_PROC_COST_11_NAME() { return l_PROC_COST_11_NAME; }
	public List getList_PROC_COST_12_NAME() { return l_PROC_COST_12_NAME; }
	public List getList_HALF_TERM_TYP_DN() { return l_HALF_TERM_TYP_DN; }
	public List getList_PUCH_ITEM_CD() { return l_PUCH_ITEM_CD; }
	public List getList_PUCH_CS_PROC_CD() { return l_PUCH_CS_PROC_CD; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_UNIT_COST() { return l_UNIT_COST; }
	public List getList_UNIT_COST_TYP_DN() { return l_UNIT_COST_TYP_DN; }
	public List getList_CUR_UNIT() { return l_CUR_UNIT; }
	public List getList_EXCH_RATE() { return l_EXCH_RATE; }
	public List getList_HOME_CUR_UNIT_COST() { return l_HOME_CUR_UNIT_COST; }
	public List getList_PUCH_UNIT_QTY() { return l_PUCH_UNIT_QTY; }
	public List getList_SUB_VEND_CD() { return l_SUB_VEND_CD; }
	public List getList_SUB_UNIT_COST() { return l_SUB_UNIT_COST; }
	public List getList_SUB_UNIT_COST_TYP_DN() { return l_SUB_UNIT_COST_TYP_DN; }
	public List getList_SUB_CUR_UNIT() { return l_SUB_CUR_UNIT; }
	public List getList_SUB_EXCH_RATE() { return l_SUB_EXCH_RATE; }
	public List getList_SUB_HOME_CUR_UNIT_COST() { return l_SUB_HOME_CUR_UNIT_COST; }
	public List getList_SUB_PUCH_UNIT_QTY() { return l_SUB_PUCH_UNIT_QTY; }
	public List getList_PUCH_STOCK_UNIT() { return l_PUCH_STOCK_UNIT; }
	public List getList_UNIT_COST_ACCEPT_TYP_DN() { return l_UNIT_COST_ACCEPT_TYP_DN; }
	public List getList_CS_PUCH_TYP_DN() { return l_CS_PUCH_TYP_DN; }
	public List getList_PROC_VEND_CD() { return l_PROC_VEND_CD; }
	public List getList_PROC_ORG_CD() { return l_PROC_ORG_CD; }
	public List getList_PUCH_UNIT_COST() { return l_PUCH_UNIT_COST; }
	public List getList_PUCH_PUCH_UNIT_QTY() { return l_PUCH_PUCH_UNIT_QTY; }
	public List getList_SBCNT_UNIT_COST() { return l_SBCNT_UNIT_COST; }
	public List getList_SBCNT_PUCH_UNIT_QTY() { return l_SBCNT_PUCH_UNIT_QTY; }
	public List getList_PROC_COST_01() { return l_PROC_COST_01; }
	public List getList_PROC_COST_02() { return l_PROC_COST_02; }
	public List getList_PROC_COST_03() { return l_PROC_COST_03; }
	public List getList_PROC_COST_04() { return l_PROC_COST_04; }
	public List getList_PROC_COST_05() { return l_PROC_COST_05; }
	public List getList_PROC_COST_06() { return l_PROC_COST_06; }
	public List getList_PROC_COST_07() { return l_PROC_COST_07; }
	public List getList_PROC_COST_08() { return l_PROC_COST_08; }
	public List getList_PROC_COST_09() { return l_PROC_COST_09; }
	public List getList_PROC_COST_10() { return l_PROC_COST_10; }
	public List getList_PROC_COST_11() { return l_PROC_COST_11; }
	public List getList_PROC_COST_12() { return l_PROC_COST_12; }
	public List getList_PROC_COST_STOCK_UNIT() { return l_PROC_COST_STOCK_UNIT; }
	public List getList_CS_PUCH_TYP_VALUE() { return l_CS_PUCH_TYP_VALUE; }
	public List getList_CURRENT_YEAR() { return l_CURRENT_YEAR; }
	public List getList_l_COUNT() { return l_l_COUNT; }
	public List getList_ROW_COUNT() { return l_ROW_COUNT; }

	public void setHALF_TERM_TYP_name(String val) { m_HALF_TERM_TYP_name = val; }
	public void setHALF_TERM_TYP_val(String val) { m_HALF_TERM_TYP_val = val; }
	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void setCOST_TYP_DN(String val) { m_COST_TYP_DN = val; }
	public void setOUTSIDE_TYP_DN(String val) { m_OUTSIDE_TYP_DN = val; }
	public void setPROC_OUTSIDE_TYP_DN(String val) { m_PROC_OUTSIDE_TYP_DN = val; }
	public void setDMY_ITEM_FLG_DN(String val) { m_DMY_ITEM_FLG_DN = val; }
	public void setVOLUNT_SPL_FLG_DN(String val) { m_VOLUNT_SPL_FLG_DN = val; }
	public void setCOST_UP_TYP_DN(String val) { m_COST_UP_TYP_DN = val; }
	public void setONEROUS_CONS_FLG_DN(String val) { m_ONEROUS_CONS_FLG_DN = val; }
	public void setUPPER_ITEM_FLG_DN(String val) { m_UPPER_ITEM_FLG_DN = val; }
	public void setLOWER_ITEM_FLG_DN(String val) { m_LOWER_ITEM_FLG_DN = val; }
	public void setCOST_EXCLUDE_FLG_DN(String val) { m_COST_EXCLUDE_FLG_DN = val; }
	public void setl_ROOT_ITEM_CD(String val) { m_l_ROOT_ITEM_CD = val; }
	public void setl_ROOT_ITEM_NAME(String val) { m_l_ROOT_ITEM_NAME = val; }
	public void setl_CLASIFICATION_CD(String val) { m_l_CLASIFICATION_CD = val; }
	public void setl_CS_PROC_CD(String val) { m_l_CS_PROC_CD = val; }
	public void setl_CS_PROC_NAME(String val) { m_l_CS_PROC_NAME = val; }
	public void setl_NECESSARY_QTY(String val) { m_l_NECESSARY_QTY = val; }
	public void setl_STOCK_UNIT(String val) { m_l_STOCK_UNIT = val; }
	public void setl_ITEM_INPUT_RATIO(String val) { m_l_ITEM_INPUT_RATIO = val; }
	public void setl_HOME_CUR_UNIT(String val) { m_l_HOME_CUR_UNIT = val; }
	public void setl_TOTAL_COST(String val) { m_l_TOTAL_COST = val; }
	public void setl_TOTAL_MATR_COST(String val) { m_l_TOTAL_MATR_COST = val; }
	public void setl_TOTAL_SBCNT_MATR_COST(String val) { m_l_TOTAL_SBCNT_MATR_COST = val; }
	public void setl_TOTAL_PROC_COST_SUM_ALL(String val) { m_l_TOTAL_PROC_COST_SUM_ALL = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setYEAR(String val) { m_YEAR = val; }
	public void setHALF_TERM_TYP(String val) { m_HALF_TERM_TYP = val; }
	public void setROOT_ITEM_CD(String val) { m_ROOT_ITEM_CD = val; }
	public void setCLASIFICATION_CD(String val) { m_CLASIFICATION_CD = val; }
	public void setCOST_TYP(String val) { m_COST_TYP = val; }
	public void setPLANT_NAME(String val) { m_PLANT_NAME = val; }
	public void setROOT_ITEM_NAME(String val) { m_ROOT_ITEM_NAME = val; }
	public void setPARENT_ITEM_CD(String val) { m_PARENT_ITEM_CD = val; }
	public void setPARENT_ITEM_NAME(String val) { m_PARENT_ITEM_NAME = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setPS_EDITION(String val) { m_PS_EDITION = val; }
	public void setCOST_STATEMENT_NO(String val) { m_COST_STATEMENT_NO = val; }
	public void setCS_PROC_CD(String val) { m_CS_PROC_CD = val; }
	public void setCS_PROC_NAME(String val) { m_CS_PROC_NAME = val; }
	public void setWS_CD(String val) { m_WS_CD = val; }
	public void setWS_NAME(String val) { m_WS_NAME = val; }
	public void setORG_CD(String val) { m_ORG_CD = val; }
	public void setORG_NAME(String val) { m_ORG_NAME = val; }
	public void setNECESSARY_QTY(String val) { m_NECESSARY_QTY = val; }
	public void setPS_INPUT_RATIO(String val) { m_PS_INPUT_RATIO = val; }
	public void setITEM_INPUT_RATIO(String val) { m_ITEM_INPUT_RATIO = val; }
	public void setTOTAL_COST(String val) { m_TOTAL_COST = val; }
	public void setOWN_MATR_COST(String val) { m_OWN_MATR_COST = val; }
	public void setUNDER_MATR_COST(String val) { m_UNDER_MATR_COST = val; }
	public void setTOTAL_MATR_COST(String val) { m_TOTAL_MATR_COST = val; }
	public void setOWN_SBCNT_MATR_COST(String val) { m_OWN_SBCNT_MATR_COST = val; }
	public void setUNDER_SBCNT_MATR_COST(String val) { m_UNDER_SBCNT_MATR_COST = val; }
	public void setTOTAL_SBCNT_MATR_COST(String val) { m_TOTAL_SBCNT_MATR_COST = val; }
	public void setOWN_PROC_COST_SUM_ALL(String val) { m_OWN_PROC_COST_SUM_ALL = val; }
	public void setUNDER_PROC_COST_SUM_ALL(String val) { m_UNDER_PROC_COST_SUM_ALL = val; }
	public void setTOTAL_PROC_COST_SUM_ALL(String val) { m_TOTAL_PROC_COST_SUM_ALL = val; }
	public void setHOME_CUR_UNIT(String val) { m_HOME_CUR_UNIT = val; }
	public void setEFF_PHASE_IN_DATE(String val) { m_EFF_PHASE_IN_DATE = val; }
	public void setEFF_PHASE_OUT_DATE(String val) { m_EFF_PHASE_OUT_DATE = val; }
	public void setPS_UNIT_DENOMINATOR(String val) { m_PS_UNIT_DENOMINATOR = val; }
	public void setPS_UNIT_NUMERATOR(String val) { m_PS_UNIT_NUMERATOR = val; }
	public void setPARENT_COST_STATEMENT_NO(String val) { m_PARENT_COST_STATEMENT_NO = val; }
	public void setPARENT_ITEM_STOCK_UNIT(String val) { m_PARENT_ITEM_STOCK_UNIT = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setOUTSIDE_TYP(String val) { m_OUTSIDE_TYP = val; }
	public void setPROC_OUTSIDE_TYP(String val) { m_PROC_OUTSIDE_TYP = val; }
	public void setDMY_ITEM_FLG(String val) { m_DMY_ITEM_FLG = val; }
	public void setVOLUNT_SPL_FLG(String val) { m_VOLUNT_SPL_FLG = val; }
	public void setCOST_UP_TYP(String val) { m_COST_UP_TYP = val; }
	public void setONEROUS_CONS_FLG(String val) { m_ONEROUS_CONS_FLG = val; }
	public void setUP_LEVEL_NO(String val) { m_UP_LEVEL_NO = val; }
	public void setUPPER_ITEM_FLG(String val) { m_UPPER_ITEM_FLG = val; }
	public void setLOWER_ITEM_FLG(String val) { m_LOWER_ITEM_FLG = val; }
	public void setCOST_EXCLUDE_FLG(String val) { m_COST_EXCLUDE_FLG = val; }
	public void setCREATED_DATE(String val) { m_CREATED_DATE = val; }
	public void setCREATED_BY(String val) { m_CREATED_BY = val; }
	public void setCREATED_PRG_NM(String val) { m_CREATED_PRG_NM = val; }
	public void setUPDATED_DATE(String val) { m_UPDATED_DATE = val; }
	public void setUPDATED_BY(String val) { m_UPDATED_BY = val; }
	public void setUPDATED_PRG_NM(String val) { m_UPDATED_PRG_NM = val; }
	public void setPROC_COST_CLS_CD(String val) { m_PROC_COST_CLS_CD = val; }
	public void setPROC_COST_CLS_NAME(String val) { m_PROC_COST_CLS_NAME = val; }
	public void setPROC_COST_UNIT_QTY(String val) { m_PROC_COST_UNIT_QTY = val; }
	public void setPROC_COST_UNIT_QTY_UNIT(String val) { m_PROC_COST_UNIT_QTY_UNIT = val; }
	public void setOWN_PROC_COST_01(String val) { m_OWN_PROC_COST_01 = val; }
	public void setOWN_PROC_COST_02(String val) { m_OWN_PROC_COST_02 = val; }
	public void setOWN_PROC_COST_03(String val) { m_OWN_PROC_COST_03 = val; }
	public void setOWN_PROC_COST_04(String val) { m_OWN_PROC_COST_04 = val; }
	public void setOWN_PROC_COST_05(String val) { m_OWN_PROC_COST_05 = val; }
	public void setOWN_PROC_COST_06(String val) { m_OWN_PROC_COST_06 = val; }
	public void setOWN_PROC_COST_07(String val) { m_OWN_PROC_COST_07 = val; }
	public void setOWN_PROC_COST_08(String val) { m_OWN_PROC_COST_08 = val; }
	public void setOWN_PROC_COST_09(String val) { m_OWN_PROC_COST_09 = val; }
	public void setOWN_PROC_COST_10(String val) { m_OWN_PROC_COST_10 = val; }
	public void setOWN_PROC_COST_11(String val) { m_OWN_PROC_COST_11 = val; }
	public void setOWN_PROC_COST_12(String val) { m_OWN_PROC_COST_12 = val; }
	public void setOWN_PROC_COST_SUM(String val) { m_OWN_PROC_COST_SUM = val; }
	public void setUNDER_PROC_COST_01(String val) { m_UNDER_PROC_COST_01 = val; }
	public void setUNDER_PROC_COST_02(String val) { m_UNDER_PROC_COST_02 = val; }
	public void setUNDER_PROC_COST_03(String val) { m_UNDER_PROC_COST_03 = val; }
	public void setUNDER_PROC_COST_04(String val) { m_UNDER_PROC_COST_04 = val; }
	public void setUNDER_PROC_COST_05(String val) { m_UNDER_PROC_COST_05 = val; }
	public void setUNDER_PROC_COST_06(String val) { m_UNDER_PROC_COST_06 = val; }
	public void setUNDER_PROC_COST_07(String val) { m_UNDER_PROC_COST_07 = val; }
	public void setUNDER_PROC_COST_08(String val) { m_UNDER_PROC_COST_08 = val; }
	public void setUNDER_PROC_COST_09(String val) { m_UNDER_PROC_COST_09 = val; }
	public void setUNDER_PROC_COST_10(String val) { m_UNDER_PROC_COST_10 = val; }
	public void setUNDER_PROC_COST_11(String val) { m_UNDER_PROC_COST_11 = val; }
	public void setUNDER_PROC_COST_12(String val) { m_UNDER_PROC_COST_12 = val; }
	public void setUNDER_PROC_COST_SUM(String val) { m_UNDER_PROC_COST_SUM = val; }
	public void setTOTAL_PROC_COST_01(String val) { m_TOTAL_PROC_COST_01 = val; }
	public void setTOTAL_PROC_COST_02(String val) { m_TOTAL_PROC_COST_02 = val; }
	public void setTOTAL_PROC_COST_03(String val) { m_TOTAL_PROC_COST_03 = val; }
	public void setTOTAL_PROC_COST_04(String val) { m_TOTAL_PROC_COST_04 = val; }
	public void setTOTAL_PROC_COST_05(String val) { m_TOTAL_PROC_COST_05 = val; }
	public void setTOTAL_PROC_COST_06(String val) { m_TOTAL_PROC_COST_06 = val; }
	public void setTOTAL_PROC_COST_07(String val) { m_TOTAL_PROC_COST_07 = val; }
	public void setTOTAL_PROC_COST_08(String val) { m_TOTAL_PROC_COST_08 = val; }
	public void setTOTAL_PROC_COST_09(String val) { m_TOTAL_PROC_COST_09 = val; }
	public void setTOTAL_PROC_COST_10(String val) { m_TOTAL_PROC_COST_10 = val; }
	public void setTOTAL_PROC_COST_11(String val) { m_TOTAL_PROC_COST_11 = val; }
	public void setTOTAL_PROC_COST_12(String val) { m_TOTAL_PROC_COST_12 = val; }
	public void setTOTAL_PROC_COST_SUM(String val) { m_TOTAL_PROC_COST_SUM = val; }
	public void setPROC_COST_01_NAME(String val) { m_PROC_COST_01_NAME = val; }
	public void setPROC_COST_02_NAME(String val) { m_PROC_COST_02_NAME = val; }
	public void setPROC_COST_03_NAME(String val) { m_PROC_COST_03_NAME = val; }
	public void setPROC_COST_04_NAME(String val) { m_PROC_COST_04_NAME = val; }
	public void setPROC_COST_05_NAME(String val) { m_PROC_COST_05_NAME = val; }
	public void setPROC_COST_06_NAME(String val) { m_PROC_COST_06_NAME = val; }
	public void setPROC_COST_07_NAME(String val) { m_PROC_COST_07_NAME = val; }
	public void setPROC_COST_08_NAME(String val) { m_PROC_COST_08_NAME = val; }
	public void setPROC_COST_09_NAME(String val) { m_PROC_COST_09_NAME = val; }
	public void setPROC_COST_10_NAME(String val) { m_PROC_COST_10_NAME = val; }
	public void setPROC_COST_11_NAME(String val) { m_PROC_COST_11_NAME = val; }
	public void setPROC_COST_12_NAME(String val) { m_PROC_COST_12_NAME = val; }
	public void setHALF_TERM_TYP_DN(String val) { m_HALF_TERM_TYP_DN = val; }
	public void setPUCH_ITEM_CD(String val) { m_PUCH_ITEM_CD = val; }
	public void setPUCH_CS_PROC_CD(String val) { m_PUCH_CS_PROC_CD = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void setUNIT_COST(String val) { m_UNIT_COST = val; }
	public void setUNIT_COST_TYP_DN(String val) { m_UNIT_COST_TYP_DN = val; }
	public void setCUR_UNIT(String val) { m_CUR_UNIT = val; }
	public void setEXCH_RATE(String val) { m_EXCH_RATE = val; }
	public void setHOME_CUR_UNIT_COST(String val) { m_HOME_CUR_UNIT_COST = val; }
	public void setPUCH_UNIT_QTY(String val) { m_PUCH_UNIT_QTY = val; }
	public void setSUB_VEND_CD(String val) { m_SUB_VEND_CD = val; }
	public void setSUB_UNIT_COST(String val) { m_SUB_UNIT_COST = val; }
	public void setSUB_UNIT_COST_TYP_DN(String val) { m_SUB_UNIT_COST_TYP_DN = val; }
	public void setSUB_CUR_UNIT(String val) { m_SUB_CUR_UNIT = val; }
	public void setSUB_EXCH_RATE(String val) { m_SUB_EXCH_RATE = val; }
	public void setSUB_HOME_CUR_UNIT_COST(String val) { m_SUB_HOME_CUR_UNIT_COST = val; }
	public void setSUB_PUCH_UNIT_QTY(String val) { m_SUB_PUCH_UNIT_QTY = val; }
	public void setPUCH_STOCK_UNIT(String val) { m_PUCH_STOCK_UNIT = val; }
	public void setUNIT_COST_ACCEPT_TYP_DN(String val) { m_UNIT_COST_ACCEPT_TYP_DN = val; }
	public void setCS_PUCH_TYP_DN(String val) { m_CS_PUCH_TYP_DN = val; }
	public void setPROC_VEND_CD(String val) { m_PROC_VEND_CD = val; }
	public void setPROC_ORG_CD(String val) { m_PROC_ORG_CD = val; }
	public void setPUCH_UNIT_COST(String val) { m_PUCH_UNIT_COST = val; }
	public void setPUCH_PUCH_UNIT_QTY(String val) { m_PUCH_PUCH_UNIT_QTY = val; }
	public void setSBCNT_UNIT_COST(String val) { m_SBCNT_UNIT_COST = val; }
	public void setSBCNT_PUCH_UNIT_QTY(String val) { m_SBCNT_PUCH_UNIT_QTY = val; }
	public void setPROC_COST_01(String val) { m_PROC_COST_01 = val; }
	public void setPROC_COST_02(String val) { m_PROC_COST_02 = val; }
	public void setPROC_COST_03(String val) { m_PROC_COST_03 = val; }
	public void setPROC_COST_04(String val) { m_PROC_COST_04 = val; }
	public void setPROC_COST_05(String val) { m_PROC_COST_05 = val; }
	public void setPROC_COST_06(String val) { m_PROC_COST_06 = val; }
	public void setPROC_COST_07(String val) { m_PROC_COST_07 = val; }
	public void setPROC_COST_08(String val) { m_PROC_COST_08 = val; }
	public void setPROC_COST_09(String val) { m_PROC_COST_09 = val; }
	public void setPROC_COST_10(String val) { m_PROC_COST_10 = val; }
	public void setPROC_COST_11(String val) { m_PROC_COST_11 = val; }
	public void setPROC_COST_12(String val) { m_PROC_COST_12 = val; }
	public void setPROC_COST_STOCK_UNIT(String val) { m_PROC_COST_STOCK_UNIT = val; }
	public void setCS_PUCH_TYP_VALUE(String val) { m_CS_PUCH_TYP_VALUE = val; }
	public void setCURRENT_YEAR(String val) { m_CURRENT_YEAR = val; }
	public void setl_COUNT(String val) { m_l_COUNT = val; }
	public void setROW_COUNT(String val) { m_ROW_COUNT = val; }


	public void setList_HALF_TERM_TYP_name(List list) { l_HALF_TERM_TYP_name = list; }
	public void setList_HALF_TERM_TYP_val(List list) { l_HALF_TERM_TYP_val = list; }
	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_COST_TYP_DN(List list) { l_COST_TYP_DN = list; }
	public void setList_OUTSIDE_TYP_DN(List list) { l_OUTSIDE_TYP_DN = list; }
	public void setList_PROC_OUTSIDE_TYP_DN(List list) { l_PROC_OUTSIDE_TYP_DN = list; }
	public void setList_DMY_ITEM_FLG_DN(List list) { l_DMY_ITEM_FLG_DN = list; }
	public void setList_VOLUNT_SPL_FLG_DN(List list) { l_VOLUNT_SPL_FLG_DN = list; }
	public void setList_COST_UP_TYP_DN(List list) { l_COST_UP_TYP_DN = list; }
	public void setList_ONEROUS_CONS_FLG_DN(List list) { l_ONEROUS_CONS_FLG_DN = list; }
	public void setList_UPPER_ITEM_FLG_DN(List list) { l_UPPER_ITEM_FLG_DN = list; }
	public void setList_LOWER_ITEM_FLG_DN(List list) { l_LOWER_ITEM_FLG_DN = list; }
	public void setList_COST_EXCLUDE_FLG_DN(List list) { l_COST_EXCLUDE_FLG_DN = list; }
	public void setList_l_ROOT_ITEM_CD(List list) { l_l_ROOT_ITEM_CD = list; }
	public void setList_l_ROOT_ITEM_NAME(List list) { l_l_ROOT_ITEM_NAME = list; }
	public void setList_l_CLASIFICATION_CD(List list) { l_l_CLASIFICATION_CD = list; }
	public void setList_l_CS_PROC_CD(List list) { l_l_CS_PROC_CD = list; }
	public void setList_l_CS_PROC_NAME(List list) { l_l_CS_PROC_NAME = list; }
	public void setList_l_NECESSARY_QTY(List list) { l_l_NECESSARY_QTY = list; }
	public void setList_l_STOCK_UNIT(List list) { l_l_STOCK_UNIT = list; }
	public void setList_l_ITEM_INPUT_RATIO(List list) { l_l_ITEM_INPUT_RATIO = list; }
	public void setList_l_HOME_CUR_UNIT(List list) { l_l_HOME_CUR_UNIT = list; }
	public void setList_l_TOTAL_COST(List list) { l_l_TOTAL_COST = list; }
	public void setList_l_TOTAL_MATR_COST(List list) { l_l_TOTAL_MATR_COST = list; }
	public void setList_l_TOTAL_SBCNT_MATR_COST(List list) { l_l_TOTAL_SBCNT_MATR_COST = list; }
	public void setList_l_TOTAL_PROC_COST_SUM_ALL(List list) { l_l_TOTAL_PROC_COST_SUM_ALL = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_YEAR(List list) { l_YEAR = list; }
	public void setList_HALF_TERM_TYP(List list) { l_HALF_TERM_TYP = list; }
	public void setList_ROOT_ITEM_CD(List list) { l_ROOT_ITEM_CD = list; }
	public void setList_CLASIFICATION_CD(List list) { l_CLASIFICATION_CD = list; }
	public void setList_COST_TYP(List list) { l_COST_TYP = list; }
	public void setList_PLANT_NAME(List list) { l_PLANT_NAME = list; }
	public void setList_ROOT_ITEM_NAME(List list) { l_ROOT_ITEM_NAME = list; }
	public void setList_PARENT_ITEM_CD(List list) { l_PARENT_ITEM_CD = list; }
	public void setList_PARENT_ITEM_NAME(List list) { l_PARENT_ITEM_NAME = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_PS_EDITION(List list) { l_PS_EDITION = list; }
	public void setList_COST_STATEMENT_NO(List list) { l_COST_STATEMENT_NO = list; }
	public void setList_CS_PROC_CD(List list) { l_CS_PROC_CD = list; }
	public void setList_CS_PROC_NAME(List list) { l_CS_PROC_NAME = list; }
	public void setList_WS_CD(List list) { l_WS_CD = list; }
	public void setList_WS_NAME(List list) { l_WS_NAME = list; }
	public void setList_ORG_CD(List list) { l_ORG_CD = list; }
	public void setList_ORG_NAME(List list) { l_ORG_NAME = list; }
	public void setList_NECESSARY_QTY(List list) { l_NECESSARY_QTY = list; }
	public void setList_PS_INPUT_RATIO(List list) { l_PS_INPUT_RATIO = list; }
	public void setList_ITEM_INPUT_RATIO(List list) { l_ITEM_INPUT_RATIO = list; }
	public void setList_TOTAL_COST(List list) { l_TOTAL_COST = list; }
	public void setList_OWN_MATR_COST(List list) { l_OWN_MATR_COST = list; }
	public void setList_UNDER_MATR_COST(List list) { l_UNDER_MATR_COST = list; }
	public void setList_TOTAL_MATR_COST(List list) { l_TOTAL_MATR_COST = list; }
	public void setList_OWN_SBCNT_MATR_COST(List list) { l_OWN_SBCNT_MATR_COST = list; }
	public void setList_UNDER_SBCNT_MATR_COST(List list) { l_UNDER_SBCNT_MATR_COST = list; }
	public void setList_TOTAL_SBCNT_MATR_COST(List list) { l_TOTAL_SBCNT_MATR_COST = list; }
	public void setList_OWN_PROC_COST_SUM_ALL(List list) { l_OWN_PROC_COST_SUM_ALL = list; }
	public void setList_UNDER_PROC_COST_SUM_ALL(List list) { l_UNDER_PROC_COST_SUM_ALL = list; }
	public void setList_TOTAL_PROC_COST_SUM_ALL(List list) { l_TOTAL_PROC_COST_SUM_ALL = list; }
	public void setList_HOME_CUR_UNIT(List list) { l_HOME_CUR_UNIT = list; }
	public void setList_EFF_PHASE_IN_DATE(List list) { l_EFF_PHASE_IN_DATE = list; }
	public void setList_EFF_PHASE_OUT_DATE(List list) { l_EFF_PHASE_OUT_DATE = list; }
	public void setList_PS_UNIT_DENOMINATOR(List list) { l_PS_UNIT_DENOMINATOR = list; }
	public void setList_PS_UNIT_NUMERATOR(List list) { l_PS_UNIT_NUMERATOR = list; }
	public void setList_PARENT_COST_STATEMENT_NO(List list) { l_PARENT_COST_STATEMENT_NO = list; }
	public void setList_PARENT_ITEM_STOCK_UNIT(List list) { l_PARENT_ITEM_STOCK_UNIT = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_OUTSIDE_TYP(List list) { l_OUTSIDE_TYP = list; }
	public void setList_PROC_OUTSIDE_TYP(List list) { l_PROC_OUTSIDE_TYP = list; }
	public void setList_DMY_ITEM_FLG(List list) { l_DMY_ITEM_FLG = list; }
	public void setList_VOLUNT_SPL_FLG(List list) { l_VOLUNT_SPL_FLG = list; }
	public void setList_COST_UP_TYP(List list) { l_COST_UP_TYP = list; }
	public void setList_ONEROUS_CONS_FLG(List list) { l_ONEROUS_CONS_FLG = list; }
	public void setList_UP_LEVEL_NO(List list) { l_UP_LEVEL_NO = list; }
	public void setList_UPPER_ITEM_FLG(List list) { l_UPPER_ITEM_FLG = list; }
	public void setList_LOWER_ITEM_FLG(List list) { l_LOWER_ITEM_FLG = list; }
	public void setList_COST_EXCLUDE_FLG(List list) { l_COST_EXCLUDE_FLG = list; }
	public void setList_CREATED_DATE(List list) { l_CREATED_DATE = list; }
	public void setList_CREATED_BY(List list) { l_CREATED_BY = list; }
	public void setList_CREATED_PRG_NM(List list) { l_CREATED_PRG_NM = list; }
	public void setList_UPDATED_DATE(List list) { l_UPDATED_DATE = list; }
	public void setList_UPDATED_BY(List list) { l_UPDATED_BY = list; }
	public void setList_UPDATED_PRG_NM(List list) { l_UPDATED_PRG_NM = list; }
	public void setList_PROC_COST_CLS_CD(List list) { l_PROC_COST_CLS_CD = list; }
	public void setList_PROC_COST_CLS_NAME(List list) { l_PROC_COST_CLS_NAME = list; }
	public void setList_PROC_COST_UNIT_QTY(List list) { l_PROC_COST_UNIT_QTY = list; }
	public void setList_PROC_COST_UNIT_QTY_UNIT(List list) { l_PROC_COST_UNIT_QTY_UNIT = list; }
	public void setList_OWN_PROC_COST_01(List list) { l_OWN_PROC_COST_01 = list; }
	public void setList_OWN_PROC_COST_02(List list) { l_OWN_PROC_COST_02 = list; }
	public void setList_OWN_PROC_COST_03(List list) { l_OWN_PROC_COST_03 = list; }
	public void setList_OWN_PROC_COST_04(List list) { l_OWN_PROC_COST_04 = list; }
	public void setList_OWN_PROC_COST_05(List list) { l_OWN_PROC_COST_05 = list; }
	public void setList_OWN_PROC_COST_06(List list) { l_OWN_PROC_COST_06 = list; }
	public void setList_OWN_PROC_COST_07(List list) { l_OWN_PROC_COST_07 = list; }
	public void setList_OWN_PROC_COST_08(List list) { l_OWN_PROC_COST_08 = list; }
	public void setList_OWN_PROC_COST_09(List list) { l_OWN_PROC_COST_09 = list; }
	public void setList_OWN_PROC_COST_10(List list) { l_OWN_PROC_COST_10 = list; }
	public void setList_OWN_PROC_COST_11(List list) { l_OWN_PROC_COST_11 = list; }
	public void setList_OWN_PROC_COST_12(List list) { l_OWN_PROC_COST_12 = list; }
	public void setList_OWN_PROC_COST_SUM(List list) { l_OWN_PROC_COST_SUM = list; }
	public void setList_UNDER_PROC_COST_01(List list) { l_UNDER_PROC_COST_01 = list; }
	public void setList_UNDER_PROC_COST_02(List list) { l_UNDER_PROC_COST_02 = list; }
	public void setList_UNDER_PROC_COST_03(List list) { l_UNDER_PROC_COST_03 = list; }
	public void setList_UNDER_PROC_COST_04(List list) { l_UNDER_PROC_COST_04 = list; }
	public void setList_UNDER_PROC_COST_05(List list) { l_UNDER_PROC_COST_05 = list; }
	public void setList_UNDER_PROC_COST_06(List list) { l_UNDER_PROC_COST_06 = list; }
	public void setList_UNDER_PROC_COST_07(List list) { l_UNDER_PROC_COST_07 = list; }
	public void setList_UNDER_PROC_COST_08(List list) { l_UNDER_PROC_COST_08 = list; }
	public void setList_UNDER_PROC_COST_09(List list) { l_UNDER_PROC_COST_09 = list; }
	public void setList_UNDER_PROC_COST_10(List list) { l_UNDER_PROC_COST_10 = list; }
	public void setList_UNDER_PROC_COST_11(List list) { l_UNDER_PROC_COST_11 = list; }
	public void setList_UNDER_PROC_COST_12(List list) { l_UNDER_PROC_COST_12 = list; }
	public void setList_UNDER_PROC_COST_SUM(List list) { l_UNDER_PROC_COST_SUM = list; }
	public void setList_TOTAL_PROC_COST_01(List list) { l_TOTAL_PROC_COST_01 = list; }
	public void setList_TOTAL_PROC_COST_02(List list) { l_TOTAL_PROC_COST_02 = list; }
	public void setList_TOTAL_PROC_COST_03(List list) { l_TOTAL_PROC_COST_03 = list; }
	public void setList_TOTAL_PROC_COST_04(List list) { l_TOTAL_PROC_COST_04 = list; }
	public void setList_TOTAL_PROC_COST_05(List list) { l_TOTAL_PROC_COST_05 = list; }
	public void setList_TOTAL_PROC_COST_06(List list) { l_TOTAL_PROC_COST_06 = list; }
	public void setList_TOTAL_PROC_COST_07(List list) { l_TOTAL_PROC_COST_07 = list; }
	public void setList_TOTAL_PROC_COST_08(List list) { l_TOTAL_PROC_COST_08 = list; }
	public void setList_TOTAL_PROC_COST_09(List list) { l_TOTAL_PROC_COST_09 = list; }
	public void setList_TOTAL_PROC_COST_10(List list) { l_TOTAL_PROC_COST_10 = list; }
	public void setList_TOTAL_PROC_COST_11(List list) { l_TOTAL_PROC_COST_11 = list; }
	public void setList_TOTAL_PROC_COST_12(List list) { l_TOTAL_PROC_COST_12 = list; }
	public void setList_TOTAL_PROC_COST_SUM(List list) { l_TOTAL_PROC_COST_SUM = list; }
	public void setList_PROC_COST_01_NAME(List list) { l_PROC_COST_01_NAME = list; }
	public void setList_PROC_COST_02_NAME(List list) { l_PROC_COST_02_NAME = list; }
	public void setList_PROC_COST_03_NAME(List list) { l_PROC_COST_03_NAME = list; }
	public void setList_PROC_COST_04_NAME(List list) { l_PROC_COST_04_NAME = list; }
	public void setList_PROC_COST_05_NAME(List list) { l_PROC_COST_05_NAME = list; }
	public void setList_PROC_COST_06_NAME(List list) { l_PROC_COST_06_NAME = list; }
	public void setList_PROC_COST_07_NAME(List list) { l_PROC_COST_07_NAME = list; }
	public void setList_PROC_COST_08_NAME(List list) { l_PROC_COST_08_NAME = list; }
	public void setList_PROC_COST_09_NAME(List list) { l_PROC_COST_09_NAME = list; }
	public void setList_PROC_COST_10_NAME(List list) { l_PROC_COST_10_NAME = list; }
	public void setList_PROC_COST_11_NAME(List list) { l_PROC_COST_11_NAME = list; }
	public void setList_PROC_COST_12_NAME(List list) { l_PROC_COST_12_NAME = list; }
	public void setList_HALF_TERM_TYP_DN(List list) { l_HALF_TERM_TYP_DN = list; }
	public void setList_PUCH_ITEM_CD(List list) { l_PUCH_ITEM_CD = list; }
	public void setList_PUCH_CS_PROC_CD(List list) { l_PUCH_CS_PROC_CD = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_UNIT_COST(List list) { l_UNIT_COST = list; }
	public void setList_UNIT_COST_TYP_DN(List list) { l_UNIT_COST_TYP_DN = list; }
	public void setList_CUR_UNIT(List list) { l_CUR_UNIT = list; }
	public void setList_EXCH_RATE(List list) { l_EXCH_RATE = list; }
	public void setList_HOME_CUR_UNIT_COST(List list) { l_HOME_CUR_UNIT_COST = list; }
	public void setList_PUCH_UNIT_QTY(List list) { l_PUCH_UNIT_QTY = list; }
	public void setList_SUB_VEND_CD(List list) { l_SUB_VEND_CD = list; }
	public void setList_SUB_UNIT_COST(List list) { l_SUB_UNIT_COST = list; }
	public void setList_SUB_UNIT_COST_TYP_DN(List list) { l_SUB_UNIT_COST_TYP_DN = list; }
	public void setList_SUB_CUR_UNIT(List list) { l_SUB_CUR_UNIT = list; }
	public void setList_SUB_EXCH_RATE(List list) { l_SUB_EXCH_RATE = list; }
	public void setList_SUB_HOME_CUR_UNIT_COST(List list) { l_SUB_HOME_CUR_UNIT_COST = list; }
	public void setList_SUB_PUCH_UNIT_QTY(List list) { l_SUB_PUCH_UNIT_QTY = list; }
	public void setList_PUCH_STOCK_UNIT(List list) { l_PUCH_STOCK_UNIT = list; }
	public void setList_UNIT_COST_ACCEPT_TYP_DN(List list) { l_UNIT_COST_ACCEPT_TYP_DN = list; }
	public void setList_CS_PUCH_TYP_DN(List list) { l_CS_PUCH_TYP_DN = list; }
	public void setList_PROC_VEND_CD(List list) { l_PROC_VEND_CD = list; }
	public void setList_PROC_ORG_CD(List list) { l_PROC_ORG_CD = list; }
	public void setList_PUCH_UNIT_COST(List list) { l_PUCH_UNIT_COST = list; }
	public void setList_PUCH_PUCH_UNIT_QTY(List list) { l_PUCH_PUCH_UNIT_QTY = list; }
	public void setList_SBCNT_UNIT_COST(List list) { l_SBCNT_UNIT_COST = list; }
	public void setList_SBCNT_PUCH_UNIT_QTY(List list) { l_SBCNT_PUCH_UNIT_QTY = list; }
	public void setList_PROC_COST_01(List list) { l_PROC_COST_01 = list; }
	public void setList_PROC_COST_02(List list) { l_PROC_COST_02 = list; }
	public void setList_PROC_COST_03(List list) { l_PROC_COST_03 = list; }
	public void setList_PROC_COST_04(List list) { l_PROC_COST_04 = list; }
	public void setList_PROC_COST_05(List list) { l_PROC_COST_05 = list; }
	public void setList_PROC_COST_06(List list) { l_PROC_COST_06 = list; }
	public void setList_PROC_COST_07(List list) { l_PROC_COST_07 = list; }
	public void setList_PROC_COST_08(List list) { l_PROC_COST_08 = list; }
	public void setList_PROC_COST_09(List list) { l_PROC_COST_09 = list; }
	public void setList_PROC_COST_10(List list) { l_PROC_COST_10 = list; }
	public void setList_PROC_COST_11(List list) { l_PROC_COST_11 = list; }
	public void setList_PROC_COST_12(List list) { l_PROC_COST_12 = list; }
	public void setList_PROC_COST_STOCK_UNIT(List list) { l_PROC_COST_STOCK_UNIT = list; }
	public void setList_CS_PUCH_TYP_VALUE(List list) { l_CS_PUCH_TYP_VALUE = list; }
	public void setList_CURRENT_YEAR(List list) { l_CURRENT_YEAR = list; }
	public void setList_l_COUNT(List list) { l_l_COUNT = list; }
	public void setList_ROW_COUNT(List list) { l_ROW_COUNT = list; }

	public int setL2L_HALF_TERM_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HALF_TERM_TYP_name == null) {
			l_HALF_TERM_TYP_name = new ArrayList();
		} else {
			l_HALF_TERM_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HALF_TERM_TYP_name.add(((DD0030010Struct) list.get(i)).getHALF_TERM_TYP_name());
		}
		return size;
	}
	public int setL2L_HALF_TERM_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HALF_TERM_TYP_val == null) {
			l_HALF_TERM_TYP_val = new ArrayList();
		} else {
			l_HALF_TERM_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HALF_TERM_TYP_val.add(((DD0030010Struct) list.get(i)).getHALF_TERM_TYP_val());
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
			l_DOWNLOAD_FILE.add(((DD0030010Struct) list.get(i)).getDOWNLOAD_FILE());
		}
		return size;
	}
	public int setL2L_COST_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COST_TYP_DN == null) {
			l_COST_TYP_DN = new ArrayList();
		} else {
			l_COST_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COST_TYP_DN.add(((DD0030010Struct) list.get(i)).getCOST_TYP_DN());
		}
		return size;
	}
	public int setL2L_OUTSIDE_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OUTSIDE_TYP_DN == null) {
			l_OUTSIDE_TYP_DN = new ArrayList();
		} else {
			l_OUTSIDE_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OUTSIDE_TYP_DN.add(((DD0030010Struct) list.get(i)).getOUTSIDE_TYP_DN());
		}
		return size;
	}
	public int setL2L_PROC_OUTSIDE_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_OUTSIDE_TYP_DN == null) {
			l_PROC_OUTSIDE_TYP_DN = new ArrayList();
		} else {
			l_PROC_OUTSIDE_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_OUTSIDE_TYP_DN.add(((DD0030010Struct) list.get(i)).getPROC_OUTSIDE_TYP_DN());
		}
		return size;
	}
	public int setL2L_DMY_ITEM_FLG_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DMY_ITEM_FLG_DN == null) {
			l_DMY_ITEM_FLG_DN = new ArrayList();
		} else {
			l_DMY_ITEM_FLG_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DMY_ITEM_FLG_DN.add(((DD0030010Struct) list.get(i)).getDMY_ITEM_FLG_DN());
		}
		return size;
	}
	public int setL2L_VOLUNT_SPL_FLG_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VOLUNT_SPL_FLG_DN == null) {
			l_VOLUNT_SPL_FLG_DN = new ArrayList();
		} else {
			l_VOLUNT_SPL_FLG_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VOLUNT_SPL_FLG_DN.add(((DD0030010Struct) list.get(i)).getVOLUNT_SPL_FLG_DN());
		}
		return size;
	}
	public int setL2L_COST_UP_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COST_UP_TYP_DN == null) {
			l_COST_UP_TYP_DN = new ArrayList();
		} else {
			l_COST_UP_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COST_UP_TYP_DN.add(((DD0030010Struct) list.get(i)).getCOST_UP_TYP_DN());
		}
		return size;
	}
	public int setL2L_ONEROUS_CONS_FLG_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ONEROUS_CONS_FLG_DN == null) {
			l_ONEROUS_CONS_FLG_DN = new ArrayList();
		} else {
			l_ONEROUS_CONS_FLG_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ONEROUS_CONS_FLG_DN.add(((DD0030010Struct) list.get(i)).getONEROUS_CONS_FLG_DN());
		}
		return size;
	}
	public int setL2L_UPPER_ITEM_FLG_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UPPER_ITEM_FLG_DN == null) {
			l_UPPER_ITEM_FLG_DN = new ArrayList();
		} else {
			l_UPPER_ITEM_FLG_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UPPER_ITEM_FLG_DN.add(((DD0030010Struct) list.get(i)).getUPPER_ITEM_FLG_DN());
		}
		return size;
	}
	public int setL2L_LOWER_ITEM_FLG_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOWER_ITEM_FLG_DN == null) {
			l_LOWER_ITEM_FLG_DN = new ArrayList();
		} else {
			l_LOWER_ITEM_FLG_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOWER_ITEM_FLG_DN.add(((DD0030010Struct) list.get(i)).getLOWER_ITEM_FLG_DN());
		}
		return size;
	}
	public int setL2L_COST_EXCLUDE_FLG_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COST_EXCLUDE_FLG_DN == null) {
			l_COST_EXCLUDE_FLG_DN = new ArrayList();
		} else {
			l_COST_EXCLUDE_FLG_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COST_EXCLUDE_FLG_DN.add(((DD0030010Struct) list.get(i)).getCOST_EXCLUDE_FLG_DN());
		}
		return size;
	}
	public int setL2L_l_ROOT_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ROOT_ITEM_CD == null) {
			l_l_ROOT_ITEM_CD = new ArrayList();
		} else {
			l_l_ROOT_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ROOT_ITEM_CD.add(((DD0030010Struct) list.get(i)).getl_ROOT_ITEM_CD());
		}
		return size;
	}
	public int setL2L_l_ROOT_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ROOT_ITEM_NAME == null) {
			l_l_ROOT_ITEM_NAME = new ArrayList();
		} else {
			l_l_ROOT_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ROOT_ITEM_NAME.add(((DD0030010Struct) list.get(i)).getl_ROOT_ITEM_NAME());
		}
		return size;
	}
	public int setL2L_l_CLASIFICATION_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_CLASIFICATION_CD == null) {
			l_l_CLASIFICATION_CD = new ArrayList();
		} else {
			l_l_CLASIFICATION_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_CLASIFICATION_CD.add(((DD0030010Struct) list.get(i)).getl_CLASIFICATION_CD());
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
			l_l_CS_PROC_CD.add(((DD0030010Struct) list.get(i)).getl_CS_PROC_CD());
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
			l_l_CS_PROC_NAME.add(((DD0030010Struct) list.get(i)).getl_CS_PROC_NAME());
		}
		return size;
	}
	public int setL2L_l_NECESSARY_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_NECESSARY_QTY == null) {
			l_l_NECESSARY_QTY = new ArrayList();
		} else {
			l_l_NECESSARY_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_NECESSARY_QTY.add(((DD0030010Struct) list.get(i)).getl_NECESSARY_QTY());
		}
		return size;
	}
	public int setL2L_l_STOCK_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_STOCK_UNIT == null) {
			l_l_STOCK_UNIT = new ArrayList();
		} else {
			l_l_STOCK_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_STOCK_UNIT.add(((DD0030010Struct) list.get(i)).getl_STOCK_UNIT());
		}
		return size;
	}
	public int setL2L_l_ITEM_INPUT_RATIO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_ITEM_INPUT_RATIO == null) {
			l_l_ITEM_INPUT_RATIO = new ArrayList();
		} else {
			l_l_ITEM_INPUT_RATIO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_ITEM_INPUT_RATIO.add(((DD0030010Struct) list.get(i)).getl_ITEM_INPUT_RATIO());
		}
		return size;
	}
	public int setL2L_l_HOME_CUR_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_HOME_CUR_UNIT == null) {
			l_l_HOME_CUR_UNIT = new ArrayList();
		} else {
			l_l_HOME_CUR_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_HOME_CUR_UNIT.add(((DD0030010Struct) list.get(i)).getl_HOME_CUR_UNIT());
		}
		return size;
	}
	public int setL2L_l_TOTAL_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_TOTAL_COST == null) {
			l_l_TOTAL_COST = new ArrayList();
		} else {
			l_l_TOTAL_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_TOTAL_COST.add(((DD0030010Struct) list.get(i)).getl_TOTAL_COST());
		}
		return size;
	}
	public int setL2L_l_TOTAL_MATR_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_TOTAL_MATR_COST == null) {
			l_l_TOTAL_MATR_COST = new ArrayList();
		} else {
			l_l_TOTAL_MATR_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_TOTAL_MATR_COST.add(((DD0030010Struct) list.get(i)).getl_TOTAL_MATR_COST());
		}
		return size;
	}
	public int setL2L_l_TOTAL_SBCNT_MATR_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_TOTAL_SBCNT_MATR_COST == null) {
			l_l_TOTAL_SBCNT_MATR_COST = new ArrayList();
		} else {
			l_l_TOTAL_SBCNT_MATR_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_TOTAL_SBCNT_MATR_COST.add(((DD0030010Struct) list.get(i)).getl_TOTAL_SBCNT_MATR_COST());
		}
		return size;
	}
	public int setL2L_l_TOTAL_PROC_COST_SUM_ALL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_TOTAL_PROC_COST_SUM_ALL == null) {
			l_l_TOTAL_PROC_COST_SUM_ALL = new ArrayList();
		} else {
			l_l_TOTAL_PROC_COST_SUM_ALL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_TOTAL_PROC_COST_SUM_ALL.add(((DD0030010Struct) list.get(i)).getl_TOTAL_PROC_COST_SUM_ALL());
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
			l_PLANT_CD.add(((DD0030010Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_YEAR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_YEAR == null) {
			l_YEAR = new ArrayList();
		} else {
			l_YEAR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_YEAR.add(((DD0030010Struct) list.get(i)).getYEAR());
		}
		return size;
	}
	public int setL2L_HALF_TERM_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HALF_TERM_TYP == null) {
			l_HALF_TERM_TYP = new ArrayList();
		} else {
			l_HALF_TERM_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HALF_TERM_TYP.add(((DD0030010Struct) list.get(i)).getHALF_TERM_TYP());
		}
		return size;
	}
	public int setL2L_ROOT_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ROOT_ITEM_CD == null) {
			l_ROOT_ITEM_CD = new ArrayList();
		} else {
			l_ROOT_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ROOT_ITEM_CD.add(((DD0030010Struct) list.get(i)).getROOT_ITEM_CD());
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
			l_CLASIFICATION_CD.add(((DD0030010Struct) list.get(i)).getCLASIFICATION_CD());
		}
		return size;
	}
	public int setL2L_COST_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COST_TYP == null) {
			l_COST_TYP = new ArrayList();
		} else {
			l_COST_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COST_TYP.add(((DD0030010Struct) list.get(i)).getCOST_TYP());
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
			l_PLANT_NAME.add(((DD0030010Struct) list.get(i)).getPLANT_NAME());
		}
		return size;
	}
	public int setL2L_ROOT_ITEM_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ROOT_ITEM_NAME == null) {
			l_ROOT_ITEM_NAME = new ArrayList();
		} else {
			l_ROOT_ITEM_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ROOT_ITEM_NAME.add(((DD0030010Struct) list.get(i)).getROOT_ITEM_NAME());
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
			l_PARENT_ITEM_CD.add(((DD0030010Struct) list.get(i)).getPARENT_ITEM_CD());
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
			l_PARENT_ITEM_NAME.add(((DD0030010Struct) list.get(i)).getPARENT_ITEM_NAME());
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
			l_ITEM_CD.add(((DD0030010Struct) list.get(i)).getITEM_CD());
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
			l_ITEM_NAME.add(((DD0030010Struct) list.get(i)).getITEM_NAME());
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
			l_PS_EDITION.add(((DD0030010Struct) list.get(i)).getPS_EDITION());
		}
		return size;
	}
	public int setL2L_COST_STATEMENT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COST_STATEMENT_NO == null) {
			l_COST_STATEMENT_NO = new ArrayList();
		} else {
			l_COST_STATEMENT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COST_STATEMENT_NO.add(((DD0030010Struct) list.get(i)).getCOST_STATEMENT_NO());
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
			l_CS_PROC_CD.add(((DD0030010Struct) list.get(i)).getCS_PROC_CD());
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
			l_CS_PROC_NAME.add(((DD0030010Struct) list.get(i)).getCS_PROC_NAME());
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
			l_WS_CD.add(((DD0030010Struct) list.get(i)).getWS_CD());
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
			l_WS_NAME.add(((DD0030010Struct) list.get(i)).getWS_NAME());
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
			l_ORG_CD.add(((DD0030010Struct) list.get(i)).getORG_CD());
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
			l_ORG_NAME.add(((DD0030010Struct) list.get(i)).getORG_NAME());
		}
		return size;
	}
	public int setL2L_NECESSARY_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NECESSARY_QTY == null) {
			l_NECESSARY_QTY = new ArrayList();
		} else {
			l_NECESSARY_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NECESSARY_QTY.add(((DD0030010Struct) list.get(i)).getNECESSARY_QTY());
		}
		return size;
	}
	public int setL2L_PS_INPUT_RATIO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PS_INPUT_RATIO == null) {
			l_PS_INPUT_RATIO = new ArrayList();
		} else {
			l_PS_INPUT_RATIO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PS_INPUT_RATIO.add(((DD0030010Struct) list.get(i)).getPS_INPUT_RATIO());
		}
		return size;
	}
	public int setL2L_ITEM_INPUT_RATIO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_INPUT_RATIO == null) {
			l_ITEM_INPUT_RATIO = new ArrayList();
		} else {
			l_ITEM_INPUT_RATIO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_INPUT_RATIO.add(((DD0030010Struct) list.get(i)).getITEM_INPUT_RATIO());
		}
		return size;
	}
	public int setL2L_TOTAL_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TOTAL_COST == null) {
			l_TOTAL_COST = new ArrayList();
		} else {
			l_TOTAL_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TOTAL_COST.add(((DD0030010Struct) list.get(i)).getTOTAL_COST());
		}
		return size;
	}
	public int setL2L_OWN_MATR_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OWN_MATR_COST == null) {
			l_OWN_MATR_COST = new ArrayList();
		} else {
			l_OWN_MATR_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OWN_MATR_COST.add(((DD0030010Struct) list.get(i)).getOWN_MATR_COST());
		}
		return size;
	}
	public int setL2L_UNDER_MATR_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNDER_MATR_COST == null) {
			l_UNDER_MATR_COST = new ArrayList();
		} else {
			l_UNDER_MATR_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNDER_MATR_COST.add(((DD0030010Struct) list.get(i)).getUNDER_MATR_COST());
		}
		return size;
	}
	public int setL2L_TOTAL_MATR_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TOTAL_MATR_COST == null) {
			l_TOTAL_MATR_COST = new ArrayList();
		} else {
			l_TOTAL_MATR_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TOTAL_MATR_COST.add(((DD0030010Struct) list.get(i)).getTOTAL_MATR_COST());
		}
		return size;
	}
	public int setL2L_OWN_SBCNT_MATR_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OWN_SBCNT_MATR_COST == null) {
			l_OWN_SBCNT_MATR_COST = new ArrayList();
		} else {
			l_OWN_SBCNT_MATR_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OWN_SBCNT_MATR_COST.add(((DD0030010Struct) list.get(i)).getOWN_SBCNT_MATR_COST());
		}
		return size;
	}
	public int setL2L_UNDER_SBCNT_MATR_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNDER_SBCNT_MATR_COST == null) {
			l_UNDER_SBCNT_MATR_COST = new ArrayList();
		} else {
			l_UNDER_SBCNT_MATR_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNDER_SBCNT_MATR_COST.add(((DD0030010Struct) list.get(i)).getUNDER_SBCNT_MATR_COST());
		}
		return size;
	}
	public int setL2L_TOTAL_SBCNT_MATR_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TOTAL_SBCNT_MATR_COST == null) {
			l_TOTAL_SBCNT_MATR_COST = new ArrayList();
		} else {
			l_TOTAL_SBCNT_MATR_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TOTAL_SBCNT_MATR_COST.add(((DD0030010Struct) list.get(i)).getTOTAL_SBCNT_MATR_COST());
		}
		return size;
	}
	public int setL2L_OWN_PROC_COST_SUM_ALL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OWN_PROC_COST_SUM_ALL == null) {
			l_OWN_PROC_COST_SUM_ALL = new ArrayList();
		} else {
			l_OWN_PROC_COST_SUM_ALL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OWN_PROC_COST_SUM_ALL.add(((DD0030010Struct) list.get(i)).getOWN_PROC_COST_SUM_ALL());
		}
		return size;
	}
	public int setL2L_UNDER_PROC_COST_SUM_ALL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNDER_PROC_COST_SUM_ALL == null) {
			l_UNDER_PROC_COST_SUM_ALL = new ArrayList();
		} else {
			l_UNDER_PROC_COST_SUM_ALL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNDER_PROC_COST_SUM_ALL.add(((DD0030010Struct) list.get(i)).getUNDER_PROC_COST_SUM_ALL());
		}
		return size;
	}
	public int setL2L_TOTAL_PROC_COST_SUM_ALL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TOTAL_PROC_COST_SUM_ALL == null) {
			l_TOTAL_PROC_COST_SUM_ALL = new ArrayList();
		} else {
			l_TOTAL_PROC_COST_SUM_ALL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TOTAL_PROC_COST_SUM_ALL.add(((DD0030010Struct) list.get(i)).getTOTAL_PROC_COST_SUM_ALL());
		}
		return size;
	}
	public int setL2L_HOME_CUR_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HOME_CUR_UNIT == null) {
			l_HOME_CUR_UNIT = new ArrayList();
		} else {
			l_HOME_CUR_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HOME_CUR_UNIT.add(((DD0030010Struct) list.get(i)).getHOME_CUR_UNIT());
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
			l_EFF_PHASE_IN_DATE.add(((DD0030010Struct) list.get(i)).getEFF_PHASE_IN_DATE());
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
			l_EFF_PHASE_OUT_DATE.add(((DD0030010Struct) list.get(i)).getEFF_PHASE_OUT_DATE());
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
			l_PS_UNIT_DENOMINATOR.add(((DD0030010Struct) list.get(i)).getPS_UNIT_DENOMINATOR());
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
			l_PS_UNIT_NUMERATOR.add(((DD0030010Struct) list.get(i)).getPS_UNIT_NUMERATOR());
		}
		return size;
	}
	public int setL2L_PARENT_COST_STATEMENT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PARENT_COST_STATEMENT_NO == null) {
			l_PARENT_COST_STATEMENT_NO = new ArrayList();
		} else {
			l_PARENT_COST_STATEMENT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PARENT_COST_STATEMENT_NO.add(((DD0030010Struct) list.get(i)).getPARENT_COST_STATEMENT_NO());
		}
		return size;
	}
	public int setL2L_PARENT_ITEM_STOCK_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PARENT_ITEM_STOCK_UNIT == null) {
			l_PARENT_ITEM_STOCK_UNIT = new ArrayList();
		} else {
			l_PARENT_ITEM_STOCK_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PARENT_ITEM_STOCK_UNIT.add(((DD0030010Struct) list.get(i)).getPARENT_ITEM_STOCK_UNIT());
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
			l_STOCK_UNIT.add(((DD0030010Struct) list.get(i)).getSTOCK_UNIT());
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
			l_OUTSIDE_TYP.add(((DD0030010Struct) list.get(i)).getOUTSIDE_TYP());
		}
		return size;
	}
	public int setL2L_PROC_OUTSIDE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_OUTSIDE_TYP == null) {
			l_PROC_OUTSIDE_TYP = new ArrayList();
		} else {
			l_PROC_OUTSIDE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_OUTSIDE_TYP.add(((DD0030010Struct) list.get(i)).getPROC_OUTSIDE_TYP());
		}
		return size;
	}
	public int setL2L_DMY_ITEM_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DMY_ITEM_FLG == null) {
			l_DMY_ITEM_FLG = new ArrayList();
		} else {
			l_DMY_ITEM_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DMY_ITEM_FLG.add(((DD0030010Struct) list.get(i)).getDMY_ITEM_FLG());
		}
		return size;
	}
	public int setL2L_VOLUNT_SPL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VOLUNT_SPL_FLG == null) {
			l_VOLUNT_SPL_FLG = new ArrayList();
		} else {
			l_VOLUNT_SPL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VOLUNT_SPL_FLG.add(((DD0030010Struct) list.get(i)).getVOLUNT_SPL_FLG());
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
			l_COST_UP_TYP.add(((DD0030010Struct) list.get(i)).getCOST_UP_TYP());
		}
		return size;
	}
	public int setL2L_ONEROUS_CONS_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ONEROUS_CONS_FLG == null) {
			l_ONEROUS_CONS_FLG = new ArrayList();
		} else {
			l_ONEROUS_CONS_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ONEROUS_CONS_FLG.add(((DD0030010Struct) list.get(i)).getONEROUS_CONS_FLG());
		}
		return size;
	}
	public int setL2L_UP_LEVEL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UP_LEVEL_NO == null) {
			l_UP_LEVEL_NO = new ArrayList();
		} else {
			l_UP_LEVEL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UP_LEVEL_NO.add(((DD0030010Struct) list.get(i)).getUP_LEVEL_NO());
		}
		return size;
	}
	public int setL2L_UPPER_ITEM_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UPPER_ITEM_FLG == null) {
			l_UPPER_ITEM_FLG = new ArrayList();
		} else {
			l_UPPER_ITEM_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UPPER_ITEM_FLG.add(((DD0030010Struct) list.get(i)).getUPPER_ITEM_FLG());
		}
		return size;
	}
	public int setL2L_LOWER_ITEM_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOWER_ITEM_FLG == null) {
			l_LOWER_ITEM_FLG = new ArrayList();
		} else {
			l_LOWER_ITEM_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOWER_ITEM_FLG.add(((DD0030010Struct) list.get(i)).getLOWER_ITEM_FLG());
		}
		return size;
	}
	public int setL2L_COST_EXCLUDE_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_COST_EXCLUDE_FLG == null) {
			l_COST_EXCLUDE_FLG = new ArrayList();
		} else {
			l_COST_EXCLUDE_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_COST_EXCLUDE_FLG.add(((DD0030010Struct) list.get(i)).getCOST_EXCLUDE_FLG());
		}
		return size;
	}
	public int setL2L_CREATED_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CREATED_DATE == null) {
			l_CREATED_DATE = new ArrayList();
		} else {
			l_CREATED_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CREATED_DATE.add(((DD0030010Struct) list.get(i)).getCREATED_DATE());
		}
		return size;
	}
	public int setL2L_CREATED_BY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CREATED_BY == null) {
			l_CREATED_BY = new ArrayList();
		} else {
			l_CREATED_BY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CREATED_BY.add(((DD0030010Struct) list.get(i)).getCREATED_BY());
		}
		return size;
	}
	public int setL2L_CREATED_PRG_NM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CREATED_PRG_NM == null) {
			l_CREATED_PRG_NM = new ArrayList();
		} else {
			l_CREATED_PRG_NM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CREATED_PRG_NM.add(((DD0030010Struct) list.get(i)).getCREATED_PRG_NM());
		}
		return size;
	}
	public int setL2L_UPDATED_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UPDATED_DATE == null) {
			l_UPDATED_DATE = new ArrayList();
		} else {
			l_UPDATED_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UPDATED_DATE.add(((DD0030010Struct) list.get(i)).getUPDATED_DATE());
		}
		return size;
	}
	public int setL2L_UPDATED_BY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UPDATED_BY == null) {
			l_UPDATED_BY = new ArrayList();
		} else {
			l_UPDATED_BY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UPDATED_BY.add(((DD0030010Struct) list.get(i)).getUPDATED_BY());
		}
		return size;
	}
	public int setL2L_UPDATED_PRG_NM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UPDATED_PRG_NM == null) {
			l_UPDATED_PRG_NM = new ArrayList();
		} else {
			l_UPDATED_PRG_NM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UPDATED_PRG_NM.add(((DD0030010Struct) list.get(i)).getUPDATED_PRG_NM());
		}
		return size;
	}
	public int setL2L_PROC_COST_CLS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_CLS_CD == null) {
			l_PROC_COST_CLS_CD = new ArrayList();
		} else {
			l_PROC_COST_CLS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_CLS_CD.add(((DD0030010Struct) list.get(i)).getPROC_COST_CLS_CD());
		}
		return size;
	}
	public int setL2L_PROC_COST_CLS_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_CLS_NAME == null) {
			l_PROC_COST_CLS_NAME = new ArrayList();
		} else {
			l_PROC_COST_CLS_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_CLS_NAME.add(((DD0030010Struct) list.get(i)).getPROC_COST_CLS_NAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_UNIT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_UNIT_QTY == null) {
			l_PROC_COST_UNIT_QTY = new ArrayList();
		} else {
			l_PROC_COST_UNIT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_UNIT_QTY.add(((DD0030010Struct) list.get(i)).getPROC_COST_UNIT_QTY());
		}
		return size;
	}
	public int setL2L_PROC_COST_UNIT_QTY_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_UNIT_QTY_UNIT == null) {
			l_PROC_COST_UNIT_QTY_UNIT = new ArrayList();
		} else {
			l_PROC_COST_UNIT_QTY_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_UNIT_QTY_UNIT.add(((DD0030010Struct) list.get(i)).getPROC_COST_UNIT_QTY_UNIT());
		}
		return size;
	}
	public int setL2L_OWN_PROC_COST_01(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OWN_PROC_COST_01 == null) {
			l_OWN_PROC_COST_01 = new ArrayList();
		} else {
			l_OWN_PROC_COST_01.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OWN_PROC_COST_01.add(((DD0030010Struct) list.get(i)).getOWN_PROC_COST_01());
		}
		return size;
	}
	public int setL2L_OWN_PROC_COST_02(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OWN_PROC_COST_02 == null) {
			l_OWN_PROC_COST_02 = new ArrayList();
		} else {
			l_OWN_PROC_COST_02.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OWN_PROC_COST_02.add(((DD0030010Struct) list.get(i)).getOWN_PROC_COST_02());
		}
		return size;
	}
	public int setL2L_OWN_PROC_COST_03(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OWN_PROC_COST_03 == null) {
			l_OWN_PROC_COST_03 = new ArrayList();
		} else {
			l_OWN_PROC_COST_03.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OWN_PROC_COST_03.add(((DD0030010Struct) list.get(i)).getOWN_PROC_COST_03());
		}
		return size;
	}
	public int setL2L_OWN_PROC_COST_04(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OWN_PROC_COST_04 == null) {
			l_OWN_PROC_COST_04 = new ArrayList();
		} else {
			l_OWN_PROC_COST_04.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OWN_PROC_COST_04.add(((DD0030010Struct) list.get(i)).getOWN_PROC_COST_04());
		}
		return size;
	}
	public int setL2L_OWN_PROC_COST_05(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OWN_PROC_COST_05 == null) {
			l_OWN_PROC_COST_05 = new ArrayList();
		} else {
			l_OWN_PROC_COST_05.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OWN_PROC_COST_05.add(((DD0030010Struct) list.get(i)).getOWN_PROC_COST_05());
		}
		return size;
	}
	public int setL2L_OWN_PROC_COST_06(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OWN_PROC_COST_06 == null) {
			l_OWN_PROC_COST_06 = new ArrayList();
		} else {
			l_OWN_PROC_COST_06.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OWN_PROC_COST_06.add(((DD0030010Struct) list.get(i)).getOWN_PROC_COST_06());
		}
		return size;
	}
	public int setL2L_OWN_PROC_COST_07(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OWN_PROC_COST_07 == null) {
			l_OWN_PROC_COST_07 = new ArrayList();
		} else {
			l_OWN_PROC_COST_07.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OWN_PROC_COST_07.add(((DD0030010Struct) list.get(i)).getOWN_PROC_COST_07());
		}
		return size;
	}
	public int setL2L_OWN_PROC_COST_08(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OWN_PROC_COST_08 == null) {
			l_OWN_PROC_COST_08 = new ArrayList();
		} else {
			l_OWN_PROC_COST_08.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OWN_PROC_COST_08.add(((DD0030010Struct) list.get(i)).getOWN_PROC_COST_08());
		}
		return size;
	}
	public int setL2L_OWN_PROC_COST_09(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OWN_PROC_COST_09 == null) {
			l_OWN_PROC_COST_09 = new ArrayList();
		} else {
			l_OWN_PROC_COST_09.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OWN_PROC_COST_09.add(((DD0030010Struct) list.get(i)).getOWN_PROC_COST_09());
		}
		return size;
	}
	public int setL2L_OWN_PROC_COST_10(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OWN_PROC_COST_10 == null) {
			l_OWN_PROC_COST_10 = new ArrayList();
		} else {
			l_OWN_PROC_COST_10.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OWN_PROC_COST_10.add(((DD0030010Struct) list.get(i)).getOWN_PROC_COST_10());
		}
		return size;
	}
	public int setL2L_OWN_PROC_COST_11(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OWN_PROC_COST_11 == null) {
			l_OWN_PROC_COST_11 = new ArrayList();
		} else {
			l_OWN_PROC_COST_11.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OWN_PROC_COST_11.add(((DD0030010Struct) list.get(i)).getOWN_PROC_COST_11());
		}
		return size;
	}
	public int setL2L_OWN_PROC_COST_12(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OWN_PROC_COST_12 == null) {
			l_OWN_PROC_COST_12 = new ArrayList();
		} else {
			l_OWN_PROC_COST_12.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OWN_PROC_COST_12.add(((DD0030010Struct) list.get(i)).getOWN_PROC_COST_12());
		}
		return size;
	}
	public int setL2L_OWN_PROC_COST_SUM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OWN_PROC_COST_SUM == null) {
			l_OWN_PROC_COST_SUM = new ArrayList();
		} else {
			l_OWN_PROC_COST_SUM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OWN_PROC_COST_SUM.add(((DD0030010Struct) list.get(i)).getOWN_PROC_COST_SUM());
		}
		return size;
	}
	public int setL2L_UNDER_PROC_COST_01(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNDER_PROC_COST_01 == null) {
			l_UNDER_PROC_COST_01 = new ArrayList();
		} else {
			l_UNDER_PROC_COST_01.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNDER_PROC_COST_01.add(((DD0030010Struct) list.get(i)).getUNDER_PROC_COST_01());
		}
		return size;
	}
	public int setL2L_UNDER_PROC_COST_02(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNDER_PROC_COST_02 == null) {
			l_UNDER_PROC_COST_02 = new ArrayList();
		} else {
			l_UNDER_PROC_COST_02.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNDER_PROC_COST_02.add(((DD0030010Struct) list.get(i)).getUNDER_PROC_COST_02());
		}
		return size;
	}
	public int setL2L_UNDER_PROC_COST_03(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNDER_PROC_COST_03 == null) {
			l_UNDER_PROC_COST_03 = new ArrayList();
		} else {
			l_UNDER_PROC_COST_03.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNDER_PROC_COST_03.add(((DD0030010Struct) list.get(i)).getUNDER_PROC_COST_03());
		}
		return size;
	}
	public int setL2L_UNDER_PROC_COST_04(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNDER_PROC_COST_04 == null) {
			l_UNDER_PROC_COST_04 = new ArrayList();
		} else {
			l_UNDER_PROC_COST_04.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNDER_PROC_COST_04.add(((DD0030010Struct) list.get(i)).getUNDER_PROC_COST_04());
		}
		return size;
	}
	public int setL2L_UNDER_PROC_COST_05(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNDER_PROC_COST_05 == null) {
			l_UNDER_PROC_COST_05 = new ArrayList();
		} else {
			l_UNDER_PROC_COST_05.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNDER_PROC_COST_05.add(((DD0030010Struct) list.get(i)).getUNDER_PROC_COST_05());
		}
		return size;
	}
	public int setL2L_UNDER_PROC_COST_06(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNDER_PROC_COST_06 == null) {
			l_UNDER_PROC_COST_06 = new ArrayList();
		} else {
			l_UNDER_PROC_COST_06.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNDER_PROC_COST_06.add(((DD0030010Struct) list.get(i)).getUNDER_PROC_COST_06());
		}
		return size;
	}
	public int setL2L_UNDER_PROC_COST_07(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNDER_PROC_COST_07 == null) {
			l_UNDER_PROC_COST_07 = new ArrayList();
		} else {
			l_UNDER_PROC_COST_07.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNDER_PROC_COST_07.add(((DD0030010Struct) list.get(i)).getUNDER_PROC_COST_07());
		}
		return size;
	}
	public int setL2L_UNDER_PROC_COST_08(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNDER_PROC_COST_08 == null) {
			l_UNDER_PROC_COST_08 = new ArrayList();
		} else {
			l_UNDER_PROC_COST_08.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNDER_PROC_COST_08.add(((DD0030010Struct) list.get(i)).getUNDER_PROC_COST_08());
		}
		return size;
	}
	public int setL2L_UNDER_PROC_COST_09(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNDER_PROC_COST_09 == null) {
			l_UNDER_PROC_COST_09 = new ArrayList();
		} else {
			l_UNDER_PROC_COST_09.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNDER_PROC_COST_09.add(((DD0030010Struct) list.get(i)).getUNDER_PROC_COST_09());
		}
		return size;
	}
	public int setL2L_UNDER_PROC_COST_10(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNDER_PROC_COST_10 == null) {
			l_UNDER_PROC_COST_10 = new ArrayList();
		} else {
			l_UNDER_PROC_COST_10.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNDER_PROC_COST_10.add(((DD0030010Struct) list.get(i)).getUNDER_PROC_COST_10());
		}
		return size;
	}
	public int setL2L_UNDER_PROC_COST_11(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNDER_PROC_COST_11 == null) {
			l_UNDER_PROC_COST_11 = new ArrayList();
		} else {
			l_UNDER_PROC_COST_11.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNDER_PROC_COST_11.add(((DD0030010Struct) list.get(i)).getUNDER_PROC_COST_11());
		}
		return size;
	}
	public int setL2L_UNDER_PROC_COST_12(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNDER_PROC_COST_12 == null) {
			l_UNDER_PROC_COST_12 = new ArrayList();
		} else {
			l_UNDER_PROC_COST_12.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNDER_PROC_COST_12.add(((DD0030010Struct) list.get(i)).getUNDER_PROC_COST_12());
		}
		return size;
	}
	public int setL2L_UNDER_PROC_COST_SUM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNDER_PROC_COST_SUM == null) {
			l_UNDER_PROC_COST_SUM = new ArrayList();
		} else {
			l_UNDER_PROC_COST_SUM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNDER_PROC_COST_SUM.add(((DD0030010Struct) list.get(i)).getUNDER_PROC_COST_SUM());
		}
		return size;
	}
	public int setL2L_TOTAL_PROC_COST_01(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TOTAL_PROC_COST_01 == null) {
			l_TOTAL_PROC_COST_01 = new ArrayList();
		} else {
			l_TOTAL_PROC_COST_01.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TOTAL_PROC_COST_01.add(((DD0030010Struct) list.get(i)).getTOTAL_PROC_COST_01());
		}
		return size;
	}
	public int setL2L_TOTAL_PROC_COST_02(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TOTAL_PROC_COST_02 == null) {
			l_TOTAL_PROC_COST_02 = new ArrayList();
		} else {
			l_TOTAL_PROC_COST_02.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TOTAL_PROC_COST_02.add(((DD0030010Struct) list.get(i)).getTOTAL_PROC_COST_02());
		}
		return size;
	}
	public int setL2L_TOTAL_PROC_COST_03(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TOTAL_PROC_COST_03 == null) {
			l_TOTAL_PROC_COST_03 = new ArrayList();
		} else {
			l_TOTAL_PROC_COST_03.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TOTAL_PROC_COST_03.add(((DD0030010Struct) list.get(i)).getTOTAL_PROC_COST_03());
		}
		return size;
	}
	public int setL2L_TOTAL_PROC_COST_04(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TOTAL_PROC_COST_04 == null) {
			l_TOTAL_PROC_COST_04 = new ArrayList();
		} else {
			l_TOTAL_PROC_COST_04.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TOTAL_PROC_COST_04.add(((DD0030010Struct) list.get(i)).getTOTAL_PROC_COST_04());
		}
		return size;
	}
	public int setL2L_TOTAL_PROC_COST_05(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TOTAL_PROC_COST_05 == null) {
			l_TOTAL_PROC_COST_05 = new ArrayList();
		} else {
			l_TOTAL_PROC_COST_05.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TOTAL_PROC_COST_05.add(((DD0030010Struct) list.get(i)).getTOTAL_PROC_COST_05());
		}
		return size;
	}
	public int setL2L_TOTAL_PROC_COST_06(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TOTAL_PROC_COST_06 == null) {
			l_TOTAL_PROC_COST_06 = new ArrayList();
		} else {
			l_TOTAL_PROC_COST_06.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TOTAL_PROC_COST_06.add(((DD0030010Struct) list.get(i)).getTOTAL_PROC_COST_06());
		}
		return size;
	}
	public int setL2L_TOTAL_PROC_COST_07(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TOTAL_PROC_COST_07 == null) {
			l_TOTAL_PROC_COST_07 = new ArrayList();
		} else {
			l_TOTAL_PROC_COST_07.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TOTAL_PROC_COST_07.add(((DD0030010Struct) list.get(i)).getTOTAL_PROC_COST_07());
		}
		return size;
	}
	public int setL2L_TOTAL_PROC_COST_08(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TOTAL_PROC_COST_08 == null) {
			l_TOTAL_PROC_COST_08 = new ArrayList();
		} else {
			l_TOTAL_PROC_COST_08.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TOTAL_PROC_COST_08.add(((DD0030010Struct) list.get(i)).getTOTAL_PROC_COST_08());
		}
		return size;
	}
	public int setL2L_TOTAL_PROC_COST_09(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TOTAL_PROC_COST_09 == null) {
			l_TOTAL_PROC_COST_09 = new ArrayList();
		} else {
			l_TOTAL_PROC_COST_09.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TOTAL_PROC_COST_09.add(((DD0030010Struct) list.get(i)).getTOTAL_PROC_COST_09());
		}
		return size;
	}
	public int setL2L_TOTAL_PROC_COST_10(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TOTAL_PROC_COST_10 == null) {
			l_TOTAL_PROC_COST_10 = new ArrayList();
		} else {
			l_TOTAL_PROC_COST_10.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TOTAL_PROC_COST_10.add(((DD0030010Struct) list.get(i)).getTOTAL_PROC_COST_10());
		}
		return size;
	}
	public int setL2L_TOTAL_PROC_COST_11(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TOTAL_PROC_COST_11 == null) {
			l_TOTAL_PROC_COST_11 = new ArrayList();
		} else {
			l_TOTAL_PROC_COST_11.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TOTAL_PROC_COST_11.add(((DD0030010Struct) list.get(i)).getTOTAL_PROC_COST_11());
		}
		return size;
	}
	public int setL2L_TOTAL_PROC_COST_12(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TOTAL_PROC_COST_12 == null) {
			l_TOTAL_PROC_COST_12 = new ArrayList();
		} else {
			l_TOTAL_PROC_COST_12.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TOTAL_PROC_COST_12.add(((DD0030010Struct) list.get(i)).getTOTAL_PROC_COST_12());
		}
		return size;
	}
	public int setL2L_TOTAL_PROC_COST_SUM(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TOTAL_PROC_COST_SUM == null) {
			l_TOTAL_PROC_COST_SUM = new ArrayList();
		} else {
			l_TOTAL_PROC_COST_SUM.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TOTAL_PROC_COST_SUM.add(((DD0030010Struct) list.get(i)).getTOTAL_PROC_COST_SUM());
		}
		return size;
	}
	public int setL2L_PROC_COST_01_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_01_NAME == null) {
			l_PROC_COST_01_NAME = new ArrayList();
		} else {
			l_PROC_COST_01_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_01_NAME.add(((DD0030010Struct) list.get(i)).getPROC_COST_01_NAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_02_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_02_NAME == null) {
			l_PROC_COST_02_NAME = new ArrayList();
		} else {
			l_PROC_COST_02_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_02_NAME.add(((DD0030010Struct) list.get(i)).getPROC_COST_02_NAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_03_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_03_NAME == null) {
			l_PROC_COST_03_NAME = new ArrayList();
		} else {
			l_PROC_COST_03_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_03_NAME.add(((DD0030010Struct) list.get(i)).getPROC_COST_03_NAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_04_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_04_NAME == null) {
			l_PROC_COST_04_NAME = new ArrayList();
		} else {
			l_PROC_COST_04_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_04_NAME.add(((DD0030010Struct) list.get(i)).getPROC_COST_04_NAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_05_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_05_NAME == null) {
			l_PROC_COST_05_NAME = new ArrayList();
		} else {
			l_PROC_COST_05_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_05_NAME.add(((DD0030010Struct) list.get(i)).getPROC_COST_05_NAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_06_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_06_NAME == null) {
			l_PROC_COST_06_NAME = new ArrayList();
		} else {
			l_PROC_COST_06_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_06_NAME.add(((DD0030010Struct) list.get(i)).getPROC_COST_06_NAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_07_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_07_NAME == null) {
			l_PROC_COST_07_NAME = new ArrayList();
		} else {
			l_PROC_COST_07_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_07_NAME.add(((DD0030010Struct) list.get(i)).getPROC_COST_07_NAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_08_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_08_NAME == null) {
			l_PROC_COST_08_NAME = new ArrayList();
		} else {
			l_PROC_COST_08_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_08_NAME.add(((DD0030010Struct) list.get(i)).getPROC_COST_08_NAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_09_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_09_NAME == null) {
			l_PROC_COST_09_NAME = new ArrayList();
		} else {
			l_PROC_COST_09_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_09_NAME.add(((DD0030010Struct) list.get(i)).getPROC_COST_09_NAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_10_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_10_NAME == null) {
			l_PROC_COST_10_NAME = new ArrayList();
		} else {
			l_PROC_COST_10_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_10_NAME.add(((DD0030010Struct) list.get(i)).getPROC_COST_10_NAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_11_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_11_NAME == null) {
			l_PROC_COST_11_NAME = new ArrayList();
		} else {
			l_PROC_COST_11_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_11_NAME.add(((DD0030010Struct) list.get(i)).getPROC_COST_11_NAME());
		}
		return size;
	}
	public int setL2L_PROC_COST_12_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_12_NAME == null) {
			l_PROC_COST_12_NAME = new ArrayList();
		} else {
			l_PROC_COST_12_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_12_NAME.add(((DD0030010Struct) list.get(i)).getPROC_COST_12_NAME());
		}
		return size;
	}
	public int setL2L_HALF_TERM_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HALF_TERM_TYP_DN == null) {
			l_HALF_TERM_TYP_DN = new ArrayList();
		} else {
			l_HALF_TERM_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HALF_TERM_TYP_DN.add(((DD0030010Struct) list.get(i)).getHALF_TERM_TYP_DN());
		}
		return size;
	}
	public int setL2L_PUCH_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ITEM_CD == null) {
			l_PUCH_ITEM_CD = new ArrayList();
		} else {
			l_PUCH_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ITEM_CD.add(((DD0030010Struct) list.get(i)).getPUCH_ITEM_CD());
		}
		return size;
	}
	public int setL2L_PUCH_CS_PROC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_CS_PROC_CD == null) {
			l_PUCH_CS_PROC_CD = new ArrayList();
		} else {
			l_PUCH_CS_PROC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_CS_PROC_CD.add(((DD0030010Struct) list.get(i)).getPUCH_CS_PROC_CD());
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
			l_VEND_CD.add(((DD0030010Struct) list.get(i)).getVEND_CD());
		}
		return size;
	}
	public int setL2L_UNIT_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_COST == null) {
			l_UNIT_COST = new ArrayList();
		} else {
			l_UNIT_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_COST.add(((DD0030010Struct) list.get(i)).getUNIT_COST());
		}
		return size;
	}
	public int setL2L_UNIT_COST_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_COST_TYP_DN == null) {
			l_UNIT_COST_TYP_DN = new ArrayList();
		} else {
			l_UNIT_COST_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_COST_TYP_DN.add(((DD0030010Struct) list.get(i)).getUNIT_COST_TYP_DN());
		}
		return size;
	}
	public int setL2L_CUR_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CUR_UNIT == null) {
			l_CUR_UNIT = new ArrayList();
		} else {
			l_CUR_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CUR_UNIT.add(((DD0030010Struct) list.get(i)).getCUR_UNIT());
		}
		return size;
	}
	public int setL2L_EXCH_RATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_EXCH_RATE == null) {
			l_EXCH_RATE = new ArrayList();
		} else {
			l_EXCH_RATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_EXCH_RATE.add(((DD0030010Struct) list.get(i)).getEXCH_RATE());
		}
		return size;
	}
	public int setL2L_HOME_CUR_UNIT_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_HOME_CUR_UNIT_COST == null) {
			l_HOME_CUR_UNIT_COST = new ArrayList();
		} else {
			l_HOME_CUR_UNIT_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_HOME_CUR_UNIT_COST.add(((DD0030010Struct) list.get(i)).getHOME_CUR_UNIT_COST());
		}
		return size;
	}
	public int setL2L_PUCH_UNIT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_UNIT_QTY == null) {
			l_PUCH_UNIT_QTY = new ArrayList();
		} else {
			l_PUCH_UNIT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_UNIT_QTY.add(((DD0030010Struct) list.get(i)).getPUCH_UNIT_QTY());
		}
		return size;
	}
	public int setL2L_SUB_VEND_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUB_VEND_CD == null) {
			l_SUB_VEND_CD = new ArrayList();
		} else {
			l_SUB_VEND_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUB_VEND_CD.add(((DD0030010Struct) list.get(i)).getSUB_VEND_CD());
		}
		return size;
	}
	public int setL2L_SUB_UNIT_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUB_UNIT_COST == null) {
			l_SUB_UNIT_COST = new ArrayList();
		} else {
			l_SUB_UNIT_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUB_UNIT_COST.add(((DD0030010Struct) list.get(i)).getSUB_UNIT_COST());
		}
		return size;
	}
	public int setL2L_SUB_UNIT_COST_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUB_UNIT_COST_TYP_DN == null) {
			l_SUB_UNIT_COST_TYP_DN = new ArrayList();
		} else {
			l_SUB_UNIT_COST_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUB_UNIT_COST_TYP_DN.add(((DD0030010Struct) list.get(i)).getSUB_UNIT_COST_TYP_DN());
		}
		return size;
	}
	public int setL2L_SUB_CUR_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUB_CUR_UNIT == null) {
			l_SUB_CUR_UNIT = new ArrayList();
		} else {
			l_SUB_CUR_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUB_CUR_UNIT.add(((DD0030010Struct) list.get(i)).getSUB_CUR_UNIT());
		}
		return size;
	}
	public int setL2L_SUB_EXCH_RATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUB_EXCH_RATE == null) {
			l_SUB_EXCH_RATE = new ArrayList();
		} else {
			l_SUB_EXCH_RATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUB_EXCH_RATE.add(((DD0030010Struct) list.get(i)).getSUB_EXCH_RATE());
		}
		return size;
	}
	public int setL2L_SUB_HOME_CUR_UNIT_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUB_HOME_CUR_UNIT_COST == null) {
			l_SUB_HOME_CUR_UNIT_COST = new ArrayList();
		} else {
			l_SUB_HOME_CUR_UNIT_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUB_HOME_CUR_UNIT_COST.add(((DD0030010Struct) list.get(i)).getSUB_HOME_CUR_UNIT_COST());
		}
		return size;
	}
	public int setL2L_SUB_PUCH_UNIT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUB_PUCH_UNIT_QTY == null) {
			l_SUB_PUCH_UNIT_QTY = new ArrayList();
		} else {
			l_SUB_PUCH_UNIT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUB_PUCH_UNIT_QTY.add(((DD0030010Struct) list.get(i)).getSUB_PUCH_UNIT_QTY());
		}
		return size;
	}
	public int setL2L_PUCH_STOCK_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_STOCK_UNIT == null) {
			l_PUCH_STOCK_UNIT = new ArrayList();
		} else {
			l_PUCH_STOCK_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_STOCK_UNIT.add(((DD0030010Struct) list.get(i)).getPUCH_STOCK_UNIT());
		}
		return size;
	}
	public int setL2L_UNIT_COST_ACCEPT_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_COST_ACCEPT_TYP_DN == null) {
			l_UNIT_COST_ACCEPT_TYP_DN = new ArrayList();
		} else {
			l_UNIT_COST_ACCEPT_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_COST_ACCEPT_TYP_DN.add(((DD0030010Struct) list.get(i)).getUNIT_COST_ACCEPT_TYP_DN());
		}
		return size;
	}
	public int setL2L_CS_PUCH_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CS_PUCH_TYP_DN == null) {
			l_CS_PUCH_TYP_DN = new ArrayList();
		} else {
			l_CS_PUCH_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CS_PUCH_TYP_DN.add(((DD0030010Struct) list.get(i)).getCS_PUCH_TYP_DN());
		}
		return size;
	}
	public int setL2L_PROC_VEND_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_VEND_CD == null) {
			l_PROC_VEND_CD = new ArrayList();
		} else {
			l_PROC_VEND_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_VEND_CD.add(((DD0030010Struct) list.get(i)).getPROC_VEND_CD());
		}
		return size;
	}
	public int setL2L_PROC_ORG_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_ORG_CD == null) {
			l_PROC_ORG_CD = new ArrayList();
		} else {
			l_PROC_ORG_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_ORG_CD.add(((DD0030010Struct) list.get(i)).getPROC_ORG_CD());
		}
		return size;
	}
	public int setL2L_PUCH_UNIT_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_UNIT_COST == null) {
			l_PUCH_UNIT_COST = new ArrayList();
		} else {
			l_PUCH_UNIT_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_UNIT_COST.add(((DD0030010Struct) list.get(i)).getPUCH_UNIT_COST());
		}
		return size;
	}
	public int setL2L_PUCH_PUCH_UNIT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_PUCH_UNIT_QTY == null) {
			l_PUCH_PUCH_UNIT_QTY = new ArrayList();
		} else {
			l_PUCH_PUCH_UNIT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_PUCH_UNIT_QTY.add(((DD0030010Struct) list.get(i)).getPUCH_PUCH_UNIT_QTY());
		}
		return size;
	}
	public int setL2L_SBCNT_UNIT_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SBCNT_UNIT_COST == null) {
			l_SBCNT_UNIT_COST = new ArrayList();
		} else {
			l_SBCNT_UNIT_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SBCNT_UNIT_COST.add(((DD0030010Struct) list.get(i)).getSBCNT_UNIT_COST());
		}
		return size;
	}
	public int setL2L_SBCNT_PUCH_UNIT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SBCNT_PUCH_UNIT_QTY == null) {
			l_SBCNT_PUCH_UNIT_QTY = new ArrayList();
		} else {
			l_SBCNT_PUCH_UNIT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SBCNT_PUCH_UNIT_QTY.add(((DD0030010Struct) list.get(i)).getSBCNT_PUCH_UNIT_QTY());
		}
		return size;
	}
	public int setL2L_PROC_COST_01(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_01 == null) {
			l_PROC_COST_01 = new ArrayList();
		} else {
			l_PROC_COST_01.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_01.add(((DD0030010Struct) list.get(i)).getPROC_COST_01());
		}
		return size;
	}
	public int setL2L_PROC_COST_02(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_02 == null) {
			l_PROC_COST_02 = new ArrayList();
		} else {
			l_PROC_COST_02.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_02.add(((DD0030010Struct) list.get(i)).getPROC_COST_02());
		}
		return size;
	}
	public int setL2L_PROC_COST_03(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_03 == null) {
			l_PROC_COST_03 = new ArrayList();
		} else {
			l_PROC_COST_03.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_03.add(((DD0030010Struct) list.get(i)).getPROC_COST_03());
		}
		return size;
	}
	public int setL2L_PROC_COST_04(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_04 == null) {
			l_PROC_COST_04 = new ArrayList();
		} else {
			l_PROC_COST_04.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_04.add(((DD0030010Struct) list.get(i)).getPROC_COST_04());
		}
		return size;
	}
	public int setL2L_PROC_COST_05(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_05 == null) {
			l_PROC_COST_05 = new ArrayList();
		} else {
			l_PROC_COST_05.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_05.add(((DD0030010Struct) list.get(i)).getPROC_COST_05());
		}
		return size;
	}
	public int setL2L_PROC_COST_06(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_06 == null) {
			l_PROC_COST_06 = new ArrayList();
		} else {
			l_PROC_COST_06.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_06.add(((DD0030010Struct) list.get(i)).getPROC_COST_06());
		}
		return size;
	}
	public int setL2L_PROC_COST_07(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_07 == null) {
			l_PROC_COST_07 = new ArrayList();
		} else {
			l_PROC_COST_07.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_07.add(((DD0030010Struct) list.get(i)).getPROC_COST_07());
		}
		return size;
	}
	public int setL2L_PROC_COST_08(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_08 == null) {
			l_PROC_COST_08 = new ArrayList();
		} else {
			l_PROC_COST_08.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_08.add(((DD0030010Struct) list.get(i)).getPROC_COST_08());
		}
		return size;
	}
	public int setL2L_PROC_COST_09(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_09 == null) {
			l_PROC_COST_09 = new ArrayList();
		} else {
			l_PROC_COST_09.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_09.add(((DD0030010Struct) list.get(i)).getPROC_COST_09());
		}
		return size;
	}
	public int setL2L_PROC_COST_10(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_10 == null) {
			l_PROC_COST_10 = new ArrayList();
		} else {
			l_PROC_COST_10.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_10.add(((DD0030010Struct) list.get(i)).getPROC_COST_10());
		}
		return size;
	}
	public int setL2L_PROC_COST_11(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_11 == null) {
			l_PROC_COST_11 = new ArrayList();
		} else {
			l_PROC_COST_11.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_11.add(((DD0030010Struct) list.get(i)).getPROC_COST_11());
		}
		return size;
	}
	public int setL2L_PROC_COST_12(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_12 == null) {
			l_PROC_COST_12 = new ArrayList();
		} else {
			l_PROC_COST_12.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_12.add(((DD0030010Struct) list.get(i)).getPROC_COST_12());
		}
		return size;
	}
	public int setL2L_PROC_COST_STOCK_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_COST_STOCK_UNIT == null) {
			l_PROC_COST_STOCK_UNIT = new ArrayList();
		} else {
			l_PROC_COST_STOCK_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_COST_STOCK_UNIT.add(((DD0030010Struct) list.get(i)).getPROC_COST_STOCK_UNIT());
		}
		return size;
	}
	public int setL2L_CS_PUCH_TYP_VALUE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CS_PUCH_TYP_VALUE == null) {
			l_CS_PUCH_TYP_VALUE = new ArrayList();
		} else {
			l_CS_PUCH_TYP_VALUE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CS_PUCH_TYP_VALUE.add(((DD0030010Struct) list.get(i)).getCS_PUCH_TYP_VALUE());
		}
		return size;
	}
	public int setL2L_CURRENT_YEAR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CURRENT_YEAR == null) {
			l_CURRENT_YEAR = new ArrayList();
		} else {
			l_CURRENT_YEAR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CURRENT_YEAR.add(((DD0030010Struct) list.get(i)).getCURRENT_YEAR());
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
			l_l_COUNT.add(((DD0030010Struct) list.get(i)).getl_COUNT());
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
			l_ROW_COUNT.add(((DD0030010Struct) list.get(i)).getROW_COUNT());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_HALF_TERM_TYP_name = null;
		m_HALF_TERM_TYP_val = null;
		m_DOWNLOAD_FILE = null;
		m_COST_TYP_DN = null;
		m_OUTSIDE_TYP_DN = null;
		m_PROC_OUTSIDE_TYP_DN = null;
		m_DMY_ITEM_FLG_DN = null;
		m_VOLUNT_SPL_FLG_DN = null;
		m_COST_UP_TYP_DN = null;
		m_ONEROUS_CONS_FLG_DN = null;
		m_UPPER_ITEM_FLG_DN = null;
		m_LOWER_ITEM_FLG_DN = null;
		m_COST_EXCLUDE_FLG_DN = null;
		m_l_ROOT_ITEM_CD = null;
		m_l_ROOT_ITEM_NAME = null;
		m_l_CLASIFICATION_CD = null;
		m_l_CS_PROC_CD = null;
		m_l_CS_PROC_NAME = null;
		m_l_NECESSARY_QTY = null;
		m_l_STOCK_UNIT = null;
		m_l_ITEM_INPUT_RATIO = null;
		m_l_HOME_CUR_UNIT = null;
		m_l_TOTAL_COST = null;
		m_l_TOTAL_MATR_COST = null;
		m_l_TOTAL_SBCNT_MATR_COST = null;
		m_l_TOTAL_PROC_COST_SUM_ALL = null;
		m_PLANT_CD = null;
		m_YEAR = null;
		m_HALF_TERM_TYP = null;
		m_ROOT_ITEM_CD = null;
		m_CLASIFICATION_CD = null;
		m_COST_TYP = null;
		m_PLANT_NAME = null;
		m_ROOT_ITEM_NAME = null;
		m_PARENT_ITEM_CD = null;
		m_PARENT_ITEM_NAME = null;
		m_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_PS_EDITION = null;
		m_COST_STATEMENT_NO = null;
		m_CS_PROC_CD = null;
		m_CS_PROC_NAME = null;
		m_WS_CD = null;
		m_WS_NAME = null;
		m_ORG_CD = null;
		m_ORG_NAME = null;
		m_NECESSARY_QTY = null;
		m_PS_INPUT_RATIO = null;
		m_ITEM_INPUT_RATIO = null;
		m_TOTAL_COST = null;
		m_OWN_MATR_COST = null;
		m_UNDER_MATR_COST = null;
		m_TOTAL_MATR_COST = null;
		m_OWN_SBCNT_MATR_COST = null;
		m_UNDER_SBCNT_MATR_COST = null;
		m_TOTAL_SBCNT_MATR_COST = null;
		m_OWN_PROC_COST_SUM_ALL = null;
		m_UNDER_PROC_COST_SUM_ALL = null;
		m_TOTAL_PROC_COST_SUM_ALL = null;
		m_HOME_CUR_UNIT = null;
		m_EFF_PHASE_IN_DATE = null;
		m_EFF_PHASE_OUT_DATE = null;
		m_PS_UNIT_DENOMINATOR = null;
		m_PS_UNIT_NUMERATOR = null;
		m_PARENT_COST_STATEMENT_NO = null;
		m_PARENT_ITEM_STOCK_UNIT = null;
		m_STOCK_UNIT = null;
		m_OUTSIDE_TYP = null;
		m_PROC_OUTSIDE_TYP = null;
		m_DMY_ITEM_FLG = null;
		m_VOLUNT_SPL_FLG = null;
		m_COST_UP_TYP = null;
		m_ONEROUS_CONS_FLG = null;
		m_UP_LEVEL_NO = null;
		m_UPPER_ITEM_FLG = null;
		m_LOWER_ITEM_FLG = null;
		m_COST_EXCLUDE_FLG = null;
		m_CREATED_DATE = null;
		m_CREATED_BY = null;
		m_CREATED_PRG_NM = null;
		m_UPDATED_DATE = null;
		m_UPDATED_BY = null;
		m_UPDATED_PRG_NM = null;
		m_PROC_COST_CLS_CD = null;
		m_PROC_COST_CLS_NAME = null;
		m_PROC_COST_UNIT_QTY = null;
		m_PROC_COST_UNIT_QTY_UNIT = null;
		m_OWN_PROC_COST_01 = null;
		m_OWN_PROC_COST_02 = null;
		m_OWN_PROC_COST_03 = null;
		m_OWN_PROC_COST_04 = null;
		m_OWN_PROC_COST_05 = null;
		m_OWN_PROC_COST_06 = null;
		m_OWN_PROC_COST_07 = null;
		m_OWN_PROC_COST_08 = null;
		m_OWN_PROC_COST_09 = null;
		m_OWN_PROC_COST_10 = null;
		m_OWN_PROC_COST_11 = null;
		m_OWN_PROC_COST_12 = null;
		m_OWN_PROC_COST_SUM = null;
		m_UNDER_PROC_COST_01 = null;
		m_UNDER_PROC_COST_02 = null;
		m_UNDER_PROC_COST_03 = null;
		m_UNDER_PROC_COST_04 = null;
		m_UNDER_PROC_COST_05 = null;
		m_UNDER_PROC_COST_06 = null;
		m_UNDER_PROC_COST_07 = null;
		m_UNDER_PROC_COST_08 = null;
		m_UNDER_PROC_COST_09 = null;
		m_UNDER_PROC_COST_10 = null;
		m_UNDER_PROC_COST_11 = null;
		m_UNDER_PROC_COST_12 = null;
		m_UNDER_PROC_COST_SUM = null;
		m_TOTAL_PROC_COST_01 = null;
		m_TOTAL_PROC_COST_02 = null;
		m_TOTAL_PROC_COST_03 = null;
		m_TOTAL_PROC_COST_04 = null;
		m_TOTAL_PROC_COST_05 = null;
		m_TOTAL_PROC_COST_06 = null;
		m_TOTAL_PROC_COST_07 = null;
		m_TOTAL_PROC_COST_08 = null;
		m_TOTAL_PROC_COST_09 = null;
		m_TOTAL_PROC_COST_10 = null;
		m_TOTAL_PROC_COST_11 = null;
		m_TOTAL_PROC_COST_12 = null;
		m_TOTAL_PROC_COST_SUM = null;
		m_PROC_COST_01_NAME = null;
		m_PROC_COST_02_NAME = null;
		m_PROC_COST_03_NAME = null;
		m_PROC_COST_04_NAME = null;
		m_PROC_COST_05_NAME = null;
		m_PROC_COST_06_NAME = null;
		m_PROC_COST_07_NAME = null;
		m_PROC_COST_08_NAME = null;
		m_PROC_COST_09_NAME = null;
		m_PROC_COST_10_NAME = null;
		m_PROC_COST_11_NAME = null;
		m_PROC_COST_12_NAME = null;
		m_HALF_TERM_TYP_DN = null;
		m_PUCH_ITEM_CD = null;
		m_PUCH_CS_PROC_CD = null;
		m_VEND_CD = null;
		m_UNIT_COST = null;
		m_UNIT_COST_TYP_DN = null;
		m_CUR_UNIT = null;
		m_EXCH_RATE = null;
		m_HOME_CUR_UNIT_COST = null;
		m_PUCH_UNIT_QTY = null;
		m_SUB_VEND_CD = null;
		m_SUB_UNIT_COST = null;
		m_SUB_UNIT_COST_TYP_DN = null;
		m_SUB_CUR_UNIT = null;
		m_SUB_EXCH_RATE = null;
		m_SUB_HOME_CUR_UNIT_COST = null;
		m_SUB_PUCH_UNIT_QTY = null;
		m_PUCH_STOCK_UNIT = null;
		m_UNIT_COST_ACCEPT_TYP_DN = null;
		m_CS_PUCH_TYP_DN = null;
		m_PROC_VEND_CD = null;
		m_PROC_ORG_CD = null;
		m_PUCH_UNIT_COST = null;
		m_PUCH_PUCH_UNIT_QTY = null;
		m_SBCNT_UNIT_COST = null;
		m_SBCNT_PUCH_UNIT_QTY = null;
		m_PROC_COST_01 = null;
		m_PROC_COST_02 = null;
		m_PROC_COST_03 = null;
		m_PROC_COST_04 = null;
		m_PROC_COST_05 = null;
		m_PROC_COST_06 = null;
		m_PROC_COST_07 = null;
		m_PROC_COST_08 = null;
		m_PROC_COST_09 = null;
		m_PROC_COST_10 = null;
		m_PROC_COST_11 = null;
		m_PROC_COST_12 = null;
		m_PROC_COST_STOCK_UNIT = null;
		m_CS_PUCH_TYP_VALUE = null;
		m_CURRENT_YEAR = null;
		m_l_COUNT = null;
		m_ROW_COUNT = null;

		l_HALF_TERM_TYP_name = null;
		l_HALF_TERM_TYP_val = null;
		l_DOWNLOAD_FILE = null;
		l_COST_TYP_DN = null;
		l_OUTSIDE_TYP_DN = null;
		l_PROC_OUTSIDE_TYP_DN = null;
		l_DMY_ITEM_FLG_DN = null;
		l_VOLUNT_SPL_FLG_DN = null;
		l_COST_UP_TYP_DN = null;
		l_ONEROUS_CONS_FLG_DN = null;
		l_UPPER_ITEM_FLG_DN = null;
		l_LOWER_ITEM_FLG_DN = null;
		l_COST_EXCLUDE_FLG_DN = null;
		l_l_ROOT_ITEM_CD = null;
		l_l_ROOT_ITEM_NAME = null;
		l_l_CLASIFICATION_CD = null;
		l_l_CS_PROC_CD = null;
		l_l_CS_PROC_NAME = null;
		l_l_NECESSARY_QTY = null;
		l_l_STOCK_UNIT = null;
		l_l_ITEM_INPUT_RATIO = null;
		l_l_HOME_CUR_UNIT = null;
		l_l_TOTAL_COST = null;
		l_l_TOTAL_MATR_COST = null;
		l_l_TOTAL_SBCNT_MATR_COST = null;
		l_l_TOTAL_PROC_COST_SUM_ALL = null;
		l_PLANT_CD = null;
		l_YEAR = null;
		l_HALF_TERM_TYP = null;
		l_ROOT_ITEM_CD = null;
		l_CLASIFICATION_CD = null;
		l_COST_TYP = null;
		l_PLANT_NAME = null;
		l_ROOT_ITEM_NAME = null;
		l_PARENT_ITEM_CD = null;
		l_PARENT_ITEM_NAME = null;
		l_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_PS_EDITION = null;
		l_COST_STATEMENT_NO = null;
		l_CS_PROC_CD = null;
		l_CS_PROC_NAME = null;
		l_WS_CD = null;
		l_WS_NAME = null;
		l_ORG_CD = null;
		l_ORG_NAME = null;
		l_NECESSARY_QTY = null;
		l_PS_INPUT_RATIO = null;
		l_ITEM_INPUT_RATIO = null;
		l_TOTAL_COST = null;
		l_OWN_MATR_COST = null;
		l_UNDER_MATR_COST = null;
		l_TOTAL_MATR_COST = null;
		l_OWN_SBCNT_MATR_COST = null;
		l_UNDER_SBCNT_MATR_COST = null;
		l_TOTAL_SBCNT_MATR_COST = null;
		l_OWN_PROC_COST_SUM_ALL = null;
		l_UNDER_PROC_COST_SUM_ALL = null;
		l_TOTAL_PROC_COST_SUM_ALL = null;
		l_HOME_CUR_UNIT = null;
		l_EFF_PHASE_IN_DATE = null;
		l_EFF_PHASE_OUT_DATE = null;
		l_PS_UNIT_DENOMINATOR = null;
		l_PS_UNIT_NUMERATOR = null;
		l_PARENT_COST_STATEMENT_NO = null;
		l_PARENT_ITEM_STOCK_UNIT = null;
		l_STOCK_UNIT = null;
		l_OUTSIDE_TYP = null;
		l_PROC_OUTSIDE_TYP = null;
		l_DMY_ITEM_FLG = null;
		l_VOLUNT_SPL_FLG = null;
		l_COST_UP_TYP = null;
		l_ONEROUS_CONS_FLG = null;
		l_UP_LEVEL_NO = null;
		l_UPPER_ITEM_FLG = null;
		l_LOWER_ITEM_FLG = null;
		l_COST_EXCLUDE_FLG = null;
		l_CREATED_DATE = null;
		l_CREATED_BY = null;
		l_CREATED_PRG_NM = null;
		l_UPDATED_DATE = null;
		l_UPDATED_BY = null;
		l_UPDATED_PRG_NM = null;
		l_PROC_COST_CLS_CD = null;
		l_PROC_COST_CLS_NAME = null;
		l_PROC_COST_UNIT_QTY = null;
		l_PROC_COST_UNIT_QTY_UNIT = null;
		l_OWN_PROC_COST_01 = null;
		l_OWN_PROC_COST_02 = null;
		l_OWN_PROC_COST_03 = null;
		l_OWN_PROC_COST_04 = null;
		l_OWN_PROC_COST_05 = null;
		l_OWN_PROC_COST_06 = null;
		l_OWN_PROC_COST_07 = null;
		l_OWN_PROC_COST_08 = null;
		l_OWN_PROC_COST_09 = null;
		l_OWN_PROC_COST_10 = null;
		l_OWN_PROC_COST_11 = null;
		l_OWN_PROC_COST_12 = null;
		l_OWN_PROC_COST_SUM = null;
		l_UNDER_PROC_COST_01 = null;
		l_UNDER_PROC_COST_02 = null;
		l_UNDER_PROC_COST_03 = null;
		l_UNDER_PROC_COST_04 = null;
		l_UNDER_PROC_COST_05 = null;
		l_UNDER_PROC_COST_06 = null;
		l_UNDER_PROC_COST_07 = null;
		l_UNDER_PROC_COST_08 = null;
		l_UNDER_PROC_COST_09 = null;
		l_UNDER_PROC_COST_10 = null;
		l_UNDER_PROC_COST_11 = null;
		l_UNDER_PROC_COST_12 = null;
		l_UNDER_PROC_COST_SUM = null;
		l_TOTAL_PROC_COST_01 = null;
		l_TOTAL_PROC_COST_02 = null;
		l_TOTAL_PROC_COST_03 = null;
		l_TOTAL_PROC_COST_04 = null;
		l_TOTAL_PROC_COST_05 = null;
		l_TOTAL_PROC_COST_06 = null;
		l_TOTAL_PROC_COST_07 = null;
		l_TOTAL_PROC_COST_08 = null;
		l_TOTAL_PROC_COST_09 = null;
		l_TOTAL_PROC_COST_10 = null;
		l_TOTAL_PROC_COST_11 = null;
		l_TOTAL_PROC_COST_12 = null;
		l_TOTAL_PROC_COST_SUM = null;
		l_PROC_COST_01_NAME = null;
		l_PROC_COST_02_NAME = null;
		l_PROC_COST_03_NAME = null;
		l_PROC_COST_04_NAME = null;
		l_PROC_COST_05_NAME = null;
		l_PROC_COST_06_NAME = null;
		l_PROC_COST_07_NAME = null;
		l_PROC_COST_08_NAME = null;
		l_PROC_COST_09_NAME = null;
		l_PROC_COST_10_NAME = null;
		l_PROC_COST_11_NAME = null;
		l_PROC_COST_12_NAME = null;
		l_HALF_TERM_TYP_DN = null;
		l_PUCH_ITEM_CD = null;
		l_PUCH_CS_PROC_CD = null;
		l_VEND_CD = null;
		l_UNIT_COST = null;
		l_UNIT_COST_TYP_DN = null;
		l_CUR_UNIT = null;
		l_EXCH_RATE = null;
		l_HOME_CUR_UNIT_COST = null;
		l_PUCH_UNIT_QTY = null;
		l_SUB_VEND_CD = null;
		l_SUB_UNIT_COST = null;
		l_SUB_UNIT_COST_TYP_DN = null;
		l_SUB_CUR_UNIT = null;
		l_SUB_EXCH_RATE = null;
		l_SUB_HOME_CUR_UNIT_COST = null;
		l_SUB_PUCH_UNIT_QTY = null;
		l_PUCH_STOCK_UNIT = null;
		l_UNIT_COST_ACCEPT_TYP_DN = null;
		l_CS_PUCH_TYP_DN = null;
		l_PROC_VEND_CD = null;
		l_PROC_ORG_CD = null;
		l_PUCH_UNIT_COST = null;
		l_PUCH_PUCH_UNIT_QTY = null;
		l_SBCNT_UNIT_COST = null;
		l_SBCNT_PUCH_UNIT_QTY = null;
		l_PROC_COST_01 = null;
		l_PROC_COST_02 = null;
		l_PROC_COST_03 = null;
		l_PROC_COST_04 = null;
		l_PROC_COST_05 = null;
		l_PROC_COST_06 = null;
		l_PROC_COST_07 = null;
		l_PROC_COST_08 = null;
		l_PROC_COST_09 = null;
		l_PROC_COST_10 = null;
		l_PROC_COST_11 = null;
		l_PROC_COST_12 = null;
		l_PROC_COST_STOCK_UNIT = null;
		l_CS_PUCH_TYP_VALUE = null;
		l_CURRENT_YEAR = null;
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
	 * medDD0030010�N���X�̕W���R���X�g���N�^
	 */
	public DD0030010Struct()
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
	public void setStruct(DD0030010Struct struct)
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
	public void setStructM(DD0030010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setHALF_TERM_TYP_name(struct.getHALF_TERM_TYP_name());
			this.setHALF_TERM_TYP_val(struct.getHALF_TERM_TYP_val());
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.setCOST_TYP_DN(struct.getCOST_TYP_DN());
			this.setOUTSIDE_TYP_DN(struct.getOUTSIDE_TYP_DN());
			this.setPROC_OUTSIDE_TYP_DN(struct.getPROC_OUTSIDE_TYP_DN());
			this.setDMY_ITEM_FLG_DN(struct.getDMY_ITEM_FLG_DN());
			this.setVOLUNT_SPL_FLG_DN(struct.getVOLUNT_SPL_FLG_DN());
			this.setCOST_UP_TYP_DN(struct.getCOST_UP_TYP_DN());
			this.setONEROUS_CONS_FLG_DN(struct.getONEROUS_CONS_FLG_DN());
			this.setUPPER_ITEM_FLG_DN(struct.getUPPER_ITEM_FLG_DN());
			this.setLOWER_ITEM_FLG_DN(struct.getLOWER_ITEM_FLG_DN());
			this.setCOST_EXCLUDE_FLG_DN(struct.getCOST_EXCLUDE_FLG_DN());
			this.setl_ROOT_ITEM_CD(struct.getl_ROOT_ITEM_CD());
			this.setl_ROOT_ITEM_NAME(struct.getl_ROOT_ITEM_NAME());
			this.setl_CLASIFICATION_CD(struct.getl_CLASIFICATION_CD());
			this.setl_CS_PROC_CD(struct.getl_CS_PROC_CD());
			this.setl_CS_PROC_NAME(struct.getl_CS_PROC_NAME());
			this.setl_NECESSARY_QTY(struct.getl_NECESSARY_QTY());
			this.setl_STOCK_UNIT(struct.getl_STOCK_UNIT());
			this.setl_ITEM_INPUT_RATIO(struct.getl_ITEM_INPUT_RATIO());
			this.setl_HOME_CUR_UNIT(struct.getl_HOME_CUR_UNIT());
			this.setl_TOTAL_COST(struct.getl_TOTAL_COST());
			this.setl_TOTAL_MATR_COST(struct.getl_TOTAL_MATR_COST());
			this.setl_TOTAL_SBCNT_MATR_COST(struct.getl_TOTAL_SBCNT_MATR_COST());
			this.setl_TOTAL_PROC_COST_SUM_ALL(struct.getl_TOTAL_PROC_COST_SUM_ALL());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setYEAR(struct.getYEAR());
			this.setHALF_TERM_TYP(struct.getHALF_TERM_TYP());
			this.setROOT_ITEM_CD(struct.getROOT_ITEM_CD());
			this.setCLASIFICATION_CD(struct.getCLASIFICATION_CD());
			this.setCOST_TYP(struct.getCOST_TYP());
			this.setPLANT_NAME(struct.getPLANT_NAME());
			this.setROOT_ITEM_NAME(struct.getROOT_ITEM_NAME());
			this.setPARENT_ITEM_CD(struct.getPARENT_ITEM_CD());
			this.setPARENT_ITEM_NAME(struct.getPARENT_ITEM_NAME());
			this.setITEM_CD(struct.getITEM_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setPS_EDITION(struct.getPS_EDITION());
			this.setCOST_STATEMENT_NO(struct.getCOST_STATEMENT_NO());
			this.setCS_PROC_CD(struct.getCS_PROC_CD());
			this.setCS_PROC_NAME(struct.getCS_PROC_NAME());
			this.setWS_CD(struct.getWS_CD());
			this.setWS_NAME(struct.getWS_NAME());
			this.setORG_CD(struct.getORG_CD());
			this.setORG_NAME(struct.getORG_NAME());
			this.setNECESSARY_QTY(struct.getNECESSARY_QTY());
			this.setPS_INPUT_RATIO(struct.getPS_INPUT_RATIO());
			this.setITEM_INPUT_RATIO(struct.getITEM_INPUT_RATIO());
			this.setTOTAL_COST(struct.getTOTAL_COST());
			this.setOWN_MATR_COST(struct.getOWN_MATR_COST());
			this.setUNDER_MATR_COST(struct.getUNDER_MATR_COST());
			this.setTOTAL_MATR_COST(struct.getTOTAL_MATR_COST());
			this.setOWN_SBCNT_MATR_COST(struct.getOWN_SBCNT_MATR_COST());
			this.setUNDER_SBCNT_MATR_COST(struct.getUNDER_SBCNT_MATR_COST());
			this.setTOTAL_SBCNT_MATR_COST(struct.getTOTAL_SBCNT_MATR_COST());
			this.setOWN_PROC_COST_SUM_ALL(struct.getOWN_PROC_COST_SUM_ALL());
			this.setUNDER_PROC_COST_SUM_ALL(struct.getUNDER_PROC_COST_SUM_ALL());
			this.setTOTAL_PROC_COST_SUM_ALL(struct.getTOTAL_PROC_COST_SUM_ALL());
			this.setHOME_CUR_UNIT(struct.getHOME_CUR_UNIT());
			this.setEFF_PHASE_IN_DATE(struct.getEFF_PHASE_IN_DATE());
			this.setEFF_PHASE_OUT_DATE(struct.getEFF_PHASE_OUT_DATE());
			this.setPS_UNIT_DENOMINATOR(struct.getPS_UNIT_DENOMINATOR());
			this.setPS_UNIT_NUMERATOR(struct.getPS_UNIT_NUMERATOR());
			this.setPARENT_COST_STATEMENT_NO(struct.getPARENT_COST_STATEMENT_NO());
			this.setPARENT_ITEM_STOCK_UNIT(struct.getPARENT_ITEM_STOCK_UNIT());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setOUTSIDE_TYP(struct.getOUTSIDE_TYP());
			this.setPROC_OUTSIDE_TYP(struct.getPROC_OUTSIDE_TYP());
			this.setDMY_ITEM_FLG(struct.getDMY_ITEM_FLG());
			this.setVOLUNT_SPL_FLG(struct.getVOLUNT_SPL_FLG());
			this.setCOST_UP_TYP(struct.getCOST_UP_TYP());
			this.setONEROUS_CONS_FLG(struct.getONEROUS_CONS_FLG());
			this.setUP_LEVEL_NO(struct.getUP_LEVEL_NO());
			this.setUPPER_ITEM_FLG(struct.getUPPER_ITEM_FLG());
			this.setLOWER_ITEM_FLG(struct.getLOWER_ITEM_FLG());
			this.setCOST_EXCLUDE_FLG(struct.getCOST_EXCLUDE_FLG());
			this.setCREATED_DATE(struct.getCREATED_DATE());
			this.setCREATED_BY(struct.getCREATED_BY());
			this.setCREATED_PRG_NM(struct.getCREATED_PRG_NM());
			this.setUPDATED_DATE(struct.getUPDATED_DATE());
			this.setUPDATED_BY(struct.getUPDATED_BY());
			this.setUPDATED_PRG_NM(struct.getUPDATED_PRG_NM());
			this.setPROC_COST_CLS_CD(struct.getPROC_COST_CLS_CD());
			this.setPROC_COST_CLS_NAME(struct.getPROC_COST_CLS_NAME());
			this.setPROC_COST_UNIT_QTY(struct.getPROC_COST_UNIT_QTY());
			this.setPROC_COST_UNIT_QTY_UNIT(struct.getPROC_COST_UNIT_QTY_UNIT());
			this.setOWN_PROC_COST_01(struct.getOWN_PROC_COST_01());
			this.setOWN_PROC_COST_02(struct.getOWN_PROC_COST_02());
			this.setOWN_PROC_COST_03(struct.getOWN_PROC_COST_03());
			this.setOWN_PROC_COST_04(struct.getOWN_PROC_COST_04());
			this.setOWN_PROC_COST_05(struct.getOWN_PROC_COST_05());
			this.setOWN_PROC_COST_06(struct.getOWN_PROC_COST_06());
			this.setOWN_PROC_COST_07(struct.getOWN_PROC_COST_07());
			this.setOWN_PROC_COST_08(struct.getOWN_PROC_COST_08());
			this.setOWN_PROC_COST_09(struct.getOWN_PROC_COST_09());
			this.setOWN_PROC_COST_10(struct.getOWN_PROC_COST_10());
			this.setOWN_PROC_COST_11(struct.getOWN_PROC_COST_11());
			this.setOWN_PROC_COST_12(struct.getOWN_PROC_COST_12());
			this.setOWN_PROC_COST_SUM(struct.getOWN_PROC_COST_SUM());
			this.setUNDER_PROC_COST_01(struct.getUNDER_PROC_COST_01());
			this.setUNDER_PROC_COST_02(struct.getUNDER_PROC_COST_02());
			this.setUNDER_PROC_COST_03(struct.getUNDER_PROC_COST_03());
			this.setUNDER_PROC_COST_04(struct.getUNDER_PROC_COST_04());
			this.setUNDER_PROC_COST_05(struct.getUNDER_PROC_COST_05());
			this.setUNDER_PROC_COST_06(struct.getUNDER_PROC_COST_06());
			this.setUNDER_PROC_COST_07(struct.getUNDER_PROC_COST_07());
			this.setUNDER_PROC_COST_08(struct.getUNDER_PROC_COST_08());
			this.setUNDER_PROC_COST_09(struct.getUNDER_PROC_COST_09());
			this.setUNDER_PROC_COST_10(struct.getUNDER_PROC_COST_10());
			this.setUNDER_PROC_COST_11(struct.getUNDER_PROC_COST_11());
			this.setUNDER_PROC_COST_12(struct.getUNDER_PROC_COST_12());
			this.setUNDER_PROC_COST_SUM(struct.getUNDER_PROC_COST_SUM());
			this.setTOTAL_PROC_COST_01(struct.getTOTAL_PROC_COST_01());
			this.setTOTAL_PROC_COST_02(struct.getTOTAL_PROC_COST_02());
			this.setTOTAL_PROC_COST_03(struct.getTOTAL_PROC_COST_03());
			this.setTOTAL_PROC_COST_04(struct.getTOTAL_PROC_COST_04());
			this.setTOTAL_PROC_COST_05(struct.getTOTAL_PROC_COST_05());
			this.setTOTAL_PROC_COST_06(struct.getTOTAL_PROC_COST_06());
			this.setTOTAL_PROC_COST_07(struct.getTOTAL_PROC_COST_07());
			this.setTOTAL_PROC_COST_08(struct.getTOTAL_PROC_COST_08());
			this.setTOTAL_PROC_COST_09(struct.getTOTAL_PROC_COST_09());
			this.setTOTAL_PROC_COST_10(struct.getTOTAL_PROC_COST_10());
			this.setTOTAL_PROC_COST_11(struct.getTOTAL_PROC_COST_11());
			this.setTOTAL_PROC_COST_12(struct.getTOTAL_PROC_COST_12());
			this.setTOTAL_PROC_COST_SUM(struct.getTOTAL_PROC_COST_SUM());
			this.setPROC_COST_01_NAME(struct.getPROC_COST_01_NAME());
			this.setPROC_COST_02_NAME(struct.getPROC_COST_02_NAME());
			this.setPROC_COST_03_NAME(struct.getPROC_COST_03_NAME());
			this.setPROC_COST_04_NAME(struct.getPROC_COST_04_NAME());
			this.setPROC_COST_05_NAME(struct.getPROC_COST_05_NAME());
			this.setPROC_COST_06_NAME(struct.getPROC_COST_06_NAME());
			this.setPROC_COST_07_NAME(struct.getPROC_COST_07_NAME());
			this.setPROC_COST_08_NAME(struct.getPROC_COST_08_NAME());
			this.setPROC_COST_09_NAME(struct.getPROC_COST_09_NAME());
			this.setPROC_COST_10_NAME(struct.getPROC_COST_10_NAME());
			this.setPROC_COST_11_NAME(struct.getPROC_COST_11_NAME());
			this.setPROC_COST_12_NAME(struct.getPROC_COST_12_NAME());
			this.setHALF_TERM_TYP_DN(struct.getHALF_TERM_TYP_DN());
			this.setPUCH_ITEM_CD(struct.getPUCH_ITEM_CD());
			this.setPUCH_CS_PROC_CD(struct.getPUCH_CS_PROC_CD());
			this.setVEND_CD(struct.getVEND_CD());
			this.setUNIT_COST(struct.getUNIT_COST());
			this.setUNIT_COST_TYP_DN(struct.getUNIT_COST_TYP_DN());
			this.setCUR_UNIT(struct.getCUR_UNIT());
			this.setEXCH_RATE(struct.getEXCH_RATE());
			this.setHOME_CUR_UNIT_COST(struct.getHOME_CUR_UNIT_COST());
			this.setPUCH_UNIT_QTY(struct.getPUCH_UNIT_QTY());
			this.setSUB_VEND_CD(struct.getSUB_VEND_CD());
			this.setSUB_UNIT_COST(struct.getSUB_UNIT_COST());
			this.setSUB_UNIT_COST_TYP_DN(struct.getSUB_UNIT_COST_TYP_DN());
			this.setSUB_CUR_UNIT(struct.getSUB_CUR_UNIT());
			this.setSUB_EXCH_RATE(struct.getSUB_EXCH_RATE());
			this.setSUB_HOME_CUR_UNIT_COST(struct.getSUB_HOME_CUR_UNIT_COST());
			this.setSUB_PUCH_UNIT_QTY(struct.getSUB_PUCH_UNIT_QTY());
			this.setPUCH_STOCK_UNIT(struct.getPUCH_STOCK_UNIT());
			this.setUNIT_COST_ACCEPT_TYP_DN(struct.getUNIT_COST_ACCEPT_TYP_DN());
			this.setCS_PUCH_TYP_DN(struct.getCS_PUCH_TYP_DN());
			this.setPROC_VEND_CD(struct.getPROC_VEND_CD());
			this.setPROC_ORG_CD(struct.getPROC_ORG_CD());
			this.setPUCH_UNIT_COST(struct.getPUCH_UNIT_COST());
			this.setPUCH_PUCH_UNIT_QTY(struct.getPUCH_PUCH_UNIT_QTY());
			this.setSBCNT_UNIT_COST(struct.getSBCNT_UNIT_COST());
			this.setSBCNT_PUCH_UNIT_QTY(struct.getSBCNT_PUCH_UNIT_QTY());
			this.setPROC_COST_01(struct.getPROC_COST_01());
			this.setPROC_COST_02(struct.getPROC_COST_02());
			this.setPROC_COST_03(struct.getPROC_COST_03());
			this.setPROC_COST_04(struct.getPROC_COST_04());
			this.setPROC_COST_05(struct.getPROC_COST_05());
			this.setPROC_COST_06(struct.getPROC_COST_06());
			this.setPROC_COST_07(struct.getPROC_COST_07());
			this.setPROC_COST_08(struct.getPROC_COST_08());
			this.setPROC_COST_09(struct.getPROC_COST_09());
			this.setPROC_COST_10(struct.getPROC_COST_10());
			this.setPROC_COST_11(struct.getPROC_COST_11());
			this.setPROC_COST_12(struct.getPROC_COST_12());
			this.setPROC_COST_STOCK_UNIT(struct.getPROC_COST_STOCK_UNIT());
			this.setCS_PUCH_TYP_VALUE(struct.getCS_PUCH_TYP_VALUE());
			this.setCURRENT_YEAR(struct.getCURRENT_YEAR());
			this.setl_COUNT(struct.getl_COUNT());
			this.setROW_COUNT(struct.getROW_COUNT());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(DD0030010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_HALF_TERM_TYP_name(struct.getList_HALF_TERM_TYP_name());
			this.setList_HALF_TERM_TYP_val(struct.getList_HALF_TERM_TYP_val());
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_COST_TYP_DN(struct.getList_COST_TYP_DN());
			this.setList_OUTSIDE_TYP_DN(struct.getList_OUTSIDE_TYP_DN());
			this.setList_PROC_OUTSIDE_TYP_DN(struct.getList_PROC_OUTSIDE_TYP_DN());
			this.setList_DMY_ITEM_FLG_DN(struct.getList_DMY_ITEM_FLG_DN());
			this.setList_VOLUNT_SPL_FLG_DN(struct.getList_VOLUNT_SPL_FLG_DN());
			this.setList_COST_UP_TYP_DN(struct.getList_COST_UP_TYP_DN());
			this.setList_ONEROUS_CONS_FLG_DN(struct.getList_ONEROUS_CONS_FLG_DN());
			this.setList_UPPER_ITEM_FLG_DN(struct.getList_UPPER_ITEM_FLG_DN());
			this.setList_LOWER_ITEM_FLG_DN(struct.getList_LOWER_ITEM_FLG_DN());
			this.setList_COST_EXCLUDE_FLG_DN(struct.getList_COST_EXCLUDE_FLG_DN());
			this.setList_l_ROOT_ITEM_CD(struct.getList_l_ROOT_ITEM_CD());
			this.setList_l_ROOT_ITEM_NAME(struct.getList_l_ROOT_ITEM_NAME());
			this.setList_l_CLASIFICATION_CD(struct.getList_l_CLASIFICATION_CD());
			this.setList_l_CS_PROC_CD(struct.getList_l_CS_PROC_CD());
			this.setList_l_CS_PROC_NAME(struct.getList_l_CS_PROC_NAME());
			this.setList_l_NECESSARY_QTY(struct.getList_l_NECESSARY_QTY());
			this.setList_l_STOCK_UNIT(struct.getList_l_STOCK_UNIT());
			this.setList_l_ITEM_INPUT_RATIO(struct.getList_l_ITEM_INPUT_RATIO());
			this.setList_l_HOME_CUR_UNIT(struct.getList_l_HOME_CUR_UNIT());
			this.setList_l_TOTAL_COST(struct.getList_l_TOTAL_COST());
			this.setList_l_TOTAL_MATR_COST(struct.getList_l_TOTAL_MATR_COST());
			this.setList_l_TOTAL_SBCNT_MATR_COST(struct.getList_l_TOTAL_SBCNT_MATR_COST());
			this.setList_l_TOTAL_PROC_COST_SUM_ALL(struct.getList_l_TOTAL_PROC_COST_SUM_ALL());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_YEAR(struct.getList_YEAR());
			this.setList_HALF_TERM_TYP(struct.getList_HALF_TERM_TYP());
			this.setList_ROOT_ITEM_CD(struct.getList_ROOT_ITEM_CD());
			this.setList_CLASIFICATION_CD(struct.getList_CLASIFICATION_CD());
			this.setList_COST_TYP(struct.getList_COST_TYP());
			this.setList_PLANT_NAME(struct.getList_PLANT_NAME());
			this.setList_ROOT_ITEM_NAME(struct.getList_ROOT_ITEM_NAME());
			this.setList_PARENT_ITEM_CD(struct.getList_PARENT_ITEM_CD());
			this.setList_PARENT_ITEM_NAME(struct.getList_PARENT_ITEM_NAME());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_PS_EDITION(struct.getList_PS_EDITION());
			this.setList_COST_STATEMENT_NO(struct.getList_COST_STATEMENT_NO());
			this.setList_CS_PROC_CD(struct.getList_CS_PROC_CD());
			this.setList_CS_PROC_NAME(struct.getList_CS_PROC_NAME());
			this.setList_WS_CD(struct.getList_WS_CD());
			this.setList_WS_NAME(struct.getList_WS_NAME());
			this.setList_ORG_CD(struct.getList_ORG_CD());
			this.setList_ORG_NAME(struct.getList_ORG_NAME());
			this.setList_NECESSARY_QTY(struct.getList_NECESSARY_QTY());
			this.setList_PS_INPUT_RATIO(struct.getList_PS_INPUT_RATIO());
			this.setList_ITEM_INPUT_RATIO(struct.getList_ITEM_INPUT_RATIO());
			this.setList_TOTAL_COST(struct.getList_TOTAL_COST());
			this.setList_OWN_MATR_COST(struct.getList_OWN_MATR_COST());
			this.setList_UNDER_MATR_COST(struct.getList_UNDER_MATR_COST());
			this.setList_TOTAL_MATR_COST(struct.getList_TOTAL_MATR_COST());
			this.setList_OWN_SBCNT_MATR_COST(struct.getList_OWN_SBCNT_MATR_COST());
			this.setList_UNDER_SBCNT_MATR_COST(struct.getList_UNDER_SBCNT_MATR_COST());
			this.setList_TOTAL_SBCNT_MATR_COST(struct.getList_TOTAL_SBCNT_MATR_COST());
			this.setList_OWN_PROC_COST_SUM_ALL(struct.getList_OWN_PROC_COST_SUM_ALL());
			this.setList_UNDER_PROC_COST_SUM_ALL(struct.getList_UNDER_PROC_COST_SUM_ALL());
			this.setList_TOTAL_PROC_COST_SUM_ALL(struct.getList_TOTAL_PROC_COST_SUM_ALL());
			this.setList_HOME_CUR_UNIT(struct.getList_HOME_CUR_UNIT());
			this.setList_EFF_PHASE_IN_DATE(struct.getList_EFF_PHASE_IN_DATE());
			this.setList_EFF_PHASE_OUT_DATE(struct.getList_EFF_PHASE_OUT_DATE());
			this.setList_PS_UNIT_DENOMINATOR(struct.getList_PS_UNIT_DENOMINATOR());
			this.setList_PS_UNIT_NUMERATOR(struct.getList_PS_UNIT_NUMERATOR());
			this.setList_PARENT_COST_STATEMENT_NO(struct.getList_PARENT_COST_STATEMENT_NO());
			this.setList_PARENT_ITEM_STOCK_UNIT(struct.getList_PARENT_ITEM_STOCK_UNIT());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_OUTSIDE_TYP(struct.getList_OUTSIDE_TYP());
			this.setList_PROC_OUTSIDE_TYP(struct.getList_PROC_OUTSIDE_TYP());
			this.setList_DMY_ITEM_FLG(struct.getList_DMY_ITEM_FLG());
			this.setList_VOLUNT_SPL_FLG(struct.getList_VOLUNT_SPL_FLG());
			this.setList_COST_UP_TYP(struct.getList_COST_UP_TYP());
			this.setList_ONEROUS_CONS_FLG(struct.getList_ONEROUS_CONS_FLG());
			this.setList_UP_LEVEL_NO(struct.getList_UP_LEVEL_NO());
			this.setList_UPPER_ITEM_FLG(struct.getList_UPPER_ITEM_FLG());
			this.setList_LOWER_ITEM_FLG(struct.getList_LOWER_ITEM_FLG());
			this.setList_COST_EXCLUDE_FLG(struct.getList_COST_EXCLUDE_FLG());
			this.setList_CREATED_DATE(struct.getList_CREATED_DATE());
			this.setList_CREATED_BY(struct.getList_CREATED_BY());
			this.setList_CREATED_PRG_NM(struct.getList_CREATED_PRG_NM());
			this.setList_UPDATED_DATE(struct.getList_UPDATED_DATE());
			this.setList_UPDATED_BY(struct.getList_UPDATED_BY());
			this.setList_UPDATED_PRG_NM(struct.getList_UPDATED_PRG_NM());
			this.setList_PROC_COST_CLS_CD(struct.getList_PROC_COST_CLS_CD());
			this.setList_PROC_COST_CLS_NAME(struct.getList_PROC_COST_CLS_NAME());
			this.setList_PROC_COST_UNIT_QTY(struct.getList_PROC_COST_UNIT_QTY());
			this.setList_PROC_COST_UNIT_QTY_UNIT(struct.getList_PROC_COST_UNIT_QTY_UNIT());
			this.setList_OWN_PROC_COST_01(struct.getList_OWN_PROC_COST_01());
			this.setList_OWN_PROC_COST_02(struct.getList_OWN_PROC_COST_02());
			this.setList_OWN_PROC_COST_03(struct.getList_OWN_PROC_COST_03());
			this.setList_OWN_PROC_COST_04(struct.getList_OWN_PROC_COST_04());
			this.setList_OWN_PROC_COST_05(struct.getList_OWN_PROC_COST_05());
			this.setList_OWN_PROC_COST_06(struct.getList_OWN_PROC_COST_06());
			this.setList_OWN_PROC_COST_07(struct.getList_OWN_PROC_COST_07());
			this.setList_OWN_PROC_COST_08(struct.getList_OWN_PROC_COST_08());
			this.setList_OWN_PROC_COST_09(struct.getList_OWN_PROC_COST_09());
			this.setList_OWN_PROC_COST_10(struct.getList_OWN_PROC_COST_10());
			this.setList_OWN_PROC_COST_11(struct.getList_OWN_PROC_COST_11());
			this.setList_OWN_PROC_COST_12(struct.getList_OWN_PROC_COST_12());
			this.setList_OWN_PROC_COST_SUM(struct.getList_OWN_PROC_COST_SUM());
			this.setList_UNDER_PROC_COST_01(struct.getList_UNDER_PROC_COST_01());
			this.setList_UNDER_PROC_COST_02(struct.getList_UNDER_PROC_COST_02());
			this.setList_UNDER_PROC_COST_03(struct.getList_UNDER_PROC_COST_03());
			this.setList_UNDER_PROC_COST_04(struct.getList_UNDER_PROC_COST_04());
			this.setList_UNDER_PROC_COST_05(struct.getList_UNDER_PROC_COST_05());
			this.setList_UNDER_PROC_COST_06(struct.getList_UNDER_PROC_COST_06());
			this.setList_UNDER_PROC_COST_07(struct.getList_UNDER_PROC_COST_07());
			this.setList_UNDER_PROC_COST_08(struct.getList_UNDER_PROC_COST_08());
			this.setList_UNDER_PROC_COST_09(struct.getList_UNDER_PROC_COST_09());
			this.setList_UNDER_PROC_COST_10(struct.getList_UNDER_PROC_COST_10());
			this.setList_UNDER_PROC_COST_11(struct.getList_UNDER_PROC_COST_11());
			this.setList_UNDER_PROC_COST_12(struct.getList_UNDER_PROC_COST_12());
			this.setList_UNDER_PROC_COST_SUM(struct.getList_UNDER_PROC_COST_SUM());
			this.setList_TOTAL_PROC_COST_01(struct.getList_TOTAL_PROC_COST_01());
			this.setList_TOTAL_PROC_COST_02(struct.getList_TOTAL_PROC_COST_02());
			this.setList_TOTAL_PROC_COST_03(struct.getList_TOTAL_PROC_COST_03());
			this.setList_TOTAL_PROC_COST_04(struct.getList_TOTAL_PROC_COST_04());
			this.setList_TOTAL_PROC_COST_05(struct.getList_TOTAL_PROC_COST_05());
			this.setList_TOTAL_PROC_COST_06(struct.getList_TOTAL_PROC_COST_06());
			this.setList_TOTAL_PROC_COST_07(struct.getList_TOTAL_PROC_COST_07());
			this.setList_TOTAL_PROC_COST_08(struct.getList_TOTAL_PROC_COST_08());
			this.setList_TOTAL_PROC_COST_09(struct.getList_TOTAL_PROC_COST_09());
			this.setList_TOTAL_PROC_COST_10(struct.getList_TOTAL_PROC_COST_10());
			this.setList_TOTAL_PROC_COST_11(struct.getList_TOTAL_PROC_COST_11());
			this.setList_TOTAL_PROC_COST_12(struct.getList_TOTAL_PROC_COST_12());
			this.setList_TOTAL_PROC_COST_SUM(struct.getList_TOTAL_PROC_COST_SUM());
			this.setList_PROC_COST_01_NAME(struct.getList_PROC_COST_01_NAME());
			this.setList_PROC_COST_02_NAME(struct.getList_PROC_COST_02_NAME());
			this.setList_PROC_COST_03_NAME(struct.getList_PROC_COST_03_NAME());
			this.setList_PROC_COST_04_NAME(struct.getList_PROC_COST_04_NAME());
			this.setList_PROC_COST_05_NAME(struct.getList_PROC_COST_05_NAME());
			this.setList_PROC_COST_06_NAME(struct.getList_PROC_COST_06_NAME());
			this.setList_PROC_COST_07_NAME(struct.getList_PROC_COST_07_NAME());
			this.setList_PROC_COST_08_NAME(struct.getList_PROC_COST_08_NAME());
			this.setList_PROC_COST_09_NAME(struct.getList_PROC_COST_09_NAME());
			this.setList_PROC_COST_10_NAME(struct.getList_PROC_COST_10_NAME());
			this.setList_PROC_COST_11_NAME(struct.getList_PROC_COST_11_NAME());
			this.setList_PROC_COST_12_NAME(struct.getList_PROC_COST_12_NAME());
			this.setList_HALF_TERM_TYP_DN(struct.getList_HALF_TERM_TYP_DN());
			this.setList_PUCH_ITEM_CD(struct.getList_PUCH_ITEM_CD());
			this.setList_PUCH_CS_PROC_CD(struct.getList_PUCH_CS_PROC_CD());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_UNIT_COST(struct.getList_UNIT_COST());
			this.setList_UNIT_COST_TYP_DN(struct.getList_UNIT_COST_TYP_DN());
			this.setList_CUR_UNIT(struct.getList_CUR_UNIT());
			this.setList_EXCH_RATE(struct.getList_EXCH_RATE());
			this.setList_HOME_CUR_UNIT_COST(struct.getList_HOME_CUR_UNIT_COST());
			this.setList_PUCH_UNIT_QTY(struct.getList_PUCH_UNIT_QTY());
			this.setList_SUB_VEND_CD(struct.getList_SUB_VEND_CD());
			this.setList_SUB_UNIT_COST(struct.getList_SUB_UNIT_COST());
			this.setList_SUB_UNIT_COST_TYP_DN(struct.getList_SUB_UNIT_COST_TYP_DN());
			this.setList_SUB_CUR_UNIT(struct.getList_SUB_CUR_UNIT());
			this.setList_SUB_EXCH_RATE(struct.getList_SUB_EXCH_RATE());
			this.setList_SUB_HOME_CUR_UNIT_COST(struct.getList_SUB_HOME_CUR_UNIT_COST());
			this.setList_SUB_PUCH_UNIT_QTY(struct.getList_SUB_PUCH_UNIT_QTY());
			this.setList_PUCH_STOCK_UNIT(struct.getList_PUCH_STOCK_UNIT());
			this.setList_UNIT_COST_ACCEPT_TYP_DN(struct.getList_UNIT_COST_ACCEPT_TYP_DN());
			this.setList_CS_PUCH_TYP_DN(struct.getList_CS_PUCH_TYP_DN());
			this.setList_PROC_VEND_CD(struct.getList_PROC_VEND_CD());
			this.setList_PROC_ORG_CD(struct.getList_PROC_ORG_CD());
			this.setList_PUCH_UNIT_COST(struct.getList_PUCH_UNIT_COST());
			this.setList_PUCH_PUCH_UNIT_QTY(struct.getList_PUCH_PUCH_UNIT_QTY());
			this.setList_SBCNT_UNIT_COST(struct.getList_SBCNT_UNIT_COST());
			this.setList_SBCNT_PUCH_UNIT_QTY(struct.getList_SBCNT_PUCH_UNIT_QTY());
			this.setList_PROC_COST_01(struct.getList_PROC_COST_01());
			this.setList_PROC_COST_02(struct.getList_PROC_COST_02());
			this.setList_PROC_COST_03(struct.getList_PROC_COST_03());
			this.setList_PROC_COST_04(struct.getList_PROC_COST_04());
			this.setList_PROC_COST_05(struct.getList_PROC_COST_05());
			this.setList_PROC_COST_06(struct.getList_PROC_COST_06());
			this.setList_PROC_COST_07(struct.getList_PROC_COST_07());
			this.setList_PROC_COST_08(struct.getList_PROC_COST_08());
			this.setList_PROC_COST_09(struct.getList_PROC_COST_09());
			this.setList_PROC_COST_10(struct.getList_PROC_COST_10());
			this.setList_PROC_COST_11(struct.getList_PROC_COST_11());
			this.setList_PROC_COST_12(struct.getList_PROC_COST_12());
			this.setList_PROC_COST_STOCK_UNIT(struct.getList_PROC_COST_STOCK_UNIT());
			this.setList_CS_PUCH_TYP_VALUE(struct.getList_CS_PUCH_TYP_VALUE());
			this.setList_CURRENT_YEAR(struct.getList_CURRENT_YEAR());
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
	// �� 1 �ϐ������l�F i_HALF_TERM_TYP_name


	final static String i_HALF_TERM_TYP_name = null;

	// �� 2 �ϐ������l�F i_HALF_TERM_TYP_val


	final static String i_HALF_TERM_TYP_val = null;

	// �� 3 �ϐ������l�F i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// �� 4 �ϐ������l�F i_COST_TYP_DN


	final static String i_COST_TYP_DN = null;

	// �� 5 �ϐ������l�F i_OUTSIDE_TYP_DN


	final static String i_OUTSIDE_TYP_DN = null;

	// �� 6 �ϐ������l�F i_PROC_OUTSIDE_TYP_DN


	final static String i_PROC_OUTSIDE_TYP_DN = null;

	// �� 7 �ϐ������l�F i_DMY_ITEM_FLG_DN


	final static String i_DMY_ITEM_FLG_DN = null;

	// �� 8 �ϐ������l�F i_VOLUNT_SPL_FLG_DN


	final static String i_VOLUNT_SPL_FLG_DN = null;

	// �� 9 �ϐ������l�F i_COST_UP_TYP_DN


	final static String i_COST_UP_TYP_DN = null;

	// �� 10 �ϐ������l�F i_ONEROUS_CONS_FLG_DN


	final static String i_ONEROUS_CONS_FLG_DN = null;

	// �� 11 �ϐ������l�F i_UPPER_ITEM_FLG_DN


	final static String i_UPPER_ITEM_FLG_DN = null;

	// �� 12 �ϐ������l�F i_LOWER_ITEM_FLG_DN


	final static String i_LOWER_ITEM_FLG_DN = null;

	// �� 13 �ϐ������l�F i_COST_EXCLUDE_FLG_DN


	final static String i_COST_EXCLUDE_FLG_DN = null;

	// �� 14 �ϐ������l�F i_l_ROOT_ITEM_CD


	final static String i_l_ROOT_ITEM_CD = null;

	// �� 15 �ϐ������l�F i_l_ROOT_ITEM_NAME


	final static String i_l_ROOT_ITEM_NAME = null;

	// �� 16 �ϐ������l�F i_l_CLASIFICATION_CD


	final static String i_l_CLASIFICATION_CD = null;

	// �� 17 �ϐ������l�F i_l_CS_PROC_CD


	final static String i_l_CS_PROC_CD = null;

	// �� 18 �ϐ������l�F i_l_CS_PROC_NAME


	final static String i_l_CS_PROC_NAME = null;

	// �� 19 �ϐ������l�F i_l_NECESSARY_QTY


	final static String i_l_NECESSARY_QTY = null;

	// �� 20 �ϐ������l�F i_l_STOCK_UNIT


	final static String i_l_STOCK_UNIT = null;

	// �� 21 �ϐ������l�F i_l_ITEM_INPUT_RATIO


	final static String i_l_ITEM_INPUT_RATIO = null;

	// �� 22 �ϐ������l�F i_l_HOME_CUR_UNIT


	final static String i_l_HOME_CUR_UNIT = null;

	// �� 23 �ϐ������l�F i_l_TOTAL_COST


	final static String i_l_TOTAL_COST = null;

	// �� 24 �ϐ������l�F i_l_TOTAL_MATR_COST


	final static String i_l_TOTAL_MATR_COST = null;

	// �� 25 �ϐ������l�F i_l_TOTAL_SBCNT_MATR_COST


	final static String i_l_TOTAL_SBCNT_MATR_COST = null;

	// �� 26 �ϐ������l�F i_l_TOTAL_PROC_COST_SUM_ALL


	final static String i_l_TOTAL_PROC_COST_SUM_ALL = null;

	// �� 27 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 28 �ϐ������l�F i_YEAR


	final static String i_YEAR = null;

	// �� 29 �ϐ������l�F i_HALF_TERM_TYP


	final static String i_HALF_TERM_TYP = null;

	// �� 30 �ϐ������l�F i_ROOT_ITEM_CD


	final static String i_ROOT_ITEM_CD = null;

	// �� 31 �ϐ������l�F i_CLASIFICATION_CD


	final static String i_CLASIFICATION_CD = null;

	// �� 32 �ϐ������l�F i_COST_TYP


	final static String i_COST_TYP = null;

	// �� 33 �ϐ������l�F i_PLANT_NAME


	final static String i_PLANT_NAME = null;

	// �� 34 �ϐ������l�F i_ROOT_ITEM_NAME


	final static String i_ROOT_ITEM_NAME = null;

	// �� 35 �ϐ������l�F i_PARENT_ITEM_CD


	final static String i_PARENT_ITEM_CD = null;

	// �� 36 �ϐ������l�F i_PARENT_ITEM_NAME


	final static String i_PARENT_ITEM_NAME = null;

	// �� 37 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 38 �ϐ������l�F i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// �� 39 �ϐ������l�F i_PS_EDITION


	final static String i_PS_EDITION = null;

	// �� 40 �ϐ������l�F i_COST_STATEMENT_NO


	final static String i_COST_STATEMENT_NO = null;

	// �� 41 �ϐ������l�F i_CS_PROC_CD


	final static String i_CS_PROC_CD = null;

	// �� 42 �ϐ������l�F i_CS_PROC_NAME


	final static String i_CS_PROC_NAME = null;

	// �� 43 �ϐ������l�F i_WS_CD


	final static String i_WS_CD = null;

	// �� 44 �ϐ������l�F i_WS_NAME


	final static String i_WS_NAME = null;

	// �� 45 �ϐ������l�F i_ORG_CD


	final static String i_ORG_CD = null;

	// �� 46 �ϐ������l�F i_ORG_NAME


	final static String i_ORG_NAME = null;

	// �� 47 �ϐ������l�F i_NECESSARY_QTY


	final static String i_NECESSARY_QTY = null;

	// �� 48 �ϐ������l�F i_PS_INPUT_RATIO


	final static String i_PS_INPUT_RATIO = null;

	// �� 49 �ϐ������l�F i_ITEM_INPUT_RATIO


	final static String i_ITEM_INPUT_RATIO = null;

	// �� 50 �ϐ������l�F i_TOTAL_COST


	final static String i_TOTAL_COST = null;

	// �� 51 �ϐ������l�F i_OWN_MATR_COST


	final static String i_OWN_MATR_COST = null;

	// �� 52 �ϐ������l�F i_UNDER_MATR_COST


	final static String i_UNDER_MATR_COST = null;

	// �� 53 �ϐ������l�F i_TOTAL_MATR_COST


	final static String i_TOTAL_MATR_COST = null;

	// �� 54 �ϐ������l�F i_OWN_SBCNT_MATR_COST


	final static String i_OWN_SBCNT_MATR_COST = null;

	// �� 55 �ϐ������l�F i_UNDER_SBCNT_MATR_COST


	final static String i_UNDER_SBCNT_MATR_COST = null;

	// �� 56 �ϐ������l�F i_TOTAL_SBCNT_MATR_COST


	final static String i_TOTAL_SBCNT_MATR_COST = null;

	// �� 57 �ϐ������l�F i_OWN_PROC_COST_SUM_ALL


	final static String i_OWN_PROC_COST_SUM_ALL = null;

	// �� 58 �ϐ������l�F i_UNDER_PROC_COST_SUM_ALL


	final static String i_UNDER_PROC_COST_SUM_ALL = null;

	// �� 59 �ϐ������l�F i_TOTAL_PROC_COST_SUM_ALL


	final static String i_TOTAL_PROC_COST_SUM_ALL = null;

	// �� 60 �ϐ������l�F i_HOME_CUR_UNIT


	final static String i_HOME_CUR_UNIT = null;

	// �� 61 �ϐ������l�F i_EFF_PHASE_IN_DATE


	final static String i_EFF_PHASE_IN_DATE = null;

	// �� 62 �ϐ������l�F i_EFF_PHASE_OUT_DATE


	final static String i_EFF_PHASE_OUT_DATE = null;

	// �� 63 �ϐ������l�F i_PS_UNIT_DENOMINATOR


	final static String i_PS_UNIT_DENOMINATOR = null;

	// �� 64 �ϐ������l�F i_PS_UNIT_NUMERATOR


	final static String i_PS_UNIT_NUMERATOR = null;

	// �� 65 �ϐ������l�F i_PARENT_COST_STATEMENT_NO


	final static String i_PARENT_COST_STATEMENT_NO = null;

	// �� 66 �ϐ������l�F i_PARENT_ITEM_STOCK_UNIT


	final static String i_PARENT_ITEM_STOCK_UNIT = null;

	// �� 67 �ϐ������l�F i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// �� 68 �ϐ������l�F i_OUTSIDE_TYP


	final static String i_OUTSIDE_TYP = null;

	// �� 69 �ϐ������l�F i_PROC_OUTSIDE_TYP


	final static String i_PROC_OUTSIDE_TYP = null;

	// �� 70 �ϐ������l�F i_DMY_ITEM_FLG


	final static String i_DMY_ITEM_FLG = null;

	// �� 71 �ϐ������l�F i_VOLUNT_SPL_FLG


	final static String i_VOLUNT_SPL_FLG = null;

	// �� 72 �ϐ������l�F i_COST_UP_TYP


	final static String i_COST_UP_TYP = null;

	// �� 73 �ϐ������l�F i_ONEROUS_CONS_FLG


	final static String i_ONEROUS_CONS_FLG = null;

	// �� 74 �ϐ������l�F i_UP_LEVEL_NO


	final static String i_UP_LEVEL_NO = null;

	// �� 75 �ϐ������l�F i_UPPER_ITEM_FLG


	final static String i_UPPER_ITEM_FLG = null;

	// �� 76 �ϐ������l�F i_LOWER_ITEM_FLG


	final static String i_LOWER_ITEM_FLG = null;

	// �� 77 �ϐ������l�F i_COST_EXCLUDE_FLG


	final static String i_COST_EXCLUDE_FLG = null;

	// �� 78 �ϐ������l�F i_CREATED_DATE


	final static String i_CREATED_DATE = null;

	// �� 79 �ϐ������l�F i_CREATED_BY


	final static String i_CREATED_BY = null;

	// �� 80 �ϐ������l�F i_CREATED_PRG_NM


	final static String i_CREATED_PRG_NM = null;

	// �� 81 �ϐ������l�F i_UPDATED_DATE


	final static String i_UPDATED_DATE = null;

	// �� 82 �ϐ������l�F i_UPDATED_BY


	final static String i_UPDATED_BY = null;

	// �� 83 �ϐ������l�F i_UPDATED_PRG_NM


	final static String i_UPDATED_PRG_NM = null;

	// �� 84 �ϐ������l�F i_PROC_COST_CLS_CD


	final static String i_PROC_COST_CLS_CD = null;

	// �� 85 �ϐ������l�F i_PROC_COST_CLS_NAME


	final static String i_PROC_COST_CLS_NAME = null;

	// �� 86 �ϐ������l�F i_PROC_COST_UNIT_QTY


	final static String i_PROC_COST_UNIT_QTY = null;

	// �� 87 �ϐ������l�F i_PROC_COST_UNIT_QTY_UNIT


	final static String i_PROC_COST_UNIT_QTY_UNIT = null;

	// �� 88 �ϐ������l�F i_OWN_PROC_COST_01


	final static String i_OWN_PROC_COST_01 = null;

	// �� 89 �ϐ������l�F i_OWN_PROC_COST_02


	final static String i_OWN_PROC_COST_02 = null;

	// �� 90 �ϐ������l�F i_OWN_PROC_COST_03


	final static String i_OWN_PROC_COST_03 = null;

	// �� 91 �ϐ������l�F i_OWN_PROC_COST_04


	final static String i_OWN_PROC_COST_04 = null;

	// �� 92 �ϐ������l�F i_OWN_PROC_COST_05


	final static String i_OWN_PROC_COST_05 = null;

	// �� 93 �ϐ������l�F i_OWN_PROC_COST_06


	final static String i_OWN_PROC_COST_06 = null;

	// �� 94 �ϐ������l�F i_OWN_PROC_COST_07


	final static String i_OWN_PROC_COST_07 = null;

	// �� 95 �ϐ������l�F i_OWN_PROC_COST_08


	final static String i_OWN_PROC_COST_08 = null;

	// �� 96 �ϐ������l�F i_OWN_PROC_COST_09


	final static String i_OWN_PROC_COST_09 = null;

	// �� 97 �ϐ������l�F i_OWN_PROC_COST_10


	final static String i_OWN_PROC_COST_10 = null;

	// �� 98 �ϐ������l�F i_OWN_PROC_COST_11


	final static String i_OWN_PROC_COST_11 = null;

	// �� 99 �ϐ������l�F i_OWN_PROC_COST_12


	final static String i_OWN_PROC_COST_12 = null;

	// �� 100 �ϐ������l�F i_OWN_PROC_COST_SUM


	final static String i_OWN_PROC_COST_SUM = null;

	// �� 101 �ϐ������l�F i_UNDER_PROC_COST_01


	final static String i_UNDER_PROC_COST_01 = null;

	// �� 102 �ϐ������l�F i_UNDER_PROC_COST_02


	final static String i_UNDER_PROC_COST_02 = null;

	// �� 103 �ϐ������l�F i_UNDER_PROC_COST_03


	final static String i_UNDER_PROC_COST_03 = null;

	// �� 104 �ϐ������l�F i_UNDER_PROC_COST_04


	final static String i_UNDER_PROC_COST_04 = null;

	// �� 105 �ϐ������l�F i_UNDER_PROC_COST_05


	final static String i_UNDER_PROC_COST_05 = null;

	// �� 106 �ϐ������l�F i_UNDER_PROC_COST_06


	final static String i_UNDER_PROC_COST_06 = null;

	// �� 107 �ϐ������l�F i_UNDER_PROC_COST_07


	final static String i_UNDER_PROC_COST_07 = null;

	// �� 108 �ϐ������l�F i_UNDER_PROC_COST_08


	final static String i_UNDER_PROC_COST_08 = null;

	// �� 109 �ϐ������l�F i_UNDER_PROC_COST_09


	final static String i_UNDER_PROC_COST_09 = null;

	// �� 110 �ϐ������l�F i_UNDER_PROC_COST_10


	final static String i_UNDER_PROC_COST_10 = null;

	// �� 111 �ϐ������l�F i_UNDER_PROC_COST_11


	final static String i_UNDER_PROC_COST_11 = null;

	// �� 112 �ϐ������l�F i_UNDER_PROC_COST_12


	final static String i_UNDER_PROC_COST_12 = null;

	// �� 113 �ϐ������l�F i_UNDER_PROC_COST_SUM


	final static String i_UNDER_PROC_COST_SUM = null;

	// �� 114 �ϐ������l�F i_TOTAL_PROC_COST_01


	final static String i_TOTAL_PROC_COST_01 = null;

	// �� 115 �ϐ������l�F i_TOTAL_PROC_COST_02


	final static String i_TOTAL_PROC_COST_02 = null;

	// �� 116 �ϐ������l�F i_TOTAL_PROC_COST_03


	final static String i_TOTAL_PROC_COST_03 = null;

	// �� 117 �ϐ������l�F i_TOTAL_PROC_COST_04


	final static String i_TOTAL_PROC_COST_04 = null;

	// �� 118 �ϐ������l�F i_TOTAL_PROC_COST_05


	final static String i_TOTAL_PROC_COST_05 = null;

	// �� 119 �ϐ������l�F i_TOTAL_PROC_COST_06


	final static String i_TOTAL_PROC_COST_06 = null;

	// �� 120 �ϐ������l�F i_TOTAL_PROC_COST_07


	final static String i_TOTAL_PROC_COST_07 = null;

	// �� 121 �ϐ������l�F i_TOTAL_PROC_COST_08


	final static String i_TOTAL_PROC_COST_08 = null;

	// �� 122 �ϐ������l�F i_TOTAL_PROC_COST_09


	final static String i_TOTAL_PROC_COST_09 = null;

	// �� 123 �ϐ������l�F i_TOTAL_PROC_COST_10


	final static String i_TOTAL_PROC_COST_10 = null;

	// �� 124 �ϐ������l�F i_TOTAL_PROC_COST_11


	final static String i_TOTAL_PROC_COST_11 = null;

	// �� 125 �ϐ������l�F i_TOTAL_PROC_COST_12


	final static String i_TOTAL_PROC_COST_12 = null;

	// �� 126 �ϐ������l�F i_TOTAL_PROC_COST_SUM


	final static String i_TOTAL_PROC_COST_SUM = null;

	// �� 127 �ϐ������l�F i_PROC_COST_01_NAME


	final static String i_PROC_COST_01_NAME = null;

	// �� 128 �ϐ������l�F i_PROC_COST_02_NAME


	final static String i_PROC_COST_02_NAME = null;

	// �� 129 �ϐ������l�F i_PROC_COST_03_NAME


	final static String i_PROC_COST_03_NAME = null;

	// �� 130 �ϐ������l�F i_PROC_COST_04_NAME


	final static String i_PROC_COST_04_NAME = null;

	// �� 131 �ϐ������l�F i_PROC_COST_05_NAME


	final static String i_PROC_COST_05_NAME = null;

	// �� 132 �ϐ������l�F i_PROC_COST_06_NAME


	final static String i_PROC_COST_06_NAME = null;

	// �� 133 �ϐ������l�F i_PROC_COST_07_NAME


	final static String i_PROC_COST_07_NAME = null;

	// �� 134 �ϐ������l�F i_PROC_COST_08_NAME


	final static String i_PROC_COST_08_NAME = null;

	// �� 135 �ϐ������l�F i_PROC_COST_09_NAME


	final static String i_PROC_COST_09_NAME = null;

	// �� 136 �ϐ������l�F i_PROC_COST_10_NAME


	final static String i_PROC_COST_10_NAME = null;

	// �� 137 �ϐ������l�F i_PROC_COST_11_NAME


	final static String i_PROC_COST_11_NAME = null;

	// �� 138 �ϐ������l�F i_PROC_COST_12_NAME


	final static String i_PROC_COST_12_NAME = null;

	// �� 139 �ϐ������l�F i_HALF_TERM_TYP_DN


	final static String i_HALF_TERM_TYP_DN = null;

	// �� 140 �ϐ������l�F i_PUCH_ITEM_CD


	final static String i_PUCH_ITEM_CD = null;

	// �� 141 �ϐ������l�F i_PUCH_CS_PROC_CD


	final static String i_PUCH_CS_PROC_CD = null;

	// �� 142 �ϐ������l�F i_VEND_CD


	final static String i_VEND_CD = null;

	// �� 143 �ϐ������l�F i_UNIT_COST


	final static String i_UNIT_COST = null;

	// �� 144 �ϐ������l�F i_UNIT_COST_TYP_DN


	final static String i_UNIT_COST_TYP_DN = null;

	// �� 145 �ϐ������l�F i_CUR_UNIT


	final static String i_CUR_UNIT = null;

	// �� 146 �ϐ������l�F i_EXCH_RATE


	final static String i_EXCH_RATE = null;

	// �� 147 �ϐ������l�F i_HOME_CUR_UNIT_COST


	final static String i_HOME_CUR_UNIT_COST = null;

	// �� 148 �ϐ������l�F i_PUCH_UNIT_QTY


	final static String i_PUCH_UNIT_QTY = null;

	// �� 149 �ϐ������l�F i_SUB_VEND_CD


	final static String i_SUB_VEND_CD = null;

	// �� 150 �ϐ������l�F i_SUB_UNIT_COST


	final static String i_SUB_UNIT_COST = null;

	// �� 151 �ϐ������l�F i_SUB_UNIT_COST_TYP_DN


	final static String i_SUB_UNIT_COST_TYP_DN = null;

	// �� 152 �ϐ������l�F i_SUB_CUR_UNIT


	final static String i_SUB_CUR_UNIT = null;

	// �� 153 �ϐ������l�F i_SUB_EXCH_RATE


	final static String i_SUB_EXCH_RATE = null;

	// �� 154 �ϐ������l�F i_SUB_HOME_CUR_UNIT_COST


	final static String i_SUB_HOME_CUR_UNIT_COST = null;

	// �� 155 �ϐ������l�F i_SUB_PUCH_UNIT_QTY


	final static String i_SUB_PUCH_UNIT_QTY = null;

	// �� 156 �ϐ������l�F i_PUCH_STOCK_UNIT


	final static String i_PUCH_STOCK_UNIT = null;

	// �� 157 �ϐ������l�F i_UNIT_COST_ACCEPT_TYP_DN


	final static String i_UNIT_COST_ACCEPT_TYP_DN = null;

	// �� 158 �ϐ������l�F i_CS_PUCH_TYP_DN


	final static String i_CS_PUCH_TYP_DN = null;

	// �� 159 �ϐ������l�F i_PROC_VEND_CD


	final static String i_PROC_VEND_CD = null;

	// �� 160 �ϐ������l�F i_PROC_ORG_CD


	final static String i_PROC_ORG_CD = null;

	// �� 161 �ϐ������l�F i_PUCH_UNIT_COST


	final static String i_PUCH_UNIT_COST = null;

	// �� 162 �ϐ������l�F i_PUCH_PUCH_UNIT_QTY


	final static String i_PUCH_PUCH_UNIT_QTY = null;

	// �� 163 �ϐ������l�F i_SBCNT_UNIT_COST


	final static String i_SBCNT_UNIT_COST = null;

	// �� 164 �ϐ������l�F i_SBCNT_PUCH_UNIT_QTY


	final static String i_SBCNT_PUCH_UNIT_QTY = null;

	// �� 165 �ϐ������l�F i_PROC_COST_01


	final static String i_PROC_COST_01 = null;

	// �� 166 �ϐ������l�F i_PROC_COST_02


	final static String i_PROC_COST_02 = null;

	// �� 167 �ϐ������l�F i_PROC_COST_03


	final static String i_PROC_COST_03 = null;

	// �� 168 �ϐ������l�F i_PROC_COST_04


	final static String i_PROC_COST_04 = null;

	// �� 169 �ϐ������l�F i_PROC_COST_05


	final static String i_PROC_COST_05 = null;

	// �� 170 �ϐ������l�F i_PROC_COST_06


	final static String i_PROC_COST_06 = null;

	// �� 171 �ϐ������l�F i_PROC_COST_07


	final static String i_PROC_COST_07 = null;

	// �� 172 �ϐ������l�F i_PROC_COST_08


	final static String i_PROC_COST_08 = null;

	// �� 173 �ϐ������l�F i_PROC_COST_09


	final static String i_PROC_COST_09 = null;

	// �� 174 �ϐ������l�F i_PROC_COST_10


	final static String i_PROC_COST_10 = null;

	// �� 175 �ϐ������l�F i_PROC_COST_11


	final static String i_PROC_COST_11 = null;

	// �� 176 �ϐ������l�F i_PROC_COST_12


	final static String i_PROC_COST_12 = null;

	// �� 177 �ϐ������l�F i_PROC_COST_STOCK_UNIT


	final static String i_PROC_COST_STOCK_UNIT = null;

	// �� 178 �ϐ������l�F i_CS_PUCH_TYP_VALUE


	final static String i_CS_PUCH_TYP_VALUE = null;

	// �� 179 �ϐ������l�F i_CURRENT_YEAR


	final static String i_CURRENT_YEAR = null;

	// �� 180 �ϐ������l�F i_l_COUNT


	final static String i_l_COUNT = null;

	// �� 181 �ϐ������l�F i_ROW_COUNT


	final static String i_ROW_COUNT = null;

*/

	//{{user_implement_code
		// TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
		// �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
	// �� 1 �ϐ������l�F i_HALF_TERM_TYP_name

	final static String i_HALF_TERM_TYP_name = null;

	// �� 2 �ϐ������l�F i_HALF_TERM_TYP_val

	final static String i_HALF_TERM_TYP_val = null;

	// �� 3 �ϐ������l�F i_DOWNLOAD_FILE

	final static String i_DOWNLOAD_FILE = null;

	// �� 4 �ϐ������l�F i_COST_TYP_DN

	final static String i_COST_TYP_DN = null;

	// �� 5 �ϐ������l�F i_OUTSIDE_TYP_DN

	final static String i_OUTSIDE_TYP_DN = null;

	// �� 6 �ϐ������l�F i_PROC_OUTSIDE_TYP_DN

	final static String i_PROC_OUTSIDE_TYP_DN = null;

	// �� 7 �ϐ������l�F i_DMY_ITEM_FLG_DN

	final static String i_DMY_ITEM_FLG_DN = null;

	// �� 8 �ϐ������l�F i_VOLUNT_SPL_FLG_DN

	final static String i_VOLUNT_SPL_FLG_DN = null;

	// �� 9 �ϐ������l�F i_COST_UP_TYP_DN

	final static String i_COST_UP_TYP_DN = null;

	// �� 10 �ϐ������l�F i_ONEROUS_CONS_FLG_DN

	final static String i_ONEROUS_CONS_FLG_DN = null;

	// �� 11 �ϐ������l�F i_UPPER_ITEM_FLG_DN

	final static String i_UPPER_ITEM_FLG_DN = null;

	// �� 12 �ϐ������l�F i_LOWER_ITEM_FLG_DN

	final static String i_LOWER_ITEM_FLG_DN = null;

	// �� 13 �ϐ������l�F i_COST_EXCLUDE_FLG_DN

	final static String i_COST_EXCLUDE_FLG_DN = null;

	// �� 14 �ϐ������l�F i_l_ROOT_ITEM_CD

	final static String i_l_ROOT_ITEM_CD = null;

	// �� 15 �ϐ������l�F i_l_ROOT_ITEM_NAME

	final static String i_l_ROOT_ITEM_NAME = null;

	// �� 16 �ϐ������l�F i_l_CLASIFICATION_CD

	final static String i_l_CLASIFICATION_CD = null;

	// �� 17 �ϐ������l�F i_l_CS_PROC_CD

	final static String i_l_CS_PROC_CD = null;

	// �� 18 �ϐ������l�F i_l_CS_PROC_NAME

	final static String i_l_CS_PROC_NAME = null;

	// �� 19 �ϐ������l�F i_l_NECESSARY_QTY

	final static String i_l_NECESSARY_QTY = null;

	// �� 20 �ϐ������l�F i_l_STOCK_UNIT

	final static String i_l_STOCK_UNIT = null;

	// �� 21 �ϐ������l�F i_l_ITEM_INPUT_RATIO

	final static String i_l_ITEM_INPUT_RATIO = null;

	// �� 22 �ϐ������l�F i_l_HOME_CUR_UNIT

	final static String i_l_HOME_CUR_UNIT = null;

	// �� 23 �ϐ������l�F i_l_TOTAL_COST

	final static String i_l_TOTAL_COST = null;

	// �� 24 �ϐ������l�F i_l_TOTAL_MATR_COST

	final static String i_l_TOTAL_MATR_COST = null;

	// �� 25 �ϐ������l�F i_l_TOTAL_SBCNT_MATR_COST

	final static String i_l_TOTAL_SBCNT_MATR_COST = null;

	// �� 26 �ϐ������l�F i_l_TOTAL_PROC_COST_SUM_ALL

	final static String i_l_TOTAL_PROC_COST_SUM_ALL = null;

	// �� 27 �ϐ������l�F i_PLANT_CD

	final static String i_PLANT_CD = null;

	// �� 28 �ϐ������l�F i_YEAR

	final static String i_YEAR = null;

	// �� 29 �ϐ������l�F i_HALF_TERM_TYP

	final static String i_HALF_TERM_TYP = null;

	// �� 30 �ϐ������l�F i_ROOT_ITEM_CD

	final static String i_ROOT_ITEM_CD = null;

	// �� 31 �ϐ������l�F i_CLASIFICATION_CD

	final static String i_CLASIFICATION_CD = null;

	// �� 32 �ϐ������l�F i_COST_TYP

	final static String i_COST_TYP = null;

	// �� 33 �ϐ������l�F i_PLANT_NAME

	final static String i_PLANT_NAME = null;

	// �� 34 �ϐ������l�F i_ROOT_ITEM_NAME

	final static String i_ROOT_ITEM_NAME = null;

	// �� 35 �ϐ������l�F i_PARENT_ITEM_CD

	final static String i_PARENT_ITEM_CD = null;

	// �� 36 �ϐ������l�F i_PARENT_ITEM_NAME

	final static String i_PARENT_ITEM_NAME = null;

	// �� 37 �ϐ������l�F i_ITEM_CD

	final static String i_ITEM_CD = null;

	// �� 38 �ϐ������l�F i_ITEM_NAME

	final static String i_ITEM_NAME = null;

	// �� 39 �ϐ������l�F i_PS_EDITION

	final static String i_PS_EDITION = null;

	// �� 40 �ϐ������l�F i_COST_STATEMENT_NO

	final static String i_COST_STATEMENT_NO = null;

	// �� 41 �ϐ������l�F i_CS_PROC_CD

	final static String i_CS_PROC_CD = null;

	// �� 42 �ϐ������l�F i_CS_PROC_NAME

	final static String i_CS_PROC_NAME = null;

	// �� 43 �ϐ������l�F i_WS_CD

	final static String i_WS_CD = null;

	// �� 44 �ϐ������l�F i_WS_NAME

	final static String i_WS_NAME = null;

	// �� 45 �ϐ������l�F i_ORG_CD

	final static String i_ORG_CD = null;

	// �� 46 �ϐ������l�F i_ORG_NAME

	final static String i_ORG_NAME = null;

	// �� 47 �ϐ������l�F i_NECESSARY_QTY

	final static String i_NECESSARY_QTY = null;

	// �� 48 �ϐ������l�F i_PS_INPUT_RATIO

	final static String i_PS_INPUT_RATIO = null;

	// �� 49 �ϐ������l�F i_ITEM_INPUT_RATIO

	final static String i_ITEM_INPUT_RATIO = null;

	// �� 50 �ϐ������l�F i_TOTAL_COST

	final static String i_TOTAL_COST = null;

	// �� 51 �ϐ������l�F i_OWN_MATR_COST

	final static String i_OWN_MATR_COST = null;

	// �� 52 �ϐ������l�F i_UNDER_MATR_COST

	final static String i_UNDER_MATR_COST = null;

	// �� 53 �ϐ������l�F i_TOTAL_MATR_COST

	final static String i_TOTAL_MATR_COST = null;

	// �� 54 �ϐ������l�F i_OWN_SBCNT_MATR_COST

	final static String i_OWN_SBCNT_MATR_COST = null;

	// �� 55 �ϐ������l�F i_UNDER_SBCNT_MATR_COST

	final static String i_UNDER_SBCNT_MATR_COST = null;

	// �� 56 �ϐ������l�F i_TOTAL_SBCNT_MATR_COST

	final static String i_TOTAL_SBCNT_MATR_COST = null;

	// �� 57 �ϐ������l�F i_OWN_PROC_COST_SUM_ALL

	final static String i_OWN_PROC_COST_SUM_ALL = null;

	// �� 58 �ϐ������l�F i_UNDER_PROC_COST_SUM_ALL

	final static String i_UNDER_PROC_COST_SUM_ALL = null;

	// �� 59 �ϐ������l�F i_TOTAL_PROC_COST_SUM_ALL

	final static String i_TOTAL_PROC_COST_SUM_ALL = null;

	// �� 60 �ϐ������l�F i_HOME_CUR_UNIT

	final static String i_HOME_CUR_UNIT = null;

	// �� 61 �ϐ������l�F i_EFF_PHASE_IN_DATE

	final static String i_EFF_PHASE_IN_DATE = null;

	// �� 62 �ϐ������l�F i_EFF_PHASE_OUT_DATE

	final static String i_EFF_PHASE_OUT_DATE = null;

	// �� 63 �ϐ������l�F i_PS_UNIT_DENOMINATOR

	final static String i_PS_UNIT_DENOMINATOR = null;

	// �� 64 �ϐ������l�F i_PS_UNIT_NUMERATOR

	final static String i_PS_UNIT_NUMERATOR = null;

	// �� 65 �ϐ������l�F i_PARENT_COST_STATEMENT_NO

	final static String i_PARENT_COST_STATEMENT_NO = null;

	// �� 66 �ϐ������l�F i_PARENT_ITEM_STOCK_UNIT

	final static String i_PARENT_ITEM_STOCK_UNIT = null;

	// �� 67 �ϐ������l�F i_STOCK_UNIT

	final static String i_STOCK_UNIT = null;

	// �� 68 �ϐ������l�F i_OUTSIDE_TYP

	final static String i_OUTSIDE_TYP = null;

	// �� 69 �ϐ������l�F i_PROC_OUTSIDE_TYP

	final static String i_PROC_OUTSIDE_TYP = null;

	// �� 70 �ϐ������l�F i_DMY_ITEM_FLG

	final static String i_DMY_ITEM_FLG = null;

	// �� 71 �ϐ������l�F i_VOLUNT_SPL_FLG

	final static String i_VOLUNT_SPL_FLG = null;

	// �� 72 �ϐ������l�F i_COST_UP_TYP

	final static String i_COST_UP_TYP = null;

	// �� 73 �ϐ������l�F i_ONEROUS_CONS_FLG

	final static String i_ONEROUS_CONS_FLG = null;

	// �� 74 �ϐ������l�F i_UP_LEVEL_NO

	final static String i_UP_LEVEL_NO = null;

	// �� 75 �ϐ������l�F i_UPPER_ITEM_FLG

	final static String i_UPPER_ITEM_FLG = null;

	// �� 76 �ϐ������l�F i_LOWER_ITEM_FLG

	final static String i_LOWER_ITEM_FLG = null;

	// �� 77 �ϐ������l�F i_COST_EXCLUDE_FLG

	final static String i_COST_EXCLUDE_FLG = null;

	// �� 78 �ϐ������l�F i_CREATED_DATE

	final static String i_CREATED_DATE = null;

	// �� 79 �ϐ������l�F i_CREATED_BY

	final static String i_CREATED_BY = null;

	// �� 80 �ϐ������l�F i_CREATED_PRG_NM

	final static String i_CREATED_PRG_NM = null;

	// �� 81 �ϐ������l�F i_UPDATED_DATE

	final static String i_UPDATED_DATE = null;

	// �� 82 �ϐ������l�F i_UPDATED_BY

	final static String i_UPDATED_BY = null;

	// �� 83 �ϐ������l�F i_UPDATED_PRG_NM

	final static String i_UPDATED_PRG_NM = null;

	// �� 84 �ϐ������l�F i_PROC_COST_CLS_CD

	final static String i_PROC_COST_CLS_CD = null;

	// �� 85 �ϐ������l�F i_PROC_COST_CLS_NAME

	final static String i_PROC_COST_CLS_NAME = null;

	// �� 86 �ϐ������l�F i_PROC_COST_UNIT_QTY

	final static String i_PROC_COST_UNIT_QTY = null;

	// �� 87 �ϐ������l�F i_PROC_COST_UNIT_QTY_UNIT

	final static String i_PROC_COST_UNIT_QTY_UNIT = null;

	// �� 88 �ϐ������l�F i_OWN_PROC_COST_01

	final static String i_OWN_PROC_COST_01 = null;

	// �� 89 �ϐ������l�F i_OWN_PROC_COST_02

	final static String i_OWN_PROC_COST_02 = null;

	// �� 90 �ϐ������l�F i_OWN_PROC_COST_03

	final static String i_OWN_PROC_COST_03 = null;

	// �� 91 �ϐ������l�F i_OWN_PROC_COST_04

	final static String i_OWN_PROC_COST_04 = null;

	// �� 92 �ϐ������l�F i_OWN_PROC_COST_05

	final static String i_OWN_PROC_COST_05 = null;

	// �� 93 �ϐ������l�F i_OWN_PROC_COST_06

	final static String i_OWN_PROC_COST_06 = null;

	// �� 94 �ϐ������l�F i_OWN_PROC_COST_07

	final static String i_OWN_PROC_COST_07 = null;

	// �� 95 �ϐ������l�F i_OWN_PROC_COST_08

	final static String i_OWN_PROC_COST_08 = null;

	// �� 96 �ϐ������l�F i_OWN_PROC_COST_09

	final static String i_OWN_PROC_COST_09 = null;

	// �� 97 �ϐ������l�F i_OWN_PROC_COST_10

	final static String i_OWN_PROC_COST_10 = null;

	// �� 98 �ϐ������l�F i_OWN_PROC_COST_11

	final static String i_OWN_PROC_COST_11 = null;

	// �� 99 �ϐ������l�F i_OWN_PROC_COST_12

	final static String i_OWN_PROC_COST_12 = null;

	// �� 100 �ϐ������l�F i_OWN_PROC_COST_SUM

	final static String i_OWN_PROC_COST_SUM = null;

	// �� 101 �ϐ������l�F i_UNDER_PROC_COST_01

	final static String i_UNDER_PROC_COST_01 = null;

	// �� 102 �ϐ������l�F i_UNDER_PROC_COST_02

	final static String i_UNDER_PROC_COST_02 = null;

	// �� 103 �ϐ������l�F i_UNDER_PROC_COST_03

	final static String i_UNDER_PROC_COST_03 = null;

	// �� 104 �ϐ������l�F i_UNDER_PROC_COST_04

	final static String i_UNDER_PROC_COST_04 = null;

	// �� 105 �ϐ������l�F i_UNDER_PROC_COST_05

	final static String i_UNDER_PROC_COST_05 = null;

	// �� 106 �ϐ������l�F i_UNDER_PROC_COST_06

	final static String i_UNDER_PROC_COST_06 = null;

	// �� 107 �ϐ������l�F i_UNDER_PROC_COST_07

	final static String i_UNDER_PROC_COST_07 = null;

	// �� 108 �ϐ������l�F i_UNDER_PROC_COST_08

	final static String i_UNDER_PROC_COST_08 = null;

	// �� 109 �ϐ������l�F i_UNDER_PROC_COST_09

	final static String i_UNDER_PROC_COST_09 = null;

	// �� 110 �ϐ������l�F i_UNDER_PROC_COST_10

	final static String i_UNDER_PROC_COST_10 = null;

	// �� 111 �ϐ������l�F i_UNDER_PROC_COST_11

	final static String i_UNDER_PROC_COST_11 = null;

	// �� 112 �ϐ������l�F i_UNDER_PROC_COST_12

	final static String i_UNDER_PROC_COST_12 = null;

	// �� 113 �ϐ������l�F i_UNDER_PROC_COST_SUM

	final static String i_UNDER_PROC_COST_SUM = null;

	// �� 114 �ϐ������l�F i_TOTAL_PROC_COST_01

	final static String i_TOTAL_PROC_COST_01 = null;

	// �� 115 �ϐ������l�F i_TOTAL_PROC_COST_02

	final static String i_TOTAL_PROC_COST_02 = null;

	// �� 116 �ϐ������l�F i_TOTAL_PROC_COST_03

	final static String i_TOTAL_PROC_COST_03 = null;

	// �� 117 �ϐ������l�F i_TOTAL_PROC_COST_04

	final static String i_TOTAL_PROC_COST_04 = null;

	// �� 118 �ϐ������l�F i_TOTAL_PROC_COST_05

	final static String i_TOTAL_PROC_COST_05 = null;

	// �� 119 �ϐ������l�F i_TOTAL_PROC_COST_06

	final static String i_TOTAL_PROC_COST_06 = null;

	// �� 120 �ϐ������l�F i_TOTAL_PROC_COST_07

	final static String i_TOTAL_PROC_COST_07 = null;

	// �� 121 �ϐ������l�F i_TOTAL_PROC_COST_08

	final static String i_TOTAL_PROC_COST_08 = null;

	// �� 122 �ϐ������l�F i_TOTAL_PROC_COST_09

	final static String i_TOTAL_PROC_COST_09 = null;

	// �� 123 �ϐ������l�F i_TOTAL_PROC_COST_10

	final static String i_TOTAL_PROC_COST_10 = null;

	// �� 124 �ϐ������l�F i_TOTAL_PROC_COST_11

	final static String i_TOTAL_PROC_COST_11 = null;

	// �� 125 �ϐ������l�F i_TOTAL_PROC_COST_12

	final static String i_TOTAL_PROC_COST_12 = null;

	// �� 126 �ϐ������l�F i_TOTAL_PROC_COST_SUM

	final static String i_TOTAL_PROC_COST_SUM = null;

	// �� 127 �ϐ������l�F i_PROC_COST_01_NAME

	final static String i_PROC_COST_01_NAME = null;

	// �� 128 �ϐ������l�F i_PROC_COST_02_NAME

	final static String i_PROC_COST_02_NAME = null;

	// �� 129 �ϐ������l�F i_PROC_COST_03_NAME

	final static String i_PROC_COST_03_NAME = null;

	// �� 130 �ϐ������l�F i_PROC_COST_04_NAME

	final static String i_PROC_COST_04_NAME = null;

	// �� 131 �ϐ������l�F i_PROC_COST_05_NAME

	final static String i_PROC_COST_05_NAME = null;

	// �� 132 �ϐ������l�F i_PROC_COST_06_NAME

	final static String i_PROC_COST_06_NAME = null;

	// �� 133 �ϐ������l�F i_PROC_COST_07_NAME

	final static String i_PROC_COST_07_NAME = null;

	// �� 134 �ϐ������l�F i_PROC_COST_08_NAME

	final static String i_PROC_COST_08_NAME = null;

	// �� 135 �ϐ������l�F i_PROC_COST_09_NAME

	final static String i_PROC_COST_09_NAME = null;

	// �� 136 �ϐ������l�F i_PROC_COST_10_NAME

	final static String i_PROC_COST_10_NAME = null;

	// �� 137 �ϐ������l�F i_PROC_COST_11_NAME

	final static String i_PROC_COST_11_NAME = null;

	// �� 138 �ϐ������l�F i_PROC_COST_12_NAME

	final static String i_PROC_COST_12_NAME = null;

	// �� 139 �ϐ������l�F i_HALF_TERM_TYP_DN

	final static String i_HALF_TERM_TYP_DN = null;

	// �� 140 �ϐ������l�F i_PUCH_ITEM_CD

	final static String i_PUCH_ITEM_CD = null;

	// �� 141 �ϐ������l�F i_PUCH_CS_PROC_CD

	final static String i_PUCH_CS_PROC_CD = null;

	// �� 142 �ϐ������l�F i_VEND_CD

	final static String i_VEND_CD = null;

	// �� 143 �ϐ������l�F i_UNIT_COST

	final static String i_UNIT_COST = null;

	// �� 144 �ϐ������l�F i_UNIT_COST_TYP_DN

	final static String i_UNIT_COST_TYP_DN = null;

	// �� 145 �ϐ������l�F i_CUR_UNIT

	final static String i_CUR_UNIT = null;

	// �� 146 �ϐ������l�F i_EXCH_RATE

	final static String i_EXCH_RATE = null;

	// �� 147 �ϐ������l�F i_HOME_CUR_UNIT_COST

	final static String i_HOME_CUR_UNIT_COST = null;

	// �� 148 �ϐ������l�F i_PUCH_UNIT_QTY

	final static String i_PUCH_UNIT_QTY = null;

	// �� 149 �ϐ������l�F i_SUB_VEND_CD

	final static String i_SUB_VEND_CD = null;

	// �� 150 �ϐ������l�F i_SUB_UNIT_COST

	final static String i_SUB_UNIT_COST = null;

	// �� 151 �ϐ������l�F i_SUB_UNIT_COST_TYP_DN

	final static String i_SUB_UNIT_COST_TYP_DN = null;

	// �� 152 �ϐ������l�F i_SUB_CUR_UNIT

	final static String i_SUB_CUR_UNIT = null;

	// �� 153 �ϐ������l�F i_SUB_EXCH_RATE

	final static String i_SUB_EXCH_RATE = null;

	// �� 154 �ϐ������l�F i_SUB_HOME_CUR_UNIT_COST

	final static String i_SUB_HOME_CUR_UNIT_COST = null;

	// �� 155 �ϐ������l�F i_SUB_PUCH_UNIT_QTY

	final static String i_SUB_PUCH_UNIT_QTY = null;

	// �� 156 �ϐ������l�F i_PUCH_STOCK_UNIT

	final static String i_PUCH_STOCK_UNIT = null;

	// �� 157 �ϐ������l�F i_UNIT_COST_ACCEPT_TYP_DN

	final static String i_UNIT_COST_ACCEPT_TYP_DN = null;

	// �� 158 �ϐ������l�F i_CS_PUCH_TYP_DN

	final static String i_CS_PUCH_TYP_DN = null;

	// �� 159 �ϐ������l�F i_PROC_VEND_CD

	final static String i_PROC_VEND_CD = null;

	// �� 160 �ϐ������l�F i_PROC_ORG_CD

	final static String i_PROC_ORG_CD = null;

	// �� 161 �ϐ������l�F i_PUCH_UNIT_COST

	final static String i_PUCH_UNIT_COST = null;

	// �� 162 �ϐ������l�F i_PUCH_PUCH_UNIT_QTY

	final static String i_PUCH_PUCH_UNIT_QTY = null;

	// �� 163 �ϐ������l�F i_SBCNT_UNIT_COST

	final static String i_SBCNT_UNIT_COST = null;

	// �� 164 �ϐ������l�F i_SBCNT_PUCH_UNIT_QTY

	final static String i_SBCNT_PUCH_UNIT_QTY = null;

	// �� 165 �ϐ������l�F i_PROC_COST_01

	final static String i_PROC_COST_01 = null;

	// �� 166 �ϐ������l�F i_PROC_COST_02

	final static String i_PROC_COST_02 = null;

	// �� 167 �ϐ������l�F i_PROC_COST_03

	final static String i_PROC_COST_03 = null;

	// �� 168 �ϐ������l�F i_PROC_COST_04

	final static String i_PROC_COST_04 = null;

	// �� 169 �ϐ������l�F i_PROC_COST_05

	final static String i_PROC_COST_05 = null;

	// �� 170 �ϐ������l�F i_PROC_COST_06

	final static String i_PROC_COST_06 = null;

	// �� 171 �ϐ������l�F i_PROC_COST_07

	final static String i_PROC_COST_07 = null;

	// �� 172 �ϐ������l�F i_PROC_COST_08

	final static String i_PROC_COST_08 = null;

	// �� 173 �ϐ������l�F i_PROC_COST_09

	final static String i_PROC_COST_09 = null;

	// �� 174 �ϐ������l�F i_PROC_COST_10

	final static String i_PROC_COST_10 = null;

	// �� 175 �ϐ������l�F i_PROC_COST_11

	final static String i_PROC_COST_11 = null;

	// �� 176 �ϐ������l�F i_PROC_COST_12

	final static String i_PROC_COST_12 = null;

	// �� 177 �ϐ������l�F i_PROC_COST_STOCK_UNIT

	final static String i_PROC_COST_STOCK_UNIT = null;

	// �� 178 �ϐ������l�F i_CS_PUCH_TYP_VALUE

	final static String i_CS_PUCH_TYP_VALUE = null;

	// �� 179 �ϐ������l�F i_CURRENT_YEAR

	final static String i_CURRENT_YEAR = null;


	/**
	 * ������
	 *
	 */
	public void initialize()
	{

		clear();

		m_HALF_TERM_TYP_name = i_HALF_TERM_TYP_name;
		m_HALF_TERM_TYP_val = i_HALF_TERM_TYP_val;
		m_DOWNLOAD_FILE = i_DOWNLOAD_FILE;
		m_COST_TYP_DN = i_COST_TYP_DN;
		m_OUTSIDE_TYP_DN = i_OUTSIDE_TYP_DN;
		m_PROC_OUTSIDE_TYP_DN = i_PROC_OUTSIDE_TYP_DN;
		m_DMY_ITEM_FLG_DN = i_DMY_ITEM_FLG_DN;
		m_VOLUNT_SPL_FLG_DN = i_VOLUNT_SPL_FLG_DN;
		m_COST_UP_TYP_DN = i_COST_UP_TYP_DN;
		m_ONEROUS_CONS_FLG_DN = i_ONEROUS_CONS_FLG_DN;
		m_UPPER_ITEM_FLG_DN = i_UPPER_ITEM_FLG_DN;
		m_LOWER_ITEM_FLG_DN = i_LOWER_ITEM_FLG_DN;
		m_COST_EXCLUDE_FLG_DN = i_COST_EXCLUDE_FLG_DN;
		m_l_ROOT_ITEM_CD = i_l_ROOT_ITEM_CD;
		m_l_ROOT_ITEM_NAME = i_l_ROOT_ITEM_NAME;
		m_l_CLASIFICATION_CD = i_l_CLASIFICATION_CD;
		m_l_CS_PROC_CD = i_l_CS_PROC_CD;
		m_l_CS_PROC_NAME = i_l_CS_PROC_NAME;
		m_l_NECESSARY_QTY = i_l_NECESSARY_QTY;
		m_l_STOCK_UNIT = i_l_STOCK_UNIT;
		m_l_ITEM_INPUT_RATIO = i_l_ITEM_INPUT_RATIO;
		m_l_HOME_CUR_UNIT = i_l_HOME_CUR_UNIT;
		m_l_TOTAL_COST = i_l_TOTAL_COST;
		m_l_TOTAL_MATR_COST = i_l_TOTAL_MATR_COST;
		m_l_TOTAL_SBCNT_MATR_COST = i_l_TOTAL_SBCNT_MATR_COST;
		m_l_TOTAL_PROC_COST_SUM_ALL = i_l_TOTAL_PROC_COST_SUM_ALL;
		m_PLANT_CD = i_PLANT_CD;
		m_YEAR = i_YEAR;
		m_HALF_TERM_TYP = i_HALF_TERM_TYP;
		m_ROOT_ITEM_CD = i_ROOT_ITEM_CD;
		m_CLASIFICATION_CD = i_CLASIFICATION_CD;
		m_COST_TYP = i_COST_TYP;
		m_PLANT_NAME = i_PLANT_NAME;
		m_ROOT_ITEM_NAME = i_ROOT_ITEM_NAME;
		m_PARENT_ITEM_CD = i_PARENT_ITEM_CD;
		m_PARENT_ITEM_NAME = i_PARENT_ITEM_NAME;
		m_ITEM_CD = i_ITEM_CD;
		m_ITEM_NAME = i_ITEM_NAME;
		m_PS_EDITION = i_PS_EDITION;
		m_COST_STATEMENT_NO = i_COST_STATEMENT_NO;
		m_CS_PROC_CD = i_CS_PROC_CD;
		m_CS_PROC_NAME = i_CS_PROC_NAME;
		m_WS_CD = i_WS_CD;
		m_WS_NAME = i_WS_NAME;
		m_ORG_CD = i_ORG_CD;
		m_ORG_NAME = i_ORG_NAME;
		m_NECESSARY_QTY = i_NECESSARY_QTY;
		m_PS_INPUT_RATIO = i_PS_INPUT_RATIO;
		m_ITEM_INPUT_RATIO = i_ITEM_INPUT_RATIO;
		m_TOTAL_COST = i_TOTAL_COST;
		m_OWN_MATR_COST = i_OWN_MATR_COST;
		m_UNDER_MATR_COST = i_UNDER_MATR_COST;
		m_TOTAL_MATR_COST = i_TOTAL_MATR_COST;
		m_OWN_SBCNT_MATR_COST = i_OWN_SBCNT_MATR_COST;
		m_UNDER_SBCNT_MATR_COST = i_UNDER_SBCNT_MATR_COST;
		m_TOTAL_SBCNT_MATR_COST = i_TOTAL_SBCNT_MATR_COST;
		m_OWN_PROC_COST_SUM_ALL = i_OWN_PROC_COST_SUM_ALL;
		m_UNDER_PROC_COST_SUM_ALL = i_UNDER_PROC_COST_SUM_ALL;
		m_TOTAL_PROC_COST_SUM_ALL = i_TOTAL_PROC_COST_SUM_ALL;
		m_HOME_CUR_UNIT = i_HOME_CUR_UNIT;
		m_EFF_PHASE_IN_DATE = i_EFF_PHASE_IN_DATE;
		m_EFF_PHASE_OUT_DATE = i_EFF_PHASE_OUT_DATE;
		m_PS_UNIT_DENOMINATOR = i_PS_UNIT_DENOMINATOR;
		m_PS_UNIT_NUMERATOR = i_PS_UNIT_NUMERATOR;
		m_PARENT_COST_STATEMENT_NO = i_PARENT_COST_STATEMENT_NO;
		m_PARENT_ITEM_STOCK_UNIT = i_PARENT_ITEM_STOCK_UNIT;
		m_STOCK_UNIT = i_STOCK_UNIT;
		m_OUTSIDE_TYP = i_OUTSIDE_TYP;
		m_PROC_OUTSIDE_TYP = i_PROC_OUTSIDE_TYP;
		m_DMY_ITEM_FLG = i_DMY_ITEM_FLG;
		m_VOLUNT_SPL_FLG = i_VOLUNT_SPL_FLG;
		m_COST_UP_TYP = i_COST_UP_TYP;
		m_ONEROUS_CONS_FLG = i_ONEROUS_CONS_FLG;
		m_UP_LEVEL_NO = i_UP_LEVEL_NO;
		m_UPPER_ITEM_FLG = i_UPPER_ITEM_FLG;
		m_LOWER_ITEM_FLG = i_LOWER_ITEM_FLG;
		m_COST_EXCLUDE_FLG = i_COST_EXCLUDE_FLG;
		m_CREATED_DATE = i_CREATED_DATE;
		m_CREATED_BY = i_CREATED_BY;
		m_CREATED_PRG_NM = i_CREATED_PRG_NM;
		m_UPDATED_DATE = i_UPDATED_DATE;
		m_UPDATED_BY = i_UPDATED_BY;
		m_UPDATED_PRG_NM = i_UPDATED_PRG_NM;
		m_PROC_COST_CLS_CD = i_PROC_COST_CLS_CD;
		m_PROC_COST_CLS_NAME = i_PROC_COST_CLS_NAME;
		m_PROC_COST_UNIT_QTY = i_PROC_COST_UNIT_QTY;
		m_PROC_COST_UNIT_QTY_UNIT = i_PROC_COST_UNIT_QTY_UNIT;
		m_OWN_PROC_COST_01 = i_OWN_PROC_COST_01;
		m_OWN_PROC_COST_02 = i_OWN_PROC_COST_02;
		m_OWN_PROC_COST_03 = i_OWN_PROC_COST_03;
		m_OWN_PROC_COST_04 = i_OWN_PROC_COST_04;
		m_OWN_PROC_COST_05 = i_OWN_PROC_COST_05;
		m_OWN_PROC_COST_06 = i_OWN_PROC_COST_06;
		m_OWN_PROC_COST_07 = i_OWN_PROC_COST_07;
		m_OWN_PROC_COST_08 = i_OWN_PROC_COST_08;
		m_OWN_PROC_COST_09 = i_OWN_PROC_COST_09;
		m_OWN_PROC_COST_10 = i_OWN_PROC_COST_10;
		m_OWN_PROC_COST_11 = i_OWN_PROC_COST_11;
		m_OWN_PROC_COST_12 = i_OWN_PROC_COST_12;
		m_OWN_PROC_COST_SUM = i_OWN_PROC_COST_SUM;
		m_UNDER_PROC_COST_01 = i_UNDER_PROC_COST_01;
		m_UNDER_PROC_COST_02 = i_UNDER_PROC_COST_02;
		m_UNDER_PROC_COST_03 = i_UNDER_PROC_COST_03;
		m_UNDER_PROC_COST_04 = i_UNDER_PROC_COST_04;
		m_UNDER_PROC_COST_05 = i_UNDER_PROC_COST_05;
		m_UNDER_PROC_COST_06 = i_UNDER_PROC_COST_06;
		m_UNDER_PROC_COST_07 = i_UNDER_PROC_COST_07;
		m_UNDER_PROC_COST_08 = i_UNDER_PROC_COST_08;
		m_UNDER_PROC_COST_09 = i_UNDER_PROC_COST_09;
		m_UNDER_PROC_COST_10 = i_UNDER_PROC_COST_10;
		m_UNDER_PROC_COST_11 = i_UNDER_PROC_COST_11;
		m_UNDER_PROC_COST_12 = i_UNDER_PROC_COST_12;
		m_UNDER_PROC_COST_SUM = i_UNDER_PROC_COST_SUM;
		m_TOTAL_PROC_COST_01 = i_TOTAL_PROC_COST_01;
		m_TOTAL_PROC_COST_02 = i_TOTAL_PROC_COST_02;
		m_TOTAL_PROC_COST_03 = i_TOTAL_PROC_COST_03;
		m_TOTAL_PROC_COST_04 = i_TOTAL_PROC_COST_04;
		m_TOTAL_PROC_COST_05 = i_TOTAL_PROC_COST_05;
		m_TOTAL_PROC_COST_06 = i_TOTAL_PROC_COST_06;
		m_TOTAL_PROC_COST_07 = i_TOTAL_PROC_COST_07;
		m_TOTAL_PROC_COST_08 = i_TOTAL_PROC_COST_08;
		m_TOTAL_PROC_COST_09 = i_TOTAL_PROC_COST_09;
		m_TOTAL_PROC_COST_10 = i_TOTAL_PROC_COST_10;
		m_TOTAL_PROC_COST_11 = i_TOTAL_PROC_COST_11;
		m_TOTAL_PROC_COST_12 = i_TOTAL_PROC_COST_12;
		m_TOTAL_PROC_COST_SUM = i_TOTAL_PROC_COST_SUM;
		m_PROC_COST_01_NAME = i_PROC_COST_01_NAME;
		m_PROC_COST_02_NAME = i_PROC_COST_02_NAME;
		m_PROC_COST_03_NAME = i_PROC_COST_03_NAME;
		m_PROC_COST_04_NAME = i_PROC_COST_04_NAME;
		m_PROC_COST_05_NAME = i_PROC_COST_05_NAME;
		m_PROC_COST_06_NAME = i_PROC_COST_06_NAME;
		m_PROC_COST_07_NAME = i_PROC_COST_07_NAME;
		m_PROC_COST_08_NAME = i_PROC_COST_08_NAME;
		m_PROC_COST_09_NAME = i_PROC_COST_09_NAME;
		m_PROC_COST_10_NAME = i_PROC_COST_10_NAME;
		m_PROC_COST_11_NAME = i_PROC_COST_11_NAME;
		m_PROC_COST_12_NAME = i_PROC_COST_12_NAME;
		m_HALF_TERM_TYP_DN = i_HALF_TERM_TYP_DN;
		m_PUCH_ITEM_CD = i_PUCH_ITEM_CD;
		m_PUCH_CS_PROC_CD = i_PUCH_CS_PROC_CD;
		m_VEND_CD = i_VEND_CD;
		m_UNIT_COST = i_UNIT_COST;
		m_UNIT_COST_TYP_DN = i_UNIT_COST_TYP_DN;
		m_CUR_UNIT = i_CUR_UNIT;
		m_EXCH_RATE = i_EXCH_RATE;
		m_HOME_CUR_UNIT_COST = i_HOME_CUR_UNIT_COST;
		m_PUCH_UNIT_QTY = i_PUCH_UNIT_QTY;
		m_SUB_VEND_CD = i_SUB_VEND_CD;
		m_SUB_UNIT_COST = i_SUB_UNIT_COST;
		m_SUB_UNIT_COST_TYP_DN = i_SUB_UNIT_COST_TYP_DN;
		m_SUB_CUR_UNIT = i_SUB_CUR_UNIT;
		m_SUB_EXCH_RATE = i_SUB_EXCH_RATE;
		m_SUB_HOME_CUR_UNIT_COST = i_SUB_HOME_CUR_UNIT_COST;
		m_SUB_PUCH_UNIT_QTY = i_SUB_PUCH_UNIT_QTY;
		m_PUCH_STOCK_UNIT = i_PUCH_STOCK_UNIT;
		m_UNIT_COST_ACCEPT_TYP_DN = i_UNIT_COST_ACCEPT_TYP_DN;
		m_CS_PUCH_TYP_DN = i_CS_PUCH_TYP_DN;
		m_PROC_VEND_CD = i_PROC_VEND_CD;
		m_PROC_ORG_CD = i_PROC_ORG_CD;
		m_PUCH_UNIT_COST = i_PUCH_UNIT_COST;
		m_PUCH_PUCH_UNIT_QTY = i_PUCH_PUCH_UNIT_QTY;
		m_SBCNT_UNIT_COST = i_SBCNT_UNIT_COST;
		m_SBCNT_PUCH_UNIT_QTY = i_SBCNT_PUCH_UNIT_QTY;
		m_PROC_COST_01 = i_PROC_COST_01;
		m_PROC_COST_02 = i_PROC_COST_02;
		m_PROC_COST_03 = i_PROC_COST_03;
		m_PROC_COST_04 = i_PROC_COST_04;
		m_PROC_COST_05 = i_PROC_COST_05;
		m_PROC_COST_06 = i_PROC_COST_06;
		m_PROC_COST_07 = i_PROC_COST_07;
		m_PROC_COST_08 = i_PROC_COST_08;
		m_PROC_COST_09 = i_PROC_COST_09;
		m_PROC_COST_10 = i_PROC_COST_10;
		m_PROC_COST_11 = i_PROC_COST_11;
		m_PROC_COST_12 = i_PROC_COST_12;
		m_PROC_COST_STOCK_UNIT = i_PROC_COST_STOCK_UNIT;
		m_CS_PUCH_TYP_VALUE = i_CS_PUCH_TYP_VALUE;
		m_CURRENT_YEAR = i_CURRENT_YEAR;
	}
		// TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
