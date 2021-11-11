/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0100/src/com/nec/jp/orteus/metamorBase/AE0100/AE0100010Struct.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0100;

import com.nec.jp.orteus.xaf.wa.*;

import com.nec.jp.orteus.util.logging.*;

import java.lang.Number.*;
import java.lang.Float;
import java.util.*;
import java.sql.*;
import java.io.*;

//{{user_implement_code_import
	// TODO: ������import�p�b�P�[�W���L�q���Ă�������
import java.math.BigDecimal;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AE0100010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: zhou-kehong $
 * @version $Revision: 1.11 $ $Date: 2014/12/03 07:53:02 $
 *
 */
//}}user_implement_code_header

public class AE0100010Struct extends DataStruct
{

	//////////////////////////////

	/** �� 1 �ϐ��F m_UNIT_COST_TYP_name */
	public String m_UNIT_COST_TYP_name = null;
	/** �� 2 �ϐ��F m_UNIT_COST_TYP_val */
	public String m_UNIT_COST_TYP_val = null;
	/** �� 3 �ϐ��F m_SelectUnitCostFlag */
	public String m_SelectUnitCostFlag = null;
	/** �� 4 �ϐ��F m_r1_FILTER */
	public String m_r1_FILTER = null;
	/** �� 5 �ϐ��F m_PUCH_ODR_AMOUNT */
	public String m_PUCH_ODR_AMOUNT = null;
	/** �� 6 �ϐ��F m_r2_FILTER */
	public String m_r2_FILTER = null;
	/** �� 7 �ϐ��F m_r3_FILTER */
	public String m_r3_FILTER = null;
	/** �� 8 �ϐ��F m_c_ONEROUS_CONS_INV_TYP */
	public String m_c_ONEROUS_CONS_INV_TYP = null;
	/** �� 9 �ϐ��F m_h_ONEROUS_CONS_NO */
	public String m_h_ONEROUS_CONS_NO = null;
	/** �� 10 �ϐ��F m_h_ISSUE_DATE */
	public String m_h_ISSUE_DATE = null;
	/** �� 11 �ϐ��F m_h_LOT_NO_2 */
	public String m_h_LOT_NO_2 = null;
	/** �� 12 �ϐ��F m_h_LOTCTRL */
	public String m_h_LOTCTRL = null;
	/** �� 13 �ϐ��F m_ONEROUS_CONS_NO */
	public String m_ONEROUS_CONS_NO = null;
	/** �� 14 �ϐ��F m_COMPANY_CD */
	public String m_COMPANY_CD = null;
	/** �� 15 �ϐ��F m_VEND_CD */
	public String m_VEND_CD = null;
	/** �� 16 �ϐ��F m_VEND_ANAME */
	public String m_VEND_ANAME = null;
	/** �� 17 �ϐ��F m_ROUND_TYP */
	public String m_ROUND_TYP = null;
	/** �� 18 �ϐ��F m_VEND_CUR_UNIT */
	public String m_VEND_CUR_UNIT = null;
	/** �� 19 �ϐ��F m_VEND_DECIMAL_FIG */
	public String m_VEND_DECIMAL_FIG = null;
	/** �� 20 �ϐ��F m_PLANT_CD */
	public String m_PLANT_CD = null;
	/** �� 21 �ϐ��F m_JOB_ODR_CD */
	public String m_JOB_ODR_CD = null;
	/** �� 22 �ϐ��F m_JOB_ODR_DETAIL_NO */
	public String m_JOB_ODR_DETAIL_NO = null;
	/** �� 23 �ϐ��F m_ITEM_CD */
	public String m_ITEM_CD = null;
	/** �� 24 �ϐ��F m_ITEM_NAME */
	public String m_ITEM_NAME = null;
	/** �� 25 �ϐ��F m_ISSUE_DATE */
	public String m_ISSUE_DATE = null;
	/** �� 26 �ϐ��F m_ISSUE_QTY */
	public String m_ISSUE_QTY = null;
	/** �� 27 �ϐ��F m_UNIT_COST */
	public String m_UNIT_COST = null;
	/** �� 28 �ϐ��F m_UNIT_COST_TYP */
	public String m_UNIT_COST_TYP = null;
	/** �� 29 �ϐ��F m_ONEROUS_CONS_COMMENT */
	public String m_ONEROUS_CONS_COMMENT = null;
	/** �� 30 �ϐ��F m_LOT_NO */
	public String m_LOT_NO = null;
	/** �� 31 �ϐ��F m_VEND_LOT_NO */
	public String m_VEND_LOT_NO = null;
	/** �� 32 �ϐ��F m_RCV_ISSUE_CTRL_CD */
	public String m_RCV_ISSUE_CTRL_CD = null;
	/** �� 33 �ϐ��F m_WORK_ODR_CD */
	public String m_WORK_ODR_CD = null;
	/** �� 34 �ϐ��F m_WORK_IN_PROC_CD */
	public String m_WORK_IN_PROC_CD = null;
	/** �� 35 �ϐ��F m_PUCH_ODR_CD */
	public String m_PUCH_ODR_CD = null;
	/** �� 36 �ϐ��F m_ISSUE_INST_CD */
	public String m_ISSUE_INST_CD = null;
	/** �� 37 �ϐ��F m_RETURNED_WH_CD */
	public String m_RETURNED_WH_CD = null;
	/** �� 38 �ϐ��F m_WH_NAME */
	public String m_WH_NAME = null;
	/** �� 39 �ϐ��F m_RETURNED_CAUSE_CD */
	public String m_RETURNED_CAUSE_CD = null;
	/** �� 40 �ϐ��F m_RETURNED_GNR_TYP */
	public String m_RETURNED_GNR_TYP = null;
	/** �� 41 �ϐ��F m_AP_PROC_TYP */
	public String m_AP_PROC_TYP = null;
	/** �� 42 �ϐ��F m_MODIFY_COUNT */
	public String m_MODIFY_COUNT = null;
	/** �� 43 �ϐ��F m_STOCK_UNIT */
	public String m_STOCK_UNIT = null;
	/** �� 44 �ϐ��F m_h_LOT_CTRL_FLG */
	public String m_h_LOT_CTRL_FLG = null;
	/** �� 45 �ϐ��F m_h_LOT_NUMBERING_TYP */
	public String m_h_LOT_NUMBERING_TYP = null;
	/** �� 46 �ϐ��F m_THIS_MONTH */
	public String m_THIS_MONTH = null;
	/** �� 47 �ϐ��F m_INSTALL_FLG */
	public String m_INSTALL_FLG = null;
	/** �� 48 �ϐ��F m_UNIT_QTY_TYP */
	public String m_UNIT_QTY_TYP = null;
	/** �� 49 �ϐ��F m_SPL_ITEM_TYP */
	public String m_SPL_ITEM_TYP = null;
	/** �� 50 �ϐ��F m_PRODUCT_TYP */
	public String m_PRODUCT_TYP = null;
	/** �� 51 �ϐ��F m_CLASIFICATION_CD */
	public String m_CLASIFICATION_CD = null;
	/** �� 52 �ϐ��F m_MRP_ODR_TYP */
	public String m_MRP_ODR_TYP = null;
	/** �� 53 �ϐ��F m_WH_CD */
	public String m_WH_CD = null;
	/** �� 54 �ϐ��F m_PROCESSING_COST */
	public String m_PROCESSING_COST = null;
	/** �� 55 �ϐ��F m_MATERIAL_COST */
	public String m_MATERIAL_COST = null;
	/** �� 56 �ϐ��F m_OTHER_OVERHEADS */
	public String m_OTHER_OVERHEADS = null;
	/** �� 57 �ϐ��F m_MRP_FLG */
	public String m_MRP_FLG = null;
	/** �� 58 �ϐ��F m_VALUE */
	public String m_VALUE = null;
	/** �� 59 �ϐ��F m_NAME */
	public String m_NAME = null;
	/** �� 60 �ϐ��F m_EFF_PHASE_IN_DATE */
	public String m_EFF_PHASE_IN_DATE = null;
	/** �� 61 �ϐ��F m_ONEROUS_FLG */
	public String m_ONEROUS_FLG = null;
	/** �� 62 �ϐ��F m_STOCK_ON_HAND_QTY */
	public String m_STOCK_ON_HAND_QTY = null;
	/** �� 63 �ϐ��F m_RCV_ISSUE_TYP */
	public String m_RCV_ISSUE_TYP = null;
	/** �� 64 �ϐ��F m_ACPT_NO */
	public String m_ACPT_NO = null;
	/** �� 65 �ϐ��F m_ACPT_RSLT_CRCT_NO */
	public String m_ACPT_RSLT_CRCT_NO = null;
	/** �� 66 �ϐ��F m_INSPEC_RSLT_CRCT_NO */
	public String m_INSPEC_RSLT_CRCT_NO = null;
	/** �� 67 �ϐ��F m_PARTIAL_PRD_NO */
	public String m_PARTIAL_PRD_NO = null;
	/** �� 68 �ϐ��F m_OPR_RSLT_CRCT_NO */
	public String m_OPR_RSLT_CRCT_NO = null;
	/** �� 69 �ϐ��F m_RCV_ISSUE_BEFORE_QTY */
	public String m_RCV_ISSUE_BEFORE_QTY = null;
	/** �� 70 �ϐ��F m_RCV_ISSUE_QTY */
	public String m_RCV_ISSUE_QTY = null;
	/** �� 71 �ϐ��F m_RCV_ISSUE_AFTER_QTY */
	public String m_RCV_ISSUE_AFTER_QTY = null;
	/** �� 72 �ϐ��F m_RCV_ISSUE_AMOUNT */
	public String m_RCV_ISSUE_AMOUNT = null;
	/** �� 73 �ϐ��F m_RCV_ISSUE_DATE */
	public String m_RCV_ISSUE_DATE = null;
	/** �� 74 �ϐ��F m_RCV_ISSUE_GNR_TYP */
	public String m_RCV_ISSUE_GNR_TYP = null;
	/** �� 75 �ϐ��F m_RCV_ISSUE_ODD_QTY */
	public String m_RCV_ISSUE_ODD_QTY = null;
	/** �� 76 �ϐ��F m_STOCK_UPD_TYP */
	public String m_STOCK_UPD_TYP = null;
	/** �� 77 �ϐ��F m_RCV_ISSUE_CMPLT_FLG */
	public String m_RCV_ISSUE_CMPLT_FLG = null;
	/** �� 78 �ϐ��F m_CONS_TYP */
	public String m_CONS_TYP = null;
	/** �� 79 �ϐ��F m_PAST_RESULT_ENTRY_TYP */
	public String m_PAST_RESULT_ENTRY_TYP = null;
	/** �� 80 �ϐ��F m_PROC_EXEC_DATE */
	public BigDecimal m_PROC_EXEC_DATE = null;
	/** �� 81 �ϐ��F m_BEST_BEFORE_DATE */
	public String m_BEST_BEFORE_DATE = null;
	/** �� 82 �ϐ��F m_LOT_MODIFY_COUNT */
	public String m_LOT_MODIFY_COUNT = null;
	/** �� 83 �ϐ��F m_DEL_FLG */
	public String m_DEL_FLG = null;
	/** �� 84 �ϐ��F m_PRD_CMPLT_DATE */
	public String m_PRD_CMPLT_DATE = null;
	/** �� 85 �ϐ��F m_LOT_STOCK_ON_HAND_QTY */
	public String m_LOT_STOCK_ON_HAND_QTY = null;

	// List�^�����o�ϐ���`

	/** �� 1 List�ϐ��F l_UNIT_COST_TYP_name */
	public List l_UNIT_COST_TYP_name = null;

	/** �� 2 List�ϐ��F l_UNIT_COST_TYP_val */
	public List l_UNIT_COST_TYP_val = null;

	/** �� 3 List�ϐ��F l_SelectUnitCostFlag */
	public List l_SelectUnitCostFlag = null;

	/** �� 4 List�ϐ��F l_r1_FILTER */
	public List l_r1_FILTER = null;

	/** �� 5 List�ϐ��F l_PUCH_ODR_AMOUNT */
	public List l_PUCH_ODR_AMOUNT = null;

	/** �� 6 List�ϐ��F l_r2_FILTER */
	public List l_r2_FILTER = null;

	/** �� 7 List�ϐ��F l_r3_FILTER */
	public List l_r3_FILTER = null;

	/** �� 8 List�ϐ��F l_c_ONEROUS_CONS_INV_TYP */
	public List l_c_ONEROUS_CONS_INV_TYP = null;

	/** �� 9 List�ϐ��F l_h_ONEROUS_CONS_NO */
	public List l_h_ONEROUS_CONS_NO = null;

	/** �� 10 List�ϐ��F l_h_ISSUE_DATE */
	public List l_h_ISSUE_DATE = null;

	/** �� 11 List�ϐ��F l_h_LOT_NO_2 */
	public List l_h_LOT_NO_2 = null;

	/** �� 12 List�ϐ��F l_h_LOTCTRL */
	public List l_h_LOTCTRL = null;

	/** �� 13 List�ϐ��F l_ONEROUS_CONS_NO */
	public List l_ONEROUS_CONS_NO = null;

	/** �� 14 List�ϐ��F l_COMPANY_CD */
	public List l_COMPANY_CD = null;

	/** �� 15 List�ϐ��F l_VEND_CD */
	public List l_VEND_CD = null;

	/** �� 16 List�ϐ��F l_VEND_ANAME */
	public List l_VEND_ANAME = null;

	/** �� 17 List�ϐ��F l_ROUND_TYP */
	public List l_ROUND_TYP = null;

	/** �� 18 List�ϐ��F l_VEND_CUR_UNIT */
	public List l_VEND_CUR_UNIT = null;

	/** �� 19 List�ϐ��F l_VEND_DECIMAL_FIG */
	public List l_VEND_DECIMAL_FIG = null;

	/** �� 20 List�ϐ��F l_PLANT_CD */
	public List l_PLANT_CD = null;

	/** �� 21 List�ϐ��F l_JOB_ODR_CD */
	public List l_JOB_ODR_CD = null;

	/** �� 22 List�ϐ��F l_JOB_ODR_DETAIL_NO */
	public List l_JOB_ODR_DETAIL_NO = null;

	/** �� 23 List�ϐ��F l_ITEM_CD */
	public List l_ITEM_CD = null;

	/** �� 24 List�ϐ��F l_ITEM_NAME */
	public List l_ITEM_NAME = null;

	/** �� 25 List�ϐ��F l_ISSUE_DATE */
	public List l_ISSUE_DATE = null;

	/** �� 26 List�ϐ��F l_ISSUE_QTY */
	public List l_ISSUE_QTY = null;

	/** �� 27 List�ϐ��F l_UNIT_COST */
	public List l_UNIT_COST = null;

	/** �� 28 List�ϐ��F l_UNIT_COST_TYP */
	public List l_UNIT_COST_TYP = null;

	/** �� 29 List�ϐ��F l_ONEROUS_CONS_COMMENT */
	public List l_ONEROUS_CONS_COMMENT = null;

	/** �� 30 List�ϐ��F l_LOT_NO */
	public List l_LOT_NO = null;

	/** �� 31 List�ϐ��F l_VEND_LOT_NO */
	public List l_VEND_LOT_NO = null;

	/** �� 32 List�ϐ��F l_RCV_ISSUE_CTRL_CD */
	public List l_RCV_ISSUE_CTRL_CD = null;

	/** �� 33 List�ϐ��F l_WORK_ODR_CD */
	public List l_WORK_ODR_CD = null;

	/** �� 34 List�ϐ��F l_WORK_IN_PROC_CD */
	public List l_WORK_IN_PROC_CD = null;

	/** �� 35 List�ϐ��F l_PUCH_ODR_CD */
	public List l_PUCH_ODR_CD = null;

	/** �� 36 List�ϐ��F l_ISSUE_INST_CD */
	public List l_ISSUE_INST_CD = null;

	/** �� 37 List�ϐ��F l_RETURNED_WH_CD */
	public List l_RETURNED_WH_CD = null;

	/** �� 38 List�ϐ��F l_WH_NAME */
	public List l_WH_NAME = null;

	/** �� 39 List�ϐ��F l_RETURNED_CAUSE_CD */
	public List l_RETURNED_CAUSE_CD = null;

	/** �� 40 List�ϐ��F l_RETURNED_GNR_TYP */
	public List l_RETURNED_GNR_TYP = null;

	/** �� 41 List�ϐ��F l_AP_PROC_TYP */
	public List l_AP_PROC_TYP = null;

	/** �� 42 List�ϐ��F l_MODIFY_COUNT */
	public List l_MODIFY_COUNT = null;

	/** �� 43 List�ϐ��F l_STOCK_UNIT */
	public List l_STOCK_UNIT = null;

	/** �� 44 List�ϐ��F l_h_LOT_CTRL_FLG */
	public List l_h_LOT_CTRL_FLG = null;

	/** �� 45 List�ϐ��F l_h_LOT_NUMBERING_TYP */
	public List l_h_LOT_NUMBERING_TYP = null;

	/** �� 46 List�ϐ��F l_THIS_MONTH */
	public List l_THIS_MONTH = null;

	/** �� 47 List�ϐ��F l_INSTALL_FLG */
	public List l_INSTALL_FLG = null;

	/** �� 48 List�ϐ��F l_UNIT_QTY_TYP */
	public List l_UNIT_QTY_TYP = null;

	/** �� 49 List�ϐ��F l_SPL_ITEM_TYP */
	public List l_SPL_ITEM_TYP = null;

	/** �� 50 List�ϐ��F l_PRODUCT_TYP */
	public List l_PRODUCT_TYP = null;

	/** �� 51 List�ϐ��F l_CLASIFICATION_CD */
	public List l_CLASIFICATION_CD = null;

	/** �� 52 List�ϐ��F l_MRP_ODR_TYP */
	public List l_MRP_ODR_TYP = null;

	/** �� 53 List�ϐ��F l_WH_CD */
	public List l_WH_CD = null;

	/** �� 54 List�ϐ��F l_PROCESSING_COST */
	public List l_PROCESSING_COST = null;

	/** �� 55 List�ϐ��F l_MATERIAL_COST */
	public List l_MATERIAL_COST = null;

	/** �� 56 List�ϐ��F l_OTHER_OVERHEADS */
	public List l_OTHER_OVERHEADS = null;

	/** �� 57 List�ϐ��F l_MRP_FLG */
	public List l_MRP_FLG = null;

	/** �� 58 List�ϐ��F l_VALUE */
	public List l_VALUE = null;

	/** �� 59 List�ϐ��F l_NAME */
	public List l_NAME = null;

	/** �� 60 List�ϐ��F l_EFF_PHASE_IN_DATE */
	public List l_EFF_PHASE_IN_DATE = null;

	/** �� 61 List�ϐ��F l_ONEROUS_FLG */
	public List l_ONEROUS_FLG = null;

	/** �� 62 List�ϐ��F l_STOCK_ON_HAND_QTY */
	public List l_STOCK_ON_HAND_QTY = null;

	/** �� 63 List�ϐ��F l_RCV_ISSUE_TYP */
	public List l_RCV_ISSUE_TYP = null;

	/** �� 64 List�ϐ��F l_ACPT_NO */
	public List l_ACPT_NO = null;

	/** �� 65 List�ϐ��F l_ACPT_RSLT_CRCT_NO */
	public List l_ACPT_RSLT_CRCT_NO = null;

	/** �� 66 List�ϐ��F l_INSPEC_RSLT_CRCT_NO */
	public List l_INSPEC_RSLT_CRCT_NO = null;

	/** �� 67 List�ϐ��F l_PARTIAL_PRD_NO */
	public List l_PARTIAL_PRD_NO = null;

	/** �� 68 List�ϐ��F l_OPR_RSLT_CRCT_NO */
	public List l_OPR_RSLT_CRCT_NO = null;

	/** �� 69 List�ϐ��F l_RCV_ISSUE_BEFORE_QTY */
	public List l_RCV_ISSUE_BEFORE_QTY = null;

	/** �� 70 List�ϐ��F l_RCV_ISSUE_QTY */
	public List l_RCV_ISSUE_QTY = null;

	/** �� 71 List�ϐ��F l_RCV_ISSUE_AFTER_QTY */
	public List l_RCV_ISSUE_AFTER_QTY = null;

	/** �� 72 List�ϐ��F l_RCV_ISSUE_AMOUNT */
	public List l_RCV_ISSUE_AMOUNT = null;

	/** �� 73 List�ϐ��F l_RCV_ISSUE_DATE */
	public List l_RCV_ISSUE_DATE = null;

	/** �� 74 List�ϐ��F l_RCV_ISSUE_GNR_TYP */
	public List l_RCV_ISSUE_GNR_TYP = null;

	/** �� 75 List�ϐ��F l_RCV_ISSUE_ODD_QTY */
	public List l_RCV_ISSUE_ODD_QTY = null;

	/** �� 76 List�ϐ��F l_STOCK_UPD_TYP */
	public List l_STOCK_UPD_TYP = null;

	/** �� 77 List�ϐ��F l_RCV_ISSUE_CMPLT_FLG */
	public List l_RCV_ISSUE_CMPLT_FLG = null;

	/** �� 78 List�ϐ��F l_CONS_TYP */
	public List l_CONS_TYP = null;

	/** �� 79 List�ϐ��F l_PAST_RESULT_ENTRY_TYP */
	public List l_PAST_RESULT_ENTRY_TYP = null;

	/** �� 80 List�ϐ��F l_PROC_EXEC_DATE */
	public List l_PROC_EXEC_DATE = null;

	/** �� 81 List�ϐ��F l_BEST_BEFORE_DATE */
	public List l_BEST_BEFORE_DATE = null;

	/** �� 82 List�ϐ��F l_LOT_MODIFY_COUNT */
	public List l_LOT_MODIFY_COUNT = null;

	/** �� 83 List�ϐ��F l_DEL_FLG */
	public List l_DEL_FLG = null;

	/** �� 84 List�ϐ��F l_PRD_CMPLT_DATE */
	public List l_PRD_CMPLT_DATE = null;

	/** �� 85 List�ϐ��F l_LOT_STOCK_ON_HAND_QTY */
	public List l_LOT_STOCK_ON_HAND_QTY = null;


	//////////////////////////////

	// mediator�ϐ��p(get|set)���\�b�h

	public String getUNIT_COST_TYP_name() { return m_UNIT_COST_TYP_name; }
	public String getUNIT_COST_TYP_val() { return m_UNIT_COST_TYP_val; }
	public String getSelectUnitCostFlag() { return m_SelectUnitCostFlag; }
	public String getr1_FILTER() { return m_r1_FILTER; }
	public String getPUCH_ODR_AMOUNT() { return m_PUCH_ODR_AMOUNT; }
	public String getr2_FILTER() { return m_r2_FILTER; }
	public String getr3_FILTER() { return m_r3_FILTER; }
	public String getc_ONEROUS_CONS_INV_TYP() { return m_c_ONEROUS_CONS_INV_TYP; }
	public String geth_ONEROUS_CONS_NO() { return m_h_ONEROUS_CONS_NO; }
	public String geth_ISSUE_DATE() { return m_h_ISSUE_DATE; }
	public String geth_LOT_NO_2() { return m_h_LOT_NO_2; }
	public String geth_LOTCTRL() { return m_h_LOTCTRL; }
	public String getONEROUS_CONS_NO() { return m_ONEROUS_CONS_NO; }
	public String getCOMPANY_CD() { return m_COMPANY_CD; }
	public String getVEND_CD() { return m_VEND_CD; }
	public String getVEND_ANAME() { return m_VEND_ANAME; }
	public String getROUND_TYP() { return m_ROUND_TYP; }
	public String getVEND_CUR_UNIT() { return m_VEND_CUR_UNIT; }
	public String getVEND_DECIMAL_FIG() { return m_VEND_DECIMAL_FIG; }
	public String getPLANT_CD() { return m_PLANT_CD; }
	public String getJOB_ODR_CD() { return m_JOB_ODR_CD; }
	public String getJOB_ODR_DETAIL_NO() { return m_JOB_ODR_DETAIL_NO; }
	public String getITEM_CD() { return m_ITEM_CD; }
	public String getITEM_NAME() { return m_ITEM_NAME; }
	public String getISSUE_DATE() { return m_ISSUE_DATE; }
	public String getISSUE_QTY() { return m_ISSUE_QTY; }
	public String getUNIT_COST() { return m_UNIT_COST; }
	public String getUNIT_COST_TYP() { return m_UNIT_COST_TYP; }
	public String getONEROUS_CONS_COMMENT() { return m_ONEROUS_CONS_COMMENT; }
	public String getLOT_NO() { return m_LOT_NO; }
	public String getVEND_LOT_NO() { return m_VEND_LOT_NO; }
	public String getRCV_ISSUE_CTRL_CD() { return m_RCV_ISSUE_CTRL_CD; }
	public String getWORK_ODR_CD() { return m_WORK_ODR_CD; }
	public String getWORK_IN_PROC_CD() { return m_WORK_IN_PROC_CD; }
	public String getPUCH_ODR_CD() { return m_PUCH_ODR_CD; }
	public String getISSUE_INST_CD() { return m_ISSUE_INST_CD; }
	public String getRETURNED_WH_CD() { return m_RETURNED_WH_CD; }
	public String getWH_NAME() { return m_WH_NAME; }
	public String getRETURNED_CAUSE_CD() { return m_RETURNED_CAUSE_CD; }
	public String getRETURNED_GNR_TYP() { return m_RETURNED_GNR_TYP; }
	public String getAP_PROC_TYP() { return m_AP_PROC_TYP; }
	public String getMODIFY_COUNT() { return m_MODIFY_COUNT; }
	public String getSTOCK_UNIT() { return m_STOCK_UNIT; }
	public String geth_LOT_CTRL_FLG() { return m_h_LOT_CTRL_FLG; }
	public String geth_LOT_NUMBERING_TYP() { return m_h_LOT_NUMBERING_TYP; }
	public String getTHIS_MONTH() { return m_THIS_MONTH; }
	public String getINSTALL_FLG() { return m_INSTALL_FLG; }
	public String getUNIT_QTY_TYP() { return m_UNIT_QTY_TYP; }
	public String getSPL_ITEM_TYP() { return m_SPL_ITEM_TYP; }
	public String getPRODUCT_TYP() { return m_PRODUCT_TYP; }
	public String getCLASIFICATION_CD() { return m_CLASIFICATION_CD; }
	public String getMRP_ODR_TYP() { return m_MRP_ODR_TYP; }
	public String getWH_CD() { return m_WH_CD; }
	public String getPROCESSING_COST() { return m_PROCESSING_COST; }
	public String getMATERIAL_COST() { return m_MATERIAL_COST; }
	public String getOTHER_OVERHEADS() { return m_OTHER_OVERHEADS; }
	public String getMRP_FLG() { return m_MRP_FLG; }
	public String getVALUE() { return m_VALUE; }
	public String getNAME() { return m_NAME; }
	public String getEFF_PHASE_IN_DATE() { return m_EFF_PHASE_IN_DATE; }
	public String getONEROUS_FLG() { return m_ONEROUS_FLG; }
	public String getSTOCK_ON_HAND_QTY() { return m_STOCK_ON_HAND_QTY; }
	public String getRCV_ISSUE_TYP() { return m_RCV_ISSUE_TYP; }
	public String getACPT_NO() { return m_ACPT_NO; }
	public String getACPT_RSLT_CRCT_NO() { return m_ACPT_RSLT_CRCT_NO; }
	public String getINSPEC_RSLT_CRCT_NO() { return m_INSPEC_RSLT_CRCT_NO; }
	public String getPARTIAL_PRD_NO() { return m_PARTIAL_PRD_NO; }
	public String getOPR_RSLT_CRCT_NO() { return m_OPR_RSLT_CRCT_NO; }
	public String getRCV_ISSUE_BEFORE_QTY() { return m_RCV_ISSUE_BEFORE_QTY; }
	public String getRCV_ISSUE_QTY() { return m_RCV_ISSUE_QTY; }
	public String getRCV_ISSUE_AFTER_QTY() { return m_RCV_ISSUE_AFTER_QTY; }
	public String getRCV_ISSUE_AMOUNT() { return m_RCV_ISSUE_AMOUNT; }
	public String getRCV_ISSUE_DATE() { return m_RCV_ISSUE_DATE; }
	public String getRCV_ISSUE_GNR_TYP() { return m_RCV_ISSUE_GNR_TYP; }
	public String getRCV_ISSUE_ODD_QTY() { return m_RCV_ISSUE_ODD_QTY; }
	public String getSTOCK_UPD_TYP() { return m_STOCK_UPD_TYP; }
	public String getRCV_ISSUE_CMPLT_FLG() { return m_RCV_ISSUE_CMPLT_FLG; }
	public String getCONS_TYP() { return m_CONS_TYP; }
	public String getPAST_RESULT_ENTRY_TYP() { return m_PAST_RESULT_ENTRY_TYP; }
	public BigDecimal getPROC_EXEC_DATE() { return m_PROC_EXEC_DATE; }
	public String getBEST_BEFORE_DATE() { return m_BEST_BEFORE_DATE; }
	public String getLOT_MODIFY_COUNT() { return m_LOT_MODIFY_COUNT; }
	public String getDEL_FLG() { return m_DEL_FLG; }
	public String getPRD_CMPLT_DATE() { return m_PRD_CMPLT_DATE; }
	public String getLOT_STOCK_ON_HAND_QTY() { return m_LOT_STOCK_ON_HAND_QTY; }

	public List getList_UNIT_COST_TYP_name() { return l_UNIT_COST_TYP_name; }
	public List getList_UNIT_COST_TYP_val() { return l_UNIT_COST_TYP_val; }
	public List getList_SelectUnitCostFlag() { return l_SelectUnitCostFlag; }
	public List getList_r1_FILTER() { return l_r1_FILTER; }
	public List getList_PUCH_ODR_AMOUNT() { return l_PUCH_ODR_AMOUNT; }
	public List getList_r2_FILTER() { return l_r2_FILTER; }
	public List getList_r3_FILTER() { return l_r3_FILTER; }
	public List getList_c_ONEROUS_CONS_INV_TYP() { return l_c_ONEROUS_CONS_INV_TYP; }
	public List getList_h_ONEROUS_CONS_NO() { return l_h_ONEROUS_CONS_NO; }
	public List getList_h_ISSUE_DATE() { return l_h_ISSUE_DATE; }
	public List getList_h_LOT_NO_2() { return l_h_LOT_NO_2; }
	public List getList_h_LOTCTRL() { return l_h_LOTCTRL; }
	public List getList_ONEROUS_CONS_NO() { return l_ONEROUS_CONS_NO; }
	public List getList_COMPANY_CD() { return l_COMPANY_CD; }
	public List getList_VEND_CD() { return l_VEND_CD; }
	public List getList_VEND_ANAME() { return l_VEND_ANAME; }
	public List getList_ROUND_TYP() { return l_ROUND_TYP; }
	public List getList_VEND_CUR_UNIT() { return l_VEND_CUR_UNIT; }
	public List getList_VEND_DECIMAL_FIG() { return l_VEND_DECIMAL_FIG; }
	public List getList_PLANT_CD() { return l_PLANT_CD; }
	public List getList_JOB_ODR_CD() { return l_JOB_ODR_CD; }
	public List getList_JOB_ODR_DETAIL_NO() { return l_JOB_ODR_DETAIL_NO; }
	public List getList_ITEM_CD() { return l_ITEM_CD; }
	public List getList_ITEM_NAME() { return l_ITEM_NAME; }
	public List getList_ISSUE_DATE() { return l_ISSUE_DATE; }
	public List getList_ISSUE_QTY() { return l_ISSUE_QTY; }
	public List getList_UNIT_COST() { return l_UNIT_COST; }
	public List getList_UNIT_COST_TYP() { return l_UNIT_COST_TYP; }
	public List getList_ONEROUS_CONS_COMMENT() { return l_ONEROUS_CONS_COMMENT; }
	public List getList_LOT_NO() { return l_LOT_NO; }
	public List getList_VEND_LOT_NO() { return l_VEND_LOT_NO; }
	public List getList_RCV_ISSUE_CTRL_CD() { return l_RCV_ISSUE_CTRL_CD; }
	public List getList_WORK_ODR_CD() { return l_WORK_ODR_CD; }
	public List getList_WORK_IN_PROC_CD() { return l_WORK_IN_PROC_CD; }
	public List getList_PUCH_ODR_CD() { return l_PUCH_ODR_CD; }
	public List getList_ISSUE_INST_CD() { return l_ISSUE_INST_CD; }
	public List getList_RETURNED_WH_CD() { return l_RETURNED_WH_CD; }
	public List getList_WH_NAME() { return l_WH_NAME; }
	public List getList_RETURNED_CAUSE_CD() { return l_RETURNED_CAUSE_CD; }
	public List getList_RETURNED_GNR_TYP() { return l_RETURNED_GNR_TYP; }
	public List getList_AP_PROC_TYP() { return l_AP_PROC_TYP; }
	public List getList_MODIFY_COUNT() { return l_MODIFY_COUNT; }
	public List getList_STOCK_UNIT() { return l_STOCK_UNIT; }
	public List getList_h_LOT_CTRL_FLG() { return l_h_LOT_CTRL_FLG; }
	public List getList_h_LOT_NUMBERING_TYP() { return l_h_LOT_NUMBERING_TYP; }
	public List getList_THIS_MONTH() { return l_THIS_MONTH; }
	public List getList_INSTALL_FLG() { return l_INSTALL_FLG; }
	public List getList_UNIT_QTY_TYP() { return l_UNIT_QTY_TYP; }
	public List getList_SPL_ITEM_TYP() { return l_SPL_ITEM_TYP; }
	public List getList_PRODUCT_TYP() { return l_PRODUCT_TYP; }
	public List getList_CLASIFICATION_CD() { return l_CLASIFICATION_CD; }
	public List getList_MRP_ODR_TYP() { return l_MRP_ODR_TYP; }
	public List getList_WH_CD() { return l_WH_CD; }
	public List getList_PROCESSING_COST() { return l_PROCESSING_COST; }
	public List getList_MATERIAL_COST() { return l_MATERIAL_COST; }
	public List getList_OTHER_OVERHEADS() { return l_OTHER_OVERHEADS; }
	public List getList_MRP_FLG() { return l_MRP_FLG; }
	public List getList_VALUE() { return l_VALUE; }
	public List getList_NAME() { return l_NAME; }
	public List getList_EFF_PHASE_IN_DATE() { return l_EFF_PHASE_IN_DATE; }
	public List getList_ONEROUS_FLG() { return l_ONEROUS_FLG; }
	public List getList_STOCK_ON_HAND_QTY() { return l_STOCK_ON_HAND_QTY; }
	public List getList_RCV_ISSUE_TYP() { return l_RCV_ISSUE_TYP; }
	public List getList_ACPT_NO() { return l_ACPT_NO; }
	public List getList_ACPT_RSLT_CRCT_NO() { return l_ACPT_RSLT_CRCT_NO; }
	public List getList_INSPEC_RSLT_CRCT_NO() { return l_INSPEC_RSLT_CRCT_NO; }
	public List getList_PARTIAL_PRD_NO() { return l_PARTIAL_PRD_NO; }
	public List getList_OPR_RSLT_CRCT_NO() { return l_OPR_RSLT_CRCT_NO; }
	public List getList_RCV_ISSUE_BEFORE_QTY() { return l_RCV_ISSUE_BEFORE_QTY; }
	public List getList_RCV_ISSUE_QTY() { return l_RCV_ISSUE_QTY; }
	public List getList_RCV_ISSUE_AFTER_QTY() { return l_RCV_ISSUE_AFTER_QTY; }
	public List getList_RCV_ISSUE_AMOUNT() { return l_RCV_ISSUE_AMOUNT; }
	public List getList_RCV_ISSUE_DATE() { return l_RCV_ISSUE_DATE; }
	public List getList_RCV_ISSUE_GNR_TYP() { return l_RCV_ISSUE_GNR_TYP; }
	public List getList_RCV_ISSUE_ODD_QTY() { return l_RCV_ISSUE_ODD_QTY; }
	public List getList_STOCK_UPD_TYP() { return l_STOCK_UPD_TYP; }
	public List getList_RCV_ISSUE_CMPLT_FLG() { return l_RCV_ISSUE_CMPLT_FLG; }
	public List getList_CONS_TYP() { return l_CONS_TYP; }
	public List getList_PAST_RESULT_ENTRY_TYP() { return l_PAST_RESULT_ENTRY_TYP; }
	public List getList_PROC_EXEC_DATE() { return l_PROC_EXEC_DATE; }
	public List getList_BEST_BEFORE_DATE() { return l_BEST_BEFORE_DATE; }
	public List getList_LOT_MODIFY_COUNT() { return l_LOT_MODIFY_COUNT; }
	public List getList_DEL_FLG() { return l_DEL_FLG; }
	public List getList_PRD_CMPLT_DATE() { return l_PRD_CMPLT_DATE; }
	public List getList_LOT_STOCK_ON_HAND_QTY() { return l_LOT_STOCK_ON_HAND_QTY; }

	public void setUNIT_COST_TYP_name(String val) { m_UNIT_COST_TYP_name = val; }
	public void setUNIT_COST_TYP_val(String val) { m_UNIT_COST_TYP_val = val; }
	public void setSelectUnitCostFlag(String val) { m_SelectUnitCostFlag = val; }
	public void setr1_FILTER(String val) { m_r1_FILTER = val; }
	public void setPUCH_ODR_AMOUNT(String val) { m_PUCH_ODR_AMOUNT = val; }
	public void setr2_FILTER(String val) { m_r2_FILTER = val; }
	public void setr3_FILTER(String val) { m_r3_FILTER = val; }
	public void setc_ONEROUS_CONS_INV_TYP(String val) { m_c_ONEROUS_CONS_INV_TYP = val; }
	public void seth_ONEROUS_CONS_NO(String val) { m_h_ONEROUS_CONS_NO = val; }
	public void seth_ISSUE_DATE(String val) { m_h_ISSUE_DATE = val; }
	public void seth_LOT_NO_2(String val) { m_h_LOT_NO_2 = val; }
	public void seth_LOTCTRL(String val) { m_h_LOTCTRL = val; }
	public void setONEROUS_CONS_NO(String val) { m_ONEROUS_CONS_NO = val; }
	public void setCOMPANY_CD(String val) { m_COMPANY_CD = val; }
	public void setVEND_CD(String val) { m_VEND_CD = val; }
	public void setVEND_ANAME(String val) { m_VEND_ANAME = val; }
	public void setROUND_TYP(String val) { m_ROUND_TYP = val; }
	public void setVEND_CUR_UNIT(String val) { m_VEND_CUR_UNIT = val; }
	public void setVEND_DECIMAL_FIG(String val) { m_VEND_DECIMAL_FIG = val; }
	public void setPLANT_CD(String val) { m_PLANT_CD = val; }
	public void setJOB_ODR_CD(String val) { m_JOB_ODR_CD = val; }
	public void setJOB_ODR_DETAIL_NO(String val) { m_JOB_ODR_DETAIL_NO = val; }
	public void setITEM_CD(String val) { m_ITEM_CD = val; }
	public void setITEM_NAME(String val) { m_ITEM_NAME = val; }
	public void setISSUE_DATE(String val) { m_ISSUE_DATE = val; }
	public void setISSUE_QTY(String val) { m_ISSUE_QTY = val; }
	public void setUNIT_COST(String val) { m_UNIT_COST = val; }
	public void setUNIT_COST_TYP(String val) { m_UNIT_COST_TYP = val; }
	public void setONEROUS_CONS_COMMENT(String val) { m_ONEROUS_CONS_COMMENT = val; }
	public void setLOT_NO(String val) { m_LOT_NO = val; }
	public void setVEND_LOT_NO(String val) { m_VEND_LOT_NO = val; }
	public void setRCV_ISSUE_CTRL_CD(String val) { m_RCV_ISSUE_CTRL_CD = val; }
	public void setWORK_ODR_CD(String val) { m_WORK_ODR_CD = val; }
	public void setWORK_IN_PROC_CD(String val) { m_WORK_IN_PROC_CD = val; }
	public void setPUCH_ODR_CD(String val) { m_PUCH_ODR_CD = val; }
	public void setISSUE_INST_CD(String val) { m_ISSUE_INST_CD = val; }
	public void setRETURNED_WH_CD(String val) { m_RETURNED_WH_CD = val; }
	public void setWH_NAME(String val) { m_WH_NAME = val; }
	public void setRETURNED_CAUSE_CD(String val) { m_RETURNED_CAUSE_CD = val; }
	public void setRETURNED_GNR_TYP(String val) { m_RETURNED_GNR_TYP = val; }
	public void setAP_PROC_TYP(String val) { m_AP_PROC_TYP = val; }
	public void setMODIFY_COUNT(String val) { m_MODIFY_COUNT = val; }
	public void setSTOCK_UNIT(String val) { m_STOCK_UNIT = val; }
	public void seth_LOT_CTRL_FLG(String val) { m_h_LOT_CTRL_FLG = val; }
	public void seth_LOT_NUMBERING_TYP(String val) { m_h_LOT_NUMBERING_TYP = val; }
	public void setTHIS_MONTH(String val) { m_THIS_MONTH = val; }
	public void setINSTALL_FLG(String val) { m_INSTALL_FLG = val; }
	public void setUNIT_QTY_TYP(String val) { m_UNIT_QTY_TYP = val; }
	public void setSPL_ITEM_TYP(String val) { m_SPL_ITEM_TYP = val; }
	public void setPRODUCT_TYP(String val) { m_PRODUCT_TYP = val; }
	public void setCLASIFICATION_CD(String val) { m_CLASIFICATION_CD = val; }
	public void setMRP_ODR_TYP(String val) { m_MRP_ODR_TYP = val; }
	public void setWH_CD(String val) { m_WH_CD = val; }
	public void setPROCESSING_COST(String val) { m_PROCESSING_COST = val; }
	public void setMATERIAL_COST(String val) { m_MATERIAL_COST = val; }
	public void setOTHER_OVERHEADS(String val) { m_OTHER_OVERHEADS = val; }
	public void setMRP_FLG(String val) { m_MRP_FLG = val; }
	public void setVALUE(String val) { m_VALUE = val; }
	public void setNAME(String val) { m_NAME = val; }
	public void setEFF_PHASE_IN_DATE(String val) { m_EFF_PHASE_IN_DATE = val; }
	public void setONEROUS_FLG(String val) { m_ONEROUS_FLG = val; }
	public void setSTOCK_ON_HAND_QTY(String val) { m_STOCK_ON_HAND_QTY = val; }
	public void setRCV_ISSUE_TYP(String val) { m_RCV_ISSUE_TYP = val; }
	public void setACPT_NO(String val) { m_ACPT_NO = val; }
	public void setACPT_RSLT_CRCT_NO(String val) { m_ACPT_RSLT_CRCT_NO = val; }
	public void setINSPEC_RSLT_CRCT_NO(String val) { m_INSPEC_RSLT_CRCT_NO = val; }
	public void setPARTIAL_PRD_NO(String val) { m_PARTIAL_PRD_NO = val; }
	public void setOPR_RSLT_CRCT_NO(String val) { m_OPR_RSLT_CRCT_NO = val; }
	public void setRCV_ISSUE_BEFORE_QTY(String val) { m_RCV_ISSUE_BEFORE_QTY = val; }
	public void setRCV_ISSUE_QTY(String val) { m_RCV_ISSUE_QTY = val; }
	public void setRCV_ISSUE_AFTER_QTY(String val) { m_RCV_ISSUE_AFTER_QTY = val; }
	public void setRCV_ISSUE_AMOUNT(String val) { m_RCV_ISSUE_AMOUNT = val; }
	public void setRCV_ISSUE_DATE(String val) { m_RCV_ISSUE_DATE = val; }
	public void setRCV_ISSUE_GNR_TYP(String val) { m_RCV_ISSUE_GNR_TYP = val; }
	public void setRCV_ISSUE_ODD_QTY(String val) { m_RCV_ISSUE_ODD_QTY = val; }
	public void setSTOCK_UPD_TYP(String val) { m_STOCK_UPD_TYP = val; }
	public void setRCV_ISSUE_CMPLT_FLG(String val) { m_RCV_ISSUE_CMPLT_FLG = val; }
	public void setCONS_TYP(String val) { m_CONS_TYP = val; }
	public void setPAST_RESULT_ENTRY_TYP(String val) { m_PAST_RESULT_ENTRY_TYP = val; }
	public void setPROC_EXEC_DATE(BigDecimal val) { m_PROC_EXEC_DATE = val; }
	public void setBEST_BEFORE_DATE(String val) { m_BEST_BEFORE_DATE = val; }
	public void setLOT_MODIFY_COUNT(String val) { m_LOT_MODIFY_COUNT = val; }
	public void setDEL_FLG(String val) { m_DEL_FLG = val; }
	public void setPRD_CMPLT_DATE(String val) { m_PRD_CMPLT_DATE = val; }
	public void setLOT_STOCK_ON_HAND_QTY(String val) { m_LOT_STOCK_ON_HAND_QTY = val; }


	public void setList_UNIT_COST_TYP_name(List list) { l_UNIT_COST_TYP_name = list; }
	public void setList_UNIT_COST_TYP_val(List list) { l_UNIT_COST_TYP_val = list; }
	public void setList_SelectUnitCostFlag(List list) { l_SelectUnitCostFlag = list; }
	public void setList_r1_FILTER(List list) { l_r1_FILTER = list; }
	public void setList_PUCH_ODR_AMOUNT(List list) { l_PUCH_ODR_AMOUNT = list; }
	public void setList_r2_FILTER(List list) { l_r2_FILTER = list; }
	public void setList_r3_FILTER(List list) { l_r3_FILTER = list; }
	public void setList_c_ONEROUS_CONS_INV_TYP(List list) { l_c_ONEROUS_CONS_INV_TYP = list; }
	public void setList_h_ONEROUS_CONS_NO(List list) { l_h_ONEROUS_CONS_NO = list; }
	public void setList_h_ISSUE_DATE(List list) { l_h_ISSUE_DATE = list; }
	public void setList_h_LOT_NO_2(List list) { l_h_LOT_NO_2 = list; }
	public void setList_h_LOTCTRL(List list) { l_h_LOTCTRL = list; }
	public void setList_ONEROUS_CONS_NO(List list) { l_ONEROUS_CONS_NO = list; }
	public void setList_COMPANY_CD(List list) { l_COMPANY_CD = list; }
	public void setList_VEND_CD(List list) { l_VEND_CD = list; }
	public void setList_VEND_ANAME(List list) { l_VEND_ANAME = list; }
	public void setList_ROUND_TYP(List list) { l_ROUND_TYP = list; }
	public void setList_VEND_CUR_UNIT(List list) { l_VEND_CUR_UNIT = list; }
	public void setList_VEND_DECIMAL_FIG(List list) { l_VEND_DECIMAL_FIG = list; }
	public void setList_PLANT_CD(List list) { l_PLANT_CD = list; }
	public void setList_JOB_ODR_CD(List list) { l_JOB_ODR_CD = list; }
	public void setList_JOB_ODR_DETAIL_NO(List list) { l_JOB_ODR_DETAIL_NO = list; }
	public void setList_ITEM_CD(List list) { l_ITEM_CD = list; }
	public void setList_ITEM_NAME(List list) { l_ITEM_NAME = list; }
	public void setList_ISSUE_DATE(List list) { l_ISSUE_DATE = list; }
	public void setList_ISSUE_QTY(List list) { l_ISSUE_QTY = list; }
	public void setList_UNIT_COST(List list) { l_UNIT_COST = list; }
	public void setList_UNIT_COST_TYP(List list) { l_UNIT_COST_TYP = list; }
	public void setList_ONEROUS_CONS_COMMENT(List list) { l_ONEROUS_CONS_COMMENT = list; }
	public void setList_LOT_NO(List list) { l_LOT_NO = list; }
	public void setList_VEND_LOT_NO(List list) { l_VEND_LOT_NO = list; }
	public void setList_RCV_ISSUE_CTRL_CD(List list) { l_RCV_ISSUE_CTRL_CD = list; }
	public void setList_WORK_ODR_CD(List list) { l_WORK_ODR_CD = list; }
	public void setList_WORK_IN_PROC_CD(List list) { l_WORK_IN_PROC_CD = list; }
	public void setList_PUCH_ODR_CD(List list) { l_PUCH_ODR_CD = list; }
	public void setList_ISSUE_INST_CD(List list) { l_ISSUE_INST_CD = list; }
	public void setList_RETURNED_WH_CD(List list) { l_RETURNED_WH_CD = list; }
	public void setList_WH_NAME(List list) { l_WH_NAME = list; }
	public void setList_RETURNED_CAUSE_CD(List list) { l_RETURNED_CAUSE_CD = list; }
	public void setList_RETURNED_GNR_TYP(List list) { l_RETURNED_GNR_TYP = list; }
	public void setList_AP_PROC_TYP(List list) { l_AP_PROC_TYP = list; }
	public void setList_MODIFY_COUNT(List list) { l_MODIFY_COUNT = list; }
	public void setList_STOCK_UNIT(List list) { l_STOCK_UNIT = list; }
	public void setList_h_LOT_CTRL_FLG(List list) { l_h_LOT_CTRL_FLG = list; }
	public void setList_h_LOT_NUMBERING_TYP(List list) { l_h_LOT_NUMBERING_TYP = list; }
	public void setList_THIS_MONTH(List list) { l_THIS_MONTH = list; }
	public void setList_INSTALL_FLG(List list) { l_INSTALL_FLG = list; }
	public void setList_UNIT_QTY_TYP(List list) { l_UNIT_QTY_TYP = list; }
	public void setList_SPL_ITEM_TYP(List list) { l_SPL_ITEM_TYP = list; }
	public void setList_PRODUCT_TYP(List list) { l_PRODUCT_TYP = list; }
	public void setList_CLASIFICATION_CD(List list) { l_CLASIFICATION_CD = list; }
	public void setList_MRP_ODR_TYP(List list) { l_MRP_ODR_TYP = list; }
	public void setList_WH_CD(List list) { l_WH_CD = list; }
	public void setList_PROCESSING_COST(List list) { l_PROCESSING_COST = list; }
	public void setList_MATERIAL_COST(List list) { l_MATERIAL_COST = list; }
	public void setList_OTHER_OVERHEADS(List list) { l_OTHER_OVERHEADS = list; }
	public void setList_MRP_FLG(List list) { l_MRP_FLG = list; }
	public void setList_VALUE(List list) { l_VALUE = list; }
	public void setList_NAME(List list) { l_NAME = list; }
	public void setList_EFF_PHASE_IN_DATE(List list) { l_EFF_PHASE_IN_DATE = list; }
	public void setList_ONEROUS_FLG(List list) { l_ONEROUS_FLG = list; }
	public void setList_STOCK_ON_HAND_QTY(List list) { l_STOCK_ON_HAND_QTY = list; }
	public void setList_RCV_ISSUE_TYP(List list) { l_RCV_ISSUE_TYP = list; }
	public void setList_ACPT_NO(List list) { l_ACPT_NO = list; }
	public void setList_ACPT_RSLT_CRCT_NO(List list) { l_ACPT_RSLT_CRCT_NO = list; }
	public void setList_INSPEC_RSLT_CRCT_NO(List list) { l_INSPEC_RSLT_CRCT_NO = list; }
	public void setList_PARTIAL_PRD_NO(List list) { l_PARTIAL_PRD_NO = list; }
	public void setList_OPR_RSLT_CRCT_NO(List list) { l_OPR_RSLT_CRCT_NO = list; }
	public void setList_RCV_ISSUE_BEFORE_QTY(List list) { l_RCV_ISSUE_BEFORE_QTY = list; }
	public void setList_RCV_ISSUE_QTY(List list) { l_RCV_ISSUE_QTY = list; }
	public void setList_RCV_ISSUE_AFTER_QTY(List list) { l_RCV_ISSUE_AFTER_QTY = list; }
	public void setList_RCV_ISSUE_AMOUNT(List list) { l_RCV_ISSUE_AMOUNT = list; }
	public void setList_RCV_ISSUE_DATE(List list) { l_RCV_ISSUE_DATE = list; }
	public void setList_RCV_ISSUE_GNR_TYP(List list) { l_RCV_ISSUE_GNR_TYP = list; }
	public void setList_RCV_ISSUE_ODD_QTY(List list) { l_RCV_ISSUE_ODD_QTY = list; }
	public void setList_STOCK_UPD_TYP(List list) { l_STOCK_UPD_TYP = list; }
	public void setList_RCV_ISSUE_CMPLT_FLG(List list) { l_RCV_ISSUE_CMPLT_FLG = list; }
	public void setList_CONS_TYP(List list) { l_CONS_TYP = list; }
	public void setList_PAST_RESULT_ENTRY_TYP(List list) { l_PAST_RESULT_ENTRY_TYP = list; }
	public void setList_PROC_EXEC_DATE(List list) { l_PROC_EXEC_DATE = list; }
	public void setList_BEST_BEFORE_DATE(List list) { l_BEST_BEFORE_DATE = list; }
	public void setList_LOT_MODIFY_COUNT(List list) { l_LOT_MODIFY_COUNT = list; }
	public void setList_DEL_FLG(List list) { l_DEL_FLG = list; }
	public void setList_PRD_CMPLT_DATE(List list) { l_PRD_CMPLT_DATE = list; }
	public void setList_LOT_STOCK_ON_HAND_QTY(List list) { l_LOT_STOCK_ON_HAND_QTY = list; }

	public int setL2L_UNIT_COST_TYP_name(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_COST_TYP_name == null) {
			l_UNIT_COST_TYP_name = new ArrayList();
		} else {
			l_UNIT_COST_TYP_name.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_COST_TYP_name.add(((AE0100010Struct) list.get(i)).getUNIT_COST_TYP_name());
		}
		return size;
	}
	public int setL2L_UNIT_COST_TYP_val(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_COST_TYP_val == null) {
			l_UNIT_COST_TYP_val = new ArrayList();
		} else {
			l_UNIT_COST_TYP_val.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_COST_TYP_val.add(((AE0100010Struct) list.get(i)).getUNIT_COST_TYP_val());
		}
		return size;
	}
	public int setL2L_SelectUnitCostFlag(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_SelectUnitCostFlag == null) {
			l_SelectUnitCostFlag = new ArrayList();
		} else {
			l_SelectUnitCostFlag.clear();
		}
		for (int i = 0; i < size; i++) {
			l_SelectUnitCostFlag.add(((AE0100010Struct) list.get(i)).getSelectUnitCostFlag());
		}
		return size;
	}
	public int setL2L_r1_FILTER(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r1_FILTER == null) {
			l_r1_FILTER = new ArrayList();
		} else {
			l_r1_FILTER.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r1_FILTER.add(((AE0100010Struct) list.get(i)).getr1_FILTER());
		}
		return size;
	}
	public int setL2L_PUCH_ODR_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PUCH_ODR_AMOUNT == null) {
			l_PUCH_ODR_AMOUNT = new ArrayList();
		} else {
			l_PUCH_ODR_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PUCH_ODR_AMOUNT.add(((AE0100010Struct) list.get(i)).getPUCH_ODR_AMOUNT());
		}
		return size;
	}
	public int setL2L_r2_FILTER(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r2_FILTER == null) {
			l_r2_FILTER = new ArrayList();
		} else {
			l_r2_FILTER.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r2_FILTER.add(((AE0100010Struct) list.get(i)).getr2_FILTER());
		}
		return size;
	}
	public int setL2L_r3_FILTER(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_r3_FILTER == null) {
			l_r3_FILTER = new ArrayList();
		} else {
			l_r3_FILTER.clear();
		}
		for (int i = 0; i < size; i++) {
			l_r3_FILTER.add(((AE0100010Struct) list.get(i)).getr3_FILTER());
		}
		return size;
	}
	public int setL2L_c_ONEROUS_CONS_INV_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_c_ONEROUS_CONS_INV_TYP == null) {
			l_c_ONEROUS_CONS_INV_TYP = new ArrayList();
		} else {
			l_c_ONEROUS_CONS_INV_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_c_ONEROUS_CONS_INV_TYP.add(((AE0100010Struct) list.get(i)).getc_ONEROUS_CONS_INV_TYP());
		}
		return size;
	}
	public int setL2L_h_ONEROUS_CONS_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ONEROUS_CONS_NO == null) {
			l_h_ONEROUS_CONS_NO = new ArrayList();
		} else {
			l_h_ONEROUS_CONS_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ONEROUS_CONS_NO.add(((AE0100010Struct) list.get(i)).geth_ONEROUS_CONS_NO());
		}
		return size;
	}
	public int setL2L_h_ISSUE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_ISSUE_DATE == null) {
			l_h_ISSUE_DATE = new ArrayList();
		} else {
			l_h_ISSUE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_ISSUE_DATE.add(((AE0100010Struct) list.get(i)).geth_ISSUE_DATE());
		}
		return size;
	}
	public int setL2L_h_LOT_NO_2(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_LOT_NO_2 == null) {
			l_h_LOT_NO_2 = new ArrayList();
		} else {
			l_h_LOT_NO_2.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_LOT_NO_2.add(((AE0100010Struct) list.get(i)).geth_LOT_NO_2());
		}
		return size;
	}
	public int setL2L_h_LOTCTRL(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_h_LOTCTRL == null) {
			l_h_LOTCTRL = new ArrayList();
		} else {
			l_h_LOTCTRL.clear();
		}
		for (int i = 0; i < size; i++) {
			l_h_LOTCTRL.add(((AE0100010Struct) list.get(i)).geth_LOTCTRL());
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
			l_ONEROUS_CONS_NO.add(((AE0100010Struct) list.get(i)).getONEROUS_CONS_NO());
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
			l_COMPANY_CD.add(((AE0100010Struct) list.get(i)).getCOMPANY_CD());
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
			l_VEND_CD.add(((AE0100010Struct) list.get(i)).getVEND_CD());
		}
		return size;
	}
	public int setL2L_VEND_ANAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_ANAME == null) {
			l_VEND_ANAME = new ArrayList();
		} else {
			l_VEND_ANAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_ANAME.add(((AE0100010Struct) list.get(i)).getVEND_ANAME());
		}
		return size;
	}
	public int setL2L_ROUND_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ROUND_TYP == null) {
			l_ROUND_TYP = new ArrayList();
		} else {
			l_ROUND_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ROUND_TYP.add(((AE0100010Struct) list.get(i)).getROUND_TYP());
		}
		return size;
	}
	public int setL2L_VEND_CUR_UNIT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_CUR_UNIT == null) {
			l_VEND_CUR_UNIT = new ArrayList();
		} else {
			l_VEND_CUR_UNIT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_CUR_UNIT.add(((AE0100010Struct) list.get(i)).getVEND_CUR_UNIT());
		}
		return size;
	}
	public int setL2L_VEND_DECIMAL_FIG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_VEND_DECIMAL_FIG == null) {
			l_VEND_DECIMAL_FIG = new ArrayList();
		} else {
			l_VEND_DECIMAL_FIG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_VEND_DECIMAL_FIG.add(((AE0100010Struct) list.get(i)).getVEND_DECIMAL_FIG());
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
			l_PLANT_CD.add(((AE0100010Struct) list.get(i)).getPLANT_CD());
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
			l_JOB_ODR_CD.add(((AE0100010Struct) list.get(i)).getJOB_ODR_CD());
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
			l_JOB_ODR_DETAIL_NO.add(((AE0100010Struct) list.get(i)).getJOB_ODR_DETAIL_NO());
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
			l_ITEM_CD.add(((AE0100010Struct) list.get(i)).getITEM_CD());
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
			l_ITEM_NAME.add(((AE0100010Struct) list.get(i)).getITEM_NAME());
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
			l_ISSUE_DATE.add(((AE0100010Struct) list.get(i)).getISSUE_DATE());
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
			l_ISSUE_QTY.add(((AE0100010Struct) list.get(i)).getISSUE_QTY());
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
			l_UNIT_COST.add(((AE0100010Struct) list.get(i)).getUNIT_COST());
		}
		return size;
	}
	public int setL2L_UNIT_COST_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_UNIT_COST_TYP == null) {
			l_UNIT_COST_TYP = new ArrayList();
		} else {
			l_UNIT_COST_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_UNIT_COST_TYP.add(((AE0100010Struct) list.get(i)).getUNIT_COST_TYP());
		}
		return size;
	}
	public int setL2L_ONEROUS_CONS_COMMENT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ONEROUS_CONS_COMMENT == null) {
			l_ONEROUS_CONS_COMMENT = new ArrayList();
		} else {
			l_ONEROUS_CONS_COMMENT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ONEROUS_CONS_COMMENT.add(((AE0100010Struct) list.get(i)).getONEROUS_CONS_COMMENT());
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
			l_LOT_NO.add(((AE0100010Struct) list.get(i)).getLOT_NO());
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
			l_VEND_LOT_NO.add(((AE0100010Struct) list.get(i)).getVEND_LOT_NO());
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
			l_RCV_ISSUE_CTRL_CD.add(((AE0100010Struct) list.get(i)).getRCV_ISSUE_CTRL_CD());
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
			l_WORK_ODR_CD.add(((AE0100010Struct) list.get(i)).getWORK_ODR_CD());
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
			l_WORK_IN_PROC_CD.add(((AE0100010Struct) list.get(i)).getWORK_IN_PROC_CD());
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
			l_PUCH_ODR_CD.add(((AE0100010Struct) list.get(i)).getPUCH_ODR_CD());
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
			l_ISSUE_INST_CD.add(((AE0100010Struct) list.get(i)).getISSUE_INST_CD());
		}
		return size;
	}
	public int setL2L_RETURNED_WH_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RETURNED_WH_CD == null) {
			l_RETURNED_WH_CD = new ArrayList();
		} else {
			l_RETURNED_WH_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RETURNED_WH_CD.add(((AE0100010Struct) list.get(i)).getRETURNED_WH_CD());
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
			l_WH_NAME.add(((AE0100010Struct) list.get(i)).getWH_NAME());
		}
		return size;
	}
	public int setL2L_RETURNED_CAUSE_CD(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RETURNED_CAUSE_CD == null) {
			l_RETURNED_CAUSE_CD = new ArrayList();
		} else {
			l_RETURNED_CAUSE_CD.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RETURNED_CAUSE_CD.add(((AE0100010Struct) list.get(i)).getRETURNED_CAUSE_CD());
		}
		return size;
	}
	public int setL2L_RETURNED_GNR_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RETURNED_GNR_TYP == null) {
			l_RETURNED_GNR_TYP = new ArrayList();
		} else {
			l_RETURNED_GNR_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RETURNED_GNR_TYP.add(((AE0100010Struct) list.get(i)).getRETURNED_GNR_TYP());
		}
		return size;
	}
	public int setL2L_AP_PROC_TYP(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_AP_PROC_TYP == null) {
			l_AP_PROC_TYP = new ArrayList();
		} else {
			l_AP_PROC_TYP.clear();
		}
		for (int i = 0; i < size; i++) {
			l_AP_PROC_TYP.add(((AE0100010Struct) list.get(i)).getAP_PROC_TYP());
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
			l_MODIFY_COUNT.add(((AE0100010Struct) list.get(i)).getMODIFY_COUNT());
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
			l_STOCK_UNIT.add(((AE0100010Struct) list.get(i)).getSTOCK_UNIT());
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
			l_h_LOT_CTRL_FLG.add(((AE0100010Struct) list.get(i)).geth_LOT_CTRL_FLG());
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
			l_h_LOT_NUMBERING_TYP.add(((AE0100010Struct) list.get(i)).geth_LOT_NUMBERING_TYP());
		}
		return size;
	}
	public int setL2L_THIS_MONTH(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_THIS_MONTH == null) {
			l_THIS_MONTH = new ArrayList();
		} else {
			l_THIS_MONTH.clear();
		}
		for (int i = 0; i < size; i++) {
			l_THIS_MONTH.add(((AE0100010Struct) list.get(i)).getTHIS_MONTH());
		}
		return size;
	}
	public int setL2L_INSTALL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INSTALL_FLG == null) {
			l_INSTALL_FLG = new ArrayList();
		} else {
			l_INSTALL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INSTALL_FLG.add(((AE0100010Struct) list.get(i)).getINSTALL_FLG());
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
			l_UNIT_QTY_TYP.add(((AE0100010Struct) list.get(i)).getUNIT_QTY_TYP());
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
			l_SPL_ITEM_TYP.add(((AE0100010Struct) list.get(i)).getSPL_ITEM_TYP());
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
			l_PRODUCT_TYP.add(((AE0100010Struct) list.get(i)).getPRODUCT_TYP());
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
			l_CLASIFICATION_CD.add(((AE0100010Struct) list.get(i)).getCLASIFICATION_CD());
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
			l_MRP_ODR_TYP.add(((AE0100010Struct) list.get(i)).getMRP_ODR_TYP());
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
			l_WH_CD.add(((AE0100010Struct) list.get(i)).getWH_CD());
		}
		return size;
	}
	public int setL2L_PROCESSING_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PROCESSING_COST == null) {
			l_PROCESSING_COST = new ArrayList();
		} else {
			l_PROCESSING_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PROCESSING_COST.add(((AE0100010Struct) list.get(i)).getPROCESSING_COST());
		}
		return size;
	}
	public int setL2L_MATERIAL_COST(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MATERIAL_COST == null) {
			l_MATERIAL_COST = new ArrayList();
		} else {
			l_MATERIAL_COST.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MATERIAL_COST.add(((AE0100010Struct) list.get(i)).getMATERIAL_COST());
		}
		return size;
	}
	public int setL2L_OTHER_OVERHEADS(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_OTHER_OVERHEADS == null) {
			l_OTHER_OVERHEADS = new ArrayList();
		} else {
			l_OTHER_OVERHEADS.clear();
		}
		for (int i = 0; i < size; i++) {
			l_OTHER_OVERHEADS.add(((AE0100010Struct) list.get(i)).getOTHER_OVERHEADS());
		}
		return size;
	}
	public int setL2L_MRP_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_MRP_FLG == null) {
			l_MRP_FLG = new ArrayList();
		} else {
			l_MRP_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_MRP_FLG.add(((AE0100010Struct) list.get(i)).getMRP_FLG());
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
			l_VALUE.add(((AE0100010Struct) list.get(i)).getVALUE());
		}
		return size;
	}
	public int setL2L_NAME(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_NAME == null) {
			l_NAME = new ArrayList();
		} else {
			l_NAME.clear();
		}
		for (int i = 0; i < size; i++) {
			l_NAME.add(((AE0100010Struct) list.get(i)).getNAME());
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
			l_EFF_PHASE_IN_DATE.add(((AE0100010Struct) list.get(i)).getEFF_PHASE_IN_DATE());
		}
		return size;
	}
	public int setL2L_ONEROUS_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ONEROUS_FLG == null) {
			l_ONEROUS_FLG = new ArrayList();
		} else {
			l_ONEROUS_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ONEROUS_FLG.add(((AE0100010Struct) list.get(i)).getONEROUS_FLG());
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
			l_STOCK_ON_HAND_QTY.add(((AE0100010Struct) list.get(i)).getSTOCK_ON_HAND_QTY());
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
			l_RCV_ISSUE_TYP.add(((AE0100010Struct) list.get(i)).getRCV_ISSUE_TYP());
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
			l_ACPT_NO.add(((AE0100010Struct) list.get(i)).getACPT_NO());
		}
		return size;
	}
	public int setL2L_ACPT_RSLT_CRCT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_ACPT_RSLT_CRCT_NO == null) {
			l_ACPT_RSLT_CRCT_NO = new ArrayList();
		} else {
			l_ACPT_RSLT_CRCT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_ACPT_RSLT_CRCT_NO.add(((AE0100010Struct) list.get(i)).getACPT_RSLT_CRCT_NO());
		}
		return size;
	}
	public int setL2L_INSPEC_RSLT_CRCT_NO(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_INSPEC_RSLT_CRCT_NO == null) {
			l_INSPEC_RSLT_CRCT_NO = new ArrayList();
		} else {
			l_INSPEC_RSLT_CRCT_NO.clear();
		}
		for (int i = 0; i < size; i++) {
			l_INSPEC_RSLT_CRCT_NO.add(((AE0100010Struct) list.get(i)).getINSPEC_RSLT_CRCT_NO());
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
			l_PARTIAL_PRD_NO.add(((AE0100010Struct) list.get(i)).getPARTIAL_PRD_NO());
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
			l_OPR_RSLT_CRCT_NO.add(((AE0100010Struct) list.get(i)).getOPR_RSLT_CRCT_NO());
		}
		return size;
	}
	public int setL2L_RCV_ISSUE_BEFORE_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_ISSUE_BEFORE_QTY == null) {
			l_RCV_ISSUE_BEFORE_QTY = new ArrayList();
		} else {
			l_RCV_ISSUE_BEFORE_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_ISSUE_BEFORE_QTY.add(((AE0100010Struct) list.get(i)).getRCV_ISSUE_BEFORE_QTY());
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
			l_RCV_ISSUE_QTY.add(((AE0100010Struct) list.get(i)).getRCV_ISSUE_QTY());
		}
		return size;
	}
	public int setL2L_RCV_ISSUE_AFTER_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_ISSUE_AFTER_QTY == null) {
			l_RCV_ISSUE_AFTER_QTY = new ArrayList();
		} else {
			l_RCV_ISSUE_AFTER_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_ISSUE_AFTER_QTY.add(((AE0100010Struct) list.get(i)).getRCV_ISSUE_AFTER_QTY());
		}
		return size;
	}
	public int setL2L_RCV_ISSUE_AMOUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_RCV_ISSUE_AMOUNT == null) {
			l_RCV_ISSUE_AMOUNT = new ArrayList();
		} else {
			l_RCV_ISSUE_AMOUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_RCV_ISSUE_AMOUNT.add(((AE0100010Struct) list.get(i)).getRCV_ISSUE_AMOUNT());
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
			l_RCV_ISSUE_DATE.add(((AE0100010Struct) list.get(i)).getRCV_ISSUE_DATE());
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
			l_RCV_ISSUE_GNR_TYP.add(((AE0100010Struct) list.get(i)).getRCV_ISSUE_GNR_TYP());
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
			l_RCV_ISSUE_ODD_QTY.add(((AE0100010Struct) list.get(i)).getRCV_ISSUE_ODD_QTY());
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
			l_STOCK_UPD_TYP.add(((AE0100010Struct) list.get(i)).getSTOCK_UPD_TYP());
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
			l_RCV_ISSUE_CMPLT_FLG.add(((AE0100010Struct) list.get(i)).getRCV_ISSUE_CMPLT_FLG());
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
			l_CONS_TYP.add(((AE0100010Struct) list.get(i)).getCONS_TYP());
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
			l_PAST_RESULT_ENTRY_TYP.add(((AE0100010Struct) list.get(i)).getPAST_RESULT_ENTRY_TYP());
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
			l_PROC_EXEC_DATE.add(((AE0100010Struct) list.get(i)).getPROC_EXEC_DATE());
		}
		return size;
	}
	public int setL2L_BEST_BEFORE_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_BEST_BEFORE_DATE == null) {
			l_BEST_BEFORE_DATE = new ArrayList();
		} else {
			l_BEST_BEFORE_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_BEST_BEFORE_DATE.add(((AE0100010Struct) list.get(i)).getBEST_BEFORE_DATE());
		}
		return size;
	}
	public int setL2L_LOT_MODIFY_COUNT(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOT_MODIFY_COUNT == null) {
			l_LOT_MODIFY_COUNT = new ArrayList();
		} else {
			l_LOT_MODIFY_COUNT.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOT_MODIFY_COUNT.add(((AE0100010Struct) list.get(i)).getLOT_MODIFY_COUNT());
		}
		return size;
	}
	public int setL2L_DEL_FLG(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_DEL_FLG == null) {
			l_DEL_FLG = new ArrayList();
		} else {
			l_DEL_FLG.clear();
		}
		for (int i = 0; i < size; i++) {
			l_DEL_FLG.add(((AE0100010Struct) list.get(i)).getDEL_FLG());
		}
		return size;
	}
	public int setL2L_PRD_CMPLT_DATE(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_PRD_CMPLT_DATE == null) {
			l_PRD_CMPLT_DATE = new ArrayList();
		} else {
			l_PRD_CMPLT_DATE.clear();
		}
		for (int i = 0; i < size; i++) {
			l_PRD_CMPLT_DATE.add(((AE0100010Struct) list.get(i)).getPRD_CMPLT_DATE());
		}
		return size;
	}
	public int setL2L_LOT_STOCK_ON_HAND_QTY(List list) {
		int size = (list != null) ? list.size() : 0;
		if (size == 0) {
			return 0;
		}
		if (l_LOT_STOCK_ON_HAND_QTY == null) {
			l_LOT_STOCK_ON_HAND_QTY = new ArrayList();
		} else {
			l_LOT_STOCK_ON_HAND_QTY.clear();
		}
		for (int i = 0; i < size; i++) {
			l_LOT_STOCK_ON_HAND_QTY.add(((AE0100010Struct) list.get(i)).getLOT_STOCK_ON_HAND_QTY());
		}
		return size;
	}

	//////////////////////////////

	public void clear()
	{
		m_UNIT_COST_TYP_name = null;
		m_UNIT_COST_TYP_val = null;
		m_SelectUnitCostFlag = null;
		m_r1_FILTER = null;
		m_PUCH_ODR_AMOUNT = null;
		m_r2_FILTER = null;
		m_r3_FILTER = null;
		m_c_ONEROUS_CONS_INV_TYP = null;
		m_h_ONEROUS_CONS_NO = null;
		m_h_ISSUE_DATE = null;
		m_h_LOT_NO_2 = null;
		m_h_LOTCTRL = null;
		m_ONEROUS_CONS_NO = null;
		m_COMPANY_CD = null;
		m_VEND_CD = null;
		m_VEND_ANAME = null;
		m_ROUND_TYP = null;
		m_VEND_CUR_UNIT = null;
		m_VEND_DECIMAL_FIG = null;
		m_PLANT_CD = null;
		m_JOB_ODR_CD = null;
		m_JOB_ODR_DETAIL_NO = null;
		m_ITEM_CD = null;
		m_ITEM_NAME = null;
		m_ISSUE_DATE = null;
		m_ISSUE_QTY = null;
		m_UNIT_COST = null;
		m_UNIT_COST_TYP = null;
		m_ONEROUS_CONS_COMMENT = null;
		m_LOT_NO = null;
		m_VEND_LOT_NO = null;
		m_RCV_ISSUE_CTRL_CD = null;
		m_WORK_ODR_CD = null;
		m_WORK_IN_PROC_CD = null;
		m_PUCH_ODR_CD = null;
		m_ISSUE_INST_CD = null;
		m_RETURNED_WH_CD = null;
		m_WH_NAME = null;
		m_RETURNED_CAUSE_CD = null;
		m_RETURNED_GNR_TYP = null;
		m_AP_PROC_TYP = null;
		m_MODIFY_COUNT = null;
		m_STOCK_UNIT = null;
		m_h_LOT_CTRL_FLG = null;
		m_h_LOT_NUMBERING_TYP = null;
		m_THIS_MONTH = null;
		m_INSTALL_FLG = null;
		m_UNIT_QTY_TYP = null;
		m_SPL_ITEM_TYP = null;
		m_PRODUCT_TYP = null;
		m_CLASIFICATION_CD = null;
		m_MRP_ODR_TYP = null;
		m_WH_CD = null;
		m_PROCESSING_COST = null;
		m_MATERIAL_COST = null;
		m_OTHER_OVERHEADS = null;
		m_MRP_FLG = null;
		m_VALUE = null;
		m_NAME = null;
		m_EFF_PHASE_IN_DATE = null;
		m_ONEROUS_FLG = null;
		m_STOCK_ON_HAND_QTY = null;
		m_RCV_ISSUE_TYP = null;
		m_ACPT_NO = null;
		m_ACPT_RSLT_CRCT_NO = null;
		m_INSPEC_RSLT_CRCT_NO = null;
		m_PARTIAL_PRD_NO = null;
		m_OPR_RSLT_CRCT_NO = null;
		m_RCV_ISSUE_BEFORE_QTY = null;
		m_RCV_ISSUE_QTY = null;
		m_RCV_ISSUE_AFTER_QTY = null;
		m_RCV_ISSUE_AMOUNT = null;
		m_RCV_ISSUE_DATE = null;
		m_RCV_ISSUE_GNR_TYP = null;
		m_RCV_ISSUE_ODD_QTY = null;
		m_STOCK_UPD_TYP = null;
		m_RCV_ISSUE_CMPLT_FLG = null;
		m_CONS_TYP = null;
		m_PAST_RESULT_ENTRY_TYP = null;
		m_PROC_EXEC_DATE = null;
		m_BEST_BEFORE_DATE = null;
		m_LOT_MODIFY_COUNT = null;
		m_DEL_FLG = null;
		m_PRD_CMPLT_DATE = null;
		m_LOT_STOCK_ON_HAND_QTY = null;

		l_UNIT_COST_TYP_name = null;
		l_UNIT_COST_TYP_val = null;
		l_SelectUnitCostFlag = null;
		l_r1_FILTER = null;
		l_PUCH_ODR_AMOUNT = null;
		l_r2_FILTER = null;
		l_r3_FILTER = null;
		l_c_ONEROUS_CONS_INV_TYP = null;
		l_h_ONEROUS_CONS_NO = null;
		l_h_ISSUE_DATE = null;
		l_h_LOT_NO_2 = null;
		l_h_LOTCTRL = null;
		l_ONEROUS_CONS_NO = null;
		l_COMPANY_CD = null;
		l_VEND_CD = null;
		l_VEND_ANAME = null;
		l_ROUND_TYP = null;
		l_VEND_CUR_UNIT = null;
		l_VEND_DECIMAL_FIG = null;
		l_PLANT_CD = null;
		l_JOB_ODR_CD = null;
		l_JOB_ODR_DETAIL_NO = null;
		l_ITEM_CD = null;
		l_ITEM_NAME = null;
		l_ISSUE_DATE = null;
		l_ISSUE_QTY = null;
		l_UNIT_COST = null;
		l_UNIT_COST_TYP = null;
		l_ONEROUS_CONS_COMMENT = null;
		l_LOT_NO = null;
		l_VEND_LOT_NO = null;
		l_RCV_ISSUE_CTRL_CD = null;
		l_WORK_ODR_CD = null;
		l_WORK_IN_PROC_CD = null;
		l_PUCH_ODR_CD = null;
		l_ISSUE_INST_CD = null;
		l_RETURNED_WH_CD = null;
		l_WH_NAME = null;
		l_RETURNED_CAUSE_CD = null;
		l_RETURNED_GNR_TYP = null;
		l_AP_PROC_TYP = null;
		l_MODIFY_COUNT = null;
		l_STOCK_UNIT = null;
		l_h_LOT_CTRL_FLG = null;
		l_h_LOT_NUMBERING_TYP = null;
		l_THIS_MONTH = null;
		l_INSTALL_FLG = null;
		l_UNIT_QTY_TYP = null;
		l_SPL_ITEM_TYP = null;
		l_PRODUCT_TYP = null;
		l_CLASIFICATION_CD = null;
		l_MRP_ODR_TYP = null;
		l_WH_CD = null;
		l_PROCESSING_COST = null;
		l_MATERIAL_COST = null;
		l_OTHER_OVERHEADS = null;
		l_MRP_FLG = null;
		l_VALUE = null;
		l_NAME = null;
		l_EFF_PHASE_IN_DATE = null;
		l_ONEROUS_FLG = null;
		l_STOCK_ON_HAND_QTY = null;
		l_RCV_ISSUE_TYP = null;
		l_ACPT_NO = null;
		l_ACPT_RSLT_CRCT_NO = null;
		l_INSPEC_RSLT_CRCT_NO = null;
		l_PARTIAL_PRD_NO = null;
		l_OPR_RSLT_CRCT_NO = null;
		l_RCV_ISSUE_BEFORE_QTY = null;
		l_RCV_ISSUE_QTY = null;
		l_RCV_ISSUE_AFTER_QTY = null;
		l_RCV_ISSUE_AMOUNT = null;
		l_RCV_ISSUE_DATE = null;
		l_RCV_ISSUE_GNR_TYP = null;
		l_RCV_ISSUE_ODD_QTY = null;
		l_STOCK_UPD_TYP = null;
		l_RCV_ISSUE_CMPLT_FLG = null;
		l_CONS_TYP = null;
		l_PAST_RESULT_ENTRY_TYP = null;
		l_PROC_EXEC_DATE = null;
		l_BEST_BEFORE_DATE = null;
		l_LOT_MODIFY_COUNT = null;
		l_DEL_FLG = null;
		l_PRD_CMPLT_DATE = null;
		l_LOT_STOCK_ON_HAND_QTY = null;

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
	 * medAE0100010�N���X�̕W���R���X�g���N�^
	 */
	public AE0100010Struct()
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
	public void setStruct(AE0100010Struct struct)
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
	public void setStructM(AE0100010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setUNIT_COST_TYP_name(struct.getUNIT_COST_TYP_name());
			this.setUNIT_COST_TYP_val(struct.getUNIT_COST_TYP_val());
			this.setSelectUnitCostFlag(struct.getSelectUnitCostFlag());
			this.setr1_FILTER(struct.getr1_FILTER());
			this.setPUCH_ODR_AMOUNT(struct.getPUCH_ODR_AMOUNT());
			this.setr2_FILTER(struct.getr2_FILTER());
			this.setr3_FILTER(struct.getr3_FILTER());
			this.setc_ONEROUS_CONS_INV_TYP(struct.getc_ONEROUS_CONS_INV_TYP());
			this.seth_ONEROUS_CONS_NO(struct.geth_ONEROUS_CONS_NO());
			this.seth_ISSUE_DATE(struct.geth_ISSUE_DATE());
			this.seth_LOT_NO_2(struct.geth_LOT_NO_2());
			this.seth_LOTCTRL(struct.geth_LOTCTRL());
			this.setONEROUS_CONS_NO(struct.getONEROUS_CONS_NO());
			this.setCOMPANY_CD(struct.getCOMPANY_CD());
			this.setVEND_CD(struct.getVEND_CD());
			this.setVEND_ANAME(struct.getVEND_ANAME());
			this.setROUND_TYP(struct.getROUND_TYP());
			this.setVEND_CUR_UNIT(struct.getVEND_CUR_UNIT());
			this.setVEND_DECIMAL_FIG(struct.getVEND_DECIMAL_FIG());
			this.setPLANT_CD(struct.getPLANT_CD());
			this.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			this.setJOB_ODR_DETAIL_NO(struct.getJOB_ODR_DETAIL_NO());
			this.setITEM_CD(struct.getITEM_CD());
			this.setITEM_NAME(struct.getITEM_NAME());
			this.setISSUE_DATE(struct.getISSUE_DATE());
			this.setISSUE_QTY(struct.getISSUE_QTY());
			this.setUNIT_COST(struct.getUNIT_COST());
			this.setUNIT_COST_TYP(struct.getUNIT_COST_TYP());
			this.setONEROUS_CONS_COMMENT(struct.getONEROUS_CONS_COMMENT());
			this.setLOT_NO(struct.getLOT_NO());
			this.setVEND_LOT_NO(struct.getVEND_LOT_NO());
			this.setRCV_ISSUE_CTRL_CD(struct.getRCV_ISSUE_CTRL_CD());
			this.setWORK_ODR_CD(struct.getWORK_ODR_CD());
			this.setWORK_IN_PROC_CD(struct.getWORK_IN_PROC_CD());
			this.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());
			this.setISSUE_INST_CD(struct.getISSUE_INST_CD());
			this.setRETURNED_WH_CD(struct.getRETURNED_WH_CD());
			this.setWH_NAME(struct.getWH_NAME());
			this.setRETURNED_CAUSE_CD(struct.getRETURNED_CAUSE_CD());
			this.setRETURNED_GNR_TYP(struct.getRETURNED_GNR_TYP());
			this.setAP_PROC_TYP(struct.getAP_PROC_TYP());
			this.setMODIFY_COUNT(struct.getMODIFY_COUNT());
			this.setSTOCK_UNIT(struct.getSTOCK_UNIT());
			this.seth_LOT_CTRL_FLG(struct.geth_LOT_CTRL_FLG());
			this.seth_LOT_NUMBERING_TYP(struct.geth_LOT_NUMBERING_TYP());
			this.setTHIS_MONTH(struct.getTHIS_MONTH());
			this.setINSTALL_FLG(struct.getINSTALL_FLG());
			this.setUNIT_QTY_TYP(struct.getUNIT_QTY_TYP());
			this.setSPL_ITEM_TYP(struct.getSPL_ITEM_TYP());
			this.setPRODUCT_TYP(struct.getPRODUCT_TYP());
			this.setCLASIFICATION_CD(struct.getCLASIFICATION_CD());
			this.setMRP_ODR_TYP(struct.getMRP_ODR_TYP());
			this.setWH_CD(struct.getWH_CD());
			this.setPROCESSING_COST(struct.getPROCESSING_COST());
			this.setMATERIAL_COST(struct.getMATERIAL_COST());
			this.setOTHER_OVERHEADS(struct.getOTHER_OVERHEADS());
			this.setMRP_FLG(struct.getMRP_FLG());
			this.setVALUE(struct.getVALUE());
			this.setNAME(struct.getNAME());
			this.setEFF_PHASE_IN_DATE(struct.getEFF_PHASE_IN_DATE());
			this.setONEROUS_FLG(struct.getONEROUS_FLG());
			this.setSTOCK_ON_HAND_QTY(struct.getSTOCK_ON_HAND_QTY());
			this.setRCV_ISSUE_TYP(struct.getRCV_ISSUE_TYP());
			this.setACPT_NO(struct.getACPT_NO());
			this.setACPT_RSLT_CRCT_NO(struct.getACPT_RSLT_CRCT_NO());
			this.setINSPEC_RSLT_CRCT_NO(struct.getINSPEC_RSLT_CRCT_NO());
			this.setPARTIAL_PRD_NO(struct.getPARTIAL_PRD_NO());
			this.setOPR_RSLT_CRCT_NO(struct.getOPR_RSLT_CRCT_NO());
			this.setRCV_ISSUE_BEFORE_QTY(struct.getRCV_ISSUE_BEFORE_QTY());
			this.setRCV_ISSUE_QTY(struct.getRCV_ISSUE_QTY());
			this.setRCV_ISSUE_AFTER_QTY(struct.getRCV_ISSUE_AFTER_QTY());
			this.setRCV_ISSUE_AMOUNT(struct.getRCV_ISSUE_AMOUNT());
			this.setRCV_ISSUE_DATE(struct.getRCV_ISSUE_DATE());
			this.setRCV_ISSUE_GNR_TYP(struct.getRCV_ISSUE_GNR_TYP());
			this.setRCV_ISSUE_ODD_QTY(struct.getRCV_ISSUE_ODD_QTY());
			this.setSTOCK_UPD_TYP(struct.getSTOCK_UPD_TYP());
			this.setRCV_ISSUE_CMPLT_FLG(struct.getRCV_ISSUE_CMPLT_FLG());
			this.setCONS_TYP(struct.getCONS_TYP());
			this.setPAST_RESULT_ENTRY_TYP(struct.getPAST_RESULT_ENTRY_TYP());
			this.setPROC_EXEC_DATE(struct.getPROC_EXEC_DATE());
			this.setBEST_BEFORE_DATE(struct.getBEST_BEFORE_DATE());
			this.setLOT_MODIFY_COUNT(struct.getLOT_MODIFY_COUNT());
			this.setDEL_FLG(struct.getDEL_FLG());
			this.setPRD_CMPLT_DATE(struct.getPRD_CMPLT_DATE());
			this.setLOT_STOCK_ON_HAND_QTY(struct.getLOT_STOCK_ON_HAND_QTY());
		}
	}

	/**
	 * �f�[�^�̃Z�b�g(���X�g�����o�̂�)
	 *
	 * @param struct �Z�b�g���錳��Struct
	 */
	public void setStructL(AE0100010Struct struct)
	{
		if (struct == null) {
			clear();
		} else {
			this.setList_UNIT_COST_TYP_name(struct.getList_UNIT_COST_TYP_name());
			this.setList_UNIT_COST_TYP_val(struct.getList_UNIT_COST_TYP_val());
			this.setList_SelectUnitCostFlag(struct.getList_SelectUnitCostFlag());
			this.setList_r1_FILTER(struct.getList_r1_FILTER());
			this.setList_PUCH_ODR_AMOUNT(struct.getList_PUCH_ODR_AMOUNT());
			this.setList_r2_FILTER(struct.getList_r2_FILTER());
			this.setList_r3_FILTER(struct.getList_r3_FILTER());
			this.setList_c_ONEROUS_CONS_INV_TYP(struct.getList_c_ONEROUS_CONS_INV_TYP());
			this.setList_h_ONEROUS_CONS_NO(struct.getList_h_ONEROUS_CONS_NO());
			this.setList_h_ISSUE_DATE(struct.getList_h_ISSUE_DATE());
			this.setList_h_LOT_NO_2(struct.getList_h_LOT_NO_2());
			this.setList_h_LOTCTRL(struct.getList_h_LOTCTRL());
			this.setList_ONEROUS_CONS_NO(struct.getList_ONEROUS_CONS_NO());
			this.setList_COMPANY_CD(struct.getList_COMPANY_CD());
			this.setList_VEND_CD(struct.getList_VEND_CD());
			this.setList_VEND_ANAME(struct.getList_VEND_ANAME());
			this.setList_ROUND_TYP(struct.getList_ROUND_TYP());
			this.setList_VEND_CUR_UNIT(struct.getList_VEND_CUR_UNIT());
			this.setList_VEND_DECIMAL_FIG(struct.getList_VEND_DECIMAL_FIG());
			this.setList_PLANT_CD(struct.getList_PLANT_CD());
			this.setList_JOB_ODR_CD(struct.getList_JOB_ODR_CD());
			this.setList_JOB_ODR_DETAIL_NO(struct.getList_JOB_ODR_DETAIL_NO());
			this.setList_ITEM_CD(struct.getList_ITEM_CD());
			this.setList_ITEM_NAME(struct.getList_ITEM_NAME());
			this.setList_ISSUE_DATE(struct.getList_ISSUE_DATE());
			this.setList_ISSUE_QTY(struct.getList_ISSUE_QTY());
			this.setList_UNIT_COST(struct.getList_UNIT_COST());
			this.setList_UNIT_COST_TYP(struct.getList_UNIT_COST_TYP());
			this.setList_ONEROUS_CONS_COMMENT(struct.getList_ONEROUS_CONS_COMMENT());
			this.setList_LOT_NO(struct.getList_LOT_NO());
			this.setList_VEND_LOT_NO(struct.getList_VEND_LOT_NO());
			this.setList_RCV_ISSUE_CTRL_CD(struct.getList_RCV_ISSUE_CTRL_CD());
			this.setList_WORK_ODR_CD(struct.getList_WORK_ODR_CD());
			this.setList_WORK_IN_PROC_CD(struct.getList_WORK_IN_PROC_CD());
			this.setList_PUCH_ODR_CD(struct.getList_PUCH_ODR_CD());
			this.setList_ISSUE_INST_CD(struct.getList_ISSUE_INST_CD());
			this.setList_RETURNED_WH_CD(struct.getList_RETURNED_WH_CD());
			this.setList_WH_NAME(struct.getList_WH_NAME());
			this.setList_RETURNED_CAUSE_CD(struct.getList_RETURNED_CAUSE_CD());
			this.setList_RETURNED_GNR_TYP(struct.getList_RETURNED_GNR_TYP());
			this.setList_AP_PROC_TYP(struct.getList_AP_PROC_TYP());
			this.setList_MODIFY_COUNT(struct.getList_MODIFY_COUNT());
			this.setList_STOCK_UNIT(struct.getList_STOCK_UNIT());
			this.setList_h_LOT_CTRL_FLG(struct.getList_h_LOT_CTRL_FLG());
			this.setList_h_LOT_NUMBERING_TYP(struct.getList_h_LOT_NUMBERING_TYP());
			this.setList_THIS_MONTH(struct.getList_THIS_MONTH());
			this.setList_INSTALL_FLG(struct.getList_INSTALL_FLG());
			this.setList_UNIT_QTY_TYP(struct.getList_UNIT_QTY_TYP());
			this.setList_SPL_ITEM_TYP(struct.getList_SPL_ITEM_TYP());
			this.setList_PRODUCT_TYP(struct.getList_PRODUCT_TYP());
			this.setList_CLASIFICATION_CD(struct.getList_CLASIFICATION_CD());
			this.setList_MRP_ODR_TYP(struct.getList_MRP_ODR_TYP());
			this.setList_WH_CD(struct.getList_WH_CD());
			this.setList_PROCESSING_COST(struct.getList_PROCESSING_COST());
			this.setList_MATERIAL_COST(struct.getList_MATERIAL_COST());
			this.setList_OTHER_OVERHEADS(struct.getList_OTHER_OVERHEADS());
			this.setList_MRP_FLG(struct.getList_MRP_FLG());
			this.setList_VALUE(struct.getList_VALUE());
			this.setList_NAME(struct.getList_NAME());
			this.setList_EFF_PHASE_IN_DATE(struct.getList_EFF_PHASE_IN_DATE());
			this.setList_ONEROUS_FLG(struct.getList_ONEROUS_FLG());
			this.setList_STOCK_ON_HAND_QTY(struct.getList_STOCK_ON_HAND_QTY());
			this.setList_RCV_ISSUE_TYP(struct.getList_RCV_ISSUE_TYP());
			this.setList_ACPT_NO(struct.getList_ACPT_NO());
			this.setList_ACPT_RSLT_CRCT_NO(struct.getList_ACPT_RSLT_CRCT_NO());
			this.setList_INSPEC_RSLT_CRCT_NO(struct.getList_INSPEC_RSLT_CRCT_NO());
			this.setList_PARTIAL_PRD_NO(struct.getList_PARTIAL_PRD_NO());
			this.setList_OPR_RSLT_CRCT_NO(struct.getList_OPR_RSLT_CRCT_NO());
			this.setList_RCV_ISSUE_BEFORE_QTY(struct.getList_RCV_ISSUE_BEFORE_QTY());
			this.setList_RCV_ISSUE_QTY(struct.getList_RCV_ISSUE_QTY());
			this.setList_RCV_ISSUE_AFTER_QTY(struct.getList_RCV_ISSUE_AFTER_QTY());
			this.setList_RCV_ISSUE_AMOUNT(struct.getList_RCV_ISSUE_AMOUNT());
			this.setList_RCV_ISSUE_DATE(struct.getList_RCV_ISSUE_DATE());
			this.setList_RCV_ISSUE_GNR_TYP(struct.getList_RCV_ISSUE_GNR_TYP());
			this.setList_RCV_ISSUE_ODD_QTY(struct.getList_RCV_ISSUE_ODD_QTY());
			this.setList_STOCK_UPD_TYP(struct.getList_STOCK_UPD_TYP());
			this.setList_RCV_ISSUE_CMPLT_FLG(struct.getList_RCV_ISSUE_CMPLT_FLG());
			this.setList_CONS_TYP(struct.getList_CONS_TYP());
			this.setList_PAST_RESULT_ENTRY_TYP(struct.getList_PAST_RESULT_ENTRY_TYP());
			this.setList_PROC_EXEC_DATE(struct.getList_PROC_EXEC_DATE());
			this.setList_BEST_BEFORE_DATE(struct.getList_BEST_BEFORE_DATE());
			this.setList_LOT_MODIFY_COUNT(struct.getList_LOT_MODIFY_COUNT());
			this.setList_DEL_FLG(struct.getList_DEL_FLG());
			this.setList_PRD_CMPLT_DATE(struct.getList_PRD_CMPLT_DATE());
			this.setList_LOT_STOCK_ON_HAND_QTY(struct.getList_LOT_STOCK_ON_HAND_QTY());
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
	// �� 1 �ϐ������l�F i_UNIT_COST_TYP_name


	final static String i_UNIT_COST_TYP_name = null;

	// �� 2 �ϐ������l�F i_UNIT_COST_TYP_val


	final static String i_UNIT_COST_TYP_val = null;

	// �� 3 �ϐ������l�F i_SelectUnitCostFlag


	final static String i_SelectUnitCostFlag = null;

	// �� 4 �ϐ������l�F i_r1_FILTER


	final static String i_r1_FILTER = null;

	// �� 5 �ϐ������l�F i_PUCH_ODR_AMOUNT


	final static String i_PUCH_ODR_AMOUNT = null;

	// �� 6 �ϐ������l�F i_r2_FILTER


	final static String i_r2_FILTER = null;

	// �� 7 �ϐ������l�F i_r3_FILTER


	final static String i_r3_FILTER = null;

	// �� 8 �ϐ������l�F i_c_ONEROUS_CONS_INV_TYP


	final static String i_c_ONEROUS_CONS_INV_TYP = null;

	// �� 9 �ϐ������l�F i_h_ONEROUS_CONS_NO


	final static String i_h_ONEROUS_CONS_NO = null;

	// �� 10 �ϐ������l�F i_h_ISSUE_DATE


	final static String i_h_ISSUE_DATE = null;

	// �� 11 �ϐ������l�F i_h_LOT_NO_2


	final static String i_h_LOT_NO_2 = null;

	// �� 12 �ϐ������l�F i_h_LOTCTRL


	final static String i_h_LOTCTRL = null;

	// �� 13 �ϐ������l�F i_ONEROUS_CONS_NO


	final static String i_ONEROUS_CONS_NO = null;

	// �� 14 �ϐ������l�F i_COMPANY_CD


	final static String i_COMPANY_CD = null;

	// �� 15 �ϐ������l�F i_VEND_CD


	final static String i_VEND_CD = null;

	// �� 16 �ϐ������l�F i_VEND_ANAME


	final static String i_VEND_ANAME = null;

	// �� 17 �ϐ������l�F i_ROUND_TYP


	final static String i_ROUND_TYP = null;

	// �� 18 �ϐ������l�F i_VEND_CUR_UNIT


	final static String i_VEND_CUR_UNIT = null;

	// �� 19 �ϐ������l�F i_VEND_DECIMAL_FIG


	final static String i_VEND_DECIMAL_FIG = null;

	// �� 20 �ϐ������l�F i_PLANT_CD


	final static String i_PLANT_CD = null;

	// �� 21 �ϐ������l�F i_JOB_ODR_CD


	final static String i_JOB_ODR_CD = null;

	// �� 22 �ϐ������l�F i_JOB_ODR_DETAIL_NO


	final static String i_JOB_ODR_DETAIL_NO = null;

	// �� 23 �ϐ������l�F i_ITEM_CD


	final static String i_ITEM_CD = null;

	// �� 24 �ϐ������l�F i_ITEM_NAME


	final static String i_ITEM_NAME = null;

	// �� 25 �ϐ������l�F i_ISSUE_DATE


	final static String i_ISSUE_DATE = null;

	// �� 26 �ϐ������l�F i_ISSUE_QTY


	final static String i_ISSUE_QTY = null;

	// �� 27 �ϐ������l�F i_UNIT_COST


	final static String i_UNIT_COST = null;

	// �� 28 �ϐ������l�F i_UNIT_COST_TYP


	final static String i_UNIT_COST_TYP = null;

	// �� 29 �ϐ������l�F i_ONEROUS_CONS_COMMENT


	final static String i_ONEROUS_CONS_COMMENT = null;

	// �� 30 �ϐ������l�F i_LOT_NO


	final static String i_LOT_NO = null;

	// �� 31 �ϐ������l�F i_VEND_LOT_NO


	final static String i_VEND_LOT_NO = null;

	// �� 32 �ϐ������l�F i_RCV_ISSUE_CTRL_CD


	final static String i_RCV_ISSUE_CTRL_CD = null;

	// �� 33 �ϐ������l�F i_WORK_ODR_CD


	final static String i_WORK_ODR_CD = null;

	// �� 34 �ϐ������l�F i_WORK_IN_PROC_CD


	final static String i_WORK_IN_PROC_CD = null;

	// �� 35 �ϐ������l�F i_PUCH_ODR_CD


	final static String i_PUCH_ODR_CD = null;

	// �� 36 �ϐ������l�F i_ISSUE_INST_CD


	final static String i_ISSUE_INST_CD = null;

	// �� 37 �ϐ������l�F i_RETURNED_WH_CD


	final static String i_RETURNED_WH_CD = null;

	// �� 38 �ϐ������l�F i_WH_NAME


	final static String i_WH_NAME = null;

	// �� 39 �ϐ������l�F i_RETURNED_CAUSE_CD


	final static String i_RETURNED_CAUSE_CD = null;

	// �� 40 �ϐ������l�F i_RETURNED_GNR_TYP


	final static String i_RETURNED_GNR_TYP = null;

	// �� 41 �ϐ������l�F i_AP_PROC_TYP


	final static String i_AP_PROC_TYP = null;

	// �� 42 �ϐ������l�F i_MODIFY_COUNT


	final static String i_MODIFY_COUNT = null;

	// �� 43 �ϐ������l�F i_STOCK_UNIT


	final static String i_STOCK_UNIT = null;

	// �� 44 �ϐ������l�F i_h_LOT_CTRL_FLG


	final static String i_h_LOT_CTRL_FLG = null;

	// �� 45 �ϐ������l�F i_h_LOT_NUMBERING_TYP


	final static String i_h_LOT_NUMBERING_TYP = null;

	// �� 46 �ϐ������l�F i_THIS_MONTH


	final static String i_THIS_MONTH = null;

	// �� 47 �ϐ������l�F i_INSTALL_FLG


	final static String i_INSTALL_FLG = null;

	// �� 48 �ϐ������l�F i_UNIT_QTY_TYP


	final static String i_UNIT_QTY_TYP = null;

	// �� 49 �ϐ������l�F i_SPL_ITEM_TYP


	final static String i_SPL_ITEM_TYP = null;

	// �� 50 �ϐ������l�F i_PRODUCT_TYP


	final static String i_PRODUCT_TYP = null;

	// �� 51 �ϐ������l�F i_CLASIFICATION_CD


	final static String i_CLASIFICATION_CD = null;

	// �� 52 �ϐ������l�F i_MRP_ODR_TYP


	final static String i_MRP_ODR_TYP = null;

	// �� 53 �ϐ������l�F i_WH_CD


	final static String i_WH_CD = null;

	// �� 54 �ϐ������l�F i_PROCESSING_COST


	final static String i_PROCESSING_COST = null;

	// �� 55 �ϐ������l�F i_MATERIAL_COST


	final static String i_MATERIAL_COST = null;

	// �� 56 �ϐ������l�F i_OTHER_OVERHEADS


	final static String i_OTHER_OVERHEADS = null;

	// �� 57 �ϐ������l�F i_MRP_FLG


	final static String i_MRP_FLG = null;

	// �� 58 �ϐ������l�F i_VALUE


	final static String i_VALUE = null;

	// �� 59 �ϐ������l�F i_NAME


	final static String i_NAME = null;

	// �� 60 �ϐ������l�F i_EFF_PHASE_IN_DATE


	final static String i_EFF_PHASE_IN_DATE = null;

	// �� 61 �ϐ������l�F i_ONEROUS_FLG


	final static String i_ONEROUS_FLG = null;

	// �� 62 �ϐ������l�F i_STOCK_ON_HAND_QTY


	final static String i_STOCK_ON_HAND_QTY = null;

	// �� 63 �ϐ������l�F i_RCV_ISSUE_TYP


	final static String i_RCV_ISSUE_TYP = null;

	// �� 64 �ϐ������l�F i_ACPT_NO


	final static String i_ACPT_NO = null;

	// �� 65 �ϐ������l�F i_ACPT_RSLT_CRCT_NO


	final static String i_ACPT_RSLT_CRCT_NO = null;

	// �� 66 �ϐ������l�F i_INSPEC_RSLT_CRCT_NO


	final static String i_INSPEC_RSLT_CRCT_NO = null;

	// �� 67 �ϐ������l�F i_PARTIAL_PRD_NO


	final static String i_PARTIAL_PRD_NO = null;

	// �� 68 �ϐ������l�F i_OPR_RSLT_CRCT_NO


	final static String i_OPR_RSLT_CRCT_NO = null;

	// �� 69 �ϐ������l�F i_RCV_ISSUE_BEFORE_QTY


	final static String i_RCV_ISSUE_BEFORE_QTY = null;

	// �� 70 �ϐ������l�F i_RCV_ISSUE_QTY


	final static String i_RCV_ISSUE_QTY = null;

	// �� 71 �ϐ������l�F i_RCV_ISSUE_AFTER_QTY


	final static String i_RCV_ISSUE_AFTER_QTY = null;

	// �� 72 �ϐ������l�F i_RCV_ISSUE_AMOUNT


	final static String i_RCV_ISSUE_AMOUNT = null;

	// �� 73 �ϐ������l�F i_RCV_ISSUE_DATE


	final static String i_RCV_ISSUE_DATE = null;

	// �� 74 �ϐ������l�F i_RCV_ISSUE_GNR_TYP


	final static String i_RCV_ISSUE_GNR_TYP = null;

	// �� 75 �ϐ������l�F i_RCV_ISSUE_ODD_QTY


	final static String i_RCV_ISSUE_ODD_QTY = null;

	// �� 76 �ϐ������l�F i_STOCK_UPD_TYP


	final static String i_STOCK_UPD_TYP = null;

	// �� 77 �ϐ������l�F i_RCV_ISSUE_CMPLT_FLG


	final static String i_RCV_ISSUE_CMPLT_FLG = null;

	// �� 78 �ϐ������l�F i_CONS_TYP


	final static String i_CONS_TYP = null;

	// �� 79 �ϐ������l�F i_PAST_RESULT_ENTRY_TYP


	final static String i_PAST_RESULT_ENTRY_TYP = null;

	// �� 80 �ϐ������l�F i_PROC_EXEC_DATE


	final static BigDecimal i_PROC_EXEC_DATE = null;

	// �� 81 �ϐ������l�F i_BEST_BEFORE_DATE


	final static String i_BEST_BEFORE_DATE = null;

	// �� 82 �ϐ������l�F i_LOT_MODIFY_COUNT


	final static String i_LOT_MODIFY_COUNT = null;

	// �� 83 �ϐ������l�F i_DEL_FLG


	final static String i_DEL_FLG = null;

	// �� 84 �ϐ������l�F i_PRD_CMPLT_DATE


	final static String i_PRD_CMPLT_DATE = null;

	// �� 85 �ϐ������l�F i_LOT_STOCK_ON_HAND_QTY


	final static String i_LOT_STOCK_ON_HAND_QTY = null;

*/

	//{{user_implement_code
		// TODO: �������Ŏg���萔�́A�����ɋL�q���Ă��������B
		// �ȉ��ɋL�q�������e�͎����I�ɂ͕ύX����܂���B
	// �� 1 �ϐ������l�F i_UNIT_COST_TYP_name

	final static String i_UNIT_COST_TYP_name = null;

	// �� 2 �ϐ������l�F i_UNIT_COST_TYP_val

	final static String i_UNIT_COST_TYP_val = null;

	// �� 3 �ϐ������l�F i_SelectUnitCostFlag

	final static String i_SelectUnitCostFlag = null;

	// �� 4 �ϐ������l�F i_r1_FILTER

	final static String i_r1_FILTER = null;

	// �� 5 �ϐ������l�F i_PUCH_ODR_AMOUNT

	final static String i_PUCH_ODR_AMOUNT = null;

	// �� 6 �ϐ������l�F i_r2_FILTER

	final static String i_r2_FILTER = null;

	// �� 7 �ϐ������l�F i_r3_FILTER

	final static String i_r3_FILTER = null;

	// �� 8 �ϐ������l�F i_c_ONEROUS_CONS_INV_TYP

	final static String i_c_ONEROUS_CONS_INV_TYP = null;

	// �� 9 �ϐ������l�F i_h_ONEROUS_CONS_NO

	final static String i_h_ONEROUS_CONS_NO = null;

	// �� 10 �ϐ������l�F i_ONEROUS_CONS_NO

	final static String i_ONEROUS_CONS_NO = null;

	// �� 11 �ϐ������l�F i_COMPANY_CD

	final static String i_COMPANY_CD = null;

	// �� 12 �ϐ������l�F i_VEND_CD

	final static String i_VEND_CD = null;

	// �� 13 �ϐ������l�F i_VEND_ANAME

	final static String i_VEND_ANAME = null;

	// �� 14 �ϐ������l�F i_ROUND_TYP

	final static String i_ROUND_TYP = null;

	// �� 15 �ϐ������l�F i_VEND_CUR_UNIT

	final static String i_VEND_CUR_UNIT = null;

	// �� 16 �ϐ������l�F i_VEND_DECIMAL_FIG

	final static String i_VEND_DECIMAL_FIG = null;

	// �� 17 �ϐ������l�F i_PLANT_CD

	final static String i_PLANT_CD = null;

	// �� 18 �ϐ������l�F i_JOB_ODR_CD

	final static String i_JOB_ODR_CD = null;

	// �� 19 �ϐ������l�F i_JOB_ODR_DETAIL_NO

	final static String i_JOB_ODR_DETAIL_NO = null;

	// �� 20 �ϐ������l�F i_ITEM_CD

	final static String i_ITEM_CD = null;

	// �� 21 �ϐ������l�F i_ITEM_NAME

	final static String i_ITEM_NAME = null;

	// �� 22 �ϐ������l�F i_ISSUE_DATE

	final static String i_ISSUE_DATE = null;

	// �� 23 �ϐ������l�F i_ISSUE_QTY

	final static String i_ISSUE_QTY = null;

	// �� 24 �ϐ������l�F i_UNIT_COST

	final static String i_UNIT_COST = null;

	// �� 25 �ϐ������l�F i_UNIT_COST_TYP

	final static String i_UNIT_COST_TYP = null;

	// �� 26 �ϐ������l�F i_ONEROUS_CONS_COMMENT

	final static String i_ONEROUS_CONS_COMMENT = null;

	// �� 27 �ϐ������l�F i_VEND_LOT_NO

	final static String i_VEND_LOT_NO = null;

	// �� 28 �ϐ������l�F i_RCV_ISSUE_CTRL_CD

	final static String i_RCV_ISSUE_CTRL_CD = null;

	// �� 29 �ϐ������l�F i_WORK_ODR_CD

	final static String i_WORK_ODR_CD = null;

	// �� 30 �ϐ������l�F i_WORK_IN_PROC_CD

	final static String i_WORK_IN_PROC_CD = null;

	// �� 31 �ϐ������l�F i_PUCH_ODR_CD

	final static String i_PUCH_ODR_CD = null;

	// �� 32 �ϐ������l�F i_ISSUE_INST_CD

	final static String i_ISSUE_INST_CD = null;

	// �� 33 �ϐ������l�F i_RETURNED_WH_CD

	final static String i_RETURNED_WH_CD = null;

	// �� 34 �ϐ������l�F i_WH_NAME

	final static String i_WH_NAME = null;

	// �� 35 �ϐ������l�F i_RETURNED_CAUSE_CD

	final static String i_RETURNED_CAUSE_CD = null;

	// �� 36 �ϐ������l�F i_RETURNED_GNR_TYP

	final static String i_RETURNED_GNR_TYP = null;

	// �� 37 �ϐ������l�F i_AP_PROC_TYP

	final static String i_AP_PROC_TYP = null;

	// �� 38 �ϐ������l�F i_MODIFY_COUNT

	final static String i_MODIFY_COUNT = null;

	// �� 39 �ϐ������l�F i_THIS_MONTH

	final static String i_THIS_MONTH = null;

	// �� 40 �ϐ������l�F i_INSTALL_FLG

	final static String i_INSTALL_FLG = null;

	// �� 41 �ϐ������l�F i_STOCK_UNIT

	final static String i_STOCK_UNIT = null;

	// �� 42 �ϐ������l�F i_UNIT_QTY_TYP

	final static String i_UNIT_QTY_TYP = null;

	// �� 43 �ϐ������l�F i_SPL_ITEM_TYP

	final static String i_SPL_ITEM_TYP = null;

	// �� 44 �ϐ������l�F i_PRODUCT_TYP

	final static String i_PRODUCT_TYP = null;

	// �� 45 �ϐ������l�F i_CLASIFICATION_CD

	final static String i_CLASIFICATION_CD = null;

	// �� 46 �ϐ������l�F i_WH_CD

	final static String i_WH_CD = null;

	// �� 47 �ϐ������l�F i_PROCESSING_COST

	final static String i_PROCESSING_COST = null;

	// �� 48 �ϐ������l�F i_MATERIAL_COST

	final static String i_MATERIAL_COST = null;

	// �� 49 �ϐ������l�F i_OTHER_OVERHEADS

	final static String i_OTHER_OVERHEADS = null;

	// �� 50 �ϐ������l�F i_MRP_FLG

	final static String i_MRP_FLG = null;

	// �� 51 �ϐ������l�F i_VALUE

	final static String i_VALUE = null;

	// �� 52 �ϐ������l�F i_NAME

	final static String i_NAME = null;

	// �� 53 �ϐ������l�F i_EFF_PHASE_IN_DATE

	final static String i_EFF_PHASE_IN_DATE = null;

	// �� 54 �ϐ������l�F i_ONEROUS_FLG

	final static String i_ONEROUS_FLG = null;

	// �� 55 �ϐ������l�F i_STOCK_ON_HAND_QTY

	final static String i_STOCK_ON_HAND_QTY = null;

	// �� 56 �ϐ������l�F i_RCV_ISSUE_TYP

	final static String i_RCV_ISSUE_TYP = null;

	// �� 57 �ϐ������l�F i_ACPT_NO

	final static String i_ACPT_NO = null;

	// �� 58 �ϐ������l�F i_ACPT_RSLT_CRCT_NO

	final static String i_ACPT_RSLT_CRCT_NO = null;

	// �� 59 �ϐ������l�F i_INSPEC_RSLT_CRCT_NO

	final static String i_INSPEC_RSLT_CRCT_NO = null;

	// �� 60 �ϐ������l�F i_PARTIAL_PRD_NO

	final static String i_PARTIAL_PRD_NO = null;

	// �� 61 �ϐ������l�F i_OPR_RSLT_CRCT_NO

	final static String i_OPR_RSLT_CRCT_NO = null;

	// �� 62 �ϐ������l�F i_RCV_ISSUE_BEFORE_QTY

	final static String i_RCV_ISSUE_BEFORE_QTY = null;

	// �� 63 �ϐ������l�F i_RCV_ISSUE_QTY

	final static String i_RCV_ISSUE_QTY = null;

	// �� 64 �ϐ������l�F i_RCV_ISSUE_AFTER_QTY

	final static String i_RCV_ISSUE_AFTER_QTY = null;

	// �� 65 �ϐ������l�F i_RCV_ISSUE_AMOUNT

	final static String i_RCV_ISSUE_AMOUNT = null;

	// �� 66 �ϐ������l�F i_RCV_ISSUE_DATE

	final static String i_RCV_ISSUE_DATE = null;

	// �� 67 �ϐ������l�F i_RCV_ISSUE_GNR_TYP

	final static String i_RCV_ISSUE_GNR_TYP = null;

	// �� 68 �ϐ������l�F i_RCV_ISSUE_ODD_QTY

	final static String i_RCV_ISSUE_ODD_QTY = null;

	// �� 69 �ϐ������l�F i_STOCK_UPD_TYP

	final static String i_STOCK_UPD_TYP = null;

	// �� 70 �ϐ������l�F i_RCV_ISSUE_CMPLT_FLG

	final static String i_RCV_ISSUE_CMPLT_FLG = null;

	// �� 71 �ϐ������l�F i_CONS_TYP

	final static String i_CONS_TYP = null;


	/**
	 * ������
	 *
	 */
	public void initialize()
	{

		clear();

		m_UNIT_COST_TYP_name = i_UNIT_COST_TYP_name;
		m_UNIT_COST_TYP_val = i_UNIT_COST_TYP_val;
		m_SelectUnitCostFlag = i_SelectUnitCostFlag;
		m_r1_FILTER = i_r1_FILTER;
		m_PUCH_ODR_AMOUNT = i_PUCH_ODR_AMOUNT;
		m_r2_FILTER = i_r2_FILTER;
		m_r3_FILTER = i_r3_FILTER;
		m_c_ONEROUS_CONS_INV_TYP = i_c_ONEROUS_CONS_INV_TYP;
		m_h_ONEROUS_CONS_NO = i_h_ONEROUS_CONS_NO;
		m_ONEROUS_CONS_NO = i_ONEROUS_CONS_NO;
		m_COMPANY_CD = i_COMPANY_CD;
		m_VEND_CD = i_VEND_CD;
		m_VEND_ANAME = i_VEND_ANAME;
		m_ROUND_TYP = i_ROUND_TYP;
		m_VEND_CUR_UNIT = i_VEND_CUR_UNIT;
		m_VEND_DECIMAL_FIG = i_VEND_DECIMAL_FIG;
		m_PLANT_CD = i_PLANT_CD;
		m_JOB_ODR_CD = i_JOB_ODR_CD;
		m_JOB_ODR_DETAIL_NO = i_JOB_ODR_DETAIL_NO;
		m_ITEM_CD = i_ITEM_CD;
		m_ITEM_NAME = i_ITEM_NAME;
		m_ISSUE_DATE = i_ISSUE_DATE;
		m_ISSUE_QTY = i_ISSUE_QTY;
		m_UNIT_COST = i_UNIT_COST;
		m_UNIT_COST_TYP = i_UNIT_COST_TYP;
		m_ONEROUS_CONS_COMMENT = i_ONEROUS_CONS_COMMENT;
		m_VEND_LOT_NO = i_VEND_LOT_NO;
		m_RCV_ISSUE_CTRL_CD = i_RCV_ISSUE_CTRL_CD;
		m_WORK_ODR_CD = i_WORK_ODR_CD;
		m_WORK_IN_PROC_CD = i_WORK_IN_PROC_CD;
		m_PUCH_ODR_CD = i_PUCH_ODR_CD;
		m_ISSUE_INST_CD = i_ISSUE_INST_CD;
		m_RETURNED_WH_CD = i_RETURNED_WH_CD;
		m_WH_NAME = i_WH_NAME;
		m_RETURNED_CAUSE_CD = i_RETURNED_CAUSE_CD;
		m_RETURNED_GNR_TYP = i_RETURNED_GNR_TYP;
		m_AP_PROC_TYP = i_AP_PROC_TYP;
		m_MODIFY_COUNT = i_MODIFY_COUNT;
		m_THIS_MONTH = i_THIS_MONTH;
		m_INSTALL_FLG = i_INSTALL_FLG;
		m_STOCK_UNIT = i_STOCK_UNIT;
		m_UNIT_QTY_TYP = i_UNIT_QTY_TYP;
		m_SPL_ITEM_TYP = i_SPL_ITEM_TYP;
		m_PRODUCT_TYP = i_PRODUCT_TYP;
		m_CLASIFICATION_CD = i_CLASIFICATION_CD;
		m_WH_CD = i_WH_CD;
		m_PROCESSING_COST = i_PROCESSING_COST;
		m_MATERIAL_COST = i_MATERIAL_COST;
		m_OTHER_OVERHEADS = i_OTHER_OVERHEADS;
		m_MRP_FLG = i_MRP_FLG;
		m_VALUE = i_VALUE;
		m_NAME = i_NAME;
		m_EFF_PHASE_IN_DATE = i_EFF_PHASE_IN_DATE;
		m_ONEROUS_FLG = i_ONEROUS_FLG;
		m_STOCK_ON_HAND_QTY = i_STOCK_ON_HAND_QTY;
		m_RCV_ISSUE_TYP = i_RCV_ISSUE_TYP;
		m_ACPT_NO = i_ACPT_NO;
		m_ACPT_RSLT_CRCT_NO = i_ACPT_RSLT_CRCT_NO;
		m_INSPEC_RSLT_CRCT_NO = i_INSPEC_RSLT_CRCT_NO;
		m_PARTIAL_PRD_NO = i_PARTIAL_PRD_NO;
		m_OPR_RSLT_CRCT_NO = i_OPR_RSLT_CRCT_NO;
		m_RCV_ISSUE_BEFORE_QTY = i_RCV_ISSUE_BEFORE_QTY;
		m_RCV_ISSUE_QTY = i_RCV_ISSUE_QTY;
		m_RCV_ISSUE_AFTER_QTY = i_RCV_ISSUE_AFTER_QTY;
		m_RCV_ISSUE_AMOUNT = i_RCV_ISSUE_AMOUNT;
		m_RCV_ISSUE_DATE = i_RCV_ISSUE_DATE;
		m_RCV_ISSUE_GNR_TYP = i_RCV_ISSUE_GNR_TYP;
		m_RCV_ISSUE_ODD_QTY = i_RCV_ISSUE_ODD_QTY;
		m_STOCK_UPD_TYP = i_STOCK_UPD_TYP;
		m_RCV_ISSUE_CMPLT_FLG = i_RCV_ISSUE_CMPLT_FLG;
		m_CONS_TYP = i_CONS_TYP;
	}
		// TODO: ���[�U���p���\�b�h�E�ϐ��́A�����ɋL�q���Ă��������B
        //}}user_implement_code

	//////////////////////////////

}
