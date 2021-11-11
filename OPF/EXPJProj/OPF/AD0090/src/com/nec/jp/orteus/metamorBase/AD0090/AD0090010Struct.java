/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0090/src/com/nec/jp/orteus/metamorBase/AD0090/AD0090010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0090;

import com.nec.jp.orteus.xaf.wa.*;

import com.nec.jp.orteus.util.logging.*;

import java.lang.Number.*;
import java.lang.Float;
import java.util.*;
import java.sql.*;
import java.io.*;

//{{user_implement_code_import
import java.math.BigDecimal;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AD0090010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: geng-jia $
 * @version $Revision: 1.9 $ $Date: 2015/12/22 09:54:06 $
 *
 */
//}}user_implement_code_header

public class AD0090010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_chk_COMPLETE */
	public String m_chk_COMPLETE = null;
	/** �� 2 �ϐ��F m_OPRATION_TIME */
	public String m_OPRATION_TIME = null;
	/** �� 3 �ϐ��F m_chk_OUTPUT */
	public String m_chk_OUTPUT = null;
	/** �� 4 �ϐ��F m_d1_STOCK_UNIT */
	public String m_d1_STOCK_UNIT = null;
	/** �� 5 �ϐ��F m_OPR_TIME_UNIT_TYP_name */
	public String m_OPR_TIME_UNIT_TYP_name = null;
	/** �� 6 �ϐ��F m_OPR_TIME_UNIT_TYP_val */
	public String m_OPR_TIME_UNIT_TYP_val = null;
	/** �� 7 �ϐ��F m_l_DEFECT_CAUSE_CD_name */
	public String m_l_DEFECT_CAUSE_CD_name = null;
	/** �� 8 �ϐ��F m_l_DEFECT_CAUSE_CD_val */
	public String m_l_DEFECT_CAUSE_CD_val = null;
	/** �� 9 �ϐ��F m_MRP_ODR_TYP_DN */
	public String m_MRP_ODR_TYP_DN = null;
	/** �� 10 �ϐ��F m_DOWNLOAD_FILE */
	public String m_DOWNLOAD_FILE = null;
	/** �� 11 �ϐ��F m_h_FINAL_PROC_FLG */
	public String m_h_FINAL_PROC_FLG = null;
	/** �� 12 �ϐ��F m_h_SYS_LOT_CTRL_FLG */
	public String m_h_SYS_LOT_CTRL_FLG = null;
	/** �� 13 �ϐ��F m_chk_CHILD_RSLTUPDATE */
	public String m_chk_CHILD_RSLTUPDATE = null;
	/** �� 14 �ϐ��F m_param1 */
	public String m_param1 = null;
	/** �� 15 �ϐ��F m_param2 */
	public String m_param2 = null;
	/** �� 16 �ϐ��F m_param3 */
	public String m_param3 = null;
	/** �� 17 �ϐ��F m_h_PROCESS_MANAGE_FLG */
	public String m_h_PROCESS_MANAGE_FLG = null;
	/** �� 18 �ϐ��F m_TEMP_PLAN_QTY */
	public String m_TEMP_PLAN_QTY = null;
	/** �� 19 �ϐ��F m_TEMP_USEOVER_QTY */
	public String m_TEMP_USEOVER_QTY = null;
	/** �� 20 �ϐ��F m_TEMP_PLANOUT_QTY */
	public String m_TEMP_PLANOUT_QTY = null;
	/** �� 21 �ϐ��F m_TEMP_USE_QTY */
	public String m_TEMP_USE_QTY = null;
	/** �� 22 �ϐ��F m_l_PARTIAL_PRD_NO */
	public String m_l_PARTIAL_PRD_NO = null;
	/** �� 23 �ϐ��F m_FIRST_WORK_FLG */
	public String m_FIRST_WORK_FLG = null;
	/** �� 24 �ϐ��F m_USE_LOT_NO */
	public String m_USE_LOT_NO = null;
	/** �� 25 �ϐ��F m_USE_ACPT_QTY */
	public String m_USE_ACPT_QTY = null;
	/** �� 26 �ϐ��F m_USE_DEFECT_QTY */
	public String m_USE_DEFECT_QTY = null;
	/** �� 27 �ϐ��F m_IN_OPR_INST_CD */
	public String m_IN_OPR_INST_CD = null;
	/** �� 28 �ϐ��F m_PARTIAL_PRD_NO */
	public String m_PARTIAL_PRD_NO = null;
	/** �� 29 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 30 �ϐ��F m_WS_CD */
	public String m_WS_CD = null;
	/** �� 31 �ϐ��F m_WORK_IN_PROC_CD */
	public String m_WORK_IN_PROC_CD = null;
	/** �� 32 �ϐ��F m_PROC_NAME */
	public String m_PROC_NAME = null;
	/** �� 33 �ϐ��F m_PROC_NO */
	public String m_PROC_NO = null;
	/** �� 34 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 35 �ϐ��F m_WORK_STS_TYP */
	public String m_WORK_STS_TYP = null;
	/** �� 36 �ϐ��F m_WORK_ODR_CD */
	public String m_WORK_ODR_CD = null;
	/** �� 37 �ϐ��F m_OD_NO */
	public String m_OD_NO = null;
	/** �� 38 �ϐ��F m_OUTSIDE_TYP */
	public String m_OUTSIDE_TYP = null;
	/** �� 39 �ϐ��F m_PROC_MODIFY_COUNT */
	public String m_PROC_MODIFY_COUNT = null;
	/** �� 40 �ϐ��F m_FINAL_PROC_FLG */
	public String m_FINAL_PROC_FLG = null;
	/** �� 41 �ϐ��F m_WORK_ODR_DLV_DATE */
	public String m_WORK_ODR_DLV_DATE = null;
	/** �� 42 �ϐ��F m_OPR_INST_START_DATE */
	public String m_OPR_INST_START_DATE = null;
	/** �� 43 �ϐ��F m_OPR_INST_QTY */
	public String m_OPR_INST_QTY = null;
	/** �� 44 �ϐ��F m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** �� 45 �ϐ��F m_UNIT_QTY_TYP */
	public String m_UNIT_QTY_TYP = null;
	/** �� 46 �ϐ��F m_DRAW_CD */
	public String m_DRAW_CD = null;
	/** �� 47 �ϐ��F m_SPEC */
	public String m_SPEC = null;
	/** �� 48 �ϐ��F m_MRP_ODR_TYP */
	public String m_MRP_ODR_TYP = null;
	/** �� 49 �ϐ��F m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** �� 50 �ϐ��F m_LOT_NUMBERING_TYP */
	public String m_LOT_NUMBERING_TYP = null;
	/** �� 51 �ϐ��F m_LOT_CTRL_FLG */
	public String m_LOT_CTRL_FLG = null;
	/** �� 52 �ϐ��F m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** �� 53 �ϐ��F m_JOB_ODR_DETAIL_NO */
	public String m_JOB_ODR_DETAIL_NO = null;
	/** �� 54 �ϐ��F m_JOB_ODR_CANCEL_NO */
	public String m_JOB_ODR_CANCEL_NO = null;
	/** �� 55 �ϐ��F m_WS_NAME */
	public String m_WS_NAME = null;
	/** �� 56 �ϐ��F m_SUM_ACPT_QTY */
	public String m_SUM_ACPT_QTY = null;
	/** �� 57 �ϐ��F m_SUM_DEFECT_QTY */
	public String m_SUM_DEFECT_QTY = null;
	/** �� 58 �ϐ��F m_OPR_RSLT_TYP */
	public String m_OPR_RSLT_TYP = null;
	/** �� 59 �ϐ��F m_ITEM_MODIFY_COUNT */
	public String m_ITEM_MODIFY_COUNT = null;
	/** �� 60 �ϐ��F m_h_OPR_DATE */
	public String m_h_OPR_DATE = null;
	/** �� 61 �ϐ��F m_TIME_CTRL */
	public String m_TIME_CTRL = null;
	/** �� 62 �ϐ��F m_h_BUSINESS_OPR_DATE */
	public String m_h_BUSINESS_OPR_DATE = null;
	/** �� 63 �ϐ��F m_h_BUSINESS_OPR_TIME */
	public String m_h_BUSINESS_OPR_TIME = null;
	/** �� 64 �ϐ��F m_FORM_SET_ITEM_CD */
	public String m_FORM_SET_ITEM_CD = null;
	/** �� 65 �ϐ��F m_WH_NAME */
	public String m_WH_NAME = null;
	/** �� 66 �ϐ��F m_WH_CD */
	public String m_WH_CD = null;
	/** �� 67 �ϐ��F m_PROC_EXEC_DATE */
	public BigDecimal m_PROC_EXEC_DATE = null;
	/** �� 68 �ϐ��F m_PAST_RESULT_ENTRY_TYP */
	public String m_PAST_RESULT_ENTRY_TYP = null;
	/** �� 69 �ϐ��F m_LOT_NO */
	public String m_LOT_NO = null;
	/** �� 70 �ϐ��F m_ACPT_QTY */
	public String m_ACPT_QTY = null;
	/** �� 71 �ϐ��F m_DEFECT_QTY */
	public String m_DEFECT_QTY = null;
	/** �� 72 �ϐ��F m_OPR_DATE */
	public String m_OPR_DATE = null;
	/** �� 73 �ϐ��F m_OPR_RSLT_PERSON */
	public String m_OPR_RSLT_PERSON = null;
	/** �� 74 �ϐ��F m_OPR_RSLT_COMMENT */
	public String m_OPR_RSLT_COMMENT = null;
	/** �� 75 �ϐ��F m_OPR_TIME_UNIT_TYP */
	public String m_OPR_TIME_UNIT_TYP = null;
	/** �� 76 �ϐ��F m_PRE_ARRANGEMENT_TIME */
	public String m_PRE_ARRANGEMENT_TIME = null;
	/** �� 77 �ϐ��F m_POST_ARRANGEMENT_TIME */
	public String m_POST_ARRANGEMENT_TIME = null;
	/** �� 78 �ϐ��F m_OPR_TIME */
	public String m_OPR_TIME = null;
	/** �� 79 �ϐ��F m_CESSATION_TIME */
	public String m_CESSATION_TIME = null;
	/** �� 80 �ϐ��F m_CESSATION_CAUSE */
	public String m_CESSATION_CAUSE = null;
	/** �� 81 �ϐ��F m_OUTPUT_RSLT_CD */
	public String m_OUTPUT_RSLT_CD = null;
	/** �� 82 �ϐ��F m_VEND_LOT_NO */
	public String m_VEND_LOT_NO = null;
	/** �� 83 �ϐ��F m_OPR_CRCT_NO */
	public String m_OPR_CRCT_NO = null;
	/** �� 84 �ϐ��F m_UPDATE_WORK_STS_TYP */
	public String m_UPDATE_WORK_STS_TYP = null;
	/** �� 85 �ϐ��F m_JOB_ODR_TYP */
	public String m_JOB_ODR_TYP = null;
	/** �� 86 �ϐ��F m_RCV_ISSUE_CTRL_CD */
	public String m_RCV_ISSUE_CTRL_CD = null;
	/** �� 87 �ϐ��F m_RCV_ISSUE_TYP */
	public String m_RCV_ISSUE_TYP = null;
	/** �� 88 �ϐ��F m_OPR_RSLT_CRCT_NO */
	public String m_OPR_RSLT_CRCT_NO = null;
	/** �� 89 �ϐ��F m_h_ISSUE_INST_CD */
	public String m_h_ISSUE_INST_CD = null;
	/** �� 90 �ϐ��F m_SAVE_STOCK_ON_HAND_QTY */
	public String m_SAVE_STOCK_ON_HAND_QTY = null;
	/** �� 91 �ϐ��F m_RCV_ISSUE_QTY */
	public String m_RCV_ISSUE_QTY = null;
	/** �� 92 �ϐ��F m_RCV_ISSUE_DATE */
	public String m_RCV_ISSUE_DATE = null;
	/** �� 93 �ϐ��F m_RCV_ISSUE_GNR_TYP */
	public String m_RCV_ISSUE_GNR_TYP = null;
	/** �� 94 �ϐ��F m_RCV_ISSUE_ODD_QTY */
	public String m_RCV_ISSUE_ODD_QTY = null;
	/** �� 95 �ϐ��F m_STOCK_UPD_TYP */
	public String m_STOCK_UPD_TYP = null;
	/** �� 96 �ϐ��F m_RCV_ISSUE_COMMENT */
	public String m_RCV_ISSUE_COMMENT = null;
	/** �� 97 �ϐ��F m_RCV_ISSUE_CMPLT_FLG */
	public String m_RCV_ISSUE_CMPLT_FLG = null;
	/** �� 98 �ϐ��F m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** �� 99 �ϐ��F m_MANHOUR_TYP */
	public String m_MANHOUR_TYP = null;
	/** �� 100 �ϐ��F m_PARENT_OD_NO */
	public String m_PARENT_OD_NO = null;
	/** �� 101 �ϐ��F m_PARENT_OUTSIDE_TYP */
	public String m_PARENT_OUTSIDE_TYP = null;
	/** �� 102 �ϐ��F m_PARENT_MRP_ODR_TYP */
	public String m_PARENT_MRP_ODR_TYP = null;
	/** �� 103 �ϐ��F m_PARENT_WORK_ODR_CD */
	public String m_PARENT_WORK_ODR_CD = null;
	/** �� 104 �ϐ��F m_PARENT_WORK_IN_PROC_CD */
	public String m_PARENT_WORK_IN_PROC_CD = null;
	/** �� 105 �ϐ��F m_PARENT_PUCH_ODR_CD */
	public String m_PARENT_PUCH_ODR_CD = null;
	/** �� 106 �ϐ��F m_PUCH_ODR_CD */
	public String m_PUCH_ODR_CD = null;
	/** �� 107 �ϐ��F m_UPDATED_PRG_NM */
	public String m_UPDATED_PRG_NM = null;
	/** �� 108 �ϐ��F m_ACPT_NO */
	public String m_ACPT_NO = null;
	/** �� 109 �ϐ��F m_ISSUE_INST_CD */
	public String m_ISSUE_INST_CD = null;
	/** �� 110 �ϐ��F m_GET_IDENT_CARD_CTL_NO */
	public String m_GET_IDENT_CARD_CTL_NO = null;
	/** �� 111 �ϐ��F m_SEL_OPR_INST_CD */
	public String m_SEL_OPR_INST_CD = null;
	/** �� 112 �ϐ��F m_SEL_PARTIAL_PRD_NO */
	public String m_SEL_PARTIAL_PRD_NO = null;
	/** �� 113 �ϐ��F m_SEL_ITEM_CD */
	public String m_SEL_ITEM_CD = null;
	/** �� 114 �ϐ��F m_SEL_ACPT_QTY */
	public String m_SEL_ACPT_QTY = null;
	/** �� 115 �ϐ��F m_SEL_OPR_DATE */
	public String m_SEL_OPR_DATE = null;
	/** �� 116 �ϐ��F m_SEL_PKG_UNIT_QTY */
	public String m_SEL_PKG_UNIT_QTY = null;
	/** �� 117 �ϐ��F m_SEL_PLANT_CD */
	public String m_SEL_PLANT_CD = null;
	/** �� 118 �ϐ��F m_SEL_WS_CD */
	public String m_SEL_WS_CD = null;
	/** �� 119 �ϐ��F m_INS_IDENT_CARD_CTL_NO */
	public String m_INS_IDENT_CARD_CTL_NO = null;
	/** �� 120 �ϐ��F m_INS_OPR_INST_CD */
	public String m_INS_OPR_INST_CD = null;
	/** �� 121 �ϐ��F m_INS_PARTIAL_PRD_NO */
	public String m_INS_PARTIAL_PRD_NO = null;
	/** �� 122 �ϐ��F m_INS_RCV_ISSUE_CTRL_CD */
	public String m_INS_RCV_ISSUE_CTRL_CD = null;
	/** �� 123 �ϐ��F m_INS_ITEM_CD */
	public String m_INS_ITEM_CD = null;
	/** �� 124 �ϐ��F m_INS_JOB_ODR_CD */
	public String m_INS_JOB_ODR_CD = null;
	/** �� 125 �ϐ��F m_INS_FIRST_IDENT_CARD_QTY */
	public String m_INS_FIRST_IDENT_CARD_QTY = null;
	/** �� 126 �ϐ��F m_INS_IDENT_CARD_QTY */
	public String m_INS_IDENT_CARD_QTY = null;
	/** �� 127 �ϐ��F m_INS_OPR_DATE */
	public String m_INS_OPR_DATE = null;
	/** �� 128 �ϐ��F m_INS_PKG_UNIT_QTY */
	public String m_INS_PKG_UNIT_QTY = null;
	/** �� 129 �ϐ��F m_INS_PLANT_CD */
	public String m_INS_PLANT_CD = null;
	/** �� 130 �ϐ��F m_INS_WS_CD */
	public String m_INS_WS_CD = null;
	/** �� 131 �ϐ��F m_OPR_INST_CD */
	public String m_OPR_INST_CD = null;
	/** �� 132 �ϐ��F m_l_DEFECT_CAUSE_CD */
	public String m_l_DEFECT_CAUSE_CD = null;
	/** �� 133 �ϐ��F m_l_DEFECT_QTY */
	public String m_l_DEFECT_QTY = null;
	/** �� 134 �ϐ��F m_l_DEFECT_COMMENT */
	public String m_l_DEFECT_COMMENT = null;
	/** �� 135 �ϐ��F m_RSLT_CTRL_SEQ_NO */
	public String m_RSLT_CTRL_SEQ_NO = null;
	/** �� 136 �ϐ��F m_SUPPLIED_ISSUE_QTY */
	public String m_SUPPLIED_ISSUE_QTY = null;
	/** �� 137 �ϐ��F m_SUPPLIED_ISSUE_QTY_sum */
	public String m_SUPPLIED_ISSUE_QTY_sum = null;
	/** �� 138 �ϐ��F m_h_ISSUE_INST_UNIT_DENOMINATOR */
	public String m_h_ISSUE_INST_UNIT_DENOMINATOR = null;
	/** �� 139 �ϐ��F m_h_ISSUE_INST_UNIT_NUMERATOR */
	public String m_h_ISSUE_INST_UNIT_NUMERATOR = null;
	/** �� 140 �ϐ��F m_count_RCV_ISSUE */
	public String m_count_RCV_ISSUE = null;
	/** �� 141 �ϐ��F m_STOCK_ON_HAND_QTY */
	public String m_STOCK_ON_HAND_QTY = null;
	/** �� 142 �ϐ��F m_ISSUE_QTY */
	public String m_ISSUE_QTY = null;
	/** �� 143 �ϐ��F m_ISSUE_DATE */
	public String m_ISSUE_DATE = null;
	/** �� 144 �ϐ��F m_SPENT_QTY */
	public String m_SPENT_QTY = null;
	/** �� 145 �ϐ��F m_NEXTVAL */
	public String m_NEXTVAL = null;
	/** �� 146 �ϐ��F m_RSLT_CTL_SEQ_NO */
	public String m_RSLT_CTL_SEQ_NO = null;
	/** �� 147 �ϐ��F m_TOTAL_ISSUE_QTY */
	public String m_TOTAL_ISSUE_QTY = null;
	/** �� 148 �ϐ��F m_PART_SUPPLIED_COMMENT */
	public String m_PART_SUPPLIED_COMMENT = null;
	/** �� 149 �ϐ��F m_SUPPLIED_DATE */
	public String m_SUPPLIED_DATE = null;
	/** �� 150 �ϐ��F m_ALCD_QTY */
	public String m_ALCD_QTY = null;
	/** �� 151 �ϐ��F m_TMP_IDENT_CARD_CTL_NO */
	public String m_TMP_IDENT_CARD_CTL_NO = null;
	/** �� 152 �ϐ��F m_TMP_OPR_INST_CD */
	public String m_TMP_OPR_INST_CD = null;
	/** �� 153 �ϐ��F m_TMP_PARTIAL_PRD_NO */
	public String m_TMP_PARTIAL_PRD_NO = null;
	/** �� 154 �ϐ��F m_TMP_RCV_ISSUE_CTRL_CD */
	public String m_TMP_RCV_ISSUE_CTRL_CD = null;
	/** �� 155 �ϐ��F m_TMP_ITEM_CD */
	public String m_TMP_ITEM_CD = null;
	/** �� 156 �ϐ��F m_TMP_JOB_ODR_CD */
	public String m_TMP_JOB_ODR_CD = null;
	/** �� 157 �ϐ��F m_TMP_FIRST_IDENT_CARD_QTY */
	public String m_TMP_FIRST_IDENT_CARD_QTY = null;
	/** �� 158 �ϐ��F m_TMP_IDENT_CARD_QTY */
	public String m_TMP_IDENT_CARD_QTY = null;
	/** �� 159 �ϐ��F m_TMP_OPR_DATE */
	public String m_TMP_OPR_DATE = null;
	/** �� 160 �ϐ��F m_TMP_PKG_UNIT_QTY */
	public String m_TMP_PKG_UNIT_QTY = null;
	/** �� 161 �ϐ��F m_TMP_PLANT_CD */
	public String m_TMP_PLANT_CD = null;
	/** �� 162 �ϐ��F m_TMP_WS_CD */
	public String m_TMP_WS_CD = null;
	/** �� 163 �ϐ��F m_INS_PRINT_GRP_NO */
	public String m_INS_PRINT_GRP_NO = null;
	/** �� 164 �ϐ��F m_INS_PAGE_NO */
	public String m_INS_PAGE_NO = null;
	/** �� 165 �ϐ��F m_INS_PRINT_QTY */
	public String m_INS_PRINT_QTY = null;
	/** �� 166 �ϐ��F m_DM_STS_TYP */
	public String m_DM_STS_TYP = null;
	/** �� 167 �ϐ��F m_ISSUE_CMPLT_DATE */
	public String m_ISSUE_CMPLT_DATE = null;
	/** �� 168 �ϐ��F m_USER_CD */
	public String m_USER_CD = null;
	/** �� 169 �ϐ��F m_PRODUCT_TYP */
	public String m_PRODUCT_TYP = null;
	/** �� 170 �ϐ��F m_WH_TYP */
	public String m_WH_TYP = null;
	/** �� 171 �ϐ��F m_NEXT_WH_CD */
	public String m_NEXT_WH_CD = null;
	/** �� 172 �ϐ��F m_FIRST_OPR_INST_CD */
	public String m_FIRST_OPR_INST_CD = null;
	/** �� 173 �ϐ��F m_FIRST_PROC_NO */
	public String m_FIRST_PROC_NO = null;
	/** �� 174 �ϐ��F m_NEXT_WORK_ODR_CD */
	public String m_NEXT_WORK_ODR_CD = null;
	/** �� 175 �ϐ��F m_NEXT_OPR_INST_CD */
	public String m_NEXT_OPR_INST_CD = null;
	/** �� 176 �ϐ��F m_NEXT_PROC_NO */
	public String m_NEXT_PROC_NO = null;
	/** �� 177 �ϐ��F m_NEXT_WS_CD */
	public String m_NEXT_WS_CD = null;
	/** �� 178 �ϐ��F m_NEXT_WS_NAME */
	public String m_NEXT_WS_NAME = null;
	/** �� 179 �ϐ��F m_NEXT_WH_NAME */
	public String m_NEXT_WH_NAME = null;
	/** �� 180 �ϐ��F m_PREV_WORK_ODR_CD */
	public String m_PREV_WORK_ODR_CD = null;
	/** �� 181 �ϐ��F m_PREV_OPR_INST_CD */
	public String m_PREV_OPR_INST_CD = null;
	/** �� 182 �ϐ��F m_PREV_PARTIAL_PRD_NO */
	public String m_PREV_PARTIAL_PRD_NO = null;
	/** �� 183 �ϐ��F m_PREV_PROC_NO */
	public String m_PREV_PROC_NO = null;
	/** �� 184 �ϐ��F m_PREV_WH_CD */
	public String m_PREV_WH_CD = null;
	/** �� 185 �ϐ��F m_DATA_COUNT */
	public String m_DATA_COUNT = null;
	/** �� 186 �ϐ��F m_WH_CD_COUNT */
	public String m_WH_CD_COUNT = null;
	/** �� 187 �ϐ��F m_FROM_PUCH_ODR_CD */
	public String m_FROM_PUCH_ODR_CD = null;
	/** �� 188 �ϐ��F m_TO_PUCH_ODR_CD */
	public String m_TO_PUCH_ODR_CD = null;
	/** �� 189 �ϐ��F m_FROM_ITEM_CD */
	public String m_FROM_ITEM_CD = null;
	/** �� 190 �ϐ��F m_FROM_LOT_NO */
	public String m_FROM_LOT_NO = null;
	/** �� 191 �ϐ��F m_TO_ITEM_CD */
	public String m_TO_ITEM_CD = null;
	/** �� 192 �ϐ��F m_TO_LOT_NO */
	public String m_TO_LOT_NO = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_chk_COMPLETE */
	public List l_chk_COMPLETE = null;

	/** �� 2 List�ϐ��F l_OPRATION_TIME */
	public List l_OPRATION_TIME = null;

	/** �� 3 List�ϐ��F l_chk_OUTPUT */
	public List l_chk_OUTPUT = null;

	/** �� 4 List�ϐ��F l_d1_STOCK_UNIT */
	public List l_d1_STOCK_UNIT = null;

	/** �� 5 List�ϐ��F l_OPR_TIME_UNIT_TYP_name */
	public List l_OPR_TIME_UNIT_TYP_name = null;

	/** �� 6 List�ϐ��F l_OPR_TIME_UNIT_TYP_val */
	public List l_OPR_TIME_UNIT_TYP_val = null;

	/** �� 7 List�ϐ��F l_l_DEFECT_CAUSE_CD_name */
	public List l_l_DEFECT_CAUSE_CD_name = null;

	/** �� 8 List�ϐ��F l_l_DEFECT_CAUSE_CD_val */
	public List l_l_DEFECT_CAUSE_CD_val = null;

	/** �� 9 List�ϐ��F l_MRP_ODR_TYP_DN */
	public List l_MRP_ODR_TYP_DN = null;

	/** �� 10 List�ϐ��F l_DOWNLOAD_FILE */
	public List l_DOWNLOAD_FILE = null;

	/** �� 11 List�ϐ��F l_h_FINAL_PROC_FLG */
	public List l_h_FINAL_PROC_FLG = null;

	/** �� 12 List�ϐ��F l_h_SYS_LOT_CTRL_FLG */
	public List l_h_SYS_LOT_CTRL_FLG = null;

	/** �� 13 List�ϐ��F l_chk_CHILD_RSLTUPDATE */
	public List l_chk_CHILD_RSLTUPDATE = null;

	/** �� 14 List�ϐ��F l_param1 */
	public List l_param1 = null;

	/** �� 15 List�ϐ��F l_param2 */
	public List l_param2 = null;

	/** �� 16 List�ϐ��F l_param3 */
	public List l_param3 = null;

	/** �� 17 List�ϐ��F l_h_PROCESS_MANAGE_FLG */
	public List l_h_PROCESS_MANAGE_FLG = null;

	/** �� 18 List�ϐ��F l_TEMP_PLAN_QTY */
	public List l_TEMP_PLAN_QTY = null;

	/** �� 19 List�ϐ��F l_TEMP_USEOVER_QTY */
	public List l_TEMP_USEOVER_QTY = null;

	/** �� 20 List�ϐ��F l_TEMP_PLANOUT_QTY */
	public List l_TEMP_PLANOUT_QTY = null;

	/** �� 21 List�ϐ��F l_TEMP_USE_QTY */
	public List l_TEMP_USE_QTY = null;

	/** �� 22 List�ϐ��F l_l_PARTIAL_PRD_NO */
	public List l_l_PARTIAL_PRD_NO = null;

	/** �� 23 List�ϐ��F l_FIRST_WORK_FLG */
	public List l_FIRST_WORK_FLG = null;

	/** �� 24 List�ϐ��F l_USE_LOT_NO */
	public List l_USE_LOT_NO = null;

	/** �� 25 List�ϐ��F l_USE_ACPT_QTY */
	public List l_USE_ACPT_QTY = null;

	/** �� 26 List�ϐ��F l_USE_DEFECT_QTY */
	public List l_USE_DEFECT_QTY = null;

	/** �� 27 List�ϐ��F l_IN_OPR_INST_CD */
	public List l_IN_OPR_INST_CD = null;

	/** �� 28 List�ϐ��F l_PARTIAL_PRD_NO */
	public List l_PARTIAL_PRD_NO = null;

	/** �� 29 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 30 List�ϐ��F l_WS_CD */
	public List l_WS_CD = null;

	/** �� 31 List�ϐ��F l_WORK_IN_PROC_CD */
	public List l_WORK_IN_PROC_CD = null;

	/** �� 32 List�ϐ��F l_PROC_NAME */
	public List l_PROC_NAME = null;

	/** �� 33 List�ϐ��F l_PROC_NO */
	public List l_PROC_NO = null;

	/** �� 34 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 35 List�ϐ��F l_WORK_STS_TYP */
	public List l_WORK_STS_TYP = null;

	/** �� 36 List�ϐ��F l_WORK_ODR_CD */
	public List l_WORK_ODR_CD = null;

	/** �� 37 List�ϐ��F l_OD_NO */
	public List l_OD_NO = null;

	/** �� 38 List�ϐ��F l_OUTSIDE_TYP */
	public List l_OUTSIDE_TYP = null;

	/** �� 39 List�ϐ��F l_PROC_MODIFY_COUNT */
	public List l_PROC_MODIFY_COUNT = null;

	/** �� 40 List�ϐ��F l_FINAL_PROC_FLG */
	public List l_FINAL_PROC_FLG = null;

	/** �� 41 List�ϐ��F l_WORK_ODR_DLV_DATE */
	public List l_WORK_ODR_DLV_DATE = null;

	/** �� 42 List�ϐ��F l_OPR_INST_START_DATE */
	public List l_OPR_INST_START_DATE = null;

	/** �� 43 List�ϐ��F l_OPR_INST_QTY */
	public List l_OPR_INST_QTY = null;

	/** �� 44 List�ϐ��F l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** �� 45 List�ϐ��F l_UNIT_QTY_TYP */
	public List l_UNIT_QTY_TYP = null;

	/** �� 46 List�ϐ��F l_DRAW_CD */
	public List l_DRAW_CD = null;

	/** �� 47 List�ϐ��F l_SPEC */
	public List l_SPEC = null;

	/** �� 48 List�ϐ��F l_MRP_ODR_TYP */
	public List l_MRP_ODR_TYP = null;

	/** �� 49 List�ϐ��F l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** �� 50 List�ϐ��F l_LOT_NUMBERING_TYP */
	public List l_LOT_NUMBERING_TYP = null;

	/** �� 51 List�ϐ��F l_LOT_CTRL_FLG */
	public List l_LOT_CTRL_FLG = null;

	/** �� 52 List�ϐ��F l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** �� 53 List�ϐ��F l_JOB_ODR_DETAIL_NO */
	public List l_JOB_ODR_DETAIL_NO = null;

	/** �� 54 List�ϐ��F l_JOB_ODR_CANCEL_NO */
	public List l_JOB_ODR_CANCEL_NO = null;

	/** �� 55 List�ϐ��F l_WS_NAME */
	public List l_WS_NAME = null;

	/** �� 56 List�ϐ��F l_SUM_ACPT_QTY */
	public List l_SUM_ACPT_QTY = null;

	/** �� 57 List�ϐ��F l_SUM_DEFECT_QTY */
	public List l_SUM_DEFECT_QTY = null;

	/** �� 58 List�ϐ��F l_OPR_RSLT_TYP */
	public List l_OPR_RSLT_TYP = null;

	/** �� 59 List�ϐ��F l_ITEM_MODIFY_COUNT */
	public List l_ITEM_MODIFY_COUNT = null;

	/** �� 60 List�ϐ��F l_h_OPR_DATE */
	public List l_h_OPR_DATE = null;

	/** �� 61 List�ϐ��F l_TIME_CTRL */
	public List l_TIME_CTRL = null;

	/** �� 62 List�ϐ��F l_h_BUSINESS_OPR_DATE */
	public List l_h_BUSINESS_OPR_DATE = null;

	/** �� 63 List�ϐ��F l_h_BUSINESS_OPR_TIME */
	public List l_h_BUSINESS_OPR_TIME = null;

	/** �� 64 List�ϐ��F l_FORM_SET_ITEM_CD */
	public List l_FORM_SET_ITEM_CD = null;

	/** �� 65 List�ϐ��F l_WH_NAME */
	public List l_WH_NAME = null;

	/** �� 66 List�ϐ��F l_WH_CD */
	public List l_WH_CD = null;

	/** �� 67 List�ϐ��F l_PROC_EXEC_DATE */
	public List l_PROC_EXEC_DATE = null;

	/** �� 68 List�ϐ��F l_PAST_RESULT_ENTRY_TYP */
	public List l_PAST_RESULT_ENTRY_TYP = null;

	/** �� 69 List�ϐ��F l_LOT_NO */
	public List l_LOT_NO = null;

	/** �� 70 List�ϐ��F l_ACPT_QTY */
	public List l_ACPT_QTY = null;

	/** �� 71 List�ϐ��F l_DEFECT_QTY */
	public List l_DEFECT_QTY = null;

	/** �� 72 List�ϐ��F l_OPR_DATE */
	public List l_OPR_DATE = null;

	/** �� 73 List�ϐ��F l_OPR_RSLT_PERSON */
	public List l_OPR_RSLT_PERSON = null;

	/** �� 74 List�ϐ��F l_OPR_RSLT_COMMENT */
	public List l_OPR_RSLT_COMMENT = null;

	/** �� 75 List�ϐ��F l_OPR_TIME_UNIT_TYP */
	public List l_OPR_TIME_UNIT_TYP = null;

	/** �� 76 List�ϐ��F l_PRE_ARRANGEMENT_TIME */
	public List l_PRE_ARRANGEMENT_TIME = null;

	/** �� 77 List�ϐ��F l_POST_ARRANGEMENT_TIME */
	public List l_POST_ARRANGEMENT_TIME = null;

	/** �� 78 List�ϐ��F l_OPR_TIME */
	public List l_OPR_TIME = null;

	/** �� 79 List�ϐ��F l_CESSATION_TIME */
	public List l_CESSATION_TIME = null;

	/** �� 80 List�ϐ��F l_CESSATION_CAUSE */
	public List l_CESSATION_CAUSE = null;

	/** �� 81 List�ϐ��F l_OUTPUT_RSLT_CD */
	public List l_OUTPUT_RSLT_CD = null;

	/** �� 82 List�ϐ��F l_VEND_LOT_NO */
	public List l_VEND_LOT_NO = null;

	/** �� 83 List�ϐ��F l_OPR_CRCT_NO */
	public List l_OPR_CRCT_NO = null;

	/** �� 84 List�ϐ��F l_UPDATE_WORK_STS_TYP */
	public List l_UPDATE_WORK_STS_TYP = null;

	/** �� 85 List�ϐ��F l_JOB_ODR_TYP */
	public List l_JOB_ODR_TYP = null;

	/** �� 86 List�ϐ��F l_RCV_ISSUE_CTRL_CD */
	public List l_RCV_ISSUE_CTRL_CD = null;

	/** �� 87 List�ϐ��F l_RCV_ISSUE_TYP */
	public List l_RCV_ISSUE_TYP = null;

	/** �� 88 List�ϐ��F l_OPR_RSLT_CRCT_NO */
	public List l_OPR_RSLT_CRCT_NO = null;

	/** �� 89 List�ϐ��F l_h_ISSUE_INST_CD */
	public List l_h_ISSUE_INST_CD = null;

	/** �� 90 List�ϐ��F l_SAVE_STOCK_ON_HAND_QTY */
	public List l_SAVE_STOCK_ON_HAND_QTY = null;

	/** �� 91 List�ϐ��F l_RCV_ISSUE_QTY */
	public List l_RCV_ISSUE_QTY = null;

	/** �� 92 List�ϐ��F l_RCV_ISSUE_DATE */
	public List l_RCV_ISSUE_DATE = null;

	/** �� 93 List�ϐ��F l_RCV_ISSUE_GNR_TYP */
	public List l_RCV_ISSUE_GNR_TYP = null;

	/** �� 94 List�ϐ��F l_RCV_ISSUE_ODD_QTY */
	public List l_RCV_ISSUE_ODD_QTY = null;

	/** �� 95 List�ϐ��F l_STOCK_UPD_TYP */
	public List l_STOCK_UPD_TYP = null;

	/** �� 96 List�ϐ��F l_RCV_ISSUE_COMMENT */
	public List l_RCV_ISSUE_COMMENT = null;

	/** �� 97 List�ϐ��F l_RCV_ISSUE_CMPLT_FLG */
	public List l_RCV_ISSUE_CMPLT_FLG = null;

	/** �� 98 List�ϐ��F l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** �� 99 List�ϐ��F l_MANHOUR_TYP */
	public List l_MANHOUR_TYP = null;

	/** �� 100 List�ϐ��F l_PARENT_OD_NO */
	public List l_PARENT_OD_NO = null;

	/** �� 101 List�ϐ��F l_PARENT_OUTSIDE_TYP */
	public List l_PARENT_OUTSIDE_TYP = null;

	/** �� 102 List�ϐ��F l_PARENT_MRP_ODR_TYP */
	public List l_PARENT_MRP_ODR_TYP = null;

	/** �� 103 List�ϐ��F l_PARENT_WORK_ODR_CD */
	public List l_PARENT_WORK_ODR_CD = null;

	/** �� 104 List�ϐ��F l_PARENT_WORK_IN_PROC_CD */
	public List l_PARENT_WORK_IN_PROC_CD = null;

	/** �� 105 List�ϐ��F l_PARENT_PUCH_ODR_CD */
	public List l_PARENT_PUCH_ODR_CD = null;

	/** �� 106 List�ϐ��F l_PUCH_ODR_CD */
	public List l_PUCH_ODR_CD = null;

	/** �� 107 List�ϐ��F l_UPDATED_PRG_NM */
	public List l_UPDATED_PRG_NM = null;

	/** �� 108 List�ϐ��F l_ACPT_NO */
	public List l_ACPT_NO = null;

	/** �� 109 List�ϐ��F l_ISSUE_INST_CD */
	public List l_ISSUE_INST_CD = null;

	/** �� 110 List�ϐ��F l_GET_IDENT_CARD_CTL_NO */
	public List l_GET_IDENT_CARD_CTL_NO = null;

	/** �� 111 List�ϐ��F l_SEL_OPR_INST_CD */
	public List l_SEL_OPR_INST_CD = null;

	/** �� 112 List�ϐ��F l_SEL_PARTIAL_PRD_NO */
	public List l_SEL_PARTIAL_PRD_NO = null;

	/** �� 113 List�ϐ��F l_SEL_ITEM_CD */
	public List l_SEL_ITEM_CD = null;

	/** �� 114 List�ϐ��F l_SEL_ACPT_QTY */
	public List l_SEL_ACPT_QTY = null;

	/** �� 115 List�ϐ��F l_SEL_OPR_DATE */
	public List l_SEL_OPR_DATE = null;

	/** �� 116 List�ϐ��F l_SEL_PKG_UNIT_QTY */
	public List l_SEL_PKG_UNIT_QTY = null;

	/** �� 117 List�ϐ��F l_SEL_PLANT_CD */
	public List l_SEL_PLANT_CD = null;

	/** �� 118 List�ϐ��F l_SEL_WS_CD */
	public List l_SEL_WS_CD = null;

	/** �� 119 List�ϐ��F l_INS_IDENT_CARD_CTL_NO */
	public List l_INS_IDENT_CARD_CTL_NO = null;

	/** �� 120 List�ϐ��F l_INS_OPR_INST_CD */
	public List l_INS_OPR_INST_CD = null;

	/** �� 121 List�ϐ��F l_INS_PARTIAL_PRD_NO */
	public List l_INS_PARTIAL_PRD_NO = null;

	/** �� 122 List�ϐ��F l_INS_RCV_ISSUE_CTRL_CD */
	public List l_INS_RCV_ISSUE_CTRL_CD = null;

	/** �� 123 List�ϐ��F l_INS_ITEM_CD */
	public List l_INS_ITEM_CD = null;

	/** �� 124 List�ϐ��F l_INS_JOB_ODR_CD */
	public List l_INS_JOB_ODR_CD = null;

	/** �� 125 List�ϐ��F l_INS_FIRST_IDENT_CARD_QTY */
	public List l_INS_FIRST_IDENT_CARD_QTY = null;

	/** �� 126 List�ϐ��F l_INS_IDENT_CARD_QTY */
	public List l_INS_IDENT_CARD_QTY = null;

	/** �� 127 List�ϐ��F l_INS_OPR_DATE */
	public List l_INS_OPR_DATE = null;

	/** �� 128 List�ϐ��F l_INS_PKG_UNIT_QTY */
	public List l_INS_PKG_UNIT_QTY = null;

	/** �� 129 List�ϐ��F l_INS_PLANT_CD */
	public List l_INS_PLANT_CD = null;

	/** �� 130 List�ϐ��F l_INS_WS_CD */
	public List l_INS_WS_CD = null;

	/** �� 131 List�ϐ��F l_OPR_INST_CD */
	public List l_OPR_INST_CD = null;

	/** �� 132 List�ϐ��F l_l_DEFECT_CAUSE_CD */
	public List l_l_DEFECT_CAUSE_CD = null;

	/** �� 133 List�ϐ��F l_l_DEFECT_QTY */
	public List l_l_DEFECT_QTY = null;

	/** �� 134 List�ϐ��F l_l_DEFECT_COMMENT */
	public List l_l_DEFECT_COMMENT = null;

	/** �� 135 List�ϐ��F l_RSLT_CTRL_SEQ_NO */
	public List l_RSLT_CTRL_SEQ_NO = null;

	/** �� 136 List�ϐ��F l_SUPPLIED_ISSUE_QTY */
	public List l_SUPPLIED_ISSUE_QTY = null;

	/** �� 137 List�ϐ��F l_SUPPLIED_ISSUE_QTY_sum */
	public List l_SUPPLIED_ISSUE_QTY_sum = null;

	/** �� 138 List�ϐ��F l_h_ISSUE_INST_UNIT_DENOMINATOR */
	public List l_h_ISSUE_INST_UNIT_DENOMINATOR = null;

	/** �� 139 List�ϐ��F l_h_ISSUE_INST_UNIT_NUMERATOR */
	public List l_h_ISSUE_INST_UNIT_NUMERATOR = null;

	/** �� 140 List�ϐ��F l_count_RCV_ISSUE */
	public List l_count_RCV_ISSUE = null;

	/** �� 141 List�ϐ��F l_STOCK_ON_HAND_QTY */
	public List l_STOCK_ON_HAND_QTY = null;

	/** �� 142 List�ϐ��F l_ISSUE_QTY */
	public List l_ISSUE_QTY = null;

	/** �� 143 List�ϐ��F l_ISSUE_DATE */
	public List l_ISSUE_DATE = null;

	/** �� 144 List�ϐ��F l_SPENT_QTY */
	public List l_SPENT_QTY = null;

	/** �� 145 List�ϐ��F l_NEXTVAL */
	public List l_NEXTVAL = null;

	/** �� 146 List�ϐ��F l_RSLT_CTL_SEQ_NO */
	public List l_RSLT_CTL_SEQ_NO = null;

	/** �� 147 List�ϐ��F l_TOTAL_ISSUE_QTY */
	public List l_TOTAL_ISSUE_QTY = null;

	/** �� 148 List�ϐ��F l_PART_SUPPLIED_COMMENT */
	public List l_PART_SUPPLIED_COMMENT = null;

	/** �� 149 List�ϐ��F l_SUPPLIED_DATE */
	public List l_SUPPLIED_DATE = null;

	/** �� 150 List�ϐ��F l_ALCD_QTY */
	public List l_ALCD_QTY = null;

	/** �� 151 List�ϐ��F l_TMP_IDENT_CARD_CTL_NO */
	public List l_TMP_IDENT_CARD_CTL_NO = null;

	/** �� 152 List�ϐ��F l_TMP_OPR_INST_CD */
	public List l_TMP_OPR_INST_CD = null;

	/** �� 153 List�ϐ��F l_TMP_PARTIAL_PRD_NO */
	public List l_TMP_PARTIAL_PRD_NO = null;

	/** �� 154 List�ϐ��F l_TMP_RCV_ISSUE_CTRL_CD */
	public List l_TMP_RCV_ISSUE_CTRL_CD = null;

	/** �� 155 List�ϐ��F l_TMP_ITEM_CD */
	public List l_TMP_ITEM_CD = null;

	/** �� 156 List�ϐ��F l_TMP_JOB_ODR_CD */
	public List l_TMP_JOB_ODR_CD = null;

	/** �� 157 List�ϐ��F l_TMP_FIRST_IDENT_CARD_QTY */
	public List l_TMP_FIRST_IDENT_CARD_QTY = null;

	/** �� 158 List�ϐ��F l_TMP_IDENT_CARD_QTY */
	public List l_TMP_IDENT_CARD_QTY = null;

	/** �� 159 List�ϐ��F l_TMP_OPR_DATE */
	public List l_TMP_OPR_DATE = null;

	/** �� 160 List�ϐ��F l_TMP_PKG_UNIT_QTY */
	public List l_TMP_PKG_UNIT_QTY = null;

	/** �� 161 List�ϐ��F l_TMP_PLANT_CD */
	public List l_TMP_PLANT_CD = null;

	/** �� 162 List�ϐ��F l_TMP_WS_CD */
	public List l_TMP_WS_CD = null;

	/** �� 163 List�ϐ��F l_INS_PRINT_GRP_NO */
	public List l_INS_PRINT_GRP_NO = null;

	/** �� 164 List�ϐ��F l_INS_PAGE_NO */
	public List l_INS_PAGE_NO = null;

	/** �� 165 List�ϐ��F l_INS_PRINT_QTY */
	public List l_INS_PRINT_QTY = null;

	/** �� 166 List�ϐ��F l_DM_STS_TYP */
	public List l_DM_STS_TYP = null;

	/** �� 167 List�ϐ��F l_ISSUE_CMPLT_DATE */
	public List l_ISSUE_CMPLT_DATE = null;

	/** �� 168 List�ϐ��F l_USER_CD */
	public List l_USER_CD = null;

	/** �� 169 List�ϐ��F l_PRODUCT_TYP */
	public List l_PRODUCT_TYP = null;

	/** �� 170 List�ϐ��F l_WH_TYP */
	public List l_WH_TYP = null;

	/** �� 171 List�ϐ��F l_NEXT_WH_CD */
	public List l_NEXT_WH_CD = null;

	/** �� 172 List�ϐ��F l_FIRST_OPR_INST_CD */
	public List l_FIRST_OPR_INST_CD = null;

	/** �� 173 List�ϐ��F l_FIRST_PROC_NO */
	public List l_FIRST_PROC_NO = null;

	/** �� 174 List�ϐ��F l_NEXT_WORK_ODR_CD */
	public List l_NEXT_WORK_ODR_CD = null;

	/** �� 175 List�ϐ��F l_NEXT_OPR_INST_CD */
	public List l_NEXT_OPR_INST_CD = null;

	/** �� 176 List�ϐ��F l_NEXT_PROC_NO */
	public List l_NEXT_PROC_NO = null;

	/** �� 177 List�ϐ��F l_NEXT_WS_CD */
	public List l_NEXT_WS_CD = null;

	/** �� 178 List�ϐ��F l_NEXT_WS_NAME */
	public List l_NEXT_WS_NAME = null;

	/** �� 179 List�ϐ��F l_NEXT_WH_NAME */
	public List l_NEXT_WH_NAME = null;

	/** �� 180 List�ϐ��F l_PREV_WORK_ODR_CD */
	public List l_PREV_WORK_ODR_CD = null;

	/** �� 181 List�ϐ��F l_PREV_OPR_INST_CD */
	public List l_PREV_OPR_INST_CD = null;

	/** �� 182 List�ϐ��F l_PREV_PARTIAL_PRD_NO */
	public List l_PREV_PARTIAL_PRD_NO = null;

	/** �� 183 List�ϐ��F l_PREV_PROC_NO */
	public List l_PREV_PROC_NO = null;

	/** �� 184 List�ϐ��F l_PREV_WH_CD */
	public List l_PREV_WH_CD = null;

	/** �� 185 List�ϐ��F l_DATA_COUNT */
	public List l_DATA_COUNT = null;

	/** �� 186 List�ϐ��F l_WH_CD_COUNT */
	public List l_WH_CD_COUNT = null;

	/** �� 187 List�ϐ��F l_FROM_PUCH_ODR_CD */
	public List l_FROM_PUCH_ODR_CD = null;

	/** �� 188 List�ϐ��F l_TO_PUCH_ODR_CD */
	public List l_TO_PUCH_ODR_CD = null;

	/** �� 189 List�ϐ��F l_FROM_ITEM_CD */
	public List l_FROM_ITEM_CD = null;

	/** �� 190 List�ϐ��F l_FROM_LOT_NO */
	public List l_FROM_LOT_NO = null;

	/** �� 191 List�ϐ��F l_TO_ITEM_CD */
	public List l_TO_ITEM_CD = null;

	/** �� 192 List�ϐ��F l_TO_LOT_NO */
	public List l_TO_LOT_NO = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getchk_COMPLETE() { return m_chk_COMPLETE; }
	public String getOPRATION_TIME() { return m_OPRATION_TIME; }
	public String getchk_OUTPUT() { return m_chk_OUTPUT; }
	public String getd1_STOCK_UNIT() { return m_d1_STOCK_UNIT; }
	public String getOPR_TIME_UNIT_TYP_name() { return m_OPR_TIME_UNIT_TYP_name; }
	public String getOPR_TIME_UNIT_TYP_val() { return m_OPR_TIME_UNIT_TYP_val; }
	public String getl_DEFECT_CAUSE_CD_name() { return m_l_DEFECT_CAUSE_CD_name; }
	public String getl_DEFECT_CAUSE_CD_val() { return m_l_DEFECT_CAUSE_CD_val; }
	public String getMRP_ODR_TYP_DN() { return m_MRP_ODR_TYP_DN; }
	public String getDOWNLOAD_FILE() { return m_DOWNLOAD_FILE; }
	public String geth_FINAL_PROC_FLG() { return m_h_FINAL_PROC_FLG; }
	public String geth_SYS_LOT_CTRL_FLG() { return m_h_SYS_LOT_CTRL_FLG; }
	public String getchk_CHILD_RSLTUPDATE() { return m_chk_CHILD_RSLTUPDATE; }
	public String getparam1() { return m_param1; }
	public String getparam2() { return m_param2; }
	public String getparam3() { return m_param3; }
	public String geth_PROCESS_MANAGE_FLG() { return m_h_PROCESS_MANAGE_FLG; }
	public String getTEMP_PLAN_QTY() { return m_TEMP_PLAN_QTY; }
	public String getTEMP_USEOVER_QTY() { return m_TEMP_USEOVER_QTY; }
	public String getTEMP_PLANOUT_QTY() { return m_TEMP_PLANOUT_QTY; }
	public String getTEMP_USE_QTY() { return m_TEMP_USE_QTY; }
	public String getl_PARTIAL_PRD_NO() { return m_l_PARTIAL_PRD_NO; }
	public String getFIRST_WORK_FLG() { return m_FIRST_WORK_FLG; }
	public String getUSE_LOT_NO() { return m_USE_LOT_NO; }
	public String getUSE_ACPT_QTY() { return m_USE_ACPT_QTY; }
	public String getUSE_DEFECT_QTY() { return m_USE_DEFECT_QTY; }
	public String getIN_OPR_INST_CD() { return m_IN_OPR_INST_CD; }
	public String getPARTIAL_PRD_NO() { return m_PARTIAL_PRD_NO; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getWS_CD() { return m_WS_CD; }
	public String getWORK_IN_PROC_CD() { return m_WORK_IN_PROC_CD; }
	public String getPROC_NAME() { return m_PROC_NAME; }
	public String getPROC_NO() { return m_PROC_NO; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getWORK_STS_TYP() { return m_WORK_STS_TYP; }
	public String getWORK_ODR_CD() { return m_WORK_ODR_CD; }
	public String getOD_NO() { return m_OD_NO; }
	public String getOUTSIDE_TYP() { return m_OUTSIDE_TYP; }
	public String getPROC_MODIFY_COUNT() { return m_PROC_MODIFY_COUNT; }
	public String getFINAL_PROC_FLG() { return m_FINAL_PROC_FLG; }
	public String getWORK_ODR_DLV_DATE() { return m_WORK_ODR_DLV_DATE; }
	public String getOPR_INST_START_DATE() { return m_OPR_INST_START_DATE; }
	public String getOPR_INST_QTY() { return m_OPR_INST_QTY; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getUNIT_QTY_TYP() { return m_UNIT_QTY_TYP; }
	public String getDRAW_CD() { return m_DRAW_CD; }
	public String getSPEC() { return m_SPEC; }
	public String getMRP_ODR_TYP() { return m_MRP_ODR_TYP; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String getLOT_NUMBERING_TYP() { return m_LOT_NUMBERING_TYP; }
	public String getLOT_CTRL_FLG() { return m_LOT_CTRL_FLG; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getJOB_ODR_DETAIL_NO() { return m_JOB_ODR_DETAIL_NO; }
	public String getJOB_ODR_CANCEL_NO() { return m_JOB_ODR_CANCEL_NO; }
	public String getWS_NAME() { return m_WS_NAME; }
	public String getSUM_ACPT_QTY() { return m_SUM_ACPT_QTY; }
	public String getSUM_DEFECT_QTY() { return m_SUM_DEFECT_QTY; }
	public String getOPR_RSLT_TYP() { return m_OPR_RSLT_TYP; }
	public String getITEM_MODIFY_COUNT() { return m_ITEM_MODIFY_COUNT; }
	public String geth_OPR_DATE() { return m_h_OPR_DATE; }
	public String getTIME_CTRL() { return m_TIME_CTRL; }
	public String geth_BUSINESS_OPR_DATE() { return m_h_BUSINESS_OPR_DATE; }
	public String geth_BUSINESS_OPR_TIME() { return m_h_BUSINESS_OPR_TIME; }
	public String getFORM_SET_ITEM_CD() { return m_FORM_SET_ITEM_CD; }
	public String getWH_NAME() { return m_WH_NAME; }
	public String getWH_CD() { return m_WH_CD; }
	public BigDecimal getPROC_EXEC_DATE() { return m_PROC_EXEC_DATE; }
	public String getPAST_RESULT_ENTRY_TYP() { return m_PAST_RESULT_ENTRY_TYP; }
	public String getLOT_NO() { return m_LOT_NO; }
	public String getACPT_QTY() { return m_ACPT_QTY; }
	public String getDEFECT_QTY() { return m_DEFECT_QTY; }
	public String getOPR_DATE() { return m_OPR_DATE; }
	public String getOPR_RSLT_PERSON() { return m_OPR_RSLT_PERSON; }
	public String getOPR_RSLT_COMMENT() { return m_OPR_RSLT_COMMENT; }
	public String getOPR_TIME_UNIT_TYP() { return m_OPR_TIME_UNIT_TYP; }
	public String getPRE_ARRANGEMENT_TIME() { return m_PRE_ARRANGEMENT_TIME; }
	public String getPOST_ARRANGEMENT_TIME() { return m_POST_ARRANGEMENT_TIME; }
	public String getOPR_TIME() { return m_OPR_TIME; }
	public String getCESSATION_TIME() { return m_CESSATION_TIME; }
	public String getCESSATION_CAUSE() { return m_CESSATION_CAUSE; }
	public String getOUTPUT_RSLT_CD() { return m_OUTPUT_RSLT_CD; }
	public String getVEND_LOT_NO() { return m_VEND_LOT_NO; }
	public String getOPR_CRCT_NO() { return m_OPR_CRCT_NO; }
	public String getUPDATE_WORK_STS_TYP() { return m_UPDATE_WORK_STS_TYP; }
	public String getJOB_ODR_TYP() { return m_JOB_ODR_TYP; }
	public String getRCV_ISSUE_CTRL_CD() { return m_RCV_ISSUE_CTRL_CD; }
	public String getRCV_ISSUE_TYP() { return m_RCV_ISSUE_TYP; }
	public String getOPR_RSLT_CRCT_NO() { return m_OPR_RSLT_CRCT_NO; }
	public String geth_ISSUE_INST_CD() { return m_h_ISSUE_INST_CD; }
	public String getSAVE_STOCK_ON_HAND_QTY() { return m_SAVE_STOCK_ON_HAND_QTY; }
	public String getRCV_ISSUE_QTY() { return m_RCV_ISSUE_QTY; }
	public String getRCV_ISSUE_DATE() { return m_RCV_ISSUE_DATE; }
	public String getRCV_ISSUE_GNR_TYP() { return m_RCV_ISSUE_GNR_TYP; }
	public String getRCV_ISSUE_ODD_QTY() { return m_RCV_ISSUE_ODD_QTY; }
	public String getSTOCK_UPD_TYP() { return m_STOCK_UPD_TYP; }
	public String getRCV_ISSUE_COMMENT() { return m_RCV_ISSUE_COMMENT; }
	public String getRCV_ISSUE_CMPLT_FLG() { return m_RCV_ISSUE_CMPLT_FLG; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getMANHOUR_TYP() { return m_MANHOUR_TYP; }
	public String getPARENT_OD_NO() { return m_PARENT_OD_NO; }
	public String getPARENT_OUTSIDE_TYP() { return m_PARENT_OUTSIDE_TYP; }
	public String getPARENT_MRP_ODR_TYP() { return m_PARENT_MRP_ODR_TYP; }
	public String getPARENT_WORK_ODR_CD() { return m_PARENT_WORK_ODR_CD; }
	public String getPARENT_WORK_IN_PROC_CD() { return m_PARENT_WORK_IN_PROC_CD; }
	public String getPARENT_PUCH_ODR_CD() { return m_PARENT_PUCH_ODR_CD; }
	public String getPUCH_ODR_CD() { return m_PUCH_ODR_CD; }
	public String getUPDATED_PRG_NM() { return m_UPDATED_PRG_NM; }
	public String getACPT_NO() { return m_ACPT_NO; }
	public String getISSUE_INST_CD() { return m_ISSUE_INST_CD; }
	public String getGET_IDENT_CARD_CTL_NO() { return m_GET_IDENT_CARD_CTL_NO; }
	public String getSEL_OPR_INST_CD() { return m_SEL_OPR_INST_CD; }
	public String getSEL_PARTIAL_PRD_NO() { return m_SEL_PARTIAL_PRD_NO; }
	public String getSEL_ITEM_CD() { return m_SEL_ITEM_CD; }
	public String getSEL_ACPT_QTY() { return m_SEL_ACPT_QTY; }
	public String getSEL_OPR_DATE() { return m_SEL_OPR_DATE; }
	public String getSEL_PKG_UNIT_QTY() { return m_SEL_PKG_UNIT_QTY; }
	public String getSEL_PLANT_CD() { return m_SEL_PLANT_CD; }
	public String getSEL_WS_CD() { return m_SEL_WS_CD; }
	public String getINS_IDENT_CARD_CTL_NO() { return m_INS_IDENT_CARD_CTL_NO; }
	public String getINS_OPR_INST_CD() { return m_INS_OPR_INST_CD; }
	public String getINS_PARTIAL_PRD_NO() { return m_INS_PARTIAL_PRD_NO; }
	public String getINS_RCV_ISSUE_CTRL_CD() { return m_INS_RCV_ISSUE_CTRL_CD; }
	public String getINS_ITEM_CD() { return m_INS_ITEM_CD; }
	public String getINS_JOB_ODR_CD() { return m_INS_JOB_ODR_CD; }
	public String getINS_FIRST_IDENT_CARD_QTY() { return m_INS_FIRST_IDENT_CARD_QTY; }
	public String getINS_IDENT_CARD_QTY() { return m_INS_IDENT_CARD_QTY; }
	public String getINS_OPR_DATE() { return m_INS_OPR_DATE; }
	public String getINS_PKG_UNIT_QTY() { return m_INS_PKG_UNIT_QTY; }
	public String getINS_PLANT_CD() { return m_INS_PLANT_CD; }
	public String getINS_WS_CD() { return m_INS_WS_CD; }
	public String getOPR_INST_CD() { return m_OPR_INST_CD; }
	public String getl_DEFECT_CAUSE_CD() { return m_l_DEFECT_CAUSE_CD; }
	public String getl_DEFECT_QTY() { return m_l_DEFECT_QTY; }
	public String getl_DEFECT_COMMENT() { return m_l_DEFECT_COMMENT; }
	public String getRSLT_CTRL_SEQ_NO() { return m_RSLT_CTRL_SEQ_NO; }
	public String getSUPPLIED_ISSUE_QTY() { return m_SUPPLIED_ISSUE_QTY; }
	public String getSUPPLIED_ISSUE_QTY_sum() { return m_SUPPLIED_ISSUE_QTY_sum; }
	public String geth_ISSUE_INST_UNIT_DENOMINATOR() { return m_h_ISSUE_INST_UNIT_DENOMINATOR; }
	public String geth_ISSUE_INST_UNIT_NUMERATOR() { return m_h_ISSUE_INST_UNIT_NUMERATOR; }
	public String getcount_RCV_ISSUE() { return m_count_RCV_ISSUE; }
	public String getSTOCK_ON_HAND_QTY() { return m_STOCK_ON_HAND_QTY; }
	public String getISSUE_QTY() { return m_ISSUE_QTY; }
	public String getISSUE_DATE() { return m_ISSUE_DATE; }
	public String getSPENT_QTY() { return m_SPENT_QTY; }
	public String getNEXTVAL() { return m_NEXTVAL; }
	public String getRSLT_CTL_SEQ_NO() { return m_RSLT_CTL_SEQ_NO; }
	public String getTOTAL_ISSUE_QTY() { return m_TOTAL_ISSUE_QTY; }
	public String getPART_SUPPLIED_COMMENT() { return m_PART_SUPPLIED_COMMENT; }
	public String getSUPPLIED_DATE() { return m_SUPPLIED_DATE; }
	public String getALCD_QTY() { return m_ALCD_QTY; }
	public String getTMP_IDENT_CARD_CTL_NO() { return m_TMP_IDENT_CARD_CTL_NO; }
	public String getTMP_OPR_INST_CD() { return m_TMP_OPR_INST_CD; }
	public String getTMP_PARTIAL_PRD_NO() { return m_TMP_PARTIAL_PRD_NO; }
	public String getTMP_RCV_ISSUE_CTRL_CD() { return m_TMP_RCV_ISSUE_CTRL_CD; }
	public String getTMP_ITEM_CD() { return m_TMP_ITEM_CD; }
	public String getTMP_JOB_ODR_CD() { return m_TMP_JOB_ODR_CD; }
	public String getTMP_FIRST_IDENT_CARD_QTY() { return m_TMP_FIRST_IDENT_CARD_QTY; }
	public String getTMP_IDENT_CARD_QTY() { return m_TMP_IDENT_CARD_QTY; }
	public String getTMP_OPR_DATE() { return m_TMP_OPR_DATE; }
	public String getTMP_PKG_UNIT_QTY() { return m_TMP_PKG_UNIT_QTY; }
	public String getTMP_PLANT_CD() { return m_TMP_PLANT_CD; }
	public String getTMP_WS_CD() { return m_TMP_WS_CD; }
	public String getINS_PRINT_GRP_NO() { return m_INS_PRINT_GRP_NO; }
	public String getINS_PAGE_NO() { return m_INS_PAGE_NO; }
	public String getINS_PRINT_QTY() { return m_INS_PRINT_QTY; }
	public String getDM_STS_TYP() { return m_DM_STS_TYP; }
	public String getISSUE_CMPLT_DATE() { return m_ISSUE_CMPLT_DATE; }
	public String getUSER_CD() { return m_USER_CD; }
	public String getPRODUCT_TYP() { return m_PRODUCT_TYP; }
	public String getWH_TYP() { return m_WH_TYP; }
	public String getNEXT_WH_CD() { return m_NEXT_WH_CD; }
	public String getFIRST_OPR_INST_CD() { return m_FIRST_OPR_INST_CD; }
	public String getFIRST_PROC_NO() { return m_FIRST_PROC_NO; }
	public String getNEXT_WORK_ODR_CD() { return m_NEXT_WORK_ODR_CD; }
	public String getNEXT_OPR_INST_CD() { return m_NEXT_OPR_INST_CD; }
	public String getNEXT_PROC_NO() { return m_NEXT_PROC_NO; }
	public String getNEXT_WS_CD() { return m_NEXT_WS_CD; }
	public String getNEXT_WS_NAME() { return m_NEXT_WS_NAME; }
	public String getNEXT_WH_NAME() { return m_NEXT_WH_NAME; }
	public String getPREV_WORK_ODR_CD() { return m_PREV_WORK_ODR_CD; }
	public String getPREV_OPR_INST_CD() { return m_PREV_OPR_INST_CD; }
	public String getPREV_PARTIAL_PRD_NO() { return m_PREV_PARTIAL_PRD_NO; }
	public String getPREV_PROC_NO() { return m_PREV_PROC_NO; }
	public String getPREV_WH_CD() { return m_PREV_WH_CD; }
	public String getDATA_COUNT() { return m_DATA_COUNT; }
	public String getWH_CD_COUNT() { return m_WH_CD_COUNT; }
	public String getFROM_PUCH_ODR_CD() { return m_FROM_PUCH_ODR_CD; }
	public String getTO_PUCH_ODR_CD() { return m_TO_PUCH_ODR_CD; }
	public String getFROM_ITEM_CD() { return m_FROM_ITEM_CD; }
	public String getFROM_LOT_NO() { return m_FROM_LOT_NO; }
	public String getTO_ITEM_CD() { return m_TO_ITEM_CD; }
	public String getTO_LOT_NO() { return m_TO_LOT_NO; }

	public List getList_chk_COMPLETE() { return l_chk_COMPLETE; }
	public List getList_OPRATION_TIME() { return l_OPRATION_TIME; }
	public List getList_chk_OUTPUT() { return l_chk_OUTPUT; }
	public List getList_d1_STOCK_UNIT() { return l_d1_STOCK_UNIT; }
	public List getList_OPR_TIME_UNIT_TYP_name() { return l_OPR_TIME_UNIT_TYP_name; }
	public List getList_OPR_TIME_UNIT_TYP_val() { return l_OPR_TIME_UNIT_TYP_val; }
	public List getList_l_DEFECT_CAUSE_CD_name() { return l_l_DEFECT_CAUSE_CD_name; }
	public List getList_l_DEFECT_CAUSE_CD_val() { return l_l_DEFECT_CAUSE_CD_val; }
	public List getList_MRP_ODR_TYP_DN() { return l_MRP_ODR_TYP_DN; }
	public List getList_DOWNLOAD_FILE() { return l_DOWNLOAD_FILE; }
	public List getList_h_FINAL_PROC_FLG() { return l_h_FINAL_PROC_FLG; }
	public List getList_h_SYS_LOT_CTRL_FLG() { return l_h_SYS_LOT_CTRL_FLG; }
	public List getList_chk_CHILD_RSLTUPDATE() { return l_chk_CHILD_RSLTUPDATE; }
	public List getList_param1() { return l_param1; }
	public List getList_param2() { return l_param2; }
	public List getList_param3() { return l_param3; }
	public List getList_h_PROCESS_MANAGE_FLG() { return l_h_PROCESS_MANAGE_FLG; }
	public List getList_TEMP_PLAN_QTY() { return l_TEMP_PLAN_QTY; }
	public List getList_TEMP_USEOVER_QTY() { return l_TEMP_USEOVER_QTY; }
	public List getList_TEMP_PLANOUT_QTY() { return l_TEMP_PLANOUT_QTY; }
	public List getList_TEMP_USE_QTY() { return l_TEMP_USE_QTY; }
	public List getList_l_PARTIAL_PRD_NO() { return l_l_PARTIAL_PRD_NO; }
	public List getList_FIRST_WORK_FLG() { return l_FIRST_WORK_FLG; }
	public List getList_USE_LOT_NO() { return l_USE_LOT_NO; }
	public List getList_USE_ACPT_QTY() { return l_USE_ACPT_QTY; }
	public List getList_USE_DEFECT_QTY() { return l_USE_DEFECT_QTY; }
	public List getList_IN_OPR_INST_CD() { return l_IN_OPR_INST_CD; }
	public List getList_PARTIAL_PRD_NO() { return l_PARTIAL_PRD_NO; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_WS_CD() { return l_WS_CD; }
	public List getList_WORK_IN_PROC_CD() { return l_WORK_IN_PROC_CD; }
	public List getList_PROC_NAME() { return l_PROC_NAME; }
	public List getList_PROC_NO() { return l_PROC_NO; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_WORK_STS_TYP() { return l_WORK_STS_TYP; }
	public List getList_WORK_ODR_CD() { return l_WORK_ODR_CD; }
	public List getList_OD_NO() { return l_OD_NO; }
	public List getList_OUTSIDE_TYP() { return l_OUTSIDE_TYP; }
	public List getList_PROC_MODIFY_COUNT() { return l_PROC_MODIFY_COUNT; }
	public List getList_FINAL_PROC_FLG() { return l_FINAL_PROC_FLG; }
	public List getList_WORK_ODR_DLV_DATE() { return l_WORK_ODR_DLV_DATE; }
	public List getList_OPR_INST_START_DATE() { return l_OPR_INST_START_DATE; }
	public List getList_OPR_INST_QTY() { return l_OPR_INST_QTY; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_UNIT_QTY_TYP() { return l_UNIT_QTY_TYP; }
	public List getList_DRAW_CD() { return l_DRAW_CD; }
	public List getList_SPEC() { return l_SPEC; }
	public List getList_MRP_ODR_TYP() { return l_MRP_ODR_TYP; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_LOT_NUMBERING_TYP() { return l_LOT_NUMBERING_TYP; }
	public List getList_LOT_CTRL_FLG() { return l_LOT_CTRL_FLG; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_JOB_ODR_DETAIL_NO() { return l_JOB_ODR_DETAIL_NO; }
	public List getList_JOB_ODR_CANCEL_NO() { return l_JOB_ODR_CANCEL_NO; }
	public List getList_WS_NAME() { return l_WS_NAME; }
	public List getList_SUM_ACPT_QTY() { return l_SUM_ACPT_QTY; }
	public List getList_SUM_DEFECT_QTY() { return l_SUM_DEFECT_QTY; }
	public List getList_OPR_RSLT_TYP() { return l_OPR_RSLT_TYP; }
	public List getList_ITEM_MODIFY_COUNT() { return l_ITEM_MODIFY_COUNT; }
	public List getList_h_OPR_DATE() { return l_h_OPR_DATE; }
	public List getList_TIME_CTRL() { return l_TIME_CTRL; }
	public List getList_h_BUSINESS_OPR_DATE() { return l_h_BUSINESS_OPR_DATE; }
	public List getList_h_BUSINESS_OPR_TIME() { return l_h_BUSINESS_OPR_TIME; }
	public List getList_FORM_SET_ITEM_CD() { return l_FORM_SET_ITEM_CD; }
	public List getList_WH_NAME() { return l_WH_NAME; }
	public List getList_WH_CD() { return l_WH_CD; }
	public List getList_PROC_EXEC_DATE() { return l_PROC_EXEC_DATE; }
	public List getList_PAST_RESULT_ENTRY_TYP() { return l_PAST_RESULT_ENTRY_TYP; }
	public List getList_LOT_NO() { return l_LOT_NO; }
	public List getList_ACPT_QTY() { return l_ACPT_QTY; }
	public List getList_DEFECT_QTY() { return l_DEFECT_QTY; }
	public List getList_OPR_DATE() { return l_OPR_DATE; }
	public List getList_OPR_RSLT_PERSON() { return l_OPR_RSLT_PERSON; }
	public List getList_OPR_RSLT_COMMENT() { return l_OPR_RSLT_COMMENT; }
	public List getList_OPR_TIME_UNIT_TYP() { return l_OPR_TIME_UNIT_TYP; }
	public List getList_PRE_ARRANGEMENT_TIME() { return l_PRE_ARRANGEMENT_TIME; }
	public List getList_POST_ARRANGEMENT_TIME() { return l_POST_ARRANGEMENT_TIME; }
	public List getList_OPR_TIME() { return l_OPR_TIME; }
	public List getList_CESSATION_TIME() { return l_CESSATION_TIME; }
	public List getList_CESSATION_CAUSE() { return l_CESSATION_CAUSE; }
	public List getList_OUTPUT_RSLT_CD() { return l_OUTPUT_RSLT_CD; }
	public List getList_VEND_LOT_NO() { return l_VEND_LOT_NO; }
	public List getList_OPR_CRCT_NO() { return l_OPR_CRCT_NO; }
	public List getList_UPDATE_WORK_STS_TYP() { return l_UPDATE_WORK_STS_TYP; }
	public List getList_JOB_ODR_TYP() { return l_JOB_ODR_TYP; }
	public List getList_RCV_ISSUE_CTRL_CD() { return l_RCV_ISSUE_CTRL_CD; }
	public List getList_RCV_ISSUE_TYP() { return l_RCV_ISSUE_TYP; }
	public List getList_OPR_RSLT_CRCT_NO() { return l_OPR_RSLT_CRCT_NO; }
	public List getList_h_ISSUE_INST_CD() { return l_h_ISSUE_INST_CD; }
	public List getList_SAVE_STOCK_ON_HAND_QTY() { return l_SAVE_STOCK_ON_HAND_QTY; }
	public List getList_RCV_ISSUE_QTY() { return l_RCV_ISSUE_QTY; }
	public List getList_RCV_ISSUE_DATE() { return l_RCV_ISSUE_DATE; }
	public List getList_RCV_ISSUE_GNR_TYP() { return l_RCV_ISSUE_GNR_TYP; }
	public List getList_RCV_ISSUE_ODD_QTY() { return l_RCV_ISSUE_ODD_QTY; }
	public List getList_STOCK_UPD_TYP() { return l_STOCK_UPD_TYP; }
	public List getList_RCV_ISSUE_COMMENT() { return l_RCV_ISSUE_COMMENT; }
	public List getList_RCV_ISSUE_CMPLT_FLG() { return l_RCV_ISSUE_CMPLT_FLG; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_MANHOUR_TYP() { return l_MANHOUR_TYP; }
	public List getList_PARENT_OD_NO() { return l_PARENT_OD_NO; }
	public List getList_PARENT_OUTSIDE_TYP() { return l_PARENT_OUTSIDE_TYP; }
	public List getList_PARENT_MRP_ODR_TYP() { return l_PARENT_MRP_ODR_TYP; }
	public List getList_PARENT_WORK_ODR_CD() { return l_PARENT_WORK_ODR_CD; }
	public List getList_PARENT_WORK_IN_PROC_CD() { return l_PARENT_WORK_IN_PROC_CD; }
	public List getList_PARENT_PUCH_ODR_CD() { return l_PARENT_PUCH_ODR_CD; }
	public List getList_PUCH_ODR_CD() { return l_PUCH_ODR_CD; }
	public List getList_UPDATED_PRG_NM() { return l_UPDATED_PRG_NM; }
	public List getList_ACPT_NO() { return l_ACPT_NO; }
	public List getList_ISSUE_INST_CD() { return l_ISSUE_INST_CD; }
	public List getList_GET_IDENT_CARD_CTL_NO() { return l_GET_IDENT_CARD_CTL_NO; }
	public List getList_SEL_OPR_INST_CD() { return l_SEL_OPR_INST_CD; }
	public List getList_SEL_PARTIAL_PRD_NO() { return l_SEL_PARTIAL_PRD_NO; }
	public List getList_SEL_ITEM_CD() { return l_SEL_ITEM_CD; }
	public List getList_SEL_ACPT_QTY() { return l_SEL_ACPT_QTY; }
	public List getList_SEL_OPR_DATE() { return l_SEL_OPR_DATE; }
	public List getList_SEL_PKG_UNIT_QTY() { return l_SEL_PKG_UNIT_QTY; }
	public List getList_SEL_PLANT_CD() { return l_SEL_PLANT_CD; }
	public List getList_SEL_WS_CD() { return l_SEL_WS_CD; }
	public List getList_INS_IDENT_CARD_CTL_NO() { return l_INS_IDENT_CARD_CTL_NO; }
	public List getList_INS_OPR_INST_CD() { return l_INS_OPR_INST_CD; }
	public List getList_INS_PARTIAL_PRD_NO() { return l_INS_PARTIAL_PRD_NO; }
	public List getList_INS_RCV_ISSUE_CTRL_CD() { return l_INS_RCV_ISSUE_CTRL_CD; }
	public List getList_INS_ITEM_CD() { return l_INS_ITEM_CD; }
	public List getList_INS_JOB_ODR_CD() { return l_INS_JOB_ODR_CD; }
	public List getList_INS_FIRST_IDENT_CARD_QTY() { return l_INS_FIRST_IDENT_CARD_QTY; }
	public List getList_INS_IDENT_CARD_QTY() { return l_INS_IDENT_CARD_QTY; }
	public List getList_INS_OPR_DATE() { return l_INS_OPR_DATE; }
	public List getList_INS_PKG_UNIT_QTY() { return l_INS_PKG_UNIT_QTY; }
	public List getList_INS_PLANT_CD() { return l_INS_PLANT_CD; }
	public List getList_INS_WS_CD() { return l_INS_WS_CD; }
	public List getList_OPR_INST_CD() { return l_OPR_INST_CD; }
	public List getList_l_DEFECT_CAUSE_CD() { return l_l_DEFECT_CAUSE_CD; }
	public List getList_l_DEFECT_QTY() { return l_l_DEFECT_QTY; }
	public List getList_l_DEFECT_COMMENT() { return l_l_DEFECT_COMMENT; }
	public List getList_RSLT_CTRL_SEQ_NO() { return l_RSLT_CTRL_SEQ_NO; }
	public List getList_SUPPLIED_ISSUE_QTY() { return l_SUPPLIED_ISSUE_QTY; }
	public List getList_SUPPLIED_ISSUE_QTY_sum() { return l_SUPPLIED_ISSUE_QTY_sum; }
	public List getList_h_ISSUE_INST_UNIT_DENOMINATOR() { return l_h_ISSUE_INST_UNIT_DENOMINATOR; }
	public List getList_h_ISSUE_INST_UNIT_NUMERATOR() { return l_h_ISSUE_INST_UNIT_NUMERATOR; }
	public List getList_count_RCV_ISSUE() { return l_count_RCV_ISSUE; }
	public List getList_STOCK_ON_HAND_QTY() { return l_STOCK_ON_HAND_QTY; }
	public List getList_ISSUE_QTY() { return l_ISSUE_QTY; }
	public List getList_ISSUE_DATE() { return l_ISSUE_DATE; }
	public List getList_SPENT_QTY() { return l_SPENT_QTY; }
	public List getList_NEXTVAL() { return l_NEXTVAL; }
	public List getList_RSLT_CTL_SEQ_NO() { return l_RSLT_CTL_SEQ_NO; }
	public List getList_TOTAL_ISSUE_QTY() { return l_TOTAL_ISSUE_QTY; }
	public List getList_PART_SUPPLIED_COMMENT() { return l_PART_SUPPLIED_COMMENT; }
	public List getList_SUPPLIED_DATE() { return l_SUPPLIED_DATE; }
	public List getList_ALCD_QTY() { return l_ALCD_QTY; }
	public List getList_TMP_IDENT_CARD_CTL_NO() { return l_TMP_IDENT_CARD_CTL_NO; }
	public List getList_TMP_OPR_INST_CD() { return l_TMP_OPR_INST_CD; }
	public List getList_TMP_PARTIAL_PRD_NO() { return l_TMP_PARTIAL_PRD_NO; }
	public List getList_TMP_RCV_ISSUE_CTRL_CD() { return l_TMP_RCV_ISSUE_CTRL_CD; }
	public List getList_TMP_ITEM_CD() { return l_TMP_ITEM_CD; }
	public List getList_TMP_JOB_ODR_CD() { return l_TMP_JOB_ODR_CD; }
	public List getList_TMP_FIRST_IDENT_CARD_QTY() { return l_TMP_FIRST_IDENT_CARD_QTY; }
	public List getList_TMP_IDENT_CARD_QTY() { return l_TMP_IDENT_CARD_QTY; }
	public List getList_TMP_OPR_DATE() { return l_TMP_OPR_DATE; }
	public List getList_TMP_PKG_UNIT_QTY() { return l_TMP_PKG_UNIT_QTY; }
	public List getList_TMP_PLANT_CD() { return l_TMP_PLANT_CD; }
	public List getList_TMP_WS_CD() { return l_TMP_WS_CD; }
	public List getList_INS_PRINT_GRP_NO() { return l_INS_PRINT_GRP_NO; }
	public List getList_INS_PAGE_NO() { return l_INS_PAGE_NO; }
	public List getList_INS_PRINT_QTY() { return l_INS_PRINT_QTY; }
	public List getList_DM_STS_TYP() { return l_DM_STS_TYP; }
	public List getList_ISSUE_CMPLT_DATE() { return l_ISSUE_CMPLT_DATE; }
	public List getList_USER_CD() { return l_USER_CD; }
	public List getList_PRODUCT_TYP() { return l_PRODUCT_TYP; }
	public List getList_WH_TYP() { return l_WH_TYP; }
	public List getList_NEXT_WH_CD() { return l_NEXT_WH_CD; }
	public List getList_FIRST_OPR_INST_CD() { return l_FIRST_OPR_INST_CD; }
	public List getList_FIRST_PROC_NO() { return l_FIRST_PROC_NO; }
	public List getList_NEXT_WORK_ODR_CD() { return l_NEXT_WORK_ODR_CD; }
	public List getList_NEXT_OPR_INST_CD() { return l_NEXT_OPR_INST_CD; }
	public List getList_NEXT_PROC_NO() { return l_NEXT_PROC_NO; }
	public List getList_NEXT_WS_CD() { return l_NEXT_WS_CD; }
	public List getList_NEXT_WS_NAME() { return l_NEXT_WS_NAME; }
	public List getList_NEXT_WH_NAME() { return l_NEXT_WH_NAME; }
	public List getList_PREV_WORK_ODR_CD() { return l_PREV_WORK_ODR_CD; }
	public List getList_PREV_OPR_INST_CD() { return l_PREV_OPR_INST_CD; }
	public List getList_PREV_PARTIAL_PRD_NO() { return l_PREV_PARTIAL_PRD_NO; }
	public List getList_PREV_PROC_NO() { return l_PREV_PROC_NO; }
	public List getList_PREV_WH_CD() { return l_PREV_WH_CD; }
	public List getList_DATA_COUNT() { return l_DATA_COUNT; }
	public List getList_WH_CD_COUNT() { return l_WH_CD_COUNT; }
	public List getList_FROM_PUCH_ODR_CD() { return l_FROM_PUCH_ODR_CD; }
	public List getList_TO_PUCH_ODR_CD() { return l_TO_PUCH_ODR_CD; }
	public List getList_FROM_ITEM_CD() { return l_FROM_ITEM_CD; }
	public List getList_FROM_LOT_NO() { return l_FROM_LOT_NO; }
	public List getList_TO_ITEM_CD() { return l_TO_ITEM_CD; }
	public List getList_TO_LOT_NO() { return l_TO_LOT_NO; }

	public void setchk_COMPLETE(String val) { m_chk_COMPLETE = val; }
	public void setOPRATION_TIME(String val) { m_OPRATION_TIME = val; }
	public void setchk_OUTPUT(String val) { m_chk_OUTPUT = val; }
	public void setd1_STOCK_UNIT(String val) { m_d1_STOCK_UNIT = val; }
	public void setOPR_TIME_UNIT_TYP_name(String val) { m_OPR_TIME_UNIT_TYP_name = val; }
	public void setOPR_TIME_UNIT_TYP_val(String val) { m_OPR_TIME_UNIT_TYP_val = val; }
	public void setl_DEFECT_CAUSE_CD_name(String val) { m_l_DEFECT_CAUSE_CD_name = val; }
	public void setl_DEFECT_CAUSE_CD_val(String val) { m_l_DEFECT_CAUSE_CD_val = val; }
	public void setMRP_ODR_TYP_DN(String val) { m_MRP_ODR_TYP_DN = val; }
	public void setDOWNLOAD_FILE(String val) { m_DOWNLOAD_FILE = val; }
	public void seth_FINAL_PROC_FLG(String val) { m_h_FINAL_PROC_FLG = val; }
	public void seth_SYS_LOT_CTRL_FLG(String val) { m_h_SYS_LOT_CTRL_FLG = val; }
	public void setchk_CHILD_RSLTUPDATE(String val) { m_chk_CHILD_RSLTUPDATE = val; }
	public void setparam1(String val) { m_param1 = val; }
	public void setparam2(String val) { m_param2 = val; }
	public void setparam3(String val) { m_param3 = val; }
	public void seth_PROCESS_MANAGE_FLG(String val) { m_h_PROCESS_MANAGE_FLG = val; }
	public void setTEMP_PLAN_QTY(String val) { m_TEMP_PLAN_QTY = val; }
	public void setTEMP_USEOVER_QTY(String val) { m_TEMP_USEOVER_QTY = val; }
	public void setTEMP_PLANOUT_QTY(String val) { m_TEMP_PLANOUT_QTY = val; }
	public void setTEMP_USE_QTY(String val) { m_TEMP_USE_QTY = val; }
	public void setl_PARTIAL_PRD_NO(String val) { m_l_PARTIAL_PRD_NO = val; }
	public void setFIRST_WORK_FLG(String val) { m_FIRST_WORK_FLG = val; }
	public void setUSE_LOT_NO(String val) { m_USE_LOT_NO = val; }
	public void setUSE_ACPT_QTY(String val) { m_USE_ACPT_QTY = val; }
	public void setUSE_DEFECT_QTY(String val) { m_USE_DEFECT_QTY = val; }
	public void setIN_OPR_INST_CD(String val) { m_IN_OPR_INST_CD = val; }
	public void setPARTIAL_PRD_NO(String val) { m_PARTIAL_PRD_NO = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setWS_CD(String val) { m_WS_CD = val; }
	public void setWORK_IN_PROC_CD(String val) { m_WORK_IN_PROC_CD = val; }
	public void setPROC_NAME(String val) { m_PROC_NAME = val; }
	public void setPROC_NO(String val) { m_PROC_NO = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setWORK_STS_TYP(String val) { m_WORK_STS_TYP = val; }
	public void setWORK_ODR_CD(String val) { m_WORK_ODR_CD = val; }
	public void setOD_NO(String val) { m_OD_NO = val; }
	public void setOUTSIDE_TYP(String val) { m_OUTSIDE_TYP = val; }
	public void setPROC_MODIFY_COUNT(String val) { m_PROC_MODIFY_COUNT = val; }
	public void setFINAL_PROC_FLG(String val) { m_FINAL_PROC_FLG = val; }
	public void setWORK_ODR_DLV_DATE(String val) { m_WORK_ODR_DLV_DATE = val; }
	public void setOPR_INST_START_DATE(String val) { m_OPR_INST_START_DATE = val; }
	public void setOPR_INST_QTY(String val) { m_OPR_INST_QTY = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setUNIT_QTY_TYP(String val) { m_UNIT_QTY_TYP = val; }
	public void setDRAW_CD(String val) { m_DRAW_CD = val; }
	public void setSPEC(String val) { m_SPEC = val; }
	public void setMRP_ODR_TYP(String val) { m_MRP_ODR_TYP = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void setLOT_NUMBERING_TYP(String val) { m_LOT_NUMBERING_TYP = val; }
	public void setLOT_CTRL_FLG(String val) { m_LOT_CTRL_FLG = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setJOB_ODR_DETAIL_NO(String val) { m_JOB_ODR_DETAIL_NO = val; }
	public void setJOB_ODR_CANCEL_NO(String val) { m_JOB_ODR_CANCEL_NO = val; }
	public void setWS_NAME(String val) { m_WS_NAME = val; }
	public void setSUM_ACPT_QTY(String val) { m_SUM_ACPT_QTY = val; }
	public void setSUM_DEFECT_QTY(String val) { m_SUM_DEFECT_QTY = val; }
	public void setOPR_RSLT_TYP(String val) { m_OPR_RSLT_TYP = val; }
	public void setITEM_MODIFY_COUNT(String val) { m_ITEM_MODIFY_COUNT = val; }
	public void seth_OPR_DATE(String val) { m_h_OPR_DATE = val; }
	public void setTIME_CTRL(String val) { m_TIME_CTRL = val; }
	public void seth_BUSINESS_OPR_DATE(String val) { m_h_BUSINESS_OPR_DATE = val; }
	public void seth_BUSINESS_OPR_TIME(String val) { m_h_BUSINESS_OPR_TIME = val; }
	public void setFORM_SET_ITEM_CD(String val) { m_FORM_SET_ITEM_CD = val; }
	public void setWH_NAME(String val) { m_WH_NAME = val; }
	public void setWH_CD(String val) { m_WH_CD = val; }
	public void setPROC_EXEC_DATE(BigDecimal val) { m_PROC_EXEC_DATE = val; }
	public void setPAST_RESULT_ENTRY_TYP(String val) { m_PAST_RESULT_ENTRY_TYP = val; }
	public void setLOT_NO(String val) { m_LOT_NO = val; }
	public void setACPT_QTY(String val) { m_ACPT_QTY = val; }
	public void setDEFECT_QTY(String val) { m_DEFECT_QTY = val; }
	public void setOPR_DATE(String val) { m_OPR_DATE = val; }
	public void setOPR_RSLT_PERSON(String val) { m_OPR_RSLT_PERSON = val; }
	public void setOPR_RSLT_COMMENT(String val) { m_OPR_RSLT_COMMENT = val; }
	public void setOPR_TIME_UNIT_TYP(String val) { m_OPR_TIME_UNIT_TYP = val; }
	public void setPRE_ARRANGEMENT_TIME(String val) { m_PRE_ARRANGEMENT_TIME = val; }
	public void setPOST_ARRANGEMENT_TIME(String val) { m_POST_ARRANGEMENT_TIME = val; }
	public void setOPR_TIME(String val) { m_OPR_TIME = val; }
	public void setCESSATION_TIME(String val) { m_CESSATION_TIME = val; }
	public void setCESSATION_CAUSE(String val) { m_CESSATION_CAUSE = val; }
	public void setOUTPUT_RSLT_CD(String val) { m_OUTPUT_RSLT_CD = val; }
	public void setVEND_LOT_NO(String val) { m_VEND_LOT_NO = val; }
	public void setOPR_CRCT_NO(String val) { m_OPR_CRCT_NO = val; }
	public void setUPDATE_WORK_STS_TYP(String val) { m_UPDATE_WORK_STS_TYP = val; }
	public void setJOB_ODR_TYP(String val) { m_JOB_ODR_TYP = val; }
	public void setRCV_ISSUE_CTRL_CD(String val) { m_RCV_ISSUE_CTRL_CD = val; }
	public void setRCV_ISSUE_TYP(String val) { m_RCV_ISSUE_TYP = val; }
	public void setOPR_RSLT_CRCT_NO(String val) { m_OPR_RSLT_CRCT_NO = val; }
	public void seth_ISSUE_INST_CD(String val) { m_h_ISSUE_INST_CD = val; }
	public void setSAVE_STOCK_ON_HAND_QTY(String val) { m_SAVE_STOCK_ON_HAND_QTY = val; }
	public void setRCV_ISSUE_QTY(String val) { m_RCV_ISSUE_QTY = val; }
	public void setRCV_ISSUE_DATE(String val) { m_RCV_ISSUE_DATE = val; }
	public void setRCV_ISSUE_GNR_TYP(String val) { m_RCV_ISSUE_GNR_TYP = val; }
	public void setRCV_ISSUE_ODD_QTY(String val) { m_RCV_ISSUE_ODD_QTY = val; }
	public void setSTOCK_UPD_TYP(String val) { m_STOCK_UPD_TYP = val; }
	public void setRCV_ISSUE_COMMENT(String val) { m_RCV_ISSUE_COMMENT = val; }
	public void setRCV_ISSUE_CMPLT_FLG(String val) { m_RCV_ISSUE_CMPLT_FLG = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setMANHOUR_TYP(String val) { m_MANHOUR_TYP = val; }
	public void setPARENT_OD_NO(String val) { m_PARENT_OD_NO = val; }
	public void setPARENT_OUTSIDE_TYP(String val) { m_PARENT_OUTSIDE_TYP = val; }
	public void setPARENT_MRP_ODR_TYP(String val) { m_PARENT_MRP_ODR_TYP = val; }
	public void setPARENT_WORK_ODR_CD(String val) { m_PARENT_WORK_ODR_CD = val; }
	public void setPARENT_WORK_IN_PROC_CD(String val) { m_PARENT_WORK_IN_PROC_CD = val; }
	public void setPARENT_PUCH_ODR_CD(String val) { m_PARENT_PUCH_ODR_CD = val; }
	public void setPUCH_ODR_CD(String val) { m_PUCH_ODR_CD = val; }
	public void setUPDATED_PRG_NM(String val) { m_UPDATED_PRG_NM = val; }
	public void setACPT_NO(String val) { m_ACPT_NO = val; }
	public void setISSUE_INST_CD(String val) { m_ISSUE_INST_CD = val; }
	public void setGET_IDENT_CARD_CTL_NO(String val) { m_GET_IDENT_CARD_CTL_NO = val; }
	public void setSEL_OPR_INST_CD(String val) { m_SEL_OPR_INST_CD = val; }
	public void setSEL_PARTIAL_PRD_NO(String val) { m_SEL_PARTIAL_PRD_NO = val; }
	public void setSEL_ITEM_CD(String val) { m_SEL_ITEM_CD = val; }
	public void setSEL_ACPT_QTY(String val) { m_SEL_ACPT_QTY = val; }
	public void setSEL_OPR_DATE(String val) { m_SEL_OPR_DATE = val; }
	public void setSEL_PKG_UNIT_QTY(String val) { m_SEL_PKG_UNIT_QTY = val; }
	public void setSEL_PLANT_CD(String val) { m_SEL_PLANT_CD = val; }
	public void setSEL_WS_CD(String val) { m_SEL_WS_CD = val; }
	public void setINS_IDENT_CARD_CTL_NO(String val) { m_INS_IDENT_CARD_CTL_NO = val; }
	public void setINS_OPR_INST_CD(String val) { m_INS_OPR_INST_CD = val; }
	public void setINS_PARTIAL_PRD_NO(String val) { m_INS_PARTIAL_PRD_NO = val; }
	public void setINS_RCV_ISSUE_CTRL_CD(String val) { m_INS_RCV_ISSUE_CTRL_CD = val; }
	public void setINS_ITEM_CD(String val) { m_INS_ITEM_CD = val; }
	public void setINS_JOB_ODR_CD(String val) { m_INS_JOB_ODR_CD = val; }
	public void setINS_FIRST_IDENT_CARD_QTY(String val) { m_INS_FIRST_IDENT_CARD_QTY = val; }
	public void setINS_IDENT_CARD_QTY(String val) { m_INS_IDENT_CARD_QTY = val; }
	public void setINS_OPR_DATE(String val) { m_INS_OPR_DATE = val; }
	public void setINS_PKG_UNIT_QTY(String val) { m_INS_PKG_UNIT_QTY = val; }
	public void setINS_PLANT_CD(String val) { m_INS_PLANT_CD = val; }
	public void setINS_WS_CD(String val) { m_INS_WS_CD = val; }
	public void setOPR_INST_CD(String val) { m_OPR_INST_CD = val; }
	public void setl_DEFECT_CAUSE_CD(String val) { m_l_DEFECT_CAUSE_CD = val; }
	public void setl_DEFECT_QTY(String val) { m_l_DEFECT_QTY = val; }
	public void setl_DEFECT_COMMENT(String val) { m_l_DEFECT_COMMENT = val; }
	public void setRSLT_CTRL_SEQ_NO(String val) { m_RSLT_CTRL_SEQ_NO = val; }
	public void setSUPPLIED_ISSUE_QTY(String val) { m_SUPPLIED_ISSUE_QTY = val; }
	public void setSUPPLIED_ISSUE_QTY_sum(String val) { m_SUPPLIED_ISSUE_QTY_sum = val; }
	public void seth_ISSUE_INST_UNIT_DENOMINATOR(String val) { m_h_ISSUE_INST_UNIT_DENOMINATOR = val; }
	public void seth_ISSUE_INST_UNIT_NUMERATOR(String val) { m_h_ISSUE_INST_UNIT_NUMERATOR = val; }
	public void setcount_RCV_ISSUE(String val) { m_count_RCV_ISSUE = val; }
	public void setSTOCK_ON_HAND_QTY(String val) { m_STOCK_ON_HAND_QTY = val; }
	public void setISSUE_QTY(String val) { m_ISSUE_QTY = val; }
	public void setISSUE_DATE(String val) { m_ISSUE_DATE = val; }
	public void setSPENT_QTY(String val) { m_SPENT_QTY = val; }
	public void setNEXTVAL(String val) { m_NEXTVAL = val; }
	public void setRSLT_CTL_SEQ_NO(String val) { m_RSLT_CTL_SEQ_NO = val; }
	public void setTOTAL_ISSUE_QTY(String val) { m_TOTAL_ISSUE_QTY = val; }
	public void setPART_SUPPLIED_COMMENT(String val) { m_PART_SUPPLIED_COMMENT = val; }
	public void setSUPPLIED_DATE(String val) { m_SUPPLIED_DATE = val; }
	public void setALCD_QTY(String val) { m_ALCD_QTY = val; }
	public void setTMP_IDENT_CARD_CTL_NO(String val) { m_TMP_IDENT_CARD_CTL_NO = val; }
	public void setTMP_OPR_INST_CD(String val) { m_TMP_OPR_INST_CD = val; }
	public void setTMP_PARTIAL_PRD_NO(String val) { m_TMP_PARTIAL_PRD_NO = val; }
	public void setTMP_RCV_ISSUE_CTRL_CD(String val) { m_TMP_RCV_ISSUE_CTRL_CD = val; }
	public void setTMP_ITEM_CD(String val) { m_TMP_ITEM_CD = val; }
	public void setTMP_JOB_ODR_CD(String val) { m_TMP_JOB_ODR_CD = val; }
	public void setTMP_FIRST_IDENT_CARD_QTY(String val) { m_TMP_FIRST_IDENT_CARD_QTY = val; }
	public void setTMP_IDENT_CARD_QTY(String val) { m_TMP_IDENT_CARD_QTY = val; }
	public void setTMP_OPR_DATE(String val) { m_TMP_OPR_DATE = val; }
	public void setTMP_PKG_UNIT_QTY(String val) { m_TMP_PKG_UNIT_QTY = val; }
	public void setTMP_PLANT_CD(String val) { m_TMP_PLANT_CD = val; }
	public void setTMP_WS_CD(String val) { m_TMP_WS_CD = val; }
	public void setINS_PRINT_GRP_NO(String val) { m_INS_PRINT_GRP_NO = val; }
	public void setINS_PAGE_NO(String val) { m_INS_PAGE_NO = val; }
	public void setINS_PRINT_QTY(String val) { m_INS_PRINT_QTY = val; }
	public void setDM_STS_TYP(String val) { m_DM_STS_TYP = val; }
	public void setISSUE_CMPLT_DATE(String val) { m_ISSUE_CMPLT_DATE = val; }
	public void setUSER_CD(String val) { m_USER_CD = val; }
	public void setPRODUCT_TYP(String val) { m_PRODUCT_TYP = val; }
	public void setWH_TYP(String val) { m_WH_TYP = val; }
	public void setNEXT_WH_CD(String val) { m_NEXT_WH_CD = val; }
	public void setFIRST_OPR_INST_CD(String val) { m_FIRST_OPR_INST_CD = val; }
	public void setFIRST_PROC_NO(String val) { m_FIRST_PROC_NO = val; }
	public void setNEXT_WORK_ODR_CD(String val) { m_NEXT_WORK_ODR_CD = val; }
	public void setNEXT_OPR_INST_CD(String val) { m_NEXT_OPR_INST_CD = val; }
	public void setNEXT_PROC_NO(String val) { m_NEXT_PROC_NO = val; }
	public void setNEXT_WS_CD(String val) { m_NEXT_WS_CD = val; }
	public void setNEXT_WS_NAME(String val) { m_NEXT_WS_NAME = val; }
	public void setNEXT_WH_NAME(String val) { m_NEXT_WH_NAME = val; }
	public void setPREV_WORK_ODR_CD(String val) { m_PREV_WORK_ODR_CD = val; }
	public void setPREV_OPR_INST_CD(String val) { m_PREV_OPR_INST_CD = val; }
	public void setPREV_PARTIAL_PRD_NO(String val) { m_PREV_PARTIAL_PRD_NO = val; }
	public void setPREV_PROC_NO(String val) { m_PREV_PROC_NO = val; }
	public void setPREV_WH_CD(String val) { m_PREV_WH_CD = val; }
	public void setDATA_COUNT(String val) { m_DATA_COUNT = val; }
	public void setWH_CD_COUNT(String val) { m_WH_CD_COUNT = val; }
	public void setFROM_PUCH_ODR_CD(String val) { m_FROM_PUCH_ODR_CD = val; }
	public void setTO_PUCH_ODR_CD(String val) { m_TO_PUCH_ODR_CD = val; }
	public void setFROM_ITEM_CD(String val) { m_FROM_ITEM_CD = val; }
	public void setFROM_LOT_NO(String val) { m_FROM_LOT_NO = val; }
	public void setTO_ITEM_CD(String val) { m_TO_ITEM_CD = val; }
	public void setTO_LOT_NO(String val) { m_TO_LOT_NO = val; }


	public void setList_chk_COMPLETE(List list) { l_chk_COMPLETE = list; }
	public void setList_OPRATION_TIME(List list) { l_OPRATION_TIME = list; }
	public void setList_chk_OUTPUT(List list) { l_chk_OUTPUT = list; }
	public void setList_d1_STOCK_UNIT(List list) { l_d1_STOCK_UNIT = list; }
	public void setList_OPR_TIME_UNIT_TYP_name(List list) { l_OPR_TIME_UNIT_TYP_name = list; }
	public void setList_OPR_TIME_UNIT_TYP_val(List list) { l_OPR_TIME_UNIT_TYP_val = list; }
	public void setList_l_DEFECT_CAUSE_CD_name(List list) { l_l_DEFECT_CAUSE_CD_name = list; }
	public void setList_l_DEFECT_CAUSE_CD_val(List list) { l_l_DEFECT_CAUSE_CD_val = list; }
	public void setList_MRP_ODR_TYP_DN(List list) { l_MRP_ODR_TYP_DN = list; }
	public void setList_DOWNLOAD_FILE(List list) { l_DOWNLOAD_FILE = list; }
	public void setList_h_FINAL_PROC_FLG(List list) { l_h_FINAL_PROC_FLG = list; }
	public void setList_h_SYS_LOT_CTRL_FLG(List list) { l_h_SYS_LOT_CTRL_FLG = list; }
	public void setList_chk_CHILD_RSLTUPDATE(List list) { l_chk_CHILD_RSLTUPDATE = list; }
	public void setList_param1(List list) { l_param1 = list; }
	public void setList_param2(List list) { l_param2 = list; }
	public void setList_param3(List list) { l_param3 = list; }
	public void setList_h_PROCESS_MANAGE_FLG(List list) { l_h_PROCESS_MANAGE_FLG = list; }
	public void setList_TEMP_PLAN_QTY(List list) { l_TEMP_PLAN_QTY = list; }
	public void setList_TEMP_USEOVER_QTY(List list) { l_TEMP_USEOVER_QTY = list; }
	public void setList_TEMP_PLANOUT_QTY(List list) { l_TEMP_PLANOUT_QTY = list; }
	public void setList_TEMP_USE_QTY(List list) { l_TEMP_USE_QTY = list; }
	public void setList_l_PARTIAL_PRD_NO(List list) { l_l_PARTIAL_PRD_NO = list; }
	public void setList_FIRST_WORK_FLG(List list) { l_FIRST_WORK_FLG = list; }
	public void setList_USE_LOT_NO(List list) { l_USE_LOT_NO = list; }
	public void setList_USE_ACPT_QTY(List list) { l_USE_ACPT_QTY = list; }
	public void setList_USE_DEFECT_QTY(List list) { l_USE_DEFECT_QTY = list; }
	public void setList_IN_OPR_INST_CD(List list) { l_IN_OPR_INST_CD = list; }
	public void setList_PARTIAL_PRD_NO(List list) { l_PARTIAL_PRD_NO = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_WS_CD(List list) { l_WS_CD = list; }
	public void setList_WORK_IN_PROC_CD(List list) { l_WORK_IN_PROC_CD = list; }
	public void setList_PROC_NAME(List list) { l_PROC_NAME = list; }
	public void setList_PROC_NO(List list) { l_PROC_NO = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_WORK_STS_TYP(List list) { l_WORK_STS_TYP = list; }
	public void setList_WORK_ODR_CD(List list) { l_WORK_ODR_CD = list; }
	public void setList_OD_NO(List list) { l_OD_NO = list; }
	public void setList_OUTSIDE_TYP(List list) { l_OUTSIDE_TYP = list; }
	public void setList_PROC_MODIFY_COUNT(List list) { l_PROC_MODIFY_COUNT = list; }
	public void setList_FINAL_PROC_FLG(List list) { l_FINAL_PROC_FLG = list; }
	public void setList_WORK_ODR_DLV_DATE(List list) { l_WORK_ODR_DLV_DATE = list; }
	public void setList_OPR_INST_START_DATE(List list) { l_OPR_INST_START_DATE = list; }
	public void setList_OPR_INST_QTY(List list) { l_OPR_INST_QTY = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_UNIT_QTY_TYP(List list) { l_UNIT_QTY_TYP = list; }
	public void setList_DRAW_CD(List list) { l_DRAW_CD = list; }
	public void setList_SPEC(List list) { l_SPEC = list; }
	public void setList_MRP_ODR_TYP(List list) { l_MRP_ODR_TYP = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_LOT_NUMBERING_TYP(List list) { l_LOT_NUMBERING_TYP = list; }
	public void setList_LOT_CTRL_FLG(List list) { l_LOT_CTRL_FLG = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_JOB_ODR_DETAIL_NO(List list) { l_JOB_ODR_DETAIL_NO = list; }
	public void setList_JOB_ODR_CANCEL_NO(List list) { l_JOB_ODR_CANCEL_NO = list; }
	public void setList_WS_NAME(List list) { l_WS_NAME = list; }
	public void setList_SUM_ACPT_QTY(List list) { l_SUM_ACPT_QTY = list; }
	public void setList_SUM_DEFECT_QTY(List list) { l_SUM_DEFECT_QTY = list; }
	public void setList_OPR_RSLT_TYP(List list) { l_OPR_RSLT_TYP = list; }
	public void setList_ITEM_MODIFY_COUNT(List list) { l_ITEM_MODIFY_COUNT = list; }
	public void setList_h_OPR_DATE(List list) { l_h_OPR_DATE = list; }
	public void setList_TIME_CTRL(List list) { l_TIME_CTRL = list; }
	public void setList_h_BUSINESS_OPR_DATE(List list) { l_h_BUSINESS_OPR_DATE = list; }
	public void setList_h_BUSINESS_OPR_TIME(List list) { l_h_BUSINESS_OPR_TIME = list; }
	public void setList_FORM_SET_ITEM_CD(List list) { l_FORM_SET_ITEM_CD = list; }
	public void setList_WH_NAME(List list) { l_WH_NAME = list; }
	public void setList_WH_CD(List list) { l_WH_CD = list; }
	public void setList_PROC_EXEC_DATE(List list) { l_PROC_EXEC_DATE = list; }
	public void setList_PAST_RESULT_ENTRY_TYP(List list) { l_PAST_RESULT_ENTRY_TYP = list; }
	public void setList_LOT_NO(List list) { l_LOT_NO = list; }
	public void setList_ACPT_QTY(List list) { l_ACPT_QTY = list; }
	public void setList_DEFECT_QTY(List list) { l_DEFECT_QTY = list; }
	public void setList_OPR_DATE(List list) { l_OPR_DATE = list; }
	public void setList_OPR_RSLT_PERSON(List list) { l_OPR_RSLT_PERSON = list; }
	public void setList_OPR_RSLT_COMMENT(List list) { l_OPR_RSLT_COMMENT = list; }
	public void setList_OPR_TIME_UNIT_TYP(List list) { l_OPR_TIME_UNIT_TYP = list; }
	public void setList_PRE_ARRANGEMENT_TIME(List list) { l_PRE_ARRANGEMENT_TIME = list; }
	public void setList_POST_ARRANGEMENT_TIME(List list) { l_POST_ARRANGEMENT_TIME = list; }
	public void setList_OPR_TIME(List list) { l_OPR_TIME = list; }
	public void setList_CESSATION_TIME(List list) { l_CESSATION_TIME = list; }
	public void setList_CESSATION_CAUSE(List list) { l_CESSATION_CAUSE = list; }
	public void setList_OUTPUT_RSLT_CD(List list) { l_OUTPUT_RSLT_CD = list; }
	public void setList_VEND_LOT_NO(List list) { l_VEND_LOT_NO = list; }
	public void setList_OPR_CRCT_NO(List list) { l_OPR_CRCT_NO = list; }
	public void setList_UPDATE_WORK_STS_TYP(List list) { l_UPDATE_WORK_STS_TYP = list; }
	public void setList_JOB_ODR_TYP(List list) { l_JOB_ODR_TYP = list; }
	public void setList_RCV_ISSUE_CTRL_CD(List list) { l_RCV_ISSUE_CTRL_CD = list; }
	public void setList_RCV_ISSUE_TYP(List list) { l_RCV_ISSUE_TYP = list; }
	public void setList_OPR_RSLT_CRCT_NO(List list) { l_OPR_RSLT_CRCT_NO = list; }
	public void setList_h_ISSUE_INST_CD(List list) { l_h_ISSUE_INST_CD = list; }
	public void setList_SAVE_STOCK_ON_HAND_QTY(List list) { l_SAVE_STOCK_ON_HAND_QTY = list; }
	public void setList_RCV_ISSUE_QTY(List list) { l_RCV_ISSUE_QTY = list; }
	public void setList_RCV_ISSUE_DATE(List list) { l_RCV_ISSUE_DATE = list; }
	public void setList_RCV_ISSUE_GNR_TYP(List list) { l_RCV_ISSUE_GNR_TYP = list; }
	public void setList_RCV_ISSUE_ODD_QTY(List list) { l_RCV_ISSUE_ODD_QTY = list; }
	public void setList_STOCK_UPD_TYP(List list) { l_STOCK_UPD_TYP = list; }
	public void setList_RCV_ISSUE_COMMENT(List list) { l_RCV_ISSUE_COMMENT = list; }
	public void setList_RCV_ISSUE_CMPLT_FLG(List list) { l_RCV_ISSUE_CMPLT_FLG = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_MANHOUR_TYP(List list) { l_MANHOUR_TYP = list; }
	public void setList_PARENT_OD_NO(List list) { l_PARENT_OD_NO = list; }
	public void setList_PARENT_OUTSIDE_TYP(List list) { l_PARENT_OUTSIDE_TYP = list; }
	public void setList_PARENT_MRP_ODR_TYP(List list) { l_PARENT_MRP_ODR_TYP = list; }
	public void setList_PARENT_WORK_ODR_CD(List list) { l_PARENT_WORK_ODR_CD = list; }
	public void setList_PARENT_WORK_IN_PROC_CD(List list) { l_PARENT_WORK_IN_PROC_CD = list; }
	public void setList_PARENT_PUCH_ODR_CD(List list) { l_PARENT_PUCH_ODR_CD = list; }
	public void setList_PUCH_ODR_CD(List list) { l_PUCH_ODR_CD = list; }
	public void setList_UPDATED_PRG_NM(List list) { l_UPDATED_PRG_NM = list; }
	public void setList_ACPT_NO(List list) { l_ACPT_NO = list; }
	public void setList_ISSUE_INST_CD(List list) { l_ISSUE_INST_CD = list; }
	public void setList_GET_IDENT_CARD_CTL_NO(List list) { l_GET_IDENT_CARD_CTL_NO = list; }
	public void setList_SEL_OPR_INST_CD(List list) { l_SEL_OPR_INST_CD = list; }
	public void setList_SEL_PARTIAL_PRD_NO(List list) { l_SEL_PARTIAL_PRD_NO = list; }
	public void setList_SEL_ITEM_CD(List list) { l_SEL_ITEM_CD = list; }
	public void setList_SEL_ACPT_QTY(List list) { l_SEL_ACPT_QTY = list; }
	public void setList_SEL_OPR_DATE(List list) { l_SEL_OPR_DATE = list; }
	public void setList_SEL_PKG_UNIT_QTY(List list) { l_SEL_PKG_UNIT_QTY = list; }
	public void setList_SEL_PLANT_CD(List list) { l_SEL_PLANT_CD = list; }
	public void setList_SEL_WS_CD(List list) { l_SEL_WS_CD = list; }
	public void setList_INS_IDENT_CARD_CTL_NO(List list) { l_INS_IDENT_CARD_CTL_NO = list; }
	public void setList_INS_OPR_INST_CD(List list) { l_INS_OPR_INST_CD = list; }
	public void setList_INS_PARTIAL_PRD_NO(List list) { l_INS_PARTIAL_PRD_NO = list; }
	public void setList_INS_RCV_ISSUE_CTRL_CD(List list) { l_INS_RCV_ISSUE_CTRL_CD = list; }
	public void setList_INS_ITEM_CD(List list) { l_INS_ITEM_CD = list; }
	public void setList_INS_JOB_ODR_CD(List list) { l_INS_JOB_ODR_CD = list; }
	public void setList_INS_FIRST_IDENT_CARD_QTY(List list) { l_INS_FIRST_IDENT_CARD_QTY = list; }
	public void setList_INS_IDENT_CARD_QTY(List list) { l_INS_IDENT_CARD_QTY = list; }
	public void setList_INS_OPR_DATE(List list) { l_INS_OPR_DATE = list; }
	public void setList_INS_PKG_UNIT_QTY(List list) { l_INS_PKG_UNIT_QTY = list; }
	public void setList_INS_PLANT_CD(List list) { l_INS_PLANT_CD = list; }
	public void setList_INS_WS_CD(List list) { l_INS_WS_CD = list; }
	public void setList_OPR_INST_CD(List list) { l_OPR_INST_CD = list; }
	public void setList_l_DEFECT_CAUSE_CD(List list) { l_l_DEFECT_CAUSE_CD = list; }
	public void setList_l_DEFECT_QTY(List list) { l_l_DEFECT_QTY = list; }
	public void setList_l_DEFECT_COMMENT(List list) { l_l_DEFECT_COMMENT = list; }
	public void setList_RSLT_CTRL_SEQ_NO(List list) { l_RSLT_CTRL_SEQ_NO = list; }
	public void setList_SUPPLIED_ISSUE_QTY(List list) { l_SUPPLIED_ISSUE_QTY = list; }
	public void setList_SUPPLIED_ISSUE_QTY_sum(List list) { l_SUPPLIED_ISSUE_QTY_sum = list; }
	public void setList_h_ISSUE_INST_UNIT_DENOMINATOR(List list) { l_h_ISSUE_INST_UNIT_DENOMINATOR = list; }
	public void setList_h_ISSUE_INST_UNIT_NUMERATOR(List list) { l_h_ISSUE_INST_UNIT_NUMERATOR = list; }
	public void setList_count_RCV_ISSUE(List list) { l_count_RCV_ISSUE = list; }
	public void setList_STOCK_ON_HAND_QTY(List list) { l_STOCK_ON_HAND_QTY = list; }
	public void setList_ISSUE_QTY(List list) { l_ISSUE_QTY = list; }
	public void setList_ISSUE_DATE(List list) { l_ISSUE_DATE = list; }
	public void setList_SPENT_QTY(List list) { l_SPENT_QTY = list; }
	public void setList_NEXTVAL(List list) { l_NEXTVAL = list; }
	public void setList_RSLT_CTL_SEQ_NO(List list) { l_RSLT_CTL_SEQ_NO = list; }
	public void setList_TOTAL_ISSUE_QTY(List list) { l_TOTAL_ISSUE_QTY = list; }
	public void setList_PART_SUPPLIED_COMMENT(List list) { l_PART_SUPPLIED_COMMENT = list; }
	public void setList_SUPPLIED_DATE(List list) { l_SUPPLIED_DATE = list; }
	public void setList_ALCD_QTY(List list) { l_ALCD_QTY = list; }
	public void setList_TMP_IDENT_CARD_CTL_NO(List list) { l_TMP_IDENT_CARD_CTL_NO = list; }
	public void setList_TMP_OPR_INST_CD(List list) { l_TMP_OPR_INST_CD = list; }
	public void setList_TMP_PARTIAL_PRD_NO(List list) { l_TMP_PARTIAL_PRD_NO = list; }
	public void setList_TMP_RCV_ISSUE_CTRL_CD(List list) { l_TMP_RCV_ISSUE_CTRL_CD = list; }
	public void setList_TMP_ITEM_CD(List list) { l_TMP_ITEM_CD = list; }
	public void setList_TMP_JOB_ODR_CD(List list) { l_TMP_JOB_ODR_CD = list; }
	public void setList_TMP_FIRST_IDENT_CARD_QTY(List list) { l_TMP_FIRST_IDENT_CARD_QTY = list; }
	public void setList_TMP_IDENT_CARD_QTY(List list) { l_TMP_IDENT_CARD_QTY = list; }
	public void setList_TMP_OPR_DATE(List list) { l_TMP_OPR_DATE = list; }
	public void setList_TMP_PKG_UNIT_QTY(List list) { l_TMP_PKG_UNIT_QTY = list; }
	public void setList_TMP_PLANT_CD(List list) { l_TMP_PLANT_CD = list; }
	public void setList_TMP_WS_CD(List list) { l_TMP_WS_CD = list; }
	public void setList_INS_PRINT_GRP_NO(List list) { l_INS_PRINT_GRP_NO = list; }
	public void setList_INS_PAGE_NO(List list) { l_INS_PAGE_NO = list; }
	public void setList_INS_PRINT_QTY(List list) { l_INS_PRINT_QTY = list; }
	public void setList_DM_STS_TYP(List list) { l_DM_STS_TYP = list; }
	public void setList_ISSUE_CMPLT_DATE(List list) { l_ISSUE_CMPLT_DATE = list; }
	public void setList_USER_CD(List list) { l_USER_CD = list; }
	public void setList_PRODUCT_TYP(List list) { l_PRODUCT_TYP = list; }
	public void setList_WH_TYP(List list) { l_WH_TYP = list; }
	public void setList_NEXT_WH_CD(List list) { l_NEXT_WH_CD = list; }
	public void setList_FIRST_OPR_INST_CD(List list) { l_FIRST_OPR_INST_CD = list; }
	public void setList_FIRST_PROC_NO(List list) { l_FIRST_PROC_NO = list; }
	public void setList_NEXT_WORK_ODR_CD(List list) { l_NEXT_WORK_ODR_CD = list; }
	public void setList_NEXT_OPR_INST_CD(List list) { l_NEXT_OPR_INST_CD = list; }
	public void setList_NEXT_PROC_NO(List list) { l_NEXT_PROC_NO = list; }
	public void setList_NEXT_WS_CD(List list) { l_NEXT_WS_CD = list; }
	public void setList_NEXT_WS_NAME(List list) { l_NEXT_WS_NAME = list; }
	public void setList_NEXT_WH_NAME(List list) { l_NEXT_WH_NAME = list; }
	public void setList_PREV_WORK_ODR_CD(List list) { l_PREV_WORK_ODR_CD = list; }
	public void setList_PREV_OPR_INST_CD(List list) { l_PREV_OPR_INST_CD = list; }
	public void setList_PREV_PARTIAL_PRD_NO(List list) { l_PREV_PARTIAL_PRD_NO = list; }
	public void setList_PREV_PROC_NO(List list) { l_PREV_PROC_NO = list; }
	public void setList_PREV_WH_CD(List list) { l_PREV_WH_CD = list; }
	public void setList_DATA_COUNT(List list) { l_DATA_COUNT = list; }
	public void setList_WH_CD_COUNT(List list) { l_WH_CD_COUNT = list; }
	public void setList_FROM_PUCH_ODR_CD(List list) { l_FROM_PUCH_ODR_CD = list; }
	public void setList_TO_PUCH_ODR_CD(List list) { l_TO_PUCH_ODR_CD = list; }
	public void setList_FROM_ITEM_CD(List list) { l_FROM_ITEM_CD = list; }
	public void setList_FROM_LOT_NO(List list) { l_FROM_LOT_NO = list; }
	public void setList_TO_ITEM_CD(List list) { l_TO_ITEM_CD = list; }
	public void setList_TO_LOT_NO(List list) { l_TO_LOT_NO = list; }

	public int setL2L_chk_COMPLETE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_chk_COMPLETE == null) {
			l_chk_COMPLETE = new ArrayList();
		} else {
			l_chk_COMPLETE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_chk_COMPLETE.add(((AD0090010Struct) list.get(i)).getchk_COMPLETE());
		}
		return size;
	}
	public int setL2L_OPRATION_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPRATION_TIME == null) {
			l_OPRATION_TIME = new ArrayList();
		} else {
			l_OPRATION_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPRATION_TIME.add(((AD0090010Struct) list.get(i)).getOPRATION_TIME());
		}
		return size;
	}
	public int setL2L_chk_OUTPUT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_chk_OUTPUT == null) {
			l_chk_OUTPUT = new ArrayList();
		} else {
			l_chk_OUTPUT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_chk_OUTPUT.add(((AD0090010Struct) list.get(i)).getchk_OUTPUT());
		}
		return size;
	}
	public int setL2L_d1_STOCK_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_d1_STOCK_UNIT == null) {
			l_d1_STOCK_UNIT = new ArrayList();
		} else {
			l_d1_STOCK_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_d1_STOCK_UNIT.add(((AD0090010Struct) list.get(i)).getd1_STOCK_UNIT());
		}
		return size;
	}
	public int setL2L_OPR_TIME_UNIT_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_TIME_UNIT_TYP_name == null) {
			l_OPR_TIME_UNIT_TYP_name = new ArrayList();
		} else {
			l_OPR_TIME_UNIT_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_TIME_UNIT_TYP_name.add(((AD0090010Struct) list.get(i)).getOPR_TIME_UNIT_TYP_name());
		}
		return size;
	}
	public int setL2L_OPR_TIME_UNIT_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_TIME_UNIT_TYP_val == null) {
			l_OPR_TIME_UNIT_TYP_val = new ArrayList();
		} else {
			l_OPR_TIME_UNIT_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_TIME_UNIT_TYP_val.add(((AD0090010Struct) list.get(i)).getOPR_TIME_UNIT_TYP_val());
		}
		return size;
	}
	public int setL2L_l_DEFECT_CAUSE_CD_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DEFECT_CAUSE_CD_name == null) {
			l_l_DEFECT_CAUSE_CD_name = new ArrayList();
		} else {
			l_l_DEFECT_CAUSE_CD_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DEFECT_CAUSE_CD_name.add(((AD0090010Struct) list.get(i)).getl_DEFECT_CAUSE_CD_name());
		}
		return size;
	}
	public int setL2L_l_DEFECT_CAUSE_CD_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DEFECT_CAUSE_CD_val == null) {
			l_l_DEFECT_CAUSE_CD_val = new ArrayList();
		} else {
			l_l_DEFECT_CAUSE_CD_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DEFECT_CAUSE_CD_val.add(((AD0090010Struct) list.get(i)).getl_DEFECT_CAUSE_CD_val());
		}
		return size;
	}
	public int setL2L_MRP_ODR_TYP_DN(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_ODR_TYP_DN == null) {
			l_MRP_ODR_TYP_DN = new ArrayList();
		} else {
			l_MRP_ODR_TYP_DN.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_ODR_TYP_DN.add(((AD0090010Struct) list.get(i)).getMRP_ODR_TYP_DN());
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
			l_DOWNLOAD_FILE.add(((AD0090010Struct) list.get(i)).getDOWNLOAD_FILE());
		}
		return size;
	}
	public int setL2L_h_FINAL_PROC_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_FINAL_PROC_FLG == null) {
			l_h_FINAL_PROC_FLG = new ArrayList();
		} else {
			l_h_FINAL_PROC_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_FINAL_PROC_FLG.add(((AD0090010Struct) list.get(i)).geth_FINAL_PROC_FLG());
		}
		return size;
	}
	public int setL2L_h_SYS_LOT_CTRL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_SYS_LOT_CTRL_FLG == null) {
			l_h_SYS_LOT_CTRL_FLG = new ArrayList();
		} else {
			l_h_SYS_LOT_CTRL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_SYS_LOT_CTRL_FLG.add(((AD0090010Struct) list.get(i)).geth_SYS_LOT_CTRL_FLG());
		}
		return size;
	}
	public int setL2L_chk_CHILD_RSLTUPDATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_chk_CHILD_RSLTUPDATE == null) {
			l_chk_CHILD_RSLTUPDATE = new ArrayList();
		} else {
			l_chk_CHILD_RSLTUPDATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_chk_CHILD_RSLTUPDATE.add(((AD0090010Struct) list.get(i)).getchk_CHILD_RSLTUPDATE());
		}
		return size;
	}
	public int setL2L_param1(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_param1 == null) {
			l_param1 = new ArrayList();
		} else {
			l_param1.clear();
		}
		for (int i = 0; i < size; i++) {
			l_param1.add(((AD0090010Struct) list.get(i)).getparam1());
		}
		return size;
	}
	public int setL2L_param2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_param2 == null) {
			l_param2 = new ArrayList();
		} else {
			l_param2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_param2.add(((AD0090010Struct) list.get(i)).getparam2());
		}
		return size;
	}
	public int setL2L_param3(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_param3 == null) {
			l_param3 = new ArrayList();
		} else {
			l_param3.clear();
		}
		for (int i = 0; i < size; i++) {
			l_param3.add(((AD0090010Struct) list.get(i)).getparam3());
		}
		return size;
	}
	public int setL2L_h_PROCESS_MANAGE_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_PROCESS_MANAGE_FLG == null) {
			l_h_PROCESS_MANAGE_FLG = new ArrayList();
		} else {
			l_h_PROCESS_MANAGE_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_PROCESS_MANAGE_FLG.add(((AD0090010Struct) list.get(i)).geth_PROCESS_MANAGE_FLG());
		}
		return size;
	}
	public int setL2L_TEMP_PLAN_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TEMP_PLAN_QTY == null) {
			l_TEMP_PLAN_QTY = new ArrayList();
		} else {
			l_TEMP_PLAN_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TEMP_PLAN_QTY.add(((AD0090010Struct) list.get(i)).getTEMP_PLAN_QTY());
		}
		return size;
	}
	public int setL2L_TEMP_USEOVER_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TEMP_USEOVER_QTY == null) {
			l_TEMP_USEOVER_QTY = new ArrayList();
		} else {
			l_TEMP_USEOVER_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TEMP_USEOVER_QTY.add(((AD0090010Struct) list.get(i)).getTEMP_USEOVER_QTY());
		}
		return size;
	}
	public int setL2L_TEMP_PLANOUT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TEMP_PLANOUT_QTY == null) {
			l_TEMP_PLANOUT_QTY = new ArrayList();
		} else {
			l_TEMP_PLANOUT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TEMP_PLANOUT_QTY.add(((AD0090010Struct) list.get(i)).getTEMP_PLANOUT_QTY());
		}
		return size;
	}
	public int setL2L_TEMP_USE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TEMP_USE_QTY == null) {
			l_TEMP_USE_QTY = new ArrayList();
		} else {
			l_TEMP_USE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TEMP_USE_QTY.add(((AD0090010Struct) list.get(i)).getTEMP_USE_QTY());
		}
		return size;
	}
	public int setL2L_l_PARTIAL_PRD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_PARTIAL_PRD_NO == null) {
			l_l_PARTIAL_PRD_NO = new ArrayList();
		} else {
			l_l_PARTIAL_PRD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_PARTIAL_PRD_NO.add(((AD0090010Struct) list.get(i)).getl_PARTIAL_PRD_NO());
		}
		return size;
	}
	public int setL2L_FIRST_WORK_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FIRST_WORK_FLG == null) {
			l_FIRST_WORK_FLG = new ArrayList();
		} else {
			l_FIRST_WORK_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FIRST_WORK_FLG.add(((AD0090010Struct) list.get(i)).getFIRST_WORK_FLG());
		}
		return size;
	}
	public int setL2L_USE_LOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_USE_LOT_NO == null) {
			l_USE_LOT_NO = new ArrayList();
		} else {
			l_USE_LOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_USE_LOT_NO.add(((AD0090010Struct) list.get(i)).getUSE_LOT_NO());
		}
		return size;
	}
	public int setL2L_USE_ACPT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_USE_ACPT_QTY == null) {
			l_USE_ACPT_QTY = new ArrayList();
		} else {
			l_USE_ACPT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_USE_ACPT_QTY.add(((AD0090010Struct) list.get(i)).getUSE_ACPT_QTY());
		}
		return size;
	}
	public int setL2L_USE_DEFECT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_USE_DEFECT_QTY == null) {
			l_USE_DEFECT_QTY = new ArrayList();
		} else {
			l_USE_DEFECT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_USE_DEFECT_QTY.add(((AD0090010Struct) list.get(i)).getUSE_DEFECT_QTY());
		}
		return size;
	}
	public int setL2L_IN_OPR_INST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_IN_OPR_INST_CD == null) {
			l_IN_OPR_INST_CD = new ArrayList();
		} else {
			l_IN_OPR_INST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_IN_OPR_INST_CD.add(((AD0090010Struct) list.get(i)).getIN_OPR_INST_CD());
		}
		return size;
	}
	public int setL2L_PARTIAL_PRD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PARTIAL_PRD_NO == null) {
			l_PARTIAL_PRD_NO = new ArrayList();
		} else {
			l_PARTIAL_PRD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PARTIAL_PRD_NO.add(((AD0090010Struct) list.get(i)).getPARTIAL_PRD_NO());
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
			l_ITEM_CD.add(((AD0090010Struct) list.get(i)).getITEM_CD());
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
			l_WS_CD.add(((AD0090010Struct) list.get(i)).getWS_CD());
		}
		return size;
	}
	public int setL2L_WORK_IN_PROC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WORK_IN_PROC_CD == null) {
			l_WORK_IN_PROC_CD = new ArrayList();
		} else {
			l_WORK_IN_PROC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WORK_IN_PROC_CD.add(((AD0090010Struct) list.get(i)).getWORK_IN_PROC_CD());
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
			l_PROC_NAME.add(((AD0090010Struct) list.get(i)).getPROC_NAME());
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
			l_PROC_NO.add(((AD0090010Struct) list.get(i)).getPROC_NO());
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
			l_PLANT_CD.add(((AD0090010Struct) list.get(i)).getPLANT_CD());
		}
		return size;
	}
	public int setL2L_WORK_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WORK_STS_TYP == null) {
			l_WORK_STS_TYP = new ArrayList();
		} else {
			l_WORK_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WORK_STS_TYP.add(((AD0090010Struct) list.get(i)).getWORK_STS_TYP());
		}
		return size;
	}
	public int setL2L_WORK_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WORK_ODR_CD == null) {
			l_WORK_ODR_CD = new ArrayList();
		} else {
			l_WORK_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WORK_ODR_CD.add(((AD0090010Struct) list.get(i)).getWORK_ODR_CD());
		}
		return size;
	}
	public int setL2L_OD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OD_NO == null) {
			l_OD_NO = new ArrayList();
		} else {
			l_OD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OD_NO.add(((AD0090010Struct) list.get(i)).getOD_NO());
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
			l_OUTSIDE_TYP.add(((AD0090010Struct) list.get(i)).getOUTSIDE_TYP());
		}
		return size;
	}
	public int setL2L_PROC_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_MODIFY_COUNT == null) {
			l_PROC_MODIFY_COUNT = new ArrayList();
		} else {
			l_PROC_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_MODIFY_COUNT.add(((AD0090010Struct) list.get(i)).getPROC_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_FINAL_PROC_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FINAL_PROC_FLG == null) {
			l_FINAL_PROC_FLG = new ArrayList();
		} else {
			l_FINAL_PROC_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FINAL_PROC_FLG.add(((AD0090010Struct) list.get(i)).getFINAL_PROC_FLG());
		}
		return size;
	}
	public int setL2L_WORK_ODR_DLV_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WORK_ODR_DLV_DATE == null) {
			l_WORK_ODR_DLV_DATE = new ArrayList();
		} else {
			l_WORK_ODR_DLV_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WORK_ODR_DLV_DATE.add(((AD0090010Struct) list.get(i)).getWORK_ODR_DLV_DATE());
		}
		return size;
	}
	public int setL2L_OPR_INST_START_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_INST_START_DATE == null) {
			l_OPR_INST_START_DATE = new ArrayList();
		} else {
			l_OPR_INST_START_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_INST_START_DATE.add(((AD0090010Struct) list.get(i)).getOPR_INST_START_DATE());
		}
		return size;
	}
	public int setL2L_OPR_INST_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_INST_QTY == null) {
			l_OPR_INST_QTY = new ArrayList();
		} else {
			l_OPR_INST_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_INST_QTY.add(((AD0090010Struct) list.get(i)).getOPR_INST_QTY());
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
			l_ITEM_NAME.add(((AD0090010Struct) list.get(i)).getITEM_NAME());
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
			l_UNIT_QTY_TYP.add(((AD0090010Struct) list.get(i)).getUNIT_QTY_TYP());
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
			l_DRAW_CD.add(((AD0090010Struct) list.get(i)).getDRAW_CD());
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
			l_SPEC.add(((AD0090010Struct) list.get(i)).getSPEC());
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
			l_MRP_ODR_TYP.add(((AD0090010Struct) list.get(i)).getMRP_ODR_TYP());
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
			l_STOCK_UNIT.add(((AD0090010Struct) list.get(i)).getSTOCK_UNIT());
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
			l_LOT_NUMBERING_TYP.add(((AD0090010Struct) list.get(i)).getLOT_NUMBERING_TYP());
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
			l_LOT_CTRL_FLG.add(((AD0090010Struct) list.get(i)).getLOT_CTRL_FLG());
		}
		return size;
	}
	public int setL2L_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_CD == null) {
			l_JOB_ODR_CD = new ArrayList();
		} else {
			l_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_CD.add(((AD0090010Struct) list.get(i)).getJOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_JOB_ODR_DETAIL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_DETAIL_NO == null) {
			l_JOB_ODR_DETAIL_NO = new ArrayList();
		} else {
			l_JOB_ODR_DETAIL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_DETAIL_NO.add(((AD0090010Struct) list.get(i)).getJOB_ODR_DETAIL_NO());
		}
		return size;
	}
	public int setL2L_JOB_ODR_CANCEL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_CANCEL_NO == null) {
			l_JOB_ODR_CANCEL_NO = new ArrayList();
		} else {
			l_JOB_ODR_CANCEL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_CANCEL_NO.add(((AD0090010Struct) list.get(i)).getJOB_ODR_CANCEL_NO());
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
			l_WS_NAME.add(((AD0090010Struct) list.get(i)).getWS_NAME());
		}
		return size;
	}
	public int setL2L_SUM_ACPT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUM_ACPT_QTY == null) {
			l_SUM_ACPT_QTY = new ArrayList();
		} else {
			l_SUM_ACPT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUM_ACPT_QTY.add(((AD0090010Struct) list.get(i)).getSUM_ACPT_QTY());
		}
		return size;
	}
	public int setL2L_SUM_DEFECT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUM_DEFECT_QTY == null) {
			l_SUM_DEFECT_QTY = new ArrayList();
		} else {
			l_SUM_DEFECT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUM_DEFECT_QTY.add(((AD0090010Struct) list.get(i)).getSUM_DEFECT_QTY());
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
			l_OPR_RSLT_TYP.add(((AD0090010Struct) list.get(i)).getOPR_RSLT_TYP());
		}
		return size;
	}
	public int setL2L_ITEM_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ITEM_MODIFY_COUNT == null) {
			l_ITEM_MODIFY_COUNT = new ArrayList();
		} else {
			l_ITEM_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ITEM_MODIFY_COUNT.add(((AD0090010Struct) list.get(i)).getITEM_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_h_OPR_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_OPR_DATE == null) {
			l_h_OPR_DATE = new ArrayList();
		} else {
			l_h_OPR_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_OPR_DATE.add(((AD0090010Struct) list.get(i)).geth_OPR_DATE());
		}
		return size;
	}
	public int setL2L_TIME_CTRL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TIME_CTRL == null) {
			l_TIME_CTRL = new ArrayList();
		} else {
			l_TIME_CTRL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TIME_CTRL.add(((AD0090010Struct) list.get(i)).getTIME_CTRL());
		}
		return size;
	}
	public int setL2L_h_BUSINESS_OPR_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_BUSINESS_OPR_DATE == null) {
			l_h_BUSINESS_OPR_DATE = new ArrayList();
		} else {
			l_h_BUSINESS_OPR_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_BUSINESS_OPR_DATE.add(((AD0090010Struct) list.get(i)).geth_BUSINESS_OPR_DATE());
		}
		return size;
	}
	public int setL2L_h_BUSINESS_OPR_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_BUSINESS_OPR_TIME == null) {
			l_h_BUSINESS_OPR_TIME = new ArrayList();
		} else {
			l_h_BUSINESS_OPR_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_BUSINESS_OPR_TIME.add(((AD0090010Struct) list.get(i)).geth_BUSINESS_OPR_TIME());
		}
		return size;
	}
	public int setL2L_FORM_SET_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FORM_SET_ITEM_CD == null) {
			l_FORM_SET_ITEM_CD = new ArrayList();
		} else {
			l_FORM_SET_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FORM_SET_ITEM_CD.add(((AD0090010Struct) list.get(i)).getFORM_SET_ITEM_CD());
		}
		return size;
	}
	public int setL2L_WH_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WH_NAME == null) {
			l_WH_NAME = new ArrayList();
		} else {
			l_WH_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WH_NAME.add(((AD0090010Struct) list.get(i)).getWH_NAME());
		}
		return size;
	}
	public int setL2L_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WH_CD == null) {
			l_WH_CD = new ArrayList();
		} else {
			l_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WH_CD.add(((AD0090010Struct) list.get(i)).getWH_CD());
		}
		return size;
	}
	public int setL2L_PROC_EXEC_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROC_EXEC_DATE == null) {
			l_PROC_EXEC_DATE = new ArrayList();
		} else {
			l_PROC_EXEC_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROC_EXEC_DATE.add(((AD0090010Struct) list.get(i)).getPROC_EXEC_DATE());
		}
		return size;
	}
	public int setL2L_PAST_RESULT_ENTRY_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PAST_RESULT_ENTRY_TYP == null) {
			l_PAST_RESULT_ENTRY_TYP = new ArrayList();
		} else {
			l_PAST_RESULT_ENTRY_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PAST_RESULT_ENTRY_TYP.add(((AD0090010Struct) list.get(i)).getPAST_RESULT_ENTRY_TYP());
		}
		return size;
	}
	public int setL2L_LOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOT_NO == null) {
			l_LOT_NO = new ArrayList();
		} else {
			l_LOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOT_NO.add(((AD0090010Struct) list.get(i)).getLOT_NO());
		}
		return size;
	}
	public int setL2L_ACPT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACPT_QTY == null) {
			l_ACPT_QTY = new ArrayList();
		} else {
			l_ACPT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACPT_QTY.add(((AD0090010Struct) list.get(i)).getACPT_QTY());
		}
		return size;
	}
	public int setL2L_DEFECT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEFECT_QTY == null) {
			l_DEFECT_QTY = new ArrayList();
		} else {
			l_DEFECT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEFECT_QTY.add(((AD0090010Struct) list.get(i)).getDEFECT_QTY());
		}
		return size;
	}
	public int setL2L_OPR_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_DATE == null) {
			l_OPR_DATE = new ArrayList();
		} else {
			l_OPR_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_DATE.add(((AD0090010Struct) list.get(i)).getOPR_DATE());
		}
		return size;
	}
	public int setL2L_OPR_RSLT_PERSON(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_RSLT_PERSON == null) {
			l_OPR_RSLT_PERSON = new ArrayList();
		} else {
			l_OPR_RSLT_PERSON.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_RSLT_PERSON.add(((AD0090010Struct) list.get(i)).getOPR_RSLT_PERSON());
		}
		return size;
	}
	public int setL2L_OPR_RSLT_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_RSLT_COMMENT == null) {
			l_OPR_RSLT_COMMENT = new ArrayList();
		} else {
			l_OPR_RSLT_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_RSLT_COMMENT.add(((AD0090010Struct) list.get(i)).getOPR_RSLT_COMMENT());
		}
		return size;
	}
	public int setL2L_OPR_TIME_UNIT_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_TIME_UNIT_TYP == null) {
			l_OPR_TIME_UNIT_TYP = new ArrayList();
		} else {
			l_OPR_TIME_UNIT_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_TIME_UNIT_TYP.add(((AD0090010Struct) list.get(i)).getOPR_TIME_UNIT_TYP());
		}
		return size;
	}
	public int setL2L_PRE_ARRANGEMENT_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRE_ARRANGEMENT_TIME == null) {
			l_PRE_ARRANGEMENT_TIME = new ArrayList();
		} else {
			l_PRE_ARRANGEMENT_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRE_ARRANGEMENT_TIME.add(((AD0090010Struct) list.get(i)).getPRE_ARRANGEMENT_TIME());
		}
		return size;
	}
	public int setL2L_POST_ARRANGEMENT_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_POST_ARRANGEMENT_TIME == null) {
			l_POST_ARRANGEMENT_TIME = new ArrayList();
		} else {
			l_POST_ARRANGEMENT_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_POST_ARRANGEMENT_TIME.add(((AD0090010Struct) list.get(i)).getPOST_ARRANGEMENT_TIME());
		}
		return size;
	}
	public int setL2L_OPR_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_TIME == null) {
			l_OPR_TIME = new ArrayList();
		} else {
			l_OPR_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_TIME.add(((AD0090010Struct) list.get(i)).getOPR_TIME());
		}
		return size;
	}
	public int setL2L_CESSATION_TIME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CESSATION_TIME == null) {
			l_CESSATION_TIME = new ArrayList();
		} else {
			l_CESSATION_TIME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CESSATION_TIME.add(((AD0090010Struct) list.get(i)).getCESSATION_TIME());
		}
		return size;
	}
	public int setL2L_CESSATION_CAUSE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_CESSATION_CAUSE == null) {
			l_CESSATION_CAUSE = new ArrayList();
		} else {
			l_CESSATION_CAUSE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_CESSATION_CAUSE.add(((AD0090010Struct) list.get(i)).getCESSATION_CAUSE());
		}
		return size;
	}
	public int setL2L_OUTPUT_RSLT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OUTPUT_RSLT_CD == null) {
			l_OUTPUT_RSLT_CD = new ArrayList();
		} else {
			l_OUTPUT_RSLT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OUTPUT_RSLT_CD.add(((AD0090010Struct) list.get(i)).getOUTPUT_RSLT_CD());
		}
		return size;
	}
	public int setL2L_VEND_LOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_LOT_NO == null) {
			l_VEND_LOT_NO = new ArrayList();
		} else {
			l_VEND_LOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_LOT_NO.add(((AD0090010Struct) list.get(i)).getVEND_LOT_NO());
		}
		return size;
	}
	public int setL2L_OPR_CRCT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_CRCT_NO == null) {
			l_OPR_CRCT_NO = new ArrayList();
		} else {
			l_OPR_CRCT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_CRCT_NO.add(((AD0090010Struct) list.get(i)).getOPR_CRCT_NO());
		}
		return size;
	}
	public int setL2L_UPDATE_WORK_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UPDATE_WORK_STS_TYP == null) {
			l_UPDATE_WORK_STS_TYP = new ArrayList();
		} else {
			l_UPDATE_WORK_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UPDATE_WORK_STS_TYP.add(((AD0090010Struct) list.get(i)).getUPDATE_WORK_STS_TYP());
		}
		return size;
	}
	public int setL2L_JOB_ODR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_JOB_ODR_TYP == null) {
			l_JOB_ODR_TYP = new ArrayList();
		} else {
			l_JOB_ODR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_JOB_ODR_TYP.add(((AD0090010Struct) list.get(i)).getJOB_ODR_TYP());
		}
		return size;
	}
	public int setL2L_RCV_ISSUE_CTRL_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_ISSUE_CTRL_CD == null) {
			l_RCV_ISSUE_CTRL_CD = new ArrayList();
		} else {
			l_RCV_ISSUE_CTRL_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_ISSUE_CTRL_CD.add(((AD0090010Struct) list.get(i)).getRCV_ISSUE_CTRL_CD());
		}
		return size;
	}
	public int setL2L_RCV_ISSUE_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_ISSUE_TYP == null) {
			l_RCV_ISSUE_TYP = new ArrayList();
		} else {
			l_RCV_ISSUE_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_ISSUE_TYP.add(((AD0090010Struct) list.get(i)).getRCV_ISSUE_TYP());
		}
		return size;
	}
	public int setL2L_OPR_RSLT_CRCT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_RSLT_CRCT_NO == null) {
			l_OPR_RSLT_CRCT_NO = new ArrayList();
		} else {
			l_OPR_RSLT_CRCT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_RSLT_CRCT_NO.add(((AD0090010Struct) list.get(i)).getOPR_RSLT_CRCT_NO());
		}
		return size;
	}
	public int setL2L_h_ISSUE_INST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ISSUE_INST_CD == null) {
			l_h_ISSUE_INST_CD = new ArrayList();
		} else {
			l_h_ISSUE_INST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ISSUE_INST_CD.add(((AD0090010Struct) list.get(i)).geth_ISSUE_INST_CD());
		}
		return size;
	}
	public int setL2L_SAVE_STOCK_ON_HAND_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SAVE_STOCK_ON_HAND_QTY == null) {
			l_SAVE_STOCK_ON_HAND_QTY = new ArrayList();
		} else {
			l_SAVE_STOCK_ON_HAND_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SAVE_STOCK_ON_HAND_QTY.add(((AD0090010Struct) list.get(i)).getSAVE_STOCK_ON_HAND_QTY());
		}
		return size;
	}
	public int setL2L_RCV_ISSUE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_ISSUE_QTY == null) {
			l_RCV_ISSUE_QTY = new ArrayList();
		} else {
			l_RCV_ISSUE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_ISSUE_QTY.add(((AD0090010Struct) list.get(i)).getRCV_ISSUE_QTY());
		}
		return size;
	}
	public int setL2L_RCV_ISSUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_ISSUE_DATE == null) {
			l_RCV_ISSUE_DATE = new ArrayList();
		} else {
			l_RCV_ISSUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_ISSUE_DATE.add(((AD0090010Struct) list.get(i)).getRCV_ISSUE_DATE());
		}
		return size;
	}
	public int setL2L_RCV_ISSUE_GNR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_ISSUE_GNR_TYP == null) {
			l_RCV_ISSUE_GNR_TYP = new ArrayList();
		} else {
			l_RCV_ISSUE_GNR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_ISSUE_GNR_TYP.add(((AD0090010Struct) list.get(i)).getRCV_ISSUE_GNR_TYP());
		}
		return size;
	}
	public int setL2L_RCV_ISSUE_ODD_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_ISSUE_ODD_QTY == null) {
			l_RCV_ISSUE_ODD_QTY = new ArrayList();
		} else {
			l_RCV_ISSUE_ODD_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_ISSUE_ODD_QTY.add(((AD0090010Struct) list.get(i)).getRCV_ISSUE_ODD_QTY());
		}
		return size;
	}
	public int setL2L_STOCK_UPD_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_UPD_TYP == null) {
			l_STOCK_UPD_TYP = new ArrayList();
		} else {
			l_STOCK_UPD_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_UPD_TYP.add(((AD0090010Struct) list.get(i)).getSTOCK_UPD_TYP());
		}
		return size;
	}
	public int setL2L_RCV_ISSUE_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_ISSUE_COMMENT == null) {
			l_RCV_ISSUE_COMMENT = new ArrayList();
		} else {
			l_RCV_ISSUE_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_ISSUE_COMMENT.add(((AD0090010Struct) list.get(i)).getRCV_ISSUE_COMMENT());
		}
		return size;
	}
	public int setL2L_RCV_ISSUE_CMPLT_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_ISSUE_CMPLT_FLG == null) {
			l_RCV_ISSUE_CMPLT_FLG = new ArrayList();
		} else {
			l_RCV_ISSUE_CMPLT_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_ISSUE_CMPLT_FLG.add(((AD0090010Struct) list.get(i)).getRCV_ISSUE_CMPLT_FLG());
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
			l_COMPANY_CD.add(((AD0090010Struct) list.get(i)).getCOMPANY_CD());
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
			l_MANHOUR_TYP.add(((AD0090010Struct) list.get(i)).getMANHOUR_TYP());
		}
		return size;
	}
	public int setL2L_PARENT_OD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PARENT_OD_NO == null) {
			l_PARENT_OD_NO = new ArrayList();
		} else {
			l_PARENT_OD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PARENT_OD_NO.add(((AD0090010Struct) list.get(i)).getPARENT_OD_NO());
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
			l_PARENT_OUTSIDE_TYP.add(((AD0090010Struct) list.get(i)).getPARENT_OUTSIDE_TYP());
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
			l_PARENT_MRP_ODR_TYP.add(((AD0090010Struct) list.get(i)).getPARENT_MRP_ODR_TYP());
		}
		return size;
	}
	public int setL2L_PARENT_WORK_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PARENT_WORK_ODR_CD == null) {
			l_PARENT_WORK_ODR_CD = new ArrayList();
		} else {
			l_PARENT_WORK_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PARENT_WORK_ODR_CD.add(((AD0090010Struct) list.get(i)).getPARENT_WORK_ODR_CD());
		}
		return size;
	}
	public int setL2L_PARENT_WORK_IN_PROC_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PARENT_WORK_IN_PROC_CD == null) {
			l_PARENT_WORK_IN_PROC_CD = new ArrayList();
		} else {
			l_PARENT_WORK_IN_PROC_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PARENT_WORK_IN_PROC_CD.add(((AD0090010Struct) list.get(i)).getPARENT_WORK_IN_PROC_CD());
		}
		return size;
	}
	public int setL2L_PARENT_PUCH_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PARENT_PUCH_ODR_CD == null) {
			l_PARENT_PUCH_ODR_CD = new ArrayList();
		} else {
			l_PARENT_PUCH_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PARENT_PUCH_ODR_CD.add(((AD0090010Struct) list.get(i)).getPARENT_PUCH_ODR_CD());
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
			l_PUCH_ODR_CD.add(((AD0090010Struct) list.get(i)).getPUCH_ODR_CD());
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
			l_UPDATED_PRG_NM.add(((AD0090010Struct) list.get(i)).getUPDATED_PRG_NM());
		}
		return size;
	}
	public int setL2L_ACPT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACPT_NO == null) {
			l_ACPT_NO = new ArrayList();
		} else {
			l_ACPT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACPT_NO.add(((AD0090010Struct) list.get(i)).getACPT_NO());
		}
		return size;
	}
	public int setL2L_ISSUE_INST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_INST_CD == null) {
			l_ISSUE_INST_CD = new ArrayList();
		} else {
			l_ISSUE_INST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_INST_CD.add(((AD0090010Struct) list.get(i)).getISSUE_INST_CD());
		}
		return size;
	}
	public int setL2L_GET_IDENT_CARD_CTL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_GET_IDENT_CARD_CTL_NO == null) {
			l_GET_IDENT_CARD_CTL_NO = new ArrayList();
		} else {
			l_GET_IDENT_CARD_CTL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_GET_IDENT_CARD_CTL_NO.add(((AD0090010Struct) list.get(i)).getGET_IDENT_CARD_CTL_NO());
		}
		return size;
	}
	public int setL2L_SEL_OPR_INST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEL_OPR_INST_CD == null) {
			l_SEL_OPR_INST_CD = new ArrayList();
		} else {
			l_SEL_OPR_INST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEL_OPR_INST_CD.add(((AD0090010Struct) list.get(i)).getSEL_OPR_INST_CD());
		}
		return size;
	}
	public int setL2L_SEL_PARTIAL_PRD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEL_PARTIAL_PRD_NO == null) {
			l_SEL_PARTIAL_PRD_NO = new ArrayList();
		} else {
			l_SEL_PARTIAL_PRD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEL_PARTIAL_PRD_NO.add(((AD0090010Struct) list.get(i)).getSEL_PARTIAL_PRD_NO());
		}
		return size;
	}
	public int setL2L_SEL_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEL_ITEM_CD == null) {
			l_SEL_ITEM_CD = new ArrayList();
		} else {
			l_SEL_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEL_ITEM_CD.add(((AD0090010Struct) list.get(i)).getSEL_ITEM_CD());
		}
		return size;
	}
	public int setL2L_SEL_ACPT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEL_ACPT_QTY == null) {
			l_SEL_ACPT_QTY = new ArrayList();
		} else {
			l_SEL_ACPT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEL_ACPT_QTY.add(((AD0090010Struct) list.get(i)).getSEL_ACPT_QTY());
		}
		return size;
	}
	public int setL2L_SEL_OPR_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEL_OPR_DATE == null) {
			l_SEL_OPR_DATE = new ArrayList();
		} else {
			l_SEL_OPR_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEL_OPR_DATE.add(((AD0090010Struct) list.get(i)).getSEL_OPR_DATE());
		}
		return size;
	}
	public int setL2L_SEL_PKG_UNIT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEL_PKG_UNIT_QTY == null) {
			l_SEL_PKG_UNIT_QTY = new ArrayList();
		} else {
			l_SEL_PKG_UNIT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEL_PKG_UNIT_QTY.add(((AD0090010Struct) list.get(i)).getSEL_PKG_UNIT_QTY());
		}
		return size;
	}
	public int setL2L_SEL_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEL_PLANT_CD == null) {
			l_SEL_PLANT_CD = new ArrayList();
		} else {
			l_SEL_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEL_PLANT_CD.add(((AD0090010Struct) list.get(i)).getSEL_PLANT_CD());
		}
		return size;
	}
	public int setL2L_SEL_WS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SEL_WS_CD == null) {
			l_SEL_WS_CD = new ArrayList();
		} else {
			l_SEL_WS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SEL_WS_CD.add(((AD0090010Struct) list.get(i)).getSEL_WS_CD());
		}
		return size;
	}
	public int setL2L_INS_IDENT_CARD_CTL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INS_IDENT_CARD_CTL_NO == null) {
			l_INS_IDENT_CARD_CTL_NO = new ArrayList();
		} else {
			l_INS_IDENT_CARD_CTL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INS_IDENT_CARD_CTL_NO.add(((AD0090010Struct) list.get(i)).getINS_IDENT_CARD_CTL_NO());
		}
		return size;
	}
	public int setL2L_INS_OPR_INST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INS_OPR_INST_CD == null) {
			l_INS_OPR_INST_CD = new ArrayList();
		} else {
			l_INS_OPR_INST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INS_OPR_INST_CD.add(((AD0090010Struct) list.get(i)).getINS_OPR_INST_CD());
		}
		return size;
	}
	public int setL2L_INS_PARTIAL_PRD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INS_PARTIAL_PRD_NO == null) {
			l_INS_PARTIAL_PRD_NO = new ArrayList();
		} else {
			l_INS_PARTIAL_PRD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INS_PARTIAL_PRD_NO.add(((AD0090010Struct) list.get(i)).getINS_PARTIAL_PRD_NO());
		}
		return size;
	}
	public int setL2L_INS_RCV_ISSUE_CTRL_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INS_RCV_ISSUE_CTRL_CD == null) {
			l_INS_RCV_ISSUE_CTRL_CD = new ArrayList();
		} else {
			l_INS_RCV_ISSUE_CTRL_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INS_RCV_ISSUE_CTRL_CD.add(((AD0090010Struct) list.get(i)).getINS_RCV_ISSUE_CTRL_CD());
		}
		return size;
	}
	public int setL2L_INS_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INS_ITEM_CD == null) {
			l_INS_ITEM_CD = new ArrayList();
		} else {
			l_INS_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INS_ITEM_CD.add(((AD0090010Struct) list.get(i)).getINS_ITEM_CD());
		}
		return size;
	}
	public int setL2L_INS_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INS_JOB_ODR_CD == null) {
			l_INS_JOB_ODR_CD = new ArrayList();
		} else {
			l_INS_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INS_JOB_ODR_CD.add(((AD0090010Struct) list.get(i)).getINS_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_INS_FIRST_IDENT_CARD_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INS_FIRST_IDENT_CARD_QTY == null) {
			l_INS_FIRST_IDENT_CARD_QTY = new ArrayList();
		} else {
			l_INS_FIRST_IDENT_CARD_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INS_FIRST_IDENT_CARD_QTY.add(((AD0090010Struct) list.get(i)).getINS_FIRST_IDENT_CARD_QTY());
		}
		return size;
	}
	public int setL2L_INS_IDENT_CARD_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INS_IDENT_CARD_QTY == null) {
			l_INS_IDENT_CARD_QTY = new ArrayList();
		} else {
			l_INS_IDENT_CARD_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INS_IDENT_CARD_QTY.add(((AD0090010Struct) list.get(i)).getINS_IDENT_CARD_QTY());
		}
		return size;
	}
	public int setL2L_INS_OPR_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INS_OPR_DATE == null) {
			l_INS_OPR_DATE = new ArrayList();
		} else {
			l_INS_OPR_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INS_OPR_DATE.add(((AD0090010Struct) list.get(i)).getINS_OPR_DATE());
		}
		return size;
	}
	public int setL2L_INS_PKG_UNIT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INS_PKG_UNIT_QTY == null) {
			l_INS_PKG_UNIT_QTY = new ArrayList();
		} else {
			l_INS_PKG_UNIT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INS_PKG_UNIT_QTY.add(((AD0090010Struct) list.get(i)).getINS_PKG_UNIT_QTY());
		}
		return size;
	}
	public int setL2L_INS_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INS_PLANT_CD == null) {
			l_INS_PLANT_CD = new ArrayList();
		} else {
			l_INS_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INS_PLANT_CD.add(((AD0090010Struct) list.get(i)).getINS_PLANT_CD());
		}
		return size;
	}
	public int setL2L_INS_WS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INS_WS_CD == null) {
			l_INS_WS_CD = new ArrayList();
		} else {
			l_INS_WS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INS_WS_CD.add(((AD0090010Struct) list.get(i)).getINS_WS_CD());
		}
		return size;
	}
	public int setL2L_OPR_INST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OPR_INST_CD == null) {
			l_OPR_INST_CD = new ArrayList();
		} else {
			l_OPR_INST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OPR_INST_CD.add(((AD0090010Struct) list.get(i)).getOPR_INST_CD());
		}
		return size;
	}
	public int setL2L_l_DEFECT_CAUSE_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DEFECT_CAUSE_CD == null) {
			l_l_DEFECT_CAUSE_CD = new ArrayList();
		} else {
			l_l_DEFECT_CAUSE_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DEFECT_CAUSE_CD.add(((AD0090010Struct) list.get(i)).getl_DEFECT_CAUSE_CD());
		}
		return size;
	}
	public int setL2L_l_DEFECT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DEFECT_QTY == null) {
			l_l_DEFECT_QTY = new ArrayList();
		} else {
			l_l_DEFECT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DEFECT_QTY.add(((AD0090010Struct) list.get(i)).getl_DEFECT_QTY());
		}
		return size;
	}
	public int setL2L_l_DEFECT_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_l_DEFECT_COMMENT == null) {
			l_l_DEFECT_COMMENT = new ArrayList();
		} else {
			l_l_DEFECT_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_l_DEFECT_COMMENT.add(((AD0090010Struct) list.get(i)).getl_DEFECT_COMMENT());
		}
		return size;
	}
	public int setL2L_RSLT_CTRL_SEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RSLT_CTRL_SEQ_NO == null) {
			l_RSLT_CTRL_SEQ_NO = new ArrayList();
		} else {
			l_RSLT_CTRL_SEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RSLT_CTRL_SEQ_NO.add(((AD0090010Struct) list.get(i)).getRSLT_CTRL_SEQ_NO());
		}
		return size;
	}
	public int setL2L_SUPPLIED_ISSUE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUPPLIED_ISSUE_QTY == null) {
			l_SUPPLIED_ISSUE_QTY = new ArrayList();
		} else {
			l_SUPPLIED_ISSUE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUPPLIED_ISSUE_QTY.add(((AD0090010Struct) list.get(i)).getSUPPLIED_ISSUE_QTY());
		}
		return size;
	}
	public int setL2L_SUPPLIED_ISSUE_QTY_sum(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUPPLIED_ISSUE_QTY_sum == null) {
			l_SUPPLIED_ISSUE_QTY_sum = new ArrayList();
		} else {
			l_SUPPLIED_ISSUE_QTY_sum.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUPPLIED_ISSUE_QTY_sum.add(((AD0090010Struct) list.get(i)).getSUPPLIED_ISSUE_QTY_sum());
		}
		return size;
	}
	public int setL2L_h_ISSUE_INST_UNIT_DENOMINATOR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ISSUE_INST_UNIT_DENOMINATOR == null) {
			l_h_ISSUE_INST_UNIT_DENOMINATOR = new ArrayList();
		} else {
			l_h_ISSUE_INST_UNIT_DENOMINATOR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ISSUE_INST_UNIT_DENOMINATOR.add(((AD0090010Struct) list.get(i)).geth_ISSUE_INST_UNIT_DENOMINATOR());
		}
		return size;
	}
	public int setL2L_h_ISSUE_INST_UNIT_NUMERATOR(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ISSUE_INST_UNIT_NUMERATOR == null) {
			l_h_ISSUE_INST_UNIT_NUMERATOR = new ArrayList();
		} else {
			l_h_ISSUE_INST_UNIT_NUMERATOR.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ISSUE_INST_UNIT_NUMERATOR.add(((AD0090010Struct) list.get(i)).geth_ISSUE_INST_UNIT_NUMERATOR());
		}
		return size;
	}
	public int setL2L_count_RCV_ISSUE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_count_RCV_ISSUE == null) {
			l_count_RCV_ISSUE = new ArrayList();
		} else {
			l_count_RCV_ISSUE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_count_RCV_ISSUE.add(((AD0090010Struct) list.get(i)).getcount_RCV_ISSUE());
		}
		return size;
	}
	public int setL2L_STOCK_ON_HAND_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_STOCK_ON_HAND_QTY == null) {
			l_STOCK_ON_HAND_QTY = new ArrayList();
		} else {
			l_STOCK_ON_HAND_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_STOCK_ON_HAND_QTY.add(((AD0090010Struct) list.get(i)).getSTOCK_ON_HAND_QTY());
		}
		return size;
	}
	public int setL2L_ISSUE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_QTY == null) {
			l_ISSUE_QTY = new ArrayList();
		} else {
			l_ISSUE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_QTY.add(((AD0090010Struct) list.get(i)).getISSUE_QTY());
		}
		return size;
	}
	public int setL2L_ISSUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_DATE == null) {
			l_ISSUE_DATE = new ArrayList();
		} else {
			l_ISSUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_DATE.add(((AD0090010Struct) list.get(i)).getISSUE_DATE());
		}
		return size;
	}
	public int setL2L_SPENT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SPENT_QTY == null) {
			l_SPENT_QTY = new ArrayList();
		} else {
			l_SPENT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SPENT_QTY.add(((AD0090010Struct) list.get(i)).getSPENT_QTY());
		}
		return size;
	}
	public int setL2L_NEXTVAL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NEXTVAL == null) {
			l_NEXTVAL = new ArrayList();
		} else {
			l_NEXTVAL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NEXTVAL.add(((AD0090010Struct) list.get(i)).getNEXTVAL());
		}
		return size;
	}
	public int setL2L_RSLT_CTL_SEQ_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RSLT_CTL_SEQ_NO == null) {
			l_RSLT_CTL_SEQ_NO = new ArrayList();
		} else {
			l_RSLT_CTL_SEQ_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RSLT_CTL_SEQ_NO.add(((AD0090010Struct) list.get(i)).getRSLT_CTL_SEQ_NO());
		}
		return size;
	}
	public int setL2L_TOTAL_ISSUE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TOTAL_ISSUE_QTY == null) {
			l_TOTAL_ISSUE_QTY = new ArrayList();
		} else {
			l_TOTAL_ISSUE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TOTAL_ISSUE_QTY.add(((AD0090010Struct) list.get(i)).getTOTAL_ISSUE_QTY());
		}
		return size;
	}
	public int setL2L_PART_SUPPLIED_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PART_SUPPLIED_COMMENT == null) {
			l_PART_SUPPLIED_COMMENT = new ArrayList();
		} else {
			l_PART_SUPPLIED_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PART_SUPPLIED_COMMENT.add(((AD0090010Struct) list.get(i)).getPART_SUPPLIED_COMMENT());
		}
		return size;
	}
	public int setL2L_SUPPLIED_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SUPPLIED_DATE == null) {
			l_SUPPLIED_DATE = new ArrayList();
		} else {
			l_SUPPLIED_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SUPPLIED_DATE.add(((AD0090010Struct) list.get(i)).getSUPPLIED_DATE());
		}
		return size;
	}
	public int setL2L_ALCD_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ALCD_QTY == null) {
			l_ALCD_QTY = new ArrayList();
		} else {
			l_ALCD_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ALCD_QTY.add(((AD0090010Struct) list.get(i)).getALCD_QTY());
		}
		return size;
	}
	public int setL2L_TMP_IDENT_CARD_CTL_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TMP_IDENT_CARD_CTL_NO == null) {
			l_TMP_IDENT_CARD_CTL_NO = new ArrayList();
		} else {
			l_TMP_IDENT_CARD_CTL_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TMP_IDENT_CARD_CTL_NO.add(((AD0090010Struct) list.get(i)).getTMP_IDENT_CARD_CTL_NO());
		}
		return size;
	}
	public int setL2L_TMP_OPR_INST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TMP_OPR_INST_CD == null) {
			l_TMP_OPR_INST_CD = new ArrayList();
		} else {
			l_TMP_OPR_INST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TMP_OPR_INST_CD.add(((AD0090010Struct) list.get(i)).getTMP_OPR_INST_CD());
		}
		return size;
	}
	public int setL2L_TMP_PARTIAL_PRD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TMP_PARTIAL_PRD_NO == null) {
			l_TMP_PARTIAL_PRD_NO = new ArrayList();
		} else {
			l_TMP_PARTIAL_PRD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TMP_PARTIAL_PRD_NO.add(((AD0090010Struct) list.get(i)).getTMP_PARTIAL_PRD_NO());
		}
		return size;
	}
	public int setL2L_TMP_RCV_ISSUE_CTRL_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TMP_RCV_ISSUE_CTRL_CD == null) {
			l_TMP_RCV_ISSUE_CTRL_CD = new ArrayList();
		} else {
			l_TMP_RCV_ISSUE_CTRL_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TMP_RCV_ISSUE_CTRL_CD.add(((AD0090010Struct) list.get(i)).getTMP_RCV_ISSUE_CTRL_CD());
		}
		return size;
	}
	public int setL2L_TMP_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TMP_ITEM_CD == null) {
			l_TMP_ITEM_CD = new ArrayList();
		} else {
			l_TMP_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TMP_ITEM_CD.add(((AD0090010Struct) list.get(i)).getTMP_ITEM_CD());
		}
		return size;
	}
	public int setL2L_TMP_JOB_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TMP_JOB_ODR_CD == null) {
			l_TMP_JOB_ODR_CD = new ArrayList();
		} else {
			l_TMP_JOB_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TMP_JOB_ODR_CD.add(((AD0090010Struct) list.get(i)).getTMP_JOB_ODR_CD());
		}
		return size;
	}
	public int setL2L_TMP_FIRST_IDENT_CARD_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TMP_FIRST_IDENT_CARD_QTY == null) {
			l_TMP_FIRST_IDENT_CARD_QTY = new ArrayList();
		} else {
			l_TMP_FIRST_IDENT_CARD_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TMP_FIRST_IDENT_CARD_QTY.add(((AD0090010Struct) list.get(i)).getTMP_FIRST_IDENT_CARD_QTY());
		}
		return size;
	}
	public int setL2L_TMP_IDENT_CARD_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TMP_IDENT_CARD_QTY == null) {
			l_TMP_IDENT_CARD_QTY = new ArrayList();
		} else {
			l_TMP_IDENT_CARD_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TMP_IDENT_CARD_QTY.add(((AD0090010Struct) list.get(i)).getTMP_IDENT_CARD_QTY());
		}
		return size;
	}
	public int setL2L_TMP_OPR_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TMP_OPR_DATE == null) {
			l_TMP_OPR_DATE = new ArrayList();
		} else {
			l_TMP_OPR_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TMP_OPR_DATE.add(((AD0090010Struct) list.get(i)).getTMP_OPR_DATE());
		}
		return size;
	}
	public int setL2L_TMP_PKG_UNIT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TMP_PKG_UNIT_QTY == null) {
			l_TMP_PKG_UNIT_QTY = new ArrayList();
		} else {
			l_TMP_PKG_UNIT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TMP_PKG_UNIT_QTY.add(((AD0090010Struct) list.get(i)).getTMP_PKG_UNIT_QTY());
		}
		return size;
	}
	public int setL2L_TMP_PLANT_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TMP_PLANT_CD == null) {
			l_TMP_PLANT_CD = new ArrayList();
		} else {
			l_TMP_PLANT_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TMP_PLANT_CD.add(((AD0090010Struct) list.get(i)).getTMP_PLANT_CD());
		}
		return size;
	}
	public int setL2L_TMP_WS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TMP_WS_CD == null) {
			l_TMP_WS_CD = new ArrayList();
		} else {
			l_TMP_WS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TMP_WS_CD.add(((AD0090010Struct) list.get(i)).getTMP_WS_CD());
		}
		return size;
	}
	public int setL2L_INS_PRINT_GRP_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INS_PRINT_GRP_NO == null) {
			l_INS_PRINT_GRP_NO = new ArrayList();
		} else {
			l_INS_PRINT_GRP_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INS_PRINT_GRP_NO.add(((AD0090010Struct) list.get(i)).getINS_PRINT_GRP_NO());
		}
		return size;
	}
	public int setL2L_INS_PAGE_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INS_PAGE_NO == null) {
			l_INS_PAGE_NO = new ArrayList();
		} else {
			l_INS_PAGE_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INS_PAGE_NO.add(((AD0090010Struct) list.get(i)).getINS_PAGE_NO());
		}
		return size;
	}
	public int setL2L_INS_PRINT_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INS_PRINT_QTY == null) {
			l_INS_PRINT_QTY = new ArrayList();
		} else {
			l_INS_PRINT_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INS_PRINT_QTY.add(((AD0090010Struct) list.get(i)).getINS_PRINT_QTY());
		}
		return size;
	}
	public int setL2L_DM_STS_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DM_STS_TYP == null) {
			l_DM_STS_TYP = new ArrayList();
		} else {
			l_DM_STS_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DM_STS_TYP.add(((AD0090010Struct) list.get(i)).getDM_STS_TYP());
		}
		return size;
	}
	public int setL2L_ISSUE_CMPLT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ISSUE_CMPLT_DATE == null) {
			l_ISSUE_CMPLT_DATE = new ArrayList();
		} else {
			l_ISSUE_CMPLT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ISSUE_CMPLT_DATE.add(((AD0090010Struct) list.get(i)).getISSUE_CMPLT_DATE());
		}
		return size;
	}
	public int setL2L_USER_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_USER_CD == null) {
			l_USER_CD = new ArrayList();
		} else {
			l_USER_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_USER_CD.add(((AD0090010Struct) list.get(i)).getUSER_CD());
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
			l_PRODUCT_TYP.add(((AD0090010Struct) list.get(i)).getPRODUCT_TYP());
		}
		return size;
	}
	public int setL2L_WH_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WH_TYP == null) {
			l_WH_TYP = new ArrayList();
		} else {
			l_WH_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WH_TYP.add(((AD0090010Struct) list.get(i)).getWH_TYP());
		}
		return size;
	}
	public int setL2L_NEXT_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NEXT_WH_CD == null) {
			l_NEXT_WH_CD = new ArrayList();
		} else {
			l_NEXT_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NEXT_WH_CD.add(((AD0090010Struct) list.get(i)).getNEXT_WH_CD());
		}
		return size;
	}
	public int setL2L_FIRST_OPR_INST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FIRST_OPR_INST_CD == null) {
			l_FIRST_OPR_INST_CD = new ArrayList();
		} else {
			l_FIRST_OPR_INST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FIRST_OPR_INST_CD.add(((AD0090010Struct) list.get(i)).getFIRST_OPR_INST_CD());
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
			l_FIRST_PROC_NO.add(((AD0090010Struct) list.get(i)).getFIRST_PROC_NO());
		}
		return size;
	}
	public int setL2L_NEXT_WORK_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NEXT_WORK_ODR_CD == null) {
			l_NEXT_WORK_ODR_CD = new ArrayList();
		} else {
			l_NEXT_WORK_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NEXT_WORK_ODR_CD.add(((AD0090010Struct) list.get(i)).getNEXT_WORK_ODR_CD());
		}
		return size;
	}
	public int setL2L_NEXT_OPR_INST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NEXT_OPR_INST_CD == null) {
			l_NEXT_OPR_INST_CD = new ArrayList();
		} else {
			l_NEXT_OPR_INST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NEXT_OPR_INST_CD.add(((AD0090010Struct) list.get(i)).getNEXT_OPR_INST_CD());
		}
		return size;
	}
	public int setL2L_NEXT_PROC_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NEXT_PROC_NO == null) {
			l_NEXT_PROC_NO = new ArrayList();
		} else {
			l_NEXT_PROC_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NEXT_PROC_NO.add(((AD0090010Struct) list.get(i)).getNEXT_PROC_NO());
		}
		return size;
	}
	public int setL2L_NEXT_WS_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NEXT_WS_CD == null) {
			l_NEXT_WS_CD = new ArrayList();
		} else {
			l_NEXT_WS_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NEXT_WS_CD.add(((AD0090010Struct) list.get(i)).getNEXT_WS_CD());
		}
		return size;
	}
	public int setL2L_NEXT_WS_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NEXT_WS_NAME == null) {
			l_NEXT_WS_NAME = new ArrayList();
		} else {
			l_NEXT_WS_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NEXT_WS_NAME.add(((AD0090010Struct) list.get(i)).getNEXT_WS_NAME());
		}
		return size;
	}
	public int setL2L_NEXT_WH_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NEXT_WH_NAME == null) {
			l_NEXT_WH_NAME = new ArrayList();
		} else {
			l_NEXT_WH_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NEXT_WH_NAME.add(((AD0090010Struct) list.get(i)).getNEXT_WH_NAME());
		}
		return size;
	}
	public int setL2L_PREV_WORK_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PREV_WORK_ODR_CD == null) {
			l_PREV_WORK_ODR_CD = new ArrayList();
		} else {
			l_PREV_WORK_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PREV_WORK_ODR_CD.add(((AD0090010Struct) list.get(i)).getPREV_WORK_ODR_CD());
		}
		return size;
	}
	public int setL2L_PREV_OPR_INST_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PREV_OPR_INST_CD == null) {
			l_PREV_OPR_INST_CD = new ArrayList();
		} else {
			l_PREV_OPR_INST_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PREV_OPR_INST_CD.add(((AD0090010Struct) list.get(i)).getPREV_OPR_INST_CD());
		}
		return size;
	}
	public int setL2L_PREV_PARTIAL_PRD_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PREV_PARTIAL_PRD_NO == null) {
			l_PREV_PARTIAL_PRD_NO = new ArrayList();
		} else {
			l_PREV_PARTIAL_PRD_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PREV_PARTIAL_PRD_NO.add(((AD0090010Struct) list.get(i)).getPREV_PARTIAL_PRD_NO());
		}
		return size;
	}
	public int setL2L_PREV_PROC_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PREV_PROC_NO == null) {
			l_PREV_PROC_NO = new ArrayList();
		} else {
			l_PREV_PROC_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PREV_PROC_NO.add(((AD0090010Struct) list.get(i)).getPREV_PROC_NO());
		}
		return size;
	}
	public int setL2L_PREV_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PREV_WH_CD == null) {
			l_PREV_WH_CD = new ArrayList();
		} else {
			l_PREV_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PREV_WH_CD.add(((AD0090010Struct) list.get(i)).getPREV_WH_CD());
		}
		return size;
	}
	public int setL2L_DATA_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DATA_COUNT == null) {
			l_DATA_COUNT = new ArrayList();
		} else {
			l_DATA_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DATA_COUNT.add(((AD0090010Struct) list.get(i)).getDATA_COUNT());
		}
		return size;
	}
	public int setL2L_WH_CD_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_WH_CD_COUNT == null) {
			l_WH_CD_COUNT = new ArrayList();
		} else {
			l_WH_CD_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_WH_CD_COUNT.add(((AD0090010Struct) list.get(i)).getWH_CD_COUNT());
		}
		return size;
	}
	public int setL2L_FROM_PUCH_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FROM_PUCH_ODR_CD == null) {
			l_FROM_PUCH_ODR_CD = new ArrayList();
		} else {
			l_FROM_PUCH_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FROM_PUCH_ODR_CD.add(((AD0090010Struct) list.get(i)).getFROM_PUCH_ODR_CD());
		}
		return size;
	}
	public int setL2L_TO_PUCH_ODR_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TO_PUCH_ODR_CD == null) {
			l_TO_PUCH_ODR_CD = new ArrayList();
		} else {
			l_TO_PUCH_ODR_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TO_PUCH_ODR_CD.add(((AD0090010Struct) list.get(i)).getTO_PUCH_ODR_CD());
		}
		return size;
	}
	public int setL2L_FROM_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FROM_ITEM_CD == null) {
			l_FROM_ITEM_CD = new ArrayList();
		} else {
			l_FROM_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FROM_ITEM_CD.add(((AD0090010Struct) list.get(i)).getFROM_ITEM_CD());
		}
		return size;
	}
	public int setL2L_FROM_LOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_FROM_LOT_NO == null) {
			l_FROM_LOT_NO = new ArrayList();
		} else {
			l_FROM_LOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_FROM_LOT_NO.add(((AD0090010Struct) list.get(i)).getFROM_LOT_NO());
		}
		return size;
	}
	public int setL2L_TO_ITEM_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TO_ITEM_CD == null) {
			l_TO_ITEM_CD = new ArrayList();
		} else {
			l_TO_ITEM_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TO_ITEM_CD.add(((AD0090010Struct) list.get(i)).getTO_ITEM_CD());
		}
		return size;
	}
	public int setL2L_TO_LOT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_TO_LOT_NO == null) {
			l_TO_LOT_NO = new ArrayList();
		} else {
			l_TO_LOT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_TO_LOT_NO.add(((AD0090010Struct) list.get(i)).getTO_LOT_NO());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_chk_COMPLETE = null;
		m_OPRATION_TIME = null;
		m_chk_OUTPUT = null;
		m_d1_STOCK_UNIT = null;
		m_OPR_TIME_UNIT_TYP_name = null;
		m_OPR_TIME_UNIT_TYP_val = null;
		m_l_DEFECT_CAUSE_CD_name = null;
		m_l_DEFECT_CAUSE_CD_val = null;
		m_MRP_ODR_TYP_DN = null;
		m_DOWNLOAD_FILE = null;
		m_h_FINAL_PROC_FLG = null;
		m_h_SYS_LOT_CTRL_FLG = null;
		m_chk_CHILD_RSLTUPDATE = null;
		m_param1 = null;
		m_param2 = null;
		m_param3 = null;
		m_h_PROCESS_MANAGE_FLG = null;
		m_TEMP_PLAN_QTY = null;
		m_TEMP_USEOVER_QTY = null;
		m_TEMP_PLANOUT_QTY = null;
		m_TEMP_USE_QTY = null;
		m_l_PARTIAL_PRD_NO = null;
		m_FIRST_WORK_FLG = null;
		m_USE_LOT_NO = null;
		m_USE_ACPT_QTY = null;
		m_USE_DEFECT_QTY = null;
		m_IN_OPR_INST_CD = null;
		m_PARTIAL_PRD_NO = null;
		m_ITEM_CD = null;
		m_WS_CD = null;
		m_WORK_IN_PROC_CD = null;
		m_PROC_NAME = null;
		m_PROC_NO = null;
		m_PLANT_CD = null;
		m_WORK_STS_TYP = null;
		m_WORK_ODR_CD = null;
		m_OD_NO = null;
		m_OUTSIDE_TYP = null;
		m_PROC_MODIFY_COUNT = null;
		m_FINAL_PROC_FLG = null;
		m_WORK_ODR_DLV_DATE = null;
		m_OPR_INST_START_DATE = null;
		m_OPR_INST_QTY = null;
		m_ITEM_NAME = null;
		m_UNIT_QTY_TYP = null;
		m_DRAW_CD = null;
		m_SPEC = null;
		m_MRP_ODR_TYP = null;
		m_STOCK_UNIT = null;
		m_LOT_NUMBERING_TYP = null;
		m_LOT_CTRL_FLG = null;
		m_JOB_ODR_CD = null;
		m_JOB_ODR_DETAIL_NO = null;
		m_JOB_ODR_CANCEL_NO = null;
		m_WS_NAME = null;
		m_SUM_ACPT_QTY = null;
		m_SUM_DEFECT_QTY = null;
		m_OPR_RSLT_TYP = null;
		m_ITEM_MODIFY_COUNT = null;
		m_h_OPR_DATE = null;
		m_TIME_CTRL = null;
		m_h_BUSINESS_OPR_DATE = null;
		m_h_BUSINESS_OPR_TIME = null;
		m_FORM_SET_ITEM_CD = null;
		m_WH_NAME = null;
		m_WH_CD = null;
		m_PROC_EXEC_DATE = null;
		m_PAST_RESULT_ENTRY_TYP = null;
		m_LOT_NO = null;
		m_ACPT_QTY = null;
		m_DEFECT_QTY = null;
		m_OPR_DATE = null;
		m_OPR_RSLT_PERSON = null;
		m_OPR_RSLT_COMMENT = null;
		m_OPR_TIME_UNIT_TYP = null;
		m_PRE_ARRANGEMENT_TIME = null;
		m_POST_ARRANGEMENT_TIME = null;
		m_OPR_TIME = null;
		m_CESSATION_TIME = null;
		m_CESSATION_CAUSE = null;
		m_OUTPUT_RSLT_CD = null;
		m_VEND_LOT_NO = null;
		m_OPR_CRCT_NO = null;
		m_UPDATE_WORK_STS_TYP = null;
		m_JOB_ODR_TYP = null;
		m_RCV_ISSUE_CTRL_CD = null;
		m_RCV_ISSUE_TYP = null;
		m_OPR_RSLT_CRCT_NO = null;
		m_h_ISSUE_INST_CD = null;
		m_SAVE_STOCK_ON_HAND_QTY = null;
		m_RCV_ISSUE_QTY = null;
		m_RCV_ISSUE_DATE = null;
		m_RCV_ISSUE_GNR_TYP = null;
		m_RCV_ISSUE_ODD_QTY = null;
		m_STOCK_UPD_TYP = null;
		m_RCV_ISSUE_COMMENT = null;
		m_RCV_ISSUE_CMPLT_FLG = null;
		m_COMPANY_CD = null;
		m_MANHOUR_TYP = null;
		m_PARENT_OD_NO = null;
		m_PARENT_OUTSIDE_TYP = null;
		m_PARENT_MRP_ODR_TYP = null;
		m_PARENT_WORK_ODR_CD = null;
		m_PARENT_WORK_IN_PROC_CD = null;
		m_PARENT_PUCH_ODR_CD = null;
		m_PUCH_ODR_CD = null;
		m_UPDATED_PRG_NM = null;
		m_ACPT_NO = null;
		m_ISSUE_INST_CD = null;
		m_GET_IDENT_CARD_CTL_NO = null;
		m_SEL_OPR_INST_CD = null;
		m_SEL_PARTIAL_PRD_NO = null;
		m_SEL_ITEM_CD = null;
		m_SEL_ACPT_QTY = null;
		m_SEL_OPR_DATE = null;
		m_SEL_PKG_UNIT_QTY = null;
		m_SEL_PLANT_CD = null;
		m_SEL_WS_CD = null;
		m_INS_IDENT_CARD_CTL_NO = null;
		m_INS_OPR_INST_CD = null;
		m_INS_PARTIAL_PRD_NO = null;
		m_INS_RCV_ISSUE_CTRL_CD = null;
		m_INS_ITEM_CD = null;
		m_INS_JOB_ODR_CD = null;
		m_INS_FIRST_IDENT_CARD_QTY = null;
		m_INS_IDENT_CARD_QTY = null;
		m_INS_OPR_DATE = null;
		m_INS_PKG_UNIT_QTY = null;
		m_INS_PLANT_CD = null;
		m_INS_WS_CD = null;
		m_OPR_INST_CD = null;
		m_l_DEFECT_CAUSE_CD = null;
		m_l_DEFECT_QTY = null;
		m_l_DEFECT_COMMENT = null;
		m_RSLT_CTRL_SEQ_NO = null;
		m_SUPPLIED_ISSUE_QTY = null;
		m_SUPPLIED_ISSUE_QTY_sum = null;
		m_h_ISSUE_INST_UNIT_DENOMINATOR = null;
		m_h_ISSUE_INST_UNIT_NUMERATOR = null;
		m_count_RCV_ISSUE = null;
		m_STOCK_ON_HAND_QTY = null;
		m_ISSUE_QTY = null;
		m_ISSUE_DATE = null;
		m_SPENT_QTY = null;
		m_NEXTVAL = null;
		m_RSLT_CTL_SEQ_NO = null;
		m_TOTAL_ISSUE_QTY = null;
		m_PART_SUPPLIED_COMMENT = null;
		m_SUPPLIED_DATE = null;
		m_ALCD_QTY = null;
		m_TMP_IDENT_CARD_CTL_NO = null;
		m_TMP_OPR_INST_CD = null;
		m_TMP_PARTIAL_PRD_NO = null;
		m_TMP_RCV_ISSUE_CTRL_CD = null;
		m_TMP_ITEM_CD = null;
		m_TMP_JOB_ODR_CD = null;
		m_TMP_FIRST_IDENT_CARD_QTY = null;
		m_TMP_IDENT_CARD_QTY = null;
		m_TMP_OPR_DATE = null;
		m_TMP_PKG_UNIT_QTY = null;
		m_TMP_PLANT_CD = null;
		m_TMP_WS_CD = null;
		m_INS_PRINT_GRP_NO = null;
		m_INS_PAGE_NO = null;
		m_INS_PRINT_QTY = null;
		m_DM_STS_TYP = null;
		m_ISSUE_CMPLT_DATE = null;
		m_USER_CD = null;
		m_PRODUCT_TYP = null;
		m_WH_TYP = null;
		m_NEXT_WH_CD = null;
		m_FIRST_OPR_INST_CD = null;
		m_FIRST_PROC_NO = null;
		m_NEXT_WORK_ODR_CD = null;
		m_NEXT_OPR_INST_CD = null;
		m_NEXT_PROC_NO = null;
		m_NEXT_WS_CD = null;
		m_NEXT_WS_NAME = null;
		m_NEXT_WH_NAME = null;
		m_PREV_WORK_ODR_CD = null;
		m_PREV_OPR_INST_CD = null;
		m_PREV_PARTIAL_PRD_NO = null;
		m_PREV_PROC_NO = null;
		m_PREV_WH_CD = null;
		m_DATA_COUNT = null;
		m_WH_CD_COUNT = null;
		m_FROM_PUCH_ODR_CD = null;
		m_TO_PUCH_ODR_CD = null;
		m_FROM_ITEM_CD = null;
		m_FROM_LOT_NO = null;
		m_TO_ITEM_CD = null;
		m_TO_LOT_NO = null;

		l_chk_COMPLETE = null;
		l_OPRATION_TIME = null;
		l_chk_OUTPUT = null;
		l_d1_STOCK_UNIT = null;
		l_OPR_TIME_UNIT_TYP_name = null;
		l_OPR_TIME_UNIT_TYP_val = null;
		l_l_DEFECT_CAUSE_CD_name = null;
		l_l_DEFECT_CAUSE_CD_val = null;
		l_MRP_ODR_TYP_DN = null;
		l_DOWNLOAD_FILE = null;
		l_h_FINAL_PROC_FLG = null;
		l_h_SYS_LOT_CTRL_FLG = null;
		l_chk_CHILD_RSLTUPDATE = null;
		l_param1 = null;
		l_param2 = null;
		l_param3 = null;
		l_h_PROCESS_MANAGE_FLG = null;
		l_TEMP_PLAN_QTY = null;
		l_TEMP_USEOVER_QTY = null;
		l_TEMP_PLANOUT_QTY = null;
		l_TEMP_USE_QTY = null;
		l_l_PARTIAL_PRD_NO = null;
		l_FIRST_WORK_FLG = null;
		l_USE_LOT_NO = null;
		l_USE_ACPT_QTY = null;
		l_USE_DEFECT_QTY = null;
		l_IN_OPR_INST_CD = null;
		l_PARTIAL_PRD_NO = null;
		l_ITEM_CD = null;
		l_WS_CD = null;
		l_WORK_IN_PROC_CD = null;
		l_PROC_NAME = null;
		l_PROC_NO = null;
		l_PLANT_CD = null;
		l_WORK_STS_TYP = null;
		l_WORK_ODR_CD = null;
		l_OD_NO = null;
		l_OUTSIDE_TYP = null;
		l_PROC_MODIFY_COUNT = null;
		l_FINAL_PROC_FLG = null;
		l_WORK_ODR_DLV_DATE = null;
		l_OPR_INST_START_DATE = null;
		l_OPR_INST_QTY = null;
		l_ITEM_NAME = null;
		l_UNIT_QTY_TYP = null;
		l_DRAW_CD = null;
		l_SPEC = null;
		l_MRP_ODR_TYP = null;
		l_STOCK_UNIT = null;
		l_LOT_NUMBERING_TYP = null;
		l_LOT_CTRL_FLG = null;
		l_JOB_ODR_CD = null;
		l_JOB_ODR_DETAIL_NO = null;
		l_JOB_ODR_CANCEL_NO = null;
		l_WS_NAME = null;
		l_SUM_ACPT_QTY = null;
		l_SUM_DEFECT_QTY = null;
		l_OPR_RSLT_TYP = null;
		l_ITEM_MODIFY_COUNT = null;
		l_h_OPR_DATE = null;
		l_TIME_CTRL = null;
		l_h_BUSINESS_OPR_DATE = null;
		l_h_BUSINESS_OPR_TIME = null;
		l_FORM_SET_ITEM_CD = null;
		l_WH_NAME = null;
		l_WH_CD = null;
		l_PROC_EXEC_DATE = null;
		l_PAST_RESULT_ENTRY_TYP = null;
		l_LOT_NO = null;
		l_ACPT_QTY = null;
		l_DEFECT_QTY = null;
		l_OPR_DATE = null;
		l_OPR_RSLT_PERSON = null;
		l_OPR_RSLT_COMMENT = null;
		l_OPR_TIME_UNIT_TYP = null;
		l_PRE_ARRANGEMENT_TIME = null;
		l_POST_ARRANGEMENT_TIME = null;
		l_OPR_TIME = null;
		l_CESSATION_TIME = null;
		l_CESSATION_CAUSE = null;
		l_OUTPUT_RSLT_CD = null;
		l_VEND_LOT_NO = null;
		l_OPR_CRCT_NO = null;
		l_UPDATE_WORK_STS_TYP = null;
		l_JOB_ODR_TYP = null;
		l_RCV_ISSUE_CTRL_CD = null;
		l_RCV_ISSUE_TYP = null;
		l_OPR_RSLT_CRCT_NO = null;
		l_h_ISSUE_INST_CD = null;
		l_SAVE_STOCK_ON_HAND_QTY = null;
		l_RCV_ISSUE_QTY = null;
		l_RCV_ISSUE_DATE = null;
		l_RCV_ISSUE_GNR_TYP = null;
		l_RCV_ISSUE_ODD_QTY = null;
		l_STOCK_UPD_TYP = null;
		l_RCV_ISSUE_COMMENT = null;
		l_RCV_ISSUE_CMPLT_FLG = null;
		l_COMPANY_CD = null;
		l_MANHOUR_TYP = null;
		l_PARENT_OD_NO = null;
		l_PARENT_OUTSIDE_TYP = null;
		l_PARENT_MRP_ODR_TYP = null;
		l_PARENT_WORK_ODR_CD = null;
		l_PARENT_WORK_IN_PROC_CD = null;
		l_PARENT_PUCH_ODR_CD = null;
		l_PUCH_ODR_CD = null;
		l_UPDATED_PRG_NM = null;
		l_ACPT_NO = null;
		l_ISSUE_INST_CD = null;
		l_GET_IDENT_CARD_CTL_NO = null;
		l_SEL_OPR_INST_CD = null;
		l_SEL_PARTIAL_PRD_NO = null;
		l_SEL_ITEM_CD = null;
		l_SEL_ACPT_QTY = null;
		l_SEL_OPR_DATE = null;
		l_SEL_PKG_UNIT_QTY = null;
		l_SEL_PLANT_CD = null;
		l_SEL_WS_CD = null;
		l_INS_IDENT_CARD_CTL_NO = null;
		l_INS_OPR_INST_CD = null;
		l_INS_PARTIAL_PRD_NO = null;
		l_INS_RCV_ISSUE_CTRL_CD = null;
		l_INS_ITEM_CD = null;
		l_INS_JOB_ODR_CD = null;
		l_INS_FIRST_IDENT_CARD_QTY = null;
		l_INS_IDENT_CARD_QTY = null;
		l_INS_OPR_DATE = null;
		l_INS_PKG_UNIT_QTY = null;
		l_INS_PLANT_CD = null;
		l_INS_WS_CD = null;
		l_OPR_INST_CD = null;
		l_l_DEFECT_CAUSE_CD = null;
		l_l_DEFECT_QTY = null;
		l_l_DEFECT_COMMENT = null;
		l_RSLT_CTRL_SEQ_NO = null;
		l_SUPPLIED_ISSUE_QTY = null;
		l_SUPPLIED_ISSUE_QTY_sum = null;
		l_h_ISSUE_INST_UNIT_DENOMINATOR = null;
		l_h_ISSUE_INST_UNIT_NUMERATOR = null;
		l_count_RCV_ISSUE = null;
		l_STOCK_ON_HAND_QTY = null;
		l_ISSUE_QTY = null;
		l_ISSUE_DATE = null;
		l_SPENT_QTY = null;
		l_NEXTVAL = null;
		l_RSLT_CTL_SEQ_NO = null;
		l_TOTAL_ISSUE_QTY = null;
		l_PART_SUPPLIED_COMMENT = null;
		l_SUPPLIED_DATE = null;
		l_ALCD_QTY = null;
		l_TMP_IDENT_CARD_CTL_NO = null;
		l_TMP_OPR_INST_CD = null;
		l_TMP_PARTIAL_PRD_NO = null;
		l_TMP_RCV_ISSUE_CTRL_CD = null;
		l_TMP_ITEM_CD = null;
		l_TMP_JOB_ODR_CD = null;
		l_TMP_FIRST_IDENT_CARD_QTY = null;
		l_TMP_IDENT_CARD_QTY = null;
		l_TMP_OPR_DATE = null;
		l_TMP_PKG_UNIT_QTY = null;
		l_TMP_PLANT_CD = null;
		l_TMP_WS_CD = null;
		l_INS_PRINT_GRP_NO = null;
		l_INS_PAGE_NO = null;
		l_INS_PRINT_QTY = null;
		l_DM_STS_TYP = null;
		l_ISSUE_CMPLT_DATE = null;
		l_USER_CD = null;
		l_PRODUCT_TYP = null;
		l_WH_TYP = null;
		l_NEXT_WH_CD = null;
		l_FIRST_OPR_INST_CD = null;
		l_FIRST_PROC_NO = null;
		l_NEXT_WORK_ODR_CD = null;
		l_NEXT_OPR_INST_CD = null;
		l_NEXT_PROC_NO = null;
		l_NEXT_WS_CD = null;
		l_NEXT_WS_NAME = null;
		l_NEXT_WH_NAME = null;
		l_PREV_WORK_ODR_CD = null;
		l_PREV_OPR_INST_CD = null;
		l_PREV_PARTIAL_PRD_NO = null;
		l_PREV_PROC_NO = null;
		l_PREV_WH_CD = null;
		l_DATA_COUNT = null;
		l_WH_CD_COUNT = null;
		l_FROM_PUCH_ODR_CD = null;
		l_TO_PUCH_ODR_CD = null;
		l_FROM_ITEM_CD = null;
		l_FROM_LOT_NO = null;
		l_TO_ITEM_CD = null;
		l_TO_LOT_NO = null;

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
	 * medAD0090010�N���X�̕W���R���X�g���N�^
	 */
	public AD0090010Struct()
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
	public void setStruct(AD0090010Struct struct)
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
	public void setStructM(AD0090010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setchk_COMPLETE(struct.getchk_COMPLETE());
			this.setOPRATION_TIME(struct.getOPRATION_TIME());
			this.setchk_OUTPUT(struct.getchk_OUTPUT());
			this.setd1_STOCK_UNIT(struct.getd1_STOCK_UNIT());
			this.setOPR_TIME_UNIT_TYP_name(struct.getOPR_TIME_UNIT_TYP_name());
			this.setOPR_TIME_UNIT_TYP_val(struct.getOPR_TIME_UNIT_TYP_val());
			this.setl_DEFECT_CAUSE_CD_name(struct.getl_DEFECT_CAUSE_CD_name());
			this.setl_DEFECT_CAUSE_CD_val(struct.getl_DEFECT_CAUSE_CD_val());
			this.setMRP_ODR_TYP_DN(struct.getMRP_ODR_TYP_DN());
			this.setDOWNLOAD_FILE(struct.getDOWNLOAD_FILE());
			this.seth_FINAL_PROC_FLG(struct.geth_FINAL_PROC_FLG());
			this.seth_SYS_LOT_CTRL_FLG(struct.geth_SYS_LOT_CTRL_FLG());
			this.setchk_CHILD_RSLTUPDATE(struct.getchk_CHILD_RSLTUPDATE());
			this.setparam1(struct.getparam1());
			this.setparam2(struct.getparam2());
			this.setparam3(struct.getparam3());
			this.seth_PROCESS_MANAGE_FLG(struct.geth_PROCESS_MANAGE_FLG());
			this.setTEMP_PLAN_QTY(struct.getTEMP_PLAN_QTY());
			this.setTEMP_USEOVER_QTY(struct.getTEMP_USEOVER_QTY());
			this.setTEMP_PLANOUT_QTY(struct.getTEMP_PLANOUT_QTY());
			this.setTEMP_USE_QTY(struct.getTEMP_USE_QTY());
			this.setl_PARTIAL_PRD_NO(struct.getl_PARTIAL_PRD_NO());
			this.setFIRST_WORK_FLG(struct.getFIRST_WORK_FLG());
			this.setUSE_LOT_NO(struct.getUSE_LOT_NO());
			this.setUSE_ACPT_QTY(struct.getUSE_ACPT_QTY());
			this.setUSE_DEFECT_QTY(struct.getUSE_DEFECT_QTY());
			this.setIN_OPR_INST_CD(struct.getIN_OPR_INST_CD());
			this.setPARTIAL_PRD_NO(struct.getPARTIAL_PRD_NO());
			this.setITEM_CD(struct.getITEM_CD());
			this.setWS_CD(struct.getWS_CD());
			this.setWORK_IN_PROC_CD(struct.getWORK_IN_PROC_CD());
			this.setPROC_NAME(struct.getPROC_NAME());
			this.setPROC_NO(struct.getPROC_NO());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setWORK_STS_TYP(struct.getWORK_STS_TYP());
			this.setWORK_ODR_CD(struct.getWORK_ODR_CD());
			this.setOD_NO(struct.getOD_NO());
			this.setOUTSIDE_TYP(struct.getOUTSIDE_TYP());
			this.setPROC_MODIFY_COUNT(struct.getPROC_MODIFY_COUNT());
			this.setFINAL_PROC_FLG(struct.getFINAL_PROC_FLG());
			this.setWORK_ODR_DLV_DATE(struct.getWORK_ODR_DLV_DATE());
			this.setOPR_INST_START_DATE(struct.getOPR_INST_START_DATE());
			this.setOPR_INST_QTY(struct.getOPR_INST_QTY());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setUNIT_QTY_TYP(struct.getUNIT_QTY_TYP());
			this.setDRAW_CD(struct.getDRAW_CD());
			this.setSPEC(struct.getSPEC());
			this.setMRP_ODR_TYP(struct.getMRP_ODR_TYP());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.setLOT_NUMBERING_TYP(struct.getLOT_NUMBERING_TYP());
			this.setLOT_CTRL_FLG(struct.getLOT_CTRL_FLG());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setJOB_ODR_DETAIL_NO(struct.getJOB_ODR_DETAIL_NO());
			this.setJOB_ODR_CANCEL_NO(struct.getJOB_ODR_CANCEL_NO());
			this.setWS_NAME(struct.getWS_NAME());
			this.setSUM_ACPT_QTY(struct.getSUM_ACPT_QTY());
			this.setSUM_DEFECT_QTY(struct.getSUM_DEFECT_QTY());
			this.setOPR_RSLT_TYP(struct.getOPR_RSLT_TYP());
			this.setITEM_MODIFY_COUNT(struct.getITEM_MODIFY_COUNT());
			this.seth_OPR_DATE(struct.geth_OPR_DATE());
			this.setTIME_CTRL(struct.getTIME_CTRL());
			this.seth_BUSINESS_OPR_DATE(struct.geth_BUSINESS_OPR_DATE());
			this.seth_BUSINESS_OPR_TIME(struct.geth_BUSINESS_OPR_TIME());
			this.setFORM_SET_ITEM_CD(struct.getFORM_SET_ITEM_CD());
			this.setWH_NAME(struct.getWH_NAME());
			this.setWH_CD(struct.getWH_CD());
			this.setPROC_EXEC_DATE(struct.getPROC_EXEC_DATE());
			this.setPAST_RESULT_ENTRY_TYP(struct.getPAST_RESULT_ENTRY_TYP());
			this.setLOT_NO(struct.getLOT_NO());
			this.setACPT_QTY(struct.getACPT_QTY());
			this.setDEFECT_QTY(struct.getDEFECT_QTY());
			this.setOPR_DATE(struct.getOPR_DATE());
			this.setOPR_RSLT_PERSON(struct.getOPR_RSLT_PERSON());
			this.setOPR_RSLT_COMMENT(struct.getOPR_RSLT_COMMENT());
			this.setOPR_TIME_UNIT_TYP(struct.getOPR_TIME_UNIT_TYP());
			this.setPRE_ARRANGEMENT_TIME(struct.getPRE_ARRANGEMENT_TIME());
			this.setPOST_ARRANGEMENT_TIME(struct.getPOST_ARRANGEMENT_TIME());
			this.setOPR_TIME(struct.getOPR_TIME());
			this.setCESSATION_TIME(struct.getCESSATION_TIME());
			this.setCESSATION_CAUSE(struct.getCESSATION_CAUSE());
			this.setOUTPUT_RSLT_CD(struct.getOUTPUT_RSLT_CD());
			this.setVEND_LOT_NO(struct.getVEND_LOT_NO());
			this.setOPR_CRCT_NO(struct.getOPR_CRCT_NO());
			this.setUPDATE_WORK_STS_TYP(struct.getUPDATE_WORK_STS_TYP());
			this.setJOB_ODR_TYP(struct.getJOB_ODR_TYP());
			this.setRCV_ISSUE_CTRL_CD(struct.getRCV_ISSUE_CTRL_CD());
			this.setRCV_ISSUE_TYP(struct.getRCV_ISSUE_TYP());
			this.setOPR_RSLT_CRCT_NO(struct.getOPR_RSLT_CRCT_NO());
			this.seth_ISSUE_INST_CD(struct.geth_ISSUE_INST_CD());
			this.setSAVE_STOCK_ON_HAND_QTY(struct.getSAVE_STOCK_ON_HAND_QTY());
			this.setRCV_ISSUE_QTY(struct.getRCV_ISSUE_QTY());
			this.setRCV_ISSUE_DATE(struct.getRCV_ISSUE_DATE());
			this.setRCV_ISSUE_GNR_TYP(struct.getRCV_ISSUE_GNR_TYP());
			this.setRCV_ISSUE_ODD_QTY(struct.getRCV_ISSUE_ODD_QTY());
			this.setSTOCK_UPD_TYP(struct.getSTOCK_UPD_TYP());
			this.setRCV_ISSUE_COMMENT(struct.getRCV_ISSUE_COMMENT());
			this.setRCV_ISSUE_CMPLT_FLG(struct.getRCV_ISSUE_CMPLT_FLG());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setMANHOUR_TYP(struct.getMANHOUR_TYP());
			this.setPARENT_OD_NO(struct.getPARENT_OD_NO());
			this.setPARENT_OUTSIDE_TYP(struct.getPARENT_OUTSIDE_TYP());
			this.setPARENT_MRP_ODR_TYP(struct.getPARENT_MRP_ODR_TYP());
			this.setPARENT_WORK_ODR_CD(struct.getPARENT_WORK_ODR_CD());
			this.setPARENT_WORK_IN_PROC_CD(struct.getPARENT_WORK_IN_PROC_CD());
			this.setPARENT_PUCH_ODR_CD(struct.getPARENT_PUCH_ODR_CD());
			this.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());
			this.setUPDATED_PRG_NM(struct.getUPDATED_PRG_NM());
			this.setACPT_NO(struct.getACPT_NO());
			this.setISSUE_INST_CD(struct.getISSUE_INST_CD());
			this.setGET_IDENT_CARD_CTL_NO(struct.getGET_IDENT_CARD_CTL_NO());
			this.setSEL_OPR_INST_CD(struct.getSEL_OPR_INST_CD());
			this.setSEL_PARTIAL_PRD_NO(struct.getSEL_PARTIAL_PRD_NO());
			this.setSEL_ITEM_CD(struct.getSEL_ITEM_CD());
			this.setSEL_ACPT_QTY(struct.getSEL_ACPT_QTY());
			this.setSEL_OPR_DATE(struct.getSEL_OPR_DATE());
			this.setSEL_PKG_UNIT_QTY(struct.getSEL_PKG_UNIT_QTY());
			this.setSEL_PLANT_CD(struct.getSEL_PLANT_CD());
			this.setSEL_WS_CD(struct.getSEL_WS_CD());
			this.setINS_IDENT_CARD_CTL_NO(struct.getINS_IDENT_CARD_CTL_NO());
			this.setINS_OPR_INST_CD(struct.getINS_OPR_INST_CD());
			this.setINS_PARTIAL_PRD_NO(struct.getINS_PARTIAL_PRD_NO());
			this.setINS_RCV_ISSUE_CTRL_CD(struct.getINS_RCV_ISSUE_CTRL_CD());
			this.setINS_ITEM_CD(struct.getINS_ITEM_CD());
			this.setINS_JOB_ODR_CD(struct.getINS_JOB_ODR_CD());
			this.setINS_FIRST_IDENT_CARD_QTY(struct.getINS_FIRST_IDENT_CARD_QTY());
			this.setINS_IDENT_CARD_QTY(struct.getINS_IDENT_CARD_QTY());
			this.setINS_OPR_DATE(struct.getINS_OPR_DATE());
			this.setINS_PKG_UNIT_QTY(struct.getINS_PKG_UNIT_QTY());
			this.setINS_PLANT_CD(struct.getINS_PLANT_CD());
			this.setINS_WS_CD(struct.getINS_WS_CD());
			this.setOPR_INST_CD(struct.getOPR_INST_CD());
			this.setl_DEFECT_CAUSE_CD(struct.getl_DEFECT_CAUSE_CD());
			this.setl_DEFECT_QTY(struct.getl_DEFECT_QTY());
			this.setl_DEFECT_COMMENT(struct.getl_DEFECT_COMMENT());
			this.setRSLT_CTRL_SEQ_NO(struct.getRSLT_CTRL_SEQ_NO());
			this.setSUPPLIED_ISSUE_QTY(struct.getSUPPLIED_ISSUE_QTY());
			this.setSUPPLIED_ISSUE_QTY_sum(struct.getSUPPLIED_ISSUE_QTY_sum());
			this.seth_ISSUE_INST_UNIT_DENOMINATOR(struct.geth_ISSUE_INST_UNIT_DENOMINATOR());
			this.seth_ISSUE_INST_UNIT_NUMERATOR(struct.geth_ISSUE_INST_UNIT_NUMERATOR());
			this.setcount_RCV_ISSUE(struct.getcount_RCV_ISSUE());
			this.setSTOCK_ON_HAND_QTY(struct.getSTOCK_ON_HAND_QTY());
			this.setISSUE_QTY(struct.getISSUE_QTY());
			this.setISSUE_DATE(struct.getISSUE_DATE());
			this.setSPENT_QTY(struct.getSPENT_QTY());
			this.setNEXTVAL(struct.getNEXTVAL());
			this.setRSLT_CTL_SEQ_NO(struct.getRSLT_CTL_SEQ_NO());
			this.setTOTAL_ISSUE_QTY(struct.getTOTAL_ISSUE_QTY());
			this.setPART_SUPPLIED_COMMENT(struct.getPART_SUPPLIED_COMMENT());
			this.setSUPPLIED_DATE(struct.getSUPPLIED_DATE());
			this.setALCD_QTY(struct.getALCD_QTY());
			this.setTMP_IDENT_CARD_CTL_NO(struct.getTMP_IDENT_CARD_CTL_NO());
			this.setTMP_OPR_INST_CD(struct.getTMP_OPR_INST_CD());
			this.setTMP_PARTIAL_PRD_NO(struct.getTMP_PARTIAL_PRD_NO());
			this.setTMP_RCV_ISSUE_CTRL_CD(struct.getTMP_RCV_ISSUE_CTRL_CD());
			this.setTMP_ITEM_CD(struct.getTMP_ITEM_CD());
			this.setTMP_JOB_ODR_CD(struct.getTMP_JOB_ODR_CD());
			this.setTMP_FIRST_IDENT_CARD_QTY(struct.getTMP_FIRST_IDENT_CARD_QTY());
			this.setTMP_IDENT_CARD_QTY(struct.getTMP_IDENT_CARD_QTY());
			this.setTMP_OPR_DATE(struct.getTMP_OPR_DATE());
			this.setTMP_PKG_UNIT_QTY(struct.getTMP_PKG_UNIT_QTY());
			this.setTMP_PLANT_CD(struct.getTMP_PLANT_CD());
			this.setTMP_WS_CD(struct.getTMP_WS_CD());
			this.setINS_PRINT_GRP_NO(struct.getINS_PRINT_GRP_NO());
			this.setINS_PAGE_NO(struct.getINS_PAGE_NO());
			this.setINS_PRINT_QTY(struct.getINS_PRINT_QTY());
			this.setDM_STS_TYP(struct.getDM_STS_TYP());
			this.setISSUE_CMPLT_DATE(struct.getISSUE_CMPLT_DATE());
			this.setUSER_CD(struct.getUSER_CD());
			this.setPRODUCT_TYP(struct.getPRODUCT_TYP());
			this.setWH_TYP(struct.getWH_TYP());
			this.setNEXT_WH_CD(struct.getNEXT_WH_CD());
			this.setFIRST_OPR_INST_CD(struct.getFIRST_OPR_INST_CD());
			this.setFIRST_PROC_NO(struct.getFIRST_PROC_NO());
			this.setNEXT_WORK_ODR_CD(struct.getNEXT_WORK_ODR_CD());
			this.setNEXT_OPR_INST_CD(struct.getNEXT_OPR_INST_CD());
			this.setNEXT_PROC_NO(struct.getNEXT_PROC_NO());
			this.setNEXT_WS_CD(struct.getNEXT_WS_CD());
			this.setNEXT_WS_NAME(struct.getNEXT_WS_NAME());
			this.setNEXT_WH_NAME(struct.getNEXT_WH_NAME());
			this.setPREV_WORK_ODR_CD(struct.getPREV_WORK_ODR_CD());
			this.setPREV_OPR_INST_CD(struct.getPREV_OPR_INST_CD());
			this.setPREV_PARTIAL_PRD_NO(struct.getPREV_PARTIAL_PRD_NO());
			this.setPREV_PROC_NO(struct.getPREV_PROC_NO());
			this.setPREV_WH_CD(struct.getPREV_WH_CD());
			this.setDATA_COUNT(struct.getDATA_COUNT());
			this.setWH_CD_COUNT(struct.getWH_CD_COUNT());
			this.setFROM_PUCH_ODR_CD(struct.getFROM_PUCH_ODR_CD());
			this.setTO_PUCH_ODR_CD(struct.getTO_PUCH_ODR_CD());
			this.setFROM_ITEM_CD(struct.getFROM_ITEM_CD());
			this.setFROM_LOT_NO(struct.getFROM_LOT_NO());
			this.setTO_ITEM_CD(struct.getTO_ITEM_CD());
			this.setTO_LOT_NO(struct.getTO_LOT_NO());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AD0090010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_chk_COMPLETE(struct.getList_chk_COMPLETE());
			this.setList_OPRATION_TIME(struct.getList_OPRATION_TIME());
			this.setList_chk_OUTPUT(struct.getList_chk_OUTPUT());
			this.setList_d1_STOCK_UNIT(struct.getList_d1_STOCK_UNIT());
			this.setList_OPR_TIME_UNIT_TYP_name(struct.getList_OPR_TIME_UNIT_TYP_name());
			this.setList_OPR_TIME_UNIT_TYP_val(struct.getList_OPR_TIME_UNIT_TYP_val());
			this.setList_l_DEFECT_CAUSE_CD_name(struct.getList_l_DEFECT_CAUSE_CD_name());
			this.setList_l_DEFECT_CAUSE_CD_val(struct.getList_l_DEFECT_CAUSE_CD_val());
			this.setList_MRP_ODR_TYP_DN(struct.getList_MRP_ODR_TYP_DN());
			this.setList_DOWNLOAD_FILE(struct.getList_DOWNLOAD_FILE());
			this.setList_h_FINAL_PROC_FLG(struct.getList_h_FINAL_PROC_FLG());
			this.setList_h_SYS_LOT_CTRL_FLG(struct.getList_h_SYS_LOT_CTRL_FLG());
			this.setList_chk_CHILD_RSLTUPDATE(struct.getList_chk_CHILD_RSLTUPDATE());
			this.setList_param1(struct.getList_param1());
			this.setList_param2(struct.getList_param2());
			this.setList_param3(struct.getList_param3());
			this.setList_h_PROCESS_MANAGE_FLG(struct.getList_h_PROCESS_MANAGE_FLG());
			this.setList_TEMP_PLAN_QTY(struct.getList_TEMP_PLAN_QTY());
			this.setList_TEMP_USEOVER_QTY(struct.getList_TEMP_USEOVER_QTY());
			this.setList_TEMP_PLANOUT_QTY(struct.getList_TEMP_PLANOUT_QTY());
			this.setList_TEMP_USE_QTY(struct.getList_TEMP_USE_QTY());
			this.setList_l_PARTIAL_PRD_NO(struct.getList_l_PARTIAL_PRD_NO());
			this.setList_FIRST_WORK_FLG(struct.getList_FIRST_WORK_FLG());
			this.setList_USE_LOT_NO(struct.getList_USE_LOT_NO());
			this.setList_USE_ACPT_QTY(struct.getList_USE_ACPT_QTY());
			this.setList_USE_DEFECT_QTY(struct.getList_USE_DEFECT_QTY());
			this.setList_IN_OPR_INST_CD(struct.getList_IN_OPR_INST_CD());
			this.setList_PARTIAL_PRD_NO(struct.getList_PARTIAL_PRD_NO());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_WS_CD(struct.getList_WS_CD());
			this.setList_WORK_IN_PROC_CD(struct.getList_WORK_IN_PROC_CD());
			this.setList_PROC_NAME(struct.getList_PROC_NAME());
			this.setList_PROC_NO(struct.getList_PROC_NO());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_WORK_STS_TYP(struct.getList_WORK_STS_TYP());
			this.setList_WORK_ODR_CD(struct.getList_WORK_ODR_CD());
			this.setList_OD_NO(struct.getList_OD_NO());
			this.setList_OUTSIDE_TYP(struct.getList_OUTSIDE_TYP());
			this.setList_PROC_MODIFY_COUNT(struct.getList_PROC_MODIFY_COUNT());
			this.setList_FINAL_PROC_FLG(struct.getList_FINAL_PROC_FLG());
			this.setList_WORK_ODR_DLV_DATE(struct.getList_WORK_ODR_DLV_DATE());
			this.setList_OPR_INST_START_DATE(struct.getList_OPR_INST_START_DATE());
			this.setList_OPR_INST_QTY(struct.getList_OPR_INST_QTY());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_UNIT_QTY_TYP(struct.getList_UNIT_QTY_TYP());
			this.setList_DRAW_CD(struct.getList_DRAW_CD());
			this.setList_SPEC(struct.getList_SPEC());
			this.setList_MRP_ODR_TYP(struct.getList_MRP_ODR_TYP());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_LOT_NUMBERING_TYP(struct.getList_LOT_NUMBERING_TYP());
			this.setList_LOT_CTRL_FLG(struct.getList_LOT_CTRL_FLG());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_JOB_ODR_DETAIL_NO(struct.getList_JOB_ODR_DETAIL_NO());
			this.setList_JOB_ODR_CANCEL_NO(struct.getList_JOB_ODR_CANCEL_NO());
			this.setList_WS_NAME(struct.getList_WS_NAME());
			this.setList_SUM_ACPT_QTY(struct.getList_SUM_ACPT_QTY());
			this.setList_SUM_DEFECT_QTY(struct.getList_SUM_DEFECT_QTY());
			this.setList_OPR_RSLT_TYP(struct.getList_OPR_RSLT_TYP());
			this.setList_ITEM_MODIFY_COUNT(struct.getList_ITEM_MODIFY_COUNT());
			this.setList_h_OPR_DATE(struct.getList_h_OPR_DATE());
			this.setList_TIME_CTRL(struct.getList_TIME_CTRL());
			this.setList_h_BUSINESS_OPR_DATE(struct.getList_h_BUSINESS_OPR_DATE());
			this.setList_h_BUSINESS_OPR_TIME(struct.getList_h_BUSINESS_OPR_TIME());
			this.setList_FORM_SET_ITEM_CD(struct.getList_FORM_SET_ITEM_CD());
			this.setList_WH_NAME(struct.getList_WH_NAME());
			this.setList_WH_CD(struct.getList_WH_CD());
			this.setList_PROC_EXEC_DATE(struct.getList_PROC_EXEC_DATE());
			this.setList_PAST_RESULT_ENTRY_TYP(struct.getList_PAST_RESULT_ENTRY_TYP());
			this.setList_LOT_NO(struct.getList_LOT_NO());
			this.setList_ACPT_QTY(struct.getList_ACPT_QTY());
			this.setList_DEFECT_QTY(struct.getList_DEFECT_QTY());
			this.setList_OPR_DATE(struct.getList_OPR_DATE());
			this.setList_OPR_RSLT_PERSON(struct.getList_OPR_RSLT_PERSON());
			this.setList_OPR_RSLT_COMMENT(struct.getList_OPR_RSLT_COMMENT());
			this.setList_OPR_TIME_UNIT_TYP(struct.getList_OPR_TIME_UNIT_TYP());
			this.setList_PRE_ARRANGEMENT_TIME(struct.getList_PRE_ARRANGEMENT_TIME());
			this.setList_POST_ARRANGEMENT_TIME(struct.getList_POST_ARRANGEMENT_TIME());
			this.setList_OPR_TIME(struct.getList_OPR_TIME());
			this.setList_CESSATION_TIME(struct.getList_CESSATION_TIME());
			this.setList_CESSATION_CAUSE(struct.getList_CESSATION_CAUSE());
			this.setList_OUTPUT_RSLT_CD(struct.getList_OUTPUT_RSLT_CD());
			this.setList_VEND_LOT_NO(struct.getList_VEND_LOT_NO());
			this.setList_OPR_CRCT_NO(struct.getList_OPR_CRCT_NO());
			this.setList_UPDATE_WORK_STS_TYP(struct.getList_UPDATE_WORK_STS_TYP());
			this.setList_JOB_ODR_TYP(struct.getList_JOB_ODR_TYP());
			this.setList_RCV_ISSUE_CTRL_CD(struct.getList_RCV_ISSUE_CTRL_CD());
			this.setList_RCV_ISSUE_TYP(struct.getList_RCV_ISSUE_TYP());
			this.setList_OPR_RSLT_CRCT_NO(struct.getList_OPR_RSLT_CRCT_NO());
			this.setList_h_ISSUE_INST_CD(struct.getList_h_ISSUE_INST_CD());
			this.setList_SAVE_STOCK_ON_HAND_QTY(struct.getList_SAVE_STOCK_ON_HAND_QTY());
			this.setList_RCV_ISSUE_QTY(struct.getList_RCV_ISSUE_QTY());
			this.setList_RCV_ISSUE_DATE(struct.getList_RCV_ISSUE_DATE());
			this.setList_RCV_ISSUE_GNR_TYP(struct.getList_RCV_ISSUE_GNR_TYP());
			this.setList_RCV_ISSUE_ODD_QTY(struct.getList_RCV_ISSUE_ODD_QTY());
			this.setList_STOCK_UPD_TYP(struct.getList_STOCK_UPD_TYP());
			this.setList_RCV_ISSUE_COMMENT(struct.getList_RCV_ISSUE_COMMENT());
			this.setList_RCV_ISSUE_CMPLT_FLG(struct.getList_RCV_ISSUE_CMPLT_FLG());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_MANHOUR_TYP(struct.getList_MANHOUR_TYP());
			this.setList_PARENT_OD_NO(struct.getList_PARENT_OD_NO());
			this.setList_PARENT_OUTSIDE_TYP(struct.getList_PARENT_OUTSIDE_TYP());
			this.setList_PARENT_MRP_ODR_TYP(struct.getList_PARENT_MRP_ODR_TYP());
			this.setList_PARENT_WORK_ODR_CD(struct.getList_PARENT_WORK_ODR_CD());
			this.setList_PARENT_WORK_IN_PROC_CD(struct.getList_PARENT_WORK_IN_PROC_CD());
			this.setList_PARENT_PUCH_ODR_CD(struct.getList_PARENT_PUCH_ODR_CD());
			this.setList_PUCH_ODR_CD(struct.getList_PUCH_ODR_CD());
			this.setList_UPDATED_PRG_NM(struct.getList_UPDATED_PRG_NM());
			this.setList_ACPT_NO(struct.getList_ACPT_NO());
			this.setList_ISSUE_INST_CD(struct.getList_ISSUE_INST_CD());
			this.setList_GET_IDENT_CARD_CTL_NO(struct.getList_GET_IDENT_CARD_CTL_NO());
			this.setList_SEL_OPR_INST_CD(struct.getList_SEL_OPR_INST_CD());
			this.setList_SEL_PARTIAL_PRD_NO(struct.getList_SEL_PARTIAL_PRD_NO());
			this.setList_SEL_ITEM_CD(struct.getList_SEL_ITEM_CD());
			this.setList_SEL_ACPT_QTY(struct.getList_SEL_ACPT_QTY());
			this.setList_SEL_OPR_DATE(struct.getList_SEL_OPR_DATE());
			this.setList_SEL_PKG_UNIT_QTY(struct.getList_SEL_PKG_UNIT_QTY());
			this.setList_SEL_PLANT_CD(struct.getList_SEL_PLANT_CD());
			this.setList_SEL_WS_CD(struct.getList_SEL_WS_CD());
			this.setList_INS_IDENT_CARD_CTL_NO(struct.getList_INS_IDENT_CARD_CTL_NO());
			this.setList_INS_OPR_INST_CD(struct.getList_INS_OPR_INST_CD());
			this.setList_INS_PARTIAL_PRD_NO(struct.getList_INS_PARTIAL_PRD_NO());
			this.setList_INS_RCV_ISSUE_CTRL_CD(struct.getList_INS_RCV_ISSUE_CTRL_CD());
			this.setList_INS_ITEM_CD(struct.getList_INS_ITEM_CD());
			this.setList_INS_JOB_ODR_CD(struct.getList_INS_JOB_ODR_CD());
			this.setList_INS_FIRST_IDENT_CARD_QTY(struct.getList_INS_FIRST_IDENT_CARD_QTY());
			this.setList_INS_IDENT_CARD_QTY(struct.getList_INS_IDENT_CARD_QTY());
			this.setList_INS_OPR_DATE(struct.getList_INS_OPR_DATE());
			this.setList_INS_PKG_UNIT_QTY(struct.getList_INS_PKG_UNIT_QTY());
			this.setList_INS_PLANT_CD(struct.getList_INS_PLANT_CD());
			this.setList_INS_WS_CD(struct.getList_INS_WS_CD());
			this.setList_OPR_INST_CD(struct.getList_OPR_INST_CD());
			this.setList_l_DEFECT_CAUSE_CD(struct.getList_l_DEFECT_CAUSE_CD());
			this.setList_l_DEFECT_QTY(struct.getList_l_DEFECT_QTY());
			this.setList_l_DEFECT_COMMENT(struct.getList_l_DEFECT_COMMENT());
			this.setList_RSLT_CTRL_SEQ_NO(struct.getList_RSLT_CTRL_SEQ_NO());
			this.setList_SUPPLIED_ISSUE_QTY(struct.getList_SUPPLIED_ISSUE_QTY());
			this.setList_SUPPLIED_ISSUE_QTY_sum(struct.getList_SUPPLIED_ISSUE_QTY_sum());
			this.setList_h_ISSUE_INST_UNIT_DENOMINATOR(struct.getList_h_ISSUE_INST_UNIT_DENOMINATOR());
			this.setList_h_ISSUE_INST_UNIT_NUMERATOR(struct.getList_h_ISSUE_INST_UNIT_NUMERATOR());
			this.setList_count_RCV_ISSUE(struct.getList_count_RCV_ISSUE());
			this.setList_STOCK_ON_HAND_QTY(struct.getList_STOCK_ON_HAND_QTY());
			this.setList_ISSUE_QTY(struct.getList_ISSUE_QTY());
			this.setList_ISSUE_DATE(struct.getList_ISSUE_DATE());
			this.setList_SPENT_QTY(struct.getList_SPENT_QTY());
			this.setList_NEXTVAL(struct.getList_NEXTVAL());
			this.setList_RSLT_CTL_SEQ_NO(struct.getList_RSLT_CTL_SEQ_NO());
			this.setList_TOTAL_ISSUE_QTY(struct.getList_TOTAL_ISSUE_QTY());
			this.setList_PART_SUPPLIED_COMMENT(struct.getList_PART_SUPPLIED_COMMENT());
			this.setList_SUPPLIED_DATE(struct.getList_SUPPLIED_DATE());
			this.setList_ALCD_QTY(struct.getList_ALCD_QTY());
			this.setList_TMP_IDENT_CARD_CTL_NO(struct.getList_TMP_IDENT_CARD_CTL_NO());
			this.setList_TMP_OPR_INST_CD(struct.getList_TMP_OPR_INST_CD());
			this.setList_TMP_PARTIAL_PRD_NO(struct.getList_TMP_PARTIAL_PRD_NO());
			this.setList_TMP_RCV_ISSUE_CTRL_CD(struct.getList_TMP_RCV_ISSUE_CTRL_CD());
			this.setList_TMP_ITEM_CD(struct.getList_TMP_ITEM_CD());
			this.setList_TMP_JOB_ODR_CD(struct.getList_TMP_JOB_ODR_CD());
			this.setList_TMP_FIRST_IDENT_CARD_QTY(struct.getList_TMP_FIRST_IDENT_CARD_QTY());
			this.setList_TMP_IDENT_CARD_QTY(struct.getList_TMP_IDENT_CARD_QTY());
			this.setList_TMP_OPR_DATE(struct.getList_TMP_OPR_DATE());
			this.setList_TMP_PKG_UNIT_QTY(struct.getList_TMP_PKG_UNIT_QTY());
			this.setList_TMP_PLANT_CD(struct.getList_TMP_PLANT_CD());
			this.setList_TMP_WS_CD(struct.getList_TMP_WS_CD());
			this.setList_INS_PRINT_GRP_NO(struct.getList_INS_PRINT_GRP_NO());
			this.setList_INS_PAGE_NO(struct.getList_INS_PAGE_NO());
			this.setList_INS_PRINT_QTY(struct.getList_INS_PRINT_QTY());
			this.setList_DM_STS_TYP(struct.getList_DM_STS_TYP());
			this.setList_ISSUE_CMPLT_DATE(struct.getList_ISSUE_CMPLT_DATE());
			this.setList_USER_CD(struct.getList_USER_CD());
			this.setList_PRODUCT_TYP(struct.getList_PRODUCT_TYP());
			this.setList_WH_TYP(struct.getList_WH_TYP());
			this.setList_NEXT_WH_CD(struct.getList_NEXT_WH_CD());
			this.setList_FIRST_OPR_INST_CD(struct.getList_FIRST_OPR_INST_CD());
			this.setList_FIRST_PROC_NO(struct.getList_FIRST_PROC_NO());
			this.setList_NEXT_WORK_ODR_CD(struct.getList_NEXT_WORK_ODR_CD());
			this.setList_NEXT_OPR_INST_CD(struct.getList_NEXT_OPR_INST_CD());
			this.setList_NEXT_PROC_NO(struct.getList_NEXT_PROC_NO());
			this.setList_NEXT_WS_CD(struct.getList_NEXT_WS_CD());
			this.setList_NEXT_WS_NAME(struct.getList_NEXT_WS_NAME());
			this.setList_NEXT_WH_NAME(struct.getList_NEXT_WH_NAME());
			this.setList_PREV_WORK_ODR_CD(struct.getList_PREV_WORK_ODR_CD());
			this.setList_PREV_OPR_INST_CD(struct.getList_PREV_OPR_INST_CD());
			this.setList_PREV_PARTIAL_PRD_NO(struct.getList_PREV_PARTIAL_PRD_NO());
			this.setList_PREV_PROC_NO(struct.getList_PREV_PROC_NO());
			this.setList_PREV_WH_CD(struct.getList_PREV_WH_CD());
			this.setList_DATA_COUNT(struct.getList_DATA_COUNT());
			this.setList_WH_CD_COUNT(struct.getList_WH_CD_COUNT());
			this.setList_FROM_PUCH_ODR_CD(struct.getList_FROM_PUCH_ODR_CD());
			this.setList_TO_PUCH_ODR_CD(struct.getList_TO_PUCH_ODR_CD());
			this.setList_FROM_ITEM_CD(struct.getList_FROM_ITEM_CD());
			this.setList_FROM_LOT_NO(struct.getList_FROM_LOT_NO());
			this.setList_TO_ITEM_CD(struct.getList_TO_ITEM_CD());
			this.setList_TO_LOT_NO(struct.getList_TO_LOT_NO());
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
	// �� 1 �ϐ������l�F i_chk_COMPLETE


	final static String i_chk_COMPLETE = null;

	// �� 2 �ϐ������l�F i_OPRATION_TIME


	final static String i_OPRATION_TIME = null;

	// �� 3 �ϐ������l�F i_chk_OUTPUT


	final static String i_chk_OUTPUT = null;

	// �� 4 �ϐ������l�F i_d1_STOCK_UNIT


	final static String i_d1_STOCK_UNIT = null;

	// �� 5 �ϐ������l�F i_OPR_TIME_UNIT_TYP_name


	final static String i_OPR_TIME_UNIT_TYP_name = null;

	// �� 6 �ϐ������l�F i_OPR_TIME_UNIT_TYP_val


	final static String i_OPR_TIME_UNIT_TYP_val = null;

	// �� 7 �ϐ������l�F i_l_DEFECT_CAUSE_CD_name


	final static String i_l_DEFECT_CAUSE_CD_name = null;

	// �� 8 �ϐ������l�F i_l_DEFECT_CAUSE_CD_val


	final static String i_l_DEFECT_CAUSE_CD_val = null;

	// �� 9 �ϐ������l�F i_MRP_ODR_TYP_DN


	final static String i_MRP_ODR_TYP_DN = null;

	// �� 10 �ϐ������l�F i_DOWNLOAD_FILE


	final static String i_DOWNLOAD_FILE = null;

	// �� 11 �ϐ������l�F i_h_FINAL_PROC_FLG


	final static String i_h_FINAL_PROC_FLG = null;

	// �� 12 �ϐ������l�F i_h_SYS_LOT_CTRL_FLG


	final static String i_h_SYS_LOT_CTRL_FLG = null;

	// �� 13 �ϐ������l�F i_chk_CHILD_RSLTUPDATE


	final static String i_chk_CHILD_RSLTUPDATE = null;

	// �� 14 �ϐ������l�F i_param1


	final static String i_param1 = null;

	// �� 15 �ϐ������l�F i_param2


	final static String i_param2 = null;

	// �� 16 �ϐ������l�F i_param3


	final static String i_param3 = null;

	// �� 17 �ϐ������l�F i_h_PROCESS_MANAGE_FLG


	final static String i_h_PROCESS_MANAGE_FLG = null;

	// �� 18 �ϐ������l�F i_TEMP_PLAN_QTY


	final static String i_TEMP_PLAN_QTY = null;

	// �� 19 �ϐ������l�F i_TEMP_USEOVER_QTY


	final static String i_TEMP_USEOVER_QTY = null;

	// �� 20 �ϐ������l�F i_TEMP_PLANOUT_QTY


	final static String i_TEMP_PLANOUT_QTY = null;

	// �� 21 �ϐ������l�F i_TEMP_USE_QTY


	final static String i_TEMP_USE_QTY = null;

	// �� 22 �ϐ������l�F i_l_PARTIAL_PRD_NO


	final static String i_l_PARTIAL_PRD_NO = null;

	// �� 23 �ϐ������l�F i_FIRST_WORK_FLG


	final static String i_FIRST_WORK_FLG = null;

	// �� 24 �ϐ������l�F i_USE_LOT_NO


	final static String i_USE_LOT_NO = null;

	// �� 25 �ϐ������l�F i_USE_ACPT_QTY


	final static String i_USE_ACPT_QTY = null;

	// �� 26 �ϐ������l�F i_USE_DEFECT_QTY


	final static String i_USE_DEFECT_QTY = null;

	// �� 27 �ϐ������l�F i_IN_OPR_INST_CD


	final static String i_IN_OPR_INST_CD = null;

	// �� 28 �ϐ������l�F i_PARTIAL_PRD_NO


	final static String i_PARTIAL_PRD_NO = null;

	// �� 29 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 30 �ϐ������l�F i_WS_CD


	final static String i_WS_CD = null;

	// �� 31 �ϐ������l�F i_WORK_IN_PROC_CD


	final static String i_WORK_IN_PROC_CD = null;

	// �� 32 �ϐ������l�F i_PROC_NAME


	final static String i_PROC_NAME = null;

	// �� 33 �ϐ������l�F i_PROC_NO


	final static String i_PROC_NO = null;

	// �� 34 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 35 �ϐ������l�F i_WORK_STS_TYP


	final static String i_WORK_STS_TYP = null;

	// �� 36 �ϐ������l�F i_WORK_ODR_CD


	final static String i_WORK_ODR_CD = null;

	// �� 37 �ϐ������l�F i_OD_NO


	final static String i_OD_NO = null;

	// �� 38 �ϐ������l�F i_OUTSIDE_TYP


	final static String i_OUTSIDE_TYP = null;

	// �� 39 �ϐ������l�F i_PROC_MODIFY_COUNT


	final static String i_PROC_MODIFY_COUNT = null;

	// �� 40 �ϐ������l�F i_FINAL_PROC_FLG


	final static String i_FINAL_PROC_FLG = null;

	// �� 41 �ϐ������l�F i_WORK_ODR_DLV_DATE


	final static String i_WORK_ODR_DLV_DATE = null;

	// �� 42 �ϐ������l�F i_OPR_INST_START_DATE


	final static String i_OPR_INST_START_DATE = null;

	// �� 43 �ϐ������l�F i_OPR_INST_QTY


	final static String i_OPR_INST_QTY = null;

	// �� 44 �ϐ������l�F i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// �� 45 �ϐ������l�F i_UNIT_QTY_TYP


	final static String i_UNIT_QTY_TYP = null;

	// �� 46 �ϐ������l�F i_DRAW_CD


	final static String i_DRAW_CD = null;

	// �� 47 �ϐ������l�F i_SPEC


	final static String i_SPEC = null;

	// �� 48 �ϐ������l�F i_MRP_ODR_TYP


	final static String i_MRP_ODR_TYP = null;

	// �� 49 �ϐ������l�F i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// �� 50 �ϐ������l�F i_LOT_NUMBERING_TYP


	final static String i_LOT_NUMBERING_TYP = null;

	// �� 51 �ϐ������l�F i_LOT_CTRL_FLG


	final static String i_LOT_CTRL_FLG = null;

	// �� 52 �ϐ������l�F i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// �� 53 �ϐ������l�F i_JOB_ODR_DETAIL_NO


	final static String i_JOB_ODR_DETAIL_NO = null;

	// �� 54 �ϐ������l�F i_JOB_ODR_CANCEL_NO


	final static String i_JOB_ODR_CANCEL_NO = null;

	// �� 55 �ϐ������l�F i_WS_NAME


	final static String i_WS_NAME = null;

	// �� 56 �ϐ������l�F i_SUM_ACPT_QTY


	final static String i_SUM_ACPT_QTY = null;

	// �� 57 �ϐ������l�F i_SUM_DEFECT_QTY


	final static String i_SUM_DEFECT_QTY = null;

	// �� 58 �ϐ������l�F i_OPR_RSLT_TYP


	final static String i_OPR_RSLT_TYP = null;

	// �� 59 �ϐ������l�F i_ITEM_MODIFY_COUNT


	final static String i_ITEM_MODIFY_COUNT = null;

	// �� 60 �ϐ������l�F i_h_OPR_DATE


	final static String i_h_OPR_DATE = null;

	// �� 61 �ϐ������l�F i_TIME_CTRL


	final static String i_TIME_CTRL = null;

	// �� 62 �ϐ������l�F i_h_BUSINESS_OPR_DATE


	final static String i_h_BUSINESS_OPR_DATE = null;

	// �� 63 �ϐ������l�F i_h_BUSINESS_OPR_TIME


	final static String i_h_BUSINESS_OPR_TIME = null;

	// �� 64 �ϐ������l�F i_FORM_SET_ITEM_CD


	final static String i_FORM_SET_ITEM_CD = null;

	// �� 65 �ϐ������l�F i_WH_NAME


	final static String i_WH_NAME = null;

	// �� 66 �ϐ������l�F i_WH_CD


	final static String i_WH_CD = null;

	// �� 67 �ϐ������l�F i_PROC_EXEC_DATE


	final static BigDecimal i_PROC_EXEC_DATE = null;

	// �� 68 �ϐ������l�F i_PAST_RESULT_ENTRY_TYP


	final static String i_PAST_RESULT_ENTRY_TYP = null;

	// �� 69 �ϐ������l�F i_LOT_NO


	final static String i_LOT_NO = null;

	// �� 70 �ϐ������l�F i_ACPT_QTY


	final static String i_ACPT_QTY = null;

	// �� 71 �ϐ������l�F i_DEFECT_QTY


	final static String i_DEFECT_QTY = null;

	// �� 72 �ϐ������l�F i_OPR_DATE


	final static String i_OPR_DATE = null;

	// �� 73 �ϐ������l�F i_OPR_RSLT_PERSON


	final static String i_OPR_RSLT_PERSON = null;

	// �� 74 �ϐ������l�F i_OPR_RSLT_COMMENT


	final static String i_OPR_RSLT_COMMENT = null;

	// �� 75 �ϐ������l�F i_OPR_TIME_UNIT_TYP


	final static String i_OPR_TIME_UNIT_TYP = null;

	// �� 76 �ϐ������l�F i_PRE_ARRANGEMENT_TIME


	final static String i_PRE_ARRANGEMENT_TIME = null;

	// �� 77 �ϐ������l�F i_POST_ARRANGEMENT_TIME


	final static String i_POST_ARRANGEMENT_TIME = null;

	// �� 78 �ϐ������l�F i_OPR_TIME


	final static String i_OPR_TIME = null;

	// �� 79 �ϐ������l�F i_CESSATION_TIME


	final static String i_CESSATION_TIME = null;

	// �� 80 �ϐ������l�F i_CESSATION_CAUSE


	final static String i_CESSATION_CAUSE = null;

	// �� 81 �ϐ������l�F i_OUTPUT_RSLT_CD


	final static String i_OUTPUT_RSLT_CD = null;

	// �� 82 �ϐ������l�F i_VEND_LOT_NO


	final static String i_VEND_LOT_NO = null;

	// �� 83 �ϐ������l�F i_OPR_CRCT_NO


	final static String i_OPR_CRCT_NO = null;

	// �� 84 �ϐ������l�F i_UPDATE_WORK_STS_TYP


	final static String i_UPDATE_WORK_STS_TYP = null;

	// �� 85 �ϐ������l�F i_JOB_ODR_TYP


	final static String i_JOB_ODR_TYP = null;

	// �� 86 �ϐ������l�F i_RCV_ISSUE_CTRL_CD


	final static String i_RCV_ISSUE_CTRL_CD = null;

	// �� 87 �ϐ������l�F i_RCV_ISSUE_TYP


	final static String i_RCV_ISSUE_TYP = null;

	// �� 88 �ϐ������l�F i_OPR_RSLT_CRCT_NO


	final static String i_OPR_RSLT_CRCT_NO = null;

	// �� 89 �ϐ������l�F i_h_ISSUE_INST_CD


	final static String i_h_ISSUE_INST_CD = null;

	// �� 90 �ϐ������l�F i_SAVE_STOCK_ON_HAND_QTY


	final static String i_SAVE_STOCK_ON_HAND_QTY = null;

	// �� 91 �ϐ������l�F i_RCV_ISSUE_QTY


	final static String i_RCV_ISSUE_QTY = null;

	// �� 92 �ϐ������l�F i_RCV_ISSUE_DATE


	final static String i_RCV_ISSUE_DATE = null;

	// �� 93 �ϐ������l�F i_RCV_ISSUE_GNR_TYP


	final static String i_RCV_ISSUE_GNR_TYP = null;

	// �� 94 �ϐ������l�F i_RCV_ISSUE_ODD_QTY


	final static String i_RCV_ISSUE_ODD_QTY = null;

	// �� 95 �ϐ������l�F i_STOCK_UPD_TYP


	final static String i_STOCK_UPD_TYP = null;

	// �� 96 �ϐ������l�F i_RCV_ISSUE_COMMENT


	final static String i_RCV_ISSUE_COMMENT = null;

	// �� 97 �ϐ������l�F i_RCV_ISSUE_CMPLT_FLG


	final static String i_RCV_ISSUE_CMPLT_FLG = null;

	// �� 98 �ϐ������l�F i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// �� 99 �ϐ������l�F i_MANHOUR_TYP


	final static String i_MANHOUR_TYP = null;

	// �� 100 �ϐ������l�F i_PARENT_OD_NO


	final static String i_PARENT_OD_NO = null;

	// �� 101 �ϐ������l�F i_PARENT_OUTSIDE_TYP


	final static String i_PARENT_OUTSIDE_TYP = null;

	// �� 102 �ϐ������l�F i_PARENT_MRP_ODR_TYP


	final static String i_PARENT_MRP_ODR_TYP = null;

	// �� 103 �ϐ������l�F i_PARENT_WORK_ODR_CD


	final static String i_PARENT_WORK_ODR_CD = null;

	// �� 104 �ϐ������l�F i_PARENT_WORK_IN_PROC_CD


	final static String i_PARENT_WORK_IN_PROC_CD = null;

	// �� 105 �ϐ������l�F i_PARENT_PUCH_ODR_CD


	final static String i_PARENT_PUCH_ODR_CD = null;

	// �� 106 �ϐ������l�F i_PUCH_ODR_CD


	final static String i_PUCH_ODR_CD = null;

	// �� 107 �ϐ������l�F i_UPDATED_PRG_NM


	final static String i_UPDATED_PRG_NM = null;

	// �� 108 �ϐ������l�F i_ACPT_NO


	final static String i_ACPT_NO = null;

	// �� 109 �ϐ������l�F i_ISSUE_INST_CD


	final static String i_ISSUE_INST_CD = null;

	// �� 110 �ϐ������l�F i_GET_IDENT_CARD_CTL_NO


	final static String i_GET_IDENT_CARD_CTL_NO = null;

	// �� 111 �ϐ������l�F i_SEL_OPR_INST_CD


	final static String i_SEL_OPR_INST_CD = null;

	// �� 112 �ϐ������l�F i_SEL_PARTIAL_PRD_NO


	final static String i_SEL_PARTIAL_PRD_NO = null;

	// �� 113 �ϐ������l�F i_SEL_ITEM_CD


	final static String i_SEL_ITEM_CD = null;

	// �� 114 �ϐ������l�F i_SEL_ACPT_QTY


	final static String i_SEL_ACPT_QTY = null;

	// �� 115 �ϐ������l�F i_SEL_OPR_DATE


	final static String i_SEL_OPR_DATE = null;

	// �� 116 �ϐ������l�F i_SEL_PKG_UNIT_QTY


	final static String i_SEL_PKG_UNIT_QTY = null;

	// �� 117 �ϐ������l�F i_SEL_PLANT_CD


	final static String i_SEL_PLANT_CD = null;

	// �� 118 �ϐ������l�F i_SEL_WS_CD


	final static String i_SEL_WS_CD = null;

	// �� 119 �ϐ������l�F i_INS_IDENT_CARD_CTL_NO


	final static String i_INS_IDENT_CARD_CTL_NO = null;

	// �� 120 �ϐ������l�F i_INS_OPR_INST_CD


	final static String i_INS_OPR_INST_CD = null;

	// �� 121 �ϐ������l�F i_INS_PARTIAL_PRD_NO


	final static String i_INS_PARTIAL_PRD_NO = null;

	// �� 122 �ϐ������l�F i_INS_RCV_ISSUE_CTRL_CD


	final static String i_INS_RCV_ISSUE_CTRL_CD = null;

	// �� 123 �ϐ������l�F i_INS_ITEM_CD


	final static String i_INS_ITEM_CD = null;

	// �� 124 �ϐ������l�F i_INS_JOB_ODR_CD


	final static String i_INS_JOB_ODR_CD = null;

	// �� 125 �ϐ������l�F i_INS_FIRST_IDENT_CARD_QTY


	final static String i_INS_FIRST_IDENT_CARD_QTY = null;

	// �� 126 �ϐ������l�F i_INS_IDENT_CARD_QTY


	final static String i_INS_IDENT_CARD_QTY = null;

	// �� 127 �ϐ������l�F i_INS_OPR_DATE


	final static String i_INS_OPR_DATE = null;

	// �� 128 �ϐ������l�F i_INS_PKG_UNIT_QTY


	final static String i_INS_PKG_UNIT_QTY = null;

	// �� 129 �ϐ������l�F i_INS_PLANT_CD


	final static String i_INS_PLANT_CD = null;

	// �� 130 �ϐ������l�F i_INS_WS_CD


	final static String i_INS_WS_CD = null;

	// �� 131 �ϐ������l�F i_OPR_INST_CD


	final static String i_OPR_INST_CD = null;

	// �� 132 �ϐ������l�F i_l_DEFECT_CAUSE_CD


	final static String i_l_DEFECT_CAUSE_CD = null;

	// �� 133 �ϐ������l�F i_l_DEFECT_QTY


	final static String i_l_DEFECT_QTY = null;

	// �� 134 �ϐ������l�F i_l_DEFECT_COMMENT


	final static String i_l_DEFECT_COMMENT = null;

	// �� 135 �ϐ������l�F i_RSLT_CTRL_SEQ_NO


	final static String i_RSLT_CTRL_SEQ_NO = null;

	// �� 136 �ϐ������l�F i_SUPPLIED_ISSUE_QTY


	final static String i_SUPPLIED_ISSUE_QTY = null;

	// �� 137 �ϐ������l�F i_SUPPLIED_ISSUE_QTY_sum


	final static String i_SUPPLIED_ISSUE_QTY_sum = null;

	// �� 138 �ϐ������l�F i_h_ISSUE_INST_UNIT_DENOMINATOR


	final static String i_h_ISSUE_INST_UNIT_DENOMINATOR = null;

	// �� 139 �ϐ������l�F i_h_ISSUE_INST_UNIT_NUMERATOR


	final static String i_h_ISSUE_INST_UNIT_NUMERATOR = null;

	// �� 140 �ϐ������l�F i_count_RCV_ISSUE


	final static String i_count_RCV_ISSUE = null;

	// �� 141 �ϐ������l�F i_STOCK_ON_HAND_QTY


	final static String i_STOCK_ON_HAND_QTY = null;

	// �� 142 �ϐ������l�F i_ISSUE_QTY


	final static String i_ISSUE_QTY = null;

	// �� 143 �ϐ������l�F i_ISSUE_DATE


	final static String i_ISSUE_DATE = null;

	// �� 144 �ϐ������l�F i_SPENT_QTY


	final static String i_SPENT_QTY = null;

	// �� 145 �ϐ������l�F i_NEXTVAL


	final static String i_NEXTVAL = null;

	// �� 146 �ϐ������l�F i_RSLT_CTL_SEQ_NO


	final static String i_RSLT_CTL_SEQ_NO = null;

	// �� 147 �ϐ������l�F i_TOTAL_ISSUE_QTY


	final static String i_TOTAL_ISSUE_QTY = null;

	// �� 148 �ϐ������l�F i_PART_SUPPLIED_COMMENT


	final static String i_PART_SUPPLIED_COMMENT = null;

	// �� 149 �ϐ������l�F i_SUPPLIED_DATE


	final static String i_SUPPLIED_DATE = null;

	// �� 150 �ϐ������l�F i_ALCD_QTY


	final static String i_ALCD_QTY = null;

	// �� 151 �ϐ������l�F i_TMP_IDENT_CARD_CTL_NO


	final static String i_TMP_IDENT_CARD_CTL_NO = null;

	// �� 152 �ϐ������l�F i_TMP_OPR_INST_CD


	final static String i_TMP_OPR_INST_CD = null;

	// �� 153 �ϐ������l�F i_TMP_PARTIAL_PRD_NO


	final static String i_TMP_PARTIAL_PRD_NO = null;

	// �� 154 �ϐ������l�F i_TMP_RCV_ISSUE_CTRL_CD


	final static String i_TMP_RCV_ISSUE_CTRL_CD = null;

	// �� 155 �ϐ������l�F i_TMP_ITEM_CD


	final static String i_TMP_ITEM_CD = null;

	// �� 156 �ϐ������l�F i_TMP_JOB_ODR_CD


	final static String i_TMP_JOB_ODR_CD = null;

	// �� 157 �ϐ������l�F i_TMP_FIRST_IDENT_CARD_QTY


	final static String i_TMP_FIRST_IDENT_CARD_QTY = null;

	// �� 158 �ϐ������l�F i_TMP_IDENT_CARD_QTY


	final static String i_TMP_IDENT_CARD_QTY = null;

	// �� 159 �ϐ������l�F i_TMP_OPR_DATE


	final static String i_TMP_OPR_DATE = null;

	// �� 160 �ϐ������l�F i_TMP_PKG_UNIT_QTY


	final static String i_TMP_PKG_UNIT_QTY = null;

	// �� 161 �ϐ������l�F i_TMP_PLANT_CD


	final static String i_TMP_PLANT_CD = null;

	// �� 162 �ϐ������l�F i_TMP_WS_CD


	final static String i_TMP_WS_CD = null;

	// �� 163 �ϐ������l�F i_INS_PRINT_GRP_NO


	final static String i_INS_PRINT_GRP_NO = null;

	// �� 164 �ϐ������l�F i_INS_PAGE_NO


	final static String i_INS_PAGE_NO = null;

	// �� 165 �ϐ������l�F i_INS_PRINT_QTY


	final static String i_INS_PRINT_QTY = null;

	// �� 166 �ϐ������l�F i_DM_STS_TYP


	final static String i_DM_STS_TYP = null;

	// �� 167 �ϐ������l�F i_ISSUE_CMPLT_DATE


	final static String i_ISSUE_CMPLT_DATE = null;

	// �� 168 �ϐ������l�F i_USER_CD


	final static String i_USER_CD = null;

	// �� 169 �ϐ������l�F i_PRODUCT_TYP


	final static String i_PRODUCT_TYP = null;

	// �� 170 �ϐ������l�F i_WH_TYP


	final static String i_WH_TYP = null;

	// �� 171 �ϐ������l�F i_NEXT_WH_CD


	final static String i_NEXT_WH_CD = null;

	// �� 172 �ϐ������l�F i_FIRST_OPR_INST_CD


	final static String i_FIRST_OPR_INST_CD = null;

	// �� 173 �ϐ������l�F i_FIRST_PROC_NO


	final static String i_FIRST_PROC_NO = null;

	// �� 174 �ϐ������l�F i_NEXT_WORK_ODR_CD


	final static String i_NEXT_WORK_ODR_CD = null;

	// �� 175 �ϐ������l�F i_NEXT_OPR_INST_CD


	final static String i_NEXT_OPR_INST_CD = null;

	// �� 176 �ϐ������l�F i_NEXT_PROC_NO


	final static String i_NEXT_PROC_NO = null;

	// �� 177 �ϐ������l�F i_NEXT_WS_CD


	final static String i_NEXT_WS_CD = null;

	// �� 178 �ϐ������l�F i_NEXT_WS_NAME


	final static String i_NEXT_WS_NAME = null;

	// �� 179 �ϐ������l�F i_NEXT_WH_NAME


	final static String i_NEXT_WH_NAME = null;

	// �� 180 �ϐ������l�F i_PREV_WORK_ODR_CD


	final static String i_PREV_WORK_ODR_CD = null;

	// �� 181 �ϐ������l�F i_PREV_OPR_INST_CD


	final static String i_PREV_OPR_INST_CD = null;

	// �� 182 �ϐ������l�F i_PREV_PARTIAL_PRD_NO


	final static String i_PREV_PARTIAL_PRD_NO = null;

	// �� 183 �ϐ������l�F i_PREV_PROC_NO


	final static String i_PREV_PROC_NO = null;

	// �� 184 �ϐ������l�F i_PREV_WH_CD


	final static String i_PREV_WH_CD = null;

	// �� 185 �ϐ������l�F i_DATA_COUNT


	final static String i_DATA_COUNT = null;

	// �� 186 �ϐ������l�F i_WH_CD_COUNT


	final static String i_WH_CD_COUNT = null;

	// �� 187 �ϐ������l�F i_FROM_PUCH_ODR_CD


	final static String i_FROM_PUCH_ODR_CD = null;

	// �� 188 �ϐ������l�F i_TO_PUCH_ODR_CD


	final static String i_TO_PUCH_ODR_CD = null;

	// �� 189 �ϐ������l�F i_FROM_ITEM_CD


	final static String i_FROM_ITEM_CD = null;

	// �� 190 �ϐ������l�F i_FROM_LOT_NO


	final static String i_FROM_LOT_NO = null;

	// �� 191 �ϐ������l�F i_TO_ITEM_CD


	final static String i_TO_ITEM_CD = null;

	// �� 192 �ϐ������l�F i_TO_LOT_NO


	final static String i_TO_LOT_NO = null;

*/

	//{{user_implement_code
		// TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
		// �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
	// �� 1 �ϐ������l�F i_chk_COMPLETE

	final static String i_chk_COMPLETE = null;

	// �� 2 �ϐ������l�F i_OPRATION_TIME

	final static String i_OPRATION_TIME = null;

	// �� 3 �ϐ������l�F i_chk_OUTPUT

	final static String i_chk_OUTPUT = null;

	// �� 4 �ϐ������l�F i_ACPT_QTY

	final static String i_ACPT_QTY = null;

	// �� 5 �ϐ������l�F i_STOCK_UNIT

	final static String i_STOCK_UNIT = null;

	// �� 6 �ϐ������l�F i_SUM_ACPT_QTY

	final static String i_SUM_ACPT_QTY = null;

	// �� 7 �ϐ������l�F i_DEFECT_QTY

	final static String i_DEFECT_QTY = null;

	// �� 8 �ϐ������l�F i_d1_STOCK_UNIT

	final static String i_d1_STOCK_UNIT = null;

	// �� 9 �ϐ������l�F i_SUM_DEFECT_QTY

	final static String i_SUM_DEFECT_QTY = null;

	// �� 10 �ϐ������l�F i_OPR_TIME_UNIT_TYP

	final static String i_OPR_TIME_UNIT_TYP = null;

	// �� 11 �ϐ������l�F i_OPR_TIME_UNIT_TYP_name

	final static String i_OPR_TIME_UNIT_TYP_name = null;

	// �� 12 �ϐ������l�F i_OPR_TIME_UNIT_TYP_val

	final static String i_OPR_TIME_UNIT_TYP_val = null;

	// �� 13 �ϐ������l�F i_l_DEFECT_CAUSE_CD

	final static String i_l_DEFECT_CAUSE_CD = null;

	// �� 14 �ϐ������l�F i_l_DEFECT_CAUSE_CD_name

	final static String i_l_DEFECT_CAUSE_CD_name = null;

	// �� 15 �ϐ������l�F i_l_DEFECT_CAUSE_CD_val

	final static String i_l_DEFECT_CAUSE_CD_val = null;

	// �� 16 �ϐ������l�F i_MRP_ODR_TYP_DN

	final static String i_MRP_ODR_TYP_DN = null;

	// �� 17 �ϐ������l�F i_IN_OPR_INST_CD

	final static String i_IN_OPR_INST_CD = null;

	// �� 18 �ϐ������l�F i_PARTIAL_PRD_NO

	final static String i_PARTIAL_PRD_NO = null;

	// �� 19 �ϐ������l�F i_OPR_DATE

	final static String i_OPR_DATE = null;

	// �� 20 �ϐ������l�F i_WH_CD

	final static String i_WH_CD = null;

	// �� 21 �ϐ������l�F i_LOT_NO

	final static String i_LOT_NO = null;

	// �� 22 �ϐ������l�F i_VEND_LOT_NO

	final static String i_VEND_LOT_NO = null;

	// �� 23 �ϐ������l�F i_OPR_RSLT_PERSON

	final static String i_OPR_RSLT_PERSON = null;

	// �� 24 �ϐ������l�F i_PRE_ARRANGEMENT_TIME

	final static String i_PRE_ARRANGEMENT_TIME = null;

	// �� 25 �ϐ������l�F i_OPR_TIME

	final static String i_OPR_TIME = null;

	// �� 26 �ϐ������l�F i_POST_ARRANGEMENT_TIME

	final static String i_POST_ARRANGEMENT_TIME = null;

	// �� 27 �ϐ������l�F i_CESSATION_TIME

	final static String i_CESSATION_TIME = null;

	// �� 28 �ϐ������l�F i_CESSATION_CAUSE

	final static String i_CESSATION_CAUSE = null;

	// �� 29 �ϐ������l�F i_OPR_RSLT_COMMENT

	final static String i_OPR_RSLT_COMMENT = null;

	// �� 30 �ϐ������l�F i_ITEM_CD

	final static String i_ITEM_CD = null;

	// �� 31 �ϐ������l�F i_WORK_IN_PROC_CD

	final static String i_WORK_IN_PROC_CD = null;

	// �� 32 �ϐ������l�F i_PROC_NAME

	final static String i_PROC_NAME = null;

	// �� 33 �ϐ������l�F i_OPR_INST_QTY

	final static String i_OPR_INST_QTY = null;

	// �� 34 �ϐ������l�F i_WS_CD

	final static String i_WS_CD = null;

	// �� 35 �ϐ������l�F i_WORK_ODR_DLV_DATE

	final static String i_WORK_ODR_DLV_DATE = null;

	// �� 36 �ϐ������l�F i_OPR_INST_START_DATE

	final static String i_OPR_INST_START_DATE = null;

	// �� 37 �ϐ������l�F i_ITEM_NAME

	final static String i_ITEM_NAME = null;

	// �� 38 �ϐ������l�F i_DRAW_CD

	final static String i_DRAW_CD = null;

	// �� 39 �ϐ������l�F i_SPEC

	final static String i_SPEC = null;

	// �� 40 �ϐ������l�F i_WH_NAME

	final static String i_WH_NAME = null;

	// �� 41 �ϐ������l�F i_WS_NAME

	final static String i_WS_NAME = null;

	// �� 42 �ϐ������l�F i_l_DEFECT_QTY

	final static String i_l_DEFECT_QTY = null;

	// �� 43 �ϐ������l�F i_l_DEFECT_COMMENT

	final static String i_l_DEFECT_COMMENT = null;

	// �� 44 �ϐ������l�F i_JOB_ODR_CD

	final static String i_JOB_ODR_CD = null;

	// �� 45 �ϐ������l�F i_PLANT_CD

	final static String i_PLANT_CD = null;

	// �� 46 �ϐ������l�F i_OPR_RSLT_TYP

	final static String i_OPR_RSLT_TYP = null;

	// �� 47 �ϐ������l�F i_WORK_STS_TYP

	final static String i_WORK_STS_TYP = null;


	/**
	 * ������
	 *
	 */
	public void initialize()
	{

		clear();

		m_chk_COMPLETE = i_chk_COMPLETE;
		m_OPRATION_TIME = i_OPRATION_TIME;
		m_chk_OUTPUT = i_chk_OUTPUT;
		m_ACPT_QTY = i_ACPT_QTY;
		m_STOCK_UNIT = i_STOCK_UNIT;
		m_SUM_ACPT_QTY = i_SUM_ACPT_QTY;
		m_DEFECT_QTY = i_DEFECT_QTY;
		m_d1_STOCK_UNIT = i_d1_STOCK_UNIT;
		m_SUM_DEFECT_QTY = i_SUM_DEFECT_QTY;
		m_OPR_TIME_UNIT_TYP = i_OPR_TIME_UNIT_TYP;
		m_OPR_TIME_UNIT_TYP_name = i_OPR_TIME_UNIT_TYP_name;
		m_OPR_TIME_UNIT_TYP_val = i_OPR_TIME_UNIT_TYP_val;
		m_l_DEFECT_CAUSE_CD = i_l_DEFECT_CAUSE_CD;
		m_l_DEFECT_CAUSE_CD_name = i_l_DEFECT_CAUSE_CD_name;
		m_l_DEFECT_CAUSE_CD_val = i_l_DEFECT_CAUSE_CD_val;
		m_MRP_ODR_TYP_DN = i_MRP_ODR_TYP_DN;
		m_IN_OPR_INST_CD = i_IN_OPR_INST_CD;
		m_PARTIAL_PRD_NO = i_PARTIAL_PRD_NO;
		m_OPR_DATE = i_OPR_DATE;
		m_WH_CD = i_WH_CD;
		m_LOT_NO = i_LOT_NO;
		m_VEND_LOT_NO = i_VEND_LOT_NO;
		m_OPR_RSLT_PERSON = i_OPR_RSLT_PERSON;
		m_PRE_ARRANGEMENT_TIME = i_PRE_ARRANGEMENT_TIME;
		m_OPR_TIME = i_OPR_TIME;
		m_POST_ARRANGEMENT_TIME = i_POST_ARRANGEMENT_TIME;
		m_CESSATION_TIME = i_CESSATION_TIME;
		m_CESSATION_CAUSE = i_CESSATION_CAUSE;
		m_OPR_RSLT_COMMENT = i_OPR_RSLT_COMMENT;
		m_ITEM_CD = i_ITEM_CD;
		m_WORK_IN_PROC_CD = i_WORK_IN_PROC_CD;
		m_PROC_NAME = i_PROC_NAME;
		m_OPR_INST_QTY = i_OPR_INST_QTY;
		m_WS_CD = i_WS_CD;
		m_WORK_ODR_DLV_DATE = i_WORK_ODR_DLV_DATE;
		m_OPR_INST_START_DATE = i_OPR_INST_START_DATE;
		m_ITEM_NAME = i_ITEM_NAME;
		m_DRAW_CD = i_DRAW_CD;
		m_SPEC = i_SPEC;
		m_WH_NAME = i_WH_NAME;
		m_WS_NAME = i_WS_NAME;
		m_l_DEFECT_QTY = i_l_DEFECT_QTY;
		m_l_DEFECT_COMMENT = i_l_DEFECT_COMMENT;
		m_JOB_ODR_CD = i_JOB_ODR_CD;
		m_PLANT_CD = i_PLANT_CD;
		m_OPR_RSLT_TYP = i_OPR_RSLT_TYP;
		m_WORK_STS_TYP = i_WORK_STS_TYP;
	}
		// TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
